// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item.crafting;

import java.util.List;
import net.minecraft.item.ItemDye;
import com.google.common.collect.Lists;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.init.Items;
import net.minecraft.world.World;
import net.minecraft.inventory.InventoryCrafting;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.item.ItemStack;

public class RecipeFireworks implements IRecipe
{
    private /* synthetic */ ItemStack field_92102_a;
    private static final /* synthetic */ String[] llIIlIllIllIll;
    private static final /* synthetic */ int[] llIIlIllIlllII;
    
    private static String lIIIllIlllIIlIII(final String llllllllllllIlllIIIlIIlIlllIllIl, final String llllllllllllIlllIIIlIIlIlllIllII) {
        try {
            final SecretKeySpec llllllllllllIlllIIIlIIlIllllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIlIIlIlllIllII.getBytes(StandardCharsets.UTF_8)), RecipeFireworks.llIIlIllIlllII[10]), "DES");
            final Cipher llllllllllllIlllIIIlIIlIlllIllll = Cipher.getInstance("DES");
            llllllllllllIlllIIIlIIlIlllIllll.init(RecipeFireworks.llIIlIllIlllII[4], llllllllllllIlllIIIlIIlIllllIIII);
            return new String(llllllllllllIlllIIIlIIlIlllIllll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIlIIlIlllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIlIIlIlllIlllI) {
            llllllllllllIlllIIIlIIlIlllIlllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIllIlllIlIllI(final Object llllllllllllIlllIIIlIIlIllIIllII) {
        return llllllllllllIlllIIIlIIlIllIIllII == null;
    }
    
    private static boolean lIIIllIlllIIlllI(final Object llllllllllllIlllIIIlIIlIllIIllll, final Object llllllllllllIlllIIIlIIlIllIIlllI) {
        return llllllllllllIlllIIIlIIlIllIIllll == llllllllllllIlllIIIlIIlIllIIlllI;
    }
    
    private static boolean lIIIllIlllIlIIIl(final int llllllllllllIlllIIIlIIlIllIllIIl, final int llllllllllllIlllIIIlIIlIllIllIII) {
        return llllllllllllIlllIIIlIIlIllIllIIl <= llllllllllllIlllIIIlIIlIllIllIII;
    }
    
    static {
        lIIIllIlllIIllII();
        lIIIllIlllIIlIll();
    }
    
    @Override
    public ItemStack getCraftingResult(final InventoryCrafting llllllllllllIlllIIIlIIllIIlIllII) {
        return this.field_92102_a.copy();
    }
    
    @Override
    public ItemStack getRecipeOutput() {
        return this.field_92102_a;
    }
    
    @Override
    public ItemStack[] getRemainingItems(final InventoryCrafting llllllllllllIlllIIIlIIllIIlIIIIl) {
        final ItemStack[] llllllllllllIlllIIIlIIllIIlIIIII = new ItemStack[llllllllllllIlllIIIlIIllIIlIIIIl.getSizeInventory()];
        int llllllllllllIlllIIIlIIllIIIlllll = RecipeFireworks.llIIlIllIlllII[0];
        "".length();
        if ("   ".length() < -" ".length()) {
            return null;
        }
        while (!lIIIllIlllIlIIII(llllllllllllIlllIIIlIIllIIIlllll, llllllllllllIlllIIIlIIllIIlIIIII.length)) {
            final ItemStack llllllllllllIlllIIIlIIllIIIllllI = llllllllllllIlllIIIlIIllIIlIIIIl.getStackInSlot(llllllllllllIlllIIIlIIllIIIlllll);
            if (lIIIllIlllIIllIl(llllllllllllIlllIIIlIIllIIIllllI) && lIIIllIlllIlIlIl(llllllllllllIlllIIIlIIllIIIllllI.getItem().hasContainerItem() ? 1 : 0)) {
                llllllllllllIlllIIIlIIllIIlIIIII[llllllllllllIlllIIIlIIllIIIlllll] = new ItemStack(llllllllllllIlllIIIlIIllIIIllllI.getItem().getContainerItem());
            }
            ++llllllllllllIlllIIIlIIllIIIlllll;
        }
        return llllllllllllIlllIIIlIIllIIlIIIII;
    }
    
    private static void lIIIllIlllIIlIll() {
        (llIIlIllIllIll = new String[RecipeFireworks.llIIlIllIlllII[13]])[RecipeFireworks.llIIlIllIlllII[0]] = lIIIllIlllIIlIII("8Tti167F8jpfMa1OVfsRQg==", "xnWmx");
        RecipeFireworks.llIIlIllIllIll[RecipeFireworks.llIIlIllIlllII[2]] = lIIIllIlllIIlIIl("af4UiVj0amPDweh/w1v6Rw==", "ZOVUc");
        RecipeFireworks.llIIlIllIllIll[RecipeFireworks.llIIlIllIlllII[4]] = lIIIllIlllIIlIII("1kDUscBl71ff+aIrmY75cA==", "bvKJC");
        RecipeFireworks.llIIlIllIllIll[RecipeFireworks.llIIlIllIlllII[1]] = lIIIllIlllIIlIlI("NCEgBSEG", "rMIbI");
        RecipeFireworks.llIIlIllIllIll[RecipeFireworks.llIIlIllIlllII[5]] = lIIIllIlllIIlIII("xNJtK2tfysxnPv08YsRBNA==", "XWkYH");
        RecipeFireworks.llIIlIllIllIll[RecipeFireworks.llIIlIllIlllII[7]] = lIIIllIlllIIlIlI("ITU9ASoCKw==", "gYTbA");
        RecipeFireworks.llIIlIllIllIll[RecipeFireworks.llIIlIllIlllII[8]] = lIIIllIlllIIlIII("AlBhTzWFsjg=", "eXiAY");
        RecipeFireworks.llIIlIllIllIll[RecipeFireworks.llIIlIllIlllII[9]] = lIIIllIlllIIlIlI("GjglLQAq", "YWIBr");
        RecipeFireworks.llIIlIllIllIll[RecipeFireworks.llIIlIllIlllII[10]] = lIIIllIlllIIlIIl("0fZ/Qe2yeSM=", "FpbFt");
        RecipeFireworks.llIIlIllIllIll[RecipeFireworks.llIIlIllIlllII[11]] = lIIIllIlllIIlIII("wx2x/UaGUdQGVRUuSWSusw==", "gjtpQ");
        RecipeFireworks.llIIlIllIllIll[RecipeFireworks.llIIlIllIlllII[3]] = lIIIllIlllIIlIIl("QLkX1W0f1SBECenca4YE7w==", "CXWCE");
        RecipeFireworks.llIIlIllIllIll[RecipeFireworks.llIIlIllIlllII[12]] = lIIIllIlllIIlIIl("4IocuCWs+0H/wDv/LkI4RQ==", "VcbMP");
    }
    
    private static boolean lIIIllIlllIlIlll(final int llllllllllllIlllIIIlIIlIllIlllIl, final int llllllllllllIlllIIIlIIlIllIlllII) {
        return llllllllllllIlllIIIlIIlIllIlllIl < llllllllllllIlllIIIlIIlIllIlllII;
    }
    
    private static boolean lIIIllIlllIlIlIl(final int llllllllllllIlllIIIlIIlIllIIlIlI) {
        return llllllllllllIlllIIIlIIlIllIIlIlI != 0;
    }
    
    private static boolean lIIIllIlllIlIIII(final int llllllllllllIlllIIIlIIlIlllIIIIl, final int llllllllllllIlllIIIlIIlIlllIIIII) {
        return llllllllllllIlllIIIlIIlIlllIIIIl >= llllllllllllIlllIIIlIIlIlllIIIII;
    }
    
    private static boolean lIIIllIlllIlIIlI(final int llllllllllllIlllIIIlIIlIlllIIlIl, final int llllllllllllIlllIIIlIIlIlllIIlII) {
        return llllllllllllIlllIIIlIIlIlllIIlIl == llllllllllllIlllIIIlIIlIlllIIlII;
    }
    
    private static void lIIIllIlllIIllII() {
        (llIIlIllIlllII = new int[14])[0] = ((0xF6 ^ 0xB8) & ~(0x39 ^ 0x77));
        RecipeFireworks.llIIlIllIlllII[1] = "   ".length();
        RecipeFireworks.llIIlIllIlllII[2] = " ".length();
        RecipeFireworks.llIIlIllIlllII[3] = (0x14 ^ 0x36 ^ (0xAE ^ 0x86));
        RecipeFireworks.llIIlIllIlllII[4] = "  ".length();
        RecipeFireworks.llIIlIllIlllII[5] = (0xD7 ^ 0xBA ^ (0xF0 ^ 0x99));
        RecipeFireworks.llIIlIllIlllII[6] = (0x8B ^ 0x9E ^ (0x34 ^ 0x2E));
        RecipeFireworks.llIIlIllIlllII[7] = (81 + 96 - 136 + 91 ^ 63 + 22 + 44 + 0);
        RecipeFireworks.llIIlIllIlllII[8] = (97 + 93 - 85 + 39 ^ 42 + 24 + 53 + 31);
        RecipeFireworks.llIIlIllIlllII[9] = (0x8E ^ 0x89);
        RecipeFireworks.llIIlIllIlllII[10] = (0xCF ^ 0xC7);
        RecipeFireworks.llIIlIllIlllII[11] = (0xB ^ 0x2);
        RecipeFireworks.llIIlIllIlllII[12] = (0x91 ^ 0x9A);
        RecipeFireworks.llIIlIllIlllII[13] = (0x68 ^ 0x64);
    }
    
    private static String lIIIllIlllIIlIIl(final String llllllllllllIlllIIIlIIllIIIlIIII, final String llllllllllllIlllIIIlIIllIIIIllll) {
        try {
            final SecretKeySpec llllllllllllIlllIIIlIIllIIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIlIIllIIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIIlIIllIIIlIlII = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIIlIIllIIIlIlII.init(RecipeFireworks.llIIlIllIlllII[4], llllllllllllIlllIIIlIIllIIIlIlIl);
            return new String(llllllllllllIlllIIIlIIllIIIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIlIIllIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIlIIllIIIlIIll) {
            llllllllllllIlllIIIlIIllIIIlIIll.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIllIlllIIlIlI(String llllllllllllIlllIIIlIIlIllllllIl, final String llllllllllllIlllIIIlIIlIllllllII) {
        llllllllllllIlllIIIlIIlIllllllIl = new String(Base64.getDecoder().decode(llllllllllllIlllIIIlIIlIllllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIIlIIllIIIIIIII = new StringBuilder();
        final char[] llllllllllllIlllIIIlIIlIllllllll = llllllllllllIlllIIIlIIlIllllllII.toCharArray();
        int llllllllllllIlllIIIlIIlIlllllllI = RecipeFireworks.llIIlIllIlllII[0];
        final Exception llllllllllllIlllIIIlIIlIlllllIII = (Object)llllllllllllIlllIIIlIIlIllllllIl.toCharArray();
        final int llllllllllllIlllIIIlIIlIllllIlll = llllllllllllIlllIIIlIIlIlllllIII.length;
        Exception llllllllllllIlllIIIlIIlIllllIllI = (Exception)RecipeFireworks.llIIlIllIlllII[0];
        while (lIIIllIlllIlIlll((int)llllllllllllIlllIIIlIIlIllllIllI, llllllllllllIlllIIIlIIlIllllIlll)) {
            final char llllllllllllIlllIIIlIIllIIIIIIll = llllllllllllIlllIIIlIIlIlllllIII[llllllllllllIlllIIIlIIlIllllIllI];
            llllllllllllIlllIIIlIIllIIIIIIII.append((char)(llllllllllllIlllIIIlIIllIIIIIIll ^ llllllllllllIlllIIIlIIlIllllllll[llllllllllllIlllIIIlIIlIlllllllI % llllllllllllIlllIIIlIIlIllllllll.length]));
            "".length();
            ++llllllllllllIlllIIIlIIlIlllllllI;
            ++llllllllllllIlllIIIlIIlIllllIllI;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIIlIIllIIIIIIII);
    }
    
    private static boolean lIIIllIlllIlIlII(final int llllllllllllIlllIIIlIIlIllIIIllI) {
        return llllllllllllIlllIIIlIIlIllIIIllI > 0;
    }
    
    private static boolean lIIIllIlllIIllIl(final Object llllllllllllIlllIIIlIIlIllIlIIlI) {
        return llllllllllllIlllIIIlIIlIllIlIIlI != null;
    }
    
    @Override
    public int getRecipeSize() {
        return RecipeFireworks.llIIlIllIlllII[3];
    }
    
    private static boolean lIIIllIlllIlIIll(final int llllllllllllIlllIIIlIIlIllIIlIII) {
        return llllllllllllIlllIIIlIIlIllIIlIII == 0;
    }
    
    private static boolean lIIIllIlllIIllll(final Object llllllllllllIlllIIIlIIlIllIlIlIl, final Object llllllllllllIlllIIIlIIlIllIlIlII) {
        return llllllllllllIlllIIIlIIlIllIlIlIl != llllllllllllIlllIIIlIIlIllIlIlII;
    }
    
    @Override
    public boolean matches(final InventoryCrafting llllllllllllIlllIIIlIIllIlIllIIl, final World llllllllllllIlllIIIlIIllIlIllIII) {
        this.field_92102_a = null;
        int llllllllllllIlllIIIlIIllIlIlIlll = RecipeFireworks.llIIlIllIlllII[0];
        int llllllllllllIlllIIIlIIllIlIlIllI = RecipeFireworks.llIIlIllIlllII[0];
        int llllllllllllIlllIIIlIIllIlIlIlIl = RecipeFireworks.llIIlIllIlllII[0];
        int llllllllllllIlllIIIlIIllIlIlIlII = RecipeFireworks.llIIlIllIlllII[0];
        int llllllllllllIlllIIIlIIllIlIlIIll = RecipeFireworks.llIIlIllIlllII[0];
        int llllllllllllIlllIIIlIIllIlIlIIlI = RecipeFireworks.llIIlIllIlllII[0];
        int llllllllllllIlllIIIlIIllIlIlIIIl = RecipeFireworks.llIIlIllIlllII[0];
        "".length();
        if (" ".length() >= "   ".length()) {
            return ((0x5B ^ 0x6B) & ~(0xB6 ^ 0x86)) != 0x0;
        }
        while (!lIIIllIlllIlIIII(llllllllllllIlllIIIlIIllIlIlIIIl, llllllllllllIlllIIIlIIllIlIllIIl.getSizeInventory())) {
            final ItemStack llllllllllllIlllIIIlIIllIlIlIIII = llllllllllllIlllIIIlIIllIlIllIIl.getStackInSlot(llllllllllllIlllIIIlIIllIlIlIIIl);
            if (lIIIllIlllIIllIl(llllllllllllIlllIIIlIIllIlIlIIII)) {
                if (lIIIllIlllIIlllI(llllllllllllIlllIIIlIIllIlIlIIII.getItem(), Items.gunpowder)) {
                    ++llllllllllllIlllIIIlIIllIlIlIllI;
                    "".length();
                    if (((0x20 ^ 0x2E) & ~(0xCE ^ 0xC0)) >= "  ".length()) {
                        return ((0x73 ^ 0x7D) & ~(0x9D ^ 0x93)) != 0x0;
                    }
                }
                else if (lIIIllIlllIIlllI(llllllllllllIlllIIIlIIllIlIlIIII.getItem(), Items.firework_charge)) {
                    ++llllllllllllIlllIIIlIIllIlIlIlII;
                    "".length();
                    if (((0x9C ^ 0x81) & ~(0x67 ^ 0x7A)) < 0) {
                        return ((0x11 ^ 0x1D) & ~(0xBF ^ 0xB3)) != 0x0;
                    }
                }
                else if (lIIIllIlllIIlllI(llllllllllllIlllIIIlIIllIlIlIIII.getItem(), Items.dye)) {
                    ++llllllllllllIlllIIIlIIllIlIlIlIl;
                    "".length();
                    if (null != null) {
                        return ((0xF ^ 0x46 ^ (0x71 ^ 0x21)) & (0x93 ^ 0x94 ^ (0x47 ^ 0x59) ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIIllIlllIIlllI(llllllllllllIlllIIIlIIllIlIlIIII.getItem(), Items.paper)) {
                    ++llllllllllllIlllIIIlIIllIlIlIlll;
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return ((0xDF ^ 0xC3) & ~(0x60 ^ 0x7C)) != 0x0;
                    }
                }
                else if (lIIIllIlllIIlllI(llllllllllllIlllIIIlIIllIlIlIIII.getItem(), Items.glowstone_dust)) {
                    ++llllllllllllIlllIIIlIIllIlIlIIll;
                    "".length();
                    if ("  ".length() < 0) {
                        return ((0x32 ^ 0x34 ^ (0x18 ^ 0x46)) & (0xB3 ^ 0xA2 ^ (0xFD ^ 0xB4) ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIIllIlllIIlllI(llllllllllllIlllIIIlIIllIlIlIIII.getItem(), Items.diamond)) {
                    ++llllllllllllIlllIIIlIIllIlIlIIll;
                    "".length();
                    if ("  ".length() < -" ".length()) {
                        return ("  ".length() & ("  ".length() ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIIllIlllIIlllI(llllllllllllIlllIIIlIIllIlIlIIII.getItem(), Items.fire_charge)) {
                    ++llllllllllllIlllIIIlIIllIlIlIIlI;
                    "".length();
                    if (-(0xDA ^ 0xA9 ^ (0x32 ^ 0x45)) >= 0) {
                        return ((0x4C ^ 0x2 ^ (0x4 ^ 0x15)) & (0x6B ^ 0x67 ^ (0x93 ^ 0xC0) ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIIllIlllIIlllI(llllllllllllIlllIIIlIIllIlIlIIII.getItem(), Items.feather)) {
                    ++llllllllllllIlllIIIlIIllIlIlIIlI;
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return ((0xCD ^ 0x83 ^ (0x8C ^ 0xA3)) & (117 + 9 - 72 + 106 ^ 158 + 141 - 178 + 72 ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIIllIlllIIlllI(llllllllllllIlllIIIlIIllIlIlIIII.getItem(), Items.gold_nugget)) {
                    ++llllllllllllIlllIIIlIIllIlIlIIlI;
                    "".length();
                    if (-" ".length() != -" ".length()) {
                        return ((0x1 ^ 0x28) & ~(0x9B ^ 0xB2)) != 0x0;
                    }
                }
                else {
                    if (lIIIllIlllIIllll(llllllllllllIlllIIIlIIllIlIlIIII.getItem(), Items.skull)) {
                        return RecipeFireworks.llIIlIllIlllII[0] != 0;
                    }
                    ++llllllllllllIlllIIIlIIllIlIlIIlI;
                }
            }
            ++llllllllllllIlllIIIlIIllIlIlIIIl;
        }
        llllllllllllIlllIIIlIIllIlIlIIll = llllllllllllIlllIIIlIIllIlIlIIll + llllllllllllIlllIIIlIIllIlIlIlIl + llllllllllllIlllIIIlIIllIlIlIIlI;
        if (!lIIIllIlllIlIIIl(llllllllllllIlllIIIlIIllIlIlIllI, RecipeFireworks.llIIlIllIlllII[1]) || !lIIIllIlllIlIIIl(llllllllllllIlllIIIlIIllIlIlIlll, RecipeFireworks.llIIlIllIlllII[2])) {
            return RecipeFireworks.llIIlIllIlllII[0] != 0;
        }
        if (lIIIllIlllIlIIII(llllllllllllIlllIIIlIIllIlIlIllI, RecipeFireworks.llIIlIllIlllII[2]) && lIIIllIlllIlIIlI(llllllllllllIlllIIIlIIllIlIlIlll, RecipeFireworks.llIIlIllIlllII[2]) && lIIIllIlllIlIIll(llllllllllllIlllIIIlIIllIlIlIIll)) {
            this.field_92102_a = new ItemStack(Items.fireworks);
            if (lIIIllIlllIlIlII(llllllllllllIlllIIIlIIllIlIlIlII)) {
                final NBTTagCompound llllllllllllIlllIIIlIIllIlIIllll = new NBTTagCompound();
                final NBTTagCompound llllllllllllIlllIIIlIIllIlIIlllI = new NBTTagCompound();
                final NBTTagList llllllllllllIlllIIIlIIllIlIIllIl = new NBTTagList();
                int llllllllllllIlllIIIlIIllIlIIllII = RecipeFireworks.llIIlIllIlllII[0];
                "".length();
                if (-(0xD5 ^ 0x90 ^ (0x6E ^ 0x2F)) >= 0) {
                    return ((0x89 ^ 0xA4 ^ (0x9A ^ 0xA7)) & (0x50 ^ 0x67 ^ (0x88 ^ 0xAF) ^ -" ".length())) != 0x0;
                }
                while (!lIIIllIlllIlIIII(llllllllllllIlllIIIlIIllIlIIllII, llllllllllllIlllIIIlIIllIlIllIIl.getSizeInventory())) {
                    final ItemStack llllllllllllIlllIIIlIIllIlIIlIll = llllllllllllIlllIIIlIIllIlIllIIl.getStackInSlot(llllllllllllIlllIIIlIIllIlIIllII);
                    if (lIIIllIlllIIllIl(llllllllllllIlllIIIlIIllIlIIlIll) && lIIIllIlllIIlllI(llllllllllllIlllIIIlIIllIlIIlIll.getItem(), Items.firework_charge) && lIIIllIlllIlIlIl(llllllllllllIlllIIIlIIllIlIIlIll.hasTagCompound() ? 1 : 0) && lIIIllIlllIlIlIl(llllllllllllIlllIIIlIIllIlIIlIll.getTagCompound().hasKey(RecipeFireworks.llIIlIllIllIll[RecipeFireworks.llIIlIllIlllII[0]], RecipeFireworks.llIIlIllIlllII[3]) ? 1 : 0)) {
                        llllllllllllIlllIIIlIIllIlIIllIl.appendTag(llllllllllllIlllIIIlIIllIlIIlIll.getTagCompound().getCompoundTag(RecipeFireworks.llIIlIllIllIll[RecipeFireworks.llIIlIllIlllII[2]]));
                    }
                    ++llllllllllllIlllIIIlIIllIlIIllII;
                }
                llllllllllllIlllIIIlIIllIlIIlllI.setTag(RecipeFireworks.llIIlIllIllIll[RecipeFireworks.llIIlIllIlllII[4]], llllllllllllIlllIIIlIIllIlIIllIl);
                llllllllllllIlllIIIlIIllIlIIlllI.setByte(RecipeFireworks.llIIlIllIllIll[RecipeFireworks.llIIlIllIlllII[1]], (byte)llllllllllllIlllIIIlIIllIlIlIllI);
                llllllllllllIlllIIIlIIllIlIIllll.setTag(RecipeFireworks.llIIlIllIllIll[RecipeFireworks.llIIlIllIlllII[5]], llllllllllllIlllIIIlIIllIlIIlllI);
                this.field_92102_a.setTagCompound(llllllllllllIlllIIIlIIllIlIIllll);
            }
            return RecipeFireworks.llIIlIllIlllII[2] != 0;
        }
        if (lIIIllIlllIlIIlI(llllllllllllIlllIIIlIIllIlIlIllI, RecipeFireworks.llIIlIllIlllII[2]) && lIIIllIlllIlIIll(llllllllllllIlllIIIlIIllIlIlIlll) && lIIIllIlllIlIIll(llllllllllllIlllIIIlIIllIlIlIlII) && lIIIllIlllIlIlII(llllllllllllIlllIIIlIIllIlIlIlIl) && lIIIllIlllIlIIIl(llllllllllllIlllIIIlIIllIlIlIIlI, RecipeFireworks.llIIlIllIlllII[2])) {
            this.field_92102_a = new ItemStack(Items.firework_charge);
            final NBTTagCompound llllllllllllIlllIIIlIIllIlIIlIlI = new NBTTagCompound();
            final NBTTagCompound llllllllllllIlllIIIlIIllIlIIlIIl = new NBTTagCompound();
            byte llllllllllllIlllIIIlIIllIlIIlIII = (byte)RecipeFireworks.llIIlIllIlllII[0];
            final List<Integer> llllllllllllIlllIIIlIIllIlIIIlll = (List<Integer>)Lists.newArrayList();
            int llllllllllllIlllIIIlIIllIlIIIllI = RecipeFireworks.llIIlIllIlllII[0];
            "".length();
            if ((0xC2 ^ 0x9E ^ (0x18 ^ 0x40)) < ((0x7E ^ 0x6F ^ (0xE8 ^ 0xBE)) & (0x68 ^ 0x7F ^ (0x17 ^ 0x47) ^ -" ".length()))) {
                return ((0x2E ^ 0x43 ^ (0x73 ^ 0x5B)) & (195 + 14 - 20 + 44 ^ 139 + 91 - 67 + 9 ^ -" ".length())) != 0x0;
            }
            while (!lIIIllIlllIlIIII(llllllllllllIlllIIIlIIllIlIIIllI, llllllllllllIlllIIIlIIllIlIllIIl.getSizeInventory())) {
                final ItemStack llllllllllllIlllIIIlIIllIlIIIlIl = llllllllllllIlllIIIlIIllIlIllIIl.getStackInSlot(llllllllllllIlllIIIlIIllIlIIIllI);
                if (lIIIllIlllIIllIl(llllllllllllIlllIIIlIIllIlIIIlIl)) {
                    if (lIIIllIlllIIlllI(llllllllllllIlllIIIlIIllIlIIIlIl.getItem(), Items.dye)) {
                        llllllllllllIlllIIIlIIllIlIIIlll.add(ItemDye.dyeColors[llllllllllllIlllIIIlIIllIlIIIlIl.getMetadata() & RecipeFireworks.llIIlIllIlllII[6]]);
                        "".length();
                        "".length();
                        if (-"   ".length() > 0) {
                            return ((116 + 85 - 110 + 61 ^ 147 + 156 - 212 + 87) & (0x3E ^ 0x48 ^ (0x46 ^ 0x1A) ^ -" ".length())) != 0x0;
                        }
                    }
                    else if (lIIIllIlllIIlllI(llllllllllllIlllIIIlIIllIlIIIlIl.getItem(), Items.glowstone_dust)) {
                        llllllllllllIlllIIIlIIllIlIIlIIl.setBoolean(RecipeFireworks.llIIlIllIllIll[RecipeFireworks.llIIlIllIlllII[7]], (boolean)(RecipeFireworks.llIIlIllIlllII[2] != 0));
                        "".length();
                        if (null != null) {
                            return ((0x45 ^ 0x78) & ~(0x3F ^ 0x2)) != 0x0;
                        }
                    }
                    else if (lIIIllIlllIIlllI(llllllllllllIlllIIIlIIllIlIIIlIl.getItem(), Items.diamond)) {
                        llllllllllllIlllIIIlIIllIlIIlIIl.setBoolean(RecipeFireworks.llIIlIllIllIll[RecipeFireworks.llIIlIllIlllII[8]], (boolean)(RecipeFireworks.llIIlIllIlllII[2] != 0));
                        "".length();
                        if ((0x36 ^ 0x32) <= 0) {
                            return ((0x7A ^ 0x3F) & ~(0x23 ^ 0x66)) != 0x0;
                        }
                    }
                    else if (lIIIllIlllIIlllI(llllllllllllIlllIIIlIIllIlIIIlIl.getItem(), Items.fire_charge)) {
                        llllllllllllIlllIIIlIIllIlIIlIII = (byte)RecipeFireworks.llIIlIllIlllII[2];
                        "".length();
                        if ("  ".length() == 0) {
                            return ((0x78 ^ 0x6F ^ (0x1C ^ 0x2B)) & (0x5F ^ 0xA ^ (0x4A ^ 0x3F) ^ -" ".length())) != 0x0;
                        }
                    }
                    else if (lIIIllIlllIIlllI(llllllllllllIlllIIIlIIllIlIIIlIl.getItem(), Items.feather)) {
                        llllllllllllIlllIIIlIIllIlIIlIII = (byte)RecipeFireworks.llIIlIllIlllII[5];
                        "".length();
                        if (null != null) {
                            return ((0x26 ^ 0x9 ^ (0x84 ^ 0xB3)) & (0xF7 ^ 0xA5 ^ (0x43 ^ 0x9) ^ -" ".length()) & (((58 + 87 - 74 + 81 ^ 86 + 8 - 48 + 140) & (0xFF ^ 0x93 ^ (0x48 ^ 0x6) ^ -" ".length())) ^ -" ".length())) != 0x0;
                        }
                    }
                    else if (lIIIllIlllIIlllI(llllllllllllIlllIIIlIIllIlIIIlIl.getItem(), Items.gold_nugget)) {
                        llllllllllllIlllIIIlIIllIlIIlIII = (byte)RecipeFireworks.llIIlIllIlllII[4];
                        "".length();
                        if (-"  ".length() >= 0) {
                            return ((0xC ^ 0x7B ^ (0xC ^ 0x4E)) & (0xE1 ^ 0x93 ^ (0xFD ^ 0xBA) ^ -" ".length())) != 0x0;
                        }
                    }
                    else if (lIIIllIlllIIlllI(llllllllllllIlllIIIlIIllIlIIIlIl.getItem(), Items.skull)) {
                        llllllllllllIlllIIIlIIllIlIIlIII = (byte)RecipeFireworks.llIIlIllIlllII[1];
                    }
                }
                ++llllllllllllIlllIIIlIIllIlIIIllI;
            }
            final int[] llllllllllllIlllIIIlIIllIlIIIlII = new int[llllllllllllIlllIIIlIIllIlIIIlll.size()];
            int llllllllllllIlllIIIlIIllIlIIIIll = RecipeFireworks.llIIlIllIlllII[0];
            "".length();
            if (null != null) {
                return ((((0x5C ^ 0x48) & ~(0x39 ^ 0x2D)) ^ (0x47 ^ 0x5C)) & (0xB8 ^ 0xA3 ^ ((0x9C ^ 0xB8) & ~(0x5F ^ 0x7B)) ^ -" ".length())) != 0x0;
            }
            while (!lIIIllIlllIlIIII(llllllllllllIlllIIIlIIllIlIIIIll, llllllllllllIlllIIIlIIllIlIIIlII.length)) {
                llllllllllllIlllIIIlIIllIlIIIlII[llllllllllllIlllIIIlIIllIlIIIIll] = llllllllllllIlllIIIlIIllIlIIIlll.get(llllllllllllIlllIIIlIIllIlIIIIll);
                ++llllllllllllIlllIIIlIIllIlIIIIll;
            }
            llllllllllllIlllIIIlIIllIlIIlIIl.setIntArray(RecipeFireworks.llIIlIllIllIll[RecipeFireworks.llIIlIllIlllII[9]], llllllllllllIlllIIIlIIllIlIIIlII);
            llllllllllllIlllIIIlIIllIlIIlIIl.setByte(RecipeFireworks.llIIlIllIllIll[RecipeFireworks.llIIlIllIlllII[10]], llllllllllllIlllIIIlIIllIlIIlIII);
            llllllllllllIlllIIIlIIllIlIIlIlI.setTag(RecipeFireworks.llIIlIllIllIll[RecipeFireworks.llIIlIllIlllII[11]], llllllllllllIlllIIIlIIllIlIIlIIl);
            this.field_92102_a.setTagCompound(llllllllllllIlllIIIlIIllIlIIlIlI);
            return RecipeFireworks.llIIlIllIlllII[2] != 0;
        }
        else {
            if (!lIIIllIlllIlIIll(llllllllllllIlllIIIlIIllIlIlIllI) || !lIIIllIlllIlIIll(llllllllllllIlllIIIlIIllIlIlIlll) || !lIIIllIlllIlIIlI(llllllllllllIlllIIIlIIllIlIlIlII, RecipeFireworks.llIIlIllIlllII[2]) || !lIIIllIlllIlIlII(llllllllllllIlllIIIlIIllIlIlIlIl) || !lIIIllIlllIlIIlI(llllllllllllIlllIIIlIIllIlIlIlIl, llllllllllllIlllIIIlIIllIlIlIIll)) {
                return RecipeFireworks.llIIlIllIlllII[0] != 0;
            }
            final List<Integer> llllllllllllIlllIIIlIIllIlIIIIlI = (List<Integer>)Lists.newArrayList();
            int llllllllllllIlllIIIlIIllIlIIIIIl = RecipeFireworks.llIIlIllIlllII[0];
            "".length();
            if (null != null) {
                return ((0x79 ^ 0x37) & ~(0x55 ^ 0x1B)) != 0x0;
            }
            while (!lIIIllIlllIlIIII(llllllllllllIlllIIIlIIllIlIIIIIl, llllllllllllIlllIIIlIIllIlIllIIl.getSizeInventory())) {
                final ItemStack llllllllllllIlllIIIlIIllIlIIIIII = llllllllllllIlllIIIlIIllIlIllIIl.getStackInSlot(llllllllllllIlllIIIlIIllIlIIIIIl);
                if (lIIIllIlllIIllIl(llllllllllllIlllIIIlIIllIlIIIIII)) {
                    if (lIIIllIlllIIlllI(llllllllllllIlllIIIlIIllIlIIIIII.getItem(), Items.dye)) {
                        llllllllllllIlllIIIlIIllIlIIIIlI.add(ItemDye.dyeColors[llllllllllllIlllIIIlIIllIlIIIIII.getMetadata() & RecipeFireworks.llIIlIllIlllII[6]]);
                        "".length();
                        "".length();
                        if (" ".length() < 0) {
                            return ((0x7C ^ 0x20) & ~(0xF4 ^ 0xA8)) != 0x0;
                        }
                    }
                    else if (lIIIllIlllIIlllI(llllllllllllIlllIIIlIIllIlIIIIII.getItem(), Items.firework_charge)) {
                        this.field_92102_a = llllllllllllIlllIIIlIIllIlIIIIII.copy();
                        this.field_92102_a.stackSize = RecipeFireworks.llIIlIllIlllII[2];
                    }
                }
                ++llllllllllllIlllIIIlIIllIlIIIIIl;
            }
            final int[] llllllllllllIlllIIIlIIllIIllllll = new int[llllllllllllIlllIIIlIIllIlIIIIlI.size()];
            int llllllllllllIlllIIIlIIllIIlllllI = RecipeFireworks.llIIlIllIlllII[0];
            "".length();
            if ((18 + 44 - 58 + 147 ^ 138 + 35 - 125 + 99) < -" ".length()) {
                return ((0xB7 ^ 0x9B ^ (0x12 ^ 0x2F)) & (0x20 ^ 0x2B ^ (0x87 ^ 0x9D) ^ -" ".length())) != 0x0;
            }
            while (!lIIIllIlllIlIIII(llllllllllllIlllIIIlIIllIIlllllI, llllllllllllIlllIIIlIIllIIllllll.length)) {
                llllllllllllIlllIIIlIIllIIllllll[llllllllllllIlllIIIlIIllIIlllllI] = llllllllllllIlllIIIlIIllIlIIIIlI.get(llllllllllllIlllIIIlIIllIIlllllI);
                ++llllllllllllIlllIIIlIIllIIlllllI;
            }
            if (!lIIIllIlllIIllIl(this.field_92102_a) || !lIIIllIlllIlIlIl(this.field_92102_a.hasTagCompound() ? 1 : 0)) {
                return RecipeFireworks.llIIlIllIlllII[0] != 0;
            }
            final NBTTagCompound llllllllllllIlllIIIlIIllIIllllIl = this.field_92102_a.getTagCompound().getCompoundTag(RecipeFireworks.llIIlIllIllIll[RecipeFireworks.llIIlIllIlllII[3]]);
            if (lIIIllIlllIlIllI(llllllllllllIlllIIIlIIllIIllllIl)) {
                return RecipeFireworks.llIIlIllIlllII[0] != 0;
            }
            llllllllllllIlllIIIlIIllIIllllIl.setIntArray(RecipeFireworks.llIIlIllIllIll[RecipeFireworks.llIIlIllIlllII[12]], llllllllllllIlllIIIlIIllIIllllll);
            return RecipeFireworks.llIIlIllIlllII[2] != 0;
        }
    }
}
