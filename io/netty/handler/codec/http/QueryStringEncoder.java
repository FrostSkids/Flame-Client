// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import java.net.URISyntaxException;
import java.net.URI;
import java.util.ArrayList;
import java.io.UnsupportedEncodingException;
import java.nio.charset.UnsupportedCharsetException;
import java.net.URLEncoder;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import java.nio.charset.Charset;

public class QueryStringEncoder
{
    private final /* synthetic */ Charset charset;
    private final /* synthetic */ List<Param> params;
    private final /* synthetic */ String uri;
    private static final /* synthetic */ String[] llIIIlIIIlllII;
    private static final /* synthetic */ int[] llIIIlIIlllIIl;
    
    public void addParam(final String llllllllllllIlllIlIllllIlIlllIII, final String llllllllllllIlllIlIllllIlIlllIlI) {
        if (lIIIlIIlIIlIIIIl(llllllllllllIlllIlIllllIlIlllIII)) {
            throw new NullPointerException(QueryStringEncoder.llIIIlIIIlllII[QueryStringEncoder.llIIIlIIlllIIl[2]]);
        }
        this.params.add(new Param(llllllllllllIlllIlIllllIlIlllIII, llllllllllllIlllIlIllllIlIlllIlI));
        "".length();
    }
    
    @Override
    public String toString() {
        if (lIIIlIIlIIlIIIlI(this.params.isEmpty() ? 1 : 0)) {
            return this.uri;
        }
        final StringBuilder llllllllllllIlllIlIllllIlIlIllIl = new StringBuilder(this.uri).append((char)QueryStringEncoder.llIIIlIIlllIIl[3]);
        int llllllllllllIlllIlIllllIlIlIlllI = QueryStringEncoder.llIIIlIIlllIIl[0];
        while (lIIIlIIlIIlIIIll(llllllllllllIlllIlIllllIlIlIlllI, this.params.size())) {
            final Param llllllllllllIlllIlIllllIlIlIllll = this.params.get(llllllllllllIlllIlIllllIlIlIlllI);
            llllllllllllIlllIlIllllIlIlIllIl.append(encodeComponent(llllllllllllIlllIlIllllIlIlIllll.name, this.charset));
            "".length();
            if (lIIIlIIlIIlIIlII(llllllllllllIlllIlIllllIlIlIllll.value)) {
                llllllllllllIlllIlIllllIlIlIllIl.append((char)QueryStringEncoder.llIIIlIIlllIIl[4]);
                "".length();
                llllllllllllIlllIlIllllIlIlIllIl.append(encodeComponent(llllllllllllIlllIlIllllIlIlIllll.value, this.charset));
                "".length();
            }
            if (lIIIlIIlIIlIIlIl(llllllllllllIlllIlIllllIlIlIlllI, this.params.size() - QueryStringEncoder.llIIIlIIlllIIl[1])) {
                llllllllllllIlllIlIllllIlIlIllIl.append((char)QueryStringEncoder.llIIIlIIlllIIl[5]);
                "".length();
            }
            ++llllllllllllIlllIlIllllIlIlIlllI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlIllllIlIlIllIl);
    }
    
    private static boolean lIIIlIIlIIlIIlIl(final int llllllllllllIlllIlIllllIIllIIIII, final int llllllllllllIlllIlIllllIIlIlllll) {
        return llllllllllllIlllIlIllllIIllIIIII != llllllllllllIlllIlIllllIIlIlllll;
    }
    
    private static boolean lIIIlIIlIIlIIIlI(final int llllllllllllIlllIlIllllIIllIIIll) {
        return llllllllllllIlllIlIllllIIllIIIll != 0;
    }
    
    private static boolean lIIIlIIlIIlIIlII(final Object llllllllllllIlllIlIllllIIllIIlll) {
        return llllllllllllIlllIlIllllIIllIIlll != null;
    }
    
    private static String lIIIlIIIlllIllIl(final String llllllllllllIlllIlIllllIlIIlIlIl, final String llllllllllllIlllIlIllllIlIIlIlII) {
        try {
            final SecretKeySpec llllllllllllIlllIlIllllIlIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIllllIlIIlIlII.getBytes(StandardCharsets.UTF_8)), QueryStringEncoder.llIIIlIIlllIIl[9]), "DES");
            final Cipher llllllllllllIlllIlIllllIlIIllIIl = Cipher.getInstance("DES");
            llllllllllllIlllIlIllllIlIIllIIl.init(QueryStringEncoder.llIIIlIIlllIIl[2], llllllllllllIlllIlIllllIlIIllIlI);
            return new String(llllllllllllIlllIlIllllIlIIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIllllIlIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIllllIlIIllIII) {
            llllllllllllIlllIlIllllIlIIllIII.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIlIIlIIlIIIII() {
        (llIIIlIIlllIIl = new int[10])[0] = ((0xFF ^ 0xBB) & ~(0xF9 ^ 0xBD));
        QueryStringEncoder.llIIIlIIlllIIl[1] = " ".length();
        QueryStringEncoder.llIIIlIIlllIIl[2] = "  ".length();
        QueryStringEncoder.llIIIlIIlllIIl[3] = (0x77 ^ 0x35 ^ (0x36 ^ 0x4B));
        QueryStringEncoder.llIIIlIIlllIIl[4] = (0x51 ^ 0x6C);
        QueryStringEncoder.llIIIlIIlllIIl[5] = (0x89 ^ 0xAF);
        QueryStringEncoder.llIIIlIIlllIIl[6] = "   ".length();
        QueryStringEncoder.llIIIlIIlllIIl[7] = (0x3E ^ 0x3A);
        QueryStringEncoder.llIIIlIIlllIIl[8] = (0x1A ^ 0x1F);
        QueryStringEncoder.llIIIlIIlllIIl[9] = (0x43 ^ 0xA ^ (0xC3 ^ 0x82));
    }
    
    private static String lIIIlIIIlllIllII(String llllllllllllIlllIlIllllIlIIIIIlI, final String llllllllllllIlllIlIllllIlIIIIllI) {
        llllllllllllIlllIlIllllIlIIIIIlI = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIlIllllIlIIIIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlIllllIlIIIIlIl = new StringBuilder();
        final char[] llllllllllllIlllIlIllllIlIIIIlII = llllllllllllIlllIlIllllIlIIIIllI.toCharArray();
        int llllllllllllIlllIlIllllIlIIIIIll = QueryStringEncoder.llIIIlIIlllIIl[0];
        final float llllllllllllIlllIlIllllIIlllllIl = (Object)((String)llllllllllllIlllIlIllllIlIIIIIlI).toCharArray();
        final String llllllllllllIlllIlIllllIIlllllII = (String)llllllllllllIlllIlIllllIIlllllIl.length;
        char llllllllllllIlllIlIllllIIllllIll = (char)QueryStringEncoder.llIIIlIIlllIIl[0];
        while (lIIIlIIlIIlIIIll(llllllllllllIlllIlIllllIIllllIll, (int)llllllllllllIlllIlIllllIIlllllII)) {
            final char llllllllllllIlllIlIllllIlIIIlIII = llllllllllllIlllIlIllllIIlllllIl[llllllllllllIlllIlIllllIIllllIll];
            llllllllllllIlllIlIllllIlIIIIlIl.append((char)(llllllllllllIlllIlIllllIlIIIlIII ^ llllllllllllIlllIlIllllIlIIIIlII[llllllllllllIlllIlIllllIlIIIIIll % llllllllllllIlllIlIllllIlIIIIlII.length]));
            "".length();
            ++llllllllllllIlllIlIllllIlIIIIIll;
            ++llllllllllllIlllIlIllllIIllllIll;
            "".length();
            if (((0x46 ^ 0x58 ^ (0xAE ^ 0xA7)) & (0x2E ^ 0xF ^ (0x65 ^ 0x53) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlIllllIlIIIIlIl);
    }
    
    private static void lIIIlIIIlllIlllI() {
        (llIIIlIIIlllII = new String[QueryStringEncoder.llIIIlIIlllIIl[8]])[QueryStringEncoder.llIIIlIIlllIIl[0]] = lIIIlIIIlllIlIll("kYnALNn2Lao=", "VTcfG");
        QueryStringEncoder.llIIIlIIIlllII[QueryStringEncoder.llIIIlIIlllIIl[1]] = lIIIlIIIlllIllII("GRIPBBofDg==", "zznvi");
        QueryStringEncoder.llIIIlIIIlllII[QueryStringEncoder.llIIIlIIlllIIl[2]] = lIIIlIIIlllIllIl("/kIzq08lbvk=", "YaJHb");
        QueryStringEncoder.llIIIlIIIlllII[QueryStringEncoder.llIIIlIIlllIIl[6]] = lIIIlIIIlllIllII("RA==", "oTSdv");
        QueryStringEncoder.llIIIlIIIlllII[QueryStringEncoder.llIIIlIIlllIIl[7]] = lIIIlIIIlllIllII("XWN0", "xQDdK");
    }
    
    private static boolean lIIIlIIlIIlIIIIl(final Object llllllllllllIlllIlIllllIIllIIlIl) {
        return llllllllllllIlllIlIllllIIllIIlIl == null;
    }
    
    private static String encodeComponent(final String llllllllllllIlllIlIllllIlIlIIIll, final Charset llllllllllllIlllIlIllllIlIlIIIlI) {
        try {
            return URLEncoder.encode(llllllllllllIlllIlIllllIlIlIIIll, llllllllllllIlllIlIllllIlIlIIIlI.name()).replace(QueryStringEncoder.llIIIlIIIlllII[QueryStringEncoder.llIIIlIIlllIIl[6]], QueryStringEncoder.llIIIlIIIlllII[QueryStringEncoder.llIIIlIIlllIIl[7]]);
        }
        catch (UnsupportedEncodingException llllllllllllIlllIlIllllIlIlIIlII) {
            throw new UnsupportedCharsetException(llllllllllllIlllIlIllllIlIlIIIlI.name());
        }
    }
    
    static {
        lIIIlIIlIIlIIIII();
        lIIIlIIIlllIlllI();
    }
    
    public QueryStringEncoder(final String llllllllllllIlllIlIllllIllIIIIIl, final Charset llllllllllllIlllIlIllllIllIIIIII) {
        this.params = new ArrayList<Param>();
        if (lIIIlIIlIIlIIIIl(llllllllllllIlllIlIllllIllIIIIIl)) {
            throw new NullPointerException(QueryStringEncoder.llIIIlIIIlllII[QueryStringEncoder.llIIIlIIlllIIl[0]]);
        }
        if (lIIIlIIlIIlIIIIl(llllllllllllIlllIlIllllIllIIIIII)) {
            throw new NullPointerException(QueryStringEncoder.llIIIlIIIlllII[QueryStringEncoder.llIIIlIIlllIIl[1]]);
        }
        this.uri = llllllllllllIlllIlIllllIllIIIIIl;
        this.charset = llllllllllllIlllIlIllllIllIIIIII;
    }
    
    private static String lIIIlIIIlllIlIll(final String llllllllllllIlllIlIllllIIlllIIlI, final String llllllllllllIlllIlIllllIIlllIIIl) {
        try {
            final SecretKeySpec llllllllllllIlllIlIllllIIlllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIllllIIlllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlIllllIIlllIlII = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlIllllIIlllIlII.init(QueryStringEncoder.llIIIlIIlllIIl[2], llllllllllllIlllIlIllllIIlllIlIl);
            return new String(llllllllllllIlllIlIllllIIlllIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIllllIIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIllllIIlllIIll) {
            llllllllllllIlllIlIllllIIlllIIll.printStackTrace();
            return null;
        }
    }
    
    public URI toUri() throws URISyntaxException {
        return new URI(this.toString());
    }
    
    private static boolean lIIIlIIlIIlIIIll(final int llllllllllllIlllIlIllllIIllIlIlI, final int llllllllllllIlllIlIllllIIllIlIIl) {
        return llllllllllllIlllIlIllllIIllIlIlI < llllllllllllIlllIlIllllIIllIlIIl;
    }
    
    public QueryStringEncoder(final String llllllllllllIlllIlIllllIllIIlIll) {
        this(llllllllllllIlllIlIllllIllIIlIll, HttpConstants.DEFAULT_CHARSET);
    }
    
    private static final class Param
    {
        final /* synthetic */ String name;
        final /* synthetic */ String value;
        
        Param(final String lllllllllllllIIIIlIIlIIIIIIlIIIl, final String lllllllllllllIIIIlIIlIIIIIIIllIl) {
            this.value = lllllllllllllIIIIlIIlIIIIIIIllIl;
            this.name = lllllllllllllIIIIlIIlIIIIIIlIIIl;
        }
    }
}
