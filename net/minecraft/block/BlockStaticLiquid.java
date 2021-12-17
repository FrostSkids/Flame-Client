// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class BlockStaticLiquid extends BlockLiquid
{
    private static final /* synthetic */ String[] llIlIlIlllIIll;
    private static final /* synthetic */ int[] llIlIlIlllIlII;
    
    private static String lIIlIlIIlIlIllII(String llllllllllllIllIlIlIIIIIlIlllIIl, final String llllllllllllIllIlIlIIIIIlIllllIl) {
        llllllllllllIllIlIlIIIIIlIlllIIl = (boolean)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIlIIIIIlIlllIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIlIIIIIlIllllII = new StringBuilder();
        final char[] llllllllllllIllIlIlIIIIIlIlllIll = llllllllllllIllIlIlIIIIIlIllllIl.toCharArray();
        int llllllllllllIllIlIlIIIIIlIlllIlI = BlockStaticLiquid.llIlIlIlllIlII[0];
        final int llllllllllllIllIlIlIIIIIlIllIlII = (Object)((String)llllllllllllIllIlIlIIIIIlIlllIIl).toCharArray();
        final byte llllllllllllIllIlIlIIIIIlIllIIll = (byte)llllllllllllIllIlIlIIIIIlIllIlII.length;
        boolean llllllllllllIllIlIlIIIIIlIllIIlI = BlockStaticLiquid.llIlIlIlllIlII[0] != 0;
        while (lIIlIlIIlIllIlII(llllllllllllIllIlIlIIIIIlIllIIlI ? 1 : 0, llllllllllllIllIlIlIIIIIlIllIIll)) {
            final char llllllllllllIllIlIlIIIIIlIllllll = llllllllllllIllIlIlIIIIIlIllIlII[llllllllllllIllIlIlIIIIIlIllIIlI];
            llllllllllllIllIlIlIIIIIlIllllII.append((char)(llllllllllllIllIlIlIIIIIlIllllll ^ llllllllllllIllIlIlIIIIIlIlllIll[llllllllllllIllIlIlIIIIIlIlllIlI % llllllllllllIllIlIlIIIIIlIlllIll.length]));
            "".length();
            ++llllllllllllIllIlIlIIIIIlIlllIlI;
            ++llllllllllllIllIlIlIIIIIlIllIIlI;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIlIIIIIlIllllII);
    }
    
    private void updateLiquid(final World llllllllllllIllIlIlIIIIlIIIIIlIl, final BlockPos llllllllllllIllIlIlIIIIIllllllll, final IBlockState llllllllllllIllIlIlIIIIlIIIIIIll) {
        final BlockDynamicLiquid llllllllllllIllIlIlIIIIlIIIIIIlI = BlockLiquid.getFlowingBlock(this.blockMaterial);
        llllllllllllIllIlIlIIIIlIIIIIlIl.setBlockState(llllllllllllIllIlIlIIIIIllllllll, llllllllllllIllIlIlIIIIlIIIIIIlI.getDefaultState().withProperty((IProperty<Comparable>)BlockStaticLiquid.LEVEL, (Integer)llllllllllllIllIlIlIIIIlIIIIIIll.getValue((IProperty<V>)BlockStaticLiquid.LEVEL)), BlockStaticLiquid.llIlIlIlllIlII[2]);
        "".length();
        llllllllllllIllIlIlIIIIlIIIIIlIl.scheduleUpdate(llllllllllllIllIlIlIIIIIllllllll, llllllllllllIllIlIlIIIIlIIIIIIlI, this.tickRate(llllllllllllIllIlIlIIIIlIIIIIlIl));
    }
    
    private static boolean lIIlIlIIlIllIIll(final int llllllllllllIllIlIlIIIIIlIlIlllI, final int llllllllllllIllIlIlIIIIIlIlIllIl) {
        return llllllllllllIllIlIlIIIIIlIlIlllI >= llllllllllllIllIlIlIIIIIlIlIllIl;
    }
    
    private static boolean lIIlIlIIlIllIIlI(final int llllllllllllIllIlIlIIIIIlIIlllll) {
        return llllllllllllIllIlIlIIIIIlIIlllll > 0;
    }
    
    protected BlockStaticLiquid(final Material llllllllllllIllIlIlIIIIlIIIllIIl) {
        super(llllllllllllIllIlIlIIIIlIIIllIIl);
        this.setTickRandomly((boolean)(BlockStaticLiquid.llIlIlIlllIlII[0] != 0));
        "".length();
        if (lIIlIlIIlIlIllll(llllllllllllIllIlIlIIIIlIIIllIIl, Material.lava)) {
            this.setTickRandomly((boolean)(BlockStaticLiquid.llIlIlIlllIlII[1] != 0));
            "".length();
        }
    }
    
    static {
        lIIlIlIIlIlIlllI();
        lIIlIlIIlIlIllIl();
    }
    
    private static boolean lIIlIlIIlIllIIII(final int llllllllllllIllIlIlIIIIIlIlIIIIl) {
        return llllllllllllIllIlIlIIIIIlIlIIIIl == 0;
    }
    
    @Override
    public void onNeighborBlockChange(final World llllllllllllIllIlIlIIIIlIIIlIIll, final BlockPos llllllllllllIllIlIlIIIIlIIIIllIl, final IBlockState llllllllllllIllIlIlIIIIlIIIlIIIl, final Block llllllllllllIllIlIlIIIIlIIIlIIII) {
        if (lIIlIlIIlIllIIII(this.checkForMixing(llllllllllllIllIlIlIIIIlIIIlIIll, llllllllllllIllIlIlIIIIlIIIIllIl, llllllllllllIllIlIlIIIIlIIIlIIIl) ? 1 : 0)) {
            this.updateLiquid(llllllllllllIllIlIlIIIIlIIIlIIll, llllllllllllIllIlIlIIIIlIIIIllIl, llllllllllllIllIlIlIIIIlIIIlIIIl);
        }
    }
    
    private boolean getCanBlockBurn(final World llllllllllllIllIlIlIIIIIllIIlIlI, final BlockPos llllllllllllIllIlIlIIIIIllIIlIll) {
        return llllllllllllIllIlIlIIIIIllIIlIlI.getBlockState(llllllllllllIllIlIlIIIIIllIIlIll).getBlock().getMaterial().getCanBurn();
    }
    
    private static boolean lIIlIlIIlIllIlII(final int llllllllllllIllIlIlIIIIIlIlIlIlI, final int llllllllllllIllIlIlIIIIIlIlIlIIl) {
        return llllllllllllIllIlIlIIIIIlIlIlIlI < llllllllllllIllIlIlIIIIIlIlIlIIl;
    }
    
    private static void lIIlIlIIlIlIlllI() {
        (llIlIlIlllIlII = new int[4])[0] = ((0xB4 ^ 0x8B) & ~(0x55 ^ 0x6A));
        BlockStaticLiquid.llIlIlIlllIlII[1] = " ".length();
        BlockStaticLiquid.llIlIlIlllIlII[2] = "  ".length();
        BlockStaticLiquid.llIlIlIlllIlII[3] = "   ".length();
    }
    
    private static boolean lIIlIlIIlIlIllll(final Object llllllllllllIllIlIlIIIIIlIlIIllI, final Object llllllllllllIllIlIlIIIIIlIlIIlIl) {
        return llllllllllllIllIlIlIIIIIlIlIIllI == llllllllllllIllIlIlIIIIIlIlIIlIl;
    }
    
    private static void lIIlIlIIlIlIllIl() {
        (llIlIlIlllIIll = new String[BlockStaticLiquid.llIlIlIlllIlII[1]])[BlockStaticLiquid.llIlIlIlllIlII[0]] = lIIlIlIIlIlIllII("CDYAHhkJDS8UAA==", "lYFwk");
    }
    
    private static boolean lIIlIlIIlIllIIIl(final int llllllllllllIllIlIlIIIIIlIlIIIll) {
        return llllllllllllIllIlIlIIIIIlIlIIIll != 0;
    }
    
    @Override
    public void updateTick(final World llllllllllllIllIlIlIIIIIlllIlIII, final BlockPos llllllllllllIllIlIlIIIIIllllIIlI, final IBlockState llllllllllllIllIlIlIIIIIllllIIIl, final Random llllllllllllIllIlIlIIIIIllllIIII) {
        if (lIIlIlIIlIlIllll(this.blockMaterial, Material.lava) && lIIlIlIIlIllIIIl(llllllllllllIllIlIlIIIIIlllIlIII.getGameRules().getBoolean(BlockStaticLiquid.llIlIlIlllIIll[BlockStaticLiquid.llIlIlIlllIlII[0]]) ? 1 : 0)) {
            final int llllllllllllIllIlIlIIIIIlllIllll = llllllllllllIllIlIlIIIIIllllIIII.nextInt(BlockStaticLiquid.llIlIlIlllIlII[3]);
            if (lIIlIlIIlIllIIlI(llllllllllllIllIlIlIIIIIlllIllll)) {
                BlockPos llllllllllllIllIlIlIIIIIlllIlllI = llllllllllllIllIlIlIIIIIllllIIlI;
                int llllllllllllIllIlIlIIIIIlllIllIl = BlockStaticLiquid.llIlIlIlllIlII[0];
                "".length();
                if (-(0xB3 ^ 0xB7) > 0) {
                    return;
                }
                while (!lIIlIlIIlIllIIll(llllllllllllIllIlIlIIIIIlllIllIl, llllllllllllIllIlIlIIIIIlllIllll)) {
                    llllllllllllIllIlIlIIIIIlllIlllI = llllllllllllIllIlIlIIIIIlllIlllI.add(llllllllllllIllIlIlIIIIIllllIIII.nextInt(BlockStaticLiquid.llIlIlIlllIlII[3]) - BlockStaticLiquid.llIlIlIlllIlII[1], BlockStaticLiquid.llIlIlIlllIlII[1], llllllllllllIllIlIlIIIIIllllIIII.nextInt(BlockStaticLiquid.llIlIlIlllIlII[3]) - BlockStaticLiquid.llIlIlIlllIlII[1]);
                    final Block llllllllllllIllIlIlIIIIIlllIllII = llllllllllllIllIlIlIIIIIlllIlIII.getBlockState(llllllllllllIllIlIlIIIIIlllIlllI).getBlock();
                    if (lIIlIlIIlIlIllll(llllllllllllIllIlIlIIIIIlllIllII.blockMaterial, Material.air)) {
                        if (lIIlIlIIlIllIIIl(this.isSurroundingBlockFlammable(llllllllllllIllIlIlIIIIIlllIlIII, llllllllllllIllIlIlIIIIIlllIlllI) ? 1 : 0)) {
                            llllllllllllIllIlIlIIIIIlllIlIII.setBlockState(llllllllllllIllIlIlIIIIIlllIlllI, Blocks.fire.getDefaultState());
                            "".length();
                            return;
                        }
                    }
                    else if (lIIlIlIIlIllIIIl(llllllllllllIllIlIlIIIIIlllIllII.blockMaterial.blocksMovement() ? 1 : 0)) {
                        return;
                    }
                    ++llllllllllllIllIlIlIIIIIlllIllIl;
                }
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            else {
                int llllllllllllIllIlIlIIIIIlllIlIll = BlockStaticLiquid.llIlIlIlllIlII[0];
                "".length();
                if (-(0x6 ^ 0x2) > 0) {
                    return;
                }
                while (!lIIlIlIIlIllIIll(llllllllllllIllIlIlIIIIIlllIlIll, BlockStaticLiquid.llIlIlIlllIlII[3])) {
                    final BlockPos llllllllllllIllIlIlIIIIIlllIlIlI = llllllllllllIllIlIlIIIIIllllIIlI.add(llllllllllllIllIlIlIIIIIllllIIII.nextInt(BlockStaticLiquid.llIlIlIlllIlII[3]) - BlockStaticLiquid.llIlIlIlllIlII[1], BlockStaticLiquid.llIlIlIlllIlII[0], llllllllllllIllIlIlIIIIIllllIIII.nextInt(BlockStaticLiquid.llIlIlIlllIlII[3]) - BlockStaticLiquid.llIlIlIlllIlII[1]);
                    if (lIIlIlIIlIllIIIl(llllllllllllIllIlIlIIIIIlllIlIII.isAirBlock(llllllllllllIllIlIlIIIIIlllIlIlI.up()) ? 1 : 0) && lIIlIlIIlIllIIIl(this.getCanBlockBurn(llllllllllllIllIlIlIIIIIlllIlIII, llllllllllllIllIlIlIIIIIlllIlIlI) ? 1 : 0)) {
                        llllllllllllIllIlIlIIIIIlllIlIII.setBlockState(llllllllllllIllIlIlIIIIIlllIlIlI.up(), Blocks.fire.getDefaultState());
                        "".length();
                    }
                    ++llllllllllllIllIlIlIIIIIlllIlIll;
                }
            }
        }
    }
    
    protected boolean isSurroundingBlockFlammable(final World llllllllllllIllIlIlIIIIIllIlIlIl, final BlockPos llllllllllllIllIlIlIIIIIllIllIII) {
        final boolean llllllllllllIllIlIlIIIIIllIlIIII;
        final double llllllllllllIllIlIlIIIIIllIlIIIl = ((EnumFacing[])(Object)(llllllllllllIllIlIlIIIIIllIlIIII = (boolean)(Object)EnumFacing.values())).length;
        float llllllllllllIllIlIlIIIIIllIlIIlI = BlockStaticLiquid.llIlIlIlllIlII[0];
        "".length();
        if ("  ".length() < " ".length()) {
            return ((0xEA ^ 0xBF) & ~(0xE5 ^ 0xB0)) != 0x0;
        }
        while (!lIIlIlIIlIllIIll((int)llllllllllllIllIlIlIIIIIllIlIIlI, (int)llllllllllllIllIlIlIIIIIllIlIIIl)) {
            final EnumFacing llllllllllllIllIlIlIIIIIllIlIlll = llllllllllllIllIlIlIIIIIllIlIIII[llllllllllllIllIlIlIIIIIllIlIIlI];
            if (lIIlIlIIlIllIIIl(this.getCanBlockBurn(llllllllllllIllIlIlIIIIIllIlIlIl, llllllllllllIllIlIlIIIIIllIllIII.offset(llllllllllllIllIlIlIIIIIllIlIlll)) ? 1 : 0)) {
                return BlockStaticLiquid.llIlIlIlllIlII[1] != 0;
            }
            ++llllllllllllIllIlIlIIIIIllIlIIlI;
        }
        return BlockStaticLiquid.llIlIlIlllIlII[0] != 0;
    }
}
