// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.block.material.Material;
import java.util.Random;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.BlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.block.properties.PropertyEnum;

public abstract class BlockWoodSlab extends BlockSlab
{
    private static final /* synthetic */ String[] lIIIIlllIIIlIl;
    public static final /* synthetic */ PropertyEnum<BlockPlanks.EnumType> VARIANT;
    private static final /* synthetic */ int[] lIIIIlllIIIllI;
    
    @Override
    public void getSubBlocks(final Item lllllllllllllIlIIlIIIIlIIlIlIIlI, final CreativeTabs lllllllllllllIlIIlIIIIlIIlIlIlIl, final List<ItemStack> lllllllllllllIlIIlIIIIlIIlIlIIIl) {
        if (lIllllIIIllllII(lllllllllllllIlIIlIIIIlIIlIlIIlI, Item.getItemFromBlock(Blocks.double_wooden_slab))) {
            final short lllllllllllllIlIIlIIIIlIIlIIllIl;
            final Exception lllllllllllllIlIIlIIIIlIIlIIlllI = (Exception)((BlockPlanks.EnumType[])(Object)(lllllllllllllIlIIlIIIIlIIlIIllIl = (short)(Object)BlockPlanks.EnumType.values())).length;
            String lllllllllllllIlIIlIIIIlIIlIIllll = (String)BlockWoodSlab.lIIIIlllIIIllI[0];
            "".length();
            if (((0x7B ^ 0x6A) & ~(0x25 ^ 0x34)) != 0x0) {
                return;
            }
            while (!lIllllIIIllllIl((int)lllllllllllllIlIIlIIIIlIIlIIllll, (int)lllllllllllllIlIIlIIIIlIIlIIlllI)) {
                final BlockPlanks.EnumType lllllllllllllIlIIlIIIIlIIlIlIIll = lllllllllllllIlIIlIIIIlIIlIIllIl[lllllllllllllIlIIlIIIIlIIlIIllll];
                lllllllllllllIlIIlIIIIlIIlIlIIIl.add(new ItemStack(lllllllllllllIlIIlIIIIlIIlIlIIlI, BlockWoodSlab.lIIIIlllIIIllI[1], lllllllllllllIlIIlIIIIlIIlIlIIll.getMetadata()));
                "".length();
                ++lllllllllllllIlIIlIIIIlIIlIIllll;
            }
        }
    }
    
    private static String lIllllIIIllIlll(String lllllllllllllIlIIlIIIIlIIIIlIlll, final String lllllllllllllIlIIlIIIIlIIIIllIll) {
        lllllllllllllIlIIlIIIIlIIIIlIlll = new String(Base64.getDecoder().decode(lllllllllllllIlIIlIIIIlIIIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIIIIlIIIIllIlI = new StringBuilder();
        final char[] lllllllllllllIlIIlIIIIlIIIIllIIl = lllllllllllllIlIIlIIIIlIIIIllIll.toCharArray();
        int lllllllllllllIlIIlIIIIlIIIIllIII = BlockWoodSlab.lIIIIlllIIIllI[0];
        final char lllllllllllllIlIIlIIIIlIIIIlIIlI = (Object)lllllllllllllIlIIlIIIIlIIIIlIlll.toCharArray();
        final long lllllllllllllIlIIlIIIIlIIIIlIIIl = lllllllllllllIlIIlIIIIlIIIIlIIlI.length;
        float lllllllllllllIlIIlIIIIlIIIIlIIII = BlockWoodSlab.lIIIIlllIIIllI[0];
        while (lIllllIIlIIIIII((int)lllllllllllllIlIIlIIIIlIIIIlIIII, (int)lllllllllllllIlIIlIIIIlIIIIlIIIl)) {
            final char lllllllllllllIlIIlIIIIlIIIIlllIl = lllllllllllllIlIIlIIIIlIIIIlIIlI[lllllllllllllIlIIlIIIIlIIIIlIIII];
            lllllllllllllIlIIlIIIIlIIIIllIlI.append((char)(lllllllllllllIlIIlIIIIlIIIIlllIl ^ lllllllllllllIlIIlIIIIlIIIIllIIl[lllllllllllllIlIIlIIIIlIIIIllIII % lllllllllllllIlIIlIIIIlIIIIllIIl.length]));
            "".length();
            ++lllllllllllllIlIIlIIIIlIIIIllIII;
            ++lllllllllllllIlIIlIIIIlIIIIlIIII;
            "".length();
            if (" ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIIIIlIIIIllIlI);
    }
    
    static {
        lIllllIIIlllIlI();
        lIllllIIIlllIIl();
        VARIANT = PropertyEnum.create(BlockWoodSlab.lIIIIlllIIIlIl[BlockWoodSlab.lIIIIlllIIIllI[0]], BlockPlanks.EnumType.class);
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIlIIlIIIIlIIlIIIlIl) {
        IBlockState lllllllllllllIlIIlIIIIlIIlIIIlll = this.getDefaultState().withProperty(BlockWoodSlab.VARIANT, BlockPlanks.EnumType.byMetadata(lllllllllllllIlIIlIIIIlIIlIIIlIl & BlockWoodSlab.lIIIIlllIIIllI[2]));
        if (lIllllIIIlllIll(this.isDouble() ? 1 : 0)) {
            final IBlockState blockState = lllllllllllllIlIIlIIIIlIIlIIIlll;
            final PropertyEnum<EnumBlockHalf> half = BlockWoodSlab.HALF;
            EnumBlockHalf enumBlockHalf;
            if (lIllllIIIlllIll(lllllllllllllIlIIlIIIIlIIlIIIlIl & BlockWoodSlab.lIIIIlllIIIllI[3])) {
                enumBlockHalf = EnumBlockHalf.BOTTOM;
                "".length();
                if (("  ".length() & ("  ".length() ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            else {
                enumBlockHalf = EnumBlockHalf.TOP;
            }
            lllllllllllllIlIIlIIIIlIIlIIIlll = blockState.withProperty((IProperty<Comparable>)half, enumBlockHalf);
        }
        return lllllllllllllIlIIlIIIIlIIlIIIlll;
    }
    
    private static boolean lIllllIIIllllII(final Object lllllllllllllIlIIlIIIIlIIIIIIlII, final Object lllllllllllllIlIIlIIIIlIIIIIIIll) {
        return lllllllllllllIlIIlIIIIlIIIIIIlII != lllllllllllllIlIIlIIIIlIIIIIIIll;
    }
    
    @Override
    public IProperty<?> getVariantProperty() {
        return BlockWoodSlab.VARIANT;
    }
    
    private static String lIllllIIIlllIII(final String lllllllllllllIlIIlIIIIlIIIlIlIlI, final String lllllllllllllIlIIlIIIIlIIIlIlIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIIIlIIIlIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIIIlIIIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIIIIlIIIlIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIIIIlIIIlIlllI.init(BlockWoodSlab.lIIIIlllIIIllI[4], lllllllllllllIlIIlIIIIlIIIlIllll);
            return new String(lllllllllllllIlIIlIIIIlIIIlIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIIIlIIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIIIlIIIlIllIl) {
            lllllllllllllIlIIlIIIIlIIIlIllIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String getUnlocalizedName(final int lllllllllllllIlIIlIIIIlIIllIIlIl) {
        return String.valueOf(new StringBuilder(String.valueOf(super.getUnlocalizedName())).append(BlockWoodSlab.lIIIIlllIIIlIl[BlockWoodSlab.lIIIIlllIIIllI[1]]).append(BlockPlanks.EnumType.byMetadata(lllllllllllllIlIIlIIIIlIIllIIlIl).getUnlocalizedName()));
    }
    
    @Override
    public Item getItem(final World lllllllllllllIlIIlIIIIlIIllIlIlI, final BlockPos lllllllllllllIlIIlIIIIlIIllIlIIl) {
        return Item.getItemFromBlock(Blocks.wooden_slab);
    }
    
    private static boolean lIllllIIlIIIIII(final int lllllllllllllIlIIlIIIIlIIIIIlIII, final int lllllllllllllIlIIlIIIIlIIIIIIlll) {
        return lllllllllllllIlIIlIIIIlIIIIIlIII < lllllllllllllIlIIlIIIIlIIIIIIlll;
    }
    
    private static void lIllllIIIlllIlI() {
        (lIIIIlllIIIllI = new int[5])[0] = ((0x9 ^ 0x6A) & ~(0xA4 ^ 0xC7));
        BlockWoodSlab.lIIIIlllIIIllI[1] = " ".length();
        BlockWoodSlab.lIIIIlllIIIllI[2] = (0x49 ^ 0x4E);
        BlockWoodSlab.lIIIIlllIIIllI[3] = (135 + 176 - 189 + 57 ^ 102 + 36 - 66 + 115);
        BlockWoodSlab.lIIIIlllIIIllI[4] = "  ".length();
    }
    
    @Override
    protected BlockState createBlockState() {
        BlockState blockState;
        if (lIllllIIIllllll(this.isDouble() ? 1 : 0)) {
            final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll;
            blockState = new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
            llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockWoodSlab.lIIIIlllIIIllI[1]];
            llllllllllllIllllIIIlIlIIlIIIlll[BlockWoodSlab.lIIIIlllIIIllI[0]] = BlockWoodSlab.VARIANT;
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        else {
            final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll2;
            blockState = new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll2);
            llllllllllllIllllIIIlIlIIlIIIlll2 = new IProperty[BlockWoodSlab.lIIIIlllIIIllI[4]];
            llllllllllllIllllIIIlIlIIlIIIlll2[BlockWoodSlab.lIIIIlllIIIllI[0]] = BlockWoodSlab.HALF;
            llllllllllllIllllIIIlIlIIlIIIlll2[BlockWoodSlab.lIIIIlllIIIllI[1]] = BlockWoodSlab.VARIANT;
        }
        return blockState;
    }
    
    private static void lIllllIIIlllIIl() {
        (lIIIIlllIIIlIl = new String[BlockWoodSlab.lIIIIlllIIIllI[4]])[BlockWoodSlab.lIIIIlllIIIllI[0]] = lIllllIIIllIlll("IS8nAgY5Og==", "WNUkg");
        BlockWoodSlab.lIIIIlllIIIlIl[BlockWoodSlab.lIIIIlllIIIllI[1]] = lIllllIIIlllIII("7CH/sJVIigg=", "XdVud");
    }
    
    private static boolean lIllllIIIlllIll(final int lllllllllllllIlIIlIIIIIllllllIll) {
        return lllllllllllllIlIIlIIIIIllllllIll == 0;
    }
    
    private static boolean lIllllIIIlllllI(final Object lllllllllllllIlIIlIIIIlIIIIIIIII, final Object lllllllllllllIlIIlIIIIIlllllllll) {
        return lllllllllllllIlIIlIIIIlIIIIIIIII == lllllllllllllIlIIlIIIIIlllllllll;
    }
    
    @Override
    public MapColor getMapColor(final IBlockState lllllllllllllIlIIlIIIIlIIlllIIIl) {
        return lllllllllllllIlIIlIIIIlIIlllIIIl.getValue(BlockWoodSlab.VARIANT).func_181070_c();
    }
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIlIIlIIIIlIIllIlllI, final Random lllllllllllllIlIIlIIIIlIIllIllIl, final int lllllllllllllIlIIlIIIIlIIllIllII) {
        return Item.getItemFromBlock(Blocks.wooden_slab);
    }
    
    private static boolean lIllllIIIllllll(final int lllllllllllllIlIIlIIIIIlllllllIl) {
        return lllllllllllllIlIIlIIIIIlllllllIl != 0;
    }
    
    @Override
    public int damageDropped(final IBlockState lllllllllllllIlIIlIIIIlIIIllIlIl) {
        return lllllllllllllIlIIlIIIIlIIIllIlIl.getValue(BlockWoodSlab.VARIANT).getMetadata();
    }
    
    public BlockWoodSlab() {
        super(Material.wood);
        IBlockState lllllllllllllIlIIlIIIIlIIlllIllI = this.blockState.getBaseState();
        if (lIllllIIIlllIll(this.isDouble() ? 1 : 0)) {
            lllllllllllllIlIIlIIIIlIIlllIllI = lllllllllllllIlIIlIIIIlIIlllIllI.withProperty(BlockWoodSlab.HALF, EnumBlockHalf.BOTTOM);
        }
        this.setDefaultState(lllllllllllllIlIIlIIIIlIIlllIllI.withProperty(BlockWoodSlab.VARIANT, BlockPlanks.EnumType.OAK));
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    private static boolean lIllllIIIllllIl(final int lllllllllllllIlIIlIIIIlIIIIIllII, final int lllllllllllllIlIIlIIIIlIIIIIlIll) {
        return lllllllllllllIlIIlIIIIlIIIIIllII >= lllllllllllllIlIIlIIIIlIIIIIlIll;
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIlIIlIIIIlIIIllllll) {
        int lllllllllllllIlIIlIIIIlIIIlllllI = BlockWoodSlab.lIIIIlllIIIllI[0];
        lllllllllllllIlIIlIIIIlIIIlllllI |= lllllllllllllIlIIlIIIIlIIIllllll.getValue(BlockWoodSlab.VARIANT).getMetadata();
        if (lIllllIIIlllIll(this.isDouble() ? 1 : 0) && lIllllIIIlllllI(lllllllllllllIlIIlIIIIlIIIllllll.getValue(BlockWoodSlab.HALF), EnumBlockHalf.TOP)) {
            lllllllllllllIlIIlIIIIlIIIlllllI |= BlockWoodSlab.lIIIIlllIIIllI[3];
        }
        return lllllllllllllIlIIlIIIIlIIIlllllI;
    }
    
    @Override
    public Object getVariant(final ItemStack lllllllllllllIlIIlIIIIlIIlIllllI) {
        return BlockPlanks.EnumType.byMetadata(lllllllllllllIlIIlIIIIlIIlIllllI.getMetadata() & BlockWoodSlab.lIIIIlllIIIllI[2]);
    }
}
