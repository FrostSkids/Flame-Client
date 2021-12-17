// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Arrays;
import net.minecraft.util.IStringSerializable;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.properties.PropertyEnum;

public class BlockRedSandstone extends Block
{
    private static final /* synthetic */ int[] lIlIIllIIIlIIl;
    private static final /* synthetic */ String[] lIlIIllIIIIlIl;
    public static final /* synthetic */ PropertyEnum<EnumType> TYPE;
    
    private static String lllIIlllIlIIlll(final String lllllllllllllIIIllIlIIlIIllIIIII, final String lllllllllllllIIIllIlIIlIIlIlllIl) {
        try {
            final SecretKeySpec lllllllllllllIIIllIlIIlIIllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIlIIlIIlIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllIlIIlIIllIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllIlIIlIIllIIIlI.init(BlockRedSandstone.lIlIIllIIIlIIl[2], lllllllllllllIIIllIlIIlIIllIIIll);
            return new String(lllllllllllllIIIllIlIIlIIllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIlIIlIIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIlIIlIIllIIIIl) {
            lllllllllllllIIIllIlIIlIIllIIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int damageDropped(final IBlockState lllllllllllllIIIllIlIIlIlIIIIllI) {
        return lllllllllllllIIIllIlIIlIlIIIIllI.getValue(BlockRedSandstone.TYPE).getMetadata();
    }
    
    private static boolean lllIIlllIlIlIll(final int lllllllllllllIIIllIlIIlIIlIllIII, final int lllllllllllllIIIllIlIIlIIlIlIlll) {
        return lllllllllllllIIIllIlIIlIIlIllIII >= lllllllllllllIIIllIlIIlIIlIlIlll;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockRedSandstone.lIlIIllIIIlIIl[1]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockRedSandstone.lIlIIllIIIlIIl[0]] = BlockRedSandstone.TYPE;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIIllIlIIlIIllIlIll) {
        return lllllllllllllIIIllIlIIlIIllIlIll.getValue(BlockRedSandstone.TYPE).getMetadata();
    }
    
    private static void lllIIlllIlIlIlI() {
        (lIlIIllIIIlIIl = new int[3])[0] = ((0x5 ^ 0x3E) & ~(0xB5 ^ 0x8E));
        BlockRedSandstone.lIlIIllIIIlIIl[1] = " ".length();
        BlockRedSandstone.lIlIIllIIIlIIl[2] = "  ".length();
    }
    
    public BlockRedSandstone() {
        super(Material.rock, BlockSand.EnumType.RED_SAND.getMapColor());
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockRedSandstone.TYPE, EnumType.DEFAULT));
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIIllIlIIlIIllIllll) {
        return this.getDefaultState().withProperty(BlockRedSandstone.TYPE, EnumType.byMetadata(lllllllllllllIIIllIlIIlIIllIllll));
    }
    
    private static void lllIIlllIlIlIII() {
        (lIlIIllIIIIlIl = new String[BlockRedSandstone.lIlIIllIIIlIIl[1]])[BlockRedSandstone.lIlIIllIIIlIIl[0]] = lllIIlllIlIIlll("gz3N+jlIJ/c=", "Mtkwe");
    }
    
    @Override
    public void getSubBlocks(final Item lllllllllllllIIIllIlIIlIIllllIlI, final CreativeTabs lllllllllllllIIIllIlIIlIIlllllIl, final List<ItemStack> lllllllllllllIIIllIlIIlIIllllIIl) {
        final long lllllllllllllIIIllIlIIlIIlllIlIl;
        final short lllllllllllllIIIllIlIIlIIlllIllI = (short)((EnumType[])(Object)(lllllllllllllIIIllIlIIlIIlllIlIl = (long)(Object)EnumType.values())).length;
        int lllllllllllllIIIllIlIIlIIlllIlll = BlockRedSandstone.lIlIIllIIIlIIl[0];
        "".length();
        if (-" ".length() >= 0) {
            return;
        }
        while (!lllIIlllIlIlIll(lllllllllllllIIIllIlIIlIIlllIlll, lllllllllllllIIIllIlIIlIIlllIllI)) {
            final EnumType lllllllllllllIIIllIlIIlIIllllIll = lllllllllllllIIIllIlIIlIIlllIlIl[lllllllllllllIIIllIlIIlIIlllIlll];
            lllllllllllllIIIllIlIIlIIllllIIl.add(new ItemStack(lllllllllllllIIIllIlIIlIIllllIlI, BlockRedSandstone.lIlIIllIIIlIIl[1], lllllllllllllIIIllIlIIlIIllllIll.getMetadata()));
            "".length();
            ++lllllllllllllIIIllIlIIlIIlllIlll;
        }
    }
    
    static {
        lllIIlllIlIlIlI();
        lllIIlllIlIlIII();
        TYPE = PropertyEnum.create(BlockRedSandstone.lIlIIllIIIIlIl[BlockRedSandstone.lIlIIllIIIlIIl[0]], EnumType.class);
    }
    
    public enum EnumType implements IStringSerializable
    {
        private static final /* synthetic */ EnumType[] META_LOOKUP;
        private final /* synthetic */ String unlocalizedName;
        
        SMOOTH(EnumType.lllIlIIIIIllII[EnumType.lllIlIIIIlIIII[6]], EnumType.lllIlIIIIlIIII[2], EnumType.lllIlIIIIlIIII[2], EnumType.lllIlIIIIIllII[EnumType.lllIlIIIIlIIII[7]], EnumType.lllIlIIIIIllII[EnumType.lllIlIIIIlIIII[8]]), 
        DEFAULT(EnumType.lllIlIIIIIllII[EnumType.lllIlIIIIlIIII[0]], EnumType.lllIlIIIIlIIII[0], EnumType.lllIlIIIIlIIII[0], EnumType.lllIlIIIIIllII[EnumType.lllIlIIIIlIIII[1]], EnumType.lllIlIIIIIllII[EnumType.lllIlIIIIlIIII[2]]);
        
        private static final /* synthetic */ String[] lllIlIIIIIllII;
        private final /* synthetic */ String name;
        private final /* synthetic */ int meta;
        private static final /* synthetic */ int[] lllIlIIIIlIIII;
        
        CHISELED(EnumType.lllIlIIIIIllII[EnumType.lllIlIIIIlIIII[3]], EnumType.lllIlIIIIlIIII[1], EnumType.lllIlIIIIlIIII[1], EnumType.lllIlIIIIIllII[EnumType.lllIlIIIIlIIII[4]], EnumType.lllIlIIIIIllII[EnumType.lllIlIIIIlIIII[5]]);
        
        private static boolean lIlIIIIlIllIIIlI(final int llllllllllllIlIlllIIlllIIlIlIlII, final int llllllllllllIlIlllIIlllIIlIlIIll) {
            return llllllllllllIlIlllIIlllIIlIlIlII < llllllllllllIlIlllIIlllIIlIlIIll;
        }
        
        @Override
        public String toString() {
            return this.name;
        }
        
        private static void lIlIIIIlIlIllIll() {
            (lllIlIIIIIllII = new String[EnumType.lllIlIIIIlIIII[9]])[EnumType.lllIlIIIIlIIII[0]] = lIlIIIIlIlIlIllI("MS8JKhw5Pg==", "ujOkI");
            EnumType.lllIlIIIIIllII[EnumType.lllIlIIIIlIIII[1]] = lIlIIIIlIlIlIlll("Fo1Yd896MI79l5RoVWe5Jg==", "qYpyi");
            EnumType.lllIlIIIIIllII[EnumType.lllIlIIIIlIIII[2]] = lIlIIIIlIlIllIII("4UAGTz14um4=", "ZAfUf");
            EnumType.lllIlIIIIIllII[EnumType.lllIlIIIIlIIII[3]] = lIlIIIIlIlIlIllI("Nho4MgQ5FzU=", "uRqaA");
            EnumType.lllIlIIIIIllII[EnumType.lllIlIIIIlIIII[4]] = lIlIIIIlIlIlIlll("5mNhsl9qDPG8yeYNFMv/jgaJQDtvVXX5", "phXmj");
            EnumType.lllIlIIIIIllII[EnumType.lllIlIIIIlIIII[5]] = lIlIIIIlIlIllIII("zc5+yzd3R+ajhq6nJT5Hbw==", "DSIaX");
            EnumType.lllIlIIIIIllII[EnumType.lllIlIIIIlIIII[6]] = lIlIIIIlIlIllIII("VseKl9yL1pQ=", "cpOIS");
            EnumType.lllIlIIIIIllII[EnumType.lllIlIIIIlIIII[7]] = lIlIIIIlIlIlIllI("Nzs5BQ0sCSQPHRslNwQdNyI5BBw=", "DVVjy");
            EnumType.lllIlIIIIIllII[EnumType.lllIlIIIIlIIII[8]] = lIlIIIIlIlIlIlll("0MyieLyEtPQ=", "NQshZ");
        }
        
        private static void lIlIIIIlIlIlllll() {
            (lllIlIIIIlIIII = new int[10])[0] = ((0x62 ^ 0x7F ^ (0x5A ^ 0x7E)) & (0x5D ^ 0x2 ^ (0x36 ^ 0x50) ^ -" ".length()));
            EnumType.lllIlIIIIlIIII[1] = " ".length();
            EnumType.lllIlIIIIlIIII[2] = "  ".length();
            EnumType.lllIlIIIIlIIII[3] = "   ".length();
            EnumType.lllIlIIIIlIIII[4] = (44 + 44 - 33 + 84 ^ 38 + 80 - 8 + 33);
            EnumType.lllIlIIIIlIIII[5] = (0x4B ^ 0x4E);
            EnumType.lllIlIIIIlIIII[6] = (56 + 86 + 14 + 19 ^ 151 + 58 - 56 + 16);
            EnumType.lllIlIIIIlIIII[7] = (0xB5 ^ 0xB2);
            EnumType.lllIlIIIIlIIII[8] = (0xC8 ^ 0xC0);
            EnumType.lllIlIIIIlIIII[9] = (0xBE ^ 0x91 ^ (0x6E ^ 0x48));
        }
        
        private EnumType(final String llllllllllllIlIlllIIlllIlIlIlIII, final int llllllllllllIlIlllIIlllIlIlIIlll, final int llllllllllllIlIlllIIlllIlIlIIllI, final String llllllllllllIlIlllIIlllIlIlIIlIl, final String llllllllllllIlIlllIIlllIlIlIlIlI) {
            this.meta = llllllllllllIlIlllIIlllIlIlIIllI;
            this.name = llllllllllllIlIlllIIlllIlIlIIlIl;
            this.unlocalizedName = llllllllllllIlIlllIIlllIlIlIlIlI;
        }
        
        public String getUnlocalizedName() {
            return this.unlocalizedName;
        }
        
        private static boolean lIlIIIIlIllIIIII(final int llllllllllllIlIlllIIlllIIlIllIII, final int llllllllllllIlIlllIIlllIIlIlIlll) {
            return llllllllllllIlIlllIIlllIIlIllIII >= llllllllllllIlIlllIIlllIIlIlIlll;
        }
        
        private static String lIlIIIIlIlIlIllI(String llllllllllllIlIlllIIlllIIllIIIll, final String llllllllllllIlIlllIIlllIIllIIlll) {
            llllllllllllIlIlllIIlllIIllIIIll = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIlIlllIIlllIIllIIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlIlllIIlllIIllIIllI = new StringBuilder();
            final char[] llllllllllllIlIlllIIlllIIllIIlIl = llllllllllllIlIlllIIlllIIllIIlll.toCharArray();
            int llllllllllllIlIlllIIlllIIllIIlII = EnumType.lllIlIIIIlIIII[0];
            final double llllllllllllIlIlllIIlllIIlIllllI = (Object)((String)llllllllllllIlIlllIIlllIIllIIIll).toCharArray();
            final char llllllllllllIlIlllIIlllIIlIlllIl = (char)llllllllllllIlIlllIIlllIIlIllllI.length;
            double llllllllllllIlIlllIIlllIIlIlllII = EnumType.lllIlIIIIlIIII[0];
            while (lIlIIIIlIllIIIlI((int)llllllllllllIlIlllIIlllIIlIlllII, llllllllllllIlIlllIIlllIIlIlllIl)) {
                final char llllllllllllIlIlllIIlllIIllIlIIl = llllllllllllIlIlllIIlllIIlIllllI[llllllllllllIlIlllIIlllIIlIlllII];
                llllllllllllIlIlllIIlllIIllIIllI.append((char)(llllllllllllIlIlllIIlllIIllIlIIl ^ llllllllllllIlIlllIIlllIIllIIlIl[llllllllllllIlIlllIIlllIIllIIlII % llllllllllllIlIlllIIlllIIllIIlIl.length]));
                "".length();
                ++llllllllllllIlIlllIIlllIIllIIlII;
                ++llllllllllllIlIlllIIlllIIlIlllII;
                "".length();
                if ("   ".length() <= 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlIlllIIlllIIllIIllI);
        }
        
        private static boolean lIlIIIIlIllIIIIl(final int llllllllllllIlIlllIIlllIIlIlIIIl) {
            return llllllllllllIlIlllIIlllIIlIlIIIl >= 0;
        }
        
        public int getMetadata() {
            return this.meta;
        }
        
        @Override
        public String getName() {
            return this.name;
        }
        
        public static EnumType byMetadata(int llllllllllllIlIlllIIlllIlIIllIll) {
            if (!lIlIIIIlIllIIIIl((int)llllllllllllIlIlllIIlllIlIIllIll) || lIlIIIIlIllIIIII((int)llllllllllllIlIlllIIlllIlIIllIll, EnumType.META_LOOKUP.length)) {
                llllllllllllIlIlllIIlllIlIIllIll = EnumType.lllIlIIIIlIIII[0];
            }
            return EnumType.META_LOOKUP[llllllllllllIlIlllIIlllIlIIllIll];
        }
        
        static {
            lIlIIIIlIlIlllll();
            lIlIIIIlIlIllIll();
            final EnumType[] enum$VALUES = new EnumType[EnumType.lllIlIIIIlIIII[3]];
            enum$VALUES[EnumType.lllIlIIIIlIIII[0]] = EnumType.DEFAULT;
            enum$VALUES[EnumType.lllIlIIIIlIIII[1]] = EnumType.CHISELED;
            enum$VALUES[EnumType.lllIlIIIIlIIII[2]] = EnumType.SMOOTH;
            ENUM$VALUES = enum$VALUES;
            META_LOOKUP = new EnumType[values().length];
            final byte llllllllllllIlIlllIIlllIlIllIlII;
            final short llllllllllllIlIlllIIlllIlIllIlIl = (short)((EnumType[])(Object)(llllllllllllIlIlllIIlllIlIllIlII = (byte)(Object)values())).length;
            double llllllllllllIlIlllIIlllIlIllIllI = EnumType.lllIlIIIIlIIII[0];
            "".length();
            if ("   ".length() < "   ".length()) {
                return;
            }
            while (!lIlIIIIlIllIIIII((int)llllllllllllIlIlllIIlllIlIllIllI, llllllllllllIlIlllIIlllIlIllIlIl)) {
                final EnumType llllllllllllIlIlllIIlllIlIlllIII = llllllllllllIlIlllIIlllIlIllIlII[llllllllllllIlIlllIIlllIlIllIllI];
                EnumType.META_LOOKUP[llllllllllllIlIlllIIlllIlIlllIII.getMetadata()] = llllllllllllIlIlllIIlllIlIlllIII;
                ++llllllllllllIlIlllIIlllIlIllIllI;
            }
        }
        
        private static String lIlIIIIlIlIllIII(final String llllllllllllIlIlllIIlllIIlllIllI, final String llllllllllllIlIlllIIlllIIlllIlIl) {
            try {
                final SecretKeySpec llllllllllllIlIlllIIlllIIllllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIIlllIIlllIlIl.getBytes(StandardCharsets.UTF_8)), EnumType.lllIlIIIIlIIII[8]), "DES");
                final Cipher llllllllllllIlIlllIIlllIIllllIlI = Cipher.getInstance("DES");
                llllllllllllIlIlllIIlllIIllllIlI.init(EnumType.lllIlIIIIlIIII[2], llllllllllllIlIlllIIlllIIllllIll);
                return new String(llllllllllllIlIlllIIlllIIllllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIIlllIIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIlllIIlllIIllllIIl) {
                llllllllllllIlIlllIIlllIIllllIIl.printStackTrace();
                return null;
            }
        }
        
        private static String lIlIIIIlIlIlIlll(final String llllllllllllIlIlllIIlllIlIIIIIll, final String llllllllllllIlIlllIIlllIlIIIIIlI) {
            try {
                final SecretKeySpec llllllllllllIlIlllIIlllIlIIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIIlllIlIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlIlllIIlllIlIIIIlll = Cipher.getInstance("Blowfish");
                llllllllllllIlIlllIIlllIlIIIIlll.init(EnumType.lllIlIIIIlIIII[2], llllllllllllIlIlllIIlllIlIIIlIII);
                return new String(llllllllllllIlIlllIIlllIlIIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIIlllIlIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIlllIIlllIlIIIIllI) {
                llllllllllllIlIlllIIlllIlIIIIllI.printStackTrace();
                return null;
            }
        }
    }
}
