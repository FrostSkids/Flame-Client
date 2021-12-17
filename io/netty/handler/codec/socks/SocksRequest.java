// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.socks;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public abstract class SocksRequest extends SocksMessage
{
    private final /* synthetic */ SocksRequestType requestType;
    private static final /* synthetic */ int[] lIlIllllIlIIII;
    private static final /* synthetic */ String[] lIlIllllIIllll;
    
    public SocksRequestType requestType() {
        return this.requestType;
    }
    
    protected SocksRequest(final SocksRequestType lllllllllllllIIIIlIlIIIllIlIIIII) {
        super(SocksMessageType.REQUEST);
        if (llllIlIIllIIlII(lllllllllllllIIIIlIlIIIllIlIIIII)) {
            throw new NullPointerException(SocksRequest.lIlIllllIIllll[SocksRequest.lIlIllllIlIIII[0]]);
        }
        this.requestType = lllllllllllllIIIIlIlIIIllIlIIIII;
    }
    
    private static boolean llllIlIIllIIlII(final Object lllllllllllllIIIIlIlIIIllIIIllII) {
        return lllllllllllllIIIIlIlIIIllIIIllII == null;
    }
    
    static {
        llllIlIIllIIIll();
        llllIlIIlIlllll();
    }
    
    private static void llllIlIIlIlllll() {
        (lIlIllllIIllll = new String[SocksRequest.lIlIllllIlIIII[1]])[SocksRequest.lIlIllllIlIIII[0]] = llllIlIIlIllllI("43Q+UMEA/2sstyfTzfXLnA==", "tKdrC");
    }
    
    private static void llllIlIIllIIIll() {
        (lIlIllllIlIIII = new int[4])[0] = ((0x5 ^ 0x35 ^ (0x8C ^ 0x94)) & (0x3A ^ 0x31 ^ (0x30 ^ 0x13) ^ -" ".length()));
        SocksRequest.lIlIllllIlIIII[1] = " ".length();
        SocksRequest.lIlIllllIlIIII[2] = (0xE ^ 0x57 ^ (0x79 ^ 0x28));
        SocksRequest.lIlIllllIlIIII[3] = "  ".length();
    }
    
    private static String llllIlIIlIllllI(final String lllllllllllllIIIIlIlIIIllIIlIIll, final String lllllllllllllIIIIlIlIIIllIIlIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIlIIIllIIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIlIIIllIIlIIlI.getBytes(StandardCharsets.UTF_8)), SocksRequest.lIlIllllIlIIII[2]), "DES");
            final Cipher lllllllllllllIIIIlIlIIIllIIlIlIl = Cipher.getInstance("DES");
            lllllllllllllIIIIlIlIIIllIIlIlIl.init(SocksRequest.lIlIllllIlIIII[3], lllllllllllllIIIIlIlIIIllIIlIllI);
            return new String(lllllllllllllIIIIlIlIIIllIIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIlIIIllIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIlIIIllIIlIlII) {
            lllllllllllllIIIIlIlIIIllIIlIlII.printStackTrace();
            return null;
        }
    }
}
