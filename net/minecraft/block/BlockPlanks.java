// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.IStringSerializable;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.item.Item;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyEnum;

public class BlockPlanks extends Block
{
    private static final /* synthetic */ String[] lIlIllllIlIlIl;
    public static final /* synthetic */ PropertyEnum<EnumType> VARIANT;
    private static final /* synthetic */ int[] lIlIllllIlIllI;
    
    @Override
    public MapColor getMapColor(final IBlockState lllllllllllllIIIIlIlIIIlIllIIllI) {
        return lllllllllllllIIIIlIlIIIlIllIIllI.getValue(BlockPlanks.VARIANT).func_181070_c();
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIIIlIlIIIlIllIlIlI) {
        return this.getDefaultState().withProperty(BlockPlanks.VARIANT, EnumType.byMetadata(lllllllllllllIIIIlIlIIIlIllIlIlI));
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockPlanks.lIlIllllIlIllI[1]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockPlanks.lIlIllllIlIllI[0]] = BlockPlanks.VARIANT;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static void llllIlIIllIIlll() {
        (lIlIllllIlIlIl = new String[BlockPlanks.lIlIllllIlIllI[1]])[BlockPlanks.lIlIllllIlIllI[0]] = llllIlIIllIIllI("bMEcLhgo/4o=", "oZzle");
    }
    
    public BlockPlanks() {
        super(Material.wood);
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockPlanks.VARIANT, EnumType.OAK));
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    private static void llllIlIIllIlIII() {
        (lIlIllllIlIllI = new int[4])[0] = ((0x7A ^ 0x46) & ~(0x7F ^ 0x43));
        BlockPlanks.lIlIllllIlIllI[1] = " ".length();
        BlockPlanks.lIlIllllIlIllI[2] = (0xA2 ^ 0xAA);
        BlockPlanks.lIlIllllIlIllI[3] = "  ".length();
    }
    
    private static boolean llllIlIIllIlIIl(final int lllllllllllllIIIIlIlIIIlIlIIllll, final int lllllllllllllIIIIlIlIIIlIlIIlllI) {
        return lllllllllllllIIIIlIlIIIlIlIIllll >= lllllllllllllIIIIlIlIIIlIlIIlllI;
    }
    
    private static String llllIlIIllIIllI(final String lllllllllllllIIIIlIlIIIlIlIlIlll, final String lllllllllllllIIIIlIlIIIlIlIlIllI) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIlIIIlIlIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIlIIIlIlIlIllI.getBytes(StandardCharsets.UTF_8)), BlockPlanks.lIlIllllIlIllI[2]), "DES");
            final Cipher lllllllllllllIIIIlIlIIIlIlIllIIl = Cipher.getInstance("DES");
            lllllllllllllIIIIlIlIIIlIlIllIIl.init(BlockPlanks.lIlIllllIlIllI[3], lllllllllllllIIIIlIlIIIlIlIllIlI);
            return new String(lllllllllllllIIIIlIlIIIlIlIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIlIIIlIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIlIIIlIlIllIII) {
            lllllllllllllIIIIlIlIIIlIlIllIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void getSubBlocks(final Item lllllllllllllIIIIlIlIIIlIllllIIl, final CreativeTabs lllllllllllllIIIIlIlIIIlIllllIII, final List<ItemStack> lllllllllllllIIIIlIlIIIlIlllIlII) {
        final String lllllllllllllIIIIlIlIIIlIlllIIII;
        final String lllllllllllllIIIIlIlIIIlIlllIIIl = (String)((EnumType[])(Object)(lllllllllllllIIIIlIlIIIlIlllIIII = (String)(Object)EnumType.values())).length;
        short lllllllllllllIIIIlIlIIIlIlllIIlI = (short)BlockPlanks.lIlIllllIlIllI[0];
        "".length();
        if ("  ".length() == 0) {
            return;
        }
        while (!llllIlIIllIlIIl(lllllllllllllIIIIlIlIIIlIlllIIlI, (int)lllllllllllllIIIIlIlIIIlIlllIIIl)) {
            final EnumType lllllllllllllIIIIlIlIIIlIlllIllI = lllllllllllllIIIIlIlIIIlIlllIIII[lllllllllllllIIIIlIlIIIlIlllIIlI];
            lllllllllllllIIIIlIlIIIlIlllIlII.add(new ItemStack(lllllllllllllIIIIlIlIIIlIllllIIl, BlockPlanks.lIlIllllIlIllI[1], lllllllllllllIIIIlIlIIIlIlllIllI.getMetadata()));
            "".length();
            ++lllllllllllllIIIIlIlIIIlIlllIIlI;
        }
    }
    
    @Override
    public int damageDropped(final IBlockState lllllllllllllIIIIlIlIIIllIIIIIIl) {
        return lllllllllllllIIIIlIlIIIllIIIIIIl.getValue(BlockPlanks.VARIANT).getMetadata();
    }
    
    static {
        llllIlIIllIlIII();
        llllIlIIllIIlll();
        VARIANT = PropertyEnum.create(BlockPlanks.lIlIllllIlIlIl[BlockPlanks.lIlIllllIlIllI[0]], EnumType.class);
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIIIlIlIIIlIllIIIll) {
        return lllllllllllllIIIIlIlIIIlIllIIIll.getValue(BlockPlanks.VARIANT).getMetadata();
    }
    
    public enum EnumType implements IStringSerializable
    {
        private final /* synthetic */ MapColor field_181071_k;
        private final /* synthetic */ String unlocalizedName;
        
        SPRUCE(EnumType.llIlIlIlIllIIl[EnumType.llIlIlIllIIIII[2]], EnumType.llIlIlIllIIIII[1], EnumType.llIlIlIllIIIII[1], EnumType.llIlIlIlIllIIl[EnumType.llIlIlIllIIIII[3]], MapColor.obsidianColor);
        
        private final /* synthetic */ String name;
        private final /* synthetic */ int meta;
        
        JUNGLE(EnumType.llIlIlIlIllIIl[EnumType.llIlIlIllIIIII[6]], EnumType.llIlIlIllIIIII[3], EnumType.llIlIlIllIIIII[3], EnumType.llIlIlIlIllIIl[EnumType.llIlIlIllIIIII[7]], MapColor.dirtColor), 
        DARK_OAK(EnumType.llIlIlIlIllIIl[EnumType.llIlIlIllIIIII[10]], EnumType.llIlIlIllIIIII[5], EnumType.llIlIlIllIIIII[5], EnumType.llIlIlIlIllIIl[EnumType.llIlIlIllIIIII[11]], EnumType.llIlIlIlIllIIl[EnumType.llIlIlIllIIIII[12]], MapColor.brownColor), 
        ACACIA(EnumType.llIlIlIlIllIIl[EnumType.llIlIlIllIIIII[8]], EnumType.llIlIlIllIIIII[4], EnumType.llIlIlIllIIIII[4], EnumType.llIlIlIlIllIIl[EnumType.llIlIlIllIIIII[9]], MapColor.adobeColor);
        
        private static final /* synthetic */ String[] llIlIlIlIllIIl;
        private static final /* synthetic */ EnumType[] META_LOOKUP;
        
        OAK(EnumType.llIlIlIlIllIIl[EnumType.llIlIlIllIIIII[0]], EnumType.llIlIlIllIIIII[0], EnumType.llIlIlIllIIIII[0], EnumType.llIlIlIlIllIIl[EnumType.llIlIlIllIIIII[1]], MapColor.woodColor), 
        BIRCH(EnumType.llIlIlIlIllIIl[EnumType.llIlIlIllIIIII[4]], EnumType.llIlIlIllIIIII[2], EnumType.llIlIlIllIIIII[2], EnumType.llIlIlIlIllIIl[EnumType.llIlIlIllIIIII[5]], MapColor.sandColor);
        
        private static final /* synthetic */ int[] llIlIlIllIIIII;
        
        public String getUnlocalizedName() {
            return this.unlocalizedName;
        }
        
        private static void lIIlIlIIIllllIIl() {
            (llIlIlIllIIIII = new int[14])[0] = ((0x2B ^ 0x7E) & ~(0x3D ^ 0x68));
            EnumType.llIlIlIllIIIII[1] = " ".length();
            EnumType.llIlIlIllIIIII[2] = "  ".length();
            EnumType.llIlIlIllIIIII[3] = "   ".length();
            EnumType.llIlIlIllIIIII[4] = (0x6A ^ 0x6E);
            EnumType.llIlIlIllIIIII[5] = (0xC3 ^ 0xC6);
            EnumType.llIlIlIllIIIII[6] = (0xC2 ^ 0xC4);
            EnumType.llIlIlIllIIIII[7] = (0x30 ^ 0x37);
            EnumType.llIlIlIllIIIII[8] = (0x66 ^ 0x6E);
            EnumType.llIlIlIllIIIII[9] = (0x77 ^ 0x7E);
            EnumType.llIlIlIllIIIII[10] = (0xF0 ^ 0xC5 ^ (0xFE ^ 0xC1));
            EnumType.llIlIlIllIIIII[11] = (0xCD ^ 0xA9 ^ (0xAE ^ 0xC1));
            EnumType.llIlIlIllIIIII[12] = (0xED ^ 0xC4 ^ (0xA8 ^ 0x8D));
            EnumType.llIlIlIllIIIII[13] = (0x2 ^ 0x3F ^ (0x8F ^ 0xBF));
        }
        
        private static String lIIlIlIIIllIlIIl(final String llllllllllllIllIlIlIIIllllIIIIlI, final String llllllllllllIllIlIlIIIllllIIIIll) {
            try {
                final SecretKeySpec llllllllllllIllIlIlIIIllllIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIIIllllIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIlIlIIIllllIIIllI = Cipher.getInstance("Blowfish");
                llllllllllllIllIlIlIIIllllIIIllI.init(EnumType.llIlIlIllIIIII[2], llllllllllllIllIlIlIIIllllIIIlll);
                return new String(llllllllllllIllIlIlIIIllllIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIIIllllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlIlIIIllllIIIlIl) {
                llllllllllllIllIlIlIIIllllIIIlIl.printStackTrace();
                return null;
            }
        }
        
        private static void lIIlIlIIIlllIlII() {
            (llIlIlIlIllIIl = new String[EnumType.llIlIlIllIIIII[13]])[EnumType.llIlIlIllIIIII[0]] = lIIlIlIIIllIlIIl("xTHAfD8X7xg=", "XlzOj");
            EnumType.llIlIlIlIllIIl[EnumType.llIlIlIllIIIII[1]] = lIIlIlIIIllIllII("JnP3dLtl788=", "UKJZF");
            EnumType.llIlIlIlIllIIl[EnumType.llIlIlIllIIIII[2]] = lIIlIlIIIllIllII("q5u7Zp8E51M=", "lOOGe");
            EnumType.llIlIlIlIllIIl[EnumType.llIlIlIllIIIII[3]] = lIIlIlIIIllIllIl("IDcqIjQ2", "SGXWW");
            EnumType.llIlIlIlIllIIl[EnumType.llIlIlIllIIIII[4]] = lIIlIlIIIllIlIIl("y3vkhZdnHV8=", "ukjrh");
            EnumType.llIlIlIlIllIIl[EnumType.llIlIlIllIIIII[5]] = lIIlIlIIIllIllIl("NzkdEQU=", "UPorm");
            EnumType.llIlIlIlIllIIl[EnumType.llIlIlIllIIIII[6]] = lIIlIlIIIllIlIIl("IOdRhGeSdqE=", "wSoAL");
            EnumType.llIlIlIlIllIIl[EnumType.llIlIlIllIIIII[7]] = lIIlIlIIIllIlIIl("ZL4vtZMo+JA=", "xmKWS");
            EnumType.llIlIlIlIllIIl[EnumType.llIlIlIllIIIII[8]] = lIIlIlIIIllIlIIl("yCdTTNVfOTw=", "HlUnN");
            EnumType.llIlIlIlIllIIl[EnumType.llIlIlIllIIIII[9]] = lIIlIlIIIllIllII("YHXHTOf5cbY=", "SuquB");
            EnumType.llIlIlIlIllIIl[EnumType.llIlIlIllIIIII[10]] = lIIlIlIIIllIllIl("PhckKhQ1Fz0=", "zVvaK");
            EnumType.llIlIlIlIllIIl[EnumType.llIlIlIllIIIII[11]] = lIIlIlIIIllIllII("FuCB2J67k5yckIv4SPkmnA==", "SLDnv");
            EnumType.llIlIlIlIllIIl[EnumType.llIlIlIllIIIII[12]] = lIIlIlIIIllIlIIl("HmSNrf9i8zI=", "IKNPy");
        }
        
        private EnumType(final String llllllllllllIllIlIlIIlIIIIIIIIll, final int llllllllllllIllIlIlIIlIIIIIIIIlI, final int llllllllllllIllIlIlIIlIIIIIIIIIl, final String llllllllllllIllIlIlIIlIIIIIIIlll, final String llllllllllllIllIlIlIIIllllllllll, final MapColor llllllllllllIllIlIlIIlIIIIIIIlIl) {
            this.meta = llllllllllllIllIlIlIIlIIIIIIIIIl;
            this.name = llllllllllllIllIlIlIIlIIIIIIIlll;
            this.unlocalizedName = llllllllllllIllIlIlIIIllllllllll;
            this.field_181071_k = llllllllllllIllIlIlIIlIIIIIIIlIl;
        }
        
        private static boolean lIIlIlIIIllllIll(final int llllllllllllIllIlIlIIIlllIlIlIII) {
            return llllllllllllIllIlIlIIIlllIlIlIII >= 0;
        }
        
        public MapColor func_181070_c() {
            return this.field_181071_k;
        }
        
        public int getMetadata() {
            return this.meta;
        }
        
        private static boolean lIIlIlIIIllllIlI(final int llllllllllllIllIlIlIIIlllIlIllll, final int llllllllllllIllIlIlIIIlllIlIlllI) {
            return llllllllllllIllIlIlIIIlllIlIllll >= llllllllllllIllIlIlIIIlllIlIlllI;
        }
        
        static {
            lIIlIlIIIllllIIl();
            lIIlIlIIIlllIlII();
            final EnumType[] enum$VALUES = new EnumType[EnumType.llIlIlIllIIIII[6]];
            enum$VALUES[EnumType.llIlIlIllIIIII[0]] = EnumType.OAK;
            enum$VALUES[EnumType.llIlIlIllIIIII[1]] = EnumType.SPRUCE;
            enum$VALUES[EnumType.llIlIlIllIIIII[2]] = EnumType.BIRCH;
            enum$VALUES[EnumType.llIlIlIllIIIII[3]] = EnumType.JUNGLE;
            enum$VALUES[EnumType.llIlIlIllIIIII[4]] = EnumType.ACACIA;
            enum$VALUES[EnumType.llIlIlIllIIIII[5]] = EnumType.DARK_OAK;
            ENUM$VALUES = enum$VALUES;
            META_LOOKUP = new EnumType[values().length];
            final short llllllllllllIllIlIlIIlIIIIlIIIIl;
            final float llllllllllllIllIlIlIIlIIIIlIIIlI = ((EnumType[])(Object)(llllllllllllIllIlIlIIlIIIIlIIIIl = (short)(Object)values())).length;
            short llllllllllllIllIlIlIIlIIIIlIIIll = (short)EnumType.llIlIlIllIIIII[0];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIlIlIIIllllIlI(llllllllllllIllIlIlIIlIIIIlIIIll, (int)llllllllllllIllIlIlIIlIIIIlIIIlI)) {
                final EnumType llllllllllllIllIlIlIIlIIIIlIIlIl = llllllllllllIllIlIlIIlIIIIlIIIIl[llllllllllllIllIlIlIIlIIIIlIIIll];
                EnumType.META_LOOKUP[llllllllllllIllIlIlIIlIIIIlIIlIl.getMetadata()] = llllllllllllIllIlIlIIlIIIIlIIlIl;
                ++llllllllllllIllIlIlIIlIIIIlIIIll;
            }
        }
        
        private static String lIIlIlIIIllIllIl(String llllllllllllIllIlIlIIIllllIlIlII, final String llllllllllllIllIlIlIIIllllIlIIll) {
            llllllllllllIllIlIlIIIllllIlIlII = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIlIIIllllIlIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIlIlIIIllllIlIlll = new StringBuilder();
            final char[] llllllllllllIllIlIlIIIllllIlIllI = llllllllllllIllIlIlIIIllllIlIIll.toCharArray();
            int llllllllllllIllIlIlIIIllllIlIlIl = EnumType.llIlIlIllIIIII[0];
            final char llllllllllllIllIlIlIIIllllIIllll = (Object)((String)llllllllllllIllIlIlIIIllllIlIlII).toCharArray();
            final int llllllllllllIllIlIlIIIllllIIlllI = llllllllllllIllIlIlIIIllllIIllll.length;
            short llllllllllllIllIlIlIIIllllIIllIl = (short)EnumType.llIlIlIllIIIII[0];
            while (lIIlIlIIIlllllII(llllllllllllIllIlIlIIIllllIIllIl, llllllllllllIllIlIlIIIllllIIlllI)) {
                final char llllllllllllIllIlIlIIIllllIllIlI = llllllllllllIllIlIlIIIllllIIllll[llllllllllllIllIlIlIIIllllIIllIl];
                llllllllllllIllIlIlIIIllllIlIlll.append((char)(llllllllllllIllIlIlIIIllllIllIlI ^ llllllllllllIllIlIlIIIllllIlIllI[llllllllllllIllIlIlIIIllllIlIlIl % llllllllllllIllIlIlIIIllllIlIllI.length]));
                "".length();
                ++llllllllllllIllIlIlIIIllllIlIlIl;
                ++llllllllllllIllIlIlIIIllllIIllIl;
                "".length();
                if ((0x70 ^ 0x2D ^ (0x1C ^ 0x45)) == 0x0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIlIlIIIllllIlIlll);
        }
        
        private static String lIIlIlIIIllIllII(final String llllllllllllIllIlIlIIIlllIllIlIl, final String llllllllllllIllIlIlIIIlllIllIllI) {
            try {
                final SecretKeySpec llllllllllllIllIlIlIIIlllIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIIIlllIllIllI.getBytes(StandardCharsets.UTF_8)), EnumType.llIlIlIllIIIII[8]), "DES");
                final Cipher llllllllllllIllIlIlIIIlllIlllIIl = Cipher.getInstance("DES");
                llllllllllllIllIlIlIIIlllIlllIIl.init(EnumType.llIlIlIllIIIII[2], llllllllllllIllIlIlIIIlllIlllIlI);
                return new String(llllllllllllIllIlIlIIIlllIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIIIlllIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlIlIIIlllIlllIII) {
                llllllllllllIllIlIlIIIlllIlllIII.printStackTrace();
                return null;
            }
        }
        
        public static EnumType byMetadata(int llllllllllllIllIlIlIIIllllllIIlI) {
            if (!lIIlIlIIIllllIll((int)llllllllllllIllIlIlIIIllllllIIlI) || lIIlIlIIIllllIlI((int)llllllllllllIllIlIlIIIllllllIIlI, EnumType.META_LOOKUP.length)) {
                llllllllllllIllIlIlIIIllllllIIlI = EnumType.llIlIlIllIIIII[0];
            }
            return EnumType.META_LOOKUP[llllllllllllIllIlIlIIIllllllIIlI];
        }
        
        private static boolean lIIlIlIIIlllllII(final int llllllllllllIllIlIlIIIlllIlIlIll, final int llllllllllllIllIlIlIIIlllIlIlIlI) {
            return llllllllllllIllIlIlIIIlllIlIlIll < llllllllllllIllIlIlIIIlllIlIlIlI;
        }
        
        @Override
        public String toString() {
            return this.name;
        }
        
        private EnumType(final String llllllllllllIllIlIlIIlIIIIIlIlIl, final int llllllllllllIllIlIlIIlIIIIIlIlII, final int llllllllllllIllIlIlIIlIIIIIllIIl, final String llllllllllllIllIlIlIIlIIIIIlIIlI, final MapColor llllllllllllIllIlIlIIlIIIIIlIIIl) {
            this(llllllllllllIllIlIlIIlIIIIIlIlIl, llllllllllllIllIlIlIIlIIIIIlIlII, llllllllllllIllIlIlIIlIIIIIllIIl, llllllllllllIllIlIlIIlIIIIIlIIlI, llllllllllllIllIlIlIIlIIIIIlIIlI, llllllllllllIllIlIlIIlIIIIIlIIIl);
        }
        
        @Override
        public String getName() {
            return this.name;
        }
    }
}
