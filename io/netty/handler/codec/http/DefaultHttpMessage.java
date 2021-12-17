// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Iterator;
import io.netty.util.internal.StringUtil;
import java.util.Map;

public abstract class DefaultHttpMessage extends DefaultHttpObject implements HttpMessage
{
    private static final /* synthetic */ String[] lIIIllllllIIlI;
    private final /* synthetic */ HttpHeaders headers;
    private /* synthetic */ HttpVersion version;
    private static final /* synthetic */ int[] lIIIllllllIllI;
    
    @Override
    public HttpMessage setProtocolVersion(final HttpVersion lllllllllllllIIllllIIIIlIllllIlI) {
        if (llIIlIIIlIlIlIl(lllllllllllllIIllllIIIIlIllllIlI)) {
            throw new NullPointerException(DefaultHttpMessage.lIIIllllllIIlI[DefaultHttpMessage.lIIIllllllIllI[4]]);
        }
        this.version = lllllllllllllIIllllIIIIlIllllIlI;
        return this;
    }
    
    void appendHeaders(final StringBuilder lllllllllllllIIllllIIIIlIllIlllI) {
        final Iterator lllllllllllllIIllllIIIIlIlllIIlI = this.headers().iterator();
        while (llIIlIIIlIlIllI(lllllllllllllIIllllIIIIlIlllIIlI.hasNext() ? 1 : 0)) {
            final Map.Entry<String, String> lllllllllllllIIllllIIIIlIlllIIll = lllllllllllllIIllllIIIIlIlllIIlI.next();
            lllllllllllllIIllllIIIIlIllIlllI.append(lllllllllllllIIllllIIIIlIlllIIll.getKey());
            "".length();
            lllllllllllllIIllllIIIIlIllIlllI.append(DefaultHttpMessage.lIIIllllllIIlI[DefaultHttpMessage.lIIIllllllIllI[5]]);
            "".length();
            lllllllllllllIIllllIIIIlIllIlllI.append(lllllllllllllIIllllIIIIlIlllIIll.getValue());
            "".length();
            lllllllllllllIIllllIIIIlIllIlllI.append(StringUtil.NEWLINE);
            "".length();
            "".length();
            if (((0x24 ^ 0x69) & ~(0x64 ^ 0x29)) != 0x0) {
                return;
            }
        }
    }
    
    static {
        llIIlIIIlIlIlII();
        llIIlIIIlIlIIll();
    }
    
    private static void llIIlIIIlIlIIll() {
        (lIIIllllllIIlI = new String[DefaultHttpMessage.lIIIllllllIllI[6]])[DefaultHttpMessage.lIIIllllllIllI[1]] = llIIlIIIlIIlIII("LvBcl89oIMs=", "Kdiwj");
        DefaultHttpMessage.lIIIllllllIIlI[DefaultHttpMessage.lIIIllllllIllI[0]] = llIIlIIIlIlIIII("Qw4TJhgCFxhuSw==", "kxvTk");
        DefaultHttpMessage.lIIIllllllIIlI[DefaultHttpMessage.lIIIllllllIllI[2]] = llIIlIIIlIlIIlI("xWax08cAO4odzSSBfL0xEg==", "LJrvQ");
        DefaultHttpMessage.lIIIllllllIIlI[DefaultHttpMessage.lIIIllllllIllI[4]] = llIIlIIIlIlIIII("HjwrPA0HNw==", "hYYOd");
        DefaultHttpMessage.lIIIllllllIIlI[DefaultHttpMessage.lIIIllllllIllI[5]] = llIIlIIIlIlIIII("S1M=", "qsZnK");
    }
    
    private static String llIIlIIIlIlIIlI(final String lllllllllllllIIllllIIIIlIlIIllII, final String lllllllllllllIIllllIIIIlIlIIlIll) {
        try {
            final SecretKeySpec lllllllllllllIIllllIIIIlIlIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIIIIlIlIIlIll.getBytes(StandardCharsets.UTF_8)), DefaultHttpMessage.lIIIllllllIllI[7]), "DES");
            final Cipher lllllllllllllIIllllIIIIlIlIIlllI = Cipher.getInstance("DES");
            lllllllllllllIIllllIIIIlIlIIlllI.init(DefaultHttpMessage.lIIIllllllIllI[2], lllllllllllllIIllllIIIIlIlIIllll);
            return new String(lllllllllllllIIllllIIIIlIlIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIIIIlIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIIIIlIlIIllIl) {
            lllllllllllllIIllllIIIIlIlIIllIl.printStackTrace();
            return null;
        }
    }
    
    protected DefaultHttpMessage(final HttpVersion lllllllllllllIIllllIIIIllIIIlIll, final boolean lllllllllllllIIllllIIIIllIIIlIlI) {
        if (llIIlIIIlIlIlIl(lllllllllllllIIllllIIIIllIIIlIll)) {
            throw new NullPointerException(DefaultHttpMessage.lIIIllllllIIlI[DefaultHttpMessage.lIIIllllllIllI[1]]);
        }
        this.version = lllllllllllllIIllllIIIIllIIIlIll;
        this.headers = new DefaultHttpHeaders(lllllllllllllIIllllIIIIllIIIlIlI);
    }
    
    private static boolean llIIlIIIlIlIlIl(final Object lllllllllllllIIllllIIIIlIIllIlII) {
        return lllllllllllllIIllllIIIIlIIllIlII == null;
    }
    
    protected DefaultHttpMessage(final HttpVersion lllllllllllllIIllllIIIIllIIlIlIl) {
        this(lllllllllllllIIllllIIIIllIIlIlIl, (boolean)(DefaultHttpMessage.lIIIllllllIllI[0] != 0));
    }
    
    private static String llIIlIIIlIlIIII(String lllllllllllllIIllllIIIIlIlIlllII, final String lllllllllllllIIllllIIIIlIllIIIII) {
        lllllllllllllIIllllIIIIlIlIlllII = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllllIIIIlIlIlllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllllIIIIlIlIlllll = new StringBuilder();
        final char[] lllllllllllllIIllllIIIIlIlIllllI = lllllllllllllIIllllIIIIlIllIIIII.toCharArray();
        int lllllllllllllIIllllIIIIlIlIlllIl = DefaultHttpMessage.lIIIllllllIllI[1];
        final char lllllllllllllIIllllIIIIlIlIlIlll = (Object)((String)lllllllllllllIIllllIIIIlIlIlllII).toCharArray();
        final double lllllllllllllIIllllIIIIlIlIlIllI = lllllllllllllIIllllIIIIlIlIlIlll.length;
        Exception lllllllllllllIIllllIIIIlIlIlIlIl = (Exception)DefaultHttpMessage.lIIIllllllIllI[1];
        while (llIIlIIIlIlIlll((int)lllllllllllllIIllllIIIIlIlIlIlIl, (int)lllllllllllllIIllllIIIIlIlIlIllI)) {
            final char lllllllllllllIIllllIIIIlIllIIIlI = lllllllllllllIIllllIIIIlIlIlIlll[lllllllllllllIIllllIIIIlIlIlIlIl];
            lllllllllllllIIllllIIIIlIlIlllll.append((char)(lllllllllllllIIllllIIIIlIllIIIlI ^ lllllllllllllIIllllIIIIlIlIllllI[lllllllllllllIIllllIIIIlIlIlllIl % lllllllllllllIIllllIIIIlIlIllllI.length]));
            "".length();
            ++lllllllllllllIIllllIIIIlIlIlllIl;
            ++lllllllllllllIIllllIIIIlIlIlIlIl;
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllllIIIIlIlIlllll);
    }
    
    private static void llIIlIIIlIlIlII() {
        (lIIIllllllIllI = new int[8])[0] = " ".length();
        DefaultHttpMessage.lIIIllllllIllI[1] = ((68 + 29 - 26 + 61 ^ 126 + 16 - 45 + 34) & (0x4D ^ 0x5D ^ (0x4F ^ 0x58) ^ -" ".length()));
        DefaultHttpMessage.lIIIllllllIllI[2] = "  ".length();
        DefaultHttpMessage.lIIIllllllIllI[3] = (0xEF ^ 0xC6);
        DefaultHttpMessage.lIIIllllllIllI[4] = "   ".length();
        DefaultHttpMessage.lIIIllllllIllI[5] = (0x36 ^ 0x32);
        DefaultHttpMessage.lIIIllllllIllI[6] = (18 + 65 + 60 + 56 ^ 115 + 150 - 211 + 140);
        DefaultHttpMessage.lIIIllllllIllI[7] = (0x6C ^ 0x64);
    }
    
    @Override
    public String toString() {
        final StringBuilder lllllllllllllIIllllIIIIllIIIIIII = new StringBuilder();
        lllllllllllllIIllllIIIIllIIIIIII.append(StringUtil.simpleClassName(this));
        "".length();
        lllllllllllllIIllllIIIIllIIIIIII.append(DefaultHttpMessage.lIIIllllllIIlI[DefaultHttpMessage.lIIIllllllIllI[0]]);
        "".length();
        lllllllllllllIIllllIIIIllIIIIIII.append(this.getProtocolVersion().text());
        "".length();
        lllllllllllllIIllllIIIIllIIIIIII.append(DefaultHttpMessage.lIIIllllllIIlI[DefaultHttpMessage.lIIIllllllIllI[2]]);
        "".length();
        lllllllllllllIIllllIIIIllIIIIIII.append(HttpHeaders.isKeepAlive(this));
        "".length();
        lllllllllllllIIllllIIIIllIIIIIII.append((char)DefaultHttpMessage.lIIIllllllIllI[3]);
        "".length();
        lllllllllllllIIllllIIIIllIIIIIII.append(StringUtil.NEWLINE);
        "".length();
        this.appendHeaders(lllllllllllllIIllllIIIIllIIIIIII);
        lllllllllllllIIllllIIIIllIIIIIII.setLength(lllllllllllllIIllllIIIIllIIIIIII.length() - StringUtil.NEWLINE.length());
        return String.valueOf(lllllllllllllIIllllIIIIllIIIIIII);
    }
    
    private static boolean llIIlIIIlIlIllI(final int lllllllllllllIIllllIIIIlIIllIIlI) {
        return lllllllllllllIIllllIIIIlIIllIIlI != 0;
    }
    
    @Override
    public HttpVersion getProtocolVersion() {
        return this.version;
    }
    
    private static String llIIlIIIlIIlIII(final String lllllllllllllIIllllIIIIlIIllllIl, final String lllllllllllllIIllllIIIIlIIlllllI) {
        try {
            final SecretKeySpec lllllllllllllIIllllIIIIlIlIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIIIIlIIlllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllIIIIlIlIIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllIIIIlIlIIIIIl.init(DefaultHttpMessage.lIIIllllllIllI[2], lllllllllllllIIllllIIIIlIlIIIIlI);
            return new String(lllllllllllllIIllllIIIIlIlIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIIIIlIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIIIIlIlIIIIII) {
            lllllllllllllIIllllIIIIlIlIIIIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public HttpHeaders headers() {
        return this.headers;
    }
    
    private static boolean llIIlIIIlIlIlll(final int lllllllllllllIIllllIIIIlIIllIlll, final int lllllllllllllIIllllIIIIlIIllIllI) {
        return lllllllllllllIIllllIIIIlIIllIlll < lllllllllllllIIllllIIIIlIIllIllI;
    }
}
