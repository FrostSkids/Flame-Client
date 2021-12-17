// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.IStringSerializable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.util.StatCollector;
import net.minecraft.util.EnumWorldBlockLayer;
import com.google.common.base.Predicate;
import net.minecraft.item.Item;
import java.util.Random;
import net.minecraft.util.AxisAlignedBB;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.state.BlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;

public class BlockDoor extends Block
{
    public static final /* synthetic */ PropertyEnum<EnumDoorHalf> HALF;
    public static final /* synthetic */ PropertyBool POWERED;
    public static final /* synthetic */ PropertyEnum<EnumHingePosition> HINGE;
    public static final /* synthetic */ PropertyDirection FACING;
    public static final /* synthetic */ PropertyBool OPEN;
    private static final /* synthetic */ int[] lIllIlIlIIlIll;
    private static final /* synthetic */ String[] lIllIlIIIllIII;
    
    private static void llllllIIIIIlIlI() {
        (lIllIlIIIllIII = new String[BlockDoor.lIllIlIlIIlIll[11]])[BlockDoor.lIllIlIlIIlIll[0]] = llllllIIIIIIllI("ngph3IGF+GI=", "vDtQh");
        BlockDoor.lIllIlIIIllIII[BlockDoor.lIllIlIlIIlIll[1]] = llllllIIIIIIlll("IB4tIg==", "OnHLp");
        BlockDoor.lIllIlIIIllIII[BlockDoor.lIllIlIlIIlIll[2]] = llllllIIIIIlIII("IxWm3fPR1B0=", "keCfV");
        BlockDoor.lIllIlIIIllIII[BlockDoor.lIllIlIlIIlIll[3]] = llllllIIIIIlIII("v6R9L/S2zkI=", "oQIiR");
        BlockDoor.lIllIlIIIllIII[BlockDoor.lIllIlIlIIlIll[4]] = llllllIIIIIIlll("Gi0/DQ==", "rLSkh");
        BlockDoor.lIllIlIIIllIII[BlockDoor.lIllIlIlIIlIll[5]] = llllllIIIIIIllI("P3Z/nrA0vZ8=", "aZzTB");
        BlockDoor.lIllIlIIIllIII[BlockDoor.lIllIlIlIIlIll[6]] = llllllIIIIIIllI("WG7U3AOzOCY=", "SRWcT");
        BlockDoor.lIllIlIIIllIII[BlockDoor.lIllIlIlIIlIll[7]] = llllllIIIIIlIII("E2/sx01tddE=", "lyqmQ");
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess lllllllllllllIIIIIIIIIIIIlIIlIlI, final BlockPos lllllllllllllIIIIIIIIIIIIlIIIllI) {
        this.setBoundBasedOnMeta(combineMetadata(lllllllllllllIIIIIIIIIIIIlIIlIlI, lllllllllllllIIIIIIIIIIIIlIIIllI));
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockDoor.lIllIlIlIIlIll[0] != 0;
    }
    
    private static boolean llllllIlIlIlIll(final int llllllllllllIlllllllllllIIIIIIII, final int llllllllllllIllllllllllIllllllll) {
        return llllllllllllIlllllllllllIIIIIIII != llllllllllllIllllllllllIllllllll;
    }
    
    public static EnumFacing getFacing(final int llllllllllllIlllllllllllIlIllIII) {
        return EnumFacing.getHorizontal(llllllllllllIlllllllllllIlIllIII & BlockDoor.lIllIlIlIIlIll[3]).rotateYCCW();
    }
    
    public static int combineMetadata(final IBlockAccess llllllllllllIllllllllllllIlIllIl, final BlockPos llllllllllllIllllllllllllIlIllII) {
        final IBlockState llllllllllllIllllllllllllIlllIII = llllllllllllIllllllllllllIlIllIl.getBlockState(llllllllllllIllllllllllllIlIllII);
        final int llllllllllllIllllllllllllIllIlll = llllllllllllIllllllllllllIlllIII.getBlock().getMetaFromState(llllllllllllIllllllllllllIlllIII);
        final boolean llllllllllllIllllllllllllIllIllI = isTop(llllllllllllIllllllllllllIllIlll);
        final IBlockState llllllllllllIllllllllllllIllIlIl = llllllllllllIllllllllllllIlIllIl.getBlockState(llllllllllllIllllllllllllIlIllII.down());
        final int llllllllllllIllllllllllllIllIlII = llllllllllllIllllllllllllIllIlIl.getBlock().getMetaFromState(llllllllllllIllllllllllllIllIlIl);
        int n;
        if (llllllIlIlIIlll(llllllllllllIllllllllllllIllIllI ? 1 : 0)) {
            n = llllllllllllIllllllllllllIllIlII;
            "".length();
            if (-" ".length() > (0x4E ^ 0x23 ^ (0x42 ^ 0x2B))) {
                return (0xF0 ^ 0xBD ^ (0x64 ^ 0x35)) & (52 + 73 - 23 + 34 ^ 88 + 123 - 190 + 127 ^ -" ".length());
            }
        }
        else {
            n = llllllllllllIllllllllllllIllIlll;
        }
        final int llllllllllllIllllllllllllIllIIll = n;
        final IBlockState llllllllllllIllllllllllllIllIIlI = llllllllllllIllllllllllllIlIllIl.getBlockState(llllllllllllIllllllllllllIlIllII.up());
        final int llllllllllllIllllllllllllIllIIIl = llllllllllllIllllllllllllIllIIlI.getBlock().getMetaFromState(llllllllllllIllllllllllllIllIIlI);
        int n2;
        if (llllllIlIlIIlll(llllllllllllIllllllllllllIllIllI ? 1 : 0)) {
            n2 = llllllllllllIllllllllllllIllIlll;
            "".length();
            if ((0x60 ^ 0x4B ^ (0x10 ^ 0x3F)) != (82 + 130 - 150 + 78 ^ 101 + 70 - 46 + 11)) {
                return (0x24 ^ 0x23 ^ (0xD2 ^ 0x8B)) & (60 + 65 + 18 + 9 ^ 115 + 83 - 54 + 54 ^ -" ".length());
            }
        }
        else {
            n2 = llllllllllllIllllllllllllIllIIIl;
        }
        final int llllllllllllIllllllllllllIllIIII = n2;
        int n3;
        if (llllllIlIlIIlll(llllllllllllIllllllllllllIllIIII & BlockDoor.lIllIlIlIIlIll[1])) {
            n3 = BlockDoor.lIllIlIlIIlIll[1];
            "".length();
            if (-" ".length() == "   ".length()) {
                return (57 + 88 - 144 + 131 ^ 142 + 77 - 159 + 97) & (0x1C ^ 0x59 ^ (0x2F ^ 0x73) ^ -" ".length());
            }
        }
        else {
            n3 = BlockDoor.lIllIlIlIIlIll[0];
        }
        final boolean llllllllllllIllllllllllllIlIllll = n3 != 0;
        int n4;
        if (llllllIlIlIIlll(llllllllllllIllllllllllllIllIIII & BlockDoor.lIllIlIlIIlIll[2])) {
            n4 = BlockDoor.lIllIlIlIIlIll[1];
            "".length();
            if ("  ".length() == 0) {
                return (0xE4 ^ 0xB9) & ~(0xC7 ^ 0x9A);
            }
        }
        else {
            n4 = BlockDoor.lIllIlIlIIlIll[0];
        }
        final boolean llllllllllllIllllllllllllIlIlllI = n4 != 0;
        final int removeHalfBit = removeHalfBit(llllllllllllIllllllllllllIllIIll);
        int n5;
        if (llllllIlIlIIlll(llllllllllllIllllllllllllIllIllI ? 1 : 0)) {
            n5 = BlockDoor.lIllIlIlIIlIll[11];
            "".length();
            if (null != null) {
                return (73 + 159 - 57 + 53 ^ 110 + 43 + 18 + 17) & (0x2C ^ 0x33 ^ (0xC5 ^ 0x82) ^ -" ".length());
            }
        }
        else {
            n5 = BlockDoor.lIllIlIlIIlIll[0];
        }
        final int n6 = removeHalfBit | n5;
        int n7;
        if (llllllIlIlIIlll(llllllllllllIllllllllllllIlIllll ? 1 : 0)) {
            n7 = BlockDoor.lIllIlIlIIlIll[12];
            "".length();
            if (((0x7B ^ 0x6D) & ~(0x55 ^ 0x43)) != 0x0) {
                return (0xA4 ^ 0x92) & ~(0x19 ^ 0x2F);
            }
        }
        else {
            n7 = BlockDoor.lIllIlIlIIlIll[0];
        }
        final int n8 = n6 | n7;
        int n9;
        if (llllllIlIlIIlll(llllllllllllIllllllllllllIlIlllI ? 1 : 0)) {
            n9 = BlockDoor.lIllIlIlIIlIll[13];
            "".length();
            if ("   ".length() <= -" ".length()) {
                return (0x86 ^ 0x8A) & ~(0x57 ^ 0x5B);
            }
        }
        else {
            n9 = BlockDoor.lIllIlIlIIlIll[0];
        }
        return n8 | n9;
    }
    
    private void setBoundBasedOnMeta(final int lllllllllllllIIIIIIIIIIIIIlllIII) {
        final float lllllllllllllIIIIIIIIIIIIIllllIl = 0.1875f;
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 2.0f, 1.0f);
        final EnumFacing lllllllllllllIIIIIIIIIIIIIllllII = getFacing(lllllllllllllIIIIIIIIIIIIIlllIII);
        final boolean lllllllllllllIIIIIIIIIIIIIlllIll = isOpen(lllllllllllllIIIIIIIIIIIIIlllIII);
        final boolean lllllllllllllIIIIIIIIIIIIIlllIlI = isHingeLeft(lllllllllllllIIIIIIIIIIIIIlllIII);
        if (llllllIlIlIIlll(lllllllllllllIIIIIIIIIIIIIlllIll ? 1 : 0)) {
            if (llllllIlIlIlIII(lllllllllllllIIIIIIIIIIIIIllllII, EnumFacing.EAST)) {
                if (llllllIlIlIlIIl(lllllllllllllIIIIIIIIIIIIIlllIlI ? 1 : 0)) {
                    this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, lllllllllllllIIIIIIIIIIIIIllllIl);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    this.setBlockBounds(0.0f, 0.0f, 1.0f - lllllllllllllIIIIIIIIIIIIIllllIl, 1.0f, 1.0f, 1.0f);
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return;
                    }
                }
            }
            else if (llllllIlIlIlIII(lllllllllllllIIIIIIIIIIIIIllllII, EnumFacing.SOUTH)) {
                if (llllllIlIlIlIIl(lllllllllllllIIIIIIIIIIIIIlllIlI ? 1 : 0)) {
                    this.setBlockBounds(1.0f - lllllllllllllIIIIIIIIIIIIIllllIl, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                    "".length();
                    if (" ".length() == 0) {
                        return;
                    }
                }
                else {
                    this.setBlockBounds(0.0f, 0.0f, 0.0f, lllllllllllllIIIIIIIIIIIIIllllIl, 1.0f, 1.0f);
                    "".length();
                    if ((0x7 ^ 0x3) < (0xAA ^ 0xAE)) {
                        return;
                    }
                }
            }
            else if (llllllIlIlIlIII(lllllllllllllIIIIIIIIIIIIIllllII, EnumFacing.WEST)) {
                if (llllllIlIlIlIIl(lllllllllllllIIIIIIIIIIIIIlllIlI ? 1 : 0)) {
                    this.setBlockBounds(0.0f, 0.0f, 1.0f - lllllllllllllIIIIIIIIIIIIIllllIl, 1.0f, 1.0f, 1.0f);
                    "".length();
                    if (((0x58 ^ 0x2A ^ (0x74 ^ 0x45)) & (0x7 ^ 0x69 ^ (0xC ^ 0x21) ^ -" ".length())) != 0x0) {
                        return;
                    }
                }
                else {
                    this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, lllllllllllllIIIIIIIIIIIIIllllIl);
                    "".length();
                    if ((0xC ^ 0x8) == 0x0) {
                        return;
                    }
                }
            }
            else if (llllllIlIlIlIII(lllllllllllllIIIIIIIIIIIIIllllII, EnumFacing.NORTH)) {
                if (llllllIlIlIlIIl(lllllllllllllIIIIIIIIIIIIIlllIlI ? 1 : 0)) {
                    this.setBlockBounds(0.0f, 0.0f, 0.0f, lllllllllllllIIIIIIIIIIIIIllllIl, 1.0f, 1.0f);
                    "".length();
                    if (" ".length() >= "   ".length()) {
                        return;
                    }
                }
                else {
                    this.setBlockBounds(1.0f - lllllllllllllIIIIIIIIIIIIIllllIl, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
            }
        }
        else if (llllllIlIlIlIII(lllllllllllllIIIIIIIIIIIIIllllII, EnumFacing.EAST)) {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, lllllllllllllIIIIIIIIIIIIIllllIl, 1.0f, 1.0f);
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else if (llllllIlIlIlIII(lllllllllllllIIIIIIIIIIIIIllllII, EnumFacing.SOUTH)) {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, lllllllllllllIIIIIIIIIIIIIllllIl);
            "".length();
            if ((182 + 167 - 198 + 40 ^ 41 + 14 - 42 + 174) <= ((0x65 ^ 0x4A ^ (0x7F ^ 0x8)) & (0x3F ^ 0x41 ^ (0x3F ^ 0x19) ^ -" ".length()))) {
                return;
            }
        }
        else if (llllllIlIlIlIII(lllllllllllllIIIIIIIIIIIIIllllII, EnumFacing.WEST)) {
            this.setBlockBounds(1.0f - lllllllllllllIIIIIIIIIIIIIllllIl, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
            "".length();
            if (((0x2B ^ 0x2D) & ~(0x22 ^ 0x24)) != 0x0) {
                return;
            }
        }
        else if (llllllIlIlIlIII(lllllllllllllIIIIIIIIIIIIIllllII, EnumFacing.NORTH)) {
            this.setBlockBounds(0.0f, 0.0f, 1.0f - lllllllllllllIIIIIIIIIIIIIllllIl, 1.0f, 1.0f, 1.0f);
        }
    }
    
    protected BlockDoor(final Material lllllllllllllIIIIIIIIIIIlIIllIIl) {
        super(lllllllllllllIIIIIIIIIIIlIIllIIl);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockDoor.FACING, EnumFacing.NORTH).withProperty((IProperty<Comparable>)BlockDoor.OPEN, (boolean)(BlockDoor.lIllIlIlIIlIll[0] != 0)).withProperty(BlockDoor.HINGE, EnumHingePosition.LEFT).withProperty((IProperty<Comparable>)BlockDoor.POWERED, (boolean)(BlockDoor.lIllIlIlIIlIll[0] != 0)).withProperty(BlockDoor.HALF, EnumDoorHalf.LOWER));
    }
    
    @Override
    public boolean onBlockActivated(final World lllllllllllllIIIIIIIIIIIIIlIlIll, final BlockPos lllllllllllllIIIIIIIIIIIIIlIlIlI, IBlockState lllllllllllllIIIIIIIIIIIIIIllllI, final EntityPlayer lllllllllllllIIIIIIIIIIIIIIlllIl, final EnumFacing lllllllllllllIIIIIIIIIIIIIlIIlll, final float lllllllllllllIIIIIIIIIIIIIlIIllI, final float lllllllllllllIIIIIIIIIIIIIlIIlIl, final float lllllllllllllIIIIIIIIIIIIIlIIlII) {
        if (llllllIlIlIlIII(this.blockMaterial, Material.iron)) {
            return BlockDoor.lIllIlIlIIlIll[1] != 0;
        }
        BlockPos down;
        if (llllllIlIlIlIII(lllllllllllllIIIIIIIIIIIIIIllllI.getValue(BlockDoor.HALF), EnumDoorHalf.LOWER)) {
            down = lllllllllllllIIIIIIIIIIIIIlIlIlI;
            "".length();
            if (null != null) {
                return ((47 + 30 + 36 + 63 ^ 15 + 40 - 8 + 125) & (0x5C ^ 0x3A ^ (0x69 ^ 0x13) ^ -" ".length())) != 0x0;
            }
        }
        else {
            down = lllllllllllllIIIIIIIIIIIIIlIlIlI.down();
        }
        final BlockPos lllllllllllllIIIIIIIIIIIIIlIIIll = down;
        IBlockState blockState;
        if (llllllIlIlIIlll(lllllllllllllIIIIIIIIIIIIIlIlIlI.equals(lllllllllllllIIIIIIIIIIIIIlIIIll) ? 1 : 0)) {
            blockState = lllllllllllllIIIIIIIIIIIIIIllllI;
            "".length();
            if (((0x50 ^ 0x60 ^ (0xE7 ^ 0xC0)) & (0x13 ^ 0x2B ^ (0x3E ^ 0x11) ^ -" ".length())) > 0) {
                return ((0x1B ^ 0x3C ^ (0x43 ^ 0x21)) & (0x79 ^ 0x28 ^ (0x39 ^ 0x2D) ^ -" ".length())) != 0x0;
            }
        }
        else {
            blockState = lllllllllllllIIIIIIIIIIIIIlIlIll.getBlockState(lllllllllllllIIIIIIIIIIIIIlIIIll);
        }
        final IBlockState lllllllllllllIIIIIIIIIIIIIlIIIlI = blockState;
        if (llllllIlIlIlIlI(lllllllllllllIIIIIIIIIIIIIlIIIlI.getBlock(), this)) {
            return BlockDoor.lIllIlIlIIlIll[0] != 0;
        }
        lllllllllllllIIIIIIIIIIIIIIllllI = lllllllllllllIIIIIIIIIIIIIlIIIlI.cycleProperty((IProperty<Comparable>)BlockDoor.OPEN);
        lllllllllllllIIIIIIIIIIIIIlIlIll.setBlockState(lllllllllllllIIIIIIIIIIIIIlIIIll, lllllllllllllIIIIIIIIIIIIIIllllI, BlockDoor.lIllIlIlIIlIll[2]);
        "".length();
        lllllllllllllIIIIIIIIIIIIIlIlIll.markBlockRangeForRenderUpdate(lllllllllllllIIIIIIIIIIIIIlIIIll, lllllllllllllIIIIIIIIIIIIIlIlIlI);
        int lllllllllllllIIIlIIlIlIllIllIlII;
        if (llllllIlIlIIlll(((boolean)lllllllllllllIIIIIIIIIIIIIIllllI.getValue((IProperty<Boolean>)BlockDoor.OPEN)) ? 1 : 0)) {
            lllllllllllllIIIlIIlIlIllIllIlII = BlockDoor.lIllIlIlIIlIll[8];
            "".length();
            if (null != null) {
                return ((2 + 66 + 65 + 31 ^ 143 + 5 - 71 + 103) & (0x4E ^ 0x0 ^ (0xF9 ^ 0xA7) ^ -" ".length())) != 0x0;
            }
        }
        else {
            lllllllllllllIIIlIIlIlIllIllIlII = BlockDoor.lIllIlIlIIlIll[9];
        }
        lllllllllllllIIIIIIIIIIIIIlIlIll.playAuxSFXAtEntity(lllllllllllllIIIIIIIIIIIIIIlllIl, lllllllllllllIIIlIIlIlIllIllIlII, lllllllllllllIIIIIIIIIIIIIlIlIlI, BlockDoor.lIllIlIlIIlIll[0]);
        return BlockDoor.lIllIlIlIIlIll[1] != 0;
    }
    
    public static EnumFacing getFacing(final IBlockAccess llllllllllllIlllllllllllIlIllIll, final BlockPos llllllllllllIlllllllllllIlIllIlI) {
        return getFacing(combineMetadata(llllllllllllIlllllllllllIlIllIll, llllllllllllIlllllllllllIlIllIlI));
    }
    
    private static boolean llllllIlIlIIlll(final int llllllllllllIlllllllllllIIIIIlll) {
        return llllllllllllIlllllllllllIIIIIlll != 0;
    }
    
    @Override
    public IBlockState getActualState(IBlockState llllllllllllIlllllllllllIllllIIl, final IBlockAccess llllllllllllIlllllllllllIllllllI, final BlockPos llllllllllllIlllllllllllIlllIlll) {
        if (llllllIlIlIlIII(((IBlockState)llllllllllllIlllllllllllIllllIIl).getValue((IProperty<EnumDoorHalf>)BlockDoor.HALF), EnumDoorHalf.LOWER)) {
            final IBlockState llllllllllllIlllllllllllIlllllII = llllllllllllIlllllllllllIllllllI.getBlockState(llllllllllllIlllllllllllIlllIlll.up());
            if (llllllIlIlIlIII(llllllllllllIlllllllllllIlllllII.getBlock(), this)) {
                llllllllllllIlllllllllllIllllIIl = ((IBlockState)llllllllllllIlllllllllllIllllIIl).withProperty(BlockDoor.HINGE, (EnumHingePosition)llllllllllllIlllllllllllIlllllII.getValue((IProperty<V>)BlockDoor.HINGE)).withProperty((IProperty<Comparable>)BlockDoor.POWERED, (Boolean)llllllllllllIlllllllllllIlllllII.getValue((IProperty<V>)BlockDoor.POWERED));
                "".length();
                if (null != null) {
                    return null;
                }
            }
        }
        else {
            final IBlockState llllllllllllIlllllllllllIllllIll = llllllllllllIlllllllllllIllllllI.getBlockState(llllllllllllIlllllllllllIlllIlll.down());
            if (llllllIlIlIlIII(llllllllllllIlllllllllllIllllIll.getBlock(), this)) {
                llllllllllllIlllllllllllIllllIIl = ((IBlockState)llllllllllllIlllllllllllIllllIIl).withProperty((IProperty<Comparable>)BlockDoor.FACING, (EnumFacing)llllllllllllIlllllllllllIllllIll.getValue((IProperty<V>)BlockDoor.FACING)).withProperty((IProperty<Comparable>)BlockDoor.OPEN, (Boolean)llllllllllllIlllllllllllIllllIll.getValue((IProperty<V>)BlockDoor.OPEN));
            }
        }
        return (IBlockState)llllllllllllIlllllllllllIllllIIl;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockDoor.lIllIlIlIIlIll[5]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockDoor.lIllIlIlIIlIll[0]] = BlockDoor.HALF;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockDoor.lIllIlIlIIlIll[1]] = BlockDoor.FACING;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockDoor.lIllIlIlIIlIll[2]] = BlockDoor.OPEN;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockDoor.lIllIlIlIIlIll[3]] = BlockDoor.HINGE;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockDoor.lIllIlIlIIlIll[4]] = BlockDoor.POWERED;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    protected static boolean isTop(final int llllllllllllIlllllllllllIlIlIIIl) {
        if (llllllIlIlIIlll(llllllllllllIlllllllllllIlIlIIIl & BlockDoor.lIllIlIlIIlIll[11])) {
            return BlockDoor.lIllIlIlIIlIll[1] != 0;
        }
        return BlockDoor.lIllIlIlIIlIll[0] != 0;
    }
    
    private static String llllllIIIIIlIII(final String llllllllllllIlllllllllllIlIIIIIl, final String llllllllllllIlllllllllllIlIIIIII) {
        try {
            final SecretKeySpec llllllllllllIlllllllllllIlIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllllllllIlIIIIII.getBytes(StandardCharsets.UTF_8)), BlockDoor.lIllIlIlIIlIll[11]), "DES");
            final Cipher llllllllllllIlllllllllllIlIIIlIl = Cipher.getInstance("DES");
            llllllllllllIlllllllllllIlIIIlIl.init(BlockDoor.lIllIlIlIIlIll[2], llllllllllllIlllllllllllIlIIIllI);
            return new String(llllllllllllIlllllllllllIlIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllllllllllIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllllllllIlIIIlII) {
            llllllllllllIlllllllllllIlIIIlII.printStackTrace();
            return null;
        }
    }
    
    public static boolean isOpen(final IBlockAccess llllllllllllIlllllllllllIllIIIll, final BlockPos llllllllllllIlllllllllllIllIIIlI) {
        return isOpen(combineMetadata(llllllllllllIlllllllllllIllIIIll, llllllllllllIlllllllllllIllIIIlI));
    }
    
    private static boolean llllllIlIlIlIII(final Object llllllllllllIlllllllllllIIIIlIlI, final Object llllllllllllIlllllllllllIIIIlIIl) {
        return llllllllllllIlllllllllllIIIIlIlI == llllllllllllIlllllllllllIIIIlIIl;
    }
    
    private static String llllllIIIIIIllI(final String llllllllllllIlllllllllllIIllIllI, final String llllllllllllIlllllllllllIIllIIll) {
        try {
            final SecretKeySpec llllllllllllIlllllllllllIIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllllllllIIllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllllllllIIlllIII = Cipher.getInstance("Blowfish");
            llllllllllllIlllllllllllIIlllIII.init(BlockDoor.lIllIlIlIIlIll[2], llllllllllllIlllllllllllIIlllIIl);
            return new String(llllllllllllIlllllllllllIIlllIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllllllllllIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllllllllIIllIlll) {
            llllllllllllIlllllllllllIIllIlll.printStackTrace();
            return null;
        }
    }
    
    protected static boolean isHingeLeft(final int llllllllllllIlllllllllllIlIIlllI) {
        if (llllllIlIlIIlll(llllllllllllIlllllllllllIlIIlllI & BlockDoor.lIllIlIlIIlIll[12])) {
            return BlockDoor.lIllIlIlIIlIll[1] != 0;
        }
        return BlockDoor.lIllIlIlIIlIll[0] != 0;
    }
    
    private static boolean llllllIlIllllIl(final int llllllllllllIlllllllllllIIIlIIlI, final int llllllllllllIlllllllllllIIIlIIIl) {
        return llllllllllllIlllllllllllIIIlIIlI < llllllllllllIlllllllllllIIIlIIIl;
    }
    
    @Override
    public AxisAlignedBB getSelectedBoundingBox(final World lllllllllllllIIIIIIIIIIIIllIllll, final BlockPos lllllllllllllIIIIIIIIIIIIllIllIl) {
        this.setBlockBoundsBasedOnState(lllllllllllllIIIIIIIIIIIIllIllll, lllllllllllllIIIIIIIIIIIIllIllIl);
        return super.getSelectedBoundingBox(lllllllllllllIIIIIIIIIIIIllIllll, lllllllllllllIIIIIIIIIIIIllIllIl);
    }
    
    @Override
    public Item getItemDropped(final IBlockState llllllllllllIllllllllllllllIIlIl, final Random llllllllllllIllllllllllllllIIlII, final int llllllllllllIllllllllllllllIIIll) {
        Item item;
        if (llllllIlIlIlIII(llllllllllllIllllllllllllllIIlIl.getValue(BlockDoor.HALF), EnumDoorHalf.UPPER)) {
            item = null;
            "".length();
            if ((0x98 ^ 0xA0 ^ (0xC ^ 0x30)) == "   ".length()) {
                return null;
            }
        }
        else {
            item = this.getItem();
        }
        return item;
    }
    
    @Override
    public Item getItem(final World llllllllllllIllllllllllllIIllllI, final BlockPos llllllllllllIllllllllllllIIlllIl) {
        return this.getItem();
    }
    
    @Override
    public boolean isPassable(final IBlockAccess lllllllllllllIIIIIIIIIIIIlllllIl, final BlockPos lllllllllllllIIIIIIIIIIIIlllllll) {
        return isOpen(combineMetadata(lllllllllllllIIIIIIIIIIIIlllllIl, lllllllllllllIIIIIIIIIIIIlllllll));
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World lllllllllllllIIIIIIIIIIIIlIlllIl, final BlockPos lllllllllllllIIIIIIIIIIIIlIllIll, final IBlockState lllllllllllllIIIIIIIIIIIIlIlIIll) {
        this.setBlockBoundsBasedOnState(lllllllllllllIIIIIIIIIIIIlIlllIl, lllllllllllllIIIIIIIIIIIIlIllIll);
        return super.getCollisionBoundingBox(lllllllllllllIIIIIIIIIIIIlIlllIl, lllllllllllllIIIIIIIIIIIIlIllIll, lllllllllllllIIIIIIIIIIIIlIlIIll);
    }
    
    private static boolean llllllIlIlIlIIl(final int llllllllllllIlllllllllllIIIIIlIl) {
        return llllllllllllIlllllllllllIIIIIlIl == 0;
    }
    
    private static boolean llllllIlIlIlIlI(final Object llllllllllllIlllllllllllIIIIlllI, final Object llllllllllllIlllllllllllIIIIllIl) {
        return llllllllllllIlllllllllllIIIIlllI != llllllllllllIlllllllllllIIIIllIl;
    }
    
    private static boolean llllllIlIlllIIl(final int llllllllllllIlllllllllllIIIIIIll) {
        return llllllllllllIlllllllllllIIIIIIll > 0;
    }
    
    static {
        llllllIlIlIIllI();
        llllllIIIIIlIlI();
        FACING = PropertyDirection.create(BlockDoor.lIllIlIIIllIII[BlockDoor.lIllIlIlIIlIll[0]], (Predicate<EnumFacing>)EnumFacing.Plane.HORIZONTAL);
        OPEN = PropertyBool.create(BlockDoor.lIllIlIIIllIII[BlockDoor.lIllIlIlIIlIll[1]]);
        HINGE = PropertyEnum.create(BlockDoor.lIllIlIIIllIII[BlockDoor.lIllIlIlIIlIll[2]], EnumHingePosition.class);
        POWERED = PropertyBool.create(BlockDoor.lIllIlIIIllIII[BlockDoor.lIllIlIlIIlIll[3]]);
        HALF = PropertyEnum.create(BlockDoor.lIllIlIIIllIII[BlockDoor.lIllIlIlIIlIll[4]], EnumDoorHalf.class);
    }
    
    private static void llllllIlIlIIllI() {
        (lIllIlIlIIlIll = new int[14])[0] = ((0x78 ^ 0x70) & ~(0xA0 ^ 0xA8));
        BlockDoor.lIllIlIlIIlIll[1] = " ".length();
        BlockDoor.lIllIlIlIIlIll[2] = "  ".length();
        BlockDoor.lIllIlIlIIlIll[3] = "   ".length();
        BlockDoor.lIllIlIlIIlIll[4] = (98 + 7 - 57 + 132 ^ 4 + 35 + 107 + 30);
        BlockDoor.lIllIlIlIIlIll[5] = (0x21 ^ 0x24);
        BlockDoor.lIllIlIlIIlIll[6] = (0x7F ^ 0x57 ^ (0x3F ^ 0x11));
        BlockDoor.lIllIlIlIIlIll[7] = (141 + 158 - 147 + 25 ^ 181 + 26 - 43 + 18);
        BlockDoor.lIllIlIlIIlIll[8] = (0xFFFFF7FF & 0xBEB);
        BlockDoor.lIllIlIlIIlIll[9] = (0xFFFFCBFF & 0x37EE);
        BlockDoor.lIllIlIlIIlIll[10] = 16 + 217 - 7 + 29;
        BlockDoor.lIllIlIlIIlIll[11] = ("   ".length() ^ (0x7C ^ 0x77));
        BlockDoor.lIllIlIlIIlIll[12] = (76 + 132 - 57 + 8 ^ 9 + 76 - 27 + 85);
        BlockDoor.lIllIlIlIIlIll[13] = (113 + 86 - 159 + 112 ^ 155 + 174 - 158 + 13);
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT;
    }
    
    public void toggleDoor(final World lllllllllllllIIIIIIIIIIIIIIlIIlI, final BlockPos lllllllllllllIIIIIIIIIIIIIIIlIlI, final boolean lllllllllllllIIIIIIIIIIIIIIIlIIl) {
        final IBlockState lllllllllllllIIIIIIIIIIIIIIIllll = lllllllllllllIIIIIIIIIIIIIIlIIlI.getBlockState(lllllllllllllIIIIIIIIIIIIIIIlIlI);
        if (llllllIlIlIlIII(lllllllllllllIIIIIIIIIIIIIIIllll.getBlock(), this)) {
            BlockPos down;
            if (llllllIlIlIlIII(lllllllllllllIIIIIIIIIIIIIIIllll.getValue(BlockDoor.HALF), EnumDoorHalf.LOWER)) {
                down = lllllllllllllIIIIIIIIIIIIIIIlIlI;
                "".length();
                if (" ".length() < " ".length()) {
                    return;
                }
            }
            else {
                down = lllllllllllllIIIIIIIIIIIIIIIlIlI.down();
            }
            final BlockPos lllllllllllllIIIIIIIIIIIIIIIlllI = down;
            IBlockState blockState;
            if (llllllIlIlIlIII(lllllllllllllIIIIIIIIIIIIIIIlIlI, lllllllllllllIIIIIIIIIIIIIIIlllI)) {
                blockState = lllllllllllllIIIIIIIIIIIIIIIllll;
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                blockState = lllllllllllllIIIIIIIIIIIIIIlIIlI.getBlockState(lllllllllllllIIIIIIIIIIIIIIIlllI);
            }
            final IBlockState lllllllllllllIIIIIIIIIIIIIIIllIl = blockState;
            if (llllllIlIlIlIII(lllllllllllllIIIIIIIIIIIIIIIllIl.getBlock(), this) && llllllIlIlIlIll(((boolean)lllllllllllllIIIIIIIIIIIIIIIllIl.getValue((IProperty<Boolean>)BlockDoor.OPEN)) ? 1 : 0, lllllllllllllIIIIIIIIIIIIIIIlIIl ? 1 : 0)) {
                lllllllllllllIIIIIIIIIIIIIIlIIlI.setBlockState(lllllllllllllIIIIIIIIIIIIIIIlllI, lllllllllllllIIIIIIIIIIIIIIIllIl.withProperty((IProperty<Comparable>)BlockDoor.OPEN, lllllllllllllIIIIIIIIIIIIIIIlIIl), BlockDoor.lIllIlIlIIlIll[2]);
                "".length();
                lllllllllllllIIIIIIIIIIIIIIlIIlI.markBlockRangeForRenderUpdate(lllllllllllllIIIIIIIIIIIIIIIlllI, lllllllllllllIIIIIIIIIIIIIIIlIlI);
                final EntityPlayer lllllllllllllIIIlIIlIlIllIllIlIl = null;
                int lllllllllllllIIIlIIlIlIllIllIlII;
                if (llllllIlIlIIlll(lllllllllllllIIIIIIIIIIIIIIIlIIl ? 1 : 0)) {
                    lllllllllllllIIIlIIlIlIllIllIlII = BlockDoor.lIllIlIlIIlIll[8];
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIIlIIlIlIllIllIlII = BlockDoor.lIllIlIlIIlIll[9];
                }
                lllllllllllllIIIIIIIIIIIIIIlIIlI.playAuxSFXAtEntity(lllllllllllllIIIlIIlIlIllIllIlIl, lllllllllllllIIIlIIlIlIllIllIlII, lllllllllllllIIIIIIIIIIIIIIIlIlI, BlockDoor.lIllIlIlIIlIll[0]);
            }
        }
    }
    
    @Override
    public void onBlockHarvested(final World llllllllllllIllllllllllllIIlIIIl, final BlockPos llllllllllllIllllllllllllIIlIIII, final IBlockState llllllllllllIllllllllllllIIIlIIl, final EntityPlayer llllllllllllIllllllllllllIIIlllI) {
        final BlockPos llllllllllllIllllllllllllIIIllIl = llllllllllllIllllllllllllIIlIIII.down();
        if (llllllIlIlIIlll(llllllllllllIllllllllllllIIIlllI.capabilities.isCreativeMode ? 1 : 0) && llllllIlIlIlIII(llllllllllllIllllllllllllIIIlIIl.getValue(BlockDoor.HALF), EnumDoorHalf.UPPER) && llllllIlIlIlIII(llllllllllllIllllllllllllIIlIIIl.getBlockState(llllllllllllIllllllllllllIIIllIl).getBlock(), this)) {
            llllllllllllIllllllllllllIIlIIIl.setBlockToAir(llllllllllllIllllllllllllIIIllIl);
            "".length();
        }
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIlllllllllllIlllIIlI) {
        IBlockState blockState;
        if (llllllIlIlllIIl(llllllllllllIlllllllllllIlllIIlI & BlockDoor.lIllIlIlIIlIll[11])) {
            final IBlockState withProperty = this.getDefaultState().withProperty(BlockDoor.HALF, EnumDoorHalf.UPPER);
            final PropertyEnum<EnumHingePosition> hinge = BlockDoor.HINGE;
            EnumHingePosition enumHingePosition;
            if (llllllIlIlllIIl(llllllllllllIlllllllllllIlllIIlI & BlockDoor.lIllIlIlIIlIll[1])) {
                enumHingePosition = EnumHingePosition.RIGHT;
                "".length();
                if (((0x9 ^ 0x30) & ~(0xA5 ^ 0x9C)) != 0x0) {
                    return null;
                }
            }
            else {
                enumHingePosition = EnumHingePosition.LEFT;
            }
            final IBlockState withProperty2 = withProperty.withProperty((IProperty<Comparable>)hinge, enumHingePosition);
            final PropertyBool powered = BlockDoor.POWERED;
            int b;
            if (llllllIlIlllIIl(llllllllllllIlllllllllllIlllIIlI & BlockDoor.lIllIlIlIIlIll[2])) {
                b = BlockDoor.lIllIlIlIIlIll[1];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                b = BlockDoor.lIllIlIlIIlIll[0];
            }
            blockState = withProperty2.withProperty((IProperty<Comparable>)powered, (boolean)(b != 0));
            "".length();
            if (((0x64 ^ 0x30) & ~(0xC8 ^ 0x9C)) != 0x0) {
                return null;
            }
        }
        else {
            final IBlockState withProperty3 = this.getDefaultState().withProperty(BlockDoor.HALF, EnumDoorHalf.LOWER).withProperty((IProperty<Comparable>)BlockDoor.FACING, EnumFacing.getHorizontal(llllllllllllIlllllllllllIlllIIlI & BlockDoor.lIllIlIlIIlIll[3]).rotateYCCW());
            final PropertyBool open = BlockDoor.OPEN;
            int b2;
            if (llllllIlIlllIIl(llllllllllllIlllllllllllIlllIIlI & BlockDoor.lIllIlIlIIlIll[4])) {
                b2 = BlockDoor.lIllIlIlIIlIll[1];
                "".length();
                if ("   ".length() == " ".length()) {
                    return null;
                }
            }
            else {
                b2 = BlockDoor.lIllIlIlIIlIll[0];
            }
            blockState = withProperty3.withProperty((IProperty<Comparable>)open, (boolean)(b2 != 0));
        }
        return blockState;
    }
    
    @Override
    public String getLocalizedName() {
        return StatCollector.translateToLocal(String.valueOf(new StringBuilder(String.valueOf(this.getUnlocalizedName())).append(BlockDoor.lIllIlIIIllIII[BlockDoor.lIllIlIlIIlIll[5]])).replaceAll(BlockDoor.lIllIlIIIllIII[BlockDoor.lIllIlIlIIlIll[6]], BlockDoor.lIllIlIIIllIII[BlockDoor.lIllIlIlIIlIll[7]]));
    }
    
    private Item getItem() {
        Item item;
        if (llllllIlIlIlIII(this, Blocks.iron_door)) {
            item = Items.iron_door;
            "".length();
            if ("  ".length() == "   ".length()) {
                return null;
            }
        }
        else if (llllllIlIlIlIII(this, Blocks.spruce_door)) {
            item = Items.spruce_door;
            "".length();
            if (((0x6A ^ 0x77) & ~(0x2B ^ 0x36)) != 0x0) {
                return null;
            }
        }
        else if (llllllIlIlIlIII(this, Blocks.birch_door)) {
            item = Items.birch_door;
            "".length();
            if ("   ".length() <= -" ".length()) {
                return null;
            }
        }
        else if (llllllIlIlIlIII(this, Blocks.jungle_door)) {
            item = Items.jungle_door;
            "".length();
            if ((0x70 ^ 0x74) <= "   ".length()) {
                return null;
            }
        }
        else if (llllllIlIlIlIII(this, Blocks.acacia_door)) {
            item = Items.acacia_door;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        else if (llllllIlIlIlIII(this, Blocks.dark_oak_door)) {
            item = Items.dark_oak_door;
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        else {
            item = Items.oak_door;
        }
        return item;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockDoor.lIllIlIlIIlIll[0] != 0;
    }
    
    private static String llllllIIIIIIlll(String llllllllllllIlllllllllllIIlIIIIl, final String llllllllllllIlllllllllllIIlIIlIl) {
        llllllllllllIlllllllllllIIlIIIIl = new String(Base64.getDecoder().decode(llllllllllllIlllllllllllIIlIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllllllllIIlIIlII = new StringBuilder();
        final char[] llllllllllllIlllllllllllIIlIIIll = llllllllllllIlllllllllllIIlIIlIl.toCharArray();
        int llllllllllllIlllllllllllIIlIIIlI = BlockDoor.lIllIlIlIIlIll[0];
        final Exception llllllllllllIlllllllllllIIIlllII = (Object)llllllllllllIlllllllllllIIlIIIIl.toCharArray();
        final Exception llllllllllllIlllllllllllIIIllIll = (Exception)llllllllllllIlllllllllllIIIlllII.length;
        String llllllllllllIlllllllllllIIIllIlI = (String)BlockDoor.lIllIlIlIIlIll[0];
        while (llllllIlIllllIl((int)llllllllllllIlllllllllllIIIllIlI, (int)llllllllllllIlllllllllllIIIllIll)) {
            final char llllllllllllIlllllllllllIIlIIlll = llllllllllllIlllllllllllIIIlllII[llllllllllllIlllllllllllIIIllIlI];
            llllllllllllIlllllllllllIIlIIlII.append((char)(llllllllllllIlllllllllllIIlIIlll ^ llllllllllllIlllllllllllIIlIIIll[llllllllllllIlllllllllllIIlIIIlI % llllllllllllIlllllllllllIIlIIIll.length]));
            "".length();
            ++llllllllllllIlllllllllllIIlIIIlI;
            ++llllllllllllIlllllllllllIIIllIlI;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllllllllIIlIIlII);
    }
    
    @Override
    public MovingObjectPosition collisionRayTrace(final World llllllllllllIlllllllllllllIllIlI, final BlockPos llllllllllllIlllllllllllllIllIIl, final Vec3 llllllllllllIlllllllllllllIlIIll, final Vec3 llllllllllllIlllllllllllllIlIlll) {
        this.setBlockBoundsBasedOnState(llllllllllllIlllllllllllllIllIlI, llllllllllllIlllllllllllllIllIIl);
        return super.collisionRayTrace(llllllllllllIlllllllllllllIllIlI, llllllllllllIlllllllllllllIllIIl, llllllllllllIlllllllllllllIlIIll, llllllllllllIlllllllllllllIlIlll);
    }
    
    private static boolean llllllIlIlIllll(final int llllllllllllIlllllllllllIIIlIllI, final int llllllllllllIlllllllllllIIIlIlIl) {
        return llllllllllllIlllllllllllIIIlIllI >= llllllllllllIlllllllllllIIIlIlIl;
    }
    
    @Override
    public int getMobilityFlag() {
        return BlockDoor.lIllIlIlIIlIll[1];
    }
    
    @Override
    public boolean canPlaceBlockAt(final World llllllllllllIlllllllllllllIIllIl, final BlockPos llllllllllllIlllllllllllllIIllII) {
        int n;
        if (llllllIlIlIllll(llllllllllllIlllllllllllllIIllII.getY(), BlockDoor.lIllIlIlIIlIll[10])) {
            n = BlockDoor.lIllIlIlIIlIll[0];
            "".length();
            if (null != null) {
                return ((0xC1 ^ 0x9D) & ~(0x6D ^ 0x31)) != 0x0;
            }
        }
        else if (llllllIlIlIIlll(World.doesBlockHaveSolidTopSurface(llllllllllllIlllllllllllllIIllIl, llllllllllllIlllllllllllllIIllII.down()) ? 1 : 0) && llllllIlIlIIlll(super.canPlaceBlockAt(llllllllllllIlllllllllllllIIllIl, llllllllllllIlllllllllllllIIllII) ? 1 : 0) && llllllIlIlIIlll(super.canPlaceBlockAt(llllllllllllIlllllllllllllIIllIl, llllllllllllIlllllllllllllIIllII.up()) ? 1 : 0)) {
            n = BlockDoor.lIllIlIlIIlIll[1];
            "".length();
            if ("  ".length() > (0xA2 ^ 0x93 ^ (0x8E ^ 0xBB))) {
                return ((104 + 160 - 104 + 28 ^ 42 + 45 + 48 + 1) & (0x3A ^ 0x5D ^ (0x78 ^ 0x2B) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = BlockDoor.lIllIlIlIIlIll[0];
        }
        return n != 0;
    }
    
    protected static boolean isOpen(final int llllllllllllIlllllllllllIlIlIlII) {
        if (llllllIlIlIIlll(llllllllllllIlllllllllllIlIlIlII & BlockDoor.lIllIlIlIIlIll[4])) {
            return BlockDoor.lIllIlIlIIlIll[1] != 0;
        }
        return BlockDoor.lIllIlIlIIlIll[0] != 0;
    }
    
    protected static int removeHalfBit(final int llllllllllllIlllllllllllIllIIllI) {
        return llllllllllllIlllllllllllIllIIllI & BlockDoor.lIllIlIlIIlIll[7];
    }
    
    @Override
    public void onNeighborBlockChange(final World llllllllllllIllllllllllllllllIll, final BlockPos llllllllllllIllllllllllllllllIlI, final IBlockState llllllllllllIllllllllllllllIlllI, final Block llllllllllllIllllllllllllllllIII) {
        if (llllllIlIlIlIII(llllllllllllIllllllllllllllIlllI.getValue(BlockDoor.HALF), EnumDoorHalf.UPPER)) {
            final BlockPos llllllllllllIlllllllllllllllIlll = llllllllllllIllllllllllllllllIlI.down();
            final IBlockState llllllllllllIlllllllllllllllIllI = llllllllllllIllllllllllllllllIll.getBlockState(llllllllllllIlllllllllllllllIlll);
            if (llllllIlIlIlIlI(llllllllllllIlllllllllllllllIllI.getBlock(), this)) {
                llllllllllllIllllllllllllllllIll.setBlockToAir(llllllllllllIllllllllllllllllIlI);
                "".length();
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
            }
            else if (llllllIlIlIlIlI(llllllllllllIllllllllllllllllIII, this)) {
                this.onNeighborBlockChange(llllllllllllIllllllllllllllllIll, llllllllllllIlllllllllllllllIlll, llllllllllllIlllllllllllllllIllI, llllllllllllIllllllllllllllllIII);
                "".length();
                if ((0xB5 ^ 0xB1) < ((0x1E ^ 0x16) & ~(0x4F ^ 0x47))) {
                    return;
                }
            }
        }
        else {
            boolean llllllllllllIlllllllllllllllIlIl = BlockDoor.lIllIlIlIIlIll[0] != 0;
            final BlockPos llllllllllllIlllllllllllllllIlII = llllllllllllIllllllllllllllllIlI.up();
            final IBlockState llllllllllllIlllllllllllllllIIll = llllllllllllIllllllllllllllllIll.getBlockState(llllllllllllIlllllllllllllllIlII);
            if (llllllIlIlIlIlI(llllllllllllIlllllllllllllllIIll.getBlock(), this)) {
                llllllllllllIllllllllllllllllIll.setBlockToAir(llllllllllllIllllllllllllllllIlI);
                "".length();
                llllllllllllIlllllllllllllllIlIl = (BlockDoor.lIllIlIlIIlIll[1] != 0);
            }
            if (llllllIlIlIlIIl(World.doesBlockHaveSolidTopSurface(llllllllllllIllllllllllllllllIll, llllllllllllIllllllllllllllllIlI.down()) ? 1 : 0)) {
                llllllllllllIllllllllllllllllIll.setBlockToAir(llllllllllllIllllllllllllllllIlI);
                "".length();
                llllllllllllIlllllllllllllllIlIl = (BlockDoor.lIllIlIlIIlIll[1] != 0);
                if (llllllIlIlIlIII(llllllllllllIlllllllllllllllIIll.getBlock(), this)) {
                    llllllllllllIllllllllllllllllIll.setBlockToAir(llllllllllllIlllllllllllllllIlII);
                    "".length();
                }
            }
            if (llllllIlIlIIlll(llllllllllllIlllllllllllllllIlIl ? 1 : 0)) {
                if (llllllIlIlIlIIl(llllllllllllIllllllllllllllllIll.isRemote ? 1 : 0)) {
                    this.dropBlockAsItem(llllllllllllIllllllllllllllllIll, llllllllllllIllllllllllllllllIlI, llllllllllllIllllllllllllllIlllI, BlockDoor.lIllIlIlIIlIll[0]);
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return;
                    }
                }
            }
            else {
                int n;
                if (llllllIlIlIlIIl(llllllllllllIllllllllllllllllIll.isBlockPowered(llllllllllllIllllllllllllllllIlI) ? 1 : 0) && llllllIlIlIlIIl(llllllllllllIllllllllllllllllIll.isBlockPowered(llllllllllllIlllllllllllllllIlII) ? 1 : 0)) {
                    n = BlockDoor.lIllIlIlIIlIll[0];
                    "".length();
                    if (((0x75 ^ 0x50) & ~(0x60 ^ 0x45)) != 0x0) {
                        return;
                    }
                }
                else {
                    n = BlockDoor.lIllIlIlIIlIll[1];
                }
                final boolean llllllllllllIlllllllllllllllIIlI = n != 0;
                if ((!llllllIlIlIlIIl(llllllllllllIlllllllllllllllIIlI ? 1 : 0) || llllllIlIlIIlll(llllllllllllIllllllllllllllllIII.canProvidePower() ? 1 : 0)) && llllllIlIlIlIlI(llllllllllllIllllllllllllllllIII, this) && llllllIlIlIlIll(llllllllllllIlllllllllllllllIIlI ? 1 : 0, ((boolean)llllllllllllIlllllllllllllllIIll.getValue((IProperty<Boolean>)BlockDoor.POWERED)) ? 1 : 0)) {
                    llllllllllllIllllllllllllllllIll.setBlockState(llllllllllllIlllllllllllllllIlII, llllllllllllIlllllllllllllllIIll.withProperty((IProperty<Comparable>)BlockDoor.POWERED, llllllllllllIlllllllllllllllIIlI), BlockDoor.lIllIlIlIIlIll[2]);
                    "".length();
                    if (llllllIlIlIlIll(llllllllllllIlllllllllllllllIIlI ? 1 : 0, ((boolean)llllllllllllIllllllllllllllIlllI.getValue((IProperty<Boolean>)BlockDoor.OPEN)) ? 1 : 0)) {
                        llllllllllllIllllllllllllllllIll.setBlockState(llllllllllllIllllllllllllllllIlI, llllllllllllIllllllllllllllIlllI.withProperty((IProperty<Comparable>)BlockDoor.OPEN, llllllllllllIlllllllllllllllIIlI), BlockDoor.lIllIlIlIIlIll[2]);
                        "".length();
                        llllllllllllIllllllllllllllllIll.markBlockRangeForRenderUpdate(llllllllllllIllllllllllllllllIlI, llllllllllllIllllllllllllllllIlI);
                        final EntityPlayer lllllllllllllIIIlIIlIlIllIllIlIl = null;
                        int lllllllllllllIIIlIIlIlIllIllIlII;
                        if (llllllIlIlIIlll(llllllllllllIlllllllllllllllIIlI ? 1 : 0)) {
                            lllllllllllllIIIlIIlIlIllIllIlII = BlockDoor.lIllIlIlIIlIll[8];
                            "".length();
                            if ("   ".length() <= "  ".length()) {
                                return;
                            }
                        }
                        else {
                            lllllllllllllIIIlIIlIlIllIllIlII = BlockDoor.lIllIlIlIIlIll[9];
                        }
                        llllllllllllIllllllllllllllllIll.playAuxSFXAtEntity(lllllllllllllIIIlIIlIlIllIllIlIl, lllllllllllllIIIlIIlIlIllIllIlII, llllllllllllIllllllllllllllllIlI, BlockDoor.lIllIlIlIIlIll[0]);
                    }
                }
            }
        }
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIlllllllllllIllIlIlI) {
        int llllllllllllIlllllllllllIllIlIll = BlockDoor.lIllIlIlIIlIll[0];
        if (llllllIlIlIlIII(llllllllllllIlllllllllllIllIlIlI.getValue(BlockDoor.HALF), EnumDoorHalf.UPPER)) {
            llllllllllllIlllllllllllIllIlIll |= BlockDoor.lIllIlIlIIlIll[11];
            if (llllllIlIlIlIII(llllllllllllIlllllllllllIllIlIlI.getValue(BlockDoor.HINGE), EnumHingePosition.RIGHT)) {
                llllllllllllIlllllllllllIllIlIll |= BlockDoor.lIllIlIlIIlIll[1];
            }
            if (llllllIlIlIIlll(((boolean)llllllllllllIlllllllllllIllIlIlI.getValue((IProperty<Boolean>)BlockDoor.POWERED)) ? 1 : 0)) {
                llllllllllllIlllllllllllIllIlIll |= BlockDoor.lIllIlIlIIlIll[2];
                "".length();
                if (((0x20 ^ 0x7E) & ~(0x74 ^ 0x2A)) > " ".length()) {
                    return (0x54 ^ 0x5E) & ~(0x46 ^ 0x4C);
                }
            }
        }
        else {
            llllllllllllIlllllllllllIllIlIll |= llllllllllllIlllllllllllIllIlIlI.getValue((IProperty<EnumFacing>)BlockDoor.FACING).rotateY().getHorizontalIndex();
            if (llllllIlIlIIlll(((boolean)llllllllllllIlllllllllllIllIlIlI.getValue((IProperty<Boolean>)BlockDoor.OPEN)) ? 1 : 0)) {
                llllllllllllIlllllllllllIllIlIll |= BlockDoor.lIllIlIlIIlIll[4];
            }
        }
        return llllllllllllIlllllllllllIllIlIll;
    }
    
    public enum EnumHingePosition implements IStringSerializable
    {
        RIGHT(EnumHingePosition.lllIIllllIIIll[EnumHingePosition.lllIIllllIIlIl[1]], EnumHingePosition.lllIIllllIIlIl[1]);
        
        private static final /* synthetic */ int[] lllIIllllIIlIl;
        private static final /* synthetic */ String[] lllIIllllIIIll;
        
        LEFT(EnumHingePosition.lllIIllllIIIll[EnumHingePosition.lllIIllllIIlIl[0]], EnumHingePosition.lllIIllllIIlIl[0]);
        
        private EnumHingePosition(final String llllllllllllIlIlllIllIIIIIlIllll, final int llllllllllllIlIlllIllIIIIIlIlllI) {
        }
        
        private static String lIlIIIIIllIlIllI(String llllllllllllIlIlllIllIIIIIIIIIll, final String llllllllllllIlIlllIllIIIIIIIIIlI) {
            llllllllllllIlIlllIllIIIIIIIIIll = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIlIlllIllIIIIIIIIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlIlllIllIIIIIIIIllI = new StringBuilder();
            final char[] llllllllllllIlIlllIllIIIIIIIIlIl = llllllllllllIlIlllIllIIIIIIIIIlI.toCharArray();
            int llllllllllllIlIlllIllIIIIIIIIlII = EnumHingePosition.lllIIllllIIlIl[0];
            final long llllllllllllIlIlllIlIllllllllllI = (Object)((String)llllllllllllIlIlllIllIIIIIIIIIll).toCharArray();
            final float llllllllllllIlIlllIlIlllllllllIl = llllllllllllIlIlllIlIllllllllllI.length;
            double llllllllllllIlIlllIlIlllllllllII = EnumHingePosition.lllIIllllIIlIl[0];
            while (lIlIIIIIlllIlIll((int)llllllllllllIlIlllIlIlllllllllII, (int)llllllllllllIlIlllIlIlllllllllIl)) {
                final char llllllllllllIlIlllIllIIIIIIIlIIl = llllllllllllIlIlllIlIllllllllllI[llllllllllllIlIlllIlIlllllllllII];
                llllllllllllIlIlllIllIIIIIIIIllI.append((char)(llllllllllllIlIlllIllIIIIIIIlIIl ^ llllllllllllIlIlllIllIIIIIIIIlIl[llllllllllllIlIlllIllIIIIIIIIlII % llllllllllllIlIlllIllIIIIIIIIlIl.length]));
                "".length();
                ++llllllllllllIlIlllIllIIIIIIIIlII;
                ++llllllllllllIlIlllIlIlllllllllII;
                "".length();
                if (((0x73 ^ 0x79) & ~(0xC ^ 0x6)) >= "   ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlIlllIllIIIIIIIIllI);
        }
        
        private static void lIlIIIIIllIllIII() {
            (lllIIllllIIIll = new String[EnumHingePosition.lllIIllllIIlIl[4]])[EnumHingePosition.lllIIllllIIlIl[0]] = lIlIIIIIllIlIlIl("vAZUvl/q8Bc=", "pbRBT");
            EnumHingePosition.lllIIllllIIIll[EnumHingePosition.lllIIllllIIlIl[1]] = lIlIIIIIllIlIllI("IREIDCM=", "sXODw");
            EnumHingePosition.lllIIllllIIIll[EnumHingePosition.lllIIllllIIlIl[2]] = lIlIIIIIllIlIlll("DIsI1w86UoU=", "MymaT");
            EnumHingePosition.lllIIllllIIIll[EnumHingePosition.lllIIllllIIlIl[3]] = lIlIIIIIllIlIllI("GyAGKh8=", "iIaBk");
        }
        
        @Override
        public String toString() {
            return this.getName();
        }
        
        private static String lIlIIIIIllIlIlIl(final String llllllllllllIlIlllIllIIIIIIllIII, final String llllllllllllIlIlllIllIIIIIIlIlll) {
            try {
                final SecretKeySpec llllllllllllIlIlllIllIIIIIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIllIIIIIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlIlllIllIIIIIIllIlI = Cipher.getInstance("Blowfish");
                llllllllllllIlIlllIllIIIIIIllIlI.init(EnumHingePosition.lllIIllllIIlIl[2], llllllllllllIlIlllIllIIIIIIllIll);
                return new String(llllllllllllIlIlllIllIIIIIIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIllIIIIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIlllIllIIIIIIllIIl) {
                llllllllllllIlIlllIllIIIIIIllIIl.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIlIIIIIlllIlIlI(final Object llllllllllllIlIlllIlIllllllIIlll, final Object llllllllllllIlIlllIlIllllllIIllI) {
            return llllllllllllIlIlllIlIllllllIIlll == llllllllllllIlIlllIlIllllllIIllI;
        }
        
        static {
            lIlIIIIIlllIlIIl();
            lIlIIIIIllIllIII();
            final EnumHingePosition[] enum$VALUES = new EnumHingePosition[EnumHingePosition.lllIIllllIIlIl[2]];
            enum$VALUES[EnumHingePosition.lllIIllllIIlIl[0]] = EnumHingePosition.LEFT;
            enum$VALUES[EnumHingePosition.lllIIllllIIlIl[1]] = EnumHingePosition.RIGHT;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static boolean lIlIIIIIlllIlIll(final int llllllllllllIlIlllIlIllllllIlIll, final int llllllllllllIlIlllIlIllllllIlIlI) {
            return llllllllllllIlIlllIlIllllllIlIll < llllllllllllIlIlllIlIllllllIlIlI;
        }
        
        private static void lIlIIIIIlllIlIIl() {
            (lllIIllllIIlIl = new int[6])[0] = ((0x3 ^ 0x5A) & ~(0x62 ^ 0x3B));
            EnumHingePosition.lllIIllllIIlIl[1] = " ".length();
            EnumHingePosition.lllIIllllIIlIl[2] = "  ".length();
            EnumHingePosition.lllIIllllIIlIl[3] = "   ".length();
            EnumHingePosition.lllIIllllIIlIl[4] = (0x28 ^ 0x2C);
            EnumHingePosition.lllIIllllIIlIl[5] = (0x3A ^ 0x5E ^ (0x12 ^ 0x7E));
        }
        
        private static String lIlIIIIIllIlIlll(final String llllllllllllIlIlllIlIlllllllIIIl, final String llllllllllllIlIlllIlIlllllllIIII) {
            try {
                final SecretKeySpec llllllllllllIlIlllIlIlllllllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIlIlllllllIIII.getBytes(StandardCharsets.UTF_8)), EnumHingePosition.lllIIllllIIlIl[5]), "DES");
                final Cipher llllllllllllIlIlllIlIlllllllIlIl = Cipher.getInstance("DES");
                llllllllllllIlIlllIlIlllllllIlIl.init(EnumHingePosition.lllIIllllIIlIl[2], llllllllllllIlIlllIlIlllllllIllI);
                return new String(llllllllllllIlIlllIlIlllllllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIlIlllllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIlllIlIlllllllIlII) {
                llllllllllllIlIlllIlIlllllllIlII.printStackTrace();
                return null;
            }
        }
        
        @Override
        public String getName() {
            String s;
            if (lIlIIIIIlllIlIlI(this, EnumHingePosition.LEFT)) {
                s = EnumHingePosition.lllIIllllIIIll[EnumHingePosition.lllIIllllIIlIl[2]];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                s = EnumHingePosition.lllIIllllIIIll[EnumHingePosition.lllIIllllIIlIl[3]];
            }
            return s;
        }
    }
    
    public enum EnumDoorHalf implements IStringSerializable
    {
        private static final /* synthetic */ int[] llIllllIIlllII;
        
        UPPER(EnumDoorHalf.llIllllIIllIll[EnumDoorHalf.llIllllIIlllII[0]], EnumDoorHalf.llIllllIIlllII[0]), 
        LOWER(EnumDoorHalf.llIllllIIllIll[EnumDoorHalf.llIllllIIlllII[1]], EnumDoorHalf.llIllllIIlllII[1]);
        
        private static final /* synthetic */ String[] llIllllIIllIll;
        
        static {
            lIIllIlIlIIllIII();
            lIIllIlIlIIlIlll();
            final EnumDoorHalf[] enum$VALUES = new EnumDoorHalf[EnumDoorHalf.llIllllIIlllII[2]];
            enum$VALUES[EnumDoorHalf.llIllllIIlllII[0]] = EnumDoorHalf.UPPER;
            enum$VALUES[EnumDoorHalf.llIllllIIlllII[1]] = EnumDoorHalf.LOWER;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static boolean lIIllIlIlIIllIlI(final int llllllllllllIllIIIlllIllllIIlIII, final int llllllllllllIllIIIlllIllllIIIlll) {
            return llllllllllllIllIIIlllIllllIIlIII < llllllllllllIllIIIlllIllllIIIlll;
        }
        
        @Override
        public String toString() {
            return this.getName();
        }
        
        private static String lIIllIlIlIIlIllI(String llllllllllllIllIIIlllIllllIlIIll, final String llllllllllllIllIIIlllIllllIlIlll) {
            llllllllllllIllIIIlllIllllIlIIll = (boolean)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIlllIllllIlIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIIIlllIllllIlIllI = new StringBuilder();
            final char[] llllllllllllIllIIIlllIllllIlIlIl = llllllllllllIllIIIlllIllllIlIlll.toCharArray();
            int llllllllllllIllIIIlllIllllIlIlII = EnumDoorHalf.llIllllIIlllII[0];
            final short llllllllllllIllIIIlllIllllIIlllI = (Object)((String)llllllllllllIllIIIlllIllllIlIIll).toCharArray();
            final short llllllllllllIllIIIlllIllllIIllIl = (short)llllllllllllIllIIIlllIllllIIlllI.length;
            int llllllllllllIllIIIlllIllllIIllII = EnumDoorHalf.llIllllIIlllII[0];
            while (lIIllIlIlIIllIlI(llllllllllllIllIIIlllIllllIIllII, llllllllllllIllIIIlllIllllIIllIl)) {
                final char llllllllllllIllIIIlllIllllIllIIl = llllllllllllIllIIIlllIllllIIlllI[llllllllllllIllIIIlllIllllIIllII];
                llllllllllllIllIIIlllIllllIlIllI.append((char)(llllllllllllIllIIIlllIllllIllIIl ^ llllllllllllIllIIIlllIllllIlIlIl[llllllllllllIllIIIlllIllllIlIlII % llllllllllllIllIIIlllIllllIlIlIl.length]));
                "".length();
                ++llllllllllllIllIIIlllIllllIlIlII;
                ++llllllllllllIllIIIlllIllllIIllII;
                "".length();
                if ((132 + 15 - 138 + 157 ^ 159 + 19 - 115 + 100) <= 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIIIlllIllllIlIllI);
        }
        
        private static void lIIllIlIlIIlIlll() {
            (llIllllIIllIll = new String[EnumDoorHalf.llIllllIIlllII[4]])[EnumDoorHalf.llIllllIIlllII[0]] = lIIllIlIlIIlIlIl("HRSsWNie4RE=", "jLiUr");
            EnumDoorHalf.llIllllIIllIll[EnumDoorHalf.llIllllIIlllII[1]] = lIIllIlIlIIlIlIl("HgQZs3OQWOc=", "TlWZi");
            EnumDoorHalf.llIllllIIllIll[EnumDoorHalf.llIllllIIlllII[2]] = lIIllIlIlIIlIlIl("D/lYIkJIGqE=", "ySFgK");
            EnumDoorHalf.llIllllIIllIll[EnumDoorHalf.llIllllIIlllII[3]] = lIIllIlIlIIlIllI("OR47Dxk=", "UqLjk");
        }
        
        private static boolean lIIllIlIlIIllIIl(final Object llllllllllllIllIIIlllIllllIIIlII, final Object llllllllllllIllIIIlllIllllIIIIll) {
            return llllllllllllIllIIIlllIllllIIIlII == llllllllllllIllIIIlllIllllIIIIll;
        }
        
        private static String lIIllIlIlIIlIlIl(final String llllllllllllIllIIIlllIlllllIlIII, final String llllllllllllIllIIIlllIlllllIIlll) {
            try {
                final SecretKeySpec llllllllllllIllIIIlllIlllllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlllIlllllIIlll.getBytes(StandardCharsets.UTF_8)), EnumDoorHalf.llIllllIIlllII[5]), "DES");
                final Cipher llllllllllllIllIIIlllIlllllIlIlI = Cipher.getInstance("DES");
                llllllllllllIllIIIlllIlllllIlIlI.init(EnumDoorHalf.llIllllIIlllII[2], llllllllllllIllIIIlllIlllllIlIll);
                return new String(llllllllllllIllIIIlllIlllllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlllIlllllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIIlllIlllllIlIIl) {
                llllllllllllIllIIIlllIlllllIlIIl.printStackTrace();
                return null;
            }
        }
        
        @Override
        public String getName() {
            String s;
            if (lIIllIlIlIIllIIl(this, EnumDoorHalf.UPPER)) {
                s = EnumDoorHalf.llIllllIIllIll[EnumDoorHalf.llIllllIIlllII[2]];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                s = EnumDoorHalf.llIllllIIllIll[EnumDoorHalf.llIllllIIlllII[3]];
            }
            return s;
        }
        
        private static void lIIllIlIlIIllIII() {
            (llIllllIIlllII = new int[6])[0] = ((0x59 ^ 0x69) & ~(0x28 ^ 0x18));
            EnumDoorHalf.llIllllIIlllII[1] = " ".length();
            EnumDoorHalf.llIllllIIlllII[2] = "  ".length();
            EnumDoorHalf.llIllllIIlllII[3] = "   ".length();
            EnumDoorHalf.llIllllIIlllII[4] = (0x3B ^ 0x3F);
            EnumDoorHalf.llIllllIIlllII[5] = (0x38 ^ 0x55 ^ (0x30 ^ 0x55));
        }
        
        private EnumDoorHalf(final String llllllllllllIllIIIlllIllllllllll, final int llllllllllllIllIIIlllIlllllllllI) {
        }
    }
}
