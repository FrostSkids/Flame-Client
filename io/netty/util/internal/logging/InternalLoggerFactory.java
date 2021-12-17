// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal.logging;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public abstract class InternalLoggerFactory
{
    private static volatile /* synthetic */ InternalLoggerFactory defaultFactory;
    private static final /* synthetic */ String[] lIllIllllllIlI;
    private static final /* synthetic */ int[] lIllIlllllllII;
    
    private static String lIIIIIIIlIlIlIII(String llllllllllllIllllllIIIIIlIlIlIlI, final String llllllllllllIllllllIIIIIlIlIlllI) {
        llllllllllllIllllllIIIIIlIlIlIlI = new String(Base64.getDecoder().decode(llllllllllllIllllllIIIIIlIlIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllllIIIIIlIlIllIl = new StringBuilder();
        final char[] llllllllllllIllllllIIIIIlIlIllII = llllllllllllIllllllIIIIIlIlIlllI.toCharArray();
        int llllllllllllIllllllIIIIIlIlIlIll = InternalLoggerFactory.lIllIlllllllII[1];
        final long llllllllllllIllllllIIIIIlIlIIlIl = (Object)llllllllllllIllllllIIIIIlIlIlIlI.toCharArray();
        final float llllllllllllIllllllIIIIIlIlIIlII = llllllllllllIllllllIIIIIlIlIIlIl.length;
        float llllllllllllIllllllIIIIIlIlIIIll = InternalLoggerFactory.lIllIlllllllII[1];
        while (lIIIIIIIllIIIIII((int)llllllllllllIllllllIIIIIlIlIIIll, (int)llllllllllllIllllllIIIIIlIlIIlII)) {
            final char llllllllllllIllllllIIIIIlIllIIII = llllllllllllIllllllIIIIIlIlIIlIl[llllllllllllIllllllIIIIIlIlIIIll];
            llllllllllllIllllllIIIIIlIlIllIl.append((char)(llllllllllllIllllllIIIIIlIllIIII ^ llllllllllllIllllllIIIIIlIlIllII[llllllllllllIllllllIIIIIlIlIlIll % llllllllllllIllllllIIIIIlIlIllII.length]));
            "".length();
            ++llllllllllllIllllllIIIIIlIlIlIll;
            ++llllllllllllIllllllIIIIIlIlIIIll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllllIIIIIlIlIllIl);
    }
    
    public static void setDefaultFactory(final InternalLoggerFactory llllllllllllIllllllIIIIIllIIllIl) {
        if (lIIIIIIIlIllllll(llllllllllllIllllllIIIIIllIIllIl)) {
            throw new NullPointerException(InternalLoggerFactory.lIllIllllllIlI[InternalLoggerFactory.lIllIlllllllII[3]]);
        }
        InternalLoggerFactory.defaultFactory = llllllllllllIllllllIIIIIllIIllIl;
    }
    
    private static void lIIIIIIIlIlllllI() {
        (lIllIlllllllII = new int[6])[0] = " ".length();
        InternalLoggerFactory.lIllIlllllllII[1] = ((0xE3 ^ 0xB8) & ~(0xE8 ^ 0xB3));
        InternalLoggerFactory.lIllIlllllllII[2] = "  ".length();
        InternalLoggerFactory.lIllIlllllllII[3] = "   ".length();
        InternalLoggerFactory.lIllIlllllllII[4] = (12 + 34 + 87 + 12 ^ 0 + 17 + 18 + 114);
        InternalLoggerFactory.lIllIlllllllII[5] = (0x77 ^ 0x24 ^ (0x2D ^ 0x76));
    }
    
    private static boolean lIIIIIIIlIllllll(final Object llllllllllllIllllllIIIIIlIIIllll) {
        return llllllllllllIllllllIIIIIlIIIllll == null;
    }
    
    private static void lIIIIIIIlIlIlIIl() {
        (lIllIllllllIlI = new String[InternalLoggerFactory.lIllIlllllllII[4]])[InternalLoggerFactory.lIllIlllllllII[1]] = lIIIIIIIlIlIIllI("QiUwvYwcSsFPK4zQKeJxhyQPeVjLWv0Q2ufQY263BDrJK1jcJVJSQo427FXiMlqH", "OrRll");
        InternalLoggerFactory.lIllIllllllIlI[InternalLoggerFactory.lIllIlllllllII[0]] = lIIIIIIIlIlIIllI("9N1SzEaCvO6QBBHC+/zbEZzA3Re71yaNc0jMUleb0XTI1Q5/7PZoUtoJnLGzNZ9v", "SiJFc");
        InternalLoggerFactory.lIllIllllllIlI[InternalLoggerFactory.lIllIlllllllII[2]] = lIIIIIIIlIlIIlll("H/1hpo80NfZdcOp5y4HfzFFj4VsRE4BKJTWv6+hvPkS9+NSeq0/LKNu2Qt1wJvu4WBtldgyU2N8ip8VGBlTAhA==", "tSFap");
        InternalLoggerFactory.lIllIllllllIlI[InternalLoggerFactory.lIllIlllllllII[3]] = lIIIIIIIlIlIlIII("IDEEFC8oICQUOTA7EAw=", "DTbuZ");
    }
    
    static {
        lIIIIIIIlIlllllI();
        lIIIIIIIlIlIlIIl();
        InternalLoggerFactory.defaultFactory = newDefaultFactory(InternalLoggerFactory.class.getName());
    }
    
    public static InternalLogger getInstance(final String llllllllllllIllllllIIIIIllIIlIII) {
        return getDefaultFactory().newInstance(llllllllllllIllllllIIIIIllIIlIII);
    }
    
    private static String lIIIIIIIlIlIIlll(final String llllllllllllIllllllIIIIIlIllllll, final String llllllllllllIllllllIIIIIlIllllII) {
        try {
            final SecretKeySpec llllllllllllIllllllIIIIIllIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIIIIIlIllllII.getBytes(StandardCharsets.UTF_8)), InternalLoggerFactory.lIllIlllllllII[5]), "DES");
            final Cipher llllllllllllIllllllIIIIIllIIIIIl = Cipher.getInstance("DES");
            llllllllllllIllllllIIIIIllIIIIIl.init(InternalLoggerFactory.lIllIlllllllII[2], llllllllllllIllllllIIIIIllIIIIlI);
            return new String(llllllllllllIllllllIIIIIllIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIIIIIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllIIIIIllIIIIII) {
            llllllllllllIllllllIIIIIllIIIIII.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIIIIIlIlIIllI(final String llllllllllllIllllllIIIIIlIIllIII, final String llllllllllllIllllllIIIIIlIIlIlll) {
        try {
            final SecretKeySpec llllllllllllIllllllIIIIIlIIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIIIIIlIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllllIIIIIlIIlllII = Cipher.getInstance("Blowfish");
            llllllllllllIllllllIIIIIlIIlllII.init(InternalLoggerFactory.lIllIlllllllII[2], llllllllllllIllllllIIIIIlIIlllIl);
            return new String(llllllllllllIllllllIIIIIlIIlllII.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIIIIIlIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllIIIIIlIIllIll) {
            llllllllllllIllllllIIIIIlIIllIll.printStackTrace();
            return null;
        }
    }
    
    private static InternalLoggerFactory newDefaultFactory(final String llllllllllllIllllllIIIIIllIlIlIl) {
        InternalLoggerFactory llllllllllllIllllllIIIIIllIlIlII;
        try {
            llllllllllllIllllllIIIIIllIlIlII = new Slf4JLoggerFactory((boolean)(InternalLoggerFactory.lIllIlllllllII[0] != 0));
            llllllllllllIllllllIIIIIllIlIlII.newInstance(llllllllllllIllllllIIIIIllIlIlIl).debug(InternalLoggerFactory.lIllIllllllIlI[InternalLoggerFactory.lIllIlllllllII[1]]);
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (Throwable llllllllllllIllllllIIIIIllIlIllI) {
            try {
                llllllllllllIllllllIIIIIllIlIlII = new Log4JLoggerFactory();
                llllllllllllIllllllIIIIIllIlIlII.newInstance(llllllllllllIllllllIIIIIllIlIlIl).debug(InternalLoggerFactory.lIllIllllllIlI[InternalLoggerFactory.lIllIlllllllII[0]]);
                "".length();
                if ((0x20 ^ 0x6B ^ (0x65 ^ 0x2A)) == 0x0) {
                    return null;
                }
                return llllllllllllIllllllIIIIIllIlIlII;
            }
            catch (Throwable llllllllllllIllllllIIIIIllIlIlll) {
                llllllllllllIllllllIIIIIllIlIlII = new JdkLoggerFactory();
                llllllllllllIllllllIIIIIllIlIlII.newInstance(llllllllllllIllllllIIIIIllIlIlIl).debug(InternalLoggerFactory.lIllIllllllIlI[InternalLoggerFactory.lIllIlllllllII[2]]);
            }
        }
        return llllllllllllIllllllIIIIIllIlIlII;
    }
    
    private static boolean lIIIIIIIllIIIIII(final int llllllllllllIllllllIIIIIlIIlIIlI, final int llllllllllllIllllllIIIIIlIIlIIIl) {
        return llllllllllllIllllllIIIIIlIIlIIlI < llllllllllllIllllllIIIIIlIIlIIIl;
    }
    
    public static InternalLoggerFactory getDefaultFactory() {
        return InternalLoggerFactory.defaultFactory;
    }
    
    protected abstract InternalLogger newInstance(final String p0);
    
    public static InternalLogger getInstance(final Class<?> llllllllllllIllllllIIIIIllIIlIll) {
        return getInstance(llllllllllllIllllllIIIIIllIIlIll.getName());
    }
}
