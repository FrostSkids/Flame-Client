// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.server.integrated;

import java.util.Iterator;
import net.minecraft.util.Util;
import java.util.concurrent.FutureTask;
import net.minecraft.server.management.ServerConfigurationManager;
import java.net.InetAddress;
import net.minecraft.util.HttpUtil;
import net.minecraft.world.EnumDifficulty;
import java.util.concurrent.Future;
import com.google.common.util.concurrent.Futures;
import net.minecraft.entity.player.EntityPlayerMP;
import com.google.common.collect.Lists;
import java.io.IOException;
import net.minecraft.util.CryptManager;
import net.minecraft.client.ClientBrandRetriever;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import net.minecraft.crash.CrashReport;
import net.minecraft.profiler.PlayerUsageSnooper;
import java.io.File;
import net.minecraft.world.storage.ISaveHandler;
import net.minecraft.world.IWorldAccess;
import net.minecraft.world.WorldManager;
import net.minecraft.world.WorldServerMulti;
import net.minecraft.world.demo.DemoWorldServer;
import net.minecraft.world.storage.WorldInfo;
import net.minecraft.world.WorldServer;
import net.minecraft.world.WorldType;
import org.apache.logging.log4j.LogManager;
import net.minecraft.command.ServerCommandManager;
import org.apache.logging.log4j.Logger;
import net.minecraft.client.multiplayer.ThreadLanServerPing;
import net.minecraft.world.WorldSettings;
import net.minecraft.client.Minecraft;
import net.minecraft.server.MinecraftServer;

public class IntegratedServer extends MinecraftServer
{
    private /* synthetic */ boolean isGamePaused;
    private final /* synthetic */ Minecraft mc;
    private /* synthetic */ boolean isPublic;
    private static final /* synthetic */ String[] lIIIllIIIllIIl;
    private final /* synthetic */ WorldSettings theWorldSettings;
    private static final /* synthetic */ int[] lIIIllIIIllllI;
    private /* synthetic */ ThreadLanServerPing lanServerPing;
    private static final /* synthetic */ Logger logger;
    
    private static boolean llIIIIllIIllIll(final int lllllllllllllIlIIIIIlIlllIllllIl, final int lllllllllllllIlIIIIIlIlllIllllII) {
        return lllllllllllllIlIIIIIlIlllIllllIl < lllllllllllllIlIIIIIlIlllIllllII;
    }
    
    @Override
    protected ServerCommandManager createNewCommandManager() {
        return new IntegratedServerCommandManager();
    }
    
    static {
        llIIIIllIIlIIII();
        llIIIIllIIIllII();
        logger = LogManager.getLogger();
    }
    
    public boolean getPublic() {
        return this.isPublic;
    }
    
    @Override
    protected void loadAllWorlds(final String lllllllllllllIlIIIIIllIIIllIlllI, final String lllllllllllllIlIIIIIllIIIllIllIl, final long lllllllllllllIlIIIIIllIIIllIllII, final WorldType lllllllllllllIlIIIIIllIIIllIlIll, final String lllllllllllllIlIIIIIllIIIllIlIlI) {
        this.convertMapIfNeeded(lllllllllllllIlIIIIIllIIIllIlllI);
        this.worldServers = new WorldServer[IntegratedServer.lIIIllIIIllllI[2]];
        this.timeOfLastDimensionTick = new long[this.worldServers.length][IntegratedServer.lIIIllIIIllllI[3]];
        final ISaveHandler lllllllllllllIlIIIIIllIIIllIlIIl = this.getActiveAnvilConverter().getSaveLoader(lllllllllllllIlIIIIIllIIIllIlllI, (boolean)(IntegratedServer.lIIIllIIIllllI[4] != 0));
        this.setResourcePackFromWorld(this.getFolderName(), lllllllllllllIlIIIIIllIIIllIlIIl);
        WorldInfo lllllllllllllIlIIIIIllIIIllIlIII = lllllllllllllIlIIIIIllIIIllIlIIl.loadWorldInfo();
        if (llIIIIllIIlIIlI(lllllllllllllIlIIIIIllIIIllIlIII)) {
            lllllllllllllIlIIIIIllIIIllIlIII = new WorldInfo(this.theWorldSettings, lllllllllllllIlIIIIIllIIIllIllIl);
            "".length();
            if ((0x9F ^ 0xC2 ^ (0xFE ^ 0xA6)) <= 0) {
                return;
            }
        }
        else {
            lllllllllllllIlIIIIIllIIIllIlIII.setWorldName(lllllllllllllIlIIIIIllIIIllIllIl);
        }
        int lllllllllllllIlIIIIIllIIIllIIlll = IntegratedServer.lIIIllIIIllllI[0];
        "".length();
        if (((0x21 ^ 0x1F) & ~(0x3 ^ 0x3D)) == -" ".length()) {
            return;
        }
        while (!llIIIIllIIlIlIl(lllllllllllllIlIIIIIllIIIllIIlll, this.worldServers.length)) {
            int lllllllllllllIlIIIIIllIIIllIIllI = IntegratedServer.lIIIllIIIllllI[0];
            if (llIIIIllIIlIIll(lllllllllllllIlIIIIIllIIIllIIlll, IntegratedServer.lIIIllIIIllllI[4])) {
                lllllllllllllIlIIIIIllIIIllIIllI = IntegratedServer.lIIIllIIIllllI[5];
            }
            if (llIIIIllIIlIIll(lllllllllllllIlIIIIIllIIIllIIlll, IntegratedServer.lIIIllIIIllllI[6])) {
                lllllllllllllIlIIIIIllIIIllIIllI = IntegratedServer.lIIIllIIIllllI[4];
            }
            if (llIIIIllIIlIlII(lllllllllllllIlIIIIIllIIIllIIlll)) {
                if (llIIIIllIIlIIIl(this.isDemo() ? 1 : 0)) {
                    this.worldServers[lllllllllllllIlIIIIIllIIIllIIlll] = (WorldServer)new DemoWorldServer(this, lllllllllllllIlIIIIIllIIIllIlIIl, lllllllllllllIlIIIIIllIIIllIlIII, lllllllllllllIlIIIIIllIIIllIIllI, this.theProfiler).init();
                    "".length();
                    if (((0x29 ^ 0x1C) & ~(0x31 ^ 0x4)) > 0) {
                        return;
                    }
                }
                else {
                    this.worldServers[lllllllllllllIlIIIIIllIIIllIIlll] = (WorldServer)new WorldServer(this, lllllllllllllIlIIIIIllIIIllIlIIl, lllllllllllllIlIIIIIllIIIllIlIII, lllllllllllllIlIIIIIllIIIllIIllI, this.theProfiler).init();
                }
                this.worldServers[lllllllllllllIlIIIIIllIIIllIIlll].initialize(this.theWorldSettings);
                "".length();
                if ("  ".length() >= "   ".length()) {
                    return;
                }
            }
            else {
                this.worldServers[lllllllllllllIlIIIIIllIIIllIIlll] = (WorldServer)new WorldServerMulti(this, lllllllllllllIlIIIIIllIIIllIlIIl, lllllllllllllIlIIIIIllIIIllIIllI, this.worldServers[IntegratedServer.lIIIllIIIllllI[0]], this.theProfiler).init();
            }
            this.worldServers[lllllllllllllIlIIIIIllIIIllIIlll].addWorldAccess(new WorldManager(this, this.worldServers[lllllllllllllIlIIIIIllIIIllIIlll]));
            ++lllllllllllllIlIIIIIllIIIllIIlll;
        }
        this.getConfigurationManager().setPlayerManager(this.worldServers);
        if (llIIIIllIIlIIlI(this.worldServers[IntegratedServer.lIIIllIIIllllI[0]].getWorldInfo().getDifficulty())) {
            this.setDifficultyForAllWorlds(this.mc.gameSettings.difficulty);
        }
        this.initialWorldChunkLoad();
    }
    
    @Override
    public void setGameType(final WorldSettings.GameType lllllllllllllIlIIIIIlIlllllllllI) {
        this.getConfigurationManager().setGameType(lllllllllllllIlIIIIIlIlllllllllI);
    }
    
    @Override
    public File getDataDirectory() {
        return this.mc.mcDataDir;
    }
    
    private static boolean llIIIIllIIllIII(final int lllllllllllllIlIIIIIlIlllIlIlIll, final int lllllllllllllIlIIIIIlIlllIlIlIlI) {
        return lllllllllllllIlIIIIIlIlllIlIlIll != lllllllllllllIlIIIIIlIlllIlIlIlI;
    }
    
    @Override
    public boolean func_183002_r() {
        return IntegratedServer.lIIIllIIIllllI[4] != 0;
    }
    
    @Override
    public void addServerStatsToSnooper(final PlayerUsageSnooper lllllllllllllIlIIIIIllIIIIIllllI) {
        super.addServerStatsToSnooper(lllllllllllllIlIIIIIllIIIIIllllI);
        lllllllllllllIlIIIIIllIIIIIllllI.addClientStat(IntegratedServer.lIIIllIIIllIIl[IntegratedServer.lIIIllIIIllllI[13]], this.mc.getPlayerUsageSnooper().getUniqueID());
    }
    
    @Override
    public CrashReport addServerInfoToCrashReport(CrashReport lllllllllllllIlIIIIIllIIIIlIlIlI) {
        lllllllllllllIlIIIIIllIIIIlIlIlI = super.addServerInfoToCrashReport(lllllllllllllIlIIIIIllIIIIlIlIlI);
        lllllllllllllIlIIIIIllIIIIlIlIlI.getCategory().addCrashSectionCallable(IntegratedServer.lIIIllIIIllIIl[IntegratedServer.lIIIllIIIllllI[11]], new Callable<String>() {
            private static final /* synthetic */ String[] lllIlllIIllIlI;
            private static final /* synthetic */ int[] lllIlllIIlllIl;
            
            static {
                lIlIIlIllIlIIIII();
                lIlIIlIllIIllIlI();
            }
            
            private static void lIlIIlIllIIllIlI() {
                (lllIlllIIllIlI = new String[IntegratedServer$1.lllIlllIIlllIl[1]])[IntegratedServer$1.lllIlllIIlllIl[0]] = lIlIIlIllIIllIIl("84HGlPn4IrKjm4sAoHDXQghUMCOxXGzS6Yzz8Ra6rGXEk+lHhXO4oA==", "vzfAe");
            }
            
            private static String lIlIIlIllIIllIIl(final String llllllllllllIlIllIIIIlIllIIIIllI, final String llllllllllllIlIllIIIIlIllIIIIlIl) {
                try {
                    final SecretKeySpec llllllllllllIlIllIIIIlIllIIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIIlIllIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher llllllllllllIlIllIIIIlIllIIIllIl = Cipher.getInstance("Blowfish");
                    llllllllllllIlIllIIIIlIllIIIllIl.init(IntegratedServer$1.lllIlllIIlllIl[2], llllllllllllIlIllIIIIlIllIIIlllI);
                    return new String(llllllllllllIlIllIIIIlIllIIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIIlIllIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlIllIIIIlIllIIIlIll) {
                    llllllllllllIlIllIIIIlIllIIIlIll.printStackTrace();
                    return null;
                }
            }
            
            @Override
            public String call() throws Exception {
                return IntegratedServer$1.lllIlllIIllIlI[IntegratedServer$1.lllIlllIIlllIl[0]];
            }
            
            private static void lIlIIlIllIlIIIII() {
                (lllIlllIIlllIl = new int[3])[0] = ((0xC5 ^ 0xB2 ^ (0x6E ^ 0x2E)) & (0x64 ^ 0x46 ^ (0x2B ^ 0x3E) ^ -" ".length()));
                IntegratedServer$1.lllIlllIIlllIl[1] = " ".length();
                IntegratedServer$1.lllIlllIIlllIl[2] = "  ".length();
            }
        });
        lllllllllllllIlIIIIIllIIIIlIlIlI.getCategory().addCrashSectionCallable(IntegratedServer.lIIIllIIIllIIl[IntegratedServer.lIIIllIIIllllI[12]], new Callable<String>() {
            private static final /* synthetic */ String[] lIllIIlllIllIl;
            private static final /* synthetic */ int[] lIllIIlllIlllI;
            
            private static boolean lllllIllIIlIIll(final Object lllllllllllllIIIIIIlIIlIIIIllIIl) {
                return lllllllllllllIIIIIIlIIlIIIIllIIl == null;
            }
            
            private static String lllllIllIIIlllI(String lllllllllllllIIIIIIlIIlIIlIIIIIl, final String lllllllllllllIIIIIIlIIlIIlIIIIII) {
                lllllllllllllIIIIIIlIIlIIlIIIIIl = new String(Base64.getDecoder().decode(lllllllllllllIIIIIIlIIlIIlIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder lllllllllllllIIIIIIlIIlIIlIIIlII = new StringBuilder();
                final char[] lllllllllllllIIIIIIlIIlIIlIIIIll = lllllllllllllIIIIIIlIIlIIlIIIIII.toCharArray();
                int lllllllllllllIIIIIIlIIlIIlIIIIlI = IntegratedServer$2.lIllIIlllIlllI[0];
                final int lllllllllllllIIIIIIlIIlIIIllllII = (Object)lllllllllllllIIIIIIlIIlIIlIIIIIl.toCharArray();
                final long lllllllllllllIIIIIIlIIlIIIlllIll = lllllllllllllIIIIIIlIIlIIIllllII.length;
                boolean lllllllllllllIIIIIIlIIlIIIlllIlI = IntegratedServer$2.lIllIIlllIlllI[0] != 0;
                while (lllllIllIIlIlII(lllllllllllllIIIIIIlIIlIIIlllIlI ? 1 : 0, (int)lllllllllllllIIIIIIlIIlIIIlllIll)) {
                    final char lllllllllllllIIIIIIlIIlIIlIIIlll = lllllllllllllIIIIIIlIIlIIIllllII[lllllllllllllIIIIIIlIIlIIIlllIlI];
                    lllllllllllllIIIIIIlIIlIIlIIIlII.append((char)(lllllllllllllIIIIIIlIIlIIlIIIlll ^ lllllllllllllIIIIIIlIIlIIlIIIIll[lllllllllllllIIIIIIlIIlIIlIIIIlI % lllllllllllllIIIIIIlIIlIIlIIIIll.length]));
                    "".length();
                    ++lllllllllllllIIIIIIlIIlIIlIIIIlI;
                    ++lllllllllllllIIIIIIlIIlIIIlllIlI;
                    "".length();
                    if ((0x97 ^ 0x92) <= 0) {
                        return null;
                    }
                }
                return String.valueOf(lllllllllllllIIIIIIlIIlIIlIIIlII);
            }
            
            private static String lllllIllIIIllll(final String lllllllllllllIIIIIIlIIlIIIlIllll, final String lllllllllllllIIIIIIlIIlIIIllIIII) {
                try {
                    final SecretKeySpec lllllllllllllIIIIIIlIIlIIIllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIlIIlIIIllIIII.getBytes(StandardCharsets.UTF_8)), IntegratedServer$2.lIllIIlllIlllI[8]), "DES");
                    final Cipher lllllllllllllIIIIIIlIIlIIIllIIll = Cipher.getInstance("DES");
                    lllllllllllllIIIIIIlIIlIIIllIIll.init(IntegratedServer$2.lIllIIlllIlllI[2], lllllllllllllIIIIIIlIIlIIIllIlII);
                    return new String(lllllllllllllIIIIIIlIIlIIIllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIlIIlIIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIIIIIlIIlIIIllIIlI) {
                    lllllllllllllIIIIIIlIIlIIIllIIlI.printStackTrace();
                    return null;
                }
            }
            
            private static void lllllIllIIlIIII() {
                (lIllIIlllIllIl = new String[IntegratedServer$2.lIllIIlllIlllI[8]])[IntegratedServer$2.lIllIIlllIlllI[0]] = lllllIllIIIllIl("PbdayPosggs=", "YdnKN");
                IntegratedServer$2.lIllIIlllIllIl[IntegratedServer$2.lIllIIlllIlllI[1]] = lllllIllIIIlllI("MCQqGxwdNSkeC09hDx4bES84UhAGICIWUhcpLRwVESVsBh1UZg==", "tALrr");
                IntegratedServer$2.lIllIIlllIllIl[IntegratedServer$2.lIllIIlllIlllI[2]] = lllllIllIIIllll("GLcuDD2w+iI=", "vXUcD");
                IntegratedServer$2.lIllIIlllIllIl[IntegratedServer$2.lIllIIlllIlllI[3]] = lllllIllIIIllIl("F2BkuoQLKFE=", "RsvIf");
                IntegratedServer$2.lIllIIlllIllIl[IntegratedServer$2.lIllIIlllIlllI[4]] = lllllIllIIIlllI("AjQ/Iz4vJTwmKX1xCi8iMDQrajI0MDcucCU5OCQ3IzV5Pj9mdg==", "FQYJP");
                IntegratedServer$2.lIllIIlllIllIl[IntegratedServer$2.lIllIIlllIlllI[5]] = lllllIllIIIllIl("UCrIK59VDNo=", "BFcbK");
                IntegratedServer$2.lIllIIlllIllIl[IntegratedServer$2.lIllIIlllIlllI[6]] = lllllIllIIIllll("muubDEDkgpsO8FndCO9GP2kC6Rk/myOZDkgh6kABa5sA4AbvMZsp8w==", "HECOi");
                IntegratedServer$2.lIllIIlllIllIl[IntegratedServer$2.lIllIIlllIlllI[7]] = lllllIllIIIllIl("GL3bcPPOFmiv5SB4trJMVW50gTjD0nmkZkhAqQWnaADXXg/hElctRy/CDL5ZFo9EsOkk2yr8BVZjfOrnV07dGHTmI+jXfvIRzKQ8dq88sV8GQx+5Il68ZA==", "cLUBH");
            }
            
            private static String lllllIllIIIllIl(final String lllllllllllllIIIIIIlIIlIIIlIIIlI, final String lllllllllllllIIIIIIlIIlIIIlIIIll) {
                try {
                    final SecretKeySpec lllllllllllllIIIIIIlIIlIIIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIlIIlIIIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher lllllllllllllIIIIIIlIIlIIIlIIllI = Cipher.getInstance("Blowfish");
                    lllllllllllllIIIIIIlIIlIIIlIIllI.init(IntegratedServer$2.lIllIIlllIlllI[2], lllllllllllllIIIIIIlIIlIIIlIIlll);
                    return new String(lllllllllllllIIIIIIlIIlIIIlIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIlIIlIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIIIIIlIIlIIIlIIlIl) {
                    lllllllllllllIIIIIIlIIlIIIlIIlIl.printStackTrace();
                    return null;
                }
            }
            
            @Override
            public String call() throws Exception {
                String lllllllllllllIIIIIIlIIlIIlIlIlIl = ClientBrandRetriever.getClientModName();
                if (lllllIllIIlIIlI(lllllllllllllIIIIIIlIIlIIlIlIlIl.equals(IntegratedServer$2.lIllIIlllIllIl[IntegratedServer$2.lIllIIlllIlllI[0]]) ? 1 : 0)) {
                    return String.valueOf(new StringBuilder(IntegratedServer$2.lIllIIlllIllIl[IntegratedServer$2.lIllIIlllIlllI[1]]).append(lllllllllllllIIIIIIlIIlIIlIlIlIl).append(IntegratedServer$2.lIllIIlllIllIl[IntegratedServer$2.lIllIIlllIlllI[2]]));
                }
                lllllllllllllIIIIIIlIIlIIlIlIlIl = IntegratedServer.this.getServerModName();
                String value;
                if (lllllIllIIlIIlI(lllllllllllllIIIIIIlIIlIIlIlIlIl.equals(IntegratedServer$2.lIllIIlllIllIl[IntegratedServer$2.lIllIIlllIlllI[3]]) ? 1 : 0)) {
                    value = String.valueOf(new StringBuilder(IntegratedServer$2.lIllIIlllIllIl[IntegratedServer$2.lIllIIlllIlllI[4]]).append(lllllllllllllIIIIIIlIIlIIlIlIlIl).append(IntegratedServer$2.lIllIIlllIllIl[IntegratedServer$2.lIllIIlllIlllI[5]]));
                    "".length();
                    if (((0x56 ^ 0x37) & ~(0xCE ^ 0xAF)) != 0x0) {
                        return null;
                    }
                }
                else if (lllllIllIIlIIll(Minecraft.class.getSigners())) {
                    value = IntegratedServer$2.lIllIIlllIllIl[IntegratedServer$2.lIllIIlllIlllI[6]];
                    "".length();
                    if ("  ".length() == 0) {
                        return null;
                    }
                }
                else {
                    value = IntegratedServer$2.lIllIIlllIllIl[IntegratedServer$2.lIllIIlllIlllI[7]];
                }
                return value;
            }
            
            static {
                lllllIllIIlIIIl();
                lllllIllIIlIIII();
            }
            
            private static void lllllIllIIlIIIl() {
                (lIllIIlllIlllI = new int[9])[0] = ((0x8D ^ 0xBF) & ~(0x9 ^ 0x3B));
                IntegratedServer$2.lIllIIlllIlllI[1] = " ".length();
                IntegratedServer$2.lIllIIlllIlllI[2] = "  ".length();
                IntegratedServer$2.lIllIIlllIlllI[3] = "   ".length();
                IntegratedServer$2.lIllIIlllIlllI[4] = (36 + 62 + 42 + 18 ^ 14 + 64 - 18 + 94);
                IntegratedServer$2.lIllIIlllIlllI[5] = (0x71 ^ 0x74);
                IntegratedServer$2.lIllIIlllIlllI[6] = (0x29 ^ 0x2F);
                IntegratedServer$2.lIllIIlllIlllI[7] = (0x71 ^ 0xA ^ (0xBF ^ 0xC3));
                IntegratedServer$2.lIllIIlllIlllI[8] = (0x87 ^ 0x8F);
            }
            
            private static boolean lllllIllIIlIlII(final int lllllllllllllIIIIIIlIIlIIIIlllII, final int lllllllllllllIIIIIIlIIlIIIIllIll) {
                return lllllllllllllIIIIIIlIIlIIIIlllII < lllllllllllllIIIIIIlIIlIIIIllIll;
            }
            
            private static boolean lllllIllIIlIIlI(final int lllllllllllllIIIIIIlIIlIIIIlIlll) {
                return lllllllllllllIIIIIIlIIlIIIIlIlll == 0;
            }
        });
        return lllllllllllllIlIIIIIllIIIIlIlIlI;
    }
    
    private static boolean llIIIIllIIlIIIl(final int lllllllllllllIlIIIIIlIlllIllIIlI) {
        return lllllllllllllIlIIIIIlIlllIllIIlI != 0;
    }
    
    private static String llIIIIllIIIIIlI(final String lllllllllllllIlIIIIIlIllllllIIII, final String lllllllllllllIlIIIIIlIlllllIllll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIlIllllllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIlIlllllIllll.getBytes(StandardCharsets.UTF_8)), IntegratedServer.lIIIllIIIllllI[11]), "DES");
            final Cipher lllllllllllllIlIIIIIlIllllllIlII = Cipher.getInstance("DES");
            lllllllllllllIlIIIIIlIllllllIlII.init(IntegratedServer.lIIIllIIIllllI[6], lllllllllllllIlIIIIIlIllllllIlIl);
            return new String(lllllllllllllIlIIIIIlIllllllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIlIllllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIlIllllllIIll) {
            lllllllllllllIlIIIIIlIllllllIIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean isDedicatedServer() {
        return IntegratedServer.lIIIllIIIllllI[0] != 0;
    }
    
    private static String llIIIIllIIIIlII(String lllllllllllllIlIIIIIlIllllIlllIl, final String lllllllllllllIlIIIIIlIlllllIIIIl) {
        lllllllllllllIlIIIIIlIllllIlllIl = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIIIlIllllIlllIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIIlIlllllIIIII = new StringBuilder();
        final char[] lllllllllllllIlIIIIIlIllllIlllll = lllllllllllllIlIIIIIlIlllllIIIIl.toCharArray();
        int lllllllllllllIlIIIIIlIllllIllllI = IntegratedServer.lIIIllIIIllllI[0];
        final String lllllllllllllIlIIIIIlIllllIllIII = (Object)((String)lllllllllllllIlIIIIIlIllllIlllIl).toCharArray();
        final char lllllllllllllIlIIIIIlIllllIlIlll = (char)lllllllllllllIlIIIIIlIllllIllIII.length;
        long lllllllllllllIlIIIIIlIllllIlIllI = IntegratedServer.lIIIllIIIllllI[0];
        while (llIIIIllIIllIll((int)lllllllllllllIlIIIIIlIllllIlIllI, lllllllllllllIlIIIIIlIllllIlIlll)) {
            final char lllllllllllllIlIIIIIlIlllllIIIll = lllllllllllllIlIIIIIlIllllIllIII[lllllllllllllIlIIIIIlIllllIlIllI];
            lllllllllllllIlIIIIIlIlllllIIIII.append((char)(lllllllllllllIlIIIIIlIlllllIIIll ^ lllllllllllllIlIIIIIlIllllIlllll[lllllllllllllIlIIIIIlIllllIllllI % lllllllllllllIlIIIIIlIllllIlllll.length]));
            "".length();
            ++lllllllllllllIlIIIIIlIllllIllllI;
            ++lllllllllllllIlIIIIIlIllllIlIllI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIIlIlllllIIIII);
    }
    
    private static void llIIIIllIIlIIII() {
        (lIIIllIIIllllI = new int[17])[0] = ("  ".length() & ~"  ".length());
        IntegratedServer.lIIIllIIIllllI[1] = (-(0xFFFFFC8E & 0x67F9) & (0xFFFFF58F & 0x6FF7));
        IntegratedServer.lIIIllIIIllllI[2] = "   ".length();
        IntegratedServer.lIIIllIIIllllI[3] = (0xEC ^ 0x88);
        IntegratedServer.lIIIllIIIllllI[4] = " ".length();
        IntegratedServer.lIIIllIIIllllI[5] = -" ".length();
        IntegratedServer.lIIIllIIIllllI[6] = "  ".length();
        IntegratedServer.lIIIllIIIllllI[7] = (0x38 ^ 0x6D ^ (0xC2 ^ 0x93));
        IntegratedServer.lIIIllIIIllllI[8] = (0x82 ^ 0xA9 ^ (0x47 ^ 0x69));
        IntegratedServer.lIIIllIIIllllI[9] = (0x83 ^ 0x85);
        IntegratedServer.lIIIllIIIllllI[10] = (0x37 ^ 0x30);
        IntegratedServer.lIIIllIIIllllI[11] = (0x37 ^ 0x3F);
        IntegratedServer.lIIIllIIIllllI[12] = (0x4A ^ 0x43);
        IntegratedServer.lIIIllIIIllllI[13] = (0x33 ^ 0x39);
        IntegratedServer.lIIIllIIIllllI[14] = (-(0xFFFFCF23 & 0x34DF) & (0xFFFFEFDE & 0x77FF));
        IntegratedServer.lIIIllIIIllllI[15] = (0x4D ^ 0x46);
        IntegratedServer.lIIIllIIIllllI[16] = (0x32 ^ 0x3E);
    }
    
    public IntegratedServer(final Minecraft lllllllllllllIlIIIIIllIIlIIIIlll) {
        super(lllllllllllllIlIIIIIllIIlIIIIlll.getProxy(), new File(lllllllllllllIlIIIIIllIIlIIIIlll.mcDataDir, IntegratedServer.USER_CACHE_FILE.getName()));
        this.mc = lllllllllllllIlIIIIIllIIlIIIIlll;
        this.theWorldSettings = null;
    }
    
    private static String llIIIIllIIIlIll(final String lllllllllllllIlIIIIIlIllllIIlIll, final String lllllllllllllIlIIIIIlIllllIIllII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIlIllllIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIlIllllIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIIIlIllllIIllll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIIIlIllllIIllll.init(IntegratedServer.lIIIllIIIllllI[6], lllllllllllllIlIIIIIlIllllIlIIII);
            return new String(lllllllllllllIlIIIIIlIllllIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIlIllllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIlIllllIIlllI) {
            lllllllllllllIlIIIIIlIllllIIlllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getOpPermissionLevel() {
        return IntegratedServer.lIIIllIIIllllI[7];
    }
    
    @Override
    protected boolean startServer() throws IOException {
        IntegratedServer.logger.info(IntegratedServer.lIIIllIIIllIIl[IntegratedServer.lIIIllIIIllllI[4]]);
        this.setOnlineMode((boolean)(IntegratedServer.lIIIllIIIllllI[4] != 0));
        this.setCanSpawnAnimals((boolean)(IntegratedServer.lIIIllIIIllllI[4] != 0));
        this.setCanSpawnNPCs((boolean)(IntegratedServer.lIIIllIIIllllI[4] != 0));
        this.setAllowPvp((boolean)(IntegratedServer.lIIIllIIIllllI[4] != 0));
        this.setAllowFlight((boolean)(IntegratedServer.lIIIllIIIllllI[4] != 0));
        IntegratedServer.logger.info(IntegratedServer.lIIIllIIIllIIl[IntegratedServer.lIIIllIIIllllI[6]]);
        this.setKeyPair(CryptManager.generateKeyPair());
        this.loadAllWorlds(this.getFolderName(), this.getWorldName(), this.theWorldSettings.getSeed(), this.theWorldSettings.getTerrainType(), this.theWorldSettings.getWorldName());
        this.setMOTD(String.valueOf(new StringBuilder(String.valueOf(this.getServerOwner())).append(IntegratedServer.lIIIllIIIllIIl[IntegratedServer.lIIIllIIIllllI[2]]).append(this.worldServers[IntegratedServer.lIIIllIIIllllI[0]].getWorldInfo().getWorldName())));
        return IntegratedServer.lIIIllIIIllllI[4] != 0;
    }
    
    @Override
    public void initiateShutdown() {
        Futures.getUnchecked((Future)this.addScheduledTask(new Runnable() {
            private static boolean lIlIIllIIIIllIll(final int llllllllllllIlIlIlllllIllllllIll) {
                return llllllllllllIlIlIlllllIllllllIll == 0;
            }
            
            @Override
            public void run() {
                final int llllllllllllIlIlIlllllIlllllllIl = (int)Lists.newArrayList((Iterable)IntegratedServer.this.getConfigurationManager().func_181057_v()).iterator();
                "".length();
                if (-" ".length() > "  ".length()) {
                    return;
                }
                while (!lIlIIllIIIIllIll(((Iterator)llllllllllllIlIlIlllllIlllllllIl).hasNext() ? 1 : 0)) {
                    final EntityPlayerMP llllllllllllIlIlIllllllIIIIIIIII = ((Iterator<EntityPlayerMP>)llllllllllllIlIlIlllllIlllllllIl).next();
                    IntegratedServer.this.getConfigurationManager().playerLoggedOut(llllllllllllIlIlIllllllIIIIIIIII);
                }
            }
        }));
        "".length();
        super.initiateShutdown();
        if (llIIIIllIIlIlll(this.lanServerPing)) {
            this.lanServerPing.interrupt();
            this.lanServerPing = null;
        }
    }
    
    public void setStaticInstance() {
        this.setInstance();
    }
    
    private static boolean llIIIIllIIlIIll(final int lllllllllllllIlIIIIIlIllllIIIlIl, final int lllllllllllllIlIIIIIlIllllIIIlII) {
        return lllllllllllllIlIIIIIlIllllIIIlIl == lllllllllllllIlIIIIIlIllllIIIlII;
    }
    
    private static boolean llIIIIllIIllIlI(final int lllllllllllllIlIIIIIlIlllIlIlllI) {
        return lllllllllllllIlIIIIIlIlllIlIlllI <= 0;
    }
    
    private static boolean llIIIIllIIlIIlI(final Object lllllllllllllIlIIIIIlIlllIllIlII) {
        return lllllllllllllIlIIIIIlIlllIllIlII == null;
    }
    
    @Override
    public void setDifficultyForAllWorlds(final EnumDifficulty lllllllllllllIlIIIIIllIIIIlIIllI) {
        super.setDifficultyForAllWorlds(lllllllllllllIlIIIIIllIIIIlIIllI);
        if (llIIIIllIIlIlll(this.mc.theWorld)) {
            this.mc.theWorld.getWorldInfo().setDifficulty(lllllllllllllIlIIIIIllIIIIlIIllI);
        }
    }
    
    @Override
    public boolean isCommandBlockEnabled() {
        return IntegratedServer.lIIIllIIIllllI[4] != 0;
    }
    
    @Override
    public String shareToLAN(final WorldSettings.GameType lllllllllllllIlIIIIIllIIIIIlIIIl, final boolean lllllllllllllIlIIIIIllIIIIIlIIII) {
        try {
            int lllllllllllllIlIIIIIllIIIIIlIlII = IntegratedServer.lIIIllIIIllllI[5];
            try {
                lllllllllllllIlIIIIIllIIIIIlIlII = HttpUtil.getSuitableLanPort();
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (IOException ex) {}
            if (llIIIIllIIllIlI(lllllllllllllIlIIIIIllIIIIIlIlII)) {
                lllllllllllllIlIIIIIllIIIIIlIlII = IntegratedServer.lIIIllIIIllllI[14];
            }
            this.getNetworkSystem().addLanEndpoint(null, lllllllllllllIlIIIIIllIIIIIlIlII);
            IntegratedServer.logger.info(String.valueOf(new StringBuilder(IntegratedServer.lIIIllIIIllIIl[IntegratedServer.lIIIllIIIllllI[15]]).append(lllllllllllllIlIIIIIllIIIIIlIlII)));
            this.isPublic = (IntegratedServer.lIIIllIIIllllI[4] != 0);
            this.lanServerPing = new ThreadLanServerPing(this.getMOTD(), String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIIIIIllIIIIIlIlII))));
            this.lanServerPing.start();
            this.getConfigurationManager().setGameType(lllllllllllllIlIIIIIllIIIIIlIIIl);
            this.getConfigurationManager().setCommandsAllowedForAll(lllllllllllllIlIIIIIllIIIIIlIIII);
            return String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIIIIIllIIIIIlIlII)));
        }
        catch (IOException lllllllllllllIlIIIIIllIIIIIlIIll) {
            return null;
        }
    }
    
    @Override
    public boolean isSnooperEnabled() {
        return Minecraft.getMinecraft().isSnooperEnabled();
    }
    
    @Override
    public boolean func_181035_ah() {
        return IntegratedServer.lIIIllIIIllllI[0] != 0;
    }
    
    private static boolean llIIIIllIIllIIl(final Object lllllllllllllIlIIIIIlIlllIlllIIl, final Object lllllllllllllIlIIIIIlIlllIlllIII) {
        return lllllllllllllIlIIIIIlIlllIlllIIl != lllllllllllllIlIIIIIlIlllIlllIII;
    }
    
    @Override
    public EnumDifficulty getDifficulty() {
        return this.mc.theWorld.getWorldInfo().getDifficulty();
    }
    
    @Override
    public void stopServer() {
        super.stopServer();
        if (llIIIIllIIlIlll(this.lanServerPing)) {
            this.lanServerPing.interrupt();
            this.lanServerPing = null;
        }
    }
    
    @Override
    public WorldSettings.GameType getGameType() {
        return this.theWorldSettings.getGameType();
    }
    
    @Override
    public boolean isHardcore() {
        return this.theWorldSettings.getHardcoreEnabled();
    }
    
    private static boolean llIIIIllIIlIlII(final int lllllllllllllIlIIIIIlIlllIllIIII) {
        return lllllllllllllIlIIIIIlIlllIllIIII == 0;
    }
    
    public IntegratedServer(final Minecraft lllllllllllllIlIIIIIllIIIllllIll, final String lllllllllllllIlIIIIIllIIIlllllll, final String lllllllllllllIlIIIIIllIIIllllIIl, final WorldSettings lllllllllllllIlIIIIIllIIIllllIII) {
        super(new File(lllllllllllllIlIIIIIllIIIllllIll.mcDataDir, IntegratedServer.lIIIllIIIllIIl[IntegratedServer.lIIIllIIIllllI[0]]), lllllllllllllIlIIIIIllIIIllllIll.getProxy(), new File(lllllllllllllIlIIIIIllIIIllllIll.mcDataDir, IntegratedServer.USER_CACHE_FILE.getName()));
        this.setServerOwner(lllllllllllllIlIIIIIllIIIllllIll.getSession().getUsername());
        this.setFolderName(lllllllllllllIlIIIIIllIIIlllllll);
        this.setWorldName(lllllllllllllIlIIIIIllIIIllllIIl);
        this.setDemo(lllllllllllllIlIIIIIllIIIllllIll.isDemo());
        this.canCreateBonusChest(lllllllllllllIlIIIIIllIIIllllIII.isBonusChestEnabled());
        this.setBuildLimit(IntegratedServer.lIIIllIIIllllI[1]);
        this.setConfigManager(new IntegratedPlayerList(this));
        this.mc = lllllllllllllIlIIIIIllIIIllllIll;
        WorldSettings demoWorldSettings;
        if (llIIIIllIIlIIIl(this.isDemo() ? 1 : 0)) {
            demoWorldSettings = DemoWorldServer.demoWorldSettings;
            "".length();
            if (null != null) {
                throw null;
            }
        }
        else {
            demoWorldSettings = lllllllllllllIlIIIIIllIIIllllIII;
        }
        this.theWorldSettings = demoWorldSettings;
    }
    
    @Override
    public boolean func_181034_q() {
        return IntegratedServer.lIIIllIIIllllI[4] != 0;
    }
    
    @Override
    protected void finalTick(final CrashReport lllllllllllllIlIIIIIllIIIIllIIlI) {
        this.mc.crashed(lllllllllllllIlIIIIIllIIIIllIIlI);
    }
    
    @Override
    public boolean canStructuresSpawn() {
        return IntegratedServer.lIIIllIIIllllI[0] != 0;
    }
    
    private static boolean llIIIIllIIlIlll(final Object lllllllllllllIlIIIIIlIlllIllIllI) {
        return lllllllllllllIlIIIIIlIlllIllIllI != null;
    }
    
    @Override
    public void tick() {
        final boolean lllllllllllllIlIIIIIllIIIlIlIIlI = this.isGamePaused;
        int isGamePaused;
        if (llIIIIllIIlIlll(Minecraft.getMinecraft().getNetHandler()) && llIIIIllIIlIIIl(Minecraft.getMinecraft().isGamePaused() ? 1 : 0)) {
            isGamePaused = IntegratedServer.lIIIllIIIllllI[4];
            "".length();
            if (((0x4D ^ 0x71 ^ (0x21 ^ 0x1)) & (22 + 151 - 72 + 61 ^ 96 + 83 + 10 + 1 ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            isGamePaused = IntegratedServer.lIIIllIIIllllI[0];
        }
        this.isGamePaused = (isGamePaused != 0);
        if (llIIIIllIIlIlII(lllllllllllllIlIIIIIllIIIlIlIIlI ? 1 : 0) && llIIIIllIIlIIIl(this.isGamePaused ? 1 : 0)) {
            IntegratedServer.logger.info(IntegratedServer.lIIIllIIIllIIl[IntegratedServer.lIIIllIIIllllI[7]]);
            this.getConfigurationManager().saveAllPlayerData();
            this.saveAllWorlds((boolean)(IntegratedServer.lIIIllIIIllllI[0] != 0));
        }
        if (llIIIIllIIlIIIl(this.isGamePaused ? 1 : 0)) {
            synchronized (this.futureTaskQueue) {
                "".length();
                if ((0xAD ^ 0x80 ^ (0x35 ^ 0x1C)) != (118 + 55 - 54 + 25 ^ 66 + 33 - 86 + 135)) {
                    return;
                }
                while (!llIIIIllIIlIIIl(this.futureTaskQueue.isEmpty() ? 1 : 0)) {
                    Util.func_181617_a(this.futureTaskQueue.poll(), IntegratedServer.logger);
                    "".length();
                }
                // monitorexit(this.futureTaskQueue)
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
                return;
            }
        }
        super.tick();
        if (llIIIIllIIllIII(this.mc.gameSettings.renderDistanceChunks, this.getConfigurationManager().getViewDistance())) {
            final Logger logger = IntegratedServer.logger;
            final String s = IntegratedServer.lIIIllIIIllIIl[IntegratedServer.lIIIllIIIllllI[8]];
            final Object[] array = new Object[IntegratedServer.lIIIllIIIllllI[6]];
            array[IntegratedServer.lIIIllIIIllllI[0]] = this.mc.gameSettings.renderDistanceChunks;
            array[IntegratedServer.lIIIllIIIllllI[4]] = this.getConfigurationManager().getViewDistance();
            logger.info(s, array);
            this.getConfigurationManager().setViewDistance(this.mc.gameSettings.renderDistanceChunks);
        }
        if (llIIIIllIIlIlll(this.mc.theWorld)) {
            final WorldInfo lllllllllllllIlIIIIIllIIIlIlIIIl = this.worldServers[IntegratedServer.lIIIllIIIllllI[0]].getWorldInfo();
            final WorldInfo lllllllllllllIlIIIIIllIIIlIlIIII = this.mc.theWorld.getWorldInfo();
            if (llIIIIllIIlIlII(lllllllllllllIlIIIIIllIIIlIlIIIl.isDifficultyLocked() ? 1 : 0) && llIIIIllIIllIIl(lllllllllllllIlIIIIIllIIIlIlIIII.getDifficulty(), lllllllllllllIlIIIIIllIIIlIlIIIl.getDifficulty())) {
                final Logger logger2 = IntegratedServer.logger;
                final String s2 = IntegratedServer.lIIIllIIIllIIl[IntegratedServer.lIIIllIIIllllI[9]];
                final Object[] array2 = new Object[IntegratedServer.lIIIllIIIllllI[6]];
                array2[IntegratedServer.lIIIllIIIllllI[0]] = lllllllllllllIlIIIIIllIIIlIlIIII.getDifficulty();
                array2[IntegratedServer.lIIIllIIIllllI[4]] = lllllllllllllIlIIIIIllIIIlIlIIIl.getDifficulty();
                logger2.info(s2, array2);
                this.setDifficultyForAllWorlds(lllllllllllllIlIIIIIllIIIlIlIIII.getDifficulty());
                "".length();
                if ((0x85 ^ 0xB9 ^ (0x9 ^ 0x30)) <= 0) {
                    return;
                }
            }
            else if (llIIIIllIIlIIIl(lllllllllllllIlIIIIIllIIIlIlIIII.isDifficultyLocked() ? 1 : 0) && llIIIIllIIlIlII(lllllllllllllIlIIIIIllIIIlIlIIIl.isDifficultyLocked() ? 1 : 0)) {
                final Logger logger3 = IntegratedServer.logger;
                final String s3 = IntegratedServer.lIIIllIIIllIIl[IntegratedServer.lIIIllIIIllllI[10]];
                final Object[] array3 = new Object[IntegratedServer.lIIIllIIIllllI[4]];
                array3[IntegratedServer.lIIIllIIIllllI[0]] = lllllllllllllIlIIIIIllIIIlIlIIII.getDifficulty();
                logger3.info(s3, array3);
                final String lllllllllllllIlIIIIIllIIIlIIIlll;
                final int lllllllllllllIlIIIIIllIIIlIIlIII = ((WorldServer[])(Object)(lllllllllllllIlIIIIIllIIIlIIIlll = (String)(Object)this.worldServers)).length;
                float lllllllllllllIlIIIIIllIIIlIIlIIl = IntegratedServer.lIIIllIIIllllI[0];
                "".length();
                if ("   ".length() != "   ".length()) {
                    return;
                }
                while (!llIIIIllIIlIlIl((int)lllllllllllllIlIIIIIllIIIlIIlIIl, lllllllllllllIlIIIIIllIIIlIIlIII)) {
                    final WorldServer lllllllllllllIlIIIIIllIIIlIIllll = lllllllllllllIlIIIIIllIIIlIIIlll[lllllllllllllIlIIIIIllIIIlIIlIIl];
                    if (llIIIIllIIlIlll(lllllllllllllIlIIIIIllIIIlIIllll)) {
                        lllllllllllllIlIIIIIllIIIlIIllll.getWorldInfo().setDifficultyLocked((boolean)(IntegratedServer.lIIIllIIIllllI[4] != 0));
                    }
                    ++lllllllllllllIlIIIIIllIIIlIIlIIl;
                }
            }
        }
    }
    
    private static void llIIIIllIIIllII() {
        (lIIIllIIIllIIl = new String[IntegratedServer.lIIIllIIIllllI[16]])[IntegratedServer.lIIIllIIIllllI[0]] = llIIIIllIIIIIlI("aJtv9g7lJ1I=", "ORhAS");
        IntegratedServer.lIIIllIIIllIIl[IntegratedServer.lIIIllIIIllllI[4]] = llIIIIllIIIIlII("OgcKJxoAHQx1BwcHDjIcCAcOMU4EGgUwDRsSDSFOGhYZIwsbUx0wHBoaBDtOWF1Te1Y=", "iskUn");
        IntegratedServer.lIIIllIIIllIIl[IntegratedServer.lIIIllIIIllllI[6]] = llIIIIllIIIIIlI("UQA4xfgTGz9ckS1vqDeA0/LD5zU9Ri3N", "ovrFY");
        IntegratedServer.lIIIllIIIllIIl[IntegratedServer.lIIIllIIIllllI[2]] = llIIIIllIIIlIll("NO39orPLVdA=", "qOBNx");
        IntegratedServer.lIIIllIIIllIIl[IntegratedServer.lIIIllIIIllllI[7]] = llIIIIllIIIIIlI("s+xdMJl5yD8ch722Jx6cj8otJQOpOihioAfxjDWxkwU=", "BdXBy");
        IntegratedServer.lIIIllIIIllIIl[IntegratedServer.lIIIllIIIllllI[8]] = llIIIIllIIIIlII("NAolNjYeDCN4Jx4HM3g1HhEwOT8UB2QsPlcZOXRxERArNXEMHw==", "wbDXQ");
        IntegratedServer.lIIIllIIIllIIl[IntegratedServer.lIIIllIIIllllI[9]] = llIIIIllIIIIIlI("Jx6RbOSAxgGJvHP0l4HuM8bannFM8hXZOtY9GTxVbHGe9vSwGun3bA==", "SsMZR");
        IntegratedServer.lIIIllIIIllIIl[IntegratedServer.lIIIllIIIllllI[10]] = llIIIIllIIIIIlI("My35e/q8qxgJ6OQdzMJSMLTqzN1Vg+T9ZKSTo+9wTLk=", "LnDGW");
        IntegratedServer.lIIIllIIIllIIl[IntegratedServer.lIIIllIIIllllI[11]] = llIIIIllIIIIIlI("irI163gs1TM=", "hBWmX");
        IntegratedServer.lIIIllIIIllIIl[IntegratedServer.lIIIllIIIllllI[12]] = llIIIIllIIIIlII("DCF6GwYhNj8y", "ERZVi");
        IntegratedServer.lIIIllIIIllIIl[IntegratedServer.lIIIllIIIllllI[13]] = llIIIIllIIIIlII("HgEuBAUIHR4bFB8bLw4H", "moAku");
        IntegratedServer.lIIIllIIIllIIl[IntegratedServer.lIIIllIIIllllI[15]] = llIIIIllIIIlIll("7fgmiN76l6mkPshmgIzp7Q==", "cmIgi");
    }
    
    private static boolean llIIIIllIIlIlIl(final int lllllllllllllIlIIIIIlIllllIIIIIl, final int lllllllllllllIlIIIIIlIllllIIIIII) {
        return lllllllllllllIlIIIIIlIllllIIIIIl >= lllllllllllllIlIIIIIlIllllIIIIII;
    }
}
