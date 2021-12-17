// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class IllegalReferenceCountException extends IllegalStateException
{
    private static final /* synthetic */ int[] llIlIlllIlIIIl;
    private static final /* synthetic */ String[] llIlIlllIlIIII;
    
    private static boolean lIIlIlIllIlllIll(final int llllllllllllIllIlIIIllllllIlllIl) {
        return llllllllllllIllIlIIIllllllIlllIl > 0;
    }
    
    public IllegalReferenceCountException(final String llllllllllllIllIlIIlIIIIIIIlIIlI, final Throwable llllllllllllIllIlIIlIIIIIIIlIIIl) {
        super(llllllllllllIllIlIIlIIIIIIIlIIlI, llllllllllllIllIlIIlIIIIIIIlIIIl);
    }
    
    private static String lIIlIlIllIlllIII(String llllllllllllIllIlIIIlllllllIlIll, final String llllllllllllIllIlIIIlllllllIlIlI) {
        llllllllllllIllIlIIIlllllllIlIll = (byte)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIIIlllllllIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIIIlllllllIlllI = new StringBuilder();
        final char[] llllllllllllIllIlIIIlllllllIllIl = llllllllllllIllIlIIIlllllllIlIlI.toCharArray();
        int llllllllllllIllIlIIIlllllllIllII = IllegalReferenceCountException.llIlIlllIlIIIl[0];
        final byte llllllllllllIllIlIIIlllllllIIllI = (Object)((String)llllllllllllIllIlIIIlllllllIlIll).toCharArray();
        final long llllllllllllIllIlIIIlllllllIIlIl = llllllllllllIllIlIIIlllllllIIllI.length;
        char llllllllllllIllIlIIIlllllllIIlII = (char)IllegalReferenceCountException.llIlIlllIlIIIl[0];
        while (lIIlIlIllIllllII(llllllllllllIllIlIIIlllllllIIlII, (int)llllllllllllIllIlIIIlllllllIIlIl)) {
            final char llllllllllllIllIlIIIllllllllIIIl = llllllllllllIllIlIIIlllllllIIllI[llllllllllllIllIlIIIlllllllIIlII];
            llllllllllllIllIlIIIlllllllIlllI.append((char)(llllllllllllIllIlIIIllllllllIIIl ^ llllllllllllIllIlIIIlllllllIllIl[llllllllllllIllIlIIIlllllllIllII % llllllllllllIllIlIIIlllllllIllIl.length]));
            "".length();
            ++llllllllllllIllIlIIIlllllllIllII;
            ++llllllllllllIllIlIIIlllllllIIlII;
            "".length();
            if (-(0xDD ^ 0xB8 ^ (0x7D ^ 0x1C)) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIIIlllllllIlllI);
    }
    
    public IllegalReferenceCountException(final Throwable llllllllllllIllIlIIlIIIIIIIIlIlI) {
        super(llllllllllllIllIlIIlIIIIIIIIlIlI);
    }
    
    public IllegalReferenceCountException(final int llllllllllllIllIlIIlIIIIIIlIlIII) {
        this(String.valueOf(new StringBuilder().append(IllegalReferenceCountException.llIlIlllIlIIII[IllegalReferenceCountException.llIlIlllIlIIIl[0]]).append(llllllllllllIllIlIIlIIIIIIlIlIII)));
    }
    
    public IllegalReferenceCountException(final String llllllllllllIllIlIIlIIIIIIIllIIl) {
        super(llllllllllllIllIlIIlIIIIIIIllIIl);
    }
    
    private static void lIIlIlIllIlllIlI() {
        (llIlIlllIlIIIl = new int[7])[0] = (" ".length() & (" ".length() ^ -" ".length()));
        IllegalReferenceCountException.llIlIlllIlIIIl[1] = " ".length();
        IllegalReferenceCountException.llIlIlllIlIIIl[2] = "  ".length();
        IllegalReferenceCountException.llIlIlllIlIIIl[3] = "   ".length();
        IllegalReferenceCountException.llIlIlllIlIIIl[4] = (0x15 ^ 0x11);
        IllegalReferenceCountException.llIlIlllIlIIIl[5] = (10 + 56 + 63 + 13 ^ 109 + 93 - 141 + 78);
        IllegalReferenceCountException.llIlIlllIlIIIl[6] = (142 + 55 - 173 + 135 ^ 11 + 58 + 45 + 37);
    }
    
    static {
        lIIlIlIllIlllIlI();
        lIIlIlIllIlllIIl();
    }
    
    private static boolean lIIlIlIllIllllII(final int llllllllllllIllIlIIIlllllllIIIII, final int llllllllllllIllIlIIIllllllIlllll) {
        return llllllllllllIllIlIIIlllllllIIIII < llllllllllllIllIlIIIllllllIlllll;
    }
    
    public IllegalReferenceCountException(final int llllllllllllIllIlIIlIIIIIIIllllI, final int llllllllllllIllIlIIlIIIIIIIlllIl) {
        final StringBuilder append = new StringBuilder().append(IllegalReferenceCountException.llIlIlllIlIIII[IllegalReferenceCountException.llIlIlllIlIIIl[1]]).append(llllllllllllIllIlIIlIIIIIIIllllI).append(IllegalReferenceCountException.llIlIlllIlIIII[IllegalReferenceCountException.llIlIlllIlIIIl[2]]);
        String str;
        if (lIIlIlIllIlllIll(llllllllllllIllIlIIlIIIIIIIlllIl)) {
            str = String.valueOf(new StringBuilder().append(IllegalReferenceCountException.llIlIlllIlIIII[IllegalReferenceCountException.llIlIlllIlIIIl[3]]).append(llllllllllllIllIlIIlIIIIIIIlllIl));
            "".length();
            if (null != null) {
                throw null;
            }
        }
        else {
            str = String.valueOf(new StringBuilder().append(IllegalReferenceCountException.llIlIlllIlIIII[IllegalReferenceCountException.llIlIlllIlIIIl[4]]).append(-llllllllllllIllIlIIlIIIIIIIlllIl));
        }
        this(String.valueOf(append.append(str)));
    }
    
    public IllegalReferenceCountException() {
    }
    
    private static void lIIlIlIllIlllIIl() {
        (llIlIlllIlIIII = new String[IllegalReferenceCountException.llIlIlllIlIIIl[5]])[IllegalReferenceCountException.llIlIlllIlIIIl[0]] = lIIlIlIllIllIllI("9NcNq9tf7iF/ZKY1w7bNNg==", "vNDzP");
        IllegalReferenceCountException.llIlIlllIlIIII[IllegalReferenceCountException.llIlIlllIlIIIl[1]] = lIIlIlIllIlllIII("Gh0XEQgcQlE=", "hxqRf");
        IllegalReferenceCountException.llIlIlllIlIIII[IllegalReferenceCountException.llIlIlllIlIIIl[2]] = lIIlIlIllIllIllI("gkQYzuBagyY=", "phUJC");
        IllegalReferenceCountException.llIlIlllIlIIII[IllegalReferenceCountException.llIlIlllIlIIIl[3]] = lIIlIlIllIllIllI("1ea12b9PswLjdOd6nq+yBw==", "nzJGx");
        IllegalReferenceCountException.llIlIlllIlIIII[IllegalReferenceCountException.llIlIlllIlIIIl[4]] = lIIlIlIllIlllIII("ETcwOBAYNz0+T1U=", "uRSJu");
    }
    
    private static String lIIlIlIllIllIllI(final String llllllllllllIllIlIIlIIIIIIIIIIII, final String llllllllllllIllIlIIIllllllllllll) {
        try {
            final SecretKeySpec llllllllllllIllIlIIlIIIIIIIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIIllllllllllll.getBytes(StandardCharsets.UTF_8)), IllegalReferenceCountException.llIlIlllIlIIIl[6]), "DES");
            final Cipher llllllllllllIllIlIIlIIIIIIIIIIlI = Cipher.getInstance("DES");
            llllllllllllIllIlIIlIIIIIIIIIIlI.init(IllegalReferenceCountException.llIlIlllIlIIIl[2], llllllllllllIllIlIIlIIIIIIIIIIll);
            return new String(llllllllllllIllIlIIlIIIIIIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIlIIIIIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIlIIIIIIIIIIIl) {
            llllllllllllIllIlIIlIIIIIIIIIIIl.printStackTrace();
            return null;
        }
    }
}
