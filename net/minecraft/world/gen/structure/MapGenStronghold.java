// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.structure;

import java.util.Iterator;
import net.minecraft.world.World;
import com.google.common.collect.Lists;
import net.minecraft.util.MathHelper;
import java.util.Map;
import java.util.Arrays;
import net.minecraft.util.BlockPos;
import java.util.Random;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.world.biome.BiomeGenBase;
import java.util.List;

public class MapGenStronghold extends MapGenStructure
{
    private /* synthetic */ int field_82672_i;
    private static final /* synthetic */ String[] llIlllIlIlllIl;
    private /* synthetic */ boolean ranBiomeCheck;
    private /* synthetic */ List<BiomeGenBase> field_151546_e;
    private static final /* synthetic */ int[] llIlllIlIllllI;
    private /* synthetic */ ChunkCoordIntPair[] structureCoords;
    private /* synthetic */ double field_82671_h;
    
    private static void lIIllIIlllllIlIl() {
        (llIlllIlIlllIl = new String[MapGenStronghold.llIlllIlIllllI[4]])[MapGenStronghold.llIlllIlIllllI[1]] = lIIllIIlllllIIlI("Fh0nJBscFzE=", "rtTPz");
        MapGenStronghold.llIlllIlIlllIl[MapGenStronghold.llIlllIlIllllI[2]] = lIIllIIlllllIIll("L4dJ6ZDOskU=", "UVMRH");
        MapGenStronghold.llIlllIlIlllIl[MapGenStronghold.llIlllIlIllllI[3]] = lIIllIIlllllIlII("kvjKqoak5Kc=", "hdwlA");
        MapGenStronghold.llIlllIlIlllIl[MapGenStronghold.llIlllIlIllllI[0]] = lIIllIIlllllIIll("Wg1CVKhFL8JxfYqW63D7Xg==", "eirUq");
    }
    
    private static boolean lIIllIIllllllllI(final int llllllllllllIllIIlIIIlIlIIlIlllI, final int llllllllllllIllIIlIIIlIlIIlIllIl) {
        return llllllllllllIllIIlIIIlIlIIlIlllI < llllllllllllIllIIlIIIlIlIIlIllIl;
    }
    
    private static boolean lIIllIIllllllIlI(final int llllllllllllIllIIlIIIlIlIIllIIlI, final int llllllllllllIllIIlIIIlIlIIllIIIl) {
        return llllllllllllIllIIlIIIlIlIIllIIlI >= llllllllllllIllIIlIIIlIlIIllIIIl;
    }
    
    private static boolean lIIllIIllllllIIl(final int llllllllllllIllIIlIIIlIlIIlIIlIl) {
        return llllllllllllIllIIlIIIlIlIIlIIlIl > 0;
    }
    
    private static boolean lIIllIIllllllIll(final int llllllllllllIllIIlIIIlIlIIlIlIIl) {
        return llllllllllllIllIIlIIIlIlIIlIlIIl != 0;
    }
    
    @Override
    protected StructureStart getStructureStart(final int llllllllllllIllIIlIIIlIlIllIllIl, final int llllllllllllIllIIlIIIlIlIllIllII) {
        Start llllllllllllIllIIlIIIlIlIllIllll = new Start(this.worldObj, this.rand, llllllllllllIllIIlIIIlIlIllIllIl, llllllllllllIllIIlIIIlIlIllIllII);
        "".length();
        if (-(0x49 ^ 0x4D) > 0) {
            return null;
        }
        while (!lIIllIIlllllllII(llllllllllllIllIIlIIIlIlIllIllll.getComponents().isEmpty() ? 1 : 0) || !lIIllIIllllllIII(llllllllllllIllIIlIIIlIlIllIllll.getComponents().get(MapGenStronghold.llIlllIlIllllI[1]).strongholdPortalRoom)) {
            llllllllllllIllIIlIIIlIlIllIllll = new Start(this.worldObj, this.rand, llllllllllllIllIIlIIIlIlIllIllIl, llllllllllllIllIIlIIIlIlIllIllII);
        }
        return llllllllllllIllIIlIIIlIlIllIllll;
    }
    
    private static String lIIllIIlllllIIll(final String llllllllllllIllIIlIIIlIlIllIIIll, final String llllllllllllIllIIlIIIlIlIllIIIlI) {
        try {
            final SecretKeySpec llllllllllllIllIIlIIIlIlIllIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIIlIlIllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlIIIlIlIllIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlIIIlIlIllIIlIl.init(MapGenStronghold.llIlllIlIllllI[3], llllllllllllIllIIlIIIlIlIllIIllI);
            return new String(llllllllllllIllIIlIIIlIlIllIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIIlIlIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIIIlIlIllIIlII) {
            llllllllllllIllIIlIIIlIlIllIIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllIIlllllllIl(final int llllllllllllIllIIlIIIlIlIIllIllI, final int llllllllllllIllIIlIIIlIlIIllIlIl) {
        return llllllllllllIllIIlIIIlIlIIllIllI == llllllllllllIllIIlIIIlIlIIllIlIl;
    }
    
    @Override
    protected boolean canSpawnStructureAtCoords(final int llllllllllllIllIIlIIIlIllIIlllII, final int llllllllllllIllIIlIIIlIllIIllIll) {
        if (lIIllIIlllllllII(this.ranBiomeCheck ? 1 : 0)) {
            final Random llllllllllllIllIIlIIIlIllIIllIlI = new Random();
            llllllllllllIllIIlIIIlIllIIllIlI.setSeed(this.worldObj.getSeed());
            double llllllllllllIllIIlIIIlIllIIllIIl = llllllllllllIllIIlIIIlIllIIllIlI.nextDouble() * 3.141592653589793 * 2.0;
            int llllllllllllIllIIlIIIlIllIIllIII = MapGenStronghold.llIlllIlIllllI[2];
            int llllllllllllIllIIlIIIlIllIIlIlll = MapGenStronghold.llIlllIlIllllI[1];
            "".length();
            if (" ".length() > " ".length()) {
                return ((0x0 ^ 0x50 ^ (0x59 ^ 0x23)) & (0x55 ^ 0x4D ^ (0x98 ^ 0xAA) ^ -" ".length())) != 0x0;
            }
            while (!lIIllIIllllllIlI(llllllllllllIllIIlIIIlIllIIlIlll, this.structureCoords.length)) {
                final double llllllllllllIllIIlIIIlIllIIlIllI = (1.25 * llllllllllllIllIIlIIIlIllIIllIII + llllllllllllIllIIlIIIlIllIIllIlI.nextDouble()) * this.field_82671_h * llllllllllllIllIIlIIIlIllIIllIII;
                int llllllllllllIllIIlIIIlIllIIlIlIl = (int)Math.round(Math.cos(llllllllllllIllIIlIIIlIllIIllIIl) * llllllllllllIllIIlIIIlIllIIlIllI);
                int llllllllllllIllIIlIIIlIllIIlIlII = (int)Math.round(Math.sin(llllllllllllIllIIlIIIlIllIIllIIl) * llllllllllllIllIIlIIIlIllIIlIllI);
                final BlockPos llllllllllllIllIIlIIIlIllIIlIIll = this.worldObj.getWorldChunkManager().findBiomePosition((llllllllllllIllIIlIIIlIllIIlIlIl << MapGenStronghold.llIlllIlIllllI[4]) + MapGenStronghold.llIlllIlIllllI[5], (llllllllllllIllIIlIIIlIllIIlIlII << MapGenStronghold.llIlllIlIllllI[4]) + MapGenStronghold.llIlllIlIllllI[5], MapGenStronghold.llIlllIlIllllI[6], this.field_151546_e, llllllllllllIllIIlIIIlIllIIllIlI);
                if (lIIllIIllllllIII(llllllllllllIllIIlIIIlIllIIlIIll)) {
                    llllllllllllIllIIlIIIlIllIIlIlIl = llllllllllllIllIIlIIIlIllIIlIIll.getX() >> MapGenStronghold.llIlllIlIllllI[4];
                    llllllllllllIllIIlIIIlIllIIlIlII = llllllllllllIllIIlIIIlIllIIlIIll.getZ() >> MapGenStronghold.llIlllIlIllllI[4];
                }
                this.structureCoords[llllllllllllIllIIlIIIlIllIIlIlll] = new ChunkCoordIntPair(llllllllllllIllIIlIIIlIllIIlIlIl, llllllllllllIllIIlIIIlIllIIlIlII);
                llllllllllllIllIIlIIIlIllIIllIIl += 6.283185307179586 * llllllllllllIllIIlIIIlIllIIllIII / this.field_82672_i;
                if (lIIllIIlllllllIl(llllllllllllIllIIlIIIlIllIIlIlll, this.field_82672_i)) {
                    llllllllllllIllIIlIIIlIllIIllIII += MapGenStronghold.llIlllIlIllllI[3] + llllllllllllIllIIlIIIlIllIIllIlI.nextInt(MapGenStronghold.llIlllIlIllllI[7]);
                    this.field_82672_i += MapGenStronghold.llIlllIlIllllI[2] + llllllllllllIllIIlIIIlIllIIllIlI.nextInt(MapGenStronghold.llIlllIlIllllI[3]);
                }
                ++llllllllllllIllIIlIIIlIllIIlIlll;
            }
            this.ranBiomeCheck = (MapGenStronghold.llIlllIlIllllI[2] != 0);
        }
        final String llllllllllllIllIIlIIIlIllIIIlIll;
        final int llllllllllllIllIIlIIIlIllIIIllII = ((ChunkCoordIntPair[])(Object)(llllllllllllIllIIlIIIlIllIIIlIll = (String)(Object)this.structureCoords)).length;
        int llllllllllllIllIIlIIIlIlIIllIIlI = MapGenStronghold.llIlllIlIllllI[1];
        "".length();
        if ("  ".length() == (0x21 ^ 0x25)) {
            return ((0x4E ^ 0x74) & ~(0x94 ^ 0xAE)) != 0x0;
        }
        while (!lIIllIIllllllIlI(llllllllllllIllIIlIIIlIlIIllIIlI, llllllllllllIllIIlIIIlIllIIIllII)) {
            final ChunkCoordIntPair llllllllllllIllIIlIIIlIllIIlIIlI = llllllllllllIllIIlIIIlIllIIIlIll[llllllllllllIllIIlIIIlIlIIllIIlI];
            if (lIIllIIlllllllIl(llllllllllllIllIIlIIIlIllIIlllII, llllllllllllIllIIlIIIlIllIIlIIlI.chunkXPos) && lIIllIIlllllllIl(llllllllllllIllIIlIIIlIllIIllIll, llllllllllllIllIIlIIIlIllIIlIIlI.chunkZPos)) {
                return MapGenStronghold.llIlllIlIllllI[2] != 0;
            }
            ++llllllllllllIllIIlIIIlIlIIllIIlI;
        }
        return MapGenStronghold.llIlllIlIllllI[1] != 0;
    }
    
    @Override
    public String getStructureName() {
        return MapGenStronghold.llIlllIlIlllIl[MapGenStronghold.llIlllIlIllllI[0]];
    }
    
    private static String lIIllIIlllllIlII(final String llllllllllllIllIIlIIIlIlIlIlIlII, final String llllllllllllIllIIlIIIlIlIlIlIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIIlIIIlIlIlIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIIlIlIlIlIlIl.getBytes(StandardCharsets.UTF_8)), MapGenStronghold.llIlllIlIllllI[5]), "DES");
            final Cipher llllllllllllIllIIlIIIlIlIlIllIII = Cipher.getInstance("DES");
            llllllllllllIllIIlIIIlIlIlIllIII.init(MapGenStronghold.llIlllIlIllllI[3], llllllllllllIllIIlIIIlIlIlIllIIl);
            return new String(llllllllllllIllIIlIIIlIlIlIllIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIIlIlIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIIIlIlIlIlIlll) {
            llllllllllllIllIIlIIIlIlIlIlIlll.printStackTrace();
            return null;
        }
    }
    
    private static int lIIllIIlllllIlll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public MapGenStronghold(final Map<String, String> llllllllllllIllIIlIIIlIllIllIIII) {
        this();
        final float llllllllllllIllIIlIIIlIllIlIlIll = (float)llllllllllllIllIIlIIIlIllIllIIII.entrySet().iterator();
        "".length();
        if (-" ".length() >= " ".length()) {
            throw null;
        }
        while (!lIIllIIlllllllII(((Iterator)llllllllllllIllIIlIIIlIllIlIlIll).hasNext() ? 1 : 0)) {
            final Map.Entry<String, String> llllllllllllIllIIlIIIlIllIlIllll = ((Iterator<Map.Entry<String, String>>)llllllllllllIllIIlIIIlIllIlIlIll).next();
            if (lIIllIIllllllIll(llllllllllllIllIIlIIIlIllIlIllll.getKey().equals(MapGenStronghold.llIlllIlIlllIl[MapGenStronghold.llIlllIlIllllI[1]]) ? 1 : 0)) {
                this.field_82671_h = MathHelper.parseDoubleWithDefaultAndMax(llllllllllllIllIIlIIIlIllIlIllll.getValue(), this.field_82671_h, 1.0);
                "".length();
                if (((0x4 ^ 0x2F) & ~(0x41 ^ 0x6A)) < ((0xF6 ^ 0xA4) & ~(0x24 ^ 0x76))) {
                    throw null;
                }
                continue;
            }
            else if (lIIllIIllllllIll(llllllllllllIllIIlIIIlIllIlIllll.getKey().equals(MapGenStronghold.llIlllIlIlllIl[MapGenStronghold.llIlllIlIllllI[2]]) ? 1 : 0)) {
                this.structureCoords = new ChunkCoordIntPair[MathHelper.parseIntWithDefaultAndMax(llllllllllllIllIIlIIIlIllIlIllll.getValue(), this.structureCoords.length, MapGenStronghold.llIlllIlIllllI[2])];
                "".length();
                if (" ".length() < 0) {
                    throw null;
                }
                continue;
            }
            else {
                if (!lIIllIIllllllIll(llllllllllllIllIIlIIIlIllIlIllll.getKey().equals(MapGenStronghold.llIlllIlIlllIl[MapGenStronghold.llIlllIlIllllI[3]]) ? 1 : 0)) {
                    continue;
                }
                this.field_82672_i = MathHelper.parseIntWithDefaultAndMax(llllllllllllIllIIlIIIlIllIlIllll.getValue(), this.field_82672_i, MapGenStronghold.llIlllIlIllllI[2]);
            }
        }
    }
    
    private static String lIIllIIlllllIIlI(String llllllllllllIllIIlIIIlIlIlIIIllI, final String llllllllllllIllIIlIIIlIlIlIIIIII) {
        llllllllllllIllIIlIIIlIlIlIIIllI = new String(Base64.getDecoder().decode(llllllllllllIllIIlIIIlIlIlIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIlIIIlIlIlIIIlII = new StringBuilder();
        final char[] llllllllllllIllIIlIIIlIlIlIIIIll = llllllllllllIllIIlIIIlIlIlIIIIII.toCharArray();
        int llllllllllllIllIIlIIIlIlIlIIIIlI = MapGenStronghold.llIlllIlIllllI[1];
        final int llllllllllllIllIIlIIIlIlIIllllII = (Object)llllllllllllIllIIlIIIlIlIlIIIllI.toCharArray();
        final String llllllllllllIllIIlIIIlIlIIlllIll = (String)llllllllllllIllIIlIIIlIlIIllllII.length;
        int llllllllllllIllIIlIIIlIlIIlllIlI = MapGenStronghold.llIlllIlIllllI[1];
        while (lIIllIIllllllllI(llllllllllllIllIIlIIIlIlIIlllIlI, (int)llllllllllllIllIIlIIIlIlIIlllIll)) {
            final char llllllllllllIllIIlIIIlIlIlIIIlll = llllllllllllIllIIlIIIlIlIIllllII[llllllllllllIllIIlIIIlIlIIlllIlI];
            llllllllllllIllIIlIIIlIlIlIIIlII.append((char)(llllllllllllIllIIlIIIlIlIlIIIlll ^ llllllllllllIllIIlIIIlIlIlIIIIll[llllllllllllIllIIlIIIlIlIlIIIIlI % llllllllllllIllIIlIIIlIlIlIIIIll.length]));
            "".length();
            ++llllllllllllIllIIlIIIlIlIlIIIIlI;
            ++llllllllllllIllIIlIIIlIlIIlllIlI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIlIIIlIlIlIIIlII);
    }
    
    private static boolean lIIllIIllllllIII(final Object llllllllllllIllIIlIIIlIlIIlIlIll) {
        return llllllllllllIllIIlIIIlIlIIlIlIll != null;
    }
    
    static {
        lIIllIIlllllIllI();
        lIIllIIlllllIlIl();
    }
    
    @Override
    protected List<BlockPos> getCoordList() {
        final List<BlockPos> llllllllllllIllIIlIIIlIlIllllllI = (List<BlockPos>)Lists.newArrayList();
        final boolean llllllllllllIllIIlIIIlIlIlllIlll;
        final String llllllllllllIllIIlIIIlIlIllllIII = (String)((ChunkCoordIntPair[])(Object)(llllllllllllIllIIlIIIlIlIlllIlll = (boolean)(Object)this.structureCoords)).length;
        long llllllllllllIllIIlIIIlIlIllllIIl = MapGenStronghold.llIlllIlIllllI[1];
        "".length();
        if ("  ".length() == ((0x1B ^ 0x44) & ~(0x9B ^ 0xC4))) {
            return null;
        }
        while (!lIIllIIllllllIlI((int)llllllllllllIllIIlIIIlIlIllllIIl, (int)llllllllllllIllIIlIIIlIlIllllIII)) {
            final ChunkCoordIntPair llllllllllllIllIIlIIIlIlIlllllIl = llllllllllllIllIIlIIIlIlIlllIlll[llllllllllllIllIIlIIIlIlIllllIIl];
            if (lIIllIIllllllIII(llllllllllllIllIIlIIIlIlIlllllIl)) {
                llllllllllllIllIIlIIIlIlIllllllI.add(llllllllllllIllIIlIIIlIlIlllllIl.getCenterBlock(MapGenStronghold.llIlllIlIllllI[8]));
                "".length();
            }
            ++llllllllllllIllIIlIIIlIlIllllIIl;
        }
        return llllllllllllIllIIlIIIlIlIllllllI;
    }
    
    private static boolean lIIllIIlllllllII(final int llllllllllllIllIIlIIIlIlIIlIIlll) {
        return llllllllllllIllIIlIIIlIlIIlIIlll == 0;
    }
    
    private static void lIIllIIlllllIllI() {
        (llIlllIlIllllI = new int[9])[0] = "   ".length();
        MapGenStronghold.llIlllIlIllllI[1] = ((0x36 ^ 0x56 ^ (0x2B ^ 0x72)) & (0x65 ^ 0x34 ^ (0x9 ^ 0x61) ^ -" ".length()));
        MapGenStronghold.llIlllIlIllllI[2] = " ".length();
        MapGenStronghold.llIlllIlIllllI[3] = "  ".length();
        MapGenStronghold.llIlllIlIllllI[4] = (0xC ^ 0x8);
        MapGenStronghold.llIlllIlIllllI[5] = (0x2A ^ 0x22);
        MapGenStronghold.llIlllIlIllllI[6] = (0x56 ^ 0x26);
        MapGenStronghold.llIlllIlIllllI[7] = (0xC5 ^ 0x86 ^ (0x60 ^ 0x26));
        MapGenStronghold.llIlllIlIllllI[8] = (0xC8 ^ 0xB3 ^ (0x2D ^ 0x16));
    }
    
    public MapGenStronghold() {
        this.structureCoords = new ChunkCoordIntPair[MapGenStronghold.llIlllIlIllllI[0]];
        this.field_82671_h = 32.0;
        this.field_82672_i = MapGenStronghold.llIlllIlIllllI[0];
        this.field_151546_e = (List<BiomeGenBase>)Lists.newArrayList();
        final float llllllllllllIllIIlIIIlIllIllIllI;
        final int llllllllllllIllIIlIIIlIllIllIlll = ((BiomeGenBase[])(Object)(llllllllllllIllIIlIIIlIllIllIllI = (float)(Object)BiomeGenBase.getBiomeGenArray())).length;
        boolean llllllllllllIllIIlIIIlIllIlllIII = MapGenStronghold.llIlllIlIllllI[1] != 0;
        "".length();
        if (null != null) {
            throw null;
        }
        while (!lIIllIIllllllIlI(llllllllllllIllIIlIIIlIllIlllIII ? 1 : 0, llllllllllllIllIIlIIIlIllIllIlll)) {
            final BiomeGenBase llllllllllllIllIIlIIIlIllIlllIll = llllllllllllIllIIlIIIlIllIllIllI[llllllllllllIllIIlIIIlIllIlllIII];
            if (lIIllIIllllllIII(llllllllllllIllIIlIIIlIllIlllIll) && lIIllIIllllllIIl(lIIllIIlllllIlll(llllllllllllIllIIlIIIlIllIlllIll.minHeight, 0.0f))) {
                this.field_151546_e.add(llllllllllllIllIIlIIIlIllIlllIll);
                "".length();
            }
            ++llllllllllllIllIIlIIIlIllIlllIII;
        }
    }
    
    public static class Start extends StructureStart
    {
        private static final /* synthetic */ int[] llIIlIlIllIIll;
        
        public Start() {
        }
        
        static {
            lIIIllIlIlIIIlII();
        }
        
        public Start(final World llllllllllllIlllIIIllIIlIlIIIlII, final Random llllllllllllIlllIIIllIIlIlIIIIll, final int llllllllllllIlllIIIllIIlIIlllIIl, final int llllllllllllIlllIIIllIIlIlIIIIIl) {
            super(llllllllllllIlllIIIllIIlIIlllIIl, llllllllllllIlllIIIllIIlIlIIIIIl);
            StructureStrongholdPieces.prepareStructurePieces();
            final StructureStrongholdPieces.Stairs2 llllllllllllIlllIIIllIIlIlIIIIII = new StructureStrongholdPieces.Stairs2(Start.llIIlIlIllIIll[0], llllllllllllIlllIIIllIIlIlIIIIll, (llllllllllllIlllIIIllIIlIIlllIIl << Start.llIIlIlIllIIll[1]) + Start.llIIlIlIllIIll[2], (llllllllllllIlllIIIllIIlIlIIIIIl << Start.llIIlIlIllIIll[1]) + Start.llIIlIlIllIIll[2]);
            this.components.add(llllllllllllIlllIIIllIIlIlIIIIII);
            "".length();
            llllllllllllIlllIIIllIIlIlIIIIII.buildComponent(llllllllllllIlllIIIllIIlIlIIIIII, this.components, llllllllllllIlllIIIllIIlIlIIIIll);
            final List<StructureComponent> llllllllllllIlllIIIllIIlIIllllll = llllllllllllIlllIIIllIIlIlIIIIII.field_75026_c;
            "".length();
            if (-" ".length() > (56 + 76 - 94 + 112 ^ 10 + 16 + 70 + 50)) {
                throw null;
            }
            while (!lIIIllIlIlIIIlIl(llllllllllllIlllIIIllIIlIIllllll.isEmpty() ? 1 : 0)) {
                final int llllllllllllIlllIIIllIIlIIlllllI = llllllllllllIlllIIIllIIlIlIIIIll.nextInt(llllllllllllIlllIIIllIIlIIllllll.size());
                final StructureComponent llllllllllllIlllIIIllIIlIIllllIl = llllllllllllIlllIIIllIIlIIllllll.remove(llllllllllllIlllIIIllIIlIIlllllI);
                llllllllllllIlllIIIllIIlIIllllIl.buildComponent(llllllllllllIlllIIIllIIlIlIIIIII, this.components, llllllllllllIlllIIIllIIlIlIIIIll);
            }
            this.updateBoundingBox();
            this.markAvailableHeight(llllllllllllIlllIIIllIIlIlIIIlII, llllllllllllIlllIIIllIIlIlIIIIll, Start.llIIlIlIllIIll[3]);
        }
        
        private static void lIIIllIlIlIIIlII() {
            (llIIlIlIllIIll = new int[4])[0] = ((0x69 ^ 0x3A ^ (0x16 ^ 0x11)) & (0xFF ^ 0xC3 ^ (0xFE ^ 0x96) ^ -" ".length()));
            Start.llIIlIlIllIIll[1] = (0x4D ^ 0x21 ^ (0x60 ^ 0x8));
            Start.llIIlIlIllIIll[2] = "  ".length();
            Start.llIIlIlIllIIll[3] = (0x1A ^ 0x3F ^ (0x92 ^ 0xBD));
        }
        
        private static boolean lIIIllIlIlIIIlIl(final int llllllllllllIlllIIIllIIlIIllIIlI) {
            return llllllllllllIlllIIIllIIlIIllIIlI != 0;
        }
    }
}
