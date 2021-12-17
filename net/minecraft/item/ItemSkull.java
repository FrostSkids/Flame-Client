// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.StatCollector;
import net.minecraft.nbt.NBTBase;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import java.util.UUID;
import com.mojang.authlib.GameProfile;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.tileentity.TileEntitySkull;
import net.minecraft.util.MathHelper;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockSkull;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;

public class ItemSkull extends Item
{
    private static final /* synthetic */ String[] lIIllIIIlllIIl;
    private static final /* synthetic */ String[] skullTypes;
    private static final /* synthetic */ int[] lIIllIIIlllIlI;
    
    private static boolean llIlIllIllIlllI(final int lllllllllllllIIlIllIIIlllIllIIlI) {
        return lllllllllllllIIlIllIIIlllIllIIlI == 0;
    }
    
    private static boolean llIlIllIllIllIl(final Object lllllllllllllIIlIllIIIlllIllIlll, final Object lllllllllllllIIlIllIIIlllIllIllI) {
        return lllllllllllllIIlIllIIIlllIllIlll == lllllllllllllIIlIllIIIlllIllIllI;
    }
    
    @Override
    public boolean onItemUse(final ItemStack lllllllllllllIIlIllIIlIIIIlllllI, final EntityPlayer lllllllllllllIIlIllIIlIIIIllllIl, final World lllllllllllllIIlIllIIlIIIIlIllII, BlockPos lllllllllllllIIlIllIIlIIIIlIlIll, final EnumFacing lllllllllllllIIlIllIIlIIIIlllIlI, final float lllllllllllllIIlIllIIlIIIIlllIIl, final float lllllllllllllIIlIllIIlIIIIlllIII, final float lllllllllllllIIlIllIIlIIIIllIlll) {
        if (llIlIllIllIllIl(lllllllllllllIIlIllIIlIIIIlllIlI, EnumFacing.DOWN)) {
            return ItemSkull.lIIllIIIlllIlI[1] != 0;
        }
        final IBlockState lllllllllllllIIlIllIIlIIIIllIllI = lllllllllllllIIlIllIIlIIIIlIllII.getBlockState((BlockPos)lllllllllllllIIlIllIIlIIIIlIlIll);
        final Block lllllllllllllIIlIllIIlIIIIllIlIl = lllllllllllllIIlIllIIlIIIIllIllI.getBlock();
        final boolean lllllllllllllIIlIllIIlIIIIllIlII = lllllllllllllIIlIllIIlIIIIllIlIl.isReplaceable(lllllllllllllIIlIllIIlIIIIlIllII, (BlockPos)lllllllllllllIIlIllIIlIIIIlIlIll);
        if (llIlIllIllIlllI(lllllllllllllIIlIllIIlIIIIllIlII ? 1 : 0)) {
            if (llIlIllIllIlllI(lllllllllllllIIlIllIIlIIIIlIllII.getBlockState((BlockPos)lllllllllllllIIlIllIIlIIIIlIlIll).getBlock().getMaterial().isSolid() ? 1 : 0)) {
                return ItemSkull.lIIllIIIlllIlI[1] != 0;
            }
            lllllllllllllIIlIllIIlIIIIlIlIll = ((BlockPos)lllllllllllllIIlIllIIlIIIIlIlIll).offset(lllllllllllllIIlIllIIlIIIIlllIlI);
        }
        if (llIlIllIllIlllI(lllllllllllllIIlIllIIlIIIIllllIl.canPlayerEdit((BlockPos)lllllllllllllIIlIllIIlIIIIlIlIll, lllllllllllllIIlIllIIlIIIIlllIlI, lllllllllllllIIlIllIIlIIIIlllllI) ? 1 : 0)) {
            return ItemSkull.lIIllIIIlllIlI[1] != 0;
        }
        if (llIlIllIllIlllI(Blocks.skull.canPlaceBlockAt(lllllllllllllIIlIllIIlIIIIlIllII, (BlockPos)lllllllllllllIIlIllIIlIIIIlIlIll) ? 1 : 0)) {
            return ItemSkull.lIIllIIIlllIlI[1] != 0;
        }
        if (llIlIllIllIlllI(lllllllllllllIIlIllIIlIIIIlIllII.isRemote ? 1 : 0)) {
            lllllllllllllIIlIllIIlIIIIlIllII.setBlockState((BlockPos)lllllllllllllIIlIllIIlIIIIlIlIll, Blocks.skull.getDefaultState().withProperty((IProperty<Comparable>)BlockSkull.FACING, lllllllllllllIIlIllIIlIIIIlllIlI), ItemSkull.lIIllIIIlllIlI[4]);
            "".length();
            int lllllllllllllIIlIllIIlIIIIllIIll = ItemSkull.lIIllIIIlllIlI[1];
            if (llIlIllIllIllIl(lllllllllllllIIlIllIIlIIIIlllIlI, EnumFacing.UP)) {
                lllllllllllllIIlIllIIlIIIIllIIll = (MathHelper.floor_double(lllllllllllllIIlIllIIlIIIIllllIl.rotationYaw * 16.0f / 360.0f + 0.5) & ItemSkull.lIIllIIIlllIlI[6]);
            }
            final TileEntity lllllllllllllIIlIllIIlIIIIllIIlI = lllllllllllllIIlIllIIlIIIIlIllII.getTileEntity((BlockPos)lllllllllllllIIlIllIIlIIIIlIlIll);
            if (llIlIllIllIllll((lllllllllllllIIlIllIIlIIIIllIIlI instanceof TileEntitySkull) ? 1 : 0)) {
                final TileEntitySkull lllllllllllllIIlIllIIlIIIIllIIIl = (TileEntitySkull)lllllllllllllIIlIllIIlIIIIllIIlI;
                if (llIlIllIlllIIII(lllllllllllllIIlIllIIlIIIIlllllI.getMetadata(), ItemSkull.lIIllIIIlllIlI[4])) {
                    GameProfile lllllllllllllIIlIllIIlIIIIllIIII = null;
                    if (llIlIllIllIllll(lllllllllllllIIlIllIIlIIIIlllllI.hasTagCompound() ? 1 : 0)) {
                        final NBTTagCompound lllllllllllllIIlIllIIlIIIIlIllll = lllllllllllllIIlIllIIlIIIIlllllI.getTagCompound();
                        if (llIlIllIllIllll(lllllllllllllIIlIllIIlIIIIlIllll.hasKey(ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[0]], ItemSkull.lIIllIIIlllIlI[7]) ? 1 : 0)) {
                            lllllllllllllIIlIllIIlIIIIllIIII = NBTUtil.readGameProfileFromNBT(lllllllllllllIIlIllIIlIIIIlIllll.getCompoundTag(ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[8]]));
                            "".length();
                            if (null != null) {
                                return ((0xB4 ^ 0xC3 ^ (0xFE ^ 0x8F)) & (35 + 108 - 24 + 30 ^ 71 + 60 - 82 + 98 ^ -" ".length())) != 0x0;
                            }
                        }
                        else if (llIlIllIllIllll(lllllllllllllIIlIllIIlIIIIlIllll.hasKey(ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[9]], ItemSkull.lIIllIIIlllIlI[10]) ? 1 : 0) && llIlIllIlllIIIl(lllllllllllllIIlIllIIlIIIIlIllll.getString(ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[10]]).length())) {
                            lllllllllllllIIlIllIIlIIIIllIIII = new GameProfile((UUID)null, lllllllllllllIIlIllIIlIIIIlIllll.getString(ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[11]]));
                        }
                    }
                    lllllllllllllIIlIllIIlIIIIllIIIl.setPlayerProfile(lllllllllllllIIlIllIIlIIIIllIIII);
                    "".length();
                    if ((0x76 ^ 0x72) < -" ".length()) {
                        return ((0xC ^ 0x5) & ~(0x3C ^ 0x35)) != 0x0;
                    }
                }
                else {
                    lllllllllllllIIlIllIIlIIIIllIIIl.setType(lllllllllllllIIlIllIIlIIIIlllllI.getMetadata());
                }
                lllllllllllllIIlIllIIlIIIIllIIIl.setSkullRotation(lllllllllllllIIlIllIIlIIIIllIIll);
                Blocks.skull.checkWitherSpawn(lllllllllllllIIlIllIIlIIIIlIllII, (BlockPos)lllllllllllllIIlIllIIlIIIIlIlIll, lllllllllllllIIlIllIIlIIIIllIIIl);
            }
            lllllllllllllIIlIllIIlIIIIlllllI.stackSize -= ItemSkull.lIIllIIIlllIlI[2];
        }
        return ItemSkull.lIIllIIIlllIlI[2] != 0;
    }
    
    private static boolean llIlIllIlllIIlI(final int lllllllllllllIIlIllIIIlllIllllll, final int lllllllllllllIIlIllIIIlllIlllllI) {
        return lllllllllllllIIlIllIIIlllIllllll >= lllllllllllllIIlIllIIIlllIlllllI;
    }
    
    @Override
    public String getUnlocalizedName(final ItemStack lllllllllllllIIlIllIIlIIIIIIlllI) {
        int lllllllllllllIIlIllIIlIIIIIIllIl = lllllllllllllIIlIllIIlIIIIIIlllI.getMetadata();
        if (!llIlIllIlllIIll(lllllllllllllIIlIllIIlIIIIIIllIl) || llIlIllIlllIIlI(lllllllllllllIIlIllIIlIIIIIIllIl, ItemSkull.skullTypes.length)) {
            lllllllllllllIIlIllIIlIIIIIIllIl = ItemSkull.lIIllIIIlllIlI[1];
        }
        return String.valueOf(new StringBuilder(String.valueOf(super.getUnlocalizedName())).append(ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[7]]).append(ItemSkull.skullTypes[lllllllllllllIIlIllIIlIIIIIIllIl]));
    }
    
    private static String llIlIllIllIlIIl(String lllllllllllllIIlIllIIIllllIllIll, final String lllllllllllllIIlIllIIIllllIlllll) {
        lllllllllllllIIlIllIIIllllIllIll = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIllIIIllllIllIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIllIIIllllIllllI = new StringBuilder();
        final char[] lllllllllllllIIlIllIIIllllIlllIl = lllllllllllllIIlIllIIIllllIlllll.toCharArray();
        int lllllllllllllIIlIllIIIllllIlllII = ItemSkull.lIIllIIIlllIlI[1];
        final short lllllllllllllIIlIllIIIllllIlIllI = (Object)((String)lllllllllllllIIlIllIIIllllIllIll).toCharArray();
        final boolean lllllllllllllIIlIllIIIllllIlIlIl = lllllllllllllIIlIllIIIllllIlIllI.length != 0;
        char lllllllllllllIIlIllIIIllllIlIlII = (char)ItemSkull.lIIllIIIlllIlI[1];
        while (llIlIllIlllIlII(lllllllllllllIIlIllIIIllllIlIlII, lllllllllllllIIlIllIIIllllIlIlIl ? 1 : 0)) {
            final char lllllllllllllIIlIllIIIlllllIIIIl = lllllllllllllIIlIllIIIllllIlIllI[lllllllllllllIIlIllIIIllllIlIlII];
            lllllllllllllIIlIllIIIllllIllllI.append((char)(lllllllllllllIIlIllIIIlllllIIIIl ^ lllllllllllllIIlIllIIIllllIlllIl[lllllllllllllIIlIllIIIllllIlllII % lllllllllllllIIlIllIIIllllIlllIl.length]));
            "".length();
            ++lllllllllllllIIlIllIIIllllIlllII;
            ++lllllllllllllIIlIllIIIllllIlIlII;
            "".length();
            if ((0x27 ^ 0x23) < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIllIIIllllIllllI);
    }
    
    private static String llIlIllIllIlIII(final String lllllllllllllIIlIllIIIllllIIlIll, final String lllllllllllllIIlIllIIIllllIIlIII) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIIIllllIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIIIllllIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIllIIIllllIIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIllIIIllllIIllIl.init(ItemSkull.lIIllIIIlllIlI[3], lllllllllllllIIlIllIIIllllIIlllI);
            return new String(lllllllllllllIIlIllIIIllllIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIIIllllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIIIllllIIllII) {
            lllllllllllllIIlIllIIIllllIIllII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIllIlllIIIl(final int lllllllllllllIIlIllIIIlllIlIlllI) {
        return lllllllllllllIIlIllIIIlllIlIlllI > 0;
    }
    
    private static String llIlIllIllIIlll(final String lllllllllllllIIlIllIIIlllllIlllI, final String lllllllllllllIIlIllIIIlllllIllll) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIIIllllllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIIIlllllIllll.getBytes(StandardCharsets.UTF_8)), ItemSkull.lIIllIIIlllIlI[10]), "DES");
            final Cipher lllllllllllllIIlIllIIIllllllIIlI = Cipher.getInstance("DES");
            lllllllllllllIIlIllIIIllllllIIlI.init(ItemSkull.lIIllIIIlllIlI[3], lllllllllllllIIlIllIIIllllllIIll);
            return new String(lllllllllllllIIlIllIIIllllllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIIIlllllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIIIllllllIIIl) {
            lllllllllllllIIlIllIIIllllllIIIl.printStackTrace();
            return null;
        }
    }
    
    private static void llIlIllIllIlIll() {
        (lIIllIIIlllIlI = new int[24])[0] = (0x1C ^ 0x11 ^ (0x34 ^ 0x3C));
        ItemSkull.lIIllIIIlllIlI[1] = ((0x98 ^ 0x9D) & ~(0x28 ^ 0x2D));
        ItemSkull.lIIllIIIlllIlI[2] = " ".length();
        ItemSkull.lIIllIIIlllIlI[3] = "  ".length();
        ItemSkull.lIIllIIIlllIlI[4] = "   ".length();
        ItemSkull.lIIllIIIlllIlI[5] = (0xA9 ^ 0xAD);
        ItemSkull.lIIllIIIlllIlI[6] = (0x2C ^ 0x1A ^ (0x38 ^ 0x1));
        ItemSkull.lIIllIIIlllIlI[7] = (0x73 ^ 0x79);
        ItemSkull.lIIllIIIlllIlI[8] = (0xA5 ^ 0xA3);
        ItemSkull.lIIllIIIlllIlI[9] = (0x0 ^ 0x7);
        ItemSkull.lIIllIIIlllIlI[10] = (0x87 ^ 0x96 ^ (0x1 ^ 0x18));
        ItemSkull.lIIllIIIlllIlI[11] = (10 + 138 + 21 + 1 ^ 91 + 96 - 156 + 132);
        ItemSkull.lIIllIIIlllIlI[12] = (0x1D ^ 0x16);
        ItemSkull.lIIllIIIlllIlI[13] = (0x79 ^ 0x75);
        ItemSkull.lIIllIIIlllIlI[14] = (28 + 105 - 74 + 109 ^ 124 + 92 - 191 + 140);
        ItemSkull.lIIllIIIlllIlI[15] = (0x82 ^ 0xB8 ^ (0xB6 ^ 0x82));
        ItemSkull.lIIllIIIlllIlI[16] = (0x35 ^ 0x13 ^ (0x1E ^ 0x28));
        ItemSkull.lIIllIIIlllIlI[17] = (0x82 ^ 0xC1 ^ (0xC3 ^ 0x91));
        ItemSkull.lIIllIIIlllIlI[18] = (0x2D ^ 0x44 ^ (0x68 ^ 0x13));
        ItemSkull.lIIllIIIlllIlI[19] = (0xE7 ^ 0xA1 ^ (0xD9 ^ 0x8C));
        ItemSkull.lIIllIIIlllIlI[20] = (58 + 131 - 66 + 38 ^ 87 + 9 + 17 + 68);
        ItemSkull.lIIllIIIlllIlI[21] = (0x3 ^ 0x16);
        ItemSkull.lIIllIIIlllIlI[22] = (0xAE ^ 0xB8);
        ItemSkull.lIIllIIIlllIlI[23] = (0x77 ^ 0x47 ^ (0x6D ^ 0x4A));
    }
    
    static {
        llIlIllIllIlIll();
        llIlIllIllIlIlI();
        final String[] skullTypes2 = new String[ItemSkull.lIIllIIIlllIlI[0]];
        skullTypes2[ItemSkull.lIIllIIIlllIlI[1]] = ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[1]];
        skullTypes2[ItemSkull.lIIllIIIlllIlI[2]] = ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[2]];
        skullTypes2[ItemSkull.lIIllIIIlllIlI[3]] = ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[3]];
        skullTypes2[ItemSkull.lIIllIIIlllIlI[4]] = ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[4]];
        skullTypes2[ItemSkull.lIIllIIIlllIlI[5]] = ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[5]];
        skullTypes = skullTypes2;
    }
    
    @Override
    public boolean updateItemStackNBT(final NBTTagCompound lllllllllllllIIlIllIIIllllllllII) {
        super.updateItemStackNBT(lllllllllllllIIlIllIIIllllllllII);
        "".length();
        if (llIlIllIllIllll(lllllllllllllIIlIllIIIllllllllII.hasKey(ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[19]], ItemSkull.lIIllIIIlllIlI[10]) ? 1 : 0) && llIlIllIlllIIIl(lllllllllllllIIlIllIIIllllllllII.getString(ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[20]]).length())) {
            GameProfile lllllllllllllIIlIllIIIlllllllIll = new GameProfile((UUID)null, lllllllllllllIIlIllIIIllllllllII.getString(ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[21]]));
            lllllllllllllIIlIllIIIlllllllIll = TileEntitySkull.updateGameprofile(lllllllllllllIIlIllIIIlllllllIll);
            lllllllllllllIIlIllIIIllllllllII.setTag(ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[22]], NBTUtil.writeGameProfile(new NBTTagCompound(), lllllllllllllIIlIllIIIlllllllIll));
            return ItemSkull.lIIllIIIlllIlI[2] != 0;
        }
        return ItemSkull.lIIllIIIlllIlI[1] != 0;
    }
    
    @Override
    public String getItemStackDisplayName(final ItemStack lllllllllllllIIlIllIIlIIIIIIIIlI) {
        if (llIlIllIlllIIII(lllllllllllllIIlIllIIlIIIIIIIIlI.getMetadata(), ItemSkull.lIIllIIIlllIlI[4]) && llIlIllIllIllll(lllllllllllllIIlIllIIlIIIIIIIIlI.hasTagCompound() ? 1 : 0)) {
            if (llIlIllIllIllll(lllllllllllllIIlIllIIlIIIIIIIIlI.getTagCompound().hasKey(ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[12]], ItemSkull.lIIllIIIlllIlI[10]) ? 1 : 0)) {
                final String lllllllllllllIIIllIlllIIlIlIllll = ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[13]];
                final Object[] lllllllllllllIIIllIlllIIlIlIlllI = new Object[ItemSkull.lIIllIIIlllIlI[2]];
                lllllllllllllIIIllIlllIIlIlIlllI[ItemSkull.lIIllIIIlllIlI[1]] = lllllllllllllIIlIllIIlIIIIIIIIlI.getTagCompound().getString(ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[14]]);
                return StatCollector.translateToLocalFormatted(lllllllllllllIIIllIlllIIlIlIllll, lllllllllllllIIIllIlllIIlIlIlllI);
            }
            if (llIlIllIllIllll(lllllllllllllIIlIllIIlIIIIIIIIlI.getTagCompound().hasKey(ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[15]], ItemSkull.lIIllIIIlllIlI[7]) ? 1 : 0)) {
                final NBTTagCompound lllllllllllllIIlIllIIlIIIIIIIlII = lllllllllllllIIlIllIIlIIIIIIIIlI.getTagCompound().getCompoundTag(ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[6]]);
                if (llIlIllIllIllll(lllllllllllllIIlIllIIlIIIIIIIlII.hasKey(ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[16]], ItemSkull.lIIllIIIlllIlI[10]) ? 1 : 0)) {
                    final String lllllllllllllIIIllIlllIIlIlIllll2 = ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[17]];
                    final Object[] lllllllllllllIIIllIlllIIlIlIlllI2 = new Object[ItemSkull.lIIllIIIlllIlI[2]];
                    lllllllllllllIIIllIlllIIlIlIlllI2[ItemSkull.lIIllIIIlllIlI[1]] = lllllllllllllIIlIllIIlIIIIIIIlII.getString(ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[18]]);
                    return StatCollector.translateToLocalFormatted(lllllllllllllIIIllIlllIIlIlIllll2, lllllllllllllIIIllIlllIIlIlIlllI2);
                }
            }
        }
        return super.getItemStackDisplayName(lllllllllllllIIlIllIIlIIIIIIIIlI);
    }
    
    private static boolean llIlIllIllIllll(final int lllllllllllllIIlIllIIIlllIllIlII) {
        return lllllllllllllIIlIllIIIlllIllIlII != 0;
    }
    
    private static boolean llIlIllIlllIlII(final int lllllllllllllIIlIllIIIlllIlllIll, final int lllllllllllllIIlIllIIIlllIlllIlI) {
        return lllllllllllllIIlIllIIIlllIlllIll < lllllllllllllIIlIllIIIlllIlllIlI;
    }
    
    @Override
    public int getMetadata(final int lllllllllllllIIlIllIIlIIIIIlIIll) {
        return lllllllllllllIIlIllIIlIIIIIlIIll;
    }
    
    private static boolean llIlIllIlllIIll(final int lllllllllllllIIlIllIIIlllIllIIII) {
        return lllllllllllllIIlIllIIIlllIllIIII >= 0;
    }
    
    @Override
    public void getSubItems(final Item lllllllllllllIIlIllIIlIIIIIllIIl, final CreativeTabs lllllllllllllIIlIllIIlIIIIIlllII, final List<ItemStack> lllllllllllllIIlIllIIlIIIIIllIII) {
        int lllllllllllllIIlIllIIlIIIIIllIlI = ItemSkull.lIIllIIIlllIlI[1];
        "".length();
        if (" ".length() >= (47 + 99 - 88 + 103 ^ 150 + 5 - 58 + 68)) {
            return;
        }
        while (!llIlIllIlllIIlI(lllllllllllllIIlIllIIlIIIIIllIlI, ItemSkull.skullTypes.length)) {
            lllllllllllllIIlIllIIlIIIIIllIII.add(new ItemStack(lllllllllllllIIlIllIIlIIIIIllIIl, ItemSkull.lIIllIIIlllIlI[2], lllllllllllllIIlIllIIlIIIIIllIlI));
            "".length();
            ++lllllllllllllIIlIllIIlIIIIIllIlI;
        }
    }
    
    public ItemSkull() {
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
        this.setMaxDamage(ItemSkull.lIIllIIIlllIlI[1]);
        "".length();
        this.setHasSubtypes((boolean)(ItemSkull.lIIllIIIlllIlI[2] != 0));
        "".length();
    }
    
    private static boolean llIlIllIlllIIII(final int lllllllllllllIIlIllIIIllllIIIIll, final int lllllllllllllIIlIllIIIllllIIIIlI) {
        return lllllllllllllIIlIllIIIllllIIIIll == lllllllllllllIIlIllIIIllllIIIIlI;
    }
    
    private static void llIlIllIllIlIlI() {
        (lIIllIIIlllIIl = new String[ItemSkull.lIIllIIIlllIlI[23]])[ItemSkull.lIIllIIIlllIlI[1]] = llIlIllIllIIlll("4PYfXc2xvlq8K06UT1whOA==", "Nxqim");
        ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[2]] = llIlIllIllIlIII("BHZc4e3GDtQ=", "HBqJZ");
        ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[3]] = llIlIllIllIlIII("3Q6+fvNakQI=", "lnIwq");
        ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[4]] = llIlIllIllIIlll("lgqSRmUP09g=", "AKosm");
        ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[5]] = llIlIllIllIIlll("t4s/wilM1o0=", "JlXML");
        ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[0]] = llIlIllIllIlIIl("GBIPIDQEDhQpKg==", "KyzLX");
        ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[8]] = llIlIllIllIlIIl("OCAgJzwkPDsuIg==", "kKUKP");
        ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[9]] = llIlIllIllIIlll("c0apSzGD+ENAbTJVnIORwQ==", "mtCxx");
        ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[10]] = llIlIllIllIIlll("HgpAWzN1jENAD9vaEZF8pw==", "PhdVk");
        ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[11]] = llIlIllIllIlIIl("Ky48Dx03MicGAw==", "xEIcq");
        ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[7]] = llIlIllIllIlIIl("dg==", "XSROM");
        ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[12]] = llIlIllIllIIlll("D+JDHRW37LIsR78RutpEUQ==", "aqltu");
        ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[13]] = llIlIllIllIlIIl("BS08IWIfMiwgIEIpNS01CSt3Ii0BPA==", "lYYLL");
        ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[14]] = llIlIllIllIlIII("lgCLXPtxaHFUDBzIKby8ow==", "edmkX");
        ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[15]] = llIlIllIllIIlll("mrjYmT2zvi+u2+L1UNjDVQ==", "OqfFJ");
        ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[6]] = llIlIllIllIIlll("HBJEa+IR3cqdxxAX/wkdcA==", "qVQoO");
        ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[16]] = llIlIllIllIIlll("RNFXFD9+BxM=", "VBumt");
        ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[17]] = llIlIllIllIlIII("ds5ZLs1EQK/A1w7pyOjk0y9Pt5bm6/bb", "jOTff");
        ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[18]] = llIlIllIllIIlll("Rko0r9cOSJs=", "FvLqt");
        ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[19]] = llIlIllIllIlIII("ZDxJWX2WXJxqKs+v2NMdOA==", "oKBFk");
        ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[20]] = llIlIllIllIIlll("j2iq3S5cg9zIjg1mmr4H7Q==", "kgxsU");
        ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[21]] = llIlIllIllIlIII("XFIXNjg11ZK7U7SDxtvCEA==", "YGvwV");
        ItemSkull.lIIllIIIlllIIl[ItemSkull.lIIllIIIlllIlI[22]] = llIlIllIllIlIII("nq34HUmIjvAm1zRiUrJBJw==", "YzIQT");
    }
}
