// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.IStringSerializable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.material.MapColor;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyEnum;

public class BlockSandStone extends Block
{
    private static final /* synthetic */ String[] lIlIIIIIlllIII;
    private static final /* synthetic */ int[] lIlIIIIIlllIIl;
    public static final /* synthetic */ PropertyEnum<EnumType> TYPE;
    
    private static boolean lllIIIIIllllIIl(final int lllllllllllllIIlIIIIllIlllIIllll, final int lllllllllllllIIlIIIIllIlllIIlllI) {
        return lllllllllllllIIlIIIIllIlllIIllll >= lllllllllllllIIlIIIIllIlllIIlllI;
    }
    
    static {
        lllIIIIIllllIII();
        lllIIIIIlllIlll();
        TYPE = PropertyEnum.create(BlockSandStone.lIlIIIIIlllIII[BlockSandStone.lIlIIIIIlllIIl[0]], EnumType.class);
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIlIIIIllIllllIIIll) {
        return lllllllllllllIIlIIIIllIllllIIIll.getValue(BlockSandStone.TYPE).getMetadata();
    }
    
    @Override
    public void getSubBlocks(final Item lllllllllllllIIlIIIIllIlllllIIll, final CreativeTabs lllllllllllllIIlIIIIllIlllllIllI, final List<ItemStack> lllllllllllllIIlIIIIllIlllllIIlI) {
        final short lllllllllllllIIlIIIIllIllllIlllI;
        final int lllllllllllllIIlIIIIllIllllIllll = ((EnumType[])(Object)(lllllllllllllIIlIIIIllIllllIlllI = (short)(Object)EnumType.values())).length;
        Exception lllllllllllllIIlIIIIllIlllllIIII = (Exception)BlockSandStone.lIlIIIIIlllIIl[0];
        "".length();
        if (" ".length() < 0) {
            return;
        }
        while (!lllIIIIIllllIIl((int)lllllllllllllIIlIIIIllIlllllIIII, lllllllllllllIIlIIIIllIllllIllll)) {
            final EnumType lllllllllllllIIlIIIIllIlllllIlII = lllllllllllllIIlIIIIllIllllIlllI[lllllllllllllIIlIIIIllIlllllIIII];
            lllllllllllllIIlIIIIllIlllllIIlI.add(new ItemStack(lllllllllllllIIlIIIIllIlllllIIll, BlockSandStone.lIlIIIIIlllIIl[1], lllllllllllllIIlIIIIllIlllllIlII.getMetadata()));
            "".length();
            ++lllllllllllllIIlIIIIllIlllllIIII;
        }
    }
    
    private static String lllIIIIIlllIlIl(final String lllllllllllllIIlIIIIllIlllIlIlIl, final String lllllllllllllIIlIIIIllIlllIlIllI) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIIllIlllIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIllIlllIlIllI.getBytes(StandardCharsets.UTF_8)), BlockSandStone.lIlIIIIIlllIIl[2]), "DES");
            final Cipher lllllllllllllIIlIIIIllIlllIllIIl = Cipher.getInstance("DES");
            lllllllllllllIIlIIIIllIlllIllIIl.init(BlockSandStone.lIlIIIIIlllIIl[3], lllllllllllllIIlIIIIllIlllIllIlI);
            return new String(lllllllllllllIIlIIIIllIlllIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIllIlllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIIllIlllIllIII) {
            lllllllllllllIIlIIIIllIlllIllIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIlIIIIllIllllIlIII) {
        return this.getDefaultState().withProperty(BlockSandStone.TYPE, EnumType.byMetadata(lllllllllllllIIlIIIIllIllllIlIII));
    }
    
    @Override
    public MapColor getMapColor(final IBlockState lllllllllllllIIlIIIIllIllllIllII) {
        return MapColor.sandColor;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockSandStone.lIlIIIIIlllIIl[1]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockSandStone.lIlIIIIIlllIIl[0]] = BlockSandStone.TYPE;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public int damageDropped(final IBlockState lllllllllllllIIlIIIIlllIIIIIIIII) {
        return lllllllllllllIIlIIIIlllIIIIIIIII.getValue(BlockSandStone.TYPE).getMetadata();
    }
    
    private static void lllIIIIIllllIII() {
        (lIlIIIIIlllIIl = new int[4])[0] = ((0x11 ^ 0x2B) & ~(0x86 ^ 0xBC));
        BlockSandStone.lIlIIIIIlllIIl[1] = " ".length();
        BlockSandStone.lIlIIIIIlllIIl[2] = (59 + 135 - 121 + 64 ^ 17 + 59 - 11 + 64);
        BlockSandStone.lIlIIIIIlllIIl[3] = "  ".length();
    }
    
    public BlockSandStone() {
        super(Material.rock);
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockSandStone.TYPE, EnumType.DEFAULT));
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    private static void lllIIIIIlllIlll() {
        (lIlIIIIIlllIII = new String[BlockSandStone.lIlIIIIIlllIIl[1]])[BlockSandStone.lIlIIIIIlllIIl[0]] = lllIIIIIlllIlIl("6xBnO6lHa0k=", "kCorC");
    }
    
    public enum EnumType implements IStringSerializable
    {
        private final /* synthetic */ int metadata;
        private static final /* synthetic */ String[] lIlIIlIIIlIllI;
        private static final /* synthetic */ int[] lIlIIlIIlIIlII;
        private static final /* synthetic */ EnumType[] META_LOOKUP;
        
        DEFAULT(EnumType.lIlIIlIIIlIllI[EnumType.lIlIIlIIlIIlII[0]], EnumType.lIlIIlIIlIIlII[0], EnumType.lIlIIlIIlIIlII[0], EnumType.lIlIIlIIIlIllI[EnumType.lIlIIlIIlIIlII[1]], EnumType.lIlIIlIIIlIllI[EnumType.lIlIIlIIlIIlII[2]]);
        
        private final /* synthetic */ String name;
        
        CHISELED(EnumType.lIlIIlIIIlIllI[EnumType.lIlIIlIIlIIlII[3]], EnumType.lIlIIlIIlIIlII[1], EnumType.lIlIIlIIlIIlII[1], EnumType.lIlIIlIIIlIllI[EnumType.lIlIIlIIlIIlII[4]], EnumType.lIlIIlIIIlIllI[EnumType.lIlIIlIIlIIlII[5]]);
        
        private final /* synthetic */ String unlocalizedName;
        
        SMOOTH(EnumType.lIlIIlIIIlIllI[EnumType.lIlIIlIIlIIlII[6]], EnumType.lIlIIlIIlIIlII[2], EnumType.lIlIIlIIlIIlII[2], EnumType.lIlIIlIIIlIllI[EnumType.lIlIIlIIlIIlII[7]], EnumType.lIlIIlIIIlIllI[EnumType.lIlIIlIIlIIlII[8]]);
        
        private static void lllIIlIlIllllII() {
            (lIlIIlIIlIIlII = new int[10])[0] = ((0x6 ^ 0x33) & ~(0x24 ^ 0x11));
            EnumType.lIlIIlIIlIIlII[1] = " ".length();
            EnumType.lIlIIlIIlIIlII[2] = "  ".length();
            EnumType.lIlIIlIIlIIlII[3] = "   ".length();
            EnumType.lIlIIlIIlIIlII[4] = (0x4B ^ 0x4F);
            EnumType.lIlIIlIIlIIlII[5] = (0xE ^ 0xB);
            EnumType.lIlIIlIIlIIlII[6] = (0x3E ^ 0x38);
            EnumType.lIlIIlIIlIIlII[7] = (0x4C ^ 0x4B);
            EnumType.lIlIIlIIlIIlII[8] = (0x21 ^ 0x29);
            EnumType.lIlIIlIIlIIlII[9] = (0x35 ^ 0x65 ^ (0x7 ^ 0x5E));
        }
        
        private static boolean lllIIlIlIllllll(final int lllllllllllllIIIlllIIIIlllllIlII, final int lllllllllllllIIIlllIIIIlllllIIll) {
            return lllllllllllllIIIlllIIIIlllllIlII < lllllllllllllIIIlllIIIIlllllIIll;
        }
        
        static {
            lllIIlIlIllllII();
            lllIIlIlIIllIII();
            final EnumType[] enum$VALUES = new EnumType[EnumType.lIlIIlIIlIIlII[3]];
            enum$VALUES[EnumType.lIlIIlIIlIIlII[0]] = EnumType.DEFAULT;
            enum$VALUES[EnumType.lIlIIlIIlIIlII[1]] = EnumType.CHISELED;
            enum$VALUES[EnumType.lIlIIlIIlIIlII[2]] = EnumType.SMOOTH;
            ENUM$VALUES = enum$VALUES;
            META_LOOKUP = new EnumType[values().length];
            final boolean lllllllllllllIIIlllIIIlIIlIllIll;
            final float lllllllllllllIIIlllIIIlIIlIlllIl = ((EnumType[])(Object)(lllllllllllllIIIlllIIIlIIlIllIll = (boolean)(Object)values())).length;
            String lllllllllllllIIIlllIIIlIIlIlllll = (String)EnumType.lIlIIlIIlIIlII[0];
            "".length();
            if (-" ".length() > "  ".length()) {
                return;
            }
            while (!lllIIlIlIllllIl((int)lllllllllllllIIIlllIIIlIIlIlllll, (int)lllllllllllllIIIlllIIIlIIlIlllIl)) {
                final EnumType lllllllllllllIIIlllIIIlIIllIIIlI = lllllllllllllIIIlllIIIlIIlIllIll[lllllllllllllIIIlllIIIlIIlIlllll];
                EnumType.META_LOOKUP[lllllllllllllIIIlllIIIlIIllIIIlI.getMetadata()] = lllllllllllllIIIlllIIIlIIllIIIlI;
                ++lllllllllllllIIIlllIIIlIIlIlllll;
            }
        }
        
        private static String lllIIlIlIIlIIll(String lllllllllllllIIIlllIIIlIIIIIIIll, final String lllllllllllllIIIlllIIIlIIIIIIlll) {
            lllllllllllllIIIlllIIIlIIIIIIIll = new String(Base64.getDecoder().decode(lllllllllllllIIIlllIIIlIIIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIIlllIIIlIIIIIIllI = new StringBuilder();
            final char[] lllllllllllllIIIlllIIIlIIIIIIlIl = lllllllllllllIIIlllIIIlIIIIIIlll.toCharArray();
            int lllllllllllllIIIlllIIIlIIIIIIlII = EnumType.lIlIIlIIlIIlII[0];
            final float lllllllllllllIIIlllIIIIllllllllI = (Object)lllllllllllllIIIlllIIIlIIIIIIIll.toCharArray();
            final float lllllllllllllIIIlllIIIIlllllllIl = lllllllllllllIIIlllIIIIllllllllI.length;
            short lllllllllllllIIIlllIIIIlllllllII = (short)EnumType.lIlIIlIIlIIlII[0];
            while (lllIIlIlIllllll(lllllllllllllIIIlllIIIIlllllllII, (int)lllllllllllllIIIlllIIIIlllllllIl)) {
                final char lllllllllllllIIIlllIIIlIIIIIlIIl = lllllllllllllIIIlllIIIIllllllllI[lllllllllllllIIIlllIIIIlllllllII];
                lllllllllllllIIIlllIIIlIIIIIIllI.append((char)(lllllllllllllIIIlllIIIlIIIIIlIIl ^ lllllllllllllIIIlllIIIlIIIIIIlIl[lllllllllllllIIIlllIIIlIIIIIIlII % lllllllllllllIIIlllIIIlIIIIIIlIl.length]));
                "".length();
                ++lllllllllllllIIIlllIIIlIIIIIIlII;
                ++lllllllllllllIIIlllIIIIlllllllII;
                "".length();
                if ((0xD1 ^ 0xB7 ^ (0x7D ^ 0x1F)) == " ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIIlllIIIlIIIIIIllI);
        }
        
        private static boolean lllIIlIlIlllllI(final int lllllllllllllIIIlllIIIIlllllIIIl) {
            return lllllllllllllIIIlllIIIIlllllIIIl >= 0;
        }
        
        @Override
        public String toString() {
            return this.name;
        }
        
        private static void lllIIlIlIIllIII() {
            (lIlIIlIIIlIllI = new String[EnumType.lIlIIlIIlIIlII[9]])[EnumType.lIlIIlIIlIIlII[0]] = lllIIlIlIIlIIIl("pG+s3w4JRyY=", "vZoGj");
            EnumType.lIlIIlIIIlIllI[EnumType.lIlIIlIIlIIlII[1]] = lllIIlIlIIlIIll("MBgYFwI3FhgW", "Cyvsq");
            EnumType.lIlIIlIIIlIllI[EnumType.lIlIIlIIlIIlII[2]] = lllIIlIlIIlIIIl("t3PZ1vZk8Ig=", "wZhrH");
            EnumType.lIlIIlIIIlIllI[EnumType.lIlIIlIIlIIlII[3]] = lllIIlIlIIlIIll("CwcuPCgECiM=", "HOgom");
            EnumType.lIlIIlIIIlIllI[EnumType.lIlIIlIIlIIlII[4]] = lllIIlIlIIlIIll("CgcYHjYFChUyIAgBFR4nBgEU", "ioqmS");
            EnumType.lIlIIlIIIlIllI[EnumType.lIlIIlIIlIIlII[5]] = lllIIlIlIIlIIIl("69+Lru+eLA4pCifIuqyvFQ==", "ZpNrJ");
            EnumType.lIlIIlIIIlIllI[EnumType.lIlIIlIIlIIlII[6]] = lllIIlIlIIlIlII("Gu8DzqPOiEY=", "DfmKJ");
            EnumType.lIlIIlIIIlIllI[EnumType.lIlIIlIIlIIlII[7]] = lllIIlIlIIlIlII("9lHgVGXv5T9+MFhvLBwmWI/SgGTMA+2b", "gnXLf");
            EnumType.lIlIIlIIIlIllI[EnumType.lIlIIlIIlIIlII[8]] = lllIIlIlIIlIIll("AjUFHjkZ", "qXjqM");
        }
        
        private static String lllIIlIlIIlIIIl(final String lllllllllllllIIIlllIIIlIIIIllIII, final String lllllllllllllIIIlllIIIlIIIIlIlIl) {
            try {
                final SecretKeySpec lllllllllllllIIIlllIIIlIIIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIIIlIIIIlIlIl.getBytes(StandardCharsets.UTF_8)), EnumType.lIlIIlIIlIIlII[8]), "DES");
                final Cipher lllllllllllllIIIlllIIIlIIIIllIlI = Cipher.getInstance("DES");
                lllllllllllllIIIlllIIIlIIIIllIlI.init(EnumType.lIlIIlIIlIIlII[2], lllllllllllllIIIlllIIIlIIIIllIll);
                return new String(lllllllllllllIIIlllIIIlIIIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIIIlIIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIlllIIIlIIIIllIIl) {
                lllllllllllllIIIlllIIIlIIIIllIIl.printStackTrace();
                return null;
            }
        }
        
        private EnumType(final String lllllllllllllIIIlllIIIlIIlIIlIII, final int lllllllllllllIIIlllIIIlIIlIIIlll, final int lllllllllllllIIIlllIIIlIIlIIIllI, final String lllllllllllllIIIlllIIIlIIlIIlIll, final String lllllllllllllIIIlllIIIlIIlIIlIlI) {
            this.metadata = lllllllllllllIIIlllIIIlIIlIIIllI;
            this.name = lllllllllllllIIIlllIIIlIIlIIlIll;
            this.unlocalizedName = lllllllllllllIIIlllIIIlIIlIIlIlI;
        }
        
        private static boolean lllIIlIlIllllIl(final int lllllllllllllIIIlllIIIIllllllIII, final int lllllllllllllIIIlllIIIIlllllIlll) {
            return lllllllllllllIIIlllIIIIllllllIII >= lllllllllllllIIIlllIIIIlllllIlll;
        }
        
        public static EnumType byMetadata(int lllllllllllllIIIlllIIIlIIIlllIll) {
            if (!lllIIlIlIlllllI(lllllllllllllIIIlllIIIlIIIlllIll) || lllIIlIlIllllIl(lllllllllllllIIIlllIIIlIIIlllIll, EnumType.META_LOOKUP.length)) {
                lllllllllllllIIIlllIIIlIIIlllIll = EnumType.lIlIIlIIlIIlII[0];
            }
            return EnumType.META_LOOKUP[lllllllllllllIIIlllIIIlIIIlllIll];
        }
        
        public String getUnlocalizedName() {
            return this.unlocalizedName;
        }
        
        @Override
        public String getName() {
            return this.name;
        }
        
        private static String lllIIlIlIIlIlII(final String lllllllllllllIIIlllIIIlIIIlIIlIl, final String lllllllllllllIIIlllIIIlIIIlIIlII) {
            try {
                final SecretKeySpec lllllllllllllIIIlllIIIlIIIlIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIIIlIIIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIIlllIIIlIIIlIIlll = Cipher.getInstance("Blowfish");
                lllllllllllllIIIlllIIIlIIIlIIlll.init(EnumType.lIlIIlIIlIIlII[2], lllllllllllllIIIlllIIIlIIIlIlIII);
                return new String(lllllllllllllIIIlllIIIlIIIlIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIIIlIIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIlllIIIlIIIlIIllI) {
                lllllllllllllIIIlllIIIlIIIlIIllI.printStackTrace();
                return null;
            }
        }
        
        public int getMetadata() {
            return this.metadata;
        }
    }
}
