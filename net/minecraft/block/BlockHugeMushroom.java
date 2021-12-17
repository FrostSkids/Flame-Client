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
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.state.BlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyEnum;

public class BlockHugeMushroom extends Block
{
    private static final /* synthetic */ int[] lIlIIIIllIIlIl;
    public static final /* synthetic */ PropertyEnum<EnumType> VARIANT;
    private final /* synthetic */ Block smallBlock;
    private static final /* synthetic */ String[] lIlIIIIllIIIll;
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIIlIIIIIlIIlllllIlI, final Random lllllllllllllIIlIIIIIlIIlllllIIl, final int lllllllllllllIIlIIIIIlIIlllllIII) {
        return Item.getItemFromBlock(this.smallBlock);
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$block$BlockHugeMushroom$EnumType() {
        final int[] $switch_TABLE$net$minecraft$block$BlockHugeMushroom$EnumType = BlockHugeMushroom.$SWITCH_TABLE$net$minecraft$block$BlockHugeMushroom$EnumType;
        if (lllIIIIlllIlIlI($switch_TABLE$net$minecraft$block$BlockHugeMushroom$EnumType)) {
            return $switch_TABLE$net$minecraft$block$BlockHugeMushroom$EnumType;
        }
        "".length();
        final String lllllllllllllIIlIIIIIlIIllIllIII = (Object)new int[EnumType.values().length];
        try {
            lllllllllllllIIlIIIIIlIIllIllIII[EnumType.ALL_INSIDE.ordinal()] = BlockHugeMushroom.lIlIIIIllIIlIl[4];
            "".length();
            if (" ".length() == "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIlIIIIIlIIllIllIII[EnumType.ALL_OUTSIDE.ordinal()] = BlockHugeMushroom.lIlIIIIllIIlIl[5];
            "".length();
            if ((0x6E ^ 0x6A) != (0xA8 ^ 0xAC)) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIlIIIIIlIIllIllIII[EnumType.ALL_STEM.ordinal()] = BlockHugeMushroom.lIlIIIIllIIlIl[6];
            "".length();
            if ("  ".length() <= -" ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIIlIIIIIlIIllIllIII[EnumType.CENTER.ordinal()] = BlockHugeMushroom.lIlIIIIllIIlIl[7];
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIIlIIIIIlIIllIllIII[EnumType.EAST.ordinal()] = BlockHugeMushroom.lIlIIIIllIIlIl[8];
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIIlIIIIIlIIllIllIII[EnumType.NORTH.ordinal()] = BlockHugeMushroom.lIlIIIIllIIlIl[9];
            "".length();
            if (((0xE8 ^ 0x87 ^ (0x68 ^ 0x40)) & (0xE4 ^ 0x8F ^ (0x66 ^ 0x4A) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        try {
            lllllllllllllIIlIIIIIlIIllIllIII[EnumType.NORTH_EAST.ordinal()] = BlockHugeMushroom.lIlIIIIllIIlIl[10];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError7) {
            "".length();
        }
        try {
            lllllllllllllIIlIIIIIlIIllIllIII[EnumType.NORTH_WEST.ordinal()] = BlockHugeMushroom.lIlIIIIllIIlIl[3];
            "".length();
            if ((0x9A ^ 0x9E) <= -" ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError8) {
            "".length();
        }
        try {
            lllllllllllllIIlIIIIIlIIllIllIII[EnumType.SOUTH.ordinal()] = BlockHugeMushroom.lIlIIIIllIIlIl[11];
            "".length();
            if (((134 + 27 - 124 + 128 ^ 157 + 132 - 274 + 146) & (146 + 82 - 145 + 99 ^ 157 + 49 - 186 + 158 ^ -" ".length())) < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError9) {
            "".length();
        }
        try {
            lllllllllllllIIlIIIIIlIIllIllIII[EnumType.SOUTH_EAST.ordinal()] = BlockHugeMushroom.lIlIIIIllIIlIl[12];
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError10) {
            "".length();
        }
        try {
            lllllllllllllIIlIIIIIlIIllIllIII[EnumType.SOUTH_WEST.ordinal()] = BlockHugeMushroom.lIlIIIIllIIlIl[2];
            "".length();
            if ("   ".length() == " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError11) {
            "".length();
        }
        try {
            lllllllllllllIIlIIIIIlIIllIllIII[EnumType.STEM.ordinal()] = BlockHugeMushroom.lIlIIIIllIIlIl[1];
            "".length();
            if (-(0xB ^ 0xE) >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError12) {
            "".length();
        }
        try {
            lllllllllllllIIlIIIIIlIIllIllIII[EnumType.WEST.ordinal()] = BlockHugeMushroom.lIlIIIIllIIlIl[13];
            "".length();
            if (((28 + 57 + 9 + 146 ^ 135 + 18 - 50 + 91) & (113 + 37 - 38 + 68 ^ 133 + 8 - 114 + 107 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError13) {
            "".length();
        }
        return BlockHugeMushroom.$SWITCH_TABLE$net$minecraft$block$BlockHugeMushroom$EnumType = (int[])(Object)lllllllllllllIIlIIIIIlIIllIllIII;
    }
    
    public BlockHugeMushroom(final Material lllllllllllllIIlIIIIIlIlIIIIlIIl, final MapColor lllllllllllllIIlIIIIIlIlIIIIllII, final Block lllllllllllllIIlIIIIIlIlIIIIlIll) {
        super(lllllllllllllIIlIIIIIlIlIIIIlIIl, lllllllllllllIIlIIIIIlIlIIIIllII);
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockHugeMushroom.VARIANT, EnumType.ALL_OUTSIDE));
        this.smallBlock = lllllllllllllIIlIIIIIlIlIIIIlIll;
    }
    
    @Override
    public Item getItem(final World lllllllllllllIIlIIIIIlIIllllIlII, final BlockPos lllllllllllllIIlIIIIIlIIllllIIll) {
        return Item.getItemFromBlock(this.smallBlock);
    }
    
    static {
        lllIIIIlllIlIIl();
        lllIIIIlllIlIII();
        VARIANT = PropertyEnum.create(BlockHugeMushroom.lIlIIIIllIIIll[BlockHugeMushroom.lIlIIIIllIIlIl[0]], EnumType.class);
    }
    
    @Override
    public int quantityDropped(final Random lllllllllllllIIlIIIIIlIlIIIIIlII) {
        return Math.max(BlockHugeMushroom.lIlIIIIllIIlIl[0], lllllllllllllIIlIIIIIlIlIIIIIlII.nextInt(BlockHugeMushroom.lIlIIIIllIIlIl[1]) - BlockHugeMushroom.lIlIIIIllIIlIl[2]);
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIlIIIIIlIIllIlllIl) {
        return lllllllllllllIIlIIIIIlIIllIlllIl.getValue(BlockHugeMushroom.VARIANT).getMetadata();
    }
    
    private static void lllIIIIlllIlIII() {
        (lIlIIIIllIIIll = new String[BlockHugeMushroom.lIlIIIIllIIlIl[3]])[BlockHugeMushroom.lIlIIIIllIIlIl[0]] = lllIIIIlllIIlll("x73vUqJ1/r0=", "fTuMq");
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockHugeMushroom.lIlIIIIllIIlIl[3]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockHugeMushroom.lIlIIIIllIIlIl[0]] = BlockHugeMushroom.VARIANT;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static boolean lllIIIIlllIlIlI(final Object lllllllllllllIIlIIIIIlIIllIIlIIl) {
        return lllllllllllllIIlIIIIIlIIllIIlIIl != null;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIlIIIIIlIIlllIIIll) {
        return this.getDefaultState().withProperty(BlockHugeMushroom.VARIANT, EnumType.byMetadata(lllllllllllllIIlIIIIIlIIlllIIIll));
    }
    
    @Override
    public MapColor getMapColor(final IBlockState lllllllllllllIIlIIIIIlIIllllllll) {
        switch ($SWITCH_TABLE$net$minecraft$block$BlockHugeMushroom$EnumType()[lllllllllllllIIlIIIIIlIIllllllll.getValue(BlockHugeMushroom.VARIANT).ordinal()]) {
            case 13: {
                return MapColor.clothColor;
            }
            case 11: {
                return MapColor.sandColor;
            }
            case 10: {
                return MapColor.sandColor;
            }
            default: {
                return super.getMapColor(lllllllllllllIIlIIIIIlIIllllllll);
            }
        }
    }
    
    @Override
    public IBlockState onBlockPlaced(final World lllllllllllllIIlIIIIIlIIlllIllll, final BlockPos lllllllllllllIIlIIIIIlIIlllIlllI, final EnumFacing lllllllllllllIIlIIIIIlIIlllIllIl, final float lllllllllllllIIlIIIIIlIIlllIllII, final float lllllllllllllIIlIIIIIlIIlllIlIll, final float lllllllllllllIIlIIIIIlIIlllIlIlI, final int lllllllllllllIIlIIIIIlIIlllIlIIl, final EntityLivingBase lllllllllllllIIlIIIIIlIIlllIlIII) {
        return this.getDefaultState();
    }
    
    private static void lllIIIIlllIlIIl() {
        (lIlIIIIllIIlIl = new int[14])[0] = ((0x19 ^ 0x14) & ~(0x7C ^ 0x71));
        BlockHugeMushroom.lIlIIIIllIIlIl[1] = (43 + 141 - 129 + 90 ^ 27 + 141 - 100 + 87);
        BlockHugeMushroom.lIlIIIIllIIlIl[2] = (0x41 ^ 0x34 ^ (0x6C ^ 0x1E));
        BlockHugeMushroom.lIlIIIIllIIlIl[3] = " ".length();
        BlockHugeMushroom.lIlIIIIllIIlIl[4] = (0x63 ^ 0x66 ^ (0xA4 ^ 0xAA));
        BlockHugeMushroom.lIlIIIIllIIlIl[5] = (0x91 ^ 0x9D);
        BlockHugeMushroom.lIlIIIIllIIlIl[6] = (0xC8 ^ 0xC3 ^ (0xB ^ 0xD));
        BlockHugeMushroom.lIlIIIIllIIlIl[7] = (0x2F ^ 0x73 ^ (0xC9 ^ 0x90));
        BlockHugeMushroom.lIlIIIIllIIlIl[8] = (0x41 ^ 0xD ^ (0x2F ^ 0x65));
        BlockHugeMushroom.lIlIIIIllIIlIl[9] = "  ".length();
        BlockHugeMushroom.lIlIIIIllIIlIl[10] = "   ".length();
        BlockHugeMushroom.lIlIIIIllIIlIl[11] = (0x25 ^ 0x1 ^ (0xB9 ^ 0x95));
        BlockHugeMushroom.lIlIIIIllIIlIl[12] = (0x4D ^ 0x7D ^ (0x9F ^ 0xA6));
        BlockHugeMushroom.lIlIIIIllIIlIl[13] = (0x6F ^ 0x6B);
    }
    
    private static String lllIIIIlllIIlll(final String lllllllllllllIIlIIIIIlIIllIlIIII, final String lllllllllllllIIlIIIIIlIIllIIllll) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIIIlIIllIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIIlIIllIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIIIIlIIllIlIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIIIIlIIllIlIIlI.init(BlockHugeMushroom.lIlIIIIllIIlIl[9], lllllllllllllIIlIIIIIlIIllIlIIll);
            return new String(lllllllllllllIIlIIIIIlIIllIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIIlIIllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIIIlIIllIlIIIl) {
            lllllllllllllIIlIIIIIlIIllIlIIIl.printStackTrace();
            return null;
        }
    }
    
    public enum EnumType implements IStringSerializable
    {
        NORTH(EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[2]], EnumType.lllIIIIlIlllII[1], EnumType.lllIIIIlIlllII[2], EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[3]]);
        
        private final /* synthetic */ int meta;
        
        EAST(EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[10]], EnumType.lllIIIIlIlllII[5], EnumType.lllIIIIlIlllII[6], EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[11]]);
        
        private final /* synthetic */ String name;
        
        ALL_INSIDE(EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[20]], EnumType.lllIIIIlIlllII[10], EnumType.lllIIIIlIlllII[0], EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[21]]), 
        SOUTH(EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[14]], EnumType.lllIIIIlIlllII[7], EnumType.lllIIIIlIlllII[8], EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[15]]), 
        NORTH_EAST(EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[4]], EnumType.lllIIIIlIlllII[2], EnumType.lllIIIIlIlllII[3], EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[5]]);
        
        private static final /* synthetic */ EnumType[] META_LOOKUP;
        
        SOUTH_WEST(EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[12]], EnumType.lllIIIIlIlllII[6], EnumType.lllIIIIlIlllII[7], EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[13]]), 
        STEM(EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[18]], EnumType.lllIIIIlIlllII[9], EnumType.lllIIIIlIlllII[10], EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[19]]), 
        CENTER(EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[8]], EnumType.lllIIIIlIlllII[4], EnumType.lllIIIIlIlllII[5], EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[9]]);
        
        private static final /* synthetic */ String[] lllIIIIlIIllII;
        
        SOUTH_EAST(EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[16]], EnumType.lllIIIIlIlllII[8], EnumType.lllIIIIlIlllII[9], EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[17]]), 
        NORTH_WEST(EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[0]], EnumType.lllIIIIlIlllII[0], EnumType.lllIIIIlIlllII[1], EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[1]]), 
        ALL_STEM(EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[24]], EnumType.lllIIIIlIlllII[12], EnumType.lllIIIIlIlllII[15], EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[25]]), 
        WEST(EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[6]], EnumType.lllIIIIlIlllII[3], EnumType.lllIIIIlIlllII[4], EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[7]]);
        
        private static final /* synthetic */ int[] lllIIIIlIlllII;
        
        ALL_OUTSIDE(EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[22]], EnumType.lllIIIIlIlllII[11], EnumType.lllIIIIlIlllII[14], EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[23]]);
        
        private static String lIIlllIIlIIIlIIl(final String llllllllllllIllIIIIlIllIIIlIIlIl, final String llllllllllllIllIIIIlIllIIIlIIlII) {
            try {
                final SecretKeySpec llllllllllllIllIIIIlIllIIIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIlIllIIIlIIlII.getBytes(StandardCharsets.UTF_8)), EnumType.lllIIIIlIlllII[8]), "DES");
                final Cipher llllllllllllIllIIIIlIllIIIlIIlll = Cipher.getInstance("DES");
                llllllllllllIllIIIIlIllIIIlIIlll.init(EnumType.lllIIIIlIlllII[2], llllllllllllIllIIIIlIllIIIlIlIII);
                return new String(llllllllllllIllIIIIlIllIIIlIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIlIllIIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIIIlIllIIIlIIllI) {
                llllllllllllIllIIIIlIllIIIlIIllI.printStackTrace();
                return null;
            }
        }
        
        static {
            lIIlllIIlIlIIIII();
            lIIlllIIlIIllIll();
            final EnumType[] enum$VALUES = new EnumType[EnumType.lllIIIIlIlllII[13]];
            enum$VALUES[EnumType.lllIIIIlIlllII[0]] = EnumType.NORTH_WEST;
            enum$VALUES[EnumType.lllIIIIlIlllII[1]] = EnumType.NORTH;
            enum$VALUES[EnumType.lllIIIIlIlllII[2]] = EnumType.NORTH_EAST;
            enum$VALUES[EnumType.lllIIIIlIlllII[3]] = EnumType.WEST;
            enum$VALUES[EnumType.lllIIIIlIlllII[4]] = EnumType.CENTER;
            enum$VALUES[EnumType.lllIIIIlIlllII[5]] = EnumType.EAST;
            enum$VALUES[EnumType.lllIIIIlIlllII[6]] = EnumType.SOUTH_WEST;
            enum$VALUES[EnumType.lllIIIIlIlllII[7]] = EnumType.SOUTH;
            enum$VALUES[EnumType.lllIIIIlIlllII[8]] = EnumType.SOUTH_EAST;
            enum$VALUES[EnumType.lllIIIIlIlllII[9]] = EnumType.STEM;
            enum$VALUES[EnumType.lllIIIIlIlllII[10]] = EnumType.ALL_INSIDE;
            enum$VALUES[EnumType.lllIIIIlIlllII[11]] = EnumType.ALL_OUTSIDE;
            enum$VALUES[EnumType.lllIIIIlIlllII[12]] = EnumType.ALL_STEM;
            ENUM$VALUES = enum$VALUES;
            META_LOOKUP = new EnumType[EnumType.lllIIIIlIlllII[16]];
            final byte llllllllllllIllIIIIlIllIIlIllllI;
            final double llllllllllllIllIIIIlIllIIlIlllll = ((EnumType[])(Object)(llllllllllllIllIIIIlIllIIlIllllI = (byte)(Object)values())).length;
            boolean llllllllllllIllIIIIlIllIIllIIIII = EnumType.lllIIIIlIlllII[0] != 0;
            "".length();
            if (-(0xC0 ^ 0xAC ^ (0xA9 ^ 0xC1)) > 0) {
                return;
            }
            while (!lIIlllIIlIlIIIIl(llllllllllllIllIIIIlIllIIllIIIII ? 1 : 0, (int)llllllllllllIllIIIIlIllIIlIlllll)) {
                final EnumType llllllllllllIllIIIIlIllIIllIIIlI = llllllllllllIllIIIIlIllIIlIllllI[llllllllllllIllIIIIlIllIIllIIIII];
                EnumType.META_LOOKUP[llllllllllllIllIIIIlIllIIllIIIlI.getMetadata()] = llllllllllllIllIIIIlIllIIllIIIlI;
                ++llllllllllllIllIIIIlIllIIllIIIII;
            }
        }
        
        private static String lIIlllIIlIIIlIlI(final String llllllllllllIllIIIIlIllIIIllIIlI, final String llllllllllllIllIIIIlIllIIIlIllll) {
            try {
                final SecretKeySpec llllllllllllIllIIIIlIllIIIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIlIllIIIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIIIIlIllIIIllIlII = Cipher.getInstance("Blowfish");
                llllllllllllIllIIIIlIllIIIllIlII.init(EnumType.lllIIIIlIlllII[2], llllllllllllIllIIIIlIllIIIllIlIl);
                return new String(llllllllllllIllIIIIlIllIIIllIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIlIllIIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIIIlIllIIIllIIll) {
                llllllllllllIllIIIIlIllIIIllIIll.printStackTrace();
                return null;
            }
        }
        
        @Override
        public String getName() {
            return this.name;
        }
        
        private static boolean lIIlllIIlIlIIIlI(final int llllllllllllIllIIIIlIlIlllllllII) {
            return llllllllllllIllIIIIlIlIlllllllII >= 0;
        }
        
        public int getMetadata() {
            return this.meta;
        }
        
        public static EnumType byMetadata(int llllllllllllIllIIIIlIllIIlIIIllI) {
            if (!lIIlllIIlIlIIIlI((int)llllllllllllIllIIIIlIllIIlIIIllI) || lIIlllIIlIlIIIIl((int)llllllllllllIllIIIIlIllIIlIIIllI, EnumType.META_LOOKUP.length)) {
                llllllllllllIllIIIIlIllIIlIIIllI = EnumType.lllIIIIlIlllII[0];
            }
            final EnumType llllllllllllIllIIIIlIllIIlIIIlll = EnumType.META_LOOKUP[llllllllllllIllIIIIlIllIIlIIIllI];
            EnumType enumType;
            if (lIIlllIIlIlIIIll(llllllllllllIllIIIIlIllIIlIIIlll)) {
                enumType = EnumType.META_LOOKUP[EnumType.lllIIIIlIlllII[0]];
                "".length();
                if (-(0xA4 ^ 0xA0) >= 0) {
                    return null;
                }
            }
            else {
                enumType = llllllllllllIllIIIIlIllIIlIIIlll;
            }
            return enumType;
        }
        
        private EnumType(final String llllllllllllIllIIIIlIllIIlIlIlII, final int llllllllllllIllIIIIlIllIIlIlIIll, final int llllllllllllIllIIIIlIllIIlIlIIlI, final String llllllllllllIllIIIIlIllIIlIlIIIl) {
            this.meta = llllllllllllIllIIIIlIllIIlIlIIlI;
            this.name = llllllllllllIllIIIIlIllIIlIlIIIl;
        }
        
        private static boolean lIIlllIIlIlIIIll(final Object llllllllllllIllIIIIlIlIllllllllI) {
            return llllllllllllIllIIIIlIlIllllllllI == null;
        }
        
        private static String lIIlllIIlIIIlIII(String llllllllllllIllIIIIlIllIIIIlIIII, final String llllllllllllIllIIIIlIllIIIIlIlII) {
            llllllllllllIllIIIIlIllIIIIlIIII = new String(Base64.getDecoder().decode(llllllllllllIllIIIIlIllIIIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIIIIlIllIIIIlIIll = new StringBuilder();
            final char[] llllllllllllIllIIIIlIllIIIIlIIlI = llllllllllllIllIIIIlIllIIIIlIlII.toCharArray();
            int llllllllllllIllIIIIlIllIIIIlIIIl = EnumType.lllIIIIlIlllII[0];
            final short llllllllllllIllIIIIlIllIIIIIlIll = (Object)llllllllllllIllIIIIlIllIIIIlIIII.toCharArray();
            final float llllllllllllIllIIIIlIllIIIIIlIlI = llllllllllllIllIIIIlIllIIIIIlIll.length;
            char llllllllllllIllIIIIlIllIIIIIlIIl = (char)EnumType.lllIIIIlIlllII[0];
            while (lIIlllIIlIlIIlII(llllllllllllIllIIIIlIllIIIIIlIIl, (int)llllllllllllIllIIIIlIllIIIIIlIlI)) {
                final char llllllllllllIllIIIIlIllIIIIlIllI = llllllllllllIllIIIIlIllIIIIIlIll[llllllllllllIllIIIIlIllIIIIIlIIl];
                llllllllllllIllIIIIlIllIIIIlIIll.append((char)(llllllllllllIllIIIIlIllIIIIlIllI ^ llllllllllllIllIIIIlIllIIIIlIIlI[llllllllllllIllIIIIlIllIIIIlIIIl % llllllllllllIllIIIIlIllIIIIlIIlI.length]));
                "".length();
                ++llllllllllllIllIIIIlIllIIIIlIIIl;
                ++llllllllllllIllIIIIlIllIIIIIlIIl;
                "".length();
                if ((105 + 16 + 13 + 63 ^ 72 + 171 - 112 + 61) == 0x0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIIIIlIllIIIIlIIll);
        }
        
        private static boolean lIIlllIIlIlIIlII(final int llllllllllllIllIIIIlIllIIIIIIIIl, final int llllllllllllIllIIIIlIllIIIIIIIII) {
            return llllllllllllIllIIIIlIllIIIIIIIIl < llllllllllllIllIIIIlIllIIIIIIIII;
        }
        
        private static void lIIlllIIlIlIIIII() {
            (lllIIIIlIlllII = new int[27])[0] = ((0xD1 ^ 0x86) & ~(0x9 ^ 0x5E));
            EnumType.lllIIIIlIlllII[1] = " ".length();
            EnumType.lllIIIIlIlllII[2] = "  ".length();
            EnumType.lllIIIIlIlllII[3] = "   ".length();
            EnumType.lllIIIIlIlllII[4] = (0xAF ^ 0xAB);
            EnumType.lllIIIIlIlllII[5] = (0xDA ^ 0x95 ^ (0x32 ^ 0x78));
            EnumType.lllIIIIlIlllII[6] = (0x4F ^ 0x38 ^ (0xE6 ^ 0x97));
            EnumType.lllIIIIlIlllII[7] = (0x60 ^ 0x21 ^ (0xD9 ^ 0x9F));
            EnumType.lllIIIIlIlllII[8] = (0x35 ^ 0x21 ^ (0x29 ^ 0x35));
            EnumType.lllIIIIlIlllII[9] = (0x2C ^ 0x25);
            EnumType.lllIIIIlIlllII[10] = (0x7C ^ 0x76);
            EnumType.lllIIIIlIlllII[11] = (0x6F ^ 0x64);
            EnumType.lllIIIIlIlllII[12] = (127 + 18 - 123 + 122 ^ 152 + 0 - 28 + 32);
            EnumType.lllIIIIlIlllII[13] = (0x72 ^ 0x57 ^ (0x35 ^ 0x1D));
            EnumType.lllIIIIlIlllII[14] = (0x4B ^ 0x45);
            EnumType.lllIIIIlIlllII[15] = (0x5A ^ 0x55);
            EnumType.lllIIIIlIlllII[16] = (44 + 83 - 126 + 210 ^ 155 + 130 - 114 + 24);
            EnumType.lllIIIIlIlllII[17] = (0x46 ^ 0x64 ^ (0x7D ^ 0x4E));
            EnumType.lllIIIIlIlllII[18] = (0xB1 ^ 0xA3);
            EnumType.lllIIIIlIlllII[19] = (0x9E ^ 0xB3 ^ (0x2F ^ 0x11));
            EnumType.lllIIIIlIlllII[20] = (0x96 ^ 0x82);
            EnumType.lllIIIIlIlllII[21] = (0x43 ^ 0x49 ^ (0x49 ^ 0x56));
            EnumType.lllIIIIlIlllII[22] = (0x94 ^ 0xC7 ^ (0xC4 ^ 0x81));
            EnumType.lllIIIIlIlllII[23] = (0x6B ^ 0x3A ^ (0x67 ^ 0x21));
            EnumType.lllIIIIlIlllII[24] = (0x74 ^ 0x6C);
            EnumType.lllIIIIlIlllII[25] = (0x82 ^ 0x9B);
            EnumType.lllIIIIlIlllII[26] = (110 + 61 - 17 + 1 ^ 112 + 68 - 114 + 63);
        }
        
        @Override
        public String toString() {
            return this.name;
        }
        
        private static boolean lIIlllIIlIlIIIIl(final int llllllllllllIllIIIIlIllIIIIIIlIl, final int llllllllllllIllIIIIlIllIIIIIIlII) {
            return llllllllllllIllIIIIlIllIIIIIIlIl >= llllllllllllIllIIIIlIllIIIIIIlII;
        }
        
        private static void lIIlllIIlIIllIll() {
            (lllIIIIlIIllII = new String[EnumType.lllIIIIlIlllII[26]])[EnumType.lllIIIIlIlllII[0]] = lIIlllIIlIIIlIII("DCY5FyMdPi4QPw==", "BikCk");
            EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[1]] = lIIlllIIlIIIlIIl("u4rywzwZ8h3iptNwNckwyQ==", "KfCKu");
            EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[2]] = lIIlllIIlIIIlIII("BQcKAiQ=", "KHXVl");
            EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[3]] = lIIlllIIlIIIlIIl("RjIdq+FkWpc=", "pkARc");
            EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[4]] = lIIlllIIlIIIlIIl("yiwuWI80xcykZRDDVuUPsQ==", "VuDph");
            EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[5]] = lIIlllIIlIIIlIII("CjsEIzE7MRckLQ==", "dTvWY");
            EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[6]] = lIIlllIIlIIIlIII("BS06EA==", "RhiDl");
            EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[7]] = lIIlllIIlIIIlIlI("MxesliAdRrU=", "sOkqr");
            EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[8]] = lIIlllIIlIIIlIII("ETwKJj0A", "RyDrx");
            EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[9]] = lIIlllIIlIIIlIIl("YbHI6U3IKjE=", "Xmaad");
            EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[10]] = lIIlllIIlIIIlIlI("l4NyaLZwdVc=", "YMgup");
            EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[11]] = lIIlllIIlIIIlIlI("oPZP74Eh9GQ=", "IoORZ");
            EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[12]] = lIIlllIIlIIIlIII("EgU3NxkeHScwBQ==", "AJbcQ");
            EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[13]] = lIIlllIIlIIIlIII("FxYaIy87DgokMw==", "dyoWG");
            EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[14]] = lIIlllIIlIIIlIlI("vYpMi+4Eg7o=", "LdtxN");
            EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[15]] = lIIlllIIlIIIlIII("IwoxLQ0=", "PeDYe");
            EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[16]] = lIIlllIIlIIIlIII("PTYmFjkxPDIRJQ==", "nysBq");
            EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[17]] = lIIlllIIlIIIlIIl("GkLY5v6Vflwf5iG1L+rRfQ==", "bLMDI");
            EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[18]] = lIIlllIIlIIIlIlI("GB1LOYMW0uI=", "JdDEH");
            EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[19]] = lIIlllIIlIIIlIIl("3j+ltABaK9w=", "LRKyL");
            EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[20]] = lIIlllIIlIIIlIlI("jTPI0ajuWzkMmt/YXqMTzQ==", "PbSYW");
            EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[21]] = lIIlllIIlIIIlIII("KCMvDw0nPCo0AQ==", "IOCPd");
            EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[22]] = lIIlllIIlIIIlIIl("RWEGKLFi0GTm52vhmUxNtA==", "iMyRb");
            EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[23]] = lIIlllIIlIIIlIIl("w7lTmZU3hf52G0oTfRbOHg==", "oJKhD");
            EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[24]] = lIIlllIIlIIIlIII("NwE2KgciCDc=", "vMzuT");
            EnumType.lllIIIIlIIllII[EnumType.lllIIIIlIlllII[25]] = lIIlllIIlIIIlIII("NiEkDzojKCU=", "WMHPI");
        }
    }
}
