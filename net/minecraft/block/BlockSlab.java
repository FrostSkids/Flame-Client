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
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.item.ItemStack;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraft.entity.Entity;
import java.util.List;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;

public abstract class BlockSlab extends Block
{
    public static final /* synthetic */ PropertyEnum<EnumBlockHalf> HALF;
    private static final /* synthetic */ int[] lIllIIllIIIIll;
    private static final /* synthetic */ String[] lIllIIlIllllll;
    
    private static boolean lllllIlIIlllIll(final Object lllllllllllllIIIIIIllIlIIllIlIll, final Object lllllllllllllIIIIIIllIlIIllIlIlI) {
        return lllllllllllllIIIIIIllIlIIllIlIll == lllllllllllllIIIIIIllIlIIllIlIlI;
    }
    
    public abstract IProperty<?> getVariantProperty();
    
    @Override
    public void setBlockBoundsForItemRender() {
        if (lllllIlIIlllIIl(this.isDouble() ? 1 : 0)) {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
        else {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
    }
    
    private static int lllllIlIIllllII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    static {
        lllllIlIIlllIII();
        lllllIlIIllIlll();
        HALF = PropertyEnum.create(BlockSlab.lIllIIlIllllll[BlockSlab.lIllIIllIIIIll[0]], EnumBlockHalf.class);
    }
    
    @Override
    public void addCollisionBoxesToList(final World lllllllllllllIIIIIIllIlIllIlIIll, final BlockPos lllllllllllllIIIIIIllIlIllIllIIl, final IBlockState lllllllllllllIIIIIIllIlIllIlIIIl, final AxisAlignedBB lllllllllllllIIIIIIllIlIllIlIIII, final List<AxisAlignedBB> lllllllllllllIIIIIIllIlIllIlIllI, final Entity lllllllllllllIIIIIIllIlIllIlIlIl) {
        this.setBlockBoundsBasedOnState(lllllllllllllIIIIIIllIlIllIlIIll, lllllllllllllIIIIIIllIlIllIllIIl);
        super.addCollisionBoxesToList(lllllllllllllIIIIIIllIlIllIlIIll, lllllllllllllIIIIIIllIlIllIllIIl, lllllllllllllIIIIIIllIlIllIlIIIl, lllllllllllllIIIIIIllIlIllIlIIII, lllllllllllllIIIIIIllIlIllIlIllI, lllllllllllllIIIIIIllIlIllIlIlIl);
    }
    
    @Override
    public boolean isFullCube() {
        return this.isDouble();
    }
    
    protected static boolean isSlab(final Block lllllllllllllIIIIIIllIlIlIIIlIII) {
        if (lllllIlIIllllIl(lllllllllllllIIIIIIllIlIlIIIlIII, Blocks.stone_slab) && lllllIlIIllllIl(lllllllllllllIIIIIIllIlIlIIIlIII, Blocks.wooden_slab) && lllllIlIIllllIl(lllllllllllllIIIIIIllIlIlIIIlIII, Blocks.stone_slab2)) {
            return BlockSlab.lIllIIllIIIIll[0] != 0;
        }
        return BlockSlab.lIllIIllIIIIll[1] != 0;
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess lllllllllllllIIIIIIllIlIlllIllII, final BlockPos lllllllllllllIIIIIIllIlIlllIlIll) {
        if (lllllIlIIlllIIl(this.isDouble() ? 1 : 0)) {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            final IBlockState lllllllllllllIIIIIIllIlIlllIlIlI = lllllllllllllIIIIIIllIlIlllIllII.getBlockState(lllllllllllllIIIIIIllIlIlllIlIll);
            if (lllllIlIIlllIll(lllllllllllllIIIIIIllIlIlllIlIlI.getBlock(), this)) {
                if (lllllIlIIlllIll(lllllllllllllIIIIIIllIlIlllIlIlI.getValue(BlockSlab.HALF), EnumBlockHalf.TOP)) {
                    this.setBlockBounds(0.0f, 0.5f, 0.0f, 1.0f, 1.0f, 1.0f);
                    "".length();
                    if (((34 + 117 - 65 + 48 ^ 121 + 90 - 135 + 122) & (12 + 111 + 94 + 26 ^ 45 + 155 - 54 + 33 ^ -" ".length())) == "   ".length()) {
                        return;
                    }
                }
                else {
                    this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
                }
            }
        }
    }
    
    @Override
    public int quantityDropped(final Random lllllllllllllIIIIIIllIlIlIlIlIlI) {
        int n;
        if (lllllIlIIlllIIl(this.isDouble() ? 1 : 0)) {
            n = BlockSlab.lIllIIllIIIIll[3];
            "".length();
            if (" ".length() == (0x4E ^ 0x4A)) {
                return (0xCE ^ 0xC1) & ~(0x34 ^ 0x3B);
            }
        }
        else {
            n = BlockSlab.lIllIIllIIIIll[1];
        }
        return n;
    }
    
    private static boolean lllllIlIIlllIIl(final int lllllllllllllIIIIIIllIlIIllIlIII) {
        return lllllllllllllIIIIIIllIlIIllIlIII != 0;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return this.isDouble();
    }
    
    public abstract String getUnlocalizedName(final int p0);
    
    @Override
    protected boolean canSilkHarvest() {
        return BlockSlab.lIllIIllIIIIll[0] != 0;
    }
    
    private static boolean lllllIlIIllllIl(final Object lllllllllllllIIIIIIllIlIIllIllll, final Object lllllllllllllIIIIIIllIlIIllIlllI) {
        return lllllllllllllIIIIIIllIlIIllIllll != lllllllllllllIIIIIIllIlIIllIlllI;
    }
    
    public abstract Object getVariant(final ItemStack p0);
    
    private static void lllllIlIIlllIII() {
        (lIllIIllIIIIll = new int[6])[0] = ((0x63 ^ 0x27) & ~(0xF7 ^ 0xB3));
        BlockSlab.lIllIIllIIIIll[1] = " ".length();
        BlockSlab.lIllIIllIIIIll[2] = 226 + 157 - 202 + 74;
        BlockSlab.lIllIIllIIIIll[3] = "  ".length();
        BlockSlab.lIllIIllIIIIll[4] = (0x5E ^ 0x18 ^ (0x1B ^ 0x5A));
        BlockSlab.lIllIIllIIIIll[5] = (0xA5 ^ 0xAD);
    }
    
    private static void lllllIlIIllIlll() {
        (lIllIIlIllllll = new String[BlockSlab.lIllIIllIIIIll[1]])[BlockSlab.lIllIIllIIIIll[0]] = lllllIlIIllIllI("xRfrZIuPrvw=", "DrCPj");
    }
    
    @Override
    public boolean shouldSideBeRendered(final IBlockAccess lllllllllllllIIIIIIllIlIlIIllIll, final BlockPos lllllllllllllIIIIIIllIlIlIIlIIIl, final EnumFacing lllllllllllllIIIIIIllIlIlIIlIIII) {
        if (lllllIlIIlllIIl(this.isDouble() ? 1 : 0)) {
            return super.shouldSideBeRendered(lllllllllllllIIIIIIllIlIlIIllIll, lllllllllllllIIIIIIllIlIlIIlIIIl, lllllllllllllIIIIIIllIlIlIIlIIII);
        }
        if (lllllIlIIllllIl(lllllllllllllIIIIIIllIlIlIIlIIII, EnumFacing.UP) && lllllIlIIllllIl(lllllllllllllIIIIIIllIlIlIIlIIII, EnumFacing.DOWN) && lllllIlIIllllll(super.shouldSideBeRendered(lllllllllllllIIIIIIllIlIlIIllIll, lllllllllllllIIIIIIllIlIlIIlIIIl, lllllllllllllIIIIIIllIlIlIIlIIII) ? 1 : 0)) {
            return BlockSlab.lIllIIllIIIIll[0] != 0;
        }
        final BlockPos lllllllllllllIIIIIIllIlIlIIllIII = lllllllllllllIIIIIIllIlIlIIlIIIl.offset(lllllllllllllIIIIIIllIlIlIIlIIII.getOpposite());
        final IBlockState lllllllllllllIIIIIIllIlIlIIlIlll = lllllllllllllIIIIIIllIlIlIIllIll.getBlockState(lllllllllllllIIIIIIllIlIlIIlIIIl);
        final IBlockState lllllllllllllIIIIIIllIlIlIIlIllI = lllllllllllllIIIIIIllIlIlIIllIll.getBlockState(lllllllllllllIIIIIIllIlIlIIllIII);
        int n;
        if (lllllIlIIlllIIl(isSlab(lllllllllllllIIIIIIllIlIlIIlIlll.getBlock()) ? 1 : 0) && lllllIlIIlllIll(lllllllllllllIIIIIIllIlIlIIlIlll.getValue(BlockSlab.HALF), EnumBlockHalf.TOP)) {
            n = BlockSlab.lIllIIllIIIIll[1];
            "".length();
            if ("   ".length() < 0) {
                return ((0x5F ^ 0x9) & ~(0x79 ^ 0x2F)) != 0x0;
            }
        }
        else {
            n = BlockSlab.lIllIIllIIIIll[0];
        }
        final boolean lllllllllllllIIIIIIllIlIlIIlIlIl = n != 0;
        int n2;
        if (lllllIlIIlllIIl(isSlab(lllllllllllllIIIIIIllIlIlIIlIllI.getBlock()) ? 1 : 0) && lllllIlIIlllIll(lllllllllllllIIIIIIllIlIlIIlIllI.getValue(BlockSlab.HALF), EnumBlockHalf.TOP)) {
            n2 = BlockSlab.lIllIIllIIIIll[1];
            "".length();
            if ((0xB4 ^ 0xC7 ^ (0xDE ^ 0xA9)) > (37 + 25 + 39 + 29 ^ 44 + 2 + 26 + 62)) {
                return ((0x22 ^ 0x2 ^ (0x13 ^ 0x64)) & (127 + 111 - 164 + 128 ^ 138 + 135 - 205 + 89 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = BlockSlab.lIllIIllIIIIll[0];
        }
        final boolean lllllllllllllIIIIIIllIlIlIIlIlII = n2 != 0;
        int n3;
        if (lllllIlIIlllIIl(lllllllllllllIIIIIIllIlIlIIlIlII ? 1 : 0)) {
            if (lllllIlIIlllIll(lllllllllllllIIIIIIllIlIlIIlIIII, EnumFacing.DOWN)) {
                n3 = BlockSlab.lIllIIllIIIIll[1];
                "".length();
                if (null != null) {
                    return ((0xC8 ^ 0x90 ^ (0xE7 ^ 0x8A)) & (0x9 ^ 0x13 ^ (0x23 ^ 0xC) ^ -" ".length())) != 0x0;
                }
            }
            else if (lllllIlIIlllIll(lllllllllllllIIIIIIllIlIlIIlIIII, EnumFacing.UP) && lllllIlIIlllIIl(super.shouldSideBeRendered(lllllllllllllIIIIIIllIlIlIIllIll, lllllllllllllIIIIIIllIlIlIIlIIIl, lllllllllllllIIIIIIllIlIlIIlIIII) ? 1 : 0)) {
                n3 = BlockSlab.lIllIIllIIIIll[1];
                "".length();
                if (null != null) {
                    return ((0x15 ^ 0x4A ^ (0xA7 ^ 0xAB)) & (0x7 ^ 0x23 ^ (0xC5 ^ 0xB2) ^ -" ".length())) != 0x0;
                }
            }
            else if (lllllIlIIlllIIl(isSlab(lllllllllllllIIIIIIllIlIlIIlIlll.getBlock()) ? 1 : 0) && lllllIlIIlllIIl(lllllllllllllIIIIIIllIlIlIIlIlIl ? 1 : 0)) {
                n3 = BlockSlab.lIllIIllIIIIll[0];
                "".length();
                if ((0x5F ^ 0x4E ^ (0x89 ^ 0x9C)) != (79 + 66 - 67 + 49 ^ (0xF6 ^ 0x8D))) {
                    return ((0x62 ^ 0x4B ^ (0xFD ^ 0x84)) & (0x75 ^ 0x1F ^ (0x78 ^ 0x42) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n3 = BlockSlab.lIllIIllIIIIll[1];
                "".length();
                if (null != null) {
                    return ((0x1D ^ 0x30) & ~(0x83 ^ 0xAE)) != 0x0;
                }
            }
        }
        else if (lllllIlIIlllIll(lllllllllllllIIIIIIllIlIlIIlIIII, EnumFacing.UP)) {
            n3 = BlockSlab.lIllIIllIIIIll[1];
            "".length();
            if (-" ".length() >= 0) {
                return ((0x4E ^ 0xF) & ~(0x83 ^ 0xC2)) != 0x0;
            }
        }
        else if (lllllIlIIlllIll(lllllllllllllIIIIIIllIlIlIIlIIII, EnumFacing.DOWN) && lllllIlIIlllIIl(super.shouldSideBeRendered(lllllllllllllIIIIIIllIlIlIIllIll, lllllllllllllIIIIIIllIlIlIIlIIIl, lllllllllllllIIIIIIllIlIlIIlIIII) ? 1 : 0)) {
            n3 = BlockSlab.lIllIIllIIIIll[1];
            "".length();
            if ("  ".length() <= -" ".length()) {
                return ((0x3D ^ 0x6D ^ (0xF0 ^ 0xB2)) & (0xFF ^ 0x90 ^ (0x1D ^ 0x60) ^ -" ".length())) != 0x0;
            }
        }
        else if (lllllIlIIlllIIl(isSlab(lllllllllllllIIIIIIllIlIlIIlIlll.getBlock()) ? 1 : 0) && lllllIlIIllllll(lllllllllllllIIIIIIllIlIlIIlIlIl ? 1 : 0)) {
            n3 = BlockSlab.lIllIIllIIIIll[0];
            "".length();
            if (null != null) {
                return ((0x11 ^ 0x2F) & ~(0x3A ^ 0x4)) != 0x0;
            }
        }
        else {
            n3 = BlockSlab.lIllIIllIIIIll[1];
        }
        return n3 != 0;
    }
    
    public abstract boolean isDouble();
    
    public BlockSlab(final Material lllllllllllllIIIIIIllIlIllllIlIl) {
        super(lllllllllllllIIIIIIllIlIllllIlIl);
        if (lllllIlIIlllIIl(this.isDouble() ? 1 : 0)) {
            this.fullBlock = (BlockSlab.lIllIIllIIIIll[1] != 0);
            "".length();
            if (" ".length() > "   ".length()) {
                throw null;
            }
        }
        else {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
        this.setLightOpacity(BlockSlab.lIllIIllIIIIll[2]);
        "".length();
    }
    
    @Override
    public int getDamageValue(final World lllllllllllllIIIIIIllIlIlIIIIIll, final BlockPos lllllllllllllIIIIIIllIlIlIIIIIlI) {
        return super.getDamageValue(lllllllllllllIIIIIIllIlIlIIIIIll, lllllllllllllIIIIIIllIlIlIIIIIlI) & BlockSlab.lIllIIllIIIIll[4];
    }
    
    private static boolean lllllIlIIlllllI(final int lllllllllllllIIIIIIllIlIIllIIlII) {
        return lllllllllllllIIIIIIllIlIIllIIlII <= 0;
    }
    
    private static boolean lllllIlIIllllll(final int lllllllllllllIIIIIIllIlIIllIIllI) {
        return lllllllllllllIIIIIIllIlIIllIIllI == 0;
    }
    
    @Override
    public IBlockState onBlockPlaced(final World lllllllllllllIIIIIIllIlIlIllllll, final BlockPos lllllllllllllIIIIIIllIlIlIlllllI, final EnumFacing lllllllllllllIIIIIIllIlIlIllllIl, final float lllllllllllllIIIIIIllIlIlIllllII, final float lllllllllllllIIIIIIllIlIlIlllIll, final float lllllllllllllIIIIIIllIlIlIllIIII, final int lllllllllllllIIIIIIllIlIlIlIllll, final EntityLivingBase lllllllllllllIIIIIIllIlIlIlIlllI) {
        final IBlockState lllllllllllllIIIIIIllIlIlIllIlll = super.onBlockPlaced(lllllllllllllIIIIIIllIlIlIllllll, lllllllllllllIIIIIIllIlIlIlllllI, lllllllllllllIIIIIIllIlIlIllllIl, lllllllllllllIIIIIIllIlIlIllllII, lllllllllllllIIIIIIllIlIlIlllIll, lllllllllllllIIIIIIllIlIlIllIIII, lllllllllllllIIIIIIllIlIlIlIllll, lllllllllllllIIIIIIllIlIlIlIlllI).withProperty(BlockSlab.HALF, EnumBlockHalf.BOTTOM);
        IBlockState withProperty;
        if (lllllIlIIlllIIl(this.isDouble() ? 1 : 0)) {
            withProperty = lllllllllllllIIIIIIllIlIlIllIlll;
            "".length();
            if (" ".length() >= "  ".length()) {
                return null;
            }
        }
        else if (lllllIlIIllllIl(lllllllllllllIIIIIIllIlIlIllllIl, EnumFacing.DOWN) && (!lllllIlIIllllIl(lllllllllllllIIIIIIllIlIlIllllIl, EnumFacing.UP) || lllllIlIIlllllI(lllllIlIIllllII(lllllllllllllIIIIIIllIlIlIlllIll, 0.5)))) {
            withProperty = lllllllllllllIIIIIIllIlIlIllIlll;
            "".length();
            if (-" ".length() == ((0xAC ^ 0x9D ^ (0x59 ^ 0x51)) & (116 + 64 - 165 + 165 ^ 79 + 134 - 180 + 108 ^ -" ".length()))) {
                return null;
            }
        }
        else {
            withProperty = lllllllllllllIIIIIIllIlIlIllIlll.withProperty(BlockSlab.HALF, EnumBlockHalf.TOP);
        }
        return withProperty;
    }
    
    private static String lllllIlIIllIllI(final String lllllllllllllIIIIIIllIlIIlllIlll, final String lllllllllllllIIIIIIllIlIIlllIlII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIllIlIIllllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIllIlIIlllIlII.getBytes(StandardCharsets.UTF_8)), BlockSlab.lIllIIllIIIIll[5]), "DES");
            final Cipher lllllllllllllIIIIIIllIlIIllllIIl = Cipher.getInstance("DES");
            lllllllllllllIIIIIIllIlIIllllIIl.init(BlockSlab.lIllIIllIIIIll[3], lllllllllllllIIIIIIllIlIIllllIlI);
            return new String(lllllllllllllIIIIIIllIlIIllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIllIlIIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIllIlIIllllIII) {
            lllllllllllllIIIIIIllIlIIllllIII.printStackTrace();
            return null;
        }
    }
    
    public enum EnumBlockHalf implements IStringSerializable
    {
        BOTTOM(EnumBlockHalf.lIIlIIllIIlllI[EnumBlockHalf.lIIlIlIIlIIlII[2]], EnumBlockHalf.lIIlIlIIlIIlII[1], EnumBlockHalf.lIIlIIllIIlllI[EnumBlockHalf.lIIlIlIIlIIlII[3]]);
        
        private final /* synthetic */ String name;
        
        TOP(EnumBlockHalf.lIIlIIllIIlllI[EnumBlockHalf.lIIlIlIIlIIlII[0]], EnumBlockHalf.lIIlIlIIlIIlII[0], EnumBlockHalf.lIIlIIllIIlllI[EnumBlockHalf.lIIlIlIIlIIlII[1]]);
        
        private static final /* synthetic */ String[] lIIlIIllIIlllI;
        private static final /* synthetic */ int[] lIIlIlIIlIIlII;
        
        private static String llIIllIllllllIl(final String lllllllllllllIIllIlIIlIlIIllIIll, final String lllllllllllllIIllIlIIlIlIIllIIlI) {
            try {
                final SecretKeySpec lllllllllllllIIllIlIIlIlIIllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlIIlIlIIllIIlI.getBytes(StandardCharsets.UTF_8)), EnumBlockHalf.lIIlIlIIlIIlII[5]), "DES");
                final Cipher lllllllllllllIIllIlIIlIlIIllIlIl = Cipher.getInstance("DES");
                lllllllllllllIIllIlIIlIlIIllIlIl.init(EnumBlockHalf.lIIlIlIIlIIlII[2], lllllllllllllIIllIlIIlIlIIllIllI);
                return new String(lllllllllllllIIllIlIIlIlIIllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlIIlIlIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIllIlIIlIlIIllIlII) {
                lllllllllllllIIllIlIIlIlIIllIlII.printStackTrace();
                return null;
            }
        }
        
        static {
            llIIllllllIIIIl();
            llIIllIllllllll();
            final EnumBlockHalf[] enum$VALUES = new EnumBlockHalf[EnumBlockHalf.lIIlIlIIlIIlII[2]];
            enum$VALUES[EnumBlockHalf.lIIlIlIIlIIlII[0]] = EnumBlockHalf.TOP;
            enum$VALUES[EnumBlockHalf.lIIlIlIIlIIlII[1]] = EnumBlockHalf.BOTTOM;
            ENUM$VALUES = enum$VALUES;
        }
        
        @Override
        public String toString() {
            return this.name;
        }
        
        @Override
        public String getName() {
            return this.name;
        }
        
        private static String llIIllIllllllII(final String lllllllllllllIIllIlIIlIlIIlIIlII, final String lllllllllllllIIllIlIIlIlIIlIIlIl) {
            try {
                final SecretKeySpec lllllllllllllIIllIlIIlIlIIlIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlIIlIlIIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIllIlIIlIlIIlIlIII = Cipher.getInstance("Blowfish");
                lllllllllllllIIllIlIIlIlIIlIlIII.init(EnumBlockHalf.lIIlIlIIlIIlII[2], lllllllllllllIIllIlIIlIlIIlIlIIl);
                return new String(lllllllllllllIIllIlIIlIlIIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlIIlIlIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIllIlIIlIlIIlIIlll) {
                lllllllllllllIIllIlIIlIlIIlIIlll.printStackTrace();
                return null;
            }
        }
        
        private EnumBlockHalf(final String lllllllllllllIIllIlIIlIlIlIIlIll, final int lllllllllllllIIllIlIIlIlIlIIlIlI, final String lllllllllllllIIllIlIIlIlIlIIlIIl) {
            this.name = lllllllllllllIIllIlIIlIlIlIIlIIl;
        }
        
        private static void llIIllIllllllll() {
            (lIIlIIllIIlllI = new String[EnumBlockHalf.lIIlIlIIlIIlII[4]])[EnumBlockHalf.lIIlIlIIlIIlII[0]] = llIIllIllllllII("7DYz7U1hgRc=", "PxfKb");
            EnumBlockHalf.lIIlIIllIIlllI[EnumBlockHalf.lIIlIlIIlIIlII[1]] = llIIllIllllllIl("gXDFyhMU4zw=", "gMCBH");
            EnumBlockHalf.lIIlIIllIIlllI[EnumBlockHalf.lIIlIlIIlIIlII[2]] = llIIllIllllllII("uDMizKyi1GM=", "kyebG");
            EnumBlockHalf.lIIlIIllIIlllI[EnumBlockHalf.lIIlIlIIlIIlII[3]] = llIIllIllllllIl("Jqv3z37F4C4=", "Jsqar");
        }
        
        private static void llIIllllllIIIIl() {
            (lIIlIlIIlIIlII = new int[6])[0] = ((0x4C ^ 0x12 ^ (0xA1 ^ 0xB0)) & (0x2D ^ 0x28 ^ (0xC7 ^ 0x8D) ^ -" ".length()));
            EnumBlockHalf.lIIlIlIIlIIlII[1] = " ".length();
            EnumBlockHalf.lIIlIlIIlIIlII[2] = "  ".length();
            EnumBlockHalf.lIIlIlIIlIIlII[3] = "   ".length();
            EnumBlockHalf.lIIlIlIIlIIlII[4] = (118 + 177 - 137 + 40 ^ 58 + 65 - 109 + 180);
            EnumBlockHalf.lIIlIlIIlIIlII[5] = (3 + 163 - 112 + 137 ^ 115 + 61 - 91 + 98);
        }
    }
}
