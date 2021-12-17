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

public class Inventory
{
    private static final /* synthetic */ int[] lIIlIIIIlIIllI;
    private /* synthetic */ ArrayList items;
    private static final /* synthetic */ String[] lIIlIIIIlIIlIl;
    
    private void add(final Item lllllllllllllIIlllIllIlllllIIlIl) {
        this.items.add(lllllllllllllIIlllIllIlllllIIlIl);
        "".length();
    }
    
    private static void llIIlIIllIIIIIl() {
        (lIIlIIIIlIIllI = new int[4])[0] = ((0x89 ^ 0xB7) & ~(0x49 ^ 0x77) & ~((0x58 ^ 0x54) & ~(0x4E ^ 0x42)));
        Inventory.lIIlIIIIlIIllI[1] = " ".length();
        Inventory.lIIlIIIIlIIllI[2] = "  ".length();
        Inventory.lIIlIIIIlIIllI[3] = (0xAE ^ 0xBF ^ (0x1E ^ 0x7));
    }
    
    private static String llIIlIIlIllllIl(final String lllllllllllllIIlllIllIllllIlIIlI, final String lllllllllllllIIlllIllIllllIlIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIlllIllIllllIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIllIllllIlIIIl.getBytes(StandardCharsets.UTF_8)), Inventory.lIIlIIIIlIIllI[3]), "DES");
            final Cipher lllllllllllllIIlllIllIllllIlIlII = Cipher.getInstance("DES");
            lllllllllllllIIlllIllIllllIlIlII.init(Inventory.lIIlIIIIlIIllI[2], lllllllllllllIIlllIllIllllIlIlIl);
            return new String(lllllllllllllIIlllIllIllllIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIllIllllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIllIllllIlIIll) {
            lllllllllllllIIlllIllIllllIlIIll.printStackTrace();
            return null;
        }
    }
    
    static {
        llIIlIIllIIIIIl();
        llIIlIIlIllllll();
    }
    
    public void dump(final String lllllllllllllIIlllIllIllllIlllIl) {
        System.out.println(String.valueOf(new StringBuilder().append(lllllllllllllIIlllIllIllllIlllIl).append(Inventory.lIIlIIIIlIIlIl[Inventory.lIIlIIIIlIIllI[0]])));
        int lllllllllllllIIlllIllIllllIlllll = Inventory.lIIlIIIIlIIllI[0];
        while (llIIlIIllIIIIlI(lllllllllllllIIlllIllIllllIlllll, this.items.size())) {
            this.items.get(lllllllllllllIIlllIllIllllIlllll).dump(String.valueOf(new StringBuilder().append(lllllllllllllIIlllIllIllllIlllIl).append(Inventory.lIIlIIIIlIIlIl[Inventory.lIIlIIIIlIIllI[1]])));
            ++lllllllllllllIIlllIllIllllIlllll;
            "".length();
            if ((0x3D ^ 0x38) <= 0) {
                return;
            }
        }
    }
    
    private static void llIIlIIlIllllll() {
        (lIIlIIIIlIIlIl = new String[Inventory.lIIlIIIIlIIllI[2]])[Inventory.lIIlIIIIlIIllI[0]] = llIIlIIlIllllIl("zQs17XW16Cy8I6gxQLjHyQ==", "eFEyy");
        Inventory.lIIlIIIIlIIlIl[Inventory.lIIlIIIIlIIllI[1]] = llIIlIIlIlllllI("XQ==", "TEFlD");
    }
    
    private static String llIIlIIlIlllllI(String lllllllllllllIIlllIllIlllIllllIl, final String lllllllllllllIIlllIllIllllIIIIIl) {
        lllllllllllllIIlllIllIlllIllllIl = new String(Base64.getDecoder().decode(lllllllllllllIIlllIllIlllIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllIllIllllIIIIII = new StringBuilder();
        final char[] lllllllllllllIIlllIllIlllIllllll = lllllllllllllIIlllIllIllllIIIIIl.toCharArray();
        int lllllllllllllIIlllIllIlllIlllllI = Inventory.lIIlIIIIlIIllI[0];
        final long lllllllllllllIIlllIllIlllIlllIII = (Object)lllllllllllllIIlllIllIlllIllllIl.toCharArray();
        final byte lllllllllllllIIlllIllIlllIllIlll = (byte)lllllllllllllIIlllIllIlllIlllIII.length;
        double lllllllllllllIIlllIllIlllIllIllI = Inventory.lIIlIIIIlIIllI[0];
        while (llIIlIIllIIIIlI((int)lllllllllllllIIlllIllIlllIllIllI, lllllllllllllIIlllIllIlllIllIlll)) {
            final char lllllllllllllIIlllIllIllllIIIIll = lllllllllllllIIlllIllIlllIlllIII[lllllllllllllIIlllIllIlllIllIllI];
            lllllllllllllIIlllIllIllllIIIIII.append((char)(lllllllllllllIIlllIllIllllIIIIll ^ lllllllllllllIIlllIllIlllIllllll[lllllllllllllIIlllIllIlllIlllllI % lllllllllllllIIlllIllIlllIllllll.length]));
            "".length();
            ++lllllllllllllIIlllIllIlllIlllllI;
            ++lllllllllllllIIlllIllIlllIllIllI;
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllIllIllllIIIIII);
    }
    
    public Inventory() {
        this.items = new ArrayList();
    }
    
    private static boolean llIIlIIllIIIIlI(final int lllllllllllllIIlllIllIlllIllIIlI, final int lllllllllllllIIlllIllIlllIllIIIl) {
        return lllllllllllllIIlllIllIlllIllIIlI < lllllllllllllIIlllIllIlllIllIIIl;
    }
}
