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

public class Entity
{
    private /* synthetic */ Inventory invent;
    private static final /* synthetic */ String[] lllIlIllllIllI;
    private /* synthetic */ Stats stats;
    private /* synthetic */ float x;
    private /* synthetic */ float y;
    private static final /* synthetic */ int[] lllIlIllllIlll;
    
    private static void lIlIIIllllIIlIII() {
        (lllIlIllllIlll = new int[6])[0] = ((0x87 ^ 0xA4 ^ (0xF2 ^ 0x8A)) & (0xCE ^ 0x8F ^ (0x55 ^ 0x4F) ^ -" ".length()));
        Entity.lllIlIllllIlll[1] = " ".length();
        Entity.lllIlIllllIlll[2] = "  ".length();
        Entity.lllIlIllllIlll[3] = "   ".length();
        Entity.lllIlIllllIlll[4] = (0x55 ^ 0x28 ^ (0x39 ^ 0x40));
        Entity.lllIlIllllIlll[5] = (0x60 ^ 0x68);
    }
    
    private void add(final Stats llllllllllllIlIllIlIIIIllllIIIIl) {
        this.stats = llllllllllllIlIllIlIIIIllllIIIIl;
    }
    
    private static String lIlIIIlllIllIIlI(final String llllllllllllIlIllIlIIIIllIllIlll, final String llllllllllllIlIllIlIIIIllIllIllI) {
        try {
            final SecretKeySpec llllllllllllIlIllIlIIIIllIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlIIIIllIllIllI.getBytes(StandardCharsets.UTF_8)), Entity.lllIlIllllIlll[5]), "DES");
            final Cipher llllllllllllIlIllIlIIIIllIlllIll = Cipher.getInstance("DES");
            llllllllllllIlIllIlIIIIllIlllIll.init(Entity.lllIlIllllIlll[2], llllllllllllIlIllIlIIIIllIllllII);
            return new String(llllllllllllIlIllIlIIIIllIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlIIIIllIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIlIIIIllIlllIlI) {
            llllllllllllIlIllIlIIIIllIlllIlI.printStackTrace();
            return null;
        }
    }
    
    public void dump(final String llllllllllllIlIllIlIIIIlllIllIll) {
        System.out.println(String.valueOf(new StringBuilder().append(llllllllllllIlIllIlIIIIlllIllIll).append(Entity.lllIlIllllIllI[Entity.lllIlIllllIlll[0]]).append(this.x).append(Entity.lllIlIllllIllI[Entity.lllIlIllllIlll[1]]).append(this.y)));
        this.invent.dump(String.valueOf(new StringBuilder().append(llllllllllllIlIllIlIIIIlllIllIll).append(Entity.lllIlIllllIllI[Entity.lllIlIllllIlll[2]])));
        this.stats.dump(String.valueOf(new StringBuilder().append(llllllllllllIlIllIlIIIIlllIllIll).append(Entity.lllIlIllllIllI[Entity.lllIlIllllIlll[3]])));
    }
    
    private void add(final Inventory llllllllllllIlIllIlIIIIllllIIlIl) {
        this.invent = llllllllllllIlIllIlIIIIllllIIlIl;
    }
    
    private static String lIlIIIlllIllIIIl(String llllllllllllIlIllIlIIIIlllIIlIIl, final String llllllllllllIlIllIlIIIIlllIIllIl) {
        llllllllllllIlIllIlIIIIlllIIlIIl = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllIlIIIIlllIIlIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIlIIIIlllIIllII = new StringBuilder();
        final char[] llllllllllllIlIllIlIIIIlllIIlIll = llllllllllllIlIllIlIIIIlllIIllIl.toCharArray();
        int llllllllllllIlIllIlIIIIlllIIlIlI = Entity.lllIlIllllIlll[0];
        final int llllllllllllIlIllIlIIIIlllIIIlII = (Object)((String)llllllllllllIlIllIlIIIIlllIIlIIl).toCharArray();
        final int llllllllllllIlIllIlIIIIlllIIIIll = llllllllllllIlIllIlIIIIlllIIIlII.length;
        char llllllllllllIlIllIlIIIIlllIIIIlI = (char)Entity.lllIlIllllIlll[0];
        while (lIlIIIllllIIlIIl(llllllllllllIlIllIlIIIIlllIIIIlI, llllllllllllIlIllIlIIIIlllIIIIll)) {
            final char llllllllllllIlIllIlIIIIlllIIllll = llllllllllllIlIllIlIIIIlllIIIlII[llllllllllllIlIllIlIIIIlllIIIIlI];
            llllllllllllIlIllIlIIIIlllIIllII.append((char)(llllllllllllIlIllIlIIIIlllIIllll ^ llllllllllllIlIllIlIIIIlllIIlIll[llllllllllllIlIllIlIIIIlllIIlIlI % llllllllllllIlIllIlIIIIlllIIlIll.length]));
            "".length();
            ++llllllllllllIlIllIlIIIIlllIIlIlI;
            ++llllllllllllIlIllIlIIIIlllIIIIlI;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIlIIIIlllIIllII);
    }
    
    private static boolean lIlIIIllllIIlIIl(final int llllllllllllIlIllIlIIIIllIllIIIl, final int llllllllllllIlIllIlIIIIllIllIIII) {
        return llllllllllllIlIllIlIIIIllIllIIIl < llllllllllllIlIllIlIIIIllIllIIII;
    }
    
    private static void lIlIIIlllIllIIll() {
        (lllIlIllllIllI = new String[Entity.lllIlIllllIlll[4]])[Entity.lllIlIllllIlll[0]] = lIlIIIlllIllIIIl("EB0iHjAsUw==", "UsVwD");
        Entity.lllIlIllllIllI[Entity.lllIlIllllIlll[1]] = lIlIIIlllIllIIlI("gaRZwMoyIPU=", "Vytcr");
        Entity.lllIlIllllIllI[Entity.lllIlIllllIlll[2]] = lIlIIIlllIllIIIl("Tg==", "Gpeuq");
        Entity.lllIlIllllIllI[Entity.lllIlIllllIlll[3]] = lIlIIIlllIllIIIl("Wg==", "SYNPE");
    }
    
    static {
        lIlIIIllllIIlIII();
        lIlIIIlllIllIIll();
    }
}
