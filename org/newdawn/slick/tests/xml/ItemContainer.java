// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests.xml;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;

public class ItemContainer extends Item
{
    private /* synthetic */ ArrayList items;
    private static final /* synthetic */ String[] lIlllIlIlIllII;
    private static final /* synthetic */ int[] lIlllIllIIIIlI;
    
    private static String lIIIIIlIllIlIIIl(final String llllllllllllIllllIlllIlllIIllIll, final String llllllllllllIllllIlllIlllIIllIlI) {
        try {
            final SecretKeySpec llllllllllllIllllIlllIlllIlIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlllIlllIIllIlI.getBytes(StandardCharsets.UTF_8)), ItemContainer.lIlllIllIIIIlI[4]), "DES");
            final Cipher llllllllllllIllllIlllIlllIIlllll = Cipher.getInstance("DES");
            llllllllllllIllllIlllIlllIIlllll.init(ItemContainer.lIlllIllIIIIlI[2], llllllllllllIllllIlllIlllIlIIIII);
            return new String(llllllllllllIllllIlllIlllIIlllll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlllIlllIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlllIlllIIllllI) {
            llllllllllllIllllIlllIlllIIllllI.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIIlIllIlIlII() {
        (lIlllIlIlIllII = new String[ItemContainer.lIlllIllIIIIlI[3]])[ItemContainer.lIlllIllIIIIlI[0]] = lIIIIIlIllIlIIIl("nB3ZTSjkqOgohG9yXVu0kQ==", "LNzPq");
        ItemContainer.lIlllIlIlIllII[ItemContainer.lIlllIllIIIIlI[1]] = lIIIIIlIllIlIIlI("/fJaqRgXPUI=", "bjxyR");
        ItemContainer.lIlllIlIlIllII[ItemContainer.lIlllIllIIIIlI[2]] = lIIIIIlIllIlIIll("XA==", "UIErD");
    }
    
    private static String lIIIIIlIllIlIIll(String llllllllllllIllllIlllIlllIIIlIII, final String llllllllllllIllllIlllIlllIIIIlll) {
        llllllllllllIllllIlllIlllIIIlIII = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIlllIlllIIIlIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIlllIlllIIIlIll = new StringBuilder();
        final char[] llllllllllllIllllIlllIlllIIIlIlI = llllllllllllIllllIlllIlllIIIIlll.toCharArray();
        int llllllllllllIllllIlllIlllIIIlIIl = ItemContainer.lIlllIllIIIIlI[0];
        final byte llllllllllllIllllIlllIlllIIIIIll = (Object)((String)llllllllllllIllllIlllIlllIIIlIII).toCharArray();
        final short llllllllllllIllllIlllIlllIIIIIlI = (short)llllllllllllIllllIlllIlllIIIIIll.length;
        float llllllllllllIllllIlllIlllIIIIIIl = ItemContainer.lIlllIllIIIIlI[0];
        while (lIIIIIllIIIlllll((int)llllllllllllIllllIlllIlllIIIIIIl, llllllllllllIllllIlllIlllIIIIIlI)) {
            final char llllllllllllIllllIlllIlllIIIlllI = llllllllllllIllllIlllIlllIIIIIll[llllllllllllIllllIlllIlllIIIIIIl];
            llllllllllllIllllIlllIlllIIIlIll.append((char)(llllllllllllIllllIlllIlllIIIlllI ^ llllllllllllIllllIlllIlllIIIlIlI[llllllllllllIllllIlllIlllIIIlIIl % llllllllllllIllllIlllIlllIIIlIlI.length]));
            "".length();
            ++llllllllllllIllllIlllIlllIIIlIIl;
            ++llllllllllllIllllIlllIlllIIIIIIl;
            "".length();
            if ("   ".length() <= ((0x68 ^ 0x2E ^ (0xC7 ^ 0xAD)) & (0xFF ^ 0xC4 ^ (0x59 ^ 0x4E) ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIlllIlllIIIlIll);
    }
    
    private void setCondition(final int llllllllllllIllllIlllIlllIllIIII) {
        this.condition = llllllllllllIllllIlllIlllIllIIII;
    }
    
    private static void lIIIIIllIIIlllIl() {
        (lIlllIllIIIIlI = new int[5])[0] = ((9 + 41 + 39 + 72 ^ 29 + 141 - 22 + 27) & (0x2D ^ 0x3A ^ (0x60 ^ 0x79) ^ -" ".length()));
        ItemContainer.lIlllIllIIIIlI[1] = " ".length();
        ItemContainer.lIlllIllIIIIlI[2] = "  ".length();
        ItemContainer.lIlllIllIIIIlI[3] = "   ".length();
        ItemContainer.lIlllIllIIIIlI[4] = (0x61 ^ 0x69);
    }
    
    @Override
    public void dump(final String llllllllllllIllllIlllIlllIlIlIII) {
        System.out.println(String.valueOf(new StringBuilder().append(llllllllllllIllllIlllIlllIlIlIII).append(ItemContainer.lIlllIlIlIllII[ItemContainer.lIlllIllIIIIlI[0]]).append(this.name).append(ItemContainer.lIlllIlIlIllII[ItemContainer.lIlllIllIIIIlI[1]]).append(this.condition)));
        int llllllllllllIllllIlllIlllIlIlIlI = ItemContainer.lIlllIllIIIIlI[0];
        while (lIIIIIllIIIlllll(llllllllllllIllllIlllIlllIlIlIlI, this.items.size())) {
            this.items.get(llllllllllllIllllIlllIlllIlIlIlI).dump(String.valueOf(new StringBuilder().append(llllllllllllIllllIlllIlllIlIlIII).append(ItemContainer.lIlllIlIlIllII[ItemContainer.lIlllIllIIIIlI[2]])));
            ++llllllllllllIllllIlllIlllIlIlIlI;
            "".length();
            if (-" ".length() >= ((0xD9 ^ 0x9E) & ~(0xE4 ^ 0xA3))) {
                return;
            }
        }
    }
    
    private static String lIIIIIlIllIlIIlI(final String llllllllllllIllllIlllIllIllllIII, final String llllllllllllIllllIlllIllIlllIlll) {
        try {
            final SecretKeySpec llllllllllllIllllIlllIllIllllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlllIllIlllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIlllIllIllllIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllllIlllIllIllllIlI.init(ItemContainer.lIlllIllIIIIlI[2], llllllllllllIllllIlllIllIllllIll);
            return new String(llllllllllllIllllIlllIllIllllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlllIllIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlllIllIllllIIl) {
            llllllllllllIllllIlllIllIllllIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIIllIIIlllll(final int llllllllllllIllllIlllIllIlllIIII, final int llllllllllllIllllIlllIllIllIllll) {
        return llllllllllllIllllIlllIllIlllIIII < llllllllllllIllllIlllIllIllIllll;
    }
    
    private void setName(final String llllllllllllIllllIlllIlllIllIlII) {
        this.name = llllllllllllIllllIlllIlllIllIlII;
    }
    
    private void add(final Item llllllllllllIllllIlllIlllIlllIlI) {
        this.items.add(llllllllllllIllllIlllIlllIlllIlI);
        "".length();
    }
    
    public ItemContainer() {
        this.items = new ArrayList();
    }
    
    static {
        lIIIIIllIIIlllIl();
        lIIIIIlIllIlIlII();
    }
}
