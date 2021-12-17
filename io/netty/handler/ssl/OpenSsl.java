// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.ssl;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import org.apache.tomcat.jni.Library;
import io.netty.util.internal.NativeLibraryLoader;
import org.apache.tomcat.jni.SSL;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.util.internal.logging.InternalLogger;

public final class OpenSsl
{
    private static final /* synthetic */ String[] llIIllIIllllIl;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ int[] llIlIIIIIIIlll;
    private static final /* synthetic */ Throwable UNAVAILABILITY_CAUSE;
    
    private static void lIIlIIIlIIIlIIIl() {
        (llIlIIIIIIIlll = new int[8])[0] = " ".length();
        OpenSsl.llIlIIIIIIIlll[1] = ((0x4D ^ 0x6C) & ~(0x23 ^ 0x2));
        OpenSsl.llIlIIIIIIIlll[2] = "  ".length();
        OpenSsl.llIlIIIIIIIlll[3] = "   ".length();
        OpenSsl.llIlIIIIIIIlll[4] = (0xB5 ^ 0xB1);
        OpenSsl.llIlIIIIIIIlll[5] = (0x55 ^ 0x50);
        OpenSsl.llIlIIIIIIIlll[6] = (0x2F ^ 0x29);
        OpenSsl.llIlIIIIIIIlll[7] = (0xB4 ^ 0xAE ^ (0x9F ^ 0x8D));
    }
    
    public static Throwable unavailabilityCause() {
        return OpenSsl.UNAVAILABILITY_CAUSE;
    }
    
    private static String lIIIlllIllIIIllI(String llllllllllllIllIllIlllllIIlllllI, final String llllllllllllIllIllIlllllIlIIIIlI) {
        llllllllllllIllIllIlllllIIlllllI = (boolean)new String(Base64.getDecoder().decode(((String)llllllllllllIllIllIlllllIIlllllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIllIlllllIlIIIIIl = new StringBuilder();
        final char[] llllllllllllIllIllIlllllIlIIIIII = llllllllllllIllIllIlllllIlIIIIlI.toCharArray();
        int llllllllllllIllIllIlllllIIllllll = OpenSsl.llIlIIIIIIIlll[1];
        final short llllllllllllIllIllIlllllIIlllIIl = (Object)((String)llllllllllllIllIllIlllllIIlllllI).toCharArray();
        final short llllllllllllIllIllIlllllIIlllIII = (short)llllllllllllIllIllIlllllIIlllIIl.length;
        String llllllllllllIllIllIlllllIIllIlll = (String)OpenSsl.llIlIIIIIIIlll[1];
        while (lIIlIIIlIIIlIlII((int)llllllllllllIllIllIlllllIIllIlll, llllllllllllIllIllIlllllIIlllIII)) {
            final char llllllllllllIllIllIlllllIlIIIlII = llllllllllllIllIllIlllllIIlllIIl[llllllllllllIllIllIlllllIIllIlll];
            llllllllllllIllIllIlllllIlIIIIIl.append((char)(llllllllllllIllIllIlllllIlIIIlII ^ llllllllllllIllIllIlllllIlIIIIII[llllllllllllIllIllIlllllIIllllll % llllllllllllIllIllIlllllIlIIIIII.length]));
            "".length();
            ++llllllllllllIllIllIlllllIIllllll;
            ++llllllllllllIllIllIlllllIIllIlll;
            "".length();
            if ((0x75 ^ 0x71) < (" ".length() & ~" ".length())) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIllIlllllIlIIIIIl);
    }
    
    public static void ensureAvailability() {
        if (lIIlIIIlIIIlIIll(OpenSsl.UNAVAILABILITY_CAUSE)) {
            throw (Error)new UnsatisfiedLinkError(OpenSsl.llIIllIIllllIl[OpenSsl.llIlIIIIIIIlll[1]]).initCause(OpenSsl.UNAVAILABILITY_CAUSE);
        }
    }
    
    private static boolean lIIlIIIlIIIlIIlI(final Object llllllllllllIllIllIlllllIIIlIlII) {
        return llllllllllllIllIllIlllllIIIlIlII == null;
    }
    
    private OpenSsl() {
    }
    
    static {
        lIIlIIIlIIIlIIIl();
        lIIIlllIllIIIlll();
        IGNORABLE_ERROR_PREFIX = OpenSsl.llIIllIIllllIl[OpenSsl.llIlIIIIIIIlll[0]];
        logger = InternalLoggerFactory.getInstance(OpenSsl.class);
        Throwable llllllllllllIllIllIlllllIlIlIIII = null;
        try {
            NativeLibraryLoader.load(OpenSsl.llIIllIIllllIl[OpenSsl.llIlIIIIIIIlll[2]], SSL.class.getClassLoader());
            Library.initialize(OpenSsl.llIIllIIllllIl[OpenSsl.llIlIIIIIIIlll[3]]);
            "".length();
            SSL.initialize((String)null);
            "".length();
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (Throwable llllllllllllIllIllIlllllIlIlIIIl) {
            llllllllllllIllIllIlllllIlIlIIII = llllllllllllIllIllIlllllIlIlIIIl;
            OpenSsl.logger.debug(String.valueOf(new StringBuilder().append(OpenSsl.llIIllIIllllIl[OpenSsl.llIlIIIIIIIlll[4]]).append(OpenSslEngine.class.getSimpleName()).append(OpenSsl.llIIllIIllllIl[OpenSsl.llIlIIIIIIIlll[5]])), llllllllllllIllIllIlllllIlIlIIIl);
        }
        UNAVAILABILITY_CAUSE = llllllllllllIllIllIlllllIlIlIIII;
    }
    
    private static boolean lIIlIIIlIIIlIIll(final Object llllllllllllIllIllIlllllIIIlIllI) {
        return llllllllllllIllIllIlllllIIIlIllI != null;
    }
    
    private static void lIIIlllIllIIIlll() {
        (llIIllIIllllIl = new String[OpenSsl.llIlIIIIIIIlll[6]])[OpenSsl.llIlIIIIIIIlll[1]] = lIIIlllIllIIIlII("Z681GuP+9zuTU68cvAjWgFkJhBfMojp/0Z5eCMts3NkEWLSp0di7hyAMNVatw0NR", "TQJIl");
        OpenSsl.llIIllIIllllIl[OpenSsl.llIlIIIIIIIlll[0]] = lIIIlllIllIIIlIl("5RmPWU2zidcHqK9NHae8gg==", "bfGwu");
        OpenSsl.llIIllIIllllIl[OpenSsl.llIlIIIIIIIlll[2]] = lIIIlllIllIIIlII("4WfcGvWaQoxPZRhEBZ+gyA==", "ncett");
        OpenSsl.llIIllIIllllIl[OpenSsl.llIlIIIIIIIlll[3]] = lIIIlllIllIIIllI("ACMLJTkUNAA=", "pQdSP");
        OpenSsl.llIIllIIllllIl[OpenSsl.llIlIIIIIIIlll[4]] = lIIIlllIllIIIlII("LrTyLe+Q7orZaXNyy3G2BjpMu0OvkByVO6CxhyW2o7A=", "AkPCt");
        OpenSsl.llIIllIIllllIl[OpenSsl.llIlIIIIIIIlll[5]] = lIIIlllIllIIIllI("Uh8PAjlSCgNOIBwJEA88HgkEAjBc", "rhfnU");
    }
    
    private static boolean lIIlIIIlIIIlIlII(final int llllllllllllIllIllIlllllIIIllIIl, final int llllllllllllIllIllIlllllIIIllIII) {
        return llllllllllllIllIllIlllllIIIllIIl < llllllllllllIllIllIlllllIIIllIII;
    }
    
    private static String lIIIlllIllIIIlII(final String llllllllllllIllIllIlllllIIlIIIIl, final String llllllllllllIllIllIlllllIIlIIIII) {
        try {
            final SecretKeySpec llllllllllllIllIllIlllllIIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIlllllIIlIIIII.getBytes(StandardCharsets.UTF_8)), OpenSsl.llIlIIIIIIIlll[7]), "DES");
            final Cipher llllllllllllIllIllIlllllIIlIIIll = Cipher.getInstance("DES");
            llllllllllllIllIllIlllllIIlIIIll.init(OpenSsl.llIlIIIIIIIlll[2], llllllllllllIllIllIlllllIIlIIlII);
            return new String(llllllllllllIllIllIlllllIIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIlllllIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIlllllIIlIIIlI) {
            llllllllllllIllIllIlllllIIlIIIlI.printStackTrace();
            return null;
        }
    }
    
    public static boolean isAvailable() {
        int n;
        if (lIIlIIIlIIIlIIlI(OpenSsl.UNAVAILABILITY_CAUSE)) {
            n = OpenSsl.llIlIIIIIIIlll[0];
            "".length();
            if (null != null) {
                return ((0x37 ^ 0x15 ^ (0x18 ^ 0x11)) & (0xB3 ^ 0xB9 ^ (0xB2 ^ 0x93) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = OpenSsl.llIlIIIIIIIlll[1];
        }
        return n != 0;
    }
    
    private static String lIIIlllIllIIIlIl(final String llllllllllllIllIllIlllllIIlIllII, final String llllllllllllIllIllIlllllIIlIllIl) {
        try {
            final SecretKeySpec llllllllllllIllIllIlllllIIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIlllllIIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllIlllllIIllIIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIllIlllllIIllIIII.init(OpenSsl.llIlIIIIIIIlll[2], llllllllllllIllIllIlllllIIllIIIl);
            return new String(llllllllllllIllIllIlllllIIllIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIlllllIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIlllllIIlIllll) {
            llllllllllllIllIllIlllllIIlIllll.printStackTrace();
            return null;
        }
    }
}
