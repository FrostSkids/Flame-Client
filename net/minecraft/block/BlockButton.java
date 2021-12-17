// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Arrays;
import net.minecraft.block.state.BlockState;
import java.util.Random;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.entity.projectile.EntityArrow;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.IBlockAccess;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;

public abstract class BlockButton extends Block
{
    private static final /* synthetic */ String[] llllIlIIIlIII;
    public static final /* synthetic */ PropertyDirection FACING;
    private final /* synthetic */ boolean wooden;
    public static final /* synthetic */ PropertyBool POWERED;
    private static final /* synthetic */ int[] llllIlIIIlllI;
    
    private static boolean lIlIlIIlllllIlI(final int lllllllllllllIlIllIlllIIIlIIIIlI) {
        return lllllllllllllIlIllIlllIIIlIIIIlI > 0;
    }
    
    private static boolean lIlIlIIllllllII(final int lllllllllllllIlIllIlllIIIlIlIlll, final int lllllllllllllIlIllIlllIIIlIlIlIl) {
        return lllllllllllllIlIllIlllIIIlIlIlll < lllllllllllllIlIllIlllIIIlIlIlIl;
    }
    
    private static boolean lIlIlIIlllllIII(final Object lllllllllllllIlIllIlllIIIlIIlllI, final Object lllllllllllllIlIllIlllIIIlIIllII) {
        return lllllllllllllIlIllIlllIIIlIIlllI == lllllllllllllIlIllIlllIIIlIIllII;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockButton.llllIlIIIlllI[0] != 0;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockButton.llllIlIIIlllI[0] != 0;
    }
    
    private static boolean lIlIlIIlllllIIl(final int lllllllllllllIlIllIlllIIIlIIIlIl) {
        return lllllllllllllIlIllIlllIIIlIIIlIl == 0;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIlIllIlllIIlllllIIl) {
        final EnumFacing lllllllllllllIlIllIlllIIllllIIIl;
        switch (lllllllllllllIlIllIlllIIlllllIIl & BlockButton.llllIlIIIlllI[9]) {
            case 0: {
                final EnumFacing lllllllllllllIlIllIlllIIllllIlll = EnumFacing.DOWN;
                "".length();
                if ("   ".length() != "   ".length()) {
                    return null;
                }
                break;
            }
            case 1: {
                final EnumFacing lllllllllllllIlIllIlllIIllllIllI = EnumFacing.EAST;
                "".length();
                if (-(0x28 ^ 0x2C) >= 0) {
                    return null;
                }
                break;
            }
            case 2: {
                final EnumFacing lllllllllllllIlIllIlllIIllllIlII = EnumFacing.WEST;
                "".length();
                if (-(0xBF ^ 0xA4 ^ (0xB6 ^ 0xA9)) > 0) {
                    return null;
                }
                break;
            }
            case 3: {
                final EnumFacing lllllllllllllIlIllIlllIIllllIIll = EnumFacing.SOUTH;
                "".length();
                if (-" ".length() > 0) {
                    return null;
                }
                break;
            }
            case 4: {
                final EnumFacing lllllllllllllIlIllIlllIIllllIIlI = EnumFacing.NORTH;
                "".length();
                if ("  ".length() <= 0) {
                    return null;
                }
                break;
            }
            default: {
                lllllllllllllIlIllIlllIIllllIIIl = EnumFacing.UP;
                break;
            }
        }
        final IBlockState withProperty = this.getDefaultState().withProperty((IProperty<Comparable>)BlockButton.FACING, lllllllllllllIlIllIlllIIllllIIIl);
        final PropertyBool powered = BlockButton.POWERED;
        int b;
        if (lIlIlIIlllllIlI(lllllllllllllIlIllIlllIIlllllIIl & BlockButton.llllIlIIIlllI[10])) {
            b = BlockButton.llllIlIIIlllI[1];
            "".length();
            if (-" ".length() > "  ".length()) {
                return null;
            }
        }
        else {
            b = BlockButton.llllIlIIIlllI[0];
        }
        return withProperty.withProperty((IProperty<Comparable>)powered, (boolean)(b != 0));
    }
    
    @Override
    public boolean canPlaceBlockAt(final World lllllllllllllIlIllIlllIllllIIllI, final BlockPos lllllllllllllIlIllIlllIllllIIlIl) {
        final short lllllllllllllIlIllIlllIlllIllllI;
        final String lllllllllllllIlIllIlllIlllIlllll = (String)((EnumFacing[])(Object)(lllllllllllllIlIllIlllIlllIllllI = (short)(Object)EnumFacing.values())).length;
        int lllllllllllllIlIllIlllIllllIIIII = BlockButton.llllIlIIIlllI[0];
        "".length();
        if (-"  ".length() > 0) {
            return ((0xCA ^ 0x81) & ~(0xE ^ 0x45)) != 0x0;
        }
        while (!lIlIlIIllllIlll(lllllllllllllIlIllIlllIllllIIIII, (int)lllllllllllllIlIllIlllIlllIlllll)) {
            final EnumFacing lllllllllllllIlIllIlllIllllIIlII = lllllllllllllIlIllIlllIlllIllllI[lllllllllllllIlIllIlllIllllIIIII];
            if (lIlIlIIllllIllI(func_181088_a(lllllllllllllIlIllIlllIllllIIllI, lllllllllllllIlIllIlllIllllIIlIl, lllllllllllllIlIllIlllIllllIIlII) ? 1 : 0)) {
                return BlockButton.llllIlIIIlllI[1] != 0;
            }
            ++lllllllllllllIlIllIlllIllllIIIII;
        }
        return BlockButton.llllIlIIIlllI[0] != 0;
    }
    
    private void notifyNeighbors(final World lllllllllllllIlIllIlllIlIIIIlIII, final BlockPos lllllllllllllIlIllIlllIlIIIIIllI, final EnumFacing lllllllllllllIlIllIlllIlIIIIIIII) {
        lllllllllllllIlIllIlllIlIIIIlIII.notifyNeighborsOfStateChange(lllllllllllllIlIllIlllIlIIIIIllI, this);
        lllllllllllllIlIllIlllIlIIIIlIII.notifyNeighborsOfStateChange(lllllllllllllIlIllIlllIlIIIIIllI.offset(lllllllllllllIlIllIlllIlIIIIIIII.getOpposite()), this);
    }
    
    private static void lIlIlIIllIllIIl() {
        (llllIlIIIlIII = new String[BlockButton.llllIlIIIlllI[11]])[BlockButton.llllIlIIIlllI[0]] = lIlIlIIllIlIlIl("Dg8hBhoP", "hnBot");
        BlockButton.llllIlIIIlIII[BlockButton.llllIlIIIlllI[1]] = lIlIlIIllIlIllI("JDdjm9qC0yI=", "mjirC");
        BlockButton.llllIlIIIlIII[BlockButton.llllIlIIIlllI[4]] = lIlIlIIllIlIlll("vFBVu546AAKWANWWdwfqyA==", "RrqZY");
        BlockButton.llllIlIIIlIII[BlockButton.llllIlIIIlllI[5]] = lIlIlIIllIlIlIl("ISU8KwU+ajEjAzAv", "SDROj");
        BlockButton.llllIlIIIlIII[BlockButton.llllIlIIIlllI[7]] = lIlIlIIllIlIllI("FlIQFRwTenl0dhR4jHADjA==", "ArHIk");
        BlockButton.llllIlIIIlIII[BlockButton.llllIlIIIlllI[8]] = lIlIlIIllIlIllI("tqdDgY/1U2h/5n/Ma7iJrA==", "fQMvc");
    }
    
    @Override
    public IBlockState onBlockPlaced(final World lllllllllllllIlIllIlllIlllIIllII, final BlockPos lllllllllllllIlIllIlllIlllIIIIlI, final EnumFacing lllllllllllllIlIllIlllIlllIIIIIl, final float lllllllllllllIlIllIlllIlllIIlIIl, final float lllllllllllllIlIllIlllIlllIIlIII, final float lllllllllllllIlIllIlllIlllIIIlll, final int lllllllllllllIlIllIlllIlllIIIllI, final EntityLivingBase lllllllllllllIlIllIlllIlllIIIlIl) {
        IBlockState blockState;
        if (lIlIlIIllllIllI(func_181088_a(lllllllllllllIlIllIlllIlllIIllII, lllllllllllllIlIllIlllIlllIIIIlI, lllllllllllllIlIllIlllIlllIIIIIl.getOpposite()) ? 1 : 0)) {
            blockState = this.getDefaultState().withProperty((IProperty<Comparable>)BlockButton.FACING, lllllllllllllIlIllIlllIlllIIIIIl).withProperty((IProperty<Comparable>)BlockButton.POWERED, (boolean)(BlockButton.llllIlIIIlllI[0] != 0));
            "".length();
            if (-(0xC1 ^ 0x90 ^ (0xC9 ^ 0x9D)) >= 0) {
                return null;
            }
        }
        else {
            blockState = this.getDefaultState().withProperty((IProperty<Comparable>)BlockButton.FACING, EnumFacing.DOWN).withProperty((IProperty<Comparable>)BlockButton.POWERED, (boolean)(BlockButton.llllIlIIIlllI[0] != 0));
        }
        return blockState;
    }
    
    private static boolean lIlIlIIllllIllI(final int lllllllllllllIlIllIlllIIIlIIIlll) {
        return lllllllllllllIlIllIlllIIIlIIIlll != 0;
    }
    
    protected static boolean func_181088_a(final World lllllllllllllIlIllIlllIlllIlIlIl, final BlockPos lllllllllllllIlIllIlllIlllIlIlII, final EnumFacing lllllllllllllIlIllIlllIlllIlIlll) {
        final BlockPos lllllllllllllIlIllIlllIlllIlIllI = lllllllllllllIlIllIlllIlllIlIlII.offset(lllllllllllllIlIllIlllIlllIlIlll);
        boolean b;
        if (lIlIlIIlllllIII(lllllllllllllIlIllIlllIlllIlIlll, EnumFacing.DOWN)) {
            b = World.doesBlockHaveSolidTopSurface(lllllllllllllIlIllIlllIlllIlIlIl, lllllllllllllIlIllIlllIlllIlIllI);
            "".length();
            if ("   ".length() == -" ".length()) {
                return ((0x79 ^ 0x3A ^ (0x69 ^ 0x6F)) & (187 + 187 - 323 + 143 ^ 44 + 74 - 4 + 21 ^ -" ".length())) != 0x0;
            }
        }
        else {
            b = lllllllllllllIlIllIlllIlllIlIlIl.getBlockState(lllllllllllllIlIllIlllIlllIlIllI).getBlock().isNormalCube();
        }
        return b;
    }
    
    @Override
    public void onNeighborBlockChange(final World lllllllllllllIlIllIlllIllIlllIll, final BlockPos lllllllllllllIlIllIlllIllIlllIlI, final IBlockState lllllllllllllIlIllIlllIllIlllIIl, final Block lllllllllllllIlIllIlllIllIlllIII) {
        if (lIlIlIIllllIllI(this.checkForDrop(lllllllllllllIlIllIlllIllIlllIll, lllllllllllllIlIllIlllIllIlllIlI, lllllllllllllIlIllIlllIllIlllIIl) ? 1 : 0) && lIlIlIIlllllIIl(func_181088_a(lllllllllllllIlIllIlllIllIlllIll, lllllllllllllIlIllIlllIllIlllIlI, lllllllllllllIlIllIlllIllIlllIIl.getValue((IProperty<EnumFacing>)BlockButton.FACING).getOpposite()) ? 1 : 0)) {
            this.dropBlockAsItem(lllllllllllllIlIllIlllIllIlllIll, lllllllllllllIlIllIlllIllIlllIlI, lllllllllllllIlIllIlllIllIlllIIl, BlockButton.llllIlIIIlllI[0]);
            lllllllllllllIlIllIlllIllIlllIll.setBlockToAir(lllllllllllllIlIllIlllIllIlllIlI);
            "".length();
        }
    }
    
    private static String lIlIlIIllIlIlll(final String lllllllllllllIlIllIlllIIIlllIlII, final String lllllllllllllIlIllIlllIIIlllIIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIllIlllIIIllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIlllIIIlllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllIlllIIIlllIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllIlllIIIlllIlll.init(BlockButton.llllIlIIIlllI[4], lllllllllllllIlIllIlllIIIllllIII);
            return new String(lllllllllllllIlIllIlllIIIlllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIlllIIIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIlllIIIlllIllI) {
            lllllllllllllIlIllIlllIIIlllIllI.printStackTrace();
            return null;
        }
    }
    
    private void checkForArrows(final World lllllllllllllIlIllIlllIlIIlIIIlI, final BlockPos lllllllllllllIlIllIlllIlIIlIIIIl, final IBlockState lllllllllllllIlIllIlllIlIIIlIlll) {
        this.updateBlockBounds(lllllllllllllIlIllIlllIlIIIlIlll);
        final List<? extends Entity> lllllllllllllIlIllIlllIlIIIllllI = lllllllllllllIlIllIlllIlIIlIIIlI.getEntitiesWithinAABB((Class<? extends Entity>)EntityArrow.class, new AxisAlignedBB(lllllllllllllIlIllIlllIlIIlIIIIl.getX() + this.minX, lllllllllllllIlIllIlllIlIIlIIIIl.getY() + this.minY, lllllllllllllIlIllIlllIlIIlIIIIl.getZ() + this.minZ, lllllllllllllIlIllIlllIlIIlIIIIl.getX() + this.maxX, lllllllllllllIlIllIlllIlIIlIIIIl.getY() + this.maxY, lllllllllllllIlIllIlllIlIIlIIIIl.getZ() + this.maxZ));
        int n;
        if (lIlIlIIllllIllI(lllllllllllllIlIllIlllIlIIIllllI.isEmpty() ? 1 : 0)) {
            n = BlockButton.llllIlIIIlllI[0];
            "".length();
            if ("  ".length() < 0) {
                return;
            }
        }
        else {
            n = BlockButton.llllIlIIIlllI[1];
        }
        final boolean lllllllllllllIlIllIlllIlIIIlllIl = n != 0;
        final boolean lllllllllllllIlIllIlllIlIIIllIll = lllllllllllllIlIllIlllIlIIIlIlll.getValue((IProperty<Boolean>)BlockButton.POWERED);
        if (lIlIlIIllllIllI(lllllllllllllIlIllIlllIlIIIlllIl ? 1 : 0) && lIlIlIIlllllIIl(lllllllllllllIlIllIlllIlIIIllIll ? 1 : 0)) {
            lllllllllllllIlIllIlllIlIIlIIIlI.setBlockState(lllllllllllllIlIllIlllIlIIlIIIIl, lllllllllllllIlIllIlllIlIIIlIlll.withProperty((IProperty<Comparable>)BlockButton.POWERED, (boolean)(BlockButton.llllIlIIIlllI[1] != 0)));
            "".length();
            this.notifyNeighbors(lllllllllllllIlIllIlllIlIIlIIIlI, lllllllllllllIlIllIlllIlIIlIIIIl, lllllllllllllIlIllIlllIlIIIlIlll.getValue((IProperty<EnumFacing>)BlockButton.FACING));
            lllllllllllllIlIllIlllIlIIlIIIlI.markBlockRangeForRenderUpdate(lllllllllllllIlIllIlllIlIIlIIIIl, lllllllllllllIlIllIlllIlIIlIIIIl);
            lllllllllllllIlIllIlllIlIIlIIIlI.playSoundEffect(lllllllllllllIlIllIlllIlIIlIIIIl.getX() + 0.5, lllllllllllllIlIllIlllIlIIlIIIIl.getY() + 0.5, lllllllllllllIlIllIlllIlIIlIIIIl.getZ() + 0.5, BlockButton.llllIlIIIlIII[BlockButton.llllIlIIIlllI[7]], 0.3f, 0.6f);
        }
        if (lIlIlIIlllllIIl(lllllllllllllIlIllIlllIlIIIlllIl ? 1 : 0) && lIlIlIIllllIllI(lllllllllllllIlIllIlllIlIIIllIll ? 1 : 0)) {
            lllllllllllllIlIllIlllIlIIlIIIlI.setBlockState(lllllllllllllIlIllIlllIlIIlIIIIl, lllllllllllllIlIllIlllIlIIIlIlll.withProperty((IProperty<Comparable>)BlockButton.POWERED, (boolean)(BlockButton.llllIlIIIlllI[0] != 0)));
            "".length();
            this.notifyNeighbors(lllllllllllllIlIllIlllIlIIlIIIlI, lllllllllllllIlIllIlllIlIIlIIIIl, lllllllllllllIlIllIlllIlIIIlIlll.getValue((IProperty<EnumFacing>)BlockButton.FACING));
            lllllllllllllIlIllIlllIlIIlIIIlI.markBlockRangeForRenderUpdate(lllllllllllllIlIllIlllIlIIlIIIIl, lllllllllllllIlIllIlllIlIIlIIIIl);
            lllllllllllllIlIllIlllIlIIlIIIlI.playSoundEffect(lllllllllllllIlIllIlllIlIIlIIIIl.getX() + 0.5, lllllllllllllIlIllIlllIlIIlIIIIl.getY() + 0.5, lllllllllllllIlIllIlllIlIIlIIIIl.getZ() + 0.5, BlockButton.llllIlIIIlIII[BlockButton.llllIlIIIlllI[8]], 0.3f, 0.5f);
        }
        if (lIlIlIIllllIllI(lllllllllllllIlIllIlllIlIIIlllIl ? 1 : 0)) {
            lllllllllllllIlIllIlllIlIIlIIIlI.scheduleUpdate(lllllllllllllIlIllIlllIlIIlIIIIl, this, this.tickRate(lllllllllllllIlIllIlllIlIIlIIIlI));
        }
    }
    
    private static boolean lIlIlIIlllllIll(final Object lllllllllllllIlIllIlllIIIlIIlIIl) {
        return lllllllllllllIlIllIlllIIIlIIlIIl != null;
    }
    
    private static String lIlIlIIllIlIlIl(String lllllllllllllIlIllIlllIIlIlIlIIl, final String lllllllllllllIlIllIlllIIlIlIllll) {
        lllllllllllllIlIllIlllIIlIlIlIIl = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIllIlllIIlIlIlIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIlllIIlIlIlllI = new StringBuilder();
        final char[] lllllllllllllIlIllIlllIIlIlIllII = lllllllllllllIlIllIlllIIlIlIllll.toCharArray();
        int lllllllllllllIlIllIlllIIlIlIlIlI = BlockButton.llllIlIIIlllI[0];
        final char lllllllllllllIlIllIlllIIlIlIIlII = (Object)((String)lllllllllllllIlIllIlllIIlIlIlIIl).toCharArray();
        final double lllllllllllllIlIllIlllIIlIlIIIll = lllllllllllllIlIllIlllIIlIlIIlII.length;
        char lllllllllllllIlIllIlllIIlIlIIIlI = (char)BlockButton.llllIlIIIlllI[0];
        while (lIlIlIIllllllII(lllllllllllllIlIllIlllIIlIlIIIlI, (int)lllllllllllllIlIllIlllIIlIlIIIll)) {
            final char lllllllllllllIlIllIlllIIlIllIIll = lllllllllllllIlIllIlllIIlIlIIlII[lllllllllllllIlIllIlllIIlIlIIIlI];
            lllllllllllllIlIllIlllIIlIlIlllI.append((char)(lllllllllllllIlIllIlllIIlIllIIll ^ lllllllllllllIlIllIlllIIlIlIllII[lllllllllllllIlIllIlllIIlIlIlIlI % lllllllllllllIlIllIlllIIlIlIllII.length]));
            "".length();
            ++lllllllllllllIlIllIlllIIlIlIlIlI;
            ++lllllllllllllIlIllIlllIIlIlIIIlI;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIlllIIlIlIlllI);
    }
    
    @Override
    public void onEntityCollidedWithBlock(final World lllllllllllllIlIllIlllIlIIlIllIl, final BlockPos lllllllllllllIlIllIlllIlIIllIIIl, final IBlockState lllllllllllllIlIllIlllIlIIlIlIll, final Entity lllllllllllllIlIllIlllIlIIlIllll) {
        if (lIlIlIIlllllIIl(lllllllllllllIlIllIlllIlIIlIllIl.isRemote ? 1 : 0) && lIlIlIIllllIllI(this.wooden ? 1 : 0) && lIlIlIIlllllIIl(((boolean)lllllllllllllIlIllIlllIlIIlIlIll.getValue((IProperty<Boolean>)BlockButton.POWERED)) ? 1 : 0)) {
            this.checkForArrows(lllllllllllllIlIllIlllIlIIlIllIl, lllllllllllllIlIllIlllIlIIllIIIl, lllllllllllllIlIllIlllIlIIlIlIll);
        }
    }
    
    @Override
    public int getStrongPower(final IBlockAccess lllllllllllllIlIllIlllIlIlIlllII, final BlockPos lllllllllllllIlIllIlllIlIlIllIll, final IBlockState lllllllllllllIlIllIlllIlIlIllIII, final EnumFacing lllllllllllllIlIllIlllIlIlIllIIl) {
        int n;
        if (lIlIlIIlllllIIl(((boolean)lllllllllllllIlIllIlllIlIlIllIII.getValue((IProperty<Boolean>)BlockButton.POWERED)) ? 1 : 0)) {
            n = BlockButton.llllIlIIIlllI[0];
            "".length();
            if ((0x81 ^ 0xAC ^ (0x86 ^ 0xAE)) <= 0) {
                return (0x61 ^ 0x3B ^ (0x9 ^ 0x49)) & (0x6D ^ 0x6 ^ (0x57 ^ 0x26) ^ -" ".length());
            }
        }
        else if (lIlIlIIlllllIII(lllllllllllllIlIllIlllIlIlIllIII.getValue((IProperty<Object>)BlockButton.FACING), lllllllllllllIlIllIlllIlIlIllIIl)) {
            n = BlockButton.llllIlIIIlllI[6];
            "".length();
            if ((0x9 ^ 0xF ^ "  ".length()) <= " ".length()) {
                return (0x41 ^ 0x24 ^ (0x3 ^ 0x2D)) & (19 + 139 - 64 + 160 ^ 1 + 37 - 2 + 145 ^ -" ".length());
            }
        }
        else {
            n = BlockButton.llllIlIIIlllI[0];
        }
        return n;
    }
    
    @Override
    public void updateTick(final World lllllllllllllIlIllIlllIlIlIIlIll, final BlockPos lllllllllllllIlIllIlllIlIlIIIlIl, final IBlockState lllllllllllllIlIllIlllIlIlIIlIIl, final Random lllllllllllllIlIllIlllIlIlIIlIII) {
        if (lIlIlIIlllllIIl(lllllllllllllIlIllIlllIlIlIIlIll.isRemote ? 1 : 0) && lIlIlIIllllIllI(((boolean)lllllllllllllIlIllIlllIlIlIIlIIl.getValue((IProperty<Boolean>)BlockButton.POWERED)) ? 1 : 0)) {
            if (lIlIlIIllllIllI(this.wooden ? 1 : 0)) {
                this.checkForArrows(lllllllllllllIlIllIlllIlIlIIlIll, lllllllllllllIlIllIlllIlIlIIIlIl, lllllllllllllIlIllIlllIlIlIIlIIl);
                "".length();
                if (((0xF7 ^ 0xB0 ^ (0xA7 ^ 0xC4)) & (0x4C ^ 0x5E ^ (0x32 ^ 0x4) ^ -" ".length())) == -" ".length()) {
                    return;
                }
            }
            else {
                lllllllllllllIlIllIlllIlIlIIlIll.setBlockState(lllllllllllllIlIllIlllIlIlIIIlIl, lllllllllllllIlIllIlllIlIlIIlIIl.withProperty((IProperty<Comparable>)BlockButton.POWERED, (boolean)(BlockButton.llllIlIIIlllI[0] != 0)));
                "".length();
                this.notifyNeighbors(lllllllllllllIlIllIlllIlIlIIlIll, lllllllllllllIlIllIlllIlIlIIIlIl, lllllllllllllIlIllIlllIlIlIIlIIl.getValue((IProperty<EnumFacing>)BlockButton.FACING));
                lllllllllllllIlIllIlllIlIlIIlIll.playSoundEffect(lllllllllllllIlIllIlllIlIlIIIlIl.getX() + 0.5, lllllllllllllIlIllIlllIlIlIIIlIl.getY() + 0.5, lllllllllllllIlIllIlllIlIlIIIlIl.getZ() + 0.5, BlockButton.llllIlIIIlIII[BlockButton.llllIlIIIlllI[5]], 0.3f, 0.5f);
                lllllllllllllIlIllIlllIlIlIIlIll.markBlockRangeForRenderUpdate(lllllllllllllIlIllIlllIlIlIIIlIl, lllllllllllllIlIllIlllIlIlIIIlIl);
            }
        }
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockButton.llllIlIIIlllI[4]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockButton.llllIlIIIlllI[0]] = BlockButton.FACING;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockButton.llllIlIIIlllI[1]] = BlockButton.POWERED;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static boolean lIlIlIIllllIlll(final int lllllllllllllIlIllIlllIIIllIIIII, final int lllllllllllllIlIllIlllIIIlIlllll) {
        return lllllllllllllIlIllIlllIIIllIIIII >= lllllllllllllIlIllIlllIIIlIlllll;
    }
    
    @Override
    public void randomTick(final World lllllllllllllIlIllIlllIlIlIlIlII, final BlockPos lllllllllllllIlIllIlllIlIlIlIIll, final IBlockState lllllllllllllIlIllIlllIlIlIlIIlI, final Random lllllllllllllIlIllIlllIlIlIlIIIl) {
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess lllllllllllllIlIllIlllIllIlIIIll, final BlockPos lllllllllllllIlIllIlllIllIIlllll) {
        this.updateBlockBounds(lllllllllllllIlIllIlllIllIlIIIll.getBlockState(lllllllllllllIlIllIlllIllIIlllll));
    }
    
    private static String lIlIlIIllIlIllI(final String lllllllllllllIlIllIlllIIlIIIlIll, final String lllllllllllllIlIllIlllIIlIIIllIl) {
        try {
            final SecretKeySpec lllllllllllllIlIllIlllIIlIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIlllIIlIIIllIl.getBytes(StandardCharsets.UTF_8)), BlockButton.llllIlIIIlllI[10]), "DES");
            final Cipher lllllllllllllIlIllIlllIIlIIlIIll = Cipher.getInstance("DES");
            lllllllllllllIlIllIlllIIlIIlIIll.init(BlockButton.llllIlIIIlllI[4], lllllllllllllIlIllIlllIIlIIlIlIl);
            return new String(lllllllllllllIlIllIlllIIlIIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIlllIIlIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIlllIIlIIlIIIl) {
            lllllllllllllIlIllIlllIIlIIlIIIl.printStackTrace();
            return null;
        }
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing = BlockButton.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
        if (lIlIlIIlllllIll($switch_TABLE$net$minecraft$util$EnumFacing)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing;
        }
        "".length();
        final byte lllllllllllllIlIllIlllIIllIIlIll = (Object)new int[EnumFacing.values().length];
        try {
            lllllllllllllIlIllIlllIIllIIlIll[EnumFacing.DOWN.ordinal()] = BlockButton.llllIlIIIlllI[1];
            "".length();
            if (-(102 + 143 - 186 + 94 ^ 131 + 95 - 221 + 152) > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIlIllIlllIIllIIlIll[EnumFacing.EAST.ordinal()] = BlockButton.llllIlIIIlllI[11];
            "".length();
            if (((0x85 ^ 0x83) & ~(0x34 ^ 0x32)) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIlIllIlllIIllIIlIll[EnumFacing.NORTH.ordinal()] = BlockButton.llllIlIIIlllI[5];
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIlIllIlllIIllIIlIll[EnumFacing.SOUTH.ordinal()] = BlockButton.llllIlIIIlllI[7];
            "".length();
            if (" ".length() == "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIlIllIlllIIllIIlIll[EnumFacing.UP.ordinal()] = BlockButton.llllIlIIIlllI[4];
            "".length();
            if (((0x5A ^ 0x56) & ~(0xAB ^ 0xA7)) > ((0x9E ^ 0xB3) & ~(0x95 ^ 0xB8))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIlIllIlllIIllIIlIll[EnumFacing.WEST.ordinal()] = BlockButton.llllIlIIIlllI[8];
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return BlockButton.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)lllllllllllllIlIllIlllIIllIIlIll;
    }
    
    private static void lIlIlIIllllIlIl() {
        (llllIlIIIlllI = new int[12])[0] = ((0x7B ^ 0x62) & ~(0x7A ^ 0x63));
        BlockButton.llllIlIIIlllI[1] = " ".length();
        BlockButton.llllIlIIIlllI[2] = (0x58 ^ 0x46);
        BlockButton.llllIlIIIlllI[3] = (127 + 97 - 71 + 27 ^ 80 + 138 - 80 + 22);
        BlockButton.llllIlIIIlllI[4] = "  ".length();
        BlockButton.llllIlIIIlllI[5] = "   ".length();
        BlockButton.llllIlIIIlllI[6] = (0x96 ^ 0x99);
        BlockButton.llllIlIIIlllI[7] = (171 + 80 - 80 + 7 ^ 74 + 77 + 25 + 6);
        BlockButton.llllIlIIIlllI[8] = (0x3B ^ 0x3E);
        BlockButton.llllIlIIIlllI[9] = (85 + 108 - 68 + 34 ^ 1 + 16 + 98 + 37);
        BlockButton.llllIlIIIlllI[10] = (0x67 ^ 0x34 ^ (0x18 ^ 0x43));
        BlockButton.llllIlIIIlllI[11] = (0x66 ^ 0x41 ^ (0x3B ^ 0x1A));
    }
    
    private boolean checkForDrop(final World lllllllllllllIlIllIlllIllIlIlllI, final BlockPos lllllllllllllIlIllIlllIllIlIlIIl, final IBlockState lllllllllllllIlIllIlllIllIlIllII) {
        if (lIlIlIIllllIllI(this.canPlaceBlockAt(lllllllllllllIlIllIlllIllIlIlllI, lllllllllllllIlIllIlllIllIlIlIIl) ? 1 : 0)) {
            return BlockButton.llllIlIIIlllI[1] != 0;
        }
        this.dropBlockAsItem(lllllllllllllIlIllIlllIllIlIlllI, lllllllllllllIlIllIlllIllIlIlIIl, lllllllllllllIlIllIlllIllIlIllII, BlockButton.llllIlIIIlllI[0]);
        lllllllllllllIlIllIlllIllIlIlllI.setBlockToAir(lllllllllllllIlIllIlllIllIlIlIIl);
        "".length();
        return BlockButton.llllIlIIIlllI[0] != 0;
    }
    
    @Override
    public int tickRate(final World lllllllllllllIlIllIlllIllllllIll) {
        int n;
        if (lIlIlIIllllIllI(this.wooden ? 1 : 0)) {
            n = BlockButton.llllIlIIIlllI[2];
            "".length();
            if (((0x38 ^ 0x22 ^ (0x0 ^ 0x3C)) & (0x1E ^ 0x4A ^ (0xDA ^ 0xA8) ^ -" ".length())) != 0x0) {
                return (0x8B ^ 0x9C ^ (0xC3 ^ 0x99)) & (0x21 ^ 0x29 ^ (0x2C ^ 0x69) ^ -" ".length());
            }
        }
        else {
            n = BlockButton.llllIlIIIlllI[3];
        }
        return n;
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIlIllIlllIIlllIIlII) {
        int lllllllllllllIlIllIlllIIllIlllII = 0;
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[lllllllllllllIlIllIlllIIlllIIlII.getValue((IProperty<EnumFacing>)BlockButton.FACING).ordinal()]) {
            case 6: {
                final int lllllllllllllIlIllIlllIIlllIIIll = BlockButton.llllIlIIIlllI[1];
                "".length();
                if (-"   ".length() >= 0) {
                    return (0xB8 ^ 0x88) & ~(0x58 ^ 0x68);
                }
                break;
            }
            case 5: {
                final int lllllllllllllIlIllIlllIIlllIIIlI = BlockButton.llllIlIIIlllI[4];
                "".length();
                if ((0xE8 ^ 0x9F ^ (0x56 ^ 0x24)) == 0x0) {
                    return (0x5A ^ 0x2C ^ (0xF6 ^ 0xAA)) & (0x3A ^ 0xB ^ (0x16 ^ 0xD) ^ -" ".length()) & (((4 + 148 - 39 + 59 ^ 23 + 22 - 34 + 157) & (156 + 80 - 186 + 139 ^ 63 + 42 + 36 + 44 ^ -" ".length())) ^ -" ".length());
                }
                break;
            }
            case 4: {
                final int lllllllllllllIlIllIlllIIlllIIIIl = BlockButton.llllIlIIIlllI[5];
                "".length();
                if (((0x64 ^ 0x6B) & ~(0x7C ^ 0x73)) == -" ".length()) {
                    return (0x42 ^ 0x3) & ~(0x86 ^ 0xC7);
                }
                break;
            }
            case 3: {
                final int lllllllllllllIlIllIlllIIllIlllll = BlockButton.llllIlIIIlllI[7];
                "".length();
                if ("  ".length() > "   ".length()) {
                    return (0xEE ^ 0xBC ^ (0xEE ^ 0x84)) & (93 + 25 + 52 + 17 ^ 41 + 126 - 116 + 80 ^ -" ".length());
                }
                break;
            }
            default: {
                final int lllllllllllllIlIllIlllIIllIllllI = BlockButton.llllIlIIIlllI[8];
                "".length();
                if ((0x97 ^ 0x93) < 0) {
                    return (0x58 ^ 0x78) & ~(0x72 ^ 0x52);
                }
                break;
            }
            case 1: {
                lllllllllllllIlIllIlllIIllIlllII = BlockButton.llllIlIIIlllI[0];
                break;
            }
        }
        if (lIlIlIIllllIllI(((boolean)lllllllllllllIlIllIlllIIlllIIlII.getValue((IProperty<Boolean>)BlockButton.POWERED)) ? 1 : 0)) {
            lllllllllllllIlIllIlllIIllIlllII |= BlockButton.llllIlIIIlllI[10];
        }
        return lllllllllllllIlIllIlllIIllIlllII;
    }
    
    @Override
    public boolean canPlaceBlockOnSide(final World lllllllllllllIlIllIlllIlllllIIll, final BlockPos lllllllllllllIlIllIlllIlllllIIlI, final EnumFacing lllllllllllllIlIllIlllIlllllIIIl) {
        return func_181088_a(lllllllllllllIlIllIlllIlllllIIll, lllllllllllllIlIllIlllIlllllIIlI, lllllllllllllIlIllIlllIlllllIIIl.getOpposite());
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World lllllllllllllIlIllIllllIIIIIIIII, final BlockPos lllllllllllllIlIllIlllIlllllllll, final IBlockState lllllllllllllIlIllIlllIllllllllI) {
        return null;
    }
    
    @Override
    public boolean canProvidePower() {
        return BlockButton.llllIlIIIlllI[1] != 0;
    }
    
    @Override
    public void setBlockBoundsForItemRender() {
        final float lllllllllllllIlIllIlllIlIIlllllI = 0.1875f;
        final float lllllllllllllIlIllIlllIlIIllllIl = 0.125f;
        final float lllllllllllllIlIllIlllIlIIllllII = 0.125f;
        this.setBlockBounds(0.5f - lllllllllllllIlIllIlllIlIIlllllI, 0.5f - lllllllllllllIlIllIlllIlIIllllIl, 0.5f - lllllllllllllIlIllIlllIlIIllllII, 0.5f + lllllllllllllIlIllIlllIlIIlllllI, 0.5f + lllllllllllllIlIllIlllIlIIllllIl, 0.5f + lllllllllllllIlIllIlllIlIIllllII);
    }
    
    @Override
    public boolean onBlockActivated(final World lllllllllllllIlIllIlllIlIllllllI, final BlockPos lllllllllllllIlIllIlllIlIlllllIl, final IBlockState lllllllllllllIlIllIlllIlIlllIIll, final EntityPlayer lllllllllllllIlIllIlllIlIllllIll, final EnumFacing lllllllllllllIlIllIlllIlIllllIlI, final float lllllllllllllIlIllIlllIlIllllIIl, final float lllllllllllllIlIllIlllIlIllllIII, final float lllllllllllllIlIllIlllIlIlllIlll) {
        if (lIlIlIIllllIllI(((boolean)lllllllllllllIlIllIlllIlIlllIIll.getValue((IProperty<Boolean>)BlockButton.POWERED)) ? 1 : 0)) {
            return BlockButton.llllIlIIIlllI[1] != 0;
        }
        lllllllllllllIlIllIlllIlIllllllI.setBlockState(lllllllllllllIlIllIlllIlIlllllIl, lllllllllllllIlIllIlllIlIlllIIll.withProperty((IProperty<Comparable>)BlockButton.POWERED, (boolean)(BlockButton.llllIlIIIlllI[1] != 0)), BlockButton.llllIlIIIlllI[5]);
        "".length();
        lllllllllllllIlIllIlllIlIllllllI.markBlockRangeForRenderUpdate(lllllllllllllIlIllIlllIlIlllllIl, lllllllllllllIlIllIlllIlIlllllIl);
        lllllllllllllIlIllIlllIlIllllllI.playSoundEffect(lllllllllllllIlIllIlllIlIlllllIl.getX() + 0.5, lllllllllllllIlIllIlllIlIlllllIl.getY() + 0.5, lllllllllllllIlIllIlllIlIlllllIl.getZ() + 0.5, BlockButton.llllIlIIIlIII[BlockButton.llllIlIIIlllI[4]], 0.3f, 0.6f);
        this.notifyNeighbors(lllllllllllllIlIllIlllIlIllllllI, lllllllllllllIlIllIlllIlIlllllIl, lllllllllllllIlIllIlllIlIlllIIll.getValue((IProperty<EnumFacing>)BlockButton.FACING));
        lllllllllllllIlIllIlllIlIllllllI.scheduleUpdate(lllllllllllllIlIllIlllIlIlllllIl, this, this.tickRate(lllllllllllllIlIllIlllIlIllllllI));
        return BlockButton.llllIlIIIlllI[1] != 0;
    }
    
    private void updateBlockBounds(final IBlockState lllllllllllllIlIllIlllIllIIlIlII) {
        final EnumFacing lllllllllllllIlIllIlllIllIIlIIll = lllllllllllllIlIllIlllIllIIlIlII.getValue((IProperty<EnumFacing>)BlockButton.FACING);
        final boolean lllllllllllllIlIllIlllIllIIlIIlI = lllllllllllllIlIllIlllIllIIlIlII.getValue((IProperty<Boolean>)BlockButton.POWERED);
        final float lllllllllllllIlIllIlllIllIIlIIIl = 0.25f;
        final float lllllllllllllIlIllIlllIllIIlIIII = 0.375f;
        int n;
        if (lIlIlIIllllIllI(lllllllllllllIlIllIlllIllIIlIIlI ? 1 : 0)) {
            n = BlockButton.llllIlIIIlllI[1];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            n = BlockButton.llllIlIIIlllI[4];
        }
        final float lllllllllllllIlIllIlllIllIIIllll = n / 16.0f;
        final float lllllllllllllIlIllIlllIllIIIlllI = 0.125f;
        final float lllllllllllllIlIllIlllIllIIIllIl = 0.1875f;
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[lllllllllllllIlIllIlllIllIIlIIll.ordinal()]) {
            case 6: {
                this.setBlockBounds(0.0f, 0.375f, 0.3125f, lllllllllllllIlIllIlllIllIIIllll, 0.625f, 0.6875f);
                "".length();
                if (("  ".length() & ~"  ".length()) != 0x0) {
                    return;
                }
                break;
            }
            case 5: {
                this.setBlockBounds(1.0f - lllllllllllllIlIllIlllIllIIIllll, 0.375f, 0.3125f, 1.0f, 0.625f, 0.6875f);
                "".length();
                if (((28 + 97 + 69 + 52 ^ 141 + 102 - 180 + 103) & (0x77 ^ 0x56 ^ (0x34 ^ 0x45) ^ -" ".length())) == (26 + 2 + 40 + 68 ^ 28 + 19 + 89 + 4)) {
                    return;
                }
                break;
            }
            case 4: {
                this.setBlockBounds(0.3125f, 0.375f, 0.0f, 0.6875f, 0.625f, lllllllllllllIlIllIlllIllIIIllll);
                "".length();
                if (" ".length() < " ".length()) {
                    return;
                }
                break;
            }
            case 3: {
                this.setBlockBounds(0.3125f, 0.375f, 1.0f - lllllllllllllIlIllIlllIllIIIllll, 0.6875f, 0.625f, 1.0f);
                "".length();
                if (((0x4F ^ 0x13) & ~(0xEF ^ 0xB3)) < 0) {
                    return;
                }
                break;
            }
            case 2: {
                this.setBlockBounds(0.3125f, 0.0f, 0.375f, 0.6875f, 0.0f + lllllllllllllIlIllIlllIllIIIllll, 0.625f);
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 1: {
                this.setBlockBounds(0.3125f, 1.0f - lllllllllllllIlIllIlllIllIIIllll, 0.375f, 0.6875f, 1.0f, 0.625f);
                break;
            }
        }
    }
    
    @Override
    public void breakBlock(final World lllllllllllllIlIllIlllIlIllIllIl, final BlockPos lllllllllllllIlIllIlllIlIllIlIII, final IBlockState lllllllllllllIlIllIlllIlIllIlIll) {
        if (lIlIlIIllllIllI(((boolean)lllllllllllllIlIllIlllIlIllIlIll.getValue((IProperty<Boolean>)BlockButton.POWERED)) ? 1 : 0)) {
            this.notifyNeighbors(lllllllllllllIlIllIlllIlIllIllIl, lllllllllllllIlIllIlllIlIllIlIII, lllllllllllllIlIllIlllIlIllIlIll.getValue((IProperty<EnumFacing>)BlockButton.FACING));
        }
        super.breakBlock(lllllllllllllIlIllIlllIlIllIllIl, lllllllllllllIlIllIlllIlIllIlIII, lllllllllllllIlIllIlllIlIllIlIll);
    }
    
    protected BlockButton(final boolean lllllllllllllIlIllIllllIIIIIIIlI) {
        super(Material.circuits);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockButton.FACING, EnumFacing.NORTH).withProperty((IProperty<Comparable>)BlockButton.POWERED, (boolean)(BlockButton.llllIlIIIlllI[0] != 0)));
        this.setTickRandomly((boolean)(BlockButton.llllIlIIIlllI[1] != 0));
        "".length();
        this.setCreativeTab(CreativeTabs.tabRedstone);
        "".length();
        this.wooden = lllllllllllllIlIllIllllIIIIIIIlI;
    }
    
    static {
        lIlIlIIllllIlIl();
        lIlIlIIllIllIIl();
        FACING = PropertyDirection.create(BlockButton.llllIlIIIlIII[BlockButton.llllIlIIIlllI[0]]);
        POWERED = PropertyBool.create(BlockButton.llllIlIIIlIII[BlockButton.llllIlIIIlllI[1]]);
    }
    
    @Override
    public int getWeakPower(final IBlockAccess lllllllllllllIlIllIlllIlIllIIlII, final BlockPos lllllllllllllIlIllIlllIlIllIIIll, final IBlockState lllllllllllllIlIllIlllIlIllIIIII, final EnumFacing lllllllllllllIlIllIlllIlIllIIIIl) {
        int n;
        if (lIlIlIIllllIllI(((boolean)lllllllllllllIlIllIlllIlIllIIIII.getValue((IProperty<Boolean>)BlockButton.POWERED)) ? 1 : 0)) {
            n = BlockButton.llllIlIIIlllI[6];
            "".length();
            if (" ".length() != " ".length()) {
                return (0x28 ^ 0x18 ^ (0x46 ^ 0x23)) & (8 + 159 - 160 + 196 ^ 124 + 94 - 195 + 135 ^ -" ".length());
            }
        }
        else {
            n = BlockButton.llllIlIIIlllI[0];
        }
        return n;
    }
}
