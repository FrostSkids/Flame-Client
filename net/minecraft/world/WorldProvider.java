// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world;

import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.FlatGeneratorInfo;
import net.minecraft.util.Vec3;
import net.minecraft.util.MathHelper;
import net.minecraft.world.gen.ChunkProviderGenerate;
import net.minecraft.world.gen.ChunkProviderDebug;
import net.minecraft.world.gen.ChunkProviderFlat;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.border.WorldBorder;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.biome.WorldChunkManager;

public abstract class WorldProvider
{
    protected /* synthetic */ WorldChunkManager worldChunkMgr;
    private /* synthetic */ String generatorSettings;
    protected /* synthetic */ int dimensionId;
    private final /* synthetic */ float[] colorsSunriseSunset;
    protected /* synthetic */ boolean hasNoSky;
    protected final /* synthetic */ float[] lightBrightnessTable;
    private /* synthetic */ WorldType terrainType;
    protected /* synthetic */ World worldObj;
    protected /* synthetic */ boolean isHellWorld;
    private static final /* synthetic */ int[] llIlIIIlIIlIll;
    
    public final void registerWorld(final World llllllllllllIllIllIlIIIllIllIIIl) {
        this.worldObj = llllllllllllIllIllIlIIIllIllIIIl;
        this.terrainType = llllllllllllIllIllIlIIIllIllIIIl.getWorldInfo().getTerrainType();
        this.generatorSettings = llllllllllllIllIllIlIIIllIllIIIl.getWorldInfo().getGeneratorOptions();
        this.registerWorldChunkManager();
        this.generateLightBrightnessTable();
    }
    
    public boolean canCoordinateBeSpawn(final int llllllllllllIllIllIlIIIllIIlIlII, final int llllllllllllIllIllIlIIIllIIlIIII) {
        if (lIIlIIIllIllIllI(this.worldObj.getGroundAboveSeaLevel(new BlockPos(llllllllllllIllIllIlIIIllIIlIlII, WorldProvider.llIlIIIlIIlIll[1], llllllllllllIllIllIlIIIllIIlIIII)), Blocks.grass)) {
            return WorldProvider.llIlIIIlIIlIll[2] != 0;
        }
        return WorldProvider.llIlIIIlIIlIll[1] != 0;
    }
    
    public float[] getLightBrightnessTable() {
        return this.lightBrightnessTable;
    }
    
    private static boolean lIIlIIIlllIIIIII(final int llllllllllllIllIllIlIIIlIIlIlIIl) {
        return llllllllllllIllIllIlIIIlIIlIlIIl == 0;
    }
    
    private static void lIIlIIIllIllIlII() {
        (llIlIIIlIIlIll = new int[12])[0] = (0x3E ^ 0x36);
        WorldProvider.llIlIIIlIIlIll[1] = ((0x4D ^ 0x60) & ~(0x26 ^ 0xB));
        WorldProvider.llIlIIIlIIlIll[2] = " ".length();
        WorldProvider.llIlIIIlIIlIll[3] = "  ".length();
        WorldProvider.llIlIIIlIIlIll[4] = "   ".length();
        WorldProvider.llIlIIIlIIlIll[5] = (0x96 ^ 0x92 ^ ((0x5B ^ 0x11) & ~(0x69 ^ 0x23)));
        WorldProvider.llIlIIIlIIlIll[6] = (94 + 35 - 106 + 163 ^ 188 + 156 - 210 + 57);
        WorldProvider.llIlIIIlIIlIll[7] = (0x9B ^ 0x9D);
        WorldProvider.llIlIIIlIIlIll[8] = (0x7 ^ 0x33 ^ (0x50 ^ 0x63));
        WorldProvider.llIlIIIlIIlIll[9] = (0xBD ^ 0xAD);
        WorldProvider.llIlIIIlIIlIll[10] = (0x29 ^ 0x26);
        WorldProvider.llIlIIIlIIlIll[11] = -" ".length();
    }
    
    public WorldBorder getWorldBorder() {
        return new WorldBorder();
    }
    
    private static boolean lIIlIIIllIllIllI(final Object llllllllllllIllIllIlIIIlIIlIllII, final Object llllllllllllIllIllIlIIIlIIlIlIll) {
        return llllllllllllIllIllIlIIIlIIlIllII == llllllllllllIllIllIlIIIlIIlIlIll;
    }
    
    public boolean doesWaterVaporize() {
        return this.isHellWorld;
    }
    
    private static int lIIlIIIllIlllIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public static WorldProvider getProviderForDimension(final int llllllllllllIllIllIlIIIlIlIlIIll) {
        WorldProvider worldProvider;
        if (lIIlIIIllIllllll(llllllllllllIllIllIlIIIlIlIlIIll, WorldProvider.llIlIIIlIIlIll[11])) {
            worldProvider = new WorldProviderHell();
            "".length();
            if ("   ".length() >= (0x44 ^ 0x73 ^ (0x8 ^ 0x3B))) {
                return null;
            }
        }
        else if (lIIlIIIlllIIIIII(llllllllllllIllIllIlIIIlIlIlIIll)) {
            worldProvider = new WorldProviderSurface();
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        else if (lIIlIIIllIllllll(llllllllllllIllIllIlIIIlIlIlIIll, WorldProvider.llIlIIIlIIlIll[2])) {
            worldProvider = new WorldProviderEnd();
            "".length();
            if (((33 + 30 + 11 + 127 ^ 49 + 132 - 61 + 20) & (153 + 120 - 53 + 31 ^ 9 + 76 - 53 + 158 ^ -" ".length())) < 0) {
                return null;
            }
        }
        else {
            worldProvider = null;
        }
        return worldProvider;
    }
    
    static {
        lIIlIIIllIllIlII();
        final float[] moonPhaseFactors2 = new float[WorldProvider.llIlIIIlIIlIll[0]];
        moonPhaseFactors2[WorldProvider.llIlIIIlIIlIll[1]] = 1.0f;
        moonPhaseFactors2[WorldProvider.llIlIIIlIIlIll[2]] = 0.75f;
        moonPhaseFactors2[WorldProvider.llIlIIIlIIlIll[3]] = 0.5f;
        moonPhaseFactors2[WorldProvider.llIlIIIlIIlIll[4]] = 0.25f;
        moonPhaseFactors2[WorldProvider.llIlIIIlIIlIll[5]] = 0.0f;
        moonPhaseFactors2[WorldProvider.llIlIIIlIIlIll[6]] = 0.25f;
        moonPhaseFactors2[WorldProvider.llIlIIIlIIlIll[7]] = 0.5f;
        moonPhaseFactors2[WorldProvider.llIlIIIlIIlIll[8]] = 0.75f;
        moonPhaseFactors = moonPhaseFactors2;
    }
    
    private static int lIIlIIIllIllllII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public boolean getHasNoSky() {
        return this.hasNoSky;
    }
    
    public float getCloudHeight() {
        return 128.0f;
    }
    
    public int getMoonPhase(final long llllllllllllIllIllIlIIIlIlllllll) {
        return (int)(llllllllllllIllIllIlIIIlIlllllll / 24000L % 8L + 8L) % WorldProvider.llIlIIIlIIlIll[0];
    }
    
    private static int lIIlIIIllIllIlll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public boolean isSkyColored() {
        return WorldProvider.llIlIIIlIIlIll[2] != 0;
    }
    
    public IChunkProvider createChunkGenerator() {
        IChunkProvider chunkProvider;
        if (lIIlIIIllIllIllI(this.terrainType, WorldType.FLAT)) {
            chunkProvider = new ChunkProviderFlat(this.worldObj, this.worldObj.getSeed(), this.worldObj.getWorldInfo().isMapFeaturesEnabled(), this.generatorSettings);
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        else if (lIIlIIIllIllIllI(this.terrainType, WorldType.DEBUG_WORLD)) {
            chunkProvider = new ChunkProviderDebug(this.worldObj);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (lIIlIIIllIllIllI(this.terrainType, WorldType.CUSTOMIZED)) {
            chunkProvider = new ChunkProviderGenerate(this.worldObj, this.worldObj.getSeed(), this.worldObj.getWorldInfo().isMapFeaturesEnabled(), this.generatorSettings);
            "".length();
            if (((0x1D ^ 0x42) & ~(0xF8 ^ 0xA7)) < -" ".length()) {
                return null;
            }
        }
        else {
            chunkProvider = new ChunkProviderGenerate(this.worldObj, this.worldObj.getSeed(), this.worldObj.getWorldInfo().isMapFeaturesEnabled(), this.generatorSettings);
        }
        return chunkProvider;
    }
    
    public double getVoidFogYFactor() {
        double n;
        if (lIIlIIIllIllIllI(this.terrainType, WorldType.FLAT)) {
            n = 1.0;
            "".length();
            if ((82 + 93 - 81 + 57 ^ 18 + 137 - 90 + 82) < "  ".length()) {
                return 0.0;
            }
        }
        else {
            n = 0.03125;
        }
        return n;
    }
    
    public boolean isSurfaceWorld() {
        return WorldProvider.llIlIIIlIIlIll[2] != 0;
    }
    
    public abstract String getInternalNameSuffix();
    
    private static boolean lIIlIIIllIlllllI(final int llllllllllllIllIllIlIIIlIIlIIIll) {
        return llllllllllllIllIllIlIIIlIIlIIIll <= 0;
    }
    
    public int getAverageGroundLevel() {
        int n;
        if (lIIlIIIllIllIllI(this.terrainType, WorldType.FLAT)) {
            n = WorldProvider.llIlIIIlIIlIll[5];
            "".length();
            if ("   ".length() == (0xED ^ 0x83 ^ (0x67 ^ 0xD))) {
                return (0x64 ^ 0x0 ^ (0x7 ^ 0x3D)) & (83 + 157 - 36 + 42 ^ 119 + 164 - 154 + 39 ^ -" ".length());
            }
        }
        else {
            n = this.worldObj.func_181545_F() + WorldProvider.llIlIIIlIIlIll[2];
        }
        return n;
    }
    
    protected void generateLightBrightnessTable() {
        final float llllllllllllIllIllIlIIIllIlIlIll = 0.0f;
        int llllllllllllIllIllIlIIIllIlIlIlI = WorldProvider.llIlIIIlIIlIll[1];
        "".length();
        if ((0x8E ^ 0x8B) == 0x0) {
            return;
        }
        while (!lIIlIIIllIllIlIl(llllllllllllIllIllIlIIIllIlIlIlI, WorldProvider.llIlIIIlIIlIll[10])) {
            final float llllllllllllIllIllIlIIIllIlIlIIl = 1.0f - llllllllllllIllIllIlIIIllIlIlIlI / 15.0f;
            this.lightBrightnessTable[llllllllllllIllIllIlIIIllIlIlIlI] = (1.0f - llllllllllllIllIllIlIIIllIlIlIIl) / (llllllllllllIllIllIlIIIllIlIlIIl * 3.0f + 1.0f) * (1.0f - llllllllllllIllIllIlIIIllIlIlIll) + llllllllllllIllIllIlIIIllIlIlIll;
            ++llllllllllllIllIllIlIIIllIlIlIlI;
        }
    }
    
    public int getDimensionId() {
        return this.dimensionId;
    }
    
    private static boolean lIIlIIIllIllllll(final int llllllllllllIllIllIlIIIlIIllIlII, final int llllllllllllIllIllIlIIIlIIllIIll) {
        return llllllllllllIllIllIlIIIlIIllIlII == llllllllllllIllIllIlIIIlIIllIIll;
    }
    
    public abstract String getDimensionName();
    
    public float calculateCelestialAngle(final long llllllllllllIllIllIlIIIllIIIlIlI, final float llllllllllllIllIllIlIIIllIIIlIIl) {
        final int llllllllllllIllIllIlIIIllIIIlIII = (int)(llllllllllllIllIllIlIIIllIIIlIlI % 24000L);
        float llllllllllllIllIllIlIIIllIIIIlll = (llllllllllllIllIllIlIIIllIIIlIII + llllllllllllIllIllIlIIIllIIIlIIl) / 24000.0f - 0.25f;
        if (lIIlIIIllIlllIIl(lIIlIIIllIllIlll(llllllllllllIllIllIlIIIllIIIIlll, 0.0f))) {
            ++llllllllllllIllIllIlIIIllIIIIlll;
        }
        if (lIIlIIIllIlllIlI(lIIlIIIllIlllIII(llllllllllllIllIllIlIIIllIIIIlll, 1.0f))) {
            --llllllllllllIllIllIlIIIllIIIIlll;
        }
        llllllllllllIllIllIlIIIllIIIIlll = 1.0f - (float)((Math.cos(llllllllllllIllIllIlIIIllIIIIlll * 3.141592653589793) + 1.0) / 2.0);
        llllllllllllIllIllIlIIIllIIIIlll += (llllllllllllIllIllIlIIIllIIIIlll - llllllllllllIllIllIlIIIllIIIIlll) / 3.0f;
        return llllllllllllIllIllIlIIIllIIIIlll;
    }
    
    public WorldChunkManager getWorldChunkManager() {
        return this.worldChunkMgr;
    }
    
    private static boolean lIIlIIIllIlllIIl(final int llllllllllllIllIllIlIIIlIIlIIlIl) {
        return llllllllllllIllIllIlIIIlIIlIIlIl < 0;
    }
    
    public WorldProvider() {
        this.lightBrightnessTable = new float[WorldProvider.llIlIIIlIIlIll[9]];
        this.colorsSunriseSunset = new float[WorldProvider.llIlIIIlIIlIll[5]];
    }
    
    public float[] calcSunriseSunsetColors(final float llllllllllllIllIllIlIIIlIlllIlIl, final float llllllllllllIllIllIlIIIlIlllIlII) {
        final float llllllllllllIllIllIlIIIlIlllIIll = 0.4f;
        final float llllllllllllIllIllIlIIIlIlllIIlI = MathHelper.cos(llllllllllllIllIllIlIIIlIlllIlIl * 3.1415927f * 2.0f) - 0.0f;
        final float llllllllllllIllIllIlIIIlIlllIIIl = -0.0f;
        if (lIIlIIIllIllllIl(lIIlIIIllIlllIll(llllllllllllIllIllIlIIIlIlllIIlI, llllllllllllIllIllIlIIIlIlllIIIl - llllllllllllIllIllIlIIIlIlllIIll)) && lIIlIIIllIlllllI(lIIlIIIllIllllII(llllllllllllIllIllIlIIIlIlllIIlI, llllllllllllIllIllIlIIIlIlllIIIl + llllllllllllIllIllIlIIIlIlllIIll))) {
            final float llllllllllllIllIllIlIIIlIlllIIII = (llllllllllllIllIllIlIIIlIlllIIlI - llllllllllllIllIllIlIIIlIlllIIIl) / llllllllllllIllIllIlIIIlIlllIIll * 0.5f + 0.5f;
            float llllllllllllIllIllIlIIIlIllIllll = 1.0f - (1.0f - MathHelper.sin(llllllllllllIllIllIlIIIlIlllIIII * 3.1415927f)) * 0.99f;
            llllllllllllIllIllIlIIIlIllIllll *= llllllllllllIllIllIlIIIlIllIllll;
            this.colorsSunriseSunset[WorldProvider.llIlIIIlIIlIll[1]] = llllllllllllIllIllIlIIIlIlllIIII * 0.3f + 0.7f;
            this.colorsSunriseSunset[WorldProvider.llIlIIIlIIlIll[2]] = llllllllllllIllIllIlIIIlIlllIIII * llllllllllllIllIllIlIIIlIlllIIII * 0.7f + 0.2f;
            this.colorsSunriseSunset[WorldProvider.llIlIIIlIIlIll[3]] = llllllllllllIllIllIlIIIlIlllIIII * llllllllllllIllIllIlIIIlIlllIIII * 0.0f + 0.2f;
            this.colorsSunriseSunset[WorldProvider.llIlIIIlIIlIll[4]] = llllllllllllIllIllIlIIIlIllIllll;
            return this.colorsSunriseSunset;
        }
        return null;
    }
    
    public Vec3 getFogColor(final float llllllllllllIllIllIlIIIlIlIllIll, final float llllllllllllIllIllIlIIIlIllIIIII) {
        float llllllllllllIllIllIlIIIlIlIlllll = MathHelper.cos(llllllllllllIllIllIlIIIlIlIllIll * 3.1415927f * 2.0f) * 2.0f + 0.5f;
        llllllllllllIllIllIlIIIlIlIlllll = MathHelper.clamp_float(llllllllllllIllIllIlIIIlIlIlllll, 0.0f, 1.0f);
        float llllllllllllIllIllIlIIIlIlIllllI = 0.7529412f;
        float llllllllllllIllIllIlIIIlIlIlllIl = 0.84705883f;
        float llllllllllllIllIllIlIIIlIlIlllII = 1.0f;
        llllllllllllIllIllIlIIIlIlIllllI *= llllllllllllIllIllIlIIIlIlIlllll * 0.94f + 0.06f;
        llllllllllllIllIllIlIIIlIlIlllIl *= llllllllllllIllIllIlIIIlIlIlllll * 0.94f + 0.06f;
        llllllllllllIllIllIlIIIlIlIlllII *= llllllllllllIllIllIlIIIlIlIlllll * 0.91f + 0.09f;
        return new Vec3(llllllllllllIllIllIlIIIlIlIllllI, llllllllllllIllIllIlIIIlIlIlllIl, llllllllllllIllIllIlIIIlIlIlllII);
    }
    
    private static boolean lIIlIIIllIllIlIl(final int llllllllllllIllIllIlIIIlIIllIIII, final int llllllllllllIllIllIlIIIlIIlIllll) {
        return llllllllllllIllIllIlIIIlIIllIIII > llllllllllllIllIllIlIIIlIIlIllll;
    }
    
    public boolean doesXZShowFog(final int llllllllllllIllIllIlIIIlIlIIlIII, final int llllllllllllIllIllIlIIIlIlIIIlll) {
        return WorldProvider.llIlIIIlIIlIll[1] != 0;
    }
    
    protected void registerWorldChunkManager() {
        final WorldType llllllllllllIllIllIlIIIllIlIIIII = this.worldObj.getWorldInfo().getTerrainType();
        if (lIIlIIIllIllIllI(llllllllllllIllIllIlIIIllIlIIIII, WorldType.FLAT)) {
            final FlatGeneratorInfo llllllllllllIllIllIlIIIllIIlllll = FlatGeneratorInfo.createFlatGeneratorFromString(this.worldObj.getWorldInfo().getGeneratorOptions());
            this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.getBiomeFromBiomeList(llllllllllllIllIllIlIIIllIIlllll.getBiome(), BiomeGenBase.field_180279_ad), 0.5f);
            "".length();
            if (((138 + 88 - 219 + 160 ^ 42 + 22 + 19 + 74) & ("   ".length() ^ (0x8F ^ 0xB6) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else if (lIIlIIIllIllIllI(llllllllllllIllIllIlIIIllIlIIIII, WorldType.DEBUG_WORLD)) {
            this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.plains, 0.0f);
            "".length();
            if ((169 + 78 - 214 + 150 ^ 114 + 63 - 104 + 105) == 0x0) {
                return;
            }
        }
        else {
            this.worldChunkMgr = new WorldChunkManager(this.worldObj);
        }
    }
    
    private static int lIIlIIIllIlllIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public boolean canRespawnHere() {
        return WorldProvider.llIlIIIlIIlIll[2] != 0;
    }
    
    public BlockPos getSpawnCoordinate() {
        return null;
    }
    
    private static boolean lIIlIIIllIlllIlI(final int llllllllllllIllIllIlIIIlIIlIIIIl) {
        return llllllllllllIllIllIlIIIlIIlIIIIl > 0;
    }
    
    private static boolean lIIlIIIllIllllIl(final int llllllllllllIllIllIlIIIlIIlIIlll) {
        return llllllllllllIllIllIlIIIlIIlIIlll >= 0;
    }
}
