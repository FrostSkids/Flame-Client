// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.block.state.BlockState;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.EntitySelectors;
import net.minecraft.entity.EntityMinecartCommandBlock;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import java.util.List;
import com.google.common.base.Predicate;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.Entity;
import net.minecraft.block.properties.IProperty;
import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyBool;

public class BlockRailDetector extends BlockRailBase
{
    public static final /* synthetic */ PropertyBool POWERED;
    private static final /* synthetic */ int[] lllllIIlIIlIl;
    public static final /* synthetic */ PropertyEnum<EnumRailDirection> SHAPE;
    private static final /* synthetic */ String[] lllllIIlIIIlI;
    
    @Override
    public void updateTick(final World lllllllllllllIlIlIlllllllIIlIlII, final BlockPos lllllllllllllIlIlIlllllllIIlIIll, final IBlockState lllllllllllllIlIlIlllllllIIlIlll, final Random lllllllllllllIlIlIlllllllIIlIllI) {
        if (lIlIllIllIIlllI(lllllllllllllIlIlIlllllllIIlIlII.isRemote ? 1 : 0) && lIlIllIllIIllll(((boolean)lllllllllllllIlIlIlllllllIIlIlll.getValue((IProperty<Boolean>)BlockRailDetector.POWERED)) ? 1 : 0)) {
            this.updatePoweredState(lllllllllllllIlIlIlllllllIIlIlII, lllllllllllllIlIlIlllllllIIlIIll, lllllllllllllIlIlIlllllllIIlIlll);
        }
    }
    
    private static boolean lIlIllIllIlIIIl(final int lllllllllllllIlIlIlllllIllllIIIl, final int lllllllllllllIlIlIlllllIllllIIII) {
        return lllllllllllllIlIlIlllllIllllIIIl != lllllllllllllIlIlIlllllIllllIIII;
    }
    
    @Override
    public void onEntityCollidedWithBlock(final World lllllllllllllIlIlIlllllllIlIIllI, final BlockPos lllllllllllllIlIlIlllllllIlIlIlI, final IBlockState lllllllllllllIlIlIlllllllIlIlIIl, final Entity lllllllllllllIlIlIlllllllIlIlIII) {
        if (lIlIllIllIIlllI(lllllllllllllIlIlIlllllllIlIIllI.isRemote ? 1 : 0) && lIlIllIllIIlllI(((boolean)lllllllllllllIlIlIlllllllIlIlIIl.getValue((IProperty<Boolean>)BlockRailDetector.POWERED)) ? 1 : 0)) {
            this.updatePoweredState(lllllllllllllIlIlIlllllllIlIIllI, lllllllllllllIlIlIlllllllIlIlIlI, lllllllllllllIlIlIlllllllIlIlIIl);
        }
    }
    
    @Override
    public boolean canProvidePower() {
        return BlockRailDetector.lllllIIlIIlIl[1] != 0;
    }
    
    @Override
    public void onBlockAdded(final World lllllllllllllIlIlIllllllIllIIlll, final BlockPos lllllllllllllIlIlIllllllIllIIIlI, final IBlockState lllllllllllllIlIlIllllllIllIIIIl) {
        super.onBlockAdded(lllllllllllllIlIlIllllllIllIIlll, lllllllllllllIlIlIllllllIllIIIlI, lllllllllllllIlIlIllllllIllIIIIl);
        this.updatePoweredState(lllllllllllllIlIlIllllllIllIIlll, lllllllllllllIlIlIllllllIllIIIlI, lllllllllllllIlIlIllllllIllIIIIl);
    }
    
    private void updatePoweredState(final World lllllllllllllIlIlIllllllIlllIIlI, final BlockPos lllllllllllllIlIlIllllllIllllIII, final IBlockState lllllllllllllIlIlIllllllIlllIlll) {
        final boolean lllllllllllllIlIlIllllllIlllIllI = lllllllllllllIlIlIllllllIlllIlll.getValue((IProperty<Boolean>)BlockRailDetector.POWERED);
        boolean lllllllllllllIlIlIllllllIlllIlIl = BlockRailDetector.lllllIIlIIlIl[0] != 0;
        final List<EntityMinecart> lllllllllllllIlIlIllllllIlllIlII = this.findMinecarts(lllllllllllllIlIlIllllllIlllIIlI, lllllllllllllIlIlIllllllIllllIII, EntityMinecart.class, (Predicate<Entity>[])new Predicate[BlockRailDetector.lllllIIlIIlIl[0]]);
        if (lIlIllIllIIlllI(lllllllllllllIlIlIllllllIlllIlII.isEmpty() ? 1 : 0)) {
            lllllllllllllIlIlIllllllIlllIlIl = (BlockRailDetector.lllllIIlIIlIl[1] != 0);
        }
        if (lIlIllIllIIllll(lllllllllllllIlIlIllllllIlllIlIl ? 1 : 0) && lIlIllIllIIlllI(lllllllllllllIlIlIllllllIlllIllI ? 1 : 0)) {
            lllllllllllllIlIlIllllllIlllIIlI.setBlockState(lllllllllllllIlIlIllllllIllllIII, lllllllllllllIlIlIllllllIlllIlll.withProperty((IProperty<Comparable>)BlockRailDetector.POWERED, (boolean)(BlockRailDetector.lllllIIlIIlIl[1] != 0)), BlockRailDetector.lllllIIlIIlIl[4]);
            "".length();
            lllllllllllllIlIlIllllllIlllIIlI.notifyNeighborsOfStateChange(lllllllllllllIlIlIllllllIllllIII, this);
            lllllllllllllIlIlIllllllIlllIIlI.notifyNeighborsOfStateChange(lllllllllllllIlIlIllllllIllllIII.down(), this);
            lllllllllllllIlIlIllllllIlllIIlI.markBlockRangeForRenderUpdate(lllllllllllllIlIlIllllllIllllIII, lllllllllllllIlIlIllllllIllllIII);
        }
        if (lIlIllIllIIlllI(lllllllllllllIlIlIllllllIlllIlIl ? 1 : 0) && lIlIllIllIIllll(lllllllllllllIlIlIllllllIlllIllI ? 1 : 0)) {
            lllllllllllllIlIlIllllllIlllIIlI.setBlockState(lllllllllllllIlIlIllllllIllllIII, lllllllllllllIlIlIllllllIlllIlll.withProperty((IProperty<Comparable>)BlockRailDetector.POWERED, (boolean)(BlockRailDetector.lllllIIlIIlIl[0] != 0)), BlockRailDetector.lllllIIlIIlIl[4]);
            "".length();
            lllllllllllllIlIlIllllllIlllIIlI.notifyNeighborsOfStateChange(lllllllllllllIlIlIllllllIllllIII, this);
            lllllllllllllIlIlIllllllIlllIIlI.notifyNeighborsOfStateChange(lllllllllllllIlIlIllllllIllllIII.down(), this);
            lllllllllllllIlIlIllllllIlllIIlI.markBlockRangeForRenderUpdate(lllllllllllllIlIlIllllllIllllIII, lllllllllllllIlIlIllllllIllllIII);
        }
        if (lIlIllIllIIllll(lllllllllllllIlIlIllllllIlllIlIl ? 1 : 0)) {
            lllllllllllllIlIlIllllllIlllIIlI.scheduleUpdate(lllllllllllllIlIlIllllllIllllIII, this, this.tickRate(lllllllllllllIlIlIllllllIlllIIlI));
        }
        lllllllllllllIlIlIllllllIlllIIlI.updateComparatorOutputLevel(lllllllllllllIlIlIllllllIllllIII, this);
    }
    
    private static boolean lIlIllIllIlIIll(final int lllllllllllllIlIlIlllllIllllllll, final int lllllllllllllIlIlIlllllIlllllllI) {
        return lllllllllllllIlIlIlllllIllllllll < lllllllllllllIlIlIlllllIlllllllI;
    }
    
    @Override
    public int getStrongPower(final IBlockAccess lllllllllllllIlIlIlllllllIIIIlll, final BlockPos lllllllllllllIlIlIlllllllIIIIllI, final IBlockState lllllllllllllIlIlIlllllllIIIIIll, final EnumFacing lllllllllllllIlIlIlllllllIIIIlII) {
        int n;
        if (lIlIllIllIIlllI(((boolean)lllllllllllllIlIlIlllllllIIIIIll.getValue((IProperty<Boolean>)BlockRailDetector.POWERED)) ? 1 : 0)) {
            n = BlockRailDetector.lllllIIlIIlIl[0];
            "".length();
            if (" ".length() <= ((0x92 ^ 0xC4) & ~(0xD5 ^ 0x83))) {
                return (0x5A ^ 0x4E) & ~(0xBD ^ 0xA9);
            }
        }
        else if (lIlIllIllIlIIII(lllllllllllllIlIlIlllllllIIIIlII, EnumFacing.UP)) {
            n = BlockRailDetector.lllllIIlIIlIl[3];
            "".length();
            if ((0x15 ^ 0x11) == ((0x38 ^ 0x7) & ~(0xA2 ^ 0x9D))) {
                return (0x2A ^ 0x3E) & ~(0x88 ^ 0x9C);
            }
        }
        else {
            n = BlockRailDetector.lllllIIlIIlIl[0];
        }
        return n;
    }
    
    @Override
    public boolean hasComparatorInputOverride() {
        return BlockRailDetector.lllllIIlIIlIl[1] != 0;
    }
    
    private static void lIlIllIllIIlIll() {
        (lllllIIlIIIlI = new String[BlockRailDetector.lllllIIlIIlIl[7]])[BlockRailDetector.lllllIIlIIlIl[0]] = lIlIllIlIllllIl("BjwXPA0=", "uTvLh");
        BlockRailDetector.lllllIIlIIIlI[BlockRailDetector.lllllIIlIIlIl[1]] = lIlIllIlIllllll("FrfgbOHlkqA=", "jtsrH");
    }
    
    private static void lIlIllIllIIllIl() {
        (lllllIIlIIlIl = new int[8])[0] = ((0xCE ^ 0xC2 ^ (0x34 ^ 0x68)) & (105 + 187 - 110 + 69 ^ 124 + 150 - 123 + 20 ^ -" ".length()));
        BlockRailDetector.lllllIIlIIlIl[1] = " ".length();
        BlockRailDetector.lllllIIlIIlIl[2] = (0xA6 ^ 0xB2);
        BlockRailDetector.lllllIIlIIlIl[3] = (58 + 37 - 53 + 90 ^ 108 + 16 - 96 + 111);
        BlockRailDetector.lllllIIlIIlIl[4] = "   ".length();
        BlockRailDetector.lllllIIlIIlIl[5] = (0xAE ^ 0xA9);
        BlockRailDetector.lllllIIlIIlIl[6] = (0xCA ^ 0xC2);
        BlockRailDetector.lllllIIlIIlIl[7] = "  ".length();
    }
    
    @Override
    public int getWeakPower(final IBlockAccess lllllllllllllIlIlIlllllllIIIllll, final BlockPos lllllllllllllIlIlIlllllllIIIlllI, final IBlockState lllllllllllllIlIlIlllllllIIIlIll, final EnumFacing lllllllllllllIlIlIlllllllIIIllII) {
        int n;
        if (lIlIllIllIIllll(((boolean)lllllllllllllIlIlIlllllllIIIlIll.getValue((IProperty<Boolean>)BlockRailDetector.POWERED)) ? 1 : 0)) {
            n = BlockRailDetector.lllllIIlIIlIl[3];
            "".length();
            if ("   ".length() <= 0) {
                return (0x18 ^ 0x17) & ~(0x7 ^ 0x8);
            }
        }
        else {
            n = BlockRailDetector.lllllIIlIIlIl[0];
        }
        return n;
    }
    
    protected <T extends EntityMinecart> List<T> findMinecarts(final World lllllllllllllIlIlIllllllIlIIIIlI, final BlockPos lllllllllllllIlIlIllllllIlIIIlll, final Class<T> lllllllllllllIlIlIllllllIlIIIIII, final Predicate<Entity>... lllllllllllllIlIlIllllllIlIIIlIl) {
        final AxisAlignedBB lllllllllllllIlIlIllllllIlIIIlII = this.getDectectionBox(lllllllllllllIlIlIllllllIlIIIlll);
        List<T> list;
        if (lIlIllIllIlIIIl(lllllllllllllIlIlIllllllIlIIIlIl.length, BlockRailDetector.lllllIIlIIlIl[1])) {
            list = lllllllllllllIlIlIllllllIlIIIIlI.getEntitiesWithinAABB((Class<? extends T>)lllllllllllllIlIlIllllllIlIIIIII, lllllllllllllIlIlIllllllIlIIIlII);
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        else {
            list = lllllllllllllIlIlIllllllIlIIIIlI.getEntitiesWithinAABB((Class<? extends T>)lllllllllllllIlIlIllllllIlIIIIII, lllllllllllllIlIlIllllllIlIIIlII, (com.google.common.base.Predicate<? super T>)lllllllllllllIlIlIllllllIlIIIlIl[BlockRailDetector.lllllIIlIIlIl[0]]);
        }
        return list;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIlIlIllllllIIllIIIl) {
        final IBlockState withProperty = this.getDefaultState().withProperty(BlockRailDetector.SHAPE, EnumRailDirection.byMetadata(lllllllllllllIlIlIllllllIIllIIIl & BlockRailDetector.lllllIIlIIlIl[5]));
        final PropertyBool powered = BlockRailDetector.POWERED;
        int b;
        if (lIlIllIllIlIIlI(lllllllllllllIlIlIllllllIIllIIIl & BlockRailDetector.lllllIIlIIlIl[6])) {
            b = BlockRailDetector.lllllIIlIIlIl[1];
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        else {
            b = BlockRailDetector.lllllIIlIIlIl[0];
        }
        return withProperty.withProperty((IProperty<Comparable>)powered, (boolean)(b != 0));
    }
    
    private static boolean lIlIllIllIlIIlI(final int lllllllllllllIlIlIlllllIllllIlII) {
        return lllllllllllllIlIlIlllllIllllIlII > 0;
    }
    
    static {
        lIlIllIllIIllIl();
        lIlIllIllIIlIll();
        SHAPE = PropertyEnum.create(BlockRailDetector.lllllIIlIIIlI[BlockRailDetector.lllllIIlIIlIl[0]], EnumRailDirection.class, (com.google.common.base.Predicate<EnumRailDirection>)new Predicate<EnumRailDirection>() {
            private static final /* synthetic */ int[] lIllIlllIllIll;
            
            private static boolean lIIIIIIIIlIIlllI(final Object llllllllllllIllllllIIlIllIlIlIII, final Object llllllllllllIllllllIIlIllIlIIlll) {
                return llllllllllllIllllllIIlIllIlIlIII != llllllllllllIllllllIIlIllIlIIlll;
            }
            
            private static void lIIIIIIIIlIIllIl() {
                (lIllIlllIllIll = new int[2])[0] = " ".length();
                BlockRailDetector$1.lIllIlllIllIll[1] = ((0xEA ^ 0x87 ^ (0x9E ^ 0xB4)) & (0x11 ^ 0x19 ^ (0xFF ^ 0xB0) ^ -" ".length()));
            }
            
            public boolean apply(final EnumRailDirection llllllllllllIllllllIIlIllIllIIII) {
                if (lIIIIIIIIlIIlllI(llllllllllllIllllllIIlIllIllIIII, EnumRailDirection.NORTH_EAST) && lIIIIIIIIlIIlllI(llllllllllllIllllllIIlIllIllIIII, EnumRailDirection.NORTH_WEST) && lIIIIIIIIlIIlllI(llllllllllllIllllllIIlIllIllIIII, EnumRailDirection.SOUTH_EAST) && lIIIIIIIIlIIlllI(llllllllllllIllllllIIlIllIllIIII, EnumRailDirection.SOUTH_WEST)) {
                    return BlockRailDetector$1.lIllIlllIllIll[0] != 0;
                }
                return BlockRailDetector$1.lIllIlllIllIll[1] != 0;
            }
            
            static {
                lIIIIIIIIlIIllIl();
            }
        });
        POWERED = PropertyBool.create(BlockRailDetector.lllllIIlIIIlI[BlockRailDetector.lllllIIlIIlIl[1]]);
    }
    
    private static boolean lIlIllIllIIllll(final int lllllllllllllIlIlIlllllIlllllIII) {
        return lllllllllllllIlIlIlllllIlllllIII != 0;
    }
    
    @Override
    public void randomTick(final World lllllllllllllIlIlIlllllllIlIIIlI, final BlockPos lllllllllllllIlIlIlllllllIlIIIIl, final IBlockState lllllllllllllIlIlIlllllllIlIIIII, final Random lllllllllllllIlIlIlllllllIIlllll) {
    }
    
    private static String lIlIllIlIllllll(final String lllllllllllllIlIlIllllllIIIIIlIl, final String lllllllllllllIlIlIllllllIIIIIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIllllllIIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIllllllIIIIIlII.getBytes(StandardCharsets.UTF_8)), BlockRailDetector.lllllIIlIIlIl[6]), "DES");
            final Cipher lllllllllllllIlIlIllllllIIIIlIIl = Cipher.getInstance("DES");
            lllllllllllllIlIlIllllllIIIIlIIl.init(BlockRailDetector.lllllIIlIIlIl[7], lllllllllllllIlIlIllllllIIIIlIlI);
            return new String(lllllllllllllIlIlIllllllIIIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIllllllIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIllllllIIIIlIII) {
            lllllllllllllIlIlIllllllIIIIlIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int tickRate(final World lllllllllllllIlIlIlllllllIllIIlI) {
        return BlockRailDetector.lllllIIlIIlIl[2];
    }
    
    @Override
    public IProperty<EnumRailDirection> getShapeProperty() {
        return BlockRailDetector.SHAPE;
    }
    
    @Override
    public int getComparatorInputOverride(final World lllllllllllllIlIlIllllllIlIllIII, final BlockPos lllllllllllllIlIlIllllllIlIlIlll) {
        if (lIlIllIllIIllll(((boolean)lllllllllllllIlIlIllllllIlIllIII.getBlockState(lllllllllllllIlIlIllllllIlIlIlll).getValue((IProperty<Boolean>)BlockRailDetector.POWERED)) ? 1 : 0)) {
            final List<EntityMinecartCommandBlock> lllllllllllllIlIlIllllllIlIlIllI = this.findMinecarts(lllllllllllllIlIlIllllllIlIllIII, lllllllllllllIlIlIllllllIlIlIlll, EntityMinecartCommandBlock.class, (Predicate<Entity>[])new Predicate[BlockRailDetector.lllllIIlIIlIl[0]]);
            if (lIlIllIllIIlllI(lllllllllllllIlIlIllllllIlIlIllI.isEmpty() ? 1 : 0)) {
                return lllllllllllllIlIlIllllllIlIlIllI.get(BlockRailDetector.lllllIIlIIlIl[0]).getCommandBlockLogic().getSuccessCount();
            }
            final Class<EntityMinecart> lllllllllllllIlIlIllllllIlIIIIII = EntityMinecart.class;
            final Predicate[] lllllllllllllIlIlIllllllIlIIIlIl = new Predicate[BlockRailDetector.lllllIIlIIlIl[1]];
            lllllllllllllIlIlIllllllIlIIIlIl[BlockRailDetector.lllllIIlIIlIl[0]] = EntitySelectors.selectInventories;
            final List<EntityMinecart> lllllllllllllIlIlIllllllIlIlIlIl = this.findMinecarts(lllllllllllllIlIlIllllllIlIllIII, lllllllllllllIlIlIllllllIlIlIlll, lllllllllllllIlIlIllllllIlIIIIII, (Predicate<Entity>[])lllllllllllllIlIlIllllllIlIIIlIl);
            if (lIlIllIllIIlllI(lllllllllllllIlIlIllllllIlIlIlIl.isEmpty() ? 1 : 0)) {
                return Container.calcRedstoneFromInventory((IInventory)lllllllllllllIlIlIllllllIlIlIlIl.get(BlockRailDetector.lllllIIlIIlIl[0]));
            }
        }
        return BlockRailDetector.lllllIIlIIlIl[0];
    }
    
    private static boolean lIlIllIllIlIIII(final Object lllllllllllllIlIlIlllllIlllllIll, final Object lllllllllllllIlIlIlllllIlllllIlI) {
        return lllllllllllllIlIlIlllllIlllllIll == lllllllllllllIlIlIlllllIlllllIlI;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockRailDetector.lllllIIlIIlIl[7]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockRailDetector.lllllIIlIIlIl[0]] = BlockRailDetector.SHAPE;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockRailDetector.lllllIIlIIlIl[1]] = BlockRailDetector.POWERED;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIlIlIllllllIIlIllIl) {
        int lllllllllllllIlIlIllllllIIlIllII = BlockRailDetector.lllllIIlIIlIl[0];
        lllllllllllllIlIlIllllllIIlIllII |= lllllllllllllIlIlIllllllIIlIllIl.getValue(BlockRailDetector.SHAPE).getMetadata();
        if (lIlIllIllIIllll(((boolean)lllllllllllllIlIlIllllllIIlIllIl.getValue((IProperty<Boolean>)BlockRailDetector.POWERED)) ? 1 : 0)) {
            lllllllllllllIlIlIllllllIIlIllII |= BlockRailDetector.lllllIIlIIlIl[6];
        }
        return lllllllllllllIlIlIllllllIIlIllII;
    }
    
    public BlockRailDetector() {
        super((boolean)(BlockRailDetector.lllllIIlIIlIl[1] != 0));
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockRailDetector.POWERED, (boolean)(BlockRailDetector.lllllIIlIIlIl[0] != 0)).withProperty(BlockRailDetector.SHAPE, EnumRailDirection.NORTH_SOUTH));
        this.setTickRandomly((boolean)(BlockRailDetector.lllllIIlIIlIl[1] != 0));
        "".length();
    }
    
    private static boolean lIlIllIllIIlllI(final int lllllllllllllIlIlIlllllIllllIllI) {
        return lllllllllllllIlIlIlllllIllllIllI == 0;
    }
    
    private AxisAlignedBB getDectectionBox(final BlockPos lllllllllllllIlIlIllllllIIlllIII) {
        final float lllllllllllllIlIlIllllllIIlllIIl = 0.2f;
        return new AxisAlignedBB(lllllllllllllIlIlIllllllIIlllIII.getX() + 0.2f, lllllllllllllIlIlIllllllIIlllIII.getY(), lllllllllllllIlIlIllllllIIlllIII.getZ() + 0.2f, lllllllllllllIlIlIllllllIIlllIII.getX() + BlockRailDetector.lllllIIlIIlIl[1] - 0.2f, lllllllllllllIlIlIllllllIIlllIII.getY() + BlockRailDetector.lllllIIlIIlIl[1] - 0.2f, lllllllllllllIlIlIllllllIIlllIII.getZ() + BlockRailDetector.lllllIIlIIlIl[1] - 0.2f);
    }
    
    private static String lIlIllIlIllllIl(String lllllllllllllIlIlIllllllIIIlIlll, final String lllllllllllllIlIlIllllllIIIlIllI) {
        lllllllllllllIlIlIllllllIIIlIlll = (short)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIllllllIIIlIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIllllllIIIllIlI = new StringBuilder();
        final char[] lllllllllllllIlIlIllllllIIIllIIl = lllllllllllllIlIlIllllllIIIlIllI.toCharArray();
        int lllllllllllllIlIlIllllllIIIllIII = BlockRailDetector.lllllIIlIIlIl[0];
        final long lllllllllllllIlIlIllllllIIIlIIlI = (Object)((String)lllllllllllllIlIlIllllllIIIlIlll).toCharArray();
        final byte lllllllllllllIlIlIllllllIIIlIIIl = (byte)lllllllllllllIlIlIllllllIIIlIIlI.length;
        byte lllllllllllllIlIlIllllllIIIlIIII = (byte)BlockRailDetector.lllllIIlIIlIl[0];
        while (lIlIllIllIlIIll(lllllllllllllIlIlIllllllIIIlIIII, lllllllllllllIlIlIllllllIIIlIIIl)) {
            final char lllllllllllllIlIlIllllllIIIlllIl = lllllllllllllIlIlIllllllIIIlIIlI[lllllllllllllIlIlIllllllIIIlIIII];
            lllllllllllllIlIlIllllllIIIllIlI.append((char)(lllllllllllllIlIlIllllllIIIlllIl ^ lllllllllllllIlIlIllllllIIIllIIl[lllllllllllllIlIlIllllllIIIllIII % lllllllllllllIlIlIllllllIIIllIIl.length]));
            "".length();
            ++lllllllllllllIlIlIllllllIIIllIII;
            ++lllllllllllllIlIlIllllllIIIlIIII;
            "".length();
            if ("   ".length() <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIllllllIIIllIlI);
    }
}
