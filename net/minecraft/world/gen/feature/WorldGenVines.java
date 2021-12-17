// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.util.Vec3i;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockVine;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;

public class WorldGenVines extends WorldGenerator
{
    private static final /* synthetic */ int[] lllIllllIIIllI;
    
    @Override
    public boolean generate(final World llllllllllllIlIllIIIIIIlIIIlllIl, final Random llllllllllllIlIllIIIIIIlIIIlllII, BlockPos llllllllllllIlIllIIIIIIlIIIllIll) {
        "".length();
        if ((0x2C ^ 0x28) <= 0) {
            return ((0x62 ^ 0x7B) & ~(0x8D ^ 0x94)) != 0x0;
        }
        while (!lIlIIlIllllIllII(((Vec3i)llllllllllllIlIllIIIIIIlIIIllIll).getY(), WorldGenVines.lllIllllIIIllI[4])) {
            Label_0700: {
                if (lIlIIlIllllIlIIl(llllllllllllIlIllIIIIIIlIIIlllIl.isAirBlock((BlockPos)llllllllllllIlIllIIIIIIlIIIllIll) ? 1 : 0)) {
                    final boolean llllllllllllIlIllIIIIIIlIIIlIlll;
                    final boolean llllllllllllIlIllIIIIIIlIIIllIII = ((EnumFacing[])(Object)(llllllllllllIlIllIIIIIIlIIIlIlll = (boolean)(Object)EnumFacing.Plane.HORIZONTAL.facings())).length != 0;
                    int llllllllllllIlIllIIIIIIlIIIllIIl = WorldGenVines.lllIllllIIIllI[0];
                    "".length();
                    if (-" ".length() > 0) {
                        return ((0x18 ^ 0x52) & ~(0x7 ^ 0x4D)) != 0x0;
                    }
                    while (!lIlIIlIllllIllII(llllllllllllIlIllIIIIIIlIIIllIIl, llllllllllllIlIllIIIIIIlIIIllIII ? 1 : 0)) {
                        final EnumFacing llllllllllllIlIllIIIIIIlIIIlllll = llllllllllllIlIllIIIIIIlIIIlIlll[llllllllllllIlIllIIIIIIlIIIllIIl];
                        if (lIlIIlIllllIlIIl(Blocks.vine.canPlaceBlockOnSide(llllllllllllIlIllIIIIIIlIIIlllIl, (BlockPos)llllllllllllIlIllIIIIIIlIIIllIll, llllllllllllIlIllIIIIIIlIIIlllll) ? 1 : 0)) {
                            final IBlockState defaultState = Blocks.vine.getDefaultState();
                            final PropertyBool north = BlockVine.NORTH;
                            int b;
                            if (lIlIIlIllllIlIll(llllllllllllIlIllIIIIIIlIIIlllll, EnumFacing.NORTH)) {
                                b = WorldGenVines.lllIllllIIIllI[1];
                                "".length();
                                if ("   ".length() < ((4 + 147 - 8 + 7 ^ 131 + 57 - 36 + 3) & (96 + 61 - 6 + 22 ^ 55 + 66 - 6 + 45 ^ -" ".length()))) {
                                    return ((0xDF ^ 0x91 ^ (0xB8 ^ 0xC6)) & (0xD4 ^ 0xC4 ^ (0x70 ^ 0x50) ^ -" ".length())) != 0x0;
                                }
                            }
                            else {
                                b = WorldGenVines.lllIllllIIIllI[0];
                            }
                            final IBlockState withProperty = defaultState.withProperty((IProperty<Comparable>)north, (boolean)(b != 0));
                            final PropertyBool east = BlockVine.EAST;
                            int b2;
                            if (lIlIIlIllllIlIll(llllllllllllIlIllIIIIIIlIIIlllll, EnumFacing.EAST)) {
                                b2 = WorldGenVines.lllIllllIIIllI[1];
                                "".length();
                                if ("   ".length() <= 0) {
                                    return ((0x28 ^ 0x4F ^ (0xDE ^ 0x97)) & (0x40 ^ 0x33 ^ (0x3B ^ 0x66) ^ -" ".length())) != 0x0;
                                }
                            }
                            else {
                                b2 = WorldGenVines.lllIllllIIIllI[0];
                            }
                            final IBlockState withProperty2 = withProperty.withProperty((IProperty<Comparable>)east, (boolean)(b2 != 0));
                            final PropertyBool south = BlockVine.SOUTH;
                            int b3;
                            if (lIlIIlIllllIlIll(llllllllllllIlIllIIIIIIlIIIlllll, EnumFacing.SOUTH)) {
                                b3 = WorldGenVines.lllIllllIIIllI[1];
                                "".length();
                                if ((0x46 ^ 0x65 ^ (0x10 ^ 0x37)) <= "  ".length()) {
                                    return ((3 + 47 - 33 + 129 ^ 161 + 155 - 261 + 118) & (167 + 51 - 164 + 198 ^ 164 + 107 - 141 + 65 ^ -" ".length())) != 0x0;
                                }
                            }
                            else {
                                b3 = WorldGenVines.lllIllllIIIllI[0];
                            }
                            final IBlockState withProperty3 = withProperty2.withProperty((IProperty<Comparable>)south, (boolean)(b3 != 0));
                            final PropertyBool west = BlockVine.WEST;
                            int b4;
                            if (lIlIIlIllllIlIll(llllllllllllIlIllIIIIIIlIIIlllll, EnumFacing.WEST)) {
                                b4 = WorldGenVines.lllIllllIIIllI[1];
                                "".length();
                                if (-(80 + 44 - 69 + 125 ^ 57 + 68 - 52 + 104) >= 0) {
                                    return ((0x1C ^ 0x7E ^ (0x24 ^ 0x7A)) & (0x13 ^ 0xA ^ (0x1D ^ 0x38) ^ -" ".length())) != 0x0;
                                }
                            }
                            else {
                                b4 = WorldGenVines.lllIllllIIIllI[0];
                            }
                            final IBlockState llllllllllllIlIllIIIIIIlIIIllllI = withProperty3.withProperty((IProperty<Comparable>)west, (boolean)(b4 != 0));
                            llllllllllllIlIllIIIIIIlIIIlllIl.setBlockState((BlockPos)llllllllllllIlIllIIIIIIlIIIllIll, llllllllllllIlIllIIIIIIlIIIllllI, WorldGenVines.lllIllllIIIllI[2]);
                            "".length();
                            "".length();
                            if (null != null) {
                                return ((0x81 ^ 0x9F) & ~(0x57 ^ 0x49)) != 0x0;
                            }
                            break Label_0700;
                        }
                        else {
                            ++llllllllllllIlIllIIIIIIlIIIllIIl;
                        }
                    }
                    "".length();
                    if (("   ".length() & ~"   ".length()) == " ".length()) {
                        return ((0xF6 ^ 0xB9) & ~(0x12 ^ 0x5D)) != 0x0;
                    }
                }
                else {
                    llllllllllllIlIllIIIIIIlIIIllIll = ((BlockPos)llllllllllllIlIllIIIIIIlIIIllIll).add(llllllllllllIlIllIIIIIIlIIIlllII.nextInt(WorldGenVines.lllIllllIIIllI[3]) - llllllllllllIlIllIIIIIIlIIIlllII.nextInt(WorldGenVines.lllIllllIIIllI[3]), WorldGenVines.lllIllllIIIllI[0], llllllllllllIlIllIIIIIIlIIIlllII.nextInt(WorldGenVines.lllIllllIIIllI[3]) - llllllllllllIlIllIIIIIIlIIIlllII.nextInt(WorldGenVines.lllIllllIIIllI[3]));
                }
            }
            llllllllllllIlIllIIIIIIlIIIllIll = ((BlockPos)llllllllllllIlIllIIIIIIlIIIllIll).up();
        }
        return WorldGenVines.lllIllllIIIllI[1] != 0;
    }
    
    private static boolean lIlIIlIllllIlIIl(final int llllllllllllIlIllIIIIIIlIIIIllII) {
        return llllllllllllIlIllIIIIIIlIIIIllII != 0;
    }
    
    static {
        lIlIIlIllllIlIII();
    }
    
    private static void lIlIIlIllllIlIII() {
        (lllIllllIIIllI = new int[5])[0] = ((0x64 ^ 0x38) & ~(0x4A ^ 0x16));
        WorldGenVines.lllIllllIIIllI[1] = " ".length();
        WorldGenVines.lllIllllIIIllI[2] = "  ".length();
        WorldGenVines.lllIllllIIIllI[3] = (92 + 77 - 159 + 168 ^ 30 + 28 + 112 + 12);
        WorldGenVines.lllIllllIIIllI[4] = (0x68 ^ 0x4B) + (0x1E ^ 0x18) - (0x57 ^ 0x45) + (0xCD ^ 0xA4);
    }
    
    private static boolean lIlIIlIllllIllII(final int llllllllllllIlIllIIIIIIlIIIlIIll, final int llllllllllllIlIllIIIIIIlIIIlIIlI) {
        return llllllllllllIlIllIIIIIIlIIIlIIll >= llllllllllllIlIllIIIIIIlIIIlIIlI;
    }
    
    private static boolean lIlIIlIllllIlIll(final Object llllllllllllIlIllIIIIIIlIIIIllll, final Object llllllllllllIlIllIIIIIIlIIIIlllI) {
        return llllllllllllIlIllIIIIIIlIIIIllll == llllllllllllIlIllIIIIIIlIIIIlllI;
    }
}
