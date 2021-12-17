// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.IStringSerializable;
import net.minecraft.block.state.BlockState;
import net.minecraft.init.Blocks;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.init.Items;
import net.minecraft.world.ColorizerGrass;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.material.Material;
import java.util.Random;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.block.properties.PropertyEnum;

public class BlockTallGrass extends BlockBush implements IGrowable
{
    public static final /* synthetic */ PropertyEnum<EnumType> TYPE;
    private static final /* synthetic */ String[] lIlllllllIlIlI;
    private static final /* synthetic */ int[] lIlllllllIlIll;
    
    @Override
    public void getSubBlocks(final Item llllllllllllIllllIIIllIlIllIlllI, final CreativeTabs llllllllllllIllllIIIllIlIllIllIl, final List<ItemStack> llllllllllllIllllIIIllIlIllIllII) {
        int llllllllllllIllllIIIllIlIllIlIll = BlockTallGrass.lIlllllllIlIll[1];
        "".length();
        if (((0x53 ^ 0x2) & ~(0xC0 ^ 0x91)) > "   ".length()) {
            return;
        }
        while (!lIIIIllIIIlllIlI(llllllllllllIllllIIIllIlIllIlIll, BlockTallGrass.lIlllllllIlIll[5])) {
            llllllllllllIllllIIIllIlIllIllII.add(new ItemStack(llllllllllllIllllIIIllIlIllIlllI, BlockTallGrass.lIlllllllIlIll[1], llllllllllllIllllIIIllIlIllIlIll));
            "".length();
            ++llllllllllllIllllIIIllIlIllIlIll;
        }
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIllllIIIllIlIlIIIlIl) {
        return llllllllllllIllllIIIllIlIlIIIlIl.getValue(BlockTallGrass.TYPE).getMeta();
    }
    
    @Override
    public int getDamageValue(final World llllllllllllIllllIIIllIlIllllIII, final BlockPos llllllllllllIllllIIIllIlIlllIlII) {
        final IBlockState llllllllllllIllllIIIllIlIlllIllI = llllllllllllIllllIIIllIlIllllIII.getBlockState(llllllllllllIllllIIIllIlIlllIlII);
        return llllllllllllIllllIIIllIlIlllIllI.getBlock().getMetaFromState(llllllllllllIllllIIIllIlIlllIllI);
    }
    
    @Override
    public int quantityDroppedWithBonus(final int llllllllllllIllllIIIllIllIIlIIlI, final Random llllllllllllIllllIIIllIllIIlIIIl) {
        return BlockTallGrass.lIlllllllIlIll[1] + llllllllllllIllllIIIllIllIIlIIIl.nextInt(llllllllllllIllllIIIllIllIIlIIlI * BlockTallGrass.lIlllllllIlIll[4] + BlockTallGrass.lIlllllllIlIll[1]);
    }
    
    protected BlockTallGrass() {
        super(Material.vine);
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockTallGrass.TYPE, EnumType.DEAD_BUSH));
        final float llllllllllllIllllIIIllIllIllllIl = 0.4f;
        this.setBlockBounds(0.5f - llllllllllllIllllIIIllIllIllllIl, 0.0f, 0.5f - llllllllllllIllllIIIllIllIllllIl, 0.5f + llllllllllllIllllIIIllIllIllllIl, 0.8f, 0.5f + llllllllllllIllllIIIllIllIllllIl);
    }
    
    private static boolean lIIIIllIIIllIllI(final Object llllllllllllIllllIIIllIlIIlIllII, final Object llllllllllllIllllIIIllIlIIlIlIll) {
        return llllllllllllIllllIIIllIlIIlIllII != llllllllllllIllllIIIllIlIIlIlIll;
    }
    
    private static String lIIIIllIIIllIIll(final String llllllllllllIllllIIIllIlIIllIllI, final String llllllllllllIllllIIIllIlIIllIlll) {
        try {
            final SecretKeySpec llllllllllllIllllIIIllIlIIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIllIlIIllIlll.getBytes(StandardCharsets.UTF_8)), BlockTallGrass.lIlllllllIlIll[3]), "DES");
            final Cipher llllllllllllIllllIIIllIlIIlllIlI = Cipher.getInstance("DES");
            llllllllllllIllllIIIllIlIIlllIlI.init(BlockTallGrass.lIlllllllIlIll[4], llllllllllllIllllIIIllIlIIlllIll);
            return new String(llllllllllllIllllIIIllIlIIlllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIllIlIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIIllIlIIlllIIl) {
            llllllllllllIllllIIIllIlIIlllIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIllIIIlllIIl(final Object llllllllllllIllllIIIllIlIIlIIlIl) {
        return llllllllllllIllllIIIllIlIIlIIlIl != null;
    }
    
    private static boolean lIIIIllIIIlllIll(final int llllllllllllIllllIIIllIlIIlIIIll) {
        return llllllllllllIllllIIIllIlIIlIIIll != 0;
    }
    
    @Override
    public int getRenderColor(final IBlockState llllllllllllIllllIIIllIllIlIlIII) {
        if (lIIIIllIIIllIllI(llllllllllllIllllIIIllIllIlIlIII.getBlock(), this)) {
            return super.getRenderColor(llllllllllllIllllIIIllIllIlIlIII);
        }
        final EnumType llllllllllllIllllIIIllIllIlIIlll = llllllllllllIllllIIIllIllIlIlIII.getValue(BlockTallGrass.TYPE);
        int grassColor;
        if (lIIIIllIIIllIlll(llllllllllllIllllIIIllIllIlIIlll, EnumType.DEAD_BUSH)) {
            grassColor = BlockTallGrass.lIlllllllIlIll[2];
            "".length();
            if (" ".length() > "  ".length()) {
                return (0xC1 ^ 0x82) & ~(0x53 ^ 0x10);
            }
        }
        else {
            grassColor = ColorizerGrass.getGrassColor(0.5, 1.0);
        }
        return grassColor;
    }
    
    @Override
    public Item getItemDropped(final IBlockState llllllllllllIllllIIIllIllIIllIIl, final Random llllllllllllIllllIIIllIllIIllIII, final int llllllllllllIllllIIIllIllIIlIlll) {
        Item wheat_seeds;
        if (lIIIIllIIIlllIII(llllllllllllIllllIIIllIllIIllIII.nextInt(BlockTallGrass.lIlllllllIlIll[3]))) {
            wheat_seeds = Items.wheat_seeds;
            "".length();
            if (" ".length() > " ".length()) {
                return null;
            }
        }
        else {
            wheat_seeds = null;
        }
        return wheat_seeds;
    }
    
    private static boolean lIIIIllIIIllIlll(final Object llllllllllllIllllIIIllIlIIlIlIII, final Object llllllllllllIllllIIIllIlIIlIIlll) {
        return llllllllllllIllllIIIllIlIIlIlIII == llllllllllllIllllIIIllIlIIlIIlll;
    }
    
    private static void lIIIIllIIIllIlII() {
        (lIlllllllIlIlI = new String[BlockTallGrass.lIlllllllIlIll[1]])[BlockTallGrass.lIlllllllIlIll[0]] = lIIIIllIIIllIIll("TWIBtV7/Onk=", "xyvVQ");
    }
    
    @Override
    public int getBlockColor() {
        return ColorizerGrass.getGrassColor(0.5, 1.0);
    }
    
    @Override
    public int colorMultiplier(final IBlockAccess llllllllllllIllllIIIllIllIlIIIII, final BlockPos llllllllllllIllllIIIllIllIIlllII, final int llllllllllllIllllIIIllIllIIllllI) {
        return llllllllllllIllllIIIllIllIlIIIII.getBiomeGenForCoords(llllllllllllIllllIIIllIllIIlllII).getGrassColorAtPos(llllllllllllIllllIIIllIllIIlllII);
    }
    
    @Override
    public void harvestBlock(final World llllllllllllIllllIIIllIllIIIIlll, final EntityPlayer llllllllllllIllllIIIllIllIIIIllI, final BlockPos llllllllllllIllllIIIllIlIlllllll, final IBlockState llllllllllllIllllIIIllIlIllllllI, final TileEntity llllllllllllIllllIIIllIlIlllllIl) {
        if (lIIIIllIIIlllIII(llllllllllllIllllIIIllIllIIIIlll.isRemote ? 1 : 0) && lIIIIllIIIlllIIl(llllllllllllIllllIIIllIllIIIIllI.getCurrentEquippedItem()) && lIIIIllIIIllIlll(llllllllllllIllllIIIllIllIIIIllI.getCurrentEquippedItem().getItem(), Items.shears)) {
            llllllllllllIllllIIIllIllIIIIllI.triggerAchievement(StatList.mineBlockStatArray[Block.getIdFromBlock(this)]);
            Block.spawnAsEntity(llllllllllllIllllIIIllIllIIIIlll, llllllllllllIllllIIIllIlIlllllll, new ItemStack(Blocks.tallgrass, BlockTallGrass.lIlllllllIlIll[1], llllllllllllIllllIIIllIlIllllllI.getValue(BlockTallGrass.TYPE).getMeta()));
            "".length();
            if (" ".length() != " ".length()) {
                return;
            }
        }
        else {
            super.harvestBlock(llllllllllllIllllIIIllIllIIIIlll, llllllllllllIllllIIIllIllIIIIllI, llllllllllllIllllIIIllIlIlllllll, llllllllllllIllllIIIllIlIllllllI, llllllllllllIllllIIIllIlIlllllIl);
        }
    }
    
    @Override
    public boolean canGrow(final World llllllllllllIllllIIIllIlIllIIlIl, final BlockPos llllllllllllIllllIIIllIlIllIIlII, final IBlockState llllllllllllIllllIIIllIlIllIIIIl, final boolean llllllllllllIllllIIIllIlIllIIIlI) {
        if (lIIIIllIIIllIllI(llllllllllllIllllIIIllIlIllIIIIl.getValue(BlockTallGrass.TYPE), EnumType.DEAD_BUSH)) {
            return BlockTallGrass.lIlllllllIlIll[1] != 0;
        }
        return BlockTallGrass.lIlllllllIlIll[0] != 0;
    }
    
    @Override
    public EnumOffsetType getOffsetType() {
        return EnumOffsetType.XYZ;
    }
    
    @Override
    public boolean isReplaceable(final World llllllllllllIllllIIIllIllIlIlllI, final BlockPos llllllllllllIllllIIIllIllIlIllIl) {
        return BlockTallGrass.lIlllllllIlIll[1] != 0;
    }
    
    private static boolean lIIIIllIIIlllIII(final int llllllllllllIllllIIIllIlIIlIIIIl) {
        return llllllllllllIllllIIIllIlIIlIIIIl == 0;
    }
    
    private static boolean lIIIIllIIIlllIlI(final int llllllllllllIllllIIIllIlIIllIIII, final int llllllllllllIllllIIIllIlIIlIllll) {
        return llllllllllllIllllIIIllIlIIllIIII >= llllllllllllIllllIIIllIlIIlIllll;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIllllIIIllIlIlIIlIII) {
        return this.getDefaultState().withProperty(BlockTallGrass.TYPE, EnumType.byMetadata(llllllllllllIllllIIIllIlIlIIlIII));
    }
    
    @Override
    public boolean canBlockStay(final World llllllllllllIllllIIIllIllIllIIIl, final BlockPos llllllllllllIllllIIIllIllIllIIII, final IBlockState llllllllllllIllllIIIllIllIllIIll) {
        return this.canPlaceBlockOn(llllllllllllIllllIIIllIllIllIIIl.getBlockState(llllllllllllIllllIIIllIllIllIIII.down()).getBlock());
    }
    
    @Override
    public boolean canUseBonemeal(final World llllllllllllIllllIIIllIlIlIlllll, final Random llllllllllllIllllIIIllIlIlIllllI, final BlockPos llllllllllllIllllIIIllIlIlIlllIl, final IBlockState llllllllllllIllllIIIllIlIlIlllII) {
        return BlockTallGrass.lIlllllllIlIll[1] != 0;
    }
    
    @Override
    public void grow(final World llllllllllllIllllIIIllIlIlIlIIIl, final Random llllllllllllIllllIIIllIlIlIlIlIl, final BlockPos llllllllllllIllllIIIllIlIlIlIlII, final IBlockState llllllllllllIllllIIIllIlIlIIllll) {
        BlockDoublePlant.EnumPlantType llllllllllllIllllIIIllIlIlIlIIlI = BlockDoublePlant.EnumPlantType.GRASS;
        if (lIIIIllIIIllIlll(llllllllllllIllllIIIllIlIlIIllll.getValue(BlockTallGrass.TYPE), EnumType.FERN)) {
            llllllllllllIllllIIIllIlIlIlIIlI = BlockDoublePlant.EnumPlantType.FERN;
        }
        if (lIIIIllIIIlllIll(Blocks.double_plant.canPlaceBlockAt(llllllllllllIllllIIIllIlIlIlIIIl, llllllllllllIllllIIIllIlIlIlIlII) ? 1 : 0)) {
            Blocks.double_plant.placeAt(llllllllllllIllllIIIllIlIlIlIIIl, llllllllllllIllllIIIllIlIlIlIlII, llllllllllllIllllIIIllIlIlIlIIlI, BlockTallGrass.lIlllllllIlIll[4]);
        }
    }
    
    private static void lIIIIllIIIllIlIl() {
        (lIlllllllIlIll = new int[6])[0] = ((0x6D ^ 0x7C) & ~(0x9A ^ 0x8B));
        BlockTallGrass.lIlllllllIlIll[1] = " ".length();
        BlockTallGrass.lIlllllllIlIll[2] = (-1 & 0xFFFFFF);
        BlockTallGrass.lIlllllllIlIll[3] = (0xBD ^ 0x98 ^ (0x12 ^ 0x3F));
        BlockTallGrass.lIlllllllIlIll[4] = "  ".length();
        BlockTallGrass.lIlllllllIlIll[5] = "   ".length();
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockTallGrass.lIlllllllIlIll[1]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockTallGrass.lIlllllllIlIll[0]] = BlockTallGrass.TYPE;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    static {
        lIIIIllIIIllIlIl();
        lIIIIllIIIllIlII();
        TYPE = PropertyEnum.create(BlockTallGrass.lIlllllllIlIlI[BlockTallGrass.lIlllllllIlIll[0]], EnumType.class);
    }
    
    public enum EnumType implements IStringSerializable
    {
        private final /* synthetic */ String name;
        private static final /* synthetic */ EnumType[] META_LOOKUP;
        private final /* synthetic */ int meta;
        private static final /* synthetic */ int[] lllllllIIIlIl;
        
        DEAD_BUSH(EnumType.lllllllIIIlII[EnumType.lllllllIIIlIl[0]], EnumType.lllllllIIIlIl[0], EnumType.lllllllIIIlIl[0], EnumType.lllllllIIIlII[EnumType.lllllllIIIlIl[1]]), 
        FERN(EnumType.lllllllIIIlII[EnumType.lllllllIIIlIl[4]], EnumType.lllllllIIIlIl[2], EnumType.lllllllIIIlIl[2], EnumType.lllllllIIIlII[EnumType.lllllllIIIlIl[5]]);
        
        private static final /* synthetic */ String[] lllllllIIIlII;
        
        GRASS(EnumType.lllllllIIIlII[EnumType.lllllllIIIlIl[2]], EnumType.lllllllIIIlIl[1], EnumType.lllllllIIIlIl[1], EnumType.lllllllIIIlII[EnumType.lllllllIIIlIl[3]]);
        
        public int getMeta() {
            return this.meta;
        }
        
        private static String lIllIIIIlIllIll(final String lllllllllllllIlIlIlIIIlIIlIIlIII, final String lllllllllllllIlIlIlIIIlIIlIIlIIl) {
            try {
                final SecretKeySpec lllllllllllllIlIlIlIIIlIIlIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIIIlIIlIIlIIl.getBytes(StandardCharsets.UTF_8)), EnumType.lllllllIIIlIl[7]), "DES");
                final Cipher lllllllllllllIlIlIlIIIlIIlIIllII = Cipher.getInstance("DES");
                lllllllllllllIlIlIlIIIlIIlIIllII.init(EnumType.lllllllIIIlIl[2], lllllllllllllIlIlIlIIIlIIlIIllIl);
                return new String(lllllllllllllIlIlIlIIIlIIlIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIIIlIIlIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlIlIIIlIIlIIlIll) {
                lllllllllllllIlIlIlIIIlIIlIIlIll.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIllIIIIlIllllI(final int lllllllllllllIlIlIlIIIlIIIlIlIlI, final int lllllllllllllIlIlIlIIIlIIIlIlIIl) {
            return lllllllllllllIlIlIlIIIlIIIlIlIlI >= lllllllllllllIlIlIlIIIlIIIlIlIIl;
        }
        
        private static boolean lIllIIIIlIlllll(final int lllllllllllllIlIlIlIIIlIIIlIIIll) {
            return lllllllllllllIlIlIlIIIlIIIlIIIll >= 0;
        }
        
        @Override
        public String toString() {
            return this.name;
        }
        
        private static void lIllIIIIlIlllII() {
            (lllllllIIIlII = new String[EnumType.lllllllIIIlIl[6]])[EnumType.lllllllIIIlIl[0]] = lIllIIIIlIllIIl("DAEXPAkKEQUw", "HDVxV");
            EnumType.lllllllIIIlII[EnumType.lllllllIIIlIl[1]] = lIllIIIIlIllIlI("s7gOHQ8TuNr5P3/4PO7W9Q==", "IwYVH");
            EnumType.lllllllIIIlII[EnumType.lllllllIIIlIl[2]] = lIllIIIIlIllIll("2MxUCxE8kJw=", "TaOBF");
            EnumType.lllllllIIIlII[EnumType.lllllllIIIlIl[3]] = lIllIIIIlIllIll("4y5SCGtn/rfnyKCTN47BHg==", "ApRzj");
            EnumType.lllllllIIIlII[EnumType.lllllllIIIlIl[4]] = lIllIIIIlIllIIl("ABYKHQ==", "FSXSz");
            EnumType.lllllllIIIlII[EnumType.lllllllIIIlIl[5]] = lIllIIIIlIllIlI("bb8RCs/0CVA=", "kNGSS");
        }
        
        public static EnumType byMetadata(int lllllllllllllIlIlIlIIIlIIllIlIlI) {
            if (!lIllIIIIlIlllll(lllllllllllllIlIlIlIIIlIIllIlIlI) || lIllIIIIlIllllI(lllllllllllllIlIlIlIIIlIIllIlIlI, EnumType.META_LOOKUP.length)) {
                lllllllllllllIlIlIlIIIlIIllIlIlI = EnumType.lllllllIIIlIl[0];
            }
            return EnumType.META_LOOKUP[lllllllllllllIlIlIlIIIlIIllIlIlI];
        }
        
        private static void lIllIIIIlIlllIl() {
            (lllllllIIIlIl = new int[8])[0] = ((73 + 88 - 69 + 53 ^ 87 + 14 + 35 + 34) & (0x59 ^ 0x65 ^ (0x67 ^ 0x60) ^ -" ".length()));
            EnumType.lllllllIIIlIl[1] = " ".length();
            EnumType.lllllllIIIlIl[2] = "  ".length();
            EnumType.lllllllIIIlIl[3] = "   ".length();
            EnumType.lllllllIIIlIl[4] = (0x43 ^ 0x47);
            EnumType.lllllllIIIlIl[5] = (0x74 ^ 0x7B ^ (0xAF ^ 0xA5));
            EnumType.lllllllIIIlIl[6] = (84 + 102 - 70 + 19 ^ 80 + 45 - 62 + 66);
            EnumType.lllllllIIIlIl[7] = (0x73 ^ 0x7B);
        }
        
        static {
            lIllIIIIlIlllIl();
            lIllIIIIlIlllII();
            final EnumType[] enum$VALUES = new EnumType[EnumType.lllllllIIIlIl[3]];
            enum$VALUES[EnumType.lllllllIIIlIl[0]] = EnumType.DEAD_BUSH;
            enum$VALUES[EnumType.lllllllIIIlIl[1]] = EnumType.GRASS;
            enum$VALUES[EnumType.lllllllIIIlIl[2]] = EnumType.FERN;
            ENUM$VALUES = enum$VALUES;
            META_LOOKUP = new EnumType[values().length];
            final char lllllllllllllIlIlIlIIIlIlIIIIIII;
            final long lllllllllllllIlIlIlIIIlIlIIIIIIl = ((EnumType[])(Object)(lllllllllllllIlIlIlIIIlIlIIIIIII = (char)(Object)values())).length;
            float lllllllllllllIlIlIlIIIlIlIIIIIlI = EnumType.lllllllIIIlIl[0];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIllIIIIlIllllI((int)lllllllllllllIlIlIlIIIlIlIIIIIlI, (int)lllllllllllllIlIlIlIIIlIlIIIIIIl)) {
                final EnumType lllllllllllllIlIlIlIIIlIlIIIIlII = lllllllllllllIlIlIlIIIlIlIIIIIII[lllllllllllllIlIlIlIIIlIlIIIIIlI];
                EnumType.META_LOOKUP[lllllllllllllIlIlIlIIIlIlIIIIlII.getMeta()] = lllllllllllllIlIlIlIIIlIlIIIIlII;
                ++lllllllllllllIlIlIlIIIlIlIIIIIlI;
            }
        }
        
        private EnumType(final String lllllllllllllIlIlIlIIIlIIlllIllI, final int lllllllllllllIlIlIlIIIlIIlllIlIl, final int lllllllllllllIlIlIlIIIlIIllllIIl, final String lllllllllllllIlIlIlIIIlIIlllIIll) {
            this.meta = lllllllllllllIlIlIlIIIlIIllllIIl;
            this.name = lllllllllllllIlIlIlIIIlIIlllIIll;
        }
        
        private static String lIllIIIIlIllIlI(final String lllllllllllllIlIlIlIIIlIIlIlIlll, final String lllllllllllllIlIlIlIIIlIIlIlIlII) {
            try {
                final SecretKeySpec lllllllllllllIlIlIlIIIlIIlIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIIIlIIlIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIlIlIIIlIIlIllIIl = Cipher.getInstance("Blowfish");
                lllllllllllllIlIlIlIIIlIIlIllIIl.init(EnumType.lllllllIIIlIl[2], lllllllllllllIlIlIlIIIlIIlIllIlI);
                return new String(lllllllllllllIlIlIlIIIlIIlIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIIIlIIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlIlIIIlIIlIllIII) {
                lllllllllllllIlIlIlIIIlIIlIllIII.printStackTrace();
                return null;
            }
        }
        
        @Override
        public String getName() {
            return this.name;
        }
        
        private static String lIllIIIIlIllIIl(String lllllllllllllIlIlIlIIIlIIIllIlIl, final String lllllllllllllIlIlIlIIIlIIIlllIIl) {
            lllllllllllllIlIlIlIIIlIIIllIlIl = new String(Base64.getDecoder().decode(lllllllllllllIlIlIlIIIlIIIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIlIlIIIlIIIlllIII = new StringBuilder();
            final char[] lllllllllllllIlIlIlIIIlIIIllIlll = lllllllllllllIlIlIlIIIlIIIlllIIl.toCharArray();
            int lllllllllllllIlIlIlIIIlIIIllIllI = EnumType.lllllllIIIlIl[0];
            final double lllllllllllllIlIlIlIIIlIIIllIIII = (Object)lllllllllllllIlIlIlIIIlIIIllIlIl.toCharArray();
            final String lllllllllllllIlIlIlIIIlIIIlIllll = (String)lllllllllllllIlIlIlIIIlIIIllIIII.length;
            boolean lllllllllllllIlIlIlIIIlIIIlIlllI = EnumType.lllllllIIIlIl[0] != 0;
            while (lIllIIIIllIIIII(lllllllllllllIlIlIlIIIlIIIlIlllI ? 1 : 0, (int)lllllllllllllIlIlIlIIIlIIIlIllll)) {
                final char lllllllllllllIlIlIlIIIlIIIlllIll = lllllllllllllIlIlIlIIIlIIIllIIII[lllllllllllllIlIlIlIIIlIIIlIlllI];
                lllllllllllllIlIlIlIIIlIIIlllIII.append((char)(lllllllllllllIlIlIlIIIlIIIlllIll ^ lllllllllllllIlIlIlIIIlIIIllIlll[lllllllllllllIlIlIlIIIlIIIllIllI % lllllllllllllIlIlIlIIIlIIIllIlll.length]));
                "".length();
                ++lllllllllllllIlIlIlIIIlIIIllIllI;
                ++lllllllllllllIlIlIlIIIlIIIlIlllI;
                "".length();
                if ("   ".length() <= " ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIlIlIIIlIIIlllIII);
        }
        
        private static boolean lIllIIIIllIIIII(final int lllllllllllllIlIlIlIIIlIIIlIIllI, final int lllllllllllllIlIlIlIIIlIIIlIIlIl) {
            return lllllllllllllIlIlIlIIIlIIIlIIllI < lllllllllllllIlIlIlIIIlIIIlIIlIl;
        }
    }
}
