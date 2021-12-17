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
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.world.biome.BiomeColorHelper;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.state.IBlockState;
import java.util.Random;
import net.minecraft.block.properties.PropertyBool;

public abstract class BlockLeaves extends BlockLeavesBase
{
    private static final /* synthetic */ int[] llIllIlIlIllII;
    public static final /* synthetic */ PropertyBool DECAYABLE;
    public static final /* synthetic */ PropertyBool CHECK_DECAY;
    /* synthetic */ int[] surroundings;
    protected /* synthetic */ boolean isTransparent;
    private static final /* synthetic */ String[] llIllIlIlIlIll;
    protected /* synthetic */ int iconIndex;
    
    @Override
    public int quantityDropped(final Random llllllllllllIllIIllIlIlllllllIlI) {
        int n;
        if (lIIlIlllllIllIlI(llllllllllllIllIIllIlIlllllllIlI.nextInt(BlockLeaves.llIllIlIlIllII[8]))) {
            n = BlockLeaves.llIllIlIlIllII[1];
            "".length();
            if (null != null) {
                return (0xEF ^ 0xC7) & ~(0x80 ^ 0xA8);
            }
        }
        else {
            n = BlockLeaves.llIllIlIlIllII[0];
        }
        return n;
    }
    
    private static boolean lIIlIlllllIllIll(final int llllllllllllIllIIllIlIlllIllIlII, final int llllllllllllIllIIllIlIlllIllIIll) {
        return llllllllllllIllIIllIlIlllIllIlII > llllllllllllIllIIllIlIlllIllIIll;
    }
    
    public abstract BlockPlanks.EnumType getWoodType(final int p0);
    
    @Override
    public boolean isOpaqueCube() {
        int n;
        if (lIIlIlllllIllIII(this.fancyGraphics ? 1 : 0)) {
            n = BlockLeaves.llIllIlIlIllII[0];
            "".length();
            if (((0x7A ^ 0x2D) & ~(0x1E ^ 0x49)) >= "  ".length()) {
                return ((0x96 ^ 0xC4) & ~(0x3C ^ 0x6E)) != 0x0;
            }
        }
        else {
            n = BlockLeaves.llIllIlIlIllII[1];
        }
        return n != 0;
    }
    
    protected int getSaplingDropChance(final IBlockState llllllllllllIllIIllIlIllllIllIIl) {
        return BlockLeaves.llIllIlIlIllII[8];
    }
    
    @Override
    public void dropBlockAsItemWithChance(final World llllllllllllIllIIllIlIlllllIllIl, final BlockPos llllllllllllIllIIllIlIlllllIllII, final IBlockState llllllllllllIllIIllIlIlllllIlIll, final float llllllllllllIllIIllIlIlllllIlIlI, final int llllllllllllIllIIllIlIlllllIlIIl) {
        if (lIIlIlllllIllIlI(llllllllllllIllIIllIlIlllllIllIl.isRemote ? 1 : 0)) {
            int llllllllllllIllIIllIlIlllllIlIII = this.getSaplingDropChance(llllllllllllIllIIllIlIlllllIlIll);
            if (lIIlIllllllIIIII(llllllllllllIllIIllIlIlllllIlIIl)) {
                llllllllllllIllIIllIlIlllllIlIII -= BlockLeaves.llIllIlIlIllII[4] << llllllllllllIllIIllIlIlllllIlIIl;
                if (lIIlIllllllIIIIl(llllllllllllIllIIllIlIlllllIlIII, BlockLeaves.llIllIlIlIllII[9])) {
                    llllllllllllIllIIllIlIlllllIlIII = BlockLeaves.llIllIlIlIllII[9];
                }
            }
            if (lIIlIlllllIllIlI(llllllllllllIllIIllIlIlllllIllIl.rand.nextInt(llllllllllllIllIIllIlIlllllIlIII))) {
                final Item llllllllllllIllIIllIlIlllllIIlll = this.getItemDropped(llllllllllllIllIIllIlIlllllIlIll, llllllllllllIllIIllIlIlllllIllIl.rand, llllllllllllIllIIllIlIlllllIlIIl);
                Block.spawnAsEntity(llllllllllllIllIIllIlIlllllIllIl, llllllllllllIllIIllIlIlllllIllII, new ItemStack(llllllllllllIllIIllIlIlllllIIlll, BlockLeaves.llIllIlIlIllII[1], this.damageDropped(llllllllllllIllIIllIlIlllllIlIll)));
            }
            llllllllllllIllIIllIlIlllllIlIII = BlockLeaves.llIllIlIlIllII[10];
            if (lIIlIllllllIIIII(llllllllllllIllIIllIlIlllllIlIIl)) {
                llllllllllllIllIIllIlIlllllIlIII -= BlockLeaves.llIllIlIlIllII[9] << llllllllllllIllIIllIlIlllllIlIIl;
                if (lIIlIllllllIIIIl(llllllllllllIllIIllIlIlllllIlIII, BlockLeaves.llIllIlIlIllII[11])) {
                    llllllllllllIllIIllIlIlllllIlIII = BlockLeaves.llIllIlIlIllII[11];
                }
            }
            this.dropApple(llllllllllllIllIIllIlIlllllIllIl, llllllllllllIllIIllIlIlllllIllII, llllllllllllIllIIllIlIlllllIlIll, llllllllllllIllIIllIlIlllllIlIII);
        }
    }
    
    @Override
    public int getRenderColor(final IBlockState llllllllllllIllIIllIllIIlIIIIIlI) {
        return ColorizerFoliage.getFoliageColorBasic();
    }
    
    @Override
    public void randomDisplayTick(final World llllllllllllIllIIllIllIIIIIIllII, final BlockPos llllllllllllIllIIllIllIIIIIlIIlI, final IBlockState llllllllllllIllIIllIllIIIIIlIIIl, final Random llllllllllllIllIIllIllIIIIIIlIlI) {
        if (lIIlIlllllIllIII(llllllllllllIllIIllIllIIIIIIllII.canLightningStrike(llllllllllllIllIIllIllIIIIIlIIlI.up()) ? 1 : 0) && lIIlIlllllIllIlI(World.doesBlockHaveSolidTopSurface(llllllllllllIllIIllIllIIIIIIllII, llllllllllllIllIIllIllIIIIIlIIlI.down()) ? 1 : 0) && lIIlIlllllIllllI(llllllllllllIllIIllIllIIIIIIlIlI.nextInt(BlockLeaves.llIllIlIlIllII[7]), BlockLeaves.llIllIlIlIllII[1])) {
            final double llllllllllllIllIIllIllIIIIIIllll = llllllllllllIllIIllIllIIIIIlIIlI.getX() + llllllllllllIllIIllIllIIIIIIlIlI.nextFloat();
            final double llllllllllllIllIIllIllIIIIIIlllI = llllllllllllIllIIllIllIIIIIlIIlI.getY() - 0.05;
            final double llllllllllllIllIIllIllIIIIIIllIl = llllllllllllIllIIllIllIIIIIlIIlI.getZ() + llllllllllllIllIIllIllIIIIIIlIlI.nextFloat();
            llllllllllllIllIIllIllIIIIIIllII.spawnParticle(EnumParticleTypes.DRIP_WATER, llllllllllllIllIIllIllIIIIIIllll, llllllllllllIllIIllIllIIIIIIlllI, llllllllllllIllIIllIllIIIIIIllIl, 0.0, 0.0, 0.0, new int[BlockLeaves.llIllIlIlIllII[0]]);
        }
    }
    
    @Override
    public int getBlockColor() {
        return ColorizerFoliage.getFoliageColor(0.5, 1.0);
    }
    
    private static boolean lIIlIlllllIlllll(final int llllllllllllIllIIllIlIlllIlIIIll) {
        return llllllllllllIllIIllIlIlllIlIIIll >= 0;
    }
    
    private static void lIIlIlllllIlIlll() {
        (llIllIlIlIllII = new int[13])[0] = ((0x4 ^ 0x42 ^ (0x14 ^ 0x4D)) & (73 + 160 - 167 + 98 ^ 159 + 74 - 181 + 135 ^ -" ".length()));
        BlockLeaves.llIllIlIlIllII[1] = " ".length();
        BlockLeaves.llIllIlIlIllII[2] = (0x1E ^ 0x1A);
        BlockLeaves.llIllIlIlIllII[3] = (0xD1 ^ 0xA7 ^ (0x3E ^ 0x68));
        BlockLeaves.llIllIlIlIllII[4] = "  ".length();
        BlockLeaves.llIllIlIlIllII[5] = -"  ".length();
        BlockLeaves.llIllIlIlIllII[6] = -" ".length();
        BlockLeaves.llIllIlIlIllII[7] = (0x6D ^ 0x62);
        BlockLeaves.llIllIlIlIllII[8] = (0x8 ^ 0x1C);
        BlockLeaves.llIllIlIlIllII[9] = (0x7D ^ 0x2A ^ (0x2E ^ 0x73));
        BlockLeaves.llIllIlIlIllII[10] = 11 + 142 - 129 + 122 + (0x79 ^ 0x5) - (0xC0 ^ 0x8E) + (0x62 ^ 0x6A);
        BlockLeaves.llIllIlIlIllII[11] = (0x5C ^ 0x56 ^ (0x54 ^ 0x76));
        BlockLeaves.llIllIlIlIllII[12] = (0x3B ^ 0x33);
    }
    
    @Override
    public int colorMultiplier(final IBlockAccess llllllllllllIllIIllIllIIIllllllI, final BlockPos llllllllllllIllIIllIllIIIllllIlI, final int llllllllllllIllIIllIllIIIlllllII) {
        return BiomeColorHelper.getFoliageColorAtPos(llllllllllllIllIIllIllIIIllllllI, llllllllllllIllIIllIllIIIllllIlI);
    }
    
    public BlockLeaves() {
        super(Material.leaves, (boolean)(BlockLeaves.llIllIlIlIllII[0] != 0));
        this.setTickRandomly((boolean)(BlockLeaves.llIllIlIlIllII[1] != 0));
        "".length();
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
        this.setHardness(0.2f);
        "".length();
        this.setLightOpacity(BlockLeaves.llIllIlIlIllII[1]);
        "".length();
        this.setStepSound(BlockLeaves.soundTypeGrass);
        "".length();
    }
    
    private static boolean lIIlIlllllIllIIl(final Object llllllllllllIllIIllIlIlllIlIllII, final Object llllllllllllIllIIllIlIlllIlIlIll) {
        return llllllllllllIllIIllIlIlllIlIllII == llllllllllllIllIIllIlIlllIlIlIll;
    }
    
    private static boolean lIIlIlllllIllIlI(final int llllllllllllIllIIllIlIlllIlIIlIl) {
        return llllllllllllIllIIllIlIlllIlIIlIl == 0;
    }
    
    private static boolean lIIlIlllllIlllIl(final Object llllllllllllIllIIllIlIlllIllIIII, final Object llllllllllllIllIIllIlIlllIlIllll) {
        return llllllllllllIllIIllIlIlllIllIIII != llllllllllllIllIIllIlIlllIlIllll;
    }
    
    protected void dropApple(final World llllllllllllIllIIllIlIllllIllllI, final BlockPos llllllllllllIllIIllIlIllllIlllIl, final IBlockState llllllllllllIllIIllIlIllllIlllII, final int llllllllllllIllIIllIlIllllIllIll) {
    }
    
    @Override
    public Item getItemDropped(final IBlockState llllllllllllIllIIllIlIlllllllIII, final Random llllllllllllIllIIllIlIllllllIlll, final int llllllllllllIllIIllIlIllllllIllI) {
        return Item.getItemFromBlock(Blocks.sapling);
    }
    
    private static boolean lIIlIlllllIlllII(final Object llllllllllllIllIIllIlIlllIlIlIIl) {
        return llllllllllllIllIIllIlIlllIlIlIIl == null;
    }
    
    private static boolean lIIlIlllllIllIII(final int llllllllllllIllIIllIlIlllIlIIlll) {
        return llllllllllllIllIIllIlIlllIlIIlll != 0;
    }
    
    @Override
    public boolean isVisuallyOpaque() {
        return BlockLeaves.llIllIlIlIllII[0] != 0;
    }
    
    private static boolean lIIlIlllllIllllI(final int llllllllllllIllIIllIlIlllIllllII, final int llllllllllllIllIIllIlIlllIlllIll) {
        return llllllllllllIllIIllIlIlllIllllII == llllllllllllIllIIllIlIlllIlllIll;
    }
    
    public void setGraphicsLevel(final boolean llllllllllllIllIIllIlIllllIlIIlI) {
        this.isTransparent = llllllllllllIllIIllIlIllllIlIIlI;
        this.fancyGraphics = llllllllllllIllIIllIlIllllIlIIlI;
        int iconIndex;
        if (lIIlIlllllIllIII(llllllllllllIllIIllIlIllllIlIIlI ? 1 : 0)) {
            iconIndex = BlockLeaves.llIllIlIlIllII[0];
            "".length();
            if ("   ".length() > (0x45 ^ 0xA ^ (0x5D ^ 0x16))) {
                return;
            }
        }
        else {
            iconIndex = BlockLeaves.llIllIlIlIllII[1];
        }
        this.iconIndex = iconIndex;
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        EnumWorldBlockLayer enumWorldBlockLayer;
        if (lIIlIlllllIllIII(this.isTransparent ? 1 : 0)) {
            enumWorldBlockLayer = EnumWorldBlockLayer.CUTOUT_MIPPED;
            "".length();
            if ("  ".length() >= (0xCF ^ 0xA4 ^ (0x5E ^ 0x31))) {
                return null;
            }
        }
        else {
            enumWorldBlockLayer = EnumWorldBlockLayer.SOLID;
        }
        return enumWorldBlockLayer;
    }
    
    @Override
    public void updateTick(final World llllllllllllIllIIllIllIIIIlIlIlI, final BlockPos llllllllllllIllIIllIllIIIIlIlIIl, final IBlockState llllllllllllIllIIllIllIIIIlIlIII, final Random llllllllllllIllIIllIllIIIIlllllI) {
        if (lIIlIlllllIllIlI(llllllllllllIllIIllIllIIIIlIlIlI.isRemote ? 1 : 0) && lIIlIlllllIllIII(((boolean)llllllllllllIllIIllIllIIIIlIlIII.getValue((IProperty<Boolean>)BlockLeaves.CHECK_DECAY)) ? 1 : 0) && lIIlIlllllIllIII(((boolean)llllllllllllIllIIllIllIIIIlIlIII.getValue((IProperty<Boolean>)BlockLeaves.DECAYABLE)) ? 1 : 0)) {
            final int llllllllllllIllIIllIllIIIIllllIl = BlockLeaves.llIllIlIlIllII[2];
            final int llllllllllllIllIIllIllIIIIllllII = llllllllllllIllIIllIllIIIIllllIl + BlockLeaves.llIllIlIlIllII[1];
            final int llllllllllllIllIIllIllIIIIlllIll = llllllllllllIllIIllIllIIIIlIlIIl.getX();
            final int llllllllllllIllIIllIllIIIIlllIlI = llllllllllllIllIIllIllIIIIlIlIIl.getY();
            final int llllllllllllIllIIllIllIIIIlllIIl = llllllllllllIllIIllIllIIIIlIlIIl.getZ();
            final int llllllllllllIllIIllIllIIIIlllIII = BlockLeaves.llIllIlIlIllII[3];
            final int llllllllllllIllIIllIllIIIIllIlll = llllllllllllIllIIllIllIIIIlllIII * llllllllllllIllIIllIllIIIIlllIII;
            final int llllllllllllIllIIllIllIIIIllIllI = llllllllllllIllIIllIllIIIIlllIII / BlockLeaves.llIllIlIlIllII[4];
            if (lIIlIlllllIlllII(this.surroundings)) {
                this.surroundings = new int[llllllllllllIllIIllIllIIIIlllIII * llllllllllllIllIIllIllIIIIlllIII * llllllllllllIllIIllIllIIIIlllIII];
            }
            if (lIIlIlllllIllIII(llllllllllllIllIIllIllIIIIlIlIlI.isAreaLoaded(new BlockPos(llllllllllllIllIIllIllIIIIlllIll - llllllllllllIllIIllIllIIIIllllII, llllllllllllIllIIllIllIIIIlllIlI - llllllllllllIllIIllIllIIIIllllII, llllllllllllIllIIllIllIIIIlllIIl - llllllllllllIllIIllIllIIIIllllII), new BlockPos(llllllllllllIllIIllIllIIIIlllIll + llllllllllllIllIIllIllIIIIllllII, llllllllllllIllIIllIllIIIIlllIlI + llllllllllllIllIIllIllIIIIllllII, llllllllllllIllIIllIllIIIIlllIIl + llllllllllllIllIIllIllIIIIllllII)) ? 1 : 0)) {
                final BlockPos.MutableBlockPos llllllllllllIllIIllIllIIIIllIlIl = new BlockPos.MutableBlockPos();
                int llllllllllllIllIIllIllIIIIllIlII = -llllllllllllIllIIllIllIIIIllllIl;
                "".length();
                if (-" ".length() > "   ".length()) {
                    return;
                }
                while (!lIIlIlllllIllIll(llllllllllllIllIIllIllIIIIllIlII, llllllllllllIllIIllIllIIIIllllIl)) {
                    int llllllllllllIllIIllIllIIIIllIIll = -llllllllllllIllIIllIllIIIIllllIl;
                    "".length();
                    if (-" ".length() >= 0) {
                        return;
                    }
                    while (!lIIlIlllllIllIll(llllllllllllIllIIllIllIIIIllIIll, llllllllllllIllIIllIllIIIIllllIl)) {
                        int llllllllllllIllIIllIllIIIIllIIlI = -llllllllllllIllIIllIllIIIIllllIl;
                        "".length();
                        if (-"  ".length() > 0) {
                            return;
                        }
                        while (!lIIlIlllllIllIll(llllllllllllIllIIllIllIIIIllIIlI, llllllllllllIllIIllIllIIIIllllIl)) {
                            final Block llllllllllllIllIIllIllIIIIllIIIl = llllllllllllIllIIllIllIIIIlIlIlI.getBlockState(llllllllllllIllIIllIllIIIIllIlIl.func_181079_c(llllllllllllIllIIllIllIIIIlllIll + llllllllllllIllIIllIllIIIIllIlII, llllllllllllIllIIllIllIIIIlllIlI + llllllllllllIllIIllIllIIIIllIIll, llllllllllllIllIIllIllIIIIlllIIl + llllllllllllIllIIllIllIIIIllIIlI)).getBlock();
                            if (lIIlIlllllIlllIl(llllllllllllIllIIllIllIIIIllIIIl, Blocks.log) && lIIlIlllllIlllIl(llllllllllllIllIIllIllIIIIllIIIl, Blocks.log2)) {
                                if (lIIlIlllllIllIIl(llllllllllllIllIIllIllIIIIllIIIl.getMaterial(), Material.leaves)) {
                                    this.surroundings[(llllllllllllIllIIllIllIIIIllIlII + llllllllllllIllIIllIllIIIIllIllI) * llllllllllllIllIIllIllIIIIllIlll + (llllllllllllIllIIllIllIIIIllIIll + llllllllllllIllIIllIllIIIIllIllI) * llllllllllllIllIIllIllIIIIlllIII + llllllllllllIllIIllIllIIIIllIIlI + llllllllllllIllIIllIllIIIIllIllI] = BlockLeaves.llIllIlIlIllII[5];
                                    "".length();
                                    if (((94 + 98 - 175 + 110 ^ (0x3F ^ 0x7A)) & (0xDF ^ 0x8A ^ (0xF4 ^ 0x9B) ^ -" ".length()) & (((85 + 184 - 66 + 25 ^ 146 + 97 - 105 + 42) & (29 + 96 - 57 + 136 ^ 13 + 122 - 40 + 61 ^ -" ".length())) ^ -" ".length())) != 0x0) {
                                        return;
                                    }
                                }
                                else {
                                    this.surroundings[(llllllllllllIllIIllIllIIIIllIlII + llllllllllllIllIIllIllIIIIllIllI) * llllllllllllIllIIllIllIIIIllIlll + (llllllllllllIllIIllIllIIIIllIIll + llllllllllllIllIIllIllIIIIllIllI) * llllllllllllIllIIllIllIIIIlllIII + llllllllllllIllIIllIllIIIIllIIlI + llllllllllllIllIIllIllIIIIllIllI] = BlockLeaves.llIllIlIlIllII[6];
                                    "".length();
                                    if (-"   ".length() > 0) {
                                        return;
                                    }
                                }
                            }
                            else {
                                this.surroundings[(llllllllllllIllIIllIllIIIIllIlII + llllllllllllIllIIllIllIIIIllIllI) * llllllllllllIllIIllIllIIIIllIlll + (llllllllllllIllIIllIllIIIIllIIll + llllllllllllIllIIllIllIIIIllIllI) * llllllllllllIllIIllIllIIIIlllIII + llllllllllllIllIIllIllIIIIllIIlI + llllllllllllIllIIllIllIIIIllIllI] = BlockLeaves.llIllIlIlIllII[0];
                            }
                            ++llllllllllllIllIIllIllIIIIllIIlI;
                        }
                        ++llllllllllllIllIIllIllIIIIllIIll;
                    }
                    ++llllllllllllIllIIllIllIIIIllIlII;
                }
                int llllllllllllIllIIllIllIIIIllIIII = BlockLeaves.llIllIlIlIllII[1];
                "".length();
                if (" ".length() == -" ".length()) {
                    return;
                }
                while (!lIIlIlllllIllIll(llllllllllllIllIIllIllIIIIllIIII, BlockLeaves.llIllIlIlIllII[2])) {
                    int llllllllllllIllIIllIllIIIIlIllll = -llllllllllllIllIIllIllIIIIllllIl;
                    "".length();
                    if (-"   ".length() > 0) {
                        return;
                    }
                    while (!lIIlIlllllIllIll(llllllllllllIllIIllIllIIIIlIllll, llllllllllllIllIIllIllIIIIllllIl)) {
                        int llllllllllllIllIIllIllIIIIlIlllI = -llllllllllllIllIIllIllIIIIllllIl;
                        "".length();
                        if (-" ".length() >= 0) {
                            return;
                        }
                        while (!lIIlIlllllIllIll(llllllllllllIllIIllIllIIIIlIlllI, llllllllllllIllIIllIllIIIIllllIl)) {
                            int llllllllllllIllIIllIllIIIIlIllIl = -llllllllllllIllIIllIllIIIIllllIl;
                            "".length();
                            if (null != null) {
                                return;
                            }
                            while (!lIIlIlllllIllIll(llllllllllllIllIIllIllIIIIlIllIl, llllllllllllIllIIllIllIIIIllllIl)) {
                                if (lIIlIlllllIllllI(this.surroundings[(llllllllllllIllIIllIllIIIIlIllll + llllllllllllIllIIllIllIIIIllIllI) * llllllllllllIllIIllIllIIIIllIlll + (llllllllllllIllIIllIllIIIIlIlllI + llllllllllllIllIIllIllIIIIllIllI) * llllllllllllIllIIllIllIIIIlllIII + llllllllllllIllIIllIllIIIIlIllIl + llllllllllllIllIIllIllIIIIllIllI], llllllllllllIllIIllIllIIIIllIIII - BlockLeaves.llIllIlIlIllII[1])) {
                                    if (lIIlIlllllIllllI(this.surroundings[(llllllllllllIllIIllIllIIIIlIllll + llllllllllllIllIIllIllIIIIllIllI - BlockLeaves.llIllIlIlIllII[1]) * llllllllllllIllIIllIllIIIIllIlll + (llllllllllllIllIIllIllIIIIlIlllI + llllllllllllIllIIllIllIIIIllIllI) * llllllllllllIllIIllIllIIIIlllIII + llllllllllllIllIIllIllIIIIlIllIl + llllllllllllIllIIllIllIIIIllIllI], BlockLeaves.llIllIlIlIllII[5])) {
                                        this.surroundings[(llllllllllllIllIIllIllIIIIlIllll + llllllllllllIllIIllIllIIIIllIllI - BlockLeaves.llIllIlIlIllII[1]) * llllllllllllIllIIllIllIIIIllIlll + (llllllllllllIllIIllIllIIIIlIlllI + llllllllllllIllIIllIllIIIIllIllI) * llllllllllllIllIIllIllIIIIlllIII + llllllllllllIllIIllIllIIIIlIllIl + llllllllllllIllIIllIllIIIIllIllI] = llllllllllllIllIIllIllIIIIllIIII;
                                    }
                                    if (lIIlIlllllIllllI(this.surroundings[(llllllllllllIllIIllIllIIIIlIllll + llllllllllllIllIIllIllIIIIllIllI + BlockLeaves.llIllIlIlIllII[1]) * llllllllllllIllIIllIllIIIIllIlll + (llllllllllllIllIIllIllIIIIlIlllI + llllllllllllIllIIllIllIIIIllIllI) * llllllllllllIllIIllIllIIIIlllIII + llllllllllllIllIIllIllIIIIlIllIl + llllllllllllIllIIllIllIIIIllIllI], BlockLeaves.llIllIlIlIllII[5])) {
                                        this.surroundings[(llllllllllllIllIIllIllIIIIlIllll + llllllllllllIllIIllIllIIIIllIllI + BlockLeaves.llIllIlIlIllII[1]) * llllllllllllIllIIllIllIIIIllIlll + (llllllllllllIllIIllIllIIIIlIlllI + llllllllllllIllIIllIllIIIIllIllI) * llllllllllllIllIIllIllIIIIlllIII + llllllllllllIllIIllIllIIIIlIllIl + llllllllllllIllIIllIllIIIIllIllI] = llllllllllllIllIIllIllIIIIllIIII;
                                    }
                                    if (lIIlIlllllIllllI(this.surroundings[(llllllllllllIllIIllIllIIIIlIllll + llllllllllllIllIIllIllIIIIllIllI) * llllllllllllIllIIllIllIIIIllIlll + (llllllllllllIllIIllIllIIIIlIlllI + llllllllllllIllIIllIllIIIIllIllI - BlockLeaves.llIllIlIlIllII[1]) * llllllllllllIllIIllIllIIIIlllIII + llllllllllllIllIIllIllIIIIlIllIl + llllllllllllIllIIllIllIIIIllIllI], BlockLeaves.llIllIlIlIllII[5])) {
                                        this.surroundings[(llllllllllllIllIIllIllIIIIlIllll + llllllllllllIllIIllIllIIIIllIllI) * llllllllllllIllIIllIllIIIIllIlll + (llllllllllllIllIIllIllIIIIlIlllI + llllllllllllIllIIllIllIIIIllIllI - BlockLeaves.llIllIlIlIllII[1]) * llllllllllllIllIIllIllIIIIlllIII + llllllllllllIllIIllIllIIIIlIllIl + llllllllllllIllIIllIllIIIIllIllI] = llllllllllllIllIIllIllIIIIllIIII;
                                    }
                                    if (lIIlIlllllIllllI(this.surroundings[(llllllllllllIllIIllIllIIIIlIllll + llllllllllllIllIIllIllIIIIllIllI) * llllllllllllIllIIllIllIIIIllIlll + (llllllllllllIllIIllIllIIIIlIlllI + llllllllllllIllIIllIllIIIIllIllI + BlockLeaves.llIllIlIlIllII[1]) * llllllllllllIllIIllIllIIIIlllIII + llllllllllllIllIIllIllIIIIlIllIl + llllllllllllIllIIllIllIIIIllIllI], BlockLeaves.llIllIlIlIllII[5])) {
                                        this.surroundings[(llllllllllllIllIIllIllIIIIlIllll + llllllllllllIllIIllIllIIIIllIllI) * llllllllllllIllIIllIllIIIIllIlll + (llllllllllllIllIIllIllIIIIlIlllI + llllllllllllIllIIllIllIIIIllIllI + BlockLeaves.llIllIlIlIllII[1]) * llllllllllllIllIIllIllIIIIlllIII + llllllllllllIllIIllIllIIIIlIllIl + llllllllllllIllIIllIllIIIIllIllI] = llllllllllllIllIIllIllIIIIllIIII;
                                    }
                                    if (lIIlIlllllIllllI(this.surroundings[(llllllllllllIllIIllIllIIIIlIllll + llllllllllllIllIIllIllIIIIllIllI) * llllllllllllIllIIllIllIIIIllIlll + (llllllllllllIllIIllIllIIIIlIlllI + llllllllllllIllIIllIllIIIIllIllI) * llllllllllllIllIIllIllIIIIlllIII + (llllllllllllIllIIllIllIIIIlIllIl + llllllllllllIllIIllIllIIIIllIllI - BlockLeaves.llIllIlIlIllII[1])], BlockLeaves.llIllIlIlIllII[5])) {
                                        this.surroundings[(llllllllllllIllIIllIllIIIIlIllll + llllllllllllIllIIllIllIIIIllIllI) * llllllllllllIllIIllIllIIIIllIlll + (llllllllllllIllIIllIllIIIIlIlllI + llllllllllllIllIIllIllIIIIllIllI) * llllllllllllIllIIllIllIIIIlllIII + (llllllllllllIllIIllIllIIIIlIllIl + llllllllllllIllIIllIllIIIIllIllI - BlockLeaves.llIllIlIlIllII[1])] = llllllllllllIllIIllIllIIIIllIIII;
                                    }
                                    if (lIIlIlllllIllllI(this.surroundings[(llllllllllllIllIIllIllIIIIlIllll + llllllllllllIllIIllIllIIIIllIllI) * llllllllllllIllIIllIllIIIIllIlll + (llllllllllllIllIIllIllIIIIlIlllI + llllllllllllIllIIllIllIIIIllIllI) * llllllllllllIllIIllIllIIIIlllIII + llllllllllllIllIIllIllIIIIlIllIl + llllllllllllIllIIllIllIIIIllIllI + BlockLeaves.llIllIlIlIllII[1]], BlockLeaves.llIllIlIlIllII[5])) {
                                        this.surroundings[(llllllllllllIllIIllIllIIIIlIllll + llllllllllllIllIIllIllIIIIllIllI) * llllllllllllIllIIllIllIIIIllIlll + (llllllllllllIllIIllIllIIIIlIlllI + llllllllllllIllIIllIllIIIIllIllI) * llllllllllllIllIIllIllIIIIlllIII + llllllllllllIllIIllIllIIIIlIllIl + llllllllllllIllIIllIllIIIIllIllI + BlockLeaves.llIllIlIlIllII[1]] = llllllllllllIllIIllIllIIIIllIIII;
                                    }
                                }
                                ++llllllllllllIllIIllIllIIIIlIllIl;
                            }
                            ++llllllllllllIllIIllIllIIIIlIlllI;
                        }
                        ++llllllllllllIllIIllIllIIIIlIllll;
                    }
                    ++llllllllllllIllIIllIllIIIIllIIII;
                }
            }
            final int llllllllllllIllIIllIllIIIIlIllII = this.surroundings[llllllllllllIllIIllIllIIIIllIllI * llllllllllllIllIIllIllIIIIllIlll + llllllllllllIllIIllIllIIIIllIllI * llllllllllllIllIIllIllIIIIlllIII + llllllllllllIllIIllIllIIIIllIllI];
            if (lIIlIlllllIlllll(llllllllllllIllIIllIllIIIIlIllII)) {
                llllllllllllIllIIllIllIIIIlIlIlI.setBlockState(llllllllllllIllIIllIllIIIIlIlIIl, llllllllllllIllIIllIllIIIIlIlIII.withProperty((IProperty<Comparable>)BlockLeaves.CHECK_DECAY, (boolean)(BlockLeaves.llIllIlIlIllII[0] != 0)), BlockLeaves.llIllIlIlIllII[2]);
                "".length();
                "".length();
                if ((0x1F ^ 0x5C ^ (0xE3 ^ 0xA4)) < 0) {
                    return;
                }
            }
            else {
                this.destroy(llllllllllllIllIIllIllIIIIlIlIlI, llllllllllllIllIIllIllIIIIlIlIIl);
            }
        }
    }
    
    private void destroy(final World llllllllllllIllIIllIlIllllllllll, final BlockPos llllllllllllIllIIllIllIIIIIIIIIl) {
        this.dropBlockAsItem(llllllllllllIllIIllIlIllllllllll, llllllllllllIllIIllIllIIIIIIIIIl, llllllllllllIllIIllIlIllllllllll.getBlockState(llllllllllllIllIIllIllIIIIIIIIIl), BlockLeaves.llIllIlIlIllII[0]);
        llllllllllllIllIIllIlIllllllllll.setBlockToAir(llllllllllllIllIIllIllIIIIIIIIIl);
        "".length();
    }
    
    private static void lIIlIlllllIlIllI() {
        (llIllIlIlIlIll = new String[BlockLeaves.llIllIlIlIllII[4]])[BlockLeaves.llIllIlIlIllII[0]] = lIIlIlllllIlIlIl("/ShJxpnFzgUJRlw9USgTSg==", "KJIGF");
        BlockLeaves.llIllIlIlIlIll[BlockLeaves.llIllIlIlIllII[1]] = lIIlIlllllIlIlIl("O4urEukq+FjP/lGzkH/7Qw==", "eAYcH");
    }
    
    @Override
    public void breakBlock(final World llllllllllllIllIIllIllIIIllIllII, final BlockPos llllllllllllIllIIllIllIIIllIlIll, final IBlockState llllllllllllIllIIllIllIIIllIlIlI) {
        final int llllllllllllIllIIllIllIIIllIlIIl = BlockLeaves.llIllIlIlIllII[1];
        final int llllllllllllIllIIllIllIIIllIlIII = llllllllllllIllIIllIllIIIllIlIIl + BlockLeaves.llIllIlIlIllII[1];
        final int llllllllllllIllIIllIllIIIllIIlll = llllllllllllIllIIllIllIIIllIlIll.getX();
        final int llllllllllllIllIIllIllIIIllIIllI = llllllllllllIllIIllIllIIIllIlIll.getY();
        final int llllllllllllIllIIllIllIIIllIIlIl = llllllllllllIllIIllIllIIIllIlIll.getZ();
        if (lIIlIlllllIllIII(llllllllllllIllIIllIllIIIllIllII.isAreaLoaded(new BlockPos(llllllllllllIllIIllIllIIIllIIlll - llllllllllllIllIIllIllIIIllIlIII, llllllllllllIllIIllIllIIIllIIllI - llllllllllllIllIIllIllIIIllIlIII, llllllllllllIllIIllIllIIIllIIlIl - llllllllllllIllIIllIllIIIllIlIII), new BlockPos(llllllllllllIllIIllIllIIIllIIlll + llllllllllllIllIIllIllIIIllIlIII, llllllllllllIllIIllIllIIIllIIllI + llllllllllllIllIIllIllIIIllIlIII, llllllllllllIllIIllIllIIIllIIlIl + llllllllllllIllIIllIllIIIllIlIII)) ? 1 : 0)) {
            int llllllllllllIllIIllIllIIIllIIlII = -llllllllllllIllIIllIllIIIllIlIIl;
            "".length();
            if (((145 + 193 - 326 + 193 ^ 65 + 9 - 1 + 100) & (0x3 ^ 0x1B ^ (0x6 ^ 0x7E) ^ -" ".length())) != 0x0) {
                return;
            }
            while (!lIIlIlllllIllIll(llllllllllllIllIIllIllIIIllIIlII, llllllllllllIllIIllIllIIIllIlIIl)) {
                int llllllllllllIllIIllIllIIIllIIIll = -llllllllllllIllIIllIllIIIllIlIIl;
                "".length();
                if (null != null) {
                    return;
                }
                while (!lIIlIlllllIllIll(llllllllllllIllIIllIllIIIllIIIll, llllllllllllIllIIllIllIIIllIlIIl)) {
                    int llllllllllllIllIIllIllIIIllIIIlI = -llllllllllllIllIIllIllIIIllIlIIl;
                    "".length();
                    if (-"   ".length() >= 0) {
                        return;
                    }
                    while (!lIIlIlllllIllIll(llllllllllllIllIIllIllIIIllIIIlI, llllllllllllIllIIllIllIIIllIlIIl)) {
                        final BlockPos llllllllllllIllIIllIllIIIllIIIIl = llllllllllllIllIIllIllIIIllIlIll.add(llllllllllllIllIIllIllIIIllIIlII, llllllllllllIllIIllIllIIIllIIIll, llllllllllllIllIIllIllIIIllIIIlI);
                        final IBlockState llllllllllllIllIIllIllIIIllIIIII = llllllllllllIllIIllIllIIIllIllII.getBlockState(llllllllllllIllIIllIllIIIllIIIIl);
                        if (lIIlIlllllIllIIl(llllllllllllIllIIllIllIIIllIIIII.getBlock().getMaterial(), Material.leaves) && lIIlIlllllIllIlI(((boolean)llllllllllllIllIIllIllIIIllIIIII.getValue((IProperty<Boolean>)BlockLeaves.CHECK_DECAY)) ? 1 : 0)) {
                            llllllllllllIllIIllIllIIIllIllII.setBlockState(llllllllllllIllIIllIllIIIllIIIIl, llllllllllllIllIIllIllIIIllIIIII.withProperty((IProperty<Comparable>)BlockLeaves.CHECK_DECAY, (boolean)(BlockLeaves.llIllIlIlIllII[1] != 0)), BlockLeaves.llIllIlIlIllII[2]);
                            "".length();
                        }
                        ++llllllllllllIllIIllIllIIIllIIIlI;
                    }
                    ++llllllllllllIllIIllIllIIIllIIIll;
                }
                ++llllllllllllIllIIllIllIIIllIIlII;
            }
        }
    }
    
    private static boolean lIIlIllllllIIIII(final int llllllllllllIllIIllIlIlllIlIIIIl) {
        return llllllllllllIllIIllIlIlllIlIIIIl > 0;
    }
    
    private static String lIIlIlllllIlIlIl(final String llllllllllllIllIIllIlIllllIIIIlI, final String llllllllllllIllIIllIlIllllIIIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIIllIlIllllIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllIlIllllIIIIIl.getBytes(StandardCharsets.UTF_8)), BlockLeaves.llIllIlIlIllII[12]), "DES");
            final Cipher llllllllllllIllIIllIlIllllIIIllI = Cipher.getInstance("DES");
            llllllllllllIllIIllIlIllllIIIllI.init(BlockLeaves.llIllIlIlIllII[4], llllllllllllIllIIllIlIllllIIIlll);
            return new String(llllllllllllIllIIllIlIllllIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllIlIllllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllIlIllllIIIlIl) {
            llllllllllllIllIIllIlIllllIIIlIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIlIlllllIlIlll();
        lIIlIlllllIlIllI();
        DECAYABLE = PropertyBool.create(BlockLeaves.llIllIlIlIlIll[BlockLeaves.llIllIlIlIllII[0]]);
        CHECK_DECAY = PropertyBool.create(BlockLeaves.llIllIlIlIlIll[BlockLeaves.llIllIlIlIllII[1]]);
    }
    
    private static boolean lIIlIllllllIIIIl(final int llllllllllllIllIIllIlIlllIlllIII, final int llllllllllllIllIIllIlIlllIllIlll) {
        return llllllllllllIllIIllIlIlllIlllIII < llllllllllllIllIIllIlIlllIllIlll;
    }
}
