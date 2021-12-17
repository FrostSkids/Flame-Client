// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.IStringSerializable;
import java.util.List;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;

public abstract class BlockStoneSlab extends BlockSlab
{
    private static final /* synthetic */ String[] lIlIIlIIIIIllI;
    public static final /* synthetic */ PropertyEnum<EnumType> VARIANT;
    public static final /* synthetic */ PropertyBool SEAMLESS;
    private static final /* synthetic */ int[] lIlIIlIIIllIII;
    
    private static boolean lllIIlIlIIlllIl(final int lllllllllllllIIIlllIIlIIIlllllIl) {
        return lllllllllllllIIIlllIIlIIIlllllIl == 0;
    }
    
    @Override
    protected BlockState createBlockState() {
        BlockState blockState;
        if (lllIIlIlIIllIlI(this.isDouble() ? 1 : 0)) {
            final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll;
            blockState = new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
            llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockStoneSlab.lIlIIlIIIllIII[2]];
            llllllllllllIllllIIIlIlIIlIIIlll[BlockStoneSlab.lIlIIlIIIllIII[0]] = BlockStoneSlab.SEAMLESS;
            llllllllllllIllllIIIlIlIIlIIIlll[BlockStoneSlab.lIlIIlIIIllIII[1]] = BlockStoneSlab.VARIANT;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        else {
            final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll2;
            blockState = new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll2);
            llllllllllllIllllIIIlIlIIlIIIlll2 = new IProperty[BlockStoneSlab.lIlIIlIIIllIII[2]];
            llllllllllllIllllIIIlIlIIlIIIlll2[BlockStoneSlab.lIlIIlIIIllIII[0]] = BlockStoneSlab.HALF;
            llllllllllllIllllIIIlIlIIlIIIlll2[BlockStoneSlab.lIlIIlIIIllIII[1]] = BlockStoneSlab.VARIANT;
        }
        return blockState;
    }
    
    @Override
    public MapColor getMapColor(final IBlockState lllllllllllllIIIlllIIlIIlIlIIlll) {
        return lllllllllllllIIIlllIIlIIlIlIIlll.getValue(BlockStoneSlab.VARIANT).func_181074_c();
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIIlllIIlIIlIllIllI) {
        int lllllllllllllIIIlllIIlIIlIllIlIl = BlockStoneSlab.lIlIIlIIIllIII[0];
        lllllllllllllIIIlllIIlIIlIllIlIl |= lllllllllllllIIIlllIIlIIlIllIllI.getValue(BlockStoneSlab.VARIANT).getMetadata();
        if (lllIIlIlIIllIlI(this.isDouble() ? 1 : 0)) {
            if (lllIIlIlIIllIlI(((boolean)lllllllllllllIIIlllIIlIIlIllIllI.getValue((IProperty<Boolean>)BlockStoneSlab.SEAMLESS)) ? 1 : 0)) {
                lllllllllllllIIIlllIIlIIlIllIlIl |= BlockStoneSlab.lIlIIlIIIllIII[4];
                "".length();
                if ((55 + 19 + 49 + 56 ^ 6 + 57 + 22 + 98) <= 0) {
                    return (42 + 66 - 35 + 103 ^ 38 + 39 - 48 + 155) & (47 + 42 + 25 + 31 ^ 62 + 44 + 46 + 1 ^ -" ".length());
                }
            }
        }
        else if (lllIIlIlIIllllI(lllllllllllllIIIlllIIlIIlIllIllI.getValue(BlockStoneSlab.HALF), EnumBlockHalf.TOP)) {
            lllllllllllllIIIlllIIlIIlIllIlIl |= BlockStoneSlab.lIlIIlIIIllIII[4];
        }
        return lllllllllllllIIIlllIIlIIlIllIlIl;
    }
    
    private static String lllIIlIIlIIlIll(final String lllllllllllllIIIlllIIlIIlIIlllIl, final String lllllllllllllIIIlllIIlIIlIIlllII) {
        try {
            final SecretKeySpec lllllllllllllIIIlllIIlIIlIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIIlIIlIIlllII.getBytes(StandardCharsets.UTF_8)), BlockStoneSlab.lIlIIlIIIllIII[4]), "DES");
            final Cipher lllllllllllllIIIlllIIlIIlIlIIIIl = Cipher.getInstance("DES");
            lllllllllllllIIIlllIIlIIlIlIIIIl.init(BlockStoneSlab.lIlIIlIIIllIII[2], lllllllllllllIIIlllIIlIIlIlIIIlI);
            return new String(lllllllllllllIIIlllIIlIIlIlIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIIlIIlIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllIIlIIlIlIIIII) {
            lllllllllllllIIIlllIIlIIlIlIIIII.printStackTrace();
            return null;
        }
    }
    
    private static String lllIIlIIlIIlIIl(final String lllllllllllllIIIlllIIlIIlIIlIIII, final String lllllllllllllIIIlllIIlIIlIIIllll) {
        try {
            final SecretKeySpec lllllllllllllIIIlllIIlIIlIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIIlIIlIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlllIIlIIlIIlIlII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlllIIlIIlIIlIlII.init(BlockStoneSlab.lIlIIlIIIllIII[2], lllllllllllllIIIlllIIlIIlIIlIlIl);
            return new String(lllllllllllllIIIlllIIlIIlIIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIIlIIlIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllIIlIIlIIlIIll) {
            lllllllllllllIIIlllIIlIIlIIlIIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public IProperty<?> getVariantProperty() {
        return BlockStoneSlab.VARIANT;
    }
    
    private static void lllIIlIlIIllIIl() {
        (lIlIIlIIIllIII = new int[6])[0] = ((0x93 ^ 0xA6) & ~(0x46 ^ 0x73));
        BlockStoneSlab.lIlIIlIIIllIII[1] = " ".length();
        BlockStoneSlab.lIlIIlIIIllIII[2] = "  ".length();
        BlockStoneSlab.lIlIIlIIIllIII[3] = (29 + 125 - 45 + 44 ^ 63 + 111 - 145 + 129);
        BlockStoneSlab.lIlIIlIIIllIII[4] = (145 + 87 - 100 + 16 ^ 80 + 155 - 194 + 115);
        BlockStoneSlab.lIlIIlIIIllIII[5] = "   ".length();
    }
    
    private static boolean lllIIlIlIIllIlI(final int lllllllllllllIIIlllIIlIIIlllllll) {
        return lllllllllllllIIIlllIIlIIIlllllll != 0;
    }
    
    static {
        lllIIlIlIIllIIl();
        lllIIlIIlIIllII();
        SEAMLESS = PropertyBool.create(BlockStoneSlab.lIlIIlIIIIIllI[BlockStoneSlab.lIlIIlIIIllIII[0]]);
        VARIANT = PropertyEnum.create(BlockStoneSlab.lIlIIlIIIIIllI[BlockStoneSlab.lIlIIlIIIllIII[1]], EnumType.class);
    }
    
    @Override
    public int damageDropped(final IBlockState lllllllllllllIIIlllIIlIIlIlIlIll) {
        return lllllllllllllIIIlllIIlIIlIlIlIll.getValue(BlockStoneSlab.VARIANT).getMetadata();
    }
    
    @Override
    public String getUnlocalizedName(final int lllllllllllllIIIlllIIlIIllIlllII) {
        return String.valueOf(new StringBuilder(String.valueOf(super.getUnlocalizedName())).append(BlockStoneSlab.lIlIIlIIIIIllI[BlockStoneSlab.lIlIIlIIIllIII[2]]).append(EnumType.byMetadata(lllllllllllllIIIlllIIlIIllIlllII).getUnlocalizedName()));
    }
    
    private static boolean lllIIlIlIIlllII(final int lllllllllllllIIIlllIIlIIlIIIlIlI, final int lllllllllllllIIIlllIIlIIlIIIlIIl) {
        return lllllllllllllIIIlllIIlIIlIIIlIlI >= lllllllllllllIIIlllIIlIIlIIIlIIl;
    }
    
    private static boolean lllIIlIlIIllIll(final Object lllllllllllllIIIlllIIlIIlIIIIllI, final Object lllllllllllllIIIlllIIlIIlIIIIlIl) {
        return lllllllllllllIIIlllIIlIIlIIIIllI != lllllllllllllIIIlllIIlIIlIIIIlIl;
    }
    
    @Override
    public Item getItem(final World lllllllllllllIIIlllIIlIIlllIIIIl, final BlockPos lllllllllllllIIIlllIIlIIlllIIIII) {
        return Item.getItemFromBlock(Blocks.stone_slab);
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIIlllIIlIIlIllllII) {
        IBlockState lllllllllllllIIIlllIIlIIlIlllllI = this.getDefaultState().withProperty(BlockStoneSlab.VARIANT, EnumType.byMetadata(lllllllllllllIIIlllIIlIIlIllllII & BlockStoneSlab.lIlIIlIIIllIII[3]));
        if (lllIIlIlIIllIlI(this.isDouble() ? 1 : 0)) {
            final IBlockState blockState = lllllllllllllIIIlllIIlIIlIlllllI;
            final PropertyBool seamless = BlockStoneSlab.SEAMLESS;
            int b;
            if (lllIIlIlIIllIlI(lllllllllllllIIIlllIIlIIlIllllII & BlockStoneSlab.lIlIIlIIIllIII[4])) {
                b = BlockStoneSlab.lIlIIlIIIllIII[1];
                "".length();
                if ("   ".length() == 0) {
                    return null;
                }
            }
            else {
                b = BlockStoneSlab.lIlIIlIIIllIII[0];
            }
            lllllllllllllIIIlllIIlIIlIlllllI = blockState.withProperty((IProperty<Comparable>)seamless, (boolean)(b != 0));
            "".length();
            if (-" ".length() < -" ".length()) {
                return null;
            }
        }
        else {
            final IBlockState blockState2 = lllllllllllllIIIlllIIlIIlIlllllI;
            final PropertyEnum<EnumBlockHalf> half = BlockStoneSlab.HALF;
            EnumBlockHalf enumBlockHalf;
            if (lllIIlIlIIlllIl(lllllllllllllIIIlllIIlIIlIllllII & BlockStoneSlab.lIlIIlIIIllIII[4])) {
                enumBlockHalf = EnumBlockHalf.BOTTOM;
                "".length();
                if (-(0x72 ^ 0x76) > 0) {
                    return null;
                }
            }
            else {
                enumBlockHalf = EnumBlockHalf.TOP;
            }
            lllllllllllllIIIlllIIlIIlIlllllI = blockState2.withProperty((IProperty<Comparable>)half, enumBlockHalf);
        }
        return lllllllllllllIIIlllIIlIIlIlllllI;
    }
    
    private static void lllIIlIIlIIllII() {
        (lIlIIlIIIIIllI = new String[BlockStoneSlab.lIlIIlIIIllIII[5]])[BlockStoneSlab.lIlIIlIIIllIII[0]] = lllIIlIIlIIlIIl("Vj0tYmKvvAykRd0jDjx6Kw==", "BpxKg");
        BlockStoneSlab.lIlIIlIIIIIllI[BlockStoneSlab.lIlIIlIIIllIII[1]] = lllIIlIIlIIlIll("Yq6ZbtQNlhc=", "vZhQL");
        BlockStoneSlab.lIlIIlIIIIIllI[BlockStoneSlab.lIlIIlIIIllIII[2]] = lllIIlIIlIIlIIl("bKHqSteIkho=", "RKlkd");
    }
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIIIlllIIlIIlllIIlIl, final Random lllllllllllllIIIlllIIlIIlllIIlII, final int lllllllllllllIIIlllIIlIIlllIIIll) {
        return Item.getItemFromBlock(Blocks.stone_slab);
    }
    
    public BlockStoneSlab() {
        super(Material.rock);
        IBlockState lllllllllllllIIIlllIIlIIlllIlIIl = this.blockState.getBaseState();
        if (lllIIlIlIIllIlI(this.isDouble() ? 1 : 0)) {
            lllllllllllllIIIlllIIlIIlllIlIIl = lllllllllllllIIIlllIIlIIlllIlIIl.withProperty((IProperty<Comparable>)BlockStoneSlab.SEAMLESS, (boolean)(BlockStoneSlab.lIlIIlIIIllIII[0] != 0));
            "".length();
            if ("  ".length() <= 0) {
                throw null;
            }
        }
        else {
            lllllllllllllIIIlllIIlIIlllIlIIl = lllllllllllllIIIlllIIlIIlllIlIIl.withProperty(BlockStoneSlab.HALF, EnumBlockHalf.BOTTOM);
        }
        this.setDefaultState(lllllllllllllIIIlllIIlIIlllIlIIl.withProperty(BlockStoneSlab.VARIANT, EnumType.STONE));
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    private static boolean lllIIlIlIIllllI(final Object lllllllllllllIIIlllIIlIIlIIIIIlI, final Object lllllllllllllIIIlllIIlIIlIIIIIIl) {
        return lllllllllllllIIIlllIIlIIlIIIIIlI == lllllllllllllIIIlllIIlIIlIIIIIIl;
    }
    
    @Override
    public Object getVariant(final ItemStack lllllllllllllIIIlllIIlIIllIlIlIl) {
        return EnumType.byMetadata(lllllllllllllIIIlllIIlIIllIlIlIl.getMetadata() & BlockStoneSlab.lIlIIlIIIllIII[3]);
    }
    
    @Override
    public void getSubBlocks(final Item lllllllllllllIIIlllIIlIIllIIllIl, final CreativeTabs lllllllllllllIIIlllIIlIIllIIllII, final List<ItemStack> lllllllllllllIIIlllIIlIIllIIlIII) {
        if (lllIIlIlIIllIll(lllllllllllllIIIlllIIlIIllIIllIl, Item.getItemFromBlock(Blocks.double_stone_slab))) {
            final double lllllllllllllIIIlllIIlIIllIIIlII;
            final int lllllllllllllIIIlllIIlIIllIIIlIl = ((EnumType[])(Object)(lllllllllllllIIIlllIIlIIllIIIlII = (double)(Object)EnumType.values())).length;
            double lllllllllllllIIIlllIIlIIllIIIllI = BlockStoneSlab.lIlIIlIIIllIII[0];
            "".length();
            if ("   ".length() <= ((0x5 ^ 0x2 ^ (0xD4 ^ 0x9E)) & (0x1 ^ 0x7F ^ (0x65 ^ 0x56) ^ -" ".length()))) {
                return;
            }
            while (!lllIIlIlIIlllII((int)lllllllllllllIIIlllIIlIIllIIIllI, lllllllllllllIIIlllIIlIIllIIIlIl)) {
                final EnumType lllllllllllllIIIlllIIlIIllIIlIlI = lllllllllllllIIIlllIIlIIllIIIlII[lllllllllllllIIIlllIIlIIllIIIllI];
                if (lllIIlIlIIllIll(lllllllllllllIIIlllIIlIIllIIlIlI, EnumType.WOOD)) {
                    lllllllllllllIIIlllIIlIIllIIlIII.add(new ItemStack(lllllllllllllIIIlllIIlIIllIIllIl, BlockStoneSlab.lIlIIlIIIllIII[1], lllllllllllllIIIlllIIlIIllIIlIlI.getMetadata()));
                    "".length();
                }
                ++lllllllllllllIIIlllIIlIIllIIIllI;
            }
        }
    }
    
    public enum EnumType implements IStringSerializable
    {
        WOOD(EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[5]], EnumType.lIlIlIllllIlIl[2], EnumType.lIlIlIllllIlIl[2], MapColor.woodColor, EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[6]], EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[7]]), 
        SMOOTHBRICK(EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[13]], EnumType.lIlIlIllllIlIl[5], EnumType.lIlIlIllllIlIl[5], MapColor.stoneColor, EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[14]], EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[15]]);
        
        private final /* synthetic */ String name;
        
        QUARTZ(EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[19]], EnumType.lIlIlIllllIlIl[7], EnumType.lIlIlIllllIlIl[7], MapColor.quartzColor, EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[20]]), 
        STONE(EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[0]], EnumType.lIlIlIllllIlIl[0], EnumType.lIlIlIllllIlIl[0], MapColor.stoneColor, EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[1]]), 
        COBBLESTONE(EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[8]], EnumType.lIlIlIllllIlIl[3], EnumType.lIlIlIllllIlIl[3], MapColor.stoneColor, EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[9]], EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[10]]);
        
        private static final /* synthetic */ String[] lIlIlIllllIIll;
        private final /* synthetic */ MapColor field_181075_k;
        
        BRICK(EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[11]], EnumType.lIlIlIllllIlIl[4], EnumType.lIlIlIllllIlIl[4], MapColor.redColor, EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[12]]);
        
        private final /* synthetic */ String unlocalizedName;
        private final /* synthetic */ int meta;
        private static final /* synthetic */ EnumType[] META_LOOKUP;
        
        SAND(EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[2]], EnumType.lIlIlIllllIlIl[1], EnumType.lIlIlIllllIlIl[1], MapColor.sandColor, EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[3]], EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[4]]);
        
        private static final /* synthetic */ int[] lIlIlIllllIlIl;
        
        NETHERBRICK(EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[16]], EnumType.lIlIlIllllIlIl[6], EnumType.lIlIlIllllIlIl[6], MapColor.netherrackColor, EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[17]], EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[18]]);
        
        private EnumType(final String lllllllllllllIIIIllllIlIIlIlIIll, final int lllllllllllllIIIIllllIlIIlIlIIlI, final int lllllllllllllIIIIllllIlIIlIlIlll, final MapColor lllllllllllllIIIIllllIlIIlIlIIII, final String lllllllllllllIIIIllllIlIIlIIllll) {
            this(lllllllllllllIIIIllllIlIIlIlIIll, lllllllllllllIIIIllllIlIIlIlIIlI, lllllllllllllIIIIllllIlIIlIlIlll, lllllllllllllIIIIllllIlIIlIlIIII, lllllllllllllIIIIllllIlIIlIIllll, lllllllllllllIIIIllllIlIIlIIllll);
        }
        
        public static EnumType byMetadata(int lllllllllllllIIIIllllIlIIIllIIII) {
            if (!lllIllllllIlIll((int)lllllllllllllIIIIllllIlIIIllIIII) || lllIllllllIlIlI((int)lllllllllllllIIIIllllIlIIIllIIII, EnumType.META_LOOKUP.length)) {
                lllllllllllllIIIIllllIlIIIllIIII = EnumType.lIlIlIllllIlIl[0];
            }
            return EnumType.META_LOOKUP[lllllllllllllIIIIllllIlIIIllIIII];
        }
        
        public String getUnlocalizedName() {
            return this.unlocalizedName;
        }
        
        private static boolean lllIllllllIllII(final int lllllllllllllIIIIllllIIllllIlIIl, final int lllllllllllllIIIIllllIIllllIlIII) {
            return lllllllllllllIIIIllllIIllllIlIIl < lllllllllllllIIIIllllIIllllIlIII;
        }
        
        private static boolean lllIllllllIlIll(final int lllllllllllllIIIIllllIIllllIIllI) {
            return lllllllllllllIIIIllllIIllllIIllI >= 0;
        }
        
        static {
            lllIllllllIlIIl();
            lllIllllllIlIII();
            final EnumType[] enum$VALUES = new EnumType[EnumType.lIlIlIllllIlIl[8]];
            enum$VALUES[EnumType.lIlIlIllllIlIl[0]] = EnumType.STONE;
            enum$VALUES[EnumType.lIlIlIllllIlIl[1]] = EnumType.SAND;
            enum$VALUES[EnumType.lIlIlIllllIlIl[2]] = EnumType.WOOD;
            enum$VALUES[EnumType.lIlIlIllllIlIl[3]] = EnumType.COBBLESTONE;
            enum$VALUES[EnumType.lIlIlIllllIlIl[4]] = EnumType.BRICK;
            enum$VALUES[EnumType.lIlIlIllllIlIl[5]] = EnumType.SMOOTHBRICK;
            enum$VALUES[EnumType.lIlIlIllllIlIl[6]] = EnumType.NETHERBRICK;
            enum$VALUES[EnumType.lIlIlIllllIlIl[7]] = EnumType.QUARTZ;
            ENUM$VALUES = enum$VALUES;
            META_LOOKUP = new EnumType[values().length];
            final String lllllllllllllIIIIllllIlIIlIlllll;
            final String lllllllllllllIIIIllllIlIIllIIIII = (String)((EnumType[])(Object)(lllllllllllllIIIIllllIlIIlIlllll = (String)(Object)values())).length;
            double lllllllllllllIIIIllllIlIIllIIIIl = EnumType.lIlIlIllllIlIl[0];
            "".length();
            if (-(0x69 ^ 0x51 ^ (0x8 ^ 0x35)) >= 0) {
                return;
            }
            while (!lllIllllllIlIlI((int)lllllllllllllIIIIllllIlIIllIIIIl, (int)lllllllllllllIIIIllllIlIIllIIIII)) {
                final EnumType lllllllllllllIIIIllllIlIIllIIIll = lllllllllllllIIIIllllIlIIlIlllll[lllllllllllllIIIIllllIlIIllIIIIl];
                EnumType.META_LOOKUP[lllllllllllllIIIIllllIlIIllIIIll.getMetadata()] = lllllllllllllIIIIllllIlIIllIIIll;
                ++lllllllllllllIIIIllllIlIIllIIIIl;
            }
        }
        
        @Override
        public String toString() {
            return this.name;
        }
        
        @Override
        public String getName() {
            return this.name;
        }
        
        private static boolean lllIllllllIlIlI(final int lllllllllllllIIIIllllIIllllIllIl, final int lllllllllllllIIIIllllIIllllIllII) {
            return lllllllllllllIIIIllllIIllllIllIl >= lllllllllllllIIIIllllIIllllIllII;
        }
        
        private static String lllIlllllIlIllI(String lllllllllllllIIIIllllIlIIIIlIIlI, final String lllllllllllllIIIIllllIlIIIIlIIIl) {
            lllllllllllllIIIIllllIlIIIIlIIlI = new String(Base64.getDecoder().decode(lllllllllllllIIIIllllIlIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIIIllllIlIIIIlIlIl = new StringBuilder();
            final char[] lllllllllllllIIIIllllIlIIIIlIlII = lllllllllllllIIIIllllIlIIIIlIIIl.toCharArray();
            int lllllllllllllIIIIllllIlIIIIlIIll = EnumType.lIlIlIllllIlIl[0];
            final double lllllllllllllIIIIllllIlIIIIIllIl = (Object)lllllllllllllIIIIllllIlIIIIlIIlI.toCharArray();
            final float lllllllllllllIIIIllllIlIIIIIllII = lllllllllllllIIIIllllIlIIIIIllIl.length;
            float lllllllllllllIIIIllllIlIIIIIlIll = EnumType.lIlIlIllllIlIl[0];
            while (lllIllllllIllII((int)lllllllllllllIIIIllllIlIIIIIlIll, (int)lllllllllllllIIIIllllIlIIIIIllII)) {
                final char lllllllllllllIIIIllllIlIIIIllIII = lllllllllllllIIIIllllIlIIIIIllIl[lllllllllllllIIIIllllIlIIIIIlIll];
                lllllllllllllIIIIllllIlIIIIlIlIl.append((char)(lllllllllllllIIIIllllIlIIIIllIII ^ lllllllllllllIIIIllllIlIIIIlIlII[lllllllllllllIIIIllllIlIIIIlIIll % lllllllllllllIIIIllllIlIIIIlIlII.length]));
                "".length();
                ++lllllllllllllIIIIllllIlIIIIlIIll;
                ++lllllllllllllIIIIllllIlIIIIIlIll;
                "".length();
                if (((0x1D ^ 0x27 ^ (0x43 ^ 0x22)) & (187 + 95 - 113 + 68 ^ 52 + 1 - 27 + 156 ^ -" ".length())) > "   ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIIIllllIlIIIIlIlIl);
        }
        
        public int getMetadata() {
            return this.meta;
        }
        
        private static String lllIlllllIlIlll(final String lllllllllllllIIIIllllIlIIIIIIIII, final String lllllllllllllIIIIllllIIlllllllll) {
            try {
                final SecretKeySpec lllllllllllllIIIIllllIlIIIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllllIIlllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIIIllllIlIIIIIIlII = Cipher.getInstance("Blowfish");
                lllllllllllllIIIIllllIlIIIIIIlII.init(EnumType.lIlIlIllllIlIl[2], lllllllllllllIIIIllllIlIIIIIIlIl);
                return new String(lllllllllllllIIIIllllIlIIIIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllllIlIIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIIllllIlIIIIIIIll) {
                lllllllllllllIIIIllllIlIIIIIIIll.printStackTrace();
                return null;
            }
        }
        
        private EnumType(final String lllllllllllllIIIIllllIlIIlIIIIIl, final int lllllllllllllIIIIllllIlIIlIIIIII, final int lllllllllllllIIIIllllIlIIlIIIllI, final MapColor lllllllllllllIIIIllllIlIIIlllllI, final String lllllllllllllIIIIllllIlIIlIIIlII, final String lllllllllllllIIIIllllIlIIlIIIIll) {
            this.meta = lllllllllllllIIIIllllIlIIlIIIllI;
            this.field_181075_k = lllllllllllllIIIIllllIlIIIlllllI;
            this.name = lllllllllllllIIIIllllIlIIlIIIlII;
            this.unlocalizedName = lllllllllllllIIIIllllIlIIlIIIIll;
        }
        
        private static void lllIllllllIlIIl() {
            (lIlIlIllllIlIl = new int[22])[0] = ((0x28 ^ 0x2 ^ (0x66 ^ 0x1B)) & (0xD0 ^ 0xC7 ^ (0x3C ^ 0x7C) ^ -" ".length()));
            EnumType.lIlIlIllllIlIl[1] = " ".length();
            EnumType.lIlIlIllllIlIl[2] = "  ".length();
            EnumType.lIlIlIllllIlIl[3] = "   ".length();
            EnumType.lIlIlIllllIlIl[4] = (0x88 ^ 0x8C);
            EnumType.lIlIlIllllIlIl[5] = (0x5F ^ 0x2C ^ (0x9 ^ 0x7F));
            EnumType.lIlIlIllllIlIl[6] = (0x4B ^ 0x2B ^ (0xC9 ^ 0xAF));
            EnumType.lIlIlIllllIlIl[7] = (122 + 18 - 98 + 129 ^ 114 + 138 - 87 + 7);
            EnumType.lIlIlIllllIlIl[8] = (0x39 ^ 0x31);
            EnumType.lIlIlIllllIlIl[9] = (17 + 126 - 48 + 65 ^ 152 + 43 - 163 + 137);
            EnumType.lIlIlIllllIlIl[10] = (0xA7 ^ 0x92 ^ (0xB9 ^ 0x86));
            EnumType.lIlIlIllllIlIl[11] = (0x80 ^ 0x8B);
            EnumType.lIlIlIllllIlIl[12] = (93 + 71 - 149 + 188 ^ 107 + 162 - 193 + 123);
            EnumType.lIlIlIllllIlIl[13] = (0x6B ^ 0x66);
            EnumType.lIlIlIllllIlIl[14] = (0xBF ^ 0xB1);
            EnumType.lIlIlIllllIlIl[15] = (0xB4 ^ 0xAE ^ (0x1E ^ 0xB));
            EnumType.lIlIlIllllIlIl[16] = (2 + 151 - 116 + 172 ^ 151 + 64 - 90 + 68);
            EnumType.lIlIlIllllIlIl[17] = (0x54 ^ 0x45);
            EnumType.lIlIlIllllIlIl[18] = (0x8 ^ 0x1A);
            EnumType.lIlIlIllllIlIl[19] = (0x43 ^ 0x50);
            EnumType.lIlIlIllllIlIl[20] = (98 + 2 - 1 + 79 ^ 66 + 59 - 83 + 124);
            EnumType.lIlIlIllllIlIl[21] = (0x17 ^ 0x2);
        }
        
        private static void lllIllllllIlIII() {
            (lIlIlIllllIIll = new String[EnumType.lIlIlIllllIlIl[21]])[EnumType.lIlIlIllllIlIl[0]] = lllIlllllIlIlIl("nEqRqvgmkg8=", "tYETk");
            EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[1]] = lllIlllllIlIllI("FDYBOAg=", "gBnVm");
            EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[2]] = lllIlllllIlIlIl("d+JhZEha5xY=", "OtaXp");
            EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[3]] = lllIlllllIlIllI("OBMKKgM/HQor", "KrdNp");
            EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[4]] = lllIlllllIlIlIl("HJeabjVxQQ4=", "ZyQZX");
            EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[5]] = lllIlllllIlIlll("vVzqDWbFzp4=", "OHdLt");
            EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[6]] = lllIlllllIlIlll("5g6indoX3L4JwVEnPAbmGQ==", "ngBkP");
            EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[7]] = lllIlllllIlIlll("FNrB9odeA64=", "gBdZI");
            EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[8]] = lllIlllllIlIllI("DCogNB0KNjY5Hwo=", "OebvQ");
            EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[9]] = lllIlllllIlIllI("CTYgMh8PKjY/HQ8=", "jYBPs");
            EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[10]] = lllIlllllIlIlll("4TcOWog5IqY=", "MallI");
            EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[11]] = lllIlllllIlIlll("q8klrwobuVs=", "uLNuD");
            EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[12]] = lllIlllllIlIlll("mdUg5vkhrGY=", "nCxSG");
            EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[13]] = lllIlllllIlIlll("1RgjJTTPvcqeleOdX1Ycxw==", "zFJtG");
            EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[14]] = lllIlllllIlIlIl("sdZvkyUd4ZnmLsZqquigew==", "vemVZ");
            EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[15]] = lllIlllllIlIlll("DT55D4TlNzvg5iXny3AV/dbA/fwrMbav", "dHHpl");
            EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[16]] = lllIlllllIlIlll("ACqCL8e0g4pSa6r/tzxqHQ==", "trDgT");
            EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[17]] = lllIlllllIlIlIl("JIIoKKmvh/0ZfAIKGjOLqA==", "AVeWK");
            EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[18]] = lllIlllllIlIlIl("r9XleiDOli1z2t80c5f/fg==", "DrhKz");
            EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[19]] = lllIlllllIlIlll("Srhbhdeq3kk=", "YAlvy");
            EnumType.lIlIlIllllIIll[EnumType.lIlIlIllllIlIl[20]] = lllIlllllIlIlll("Fov5fg8/6Yw=", "VlDNr");
        }
        
        public MapColor func_181074_c() {
            return this.field_181075_k;
        }
        
        private static String lllIlllllIlIlIl(final String lllllllllllllIIIIllllIIlllllIIll, final String lllllllllllllIIIIllllIIlllllIlII) {
            try {
                final SecretKeySpec lllllllllllllIIIIllllIIllllllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllllIIlllllIlII.getBytes(StandardCharsets.UTF_8)), EnumType.lIlIlIllllIlIl[8]), "DES");
                final Cipher lllllllllllllIIIIllllIIlllllIlll = Cipher.getInstance("DES");
                lllllllllllllIIIIllllIIlllllIlll.init(EnumType.lIlIlIllllIlIl[2], lllllllllllllIIIIllllIIllllllIII);
                return new String(lllllllllllllIIIIllllIIlllllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllllIIlllllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIIllllIIlllllIllI) {
                lllllllllllllIIIIllllIIlllllIllI.printStackTrace();
                return null;
            }
        }
    }
}
