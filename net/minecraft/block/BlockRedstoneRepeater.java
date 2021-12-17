// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.util.StatCollector;
import net.minecraft.block.state.BlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumParticleTypes;
import java.util.Random;
import net.minecraft.world.World;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyInteger;

public class BlockRedstoneRepeater extends BlockRedstoneDiode
{
    public static final /* synthetic */ PropertyInteger DELAY;
    private static final /* synthetic */ String[] lIllIIIlIlIllI;
    private static final /* synthetic */ int[] lIllIIIllIIIIl;
    public static final /* synthetic */ PropertyBool LOCKED;
    
    protected BlockRedstoneRepeater(final boolean lllllllllllllIIIIIllIIIIIlIIIIll) {
        super(lllllllllllllIIIIIllIIIIIlIIIIll);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockRedstoneRepeater.FACING, EnumFacing.NORTH).withProperty((IProperty<Comparable>)BlockRedstoneRepeater.DELAY, BlockRedstoneRepeater.lIllIIIllIIIIl[1]).withProperty((IProperty<Comparable>)BlockRedstoneRepeater.LOCKED, (boolean)(BlockRedstoneRepeater.lIllIIIllIIIIl[0] != 0)));
    }
    
    private static boolean lllllIIIIlIllIl(final int lllllllllllllIIIIIlIlllllIIIIIIl) {
        return lllllllllllllIIIIIlIlllllIIIIIIl == 0;
    }
    
    @Override
    public IBlockState getActualState(final IBlockState lllllllllllllIIIIIllIIIIIIlllIlI, final IBlockAccess lllllllllllllIIIIIllIIIIIIllIlIl, final BlockPos lllllllllllllIIIIIllIIIIIIllIlII) {
        return lllllllllllllIIIIIllIIIIIIlllIlI.withProperty((IProperty<Comparable>)BlockRedstoneRepeater.LOCKED, this.isLocked(lllllllllllllIIIIIllIIIIIIllIlIl, lllllllllllllIIIIIllIIIIIIllIlII, lllllllllllllIIIIIllIIIIIIlllIlI));
    }
    
    private static String lllllIIIIIIllII(String lllllllllllllIIIIIlIlllllIIlIIIl, final String lllllllllllllIIIIIlIlllllIIlIIII) {
        lllllllllllllIIIIIlIlllllIIlIIIl = new String(Base64.getDecoder().decode(lllllllllllllIIIIIlIlllllIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIlIlllllIIlIlII = new StringBuilder();
        final char[] lllllllllllllIIIIIlIlllllIIlIIll = lllllllllllllIIIIIlIlllllIIlIIII.toCharArray();
        int lllllllllllllIIIIIlIlllllIIlIIlI = BlockRedstoneRepeater.lIllIIIllIIIIl[0];
        final Exception lllllllllllllIIIIIlIlllllIIIllII = (Object)lllllllllllllIIIIIlIlllllIIlIIIl.toCharArray();
        final Exception lllllllllllllIIIIIlIlllllIIIlIll = (Exception)lllllllllllllIIIIIlIlllllIIIllII.length;
        String lllllllllllllIIIIIlIlllllIIIlIlI = (String)BlockRedstoneRepeater.lIllIIIllIIIIl[0];
        while (lllllIIIIllIIII((int)lllllllllllllIIIIIlIlllllIIIlIlI, (int)lllllllllllllIIIIIlIlllllIIIlIll)) {
            final char lllllllllllllIIIIIlIlllllIIlIlll = lllllllllllllIIIIIlIlllllIIIllII[lllllllllllllIIIIIlIlllllIIIlIlI];
            lllllllllllllIIIIIlIlllllIIlIlII.append((char)(lllllllllllllIIIIIlIlllllIIlIlll ^ lllllllllllllIIIIIlIlllllIIlIIll[lllllllllllllIIIIIlIlllllIIlIIlI % lllllllllllllIIIIIlIlllllIIlIIll.length]));
            "".length();
            ++lllllllllllllIIIIIlIlllllIIlIIlI;
            ++lllllllllllllIIIIIlIlllllIIIlIlI;
            "".length();
            if ((75 + 34 - 42 + 91 ^ 27 + 90 - 42 + 79) < " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIlIlllllIIlIlII);
    }
    
    @Override
    public boolean isLocked(final IBlockAccess lllllllllllllIIIIIlIlllllllllIII, final BlockPos lllllllllllllIIIIIlIllllllllIlll, final IBlockState lllllllllllllIIIIIlIllllllllIIlI) {
        if (lllllIIIIlIlllI(this.getPowerOnSides(lllllllllllllIIIIIlIlllllllllIII, lllllllllllllIIIIIlIllllllllIlll, lllllllllllllIIIIIlIllllllllIIlI))) {
            return BlockRedstoneRepeater.lIllIIIllIIIIl[1] != 0;
        }
        return BlockRedstoneRepeater.lIllIIIllIIIIl[0] != 0;
    }
    
    @Override
    public void randomDisplayTick(final World lllllllllllllIIIIIlIllllllIlIlII, final BlockPos lllllllllllllIIIIIlIllllllIlllll, final IBlockState lllllllllllllIIIIIlIllllllIllllI, final Random lllllllllllllIIIIIlIllllllIlIIIl) {
        if (lllllIIIIlIllll(this.isRepeaterPowered ? 1 : 0)) {
            final EnumFacing lllllllllllllIIIIIlIllllllIlllII = lllllllllllllIIIIIlIllllllIllllI.getValue((IProperty<EnumFacing>)BlockRedstoneRepeater.FACING);
            final double lllllllllllllIIIIIlIllllllIllIll = lllllllllllllIIIIIlIllllllIlllll.getX() + 0.5f + (lllllllllllllIIIIIlIllllllIlIIIl.nextFloat() - 0.5f) * 0.2;
            final double lllllllllllllIIIIIlIllllllIllIlI = lllllllllllllIIIIIlIllllllIlllll.getY() + 0.4f + (lllllllllllllIIIIIlIllllllIlIIIl.nextFloat() - 0.5f) * 0.2;
            final double lllllllllllllIIIIIlIllllllIllIIl = lllllllllllllIIIIIlIllllllIlllll.getZ() + 0.5f + (lllllllllllllIIIIIlIllllllIlIIIl.nextFloat() - 0.5f) * 0.2;
            float lllllllllllllIIIIIlIllllllIllIII = -5.0f;
            if (lllllIIIIlIllll(lllllllllllllIIIIIlIllllllIlIIIl.nextBoolean() ? 1 : 0)) {
                lllllllllllllIIIIIlIllllllIllIII = (float)(lllllllllllllIIIIIlIllllllIllllI.getValue((IProperty<Integer>)BlockRedstoneRepeater.DELAY) * BlockRedstoneRepeater.lIllIIIllIIIIl[3] - BlockRedstoneRepeater.lIllIIIllIIIIl[1]);
            }
            lllllllllllllIIIIIlIllllllIllIII /= 16.0f;
            final double lllllllllllllIIIIIlIllllllIlIlll = lllllllllllllIIIIIlIllllllIllIII * lllllllllllllIIIIIlIllllllIlllII.getFrontOffsetX();
            final double lllllllllllllIIIIIlIllllllIlIllI = lllllllllllllIIIIIlIllllllIllIII * lllllllllllllIIIIIlIllllllIlllII.getFrontOffsetZ();
            lllllllllllllIIIIIlIllllllIlIlII.spawnParticle(EnumParticleTypes.REDSTONE, lllllllllllllIIIIIlIllllllIllIll + lllllllllllllIIIIIlIllllllIlIlll, lllllllllllllIIIIIlIllllllIllIlI, lllllllllllllIIIIIlIllllllIllIIl + lllllllllllllIIIIIlIllllllIlIllI, 0.0, 0.0, 0.0, new int[BlockRedstoneRepeater.lIllIIIllIIIIl[0]]);
        }
    }
    
    @Override
    protected IBlockState getPoweredState(final IBlockState lllllllllllllIIIIIllIIIIIIIlIlIl) {
        final Integer lllllllllllllIIIIIllIIIIIIIllIII = lllllllllllllIIIIIllIIIIIIIlIlIl.getValue((IProperty<Integer>)BlockRedstoneRepeater.DELAY);
        final Boolean lllllllllllllIIIIIllIIIIIIIlIlll = lllllllllllllIIIIIllIIIIIIIlIlIl.getValue((IProperty<Boolean>)BlockRedstoneRepeater.LOCKED);
        final EnumFacing lllllllllllllIIIIIllIIIIIIIlIllI = lllllllllllllIIIIIllIIIIIIIlIlIl.getValue((IProperty<EnumFacing>)BlockRedstoneRepeater.FACING);
        return Blocks.powered_repeater.getDefaultState().withProperty((IProperty<Comparable>)BlockRedstoneRepeater.FACING, lllllllllllllIIIIIllIIIIIIIlIllI).withProperty((IProperty<Comparable>)BlockRedstoneRepeater.DELAY, lllllllllllllIIIIIllIIIIIIIllIII).withProperty((IProperty<Comparable>)BlockRedstoneRepeater.LOCKED, lllllllllllllIIIIIllIIIIIIIlIlll);
    }
    
    @Override
    protected int getDelay(final IBlockState lllllllllllllIIIIIllIIIIIIlIIIII) {
        return lllllllllllllIIIIIllIIIIIIlIIIII.getValue((IProperty<Integer>)BlockRedstoneRepeater.DELAY) * BlockRedstoneRepeater.lIllIIIllIIIIl[3];
    }
    
    @Override
    protected IBlockState getUnpoweredState(final IBlockState lllllllllllllIIIIIllIIIIIIIIlIII) {
        final Integer lllllllllllllIIIIIllIIIIIIIIlIll = lllllllllllllIIIIIllIIIIIIIIlIII.getValue((IProperty<Integer>)BlockRedstoneRepeater.DELAY);
        final Boolean lllllllllllllIIIIIllIIIIIIIIlIlI = lllllllllllllIIIIIllIIIIIIIIlIII.getValue((IProperty<Boolean>)BlockRedstoneRepeater.LOCKED);
        final EnumFacing lllllllllllllIIIIIllIIIIIIIIlIIl = lllllllllllllIIIIIllIIIIIIIIlIII.getValue((IProperty<EnumFacing>)BlockRedstoneRepeater.FACING);
        return Blocks.unpowered_repeater.getDefaultState().withProperty((IProperty<Comparable>)BlockRedstoneRepeater.FACING, lllllllllllllIIIIIllIIIIIIIIlIIl).withProperty((IProperty<Comparable>)BlockRedstoneRepeater.DELAY, lllllllllllllIIIIIllIIIIIIIIlIll).withProperty((IProperty<Comparable>)BlockRedstoneRepeater.LOCKED, lllllllllllllIIIIIllIIIIIIIIlIlI);
    }
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIIIIIllIIIIIIIIIIll, final Random lllllllllllllIIIIIllIIIIIIIIIIlI, final int lllllllllllllIIIIIllIIIIIIIIIIIl) {
        return Items.repeater;
    }
    
    private static void lllllIIIIIIlllI() {
        (lIllIIIlIlIllI = new String[BlockRedstoneRepeater.lIllIIIllIIIIl[4]])[BlockRedstoneRepeater.lIllIIIllIIIIl[0]] = lllllIIIIIIlIIl("jPrXyJurZNA=", "WtUDM");
        BlockRedstoneRepeater.lIllIIIlIlIllI[BlockRedstoneRepeater.lIllIIIllIIIIl[1]] = lllllIIIIIIllII("FR8gJx4=", "qzLFg");
        BlockRedstoneRepeater.lIllIIIlIlIllI[BlockRedstoneRepeater.lIllIIIllIIIIl[3]] = lllllIIIIIIlIIl("fX4V9mvDahqoMFpknaRsHQ==", "vrpjX");
    }
    
    @Override
    public boolean onBlockActivated(final World lllllllllllllIIIIIllIIIIIIlIlllI, final BlockPos lllllllllllllIIIIIllIIIIIIlIIlIl, final IBlockState lllllllllllllIIIIIllIIIIIIlIllII, final EntityPlayer lllllllllllllIIIIIllIIIIIIlIIIll, final EnumFacing lllllllllllllIIIIIllIIIIIIlIlIlI, final float lllllllllllllIIIIIllIIIIIIlIlIIl, final float lllllllllllllIIIIIllIIIIIIlIlIII, final float lllllllllllllIIIIIllIIIIIIlIIlll) {
        if (lllllIIIIlIllIl(lllllllllllllIIIIIllIIIIIIlIIIll.capabilities.allowEdit ? 1 : 0)) {
            return BlockRedstoneRepeater.lIllIIIllIIIIl[0] != 0;
        }
        lllllllllllllIIIIIllIIIIIIlIlllI.setBlockState(lllllllllllllIIIIIllIIIIIIlIIlIl, lllllllllllllIIIIIllIIIIIIlIllII.cycleProperty((IProperty<Comparable>)BlockRedstoneRepeater.DELAY), BlockRedstoneRepeater.lIllIIIllIIIIl[4]);
        "".length();
        return BlockRedstoneRepeater.lIllIIIllIIIIl[1] != 0;
    }
    
    @Override
    public void breakBlock(final World lllllllllllllIIIIIlIllllllIIIlII, final BlockPos lllllllllllllIIIIIlIllllllIIIIll, final IBlockState lllllllllllllIIIIIlIllllllIIIIlI) {
        super.breakBlock(lllllllllllllIIIIIlIllllllIIIlII, lllllllllllllIIIIIlIllllllIIIIll, lllllllllllllIIIIIlIllllllIIIIlI);
        this.notifyNeighbors(lllllllllllllIIIIIlIllllllIIIlII, lllllllllllllIIIIIlIllllllIIIIll, lllllllllllllIIIIIlIllllllIIIIlI);
    }
    
    private static boolean lllllIIIIlIllll(final int lllllllllllllIIIIIlIlllllIIIIIll) {
        return lllllllllllllIIIIIlIlllllIIIIIll != 0;
    }
    
    @Override
    public Item getItem(final World lllllllllllllIIIIIlIllllllllllll, final BlockPos lllllllllllllIIIIIlIlllllllllllI) {
        return Items.repeater;
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIIIIlIlllllIllIlII) {
        int lllllllllllllIIIIIlIlllllIllIIll = BlockRedstoneRepeater.lIllIIIllIIIIl[0];
        lllllllllllllIIIIIlIlllllIllIIll |= lllllllllllllIIIIIlIlllllIllIlII.getValue((IProperty<EnumFacing>)BlockRedstoneRepeater.FACING).getHorizontalIndex();
        lllllllllllllIIIIIlIlllllIllIIll |= lllllllllllllIIIIIlIlllllIllIlII.getValue((IProperty<Integer>)BlockRedstoneRepeater.DELAY) - BlockRedstoneRepeater.lIllIIIllIIIIl[1] << BlockRedstoneRepeater.lIllIIIllIIIIl[3];
        return lllllllllllllIIIIIlIlllllIllIIll;
    }
    
    @Override
    protected boolean canPowerSide(final Block lllllllllllllIIIIIlIlllllllIllll) {
        return BlockRedstoneDiode.isRedstoneRepeaterBlockID(lllllllllllllIIIIIlIlllllllIllll);
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIIIIlIlllllIlllIlI) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockRedstoneRepeater.FACING, EnumFacing.getHorizontal(lllllllllllllIIIIIlIlllllIlllIlI)).withProperty((IProperty<Comparable>)BlockRedstoneRepeater.LOCKED, (boolean)(BlockRedstoneRepeater.lIllIIIllIIIIl[0] != 0)).withProperty((IProperty<Comparable>)BlockRedstoneRepeater.DELAY, BlockRedstoneRepeater.lIllIIIllIIIIl[1] + (lllllllllllllIIIIIlIlllllIlllIlI >> BlockRedstoneRepeater.lIllIIIllIIIIl[3]));
    }
    
    private static boolean lllllIIIIllIIII(final int lllllllllllllIIIIIlIlllllIIIIllI, final int lllllllllllllIIIIIlIlllllIIIIlIl) {
        return lllllllllllllIIIIIlIlllllIIIIllI < lllllllllllllIIIIIlIlllllIIIIlIl;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockRedstoneRepeater.lIllIIIllIIIIl[4]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockRedstoneRepeater.lIllIIIllIIIIl[0]] = BlockRedstoneRepeater.FACING;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockRedstoneRepeater.lIllIIIllIIIIl[1]] = BlockRedstoneRepeater.DELAY;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockRedstoneRepeater.lIllIIIllIIIIl[3]] = BlockRedstoneRepeater.LOCKED;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public String getLocalizedName() {
        return StatCollector.translateToLocal(BlockRedstoneRepeater.lIllIIIlIlIllI[BlockRedstoneRepeater.lIllIIIllIIIIl[3]]);
    }
    
    private static boolean lllllIIIIlIlllI(final int lllllllllllllIIIIIlIllllIlllllll) {
        return lllllllllllllIIIIIlIllllIlllllll > 0;
    }
    
    private static String lllllIIIIIIlIIl(final String lllllllllllllIIIIIlIlllllIlIIllI, final String lllllllllllllIIIIIlIlllllIlIIIll) {
        try {
            final SecretKeySpec lllllllllllllIIIIIlIlllllIlIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIlIlllllIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIlIlllllIlIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIlIlllllIlIlIII.init(BlockRedstoneRepeater.lIllIIIllIIIIl[3], lllllllllllllIIIIIlIlllllIlIlIIl);
            return new String(lllllllllllllIIIIIlIlllllIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIlIlllllIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIlIlllllIlIIlll) {
            lllllllllllllIIIIIlIlllllIlIIlll.printStackTrace();
            return null;
        }
    }
    
    static {
        lllllIIIIlIllII();
        lllllIIIIIIlllI();
        LOCKED = PropertyBool.create(BlockRedstoneRepeater.lIllIIIlIlIllI[BlockRedstoneRepeater.lIllIIIllIIIIl[0]]);
        DELAY = PropertyInteger.create(BlockRedstoneRepeater.lIllIIIlIlIllI[BlockRedstoneRepeater.lIllIIIllIIIIl[1]], BlockRedstoneRepeater.lIllIIIllIIIIl[1], BlockRedstoneRepeater.lIllIIIllIIIIl[2]);
    }
    
    private static void lllllIIIIlIllII() {
        (lIllIIIllIIIIl = new int[5])[0] = ((151 + 138 - 195 + 60 ^ 86 + 77 - 124 + 143) & (0xCA ^ 0xAB ^ (0x42 ^ 0xF) ^ -" ".length()));
        BlockRedstoneRepeater.lIllIIIllIIIIl[1] = " ".length();
        BlockRedstoneRepeater.lIllIIIllIIIIl[2] = (0xAB ^ 0xAF);
        BlockRedstoneRepeater.lIllIIIllIIIIl[3] = "  ".length();
        BlockRedstoneRepeater.lIllIIIllIIIIl[4] = "   ".length();
    }
}
