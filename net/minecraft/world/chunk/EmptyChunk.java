// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.chunk;

import net.minecraft.world.EnumSkyBlock;
import net.minecraft.init.Blocks;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.entity.Entity;
import com.google.common.base.Predicate;
import java.util.List;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class EmptyChunk extends Chunk
{
    private static final /* synthetic */ int[] llIlIIIIIllIlI;
    
    public EmptyChunk(final World llllllllllllIllIllIllIIlllIIIIII, final int llllllllllllIllIllIllIIllIlllIll, final int llllllllllllIllIllIllIIllIlllIlI) {
        super(llllllllllllIllIllIllIIlllIIIIII, llllllllllllIllIllIllIIllIlllIll, llllllllllllIllIllIllIIllIlllIlI);
    }
    
    private static void lIIlIIIlIIllllII() {
        (llIlIIIIIllIlI = new int[6])[0] = " ".length();
        EmptyChunk.llIlIIIIIllIlI[1] = (("   ".length() ^ (0x57 ^ 0x50)) & (0xD0 ^ 0xAC ^ (0x18 ^ 0x60) ^ -" ".length()));
        EmptyChunk.llIlIIIIIllIlI[2] = 14 + 131 - 51 + 60 + (0xB ^ 0x1A) - "   ".length() + (0xDF ^ 0x88);
        EmptyChunk.llIlIIIIIllIlI[3] = (0xFFFFBFC7 & 0x4C593E);
        EmptyChunk.llIlIIIIIllIlI[4] = (-(0xFFFF877D & 0x7DA7) & (-1 & 0x5AC5FF));
        EmptyChunk.llIlIIIIIllIlI[5] = (0xFFFFF3CF & 0x5FE7F);
    }
    
    @Override
    public <T extends Entity> void getEntitiesOfTypeWithinAAAB(final Class<? extends T> llllllllllllIllIllIllIIlIlllllIl, final AxisAlignedBB llllllllllllIllIllIllIIlIlllllII, final List<T> llllllllllllIllIllIllIIlIllllIll, final Predicate<? super T> llllllllllllIllIllIllIIlIllllIlI) {
    }
    
    @Override
    public void getEntitiesWithinAABBForEntity(final Entity llllllllllllIllIllIllIIllIIIIIlI, final AxisAlignedBB llllllllllllIllIllIllIIllIIIIIIl, final List<Entity> llllllllllllIllIllIllIIllIIIIIII, final Predicate<? super Entity> llllllllllllIllIllIllIIlIlllllll) {
    }
    
    @Override
    public Random getRandomWithSeed(final long llllllllllllIllIllIllIIlIlllIlII) {
        return new Random(this.getWorld().getSeed() + this.xPosition * this.xPosition * EmptyChunk.llIlIIIIIllIlI[3] + this.xPosition * EmptyChunk.llIlIIIIIllIlI[4] + this.zPosition * this.zPosition * 4392871L + this.zPosition * EmptyChunk.llIlIIIIIllIlI[5] ^ llllllllllllIllIllIllIIlIlllIlII);
    }
    
    private static boolean lIIlIIIlIIllllIl(final int llllllllllllIllIllIllIIlIllIlIll, final int llllllllllllIllIllIllIIlIllIlIlI) {
        return llllllllllllIllIllIllIIlIllIlIll == llllllllllllIllIllIllIIlIllIlIlI;
    }
    
    @Override
    public void generateSkylightMap() {
    }
    
    @Override
    public void onChunkUnload() {
    }
    
    @Override
    public boolean isEmpty() {
        return EmptyChunk.llIlIIIIIllIlI[0] != 0;
    }
    
    @Override
    public void addTileEntity(final BlockPos llllllllllllIllIllIllIIllIIIlIlI, final TileEntity llllllllllllIllIllIllIIllIIIlIIl) {
    }
    
    static {
        lIIlIIIlIIllllII();
    }
    
    @Override
    public boolean isAtLocation(final int llllllllllllIllIllIllIIllIllIIlI, final int llllllllllllIllIllIllIIllIllIlII) {
        if (lIIlIIIlIIllllIl(llllllllllllIllIllIllIIllIllIIlI, this.xPosition) && lIIlIIIlIIllllIl(llllllllllllIllIllIllIIllIllIlII, this.zPosition)) {
            return EmptyChunk.llIlIIIIIllIlI[0] != 0;
        }
        return EmptyChunk.llIlIIIIIllIlI[1] != 0;
    }
    
    @Override
    public void addEntity(final Entity llllllllllllIllIllIllIIllIIllIII) {
    }
    
    @Override
    public int getLightSubtracted(final BlockPos llllllllllllIllIllIllIIllIIllIll, final int llllllllllllIllIllIllIIllIIllIlI) {
        return EmptyChunk.llIlIIIIIllIlI[1];
    }
    
    public void generateHeightMap() {
    }
    
    @Override
    public boolean needsSaving(final boolean llllllllllllIllIllIllIIlIllllIII) {
        return EmptyChunk.llIlIIIIIllIlI[1] != 0;
    }
    
    @Override
    public boolean canSeeSky(final BlockPos llllllllllllIllIllIllIIllIIlIIIl) {
        return EmptyChunk.llIlIIIIIllIlI[1] != 0;
    }
    
    @Override
    public TileEntity getTileEntity(final BlockPos llllllllllllIllIllIllIIllIIIllll, final EnumCreateEntityType llllllllllllIllIllIllIIllIIIlllI) {
        return null;
    }
    
    @Override
    public Block getBlock(final BlockPos llllllllllllIllIllIllIIllIlIlIlI) {
        return Blocks.air;
    }
    
    @Override
    public void removeTileEntity(final BlockPos llllllllllllIllIllIllIIllIIIIlll) {
    }
    
    @Override
    public void removeEntity(final Entity llllllllllllIllIllIllIIllIIlIllI) {
    }
    
    @Override
    public void removeEntityAtIndex(final Entity llllllllllllIllIllIllIIllIIlIlII, final int llllllllllllIllIllIllIIllIIlIIll) {
    }
    
    @Override
    public int getBlockLightOpacity(final BlockPos llllllllllllIllIllIllIIllIlIlIII) {
        return EmptyChunk.llIlIIIIIllIlI[2];
    }
    
    @Override
    public boolean getAreLevelsEmpty(final int llllllllllllIllIllIllIIlIllIllll, final int llllllllllllIllIllIllIIlIllIlllI) {
        return EmptyChunk.llIlIIIIIllIlI[0] != 0;
    }
    
    @Override
    public int getBlockMetadata(final BlockPos llllllllllllIllIllIllIIllIlIIllI) {
        return EmptyChunk.llIlIIIIIllIlI[1];
    }
    
    @Override
    public void setChunkModified() {
    }
    
    @Override
    public void setLightFor(final EnumSkyBlock llllllllllllIllIllIllIIllIIlllll, final BlockPos llllllllllllIllIllIllIIllIIllllI, final int llllllllllllIllIllIllIIllIIlllIl) {
    }
    
    @Override
    public void addTileEntity(final TileEntity llllllllllllIllIllIllIIllIIIllII) {
    }
    
    @Override
    public void onChunkLoad() {
    }
    
    @Override
    public int getLightFor(final EnumSkyBlock llllllllllllIllIllIllIIllIlIIIIl, final BlockPos llllllllllllIllIllIllIIllIlIIIlI) {
        return llllllllllllIllIllIllIIllIlIIIIl.defaultLightValue;
    }
    
    @Override
    public int getHeightValue(final int llllllllllllIllIllIllIIllIlIllll, final int llllllllllllIllIllIllIIllIlIlllI) {
        return EmptyChunk.llIlIIIIIllIlI[1];
    }
}
