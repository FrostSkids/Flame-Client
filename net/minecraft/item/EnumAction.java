// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public enum EnumAction
{
    private static final /* synthetic */ int[] lllIlIlllIIIll;
    
    DRINK(EnumAction.lllIlIllIlllll[EnumAction.lllIlIlllIIIll[2]], EnumAction.lllIlIlllIIIll[2]), 
    NONE(EnumAction.lllIlIllIlllll[EnumAction.lllIlIlllIIIll[0]], EnumAction.lllIlIlllIIIll[0]), 
    BLOCK(EnumAction.lllIlIllIlllll[EnumAction.lllIlIlllIIIll[3]], EnumAction.lllIlIlllIIIll[3]), 
    EAT(EnumAction.lllIlIllIlllll[EnumAction.lllIlIlllIIIll[1]], EnumAction.lllIlIlllIIIll[1]);
    
    private static final /* synthetic */ String[] lllIlIllIlllll;
    
    BOW(EnumAction.lllIlIllIlllll[EnumAction.lllIlIlllIIIll[4]], EnumAction.lllIlIlllIIIll[4]);
    
    private static String lIlIIIllIllIIlll(String llllllllllllIlIllIlIIlllIIlllllI, final String llllllllllllIlIllIlIIlllIlIIIIlI) {
        llllllllllllIlIllIlIIlllIIlllllI = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllIlIIlllIIlllllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIlIIlllIlIIIIIl = new StringBuilder();
        final char[] llllllllllllIlIllIlIIlllIlIIIIII = llllllllllllIlIllIlIIlllIlIIIIlI.toCharArray();
        int llllllllllllIlIllIlIIlllIIllllll = EnumAction.lllIlIlllIIIll[0];
        final char llllllllllllIlIllIlIIlllIIlllIIl = (Object)((String)llllllllllllIlIllIlIIlllIIlllllI).toCharArray();
        final char llllllllllllIlIllIlIIlllIIlllIII = (char)llllllllllllIlIllIlIIlllIIlllIIl.length;
        Exception llllllllllllIlIllIlIIlllIIllIlll = (Exception)EnumAction.lllIlIlllIIIll[0];
        while (lIlIIIllIlllIIIl((int)llllllllllllIlIllIlIIlllIIllIlll, llllllllllllIlIllIlIIlllIIlllIII)) {
            final char llllllllllllIlIllIlIIlllIlIIIlII = llllllllllllIlIllIlIIlllIIlllIIl[llllllllllllIlIllIlIIlllIIllIlll];
            llllllllllllIlIllIlIIlllIlIIIIIl.append((char)(llllllllllllIlIllIlIIlllIlIIIlII ^ llllllllllllIlIllIlIIlllIlIIIIII[llllllllllllIlIllIlIIlllIIllllll % llllllllllllIlIllIlIIlllIlIIIIII.length]));
            "".length();
            ++llllllllllllIlIllIlIIlllIIllllll;
            ++llllllllllllIlIllIlIIlllIIllIlll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIlIIlllIlIIIIIl);
    }
    
    private static String lIlIIIllIllIIlIl(final String llllllllllllIlIllIlIIlllIlIllllI, final String llllllllllllIlIllIlIIlllIlIlllIl) {
        try {
            final SecretKeySpec llllllllllllIlIllIlIIlllIllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlIIlllIlIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIlIIlllIllIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIlIIlllIllIIIlI.init(EnumAction.lllIlIlllIIIll[2], llllllllllllIlIllIlIIlllIllIIIll);
            return new String(llllllllllllIlIllIlIIlllIllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlIIlllIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIlIIlllIllIIIIl) {
            llllllllllllIlIllIlIIlllIllIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIIIllIllIIllI(final String llllllllllllIlIllIlIIlllIlIlIIIl, final String llllllllllllIlIllIlIIlllIlIlIIII) {
        try {
            final SecretKeySpec llllllllllllIlIllIlIIlllIlIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlIIlllIlIlIIII.getBytes(StandardCharsets.UTF_8)), EnumAction.lllIlIlllIIIll[6]), "DES");
            final Cipher llllllllllllIlIllIlIIlllIlIlIlIl = Cipher.getInstance("DES");
            llllllllllllIlIllIlIIlllIlIlIlIl.init(EnumAction.lllIlIlllIIIll[2], llllllllllllIlIllIlIIlllIlIlIllI);
            return new String(llllllllllllIlIllIlIIlllIlIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlIIlllIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIlIIlllIlIlIlII) {
            llllllllllllIlIllIlIIlllIlIlIlII.printStackTrace();
            return null;
        }
    }
    
    private EnumAction(final String llllllllllllIlIllIlIIlllIlllIIIl, final int llllllllllllIlIllIlIIlllIlllIIII) {
    }
    
    private static boolean lIlIIIllIlllIIIl(final int llllllllllllIlIllIlIIlllIIllIIll, final int llllllllllllIlIllIlIIlllIIllIIlI) {
        return llllllllllllIlIllIlIIlllIIllIIll < llllllllllllIlIllIlIIlllIIllIIlI;
    }
    
    static {
        lIlIIIllIlllIIII();
        lIlIIIllIllIlIII();
        final EnumAction[] enum$VALUES = new EnumAction[EnumAction.lllIlIlllIIIll[5]];
        enum$VALUES[EnumAction.lllIlIlllIIIll[0]] = EnumAction.NONE;
        enum$VALUES[EnumAction.lllIlIlllIIIll[1]] = EnumAction.EAT;
        enum$VALUES[EnumAction.lllIlIlllIIIll[2]] = EnumAction.DRINK;
        enum$VALUES[EnumAction.lllIlIlllIIIll[3]] = EnumAction.BLOCK;
        enum$VALUES[EnumAction.lllIlIlllIIIll[4]] = EnumAction.BOW;
        ENUM$VALUES = enum$VALUES;
    }
    
    private static void lIlIIIllIlllIIII() {
        (lllIlIlllIIIll = new int[7])[0] = ((0x72 ^ 0x6A) & ~(0xBE ^ 0xA6));
        EnumAction.lllIlIlllIIIll[1] = " ".length();
        EnumAction.lllIlIlllIIIll[2] = "  ".length();
        EnumAction.lllIlIlllIIIll[3] = "   ".length();
        EnumAction.lllIlIlllIIIll[4] = (14 + 24 + 70 + 31 ^ 73 + 76 - 89 + 83);
        EnumAction.lllIlIlllIIIll[5] = (0xAF ^ 0xAA);
        EnumAction.lllIlIlllIIIll[6] = (0xA5 ^ 0x92 ^ (0x5 ^ 0x3A));
    }
    
    private static void lIlIIIllIllIlIII() {
        (lllIlIllIlllll = new String[EnumAction.lllIlIlllIIIll[5]])[EnumAction.lllIlIlllIIIll[0]] = lIlIIIllIllIIlIl("t3s6ffuRM+A=", "RODLw");
        EnumAction.lllIlIllIlllll[EnumAction.lllIlIlllIIIll[1]] = lIlIIIllIllIIllI("5LsNXFqWbEE=", "Kdeof");
        EnumAction.lllIlIllIlllll[EnumAction.lllIlIlllIIIll[2]] = lIlIIIllIllIIlll("CxoABQA=", "OHIKK");
        EnumAction.lllIlIllIlllll[EnumAction.lllIlIlllIIIll[3]] = lIlIIIllIllIIllI("UwVPR/iXtZ8=", "AXQDR");
        EnumAction.lllIlIllIlllll[EnumAction.lllIlIlllIIIll[4]] = lIlIIIllIllIIllI("P5UEipc7+WQ=", "cPgsb");
    }
}
