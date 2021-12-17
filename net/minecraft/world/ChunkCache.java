// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.material.Material;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.chunk.Chunk;

public class ChunkCache implements IBlockAccess
{
    private static final /* synthetic */ int[] lIIlIlllllIIII;
    protected /* synthetic */ int chunkX;
    protected /* synthetic */ boolean hasExtendedLevels;
    protected /* synthetic */ World worldObj;
    protected /* synthetic */ Chunk[][] chunkArray;
    protected /* synthetic */ int chunkZ;
    
    @Override
    public int getStrongPower(final BlockPos lllllllllllllIIlIllllllIlIIlIlIl, final EnumFacing lllllllllllllIIlIllllllIlIIlIIII) {
        final IBlockState lllllllllllllIIlIllllllIlIIlIIll = this.getBlockState(lllllllllllllIIlIllllllIlIIlIlIl);
        return lllllllllllllIIlIllllllIlIIlIIll.getBlock().getStrongPower(this, lllllllllllllIIlIllllllIlIIlIlIl, lllllllllllllIIlIllllllIlIIlIIll, lllllllllllllIIlIllllllIlIIlIIII);
    }
    
    private static void llIlIlIIlIIIIIl() {
        (lIIlIlllllIIII = new int[6])[0] = (0x26 ^ 0x9 ^ (0x6B ^ 0x40));
        ChunkCache.lIIlIlllllIIII[1] = " ".length();
        ChunkCache.lIIlIlllllIIII[2] = ((0xE9 ^ 0x95 ^ (0x65 ^ 0x5C)) & (0x5E ^ 0x5A ^ (0xE0 ^ 0xA1) ^ -" ".length()));
        ChunkCache.lIIlIlllllIIII[3] = (143 + 26 - 64 + 62 ^ 38 + 124 - 58 + 75);
        ChunkCache.lIIlIlllllIIII[4] = (-(0xFFFFFADD & 0x37B3) & (0xFFFFF790 & 0x3BFF));
        ChunkCache.lIIlIlllllIIII[5] = (0x43 ^ 0xB ^ (0x38 ^ 0x7F));
    }
    
    static {
        llIlIlIIlIIIIIl();
    }
    
    private static boolean llIlIlIIlIIIlll(final Object lllllllllllllIIlIllllllIIllllIll, final Object lllllllllllllIIlIllllllIIllllIlI) {
        return lllllllllllllIIlIllllllIIllllIll == lllllllllllllIIlIllllllIIllllIlI;
    }
    
    @Override
    public boolean extendedLevelsInChunkCache() {
        return this.hasExtendedLevels;
    }
    
    @Override
    public IBlockState getBlockState(final BlockPos lllllllllllllIIlIllllllIllIlIIll) {
        if (llIlIlIIlIIIllI(lllllllllllllIIlIllllllIllIlIIll.getY()) && llIlIlIIlIIIlIl(lllllllllllllIIlIllllllIllIlIIll.getY(), ChunkCache.lIIlIlllllIIII[4])) {
            final int lllllllllllllIIlIllllllIllIlIlll = (lllllllllllllIIlIllllllIllIlIIll.getX() >> ChunkCache.lIIlIlllllIIII[0]) - this.chunkX;
            final int lllllllllllllIIlIllllllIllIlIllI = (lllllllllllllIIlIllllllIllIlIIll.getZ() >> ChunkCache.lIIlIlllllIIII[0]) - this.chunkZ;
            if (llIlIlIIlIIIllI(lllllllllllllIIlIllllllIllIlIlll) && llIlIlIIlIIIlIl(lllllllllllllIIlIllllllIllIlIlll, this.chunkArray.length) && llIlIlIIlIIIllI(lllllllllllllIIlIllllllIllIlIllI) && llIlIlIIlIIIlIl(lllllllllllllIIlIllllllIllIlIllI, this.chunkArray[lllllllllllllIIlIllllllIllIlIlll].length)) {
                final Chunk lllllllllllllIIlIllllllIllIlIlIl = this.chunkArray[lllllllllllllIIlIllllllIllIlIlll][lllllllllllllIIlIllllllIllIlIllI];
                if (llIlIlIIlIIIIll(lllllllllllllIIlIllllllIllIlIlIl)) {
                    return lllllllllllllIIlIllllllIllIlIlIl.getBlockState(lllllllllllllIIlIllllllIllIlIIll);
                }
            }
        }
        return Blocks.air.getDefaultState();
    }
    
    private static boolean llIlIlIIlIIIllI(final int lllllllllllllIIlIllllllIIlllIlII) {
        return lllllllllllllIIlIllllllIIlllIlII >= 0;
    }
    
    @Override
    public BiomeGenBase getBiomeGenForCoords(final BlockPos lllllllllllllIIlIllllllIllIIlIlI) {
        return this.worldObj.getBiomeGenForCoords(lllllllllllllIIlIllllllIllIIlIlI);
    }
    
    private static boolean llIlIlIIlIIIlII(final int lllllllllllllIIlIllllllIIlllIllI) {
        return lllllllllllllIIlIllllllIIlllIllI == 0;
    }
    
    @Override
    public int getCombinedLight(final BlockPos lllllllllllllIIlIllllllIlllIIlll, final int lllllllllllllIIlIllllllIlllIIIIl) {
        final int lllllllllllllIIlIllllllIlllIIlIl = this.getLightForExt(EnumSkyBlock.SKY, lllllllllllllIIlIllllllIlllIIlll);
        int lllllllllllllIIlIllllllIlllIIlII = this.getLightForExt(EnumSkyBlock.BLOCK, lllllllllllllIIlIllllllIlllIIlll);
        if (llIlIlIIlIIIlIl(lllllllllllllIIlIllllllIlllIIlII, lllllllllllllIIlIllllllIlllIIIIl)) {
            lllllllllllllIIlIllllllIlllIIlII = lllllllllllllIIlIllllllIlllIIIIl;
        }
        return lllllllllllllIIlIllllllIlllIIlIl << ChunkCache.lIIlIlllllIIII[3] | lllllllllllllIIlIllllllIlllIIlII << ChunkCache.lIIlIlllllIIII[0];
    }
    
    private static boolean llIlIlIIlIIlIIl(final int lllllllllllllIIlIllllllIlIIIlIIl, final int lllllllllllllIIlIllllllIlIIIlIII) {
        return lllllllllllllIIlIllllllIlIIIlIIl >= lllllllllllllIIlIllllllIlIIIlIII;
    }
    
    @Override
    public WorldType getWorldType() {
        return this.worldObj.getWorldType();
    }
    
    public int getLightFor(final EnumSkyBlock lllllllllllllIIlIllllllIlIIllllI, final BlockPos lllllllllllllIIlIllllllIlIlIIIlI) {
        if (llIlIlIIlIIIllI(lllllllllllllIIlIllllllIlIlIIIlI.getY()) && llIlIlIIlIIIlIl(lllllllllllllIIlIllllllIlIlIIIlI.getY(), ChunkCache.lIIlIlllllIIII[4])) {
            final int lllllllllllllIIlIllllllIlIlIIIIl = (lllllllllllllIIlIllllllIlIlIIIlI.getX() >> ChunkCache.lIIlIlllllIIII[0]) - this.chunkX;
            final int lllllllllllllIIlIllllllIlIlIIIII = (lllllllllllllIIlIllllllIlIlIIIlI.getZ() >> ChunkCache.lIIlIlllllIIII[0]) - this.chunkZ;
            return this.chunkArray[lllllllllllllIIlIllllllIlIlIIIIl][lllllllllllllIIlIllllllIlIlIIIII].getLightFor(lllllllllllllIIlIllllllIlIIllllI, lllllllllllllIIlIllllllIlIlIIIlI);
        }
        return lllllllllllllIIlIllllllIlIIllllI.defaultLightValue;
    }
    
    public ChunkCache(final World lllllllllllllIIlIlllllllIIIIIlIl, final BlockPos lllllllllllllIIlIlllllllIIIIIlII, final BlockPos lllllllllllllIIlIlllllllIIIIllll, final int lllllllllllllIIlIlllllllIIIIlllI) {
        this.worldObj = lllllllllllllIIlIlllllllIIIIIlIl;
        this.chunkX = lllllllllllllIIlIlllllllIIIIIlII.getX() - lllllllllllllIIlIlllllllIIIIlllI >> ChunkCache.lIIlIlllllIIII[0];
        this.chunkZ = lllllllllllllIIlIlllllllIIIIIlII.getZ() - lllllllllllllIIlIlllllllIIIIlllI >> ChunkCache.lIIlIlllllIIII[0];
        final int lllllllllllllIIlIlllllllIIIIllIl = lllllllllllllIIlIlllllllIIIIllll.getX() + lllllllllllllIIlIlllllllIIIIlllI >> ChunkCache.lIIlIlllllIIII[0];
        final int lllllllllllllIIlIlllllllIIIIllII = lllllllllllllIIlIlllllllIIIIllll.getZ() + lllllllllllllIIlIlllllllIIIIlllI >> ChunkCache.lIIlIlllllIIII[0];
        this.chunkArray = new Chunk[lllllllllllllIIlIlllllllIIIIllIl - this.chunkX + ChunkCache.lIIlIlllllIIII[1]][lllllllllllllIIlIlllllllIIIIllII - this.chunkZ + ChunkCache.lIIlIlllllIIII[1]];
        this.hasExtendedLevels = (ChunkCache.lIIlIlllllIIII[1] != 0);
        int lllllllllllllIIlIlllllllIIIIlIll = this.chunkX;
        "".length();
        if ("   ".length() <= " ".length()) {
            throw null;
        }
        while (!llIlIlIIlIIIIlI(lllllllllllllIIlIlllllllIIIIlIll, lllllllllllllIIlIlllllllIIIIllIl)) {
            int lllllllllllllIIlIlllllllIIIIlIlI = this.chunkZ;
            "".length();
            if ("  ".length() <= ((0x3D ^ 0x27) & ~(0x95 ^ 0x8F))) {
                throw null;
            }
            while (!llIlIlIIlIIIIlI(lllllllllllllIIlIlllllllIIIIlIlI, lllllllllllllIIlIlllllllIIIIllII)) {
                this.chunkArray[lllllllllllllIIlIlllllllIIIIlIll - this.chunkX][lllllllllllllIIlIlllllllIIIIlIlI - this.chunkZ] = lllllllllllllIIlIlllllllIIIIIlIl.getChunkFromChunkCoords(lllllllllllllIIlIlllllllIIIIlIll, lllllllllllllIIlIlllllllIIIIlIlI);
                ++lllllllllllllIIlIlllllllIIIIlIlI;
            }
            ++lllllllllllllIIlIlllllllIIIIlIll;
        }
        int lllllllllllllIIlIlllllllIIIIlIIl = lllllllllllllIIlIlllllllIIIIIlII.getX() >> ChunkCache.lIIlIlllllIIII[0];
        "".length();
        if (-"   ".length() >= 0) {
            throw null;
        }
        while (!llIlIlIIlIIIIlI(lllllllllllllIIlIlllllllIIIIlIIl, lllllllllllllIIlIlllllllIIIIllll.getX() >> ChunkCache.lIIlIlllllIIII[0])) {
            int lllllllllllllIIlIlllllllIIIIlIII = lllllllllllllIIlIlllllllIIIIIlII.getZ() >> ChunkCache.lIIlIlllllIIII[0];
            "".length();
            if ((0x35 ^ 0x31) < ((0x54 ^ 0x19) & ~(0x63 ^ 0x2E))) {
                throw null;
            }
            while (!llIlIlIIlIIIIlI(lllllllllllllIIlIlllllllIIIIlIII, lllllllllllllIIlIlllllllIIIIllll.getZ() >> ChunkCache.lIIlIlllllIIII[0])) {
                final Chunk lllllllllllllIIlIlllllllIIIIIlll = this.chunkArray[lllllllllllllIIlIlllllllIIIIlIIl - this.chunkX][lllllllllllllIIlIlllllllIIIIlIII - this.chunkZ];
                if (llIlIlIIlIIIIll(lllllllllllllIIlIlllllllIIIIIlll) && llIlIlIIlIIIlII(lllllllllllllIIlIlllllllIIIIIlll.getAreLevelsEmpty(lllllllllllllIIlIlllllllIIIIIlII.getY(), lllllllllllllIIlIlllllllIIIIllll.getY()) ? 1 : 0)) {
                    this.hasExtendedLevels = (ChunkCache.lIIlIlllllIIII[2] != 0);
                }
                ++lllllllllllllIIlIlllllllIIIIlIII;
            }
            ++lllllllllllllIIlIlllllllIIIIlIIl;
        }
    }
    
    private static boolean llIlIlIIlIIIIll(final Object lllllllllllllIIlIllllllIIllllllI) {
        return lllllllllllllIIlIllllllIIllllllI != null;
    }
    
    private int getLightForExt(final EnumSkyBlock lllllllllllllIIlIllllllIlIllIlll, final BlockPos lllllllllllllIIlIllllllIlIllIllI) {
        if (llIlIlIIlIIIlll(lllllllllllllIIlIllllllIlIllIlll, EnumSkyBlock.SKY) && llIlIlIIlIIlIII(this.worldObj.provider.getHasNoSky() ? 1 : 0)) {
            return ChunkCache.lIIlIlllllIIII[2];
        }
        if (!llIlIlIIlIIIllI(lllllllllllllIIlIllllllIlIllIllI.getY()) || !llIlIlIIlIIIlIl(lllllllllllllIIlIllllllIlIllIllI.getY(), ChunkCache.lIIlIlllllIIII[4])) {
            return lllllllllllllIIlIllllllIlIllIlll.defaultLightValue;
        }
        if (!llIlIlIIlIIlIII(this.getBlockState(lllllllllllllIIlIllllllIlIllIllI).getBlock().getUseNeighborBrightness() ? 1 : 0)) {
            final int lllllllllllllIIlIllllllIlIlllIlI = (lllllllllllllIIlIllllllIlIllIllI.getX() >> ChunkCache.lIIlIlllllIIII[0]) - this.chunkX;
            final int lllllllllllllIIlIllllllIlIlllIIl = (lllllllllllllIIlIllllllIlIllIllI.getZ() >> ChunkCache.lIIlIlllllIIII[0]) - this.chunkZ;
            return this.chunkArray[lllllllllllllIIlIllllllIlIlllIlI][lllllllllllllIIlIllllllIlIlllIIl].getLightFor(lllllllllllllIIlIllllllIlIllIlll, lllllllllllllIIlIllllllIlIllIllI);
        }
        int lllllllllllllIIlIllllllIlIllllIl = ChunkCache.lIIlIlllllIIII[2];
        final char lllllllllllllIIlIllllllIlIllIIIl;
        final short lllllllllllllIIlIllllllIlIllIIlI = (short)((EnumFacing[])(Object)(lllllllllllllIIlIllllllIlIllIIIl = (char)(Object)EnumFacing.values())).length;
        long lllllllllllllIIlIllllllIlIllIIll = ChunkCache.lIIlIlllllIIII[2];
        "".length();
        if (null != null) {
            return (0xD8 ^ 0x9F) & ~(0xD0 ^ 0x97);
        }
        while (!llIlIlIIlIIlIIl((int)lllllllllllllIIlIllllllIlIllIIll, lllllllllllllIIlIllllllIlIllIIlI)) {
            final EnumFacing lllllllllllllIIlIllllllIlIllllII = lllllllllllllIIlIllllllIlIllIIIl[lllllllllllllIIlIllllllIlIllIIll];
            final int lllllllllllllIIlIllllllIlIlllIll = this.getLightFor(lllllllllllllIIlIllllllIlIllIlll, lllllllllllllIIlIllllllIlIllIllI.offset(lllllllllllllIIlIllllllIlIllllII));
            if (llIlIlIIlIIIIlI(lllllllllllllIIlIllllllIlIlllIll, lllllllllllllIIlIllllllIlIllllIl)) {
                lllllllllllllIIlIllllllIlIllllIl = lllllllllllllIIlIllllllIlIlllIll;
            }
            if (llIlIlIIlIIlIIl(lllllllllllllIIlIllllllIlIllllIl, ChunkCache.lIIlIlllllIIII[5])) {
                return lllllllllllllIIlIllllllIlIllllIl;
            }
            ++lllllllllllllIIlIllllllIlIllIIll;
        }
        return lllllllllllllIIlIllllllIlIllllIl;
    }
    
    @Override
    public boolean isAirBlock(final BlockPos lllllllllllllIIlIllllllIlIlIlIlI) {
        if (llIlIlIIlIIIlll(this.getBlockState(lllllllllllllIIlIllllllIlIlIlIlI).getBlock().getMaterial(), Material.air)) {
            return ChunkCache.lIIlIlllllIIII[1] != 0;
        }
        return ChunkCache.lIIlIlllllIIII[2] != 0;
    }
    
    @Override
    public TileEntity getTileEntity(final BlockPos lllllllllllllIIlIllllllIllllIlII) {
        final int lllllllllllllIIlIllllllIllllIIll = (lllllllllllllIIlIllllllIllllIlII.getX() >> ChunkCache.lIIlIlllllIIII[0]) - this.chunkX;
        final int lllllllllllllIIlIllllllIllllIIlI = (lllllllllllllIIlIllllllIllllIlII.getZ() >> ChunkCache.lIIlIlllllIIII[0]) - this.chunkZ;
        return this.chunkArray[lllllllllllllIIlIllllllIllllIIll][lllllllllllllIIlIllllllIllllIIlI].getTileEntity(lllllllllllllIIlIllllllIllllIlII, Chunk.EnumCreateEntityType.IMMEDIATE);
    }
    
    private static boolean llIlIlIIlIIlIII(final int lllllllllllllIIlIllllllIIllllIII) {
        return lllllllllllllIIlIllllllIIllllIII != 0;
    }
    
    private static boolean llIlIlIIlIIIIlI(final int lllllllllllllIIlIllllllIlIIIIIIl, final int lllllllllllllIIlIllllllIlIIIIIII) {
        return lllllllllllllIIlIllllllIlIIIIIIl > lllllllllllllIIlIllllllIlIIIIIII;
    }
    
    private static boolean llIlIlIIlIIIlIl(final int lllllllllllllIIlIllllllIlIIIIlIl, final int lllllllllllllIIlIllllllIlIIIIlII) {
        return lllllllllllllIIlIllllllIlIIIIlIl < lllllllllllllIIlIllllllIlIIIIlII;
    }
}
