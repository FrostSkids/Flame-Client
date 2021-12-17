// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world;

import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.biome.BiomeGenBase;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.gen.ChunkProviderEnd;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.util.BlockPos;

public class WorldProviderEnd extends WorldProvider
{
    private static final /* synthetic */ int[] lIIllllllIlIIl;
    private static final /* synthetic */ String[] lIIllllllIlIII;
    
    @Override
    public float getCloudHeight() {
        return 8.0f;
    }
    
    @Override
    public float calculateCelestialAngle(final long lllllllllllllIIlIIlIIIIIlIIIlIll, final float lllllllllllllIIlIIlIIIIIlIIIlIlI) {
        return 0.0f;
    }
    
    private static void llIlllllIIIlIlI() {
        (lIIllllllIlIII = new String[WorldProviderEnd.lIIllllllIlIIl[8]])[WorldProviderEnd.lIIllllllIlIIl[5]] = llIlllllIIIlIIl("tukQVgB5zao=", "bDWrK");
        WorldProviderEnd.lIIllllllIlIII[WorldProviderEnd.lIIllllllIlIIl[0]] = llIlllllIIIlIIl("ZJ3jRLfQHfY=", "KjoLn");
    }
    
    @Override
    public boolean canRespawnHere() {
        return WorldProviderEnd.lIIllllllIlIIl[5] != 0;
    }
    
    @Override
    public BlockPos getSpawnCoordinate() {
        return new BlockPos(WorldProviderEnd.lIIllllllIlIIl[6], WorldProviderEnd.lIIllllllIlIIl[7], WorldProviderEnd.lIIllllllIlIIl[5]);
    }
    
    @Override
    public boolean doesXZShowFog(final int lllllllllllllIIlIIlIIIIIIllIIIlI, final int lllllllllllllIIlIIlIIIIIIllIIIIl) {
        return WorldProviderEnd.lIIllllllIlIIl[0] != 0;
    }
    
    @Override
    public IChunkProvider createChunkGenerator() {
        return new ChunkProviderEnd(this.worldObj, this.worldObj.getSeed());
    }
    
    @Override
    public String getInternalNameSuffix() {
        return WorldProviderEnd.lIIllllllIlIII[WorldProviderEnd.lIIllllllIlIIl[0]];
    }
    
    @Override
    public float[] calcSunriseSunsetColors(final float lllllllllllllIIlIIlIIIIIlIIIlIII, final float lllllllllllllIIlIIlIIIIIlIIIIlll) {
        return null;
    }
    
    @Override
    public Vec3 getFogColor(final float lllllllllllllIIlIIlIIIIIIlllllll, final float lllllllllllllIIlIIlIIIIIIllllllI) {
        final int lllllllllllllIIlIIlIIIIIIlllllIl = WorldProviderEnd.lIIllllllIlIIl[1];
        float lllllllllllllIIlIIlIIIIIIlllllII = MathHelper.cos(lllllllllllllIIlIIlIIIIIIlllllll * 3.1415927f * 2.0f) * 2.0f + 0.5f;
        lllllllllllllIIlIIlIIIIIIlllllII = MathHelper.clamp_float(lllllllllllllIIlIIlIIIIIIlllllII, 0.0f, 1.0f);
        float lllllllllllllIIlIIlIIIIIIllllIll = (lllllllllllllIIlIIlIIIIIIlllllIl >> WorldProviderEnd.lIIllllllIlIIl[2] & WorldProviderEnd.lIIllllllIlIIl[3]) / 255.0f;
        float lllllllllllllIIlIIlIIIIIIllllIlI = (lllllllllllllIIlIIlIIIIIIlllllIl >> WorldProviderEnd.lIIllllllIlIIl[4] & WorldProviderEnd.lIIllllllIlIIl[3]) / 255.0f;
        float lllllllllllllIIlIIlIIIIIIllllIIl = (lllllllllllllIIlIIlIIIIIIlllllIl & WorldProviderEnd.lIIllllllIlIIl[3]) / 255.0f;
        lllllllllllllIIlIIlIIIIIIllllIll *= lllllllllllllIIlIIlIIIIIIlllllII * 0.0f + 0.15f;
        lllllllllllllIIlIIlIIIIIIllllIlI *= lllllllllllllIIlIIlIIIIIIlllllII * 0.0f + 0.15f;
        lllllllllllllIIlIIlIIIIIIllllIIl *= lllllllllllllIIlIIlIIIIIIlllllII * 0.0f + 0.15f;
        return new Vec3(lllllllllllllIIlIIlIIIIIIllllIll, lllllllllllllIIlIIlIIIIIIllllIlI, lllllllllllllIIlIIlIIIIIIllllIIl);
    }
    
    @Override
    public boolean canCoordinateBeSpawn(final int lllllllllllllIIlIIlIIIIIIllIIlll, final int lllllllllllllIIlIIlIIIIIIllIlIIl) {
        return this.worldObj.getGroundAboveSeaLevel(new BlockPos(lllllllllllllIIlIIlIIIIIIllIIlll, WorldProviderEnd.lIIllllllIlIIl[5], lllllllllllllIIlIIlIIIIIIllIlIIl)).getMaterial().blocksMovement();
    }
    
    @Override
    public String getDimensionName() {
        return WorldProviderEnd.lIIllllllIlIII[WorldProviderEnd.lIIllllllIlIIl[5]];
    }
    
    static {
        llIlllllIIIlIll();
        llIlllllIIIlIlI();
    }
    
    private static String llIlllllIIIlIIl(final String lllllllllllllIIlIIlIIIIIIlIlIlIl, final String lllllllllllllIIlIIlIIIIIIlIlIllI) {
        try {
            final SecretKeySpec lllllllllllllIIlIIlIIIIIIlIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIIIIIIlIlIllI.getBytes(StandardCharsets.UTF_8)), WorldProviderEnd.lIIllllllIlIIl[4]), "DES");
            final Cipher lllllllllllllIIlIIlIIIIIIlIllIIl = Cipher.getInstance("DES");
            lllllllllllllIIlIIlIIIIIIlIllIIl.init(WorldProviderEnd.lIIllllllIlIIl[8], lllllllllllllIIlIIlIIIIIIlIllIlI);
            return new String(lllllllllllllIIlIIlIIIIIIlIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIIIIIIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIlIIIIIIlIllIII) {
            lllllllllllllIIlIIlIIIIIIlIllIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getAverageGroundLevel() {
        return WorldProviderEnd.lIIllllllIlIIl[7];
    }
    
    public void registerWorldChunkManager() {
        this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.sky, 0.0f);
        this.dimensionId = WorldProviderEnd.lIIllllllIlIIl[0];
        this.hasNoSky = (WorldProviderEnd.lIIllllllIlIIl[0] != 0);
    }
    
    private static void llIlllllIIIlIll() {
        (lIIllllllIlIIl = new int[9])[0] = " ".length();
        WorldProviderEnd.lIIllllllIlIIl[1] = (0xFFFFE5E8 & 0xA09AB7);
        WorldProviderEnd.lIIllllllIlIIl[2] = (0x3F ^ 0x2F);
        WorldProviderEnd.lIIllllllIlIIl[3] = 200 + 113 - 121 + 63;
        WorldProviderEnd.lIIllllllIlIIl[4] = (0x2 ^ 0xA);
        WorldProviderEnd.lIIllllllIlIIl[5] = ((16 + 18 + 46 + 63 ^ 75 + 92 - 123 + 94) & (0xE9 ^ 0x9A ^ (0x31 ^ 0x47) ^ -" ".length()));
        WorldProviderEnd.lIIllllllIlIIl[6] = (0xAF ^ 0xBA ^ (0xB1 ^ 0xC0));
        WorldProviderEnd.lIIllllllIlIIl[7] = (0x39 ^ 0xB);
        WorldProviderEnd.lIIllllllIlIIl[8] = "  ".length();
    }
    
    @Override
    public boolean isSurfaceWorld() {
        return WorldProviderEnd.lIIllllllIlIIl[5] != 0;
    }
    
    @Override
    public boolean isSkyColored() {
        return WorldProviderEnd.lIIllllllIlIIl[5] != 0;
    }
}
