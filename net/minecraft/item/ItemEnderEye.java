// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.stats.StatList;
import net.minecraft.entity.item.EntityEnderEye;
import net.minecraft.entity.Entity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockEndPortalFrame;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ItemEnderEye extends Item
{
    private static final /* synthetic */ String[] lllIIIllllIIll;
    private static final /* synthetic */ int[] lllIIIlllllIIl;
    
    private static void lIIllllIIllIlIIl() {
        (lllIIIlllllIIl = new int[9])[0] = " ".length();
        ItemEnderEye.lllIIIlllllIIl[1] = "  ".length();
        ItemEnderEye.lllIIIlllllIIl[2] = ((88 + 29 - 72 + 139 ^ 29 + 52 - 43 + 138) & (80 + 102 - 179 + 155 ^ 144 + 40 - 166 + 132 ^ -" ".length()));
        ItemEnderEye.lllIIIlllllIIl[3] = (0x51 ^ 0x48 ^ (0xC8 ^ 0xC1));
        ItemEnderEye.lllIIIlllllIIl[4] = -"  ".length();
        ItemEnderEye.lllIIIlllllIIl[5] = (0xC5 ^ 0xC1);
        ItemEnderEye.lllIIIlllllIIl[6] = "   ".length();
        ItemEnderEye.lllIIIlllllIIl[7] = (-(0xFFFFB776 & 0x588F) & (0xFFFF93FF & 0x7FEF));
        ItemEnderEye.lllIIIlllllIIl[8] = (123 + 109 - 129 + 80 ^ 7 + 67 - 55 + 172);
    }
    
    private static String lIIllllIIlIlllll(String llllllllllllIlIllllllIIlIIIIlIll, final String llllllllllllIlIllllllIIlIIIIlIlI) {
        llllllllllllIlIllllllIIlIIIIlIll = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllllllIIlIIIIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllllllIIlIIIIlllI = new StringBuilder();
        final char[] llllllllllllIlIllllllIIlIIIIllIl = llllllllllllIlIllllllIIlIIIIlIlI.toCharArray();
        int llllllllllllIlIllllllIIlIIIIllII = ItemEnderEye.lllIIIlllllIIl[2];
        final Exception llllllllllllIlIllllllIIlIIIIIllI = (Object)((String)llllllllllllIlIllllllIIlIIIIlIll).toCharArray();
        final boolean llllllllllllIlIllllllIIlIIIIIlIl = llllllllllllIlIllllllIIlIIIIIllI.length != 0;
        double llllllllllllIlIllllllIIlIIIIIlII = ItemEnderEye.lllIIIlllllIIl[2];
        while (lIIllllIIlllIIIl((int)llllllllllllIlIllllllIIlIIIIIlII, llllllllllllIlIllllllIIlIIIIIlIl ? 1 : 0)) {
            final char llllllllllllIlIllllllIIlIIIlIIIl = llllllllllllIlIllllllIIlIIIIIllI[llllllllllllIlIllllllIIlIIIIIlII];
            llllllllllllIlIllllllIIlIIIIlllI.append((char)(llllllllllllIlIllllllIIlIIIlIIIl ^ llllllllllllIlIllllllIIlIIIIllIl[llllllllllllIlIllllllIIlIIIIllII % llllllllllllIlIllllllIIlIIIIllIl.length]));
            "".length();
            ++llllllllllllIlIllllllIIlIIIIllII;
            ++llllllllllllIlIllllllIIlIIIIIlII;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllllllIIlIIIIlllI);
    }
    
    private static String lIIllllIIllIIIII(final String llllllllllllIlIllllllIIlIIlIIIII, final String llllllllllllIlIllllllIIlIIIlllIl) {
        try {
            final SecretKeySpec llllllllllllIlIllllllIIlIIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllllIIlIIIlllIl.getBytes(StandardCharsets.UTF_8)), ItemEnderEye.lllIIIlllllIIl[8]), "DES");
            final Cipher llllllllllllIlIllllllIIlIIlIIIlI = Cipher.getInstance("DES");
            llllllllllllIlIllllllIIlIIlIIIlI.init(ItemEnderEye.lllIIIlllllIIl[1], llllllllllllIlIllllllIIlIIlIIIll);
            return new String(llllllllllllIlIllllllIIlIIlIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllllIIlIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllllIIlIIlIIIIl) {
            llllllllllllIlIllllllIIlIIlIIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean onItemUse(final ItemStack llllllllllllIlIllllllIIlIlIIlllI, final EntityPlayer llllllllllllIlIllllllIIlIlllIIIl, final World llllllllllllIlIllllllIIlIlIIllII, final BlockPos llllllllllllIlIllllllIIlIllIllll, final EnumFacing llllllllllllIlIllllllIIlIlIIlIlI, final float llllllllllllIlIllllllIIlIllIllIl, final float llllllllllllIlIllllllIIlIllIllII, final float llllllllllllIlIllllllIIlIllIlIll) {
        final IBlockState llllllllllllIlIllllllIIlIllIlIlI = llllllllllllIlIllllllIIlIlIIllII.getBlockState(llllllllllllIlIllllllIIlIllIllll);
        if (!lIIllllIIllIlIlI(llllllllllllIlIllllllIIlIlllIIIl.canPlayerEdit(llllllllllllIlIllllllIIlIllIllll.offset(llllllllllllIlIllllllIIlIlIIlIlI), llllllllllllIlIllllllIIlIlIIlIlI, llllllllllllIlIllllllIIlIlIIlllI) ? 1 : 0) || !lIIllllIIllIlIll(llllllllllllIlIllllllIIlIllIlIlI.getBlock(), Blocks.end_portal_frame) || !lIIllllIIllIllII(((boolean)llllllllllllIlIllllllIIlIllIlIlI.getValue((IProperty<Boolean>)BlockEndPortalFrame.EYE)) ? 1 : 0)) {
            return ItemEnderEye.lllIIIlllllIIl[2] != 0;
        }
        if (lIIllllIIllIlIlI(llllllllllllIlIllllllIIlIlIIllII.isRemote ? 1 : 0)) {
            return ItemEnderEye.lllIIIlllllIIl[0] != 0;
        }
        llllllllllllIlIllllllIIlIlIIllII.setBlockState(llllllllllllIlIllllllIIlIllIllll, llllllllllllIlIllllllIIlIllIlIlI.withProperty((IProperty<Comparable>)BlockEndPortalFrame.EYE, (boolean)(ItemEnderEye.lllIIIlllllIIl[0] != 0)), ItemEnderEye.lllIIIlllllIIl[1]);
        "".length();
        llllllllllllIlIllllllIIlIlIIllII.updateComparatorOutputLevel(llllllllllllIlIllllllIIlIllIllll, Blocks.end_portal_frame);
        llllllllllllIlIllllllIIlIlIIlllI.stackSize -= ItemEnderEye.lllIIIlllllIIl[0];
        int llllllllllllIlIllllllIIlIllIlIIl = ItemEnderEye.lllIIIlllllIIl[2];
        "".length();
        if (((65 + 155 - 82 + 112 ^ 175 + 128 - 214 + 89) & (0xB1 ^ 0x81 ^ (0x67 ^ 0x1F) ^ -" ".length())) < 0) {
            return ((0x5B ^ 0x3E ^ (0xD0 ^ 0x87)) & (0x35 ^ 0x2D ^ (0x6F ^ 0x45) ^ -" ".length())) != 0x0;
        }
        while (!lIIllllIIllIllIl(llllllllllllIlIllllllIIlIllIlIIl, ItemEnderEye.lllIIIlllllIIl[3])) {
            final double llllllllllllIlIllllllIIlIllIlIII = llllllllllllIlIllllllIIlIllIllll.getX() + (5.0f + ItemEnderEye.itemRand.nextFloat() * 6.0f) / 16.0f;
            final double llllllllllllIlIllllllIIlIllIIlll = llllllllllllIlIllllllIIlIllIllll.getY() + 0.8125f;
            final double llllllllllllIlIllllllIIlIllIIllI = llllllllllllIlIllllllIIlIllIllll.getZ() + (5.0f + ItemEnderEye.itemRand.nextFloat() * 6.0f) / 16.0f;
            final double llllllllllllIlIllllllIIlIllIIlIl = 0.0;
            final double llllllllllllIlIllllllIIlIllIIlII = 0.0;
            final double llllllllllllIlIllllllIIlIllIIIll = 0.0;
            llllllllllllIlIllllllIIlIlIIllII.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, llllllllllllIlIllllllIIlIllIlIII, llllllllllllIlIllllllIIlIllIIlll, llllllllllllIlIllllllIIlIllIIllI, llllllllllllIlIllllllIIlIllIIlIl, llllllllllllIlIllllllIIlIllIIlII, llllllllllllIlIllllllIIlIllIIIll, new int[ItemEnderEye.lllIIIlllllIIl[2]]);
            ++llllllllllllIlIllllllIIlIllIlIIl;
        }
        final EnumFacing llllllllllllIlIllllllIIlIllIIIlI = llllllllllllIlIllllllIIlIllIlIlI.getValue((IProperty<EnumFacing>)BlockEndPortalFrame.FACING);
        int llllllllllllIlIllllllIIlIllIIIIl = ItemEnderEye.lllIIIlllllIIl[2];
        int llllllllllllIlIllllllIIlIllIIIII = ItemEnderEye.lllIIIlllllIIl[2];
        boolean llllllllllllIlIllllllIIlIlIlllll = ItemEnderEye.lllIIIlllllIIl[2] != 0;
        boolean llllllllllllIlIllllllIIlIlIllllI = ItemEnderEye.lllIIIlllllIIl[0] != 0;
        final EnumFacing llllllllllllIlIllllllIIlIlIlllIl = llllllllllllIlIllllllIIlIllIIIlI.rotateY();
        int llllllllllllIlIllllllIIlIlIlllII = ItemEnderEye.lllIIIlllllIIl[4];
        "".length();
        if (null != null) {
            return ((0xF ^ 0x33) & ~(0x54 ^ 0x68)) != 0x0;
        }
        while (!lIIllllIIllIlllI(llllllllllllIlIllllllIIlIlIlllII, ItemEnderEye.lllIIIlllllIIl[1])) {
            final BlockPos llllllllllllIlIllllllIIlIlIllIll = llllllllllllIlIllllllIIlIllIllll.offset(llllllllllllIlIllllllIIlIlIlllIl, llllllllllllIlIllllllIIlIlIlllII);
            final IBlockState llllllllllllIlIllllllIIlIlIllIlI = llllllllllllIlIllllllIIlIlIIllII.getBlockState(llllllllllllIlIllllllIIlIlIllIll);
            if (lIIllllIIllIlIll(llllllllllllIlIllllllIIlIlIllIlI.getBlock(), Blocks.end_portal_frame)) {
                if (lIIllllIIllIllII(((boolean)llllllllllllIlIllllllIIlIlIllIlI.getValue((IProperty<Boolean>)BlockEndPortalFrame.EYE)) ? 1 : 0)) {
                    llllllllllllIlIllllllIIlIlIllllI = (ItemEnderEye.lllIIIlllllIIl[2] != 0);
                    "".length();
                    if (-" ".length() == (0xB9 ^ 0x94 ^ (0xA1 ^ 0x88))) {
                        return ((0x18 ^ 0x6E ^ (0x4A ^ 0x11)) & (0x5A ^ 0x56 ^ (0x3B ^ 0x1A) ^ -" ".length())) != 0x0;
                    }
                    break;
                }
                else {
                    llllllllllllIlIllllllIIlIllIIIII = llllllllllllIlIllllllIIlIlIlllII;
                    if (lIIllllIIllIllII(llllllllllllIlIllllllIIlIlIlllll ? 1 : 0)) {
                        llllllllllllIlIllllllIIlIllIIIIl = llllllllllllIlIllllllIIlIlIlllII;
                        llllllllllllIlIllllllIIlIlIlllll = (ItemEnderEye.lllIIIlllllIIl[0] != 0);
                    }
                }
            }
            ++llllllllllllIlIllllllIIlIlIlllII;
        }
        if (lIIllllIIllIlIlI(llllllllllllIlIllllllIIlIlIllllI ? 1 : 0) && lIIllllIIllIllll(llllllllllllIlIllllllIIlIllIIIII, llllllllllllIlIllllllIIlIllIIIIl + ItemEnderEye.lllIIIlllllIIl[1])) {
            BlockPos llllllllllllIlIllllllIIlIlIllIIl = llllllllllllIlIllllllIIlIllIllll.offset(llllllllllllIlIllllllIIlIllIIIlI, ItemEnderEye.lllIIIlllllIIl[5]);
            int llllllllllllIlIllllllIIlIlIllIII = llllllllllllIlIllllllIIlIllIIIIl;
            "".length();
            if (" ".length() < " ".length()) {
                return ((0x56 ^ 0x0) & ~(0x93 ^ 0xC5) & ~((0x72 ^ 0x42) & ~(0x26 ^ 0x16))) != 0x0;
            }
            while (!lIIllllIIllIlllI(llllllllllllIlIllllllIIlIlIllIII, llllllllllllIlIllllllIIlIllIIIII)) {
                final BlockPos llllllllllllIlIllllllIIlIlIlIlll = llllllllllllIlIllllllIIlIlIllIIl.offset(llllllllllllIlIllllllIIlIlIlllIl, llllllllllllIlIllllllIIlIlIllIII);
                final IBlockState llllllllllllIlIllllllIIlIlIlIllI = llllllllllllIlIllllllIIlIlIIllII.getBlockState(llllllllllllIlIllllllIIlIlIlIlll);
                if (!lIIllllIIllIlIll(llllllllllllIlIllllllIIlIlIlIllI.getBlock(), Blocks.end_portal_frame) || lIIllllIIllIllII(((boolean)llllllllllllIlIllllllIIlIlIlIllI.getValue((IProperty<Boolean>)BlockEndPortalFrame.EYE)) ? 1 : 0)) {
                    llllllllllllIlIllllllIIlIlIllllI = (ItemEnderEye.lllIIIlllllIIl[2] != 0);
                    "".length();
                    if (null != null) {
                        return ((113 + 22 - 56 + 165 ^ 27 + 35 + 70 + 36) & (0xF7 ^ 0x90 ^ (0x77 ^ 0x4C) ^ -" ".length())) != 0x0;
                    }
                    break;
                }
                else {
                    ++llllllllllllIlIllllllIIlIlIllIII;
                }
            }
            int llllllllllllIlIllllllIIlIlIlIlIl = llllllllllllIlIllllllIIlIllIIIIl - ItemEnderEye.lllIIIlllllIIl[0];
            "".length();
            if ("   ".length() < 0) {
                return ((137 + 164 - 263 + 153 ^ 78 + 9 + 5 + 52) & (0x11 ^ 0x75 ^ (0x31 ^ 0x7A) ^ -" ".length())) != 0x0;
            }
            while (!lIIllllIIllIlllI(llllllllllllIlIllllllIIlIlIlIlIl, llllllllllllIlIllllllIIlIllIIIII + ItemEnderEye.lllIIIlllllIIl[0])) {
                llllllllllllIlIllllllIIlIlIllIIl = llllllllllllIlIllllllIIlIllIllll.offset(llllllllllllIlIllllllIIlIlIlllIl, llllllllllllIlIllllllIIlIlIlIlIl);
                int llllllllllllIlIllllllIIlIlIlIlII = ItemEnderEye.lllIIIlllllIIl[0];
                "".length();
                if ("  ".length() < "  ".length()) {
                    return ((0x7C ^ 0x46) & ~(0x81 ^ 0xBB)) != 0x0;
                }
                while (!lIIllllIIllIlllI(llllllllllllIlIllllllIIlIlIlIlII, ItemEnderEye.lllIIIlllllIIl[6])) {
                    final BlockPos llllllllllllIlIllllllIIlIlIlIIll = llllllllllllIlIllllllIIlIlIllIIl.offset(llllllllllllIlIllllllIIlIllIIIlI, llllllllllllIlIllllllIIlIlIlIlII);
                    final IBlockState llllllllllllIlIllllllIIlIlIlIIlI = llllllllllllIlIllllllIIlIlIIllII.getBlockState(llllllllllllIlIllllllIIlIlIlIIll);
                    if (!lIIllllIIllIlIll(llllllllllllIlIllllllIIlIlIlIIlI.getBlock(), Blocks.end_portal_frame) || lIIllllIIllIllII(((boolean)llllllllllllIlIllllllIIlIlIlIIlI.getValue((IProperty<Boolean>)BlockEndPortalFrame.EYE)) ? 1 : 0)) {
                        llllllllllllIlIllllllIIlIlIllllI = (ItemEnderEye.lllIIIlllllIIl[2] != 0);
                        "".length();
                        if (-" ".length() > "   ".length()) {
                            return ((0xC9 ^ 0xC5) & ~(0xA5 ^ 0xA9)) != 0x0;
                        }
                        break;
                    }
                    else {
                        ++llllllllllllIlIllllllIIlIlIlIlII;
                    }
                }
                llllllllllllIlIllllllIIlIlIlIlIl += 4;
            }
            if (lIIllllIIllIlIlI(llllllllllllIlIllllllIIlIlIllllI ? 1 : 0)) {
                int llllllllllllIlIllllllIIlIlIlIIIl = llllllllllllIlIllllllIIlIllIIIIl;
                "".length();
                if (-" ".length() == ((0x3D ^ 0x44 ^ (0xE7 ^ 0xA4)) & (0x9D ^ 0xB6 ^ (0x64 ^ 0x75) ^ -" ".length()))) {
                    return ((0xFB ^ 0xAF ^ (0x1A ^ 0x50)) & (0xFA ^ 0xA6 ^ (0xF5 ^ 0xB7) ^ -" ".length())) != 0x0;
                }
                while (!lIIllllIIllIlllI(llllllllllllIlIllllllIIlIlIlIIIl, llllllllllllIlIllllllIIlIllIIIII)) {
                    llllllllllllIlIllllllIIlIlIllIIl = llllllllllllIlIllllllIIlIllIllll.offset(llllllllllllIlIllllllIIlIlIlllIl, llllllllllllIlIllllllIIlIlIlIIIl);
                    int llllllllllllIlIllllllIIlIlIlIIII = ItemEnderEye.lllIIIlllllIIl[0];
                    "".length();
                    if (null != null) {
                        return ((80 + 86 - 165 + 245 ^ 89 + 1 + 32 + 38) & (0xBF ^ 0x92 ^ (0xD5 ^ 0xAE) ^ -" ".length())) != 0x0;
                    }
                    while (!lIIllllIIllIlllI(llllllllllllIlIllllllIIlIlIlIIII, ItemEnderEye.lllIIIlllllIIl[6])) {
                        final BlockPos llllllllllllIlIllllllIIlIlIIllll = llllllllllllIlIllllllIIlIlIllIIl.offset(llllllllllllIlIllllllIIlIllIIIlI, llllllllllllIlIllllllIIlIlIlIIII);
                        llllllllllllIlIllllllIIlIlIIllII.setBlockState(llllllllllllIlIllllllIIlIlIIllll, Blocks.end_portal.getDefaultState(), ItemEnderEye.lllIIIlllllIIl[1]);
                        "".length();
                        ++llllllllllllIlIllllllIIlIlIlIIII;
                    }
                    ++llllllllllllIlIllllllIIlIlIlIIIl;
                }
            }
        }
        return ItemEnderEye.lllIIIlllllIIl[0] != 0;
    }
    
    private static boolean lIIllllIIllIlIlI(final int llllllllllllIlIllllllIIIlllIlIll) {
        return llllllllllllIlIllllllIIIlllIlIll != 0;
    }
    
    private static boolean lIIllllIIllIlllI(final int llllllllllllIlIllllllIIIllllIlII, final int llllllllllllIlIllllllIIIllllIIll) {
        return llllllllllllIlIllllllIIIllllIlII > llllllllllllIlIllllllIIIllllIIll;
    }
    
    private static boolean lIIllllIIllIlIll(final Object llllllllllllIlIllllllIIIllllIIII, final Object llllllllllllIlIllllllIIIlllIllll) {
        return llllllllllllIlIllllllIIIllllIIII == llllllllllllIlIllllllIIIlllIllll;
    }
    
    private static boolean lIIllllIIlllIIII(final Object llllllllllllIlIllllllIIIlllIllIl) {
        return llllllllllllIlIllllllIIIlllIllIl != null;
    }
    
    private static boolean lIIllllIIllIllII(final int llllllllllllIlIllllllIIIlllIlIIl) {
        return llllllllllllIlIllllllIIIlllIlIIl == 0;
    }
    
    private static boolean lIIllllIIlllIIIl(final int llllllllllllIlIllllllIIIlllllIII, final int llllllllllllIlIllllllIIIllllIlll) {
        return llllllllllllIlIllllllIIIlllllIII < llllllllllllIlIllllllIIIllllIlll;
    }
    
    @Override
    public ItemStack onItemRightClick(final ItemStack llllllllllllIlIllllllIIlIIllIlII, final World llllllllllllIlIllllllIIlIIllIIll, final EntityPlayer llllllllllllIlIllllllIIlIIlIlIll) {
        final MovingObjectPosition llllllllllllIlIllllllIIlIIllIIIl = this.getMovingObjectPositionFromPlayer(llllllllllllIlIllllllIIlIIllIIll, llllllllllllIlIllllllIIlIIlIlIll, (boolean)(ItemEnderEye.lllIIIlllllIIl[2] != 0));
        if (lIIllllIIlllIIII(llllllllllllIlIllllllIIlIIllIIIl) && lIIllllIIllIlIll(llllllllllllIlIllllllIIlIIllIIIl.typeOfHit, MovingObjectPosition.MovingObjectType.BLOCK) && lIIllllIIllIlIll(llllllllllllIlIllllllIIlIIllIIll.getBlockState(llllllllllllIlIllllllIIlIIllIIIl.getBlockPos()).getBlock(), Blocks.end_portal_frame)) {
            return llllllllllllIlIllllllIIlIIllIlII;
        }
        if (lIIllllIIllIllII(llllllllllllIlIllllllIIlIIllIIll.isRemote ? 1 : 0)) {
            final BlockPos llllllllllllIlIllllllIIlIIllIIII = llllllllllllIlIllllllIIlIIllIIll.getStrongholdPos(ItemEnderEye.lllIIIllllIIll[ItemEnderEye.lllIIIlllllIIl[2]], new BlockPos(llllllllllllIlIllllllIIlIIlIlIll));
            if (lIIllllIIlllIIII(llllllllllllIlIllllllIIlIIllIIII)) {
                final EntityEnderEye llllllllllllIlIllllllIIlIIlIllll = new EntityEnderEye(llllllllllllIlIllllllIIlIIllIIll, llllllllllllIlIllllllIIlIIlIlIll.posX, llllllllllllIlIllllllIIlIIlIlIll.posY, llllllllllllIlIllllllIIlIIlIlIll.posZ);
                llllllllllllIlIllllllIIlIIlIllll.moveTowards(llllllllllllIlIllllllIIlIIllIIII);
                llllllllllllIlIllllllIIlIIllIIll.spawnEntityInWorld(llllllllllllIlIllllllIIlIIlIllll);
                "".length();
                llllllllllllIlIllllllIIlIIllIIll.playSoundAtEntity(llllllllllllIlIllllllIIlIIlIlIll, ItemEnderEye.lllIIIllllIIll[ItemEnderEye.lllIIIlllllIIl[0]], 0.5f, 0.4f / (ItemEnderEye.itemRand.nextFloat() * 0.4f + 0.8f));
                llllllllllllIlIllllllIIlIIllIIll.playAuxSFXAtEntity(null, ItemEnderEye.lllIIIlllllIIl[7], new BlockPos(llllllllllllIlIllllllIIlIIlIlIll), ItemEnderEye.lllIIIlllllIIl[2]);
                if (lIIllllIIllIllII(llllllllllllIlIllllllIIlIIlIlIll.capabilities.isCreativeMode ? 1 : 0)) {
                    llllllllllllIlIllllllIIlIIllIlII.stackSize -= ItemEnderEye.lllIIIlllllIIl[0];
                }
                llllllllllllIlIllllllIIlIIlIlIll.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
            }
        }
        return llllllllllllIlIllllllIIlIIllIlII;
    }
    
    private static void lIIllllIIllIIIlI() {
        (lllIIIllllIIll = new String[ItemEnderEye.lllIIIlllllIIl[1]])[ItemEnderEye.lllIIIlllllIIl[2]] = lIIllllIIlIlllll("Ox8xAy8PAywAJQ==", "hkClA");
        ItemEnderEye.lllIIIllllIIll[ItemEnderEye.lllIIIlllllIIl[0]] = lIIllllIIllIIIII("VXM8yj2kVJw3oE1SG9apgQ==", "OPKYc");
    }
    
    private static boolean lIIllllIIllIllll(final int llllllllllllIlIllllllIIlIIIIIIII, final int llllllllllllIlIllllllIIIllllllll) {
        return llllllllllllIlIllllllIIlIIIIIIII == llllllllllllIlIllllllIIIllllllll;
    }
    
    private static boolean lIIllllIIllIllIl(final int llllllllllllIlIllllllIIIllllllII, final int llllllllllllIlIllllllIIIlllllIll) {
        return llllllllllllIlIllllllIIIllllllII >= llllllllllllIlIllllllIIIlllllIll;
    }
    
    static {
        lIIllllIIllIlIIl();
        lIIllllIIllIIIlI();
    }
    
    public ItemEnderEye() {
        this.setCreativeTab(CreativeTabs.tabMisc);
        "".length();
    }
}
