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
import net.minecraft.block.state.BlockState;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.StatCollector;
import net.minecraft.block.properties.PropertyEnum;

public class BlockPrismarine extends Block
{
    public static final /* synthetic */ int DARK_META;
    private static final /* synthetic */ String[] lIIIIlIIlIIIIl;
    public static final /* synthetic */ int BRICKS_META;
    private static final /* synthetic */ int[] lIIIIlIIlIIIlI;
    public static final /* synthetic */ PropertyEnum<EnumType> VARIANT;
    public static final /* synthetic */ int ROUGH_META;
    
    private static boolean lIlllIIIlIIIIII(final int lllllllllllllIlIIllIIIllIIllllII, final int lllllllllllllIlIIllIIIllIIlllIll) {
        return lllllllllllllIlIIllIIIllIIllllII < lllllllllllllIlIIllIIIllIIlllIll;
    }
    
    private static boolean lIlllIIIIllllll(final Object lllllllllllllIlIIllIIIllIIlllIII, final Object lllllllllllllIlIIllIIIllIIllIlll) {
        return lllllllllllllIlIIllIIIllIIlllIII == lllllllllllllIlIIllIIIllIIllIlll;
    }
    
    @Override
    public String getLocalizedName() {
        return StatCollector.translateToLocal(String.valueOf(new StringBuilder(String.valueOf(this.getUnlocalizedName())).append(BlockPrismarine.lIIIIlIIlIIIIl[BlockPrismarine.lIIIIlIIlIIIlI[1]]).append(EnumType.ROUGH.getUnlocalizedName()).append(BlockPrismarine.lIIIIlIIlIIIIl[BlockPrismarine.lIIIIlIIlIIIlI[2]])));
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIlIIllIIIllIllIllII) {
        return this.getDefaultState().withProperty(BlockPrismarine.VARIANT, EnumType.byMetadata(lllllllllllllIlIIllIIIllIllIllII));
    }
    
    private static void lIlllIIIIllllIl() {
        (lIIIIlIIlIIIIl = new String[BlockPrismarine.lIIIIlIIlIIIlI[3]])[BlockPrismarine.lIIIIlIIlIIIlI[0]] = lIlllIIIIlllIll("EigBJyYKPQ==", "dIsNG");
        BlockPrismarine.lIIIIlIIlIIIIl[BlockPrismarine.lIIIIlIIlIIIlI[1]] = lIlllIIIIlllIll("ZA==", "JCzHn");
        BlockPrismarine.lIIIIlIIlIIIIl[BlockPrismarine.lIIIIlIIlIIIlI[2]] = lIlllIIIIllllII("SLKWnLHeZqc=", "oRDul");
    }
    
    @Override
    public void getSubBlocks(final Item lllllllllllllIlIIllIIIllIllIlIII, final CreativeTabs lllllllllllllIlIIllIIIllIllIIlll, final List<ItemStack> lllllllllllllIlIIllIIIllIllIIllI) {
        lllllllllllllIlIIllIIIllIllIIllI.add(new ItemStack(lllllllllllllIlIIllIIIllIllIlIII, BlockPrismarine.lIIIIlIIlIIIlI[1], BlockPrismarine.ROUGH_META));
        "".length();
        lllllllllllllIlIIllIIIllIllIIllI.add(new ItemStack(lllllllllllllIlIIllIIIllIllIlIII, BlockPrismarine.lIIIIlIIlIIIlI[1], BlockPrismarine.BRICKS_META));
        "".length();
        lllllllllllllIlIIllIIIllIllIIllI.add(new ItemStack(lllllllllllllIlIIllIIIllIllIlIII, BlockPrismarine.lIIIIlIIlIIIlI[1], BlockPrismarine.DARK_META));
        "".length();
    }
    
    private static void lIlllIIIIlllllI() {
        (lIIIIlIIlIIIlI = new int[5])[0] = ((42 + 26 + 21 + 39 ^ 39 + 107 - 16 + 52) & (107 + 58 - 141 + 118 ^ 11 + 39 + 56 + 78 ^ -" ".length()));
        BlockPrismarine.lIIIIlIIlIIIlI[1] = " ".length();
        BlockPrismarine.lIIIIlIIlIIIlI[2] = "  ".length();
        BlockPrismarine.lIIIIlIIlIIIlI[3] = "   ".length();
        BlockPrismarine.lIIIIlIIlIIIlI[4] = (8 + 175 - 39 + 40 ^ 155 + 114 - 201 + 108);
    }
    
    public BlockPrismarine() {
        super(Material.rock);
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockPrismarine.VARIANT, EnumType.ROUGH));
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    @Override
    public MapColor getMapColor(final IBlockState lllllllllllllIlIIllIIIllIllllllI) {
        MapColor mapColor;
        if (lIlllIIIIllllll(lllllllllllllIlIIllIIIllIllllllI.getValue(BlockPrismarine.VARIANT), EnumType.ROUGH)) {
            mapColor = MapColor.cyanColor;
            "".length();
            if ((0x51 ^ 0x55) != (0x6C ^ 0x68)) {
                return null;
            }
        }
        else {
            mapColor = MapColor.diamondColor;
        }
        return mapColor;
    }
    
    @Override
    public int damageDropped(final IBlockState lllllllllllllIlIIllIIIllIllllIlI) {
        return lllllllllllllIlIIllIIIllIllllIlI.getValue(BlockPrismarine.VARIANT).getMetadata();
    }
    
    private static String lIlllIIIIlllIll(String lllllllllllllIlIIllIIIllIlIlIlII, final String lllllllllllllIlIIllIIIllIlIlIIll) {
        lllllllllllllIlIIllIIIllIlIlIlII = (byte)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIllIIIllIlIlIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIllIIIllIlIlIlll = new StringBuilder();
        final char[] lllllllllllllIlIIllIIIllIlIlIllI = lllllllllllllIlIIllIIIllIlIlIIll.toCharArray();
        int lllllllllllllIlIIllIIIllIlIlIlIl = BlockPrismarine.lIIIIlIIlIIIlI[0];
        final Exception lllllllllllllIlIIllIIIllIlIIllll = (Object)((String)lllllllllllllIlIIllIIIllIlIlIlII).toCharArray();
        final String lllllllllllllIlIIllIIIllIlIIlllI = (String)lllllllllllllIlIIllIIIllIlIIllll.length;
        String lllllllllllllIlIIllIIIllIlIIllIl = (String)BlockPrismarine.lIIIIlIIlIIIlI[0];
        while (lIlllIIIlIIIIII((int)lllllllllllllIlIIllIIIllIlIIllIl, (int)lllllllllllllIlIIllIIIllIlIIlllI)) {
            final char lllllllllllllIlIIllIIIllIlIllIlI = lllllllllllllIlIIllIIIllIlIIllll[lllllllllllllIlIIllIIIllIlIIllIl];
            lllllllllllllIlIIllIIIllIlIlIlll.append((char)(lllllllllllllIlIIllIIIllIlIllIlI ^ lllllllllllllIlIIllIIIllIlIlIllI[lllllllllllllIlIIllIIIllIlIlIlIl % lllllllllllllIlIIllIIIllIlIlIllI.length]));
            "".length();
            ++lllllllllllllIlIIllIIIllIlIlIlIl;
            ++lllllllllllllIlIIllIIIllIlIIllIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIllIIIllIlIlIlll);
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockPrismarine.lIIIIlIIlIIIlI[1]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockPrismarine.lIIIIlIIlIIIlI[0]] = BlockPrismarine.VARIANT;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static String lIlllIIIIllllII(final String lllllllllllllIlIIllIIIllIlIIIlII, final String lllllllllllllIlIIllIIIllIlIIIIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIllIIIllIlIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIIIllIlIIIIll.getBytes(StandardCharsets.UTF_8)), BlockPrismarine.lIIIIlIIlIIIlI[4]), "DES");
            final Cipher lllllllllllllIlIIllIIIllIlIIIllI = Cipher.getInstance("DES");
            lllllllllllllIlIIllIIIllIlIIIllI.init(BlockPrismarine.lIIIIlIIlIIIlI[2], lllllllllllllIlIIllIIIllIlIIIlll);
            return new String(lllllllllllllIlIIllIIIllIlIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIIIllIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllIIIllIlIIIlIl) {
            lllllllllllllIlIIllIIIllIlIIIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIlIIllIIIllIlllIlIl) {
        return lllllllllllllIlIIllIIIllIlllIlIl.getValue(BlockPrismarine.VARIANT).getMetadata();
    }
    
    static {
        lIlllIIIIlllllI();
        lIlllIIIIllllIl();
        VARIANT = PropertyEnum.create(BlockPrismarine.lIIIIlIIlIIIIl[BlockPrismarine.lIIIIlIIlIIIlI[0]], EnumType.class);
        ROUGH_META = EnumType.ROUGH.getMetadata();
        BRICKS_META = EnumType.BRICKS.getMetadata();
        DARK_META = EnumType.DARK.getMetadata();
    }
    
    public enum EnumType implements IStringSerializable
    {
        ROUGH(EnumType.lllIIllIlllIlI[EnumType.lllIIllIllllIl[0]], EnumType.lllIIllIllllIl[0], EnumType.lllIIllIllllIl[0], EnumType.lllIIllIlllIlI[EnumType.lllIIllIllllIl[1]], EnumType.lllIIllIlllIlI[EnumType.lllIIllIllllIl[2]]);
        
        private static final /* synthetic */ EnumType[] META_LOOKUP;
        
        DARK(EnumType.lllIIllIlllIlI[EnumType.lllIIllIllllIl[6]], EnumType.lllIIllIllllIl[2], EnumType.lllIIllIllllIl[2], EnumType.lllIIllIlllIlI[EnumType.lllIIllIllllIl[7]], EnumType.lllIIllIlllIlI[EnumType.lllIIllIllllIl[8]]);
        
        private static final /* synthetic */ String[] lllIIllIlllIlI;
        private final /* synthetic */ String unlocalizedName;
        
        BRICKS(EnumType.lllIIllIlllIlI[EnumType.lllIIllIllllIl[3]], EnumType.lllIIllIllllIl[1], EnumType.lllIIllIllllIl[1], EnumType.lllIIllIlllIlI[EnumType.lllIIllIllllIl[4]], EnumType.lllIIllIlllIlI[EnumType.lllIIllIllllIl[5]]);
        
        private final /* synthetic */ int meta;
        private static final /* synthetic */ int[] lllIIllIllllIl;
        private final /* synthetic */ String name;
        
        private static boolean lIlIIIIIlIIlIIII(final int llllllllllllIlIlllIlllIlIIlIllIl, final int llllllllllllIlIlllIlllIlIIlIllII) {
            return llllllllllllIlIlllIlllIlIIlIllIl < llllllllllllIlIlllIlllIlIIlIllII;
        }
        
        @Override
        public String getName() {
            return this.name;
        }
        
        private static String lIlIIIIIlIIIIlll(String llllllllllllIlIlllIlllIlIlIIlIIl, final String llllllllllllIlIlllIlllIlIlIIllIl) {
            llllllllllllIlIlllIlllIlIlIIlIIl = new String(Base64.getDecoder().decode(llllllllllllIlIlllIlllIlIlIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlIlllIlllIlIlIIllII = new StringBuilder();
            final char[] llllllllllllIlIlllIlllIlIlIIlIll = llllllllllllIlIlllIlllIlIlIIllIl.toCharArray();
            int llllllllllllIlIlllIlllIlIlIIlIlI = EnumType.lllIIllIllllIl[0];
            final char llllllllllllIlIlllIlllIlIlIIIlII = (Object)llllllllllllIlIlllIlllIlIlIIlIIl.toCharArray();
            final long llllllllllllIlIlllIlllIlIlIIIIll = llllllllllllIlIlllIlllIlIlIIIlII.length;
            byte llllllllllllIlIlllIlllIlIlIIIIlI = (byte)EnumType.lllIIllIllllIl[0];
            while (lIlIIIIIlIIlIIII(llllllllllllIlIlllIlllIlIlIIIIlI, (int)llllllllllllIlIlllIlllIlIlIIIIll)) {
                final char llllllllllllIlIlllIlllIlIlIIllll = llllllllllllIlIlllIlllIlIlIIIlII[llllllllllllIlIlllIlllIlIlIIIIlI];
                llllllllllllIlIlllIlllIlIlIIllII.append((char)(llllllllllllIlIlllIlllIlIlIIllll ^ llllllllllllIlIlllIlllIlIlIIlIll[llllllllllllIlIlllIlllIlIlIIlIlI % llllllllllllIlIlllIlllIlIlIIlIll.length]));
                "".length();
                ++llllllllllllIlIlllIlllIlIlIIlIlI;
                ++llllllllllllIlIlllIlllIlIlIIIIlI;
                "".length();
                if ((0x39 ^ 0x3C) <= 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlIlllIlllIlIlIIllII);
        }
        
        private static String lIlIIIIIlIIIIllI(final String llllllllllllIlIlllIlllIlIlIlllII, final String llllllllllllIlIlllIlllIlIlIllIll) {
            try {
                final SecretKeySpec llllllllllllIlIlllIlllIlIllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIlllIlIlIllIll.getBytes(StandardCharsets.UTF_8)), EnumType.lllIIllIllllIl[8]), "DES");
                final Cipher llllllllllllIlIlllIlllIlIllIIIII = Cipher.getInstance("DES");
                llllllllllllIlIlllIlllIlIllIIIII.init(EnumType.lllIIllIllllIl[2], llllllllllllIlIlllIlllIlIllIIIIl);
                return new String(llllllllllllIlIlllIlllIlIllIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIlllIlIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIlllIlllIlIlIlllll) {
                llllllllllllIlIlllIlllIlIlIlllll.printStackTrace();
                return null;
            }
        }
        
        private static void lIlIIIIIlIIIlIII() {
            (lllIIllIlllIlI = new String[EnumType.lllIIllIllllIl[9]])[EnumType.lllIIllIllllIl[0]] = lIlIIIIIlIIIIlII("zGYxpzXDKiY=", "llqpx");
            EnumType.lllIIllIlllIlI[EnumType.lllIIllIllllIl[1]] = lIlIIIIIlIIIIlII("wbstYqahz6UaYxuxVDy01A==", "AEZwL");
            EnumType.lllIIllIlllIlI[EnumType.lllIIllIllllIl[2]] = lIlIIIIIlIIIIlII("Y1qscTukNJY=", "YpsUB");
            EnumType.lllIIllIlllIlI[EnumType.lllIIllIllllIl[3]] = lIlIIIIIlIIIIllI("nn/q0e/AeBs=", "urDBS");
            EnumType.lllIIllIlllIlI[EnumType.lllIIllIllllIl[4]] = lIlIIIIIlIIIIlll("HQsHGScMCwcELzIbHAMpBgo=", "mynjJ");
            EnumType.lllIIllIlllIlI[EnumType.lllIIllIllllIl[5]] = lIlIIIIIlIIIIlII("eDsgUuwqzPc=", "kzQGE");
            EnumType.lllIIllIlllIlI[EnumType.lllIIllIllllIl[6]] = lIlIIIIIlIIIIlll("CyQFGg==", "OeWQu");
            EnumType.lllIIllIlllIlI[EnumType.lllIIllIllllIl[7]] = lIlIIIIIlIIIIlll("AA41ExUUHS4LJwUdLhYv", "doGxJ");
            EnumType.lllIIllIlllIlI[EnumType.lllIIllIllllIl[8]] = lIlIIIIIlIIIIllI("ddlq7ypkP0c=", "EYylK");
        }
        
        private static String lIlIIIIIlIIIIlII(final String llllllllllllIlIlllIlllIlIIllIlll, final String llllllllllllIlIlllIlllIlIIlllIII) {
            try {
                final SecretKeySpec llllllllllllIlIlllIlllIlIIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIlllIlIIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlIlllIlllIlIIlllIll = Cipher.getInstance("Blowfish");
                llllllllllllIlIlllIlllIlIIlllIll.init(EnumType.lllIIllIllllIl[2], llllllllllllIlIlllIlllIlIIllllII);
                return new String(llllllllllllIlIlllIlllIlIIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIlllIlIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIlllIlllIlIIlllIlI) {
                llllllllllllIlIlllIlllIlIIlllIlI.printStackTrace();
                return null;
            }
        }
        
        private static void lIlIIIIIlIIIllIl() {
            (lllIIllIllllIl = new int[10])[0] = ((35 + 161 - 83 + 104 ^ 0 + 59 + 66 + 15) & (0x30 ^ 0x13 ^ (0x46 ^ 0x30) ^ -" ".length()));
            EnumType.lllIIllIllllIl[1] = " ".length();
            EnumType.lllIIllIllllIl[2] = "  ".length();
            EnumType.lllIIllIllllIl[3] = "   ".length();
            EnumType.lllIIllIllllIl[4] = (0x4C ^ 0x48);
            EnumType.lllIIllIllllIl[5] = (9 + 16 + 90 + 55 ^ 41 + 137 - 120 + 117);
            EnumType.lllIIllIllllIl[6] = (0x1B ^ 0x1D);
            EnumType.lllIIllIllllIl[7] = (0x70 ^ 0x40 ^ (0xB5 ^ 0x82));
            EnumType.lllIIllIllllIl[8] = (0xCF ^ 0xC7);
            EnumType.lllIIllIllllIl[9] = (0x1D ^ 0x14);
        }
        
        public static EnumType byMetadata(int llllllllllllIlIlllIlllIlIlllIlII) {
            if (!lIlIIIIIlIIIllll(llllllllllllIlIlllIlllIlIlllIlII) || lIlIIIIIlIIIlllI(llllllllllllIlIlllIlllIlIlllIlII, EnumType.META_LOOKUP.length)) {
                llllllllllllIlIlllIlllIlIlllIlII = EnumType.lllIIllIllllIl[0];
            }
            return EnumType.META_LOOKUP[llllllllllllIlIlllIlllIlIlllIlII];
        }
        
        @Override
        public String toString() {
            return this.name;
        }
        
        public int getMetadata() {
            return this.meta;
        }
        
        private EnumType(final String llllllllllllIlIlllIlllIllIIIIIIl, final int llllllllllllIlIlllIlllIllIIIIIII, final int llllllllllllIlIlllIlllIlIlllllll, final String llllllllllllIlIlllIlllIlIllllllI, final String llllllllllllIlIlllIlllIllIIIIIll) {
            this.meta = llllllllllllIlIlllIlllIlIlllllll;
            this.name = llllllllllllIlIlllIlllIlIllllllI;
            this.unlocalizedName = llllllllllllIlIlllIlllIllIIIIIll;
        }
        
        private static boolean lIlIIIIIlIIIlllI(final int llllllllllllIlIlllIlllIlIIllIIIl, final int llllllllllllIlIlllIlllIlIIllIIII) {
            return llllllllllllIlIlllIlllIlIIllIIIl >= llllllllllllIlIlllIlllIlIIllIIII;
        }
        
        static {
            lIlIIIIIlIIIllIl();
            lIlIIIIIlIIIlIII();
            final EnumType[] enum$VALUES = new EnumType[EnumType.lllIIllIllllIl[3]];
            enum$VALUES[EnumType.lllIIllIllllIl[0]] = EnumType.ROUGH;
            enum$VALUES[EnumType.lllIIllIllllIl[1]] = EnumType.BRICKS;
            enum$VALUES[EnumType.lllIIllIllllIl[2]] = EnumType.DARK;
            ENUM$VALUES = enum$VALUES;
            META_LOOKUP = new EnumType[values().length];
            final byte llllllllllllIlIlllIlllIllIIlIIIl;
            final short llllllllllllIlIlllIlllIllIIlIIll = (short)((EnumType[])(Object)(llllllllllllIlIlllIlllIllIIlIIIl = (byte)(Object)values())).length;
            double llllllllllllIlIlllIlllIllIIlIlIl = EnumType.lllIIllIllllIl[0];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIlIIIIIlIIIlllI((int)llllllllllllIlIlllIlllIllIIlIlIl, llllllllllllIlIlllIlllIllIIlIIll)) {
                final EnumType llllllllllllIlIlllIlllIllIIllIIl = llllllllllllIlIlllIlllIllIIlIIIl[llllllllllllIlIlllIlllIllIIlIlIl];
                EnumType.META_LOOKUP[llllllllllllIlIlllIlllIllIIllIIl.getMetadata()] = llllllllllllIlIlllIlllIllIIllIIl;
                ++llllllllllllIlIlllIlllIllIIlIlIl;
            }
        }
        
        private static boolean lIlIIIIIlIIIllll(final int llllllllllllIlIlllIlllIlIIlIlIlI) {
            return llllllllllllIlIlllIlllIlIIlIlIlI >= 0;
        }
        
        public String getUnlocalizedName() {
            return this.unlocalizedName;
        }
    }
}
