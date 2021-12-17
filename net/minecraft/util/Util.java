// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import org.apache.logging.log4j.Logger;
import java.util.concurrent.FutureTask;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Util
{
    private static final /* synthetic */ String[] llIlIIIIIIIIlI;
    private static final /* synthetic */ int[] llIlIIIIIIIIll;
    
    private static boolean lIIlIIIIlllIlIll(final int llllllllllllIllIlllIIIIIllIllIIl) {
        return llllllllllllIllIlllIIIIIllIllIIl != 0;
    }
    
    private static String lIIlIIIIlllIIllI(String llllllllllllIllIlllIIIIlIIIIIIIl, final String llllllllllllIllIlllIIIIlIIIIIIII) {
        llllllllllllIllIlllIIIIlIIIIIIIl = new String(Base64.getDecoder().decode(llllllllllllIllIlllIIIIlIIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlllIIIIlIIIIIlII = new StringBuilder();
        final char[] llllllllllllIllIlllIIIIlIIIIIIll = llllllllllllIllIlllIIIIlIIIIIIII.toCharArray();
        int llllllllllllIllIlllIIIIlIIIIIIlI = Util.llIlIIIIIIIIll[0];
        final Exception llllllllllllIllIlllIIIIIllllllII = (Object)llllllllllllIllIlllIIIIlIIIIIIIl.toCharArray();
        final String llllllllllllIllIlllIIIIIlllllIll = (String)llllllllllllIllIlllIIIIIllllllII.length;
        short llllllllllllIllIlllIIIIIlllllIlI = (short)Util.llIlIIIIIIIIll[0];
        while (lIIlIIIIlllIllII(llllllllllllIllIlllIIIIIlllllIlI, (int)llllllllllllIllIlllIIIIIlllllIll)) {
            final char llllllllllllIllIlllIIIIlIIIIIlll = llllllllllllIllIlllIIIIIllllllII[llllllllllllIllIlllIIIIIlllllIlI];
            llllllllllllIllIlllIIIIlIIIIIlII.append((char)(llllllllllllIllIlllIIIIlIIIIIlll ^ llllllllllllIllIlllIIIIlIIIIIIll[llllllllllllIllIlllIIIIlIIIIIIlI % llllllllllllIllIlllIIIIlIIIIIIll.length]));
            "".length();
            ++llllllllllllIllIlllIIIIlIIIIIIlI;
            ++llllllllllllIllIlllIIIIIlllllIlI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlllIIIIlIIIIIlII);
    }
    
    private static String lIIlIIIIlllIIlll(final String llllllllllllIllIlllIIIIIlllIIIlI, final String llllllllllllIllIlllIIIIIlllIIIll) {
        try {
            final SecretKeySpec llllllllllllIllIlllIIIIIlllIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIIIIIlllIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlllIIIIIlllIIllI = Cipher.getInstance("Blowfish");
            llllllllllllIllIlllIIIIIlllIIllI.init(Util.llIlIIIIIIIIll[2], llllllllllllIllIlllIIIIIlllIIlll);
            return new String(llllllllllllIllIlllIIIIIlllIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIIIIIlllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllIIIIIlllIIlIl) {
            llllllllllllIllIlllIIIIIlllIIlIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlIIIIlllIlIlI() {
        (llIlIIIIIIIIll = new int[10])[0] = ((96 + 78 - 72 + 142 ^ 94 + 97 - 28 + 3) & (186 + 74 - 183 + 133 ^ 25 + 21 - 37 + 119 ^ -" ".length()));
        Util.llIlIIIIIIIIll[1] = " ".length();
        Util.llIlIIIIIIIIll[2] = "  ".length();
        Util.llIlIIIIIIIIll[3] = "   ".length();
        Util.llIlIIIIIIIIll[4] = (0x77 ^ 0x73);
        Util.llIlIIIIIIIIll[5] = (0x43 ^ 0x49 ^ (0x59 ^ 0x56));
        Util.llIlIIIIIIIIll[6] = (0xA ^ 0x39 ^ (0x24 ^ 0x11));
        Util.llIlIIIIIIIIll[7] = (0x3D ^ 0x3A);
        Util.llIlIIIIIIIIll[8] = (0x88 ^ 0xA8 ^ (0x7F ^ 0x57));
        Util.llIlIIIIIIIIll[9] = (26 + 19 + 1 + 103 ^ 14 + 140 - 78 + 80);
    }
    
    public static <V> V func_181617_a(final FutureTask<V> llllllllllllIllIlllIIIIlIIIlIlll, final Logger llllllllllllIllIlllIIIIlIIIlIIlI) {
        try {
            llllllllllllIllIlllIIIIlIIIlIlll.run();
            return llllllllllllIllIlllIIIIlIIIlIlll.get();
        }
        catch (ExecutionException llllllllllllIllIlllIIIIlIIIlIlIl) {
            llllllllllllIllIlllIIIIlIIIlIIlI.fatal(Util.llIlIIIIIIIIlI[Util.llIlIIIIIIIIll[7]], (Throwable)llllllllllllIllIlllIIIIlIIIlIlIl);
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        catch (InterruptedException llllllllllllIllIlllIIIIlIIIlIlII) {
            llllllllllllIllIlllIIIIlIIIlIIlI.fatal(Util.llIlIIIIIIIIlI[Util.llIlIIIIIIIIll[8]], (Throwable)llllllllllllIllIlllIIIIlIIIlIlII);
        }
        return null;
    }
    
    private static boolean lIIlIIIIlllIllII(final int llllllllllllIllIlllIIIIIllIlllII, final int llllllllllllIllIlllIIIIIllIllIll) {
        return llllllllllllIllIlllIIIIIllIlllII < llllllllllllIllIlllIIIIIllIllIll;
    }
    
    public static EnumOS getOSType() {
        final String llllllllllllIllIlllIIIIlIIIlllII = System.getProperty(Util.llIlIIIIIIIIlI[Util.llIlIIIIIIIIll[0]]).toLowerCase();
        EnumOS enumOS;
        if (lIIlIIIIlllIlIll(llllllllllllIllIlllIIIIlIIIlllII.contains(Util.llIlIIIIIIIIlI[Util.llIlIIIIIIIIll[1]]) ? 1 : 0)) {
            enumOS = EnumOS.WINDOWS;
            "".length();
            if ("   ".length() == (0x24 ^ 0x20)) {
                return null;
            }
        }
        else if (lIIlIIIIlllIlIll(llllllllllllIllIlllIIIIlIIIlllII.contains(Util.llIlIIIIIIIIlI[Util.llIlIIIIIIIIll[2]]) ? 1 : 0)) {
            enumOS = EnumOS.OSX;
            "".length();
            if ((0x48 ^ 0x62 ^ (0x8F ^ 0xA1)) < 0) {
                return null;
            }
        }
        else if (lIIlIIIIlllIlIll(llllllllllllIllIlllIIIIlIIIlllII.contains(Util.llIlIIIIIIIIlI[Util.llIlIIIIIIIIll[3]]) ? 1 : 0)) {
            enumOS = EnumOS.SOLARIS;
            "".length();
            if (-" ".length() >= (0x53 ^ 0x57)) {
                return null;
            }
        }
        else if (lIIlIIIIlllIlIll(llllllllllllIllIlllIIIIlIIIlllII.contains(Util.llIlIIIIIIIIlI[Util.llIlIIIIIIIIll[4]]) ? 1 : 0)) {
            enumOS = EnumOS.SOLARIS;
            "".length();
            if (" ".length() <= ((0x6 ^ 0x4A ^ (0xE4 ^ 0x8C)) & (0xB6 ^ 0xB3 ^ (0x84 ^ 0xA5) ^ -" ".length()))) {
                return null;
            }
        }
        else if (lIIlIIIIlllIlIll(llllllllllllIllIlllIIIIlIIIlllII.contains(Util.llIlIIIIIIIIlI[Util.llIlIIIIIIIIll[5]]) ? 1 : 0)) {
            enumOS = EnumOS.LINUX;
            "".length();
            if ("  ".length() == -" ".length()) {
                return null;
            }
        }
        else if (lIIlIIIIlllIlIll(llllllllllllIllIlllIIIIlIIIlllII.contains(Util.llIlIIIIIIIIlI[Util.llIlIIIIIIIIll[6]]) ? 1 : 0)) {
            enumOS = EnumOS.LINUX;
            "".length();
            if ((0x27 ^ 0x23) <= " ".length()) {
                return null;
            }
        }
        else {
            enumOS = EnumOS.UNKNOWN;
        }
        return enumOS;
    }
    
    private static void lIIlIIIIlllIlIIl() {
        (llIlIIIIIIIIlI = new String[Util.llIlIIIIIIIIll[9]])[Util.llIlIIIIIIIIll[0]] = lIIlIIIIlllIIllI("ACFcHBQCNw==", "oRrru");
        Util.llIlIIIIIIIIlI[Util.llIlIIIIIIIIll[1]] = lIIlIIIIlllIIlll("tbVILgMP8Ps=", "qRxoq");
        Util.llIlIIIIIIIIlI[Util.llIlIIIIIIIIll[2]] = lIIlIIIIlllIIllI("PRsO", "PzmLr");
        Util.llIlIIIIIIIIlI[Util.llIlIIIIIIIIll[3]] = lIIlIIIIlllIlIII("tZgVlhU31uc=", "YjSjh");
        Util.llIlIIIIIIIIlI[Util.llIlIIIIIIIIll[4]] = lIIlIIIIlllIIllI("IBkJOwE=", "SlgTr");
        Util.llIlIIIIIIIIlI[Util.llIlIIIIIIIIll[5]] = lIIlIIIIlllIIllI("NTwNLAo=", "YUcYr");
        Util.llIlIIIIIIIIlI[Util.llIlIIIIIIIIll[6]] = lIIlIIIIlllIIlll("ckVo0P0ZOWU=", "pSOoe");
        Util.llIlIIIIIIIIlI[Util.llIlIIIIIIIIll[7]] = lIIlIIIIlllIlIII("EJTTCAws+wZUPaYkQw9cK5kZc31N82Gr", "ncpcv");
        Util.llIlIIIIIIIIlI[Util.llIlIIIIIIIIll[8]] = lIIlIIIIlllIlIII("enNNN7J9AJD2oOOQndI1QqqztlGOyTjL", "kAxsj");
    }
    
    private static String lIIlIIIIlllIlIII(final String llllllllllllIllIlllIIIIIlllIllll, final String llllllllllllIllIlllIIIIIlllIlllI) {
        try {
            final SecretKeySpec llllllllllllIllIlllIIIIIllllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIIIIIlllIlllI.getBytes(StandardCharsets.UTF_8)), Util.llIlIIIIIIIIll[8]), "DES");
            final Cipher llllllllllllIllIlllIIIIIllllIIll = Cipher.getInstance("DES");
            llllllllllllIllIlllIIIIIllllIIll.init(Util.llIlIIIIIIIIll[2], llllllllllllIllIlllIIIIIllllIlII);
            return new String(llllllllllllIllIlllIIIIIllllIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIIIIIlllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllIIIIIllllIIlI) {
            llllllllllllIllIlllIIIIIllllIIlI.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIlIIIIlllIlIlI();
        lIIlIIIIlllIlIIl();
    }
    
    public enum EnumOS
    {
        private static final /* synthetic */ int[] lllIIlIIIIIlIl;
        
        WINDOWS(EnumOS.lllIIlIIIIIlII[EnumOS.lllIIlIIIIIlIl[2]], EnumOS.lllIIlIIIIIlIl[2]), 
        LINUX(EnumOS.lllIIlIIIIIlII[EnumOS.lllIIlIIIIIlIl[0]], EnumOS.lllIIlIIIIIlIl[0]), 
        UNKNOWN(EnumOS.lllIIlIIIIIlII[EnumOS.lllIIlIIIIIlIl[4]], EnumOS.lllIIlIIIIIlIl[4]);
        
        private static final /* synthetic */ String[] lllIIlIIIIIlII;
        
        SOLARIS(EnumOS.lllIIlIIIIIlII[EnumOS.lllIIlIIIIIlIl[1]], EnumOS.lllIIlIIIIIlIl[1]), 
        OSX(EnumOS.lllIIlIIIIIlII[EnumOS.lllIIlIIIIIlIl[3]], EnumOS.lllIIlIIIIIlIl[3]);
        
        private static void lIIllllIlIIllIll() {
            (lllIIlIIIIIlIl = new int[7])[0] = ((0xE7 ^ 0xBC ^ (0x1D ^ 0x48)) & (88 + 61 - 61 + 48 ^ 74 + 40 - 46 + 66 ^ -" ".length()));
            EnumOS.lllIIlIIIIIlIl[1] = " ".length();
            EnumOS.lllIIlIIIIIlIl[2] = "  ".length();
            EnumOS.lllIIlIIIIIlIl[3] = "   ".length();
            EnumOS.lllIIlIIIIIlIl[4] = (0x31 ^ 0x34 ^ " ".length());
            EnumOS.lllIIlIIIIIlIl[5] = (0x4B ^ 0x4E);
            EnumOS.lllIIlIIIIIlIl[6] = (0x4D ^ 0x45);
        }
        
        private static String lIIllllIlIIllIIl(final String llllllllllllIlIlllllIllIlllllIlI, final String llllllllllllIlIlllllIllIlllllIIl) {
            try {
                final SecretKeySpec llllllllllllIlIlllllIllIllllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllllIllIlllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlIlllllIllIllllllII = Cipher.getInstance("Blowfish");
                llllllllllllIlIlllllIllIllllllII.init(EnumOS.lllIIlIIIIIlIl[2], llllllllllllIlIlllllIllIllllllIl);
                return new String(llllllllllllIlIlllllIllIllllllII.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllllIllIlllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIlllllIllIlllllIll) {
                llllllllllllIlIlllllIllIlllllIll.printStackTrace();
                return null;
            }
        }
        
        private static void lIIllllIlIIllIlI() {
            (lllIIlIIIIIlII = new String[EnumOS.lllIIlIIIIIlIl[5]])[EnumOS.lllIIlIIIIIlIl[0]] = lIIllllIlIIllIII("dOW3gEGqzXE=", "FbutL");
            EnumOS.lllIIlIIIIIlII[EnumOS.lllIIlIIIIIlIl[1]] = lIIllllIlIIllIII("lWJznlwrNNQ=", "MdGde");
            EnumOS.lllIIlIIIIIlII[EnumOS.lllIIlIIIIIlIl[2]] = lIIllllIlIIllIIl("vaQ52JWaQdg=", "sSwPa");
            EnumOS.lllIIlIIIIIlII[EnumOS.lllIIlIIIIIlIl[3]] = lIIllllIlIIllIII("pY23VUs3iW4=", "PWiOk");
            EnumOS.lllIIlIIIIIlII[EnumOS.lllIIlIIIIIlIl[4]] = lIIllllIlIIllIIl("3zKwRayZK5o=", "gAwIr");
        }
        
        private static String lIIllllIlIIllIII(final String llllllllllllIlIlllllIllIlllIlIll, final String llllllllllllIlIlllllIllIlllIlIlI) {
            try {
                final SecretKeySpec llllllllllllIlIlllllIllIllllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllllIllIlllIlIlI.getBytes(StandardCharsets.UTF_8)), EnumOS.lllIIlIIIIIlIl[6]), "DES");
                final Cipher llllllllllllIlIlllllIllIlllIllll = Cipher.getInstance("DES");
                llllllllllllIlIlllllIllIlllIllll.init(EnumOS.lllIIlIIIIIlIl[2], llllllllllllIlIlllllIllIllllIIII);
                return new String(llllllllllllIlIlllllIllIlllIllll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllllIllIlllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIlllllIllIlllIlllI) {
                llllllllllllIlIlllllIllIlllIlllI.printStackTrace();
                return null;
            }
        }
        
        static {
            lIIllllIlIIllIll();
            lIIllllIlIIllIlI();
            final EnumOS[] enum$VALUES = new EnumOS[EnumOS.lllIIlIIIIIlIl[5]];
            enum$VALUES[EnumOS.lllIIlIIIIIlIl[0]] = EnumOS.LINUX;
            enum$VALUES[EnumOS.lllIIlIIIIIlIl[1]] = EnumOS.SOLARIS;
            enum$VALUES[EnumOS.lllIIlIIIIIlIl[2]] = EnumOS.WINDOWS;
            enum$VALUES[EnumOS.lllIIlIIIIIlIl[3]] = EnumOS.OSX;
            enum$VALUES[EnumOS.lllIIlIIIIIlIl[4]] = EnumOS.UNKNOWN;
            ENUM$VALUES = enum$VALUES;
        }
        
        private EnumOS(final String llllllllllllIlIlllllIlllIIIIlIll, final int llllllllllllIlIlllllIlllIIIIlIlI) {
        }
    }
}
