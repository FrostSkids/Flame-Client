// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Iterator;
import com.google.common.base.Objects;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.BlockState;
import com.google.common.base.Predicate;
import net.minecraft.util.AxisAlignedBB;
import java.util.Random;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyBool;

public class BlockTripWireHook extends Block
{
    public static final /* synthetic */ PropertyBool POWERED;
    private static final /* synthetic */ String[] lIIIlIIIlIlIll;
    public static final /* synthetic */ PropertyBool ATTACHED;
    public static final /* synthetic */ PropertyDirection FACING;
    public static final /* synthetic */ PropertyBool SUSPENDED;
    private static final /* synthetic */ int[] lIIIlIIIllIIIl;
    
    @Override
    public int getWeakPower(final IBlockAccess lllllllllllllIlIIIlIllllIllIlIIl, final BlockPos lllllllllllllIlIIIlIllllIllIIlll, final IBlockState lllllllllllllIlIIIlIllllIllIIlIl, final EnumFacing lllllllllllllIlIIIlIllllIllIIIll) {
        int n;
        if (lIlllllIlIIlIlI(((boolean)lllllllllllllIlIIIlIllllIllIIlIl.getValue((IProperty<Boolean>)BlockTripWireHook.POWERED)) ? 1 : 0)) {
            n = BlockTripWireHook.lIIIlIIIllIIIl[10];
            "".length();
            if (((87 + 124 - 173 + 111 ^ 86 + 141 - 201 + 131) & (((0x81 ^ 0x97) & ~(0xB5 ^ 0xA3)) ^ (0x8D ^ 0x85) ^ -" ".length())) != 0x0) {
                return (0x2C ^ 0x63 ^ (0xC8 ^ 0xB4)) & (0x18 ^ 0x7B ^ (0x18 ^ 0x48) ^ -" ".length());
            }
        }
        else {
            n = BlockTripWireHook.lIIIlIIIllIIIl[0];
        }
        return n;
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT_MIPPED;
    }
    
    private static boolean lIlllllIlIIllII(final Object lllllllllllllIlIIIlIlllIlIlIlIIl, final Object lllllllllllllIlIIIlIlllIlIlIlIII) {
        return lllllllllllllIlIIIlIlllIlIlIlIIl != lllllllllllllIlIIIlIlllIlIlIlIII;
    }
    
    @Override
    public void onBlockPlacedBy(final World lllllllllllllIlIIIllIIIIlIIllIIl, final BlockPos lllllllllllllIlIIIllIIIIlIIllllI, final IBlockState lllllllllllllIlIIIllIIIIlIIlllIl, final EntityLivingBase lllllllllllllIlIIIllIIIIlIIlllII, final ItemStack lllllllllllllIlIIIllIIIIlIIllIll) {
        this.func_176260_a(lllllllllllllIlIIIllIIIIlIIllIIl, lllllllllllllIlIIIllIIIIlIIllllI, lllllllllllllIlIIIllIIIIlIIlllIl, (boolean)(BlockTripWireHook.lIIIlIIIllIIIl[0] != 0), (boolean)(BlockTripWireHook.lIIIlIIIllIIIl[0] != 0), BlockTripWireHook.lIIIlIIIllIIIl[4], null);
    }
    
    private static String lIlllllIIllllIl(final String lllllllllllllIlIIIlIlllIlIllllll, final String lllllllllllllIlIIIlIlllIllIIIIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlIlllIllIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlIlllIllIIIIII.getBytes(StandardCharsets.UTF_8)), BlockTripWireHook.lIIIlIIIllIIIl[11]), "DES");
            final Cipher lllllllllllllIlIIIlIlllIllIIIIll = Cipher.getInstance("DES");
            lllllllllllllIlIIIlIlllIllIIIIll.init(BlockTripWireHook.lIIIlIIIllIIIl[2], lllllllllllllIlIIIlIlllIllIIIlII);
            return new String(lllllllllllllIlIIIlIlllIllIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlIlllIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlIlllIllIIIIlI) {
            lllllllllllllIlIIIlIlllIllIIIIlI.printStackTrace();
            return null;
        }
    }
    
    public BlockTripWireHook() {
        super(Material.circuits);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockTripWireHook.FACING, EnumFacing.NORTH).withProperty((IProperty<Comparable>)BlockTripWireHook.POWERED, (boolean)(BlockTripWireHook.lIIIlIIIllIIIl[0] != 0)).withProperty((IProperty<Comparable>)BlockTripWireHook.ATTACHED, (boolean)(BlockTripWireHook.lIIIlIIIllIIIl[0] != 0)).withProperty((IProperty<Comparable>)BlockTripWireHook.SUSPENDED, (boolean)(BlockTripWireHook.lIIIlIIIllIIIl[0] != 0)));
        this.setCreativeTab(CreativeTabs.tabRedstone);
        "".length();
        this.setTickRandomly((boolean)(BlockTripWireHook.lIIIlIIIllIIIl[1] != 0));
        "".length();
    }
    
    private void func_180694_a(final World lllllllllllllIlIIIllIIIIIIIIlIII, final BlockPos lllllllllllllIlIIIllIIIIIIIIIllI, final boolean lllllllllllllIlIIIlIlllllllllIIl, final boolean lllllllllllllIlIIIlIllllllllIlll, final boolean lllllllllllllIlIIIllIIIIIIIIIIII, final boolean lllllllllllllIlIIIlIllllllllIlII) {
        if (lIlllllIlIIlIlI(lllllllllllllIlIIIlIllllllllIlll ? 1 : 0) && lIlllllIlIIlIll(lllllllllllllIlIIIlIllllllllIlII ? 1 : 0)) {
            lllllllllllllIlIIIllIIIIIIIIlIII.playSoundEffect(lllllllllllllIlIIIllIIIIIIIIIllI.getX() + 0.5, lllllllllllllIlIIIllIIIIIIIIIllI.getY() + 0.1, lllllllllllllIlIIIllIIIIIIIIIllI.getZ() + 0.5, BlockTripWireHook.lIIIlIIIlIlIll[BlockTripWireHook.lIIIlIIIllIIIl[6]], 0.4f, 0.6f);
            "".length();
            if (((0x1D ^ 0x6D ^ (0xCC ^ 0x92)) & (0x52 ^ 0x16 ^ (0x20 ^ 0x4A) ^ -" ".length())) == "  ".length()) {
                return;
            }
        }
        else if (lIlllllIlIIlIll(lllllllllllllIlIIIlIllllllllIlll ? 1 : 0) && lIlllllIlIIlIlI(lllllllllllllIlIIIlIllllllllIlII ? 1 : 0)) {
            lllllllllllllIlIIIllIIIIIIIIlIII.playSoundEffect(lllllllllllllIlIIIllIIIIIIIIIllI.getX() + 0.5, lllllllllllllIlIIIllIIIIIIIIIllI.getY() + 0.1, lllllllllllllIlIIIllIIIIIIIIIllI.getZ() + 0.5, BlockTripWireHook.lIIIlIIIlIlIll[BlockTripWireHook.lIIIlIIIllIIIl[7]], 0.4f, 0.5f);
            "".length();
            if (((0x52 ^ 0x44) & ~(0x3D ^ 0x2B)) == "   ".length()) {
                return;
            }
        }
        else if (lIlllllIlIIlIlI(lllllllllllllIlIIIlIlllllllllIIl ? 1 : 0) && lIlllllIlIIlIll(lllllllllllllIlIIIllIIIIIIIIIIII ? 1 : 0)) {
            lllllllllllllIlIIIllIIIIIIIIlIII.playSoundEffect(lllllllllllllIlIIIllIIIIIIIIIllI.getX() + 0.5, lllllllllllllIlIIIllIIIIIIIIIllI.getY() + 0.1, lllllllllllllIlIIIllIIIIIIIIIllI.getZ() + 0.5, BlockTripWireHook.lIIIlIIIlIlIll[BlockTripWireHook.lIIIlIIIllIIIl[8]], 0.4f, 0.7f);
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lIlllllIlIIlIll(lllllllllllllIlIIIlIlllllllllIIl ? 1 : 0) && lIlllllIlIIlIlI(lllllllllllllIlIIIllIIIIIIIIIIII ? 1 : 0)) {
            lllllllllllllIlIIIllIIIIIIIIlIII.playSoundEffect(lllllllllllllIlIIIllIIIIIIIIIllI.getX() + 0.5, lllllllllllllIlIIIllIIIIIIIIIllI.getY() + 0.1, lllllllllllllIlIIIllIIIIIIIIIllI.getZ() + 0.5, BlockTripWireHook.lIIIlIIIlIlIll[BlockTripWireHook.lIIIlIIIllIIIl[9]], 0.4f, 1.2f / (lllllllllllllIlIIIllIIIIIIIIlIII.rand.nextFloat() * 0.2f + 0.9f));
        }
    }
    
    @Override
    public void onNeighborBlockChange(final World lllllllllllllIlIIIllIIIIlIIIlIIl, final BlockPos lllllllllllllIlIIIllIIIIlIIIlIII, final IBlockState lllllllllllllIlIIIllIIIIlIIIllIl, final Block lllllllllllllIlIIIllIIIIlIIIllII) {
        if (lIlllllIlIIllII(lllllllllllllIlIIIllIIIIlIIIllII, this) && lIlllllIlIIlIlI(this.checkForDrop(lllllllllllllIlIIIllIIIIlIIIlIIl, lllllllllllllIlIIIllIIIIlIIIlIII, lllllllllllllIlIIIllIIIIlIIIllIl) ? 1 : 0)) {
            final EnumFacing lllllllllllllIlIIIllIIIIlIIIlIll = lllllllllllllIlIIIllIIIIlIIIllIl.getValue((IProperty<EnumFacing>)BlockTripWireHook.FACING);
            if (lIlllllIlIIlIll(lllllllllllllIlIIIllIIIIlIIIlIIl.getBlockState(lllllllllllllIlIIIllIIIIlIIIlIII.offset(lllllllllllllIlIIIllIIIIlIIIlIll.getOpposite())).getBlock().isNormalCube() ? 1 : 0)) {
                this.dropBlockAsItem(lllllllllllllIlIIIllIIIIlIIIlIIl, lllllllllllllIlIIIllIIIIlIIIlIII, lllllllllllllIlIIIllIIIIlIIIllIl, BlockTripWireHook.lIIIlIIIllIIIl[0]);
                lllllllllllllIlIIIllIIIIlIIIlIIl.setBlockToAir(lllllllllllllIlIIIllIIIIlIIIlIII);
                "".length();
            }
        }
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIlIIIlIllllIIlIllII) {
        final IBlockState withProperty = this.getDefaultState().withProperty((IProperty<Comparable>)BlockTripWireHook.FACING, EnumFacing.getHorizontal(lllllllllllllIlIIIlIllllIIlIllII & BlockTripWireHook.lIIIlIIIllIIIl[3]));
        final PropertyBool powered = BlockTripWireHook.POWERED;
        int b;
        if (lIlllllIlIlIIlI(lllllllllllllIlIIIlIllllIIlIllII & BlockTripWireHook.lIIIlIIIllIIIl[11])) {
            b = BlockTripWireHook.lIIIlIIIllIIIl[1];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            b = BlockTripWireHook.lIIIlIIIllIIIl[0];
        }
        final IBlockState withProperty2 = withProperty.withProperty((IProperty<Comparable>)powered, (boolean)(b != 0));
        final PropertyBool attached = BlockTripWireHook.ATTACHED;
        int b2;
        if (lIlllllIlIlIIlI(lllllllllllllIlIIIlIllllIIlIllII & BlockTripWireHook.lIIIlIIIllIIIl[6])) {
            b2 = BlockTripWireHook.lIIIlIIIllIIIl[1];
            "".length();
            if ((0x95 ^ 0x80 ^ (0x65 ^ 0x74)) == "  ".length()) {
                return null;
            }
        }
        else {
            b2 = BlockTripWireHook.lIIIlIIIllIIIl[0];
        }
        return withProperty2.withProperty((IProperty<Comparable>)attached, (boolean)(b2 != 0));
    }
    
    private static boolean lIlllllIlIIllIl(final Object lllllllllllllIlIIIlIlllIlIlIIlIl, final Object lllllllllllllIlIIIlIlllIlIlIIlII) {
        return lllllllllllllIlIIIlIlllIlIlIIlIl == lllllllllllllIlIIIlIlllIlIlIIlII;
    }
    
    private static boolean lIlllllIlIlIIlI(final int lllllllllllllIlIIIlIlllIlIIlllII) {
        return lllllllllllllIlIIIlIlllIlIIlllII > 0;
    }
    
    private static boolean lIlllllIlIIlllI(final int lllllllllllllIlIIIlIlllIlIIllIIl, final int lllllllllllllIlIIIlIlllIlIIllIII) {
        return lllllllllllllIlIIIlIlllIlIIllIIl != lllllllllllllIlIIIlIlllIlIIllIII;
    }
    
    @Override
    public void randomTick(final World lllllllllllllIlIIIllIIIIIIlllIIl, final BlockPos lllllllllllllIlIIIllIIIIIIlllIII, final IBlockState lllllllllllllIlIIIllIIIIIIllIlll, final Random lllllllllllllIlIIIllIIIIIIllIllI) {
    }
    
    private static String lIlllllIIlllIlI(String lllllllllllllIlIIIlIlllIlllIlIII, final String lllllllllllllIlIIIlIlllIlllIIlll) {
        lllllllllllllIlIIIlIlllIlllIlIII = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIlIlllIlllIlIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIlIlllIlllIllIl = new StringBuilder();
        final char[] lllllllllllllIlIIIlIlllIlllIlIll = lllllllllllllIlIIIlIlllIlllIIlll.toCharArray();
        int lllllllllllllIlIIIlIlllIlllIlIlI = BlockTripWireHook.lIIIlIIIllIIIl[0];
        final String lllllllllllllIlIIIlIlllIlllIIIlI = (Object)((String)lllllllllllllIlIIIlIlllIlllIlIII).toCharArray();
        final boolean lllllllllllllIlIIIlIlllIlllIIIIl = lllllllllllllIlIIIlIlllIlllIIIlI.length != 0;
        boolean lllllllllllllIlIIIlIlllIlllIIIII = BlockTripWireHook.lIIIlIIIllIIIl[0] != 0;
        while (lIlllllIlIlIlII(lllllllllllllIlIIIlIlllIlllIIIII ? 1 : 0, lllllllllllllIlIIIlIlllIlllIIIIl ? 1 : 0)) {
            final char lllllllllllllIlIIIlIlllIllllIIII = lllllllllllllIlIIIlIlllIlllIIIlI[lllllllllllllIlIIIlIlllIlllIIIII];
            lllllllllllllIlIIIlIlllIlllIllIl.append((char)(lllllllllllllIlIIIlIlllIllllIIII ^ lllllllllllllIlIIIlIlllIlllIlIll[lllllllllllllIlIIIlIlllIlllIlIlI % lllllllllllllIlIIIlIlllIlllIlIll.length]));
            "".length();
            ++lllllllllllllIlIIIlIlllIlllIlIlI;
            ++lllllllllllllIlIIIlIlllIlllIIIII;
            "".length();
            if (-(0x10 ^ 0x78 ^ (0x22 ^ 0x4E)) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIlIlllIlllIllIl);
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World lllllllllllllIlIIIllIIIIllIIllll, final BlockPos lllllllllllllIlIIIllIIIIllIIlllI, final IBlockState lllllllllllllIlIIIllIIIIllIIllIl) {
        return null;
    }
    
    static {
        lIlllllIlIIlIIl();
        lIlllllIlIIIlll();
        FACING = PropertyDirection.create(BlockTripWireHook.lIIIlIIIlIlIll[BlockTripWireHook.lIIIlIIIllIIIl[0]], (Predicate<EnumFacing>)EnumFacing.Plane.HORIZONTAL);
        POWERED = PropertyBool.create(BlockTripWireHook.lIIIlIIIlIlIll[BlockTripWireHook.lIIIlIIIllIIIl[1]]);
        ATTACHED = PropertyBool.create(BlockTripWireHook.lIIIlIIIlIlIll[BlockTripWireHook.lIIIlIIIllIIIl[2]]);
        SUSPENDED = PropertyBool.create(BlockTripWireHook.lIIIlIIIlIlIll[BlockTripWireHook.lIIIlIIIllIIIl[3]]);
    }
    
    @Override
    public boolean canPlaceBlockOnSide(final World lllllllllllllIlIIIllIIIIllIIIIll, final BlockPos lllllllllllllIlIIIllIIIIllIIIlIl, final EnumFacing lllllllllllllIlIIIllIIIIllIIIIIl) {
        if (lIlllllIlIIlIlI(lllllllllllllIlIIIllIIIIllIIIIIl.getAxis().isHorizontal() ? 1 : 0) && lIlllllIlIIlIlI(lllllllllllllIlIIIllIIIIllIIIIll.getBlockState(lllllllllllllIlIIIllIIIIllIIIlIl.offset(lllllllllllllIlIIIllIIIIllIIIIIl.getOpposite())).getBlock().isNormalCube() ? 1 : 0)) {
            return BlockTripWireHook.lIIIlIIIllIIIl[1] != 0;
        }
        return BlockTripWireHook.lIIIlIIIllIIIl[0] != 0;
    }
    
    private static String lIlllllIIlllIll(final String lllllllllllllIlIIIlIlllIllIIlllI, final String lllllllllllllIlIIIlIlllIllIIlIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlIlllIllIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlIlllIllIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIlIlllIllIlIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIlIlllIllIlIIIl.init(BlockTripWireHook.lIIIlIIIllIIIl[2], lllllllllllllIlIIIlIlllIllIlIIll);
            return new String(lllllllllllllIlIIIlIlllIllIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlIlllIllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlIlllIllIIllll) {
            lllllllllllllIlIIIlIlllIllIIllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlllllIlIIllll(final int lllllllllllllIlIIIlIlllIlIlllIIl, final int lllllllllllllIlIIIlIlllIlIlllIII) {
        return lllllllllllllIlIIIlIlllIlIlllIIl == lllllllllllllIlIIIlIlllIlIlllIII;
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIlIIIlIllllIIIlllll) {
        int lllllllllllllIlIIIlIllllIIIlllIl = BlockTripWireHook.lIIIlIIIllIIIl[0];
        lllllllllllllIlIIIlIllllIIIlllIl |= lllllllllllllIlIIIlIllllIIIlllll.getValue((IProperty<EnumFacing>)BlockTripWireHook.FACING).getHorizontalIndex();
        if (lIlllllIlIIlIlI(((boolean)lllllllllllllIlIIIlIllllIIIlllll.getValue((IProperty<Boolean>)BlockTripWireHook.POWERED)) ? 1 : 0)) {
            lllllllllllllIlIIIlIllllIIIlllIl |= BlockTripWireHook.lIIIlIIIllIIIl[11];
        }
        if (lIlllllIlIIlIlI(((boolean)lllllllllllllIlIIIlIllllIIIlllll.getValue((IProperty<Boolean>)BlockTripWireHook.ATTACHED)) ? 1 : 0)) {
            lllllllllllllIlIIIlIllllIIIlllIl |= BlockTripWireHook.lIIIlIIIllIIIl[6];
        }
        return lllllllllllllIlIIIlIllllIIIlllIl;
    }
    
    private void func_176262_b(final World lllllllllllllIlIIIlIlllllllIIllI, final BlockPos lllllllllllllIlIIIlIllllllIlllIl, final EnumFacing lllllllllllllIlIIIlIllllllIllIll) {
        lllllllllllllIlIIIlIlllllllIIllI.notifyNeighborsOfStateChange(lllllllllllllIlIIIlIllllllIlllIl, this);
        lllllllllllllIlIIIlIlllllllIIllI.notifyNeighborsOfStateChange(lllllllllllllIlIIIlIllllllIlllIl.offset(lllllllllllllIlIIIlIllllllIllIll.getOpposite()), this);
    }
    
    private static void lIlllllIlIIlIIl() {
        (lIIIlIIIllIIIl = new int[12])[0] = ((32 + 94 - 43 + 46 ^ 54 + 148 - 78 + 32) & (123 + 37 - 102 + 90 ^ 42 + 87 - 20 + 28 ^ -" ".length()));
        BlockTripWireHook.lIIIlIIIllIIIl[1] = " ".length();
        BlockTripWireHook.lIIIlIIIllIIIl[2] = "  ".length();
        BlockTripWireHook.lIIIlIIIllIIIl[3] = "   ".length();
        BlockTripWireHook.lIIIlIIIllIIIl[4] = -" ".length();
        BlockTripWireHook.lIIIlIIIllIIIl[5] = (0x75 ^ 0x1A ^ (0x3C ^ 0x79));
        BlockTripWireHook.lIIIlIIIllIIIl[6] = (48 + 96 + 9 + 36 ^ 54 + 47 + 52 + 32);
        BlockTripWireHook.lIIIlIIIllIIIl[7] = (167 + 54 - 48 + 10 ^ 59 + 50 + 1 + 68);
        BlockTripWireHook.lIIIlIIIllIIIl[8] = (0xAD ^ 0x9E ^ (0x8F ^ 0xBA));
        BlockTripWireHook.lIIIlIIIllIIIl[9] = (0x38 ^ 0x3F);
        BlockTripWireHook.lIIIlIIIllIIIl[10] = (0x9D ^ 0xAA ^ (0x2B ^ 0x13));
        BlockTripWireHook.lIIIlIIIllIIIl[11] = (0x2E ^ 0x26);
    }
    
    private static boolean lIlllllIlIlIlII(final int lllllllllllllIlIIIlIlllIlIllIIIl, final int lllllllllllllIlIIIlIlllIlIllIIII) {
        return lllllllllllllIlIIIlIlllIlIllIIIl < lllllllllllllIlIIIlIlllIlIllIIII;
    }
    
    @Override
    public boolean canPlaceBlockAt(final World lllllllllllllIlIIIllIIIIlIlllIll, final BlockPos lllllllllllllIlIIIllIIIIlIlllIlI) {
        final float lllllllllllllIlIIIllIIIIlIllIlIl = (float)EnumFacing.Plane.HORIZONTAL.iterator();
        "".length();
        if ("   ".length() != "   ".length()) {
            return ((0x1F ^ 0x6) & ~(0x79 ^ 0x60)) != 0x0;
        }
        while (!lIlllllIlIIlIll(((Iterator)lllllllllllllIlIIIllIIIIlIllIlIl).hasNext() ? 1 : 0)) {
            final EnumFacing lllllllllllllIlIIIllIIIIlIlllIIl = ((Iterator<EnumFacing>)lllllllllllllIlIIIllIIIIlIllIlIl).next();
            if (lIlllllIlIIlIlI(lllllllllllllIlIIIllIIIIlIlllIll.getBlockState(lllllllllllllIlIIIllIIIIlIlllIlI.offset(lllllllllllllIlIIIllIIIIlIlllIIl)).getBlock().isNormalCube() ? 1 : 0)) {
                return BlockTripWireHook.lIIIlIIIllIIIl[1] != 0;
            }
        }
        return BlockTripWireHook.lIIIlIIIllIIIl[0] != 0;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockTripWireHook.lIIIlIIIllIIIl[6]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockTripWireHook.lIIIlIIIllIIIl[0]] = BlockTripWireHook.FACING;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockTripWireHook.lIIIlIIIllIIIl[1]] = BlockTripWireHook.POWERED;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockTripWireHook.lIIIlIIIllIIIl[2]] = BlockTripWireHook.ATTACHED;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockTripWireHook.lIIIlIIIllIIIl[3]] = BlockTripWireHook.SUSPENDED;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static boolean lIlllllIlIlIIIl(final int lllllllllllllIlIIIlIlllIlIlIllIl, final int lllllllllllllIlIIIlIlllIlIlIllII) {
        return lllllllllllllIlIIIlIlllIlIlIllIl > lllllllllllllIlIIIlIlllIlIlIllII;
    }
    
    @Override
    public boolean canProvidePower() {
        return BlockTripWireHook.lIIIlIIIllIIIl[1] != 0;
    }
    
    @Override
    public IBlockState getActualState(final IBlockState lllllllllllllIlIIIllIIIIllIlIIll, final IBlockAccess lllllllllllllIlIIIllIIIIllIlIIlI, final BlockPos lllllllllllllIlIIIllIIIIllIlIIIl) {
        final PropertyBool suspended = BlockTripWireHook.SUSPENDED;
        int b;
        if (lIlllllIlIIlIlI(World.doesBlockHaveSolidTopSurface(lllllllllllllIlIIIllIIIIllIlIIlI, lllllllllllllIlIIIllIIIIllIlIIIl.down()) ? 1 : 0)) {
            b = BlockTripWireHook.lIIIlIIIllIIIl[0];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            b = BlockTripWireHook.lIIIlIIIllIIIl[1];
        }
        return lllllllllllllIlIIIllIIIIllIlIIll.withProperty((IProperty<Comparable>)suspended, (boolean)(b != 0));
    }
    
    @Override
    public void updateTick(final World lllllllllllllIlIIIllIIIIIIllIIII, final BlockPos lllllllllllllIlIIIllIIIIIIlIllll, final IBlockState lllllllllllllIlIIIllIIIIIIlIlllI, final Random lllllllllllllIlIIIllIIIIIIlIlIll) {
        this.func_176260_a(lllllllllllllIlIIIllIIIIIIllIIII, lllllllllllllIlIIIllIIIIIIlIllll, lllllllllllllIlIIIllIIIIIIlIlllI, (boolean)(BlockTripWireHook.lIIIlIIIllIIIl[0] != 0), (boolean)(BlockTripWireHook.lIIIlIIIllIIIl[1] != 0), BlockTripWireHook.lIIIlIIIllIIIl[4], null);
    }
    
    @Override
    public IBlockState onBlockPlaced(final World lllllllllllllIlIIIllIIIIlIllIIII, final BlockPos lllllllllllllIlIIIllIIIIlIlIllll, final EnumFacing lllllllllllllIlIIIllIIIIlIlIIllI, final float lllllllllllllIlIIIllIIIIlIlIllIl, final float lllllllllllllIlIIIllIIIIlIlIllII, final float lllllllllllllIlIIIllIIIIlIlIlIll, final int lllllllllllllIlIIIllIIIIlIlIlIlI, final EntityLivingBase lllllllllllllIlIIIllIIIIlIlIlIIl) {
        IBlockState lllllllllllllIlIIIllIIIIlIlIlIII = this.getDefaultState().withProperty((IProperty<Comparable>)BlockTripWireHook.POWERED, (boolean)(BlockTripWireHook.lIIIlIIIllIIIl[0] != 0)).withProperty((IProperty<Comparable>)BlockTripWireHook.ATTACHED, (boolean)(BlockTripWireHook.lIIIlIIIllIIIl[0] != 0)).withProperty((IProperty<Comparable>)BlockTripWireHook.SUSPENDED, (boolean)(BlockTripWireHook.lIIIlIIIllIIIl[0] != 0));
        if (lIlllllIlIIlIlI(lllllllllllllIlIIIllIIIIlIlIIllI.getAxis().isHorizontal() ? 1 : 0)) {
            lllllllllllllIlIIIllIIIIlIlIlIII = lllllllllllllIlIIIllIIIIlIlIlIII.withProperty((IProperty<Comparable>)BlockTripWireHook.FACING, lllllllllllllIlIIIllIIIIlIlIIllI);
        }
        return lllllllllllllIlIIIllIIIIlIlIlIII;
    }
    
    private static boolean lIlllllIlIlIIII(final int lllllllllllllIlIIIlIlllIlIllIlIl, final int lllllllllllllIlIIIlIlllIlIllIlII) {
        return lllllllllllllIlIIIlIlllIlIllIlIl >= lllllllllllllIlIIIlIlllIlIllIlII;
    }
    
    private static boolean lIlllllIlIIlIll(final int lllllllllllllIlIIIlIlllIlIIllllI) {
        return lllllllllllllIlIIIlIlllIlIIllllI == 0;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockTripWireHook.lIIIlIIIllIIIl[0] != 0;
    }
    
    private boolean checkForDrop(final World lllllllllllllIlIIIlIllllllIIlIll, final BlockPos lllllllllllllIlIIIlIllllllIIIIlI, final IBlockState lllllllllllllIlIIIlIllllllIIIIIl) {
        if (lIlllllIlIIlIll(this.canPlaceBlockAt(lllllllllllllIlIIIlIllllllIIlIll, lllllllllllllIlIIIlIllllllIIIIlI) ? 1 : 0)) {
            this.dropBlockAsItem(lllllllllllllIlIIIlIllllllIIlIll, lllllllllllllIlIIIlIllllllIIIIlI, lllllllllllllIlIIIlIllllllIIIIIl, BlockTripWireHook.lIIIlIIIllIIIl[0]);
            lllllllllllllIlIIIlIllllllIIlIll.setBlockToAir(lllllllllllllIlIIIlIllllllIIIIlI);
            "".length();
            return BlockTripWireHook.lIIIlIIIllIIIl[0] != 0;
        }
        return BlockTripWireHook.lIIIlIIIllIIIl[1] != 0;
    }
    
    @Override
    public int getStrongPower(final IBlockAccess lllllllllllllIlIIIlIllllIlIIllII, final BlockPos lllllllllllllIlIIIlIllllIlIIlIlI, final IBlockState lllllllllllllIlIIIlIllllIlIIIlII, final EnumFacing lllllllllllllIlIIIlIllllIlIIIllI) {
        int n;
        if (lIlllllIlIIlIll(((boolean)lllllllllllllIlIIIlIllllIlIIIlII.getValue((IProperty<Boolean>)BlockTripWireHook.POWERED)) ? 1 : 0)) {
            n = BlockTripWireHook.lIIIlIIIllIIIl[0];
            "".length();
            if ("  ".length() < 0) {
                return (0xDF ^ 0xAE ^ (0x44 ^ 0x27)) & (0x32 ^ 0x15 ^ (0xAA ^ 0x9F) ^ -" ".length());
            }
        }
        else if (lIlllllIlIIllIl(lllllllllllllIlIIIlIllllIlIIIlII.getValue((IProperty<Object>)BlockTripWireHook.FACING), lllllllllllllIlIIIlIllllIlIIIllI)) {
            n = BlockTripWireHook.lIIIlIIIllIIIl[10];
            "".length();
            if (null != null) {
                return (0x1 ^ 0xB ^ (0x25 ^ 0x6B)) & (0x5F ^ 0x64 ^ 40 + 11 + 53 + 23 ^ -" ".length());
            }
        }
        else {
            n = BlockTripWireHook.lIIIlIIIllIIIl[0];
        }
        return n;
    }
    
    private static boolean lIlllllIlIlIIll(final Object lllllllllllllIlIIIlIlllIlIlIIIlI) {
        return lllllllllllllIlIIIlIlllIlIlIIIlI != null;
    }
    
    @Override
    public void breakBlock(final World lllllllllllllIlIIIlIllllIllllllI, final BlockPos lllllllllllllIlIIIlIllllIlllllII, final IBlockState lllllllllllllIlIIIlIllllIllllIlI) {
        final boolean lllllllllllllIlIIIlIlllllIIIIlII = lllllllllllllIlIIIlIllllIllllIlI.getValue((IProperty<Boolean>)BlockTripWireHook.ATTACHED);
        final boolean lllllllllllllIlIIIlIlllllIIIIIlI = lllllllllllllIlIIIlIllllIllllIlI.getValue((IProperty<Boolean>)BlockTripWireHook.POWERED);
        if (!lIlllllIlIIlIll(lllllllllllllIlIIIlIlllllIIIIlII ? 1 : 0) || lIlllllIlIIlIlI(lllllllllllllIlIIIlIlllllIIIIIlI ? 1 : 0)) {
            this.func_176260_a(lllllllllllllIlIIIlIllllIllllllI, lllllllllllllIlIIIlIllllIlllllII, lllllllllllllIlIIIlIllllIllllIlI, (boolean)(BlockTripWireHook.lIIIlIIIllIIIl[1] != 0), (boolean)(BlockTripWireHook.lIIIlIIIllIIIl[0] != 0), BlockTripWireHook.lIIIlIIIllIIIl[4], null);
        }
        if (lIlllllIlIIlIlI(lllllllllllllIlIIIlIlllllIIIIIlI ? 1 : 0)) {
            lllllllllllllIlIIIlIllllIllllllI.notifyNeighborsOfStateChange(lllllllllllllIlIIIlIllllIlllllII, this);
            lllllllllllllIlIIIlIllllIllllllI.notifyNeighborsOfStateChange(lllllllllllllIlIIIlIllllIlllllII.offset(lllllllllllllIlIIIlIllllIllllIlI.getValue((IProperty<EnumFacing>)BlockTripWireHook.FACING).getOpposite()), this);
        }
        super.breakBlock(lllllllllllllIlIIIlIllllIllllllI, lllllllllllllIlIIIlIllllIlllllII, lllllllllllllIlIIIlIllllIllllIlI);
    }
    
    private static boolean lIlllllIlIIlIlI(final int lllllllllllllIlIIIlIlllIlIlIIIII) {
        return lllllllllllllIlIIIlIlllIlIlIIIII != 0;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing = BlockTripWireHook.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
        if (lIlllllIlIlIIll($switch_TABLE$net$minecraft$util$EnumFacing)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing;
        }
        "".length();
        final byte lllllllllllllIlIIIlIllllIIIIllIl = (Object)new int[EnumFacing.values().length];
        try {
            lllllllllllllIlIIIlIllllIIIIllIl[EnumFacing.DOWN.ordinal()] = BlockTripWireHook.lIIIlIIIllIIIl[1];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIlIIIlIllllIIIIllIl[EnumFacing.EAST.ordinal()] = BlockTripWireHook.lIIIlIIIllIIIl[8];
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIlIIIlIllllIIIIllIl[EnumFacing.NORTH.ordinal()] = BlockTripWireHook.lIIIlIIIllIIIl[3];
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIlIIIlIllllIIIIllIl[EnumFacing.SOUTH.ordinal()] = BlockTripWireHook.lIIIlIIIllIIIl[6];
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIlIIIlIllllIIIIllIl[EnumFacing.UP.ordinal()] = BlockTripWireHook.lIIIlIIIllIIIl[2];
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIlIIIlIllllIIIIllIl[EnumFacing.WEST.ordinal()] = BlockTripWireHook.lIIIlIIIllIIIl[7];
            "".length();
            if (((0xC3 ^ 0x91) & ~(0x44 ^ 0x16)) < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return BlockTripWireHook.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)lllllllllllllIlIIIlIllllIIIIllIl;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockTripWireHook.lIIIlIIIllIIIl[0] != 0;
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess lllllllllllllIlIIIlIlllllIlIIlII, final BlockPos lllllllllllllIlIIIlIlllllIlIlIlI) {
        final float lllllllllllllIlIIIlIlllllIlIlIII = 0.1875f;
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[lllllllllllllIlIIIlIlllllIlIIlII.getBlockState(lllllllllllllIlIIIlIlllllIlIlIlI).getValue((IProperty<EnumFacing>)BlockTripWireHook.FACING).ordinal()]) {
            case 6: {
                this.setBlockBounds(0.0f, 0.2f, 0.5f - lllllllllllllIlIIIlIlllllIlIlIII, lllllllllllllIlIIIlIlllllIlIlIII * 2.0f, 0.8f, 0.5f + lllllllllllllIlIIIlIlllllIlIlIII);
                "".length();
                if ("  ".length() < "  ".length()) {
                    return;
                }
                break;
            }
            case 5: {
                this.setBlockBounds(1.0f - lllllllllllllIlIIIlIlllllIlIlIII * 2.0f, 0.2f, 0.5f - lllllllllllllIlIIIlIlllllIlIlIII, 1.0f, 0.8f, 0.5f + lllllllllllllIlIIIlIlllllIlIlIII);
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
                break;
            }
            case 4: {
                this.setBlockBounds(0.5f - lllllllllllllIlIIIlIlllllIlIlIII, 0.2f, 0.0f, 0.5f + lllllllllllllIlIIIlIlllllIlIlIII, 0.8f, lllllllllllllIlIIIlIlllllIlIlIII * 2.0f);
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 3: {
                this.setBlockBounds(0.5f - lllllllllllllIlIIIlIlllllIlIlIII, 0.2f, 1.0f - lllllllllllllIlIIIlIlllllIlIlIII * 2.0f, 0.5f + lllllllllllllIlIIIlIlllllIlIlIII, 0.8f, 1.0f);
                break;
            }
        }
    }
    
    private static void lIlllllIlIIIlll() {
        (lIIIlIIIlIlIll = new String[BlockTripWireHook.lIIIlIIIllIIIl[11]])[BlockTripWireHook.lIIIlIIIllIIIl[0]] = lIlllllIIlllIlI("BxYhIQMG", "awBHm");
        BlockTripWireHook.lIIIlIIIlIlIll[BlockTripWireHook.lIIIlIIIllIIIl[1]] = lIlllllIIlllIll("jxAWrKv70uY=", "oBfCR");
        BlockTripWireHook.lIIIlIIIlIlIll[BlockTripWireHook.lIIIlIIIllIIIl[2]] = lIlllllIIlllIlI("CiMbNAcDMgs=", "kWoUd");
        BlockTripWireHook.lIIIlIIIlIlIll[BlockTripWireHook.lIIIlIIIllIIIl[3]] = lIlllllIIllllIl("XyDx8MNLMe8ekwrQErFNrw==", "pNSwm");
        BlockTripWireHook.lIIIlIIIlIlIll[BlockTripWireHook.lIIIlIIIllIIIl[6]] = lIlllllIIlllIlI("OwkeNAQkRhM8AioD", "IhpPk");
        BlockTripWireHook.lIIIlIIIlIlIll[BlockTripWireHook.lIIIlIIIllIIIl[7]] = lIlllllIIllllIl("c+3lbA3plerc2Xcy5UASQw==", "MGHiG");
        BlockTripWireHook.lIIIlIIIlIlIll[BlockTripWireHook.lIIIlIIIllIIIl[8]] = lIlllllIIlllIll("4TmwPDCxWWZ6AF8yIIWg5g==", "xQpjf");
        BlockTripWireHook.lIIIlIIIlIlIll[BlockTripWireHook.lIIIlIIIllIIIl[9]] = lIlllllIIllllIl("EinSHrIy7KZGEOAKQ+1MjQ==", "DjniN");
    }
    
    public void func_176260_a(final World lllllllllllllIlIIIllIIIIIllIllIl, final BlockPos lllllllllllllIlIIIllIIIIIllIllII, final IBlockState lllllllllllllIlIIIllIIIIIllIlIll, final boolean lllllllllllllIlIIIllIIIIIlIIllII, final boolean lllllllllllllIlIIIllIIIIIlIIlIll, final int lllllllllllllIlIIIllIIIIIllIIlll, final IBlockState lllllllllllllIlIIIllIIIIIllIIllI) {
        final EnumFacing lllllllllllllIlIIIllIIIIIllIIlII = lllllllllllllIlIIIllIIIIIllIlIll.getValue((IProperty<EnumFacing>)BlockTripWireHook.FACING);
        final boolean lllllllllllllIlIIIllIIIIIllIIIll = lllllllllllllIlIIIllIIIIIllIlIll.getValue((IProperty<Boolean>)BlockTripWireHook.ATTACHED);
        final boolean lllllllllllllIlIIIllIIIIIllIIIlI = lllllllllllllIlIIIllIIIIIllIlIll.getValue((IProperty<Boolean>)BlockTripWireHook.POWERED);
        int n;
        if (lIlllllIlIIlIlI(World.doesBlockHaveSolidTopSurface(lllllllllllllIlIIIllIIIIIllIllIl, lllllllllllllIlIIIllIIIIIllIllII.down()) ? 1 : 0)) {
            n = BlockTripWireHook.lIIIlIIIllIIIl[0];
            "".length();
            if (-(0x4 ^ 0x2E ^ (0xED ^ 0xC2)) >= 0) {
                return;
            }
        }
        else {
            n = BlockTripWireHook.lIIIlIIIllIIIl[1];
        }
        final boolean lllllllllllllIlIIIllIIIIIllIIIIl = n != 0;
        int n2;
        if (lIlllllIlIIlIlI(lllllllllllllIlIIIllIIIIIlIIllII ? 1 : 0)) {
            n2 = BlockTripWireHook.lIIIlIIIllIIIl[0];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            n2 = BlockTripWireHook.lIIIlIIIllIIIl[1];
        }
        boolean lllllllllllllIlIIIllIIIIIllIIIII = n2 != 0;
        boolean lllllllllllllIlIIIllIIIIIlIlllll = BlockTripWireHook.lIIIlIIIllIIIl[0] != 0;
        int lllllllllllllIlIIIllIIIIIlIllllI = BlockTripWireHook.lIIIlIIIllIIIl[0];
        final IBlockState[] lllllllllllllIlIIIllIIIIIlIlllIl = new IBlockState[BlockTripWireHook.lIIIlIIIllIIIl[5]];
        int lllllllllllllIlIIIllIIIIIlIlllII = BlockTripWireHook.lIIIlIIIllIIIl[1];
        "".length();
        if (((0x94 ^ 0xA4 ^ (0xBF ^ 0xAF)) & (0x4D ^ 0x4 ^ (0x4D ^ 0x24) ^ -" ".length())) != ((0x18 ^ 0x6A ^ (0x52 ^ 0x1B)) & (0x13 ^ 0x8 ^ (0x23 ^ 0x3) ^ -" ".length()))) {
            return;
        }
        while (!lIlllllIlIlIIII(lllllllllllllIlIIIllIIIIIlIlllII, BlockTripWireHook.lIIIlIIIllIIIl[5])) {
            final BlockPos lllllllllllllIlIIIllIIIIIlIllIll = lllllllllllllIlIIIllIIIIIllIllII.offset(lllllllllllllIlIIIllIIIIIllIIlII, lllllllllllllIlIIIllIIIIIlIlllII);
            IBlockState lllllllllllllIlIIIllIIIIIlIllIlI = lllllllllllllIlIIIllIIIIIllIllIl.getBlockState(lllllllllllllIlIIIllIIIIIlIllIll);
            if (lIlllllIlIIllIl(lllllllllllllIlIIIllIIIIIlIllIlI.getBlock(), Blocks.tripwire_hook)) {
                if (!lIlllllIlIIllIl(lllllllllllllIlIIIllIIIIIlIllIlI.getValue((IProperty<Object>)BlockTripWireHook.FACING), lllllllllllllIlIIIllIIIIIllIIlII.getOpposite())) {
                    break;
                }
                lllllllllllllIlIIIllIIIIIlIllllI = lllllllllllllIlIIIllIIIIIlIlllII;
                "".length();
                if (((0x21 ^ 0x42) & ~(0x54 ^ 0x37)) >= " ".length()) {
                    return;
                }
                break;
            }
            else {
                if (lIlllllIlIIllII(lllllllllllllIlIIIllIIIIIlIllIlI.getBlock(), Blocks.tripwire) && lIlllllIlIIlllI(lllllllllllllIlIIIllIIIIIlIlllII, lllllllllllllIlIIIllIIIIIllIIlll)) {
                    lllllllllllllIlIIIllIIIIIlIlllIl[lllllllllllllIlIIIllIIIIIlIlllII] = null;
                    lllllllllllllIlIIIllIIIIIllIIIII = (BlockTripWireHook.lIIIlIIIllIIIl[0] != 0);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    if (lIlllllIlIIllll(lllllllllllllIlIIIllIIIIIlIlllII, lllllllllllllIlIIIllIIIIIllIIlll)) {
                        lllllllllllllIlIIIllIIIIIlIllIlI = (IBlockState)Objects.firstNonNull((Object)lllllllllllllIlIIIllIIIIIllIIllI, (Object)lllllllllllllIlIIIllIIIIIlIllIlI);
                    }
                    int n3;
                    if (lIlllllIlIIlIlI(((boolean)lllllllllllllIlIIIllIIIIIlIllIlI.getValue((IProperty<Boolean>)BlockTripWire.DISARMED)) ? 1 : 0)) {
                        n3 = BlockTripWireHook.lIIIlIIIllIIIl[0];
                        "".length();
                        if ("  ".length() != "  ".length()) {
                            return;
                        }
                    }
                    else {
                        n3 = BlockTripWireHook.lIIIlIIIllIIIl[1];
                    }
                    final boolean lllllllllllllIlIIIllIIIIIlIllIIl = n3 != 0;
                    final boolean lllllllllllllIlIIIllIIIIIlIllIII = lllllllllllllIlIIIllIIIIIlIllIlI.getValue((IProperty<Boolean>)BlockTripWire.POWERED);
                    final boolean lllllllllllllIlIIIllIIIIIlIlIlll = lllllllllllllIlIIIllIIIIIlIllIlI.getValue((IProperty<Boolean>)BlockTripWire.SUSPENDED);
                    final boolean b = lllllllllllllIlIIIllIIIIIllIIIII;
                    int n4;
                    if (lIlllllIlIIllll(lllllllllllllIlIIIllIIIIIlIlIlll ? 1 : 0, lllllllllllllIlIIIllIIIIIllIIIIl ? 1 : 0)) {
                        n4 = BlockTripWireHook.lIIIlIIIllIIIl[1];
                        "".length();
                        if ("  ".length() < 0) {
                            return;
                        }
                    }
                    else {
                        n4 = BlockTripWireHook.lIIIlIIIllIIIl[0];
                    }
                    lllllllllllllIlIIIllIIIIIllIIIII = (((b ? 1 : 0) & n4) != 0x0);
                    final boolean b2 = lllllllllllllIlIIIllIIIIIlIlllll;
                    int n5;
                    if (lIlllllIlIIlIlI(lllllllllllllIlIIIllIIIIIlIllIIl ? 1 : 0) && lIlllllIlIIlIlI(lllllllllllllIlIIIllIIIIIlIllIII ? 1 : 0)) {
                        n5 = BlockTripWireHook.lIIIlIIIllIIIl[1];
                        "".length();
                        if (" ".length() < " ".length()) {
                            return;
                        }
                    }
                    else {
                        n5 = BlockTripWireHook.lIIIlIIIllIIIl[0];
                    }
                    lllllllllllllIlIIIllIIIIIlIlllll = (((b2 ? 1 : 0) | n5) != 0x0);
                    lllllllllllllIlIIIllIIIIIlIlllIl[lllllllllllllIlIIIllIIIIIlIlllII] = lllllllllllllIlIIIllIIIIIlIllIlI;
                    if (lIlllllIlIIllll(lllllllllllllIlIIIllIIIIIlIlllII, lllllllllllllIlIIIllIIIIIllIIlll)) {
                        lllllllllllllIlIIIllIIIIIllIllIl.scheduleUpdate(lllllllllllllIlIIIllIIIIIllIllII, this, this.tickRate(lllllllllllllIlIIIllIIIIIllIllIl));
                        lllllllllllllIlIIIllIIIIIllIIIII &= lllllllllllllIlIIIllIIIIIlIllIIl;
                    }
                }
                ++lllllllllllllIlIIIllIIIIIlIlllII;
            }
        }
        final boolean b3 = lllllllllllllIlIIIllIIIIIllIIIII;
        int n6;
        if (lIlllllIlIlIIIl(lllllllllllllIlIIIllIIIIIlIllllI, BlockTripWireHook.lIIIlIIIllIIIl[1])) {
            n6 = BlockTripWireHook.lIIIlIIIllIIIl[1];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            n6 = BlockTripWireHook.lIIIlIIIllIIIl[0];
        }
        lllllllllllllIlIIIllIIIIIllIIIII = (((b3 ? 1 : 0) & n6) != 0x0);
        lllllllllllllIlIIIllIIIIIlIlllll &= lllllllllllllIlIIIllIIIIIllIIIII;
        final IBlockState lllllllllllllIlIIIllIIIIIlIlIllI = this.getDefaultState().withProperty((IProperty<Comparable>)BlockTripWireHook.ATTACHED, lllllllllllllIlIIIllIIIIIllIIIII).withProperty((IProperty<Comparable>)BlockTripWireHook.POWERED, lllllllllllllIlIIIllIIIIIlIlllll);
        if (lIlllllIlIlIIlI(lllllllllllllIlIIIllIIIIIlIllllI)) {
            final BlockPos lllllllllllllIlIIIllIIIIIlIlIlIl = lllllllllllllIlIIIllIIIIIllIllII.offset(lllllllllllllIlIIIllIIIIIllIIlII, lllllllllllllIlIIIllIIIIIlIllllI);
            final EnumFacing lllllllllllllIlIIIllIIIIIlIlIlII = lllllllllllllIlIIIllIIIIIllIIlII.getOpposite();
            lllllllllllllIlIIIllIIIIIllIllIl.setBlockState(lllllllllllllIlIIIllIIIIIlIlIlIl, lllllllllllllIlIIIllIIIIIlIlIllI.withProperty((IProperty<Comparable>)BlockTripWireHook.FACING, lllllllllllllIlIIIllIIIIIlIlIlII), BlockTripWireHook.lIIIlIIIllIIIl[3]);
            "".length();
            this.func_176262_b(lllllllllllllIlIIIllIIIIIllIllIl, lllllllllllllIlIIIllIIIIIlIlIlIl, lllllllllllllIlIIIllIIIIIlIlIlII);
            this.func_180694_a(lllllllllllllIlIIIllIIIIIllIllIl, lllllllllllllIlIIIllIIIIIlIlIlIl, lllllllllllllIlIIIllIIIIIllIIIII, lllllllllllllIlIIIllIIIIIlIlllll, lllllllllllllIlIIIllIIIIIllIIIll, lllllllllllllIlIIIllIIIIIllIIIlI);
        }
        this.func_180694_a(lllllllllllllIlIIIllIIIIIllIllIl, lllllllllllllIlIIIllIIIIIllIllII, lllllllllllllIlIIIllIIIIIllIIIII, lllllllllllllIlIIIllIIIIIlIlllll, lllllllllllllIlIIIllIIIIIllIIIll, lllllllllllllIlIIIllIIIIIllIIIlI);
        if (lIlllllIlIIlIll(lllllllllllllIlIIIllIIIIIlIIllII ? 1 : 0)) {
            lllllllllllllIlIIIllIIIIIllIllIl.setBlockState(lllllllllllllIlIIIllIIIIIllIllII, lllllllllllllIlIIIllIIIIIlIlIllI.withProperty((IProperty<Comparable>)BlockTripWireHook.FACING, lllllllllllllIlIIIllIIIIIllIIlII), BlockTripWireHook.lIIIlIIIllIIIl[3]);
            "".length();
            if (lIlllllIlIIlIlI(lllllllllllllIlIIIllIIIIIlIIlIll ? 1 : 0)) {
                this.func_176262_b(lllllllllllllIlIIIllIIIIIllIllIl, lllllllllllllIlIIIllIIIIIllIllII, lllllllllllllIlIIIllIIIIIllIIlII);
            }
        }
        if (lIlllllIlIIlllI(lllllllllllllIlIIIllIIIIIllIIIll ? 1 : 0, lllllllllllllIlIIIllIIIIIllIIIII ? 1 : 0)) {
            int lllllllllllllIlIIIllIIIIIlIlIIll = BlockTripWireHook.lIIIlIIIllIIIl[1];
            "".length();
            if (((0x51 ^ 0x11) & ~(0x28 ^ 0x68)) != 0x0) {
                return;
            }
            while (!lIlllllIlIlIIII(lllllllllllllIlIIIllIIIIIlIlIIll, lllllllllllllIlIIIllIIIIIlIllllI)) {
                final BlockPos lllllllllllllIlIIIllIIIIIlIlIIlI = lllllllllllllIlIIIllIIIIIllIllII.offset(lllllllllllllIlIIIllIIIIIllIIlII, lllllllllllllIlIIIllIIIIIlIlIIll);
                final IBlockState lllllllllllllIlIIIllIIIIIlIlIIIl = lllllllllllllIlIIIllIIIIIlIlllIl[lllllllllllllIlIIIllIIIIIlIlIIll];
                if (lIlllllIlIlIIll(lllllllllllllIlIIIllIIIIIlIlIIIl) && lIlllllIlIIllII(lllllllllllllIlIIIllIIIIIllIllIl.getBlockState(lllllllllllllIlIIIllIIIIIlIlIIlI).getBlock(), Blocks.air)) {
                    lllllllllllllIlIIIllIIIIIllIllIl.setBlockState(lllllllllllllIlIIIllIIIIIlIlIIlI, lllllllllllllIlIIIllIIIIIlIlIIIl.withProperty((IProperty<Comparable>)BlockTripWireHook.ATTACHED, lllllllllllllIlIIIllIIIIIllIIIII), BlockTripWireHook.lIIIlIIIllIIIl[3]);
                    "".length();
                }
                ++lllllllllllllIlIIIllIIIIIlIlIIll;
            }
        }
    }
}
