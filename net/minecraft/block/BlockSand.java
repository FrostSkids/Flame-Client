// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Arrays;
import net.minecraft.util.IStringSerializable;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.block.properties.PropertyEnum;

public class BlockSand extends BlockFalling
{
    private static final /* synthetic */ String[] llIIlIlIIlIlII;
    private static final /* synthetic */ int[] llIIlIlIIlIlIl;
    public static final /* synthetic */ PropertyEnum<EnumType> VARIANT;
    
    private static void lIIIllIIllllIIlI() {
        (llIIlIlIIlIlII = new String[BlockSand.llIIlIlIIlIlIl[1]])[BlockSand.llIIlIlIIlIlIl[0]] = lIIIllIIllllIIIl("D70QGp5UMe4=", "Ebmdq");
    }
    
    @Override
    public void getSubBlocks(final Item llllllllllllIlllIIIlllllIIlIIIIl, final CreativeTabs llllllllllllIlllIIIlllllIIlIIlII, final List<ItemStack> llllllllllllIlllIIIlllllIIlIIIII) {
        final char llllllllllllIlllIIIlllllIIIlllII;
        final double llllllllllllIlllIIIlllllIIIlllIl = ((EnumType[])(Object)(llllllllllllIlllIIIlllllIIIlllII = (char)(Object)EnumType.values())).length;
        byte llllllllllllIlllIIIlllllIIIllllI = (byte)BlockSand.llIIlIlIIlIlIl[0];
        "".length();
        if (((0x92 ^ 0x88) & ~(0x79 ^ 0x63)) != 0x0) {
            return;
        }
        while (!lIIIllIIllllIlII(llllllllllllIlllIIIlllllIIIllllI, (int)llllllllllllIlllIIIlllllIIIlllIl)) {
            final EnumType llllllllllllIlllIIIlllllIIlIIIlI = llllllllllllIlllIIIlllllIIIlllII[llllllllllllIlllIIIlllllIIIllllI];
            llllllllllllIlllIIIlllllIIlIIIII.add(new ItemStack(llllllllllllIlllIIIlllllIIlIIIIl, BlockSand.llIIlIlIIlIlIl[1], llllllllllllIlllIIIlllllIIlIIIlI.getMetadata()));
            "".length();
            ++llllllllllllIlllIIIlllllIIIllllI;
        }
    }
    
    private static boolean lIIIllIIllllIlII(final int llllllllllllIlllIIIllllIlllllIll, final int llllllllllllIlllIIIllllIlllllIlI) {
        return llllllllllllIlllIIIllllIlllllIll >= llllllllllllIlllIIIllllIlllllIlI;
    }
    
    private static void lIIIllIIllllIIll() {
        (llIIlIlIIlIlIl = new int[3])[0] = ((0xA5 ^ 0xB9 ^ (0x66 ^ 0x6F)) & (0x27 ^ 0x34 ^ (0xF ^ 0x9) ^ -" ".length()));
        BlockSand.llIIlIlIIlIlIl[1] = " ".length();
        BlockSand.llIIlIlIIlIlIl[2] = "  ".length();
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIlllIIIlllllIIIlIIlI) {
        return this.getDefaultState().withProperty(BlockSand.VARIANT, EnumType.byMetadata(llllllllllllIlllIIIlllllIIIlIIlI));
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockSand.llIIlIlIIlIlIl[1]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockSand.llIIlIlIIlIlIl[0]] = BlockSand.VARIANT;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    static {
        lIIIllIIllllIIll();
        lIIIllIIllllIIlI();
        VARIANT = PropertyEnum.create(BlockSand.llIIlIlIIlIlII[BlockSand.llIIlIlIIlIlIl[0]], EnumType.class);
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIlllIIIlllllIIIIlllI) {
        return llllllllllllIlllIIIlllllIIIIlllI.getValue(BlockSand.VARIANT).getMetadata();
    }
    
    @Override
    public int damageDropped(final IBlockState llllllllllllIlllIIIlllllIIlIllIl) {
        return llllllllllllIlllIIIlllllIIlIllIl.getValue(BlockSand.VARIANT).getMetadata();
    }
    
    @Override
    public MapColor getMapColor(final IBlockState llllllllllllIlllIIIlllllIIIllIII) {
        return llllllllllllIlllIIIlllllIIIllIII.getValue(BlockSand.VARIANT).getMapColor();
    }
    
    private static String lIIIllIIllllIIIl(final String llllllllllllIlllIIIlllllIIIIIIll, final String llllllllllllIlllIIIlllllIIIIIIlI) {
        try {
            final SecretKeySpec llllllllllllIlllIIIlllllIIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIlllllIIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIIlllllIIIIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIIlllllIIIIIlIl.init(BlockSand.llIIlIlIIlIlIl[2], llllllllllllIlllIIIlllllIIIIIllI);
            return new String(llllllllllllIlllIIIlllllIIIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIlllllIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIlllllIIIIIlII) {
            llllllllllllIlllIIIlllllIIIIIlII.printStackTrace();
            return null;
        }
    }
    
    public BlockSand() {
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockSand.VARIANT, EnumType.SAND));
    }
    
    public enum EnumType implements IStringSerializable
    {
        SAND(EnumType.lIIlllIlllIlll[EnumType.lIIlllIllllIIl[0]], EnumType.lIIlllIllllIIl[0], EnumType.lIIlllIllllIIl[0], EnumType.lIIlllIlllIlll[EnumType.lIIlllIllllIIl[1]], EnumType.lIIlllIlllIlll[EnumType.lIIlllIllllIIl[2]], MapColor.sandColor);
        
        private final /* synthetic */ int meta;
        
        RED_SAND(EnumType.lIIlllIlllIlll[EnumType.lIIlllIllllIIl[3]], EnumType.lIIlllIllllIIl[1], EnumType.lIIlllIllllIIl[1], EnumType.lIIlllIlllIlll[EnumType.lIIlllIllllIIl[4]], EnumType.lIIlllIlllIlll[EnumType.lIIlllIllllIIl[5]], MapColor.adobeColor);
        
        private final /* synthetic */ String name;
        private final /* synthetic */ MapColor mapColor;
        private static final /* synthetic */ String[] lIIlllIlllIlll;
        private static final /* synthetic */ EnumType[] META_LOOKUP;
        private static final /* synthetic */ int[] lIIlllIllllIIl;
        private final /* synthetic */ String unlocalizedName;
        
        public int getMetadata() {
            return this.meta;
        }
        
        private static String llIlllIIlIIllIl(String lllllllllllllIIlIIllIlIIllIIIllI, final String lllllllllllllIIlIIllIlIIllIIlIlI) {
            lllllllllllllIIlIIllIlIIllIIIllI = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIllIlIIllIIIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIlIIllIlIIllIIlIIl = new StringBuilder();
            final char[] lllllllllllllIIlIIllIlIIllIIlIII = lllllllllllllIIlIIllIlIIllIIlIlI.toCharArray();
            int lllllllllllllIIlIIllIlIIllIIIlll = EnumType.lIIlllIllllIIl[0];
            final Exception lllllllllllllIIlIIllIlIIllIIIIIl = (Object)((String)lllllllllllllIIlIIllIlIIllIIIllI).toCharArray();
            final boolean lllllllllllllIIlIIllIlIIllIIIIII = lllllllllllllIIlIIllIlIIllIIIIIl.length != 0;
            double lllllllllllllIIlIIllIlIIlIllllll = EnumType.lIIlllIllllIIl[0];
            while (llIlllIIlIlIllI((int)lllllllllllllIIlIIllIlIIlIllllll, lllllllllllllIIlIIllIlIIllIIIIII ? 1 : 0)) {
                final char lllllllllllllIIlIIllIlIIllIIllII = lllllllllllllIIlIIllIlIIllIIIIIl[lllllllllllllIIlIIllIlIIlIllllll];
                lllllllllllllIIlIIllIlIIllIIlIIl.append((char)(lllllllllllllIIlIIllIlIIllIIllII ^ lllllllllllllIIlIIllIlIIllIIlIII[lllllllllllllIIlIIllIlIIllIIIlll % lllllllllllllIIlIIllIlIIllIIlIII.length]));
                "".length();
                ++lllllllllllllIIlIIllIlIIllIIIlll;
                ++lllllllllllllIIlIIllIlIIlIllllll;
                "".length();
                if ((0x3B ^ 0x45 ^ (0x59 ^ 0x22)) <= 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIlIIllIlIIllIIlIIl);
        }
        
        private static String llIlllIIlIIlIll(final String lllllllllllllIIlIIllIlIIlllIlIII, final String lllllllllllllIIlIIllIlIIlllIIlll) {
            try {
                final SecretKeySpec lllllllllllllIIlIIllIlIIlllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIllIlIIlllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlIIllIlIIlllIlIlI = Cipher.getInstance("Blowfish");
                lllllllllllllIIlIIllIlIIlllIlIlI.init(EnumType.lIIlllIllllIIl[2], lllllllllllllIIlIIllIlIIlllIlIll);
                return new String(lllllllllllllIIlIIllIlIIlllIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIllIlIIlllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIIllIlIIlllIlIIl) {
                lllllllllllllIIlIIllIlIIlllIlIIl.printStackTrace();
                return null;
            }
        }
        
        public String getUnlocalizedName() {
            return this.unlocalizedName;
        }
        
        private EnumType(final String lllllllllllllIIlIIllIlIlIIIlIlII, final int lllllllllllllIIlIIllIlIlIIIlIIlI, final int lllllllllllllIIlIIllIlIlIIIlIIIl, final String lllllllllllllIIlIIllIlIlIIIllIll, final String lllllllllllllIIlIIllIlIlIIIllIIl, final MapColor lllllllllllllIIlIIllIlIlIIIIllII) {
            this.meta = lllllllllllllIIlIIllIlIlIIIlIIIl;
            this.name = lllllllllllllIIlIIllIlIlIIIllIll;
            this.mapColor = lllllllllllllIIlIIllIlIlIIIIllII;
            this.unlocalizedName = lllllllllllllIIlIIllIlIlIIIllIIl;
        }
        
        private static boolean llIlllIIlIlIlIl(final int lllllllllllllIIlIIllIlIIlIllIlII) {
            return lllllllllllllIIlIIllIlIIlIllIlII >= 0;
        }
        
        static {
            llIlllIIlIlIIll();
            llIlllIIlIIlllI();
            final EnumType[] enum$VALUES = new EnumType[EnumType.lIIlllIllllIIl[2]];
            enum$VALUES[EnumType.lIIlllIllllIIl[0]] = EnumType.SAND;
            enum$VALUES[EnumType.lIIlllIllllIIl[1]] = EnumType.RED_SAND;
            ENUM$VALUES = enum$VALUES;
            META_LOOKUP = new EnumType[values().length];
            final long lllllllllllllIIlIIllIlIlIIlIllll;
            final double lllllllllllllIIlIIllIlIlIIllIIIl = ((EnumType[])(Object)(lllllllllllllIIlIIllIlIlIIlIllll = (long)(Object)values())).length;
            String lllllllllllllIIlIIllIlIlIIllIIll = (String)EnumType.lIIlllIllllIIl[0];
            "".length();
            if ("   ".length() == 0) {
                return;
            }
            while (!llIlllIIlIlIlII((int)lllllllllllllIIlIIllIlIlIIllIIll, (int)lllllllllllllIIlIIllIlIlIIllIIIl)) {
                final EnumType lllllllllllllIIlIIllIlIlIIlllIIl = lllllllllllllIIlIIllIlIlIIlIllll[lllllllllllllIIlIIllIlIlIIllIIll];
                EnumType.META_LOOKUP[lllllllllllllIIlIIllIlIlIIlllIIl.getMetadata()] = lllllllllllllIIlIIllIlIlIIlllIIl;
                ++lllllllllllllIIlIIllIlIlIIllIIll;
            }
        }
        
        private static String llIlllIIlIIlIlI(final String lllllllllllllIIlIIllIlIIllIllIIl, final String lllllllllllllIIlIIllIlIIllIllIlI) {
            try {
                final SecretKeySpec lllllllllllllIIlIIllIlIIllIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIllIlIIllIllIlI.getBytes(StandardCharsets.UTF_8)), EnumType.lIIlllIllllIIl[7]), "DES");
                final Cipher lllllllllllllIIlIIllIlIIllIlllIl = Cipher.getInstance("DES");
                lllllllllllllIIlIIllIlIIllIlllIl.init(EnumType.lIIlllIllllIIl[2], lllllllllllllIIlIIllIlIIllIllllI);
                return new String(lllllllllllllIIlIIllIlIIllIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIllIlIIllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIIllIlIIllIlllII) {
                lllllllllllllIIlIIllIlIIllIlllII.printStackTrace();
                return null;
            }
        }
        
        public static EnumType byMetadata(int lllllllllllllIIlIIllIlIIlllllllI) {
            if (!llIlllIIlIlIlIl(lllllllllllllIIlIIllIlIIlllllllI) || llIlllIIlIlIlII(lllllllllllllIIlIIllIlIIlllllllI, EnumType.META_LOOKUP.length)) {
                lllllllllllllIIlIIllIlIIlllllllI = EnumType.lIIlllIllllIIl[0];
            }
            return EnumType.META_LOOKUP[lllllllllllllIIlIIllIlIIlllllllI];
        }
        
        public MapColor getMapColor() {
            return this.mapColor;
        }
        
        private static void llIlllIIlIlIIll() {
            (lIIlllIllllIIl = new int[8])[0] = ((0x6A ^ 0x6F) & ~(0x9 ^ 0xC));
            EnumType.lIIlllIllllIIl[1] = " ".length();
            EnumType.lIIlllIllllIIl[2] = "  ".length();
            EnumType.lIIlllIllllIIl[3] = "   ".length();
            EnumType.lIIlllIllllIIl[4] = (0xAD ^ 0xA9);
            EnumType.lIIlllIllllIIl[5] = (0x80 ^ 0x85);
            EnumType.lIIlllIllllIIl[6] = (0x94 ^ 0xBF ^ (0xBA ^ 0x97));
            EnumType.lIIlllIllllIIl[7] = (0x8C ^ 0x84);
        }
        
        private static boolean llIlllIIlIlIllI(final int lllllllllllllIIlIIllIlIIlIllIlll, final int lllllllllllllIIlIIllIlIIlIllIllI) {
            return lllllllllllllIIlIIllIlIIlIllIlll < lllllllllllllIIlIIllIlIIlIllIllI;
        }
        
        @Override
        public String toString() {
            return this.name;
        }
        
        private static boolean llIlllIIlIlIlII(final int lllllllllllllIIlIIllIlIIlIlllIll, final int lllllllllllllIIlIIllIlIIlIlllIlI) {
            return lllllllllllllIIlIIllIlIIlIlllIll >= lllllllllllllIIlIIllIlIIlIlllIlI;
        }
        
        @Override
        public String getName() {
            return this.name;
        }
        
        private static void llIlllIIlIIlllI() {
            (lIIlllIlllIlll = new String[EnumType.lIIlllIllllIIl[6]])[EnumType.lIIlllIllllIIl[0]] = llIlllIIlIIlIlI("13YYNO7QNw4=", "KNrnY");
            EnumType.lIIlllIlllIlll[EnumType.lIIlllIllllIIl[1]] = llIlllIIlIIlIll("YgQ/nYli3XQ=", "wiqZg");
            EnumType.lIIlllIlllIlll[EnumType.lIIlllIllllIIl[2]] = llIlllIIlIIllIl("LiAPLSQmMQ==", "JEiLQ");
            EnumType.lIIlllIlllIlll[EnumType.lIIlllIllllIIl[3]] = llIlllIIlIIlIlI("DkV/dUeZ50XiRlctsirVXg==", "kJyPi");
            EnumType.lIIlllIlllIlll[EnumType.lIIlllIllllIIl[4]] = llIlllIIlIIlIlI("8BH4PgECgFi2BipU8K3LvA==", "DTuiu");
            EnumType.lIIlllIlllIlll[EnumType.lIIlllIllllIIl[5]] = llIlllIIlIIllIl("FQQl", "gaAqi");
        }
    }
}
