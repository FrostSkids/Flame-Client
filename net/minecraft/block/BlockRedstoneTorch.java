// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.common.collect.Maps;
import net.minecraft.world.IBlockAccess;
import com.google.common.collect.Lists;
import net.minecraft.item.Item;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.creativetab.CreativeTabs;
import java.util.List;
import net.minecraft.world.World;
import java.util.Map;

public class BlockRedstoneTorch extends BlockTorch
{
    private static final /* synthetic */ String[] lIIIIIlIlIIIIl;
    private static final /* synthetic */ int[] lIIIIIlIlIIIlI;
    private static /* synthetic */ Map<World, List<Toggle>> toggles;
    private final /* synthetic */ boolean isOn;
    
    protected BlockRedstoneTorch(final boolean lllllllllllllIlIIllllIIIlIIIIlII) {
        this.isOn = lllllllllllllIlIIllllIIIlIIIIlII;
        this.setTickRandomly((boolean)(BlockRedstoneTorch.lIIIIIlIlIIIlI[2] != 0));
        "".length();
        this.setCreativeTab(null);
        "".length();
    }
    
    private static boolean lIllIllIIIIlIII(final int lllllllllllllIlIIlllIlllllIIIIll, final int lllllllllllllIlIIlllIlllllIIIIlI) {
        return lllllllllllllIlIIlllIlllllIIIIll == lllllllllllllIlIIlllIlllllIIIIlI;
    }
    
    @Override
    public void updateTick(final World lllllllllllllIlIIllllIIIIIlIIlIl, final BlockPos lllllllllllllIlIIllllIIIIIlIIlII, final IBlockState lllllllllllllIlIIllllIIIIIlIIIll, final Random lllllllllllllIlIIllllIIIIIlIllIl) {
        final boolean lllllllllllllIlIIllllIIIIIlIllII = this.shouldBeOff(lllllllllllllIlIIllllIIIIIlIIlIl, lllllllllllllIlIIllllIIIIIlIIlII, lllllllllllllIlIIllllIIIIIlIIIll);
        final List<Toggle> lllllllllllllIlIIllllIIIIIlIlIll = BlockRedstoneTorch.toggles.get(lllllllllllllIlIIllllIIIIIlIIlIl);
        "".length();
        if (-"   ".length() > 0) {
            return;
        }
        while (lIllIllIIIIIllI(lllllllllllllIlIIllllIIIIIlIlIll) && lIllIllIIIIIIIl(lllllllllllllIlIIllllIIIIIlIlIll.isEmpty() ? 1 : 0) && !lIllIllIIIIIlll(lIllIllIIIIIlIl(lllllllllllllIlIIllllIIIIIlIIlIl.getTotalWorldTime() - lllllllllllllIlIIllllIIIIIlIlIll.get(BlockRedstoneTorch.lIIIIIlIlIIIlI[0]).time, 60L))) {
            lllllllllllllIlIIllllIIIIIlIlIll.remove(BlockRedstoneTorch.lIIIIIlIlIIIlI[0]);
            "".length();
        }
        if (lIllIllIIIIIIlI(this.isOn ? 1 : 0)) {
            if (lIllIllIIIIIIlI(lllllllllllllIlIIllllIIIIIlIllII ? 1 : 0)) {
                lllllllllllllIlIIllllIIIIIlIIlIl.setBlockState(lllllllllllllIlIIllllIIIIIlIIlII, Blocks.unlit_redstone_torch.getDefaultState().withProperty((IProperty<Comparable>)BlockRedstoneTorch.FACING, (EnumFacing)lllllllllllllIlIIllllIIIIIlIIIll.getValue((IProperty<V>)BlockRedstoneTorch.FACING)), BlockRedstoneTorch.lIIIIIlIlIIIlI[5]);
                "".length();
                if (lIllIllIIIIIIlI(this.isBurnedOut(lllllllllllllIlIIllllIIIIIlIIlIl, lllllllllllllIlIIllllIIIIIlIIlII, (boolean)(BlockRedstoneTorch.lIIIIIlIlIIIlI[2] != 0)) ? 1 : 0)) {
                    lllllllllllllIlIIllllIIIIIlIIlIl.playSoundEffect(lllllllllllllIlIIllllIIIIIlIIlII.getX() + 0.5f, lllllllllllllIlIIllllIIIIIlIIlII.getY() + 0.5f, lllllllllllllIlIIllllIIIIIlIIlII.getZ() + 0.5f, BlockRedstoneTorch.lIIIIIlIlIIIIl[BlockRedstoneTorch.lIIIIIlIlIIIlI[0]], 0.5f, 2.6f + (lllllllllllllIlIIllllIIIIIlIIlIl.rand.nextFloat() - lllllllllllllIlIIllllIIIIIlIIlIl.rand.nextFloat()) * 0.8f);
                    int lllllllllllllIlIIllllIIIIIlIlIlI = BlockRedstoneTorch.lIIIIIlIlIIIlI[0];
                    "".length();
                    if (-" ".length() == " ".length()) {
                        return;
                    }
                    while (!lIllIllIIIIIIll(lllllllllllllIlIIllllIIIIIlIlIlI, BlockRedstoneTorch.lIIIIIlIlIIIlI[6])) {
                        final double lllllllllllllIlIIllllIIIIIlIlIIl = lllllllllllllIlIIllllIIIIIlIIlII.getX() + lllllllllllllIlIIllllIIIIIlIllIl.nextDouble() * 0.6 + 0.2;
                        final double lllllllllllllIlIIllllIIIIIlIlIII = lllllllllllllIlIIllllIIIIIlIIlII.getY() + lllllllllllllIlIIllllIIIIIlIllIl.nextDouble() * 0.6 + 0.2;
                        final double lllllllllllllIlIIllllIIIIIlIIlll = lllllllllllllIlIIllllIIIIIlIIlII.getZ() + lllllllllllllIlIIllllIIIIIlIllIl.nextDouble() * 0.6 + 0.2;
                        lllllllllllllIlIIllllIIIIIlIIlIl.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, lllllllllllllIlIIllllIIIIIlIlIIl, lllllllllllllIlIIllllIIIIIlIlIII, lllllllllllllIlIIllllIIIIIlIIlll, 0.0, 0.0, 0.0, new int[BlockRedstoneTorch.lIIIIIlIlIIIlI[0]]);
                        ++lllllllllllllIlIIllllIIIIIlIlIlI;
                    }
                    lllllllllllllIlIIllllIIIIIlIIlIl.scheduleUpdate(lllllllllllllIlIIllllIIIIIlIIlII, lllllllllllllIlIIllllIIIIIlIIlIl.getBlockState(lllllllllllllIlIIllllIIIIIlIIlII).getBlock(), BlockRedstoneTorch.lIIIIIlIlIIIlI[7]);
                    "".length();
                    if (" ".length() != " ".length()) {
                        return;
                    }
                }
            }
        }
        else if (lIllIllIIIIIIIl(lllllllllllllIlIIllllIIIIIlIllII ? 1 : 0) && lIllIllIIIIIIIl(this.isBurnedOut(lllllllllllllIlIIllllIIIIIlIIlIl, lllllllllllllIlIIllllIIIIIlIIlII, (boolean)(BlockRedstoneTorch.lIIIIIlIlIIIlI[0] != 0)) ? 1 : 0)) {
            lllllllllllllIlIIllllIIIIIlIIlIl.setBlockState(lllllllllllllIlIIllllIIIIIlIIlII, Blocks.redstone_torch.getDefaultState().withProperty((IProperty<Comparable>)BlockRedstoneTorch.FACING, (EnumFacing)lllllllllllllIlIIllllIIIIIlIIIll.getValue((IProperty<V>)BlockRedstoneTorch.FACING)), BlockRedstoneTorch.lIIIIIlIlIIIlI[5]);
            "".length();
        }
    }
    
    @Override
    public Item getItem(final World lllllllllllllIlIIlllIlllllIllIII, final BlockPos lllllllllllllIlIIlllIlllllIlIlll) {
        return Item.getItemFromBlock(Blocks.redstone_torch);
    }
    
    @Override
    public int tickRate(final World lllllllllllllIlIIllllIIIlIIIIIII) {
        return BlockRedstoneTorch.lIIIIIlIlIIIlI[3];
    }
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIlIIlllIllllllllllI, final Random lllllllllllllIlIIlllIlllllllllIl, final int lllllllllllllIlIIlllIlllllllllII) {
        return Item.getItemFromBlock(Blocks.redstone_torch);
    }
    
    private static int lIllIllIIIIIlIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public boolean canProvidePower() {
        return BlockRedstoneTorch.lIIIIIlIlIIIlI[2] != 0;
    }
    
    private boolean isBurnedOut(final World lllllllllllllIlIIllllIIIlIIIlllI, final BlockPos lllllllllllllIlIIllllIIIlIIlIlII, final boolean lllllllllllllIlIIllllIIIlIIIllII) {
        if (lIllIllIIIIIIIl(BlockRedstoneTorch.toggles.containsKey(lllllllllllllIlIIllllIIIlIIIlllI) ? 1 : 0)) {
            BlockRedstoneTorch.toggles.put(lllllllllllllIlIIllllIIIlIIIlllI, Lists.newArrayList());
            "".length();
        }
        final List<Toggle> lllllllllllllIlIIllllIIIlIIlIIlI = BlockRedstoneTorch.toggles.get(lllllllllllllIlIIllllIIIlIIIlllI);
        if (lIllIllIIIIIIlI(lllllllllllllIlIIllllIIIlIIIllII ? 1 : 0)) {
            lllllllllllllIlIIllllIIIlIIlIIlI.add(new Toggle(lllllllllllllIlIIllllIIIlIIlIlII, lllllllllllllIlIIllllIIIlIIIlllI.getTotalWorldTime()));
            "".length();
        }
        int lllllllllllllIlIIllllIIIlIIlIIIl = BlockRedstoneTorch.lIIIIIlIlIIIlI[0];
        int lllllllllllllIlIIllllIIIlIIlIIII = BlockRedstoneTorch.lIIIIIlIlIIIlI[0];
        "".length();
        if (" ".length() == 0) {
            return ((0x11 ^ 0xC) & ~(0xA9 ^ 0xB4)) != 0x0;
        }
        while (!lIllIllIIIIIIll(lllllllllllllIlIIllllIIIlIIlIIII, lllllllllllllIlIIllllIIIlIIlIIlI.size())) {
            final Toggle lllllllllllllIlIIllllIIIlIIIllll = lllllllllllllIlIIllllIIIlIIlIIlI.get(lllllllllllllIlIIllllIIIlIIlIIII);
            if (lIllIllIIIIIIlI(lllllllllllllIlIIllllIIIlIIIllll.pos.equals(lllllllllllllIlIIllllIIIlIIlIlII) ? 1 : 0) && lIllIllIIIIIIll(++lllllllllllllIlIIllllIIIlIIlIIIl, BlockRedstoneTorch.lIIIIIlIlIIIlI[1])) {
                return BlockRedstoneTorch.lIIIIIlIlIIIlI[2] != 0;
            }
            ++lllllllllllllIlIIllllIIIlIIlIIII;
        }
        return BlockRedstoneTorch.lIIIIIlIlIIIlI[0] != 0;
    }
    
    @Override
    public int getWeakPower(final IBlockAccess lllllllllllllIlIIllllIIIIlIlIlIl, final BlockPos lllllllllllllIlIIllllIIIIlIlIlII, final IBlockState lllllllllllllIlIIllllIIIIlIlIIll, final EnumFacing lllllllllllllIlIIllllIIIIlIlIIlI) {
        int n;
        if (lIllIllIIIIIIlI(this.isOn ? 1 : 0) && lIllIllIIIIIlII(lllllllllllllIlIIllllIIIIlIlIIll.getValue((IProperty<Object>)BlockRedstoneTorch.FACING), lllllllllllllIlIIllllIIIIlIlIIlI)) {
            n = BlockRedstoneTorch.lIIIIIlIlIIIlI[4];
            "".length();
            if (null != null) {
                return (0xEA ^ 0xB2) & ~(0x45 ^ 0x1D);
            }
        }
        else {
            n = BlockRedstoneTorch.lIIIIIlIlIIIlI[0];
        }
        return n;
    }
    
    @Override
    public void randomTick(final World lllllllllllllIlIIllllIIIIlIIIIII, final BlockPos lllllllllllllIlIIllllIIIIIllllll, final IBlockState lllllllllllllIlIIllllIIIIIlllllI, final Random lllllllllllllIlIIllllIIIIIllllIl) {
    }
    
    private boolean shouldBeOff(final World lllllllllllllIlIIllllIIIIlIIIlIl, final BlockPos lllllllllllllIlIIllllIIIIlIIIlII, final IBlockState lllllllllllllIlIIllllIIIIlIIIIll) {
        final EnumFacing lllllllllllllIlIIllllIIIIlIIIllI = lllllllllllllIlIIllllIIIIlIIIIll.getValue((IProperty<EnumFacing>)BlockRedstoneTorch.FACING).getOpposite();
        return lllllllllllllIlIIllllIIIIlIIIlIl.isSidePowered(lllllllllllllIlIIllllIIIIlIIIlII.offset(lllllllllllllIlIIllllIIIIlIIIllI), lllllllllllllIlIIllllIIIIlIIIllI);
    }
    
    static {
        lIllIllIIIIIIII();
        lIllIlIllllllll();
        BlockRedstoneTorch.toggles = (Map<World, List<Toggle>>)Maps.newHashMap();
    }
    
    @Override
    public void randomDisplayTick(final World lllllllllllllIlIIlllIllllllIlllI, final BlockPos lllllllllllllIlIIlllIllllllIIIlI, final IBlockState lllllllllllllIlIIlllIllllllIIIIl, final Random lllllllllllllIlIIlllIllllllIlIll) {
        if (lIllIllIIIIIIlI(this.isOn ? 1 : 0)) {
            double lllllllllllllIlIIlllIllllllIlIlI = lllllllllllllIlIIlllIllllllIIIlI.getX() + 0.5 + (lllllllllllllIlIIlllIllllllIlIll.nextDouble() - 0.5) * 0.2;
            double lllllllllllllIlIIlllIllllllIlIIl = lllllllllllllIlIIlllIllllllIIIlI.getY() + 0.7 + (lllllllllllllIlIIlllIllllllIlIll.nextDouble() - 0.5) * 0.2;
            double lllllllllllllIlIIlllIllllllIlIII = lllllllllllllIlIIlllIllllllIIIlI.getZ() + 0.5 + (lllllllllllllIlIIlllIllllllIlIll.nextDouble() - 0.5) * 0.2;
            final EnumFacing lllllllllllllIlIIlllIllllllIIlll = lllllllllllllIlIIlllIllllllIIIIl.getValue((IProperty<EnumFacing>)BlockRedstoneTorch.FACING);
            if (lIllIllIIIIIIlI(lllllllllllllIlIIlllIllllllIIlll.getAxis().isHorizontal() ? 1 : 0)) {
                final EnumFacing lllllllllllllIlIIlllIllllllIIllI = lllllllllllllIlIIlllIllllllIIlll.getOpposite();
                final double lllllllllllllIlIIlllIllllllIIlIl = 0.27;
                lllllllllllllIlIIlllIllllllIlIlI += 0.27 * lllllllllllllIlIIlllIllllllIIllI.getFrontOffsetX();
                lllllllllllllIlIIlllIllllllIlIIl += 0.22;
                lllllllllllllIlIIlllIllllllIlIII += 0.27 * lllllllllllllIlIIlllIllllllIIllI.getFrontOffsetZ();
            }
            lllllllllllllIlIIlllIllllllIlllI.spawnParticle(EnumParticleTypes.REDSTONE, lllllllllllllIlIIlllIllllllIlIlI, lllllllllllllIlIIlllIllllllIlIIl, lllllllllllllIlIIlllIllllllIlIII, 0.0, 0.0, 0.0, new int[BlockRedstoneTorch.lIIIIIlIlIIIlI[0]]);
        }
    }
    
    @Override
    public void onBlockAdded(final World lllllllllllllIlIIllllIIIIlllIlll, final BlockPos lllllllllllllIlIIllllIIIIlllIllI, final IBlockState lllllllllllllIlIIllllIIIIlllIlIl) {
        if (lIllIllIIIIIIlI(this.isOn ? 1 : 0)) {
            final byte lllllllllllllIlIIllllIIIIllIllIl;
            final Exception lllllllllllllIlIIllllIIIIllIlllI = (Exception)((EnumFacing[])(Object)(lllllllllllllIlIIllllIIIIllIllIl = (byte)(Object)EnumFacing.values())).length;
            Exception lllllllllllllIlIIllllIIIIllIllll = (Exception)BlockRedstoneTorch.lIIIIIlIlIIIlI[0];
            "".length();
            if (((0x88 ^ 0xBD ^ (0x7F ^ 0x75)) & (0x66 ^ 0x23 ^ (0x75 ^ 0xF) ^ -" ".length())) != 0x0) {
                return;
            }
            while (!lIllIllIIIIIIll((int)lllllllllllllIlIIllllIIIIllIllll, (int)lllllllllllllIlIIllllIIIIllIlllI)) {
                final EnumFacing lllllllllllllIlIIllllIIIIlllIlII = lllllllllllllIlIIllllIIIIllIllIl[lllllllllllllIlIIllllIIIIllIllll];
                lllllllllllllIlIIllllIIIIlllIlll.notifyNeighborsOfStateChange(lllllllllllllIlIIllllIIIIlllIllI.offset(lllllllllllllIlIIllllIIIIlllIlII), this);
                ++lllllllllllllIlIIllllIIIIllIllll;
            }
        }
    }
    
    @Override
    public void breakBlock(final World lllllllllllllIlIIllllIIIIlIlllll, final BlockPos lllllllllllllIlIIllllIIIIlIllllI, final IBlockState lllllllllllllIlIIllllIIIIllIIIlI) {
        if (lIllIllIIIIIIlI(this.isOn ? 1 : 0)) {
            final boolean lllllllllllllIlIIllllIIIIlIllIlI;
            final byte lllllllllllllIlIIllllIIIIlIllIll = (byte)((EnumFacing[])(Object)(lllllllllllllIlIIllllIIIIlIllIlI = (boolean)(Object)EnumFacing.values())).length;
            char lllllllllllllIlIIllllIIIIlIlllII = (char)BlockRedstoneTorch.lIIIIIlIlIIIlI[0];
            "".length();
            if ((19 + 97 - 46 + 102 ^ 95 + 48 + 6 + 19) <= "  ".length()) {
                return;
            }
            while (!lIllIllIIIIIIll(lllllllllllllIlIIllllIIIIlIlllII, lllllllllllllIlIIllllIIIIlIllIll)) {
                final EnumFacing lllllllllllllIlIIllllIIIIllIIIIl = lllllllllllllIlIIllllIIIIlIllIlI[lllllllllllllIlIIllllIIIIlIlllII];
                lllllllllllllIlIIllllIIIIlIlllll.notifyNeighborsOfStateChange(lllllllllllllIlIIllllIIIIlIllllI.offset(lllllllllllllIlIIllllIIIIllIIIIl), this);
                ++lllllllllllllIlIIllllIIIIlIlllII;
            }
        }
    }
    
    private static boolean lIllIllIIIIIIlI(final int lllllllllllllIlIIlllIllllIllIIlI) {
        return lllllllllllllIlIIlllIllllIllIIlI != 0;
    }
    
    private static boolean lIllIllIIIIIIIl(final int lllllllllllllIlIIlllIllllIllIIII) {
        return lllllllllllllIlIIlllIllllIllIIII == 0;
    }
    
    @Override
    public int getStrongPower(final IBlockAccess lllllllllllllIlIIllllIIIIIIIlIII, final BlockPos lllllllllllllIlIIllllIIIIIIIIIlI, final IBlockState lllllllllllllIlIIllllIIIIIIIIllI, final EnumFacing lllllllllllllIlIIllllIIIIIIIIlIl) {
        int weakPower;
        if (lIllIllIIIIlIIl(lllllllllllllIlIIllllIIIIIIIIlIl, EnumFacing.DOWN)) {
            weakPower = this.getWeakPower(lllllllllllllIlIIllllIIIIIIIlIII, lllllllllllllIlIIllllIIIIIIIIIlI, lllllllllllllIlIIllllIIIIIIIIllI, lllllllllllllIlIIllllIIIIIIIIlIl);
            "".length();
            if (null != null) {
                return (0xBC ^ 0x82 ^ (0xDC ^ 0xC6)) & (0x1 ^ 0x53 ^ (0xD7 ^ 0xA1) ^ -" ".length());
            }
        }
        else {
            weakPower = BlockRedstoneTorch.lIIIIIlIlIIIlI[0];
        }
        return weakPower;
    }
    
    @Override
    public boolean isAssociatedBlock(final Block lllllllllllllIlIIlllIlllllIlIIll) {
        if (lIllIllIIIIIlII(lllllllllllllIlIIlllIlllllIlIIll, Blocks.unlit_redstone_torch) && lIllIllIIIIIlII(lllllllllllllIlIIlllIlllllIlIIll, Blocks.redstone_torch)) {
            return BlockRedstoneTorch.lIIIIIlIlIIIlI[0] != 0;
        }
        return BlockRedstoneTorch.lIIIIIlIlIIIlI[2] != 0;
    }
    
    private static void lIllIlIllllllll() {
        (lIIIIIlIlIIIIl = new String[BlockRedstoneTorch.lIIIIIlIlIIIlI[2]])[BlockRedstoneTorch.lIIIIIlIlIIIlI[0]] = lIllIlIlllllllI("eMo507pTqcLjeWcrnwbpwQ==", "wTewi");
    }
    
    @Override
    public void onNeighborBlockChange(final World lllllllllllllIlIIllllIIIIIIlIIIl, final BlockPos lllllllllllllIlIIllllIIIIIIlIIII, final IBlockState lllllllllllllIlIIllllIIIIIIIllll, final Block lllllllllllllIlIIllllIIIIIIlIIll) {
        if (lIllIllIIIIIIIl(this.onNeighborChangeInternal(lllllllllllllIlIIllllIIIIIIlIIIl, lllllllllllllIlIIllllIIIIIIlIIII, lllllllllllllIlIIllllIIIIIIIllll) ? 1 : 0) && lIllIllIIIIlIII(this.isOn ? 1 : 0, this.shouldBeOff(lllllllllllllIlIIllllIIIIIIlIIIl, lllllllllllllIlIIllllIIIIIIlIIII, lllllllllllllIlIIllllIIIIIIIllll) ? 1 : 0)) {
            lllllllllllllIlIIllllIIIIIIlIIIl.scheduleUpdate(lllllllllllllIlIIllllIIIIIIlIIII, this, this.tickRate(lllllllllllllIlIIllllIIIIIIlIIIl));
        }
    }
    
    private static String lIllIlIlllllllI(final String lllllllllllllIlIIlllIlllllIIlIll, final String lllllllllllllIlIIlllIlllllIIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIlllIlllllIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlllIlllllIIlIlI.getBytes(StandardCharsets.UTF_8)), BlockRedstoneTorch.lIIIIIlIlIIIlI[1]), "DES");
            final Cipher lllllllllllllIlIIlllIlllllIIllIl = Cipher.getInstance("DES");
            lllllllllllllIlIIlllIlllllIIllIl.init(BlockRedstoneTorch.lIIIIIlIlIIIlI[3], lllllllllllllIlIIlllIlllllIIlllI);
            return new String(lllllllllllllIlIIlllIlllllIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlllIlllllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlllIlllllIIllII) {
            lllllllllllllIlIIlllIlllllIIllII.printStackTrace();
            return null;
        }
    }
    
    private static void lIllIllIIIIIIII() {
        (lIIIIIlIlIIIlI = new int[8])[0] = ((0xF7 ^ 0xC1 ^ (0x16 ^ 0xA)) & (145 + 111 - 146 + 39 ^ 96 + 22 + 20 + 53 ^ -" ".length()));
        BlockRedstoneTorch.lIIIIIlIlIIIlI[1] = (0x19 ^ 0x11);
        BlockRedstoneTorch.lIIIIIlIlIIIlI[2] = " ".length();
        BlockRedstoneTorch.lIIIIIlIlIIIlI[3] = "  ".length();
        BlockRedstoneTorch.lIIIIIlIlIIIlI[4] = (17 + 120 - 24 + 32 ^ 42 + 96 - 22 + 42);
        BlockRedstoneTorch.lIIIIIlIlIIIlI[5] = "   ".length();
        BlockRedstoneTorch.lIIIIIlIlIIIlI[6] = (0x70 ^ 0x79 ^ (0x23 ^ 0x2F));
        BlockRedstoneTorch.lIIIIIlIlIIIlI[7] = 141 + 29 - 64 + 54;
    }
    
    private static boolean lIllIllIIIIIllI(final Object lllllllllllllIlIIlllIllllIlllIII) {
        return lllllllllllllIlIIlllIllllIlllIII != null;
    }
    
    private static boolean lIllIllIIIIIlll(final int lllllllllllllIlIIlllIllllIlIlllI) {
        return lllllllllllllIlIIlllIllllIlIlllI <= 0;
    }
    
    private static boolean lIllIllIIIIlIIl(final Object lllllllllllllIlIIlllIllllIllIlIl, final Object lllllllllllllIlIIlllIllllIllIlII) {
        return lllllllllllllIlIIlllIllllIllIlIl == lllllllllllllIlIIlllIllllIllIlII;
    }
    
    private static boolean lIllIllIIIIIlII(final Object lllllllllllllIlIIlllIllllIlllIll, final Object lllllllllllllIlIIlllIllllIlllIlI) {
        return lllllllllllllIlIIlllIllllIlllIll != lllllllllllllIlIIlllIllllIlllIlI;
    }
    
    private static boolean lIllIllIIIIIIll(final int lllllllllllllIlIIlllIllllIllllll, final int lllllllllllllIlIIlllIllllIlllllI) {
        return lllllllllllllIlIIlllIllllIllllll >= lllllllllllllIlIIlllIllllIlllllI;
    }
    
    static class Toggle
    {
        /* synthetic */ BlockPos pos;
        /* synthetic */ long time;
        
        public Toggle(final BlockPos lllllllllllllIIIlllIlllIlIllIlll, final long lllllllllllllIIIlllIlllIlIlllIIl) {
            this.pos = lllllllllllllIIIlllIlllIlIllIlll;
            this.time = lllllllllllllIIIlllIlllIlIlllIIl;
        }
    }
}
