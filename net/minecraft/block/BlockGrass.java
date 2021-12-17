// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.item.Item;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.biome.BiomeColorHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.init.Blocks;
import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.PropertyBool;

public class BlockGrass extends Block implements IGrowable
{
    private static final /* synthetic */ String[] lIllIlIIIlIIIl;
    public static final /* synthetic */ PropertyBool SNOWY;
    private static final /* synthetic */ int[] lIllIlIIIlllIl;
    
    static {
        llllllIIIIIlllI();
        lllllIlllllIlII();
        SNOWY = PropertyBool.create(BlockGrass.lIllIlIIIlIIIl[BlockGrass.lIllIlIIIlllIl[0]]);
    }
    
    @Override
    public void updateTick(final World lllllllllllllIIIIIIIlIIIIllIlIIl, final BlockPos lllllllllllllIIIIIIIlIIIIllIlIII, final IBlockState lllllllllllllIIIIIIIlIIIIllIIlll, final Random lllllllllllllIIIIIIIlIIIIlIlllll) {
        if (llllllIIIIlIIII(lllllllllllllIIIIIIIlIIIIllIlIIl.isRemote ? 1 : 0)) {
            if (llllllIIIIlIIIl(lllllllllllllIIIIIIIlIIIIllIlIIl.getLightFromNeighbors(lllllllllllllIIIIIIIlIIIIllIlIII.up()), BlockGrass.lIllIlIIIlllIl[2]) && llllllIIIIlIIlI(lllllllllllllIIIIIIIlIIIIllIlIIl.getBlockState(lllllllllllllIIIIIIIlIIIIllIlIII.up()).getBlock().getLightOpacity(), BlockGrass.lIllIlIIIlllIl[3])) {
                lllllllllllllIIIIIIIlIIIIllIlIIl.setBlockState(lllllllllllllIIIIIIIlIIIIllIlIII, Blocks.dirt.getDefaultState());
                "".length();
                "".length();
                if ((0x9D ^ 0x99) > (0xA4 ^ 0xA0)) {
                    return;
                }
            }
            else if (llllllIIIIlIIll(lllllllllllllIIIIIIIlIIIIllIlIIl.getLightFromNeighbors(lllllllllllllIIIIIIIlIIIIllIlIII.up()), BlockGrass.lIllIlIIIlllIl[4])) {
                int lllllllllllllIIIIIIIlIIIIllIIlIl = BlockGrass.lIllIlIIIlllIl[0];
                "".length();
                if (((0x3A ^ 0x3E) & ~(0x1A ^ 0x1E)) != 0x0) {
                    return;
                }
                while (!llllllIIIIlIIll(lllllllllllllIIIIIIIlIIIIllIIlIl, BlockGrass.lIllIlIIIlllIl[2])) {
                    final BlockPos lllllllllllllIIIIIIIlIIIIllIIlII = lllllllllllllIIIIIIIlIIIIllIlIII.add(lllllllllllllIIIIIIIlIIIIlIlllll.nextInt(BlockGrass.lIllIlIIIlllIl[5]) - BlockGrass.lIllIlIIIlllIl[1], lllllllllllllIIIIIIIlIIIIlIlllll.nextInt(BlockGrass.lIllIlIIIlllIl[6]) - BlockGrass.lIllIlIIIlllIl[5], lllllllllllllIIIIIIIlIIIIlIlllll.nextInt(BlockGrass.lIllIlIIIlllIl[5]) - BlockGrass.lIllIlIIIlllIl[1]);
                    final Block lllllllllllllIIIIIIIlIIIIllIIIll = lllllllllllllIIIIIIIlIIIIllIlIIl.getBlockState(lllllllllllllIIIIIIIlIIIIllIIlII.up()).getBlock();
                    final IBlockState lllllllllllllIIIIIIIlIIIIllIIIlI = lllllllllllllIIIIIIIlIIIIllIlIIl.getBlockState(lllllllllllllIIIIIIIlIIIIllIIlII);
                    if (llllllIIIIlIlII(lllllllllllllIIIIIIIlIIIIllIIIlI.getBlock(), Blocks.dirt) && llllllIIIIlIlII(lllllllllllllIIIIIIIlIIIIllIIIlI.getValue(BlockDirt.VARIANT), BlockDirt.DirtType.DIRT) && llllllIIIIlIIll(lllllllllllllIIIIIIIlIIIIllIlIIl.getLightFromNeighbors(lllllllllllllIIIIIIIlIIIIllIIlII.up()), BlockGrass.lIllIlIIIlllIl[2]) && llllllIIIIlIlIl(lllllllllllllIIIIIIIlIIIIllIIIll.getLightOpacity(), BlockGrass.lIllIlIIIlllIl[3])) {
                        lllllllllllllIIIIIIIlIIIIllIlIIl.setBlockState(lllllllllllllIIIIIIIlIIIIllIIlII, Blocks.grass.getDefaultState());
                        "".length();
                    }
                    ++lllllllllllllIIIIIIIlIIIIllIIlIl;
                }
            }
        }
    }
    
    private static void llllllIIIIIlllI() {
        (lIllIlIIIlllIl = new int[10])[0] = ((0x47 ^ 0x6F) & ~(0x82 ^ 0xAA));
        BlockGrass.lIllIlIIIlllIl[1] = " ".length();
        BlockGrass.lIllIlIIIlllIl[2] = (14 + 62 + 15 + 47 ^ 122 + 46 - 90 + 64);
        BlockGrass.lIllIlIIIlllIl[3] = "  ".length();
        BlockGrass.lIllIlIIIlllIl[4] = (0x27 ^ 0x1C ^ (0x6D ^ 0x5F));
        BlockGrass.lIllIlIIIlllIl[5] = "   ".length();
        BlockGrass.lIllIlIIIlllIl[6] = (0x53 ^ 0x56);
        BlockGrass.lIllIlIIIlllIl[7] = (0x7F ^ 0x6F);
        BlockGrass.lIllIlIIIlllIl[8] = (94 + 46 - 37 + 29 ^ 99 + 75 - 51 + 17);
        BlockGrass.lIllIlIIIlllIl[9] = 22 + 13 - 24 + 117;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockGrass.lIllIlIIIlllIl[1]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockGrass.lIllIlIIIlllIl[0]] = BlockGrass.SNOWY;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static boolean llllllIIIIlIIll(final int lllllllllllllIIIIIIIlIIIIIIlIIlI, final int lllllllllllllIIIIIIIlIIIIIIlIIIl) {
        return lllllllllllllIIIIIIIlIIIIIIlIIlI >= lllllllllllllIIIIIIIlIIIIIIlIIIl;
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT_MIPPED;
    }
    
    protected BlockGrass() {
        super(Material.grass);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockGrass.SNOWY, (boolean)(BlockGrass.lIllIlIIIlllIl[0] != 0)));
        this.setTickRandomly((boolean)(BlockGrass.lIllIlIIIlllIl[1] != 0));
        "".length();
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    @Override
    public int colorMultiplier(final IBlockAccess lllllllllllllIIIIIIIlIIIIlllIllI, final BlockPos lllllllllllllIIIIIIIlIIIIlllIIlI, final int lllllllllllllIIIIIIIlIIIIlllIlII) {
        return BiomeColorHelper.getGrassColorAtPos(lllllllllllllIIIIIIIlIIIIlllIllI, lllllllllllllIIIIIIIlIIIIlllIIlI);
    }
    
    private static void lllllIlllllIlII() {
        (lIllIlIIIlIIIl = new String[BlockGrass.lIllIlIIIlllIl[1]])[BlockGrass.lIllIlIIIlllIl[0]] = lllllIlllllIIlI("dOoit89w5io=", "dpUxg");
    }
    
    @Override
    public void grow(final World lllllllllllllIIIIIIIlIIIIIllIIIl, final Random lllllllllllllIIIIIIIlIIIIIllllII, final BlockPos lllllllllllllIIIIIIIlIIIIIlllIll, final IBlockState lllllllllllllIIIIIIIlIIIIIlllIlI) {
        final BlockPos lllllllllllllIIIIIIIlIIIIIlllIIl = lllllllllllllIIIIIIIlIIIIIlllIll.up();
        int lllllllllllllIIIIIIIlIIIIIlllIII = BlockGrass.lIllIlIIIlllIl[0];
        "".length();
        if ((0x64 ^ 0x60) < "  ".length()) {
            return;
        }
    Label_0445_Outer:
        while (!llllllIIIIlIIll(lllllllllllllIIIIIIIlIIIIIlllIII, BlockGrass.lIllIlIIIlllIl[9])) {
            BlockPos lllllllllllllIIIIIIIlIIIIIllIlll = lllllllllllllIIIIIIIlIIIIIlllIIl;
            int lllllllllllllIIIIIIIlIIIIIllIllI = BlockGrass.lIllIlIIIlllIl[0];
            while (true) {
                while (!llllllIIIIlIIll(lllllllllllllIIIIIIIlIIIIIllIllI, lllllllllllllIIIIIIIlIIIIIlllIII / BlockGrass.lIllIlIIIlllIl[7])) {
                    lllllllllllllIIIIIIIlIIIIIllIlll = lllllllllllllIIIIIIIlIIIIIllIlll.add(lllllllllllllIIIIIIIlIIIIIllllII.nextInt(BlockGrass.lIllIlIIIlllIl[5]) - BlockGrass.lIllIlIIIlllIl[1], (lllllllllllllIIIIIIIlIIIIIllllII.nextInt(BlockGrass.lIllIlIIIlllIl[5]) - BlockGrass.lIllIlIIIlllIl[1]) * lllllllllllllIIIIIIIlIIIIIllllII.nextInt(BlockGrass.lIllIlIIIlllIl[5]) / BlockGrass.lIllIlIIIlllIl[3], lllllllllllllIIIIIIIlIIIIIllllII.nextInt(BlockGrass.lIllIlIIIlllIl[5]) - BlockGrass.lIllIlIIIlllIl[1]);
                    if (llllllIIIIlIlII(lllllllllllllIIIIIIIlIIIIIllIIIl.getBlockState(lllllllllllllIIIIIIIlIIIIIllIlll.down()).getBlock(), Blocks.grass)) {
                        if (llllllIIIIlIllI(lllllllllllllIIIIIIIlIIIIIllIIIl.getBlockState(lllllllllllllIIIIIIIlIIIIIllIlll).getBlock().isNormalCube() ? 1 : 0)) {
                            "".length();
                            if ("   ".length() <= 0) {
                                return;
                            }
                        }
                        else {
                            ++lllllllllllllIIIIIIIlIIIIIllIllI;
                            "".length();
                            if (-"   ".length() > 0) {
                                return;
                            }
                            continue Label_0445_Outer;
                        }
                    }
                    ++lllllllllllllIIIIIIIlIIIIIlllIII;
                    continue Label_0445_Outer;
                }
                if (!llllllIIIIlIlII(lllllllllllllIIIIIIIlIIIIIllIIIl.getBlockState(lllllllllllllIIIIIIIlIIIIIllIlll).getBlock().blockMaterial, Material.air)) {
                    continue;
                }
                if (llllllIIIIlIIII(lllllllllllllIIIIIIIlIIIIIllllII.nextInt(BlockGrass.lIllIlIIIlllIl[8]))) {
                    final BlockFlower.EnumFlowerType lllllllllllllIIIIIIIlIIIIIllIlIl = lllllllllllllIIIIIIIlIIIIIllIIIl.getBiomeGenForCoords(lllllllllllllIIIIIIIlIIIIIllIlll).pickRandomFlower(lllllllllllllIIIIIIIlIIIIIllllII, lllllllllllllIIIIIIIlIIIIIllIlll);
                    final BlockFlower lllllllllllllIIIIIIIlIIIIIllIlII = lllllllllllllIIIIIIIlIIIIIllIlIl.getBlockType().getBlock();
                    final IBlockState lllllllllllllIIIIIIIlIIIIIllIIll = lllllllllllllIIIIIIIlIIIIIllIlII.getDefaultState().withProperty(lllllllllllllIIIIIIIlIIIIIllIlII.getTypeProperty(), lllllllllllllIIIIIIIlIIIIIllIlIl);
                    if (!llllllIIIIlIllI(lllllllllllllIIIIIIIlIIIIIllIlII.canBlockStay(lllllllllllllIIIIIIIlIIIIIllIIIl, lllllllllllllIIIIIIIlIIIIIllIlll, lllllllllllllIIIIIIIlIIIIIllIIll) ? 1 : 0)) {
                        continue;
                    }
                    lllllllllllllIIIIIIIlIIIIIllIIIl.setBlockState(lllllllllllllIIIIIIIlIIIIIllIlll, lllllllllllllIIIIIIIlIIIIIllIIll, BlockGrass.lIllIlIIIlllIl[5]);
                    "".length();
                    "".length();
                    if (" ".length() <= -" ".length()) {
                        return;
                    }
                    continue;
                }
                else {
                    final IBlockState lllllllllllllIIIIIIIlIIIIIllIIlI = Blocks.tallgrass.getDefaultState().withProperty(BlockTallGrass.TYPE, BlockTallGrass.EnumType.GRASS);
                    if (!llllllIIIIlIllI(Blocks.tallgrass.canBlockStay(lllllllllllllIIIIIIIlIIIIIllIIIl, lllllllllllllIIIIIIIlIIIIIllIlll, lllllllllllllIIIIIIIlIIIIIllIIlI) ? 1 : 0)) {
                        continue;
                    }
                    lllllllllllllIIIIIIIlIIIIIllIIIl.setBlockState(lllllllllllllIIIIIIIlIIIIIllIlll, lllllllllllllIIIIIIIlIIIIIllIIlI, BlockGrass.lIllIlIIIlllIl[5]);
                    "".length();
                    "".length();
                    if (((0xE8 ^ 0xBB ^ (0x77 ^ 0x28)) & (0xFB ^ 0xB3 ^ (0xC4 ^ 0x80) ^ -" ".length())) != 0x0) {
                        return;
                    }
                    continue;
                }
                break;
            }
        }
    }
    
    @Override
    public int getBlockColor() {
        return ColorizerGrass.getGrassColor(0.5, 1.0);
    }
    
    private static boolean llllllIIIIlIlIl(final int lllllllllllllIIIIIIIlIIIIIIIlIlI, final int lllllllllllllIIIIIIIlIIIIIIIlIIl) {
        return lllllllllllllIIIIIIIlIIIIIIIlIlI <= lllllllllllllIIIIIIIlIIIIIIIlIIl;
    }
    
    private static String lllllIlllllIIlI(final String lllllllllllllIIIIIIIlIIIIIIllIlI, final String lllllllllllllIIIIIIIlIIIIIIlIlll) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIIlIIIIIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIlIIIIIIlIlll.getBytes(StandardCharsets.UTF_8)), BlockGrass.lIllIlIIIlllIl[8]), "DES");
            final Cipher lllllllllllllIIIIIIIlIIIIIIlllII = Cipher.getInstance("DES");
            lllllllllllllIIIIIIIlIIIIIIlllII.init(BlockGrass.lIllIlIIIlllIl[3], lllllllllllllIIIIIIIlIIIIIIlllIl);
            return new String(lllllllllllllIIIIIIIlIIIIIIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIlIIIIIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIIlIIIIIIllIll) {
            lllllllllllllIIIIIIIlIIIIIIllIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean canGrow(final World lllllllllllllIIIIIIIlIIIIlIlIIIl, final BlockPos lllllllllllllIIIIIIIlIIIIlIlIIII, final IBlockState lllllllllllllIIIIIIIlIIIIlIIllll, final boolean lllllllllllllIIIIIIIlIIIIlIIlllI) {
        return BlockGrass.lIllIlIIIlllIl[1] != 0;
    }
    
    @Override
    public int getRenderColor(final IBlockState lllllllllllllIIIIIIIlIIIIllllIll) {
        return this.getBlockColor();
    }
    
    @Override
    public IBlockState getActualState(final IBlockState lllllllllllllIIIIIIIlIIIlIIIIllI, final IBlockAccess lllllllllllllIIIIIIIlIIIlIIIIlIl, final BlockPos lllllllllllllIIIIIIIlIIIlIIIIIII) {
        final Block lllllllllllllIIIIIIIlIIIlIIIIIll = lllllllllllllIIIIIIIlIIIlIIIIlIl.getBlockState(lllllllllllllIIIIIIIlIIIlIIIIIII.up()).getBlock();
        final PropertyBool snowy = BlockGrass.SNOWY;
        int b;
        if (llllllIIIIIllll(lllllllllllllIIIIIIIlIIIlIIIIIll, Blocks.snow) && llllllIIIIIllll(lllllllllllllIIIIIIIlIIIlIIIIIll, Blocks.snow_layer)) {
            b = BlockGrass.lIllIlIIIlllIl[0];
            "".length();
            if (((57 + 153 - 147 + 94 ^ 94 + 72 - 42 + 53) & (17 + 108 - 113 + 146 ^ 154 + 108 - 154 + 70 ^ -" ".length())) < 0) {
                return null;
            }
        }
        else {
            b = BlockGrass.lIllIlIIIlllIl[1];
        }
        return lllllllllllllIIIIIIIlIIIlIIIIllI.withProperty((IProperty<Comparable>)snowy, (boolean)(b != 0));
    }
    
    private static boolean llllllIIIIIllll(final Object lllllllllllllIIIIIIIlIIIIIIIIIlI, final Object lllllllllllllIIIIIIIlIIIIIIIIIIl) {
        return lllllllllllllIIIIIIIlIIIIIIIIIlI != lllllllllllllIIIIIIIlIIIIIIIIIIl;
    }
    
    private static boolean llllllIIIIlIIlI(final int lllllllllllllIIIIIIIlIIIIIIIIllI, final int lllllllllllllIIIIIIIlIIIIIIIIlIl) {
        return lllllllllllllIIIIIIIlIIIIIIIIllI > lllllllllllllIIIIIIIlIIIIIIIIlIl;
    }
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIIIIIIIlIIIIlIlIlll, final Random lllllllllllllIIIIIIIlIIIIlIlIllI, final int lllllllllllllIIIIIIIlIIIIlIlIIll) {
        return Blocks.dirt.getItemDropped(Blocks.dirt.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT), lllllllllllllIIIIIIIlIIIIlIlIllI, lllllllllllllIIIIIIIlIIIIlIlIIll);
    }
    
    private static boolean llllllIIIIlIllI(final int lllllllllllllIIIIIIIIllllllllIll) {
        return lllllllllllllIIIIIIIIllllllllIll != 0;
    }
    
    @Override
    public boolean canUseBonemeal(final World lllllllllllllIIIIIIIlIIIIlIIllII, final Random lllllllllllllIIIIIIIlIIIIlIIlIll, final BlockPos lllllllllllllIIIIIIIlIIIIlIIlIlI, final IBlockState lllllllllllllIIIIIIIlIIIIlIIlIIl) {
        return BlockGrass.lIllIlIIIlllIl[1] != 0;
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIIIIIIlIIIIIlIIlIl) {
        return BlockGrass.lIllIlIIIlllIl[0];
    }
    
    private static boolean llllllIIIIlIIIl(final int lllllllllllllIIIIIIIlIIIIIIIlllI, final int lllllllllllllIIIIIIIlIIIIIIIllIl) {
        return lllllllllllllIIIIIIIlIIIIIIIlllI < lllllllllllllIIIIIIIlIIIIIIIllIl;
    }
    
    private static boolean llllllIIIIlIlII(final Object lllllllllllllIIIIIIIIllllllllllI, final Object lllllllllllllIIIIIIIIlllllllllIl) {
        return lllllllllllllIIIIIIIIllllllllllI == lllllllllllllIIIIIIIIlllllllllIl;
    }
    
    private static boolean llllllIIIIlIIII(final int lllllllllllllIIIIIIIIllllllllIIl) {
        return lllllllllllllIIIIIIIIllllllllIIl == 0;
    }
}
