// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.structure;

import java.util.Random;
import net.minecraft.world.World;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityBlaze;
import com.google.common.collect.Lists;
import net.minecraft.world.biome.BiomeGenBase;
import java.util.List;

public class MapGenNetherBridge extends MapGenStructure
{
    private static final /* synthetic */ String[] llIlIlllIlIlIl;
    private /* synthetic */ List<BiomeGenBase.SpawnListEntry> spawnList;
    private static final /* synthetic */ int[] llIlIlllIlIlll;
    
    @Override
    protected StructureStart getStructureStart(final int llllllllllllIllIlIIIlllllIIIllIl, final int llllllllllllIllIlIIIlllllIIlIIIl) {
        return new Start(this.worldObj, this.rand, llllllllllllIllIlIIIlllllIIIllIl, llllllllllllIllIlIIIlllllIIlIIIl);
    }
    
    @Override
    protected boolean canSpawnStructureAtCoords(final int llllllllllllIllIlIIIlllllIlIIIlI, final int llllllllllllIllIlIIIlllllIlIIIIl) {
        final int llllllllllllIllIlIIIlllllIlIIlIl = llllllllllllIllIlIIIlllllIlIIIlI >> MapGenNetherBridge.llIlIlllIlIlll[4];
        final int llllllllllllIllIlIIIlllllIlIIlII = llllllllllllIllIlIIIlllllIlIIIIl >> MapGenNetherBridge.llIlIlllIlIlll[4];
        this.rand.setSeed((long)(llllllllllllIllIlIIIlllllIlIIlIl ^ llllllllllllIllIlIIIlllllIlIIlII << MapGenNetherBridge.llIlIlllIlIlll[4]) ^ this.worldObj.getSeed());
        this.rand.nextInt();
        "".length();
        int n;
        if (lIIlIlIlllIIIlIl(this.rand.nextInt(MapGenNetherBridge.llIlIlllIlIlll[2]))) {
            n = MapGenNetherBridge.llIlIlllIlIlll[5];
            "".length();
            if (null != null) {
                return ((0x96 ^ 0x86) & ~(0x6D ^ 0x7D)) != 0x0;
            }
        }
        else if (lIIlIlIlllIIIllI(llllllllllllIllIlIIIlllllIlIIIlI, (llllllllllllIllIlIIIlllllIlIIlIl << MapGenNetherBridge.llIlIlllIlIlll[4]) + MapGenNetherBridge.llIlIlllIlIlll[4] + this.rand.nextInt(MapGenNetherBridge.llIlIlllIlIlll[6]))) {
            n = MapGenNetherBridge.llIlIlllIlIlll[5];
            "".length();
            if ((0x53 ^ 0x57) <= "  ".length()) {
                return ((0x2B ^ 0x67) & ~(0xE3 ^ 0xAF)) != 0x0;
            }
        }
        else if (lIIlIlIlllIIIlll(llllllllllllIllIlIIIlllllIlIIIIl, (llllllllllllIllIlIIIlllllIlIIlII << MapGenNetherBridge.llIlIlllIlIlll[4]) + MapGenNetherBridge.llIlIlllIlIlll[4] + this.rand.nextInt(MapGenNetherBridge.llIlIlllIlIlll[6]))) {
            n = MapGenNetherBridge.llIlIlllIlIlll[7];
            "".length();
            if ((0x96 ^ 0x92) < (0x7A ^ 0x7E)) {
                return ((0x3B ^ 0x5A) & ~(0x3E ^ 0x5F)) != 0x0;
            }
        }
        else {
            n = MapGenNetherBridge.llIlIlllIlIlll[5];
        }
        return n != 0;
    }
    
    private static boolean lIIlIlIlllIIIlll(final int llllllllllllIllIlIIIllllIlIlllIl, final int llllllllllllIllIlIIIllllIlIlllII) {
        return llllllllllllIllIlIIIllllIlIlllIl == llllllllllllIllIlIIIllllIlIlllII;
    }
    
    public MapGenNetherBridge() {
        this.spawnList = (List<BiomeGenBase.SpawnListEntry>)Lists.newArrayList();
        this.spawnList.add(new BiomeGenBase.SpawnListEntry(EntityBlaze.class, MapGenNetherBridge.llIlIlllIlIlll[0], MapGenNetherBridge.llIlIlllIlIlll[1], MapGenNetherBridge.llIlIlllIlIlll[2]));
        "".length();
        this.spawnList.add(new BiomeGenBase.SpawnListEntry(EntityPigZombie.class, MapGenNetherBridge.llIlIlllIlIlll[3], MapGenNetherBridge.llIlIlllIlIlll[4], MapGenNetherBridge.llIlIlllIlIlll[4]));
        "".length();
        this.spawnList.add(new BiomeGenBase.SpawnListEntry(EntitySkeleton.class, MapGenNetherBridge.llIlIlllIlIlll[0], MapGenNetherBridge.llIlIlllIlIlll[4], MapGenNetherBridge.llIlIlllIlIlll[4]));
        "".length();
        this.spawnList.add(new BiomeGenBase.SpawnListEntry(EntityMagmaCube.class, MapGenNetherBridge.llIlIlllIlIlll[2], MapGenNetherBridge.llIlIlllIlIlll[4], MapGenNetherBridge.llIlIlllIlIlll[4]));
        "".length();
    }
    
    private static String lIIlIlIlllIIIIII(String llllllllllllIllIlIIIllllIllIllII, final String llllllllllllIllIlIIIllllIllIlIll) {
        llllllllllllIllIlIIIllllIllIllII = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIIIllllIllIllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIIIllllIllIllll = new StringBuilder();
        final char[] llllllllllllIllIlIIIllllIllIlllI = llllllllllllIllIlIIIllllIllIlIll.toCharArray();
        int llllllllllllIllIlIIIllllIllIllIl = MapGenNetherBridge.llIlIlllIlIlll[5];
        final int llllllllllllIllIlIIIllllIllIIIll = (Object)((String)llllllllllllIllIlIIIllllIllIllII).toCharArray();
        final char llllllllllllIllIlIIIllllIllIIIlI = (char)llllllllllllIllIlIIIllllIllIIIll.length;
        int llllllllllllIllIlIIIllllIllIIIIl = MapGenNetherBridge.llIlIlllIlIlll[5];
        while (lIIlIlIlllIIlIII(llllllllllllIllIlIIIllllIllIIIIl, llllllllllllIllIlIIIllllIllIIIlI)) {
            final char llllllllllllIllIlIIIllllIlllIIll = llllllllllllIllIlIIIllllIllIIIll[llllllllllllIllIlIIIllllIllIIIIl];
            llllllllllllIllIlIIIllllIllIllll.append((char)(llllllllllllIllIlIIIllllIlllIIll ^ llllllllllllIllIlIIIllllIllIlllI[llllllllllllIllIlIIIllllIllIllIl % llllllllllllIllIlIIIllllIllIlllI.length]));
            "".length();
            ++llllllllllllIllIlIIIllllIllIllIl;
            ++llllllllllllIllIlIIIllllIllIIIIl;
            "".length();
            if ((149 + 15 - 76 + 83 ^ 103 + 17 + 10 + 44) <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIIIllllIllIllll);
    }
    
    private static boolean lIIlIlIlllIIlIII(final int llllllllllllIllIlIIIllllIlIllIIl, final int llllllllllllIllIlIIIllllIlIllIII) {
        return llllllllllllIllIlIIIllllIlIllIIl < llllllllllllIllIlIIIllllIlIllIII;
    }
    
    private static boolean lIIlIlIlllIIIllI(final int llllllllllllIllIlIIIllllIlIlIIll, final int llllllllllllIllIlIIIllllIlIlIIlI) {
        return llllllllllllIllIlIIIllllIlIlIIll != llllllllllllIllIlIIIllllIlIlIIlI;
    }
    
    private static boolean lIIlIlIlllIIIlIl(final int llllllllllllIllIlIIIllllIlIlIllI) {
        return llllllllllllIllIlIIIllllIlIlIllI != 0;
    }
    
    private static void lIIlIlIlllIIIlII() {
        (llIlIlllIlIlll = new int[8])[0] = (0xB2 ^ 0xB6 ^ (0x52 ^ 0x5C));
        MapGenNetherBridge.llIlIlllIlIlll[1] = "  ".length();
        MapGenNetherBridge.llIlIlllIlIlll[2] = "   ".length();
        MapGenNetherBridge.llIlIlllIlIlll[3] = (0x12 ^ 0x17);
        MapGenNetherBridge.llIlIlllIlIlll[4] = (0x48 ^ 0x4C);
        MapGenNetherBridge.llIlIlllIlIlll[5] = ((0xBD ^ 0x8A) & ~(0x4C ^ 0x7B));
        MapGenNetherBridge.llIlIlllIlIlll[6] = (61 + 129 - 147 + 144 ^ 178 + 142 - 148 + 7);
        MapGenNetherBridge.llIlIlllIlIlll[7] = " ".length();
    }
    
    @Override
    public String getStructureName() {
        return MapGenNetherBridge.llIlIlllIlIlIl[MapGenNetherBridge.llIlIlllIlIlll[5]];
    }
    
    public List<BiomeGenBase.SpawnListEntry> getSpawnList() {
        return this.spawnList;
    }
    
    static {
        lIIlIlIlllIIIlII();
        lIIlIlIlllIIIIIl();
    }
    
    private static void lIIlIlIlllIIIIIl() {
        (llIlIlllIlIlIl = new String[MapGenNetherBridge.llIlIlllIlIlll[7]])[MapGenNetherBridge.llIlIlllIlIlll[5]] = lIIlIlIlllIIIIII("FSAnMSE2PCY=", "SOUES");
    }
    
    public static class Start extends StructureStart
    {
        private static final /* synthetic */ int[] lllIIIlIIlIllI;
        
        private static void lIIlllIlIlIIIIIl() {
            (lllIIIlIIlIllI = new int[4])[0] = (0x50 ^ 0x54);
            Start.lllIIIlIIlIllI[1] = "  ".length();
            Start.lllIIIlIIlIllI[2] = (0x3C ^ 0xC);
            Start.lllIIIlIIlIllI[3] = (0x30 ^ 0x2D ^ (0xEB ^ 0xB0));
        }
        
        private static boolean lIIlllIlIlIIIIlI(final int llllllllllllIllIIIIIllIIIIIIIllI) {
            return llllllllllllIllIIIIIllIIIIIIIllI != 0;
        }
        
        static {
            lIIlllIlIlIIIIIl();
        }
        
        public Start(final World llllllllllllIllIIIIIllIIIIIIllll, final Random llllllllllllIllIIIIIllIIIIIIlllI, final int llllllllllllIllIIIIIllIIIIIIllIl, final int llllllllllllIllIIIIIllIIIIIlIlIl) {
            super(llllllllllllIllIIIIIllIIIIIIllIl, llllllllllllIllIIIIIllIIIIIlIlIl);
            final StructureNetherBridgePieces.Start llllllllllllIllIIIIIllIIIIIlIlII = new StructureNetherBridgePieces.Start(llllllllllllIllIIIIIllIIIIIIlllI, (llllllllllllIllIIIIIllIIIIIIllIl << Start.lllIIIlIIlIllI[0]) + Start.lllIIIlIIlIllI[1], (llllllllllllIllIIIIIllIIIIIlIlIl << Start.lllIIIlIIlIllI[0]) + Start.lllIIIlIIlIllI[1]);
            this.components.add(llllllllllllIllIIIIIllIIIIIlIlII);
            "".length();
            llllllllllllIllIIIIIllIIIIIlIlII.buildComponent(llllllllllllIllIIIIIllIIIIIlIlII, this.components, llllllllllllIllIIIIIllIIIIIIlllI);
            final List<StructureComponent> llllllllllllIllIIIIIllIIIIIlIIll = llllllllllllIllIIIIIllIIIIIlIlII.field_74967_d;
            "".length();
            if ("  ".length() < -" ".length()) {
                throw null;
            }
            while (!lIIlllIlIlIIIIlI(llllllllllllIllIIIIIllIIIIIlIIll.isEmpty() ? 1 : 0)) {
                final int llllllllllllIllIIIIIllIIIIIlIIlI = llllllllllllIllIIIIIllIIIIIIlllI.nextInt(llllllllllllIllIIIIIllIIIIIlIIll.size());
                final StructureComponent llllllllllllIllIIIIIllIIIIIlIIIl = llllllllllllIllIIIIIllIIIIIlIIll.remove(llllllllllllIllIIIIIllIIIIIlIIlI);
                llllllllllllIllIIIIIllIIIIIlIIIl.buildComponent(llllllllllllIllIIIIIllIIIIIlIlII, this.components, llllllllllllIllIIIIIllIIIIIIlllI);
            }
            this.updateBoundingBox();
            this.setRandomHeight(llllllllllllIllIIIIIllIIIIIIllll, llllllllllllIllIIIIIllIIIIIIlllI, Start.lllIIIlIIlIllI[2], Start.lllIIIlIIlIllI[3]);
        }
        
        public Start() {
        }
    }
}
