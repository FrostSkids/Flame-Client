// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.util;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Date;
import java.io.PrintStream;

public class DefaultLogSystem implements LogSystem
{
    private static final /* synthetic */ int[] lIlIIIlIIlIIlI;
    public static /* synthetic */ PrintStream out;
    private static final /* synthetic */ String[] lIlIIIlIIlIIIl;
    
    public void error(final Throwable lllllllllllllIIIlllllIllIllIIlII) {
        DefaultLogSystem.out.println(String.valueOf(new StringBuilder().append(new Date()).append(DefaultLogSystem.lIlIIIlIIlIIIl[DefaultLogSystem.lIlIIIlIIlIIlI[0]]).append(lllllllllllllIIIlllllIllIllIIlII.getMessage())));
        lllllllllllllIIIlllllIllIllIIlII.printStackTrace(DefaultLogSystem.out);
    }
    
    private static String lllIIIlIlIIllIl(final String lllllllllllllIIIlllllIllIIlIlIIl, final String lllllllllllllIIIlllllIllIIlIlIII) {
        try {
            final SecretKeySpec lllllllllllllIIIlllllIllIIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllllIllIIlIlIII.getBytes(StandardCharsets.UTF_8)), DefaultLogSystem.lIlIIIlIIlIIlI[6]), "DES");
            final Cipher lllllllllllllIIIlllllIllIIlIllIl = Cipher.getInstance("DES");
            lllllllllllllIIIlllllIllIIlIllIl.init(DefaultLogSystem.lIlIIIlIIlIIlI[2], lllllllllllllIIIlllllIllIIlIlllI);
            return new String(lllllllllllllIIIlllllIllIIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllllIllIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllllIllIIlIllII) {
            lllllllllllllIIIlllllIllIIlIllII.printStackTrace();
            return null;
        }
    }
    
    public void info(final String lllllllllllllIIIlllllIllIlIllIII) {
        DefaultLogSystem.out.println(String.valueOf(new StringBuilder().append(new Date()).append(DefaultLogSystem.lIlIIIlIIlIIIl[DefaultLogSystem.lIlIIIlIIlIIlI[3]]).append(lllllllllllllIIIlllllIllIlIllIII)));
    }
    
    private static boolean lllIIIlIlIlIIIl(final int lllllllllllllIIIlllllIllIIlIIIll, final int lllllllllllllIIIlllllIllIIlIIIlI) {
        return lllllllllllllIIIlllllIllIIlIIIll < lllllllllllllIIIlllllIllIIlIIIlI;
    }
    
    public void warn(final String lllllllllllllIIIlllllIllIlIlllIl) {
        DefaultLogSystem.out.println(String.valueOf(new StringBuilder().append(new Date()).append(DefaultLogSystem.lIlIIIlIIlIIIl[DefaultLogSystem.lIlIIIlIIlIIlI[2]]).append(lllllllllllllIIIlllllIllIlIlllIl)));
    }
    
    public void warn(final String lllllllllllllIIIlllllIllIlIIllII, final Throwable lllllllllllllIIIlllllIllIlIIlllI) {
        this.warn(lllllllllllllIIIlllllIllIlIIllII);
        lllllllllllllIIIlllllIllIlIIlllI.printStackTrace(DefaultLogSystem.out);
    }
    
    public void error(final String lllllllllllllIIIlllllIllIllIllII, final Throwable lllllllllllllIIIlllllIllIllIlIII) {
        this.error(lllllllllllllIIIlllllIllIllIllII);
        this.error(lllllllllllllIIIlllllIllIllIlIII);
    }
    
    public void error(final String lllllllllllllIIIlllllIllIllIIIIl) {
        DefaultLogSystem.out.println(String.valueOf(new StringBuilder().append(new Date()).append(DefaultLogSystem.lIlIIIlIIlIIIl[DefaultLogSystem.lIlIIIlIIlIIlI[1]]).append(lllllllllllllIIIlllllIllIllIIIIl)));
    }
    
    static {
        lllIIIlIlIlIIII();
        lllIIIlIlIIllll();
        DefaultLogSystem.out = System.out;
    }
    
    private static String lllIIIlIlIIlllI(String lllllllllllllIIIlllllIllIIlllIll, final String lllllllllllllIIIlllllIllIIlllIlI) {
        lllllllllllllIIIlllllIllIIlllIll = new String(Base64.getDecoder().decode(lllllllllllllIIIlllllIllIIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlllllIllIIlllllI = new StringBuilder();
        final char[] lllllllllllllIIIlllllIllIIllllIl = lllllllllllllIIIlllllIllIIlllIlI.toCharArray();
        int lllllllllllllIIIlllllIllIIllllII = DefaultLogSystem.lIlIIIlIIlIIlI[0];
        final String lllllllllllllIIIlllllIllIIllIllI = (Object)lllllllllllllIIIlllllIllIIlllIll.toCharArray();
        final Exception lllllllllllllIIIlllllIllIIllIlIl = (Exception)lllllllllllllIIIlllllIllIIllIllI.length;
        double lllllllllllllIIIlllllIllIIllIlII = DefaultLogSystem.lIlIIIlIIlIIlI[0];
        while (lllIIIlIlIlIIIl((int)lllllllllllllIIIlllllIllIIllIlII, (int)lllllllllllllIIIlllllIllIIllIlIl)) {
            final char lllllllllllllIIIlllllIllIlIIIIIl = lllllllllllllIIIlllllIllIIllIllI[lllllllllllllIIIlllllIllIIllIlII];
            lllllllllllllIIIlllllIllIIlllllI.append((char)(lllllllllllllIIIlllllIllIlIIIIIl ^ lllllllllllllIIIlllllIllIIllllIl[lllllllllllllIIIlllllIllIIllllII % lllllllllllllIIIlllllIllIIllllIl.length]));
            "".length();
            ++lllllllllllllIIIlllllIllIIllllII;
            ++lllllllllllllIIIlllllIllIIllIlII;
            "".length();
            if (" ".length() >= (0x8E ^ 0x8A)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlllllIllIIlllllI);
    }
    
    private static void lllIIIlIlIlIIII() {
        (lIlIIIlIIlIIlI = new int[7])[0] = ((0xB8 ^ 0x90) & ~(0x16 ^ 0x3E));
        DefaultLogSystem.lIlIIIlIIlIIlI[1] = " ".length();
        DefaultLogSystem.lIlIIIlIIlIIlI[2] = "  ".length();
        DefaultLogSystem.lIlIIIlIIlIIlI[3] = "   ".length();
        DefaultLogSystem.lIlIIIlIIlIIlI[4] = (0xB4 ^ 0xA5 ^ (0xAC ^ 0xB9));
        DefaultLogSystem.lIlIIIlIIlIIlI[5] = (136 + 19 - 77 + 67 ^ 63 + 55 - 72 + 102);
        DefaultLogSystem.lIlIIIlIIlIIlI[6] = (0x5 ^ 0x60 ^ (0x1 ^ 0x6C));
    }
    
    public void debug(final String lllllllllllllIIIlllllIllIlIlIlIl) {
        DefaultLogSystem.out.println(String.valueOf(new StringBuilder().append(new Date()).append(DefaultLogSystem.lIlIIIlIIlIIIl[DefaultLogSystem.lIlIIIlIIlIIlI[4]]).append(lllllllllllllIIIlllllIllIlIlIlIl)));
    }
    
    private static void lllIIIlIlIIllll() {
        (lIlIIIlIIlIIIl = new String[DefaultLogSystem.lIlIIIlIIlIIlI[5]])[DefaultLogSystem.lIlIIIlIIlIIlI[0]] = lllIIIlIlIIllIl("v/Q/Dl1YuP4=", "gNOMq");
        DefaultLogSystem.lIlIIIlIIlIIIl[DefaultLogSystem.lIlIIIlIIlIIlI[1]] = lllIIIlIlIIllIl("ZyLN45hrNy0=", "CkeNt");
        DefaultLogSystem.lIlIIIlIIlIIIl[DefaultLogSystem.lIlIIIlIIlIIlI[2]] = lllIIIlIlIIllIl("iLJqpydg5U4=", "Zxmtp");
        DefaultLogSystem.lIlIIIlIIlIIIl[DefaultLogSystem.lIlIIIlIIlIIlI[3]] = lllIIIlIlIIlllI("egA5Cj9g", "ZIwLp");
        DefaultLogSystem.lIlIIIlIIlIIIl[DefaultLogSystem.lIlIIIlIIlIIlI[4]] = lllIIIlIlIIlllI("eDIJOhgfTA==", "XvLxM");
    }
}
