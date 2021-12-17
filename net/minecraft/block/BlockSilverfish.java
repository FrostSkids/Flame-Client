// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Arrays;
import net.minecraft.util.IStringSerializable;
import java.util.List;
import net.minecraft.item.Item;
import net.minecraft.block.state.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.block.state.IBlockState;
import java.util.Random;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.material.Material;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.properties.PropertyEnum;

public class BlockSilverfish extends Block
{
    private static final /* synthetic */ String[] llllIllIIIlII;
    public static final /* synthetic */ PropertyEnum<EnumType> VARIANT;
    private static final /* synthetic */ int[] llllIllIIIlIl;
    
    private static String lIlIlIlIlllIlII(final String lllllllllllllIlIllIlIIllIIllllII, final String lllllllllllllIlIllIlIIllIIllllIl) {
        try {
            final SecretKeySpec lllllllllllllIlIllIlIIllIlIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIlIIllIIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllIlIIllIlIIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllIlIIllIlIIIIII.init(BlockSilverfish.llllIllIIIlIl[3], lllllllllllllIlIllIlIIllIlIIIIIl);
            return new String(lllllllllllllIlIllIlIIllIlIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIlIIllIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIlIIllIIllllll) {
            lllllllllllllIlIllIlIIllIIllllll.printStackTrace();
            return null;
        }
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$block$BlockSilverfish$EnumType() {
        final int[] $switch_TABLE$net$minecraft$block$BlockSilverfish$EnumType = BlockSilverfish.$SWITCH_TABLE$net$minecraft$block$BlockSilverfish$EnumType;
        if (lIlIlIlIllllIll($switch_TABLE$net$minecraft$block$BlockSilverfish$EnumType)) {
            return $switch_TABLE$net$minecraft$block$BlockSilverfish$EnumType;
        }
        "".length();
        final char lllllllllllllIlIllIlIIllIlIIIllI = (Object)new int[EnumType.values().length];
        try {
            lllllllllllllIlIllIlIIllIlIIIllI[EnumType.CHISELED_STONEBRICK.ordinal()] = BlockSilverfish.llllIllIIIlIl[2];
            "".length();
            if (((73 + 155 - 128 + 75 ^ 49 + 149 - 175 + 137) & (0x3B ^ 0x43 ^ (0xC2 ^ 0xB5) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIlIllIlIIllIlIIIllI[EnumType.COBBLESTONE.ordinal()] = BlockSilverfish.llllIllIIIlIl[3];
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIlIllIlIIllIlIIIllI[EnumType.CRACKED_STONEBRICK.ordinal()] = BlockSilverfish.llllIllIIIlIl[4];
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIlIllIlIIllIlIIIllI[EnumType.MOSSY_STONEBRICK.ordinal()] = BlockSilverfish.llllIllIIIlIl[5];
            "".length();
            if ((0xB6 ^ 0x95 ^ (0x78 ^ 0x5F)) <= "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIlIllIlIIllIlIIIllI[EnumType.STONE.ordinal()] = BlockSilverfish.llllIllIIIlIl[1];
            "".length();
            if (-(59 + 138 - 118 + 118 ^ 136 + 177 - 216 + 96) > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIlIllIlIIllIlIIIllI[EnumType.STONEBRICK.ordinal()] = BlockSilverfish.llllIllIIIlIl[6];
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return BlockSilverfish.$SWITCH_TABLE$net$minecraft$block$BlockSilverfish$EnumType = (int[])(Object)lllllllllllllIlIllIlIIllIlIIIllI;
    }
    
    static {
        lIlIlIlIlllIllI();
        lIlIlIlIlllIlIl();
        VARIANT = PropertyEnum.create(BlockSilverfish.llllIllIIIlII[BlockSilverfish.llllIllIIIlIl[0]], EnumType.class);
    }
    
    public BlockSilverfish() {
        super(Material.clay);
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockSilverfish.VARIANT, EnumType.STONE));
        this.setHardness(0.0f);
        "".length();
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
    }
    
    private static boolean lIlIlIlIllllIll(final Object lllllllllllllIlIllIlIIllIIlIllll) {
        return lllllllllllllIlIllIlIIllIIlIllll != null;
    }
    
    private static boolean lIlIlIlIllllIII(final int lllllllllllllIlIllIlIIllIIlIlIll) {
        return lllllllllllllIlIllIlIIllIIlIlIll == 0;
    }
    
    private static boolean lIlIlIlIllllIIl(final int lllllllllllllIlIllIlIIllIIlIllIl) {
        return lllllllllllllIlIllIlIIllIIlIllIl != 0;
    }
    
    @Override
    public int quantityDropped(final Random lllllllllllllIlIllIlIIlllIIIIlll) {
        return BlockSilverfish.llllIllIIIlIl[0];
    }
    
    @Override
    protected ItemStack createStackedBlock(final IBlockState lllllllllllllIlIllIlIIllIlllllIl) {
        switch ($SWITCH_TABLE$net$minecraft$block$BlockSilverfish$EnumType()[lllllllllllllIlIllIlIIllIlllllIl.getValue(BlockSilverfish.VARIANT).ordinal()]) {
            case 2: {
                return new ItemStack(Blocks.cobblestone);
            }
            case 3: {
                return new ItemStack(Blocks.stonebrick);
            }
            case 4: {
                return new ItemStack(Blocks.stonebrick, BlockSilverfish.llllIllIIIlIl[1], BlockStoneBrick.EnumType.MOSSY.getMetadata());
            }
            case 5: {
                return new ItemStack(Blocks.stonebrick, BlockSilverfish.llllIllIIIlIl[1], BlockStoneBrick.EnumType.CRACKED.getMetadata());
            }
            case 6: {
                return new ItemStack(Blocks.stonebrick, BlockSilverfish.llllIllIIIlIl[1], BlockStoneBrick.EnumType.CHISELED.getMetadata());
            }
            default: {
                return new ItemStack(Blocks.stone);
            }
        }
    }
    
    @Override
    public void dropBlockAsItemWithChance(final World lllllllllllllIlIllIlIIllIlllIIlI, final BlockPos lllllllllllllIlIllIlIIllIlllIlll, final IBlockState lllllllllllllIlIllIlIIllIlllIllI, final float lllllllllllllIlIllIlIIllIlllIlIl, final int lllllllllllllIlIllIlIIllIlllIlII) {
        if (lIlIlIlIllllIII(lllllllllllllIlIllIlIIllIlllIIlI.isRemote ? 1 : 0) && lIlIlIlIllllIIl(lllllllllllllIlIllIlIIllIlllIIlI.getGameRules().getBoolean(BlockSilverfish.llllIllIIIlII[BlockSilverfish.llllIllIIIlIl[1]]) ? 1 : 0)) {
            final EntitySilverfish lllllllllllllIlIllIlIIllIlllIIll = new EntitySilverfish(lllllllllllllIlIllIlIIllIlllIIlI);
            lllllllllllllIlIllIlIIllIlllIIll.setLocationAndAngles(lllllllllllllIlIllIlIIllIlllIlll.getX() + 0.5, lllllllllllllIlIllIlIIllIlllIlll.getY(), lllllllllllllIlIllIlIIllIlllIlll.getZ() + 0.5, 0.0f, 0.0f);
            lllllllllllllIlIllIlIIllIlllIIlI.spawnEntityInWorld(lllllllllllllIlIllIlIIllIlllIIll);
            "".length();
            lllllllllllllIlIllIlIIllIlllIIll.spawnExplosionParticle();
        }
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockSilverfish.llllIllIIIlIl[1]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockSilverfish.llllIllIIIlIl[0]] = BlockSilverfish.VARIANT;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public void getSubBlocks(final Item lllllllllllllIlIllIlIIllIlIllllI, final CreativeTabs lllllllllllllIlIllIlIIllIlIlllIl, final List<ItemStack> lllllllllllllIlIllIlIIllIlIllIIl) {
        final short lllllllllllllIlIllIlIIllIlIlIlIl;
        final double lllllllllllllIlIllIlIIllIlIlIllI = ((EnumType[])(Object)(lllllllllllllIlIllIlIIllIlIlIlIl = (short)(Object)EnumType.values())).length;
        short lllllllllllllIlIllIlIIllIlIlIlll = (short)BlockSilverfish.llllIllIIIlIl[0];
        "".length();
        if (((0x3 ^ 0x63) & ~(0x50 ^ 0x30)) == " ".length()) {
            return;
        }
        while (!lIlIlIlIllllIlI(lllllllllllllIlIllIlIIllIlIlIlll, (int)lllllllllllllIlIllIlIIllIlIlIllI)) {
            final EnumType lllllllllllllIlIllIlIIllIlIllIll = lllllllllllllIlIllIlIIllIlIlIlIl[lllllllllllllIlIllIlIIllIlIlIlll];
            lllllllllllllIlIllIlIIllIlIllIIl.add(new ItemStack(lllllllllllllIlIllIlIIllIlIllllI, BlockSilverfish.llllIllIIIlIl[1], lllllllllllllIlIllIlIIllIlIllIll.getMetadata()));
            "".length();
            ++lllllllllllllIlIllIlIIllIlIlIlll;
        }
    }
    
    private static void lIlIlIlIlllIlIl() {
        (llllIllIIIlII = new String[BlockSilverfish.llllIllIIIlIl[3]])[BlockSilverfish.llllIllIIIlIl[0]] = lIlIlIlIlllIlII("32Gz37tGU8Y=", "iDjTg");
        BlockSilverfish.llllIllIIIlII[BlockSilverfish.llllIllIIIlIl[1]] = lIlIlIlIlllIlII("FMc83L5wC+p72JKeWLYNYw==", "qgcxj");
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIlIllIlIIllIlIlIIIl) {
        return this.getDefaultState().withProperty(BlockSilverfish.VARIANT, EnumType.byMetadata(lllllllllllllIlIllIlIIllIlIlIIIl));
    }
    
    private static void lIlIlIlIlllIllI() {
        (llllIllIIIlIl = new int[7])[0] = ((79 + 46 - 22 + 77 ^ 67 + 51 - 22 + 47) & (0x67 ^ 0x4D ^ (0xA9 ^ 0xB8) ^ -" ".length()));
        BlockSilverfish.llllIllIIIlIl[1] = " ".length();
        BlockSilverfish.llllIllIIIlIl[2] = (0xD ^ 0xB);
        BlockSilverfish.llllIllIIIlIl[3] = "  ".length();
        BlockSilverfish.llllIllIIIlIl[4] = (0x9E ^ 0x89 ^ (0x95 ^ 0x87));
        BlockSilverfish.llllIllIIIlIl[5] = (0xBA ^ 0xBE);
        BlockSilverfish.llllIllIIIlIl[6] = "   ".length();
    }
    
    private static boolean lIlIlIlIlllIlll(final Object lllllllllllllIlIllIlIIllIIllIIlI, final Object lllllllllllllIlIllIlIIllIIllIIIl) {
        return lllllllllllllIlIllIlIIllIIllIIlI != lllllllllllllIlIllIlIIllIIllIIIl;
    }
    
    public static boolean canContainSilverfish(final IBlockState lllllllllllllIlIllIlIIlllIIIIlII) {
        final Block lllllllllllllIlIllIlIIlllIIIIIll = lllllllllllllIlIllIlIIlllIIIIlII.getBlock();
        if (lIlIlIlIlllIlll(lllllllllllllIlIllIlIIlllIIIIlII, Blocks.stone.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.STONE)) && lIlIlIlIlllIlll(lllllllllllllIlIllIlIIlllIIIIIll, Blocks.cobblestone) && lIlIlIlIlllIlll(lllllllllllllIlIllIlIIlllIIIIIll, Blocks.stonebrick)) {
            return BlockSilverfish.llllIllIIIlIl[0] != 0;
        }
        return BlockSilverfish.llllIllIIIlIl[1] != 0;
    }
    
    private static boolean lIlIlIlIllllIlI(final int lllllllllllllIlIllIlIIllIIllIllI, final int lllllllllllllIlIllIlIIllIIllIlIl) {
        return lllllllllllllIlIllIlIIllIIllIllI >= lllllllllllllIlIllIlIIllIIllIlIl;
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIlIllIlIIllIlIIlIll) {
        return lllllllllllllIlIllIlIIllIlIIlIll.getValue(BlockSilverfish.VARIANT).getMetadata();
    }
    
    @Override
    public int getDamageValue(final World lllllllllllllIlIllIlIIllIllIlIll, final BlockPos lllllllllllllIlIllIlIIllIllIlIlI) {
        final IBlockState lllllllllllllIlIllIlIIllIllIlIIl = lllllllllllllIlIllIlIIllIllIlIll.getBlockState(lllllllllllllIlIllIlIIllIllIlIlI);
        return lllllllllllllIlIllIlIIllIllIlIIl.getBlock().getMetaFromState(lllllllllllllIlIllIlIIllIllIlIIl);
    }
    
    public enum EnumType implements IStringSerializable
    {
        private final /* synthetic */ String name;
        
        CRACKED_STONEBRICK(EnumType.llIIlllIlIIIll[4], EnumType.llIIlllIlIIIll[4], EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[12]], EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[13]]) {
            @Override
            public IBlockState getModelBlock() {
                return Blocks.stonebrick.getDefaultState().withProperty(BlockStoneBrick.VARIANT, BlockStoneBrick.EnumType.CRACKED);
            }
        }, 
        MOSSY_STONEBRICK(EnumType.llIIlllIlIIIll[3], EnumType.llIIlllIlIIIll[3], EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[9]], EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[10]]) {
            @Override
            public IBlockState getModelBlock() {
                return Blocks.stonebrick.getDefaultState().withProperty(BlockStoneBrick.VARIANT, BlockStoneBrick.EnumType.MOSSY);
            }
        }, 
        STONE(EnumType.llIIlllIlIIIll[0], EnumType.llIIlllIlIIIll[0], EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[1]]) {
            @Override
            public IBlockState getModelBlock() {
                return Blocks.stone.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.STONE);
            }
        };
        
        private final /* synthetic */ int meta;
        private static final /* synthetic */ EnumType[] META_LOOKUP;
        private final /* synthetic */ String unlocalizedName;
        
        CHISELED_STONEBRICK(EnumType.llIIlllIlIIIll[5], EnumType.llIIlllIlIIIll[5], EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[15]], EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[16]]) {
            @Override
            public IBlockState getModelBlock() {
                return Blocks.stonebrick.getDefaultState().withProperty(BlockStoneBrick.VARIANT, BlockStoneBrick.EnumType.CHISELED);
            }
        };
        
        private static final /* synthetic */ String[] llIIlllIIllllI;
        private static final /* synthetic */ int[] llIIlllIlIIIll;
        
        STONEBRICK(EnumType.llIIlllIlIIIll[2], EnumType.llIIlllIlIIIll[2], EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[6]], EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[7]]) {
            @Override
            public IBlockState getModelBlock() {
                return Blocks.stonebrick.getDefaultState().withProperty(BlockStoneBrick.VARIANT, BlockStoneBrick.EnumType.DEFAULT);
            }
        }, 
        COBBLESTONE(EnumType.llIIlllIlIIIll[1], EnumType.llIIlllIlIIIll[1], EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[3]], EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[4]]) {
            @Override
            public IBlockState getModelBlock() {
                return Blocks.cobblestone.getDefaultState();
            }
        };
        
        @Override
        public String toString() {
            return this.name;
        }
        
        private static boolean lIIIlllllIIllIlI(final int llllllllllllIllIllllIllIIlllIlII) {
            return llllllllllllIllIllllIllIIlllIlII >= 0;
        }
        
        private EnumType(final String llllllllllllIllIllllIlllIIIIIIII, final int llllllllllllIllIllllIllIllllllll, final int llllllllllllIllIllllIllIlllllllI, final String llllllllllllIllIllllIllIllllllIl) {
            this(llllllllllllIllIllllIlllIIIIIIII, llllllllllllIllIllllIllIllllllll, llllllllllllIllIllllIllIlllllllI, llllllllllllIllIllllIllIllllllIl, llllllllllllIllIllllIllIllllllIl);
        }
        
        public abstract IBlockState getModelBlock();
        
        private static boolean lIIIlllllIIlllII(final int llllllllllllIllIllllIllIIllllIll, final int llllllllllllIllIllllIllIIllllIlI) {
            return llllllllllllIllIllllIllIIllllIll < llllllllllllIllIllllIllIIllllIlI;
        }
        
        private static void lIIIlllllIIllIII() {
            (llIIlllIlIIIll = new int[18])[0] = ((0x7C ^ 0x48 ^ (0x27 ^ 0x1)) & (0xD0 ^ 0x90 ^ (0x47 ^ 0x15) ^ -" ".length()));
            EnumType.llIIlllIlIIIll[1] = " ".length();
            EnumType.llIIlllIlIIIll[2] = "  ".length();
            EnumType.llIIlllIlIIIll[3] = "   ".length();
            EnumType.llIIlllIlIIIll[4] = (0xF6 ^ 0xBD ^ (0xDC ^ 0x93));
            EnumType.llIIlllIlIIIll[5] = (33 + 13 + 65 + 86 ^ 159 + 117 - 149 + 65);
            EnumType.llIIlllIlIIIll[6] = (0x91 ^ 0x97);
            EnumType.llIIlllIlIIIll[7] = (0x5 ^ 0x2);
            EnumType.llIIlllIlIIIll[8] = (0x11 ^ 0x66 ^ 60 + 33 - 70 + 104);
            EnumType.llIIlllIlIIIll[9] = (0xFE ^ 0xBA ^ (0x62 ^ 0x2F));
            EnumType.llIIlllIlIIIll[10] = (0xD2 ^ 0xBB ^ (0x7 ^ 0x64));
            EnumType.llIIlllIlIIIll[11] = (69 + 57 + 11 + 7 ^ 24 + 127 - 78 + 82);
            EnumType.llIIlllIlIIIll[12] = (0x97 ^ 0x9B);
            EnumType.llIIlllIlIIIll[13] = (126 + 81 - 125 + 76 ^ 62 + 54 - 109 + 140);
            EnumType.llIIlllIlIIIll[14] = (0x8D ^ 0x83);
            EnumType.llIIlllIlIIIll[15] = (10 + 2 + 8 + 120 ^ 66 + 90 - 90 + 65);
            EnumType.llIIlllIlIIIll[16] = (0x1F ^ 0xF);
            EnumType.llIIlllIlIIIll[17] = (0x3B ^ 0x2A);
        }
        
        public static EnumType forModelBlock(final IBlockState llllllllllllIllIllllIllIllIllIII) {
            final double llllllllllllIllIllllIllIllIlIIlI;
            final Exception llllllllllllIllIllllIllIllIlIIll = (Exception)((EnumType[])(Object)(llllllllllllIllIllllIllIllIlIIlI = (double)(Object)values())).length;
            float llllllllllllIllIllllIllIllIlIlII = EnumType.llIIlllIlIIIll[0];
            "".length();
            if (-(0x0 ^ 0x4) >= 0) {
                return null;
            }
            while (!lIIIlllllIIllIIl((int)llllllllllllIllIllllIllIllIlIlII, (int)llllllllllllIllIllllIllIllIlIIll)) {
                final EnumType llllllllllllIllIllllIllIllIlIlll = llllllllllllIllIllllIllIllIlIIlI[llllllllllllIllIllllIllIllIlIlII];
                if (lIIIlllllIIllIll(llllllllllllIllIllllIllIllIllIII, llllllllllllIllIllllIllIllIlIlll.getModelBlock())) {
                    return llllllllllllIllIllllIllIllIlIlll;
                }
                ++llllllllllllIllIllllIllIllIlIlII;
            }
            return EnumType.STONE;
        }
        
        private static boolean lIIIlllllIIllIIl(final int llllllllllllIllIllllIllIIlllllll, final int llllllllllllIllIllllIllIIllllllI) {
            return llllllllllllIllIllllIllIIlllllll >= llllllllllllIllIllllIllIIllllllI;
        }
        
        @Override
        public String getName() {
            return this.name;
        }
        
        private static void lIIIlllllIIIllII() {
            (llIIlllIIllllI = new String[EnumType.llIIlllIlIIIll[17]])[EnumType.llIIlllIlIIIll[0]] = lIIIlllllIIIlIII("IZaj4Rvxi0I=", "peLbD");
            EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[1]] = lIIIlllllIIIlIlI("Gy0GFwY=", "hYiyc");
            EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[2]] = lIIIlllllIIIlIll("qJWwRyILQt5aRYiB4ybryA==", "iECTI");
            EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[3]] = lIIIlllllIIIlIll("pb5r6pp7SMDev97jJUdQ/g==", "oqNpC");
            EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[4]] = lIIIlllllIIIlIll("el/bn4xIcnQ=", "yjWmE");
            EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[5]] = lIIIlllllIIIlIll("Hg3M6vpNYAeCm9zvLLBDBw==", "ModIA");
            EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[6]] = lIIIlllllIIIlIlI("NDY9Hw4YICAYCCw=", "GBRqk");
            EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[7]] = lIIIlllllIIIlIlI("BDw6GgQ=", "fNSyo");
            EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[8]] = lIIIlllllIIIlIll("pjsrKSeSqH7eZDX/mqIkt8jXi+T3P75a", "xdYVG");
            EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[9]] = lIIIlllllIIIlIlI("JhwYAB0UERkaByA=", "Ksksd");
            EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[10]] = lIIIlllllIIIlIll("Q5WkVqMOuoe4bwV6VrhYJQ==", "TRIVG");
            EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[11]] = lIIIlllllIIIlIll("CdN4tqzzRj+PLJheDIuV233Xt/Y7tfTZ", "OVqdI");
            EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[12]] = lIIIlllllIIIlIll("JO5/MbeGX6LRqjZuWdzz8A==", "AWFSq");
            EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[13]] = lIIIlllllIIIlIll("9/068CvUplK/6dntOp1rTQ==", "PVvEb");
            EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[14]] = lIIIlllllIIIlIll("S0vvZrI6YoxNju3plFiFyaHX7Cw5A6ge", "SoVuB");
            EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[15]] = lIIIlllllIIIlIII("NcAK9DhQid6sxDnG1lM/iw==", "YrUwV");
            EnumType.llIIlllIIllllI[EnumType.llIIlllIlIIIll[16]] = lIIIlllllIIIlIll("zshGgz3MxY/yTY4/outieQ==", "fvxQR");
        }
        
        static {
            lIIIlllllIIllIII();
            lIIIlllllIIIllII();
            final EnumType[] enum$VALUES = new EnumType[EnumType.llIIlllIlIIIll[6]];
            enum$VALUES[EnumType.llIIlllIlIIIll[0]] = EnumType.STONE;
            enum$VALUES[EnumType.llIIlllIlIIIll[1]] = EnumType.COBBLESTONE;
            enum$VALUES[EnumType.llIIlllIlIIIll[2]] = EnumType.STONEBRICK;
            enum$VALUES[EnumType.llIIlllIlIIIll[3]] = EnumType.MOSSY_STONEBRICK;
            enum$VALUES[EnumType.llIIlllIlIIIll[4]] = EnumType.CRACKED_STONEBRICK;
            enum$VALUES[EnumType.llIIlllIlIIIll[5]] = EnumType.CHISELED_STONEBRICK;
            ENUM$VALUES = enum$VALUES;
            META_LOOKUP = new EnumType[values().length];
            final boolean llllllllllllIllIllllIlllIIIIlIlI;
            final long llllllllllllIllIllllIlllIIIIlIll = ((EnumType[])(Object)(llllllllllllIllIllllIlllIIIIlIlI = (boolean)(Object)values())).length;
            float llllllllllllIllIllllIlllIIIIllII = EnumType.llIIlllIlIIIll[0];
            "".length();
            if (((25 + 116 - 36 + 77 ^ 26 + 86 - 100 + 129) & (0x5 ^ 0x2F ^ (0xBB ^ 0xAA) ^ -" ".length())) > "   ".length()) {
                return;
            }
            while (!lIIIlllllIIllIIl((int)llllllllllllIllIllllIlllIIIIllII, (int)llllllllllllIllIllllIlllIIIIlIll)) {
                final EnumType llllllllllllIllIllllIlllIIIIlllI = llllllllllllIllIllllIlllIIIIlIlI[llllllllllllIllIllllIlllIIIIllII];
                EnumType.META_LOOKUP[llllllllllllIllIllllIlllIIIIlllI.getMetadata()] = llllllllllllIllIllllIlllIIIIlllI;
                ++llllllllllllIllIllllIlllIIIIllII;
            }
        }
        
        private static String lIIIlllllIIIlIll(final String llllllllllllIllIllllIllIlIlIllII, final String llllllllllllIllIllllIllIlIlIlIIl) {
            try {
                final SecretKeySpec llllllllllllIllIllllIllIlIlIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllllIllIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIllllIllIlIlIlllI = Cipher.getInstance("Blowfish");
                llllllllllllIllIllllIllIlIlIlllI.init(EnumType.llIIlllIlIIIll[2], llllllllllllIllIllllIllIlIlIllll);
                return new String(llllllllllllIllIllllIllIlIlIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIllllIllIlIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIllllIllIlIlIllIl) {
                llllllllllllIllIllllIllIlIlIllIl.printStackTrace();
                return null;
            }
        }
        
        public String getUnlocalizedName() {
            return this.unlocalizedName;
        }
        
        public int getMetadata() {
            return this.meta;
        }
        
        private EnumType(final String llllllllllllIllIllllIllIllllIIIl, final int llllllllllllIllIllllIllIllllIIII, final int llllllllllllIllIllllIllIlllIllll, final String llllllllllllIllIllllIllIllllIlII, final String llllllllllllIllIllllIllIllllIIll) {
            this.meta = llllllllllllIllIllllIllIlllIllll;
            this.name = llllllllllllIllIllllIllIllllIlII;
            this.unlocalizedName = llllllllllllIllIllllIllIllllIIll;
        }
        
        private static String lIIIlllllIIIlIII(final String llllllllllllIllIllllIllIlIIIIlIl, final String llllllllllllIllIllllIllIlIIIIlII) {
            try {
                final SecretKeySpec llllllllllllIllIllllIllIlIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllllIllIlIIIIlII.getBytes(StandardCharsets.UTF_8)), EnumType.llIIlllIlIIIll[8]), "DES");
                final Cipher llllllllllllIllIllllIllIlIIIlIIl = Cipher.getInstance("DES");
                llllllllllllIllIllllIllIlIIIlIIl.init(EnumType.llIIlllIlIIIll[2], llllllllllllIllIllllIllIlIIIlIlI);
                return new String(llllllllllllIllIllllIllIlIIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIllllIllIlIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIllllIllIlIIIlIII) {
                llllllllllllIllIllllIllIlIIIlIII.printStackTrace();
                return null;
            }
        }
        
        public static EnumType byMetadata(int llllllllllllIllIllllIllIlllIIlII) {
            if (!lIIIlllllIIllIlI(llllllllllllIllIllllIllIlllIIlII) || lIIIlllllIIllIIl(llllllllllllIllIllllIllIlllIIlII, EnumType.META_LOOKUP.length)) {
                llllllllllllIllIllllIllIlllIIlII = EnumType.llIIlllIlIIIll[0];
            }
            return EnumType.META_LOOKUP[llllllllllllIllIllllIllIlllIIlII];
        }
        
        private static boolean lIIIlllllIIllIll(final Object llllllllllllIllIllllIllIIlllIlll, final Object llllllllllllIllIllllIllIIlllIllI) {
            return llllllllllllIllIllllIllIIlllIlll == llllllllllllIllIllllIllIIlllIllI;
        }
        
        private static String lIIIlllllIIIlIlI(String llllllllllllIllIllllIllIlIIlIlll, final String llllllllllllIllIllllIllIlIIllIll) {
            llllllllllllIllIllllIllIlIIlIlll = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIllIllllIllIlIIlIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIllllIllIlIIllIlI = new StringBuilder();
            final char[] llllllllllllIllIllllIllIlIIllIIl = llllllllllllIllIllllIllIlIIllIll.toCharArray();
            int llllllllllllIllIllllIllIlIIllIII = EnumType.llIIlllIlIIIll[0];
            final boolean llllllllllllIllIllllIllIlIIlIIlI = (Object)((String)llllllllllllIllIllllIllIlIIlIlll).toCharArray();
            final byte llllllllllllIllIllllIllIlIIlIIIl = (byte)llllllllllllIllIllllIllIlIIlIIlI.length;
            boolean llllllllllllIllIllllIllIlIIlIIII = EnumType.llIIlllIlIIIll[0] != 0;
            while (lIIIlllllIIlllII(llllllllllllIllIllllIllIlIIlIIII ? 1 : 0, llllllllllllIllIllllIllIlIIlIIIl)) {
                final char llllllllllllIllIllllIllIlIIlllIl = llllllllllllIllIllllIllIlIIlIIlI[llllllllllllIllIllllIllIlIIlIIII];
                llllllllllllIllIllllIllIlIIllIlI.append((char)(llllllllllllIllIllllIllIlIIlllIl ^ llllllllllllIllIllllIllIlIIllIIl[llllllllllllIllIllllIllIlIIllIII % llllllllllllIllIllllIllIlIIllIIl.length]));
                "".length();
                ++llllllllllllIllIllllIllIlIIllIII;
                ++llllllllllllIllIllllIllIlIIlIIII;
                "".length();
                if ("  ".length() <= " ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIllllIllIlIIllIlI);
        }
    }
}
