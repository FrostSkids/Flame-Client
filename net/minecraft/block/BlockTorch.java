// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Iterator;
import com.google.common.base.Predicate;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.state.BlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumParticleTypes;
import java.util.Random;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyDirection;

public class BlockTorch extends Block
{
    public static final /* synthetic */ PropertyDirection FACING;
    private static final /* synthetic */ int[] lIllllIlllIlII;
    private static final /* synthetic */ String[] lIllllIlllIIlI;
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIllllIlIIIIIlIIlllll) {
        IBlockState llllllllllllIllllIlIIIIIlIlIIIIl = this.getDefaultState();
        switch (llllllllllllIllllIlIIIIIlIIlllll) {
            case 1: {
                llllllllllllIllllIlIIIIIlIlIIIIl = llllllllllllIllllIlIIIIIlIlIIIIl.withProperty((IProperty<Comparable>)BlockTorch.FACING, EnumFacing.EAST);
                "".length();
                if ((0x92 ^ 0x9D ^ (0x2A ^ 0x21)) != (0x60 ^ 0x6C ^ (0x30 ^ 0x38))) {
                    return null;
                }
                break;
            }
            case 2: {
                llllllllllllIllllIlIIIIIlIlIIIIl = llllllllllllIllllIlIIIIIlIlIIIIl.withProperty((IProperty<Comparable>)BlockTorch.FACING, EnumFacing.WEST);
                "".length();
                if ("   ".length() != "   ".length()) {
                    return null;
                }
                break;
            }
            case 3: {
                llllllllllllIllllIlIIIIIlIlIIIIl = llllllllllllIllllIlIIIIIlIlIIIIl.withProperty((IProperty<Comparable>)BlockTorch.FACING, EnumFacing.SOUTH);
                "".length();
                if ("  ".length() != "  ".length()) {
                    return null;
                }
                break;
            }
            case 4: {
                llllllllllllIllllIlIIIIIlIlIIIIl = llllllllllllIllllIlIIIIIlIlIIIIl.withProperty((IProperty<Comparable>)BlockTorch.FACING, EnumFacing.NORTH);
                "".length();
                if (" ".length() <= 0) {
                    return null;
                }
                break;
            }
            default: {
                llllllllllllIllllIlIIIIIlIlIIIIl = llllllllllllIllllIlIIIIIlIlIIIIl.withProperty((IProperty<Comparable>)BlockTorch.FACING, EnumFacing.UP);
                break;
            }
        }
        return llllllllllllIllllIlIIIIIlIlIIIIl;
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World llllllllllllIllllIlIIIIlIlIllllI, final BlockPos llllllllllllIllllIlIIIIlIlIlllIl, final IBlockState llllllllllllIllllIlIIIIlIlIlllII) {
        return null;
    }
    
    private static String lIIIIlIIllIlllIl(final String llllllllllllIllllIlIIIIIlIIIlIlI, final String llllllllllllIllllIlIIIIIlIIIIlll) {
        try {
            final SecretKeySpec llllllllllllIllllIlIIIIIlIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIIIIIlIIIIlll.getBytes(StandardCharsets.UTF_8)), BlockTorch.lIllllIlllIlII[7]), "DES");
            final Cipher llllllllllllIllllIlIIIIIlIIIllII = Cipher.getInstance("DES");
            llllllllllllIllllIlIIIIIlIIIllII.init(BlockTorch.lIllllIlllIlII[2], llllllllllllIllllIlIIIIIlIIIllIl);
            return new String(llllllllllllIllllIlIIIIIlIIIllII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIIIIIlIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlIIIIIlIIIlIll) {
            llllllllllllIllllIlIIIIIlIIIlIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean isFullCube() {
        return BlockTorch.lIllllIlllIlII[0] != 0;
    }
    
    private static void lIIIIlIIllIllllI() {
        (lIllllIlllIIlI = new String[BlockTorch.lIllllIlllIlII[1]])[BlockTorch.lIllllIlllIlII[0]] = lIIIIlIIllIlllIl("01+JxYTS1DE=", "UvhvP");
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockTorch.lIllllIlllIlII[0] != 0;
    }
    
    private static void lIIIIlIIlllIIIll() {
        (lIllllIlllIlII = new int[8])[0] = ((0x3 ^ 0x36 ^ 48 + 87 - 43 + 35) & (0x9 ^ 0x2A ^ (0x47 ^ 0x2E) ^ -" ".length()));
        BlockTorch.lIllllIlllIlII[1] = " ".length();
        BlockTorch.lIllllIlllIlII[2] = "  ".length();
        BlockTorch.lIllllIlllIlII[3] = "   ".length();
        BlockTorch.lIllllIlllIlII[4] = (0x77 ^ 0x73);
        BlockTorch.lIllllIlllIlII[5] = (95 + 133 - 80 + 29 ^ 139 + 152 - 179 + 68);
        BlockTorch.lIllllIlllIlII[6] = (0xA ^ 0x6D ^ (0x32 ^ 0x53));
        BlockTorch.lIllllIlllIlII[7] = (0xD8 ^ 0x88 ^ (0xC2 ^ 0x9A));
    }
    
    protected boolean checkForDrop(final World llllllllllllIllllIlIIIIIllIlllll, final BlockPos llllllllllllIllllIlIIIIIlllIIIlI, final IBlockState llllllllllllIllllIlIIIIIllIlllIl) {
        if (lIIIIlIIlllIIlll(llllllllllllIllllIlIIIIIllIlllIl.getBlock(), this) && lIIIIlIIlllIIlII(this.canPlaceAt(llllllllllllIllllIlIIIIIllIlllll, llllllllllllIllllIlIIIIIlllIIIlI, llllllllllllIllllIlIIIIIllIlllIl.getValue((IProperty<EnumFacing>)BlockTorch.FACING)) ? 1 : 0)) {
            return BlockTorch.lIllllIlllIlII[1] != 0;
        }
        if (lIIIIlIIlllIIlll(llllllllllllIllllIlIIIIIllIlllll.getBlockState(llllllllllllIllllIlIIIIIlllIIIlI).getBlock(), this)) {
            this.dropBlockAsItem(llllllllllllIllllIlIIIIIllIlllll, llllllllllllIllllIlIIIIIlllIIIlI, llllllllllllIllllIlIIIIIllIlllIl, BlockTorch.lIllllIlllIlII[0]);
            llllllllllllIllllIlIIIIIllIlllll.setBlockToAir(llllllllllllIllllIlIIIIIlllIIIlI);
            "".length();
        }
        return BlockTorch.lIllllIlllIlII[0] != 0;
    }
    
    @Override
    public void randomDisplayTick(final World llllllllllllIllllIlIIIIIlIllIIII, final BlockPos llllllllllllIllllIlIIIIIlIlIllll, final IBlockState llllllllllllIllllIlIIIIIlIlllIlI, final Random llllllllllllIllllIlIIIIIlIlllIIl) {
        final EnumFacing llllllllllllIllllIlIIIIIlIlllIII = llllllllllllIllllIlIIIIIlIlllIlI.getValue((IProperty<EnumFacing>)BlockTorch.FACING);
        final double llllllllllllIllllIlIIIIIlIllIlll = llllllllllllIllllIlIIIIIlIlIllll.getX() + 0.5;
        final double llllllllllllIllllIlIIIIIlIllIllI = llllllllllllIllllIlIIIIIlIlIllll.getY() + 0.7;
        final double llllllllllllIllllIlIIIIIlIllIlIl = llllllllllllIllllIlIIIIIlIlIllll.getZ() + 0.5;
        final double llllllllllllIllllIlIIIIIlIllIlII = 0.22;
        final double llllllllllllIllllIlIIIIIlIllIIll = 0.27;
        if (lIIIIlIIlllIIlII(llllllllllllIllllIlIIIIIlIlllIII.getAxis().isHorizontal() ? 1 : 0)) {
            final EnumFacing llllllllllllIllllIlIIIIIlIllIIlI = llllllllllllIllllIlIIIIIlIlllIII.getOpposite();
            llllllllllllIllllIlIIIIIlIllIIII.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, llllllllllllIllllIlIIIIIlIllIlll + llllllllllllIllllIlIIIIIlIllIIll * llllllllllllIllllIlIIIIIlIllIIlI.getFrontOffsetX(), llllllllllllIllllIlIIIIIlIllIllI + llllllllllllIllllIlIIIIIlIllIlII, llllllllllllIllllIlIIIIIlIllIlIl + llllllllllllIllllIlIIIIIlIllIIll * llllllllllllIllllIlIIIIIlIllIIlI.getFrontOffsetZ(), 0.0, 0.0, 0.0, new int[BlockTorch.lIllllIlllIlII[0]]);
            llllllllllllIllllIlIIIIIlIllIIII.spawnParticle(EnumParticleTypes.FLAME, llllllllllllIllllIlIIIIIlIllIlll + llllllllllllIllllIlIIIIIlIllIIll * llllllllllllIllllIlIIIIIlIllIIlI.getFrontOffsetX(), llllllllllllIllllIlIIIIIlIllIllI + llllllllllllIllllIlIIIIIlIllIlII, llllllllllllIllllIlIIIIIlIllIlIl + llllllllllllIllllIlIIIIIlIllIIll * llllllllllllIllllIlIIIIIlIllIIlI.getFrontOffsetZ(), 0.0, 0.0, 0.0, new int[BlockTorch.lIllllIlllIlII[0]]);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            llllllllllllIllllIlIIIIIlIllIIII.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, llllllllllllIllllIlIIIIIlIllIlll, llllllllllllIllllIlIIIIIlIllIllI, llllllllllllIllllIlIIIIIlIllIlIl, 0.0, 0.0, 0.0, new int[BlockTorch.lIllllIlllIlII[0]]);
            llllllllllllIllllIlIIIIIlIllIIII.spawnParticle(EnumParticleTypes.FLAME, llllllllllllIllllIlIIIIIlIllIlll, llllllllllllIllllIlIIIIIlIllIllI, llllllllllllIllllIlIIIIIlIllIlIl, 0.0, 0.0, 0.0, new int[BlockTorch.lIllllIlllIlII[0]]);
        }
    }
    
    protected BlockTorch() {
        super(Material.circuits);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockTorch.FACING, EnumFacing.UP));
        this.setTickRandomly((boolean)(BlockTorch.lIllllIlllIlII[1] != 0));
        "".length();
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
    }
    
    private static boolean lIIIIlIIlllIIllI(final Object llllllllllllIllllIlIIIIIlIIIIIlI, final Object llllllllllllIllllIlIIIIIlIIIIIIl) {
        return llllllllllllIllllIlIIIIIlIIIIIlI != llllllllllllIllllIlIIIIIlIIIIIIl;
    }
    
    @Override
    public MovingObjectPosition collisionRayTrace(final World llllllllllllIllllIlIIIIIllIlIlII, final BlockPos llllllllllllIllllIlIIIIIllIIllII, final Vec3 llllllllllllIllllIlIIIIIllIIlIll, final Vec3 llllllllllllIllllIlIIIIIllIIlIlI) {
        final EnumFacing llllllllllllIllllIlIIIIIllIlIIII = llllllllllllIllllIlIIIIIllIlIlII.getBlockState(llllllllllllIllllIlIIIIIllIIllII).getValue((IProperty<EnumFacing>)BlockTorch.FACING);
        float llllllllllllIllllIlIIIIIllIIllll = 0.15f;
        if (lIIIIlIIlllIIlll(llllllllllllIllllIlIIIIIllIlIIII, EnumFacing.EAST)) {
            this.setBlockBounds(0.0f, 0.2f, 0.5f - llllllllllllIllllIlIIIIIllIIllll, llllllllllllIllllIlIIIIIllIIllll * 2.0f, 0.8f, 0.5f + llllllllllllIllllIlIIIIIllIIllll);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (lIIIIlIIlllIIlll(llllllllllllIllllIlIIIIIllIlIIII, EnumFacing.WEST)) {
            this.setBlockBounds(1.0f - llllllllllllIllllIlIIIIIllIIllll * 2.0f, 0.2f, 0.5f - llllllllllllIllllIlIIIIIllIIllll, 1.0f, 0.8f, 0.5f + llllllllllllIllllIlIIIIIllIIllll);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (lIIIIlIIlllIIlll(llllllllllllIllllIlIIIIIllIlIIII, EnumFacing.SOUTH)) {
            this.setBlockBounds(0.5f - llllllllllllIllllIlIIIIIllIIllll, 0.2f, 0.0f, 0.5f + llllllllllllIllllIlIIIIIllIIllll, 0.8f, llllllllllllIllllIlIIIIIllIIllll * 2.0f);
            "".length();
            if (" ".length() >= "   ".length()) {
                return null;
            }
        }
        else if (lIIIIlIIlllIIlll(llllllllllllIllllIlIIIIIllIlIIII, EnumFacing.NORTH)) {
            this.setBlockBounds(0.5f - llllllllllllIllllIlIIIIIllIIllll, 0.2f, 1.0f - llllllllllllIllllIlIIIIIllIIllll * 2.0f, 0.5f + llllllllllllIllllIlIIIIIllIIllll, 0.8f, 1.0f);
            "".length();
            if ((0xD3 ^ 0xB0 ^ (0x30 ^ 0x57)) == 0x0) {
                return null;
            }
        }
        else {
            llllllllllllIllllIlIIIIIllIIllll = 0.1f;
            this.setBlockBounds(0.5f - llllllllllllIllllIlIIIIIllIIllll, 0.0f, 0.5f - llllllllllllIllllIlIIIIIllIIllll, 0.5f + llllllllllllIllllIlIIIIIllIIllll, 0.6f, 0.5f + llllllllllllIllllIlIIIIIllIIllll);
        }
        return super.collisionRayTrace(llllllllllllIllllIlIIIIIllIlIlII, llllllllllllIllllIlIIIIIllIIllII, llllllllllllIllllIlIIIIIllIIlIll, llllllllllllIllllIlIIIIIllIIlIlI);
    }
    
    private static boolean lIIIIlIIlllIIlII(final int llllllllllllIllllIlIIIIIIllllIIl) {
        return llllllllllllIllllIlIIIIIIllllIIl != 0;
    }
    
    protected boolean onNeighborChangeInternal(final World llllllllllllIllllIlIIIIIllllIlll, final BlockPos llllllllllllIllllIlIIIIIllllIllI, final IBlockState llllllllllllIllllIlIIIIIlllIllIl) {
        if (lIIIIlIIlllIIlIl(this.checkForDrop(llllllllllllIllllIlIIIIIllllIlll, llllllllllllIllllIlIIIIIllllIllI, llllllllllllIllllIlIIIIIlllIllIl) ? 1 : 0)) {
            return BlockTorch.lIllllIlllIlII[1] != 0;
        }
        final EnumFacing llllllllllllIllllIlIIIIIllllIlII = llllllllllllIllllIlIIIIIlllIllIl.getValue((IProperty<EnumFacing>)BlockTorch.FACING);
        final EnumFacing.Axis llllllllllllIllllIlIIIIIllllIIll = llllllllllllIllllIlIIIIIllllIlII.getAxis();
        final EnumFacing llllllllllllIllllIlIIIIIllllIIlI = llllllllllllIllllIlIIIIIllllIlII.getOpposite();
        boolean llllllllllllIllllIlIIIIIllllIIIl = BlockTorch.lIllllIlllIlII[0] != 0;
        if (lIIIIlIIlllIIlII(llllllllllllIllllIlIIIIIllllIIll.isHorizontal() ? 1 : 0) && lIIIIlIIlllIIlIl(llllllllllllIllllIlIIIIIllllIlll.isBlockNormalCube(llllllllllllIllllIlIIIIIllllIllI.offset(llllllllllllIllllIlIIIIIllllIIlI), (boolean)(BlockTorch.lIllllIlllIlII[1] != 0)) ? 1 : 0)) {
            llllllllllllIllllIlIIIIIllllIIIl = (BlockTorch.lIllllIlllIlII[1] != 0);
            "".length();
            if (null != null) {
                return ((0xDA ^ 0xC7 ^ (0xC ^ 0x5A)) & (0x6C ^ 0x49 ^ (0x2A ^ 0x44) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIIIIlIIlllIIlII(llllllllllllIllllIlIIIIIllllIIll.isVertical() ? 1 : 0) && lIIIIlIIlllIIlIl(this.canPlaceOn(llllllllllllIllllIlIIIIIllllIlll, llllllllllllIllllIlIIIIIllllIllI.offset(llllllllllllIllllIlIIIIIllllIIlI)) ? 1 : 0)) {
            llllllllllllIllllIlIIIIIllllIIIl = (BlockTorch.lIllllIlllIlII[1] != 0);
        }
        if (lIIIIlIIlllIIlII(llllllllllllIllllIlIIIIIllllIIIl ? 1 : 0)) {
            this.dropBlockAsItem(llllllllllllIllllIlIIIIIllllIlll, llllllllllllIllllIlIIIIIllllIllI, llllllllllllIllllIlIIIIIlllIllIl, BlockTorch.lIllllIlllIlII[0]);
            llllllllllllIllllIlIIIIIllllIlll.setBlockToAir(llllllllllllIllllIlIIIIIllllIllI);
            "".length();
            return BlockTorch.lIllllIlllIlII[1] != 0;
        }
        return BlockTorch.lIllllIlllIlII[0] != 0;
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT;
    }
    
    @Override
    public IBlockState onBlockPlaced(final World llllllllllllIllllIlIIIIlIIIllllI, final BlockPos llllllllllllIllllIlIIIIlIIlIIlll, final EnumFacing llllllllllllIllllIlIIIIlIIlIIllI, final float llllllllllllIllllIlIIIIlIIlIIlIl, final float llllllllllllIllllIlIIIIlIIlIIlII, final float llllllllllllIllllIlIIIIlIIlIIIll, final int llllllllllllIllllIlIIIIlIIlIIIlI, final EntityLivingBase llllllllllllIllllIlIIIIlIIlIIIIl) {
        if (lIIIIlIIlllIIlII(this.canPlaceAt(llllllllllllIllllIlIIIIlIIIllllI, llllllllllllIllllIlIIIIlIIlIIlll, llllllllllllIllllIlIIIIlIIlIIllI) ? 1 : 0)) {
            return this.getDefaultState().withProperty((IProperty<Comparable>)BlockTorch.FACING, llllllllllllIllllIlIIIIlIIlIIllI);
        }
        final Exception llllllllllllIllllIlIIIIlIIIllIlI = (Exception)EnumFacing.Plane.HORIZONTAL.iterator();
        "".length();
        if ((0x92 ^ 0x96) < 0) {
            return null;
        }
        while (!lIIIIlIIlllIIlIl(((Iterator)llllllllllllIllllIlIIIIlIIIllIlI).hasNext() ? 1 : 0)) {
            final EnumFacing llllllllllllIllllIlIIIIlIIlIIIII = ((Iterator<EnumFacing>)llllllllllllIllllIlIIIIlIIIllIlI).next();
            if (lIIIIlIIlllIIlII(llllllllllllIllllIlIIIIlIIIllllI.isBlockNormalCube(llllllllllllIllllIlIIIIlIIlIIlll.offset(llllllllllllIllllIlIIIIlIIlIIIII.getOpposite()), (boolean)(BlockTorch.lIllllIlllIlII[1] != 0)) ? 1 : 0)) {
                return this.getDefaultState().withProperty((IProperty<Comparable>)BlockTorch.FACING, llllllllllllIllllIlIIIIlIIlIIIII);
            }
        }
        return this.getDefaultState();
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing = BlockTorch.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
        if (lIIIIlIIlllIlIII($switch_TABLE$net$minecraft$util$EnumFacing)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing;
        }
        "".length();
        final long llllllllllllIllllIlIIIIIlIIlIIlI = (Object)new int[EnumFacing.values().length];
        try {
            llllllllllllIllllIlIIIIIlIIlIIlI[EnumFacing.DOWN.ordinal()] = BlockTorch.lIllllIlllIlII[1];
            "".length();
            if ((0x44 ^ 0x41) == 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIllllIlIIIIIlIIlIIlI[EnumFacing.EAST.ordinal()] = BlockTorch.lIllllIlllIlII[6];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIllllIlIIIIIlIIlIIlI[EnumFacing.NORTH.ordinal()] = BlockTorch.lIllllIlllIlII[3];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIllllIlIIIIIlIIlIIlI[EnumFacing.SOUTH.ordinal()] = BlockTorch.lIllllIlllIlII[4];
            "".length();
            if (" ".length() > " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            llllllllllllIllllIlIIIIIlIIlIIlI[EnumFacing.UP.ordinal()] = BlockTorch.lIllllIlllIlII[2];
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            llllllllllllIllllIlIIIIIlIIlIIlI[EnumFacing.WEST.ordinal()] = BlockTorch.lIllllIlllIlII[5];
            "".length();
            if ((0x71 ^ 0x74) <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return BlockTorch.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)llllllllllllIllllIlIIIIIlIIlIIlI;
    }
    
    private boolean canPlaceAt(final World llllllllllllIllllIlIIIIlIIlllIlI, final BlockPos llllllllllllIllllIlIIIIlIIllIIll, final EnumFacing llllllllllllIllllIlIIIIlIIllIIlI) {
        final BlockPos llllllllllllIllllIlIIIIlIIllIlll = llllllllllllIllllIlIIIIlIIllIIll.offset(llllllllllllIllllIlIIIIlIIllIIlI.getOpposite());
        final boolean llllllllllllIllllIlIIIIlIIllIllI = llllllllllllIllllIlIIIIlIIllIIlI.getAxis().isHorizontal();
        if ((!lIIIIlIIlllIIlII(llllllllllllIllllIlIIIIlIIllIllI ? 1 : 0) || lIIIIlIIlllIIlIl(llllllllllllIllllIlIIIIlIIlllIlI.isBlockNormalCube(llllllllllllIllllIlIIIIlIIllIlll, (boolean)(BlockTorch.lIllllIlllIlII[1] != 0)) ? 1 : 0)) && (!lIIIIlIIlllIIlII(llllllllllllIllllIlIIIIlIIllIIlI.equals(EnumFacing.UP) ? 1 : 0) || lIIIIlIIlllIIlIl(this.canPlaceOn(llllllllllllIllllIlIIIIlIIlllIlI, llllllllllllIllllIlIIIIlIIllIlll) ? 1 : 0))) {
            return BlockTorch.lIllllIlllIlII[0] != 0;
        }
        return BlockTorch.lIllllIlllIlII[1] != 0;
    }
    
    private static boolean lIIIIlIIlllIIlll(final Object llllllllllllIllllIlIIIIIIllllllI, final Object llllllllllllIllllIlIIIIIIlllllIl) {
        return llllllllllllIllllIlIIIIIIllllllI == llllllllllllIllllIlIIIIIIlllllIl;
    }
    
    @Override
    public boolean canPlaceBlockAt(final World llllllllllllIllllIlIIIIlIlIIlIIl, final BlockPos llllllllllllIllllIlIIIIlIlIIIlII) {
        final long llllllllllllIllllIlIIIIlIlIIIIlI = (long)BlockTorch.FACING.getAllowedValues().iterator();
        "".length();
        if ((0x6E ^ 0x5B ^ (0xA9 ^ 0x99)) == 0x0) {
            return ((0xCC ^ 0xB0 ^ (0x79 ^ 0x3)) & (0xC7 ^ 0x8B ^ (0xF9 ^ 0xB3) ^ -" ".length())) != 0x0;
        }
        while (!lIIIIlIIlllIIlIl(((Iterator)llllllllllllIllllIlIIIIlIlIIIIlI).hasNext() ? 1 : 0)) {
            final EnumFacing llllllllllllIllllIlIIIIlIlIIIlll = ((Iterator<EnumFacing>)llllllllllllIllllIlIIIIlIlIIIIlI).next();
            if (lIIIIlIIlllIIlII(this.canPlaceAt(llllllllllllIllllIlIIIIlIlIIlIIl, llllllllllllIllllIlIIIIlIlIIIlII, llllllllllllIllllIlIIIIlIlIIIlll) ? 1 : 0)) {
                return BlockTorch.lIllllIlllIlII[1] != 0;
            }
        }
        return BlockTorch.lIllllIlllIlII[0] != 0;
    }
    
    private static boolean lIIIIlIIlllIlIII(final Object llllllllllllIllllIlIIIIIIllllIll) {
        return llllllllllllIllllIlIIIIIIllllIll != null;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockTorch.lIllllIlllIlII[1]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockTorch.lIllllIlllIlII[0]] = BlockTorch.FACING;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private boolean canPlaceOn(final World llllllllllllIllllIlIIIIlIlIlIlIl, final BlockPos llllllllllllIllllIlIIIIlIlIlIIIl) {
        if (lIIIIlIIlllIIlII(World.doesBlockHaveSolidTopSurface(llllllllllllIllllIlIIIIlIlIlIlIl, llllllllllllIllllIlIIIIlIlIlIIIl) ? 1 : 0)) {
            return BlockTorch.lIllllIlllIlII[1] != 0;
        }
        final Block llllllllllllIllllIlIIIIlIlIlIIll = llllllllllllIllllIlIIIIlIlIlIlIl.getBlockState(llllllllllllIllllIlIIIIlIlIlIIIl).getBlock();
        if (lIIIIlIIlllIIlIl((llllllllllllIllllIlIIIIlIlIlIIll instanceof BlockFence) ? 1 : 0) && lIIIIlIIlllIIllI(llllllllllllIllllIlIIIIlIlIlIIll, Blocks.glass) && lIIIIlIIlllIIllI(llllllllllllIllllIlIIIIlIlIlIIll, Blocks.cobblestone_wall) && lIIIIlIIlllIIllI(llllllllllllIllllIlIIIIlIlIlIIll, Blocks.stained_glass)) {
            return BlockTorch.lIllllIlllIlII[0] != 0;
        }
        return BlockTorch.lIllllIlllIlII[1] != 0;
    }
    
    static {
        lIIIIlIIlllIIIll();
        lIIIIlIIllIllllI();
        FACING = PropertyDirection.create(BlockTorch.lIllllIlllIIlI[BlockTorch.lIllllIlllIlII[0]], (Predicate<EnumFacing>)new Predicate<EnumFacing>() {
            private static final /* synthetic */ int[] llIlIllllllllI;
            
            private static boolean lIIlIllIIIIllIII(final Object llllllllllllIllIlIIIlIIlIlIIlIll, final Object llllllllllllIllIlIIIlIIlIlIIlIlI) {
                return llllllllllllIllIlIIIlIIlIlIIlIll != llllllllllllIllIlIIIlIIlIlIIlIlI;
            }
            
            static {
                lIIlIllIIIIlIlll();
            }
            
            public boolean apply(final EnumFacing llllllllllllIllIlIIIlIIlIlIlIIll) {
                if (lIIlIllIIIIllIII(llllllllllllIllIlIIIlIIlIlIlIIll, EnumFacing.DOWN)) {
                    return BlockTorch$1.llIlIllllllllI[0] != 0;
                }
                return BlockTorch$1.llIlIllllllllI[1] != 0;
            }
            
            private static void lIIlIllIIIIlIlll() {
                (llIlIllllllllI = new int[2])[0] = " ".length();
                BlockTorch$1.llIlIllllllllI[1] = ((0x90 ^ 0xAF) & ~(0xBB ^ 0x84));
            }
        });
    }
    
    @Override
    public void onNeighborBlockChange(final World llllllllllllIllllIlIIIIlIIIIlIII, final BlockPos llllllllllllIllllIlIIIIlIIIIIIlI, final IBlockState llllllllllllIllllIlIIIIlIIIIIllI, final Block llllllllllllIllllIlIIIIlIIIIIlIl) {
        this.onNeighborChangeInternal(llllllllllllIllllIlIIIIlIIIIlIII, llllllllllllIllllIlIIIIlIIIIIIlI, llllllllllllIllllIlIIIIlIIIIIllI);
        "".length();
    }
    
    @Override
    public void onBlockAdded(final World llllllllllllIllllIlIIIIlIIIlIIII, final BlockPos llllllllllllIllllIlIIIIlIIIIllll, final IBlockState llllllllllllIllllIlIIIIlIIIIlllI) {
        this.checkForDrop(llllllllllllIllllIlIIIIlIIIlIIII, llllllllllllIllllIlIIIIlIIIIllll, llllllllllllIllllIlIIIIlIIIIlllI);
        "".length();
    }
    
    private static boolean lIIIIlIIlllIIlIl(final int llllllllllllIllllIlIIIIIIlllIlll) {
        return llllllllllllIllllIlIIIIIIlllIlll == 0;
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIllllIlIIIIIlIIllIII) {
        int llllllllllllIllllIlIIIIIlIIllIIl = BlockTorch.lIllllIlllIlII[0];
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[llllllllllllIllllIlIIIIIlIIllIII.getValue((IProperty<EnumFacing>)BlockTorch.FACING).ordinal()]) {
            case 6: {
                llllllllllllIllllIlIIIIIlIIllIIl |= BlockTorch.lIllllIlllIlII[1];
                "".length();
                if (((104 + 106 - 194 + 126 ^ 67 + 24 + 26 + 66) & (4 + 41 + 78 + 25 ^ 131 + 111 - 79 + 10 ^ -" ".length())) > (0x8E ^ 0xAE ^ (0x79 ^ 0x5D))) {
                    return (0x68 ^ 0x20 ^ (0x95 ^ 0x90)) & (0xF ^ 0x57 ^ (0xA4 ^ 0xB1) ^ -" ".length());
                }
                break;
            }
            case 5: {
                llllllllllllIllllIlIIIIIlIIllIIl |= BlockTorch.lIllllIlllIlII[2];
                "".length();
                if (((0xC6 ^ 0x8E) & ~(0xEC ^ 0xA4)) >= "   ".length()) {
                    return (0x86 ^ 0xC5) & ~(0x3A ^ 0x79);
                }
                break;
            }
            case 4: {
                llllllllllllIllllIlIIIIIlIIllIIl |= BlockTorch.lIllllIlllIlII[3];
                "".length();
                if (((0x2E ^ 0x1B) & ~(0x8 ^ 0x3D)) > "  ".length()) {
                    return (0x14 ^ 0x2E) & ~(0x2C ^ 0x16);
                }
                break;
            }
            case 3: {
                llllllllllllIllllIlIIIIIlIIllIIl |= BlockTorch.lIllllIlllIlII[4];
                "".length();
                if (null != null) {
                    return ("   ".length() ^ (0x9C ^ 0xA3)) & (0x79 ^ 0x66 ^ (0x37 ^ 0x14) ^ -" ".length());
                }
                break;
            }
            default: {
                llllllllllllIllllIlIIIIIlIIllIIl |= BlockTorch.lIllllIlllIlII[5];
                break;
            }
        }
        return llllllllllllIllllIlIIIIIlIIllIIl;
    }
}
