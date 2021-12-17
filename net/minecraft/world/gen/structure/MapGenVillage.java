// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.structure;

import java.util.Iterator;
import net.minecraft.world.World;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Random;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.MathHelper;
import java.util.Map;
import java.util.Arrays;
import net.minecraft.world.biome.BiomeGenBase;
import java.util.List;

public class MapGenVillage extends MapGenStructure
{
    private static final /* synthetic */ String[] llIlllIIllIIlI;
    private /* synthetic */ int field_82665_g;
    private /* synthetic */ int terrainType;
    private static final /* synthetic */ int[] llIlllIIllIllI;
    public static final /* synthetic */ List<BiomeGenBase> villageSpawnBiomes;
    private /* synthetic */ int field_82666_h;
    
    static {
        lIIllIIlIllllIll();
        lIIllIIlIllllIIl();
        final BiomeGenBase[] a = new BiomeGenBase[MapGenVillage.llIlllIIllIllI[0]];
        a[MapGenVillage.llIlllIIllIllI[1]] = BiomeGenBase.plains;
        a[MapGenVillage.llIlllIIllIllI[2]] = BiomeGenBase.desert;
        a[MapGenVillage.llIlllIIllIllI[3]] = BiomeGenBase.savanna;
        villageSpawnBiomes = Arrays.asList(a);
    }
    
    private static boolean lIIllIIlIllllllI(final int llllllllllllIllIIlIIllIIlIlIlIlI) {
        return llllllllllllIllIIlIIllIIlIlIlIlI < 0;
    }
    
    private static boolean lIIllIIlIlllllIl(final int llllllllllllIllIIlIIllIIlIlIllII) {
        return llllllllllllIllIIlIIllIIlIlIllII == 0;
    }
    
    public MapGenVillage(final Map<String, String> llllllllllllIllIIlIIllIIlllIlIll) {
        this();
        final String llllllllllllIllIIlIIllIIlllIIllI = (String)llllllllllllIllIIlIIllIIlllIlIll.entrySet().iterator();
        "".length();
        if (null != null) {
            throw null;
        }
        while (!lIIllIIlIlllllIl(((Iterator)llllllllllllIllIIlIIllIIlllIIllI).hasNext() ? 1 : 0)) {
            final Map.Entry<String, String> llllllllllllIllIIlIIllIIlllIlIlI = ((Iterator<Map.Entry<String, String>>)llllllllllllIllIIlIIllIIlllIIllI).next();
            if (lIIllIIlIlllllII(llllllllllllIllIIlIIllIIlllIlIlI.getKey().equals(MapGenVillage.llIlllIIllIIlI[MapGenVillage.llIlllIIllIllI[1]]) ? 1 : 0)) {
                this.terrainType = MathHelper.parseIntWithDefaultAndMax(llllllllllllIllIIlIIllIIlllIlIlI.getValue(), this.terrainType, MapGenVillage.llIlllIIllIllI[1]);
                "".length();
                if (((0xE8 ^ 0xB8) & ~(0xE7 ^ 0xB7)) != 0x0) {
                    throw null;
                }
                continue;
            }
            else {
                if (!lIIllIIlIlllllII(llllllllllllIllIIlIIllIIlllIlIlI.getKey().equals(MapGenVillage.llIlllIIllIIlI[MapGenVillage.llIlllIIllIllI[2]]) ? 1 : 0)) {
                    continue;
                }
                this.field_82665_g = MathHelper.parseIntWithDefaultAndMax(llllllllllllIllIIlIIllIIlllIlIlI.getValue(), this.field_82665_g, this.field_82666_h + MapGenVillage.llIlllIIllIllI[2]);
            }
        }
    }
    
    public MapGenVillage() {
        this.field_82665_g = MapGenVillage.llIlllIIllIllI[4];
        this.field_82666_h = MapGenVillage.llIlllIIllIllI[5];
    }
    
    private static void lIIllIIlIllllIll() {
        (llIlllIIllIllI = new int[8])[0] = "   ".length();
        MapGenVillage.llIlllIIllIllI[1] = ((0xB3 ^ 0x94 ^ (0x35 ^ 0xC)) & (0xA6 ^ 0xB6 ^ (0xAA ^ 0xA4) ^ -" ".length()));
        MapGenVillage.llIlllIIllIllI[2] = " ".length();
        MapGenVillage.llIlllIIllIllI[3] = "  ".length();
        MapGenVillage.llIlllIIllIllI[4] = (114 + 30 - 128 + 111 ^ (0x1 ^ 0x5E));
        MapGenVillage.llIlllIIllIllI[5] = ("  ".length() ^ (0x11 ^ 0x1B));
        MapGenVillage.llIlllIIllIllI[6] = (-(40 + 10 + 55 + 27) & (0xFFFFFFF3 & 0x9E7FFF));
        MapGenVillage.llIlllIIllIllI[7] = (0x31 ^ 0x2C ^ (0x4 ^ 0x9));
    }
    
    private static boolean lIIllIIlIlllllll(final int llllllllllllIllIIlIIllIIlIllIIIl, final int llllllllllllIllIIlIIllIIlIllIIII) {
        return llllllllllllIllIIlIIllIIlIllIIIl == llllllllllllIllIIlIIllIIlIllIIII;
    }
    
    private static String lIIllIIlIlllIllI(final String llllllllllllIllIIlIIllIIlIllIlll, final String llllllllllllIllIIlIIllIIlIllIllI) {
        try {
            final SecretKeySpec llllllllllllIllIIlIIllIIlIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIllIIlIllIllI.getBytes(StandardCharsets.UTF_8)), MapGenVillage.llIlllIIllIllI[5]), "DES");
            final Cipher llllllllllllIllIIlIIllIIlIlllIll = Cipher.getInstance("DES");
            llllllllllllIllIIlIIllIIlIlllIll.init(MapGenVillage.llIlllIIllIllI[3], llllllllllllIllIIlIIllIIlIllllII);
            return new String(llllllllllllIllIIlIIllIIlIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIllIIlIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIIllIIlIlllIlI) {
            llllllllllllIllIIlIIllIIlIlllIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllIIlIlllllII(final int llllllllllllIllIIlIIllIIlIlIlllI) {
        return llllllllllllIllIIlIIllIIlIlIlllI != 0;
    }
    
    private static void lIIllIIlIllllIIl() {
        (llIlllIIllIIlI = new String[MapGenVillage.llIlllIIllIllI[0]])[MapGenVillage.llIlllIIllIllI[1]] = lIIllIIlIlllIllI("gaIlfBD/SSo=", "BBKhS");
        MapGenVillage.llIlllIIllIIlI[MapGenVillage.llIlllIIllIllI[2]] = lIIllIIlIlllIllI("M2wnj/2W9LZyCIQXHe9MNw==", "Byxzi");
        MapGenVillage.llIlllIIllIIlI[MapGenVillage.llIlllIIllIllI[3]] = lIIllIIlIlllIllI("R66CT/omDTE=", "ZdQcj");
    }
    
    @Override
    protected boolean canSpawnStructureAtCoords(int llllllllllllIllIIlIIllIIllIlIIIl, int llllllllllllIllIIlIIllIIllIlIIII) {
        final int llllllllllllIllIIlIIllIIllIllIII = llllllllllllIllIIlIIllIIllIlIIIl;
        final int llllllllllllIllIIlIIllIIllIlIlll = llllllllllllIllIIlIIllIIllIlIIII;
        if (lIIllIIlIllllllI(llllllllllllIllIIlIIllIIllIlIIIl)) {
            llllllllllllIllIIlIIllIIllIlIIIl -= this.field_82665_g - MapGenVillage.llIlllIIllIllI[2];
        }
        if (lIIllIIlIllllllI(llllllllllllIllIIlIIllIIllIlIIII)) {
            llllllllllllIllIIlIIllIIllIlIIII -= this.field_82665_g - MapGenVillage.llIlllIIllIllI[2];
        }
        int llllllllllllIllIIlIIllIIllIlIllI = llllllllllllIllIIlIIllIIllIlIIIl / this.field_82665_g;
        int llllllllllllIllIIlIIllIIllIlIlIl = llllllllllllIllIIlIIllIIllIlIIII / this.field_82665_g;
        final Random llllllllllllIllIIlIIllIIllIlIlII = this.worldObj.setRandomSeed(llllllllllllIllIIlIIllIIllIlIllI, llllllllllllIllIIlIIllIIllIlIlIl, MapGenVillage.llIlllIIllIllI[6]);
        llllllllllllIllIIlIIllIIllIlIllI *= this.field_82665_g;
        llllllllllllIllIIlIIllIIllIlIlIl *= this.field_82665_g;
        llllllllllllIllIIlIIllIIllIlIllI += llllllllllllIllIIlIIllIIllIlIlII.nextInt(this.field_82665_g - this.field_82666_h);
        llllllllllllIllIIlIIllIIllIlIlIl += llllllllllllIllIIlIIllIIllIlIlII.nextInt(this.field_82665_g - this.field_82666_h);
        if (lIIllIIlIlllllll(llllllllllllIllIIlIIllIIllIllIII, llllllllllllIllIIlIIllIIllIlIllI) && lIIllIIlIlllllll(llllllllllllIllIIlIIllIIllIlIlll, llllllllllllIllIIlIIllIIllIlIlIl)) {
            final boolean llllllllllllIllIIlIIllIIllIlIIll = this.worldObj.getWorldChunkManager().areBiomesViable(llllllllllllIllIIlIIllIIllIllIII * MapGenVillage.llIlllIIllIllI[7] + MapGenVillage.llIlllIIllIllI[5], llllllllllllIllIIlIIllIIllIlIlll * MapGenVillage.llIlllIIllIllI[7] + MapGenVillage.llIlllIIllIllI[5], MapGenVillage.llIlllIIllIllI[1], MapGenVillage.villageSpawnBiomes);
            if (lIIllIIlIlllllII(llllllllllllIllIIlIIllIIllIlIIll ? 1 : 0)) {
                return MapGenVillage.llIlllIIllIllI[2] != 0;
            }
        }
        return MapGenVillage.llIlllIIllIllI[1] != 0;
    }
    
    @Override
    protected StructureStart getStructureStart(final int llllllllllllIllIIlIIllIIllIIIlIl, final int llllllllllllIllIIlIIllIIllIIIlII) {
        return new Start(this.worldObj, this.rand, llllllllllllIllIIlIIllIIllIIIlIl, llllllllllllIllIIlIIllIIllIIIlII, this.terrainType);
    }
    
    @Override
    public String getStructureName() {
        return MapGenVillage.llIlllIIllIIlI[MapGenVillage.llIlllIIllIllI[3]];
    }
    
    public static class Start extends StructureStart
    {
        private /* synthetic */ boolean hasMoreThanTwoComponents;
        private static final /* synthetic */ String[] lIlIIIIlIllllI;
        private static final /* synthetic */ int[] lIlIIIIlIlllll;
        
        public Start() {
        }
        
        private static void lllIIIIllIllIlI() {
            (lIlIIIIlIlllll = new int[4])[0] = ((0x36 ^ 0x56) & ~(0xEC ^ 0x8C));
            Start.lIlIIIIlIlllll[1] = (0x60 ^ 0x64);
            Start.lIlIIIIlIlllll[2] = "  ".length();
            Start.lIlIIIIlIlllll[3] = " ".length();
        }
        
        @Override
        public void writeToNBT(final NBTTagCompound lllllllllllllIIlIIIIIllIIlIlIIll) {
            super.writeToNBT(lllllllllllllIIlIIIIIllIIlIlIIll);
            lllllllllllllIIlIIIIIllIIlIlIIll.setBoolean(Start.lIlIIIIlIllllI[Start.lIlIIIIlIlllll[0]], this.hasMoreThanTwoComponents);
        }
        
        private static void lllIIIIllIllIIl() {
            (lIlIIIIlIllllI = new String[Start.lIlIIIIlIlllll[2]])[Start.lIlIIIIlIlllll[0]] = lllIIIIllIllIII("AAYaITM=", "VgvHW");
            Start.lIlIIIIlIllllI[Start.lIlIIIIlIlllll[3]] = lllIIIIllIllIII("OhMaAic=", "lrvkC");
        }
        
        private static boolean lllIIIIllIlllII(final int lllllllllllllIIlIIIIIllIIIlIIlll) {
            return lllllllllllllIIlIIIIIllIIIlIIlll == 0;
        }
        
        @Override
        public void readFromNBT(final NBTTagCompound lllllllllllllIIlIIIIIllIIlIIlIll) {
            super.readFromNBT(lllllllllllllIIlIIIIIllIIlIIlIll);
            this.hasMoreThanTwoComponents = lllllllllllllIIlIIIIIllIIlIIlIll.getBoolean(Start.lIlIIIIlIllllI[Start.lIlIIIIlIlllll[3]]);
        }
        
        private static boolean lllIIIIllIllllI(final int lllllllllllllIIlIIIIIllIIIllIIII, final int lllllllllllllIIlIIIIIllIIIlIllll) {
            return lllllllllllllIIlIIIIIllIIIllIIII < lllllllllllllIIlIIIIIllIIIlIllll;
        }
        
        public Start(final World lllllllllllllIIlIIIIIllIIlllIlIl, final Random lllllllllllllIIlIIIIIllIIlllIlII, final int lllllllllllllIIlIIIIIllIIlllIIll, final int lllllllllllllIIlIIIIIllIIllIIIlI, final int lllllllllllllIIlIIIIIllIIlllIIIl) {
            super(lllllllllllllIIlIIIIIllIIlllIIll, lllllllllllllIIlIIIIIllIIllIIIlI);
            final List<StructureVillagePieces.PieceWeight> lllllllllllllIIlIIIIIllIIlllIIII = StructureVillagePieces.getStructureVillageWeightedPieceList(lllllllllllllIIlIIIIIllIIlllIlII, lllllllllllllIIlIIIIIllIIlllIIIl);
            final StructureVillagePieces.Start lllllllllllllIIlIIIIIllIIllIllll = new StructureVillagePieces.Start(lllllllllllllIIlIIIIIllIIlllIlIl.getWorldChunkManager(), Start.lIlIIIIlIlllll[0], lllllllllllllIIlIIIIIllIIlllIlII, (lllllllllllllIIlIIIIIllIIlllIIll << Start.lIlIIIIlIlllll[1]) + Start.lIlIIIIlIlllll[2], (lllllllllllllIIlIIIIIllIIllIIIlI << Start.lIlIIIIlIlllll[1]) + Start.lIlIIIIlIlllll[2], lllllllllllllIIlIIIIIllIIlllIIII, lllllllllllllIIlIIIIIllIIlllIIIl);
            this.components.add(lllllllllllllIIlIIIIIllIIllIllll);
            "".length();
            lllllllllllllIIlIIIIIllIIllIllll.buildComponent(lllllllllllllIIlIIIIIllIIllIllll, this.components, lllllllllllllIIlIIIIIllIIlllIlII);
            final List<StructureComponent> lllllllllllllIIlIIIIIllIIllIlllI = lllllllllllllIIlIIIIIllIIllIllll.field_74930_j;
            final List<StructureComponent> lllllllllllllIIlIIIIIllIIllIllIl = lllllllllllllIIlIIIIIllIIllIllll.field_74932_i;
            "".length();
            if (null != null) {
                throw null;
            }
            while (!lllIIIIllIllIll(lllllllllllllIIlIIIIIllIIllIlllI.isEmpty() ? 1 : 0) || !lllIIIIllIllIll(lllllllllllllIIlIIIIIllIIllIllIl.isEmpty() ? 1 : 0)) {
                if (lllIIIIllIllIll(lllllllllllllIIlIIIIIllIIllIlllI.isEmpty() ? 1 : 0)) {
                    final int lllllllllllllIIlIIIIIllIIllIllII = lllllllllllllIIlIIIIIllIIlllIlII.nextInt(lllllllllllllIIlIIIIIllIIllIllIl.size());
                    final StructureComponent lllllllllllllIIlIIIIIllIIllIlIll = lllllllllllllIIlIIIIIllIIllIllIl.remove(lllllllllllllIIlIIIIIllIIllIllII);
                    lllllllllllllIIlIIIIIllIIllIlIll.buildComponent(lllllllllllllIIlIIIIIllIIllIllll, this.components, lllllllllllllIIlIIIIIllIIlllIlII);
                    "".length();
                    if ("  ".length() == 0) {
                        throw null;
                    }
                    continue;
                }
                else {
                    final int lllllllllllllIIlIIIIIllIIllIlIlI = lllllllllllllIIlIIIIIllIIlllIlII.nextInt(lllllllllllllIIlIIIIIllIIllIlllI.size());
                    final StructureComponent lllllllllllllIIlIIIIIllIIllIlIIl = lllllllllllllIIlIIIIIllIIllIlllI.remove(lllllllllllllIIlIIIIIllIIllIlIlI);
                    lllllllllllllIIlIIIIIllIIllIlIIl.buildComponent(lllllllllllllIIlIIIIIllIIllIllll, this.components, lllllllllllllIIlIIIIIllIIlllIlII);
                }
            }
            this.updateBoundingBox();
            int lllllllllllllIIlIIIIIllIIllIlIII = Start.lIlIIIIlIlllll[0];
            final String lllllllllllllIIlIIIIIllIIlIllIlI = (String)this.components.iterator();
            "".length();
            if (-" ".length() < -" ".length()) {
                throw null;
            }
            while (!lllIIIIllIlllII(((Iterator)lllllllllllllIIlIIIIIllIIlIllIlI).hasNext() ? 1 : 0)) {
                final StructureComponent lllllllllllllIIlIIIIIllIIllIIlll = ((Iterator<StructureComponent>)lllllllllllllIIlIIIIIllIIlIllIlI).next();
                if (lllIIIIllIlllII((lllllllllllllIIlIIIIIllIIllIIlll instanceof StructureVillagePieces.Road) ? 1 : 0)) {
                    ++lllllllllllllIIlIIIIIllIIllIlIII;
                }
            }
            int hasMoreThanTwoComponents;
            if (lllIIIIllIlllIl(lllllllllllllIIlIIIIIllIIllIlIII, Start.lIlIIIIlIlllll[2])) {
                hasMoreThanTwoComponents = Start.lIlIIIIlIlllll[3];
                "".length();
                if ("   ".length() >= (0xD ^ 0x50 ^ (0x53 ^ 0xA))) {
                    throw null;
                }
            }
            else {
                hasMoreThanTwoComponents = Start.lIlIIIIlIlllll[0];
            }
            this.hasMoreThanTwoComponents = (hasMoreThanTwoComponents != 0);
        }
        
        static {
            lllIIIIllIllIlI();
            lllIIIIllIllIIl();
        }
        
        @Override
        public boolean isSizeableStructure() {
            return this.hasMoreThanTwoComponents;
        }
        
        private static boolean lllIIIIllIllIll(final int lllllllllllllIIlIIIIIllIIIlIlIIl) {
            return lllllllllllllIIlIIIIIllIIIlIlIIl != 0;
        }
        
        private static String lllIIIIllIllIII(String lllllllllllllIIlIIIIIllIIIlllIll, final String lllllllllllllIIlIIIIIllIIIllllll) {
            lllllllllllllIIlIIIIIllIIIlllIll = new String(Base64.getDecoder().decode(lllllllllllllIIlIIIIIllIIIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIlIIIIIllIIIlllllI = new StringBuilder();
            final char[] lllllllllllllIIlIIIIIllIIIllllIl = lllllllllllllIIlIIIIIllIIIllllll.toCharArray();
            int lllllllllllllIIlIIIIIllIIIllllII = Start.lIlIIIIlIlllll[0];
            final short lllllllllllllIIlIIIIIllIIIllIllI = (Object)lllllllllllllIIlIIIIIllIIIlllIll.toCharArray();
            final Exception lllllllllllllIIlIIIIIllIIIllIlIl = (Exception)lllllllllllllIIlIIIIIllIIIllIllI.length;
            boolean lllllllllllllIIlIIIIIllIIIllIlII = Start.lIlIIIIlIlllll[0] != 0;
            while (lllIIIIllIllllI(lllllllllllllIIlIIIIIllIIIllIlII ? 1 : 0, (int)lllllllllllllIIlIIIIIllIIIllIlIl)) {
                final char lllllllllllllIIlIIIIIllIIlIIIIIl = lllllllllllllIIlIIIIIllIIIllIllI[lllllllllllllIIlIIIIIllIIIllIlII];
                lllllllllllllIIlIIIIIllIIIlllllI.append((char)(lllllllllllllIIlIIIIIllIIlIIIIIl ^ lllllllllllllIIlIIIIIllIIIllllIl[lllllllllllllIIlIIIIIllIIIllllII % lllllllllllllIIlIIIIIllIIIllllIl.length]));
                "".length();
                ++lllllllllllllIIlIIIIIllIIIllllII;
                ++lllllllllllllIIlIIIIIllIIIllIlII;
                "".length();
                if (" ".length() < " ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIlIIIIIllIIIlllllI);
        }
        
        private static boolean lllIIIIllIlllIl(final int lllllllllllllIIlIIIIIllIIIlIllII, final int lllllllllllllIIlIIIIIllIIIlIlIll) {
            return lllllllllllllIIlIIIIIllIIIlIllII > lllllllllllllIIlIIIIIllIIIlIlIll;
        }
    }
}
