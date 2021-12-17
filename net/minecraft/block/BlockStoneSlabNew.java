// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.IStringSerializable;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.block.material.MapColor;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import java.util.Random;
import net.minecraft.util.StatCollector;
import net.minecraft.block.state.BlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.item.Item;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;

public abstract class BlockStoneSlabNew extends BlockSlab
{
    public static final /* synthetic */ PropertyEnum<EnumType> VARIANT;
    private static final /* synthetic */ int[] lIlIlIIllIIlll;
    private static final /* synthetic */ String[] lIlIlIIllIIllI;
    public static final /* synthetic */ PropertyBool SEAMLESS;
    
    public BlockStoneSlabNew() {
        super(Material.rock);
        IBlockState lllllllllllllIIIlIIlIlIIlIIIIllI = this.blockState.getBaseState();
        if (lllIllIlIIIlIII(this.isDouble() ? 1 : 0)) {
            lllllllllllllIIIlIIlIlIIlIIIIllI = lllllllllllllIIIlIIlIlIIlIIIIllI.withProperty((IProperty<Comparable>)BlockStoneSlabNew.SEAMLESS, (boolean)(BlockStoneSlabNew.lIlIlIIllIIlll[0] != 0));
            "".length();
            if (" ".length() == 0) {
                throw null;
            }
        }
        else {
            lllllllllllllIIIlIIlIlIIlIIIIllI = lllllllllllllIIIlIIlIlIIlIIIIllI.withProperty(BlockStoneSlabNew.HALF, EnumBlockHalf.BOTTOM);
        }
        this.setDefaultState(lllllllllllllIIIlIIlIlIIlIIIIllI.withProperty(BlockStoneSlabNew.VARIANT, EnumType.RED_SANDSTONE));
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    private static boolean lllIllIlIIIllII(final Object lllllllllllllIIIlIIlIlIIIIIIllIl, final Object lllllllllllllIIIlIIlIlIIIIIIllII) {
        return lllllllllllllIIIlIIlIlIIIIIIllIl == lllllllllllllIIIlIIlIlIIIIIIllII;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIIlIIlIlIIIlIllIIl) {
        IBlockState lllllllllllllIIIlIIlIlIIIlIllIII = this.getDefaultState().withProperty(BlockStoneSlabNew.VARIANT, EnumType.byMetadata(lllllllllllllIIIlIIlIlIIIlIllIIl & BlockStoneSlabNew.lIlIlIIllIIlll[4]));
        if (lllIllIlIIIlIII(this.isDouble() ? 1 : 0)) {
            final IBlockState blockState = lllllllllllllIIIlIIlIlIIIlIllIII;
            final PropertyBool seamless = BlockStoneSlabNew.SEAMLESS;
            int b;
            if (lllIllIlIIIlIII(lllllllllllllIIIlIIlIlIIIlIllIIl & BlockStoneSlabNew.lIlIlIIllIIlll[5])) {
                b = BlockStoneSlabNew.lIlIlIIllIIlll[1];
                "".length();
                if ("   ".length() > "   ".length()) {
                    return null;
                }
            }
            else {
                b = BlockStoneSlabNew.lIlIlIIllIIlll[0];
            }
            lllllllllllllIIIlIIlIlIIIlIllIII = blockState.withProperty((IProperty<Comparable>)seamless, (boolean)(b != 0));
            "".length();
            if ("   ".length() >= (0x5F ^ 0x5B)) {
                return null;
            }
        }
        else {
            final IBlockState blockState2 = lllllllllllllIIIlIIlIlIIIlIllIII;
            final PropertyEnum<EnumBlockHalf> half = BlockStoneSlabNew.HALF;
            EnumBlockHalf enumBlockHalf;
            if (lllIllIlIIIlIll(lllllllllllllIIIlIIlIlIIIlIllIIl & BlockStoneSlabNew.lIlIlIIllIIlll[5])) {
                enumBlockHalf = EnumBlockHalf.BOTTOM;
                "".length();
                if ("   ".length() >= (19 + 146 - 134 + 137 ^ 2 + 59 + 78 + 33)) {
                    return null;
                }
            }
            else {
                enumBlockHalf = EnumBlockHalf.TOP;
            }
            lllllllllllllIIIlIIlIlIIIlIllIII = blockState2.withProperty((IProperty<Comparable>)half, enumBlockHalf);
        }
        return lllllllllllllIIIlIIlIlIIIlIllIII;
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIIlIIlIlIIIlIIllIl) {
        int lllllllllllllIIIlIIlIlIIIlIIllll = BlockStoneSlabNew.lIlIlIIllIIlll[0];
        lllllllllllllIIIlIIlIlIIIlIIllll |= lllllllllllllIIIlIIlIlIIIlIIllIl.getValue(BlockStoneSlabNew.VARIANT).getMetadata();
        if (lllIllIlIIIlIII(this.isDouble() ? 1 : 0)) {
            if (lllIllIlIIIlIII(((boolean)lllllllllllllIIIlIIlIlIIIlIIllIl.getValue((IProperty<Boolean>)BlockStoneSlabNew.SEAMLESS)) ? 1 : 0)) {
                lllllllllllllIIIlIIlIlIIIlIIllll |= BlockStoneSlabNew.lIlIlIIllIIlll[5];
                "".length();
                if ("   ".length() > (0x22 ^ 0x72 ^ (0x71 ^ 0x25))) {
                    return (0x50 ^ 0xC ^ (0x70 ^ 0x1B)) & (0xB ^ 0x71 ^ (0x16 ^ 0x5B) ^ -" ".length());
                }
            }
        }
        else if (lllIllIlIIIllII(lllllllllllllIIIlIIlIlIIIlIIllIl.getValue(BlockStoneSlabNew.HALF), EnumBlockHalf.TOP)) {
            lllllllllllllIIIlIIlIlIIIlIIllll |= BlockStoneSlabNew.lIlIlIIllIIlll[5];
        }
        return lllllllllllllIIIlIIlIlIIIlIIllll;
    }
    
    @Override
    public void getSubBlocks(final Item lllllllllllllIIIlIIlIlIIIllIIlll, final CreativeTabs lllllllllllllIIIlIIlIlIIIllIIllI, final List<ItemStack> lllllllllllllIIIlIIlIlIIIllIIIlI) {
        if (lllIllIlIIIlIIl(lllllllllllllIIIlIIlIlIIIllIIlll, Item.getItemFromBlock(Blocks.double_stone_slab2))) {
            final long lllllllllllllIIIlIIlIlIIIlIllllI;
            final double lllllllllllllIIIlIIlIlIIIlIlllll = ((EnumType[])(Object)(lllllllllllllIIIlIIlIlIIIlIllllI = (long)(Object)EnumType.values())).length;
            byte lllllllllllllIIIlIIlIlIIIllIIIII = (byte)BlockStoneSlabNew.lIlIlIIllIIlll[0];
            "".length();
            if (" ".length() > "   ".length()) {
                return;
            }
            while (!lllIllIlIIIlIlI(lllllllllllllIIIlIIlIlIIIllIIIII, (int)lllllllllllllIIIlIIlIlIIIlIlllll)) {
                final EnumType lllllllllllllIIIlIIlIlIIIllIIlII = lllllllllllllIIIlIIlIlIIIlIllllI[lllllllllllllIIIlIIlIlIIIllIIIII];
                lllllllllllllIIIlIIlIlIIIllIIIlI.add(new ItemStack(lllllllllllllIIIlIIlIlIIIllIIlll, BlockStoneSlabNew.lIlIlIIllIIlll[1], lllllllllllllIIIlIIlIlIIIllIIlII.getMetadata()));
                "".length();
                ++lllllllllllllIIIlIIlIlIIIllIIIII;
            }
        }
    }
    
    @Override
    protected BlockState createBlockState() {
        BlockState blockState;
        if (lllIllIlIIIlIII(this.isDouble() ? 1 : 0)) {
            final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll;
            blockState = new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
            llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockStoneSlabNew.lIlIlIIllIIlll[2]];
            llllllllllllIllllIIIlIlIIlIIIlll[BlockStoneSlabNew.lIlIlIIllIIlll[0]] = BlockStoneSlabNew.SEAMLESS;
            llllllllllllIllllIIIlIlIIlIIIlll[BlockStoneSlabNew.lIlIlIIllIIlll[1]] = BlockStoneSlabNew.VARIANT;
            "".length();
            if (((0x53 ^ 0x5F ^ (0x7F ^ 0x6C)) & (61 + 110 - 66 + 83 ^ 107 + 36 - 14 + 34 ^ -" ".length())) > " ".length()) {
                return null;
            }
        }
        else {
            final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll2;
            blockState = new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll2);
            llllllllllllIllllIIIlIlIIlIIIlll2 = new IProperty[BlockStoneSlabNew.lIlIlIIllIIlll[2]];
            llllllllllllIllllIIIlIlIIlIIIlll2[BlockStoneSlabNew.lIlIlIIllIIlll[0]] = BlockStoneSlabNew.HALF;
            llllllllllllIllllIIIlIlIIlIIIlll2[BlockStoneSlabNew.lIlIlIIllIIlll[1]] = BlockStoneSlabNew.VARIANT;
        }
        return blockState;
    }
    
    @Override
    public IProperty<?> getVariantProperty() {
        return BlockStoneSlabNew.VARIANT;
    }
    
    @Override
    public String getLocalizedName() {
        return StatCollector.translateToLocal(String.valueOf(new StringBuilder(String.valueOf(this.getUnlocalizedName())).append(BlockStoneSlabNew.lIlIlIIllIIllI[BlockStoneSlabNew.lIlIlIIllIIlll[2]])));
    }
    
    @Override
    public Object getVariant(final ItemStack lllllllllllllIIIlIIlIlIIIllIllll) {
        return EnumType.byMetadata(lllllllllllllIIIlIIlIlIIIllIllll.getMetadata() & BlockStoneSlabNew.lIlIlIIllIIlll[4]);
    }
    
    static {
        lllIllIlIIIIlll();
        lllIllIlIIIIllI();
        SEAMLESS = PropertyBool.create(BlockStoneSlabNew.lIlIlIIllIIllI[BlockStoneSlabNew.lIlIlIIllIIlll[0]]);
        VARIANT = PropertyEnum.create(BlockStoneSlabNew.lIlIlIIllIIllI[BlockStoneSlabNew.lIlIlIIllIIlll[1]], EnumType.class);
    }
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIIIlIIlIlIIIlllllll, final Random lllllllllllllIIIlIIlIlIIIllllllI, final int lllllllllllllIIIlIIlIlIIIlllllIl) {
        return Item.getItemFromBlock(Blocks.stone_slab2);
    }
    
    private static void lllIllIlIIIIlll() {
        (lIlIlIIllIIlll = new int[7])[0] = ((0x80 ^ 0x9E ^ (0x14 ^ 0x49)) & (200 + 95 - 187 + 123 ^ 52 + 61 - 9 + 60 ^ -" ".length()));
        BlockStoneSlabNew.lIlIlIIllIIlll[1] = " ".length();
        BlockStoneSlabNew.lIlIlIIllIIlll[2] = "  ".length();
        BlockStoneSlabNew.lIlIlIIllIIlll[3] = "   ".length();
        BlockStoneSlabNew.lIlIlIIllIIlll[4] = (0x3F ^ 0x38);
        BlockStoneSlabNew.lIlIlIIllIIlll[5] = (0xCE ^ 0x91 ^ (0xF2 ^ 0xA5));
        BlockStoneSlabNew.lIlIlIIllIIlll[6] = (89 + 108 - 45 + 16 ^ 165 + 140 - 294 + 161);
    }
    
    private static boolean lllIllIlIIIlIlI(final int lllllllllllllIIIlIIlIlIIIIIllIIl, final int lllllllllllllIIIlIIlIlIIIIIllIII) {
        return lllllllllllllIIIlIIlIlIIIIIllIIl >= lllllllllllllIIIlIIlIlIIIIIllIII;
    }
    
    @Override
    public String getUnlocalizedName(final int lllllllllllllIIIlIIlIlIIIlllIlII) {
        return String.valueOf(new StringBuilder(String.valueOf(super.getUnlocalizedName())).append(BlockStoneSlabNew.lIlIlIIllIIllI[BlockStoneSlabNew.lIlIlIIllIIlll[3]]).append(EnumType.byMetadata(lllllllllllllIIIlIIlIlIIIlllIlII).getUnlocalizedName()));
    }
    
    @Override
    public Item getItem(final World lllllllllllllIIIlIIlIlIIIllllIll, final BlockPos lllllllllllllIIIlIIlIlIIIllllIlI) {
        return Item.getItemFromBlock(Blocks.stone_slab2);
    }
    
    private static boolean lllIllIlIIIlIIl(final Object lllllllllllllIIIlIIlIlIIIIIlIIIl, final Object lllllllllllllIIIlIIlIlIIIIIlIIII) {
        return lllllllllllllIIIlIIlIlIIIIIlIIIl != lllllllllllllIIIlIIlIlIIIIIlIIII;
    }
    
    private static String lllIllIlIIIIlII(String lllllllllllllIIIlIIlIlIIIIlIIlII, final String lllllllllllllIIIlIIlIlIIIIlIlIII) {
        lllllllllllllIIIlIIlIlIIIIlIIlII = (byte)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlIIlIlIIIIlIIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIIlIlIIIIlIIlll = new StringBuilder();
        final char[] lllllllllllllIIIlIIlIlIIIIlIIllI = lllllllllllllIIIlIIlIlIIIIlIlIII.toCharArray();
        int lllllllllllllIIIlIIlIlIIIIlIIlIl = BlockStoneSlabNew.lIlIlIIllIIlll[0];
        final Exception lllllllllllllIIIlIIlIlIIIIIlllll = (Object)((String)lllllllllllllIIIlIIlIlIIIIlIIlII).toCharArray();
        final Exception lllllllllllllIIIlIIlIlIIIIIllllI = (Exception)lllllllllllllIIIlIIlIlIIIIIlllll.length;
        short lllllllllllllIIIlIIlIlIIIIIlllIl = (short)BlockStoneSlabNew.lIlIlIIllIIlll[0];
        while (lllIllIlIIIllIl(lllllllllllllIIIlIIlIlIIIIIlllIl, (int)lllllllllllllIIIlIIlIlIIIIIllllI)) {
            final char lllllllllllllIIIlIIlIlIIIIlIlIlI = lllllllllllllIIIlIIlIlIIIIIlllll[lllllllllllllIIIlIIlIlIIIIIlllIl];
            lllllllllllllIIIlIIlIlIIIIlIIlll.append((char)(lllllllllllllIIIlIIlIlIIIIlIlIlI ^ lllllllllllllIIIlIIlIlIIIIlIIllI[lllllllllllllIIIlIIlIlIIIIlIIlIl % lllllllllllllIIIlIIlIlIIIIlIIllI.length]));
            "".length();
            ++lllllllllllllIIIlIIlIlIIIIlIIlIl;
            ++lllllllllllllIIIlIIlIlIIIIIlllIl;
            "".length();
            if (((0xDE ^ 0x9A) & ~(0xC9 ^ 0x8D)) >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIIlIlIIIIlIIlll);
    }
    
    @Override
    public MapColor getMapColor(final IBlockState lllllllllllllIIIlIIlIlIIIlIIIllI) {
        return lllllllllllllIIIlIIlIlIIIlIIIllI.getValue(BlockStoneSlabNew.VARIANT).func_181068_c();
    }
    
    private static boolean lllIllIlIIIllIl(final int lllllllllllllIIIlIIlIlIIIIIlIlIl, final int lllllllllllllIIIlIIlIlIIIIIlIlII) {
        return lllllllllllllIIIlIIlIlIIIIIlIlIl < lllllllllllllIIIlIIlIlIIIIIlIlII;
    }
    
    private static void lllIllIlIIIIllI() {
        (lIlIlIIllIIllI = new String[BlockStoneSlabNew.lIlIlIIllIIlll[6]])[BlockStoneSlabNew.lIlIlIIllIIlll[0]] = lllIllIlIIIIlII("GSsqDhsPPTg=", "jNKcw");
        BlockStoneSlabNew.lIlIlIIllIIllI[BlockStoneSlabNew.lIlIlIIllIIlll[1]] = lllIllIlIIIIlIl("QVwht3o5mks=", "tASkj");
        BlockStoneSlabNew.lIlIlIIllIIllI[BlockStoneSlabNew.lIlIlIIllIIlll[2]] = lllIllIlIIIIlIl("tnhqZLKFyy6ijfccXh3N064RWQNSqria", "LMENf");
        BlockStoneSlabNew.lIlIlIIllIIllI[BlockStoneSlabNew.lIlIlIIllIIlll[3]] = lllIllIlIIIIlIl("yRAxDlWqYJk=", "izKSr");
    }
    
    @Override
    public int damageDropped(final IBlockState lllllllllllllIIIlIIlIlIIIlIIIIIl) {
        return lllllllllllllIIIlIIlIlIIIlIIIIIl.getValue(BlockStoneSlabNew.VARIANT).getMetadata();
    }
    
    private static String lllIllIlIIIIlIl(final String lllllllllllllIIIlIIlIlIIIIllIlll, final String lllllllllllllIIIlIIlIlIIIIlllIII) {
        try {
            final SecretKeySpec lllllllllllllIIIlIIlIlIIIIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIlIlIIIIlllIII.getBytes(StandardCharsets.UTF_8)), BlockStoneSlabNew.lIlIlIIllIIlll[5]), "DES");
            final Cipher lllllllllllllIIIlIIlIlIIIIlllIll = Cipher.getInstance("DES");
            lllllllllllllIIIlIIlIlIIIIlllIll.init(BlockStoneSlabNew.lIlIlIIllIIlll[2], lllllllllllllIIIlIIlIlIIIIllllII);
            return new String(lllllllllllllIIIlIIlIlIIIIlllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIlIlIIIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIIlIlIIIIlllIlI) {
            lllllllllllllIIIlIIlIlIIIIlllIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIllIlIIIlIII(final int lllllllllllllIIIlIIlIlIIIIIIlIlI) {
        return lllllllllllllIIIlIIlIlIIIIIIlIlI != 0;
    }
    
    private static boolean lllIllIlIIIlIll(final int lllllllllllllIIIlIIlIlIIIIIIlIII) {
        return lllllllllllllIIIlIIlIlIIIIIIlIII == 0;
    }
    
    public enum EnumType implements IStringSerializable
    {
        private static final /* synthetic */ String[] lIIlIIIlIlIIll;
        private static final /* synthetic */ int[] lIIlIIIlIlIlIl;
        private final /* synthetic */ String name;
        private final /* synthetic */ MapColor field_181069_e;
        private static final /* synthetic */ EnumType[] META_LOOKUP;
        
        RED_SANDSTONE(EnumType.lIIlIIIlIlIIll[EnumType.lIIlIIIlIlIlIl[0]], EnumType.lIIlIIIlIlIlIl[0], EnumType.lIIlIIIlIlIlIl[0], EnumType.lIIlIIIlIlIIll[EnumType.lIIlIIIlIlIlIl[1]], BlockSand.EnumType.RED_SAND.getMapColor());
        
        private final /* synthetic */ int meta;
        
        public static EnumType byMetadata(int lllllllllllllIIlllIIllIIlllllIII) {
            if (!llIIlIlIlllIlII(lllllllllllllIIlllIIllIIlllllIII) || llIIlIlIlllIIll(lllllllllllllIIlllIIllIIlllllIII, EnumType.META_LOOKUP.length)) {
                lllllllllllllIIlllIIllIIlllllIII = EnumType.lIIlIIIlIlIlIl[0];
            }
            return EnumType.META_LOOKUP[lllllllllllllIIlllIIllIIlllllIII];
        }
        
        private static boolean llIIlIlIlllIIll(final int lllllllllllllIIlllIIllIIllIllIlI, final int lllllllllllllIIlllIIllIIllIllIIl) {
            return lllllllllllllIIlllIIllIIllIllIlI >= lllllllllllllIIlllIIllIIllIllIIl;
        }
        
        @Override
        public String getName() {
            return this.name;
        }
        
        private EnumType(final String lllllllllllllIIlllIIllIlIIIIlIII, final int lllllllllllllIIlllIIllIlIIIIIlll, final int lllllllllllllIIlllIIllIlIIIIIllI, final String lllllllllllllIIlllIIllIlIIIIIlIl, final MapColor lllllllllllllIIlllIIllIlIIIIlIlI) {
            this.meta = lllllllllllllIIlllIIllIlIIIIIllI;
            this.name = lllllllllllllIIlllIIllIlIIIIIlIl;
            this.field_181069_e = lllllllllllllIIlllIIllIlIIIIlIlI;
        }
        
        private static String llIIlIlIllIlllI(final String lllllllllllllIIlllIIllIIlllIIIII, final String lllllllllllllIIlllIIllIIllIlllll) {
            try {
                final SecretKeySpec lllllllllllllIIlllIIllIIlllIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIllIIllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlllIIllIIlllIIlII = Cipher.getInstance("Blowfish");
                lllllllllllllIIlllIIllIIlllIIlII.init(EnumType.lIIlIIIlIlIlIl[2], lllllllllllllIIlllIIllIIlllIIlIl);
                return new String(lllllllllllllIIlllIIllIIlllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIllIIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlllIIllIIlllIIIll) {
                lllllllllllllIIlllIIllIIlllIIIll.printStackTrace();
                return null;
            }
        }
        
        private static void llIIlIlIllIllll() {
            (lIIlIIIlIlIIll = new String[EnumType.lIIlIIIlIlIlIl[2]])[EnumType.lIIlIIIlIlIlIl[0]] = llIIlIlIllIlllI("8gXZQAQr1oBI8UK35WZ8fA==", "WWcio");
            EnumType.lIIlIIIlIlIIll[EnumType.lIIlIIIlIlIlIl[1]] = llIIlIlIllIlllI("mmLlx9lD2ZkOq3c+oMbqEA==", "QDEVM");
        }
        
        @Override
        public String toString() {
            return this.name;
        }
        
        private static void llIIlIlIlllIIlI() {
            (lIIlIIIlIlIlIl = new int[3])[0] = ((0xC6 ^ 0xB1 ^ (0x2B ^ 0x1E)) & (206 + 73 - 258 + 208 ^ 112 + 145 - 231 + 141 ^ -" ".length()));
            EnumType.lIIlIIIlIlIlIl[1] = " ".length();
            EnumType.lIIlIIIlIlIlIl[2] = "  ".length();
        }
        
        public String getUnlocalizedName() {
            return this.name;
        }
        
        public int getMetadata() {
            return this.meta;
        }
        
        private static boolean llIIlIlIlllIlII(final int lllllllllllllIIlllIIllIIllIlIlll) {
            return lllllllllllllIIlllIIllIIllIlIlll >= 0;
        }
        
        static {
            llIIlIlIlllIIlI();
            llIIlIlIllIllll();
            final EnumType[] enum$VALUES = new EnumType[EnumType.lIIlIIIlIlIlIl[1]];
            enum$VALUES[EnumType.lIIlIIIlIlIlIl[0]] = EnumType.RED_SANDSTONE;
            ENUM$VALUES = enum$VALUES;
            META_LOOKUP = new EnumType[values().length];
            final long lllllllllllllIIlllIIllIlIIIlIlII;
            final double lllllllllllllIIlllIIllIlIIIlIlIl = ((EnumType[])(Object)(lllllllllllllIIlllIIllIlIIIlIlII = (long)(Object)values())).length;
            char lllllllllllllIIlllIIllIlIIIlIllI = (char)EnumType.lIIlIIIlIlIlIl[0];
            "".length();
            if (((0x35 ^ 0x21 ^ (0x70 ^ 0x26)) & (0xB8 ^ 0x95 ^ (0x9 ^ 0x66) ^ -" ".length())) != 0x0) {
                return;
            }
            while (!llIIlIlIlllIIll(lllllllllllllIIlllIIllIlIIIlIllI, (int)lllllllllllllIIlllIIllIlIIIlIlIl)) {
                final EnumType lllllllllllllIIlllIIllIlIIIllIII = lllllllllllllIIlllIIllIlIIIlIlII[lllllllllllllIIlllIIllIlIIIlIllI];
                EnumType.META_LOOKUP[lllllllllllllIIlllIIllIlIIIllIII.getMetadata()] = lllllllllllllIIlllIIllIlIIIllIII;
                ++lllllllllllllIIlllIIllIlIIIlIllI;
            }
        }
        
        public MapColor func_181068_c() {
            return this.field_181069_e;
        }
    }
}
