// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.stats.StatList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemWritableBook extends Item
{
    private static final /* synthetic */ String[] llIIllllIIIlIl;
    private static final /* synthetic */ int[] llIIllllIIIlll;
    
    @Override
    public ItemStack onItemRightClick(final ItemStack llllllllllllIllIlllIlllIIIllIlll, final World llllllllllllIllIlllIlllIIIlllIlI, final EntityPlayer llllllllllllIllIlllIlllIIIllIllI) {
        llllllllllllIllIlllIlllIIIllIllI.displayGUIBook(llllllllllllIllIlllIlllIIIllIlll);
        llllllllllllIllIlllIlllIIIllIllI.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
        return llllllllllllIllIlllIlllIIIllIlll;
    }
    
    private static boolean lIIlIIIIIIIIllIl(final Object llllllllllllIllIlllIllIlllllIlll) {
        return llllllllllllIllIlllIllIlllllIlll == null;
    }
    
    private static boolean lIIlIIIIIIIIlllI(final int llllllllllllIllIlllIllIlllllIlIl) {
        return llllllllllllIllIlllIllIlllllIlIl == 0;
    }
    
    private static boolean lIIlIIIIIIIlIIIl(final int llllllllllllIllIlllIllIllllllllI, final int llllllllllllIllIlllIllIlllllllIl) {
        return llllllllllllIllIlllIllIllllllllI < llllllllllllIllIlllIllIlllllllIl;
    }
    
    private static String lIIlIIIIIIIIIllI(String llllllllllllIllIlllIlllIIIIllIlI, final String llllllllllllIllIlllIlllIIIIllIIl) {
        llllllllllllIllIlllIlllIIIIllIlI = new String(Base64.getDecoder().decode(llllllllllllIllIlllIlllIIIIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlllIlllIIIIlllIl = new StringBuilder();
        final char[] llllllllllllIllIlllIlllIIIIlllII = llllllllllllIllIlllIlllIIIIllIIl.toCharArray();
        int llllllllllllIllIlllIlllIIIIllIll = ItemWritableBook.llIIllllIIIlll[1];
        final Exception llllllllllllIllIlllIlllIIIIlIlIl = (Object)llllllllllllIllIlllIlllIIIIllIlI.toCharArray();
        final float llllllllllllIllIlllIlllIIIIlIlII = llllllllllllIllIlllIlllIIIIlIlIl.length;
        String llllllllllllIllIlllIlllIIIIlIIll = (String)ItemWritableBook.llIIllllIIIlll[1];
        while (lIIlIIIIIIIlIIIl((int)llllllllllllIllIlllIlllIIIIlIIll, (int)llllllllllllIllIlllIlllIIIIlIlII)) {
            final char llllllllllllIllIlllIlllIIIlIIIII = llllllllllllIllIlllIlllIIIIlIlIl[llllllllllllIllIlllIlllIIIIlIIll];
            llllllllllllIllIlllIlllIIIIlllIl.append((char)(llllllllllllIllIlllIlllIIIlIIIII ^ llllllllllllIllIlllIlllIIIIlllII[llllllllllllIllIlllIlllIIIIllIll % llllllllllllIllIlllIlllIIIIlllII.length]));
            "".length();
            ++llllllllllllIllIlllIlllIIIIllIll;
            ++llllllllllllIllIlllIlllIIIIlIIll;
            "".length();
            if (((0xA6 ^ 0xC6) & ~(0x55 ^ 0x35)) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlllIlllIIIIlllIl);
    }
    
    private static String lIIlIIIIIIIIIlll(final String llllllllllllIllIlllIlllIIIIIlIlI, final String llllllllllllIllIlllIlllIIIIIIlll) {
        try {
            final SecretKeySpec llllllllllllIllIlllIlllIIIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIlllIIIIIIlll.getBytes(StandardCharsets.UTF_8)), ItemWritableBook.llIIllllIIIlll[3]), "DES");
            final Cipher llllllllllllIllIlllIlllIIIIIllII = Cipher.getInstance("DES");
            llllllllllllIllIlllIlllIIIIIllII.init(ItemWritableBook.llIIllllIIIlll[5], llllllllllllIllIlllIlllIIIIIllIl);
            return new String(llllllllllllIllIlllIlllIIIIIllII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIlllIIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllIlllIIIIIlIll) {
            llllllllllllIllIlllIlllIIIIIlIll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlIIIIIIIIlIII() {
        (llIIllllIIIlIl = new String[ItemWritableBook.llIIllllIIIlll[5]])[ItemWritableBook.llIIllllIIIlll[1]] = lIIlIIIIIIIIIllI("AzUqPRg=", "sTMXk");
        ItemWritableBook.llIIllllIIIlIl[ItemWritableBook.llIIllllIIIlll[0]] = lIIlIIIIIIIIIlll("yFM84tcD1XU=", "lQIah");
    }
    
    public ItemWritableBook() {
        this.setMaxStackSize(ItemWritableBook.llIIllllIIIlll[0]);
        "".length();
    }
    
    public static boolean isNBTValid(final NBTTagCompound llllllllllllIllIlllIlllIIIlIllIl) {
        if (lIIlIIIIIIIIllIl(llllllllllllIllIlllIlllIIIlIllIl)) {
            return ItemWritableBook.llIIllllIIIlll[1] != 0;
        }
        if (lIIlIIIIIIIIlllI(llllllllllllIllIlllIlllIIIlIllIl.hasKey(ItemWritableBook.llIIllllIIIlIl[ItemWritableBook.llIIllllIIIlll[1]], ItemWritableBook.llIIllllIIIlll[2]) ? 1 : 0)) {
            return ItemWritableBook.llIIllllIIIlll[1] != 0;
        }
        final NBTTagList llllllllllllIllIlllIlllIIIllIIII = llllllllllllIllIlllIlllIIIlIllIl.getTagList(ItemWritableBook.llIIllllIIIlIl[ItemWritableBook.llIIllllIIIlll[0]], ItemWritableBook.llIIllllIIIlll[3]);
        int llllllllllllIllIlllIlllIIIlIllll = ItemWritableBook.llIIllllIIIlll[1];
        "".length();
        if ("  ".length() <= ((0x99 ^ 0x8D) & ~(0xB8 ^ 0xAC))) {
            return ((0x2A ^ 0x15) & ~(0xB3 ^ 0x8C)) != 0x0;
        }
        while (!lIIlIIIIIIIlIIII(llllllllllllIllIlllIlllIIIlIllll, llllllllllllIllIlllIlllIIIllIIII.tagCount())) {
            final String llllllllllllIllIlllIlllIIIlIlllI = llllllllllllIllIlllIlllIIIllIIII.getStringTagAt(llllllllllllIllIlllIlllIIIlIllll);
            if (lIIlIIIIIIIIllIl(llllllllllllIllIlllIlllIIIlIlllI)) {
                return ItemWritableBook.llIIllllIIIlll[1] != 0;
            }
            if (lIIlIIIIIIIIllll(llllllllllllIllIlllIlllIIIlIlllI.length(), ItemWritableBook.llIIllllIIIlll[4])) {
                return ItemWritableBook.llIIllllIIIlll[1] != 0;
            }
            ++llllllllllllIllIlllIlllIIIlIllll;
        }
        return ItemWritableBook.llIIllllIIIlll[0] != 0;
    }
    
    private static boolean lIIlIIIIIIIlIIII(final int llllllllllllIllIlllIlllIIIIIIIlI, final int llllllllllllIllIlllIlllIIIIIIIIl) {
        return llllllllllllIllIlllIlllIIIIIIIlI >= llllllllllllIllIlllIlllIIIIIIIIl;
    }
    
    static {
        lIIlIIIIIIIIllII();
        lIIlIIIIIIIIlIII();
    }
    
    private static void lIIlIIIIIIIIllII() {
        (llIIllllIIIlll = new int[6])[0] = " ".length();
        ItemWritableBook.llIIllllIIIlll[1] = ((0x35 ^ 0x4D ^ (0x3 ^ 0x3F)) & (0xB8 ^ 0xA0 ^ (0x58 ^ 0x4) ^ -" ".length()));
        ItemWritableBook.llIIllllIIIlll[2] = (0xAD ^ 0xA4);
        ItemWritableBook.llIIllllIIIlll[3] = (178 + 104 - 229 + 132 ^ 113 + 137 - 141 + 68);
        ItemWritableBook.llIIllllIIIlll[4] = (-" ".length() & (-1 & 0x7FFF));
        ItemWritableBook.llIIllllIIIlll[5] = "  ".length();
    }
    
    private static boolean lIIlIIIIIIIIllll(final int llllllllllllIllIlllIllIllllllIlI, final int llllllllllllIllIlllIllIllllllIIl) {
        return llllllllllllIllIlllIllIllllllIlI > llllllllllllIllIlllIllIllllllIIl;
    }
}
