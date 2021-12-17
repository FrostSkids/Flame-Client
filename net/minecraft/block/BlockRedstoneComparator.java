// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.IStringSerializable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.util.StatCollector;
import net.minecraft.world.IBlockAccess;
import java.util.List;
import net.minecraft.entity.Entity;
import com.google.common.base.Predicate;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.entity.item.EntityItemFrame;
import java.util.Arrays;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import java.util.Random;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.tileentity.TileEntityComparator;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;

public class BlockRedstoneComparator extends BlockRedstoneDiode implements ITileEntityProvider
{
    public static final /* synthetic */ PropertyEnum<Mode> MODE;
    public static final /* synthetic */ PropertyBool POWERED;
    private static final /* synthetic */ int[] lIIIIIIlIlllIl;
    private static final /* synthetic */ String[] lIIIIIIIlIlIlI;
    
    @Override
    protected IBlockState getUnpoweredState(final IBlockState lllllllllllllIlIlIIIIlIllIlIIIIl) {
        final Boolean lllllllllllllIlIlIIIIlIllIlIIlII = lllllllllllllIlIlIIIIlIllIlIIIIl.getValue((IProperty<Boolean>)BlockRedstoneComparator.POWERED);
        final Mode lllllllllllllIlIlIIIIlIllIlIIIll = lllllllllllllIlIlIIIIlIllIlIIIIl.getValue(BlockRedstoneComparator.MODE);
        final EnumFacing lllllllllllllIlIlIIIIlIllIlIIIlI = lllllllllllllIlIlIIIIlIllIlIIIIl.getValue((IProperty<EnumFacing>)BlockRedstoneComparator.FACING);
        return Blocks.unpowered_comparator.getDefaultState().withProperty((IProperty<Comparable>)BlockRedstoneComparator.FACING, lllllllllllllIlIlIIIIlIllIlIIIlI).withProperty((IProperty<Comparable>)BlockRedstoneComparator.POWERED, lllllllllllllIlIlIIIIlIllIlIIlII).withProperty(BlockRedstoneComparator.MODE, lllllllllllllIlIlIIIIlIllIlIIIll);
    }
    
    @Override
    public IBlockState onBlockPlaced(final World lllllllllllllIlIlIIIIlIIlIllIIII, final BlockPos lllllllllllllIlIlIIIIlIIlIlIllll, final EnumFacing lllllllllllllIlIlIIIIlIIlIlIlllI, final float lllllllllllllIlIlIIIIlIIlIlIllIl, final float lllllllllllllIlIlIIIIlIIlIlIllII, final float lllllllllllllIlIlIIIIlIIlIlIlIll, final int lllllllllllllIlIlIIIIlIIlIlIlIlI, final EntityLivingBase lllllllllllllIlIlIIIIlIIlIlIlIIl) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockRedstoneComparator.FACING, lllllllllllllIlIlIIIIlIIlIlIlIIl.getHorizontalFacing().getOpposite()).withProperty((IProperty<Comparable>)BlockRedstoneComparator.POWERED, (boolean)(BlockRedstoneComparator.lIIIIIIlIlllIl[0] != 0)).withProperty(BlockRedstoneComparator.MODE, Mode.COMPARE);
    }
    
    @Override
    public TileEntity createNewTileEntity(final World lllllllllllllIlIlIIIIlIIllIIIlIl, final int lllllllllllllIlIlIIIIlIIllIIIlII) {
        return new TileEntityComparator();
    }
    
    @Override
    public void breakBlock(final World lllllllllllllIlIlIIIIlIIlllIIIlI, final BlockPos lllllllllllllIlIlIIIIlIIlllIIIIl, final IBlockState lllllllllllllIlIlIIIIlIIlllIIIII) {
        super.breakBlock(lllllllllllllIlIlIIIIlIIlllIIIlI, lllllllllllllIlIlIIIIlIIlllIIIIl, lllllllllllllIlIlIIIIlIIlllIIIII);
        lllllllllllllIlIlIIIIlIIlllIIIlI.removeTileEntity(lllllllllllllIlIlIIIIlIIlllIIIIl);
        this.notifyNeighbors(lllllllllllllIlIlIIIIlIIlllIIIlI, lllllllllllllIlIlIIIIlIIlllIIIIl, lllllllllllllIlIlIIIIlIIlllIIIII);
    }
    
    private static boolean lIllIlIIIlIlIll(final Object lllllllllllllIlIlIIIIlIIIllIIIll) {
        return lllllllllllllIlIlIIIIlIIIllIIIll != null;
    }
    
    private static String lIllIIllIIIlIlI(final String lllllllllllllIlIlIIIIlIIIllllIII, final String lllllllllllllIlIlIIIIlIIIlllIlll) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIIIlIIIlllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIIIlIIIlllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIIIIlIIIlllllII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIIIIlIIIlllllII.init(BlockRedstoneComparator.lIIIIIIlIlllIl[2], lllllllllllllIlIlIIIIlIIIlllllIl);
            return new String(lllllllllllllIlIlIIIIlIIIlllllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIIIlIIIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIIIlIIIllllIll) {
            lllllllllllllIlIlIIIIlIIIllllIll.printStackTrace();
            return null;
        }
    }
    
    private static void lIllIlIIIlIIlIl() {
        (lIIIIIIlIlllIl = new int[8])[0] = ((0x50 ^ 0x43) & ~(0x5C ^ 0x4F));
        BlockRedstoneComparator.lIIIIIIlIlllIl[1] = " ".length();
        BlockRedstoneComparator.lIIIIIIlIlllIl[2] = "  ".length();
        BlockRedstoneComparator.lIIIIIIlIlllIl[3] = (0xB0 ^ 0xBF);
        BlockRedstoneComparator.lIIIIIIlIlllIl[4] = "   ".length();
        BlockRedstoneComparator.lIIIIIIlIlllIl[5] = -" ".length();
        BlockRedstoneComparator.lIIIIIIlIlllIl[6] = (0xA7 ^ 0xA3);
        BlockRedstoneComparator.lIIIIIIlIlllIl[7] = (0xF5 ^ 0xA4 ^ (0x53 ^ 0xA));
    }
    
    private static boolean lIllIlIIIlIlIIl(final int lllllllllllllIlIlIIIIlIIIllIlllI, final int lllllllllllllIlIlIIIIlIIIllIllIl) {
        return lllllllllllllIlIlIIIIlIIIllIlllI >= lllllllllllllIlIlIIIIlIIIllIllIl;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIlIlIIIIlIIlIlllllI) {
        final IBlockState withProperty = this.getDefaultState().withProperty((IProperty<Comparable>)BlockRedstoneComparator.FACING, EnumFacing.getHorizontal(lllllllllllllIlIlIIIIlIIlIlllllI));
        final PropertyBool powered = BlockRedstoneComparator.POWERED;
        int b;
        if (lIllIlIIIlIllll(lllllllllllllIlIlIIIIlIIlIlllllI & BlockRedstoneComparator.lIIIIIIlIlllIl[7])) {
            b = BlockRedstoneComparator.lIIIIIIlIlllIl[1];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            b = BlockRedstoneComparator.lIIIIIIlIlllIl[0];
        }
        final IBlockState withProperty2 = withProperty.withProperty((IProperty<Comparable>)powered, (boolean)(b != 0));
        final PropertyEnum<Mode> mode = BlockRedstoneComparator.MODE;
        Mode mode2;
        if (lIllIlIIIlIllll(lllllllllllllIlIlIIIIlIIlIlllllI & BlockRedstoneComparator.lIIIIIIlIlllIl[6])) {
            mode2 = Mode.SUBTRACT;
            "".length();
            if (-(0x6E ^ 0x3C ^ (0x61 ^ 0x37)) >= 0) {
                return null;
            }
        }
        else {
            mode2 = Mode.COMPARE;
        }
        return withProperty2.withProperty((IProperty<Comparable>)mode, mode2);
    }
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIlIlIIIIlIllIllllll, final Random lllllllllllllIlIlIIIIlIllIlllllI, final int lllllllllllllIlIlIIIIlIllIllllIl) {
        return Items.comparator;
    }
    
    private static boolean lIllIlIIIlIIlll(final int lllllllllllllIlIlIIIIlIIIlIlllll) {
        return lllllllllllllIlIlIIIIlIIIlIlllll != 0;
    }
    
    private static boolean lIllIlIIIlIIllI(final int lllllllllllllIlIlIIIIlIIIlIlllIl) {
        return lllllllllllllIlIlIIIIlIIIlIlllIl == 0;
    }
    
    private static boolean lIllIlIIIlIllII(final int lllllllllllllIlIlIIIIlIIIlllIIlI, final int lllllllllllllIlIlIIIIlIIIlllIIIl) {
        return lllllllllllllIlIlIIIIlIIIlllIIlI == lllllllllllllIlIlIIIIlIIIlllIIIl;
    }
    
    private static boolean lIllIlIIIlIllIl(final int lllllllllllllIlIlIIIIlIIIlIllIII, final int lllllllllllllIlIlIIIIlIIIlIlIlll) {
        return lllllllllllllIlIlIIIIlIIIlIllIII != lllllllllllllIlIlIIIIlIIIlIlIlll;
    }
    
    private static boolean lIllIlIIIlIlIlI(final int lllllllllllllIlIlIIIIlIIIllIlIlI, final int lllllllllllllIlIlIIIIlIIIllIlIIl) {
        return lllllllllllllIlIlIIIIlIIIllIlIlI < lllllllllllllIlIlIIIIlIIIllIlIIl;
    }
    
    @Override
    public boolean onBlockActivated(final World lllllllllllllIlIlIIIIlIlIIlllllI, final BlockPos lllllllllllllIlIlIIIIlIlIIllllIl, IBlockState lllllllllllllIlIlIIIIlIlIIllIIll, final EntityPlayer lllllllllllllIlIlIIIIlIlIIllIIlI, final EnumFacing lllllllllllllIlIlIIIIlIlIIlllIlI, final float lllllllllllllIlIlIIIIlIlIIlllIIl, final float lllllllllllllIlIlIIIIlIlIIlllIII, final float lllllllllllllIlIlIIIIlIlIIllIlll) {
        if (lIllIlIIIlIIllI(lllllllllllllIlIlIIIIlIlIIllIIlI.capabilities.allowEdit ? 1 : 0)) {
            return BlockRedstoneComparator.lIIIIIIlIlllIl[0] != 0;
        }
        lllllllllllllIlIlIIIIlIlIIllIIll = (float)((IBlockState)lllllllllllllIlIlIIIIlIlIIllIIll).cycleProperty(BlockRedstoneComparator.MODE);
        final double lllllllllllllIIIlIIllllIlIIIlllI = lllllllllllllIlIlIIIIlIlIIllllIl.getX() + 0.5;
        final double lllllllllllllIIIlIIllllIlIIIllIl = lllllllllllllIlIlIIIIlIlIIllllIl.getY() + 0.5;
        final double lllllllllllllIIIlIIllllIlIIlIlII = lllllllllllllIlIlIIIIlIlIIllllIl.getZ() + 0.5;
        final String lllllllllllllIIIlIIllllIlIIlIIll = BlockRedstoneComparator.lIIIIIIIlIlIlI[BlockRedstoneComparator.lIIIIIIlIlllIl[4]];
        final float lllllllllllllIIIlIIllllIlIIlIIlI = 0.3f;
        float lllllllllllllIIIlIIllllIlIIIlIIl;
        if (lIllIlIIIlIlIII(((IBlockState)lllllllllllllIlIlIIIIlIlIIllIIll).getValue((IProperty<Mode>)BlockRedstoneComparator.MODE), Mode.SUBTRACT)) {
            lllllllllllllIIIlIIllllIlIIIlIIl = 0.55f;
            "".length();
            if (((0x77 ^ 0x15 ^ (0x68 ^ 0x1B)) & (0x67 ^ 0x56 ^ (0x66 ^ 0x46) ^ -" ".length())) != 0x0) {
                return ((81 + 110 - 59 + 11 ^ 54 + 26 - 75 + 193) & (114 + 63 - 18 + 74 ^ 138 + 159 - 137 + 0 ^ -" ".length())) != 0x0;
            }
        }
        else {
            lllllllllllllIIIlIIllllIlIIIlIIl = 0.5f;
        }
        lllllllllllllIlIlIIIIlIlIIlllllI.playSoundEffect(lllllllllllllIIIlIIllllIlIIIlllI, lllllllllllllIIIlIIllllIlIIIllIl, lllllllllllllIIIlIIllllIlIIlIlII, lllllllllllllIIIlIIllllIlIIlIIll, lllllllllllllIIIlIIllllIlIIlIIlI, lllllllllllllIIIlIIllllIlIIIlIIl);
        lllllllllllllIlIlIIIIlIlIIlllllI.setBlockState(lllllllllllllIlIlIIIIlIlIIllllIl, (IBlockState)lllllllllllllIlIlIIIIlIlIIllIIll, BlockRedstoneComparator.lIIIIIIlIlllIl[2]);
        "".length();
        this.onStateChange(lllllllllllllIlIlIIIIlIlIIlllllI, lllllllllllllIlIlIIIIlIlIIllllIl, (IBlockState)lllllllllllllIlIlIIIIlIlIIllIIll);
        return BlockRedstoneComparator.lIIIIIIlIlllIl[1] != 0;
    }
    
    @Override
    public Item getItem(final World lllllllllllllIlIlIIIIlIllIlllIll, final BlockPos lllllllllllllIlIlIIIIlIllIlllIlI) {
        return Items.comparator;
    }
    
    public BlockRedstoneComparator(final boolean lllllllllllllIlIlIIIIlIlllIIIlII) {
        super(lllllllllllllIlIlIIIIlIlllIIIlII);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockRedstoneComparator.FACING, EnumFacing.NORTH).withProperty((IProperty<Comparable>)BlockRedstoneComparator.POWERED, (boolean)(BlockRedstoneComparator.lIIIIIIlIlllIl[0] != 0)).withProperty(BlockRedstoneComparator.MODE, Mode.COMPARE));
        this.isBlockContainer = (BlockRedstoneComparator.lIIIIIIlIlllIl[1] != 0);
    }
    
    @Override
    public boolean onBlockEventReceived(final World lllllllllllllIlIlIIIIlIIllIlIIll, final BlockPos lllllllllllllIlIlIIIIlIIllIIlIll, final IBlockState lllllllllllllIlIlIIIIlIIllIlIIIl, final int lllllllllllllIlIlIIIIlIIllIIlIIl, final int lllllllllllllIlIlIIIIlIIllIIlIII) {
        super.onBlockEventReceived(lllllllllllllIlIlIIIIlIIllIlIIll, lllllllllllllIlIlIIIIlIIllIIlIll, lllllllllllllIlIlIIIIlIIllIlIIIl, lllllllllllllIlIlIIIIlIIllIIlIIl, lllllllllllllIlIlIIIIlIIllIIlIII);
        "".length();
        final TileEntity lllllllllllllIlIlIIIIlIIllIIlllI = lllllllllllllIlIlIIIIlIIllIlIIll.getTileEntity(lllllllllllllIlIlIIIIlIIllIIlIll);
        int receiveClientEvent;
        if (lIllIlIIIlIlllI(lllllllllllllIlIlIIIIlIIllIIlllI)) {
            receiveClientEvent = BlockRedstoneComparator.lIIIIIIlIlllIl[0];
            "".length();
            if ((0x2C ^ 0x2B ^ "   ".length()) <= 0) {
                return ((101 + 173 - 54 + 4 ^ 170 + 98 - 256 + 163) & (0x7 ^ 0x15 ^ (0x23 ^ 0x7E) ^ -" ".length())) != 0x0;
            }
        }
        else {
            receiveClientEvent = (lllllllllllllIlIlIIIIlIIllIIlllI.receiveClientEvent(lllllllllllllIlIlIIIIlIIllIIlIIl, lllllllllllllIlIlIIIIlIIllIIlIII) ? 1 : 0);
        }
        return receiveClientEvent != 0;
    }
    
    private static String lIllIIllIIIlIII(final String lllllllllllllIlIlIIIIlIIlIIlllIl, final String lllllllllllllIlIlIIIIlIIlIIlllII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIIIlIIlIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIIIlIIlIIlllII.getBytes(StandardCharsets.UTF_8)), BlockRedstoneComparator.lIIIIIIlIlllIl[7]), "DES");
            final Cipher lllllllllllllIlIlIIIIlIIlIlIIIIl = Cipher.getInstance("DES");
            lllllllllllllIlIlIIIIlIIlIlIIIIl.init(BlockRedstoneComparator.lIIIIIIlIlllIl[2], lllllllllllllIlIlIIIIlIIlIlIIIlI);
            return new String(lllllllllllllIlIlIIIIlIIlIlIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIIIlIIlIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIIIlIIlIlIIIII) {
            lllllllllllllIlIlIIIIlIIlIlIIIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIlIIIlIlIII(final Object lllllllllllllIlIlIIIIlIIIllIIllI, final Object lllllllllllllIlIlIIIIlIIIllIIlIl) {
        return lllllllllllllIlIlIIIIlIIIllIIllI == lllllllllllllIlIlIIIIlIIIllIIlIl;
    }
    
    private EntityItemFrame findItemFrame(final World lllllllllllllIlIlIIIIlIlIlIIlIII, final EnumFacing lllllllllllllIlIlIIIIlIlIlIIllII, final BlockPos lllllllllllllIlIlIIIIlIlIlIIlIll) {
        final List<EntityItemFrame> lllllllllllllIlIlIIIIlIlIlIIlIlI = lllllllllllllIlIlIIIIlIlIlIIlIII.getEntitiesWithinAABB((Class<? extends EntityItemFrame>)EntityItemFrame.class, new AxisAlignedBB(lllllllllllllIlIlIIIIlIlIlIIlIll.getX(), lllllllllllllIlIlIIIIlIlIlIIlIll.getY(), lllllllllllllIlIlIIIIlIlIlIIlIll.getZ(), lllllllllllllIlIlIIIIlIlIlIIlIll.getX() + BlockRedstoneComparator.lIIIIIIlIlllIl[1], lllllllllllllIlIlIIIIlIlIlIIlIll.getY() + BlockRedstoneComparator.lIIIIIIlIlllIl[1], lllllllllllllIlIlIIIIlIlIlIIlIll.getZ() + BlockRedstoneComparator.lIIIIIIlIlllIl[1]), (com.google.common.base.Predicate<? super EntityItemFrame>)new Predicate<Entity>() {
            private static final /* synthetic */ int[] llIIlIlIlIlIlI;
            
            private static void lIIIllIlIIllIIll() {
                (llIIlIlIlIlIlI = new int[2])[0] = " ".length();
                BlockRedstoneComparator$1.llIIlIlIlIlIlI[1] = ((0x4 ^ 0x65) & ~(0x1B ^ 0x7A));
            }
            
            public boolean apply(final Entity llllllllllllIlllIIIllIlIIIlIllIl) {
                if (lIIIllIlIIllIlII(llllllllllllIlllIIIllIlIIIlIllIl) && lIIIllIlIIllIlIl(llllllllllllIlllIIIllIlIIIlIllIl.getHorizontalFacing(), lllllllllllllIlIlIIIIlIlIlIIllII)) {
                    return BlockRedstoneComparator$1.llIIlIlIlIlIlI[0] != 0;
                }
                return BlockRedstoneComparator$1.llIIlIlIlIlIlI[1] != 0;
            }
            
            private static boolean lIIIllIlIIllIlIl(final Object llllllllllllIlllIIIllIlIIIlIIIlI, final Object llllllllllllIlllIIIllIlIIIlIIIIl) {
                return llllllllllllIlllIIIllIlIIIlIIIlI == llllllllllllIlllIIIllIlIIIlIIIIl;
            }
            
            static {
                lIIIllIlIIllIIll();
            }
            
            private static boolean lIIIllIlIIllIlII(final Object llllllllllllIlllIIIllIlIIIlIIlIl) {
                return llllllllllllIlllIIIllIlIIIlIIlIl != null;
            }
        });
        EntityItemFrame entityItemFrame;
        if (lIllIlIIIlIllII(lllllllllllllIlIlIIIIlIlIlIIlIlI.size(), BlockRedstoneComparator.lIIIIIIlIlllIl[1])) {
            entityItemFrame = lllllllllllllIlIlIIIIlIlIlIIlIlI.get(BlockRedstoneComparator.lIIIIIIlIlllIl[0]);
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        else {
            entityItemFrame = null;
        }
        return entityItemFrame;
    }
    
    @Override
    protected void updateState(final World lllllllllllllIlIlIIIIlIlIIlIlIIl, final BlockPos lllllllllllllIlIlIIIIlIlIIlIlIII, final IBlockState lllllllllllllIlIlIIIIlIlIIlIIIII) {
        if (lIllIlIIIlIIllI(lllllllllllllIlIlIIIIlIlIIlIlIIl.isBlockTickPending(lllllllllllllIlIlIIIIlIlIIlIlIII, this) ? 1 : 0)) {
            final int lllllllllllllIlIlIIIIlIlIIlIIllI = this.calculateOutput(lllllllllllllIlIlIIIIlIlIIlIlIIl, lllllllllllllIlIlIIIIlIlIIlIlIII, lllllllllllllIlIlIIIIlIlIIlIIIII);
            final TileEntity lllllllllllllIlIlIIIIlIlIIlIIlIl = lllllllllllllIlIlIIIIlIlIIlIlIIl.getTileEntity(lllllllllllllIlIlIIIIlIlIIlIlIII);
            int outputSignal;
            if (lIllIlIIIlIIlll((lllllllllllllIlIlIIIIlIlIIlIIlIl instanceof TileEntityComparator) ? 1 : 0)) {
                outputSignal = ((TileEntityComparator)lllllllllllllIlIlIIIIlIlIIlIIlIl).getOutputSignal();
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
            else {
                outputSignal = BlockRedstoneComparator.lIIIIIIlIlllIl[0];
            }
            final int lllllllllllllIlIlIIIIlIlIIlIIlII = outputSignal;
            if (!lIllIlIIIlIllII(lllllllllllllIlIlIIIIlIlIIlIIllI, lllllllllllllIlIlIIIIlIlIIlIIlII) || lIllIlIIIlIllIl(this.isPowered(lllllllllllllIlIlIIIIlIlIIlIIIII) ? 1 : 0, this.shouldBePowered(lllllllllllllIlIlIIIIlIlIIlIlIIl, lllllllllllllIlIlIIIIlIlIIlIlIII, lllllllllllllIlIlIIIIlIlIIlIIIII) ? 1 : 0)) {
                if (lIllIlIIIlIIlll(this.isFacingTowardsRepeater(lllllllllllllIlIlIIIIlIlIIlIlIIl, lllllllllllllIlIlIIIIlIlIIlIlIII, lllllllllllllIlIlIIIIlIlIIlIIIII) ? 1 : 0)) {
                    lllllllllllllIlIlIIIIlIlIIlIlIIl.updateBlockTick(lllllllllllllIlIlIIIIlIlIIlIlIII, this, BlockRedstoneComparator.lIIIIIIlIlllIl[2], BlockRedstoneComparator.lIIIIIIlIlllIl[5]);
                    "".length();
                    if (-"   ".length() >= 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIlIlIIIIlIlIIlIlIIl.updateBlockTick(lllllllllllllIlIlIIIIlIlIIlIlIII, this, BlockRedstoneComparator.lIIIIIIlIlllIl[2], BlockRedstoneComparator.lIIIIIIlIlllIl[0]);
                }
            }
        }
    }
    
    private int calculateOutput(final World lllllllllllllIlIlIIIIlIllIIIIIll, final BlockPos lllllllllllllIlIlIIIIlIllIIIIIlI, final IBlockState lllllllllllllIlIlIIIIlIllIIIIlIl) {
        int n;
        if (lIllIlIIIlIlIII(lllllllllllllIlIlIIIIlIllIIIIlIl.getValue(BlockRedstoneComparator.MODE), Mode.SUBTRACT)) {
            n = Math.max(this.calculateInputStrength(lllllllllllllIlIlIIIIlIllIIIIIll, lllllllllllllIlIlIIIIlIllIIIIIlI, lllllllllllllIlIlIIIIlIllIIIIlIl) - this.getPowerOnSides(lllllllllllllIlIlIIIIlIllIIIIIll, lllllllllllllIlIlIIIIlIllIIIIIlI, lllllllllllllIlIlIIIIlIllIIIIlIl), BlockRedstoneComparator.lIIIIIIlIlllIl[0]);
            "".length();
            if ((0x1F ^ 0x5 ^ (0xBD ^ 0xA3)) < 0) {
                return (1 + 18 + 52 + 125 ^ 124 + 13 - 47 + 58) & (0x38 ^ 0x4D ^ (0x50 ^ 0x75) ^ -" ".length());
            }
        }
        else {
            n = this.calculateInputStrength(lllllllllllllIlIlIIIIlIllIIIIIll, lllllllllllllIlIlIIIIlIllIIIIIlI, lllllllllllllIlIlIIIIlIllIIIIlIl);
        }
        return n;
    }
    
    @Override
    protected int getActiveSignal(final IBlockAccess lllllllllllllIlIlIIIIlIllIIlIIll, final BlockPos lllllllllllllIlIlIIIIlIllIIlIIlI, final IBlockState lllllllllllllIlIlIIIIlIllIIlIIIl) {
        final TileEntity lllllllllllllIlIlIIIIlIllIIlIIII = lllllllllllllIlIlIIIIlIllIIlIIll.getTileEntity(lllllllllllllIlIlIIIIlIllIIlIIlI);
        int outputSignal;
        if (lIllIlIIIlIIlll((lllllllllllllIlIlIIIIlIllIIlIIII instanceof TileEntityComparator) ? 1 : 0)) {
            outputSignal = ((TileEntityComparator)lllllllllllllIlIlIIIIlIllIIlIIII).getOutputSignal();
            "".length();
            if ((0xF ^ 0xB) <= 0) {
                return (0x1F ^ 0xC) & ~(0xA ^ 0x19);
            }
        }
        else {
            outputSignal = BlockRedstoneComparator.lIIIIIIlIlllIl[0];
        }
        return outputSignal;
    }
    
    private static boolean lIllIlIIIlIllll(final int lllllllllllllIlIlIIIIlIIIlIllIll) {
        return lllllllllllllIlIlIIIIlIIIlIllIll > 0;
    }
    
    @Override
    protected boolean shouldBePowered(final World lllllllllllllIlIlIIIIlIlIllllIIl, final BlockPos lllllllllllllIlIlIIIIlIlIlllIIlI, final IBlockState lllllllllllllIlIlIIIIlIlIlllIIIl) {
        final int lllllllllllllIlIlIIIIlIlIlllIllI = this.calculateInputStrength(lllllllllllllIlIlIIIIlIlIllllIIl, lllllllllllllIlIlIIIIlIlIlllIIlI, lllllllllllllIlIlIIIIlIlIlllIIIl);
        if (lIllIlIIIlIlIIl(lllllllllllllIlIlIIIIlIlIlllIllI, BlockRedstoneComparator.lIIIIIIlIlllIl[3])) {
            return BlockRedstoneComparator.lIIIIIIlIlllIl[1] != 0;
        }
        if (lIllIlIIIlIIllI(lllllllllllllIlIlIIIIlIlIlllIllI)) {
            return BlockRedstoneComparator.lIIIIIIlIlllIl[0] != 0;
        }
        final int lllllllllllllIlIlIIIIlIlIlllIlIl = this.getPowerOnSides(lllllllllllllIlIlIIIIlIlIllllIIl, lllllllllllllIlIlIIIIlIlIlllIIlI, lllllllllllllIlIlIIIIlIlIlllIIIl);
        int n;
        if (lIllIlIIIlIIllI(lllllllllllllIlIlIIIIlIlIlllIlIl)) {
            n = BlockRedstoneComparator.lIIIIIIlIlllIl[1];
            "".length();
            if (-" ".length() > 0) {
                return ((198 + 17 - 147 + 138 ^ 53 + 134 - 175 + 142) & (0 + 119 + 10 + 96 ^ 72 + 91 - 98 + 116 ^ -" ".length())) != 0x0;
            }
        }
        else if (lIllIlIIIlIlIIl(lllllllllllllIlIlIIIIlIlIlllIllI, lllllllllllllIlIlIIIIlIlIlllIlIl)) {
            n = BlockRedstoneComparator.lIIIIIIlIlllIl[1];
            "".length();
            if ((0x2A ^ 0x7A ^ (0x7A ^ 0x2E)) <= 0) {
                return ((0x19 ^ 0x34 ^ (0xB8 ^ 0xB3)) & (0xBE ^ 0x8C ^ (0x2A ^ 0x3E) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = BlockRedstoneComparator.lIIIIIIlIlllIl[0];
        }
        return n != 0;
    }
    
    @Override
    protected int getDelay(final IBlockState lllllllllllllIlIlIIIIlIllIlllIII) {
        return BlockRedstoneComparator.lIIIIIIlIlllIl[2];
    }
    
    @Override
    protected boolean isPowered(final IBlockState lllllllllllllIlIlIIIIlIllIIllIlI) {
        if (lIllIlIIIlIIllI(this.isRepeaterPowered ? 1 : 0) && lIllIlIIIlIIllI(((boolean)lllllllllllllIlIlIIIIlIllIIllIlI.getValue((IProperty<Boolean>)BlockRedstoneComparator.POWERED)) ? 1 : 0)) {
            return BlockRedstoneComparator.lIIIIIIlIlllIl[0] != 0;
        }
        return BlockRedstoneComparator.lIIIIIIlIlllIl[1] != 0;
    }
    
    @Override
    public void onBlockAdded(final World lllllllllllllIlIlIIIIlIIlllIlllI, final BlockPos lllllllllllllIlIlIIIIlIIlllIllIl, final IBlockState lllllllllllllIlIlIIIIlIIlllIllII) {
        super.onBlockAdded(lllllllllllllIlIlIIIIlIIlllIlllI, lllllllllllllIlIlIIIIlIIlllIllIl, lllllllllllllIlIlIIIIlIIlllIllII);
        lllllllllllllIlIlIIIIlIIlllIlllI.setTileEntity(lllllllllllllIlIlIIIIlIIlllIllIl, this.createNewTileEntity(lllllllllllllIlIlIIIIlIIlllIlllI, BlockRedstoneComparator.lIIIIIIlIlllIl[0]));
    }
    
    static {
        lIllIlIIIlIIlIl();
        lIllIIllIIIlIll();
        POWERED = PropertyBool.create(BlockRedstoneComparator.lIIIIIIIlIlIlI[BlockRedstoneComparator.lIIIIIIlIlllIl[0]]);
        MODE = PropertyEnum.create(BlockRedstoneComparator.lIIIIIIIlIlIlI[BlockRedstoneComparator.lIIIIIIlIlllIl[1]], Mode.class);
    }
    
    @Override
    public String getLocalizedName() {
        return StatCollector.translateToLocal(BlockRedstoneComparator.lIIIIIIIlIlIlI[BlockRedstoneComparator.lIIIIIIlIlllIl[2]]);
    }
    
    @Override
    public void updateTick(final World lllllllllllllIlIlIIIIlIIlllllIll, final BlockPos lllllllllllllIlIlIIIIlIIllllIlIl, final IBlockState lllllllllllllIlIlIIIIlIIlllllIIl, final Random lllllllllllllIlIlIIIIlIIlllllIII) {
        if (lIllIlIIIlIIlll(this.isRepeaterPowered ? 1 : 0)) {
            lllllllllllllIlIlIIIIlIIlllllIll.setBlockState(lllllllllllllIlIlIIIIlIIllllIlIl, this.getUnpoweredState(lllllllllllllIlIlIIIIlIIlllllIIl).withProperty((IProperty<Comparable>)BlockRedstoneComparator.POWERED, (boolean)(BlockRedstoneComparator.lIIIIIIlIlllIl[1] != 0)), BlockRedstoneComparator.lIIIIIIlIlllIl[6]);
            "".length();
        }
        this.onStateChange(lllllllllllllIlIlIIIIlIIlllllIll, lllllllllllllIlIlIIIIlIIllllIlIl, lllllllllllllIlIlIIIIlIIlllllIIl);
    }
    
    private static void lIllIIllIIIlIll() {
        (lIIIIIIIlIlIlI = new String[BlockRedstoneComparator.lIIIIIIlIlllIl[6]])[BlockRedstoneComparator.lIIIIIIlIlllIl[0]] = lIllIIllIIIlIII("zL3rMvuLWz0=", "lwhqa");
        BlockRedstoneComparator.lIIIIIIIlIlIlI[BlockRedstoneComparator.lIIIIIIlIlllIl[1]] = lIllIIllIIIlIIl("Lx0DAw==", "Brgfp");
        BlockRedstoneComparator.lIIIIIIIlIlIlI[BlockRedstoneComparator.lIIIIIIlIlllIl[2]] = lIllIIllIIIlIII("lo6STdhmGlsvQUQvvry2dnZ8hEwii0y6", "MywbD");
        BlockRedstoneComparator.lIIIIIIIlIlIlI[BlockRedstoneComparator.lIIIIIIlIlllIl[4]] = lIllIIllIIIlIlI("dtTpD+/moDux5TJcsTQ3fg==", "MDGGr");
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockRedstoneComparator.lIIIIIIlIlllIl[4]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockRedstoneComparator.lIIIIIIlIlllIl[0]] = BlockRedstoneComparator.FACING;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockRedstoneComparator.lIIIIIIlIlllIl[1]] = BlockRedstoneComparator.MODE;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockRedstoneComparator.lIIIIIIlIlllIl[2]] = BlockRedstoneComparator.POWERED;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static boolean lIllIlIIIlIlllI(final Object lllllllllllllIlIlIIIIlIIIllIIIIl) {
        return lllllllllllllIlIlIIIIlIIIllIIIIl == null;
    }
    
    @Override
    protected IBlockState getPoweredState(final IBlockState lllllllllllllIlIlIIIIlIllIlIlllI) {
        final Boolean lllllllllllllIlIlIIIIlIllIllIIIl = lllllllllllllIlIlIIIIlIllIlIlllI.getValue((IProperty<Boolean>)BlockRedstoneComparator.POWERED);
        final Mode lllllllllllllIlIlIIIIlIllIllIIII = lllllllllllllIlIlIIIIlIllIlIlllI.getValue(BlockRedstoneComparator.MODE);
        final EnumFacing lllllllllllllIlIlIIIIlIllIlIllll = lllllllllllllIlIlIIIIlIllIlIlllI.getValue((IProperty<EnumFacing>)BlockRedstoneComparator.FACING);
        return Blocks.powered_comparator.getDefaultState().withProperty((IProperty<Comparable>)BlockRedstoneComparator.FACING, lllllllllllllIlIlIIIIlIllIlIllll).withProperty((IProperty<Comparable>)BlockRedstoneComparator.POWERED, lllllllllllllIlIlIIIIlIllIllIIIl).withProperty(BlockRedstoneComparator.MODE, lllllllllllllIlIlIIIIlIllIllIIII);
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIlIlIIIIlIIlIlllIlI) {
        int lllllllllllllIlIlIIIIlIIlIlllIIl = BlockRedstoneComparator.lIIIIIIlIlllIl[0];
        lllllllllllllIlIlIIIIlIIlIlllIIl |= lllllllllllllIlIlIIIIlIIlIlllIlI.getValue((IProperty<EnumFacing>)BlockRedstoneComparator.FACING).getHorizontalIndex();
        if (lIllIlIIIlIIlll(((boolean)lllllllllllllIlIlIIIIlIIlIlllIlI.getValue((IProperty<Boolean>)BlockRedstoneComparator.POWERED)) ? 1 : 0)) {
            lllllllllllllIlIlIIIIlIIlIlllIIl |= BlockRedstoneComparator.lIIIIIIlIlllIl[7];
        }
        if (lIllIlIIIlIlIII(lllllllllllllIlIlIIIIlIIlIlllIlI.getValue(BlockRedstoneComparator.MODE), Mode.SUBTRACT)) {
            lllllllllllllIlIlIIIIlIIlIlllIIl |= BlockRedstoneComparator.lIIIIIIlIlllIl[6];
        }
        return lllllllllllllIlIlIIIIlIIlIlllIIl;
    }
    
    private void onStateChange(final World lllllllllllllIlIlIIIIlIlIIIlIIlI, final BlockPos lllllllllllllIlIlIIIIlIlIIIlIIIl, final IBlockState lllllllllllllIlIlIIIIlIlIIIlIIII) {
        final int lllllllllllllIlIlIIIIlIlIIIIllll = this.calculateOutput(lllllllllllllIlIlIIIIlIlIIIlIIlI, lllllllllllllIlIlIIIIlIlIIIlIIIl, lllllllllllllIlIlIIIIlIlIIIlIIII);
        final TileEntity lllllllllllllIlIlIIIIlIlIIIIlllI = lllllllllllllIlIlIIIIlIlIIIlIIlI.getTileEntity(lllllllllllllIlIlIIIIlIlIIIlIIIl);
        int lllllllllllllIlIlIIIIlIlIIIIllIl = BlockRedstoneComparator.lIIIIIIlIlllIl[0];
        if (lIllIlIIIlIIlll((lllllllllllllIlIlIIIIlIlIIIIlllI instanceof TileEntityComparator) ? 1 : 0)) {
            final TileEntityComparator lllllllllllllIlIlIIIIlIlIIIIllII = (TileEntityComparator)lllllllllllllIlIlIIIIlIlIIIIlllI;
            lllllllllllllIlIlIIIIlIlIIIIllIl = lllllllllllllIlIlIIIIlIlIIIIllII.getOutputSignal();
            lllllllllllllIlIlIIIIlIlIIIIllII.setOutputSignal(lllllllllllllIlIlIIIIlIlIIIIllll);
        }
        if (!lIllIlIIIlIllII(lllllllllllllIlIlIIIIlIlIIIIllIl, lllllllllllllIlIlIIIIlIlIIIIllll) || lIllIlIIIlIlIII(lllllllllllllIlIlIIIIlIlIIIlIIII.getValue(BlockRedstoneComparator.MODE), Mode.COMPARE)) {
            final boolean lllllllllllllIlIlIIIIlIlIIIIlIll = this.shouldBePowered(lllllllllllllIlIlIIIIlIlIIIlIIlI, lllllllllllllIlIlIIIIlIlIIIlIIIl, lllllllllllllIlIlIIIIlIlIIIlIIII);
            final boolean lllllllllllllIlIlIIIIlIlIIIIlIlI = this.isPowered(lllllllllllllIlIlIIIIlIlIIIlIIII);
            if (lIllIlIIIlIIlll(lllllllllllllIlIlIIIIlIlIIIIlIlI ? 1 : 0) && lIllIlIIIlIIllI(lllllllllllllIlIlIIIIlIlIIIIlIll ? 1 : 0)) {
                lllllllllllllIlIlIIIIlIlIIIlIIlI.setBlockState(lllllllllllllIlIlIIIIlIlIIIlIIIl, lllllllllllllIlIlIIIIlIlIIIlIIII.withProperty((IProperty<Comparable>)BlockRedstoneComparator.POWERED, (boolean)(BlockRedstoneComparator.lIIIIIIlIlllIl[0] != 0)), BlockRedstoneComparator.lIIIIIIlIlllIl[2]);
                "".length();
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
            }
            else if (lIllIlIIIlIIllI(lllllllllllllIlIlIIIIlIlIIIIlIlI ? 1 : 0) && lIllIlIIIlIIlll(lllllllllllllIlIlIIIIlIlIIIIlIll ? 1 : 0)) {
                lllllllllllllIlIlIIIIlIlIIIlIIlI.setBlockState(lllllllllllllIlIlIIIIlIlIIIlIIIl, lllllllllllllIlIlIIIIlIlIIIlIIII.withProperty((IProperty<Comparable>)BlockRedstoneComparator.POWERED, (boolean)(BlockRedstoneComparator.lIIIIIIlIlllIl[1] != 0)), BlockRedstoneComparator.lIIIIIIlIlllIl[2]);
                "".length();
            }
            this.notifyNeighbors(lllllllllllllIlIlIIIIlIlIIIlIIlI, lllllllllllllIlIlIIIIlIlIIIlIIIl, lllllllllllllIlIlIIIIlIlIIIlIIII);
        }
    }
    
    private static String lIllIIllIIIlIIl(String lllllllllllllIlIlIIIIlIIlIIIlIlI, final String lllllllllllllIlIlIIIIlIIlIIIlIIl) {
        lllllllllllllIlIlIIIIlIIlIIIlIlI = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIIIIlIIlIIIlIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIIIIlIIlIIIllIl = new StringBuilder();
        final char[] lllllllllllllIlIlIIIIlIIlIIIllII = lllllllllllllIlIlIIIIlIIlIIIlIIl.toCharArray();
        int lllllllllllllIlIlIIIIlIIlIIIlIll = BlockRedstoneComparator.lIIIIIIlIlllIl[0];
        final short lllllllllllllIlIlIIIIlIIlIIIIlIl = (Object)((String)lllllllllllllIlIlIIIIlIIlIIIlIlI).toCharArray();
        final short lllllllllllllIlIlIIIIlIIlIIIIlII = (short)lllllllllllllIlIlIIIIlIIlIIIIlIl.length;
        float lllllllllllllIlIlIIIIlIIlIIIIIll = BlockRedstoneComparator.lIIIIIIlIlllIl[0];
        while (lIllIlIIIlIlIlI((int)lllllllllllllIlIlIIIIlIIlIIIIIll, lllllllllllllIlIlIIIIlIIlIIIIlII)) {
            final char lllllllllllllIlIlIIIIlIIlIIlIIII = lllllllllllllIlIlIIIIlIIlIIIIlIl[lllllllllllllIlIlIIIIlIIlIIIIIll];
            lllllllllllllIlIlIIIIlIIlIIIllIl.append((char)(lllllllllllllIlIlIIIIlIIlIIlIIII ^ lllllllllllllIlIlIIIIlIIlIIIllII[lllllllllllllIlIlIIIIlIIlIIIlIll % lllllllllllllIlIlIIIIlIIlIIIllII.length]));
            "".length();
            ++lllllllllllllIlIlIIIIlIIlIIIlIll;
            ++lllllllllllllIlIlIIIIlIIlIIIIIll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIIIIlIIlIIIllIl);
    }
    
    @Override
    protected int calculateInputStrength(final World lllllllllllllIlIlIIIIlIlIllIIlII, final BlockPos lllllllllllllIlIlIIIIlIlIlIllIlI, final IBlockState lllllllllllllIlIlIIIIlIlIllIIIlI) {
        int lllllllllllllIlIlIIIIlIlIllIIIIl = super.calculateInputStrength(lllllllllllllIlIlIIIIlIlIllIIlII, lllllllllllllIlIlIIIIlIlIlIllIlI, lllllllllllllIlIlIIIIlIlIllIIIlI);
        final EnumFacing lllllllllllllIlIlIIIIlIlIllIIIII = lllllllllllllIlIlIIIIlIlIllIIIlI.getValue((IProperty<EnumFacing>)BlockRedstoneComparator.FACING);
        BlockPos lllllllllllllIlIlIIIIlIlIlIlllll = lllllllllllllIlIlIIIIlIlIlIllIlI.offset(lllllllllllllIlIlIIIIlIlIllIIIII);
        Block lllllllllllllIlIlIIIIlIlIlIllllI = lllllllllllllIlIlIIIIlIlIllIIlII.getBlockState(lllllllllllllIlIlIIIIlIlIlIlllll).getBlock();
        if (lIllIlIIIlIIlll(lllllllllllllIlIlIIIIlIlIlIllllI.hasComparatorInputOverride() ? 1 : 0)) {
            lllllllllllllIlIlIIIIlIlIllIIIIl = lllllllllllllIlIlIIIIlIlIlIllllI.getComparatorInputOverride(lllllllllllllIlIlIIIIlIlIllIIlII, lllllllllllllIlIlIIIIlIlIlIlllll);
            "".length();
            if (-(0x87 ^ 0x83) > 0) {
                return (0x6D ^ 0x35) & ~(0xC ^ 0x54);
            }
        }
        else if (lIllIlIIIlIlIlI(lllllllllllllIlIlIIIIlIlIllIIIIl, BlockRedstoneComparator.lIIIIIIlIlllIl[3]) && lIllIlIIIlIIlll(lllllllllllllIlIlIIIIlIlIlIllllI.isNormalCube() ? 1 : 0)) {
            lllllllllllllIlIlIIIIlIlIlIlllll = lllllllllllllIlIlIIIIlIlIlIlllll.offset(lllllllllllllIlIlIIIIlIlIllIIIII);
            lllllllllllllIlIlIIIIlIlIlIllllI = lllllllllllllIlIlIIIIlIlIllIIlII.getBlockState(lllllllllllllIlIlIIIIlIlIlIlllll).getBlock();
            if (lIllIlIIIlIIlll(lllllllllllllIlIlIIIIlIlIlIllllI.hasComparatorInputOverride() ? 1 : 0)) {
                lllllllllllllIlIlIIIIlIlIllIIIIl = lllllllllllllIlIlIIIIlIlIlIllllI.getComparatorInputOverride(lllllllllllllIlIlIIIIlIlIllIIlII, lllllllllllllIlIlIIIIlIlIlIlllll);
                "".length();
                if ("  ".length() == "   ".length()) {
                    return (0x75 ^ 0x70) & ~(0xA4 ^ 0xA1);
                }
            }
            else if (lIllIlIIIlIlIII(lllllllllllllIlIlIIIIlIlIlIllllI.getMaterial(), Material.air)) {
                final EntityItemFrame lllllllllllllIlIlIIIIlIlIlIlllIl = this.findItemFrame(lllllllllllllIlIlIIIIlIlIllIIlII, lllllllllllllIlIlIIIIlIlIllIIIII, lllllllllllllIlIlIIIIlIlIlIlllll);
                if (lIllIlIIIlIlIll(lllllllllllllIlIlIIIIlIlIlIlllIl)) {
                    lllllllllllllIlIlIIIIlIlIllIIIIl = lllllllllllllIlIlIIIIlIlIlIlllIl.func_174866_q();
                }
            }
        }
        return lllllllllllllIlIlIIIIlIlIllIIIIl;
    }
    
    public enum Mode implements IStringSerializable
    {
        SUBTRACT(Mode.llllllIlIIlII[Mode.llllllIlIIlIl[2]], Mode.llllllIlIIlIl[1], Mode.llllllIlIIlII[Mode.llllllIlIIlIl[3]]);
        
        private static final /* synthetic */ int[] llllllIlIIlIl;
        private static final /* synthetic */ String[] llllllIlIIlII;
        private final /* synthetic */ String name;
        
        COMPARE(Mode.llllllIlIIlII[Mode.llllllIlIIlIl[0]], Mode.llllllIlIIlIl[0], Mode.llllllIlIIlII[Mode.llllllIlIIlIl[1]]);
        
        @Override
        public String toString() {
            return this.name;
        }
        
        private Mode(final String lllllllllllllIlIlIlIlIIlIIIlIIlI, final int lllllllllllllIlIlIlIlIIlIIIlIIIl, final String lllllllllllllIlIlIlIlIIlIIIlIIII) {
            this.name = lllllllllllllIlIlIlIlIIlIIIlIIII;
        }
        
        @Override
        public String getName() {
            return this.name;
        }
        
        private static String lIllIIIIIIIlllI(final String lllllllllllllIlIlIlIlIIIllIlIIll, final String lllllllllllllIlIlIlIlIIIllIlIlII) {
            try {
                final SecretKeySpec lllllllllllllIlIlIlIlIIIllIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIlIIIllIlIlII.getBytes(StandardCharsets.UTF_8)), Mode.llllllIlIIlIl[5]), "DES");
                final Cipher lllllllllllllIlIlIlIlIIIllIlIlll = Cipher.getInstance("DES");
                lllllllllllllIlIlIlIlIIIllIlIlll.init(Mode.llllllIlIIlIl[2], lllllllllllllIlIlIlIlIIIllIllIII);
                return new String(lllllllllllllIlIlIlIlIIIllIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIlIIIllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlIlIlIIIllIlIllI) {
                lllllllllllllIlIlIlIlIIIllIlIllI.printStackTrace();
                return null;
            }
        }
        
        private static String lIllIIIIIIIllll(String lllllllllllllIlIlIlIlIIIlllIIlIl, final String lllllllllllllIlIlIlIlIIIlllIIlII) {
            lllllllllllllIlIlIlIlIIIlllIIlIl = new String(Base64.getDecoder().decode(lllllllllllllIlIlIlIlIIIlllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIlIlIlIIIlllIlIII = new StringBuilder();
            final char[] lllllllllllllIlIlIlIlIIIlllIIlll = lllllllllllllIlIlIlIlIIIlllIIlII.toCharArray();
            int lllllllllllllIlIlIlIlIIIlllIIllI = Mode.llllllIlIIlIl[0];
            final char lllllllllllllIlIlIlIlIIIlllIIIII = (Object)lllllllllllllIlIlIlIlIIIlllIIlIl.toCharArray();
            final int lllllllllllllIlIlIlIlIIIllIlllll = lllllllllllllIlIlIlIlIIIlllIIIII.length;
            Exception lllllllllllllIlIlIlIlIIIllIllllI = (Exception)Mode.llllllIlIIlIl[0];
            while (lIllIIIIIIlIIll((int)lllllllllllllIlIlIlIlIIIllIllllI, lllllllllllllIlIlIlIlIIIllIlllll)) {
                final char lllllllllllllIlIlIlIlIIIlllIlIll = lllllllllllllIlIlIlIlIIIlllIIIII[lllllllllllllIlIlIlIlIIIllIllllI];
                lllllllllllllIlIlIlIlIIIlllIlIII.append((char)(lllllllllllllIlIlIlIlIIIlllIlIll ^ lllllllllllllIlIlIlIlIIIlllIIlll[lllllllllllllIlIlIlIlIIIlllIIllI % lllllllllllllIlIlIlIlIIIlllIIlll.length]));
                "".length();
                ++lllllllllllllIlIlIlIlIIIlllIIllI;
                ++lllllllllllllIlIlIlIlIIIllIllllI;
                "".length();
                if (-(0x2D ^ 0x29) > 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIlIlIlIIIlllIlIII);
        }
        
        private static boolean lIllIIIIIIlIIll(final int lllllllllllllIlIlIlIlIIIllIIllIl, final int lllllllllllllIlIlIlIlIIIllIIllII) {
            return lllllllllllllIlIlIlIlIIIllIIllIl < lllllllllllllIlIlIlIlIIIllIIllII;
        }
        
        static {
            lIllIIIIIIlIIlI();
            lIllIIIIIIlIIIl();
            final Mode[] enum$VALUES = new Mode[Mode.llllllIlIIlIl[2]];
            enum$VALUES[Mode.llllllIlIIlIl[0]] = Mode.COMPARE;
            enum$VALUES[Mode.llllllIlIIlIl[1]] = Mode.SUBTRACT;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static void lIllIIIIIIlIIlI() {
            (llllllIlIIlIl = new int[6])[0] = ((0x2A ^ 0x6A) & ~(0x64 ^ 0x24));
            Mode.llllllIlIIlIl[1] = " ".length();
            Mode.llllllIlIIlIl[2] = "  ".length();
            Mode.llllllIlIIlIl[3] = "   ".length();
            Mode.llllllIlIIlIl[4] = (0x52 ^ 0x56);
            Mode.llllllIlIIlIl[5] = (89 + 113 - 101 + 42 ^ 50 + 97 - 83 + 71);
        }
        
        private static String lIllIIIIIIlIIII(final String lllllllllllllIlIlIlIlIIIlllllIII, final String lllllllllllllIlIlIlIlIIIlllllIIl) {
            try {
                final SecretKeySpec lllllllllllllIlIlIlIlIIIllllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIlIIIlllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIlIlIlIIIllllllII = Cipher.getInstance("Blowfish");
                lllllllllllllIlIlIlIlIIIllllllII.init(Mode.llllllIlIIlIl[2], lllllllllllllIlIlIlIlIIIllllllIl);
                return new String(lllllllllllllIlIlIlIlIIIllllllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIlIIIlllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlIlIlIIIlllllIll) {
                lllllllllllllIlIlIlIlIIIlllllIll.printStackTrace();
                return null;
            }
        }
        
        private static void lIllIIIIIIlIIIl() {
            (llllllIlIIlII = new String[Mode.llllllIlIIlIl[4]])[Mode.llllllIlIIlIl[0]] = lIllIIIIIIIlllI("DWBxGKx9BQk=", "xXAKK");
            Mode.llllllIlIIlII[Mode.llllllIlIIlIl[1]] = lIllIIIIIIIllll("BDUcJSoVPw==", "gZqUK");
            Mode.llllllIlIIlII[Mode.llllllIlIIlIl[2]] = lIllIIIIIIlIIII("Xsnx6/kpsE7op0dLtSggNg==", "JbBeI");
            Mode.llllllIlIIlII[Mode.llllllIlIIlIl[3]] = lIllIIIIIIlIIII("8QWFwexEA3ar4DdDeEwG1g==", "RnInS");
        }
    }
}
