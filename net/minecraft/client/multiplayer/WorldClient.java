// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.multiplayer;

import java.util.Iterator;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.SaveDataMemoryStorage;
import com.google.common.collect.Sets;
import net.minecraft.world.storage.ISaveHandler;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.storage.WorldInfo;
import net.minecraft.world.storage.SaveHandlerMP;
import net.minecraft.profiler.Profiler;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.MovingSoundMinecart;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.chunk.Chunk;
import java.util.Collection;
import java.util.concurrent.Callable;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.crash.CrashReport;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.particle.EntityFirework;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.block.Block;
import net.minecraft.world.WorldSettings;
import java.util.Random;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.Minecraft;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.entity.Entity;
import java.util.Set;
import net.minecraft.world.World;

public class WorldClient extends World
{
    private final /* synthetic */ Set<Entity> entityList;
    private final /* synthetic */ Set<ChunkCoordIntPair> previousActiveChunkSet;
    private static final /* synthetic */ int[] lIIlllIlIlIIll;
    private final /* synthetic */ Minecraft mc;
    private final /* synthetic */ Set<Entity> entitySpawnQueue;
    private /* synthetic */ NetHandlerPlayClient sendQueue;
    private /* synthetic */ ChunkProviderClient clientChunkProvider;
    private static final /* synthetic */ String[] lIIlllIlIIllll;
    
    private static boolean llIllIllllllIII(final int lllllllllllllIIlIIlllIlIlIIlIIlI) {
        return lllllllllllllIIlIIlllIlIlIIlIIlI > 0;
    }
    
    @Override
    public Entity getEntityByID(final int lllllllllllllIIlIIlllIlllIlIIlII) {
        Entity entity;
        if (llIllIlllllIIll(lllllllllllllIIlIIlllIlllIlIIlII, this.mc.thePlayer.getEntityId())) {
            entity = this.mc.thePlayer;
            "".length();
            if (((0x38 ^ 0x6F) & ~(0xEF ^ 0xB8)) < 0) {
                return null;
            }
        }
        else {
            entity = super.getEntityByID(lllllllllllllIIlIIlllIlllIlIIlII);
        }
        return entity;
    }
    
    static {
        llIllIllllIlllI();
        llIllIllllIllII();
    }
    
    @Override
    protected void updateWeather() {
    }
    
    private static String llIllIllllIIlIl(final String lllllllllllllIIlIIlllIlIlIllllII, final String lllllllllllllIIlIIlllIlIlIlllIll) {
        try {
            final SecretKeySpec lllllllllllllIIlIIlllIlIllIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlllIlIlIlllIll.getBytes(StandardCharsets.UTF_8)), WorldClient.lIIlllIlIlIIll[2]), "DES");
            final Cipher lllllllllllllIIlIIlllIlIllIIIIII = Cipher.getInstance("DES");
            lllllllllllllIIlIIlllIlIllIIIIII.init(WorldClient.lIIlllIlIlIIll[4], lllllllllllllIIlIIlllIlIllIIIIIl);
            return new String(lllllllllllllIIlIIlllIlIllIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlllIlIlIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIlllIlIlIllllll) {
            lllllllllllllIIlIIlllIlIlIllllll.printStackTrace();
            return null;
        }
    }
    
    private static String llIllIllllIlIIl(final String lllllllllllllIIlIIlllIlIlIlIllll, final String lllllllllllllIIlIIlllIlIlIlIlllI) {
        try {
            final SecretKeySpec lllllllllllllIIlIIlllIlIlIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlllIlIlIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIlllIlIlIllIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIlllIlIlIllIIll.init(WorldClient.lIIlllIlIlIIll[4], lllllllllllllIIlIIlllIlIlIllIlII);
            return new String(lllllllllllllIIlIIlllIlIlIllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlllIlIlIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIlllIlIlIllIIlI) {
            lllllllllllllIIlIIlllIlIlIllIIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void onEntityAdded(final Entity lllllllllllllIIlIIlllIllllIIIIIl) {
        super.onEntityAdded(lllllllllllllIIlIIlllIllllIIIIIl);
        if (llIllIllllIllll(this.entitySpawnQueue.contains(lllllllllllllIIlIIlllIllllIIIIIl) ? 1 : 0)) {
            this.entitySpawnQueue.remove(lllllllllllllIIlIIlllIllllIIIIIl);
            "".length();
        }
    }
    
    public void doVoidFogParticles(final int lllllllllllllIIlIIlllIllIlllIIlI, final int lllllllllllllIIlIIlllIllIllIIIll, final int lllllllllllllIIlIIlllIllIllIIIlI) {
        final int lllllllllllllIIlIIlllIllIllIllll = WorldClient.lIIlllIlIlIIll[8];
        final Random lllllllllllllIIlIIlllIllIllIlllI = new Random();
        final ItemStack lllllllllllllIIlIIlllIllIllIllIl = this.mc.thePlayer.getHeldItem();
        int n;
        if (llIllIlllllIllI(this.mc.playerController.getCurrentGameType(), WorldSettings.GameType.CREATIVE) && llIllIlllllIlIl(lllllllllllllIIlIIlllIllIllIllIl) && llIllIlllllIllI(Block.getBlockFromItem(lllllllllllllIIlIIlllIllIllIllIl.getItem()), Blocks.barrier)) {
            n = WorldClient.lIIlllIlIlIIll[1];
            "".length();
            if (" ".length() <= 0) {
                return;
            }
        }
        else {
            n = WorldClient.lIIlllIlIlIIll[0];
        }
        final boolean lllllllllllllIIlIIlllIllIllIllII = n != 0;
        final BlockPos.MutableBlockPos lllllllllllllIIlIIlllIllIllIlIll = new BlockPos.MutableBlockPos();
        int lllllllllllllIIlIIlllIllIllIlIlI = WorldClient.lIIlllIlIlIIll[0];
        "".length();
        if (-(0x33 ^ 0x61 ^ (0x6D ^ 0x3A)) >= 0) {
            return;
        }
        while (!llIllIlllllIlII(lllllllllllllIIlIIlllIllIllIlIlI, WorldClient.lIIlllIlIlIIll[13])) {
            final int lllllllllllllIIlIIlllIllIllIlIIl = lllllllllllllIIlIIlllIllIlllIIlI + this.rand.nextInt(lllllllllllllIIlIIlllIllIllIllll) - this.rand.nextInt(lllllllllllllIIlIIlllIllIllIllll);
            final int lllllllllllllIIlIIlllIllIllIlIII = lllllllllllllIIlIIlllIllIllIIIll + this.rand.nextInt(lllllllllllllIIlIIlllIllIllIllll) - this.rand.nextInt(lllllllllllllIIlIIlllIllIllIllll);
            final int lllllllllllllIIlIIlllIllIllIIlll = lllllllllllllIIlIIlllIllIllIIIlI + this.rand.nextInt(lllllllllllllIIlIIlllIllIllIllll) - this.rand.nextInt(lllllllllllllIIlIIlllIllIllIllll);
            lllllllllllllIIlIIlllIllIllIlIll.func_181079_c(lllllllllllllIIlIIlllIllIllIlIIl, lllllllllllllIIlIIlllIllIllIlIII, lllllllllllllIIlIIlllIllIllIIlll);
            "".length();
            final IBlockState lllllllllllllIIlIIlllIllIllIIllI = this.getBlockState(lllllllllllllIIlIIlllIllIllIlIll);
            lllllllllllllIIlIIlllIllIllIIllI.getBlock().randomDisplayTick(this, lllllllllllllIIlIIlllIllIllIlIll, lllllllllllllIIlIIlllIllIllIIllI, lllllllllllllIIlIIlllIllIllIlllI);
            if (llIllIllllIllll(lllllllllllllIIlIIlllIllIllIllII ? 1 : 0) && llIllIlllllIllI(lllllllllllllIIlIIlllIllIllIIllI.getBlock(), Blocks.barrier)) {
                this.spawnParticle(EnumParticleTypes.BARRIER, lllllllllllllIIlIIlllIllIllIlIIl + 0.5f, lllllllllllllIIlIIlllIllIllIlIII + 0.5f, lllllllllllllIIlIIlllIllIllIIlll + 0.5f, 0.0, 0.0, 0.0, new int[WorldClient.lIIlllIlIlIIll[0]]);
            }
            ++lllllllllllllIIlIIlllIllIllIlIlI;
        }
    }
    
    private static boolean llIllIlllllIllI(final Object lllllllllllllIIlIIlllIlIlIIllIll, final Object lllllllllllllIIlIIlllIlIlIIllIlI) {
        return lllllllllllllIIlIIlllIlIlIIllIll == lllllllllllllIIlIIlllIlIlIIllIlI;
    }
    
    private static void llIllIllllIllII() {
        (lIIlllIlIIllll = new String[WorldClient.lIIlllIlIlIIll[10]])[WorldClient.lIIlllIlIlIIll[0]] = llIllIllllIIlIl("EMq01yevNDEIEXAUy0Epmw==", "Pvlex");
        WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[1]] = llIllIllllIlIII("BgEJCwMOByoCDiEXLgYf", "bnMjz");
        WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[4]] = llIllIllllIlIIl("/FCxFI0MHXV3TvTYNcfNKG4UTGxXkfk7", "DvKGM");
        WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[6]] = llIllIllllIIlIl("OiyAqiWyDn6XFO3t/fsGIQ==", "QSERk");
        WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[7]] = llIllIllllIlIII("OiYZEjor", "XJvqQ");
        WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[9]] = llIllIllllIIlIl("ZwWXu6jynPrd+cVbnyFTuA==", "hvxsw");
        WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[12]] = llIllIllllIlIII("FTIuHiEtKSA=", "DGGjU");
        WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[14]] = llIllIllllIlIII("JxkRFCkFVgYZOAgCChI/", "avcwL");
        WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[2]] = llIllIllllIlIII("MTw+ITdDPCQnJxcwLyA=", "cYJSN");
        WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[15]] = llIllIllllIlIII("BgEZJDMnRAkgNzsA", "UdkRV");
        WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[5]] = llIllIllllIIlIl("2oJidD+qERXw8Vtv8cW3Pw==", "JhOKb");
        WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[16]] = llIllIllllIlIII("JjgQCBYuPjMBGwEuNwUK", "BWTio");
        WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[17]] = llIllIllllIIlIl("SHwp3CoihWQ=", "ehJgg");
        WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[18]] = llIllIllllIlIIl("W18B3osG5lnZXKAeEA9ZiQ==", "KeSfZ");
        WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[19]] = llIllIllllIlIII("BRgCFQ==", "qjwpr");
    }
    
    @Override
    public void makeFireworks(final double lllllllllllllIIlIIlllIlIlllllllI, final double lllllllllllllIIlIIlllIlIllllIlIl, final double lllllllllllllIIlIIlllIlIllllIlII, final double lllllllllllllIIlIIlllIlIllllIIll, final double lllllllllllllIIlIIlllIlIllllIIlI, final double lllllllllllllIIlIIlllIlIlllllIIl, final NBTTagCompound lllllllllllllIIlIIlllIlIlllllIII) {
        this.mc.effectRenderer.addEffect(new EntityFirework.StarterFX(this, lllllllllllllIIlIIlllIlIlllllllI, lllllllllllllIIlIIlllIlIllllIlIl, lllllllllllllIIlIIlllIlIllllIlII, lllllllllllllIIlIIlllIlIllllIIll, lllllllllllllIIlIIlllIlIllllIIlI, lllllllllllllIIlIIlllIlIlllllIIl, this.mc.effectRenderer, lllllllllllllIIlIIlllIlIlllllIII));
    }
    
    public void addEntityToWorld(final int lllllllllllllIIlIIlllIlllIlIllII, final Entity lllllllllllllIIlIIlllIlllIlIlIll) {
        final Entity lllllllllllllIIlIIlllIlllIlIlllI = this.getEntityByID(lllllllllllllIIlIIlllIlllIlIllII);
        if (llIllIlllllIlIl(lllllllllllllIIlIIlllIlllIlIlllI)) {
            this.removeEntity(lllllllllllllIIlIIlllIlllIlIlllI);
        }
        this.entityList.add(lllllllllllllIIlIIlllIlllIlIlIll);
        "".length();
        lllllllllllllIIlIIlllIlllIlIlIll.setEntityId(lllllllllllllIIlIIlllIlllIlIllII);
        if (llIllIlllllIIII(this.spawnEntityInWorld(lllllllllllllIIlIIlllIlllIlIlIll) ? 1 : 0)) {
            this.entitySpawnQueue.add(lllllllllllllIIlIIlllIlllIlIlIll);
            "".length();
        }
        this.entitiesById.addKey(lllllllllllllIIlIIlllIlllIlIllII, lllllllllllllIIlIIlllIlllIlIlIll);
    }
    
    private static boolean llIllIlllllIlII(final int lllllllllllllIIlIIlllIlIlIlIIlIl, final int lllllllllllllIIlIIlllIlIlIlIIlII) {
        return lllllllllllllIIlIIlllIlIlIlIIlIl >= lllllllllllllIIlIIlllIlIlIlIIlII;
    }
    
    @Override
    public CrashReportCategory addWorldInfoToCrashReport(final CrashReport lllllllllllllIIlIIlllIllIIllllII) {
        final CrashReportCategory lllllllllllllIIlIIlllIllIIlllllI = super.addWorldInfoToCrashReport(lllllllllllllIIlIIlllIllIIllllII);
        lllllllllllllIIlIIlllIllIIlllllI.addCrashSectionCallable(WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[14]], new Callable<String>() {
            private static final /* synthetic */ int[] lIllIllIllllIl;
            private static final /* synthetic */ String[] lIllIllIllllII;
            
            private static void lllllllllllIIIl() {
                (lIllIllIllllII = new String[WorldClient$1.lIllIllIllllIl[1]])[WorldClient$1.lIllIllIllllIl[0]] = lllllllllllIIII("fGuYa6VJCybYlqoCvR9dEw==", "RIPju");
            }
            
            static {
                lllllllllllIIlI();
                lllllllllllIIIl();
            }
            
            private static void lllllllllllIIlI() {
                (lIllIllIllllIl = new int[4])[0] = ((0x7C ^ 0x35) & ~(0xCD ^ 0x84));
                WorldClient$1.lIllIllIllllIl[1] = " ".length();
                WorldClient$1.lIllIllIllllIl[2] = (0xA0 ^ 0xA8);
                WorldClient$1.lIllIllIllllIl[3] = "  ".length();
            }
            
            private static String lllllllllllIIII(final String llllllllllllIllllllIlIlIlIllIIlI, final String llllllllllllIllllllIlIlIlIlIllll) {
                try {
                    final SecretKeySpec llllllllllllIllllllIlIlIlIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIlIlIlIlIllll.getBytes(StandardCharsets.UTF_8)), WorldClient$1.lIllIllIllllIl[2]), "DES");
                    final Cipher llllllllllllIllllllIlIlIlIllIlII = Cipher.getInstance("DES");
                    llllllllllllIllllllIlIlIlIllIlII.init(WorldClient$1.lIllIllIllllIl[3], llllllllllllIllllllIlIlIlIllIlIl);
                    return new String(llllllllllllIllllllIlIlIlIllIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIlIlIlIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIllllllIlIlIlIllIIll) {
                    llllllllllllIllllllIlIlIlIllIIll.printStackTrace();
                    return null;
                }
            }
            
            @Override
            public String call() {
                return String.valueOf(new StringBuilder(String.valueOf(WorldClient.this.entityList.size())).append(WorldClient$1.lIllIllIllllII[WorldClient$1.lIllIllIllllIl[0]]).append(WorldClient.this.entityList.toString()));
            }
        });
        lllllllllllllIIlIIlllIllIIlllllI.addCrashSectionCallable(WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[2]], new Callable<String>() {
            private static final /* synthetic */ int[] llIIllIlIIllIl;
            private static final /* synthetic */ String[] llIIllIlIIllII;
            
            private static String lIIIlllIllIIlllI(String llllllllllllIlllIIIIIIlIlllIllII, final String llllllllllllIlllIIIIIIlIllllIIII) {
                llllllllllllIlllIIIIIIlIlllIllII = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIIIIIIlIlllIllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIlllIIIIIIlIlllIllll = new StringBuilder();
                final char[] llllllllllllIlllIIIIIIlIlllIlllI = llllllllllllIlllIIIIIIlIllllIIII.toCharArray();
                int llllllllllllIlllIIIIIIlIlllIllIl = WorldClient$2.llIIllIlIIllIl[0];
                final long llllllllllllIlllIIIIIIlIlllIIlll = (Object)((String)llllllllllllIlllIIIIIIlIlllIllII).toCharArray();
                final int llllllllllllIlllIIIIIIlIlllIIllI = llllllllllllIlllIIIIIIlIlllIIlll.length;
                float llllllllllllIlllIIIIIIlIlllIIlIl = WorldClient$2.llIIllIlIIllIl[0];
                while (lIIIlllIllIlIIIl((int)llllllllllllIlllIIIIIIlIlllIIlIl, llllllllllllIlllIIIIIIlIlllIIllI)) {
                    final char llllllllllllIlllIIIIIIlIllllIIlI = llllllllllllIlllIIIIIIlIlllIIlll[llllllllllllIlllIIIIIIlIlllIIlIl];
                    llllllllllllIlllIIIIIIlIlllIllll.append((char)(llllllllllllIlllIIIIIIlIllllIIlI ^ llllllllllllIlllIIIIIIlIlllIlllI[llllllllllllIlllIIIIIIlIlllIllIl % llllllllllllIlllIIIIIIlIlllIlllI.length]));
                    "".length();
                    ++llllllllllllIlllIIIIIIlIlllIllIl;
                    ++llllllllllllIlllIIIIIIlIlllIIlIl;
                    "".length();
                    if ((0x37 ^ 0x33) <= -" ".length()) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIlllIIIIIIlIlllIllll);
            }
            
            private static void lIIIlllIllIIllll() {
                (llIIllIlIIllII = new String[WorldClient$2.llIIllIlIIllIl[1]])[WorldClient$2.llIIllIlIIllIl[0]] = lIIIlllIllIIlllI("dR4eDjs5UVE=", "UjqzZ");
            }
            
            private static void lIIIlllIllIlIIII() {
                (llIIllIlIIllIl = new int[2])[0] = ((0x77 ^ 0x38) & ~(0xCE ^ 0x81));
                WorldClient$2.llIIllIlIIllIl[1] = " ".length();
            }
            
            private static boolean lIIIlllIllIlIIIl(final int llllllllllllIlllIIIIIIlIlllIIIIl, final int llllllllllllIlllIIIIIIlIlllIIIII) {
                return llllllllllllIlllIIIIIIlIlllIIIIl < llllllllllllIlllIIIIIIlIlllIIIII;
            }
            
            @Override
            public String call() {
                return String.valueOf(new StringBuilder(String.valueOf(WorldClient.this.entitySpawnQueue.size())).append(WorldClient$2.llIIllIlIIllII[WorldClient$2.llIIllIlIIllIl[0]]).append(WorldClient.this.entitySpawnQueue.toString()));
            }
            
            static {
                lIIIlllIllIlIIII();
                lIIIlllIllIIllll();
            }
        });
        lllllllllllllIIlIIlllIllIIlllllI.addCrashSectionCallable(WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[15]], new Callable<String>() {
            @Override
            public String call() throws Exception {
                return WorldClient.this.mc.thePlayer.getClientBrand();
            }
        });
        lllllllllllllIIlIIlllIllIIlllllI.addCrashSectionCallable(WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[5]], new Callable<String>() {
            private static final /* synthetic */ String[] lIIlIIIIlIIIIl;
            private static final /* synthetic */ int[] lIIlIIIIlIIIlI;
            
            private static void llIIlIIlIllIlII() {
                (lIIlIIIIlIIIlI = new int[3])[0] = ((63 + 82 - 96 + 113 ^ 95 + 2 + 21 + 50) & (0x4A ^ 0x4C ^ (0xA8 ^ 0xA4) ^ -" ".length()));
                WorldClient$4.lIIlIIIIlIIIlI[1] = " ".length();
                WorldClient$4.lIIlIIIIlIIIlI[2] = "  ".length();
            }
            
            private static boolean llIIlIIlIllIlIl(final Object lllllllllllllIIlllIlllIIIIIlIlll) {
                return lllllllllllllIIlllIlllIIIIIlIlll == null;
            }
            
            @Override
            public String call() throws Exception {
                String s;
                if (llIIlIIlIllIlIl(WorldClient.this.mc.getIntegratedServer())) {
                    s = WorldClient$4.lIIlIIIIlIIIIl[WorldClient$4.lIIlIIIIlIIIlI[0]];
                    "".length();
                    if (-"  ".length() > 0) {
                        return null;
                    }
                }
                else {
                    s = WorldClient$4.lIIlIIIIlIIIIl[WorldClient$4.lIIlIIIIlIIIlI[1]];
                }
                return s;
            }
            
            private static String llIIlIIlIllIIIl(final String lllllllllllllIIlllIlllIIIIlIIIlI, final String lllllllllllllIIlllIlllIIIIIlllll) {
                try {
                    final SecretKeySpec lllllllllllllIIlllIlllIIIIlIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIlllIIIIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher lllllllllllllIIlllIlllIIIIlIIlII = Cipher.getInstance("Blowfish");
                    lllllllllllllIIlllIlllIIIIlIIlII.init(WorldClient$4.lIIlIIIIlIIIlI[2], lllllllllllllIIlllIlllIIIIlIIlIl);
                    return new String(lllllllllllllIIlllIlllIIIIlIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIlllIIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIlllIlllIIIIlIIIll) {
                    lllllllllllllIIlllIlllIIIIlIIIll.printStackTrace();
                    return null;
                }
            }
            
            static {
                llIIlIIlIllIlII();
                llIIlIIlIllIIll();
            }
            
            private static void llIIlIIlIllIIll() {
                (lIIlIIIIlIIIIl = new String[WorldClient$4.lIIlIIIIlIIIlI[2]])[WorldClient$4.lIIlIIIIlIIIlI[0]] = llIIlIIlIllIIIl("3ChR940oiN/lPLvtdyXRgxL+Mo32N7djcRtVHSm4/Lt/8KFj7TX1nA==", "wcXin");
                WorldClient$4.lIIlIIIIlIIIIl[WorldClient$4.lIIlIIIIlIIIlI[1]] = llIIlIIlIllIIlI("GyI/LQQgLT8tB3I/IiYEPik7JAIrKTloEDc+PS0R", "RLKHc");
            }
            
            private static boolean llIIlIIlIllIllI(final int lllllllllllllIIlllIlllIIIIIllIlI, final int lllllllllllllIIlllIlllIIIIIllIIl) {
                return lllllllllllllIIlllIlllIIIIIllIlI < lllllllllllllIIlllIlllIIIIIllIIl;
            }
            
            private static String llIIlIIlIllIIlI(String lllllllllllllIIlllIlllIIIIllIIlI, final String lllllllllllllIIlllIlllIIIIllIllI) {
                lllllllllllllIIlllIlllIIIIllIIlI = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlllIlllIIIIllIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder lllllllllllllIIlllIlllIIIIllIlIl = new StringBuilder();
                final char[] lllllllllllllIIlllIlllIIIIllIlII = lllllllllllllIIlllIlllIIIIllIllI.toCharArray();
                int lllllllllllllIIlllIlllIIIIllIIll = WorldClient$4.lIIlIIIIlIIIlI[0];
                final boolean lllllllllllllIIlllIlllIIIIlIllIl = (Object)((String)lllllllllllllIIlllIlllIIIIllIIlI).toCharArray();
                final Exception lllllllllllllIIlllIlllIIIIlIllII = (Exception)lllllllllllllIIlllIlllIIIIlIllIl.length;
                long lllllllllllllIIlllIlllIIIIlIlIll = WorldClient$4.lIIlIIIIlIIIlI[0];
                while (llIIlIIlIllIllI((int)lllllllllllllIIlllIlllIIIIlIlIll, (int)lllllllllllllIIlllIlllIIIIlIllII)) {
                    final char lllllllllllllIIlllIlllIIIIlllIII = lllllllllllllIIlllIlllIIIIlIllIl[lllllllllllllIIlllIlllIIIIlIlIll];
                    lllllllllllllIIlllIlllIIIIllIlIl.append((char)(lllllllllllllIIlllIlllIIIIlllIII ^ lllllllllllllIIlllIlllIIIIllIlII[lllllllllllllIIlllIlllIIIIllIIll % lllllllllllllIIlllIlllIIIIllIlII.length]));
                    "".length();
                    ++lllllllllllllIIlllIlllIIIIllIIll;
                    ++lllllllllllllIIlllIlllIIIIlIlIll;
                    "".length();
                    if (" ".length() != " ".length()) {
                        return null;
                    }
                }
                return String.valueOf(lllllllllllllIIlllIlllIIIIllIlIl);
            }
        });
        return lllllllllllllIIlIIlllIllIIlllllI;
    }
    
    public void invalidateBlockReceiveRegion(final int lllllllllllllIIlIIlllIllllllllII, final int lllllllllllllIIlIIlllIlllllllIll, final int lllllllllllllIIlIIlllIlllllllIlI, final int lllllllllllllIIlIIlllIlllllllIIl, final int lllllllllllllIIlIIlllIlllllllIII, final int lllllllllllllIIlIIlllIllllllIlll) {
    }
    
    private static int llIllIlllllIlll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static String llIllIllllIlIII(String lllllllllllllIIlIIlllIlIllIIlllI, final String lllllllllllllIIlIIlllIlIllIlIIlI) {
        lllllllllllllIIlIIlllIlIllIIlllI = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIlllIlIllIIlllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIlllIlIllIlIIIl = new StringBuilder();
        final char[] lllllllllllllIIlIIlllIlIllIlIIII = lllllllllllllIIlIIlllIlIllIlIIlI.toCharArray();
        int lllllllllllllIIlIIlllIlIllIIllll = WorldClient.lIIlllIlIlIIll[0];
        final double lllllllllllllIIlIIlllIlIllIIlIIl = (Object)((String)lllllllllllllIIlIIlllIlIllIIlllI).toCharArray();
        final int lllllllllllllIIlIIlllIlIllIIlIII = lllllllllllllIIlIIlllIlIllIIlIIl.length;
        byte lllllllllllllIIlIIlllIlIllIIIlll = (byte)WorldClient.lIIlllIlIlIIll[0];
        while (llIllIlllllIIIl(lllllllllllllIIlIIlllIlIllIIIlll, lllllllllllllIIlIIlllIlIllIIlIII)) {
            final char lllllllllllllIIlIIlllIlIllIlIlII = lllllllllllllIIlIIlllIlIllIIlIIl[lllllllllllllIIlIIlllIlIllIIIlll];
            lllllllllllllIIlIIlllIlIllIlIIIl.append((char)(lllllllllllllIIlIIlllIlIllIlIlII ^ lllllllllllllIIlIIlllIlIllIlIIII[lllllllllllllIIlIIlllIlIllIIllll % lllllllllllllIIlIIlllIlIllIlIIII.length]));
            "".length();
            ++lllllllllllllIIlIIlllIlIllIIllll;
            ++lllllllllllllIIlIIlllIlIllIIIlll;
            "".length();
            if (" ".length() < -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIlllIlIllIlIIIl);
    }
    
    private static boolean llIllIlllllIlIl(final Object lllllllllllllIIlIIlllIlIlIIllllI) {
        return lllllllllllllIIlIIlllIlIlIIllllI != null;
    }
    
    private static boolean llIllIlllllIIIl(final int lllllllllllllIIlIIlllIlIlIlIIIIl, final int lllllllllllllIIlIIlllIlIlIlIIIII) {
        return lllllllllllllIIlIIlllIlIlIlIIIIl < lllllllllllllIIlIIlllIlIlIlIIIII;
    }
    
    @Override
    protected void updateBlocks() {
        super.updateBlocks();
        this.previousActiveChunkSet.retainAll(this.activeChunkSet);
        "".length();
        if (llIllIlllllIIll(this.previousActiveChunkSet.size(), this.activeChunkSet.size())) {
            this.previousActiveChunkSet.clear();
        }
        int lllllllllllllIIlIIlllIlllllIlIll = WorldClient.lIIlllIlIlIIll[0];
        final int lllllllllllllIIlIIlllIlllllIIIll = (int)this.activeChunkSet.iterator();
        "".length();
        if (" ".length() <= ((0x83 ^ 0x93) & ~(0x79 ^ 0x69))) {
            return;
        }
        while (!llIllIlllllIIII(((Iterator)lllllllllllllIIlIIlllIlllllIIIll).hasNext() ? 1 : 0)) {
            final ChunkCoordIntPair lllllllllllllIIlIIlllIlllllIlIlI = ((Iterator<ChunkCoordIntPair>)lllllllllllllIIlIIlllIlllllIIIll).next();
            if (llIllIlllllIIII(this.previousActiveChunkSet.contains(lllllllllllllIIlIIlllIlllllIlIlI) ? 1 : 0)) {
                final int lllllllllllllIIlIIlllIlllllIlIIl = lllllllllllllIIlIIlllIlllllIlIlI.chunkXPos * WorldClient.lIIlllIlIlIIll[8];
                final int lllllllllllllIIlIIlllIlllllIlIII = lllllllllllllIIlIIlllIlllllIlIlI.chunkZPos * WorldClient.lIIlllIlIlIIll[8];
                this.theProfiler.startSection(WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[9]]);
                final Chunk lllllllllllllIIlIIlllIlllllIIlll = this.getChunkFromChunkCoords(lllllllllllllIIlIIlllIlllllIlIlI.chunkXPos, lllllllllllllIIlIIlllIlllllIlIlI.chunkZPos);
                this.playMoodSoundAndCheckLight(lllllllllllllIIlIIlllIlllllIlIIl, lllllllllllllIIlIIlllIlllllIlIII, lllllllllllllIIlIIlllIlllllIIlll);
                this.theProfiler.endSection();
                this.previousActiveChunkSet.add(lllllllllllllIIlIIlllIlllllIlIlI);
                "".length();
                if (llIllIlllllIlII(++lllllllllllllIIlIIlllIlllllIlIll, WorldClient.lIIlllIlIlIIll[5])) {
                    return;
                }
                continue;
            }
        }
    }
    
    @Override
    public void setWorldTime(long lllllllllllllIIlIIlllIlIlllIIlII) {
        if (llIllIllllllIlI(llIllIllllllIIl(lllllllllllllIIlIIlllIlIlllIIlII, 0L))) {
            lllllllllllllIIlIIlllIlIlllIIlII = -lllllllllllllIIlIIlllIlIlllIIlII;
            this.getGameRules().setOrCreateGameRule(WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[16]], WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[17]]);
            "".length();
            if ((97 + 137 - 96 + 58 ^ 67 + 102 - 121 + 144) < -" ".length()) {
                return;
            }
        }
        else {
            this.getGameRules().setOrCreateGameRule(WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[18]], WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[19]]);
        }
        super.setWorldTime(lllllllllllllIIlIIlllIlIlllIIlII);
    }
    
    @Override
    public void sendQuittingDisconnectingPacket() {
        this.sendQueue.getNetworkManager().closeChannel(new ChatComponentText(WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[12]]));
    }
    
    private static boolean llIllIllllIllll(final int lllllllllllllIIlIIlllIlIlIIllIII) {
        return lllllllllllllIIlIIlllIlIlIIllIII != 0;
    }
    
    @Override
    public boolean spawnEntityInWorld(final Entity lllllllllllllIIlIIlllIllllIIllII) {
        final boolean lllllllllllllIIlIIlllIllllIIlllI = super.spawnEntityInWorld(lllllllllllllIIlIIlllIllllIIllII);
        this.entityList.add(lllllllllllllIIlIIlllIllllIIllII);
        "".length();
        if (llIllIlllllIIII(lllllllllllllIIlIIlllIllllIIlllI ? 1 : 0)) {
            this.entitySpawnQueue.add(lllllllllllllIIlIIlllIllllIIllII);
            "".length();
            "".length();
            if (null != null) {
                return ((0x40 ^ 0x46 ^ (0xC8 ^ 0xAC)) & (0x6C ^ 0x66 ^ (0x6B ^ 0x3) ^ -" ".length())) != 0x0;
            }
        }
        else if (llIllIllllIllll((lllllllllllllIIlIIlllIllllIIllII instanceof EntityMinecart) ? 1 : 0)) {
            this.mc.getSoundHandler().playSound(new MovingSoundMinecart((EntityMinecart)lllllllllllllIIlIIlllIllllIIllII));
        }
        return lllllllllllllIIlIIlllIllllIIlllI;
    }
    
    public void removeAllEntities() {
        this.loadedEntityList.removeAll(this.unloadedEntityList);
        "".length();
        int lllllllllllllIIlIIlllIllIlIlIIIl = WorldClient.lIIlllIlIlIIll[0];
        "".length();
        if (-" ".length() != -" ".length()) {
            return;
        }
        while (!llIllIlllllIlII(lllllllllllllIIlIIlllIllIlIlIIIl, this.unloadedEntityList.size())) {
            final Entity lllllllllllllIIlIIlllIllIlIlIIII = this.unloadedEntityList.get(lllllllllllllIIlIIlllIllIlIlIIIl);
            final int lllllllllllllIIlIIlllIllIlIIllll = lllllllllllllIIlIIlllIllIlIlIIII.chunkCoordX;
            final int lllllllllllllIIlIIlllIllIlIIlllI = lllllllllllllIIlIIlllIllIlIlIIII.chunkCoordZ;
            if (llIllIllllIllll(lllllllllllllIIlIIlllIllIlIlIIII.addedToChunk ? 1 : 0) && llIllIllllIllll(this.isChunkLoaded(lllllllllllllIIlIIlllIllIlIIllll, lllllllllllllIIlIIlllIllIlIIlllI, (boolean)(WorldClient.lIIlllIlIlIIll[1] != 0)) ? 1 : 0)) {
                this.getChunkFromChunkCoords(lllllllllllllIIlIIlllIllIlIIllll, lllllllllllllIIlIIlllIllIlIIlllI).removeEntity(lllllllllllllIIlIIlllIllIlIlIIII);
            }
            ++lllllllllllllIIlIIlllIllIlIlIIIl;
        }
        int lllllllllllllIIlIIlllIllIlIIllIl = WorldClient.lIIlllIlIlIIll[0];
        "".length();
        if (-" ".length() > (0x37 ^ 0x33)) {
            return;
        }
        while (!llIllIlllllIlII(lllllllllllllIIlIIlllIllIlIIllIl, this.unloadedEntityList.size())) {
            this.onEntityRemoved(this.unloadedEntityList.get(lllllllllllllIIlIIlllIllIlIIllIl));
            ++lllllllllllllIIlIIlllIllIlIIllIl;
        }
        this.unloadedEntityList.clear();
        int lllllllllllllIIlIIlllIllIlIIllII = WorldClient.lIIlllIlIlIIll[0];
        "".length();
        if (((0x49 ^ 0x76) & ~(0x2C ^ 0x13)) > (0x97 ^ 0x93)) {
            return;
        }
        while (!llIllIlllllIlII(lllllllllllllIIlIIlllIllIlIIllII, this.loadedEntityList.size())) {
            final Entity lllllllllllllIIlIIlllIllIlIIlIll = this.loadedEntityList.get(lllllllllllllIIlIIlllIllIlIIllII);
            Label_0458: {
                if (llIllIlllllIlIl(lllllllllllllIIlIIlllIllIlIIlIll.ridingEntity)) {
                    if (llIllIlllllIIII(lllllllllllllIIlIIlllIllIlIIlIll.ridingEntity.isDead ? 1 : 0) && llIllIlllllIllI(lllllllllllllIIlIIlllIllIlIIlIll.ridingEntity.riddenByEntity, lllllllllllllIIlIIlllIllIlIIlIll)) {
                        "".length();
                        if (((58 + 78 + 71 + 14 ^ 60 + 14 + 25 + 30) & (((0x6F ^ 0x45) & ~(0xBB ^ 0x91)) ^ (0xD ^ 0x51) ^ -" ".length())) >= " ".length()) {
                            return;
                        }
                        break Label_0458;
                    }
                    else {
                        lllllllllllllIIlIIlllIllIlIIlIll.ridingEntity.riddenByEntity = null;
                        lllllllllllllIIlIIlllIllIlIIlIll.ridingEntity = null;
                    }
                }
                if (llIllIllllIllll(lllllllllllllIIlIIlllIllIlIIlIll.isDead ? 1 : 0)) {
                    final int lllllllllllllIIlIIlllIllIlIIlIlI = lllllllllllllIIlIIlllIllIlIIlIll.chunkCoordX;
                    final int lllllllllllllIIlIIlllIllIlIIlIIl = lllllllllllllIIlIIlllIllIlIIlIll.chunkCoordZ;
                    if (llIllIllllIllll(lllllllllllllIIlIIlllIllIlIIlIll.addedToChunk ? 1 : 0) && llIllIllllIllll(this.isChunkLoaded(lllllllllllllIIlIIlllIllIlIIlIlI, lllllllllllllIIlIIlllIllIlIIlIIl, (boolean)(WorldClient.lIIlllIlIlIIll[1] != 0)) ? 1 : 0)) {
                        this.getChunkFromChunkCoords(lllllllllllllIIlIIlllIllIlIIlIlI, lllllllllllllIIlIIlllIllIlIIlIIl).removeEntity(lllllllllllllIIlIIlllIllIlIIlIll);
                    }
                    this.loadedEntityList.remove(lllllllllllllIIlIIlllIllIlIIllII--);
                    "".length();
                    this.onEntityRemoved(lllllllllllllIIlIIlllIllIlIIlIll);
                }
            }
            ++lllllllllllllIIlIIlllIllIlIIllII;
        }
    }
    
    public void doPreChunk(final int lllllllllllllIIlIIlllIllllIlIllI, final int lllllllllllllIIlIIlllIllllIllIIl, final boolean lllllllllllllIIlIIlllIllllIllIII) {
        if (llIllIllllIllll(lllllllllllllIIlIIlllIllllIllIII ? 1 : 0)) {
            this.clientChunkProvider.loadChunk(lllllllllllllIIlIIlllIllllIlIllI, lllllllllllllIIlIIlllIllllIllIIl);
            "".length();
            "".length();
            if (" ".length() < ((0x8 ^ 0x4B) & ~(0x81 ^ 0xC2))) {
                return;
            }
        }
        else {
            this.clientChunkProvider.unloadChunk(lllllllllllllIIlIIlllIllllIlIllI, lllllllllllllIIlIIlllIllllIllIIl);
        }
        if (llIllIlllllIIII(lllllllllllllIIlIIlllIllllIllIII ? 1 : 0)) {
            this.markBlockRangeForRenderUpdate(lllllllllllllIIlIIlllIllllIlIllI * WorldClient.lIIlllIlIlIIll[8], WorldClient.lIIlllIlIlIIll[0], lllllllllllllIIlIIlllIllllIllIIl * WorldClient.lIIlllIlIlIIll[8], lllllllllllllIIlIIlllIllllIlIllI * WorldClient.lIIlllIlIlIIll[8] + WorldClient.lIIlllIlIlIIll[10], WorldClient.lIIlllIlIlIIll[11], lllllllllllllIIlIIlllIllllIllIIl * WorldClient.lIIlllIlIlIIll[8] + WorldClient.lIIlllIlIlIIll[10]);
        }
    }
    
    @Override
    protected IChunkProvider createChunkProvider() {
        this.clientChunkProvider = new ChunkProviderClient(this);
        return this.clientChunkProvider;
    }
    
    @Override
    public void removeEntity(final Entity lllllllllllllIIlIIlllIllllIIIlIl) {
        super.removeEntity(lllllllllllllIIlIIlllIllllIIIlIl);
        this.entityList.remove(lllllllllllllIIlIIlllIllllIIIlIl);
        "".length();
    }
    
    public WorldClient(final NetHandlerPlayClient lllllllllllllIIlIIllllIIIIIlIIIl, final WorldSettings lllllllllllllIIlIIllllIIIIIIlIlI, final int lllllllllllllIIlIIllllIIIIIIlIIl, final EnumDifficulty lllllllllllllIIlIIllllIIIIIIlllI, final Profiler lllllllllllllIIlIIllllIIIIIIllIl) {
        super(new SaveHandlerMP(), new WorldInfo(lllllllllllllIIlIIllllIIIIIIlIlI, WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[0]]), WorldProvider.getProviderForDimension(lllllllllllllIIlIIllllIIIIIIlIIl), lllllllllllllIIlIIllllIIIIIIllIl, (boolean)(WorldClient.lIIlllIlIlIIll[1] != 0));
        this.entityList = (Set<Entity>)Sets.newHashSet();
        this.entitySpawnQueue = (Set<Entity>)Sets.newHashSet();
        this.mc = Minecraft.getMinecraft();
        this.previousActiveChunkSet = (Set<ChunkCoordIntPair>)Sets.newHashSet();
        this.sendQueue = lllllllllllllIIlIIllllIIIIIlIIIl;
        this.getWorldInfo().setDifficulty(lllllllllllllIIlIIllllIIIIIIlllI);
        this.setSpawnPoint(new BlockPos(WorldClient.lIIlllIlIlIIll[2], WorldClient.lIIlllIlIlIIll[3], WorldClient.lIIlllIlIlIIll[2]));
        this.provider.registerWorld(this);
        this.chunkProvider = this.createChunkProvider();
        this.mapStorage = new SaveDataMemoryStorage();
        this.calculateInitialSkylight();
        this.calculateInitialWeather();
    }
    
    private static int llIllIllllllIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public void playSound(final double lllllllllllllIIlIIlllIllIIIlllII, final double lllllllllllllIIlIIlllIllIIIlIIII, final double lllllllllllllIIlIIlllIllIIIIllll, final String lllllllllllllIIlIIlllIllIIIllIIl, final float lllllllllllllIIlIIlllIllIIIllIII, final float lllllllllllllIIlIIlllIllIIIlIlll, final boolean lllllllllllllIIlIIlllIllIIIlIllI) {
        final double lllllllllllllIIlIIlllIllIIIlIlIl = this.mc.getRenderViewEntity().getDistanceSq(lllllllllllllIIlIIlllIllIIIlllII, lllllllllllllIIlIIlllIllIIIlIIII, lllllllllllllIIlIIlllIllIIIIllll);
        final PositionedSoundRecord lllllllllllllIIlIIlllIllIIIlIlII = new PositionedSoundRecord(new ResourceLocation(lllllllllllllIIlIIlllIllIIIllIIl), lllllllllllllIIlIIlllIllIIIllIII, lllllllllllllIIlIIlllIllIIIlIlll, (float)lllllllllllllIIlIIlllIllIIIlllII, (float)lllllllllllllIIlIIlllIllIIIlIIII, (float)lllllllllllllIIlIIlllIllIIIIllll);
        if (llIllIllllIllll(lllllllllllllIIlIIlllIllIIIlIllI ? 1 : 0) && llIllIllllllIII(llIllIlllllIlll(lllllllllllllIIlIIlllIllIIIlIlIl, 100.0))) {
            final double lllllllllllllIIlIIlllIllIIIlIIll = Math.sqrt(lllllllllllllIIlIIlllIllIIIlIlIl) / 40.0;
            this.mc.getSoundHandler().playDelayedSound(lllllllllllllIIlIIlllIllIIIlIlII, (int)(lllllllllllllIIlIIlllIllIIIlIIll * 20.0));
            "".length();
            if ((0x4B ^ 0x4E) <= 0) {
                return;
            }
        }
        else {
            this.mc.getSoundHandler().playSound(lllllllllllllIIlIIlllIllIIIlIlII);
        }
    }
    
    @Override
    protected int getRenderDistanceChunks() {
        return this.mc.gameSettings.renderDistanceChunks;
    }
    
    private static boolean llIllIlllllIIII(final int lllllllllllllIIlIIlllIlIlIIlIllI) {
        return lllllllllllllIIlIIlllIlIlIIlIllI == 0;
    }
    
    public boolean invalidateRegionAndSetBlock(final BlockPos lllllllllllllIIlIIlllIlllIIlIIll, final IBlockState lllllllllllllIIlIIlllIlllIIIllII) {
        final int lllllllllllllIIlIIlllIlllIIlIIIl = lllllllllllllIIlIIlllIlllIIlIIll.getX();
        final int lllllllllllllIIlIIlllIlllIIlIIII = lllllllllllllIIlIIlllIlllIIlIIll.getY();
        final int lllllllllllllIIlIIlllIlllIIIllll = lllllllllllllIIlIIlllIlllIIlIIll.getZ();
        this.invalidateBlockReceiveRegion(lllllllllllllIIlIIlllIlllIIlIIIl, lllllllllllllIIlIIlllIlllIIlIIII, lllllllllllllIIlIIlllIlllIIIllll, lllllllllllllIIlIIlllIlllIIlIIIl, lllllllllllllIIlIIlllIlllIIlIIII, lllllllllllllIIlIIlllIlllIIIllll);
        return super.setBlockState(lllllllllllllIIlIIlllIlllIIlIIll, lllllllllllllIIlIIlllIlllIIIllII, WorldClient.lIIlllIlIlIIll[6]);
    }
    
    public void setWorldScoreboard(final Scoreboard lllllllllllllIIlIIlllIlIlllIllII) {
        this.worldScoreboard = lllllllllllllIIlIIlllIlIlllIllII;
    }
    
    private static boolean llIllIlllllIIll(final int lllllllllllllIIlIIlllIlIlIlIlIIl, final int lllllllllllllIIlIIlllIlIlIlIlIII) {
        return lllllllllllllIIlIIlllIlIlIlIlIIl == lllllllllllllIIlIIlllIlIlIlIlIII;
    }
    
    private static void llIllIllllIlllI() {
        (lIIlllIlIlIIll = new int[20])[0] = ((0x6B ^ 0x21 ^ 46 + 82 - 117 + 116) & (0x22 ^ 0x4D ^ (0xFF ^ 0xA5) ^ -" ".length()));
        WorldClient.lIIlllIlIlIIll[1] = " ".length();
        WorldClient.lIIlllIlIlIIll[2] = (0x18 ^ 0x10);
        WorldClient.lIIlllIlIlIIll[3] = (0x6F ^ 0x5D ^ (0xDA ^ 0xA8));
        WorldClient.lIIlllIlIlIIll[4] = "  ".length();
        WorldClient.lIIlllIlIlIIll[5] = (0x64 ^ 0x6E);
        WorldClient.lIIlllIlIlIIll[6] = "   ".length();
        WorldClient.lIIlllIlIlIIll[7] = (0x18 ^ 0x55 ^ (0x33 ^ 0x7A));
        WorldClient.lIIlllIlIlIIll[8] = (0x87 ^ 0x98 ^ (0x29 ^ 0x26));
        WorldClient.lIIlllIlIlIIll[9] = (0x8D ^ 0x88);
        WorldClient.lIIlllIlIlIIll[10] = (0xDF ^ 0x9F ^ (0xE8 ^ 0xA7));
        WorldClient.lIIlllIlIlIIll[11] = (-(0xFFFFFC3F & 0x4BFB) & (0xFFFFEB3A & 0x5DFF));
        WorldClient.lIIlllIlIlIIll[12] = (0x80 ^ 0x86);
        WorldClient.lIIlllIlIlIIll[13] = (0xFFFF97EA & 0x6BFD);
        WorldClient.lIIlllIlIlIIll[14] = (0x94 ^ 0x93);
        WorldClient.lIIlllIlIlIIll[15] = (0xA4 ^ 0xC6 ^ (0x54 ^ 0x3F));
        WorldClient.lIIlllIlIlIIll[16] = (0x29 ^ 0x2D ^ (0xA5 ^ 0xAA));
        WorldClient.lIIlllIlIlIIll[17] = (0x7F ^ 0x41 ^ (0x4C ^ 0x7E));
        WorldClient.lIIlllIlIlIIll[18] = (61 + 83 - 51 + 49 ^ 21 + 97 - 0 + 13);
        WorldClient.lIIlllIlIlIIll[19] = (0x3F ^ 0x31);
    }
    
    private static boolean llIllIllllllIlI(final int lllllllllllllIIlIIlllIlIlIIlIlII) {
        return lllllllllllllIIlIIlllIlIlIIlIlII < 0;
    }
    
    public void playSoundAtPos(final BlockPos lllllllllllllIIlIIlllIllIIlIllIl, final String lllllllllllllIIlIIlllIllIIllIIlI, final float lllllllllllllIIlIIlllIllIIlIlIll, final float lllllllllllllIIlIIlllIllIIlIlIlI, final boolean lllllllllllllIIlIIlllIllIIlIllll) {
        this.playSound(lllllllllllllIIlIIlllIllIIlIllIl.getX() + 0.5, lllllllllllllIIlIIlllIllIIlIllIl.getY() + 0.5, lllllllllllllIIlIIlllIllIIlIllIl.getZ() + 0.5, lllllllllllllIIlIIlllIllIIllIIlI, lllllllllllllIIlIIlllIllIIlIlIll, lllllllllllllIIlIIlllIllIIlIlIlI, lllllllllllllIIlIIlllIllIIlIllll);
    }
    
    public Entity removeEntityFromWorld(final int lllllllllllllIIlIIlllIlllIIlllII) {
        final Entity lllllllllllllIIlIIlllIlllIIllllI = this.entitiesById.removeObject(lllllllllllllIIlIIlllIlllIIlllII);
        if (llIllIlllllIlIl(lllllllllllllIIlIIlllIlllIIllllI)) {
            this.entityList.remove(lllllllllllllIIlIIlllIlllIIllllI);
            "".length();
            this.removeEntity(lllllllllllllIIlIIlllIlllIIllllI);
        }
        return lllllllllllllIIlIIlllIlllIIllllI;
    }
    
    @Override
    public void tick() {
        super.tick();
        this.setTotalWorldTime(this.getTotalWorldTime() + 1L);
        if (llIllIllllIllll(this.getGameRules().getBoolean(WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[1]]) ? 1 : 0)) {
            this.setWorldTime(this.getWorldTime() + 1L);
        }
        this.theProfiler.startSection(WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[4]]);
        int lllllllllllllIIlIIllllIIIIIIIIlI = WorldClient.lIIlllIlIlIIll[0];
        "".length();
        if ("  ".length() != "  ".length()) {
            return;
        }
        while (llIllIlllllIIIl(lllllllllllllIIlIIllllIIIIIIIIlI, WorldClient.lIIlllIlIlIIll[5]) && !llIllIllllIllll(this.entitySpawnQueue.isEmpty() ? 1 : 0)) {
            final Entity lllllllllllllIIlIIllllIIIIIIIIIl = this.entitySpawnQueue.iterator().next();
            this.entitySpawnQueue.remove(lllllllllllllIIlIIllllIIIIIIIIIl);
            "".length();
            if (llIllIlllllIIII(this.loadedEntityList.contains(lllllllllllllIIlIIllllIIIIIIIIIl) ? 1 : 0)) {
                this.spawnEntityInWorld(lllllllllllllIIlIIllllIIIIIIIIIl);
                "".length();
            }
            ++lllllllllllllIIlIIllllIIIIIIIIlI;
        }
        this.theProfiler.endStartSection(WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[6]]);
        this.clientChunkProvider.unloadQueuedChunks();
        "".length();
        this.theProfiler.endStartSection(WorldClient.lIIlllIlIIllll[WorldClient.lIIlllIlIlIIll[7]]);
        this.updateBlocks();
        this.theProfiler.endSection();
    }
    
    @Override
    protected void onEntityRemoved(final Entity lllllllllllllIIlIIlllIlllIllIlll) {
        super.onEntityRemoved(lllllllllllllIIlIIlllIlllIllIlll);
        boolean lllllllllllllIIlIIlllIlllIlllIIl = WorldClient.lIIlllIlIlIIll[0] != 0;
        if (llIllIllllIllll(this.entityList.contains(lllllllllllllIIlIIlllIlllIllIlll) ? 1 : 0)) {
            if (llIllIllllIllll(lllllllllllllIIlIIlllIlllIllIlll.isEntityAlive() ? 1 : 0)) {
                this.entitySpawnQueue.add(lllllllllllllIIlIIlllIlllIllIlll);
                "".length();
                lllllllllllllIIlIIlllIlllIlllIIl = (WorldClient.lIIlllIlIlIIll[1] != 0);
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
            }
            else {
                this.entityList.remove(lllllllllllllIIlIIlllIlllIllIlll);
                "".length();
            }
        }
    }
}
