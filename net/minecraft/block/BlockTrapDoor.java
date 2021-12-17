// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Arrays;
import net.minecraft.util.IStringSerializable;
import com.google.common.base.Predicate;
import net.minecraft.init.Blocks;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.entity.EntityLivingBase;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.World;
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;

public class BlockTrapDoor extends Block
{
    public static final /* synthetic */ PropertyEnum<DoorHalf> HALF;
    private static final /* synthetic */ int[] lIIIIlIlIlIIlI;
    private static final /* synthetic */ String[] lIIIIlIlIIIIIl;
    public static final /* synthetic */ PropertyDirection FACING;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing;
    public static final /* synthetic */ PropertyBool OPEN;
    
    @Override
    public boolean isPassable(final IBlockAccess lllllllllllllIlIIlIllIIIllIIIlll, final BlockPos lllllllllllllIlIIlIllIIIllIIIllI) {
        int n;
        if (lIlllIIlllIllll(((boolean)lllllllllllllIlIIlIllIIIllIIIlll.getBlockState(lllllllllllllIlIIlIllIIIllIIIllI).getValue((IProperty<Boolean>)BlockTrapDoor.OPEN)) ? 1 : 0)) {
            n = BlockTrapDoor.lIIIIlIlIlIIlI[0];
            "".length();
            if (((123 + 118 - 188 + 131 ^ 180 + 135 - 162 + 38) & (123 + 127 - 197 + 119 ^ 108 + 69 - 153 + 147 ^ -" ".length())) > 0) {
                return ((136 + 40 - 160 + 172 ^ 178 + 59 - 223 + 172) & (18 + 77 - 10 + 67 ^ 92 + 38 - 117 + 145 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = BlockTrapDoor.lIIIIlIlIlIIlI[1];
        }
        return n != 0;
    }
    
    @Override
    public boolean onBlockActivated(final World lllllllllllllIlIIlIllIIIIllllllI, final BlockPos lllllllllllllIlIIlIllIIIIlllllIl, IBlockState lllllllllllllIlIIlIllIIIIlllllII, final EntityPlayer lllllllllllllIlIIlIllIIIlIIIIlII, final EnumFacing lllllllllllllIlIIlIllIIIlIIIIIll, final float lllllllllllllIlIIlIllIIIlIIIIIlI, final float lllllllllllllIlIIlIllIIIlIIIIIIl, final float lllllllllllllIlIIlIllIIIlIIIIIII) {
        if (lIlllIIllllIIII(this.blockMaterial, Material.iron)) {
            return BlockTrapDoor.lIIIIlIlIlIIlI[1] != 0;
        }
        lllllllllllllIlIIlIllIIIIlllllII = lllllllllllllIlIIlIllIIIIlllllII.cycleProperty((IProperty<Comparable>)BlockTrapDoor.OPEN);
        lllllllllllllIlIIlIllIIIIllllllI.setBlockState(lllllllllllllIlIIlIllIIIIlllllIl, lllllllllllllIlIIlIllIIIIlllllII, BlockTrapDoor.lIIIIlIlIlIIlI[2]);
        "".length();
        int lllllllllllllIIIlIIlIlIllIllIlII;
        if (lIlllIIlllIllll(((boolean)lllllllllllllIlIIlIllIIIIlllllII.getValue((IProperty<Boolean>)BlockTrapDoor.OPEN)) ? 1 : 0)) {
            lllllllllllllIIIlIIlIlIllIllIlII = BlockTrapDoor.lIIIIlIlIlIIlI[3];
            "".length();
            if (((0x4C ^ 0x3B ^ (0xF2 ^ 0xC4)) & (45 + 36 + 97 + 68 ^ 82 + 174 - 172 + 99 ^ -" ".length())) > " ".length()) {
                return ((174 + 119 - 256 + 175 ^ 24 + 143 - 60 + 51) & (52 + 2 - 15 + 201 ^ 29 + 90 + 31 + 36 ^ -" ".length())) != 0x0;
            }
        }
        else {
            lllllllllllllIIIlIIlIlIllIllIlII = BlockTrapDoor.lIIIIlIlIlIIlI[4];
        }
        lllllllllllllIlIIlIllIIIIllllllI.playAuxSFXAtEntity(lllllllllllllIlIIlIllIIIlIIIIlII, lllllllllllllIIIlIIlIlIllIllIlII, lllllllllllllIlIIlIllIIIIlllllIl, BlockTrapDoor.lIIIIlIlIlIIlI[0]);
        return BlockTrapDoor.lIIIIlIlIlIIlI[1] != 0;
    }
    
    private static int lIlllIIllllIIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockTrapDoor.lIIIIlIlIlIIlI[5]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockTrapDoor.lIIIIlIlIlIIlI[0]] = BlockTrapDoor.FACING;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockTrapDoor.lIIIIlIlIlIIlI[1]] = BlockTrapDoor.OPEN;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockTrapDoor.lIIIIlIlIlIIlI[2]] = BlockTrapDoor.HALF;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public AxisAlignedBB getSelectedBoundingBox(final World lllllllllllllIlIIlIllIIIlIllllll, final BlockPos lllllllllllllIlIIlIllIIIlIlllllI) {
        this.setBlockBoundsBasedOnState(lllllllllllllIlIIlIllIIIlIllllll, lllllllllllllIlIIlIllIIIlIlllllI);
        return super.getSelectedBoundingBox(lllllllllllllIlIIlIllIIIlIllllll, lllllllllllllIlIIlIllIIIlIlllllI);
    }
    
    @Override
    public void setBlockBoundsForItemRender() {
        final float lllllllllllllIlIIlIllIIIlIlIIIlI = 0.1875f;
        this.setBlockBounds(0.0f, 0.40625f, 0.0f, 1.0f, 0.59375f, 1.0f);
    }
    
    protected BlockTrapDoor(final Material lllllllllllllIlIIlIllIIIllIIllll) {
        super(lllllllllllllIlIIlIllIIIllIIllll);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockTrapDoor.FACING, EnumFacing.NORTH).withProperty((IProperty<Comparable>)BlockTrapDoor.OPEN, (boolean)(BlockTrapDoor.lIIIIlIlIlIIlI[0] != 0)).withProperty(BlockTrapDoor.HALF, DoorHalf.BOTTOM));
        final float lllllllllllllIlIIlIllIIIllIlIIlI = 0.5f;
        final float lllllllllllllIlIIlIllIIIllIlIIIl = 1.0f;
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        this.setCreativeTab(CreativeTabs.tabRedstone);
        "".length();
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIlIIlIllIIIIIlIlIlI) {
        final IBlockState withProperty = this.getDefaultState().withProperty((IProperty<Comparable>)BlockTrapDoor.FACING, getFacing(lllllllllllllIlIIlIllIIIIIlIlIlI));
        final PropertyBool open = BlockTrapDoor.OPEN;
        int b;
        if (lIlllIIlllIllll(lllllllllllllIlIIlIllIIIIIlIlIlI & BlockTrapDoor.lIIIIlIlIlIIlI[6])) {
            b = BlockTrapDoor.lIIIIlIlIlIIlI[1];
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        else {
            b = BlockTrapDoor.lIIIIlIlIlIIlI[0];
        }
        final IBlockState withProperty2 = withProperty.withProperty((IProperty<Comparable>)open, (boolean)(b != 0));
        final PropertyEnum<DoorHalf> half = BlockTrapDoor.HALF;
        DoorHalf doorHalf;
        if (lIlllIIllllIIIl(lllllllllllllIlIIlIllIIIIIlIlIlI & BlockTrapDoor.lIIIIlIlIlIIlI[7])) {
            doorHalf = DoorHalf.BOTTOM;
            "".length();
            if ((0xC1 ^ 0xC5) < " ".length()) {
                return null;
            }
        }
        else {
            doorHalf = DoorHalf.TOP;
        }
        return withProperty2.withProperty((IProperty<Comparable>)half, doorHalf);
    }
    
    private static boolean lIlllIIlllIllll(final int lllllllllllllIlIIlIlIllllllIIlll) {
        return lllllllllllllIlIIlIlIllllllIIlll != 0;
    }
    
    private static boolean lIlllIIllllIIII(final Object lllllllllllllIlIIlIlIllllllIllII, final Object lllllllllllllIlIIlIlIllllllIlIll) {
        return lllllllllllllIlIIlIlIllllllIllII == lllllllllllllIlIIlIlIllllllIlIll;
    }
    
    private static void lIlllIIlllIlllI() {
        (lIIIIlIlIlIIlI = new int[10])[0] = ((0x2 ^ 0x4 ^ (0xEE ^ 0xA5)) & (0xCA ^ 0x9D ^ (0x6B ^ 0x71) ^ -" ".length()));
        BlockTrapDoor.lIIIIlIlIlIIlI[1] = " ".length();
        BlockTrapDoor.lIIIIlIlIlIIlI[2] = "  ".length();
        BlockTrapDoor.lIIIIlIlIlIIlI[3] = (0xFFFFBBFB & 0x47EF);
        BlockTrapDoor.lIIIIlIlIlIIlI[4] = (-(0xFFFFFDFB & 0x7A15) & (0xFFFFFBFF & 0x7FFE));
        BlockTrapDoor.lIIIIlIlIlIIlI[5] = "   ".length();
        BlockTrapDoor.lIIIIlIlIlIIlI[6] = (0x23 ^ 0x27);
        BlockTrapDoor.lIIIIlIlIlIIlI[7] = (0x65 ^ 0x38 ^ (0x29 ^ 0x7C));
        BlockTrapDoor.lIIIIlIlIlIIlI[8] = (0x72 ^ 0x4 ^ (0x7E ^ 0xE));
        BlockTrapDoor.lIIIIlIlIlIIlI[9] = (0xAB ^ 0xAE);
    }
    
    private static String lIlllIIlIIllIIl(String lllllllllllllIlIIlIllIIIIIIIIlII, final String lllllllllllllIlIIlIllIIIIIIIIIll) {
        lllllllllllllIlIIlIllIIIIIIIIlII = new String(Base64.getDecoder().decode(lllllllllllllIlIIlIllIIIIIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIllIIIIIIIIIlI = new StringBuilder();
        final char[] lllllllllllllIlIIlIllIIIIIIIIIIl = lllllllllllllIlIIlIllIIIIIIIIIll.toCharArray();
        int lllllllllllllIlIIlIllIIIIIIIIIII = BlockTrapDoor.lIIIIlIlIlIIlI[0];
        final boolean lllllllllllllIlIIlIlIllllllllIlI = (Object)lllllllllllllIlIIlIllIIIIIIIIlII.toCharArray();
        final boolean lllllllllllllIlIIlIlIllllllllIIl = lllllllllllllIlIIlIlIllllllllIlI.length != 0;
        int lllllllllllllIlIIlIlIllllllllIII = BlockTrapDoor.lIIIIlIlIlIIlI[0];
        while (lIlllIIllllIlll(lllllllllllllIlIIlIlIllllllllIII, lllllllllllllIlIIlIlIllllllllIIl ? 1 : 0)) {
            final char lllllllllllllIlIIlIllIIIIIIIIlIl = lllllllllllllIlIIlIlIllllllllIlI[lllllllllllllIlIIlIlIllllllllIII];
            lllllllllllllIlIIlIllIIIIIIIIIlI.append((char)(lllllllllllllIlIIlIllIIIIIIIIlIl ^ lllllllllllllIlIIlIllIIIIIIIIIIl[lllllllllllllIlIIlIllIIIIIIIIIII % lllllllllllllIlIIlIllIIIIIIIIIIl.length]));
            "".length();
            ++lllllllllllllIlIIlIllIIIIIIIIIII;
            ++lllllllllllllIlIIlIlIllllllllIII;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIllIIIIIIIIIlI);
    }
    
    private static boolean lIlllIIllllIlIl(final Object lllllllllllllIlIIlIlIlllllllIIII, final Object lllllllllllllIlIIlIlIllllllIllll) {
        return lllllllllllllIlIIlIlIlllllllIIII != lllllllllllllIlIIlIlIllllllIllll;
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World lllllllllllllIlIIlIllIIIlIllIIIl, final BlockPos lllllllllllllIlIIlIllIIIlIllIlII, final IBlockState lllllllllllllIlIIlIllIIIlIllIIll) {
        this.setBlockBoundsBasedOnState(lllllllllllllIlIIlIllIIIlIllIIIl, lllllllllllllIlIIlIllIIIlIllIlII);
        return super.getCollisionBoundingBox(lllllllllllllIlIIlIllIIIlIllIIIl, lllllllllllllIlIIlIllIIIlIllIlII, lllllllllllllIlIIlIllIIIlIllIIll);
    }
    
    @Override
    public IBlockState onBlockPlaced(final World lllllllllllllIlIIlIllIIIIlIIlllI, final BlockPos lllllllllllllIlIIlIllIIIIlIIllIl, final EnumFacing lllllllllllllIlIIlIllIIIIlIIIlII, final float lllllllllllllIlIIlIllIIIIlIIlIll, final float lllllllllllllIlIIlIllIIIIlIIlIlI, final float lllllllllllllIlIIlIllIIIIlIIlIIl, final int lllllllllllllIlIIlIllIIIIlIIlIII, final EntityLivingBase lllllllllllllIlIIlIllIIIIlIIIlll) {
        IBlockState lllllllllllllIlIIlIllIIIIlIIIllI = this.getDefaultState();
        if (lIlllIIlllIllll(lllllllllllllIlIIlIllIIIIlIIIlII.getAxis().isHorizontal() ? 1 : 0)) {
            final IBlockState withProperty;
            lllllllllllllIlIIlIllIIIIlIIIllI = (withProperty = lllllllllllllIlIIlIllIIIIlIIIllI.withProperty((IProperty<Comparable>)BlockTrapDoor.FACING, lllllllllllllIlIIlIllIIIIlIIIlII).withProperty((IProperty<Comparable>)BlockTrapDoor.OPEN, (boolean)(BlockTrapDoor.lIIIIlIlIlIIlI[0] != 0)));
            final PropertyEnum<DoorHalf> half = BlockTrapDoor.HALF;
            DoorHalf doorHalf;
            if (lIlllIIllllIlII(lIlllIIllllIIll(lllllllllllllIlIIlIllIIIIlIIlIlI, 0.5f))) {
                doorHalf = DoorHalf.TOP;
                "".length();
                if (-" ".length() > "   ".length()) {
                    return null;
                }
            }
            else {
                doorHalf = DoorHalf.BOTTOM;
            }
            lllllllllllllIlIIlIllIIIIlIIIllI = withProperty.withProperty((IProperty<Comparable>)half, doorHalf);
        }
        return lllllllllllllIlIIlIllIIIIlIIIllI;
    }
    
    protected static EnumFacing getFacing(final int lllllllllllllIlIIlIllIIIIIllIllI) {
        switch (lllllllllllllIlIIlIllIIIIIllIllI & BlockTrapDoor.lIIIIlIlIlIIlI[5]) {
            case 0: {
                return EnumFacing.NORTH;
            }
            case 1: {
                return EnumFacing.SOUTH;
            }
            case 2: {
                return EnumFacing.WEST;
            }
            default: {
                return EnumFacing.EAST;
            }
        }
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIlIIlIllIIIIIlIIlII) {
        int lllllllllllllIlIIlIllIIIIIlIIIll = BlockTrapDoor.lIIIIlIlIlIIlI[0];
        lllllllllllllIlIIlIllIIIIIlIIIll |= getMetaForFacing(lllllllllllllIlIIlIllIIIIIlIIlII.getValue((IProperty<EnumFacing>)BlockTrapDoor.FACING));
        if (lIlllIIlllIllll(((boolean)lllllllllllllIlIIlIllIIIIIlIIlII.getValue((IProperty<Boolean>)BlockTrapDoor.OPEN)) ? 1 : 0)) {
            lllllllllllllIlIIlIllIIIIIlIIIll |= BlockTrapDoor.lIIIIlIlIlIIlI[6];
        }
        if (lIlllIIllllIIII(lllllllllllllIlIIlIllIIIIIlIIlII.getValue(BlockTrapDoor.HALF), DoorHalf.TOP)) {
            lllllllllllllIlIIlIllIIIIIlIIIll |= BlockTrapDoor.lIIIIlIlIlIIlI[7];
        }
        return lllllllllllllIlIIlIllIIIIIlIIIll;
    }
    
    private static boolean lIlllIIllllIllI(final Object lllllllllllllIlIIlIlIllllllIlIIl) {
        return lllllllllllllIlIIlIlIllllllIlIIl != null;
    }
    
    private static boolean lIlllIIllllIlII(final int lllllllllllllIlIIlIlIllllllIIIll) {
        return lllllllllllllIlIIlIlIllllllIIIll > 0;
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess lllllllllllllIlIIlIllIIIlIlIlIlI, final BlockPos lllllllllllllIlIIlIllIIIlIlIlIIl) {
        this.setBounds(lllllllllllllIlIIlIllIIIlIlIlIlI.getBlockState(lllllllllllllIlIIlIllIIIlIlIlIIl));
    }
    
    public void setBounds(final IBlockState lllllllllllllIlIIlIllIIIlIIllIII) {
        if (lIlllIIllllIIII(lllllllllllllIlIIlIllIIIlIIllIII.getBlock(), this)) {
            int n;
            if (lIlllIIllllIIII(lllllllllllllIlIIlIllIIIlIIllIII.getValue(BlockTrapDoor.HALF), DoorHalf.TOP)) {
                n = BlockTrapDoor.lIIIIlIlIlIIlI[1];
                "".length();
                if ((0x1C ^ 0x3B ^ (0x7C ^ 0x5F)) == 0x0) {
                    return;
                }
            }
            else {
                n = BlockTrapDoor.lIIIIlIlIlIIlI[0];
            }
            final boolean lllllllllllllIlIIlIllIIIlIIlIlll = n != 0;
            final Boolean lllllllllllllIlIIlIllIIIlIIlIllI = lllllllllllllIlIIlIllIIIlIIllIII.getValue((IProperty<Boolean>)BlockTrapDoor.OPEN);
            final EnumFacing lllllllllllllIlIIlIllIIIlIIlIlIl = lllllllllllllIlIIlIllIIIlIIllIII.getValue((IProperty<EnumFacing>)BlockTrapDoor.FACING);
            final float lllllllllllllIlIIlIllIIIlIIlIlII = 0.1875f;
            if (lIlllIIlllIllll(lllllllllllllIlIIlIllIIIlIIlIlll ? 1 : 0)) {
                this.setBlockBounds(0.0f, 0.8125f, 0.0f, 1.0f, 1.0f, 1.0f);
                "".length();
                if (-" ".length() == (0x5D ^ 0x59)) {
                    return;
                }
            }
            else {
                this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.1875f, 1.0f);
            }
            if (lIlllIIlllIllll(((boolean)lllllllllllllIlIIlIllIIIlIIlIllI) ? 1 : 0)) {
                if (lIlllIIllllIIII(lllllllllllllIlIIlIllIIIlIIlIlIl, EnumFacing.NORTH)) {
                    this.setBlockBounds(0.0f, 0.0f, 0.8125f, 1.0f, 1.0f, 1.0f);
                }
                if (lIlllIIllllIIII(lllllllllllllIlIIlIllIIIlIIlIlIl, EnumFacing.SOUTH)) {
                    this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.1875f);
                }
                if (lIlllIIllllIIII(lllllllllllllIlIIlIllIIIlIIlIlIl, EnumFacing.WEST)) {
                    this.setBlockBounds(0.8125f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                }
                if (lIlllIIllllIIII(lllllllllllllIlIIlIllIIIlIIlIlIl, EnumFacing.EAST)) {
                    this.setBlockBounds(0.0f, 0.0f, 0.0f, 0.1875f, 1.0f, 1.0f);
                }
            }
        }
    }
    
    private static void lIlllIIlIIllIlI() {
        (lIIIIlIlIIIIIl = new String[BlockTrapDoor.lIIIIlIlIlIIlI[5]])[BlockTrapDoor.lIIIIlIlIlIIlI[0]] = lIlllIIlIIlIllI("7BecbjT65kg=", "VlQeM");
        BlockTrapDoor.lIIIIlIlIIIIIl[BlockTrapDoor.lIIIIlIlIlIIlI[1]] = lIlllIIlIIlIllI("2GNXyWeqjpA=", "VQXGS");
        BlockTrapDoor.lIIIIlIlIIIIIl[BlockTrapDoor.lIIIIlIlIlIIlI[2]] = lIlllIIlIIllIIl("PBE9Kg==", "TpQLA");
    }
    
    private static boolean lIlllIIllllIlll(final int lllllllllllllIlIIlIlIlllllllIlII, final int lllllllllllllIlIIlIlIlllllllIIll) {
        return lllllllllllllIlIIlIlIlllllllIlII < lllllllllllllIlIIlIlIlllllllIIll;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockTrapDoor.lIIIIlIlIlIIlI[0] != 0;
    }
    
    protected static int getMetaForFacing(final EnumFacing lllllllllllllIlIIlIllIIIIIllIIll) {
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[lllllllllllllIlIIlIllIIIIIllIIll.ordinal()]) {
            case 3: {
                return BlockTrapDoor.lIIIIlIlIlIIlI[0];
            }
            case 4: {
                return BlockTrapDoor.lIIIIlIlIlIIlI[1];
            }
            case 5: {
                return BlockTrapDoor.lIIIIlIlIlIIlI[2];
            }
            default: {
                return BlockTrapDoor.lIIIIlIlIlIIlI[5];
            }
        }
    }
    
    @Override
    public void onNeighborBlockChange(final World lllllllllllllIlIIlIllIIIIllIlIIl, final BlockPos lllllllllllllIlIIlIllIIIIllIlIII, final IBlockState lllllllllllllIlIIlIllIIIIllIIlll, final Block lllllllllllllIlIIlIllIIIIllIlllI) {
        if (lIlllIIllllIIIl(lllllllllllllIlIIlIllIIIIllIlIIl.isRemote ? 1 : 0)) {
            final BlockPos lllllllllllllIlIIlIllIIIIllIllIl = lllllllllllllIlIIlIllIIIIllIlIII.offset(lllllllllllllIlIIlIllIIIIllIIlll.getValue((IProperty<EnumFacing>)BlockTrapDoor.FACING).getOpposite());
            if (lIlllIIllllIIIl(isValidSupportBlock(lllllllllllllIlIIlIllIIIIllIlIIl.getBlockState(lllllllllllllIlIIlIllIIIIllIllIl).getBlock()) ? 1 : 0)) {
                lllllllllllllIlIIlIllIIIIllIlIIl.setBlockToAir(lllllllllllllIlIIlIllIIIIllIlIII);
                "".length();
                this.dropBlockAsItem(lllllllllllllIlIIlIllIIIIllIlIIl, lllllllllllllIlIIlIllIIIIllIlIII, lllllllllllllIlIIlIllIIIIllIIlll, BlockTrapDoor.lIIIIlIlIlIIlI[0]);
                "".length();
                if (((0x85 ^ 0x89 ^ (0xFC ^ 0xBE)) & (0x30 ^ 0x19 ^ (0x4A ^ 0x2D) ^ -" ".length())) < ((0x33 ^ 0x76 ^ (0xC5 ^ 0x9C)) & (107 + 107 - 145 + 76 ^ 76 + 103 - 175 + 137 ^ -" ".length()))) {
                    return;
                }
            }
            else {
                final boolean lllllllllllllIlIIlIllIIIIllIllII = lllllllllllllIlIIlIllIIIIllIlIIl.isBlockPowered(lllllllllllllIlIIlIllIIIIllIlIII);
                if (!lIlllIIllllIIIl(lllllllllllllIlIIlIllIIIIllIllII ? 1 : 0) || lIlllIIlllIllll(lllllllllllllIlIIlIllIIIIllIlllI.canProvidePower() ? 1 : 0)) {
                    final boolean lllllllllllllIlIIlIllIIIIllIlIll = lllllllllllllIlIIlIllIIIIllIIlll.getValue((IProperty<Boolean>)BlockTrapDoor.OPEN);
                    if (lIlllIIllllIIlI(lllllllllllllIlIIlIllIIIIllIlIll ? 1 : 0, lllllllllllllIlIIlIllIIIIllIllII ? 1 : 0)) {
                        lllllllllllllIlIIlIllIIIIllIlIIl.setBlockState(lllllllllllllIlIIlIllIIIIllIlIII, lllllllllllllIlIIlIllIIIIllIIlll.withProperty((IProperty<Comparable>)BlockTrapDoor.OPEN, lllllllllllllIlIIlIllIIIIllIllII), BlockTrapDoor.lIIIIlIlIlIIlI[2]);
                        "".length();
                        final EntityPlayer lllllllllllllIIIlIIlIlIllIllIlIl = null;
                        int lllllllllllllIIIlIIlIlIllIllIlII;
                        if (lIlllIIlllIllll(lllllllllllllIlIIlIllIIIIllIllII ? 1 : 0)) {
                            lllllllllllllIIIlIIlIlIllIllIlII = BlockTrapDoor.lIIIIlIlIlIIlI[3];
                            "".length();
                            if ("   ".length() == " ".length()) {
                                return;
                            }
                        }
                        else {
                            lllllllllllllIIIlIIlIlIllIllIlII = BlockTrapDoor.lIIIIlIlIlIIlI[4];
                        }
                        lllllllllllllIlIIlIllIIIIllIlIIl.playAuxSFXAtEntity(lllllllllllllIIIlIIlIlIllIllIlIl, lllllllllllllIIIlIIlIlIllIllIlII, lllllllllllllIlIIlIllIIIIllIlIII, BlockTrapDoor.lIIIIlIlIlIIlI[0]);
                    }
                }
            }
        }
    }
    
    @Override
    public MovingObjectPosition collisionRayTrace(final World lllllllllllllIlIIlIllIIIIlIlIlll, final BlockPos lllllllllllllIlIIlIllIIIIlIllIll, final Vec3 lllllllllllllIlIIlIllIIIIlIllIlI, final Vec3 lllllllllllllIlIIlIllIIIIlIlIlII) {
        this.setBlockBoundsBasedOnState(lllllllllllllIlIIlIllIIIIlIlIlll, lllllllllllllIlIIlIllIIIIlIllIll);
        return super.collisionRayTrace(lllllllllllllIlIIlIllIIIIlIlIlll, lllllllllllllIlIIlIllIIIIlIllIll, lllllllllllllIlIIlIllIIIIlIllIlI, lllllllllllllIlIIlIllIIIIlIlIlII);
    }
    
    private static boolean lIlllIIllllIIIl(final int lllllllllllllIlIIlIlIllllllIIlIl) {
        return lllllllllllllIlIIlIlIllllllIIlIl == 0;
    }
    
    private static boolean lIlllIIllllIIlI(final int lllllllllllllIlIIlIlIllllllIIIII, final int lllllllllllllIlIIlIlIlllllIlllll) {
        return lllllllllllllIlIIlIlIllllllIIIII != lllllllllllllIlIIlIlIlllllIlllll;
    }
    
    private static String lIlllIIlIIlIllI(final String lllllllllllllIlIIlIllIIIIIIlIlII, final String lllllllllllllIlIIlIllIIIIIIlIIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIllIIIIIIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIllIIIIIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIllIIIIIIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIllIIIIIIlIllI.init(BlockTrapDoor.lIIIIlIlIlIIlI[2], lllllllllllllIlIIlIllIIIIIIlIlll);
            return new String(lllllllllllllIlIIlIllIIIIIIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIllIIIIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIllIIIIIIlIlIl) {
            lllllllllllllIlIIlIllIIIIIIlIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockTrapDoor.lIIIIlIlIlIIlI[0] != 0;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing = BlockTrapDoor.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
        if (lIlllIIllllIllI($switch_TABLE$net$minecraft$util$EnumFacing)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing;
        }
        "".length();
        final long lllllllllllllIlIIlIllIIIIIIlllII = (Object)new int[EnumFacing.values().length];
        try {
            lllllllllllllIlIIlIllIIIIIIlllII[EnumFacing.DOWN.ordinal()] = BlockTrapDoor.lIIIIlIlIlIIlI[1];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIlIIlIllIIIIIIlllII[EnumFacing.EAST.ordinal()] = BlockTrapDoor.lIIIIlIlIlIIlI[8];
            "".length();
            if ("  ".length() >= "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIlIIlIllIIIIIIlllII[EnumFacing.NORTH.ordinal()] = BlockTrapDoor.lIIIIlIlIlIIlI[5];
            "".length();
            if (-" ".length() >= "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIlIIlIllIIIIIIlllII[EnumFacing.SOUTH.ordinal()] = BlockTrapDoor.lIIIIlIlIlIIlI[6];
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIlIIlIllIIIIIIlllII[EnumFacing.UP.ordinal()] = BlockTrapDoor.lIIIIlIlIlIIlI[2];
            "".length();
            if (((75 + 57 + 26 + 48 ^ 86 + 92 - 33 + 7) & (0xE4 ^ 0xC1 ^ (0x4A ^ 0x39) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIlIIlIllIIIIIIlllII[EnumFacing.WEST.ordinal()] = BlockTrapDoor.lIIIIlIlIlIIlI[9];
            "".length();
            if ((0x7 ^ 0x2) == 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return BlockTrapDoor.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)lllllllllllllIlIIlIllIIIIIIlllII;
    }
    
    private static boolean isValidSupportBlock(final Block lllllllllllllIlIIlIllIIIIIlIllll) {
        if ((!lIlllIIlllIllll(lllllllllllllIlIIlIllIIIIIlIllll.blockMaterial.isOpaque() ? 1 : 0) || lIlllIIllllIIIl(lllllllllllllIlIIlIllIIIIIlIllll.isFullCube() ? 1 : 0)) && lIlllIIllllIlIl(lllllllllllllIlIIlIllIIIIIlIllll, Blocks.glowstone) && lIlllIIllllIIIl((lllllllllllllIlIIlIllIIIIIlIllll instanceof BlockSlab) ? 1 : 0) && lIlllIIllllIIIl((lllllllllllllIlIIlIllIIIIIlIllll instanceof BlockStairs) ? 1 : 0)) {
            return BlockTrapDoor.lIIIIlIlIlIIlI[0] != 0;
        }
        return BlockTrapDoor.lIIIIlIlIlIIlI[1] != 0;
    }
    
    static {
        lIlllIIlllIlllI();
        lIlllIIlIIllIlI();
        FACING = PropertyDirection.create(BlockTrapDoor.lIIIIlIlIIIIIl[BlockTrapDoor.lIIIIlIlIlIIlI[0]], (Predicate<EnumFacing>)EnumFacing.Plane.HORIZONTAL);
        OPEN = PropertyBool.create(BlockTrapDoor.lIIIIlIlIIIIIl[BlockTrapDoor.lIIIIlIlIlIIlI[1]]);
        HALF = PropertyEnum.create(BlockTrapDoor.lIIIIlIlIIIIIl[BlockTrapDoor.lIIIIlIlIlIIlI[2]], DoorHalf.class);
    }
    
    @Override
    public boolean canPlaceBlockOnSide(final World lllllllllllllIlIIlIllIIIIIlllIlI, final BlockPos lllllllllllllIlIIlIllIIIIIlllIIl, final EnumFacing lllllllllllllIlIIlIllIIIIIlllIII) {
        if (lIlllIIllllIIIl(lllllllllllllIlIIlIllIIIIIlllIII.getAxis().isVertical() ? 1 : 0) && lIlllIIlllIllll(isValidSupportBlock(lllllllllllllIlIIlIllIIIIIlllIlI.getBlockState(lllllllllllllIlIIlIllIIIIIlllIIl.offset(lllllllllllllIlIIlIllIIIIIlllIII.getOpposite())).getBlock()) ? 1 : 0)) {
            return BlockTrapDoor.lIIIIlIlIlIIlI[1] != 0;
        }
        return BlockTrapDoor.lIIIIlIlIlIIlI[0] != 0;
    }
    
    public enum DoorHalf implements IStringSerializable
    {
        private static final /* synthetic */ String[] llllIIllIIIll;
        private final /* synthetic */ String name;
        private static final /* synthetic */ int[] llllIIllIIlll;
        
        BOTTOM(DoorHalf.llllIIllIIIll[DoorHalf.llllIIllIIlll[2]], DoorHalf.llllIIllIIlll[1], DoorHalf.llllIIllIIIll[DoorHalf.llllIIllIIlll[3]]), 
        TOP(DoorHalf.llllIIllIIIll[DoorHalf.llllIIllIIlll[0]], DoorHalf.llllIIllIIlll[0], DoorHalf.llllIIllIIIll[DoorHalf.llllIIllIIlll[1]]);
        
        @Override
        public String toString() {
            return this.name;
        }
        
        private static String lIlIlIIIllIIIIl(final String lllllllllllllIlIlllIIlIIIllIIIlI, final String lllllllllllllIlIlllIIlIIIllIIIIl) {
            try {
                final SecretKeySpec lllllllllllllIlIlllIIlIIIllIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIIlIIIllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIlllIIlIIIllIIllI = Cipher.getInstance("Blowfish");
                lllllllllllllIlIlllIIlIIIllIIllI.init(DoorHalf.llllIIllIIlll[2], lllllllllllllIlIlllIIlIIIllIIlll);
                return new String(lllllllllllllIlIlllIIlIIIllIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIIlIIIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlllIIlIIIllIIlIl) {
                lllllllllllllIlIlllIIlIIIllIIlIl.printStackTrace();
                return null;
            }
        }
        
        @Override
        public String getName() {
            return this.name;
        }
        
        static {
            lIlIlIIIllIlllI();
            lIlIlIIIllIllII();
            final DoorHalf[] enum$VALUES = new DoorHalf[DoorHalf.llllIIllIIlll[2]];
            enum$VALUES[DoorHalf.llllIIllIIlll[0]] = DoorHalf.TOP;
            enum$VALUES[DoorHalf.llllIIllIIlll[1]] = DoorHalf.BOTTOM;
            ENUM$VALUES = enum$VALUES;
        }
        
        private DoorHalf(final String lllllllllllllIlIlllIIlIIlIIIlIIl, final int lllllllllllllIlIlllIIlIIlIIIlIII, final String lllllllllllllIlIlllIIlIIlIIIIlll) {
            this.name = lllllllllllllIlIlllIIlIIlIIIIlll;
        }
        
        private static String lIlIlIIIllIIIII(final String lllllllllllllIlIlllIIlIIIllIllll, final String lllllllllllllIlIlllIIlIIIlllIIII) {
            try {
                final SecretKeySpec lllllllllllllIlIlllIIlIIIlllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIIlIIIlllIIII.getBytes(StandardCharsets.UTF_8)), DoorHalf.llllIIllIIlll[5]), "DES");
                final Cipher lllllllllllllIlIlllIIlIIIlllIIll = Cipher.getInstance("DES");
                lllllllllllllIlIlllIIlIIIlllIIll.init(DoorHalf.llllIIllIIlll[2], lllllllllllllIlIlllIIlIIIlllIlII);
                return new String(lllllllllllllIlIlllIIlIIIlllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIIlIIIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlllIIlIIIlllIIlI) {
                lllllllllllllIlIlllIIlIIIlllIIlI.printStackTrace();
                return null;
            }
        }
        
        private static void lIlIlIIIllIlllI() {
            (llllIIllIIlll = new int[6])[0] = ((113 + 43 - 41 + 12 ^ (0x13 ^ 0x79)) & (0xB2 ^ 0xC5 ^ (0xC6 ^ 0xA4) ^ -" ".length()));
            DoorHalf.llllIIllIIlll[1] = " ".length();
            DoorHalf.llllIIllIIlll[2] = "  ".length();
            DoorHalf.llllIIllIIlll[3] = "   ".length();
            DoorHalf.llllIIllIIlll[4] = (98 + 100 - 189 + 186 ^ 179 + 5 + 14 + 1);
            DoorHalf.llllIIllIIlll[5] = (0x75 ^ 0x7D);
        }
        
        private static void lIlIlIIIllIllII() {
            (llllIIllIIIll = new String[DoorHalf.llllIIllIIlll[4]])[DoorHalf.llllIIllIIlll[0]] = lIlIlIIIllIIIII("NIT3wOHV/Kk=", "zskHx");
            DoorHalf.llllIIllIIIll[DoorHalf.llllIIllIIlll[1]] = lIlIlIIIllIIIII("3hoXL+XJk2Q=", "zSDPN");
            DoorHalf.llllIIllIIIll[DoorHalf.llllIIllIIlll[2]] = lIlIlIIIllIIIII("G0adQSpahmg=", "nufSL");
            DoorHalf.llllIIllIIIll[DoorHalf.llllIIllIIlll[3]] = lIlIlIIIllIIIIl("OFjiomx7E5w=", "LWtQV");
        }
    }
}
