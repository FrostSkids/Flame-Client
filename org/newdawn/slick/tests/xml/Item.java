// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests.xml;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Item
{
    protected /* synthetic */ int condition;
    private static final /* synthetic */ int[] lIlIIIIIIIlllI;
    private static final /* synthetic */ String[] lIlIIIIIIIllIl;
    protected /* synthetic */ String name;
    
    public void dump(final String lllllllllllllIIlIIIlIlIlIIIIllII) {
        System.out.println(String.valueOf(new StringBuilder().append(lllllllllllllIIlIIIlIlIlIIIIllII).append(Item.lIlIIIIIIIllIl[Item.lIlIIIIIIIlllI[0]]).append(this.name).append(Item.lIlIIIIIIIllIl[Item.lIlIIIIIIIlllI[1]]).append(this.condition)));
    }
    
    private static void llIllllllllllll() {
        (lIlIIIIIIIlllI = new int[3])[0] = ((0x8B ^ 0x9D) & ~(0x80 ^ 0x96));
        Item.lIlIIIIIIIlllI[1] = " ".length();
        Item.lIlIIIIIIIlllI[2] = "  ".length();
    }
    
    static {
        llIllllllllllll();
        llIlllllllllllI();
    }
    
    private static String llIllllllllllII(String lllllllllllllIIlIIIlIlIIlllIllIl, final String lllllllllllllIIlIIIlIlIIllllIIIl) {
        lllllllllllllIIlIIIlIlIIlllIllIl = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIIlIlIIlllIllIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIIlIlIIllllIIII = new StringBuilder();
        final char[] lllllllllllllIIlIIIlIlIIlllIllll = lllllllllllllIIlIIIlIlIIllllIIIl.toCharArray();
        int lllllllllllllIIlIIIlIlIIlllIlllI = Item.lIlIIIIIIIlllI[0];
        final long lllllllllllllIIlIIIlIlIIlllIlIII = (Object)((String)lllllllllllllIIlIIIlIlIIlllIllIl).toCharArray();
        final char lllllllllllllIIlIIIlIlIIlllIIlll = (char)lllllllllllllIIlIIIlIlIIlllIlIII.length;
        long lllllllllllllIIlIIIlIlIIlllIIllI = Item.lIlIIIIIIIlllI[0];
        while (lllIIIIIIIIIIII((int)lllllllllllllIIlIIIlIlIIlllIIllI, lllllllllllllIIlIIIlIlIIlllIIlll)) {
            final char lllllllllllllIIlIIIlIlIIllllIIll = lllllllllllllIIlIIIlIlIIlllIlIII[lllllllllllllIIlIIIlIlIIlllIIllI];
            lllllllllllllIIlIIIlIlIIllllIIII.append((char)(lllllllllllllIIlIIIlIlIIllllIIll ^ lllllllllllllIIlIIIlIlIIlllIllll[lllllllllllllIIlIIIlIlIIlllIlllI % lllllllllllllIIlIIIlIlIIlllIllll.length]));
            "".length();
            ++lllllllllllllIIlIIIlIlIIlllIlllI;
            ++lllllllllllllIIlIIIlIlIIlllIIllI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIIlIlIIllllIIII);
    }
    
    private static boolean lllIIIIIIIIIIII(final int lllllllllllllIIlIIIlIlIIlllIIIlI, final int lllllllllllllIIlIIIlIlIIlllIIIIl) {
        return lllllllllllllIIlIIIlIlIIlllIIIlI < lllllllllllllIIlIIIlIlIIlllIIIIl;
    }
    
    private static String llIllllllllllIl(final String lllllllllllllIIlIIIlIlIlIIIIIIII, final String lllllllllllllIIlIIIlIlIIllllllll) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIlIlIlIIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIlIlIIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIIlIlIlIIIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIIlIlIlIIIIIlII.init(Item.lIlIIIIIIIlllI[2], lllllllllllllIIlIIIlIlIlIIIIIlIl);
            return new String(lllllllllllllIIlIIIlIlIlIIIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIlIlIlIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIlIlIlIIIIIIll) {
            lllllllllllllIIlIIIlIlIlIIIIIIll.printStackTrace();
            return null;
        }
    }
    
    private static void llIlllllllllllI() {
        (lIlIIIIIIIllIl = new String[Item.lIlIIIIIIIlllI[2]])[Item.lIlIIIIIIIlllI[0]] = llIllllllllllII("EQMQPGo=", "XwuQJ");
        Item.lIlIIIIIIIllIl[Item.lIlIIIIIIIlllI[1]] = llIllllllllllIl("NrXWAAhkMpU=", "jbXVn");
    }
}
