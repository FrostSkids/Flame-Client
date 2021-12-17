// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.entity.Entity;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.MapColor;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public abstract class BlockBasePressurePlate extends Block
{
    private static final /* synthetic */ String[] lIIIIlllIIIIlI;
    private static final /* synthetic */ int[] lIIIIlllIIIIll;
    
    @Override
    public void breakBlock(final World lllllllllllllIlIIlIIIlIlIIIIIlII, final BlockPos lllllllllllllIlIIlIIIlIlIIIIIIll, final IBlockState lllllllllllllIlIIlIIIlIlIIIIIIlI) {
        if (lIllllIIIlIIlll(this.getRedstoneStrength(lllllllllllllIlIIlIIIlIlIIIIIIlI))) {
            this.updateNeighbors(lllllllllllllIlIIlIIIlIlIIIIIlII, lllllllllllllIlIIlIIIlIlIIIIIIll);
        }
        super.breakBlock(lllllllllllllIlIIlIIIlIlIIIIIlII, lllllllllllllIlIIlIIIlIlIIIIIIll, lllllllllllllIlIIlIIIlIlIIIIIIlI);
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockBasePressurePlate.lIIIIlllIIIIll[1] != 0;
    }
    
    private static void lIllllIIIlIIlIl() {
        (lIIIIlllIIIIlI = new String[BlockBasePressurePlate.lIIIIlllIIIIll[3]])[BlockBasePressurePlate.lIIIIlllIIIIll[1]] = lIllllIIIlIIIll("l/AXo02OoRy7dnzcJfDmpQ==", "tlgFh");
        BlockBasePressurePlate.lIIIIlllIIIIlI[BlockBasePressurePlate.lIIIIlllIIIIll[0]] = lIllllIIIlIIlII("MQM/LDkuTDIkPyAJ", "CbQHV");
    }
    
    protected void updateNeighbors(final World lllllllllllllIlIIlIIIlIIlllllIIl, final BlockPos lllllllllllllIlIIlIIIlIIllllIlIl) {
        lllllllllllllIlIIlIIIlIIlllllIIl.notifyNeighborsOfStateChange(lllllllllllllIlIIlIIIlIIllllIlIl, this);
        lllllllllllllIlIIlIIIlIIlllllIIl.notifyNeighborsOfStateChange(lllllllllllllIlIIlIIIlIIllllIlIl.down(), this);
    }
    
    protected abstract IBlockState setRedstoneStrength(final IBlockState p0, final int p1);
    
    @Override
    public boolean canProvidePower() {
        return BlockBasePressurePlate.lIIIIlllIIIIll[0] != 0;
    }
    
    protected void setBlockBoundsBasedOnState0(final IBlockState lllllllllllllIlIIlIIIlIlIlllllIl) {
        int n;
        if (lIllllIIIlIIlll(this.getRedstoneStrength(lllllllllllllIlIIlIIIlIlIlllllIl))) {
            n = BlockBasePressurePlate.lIIIIlllIIIIll[0];
            "".length();
            if (" ".length() == (0x9A ^ 0x9E)) {
                return;
            }
        }
        else {
            n = BlockBasePressurePlate.lIIIIlllIIIIll[1];
        }
        final boolean lllllllllllllIlIIlIIIlIlIlllllII = n != 0;
        final float lllllllllllllIlIIlIIIlIlIllllIll = 0.0625f;
        if (lIllllIIIlIlIII(lllllllllllllIlIIlIIIlIlIlllllII ? 1 : 0)) {
            this.setBlockBounds(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.03125f, 0.9375f);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.setBlockBounds(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.0625f, 0.9375f);
        }
    }
    
    @Override
    public boolean func_181623_g() {
        return BlockBasePressurePlate.lIIIIlllIIIIll[0] != 0;
    }
    
    protected abstract int getRedstoneStrength(final IBlockState p0);
    
    protected BlockBasePressurePlate(final Material lllllllllllllIlIIlIIIlIllIIlIlIl) {
        this(lllllllllllllIlIIlIIIlIllIIlIlIl, lllllllllllllIlIIlIIIlIllIIlIlIl.getMaterialMapColor());
    }
    
    protected abstract int computeRedstoneStrength(final World p0, final BlockPos p1);
    
    @Override
    public void randomTick(final World lllllllllllllIlIIlIIIlIlIlIIllII, final BlockPos lllllllllllllIlIIlIIIlIlIlIIlIll, final IBlockState lllllllllllllIlIIlIIIlIlIlIIlIlI, final Random lllllllllllllIlIIlIIIlIlIlIIlIIl) {
    }
    
    @Override
    public boolean isPassable(final IBlockAccess lllllllllllllIlIIlIIIlIlIllIllIl, final BlockPos lllllllllllllIlIIlIIIlIlIllIllII) {
        return BlockBasePressurePlate.lIIIIlllIIIIll[0] != 0;
    }
    
    @Override
    public boolean canPlaceBlockAt(final World lllllllllllllIlIIlIIIlIlIllIIllI, final BlockPos lllllllllllllIlIIlIIIlIlIllIIlIl) {
        return this.canBePlacedOn(lllllllllllllIlIIlIIIlIlIllIIllI, lllllllllllllIlIIlIIIlIlIllIIlIl.down());
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World lllllllllllllIlIIlIIIlIlIlllIIll, final BlockPos lllllllllllllIlIIlIIIlIlIlllIIlI, final IBlockState lllllllllllllIlIIlIIIlIlIlllIIIl) {
        return null;
    }
    
    @Override
    public int getStrongPower(final IBlockAccess lllllllllllllIlIIlIIIlIIlllIIlll, final BlockPos lllllllllllllIlIIlIIIlIIlllIIllI, final IBlockState lllllllllllllIlIIlIIIlIIlllIIIlI, final EnumFacing lllllllllllllIlIIlIIIlIIlllIIIIl) {
        int redstoneStrength;
        if (lIllllIIIlIlIll(lllllllllllllIlIIlIIIlIIlllIIIIl, EnumFacing.UP)) {
            redstoneStrength = this.getRedstoneStrength(lllllllllllllIlIIlIIIlIIlllIIIlI);
            "".length();
            if ((86 + 1 + 57 + 4 ^ 133 + 89 - 214 + 137) == 0x0) {
                return (0x6E ^ 0x23 ^ (0x2B ^ 0x4B)) & (0x66 ^ 0x34 ^ 0 + 29 + 78 + 20 ^ -" ".length());
            }
        }
        else {
            redstoneStrength = BlockBasePressurePlate.lIIIIlllIIIIll[1];
        }
        return redstoneStrength;
    }
    
    private static boolean lIllllIIIlIlIlI(final int lllllllllllllIlIIlIIIlIIlIIlllIl, final int lllllllllllllIlIIlIIIlIIlIIlllII) {
        return lllllllllllllIlIIlIIIlIIlIIlllIl != lllllllllllllIlIIlIIIlIIlIIlllII;
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess lllllllllllllIlIIlIIIlIllIIIIlII, final BlockPos lllllllllllllIlIIlIIIlIllIIIIllI) {
        this.setBlockBoundsBasedOnState0(lllllllllllllIlIIlIIIlIllIIIIlII.getBlockState(lllllllllllllIlIIlIIIlIllIIIIllI));
    }
    
    @Override
    public int getMobilityFlag() {
        return BlockBasePressurePlate.lIIIIlllIIIIll[0];
    }
    
    @Override
    public void onNeighborBlockChange(final World lllllllllllllIlIIlIIIlIlIlIlllII, final BlockPos lllllllllllllIlIIlIIIlIlIlIllIll, final IBlockState lllllllllllllIlIIlIIIlIlIlIlIlIl, final Block lllllllllllllIlIIlIIIlIlIlIllIIl) {
        if (lIllllIIIlIlIIl(this.canBePlacedOn(lllllllllllllIlIIlIIIlIlIlIlllII, lllllllllllllIlIIlIIIlIlIlIllIll.down()) ? 1 : 0)) {
            this.dropBlockAsItem(lllllllllllllIlIIlIIIlIlIlIlllII, lllllllllllllIlIIlIIIlIlIlIllIll, lllllllllllllIlIIlIIIlIlIlIlIlIl, BlockBasePressurePlate.lIIIIlllIIIIll[1]);
            lllllllllllllIlIIlIIIlIlIlIlllII.setBlockToAir(lllllllllllllIlIIlIIIlIlIlIllIll);
            "".length();
        }
    }
    
    private boolean canBePlacedOn(final World lllllllllllllIlIIlIIIlIlIlIlIIIl, final BlockPos lllllllllllllIlIIlIIIlIlIlIlIIII) {
        if (lIllllIIIlIlIIl(World.doesBlockHaveSolidTopSurface(lllllllllllllIlIIlIIIlIlIlIlIIIl, lllllllllllllIlIIlIIIlIlIlIlIIII) ? 1 : 0) && lIllllIIIlIlIIl((lllllllllllllIlIIlIIIlIlIlIlIIIl.getBlockState(lllllllllllllIlIIlIIIlIlIlIlIIII).getBlock() instanceof BlockFence) ? 1 : 0)) {
            return BlockBasePressurePlate.lIIIIlllIIIIll[1] != 0;
        }
        return BlockBasePressurePlate.lIIIIlllIIIIll[0] != 0;
    }
    
    @Override
    public int tickRate(final World lllllllllllllIlIIlIIIlIlIlllIlIl) {
        return BlockBasePressurePlate.lIIIIlllIIIIll[2];
    }
    
    private static String lIllllIIIlIIIll(final String lllllllllllllIlIIlIIIlIIllIIlIll, final String lllllllllllllIlIIlIIIlIIllIIlIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIIlIIllIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIIlIIllIIlIII.getBytes(StandardCharsets.UTF_8)), BlockBasePressurePlate.lIIIIlllIIIIll[4]), "DES");
            final Cipher lllllllllllllIlIIlIIIlIIllIIllIl = Cipher.getInstance("DES");
            lllllllllllllIlIIlIIIlIIllIIllIl.init(BlockBasePressurePlate.lIIIIlllIIIIll[3], lllllllllllllIlIIlIIIlIIllIIlllI);
            return new String(lllllllllllllIlIIlIIIlIIllIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIIlIIllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIIlIIllIIllII) {
            lllllllllllllIlIIlIIIlIIllIIllII.printStackTrace();
            return null;
        }
    }
    
    static {
        lIllllIIIlIIllI();
        lIllllIIIlIIlIl();
    }
    
    private static void lIllllIIIlIIllI() {
        (lIIIIlllIIIIll = new int[5])[0] = " ".length();
        BlockBasePressurePlate.lIIIIlllIIIIll[1] = ((0x2E ^ 0x6) & ~(0x72 ^ 0x5A));
        BlockBasePressurePlate.lIIIIlllIIIIll[2] = (0x2E ^ 0x68 ^ (0xF ^ 0x5D));
        BlockBasePressurePlate.lIIIIlllIIIIll[3] = "  ".length();
        BlockBasePressurePlate.lIIIIlllIIIIll[4] = (0xB2 ^ 0x93 ^ (0x3F ^ 0x16));
    }
    
    private static String lIllllIIIlIIlII(String lllllllllllllIlIIlIIIlIIlIllIllI, final String lllllllllllllIlIIlIIIlIIlIllIlIl) {
        lllllllllllllIlIIlIIIlIIlIllIllI = new String(Base64.getDecoder().decode(lllllllllllllIlIIlIIIlIIlIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIIIlIIlIlllIIl = new StringBuilder();
        final char[] lllllllllllllIlIIlIIIlIIlIlllIII = lllllllllllllIlIIlIIIlIIlIllIlIl.toCharArray();
        int lllllllllllllIlIIlIIIlIIlIllIlll = BlockBasePressurePlate.lIIIIlllIIIIll[1];
        final long lllllllllllllIlIIlIIIlIIlIllIIIl = (Object)lllllllllllllIlIIlIIIlIIlIllIllI.toCharArray();
        final double lllllllllllllIlIIlIIIlIIlIllIIII = lllllllllllllIlIIlIIIlIIlIllIIIl.length;
        long lllllllllllllIlIIlIIIlIIlIlIllll = BlockBasePressurePlate.lIIIIlllIIIIll[1];
        while (lIllllIIIlIllII((int)lllllllllllllIlIIlIIIlIIlIlIllll, (int)lllllllllllllIlIIlIIIlIIlIllIIII)) {
            final char lllllllllllllIlIIlIIIlIIlIllllII = lllllllllllllIlIIlIIIlIIlIllIIIl[lllllllllllllIlIIlIIIlIIlIlIllll];
            lllllllllllllIlIIlIIIlIIlIlllIIl.append((char)(lllllllllllllIlIIlIIIlIIlIllllII ^ lllllllllllllIlIIlIIIlIIlIlllIII[lllllllllllllIlIIlIIIlIIlIllIlll % lllllllllllllIlIIlIIIlIIlIlllIII.length]));
            "".length();
            ++lllllllllllllIlIIlIIIlIIlIllIlll;
            ++lllllllllllllIlIIlIIIlIIlIlIllll;
            "".length();
            if (-" ".length() < -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIIIlIIlIlllIIl);
    }
    
    @Override
    public void updateTick(final World lllllllllllllIlIIlIIIlIlIIllllII, final BlockPos lllllllllllllIlIIlIIIlIlIlIIIIIl, final IBlockState lllllllllllllIlIIlIIIlIlIlIIIIII, final Random lllllllllllllIlIIlIIIlIlIIllllll) {
        if (lIllllIIIlIlIIl(lllllllllllllIlIIlIIIlIlIIllllII.isRemote ? 1 : 0)) {
            final int lllllllllllllIlIIlIIIlIlIIlllllI = this.getRedstoneStrength(lllllllllllllIlIIlIIIlIlIlIIIIII);
            if (lIllllIIIlIIlll(lllllllllllllIlIIlIIIlIlIIlllllI)) {
                this.updateState(lllllllllllllIlIIlIIIlIlIIllllII, lllllllllllllIlIIlIIIlIlIlIIIIIl, lllllllllllllIlIIlIIIlIlIlIIIIII, lllllllllllllIlIIlIIIlIlIIlllllI);
            }
        }
    }
    
    private static boolean lIllllIIIlIlIIl(final int lllllllllllllIlIIlIIIlIIlIlIIIlI) {
        return lllllllllllllIlIIlIIIlIIlIlIIIlI == 0;
    }
    
    @Override
    public int getWeakPower(final IBlockAccess lllllllllllllIlIIlIIIlIIllllIIIl, final BlockPos lllllllllllllIlIIlIIIlIIllllIIII, final IBlockState lllllllllllllIlIIlIIIlIIlllIllII, final EnumFacing lllllllllllllIlIIlIIIlIIlllIlllI) {
        return this.getRedstoneStrength(lllllllllllllIlIIlIIIlIIlllIllII);
    }
    
    protected AxisAlignedBB getSensitiveAABB(final BlockPos lllllllllllllIlIIlIIIlIlIIIIlIll) {
        final float lllllllllllllIlIIlIIIlIlIIIIllII = 0.125f;
        return new AxisAlignedBB(lllllllllllllIlIIlIIIlIlIIIIlIll.getX() + 0.125f, lllllllllllllIlIIlIIIlIlIIIIlIll.getY(), lllllllllllllIlIIlIIIlIlIIIIlIll.getZ() + 0.125f, lllllllllllllIlIIlIIIlIlIIIIlIll.getX() + BlockBasePressurePlate.lIIIIlllIIIIll[0] - 0.125f, lllllllllllllIlIIlIIIlIlIIIIlIll.getY() + 0.25, lllllllllllllIlIIlIIIlIlIIIIlIll.getZ() + BlockBasePressurePlate.lIIIIlllIIIIll[0] - 0.125f);
    }
    
    protected BlockBasePressurePlate(final Material lllllllllllllIlIIlIIIlIllIIlIIII, final MapColor lllllllllllllIlIIlIIIlIllIIIllll) {
        super(lllllllllllllIlIIlIIIlIllIIlIIII, lllllllllllllIlIIlIIIlIllIIIllll);
        this.setCreativeTab(CreativeTabs.tabRedstone);
        "".length();
        this.setTickRandomly((boolean)(BlockBasePressurePlate.lIIIIlllIIIIll[0] != 0));
        "".length();
    }
    
    private static boolean lIllllIIIlIIlll(final int lllllllllllllIlIIlIIIlIIlIlIIIII) {
        return lllllllllllllIlIIlIIIlIIlIlIIIII > 0;
    }
    
    private static boolean lIllllIIIlIllII(final int lllllllllllllIlIIlIIIlIIlIlIlIll, final int lllllllllllllIlIIlIIIlIIlIlIlIlI) {
        return lllllllllllllIlIIlIIIlIIlIlIlIll < lllllllllllllIlIIlIIIlIIlIlIlIlI;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockBasePressurePlate.lIIIIlllIIIIll[1] != 0;
    }
    
    protected void updateState(final World lllllllllllllIlIIlIIIlIlIIIlIlll, final BlockPos lllllllllllllIlIIlIIIlIlIIIlIllI, IBlockState lllllllllllllIlIIlIIIlIlIIIlIlIl, final int lllllllllllllIlIIlIIIlIlIIIlIlII) {
        final int lllllllllllllIlIIlIIIlIlIIIllIll = this.computeRedstoneStrength(lllllllllllllIlIIlIIIlIlIIIlIlll, lllllllllllllIlIIlIIIlIlIIIlIllI);
        int n;
        if (lIllllIIIlIIlll(lllllllllllllIlIIlIIIlIlIIIlIlII)) {
            n = BlockBasePressurePlate.lIIIIlllIIIIll[0];
            "".length();
            if (((127 + 17 - 38 + 114 ^ 107 + 69 + 9 + 14) & (113 + 80 - 167 + 114 ^ 124 + 89 - 160 + 98 ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            n = BlockBasePressurePlate.lIIIIlllIIIIll[1];
        }
        final boolean lllllllllllllIlIIlIIIlIlIIIllIlI = n != 0;
        int n2;
        if (lIllllIIIlIIlll(lllllllllllllIlIIlIIIlIlIIIllIll)) {
            n2 = BlockBasePressurePlate.lIIIIlllIIIIll[0];
            "".length();
            if (-" ".length() > -" ".length()) {
                return;
            }
        }
        else {
            n2 = BlockBasePressurePlate.lIIIIlllIIIIll[1];
        }
        final boolean lllllllllllllIlIIlIIIlIlIIIllIIl = n2 != 0;
        if (lIllllIIIlIlIlI(lllllllllllllIlIIlIIIlIlIIIlIlII, lllllllllllllIlIIlIIIlIlIIIllIll)) {
            lllllllllllllIlIIlIIIlIlIIIlIlIl = this.setRedstoneStrength(lllllllllllllIlIIlIIIlIlIIIlIlIl, lllllllllllllIlIIlIIIlIlIIIllIll);
            lllllllllllllIlIIlIIIlIlIIIlIlll.setBlockState(lllllllllllllIlIIlIIIlIlIIIlIllI, lllllllllllllIlIIlIIIlIlIIIlIlIl, BlockBasePressurePlate.lIIIIlllIIIIll[3]);
            "".length();
            this.updateNeighbors(lllllllllllllIlIIlIIIlIlIIIlIlll, lllllllllllllIlIIlIIIlIlIIIlIllI);
            lllllllllllllIlIIlIIIlIlIIIlIlll.markBlockRangeForRenderUpdate(lllllllllllllIlIIlIIIlIlIIIlIllI, lllllllllllllIlIIlIIIlIlIIIlIllI);
        }
        if (lIllllIIIlIlIIl(lllllllllllllIlIIlIIIlIlIIIllIIl ? 1 : 0) && lIllllIIIlIlIII(lllllllllllllIlIIlIIIlIlIIIllIlI ? 1 : 0)) {
            lllllllllllllIlIIlIIIlIlIIIlIlll.playSoundEffect(lllllllllllllIlIIlIIIlIlIIIlIllI.getX() + 0.5, lllllllllllllIlIIlIIIlIlIIIlIllI.getY() + 0.1, lllllllllllllIlIIlIIIlIlIIIlIllI.getZ() + 0.5, BlockBasePressurePlate.lIIIIlllIIIIlI[BlockBasePressurePlate.lIIIIlllIIIIll[1]], 0.3f, 0.5f);
            "".length();
            if (-"  ".length() > 0) {
                return;
            }
        }
        else if (lIllllIIIlIlIII(lllllllllllllIlIIlIIIlIlIIIllIIl ? 1 : 0) && lIllllIIIlIlIIl(lllllllllllllIlIIlIIIlIlIIIllIlI ? 1 : 0)) {
            lllllllllllllIlIIlIIIlIlIIIlIlll.playSoundEffect(lllllllllllllIlIIlIIIlIlIIIlIllI.getX() + 0.5, lllllllllllllIlIIlIIIlIlIIIlIllI.getY() + 0.1, lllllllllllllIlIIlIIIlIlIIIlIllI.getZ() + 0.5, BlockBasePressurePlate.lIIIIlllIIIIlI[BlockBasePressurePlate.lIIIIlllIIIIll[0]], 0.3f, 0.6f);
        }
        if (lIllllIIIlIlIII(lllllllllllllIlIIlIIIlIlIIIllIIl ? 1 : 0)) {
            lllllllllllllIlIIlIIIlIlIIIlIlll.scheduleUpdate(lllllllllllllIlIIlIIIlIlIIIlIllI, this, this.tickRate(lllllllllllllIlIIlIIIlIlIIIlIlll));
        }
    }
    
    private static boolean lIllllIIIlIlIII(final int lllllllllllllIlIIlIIIlIIlIlIIlII) {
        return lllllllllllllIlIIlIIIlIIlIlIIlII != 0;
    }
    
    @Override
    public void onEntityCollidedWithBlock(final World lllllllllllllIlIIlIIIlIlIIllIIlI, final BlockPos lllllllllllllIlIIlIIIlIlIIlIlIll, final IBlockState lllllllllllllIlIIlIIIlIlIIlIlIlI, final Entity lllllllllllllIlIIlIIIlIlIIlIllll) {
        if (lIllllIIIlIlIIl(lllllllllllllIlIIlIIIlIlIIllIIlI.isRemote ? 1 : 0)) {
            final int lllllllllllllIlIIlIIIlIlIIlIlllI = this.getRedstoneStrength(lllllllllllllIlIIlIIIlIlIIlIlIlI);
            if (lIllllIIIlIlIIl(lllllllllllllIlIIlIIIlIlIIlIlllI)) {
                this.updateState(lllllllllllllIlIIlIIIlIlIIllIIlI, lllllllllllllIlIIlIIIlIlIIlIlIll, lllllllllllllIlIIlIIIlIlIIlIlIlI, lllllllllllllIlIIlIIIlIlIIlIlllI);
            }
        }
    }
    
    private static boolean lIllllIIIlIlIll(final Object lllllllllllllIlIIlIIIlIIlIlIIlll, final Object lllllllllllllIlIIlIIIlIIlIlIIllI) {
        return lllllllllllllIlIIlIIIlIIlIlIIlll == lllllllllllllIlIIlIIIlIIlIlIIllI;
    }
    
    @Override
    public void setBlockBoundsForItemRender() {
        final float lllllllllllllIlIIlIIIlIIllIllIlI = 0.5f;
        final float lllllllllllllIlIIlIIIlIIllIllIIl = 0.125f;
        final float lllllllllllllIlIIlIIIlIIllIllIII = 0.5f;
        this.setBlockBounds(0.0f, 0.375f, 0.0f, 1.0f, 0.625f, 1.0f);
    }
}
