// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.IBlockAccess;
import java.util.Random;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.item.Item;
import net.minecraft.util.StatCollector;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Queue;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Tuple;
import com.google.common.collect.Lists;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.init.Blocks;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.PropertyBool;

public class BlockSponge extends Block
{
    public static final /* synthetic */ PropertyBool WET;
    private static final /* synthetic */ int[] lIlllIIIlllIIl;
    private static final /* synthetic */ String[] lIlllIIIllIlll;
    
    protected void tryAbsorb(final World llllllllllllIlllllIlIlIlIIlIIIlI, final BlockPos llllllllllllIlllllIlIlIlIIlIIIIl, final IBlockState llllllllllllIlllllIlIlIlIIlIIlII) {
        if (lIIIIIIlIllllIlI(((boolean)llllllllllllIlllllIlIlIlIIlIIlII.getValue((IProperty<Boolean>)BlockSponge.WET)) ? 1 : 0) && lIIIIIIlIllllIIl(this.absorb(llllllllllllIlllllIlIlIlIIlIIIlI, llllllllllllIlllllIlIlIlIIlIIIIl) ? 1 : 0)) {
            llllllllllllIlllllIlIlIlIIlIIIlI.setBlockState(llllllllllllIlllllIlIlIlIIlIIIIl, llllllllllllIlllllIlIlIlIIlIIlII.withProperty((IProperty<Comparable>)BlockSponge.WET, (boolean)(BlockSponge.lIlllIIIlllIIl[1] != 0)), BlockSponge.lIlllIIIlllIIl[2]);
            "".length();
            llllllllllllIlllllIlIlIlIIlIIIlI.playAuxSFX(BlockSponge.lIlllIIIlllIIl[3], llllllllllllIlllllIlIlIlIIlIIIIl, Block.getIdFromBlock(Blocks.water));
        }
    }
    
    private static boolean lIIIIIIlIlllllll(final int llllllllllllIlllllIlIlIIlIIlIllI) {
        return llllllllllllIlllllIlIlIIlIIlIllI > 0;
    }
    
    private static boolean lIIIIIIllIIIIIII(final int llllllllllllIlllllIlIlIIlIllIIIl, final int llllllllllllIlllllIlIlIIlIllIIII) {
        return llllllllllllIlllllIlIlIIlIllIIIl == llllllllllllIlllllIlIlIIlIllIIII;
    }
    
    private static boolean lIIIIIIlIllllIlI(final int llllllllllllIlllllIlIlIIlIIllIII) {
        return llllllllllllIlllllIlIlIIlIIllIII == 0;
    }
    
    private static void lIIIIIIlIllllIII() {
        (lIlllIIIlllIIl = new int[6])[0] = ((0x51 ^ 0x43) & ~(0x50 ^ 0x42));
        BlockSponge.lIlllIIIlllIIl[1] = " ".length();
        BlockSponge.lIlllIIIlllIIl[2] = "  ".length();
        BlockSponge.lIlllIIIlllIIl[3] = (0xFFFFEFD5 & 0x17FB);
        BlockSponge.lIlllIIIlllIIl[4] = (0x9E ^ 0x98);
        BlockSponge.lIlllIIIlllIIl[5] = (190 + 82 - 244 + 183 ^ 145 + 126 - 255 + 131);
    }
    
    private static String lIIIIIIlIlllIlII(String llllllllllllIlllllIlIlIIlIllllII, final String llllllllllllIlllllIlIlIIllIIIIII) {
        llllllllllllIlllllIlIlIIlIllllII = new String(Base64.getDecoder().decode(llllllllllllIlllllIlIlIIlIllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllIlIlIIlIllllll = new StringBuilder();
        final char[] llllllllllllIlllllIlIlIIlIlllllI = llllllllllllIlllllIlIlIIllIIIIII.toCharArray();
        int llllllllllllIlllllIlIlIIlIllllIl = BlockSponge.lIlllIIIlllIIl[0];
        final boolean llllllllllllIlllllIlIlIIlIllIlll = (Object)llllllllllllIlllllIlIlIIlIllllII.toCharArray();
        final double llllllllllllIlllllIlIlIIlIllIllI = llllllllllllIlllllIlIlIIlIllIlll.length;
        boolean llllllllllllIlllllIlIlIIlIllIlIl = BlockSponge.lIlllIIIlllIIl[0] != 0;
        while (lIIIIIIlIlllllII(llllllllllllIlllllIlIlIIlIllIlIl ? 1 : 0, (int)llllllllllllIlllllIlIlIIlIllIllI)) {
            final char llllllllllllIlllllIlIlIIllIIIIlI = llllllllllllIlllllIlIlIIlIllIlll[llllllllllllIlllllIlIlIIlIllIlIl];
            llllllllllllIlllllIlIlIIlIllllll.append((char)(llllllllllllIlllllIlIlIIllIIIIlI ^ llllllllllllIlllllIlIlIIlIlllllI[llllllllllllIlllllIlIlIIlIllllIl % llllllllllllIlllllIlIlIIlIlllllI.length]));
            "".length();
            ++llllllllllllIlllllIlIlIIlIllllIl;
            ++llllllllllllIlllllIlIlIIlIllIlIl;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllIlIlIIlIllllll);
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockSponge.lIlllIIIlllIIl[1]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockSponge.lIlllIIIlllIIl[0]] = BlockSponge.WET;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static void lIIIIIIlIlllIlIl() {
        (lIlllIIIllIlll = new String[BlockSponge.lIlllIIIlllIIl[2]])[BlockSponge.lIlllIIIlllIIl[0]] = lIIIIIIlIlllIlII("OAE7", "OdOxi");
        BlockSponge.lIlllIIIllIlll[BlockSponge.lIlllIIIlllIIl[1]] = lIIIIIIlIlllIlII("ZCIZMHQkJwYs", "JFkIZ");
    }
    
    @Override
    public void onBlockAdded(final World llllllllllllIlllllIlIlIlIIllllIl, final BlockPos llllllllllllIlllllIlIlIlIIllllII, final IBlockState llllllllllllIlllllIlIlIlIIllllll) {
        this.tryAbsorb(llllllllllllIlllllIlIlIlIIllllIl, llllllllllllIlllllIlIlIlIIllllII, llllllllllllIlllllIlIlIlIIllllll);
    }
    
    private static boolean lIIIIIIlIllllllI(final int llllllllllllIlllllIlIlIIlIlIIlIl, final int llllllllllllIlllllIlIlIIlIlIIlII) {
        return llllllllllllIlllllIlIlIIlIlIIlIl > llllllllllllIlllllIlIlIIlIlIIlII;
    }
    
    protected BlockSponge() {
        super(Material.sponge);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockSponge.WET, (boolean)(BlockSponge.lIlllIIIlllIIl[0] != 0)));
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    private static boolean lIIIIIIllIIIIIIl(final Object llllllllllllIlllllIlIlIIlIlIIIIl, final Object llllllllllllIlllllIlIlIIlIlIIIII) {
        return llllllllllllIlllllIlIlIIlIlIIIIl != llllllllllllIlllllIlIlIIlIlIIIII;
    }
    
    private static boolean lIIIIIIlIllllIll(final Object llllllllllllIlllllIlIlIIlIIlllIl, final Object llllllllllllIlllllIlIlIIlIIlllII) {
        return llllllllllllIlllllIlIlIIlIIlllIl == llllllllllllIlllllIlIlIIlIIlllII;
    }
    
    private boolean absorb(final World llllllllllllIlllllIlIlIlIIIIIllI, final BlockPos llllllllllllIlllllIlIlIlIIIlIIII) {
        final Queue<Tuple<BlockPos, Integer>> llllllllllllIlllllIlIlIlIIIIllll = (Queue<Tuple<BlockPos, Integer>>)Lists.newLinkedList();
        final ArrayList<BlockPos> llllllllllllIlllllIlIlIlIIIIlllI = (ArrayList<BlockPos>)Lists.newArrayList();
        llllllllllllIlllllIlIlIlIIIIllll.add(new Tuple<BlockPos, Integer>(llllllllllllIlllllIlIlIlIIIlIIII, BlockSponge.lIlllIIIlllIIl[0]));
        "".length();
        int llllllllllllIlllllIlIlIlIIIIllIl = BlockSponge.lIlllIIIlllIIl[0];
        "".length();
        if ((80 + 145 - 116 + 59 ^ 43 + 125 - 16 + 21) <= 0) {
            return ((0x1E ^ 0x63 ^ (0x8B ^ 0xA0)) & (0xD9 ^ 0xA5 ^ (0xBF ^ 0x95) ^ -" ".length())) != 0x0;
        }
        while (!lIIIIIIlIllllIIl(llllllllllllIlllllIlIlIlIIIIllll.isEmpty() ? 1 : 0)) {
            final Tuple<BlockPos, Integer> llllllllllllIlllllIlIlIlIIIIllII = llllllllllllIlllllIlIlIlIIIIllll.poll();
            final BlockPos llllllllllllIlllllIlIlIlIIIIlIll = llllllllllllIlllllIlIlIlIIIIllII.getFirst();
            final int llllllllllllIlllllIlIlIlIIIIlIlI = llllllllllllIlllllIlIlIlIIIIllII.getSecond();
            final boolean llllllllllllIlllllIlIlIIlllllIll;
            final float llllllllllllIlllllIlIlIIllllllII = ((EnumFacing[])(Object)(llllllllllllIlllllIlIlIIlllllIll = (boolean)(Object)EnumFacing.values())).length;
            byte llllllllllllIlllllIlIlIIllllllIl = (byte)BlockSponge.lIlllIIIlllIIl[0];
            "".length();
            if ("   ".length() <= 0) {
                return ((0x12 ^ 0x51) & ~(0x87 ^ 0xC4)) != 0x0;
            }
            while (!lIIIIIIlIlllllIl(llllllllllllIlllllIlIlIIllllllIl, (int)llllllllllllIlllllIlIlIIllllllII)) {
                final EnumFacing llllllllllllIlllllIlIlIlIIIIlIIl = llllllllllllIlllllIlIlIIlllllIll[llllllllllllIlllllIlIlIIllllllIl];
                final BlockPos llllllllllllIlllllIlIlIlIIIIlIII = llllllllllllIlllllIlIlIlIIIIlIll.offset(llllllllllllIlllllIlIlIlIIIIlIIl);
                if (lIIIIIIlIllllIll(llllllllllllIlllllIlIlIlIIIIIllI.getBlockState(llllllllllllIlllllIlIlIlIIIIlIII).getBlock().getMaterial(), Material.water)) {
                    llllllllllllIlllllIlIlIlIIIIIllI.setBlockState(llllllllllllIlllllIlIlIlIIIIlIII, Blocks.air.getDefaultState(), BlockSponge.lIlllIIIlllIIl[2]);
                    "".length();
                    llllllllllllIlllllIlIlIlIIIIlllI.add(llllllllllllIlllllIlIlIlIIIIlIII);
                    "".length();
                    ++llllllllllllIlllllIlIlIlIIIIllIl;
                    if (lIIIIIIlIlllllII(llllllllllllIlllllIlIlIlIIIIlIlI, BlockSponge.lIlllIIIlllIIl[4])) {
                        llllllllllllIlllllIlIlIlIIIIllll.add(new Tuple<BlockPos, Integer>(llllllllllllIlllllIlIlIlIIIIlIII, llllllllllllIlllllIlIlIlIIIIlIlI + BlockSponge.lIlllIIIlllIIl[1]));
                        "".length();
                    }
                }
                ++llllllllllllIlllllIlIlIIllllllIl;
            }
            if (!lIIIIIIlIllllllI(llllllllllllIlllllIlIlIlIIIIllIl, BlockSponge.lIlllIIIlllIIl[5])) {
                continue;
            }
            "".length();
            if (null != null) {
                return ((229 + 161 - 365 + 205 ^ 129 + 89 - 99 + 48) & (0x34 ^ 0x77 ^ "  ".length() ^ -" ".length())) != 0x0;
            }
            break;
        }
        final Iterator<BlockPos> iterator = llllllllllllIlllllIlIlIlIIIIlllI.iterator();
        "".length();
        if (" ".length() > "  ".length()) {
            return ((0xA1 ^ 0xBC) & ~(0x71 ^ 0x6C)) != 0x0;
        }
        while (!lIIIIIIlIllllIlI(iterator.hasNext() ? 1 : 0)) {
            final BlockPos llllllllllllIlllllIlIlIlIIIIIlll = iterator.next();
            llllllllllllIlllllIlIlIlIIIIIllI.notifyNeighborsOfStateChange(llllllllllllIlllllIlIlIlIIIIIlll, Blocks.air);
        }
        if (lIIIIIIlIlllllll(llllllllllllIlllllIlIlIlIIIIllIl)) {
            return BlockSponge.lIlllIIIlllIIl[1] != 0;
        }
        return BlockSponge.lIlllIIIlllIIl[0] != 0;
    }
    
    static {
        lIIIIIIlIllllIII();
        lIIIIIIlIlllIlIl();
        WET = PropertyBool.create(BlockSponge.lIlllIIIllIlll[BlockSponge.lIlllIIIlllIIl[0]]);
    }
    
    @Override
    public String getLocalizedName() {
        return StatCollector.translateToLocal(String.valueOf(new StringBuilder(String.valueOf(this.getUnlocalizedName())).append(BlockSponge.lIlllIIIllIlll[BlockSponge.lIlllIIIlllIIl[1]])));
    }
    
    private static boolean lIIIIIIlIllllIIl(final int llllllllllllIlllllIlIlIIlIIllIlI) {
        return llllllllllllIlllllIlIlIIlIIllIlI != 0;
    }
    
    @Override
    public void getSubBlocks(final Item llllllllllllIlllllIlIlIIllllIIll, final CreativeTabs llllllllllllIlllllIlIlIIllllIlIl, final List<ItemStack> llllllllllllIlllllIlIlIIllllIlII) {
        llllllllllllIlllllIlIlIIllllIlII.add(new ItemStack(llllllllllllIlllllIlIlIIllllIIll, BlockSponge.lIlllIIIlllIIl[1], BlockSponge.lIlllIIIlllIIl[0]));
        "".length();
        llllllllllllIlllllIlIlIIllllIlII.add(new ItemStack(llllllllllllIlllllIlIlIIllllIIll, BlockSponge.lIlllIIIlllIIl[1], BlockSponge.lIlllIIIlllIIl[1]));
        "".length();
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIlllllIlIlIIlllIlllI) {
        final IBlockState defaultState = this.getDefaultState();
        final PropertyBool wet = BlockSponge.WET;
        int b;
        if (lIIIIIIllIIIIIII(llllllllllllIlllllIlIlIIlllIlllI & BlockSponge.lIlllIIIlllIIl[1], BlockSponge.lIlllIIIlllIIl[1])) {
            b = BlockSponge.lIlllIIIlllIIl[1];
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        else {
            b = BlockSponge.lIlllIIIlllIIl[0];
        }
        return defaultState.withProperty((IProperty<Comparable>)wet, (boolean)(b != 0));
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIlllllIlIlIIlllIlIIl) {
        int n;
        if (lIIIIIIlIllllIIl(((boolean)llllllllllllIlllllIlIlIIlllIlIIl.getValue((IProperty<Boolean>)BlockSponge.WET)) ? 1 : 0)) {
            n = BlockSponge.lIlllIIIlllIIl[1];
            "".length();
            if (((113 + 140 - 81 + 16 ^ 59 + 46 + 15 + 35) & (0x7E ^ 0x46 ^ (0x27 ^ 0x38) ^ -" ".length())) > 0) {
                return (0x23 ^ 0x5 ^ (0x27 ^ 0x34)) & (0xD7 ^ 0xA6 ^ (0x39 ^ 0x7D) ^ -" ".length());
            }
        }
        else {
            n = BlockSponge.lIlllIIIlllIIl[0];
        }
        return n;
    }
    
    @Override
    public void onNeighborBlockChange(final World llllllllllllIlllllIlIlIlIIlIllll, final BlockPos llllllllllllIlllllIlIlIlIIlIlllI, final IBlockState llllllllllllIlllllIlIlIlIIllIIlI, final Block llllllllllllIlllllIlIlIlIIllIIIl) {
        this.tryAbsorb(llllllllllllIlllllIlIlIlIIlIllll, llllllllllllIlllllIlIlIlIIlIlllI, llllllllllllIlllllIlIlIlIIllIIlI);
        super.onNeighborBlockChange(llllllllllllIlllllIlIlIlIIlIllll, llllllllllllIlllllIlIlIlIIlIlllI, llllllllllllIlllllIlIlIlIIllIIlI, llllllllllllIlllllIlIlIlIIllIIIl);
    }
    
    private static boolean lIIIIIIlIlllllII(final int llllllllllllIlllllIlIlIIlIlIlIIl, final int llllllllllllIlllllIlIlIIlIlIlIII) {
        return llllllllllllIlllllIlIlIIlIlIlIIl < llllllllllllIlllllIlIlIIlIlIlIII;
    }
    
    private static boolean lIIIIIIlIlllllIl(final int llllllllllllIlllllIlIlIIlIlIllIl, final int llllllllllllIlllllIlIlIIlIlIllII) {
        return llllllllllllIlllllIlIlIIlIlIllIl >= llllllllllllIlllllIlIlIIlIlIllII;
    }
    
    @Override
    public void randomDisplayTick(final World llllllllllllIlllllIlIlIIllIllIll, final BlockPos llllllllllllIlllllIlIlIIllIlIIlI, final IBlockState llllllllllllIlllllIlIlIIllIllIIl, final Random llllllllllllIlllllIlIlIIllIllIII) {
        if (lIIIIIIlIllllIIl(((boolean)llllllllllllIlllllIlIlIIllIllIIl.getValue((IProperty<Boolean>)BlockSponge.WET)) ? 1 : 0)) {
            final EnumFacing llllllllllllIlllllIlIlIIllIlIlll = EnumFacing.random(llllllllllllIlllllIlIlIIllIllIII);
            if (lIIIIIIllIIIIIIl(llllllllllllIlllllIlIlIIllIlIlll, EnumFacing.UP) && lIIIIIIlIllllIlI(World.doesBlockHaveSolidTopSurface(llllllllllllIlllllIlIlIIllIllIll, llllllllllllIlllllIlIlIIllIlIIlI.offset(llllllllllllIlllllIlIlIIllIlIlll)) ? 1 : 0)) {
                double llllllllllllIlllllIlIlIIllIlIllI = llllllllllllIlllllIlIlIIllIlIIlI.getX();
                double llllllllllllIlllllIlIlIIllIlIlIl = llllllllllllIlllllIlIlIIllIlIIlI.getY();
                double llllllllllllIlllllIlIlIIllIlIlII = llllllllllllIlllllIlIlIIllIlIIlI.getZ();
                if (lIIIIIIlIllllIll(llllllllllllIlllllIlIlIIllIlIlll, EnumFacing.DOWN)) {
                    llllllllllllIlllllIlIlIIllIlIlIl -= 0.05;
                    llllllllllllIlllllIlIlIIllIlIllI += llllllllllllIlllllIlIlIIllIllIII.nextDouble();
                    llllllllllllIlllllIlIlIIllIlIlII += llllllllllllIlllllIlIlIIllIllIII.nextDouble();
                    "".length();
                    if ("   ".length() <= 0) {
                        return;
                    }
                }
                else {
                    llllllllllllIlllllIlIlIIllIlIlIl += llllllllllllIlllllIlIlIIllIllIII.nextDouble() * 0.8;
                    if (lIIIIIIlIllllIll(llllllllllllIlllllIlIlIIllIlIlll.getAxis(), EnumFacing.Axis.X)) {
                        llllllllllllIlllllIlIlIIllIlIlII += llllllllllllIlllllIlIlIIllIllIII.nextDouble();
                        if (lIIIIIIlIllllIll(llllllllllllIlllllIlIlIIllIlIlll, EnumFacing.EAST)) {
                            ++llllllllllllIlllllIlIlIIllIlIllI;
                            "".length();
                            if ("  ".length() <= ((169 + 67 - 110 + 94 ^ 117 + 50 - 164 + 126) & (206 + 113 - 306 + 212 ^ 105 + 93 - 146 + 136 ^ -" ".length()))) {
                                return;
                            }
                        }
                        else {
                            llllllllllllIlllllIlIlIIllIlIllI += 0.05;
                            "".length();
                            if (null != null) {
                                return;
                            }
                        }
                    }
                    else {
                        llllllllllllIlllllIlIlIIllIlIllI += llllllllllllIlllllIlIlIIllIllIII.nextDouble();
                        if (lIIIIIIlIllllIll(llllllllllllIlllllIlIlIIllIlIlll, EnumFacing.SOUTH)) {
                            ++llllllllllllIlllllIlIlIIllIlIlII;
                            "".length();
                            if ("   ".length() < 0) {
                                return;
                            }
                        }
                        else {
                            llllllllllllIlllllIlIlIIllIlIlII += 0.05;
                        }
                    }
                }
                llllllllllllIlllllIlIlIIllIllIll.spawnParticle(EnumParticleTypes.DRIP_WATER, llllllllllllIlllllIlIlIIllIlIllI, llllllllllllIlllllIlIlIIllIlIlIl, llllllllllllIlllllIlIlIIllIlIlII, 0.0, 0.0, 0.0, new int[BlockSponge.lIlllIIIlllIIl[0]]);
            }
        }
    }
    
    @Override
    public int damageDropped(final IBlockState llllllllllllIlllllIlIlIlIlIIIlll) {
        int n;
        if (lIIIIIIlIllllIIl(((boolean)llllllllllllIlllllIlIlIlIlIIIlll.getValue((IProperty<Boolean>)BlockSponge.WET)) ? 1 : 0)) {
            n = BlockSponge.lIlllIIIlllIIl[1];
            "".length();
            if ("   ".length() == " ".length()) {
                return (0x6B ^ 0x41) & ~(0xAF ^ 0x85);
            }
        }
        else {
            n = BlockSponge.lIlllIIIlllIIl[0];
        }
        return n;
    }
}
