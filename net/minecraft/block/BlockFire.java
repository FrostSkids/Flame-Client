// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.block.state.BlockState;
import net.minecraft.world.WorldProviderEnd;
import com.google.common.collect.Maps;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.World;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import java.util.Random;
import net.minecraft.block.properties.PropertyInteger;
import java.util.Map;
import net.minecraft.block.properties.PropertyBool;

public class BlockFire extends Block
{
    private static final /* synthetic */ String[] lIlIllllIIIIlI;
    public static final /* synthetic */ PropertyBool WEST;
    private final /* synthetic */ Map<Block, Integer> flammabilities;
    public static final /* synthetic */ PropertyBool EAST;
    public static final /* synthetic */ PropertyBool ALT;
    private final /* synthetic */ Map<Block, Integer> encouragements;
    private static final /* synthetic */ int[] lIlIllllIIIlIl;
    public static final /* synthetic */ PropertyBool SOUTH;
    public static final /* synthetic */ PropertyInteger AGE;
    public static final /* synthetic */ PropertyBool FLIP;
    public static final /* synthetic */ PropertyInteger UPPER;
    public static final /* synthetic */ PropertyBool NORTH;
    
    private static boolean llllIlIIlIIIIll(final Object lllllllllllllIIIIlIlIIlIlIlllIll, final Object lllllllllllllIIIIlIlIIlIlIlllIlI) {
        return lllllllllllllIIIIlIlIIlIlIlllIll == lllllllllllllIIIIlIlIIlIlIlllIlI;
    }
    
    @Override
    public int quantityDropped(final Random lllllllllllllIIIIlIlIIlllllllIll) {
        return BlockFire.lIlIllllIIIlIl[0];
    }
    
    public boolean canCatchFire(final IBlockAccess lllllllllllllIIIIlIlIIllIllIIIIl, final BlockPos lllllllllllllIIIIlIlIIllIllIIIII) {
        if (llllIlIIlIIIllI(this.getEncouragement(lllllllllllllIIIIlIlIIllIllIIIIl.getBlockState(lllllllllllllIIIIlIlIIllIllIIIII).getBlock()))) {
            return BlockFire.lIlIllllIIIlIl[2] != 0;
        }
        return BlockFire.lIlIllllIIIlIl[0] != 0;
    }
    
    private static String llllIlIIIlIllll(final String lllllllllllllIIIIlIlIIlIlllIIIlI, final String lllllllllllllIIIIlIlIIlIlllIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIlIIlIlllIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIlIIlIlllIIIIl.getBytes(StandardCharsets.UTF_8)), BlockFire.lIlIllllIIIlIl[13]), "DES");
            final Cipher lllllllllllllIIIIlIlIIlIlllIIllI = Cipher.getInstance("DES");
            lllllllllllllIIIIlIlIIlIlllIIllI.init(BlockFire.lIlIllllIIIlIl[3], lllllllllllllIIIIlIlIIlIlllIIlll);
            return new String(lllllllllllllIIIIlIlIIlIlllIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIlIIlIlllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIlIIlIlllIIlIl) {
            lllllllllllllIIIIlIlIIlIlllIIlIl.printStackTrace();
            return null;
        }
    }
    
    protected boolean canDie(final World lllllllllllllIIIIlIlIIlllIllllll, final BlockPos lllllllllllllIIIIlIlIIlllIlllllI) {
        if (llllIlIIlIIIIII(lllllllllllllIIIIlIlIIlllIllllll.canLightningStrike(lllllllllllllIIIIlIlIIlllIlllllI) ? 1 : 0) && llllIlIIlIIIIII(lllllllllllllIIIIlIlIIlllIllllll.canLightningStrike(lllllllllllllIIIIlIlIIlllIlllllI.west()) ? 1 : 0) && llllIlIIlIIIIII(lllllllllllllIIIIlIlIIlllIllllll.canLightningStrike(lllllllllllllIIIIlIlIIlllIlllllI.east()) ? 1 : 0) && llllIlIIlIIIIII(lllllllllllllIIIIlIlIIlllIllllll.canLightningStrike(lllllllllllllIIIIlIlIIlllIlllllI.north()) ? 1 : 0) && llllIlIIlIIIIII(lllllllllllllIIIIlIlIIlllIllllll.canLightningStrike(lllllllllllllIIIIlIlIIlllIlllllI.south()) ? 1 : 0)) {
            return BlockFire.lIlIllllIIIlIl[0] != 0;
        }
        return BlockFire.lIlIllllIIIlIl[2] != 0;
    }
    
    @Override
    public void onBlockAdded(final World lllllllllllllIIIIlIlIIllIlIIIIII, final BlockPos lllllllllllllIIIIlIlIIllIIllllll, final IBlockState lllllllllllllIIIIlIlIIllIlIIIIlI) {
        if (!llllIlIIlIIlIlI(lllllllllllllIIIIlIlIIllIlIIIIII.provider.getDimensionId()) || llllIlIIlIIIIII(Blocks.portal.func_176548_d(lllllllllllllIIIIlIlIIllIlIIIIII, lllllllllllllIIIIlIlIIllIIllllll) ? 1 : 0)) {
            if (llllIlIIlIIIIII(World.doesBlockHaveSolidTopSurface(lllllllllllllIIIIlIlIIllIlIIIIII, lllllllllllllIIIIlIlIIllIIllllll.down()) ? 1 : 0) && llllIlIIlIIIIII(this.canNeighborCatchFire(lllllllllllllIIIIlIlIIllIlIIIIII, lllllllllllllIIIIlIlIIllIIllllll) ? 1 : 0)) {
                lllllllllllllIIIIlIlIIllIlIIIIII.setBlockToAir(lllllllllllllIIIIlIlIIllIIllllll);
                "".length();
                "".length();
                if ("  ".length() != "  ".length()) {
                    return;
                }
            }
            else {
                lllllllllllllIIIIlIlIIllIlIIIIII.scheduleUpdate(lllllllllllllIIIIlIlIIllIIllllll, this, this.tickRate(lllllllllllllIIIIlIlIIllIlIIIIII) + lllllllllllllIIIIlIlIIllIlIIIIII.rand.nextInt(BlockFire.lIlIllllIIIlIl[14]));
            }
        }
    }
    
    @Override
    public boolean requiresUpdates() {
        return BlockFire.lIlIllllIIIlIl[0] != 0;
    }
    
    @Override
    public IBlockState getActualState(final IBlockState lllllllllllllIIIIlIlIlIIIIIllIlI, final IBlockAccess lllllllllllllIIIIlIlIlIIIIIllIIl, final BlockPos lllllllllllllIIIIlIlIlIIIIlIIIlI) {
        final int lllllllllllllIIIIlIlIlIIIIlIIIIl = lllllllllllllIIIIlIlIlIIIIlIIIlI.getX();
        final int lllllllllllllIIIIlIlIlIIIIlIIIII = lllllllllllllIIIIlIlIlIIIIlIIIlI.getY();
        final int lllllllllllllIIIIlIlIlIIIIIlllll = lllllllllllllIIIIlIlIlIIIIlIIIlI.getZ();
        if (llllIlIIlIIIIII(World.doesBlockHaveSolidTopSurface(lllllllllllllIIIIlIlIlIIIIIllIIl, lllllllllllllIIIIlIlIlIIIIlIIIlI.down()) ? 1 : 0) && llllIlIIlIIIIII(Blocks.fire.canCatchFire(lllllllllllllIIIIlIlIlIIIIIllIIl, lllllllllllllIIIIlIlIlIIIIlIIIlI.down()) ? 1 : 0)) {
            int n;
            if (llllIlIIlIIIIIl(lllllllllllllIIIIlIlIlIIIIlIIIIl + lllllllllllllIIIIlIlIlIIIIlIIIII + lllllllllllllIIIIlIlIlIIIIIlllll & BlockFire.lIlIllllIIIlIl[2], BlockFire.lIlIllllIIIlIl[2])) {
                n = BlockFire.lIlIllllIIIlIl[2];
                "".length();
                if (-" ".length() >= "  ".length()) {
                    return null;
                }
            }
            else {
                n = BlockFire.lIlIllllIIIlIl[0];
            }
            final boolean lllllllllllllIIIIlIlIlIIIIIllllI = n != 0;
            int n2;
            if (llllIlIIlIIIIIl(lllllllllllllIIIIlIlIlIIIIlIIIIl / BlockFire.lIlIllllIIIlIl[3] + lllllllllllllIIIIlIlIlIIIIlIIIII / BlockFire.lIlIllllIIIlIl[3] + lllllllllllllIIIIlIlIlIIIIIlllll / BlockFire.lIlIllllIIIlIl[3] & BlockFire.lIlIllllIIIlIl[2], BlockFire.lIlIllllIIIlIl[2])) {
                n2 = BlockFire.lIlIllllIIIlIl[2];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                n2 = BlockFire.lIlIllllIIIlIl[0];
            }
            final boolean lllllllllllllIIIIlIlIlIIIIIlllIl = n2 != 0;
            int lllllllllllllIIIIlIlIlIIIIIlllII = BlockFire.lIlIllllIIIlIl[0];
            if (llllIlIIlIIIIlI(this.canCatchFire(lllllllllllllIIIIlIlIlIIIIIllIIl, lllllllllllllIIIIlIlIlIIIIlIIIlI.up()) ? 1 : 0)) {
                int n3;
                if (llllIlIIlIIIIlI(lllllllllllllIIIIlIlIlIIIIIllllI ? 1 : 0)) {
                    n3 = BlockFire.lIlIllllIIIlIl[2];
                    "".length();
                    if (((0xF6 ^ 0x95) & ~(0x4E ^ 0x2D)) != 0x0) {
                        return null;
                    }
                }
                else {
                    n3 = BlockFire.lIlIllllIIIlIl[3];
                }
                lllllllllllllIIIIlIlIlIIIIIlllII = n3;
            }
            return lllllllllllllIIIIlIlIlIIIIIllIlI.withProperty((IProperty<Comparable>)BlockFire.NORTH, this.canCatchFire(lllllllllllllIIIIlIlIlIIIIIllIIl, lllllllllllllIIIIlIlIlIIIIlIIIlI.north())).withProperty((IProperty<Comparable>)BlockFire.EAST, this.canCatchFire(lllllllllllllIIIIlIlIlIIIIIllIIl, lllllllllllllIIIIlIlIlIIIIlIIIlI.east())).withProperty((IProperty<Comparable>)BlockFire.SOUTH, this.canCatchFire(lllllllllllllIIIIlIlIlIIIIIllIIl, lllllllllllllIIIIlIlIlIIIIlIIIlI.south())).withProperty((IProperty<Comparable>)BlockFire.WEST, this.canCatchFire(lllllllllllllIIIIlIlIlIIIIIllIIl, lllllllllllllIIIIlIlIlIIIIlIIIlI.west())).withProperty((IProperty<Comparable>)BlockFire.UPPER, lllllllllllllIIIIlIlIlIIIIIlllII).withProperty((IProperty<Comparable>)BlockFire.FLIP, lllllllllllllIIIIlIlIlIIIIIlllIl).withProperty((IProperty<Comparable>)BlockFire.ALT, lllllllllllllIIIIlIlIlIIIIIllllI);
        }
        return this.getDefaultState();
    }
    
    @Override
    public MapColor getMapColor(final IBlockState lllllllllllllIIIIlIlIIllIIIlIIlI) {
        return MapColor.tntColor;
    }
    
    private static boolean llllIlIIlIIlIII(final Object lllllllllllllIIIIlIlIIlIlIlllIII) {
        return lllllllllllllIIIIlIlIIlIlIlllIII == null;
    }
    
    private static void llllIlIIIllIlII() {
        (lIlIllllIIIIlI = new String[BlockFire.lIlIllllIIIlIl[14]])[BlockFire.lIlIllllIIIlIl[0]] = llllIlIIIlIlllI("WhANkjmyS+E=", "ltOoP");
        BlockFire.lIlIllllIIIIlI[BlockFire.lIlIllllIIIlIl[2]] = llllIlIIIlIllll("IGZwEYbNucQ=", "KXHzt");
        BlockFire.lIlIllllIIIIlI[BlockFire.lIlIllllIIIlIl[3]] = llllIlIIIlIlllI("D405TPuRl3I=", "eYaBL");
        BlockFire.lIlIllllIIIIlI[BlockFire.lIlIllllIIIlIl[4]] = llllIlIIIlIllll("bRQTv/eXm9w=", "PajxV");
        BlockFire.lIlIllllIIIIlI[BlockFire.lIlIllllIIIlIl[5]] = llllIlIIIlIlllI("FkVcz6ZMTC0=", "DNoXE");
        BlockFire.lIlIllllIIIIlI[BlockFire.lIlIllllIIIlIl[6]] = llllIlIIIlIllll("GP/i/fI4GLw=", "EWmWC");
        BlockFire.lIlIllllIIIIlI[BlockFire.lIlIllllIIIlIl[7]] = llllIlIIIlIllll("wDBE53e1r9I=", "IDWpU");
        BlockFire.lIlIllllIIIIlI[BlockFire.lIlIllllIIIlIl[8]] = llllIlIIIlIlllI("cd8TB0xFUEk=", "VtmRP");
        BlockFire.lIlIllllIIIIlI[BlockFire.lIlIllllIIIlIl[13]] = llllIlIIIllIIll("BTsUDxsEADsFAg==", "aTRfi");
        BlockFire.lIlIllllIIIIlI[BlockFire.lIlIllllIIIlIl[21]] = llllIlIIIllIIll("ADw2L2YAPDYv", "fUDJH");
    }
    
    public void setFireInfo(final Block lllllllllllllIIIIlIlIlIIIIIIlIIl, final int lllllllllllllIIIIlIlIlIIIIIIlIII, final int lllllllllllllIIIIlIlIlIIIIIIIIll) {
        this.encouragements.put(lllllllllllllIIIIlIlIlIIIIIIlIIl, lllllllllllllIIIIlIlIlIIIIIIlIII);
        "".length();
        this.flammabilities.put(lllllllllllllIIIIlIlIlIIIIIIlIIl, lllllllllllllIIIIlIlIlIIIIIIIIll);
        "".length();
    }
    
    private int getFlammability(final Block lllllllllllllIIIIlIlIIlllIllIllI) {
        final Integer lllllllllllllIIIIlIlIIlllIllIlIl = this.flammabilities.get(lllllllllllllIIIIlIlIIlllIllIllI);
        int intValue;
        if (llllIlIIlIIlIII(lllllllllllllIIIIlIlIIlllIllIlIl)) {
            intValue = BlockFire.lIlIllllIIIlIl[0];
            "".length();
            if ("  ".length() < " ".length()) {
                return (0x41 ^ 0x67) & ~(0x80 ^ 0xA6);
            }
        }
        else {
            intValue = lllllllllllllIIIIlIlIIlllIllIlIl;
        }
        return intValue;
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT;
    }
    
    protected BlockFire() {
        super(Material.fire);
        this.encouragements = (Map<Block, Integer>)Maps.newIdentityHashMap();
        this.flammabilities = (Map<Block, Integer>)Maps.newIdentityHashMap();
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockFire.AGE, BlockFire.lIlIllllIIIlIl[0]).withProperty((IProperty<Comparable>)BlockFire.FLIP, (boolean)(BlockFire.lIlIllllIIIlIl[0] != 0)).withProperty((IProperty<Comparable>)BlockFire.ALT, (boolean)(BlockFire.lIlIllllIIIlIl[0] != 0)).withProperty((IProperty<Comparable>)BlockFire.NORTH, (boolean)(BlockFire.lIlIllllIIIlIl[0] != 0)).withProperty((IProperty<Comparable>)BlockFire.EAST, (boolean)(BlockFire.lIlIllllIIIlIl[0] != 0)).withProperty((IProperty<Comparable>)BlockFire.SOUTH, (boolean)(BlockFire.lIlIllllIIIlIl[0] != 0)).withProperty((IProperty<Comparable>)BlockFire.WEST, (boolean)(BlockFire.lIlIllllIIIlIl[0] != 0)).withProperty((IProperty<Comparable>)BlockFire.UPPER, BlockFire.lIlIllllIIIlIl[0]));
        this.setTickRandomly((boolean)(BlockFire.lIlIllllIIIlIl[2] != 0));
        "".length();
    }
    
    @Override
    public void updateTick(final World lllllllllllllIIIIlIlIIlllllIIlIl, final BlockPos lllllllllllllIIIIlIlIIlllllIIlII, IBlockState lllllllllllllIIIIlIlIIllllIlIIIl, final Random lllllllllllllIIIIlIlIIlllllIIIlI) {
        if (llllIlIIlIIIIlI(lllllllllllllIIIIlIlIIlllllIIlIl.getGameRules().getBoolean(BlockFire.lIlIllllIIIIlI[BlockFire.lIlIllllIIIlIl[13]]) ? 1 : 0)) {
            if (llllIlIIlIIIIII(this.canPlaceBlockAt(lllllllllllllIIIIlIlIIlllllIIlIl, lllllllllllllIIIIlIlIIlllllIIlII) ? 1 : 0)) {
                lllllllllllllIIIIlIlIIlllllIIlIl.setBlockToAir(lllllllllllllIIIIlIlIIlllllIIlII);
                "".length();
            }
            final Block lllllllllllllIIIIlIlIIlllllIIIIl = lllllllllllllIIIIlIlIIlllllIIlIl.getBlockState(lllllllllllllIIIIlIlIIlllllIIlII.down()).getBlock();
            int n;
            if (llllIlIIlIIIIll(lllllllllllllIIIIlIlIIlllllIIIIl, Blocks.netherrack)) {
                n = BlockFire.lIlIllllIIIlIl[2];
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            else {
                n = BlockFire.lIlIllllIIIlIl[0];
            }
            boolean lllllllllllllIIIIlIlIIlllllIIIII = n != 0;
            if (llllIlIIlIIIIlI((lllllllllllllIIIIlIlIIlllllIIlIl.provider instanceof WorldProviderEnd) ? 1 : 0) && llllIlIIlIIIIll(lllllllllllllIIIIlIlIIlllllIIIIl, Blocks.bedrock)) {
                lllllllllllllIIIIlIlIIlllllIIIII = (BlockFire.lIlIllllIIIlIl[2] != 0);
            }
            if (llllIlIIlIIIIII(lllllllllllllIIIIlIlIIlllllIIIII ? 1 : 0) && llllIlIIlIIIIlI(lllllllllllllIIIIlIlIIlllllIIlIl.isRaining() ? 1 : 0) && llllIlIIlIIIIlI(this.canDie(lllllllllllllIIIIlIlIIlllllIIlIl, lllllllllllllIIIIlIlIIlllllIIlII) ? 1 : 0)) {
                lllllllllllllIIIIlIlIIlllllIIlIl.setBlockToAir(lllllllllllllIIIIlIlIIlllllIIlII);
                "".length();
                "".length();
                if (((0x7E ^ 0x26) & ~(0x99 ^ 0xC1)) < 0) {
                    return;
                }
            }
            else {
                final int lllllllllllllIIIIlIlIIllllIlllll = ((IBlockState)lllllllllllllIIIIlIlIIllllIlIIIl).getValue((IProperty<Integer>)BlockFire.AGE);
                if (llllIlIIlIIIlII(lllllllllllllIIIIlIlIIllllIlllll, BlockFire.lIlIllllIIIlIl[1])) {
                    lllllllllllllIIIIlIlIIllllIlIIIl = ((IBlockState)lllllllllllllIIIIlIlIIllllIlIIIl).withProperty((IProperty<Comparable>)BlockFire.AGE, Integer.valueOf(lllllllllllllIIIIlIlIIllllIlllll + lllllllllllllIIIIlIlIIlllllIIIlI.nextInt(BlockFire.lIlIllllIIIlIl[4]) / BlockFire.lIlIllllIIIlIl[3]));
                    lllllllllllllIIIIlIlIIlllllIIlIl.setBlockState(lllllllllllllIIIIlIlIIlllllIIlII, (IBlockState)lllllllllllllIIIIlIlIIllllIlIIIl, BlockFire.lIlIllllIIIlIl[5]);
                    "".length();
                }
                lllllllllllllIIIIlIlIIlllllIIlIl.scheduleUpdate(lllllllllllllIIIIlIlIIlllllIIlII, this, this.tickRate(lllllllllllllIIIIlIlIIlllllIIlIl) + lllllllllllllIIIIlIlIIlllllIIIlI.nextInt(BlockFire.lIlIllllIIIlIl[14]));
                if (llllIlIIlIIIIII(lllllllllllllIIIIlIlIIlllllIIIII ? 1 : 0)) {
                    if (llllIlIIlIIIIII(this.canNeighborCatchFire(lllllllllllllIIIIlIlIIlllllIIlIl, lllllllllllllIIIIlIlIIlllllIIlII) ? 1 : 0)) {
                        if (!llllIlIIlIIIIlI(World.doesBlockHaveSolidTopSurface(lllllllllllllIIIIlIlIIlllllIIlIl, lllllllllllllIIIIlIlIIlllllIIlII.down()) ? 1 : 0) || llllIlIIlIIIlIl(lllllllllllllIIIIlIlIIllllIlllll, BlockFire.lIlIllllIIIlIl[4])) {
                            lllllllllllllIIIIlIlIIlllllIIlIl.setBlockToAir(lllllllllllllIIIIlIlIIlllllIIlII);
                            "".length();
                        }
                        return;
                    }
                    if (llllIlIIlIIIIII(this.canCatchFire(lllllllllllllIIIIlIlIIlllllIIlIl, lllllllllllllIIIIlIlIIlllllIIlII.down()) ? 1 : 0) && llllIlIIlIIIIIl(lllllllllllllIIIIlIlIIllllIlllll, BlockFire.lIlIllllIIIlIl[1]) && llllIlIIlIIIIII(lllllllllllllIIIIlIlIIlllllIIIlI.nextInt(BlockFire.lIlIllllIIIlIl[5]))) {
                        lllllllllllllIIIIlIlIIlllllIIlIl.setBlockToAir(lllllllllllllIIIIlIlIIlllllIIlII);
                        "".length();
                        return;
                    }
                }
                final boolean lllllllllllllIIIIlIlIIllllIllllI = lllllllllllllIIIIlIlIIlllllIIlIl.isBlockinHighHumidity(lllllllllllllIIIIlIlIIlllllIIlII);
                int lllllllllllllIIIIlIlIIllllIlllIl = BlockFire.lIlIllllIIIlIl[0];
                if (llllIlIIlIIIIlI(lllllllllllllIIIIlIlIIllllIllllI ? 1 : 0)) {
                    lllllllllllllIIIIlIlIIllllIlllIl = BlockFire.lIlIllllIIIlIl[15];
                }
                this.catchOnFire(lllllllllllllIIIIlIlIIlllllIIlIl, lllllllllllllIIIIlIlIIlllllIIlII.east(), BlockFire.lIlIllllIIIlIl[16] + lllllllllllllIIIIlIlIIllllIlllIl, lllllllllllllIIIIlIlIIlllllIIIlI, lllllllllllllIIIIlIlIIllllIlllll);
                this.catchOnFire(lllllllllllllIIIIlIlIIlllllIIlIl, lllllllllllllIIIIlIlIIlllllIIlII.west(), BlockFire.lIlIllllIIIlIl[16] + lllllllllllllIIIIlIlIIllllIlllIl, lllllllllllllIIIIlIlIIlllllIIIlI, lllllllllllllIIIIlIlIIllllIlllll);
                this.catchOnFire(lllllllllllllIIIIlIlIIlllllIIlIl, lllllllllllllIIIIlIlIIlllllIIlII.down(), BlockFire.lIlIllllIIIlIl[17] + lllllllllllllIIIIlIlIIllllIlllIl, lllllllllllllIIIIlIlIIlllllIIIlI, lllllllllllllIIIIlIlIIllllIlllll);
                this.catchOnFire(lllllllllllllIIIIlIlIIlllllIIlIl, lllllllllllllIIIIlIlIIlllllIIlII.up(), BlockFire.lIlIllllIIIlIl[17] + lllllllllllllIIIIlIlIIllllIlllIl, lllllllllllllIIIIlIlIIlllllIIIlI, lllllllllllllIIIIlIlIIllllIlllll);
                this.catchOnFire(lllllllllllllIIIIlIlIIlllllIIlIl, lllllllllllllIIIIlIlIIlllllIIlII.north(), BlockFire.lIlIllllIIIlIl[16] + lllllllllllllIIIIlIlIIllllIlllIl, lllllllllllllIIIIlIlIIlllllIIIlI, lllllllllllllIIIIlIlIIllllIlllll);
                this.catchOnFire(lllllllllllllIIIIlIlIIlllllIIlIl, lllllllllllllIIIIlIlIIlllllIIlII.south(), BlockFire.lIlIllllIIIlIl[16] + lllllllllllllIIIIlIlIIllllIlllIl, lllllllllllllIIIIlIlIIlllllIIIlI, lllllllllllllIIIIlIlIIllllIlllll);
                int lllllllllllllIIIIlIlIIllllIlllII = BlockFire.lIlIllllIIIlIl[18];
                "".length();
                if (null != null) {
                    return;
                }
                while (!llllIlIIlIIIlIl(lllllllllllllIIIIlIlIIllllIlllII, BlockFire.lIlIllllIIIlIl[2])) {
                    int lllllllllllllIIIIlIlIIllllIllIll = BlockFire.lIlIllllIIIlIl[18];
                    "".length();
                    if (((156 + 118 - 254 + 141 ^ 13 + 40 - 16 + 139) & (0x85 ^ 0x8D ^ (0x0 ^ 0x19) ^ -" ".length())) >= (0xA ^ 0x5B ^ (0x91 ^ 0xC4))) {
                        return;
                    }
                    while (!llllIlIIlIIIlIl(lllllllllllllIIIIlIlIIllllIllIll, BlockFire.lIlIllllIIIlIl[2])) {
                        int lllllllllllllIIIIlIlIIllllIllIlI = BlockFire.lIlIllllIIIlIl[18];
                        "".length();
                        if ("   ".length() <= " ".length()) {
                            return;
                        }
                        while (!llllIlIIlIIIlIl(lllllllllllllIIIIlIlIIllllIllIlI, BlockFire.lIlIllllIIIlIl[5])) {
                            if (!llllIlIIlIIIIII(lllllllllllllIIIIlIlIIllllIlllII) || !llllIlIIlIIIIII(lllllllllllllIIIIlIlIIllllIllIlI) || llllIlIIlIIIIlI(lllllllllllllIIIIlIlIIllllIllIll)) {
                                int lllllllllllllIIIIlIlIIllllIllIIl = BlockFire.lIlIllllIIIlIl[12];
                                if (llllIlIIlIIIlIl(lllllllllllllIIIIlIlIIllllIllIlI, BlockFire.lIlIllllIIIlIl[2])) {
                                    lllllllllllllIIIIlIlIIllllIllIIl += (lllllllllllllIIIIlIlIIllllIllIlI - BlockFire.lIlIllllIIIlIl[2]) * BlockFire.lIlIllllIIIlIl[12];
                                }
                                final BlockPos lllllllllllllIIIIlIlIIllllIllIII = lllllllllllllIIIIlIlIIlllllIIlII.add(lllllllllllllIIIIlIlIIllllIlllII, lllllllllllllIIIIlIlIIllllIllIlI, lllllllllllllIIIIlIlIIllllIllIll);
                                final int lllllllllllllIIIIlIlIIllllIlIlll = this.getNeighborEncouragement(lllllllllllllIIIIlIlIIlllllIIlIl, lllllllllllllIIIIlIlIIllllIllIII);
                                if (llllIlIIlIIIllI(lllllllllllllIIIIlIlIIllllIlIlll)) {
                                    int lllllllllllllIIIIlIlIIllllIlIllI = (lllllllllllllIIIIlIlIIllllIlIlll + BlockFire.lIlIllllIIIlIl[19] + lllllllllllllIIIIlIlIIlllllIIlIl.getDifficulty().getDifficultyId() * BlockFire.lIlIllllIIIlIl[8]) / (lllllllllllllIIIIlIlIIllllIlllll + BlockFire.lIlIllllIIIlIl[10]);
                                    if (llllIlIIlIIIIlI(lllllllllllllIIIIlIlIIllllIllllI ? 1 : 0)) {
                                        lllllllllllllIIIIlIlIIllllIlIllI /= BlockFire.lIlIllllIIIlIl[3];
                                    }
                                    if (llllIlIIlIIIllI(lllllllllllllIIIIlIlIIllllIlIllI) && llllIlIIlIIIlll(lllllllllllllIIIIlIlIIlllllIIIlI.nextInt(lllllllllllllIIIIlIlIIllllIllIIl), lllllllllllllIIIIlIlIIllllIlIllI) && (!llllIlIIlIIIIlI(lllllllllllllIIIIlIlIIlllllIIlIl.isRaining() ? 1 : 0) || llllIlIIlIIIIII(this.canDie(lllllllllllllIIIIlIlIIlllllIIlIl, lllllllllllllIIIIlIlIIllllIllIII) ? 1 : 0))) {
                                        int lllllllllllllIIIIlIlIIllllIlIlIl = lllllllllllllIIIIlIlIIllllIlllll + lllllllllllllIIIIlIlIIlllllIIIlI.nextInt(BlockFire.lIlIllllIIIlIl[6]) / BlockFire.lIlIllllIIIlIl[5];
                                        if (llllIlIIlIIIlIl(lllllllllllllIIIIlIlIIllllIlIlIl, BlockFire.lIlIllllIIIlIl[1])) {
                                            lllllllllllllIIIIlIlIIllllIlIlIl = BlockFire.lIlIllllIIIlIl[1];
                                        }
                                        lllllllllllllIIIIlIlIIlllllIIlIl.setBlockState(lllllllllllllIIIIlIlIIllllIllIII, ((IBlockState)lllllllllllllIIIIlIlIIllllIlIIIl).withProperty((IProperty<Comparable>)BlockFire.AGE, Integer.valueOf(lllllllllllllIIIIlIlIIllllIlIlIl)), BlockFire.lIlIllllIIIlIl[4]);
                                        "".length();
                                    }
                                }
                            }
                            ++lllllllllllllIIIIlIlIIllllIllIlI;
                        }
                        ++lllllllllllllIIIIlIlIIllllIllIll;
                    }
                    ++lllllllllllllIIIIlIlIIllllIlllII;
                }
            }
        }
    }
    
    private static String llllIlIIIlIlllI(final String lllllllllllllIIIIlIlIIlIllIlIlIl, final String lllllllllllllIIIIlIlIIlIllIlIllI) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIlIIlIllIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIlIIlIllIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIlIlIIlIllIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIlIlIIlIllIllIIl.init(BlockFire.lIlIllllIIIlIl[3], lllllllllllllIIIIlIlIIlIllIllIlI);
            return new String(lllllllllllllIIIIlIlIIlIllIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIlIIlIllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIlIIlIllIllIII) {
            lllllllllllllIIIIlIlIIlIllIllIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIlIIlIIIlII(final int lllllllllllllIIIIlIlIIlIllIIIlll, final int lllllllllllllIIIIlIlIIlIllIIIllI) {
        return lllllllllllllIIIIlIlIIlIllIIIlll < lllllllllllllIIIIlIlIIlIllIIIllI;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockFire.lIlIllllIIIlIl[13]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockFire.lIlIllllIIIlIl[0]] = BlockFire.AGE;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockFire.lIlIllllIIIlIl[2]] = BlockFire.NORTH;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockFire.lIlIllllIIIlIl[3]] = BlockFire.EAST;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockFire.lIlIllllIIIlIl[4]] = BlockFire.SOUTH;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockFire.lIlIllllIIIlIl[5]] = BlockFire.WEST;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockFire.lIlIllllIIIlIl[6]] = BlockFire.UPPER;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockFire.lIlIllllIIIlIl[7]] = BlockFire.FLIP;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockFire.lIlIllllIIIlIl[8]] = BlockFire.ALT;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public void randomDisplayTick(final World lllllllllllllIIIIlIlIIllIIllIllI, final BlockPos lllllllllllllIIIIlIlIIllIIllIlIl, final IBlockState lllllllllllllIIIIlIlIIllIIllIlII, final Random lllllllllllllIIIIlIlIIllIIIllIII) {
        if (llllIlIIlIIIIII(lllllllllllllIIIIlIlIIllIIIllIII.nextInt(BlockFire.lIlIllllIIIlIl[20]))) {
            lllllllllllllIIIIlIlIIllIIllIllI.playSound(lllllllllllllIIIIlIlIIllIIllIlIl.getX() + 0.5f, lllllllllllllIIIIlIlIIllIIllIlIl.getY() + 0.5f, lllllllllllllIIIIlIlIIllIIllIlIl.getZ() + 0.5f, BlockFire.lIlIllllIIIIlI[BlockFire.lIlIllllIIIlIl[21]], 1.0f + lllllllllllllIIIIlIlIIllIIIllIII.nextFloat(), lllllllllllllIIIIlIlIIllIIIllIII.nextFloat() * 0.7f + 0.3f, (boolean)(BlockFire.lIlIllllIIIlIl[0] != 0));
        }
        if (llllIlIIlIIIIII(World.doesBlockHaveSolidTopSurface(lllllllllllllIIIIlIlIIllIIllIllI, lllllllllllllIIIIlIlIIllIIllIlIl.down()) ? 1 : 0) && llllIlIIlIIIIII(Blocks.fire.canCatchFire(lllllllllllllIIIIlIlIIllIIllIllI, lllllllllllllIIIIlIlIIllIIllIlIl.down()) ? 1 : 0)) {
            if (llllIlIIlIIIIlI(Blocks.fire.canCatchFire(lllllllllllllIIIIlIlIIllIIllIllI, lllllllllllllIIIIlIlIIllIIllIlIl.west()) ? 1 : 0)) {
                int lllllllllllllIIIIlIlIIllIIllIIlI = BlockFire.lIlIllllIIIlIl[0];
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
                while (!llllIlIIlIIlIIl(lllllllllllllIIIIlIlIIllIIllIIlI, BlockFire.lIlIllllIIIlIl[3])) {
                    final double lllllllllllllIIIIlIlIIllIIllIIIl = lllllllllllllIIIIlIlIIllIIllIlIl.getX() + lllllllllllllIIIIlIlIIllIIIllIII.nextDouble() * 0.10000000149011612;
                    final double lllllllllllllIIIIlIlIIllIIllIIII = lllllllllllllIIIIlIlIIllIIllIlIl.getY() + lllllllllllllIIIIlIlIIllIIIllIII.nextDouble();
                    final double lllllllllllllIIIIlIlIIllIIlIllll = lllllllllllllIIIIlIlIIllIIllIlIl.getZ() + lllllllllllllIIIIlIlIIllIIIllIII.nextDouble();
                    lllllllllllllIIIIlIlIIllIIllIllI.spawnParticle(EnumParticleTypes.SMOKE_LARGE, lllllllllllllIIIIlIlIIllIIllIIIl, lllllllllllllIIIIlIlIIllIIllIIII, lllllllllllllIIIIlIlIIllIIlIllll, 0.0, 0.0, 0.0, new int[BlockFire.lIlIllllIIIlIl[0]]);
                    ++lllllllllllllIIIIlIlIIllIIllIIlI;
                }
            }
            if (llllIlIIlIIIIlI(Blocks.fire.canCatchFire(lllllllllllllIIIIlIlIIllIIllIllI, lllllllllllllIIIIlIlIIllIIllIlIl.east()) ? 1 : 0)) {
                int lllllllllllllIIIIlIlIIllIIlIlllI = BlockFire.lIlIllllIIIlIl[0];
                "".length();
                if (null != null) {
                    return;
                }
                while (!llllIlIIlIIlIIl(lllllllllllllIIIIlIlIIllIIlIlllI, BlockFire.lIlIllllIIIlIl[3])) {
                    final double lllllllllllllIIIIlIlIIllIIlIllIl = lllllllllllllIIIIlIlIIllIIllIlIl.getX() + BlockFire.lIlIllllIIIlIl[2] - lllllllllllllIIIIlIlIIllIIIllIII.nextDouble() * 0.10000000149011612;
                    final double lllllllllllllIIIIlIlIIllIIlIllII = lllllllllllllIIIIlIlIIllIIllIlIl.getY() + lllllllllllllIIIIlIlIIllIIIllIII.nextDouble();
                    final double lllllllllllllIIIIlIlIIllIIlIlIll = lllllllllllllIIIIlIlIIllIIllIlIl.getZ() + lllllllllllllIIIIlIlIIllIIIllIII.nextDouble();
                    lllllllllllllIIIIlIlIIllIIllIllI.spawnParticle(EnumParticleTypes.SMOKE_LARGE, lllllllllllllIIIIlIlIIllIIlIllIl, lllllllllllllIIIIlIlIIllIIlIllII, lllllllllllllIIIIlIlIIllIIlIlIll, 0.0, 0.0, 0.0, new int[BlockFire.lIlIllllIIIlIl[0]]);
                    ++lllllllllllllIIIIlIlIIllIIlIlllI;
                }
            }
            if (llllIlIIlIIIIlI(Blocks.fire.canCatchFire(lllllllllllllIIIIlIlIIllIIllIllI, lllllllllllllIIIIlIlIIllIIllIlIl.north()) ? 1 : 0)) {
                int lllllllllllllIIIIlIlIIllIIlIlIlI = BlockFire.lIlIllllIIIlIl[0];
                "".length();
                if ((0xB6 ^ 0xB2) <= ((0x0 ^ 0x34) & ~(0xBB ^ 0x8F))) {
                    return;
                }
                while (!llllIlIIlIIlIIl(lllllllllllllIIIIlIlIIllIIlIlIlI, BlockFire.lIlIllllIIIlIl[3])) {
                    final double lllllllllllllIIIIlIlIIllIIlIlIIl = lllllllllllllIIIIlIlIIllIIllIlIl.getX() + lllllllllllllIIIIlIlIIllIIIllIII.nextDouble();
                    final double lllllllllllllIIIIlIlIIllIIlIlIII = lllllllllllllIIIIlIlIIllIIllIlIl.getY() + lllllllllllllIIIIlIlIIllIIIllIII.nextDouble();
                    final double lllllllllllllIIIIlIlIIllIIlIIlll = lllllllllllllIIIIlIlIIllIIllIlIl.getZ() + lllllllllllllIIIIlIlIIllIIIllIII.nextDouble() * 0.10000000149011612;
                    lllllllllllllIIIIlIlIIllIIllIllI.spawnParticle(EnumParticleTypes.SMOKE_LARGE, lllllllllllllIIIIlIlIIllIIlIlIIl, lllllllllllllIIIIlIlIIllIIlIlIII, lllllllllllllIIIIlIlIIllIIlIIlll, 0.0, 0.0, 0.0, new int[BlockFire.lIlIllllIIIlIl[0]]);
                    ++lllllllllllllIIIIlIlIIllIIlIlIlI;
                }
            }
            if (llllIlIIlIIIIlI(Blocks.fire.canCatchFire(lllllllllllllIIIIlIlIIllIIllIllI, lllllllllllllIIIIlIlIIllIIllIlIl.south()) ? 1 : 0)) {
                int lllllllllllllIIIIlIlIIllIIlIIllI = BlockFire.lIlIllllIIIlIl[0];
                "".length();
                if (-" ".length() > " ".length()) {
                    return;
                }
                while (!llllIlIIlIIlIIl(lllllllllllllIIIIlIlIIllIIlIIllI, BlockFire.lIlIllllIIIlIl[3])) {
                    final double lllllllllllllIIIIlIlIIllIIlIIlIl = lllllllllllllIIIIlIlIIllIIllIlIl.getX() + lllllllllllllIIIIlIlIIllIIIllIII.nextDouble();
                    final double lllllllllllllIIIIlIlIIllIIlIIlII = lllllllllllllIIIIlIlIIllIIllIlIl.getY() + lllllllllllllIIIIlIlIIllIIIllIII.nextDouble();
                    final double lllllllllllllIIIIlIlIIllIIlIIIll = lllllllllllllIIIIlIlIIllIIllIlIl.getZ() + BlockFire.lIlIllllIIIlIl[2] - lllllllllllllIIIIlIlIIllIIIllIII.nextDouble() * 0.10000000149011612;
                    lllllllllllllIIIIlIlIIllIIllIllI.spawnParticle(EnumParticleTypes.SMOKE_LARGE, lllllllllllllIIIIlIlIIllIIlIIlIl, lllllllllllllIIIIlIlIIllIIlIIlII, lllllllllllllIIIIlIlIIllIIlIIIll, 0.0, 0.0, 0.0, new int[BlockFire.lIlIllllIIIlIl[0]]);
                    ++lllllllllllllIIIIlIlIIllIIlIIllI;
                }
            }
            if (llllIlIIlIIIIlI(Blocks.fire.canCatchFire(lllllllllllllIIIIlIlIIllIIllIllI, lllllllllllllIIIIlIlIIllIIllIlIl.up()) ? 1 : 0)) {
                int lllllllllllllIIIIlIlIIllIIlIIIlI = BlockFire.lIlIllllIIIlIl[0];
                "".length();
                if (((0x34 ^ 0x2) & ~(0x8E ^ 0xB8)) != 0x0) {
                    return;
                }
                while (!llllIlIIlIIlIIl(lllllllllllllIIIIlIlIIllIIlIIIlI, BlockFire.lIlIllllIIIlIl[3])) {
                    final double lllllllllllllIIIIlIlIIllIIlIIIIl = lllllllllllllIIIIlIlIIllIIllIlIl.getX() + lllllllllllllIIIIlIlIIllIIIllIII.nextDouble();
                    final double lllllllllllllIIIIlIlIIllIIlIIIII = lllllllllllllIIIIlIlIIllIIllIlIl.getY() + BlockFire.lIlIllllIIIlIl[2] - lllllllllllllIIIIlIlIIllIIIllIII.nextDouble() * 0.10000000149011612;
                    final double lllllllllllllIIIIlIlIIllIIIlllll = lllllllllllllIIIIlIlIIllIIllIlIl.getZ() + lllllllllllllIIIIlIlIIllIIIllIII.nextDouble();
                    lllllllllllllIIIIlIlIIllIIllIllI.spawnParticle(EnumParticleTypes.SMOKE_LARGE, lllllllllllllIIIIlIlIIllIIlIIIIl, lllllllllllllIIIIlIlIIllIIlIIIII, lllllllllllllIIIIlIlIIllIIIlllll, 0.0, 0.0, 0.0, new int[BlockFire.lIlIllllIIIlIl[0]]);
                    ++lllllllllllllIIIIlIlIIllIIlIIIlI;
                }
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            }
        }
        else {
            int lllllllllllllIIIIlIlIIllIIIllllI = BlockFire.lIlIllllIIIlIl[0];
            "".length();
            if (((0x9C ^ 0x82) & ~(0xDE ^ 0xC0)) >= "   ".length()) {
                return;
            }
            while (!llllIlIIlIIlIIl(lllllllllllllIIIIlIlIIllIIIllllI, BlockFire.lIlIllllIIIlIl[4])) {
                final double lllllllllllllIIIIlIlIIllIIIlllIl = lllllllllllllIIIIlIlIIllIIllIlIl.getX() + lllllllllllllIIIIlIlIIllIIIllIII.nextDouble();
                final double lllllllllllllIIIIlIlIIllIIIlllII = lllllllllllllIIIIlIlIIllIIllIlIl.getY() + lllllllllllllIIIIlIlIIllIIIllIII.nextDouble() * 0.5 + 0.5;
                final double lllllllllllllIIIIlIlIIllIIIllIll = lllllllllllllIIIIlIlIIllIIllIlIl.getZ() + lllllllllllllIIIIlIlIIllIIIllIII.nextDouble();
                lllllllllllllIIIIlIlIIllIIllIllI.spawnParticle(EnumParticleTypes.SMOKE_LARGE, lllllllllllllIIIIlIlIIllIIIlllIl, lllllllllllllIIIIlIlIIllIIIlllII, lllllllllllllIIIIlIlIIllIIIllIll, 0.0, 0.0, 0.0, new int[BlockFire.lIlIllllIIIlIl[0]]);
                ++lllllllllllllIIIIlIlIIllIIIllllI;
            }
        }
    }
    
    private static String llllIlIIIllIIll(String lllllllllllllIIIIlIlIIlIllllIlII, final String lllllllllllllIIIIlIlIIlIllllIIll) {
        lllllllllllllIIIIlIlIIlIllllIlII = new String(Base64.getDecoder().decode(lllllllllllllIIIIlIlIIlIllllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlIlIIlIllllIlll = new StringBuilder();
        final char[] lllllllllllllIIIIlIlIIlIllllIllI = lllllllllllllIIIIlIlIIlIllllIIll.toCharArray();
        int lllllllllllllIIIIlIlIIlIllllIlIl = BlockFire.lIlIllllIIIlIl[0];
        final int lllllllllllllIIIIlIlIIlIlllIllll = (Object)lllllllllllllIIIIlIlIIlIllllIlII.toCharArray();
        final double lllllllllllllIIIIlIlIIlIlllIlllI = lllllllllllllIIIIlIlIIlIlllIllll.length;
        char lllllllllllllIIIIlIlIIlIlllIllIl = (char)BlockFire.lIlIllllIIIlIl[0];
        while (llllIlIIlIIIlII(lllllllllllllIIIIlIlIIlIlllIllIl, (int)lllllllllllllIIIIlIlIIlIlllIlllI)) {
            final char lllllllllllllIIIIlIlIIlIlllllIlI = lllllllllllllIIIIlIlIIlIlllIllll[lllllllllllllIIIIlIlIIlIlllIllIl];
            lllllllllllllIIIIlIlIIlIllllIlll.append((char)(lllllllllllllIIIIlIlIIlIlllllIlI ^ lllllllllllllIIIIlIlIIlIllllIllI[lllllllllllllIIIIlIlIIlIllllIlIl % lllllllllllllIIIIlIlIIlIllllIllI.length]));
            "".length();
            ++lllllllllllllIIIIlIlIIlIllllIlIl;
            ++lllllllllllllIIIIlIlIIlIlllIllIl;
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlIlIIlIllllIlll);
    }
    
    private static boolean llllIlIIlIIIlll(final int lllllllllllllIIIIlIlIIlIllIIIIll, final int lllllllllllllIIIIlIlIIlIllIIIIlI) {
        return lllllllllllllIIIIlIlIIlIllIIIIll <= lllllllllllllIIIIlIlIIlIllIIIIlI;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockFire.lIlIllllIIIlIl[0] != 0;
    }
    
    private static boolean llllIlIIlIIIIIl(final int lllllllllllllIIIIlIlIIlIllIIllll, final int lllllllllllllIIIIlIlIIlIllIIlllI) {
        return lllllllllllllIIIIlIlIIlIllIIllll == lllllllllllllIIIIlIlIIlIllIIlllI;
    }
    
    @Override
    public boolean isCollidable() {
        return BlockFire.lIlIllllIIIlIl[0] != 0;
    }
    
    private int getEncouragement(final Block lllllllllllllIIIIlIlIIlllIlIllIl) {
        final Integer lllllllllllllIIIIlIlIIlllIlIllII = this.encouragements.get(lllllllllllllIIIIlIlIIlllIlIllIl);
        int intValue;
        if (llllIlIIlIIlIII(lllllllllllllIIIIlIlIIlllIlIllII)) {
            intValue = BlockFire.lIlIllllIIIlIl[0];
            "".length();
            if (("   ".length() & ~"   ".length()) != 0x0) {
                return (0x4F ^ 0x1D) & ~(0x65 ^ 0x37);
            }
        }
        else {
            intValue = lllllllllllllIIIIlIlIIlllIlIllII;
        }
        return intValue;
    }
    
    static {
        llllIlIIIllllll();
        llllIlIIIllIlII();
        AGE = PropertyInteger.create(BlockFire.lIlIllllIIIIlI[BlockFire.lIlIllllIIIlIl[0]], BlockFire.lIlIllllIIIlIl[0], BlockFire.lIlIllllIIIlIl[1]);
        FLIP = PropertyBool.create(BlockFire.lIlIllllIIIIlI[BlockFire.lIlIllllIIIlIl[2]]);
        ALT = PropertyBool.create(BlockFire.lIlIllllIIIIlI[BlockFire.lIlIllllIIIlIl[3]]);
        NORTH = PropertyBool.create(BlockFire.lIlIllllIIIIlI[BlockFire.lIlIllllIIIlIl[4]]);
        EAST = PropertyBool.create(BlockFire.lIlIllllIIIIlI[BlockFire.lIlIllllIIIlIl[5]]);
        SOUTH = PropertyBool.create(BlockFire.lIlIllllIIIIlI[BlockFire.lIlIllllIIIlIl[6]]);
        WEST = PropertyBool.create(BlockFire.lIlIllllIIIIlI[BlockFire.lIlIllllIIIlIl[7]]);
        UPPER = PropertyInteger.create(BlockFire.lIlIllllIIIIlI[BlockFire.lIlIllllIIIlIl[8]], BlockFire.lIlIllllIIIlIl[0], BlockFire.lIlIllllIIIlIl[3]);
    }
    
    public static void init() {
        Blocks.fire.setFireInfo(Blocks.planks, BlockFire.lIlIllllIIIlIl[6], BlockFire.lIlIllllIIIlIl[9]);
        Blocks.fire.setFireInfo(Blocks.double_wooden_slab, BlockFire.lIlIllllIIIlIl[6], BlockFire.lIlIllllIIIlIl[9]);
        Blocks.fire.setFireInfo(Blocks.wooden_slab, BlockFire.lIlIllllIIIlIl[6], BlockFire.lIlIllllIIIlIl[9]);
        Blocks.fire.setFireInfo(Blocks.oak_fence_gate, BlockFire.lIlIllllIIIlIl[6], BlockFire.lIlIllllIIIlIl[9]);
        Blocks.fire.setFireInfo(Blocks.spruce_fence_gate, BlockFire.lIlIllllIIIlIl[6], BlockFire.lIlIllllIIIlIl[9]);
        Blocks.fire.setFireInfo(Blocks.birch_fence_gate, BlockFire.lIlIllllIIIlIl[6], BlockFire.lIlIllllIIIlIl[9]);
        Blocks.fire.setFireInfo(Blocks.jungle_fence_gate, BlockFire.lIlIllllIIIlIl[6], BlockFire.lIlIllllIIIlIl[9]);
        Blocks.fire.setFireInfo(Blocks.dark_oak_fence_gate, BlockFire.lIlIllllIIIlIl[6], BlockFire.lIlIllllIIIlIl[9]);
        Blocks.fire.setFireInfo(Blocks.acacia_fence_gate, BlockFire.lIlIllllIIIlIl[6], BlockFire.lIlIllllIIIlIl[9]);
        Blocks.fire.setFireInfo(Blocks.oak_fence, BlockFire.lIlIllllIIIlIl[6], BlockFire.lIlIllllIIIlIl[9]);
        Blocks.fire.setFireInfo(Blocks.spruce_fence, BlockFire.lIlIllllIIIlIl[6], BlockFire.lIlIllllIIIlIl[9]);
        Blocks.fire.setFireInfo(Blocks.birch_fence, BlockFire.lIlIllllIIIlIl[6], BlockFire.lIlIllllIIIlIl[9]);
        Blocks.fire.setFireInfo(Blocks.jungle_fence, BlockFire.lIlIllllIIIlIl[6], BlockFire.lIlIllllIIIlIl[9]);
        Blocks.fire.setFireInfo(Blocks.dark_oak_fence, BlockFire.lIlIllllIIIlIl[6], BlockFire.lIlIllllIIIlIl[9]);
        Blocks.fire.setFireInfo(Blocks.acacia_fence, BlockFire.lIlIllllIIIlIl[6], BlockFire.lIlIllllIIIlIl[9]);
        Blocks.fire.setFireInfo(Blocks.oak_stairs, BlockFire.lIlIllllIIIlIl[6], BlockFire.lIlIllllIIIlIl[9]);
        Blocks.fire.setFireInfo(Blocks.birch_stairs, BlockFire.lIlIllllIIIlIl[6], BlockFire.lIlIllllIIIlIl[9]);
        Blocks.fire.setFireInfo(Blocks.spruce_stairs, BlockFire.lIlIllllIIIlIl[6], BlockFire.lIlIllllIIIlIl[9]);
        Blocks.fire.setFireInfo(Blocks.jungle_stairs, BlockFire.lIlIllllIIIlIl[6], BlockFire.lIlIllllIIIlIl[9]);
        Blocks.fire.setFireInfo(Blocks.log, BlockFire.lIlIllllIIIlIl[6], BlockFire.lIlIllllIIIlIl[6]);
        Blocks.fire.setFireInfo(Blocks.log2, BlockFire.lIlIllllIIIlIl[6], BlockFire.lIlIllllIIIlIl[6]);
        Blocks.fire.setFireInfo(Blocks.leaves, BlockFire.lIlIllllIIIlIl[10], BlockFire.lIlIllllIIIlIl[11]);
        Blocks.fire.setFireInfo(Blocks.leaves2, BlockFire.lIlIllllIIIlIl[10], BlockFire.lIlIllllIIIlIl[11]);
        Blocks.fire.setFireInfo(Blocks.bookshelf, BlockFire.lIlIllllIIIlIl[10], BlockFire.lIlIllllIIIlIl[9]);
        Blocks.fire.setFireInfo(Blocks.tnt, BlockFire.lIlIllllIIIlIl[1], BlockFire.lIlIllllIIIlIl[12]);
        Blocks.fire.setFireInfo(Blocks.tallgrass, BlockFire.lIlIllllIIIlIl[11], BlockFire.lIlIllllIIIlIl[12]);
        Blocks.fire.setFireInfo(Blocks.double_plant, BlockFire.lIlIllllIIIlIl[11], BlockFire.lIlIllllIIIlIl[12]);
        Blocks.fire.setFireInfo(Blocks.yellow_flower, BlockFire.lIlIllllIIIlIl[11], BlockFire.lIlIllllIIIlIl[12]);
        Blocks.fire.setFireInfo(Blocks.red_flower, BlockFire.lIlIllllIIIlIl[11], BlockFire.lIlIllllIIIlIl[12]);
        Blocks.fire.setFireInfo(Blocks.deadbush, BlockFire.lIlIllllIIIlIl[11], BlockFire.lIlIllllIIIlIl[12]);
        Blocks.fire.setFireInfo(Blocks.wool, BlockFire.lIlIllllIIIlIl[10], BlockFire.lIlIllllIIIlIl[11]);
        Blocks.fire.setFireInfo(Blocks.vine, BlockFire.lIlIllllIIIlIl[1], BlockFire.lIlIllllIIIlIl[12]);
        Blocks.fire.setFireInfo(Blocks.coal_block, BlockFire.lIlIllllIIIlIl[6], BlockFire.lIlIllllIIIlIl[6]);
        Blocks.fire.setFireInfo(Blocks.hay_block, BlockFire.lIlIllllIIIlIl[11], BlockFire.lIlIllllIIIlIl[9]);
        Blocks.fire.setFireInfo(Blocks.carpet, BlockFire.lIlIllllIIIlIl[11], BlockFire.lIlIllllIIIlIl[9]);
    }
    
    private void catchOnFire(final World lllllllllllllIIIIlIlIIlllIIllllI, final BlockPos lllllllllllllIIIIlIlIIlllIIlIlII, final int lllllllllllllIIIIlIlIIlllIIlIIll, final Random lllllllllllllIIIIlIlIIlllIIlIIlI, final int lllllllllllllIIIIlIlIIlllIIllIlI) {
        final int lllllllllllllIIIIlIlIIlllIIllIIl = this.getFlammability(lllllllllllllIIIIlIlIIlllIIllllI.getBlockState(lllllllllllllIIIIlIlIIlllIIlIlII).getBlock());
        if (llllIlIIlIIIlII(lllllllllllllIIIIlIlIIlllIIlIIlI.nextInt(lllllllllllllIIIIlIlIIlllIIlIIll), lllllllllllllIIIIlIlIIlllIIllIIl)) {
            final IBlockState lllllllllllllIIIIlIlIIlllIIllIII = lllllllllllllIIIIlIlIIlllIIllllI.getBlockState(lllllllllllllIIIIlIlIIlllIIlIlII);
            if (llllIlIIlIIIlII(lllllllllllllIIIIlIlIIlllIIlIIlI.nextInt(lllllllllllllIIIIlIlIIlllIIllIlI + BlockFire.lIlIllllIIIlIl[14]), BlockFire.lIlIllllIIIlIl[6]) && llllIlIIlIIIIII(lllllllllllllIIIIlIlIIlllIIllllI.canLightningStrike(lllllllllllllIIIIlIlIIlllIIlIlII) ? 1 : 0)) {
                int lllllllllllllIIIIlIlIIlllIIlIlll = lllllllllllllIIIIlIlIIlllIIllIlI + lllllllllllllIIIIlIlIIlllIIlIIlI.nextInt(BlockFire.lIlIllllIIIlIl[6]) / BlockFire.lIlIllllIIIlIl[5];
                if (llllIlIIlIIIlIl(lllllllllllllIIIIlIlIIlllIIlIlll, BlockFire.lIlIllllIIIlIl[1])) {
                    lllllllllllllIIIIlIlIIlllIIlIlll = BlockFire.lIlIllllIIIlIl[1];
                }
                lllllllllllllIIIIlIlIIlllIIllllI.setBlockState(lllllllllllllIIIIlIlIIlllIIlIlII, this.getDefaultState().withProperty((IProperty<Comparable>)BlockFire.AGE, lllllllllllllIIIIlIlIIlllIIlIlll), BlockFire.lIlIllllIIIlIl[4]);
                "".length();
                "".length();
                if (((0x7E ^ 0x74 ^ (0x50 ^ 0x4B)) & (0x52 ^ 0x1B ^ (0x34 ^ 0x6C) ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else {
                lllllllllllllIIIIlIlIIlllIIllllI.setBlockToAir(lllllllllllllIIIIlIlIIlllIIlIlII);
                "".length();
            }
            if (llllIlIIlIIIIll(lllllllllllllIIIIlIlIIlllIIllIII.getBlock(), Blocks.tnt)) {
                Blocks.tnt.onBlockDestroyedByPlayer(lllllllllllllIIIIlIlIIlllIIllllI, lllllllllllllIIIIlIlIIlllIIlIlII, lllllllllllllIIIIlIlIIlllIIllIII.withProperty((IProperty<Comparable>)BlockTNT.EXPLODE, (boolean)(BlockFire.lIlIllllIIIlIl[2] != 0)));
            }
        }
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World lllllllllllllIIIIlIlIlIIIIIIIIIl, final BlockPos lllllllllllllIIIIlIlIlIIIIIIIIII, final IBlockState lllllllllllllIIIIlIlIIllllllllll) {
        return null;
    }
    
    private static boolean llllIlIIlIIlIIl(final int lllllllllllllIIIIlIlIIlIllIIlIll, final int lllllllllllllIIIIlIlIIlIllIIlIlI) {
        return lllllllllllllIIIIlIlIIlIllIIlIll >= lllllllllllllIIIIlIlIIlIllIIlIlI;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockFire.lIlIllllIIIlIl[0] != 0;
    }
    
    private int getNeighborEncouragement(final World lllllllllllllIIIIlIlIIllIlllIIlI, final BlockPos lllllllllllllIIIIlIlIIllIlllIIIl) {
        if (llllIlIIlIIIIII(lllllllllllllIIIIlIlIIllIlllIIlI.isAirBlock(lllllllllllllIIIIlIlIIllIlllIIIl) ? 1 : 0)) {
            return BlockFire.lIlIllllIIIlIl[0];
        }
        int lllllllllllllIIIIlIlIIllIlllIIII = BlockFire.lIlIllllIIIlIl[0];
        final char lllllllllllllIIIIlIlIIllIllIIlll;
        final byte lllllllllllllIIIIlIlIIllIllIlIII = (byte)((EnumFacing[])(Object)(lllllllllllllIIIIlIlIIllIllIIlll = (char)(Object)EnumFacing.values())).length;
        float lllllllllllllIIIIlIlIIllIllIlIIl = BlockFire.lIlIllllIIIlIl[0];
        "".length();
        if (" ".length() < 0) {
            return (0x2 ^ 0x2C) & ~(0x1F ^ 0x31);
        }
        while (!llllIlIIlIIlIIl((int)lllllllllllllIIIIlIlIIllIllIlIIl, lllllllllllllIIIIlIlIIllIllIlIII)) {
            final EnumFacing lllllllllllllIIIIlIlIIllIllIllll = lllllllllllllIIIIlIlIIllIllIIlll[lllllllllllllIIIIlIlIIllIllIlIIl];
            lllllllllllllIIIIlIlIIllIlllIIII = Math.max(this.getEncouragement(lllllllllllllIIIIlIlIIllIlllIIlI.getBlockState(lllllllllllllIIIIlIlIIllIlllIIIl.offset(lllllllllllllIIIIlIlIIllIllIllll)).getBlock()), lllllllllllllIIIIlIlIIllIlllIIII);
            ++lllllllllllllIIIIlIlIIllIllIlIIl;
        }
        return lllllllllllllIIIIlIlIIllIlllIIII;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIIIlIlIIllIIIIlIll) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockFire.AGE, lllllllllllllIIIIlIlIIllIIIIlIll);
    }
    
    @Override
    public void onNeighborBlockChange(final World lllllllllllllIIIIlIlIIllIlIIlIlI, final BlockPos lllllllllllllIIIIlIlIIllIlIIlllI, final IBlockState lllllllllllllIIIIlIlIIllIlIIllIl, final Block lllllllllllllIIIIlIlIIllIlIIllII) {
        if (llllIlIIlIIIIII(World.doesBlockHaveSolidTopSurface(lllllllllllllIIIIlIlIIllIlIIlIlI, lllllllllllllIIIIlIlIIllIlIIlllI.down()) ? 1 : 0) && llllIlIIlIIIIII(this.canNeighborCatchFire(lllllllllllllIIIIlIlIIllIlIIlIlI, lllllllllllllIIIIlIlIIllIlIIlllI) ? 1 : 0)) {
            lllllllllllllIIIIlIlIIllIlIIlIlI.setBlockToAir(lllllllllllllIIIIlIlIIllIlIIlllI);
            "".length();
        }
    }
    
    private static boolean llllIlIIlIIlIlI(final int lllllllllllllIIIIlIlIIlIlIllIIlI) {
        return lllllllllllllIIIIlIlIIlIlIllIIlI <= 0;
    }
    
    private static boolean llllIlIIlIIIIlI(final int lllllllllllllIIIIlIlIIlIlIllIllI) {
        return lllllllllllllIIIIlIlIIlIlIllIllI != 0;
    }
    
    private static boolean llllIlIIlIIIllI(final int lllllllllllllIIIIlIlIIlIlIllIIII) {
        return lllllllllllllIIIIlIlIIlIlIllIIII > 0;
    }
    
    private static boolean llllIlIIlIIIlIl(final int lllllllllllllIIIIlIlIIlIlIllllll, final int lllllllllllllIIIIlIlIIlIlIlllllI) {
        return lllllllllllllIIIIlIlIIlIlIllllll > lllllllllllllIIIIlIlIIlIlIlllllI;
    }
    
    @Override
    public boolean canPlaceBlockAt(final World lllllllllllllIIIIlIlIIllIlIllIII, final BlockPos lllllllllllllIIIIlIlIIllIlIlIlII) {
        if (llllIlIIlIIIIII(World.doesBlockHaveSolidTopSurface(lllllllllllllIIIIlIlIIllIlIllIII, lllllllllllllIIIIlIlIIllIlIlIlII.down()) ? 1 : 0) && llllIlIIlIIIIII(this.canNeighborCatchFire(lllllllllllllIIIIlIlIIllIlIllIII, lllllllllllllIIIIlIlIIllIlIlIlII) ? 1 : 0)) {
            return BlockFire.lIlIllllIIIlIl[0] != 0;
        }
        return BlockFire.lIlIllllIIIlIl[2] != 0;
    }
    
    private static boolean llllIlIIlIIIIII(final int lllllllllllllIIIIlIlIIlIlIllIlII) {
        return lllllllllllllIIIIlIlIIlIlIllIlII == 0;
    }
    
    private static void llllIlIIIllllll() {
        (lIlIllllIIIlIl = new int[22])[0] = ((0xC8 ^ 0xA9) & ~(0x64 ^ 0x5));
        BlockFire.lIlIllllIIIlIl[1] = (0xB ^ 0x61 ^ (0x14 ^ 0x71));
        BlockFire.lIlIllllIIIlIl[2] = " ".length();
        BlockFire.lIlIllllIIIlIl[3] = "  ".length();
        BlockFire.lIlIllllIIIlIl[4] = "   ".length();
        BlockFire.lIlIllllIIIlIl[5] = (113 + 128 - 163 + 88 ^ 65 + 85 - 20 + 32);
        BlockFire.lIlIllllIIIlIl[6] = ("   ".length() ^ (0x36 ^ 0x30));
        BlockFire.lIlIllllIIIlIl[7] = (0x9B ^ 0x9D);
        BlockFire.lIlIllllIIIlIl[8] = (44 + 7 + 75 + 12 ^ 40 + 119 - 83 + 65);
        BlockFire.lIlIllllIIIlIl[9] = (0x58 ^ 0x4C);
        BlockFire.lIlIllllIIIlIl[10] = (0x3 ^ 0x1D);
        BlockFire.lIlIllllIIIlIl[11] = (0x12 ^ 0x2E);
        BlockFire.lIlIllllIIIlIl[12] = (0x20 ^ 0x44);
        BlockFire.lIlIllllIIIlIl[13] = (0x43 ^ 0xD ^ (0x52 ^ 0x14));
        BlockFire.lIlIllllIIIlIl[14] = (0xB7 ^ 0x97 ^ (0x17 ^ 0x3D));
        BlockFire.lIlIllllIIIlIl[15] = -(0xD9 ^ 0xB5 ^ (0x55 ^ 0xB));
        BlockFire.lIlIllllIIIlIl[16] = (0xFFFFE33E & 0x1DED);
        BlockFire.lIlIllllIIIlIl[17] = 104 + 172 - 250 + 224;
        BlockFire.lIlIllllIIIlIl[18] = -" ".length();
        BlockFire.lIlIllllIIIlIl[19] = (0x6B ^ 0x43);
        BlockFire.lIlIllllIIIlIl[20] = (126 + 98 - 140 + 132 ^ 170 + 137 - 250 + 135);
        BlockFire.lIlIllllIIIlIl[21] = (0x40 ^ 0x49);
    }
    
    private boolean canNeighborCatchFire(final World lllllllllllllIIIIlIlIIlllIIIIIIl, final BlockPos lllllllllllllIIIIlIlIIlllIIIIlII) {
        final Exception lllllllllllllIIIIlIlIIllIlllllII;
        final int lllllllllllllIIIIlIlIIllIlllllIl = ((EnumFacing[])(Object)(lllllllllllllIIIIlIlIIllIlllllII = (Exception)(Object)EnumFacing.values())).length;
        long lllllllllllllIIIIlIlIIllIllllllI = BlockFire.lIlIllllIIIlIl[0];
        "".length();
        if (-" ".length() >= 0) {
            return ((0x46 ^ 0x61 ^ (0x10 ^ 0x20)) & (0xF5 ^ 0x92 ^ (0xC6 ^ 0xB6) ^ -" ".length())) != 0x0;
        }
        while (!llllIlIIlIIlIIl((int)lllllllllllllIIIIlIlIIllIllllllI, lllllllllllllIIIIlIlIIllIlllllIl)) {
            final EnumFacing lllllllllllllIIIIlIlIIlllIIIIIll = lllllllllllllIIIIlIlIIllIlllllII[lllllllllllllIIIIlIlIIllIllllllI];
            if (llllIlIIlIIIIlI(this.canCatchFire(lllllllllllllIIIIlIlIIlllIIIIIIl, lllllllllllllIIIIlIlIIlllIIIIlII.offset(lllllllllllllIIIIlIlIIlllIIIIIll)) ? 1 : 0)) {
                return BlockFire.lIlIllllIIIlIl[2] != 0;
            }
            ++lllllllllllllIIIIlIlIIllIllllllI;
        }
        return BlockFire.lIlIllllIIIlIl[0] != 0;
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIIIlIlIIllIIIIIlll) {
        return lllllllllllllIIIIlIlIIllIIIIIlll.getValue((IProperty<Integer>)BlockFire.AGE);
    }
    
    @Override
    public int tickRate(final World lllllllllllllIIIIlIlIIlllllllIIl) {
        return BlockFire.lIlIllllIIIlIl[10];
    }
}
