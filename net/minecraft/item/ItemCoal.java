// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import java.util.List;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.creativetab.CreativeTabs;

public class ItemCoal extends Item
{
    private static final /* synthetic */ String[] lIIIIlllIIlIlI;
    private static final /* synthetic */ int[] lIIIIlllIIlllI;
    
    public ItemCoal() {
        this.setHasSubtypes((boolean)(ItemCoal.lIIIIlllIIlllI[0] != 0));
        "".length();
        this.setMaxDamage(ItemCoal.lIIIIlllIIlllI[1]);
        "".length();
        this.setCreativeTab(CreativeTabs.tabMaterials);
        "".length();
    }
    
    private static void lIllllIIlIIlIlI() {
        (lIIIIlllIIlIlI = new String[ItemCoal.lIIIIlllIIlllI[2]])[ItemCoal.lIIIIlllIIlllI[1]] = lIllllIIlIIIlIl("/a05GAjkdFP0Tz1m3y0A6A==", "SKJxs");
        ItemCoal.lIIIIlllIIlIlI[ItemCoal.lIIIIlllIIlllI[0]] = lIllllIIlIIIllI("ZzX5Y9vT7P7fdRTOIQ5bUA==", "uHbWW");
    }
    
    private static String lIllllIIlIIIllI(final String lllllllllllllIlIIlIIIIIlIIIlllll, final String lllllllllllllIlIIlIIIIIlIIlIIIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIIIIlIIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIIIIlIIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIIIIIlIIlIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIIIIIlIIlIIIll.init(ItemCoal.lIIIIlllIIlllI[2], lllllllllllllIlIIlIIIIIlIIlIIlII);
            return new String(lllllllllllllIlIIlIIIIIlIIlIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIIIIlIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIIIIlIIlIIIlI) {
            lllllllllllllIlIIlIIIIIlIIlIIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllllIIlIIllIl(final int lllllllllllllIlIIlIIIIIlIIIIllII, final int lllllllllllllIlIIlIIIIIlIIIIlIll) {
        return lllllllllllllIlIIlIIIIIlIIIIllII == lllllllllllllIlIIlIIIIIlIIIIlIll;
    }
    
    static {
        lIllllIIlIIllII();
        lIllllIIlIIlIlI();
    }
    
    private static String lIllllIIlIIIlIl(final String lllllllllllllIlIIlIIIIIlIIIlIlII, final String lllllllllllllIlIIlIIIIIlIIIlIIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIIIIlIIIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIIIIlIIIlIIll.getBytes(StandardCharsets.UTF_8)), ItemCoal.lIIIIlllIIlllI[3]), "DES");
            final Cipher lllllllllllllIlIIlIIIIIlIIIlIllI = Cipher.getInstance("DES");
            lllllllllllllIlIIlIIIIIlIIIlIllI.init(ItemCoal.lIIIIlllIIlllI[2], lllllllllllllIlIIlIIIIIlIIIlIlll);
            return new String(lllllllllllllIlIIlIIIIIlIIIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIIIIlIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIIIIlIIIlIlIl) {
            lllllllllllllIlIIlIIIIIlIIIlIlIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIllllIIlIIllII() {
        (lIIIIlllIIlllI = new int[4])[0] = " ".length();
        ItemCoal.lIIIIlllIIlllI[1] = ((0x17 ^ 0x75 ^ (0xDC ^ 0x97)) & ("   ".length() ^ (0xA5 ^ 0x8F) ^ -" ".length()));
        ItemCoal.lIIIIlllIIlllI[2] = "  ".length();
        ItemCoal.lIIIIlllIIlllI[3] = (0x4D ^ 0x45);
    }
    
    @Override
    public String getUnlocalizedName(final ItemStack lllllllllllllIlIIlIIIIIlIIllIIIl) {
        String s;
        if (lIllllIIlIIllIl(lllllllllllllIlIIlIIIIIlIIllIIIl.getMetadata(), ItemCoal.lIIIIlllIIlllI[0])) {
            s = ItemCoal.lIIIIlllIIlIlI[ItemCoal.lIIIIlllIIlllI[1]];
            "".length();
            if (" ".length() >= "   ".length()) {
                return null;
            }
        }
        else {
            s = ItemCoal.lIIIIlllIIlIlI[ItemCoal.lIIIIlllIIlllI[0]];
        }
        return s;
    }
    
    @Override
    public void getSubItems(final Item lllllllllllllIlIIlIIIIIlIIlIlIlI, final CreativeTabs lllllllllllllIlIIlIIIIIlIIlIllII, final List<ItemStack> lllllllllllllIlIIlIIIIIlIIlIlIIl) {
        lllllllllllllIlIIlIIIIIlIIlIlIIl.add(new ItemStack(lllllllllllllIlIIlIIIIIlIIlIlIlI, ItemCoal.lIIIIlllIIlllI[0], ItemCoal.lIIIIlllIIlllI[1]));
        "".length();
        lllllllllllllIlIIlIIIIIlIIlIlIIl.add(new ItemStack(lllllllllllllIlIIlIIIIIlIIlIlIlI, ItemCoal.lIIIIlllIIlllI[0], ItemCoal.lIIIIlllIIlllI[0]));
        "".length();
    }
}
