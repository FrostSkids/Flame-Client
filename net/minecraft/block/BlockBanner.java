// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.block.state.BlockState;
import net.minecraft.block.properties.IProperty;
import java.util.Random;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.block.state.IBlockState;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.block.material.Material;
import net.minecraft.util.StatCollector;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.tileentity.TileEntityBanner;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import com.google.common.base.Predicate;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.properties.PropertyDirection;

public class BlockBanner extends BlockContainer
{
    public static final /* synthetic */ PropertyDirection FACING;
    private static final /* synthetic */ int[] lllIIlIIIllIlI;
    private static final /* synthetic */ String[] lllIIIllllllII;
    public static final /* synthetic */ PropertyInteger ROTATION;
    
    static {
        lIIllllIlllllIII();
        lIIllllIlllIIIll();
        FACING = PropertyDirection.create(BlockBanner.lllIIIllllllII[BlockBanner.lllIIlIIIllIlI[0]], (Predicate<EnumFacing>)EnumFacing.Plane.HORIZONTAL);
        ROTATION = PropertyInteger.create(BlockBanner.lllIIIllllllII[BlockBanner.lllIIlIIIllIlI[1]], BlockBanner.lllIIlIIIllIlI[0], BlockBanner.lllIIlIIIllIlI[2]);
    }
    
    @Override
    public AxisAlignedBB getSelectedBoundingBox(final World llllllllllllIlIlllllIIIllIIllllI, final BlockPos llllllllllllIlIlllllIIIllIlIIIII) {
        this.setBlockBoundsBasedOnState(llllllllllllIlIlllllIIIllIIllllI, llllllllllllIlIlllllIIIllIlIIIII);
        return super.getSelectedBoundingBox(llllllllllllIlIlllllIIIllIIllllI, llllllllllllIlIlllllIIIllIlIIIII);
    }
    
    private static boolean lIIllllIlllllIll(final int llllllllllllIlIlllllIIIlIIIlIlII) {
        return llllllllllllIlIlllllIIIlIIIlIlII == 0;
    }
    
    @Override
    public TileEntity createNewTileEntity(final World llllllllllllIlIlllllIIIllIIlIlIl, final int llllllllllllIlIlllllIIIllIIlIlII) {
        return new TileEntityBanner();
    }
    
    @Override
    public boolean func_181623_g() {
        return BlockBanner.lllIIlIIIllIlI[1] != 0;
    }
    
    private static void lIIllllIlllllIII() {
        (lllIIlIIIllIlI = new int[11])[0] = ((0x9D ^ 0xBB ^ (0x11 ^ 0x6A)) & (0x4F ^ 0x3 ^ (0x99 ^ 0x88) ^ -" ".length()));
        BlockBanner.lllIIlIIIllIlI[1] = " ".length();
        BlockBanner.lllIIlIIIllIlI[2] = (0x7F ^ 0x70);
        BlockBanner.lllIIlIIIllIlI[3] = "  ".length();
        BlockBanner.lllIIlIIIllIlI[4] = "   ".length();
        BlockBanner.lllIIlIIIllIlI[5] = (0x75 ^ 0x71);
        BlockBanner.lllIIlIIIllIlI[6] = (124 + 34 - 48 + 35 ^ 73 + 109 - 172 + 138);
        BlockBanner.lllIIlIIIllIlI[7] = (0x61 ^ 0x4E ^ (0x8D ^ 0xA4));
        BlockBanner.lllIIlIIIllIlI[8] = (((0xAF ^ 0x82) & ~(0x7E ^ 0x53)) ^ (0x92 ^ 0x95));
        BlockBanner.lllIIlIIIllIlI[9] = (0x11 ^ 0x61 ^ (0xF0 ^ 0x88));
        BlockBanner.lllIIlIIIllIlI[10] = (0xA5 ^ 0xAC);
    }
    
    private static boolean lIIllllIlllllIlI(final int llllllllllllIlIlllllIIIlIIIlIllI) {
        return llllllllllllIlIlllllIIIlIIIlIllI != 0;
    }
    
    private static String lIIllllIIllllIIl(String llllllllllllIlIlllllIIIlIIlllllI, final String llllllllllllIlIlllllIIIlIIllllIl) {
        llllllllllllIlIlllllIIIlIIlllllI = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIlIlllllIIIlIIlllllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllllIIIlIlIIIIIl = new StringBuilder();
        final char[] llllllllllllIlIlllllIIIlIlIIIIII = llllllllllllIlIlllllIIIlIIllllIl.toCharArray();
        int llllllllllllIlIlllllIIIlIIllllll = BlockBanner.lllIIlIIIllIlI[0];
        final String llllllllllllIlIlllllIIIlIIlllIIl = (Object)((String)llllllllllllIlIlllllIIIlIIlllllI).toCharArray();
        final char llllllllllllIlIlllllIIIlIIlllIII = (char)llllllllllllIlIlllllIIIlIIlllIIl.length;
        char llllllllllllIlIlllllIIIlIIllIlll = (char)BlockBanner.lllIIlIIIllIlI[0];
        while (lIIllllIllllllII(llllllllllllIlIlllllIIIlIIllIlll, llllllllllllIlIlllllIIIlIIlllIII)) {
            final char llllllllllllIlIlllllIIIlIlIIIlII = llllllllllllIlIlllllIIIlIIlllIIl[llllllllllllIlIlllllIIIlIIllIlll];
            llllllllllllIlIlllllIIIlIlIIIIIl.append((char)(llllllllllllIlIlllllIIIlIlIIIlII ^ llllllllllllIlIlllllIIIlIlIIIIII[llllllllllllIlIlllllIIIlIIllllll % llllllllllllIlIlllllIIIlIlIIIIII.length]));
            "".length();
            ++llllllllllllIlIlllllIIIlIIllllll;
            ++llllllllllllIlIlllllIIIlIIllIlll;
            "".length();
            if (((0x15 ^ 0x1A) & ~(0x88 ^ 0x87)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllllIIIlIlIIIIIl);
    }
    
    @Override
    public String getLocalizedName() {
        return StatCollector.translateToLocal(BlockBanner.lllIIIllllllII[BlockBanner.lllIIlIIIllIlI[3]]);
    }
    
    protected BlockBanner() {
        super(Material.wood);
        final float llllllllllllIlIlllllIIIllIlIllll = 0.25f;
        final float llllllllllllIlIlllllIIIllIlIlllI = 1.0f;
        this.setBlockBounds(0.5f - llllllllllllIlIlllllIIIllIlIllll, 0.0f, 0.5f - llllllllllllIlIlllllIIIllIlIllll, 0.5f + llllllllllllIlIlllllIIIllIlIllll, llllllllllllIlIlllllIIIllIlIlllI, 0.5f + llllllllllllIlIlllllIIIllIlIllll);
    }
    
    @Override
    public boolean isFullCube() {
        return BlockBanner.lllIIlIIIllIlI[0] != 0;
    }
    
    @Override
    public boolean canPlaceBlockAt(final World llllllllllllIlIlllllIIIlIllIllIl, final BlockPos llllllllllllIlIlllllIIIlIllIlIIl) {
        if (lIIllllIlllllIll(this.func_181087_e(llllllllllllIlIlllllIIIlIllIllIl, llllllllllllIlIlllllIIIlIllIlIIl) ? 1 : 0) && lIIllllIlllllIlI(super.canPlaceBlockAt(llllllllllllIlIlllllIIIlIllIllIl, llllllllllllIlIlllllIIIlIllIlIIl) ? 1 : 0)) {
            return BlockBanner.lllIIlIIIllIlI[1] != 0;
        }
        return BlockBanner.lllIIlIIIllIlI[0] != 0;
    }
    
    @Override
    public boolean isPassable(final IBlockAccess llllllllllllIlIlllllIIIllIIllIlI, final BlockPos llllllllllllIlIlllllIIIllIIllIIl) {
        return BlockBanner.lllIIlIIIllIlI[1] != 0;
    }
    
    private static String lIIllllIIllllIII(final String llllllllllllIlIlllllIIIlIIlIlllI, final String llllllllllllIlIlllllIIIlIIlIllIl) {
        try {
            final SecretKeySpec llllllllllllIlIlllllIIIlIIllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllllIIIlIIlIllIl.getBytes(StandardCharsets.UTF_8)), BlockBanner.lllIIlIIIllIlI[9]), "DES");
            final Cipher llllllllllllIlIlllllIIIlIIllIIII = Cipher.getInstance("DES");
            llllllllllllIlIlllllIIIlIIllIIII.init(BlockBanner.lllIIlIIIllIlI[3], llllllllllllIlIlllllIIIlIIllIIIl);
            return new String(llllllllllllIlIlllllIIIlIIllIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllllIIIlIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllllIIIlIIlIllll) {
            llllllllllllIlIlllllIIIlIIlIllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllllIllllllII(final int llllllllllllIlIlllllIIIlIIIllIIl, final int llllllllllllIlIlllllIIIlIIIllIII) {
        return llllllllllllIlIlllllIIIlIIIllIIl < llllllllllllIlIlllllIIIlIIIllIII;
    }
    
    @Override
    public void dropBlockAsItemWithChance(final World llllllllllllIlIlllllIIIlIllllIIl, final BlockPos llllllllllllIlIlllllIIIlIllllIII, final IBlockState llllllllllllIlIlllllIIIllIIIIIII, final float llllllllllllIlIlllllIIIlIlllllll, final int llllllllllllIlIlllllIIIlIlllIlIl) {
        final TileEntity llllllllllllIlIlllllIIIlIlllllIl = llllllllllllIlIlllllIIIlIllllIIl.getTileEntity(llllllllllllIlIlllllIIIlIllllIII);
        if (lIIllllIlllllIlI((llllllllllllIlIlllllIIIlIlllllIl instanceof TileEntityBanner) ? 1 : 0)) {
            final ItemStack llllllllllllIlIlllllIIIlIlllllII = new ItemStack(Items.banner, BlockBanner.lllIIlIIIllIlI[1], ((TileEntityBanner)llllllllllllIlIlllllIIIlIlllllIl).getBaseColor());
            final NBTTagCompound llllllllllllIlIlllllIIIlIllllIll = new NBTTagCompound();
            llllllllllllIlIlllllIIIlIlllllIl.writeToNBT(llllllllllllIlIlllllIIIlIllllIll);
            llllllllllllIlIlllllIIIlIllllIll.removeTag(BlockBanner.lllIIIllllllII[BlockBanner.lllIIlIIIllIlI[4]]);
            llllllllllllIlIlllllIIIlIllllIll.removeTag(BlockBanner.lllIIIllllllII[BlockBanner.lllIIlIIIllIlI[5]]);
            llllllllllllIlIlllllIIIlIllllIll.removeTag(BlockBanner.lllIIIllllllII[BlockBanner.lllIIlIIIllIlI[6]]);
            llllllllllllIlIlllllIIIlIllllIll.removeTag(BlockBanner.lllIIIllllllII[BlockBanner.lllIIlIIIllIlI[7]]);
            llllllllllllIlIlllllIIIlIlllllII.setTagInfo(BlockBanner.lllIIIllllllII[BlockBanner.lllIIlIIIllIlI[8]], llllllllllllIlIlllllIIIlIllllIll);
            Block.spawnAsEntity(llllllllllllIlIlllllIIIlIllllIIl, llllllllllllIlIlllllIIIlIllllIII, llllllllllllIlIlllllIIIlIlllllII);
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
        else {
            super.dropBlockAsItemWithChance(llllllllllllIlIlllllIIIlIllllIIl, llllllllllllIlIlllllIIIlIllllIII, llllllllllllIlIlllllIIIllIIIIIII, llllllllllllIlIlllllIIIlIlllllll, llllllllllllIlIlllllIIIlIlllIlIl);
        }
    }
    
    @Override
    public void harvestBlock(final World llllllllllllIlIlllllIIIlIlIlIlIl, final EntityPlayer llllllllllllIlIlllllIIIlIlIlIlII, final BlockPos llllllllllllIlIlllllIIIlIlIlllII, final IBlockState llllllllllllIlIlllllIIIlIlIlIIlI, final TileEntity llllllllllllIlIlllllIIIlIlIlIIIl) {
        if (lIIllllIlllllIlI((llllllllllllIlIlllllIIIlIlIlIIIl instanceof TileEntityBanner) ? 1 : 0)) {
            final TileEntityBanner llllllllllllIlIlllllIIIlIlIllIIl = (TileEntityBanner)llllllllllllIlIlllllIIIlIlIlIIIl;
            final ItemStack llllllllllllIlIlllllIIIlIlIllIII = new ItemStack(Items.banner, BlockBanner.lllIIlIIIllIlI[1], ((TileEntityBanner)llllllllllllIlIlllllIIIlIlIlIIIl).getBaseColor());
            final NBTTagCompound llllllllllllIlIlllllIIIlIlIlIlll = new NBTTagCompound();
            TileEntityBanner.func_181020_a(llllllllllllIlIlllllIIIlIlIlIlll, llllllllllllIlIlllllIIIlIlIllIIl.getBaseColor(), llllllllllllIlIlllllIIIlIlIllIIl.func_181021_d());
            llllllllllllIlIlllllIIIlIlIllIII.setTagInfo(BlockBanner.lllIIIllllllII[BlockBanner.lllIIlIIIllIlI[9]], llllllllllllIlIlllllIIIlIlIlIlll);
            Block.spawnAsEntity(llllllllllllIlIlllllIIIlIlIlIlIl, llllllllllllIlIlllllIIIlIlIlllII, llllllllllllIlIlllllIIIlIlIllIII);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            super.harvestBlock(llllllllllllIlIlllllIIIlIlIlIlIl, llllllllllllIlIlllllIIIlIlIlIlII, llllllllllllIlIlllllIIIlIlIlllII, llllllllllllIlIlllllIIIlIlIlIIlI, null);
        }
    }
    
    @Override
    public Item getItem(final World llllllllllllIlIlllllIIIllIIIlllI, final BlockPos llllllllllllIlIlllllIIIllIIIllIl) {
        return Items.banner;
    }
    
    private static String lIIllllIIllllIlI(final String llllllllllllIlIlllllIIIlIIIlllll, final String llllllllllllIlIlllllIIIlIIIllllI) {
        try {
            final SecretKeySpec llllllllllllIlIlllllIIIlIIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllllIIIlIIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllllIIIlIIlIIIll = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllllIIIlIIlIIIll.init(BlockBanner.lllIIlIIIllIlI[3], llllllllllllIlIlllllIIIlIIlIIlII);
            return new String(llllllllllllIlIlllllIIIlIIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllllIIIlIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllllIIIlIIlIIIlI) {
            llllllllllllIlIlllllIIIlIIlIIIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World llllllllllllIlIlllllIIIllIlIlIII, final BlockPos llllllllllllIlIlllllIIIllIlIIlll, final IBlockState llllllllllllIlIlllllIIIllIlIIllI) {
        return null;
    }
    
    private static void lIIllllIlllIIIll() {
        (lllIIIllllllII = new String[BlockBanner.lllIIlIIIllIlI[10]])[BlockBanner.lllIIlIIIllIlI[0]] = lIIllllIIllllIII("0BVwDWMe228=", "rMUhg");
        BlockBanner.lllIIIllllllII[BlockBanner.lllIIlIIIllIlI[1]] = lIIllllIIllllIIl("NSEBLi4uIRs=", "GNuOZ");
        BlockBanner.lllIIIllllllII[BlockBanner.lllIIlIIIllIlI[3]] = lIIllllIIllllIII("OimBbDNusxR5ida7I8jCkwu7NxS2QUPO", "aJUyj");
        BlockBanner.lllIIIllllllII[BlockBanner.lllIIlIIIllIlI[4]] = lIIllllIIllllIlI("PUHrtIDkIfY=", "LKgmH");
        BlockBanner.lllIIIllllllII[BlockBanner.lllIIlIIIllIlI[5]] = lIIllllIIllllIIl("PA==", "EbpmF");
        BlockBanner.lllIIIllllllII[BlockBanner.lllIIlIIIllIlI[6]] = lIIllllIIllllIlI("1BqLEzOKxgE=", "VLsFC");
        BlockBanner.lllIIIllllllII[BlockBanner.lllIIlIIIllIlI[7]] = lIIllllIIllllIII("8azQbZieg20=", "ZSMOu");
        BlockBanner.lllIIIllllllII[BlockBanner.lllIIlIIIllIlI[8]] = lIIllllIIllllIlI("5CA6JYpa2GHUuYQjTGwweA==", "sLSKf");
        BlockBanner.lllIIIllllllII[BlockBanner.lllIIlIIIllIlI[9]] = lIIllllIIllllIlI("E4e/+0xEBjoD+gKvQtBLaA==", "OTLIx");
    }
    
    @Override
    public Item getItemDropped(final IBlockState llllllllllllIlIlllllIIIllIIlIIlI, final Random llllllllllllIlIlllllIIIllIIlIIIl, final int llllllllllllIlIlllllIIIllIIlIIII) {
        return Items.banner;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockBanner.lllIIlIIIllIlI[0] != 0;
    }
    
    public static class BlockBannerHanging extends BlockBanner
    {
        private static final /* synthetic */ int[] lIlIIIIIlIIIll;
        
        private static boolean lllIIIIIIlllIlI(final Object lllllllllllllIIlIIIlIIIIllIIIlII, final Object lllllllllllllIIlIIIlIIIIllIIIIll) {
            return lllllllllllllIIlIIIlIIIIllIIIlII == lllllllllllllIIlIIIlIIIIllIIIIll;
        }
        
        static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
            final int[] $switch_TABLE$net$minecraft$util$EnumFacing = BlockBannerHanging.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
            if (lllIIIIIIlllIll($switch_TABLE$net$minecraft$util$EnumFacing)) {
                return $switch_TABLE$net$minecraft$util$EnumFacing;
            }
            "".length();
            final long lllllllllllllIIlIIIlIIIIllIIIlll = (Object)new int[EnumFacing.values().length];
            try {
                lllllllllllllIIlIIIlIIIIllIIIlll[EnumFacing.DOWN.ordinal()] = BlockBannerHanging.lIlIIIIIlIIIll[1];
                "".length();
                if (-" ".length() >= (0xE3 ^ 0xAB ^ (0x5D ^ 0x11))) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError) {
                "".length();
            }
            try {
                lllllllllllllIIlIIIlIIIIllIIIlll[EnumFacing.EAST.ordinal()] = BlockBannerHanging.lIlIIIIIlIIIll[2];
                "".length();
                if (" ".length() == -" ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                "".length();
            }
            try {
                lllllllllllllIIlIIIlIIIIllIIIlll[EnumFacing.NORTH.ordinal()] = BlockBannerHanging.lIlIIIIIlIIIll[3];
                "".length();
                if (-" ".length() >= 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError3) {
                "".length();
            }
            try {
                lllllllllllllIIlIIIlIIIIllIIIlll[EnumFacing.SOUTH.ordinal()] = BlockBannerHanging.lIlIIIIIlIIIll[4];
                "".length();
                if ("   ".length() > "   ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError4) {
                "".length();
            }
            try {
                lllllllllllllIIlIIIlIIIIllIIIlll[EnumFacing.UP.ordinal()] = BlockBannerHanging.lIlIIIIIlIIIll[5];
                "".length();
                if (("   ".length() & ("   ".length() ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError5) {
                "".length();
            }
            try {
                lllllllllllllIIlIIIlIIIIllIIIlll[EnumFacing.WEST.ordinal()] = BlockBannerHanging.lIlIIIIIlIIIll[6];
                "".length();
                if ("   ".length() == 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError6) {
                "".length();
            }
            return BlockBannerHanging.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)lllllllllllllIIlIIIlIIIIllIIIlll;
        }
        
        @Override
        public int getMetaFromState(final IBlockState lllllllllllllIIlIIIlIIIIllIIllIl) {
            return lllllllllllllIIlIIIlIIIIllIIllIl.getValue((IProperty<EnumFacing>)BlockBannerHanging.FACING).getIndex();
        }
        
        public BlockBannerHanging() {
            this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockBannerHanging.FACING, EnumFacing.NORTH));
        }
        
        static {
            lllIIIIIIlllIII();
        }
        
        @Override
        public void onNeighborBlockChange(final World lllllllllllllIIlIIIlIIIIllIlllIl, final BlockPos lllllllllllllIIlIIIlIIIIlllIIIlI, final IBlockState lllllllllllllIIlIIIlIIIIlllIIIIl, final Block lllllllllllllIIlIIIlIIIIlllIIIII) {
            final EnumFacing lllllllllllllIIlIIIlIIIIllIlllll = lllllllllllllIIlIIIlIIIIlllIIIIl.getValue((IProperty<EnumFacing>)BlockBannerHanging.FACING);
            if (lllIIIIIIlllIIl(lllllllllllllIIlIIIlIIIIllIlllIl.getBlockState(lllllllllllllIIlIIIlIIIIlllIIIlI.offset(lllllllllllllIIlIIIlIIIIllIlllll.getOpposite())).getBlock().getMaterial().isSolid() ? 1 : 0)) {
                this.dropBlockAsItem(lllllllllllllIIlIIIlIIIIllIlllIl, lllllllllllllIIlIIIlIIIIlllIIIlI, lllllllllllllIIlIIIlIIIIlllIIIIl, BlockBannerHanging.lIlIIIIIlIIIll[0]);
                lllllllllllllIIlIIIlIIIIllIlllIl.setBlockToAir(lllllllllllllIIlIIIlIIIIlllIIIlI);
                "".length();
            }
            super.onNeighborBlockChange(lllllllllllllIIlIIIlIIIIllIlllIl, lllllllllllllIIlIIIlIIIIlllIIIlI, lllllllllllllIIlIIIlIIIIlllIIIIl, lllllllllllllIIlIIIlIIIIlllIIIII);
        }
        
        private static boolean lllIIIIIIlllIll(final Object lllllllllllllIIlIIIlIIIIllIIIIIl) {
            return lllllllllllllIIlIIIlIIIIllIIIIIl != null;
        }
        
        @Override
        public IBlockState getStateFromMeta(final int lllllllllllllIIlIIIlIIIIllIlIIIl) {
            EnumFacing lllllllllllllIIlIIIlIIIIllIlIIll = EnumFacing.getFront(lllllllllllllIIlIIIlIIIIllIlIIIl);
            if (lllIIIIIIlllIlI(lllllllllllllIIlIIIlIIIIllIlIIll.getAxis(), EnumFacing.Axis.Y)) {
                lllllllllllllIIlIIIlIIIIllIlIIll = EnumFacing.NORTH;
            }
            return this.getDefaultState().withProperty((IProperty<Comparable>)BlockBannerHanging.FACING, lllllllllllllIIlIIIlIIIIllIlIIll);
        }
        
        private static void lllIIIIIIlllIII() {
            (lIlIIIIIlIIIll = new int[7])[0] = ((0x87 ^ 0xA8) & ~(0x39 ^ 0x16));
            BlockBannerHanging.lIlIIIIIlIIIll[1] = " ".length();
            BlockBannerHanging.lIlIIIIIlIIIll[2] = (0x30 ^ 0x1E ^ (0x81 ^ 0xA9));
            BlockBannerHanging.lIlIIIIIlIIIll[3] = "   ".length();
            BlockBannerHanging.lIlIIIIIlIIIll[4] = (0xDD ^ 0x97 ^ (0xE0 ^ 0xAE));
            BlockBannerHanging.lIlIIIIIlIIIll[5] = "  ".length();
            BlockBannerHanging.lIlIIIIIlIIIll[6] = (0x2C ^ 0x4A ^ (0x3C ^ 0x5F));
        }
        
        private static boolean lllIIIIIIlllIIl(final int lllllllllllllIIlIIIlIIIIlIllllll) {
            return lllllllllllllIIlIIIlIIIIlIllllll == 0;
        }
        
        @Override
        protected BlockState createBlockState() {
            final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockBannerHanging.lIlIIIIIlIIIll[1]];
            llllllllllllIllllIIIlIlIIlIIIlll[BlockBannerHanging.lIlIIIIIlIIIll[0]] = BlockBannerHanging.FACING;
            return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
        }
        
        @Override
        public void setBlockBoundsBasedOnState(final IBlockAccess lllllllllllllIIlIIIlIIIIllllIIlI, final BlockPos lllllllllllllIIlIIIlIIIIlllllIlI) {
            final EnumFacing lllllllllllllIIlIIIlIIIIlllllIIl = lllllllllllllIIlIIIlIIIIllllIIlI.getBlockState(lllllllllllllIIlIIIlIIIIlllllIlI).getValue((IProperty<EnumFacing>)BlockBannerHanging.FACING);
            final float lllllllllllllIIlIIIlIIIIlllllIII = 0.0f;
            final float lllllllllllllIIlIIIlIIIIllllIlll = 0.78125f;
            final float lllllllllllllIIlIIIlIIIIllllIllI = 0.0f;
            final float lllllllllllllIIlIIIlIIIIllllIlIl = 1.0f;
            final float lllllllllllllIIlIIIlIIIIllllIlII = 0.125f;
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
            switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[lllllllllllllIIlIIIlIIIIlllllIIl.ordinal()]) {
                default: {
                    this.setBlockBounds(lllllllllllllIIlIIIlIIIIllllIllI, lllllllllllllIIlIIIlIIIIlllllIII, 1.0f - lllllllllllllIIlIIIlIIIIllllIlII, lllllllllllllIIlIIIlIIIIllllIlIl, lllllllllllllIIlIIIlIIIIllllIlll, 1.0f);
                    "".length();
                    if (((0xF9 ^ 0x98 ^ (0xF6 ^ 0x83)) & (0xB2 ^ 0x99 ^ (0xB9 ^ 0x86) ^ -" ".length())) >= (56 + 103 - 151 + 141 ^ 99 + 36 + 6 + 4)) {
                        return;
                    }
                    break;
                }
                case 4: {
                    this.setBlockBounds(lllllllllllllIIlIIIlIIIIllllIllI, lllllllllllllIIlIIIlIIIIlllllIII, 0.0f, lllllllllllllIIlIIIlIIIIllllIlIl, lllllllllllllIIlIIIlIIIIllllIlll, lllllllllllllIIlIIIlIIIIllllIlII);
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
                case 5: {
                    this.setBlockBounds(1.0f - lllllllllllllIIlIIIlIIIIllllIlII, lllllllllllllIIlIIIlIIIIlllllIII, lllllllllllllIIlIIIlIIIIllllIllI, 1.0f, lllllllllllllIIlIIIlIIIIllllIlll, lllllllllllllIIlIIIlIIIIllllIlIl);
                    "".length();
                    if ("   ".length() <= 0) {
                        return;
                    }
                    break;
                }
                case 6: {
                    this.setBlockBounds(0.0f, lllllllllllllIIlIIIlIIIIlllllIII, lllllllllllllIIlIIIlIIIIllllIllI, lllllllllllllIIlIIIlIIIIllllIlII, lllllllllllllIIlIIIlIIIIllllIlll, lllllllllllllIIlIIIlIIIIllllIlIl);
                    break;
                }
            }
        }
    }
    
    public static class BlockBannerStanding extends BlockBanner
    {
        private static final /* synthetic */ int[] llIIlIIIllIllI;
        
        @Override
        protected BlockState createBlockState() {
            final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockBannerStanding.llIIlIIIllIllI[1]];
            llllllllllllIllllIIIlIlIIlIIIlll[BlockBannerStanding.llIIlIIIllIllI[0]] = BlockBannerStanding.ROTATION;
            return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
        }
        
        private static void lIIIllIIIIIIllll() {
            (llIIlIIIllIllI = new int[2])[0] = ((0x1B ^ 0x4C) & ~(0xF0 ^ 0xA7));
            BlockBannerStanding.llIIlIIIllIllI[1] = " ".length();
        }
        
        @Override
        public IBlockState getStateFromMeta(final int llllllllllllIlllIIlIlllIIlIlIlIl) {
            return this.getDefaultState().withProperty((IProperty<Comparable>)BlockBannerStanding.ROTATION, llllllllllllIlllIIlIlllIIlIlIlIl);
        }
        
        public BlockBannerStanding() {
            this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockBannerStanding.ROTATION, BlockBannerStanding.llIIlIIIllIllI[0]));
        }
        
        @Override
        public void onNeighborBlockChange(final World llllllllllllIlllIIlIlllIIlIlllII, final BlockPos llllllllllllIlllIIlIlllIIlIllIll, final IBlockState llllllllllllIlllIIlIlllIIlIllIlI, final Block llllllllllllIlllIIlIlllIIlIllllI) {
            if (lIIIllIIIIIlIIII(llllllllllllIlllIIlIlllIIlIlllII.getBlockState(llllllllllllIlllIIlIlllIIlIllIll.down()).getBlock().getMaterial().isSolid() ? 1 : 0)) {
                this.dropBlockAsItem(llllllllllllIlllIIlIlllIIlIlllII, llllllllllllIlllIIlIlllIIlIllIll, llllllllllllIlllIIlIlllIIlIllIlI, BlockBannerStanding.llIIlIIIllIllI[0]);
                llllllllllllIlllIIlIlllIIlIlllII.setBlockToAir(llllllllllllIlllIIlIlllIIlIllIll);
                "".length();
            }
            super.onNeighborBlockChange(llllllllllllIlllIIlIlllIIlIlllII, llllllllllllIlllIIlIlllIIlIllIll, llllllllllllIlllIIlIlllIIlIllIlI, llllllllllllIlllIIlIlllIIlIllllI);
        }
        
        static {
            lIIIllIIIIIIllll();
        }
        
        @Override
        public int getMetaFromState(final IBlockState llllllllllllIlllIIlIlllIIlIIllll) {
            return llllllllllllIlllIIlIlllIIlIIllll.getValue((IProperty<Integer>)BlockBannerStanding.ROTATION);
        }
        
        private static boolean lIIIllIIIIIlIIII(final int llllllllllllIlllIIlIlllIIlIIlIlI) {
            return llllllllllllIlllIIlIlllIIlIIlIlI == 0;
        }
    }
}
