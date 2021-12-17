// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.village;

import net.minecraft.nbt.NBTUtil;
import net.minecraft.nbt.NBTBase;
import java.io.IOException;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;

public class MerchantRecipeList extends ArrayList<MerchantRecipe>
{
    private static final /* synthetic */ int[] lIIIlllIIIIlIl;
    private static final /* synthetic */ String[] lIIIlllIIIIIll;
    
    private static String llIIIlIllIIIIIl(final String lllllllllllllIIllllllIIIllllllIl, final String lllllllllllllIIllllllIIIllllllII) {
        try {
            final SecretKeySpec lllllllllllllIIllllllIIlIIIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllllIIIllllllII.getBytes(StandardCharsets.UTF_8)), MerchantRecipeList.lIIIlllIIIIlIl[5]), "DES");
            final Cipher lllllllllllllIIllllllIIlIIIIIIIl = Cipher.getInstance("DES");
            lllllllllllllIIllllllIIlIIIIIIIl.init(MerchantRecipeList.lIIIlllIIIIlIl[4], lllllllllllllIIllllllIIlIIIIIIlI);
            return new String(lllllllllllllIIllllllIIlIIIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllllIIIllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllllIIlIIIIIIII) {
            lllllllllllllIIllllllIIlIIIIIIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIIlIllIIlIlI(final int lllllllllllllIIllllllIIIllllIlll, final int lllllllllllllIIllllllIIIllllIllI) {
        return lllllllllllllIIllllllIIIllllIlll >= lllllllllllllIIllllllIIIllllIllI;
    }
    
    private static boolean llIIIlIllIIllII(final Object lllllllllllllIIllllllIIIllllIIII) {
        return lllllllllllllIIllllllIIIllllIIII != null;
    }
    
    public void readRecipiesFromTags(final NBTTagCompound lllllllllllllIIllllllIIlIIlIlIll) {
        final NBTTagList lllllllllllllIIllllllIIlIIlIlIlI = lllllllllllllIIllllllIIlIIlIlIll.getTagList(MerchantRecipeList.lIIIlllIIIIIll[MerchantRecipeList.lIIIlllIIIIlIl[0]], MerchantRecipeList.lIIIlllIIIIlIl[3]);
        int lllllllllllllIIllllllIIlIIlIlIIl = MerchantRecipeList.lIIIlllIIIIlIl[0];
        "".length();
        if ((58 + 15 - 20 + 135 ^ 33 + 63 + 26 + 62) < 0) {
            return;
        }
        while (!llIIIlIllIIlIlI(lllllllllllllIIllllllIIlIIlIlIIl, lllllllllllllIIllllllIIlIIlIlIlI.tagCount())) {
            final NBTTagCompound lllllllllllllIIllllllIIlIIlIlIII = lllllllllllllIIllllllIIlIIlIlIlI.getCompoundTagAt(lllllllllllllIIllllllIIlIIlIlIIl);
            this.add(new MerchantRecipe(lllllllllllllIIllllllIIlIIlIlIII));
            "".length();
            ++lllllllllllllIIllllllIIlIIlIlIIl;
        }
    }
    
    private static void llIIIlIllIIIIll() {
        (lIIIlllIIIIIll = new String[MerchantRecipeList.lIIIlllIIIIlIl[4]])[MerchantRecipeList.lIIIlllIIIIlIl[0]] = llIIIlIllIIIIIl("GoUbE00DS7s=", "hUvJi");
        MerchantRecipeList.lIIIlllIIIIIll[MerchantRecipeList.lIIIlllIIIIlIl[1]] = llIIIlIllIIIIlI("2uVpjqFRP28=", "QPmWP");
    }
    
    private static boolean llIIIlIllIIlIIl(final Object lllllllllllllIIllllllIIIlllIlllI) {
        return lllllllllllllIIllllllIIIlllIlllI == null;
    }
    
    public static MerchantRecipeList readFromBuf(final PacketBuffer lllllllllllllIIllllllIIlIIllllII) throws IOException {
        final MerchantRecipeList lllllllllllllIIllllllIIlIlIIIllI = new MerchantRecipeList();
        final int lllllllllllllIIllllllIIlIlIIIlIl = lllllllllllllIIllllllIIlIIllllII.readByte() & MerchantRecipeList.lIIIlllIIIIlIl[2];
        int lllllllllllllIIllllllIIlIlIIIlII = MerchantRecipeList.lIIIlllIIIIlIl[0];
        "".length();
        if (" ".length() >= "  ".length()) {
            return null;
        }
        while (!llIIIlIllIIlIlI(lllllllllllllIIllllllIIlIlIIIlII, lllllllllllllIIllllllIIlIlIIIlIl)) {
            final ItemStack lllllllllllllIIllllllIIlIlIIIIll = lllllllllllllIIllllllIIlIIllllII.readItemStackFromBuffer();
            final ItemStack lllllllllllllIIllllllIIlIlIIIIlI = lllllllllllllIIllllllIIlIIllllII.readItemStackFromBuffer();
            ItemStack lllllllllllllIIllllllIIlIlIIIIIl = null;
            if (llIIIlIllIIIlll(lllllllllllllIIllllllIIlIIllllII.readBoolean() ? 1 : 0)) {
                lllllllllllllIIllllllIIlIlIIIIIl = lllllllllllllIIllllllIIlIIllllII.readItemStackFromBuffer();
            }
            final boolean lllllllllllllIIllllllIIlIlIIIIII = lllllllllllllIIllllllIIlIIllllII.readBoolean();
            final int lllllllllllllIIllllllIIlIIllllll = lllllllllllllIIllllllIIlIIllllII.readInt();
            final int lllllllllllllIIllllllIIlIIlllllI = lllllllllllllIIllllllIIlIIllllII.readInt();
            final MerchantRecipe lllllllllllllIIllllllIIlIIllllIl = new MerchantRecipe(lllllllllllllIIllllllIIlIlIIIIll, lllllllllllllIIllllllIIlIlIIIIIl, lllllllllllllIIllllllIIlIlIIIIlI, lllllllllllllIIllllllIIlIIllllll, lllllllllllllIIllllllIIlIIlllllI);
            if (llIIIlIllIIIlll(lllllllllllllIIllllllIIlIlIIIIII ? 1 : 0)) {
                lllllllllllllIIllllllIIlIIllllIl.compensateToolUses();
            }
            lllllllllllllIIllllllIIlIlIIIllI.add(lllllllllllllIIllllllIIlIIllllIl);
            "".length();
            ++lllllllllllllIIllllllIIlIlIIIlII;
        }
        return lllllllllllllIIllllllIIlIlIIIllI;
    }
    
    private static void llIIIlIllIIIlII() {
        (lIIIlllIIIIlIl = new int[6])[0] = ((0x80 ^ 0xB4) & ~(0xF5 ^ 0xC1));
        MerchantRecipeList.lIIIlllIIIIlIl[1] = " ".length();
        MerchantRecipeList.lIIIlllIIIIlIl[2] = 141 + 24 + 20 + 70;
        MerchantRecipeList.lIIIlllIIIIlIl[3] = (133 + 84 - 151 + 115 ^ 72 + 25 - 79 + 173);
        MerchantRecipeList.lIIIlllIIIIlIl[4] = "  ".length();
        MerchantRecipeList.lIIIlllIIIIlIl[5] = (7 + 21 + 67 + 71 ^ 111 + 84 - 153 + 132);
    }
    
    private static boolean llIIIlIllIIIlll(final int lllllllllllllIIllllllIIIlllIllII) {
        return lllllllllllllIIllllllIIIlllIllII != 0;
    }
    
    private static boolean llIIIlIllIIlIll(final int lllllllllllllIIllllllIIIlllIlIlI) {
        return lllllllllllllIIllllllIIIlllIlIlI == 0;
    }
    
    private static String llIIIlIllIIIIlI(final String lllllllllllllIIllllllIIlIIIIllII, final String lllllllllllllIIllllllIIlIIIIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIIllllllIIlIIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllllIIlIIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllllIIlIIIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllllIIlIIIIlllI.init(MerchantRecipeList.lIIIlllIIIIlIl[4], lllllllllllllIIllllllIIlIIIIllll);
            return new String(lllllllllllllIIllllllIIlIIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllllIIlIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllllIIlIIIIllIl) {
            lllllllllllllIIllllllIIlIIIIllIl.printStackTrace();
            return null;
        }
    }
    
    public MerchantRecipeList() {
    }
    
    public NBTTagCompound getRecipiesAsTags() {
        final NBTTagCompound lllllllllllllIIllllllIIlIIIlllII = new NBTTagCompound();
        final NBTTagList lllllllllllllIIllllllIIlIIIllIll = new NBTTagList();
        int lllllllllllllIIllllllIIlIIIllIlI = MerchantRecipeList.lIIIlllIIIIlIl[0];
        "".length();
        if ((0x15 ^ 0x10) <= 0) {
            return null;
        }
        while (!llIIIlIllIIlIlI(lllllllllllllIIllllllIIlIIIllIlI, this.size())) {
            final MerchantRecipe lllllllllllllIIllllllIIlIIIllIIl = this.get(lllllllllllllIIllllllIIlIIIllIlI);
            lllllllllllllIIllllllIIlIIIllIll.appendTag(lllllllllllllIIllllllIIlIIIllIIl.writeToTags());
            ++lllllllllllllIIllllllIIlIIIllIlI;
        }
        lllllllllllllIIllllllIIlIIIlllII.setTag(MerchantRecipeList.lIIIlllIIIIIll[MerchantRecipeList.lIIIlllIIIIlIl[1]], lllllllllllllIIllllllIIlIIIllIll);
        return lllllllllllllIIllllllIIlIIIlllII;
    }
    
    private static boolean llIIIlIllIIIlIl(final int lllllllllllllIIllllllIIIlllIlIII) {
        return lllllllllllllIIllllllIIIlllIlIII > 0;
    }
    
    public MerchantRecipe canRecipeBeUsed(final ItemStack lllllllllllllIIllllllIIlIllIllIl, final ItemStack lllllllllllllIIllllllIIlIllIllII, final int lllllllllllllIIllllllIIlIlllIIlI) {
        if (llIIIlIllIIIlIl(lllllllllllllIIllllllIIlIlllIIlI) && llIIIlIllIIIllI(lllllllllllllIIllllllIIlIlllIIlI, this.size())) {
            final MerchantRecipe lllllllllllllIIllllllIIlIlllIIIl = this.get(lllllllllllllIIllllllIIlIlllIIlI);
            MerchantRecipe merchantRecipe;
            if (!llIIIlIllIIIlll(this.func_181078_a(lllllllllllllIIllllllIIlIllIllIl, lllllllllllllIIllllllIIlIlllIIIl.getItemToBuy()) ? 1 : 0) || ((!llIIIlIllIIlIIl(lllllllllllllIIllllllIIlIllIllII) || llIIIlIllIIIlll(lllllllllllllIIllllllIIlIlllIIIl.hasSecondItemToBuy() ? 1 : 0)) && (!llIIIlIllIIIlll(lllllllllllllIIllllllIIlIlllIIIl.hasSecondItemToBuy() ? 1 : 0) || !llIIIlIllIIIlll(this.func_181078_a(lllllllllllllIIllllllIIlIllIllII, lllllllllllllIIllllllIIlIlllIIIl.getSecondItemToBuy()) ? 1 : 0))) || !llIIIlIllIIlIlI(lllllllllllllIIllllllIIlIllIllIl.stackSize, lllllllllllllIIllllllIIlIlllIIIl.getItemToBuy().stackSize) || (llIIIlIllIIIlll(lllllllllllllIIllllllIIlIlllIIIl.hasSecondItemToBuy() ? 1 : 0) && llIIIlIllIIIllI(lllllllllllllIIllllllIIlIllIllII.stackSize, lllllllllllllIIllllllIIlIlllIIIl.getSecondItemToBuy().stackSize))) {
                merchantRecipe = null;
                "".length();
                if ((0xA2 ^ 0xA6) != (0x93 ^ 0x97)) {
                    return null;
                }
            }
            else {
                merchantRecipe = lllllllllllllIIllllllIIlIlllIIIl;
            }
            return merchantRecipe;
        }
        int lllllllllllllIIllllllIIlIlllIIII = MerchantRecipeList.lIIIlllIIIIlIl[0];
        "".length();
        if (" ".length() >= "  ".length()) {
            return null;
        }
        while (!llIIIlIllIIlIlI(lllllllllllllIIllllllIIlIlllIIII, this.size())) {
            final MerchantRecipe lllllllllllllIIllllllIIlIllIllll = this.get(lllllllllllllIIllllllIIlIlllIIII);
            if (llIIIlIllIIIlll(this.func_181078_a(lllllllllllllIIllllllIIlIllIllIl, lllllllllllllIIllllllIIlIllIllll.getItemToBuy()) ? 1 : 0) && llIIIlIllIIlIlI(lllllllllllllIIllllllIIlIllIllIl.stackSize, lllllllllllllIIllllllIIlIllIllll.getItemToBuy().stackSize) && ((llIIIlIllIIlIll(lllllllllllllIIllllllIIlIllIllll.hasSecondItemToBuy() ? 1 : 0) && !llIIIlIllIIllII(lllllllllllllIIllllllIIlIllIllII)) || (llIIIlIllIIIlll(lllllllllllllIIllllllIIlIllIllll.hasSecondItemToBuy() ? 1 : 0) && llIIIlIllIIIlll(this.func_181078_a(lllllllllllllIIllllllIIlIllIllII, lllllllllllllIIllllllIIlIllIllll.getSecondItemToBuy()) ? 1 : 0) && llIIIlIllIIlIlI(lllllllllllllIIllllllIIlIllIllII.stackSize, lllllllllllllIIllllllIIlIllIllll.getSecondItemToBuy().stackSize)))) {
                return lllllllllllllIIllllllIIlIllIllll;
            }
            ++lllllllllllllIIllllllIIlIlllIIII;
        }
        return null;
    }
    
    public MerchantRecipeList(final NBTTagCompound lllllllllllllIIllllllIIlIllllllI) {
        this.readRecipiesFromTags(lllllllllllllIIllllllIIlIllllllI);
    }
    
    private static boolean llIIIlIllIIIllI(final int lllllllllllllIIllllllIIIllllIIll, final int lllllllllllllIIllllllIIIllllIIlI) {
        return lllllllllllllIIllllllIIIllllIIll < lllllllllllllIIllllllIIIllllIIlI;
    }
    
    static {
        llIIIlIllIIIlII();
        llIIIlIllIIIIll();
    }
    
    public void writeToBuf(final PacketBuffer lllllllllllllIIllllllIIlIlIlIllI) {
        lllllllllllllIIllllllIIlIlIlIllI.writeByte((byte)(this.size() & MerchantRecipeList.lIIIlllIIIIlIl[2]));
        "".length();
        int lllllllllllllIIllllllIIlIlIllIlI = MerchantRecipeList.lIIIlllIIIIlIl[0];
        "".length();
        if (-"   ".length() > 0) {
            return;
        }
        while (!llIIIlIllIIlIlI(lllllllllllllIIllllllIIlIlIllIlI, this.size())) {
            final MerchantRecipe lllllllllllllIIllllllIIlIlIllIIl = this.get(lllllllllllllIIllllllIIlIlIllIlI);
            lllllllllllllIIllllllIIlIlIlIllI.writeItemStackToBuffer(lllllllllllllIIllllllIIlIlIllIIl.getItemToBuy());
            lllllllllllllIIllllllIIlIlIlIllI.writeItemStackToBuffer(lllllllllllllIIllllllIIlIlIllIIl.getItemToSell());
            final ItemStack lllllllllllllIIllllllIIlIlIllIII = lllllllllllllIIllllllIIlIlIllIIl.getSecondItemToBuy();
            int llllllllllllIlIllIlIlIlIIIlllIIl;
            if (llIIIlIllIIllII(lllllllllllllIIllllllIIlIlIllIII)) {
                llllllllllllIlIllIlIlIlIIIlllIIl = MerchantRecipeList.lIIIlllIIIIlIl[1];
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
            }
            else {
                llllllllllllIlIllIlIlIlIIIlllIIl = MerchantRecipeList.lIIIlllIIIIlIl[0];
            }
            lllllllllllllIIllllllIIlIlIlIllI.writeBoolean((boolean)(llllllllllllIlIllIlIlIlIIIlllIIl != 0));
            "".length();
            if (llIIIlIllIIllII(lllllllllllllIIllllllIIlIlIllIII)) {
                lllllllllllllIIllllllIIlIlIlIllI.writeItemStackToBuffer(lllllllllllllIIllllllIIlIlIllIII);
            }
            lllllllllllllIIllllllIIlIlIlIllI.writeBoolean(lllllllllllllIIllllllIIlIlIllIIl.isRecipeDisabled());
            "".length();
            lllllllllllllIIllllllIIlIlIlIllI.writeInt(lllllllllllllIIllllllIIlIlIllIIl.getToolUses());
            "".length();
            lllllllllllllIIllllllIIlIlIlIllI.writeInt(lllllllllllllIIllllllIIlIlIllIIl.getMaxTradeUses());
            "".length();
            ++lllllllllllllIIllllllIIlIlIllIlI;
        }
    }
    
    private boolean func_181078_a(final ItemStack lllllllllllllIIllllllIIlIllIIlIl, final ItemStack lllllllllllllIIllllllIIlIllIIIlI) {
        if (llIIIlIllIIIlll(ItemStack.areItemsEqual(lllllllllllllIIllllllIIlIllIIlIl, lllllllllllllIIllllllIIlIllIIIlI) ? 1 : 0) && (!llIIIlIllIIIlll(lllllllllllllIIllllllIIlIllIIIlI.hasTagCompound() ? 1 : 0) || (llIIIlIllIIIlll(lllllllllllllIIllllllIIlIllIIlIl.hasTagCompound() ? 1 : 0) && llIIIlIllIIIlll(NBTUtil.func_181123_a(lllllllllllllIIllllllIIlIllIIIlI.getTagCompound(), lllllllllllllIIllllllIIlIllIIlIl.getTagCompound(), (boolean)(MerchantRecipeList.lIIIlllIIIIlIl[0] != 0)) ? 1 : 0)))) {
            return MerchantRecipeList.lIIIlllIIIIlIl[1] != 0;
        }
        return MerchantRecipeList.lIIIlllIIIIlIl[0] != 0;
    }
}
