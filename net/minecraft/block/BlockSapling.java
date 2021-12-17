// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.block.state.BlockState;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.StatCollector;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.feature.WorldGenCanopyTree;
import net.minecraft.world.gen.feature.WorldGenSavannaTree;
import net.minecraft.world.gen.feature.WorldGenMegaJungle;
import net.minecraft.init.Blocks;
import net.minecraft.world.gen.feature.WorldGenForest;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenMegaPineTree;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.properties.PropertyEnum;

public class BlockSapling extends BlockBush implements IGrowable
{
    public static final /* synthetic */ PropertyEnum<BlockPlanks.EnumType> TYPE;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$block$BlockPlanks$EnumType;
    private static final /* synthetic */ int[] lIlllllllIllII;
    private static final /* synthetic */ String[] lIlllllllIlIII;
    public static final /* synthetic */ PropertyInteger STAGE;
    
    private static boolean lIIIIllIIIllllIl(final int llllllllllllIllllIIIlIlllIllIIII) {
        return llllllllllllIllllIIIlIlllIllIIII == 0;
    }
    
    static {
        lIIIIllIIIllllII();
        lIIIIllIIIlIIlll();
        TYPE = PropertyEnum.create(BlockSapling.lIlllllllIlIII[BlockSapling.lIlllllllIllII[0]], BlockPlanks.EnumType.class);
        STAGE = PropertyInteger.create(BlockSapling.lIlllllllIlIII[BlockSapling.lIlllllllIllII[1]], BlockSapling.lIlllllllIllII[0], BlockSapling.lIlllllllIllII[1]);
    }
    
    public boolean isTypeAt(final World llllllllllllIllllIIIllIIIlIIlIll, final BlockPos llllllllllllIllllIIIllIIIlIlIIlI, final BlockPlanks.EnumType llllllllllllIllllIIIllIIIlIIlIIl) {
        final IBlockState llllllllllllIllllIIIllIIIlIIlllI = llllllllllllIllllIIIllIIIlIIlIll.getBlockState(llllllllllllIllllIIIllIIIlIlIIlI);
        if (lIIIIllIIlIIIIIl(llllllllllllIllllIIIllIIIlIIlllI.getBlock(), this) && lIIIIllIIlIIIIIl(llllllllllllIllllIIIllIIIlIIlllI.getValue(BlockSapling.TYPE), llllllllllllIllllIIIllIIIlIIlIIl)) {
            return BlockSapling.lIlllllllIllII[1] != 0;
        }
        return BlockSapling.lIlllllllIllII[0] != 0;
    }
    
    public void generateTree(final World llllllllllllIllllIIIllIIlIIIIlll, final BlockPos llllllllllllIllllIIIllIIIllllIlI, final IBlockState llllllllllllIllllIIIllIIlIIIIlIl, final Random llllllllllllIllllIIIllIIIllllIII) {
        WorldGenerator worldGenerator;
        if (lIIIIllIIIllllIl(llllllllllllIllllIIIllIIIllllIII.nextInt(BlockSapling.lIlllllllIllII[7]))) {
            worldGenerator = new WorldGenBigTree((boolean)(BlockSapling.lIlllllllIllII[1] != 0));
            "".length();
            if ("  ".length() < 0) {
                return;
            }
        }
        else {
            worldGenerator = new WorldGenTrees((boolean)(BlockSapling.lIlllllllIllII[1] != 0));
        }
        WorldGenerator llllllllllllIllllIIIllIIlIIIIIll = worldGenerator;
        int llllllllllllIllllIIIllIIlIIIIIlI = BlockSapling.lIlllllllIllII[0];
        int llllllllllllIllllIIIllIIlIIIIIIl = BlockSapling.lIlllllllIllII[0];
        boolean llllllllllllIllllIIIllIIlIIIIIII = BlockSapling.lIlllllllIllII[0] != 0;
        switch ($SWITCH_TABLE$net$minecraft$block$BlockPlanks$EnumType()[llllllllllllIllllIIIllIIlIIIIlIl.getValue(BlockSapling.TYPE).ordinal()]) {
            case 2: {
                llllllllllllIllllIIIllIIlIIIIIlI = BlockSapling.lIlllllllIllII[0];
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            Label_0329:
                while (!lIIIIllIIlIIIIII(llllllllllllIllllIIIllIIlIIIIIlI, BlockSapling.lIlllllllIllII[8])) {
                    llllllllllllIllllIIIllIIlIIIIIIl = BlockSapling.lIlllllllIllII[0];
                    "".length();
                    if ((("   ".length() ^ (0x42 ^ 0x7C)) & (113 + 120 - 231 + 141 ^ 139 + 92 - 205 + 152 ^ -" ".length())) >= "  ".length()) {
                        return;
                    }
                    while (!lIIIIllIIlIIIIII(llllllllllllIllllIIIllIIlIIIIIIl, BlockSapling.lIlllllllIllII[8])) {
                        if (lIIIIllIIIllllll(this.func_181624_a(llllllllllllIllllIIIllIIlIIIIlll, llllllllllllIllllIIIllIIIllllIlI, llllllllllllIllllIIIllIIlIIIIIlI, llllllllllllIllllIIIllIIlIIIIIIl, BlockPlanks.EnumType.SPRUCE) ? 1 : 0)) {
                            llllllllllllIllllIIIllIIlIIIIIll = new WorldGenMegaPineTree((boolean)(BlockSapling.lIlllllllIllII[0] != 0), llllllllllllIllllIIIllIIIllllIII.nextBoolean());
                            llllllllllllIllllIIIllIIlIIIIIII = (BlockSapling.lIlllllllIllII[1] != 0);
                            "".length();
                            if ((0xB6 ^ 0xB2) <= -" ".length()) {
                                return;
                            }
                            break Label_0329;
                        }
                        else {
                            --llllllllllllIllllIIIllIIlIIIIIIl;
                        }
                    }
                    --llllllllllllIllllIIIllIIlIIIIIlI;
                }
                if (!lIIIIllIIIllllIl(llllllllllllIllllIIIllIIlIIIIIII ? 1 : 0)) {
                    break;
                }
                llllllllllllIllllIIIllIIlIIIIIIl = BlockSapling.lIlllllllIllII[0];
                llllllllllllIllllIIIllIIlIIIIIlI = BlockSapling.lIlllllllIllII[0];
                llllllllllllIllllIIIllIIlIIIIIll = new WorldGenTaiga2((boolean)(BlockSapling.lIlllllllIllII[1] != 0));
                "".length();
                if (((0x4A ^ 0x54) & ~(0x8 ^ 0x16)) > " ".length()) {
                    return;
                }
                break;
            }
            case 3: {
                llllllllllllIllllIIIllIIlIIIIIll = new WorldGenForest((boolean)(BlockSapling.lIlllllllIllII[1] != 0), (boolean)(BlockSapling.lIlllllllIllII[0] != 0));
                "".length();
                if (((0x59 ^ 0x13) & ~(0xF2 ^ 0xB8)) > 0) {
                    return;
                }
                break;
            }
            case 4: {
                final IBlockState llllllllllllIllllIIIllIIIlllllll = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
                final IBlockState llllllllllllIllllIIIllIIIllllllI = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty((IProperty<Comparable>)BlockLeaves.CHECK_DECAY, (boolean)(BlockSapling.lIlllllllIllII[0] != 0));
                llllllllllllIllllIIIllIIlIIIIIlI = BlockSapling.lIlllllllIllII[0];
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
            Label_0668:
                while (!lIIIIllIIlIIIIII(llllllllllllIllllIIIllIIlIIIIIlI, BlockSapling.lIlllllllIllII[8])) {
                    llllllllllllIllllIIIllIIlIIIIIIl = BlockSapling.lIlllllllIllII[0];
                    "".length();
                    if ((0x85 ^ 0x81) < -" ".length()) {
                        return;
                    }
                    while (!lIIIIllIIlIIIIII(llllllllllllIllllIIIllIIlIIIIIIl, BlockSapling.lIlllllllIllII[8])) {
                        if (lIIIIllIIIllllll(this.func_181624_a(llllllllllllIllllIIIllIIlIIIIlll, llllllllllllIllllIIIllIIIllllIlI, llllllllllllIllllIIIllIIlIIIIIlI, llllllllllllIllllIIIllIIlIIIIIIl, BlockPlanks.EnumType.JUNGLE) ? 1 : 0)) {
                            llllllllllllIllllIIIllIIlIIIIIll = new WorldGenMegaJungle((boolean)(BlockSapling.lIlllllllIllII[1] != 0), BlockSapling.lIlllllllIllII[7], BlockSapling.lIlllllllIllII[9], llllllllllllIllllIIIllIIIlllllll, llllllllllllIllllIIIllIIIllllllI);
                            llllllllllllIllllIIIllIIlIIIIIII = (BlockSapling.lIlllllllIllII[1] != 0);
                            "".length();
                            if ((139 + 92 - 144 + 99 ^ 3 + 186 - 63 + 65) == 0x0) {
                                return;
                            }
                            break Label_0668;
                        }
                        else {
                            --llllllllllllIllllIIIllIIlIIIIIIl;
                        }
                    }
                    --llllllllllllIllllIIIllIIlIIIIIlI;
                }
                if (!lIIIIllIIIllllIl(llllllllllllIllllIIIllIIlIIIIIII ? 1 : 0)) {
                    break;
                }
                llllllllllllIllllIIIllIIlIIIIIIl = BlockSapling.lIlllllllIllII[0];
                llllllllllllIllllIIIllIIlIIIIIlI = BlockSapling.lIlllllllIllII[0];
                llllllllllllIllllIIIllIIlIIIIIll = new WorldGenTrees((boolean)(BlockSapling.lIlllllllIllII[1] != 0), BlockSapling.lIlllllllIllII[6] + llllllllllllIllllIIIllIIIllllIII.nextInt(BlockSapling.lIlllllllIllII[5]), llllllllllllIllllIIIllIIIlllllll, llllllllllllIllllIIIllIIIllllllI, (boolean)(BlockSapling.lIlllllllIllII[0] != 0));
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
                break;
            }
            case 5: {
                llllllllllllIllllIIIllIIlIIIIIll = new WorldGenSavannaTree((boolean)(BlockSapling.lIlllllllIllII[1] != 0));
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
                break;
            }
            case 6: {
                llllllllllllIllllIIIllIIlIIIIIlI = BlockSapling.lIlllllllIllII[0];
                "".length();
                if (null != null) {
                    return;
                }
            Label_0915:
                while (!lIIIIllIIlIIIIII(llllllllllllIllllIIIllIIlIIIIIlI, BlockSapling.lIlllllllIllII[8])) {
                    llllllllllllIllllIIIllIIlIIIIIIl = BlockSapling.lIlllllllIllII[0];
                    "".length();
                    if (-" ".length() == "  ".length()) {
                        return;
                    }
                    while (!lIIIIllIIlIIIIII(llllllllllllIllllIIIllIIlIIIIIIl, BlockSapling.lIlllllllIllII[8])) {
                        if (lIIIIllIIIllllll(this.func_181624_a(llllllllllllIllllIIIllIIlIIIIlll, llllllllllllIllllIIIllIIIllllIlI, llllllllllllIllllIIIllIIlIIIIIlI, llllllllllllIllllIIIllIIlIIIIIIl, BlockPlanks.EnumType.DARK_OAK) ? 1 : 0)) {
                            llllllllllllIllllIIIllIIlIIIIIll = new WorldGenCanopyTree((boolean)(BlockSapling.lIlllllllIllII[1] != 0));
                            llllllllllllIllllIIIllIIlIIIIIII = (BlockSapling.lIlllllllIllII[1] != 0);
                            "".length();
                            if ("   ".length() < "   ".length()) {
                                return;
                            }
                            break Label_0915;
                        }
                        else {
                            --llllllllllllIllllIIIllIIlIIIIIIl;
                        }
                    }
                    --llllllllllllIllllIIIllIIlIIIIIlI;
                }
                if (lIIIIllIIIllllIl(llllllllllllIllllIIIllIIlIIIIIII ? 1 : 0)) {
                    return;
                }
                break;
            }
        }
        final IBlockState llllllllllllIllllIIIllIIIlllllIl = Blocks.air.getDefaultState();
        if (lIIIIllIIIllllll(llllllllllllIllllIIIllIIlIIIIIII ? 1 : 0)) {
            llllllllllllIllllIIIllIIlIIIIlll.setBlockState(llllllllllllIllllIIIllIIIllllIlI.add(llllllllllllIllllIIIllIIlIIIIIlI, BlockSapling.lIlllllllIllII[0], llllllllllllIllllIIIllIIlIIIIIIl), llllllllllllIllllIIIllIIIlllllIl, BlockSapling.lIlllllllIllII[6]);
            "".length();
            llllllllllllIllllIIIllIIlIIIIlll.setBlockState(llllllllllllIllllIIIllIIIllllIlI.add(llllllllllllIllllIIIllIIlIIIIIlI + BlockSapling.lIlllllllIllII[1], BlockSapling.lIlllllllIllII[0], llllllllllllIllllIIIllIIlIIIIIIl), llllllllllllIllllIIIllIIIlllllIl, BlockSapling.lIlllllllIllII[6]);
            "".length();
            llllllllllllIllllIIIllIIlIIIIlll.setBlockState(llllllllllllIllllIIIllIIIllllIlI.add(llllllllllllIllllIIIllIIlIIIIIlI, BlockSapling.lIlllllllIllII[0], llllllllllllIllllIIIllIIlIIIIIIl + BlockSapling.lIlllllllIllII[1]), llllllllllllIllllIIIllIIIlllllIl, BlockSapling.lIlllllllIllII[6]);
            "".length();
            llllllllllllIllllIIIllIIlIIIIlll.setBlockState(llllllllllllIllllIIIllIIIllllIlI.add(llllllllllllIllllIIIllIIlIIIIIlI + BlockSapling.lIlllllllIllII[1], BlockSapling.lIlllllllIllII[0], llllllllllllIllllIIIllIIlIIIIIIl + BlockSapling.lIlllllllIllII[1]), llllllllllllIllllIIIllIIIlllllIl, BlockSapling.lIlllllllIllII[6]);
            "".length();
            "".length();
            if (-" ".length() > "   ".length()) {
                return;
            }
        }
        else {
            llllllllllllIllllIIIllIIlIIIIlll.setBlockState(llllllllllllIllllIIIllIIIllllIlI, llllllllllllIllllIIIllIIIlllllIl, BlockSapling.lIlllllllIllII[6]);
            "".length();
        }
        if (lIIIIllIIIllllIl(llllllllllllIllllIIIllIIlIIIIIll.generate(llllllllllllIllllIIIllIIlIIIIlll, llllllllllllIllllIIIllIIIllllIII, llllllllllllIllllIIIllIIIllllIlI.add(llllllllllllIllllIIIllIIlIIIIIlI, BlockSapling.lIlllllllIllII[0], llllllllllllIllllIIIllIIlIIIIIIl)) ? 1 : 0)) {
            if (lIIIIllIIIllllll(llllllllllllIllllIIIllIIlIIIIIII ? 1 : 0)) {
                llllllllllllIllllIIIllIIlIIIIlll.setBlockState(llllllllllllIllllIIIllIIIllllIlI.add(llllllllllllIllllIIIllIIlIIIIIlI, BlockSapling.lIlllllllIllII[0], llllllllllllIllllIIIllIIlIIIIIIl), llllllllllllIllllIIIllIIlIIIIlIl, BlockSapling.lIlllllllIllII[6]);
                "".length();
                llllllllllllIllllIIIllIIlIIIIlll.setBlockState(llllllllllllIllllIIIllIIIllllIlI.add(llllllllllllIllllIIIllIIlIIIIIlI + BlockSapling.lIlllllllIllII[1], BlockSapling.lIlllllllIllII[0], llllllllllllIllllIIIllIIlIIIIIIl), llllllllllllIllllIIIllIIlIIIIlIl, BlockSapling.lIlllllllIllII[6]);
                "".length();
                llllllllllllIllllIIIllIIlIIIIlll.setBlockState(llllllllllllIllllIIIllIIIllllIlI.add(llllllllllllIllllIIIllIIlIIIIIlI, BlockSapling.lIlllllllIllII[0], llllllllllllIllllIIIllIIlIIIIIIl + BlockSapling.lIlllllllIllII[1]), llllllllllllIllllIIIllIIlIIIIlIl, BlockSapling.lIlllllllIllII[6]);
                "".length();
                llllllllllllIllllIIIllIIlIIIIlll.setBlockState(llllllllllllIllllIIIllIIIllllIlI.add(llllllllllllIllllIIIllIIlIIIIIlI + BlockSapling.lIlllllllIllII[1], BlockSapling.lIlllllllIllII[0], llllllllllllIllllIIIllIIlIIIIIIl + BlockSapling.lIlllllllIllII[1]), llllllllllllIllllIIIllIIlIIIIlIl, BlockSapling.lIlllllllIllII[6]);
                "".length();
                "".length();
                if ("  ".length() == ((0x60 ^ 0x65 ^ (0x3E ^ 0x1F)) & (0x4E ^ 0x78 ^ (0x43 ^ 0x51) ^ -" ".length()))) {
                    return;
                }
            }
            else {
                llllllllllllIllllIIIllIIlIIIIlll.setBlockState(llllllllllllIllllIIIllIIIllllIlI, llllllllllllIllllIIIllIIlIIIIlIl, BlockSapling.lIlllllllIllII[6]);
                "".length();
            }
        }
    }
    
    public void grow(final World llllllllllllIllllIIIllIIllllllIl, final BlockPos llllllllllllIllllIIIllIlIIIIIIIl, final IBlockState llllllllllllIllllIIIllIlIIIIIIII, final Random llllllllllllIllllIIIllIIllllllll) {
        if (lIIIIllIIIllllIl(llllllllllllIllllIIIllIlIIIIIIII.getValue((IProperty<Integer>)BlockSapling.STAGE))) {
            llllllllllllIllllIIIllIIllllllIl.setBlockState(llllllllllllIllllIIIllIlIIIIIIIl, llllllllllllIllllIIIllIlIIIIIIII.cycleProperty((IProperty<Comparable>)BlockSapling.STAGE), BlockSapling.lIlllllllIllII[6]);
            "".length();
            "".length();
            if ((0x91 ^ 0x95) == -" ".length()) {
                return;
            }
        }
        else {
            this.generateTree(llllllllllllIllllIIIllIIllllllIl, llllllllllllIllllIIIllIlIIIIIIIl, llllllllllllIllllIIIllIlIIIIIIII, llllllllllllIllllIIIllIIllllllll);
        }
    }
    
    @Override
    public void updateTick(final World llllllllllllIllllIIIllIlIIIlIIIl, final BlockPos llllllllllllIllllIIIllIlIIIIlIll, final IBlockState llllllllllllIllllIIIllIlIIIIlIlI, final Random llllllllllllIllllIIIllIlIIIIlIIl) {
        if (lIIIIllIIIllllIl(llllllllllllIllllIIIllIlIIIlIIIl.isRemote ? 1 : 0)) {
            super.updateTick(llllllllllllIllllIIIllIlIIIlIIIl, llllllllllllIllllIIIllIlIIIIlIll, llllllllllllIllllIIIllIlIIIIlIlI, llllllllllllIllllIIIllIlIIIIlIIl);
            if (lIIIIllIIIlllllI(llllllllllllIllllIIIllIlIIIlIIIl.getLightFromNeighbors(llllllllllllIllllIIIllIlIIIIlIll.up()), BlockSapling.lIlllllllIllII[4]) && lIIIIllIIIllllIl(llllllllllllIllllIIIllIlIIIIlIIl.nextInt(BlockSapling.lIlllllllIllII[5]))) {
                this.grow(llllllllllllIllllIIIllIlIIIlIIIl, llllllllllllIllllIIIllIlIIIIlIll, llllllllllllIllllIIIllIlIIIIlIlI, llllllllllllIllllIIIllIlIIIIlIIl);
            }
        }
    }
    
    @Override
    public String getLocalizedName() {
        return StatCollector.translateToLocal(String.valueOf(new StringBuilder(String.valueOf(this.getUnlocalizedName())).append(BlockSapling.lIlllllllIlIII[BlockSapling.lIlllllllIllII[2]]).append(BlockPlanks.EnumType.OAK.getUnlocalizedName()).append(BlockSapling.lIlllllllIlIII[BlockSapling.lIlllllllIllII[3]])));
    }
    
    private static String lIIIIllIIIlIIllI(String llllllllllllIllllIIIlIllllIIlIlI, final String llllllllllllIllllIIIlIllllIIlIIl) {
        llllllllllllIllllIIIlIllllIIlIlI = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIIIlIllllIIlIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIIIlIllllIIllIl = new StringBuilder();
        final char[] llllllllllllIllllIIIlIllllIIllII = llllllllllllIllllIIIlIllllIIlIIl.toCharArray();
        int llllllllllllIllllIIIlIllllIIlIll = BlockSapling.lIlllllllIllII[0];
        final Exception llllllllllllIllllIIIlIllllIIIlIl = (Object)((String)llllllllllllIllllIIIlIllllIIlIlI).toCharArray();
        final char llllllllllllIllllIIIlIllllIIIlII = (char)llllllllllllIllllIIIlIllllIIIlIl.length;
        double llllllllllllIllllIIIlIllllIIIIll = BlockSapling.lIlllllllIllII[0];
        while (lIIIIllIIlIIIIII((int)llllllllllllIllllIIIlIllllIIIIll, llllllllllllIllllIIIlIllllIIIlII)) {
            final char llllllllllllIllllIIIlIllllIlIIII = llllllllllllIllllIIIlIllllIIIlIl[llllllllllllIllllIIIlIllllIIIIll];
            llllllllllllIllllIIIlIllllIIllIl.append((char)(llllllllllllIllllIIIlIllllIlIIII ^ llllllllllllIllllIIIlIllllIIllII[llllllllllllIllllIIIlIllllIIlIll % llllllllllllIllllIIIlIllllIIllII.length]));
            "".length();
            ++llllllllllllIllllIIIlIllllIIlIll;
            ++llllllllllllIllllIIIlIllllIIIIll;
            "".length();
            if (((0x71 ^ 0x7A) & ~(0xA6 ^ 0xAD) & ~((0x1F ^ 0x14) & ~(0x13 ^ 0x18))) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIIIlIllllIIllIl);
    }
    
    private boolean func_181624_a(final World llllllllllllIllllIIIllIIIllIIlII, final BlockPos llllllllllllIllllIIIllIIIllIIIlI, final int llllllllllllIllllIIIllIIIllIIIIl, final int llllllllllllIllllIIIllIIIllIIIII, final BlockPlanks.EnumType llllllllllllIllllIIIllIIIlIllllI) {
        if (lIIIIllIIIllllll(this.isTypeAt(llllllllllllIllllIIIllIIIllIIlII, llllllllllllIllllIIIllIIIllIIIlI.add(llllllllllllIllllIIIllIIIllIIIIl, BlockSapling.lIlllllllIllII[0], llllllllllllIllllIIIllIIIllIIIII), llllllllllllIllllIIIllIIIlIllllI) ? 1 : 0) && lIIIIllIIIllllll(this.isTypeAt(llllllllllllIllllIIIllIIIllIIlII, llllllllllllIllllIIIllIIIllIIIlI.add(llllllllllllIllllIIIllIIIllIIIIl + BlockSapling.lIlllllllIllII[1], BlockSapling.lIlllllllIllII[0], llllllllllllIllllIIIllIIIllIIIII), llllllllllllIllllIIIllIIIlIllllI) ? 1 : 0) && lIIIIllIIIllllll(this.isTypeAt(llllllllllllIllllIIIllIIIllIIlII, llllllllllllIllllIIIllIIIllIIIlI.add(llllllllllllIllllIIIllIIIllIIIIl, BlockSapling.lIlllllllIllII[0], llllllllllllIllllIIIllIIIllIIIII + BlockSapling.lIlllllllIllII[1]), llllllllllllIllllIIIllIIIlIllllI) ? 1 : 0) && lIIIIllIIIllllll(this.isTypeAt(llllllllllllIllllIIIllIIIllIIlII, llllllllllllIllllIIIllIIIllIIIlI.add(llllllllllllIllllIIIllIIIllIIIIl + BlockSapling.lIlllllllIllII[1], BlockSapling.lIlllllllIllII[0], llllllllllllIllllIIIllIIIllIIIII + BlockSapling.lIlllllllIllII[1]), llllllllllllIllllIIIllIIIlIllllI) ? 1 : 0)) {
            return BlockSapling.lIlllllllIllII[1] != 0;
        }
        return BlockSapling.lIlllllllIllII[0] != 0;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockSapling.lIlllllllIllII[2]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockSapling.lIlllllllIllII[0]] = BlockSapling.TYPE;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockSapling.lIlllllllIllII[1]] = BlockSapling.STAGE;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public boolean canUseBonemeal(final World llllllllllllIllllIIIllIIIIIlIlIl, final Random llllllllllllIllllIIIllIIIIIllIII, final BlockPos llllllllllllIllllIIIllIIIIIlIlll, final IBlockState llllllllllllIllllIIIllIIIIIlIllI) {
        if (lIIIIllIIlIIIIll(lIIIIllIIlIIIIlI(llllllllllllIllllIIIllIIIIIlIlIl.rand.nextFloat(), 0.45))) {
            return BlockSapling.lIlllllllIllII[1] != 0;
        }
        return BlockSapling.lIlllllllIllII[0] != 0;
    }
    
    private static boolean lIIIIllIIIllllll(final int llllllllllllIllllIIIlIlllIllIIlI) {
        return llllllllllllIllllIIIlIlllIllIIlI != 0;
    }
    
    private static boolean lIIIIllIIlIIIlII(final Object llllllllllllIllllIIIlIlllIllIlII) {
        return llllllllllllIllllIIIlIlllIllIlII != null;
    }
    
    private static void lIIIIllIIIllllII() {
        (lIlllllllIllII = new int[13])[0] = ((36 + 61 + 52 + 37 ^ 12 + 118 - 103 + 139) & (0xD2 ^ 0xC0 ^ (0x1F ^ 0x11) ^ -" ".length()));
        BlockSapling.lIlllllllIllII[1] = " ".length();
        BlockSapling.lIlllllllIllII[2] = "  ".length();
        BlockSapling.lIlllllllIllII[3] = "   ".length();
        BlockSapling.lIlllllllIllII[4] = (0x45 ^ 0x4C);
        BlockSapling.lIlllllllIllII[5] = (90 + 32 - 92 + 130 ^ 148 + 100 - 247 + 166);
        BlockSapling.lIlllllllIllII[6] = (0x1F ^ 0x9 ^ (0xBF ^ 0xAD));
        BlockSapling.lIlllllllIllII[7] = (0x61 ^ 0x5A ^ (0x16 ^ 0x27));
        BlockSapling.lIlllllllIllII[8] = -" ".length();
        BlockSapling.lIlllllllIllII[9] = (0x6A ^ 0x2E ^ (0xEA ^ 0xBA));
        BlockSapling.lIlllllllIllII[10] = (0x23 ^ 0x2B);
        BlockSapling.lIlllllllIllII[11] = (0x84 ^ 0x8B ^ (0x81 ^ 0x8B));
        BlockSapling.lIlllllllIllII[12] = (0x48 ^ 0x4E);
    }
    
    @Override
    public boolean canGrow(final World llllllllllllIllllIIIllIIIIIlllll, final BlockPos llllllllllllIllllIIIllIIIIIllllI, final IBlockState llllllllllllIllllIIIllIIIIIlllIl, final boolean llllllllllllIllllIIIllIIIIIlllII) {
        return BlockSapling.lIlllllllIllII[1] != 0;
    }
    
    @Override
    public void grow(final World llllllllllllIllllIIIllIIIIIIlllI, final Random llllllllllllIllllIIIllIIIIIIlIII, final BlockPos llllllllllllIllllIIIllIIIIIIllII, final IBlockState llllllllllllIllllIIIllIIIIIIlIll) {
        this.grow(llllllllllllIllllIIIllIIIIIIlllI, llllllllllllIllllIIIllIIIIIIllII, llllllllllllIllllIIIllIIIIIIlIll, llllllllllllIllllIIIllIIIIIIlIII);
    }
    
    private static boolean lIIIIllIIIlllllI(final int llllllllllllIllllIIIlIlllIllllll, final int llllllllllllIllllIIIlIlllIlllllI) {
        return llllllllllllIllllIIIlIlllIllllll >= llllllllllllIllllIIIlIlllIlllllI;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIllllIIIllIIIIIIIIII) {
        return this.getDefaultState().withProperty(BlockSapling.TYPE, BlockPlanks.EnumType.byMetadata(llllllllllllIllllIIIllIIIIIIIIII & BlockSapling.lIlllllllIllII[5])).withProperty((IProperty<Comparable>)BlockSapling.STAGE, (llllllllllllIllllIIIllIIIIIIIIII & BlockSapling.lIlllllllIllII[10]) >> BlockSapling.lIlllllllIllII[3]);
    }
    
    private static void lIIIIllIIIlIIlll() {
        (lIlllllllIlIII = new String[BlockSapling.lIlllllllIllII[6]])[BlockSapling.lIlllllllIllII[0]] = lIIIIllIIIlIIlII("PJryWI/8EWY=", "Wabii");
        BlockSapling.lIlllllllIlIII[BlockSapling.lIlllllllIllII[1]] = lIIIIllIIIlIIlIl("ye4vUNUN3KA=", "dRygp");
        BlockSapling.lIlllllllIlIII[BlockSapling.lIlllllllIllII[2]] = lIIIIllIIIlIIlIl("ZvPbBr6XwdA=", "NLtXJ");
        BlockSapling.lIlllllllIlIII[BlockSapling.lIlllllllIllII[3]] = lIIIIllIIIlIIllI("XhQCGBQ=", "pzcuq");
    }
    
    @Override
    public void getSubBlocks(final Item llllllllllllIllllIIIllIIIIlIlIlI, final CreativeTabs llllllllllllIllllIIIllIIIIlIlIIl, final List<ItemStack> llllllllllllIllllIIIllIIIIlIIlIl) {
        final char llllllllllllIllllIIIllIIIIlIIIIl;
        final char llllllllllllIllllIIIllIIIIlIIIlI = (char)((BlockPlanks.EnumType[])(Object)(llllllllllllIllllIIIllIIIIlIIIIl = (char)(Object)BlockPlanks.EnumType.values())).length;
        short llllllllllllIllllIIIllIIIIlIIIll = (short)BlockSapling.lIlllllllIllII[0];
        "".length();
        if ("   ".length() < " ".length()) {
            return;
        }
        while (!lIIIIllIIIlllllI(llllllllllllIllllIIIllIIIIlIIIll, llllllllllllIllllIIIllIIIIlIIIlI)) {
            final BlockPlanks.EnumType llllllllllllIllllIIIllIIIIlIIlll = llllllllllllIllllIIIllIIIIlIIIIl[llllllllllllIllllIIIllIIIIlIIIll];
            llllllllllllIllllIIIllIIIIlIIlIl.add(new ItemStack(llllllllllllIllllIIIllIIIIlIlIlI, BlockSapling.lIlllllllIllII[1], llllllllllllIllllIIIllIIIIlIIlll.getMetadata()));
            "".length();
            ++llllllllllllIllllIIIllIIIIlIIIll;
        }
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$block$BlockPlanks$EnumType() {
        final int[] $switch_TABLE$net$minecraft$block$BlockPlanks$EnumType = BlockSapling.$SWITCH_TABLE$net$minecraft$block$BlockPlanks$EnumType;
        if (lIIIIllIIlIIIlII($switch_TABLE$net$minecraft$block$BlockPlanks$EnumType)) {
            return $switch_TABLE$net$minecraft$block$BlockPlanks$EnumType;
        }
        "".length();
        final short llllllllllllIllllIIIlIllllllIlII = (Object)new int[BlockPlanks.EnumType.values().length];
        try {
            llllllllllllIllllIIIlIllllllIlII[BlockPlanks.EnumType.ACACIA.ordinal()] = BlockSapling.lIlllllllIllII[11];
            "".length();
            if (" ".length() < " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIllllIIIlIllllllIlII[BlockPlanks.EnumType.BIRCH.ordinal()] = BlockSapling.lIlllllllIllII[3];
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIllllIIIlIllllllIlII[BlockPlanks.EnumType.DARK_OAK.ordinal()] = BlockSapling.lIlllllllIllII[12];
            "".length();
            if ("  ".length() == " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIllllIIIlIllllllIlII[BlockPlanks.EnumType.JUNGLE.ordinal()] = BlockSapling.lIlllllllIllII[6];
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            llllllllllllIllllIIIlIllllllIlII[BlockPlanks.EnumType.OAK.ordinal()] = BlockSapling.lIlllllllIllII[1];
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            llllllllllllIllllIIIlIllllllIlII[BlockPlanks.EnumType.SPRUCE.ordinal()] = BlockSapling.lIlllllllIllII[2];
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return BlockSapling.$SWITCH_TABLE$net$minecraft$block$BlockPlanks$EnumType = (int[])(Object)llllllllllllIllllIIIlIllllllIlII;
    }
    
    private static String lIIIIllIIIlIIlII(final String llllllllllllIllllIIIlIlllllIllII, final String llllllllllllIllllIIIlIlllllIlIll) {
        try {
            final SecretKeySpec llllllllllllIllllIIIlIlllllIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIlIlllllIlIll.getBytes(StandardCharsets.UTF_8)), BlockSapling.lIlllllllIllII[10]), "DES");
            final Cipher llllllllllllIllllIIIlIlllllIlllI = Cipher.getInstance("DES");
            llllllllllllIllllIIIlIlllllIlllI.init(BlockSapling.lIlllllllIllII[2], llllllllllllIllllIIIlIlllllIllll);
            return new String(llllllllllllIllllIIIlIlllllIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIlIlllllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIIlIlllllIllIl) {
            llllllllllllIllllIIIlIlllllIllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIllIIlIIIIIl(final Object llllllllllllIllllIIIlIlllIllIlll, final Object llllllllllllIllllIIIlIlllIllIllI) {
        return llllllllllllIllllIIIlIlllIllIlll == llllllllllllIllllIIIlIlllIllIllI;
    }
    
    private static boolean lIIIIllIIlIIIIII(final int llllllllllllIllllIIIlIlllIlllIll, final int llllllllllllIllllIIIlIlllIlllIlI) {
        return llllllllllllIllllIIIlIlllIlllIll < llllllllllllIllllIIIlIlllIlllIlI;
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIllllIIIlIlllllllIlI) {
        int llllllllllllIllllIIIlIlllllllIll = BlockSapling.lIlllllllIllII[0];
        llllllllllllIllllIIIlIlllllllIll |= llllllllllllIllllIIIlIlllllllIlI.getValue(BlockSapling.TYPE).getMetadata();
        llllllllllllIllllIIIlIlllllllIll |= llllllllllllIllllIIIlIlllllllIlI.getValue((IProperty<Integer>)BlockSapling.STAGE) << BlockSapling.lIlllllllIllII[3];
        return llllllllllllIllllIIIlIlllllllIll;
    }
    
    private static String lIIIIllIIIlIIlIl(final String llllllllllllIllllIIIlIllllIlllll, final String llllllllllllIllllIIIlIllllIlllII) {
        try {
            final SecretKeySpec llllllllllllIllllIIIlIlllllIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIlIllllIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIIlIlllllIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIIlIlllllIIIIl.init(BlockSapling.lIlllllllIllII[2], llllllllllllIllllIIIlIlllllIIIlI);
            return new String(llllllllllllIllllIIIlIlllllIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIlIllllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIIlIlllllIIIII) {
            llllllllllllIllllIIIlIlllllIIIII.printStackTrace();
            return null;
        }
    }
    
    private static int lIIIIllIIlIIIIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIIIIllIIlIIIIll(final int llllllllllllIllllIIIlIlllIlIlllI) {
        return llllllllllllIllllIIIlIlllIlIlllI < 0;
    }
    
    protected BlockSapling() {
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockSapling.TYPE, BlockPlanks.EnumType.OAK).withProperty((IProperty<Comparable>)BlockSapling.STAGE, BlockSapling.lIlllllllIllII[0]));
        final float llllllllllllIllllIIIllIlIIIlllIl = 0.4f;
        this.setBlockBounds(0.5f - llllllllllllIllllIIIllIlIIIlllIl, 0.0f, 0.5f - llllllllllllIllllIIIllIlIIIlllIl, 0.5f + llllllllllllIllllIIIllIlIIIlllIl, llllllllllllIllllIIIllIlIIIlllIl * 2.0f, 0.5f + llllllllllllIllllIIIllIlIIIlllIl);
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
    }
    
    @Override
    public int damageDropped(final IBlockState llllllllllllIllllIIIllIIIIllllll) {
        return llllllllllllIllllIIIllIIIIllllll.getValue(BlockSapling.TYPE).getMetadata();
    }
}
