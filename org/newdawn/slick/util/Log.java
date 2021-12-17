// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.util;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public final class Log
{
    private static final /* synthetic */ String[] lIIllIIIIlIIlI;
    private static final /* synthetic */ int[] lIIllIIIIlllIl;
    private static /* synthetic */ boolean verbose;
    private static /* synthetic */ LogSystem logSystem;
    private static /* synthetic */ boolean forcedVerbose;
    
    public static void error(final String lllllllllllllIIlIllIlIlllIllIIll) {
        Log.logSystem.error(lllllllllllllIIlIllIlIlllIllIIll);
    }
    
    private static String llIlIlIllIlIlII(final String lllllllllllllIIlIllIlIlllIIlllII, final String lllllllllllllIIlIllIlIlllIIllIIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIlIlllIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIlIlllIIllIIl.getBytes(StandardCharsets.UTF_8)), Log.lIIllIIIIlllIl[3]), "DES");
            final Cipher lllllllllllllIIlIllIlIlllIIllllI = Cipher.getInstance("DES");
            lllllllllllllIIlIllIlIlllIIllllI.init(Log.lIIllIIIIlllIl[2], lllllllllllllIIlIllIlIlllIIlllll);
            return new String(lllllllllllllIIlIllIlIlllIIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIlIlllIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIlIlllIIlllIl) {
            lllllllllllllIIlIllIlIlllIIlllIl.printStackTrace();
            return null;
        }
    }
    
    private static String llIlIlIllIlIlIl(final String lllllllllllllIIlIllIlIlllIIIllll, final String lllllllllllllIIlIllIlIlllIIIllII) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIlIlllIIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIlIlllIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIllIlIlllIIlIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIllIlIlllIIlIIIl.init(Log.lIIllIIIIlllIl[2], lllllllllllllIIlIllIlIlllIIlIIlI);
            return new String(lllllllllllllIIlIllIlIlllIIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIlIlllIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIlIlllIIlIIII) {
            lllllllllllllIIlIllIlIlllIIlIIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIlIllllllIl(final int lllllllllllllIIlIllIlIlllIIIlIII) {
        return lllllllllllllIIlIllIlIlllIIIlIII != 0;
    }
    
    private static void llIlIlIllIlIllI() {
        (lIIllIIIIlIIlI = new String[Log.lIIllIIIIlllIl[2]])[Log.lIIllIIIIlllIl[1]] = llIlIlIllIlIlII("W0CtQvfQpcuDobUmvY77MXIur9sQfSYO+Vbt1sRLChe42gXuJJyoOw==", "uQXVN");
        Log.lIIllIIIIlIIlI[Log.lIIllIIIIlllIl[0]] = llIlIlIllIlIlIl("DB6Nya8Wdtg=", "cPzVi");
    }
    
    public static void debug(final String lllllllllllllIIlIllIlIlllIlIIlIl) {
        if (!llIlIlIlllllllI(Log.verbose ? 1 : 0) || llIlIlIllllllIl(Log.forcedVerbose ? 1 : 0)) {
            Log.logSystem.debug(lllllllllllllIIlIllIlIlllIlIIlIl);
        }
    }
    
    public static void checkVerboseLogSetting() {
        try {
            AccessController.doPrivileged((PrivilegedAction<Object>)new PrivilegedAction() {
                private static final /* synthetic */ String[] llIIllIIlIIllI;
                private static final /* synthetic */ int[] llIIllIIlIIlll;
                
                private static boolean lIIIlllIlIIIllIl(final Object llllllllllllIlllIIIIIllIlIlIlIlI) {
                    return llllllllllllIlllIIIIIllIlIlIlIlI != null;
                }
                
                static {
                    lIIIlllIlIIIllII();
                    lIIIlllIlIIIlIll();
                }
                
                private static String lIIIlllIlIIIlIlI(String llllllllllllIlllIIIIIllIllIIIlIl, final String llllllllllllIlllIIIIIllIllIIlIIl) {
                    llllllllllllIlllIIIIIllIllIIIlIl = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIIIIIllIllIIIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                    final StringBuilder llllllllllllIlllIIIIIllIllIIlIII = new StringBuilder();
                    final char[] llllllllllllIlllIIIIIllIllIIIlll = llllllllllllIlllIIIIIllIllIIlIIl.toCharArray();
                    int llllllllllllIlllIIIIIllIllIIIllI = Log$1.llIIllIIlIIlll[0];
                    final int llllllllllllIlllIIIIIllIllIIIIII = (Object)((String)llllllllllllIlllIIIIIllIllIIIlIl).toCharArray();
                    final short llllllllllllIlllIIIIIllIlIllllll = (short)llllllllllllIlllIIIIIllIllIIIIII.length;
                    double llllllllllllIlllIIIIIllIlIlllllI = Log$1.llIIllIIlIIlll[0];
                    while (lIIIlllIlIIIllll((int)llllllllllllIlllIIIIIllIlIlllllI, llllllllllllIlllIIIIIllIlIllllll)) {
                        final char llllllllllllIlllIIIIIllIllIIlIll = llllllllllllIlllIIIIIllIllIIIIII[llllllllllllIlllIIIIIllIlIlllllI];
                        llllllllllllIlllIIIIIllIllIIlIII.append((char)(llllllllllllIlllIIIIIllIllIIlIll ^ llllllllllllIlllIIIIIllIllIIIlll[llllllllllllIlllIIIIIllIllIIIllI % llllllllllllIlllIIIIIllIllIIIlll.length]));
                        "".length();
                        ++llllllllllllIlllIIIIIllIllIIIllI;
                        ++llllllllllllIlllIIIIIllIlIlllllI;
                        "".length();
                        if ("   ".length() <= " ".length()) {
                            return null;
                        }
                    }
                    return String.valueOf(llllllllllllIlllIIIIIllIllIIlIII);
                }
                
                private static boolean lIIIlllIlIIIlllI(final int llllllllllllIlllIIIIIllIlIlIlIII) {
                    return llllllllllllIlllIIIIIllIlIlIlIII != 0;
                }
                
                private static String lIIIlllIlIIIlIIl(final String llllllllllllIlllIIIIIllIlIllIIll, final String llllllllllllIlllIIIIIllIlIllIlII) {
                    try {
                        final SecretKeySpec llllllllllllIlllIIIIIllIlIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIIIllIlIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                        final Cipher llllllllllllIlllIIIIIllIlIllIlll = Cipher.getInstance("Blowfish");
                        llllllllllllIlllIIIIIllIlIllIlll.init(Log$1.llIIllIIlIIlll[2], llllllllllllIlllIIIIIllIlIlllIII);
                        return new String(llllllllllllIlllIIIIIllIlIllIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIIIllIlIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception llllllllllllIlllIIIIIllIlIllIllI) {
                        llllllllllllIlllIIIIIllIlIllIllI.printStackTrace();
                        return null;
                    }
                }
                
                private static void lIIIlllIlIIIllII() {
                    (llIIllIIlIIlll = new int[3])[0] = ((0x5C ^ 0x35 ^ (0xBE ^ 0xB5)) & (136 + 184 - 129 + 10 ^ 108 + 82 - 76 + 57 ^ -" ".length()));
                    Log$1.llIIllIIlIIlll[1] = " ".length();
                    Log$1.llIIllIIlIIlll[2] = "  ".length();
                }
                
                public Object run() {
                    final String llllllllllllIlllIIIIIllIllIlIllI = System.getProperty(Log$1.llIIllIIlIIllI[Log$1.llIIllIIlIIlll[0]]);
                    if (lIIIlllIlIIIllIl(llllllllllllIlllIIIIIllIllIlIllI) && lIIIlllIlIIIlllI(llllllllllllIlllIIIIIllIllIlIllI.equalsIgnoreCase(Log$1.llIIllIIlIIllI[Log$1.llIIllIIlIIlll[1]]) ? 1 : 0)) {
                        Log.setForcedVerboseOn();
                    }
                    return null;
                }
                
                private static void lIIIlllIlIIIlIll() {
                    (llIIllIIlIIllI = new String[Log$1.llIIllIIlIIlll[2]])[Log$1.llIIllIIlIIlll[0]] = lIIIlllIlIIIlIIl("x/lE5gS8JNRyyJld1jknlwFpfU1HnPDhPmOArrNV1eujMAi/djpkeQ==", "SQTZD");
                    Log$1.llIIllIIlIIllI[Log$1.llIIllIIlIIlll[1]] = lIIIlllIlIIIlIlI("NwUBCQ==", "CwtlF");
                }
                
                private static boolean lIIIlllIlIIIllll(final int llllllllllllIlllIIIIIllIlIlIllIl, final int llllllllllllIlllIIIIIllIlIlIllII) {
                    return llllllllllllIlllIIIIIllIlIlIllIl < llllllllllllIlllIIIIIllIlIlIllII;
                }
            });
            "".length();
            "".length();
            if (-(0x80 ^ 0x84) >= 0) {
                return;
            }
        }
        catch (Throwable t) {}
    }
    
    public static void warn(final String lllllllllllllIIlIllIlIlllIlIlIll, final Throwable lllllllllllllIIlIllIlIlllIlIllII) {
        Log.logSystem.warn(lllllllllllllIIlIllIlIlllIlIlIll, lllllllllllllIIlIllIlIlllIlIllII);
    }
    
    public static void error(final String lllllllllllllIIlIllIlIlllIllllII, final Throwable lllllllllllllIIlIllIlIlllIlllIIl) {
        Log.logSystem.error(lllllllllllllIIlIllIlIlllIllllII, lllllllllllllIIlIllIlIlllIlllIIl);
    }
    
    static {
        llIlIlIllllllII();
        llIlIlIllIlIllI();
        forceVerboseProperty = Log.lIIllIIIIlIIlI[Log.lIIllIIIIlllIl[1]];
        forceVerbosePropertyOnValue = Log.lIIllIIIIlIIlI[Log.lIIllIIIIlllIl[0]];
        Log.verbose = (Log.lIIllIIIIlllIl[0] != 0);
        Log.forcedVerbose = (Log.lIIllIIIIlllIl[1] != 0);
        Log.logSystem = new DefaultLogSystem();
    }
    
    private static void llIlIlIllllllII() {
        (lIIllIIIIlllIl = new int[4])[0] = " ".length();
        Log.lIIllIIIIlllIl[1] = ((0x90 ^ 0x9F) & ~(0xA9 ^ 0xA6));
        Log.lIIllIIIIlllIl[2] = "  ".length();
        Log.lIIllIIIIlllIl[3] = (0x59 ^ 0x42 ^ (0x41 ^ 0x52));
    }
    
    public static void error(final Throwable lllllllllllllIIlIllIlIlllIllIlll) {
        Log.logSystem.error(lllllllllllllIIlIllIlIlllIllIlll);
    }
    
    public static void warn(final String lllllllllllllIIlIllIlIlllIllIIII) {
        Log.logSystem.warn(lllllllllllllIIlIllIlIlllIllIIII);
    }
    
    private static boolean llIlIlIlllllllI(final int lllllllllllllIIlIllIlIlllIIIIllI) {
        return lllllllllllllIIlIllIlIlllIIIIllI == 0;
    }
    
    public static void info(final String lllllllllllllIIlIllIlIlllIlIIlll) {
        if (!llIlIlIlllllllI(Log.verbose ? 1 : 0) || llIlIlIllllllIl(Log.forcedVerbose ? 1 : 0)) {
            Log.logSystem.info(lllllllllllllIIlIllIlIlllIlIIlll);
        }
    }
    
    public static void setForcedVerboseOn() {
        Log.forcedVerbose = (Log.lIIllIIIIlllIl[0] != 0);
        Log.verbose = (Log.lIIllIIIIlllIl[0] != 0);
    }
    
    public static void setVerbose(final boolean lllllllllllllIIlIllIlIllllIIIIll) {
        if (llIlIlIllllllIl(Log.forcedVerbose ? 1 : 0)) {
            return;
        }
        Log.verbose = lllllllllllllIIlIllIlIllllIIIIll;
    }
    
    public static void setLogSystem(final LogSystem lllllllllllllIIlIllIlIllllIIIllI) {
        Log.logSystem = lllllllllllllIIlIllIlIllllIIIllI;
    }
    
    private Log() {
    }
}
