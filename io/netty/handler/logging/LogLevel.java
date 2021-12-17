// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.logging;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.internal.logging.InternalLogLevel;

public enum LogLevel
{
    private static final /* synthetic */ int[] lllIIllIlIllIl;
    
    WARN(InternalLogLevel.WARN), 
    INFO(InternalLogLevel.INFO);
    
    private final /* synthetic */ InternalLogLevel internalLevel;
    private static final /* synthetic */ String[] lllIIllIlIlIll;
    
    ERROR(InternalLogLevel.ERROR), 
    DEBUG(InternalLogLevel.DEBUG), 
    TRACE(InternalLogLevel.TRACE);
    
    private static String lIlIIIIIIllIllll(final String llllllllllllIlIlllIllllIllllllII, final String llllllllllllIlIlllIllllIlllllIll) {
        try {
            final SecretKeySpec llllllllllllIlIlllIllllIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIllllIlllllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllIllllIlllllllI = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllIllllIlllllllI.init(LogLevel.lllIIllIlIllIl[2], llllllllllllIlIlllIllllIllllllll);
            return new String(llllllllllllIlIlllIllllIlllllllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIllllIllllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIllllIllllllIl) {
            llllllllllllIlIlllIllllIllllllIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIIIIIIllIllIl(final String llllllllllllIlIlllIllllIlllIllll, final String llllllllllllIlIlllIllllIlllIlllI) {
        try {
            final SecretKeySpec llllllllllllIlIlllIllllIllllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIllllIlllIlllI.getBytes(StandardCharsets.UTF_8)), LogLevel.lllIIllIlIllIl[6]), "DES");
            final Cipher llllllllllllIlIlllIllllIllllIIIl = Cipher.getInstance("DES");
            llllllllllllIlIlllIllllIllllIIIl.init(LogLevel.lllIIllIlIllIl[2], llllllllllllIlIlllIllllIllllIIlI);
            return new String(llllllllllllIlIlllIllllIllllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIllllIlllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIllllIllllIIII) {
            llllllllllllIlIlllIllllIllllIIII.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIIIIIIllIlllI(String llllllllllllIlIlllIlllllIIIIllII, final String llllllllllllIlIlllIlllllIIIIlIll) {
        llllllllllllIlIlllIlllllIIIIllII = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIlIlllIlllllIIIIllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllIlllllIIIIllll = new StringBuilder();
        final char[] llllllllllllIlIlllIlllllIIIIlllI = llllllllllllIlIlllIlllllIIIIlIll.toCharArray();
        int llllllllllllIlIlllIlllllIIIIllIl = LogLevel.lllIIllIlIllIl[0];
        final long llllllllllllIlIlllIlllllIIIIIlll = (Object)((String)llllllllllllIlIlllIlllllIIIIllII).toCharArray();
        final byte llllllllllllIlIlllIlllllIIIIIllI = (byte)llllllllllllIlIlllIlllllIIIIIlll.length;
        long llllllllllllIlIlllIlllllIIIIIlIl = LogLevel.lllIIllIlIllIl[0];
        while (lIlIIIIIIlllIllI((int)llllllllllllIlIlllIlllllIIIIIlIl, llllllllllllIlIlllIlllllIIIIIllI)) {
            final char llllllllllllIlIlllIlllllIIIlIIlI = llllllllllllIlIlllIlllllIIIIIlll[llllllllllllIlIlllIlllllIIIIIlIl];
            llllllllllllIlIlllIlllllIIIIllll.append((char)(llllllllllllIlIlllIlllllIIIlIIlI ^ llllllllllllIlIlllIlllllIIIIlllI[llllllllllllIlIlllIlllllIIIIllIl % llllllllllllIlIlllIlllllIIIIlllI.length]));
            "".length();
            ++llllllllllllIlIlllIlllllIIIIllIl;
            ++llllllllllllIlIlllIlllllIIIIIlIl;
            "".length();
            if ((0xD9 ^ 0xB8 ^ (0xA5 ^ 0xC0)) <= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllIlllllIIIIllll);
    }
    
    private LogLevel(final InternalLogLevel llllllllllllIlIlllIlllllIIlIIIll) {
        this.internalLevel = llllllllllllIlIlllIlllllIIlIIIll;
    }
    
    private static boolean lIlIIIIIIlllIllI(final int llllllllllllIlIlllIllllIlllIIlll, final int llllllllllllIlIlllIllllIlllIIllI) {
        return llllllllllllIlIlllIllllIlllIIlll < llllllllllllIlIlllIllllIlllIIllI;
    }
    
    static {
        lIlIIIIIIlllIlIl();
        lIlIIIIIIlllIIII();
        final LogLevel[] $values = new LogLevel[LogLevel.lllIIllIlIllIl[5]];
        $values[LogLevel.lllIIllIlIllIl[0]] = LogLevel.TRACE;
        $values[LogLevel.lllIIllIlIllIl[1]] = LogLevel.DEBUG;
        $values[LogLevel.lllIIllIlIllIl[2]] = LogLevel.INFO;
        $values[LogLevel.lllIIllIlIllIl[3]] = LogLevel.WARN;
        $values[LogLevel.lllIIllIlIllIl[4]] = LogLevel.ERROR;
        $VALUES = $values;
    }
    
    private static void lIlIIIIIIlllIIII() {
        (lllIIllIlIlIll = new String[LogLevel.lllIIllIlIllIl[5]])[LogLevel.lllIIllIlIllIl[0]] = lIlIIIIIIllIllIl("J12L83t7Uwg=", "uaOZH");
        LogLevel.lllIIllIlIlIll[LogLevel.lllIIllIlIllIl[1]] = lIlIIIIIIllIllIl("j4r0oy6tHCw=", "IpFih");
        LogLevel.lllIIllIlIlIll[LogLevel.lllIIllIlIllIl[2]] = lIlIIIIIIllIlllI("ORY1Cg==", "pXsEi");
        LogLevel.lllIIllIlIlIll[LogLevel.lllIIllIlIllIl[3]] = lIlIIIIIIllIllll("002ESIFTRI8=", "cmpOp");
        LogLevel.lllIIllIlIlIll[LogLevel.lllIIllIlIllIl[4]] = lIlIIIIIIllIlllI("BjY4Fh8=", "CdjYM");
    }
    
    private static void lIlIIIIIIlllIlIl() {
        (lllIIllIlIllIl = new int[7])[0] = ((0x1B ^ 0x40) & ~(0x73 ^ 0x28));
        LogLevel.lllIIllIlIllIl[1] = " ".length();
        LogLevel.lllIIllIlIllIl[2] = "  ".length();
        LogLevel.lllIIllIlIllIl[3] = "   ".length();
        LogLevel.lllIIllIlIllIl[4] = (0x3E ^ 0x5 ^ (0xFA ^ 0xC5));
        LogLevel.lllIIllIlIllIl[5] = (0x8D ^ 0x88);
        LogLevel.lllIIllIlIllIl[6] = (0x7F ^ 0x77);
    }
    
    InternalLogLevel toInternalLevel() {
        return this.internalLevel;
    }
}
