// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyBool;

public class BlockRailPowered extends BlockRailBase
{
    private static final /* synthetic */ String[] lIIlllIlIIIIIl;
    private static final /* synthetic */ int[] lIIlllIlIIIlII;
    public static final /* synthetic */ PropertyBool POWERED;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$block$BlockRailBase$EnumRailDirection;
    public static final /* synthetic */ PropertyEnum<EnumRailDirection> SHAPE;
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockRailPowered.lIIlllIlIIIlII[5]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockRailPowered.lIIlllIlIIIlII[0]] = BlockRailPowered.SHAPE;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockRailPowered.lIIlllIlIIIlII[1]] = BlockRailPowered.POWERED;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public IProperty<EnumRailDirection> getShapeProperty() {
        return BlockRailPowered.SHAPE;
    }
    
    private static boolean llIllIllIlllIII(final Object lllllllllllllIIlIIlllllllIlIlllI) {
        return lllllllllllllIIlIIlllllllIlIlllI != null;
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIlIIlllllllllIIIII) {
        int lllllllllllllIIlIIllllllllIlllll = BlockRailPowered.lIIlllIlIIIlII[0];
        lllllllllllllIIlIIllllllllIlllll |= lllllllllllllIIlIIlllllllllIIIII.getValue(BlockRailPowered.SHAPE).getMetadata();
        if (llIllIllIllIIII(((boolean)lllllllllllllIIlIIlllllllllIIIII.getValue((IProperty<Boolean>)BlockRailPowered.POWERED)) ? 1 : 0)) {
            lllllllllllllIIlIIllllllllIlllll |= BlockRailPowered.lIIlllIlIIIlII[2];
        }
        return lllllllllllllIIlIIllllllllIlllll;
    }
    
    private static boolean llIllIllIllIllI(final int lllllllllllllIIlIIlllllllIlIIlIl, final int lllllllllllllIIlIIlllllllIlIIlII) {
        return lllllllllllllIIlIIlllllllIlIIlIl != lllllllllllllIIlIIlllllllIlIIlII;
    }
    
    protected BlockRailPowered() {
        super((boolean)(BlockRailPowered.lIIlllIlIIIlII[1] != 0));
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockRailPowered.SHAPE, EnumRailDirection.NORTH_SOUTH).withProperty((IProperty<Comparable>)BlockRailPowered.POWERED, (boolean)(BlockRailPowered.lIIlllIlIIIlII[0] != 0)));
    }
    
    private static boolean llIllIllIllIIll(final Object lllllllllllllIIlIIlllllllIllIlIl, final Object lllllllllllllIIlIIlllllllIllIlII) {
        return lllllllllllllIIlIIlllllllIllIlIl != lllllllllllllIIlIIlllllllIllIlII;
    }
    
    static {
        llIllIllIlIlIll();
        llIllIllIlIIllI();
        SHAPE = PropertyEnum.create(BlockRailPowered.lIIlllIlIIIIIl[BlockRailPowered.lIIlllIlIIIlII[0]], EnumRailDirection.class, (com.google.common.base.Predicate<EnumRailDirection>)new Predicate<EnumRailDirection>() {
            private static final /* synthetic */ int[] lIIIIlIlIllIll;
            
            static {
                lIlllIlIIIlIIII();
            }
            
            public boolean apply(final EnumRailDirection lllllllllllllIlIIlIlIllIIIlIIIlI) {
                if (lIlllIlIIIlIIIl(lllllllllllllIlIIlIlIllIIIlIIIlI, EnumRailDirection.NORTH_EAST) && lIlllIlIIIlIIIl(lllllllllllllIlIIlIlIllIIIlIIIlI, EnumRailDirection.NORTH_WEST) && lIlllIlIIIlIIIl(lllllllllllllIlIIlIlIllIIIlIIIlI, EnumRailDirection.SOUTH_EAST) && lIlllIlIIIlIIIl(lllllllllllllIlIIlIlIllIIIlIIIlI, EnumRailDirection.SOUTH_WEST)) {
                    return BlockRailPowered$1.lIIIIlIlIllIll[0] != 0;
                }
                return BlockRailPowered$1.lIIIIlIlIllIll[1] != 0;
            }
            
            private static boolean lIlllIlIIIlIIIl(final Object lllllllllllllIlIIlIlIllIIIIlIIlI, final Object lllllllllllllIlIIlIlIllIIIIlIIIl) {
                return lllllllllllllIlIIlIlIllIIIIlIIlI != lllllllllllllIlIIlIlIllIIIIlIIIl;
            }
            
            private static void lIlllIlIIIlIIII() {
                (lIIIIlIlIllIll = new int[2])[0] = " ".length();
                BlockRailPowered$1.lIIIIlIlIllIll[1] = ((30 + 144 - 143 + 152 ^ 66 + 115 - 163 + 153) & (0x2A ^ 0x15 ^ (0x7D ^ 0x5E) ^ -" ".length()));
            }
        });
        POWERED = PropertyBool.create(BlockRailPowered.lIIlllIlIIIIIl[BlockRailPowered.lIIlllIlIIIlII[1]]);
    }
    
    private static String llIllIllIlIIlIl(String lllllllllllllIIlIIllllllllIIlIII, final String lllllllllllllIIlIIllllllllIIIlll) {
        lllllllllllllIIlIIllllllllIIlIII = new String(Base64.getDecoder().decode(lllllllllllllIIlIIllllllllIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIllllllllIIlIll = new StringBuilder();
        final char[] lllllllllllllIIlIIllllllllIIlIlI = lllllllllllllIIlIIllllllllIIIlll.toCharArray();
        int lllllllllllllIIlIIllllllllIIlIIl = BlockRailPowered.lIIlllIlIIIlII[0];
        final int lllllllllllllIIlIIllllllllIIIIll = (Object)lllllllllllllIIlIIllllllllIIlIII.toCharArray();
        final boolean lllllllllllllIIlIIllllllllIIIIlI = lllllllllllllIIlIIllllllllIIIIll.length != 0;
        String lllllllllllllIIlIIllllllllIIIIIl = (String)BlockRailPowered.lIIlllIlIIIlII[0];
        while (llIllIllIlllIIl((int)lllllllllllllIIlIIllllllllIIIIIl, lllllllllllllIIlIIllllllllIIIIlI ? 1 : 0)) {
            final char lllllllllllllIIlIIllllllllIIlllI = lllllllllllllIIlIIllllllllIIIIll[lllllllllllllIIlIIllllllllIIIIIl];
            lllllllllllllIIlIIllllllllIIlIll.append((char)(lllllllllllllIIlIIllllllllIIlllI ^ lllllllllllllIIlIIllllllllIIlIlI[lllllllllllllIIlIIllllllllIIlIIl % lllllllllllllIIlIIllllllllIIlIlI.length]));
            "".length();
            ++lllllllllllllIIlIIllllllllIIlIIl;
            ++lllllllllllllIIlIIllllllllIIIIIl;
            "".length();
            if (((42 + 107 - 140 + 124 ^ 64 + 39 - 11 + 37) & (84 + 1 + 29 + 31 ^ 69 + 51 - 39 + 68 ^ -" ".length())) == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIllllllllIIlIll);
    }
    
    protected boolean func_176566_a(final World lllllllllllllIIlIlIIIIIIIIIlllll, final BlockPos lllllllllllllIIlIlIIIIIIIIIllllI, final IBlockState lllllllllllllIIlIlIIIIIIIIlIlIII, final boolean lllllllllllllIIlIlIIIIIIIIlIIlll, final int lllllllllllllIIlIlIIIIIIIIIllIll) {
        if (llIllIllIlIllll(lllllllllllllIIlIlIIIIIIIIIllIll, BlockRailPowered.lIIlllIlIIIlII[2])) {
            return BlockRailPowered.lIIlllIlIIIlII[0] != 0;
        }
        int lllllllllllllIIlIlIIIIIIIIlIIlIl = lllllllllllllIIlIlIIIIIIIIIllllI.getX();
        int lllllllllllllIIlIlIIIIIIIIlIIlII = lllllllllllllIIlIlIIIIIIIIIllllI.getY();
        int lllllllllllllIIlIlIIIIIIIIlIIIll = lllllllllllllIIlIlIIIIIIIIIllllI.getZ();
        boolean lllllllllllllIIlIlIIIIIIIIlIIIlI = BlockRailPowered.lIIlllIlIIIlII[1] != 0;
        EnumRailDirection lllllllllllllIIlIlIIIIIIIIlIIIIl = lllllllllllllIIlIlIIIIIIIIlIlIII.getValue(BlockRailPowered.SHAPE);
        switch ($SWITCH_TABLE$net$minecraft$block$BlockRailBase$EnumRailDirection()[lllllllllllllIIlIlIIIIIIIIlIIIIl.ordinal()]) {
            case 1: {
                if (llIllIllIllIIII(lllllllllllllIIlIlIIIIIIIIlIIlll ? 1 : 0)) {
                    ++lllllllllllllIIlIlIIIIIIIIlIIIll;
                    "".length();
                    if (((0xB ^ 0x4E) & ~(0x58 ^ 0x1D)) >= " ".length()) {
                        return ((0x62 ^ 0x5F) & ~(0xAC ^ 0x91)) != 0x0;
                    }
                    break;
                }
                else {
                    --lllllllllllllIIlIlIIIIIIIIlIIIll;
                    "".length();
                    if ("   ".length() == 0) {
                        return ((112 + 50 - 47 + 31 ^ 39 + 55 + 29 + 73) & (202 + 49 - 239 + 221 ^ 86 + 135 - 144 + 114 ^ -" ".length())) != 0x0;
                    }
                    break;
                }
                break;
            }
            case 2: {
                if (llIllIllIllIIII(lllllllllllllIIlIlIIIIIIIIlIIlll ? 1 : 0)) {
                    --lllllllllllllIIlIlIIIIIIIIlIIlIl;
                    "".length();
                    if ("   ".length() <= "  ".length()) {
                        return ((117 + 153 - 224 + 109 ^ 78 + 28 - 85 + 127) & (0x57 ^ 0x7D ^ (0x92 ^ 0xB7) ^ -" ".length())) != 0x0;
                    }
                    break;
                }
                else {
                    ++lllllllllllllIIlIlIIIIIIIIlIIlIl;
                    "".length();
                    if (((0x6A ^ 0x6E) & ~(0xB7 ^ 0xB3)) > " ".length()) {
                        return ((0x49 ^ 0x55) & ~(0xDF ^ 0xC3)) != 0x0;
                    }
                    break;
                }
                break;
            }
            case 3: {
                if (llIllIllIllIIII(lllllllllllllIIlIlIIIIIIIIlIIlll ? 1 : 0)) {
                    --lllllllllllllIIlIlIIIIIIIIlIIlIl;
                    "".length();
                    if (null != null) {
                        return ((0x27 ^ 0x6 ^ (0x7E ^ 0x6C)) & (44 + 152 - 156 + 134 ^ 104 + 85 - 107 + 75 ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    ++lllllllllllllIIlIlIIIIIIIIlIIlIl;
                    ++lllllllllllllIIlIlIIIIIIIIlIIlII;
                    lllllllllllllIIlIlIIIIIIIIlIIIlI = (BlockRailPowered.lIIlllIlIIIlII[0] != 0);
                }
                lllllllllllllIIlIlIIIIIIIIlIIIIl = EnumRailDirection.EAST_WEST;
                "".length();
                if (((0x6C ^ 0x41) & ~(0x90 ^ 0xBD)) >= "  ".length()) {
                    return ((0x64 ^ 0x75) & ~(0x50 ^ 0x41)) != 0x0;
                }
                break;
            }
            case 4: {
                if (llIllIllIllIIII(lllllllllllllIIlIlIIIIIIIIlIIlll ? 1 : 0)) {
                    --lllllllllllllIIlIlIIIIIIIIlIIlIl;
                    ++lllllllllllllIIlIlIIIIIIIIlIIlII;
                    lllllllllllllIIlIlIIIIIIIIlIIIlI = (BlockRailPowered.lIIlllIlIIIlII[0] != 0);
                    "".length();
                    if (((0xAB ^ 0xA5) & ~(0x68 ^ 0x66)) > ((0xD8 ^ 0xC4) & ~(0x85 ^ 0x99))) {
                        return ((0x53 ^ 0x76) & ~(0x60 ^ 0x45)) != 0x0;
                    }
                }
                else {
                    ++lllllllllllllIIlIlIIIIIIIIlIIlIl;
                }
                lllllllllllllIIlIlIIIIIIIIlIIIIl = EnumRailDirection.EAST_WEST;
                "".length();
                if (" ".length() != " ".length()) {
                    return ((0x84 ^ 0x90) & ~(0x65 ^ 0x71)) != 0x0;
                }
                break;
            }
            case 5: {
                if (llIllIllIllIIII(lllllllllllllIIlIlIIIIIIIIlIIlll ? 1 : 0)) {
                    ++lllllllllllllIIlIlIIIIIIIIlIIIll;
                    "".length();
                    if (-" ".length() > 0) {
                        return ((0x5F ^ 0x7C ^ (0x24 ^ 0x40)) & (0x31 ^ 0x65 ^ (0x11 ^ 0x2) ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    --lllllllllllllIIlIlIIIIIIIIlIIIll;
                    ++lllllllllllllIIlIlIIIIIIIIlIIlII;
                    lllllllllllllIIlIlIIIIIIIIlIIIlI = (BlockRailPowered.lIIlllIlIIIlII[0] != 0);
                }
                lllllllllllllIIlIlIIIIIIIIlIIIIl = EnumRailDirection.NORTH_SOUTH;
                "".length();
                if ("  ".length() == 0) {
                    return ((0xB ^ 0x4) & ~(0x51 ^ 0x5E)) != 0x0;
                }
                break;
            }
            case 6: {
                if (llIllIllIllIIII(lllllllllllllIIlIlIIIIIIIIlIIlll ? 1 : 0)) {
                    ++lllllllllllllIIlIlIIIIIIIIlIIIll;
                    ++lllllllllllllIIlIlIIIIIIIIlIIlII;
                    lllllllllllllIIlIlIIIIIIIIlIIIlI = (BlockRailPowered.lIIlllIlIIIlII[0] != 0);
                    "".length();
                    if ((77 + 35 - 77 + 105 ^ 109 + 7 - 46 + 66) <= " ".length()) {
                        return ((136 + 65 - 119 + 133 ^ 23 + 61 - 53 + 110) & (0x42 ^ 0x55 ^ (0x64 ^ 0x29) ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    --lllllllllllllIIlIlIIIIIIIIlIIIll;
                }
                lllllllllllllIIlIlIIIIIIIIlIIIIl = EnumRailDirection.NORTH_SOUTH;
                break;
            }
        }
        int n;
        if (llIllIllIllIIII(this.func_176567_a(lllllllllllllIIlIlIIIIIIIIIlllll, new BlockPos(lllllllllllllIIlIlIIIIIIIIlIIlIl, lllllllllllllIIlIlIIIIIIIIlIIlII, lllllllllllllIIlIlIIIIIIIIlIIIll), lllllllllllllIIlIlIIIIIIIIlIIlll, lllllllllllllIIlIlIIIIIIIIIllIll, lllllllllllllIIlIlIIIIIIIIlIIIIl) ? 1 : 0)) {
            n = BlockRailPowered.lIIlllIlIIIlII[1];
            "".length();
            if (-"  ".length() >= 0) {
                return ((0xF ^ 0x7) & ~(0x56 ^ 0x5E)) != 0x0;
            }
        }
        else if (llIllIllIllIIII(lllllllllllllIIlIlIIIIIIIIlIIIlI ? 1 : 0) && llIllIllIllIIII(this.func_176567_a(lllllllllllllIIlIlIIIIIIIIIlllll, new BlockPos(lllllllllllllIIlIlIIIIIIIIlIIlIl, lllllllllllllIIlIlIIIIIIIIlIIlII - BlockRailPowered.lIIlllIlIIIlII[1], lllllllllllllIIlIlIIIIIIIIlIIIll), lllllllllllllIIlIlIIIIIIIIlIIlll, lllllllllllllIIlIlIIIIIIIIIllIll, lllllllllllllIIlIlIIIIIIIIlIIIIl) ? 1 : 0)) {
            n = BlockRailPowered.lIIlllIlIIIlII[1];
            "".length();
            if (-" ".length() > 0) {
                return ((0x2F ^ 0x3B) & ~(0x53 ^ 0x47)) != 0x0;
            }
        }
        else {
            n = BlockRailPowered.lIIlllIlIIIlII[0];
        }
        return n != 0;
    }
    
    @Override
    protected void onNeighborChangedInternal(final World lllllllllllllIIlIIllllllllllIllI, final BlockPos lllllllllllllIIlIIllllllllllIlIl, final IBlockState lllllllllllllIIlIIllllllllllIlII, final Block lllllllllllllIIlIIllllllllllIIll) {
        final boolean lllllllllllllIIlIIllllllllllIIlI = lllllllllllllIIlIIllllllllllIlII.getValue((IProperty<Boolean>)BlockRailPowered.POWERED);
        int n;
        if (llIllIllIllIlIl(lllllllllllllIIlIIllllllllllIllI.isBlockPowered(lllllllllllllIIlIIllllllllllIlIl) ? 1 : 0) && llIllIllIllIlIl(this.func_176566_a(lllllllllllllIIlIIllllllllllIllI, lllllllllllllIIlIIllllllllllIlIl, lllllllllllllIIlIIllllllllllIlII, (boolean)(BlockRailPowered.lIIlllIlIIIlII[1] != 0), BlockRailPowered.lIIlllIlIIIlII[0]) ? 1 : 0) && llIllIllIllIlIl(this.func_176566_a(lllllllllllllIIlIIllllllllllIllI, lllllllllllllIIlIIllllllllllIlIl, lllllllllllllIIlIIllllllllllIlII, (boolean)(BlockRailPowered.lIIlllIlIIIlII[0] != 0), BlockRailPowered.lIIlllIlIIIlII[0]) ? 1 : 0)) {
            n = BlockRailPowered.lIIlllIlIIIlII[0];
            "".length();
            if (-(0xC4 ^ 0xC0) >= 0) {
                return;
            }
        }
        else {
            n = BlockRailPowered.lIIlllIlIIIlII[1];
        }
        final boolean lllllllllllllIIlIIllllllllllIIIl = n != 0;
        if (llIllIllIllIllI(lllllllllllllIIlIIllllllllllIIIl ? 1 : 0, lllllllllllllIIlIIllllllllllIIlI ? 1 : 0)) {
            lllllllllllllIIlIIllllllllllIllI.setBlockState(lllllllllllllIIlIIllllllllllIlIl, lllllllllllllIIlIIllllllllllIlII.withProperty((IProperty<Comparable>)BlockRailPowered.POWERED, lllllllllllllIIlIIllllllllllIIIl), BlockRailPowered.lIIlllIlIIIlII[3]);
            "".length();
            lllllllllllllIIlIIllllllllllIllI.notifyNeighborsOfStateChange(lllllllllllllIIlIIllllllllllIlIl.down(), this);
            if (llIllIllIllIIII(lllllllllllllIIlIIllllllllllIlII.getValue(BlockRailPowered.SHAPE).isAscending() ? 1 : 0)) {
                lllllllllllllIIlIIllllllllllIllI.notifyNeighborsOfStateChange(lllllllllllllIIlIIllllllllllIlIl.up(), this);
            }
        }
    }
    
    private static boolean llIllIllIllIlIl(final int lllllllllllllIIlIIlllllllIlIlIlI) {
        return lllllllllllllIIlIIlllllllIlIlIlI == 0;
    }
    
    protected boolean func_176567_a(final World lllllllllllllIIlIlIIIIIIIIIIIlII, final BlockPos lllllllllllllIIlIlIIIIIIIIIIlIll, final boolean lllllllllllllIIlIlIIIIIIIIIIlIlI, final int lllllllllllllIIlIlIIIIIIIIIIIIIl, final EnumRailDirection lllllllllllllIIlIlIIIIIIIIIIlIII) {
        final IBlockState lllllllllllllIIlIlIIIIIIIIIIIlll = lllllllllllllIIlIlIIIIIIIIIIIlII.getBlockState(lllllllllllllIIlIlIIIIIIIIIIlIll);
        if (llIllIllIllIIll(lllllllllllllIIlIlIIIIIIIIIIIlll.getBlock(), this)) {
            return BlockRailPowered.lIIlllIlIIIlII[0] != 0;
        }
        final EnumRailDirection lllllllllllllIIlIlIIIIIIIIIIIllI = lllllllllllllIIlIlIIIIIIIIIIIlll.getValue(BlockRailPowered.SHAPE);
        int func_176566_a;
        if (!llIllIllIllIlII(lllllllllllllIIlIlIIIIIIIIIIlIII, EnumRailDirection.EAST_WEST) || (llIllIllIllIIll(lllllllllllllIIlIlIIIIIIIIIIIllI, EnumRailDirection.NORTH_SOUTH) && llIllIllIllIIll(lllllllllllllIIlIlIIIIIIIIIIIllI, EnumRailDirection.ASCENDING_NORTH) && llIllIllIllIIll(lllllllllllllIIlIlIIIIIIIIIIIllI, EnumRailDirection.ASCENDING_SOUTH))) {
            if (!llIllIllIllIlII(lllllllllllllIIlIlIIIIIIIIIIlIII, EnumRailDirection.NORTH_SOUTH) || (llIllIllIllIIll(lllllllllllllIIlIlIIIIIIIIIIIllI, EnumRailDirection.EAST_WEST) && llIllIllIllIIll(lllllllllllllIIlIlIIIIIIIIIIIllI, EnumRailDirection.ASCENDING_EAST) && llIllIllIllIIll(lllllllllllllIIlIlIIIIIIIIIIIllI, EnumRailDirection.ASCENDING_WEST))) {
                if (llIllIllIllIIII(((boolean)lllllllllllllIIlIlIIIIIIIIIIIlll.getValue((IProperty<Boolean>)BlockRailPowered.POWERED)) ? 1 : 0)) {
                    if (llIllIllIllIIII(lllllllllllllIIlIlIIIIIIIIIIIlII.isBlockPowered(lllllllllllllIIlIlIIIIIIIIIIlIll) ? 1 : 0)) {
                        func_176566_a = BlockRailPowered.lIIlllIlIIIlII[1];
                        "".length();
                        if (-(0x8C ^ 0x81 ^ (0x5D ^ 0x54)) > 0) {
                            return ((98 + 69 + 10 + 40 ^ 44 + 105 - 25 + 34) & (0x39 ^ 0x33 ^ (0x18 ^ 0x55) ^ -" ".length())) != 0x0;
                        }
                    }
                    else {
                        func_176566_a = (this.func_176566_a(lllllllllllllIIlIlIIIIIIIIIIIlII, lllllllllllllIIlIlIIIIIIIIIIlIll, lllllllllllllIIlIlIIIIIIIIIIIlll, lllllllllllllIIlIlIIIIIIIIIIlIlI, lllllllllllllIIlIlIIIIIIIIIIIIIl + BlockRailPowered.lIIlllIlIIIlII[1]) ? 1 : 0);
                        "".length();
                        if ("   ".length() == 0) {
                            return ((22 + 149 - 72 + 51 ^ 84 + 135 - 46 + 0) & (124 + 77 - 170 + 114 ^ 96 + 14 + 36 + 24 ^ -" ".length())) != 0x0;
                        }
                    }
                }
                else {
                    func_176566_a = BlockRailPowered.lIIlllIlIIIlII[0];
                    "".length();
                    if ("   ".length() <= 0) {
                        return ((0x55 ^ 0x64) & ~(0x39 ^ 0x8)) != 0x0;
                    }
                }
            }
            else {
                func_176566_a = BlockRailPowered.lIIlllIlIIIlII[0];
                "".length();
                if (null != null) {
                    return ((21 + 59 - 0 + 87 ^ 10 + 83 + 53 + 22) & (0xB1 ^ 0xB7 ^ (0x2A ^ 0x23) ^ -" ".length())) != 0x0;
                }
            }
        }
        else {
            func_176566_a = BlockRailPowered.lIIlllIlIIIlII[0];
        }
        return func_176566_a != 0;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$block$BlockRailBase$EnumRailDirection() {
        final int[] $switch_TABLE$net$minecraft$block$BlockRailBase$EnumRailDirection = BlockRailPowered.$SWITCH_TABLE$net$minecraft$block$BlockRailBase$EnumRailDirection;
        if (llIllIllIlllIII($switch_TABLE$net$minecraft$block$BlockRailBase$EnumRailDirection)) {
            return $switch_TABLE$net$minecraft$block$BlockRailBase$EnumRailDirection;
        }
        "".length();
        final short lllllllllllllIIlIIllllllllIllIII = (Object)new int[EnumRailDirection.values().length];
        try {
            lllllllllllllIIlIIllllllllIllIII[EnumRailDirection.ASCENDING_EAST.ordinal()] = BlockRailPowered.lIIlllIlIIIlII[3];
            "".length();
            if (((0x65 ^ 0x27) & ~(0xDA ^ 0x98)) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIlIIllllllllIllIII[EnumRailDirection.ASCENDING_NORTH.ordinal()] = BlockRailPowered.lIIlllIlIIIlII[6];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIlIIllllllllIllIII[EnumRailDirection.ASCENDING_SOUTH.ordinal()] = BlockRailPowered.lIIlllIlIIIlII[7];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIIlIIllllllllIllIII[EnumRailDirection.ASCENDING_WEST.ordinal()] = BlockRailPowered.lIIlllIlIIIlII[8];
            "".length();
            if ("  ".length() < -" ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIIlIIllllllllIllIII[EnumRailDirection.EAST_WEST.ordinal()] = BlockRailPowered.lIIlllIlIIIlII[5];
            "".length();
            if (" ".length() >= "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIIlIIllllllllIllIII[EnumRailDirection.NORTH_EAST.ordinal()] = BlockRailPowered.lIIlllIlIIIlII[9];
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        try {
            lllllllllllllIIlIIllllllllIllIII[EnumRailDirection.NORTH_SOUTH.ordinal()] = BlockRailPowered.lIIlllIlIIIlII[1];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError7) {
            "".length();
        }
        try {
            lllllllllllllIIlIIllllllllIllIII[EnumRailDirection.NORTH_WEST.ordinal()] = BlockRailPowered.lIIlllIlIIIlII[10];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError8) {
            "".length();
        }
        try {
            lllllllllllllIIlIIllllllllIllIII[EnumRailDirection.SOUTH_EAST.ordinal()] = BlockRailPowered.lIIlllIlIIIlII[4];
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError9) {
            "".length();
        }
        try {
            lllllllllllllIIlIIllllllllIllIII[EnumRailDirection.SOUTH_WEST.ordinal()] = BlockRailPowered.lIIlllIlIIIlII[2];
            "".length();
            if ("   ".length() <= ((0x44 ^ 0x6 ^ (0x2D ^ 0x46)) & (23 + 17 + 51 + 43 ^ 56 + 96 - 135 + 158 ^ -" ".length()))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError10) {
            "".length();
        }
        return BlockRailPowered.$SWITCH_TABLE$net$minecraft$block$BlockRailBase$EnumRailDirection = (int[])(Object)lllllllllllllIIlIIllllllllIllIII;
    }
    
    private static void llIllIllIlIlIll() {
        (lIIlllIlIIIlII = new int[11])[0] = ((100 + 117 - 148 + 61 ^ 107 + 146 - 186 + 109) & (59 + 15 - 30 + 202 ^ 1 + 137 + 11 + 47 ^ -" ".length()));
        BlockRailPowered.lIIlllIlIIIlII[1] = " ".length();
        BlockRailPowered.lIIlllIlIIIlII[2] = (0xCE ^ 0x90 ^ (0x7E ^ 0x28));
        BlockRailPowered.lIIlllIlIIIlII[3] = "   ".length();
        BlockRailPowered.lIIlllIlIIIlII[4] = (0x9A ^ 0x85 ^ (0x94 ^ 0x8C));
        BlockRailPowered.lIIlllIlIIIlII[5] = "  ".length();
        BlockRailPowered.lIIlllIlIIIlII[6] = (0x70 ^ 0x6D ^ (0x75 ^ 0x6D));
        BlockRailPowered.lIIlllIlIIIlII[7] = (0x44 ^ 0x6 ^ (0x73 ^ 0x37));
        BlockRailPowered.lIIlllIlIIIlII[8] = (0x50 ^ 0x54);
        BlockRailPowered.lIIlllIlIIIlII[9] = (0xB7 ^ 0xBD);
        BlockRailPowered.lIIlllIlIIIlII[10] = (0x21 ^ 0xD ^ (0x5F ^ 0x7A));
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIlIIlllllllllIIlII) {
        final IBlockState withProperty = this.getDefaultState().withProperty(BlockRailPowered.SHAPE, EnumRailDirection.byMetadata(lllllllllllllIIlIIlllllllllIIlII & BlockRailPowered.lIIlllIlIIIlII[4]));
        final PropertyBool powered = BlockRailPowered.POWERED;
        int b;
        if (llIllIllIllIlll(lllllllllllllIIlIIlllllllllIIlII & BlockRailPowered.lIIlllIlIIIlII[2])) {
            b = BlockRailPowered.lIIlllIlIIIlII[1];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            b = BlockRailPowered.lIIlllIlIIIlII[0];
        }
        return withProperty.withProperty((IProperty<Comparable>)powered, (boolean)(b != 0));
    }
    
    private static boolean llIllIllIllIIII(final int lllllllllllllIIlIIlllllllIlIllII) {
        return lllllllllllllIIlIIlllllllIlIllII != 0;
    }
    
    private static boolean llIllIllIllIlll(final int lllllllllllllIIlIIlllllllIlIlIII) {
        return lllllllllllllIIlIIlllllllIlIlIII > 0;
    }
    
    private static boolean llIllIllIlIllll(final int lllllllllllllIIlIIlllllllIllllIl, final int lllllllllllllIIlIIlllllllIllllII) {
        return lllllllllllllIIlIIlllllllIllllIl >= lllllllllllllIIlIIlllllllIllllII;
    }
    
    private static void llIllIllIlIIllI() {
        (lIIlllIlIIIIIl = new String[BlockRailPowered.lIIlllIlIIIlII[5]])[BlockRailPowered.lIIlllIlIIIlII[0]] = llIllIllIlIIlIl("MS47PAs=", "BFZLn");
        BlockRailPowered.lIIlllIlIIIIIl[BlockRailPowered.lIIlllIlIIIlII[1]] = llIllIllIlIIlIl("Gyg+HB4OIw==", "kGIyl");
    }
    
    private static boolean llIllIllIllIlII(final Object lllllllllllllIIlIIlllllllIllIIIl, final Object lllllllllllllIIlIIlllllllIllIIII) {
        return lllllllllllllIIlIIlllllllIllIIIl == lllllllllllllIIlIIlllllllIllIIII;
    }
    
    private static boolean llIllIllIlllIIl(final int lllllllllllllIIlIIlllllllIlllIIl, final int lllllllllllllIIlIIlllllllIlllIII) {
        return lllllllllllllIIlIIlllllllIlllIIl < lllllllllllllIIlIIlllllllIlllIII;
    }
}
