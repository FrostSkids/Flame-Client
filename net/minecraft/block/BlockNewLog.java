// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import com.google.common.base.Predicate;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyEnum;

public class BlockNewLog extends BlockLog
{
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$block$BlockPlanks$EnumType;
    public static final /* synthetic */ PropertyEnum<BlockPlanks.EnumType> VARIANT;
    private static final /* synthetic */ String[] lIIIllIlllllII;
    private static final /* synthetic */ int[] lIIIllIlllllIl;
    
    private static void llIIIlIlIlllIlI() {
        (lIIIllIlllllIl = new int[9])[0] = (" ".length() & (" ".length() ^ -" ".length()));
        BlockNewLog.lIIIllIlllllIl[1] = " ".length();
        BlockNewLog.lIIIllIlllllIl[2] = (0x65 ^ 0x61);
        BlockNewLog.lIIIllIlllllIl[3] = "   ".length();
        BlockNewLog.lIIIllIlllllIl[4] = (0x3E ^ 0x5B ^ (0xDE ^ 0xB7));
        BlockNewLog.lIIIllIlllllIl[5] = (0x7 ^ 0xF);
        BlockNewLog.lIIIllIlllllIl[6] = "  ".length();
        BlockNewLog.lIIIllIlllllIl[7] = (0x38 ^ 0x3D);
        BlockNewLog.lIIIllIlllllIl[8] = (0x37 ^ 0x31);
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$block$BlockLog$EnumAxis() {
        final int[] $switch_TABLE$net$minecraft$block$BlockLog$EnumAxis = BlockNewLog.$SWITCH_TABLE$net$minecraft$block$BlockLog$EnumAxis;
        if (llIIIlIlIlllIll($switch_TABLE$net$minecraft$block$BlockLog$EnumAxis)) {
            return $switch_TABLE$net$minecraft$block$BlockLog$EnumAxis;
        }
        "".length();
        final boolean lllllllllllllIIllllllIIlllllIIII = (Object)new int[EnumAxis.values().length];
        try {
            lllllllllllllIIllllllIIlllllIIII[EnumAxis.NONE.ordinal()] = BlockNewLog.lIIIllIlllllIl[2];
            "".length();
            if ((0x1C ^ 0x5E ^ (0x1D ^ 0x5B)) < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIllllllIIlllllIIII[EnumAxis.X.ordinal()] = BlockNewLog.lIIIllIlllllIl[1];
            "".length();
            if ((0x97 ^ 0x93) == 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIllllllIIlllllIIII[EnumAxis.Y.ordinal()] = BlockNewLog.lIIIllIlllllIl[6];
            "".length();
            if ((0x81 ^ 0x85) == 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIIllllllIIlllllIIII[EnumAxis.Z.ordinal()] = BlockNewLog.lIIIllIlllllIl[3];
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        return BlockNewLog.$SWITCH_TABLE$net$minecraft$block$BlockLog$EnumAxis = (int[])(Object)lllllllllllllIIllllllIIlllllIIII;
    }
    
    private static void llIIIlIlIlllIIl() {
        (lIIIllIlllllII = new String[BlockNewLog.lIIIllIlllllIl[1]])[BlockNewLog.lIIIllIlllllIl[0]] = llIIIlIlIlllIII("9E5Si2jF1zU=", "bKSrv");
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIllllllIlIIIIIllII) {
        IBlockState lllllllllllllIIllllllIlIIIIIlIll = this.getDefaultState().withProperty(BlockNewLog.VARIANT, BlockPlanks.EnumType.byMetadata((lllllllllllllIIllllllIlIIIIIllII & BlockNewLog.lIIIllIlllllIl[3]) + BlockNewLog.lIIIllIlllllIl[2]));
        switch (lllllllllllllIIllllllIlIIIIIllII & BlockNewLog.lIIIllIlllllIl[4]) {
            case 0: {
                lllllllllllllIIllllllIlIIIIIlIll = lllllllllllllIIllllllIlIIIIIlIll.withProperty(BlockNewLog.LOG_AXIS, EnumAxis.Y);
                "".length();
                if (((0x5 ^ 0x4A) & ~(0xEE ^ 0xA1)) != 0x0) {
                    return null;
                }
                break;
            }
            case 4: {
                lllllllllllllIIllllllIlIIIIIlIll = lllllllllllllIIllllllIlIIIIIlIll.withProperty(BlockNewLog.LOG_AXIS, EnumAxis.X);
                "".length();
                if (-" ".length() >= ((0xBE ^ 0x86) & ~(0x20 ^ 0x18))) {
                    return null;
                }
                break;
            }
            case 8: {
                lllllllllllllIIllllllIlIIIIIlIll = lllllllllllllIIllllllIlIIIIIlIll.withProperty(BlockNewLog.LOG_AXIS, EnumAxis.Z);
                "".length();
                if (-(0x41 ^ 0x7F ^ (0x3A ^ 0x0)) >= 0) {
                    return null;
                }
                break;
            }
            default: {
                lllllllllllllIIllllllIlIIIIIlIll = lllllllllllllIIllllllIlIIIIIlIll.withProperty(BlockNewLog.LOG_AXIS, EnumAxis.NONE);
                break;
            }
        }
        return lllllllllllllIIllllllIlIIIIIlIll;
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIllllllIlIIIIIIIlI) {
        int lllllllllllllIIllllllIlIIIIIIIll = BlockNewLog.lIIIllIlllllIl[0];
        lllllllllllllIIllllllIlIIIIIIIll |= lllllllllllllIIllllllIlIIIIIIIlI.getValue(BlockNewLog.VARIANT).getMetadata() - BlockNewLog.lIIIllIlllllIl[2];
        switch ($SWITCH_TABLE$net$minecraft$block$BlockLog$EnumAxis()[lllllllllllllIIllllllIlIIIIIIIlI.getValue(BlockNewLog.LOG_AXIS).ordinal()]) {
            case 1: {
                lllllllllllllIIllllllIlIIIIIIIll |= BlockNewLog.lIIIllIlllllIl[2];
                "".length();
                if (null != null) {
                    return (11 + 93 + 2 + 91 ^ 39 + 152 - 27 + 31) & (122 + 105 - 144 + 72 ^ 3 + 11 + 115 + 28 ^ -" ".length());
                }
                break;
            }
            case 3: {
                lllllllllllllIIllllllIlIIIIIIIll |= BlockNewLog.lIIIllIlllllIl[5];
                "".length();
                if (((0xAF ^ 0x87 ^ (0xBC ^ 0xB7)) & (0x2A ^ 0x48 ^ (0xEF ^ 0xAE) ^ -" ".length())) != 0x0) {
                    return (0x83 ^ 0xC3 ^ (0x47 ^ 0x14)) & (0x4 ^ 0x77 ^ (0xC2 ^ 0xA2) ^ -" ".length());
                }
                break;
            }
            case 4: {
                lllllllllllllIIllllllIlIIIIIIIll |= BlockNewLog.lIIIllIlllllIl[4];
                break;
            }
        }
        return lllllllllllllIIllllllIlIIIIIIIll;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockNewLog.lIIIllIlllllIl[6]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockNewLog.lIIIllIlllllIl[0]] = BlockNewLog.VARIANT;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockNewLog.lIIIllIlllllIl[1]] = BlockNewLog.LOG_AXIS;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public MapColor getMapColor(final IBlockState lllllllllllllIIllllllIlIIIIlllII) {
        final BlockPlanks.EnumType lllllllllllllIIllllllIlIIIIllIll = lllllllllllllIIllllllIlIIIIlllII.getValue(BlockNewLog.VARIANT);
        switch ($SWITCH_TABLE$net$minecraft$block$BlockLog$EnumAxis()[lllllllllllllIIllllllIlIIIIlllII.getValue(BlockNewLog.LOG_AXIS).ordinal()]) {
            default: {
                switch ($SWITCH_TABLE$net$minecraft$block$BlockPlanks$EnumType()[lllllllllllllIIllllllIlIIIIllIll.ordinal()]) {
                    default: {
                        return MapColor.stoneColor;
                    }
                    case 6: {
                        return BlockPlanks.EnumType.DARK_OAK.func_181070_c();
                    }
                }
                break;
            }
            case 2: {
                return lllllllllllllIIllllllIlIIIIllIll.func_181070_c();
            }
        }
    }
    
    @Override
    public int damageDropped(final IBlockState lllllllllllllIIllllllIIlllllIlII) {
        return lllllllllllllIIllllllIIlllllIlII.getValue(BlockNewLog.VARIANT).getMetadata() - BlockNewLog.lIIIllIlllllIl[2];
    }
    
    @Override
    protected ItemStack createStackedBlock(final IBlockState lllllllllllllIIllllllIIllllllIlI) {
        return new ItemStack(Item.getItemFromBlock(this), BlockNewLog.lIIIllIlllllIl[1], lllllllllllllIIllllllIIllllllIlI.getValue(BlockNewLog.VARIANT).getMetadata() - BlockNewLog.lIIIllIlllllIl[2]);
    }
    
    private static boolean llIIIlIlIlllIll(final Object lllllllllllllIIllllllIIllllIIIIl) {
        return lllllllllllllIIllllllIIllllIIIIl != null;
    }
    
    static {
        llIIIlIlIlllIlI();
        llIIIlIlIlllIIl();
        VARIANT = PropertyEnum.create(BlockNewLog.lIIIllIlllllII[BlockNewLog.lIIIllIlllllIl[0]], BlockPlanks.EnumType.class, (com.google.common.base.Predicate<BlockPlanks.EnumType>)new Predicate<BlockPlanks.EnumType>() {
            private static final /* synthetic */ int[] lllIIllIlIlIII;
            
            public boolean apply(final BlockPlanks.EnumType llllllllllllIlIlllIlllllIllIIllI) {
                if (lIlIIIIIIllIIlll(llllllllllllIlIlllIlllllIllIIllI.getMetadata(), BlockNewLog$1.lllIIllIlIlIII[0])) {
                    return BlockNewLog$1.lllIIllIlIlIII[1] != 0;
                }
                return BlockNewLog$1.lllIIllIlIlIII[2] != 0;
            }
            
            static {
                lIlIIIIIIllIIllI();
            }
            
            private static boolean lIlIIIIIIllIIlll(final int llllllllllllIlIlllIlllllIlIllllI, final int llllllllllllIlIlllIlllllIlIlllIl) {
                return llllllllllllIlIlllIlllllIlIllllI >= llllllllllllIlIlllIlllllIlIlllIl;
            }
            
            private static void lIlIIIIIIllIIllI() {
                (lllIIllIlIlIII = new int[3])[0] = (0xE ^ 0x79 ^ (0x1A ^ 0x69));
                BlockNewLog$1.lllIIllIlIlIII[1] = " ".length();
                BlockNewLog$1.lllIIllIlIlIII[2] = ((0x9D ^ 0x88 ^ (0x41 ^ 0x6)) & (0x78 ^ 0x5 ^ (0x3C ^ 0x13) ^ -" ".length()));
            }
        });
    }
    
    public BlockNewLog() {
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockNewLog.VARIANT, BlockPlanks.EnumType.ACACIA).withProperty(BlockNewLog.LOG_AXIS, EnumAxis.Y));
    }
    
    @Override
    public void getSubBlocks(final Item lllllllllllllIIllllllIlIIIIlIlIl, final CreativeTabs lllllllllllllIIllllllIlIIIIlIlII, final List<ItemStack> lllllllllllllIIllllllIlIIIIlIIll) {
        lllllllllllllIIllllllIlIIIIlIIll.add(new ItemStack(lllllllllllllIIllllllIlIIIIlIlIl, BlockNewLog.lIIIllIlllllIl[1], BlockPlanks.EnumType.ACACIA.getMetadata() - BlockNewLog.lIIIllIlllllIl[2]));
        "".length();
        lllllllllllllIIllllllIlIIIIlIIll.add(new ItemStack(lllllllllllllIIllllllIlIIIIlIlIl, BlockNewLog.lIIIllIlllllIl[1], BlockPlanks.EnumType.DARK_OAK.getMetadata() - BlockNewLog.lIIIllIlllllIl[2]));
        "".length();
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$block$BlockPlanks$EnumType() {
        final int[] $switch_TABLE$net$minecraft$block$BlockPlanks$EnumType = BlockNewLog.$SWITCH_TABLE$net$minecraft$block$BlockPlanks$EnumType;
        if (llIIIlIlIlllIll($switch_TABLE$net$minecraft$block$BlockPlanks$EnumType)) {
            return $switch_TABLE$net$minecraft$block$BlockPlanks$EnumType;
        }
        "".length();
        final long lllllllllllllIIllllllIIlllllIIlI = (Object)new int[BlockPlanks.EnumType.values().length];
        try {
            lllllllllllllIIllllllIIlllllIIlI[BlockPlanks.EnumType.ACACIA.ordinal()] = BlockNewLog.lIIIllIlllllIl[7];
            "".length();
            if ((0xB6 ^ 0xB2) <= -" ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIllllllIIlllllIIlI[BlockPlanks.EnumType.BIRCH.ordinal()] = BlockNewLog.lIIIllIlllllIl[3];
            "".length();
            if (-" ".length() >= "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIllllllIIlllllIIlI[BlockPlanks.EnumType.DARK_OAK.ordinal()] = BlockNewLog.lIIIllIlllllIl[8];
            "".length();
            if ((0x0 ^ 0x5) == 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIIllllllIIlllllIIlI[BlockPlanks.EnumType.JUNGLE.ordinal()] = BlockNewLog.lIIIllIlllllIl[2];
            "".length();
            if (((0xDF ^ 0x80) & ~(0x99 ^ 0xC6)) != ((0x19 ^ 0x4B) & ~(0xE4 ^ 0xB6))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIIllllllIIlllllIIlI[BlockPlanks.EnumType.OAK.ordinal()] = BlockNewLog.lIIIllIlllllIl[1];
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIIllllllIIlllllIIlI[BlockPlanks.EnumType.SPRUCE.ordinal()] = BlockNewLog.lIIIllIlllllIl[6];
            "".length();
            if ((0x82 ^ 0xB1 ^ (0x2F ^ 0x19)) <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return BlockNewLog.$SWITCH_TABLE$net$minecraft$block$BlockPlanks$EnumType = (int[])(Object)lllllllllllllIIllllllIIlllllIIlI;
    }
    
    private static String llIIIlIlIlllIII(final String lllllllllllllIIllllllIIllllIlIII, final String lllllllllllllIIllllllIIllllIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIllllllIIllllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllllIIllllIIlIl.getBytes(StandardCharsets.UTF_8)), BlockNewLog.lIIIllIlllllIl[5]), "DES");
            final Cipher lllllllllllllIIllllllIIllllIlIlI = Cipher.getInstance("DES");
            lllllllllllllIIllllllIIllllIlIlI.init(BlockNewLog.lIIIllIlllllIl[6], lllllllllllllIIllllllIIllllIlIll);
            return new String(lllllllllllllIIllllllIIllllIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllllIIllllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllllIIllllIlIIl) {
            lllllllllllllIIllllllIIllllIlIIl.printStackTrace();
            return null;
        }
    }
}
