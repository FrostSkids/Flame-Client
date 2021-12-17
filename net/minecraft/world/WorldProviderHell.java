// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world;

import net.minecraft.world.gen.ChunkProviderHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.biome.BiomeGenBase;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.border.WorldBorder;
import net.minecraft.util.Vec3;

public class WorldProviderHell extends WorldProvider
{
    private static final /* synthetic */ String[] lIIlIIIIIIIlII;
    private static final /* synthetic */ int[] lIIlIIIIIIIlIl;
    
    @Override
    public Vec3 getFogColor(final float lllllllllllllIIlllIlllllIlllIllI, final float lllllllllllllIIlllIlllllIlllIlIl) {
        return new Vec3(0.20000000298023224, 0.029999999329447746, 0.029999999329447746);
    }
    
    @Override
    public boolean isSurfaceWorld() {
        return WorldProviderHell.lIIlIIIIIIIlIl[2] != 0;
    }
    
    @Override
    public WorldBorder getWorldBorder() {
        return new WorldBorder() {
            @Override
            public double getCenterX() {
                return super.getCenterX() / 8.0;
            }
            
            @Override
            public double getCenterZ() {
                return super.getCenterZ() / 8.0;
            }
        };
    }
    
    @Override
    public String getInternalNameSuffix() {
        return WorldProviderHell.lIIlIIIIIIIlII[WorldProviderHell.lIIlIIIIIIIlIl[0]];
    }
    
    private static String llIIlIIIlllIIlI(final String lllllllllllllIIlllIlllllIlIIlllI, final String lllllllllllllIIlllIlllllIlIIllIl) {
        try {
            final SecretKeySpec lllllllllllllIIlllIlllllIlIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIlllllIlIIllIl.getBytes(StandardCharsets.UTF_8)), WorldProviderHell.lIIlIIIIIIIlIl[5]), "DES");
            final Cipher lllllllllllllIIlllIlllllIlIlIIII = Cipher.getInstance("DES");
            lllllllllllllIIlllIlllllIlIlIIII.init(WorldProviderHell.lIIlIIIIIIIlIl[4], lllllllllllllIIlllIlllllIlIlIIIl);
            return new String(lllllllllllllIIlllIlllllIlIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIlllllIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIlllllIlIIllll) {
            lllllllllllllIIlllIlllllIlIIllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String getDimensionName() {
        return WorldProviderHell.lIIlIIIIIIIlII[WorldProviderHell.lIIlIIIIIIIlIl[2]];
    }
    
    private static void llIIlIIIlllIIll() {
        (lIIlIIIIIIIlII = new String[WorldProviderHell.lIIlIIIIIIIlIl[4]])[WorldProviderHell.lIIlIIIIIIIlIl[2]] = llIIlIIIlllIIlI("6aLTLZh/Uxw=", "KcPfZ");
        WorldProviderHell.lIIlIIIIIIIlII[WorldProviderHell.lIIlIIIIIIIlIl[0]] = llIIlIIIlllIIlI("vJIj7hmQkRc=", "maMBw");
    }
    
    @Override
    public boolean canRespawnHere() {
        return WorldProviderHell.lIIlIIIIIIIlIl[2] != 0;
    }
    
    public void registerWorldChunkManager() {
        this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.hell, 0.0f);
        this.isHellWorld = (WorldProviderHell.lIIlIIIIIIIlIl[0] != 0);
        this.hasNoSky = (WorldProviderHell.lIIlIIIIIIIlIl[0] != 0);
        this.dimensionId = WorldProviderHell.lIIlIIIIIIIlIl[1];
    }
    
    @Override
    protected void generateLightBrightnessTable() {
        final float lllllllllllllIIlllIlllllIllIllll = 0.1f;
        int lllllllllllllIIlllIlllllIllIlllI = WorldProviderHell.lIIlIIIIIIIlIl[2];
        "".length();
        if (((0x2B ^ 0x6C) & ~(0xDD ^ 0x9A)) != ((0x57 ^ 0x7B) & ~(0xB4 ^ 0x98))) {
            return;
        }
        while (!llIIlIIIlllIlIl(lllllllllllllIIlllIlllllIllIlllI, WorldProviderHell.lIIlIIIIIIIlIl[3])) {
            final float lllllllllllllIIlllIlllllIllIllIl = 1.0f - lllllllllllllIIlllIlllllIllIlllI / 15.0f;
            this.lightBrightnessTable[lllllllllllllIIlllIlllllIllIlllI] = (1.0f - lllllllllllllIIlllIlllllIllIllIl) / (lllllllllllllIIlllIlllllIllIllIl * 3.0f + 1.0f) * (1.0f - lllllllllllllIIlllIlllllIllIllll) + lllllllllllllIIlllIlllllIllIllll;
            ++lllllllllllllIIlllIlllllIllIlllI;
        }
    }
    
    @Override
    public boolean canCoordinateBeSpawn(final int lllllllllllllIIlllIlllllIllIIIll, final int lllllllllllllIIlllIlllllIllIIIlI) {
        return WorldProviderHell.lIIlIIIIIIIlIl[2] != 0;
    }
    
    @Override
    public float calculateCelestialAngle(final long lllllllllllllIIlllIlllllIllIIIII, final float lllllllllllllIIlllIlllllIlIlllll) {
        return 0.5f;
    }
    
    static {
        llIIlIIIlllIlII();
        llIIlIIIlllIIll();
    }
    
    private static void llIIlIIIlllIlII() {
        (lIIlIIIIIIIlIl = new int[6])[0] = " ".length();
        WorldProviderHell.lIIlIIIIIIIlIl[1] = -" ".length();
        WorldProviderHell.lIIlIIIIIIIlIl[2] = ((89 + 111 - 182 + 162 ^ 4 + 109 + 38 + 24) & (0xD ^ 0x4B ^ (0xB ^ 0x56) ^ -" ".length()));
        WorldProviderHell.lIIlIIIIIIIlIl[3] = (48 + 1 + 4 + 94 ^ 26 + 8 + 57 + 65);
        WorldProviderHell.lIIlIIIIIIIlIl[4] = "  ".length();
        WorldProviderHell.lIIlIIIIIIIlIl[5] = (((0x54 ^ 0x13) & ~(0x20 ^ 0x67)) ^ (0x7A ^ 0x72));
    }
    
    @Override
    public boolean doesXZShowFog(final int lllllllllllllIIlllIlllllIlIlllII, final int lllllllllllllIIlllIlllllIlIllIll) {
        return WorldProviderHell.lIIlIIIIIIIlIl[0] != 0;
    }
    
    @Override
    public IChunkProvider createChunkGenerator() {
        return new ChunkProviderHell(this.worldObj, this.worldObj.getWorldInfo().isMapFeaturesEnabled(), this.worldObj.getSeed());
    }
    
    private static boolean llIIlIIIlllIlIl(final int lllllllllllllIIlllIlllllIlIIIllI, final int lllllllllllllIIlllIlllllIlIIIlIl) {
        return lllllllllllllIIlllIlllllIlIIIllI > lllllllllllllIIlllIlllllIlIIIlIl;
    }
}
