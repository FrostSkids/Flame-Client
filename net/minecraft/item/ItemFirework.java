// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Collection;
import com.google.common.collect.Lists;
import net.minecraft.util.StatCollector;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityFireworkRocket;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ItemFirework extends Item
{
    private static final /* synthetic */ int[] lIlllllIlllIIl;
    private static final /* synthetic */ String[] lIlllllIllIlIl;
    
    private static void lIIIIlIllIIlIlIl() {
        (lIlllllIlllIIl = new int[11])[0] = " ".length();
        ItemFirework.lIlllllIlllIIl[1] = ((106 + 80 - 115 + 67 ^ 157 + 40 - 135 + 125) & (0x85 ^ 0xBE ^ (0x42 ^ 0x48) ^ -" ".length()));
        ItemFirework.lIlllllIlllIIl[2] = (0x3B ^ 0x58);
        ItemFirework.lIlllllIlllIIl[3] = "  ".length();
        ItemFirework.lIlllllIlllIIl[4] = "   ".length();
        ItemFirework.lIlllllIlllIIl[5] = (0x2B ^ 0x2F);
        ItemFirework.lIlllllIlllIIl[6] = (0x81 ^ 0x84);
        ItemFirework.lIlllllIlllIIl[7] = (0xD0 ^ 0xC2 ^ (0x5 ^ 0x1D));
        ItemFirework.lIlllllIlllIIl[8] = (0x72 ^ 0x43 ^ (0x74 ^ 0x43));
        ItemFirework.lIlllllIlllIIl[9] = (0x68 ^ 0x29 ^ (0x19 ^ 0x5F));
        ItemFirework.lIlllllIlllIIl[10] = (0xD4 ^ 0xAC ^ (0x63 ^ 0x13));
    }
    
    private static String lIIIIlIllIIIllll(String llllllllllllIllllIIlIlllIIIlIllI, final String llllllllllllIllllIIlIlllIIIllIlI) {
        llllllllllllIllllIIlIlllIIIlIllI = (byte)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIIlIlllIIIlIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIIlIlllIIIllIIl = new StringBuilder();
        final char[] llllllllllllIllllIIlIlllIIIllIII = llllllllllllIllllIIlIlllIIIllIlI.toCharArray();
        int llllllllllllIllllIIlIlllIIIlIlll = ItemFirework.lIlllllIlllIIl[1];
        final byte llllllllllllIllllIIlIlllIIIlIIIl = (Object)((String)llllllllllllIllllIIlIlllIIIlIllI).toCharArray();
        final short llllllllllllIllllIIlIlllIIIlIIII = (short)llllllllllllIllllIIlIlllIIIlIIIl.length;
        int llllllllllllIllllIIlIlllIIIIllll = ItemFirework.lIlllllIlllIIl[1];
        while (lIIIIlIllIIllIll(llllllllllllIllllIIlIlllIIIIllll, llllllllllllIllllIIlIlllIIIlIIII)) {
            final char llllllllllllIllllIIlIlllIIIlllII = llllllllllllIllllIIlIlllIIIlIIIl[llllllllllllIllllIIlIlllIIIIllll];
            llllllllllllIllllIIlIlllIIIllIIl.append((char)(llllllllllllIllllIIlIlllIIIlllII ^ llllllllllllIllllIIlIlllIIIllIII[llllllllllllIllllIIlIlllIIIlIlll % llllllllllllIllllIIlIlllIIIllIII.length]));
            "".length();
            ++llllllllllllIllllIIlIlllIIIlIlll;
            ++llllllllllllIllllIIlIlllIIIIllll;
            "".length();
            if ((0x2D ^ 0x26 ^ (0xCB ^ 0xC4)) < " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIIlIlllIIIllIIl);
    }
    
    private static boolean lIIIIlIllIIllIIl(final int llllllllllllIllllIIlIllIllllIIIl) {
        return llllllllllllIllllIIlIllIllllIIIl > 0;
    }
    
    @Override
    public boolean onItemUse(final ItemStack llllllllllllIllllIIlIlllIlIllllI, final EntityPlayer llllllllllllIllllIIlIlllIlIlllIl, final World llllllllllllIllllIIlIlllIlIlllII, final BlockPos llllllllllllIllllIIlIlllIlIlIIlI, final EnumFacing llllllllllllIllllIIlIlllIlIllIlI, final float llllllllllllIllllIIlIlllIlIllIIl, final float llllllllllllIllllIIlIlllIlIllIII, final float llllllllllllIllllIIlIlllIlIlIlll) {
        if (lIIIIlIllIIlIllI(llllllllllllIllllIIlIlllIlIlllII.isRemote ? 1 : 0)) {
            final EntityFireworkRocket llllllllllllIllllIIlIlllIlIlIllI = new EntityFireworkRocket(llllllllllllIllllIIlIlllIlIlllII, llllllllllllIllllIIlIlllIlIlIIlI.getX() + llllllllllllIllllIIlIlllIlIllIIl, llllllllllllIllllIIlIlllIlIlIIlI.getY() + llllllllllllIllllIIlIlllIlIllIII, llllllllllllIllllIIlIlllIlIlIIlI.getZ() + llllllllllllIllllIIlIlllIlIlIlll, llllllllllllIllllIIlIlllIlIllllI);
            llllllllllllIllllIIlIlllIlIlllII.spawnEntityInWorld(llllllllllllIllllIIlIlllIlIlIllI);
            "".length();
            if (lIIIIlIllIIlIllI(llllllllllllIllllIIlIlllIlIlllIl.capabilities.isCreativeMode ? 1 : 0)) {
                llllllllllllIllllIIlIlllIlIllllI.stackSize -= ItemFirework.lIlllllIlllIIl[0];
            }
            return ItemFirework.lIlllllIlllIIl[0] != 0;
        }
        return ItemFirework.lIlllllIlllIIl[1] != 0;
    }
    
    private static void lIIIIlIllIIlIIIl() {
        (lIlllllIllIlIl = new String[ItemFirework.lIlllllIlllIIl[9]])[ItemFirework.lIlllllIlllIIl[1]] = lIIIIlIllIIIlIll("bOipvnf8fYhoM7atOZfAag==", "BQXVY");
        ItemFirework.lIlllllIllIlIl[ItemFirework.lIlllllIlllIIl[0]] = lIIIIlIllIIIlIll("z07Nn87IYFU=", "OzllA");
        ItemFirework.lIlllllIllIlIl[ItemFirework.lIlllllIlllIIl[3]] = lIIIIlIllIIIlIll("nfu08wBKovAws4JMy9SbaI2kkORsNBna", "XUuxQ");
        ItemFirework.lIlllllIllIlIl[ItemFirework.lIlllllIlllIIl[4]] = lIIIIlIllIIIllll("cw==", "Sptri");
        ItemFirework.lIlllllIllIlIl[ItemFirework.lIlllllIlllIIl[5]] = lIIIIlIllIIIllll("CigfETg4", "LDvvP");
        ItemFirework.lIlllllIllIlIl[ItemFirework.lIlllllIlllIIl[6]] = lIIIIlIllIIIlIll("CazGOwHe/sXmjRD1RGRoDQ==", "xTLFI");
        ItemFirework.lIlllllIllIlIl[ItemFirework.lIlllllIlllIIl[8]] = lIIIIlIllIIlIIII("XtpMcMWhYrU=", "eFIDf");
    }
    
    private static boolean lIIIIlIllIIllIlI(final int llllllllllllIllllIIlIllIlllllllI, final int llllllllllllIllllIIlIllIllllllIl) {
        return llllllllllllIllllIIlIllIlllllllI >= llllllllllllIllllIIlIllIllllllIl;
    }
    
    static {
        lIIIIlIllIIlIlIl();
        lIIIIlIllIIlIIIl();
    }
    
    private static boolean lIIIIlIllIIllIll(final int llllllllllllIllllIIlIllIlllllIlI, final int llllllllllllIllllIIlIllIlllllIIl) {
        return llllllllllllIllllIIlIllIlllllIlI < llllllllllllIllllIIlIllIlllllIIl;
    }
    
    @Override
    public void addInformation(final ItemStack llllllllllllIllllIIlIlllIIlllIlI, final EntityPlayer llllllllllllIllllIIlIlllIlIIIIll, final List<String> llllllllllllIllllIIlIlllIlIIIIlI, final boolean llllllllllllIllllIIlIlllIlIIIIIl) {
        if (lIIIIlIllIIlIlll(llllllllllllIllllIIlIlllIIlllIlI.hasTagCompound() ? 1 : 0)) {
            final NBTTagCompound llllllllllllIllllIIlIlllIlIIIIII = llllllllllllIllllIIlIlllIIlllIlI.getTagCompound().getCompoundTag(ItemFirework.lIlllllIllIlIl[ItemFirework.lIlllllIlllIIl[1]]);
            if (lIIIIlIllIIllIII(llllllllllllIllllIIlIlllIlIIIIII)) {
                if (lIIIIlIllIIlIlll(llllllllllllIllllIIlIlllIlIIIIII.hasKey(ItemFirework.lIlllllIllIlIl[ItemFirework.lIlllllIlllIIl[0]], ItemFirework.lIlllllIlllIIl[2]) ? 1 : 0)) {
                    llllllllllllIllllIIlIlllIlIIIIlI.add(String.valueOf(new StringBuilder(String.valueOf(StatCollector.translateToLocal(ItemFirework.lIlllllIllIlIl[ItemFirework.lIlllllIlllIIl[3]]))).append(ItemFirework.lIlllllIllIlIl[ItemFirework.lIlllllIlllIIl[4]]).append(llllllllllllIllllIIlIlllIlIIIIII.getByte(ItemFirework.lIlllllIllIlIl[ItemFirework.lIlllllIlllIIl[5]]))));
                    "".length();
                }
                final NBTTagList llllllllllllIllllIIlIlllIIllllll = llllllllllllIllllIIlIlllIlIIIIII.getTagList(ItemFirework.lIlllllIllIlIl[ItemFirework.lIlllllIlllIIl[6]], ItemFirework.lIlllllIlllIIl[7]);
                if (lIIIIlIllIIllIII(llllllllllllIllllIIlIlllIIllllll) && lIIIIlIllIIllIIl(llllllllllllIllllIIlIlllIIllllll.tagCount())) {
                    int llllllllllllIllllIIlIlllIIlllllI = ItemFirework.lIlllllIlllIIl[1];
                    "".length();
                    if ("  ".length() <= -" ".length()) {
                        return;
                    }
                    while (!lIIIIlIllIIllIlI(llllllllllllIllllIIlIlllIIlllllI, llllllllllllIllllIIlIlllIIllllll.tagCount())) {
                        final NBTTagCompound llllllllllllIllllIIlIlllIIllllIl = llllllllllllIllllIIlIlllIIllllll.getCompoundTagAt(llllllllllllIllllIIlIlllIIlllllI);
                        final List<String> llllllllllllIllllIIlIlllIIllllII = (List<String>)Lists.newArrayList();
                        ItemFireworkCharge.addExplosionInfo(llllllllllllIllllIIlIlllIIllllIl, llllllllllllIllllIIlIlllIIllllII);
                        if (lIIIIlIllIIllIIl(llllllllllllIllllIIlIlllIIllllII.size())) {
                            int llllllllllllIllllIIlIlllIIlllIll = ItemFirework.lIlllllIlllIIl[0];
                            "".length();
                            if ("  ".length() <= 0) {
                                return;
                            }
                            while (!lIIIIlIllIIllIlI(llllllllllllIllllIIlIlllIIlllIll, llllllllllllIllllIIlIlllIIllllII.size())) {
                                llllllllllllIllllIIlIlllIIllllII.set(llllllllllllIllllIIlIlllIIlllIll, String.valueOf(new StringBuilder(ItemFirework.lIlllllIllIlIl[ItemFirework.lIlllllIlllIIl[8]]).append(llllllllllllIllllIIlIlllIIllllII.get(llllllllllllIllllIIlIlllIIlllIll))));
                                "".length();
                                ++llllllllllllIllllIIlIlllIIlllIll;
                            }
                            llllllllllllIllllIIlIlllIlIIIIlI.addAll(llllllllllllIllllIIlIlllIIllllII);
                            "".length();
                        }
                        ++llllllllllllIllllIIlIlllIIlllllI;
                    }
                }
            }
        }
    }
    
    private static boolean lIIIIlIllIIlIllI(final int llllllllllllIllllIIlIllIllllIIll) {
        return llllllllllllIllllIIlIllIllllIIll == 0;
    }
    
    private static String lIIIIlIllIIIlIll(final String llllllllllllIllllIIlIlllIIlIlIIl, final String llllllllllllIllllIIlIlllIIlIlIII) {
        try {
            final SecretKeySpec llllllllllllIllllIIlIlllIIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlIlllIIlIlIII.getBytes(StandardCharsets.UTF_8)), ItemFirework.lIlllllIlllIIl[10]), "DES");
            final Cipher llllllllllllIllllIIlIlllIIlIllIl = Cipher.getInstance("DES");
            llllllllllllIllllIIlIlllIIlIllIl.init(ItemFirework.lIlllllIlllIIl[3], llllllllllllIllllIIlIlllIIlIlllI);
            return new String(llllllllllllIllllIIlIlllIIlIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlIlllIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIlIlllIIlIllII) {
            llllllllllllIllllIIlIlllIIlIllII.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIIlIllIIlIIII(final String llllllllllllIllllIIlIlllIIIIIllI, final String llllllllllllIllllIIlIlllIIIIIlIl) {
        try {
            final SecretKeySpec llllllllllllIllllIIlIlllIIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlIlllIIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIlIlllIIIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIlIlllIIIIlIII.init(ItemFirework.lIlllllIlllIIl[3], llllllllllllIllllIIlIlllIIIIlIIl);
            return new String(llllllllllllIllllIIlIlllIIIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlIlllIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIlIlllIIIIIlll) {
            llllllllllllIllllIIlIlllIIIIIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIlIllIIllIII(final Object llllllllllllIllllIIlIllIllllIlll) {
        return llllllllllllIllllIIlIllIllllIlll != null;
    }
    
    private static boolean lIIIIlIllIIlIlll(final int llllllllllllIllllIIlIllIllllIlIl) {
        return llllllllllllIllllIIlIllIllllIlIl != 0;
    }
}
