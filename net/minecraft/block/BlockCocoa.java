// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.item.ItemStack;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.block.state.BlockState;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.entity.EntityLivingBase;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.PropertyInteger;

public class BlockCocoa extends BlockDirectional implements IGrowable
{
    private static final /* synthetic */ int[] lllIllIlIIlIII;
    private static final /* synthetic */ String[] lllIllIlIIIlll;
    public static final /* synthetic */ PropertyInteger AGE;
    
    public boolean canBlockStay(final World llllllllllllIlIllIIlIIllIIIlIIlI, BlockPos llllllllllllIlIllIIlIIllIIIIllIl, final IBlockState llllllllllllIlIllIIlIIllIIIlIIII) {
        llllllllllllIlIllIIlIIllIIIIllIl = llllllllllllIlIllIIlIIllIIIIllIl.offset(llllllllllllIlIllIIlIIllIIIlIIII.getValue((IProperty<EnumFacing>)BlockCocoa.FACING));
        final IBlockState llllllllllllIlIllIIlIIllIIIIllll = llllllllllllIlIllIIlIIllIIIlIIlI.getBlockState(llllllllllllIlIllIIlIIllIIIIllIl);
        if (lIlIIlIIllIIIlIl(llllllllllllIlIllIIlIIllIIIIllll.getBlock(), Blocks.log) && lIlIIlIIllIIIlIl(llllllllllllIlIllIIlIIllIIIIllll.getValue(BlockPlanks.VARIANT), BlockPlanks.EnumType.JUNGLE)) {
            return BlockCocoa.lllIllIlIIlIII[2] != 0;
        }
        return BlockCocoa.lllIllIlIIlIII[0] != 0;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockCocoa.lllIllIlIIlIII[0] != 0;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockCocoa.lllIllIlIIlIII[0] != 0;
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIlIllIIlIIlIIllIIIll) {
        int llllllllllllIlIllIIlIIlIIllIIlII = BlockCocoa.lllIllIlIIlIII[0];
        llllllllllllIlIllIIlIIlIIllIIlII |= llllllllllllIlIllIIlIIlIIllIIIll.getValue((IProperty<EnumFacing>)BlockCocoa.FACING).getHorizontalIndex();
        llllllllllllIlIllIIlIIlIIllIIlII |= llllllllllllIlIllIIlIIlIIllIIIll.getValue((IProperty<Integer>)BlockCocoa.AGE) << BlockCocoa.lllIllIlIIlIII[1];
        return llllllllllllIlIllIIlIIlIIllIIlII;
    }
    
    private static boolean lIlIIlIIllIIIlll(final Object llllllllllllIlIllIIlIIlIIlIIIIlI) {
        return llllllllllllIlIllIIlIIlIIlIIIIlI != null;
    }
    
    private static void lIlIIlIIllIIIIIl() {
        (lllIllIlIIIlll = new String[BlockCocoa.lllIllIlIIlIII[2]])[BlockCocoa.lllIllIlIIlIII[0]] = lIlIIlIIllIIIIII("L1MmhpZJfKc=", "JLSdt");
    }
    
    @Override
    public boolean canGrow(final World llllllllllllIlIllIIlIIlIlIIIIlII, final BlockPos llllllllllllIlIllIIlIIlIlIIIIIll, final IBlockState llllllllllllIlIllIIlIIlIlIIIIIII, final boolean llllllllllllIlIllIIlIIlIlIIIIIIl) {
        if (lIlIIlIIllIIIlII(llllllllllllIlIllIIlIIlIlIIIIIII.getValue((IProperty<Integer>)BlockCocoa.AGE), BlockCocoa.lllIllIlIIlIII[1])) {
            return BlockCocoa.lllIllIlIIlIII[2] != 0;
        }
        return BlockCocoa.lllIllIlIIlIII[0] != 0;
    }
    
    private static boolean lIlIIlIIllIIIIll(final int llllllllllllIlIllIIlIIlIIlIIIIII) {
        return llllllllllllIlIllIIlIIlIIlIIIIII == 0;
    }
    
    @Override
    public void updateTick(final World llllllllllllIlIllIIlIIllIIIllIll, final BlockPos llllllllllllIlIllIIlIIllIIIllIlI, final IBlockState llllllllllllIlIllIIlIIllIIIlllll, final Random llllllllllllIlIllIIlIIllIIIllllI) {
        if (lIlIIlIIllIIIIll(this.canBlockStay(llllllllllllIlIllIIlIIllIIIllIll, llllllllllllIlIllIIlIIllIIIllIlI, llllllllllllIlIllIIlIIllIIIlllll) ? 1 : 0)) {
            this.dropBlock(llllllllllllIlIllIIlIIllIIIllIll, llllllllllllIlIllIIlIIllIIIllIlI, llllllllllllIlIllIIlIIllIIIlllll);
            "".length();
            if ("  ".length() <= ((0xDD ^ 0xBD) & ~(0xD4 ^ 0xB4))) {
                return;
            }
        }
        else if (lIlIIlIIllIIIIll(llllllllllllIlIllIIlIIllIIIllIll.rand.nextInt(BlockCocoa.lllIllIlIIlIII[3]))) {
            final int llllllllllllIlIllIIlIIllIIIlllIl = llllllllllllIlIllIIlIIllIIIlllll.getValue((IProperty<Integer>)BlockCocoa.AGE);
            if (lIlIIlIIllIIIlII(llllllllllllIlIllIIlIIllIIIlllIl, BlockCocoa.lllIllIlIIlIII[1])) {
                llllllllllllIlIllIIlIIllIIIllIll.setBlockState(llllllllllllIlIllIIlIIllIIIllIlI, llllllllllllIlIllIIlIIllIIIlllll.withProperty((IProperty<Comparable>)BlockCocoa.AGE, llllllllllllIlIllIIlIIllIIIlllIl + BlockCocoa.lllIllIlIIlIII[2]), BlockCocoa.lllIllIlIIlIII[1]);
                "".length();
            }
        }
    }
    
    @Override
    public IBlockState onBlockPlaced(final World llllllllllllIlIllIIlIIlIllIIIlII, final BlockPos llllllllllllIlIllIIlIIlIllIIIIll, EnumFacing llllllllllllIlIllIIlIIlIlIlllIll, final float llllllllllllIlIllIIlIIlIllIIIIIl, final float llllllllllllIlIllIIlIIlIllIIIIII, final float llllllllllllIlIllIIlIIlIlIllllll, final int llllllllllllIlIllIIlIIlIlIlllllI, final EntityLivingBase llllllllllllIlIllIIlIIlIlIllllIl) {
        if (lIlIIlIIllIIIIll(((EnumFacing)llllllllllllIlIllIIlIIlIlIlllIll).getAxis().isHorizontal() ? 1 : 0)) {
            llllllllllllIlIllIIlIIlIlIlllIll = EnumFacing.NORTH;
        }
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockCocoa.FACING, ((EnumFacing)llllllllllllIlIllIIlIIlIlIlllIll).getOpposite()).withProperty((IProperty<Comparable>)BlockCocoa.AGE, BlockCocoa.lllIllIlIIlIII[0]);
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIlIllIIlIIlIIllIlIIl) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockCocoa.FACING, EnumFacing.getHorizontal(llllllllllllIlIllIIlIIlIIllIlIIl)).withProperty((IProperty<Comparable>)BlockCocoa.AGE, (llllllllllllIlIllIIlIIlIIllIlIIl & BlockCocoa.lllIllIlIIlIII[6]) >> BlockCocoa.lllIllIlIIlIII[1]);
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing = BlockCocoa.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
        if (lIlIIlIIllIIIlll($switch_TABLE$net$minecraft$util$EnumFacing)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing;
        }
        "".length();
        final byte llllllllllllIlIllIIlIIlIIlIlllIl = (Object)new int[EnumFacing.values().length];
        try {
            llllllllllllIlIllIIlIIlIIlIlllIl[EnumFacing.DOWN.ordinal()] = BlockCocoa.lllIllIlIIlIII[2];
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIlIllIIlIIlIIlIlllIl[EnumFacing.EAST.ordinal()] = BlockCocoa.lllIllIlIIlIII[7];
            "".length();
            if (-" ".length() > "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIlIllIIlIIlIIlIlllIl[EnumFacing.NORTH.ordinal()] = BlockCocoa.lllIllIlIIlIII[5];
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIlIllIIlIIlIIlIlllIl[EnumFacing.SOUTH.ordinal()] = BlockCocoa.lllIllIlIIlIII[4];
            "".length();
            if (-" ".length() >= "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            llllllllllllIlIllIIlIIlIIlIlllIl[EnumFacing.UP.ordinal()] = BlockCocoa.lllIllIlIIlIII[1];
            "".length();
            if ((0x68 ^ 0x6C) == ((0x33 ^ 0x11) & ~(0x72 ^ 0x50))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            llllllllllllIlIllIIlIIlIIlIlllIl[EnumFacing.WEST.ordinal()] = BlockCocoa.lllIllIlIIlIII[3];
            "".length();
            if (((92 + 150 - 169 + 127 ^ 97 + 75 - 123 + 103) & (137 + 141 - 96 + 23 ^ 42 + 144 - 155 + 126 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return BlockCocoa.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)llllllllllllIlIllIIlIIlIIlIlllIl;
    }
    
    @Override
    public AxisAlignedBB getSelectedBoundingBox(final World llllllllllllIlIllIIlIIlIllllIlIl, final BlockPos llllllllllllIlIllIIlIIlIllllIlII) {
        this.setBlockBoundsBasedOnState(llllllllllllIlIllIIlIIlIllllIlIl, llllllllllllIlIllIIlIIlIllllIlII);
        return super.getSelectedBoundingBox(llllllllllllIlIllIIlIIlIllllIlIl, llllllllllllIlIllIIlIIlIllllIlII);
    }
    
    static {
        lIlIIlIIllIIIIlI();
        lIlIIlIIllIIIIIl();
        AGE = PropertyInteger.create(BlockCocoa.lllIllIlIIIlll[BlockCocoa.lllIllIlIIlIII[0]], BlockCocoa.lllIllIlIIlIII[0], BlockCocoa.lllIllIlIIlIII[1]);
    }
    
    @Override
    public boolean canUseBonemeal(final World llllllllllllIlIllIIlIIlIIllllllI, final Random llllllllllllIlIllIIlIIlIIlllllIl, final BlockPos llllllllllllIlIllIIlIIlIIlllllII, final IBlockState llllllllllllIlIllIIlIIlIIllllIll) {
        return BlockCocoa.lllIllIlIIlIII[2] != 0;
    }
    
    @Override
    public int getDamageValue(final World llllllllllllIlIllIIlIIlIlIIIlIII, final BlockPos llllllllllllIlIllIIlIIlIlIIIIlll) {
        return EnumDyeColor.BROWN.getDyeDamage();
    }
    
    private static void lIlIIlIIllIIIIlI() {
        (lllIllIlIIlIII = new int[8])[0] = ((194 + 175 - 182 + 8 ^ 97 + 21 - 44 + 57) & (0xF1 ^ 0xA2 ^ (0x2B ^ 0x38) ^ -" ".length()));
        BlockCocoa.lllIllIlIIlIII[1] = "  ".length();
        BlockCocoa.lllIllIlIIlIII[2] = " ".length();
        BlockCocoa.lllIllIlIIlIII[3] = (0x54 ^ 0x51);
        BlockCocoa.lllIllIlIIlIII[4] = (0x4E ^ 0x51 ^ (0x7A ^ 0x61));
        BlockCocoa.lllIllIlIIlIII[5] = "   ".length();
        BlockCocoa.lllIllIlIIlIII[6] = (0xA8 ^ 0xBF ^ (0x11 ^ 0x9));
        BlockCocoa.lllIllIlIIlIII[7] = (0x8F ^ 0x89);
    }
    
    private static String lIlIIlIIllIIIIII(final String llllllllllllIlIllIIlIIlIIlIlIlIl, final String llllllllllllIlIllIIlIIlIIlIlIIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllIIlIIlIIlIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIlIIlIIlIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIIlIIlIIlIlIlll = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIIlIIlIIlIlIlll.init(BlockCocoa.lllIllIlIIlIII[1], llllllllllllIlIllIIlIIlIIlIllIII);
            return new String(llllllllllllIlIllIIlIIlIIlIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIlIIlIIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIlIIlIIlIlIllI) {
            llllllllllllIlIllIIlIIlIIlIlIllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIlIIllIIIlII(final int llllllllllllIlIllIIlIIlIIlIIlIIl, final int llllllllllllIlIllIIlIIlIIlIIlIII) {
        return llllllllllllIlIllIIlIIlIIlIIlIIl < llllllllllllIlIllIIlIIlIIlIIlIII;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockCocoa.lllIllIlIIlIII[1]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockCocoa.lllIllIlIIlIII[0]] = BlockCocoa.FACING;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockCocoa.lllIllIlIIlIII[2]] = BlockCocoa.AGE;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public void grow(final World llllllllllllIlIllIIlIIlIIlllIIlI, final Random llllllllllllIlIllIIlIIlIIlllIlIl, final BlockPos llllllllllllIlIllIIlIIlIIlllIlII, final IBlockState llllllllllllIlIllIIlIIlIIlllIIll) {
        llllllllllllIlIllIIlIIlIIlllIIlI.setBlockState(llllllllllllIlIllIIlIIlIIlllIlII, llllllllllllIlIllIIlIIlIIlllIIll.withProperty((IProperty<Comparable>)BlockCocoa.AGE, llllllllllllIlIllIIlIIlIIlllIIll.getValue((IProperty<Integer>)BlockCocoa.AGE) + BlockCocoa.lllIllIlIIlIII[2]), BlockCocoa.lllIllIlIIlIII[1]);
        "".length();
    }
    
    @Override
    public Item getItem(final World llllllllllllIlIllIIlIIlIlIIIlIll, final BlockPos llllllllllllIlIllIIlIIlIlIIIlIlI) {
        return Items.dye;
    }
    
    @Override
    public void onNeighborBlockChange(final World llllllllllllIlIllIIlIIlIlIllIlIl, final BlockPos llllllllllllIlIllIIlIIlIlIlIllll, final IBlockState llllllllllllIlIllIIlIIlIlIlIlllI, final Block llllllllllllIlIllIIlIIlIlIllIIlI) {
        if (lIlIIlIIllIIIIll(this.canBlockStay(llllllllllllIlIllIIlIIlIlIllIlIl, llllllllllllIlIllIIlIIlIlIlIllll, llllllllllllIlIllIIlIIlIlIlIlllI) ? 1 : 0)) {
            this.dropBlock(llllllllllllIlIllIIlIIlIlIllIlIl, llllllllllllIlIllIIlIIlIlIlIllll, llllllllllllIlIllIIlIIlIlIlIlllI);
        }
    }
    
    public BlockCocoa() {
        super(Material.plants);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockCocoa.FACING, EnumFacing.NORTH).withProperty((IProperty<Comparable>)BlockCocoa.AGE, BlockCocoa.lllIllIlIIlIII[0]));
        this.setTickRandomly((boolean)(BlockCocoa.lllIllIlIIlIII[2] != 0));
        "".length();
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World llllllllllllIlIllIIlIIlIllllllll, final BlockPos llllllllllllIlIllIIlIIlIlllllllI, final IBlockState llllllllllllIlIllIIlIIlIllllllIl) {
        this.setBlockBoundsBasedOnState(llllllllllllIlIllIIlIIlIllllllll, llllllllllllIlIllIIlIIlIlllllllI);
        return super.getCollisionBoundingBox(llllllllllllIlIllIIlIIlIllllllll, llllllllllllIlIllIIlIIlIlllllllI, llllllllllllIlIllIIlIIlIllllllIl);
    }
    
    @Override
    public void dropBlockAsItemWithChance(final World llllllllllllIlIllIIlIIlIlIIllIlI, final BlockPos llllllllllllIlIllIIlIIlIlIIlIIIl, final IBlockState llllllllllllIlIllIIlIIlIlIIllIII, final float llllllllllllIlIllIIlIIlIlIIlIlll, final int llllllllllllIlIllIIlIIlIlIIlIllI) {
        final int llllllllllllIlIllIIlIIlIlIIlIlIl = llllllllllllIlIllIIlIIlIlIIllIII.getValue((IProperty<Integer>)BlockCocoa.AGE);
        int llllllllllllIlIllIIlIIlIlIIlIlII = BlockCocoa.lllIllIlIIlIII[2];
        if (lIlIIlIIllIIIllI(llllllllllllIlIllIIlIIlIlIIlIlIl, BlockCocoa.lllIllIlIIlIII[1])) {
            llllllllllllIlIllIIlIIlIlIIlIlII = BlockCocoa.lllIllIlIIlIII[5];
        }
        int llllllllllllIlIllIIlIIlIlIIlIIll = BlockCocoa.lllIllIlIIlIII[0];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIlIIlIIllIIIllI(llllllllllllIlIllIIlIIlIlIIlIIll, llllllllllllIlIllIIlIIlIlIIlIlII)) {
            Block.spawnAsEntity(llllllllllllIlIllIIlIIlIlIIllIlI, llllllllllllIlIllIIlIIlIlIIlIIIl, new ItemStack(Items.dye, BlockCocoa.lllIllIlIIlIII[2], EnumDyeColor.BROWN.getDyeDamage()));
            ++llllllllllllIlIllIIlIIlIlIIlIIll;
        }
    }
    
    @Override
    public void onBlockPlacedBy(final World llllllllllllIlIllIIlIIlIllIlIIlI, final BlockPos llllllllllllIlIllIIlIIlIllIlIIIl, final IBlockState llllllllllllIlIllIIlIIlIllIlIIII, final EntityLivingBase llllllllllllIlIllIIlIIlIllIIlIIl, final ItemStack llllllllllllIlIllIIlIIlIllIIlllI) {
        final EnumFacing llllllllllllIlIllIIlIIlIllIIllIl = EnumFacing.fromAngle(llllllllllllIlIllIIlIIlIllIIlIIl.rotationYaw);
        llllllllllllIlIllIIlIIlIllIlIIlI.setBlockState(llllllllllllIlIllIIlIIlIllIlIIIl, llllllllllllIlIllIIlIIlIllIlIIII.withProperty((IProperty<Comparable>)BlockCocoa.FACING, llllllllllllIlIllIIlIIlIllIIllIl), BlockCocoa.lllIllIlIIlIII[1]);
        "".length();
    }
    
    private static boolean lIlIIlIIllIIIlIl(final Object llllllllllllIlIllIIlIIlIIlIIIlIl, final Object llllllllllllIlIllIIlIIlIIlIIIlII) {
        return llllllllllllIlIllIIlIIlIIlIIIlIl == llllllllllllIlIllIIlIIlIIlIIIlII;
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess llllllllllllIlIllIIlIIlIlllIIIII, final BlockPos llllllllllllIlIllIIlIIlIlllIlIII) {
        final IBlockState llllllllllllIlIllIIlIIlIlllIIlll = llllllllllllIlIllIIlIIlIlllIIIII.getBlockState(llllllllllllIlIllIIlIIlIlllIlIII);
        final EnumFacing llllllllllllIlIllIIlIIlIlllIIllI = llllllllllllIlIllIIlIIlIlllIIlll.getValue((IProperty<EnumFacing>)BlockCocoa.FACING);
        final int llllllllllllIlIllIIlIIlIlllIIlIl = llllllllllllIlIllIIlIIlIlllIIlll.getValue((IProperty<Integer>)BlockCocoa.AGE);
        final int llllllllllllIlIllIIlIIlIlllIIlII = BlockCocoa.lllIllIlIIlIII[4] + llllllllllllIlIllIIlIIlIlllIIlIl * BlockCocoa.lllIllIlIIlIII[1];
        final int llllllllllllIlIllIIlIIlIlllIIIll = BlockCocoa.lllIllIlIIlIII[3] + llllllllllllIlIllIIlIIlIlllIIlIl * BlockCocoa.lllIllIlIIlIII[1];
        final float llllllllllllIlIllIIlIIlIlllIIIlI = llllllllllllIlIllIIlIIlIlllIIlII / 2.0f;
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[llllllllllllIlIllIIlIIlIlllIIllI.ordinal()]) {
            case 4: {
                this.setBlockBounds((8.0f - llllllllllllIlIllIIlIIlIlllIIIlI) / 16.0f, (12.0f - llllllllllllIlIllIIlIIlIlllIIIll) / 16.0f, (15.0f - llllllllllllIlIllIIlIIlIlllIIlII) / 16.0f, (8.0f + llllllllllllIlIllIIlIIlIlllIIIlI) / 16.0f, 0.75f, 0.9375f);
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
                break;
            }
            case 3: {
                this.setBlockBounds((8.0f - llllllllllllIlIllIIlIIlIlllIIIlI) / 16.0f, (12.0f - llllllllllllIlIllIIlIIlIlllIIIll) / 16.0f, 0.0625f, (8.0f + llllllllllllIlIllIIlIIlIlllIIIlI) / 16.0f, 0.75f, (1.0f + llllllllllllIlIllIIlIIlIlllIIlII) / 16.0f);
                "".length();
                if (" ".length() < 0) {
                    return;
                }
                break;
            }
            case 5: {
                this.setBlockBounds(0.0625f, (12.0f - llllllllllllIlIllIIlIIlIlllIIIll) / 16.0f, (8.0f - llllllllllllIlIllIIlIIlIlllIIIlI) / 16.0f, (1.0f + llllllllllllIlIllIIlIIlIlllIIlII) / 16.0f, 0.75f, (8.0f + llllllllllllIlIllIIlIIlIlllIIIlI) / 16.0f);
                "".length();
                if (((0x50 ^ 0x70) & ~(0x81 ^ 0xA1)) == -" ".length()) {
                    return;
                }
                break;
            }
            case 6: {
                this.setBlockBounds((15.0f - llllllllllllIlIllIIlIIlIlllIIlII) / 16.0f, (12.0f - llllllllllllIlIllIIlIIlIlllIIIll) / 16.0f, (8.0f - llllllllllllIlIllIIlIIlIlllIIIlI) / 16.0f, 0.9375f, 0.75f, (8.0f + llllllllllllIlIllIIlIIlIlllIIIlI) / 16.0f);
                break;
            }
        }
    }
    
    private void dropBlock(final World llllllllllllIlIllIIlIIlIlIlIlIII, final BlockPos llllllllllllIlIllIIlIIlIlIlIIlll, final IBlockState llllllllllllIlIllIIlIIlIlIlIIIlI) {
        llllllllllllIlIllIIlIIlIlIlIlIII.setBlockState(llllllllllllIlIllIIlIIlIlIlIIlll, Blocks.air.getDefaultState(), BlockCocoa.lllIllIlIIlIII[5]);
        "".length();
        this.dropBlockAsItem(llllllllllllIlIllIIlIIlIlIlIlIII, llllllllllllIlIllIIlIIlIlIlIIlll, llllllllllllIlIllIIlIIlIlIlIIIlI, BlockCocoa.lllIllIlIIlIII[0]);
    }
    
    private static boolean lIlIIlIIllIIIllI(final int llllllllllllIlIllIIlIIlIIlIIllIl, final int llllllllllllIlIllIIlIIlIIlIIllII) {
        return llllllllllllIlIllIIlIIlIIlIIllIl >= llllllllllllIlIllIIlIIlIIlIIllII;
    }
}
