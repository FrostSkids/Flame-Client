// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import net.minecraft.init.Blocks;
import java.util.Arrays;
import net.minecraft.util.Vec3i;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.ChunkCache;

public class RegionRenderCache extends ChunkCache
{
    private static final /* synthetic */ IBlockState DEFAULT_STATE;
    private /* synthetic */ int[] combinedLights;
    private final /* synthetic */ BlockPos position;
    private static final /* synthetic */ int[] llIllllIllllII;
    private /* synthetic */ IBlockState[] blockStates;
    
    @Override
    public TileEntity getTileEntity(final BlockPos llllllllllllIllIIIllIIlllIlIIIII) {
        final int llllllllllllIllIIIllIIlllIlIIIll = (llllllllllllIllIIIllIIlllIlIIIII.getX() >> RegionRenderCache.llIllllIllllII[2]) - this.chunkX;
        final int llllllllllllIllIIIllIIlllIlIIIlI = (llllllllllllIllIIIllIIlllIlIIIII.getZ() >> RegionRenderCache.llIllllIllllII[2]) - this.chunkZ;
        return this.chunkArray[llllllllllllIllIIIllIIlllIlIIIll][llllllllllllIllIIIllIIlllIlIIIlI].getTileEntity(llllllllllllIllIIIllIIlllIlIIIII, Chunk.EnumCreateEntityType.QUEUED);
    }
    
    @Override
    public int getCombinedLight(final BlockPos llllllllllllIllIIIllIIlllIIlIIlI, final int llllllllllllIllIIIllIIlllIIlIIIl) {
        final int llllllllllllIllIIIllIIlllIIlIlIl = this.getPositionIndex(llllllllllllIllIIIllIIlllIIlIIlI);
        int llllllllllllIllIIIllIIlllIIlIlII = this.combinedLights[llllllllllllIllIIIllIIlllIIlIlIl];
        if (lIIllIlIlllIIlII(llllllllllllIllIIIllIIlllIIlIlII, RegionRenderCache.llIllllIllllII[1])) {
            llllllllllllIllIIIllIIlllIIlIlII = super.getCombinedLight(llllllllllllIllIIIllIIlllIIlIIlI, llllllllllllIllIIIllIIlllIIlIIIl);
            this.combinedLights[llllllllllllIllIIIllIIlllIIlIlIl] = llllllllllllIllIIIllIIlllIIlIlII;
        }
        return llllllllllllIllIIIllIIlllIIlIlII;
    }
    
    private static void lIIllIlIlllIIIll() {
        (llIllllIllllII = new int[6])[0] = (0xFFFFFFC3 & 0x1F7C);
        RegionRenderCache.llIllllIllllII[1] = -" ".length();
        RegionRenderCache.llIllllIllllII[2] = (121 + 135 - 245 + 125 ^ 105 + 95 - 105 + 45);
        RegionRenderCache.llIllllIllllII[3] = (-(0xFFFFF4EB & 0x6BF7) & (0xFFFFFBFF & 0x65E2));
        RegionRenderCache.llIllllIllllII[4] = (-(0xFFFFADDE & 0x7271) & (0xFFFFADDF & 0x73FF));
        RegionRenderCache.llIllllIllllII[5] = (147 + 157 - 245 + 155 ^ 134 + 68 - 78 + 70);
    }
    
    public RegionRenderCache(final World llllllllllllIllIIIllIIlllIlIlllI, final BlockPos llllllllllllIllIIIllIIlllIlIllIl, final BlockPos llllllllllllIllIIIllIIlllIlIllII, final int llllllllllllIllIIIllIIlllIllIIIl) {
        super(llllllllllllIllIIIllIIlllIlIlllI, llllllllllllIllIIIllIIlllIlIllIl, llllllllllllIllIIIllIIlllIlIllII, llllllllllllIllIIIllIIlllIllIIIl);
        this.position = llllllllllllIllIIIllIIlllIlIllIl.subtract(new Vec3i(llllllllllllIllIIIllIIlllIllIIIl, llllllllllllIllIIIllIIlllIllIIIl, llllllllllllIllIIIllIIlllIllIIIl));
        final int llllllllllllIllIIIllIIlllIllIIII = RegionRenderCache.llIllllIllllII[0];
        this.combinedLights = new int[RegionRenderCache.llIllllIllllII[0]];
        Arrays.fill(this.combinedLights, RegionRenderCache.llIllllIllllII[1]);
        this.blockStates = new IBlockState[RegionRenderCache.llIllllIllllII[0]];
    }
    
    @Override
    public IBlockState getBlockState(final BlockPos llllllllllllIllIIIllIIlllIIIlIIl) {
        final int llllllllllllIllIIIllIIlllIIIlIII = this.getPositionIndex(llllllllllllIllIIIllIIlllIIIlIIl);
        IBlockState llllllllllllIllIIIllIIlllIIIIlll = this.blockStates[llllllllllllIllIIIllIIlllIIIlIII];
        if (lIIllIlIlllIIlIl(llllllllllllIllIIIllIIlllIIIIlll)) {
            llllllllllllIllIIIllIIlllIIIIlll = this.getBlockStateRaw(llllllllllllIllIIIllIIlllIIIlIIl);
            this.blockStates[llllllllllllIllIIIllIIlllIIIlIII] = llllllllllllIllIIIllIIlllIIIIlll;
        }
        return llllllllllllIllIIIllIIlllIIIIlll;
    }
    
    private static boolean lIIllIlIlllIIlll(final int llllllllllllIllIIIllIIllIllIIIIl, final int llllllllllllIllIIIllIIllIllIIIII) {
        return llllllllllllIllIIIllIIllIllIIIIl < llllllllllllIllIIIllIIllIllIIIII;
    }
    
    private static boolean lIIllIlIlllIIlII(final int llllllllllllIllIIIllIIllIllIIlIl, final int llllllllllllIllIIIllIIllIllIIlII) {
        return llllllllllllIllIIIllIIllIllIIlIl == llllllllllllIllIIIllIIllIllIIlII;
    }
    
    private static boolean lIIllIlIlllIIlIl(final Object llllllllllllIllIIIllIIllIlIllllI) {
        return llllllllllllIllIIIllIIllIlIllllI == null;
    }
    
    private static boolean lIIllIlIlllIIllI(final int llllllllllllIllIIIllIIllIlIlllII) {
        return llllllllllllIllIIIllIIllIlIlllII >= 0;
    }
    
    static {
        lIIllIlIlllIIIll();
        DEFAULT_STATE = Blocks.air.getDefaultState();
    }
    
    private IBlockState getBlockStateRaw(final BlockPos llllllllllllIllIIIllIIllIlllllIl) {
        if (lIIllIlIlllIIllI(llllllllllllIllIIIllIIllIlllllIl.getY()) && lIIllIlIlllIIlll(llllllllllllIllIIIllIIllIlllllIl.getY(), RegionRenderCache.llIllllIllllII[3])) {
            final int llllllllllllIllIIIllIIllIlllllII = (llllllllllllIllIIIllIIllIlllllIl.getX() >> RegionRenderCache.llIllllIllllII[2]) - this.chunkX;
            final int llllllllllllIllIIIllIIllIllllIll = (llllllllllllIllIIIllIIllIlllllIl.getZ() >> RegionRenderCache.llIllllIllllII[2]) - this.chunkZ;
            return this.chunkArray[llllllllllllIllIIIllIIllIlllllII][llllllllllllIllIIIllIIllIllllIll].getBlockState(llllllllllllIllIIIllIIllIlllllIl);
        }
        return RegionRenderCache.DEFAULT_STATE;
    }
    
    private int getPositionIndex(final BlockPos llllllllllllIllIIIllIIllIlllIIII) {
        final int llllllllllllIllIIIllIIllIllIllll = llllllllllllIllIIIllIIllIlllIIII.getX() - this.position.getX();
        final int llllllllllllIllIIIllIIllIllIlllI = llllllllllllIllIIIllIIllIlllIIII.getY() - this.position.getY();
        final int llllllllllllIllIIIllIIllIllIllIl = llllllllllllIllIIIllIIllIlllIIII.getZ() - this.position.getZ();
        return llllllllllllIllIIIllIIllIllIllll * RegionRenderCache.llIllllIllllII[4] + llllllllllllIllIIIllIIllIllIllIl * RegionRenderCache.llIllllIllllII[5] + llllllllllllIllIIIllIIllIllIlllI;
    }
}
