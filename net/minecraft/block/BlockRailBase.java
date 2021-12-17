// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Iterator;
import com.google.common.collect.Lists;
import net.minecraft.util.EnumFacing;
import java.util.List;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.init.Blocks;
import net.minecraft.block.properties.IProperty;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public abstract class BlockRailBase extends Block
{
    private static final /* synthetic */ int[] lllllIllIlIII;
    protected final /* synthetic */ boolean isPowered;
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World lllllllllllllIlIlIllIIllIlIlIIll, final BlockPos lllllllllllllIlIlIllIIllIlIlIIlI, final IBlockState lllllllllllllIlIlIllIIllIlIlIIIl) {
        return null;
    }
    
    protected void onNeighborChangedInternal(final World lllllllllllllIlIlIllIIllIIIIIlll, final BlockPos lllllllllllllIlIlIllIIllIIIIIllI, final IBlockState lllllllllllllIlIlIllIIllIIIIIlIl, final Block lllllllllllllIlIlIllIIllIIIIIlII) {
    }
    
    private static void lIlIlllIlllllIl() {
        (lllllIllIlIII = new int[2])[0] = ((0xB6 ^ 0x84 ^ (0x6E ^ 0x14)) & (73 + 77 - 83 + 69 ^ 52 + 33 + 20 + 87 ^ -" ".length()));
        BlockRailBase.lllllIllIlIII[1] = " ".length();
    }
    
    @Override
    public boolean isFullCube() {
        return BlockRailBase.lllllIllIlIII[0] != 0;
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess lllllllllllllIlIlIllIIllIIlllIlI, final BlockPos lllllllllllllIlIlIllIIllIIlllIIl) {
        final IBlockState lllllllllllllIlIlIllIIllIIlllIII = lllllllllllllIlIlIllIIllIIlllIlI.getBlockState(lllllllllllllIlIlIllIIllIIlllIIl);
        EnumRailDirection enumRailDirection;
        if (lIlIlllIlllllll(lllllllllllllIlIlIllIIllIIlllIII.getBlock(), this)) {
            enumRailDirection = lllllllllllllIlIlIllIIllIIlllIII.getValue(this.getShapeProperty());
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            enumRailDirection = null;
        }
        final EnumRailDirection lllllllllllllIlIlIllIIllIIllIlll = enumRailDirection;
        if (lIlIllllIIIIIII(lllllllllllllIlIlIllIIllIIllIlll) && lIlIllllIIIIIIl(lllllllllllllIlIlIllIIllIIllIlll.isAscending() ? 1 : 0)) {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.625f, 1.0f);
            "".length();
            if ((0x77 ^ 0x73) < 0) {
                return;
            }
        }
        else {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
        }
    }
    
    @Override
    public void onNeighborBlockChange(final World lllllllllllllIlIlIllIIllIIIIlllI, final BlockPos lllllllllllllIlIlIllIIllIIIlIlII, final IBlockState lllllllllllllIlIlIllIIllIIIIllII, final Block lllllllllllllIlIlIllIIllIIIlIIlI) {
        if (lIlIllllIIIIIlI(lllllllllllllIlIlIllIIllIIIIlllI.isRemote ? 1 : 0)) {
            final EnumRailDirection lllllllllllllIlIlIllIIllIIIlIIIl = lllllllllllllIlIlIllIIllIIIIllII.getValue(this.getShapeProperty());
            boolean lllllllllllllIlIlIllIIllIIIlIIII = BlockRailBase.lllllIllIlIII[0] != 0;
            if (lIlIllllIIIIIlI(World.doesBlockHaveSolidTopSurface(lllllllllllllIlIlIllIIllIIIIlllI, lllllllllllllIlIlIllIIllIIIlIlII.down()) ? 1 : 0)) {
                lllllllllllllIlIlIllIIllIIIlIIII = (BlockRailBase.lllllIllIlIII[1] != 0);
            }
            if (lIlIlllIlllllll(lllllllllllllIlIlIllIIllIIIlIIIl, EnumRailDirection.ASCENDING_EAST) && lIlIllllIIIIIlI(World.doesBlockHaveSolidTopSurface(lllllllllllllIlIlIllIIllIIIIlllI, lllllllllllllIlIlIllIIllIIIlIlII.east()) ? 1 : 0)) {
                lllllllllllllIlIlIllIIllIIIlIIII = (BlockRailBase.lllllIllIlIII[1] != 0);
                "".length();
                if (-" ".length() > 0) {
                    return;
                }
            }
            else if (lIlIlllIlllllll(lllllllllllllIlIlIllIIllIIIlIIIl, EnumRailDirection.ASCENDING_WEST) && lIlIllllIIIIIlI(World.doesBlockHaveSolidTopSurface(lllllllllllllIlIlIllIIllIIIIlllI, lllllllllllllIlIlIllIIllIIIlIlII.west()) ? 1 : 0)) {
                lllllllllllllIlIlIllIIllIIIlIIII = (BlockRailBase.lllllIllIlIII[1] != 0);
                "".length();
                if (((120 + 173 - 101 + 11 ^ 82 + 117 - 142 + 79) & (0x2 ^ 0x3E ^ 33 + 63 + 1 + 30 ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else if (lIlIlllIlllllll(lllllllllllllIlIlIllIIllIIIlIIIl, EnumRailDirection.ASCENDING_NORTH) && lIlIllllIIIIIlI(World.doesBlockHaveSolidTopSurface(lllllllllllllIlIlIllIIllIIIIlllI, lllllllllllllIlIlIllIIllIIIlIlII.north()) ? 1 : 0)) {
                lllllllllllllIlIlIllIIllIIIlIIII = (BlockRailBase.lllllIllIlIII[1] != 0);
                "".length();
                if (((0x5B ^ 0x43) & ~(0x87 ^ 0x9F)) != 0x0) {
                    return;
                }
            }
            else if (lIlIlllIlllllll(lllllllllllllIlIlIllIIllIIIlIIIl, EnumRailDirection.ASCENDING_SOUTH) && lIlIllllIIIIIlI(World.doesBlockHaveSolidTopSurface(lllllllllllllIlIlIllIIllIIIIlllI, lllllllllllllIlIlIllIIllIIIlIlII.south()) ? 1 : 0)) {
                lllllllllllllIlIlIllIIllIIIlIIII = (BlockRailBase.lllllIllIlIII[1] != 0);
            }
            if (lIlIllllIIIIIIl(lllllllllllllIlIlIllIIllIIIlIIII ? 1 : 0)) {
                this.dropBlockAsItem(lllllllllllllIlIlIllIIllIIIIlllI, lllllllllllllIlIlIllIIllIIIlIlII, lllllllllllllIlIlIllIIllIIIIllII, BlockRailBase.lllllIllIlIII[0]);
                lllllllllllllIlIlIllIIllIIIIlllI.setBlockToAir(lllllllllllllIlIlIllIIllIIIlIlII);
                "".length();
                "".length();
                if (-(134 + 12 + 8 + 17 ^ 130 + 128 - 157 + 74) >= 0) {
                    return;
                }
            }
            else {
                this.onNeighborChangedInternal(lllllllllllllIlIlIllIIllIIIIlllI, lllllllllllllIlIlIllIIllIIIlIlII, lllllllllllllIlIlIllIIllIIIIllII, lllllllllllllIlIlIllIIllIIIlIIlI);
            }
        }
    }
    
    @Override
    public MovingObjectPosition collisionRayTrace(final World lllllllllllllIlIlIllIIllIlIIIlII, final BlockPos lllllllllllllIlIlIllIIllIlIIIIll, final Vec3 lllllllllllllIlIlIllIIllIlIIIlll, final Vec3 lllllllllllllIlIlIllIIllIlIIIIIl) {
        this.setBlockBoundsBasedOnState(lllllllllllllIlIlIllIIllIlIIIlII, lllllllllllllIlIlIllIIllIlIIIIll);
        return super.collisionRayTrace(lllllllllllllIlIlIllIIllIlIIIlII, lllllllllllllIlIlIllIIllIlIIIIll, lllllllllllllIlIlIllIIllIlIIIlll, lllllllllllllIlIlIllIIllIlIIIIIl);
    }
    
    protected IBlockState func_176564_a(final World lllllllllllllIlIlIllIIlIllllllIl, final BlockPos lllllllllllllIlIlIllIIlIllllllII, final IBlockState lllllllllllllIlIlIllIIlIllllIllI, final boolean lllllllllllllIlIlIllIIlIllllIlIl) {
        IBlockState blockState;
        if (lIlIllllIIIIIIl(lllllllllllllIlIlIllIIlIllllllIl.isRemote ? 1 : 0)) {
            blockState = lllllllllllllIlIlIllIIlIllllIllI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            blockState = new Rail(lllllllllllllIlIlIllIIlIllllllIl, lllllllllllllIlIlIllIIlIllllllII, lllllllllllllIlIlIllIIlIllllIllI).func_180364_a(lllllllllllllIlIlIllIIlIllllllIl.isBlockPowered(lllllllllllllIlIlIllIIlIllllllII), lllllllllllllIlIlIllIIlIllllIlIl).getBlockState();
        }
        return blockState;
    }
    
    @Override
    public int getMobilityFlag() {
        return BlockRailBase.lllllIllIlIII[0];
    }
    
    protected BlockRailBase(final boolean lllllllllllllIlIlIllIIllIlIlIlll) {
        super(Material.circuits);
        this.isPowered = lllllllllllllIlIlIllIIllIlIlIlll;
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
        this.setCreativeTab(CreativeTabs.tabTransport);
        "".length();
    }
    
    @Override
    public void breakBlock(final World lllllllllllllIlIlIllIIlIlllIllIl, final BlockPos lllllllllllllIlIlIllIIlIlllIllII, final IBlockState lllllllllllllIlIlIllIIlIlllIIlll) {
        super.breakBlock(lllllllllllllIlIlIllIIlIlllIllIl, lllllllllllllIlIlIllIIlIlllIllII, lllllllllllllIlIlIllIIlIlllIIlll);
        if (lIlIllllIIIIIIl(lllllllllllllIlIlIllIIlIlllIIlll.getValue(this.getShapeProperty()).isAscending() ? 1 : 0)) {
            lllllllllllllIlIlIllIIlIlllIllIl.notifyNeighborsOfStateChange(lllllllllllllIlIlIllIIlIlllIllII.up(), this);
        }
        if (lIlIllllIIIIIIl(this.isPowered ? 1 : 0)) {
            lllllllllllllIlIlIllIIlIlllIllIl.notifyNeighborsOfStateChange(lllllllllllllIlIlIllIIlIlllIllII, this);
            lllllllllllllIlIlIllIIlIlllIllIl.notifyNeighborsOfStateChange(lllllllllllllIlIlIllIIlIlllIllII.down(), this);
        }
    }
    
    @Override
    public void onBlockAdded(final World lllllllllllllIlIlIllIIllIIlIIIII, final BlockPos lllllllllllllIlIlIllIIllIIIlllll, IBlockState lllllllllllllIlIlIllIIllIIIllllI) {
        if (lIlIllllIIIIIlI(lllllllllllllIlIlIllIIllIIlIIIII.isRemote ? 1 : 0)) {
            lllllllllllllIlIlIllIIllIIIllllI = this.func_176564_a(lllllllllllllIlIlIllIIllIIlIIIII, lllllllllllllIlIlIllIIllIIIlllll, lllllllllllllIlIlIllIIllIIIllllI, (boolean)(BlockRailBase.lllllIllIlIII[1] != 0));
            if (lIlIllllIIIIIIl(this.isPowered ? 1 : 0)) {
                this.onNeighborBlockChange(lllllllllllllIlIlIllIIllIIlIIIII, lllllllllllllIlIlIllIIllIIIlllll, lllllllllllllIlIlIllIIllIIIllllI, this);
            }
        }
    }
    
    static {
        lIlIlllIlllllIl();
    }
    
    private static boolean lIlIllllIIIIIIl(final int lllllllllllllIlIlIllIIlIllIllIll) {
        return lllllllllllllIlIlIllIIlIllIllIll != 0;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockRailBase.lllllIllIlIII[0] != 0;
    }
    
    @Override
    public boolean canPlaceBlockAt(final World lllllllllllllIlIlIllIIllIIlIlIll, final BlockPos lllllllllllllIlIlIllIIllIIlIllII) {
        return World.doesBlockHaveSolidTopSurface(lllllllllllllIlIlIllIIllIIlIlIll, lllllllllllllIlIlIllIIllIIlIllII.down());
    }
    
    public static boolean isRailBlock(final World lllllllllllllIlIlIllIIllIllIIlII, final BlockPos lllllllllllllIlIlIllIIllIllIIIIl) {
        return isRailBlock(lllllllllllllIlIlIllIIllIllIIlII.getBlockState(lllllllllllllIlIlIllIIllIllIIIIl));
    }
    
    public abstract IProperty<EnumRailDirection> getShapeProperty();
    
    private static boolean lIlIllllIIIIIII(final Object lllllllllllllIlIlIllIIlIllIlllIl) {
        return lllllllllllllIlIlIllIIlIllIlllIl != null;
    }
    
    public static boolean isRailBlock(final IBlockState lllllllllllllIlIlIllIIllIlIllllI) {
        final Block lllllllllllllIlIlIllIIllIlIlllIl = lllllllllllllIlIlIllIIllIlIllllI.getBlock();
        if (lIlIlllIllllllI(lllllllllllllIlIlIllIIllIlIlllIl, Blocks.rail) && lIlIlllIllllllI(lllllllllllllIlIlIllIIllIlIlllIl, Blocks.golden_rail) && lIlIlllIllllllI(lllllllllllllIlIlIllIIllIlIlllIl, Blocks.detector_rail) && lIlIlllIllllllI(lllllllllllllIlIlIllIIllIlIlllIl, Blocks.activator_rail)) {
            return BlockRailBase.lllllIllIlIII[0] != 0;
        }
        return BlockRailBase.lllllIllIlIII[1] != 0;
    }
    
    private static boolean lIlIlllIlllllll(final Object lllllllllllllIlIlIllIIlIlllIIIII, final Object lllllllllllllIlIlIllIIlIllIlllll) {
        return lllllllllllllIlIlIllIIlIlllIIIII == lllllllllllllIlIlIllIIlIllIlllll;
    }
    
    private static boolean lIlIllllIIIIIlI(final int lllllllllllllIlIlIllIIlIllIllIIl) {
        return lllllllllllllIlIlIllIIlIllIllIIl == 0;
    }
    
    private static boolean lIlIlllIllllllI(final Object lllllllllllllIlIlIllIIlIlllIIlII, final Object lllllllllllllIlIlIllIIlIlllIIIll) {
        return lllllllllllllIlIlIllIIlIlllIIlII != lllllllllllllIlIlIllIIlIlllIIIll;
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT;
    }
    
    public enum EnumRailDirection implements IStringSerializable
    {
        private final /* synthetic */ String name;
        
        NORTH_WEST(EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[16]], EnumRailDirection.lIIlIlIIIlllII[8], EnumRailDirection.lIIlIlIIIlllII[8], EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[17]]), 
        EAST_WEST(EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[2]], EnumRailDirection.lIIlIlIIIlllII[1], EnumRailDirection.lIIlIlIIIlllII[1], EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[3]]), 
        ASCENDING_NORTH(EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[8]], EnumRailDirection.lIIlIlIIIlllII[4], EnumRailDirection.lIIlIlIIIlllII[4], EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[9]]);
        
        private static final /* synthetic */ String[] lIIlIlIIIlIIll;
        
        SOUTH_EAST(EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[12]], EnumRailDirection.lIIlIlIIIlllII[6], EnumRailDirection.lIIlIlIIIlllII[6], EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[13]]), 
        ASCENDING_EAST(EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[4]], EnumRailDirection.lIIlIlIIIlllII[2], EnumRailDirection.lIIlIlIIIlllII[2], EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[5]]), 
        SOUTH_WEST(EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[14]], EnumRailDirection.lIIlIlIIIlllII[7], EnumRailDirection.lIIlIlIIIlllII[7], EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[15]]), 
        ASCENDING_WEST(EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[6]], EnumRailDirection.lIIlIlIIIlllII[3], EnumRailDirection.lIIlIlIIIlllII[3], EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[7]]), 
        NORTH_SOUTH(EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[0]], EnumRailDirection.lIIlIlIIIlllII[0], EnumRailDirection.lIIlIlIIIlllII[0], EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[1]]), 
        ASCENDING_SOUTH(EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[10]], EnumRailDirection.lIIlIlIIIlllII[5], EnumRailDirection.lIIlIlIIIlllII[5], EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[11]]);
        
        private static final /* synthetic */ int[] lIIlIlIIIlllII;
        private final /* synthetic */ int meta;
        private static final /* synthetic */ EnumRailDirection[] META_LOOKUP;
        
        NORTH_EAST(EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[18]], EnumRailDirection.lIIlIlIIIlllII[9], EnumRailDirection.lIIlIlIIIlllII[9], EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[19]]);
        
        private EnumRailDirection(final String lllllllllllllIIllIlIIllIIIIIIlll, final int lllllllllllllIIllIlIIllIIIIIIllI, final int lllllllllllllIIllIlIIllIIIIIlIlI, final String lllllllllllllIIllIlIIllIIIIIIlII) {
            this.meta = lllllllllllllIIllIlIIllIIIIIlIlI;
            this.name = lllllllllllllIIllIlIIllIIIIIIlII;
        }
        
        public static EnumRailDirection byMetadata(int lllllllllllllIIllIlIIlIllllllIII) {
            if (!llIIlllllIlIlII(lllllllllllllIIllIlIIlIllllllIII) || llIIlllllIlIIlI(lllllllllllllIIllIlIIlIllllllIII, EnumRailDirection.META_LOOKUP.length)) {
                lllllllllllllIIllIlIIlIllllllIII = EnumRailDirection.lIIlIlIIIlllII[0];
            }
            return EnumRailDirection.META_LOOKUP[lllllllllllllIIllIlIIlIllllllIII];
        }
        
        private static boolean llIIlllllIlIIlI(final int lllllllllllllIIllIlIIlIllIlllIII, final int lllllllllllllIIllIlIIlIllIllIlll) {
            return lllllllllllllIIllIlIIlIllIlllIII >= lllllllllllllIIllIlIIlIllIllIlll;
        }
        
        private static boolean llIIlllllIlIIll(final Object lllllllllllllIIllIlIIlIllIllIIII, final Object lllllllllllllIIllIlIIlIllIlIllll) {
            return lllllllllllllIIllIlIIlIllIllIIII != lllllllllllllIIllIlIIlIllIlIllll;
        }
        
        static {
            llIIlllllIIllll();
            llIIlllllIIlIlI();
            final EnumRailDirection[] enum$VALUES = new EnumRailDirection[EnumRailDirection.lIIlIlIIIlllII[10]];
            enum$VALUES[EnumRailDirection.lIIlIlIIIlllII[0]] = EnumRailDirection.NORTH_SOUTH;
            enum$VALUES[EnumRailDirection.lIIlIlIIIlllII[1]] = EnumRailDirection.EAST_WEST;
            enum$VALUES[EnumRailDirection.lIIlIlIIIlllII[2]] = EnumRailDirection.ASCENDING_EAST;
            enum$VALUES[EnumRailDirection.lIIlIlIIIlllII[3]] = EnumRailDirection.ASCENDING_WEST;
            enum$VALUES[EnumRailDirection.lIIlIlIIIlllII[4]] = EnumRailDirection.ASCENDING_NORTH;
            enum$VALUES[EnumRailDirection.lIIlIlIIIlllII[5]] = EnumRailDirection.ASCENDING_SOUTH;
            enum$VALUES[EnumRailDirection.lIIlIlIIIlllII[6]] = EnumRailDirection.SOUTH_EAST;
            enum$VALUES[EnumRailDirection.lIIlIlIIIlllII[7]] = EnumRailDirection.SOUTH_WEST;
            enum$VALUES[EnumRailDirection.lIIlIlIIIlllII[8]] = EnumRailDirection.NORTH_WEST;
            enum$VALUES[EnumRailDirection.lIIlIlIIIlllII[9]] = EnumRailDirection.NORTH_EAST;
            ENUM$VALUES = enum$VALUES;
            META_LOOKUP = new EnumRailDirection[values().length];
            final char lllllllllllllIIllIlIIllIIIIlIIIl;
            final float lllllllllllllIIllIlIIllIIIIlIIlI = ((EnumRailDirection[])(Object)(lllllllllllllIIllIlIIllIIIIlIIIl = (char)(Object)values())).length;
            String lllllllllllllIIllIlIIllIIIIlIIll = (String)EnumRailDirection.lIIlIlIIIlllII[0];
            "".length();
            if (((0x85 ^ 0x94 ^ (0x26 ^ 0x6)) & (0x53 ^ 0x7C ^ (0x7F ^ 0x61) ^ -" ".length())) < ((0x34 ^ 0x59 ^ (0xB8 ^ 0xC2)) & (0x5E ^ 0x75 ^ (0x9C ^ 0xA0) ^ -" ".length()))) {
                return;
            }
            while (!llIIlllllIlIIlI((int)lllllllllllllIIllIlIIllIIIIlIIll, (int)lllllllllllllIIllIlIIllIIIIlIIlI)) {
                final EnumRailDirection lllllllllllllIIllIlIIllIIIIlIlIl = lllllllllllllIIllIlIIllIIIIlIIIl[lllllllllllllIIllIlIIllIIIIlIIll];
                EnumRailDirection.META_LOOKUP[lllllllllllllIIllIlIIllIIIIlIlIl.getMetadata()] = lllllllllllllIIllIlIIllIIIIlIlIl;
                ++lllllllllllllIIllIlIIllIIIIlIIll;
            }
        }
        
        private static String llIIllllIlllllI(String lllllllllllllIIllIlIIlIlllIlllIl, final String lllllllllllllIIllIlIIlIlllIlllII) {
            lllllllllllllIIllIlIIlIlllIlllIl = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllIlIIlIlllIlllIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIllIlIIlIllllIIIII = new StringBuilder();
            final char[] lllllllllllllIIllIlIIlIlllIlllll = lllllllllllllIIllIlIIlIlllIlllII.toCharArray();
            int lllllllllllllIIllIlIIlIlllIllllI = EnumRailDirection.lIIlIlIIIlllII[0];
            final byte lllllllllllllIIllIlIIlIlllIllIII = (Object)((String)lllllllllllllIIllIlIIlIlllIlllIl).toCharArray();
            final float lllllllllllllIIllIlIIlIlllIlIlll = lllllllllllllIIllIlIIlIlllIllIII.length;
            long lllllllllllllIIllIlIIlIlllIlIllI = EnumRailDirection.lIIlIlIIIlllII[0];
            while (llIIlllllIlIlIl((int)lllllllllllllIIllIlIIlIlllIlIllI, (int)lllllllllllllIIllIlIIlIlllIlIlll)) {
                final char lllllllllllllIIllIlIIlIllllIIIll = lllllllllllllIIllIlIIlIlllIllIII[lllllllllllllIIllIlIIlIlllIlIllI];
                lllllllllllllIIllIlIIlIllllIIIII.append((char)(lllllllllllllIIllIlIIlIllllIIIll ^ lllllllllllllIIllIlIIlIlllIlllll[lllllllllllllIIllIlIIlIlllIllllI % lllllllllllllIIllIlIIlIlllIlllll.length]));
                "".length();
                ++lllllllllllllIIllIlIIlIlllIllllI;
                ++lllllllllllllIIllIlIIlIlllIlIllI;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIllIlIIlIllllIIIII);
        }
        
        private static boolean llIIlllllIlIlIl(final int lllllllllllllIIllIlIIlIllIllIlII, final int lllllllllllllIIllIlIIlIllIllIIll) {
            return lllllllllllllIIllIlIIlIllIllIlII < lllllllllllllIIllIlIIlIllIllIIll;
        }
        
        private static String llIIllllIllllIl(final String lllllllllllllIIllIlIIlIlllIIlIll, final String lllllllllllllIIllIlIIlIlllIIllII) {
            try {
                final SecretKeySpec lllllllllllllIIllIlIIlIlllIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlIIlIlllIIllII.getBytes(StandardCharsets.UTF_8)), EnumRailDirection.lIIlIlIIIlllII[8]), "DES");
                final Cipher lllllllllllllIIllIlIIlIlllIIllll = Cipher.getInstance("DES");
                lllllllllllllIIllIlIIlIlllIIllll.init(EnumRailDirection.lIIlIlIIIlllII[2], lllllllllllllIIllIlIIlIlllIlIIII);
                return new String(lllllllllllllIIllIlIIlIlllIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlIIlIlllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIllIlIIlIlllIIlllI) {
                lllllllllllllIIllIlIIlIlllIIlllI.printStackTrace();
                return null;
            }
        }
        
        private static void llIIlllllIIlIlI() {
            (lIIlIlIIIlIIll = new String[EnumRailDirection.lIIlIlIIIlllII[20]])[EnumRailDirection.lIIlIlIIIlllII[0]] = llIIllllIllllIl("Toer1+3RB3eXKcNLUTtgZA==", "CEGdA");
            EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[1]] = llIIllllIlllllI("DyMoHg4+PzUfEgk=", "aLZjf");
            EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[2]] = llIIllllIllllll("gzhMMtZatAg2f7x5/gH0pQ==", "EncDm");
            EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[3]] = llIIllllIlllllI("BgsiHy4UDyIf", "cjQkq");
            EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[4]] = llIIllllIllllll("BWIVo/cYFB2ogOh9wePQ4w==", "OyvKG");
            EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[5]] = llIIllllIlllllI("LD4GESspJAsTGigsFgA=", "MMetE");
            EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[6]] = llIIllllIllllIl("qceRheQtADNXTUFNdCAPtA==", "mhbVX");
            EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[7]] = llIIllllIllllIl("tgIruvg+7pUcyxXtjyBJQw==", "PANSF");
            EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[8]] = llIIllllIlllllI("DSckBAwIPSkGHQI7NRUK", "LtgAB");
            EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[9]] = llIIllllIllllIl("a8byI2zlsI516PP3GaSPzg==", "BgfgI");
            EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[10]] = llIIllllIlllllI("NxYaDxcyDBcNBiUKDB4R", "vEYJY");
            EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[11]] = llIIllllIllllIl("u2LLdm2iyp9g1phhMFgiAQ==", "sxSpv");
            EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[12]] = llIIllllIllllIl("jfOB9wlRNRcM0nD+3WouAg==", "bChWK");
            EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[13]] = llIIllllIlllllI("Aic7Hy4uLS8YMg==", "qHNkF");
            EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[14]] = llIIllllIllllll("3PilBKkGF2IfJ4LZQ2V0qw==", "XdyIv");
            EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[15]] = llIIllllIllllIl("Gbtq9oaTtSoa0HCL2Fs2Yw==", "OgtTP");
            EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[16]] = llIIllllIllllll("hWtGQMdYyEMnwwubRbgOsA==", "CbnXA");
            EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[17]] = llIIllllIllllll("Teevo20+zImD4cLPnfjZ8Q==", "nkoEv");
            EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[18]] = llIIllllIllllll("/EjwWUZEAYQJoRhv8+LtjA==", "jPrZy");
            EnumRailDirection.lIIlIlIIIlIIll[EnumRailDirection.lIIlIlIIIlllII[19]] = llIIllllIllllIl("Fc5GD+5dGgz8HAtNrp0Zww==", "quIAe");
        }
        
        public int getMetadata() {
            return this.meta;
        }
        
        @Override
        public String getName() {
            return this.name;
        }
        
        private static void llIIlllllIIllll() {
            (lIIlIlIIIlllII = new int[21])[0] = ((80 + 115 - 108 + 110 ^ 43 + 65 - 40 + 63) & (0x4D ^ 0x74 ^ 42 + 61 - 54 + 78 ^ -" ".length()));
            EnumRailDirection.lIIlIlIIIlllII[1] = " ".length();
            EnumRailDirection.lIIlIlIIIlllII[2] = "  ".length();
            EnumRailDirection.lIIlIlIIIlllII[3] = "   ".length();
            EnumRailDirection.lIIlIlIIIlllII[4] = (0x13 ^ 0x2B ^ (0x78 ^ 0x44));
            EnumRailDirection.lIIlIlIIIlllII[5] = (0x53 ^ 0xD ^ (0x4D ^ 0x16));
            EnumRailDirection.lIIlIlIIIlllII[6] = (0x96 ^ 0x90);
            EnumRailDirection.lIIlIlIIIlllII[7] = (((0xD4 ^ 0x8E) & ~(0xD1 ^ 0x8B)) ^ (0x9A ^ 0x9D));
            EnumRailDirection.lIIlIlIIIlllII[8] = (0x24 ^ 0x3C ^ (0x61 ^ 0x71));
            EnumRailDirection.lIIlIlIIIlllII[9] = (0x37 ^ 0x3E);
            EnumRailDirection.lIIlIlIIIlllII[10] = (0x2A ^ 0x20);
            EnumRailDirection.lIIlIlIIIlllII[11] = (0x1F ^ 0x14);
            EnumRailDirection.lIIlIlIIIlllII[12] = (0x1A ^ 0x16);
            EnumRailDirection.lIIlIlIIIlllII[13] = (0x3C ^ 0x31);
            EnumRailDirection.lIIlIlIIIlllII[14] = (0x41 ^ 0x9 ^ (0x6F ^ 0x29));
            EnumRailDirection.lIIlIlIIIlllII[15] = (0x60 ^ 0x6F);
            EnumRailDirection.lIIlIlIIIlllII[16] = (30 + 129 - 64 + 64 ^ 45 + 105 - 147 + 140);
            EnumRailDirection.lIIlIlIIIlllII[17] = (0x2A ^ 0x57 ^ (0xF9 ^ 0x95));
            EnumRailDirection.lIIlIlIIIlllII[18] = (0x78 ^ 0x6A);
            EnumRailDirection.lIIlIlIIIlllII[19] = (155 + 162 - 291 + 148 ^ 94 + 122 - 154 + 127);
            EnumRailDirection.lIIlIlIIIlllII[20] = (0x3D ^ 0x33 ^ (0xDB ^ 0xC1));
        }
        
        public boolean isAscending() {
            if (llIIlllllIlIIll(this, EnumRailDirection.ASCENDING_NORTH) && llIIlllllIlIIll(this, EnumRailDirection.ASCENDING_EAST) && llIIlllllIlIIll(this, EnumRailDirection.ASCENDING_SOUTH) && llIIlllllIlIIll(this, EnumRailDirection.ASCENDING_WEST)) {
                return EnumRailDirection.lIIlIlIIIlllII[0] != 0;
            }
            return EnumRailDirection.lIIlIlIIIlllII[1] != 0;
        }
        
        private static boolean llIIlllllIlIlII(final int lllllllllllllIIllIlIIlIllIlIllIl) {
            return lllllllllllllIIllIlIIlIllIlIllIl >= 0;
        }
        
        @Override
        public String toString() {
            return this.name;
        }
        
        private static String llIIllllIllllll(final String lllllllllllllIIllIlIIlIllIlllllI, final String lllllllllllllIIllIlIIlIllIllllIl) {
            try {
                final SecretKeySpec lllllllllllllIIllIlIIlIlllIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlIIlIllIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIllIlIIlIlllIIIIlI = Cipher.getInstance("Blowfish");
                lllllllllllllIIllIlIIlIlllIIIIlI.init(EnumRailDirection.lIIlIlIIIlllII[2], lllllllllllllIIllIlIIlIlllIIIIll);
                return new String(lllllllllllllIIllIlIIlIlllIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlIIlIllIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIllIlIIlIlllIIIIIl) {
                lllllllllllllIIllIlIIlIlllIIIIIl.printStackTrace();
                return null;
            }
        }
    }
    
    public class Rail
    {
        private final /* synthetic */ BlockPos pos;
        private /* synthetic */ IBlockState state;
        private final /* synthetic */ World world;
        private final /* synthetic */ boolean isPowered;
        private static final /* synthetic */ int[] lIlllIllIlIIII;
        private final /* synthetic */ BlockRailBase block;
        private final /* synthetic */ List<BlockPos> field_150657_g;
        
        private boolean func_150649_b(final Rail llllllllllllIllllIlllIIlIIlIIIlI) {
            if (lIIIIIllIIlllllI(this.func_150653_a(llllllllllllIllllIlllIIlIIlIIIlI) ? 1 : 0) && lIIIIIllIIllllll(this.field_150657_g.size(), Rail.lIlllIllIlIIII[2])) {
                return Rail.lIlllIllIlIIII[0] != 0;
            }
            return Rail.lIlllIllIlIIII[1] != 0;
        }
        
        protected int countAdjacentRails() {
            int llllllllllllIllllIlllIIlIIlIllIl = Rail.lIlllIllIlIIII[0];
            final String llllllllllllIllllIlllIIlIIlIlIII = (String)EnumFacing.Plane.HORIZONTAL.iterator();
            "".length();
            if (null != null) {
                return (0xD4 ^ 0x9B) & ~(0xE3 ^ 0xAC);
            }
            while (!lIIIIIllIIlllllI(((Iterator)llllllllllllIllllIlllIIlIIlIlIII).hasNext() ? 1 : 0)) {
                final EnumFacing llllllllllllIllllIlllIIlIIlIllII = ((Iterator<EnumFacing>)llllllllllllIllllIlllIIlIIlIlIII).next();
                if (lIIIIIllIIllllII(this.hasRailAt(this.pos.offset(llllllllllllIllllIlllIIlIIlIllII)) ? 1 : 0)) {
                    ++llllllllllllIllllIlllIIlIIlIllIl;
                }
            }
            return llllllllllllIllllIlllIIlIIlIllIl;
        }
        
        private void func_150645_c(final Rail llllllllllllIllllIlllIIlIIIIlIlI) {
            this.field_150657_g.add(llllllllllllIllllIlllIIlIIIIlIlI.pos);
            "".length();
            final BlockPos llllllllllllIllllIlllIIlIIIlIlII = this.pos.north();
            final BlockPos llllllllllllIllllIlllIIlIIIlIIll = this.pos.south();
            final BlockPos llllllllllllIllllIlllIIlIIIlIIlI = this.pos.west();
            final BlockPos llllllllllllIllllIlllIIlIIIlIIIl = this.pos.east();
            final boolean llllllllllllIllllIlllIIlIIIlIIII = this.func_180363_c(llllllllllllIllllIlllIIlIIIlIlII);
            final boolean llllllllllllIllllIlllIIlIIIIllll = this.func_180363_c(llllllllllllIllllIlllIIlIIIlIIll);
            final boolean llllllllllllIllllIlllIIlIIIIlllI = this.func_180363_c(llllllllllllIllllIlllIIlIIIlIIlI);
            final boolean llllllllllllIllllIlllIIlIIIIllIl = this.func_180363_c(llllllllllllIllllIlllIIlIIIlIIIl);
            EnumRailDirection llllllllllllIllllIlllIIlIIIIllII = null;
            if (!lIIIIIllIIlllllI(llllllllllllIllllIlllIIlIIIlIIII ? 1 : 0) || lIIIIIllIIllllII(llllllllllllIllllIlllIIlIIIIllll ? 1 : 0)) {
                llllllllllllIllllIlllIIlIIIIllII = EnumRailDirection.NORTH_SOUTH;
            }
            if (!lIIIIIllIIlllllI(llllllllllllIllllIlllIIlIIIIlllI ? 1 : 0) || lIIIIIllIIllllII(llllllllllllIllllIlllIIlIIIIllIl ? 1 : 0)) {
                llllllllllllIllllIlllIIlIIIIllII = EnumRailDirection.EAST_WEST;
            }
            if (lIIIIIllIIlllllI(this.isPowered ? 1 : 0)) {
                if (lIIIIIllIIllllII(llllllllllllIllllIlllIIlIIIIllll ? 1 : 0) && lIIIIIllIIllllII(llllllllllllIllllIlllIIlIIIIllIl ? 1 : 0) && lIIIIIllIIlllllI(llllllllllllIllllIlllIIlIIIlIIII ? 1 : 0) && lIIIIIllIIlllllI(llllllllllllIllllIlllIIlIIIIlllI ? 1 : 0)) {
                    llllllllllllIllllIlllIIlIIIIllII = EnumRailDirection.SOUTH_EAST;
                }
                if (lIIIIIllIIllllII(llllllllllllIllllIlllIIlIIIIllll ? 1 : 0) && lIIIIIllIIllllII(llllllllllllIllllIlllIIlIIIIlllI ? 1 : 0) && lIIIIIllIIlllllI(llllllllllllIllllIlllIIlIIIlIIII ? 1 : 0) && lIIIIIllIIlllllI(llllllllllllIllllIlllIIlIIIIllIl ? 1 : 0)) {
                    llllllllllllIllllIlllIIlIIIIllII = EnumRailDirection.SOUTH_WEST;
                }
                if (lIIIIIllIIllllII(llllllllllllIllllIlllIIlIIIlIIII ? 1 : 0) && lIIIIIllIIllllII(llllllllllllIllllIlllIIlIIIIlllI ? 1 : 0) && lIIIIIllIIlllllI(llllllllllllIllllIlllIIlIIIIllll ? 1 : 0) && lIIIIIllIIlllllI(llllllllllllIllllIlllIIlIIIIllIl ? 1 : 0)) {
                    llllllllllllIllllIlllIIlIIIIllII = EnumRailDirection.NORTH_WEST;
                }
                if (lIIIIIllIIllllII(llllllllllllIllllIlllIIlIIIlIIII ? 1 : 0) && lIIIIIllIIllllII(llllllllllllIllllIlllIIlIIIIllIl ? 1 : 0) && lIIIIIllIIlllllI(llllllllllllIllllIlllIIlIIIIllll ? 1 : 0) && lIIIIIllIIlllllI(llllllllllllIllllIlllIIlIIIIlllI ? 1 : 0)) {
                    llllllllllllIllllIlllIIlIIIIllII = EnumRailDirection.NORTH_EAST;
                }
            }
            if (lIIIIIllIlIIIIII(llllllllllllIllllIlllIIlIIIIllII, EnumRailDirection.NORTH_SOUTH)) {
                if (lIIIIIllIIllllII(BlockRailBase.isRailBlock(this.world, llllllllllllIllllIlllIIlIIIlIlII.up()) ? 1 : 0)) {
                    llllllllllllIllllIlllIIlIIIIllII = EnumRailDirection.ASCENDING_NORTH;
                }
                if (lIIIIIllIIllllII(BlockRailBase.isRailBlock(this.world, llllllllllllIllllIlllIIlIIIlIIll.up()) ? 1 : 0)) {
                    llllllllllllIllllIlllIIlIIIIllII = EnumRailDirection.ASCENDING_SOUTH;
                }
            }
            if (lIIIIIllIlIIIIII(llllllllllllIllllIlllIIlIIIIllII, EnumRailDirection.EAST_WEST)) {
                if (lIIIIIllIIllllII(BlockRailBase.isRailBlock(this.world, llllllllllllIllllIlllIIlIIIlIIIl.up()) ? 1 : 0)) {
                    llllllllllllIllllIlllIIlIIIIllII = EnumRailDirection.ASCENDING_EAST;
                }
                if (lIIIIIllIIllllII(BlockRailBase.isRailBlock(this.world, llllllllllllIllllIlllIIlIIIlIIlI.up()) ? 1 : 0)) {
                    llllllllllllIllllIlllIIlIIIIllII = EnumRailDirection.ASCENDING_WEST;
                }
            }
            if (lIIIIIllIlIIIIIl(llllllllllllIllllIlllIIlIIIIllII)) {
                llllllllllllIllllIlllIIlIIIIllII = EnumRailDirection.NORTH_SOUTH;
            }
            this.state = this.state.withProperty(this.block.getShapeProperty(), llllllllllllIllllIlllIIlIIIIllII);
            this.world.setBlockState(this.pos, this.state, Rail.lIlllIllIlIIII[3]);
            "".length();
        }
        
        private static void lIIIIIllIIlllIlI() {
            (lIlllIllIlIIII = new int[11])[0] = ((0xF1 ^ 0xBB ^ (0x7C ^ 0x8)) & (0x13 ^ 0x2A ^ (0xF ^ 0x8) ^ -" ".length()));
            Rail.lIlllIllIlIIII[1] = " ".length();
            Rail.lIlllIllIlIIII[2] = "  ".length();
            Rail.lIlllIllIlIIII[3] = "   ".length();
            Rail.lIlllIllIlIIII[4] = (0x10 ^ 0x15);
            Rail.lIlllIllIlIIII[5] = (61 + 175 - 197 + 160 ^ 148 + 39 - 170 + 176);
            Rail.lIlllIllIlIIII[6] = (0x67 ^ 0x63);
            Rail.lIlllIllIlIIII[7] = (94 + 126 - 203 + 189 ^ 159 + 58 - 148 + 127);
            Rail.lIlllIllIlIIII[8] = (8 + 127 - 51 + 45 ^ 34 + 76 + 12 + 14);
            Rail.lIlllIllIlIIII[9] = (0x77 ^ 0x5D ^ (0xBC ^ 0x91));
            Rail.lIlllIllIlIIII[10] = (0xA0 ^ 0xA8);
        }
        
        private static boolean lIIIIIllIIlllIll(final Object llllllllllllIllllIlllIIIlIlllIll) {
            return llllllllllllIllllIlllIIIlIlllIll != null;
        }
        
        private void func_150651_b() {
            int llllllllllllIllllIlllIIlIllIllIl = Rail.lIlllIllIlIIII[0];
            "".length();
            if (-" ".length() >= (0xED ^ 0xB2 ^ (0xFC ^ 0xA7))) {
                return;
            }
            while (!lIIIIIllIIllllIl(llllllllllllIllllIlllIIlIllIllIl, this.field_150657_g.size())) {
                final Rail llllllllllllIllllIlllIIlIllIllII = this.findRailAt(this.field_150657_g.get(llllllllllllIllllIlllIIlIllIllIl));
                if (lIIIIIllIIlllIll(llllllllllllIllllIlllIIlIllIllII) && lIIIIIllIIllllII(llllllllllllIllllIlllIIlIllIllII.func_150653_a(this) ? 1 : 0)) {
                    this.field_150657_g.set(llllllllllllIllllIlllIIlIllIllIl, llllllllllllIllllIlllIIlIllIllII.pos);
                    "".length();
                    "".length();
                    if (((0xE ^ 0x2E) & ~(0x68 ^ 0x48)) > 0) {
                        return;
                    }
                }
                else {
                    this.field_150657_g.remove(llllllllllllIllllIlllIIlIllIllIl--);
                    "".length();
                }
                ++llllllllllllIllllIlllIIlIllIllIl;
            }
        }
        
        private Rail findRailAt(final BlockPos llllllllllllIllllIlllIIlIlIlIlII) {
            IBlockState llllllllllllIllllIlllIIlIlIlIIlI = this.world.getBlockState(llllllllllllIllllIlllIIlIlIlIlII);
            if (lIIIIIllIIllllII(BlockRailBase.isRailBlock(llllllllllllIllllIlllIIlIlIlIIlI) ? 1 : 0)) {
                final BlockRailBase this$0 = BlockRailBase.this;
                this$0.getClass();
                "".length();
                return this$0.new Rail(this.world, llllllllllllIllllIlllIIlIlIlIlII, llllllllllllIllllIlllIIlIlIlIIlI);
            }
            BlockPos llllllllllllIllllIlllIIlIlIlIIIl = llllllllllllIllllIlllIIlIlIlIlII.up();
            llllllllllllIllllIlllIIlIlIlIIlI = this.world.getBlockState(llllllllllllIllllIlllIIlIlIlIIIl);
            if (lIIIIIllIIllllII(BlockRailBase.isRailBlock(llllllllllllIllllIlllIIlIlIlIIlI) ? 1 : 0)) {
                final BlockRailBase this$2 = BlockRailBase.this;
                this$2.getClass();
                "".length();
                return this$2.new Rail(this.world, llllllllllllIllllIlllIIlIlIlIIIl, llllllllllllIllllIlllIIlIlIlIIlI);
            }
            llllllllllllIllllIlllIIlIlIlIIIl = llllllllllllIllllIlllIIlIlIlIlII.down();
            llllllllllllIllllIlllIIlIlIlIIlI = this.world.getBlockState(llllllllllllIllllIlllIIlIlIlIIIl);
            Rail rail;
            if (lIIIIIllIIllllII(BlockRailBase.isRailBlock(llllllllllllIllllIlllIIlIlIlIIlI) ? 1 : 0)) {
                final BlockRailBase this$3;
                rail = this$3.new Rail(this.world, llllllllllllIllllIlllIIlIlIlIIIl, llllllllllllIllllIlllIIlIlIlIIlI);
                this$3 = BlockRailBase.this;
                this$3.getClass();
                "".length();
                "".length();
                if (" ".length() != " ".length()) {
                    return null;
                }
            }
            else {
                rail = null;
            }
            return rail;
        }
        
        private boolean func_180361_d(final BlockPos llllllllllllIllllIlllIIIlllllIIl) {
            final Rail llllllllllllIllllIlllIIIlllllIll = this.findRailAt(llllllllllllIllllIlllIIIlllllIIl);
            if (lIIIIIllIlIIIIIl(llllllllllllIllllIlllIIIlllllIll)) {
                return Rail.lIlllIllIlIIII[0] != 0;
            }
            llllllllllllIllllIlllIIIlllllIll.func_150651_b();
            return llllllllllllIllllIlllIIIlllllIll.func_150649_b(this);
        }
        
        private static boolean lIIIIIllIIlllllI(final int llllllllllllIllllIlllIIIlIllIIIl) {
            return llllllllllllIllllIlllIIIlIllIIIl == 0;
        }
        
        private static boolean lIIIIIllIIllllIl(final int llllllllllllIllllIlllIIIllIIIIlI, final int llllllllllllIllllIlllIIIllIIIIIl) {
            return llllllllllllIllllIlllIIIllIIIIlI >= llllllllllllIllllIlllIIIllIIIIIl;
        }
        
        private boolean func_150653_a(final Rail llllllllllllIllllIlllIIlIIllllll) {
            return this.func_180363_c(llllllllllllIllllIlllIIlIIllllll.pos);
        }
        
        public Rail(final World llllllllllllIllllIlllIIlIllllIll, final BlockPos llllllllllllIllllIlllIIlIllllIlI, final IBlockState llllllllllllIllllIlllIIlIllllIIl) {
            this.field_150657_g = (List<BlockPos>)Lists.newArrayList();
            this.world = llllllllllllIllllIlllIIlIllllIll;
            this.pos = llllllllllllIllllIlllIIlIllllIlI;
            this.state = llllllllllllIllllIlllIIlIllllIIl;
            this.block = (BlockRailBase)llllllllllllIllllIlllIIlIllllIIl.getBlock();
            final EnumRailDirection llllllllllllIllllIlllIIlIllllllI = llllllllllllIllllIlllIIlIllllIIl.getValue(BlockRailBase.this.getShapeProperty());
            this.isPowered = this.block.isPowered;
            this.func_180360_a(llllllllllllIllllIlllIIlIllllllI);
        }
        
        static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$block$BlockRailBase$EnumRailDirection() {
            final int[] $switch_TABLE$net$minecraft$block$BlockRailBase$EnumRailDirection = Rail.$SWITCH_TABLE$net$minecraft$block$BlockRailBase$EnumRailDirection;
            if (lIIIIIllIIlllIll($switch_TABLE$net$minecraft$block$BlockRailBase$EnumRailDirection)) {
                return $switch_TABLE$net$minecraft$block$BlockRailBase$EnumRailDirection;
            }
            "".length();
            final double llllllllllllIllllIlllIIIllIIlIIl = (Object)new int[EnumRailDirection.values().length];
            try {
                llllllllllllIllllIlllIIIllIIlIIl[EnumRailDirection.ASCENDING_EAST.ordinal()] = Rail.lIlllIllIlIIII[3];
                "".length();
                if ((124 + 34 - 33 + 25 ^ 110 + 127 - 223 + 132) < 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError) {
                "".length();
            }
            try {
                llllllllllllIllllIlllIIIllIIlIIl[EnumRailDirection.ASCENDING_NORTH.ordinal()] = Rail.lIlllIllIlIIII[4];
                "".length();
                if (" ".length() > "   ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                "".length();
            }
            try {
                llllllllllllIllllIlllIIIllIIlIIl[EnumRailDirection.ASCENDING_SOUTH.ordinal()] = Rail.lIlllIllIlIIII[5];
                "".length();
                if ((0xFA ^ 0x9B ^ (0xC7 ^ 0xA2)) > (169 + 11 - 10 + 15 ^ 103 + 30 - 113 + 169)) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError3) {
                "".length();
            }
            try {
                llllllllllllIllllIlllIIIllIIlIIl[EnumRailDirection.ASCENDING_WEST.ordinal()] = Rail.lIlllIllIlIIII[6];
                "".length();
                if ((0x1B ^ 0x1F) < 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError4) {
                "".length();
            }
            try {
                llllllllllllIllllIlllIIIllIIlIIl[EnumRailDirection.EAST_WEST.ordinal()] = Rail.lIlllIllIlIIII[2];
                "".length();
                if (-(0xC3 ^ 0xC7) >= 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError5) {
                "".length();
            }
            try {
                llllllllllllIllllIlllIIIllIIlIIl[EnumRailDirection.NORTH_EAST.ordinal()] = Rail.lIlllIllIlIIII[7];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError6) {
                "".length();
            }
            try {
                llllllllllllIllllIlllIIIllIIlIIl[EnumRailDirection.NORTH_SOUTH.ordinal()] = Rail.lIlllIllIlIIII[1];
                "".length();
                if ("  ".length() >= "   ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError7) {
                "".length();
            }
            try {
                llllllllllllIllllIlllIIIllIIlIIl[EnumRailDirection.NORTH_WEST.ordinal()] = Rail.lIlllIllIlIIII[8];
                "".length();
                if (-(0xC1 ^ 0xC4) >= 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError8) {
                "".length();
            }
            try {
                llllllllllllIllllIlllIIIllIIlIIl[EnumRailDirection.SOUTH_EAST.ordinal()] = Rail.lIlllIllIlIIII[9];
                "".length();
                if ("   ".length() <= 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError9) {
                "".length();
            }
            try {
                llllllllllllIllllIlllIIIllIIlIIl[EnumRailDirection.SOUTH_WEST.ordinal()] = Rail.lIlllIllIlIIII[10];
                "".length();
                if (-" ".length() >= 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError10) {
                "".length();
            }
            return Rail.$SWITCH_TABLE$net$minecraft$block$BlockRailBase$EnumRailDirection = (int[])(Object)llllllllllllIllllIlllIIIllIIlIIl;
        }
        
        private static boolean lIIIIIllIIllllII(final int llllllllllllIllllIlllIIIlIllIIll) {
            return llllllllllllIllllIlllIIIlIllIIll != 0;
        }
        
        private boolean hasRailAt(final BlockPos llllllllllllIllllIlllIIlIllIIIlI) {
            if (lIIIIIllIIlllllI(BlockRailBase.isRailBlock(this.world, llllllllllllIllllIlllIIlIllIIIlI) ? 1 : 0) && lIIIIIllIIlllllI(BlockRailBase.isRailBlock(this.world, llllllllllllIllllIlllIIlIllIIIlI.up()) ? 1 : 0) && lIIIIIllIIlllllI(BlockRailBase.isRailBlock(this.world, llllllllllllIllllIlllIIlIllIIIlI.down()) ? 1 : 0)) {
                return Rail.lIlllIllIlIIII[0] != 0;
            }
            return Rail.lIlllIllIlIIII[1] != 0;
        }
        
        private static boolean lIIIIIllIlIIIIII(final Object llllllllllllIllllIlllIIIlIlllIII, final Object llllllllllllIllllIlllIIIlIllIlll) {
            return llllllllllllIllllIlllIIIlIlllIII == llllllllllllIllllIlllIIIlIllIlll;
        }
        
        public Rail func_180364_a(final boolean llllllllllllIllllIlllIIIlllIlIII, final boolean llllllllllllIllllIlllIIIlllIIlll) {
            final BlockPos llllllllllllIllllIlllIIIlllIIllI = this.pos.north();
            final BlockPos llllllllllllIllllIlllIIIlllIIlIl = this.pos.south();
            final BlockPos llllllllllllIllllIlllIIIlllIIlII = this.pos.west();
            final BlockPos llllllllllllIllllIlllIIIlllIIIll = this.pos.east();
            final boolean llllllllllllIllllIlllIIIlllIIIlI = this.func_180361_d(llllllllllllIllllIlllIIIlllIIllI);
            final boolean llllllllllllIllllIlllIIIlllIIIIl = this.func_180361_d(llllllllllllIllllIlllIIIlllIIlIl);
            final boolean llllllllllllIllllIlllIIIlllIIIII = this.func_180361_d(llllllllllllIllllIlllIIIlllIIlII);
            final boolean llllllllllllIllllIlllIIIllIlllll = this.func_180361_d(llllllllllllIllllIlllIIIlllIIIll);
            EnumRailDirection llllllllllllIllllIlllIIIllIllllI = null;
            if ((!lIIIIIllIIlllllI(llllllllllllIllllIlllIIIlllIIIlI ? 1 : 0) || lIIIIIllIIllllII(llllllllllllIllllIlllIIIlllIIIIl ? 1 : 0)) && lIIIIIllIIlllllI(llllllllllllIllllIlllIIIlllIIIII ? 1 : 0) && lIIIIIllIIlllllI(llllllllllllIllllIlllIIIllIlllll ? 1 : 0)) {
                llllllllllllIllllIlllIIIllIllllI = EnumRailDirection.NORTH_SOUTH;
            }
            if ((!lIIIIIllIIlllllI(llllllllllllIllllIlllIIIlllIIIII ? 1 : 0) || lIIIIIllIIllllII(llllllllllllIllllIlllIIIllIlllll ? 1 : 0)) && lIIIIIllIIlllllI(llllllllllllIllllIlllIIIlllIIIlI ? 1 : 0) && lIIIIIllIIlllllI(llllllllllllIllllIlllIIIlllIIIIl ? 1 : 0)) {
                llllllllllllIllllIlllIIIllIllllI = EnumRailDirection.EAST_WEST;
            }
            if (lIIIIIllIIlllllI(this.isPowered ? 1 : 0)) {
                if (lIIIIIllIIllllII(llllllllllllIllllIlllIIIlllIIIIl ? 1 : 0) && lIIIIIllIIllllII(llllllllllllIllllIlllIIIllIlllll ? 1 : 0) && lIIIIIllIIlllllI(llllllllllllIllllIlllIIIlllIIIlI ? 1 : 0) && lIIIIIllIIlllllI(llllllllllllIllllIlllIIIlllIIIII ? 1 : 0)) {
                    llllllllllllIllllIlllIIIllIllllI = EnumRailDirection.SOUTH_EAST;
                }
                if (lIIIIIllIIllllII(llllllllllllIllllIlllIIIlllIIIIl ? 1 : 0) && lIIIIIllIIllllII(llllllllllllIllllIlllIIIlllIIIII ? 1 : 0) && lIIIIIllIIlllllI(llllllllllllIllllIlllIIIlllIIIlI ? 1 : 0) && lIIIIIllIIlllllI(llllllllllllIllllIlllIIIllIlllll ? 1 : 0)) {
                    llllllllllllIllllIlllIIIllIllllI = EnumRailDirection.SOUTH_WEST;
                }
                if (lIIIIIllIIllllII(llllllllllllIllllIlllIIIlllIIIlI ? 1 : 0) && lIIIIIllIIllllII(llllllllllllIllllIlllIIIlllIIIII ? 1 : 0) && lIIIIIllIIlllllI(llllllllllllIllllIlllIIIlllIIIIl ? 1 : 0) && lIIIIIllIIlllllI(llllllllllllIllllIlllIIIllIlllll ? 1 : 0)) {
                    llllllllllllIllllIlllIIIllIllllI = EnumRailDirection.NORTH_WEST;
                }
                if (lIIIIIllIIllllII(llllllllllllIllllIlllIIIlllIIIlI ? 1 : 0) && lIIIIIllIIllllII(llllllllllllIllllIlllIIIllIlllll ? 1 : 0) && lIIIIIllIIlllllI(llllllllllllIllllIlllIIIlllIIIIl ? 1 : 0) && lIIIIIllIIlllllI(llllllllllllIllllIlllIIIlllIIIII ? 1 : 0)) {
                    llllllllllllIllllIlllIIIllIllllI = EnumRailDirection.NORTH_EAST;
                }
            }
            if (lIIIIIllIlIIIIIl(llllllllllllIllllIlllIIIllIllllI)) {
                if (!lIIIIIllIIlllllI(llllllllllllIllllIlllIIIlllIIIlI ? 1 : 0) || lIIIIIllIIllllII(llllllllllllIllllIlllIIIlllIIIIl ? 1 : 0)) {
                    llllllllllllIllllIlllIIIllIllllI = EnumRailDirection.NORTH_SOUTH;
                }
                if (!lIIIIIllIIlllllI(llllllllllllIllllIlllIIIlllIIIII ? 1 : 0) || lIIIIIllIIllllII(llllllllllllIllllIlllIIIllIlllll ? 1 : 0)) {
                    llllllllllllIllllIlllIIIllIllllI = EnumRailDirection.EAST_WEST;
                }
                if (lIIIIIllIIlllllI(this.isPowered ? 1 : 0)) {
                    if (lIIIIIllIIllllII(llllllllllllIllllIlllIIIlllIlIII ? 1 : 0)) {
                        if (lIIIIIllIIllllII(llllllllllllIllllIlllIIIlllIIIIl ? 1 : 0) && lIIIIIllIIllllII(llllllllllllIllllIlllIIIllIlllll ? 1 : 0)) {
                            llllllllllllIllllIlllIIIllIllllI = EnumRailDirection.SOUTH_EAST;
                        }
                        if (lIIIIIllIIllllII(llllllllllllIllllIlllIIIlllIIIII ? 1 : 0) && lIIIIIllIIllllII(llllllllllllIllllIlllIIIlllIIIIl ? 1 : 0)) {
                            llllllllllllIllllIlllIIIllIllllI = EnumRailDirection.SOUTH_WEST;
                        }
                        if (lIIIIIllIIllllII(llllllllllllIllllIlllIIIllIlllll ? 1 : 0) && lIIIIIllIIllllII(llllllllllllIllllIlllIIIlllIIIlI ? 1 : 0)) {
                            llllllllllllIllllIlllIIIllIllllI = EnumRailDirection.NORTH_EAST;
                        }
                        if (lIIIIIllIIllllII(llllllllllllIllllIlllIIIlllIIIlI ? 1 : 0) && lIIIIIllIIllllII(llllllllllllIllllIlllIIIlllIIIII ? 1 : 0)) {
                            llllllllllllIllllIlllIIIllIllllI = EnumRailDirection.NORTH_WEST;
                            "".length();
                            if ("  ".length() > "   ".length()) {
                                return null;
                            }
                        }
                    }
                    else {
                        if (lIIIIIllIIllllII(llllllllllllIllllIlllIIIlllIIIlI ? 1 : 0) && lIIIIIllIIllllII(llllllllllllIllllIlllIIIlllIIIII ? 1 : 0)) {
                            llllllllllllIllllIlllIIIllIllllI = EnumRailDirection.NORTH_WEST;
                        }
                        if (lIIIIIllIIllllII(llllllllllllIllllIlllIIIllIlllll ? 1 : 0) && lIIIIIllIIllllII(llllllllllllIllllIlllIIIlllIIIlI ? 1 : 0)) {
                            llllllllllllIllllIlllIIIllIllllI = EnumRailDirection.NORTH_EAST;
                        }
                        if (lIIIIIllIIllllII(llllllllllllIllllIlllIIIlllIIIII ? 1 : 0) && lIIIIIllIIllllII(llllllllllllIllllIlllIIIlllIIIIl ? 1 : 0)) {
                            llllllllllllIllllIlllIIIllIllllI = EnumRailDirection.SOUTH_WEST;
                        }
                        if (lIIIIIllIIllllII(llllllllllllIllllIlllIIIlllIIIIl ? 1 : 0) && lIIIIIllIIllllII(llllllllllllIllllIlllIIIllIlllll ? 1 : 0)) {
                            llllllllllllIllllIlllIIIllIllllI = EnumRailDirection.SOUTH_EAST;
                        }
                    }
                }
            }
            if (lIIIIIllIlIIIIII(llllllllllllIllllIlllIIIllIllllI, EnumRailDirection.NORTH_SOUTH)) {
                if (lIIIIIllIIllllII(BlockRailBase.isRailBlock(this.world, llllllllllllIllllIlllIIIlllIIllI.up()) ? 1 : 0)) {
                    llllllllllllIllllIlllIIIllIllllI = EnumRailDirection.ASCENDING_NORTH;
                }
                if (lIIIIIllIIllllII(BlockRailBase.isRailBlock(this.world, llllllllllllIllllIlllIIIlllIIlIl.up()) ? 1 : 0)) {
                    llllllllllllIllllIlllIIIllIllllI = EnumRailDirection.ASCENDING_SOUTH;
                }
            }
            if (lIIIIIllIlIIIIII(llllllllllllIllllIlllIIIllIllllI, EnumRailDirection.EAST_WEST)) {
                if (lIIIIIllIIllllII(BlockRailBase.isRailBlock(this.world, llllllllllllIllllIlllIIIlllIIIll.up()) ? 1 : 0)) {
                    llllllllllllIllllIlllIIIllIllllI = EnumRailDirection.ASCENDING_EAST;
                }
                if (lIIIIIllIIllllII(BlockRailBase.isRailBlock(this.world, llllllllllllIllllIlllIIIlllIIlII.up()) ? 1 : 0)) {
                    llllllllllllIllllIlllIIIllIllllI = EnumRailDirection.ASCENDING_WEST;
                }
            }
            if (lIIIIIllIlIIIIIl(llllllllllllIllllIlllIIIllIllllI)) {
                llllllllllllIllllIlllIIIllIllllI = EnumRailDirection.NORTH_SOUTH;
            }
            this.func_180360_a(llllllllllllIllllIlllIIIllIllllI);
            this.state = this.state.withProperty(this.block.getShapeProperty(), llllllllllllIllllIlllIIIllIllllI);
            if (!lIIIIIllIIlllllI(llllllllllllIllllIlllIIIlllIIlll ? 1 : 0) || lIIIIIllIlIIIIlI(this.world.getBlockState(this.pos), this.state)) {
                this.world.setBlockState(this.pos, this.state, Rail.lIlllIllIlIIII[3]);
                "".length();
                int llllllllllllIllllIlllIIIllIlllIl = Rail.lIlllIllIlIIII[0];
                "".length();
                if (null != null) {
                    return null;
                }
                while (!lIIIIIllIIllllIl(llllllllllllIllllIlllIIIllIlllIl, this.field_150657_g.size())) {
                    final Rail llllllllllllIllllIlllIIIllIlllII = this.findRailAt(this.field_150657_g.get(llllllllllllIllllIlllIIIllIlllIl));
                    if (lIIIIIllIIlllIll(llllllllllllIllllIlllIIIllIlllII)) {
                        llllllllllllIllllIlllIIIllIlllII.func_150651_b();
                        if (lIIIIIllIIllllII(llllllllllllIllllIlllIIIllIlllII.func_150649_b(this) ? 1 : 0)) {
                            llllllllllllIllllIlllIIIllIlllII.func_150645_c(this);
                        }
                    }
                    ++llllllllllllIllllIlllIIIllIlllIl;
                }
            }
            return this;
        }
        
        public IBlockState getBlockState() {
            return this.state;
        }
        
        private void func_180360_a(final EnumRailDirection llllllllllllIllllIlllIIlIlllIIlI) {
            this.field_150657_g.clear();
            switch ($SWITCH_TABLE$net$minecraft$block$BlockRailBase$EnumRailDirection()[llllllllllllIllllIlllIIlIlllIIlI.ordinal()]) {
                case 1: {
                    this.field_150657_g.add(this.pos.north());
                    "".length();
                    this.field_150657_g.add(this.pos.south());
                    "".length();
                    "".length();
                    if (" ".length() > (17 + 39 + 34 + 48 ^ 31 + 107 - 89 + 93)) {
                        return;
                    }
                    break;
                }
                case 2: {
                    this.field_150657_g.add(this.pos.west());
                    "".length();
                    this.field_150657_g.add(this.pos.east());
                    "".length();
                    "".length();
                    if ("  ".length() <= " ".length()) {
                        return;
                    }
                    break;
                }
                case 3: {
                    this.field_150657_g.add(this.pos.west());
                    "".length();
                    this.field_150657_g.add(this.pos.east().up());
                    "".length();
                    "".length();
                    if ("  ".length() == (116 + 21 - 129 + 146 ^ 85 + 99 - 132 + 106)) {
                        return;
                    }
                    break;
                }
                case 4: {
                    this.field_150657_g.add(this.pos.west().up());
                    "".length();
                    this.field_150657_g.add(this.pos.east());
                    "".length();
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
                case 5: {
                    this.field_150657_g.add(this.pos.north().up());
                    "".length();
                    this.field_150657_g.add(this.pos.south());
                    "".length();
                    "".length();
                    if ("  ".length() == 0) {
                        return;
                    }
                    break;
                }
                case 6: {
                    this.field_150657_g.add(this.pos.north());
                    "".length();
                    this.field_150657_g.add(this.pos.south().up());
                    "".length();
                    "".length();
                    if ("   ".length() <= 0) {
                        return;
                    }
                    break;
                }
                case 7: {
                    this.field_150657_g.add(this.pos.east());
                    "".length();
                    this.field_150657_g.add(this.pos.south());
                    "".length();
                    "".length();
                    if (" ".length() <= 0) {
                        return;
                    }
                    break;
                }
                case 8: {
                    this.field_150657_g.add(this.pos.west());
                    "".length();
                    this.field_150657_g.add(this.pos.south());
                    "".length();
                    "".length();
                    if (" ".length() != " ".length()) {
                        return;
                    }
                    break;
                }
                case 9: {
                    this.field_150657_g.add(this.pos.west());
                    "".length();
                    this.field_150657_g.add(this.pos.north());
                    "".length();
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
                case 10: {
                    this.field_150657_g.add(this.pos.east());
                    "".length();
                    this.field_150657_g.add(this.pos.north());
                    "".length();
                    break;
                }
            }
        }
        
        private static boolean lIIIIIllIlIIIIlI(final Object llllllllllllIllllIlllIIIlIlllllI, final Object llllllllllllIllllIlllIIIlIllllIl) {
            return llllllllllllIllllIlllIIIlIlllllI != llllllllllllIllllIlllIIIlIllllIl;
        }
        
        private static boolean lIIIIIllIlIIIIIl(final Object llllllllllllIllllIlllIIIlIllIlIl) {
            return llllllllllllIllllIlllIIIlIllIlIl == null;
        }
        
        static {
            lIIIIIllIIlllIlI();
        }
        
        private static boolean lIIIIIllIIllllll(final int llllllllllllIllllIlllIIIllIIIllI, final int llllllllllllIllllIlllIIIllIIIlIl) {
            return llllllllllllIllllIlllIIIllIIIllI == llllllllllllIllllIlllIIIllIIIlIl;
        }
        
        private boolean func_180363_c(final BlockPos llllllllllllIllllIlllIIlIIlllIIl) {
            int llllllllllllIllllIlllIIlIIlllIII = Rail.lIlllIllIlIIII[0];
            "".length();
            if (((0x6B ^ 0x2B) & ~(0x4 ^ 0x44)) != ((0x0 ^ 0x54) & ~(0x5 ^ 0x51))) {
                return ((0xDD ^ 0x9F) & ~(0x6C ^ 0x2E)) != 0x0;
            }
            while (!lIIIIIllIIllllIl(llllllllllllIllllIlllIIlIIlllIII, this.field_150657_g.size())) {
                final BlockPos llllllllllllIllllIlllIIlIIllIlll = this.field_150657_g.get(llllllllllllIllllIlllIIlIIlllIII);
                if (lIIIIIllIIllllll(llllllllllllIllllIlllIIlIIllIlll.getX(), llllllllllllIllllIlllIIlIIlllIIl.getX()) && lIIIIIllIIllllll(llllllllllllIllllIlllIIlIIllIlll.getZ(), llllllllllllIllllIlllIIlIIlllIIl.getZ())) {
                    return Rail.lIlllIllIlIIII[1] != 0;
                }
                ++llllllllllllIllllIlllIIlIIlllIII;
            }
            return Rail.lIlllIllIlIIII[0] != 0;
        }
    }
}
