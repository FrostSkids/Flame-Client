// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.IStringSerializable;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.material.MapColor;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.block.properties.PropertyEnum;

public class BlockQuartz extends Block
{
    private static final /* synthetic */ int[] lllIIIIIIIIllI;
    public static final /* synthetic */ PropertyEnum<EnumType> VARIANT;
    private static final /* synthetic */ String[] lllIIIIIIIIIll;
    
    @Override
    public void getSubBlocks(final Item llllllllllllIllIIIlIIIllllIlllII, final CreativeTabs llllllllllllIllIIIlIIIllllIllIll, final List<ItemStack> llllllllllllIllIIIlIIIllllIllIlI) {
        llllllllllllIllIIIlIIIllllIllIlI.add(new ItemStack(llllllllllllIllIIIlIIIllllIlllII, BlockQuartz.lllIIIIIIIIllI[1], EnumType.DEFAULT.getMetadata()));
        "".length();
        llllllllllllIllIIIlIIIllllIllIlI.add(new ItemStack(llllllllllllIllIIIlIIIllllIlllII, BlockQuartz.lllIIIIIIIIllI[1], EnumType.CHISELED.getMetadata()));
        "".length();
        llllllllllllIllIIIlIIIllllIllIlI.add(new ItemStack(llllllllllllIllIIIlIIIllllIlllII, BlockQuartz.lllIIIIIIIIllI[1], EnumType.LINES_Y.getMetadata()));
        "".length();
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIllIIIlIIIllllIIllIl) {
        return llllllllllllIllIIIlIIIllllIIllIl.getValue(BlockQuartz.VARIANT).getMetadata();
    }
    
    private static void lIIllIllllIllIll() {
        (lllIIIIIIIIIll = new String[BlockQuartz.lllIIIIIIIIllI[1]])[BlockQuartz.lllIIIIIIIIllI[0]] = lIIllIllllIllIlI("19P/a0MJQDk=", "plozL");
    }
    
    private static String lIIllIllllIllIlI(final String llllllllllllIllIIIlIIIlllIllllll, final String llllllllllllIllIIIlIIIlllIllllII) {
        try {
            final SecretKeySpec llllllllllllIllIIIlIIIllllIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIIIlllIllllII.getBytes(StandardCharsets.UTF_8)), BlockQuartz.lllIIIIIIIIllI[4]), "DES");
            final Cipher llllllllllllIllIIIlIIIllllIIIIIl = Cipher.getInstance("DES");
            llllllllllllIllIIIlIIIllllIIIIIl.init(BlockQuartz.lllIIIIIIIIllI[2], llllllllllllIllIIIlIIIllllIIIIlI);
            return new String(llllllllllllIllIIIlIIIllllIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIIIlllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIlIIIllllIIIIII) {
            llllllllllllIllIIIlIIIllllIIIIII.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIllIllllIllllI();
        lIIllIllllIllIll();
        VARIANT = PropertyEnum.create(BlockQuartz.lllIIIIIIIIIll[BlockQuartz.lllIIIIIIIIllI[0]], EnumType.class);
    }
    
    private static boolean lIIllIlllllIIIII(final Object llllllllllllIllIIIlIIIlllIllIIll, final Object llllllllllllIllIIIlIIIlllIllIIlI) {
        return llllllllllllIllIIIlIIIlllIllIIll != llllllllllllIllIIIlIIIlllIllIIlI;
    }
    
    @Override
    protected ItemStack createStackedBlock(final IBlockState llllllllllllIllIIIlIIIlllllIIIIl) {
        final EnumType llllllllllllIllIIIlIIIlllllIIIll = llllllllllllIllIIIlIIIlllllIIIIl.getValue(BlockQuartz.VARIANT);
        ItemStack stackedBlock;
        if (lIIllIlllllIIIII(llllllllllllIllIIIlIIIlllllIIIll, EnumType.LINES_X) && lIIllIlllllIIIII(llllllllllllIllIIIlIIIlllllIIIll, EnumType.LINES_Z)) {
            stackedBlock = super.createStackedBlock(llllllllllllIllIIIlIIIlllllIIIIl);
            "".length();
            if (-" ".length() > -" ".length()) {
                return null;
            }
        }
        else {
            stackedBlock = new ItemStack(Item.getItemFromBlock(this), BlockQuartz.lllIIIIIIIIllI[1], EnumType.LINES_Y.getMetadata());
        }
        return stackedBlock;
    }
    
    private static boolean lIIllIlllllIIIIl(final Object llllllllllllIllIIIlIIIlllIllIIII) {
        return llllllllllllIllIIIlIIIlllIllIIII != null;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing$Axis = BlockQuartz.$SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis;
        if (lIIllIlllllIIIIl($switch_TABLE$net$minecraft$util$EnumFacing$Axis)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing$Axis;
        }
        "".length();
        final double llllllllllllIllIIIlIIIllllIIIlll = (Object)new int[EnumFacing.Axis.values().length];
        try {
            llllllllllllIllIIIlIIIllllIIIlll[EnumFacing.Axis.X.ordinal()] = BlockQuartz.lllIIIIIIIIllI[1];
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIllIIIlIIIllllIIIlll[EnumFacing.Axis.Y.ordinal()] = BlockQuartz.lllIIIIIIIIllI[2];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIllIIIlIIIllllIIIlll[EnumFacing.Axis.Z.ordinal()] = BlockQuartz.lllIIIIIIIIllI[3];
            "".length();
            if (((0x1C ^ 0x4F ^ (0xC2 ^ 0xA5)) & (16 + 80 + 51 + 8 ^ 17 + 41 - 12 + 129 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        return BlockQuartz.$SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis = (int[])(Object)llllllllllllIllIIIlIIIllllIIIlll;
    }
    
    @Override
    public int damageDropped(final IBlockState llllllllllllIllIIIlIIIlllllIllII) {
        final EnumType llllllllllllIllIIIlIIIlllllIlIll = llllllllllllIllIIIlIIIlllllIllII.getValue(BlockQuartz.VARIANT);
        int n;
        if (lIIllIlllllIIIII(llllllllllllIllIIIlIIIlllllIlIll, EnumType.LINES_X) && lIIllIlllllIIIII(llllllllllllIllIIIlIIIlllllIlIll, EnumType.LINES_Z)) {
            n = llllllllllllIllIIIlIIIlllllIlIll.getMetadata();
            "".length();
            if (null != null) {
                return (0xFF ^ 0x94 ^ (0x3D ^ 0x5)) & (0x7C ^ 0x55 ^ (0xC1 ^ 0xBB) ^ -" ".length());
            }
        }
        else {
            n = EnumType.LINES_Y.getMetadata();
        }
        return n;
    }
    
    public BlockQuartz() {
        super(Material.rock);
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockQuartz.VARIANT, EnumType.DEFAULT));
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    private static boolean lIIllIllllIlllll(final int llllllllllllIllIIIlIIIlllIllIlll, final int llllllllllllIllIIIlIIIlllIllIllI) {
        return llllllllllllIllIIIlIIIlllIllIlll == llllllllllllIllIIIlIIIlllIllIllI;
    }
    
    @Override
    public IBlockState onBlockPlaced(final World llllllllllllIllIIIlIIIlllllllIlI, final BlockPos llllllllllllIllIIIlIIIlllllllIIl, final EnumFacing llllllllllllIllIIIlIIIlllllllIII, final float llllllllllllIllIIIlIIIllllllIlll, final float llllllllllllIllIIIlIIIllllllIllI, final float llllllllllllIllIIIlIIIllllllIlIl, final int llllllllllllIllIIIlIIIllllllIlII, final EntityLivingBase llllllllllllIllIIIlIIIllllllIIll) {
        if (!lIIllIllllIlllll(llllllllllllIllIIIlIIIllllllIlII, EnumType.LINES_Y.getMetadata())) {
            IBlockState blockState;
            if (lIIllIllllIlllll(llllllllllllIllIIIlIIIllllllIlII, EnumType.CHISELED.getMetadata())) {
                blockState = this.getDefaultState().withProperty(BlockQuartz.VARIANT, EnumType.CHISELED);
                "".length();
                if (((0x26 ^ 0x3B) & ~(0x89 ^ 0x94)) != 0x0) {
                    return null;
                }
            }
            else {
                blockState = this.getDefaultState().withProperty(BlockQuartz.VARIANT, EnumType.DEFAULT);
            }
            return blockState;
        }
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis()[llllllllllllIllIIIlIIIlllllllIII.getAxis().ordinal()]) {
            case 3: {
                return this.getDefaultState().withProperty(BlockQuartz.VARIANT, EnumType.LINES_Z);
            }
            case 1: {
                return this.getDefaultState().withProperty(BlockQuartz.VARIANT, EnumType.LINES_X);
            }
            default: {
                return this.getDefaultState().withProperty(BlockQuartz.VARIANT, EnumType.LINES_Y);
            }
        }
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIllIIIlIIIllllIlIIlI) {
        return this.getDefaultState().withProperty(BlockQuartz.VARIANT, EnumType.byMetadata(llllllllllllIllIIIlIIIllllIlIIlI));
    }
    
    @Override
    public MapColor getMapColor(final IBlockState llllllllllllIllIIIlIIIllllIlIllI) {
        return MapColor.quartzColor;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockQuartz.lllIIIIIIIIllI[1]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockQuartz.lllIIIIIIIIllI[0]] = BlockQuartz.VARIANT;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static void lIIllIllllIllllI() {
        (lllIIIIIIIIllI = new int[5])[0] = ((0xA6 ^ 0xB5) & ~(0xD6 ^ 0xC5));
        BlockQuartz.lllIIIIIIIIllI[1] = " ".length();
        BlockQuartz.lllIIIIIIIIllI[2] = "  ".length();
        BlockQuartz.lllIIIIIIIIllI[3] = "   ".length();
        BlockQuartz.lllIIIIIIIIllI[4] = (0x43 ^ 0x77 ^ (0x4 ^ 0x38));
    }
    
    public enum EnumType implements IStringSerializable
    {
        private static final /* synthetic */ int[] lIlIIlIIIlIlIl;
        
        LINES_Y(EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[6]], EnumType.lIlIIlIIIlIlIl[2], EnumType.lIlIIlIIIlIlIl[2], EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[7]], EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[8]]);
        
        private final /* synthetic */ String unlocalizedName;
        private final /* synthetic */ String field_176805_h;
        
        LINES_X(EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[9]], EnumType.lIlIIlIIIlIlIl[3], EnumType.lIlIIlIIIlIlIl[3], EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[10]], EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[11]]), 
        DEFAULT(EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[0]], EnumType.lIlIIlIIIlIlIl[0], EnumType.lIlIIlIIIlIlIl[0], EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[1]], EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[2]]);
        
        private static final /* synthetic */ String[] lIlIIlIIIlIIII;
        
        CHISELED(EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[3]], EnumType.lIlIIlIIIlIlIl[1], EnumType.lIlIIlIIIlIlIl[1], EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[4]], EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[5]]);
        
        private final /* synthetic */ int meta;
        
        LINES_Z(EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[12]], EnumType.lIlIIlIIIlIlIl[4], EnumType.lIlIIlIIIlIlIl[4], EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[13]], EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[14]]);
        
        private static final /* synthetic */ EnumType[] META_LOOKUP;
        
        private static boolean lllIIlIlIIIllll(final int lllllllllllllIIIlllIIlIIlllIllIl) {
            return lllllllllllllIIIlllIIlIIlllIllIl >= 0;
        }
        
        private static String lllIIlIlIIIIIII(String lllllllllllllIIIlllIIlIlIIIllllI, final String lllllllllllllIIIlllIIlIlIIIlllIl) {
            lllllllllllllIIIlllIIlIlIIIllllI = new String(Base64.getDecoder().decode(lllllllllllllIIIlllIIlIlIIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIIlllIIlIlIIIlllII = new StringBuilder();
            final char[] lllllllllllllIIIlllIIlIlIIIllIll = lllllllllllllIIIlllIIlIlIIIlllIl.toCharArray();
            int lllllllllllllIIIlllIIlIlIIIllIlI = EnumType.lIlIIlIIIlIlIl[0];
            final boolean lllllllllllllIIIlllIIlIlIIIlIlII = (Object)lllllllllllllIIIlllIIlIlIIIllllI.toCharArray();
            final int lllllllllllllIIIlllIIlIlIIIlIIll = lllllllllllllIIIlllIIlIlIIIlIlII.length;
            double lllllllllllllIIIlllIIlIlIIIlIIlI = EnumType.lIlIIlIIIlIlIl[0];
            while (lllIIlIlIIlIIII((int)lllllllllllllIIIlllIIlIlIIIlIIlI, lllllllllllllIIIlllIIlIlIIIlIIll)) {
                final char lllllllllllllIIIlllIIlIlIIIlllll = lllllllllllllIIIlllIIlIlIIIlIlII[lllllllllllllIIIlllIIlIlIIIlIIlI];
                lllllllllllllIIIlllIIlIlIIIlllII.append((char)(lllllllllllllIIIlllIIlIlIIIlllll ^ lllllllllllllIIIlllIIlIlIIIllIll[lllllllllllllIIIlllIIlIlIIIllIlI % lllllllllllllIIIlllIIlIlIIIllIll.length]));
                "".length();
                ++lllllllllllllIIIlllIIlIlIIIllIlI;
                ++lllllllllllllIIIlllIIlIlIIIlIIlI;
                "".length();
                if (-" ".length() >= 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIIlllIIlIlIIIlllII);
        }
        
        private static boolean lllIIlIlIIIlllI(final int lllllllllllllIIIlllIIlIIllllIlII, final int lllllllllllllIIIlllIIlIIllllIIll) {
            return lllllllllllllIIIlllIIlIIllllIlII >= lllllllllllllIIIlllIIlIIllllIIll;
        }
        
        private static String lllIIlIlIIIIIIl(final String lllllllllllllIIIlllIIlIIlllllIlI, final String lllllllllllllIIIlllIIlIIlllllIll) {
            try {
                final SecretKeySpec lllllllllllllIIIlllIIlIIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIIlIIlllllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIIlllIIlIIlllllllI = Cipher.getInstance("Blowfish");
                lllllllllllllIIIlllIIlIIlllllllI.init(EnumType.lIlIIlIIIlIlIl[2], lllllllllllllIIIlllIIlIIllllllll);
                return new String(lllllllllllllIIIlllIIlIIlllllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIIlIIlllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIlllIIlIIllllllIl) {
                lllllllllllllIIIlllIIlIIllllllIl.printStackTrace();
                return null;
            }
        }
        
        public int getMetadata() {
            return this.meta;
        }
        
        private static String lllIIlIIlllllll(final String lllllllllllllIIIlllIIlIlIIIIlIIl, final String lllllllllllllIIIlllIIlIlIIIIIllI) {
            try {
                final SecretKeySpec lllllllllllllIIIlllIIlIlIIIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIIlIlIIIIIllI.getBytes(StandardCharsets.UTF_8)), EnumType.lIlIIlIIIlIlIl[8]), "DES");
                final Cipher lllllllllllllIIIlllIIlIlIIIIlIll = Cipher.getInstance("DES");
                lllllllllllllIIIlllIIlIlIIIIlIll.init(EnumType.lIlIIlIIIlIlIl[2], lllllllllllllIIIlllIIlIlIIIIllII);
                return new String(lllllllllllllIIIlllIIlIlIIIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIIlIlIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIlllIIlIlIIIIlIlI) {
                lllllllllllllIIIlllIIlIlIIIIlIlI.printStackTrace();
                return null;
            }
        }
        
        private static boolean lllIIlIlIIlIIII(final int lllllllllllllIIIlllIIlIIllllIIII, final int lllllllllllllIIIlllIIlIIlllIllll) {
            return lllllllllllllIIIlllIIlIIllllIIII < lllllllllllllIIIlllIIlIIlllIllll;
        }
        
        private static void lllIIlIlIIIIllI() {
            (lIlIIlIIIlIIII = new String[EnumType.lIlIIlIIIlIlIl[15]])[EnumType.lIlIIlIIIlIlIl[0]] = lllIIlIIlllllll("Aj7cxqxVQjw=", "rHfkA");
            EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[1]] = lllIIlIlIIIIIII("PBwzBAE0DQ==", "XyUet");
            EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[2]] = lllIIlIIlllllll("ERXWVSbooAk=", "UeIUp");
            EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[3]] = lllIIlIlIIIIIII("Ei8cGR0dIhE=", "QgUJX");
            EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[4]] = lllIIlIIlllllll("jXJWyoqiICWjDApHcxZ1Pg==", "yWBjh");
            EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[5]] = lllIIlIlIIIIIIl("OxekiAvNz33y+C62QQcBqQ==", "pchsE");
            EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[6]] = lllIIlIlIIIIIIl("ELXn+NPZHL0=", "Msbyn");
            EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[7]] = lllIIlIlIIIIIIl("Cf618ffC3oE=", "AsmeP");
            EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[8]] = lllIIlIIlllllll("PnoFdjxYsgM=", "iXRcp");
            EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[9]] = lllIIlIlIIIIIIl("r2eCMlxdQQI=", "CAJra");
            EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[10]] = lllIIlIlIIIIIIl("50Yr3jiyTEs=", "aiAnX");
            EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[11]] = lllIIlIIlllllll("tEzqn2ig7kA=", "pQyrN");
            EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[12]] = lllIIlIlIIIIIII("KQoINR46GQ==", "eCFpM");
            EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[13]] = lllIIlIIlllllll("VidlszesM4o=", "uOaxZ");
            EnumType.lIlIIlIIIlIIII[EnumType.lIlIIlIIIlIlIl[14]] = lllIIlIIlllllll("lCzScGu9McA=", "ihZNn");
        }
        
        public static EnumType byMetadata(int lllllllllllllIIIlllIIlIlIIllIlII) {
            if (!lllIIlIlIIIllll(lllllllllllllIIIlllIIlIlIIllIlII) || lllIIlIlIIIlllI(lllllllllllllIIIlllIIlIlIIllIlII, EnumType.META_LOOKUP.length)) {
                lllllllllllllIIIlllIIlIlIIllIlII = EnumType.lIlIIlIIIlIlIl[0];
            }
            return EnumType.META_LOOKUP[lllllllllllllIIIlllIIlIlIIllIlII];
        }
        
        @Override
        public String getName() {
            return this.field_176805_h;
        }
        
        private static void lllIIlIlIIIllIl() {
            (lIlIIlIIIlIlIl = new int[16])[0] = ((0xDF ^ 0x9A) & ~(0x5E ^ 0x1B));
            EnumType.lIlIIlIIIlIlIl[1] = " ".length();
            EnumType.lIlIIlIIIlIlIl[2] = "  ".length();
            EnumType.lIlIIlIIIlIlIl[3] = "   ".length();
            EnumType.lIlIIlIIIlIlIl[4] = (0x1B ^ 0x1F);
            EnumType.lIlIIlIIIlIlIl[5] = (0x45 ^ 0x5F ^ (0xA1 ^ 0xBE));
            EnumType.lIlIIlIIIlIlIl[6] = (0x8A ^ 0x8C);
            EnumType.lIlIIlIIIlIlIl[7] = (91 + 86 - 81 + 69 ^ 32 + 127 - 110 + 113);
            EnumType.lIlIIlIIIlIlIl[8] = (0x19 ^ 0x11);
            EnumType.lIlIIlIIIlIlIl[9] = (0x7E ^ 0x77);
            EnumType.lIlIIlIIIlIlIl[10] = ("   ".length() ^ (0xA2 ^ 0xAB));
            EnumType.lIlIIlIIIlIlIl[11] = (49 + 108 - 139 + 118 ^ 67 + 9 + 8 + 47);
            EnumType.lIlIIlIIIlIlIl[12] = (0xAF ^ 0x97 ^ (0xF ^ 0x3B));
            EnumType.lIlIIlIIIlIlIl[13] = (0x37 ^ 0x3A);
            EnumType.lIlIIlIIIlIlIl[14] = (0x42 ^ 0x4C);
            EnumType.lIlIIlIIIlIlIl[15] = (0x98 ^ 0x97);
        }
        
        static {
            lllIIlIlIIIllIl();
            lllIIlIlIIIIllI();
            final EnumType[] enum$VALUES = new EnumType[EnumType.lIlIIlIIIlIlIl[5]];
            enum$VALUES[EnumType.lIlIIlIIIlIlIl[0]] = EnumType.DEFAULT;
            enum$VALUES[EnumType.lIlIIlIIIlIlIl[1]] = EnumType.CHISELED;
            enum$VALUES[EnumType.lIlIIlIIIlIlIl[2]] = EnumType.LINES_Y;
            enum$VALUES[EnumType.lIlIIlIIIlIlIl[3]] = EnumType.LINES_X;
            enum$VALUES[EnumType.lIlIIlIIIlIlIl[4]] = EnumType.LINES_Z;
            ENUM$VALUES = enum$VALUES;
            META_LOOKUP = new EnumType[values().length];
            final boolean lllllllllllllIIIlllIIlIlIlIIllIl;
            final float lllllllllllllIIIlllIIlIlIlIIlllI = ((EnumType[])(Object)(lllllllllllllIIIlllIIlIlIlIIllIl = (boolean)(Object)values())).length;
            double lllllllllllllIIIlllIIlIlIlIIllll = EnumType.lIlIIlIIIlIlIl[0];
            "".length();
            if ("  ".length() <= ((0xB9 ^ 0x85) & ~(0x91 ^ 0xAD))) {
                return;
            }
            while (!lllIIlIlIIIlllI((int)lllllllllllllIIIlllIIlIlIlIIllll, (int)lllllllllllllIIIlllIIlIlIlIIlllI)) {
                final EnumType lllllllllllllIIIlllIIlIlIlIlIIIl = lllllllllllllIIIlllIIlIlIlIIllIl[lllllllllllllIIIlllIIlIlIlIIllll];
                EnumType.META_LOOKUP[lllllllllllllIIIlllIIlIlIlIlIIIl.getMetadata()] = lllllllllllllIIIlllIIlIlIlIlIIIl;
                ++lllllllllllllIIIlllIIlIlIlIIllll;
            }
        }
        
        private EnumType(final String lllllllllllllIIIlllIIlIlIlIIIIIl, final int lllllllllllllIIIlllIIlIlIlIIIIII, final int lllllllllllllIIIlllIIlIlIlIIIlIl, final String lllllllllllllIIIlllIIlIlIlIIIlII, final String lllllllllllllIIIlllIIlIlIIllllIl) {
            this.meta = lllllllllllllIIIlllIIlIlIlIIIlIl;
            this.field_176805_h = lllllllllllllIIIlllIIlIlIlIIIlII;
            this.unlocalizedName = lllllllllllllIIIlllIIlIlIIllllIl;
        }
        
        @Override
        public String toString() {
            return this.unlocalizedName;
        }
    }
}
