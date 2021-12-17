// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.ssl;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import javax.net.ssl.SSLException;

public class NotSslRecordException extends SSLException
{
    private static final /* synthetic */ int[] lllIIllIlllIIl;
    private static final /* synthetic */ String[] lllIIllIllIlll;
    
    private static String lIlIIIIIlIIIIIII(final String llllllllllllIlIlllIlllIllllIIIII, final String llllllllllllIlIlllIlllIlllIlllIl) {
        try {
            final SecretKeySpec llllllllllllIlIlllIlllIllllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIlllIlllIlllIl.getBytes(StandardCharsets.UTF_8)), NotSslRecordException.lllIIllIlllIIl[2]), "DES");
            final Cipher llllllllllllIlIlllIlllIllllIIIlI = Cipher.getInstance("DES");
            llllllllllllIlIlllIlllIllllIIIlI.init(NotSslRecordException.lllIIllIlllIIl[3], llllllllllllIlIlllIlllIllllIIIll);
            return new String(llllllllllllIlIlllIlllIllllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIlllIllllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIlllIllllIIIIl) {
            llllllllllllIlIlllIlllIllllIIIIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lIlIIIIIlIIIIlIl();
        lIlIIIIIlIIIIIIl();
    }
    
    public NotSslRecordException(final String llllllllllllIlIlllIlllIlllllIlll) {
        super(llllllllllllIlIlllIlllIlllllIlll);
    }
    
    public NotSslRecordException(final String llllllllllllIlIlllIlllIllllIllII, final Throwable llllllllllllIlIlllIlllIllllIlIII) {
        super(llllllllllllIlIlllIlllIllllIllII, llllllllllllIlIlllIlllIllllIlIII);
    }
    
    private static void lIlIIIIIlIIIIIIl() {
        (lllIIllIllIlll = new String[NotSslRecordException.lllIIllIlllIIl[1]])[NotSslRecordException.lllIIllIlllIIl[0]] = lIlIIIIIlIIIIIII("xRsogHlMMg8=", "gHdLS");
    }
    
    public NotSslRecordException(final Throwable llllllllllllIlIlllIlllIlllllIIIl) {
        super(llllllllllllIlIlllIlllIlllllIIIl);
    }
    
    private static void lIlIIIIIlIIIIlIl() {
        (lllIIllIlllIIl = new int[4])[0] = (" ".length() & ~" ".length());
        NotSslRecordException.lllIIllIlllIIl[1] = " ".length();
        NotSslRecordException.lllIIllIlllIIl[2] = (65 + 88 - 49 + 30 ^ 33 + 29 - 20 + 100);
        NotSslRecordException.lllIIllIlllIIl[3] = "  ".length();
    }
    
    public NotSslRecordException() {
        super(NotSslRecordException.lllIIllIllIlll[NotSslRecordException.lllIIllIlllIIl[0]]);
    }
}
