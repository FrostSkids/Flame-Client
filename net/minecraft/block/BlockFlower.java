// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.init.Blocks;
import java.util.Collection;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import java.util.Arrays;
import net.minecraft.util.IStringSerializable;
import net.minecraft.block.state.BlockState;
import com.google.common.base.Predicate;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyEnum;

public abstract class BlockFlower extends BlockBush
{
    private static final /* synthetic */ int[] lIlllIIIllllII;
    private static final /* synthetic */ String[] lIlllIIIlllIll;
    protected /* synthetic */ PropertyEnum<EnumFlowerType> type;
    
    private static boolean lIIIIIIllIIIllll(final Object llllllllllllIlllllIlIIllllIIllII, final Object llllllllllllIlllllIlIIllllIIlIll) {
        return llllllllllllIlllllIlIIllllIIllII == llllllllllllIlllllIlIIllllIIlIll;
    }
    
    private static boolean lIIIIIIllIIlIIII(final int llllllllllllIlllllIlIIllllIlIIII, final int llllllllllllIlllllIlIIllllIIllll) {
        return llllllllllllIlllllIlIIllllIlIIII >= llllllllllllIlllllIlIIllllIIllll;
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIlllllIlIIlllllIIlII) {
        return llllllllllllIlllllIlIIlllllIIlII.getValue(this.getTypeProperty()).getMeta();
    }
    
    public abstract EnumFlowerColor getBlockType();
    
    private static void lIIIIIIllIIIlllI() {
        (lIlllIIIllllII = new int[3])[0] = ("   ".length() & ("   ".length() ^ -" ".length()));
        BlockFlower.lIlllIIIllllII[1] = " ".length();
        BlockFlower.lIlllIIIllllII[2] = "  ".length();
    }
    
    static {
        lIIIIIIllIIIlllI();
        lIIIIIIllIIIllIl();
    }
    
    private static void lIIIIIIllIIIllIl() {
        (lIlllIIIlllIll = new String[BlockFlower.lIlllIIIllllII[1]])[BlockFlower.lIlllIIIllllII[0]] = lIIIIIIllIIIllII("cRI54QfMypg=", "fwVwm");
    }
    
    protected BlockFlower() {
        final IBlockState baseState = this.blockState.getBaseState();
        final IProperty<EnumFlowerType> typeProperty = this.getTypeProperty();
        EnumFlowerType enumFlowerType;
        if (lIIIIIIllIIIllll(this.getBlockType(), EnumFlowerColor.RED)) {
            enumFlowerType = EnumFlowerType.POPPY;
            "".length();
            if (-(0xD1 ^ 0xC0 ^ (0xA6 ^ 0xB3)) >= 0) {
                throw null;
            }
        }
        else {
            enumFlowerType = EnumFlowerType.DANDELION;
        }
        this.setDefaultState(baseState.withProperty((IProperty<Comparable>)typeProperty, enumFlowerType));
    }
    
    @Override
    public void getSubBlocks(final Item llllllllllllIlllllIlIIllllllllIl, final CreativeTabs llllllllllllIlllllIlIIllllllllII, final List<ItemStack> llllllllllllIlllllIlIIllllllIlll) {
        final double llllllllllllIlllllIlIIllllllIIll;
        final boolean llllllllllllIlllllIlIIllllllIlII = ((EnumFlowerType[])(Object)(llllllllllllIlllllIlIIllllllIIll = (double)(Object)EnumFlowerType.getTypes(this.getBlockType()))).length != 0;
        char llllllllllllIlllllIlIIllllllIlIl = (char)BlockFlower.lIlllIIIllllII[0];
        "".length();
        if ((" ".length() ^ (0xB8 ^ 0xBD)) < ((0x2 ^ 0x62 ^ (0x13 ^ 0x45)) & (0x49 ^ 0x5B ^ (0x30 ^ 0x14) ^ -" ".length()))) {
            return;
        }
        while (!lIIIIIIllIIlIIII(llllllllllllIlllllIlIIllllllIlIl, llllllllllllIlllllIlIIllllllIlII ? 1 : 0)) {
            final EnumFlowerType llllllllllllIlllllIlIIlllllllIlI = llllllllllllIlllllIlIIllllllIIll[llllllllllllIlllllIlIIllllllIlIl];
            llllllllllllIlllllIlIIllllllIlll.add(new ItemStack(llllllllllllIlllllIlIIllllllllIl, BlockFlower.lIlllIIIllllII[1], llllllllllllIlllllIlIIlllllllIlI.getMeta()));
            "".length();
            ++llllllllllllIlllllIlIIllllllIlIl;
        }
    }
    
    @Override
    public int damageDropped(final IBlockState llllllllllllIlllllIlIlIIIIIIlIII) {
        return llllllllllllIlllllIlIlIIIIIIlIII.getValue(this.getTypeProperty()).getMeta();
    }
    
    private static String lIIIIIIllIIIllII(final String llllllllllllIlllllIlIIllllIlIllI, final String llllllllllllIlllllIlIIllllIlIlll) {
        try {
            final SecretKeySpec llllllllllllIlllllIlIIllllIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIlIIllllIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllIlIIllllIllIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlllllIlIIllllIllIlI.init(BlockFlower.lIlllIIIllllII[2], llllllllllllIlllllIlIIllllIllIll);
            return new String(llllllllllllIlllllIlIIllllIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIlIIllllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIlIIllllIllIIl) {
            llllllllllllIlllllIlIIllllIllIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIIIllIIlIIIl(final Object llllllllllllIlllllIlIIllllIIlIIl) {
        return llllllllllllIlllllIlIIllllIIlIIl == null;
    }
    
    public IProperty<EnumFlowerType> getTypeProperty() {
        if (lIIIIIIllIIlIIIl(this.type)) {
            this.type = PropertyEnum.create(BlockFlower.lIlllIIIlllIll[BlockFlower.lIlllIIIllllII[0]], EnumFlowerType.class, (com.google.common.base.Predicate<EnumFlowerType>)new Predicate<EnumFlowerType>() {
                private static final /* synthetic */ int[] llIIllIlIIlIll;
                
                private static boolean lIIIlllIllIIllIl(final Object llllllllllllIlllIIIIIIllIIIIIlll, final Object llllllllllllIlllIIIIIIllIIIIIllI) {
                    return llllllllllllIlllIIIIIIllIIIIIlll == llllllllllllIlllIIIIIIllIIIIIllI;
                }
                
                public boolean apply(final EnumFlowerType llllllllllllIlllIIIIIIllIIIlIIII) {
                    if (lIIIlllIllIIllIl(llllllllllllIlllIIIIIIllIIIlIIII.getBlockType(), BlockFlower.this.getBlockType())) {
                        return BlockFlower$1.llIIllIlIIlIll[0] != 0;
                    }
                    return BlockFlower$1.llIIllIlIIlIll[1] != 0;
                }
                
                private static void lIIIlllIllIIllII() {
                    (llIIllIlIIlIll = new int[2])[0] = " ".length();
                    BlockFlower$1.llIIllIlIIlIll[1] = ((0x9 ^ 0x5B ^ (0x96 ^ 0x90)) & (0xDC ^ 0x90 ^ (0x39 ^ 0x21) ^ -" ".length()));
                }
                
                static {
                    lIIIlllIllIIllII();
                }
            });
        }
        return this.type;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIlllllIlIIlllllIllll) {
        return this.getDefaultState().withProperty(this.getTypeProperty(), EnumFlowerType.getType(this.getBlockType(), llllllllllllIlllllIlIIlllllIllll));
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockFlower.lIlllIIIllllII[1]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockFlower.lIlllIIIllllII[0]] = this.getTypeProperty();
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public EnumOffsetType getOffsetType() {
        return EnumOffsetType.XZ;
    }
    
    public enum EnumFlowerType implements IStringSerializable
    {
        private final /* synthetic */ String name;
        private static final /* synthetic */ EnumFlowerType[][] TYPES_FOR_BLOCK;
        
        OXEYE_DAISY(EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[23]], EnumFlowerType.lIlIlIIIllllII[9], EnumFlowerColor.RED, EnumFlowerType.lIlIlIIIllllII[8], EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[24]], EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[25]]);
        
        private static final /* synthetic */ String[] lIlIlIIIIllIII;
        
        PINK_TULIP(EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[20]], EnumFlowerType.lIlIlIIIllllII[8], EnumFlowerColor.RED, EnumFlowerType.lIlIlIIIllllII[7], EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[21]], EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[22]]);
        
        private static final /* synthetic */ int[] lIlIlIIIllllII;
        
        ALLIUM(EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[7]], EnumFlowerType.lIlIlIIIllllII[3], EnumFlowerColor.RED, EnumFlowerType.lIlIlIIIllllII[2], EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[8]]);
        
        private final /* synthetic */ int meta;
        private final /* synthetic */ EnumFlowerColor blockType;
        private final /* synthetic */ String unlocalizedName;
        
        WHITE_TULIP(EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[17]], EnumFlowerType.lIlIlIIIllllII[7], EnumFlowerColor.RED, EnumFlowerType.lIlIlIIIllllII[6], EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[18]], EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[19]]), 
        HOUSTONIA(EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[9]], EnumFlowerType.lIlIlIIIllllII[4], EnumFlowerColor.RED, EnumFlowerType.lIlIlIIIllllII[3], EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[10]]), 
        POPPY(EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[2]], EnumFlowerType.lIlIlIIIllllII[1], EnumFlowerColor.RED, EnumFlowerType.lIlIlIIIllllII[0], EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[3]]), 
        ORANGE_TULIP(EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[14]], EnumFlowerType.lIlIlIIIllllII[6], EnumFlowerColor.RED, EnumFlowerType.lIlIlIIIllllII[5], EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[15]], EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[16]]), 
        RED_TULIP(EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[11]], EnumFlowerType.lIlIlIIIllllII[5], EnumFlowerColor.RED, EnumFlowerType.lIlIlIIIllllII[4], EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[12]], EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[13]]), 
        BLUE_ORCHID(EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[4]], EnumFlowerType.lIlIlIIIllllII[2], EnumFlowerColor.RED, EnumFlowerType.lIlIlIIIllllII[1], EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[5]], EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[6]]), 
        DANDELION(EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[0]], EnumFlowerType.lIlIlIIIllllII[0], EnumFlowerColor.YELLOW, EnumFlowerType.lIlIlIIIllllII[0], EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[1]]);
        
        private static String lllIlIlIlllIIlI(final String lllllllllllllIIIlIlIIlIllIIIllII, final String lllllllllllllIIIlIlIIlIllIIIlIll) {
            try {
                final SecretKeySpec lllllllllllllIIIlIlIIlIllIIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlIIlIllIIIlIll.getBytes(StandardCharsets.UTF_8)), EnumFlowerType.lIlIlIIIllllII[8]), "DES");
                final Cipher lllllllllllllIIIlIlIIlIllIIlIIII = Cipher.getInstance("DES");
                lllllllllllllIIIlIlIIlIllIIlIIII.init(EnumFlowerType.lIlIlIIIllllII[2], lllllllllllllIIIlIlIIlIllIIlIIIl);
                return new String(lllllllllllllIIIlIlIIlIllIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlIIlIllIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIlIlIIlIllIIIllll) {
                lllllllllllllIIIlIlIIlIllIIIllll.printStackTrace();
                return null;
            }
        }
        
        private EnumFlowerType(final String lllllllllllllIIIlIlIIlIlllIlIIII, final int lllllllllllllIIIlIlIIlIlllIIllll, final EnumFlowerColor lllllllllllllIIIlIlIIlIlllIIlllI, final int lllllllllllllIIIlIlIIlIlllIIllIl, final String lllllllllllllIIIlIlIIlIlllIIllII) {
            this(lllllllllllllIIIlIlIIlIlllIlIIII, lllllllllllllIIIlIlIIlIlllIIllll, lllllllllllllIIIlIlIIlIlllIIlllI, lllllllllllllIIIlIlIIlIlllIIllIl, lllllllllllllIIIlIlIIlIlllIIllII, lllllllllllllIIIlIlIIlIlllIIllII);
        }
        
        private static boolean lllIlIlllllIlll(final int lllllllllllllIIIlIlIIlIlIlIllIlI) {
            return lllllllllllllIIIlIlIIlIlIlIllIlI >= 0;
        }
        
        public EnumFlowerColor getBlockType() {
            return this.blockType;
        }
        
        private static void lllIlIlllllIlIl() {
            (lIlIlIIIllllII = new int[27])[0] = ((0x9 ^ 0x47) & ~(0x5 ^ 0x4B));
            EnumFlowerType.lIlIlIIIllllII[1] = " ".length();
            EnumFlowerType.lIlIlIIIllllII[2] = "  ".length();
            EnumFlowerType.lIlIlIIIllllII[3] = "   ".length();
            EnumFlowerType.lIlIlIIIllllII[4] = (108 + 171 - 136 + 51 ^ 165 + 53 - 43 + 23);
            EnumFlowerType.lIlIlIIIllllII[5] = (136 + 54 - 137 + 110 ^ 121 + 40 - 68 + 73);
            EnumFlowerType.lIlIlIIIllllII[6] = (0x80 ^ 0x86);
            EnumFlowerType.lIlIlIIIllllII[7] = (0x83 ^ 0x84);
            EnumFlowerType.lIlIlIIIllllII[8] = (0x84 ^ 0x8C);
            EnumFlowerType.lIlIlIIIllllII[9] = (0x7 ^ 0xE);
            EnumFlowerType.lIlIlIIIllllII[10] = (0x77 ^ 0x2E ^ (0x5F ^ 0xC));
            EnumFlowerType.lIlIlIIIllllII[11] = (0xCF ^ 0xC4);
            EnumFlowerType.lIlIlIIIllllII[12] = (0x37 ^ 0x3B);
            EnumFlowerType.lIlIlIIIllllII[13] = (0xBC ^ 0xB1);
            EnumFlowerType.lIlIlIIIllllII[14] = (0x83 ^ 0xA9 ^ (0x6D ^ 0x49));
            EnumFlowerType.lIlIlIIIllllII[15] = (0x4B ^ 0x44);
            EnumFlowerType.lIlIlIIIllllII[16] = (0xB9 ^ 0xA9);
            EnumFlowerType.lIlIlIIIllllII[17] = (0x5B ^ 0x4A);
            EnumFlowerType.lIlIlIIIllllII[18] = (93 + 126 - 60 + 11 ^ 115 + 138 - 148 + 79);
            EnumFlowerType.lIlIlIIIllllII[19] = (0xE ^ 0x7A ^ (0x5A ^ 0x3D));
            EnumFlowerType.lIlIlIIIllllII[20] = (0x3D ^ 0x7 ^ (0x8D ^ 0xA3));
            EnumFlowerType.lIlIlIIIllllII[21] = (0xAD ^ 0xB8);
            EnumFlowerType.lIlIlIIIllllII[22] = (0x29 ^ 0x3F);
            EnumFlowerType.lIlIlIIIllllII[23] = (0x4D ^ 0x5A);
            EnumFlowerType.lIlIlIIIllllII[24] = (178 + 72 - 116 + 46 ^ 59 + 64 - 28 + 77);
            EnumFlowerType.lIlIlIIIllllII[25] = (18 + 131 - 115 + 100 ^ 7 + 93 - 26 + 85);
            EnumFlowerType.lIlIlIIIllllII[26] = (0x4F ^ 0x55);
        }
        
        public static EnumFlowerType[] getTypes(final EnumFlowerColor lllllllllllllIIIlIlIIlIllIlIIlll) {
            return EnumFlowerType.TYPES_FOR_BLOCK[lllllllllllllIIIlIlIIlIllIlIIlll.ordinal()];
        }
        
        static {
            lllIlIlllllIlIl();
            lllIlIlIlllIlll();
            final EnumFlowerType[] enum$VALUES = new EnumFlowerType[EnumFlowerType.lIlIlIIIllllII[10]];
            enum$VALUES[EnumFlowerType.lIlIlIIIllllII[0]] = EnumFlowerType.DANDELION;
            enum$VALUES[EnumFlowerType.lIlIlIIIllllII[1]] = EnumFlowerType.POPPY;
            enum$VALUES[EnumFlowerType.lIlIlIIIllllII[2]] = EnumFlowerType.BLUE_ORCHID;
            enum$VALUES[EnumFlowerType.lIlIlIIIllllII[3]] = EnumFlowerType.ALLIUM;
            enum$VALUES[EnumFlowerType.lIlIlIIIllllII[4]] = EnumFlowerType.HOUSTONIA;
            enum$VALUES[EnumFlowerType.lIlIlIIIllllII[5]] = EnumFlowerType.RED_TULIP;
            enum$VALUES[EnumFlowerType.lIlIlIIIllllII[6]] = EnumFlowerType.ORANGE_TULIP;
            enum$VALUES[EnumFlowerType.lIlIlIIIllllII[7]] = EnumFlowerType.WHITE_TULIP;
            enum$VALUES[EnumFlowerType.lIlIlIIIllllII[8]] = EnumFlowerType.PINK_TULIP;
            enum$VALUES[EnumFlowerType.lIlIlIIIllllII[9]] = EnumFlowerType.OXEYE_DAISY;
            ENUM$VALUES = enum$VALUES;
            TYPES_FOR_BLOCK = new EnumFlowerType[EnumFlowerColor.values().length][];
            final float lllllllllllllIIIlIlIIlIlllIlllIl;
            final double lllllllllllllIIIlIlIIlIlllIllllI = ((EnumFlowerColor[])(Object)(lllllllllllllIIIlIlIIlIlllIlllIl = (float)(Object)EnumFlowerColor.values())).length;
            float lllllllllllllIIIlIlIIlIlllIlllll = EnumFlowerType.lIlIlIIIllllII[0];
            "".length();
            if (((0x2D ^ 0x3C) & ~(0xB9 ^ 0xA8)) < ((0x6B ^ 0x6F) & ~(0x1E ^ 0x1A))) {
                return;
            }
            while (!lllIlIlllllIllI((int)lllllllllllllIIIlIlIIlIlllIlllll, (int)lllllllllllllIIIlIlIIlIlllIllllI)) {
                final EnumFlowerColor lllllllllllllIIIlIlIIlIllllIIIlI = lllllllllllllIIIlIlIIlIlllIlllIl[lllllllllllllIIIlIlIIlIlllIlllll];
                final Collection<EnumFlowerType> lllllllllllllIIIlIlIIlIllllIIIIl = (Collection<EnumFlowerType>)Collections2.filter((Collection)Lists.newArrayList((Object[])values()), (Predicate)new Predicate<EnumFlowerType>() {
                    private final /* synthetic */ EnumFlowerColor val$blockflower$enumflowercolor;
                    private static final /* synthetic */ int[] lIIlllllIIIIII;
                    
                    private static void llIllllIIlIlIlI() {
                        (lIIlllllIIIIII = new int[2])[0] = " ".length();
                        BlockFlower$EnumFlowerType$1.lIIlllllIIIIII[1] = ((124 + 2 + 23 + 23 ^ 58 + 0 - 18 + 89) & (0x98 ^ 0xB8 ^ (0xA2 ^ 0xAF) ^ -" ".length()));
                    }
                    
                    private static boolean llIllllIIlIlIll(final Object lllllllllllllIIlIIlIIlIllllIllIl, final Object lllllllllllllIIlIIlIIlIllllIllII) {
                        return lllllllllllllIIlIIlIIlIllllIllIl == lllllllllllllIIlIIlIIlIllllIllII;
                    }
                    
                    public boolean apply(final EnumFlowerType lllllllllllllIIlIIlIIlIlllllIlII) {
                        if (llIllllIIlIlIll(lllllllllllllIIlIIlIIlIlllllIlII.getBlockType(), this.val$blockflower$enumflowercolor)) {
                            return BlockFlower$EnumFlowerType$1.lIIlllllIIIIII[0] != 0;
                        }
                        return BlockFlower$EnumFlowerType$1.lIIlllllIIIIII[1] != 0;
                    }
                    
                    static {
                        llIllllIIlIlIlI();
                    }
                });
                EnumFlowerType.TYPES_FOR_BLOCK[lllllllllllllIIIlIlIIlIllllIIIlI.ordinal()] = lllllllllllllIIIlIlIIlIllllIIIIl.toArray(new EnumFlowerType[lllllllllllllIIIlIlIIlIllllIIIIl.size()]);
                ++lllllllllllllIIIlIlIIlIlllIlllll;
            }
        }
        
        public static EnumFlowerType getType(final EnumFlowerColor lllllllllllllIIIlIlIIlIllIlIllII, int lllllllllllllIIIlIlIIlIllIlIlIll) {
            final EnumFlowerType[] lllllllllllllIIIlIlIIlIllIlIllIl = EnumFlowerType.TYPES_FOR_BLOCK[lllllllllllllIIIlIlIIlIllIlIllII.ordinal()];
            if (!lllIlIlllllIlll(lllllllllllllIIIlIlIIlIllIlIlIll) || lllIlIlllllIllI(lllllllllllllIIIlIlIIlIllIlIlIll, lllllllllllllIIIlIlIIlIllIlIllIl.length)) {
                lllllllllllllIIIlIlIIlIllIlIlIll = EnumFlowerType.lIlIlIIIllllII[0];
            }
            return lllllllllllllIIIlIlIIlIllIlIllIl[lllllllllllllIIIlIlIIlIllIlIlIll];
        }
        
        private static String lllIlIlIlllIIll(String lllllllllllllIIIlIlIIlIlIllllIIl, final String lllllllllllllIIIlIlIIlIlIllllIII) {
            lllllllllllllIIIlIlIIlIlIllllIIl = new String(Base64.getDecoder().decode(lllllllllllllIIIlIlIIlIlIllllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIIlIlIIlIlIlllllII = new StringBuilder();
            final char[] lllllllllllllIIIlIlIIlIlIllllIll = lllllllllllllIIIlIlIIlIlIllllIII.toCharArray();
            int lllllllllllllIIIlIlIIlIlIllllIlI = EnumFlowerType.lIlIlIIIllllII[0];
            final Exception lllllllllllllIIIlIlIIlIlIlllIlII = (Object)lllllllllllllIIIlIlIIlIlIllllIIl.toCharArray();
            final double lllllllllllllIIIlIlIIlIlIlllIIll = lllllllllllllIIIlIlIIlIlIlllIlII.length;
            byte lllllllllllllIIIlIlIIlIlIlllIIlI = (byte)EnumFlowerType.lIlIlIIIllllII[0];
            while (lllIlIllllllIII(lllllllllllllIIIlIlIIlIlIlllIIlI, (int)lllllllllllllIIIlIlIIlIlIlllIIll)) {
                final char lllllllllllllIIIlIlIIlIlIlllllll = lllllllllllllIIIlIlIIlIlIlllIlII[lllllllllllllIIIlIlIIlIlIlllIIlI];
                lllllllllllllIIIlIlIIlIlIlllllII.append((char)(lllllllllllllIIIlIlIIlIlIlllllll ^ lllllllllllllIIIlIlIIlIlIllllIll[lllllllllllllIIIlIlIIlIlIllllIlI % lllllllllllllIIIlIlIIlIlIllllIll.length]));
                "".length();
                ++lllllllllllllIIIlIlIIlIlIllllIlI;
                ++lllllllllllllIIIlIlIIlIlIlllIIlI;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIIlIlIIlIlIlllllII);
        }
        
        public int getMeta() {
            return this.meta;
        }
        
        @Override
        public String toString() {
            return this.name;
        }
        
        private static boolean lllIlIlllllIllI(final int lllllllllllllIIIlIlIIlIlIllIIIIl, final int lllllllllllllIIIlIlIIlIlIllIIIII) {
            return lllllllllllllIIIlIlIIlIlIllIIIIl >= lllllllllllllIIIlIlIIlIlIllIIIII;
        }
        
        private static String lllIlIlIllIlIll(final String lllllllllllllIIIlIlIIlIlIllIlIIl, final String lllllllllllllIIIlIlIIlIlIllIlIII) {
            try {
                final SecretKeySpec lllllllllllllIIIlIlIIlIlIllIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlIIlIlIllIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIIlIlIIlIlIllIlIll = Cipher.getInstance("Blowfish");
                lllllllllllllIIIlIlIIlIlIllIlIll.init(EnumFlowerType.lIlIlIIIllllII[2], lllllllllllllIIIlIlIIlIlIllIllII);
                return new String(lllllllllllllIIIlIlIIlIlIllIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlIIlIlIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIlIlIIlIlIllIlIlI) {
                lllllllllllllIIIlIlIIlIlIllIlIlI.printStackTrace();
                return null;
            }
        }
        
        private static boolean lllIlIllllllIII(final int lllllllllllllIIIlIlIIlIlIlIlllIl, final int lllllllllllllIIIlIlIIlIlIlIlllII) {
            return lllllllllllllIIIlIlIIlIlIlIlllIl < lllllllllllllIIIlIlIIlIlIlIlllII;
        }
        
        public String getUnlocalizedName() {
            return this.unlocalizedName;
        }
        
        private EnumFlowerType(final String lllllllllllllIIIlIlIIlIllIlllllI, final int lllllllllllllIIIlIlIIlIllIllllIl, final EnumFlowerColor lllllllllllllIIIlIlIIlIlllIIIIll, final int lllllllllllllIIIlIlIIlIllIlllIll, final String lllllllllllllIIIlIlIIlIllIlllIlI, final String lllllllllllllIIIlIlIIlIlllIIIIII) {
            this.blockType = lllllllllllllIIIlIlIIlIlllIIIIll;
            this.meta = lllllllllllllIIIlIlIIlIllIlllIll;
            this.name = lllllllllllllIIIlIlIIlIllIlllIlI;
            this.unlocalizedName = lllllllllllllIIIlIlIIlIlllIIIIII;
        }
        
        private static void lllIlIlIlllIlll() {
            (lIlIlIIIIllIII = new String[EnumFlowerType.lIlIlIIIllllII[26]])[EnumFlowerType.lIlIlIIIllllII[0]] = lllIlIlIllIlIll("nrdbWX5uSltQ3G6yqVL8FA==", "cFTWD");
            EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[1]] = lllIlIlIlllIIlI("dAhFGZNKhlKrlyK5+EsWeg==", "yUJXo");
            EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[2]] = lllIlIlIlllIIlI("hXKQTMYPrXU=", "AqxJH");
            EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[3]] = lllIlIlIlllIIll("NAwdBj0=", "DcmvD");
            EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[4]] = lllIlIlIlllIIlI("rIjdFDfCMXWXwZC06WZ3nw==", "Feynf");
            EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[5]] = lllIlIlIlllIIll("MgA9Lg4/HisjODQ=", "PlHKQ");
            EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[6]] = lllIlIlIllIlIll("hZZxrEIWlsQoqw0obTcCMw==", "hiDCa");
            EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[7]] = lllIlIlIlllIIlI("uFBAFjRS69I=", "MokdG");
            EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[8]] = lllIlIlIlllIIll("AigLAzMO", "cDgjF");
            EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[9]] = lllIlIlIlllIIlI("/lcr8T0yteDtXvz8IiFoew==", "WGpHv");
            EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[10]] = lllIlIlIlllIIll("IiwyATslLS4T", "JCGrO");
            EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[11]] = lllIlIlIllIlIll("SuUo7VOr3NfyVgHQzT/KVQ==", "zGtnc");
            EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[12]] = lllIlIlIlllIIll("KAotPQIvAyAS", "ZoIbv");
            EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[13]] = lllIlIlIlllIIll("IDQ+MQMGJDY=", "TARXs");
            EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[14]] = lllIlIlIlllIIlI("yqBjuKX6iSFFdrfABcoW/Q==", "OPbSK");
            EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[15]] = lllIlIlIlllIIlI("kVUg33zrrQxVxBuJ9XazMg==", "iAJMJ");
            EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[16]] = lllIlIlIllIlIll("4om+qm6uVDn/rKDxurb/rQ==", "Tiswf");
            EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[17]] = lllIlIlIllIlIll("Ak/FdsBMzwaMTBKPsabZVw==", "TLLfS");
            EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[18]] = lllIlIlIlllIIll("Eh8vNww6AzMvABU=", "ewFCi");
            EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[19]] = lllIlIlIlllIIll("IgAZJyYBHRw6Mw==", "VuuNV");
            EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[20]] = lllIlIlIllIlIll("Wvt4bq3563ZOqJxJr7nzAg==", "rUOFy");
            EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[21]] = lllIlIlIlllIIlI("RvZu/mWEyIuH5Z7hTBDBLw==", "NoDse");
            EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[22]] = lllIlIlIlllIIlI("ZvX9syD2IfyqTKWIf/iQwg==", "OQgJN");
            EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[23]] = lllIlIlIlllIIll("LT0rLAk9IS88Hzs=", "benuL");
            EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[24]] = lllIlIlIllIlIll("KeQKE2PUy3LRGfIm0cF92Q==", "UoeKQ");
            EnumFlowerType.lIlIlIIIIllIII[EnumFlowerType.lIlIlIIIllllII[25]] = lllIlIlIllIlIll("tCkYX5skFxN77vp310vUWg==", "aAaCm");
        }
        
        @Override
        public String getName() {
            return this.name;
        }
    }
    
    public enum EnumFlowerColor
    {
        private static final /* synthetic */ String[] llIlIllIllIlll;
        
        RED(EnumFlowerColor.llIlIllIllIlll[EnumFlowerColor.llIlIllIlllIII[1]], EnumFlowerColor.llIlIllIlllIII[1]), 
        YELLOW(EnumFlowerColor.llIlIllIllIlll[EnumFlowerColor.llIlIllIlllIII[0]], EnumFlowerColor.llIlIllIlllIII[0]);
        
        private static final /* synthetic */ int[] llIlIllIlllIII;
        
        private static String lIIlIlIlIllIllIl(final String llllllllllllIllIlIIlIlIlIIIIlIlI, final String llllllllllllIllIlIIlIlIlIIIIIlll) {
            try {
                final SecretKeySpec llllllllllllIllIlIIlIlIlIIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIlIlIlIIIIIlll.getBytes(StandardCharsets.UTF_8)), EnumFlowerColor.llIlIllIlllIII[3]), "DES");
                final Cipher llllllllllllIllIlIIlIlIlIIIIllII = Cipher.getInstance("DES");
                llllllllllllIllIlIIlIlIlIIIIllII.init(EnumFlowerColor.llIlIllIlllIII[2], llllllllllllIllIlIIlIlIlIIIIllIl);
                return new String(llllllllllllIllIlIIlIlIlIIIIllII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIlIlIlIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlIIlIlIlIIIIlIll) {
                llllllllllllIllIlIIlIlIlIIIIlIll.printStackTrace();
                return null;
            }
        }
        
        private EnumFlowerColor(final String llllllllllllIllIlIIlIlIlIIIllllI, final int llllllllllllIllIlIIlIlIlIIIlllIl) {
        }
        
        private static String lIIlIlIlIllIlllI(String llllllllllllIllIlIIlIlIIllllIlIl, final String llllllllllllIllIlIIlIlIIllllIlII) {
            llllllllllllIllIlIIlIlIIllllIlIl = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIIlIlIIllllIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIlIIlIlIIlllllIII = new StringBuilder();
            final char[] llllllllllllIllIlIIlIlIIllllIlll = llllllllllllIllIlIIlIlIIllllIlII.toCharArray();
            int llllllllllllIllIlIIlIlIIllllIllI = EnumFlowerColor.llIlIllIlllIII[0];
            final byte llllllllllllIllIlIIlIlIIllllIIII = (Object)((String)llllllllllllIllIlIIlIlIIllllIlIl).toCharArray();
            final String llllllllllllIllIlIIlIlIIlllIllll = (String)llllllllllllIllIlIIlIlIIllllIIII.length;
            String llllllllllllIllIlIIlIlIIlllIlllI = (String)EnumFlowerColor.llIlIllIlllIII[0];
            while (lIIlIlIlIlllIIll((int)llllllllllllIllIlIIlIlIIlllIlllI, (int)llllllllllllIllIlIIlIlIIlllIllll)) {
                final char llllllllllllIllIlIIlIlIIlllllIll = llllllllllllIllIlIIlIlIIllllIIII[llllllllllllIllIlIIlIlIIlllIlllI];
                llllllllllllIllIlIIlIlIIlllllIII.append((char)(llllllllllllIllIlIIlIlIIlllllIll ^ llllllllllllIllIlIIlIlIIllllIlll[llllllllllllIllIlIIlIlIIllllIllI % llllllllllllIllIlIIlIlIIllllIlll.length]));
                "".length();
                ++llllllllllllIllIlIIlIlIIllllIllI;
                ++llllllllllllIllIlIIlIlIIlllIlllI;
                "".length();
                if ((0x99 ^ 0xC4 ^ (0x68 ^ 0x30)) == 0x0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIlIIlIlIIlllllIII);
        }
        
        private static boolean lIIlIlIlIlllIIIl(final Object llllllllllllIllIlIIlIlIIlllIIllI, final Object llllllllllllIllIlIIlIlIIlllIIlIl) {
            return llllllllllllIllIlIIlIlIIlllIIllI == llllllllllllIllIlIIlIlIIlllIIlIl;
        }
        
        static {
            lIIlIlIlIlllIIII();
            lIIlIlIlIllIllll();
            final EnumFlowerColor[] enum$VALUES = new EnumFlowerColor[EnumFlowerColor.llIlIllIlllIII[2]];
            enum$VALUES[EnumFlowerColor.llIlIllIlllIII[0]] = EnumFlowerColor.YELLOW;
            enum$VALUES[EnumFlowerColor.llIlIllIlllIII[1]] = EnumFlowerColor.RED;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static void lIIlIlIlIlllIIII() {
            (llIlIllIlllIII = new int[4])[0] = ((0x72 ^ 0x4D) & ~(0x21 ^ 0x1E));
            EnumFlowerColor.llIlIllIlllIII[1] = " ".length();
            EnumFlowerColor.llIlIllIlllIII[2] = "  ".length();
            EnumFlowerColor.llIlIllIlllIII[3] = (0xB6 ^ 0xBE);
        }
        
        public BlockFlower getBlock() {
            BlockFlower blockFlower;
            if (lIIlIlIlIlllIIIl(this, EnumFlowerColor.YELLOW)) {
                blockFlower = Blocks.yellow_flower;
                "".length();
                if ("  ".length() < 0) {
                    return null;
                }
            }
            else {
                blockFlower = Blocks.red_flower;
            }
            return blockFlower;
        }
        
        private static void lIIlIlIlIllIllll() {
            (llIlIllIllIlll = new String[EnumFlowerColor.llIlIllIlllIII[2]])[EnumFlowerColor.llIlIllIlllIII[0]] = lIIlIlIlIllIllIl("WGQjWeyOjQg=", "rcfOJ");
            EnumFlowerColor.llIlIllIllIlll[EnumFlowerColor.llIlIllIlllIII[1]] = lIIlIlIlIllIlllI("Pj8m", "lzbJY");
        }
        
        private static boolean lIIlIlIlIlllIIll(final int llllllllllllIllIlIIlIlIIlllIlIlI, final int llllllllllllIllIlIIlIlIIlllIlIIl) {
            return llllllllllllIllIlIIlIlIIlllIlIlI < llllllllllllIllIlIIlIlIIlllIlIIl;
        }
    }
}
