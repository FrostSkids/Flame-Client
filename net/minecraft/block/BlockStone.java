// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.IStringSerializable;
import net.minecraft.util.StatCollector;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import java.util.Random;
import net.minecraft.block.material.MapColor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyEnum;

public class BlockStone extends Block
{
    private static final /* synthetic */ String[] llIlIIlIIllIlI;
    private static final /* synthetic */ int[] llIlIIlIIlllII;
    public static final /* synthetic */ PropertyEnum<EnumType> VARIANT;
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIllIllIIIlIlIIIIlllI) {
        return this.getDefaultState().withProperty(BlockStone.VARIANT, EnumType.byMetadata(llllllllllllIllIllIIIlIlIIIIlllI));
    }
    
    private static boolean lIIlIIlIlIIIIIIl(final Object llllllllllllIllIllIIIlIIllIlIlll, final Object llllllllllllIllIllIIIlIIllIlIllI) {
        return llllllllllllIllIllIIIlIIllIlIlll == llllllllllllIllIllIIIlIIllIlIllI;
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIllIllIIIlIlIIIIlIlI) {
        return llllllllllllIllIllIIIlIlIIIIlIlI.getValue(BlockStone.VARIANT).getMetadata();
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockStone.llIlIIlIIlllII[1]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockStone.llIlIIlIIlllII[0]] = BlockStone.VARIANT;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static boolean lIIlIIlIlIIIIIlI(final int llllllllllllIllIllIIIlIIllIlllll, final int llllllllllllIllIllIIIlIIllIllllI) {
        return llllllllllllIllIllIIIlIIllIlllll >= llllllllllllIllIllIIIlIIllIllllI;
    }
    
    private static void lIIlIIlIlIIIIIII() {
        (llIlIIlIIlllII = new int[5])[0] = ((0x6B ^ 0x41) & ~(0x52 ^ 0x78));
        BlockStone.llIlIIlIIlllII[1] = " ".length();
        BlockStone.llIlIIlIIlllII[2] = "  ".length();
        BlockStone.llIlIIlIIlllII[3] = "   ".length();
        BlockStone.llIlIIlIIlllII[4] = (146 + 130 - 167 + 76 ^ 17 + 33 + 60 + 67);
    }
    
    private static boolean lIIlIIlIlIIIIIll(final int llllllllllllIllIllIIIlIIllIllIll, final int llllllllllllIllIllIIIlIIllIllIlI) {
        return llllllllllllIllIllIIIlIIllIllIll < llllllllllllIllIllIIIlIIllIllIlI;
    }
    
    private static String lIIlIIlIIllllIll(String llllllllllllIllIllIIIlIIllllIlll, final String llllllllllllIllIllIIIlIIlllllIll) {
        llllllllllllIllIllIIIlIIllllIlll = new String(Base64.getDecoder().decode(llllllllllllIllIllIIIlIIllllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIllIIIlIIlllllIlI = new StringBuilder();
        final char[] llllllllllllIllIllIIIlIIlllllIIl = llllllllllllIllIllIIIlIIlllllIll.toCharArray();
        int llllllllllllIllIllIIIlIIlllllIII = BlockStone.llIlIIlIIlllII[0];
        final short llllllllllllIllIllIIIlIIllllIIlI = (Object)llllllllllllIllIllIIIlIIllllIlll.toCharArray();
        final char llllllllllllIllIllIIIlIIllllIIIl = (char)llllllllllllIllIllIIIlIIllllIIlI.length;
        char llllllllllllIllIllIIIlIIllllIIII = (char)BlockStone.llIlIIlIIlllII[0];
        while (lIIlIIlIlIIIIIll(llllllllllllIllIllIIIlIIllllIIII, llllllllllllIllIllIIIlIIllllIIIl)) {
            final char llllllllllllIllIllIIIlIIllllllIl = llllllllllllIllIllIIIlIIllllIIlI[llllllllllllIllIllIIIlIIllllIIII];
            llllllllllllIllIllIIIlIIlllllIlI.append((char)(llllllllllllIllIllIIIlIIllllllIl ^ llllllllllllIllIllIIIlIIlllllIIl[llllllllllllIllIllIIIlIIlllllIII % llllllllllllIllIllIIIlIIlllllIIl.length]));
            "".length();
            ++llllllllllllIllIllIIIlIIlllllIII;
            ++llllllllllllIllIllIIIlIIllllIIII;
            "".length();
            if (-(0xA0 ^ 0xA5) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIllIIIlIIlllllIlI);
    }
    
    public BlockStone() {
        super(Material.rock);
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockStone.VARIANT, EnumType.STONE));
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    @Override
    public MapColor getMapColor(final IBlockState llllllllllllIllIllIIIlIlIIlIllll) {
        return llllllllllllIllIllIIIlIlIIlIllll.getValue(BlockStone.VARIANT).func_181072_c();
    }
    
    @Override
    public Item getItemDropped(final IBlockState llllllllllllIllIllIIIlIlIIlIlIIl, final Random llllllllllllIllIllIIIlIlIIlIlIll, final int llllllllllllIllIllIIIlIlIIlIlIlI) {
        Item item;
        if (lIIlIIlIlIIIIIIl(llllllllllllIllIllIIIlIlIIlIlIIl.getValue(BlockStone.VARIANT), EnumType.STONE)) {
            item = Item.getItemFromBlock(Blocks.cobblestone);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            item = Item.getItemFromBlock(Blocks.stone);
        }
        return item;
    }
    
    @Override
    public void getSubBlocks(final Item llllllllllllIllIllIIIlIlIIIllIIl, final CreativeTabs llllllllllllIllIllIIIlIlIIIlllII, final List<ItemStack> llllllllllllIllIllIIIlIlIIIllIII) {
        final byte llllllllllllIllIllIIIlIlIIIlIlII;
        final byte llllllllllllIllIllIIIlIlIIIlIlIl = (byte)((EnumType[])(Object)(llllllllllllIllIllIIIlIlIIIlIlII = (byte)(Object)EnumType.values())).length;
        byte llllllllllllIllIllIIIlIlIIIlIllI = (byte)BlockStone.llIlIIlIIlllII[0];
        "".length();
        if (" ".length() <= -" ".length()) {
            return;
        }
        while (!lIIlIIlIlIIIIIlI(llllllllllllIllIllIIIlIlIIIlIllI, llllllllllllIllIllIIIlIlIIIlIlIl)) {
            final EnumType llllllllllllIllIllIIIlIlIIIllIlI = llllllllllllIllIllIIIlIlIIIlIlII[llllllllllllIllIllIIIlIlIIIlIllI];
            llllllllllllIllIllIIIlIlIIIllIII.add(new ItemStack(llllllllllllIllIllIIIlIlIIIllIIl, BlockStone.llIlIIlIIlllII[1], llllllllllllIllIllIIIlIlIIIllIlI.getMetadata()));
            "".length();
            ++llllllllllllIllIllIIIlIlIIIlIllI;
        }
    }
    
    static {
        lIIlIIlIlIIIIIII();
        lIIlIIlIIlllllII();
        VARIANT = PropertyEnum.create(BlockStone.llIlIIlIIllIlI[BlockStone.llIlIIlIIlllII[0]], EnumType.class);
    }
    
    @Override
    public int damageDropped(final IBlockState llllllllllllIllIllIIIlIlIIlIIlIl) {
        return llllllllllllIllIllIIIlIlIIlIIlIl.getValue(BlockStone.VARIANT).getMetadata();
    }
    
    private static String lIIlIIlIIllllIlI(final String llllllllllllIllIllIIIlIIlllIIlIl, final String llllllllllllIllIllIIIlIIlllIIllI) {
        try {
            final SecretKeySpec llllllllllllIllIllIIIlIIlllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIIlIIlllIIllI.getBytes(StandardCharsets.UTF_8)), BlockStone.llIlIIlIIlllII[4]), "DES");
            final Cipher llllllllllllIllIllIIIlIIlllIlIIl = Cipher.getInstance("DES");
            llllllllllllIllIllIIIlIIlllIlIIl.init(BlockStone.llIlIIlIIlllII[2], llllllllllllIllIllIIIlIIlllIlIlI);
            return new String(llllllllllllIllIllIIIlIIlllIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIIlIIlllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIIIlIIlllIlIII) {
            llllllllllllIllIllIIIlIIlllIlIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String getLocalizedName() {
        return StatCollector.translateToLocal(String.valueOf(new StringBuilder(String.valueOf(this.getUnlocalizedName())).append(BlockStone.llIlIIlIIllIlI[BlockStone.llIlIIlIIlllII[1]]).append(EnumType.STONE.getUnlocalizedName()).append(BlockStone.llIlIIlIIllIlI[BlockStone.llIlIIlIIlllII[2]])));
    }
    
    private static void lIIlIIlIIlllllII() {
        (llIlIIlIIllIlI = new String[BlockStone.llIlIIlIIlllII[3]])[BlockStone.llIlIIlIIlllII[0]] = lIIlIIlIIllllIlI("pxbWGEHdulA=", "lpkHg");
        BlockStone.llIlIIlIIllIlI[BlockStone.llIlIIlIIlllII[1]] = lIIlIIlIIllllIll("bA==", "BrdjX");
        BlockStone.llIlIIlIIllIlI[BlockStone.llIlIIlIIlllII[2]] = lIIlIIlIIllllIlI("5bH3Ofx4K9o=", "PYWIY");
    }
    
    public enum EnumType implements IStringSerializable
    {
        private final /* synthetic */ String name;
        
        DIORITE(EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[7]], EnumType.llIIlIIlIIIIll[3], EnumType.llIIlIIlIIIIll[3], MapColor.quartzColor, EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[8]]), 
        GRANITE_SMOOTH(EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[4]], EnumType.llIIlIIlIIIIll[2], EnumType.llIIlIIlIIIIll[2], MapColor.dirtColor, EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[5]], EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[6]]);
        
        private static final /* synthetic */ EnumType[] META_LOOKUP;
        private final /* synthetic */ MapColor field_181073_l;
        
        DIORITE_SMOOTH(EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[9]], EnumType.llIIlIIlIIIIll[4], EnumType.llIIlIIlIIIIll[4], MapColor.quartzColor, EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[10]], EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[11]]);
        
        private final /* synthetic */ String unlocalizedName;
        
        GRANITE(EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[2]], EnumType.llIIlIIlIIIIll[1], EnumType.llIIlIIlIIIIll[1], MapColor.dirtColor, EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[3]]);
        
        private static final /* synthetic */ int[] llIIlIIlIIIIll;
        private static final /* synthetic */ String[] llIIlIIlIIIIlI;
        private final /* synthetic */ int meta;
        
        STONE(EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[0]], EnumType.llIIlIIlIIIIll[0], EnumType.llIIlIIlIIIIll[0], MapColor.stoneColor, EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[1]]), 
        ANDESITE_SMOOTH(EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[14]], EnumType.llIIlIIlIIIIll[6], EnumType.llIIlIIlIIIIll[6], MapColor.stoneColor, EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[15]], EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[16]]), 
        ANDESITE(EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[12]], EnumType.llIIlIIlIIIIll[5], EnumType.llIIlIIlIIIIll[5], MapColor.stoneColor, EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[13]]);
        
        public static EnumType byMetadata(int llllllllllllIlllIIlIllIIlllIlIll) {
            if (!lIIIllIIIIllIIIl((int)llllllllllllIlllIIlIllIIlllIlIll) || lIIIllIIIIllIIII((int)llllllllllllIlllIIlIllIIlllIlIll, EnumType.META_LOOKUP.length)) {
                llllllllllllIlllIIlIllIIlllIlIll = EnumType.llIIlIIlIIIIll[0];
            }
            return EnumType.META_LOOKUP[llllllllllllIlllIIlIllIIlllIlIll];
        }
        
        private EnumType(final String llllllllllllIlllIIlIllIlIIIIlllI, final int llllllllllllIlllIIlIllIlIIIIllIl, final int llllllllllllIlllIIlIllIlIIIlIIlI, final MapColor llllllllllllIlllIIlIllIlIIIlIIIl, final String llllllllllllIlllIIlIllIlIIIIlIlI) {
            this(llllllllllllIlllIIlIllIlIIIIlllI, llllllllllllIlllIIlIllIlIIIIllIl, llllllllllllIlllIIlIllIlIIIlIIlI, llllllllllllIlllIIlIllIlIIIlIIIl, llllllllllllIlllIIlIllIlIIIIlIlI, llllllllllllIlllIIlIllIlIIIIlIlI);
        }
        
        private EnumType(final String llllllllllllIlllIIlIllIIllllllII, final int llllllllllllIlllIIlIllIIlllllIll, final int llllllllllllIlllIIlIllIlIIIIIIIl, final MapColor llllllllllllIlllIIlIllIIlllllIIl, final String llllllllllllIlllIIlIllIIllllllll, final String llllllllllllIlllIIlIllIIlllllllI) {
            this.meta = llllllllllllIlllIIlIllIlIIIIIIIl;
            this.name = llllllllllllIlllIIlIllIIllllllll;
            this.unlocalizedName = llllllllllllIlllIIlIllIIlllllllI;
            this.field_181073_l = llllllllllllIlllIIlIllIIlllllIIl;
        }
        
        private static boolean lIIIllIIIIllIIIl(final int llllllllllllIlllIIlIllIIlIlIIIIl) {
            return llllllllllllIlllIIlIllIIlIlIIIIl >= 0;
        }
        
        private static void lIIIllIIIIlIllll() {
            (llIIlIIlIIIIll = new int[18])[0] = ((0x1C ^ 0x73 ^ (0xA2 ^ 0xC1)) & (110 + 140 - 164 + 59 ^ 149 + 9 - 124 + 123 ^ -" ".length()));
            EnumType.llIIlIIlIIIIll[1] = " ".length();
            EnumType.llIIlIIlIIIIll[2] = "  ".length();
            EnumType.llIIlIIlIIIIll[3] = "   ".length();
            EnumType.llIIlIIlIIIIll[4] = (0x84 ^ 0xA8 ^ (0x95 ^ 0xBD));
            EnumType.llIIlIIlIIIIll[5] = (92 + 21 - 66 + 138 ^ 57 + 77 + 1 + 53);
            EnumType.llIIlIIlIIIIll[6] = (0xA7 ^ 0xA1);
            EnumType.llIIlIIlIIIIll[7] = (0x5 ^ 0x9 ^ (0xB3 ^ 0xB8));
            EnumType.llIIlIIlIIIIll[8] = (0x12 ^ 0x1D ^ (0x31 ^ 0x36));
            EnumType.llIIlIIlIIIIll[9] = (0x1B ^ 0x26 ^ (0xB1 ^ 0x85));
            EnumType.llIIlIIlIIIIll[10] = (0x43 ^ 0x49);
            EnumType.llIIlIIlIIIIll[11] = (0xA0 ^ 0xAB);
            EnumType.llIIlIIlIIIIll[12] = (118 + 92 - 5 + 1 ^ 76 + 3 + 23 + 92);
            EnumType.llIIlIIlIIIIll[13] = (0xCE ^ 0xC3);
            EnumType.llIIlIIlIIIIll[14] = (0xCA ^ 0xC4);
            EnumType.llIIlIIlIIIIll[15] = (0xB5 ^ 0xBA);
            EnumType.llIIlIIlIIIIll[16] = (0x68 ^ 0x78);
            EnumType.llIIlIIlIIIIll[17] = (0xA4 ^ 0xB5);
        }
        
        public int getMetadata() {
            return this.meta;
        }
        
        @Override
        public String toString() {
            return this.name;
        }
        
        public MapColor func_181072_c() {
            return this.field_181073_l;
        }
        
        private static String lIIIllIIIIlIllIl(final String llllllllllllIlllIIlIllIIllIlIlIl, final String llllllllllllIlllIIlIllIIllIlIIlI) {
            try {
                final SecretKeySpec llllllllllllIlllIIlIllIIllIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlIllIIllIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlllIIlIllIIllIlIlll = Cipher.getInstance("Blowfish");
                llllllllllllIlllIIlIllIIllIlIlll.init(EnumType.llIIlIIlIIIIll[2], llllllllllllIlllIIlIllIIllIllIII);
                return new String(llllllllllllIlllIIlIllIIllIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlIllIIllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIIlIllIIllIlIllI) {
                llllllllllllIlllIIlIllIIllIlIllI.printStackTrace();
                return null;
            }
        }
        
        @Override
        public String getName() {
            return this.name;
        }
        
        private static boolean lIIIllIIIIllIIlI(final int llllllllllllIlllIIlIllIIlIlIIlII, final int llllllllllllIlllIIlIllIIlIlIIIll) {
            return llllllllllllIlllIIlIllIIlIlIIlII < llllllllllllIlllIIlIllIIlIlIIIll;
        }
        
        private static boolean lIIIllIIIIllIIII(final int llllllllllllIlllIIlIllIIlIlIlIII, final int llllllllllllIlllIIlIllIIlIlIIlll) {
            return llllllllllllIlllIIlIllIIlIlIlIII >= llllllllllllIlllIIlIllIIlIlIIlll;
        }
        
        private static void lIIIllIIIIlIlllI() {
            (llIIlIIlIIIIlI = new String[EnumType.llIIlIIlIIIIll[17]])[EnumType.llIIlIIlIIIIll[0]] = lIIIllIIIIlIlIll("BRkVJCw=", "VMZji");
            EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[1]] = lIIIllIIIIlIlIll("BRcJByw=", "vcfiI");
            EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[2]] = lIIIllIIIIlIllII("8OUEBdXxvhg=", "yEbqQ");
            EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[3]] = lIIIllIIIIlIlIll("ChoDBiQZDQ==", "mhbhM");
            EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[4]] = lIIIllIIIIlIllIl("mi6FhSjOvpM/vROuZ/iP3w==", "sRkZT");
            EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[5]] = lIIIllIIIIlIlIll("HhcGASAFJQ4cNQMTHQs=", "mzinT");
            EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[6]] = lIIIllIIIIlIllIl("eouX4u9b23SdMO5Yy2ZzVg==", "ZCGCM");
            EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[7]] = lIIIllIIIIlIllII("ZbqFStNGz3o=", "VvfEF");
            EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[8]] = lIIIllIIIIlIllIl("inxwPR+IgY4=", "OetKZ");
            EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[9]] = lIIIllIIIIlIllIl("z/2o0diIw6GHSGej5leWXA==", "SHBvu");
            EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[10]] = lIIIllIIIIlIlIll("KyoGPRkwGA07AiouHTc=", "XGiRm");
            EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[11]] = lIIIllIIIIlIlIll("JRoEBxM1FjgYFS4HAw==", "Askuz");
            EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[12]] = lIIIllIIIIlIlIll("EggQCCQaEhE=", "SFTMw");
            EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[13]] = lIIIllIIIIlIllIl("1inTPfH9lqYYcN6Puoi8wg==", "zbjOV");
            EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[14]] = lIIIllIIIIlIllII("/azVU4bh91G+Nh31y+TafA==", "dmJoZ");
            EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[15]] = lIIIllIIIIlIlIll("GhcmCxgBJSgKCAwJIBAJ", "izIdl");
            EnumType.llIIlIIlIIIIlI[EnumType.llIIlIIlIIIIll[16]] = lIIIllIIIIlIllII("+2Cy+IOwFm6UXeLwqqPoVA==", "jSUnw");
        }
        
        static {
            lIIIllIIIIlIllll();
            lIIIllIIIIlIlllI();
            final EnumType[] enum$VALUES = new EnumType[EnumType.llIIlIIlIIIIll[7]];
            enum$VALUES[EnumType.llIIlIIlIIIIll[0]] = EnumType.STONE;
            enum$VALUES[EnumType.llIIlIIlIIIIll[1]] = EnumType.GRANITE;
            enum$VALUES[EnumType.llIIlIIlIIIIll[2]] = EnumType.GRANITE_SMOOTH;
            enum$VALUES[EnumType.llIIlIIlIIIIll[3]] = EnumType.DIORITE;
            enum$VALUES[EnumType.llIIlIIlIIIIll[4]] = EnumType.DIORITE_SMOOTH;
            enum$VALUES[EnumType.llIIlIIlIIIIll[5]] = EnumType.ANDESITE;
            enum$VALUES[EnumType.llIIlIIlIIIIll[6]] = EnumType.ANDESITE_SMOOTH;
            ENUM$VALUES = enum$VALUES;
            META_LOOKUP = new EnumType[values().length];
            final float llllllllllllIlllIIlIllIlIIIllIlI;
            final boolean llllllllllllIlllIIlIllIlIIIllIll = ((EnumType[])(Object)(llllllllllllIlllIIlIllIlIIIllIlI = (float)(Object)values())).length != 0;
            boolean llllllllllllIlllIIlIllIlIIIlllII = EnumType.llIIlIIlIIIIll[0] != 0;
            "".length();
            if ("  ".length() <= " ".length()) {
                return;
            }
            while (!lIIIllIIIIllIIII(llllllllllllIlllIIlIllIlIIIlllII ? 1 : 0, llllllllllllIlllIIlIllIlIIIllIll ? 1 : 0)) {
                final EnumType llllllllllllIlllIIlIllIlIIIllllI = llllllllllllIlllIIlIllIlIIIllIlI[llllllllllllIlllIIlIllIlIIIlllII];
                EnumType.META_LOOKUP[llllllllllllIlllIIlIllIlIIIllllI.getMetadata()] = llllllllllllIlllIIlIllIlIIIllllI;
                ++llllllllllllIlllIIlIllIlIIIlllII;
            }
        }
        
        private static String lIIIllIIIIlIlIll(String llllllllllllIlllIIlIllIIlIllIIll, final String llllllllllllIlllIIlIllIIlIllIIlI) {
            llllllllllllIlllIIlIllIIlIllIIll = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIIlIllIIlIllIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlllIIlIllIIlIllIllI = new StringBuilder();
            final char[] llllllllllllIlllIIlIllIIlIllIlIl = llllllllllllIlllIIlIllIIlIllIIlI.toCharArray();
            int llllllllllllIlllIIlIllIIlIllIlII = EnumType.llIIlIIlIIIIll[0];
            final char llllllllllllIlllIIlIllIIlIlIlllI = (Object)((String)llllllllllllIlllIIlIllIIlIllIIll).toCharArray();
            final boolean llllllllllllIlllIIlIllIIlIlIllIl = llllllllllllIlllIIlIllIIlIlIlllI.length != 0;
            byte llllllllllllIlllIIlIllIIlIlIllII = (byte)EnumType.llIIlIIlIIIIll[0];
            while (lIIIllIIIIllIIlI(llllllllllllIlllIIlIllIIlIlIllII, llllllllllllIlllIIlIllIIlIlIllIl ? 1 : 0)) {
                final char llllllllllllIlllIIlIllIIlIlllIIl = llllllllllllIlllIIlIllIIlIlIlllI[llllllllllllIlllIIlIllIIlIlIllII];
                llllllllllllIlllIIlIllIIlIllIllI.append((char)(llllllllllllIlllIIlIllIIlIlllIIl ^ llllllllllllIlllIIlIllIIlIllIlIl[llllllllllllIlllIIlIllIIlIllIlII % llllllllllllIlllIIlIllIIlIllIlIl.length]));
                "".length();
                ++llllllllllllIlllIIlIllIIlIllIlII;
                ++llllllllllllIlllIIlIllIIlIlIllII;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlllIIlIllIIlIllIllI);
        }
        
        public String getUnlocalizedName() {
            return this.unlocalizedName;
        }
        
        private static String lIIIllIIIIlIllII(final String llllllllllllIlllIIlIllIIllIIlIII, final String llllllllllllIlllIIlIllIIllIIIlIl) {
            try {
                final SecretKeySpec llllllllllllIlllIIlIllIIllIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlIllIIllIIIlIl.getBytes(StandardCharsets.UTF_8)), EnumType.llIIlIIlIIIIll[8]), "DES");
                final Cipher llllllllllllIlllIIlIllIIllIIlIlI = Cipher.getInstance("DES");
                llllllllllllIlllIIlIllIIllIIlIlI.init(EnumType.llIIlIIlIIIIll[2], llllllllllllIlllIIlIllIIllIIlIll);
                return new String(llllllllllllIlllIIlIllIIllIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlIllIIllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIIlIllIIllIIlIIl) {
                llllllllllllIlllIIlIllIIllIIlIIl.printStackTrace();
                return null;
            }
        }
    }
}
