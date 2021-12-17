// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.block.state.BlockState;
import net.minecraft.block.material.MapColor;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.google.common.base.Predicate;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.properties.PropertyEnum;

public class BlockOldLog extends BlockLog
{
    public static final /* synthetic */ PropertyEnum<BlockPlanks.EnumType> VARIANT;
    private static final /* synthetic */ int[] llIIlIllIIIllI;
    private static final /* synthetic */ String[] llIIlIllIIIlIl;
    
    private static boolean lIIIllIllIIlIIII(final Object llllllllllllIlllIIIlIllIIIIlIIIl) {
        return llllllllllllIlllIIIlIllIIIIlIIIl != null;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$block$BlockPlanks$EnumType() {
        final int[] $switch_TABLE$net$minecraft$block$BlockPlanks$EnumType = BlockOldLog.$SWITCH_TABLE$net$minecraft$block$BlockPlanks$EnumType;
        if (lIIIllIllIIlIIII($switch_TABLE$net$minecraft$block$BlockPlanks$EnumType)) {
            return $switch_TABLE$net$minecraft$block$BlockPlanks$EnumType;
        }
        "".length();
        final int llllllllllllIlllIIIlIllIIIlIIIlI = (Object)new int[BlockPlanks.EnumType.values().length];
        try {
            llllllllllllIlllIIIlIllIIIlIIIlI[BlockPlanks.EnumType.ACACIA.ordinal()] = BlockOldLog.llIIlIllIIIllI[7];
            "".length();
            if (-(0x9A ^ 0x9E) > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIlllIIIlIllIIIlIIIlI[BlockPlanks.EnumType.BIRCH.ordinal()] = BlockOldLog.llIIlIllIIIllI[2];
            "".length();
            if (((0x56 ^ 0x61 ^ (0x87 ^ 0x97)) & (0x4D ^ 0x37 ^ (0x98 ^ 0xC5) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIlllIIIlIllIIIlIIIlI[BlockPlanks.EnumType.DARK_OAK.ordinal()] = BlockOldLog.llIIlIllIIIllI[8];
            "".length();
            if ((0x3 ^ 0x7) > (0x8C ^ 0x88)) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIlllIIIlIllIIIlIIIlI[BlockPlanks.EnumType.JUNGLE.ordinal()] = BlockOldLog.llIIlIllIIIllI[3];
            "".length();
            if ("   ".length() < ((0xB2 ^ 0xA7) & ~(0x94 ^ 0x81))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            llllllllllllIlllIIIlIllIIIlIIIlI[BlockPlanks.EnumType.OAK.ordinal()] = BlockOldLog.llIIlIllIIIllI[1];
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            llllllllllllIlllIIIlIllIIIlIIIlI[BlockPlanks.EnumType.SPRUCE.ordinal()] = BlockOldLog.llIIlIllIIIllI[6];
            "".length();
            if (-" ".length() >= "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return BlockOldLog.$SWITCH_TABLE$net$minecraft$block$BlockPlanks$EnumType = (int[])(Object)llllllllllllIlllIIIlIllIIIlIIIlI;
    }
    
    private static String lIIIllIllIIIllIl(final String llllllllllllIlllIIIlIllIIIIlIllI, final String llllllllllllIlllIIIlIllIIIIlIlll) {
        try {
            final SecretKeySpec llllllllllllIlllIIIlIllIIIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIlIllIIIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIIlIllIIIIllIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIIlIllIIIIllIlI.init(BlockOldLog.llIIlIllIIIllI[6], llllllllllllIlllIIIlIllIIIIllIll);
            return new String(llllllllllllIlllIIIlIllIIIIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIlIllIIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIlIllIIIIllIIl) {
            llllllllllllIlllIIIlIllIIIIllIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int damageDropped(final IBlockState llllllllllllIlllIIIlIllIIIlIIlII) {
        return llllllllllllIlllIIIlIllIIIlIIlII.getValue(BlockOldLog.VARIANT).getMetadata();
    }
    
    public BlockOldLog() {
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockOldLog.LOG_AXIS, EnumAxis.Y));
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$block$BlockLog$EnumAxis() {
        final int[] $switch_TABLE$net$minecraft$block$BlockLog$EnumAxis = BlockOldLog.$SWITCH_TABLE$net$minecraft$block$BlockLog$EnumAxis;
        if (lIIIllIllIIlIIII($switch_TABLE$net$minecraft$block$BlockLog$EnumAxis)) {
            return $switch_TABLE$net$minecraft$block$BlockLog$EnumAxis;
        }
        "".length();
        final Exception llllllllllllIlllIIIlIllIIIlIIIII = (Object)new int[EnumAxis.values().length];
        try {
            llllllllllllIlllIIIlIllIIIlIIIII[EnumAxis.NONE.ordinal()] = BlockOldLog.llIIlIllIIIllI[3];
            "".length();
            if (((0x17 ^ 0x29) & ~(0x12 ^ 0x2C)) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIlllIIIlIllIIIlIIIII[EnumAxis.X.ordinal()] = BlockOldLog.llIIlIllIIIllI[1];
            "".length();
            if (((0x61 ^ 0x66) & ~(0x36 ^ 0x31)) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIlllIIIlIllIIIlIIIII[EnumAxis.Y.ordinal()] = BlockOldLog.llIIlIllIIIllI[6];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIlllIIIlIllIIIlIIIII[EnumAxis.Z.ordinal()] = BlockOldLog.llIIlIllIIIllI[2];
            "".length();
            if ((55 + 110 - 93 + 112 ^ 98 + 33 - 85 + 142) > (0x29 ^ 0x13 ^ (0xB9 ^ 0x87))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        return BlockOldLog.$SWITCH_TABLE$net$minecraft$block$BlockLog$EnumAxis = (int[])(Object)llllllllllllIlllIIIlIllIIIlIIIII;
    }
    
    private static void lIIIllIllIIIllll() {
        (llIIlIllIIIllI = new int[9])[0] = ((0x4D ^ 0x30 ^ (0xB3 ^ 0x8C)) & (0x79 ^ 0x21 ^ (0xA ^ 0x10) ^ -" ".length()));
        BlockOldLog.llIIlIllIIIllI[1] = " ".length();
        BlockOldLog.llIIlIllIIIllI[2] = "   ".length();
        BlockOldLog.llIIlIllIIIllI[3] = (0x44 ^ 0x40);
        BlockOldLog.llIIlIllIIIllI[4] = (0xF ^ 0x3);
        BlockOldLog.llIIlIllIIIllI[5] = (0xB0 ^ 0xB8);
        BlockOldLog.llIIlIllIIIllI[6] = "  ".length();
        BlockOldLog.llIIlIllIIIllI[7] = (0x50 ^ 0x65 ^ (0x35 ^ 0x5));
        BlockOldLog.llIIlIllIIIllI[8] = ("   ".length() ^ (0xF ^ 0xA));
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIlllIIIlIllIIIllIIlI) {
        int llllllllllllIlllIIIlIllIIIllIIll = BlockOldLog.llIIlIllIIIllI[0];
        llllllllllllIlllIIIlIllIIIllIIll |= llllllllllllIlllIIIlIllIIIllIIlI.getValue(BlockOldLog.VARIANT).getMetadata();
        switch ($SWITCH_TABLE$net$minecraft$block$BlockLog$EnumAxis()[llllllllllllIlllIIIlIllIIIllIIlI.getValue(BlockOldLog.LOG_AXIS).ordinal()]) {
            case 1: {
                llllllllllllIlllIIIlIllIIIllIIll |= BlockOldLog.llIIlIllIIIllI[3];
                "".length();
                if (-" ".length() > 0) {
                    return (139 + 68 - 124 + 84 ^ 95 + 9 - 78 + 154) & (0x1A ^ 0x5A ^ (0x3E ^ 0x6D) ^ -" ".length());
                }
                break;
            }
            case 3: {
                llllllllllllIlllIIIlIllIIIllIIll |= BlockOldLog.llIIlIllIIIllI[5];
                "".length();
                if (-" ".length() > 0) {
                    return (0x3C ^ 0x1C) & ~(0xA4 ^ 0x84);
                }
                break;
            }
            case 4: {
                llllllllllllIlllIIIlIllIIIllIIll |= BlockOldLog.llIIlIllIIIllI[4];
                break;
            }
        }
        return llllllllllllIlllIIIlIllIIIllIIll;
    }
    
    static {
        lIIIllIllIIIllll();
        lIIIllIllIIIlllI();
        VARIANT = PropertyEnum.create(BlockOldLog.llIIlIllIIIlIl[BlockOldLog.llIIlIllIIIllI[0]], BlockPlanks.EnumType.class, (com.google.common.base.Predicate<BlockPlanks.EnumType>)new Predicate<BlockPlanks.EnumType>() {
            private static final /* synthetic */ int[] lIIlIlIIIllllI;
            
            private static void llIIlllllIlIIII() {
                (lIIlIlIIIllllI = new int[3])[0] = (0x85 ^ 0x81);
                BlockOldLog$1.lIIlIlIIIllllI[1] = " ".length();
                BlockOldLog$1.lIIlIlIIIllllI[2] = ((0x5D ^ 0x78) & ~(0x82 ^ 0xA7));
            }
            
            static {
                llIIlllllIlIIII();
            }
            
            public boolean apply(final BlockPlanks.EnumType lllllllllllllIIllIlIIllIIIlIIIlI) {
                if (llIIlllllIlIIIl(lllllllllllllIIllIlIIllIIIlIIIlI.getMetadata(), BlockOldLog$1.lIIlIlIIIllllI[0])) {
                    return BlockOldLog$1.lIIlIlIIIllllI[1] != 0;
                }
                return BlockOldLog$1.lIIlIlIIIllllI[2] != 0;
            }
            
            private static boolean llIIlllllIlIIIl(final int lllllllllllllIIllIlIIllIIIIllIll, final int lllllllllllllIIllIlIIllIIIIllIlI) {
                return lllllllllllllIIllIlIIllIIIIllIll < lllllllllllllIIllIlIIllIIIIllIlI;
            }
        });
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIlllIIIlIllIIIlllIIl) {
        IBlockState llllllllllllIlllIIIlIllIIIlllIll = this.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.byMetadata((llllllllllllIlllIIIlIllIIIlllIIl & BlockOldLog.llIIlIllIIIllI[2]) % BlockOldLog.llIIlIllIIIllI[3]));
        switch (llllllllllllIlllIIIlIllIIIlllIIl & BlockOldLog.llIIlIllIIIllI[4]) {
            case 0: {
                llllllllllllIlllIIIlIllIIIlllIll = llllllllllllIlllIIIlIllIIIlllIll.withProperty(BlockOldLog.LOG_AXIS, EnumAxis.Y);
                "".length();
                if ("  ".length() != "  ".length()) {
                    return null;
                }
                break;
            }
            case 4: {
                llllllllllllIlllIIIlIllIIIlllIll = llllllllllllIlllIIIlIllIIIlllIll.withProperty(BlockOldLog.LOG_AXIS, EnumAxis.X);
                "".length();
                if (((0xD0 ^ 0x86) & ~(0x6F ^ 0x39)) <= -" ".length()) {
                    return null;
                }
                break;
            }
            case 8: {
                llllllllllllIlllIIIlIllIIIlllIll = llllllllllllIlllIIIlIllIIIlllIll.withProperty(BlockOldLog.LOG_AXIS, EnumAxis.Z);
                "".length();
                if ((0x4C ^ 0x48) == 0x0) {
                    return null;
                }
                break;
            }
            default: {
                llllllllllllIlllIIIlIllIIIlllIll = llllllllllllIlllIIIlIllIIIlllIll.withProperty(BlockOldLog.LOG_AXIS, EnumAxis.NONE);
                break;
            }
        }
        return llllllllllllIlllIIIlIllIIIlllIll;
    }
    
    @Override
    public void getSubBlocks(final Item llllllllllllIlllIIIlIllIIlIIIlIl, final CreativeTabs llllllllllllIlllIIIlIllIIlIIIlII, final List<ItemStack> llllllllllllIlllIIIlIllIIlIIIIIl) {
        llllllllllllIlllIIIlIllIIlIIIIIl.add(new ItemStack(llllllllllllIlllIIIlIllIIlIIIlIl, BlockOldLog.llIIlIllIIIllI[1], BlockPlanks.EnumType.OAK.getMetadata()));
        "".length();
        llllllllllllIlllIIIlIllIIlIIIIIl.add(new ItemStack(llllllllllllIlllIIIlIllIIlIIIlIl, BlockOldLog.llIIlIllIIIllI[1], BlockPlanks.EnumType.SPRUCE.getMetadata()));
        "".length();
        llllllllllllIlllIIIlIllIIlIIIIIl.add(new ItemStack(llllllllllllIlllIIIlIllIIlIIIlIl, BlockOldLog.llIIlIllIIIllI[1], BlockPlanks.EnumType.BIRCH.getMetadata()));
        "".length();
        llllllllllllIlllIIIlIllIIlIIIIIl.add(new ItemStack(llllllllllllIlllIIIlIllIIlIIIlIl, BlockOldLog.llIIlIllIIIllI[1], BlockPlanks.EnumType.JUNGLE.getMetadata()));
        "".length();
    }
    
    @Override
    public MapColor getMapColor(final IBlockState llllllllllllIlllIIIlIllIIlIIllII) {
        final BlockPlanks.EnumType llllllllllllIlllIIIlIllIIlIIlIll = llllllllllllIlllIIIlIllIIlIIllII.getValue(BlockOldLog.VARIANT);
        switch ($SWITCH_TABLE$net$minecraft$block$BlockLog$EnumAxis()[llllllllllllIlllIIIlIllIIlIIllII.getValue(BlockOldLog.LOG_AXIS).ordinal()]) {
            default: {
                switch ($SWITCH_TABLE$net$minecraft$block$BlockPlanks$EnumType()[llllllllllllIlllIIIlIllIIlIIlIll.ordinal()]) {
                    default: {
                        return BlockPlanks.EnumType.SPRUCE.func_181070_c();
                    }
                    case 2: {
                        return BlockPlanks.EnumType.DARK_OAK.func_181070_c();
                    }
                    case 3: {
                        return MapColor.quartzColor;
                    }
                    case 4: {
                        return BlockPlanks.EnumType.SPRUCE.func_181070_c();
                    }
                }
                break;
            }
            case 2: {
                return llllllllllllIlllIIIlIllIIlIIlIll.func_181070_c();
            }
        }
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockOldLog.llIIlIllIIIllI[6]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockOldLog.llIIlIllIIIllI[0]] = BlockOldLog.VARIANT;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockOldLog.llIIlIllIIIllI[1]] = BlockOldLog.LOG_AXIS;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static void lIIIllIllIIIlllI() {
        (llIIlIllIIIlIl = new String[BlockOldLog.llIIlIllIIIllI[1]])[BlockOldLog.llIIlIllIIIllI[0]] = lIIIllIllIIIllIl("rD3GPL20Tak=", "icPab");
    }
    
    @Override
    protected ItemStack createStackedBlock(final IBlockState llllllllllllIlllIIIlIllIIIlIlIlI) {
        return new ItemStack(Item.getItemFromBlock(this), BlockOldLog.llIIlIllIIIllI[1], llllllllllllIlllIIIlIllIIIlIlIlI.getValue(BlockOldLog.VARIANT).getMetadata());
    }
}
