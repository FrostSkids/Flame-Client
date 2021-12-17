// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import java.util.Arrays;
import net.minecraft.util.StatCollector;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import java.util.List;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityBanner;
import net.minecraft.block.BlockWallSign;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockStandingSign;
import net.minecraft.util.MathHelper;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.nbt.NBTTagCompound;

public class ItemBanner extends ItemBlock
{
    private static final /* synthetic */ String[] llllllllIlIlI;
    private static final /* synthetic */ int[] llllllllIlllI;
    
    private EnumDyeColor getBaseColor(final ItemStack lllllllllllllIlIlIIllIIlIlIlllll) {
        final NBTTagCompound lllllllllllllIlIlIIllIIlIllIIIIl = lllllllllllllIlIlIIllIIlIlIlllll.getSubCompound(ItemBanner.llllllllIlIlI[ItemBanner.llllllllIlllI[7]], (boolean)(ItemBanner.llllllllIlllI[2] != 0));
        EnumDyeColor lllllllllllllIlIlIIllIIlIllIIIII = null;
        if (lIllIIIlllIIlll(lllllllllllllIlIlIIllIIlIllIIIIl) && lIllIIIlllIIllI(lllllllllllllIlIlIIllIIlIllIIIIl.hasKey(ItemBanner.llllllllIlIlI[ItemBanner.llllllllIlllI[14]]) ? 1 : 0)) {
            lllllllllllllIlIlIIllIIlIllIIIII = EnumDyeColor.byDyeDamage(lllllllllllllIlIlIIllIIlIllIIIIl.getInteger(ItemBanner.llllllllIlIlI[ItemBanner.llllllllIlllI[15]]));
            "".length();
            if ("  ".length() >= "   ".length()) {
                return null;
            }
        }
        else {
            lllllllllllllIlIlIIllIIlIllIIIII = EnumDyeColor.byDyeDamage(lllllllllllllIlIlIIllIIlIlIlllll.getMetadata());
        }
        return lllllllllllllIlIlIIllIIlIllIIIII;
    }
    
    @Override
    public CreativeTabs getCreativeTab() {
        return CreativeTabs.tabDecorations;
    }
    
    private static boolean lIllIIIlllIIlII(final Object lllllllllllllIlIlIIllIIlIIlIIIII, final Object lllllllllllllIlIlIIllIIlIIIlllll) {
        return lllllllllllllIlIlIIllIIlIIlIIIII == lllllllllllllIlIlIIllIIlIIIlllll;
    }
    
    private static boolean lIllIIIlllIIlll(final Object lllllllllllllIlIlIIllIIlIIIlllIl) {
        return lllllllllllllIlIlIIllIIlIIIlllIl != null;
    }
    
    private static void lIllIIIllIllllI() {
        (llllllllIlIlI = new String[ItemBanner.llllllllIlllI[16]])[ItemBanner.llllllllIlllI[2]] = lIllIIIllIlIlll("LBUwCWgnADsKIzdP", "EaUdF");
        ItemBanner.llllllllIlIlI[ItemBanner.llllllllIlllI[1]] = lIllIIIllIlIlll("WwcLNSM=", "uijXF");
        ItemBanner.llllllllIlIlI[ItemBanner.llllllllIlllI[5]] = lIllIIIllIlIlll("KgMcOyotAQcxNRE7Ej8=", "hosXA");
        ItemBanner.llllllllIlIlI[ItemBanner.llllllllIlllI[4]] = lIllIIIllIllIIl("tU/1X7u67dnVF+3qZ7jCKQ==", "WFQvD");
        ItemBanner.llllllllIlIlI[ItemBanner.llllllllIlllI[6]] = lIllIIIllIllIIl("tnRYLXRPNjsvP5XEvv0O9Q==", "NeYyB");
        ItemBanner.llllllllIlIlI[ItemBanner.llllllllIlllI[8]] = lIllIIIllIllIlI("HkHGsSct+Ag=", "SIYIs");
        ItemBanner.llllllllIlIlI[ItemBanner.llllllllIlllI[9]] = lIllIIIllIlIlll("MxsCATYRFA==", "czvuS");
        ItemBanner.llllllllIlIlI[ItemBanner.llllllllIlllI[10]] = lIllIIIllIllIlI("UCDPu8oOWNSCJy6aANK7JA==", "fJvno");
        ItemBanner.llllllllIlIlI[ItemBanner.llllllllIlllI[11]] = lIllIIIllIllIlI("/3NTNhloVc8=", "FeeEB");
        ItemBanner.llllllllIlIlI[ItemBanner.llllllllIlllI[13]] = lIllIIIllIllIlI("NHMf0IKlltyD1mIrRF6RAQ==", "PLhjk");
        ItemBanner.llllllllIlIlI[ItemBanner.llllllllIlllI[7]] = lIllIIIllIlIlll("OBoGFC8/GB0eMAMiCBA=", "zviwD");
        ItemBanner.llllllllIlIlI[ItemBanner.llllllllIlllI[14]] = lIllIIIllIllIIl("Z0sNnGP+cqQ=", "UmVAJ");
        ItemBanner.llllllllIlIlI[ItemBanner.llllllllIlllI[15]] = lIllIIIllIllIlI("AxyvY3gWDt4=", "qsheA");
    }
    
    private static boolean lIllIIIlllIIllI(final int lllllllllllllIlIlIIllIIlIIIllIll) {
        return lllllllllllllIlIlIIllIIlIIIllIll != 0;
    }
    
    private static boolean lIllIIIlllIIlIl(final int lllllllllllllIlIlIIllIIlIIIllIIl) {
        return lllllllllllllIlIlIIllIIlIIIllIIl == 0;
    }
    
    public ItemBanner() {
        super(Blocks.standing_banner);
        this.maxStackSize = ItemBanner.llllllllIlllI[0];
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
        this.setHasSubtypes((boolean)(ItemBanner.llllllllIlllI[1] != 0));
        "".length();
        this.setMaxDamage(ItemBanner.llllllllIlllI[2]);
        "".length();
    }
    
    private static boolean lIllIIIlllIlIIl(final int lllllllllllllIlIlIIllIIlIIlIlIII, final int lllllllllllllIlIlIIllIIlIIlIIlll) {
        return lllllllllllllIlIlIIllIIlIIlIlIII >= lllllllllllllIlIlIIllIIlIIlIIlll;
    }
    
    @Override
    public boolean onItemUse(final ItemStack lllllllllllllIlIlIIllIIllIlllIlI, final EntityPlayer lllllllllllllIlIlIIllIIlllIIIIll, final World lllllllllllllIlIlIIllIIllIlllIII, BlockPos lllllllllllllIlIlIIllIIlllIIIIIl, final EnumFacing lllllllllllllIlIlIIllIIllIllIllI, final float lllllllllllllIlIlIIllIIllIllllll, final float lllllllllllllIlIlIIllIIllIlllllI, final float lllllllllllllIlIlIIllIIllIllllIl) {
        if (lIllIIIlllIIlII(lllllllllllllIlIlIIllIIllIllIllI, EnumFacing.DOWN)) {
            return ItemBanner.llllllllIlllI[2] != 0;
        }
        if (lIllIIIlllIIlIl(lllllllllllllIlIlIIllIIllIlllIII.getBlockState(lllllllllllllIlIlIIllIIlllIIIIIl).getBlock().getMaterial().isSolid() ? 1 : 0)) {
            return ItemBanner.llllllllIlllI[2] != 0;
        }
        lllllllllllllIlIlIIllIIlllIIIIIl = lllllllllllllIlIlIIllIIlllIIIIIl.offset(lllllllllllllIlIlIIllIIllIllIllI);
        if (lIllIIIlllIIlIl(lllllllllllllIlIlIIllIIlllIIIIll.canPlayerEdit(lllllllllllllIlIlIIllIIlllIIIIIl, lllllllllllllIlIlIIllIIllIllIllI, lllllllllllllIlIlIIllIIllIlllIlI) ? 1 : 0)) {
            return ItemBanner.llllllllIlllI[2] != 0;
        }
        if (lIllIIIlllIIlIl(Blocks.standing_banner.canPlaceBlockAt(lllllllllllllIlIlIIllIIllIlllIII, lllllllllllllIlIlIIllIIlllIIIIIl) ? 1 : 0)) {
            return ItemBanner.llllllllIlllI[2] != 0;
        }
        if (lIllIIIlllIIllI(lllllllllllllIlIlIIllIIllIlllIII.isRemote ? 1 : 0)) {
            return ItemBanner.llllllllIlllI[1] != 0;
        }
        if (lIllIIIlllIIlII(lllllllllllllIlIlIIllIIllIllIllI, EnumFacing.UP)) {
            final int lllllllllllllIlIlIIllIIllIllllII = MathHelper.floor_double((lllllllllllllIlIlIIllIIlllIIIIll.rotationYaw + 180.0f) * 16.0f / 360.0f + 0.5) & ItemBanner.llllllllIlllI[3];
            lllllllllllllIlIlIIllIIllIlllIII.setBlockState(lllllllllllllIlIlIIllIIlllIIIIIl, Blocks.standing_banner.getDefaultState().withProperty((IProperty<Comparable>)BlockStandingSign.ROTATION, lllllllllllllIlIlIIllIIllIllllII), ItemBanner.llllllllIlllI[4]);
            "".length();
            "".length();
            if (-" ".length() != -" ".length()) {
                return ((86 + 48 - 76 + 74 ^ 101 + 29 - 44 + 80) & (22 + 81 - 51 + 102 ^ 79 + 152 - 68 + 21 ^ -" ".length())) != 0x0;
            }
        }
        else {
            lllllllllllllIlIlIIllIIllIlllIII.setBlockState(lllllllllllllIlIlIIllIIlllIIIIIl, Blocks.wall_banner.getDefaultState().withProperty((IProperty<Comparable>)BlockWallSign.FACING, lllllllllllllIlIlIIllIIllIllIllI), ItemBanner.llllllllIlllI[4]);
            "".length();
        }
        lllllllllllllIlIlIIllIIllIlllIlI.stackSize -= ItemBanner.llllllllIlllI[1];
        final TileEntity lllllllllllllIlIlIIllIIllIlllIll = lllllllllllllIlIlIIllIIllIlllIII.getTileEntity(lllllllllllllIlIlIIllIIlllIIIIIl);
        if (lIllIIIlllIIllI((lllllllllllllIlIlIIllIIllIlllIll instanceof TileEntityBanner) ? 1 : 0)) {
            ((TileEntityBanner)lllllllllllllIlIlIIllIIllIlllIll).setItemValues(lllllllllllllIlIlIIllIIllIlllIlI);
        }
        return ItemBanner.llllllllIlllI[1] != 0;
    }
    
    private static boolean lIllIIIlllIlIII(final int lllllllllllllIlIlIIllIIlIIlIIlII, final int lllllllllllllIlIlIIllIIlIIlIIIll) {
        return lllllllllllllIlIlIIllIIlIIlIIlII < lllllllllllllIlIlIIllIIlIIlIIIll;
    }
    
    @Override
    public void getSubItems(final Item lllllllllllllIlIlIIllIIlIlllIlll, final CreativeTabs lllllllllllllIlIlIIllIIlIlllIllI, final List<ItemStack> lllllllllllllIlIlIIllIIlIllIllll) {
        final double lllllllllllllIlIlIIllIIlIllIlIll;
        final Exception lllllllllllllIlIlIIllIIlIllIllII = (Exception)((EnumDyeColor[])(Object)(lllllllllllllIlIlIIllIIlIllIlIll = (double)(Object)EnumDyeColor.values())).length;
        int lllllllllllllIlIlIIllIIlIllIllIl = ItemBanner.llllllllIlllI[2];
        "".length();
        if (" ".length() > "  ".length()) {
            return;
        }
        while (!lIllIIIlllIlIIl(lllllllllllllIlIlIIllIIlIllIllIl, (int)lllllllllllllIlIlIIllIIlIllIllII)) {
            final EnumDyeColor lllllllllllllIlIlIIllIIlIlllIlII = lllllllllllllIlIlIIllIIlIllIlIll[lllllllllllllIlIlIIllIIlIllIllIl];
            final NBTTagCompound lllllllllllllIlIlIIllIIlIlllIIll = new NBTTagCompound();
            TileEntityBanner.func_181020_a(lllllllllllllIlIlIIllIIlIlllIIll, lllllllllllllIlIlIIllIIlIlllIlII.getDyeDamage(), null);
            final NBTTagCompound lllllllllllllIlIlIIllIIlIlllIIlI = new NBTTagCompound();
            lllllllllllllIlIlIIllIIlIlllIIlI.setTag(ItemBanner.llllllllIlIlI[ItemBanner.llllllllIlllI[13]], lllllllllllllIlIlIIllIIlIlllIIll);
            final ItemStack lllllllllllllIlIlIIllIIlIlllIIIl = new ItemStack(lllllllllllllIlIlIIllIIlIlllIlll, ItemBanner.llllllllIlllI[1], lllllllllllllIlIlIIllIIlIlllIlII.getDyeDamage());
            lllllllllllllIlIlIIllIIlIlllIIIl.setTagCompound(lllllllllllllIlIlIIllIIlIlllIIlI);
            lllllllllllllIlIlIIllIIlIllIllll.add(lllllllllllllIlIlIIllIIlIlllIIIl);
            "".length();
            ++lllllllllllllIlIlIIllIIlIllIllIl;
        }
    }
    
    private static String lIllIIIllIllIIl(final String lllllllllllllIlIlIIllIIlIIllIIII, final String lllllllllllllIlIlIIllIIlIIlIllIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIllIIlIIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIllIIlIIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIIllIIlIIllIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIIllIIlIIllIIlI.init(ItemBanner.llllllllIlllI[5], lllllllllllllIlIlIIllIIlIIllIIll);
            return new String(lllllllllllllIlIlIIllIIlIIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIllIIlIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIllIIlIIllIIIl) {
            lllllllllllllIlIlIIllIIlIIllIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void addInformation(final ItemStack lllllllllllllIlIlIIllIIllIIlllll, final EntityPlayer lllllllllllllIlIlIIllIIllIIllllI, final List<String> lllllllllllllIlIlIIllIIllIIlllIl, final boolean lllllllllllllIlIlIIllIIllIIlllII) {
        final NBTTagCompound lllllllllllllIlIlIIllIIllIIllIll = lllllllllllllIlIlIIllIIllIIlllll.getSubCompound(ItemBanner.llllllllIlIlI[ItemBanner.llllllllIlllI[5]], (boolean)(ItemBanner.llllllllIlllI[2] != 0));
        if (lIllIIIlllIIlll(lllllllllllllIlIlIIllIIllIIllIll) && lIllIIIlllIIllI(lllllllllllllIlIlIIllIIllIIllIll.hasKey(ItemBanner.llllllllIlIlI[ItemBanner.llllllllIlllI[4]]) ? 1 : 0)) {
            final NBTTagList lllllllllllllIlIlIIllIIllIIllIlI = lllllllllllllIlIlIIllIIllIIllIll.getTagList(ItemBanner.llllllllIlIlI[ItemBanner.llllllllIlllI[6]], ItemBanner.llllllllIlllI[7]);
            int lllllllllllllIlIlIIllIIllIIllIIl = ItemBanner.llllllllIlllI[2];
            "".length();
            if (" ".length() <= 0) {
                return;
            }
            while (lIllIIIlllIlIII(lllllllllllllIlIlIIllIIllIIllIIl, lllllllllllllIlIlIIllIIllIIllIlI.tagCount()) && !lIllIIIlllIlIIl(lllllllllllllIlIlIIllIIllIIllIIl, ItemBanner.llllllllIlllI[9])) {
                final NBTTagCompound lllllllllllllIlIlIIllIIllIIllIII = lllllllllllllIlIlIIllIIllIIllIlI.getCompoundTagAt(lllllllllllllIlIlIIllIIllIIllIIl);
                final EnumDyeColor lllllllllllllIlIlIIllIIllIIlIlll = EnumDyeColor.byDyeDamage(lllllllllllllIlIlIIllIIllIIllIII.getInteger(ItemBanner.llllllllIlIlI[ItemBanner.llllllllIlllI[8]]));
                final TileEntityBanner.EnumBannerPattern lllllllllllllIlIlIIllIIllIIlIllI = TileEntityBanner.EnumBannerPattern.getPatternByID(lllllllllllllIlIlIIllIIllIIllIII.getString(ItemBanner.llllllllIlIlI[ItemBanner.llllllllIlllI[9]]));
                if (lIllIIIlllIIlll(lllllllllllllIlIlIIllIIllIIlIllI)) {
                    lllllllllllllIlIlIIllIIllIIlllIl.add(StatCollector.translateToLocal(String.valueOf(new StringBuilder(ItemBanner.llllllllIlIlI[ItemBanner.llllllllIlllI[10]]).append(lllllllllllllIlIlIIllIIllIIlIllI.getPatternName()).append(ItemBanner.llllllllIlIlI[ItemBanner.llllllllIlllI[11]]).append(lllllllllllllIlIlIIllIIllIIlIlll.getUnlocalizedName()))));
                    "".length();
                }
                ++lllllllllllllIlIlIIllIIllIIllIIl;
            }
        }
    }
    
    private static String lIllIIIllIlIlll(String lllllllllllllIlIlIIllIIlIlIIIIII, final String lllllllllllllIlIlIIllIIlIIllllll) {
        lllllllllllllIlIlIIllIIlIlIIIIII = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIIllIIlIlIIIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIIllIIlIlIIIIll = new StringBuilder();
        final char[] lllllllllllllIlIlIIllIIlIlIIIIlI = lllllllllllllIlIlIIllIIlIIllllll.toCharArray();
        int lllllllllllllIlIlIIllIIlIlIIIIIl = ItemBanner.llllllllIlllI[2];
        final int lllllllllllllIlIlIIllIIlIIlllIll = (Object)((String)lllllllllllllIlIlIIllIIlIlIIIIII).toCharArray();
        final long lllllllllllllIlIlIIllIIlIIlllIlI = lllllllllllllIlIlIIllIIlIIlllIll.length;
        short lllllllllllllIlIlIIllIIlIIlllIIl = (short)ItemBanner.llllllllIlllI[2];
        while (lIllIIIlllIlIII(lllllllllllllIlIlIIllIIlIIlllIIl, (int)lllllllllllllIlIlIIllIIlIIlllIlI)) {
            final char lllllllllllllIlIlIIllIIlIlIIIllI = lllllllllllllIlIlIIllIIlIIlllIll[lllllllllllllIlIlIIllIIlIIlllIIl];
            lllllllllllllIlIlIIllIIlIlIIIIll.append((char)(lllllllllllllIlIlIIllIIlIlIIIllI ^ lllllllllllllIlIlIIllIIlIlIIIIlI[lllllllllllllIlIlIIllIIlIlIIIIIl % lllllllllllllIlIlIIllIIlIlIIIIlI.length]));
            "".length();
            ++lllllllllllllIlIlIIllIIlIlIIIIIl;
            ++lllllllllllllIlIlIIllIIlIIlllIIl;
            "".length();
            if ((0xFC ^ 0xB3 ^ (0x57 ^ 0x1C)) == 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIIllIIlIlIIIIll);
    }
    
    private static void lIllIIIlllIIIll() {
        (llllllllIlllI = new int[17])[0] = (0x25 ^ 0x35);
        ItemBanner.llllllllIlllI[1] = " ".length();
        ItemBanner.llllllllIlllI[2] = ((0xE1 ^ 0xBD) & ~(0xDB ^ 0x87));
        ItemBanner.llllllllIlllI[3] = (0x6B ^ 0x39 ^ (0xF0 ^ 0xAD));
        ItemBanner.llllllllIlllI[4] = "   ".length();
        ItemBanner.llllllllIlllI[5] = "  ".length();
        ItemBanner.llllllllIlllI[6] = (0x71 ^ 0x75);
        ItemBanner.llllllllIlllI[7] = (0x57 ^ 0x15 ^ (0x3F ^ 0x77));
        ItemBanner.llllllllIlllI[8] = (0x39 ^ 0x6D ^ (0x65 ^ 0x34));
        ItemBanner.llllllllIlllI[9] = (91 + 117 - 132 + 54 ^ 60 + 7 + 22 + 43);
        ItemBanner.llllllllIlllI[10] = (0xAF ^ 0xA8);
        ItemBanner.llllllllIlllI[11] = (0x1E ^ 0x16);
        ItemBanner.llllllllIlllI[12] = (-1 & 0xFFFFFF);
        ItemBanner.llllllllIlllI[13] = (0x74 ^ 0x7D);
        ItemBanner.llllllllIlllI[14] = (0x29 ^ 0x22);
        ItemBanner.llllllllIlllI[15] = (0x4 ^ 0x8);
        ItemBanner.llllllllIlllI[16] = (0x4E ^ 0x43);
    }
    
    static {
        lIllIIIlllIIIll();
        lIllIIIllIllllI();
    }
    
    @Override
    public int getColorFromItemStack(final ItemStack lllllllllllllIlIlIIllIIllIIIlIII, final int lllllllllllllIlIlIIllIIllIIIIlll) {
        if (lIllIIIlllIIlIl(lllllllllllllIlIlIIllIIllIIIIlll)) {
            return ItemBanner.llllllllIlllI[12];
        }
        final EnumDyeColor lllllllllllllIlIlIIllIIllIIIIllI = this.getBaseColor(lllllllllllllIlIlIIllIIllIIIlIII);
        return lllllllllllllIlIlIIllIIllIIIIllI.getMapColor().colorValue;
    }
    
    private static String lIllIIIllIllIlI(final String lllllllllllllIlIlIIllIIlIlIlIlIl, final String lllllllllllllIlIlIIllIIlIlIlIIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIllIIlIlIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIllIIlIlIlIIlI.getBytes(StandardCharsets.UTF_8)), ItemBanner.llllllllIlllI[11]), "DES");
            final Cipher lllllllllllllIlIlIIllIIlIlIlIlll = Cipher.getInstance("DES");
            lllllllllllllIlIlIIllIIlIlIlIlll.init(ItemBanner.llllllllIlllI[5], lllllllllllllIlIlIIllIIlIlIllIII);
            return new String(lllllllllllllIlIlIIllIIlIlIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIllIIlIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIllIIlIlIlIllI) {
            lllllllllllllIlIlIIllIIlIlIlIllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String getItemStackDisplayName(final ItemStack lllllllllllllIlIlIIllIIllIlIlIll) {
        String lllllllllllllIlIlIIllIIllIlIlllI = ItemBanner.llllllllIlIlI[ItemBanner.llllllllIlllI[2]];
        final EnumDyeColor lllllllllllllIlIlIIllIIllIlIllIl = this.getBaseColor(lllllllllllllIlIlIIllIIllIlIlIll);
        lllllllllllllIlIlIIllIIllIlIlllI = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIlIIllIIllIlIlllI)).append(lllllllllllllIlIlIIllIIllIlIllIl.getUnlocalizedName()).append(ItemBanner.llllllllIlIlI[ItemBanner.llllllllIlllI[1]]));
        return StatCollector.translateToLocal(lllllllllllllIlIlIIllIIllIlIlllI);
    }
}
