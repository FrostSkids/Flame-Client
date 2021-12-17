// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal.logging;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.NOPLoggerFactory;
import java.io.UnsupportedEncodingException;
import java.io.PrintStream;
import java.io.OutputStream;

public class Slf4JLoggerFactory extends InternalLoggerFactory
{
    private static final /* synthetic */ String[] lIlIIIIlIIIIIl;
    private static final /* synthetic */ int[] lIlIIIIlIIIlIl;
    static final /* synthetic */ boolean $assertionsDisabled;
    
    public Slf4JLoggerFactory() {
    }
    
    Slf4JLoggerFactory(final boolean lllllllllllllIIlIIIIlIllllllIIIl) {
        if (lllIIIIlIIlIlIl(Slf4JLoggerFactory.$assertionsDisabled ? 1 : 0) && lllIIIIlIIlIlIl(lllllllllllllIIlIIIIlIllllllIIIl ? 1 : 0)) {
            throw new AssertionError();
        }
        final StringBuffer lllllllllllllIIlIIIIlIllllllIIII = new StringBuffer();
        final PrintStream lllllllllllllIIlIIIIlIlllllIllll = System.err;
        try {
            System.setErr(new PrintStream(new OutputStream() {
                @Override
                public void write(final int llllllllllllIlllIIllIIIlIIlllIll) {
                    lllllllllllllIIlIIIIlIllllllIIII.append((char)llllllllllllIlllIIllIIIlIIlllIll);
                    "".length();
                }
            }, (boolean)(Slf4JLoggerFactory.lIlIIIIlIIIlIl[0] != 0), Slf4JLoggerFactory.lIlIIIIlIIIIIl[Slf4JLoggerFactory.lIlIIIIlIIIlIl[1]]));
            "".length();
            if ("  ".length() <= -" ".length()) {
                throw null;
            }
        }
        catch (UnsupportedEncodingException lllllllllllllIIlIIIIlIllllllIIll) {
            throw new Error(lllllllllllllIIlIIIIlIllllllIIll);
        }
        try {
            if (lllIIIIlIIlIllI((LoggerFactory.getILoggerFactory() instanceof NOPLoggerFactory) ? 1 : 0)) {
                throw new NoClassDefFoundError(lllllllllllllIIlIIIIlIllllllIIII.toString());
            }
            lllllllllllllIIlIIIIlIlllllIllll.print(lllllllllllllIIlIIIIlIllllllIIII);
            lllllllllllllIIlIIIIlIlllllIllll.flush();
            System.setErr(lllllllllllllIIlIIIIlIlllllIllll);
            "".length();
            if ((0x30 ^ 0x1F ^ (0x55 ^ 0x7E)) < 0) {
                throw null;
            }
        }
        finally {
            System.setErr(lllllllllllllIIlIIIIlIlllllIllll);
        }
    }
    
    public InternalLogger newInstance(final String lllllllllllllIIlIIIIlIlllllIIlIl) {
        return new Slf4JLogger(LoggerFactory.getLogger(lllllllllllllIIlIIIIlIlllllIIlIl));
    }
    
    private static String lllIIIIlIIIllII(String lllllllllllllIIlIIIIlIllllIlIlIl, final String lllllllllllllIIlIIIIlIllllIllIIl) {
        lllllllllllllIIlIIIIlIllllIlIlIl = new String(Base64.getDecoder().decode(lllllllllllllIIlIIIIlIllllIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIIIlIllllIllIII = new StringBuilder();
        final char[] lllllllllllllIIlIIIIlIllllIlIlll = lllllllllllllIIlIIIIlIllllIllIIl.toCharArray();
        int lllllllllllllIIlIIIIlIllllIlIllI = Slf4JLoggerFactory.lIlIIIIlIIIlIl[1];
        final char lllllllllllllIIlIIIIlIllllIlIIII = (Object)lllllllllllllIIlIIIIlIllllIlIlIl.toCharArray();
        final String lllllllllllllIIlIIIIlIllllIIllll = (String)lllllllllllllIIlIIIIlIllllIlIIII.length;
        Exception lllllllllllllIIlIIIIlIllllIIlllI = (Exception)Slf4JLoggerFactory.lIlIIIIlIIIlIl[1];
        while (lllIIIIlIlIIlIl((int)lllllllllllllIIlIIIIlIllllIIlllI, (int)lllllllllllllIIlIIIIlIllllIIllll)) {
            final char lllllllllllllIIlIIIIlIllllIllIll = lllllllllllllIIlIIIIlIllllIlIIII[lllllllllllllIIlIIIIlIllllIIlllI];
            lllllllllllllIIlIIIIlIllllIllIII.append((char)(lllllllllllllIIlIIIIlIllllIllIll ^ lllllllllllllIIlIIIIlIllllIlIlll[lllllllllllllIIlIIIIlIllllIlIllI % lllllllllllllIIlIIIIlIllllIlIlll.length]));
            "".length();
            ++lllllllllllllIIlIIIIlIllllIlIllI;
            ++lllllllllllllIIlIIIIlIllllIIlllI;
            "".length();
            if ((46 + 23 + 47 + 25 ^ 80 + 98 - 66 + 24) == 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIIIlIllllIllIII);
    }
    
    private static boolean lllIIIIlIIlIllI(final int lllllllllllllIIlIIIIlIllllIIIlll) {
        return lllllllllllllIIlIIIIlIllllIIIlll != 0;
    }
    
    private static void lllIIIIlIIIllIl() {
        (lIlIIIIlIIIIIl = new String[Slf4JLoggerFactory.lIlIIIIlIIIlIl[0]])[Slf4JLoggerFactory.lIlIIIIlIIIlIl[1]] = lllIIIIlIIIllII("MD5UMyEmJDA=", "emyrr");
    }
    
    private static boolean lllIIIIlIlIIlIl(final int lllllllllllllIIlIIIIlIllllIIlIlI, final int lllllllllllllIIlIIIIlIllllIIlIIl) {
        return lllllllllllllIIlIIIIlIllllIIlIlI < lllllllllllllIIlIIIIlIllllIIlIIl;
    }
    
    private static void lllIIIIlIIlIlII() {
        (lIlIIIIlIIIlIl = new int[2])[0] = " ".length();
        Slf4JLoggerFactory.lIlIIIIlIIIlIl[1] = ((109 + 82 - 176 + 119 ^ 157 + 64 - 168 + 143) & (0xA3 ^ 0xC2 ^ (0x30 ^ 0x13) ^ -" ".length()));
    }
    
    static {
        lllIIIIlIIlIlII();
        lllIIIIlIIIllIl();
        int $assertionsDisabled2;
        if (lllIIIIlIIlIlIl(Slf4JLoggerFactory.class.desiredAssertionStatus() ? 1 : 0)) {
            $assertionsDisabled2 = Slf4JLoggerFactory.lIlIIIIlIIIlIl[0];
            "".length();
            if ("  ".length() == -" ".length()) {
                return;
            }
        }
        else {
            $assertionsDisabled2 = Slf4JLoggerFactory.lIlIIIIlIIIlIl[1];
        }
        $assertionsDisabled = ($assertionsDisabled2 != 0);
    }
    
    private static boolean lllIIIIlIIlIlIl(final int lllllllllllllIIlIIIIlIllllIIIlIl) {
        return lllllllllllllIIlIIIIlIllllIIIlIl == 0;
    }
}
