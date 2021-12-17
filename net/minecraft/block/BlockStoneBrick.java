// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.IStringSerializable;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.properties.PropertyEnum;

public class BlockStoneBrick extends Block
{
    private static final /* synthetic */ int[] lIllIlllIIIIlI;
    public static final /* synthetic */ PropertyEnum<EnumType> VARIANT;
    private static final /* synthetic */ String[] lIllIlllIIIIIl;
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockStoneBrick.lIllIlllIIIIlI[1]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockStoneBrick.lIllIlllIIIIlI[0]] = BlockStoneBrick.VARIANT;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIllllllIlIlIIlllllll) {
        return llllllllllllIllllllIlIlIIlllllll.getValue(BlockStoneBrick.VARIANT).getMetadata();
    }
    
    @Override
    public void getSubBlocks(final Item llllllllllllIllllllIlIlIlIIIlllI, final CreativeTabs llllllllllllIllllllIlIlIlIIlIIIl, final List<ItemStack> llllllllllllIllllllIlIlIlIIlIIII) {
        final float llllllllllllIllllllIlIlIlIIIlIIl;
        final double llllllllllllIllllllIlIlIlIIIlIlI = ((EnumType[])(Object)(llllllllllllIllllllIlIlIlIIIlIIl = (float)(Object)EnumType.values())).length;
        byte llllllllllllIllllllIlIlIlIIIlIll = (byte)BlockStoneBrick.lIllIlllIIIIlI[0];
        "".length();
        if (-(0x36 ^ 0x32) > 0) {
            return;
        }
        while (!llllllllllllIIl(llllllllllllIllllllIlIlIlIIIlIll, (int)llllllllllllIllllllIlIlIlIIIlIlI)) {
            final EnumType llllllllllllIllllllIlIlIlIIIllll = llllllllllllIllllllIlIlIlIIIlIIl[llllllllllllIllllllIlIlIlIIIlIll];
            llllllllllllIllllllIlIlIlIIlIIII.add(new ItemStack(llllllllllllIllllllIlIlIlIIIlllI, BlockStoneBrick.lIllIlllIIIIlI[1], llllllllllllIllllllIlIlIlIIIllll.getMetadata()));
            "".length();
            ++llllllllllllIllllllIlIlIlIIIlIll;
        }
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIllllllIlIlIlIIIIlIl) {
        return this.getDefaultState().withProperty(BlockStoneBrick.VARIANT, EnumType.byMetadata(llllllllllllIllllllIlIlIlIIIIlIl));
    }
    
    @Override
    public int damageDropped(final IBlockState llllllllllllIllllllIlIlIlIIllIll) {
        return llllllllllllIllllllIlIlIlIIllIll.getValue(BlockStoneBrick.VARIANT).getMetadata();
    }
    
    static {
        llllllllllllIII();
        lllllllllllIlll();
        VARIANT = PropertyEnum.create(BlockStoneBrick.lIllIlllIIIIIl[BlockStoneBrick.lIllIlllIIIIlI[0]], EnumType.class);
        DEFAULT_META = EnumType.DEFAULT.getMetadata();
        MOSSY_META = EnumType.MOSSY.getMetadata();
        CRACKED_META = EnumType.CRACKED.getMetadata();
        CHISELED_META = EnumType.CHISELED.getMetadata();
    }
    
    public BlockStoneBrick() {
        super(Material.rock);
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockStoneBrick.VARIANT, EnumType.DEFAULT));
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    private static boolean llllllllllllIIl(final int llllllllllllIllllllIlIlIIllIllII, final int llllllllllllIllllllIlIlIIllIlIll) {
        return llllllllllllIllllllIlIlIIllIllII >= llllllllllllIllllllIlIlIIllIlIll;
    }
    
    private static String lllllllllllIllI(final String llllllllllllIllllllIlIlIIlllIlII, final String llllllllllllIllllllIlIlIIlllIIll) {
        try {
            final SecretKeySpec llllllllllllIllllllIlIlIIlllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIlIlIIlllIIll.getBytes(StandardCharsets.UTF_8)), BlockStoneBrick.lIllIlllIIIIlI[2]), "DES");
            final Cipher llllllllllllIllllllIlIlIIlllIllI = Cipher.getInstance("DES");
            llllllllllllIllllllIlIlIIlllIllI.init(BlockStoneBrick.lIllIlllIIIIlI[3], llllllllllllIllllllIlIlIIlllIlll);
            return new String(llllllllllllIllllllIlIlIIlllIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIlIlIIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllIlIlIIlllIlIl) {
            llllllllllllIllllllIlIlIIlllIlIl.printStackTrace();
            return null;
        }
    }
    
    private static void llllllllllllIII() {
        (lIllIlllIIIIlI = new int[4])[0] = ((0x4 ^ 0x2C) & ~(0x38 ^ 0x10));
        BlockStoneBrick.lIllIlllIIIIlI[1] = " ".length();
        BlockStoneBrick.lIllIlllIIIIlI[2] = (0x13 ^ 0x20 ^ (0xA9 ^ 0x92));
        BlockStoneBrick.lIllIlllIIIIlI[3] = "  ".length();
    }
    
    private static void lllllllllllIlll() {
        (lIllIlllIIIIIl = new String[BlockStoneBrick.lIllIlllIIIIlI[1]])[BlockStoneBrick.lIllIlllIIIIlI[0]] = lllllllllllIllI("rlRDnxFe9KQ=", "rQxZA");
    }
    
    public enum EnumType implements IStringSerializable
    {
        CRACKED(EnumType.lllIlIIlIllIll[EnumType.lllIlIIllIIIlI[6]], EnumType.lllIlIIllIIIlI[2], EnumType.lllIlIIllIIIlI[2], EnumType.lllIlIIlIllIll[EnumType.lllIlIIllIIIlI[7]], EnumType.lllIlIIlIllIll[EnumType.lllIlIIllIIIlI[8]]);
        
        private static final /* synthetic */ int[] lllIlIIllIIIlI;
        private final /* synthetic */ String unlocalizedName;
        
        CHISELED(EnumType.lllIlIIlIllIll[EnumType.lllIlIIllIIIlI[9]], EnumType.lllIlIIllIIIlI[3], EnumType.lllIlIIllIIIlI[3], EnumType.lllIlIIlIllIll[EnumType.lllIlIIllIIIlI[10]], EnumType.lllIlIIlIllIll[EnumType.lllIlIIllIIIlI[11]]), 
        MOSSY(EnumType.lllIlIIlIllIll[EnumType.lllIlIIllIIIlI[3]], EnumType.lllIlIIllIIIlI[1], EnumType.lllIlIIllIIIlI[1], EnumType.lllIlIIlIllIll[EnumType.lllIlIIllIIIlI[4]], EnumType.lllIlIIlIllIll[EnumType.lllIlIIllIIIlI[5]]);
        
        private static final /* synthetic */ EnumType[] META_LOOKUP;
        
        DEFAULT(EnumType.lllIlIIlIllIll[EnumType.lllIlIIllIIIlI[0]], EnumType.lllIlIIllIIIlI[0], EnumType.lllIlIIllIIIlI[0], EnumType.lllIlIIlIllIll[EnumType.lllIlIIllIIIlI[1]], EnumType.lllIlIIlIllIll[EnumType.lllIlIIllIIIlI[2]]);
        
        private final /* synthetic */ String name;
        private static final /* synthetic */ String[] lllIlIIlIllIll;
        private final /* synthetic */ int meta;
        
        public static EnumType byMetadata(int llllllllllllIlIllIllllIIIlIIIIlI) {
            if (!lIlIIIlIIlIlIlII(llllllllllllIlIllIllllIIIlIIIIlI) || lIlIIIlIIlIlIIll(llllllllllllIlIllIllllIIIlIIIIlI, EnumType.META_LOOKUP.length)) {
                llllllllllllIlIllIllllIIIlIIIIlI = EnumType.lllIlIIllIIIlI[0];
            }
            return EnumType.META_LOOKUP[llllllllllllIlIllIllllIIIlIIIIlI];
        }
        
        private EnumType(final String llllllllllllIlIllIllllIIIlIlIllI, final int llllllllllllIlIllIllllIIIlIlIlIl, final int llllllllllllIlIllIllllIIIlIlIlII, final String llllllllllllIlIllIllllIIIlIlIIll, final String llllllllllllIlIllIllllIIIlIlIIlI) {
            this.meta = llllllllllllIlIllIllllIIIlIlIlII;
            this.name = llllllllllllIlIllIllllIIIlIlIIll;
            this.unlocalizedName = llllllllllllIlIllIllllIIIlIlIIlI;
        }
        
        public int getMetadata() {
            return this.meta;
        }
        
        static {
            lIlIIIlIIlIlIIlI();
            lIlIIIlIIlIIlllI();
            final EnumType[] enum$VALUES = new EnumType[EnumType.lllIlIIllIIIlI[4]];
            enum$VALUES[EnumType.lllIlIIllIIIlI[0]] = EnumType.DEFAULT;
            enum$VALUES[EnumType.lllIlIIllIIIlI[1]] = EnumType.MOSSY;
            enum$VALUES[EnumType.lllIlIIllIIIlI[2]] = EnumType.CRACKED;
            enum$VALUES[EnumType.lllIlIIllIIIlI[3]] = EnumType.CHISELED;
            ENUM$VALUES = enum$VALUES;
            META_LOOKUP = new EnumType[values().length];
            final Exception llllllllllllIlIllIllllIIIllIIIlI;
            final double llllllllllllIlIllIllllIIIllIIIll = ((EnumType[])(Object)(llllllllllllIlIllIllllIIIllIIIlI = (Exception)(Object)values())).length;
            short llllllllllllIlIllIllllIIIllIIlII = (short)EnumType.lllIlIIllIIIlI[0];
            "".length();
            if ((0x96 ^ 0x93) <= 0) {
                return;
            }
            while (!lIlIIIlIIlIlIIll(llllllllllllIlIllIllllIIIllIIlII, (int)llllllllllllIlIllIllllIIIllIIIll)) {
                final EnumType llllllllllllIlIllIllllIIIllIIllI = llllllllllllIlIllIllllIIIllIIIlI[llllllllllllIlIllIllllIIIllIIlII];
                EnumType.META_LOOKUP[llllllllllllIlIllIllllIIIllIIllI.getMetadata()] = llllllllllllIlIllIllllIIIllIIllI;
                ++llllllllllllIlIllIllllIIIllIIlII;
            }
        }
        
        private static String lIlIIIlIIlIIIIlI(String llllllllllllIlIllIllllIIIIIIIIII, final String llllllllllllIlIllIllllIIIIIIlIII) {
            llllllllllllIlIllIllllIIIIIIIIII = new String(Base64.getDecoder().decode(llllllllllllIlIllIllllIIIIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlIllIllllIIIIIIIlIl = new StringBuilder();
            final char[] llllllllllllIlIllIllllIIIIIIIIll = llllllllllllIlIllIllllIIIIIIlIII.toCharArray();
            int llllllllllllIlIllIllllIIIIIIIIIl = EnumType.lllIlIIllIIIlI[0];
            final int llllllllllllIlIllIlllIlllllllIlI = (Object)llllllllllllIlIllIllllIIIIIIIIII.toCharArray();
            final char llllllllllllIlIllIlllIlllllllIIl = (char)llllllllllllIlIllIlllIlllllllIlI.length;
            char llllllllllllIlIllIlllIlllllllIII = (char)EnumType.lllIlIIllIIIlI[0];
            while (lIlIIIlIIlIlIlIl(llllllllllllIlIllIlllIlllllllIII, llllllllllllIlIllIlllIlllllllIIl)) {
                final char llllllllllllIlIllIllllIIIIIIllII = llllllllllllIlIllIlllIlllllllIlI[llllllllllllIlIllIlllIlllllllIII];
                llllllllllllIlIllIllllIIIIIIIlIl.append((char)(llllllllllllIlIllIllllIIIIIIllII ^ llllllllllllIlIllIllllIIIIIIIIll[llllllllllllIlIllIllllIIIIIIIIIl % llllllllllllIlIllIllllIIIIIIIIll.length]));
                "".length();
                ++llllllllllllIlIllIllllIIIIIIIIIl;
                ++llllllllllllIlIllIlllIlllllllIII;
                "".length();
                if ("   ".length() < 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlIllIllllIIIIIIIlIl);
        }
        
        private static String lIlIIIlIIlIIIIll(final String llllllllllllIlIllIlllIlllllIIIII, final String llllllllllllIlIllIlllIllllIlllll) {
            try {
                final SecretKeySpec llllllllllllIlIllIlllIlllllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlllIllllIlllll.getBytes(StandardCharsets.UTF_8)), EnumType.lllIlIIllIIIlI[8]), "DES");
                final Cipher llllllllllllIlIllIlllIlllllIIlII = Cipher.getInstance("DES");
                llllllllllllIlIllIlllIlllllIIlII.init(EnumType.lllIlIIllIIIlI[2], llllllllllllIlIllIlllIlllllIIlIl);
                return new String(llllllllllllIlIllIlllIlllllIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlllIlllllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIllIlllIlllllIIIll) {
                llllllllllllIlIllIlllIlllllIIIll.printStackTrace();
                return null;
            }
        }
        
        @Override
        public String getName() {
            return this.name;
        }
        
        @Override
        public String toString() {
            return this.name;
        }
        
        private static boolean lIlIIIlIIlIlIIll(final int llllllllllllIlIllIlllIllllIllIlI, final int llllllllllllIlIllIlllIllllIllIIl) {
            return llllllllllllIlIllIlllIllllIllIlI >= llllllllllllIlIllIlllIllllIllIIl;
        }
        
        private static boolean lIlIIIlIIlIlIlIl(final int llllllllllllIlIllIlllIllllIlIllI, final int llllllllllllIlIllIlllIllllIlIlIl) {
            return llllllllllllIlIllIlllIllllIlIllI < llllllllllllIlIllIlllIllllIlIlIl;
        }
        
        public String getUnlocalizedName() {
            return this.unlocalizedName;
        }
        
        private static boolean lIlIIIlIIlIlIlII(final int llllllllllllIlIllIlllIllllIlIIll) {
            return llllllllllllIlIllIlllIllllIlIIll >= 0;
        }
        
        private static String lIlIIIlIIlIIlIII(final String llllllllllllIlIllIlllIlllllIllll, final String llllllllllllIlIllIlllIlllllIllII) {
            try {
                final SecretKeySpec llllllllllllIlIllIlllIllllllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlllIlllllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlIllIlllIllllllIIIl = Cipher.getInstance("Blowfish");
                llllllllllllIlIllIlllIllllllIIIl.init(EnumType.lllIlIIllIIIlI[2], llllllllllllIlIllIlllIllllllIIlI);
                return new String(llllllllllllIlIllIlllIllllllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlllIlllllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIllIlllIllllllIIII) {
                llllllllllllIlIllIlllIllllllIIII.printStackTrace();
                return null;
            }
        }
        
        private static void lIlIIIlIIlIlIIlI() {
            (lllIlIIllIIIlI = new int[13])[0] = ((43 + 28 - 68 + 157 ^ 162 + 45 - 188 + 152) & (0xC0 ^ 0xA2 ^ (0x53 ^ 0x3A) ^ -" ".length()));
            EnumType.lllIlIIllIIIlI[1] = " ".length();
            EnumType.lllIlIIllIIIlI[2] = "  ".length();
            EnumType.lllIlIIllIIIlI[3] = "   ".length();
            EnumType.lllIlIIllIIIlI[4] = (0xB5 ^ 0xB1);
            EnumType.lllIlIIllIIIlI[5] = (0x82 ^ 0x87);
            EnumType.lllIlIIllIIIlI[6] = (0x88 ^ 0x83 ^ (0x98 ^ 0x95));
            EnumType.lllIlIIllIIIlI[7] = (0x94 ^ 0x93);
            EnumType.lllIlIIllIIIlI[8] = (105 + 88 - 5 + 17 ^ 141 + 173 - 264 + 147);
            EnumType.lllIlIIllIIIlI[9] = (18 + 37 - 19 + 134 ^ 12 + 39 + 104 + 8);
            EnumType.lllIlIIllIIIlI[10] = (0x26 ^ 0x7B ^ (0x2D ^ 0x7A));
            EnumType.lllIlIIllIIIlI[11] = (108 + 80 - 53 + 19 ^ 18 + 25 + 64 + 38);
            EnumType.lllIlIIllIIIlI[12] = (0x4D ^ 0x41);
        }
        
        private static void lIlIIIlIIlIIlllI() {
            (lllIlIIlIllIll = new String[EnumType.lllIlIIllIIIlI[12]])[EnumType.lllIlIIllIIIlI[0]] = lIlIIIlIIlIIIIlI("Ew4AGSEbHw==", "WKFXt");
            EnumType.lllIlIIlIllIll[EnumType.lllIlIIllIIIlI[1]] = lIlIIIlIIlIIIIll("DnN5UppSczbiWOHjZ8bnNA==", "tnFkd");
            EnumType.lllIlIIlIllIll[EnumType.lllIlIIllIIIlI[2]] = lIlIIIlIIlIIIIll("KPhvKDsJoE8=", "HnEOh");
            EnumType.lllIlIIlIllIll[EnumType.lllIlIIllIIIlI[3]] = lIlIIIlIIlIIIIlI("HBk+GSs=", "QVmJr");
            EnumType.lllIlIIlIllIll[EnumType.lllIlIIllIIIlI[4]] = lIlIIIlIIlIIIIlI("OiQ/Nx8IODgrCDIpPi0FPA==", "WKLDf");
            EnumType.lllIlIIlIllIll[EnumType.lllIlIIllIIIlI[5]] = lIlIIIlIIlIIlIII("HbX/orXOBbM=", "EJLfK");
            EnumType.lllIlIIlIllIll[EnumType.lllIlIIllIIIlI[6]] = lIlIIIlIIlIIlIII("OVnX2lGJ8gw=", "UPAzT");
            EnumType.lllIlIIlIllIll[EnumType.lllIlIIllIIIlI[7]] = lIlIIIlIIlIIlIII("A3aT0nrPJB90EpP2rs3pEEr6cHgpzpXw", "mwqKR");
            EnumType.lllIlIIlIllIll[EnumType.lllIlIIllIIIlI[8]] = lIlIIIlIIlIIlIII("IlEHV0V1pwk=", "JjNKM");
            EnumType.lllIlIIlIllIll[EnumType.lllIlIIllIIIlI[9]] = lIlIIIlIIlIIIIll("CcJ0vKpf1Dd8Mg6riWgpbQ==", "SfSzf");
            EnumType.lllIlIIlIllIll[EnumType.lllIlIIllIIIlI[10]] = lIlIIIlIIlIIIIlI("KAwHJignAQoKPj8LADAvOQ0NPg==", "KdnUM");
            EnumType.lllIlIIlIllIll[EnumType.lllIlIIllIIIlI[11]] = lIlIIIlIIlIIIIll("91XhC43q+Fv3ezzbo/roiQ==", "EXGLh");
        }
    }
}
