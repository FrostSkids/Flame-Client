// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.IStringSerializable;
import net.minecraft.entity.Entity;
import java.util.List;
import net.minecraft.util.AxisAlignedBB;
import java.util.Random;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.init.Blocks;
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.EnumFacing;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;

public class BlockPistonExtension extends Block
{
    private static final /* synthetic */ int[] lIIlIlllIIlIll;
    public static final /* synthetic */ PropertyEnum<EnumPistonType> TYPE;
    private static final /* synthetic */ String[] lIIlIlllIIlIlI;
    public static final /* synthetic */ PropertyDirection FACING;
    public static final /* synthetic */ PropertyBool SHORT;
    
    @Override
    public void onBlockHarvested(final World lllllllllllllIIllIIIIlIIlIIlIlII, final BlockPos lllllllllllllIIllIIIIlIIlIIlIIll, final IBlockState lllllllllllllIIllIIIIlIIlIIllIlI, final EntityPlayer lllllllllllllIIllIIIIlIIlIIlIIIl) {
        if (llIlIIllllIlIlI(lllllllllllllIIllIIIIlIIlIIlIIIl.capabilities.isCreativeMode ? 1 : 0)) {
            final EnumFacing lllllllllllllIIllIIIIlIIlIIllIII = lllllllllllllIIllIIIIlIIlIIllIlI.getValue((IProperty<EnumFacing>)BlockPistonExtension.FACING);
            if (llIlIIllllIlIll(lllllllllllllIIllIIIIlIIlIIllIII)) {
                final BlockPos lllllllllllllIIllIIIIlIIlIIlIlll = lllllllllllllIIllIIIIlIIlIIlIIll.offset(lllllllllllllIIllIIIIlIIlIIllIII.getOpposite());
                final Block lllllllllllllIIllIIIIlIIlIIlIllI = lllllllllllllIIllIIIIlIIlIIlIlII.getBlockState(lllllllllllllIIllIIIIlIIlIIlIlll).getBlock();
                if (!llIlIIllllIllII(lllllllllllllIIllIIIIlIIlIIlIllI, Blocks.piston) || llIlIIllllIllIl(lllllllllllllIIllIIIIlIIlIIlIllI, Blocks.sticky_piston)) {
                    lllllllllllllIIllIIIIlIIlIIlIlII.setBlockToAir(lllllllllllllIIllIIIIlIIlIIlIlll);
                    "".length();
                }
            }
        }
        super.onBlockHarvested(lllllllllllllIIllIIIIlIIlIIlIlII, lllllllllllllIIllIIIIlIIlIIlIIll, lllllllllllllIIllIIIIlIIlIIllIlI, lllllllllllllIIllIIIIlIIlIIlIIIl);
    }
    
    private static boolean llIlIIlllllIIII(final int lllllllllllllIIllIIIIIlllIllIIIl, final int lllllllllllllIIllIIIIIlllIllIIII) {
        return lllllllllllllIIllIIIIIlllIllIIIl < lllllllllllllIIllIIIIIlllIllIIII;
    }
    
    private static boolean llIlIIllllIlIlI(final int lllllllllllllIIllIIIIIlllIlIIIII) {
        return lllllllllllllIIllIIIIIlllIlIIIII != 0;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockPistonExtension.lIIlIlllIIlIll[6]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockPistonExtension.lIIlIlllIIlIll[0]] = BlockPistonExtension.FACING;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockPistonExtension.lIIlIlllIIlIll[1]] = BlockPistonExtension.TYPE;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockPistonExtension.lIIlIlllIIlIll[2]] = BlockPistonExtension.SHORT;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public boolean isFullCube() {
        return BlockPistonExtension.lIIlIlllIIlIll[0] != 0;
    }
    
    public static EnumFacing getFacing(final int lllllllllllllIIllIIIIIllllllIIll) {
        final int lllllllllllllIIllIIIIIllllllIlII = lllllllllllllIIllIIIIIllllllIIll & BlockPistonExtension.lIIlIlllIIlIll[3];
        EnumFacing front;
        if (llIlIIllllIlllI(lllllllllllllIIllIIIIIllllllIlII, BlockPistonExtension.lIIlIlllIIlIll[4])) {
            front = null;
            "".length();
            if (" ".length() <= ((0xCD ^ 0xAB ^ (0x7B ^ 0x22)) & (142 + 75 - 170 + 99 ^ 61 + 37 - 38 + 113 ^ -" ".length()))) {
                return null;
            }
        }
        else {
            front = EnumFacing.getFront(lllllllllllllIIllIIIIIllllllIlII);
        }
        return front;
    }
    
    private static boolean llIlIIllllIllIl(final Object lllllllllllllIIllIIIIIlllIlIIIll, final Object lllllllllllllIIllIIIIIlllIlIIIlI) {
        return lllllllllllllIIllIIIIIlllIlIIIll == lllllllllllllIIllIIIIIlllIlIIIlI;
    }
    
    private static boolean llIlIIllllIllll(final int lllllllllllllIIllIIIIIlllIIllllI) {
        return lllllllllllllIIllIIIIIlllIIllllI > 0;
    }
    
    private static boolean llIlIIllllIlllI(final int lllllllllllllIIllIIIIIlllIlIllIl, final int lllllllllllllIIllIIIIIlllIlIllII) {
        return lllllllllllllIIllIIIIIlllIlIllIl > lllllllllllllIIllIIIIIlllIlIllII;
    }
    
    public BlockPistonExtension() {
        super(Material.piston);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockPistonExtension.FACING, EnumFacing.NORTH).withProperty(BlockPistonExtension.TYPE, EnumPistonType.DEFAULT).withProperty((IProperty<Comparable>)BlockPistonExtension.SHORT, (boolean)(BlockPistonExtension.lIIlIlllIIlIll[0] != 0)));
        this.setStepSound(BlockPistonExtension.soundTypePiston);
        "".length();
        this.setHardness(0.5f);
        "".length();
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess lllllllllllllIIllIIIIlIIIIlllIlI, final BlockPos lllllllllllllIIllIIIIlIIIIlllIII) {
        this.applyHeadBounds(lllllllllllllIIllIIIIlIIIIlllIlI.getBlockState(lllllllllllllIIllIIIIlIIIIlllIII));
    }
    
    private static boolean llIlIIllllIllII(final Object lllllllllllllIIllIIIIIlllIlIlIIl, final Object lllllllllllllIIllIIIIIlllIlIlIII) {
        return lllllllllllllIIllIIIIIlllIlIlIIl != lllllllllllllIIllIIIIIlllIlIlIII;
    }
    
    @Override
    public Item getItem(final World lllllllllllllIIllIIIIIlllllIllII, final BlockPos lllllllllllllIIllIIIIIlllllIlIll) {
        Item item;
        if (llIlIIllllIllIl(lllllllllllllIIllIIIIIlllllIllII.getBlockState(lllllllllllllIIllIIIIIlllllIlIll).getValue(BlockPistonExtension.TYPE), EnumPistonType.STICKY)) {
            item = Item.getItemFromBlock(Blocks.sticky_piston);
            "".length();
            if (((0x74 ^ 0x2F ^ (0x18 ^ 0xE)) & (43 + 90 - 117 + 212 ^ 90 + 34 - 105 + 150 ^ -" ".length()) & (((124 + 110 - 178 + 73 ^ 5 + 24 + 94 + 68) & (51 + 21 + 97 + 4 ^ 73 + 37 - 41 + 78 ^ -" ".length())) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            item = Item.getItemFromBlock(Blocks.piston);
        }
        return item;
    }
    
    private static void llIlIIllllIlIII() {
        (lIIlIlllIIlIlI = new String[BlockPistonExtension.lIIlIlllIIlIll[6]])[BlockPistonExtension.lIIlIlllIIlIll[0]] = llIlIIllllIIllI("+9waVxEtyIs=", "nMqoN");
        BlockPistonExtension.lIIlIlllIIlIlI[BlockPistonExtension.lIIlIlllIIlIll[1]] = llIlIIllllIIllI("4KTg+SqTMSM=", "uZHpB");
        BlockPistonExtension.lIIlIlllIIlIlI[BlockPistonExtension.lIIlIlllIIlIll[2]] = llIlIIllllIIlll("Nh04Jz8=", "EuWUK");
    }
    
    @Override
    public boolean canPlaceBlockAt(final World lllllllllllllIIllIIIIlIIIllllIII, final BlockPos lllllllllllllIIllIIIIlIIIlllIlll) {
        return BlockPistonExtension.lIIlIlllIIlIll[0] != 0;
    }
    
    @Override
    public void breakBlock(final World lllllllllllllIIllIIIIlIIlIIIIllI, BlockPos lllllllllllllIIllIIIIlIIIlllllll, final IBlockState lllllllllllllIIllIIIIlIIlIIIIlII) {
        super.breakBlock(lllllllllllllIIllIIIIlIIlIIIIllI, lllllllllllllIIllIIIIlIIIlllllll, lllllllllllllIIllIIIIlIIlIIIIlII);
        final EnumFacing lllllllllllllIIllIIIIlIIlIIIIIll = lllllllllllllIIllIIIIlIIlIIIIlII.getValue((IProperty<EnumFacing>)BlockPistonExtension.FACING).getOpposite();
        lllllllllllllIIllIIIIlIIIlllllll = lllllllllllllIIllIIIIlIIIlllllll.offset(lllllllllllllIIllIIIIlIIlIIIIIll);
        final IBlockState lllllllllllllIIllIIIIlIIlIIIIIlI = lllllllllllllIIllIIIIlIIlIIIIllI.getBlockState(lllllllllllllIIllIIIIlIIIlllllll);
        if ((!llIlIIllllIllII(lllllllllllllIIllIIIIlIIlIIIIIlI.getBlock(), Blocks.piston) || llIlIIllllIllIl(lllllllllllllIIllIIIIlIIlIIIIIlI.getBlock(), Blocks.sticky_piston)) && llIlIIllllIlIlI(((boolean)lllllllllllllIIllIIIIlIIlIIIIIlI.getValue((IProperty<Boolean>)BlockPistonBase.EXTENDED)) ? 1 : 0)) {
            lllllllllllllIIllIIIIlIIlIIIIIlI.getBlock().dropBlockAsItem(lllllllllllllIIllIIIIlIIlIIIIllI, lllllllllllllIIllIIIIlIIIlllllll, lllllllllllllIIllIIIIlIIlIIIIIlI, BlockPistonExtension.lIIlIlllIIlIll[0]);
            lllllllllllllIIllIIIIlIIlIIIIllI.setBlockToAir(lllllllllllllIIllIIIIlIIIlllllll);
            "".length();
        }
    }
    
    private static String llIlIIllllIIllI(final String lllllllllllllIIllIIIIIllllIIllll, final String lllllllllllllIIllIIIIIllllIIlllI) {
        try {
            final SecretKeySpec lllllllllllllIIllIIIIIllllIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIIIIllllIIlllI.getBytes(StandardCharsets.UTF_8)), BlockPistonExtension.lIIlIlllIIlIll[5]), "DES");
            final Cipher lllllllllllllIIllIIIIIllllIlIIll = Cipher.getInstance("DES");
            lllllllllllllIIllIIIIIllllIlIIll.init(BlockPistonExtension.lIIlIlllIIlIll[2], lllllllllllllIIllIIIIIllllIlIlII);
            return new String(lllllllllllllIIllIIIIIllllIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIIIIllllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIIIIllllIlIIlI) {
            lllllllllllllIIllIIIIIllllIlIIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int quantityDropped(final Random lllllllllllllIIllIIIIlIIIlllIIIl) {
        return BlockPistonExtension.lIIlIlllIIlIll[0];
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing = BlockPistonExtension.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
        if (llIlIIllllIlIll($switch_TABLE$net$minecraft$util$EnumFacing)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing;
        }
        "".length();
        final boolean lllllllllllllIIllIIIIIllllIllIIl = (Object)new int[EnumFacing.values().length];
        try {
            lllllllllllllIIllIIIIIllllIllIIl[EnumFacing.DOWN.ordinal()] = BlockPistonExtension.lIIlIlllIIlIll[1];
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIllIIIIIllllIllIIl[EnumFacing.EAST.ordinal()] = BlockPistonExtension.lIIlIlllIIlIll[7];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIllIIIIIllllIllIIl[EnumFacing.NORTH.ordinal()] = BlockPistonExtension.lIIlIlllIIlIll[6];
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIIllIIIIIllllIllIIl[EnumFacing.SOUTH.ordinal()] = BlockPistonExtension.lIIlIlllIIlIll[8];
            "".length();
            if (((0x27 ^ 0x9) & ~(0x93 ^ 0xBD)) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIIllIIIIIllllIllIIl[EnumFacing.UP.ordinal()] = BlockPistonExtension.lIIlIlllIIlIll[2];
            "".length();
            if (((0x35 ^ 0x19) & ~(0x4A ^ 0x66)) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIIllIIIIIllllIllIIl[EnumFacing.WEST.ordinal()] = BlockPistonExtension.lIIlIlllIIlIll[4];
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return BlockPistonExtension.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)lllllllllllllIIllIIIIIllllIllIIl;
    }
    
    private void applyCoreBounds(final IBlockState lllllllllllllIIllIIIIlIIIlIlIIll) {
        final float lllllllllllllIIllIIIIlIIIlIlIIlI = 0.25f;
        final float lllllllllllllIIllIIIIlIIIlIlIIIl = 0.375f;
        final float lllllllllllllIIllIIIIlIIIlIlIIII = 0.625f;
        final float lllllllllllllIIllIIIIlIIIlIIllll = 0.25f;
        final float lllllllllllllIIllIIIIlIIIlIIllIl = 0.75f;
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[lllllllllllllIIllIIIIlIIIlIlIIll.getValue((IProperty<EnumFacing>)BlockPistonExtension.FACING).ordinal()]) {
            case 1: {
                this.setBlockBounds(0.375f, 0.25f, 0.375f, 0.625f, 1.0f, 0.625f);
                "".length();
                if ("  ".length() < -" ".length()) {
                    return;
                }
                break;
            }
            case 2: {
                this.setBlockBounds(0.375f, 0.0f, 0.375f, 0.625f, 0.75f, 0.625f);
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
                break;
            }
            case 3: {
                this.setBlockBounds(0.25f, 0.375f, 0.25f, 0.75f, 0.625f, 1.0f);
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
                break;
            }
            case 4: {
                this.setBlockBounds(0.25f, 0.375f, 0.0f, 0.75f, 0.625f, 0.75f);
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 5: {
                this.setBlockBounds(0.375f, 0.25f, 0.25f, 0.625f, 0.75f, 1.0f);
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
                break;
            }
            case 6: {
                this.setBlockBounds(0.0f, 0.375f, 0.25f, 0.75f, 0.625f, 0.75f);
                break;
            }
        }
    }
    
    private static boolean llIlIIllllIlIll(final Object lllllllllllllIIllIIIIIlllIlIIllI) {
        return lllllllllllllIIllIIIIIlllIlIIllI != null;
    }
    
    @Override
    public void onNeighborBlockChange(final World lllllllllllllIIllIIIIlIIIIIIlIll, final BlockPos lllllllllllllIIllIIIIlIIIIIIlIIl, final IBlockState lllllllllllllIIllIIIIlIIIIIIlIII, final Block lllllllllllllIIllIIIIlIIIIIIIllI) {
        final EnumFacing lllllllllllllIIllIIIIlIIIIIIIlIl = lllllllllllllIIllIIIIlIIIIIIlIII.getValue((IProperty<EnumFacing>)BlockPistonExtension.FACING);
        final BlockPos lllllllllllllIIllIIIIlIIIIIIIlII = lllllllllllllIIllIIIIlIIIIIIlIIl.offset(lllllllllllllIIllIIIIlIIIIIIIlIl.getOpposite());
        final IBlockState lllllllllllllIIllIIIIlIIIIIIIIll = lllllllllllllIIllIIIIlIIIIIIlIll.getBlockState(lllllllllllllIIllIIIIlIIIIIIIlII);
        if (llIlIIllllIllII(lllllllllllllIIllIIIIlIIIIIIIIll.getBlock(), Blocks.piston) && llIlIIllllIllII(lllllllllllllIIllIIIIlIIIIIIIIll.getBlock(), Blocks.sticky_piston)) {
            lllllllllllllIIllIIIIlIIIIIIlIll.setBlockToAir(lllllllllllllIIllIIIIlIIIIIIlIIl);
            "".length();
            "".length();
            if (-(0x80 ^ 0x85) >= 0) {
                return;
            }
        }
        else {
            lllllllllllllIIllIIIIlIIIIIIIIll.getBlock().onNeighborBlockChange(lllllllllllllIIllIIIIlIIIIIIlIll, lllllllllllllIIllIIIIlIIIIIIIlII, lllllllllllllIIllIIIIlIIIIIIIIll, lllllllllllllIIllIIIIlIIIIIIIllI);
        }
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIllIIIIIllllIlllll) {
        int lllllllllllllIIllIIIIIlllllIIIII = BlockPistonExtension.lIIlIlllIIlIll[0];
        lllllllllllllIIllIIIIIlllllIIIII |= lllllllllllllIIllIIIIIllllIlllll.getValue((IProperty<EnumFacing>)BlockPistonExtension.FACING).getIndex();
        if (llIlIIllllIllIl(lllllllllllllIIllIIIIIllllIlllll.getValue(BlockPistonExtension.TYPE), EnumPistonType.STICKY)) {
            lllllllllllllIIllIIIIIlllllIIIII |= BlockPistonExtension.lIIlIlllIIlIll[5];
        }
        return lllllllllllllIIllIIIIIlllllIIIII;
    }
    
    @Override
    public void addCollisionBoxesToList(final World lllllllllllllIIllIIIIlIIIllIIIIl, final BlockPos lllllllllllllIIllIIIIlIIIllIIIII, final IBlockState lllllllllllllIIllIIIIlIIIllIIllI, final AxisAlignedBB lllllllllllllIIllIIIIlIIIlIllllI, final List<AxisAlignedBB> lllllllllllllIIllIIIIlIIIlIlllIl, final Entity lllllllllllllIIllIIIIlIIIlIlllII) {
        this.applyHeadBounds(lllllllllllllIIllIIIIlIIIllIIllI);
        super.addCollisionBoxesToList(lllllllllllllIIllIIIIlIIIllIIIIl, lllllllllllllIIllIIIIlIIIllIIIII, lllllllllllllIIllIIIIlIIIllIIllI, lllllllllllllIIllIIIIlIIIlIllllI, lllllllllllllIIllIIIIlIIIlIlllIl, lllllllllllllIIllIIIIlIIIlIlllII);
        this.applyCoreBounds(lllllllllllllIIllIIIIlIIIllIIllI);
        super.addCollisionBoxesToList(lllllllllllllIIllIIIIlIIIllIIIIl, lllllllllllllIIllIIIIlIIIllIIIII, lllllllllllllIIllIIIIlIIIllIIllI, lllllllllllllIIllIIIIlIIIlIllllI, lllllllllllllIIllIIIIlIIIlIlllIl, lllllllllllllIIllIIIIlIIIlIlllII);
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }
    
    @Override
    public boolean shouldSideBeRendered(final IBlockAccess lllllllllllllIIllIIIIIlllllllIlI, final BlockPos lllllllllllllIIllIIIIIlllllllIIl, final EnumFacing lllllllllllllIIllIIIIIlllllllIII) {
        return BlockPistonExtension.lIIlIlllIIlIll[1] != 0;
    }
    
    static {
        llIlIIllllIlIIl();
        llIlIIllllIlIII();
        FACING = PropertyDirection.create(BlockPistonExtension.lIIlIlllIIlIlI[BlockPistonExtension.lIIlIlllIIlIll[0]]);
        TYPE = PropertyEnum.create(BlockPistonExtension.lIIlIlllIIlIlI[BlockPistonExtension.lIIlIlllIIlIll[1]], EnumPistonType.class);
        SHORT = PropertyBool.create(BlockPistonExtension.lIIlIlllIIlIlI[BlockPistonExtension.lIIlIlllIIlIll[2]]);
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIllIIIIIlllllIIlIl) {
        final IBlockState withProperty = this.getDefaultState().withProperty((IProperty<Comparable>)BlockPistonExtension.FACING, getFacing(lllllllllllllIIllIIIIIlllllIIlIl));
        final PropertyEnum<EnumPistonType> type = BlockPistonExtension.TYPE;
        EnumPistonType enumPistonType;
        if (llIlIIllllIllll(lllllllllllllIIllIIIIIlllllIIlIl & BlockPistonExtension.lIIlIlllIIlIll[5])) {
            enumPistonType = EnumPistonType.STICKY;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        else {
            enumPistonType = EnumPistonType.DEFAULT;
        }
        return withProperty.withProperty((IProperty<Comparable>)type, enumPistonType);
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockPistonExtension.lIIlIlllIIlIll[0] != 0;
    }
    
    public void applyHeadBounds(final IBlockState lllllllllllllIIllIIIIlIIIIlIIlll) {
        final float lllllllllllllIIllIIIIlIIIIlIIlIl = 0.25f;
        final EnumFacing lllllllllllllIIllIIIIlIIIIlIIIll = lllllllllllllIIllIIIIlIIIIlIIlll.getValue((IProperty<EnumFacing>)BlockPistonExtension.FACING);
        if (llIlIIllllIlIll(lllllllllllllIIllIIIIlIIIIlIIIll)) {
            switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[lllllllllllllIIllIIIIlIIIIlIIIll.ordinal()]) {
                case 1: {
                    this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.25f, 1.0f);
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
                case 2: {
                    this.setBlockBounds(0.0f, 0.75f, 0.0f, 1.0f, 1.0f, 1.0f);
                    "".length();
                    if (" ".length() == "  ".length()) {
                        return;
                    }
                    break;
                }
                case 3: {
                    this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.25f);
                    "".length();
                    if (-" ".length() > 0) {
                        return;
                    }
                    break;
                }
                case 4: {
                    this.setBlockBounds(0.0f, 0.0f, 0.75f, 1.0f, 1.0f, 1.0f);
                    "".length();
                    if ("  ".length() < 0) {
                        return;
                    }
                    break;
                }
                case 5: {
                    this.setBlockBounds(0.0f, 0.0f, 0.0f, 0.25f, 1.0f, 1.0f);
                    "".length();
                    if ((0x44 ^ 0x40) <= " ".length()) {
                        return;
                    }
                    break;
                }
                case 6: {
                    this.setBlockBounds(0.75f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                    break;
                }
            }
        }
    }
    
    private static String llIlIIllllIIlll(String lllllllllllllIIllIIIIIlllIllllII, final String lllllllllllllIIllIIIIIlllIlllIll) {
        lllllllllllllIIllIIIIIlllIllllII = new String(Base64.getDecoder().decode(lllllllllllllIIllIIIIIlllIllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIIIIIlllIllllll = new StringBuilder();
        final char[] lllllllllllllIIllIIIIIlllIlllllI = lllllllllllllIIllIIIIIlllIlllIll.toCharArray();
        int lllllllllllllIIllIIIIIlllIllllIl = BlockPistonExtension.lIIlIlllIIlIll[0];
        final int lllllllllllllIIllIIIIIlllIllIlll = (Object)lllllllllllllIIllIIIIIlllIllllII.toCharArray();
        final Exception lllllllllllllIIllIIIIIlllIllIllI = (Exception)lllllllllllllIIllIIIIIlllIllIlll.length;
        long lllllllllllllIIllIIIIIlllIllIlIl = BlockPistonExtension.lIIlIlllIIlIll[0];
        while (llIlIIlllllIIII((int)lllllllllllllIIllIIIIIlllIllIlIl, (int)lllllllllllllIIllIIIIIlllIllIllI)) {
            final char lllllllllllllIIllIIIIIllllIIIIlI = lllllllllllllIIllIIIIIlllIllIlll[lllllllllllllIIllIIIIIlllIllIlIl];
            lllllllllllllIIllIIIIIlllIllllll.append((char)(lllllllllllllIIllIIIIIllllIIIIlI ^ lllllllllllllIIllIIIIIlllIlllllI[lllllllllllllIIllIIIIIlllIllllIl % lllllllllllllIIllIIIIIlllIlllllI.length]));
            "".length();
            ++lllllllllllllIIllIIIIIlllIllllIl;
            ++lllllllllllllIIllIIIIIlllIllIlIl;
            "".length();
            if ((0x99 ^ 0x9C) == 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIIIIIlllIllllll);
    }
    
    @Override
    public boolean canPlaceBlockOnSide(final World lllllllllllllIIllIIIIlIIIlllIlIl, final BlockPos lllllllllllllIIllIIIIlIIIlllIlII, final EnumFacing lllllllllllllIIllIIIIlIIIlllIIll) {
        return BlockPistonExtension.lIIlIlllIIlIll[0] != 0;
    }
    
    private static void llIlIIllllIlIIl() {
        (lIIlIlllIIlIll = new int[9])[0] = ((" ".length() ^ (0xAB ^ 0xB3)) & (0x5F ^ 0x33 ^ (0xEF ^ 0x9A) ^ -" ".length()));
        BlockPistonExtension.lIIlIlllIIlIll[1] = " ".length();
        BlockPistonExtension.lIIlIlllIIlIll[2] = "  ".length();
        BlockPistonExtension.lIIlIlllIIlIll[3] = (0x52 ^ 0x55);
        BlockPistonExtension.lIIlIlllIIlIll[4] = (0x70 ^ 0x74 ^ " ".length());
        BlockPistonExtension.lIIlIlllIIlIll[5] = (0x77 ^ 0x7F);
        BlockPistonExtension.lIIlIlllIIlIll[6] = "   ".length();
        BlockPistonExtension.lIIlIlllIIlIll[7] = (0xA5 ^ 0xA3);
        BlockPistonExtension.lIIlIlllIIlIll[8] = (0x41 ^ 0x19 ^ (0xDC ^ 0x80));
    }
    
    public enum EnumPistonType implements IStringSerializable
    {
        private static final /* synthetic */ String[] llIIlllIlllIIl;
        
        STICKY(EnumPistonType.llIIlllIlllIIl[EnumPistonType.llIIlllIlllIll[2]], EnumPistonType.llIIlllIlllIll[1], EnumPistonType.llIIlllIlllIIl[EnumPistonType.llIIlllIlllIll[3]]);
        
        private static final /* synthetic */ int[] llIIlllIlllIll;
        private final /* synthetic */ String VARIANT;
        
        DEFAULT(EnumPistonType.llIIlllIlllIIl[EnumPistonType.llIIlllIlllIll[0]], EnumPistonType.llIIlllIlllIll[0], EnumPistonType.llIIlllIlllIIl[EnumPistonType.llIIlllIlllIll[1]]);
        
        private static void lIIIllllllllIlIl() {
            (llIIlllIlllIll = new int[5])[0] = ((((0x79 ^ 0x23) & ~(0x44 ^ 0x1E)) ^ (0xF4 ^ 0xA8)) & (226 + 67 - 251 + 212 ^ 66 + 141 - 61 + 16 ^ -" ".length()));
            EnumPistonType.llIIlllIlllIll[1] = " ".length();
            EnumPistonType.llIIlllIlllIll[2] = "  ".length();
            EnumPistonType.llIIlllIlllIll[3] = "   ".length();
            EnumPistonType.llIIlllIlllIll[4] = (0x65 ^ 0x61);
        }
        
        private static void lIIIlllllllIllll() {
            (llIIlllIlllIIl = new String[EnumPistonType.llIIlllIlllIll[4]])[EnumPistonType.llIIlllIlllIll[0]] = lIIIlllllllIlIll("NvH0SKjLhcM=", "RqrlU");
            EnumPistonType.llIIlllIlllIIl[EnumPistonType.llIIlllIlllIll[1]] = lIIIlllllllIlIll("2yffKm6LN6k=", "VqdFk");
            EnumPistonType.llIIlllIlllIIl[EnumPistonType.llIIlllIlllIll[2]] = lIIIlllllllIllII("IDIMMzwq", "sfEpw");
            EnumPistonType.llIIlllIlllIIl[EnumPistonType.llIIlllIlllIll[3]] = lIIIlllllllIlIll("7AjyXMWqrLM=", "CwaZZ");
        }
        
        static {
            lIIIllllllllIlIl();
            lIIIlllllllIllll();
            final EnumPistonType[] enum$VALUES = new EnumPistonType[EnumPistonType.llIIlllIlllIll[2]];
            enum$VALUES[EnumPistonType.llIIlllIlllIll[0]] = EnumPistonType.DEFAULT;
            enum$VALUES[EnumPistonType.llIIlllIlllIll[1]] = EnumPistonType.STICKY;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static String lIIIlllllllIlIll(final String llllllllllllIllIlllIlllllIIIIIIl, final String llllllllllllIllIlllIlllllIIIIIII) {
            try {
                final SecretKeySpec llllllllllllIllIlllIlllllIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIlllllIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIlllIlllllIIIIlIl = Cipher.getInstance("Blowfish");
                llllllllllllIllIlllIlllllIIIIlIl.init(EnumPistonType.llIIlllIlllIll[2], llllllllllllIllIlllIlllllIIIIllI);
                return new String(llllllllllllIllIlllIlllllIIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIlllllIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlllIlllllIIIIlII) {
                llllllllllllIllIlllIlllllIIIIlII.printStackTrace();
                return null;
            }
        }
        
        private EnumPistonType(final String llllllllllllIllIlllIlllllIIllIll, final int llllllllllllIllIlllIlllllIIllIlI, final String llllllllllllIllIlllIlllllIIllIIl) {
            this.VARIANT = llllllllllllIllIlllIlllllIIllIIl;
        }
        
        private static String lIIIlllllllIllII(String llllllllllllIllIlllIllllIllIlllI, final String llllllllllllIllIlllIllllIlllIIlI) {
            llllllllllllIllIlllIllllIllIlllI = new String(Base64.getDecoder().decode(llllllllllllIllIlllIllllIllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIlllIllllIlllIIIl = new StringBuilder();
            final char[] llllllllllllIllIlllIllllIlllIIII = llllllllllllIllIlllIllllIlllIIlI.toCharArray();
            int llllllllllllIllIlllIllllIllIllll = EnumPistonType.llIIlllIlllIll[0];
            final float llllllllllllIllIlllIllllIllIlIIl = (Object)llllllllllllIllIlllIllllIllIlllI.toCharArray();
            final String llllllllllllIllIlllIllllIllIlIII = (String)llllllllllllIllIlllIllllIllIlIIl.length;
            Exception llllllllllllIllIlllIllllIllIIlll = (Exception)EnumPistonType.llIIlllIlllIll[0];
            while (lIIIllllllllIllI((int)llllllllllllIllIlllIllllIllIIlll, (int)llllllllllllIllIlllIllllIllIlIII)) {
                final char llllllllllllIllIlllIllllIlllIlII = llllllllllllIllIlllIllllIllIlIIl[llllllllllllIllIlllIllllIllIIlll];
                llllllllllllIllIlllIllllIlllIIIl.append((char)(llllllllllllIllIlllIllllIlllIlII ^ llllllllllllIllIlllIllllIlllIIII[llllllllllllIllIlllIllllIllIllll % llllllllllllIllIlllIllllIlllIIII.length]));
                "".length();
                ++llllllllllllIllIlllIllllIllIllll;
                ++llllllllllllIllIlllIllllIllIIlll;
                "".length();
                if ("   ".length() == 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIlllIllllIlllIIIl);
        }
        
        @Override
        public String getName() {
            return this.VARIANT;
        }
        
        private static boolean lIIIllllllllIllI(final int llllllllllllIllIlllIllllIllIIIll, final int llllllllllllIllIlllIllllIllIIIlI) {
            return llllllllllllIllIlllIllllIllIIIll < llllllllllllIllIlllIllllIllIIIlI;
        }
        
        @Override
        public String toString() {
            return this.VARIANT;
        }
    }
}
