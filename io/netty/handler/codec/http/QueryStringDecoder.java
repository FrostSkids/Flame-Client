// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

public class QueryStringDecoder
{
    private /* synthetic */ int nParams;
    private /* synthetic */ Map<String, List<String>> params;
    private final /* synthetic */ String uri;
    private static final /* synthetic */ int[] lIIllIlllIllIl;
    private final /* synthetic */ Charset charset;
    private final /* synthetic */ int maxParams;
    private /* synthetic */ String path;
    private final /* synthetic */ boolean hasPath;
    private static final /* synthetic */ String[] lIIllIlllIlIlI;
    
    public static String decodeComponent(final String lllllllllllllIIlIlIIlIlIlIIlllll, final Charset lllllllllllllIIlIlIIlIlIlIlIIlII) {
        if (llIllIlIIIIllll(lllllllllllllIIlIlIIlIlIlIIlllll)) {
            return QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[18]];
        }
        final int lllllllllllllIIlIlIIlIlIlIlIIIll = lllllllllllllIIlIlIIlIlIlIIlllll.length();
        boolean lllllllllllllIIlIlIIlIlIlIlIIIlI = QueryStringDecoder.lIIllIlllIllIl[2] != 0;
        int lllllllllllllIIlIlIIlIlIlIlIlIIl = QueryStringDecoder.lIIllIlllIllIl[2];
        while (llIllIlIIIlIllI(lllllllllllllIIlIlIIlIlIlIlIlIIl, lllllllllllllIIlIlIIlIlIlIlIIIll)) {
            final char lllllllllllllIIlIlIIlIlIlIlIlIlI = lllllllllllllIIlIlIIlIlIlIIlllll.charAt(lllllllllllllIIlIlIIlIlIlIlIlIIl);
            if (!llIllIlIIIlIlll(lllllllllllllIIlIlIIlIlIlIlIlIlI, QueryStringDecoder.lIIllIlllIllIl[19]) || llIllIlIIIlIlIl(lllllllllllllIIlIlIIlIlIlIlIlIlI, QueryStringDecoder.lIIllIlllIllIl[20])) {
                lllllllllllllIIlIlIIlIlIlIlIIIlI = (QueryStringDecoder.lIIllIlllIllIl[0] != 0);
                "".length();
                if ((0x68 ^ 0x59 ^ (0x14 ^ 0x21)) < 0) {
                    return null;
                }
                break;
            }
            else {
                ++lllllllllllllIIlIlIIlIlIlIlIlIIl;
                "".length();
                if (null != null) {
                    return null;
                }
                continue;
            }
        }
        if (llIllIlIIIlIIlI(lllllllllllllIIlIlIIlIlIlIlIIIlI ? 1 : 0)) {
            return lllllllllllllIIlIlIIlIlIlIIlllll;
        }
        final byte[] lllllllllllllIIlIlIIlIlIlIlIIIIl = new byte[lllllllllllllIIlIlIIlIlIlIlIIIll];
        int lllllllllllllIIlIlIIlIlIlIlIIIII = QueryStringDecoder.lIIllIlllIllIl[2];
        int lllllllllllllIIlIlIIlIlIlIlIIllI = QueryStringDecoder.lIIllIlllIllIl[2];
        while (llIllIlIIIlIllI(lllllllllllllIIlIlIIlIlIlIlIIllI, lllllllllllllIIlIlIIlIlIlIlIIIll)) {
            char lllllllllllllIIlIlIIlIlIlIlIIlll = lllllllllllllIIlIlIIlIlIlIIlllll.charAt(lllllllllllllIIlIlIIlIlIlIlIIllI);
            Label_0567: {
                switch (lllllllllllllIIlIlIIlIlIlIlIIlll) {
                    case '+': {
                        lllllllllllllIIlIlIIlIlIlIlIIIIl[lllllllllllllIIlIlIIlIlIlIlIIIII++] = (byte)QueryStringDecoder.lIIllIlllIllIl[21];
                        "".length();
                        if (((0xAA ^ 0x80) & ~(0x41 ^ 0x6B)) >= "   ".length()) {
                            return null;
                        }
                        break Label_0567;
                    }
                    case '%': {
                        if (llIllIlIIIlIlIl(lllllllllllllIIlIlIIlIlIlIlIIllI, lllllllllllllIIlIlIIlIlIlIlIIIll - QueryStringDecoder.lIIllIlllIllIl[0])) {
                            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[22]]).append(lllllllllllllIIlIlIIlIlIlIIlllll)));
                        }
                        lllllllllllllIIlIlIIlIlIlIlIIlll = lllllllllllllIIlIlIIlIlIlIIlllll.charAt(++lllllllllllllIIlIlIIlIlIlIlIIllI);
                        if (llIllIlIIIlIlIl(lllllllllllllIIlIlIIlIlIlIlIIlll, QueryStringDecoder.lIIllIlllIllIl[19])) {
                            lllllllllllllIIlIlIIlIlIlIlIIIIl[lllllllllllllIIlIlIIlIlIlIlIIIII++] = (byte)QueryStringDecoder.lIIllIlllIllIl[19];
                            "".length();
                            if ("   ".length() < 0) {
                                return null;
                            }
                            break Label_0567;
                        }
                        else {
                            if (llIllIlIIIlIlIl(lllllllllllllIIlIlIIlIlIlIlIIllI, lllllllllllllIIlIlIIlIlIlIlIIIll - QueryStringDecoder.lIIllIlllIllIl[0])) {
                                throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[23]]).append(lllllllllllllIIlIlIIlIlIlIIlllll)));
                            }
                            lllllllllllllIIlIlIIlIlIlIlIIlll = decodeHexNibble(lllllllllllllIIlIlIIlIlIlIlIIlll);
                            final char lllllllllllllIIlIlIIlIlIlIlIlIII = decodeHexNibble(lllllllllllllIIlIlIIlIlIlIIlllll.charAt(++lllllllllllllIIlIlIIlIlIlIlIIllI));
                            if (!llIllIlIIIlIlll(lllllllllllllIIlIlIIlIlIlIlIIlll, QueryStringDecoder.lIIllIlllIllIl[24]) || llIllIlIIIlIlIl(lllllllllllllIIlIlIIlIlIlIlIlIII, QueryStringDecoder.lIIllIlllIllIl[24])) {
                                throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[25]]).append(lllllllllllllIIlIlIIlIlIlIIlllll.charAt(lllllllllllllIIlIlIIlIlIlIlIIllI - QueryStringDecoder.lIIllIlllIllIl[0])).append(lllllllllllllIIlIlIIlIlIlIIlllll.charAt(lllllllllllllIIlIlIIlIlIlIlIIllI)).append(QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[26]]).append(lllllllllllllIIlIlIIlIlIlIlIIllI - QueryStringDecoder.lIIllIlllIllIl[3]).append(QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[27]]).append(lllllllllllllIIlIlIIlIlIlIIlllll)));
                            }
                            lllllllllllllIIlIlIIlIlIlIlIIlll = (char)(lllllllllllllIIlIlIIlIlIlIlIIlll * QueryStringDecoder.lIIllIlllIllIl[25] + lllllllllllllIIlIlIIlIlIlIlIlIII);
                            break;
                        }
                        break;
                    }
                }
                lllllllllllllIIlIlIIlIlIlIlIIIIl[lllllllllllllIIlIlIIlIlIlIlIIIII++] = (byte)lllllllllllllIIlIlIIlIlIlIlIIlll;
            }
            ++lllllllllllllIIlIlIIlIlIlIlIIllI;
            "".length();
            if (-" ".length() > ((0x53 ^ 0x17) & ~(0x8 ^ 0x4C))) {
                return null;
            }
        }
        return new String(lllllllllllllIIlIlIIlIlIlIlIIIIl, QueryStringDecoder.lIIllIlllIllIl[2], lllllllllllllIIlIlIIlIlIlIlIIIII, lllllllllllllIIlIlIIlIlIlIlIIlII);
    }
    
    private static boolean llIllIlIIIlIlIl(final int lllllllllllllIIlIlIIlIlIIlIlllll, final int lllllllllllllIIlIlIIlIlIIlIllllI) {
        return lllllllllllllIIlIlIIlIlIIlIlllll == lllllllllllllIIlIlIIlIlIIlIllllI;
    }
    
    public static String decodeComponent(final String lllllllllllllIIlIlIIlIlIlIllIlII) {
        return decodeComponent(lllllllllllllIIlIlIIlIlIlIllIlII, HttpConstants.DEFAULT_CHARSET);
    }
    
    public QueryStringDecoder(final URI lllllllllllllIIlIlIIlIlIlllllIlI, final Charset lllllllllllllIIlIlIIlIlIllllIllI) {
        this(lllllllllllllIIlIlIIlIlIlllllIlI, lllllllllllllIIlIlIIlIlIllllIllI, QueryStringDecoder.lIIllIlllIllIl[1]);
    }
    
    private static boolean llIllIlIIIlIIll(final int lllllllllllllIIlIlIIlIlIIlIIlIII) {
        return lllllllllllllIIlIlIIlIlIIlIIlIII < 0;
    }
    
    public QueryStringDecoder(final String lllllllllllllIIlIlIIlIllIIIIllIl, final Charset lllllllllllllIIlIlIIlIllIIIIIlll, final boolean lllllllllllllIIlIlIIlIllIIIIIllI, final int lllllllllllllIIlIlIIlIllIIIIlIlI) {
        if (llIllIlIIIIllll(lllllllllllllIIlIlIIlIllIIIIllIl)) {
            throw new NullPointerException(QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[2]]);
        }
        if (llIllIlIIIIllll(lllllllllllllIIlIlIIlIllIIIIIlll)) {
            throw new NullPointerException(QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[0]]);
        }
        if (llIllIlIIIlIIII(lllllllllllllIIlIlIIlIllIIIIlIlI)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[3]]).append(lllllllllllllIIlIlIIlIllIIIIlIlI).append(QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[4]])));
        }
        this.uri = lllllllllllllIIlIlIIlIllIIIIllIl;
        this.charset = lllllllllllllIIlIlIIlIllIIIIIlll;
        this.maxParams = lllllllllllllIIlIlIIlIllIIIIlIlI;
        this.hasPath = lllllllllllllIIlIlIIlIllIIIIIllI;
    }
    
    static {
        llIllIlIIIIlllI();
        llIllIlIIIIlIll();
        DEFAULT_MAX_PARAMS = QueryStringDecoder.lIIllIlllIllIl[1];
    }
    
    private static boolean llIllIlIIIlIIIl(final Object lllllllllllllIIlIlIIlIlIIlIlIIII) {
        return lllllllllllllIIlIlIIlIlIIlIlIIII != null;
    }
    
    private static boolean llIllIlIIIlIlll(final int lllllllllllllIIlIlIIlIlIIlIIIIll, final int lllllllllllllIIlIlIIlIlIIlIIIIlI) {
        return lllllllllllllIIlIlIIlIlIIlIIIIll != lllllllllllllIIlIlIIlIlIIlIIIIlI;
    }
    
    public String path() {
        if (llIllIlIIIIllll(this.path)) {
            if (llIllIlIIIlIIlI(this.hasPath ? 1 : 0)) {
                final String path = QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[11]];
                this.path = path;
                return path;
            }
            final int lllllllllllllIIlIlIIlIlIlllIIlII = this.uri.indexOf(QueryStringDecoder.lIIllIlllIllIl[10]);
            if (!llIllIlIIIlIIll(lllllllllllllIIlIlIIlIlIlllIIlII)) {
                final String substring = this.uri.substring(QueryStringDecoder.lIIllIlllIllIl[2], lllllllllllllIIlIlIIlIlIlllIIlII);
                this.path = substring;
                return substring;
            }
            this.path = this.uri;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return this.path;
    }
    
    private static boolean llIllIlIIIlIlII(final int lllllllllllllIIlIlIIlIlIIlIIllII) {
        return lllllllllllllIIlIlIIlIlIIlIIllII != 0;
    }
    
    private static String llIllIlIIIIIlIl(final String lllllllllllllIIlIlIIlIlIIllIIlll, final String lllllllllllllIIlIlIIlIlIIllIIlII) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIIlIlIIllIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIlIlIIllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIlIIlIlIIllIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIlIIlIlIIllIlIIl.init(QueryStringDecoder.lIIllIlllIllIl[3], lllllllllllllIIlIlIIlIlIIllIlIlI);
            return new String(lllllllllllllIIlIlIIlIlIIllIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIlIlIIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIIlIlIIllIlIII) {
            lllllllllllllIIlIlIIlIlIIllIlIII.printStackTrace();
            return null;
        }
    }
    
    public QueryStringDecoder(final String lllllllllllllIIlIlIIlIllIIllIlII) {
        this(lllllllllllllIIlIlIIlIllIIllIlII, HttpConstants.DEFAULT_CHARSET);
    }
    
    private static boolean llIllIlIIIllIII(final int lllllllllllllIIlIlIIlIlIIlIllIll, final int lllllllllllllIIlIlIIlIlIIlIllIlI) {
        return lllllllllllllIIlIlIIlIlIIlIllIll >= lllllllllllllIIlIlIIlIlIIlIllIlI;
    }
    
    private static boolean llIllIlIIIlIIII(final int lllllllllllllIIlIlIIlIlIIlIIIllI) {
        return lllllllllllllIIlIlIIlIlIIlIIIllI <= 0;
    }
    
    private static boolean llIllIlIIIlIIlI(final int lllllllllllllIIlIlIIlIlIIlIIlIlI) {
        return lllllllllllllIIlIlIIlIlIIlIIlIlI == 0;
    }
    
    private static boolean llIllIlIIIllIIl(final int lllllllllllllIIlIlIIlIlIIlIlIIll, final int lllllllllllllIIlIlIIlIlIIlIlIIlI) {
        return lllllllllllllIIlIlIIlIlIIlIlIIll <= lllllllllllllIIlIlIIlIlIIlIlIIlI;
    }
    
    public QueryStringDecoder(final String lllllllllllllIIlIlIIlIllIIIllIlI, final Charset lllllllllllllIIlIlIIlIllIIIlIlIl, final boolean lllllllllllllIIlIlIIlIllIIIlIlII) {
        this(lllllllllllllIIlIlIIlIllIIIllIlI, lllllllllllllIIlIlIIlIllIIIlIlIl, lllllllllllllIIlIlIIlIllIIIlIlII, QueryStringDecoder.lIIllIlllIllIl[1]);
    }
    
    private void decodeParams(final String lllllllllllllIIlIlIIlIlIllIIlIll) {
        final LinkedHashMap<String, List<String>> params = new LinkedHashMap<String, List<String>>();
        this.params = params;
        final Map<String, List<String>> lllllllllllllIIlIlIIlIlIllIlIIII = params;
        this.nParams = QueryStringDecoder.lIIllIlllIllIl[2];
        String lllllllllllllIIlIlIIlIlIllIIllll = null;
        int lllllllllllllIIlIlIIlIlIllIIlllI = QueryStringDecoder.lIIllIlllIllIl[2];
        int lllllllllllllIIlIlIIlIlIllIIllIl = QueryStringDecoder.lIIllIlllIllIl[2];
        while (llIllIlIIIlIllI(lllllllllllllIIlIlIIlIlIllIIllIl, lllllllllllllIIlIlIIlIlIllIIlIll.length())) {
            final char lllllllllllllIIlIlIIlIlIllIlIIll = lllllllllllllIIlIlIIlIlIllIIlIll.charAt(lllllllllllllIIlIlIIlIlIllIIllIl);
            if (llIllIlIIIlIlIl(lllllllllllllIIlIlIIlIlIllIlIIll, QueryStringDecoder.lIIllIlllIllIl[12]) && llIllIlIIIIllll(lllllllllllllIIlIlIIlIlIllIIllll)) {
                if (llIllIlIIIlIlll(lllllllllllllIIlIlIIlIlIllIIlllI, lllllllllllllIIlIlIIlIlIllIIllIl)) {
                    lllllllllllllIIlIlIIlIlIllIIllll = decodeComponent(lllllllllllllIIlIlIIlIlIllIIlIll.substring(lllllllllllllIIlIlIIlIlIllIIlllI, lllllllllllllIIlIlIIlIlIllIIllIl), this.charset);
                }
                lllllllllllllIIlIlIIlIlIllIIlllI = lllllllllllllIIlIlIIlIlIllIIllIl + QueryStringDecoder.lIIllIlllIllIl[0];
                "".length();
                if (((119 + 72 - 160 + 97 ^ 62 + 6 + 94 + 3) & (0xED ^ 0xAB ^ (0x76 ^ 0x15) ^ -" ".length())) > 0) {
                    return;
                }
            }
            else if (!llIllIlIIIlIlll(lllllllllllllIIlIlIIlIlIllIlIIll, QueryStringDecoder.lIIllIlllIllIl[13]) || llIllIlIIIlIlIl(lllllllllllllIIlIlIIlIlIllIlIIll, QueryStringDecoder.lIIllIlllIllIl[14])) {
                if (llIllIlIIIIllll(lllllllllllllIIlIlIIlIlIllIIllll) && llIllIlIIIlIlll(lllllllllllllIIlIlIIlIlIllIIlllI, lllllllllllllIIlIlIIlIlIllIIllIl)) {
                    if (llIllIlIIIlIIlI(this.addParam(lllllllllllllIIlIlIIlIlIllIlIIII, decodeComponent(lllllllllllllIIlIlIIlIlIllIIlIll.substring(lllllllllllllIIlIlIIlIlIllIIlllI, lllllllllllllIIlIlIIlIlIllIIllIl), this.charset), QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[15]]) ? 1 : 0)) {
                        return;
                    }
                }
                else if (llIllIlIIIlIIIl(lllllllllllllIIlIlIIlIlIllIIllll)) {
                    if (llIllIlIIIlIIlI(this.addParam(lllllllllllllIIlIlIIlIlIllIlIIII, lllllllllllllIIlIlIIlIlIllIIllll, decodeComponent(lllllllllllllIIlIlIIlIlIllIIlIll.substring(lllllllllllllIIlIlIIlIlIllIIlllI, lllllllllllllIIlIlIIlIlIllIIllIl), this.charset)) ? 1 : 0)) {
                        return;
                    }
                    lllllllllllllIIlIlIIlIlIllIIllll = null;
                }
                lllllllllllllIIlIlIIlIlIllIIlllI = lllllllllllllIIlIlIIlIlIllIIllIl + QueryStringDecoder.lIIllIlllIllIl[0];
            }
            ++lllllllllllllIIlIlIIlIlIllIIllIl;
            "".length();
            if ("   ".length() == ("   ".length() & ("   ".length() ^ -" ".length()))) {
                return;
            }
        }
        if (llIllIlIIIlIlll(lllllllllllllIIlIlIIlIlIllIIlllI, lllllllllllllIIlIlIIlIlIllIIllIl)) {
            if (llIllIlIIIIllll(lllllllllllllIIlIlIIlIlIllIIllll)) {
                this.addParam(lllllllllllllIIlIlIIlIlIllIlIIII, decodeComponent(lllllllllllllIIlIlIIlIlIllIIlIll.substring(lllllllllllllIIlIlIIlIlIllIIlllI, lllllllllllllIIlIlIIlIlIllIIllIl), this.charset), QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[16]]);
                "".length();
                "".length();
                if (-(0x50 ^ 0x55) >= 0) {
                    return;
                }
            }
            else {
                this.addParam(lllllllllllllIIlIlIIlIlIllIlIIII, lllllllllllllIIlIlIIlIlIllIIllll, decodeComponent(lllllllllllllIIlIlIIlIlIllIIlIll.substring(lllllllllllllIIlIlIIlIlIllIIlllI, lllllllllllllIIlIlIIlIlIllIIllIl), this.charset));
                "".length();
                "".length();
                if (-"  ".length() > 0) {
                    return;
                }
            }
        }
        else if (llIllIlIIIlIIIl(lllllllllllllIIlIlIIlIlIllIIllll)) {
            this.addParam(lllllllllllllIIlIlIIlIlIllIlIIII, lllllllllllllIIlIlIIlIlIllIIllll, QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[17]]);
            "".length();
        }
    }
    
    private static void llIllIlIIIIlllI() {
        (lIIllIlllIllIl = new int[35])[0] = " ".length();
        QueryStringDecoder.lIIllIlllIllIl[1] = (0xFFFF941A & 0x6FE5);
        QueryStringDecoder.lIIllIlllIllIl[2] = ((0x83 ^ 0x8A) & ~(0xA1 ^ 0xA8));
        QueryStringDecoder.lIIllIlllIllIl[3] = "  ".length();
        QueryStringDecoder.lIIllIlllIllIl[4] = "   ".length();
        QueryStringDecoder.lIIllIlllIllIl[5] = (0x0 ^ 0x4);
        QueryStringDecoder.lIIllIlllIllIl[6] = (122 + 81 - 143 + 120 ^ 68 + 118 - 176 + 167);
        QueryStringDecoder.lIIllIlllIllIl[7] = (0x7A ^ 0x3F ^ (0x19 ^ 0x5A));
        QueryStringDecoder.lIIllIlllIllIl[8] = ("  ".length() ^ (0x5C ^ 0x59));
        QueryStringDecoder.lIIllIlllIllIl[9] = (0xBE ^ 0xB6);
        QueryStringDecoder.lIIllIlllIllIl[10] = (131 + 10 - 33 + 36 ^ 0 + 106 + 34 + 35);
        QueryStringDecoder.lIIllIlllIllIl[11] = (0xDC ^ 0x9C ^ (0x8E ^ 0xC7));
        QueryStringDecoder.lIIllIlllIllIl[12] = (0x67 ^ 0x4E ^ (0x5 ^ 0x11));
        QueryStringDecoder.lIIllIlllIllIl[13] = (0x28 ^ 0xE);
        QueryStringDecoder.lIIllIlllIllIl[14] = (0x1B ^ 0x20);
        QueryStringDecoder.lIIllIlllIllIl[15] = (0x5E ^ 0x51 ^ (0x67 ^ 0x62));
        QueryStringDecoder.lIIllIlllIllIl[16] = (130 + 3 - 12 + 24 ^ 144 + 94 - 165 + 81);
        QueryStringDecoder.lIIllIlllIllIl[17] = (0xAE ^ 0x93 ^ (0x31 ^ 0x0));
        QueryStringDecoder.lIIllIlllIllIl[18] = (19 + 103 - 16 + 64 ^ 141 + 54 - 163 + 135);
        QueryStringDecoder.lIIllIlllIllIl[19] = (0x1 ^ 0x6B ^ (0x11 ^ 0x5E));
        QueryStringDecoder.lIIllIlllIllIl[20] = (0xF ^ 0x24);
        QueryStringDecoder.lIIllIlllIllIl[21] = (0xC2 ^ 0x82 ^ (0xEE ^ 0x8E));
        QueryStringDecoder.lIIllIlllIllIl[22] = (90 + 139 - 175 + 90 ^ 33 + 129 - 32 + 28);
        QueryStringDecoder.lIIllIlllIllIl[23] = (20 + 117 - 33 + 27 ^ 23 + 8 + 37 + 72);
        QueryStringDecoder.lIIllIlllIllIl[24] = (-1 & 0xFFFF);
        QueryStringDecoder.lIIllIlllIllIl[25] = (0x51 ^ 0x41);
        QueryStringDecoder.lIIllIlllIllIl[26] = (0x67 ^ 0x2E ^ (0xA ^ 0x52));
        QueryStringDecoder.lIIllIlllIllIl[27] = (0x6B ^ 0x5 ^ (0x74 ^ 0x8));
        QueryStringDecoder.lIIllIlllIllIl[28] = (0x52 ^ 0x2E ^ (0x47 ^ 0xB));
        QueryStringDecoder.lIIllIlllIllIl[29] = (68 + 39 - 30 + 83 ^ 117 + 69 - 82 + 49);
        QueryStringDecoder.lIIllIlllIllIl[30] = (0xC2 ^ 0xA3);
        QueryStringDecoder.lIIllIlllIllIl[31] = (0xEB ^ 0x8B ^ (0xA3 ^ 0xA5));
        QueryStringDecoder.lIIllIlllIllIl[32] = (0xF6 ^ 0xB7);
        QueryStringDecoder.lIIllIlllIllIl[33] = (50 + 132 - 92 + 43 ^ 84 + 166 - 177 + 122);
        QueryStringDecoder.lIIllIlllIllIl[34] = (0x63 ^ 0x70);
    }
    
    private static String llIllIlIIIIlIIl(final String lllllllllllllIIlIlIIlIlIIlllIIlI, final String lllllllllllllIIlIlIIlIlIIlllIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIIlIlIIlllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIlIlIIlllIIIl.getBytes(StandardCharsets.UTF_8)), QueryStringDecoder.lIIllIlllIllIl[9]), "DES");
            final Cipher lllllllllllllIIlIlIIlIlIIlllIllI = Cipher.getInstance("DES");
            lllllllllllllIIlIlIIlIlIIlllIllI.init(QueryStringDecoder.lIIllIlllIllIl[3], lllllllllllllIIlIlIIlIlIIlllIlll);
            return new String(lllllllllllllIIlIlIIlIlIIlllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIlIlIIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIIlIlIIlllIlIl) {
            lllllllllllllIIlIlIIlIlIIlllIlIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIllIlIIIIllll(final Object lllllllllllllIIlIlIIlIlIIlIIlllI) {
        return lllllllllllllIIlIlIIlIlIIlIIlllI == null;
    }
    
    public QueryStringDecoder(final URI lllllllllllllIIlIlIIlIlIllllllll) {
        this(lllllllllllllIIlIlIIlIlIllllllll, HttpConstants.DEFAULT_CHARSET);
    }
    
    private static char decodeHexNibble(final char lllllllllllllIIlIlIIlIlIlIIlIlII) {
        if (llIllIlIIIllIIl(QueryStringDecoder.lIIllIlllIllIl[28], lllllllllllllIIlIlIIlIlIlIIlIlII) && llIllIlIIIllIIl(lllllllllllllIIlIlIIlIlIlIIlIlII, QueryStringDecoder.lIIllIlllIllIl[29])) {
            return (char)(lllllllllllllIIlIlIIlIlIlIIlIlII - QueryStringDecoder.lIIllIlllIllIl[28]);
        }
        if (llIllIlIIIllIIl(QueryStringDecoder.lIIllIlllIllIl[30], lllllllllllllIIlIlIIlIlIlIIlIlII) && llIllIlIIIllIIl(lllllllllllllIIlIlIIlIlIlIIlIlII, QueryStringDecoder.lIIllIlllIllIl[31])) {
            return (char)(lllllllllllllIIlIlIIlIlIlIIlIlII - QueryStringDecoder.lIIllIlllIllIl[30] + QueryStringDecoder.lIIllIlllIllIl[15]);
        }
        if (llIllIlIIIllIIl(QueryStringDecoder.lIIllIlllIllIl[32], lllllllllllllIIlIlIIlIlIlIIlIlII) && llIllIlIIIllIIl(lllllllllllllIIlIlIIlIlIlIIlIlII, QueryStringDecoder.lIIllIlllIllIl[33])) {
            return (char)(lllllllllllllIIlIlIIlIlIlIIlIlII - QueryStringDecoder.lIIllIlllIllIl[32] + QueryStringDecoder.lIIllIlllIllIl[15]);
        }
        return (char)QueryStringDecoder.lIIllIlllIllIl[24];
    }
    
    public QueryStringDecoder(final URI lllllllllllllIIlIlIIlIlIlllIlIlI, final Charset lllllllllllllIIlIlIIlIlIlllIlIIl, final int lllllllllllllIIlIlIIlIlIlllIllIl) {
        if (llIllIlIIIIllll(lllllllllllllIIlIlIIlIlIlllIlIlI)) {
            throw new NullPointerException(QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[5]]);
        }
        if (llIllIlIIIIllll(lllllllllllllIIlIlIIlIlIlllIlIIl)) {
            throw new NullPointerException(QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[6]]);
        }
        if (llIllIlIIIlIIII(lllllllllllllIIlIlIIlIlIlllIllIl)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[7]]).append(lllllllllllllIIlIlIIlIlIlllIllIl).append(QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[8]])));
        }
        String lllllllllllllIIlIlIIlIlIlllIllII = lllllllllllllIIlIlIIlIlIlllIlIlI.getRawPath();
        if (llIllIlIIIlIIIl(lllllllllllllIIlIlIIlIlIlllIllII)) {
            this.hasPath = (QueryStringDecoder.lIIllIlllIllIl[0] != 0);
            "".length();
            if (-" ".length() > 0) {
                throw null;
            }
        }
        else {
            lllllllllllllIIlIlIIlIlIlllIllII = QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[9]];
            this.hasPath = (QueryStringDecoder.lIIllIlllIllIl[2] != 0);
        }
        this.uri = String.valueOf(new StringBuilder().append(lllllllllllllIIlIlIIlIlIlllIllII).append((char)QueryStringDecoder.lIIllIlllIllIl[10]).append(lllllllllllllIIlIlIIlIlIlllIlIlI.getRawQuery()));
        this.charset = lllllllllllllIIlIlIIlIlIlllIlIIl;
        this.maxParams = lllllllllllllIIlIlIIlIlIlllIllIl;
    }
    
    private static String llIllIlIIIIIlII(String lllllllllllllIIlIlIIlIlIlIIIIlII, final String lllllllllllllIIlIlIIlIlIlIIIlIII) {
        lllllllllllllIIlIlIIlIlIlIIIIlII = new String(Base64.getDecoder().decode(lllllllllllllIIlIlIIlIlIlIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIlIIlIlIlIIIIlll = new StringBuilder();
        final char[] lllllllllllllIIlIlIIlIlIlIIIIllI = lllllllllllllIIlIlIIlIlIlIIIlIII.toCharArray();
        int lllllllllllllIIlIlIIlIlIlIIIIlIl = QueryStringDecoder.lIIllIlllIllIl[2];
        final long lllllllllllllIIlIlIIlIlIIlllllll = (Object)lllllllllllllIIlIlIIlIlIlIIIIlII.toCharArray();
        final String lllllllllllllIIlIlIIlIlIIllllllI = (String)lllllllllllllIIlIlIIlIlIIlllllll.length;
        short lllllllllllllIIlIlIIlIlIIlllllIl = (short)QueryStringDecoder.lIIllIlllIllIl[2];
        while (llIllIlIIIlIllI(lllllllllllllIIlIlIIlIlIIlllllIl, (int)lllllllllllllIIlIlIIlIlIIllllllI)) {
            final char lllllllllllllIIlIlIIlIlIlIIIlIlI = lllllllllllllIIlIlIIlIlIIlllllll[lllllllllllllIIlIlIIlIlIIlllllIl];
            lllllllllllllIIlIlIIlIlIlIIIIlll.append((char)(lllllllllllllIIlIlIIlIlIlIIIlIlI ^ lllllllllllllIIlIlIIlIlIlIIIIllI[lllllllllllllIIlIlIIlIlIlIIIIlIl % lllllllllllllIIlIlIIlIlIlIIIIllI.length]));
            "".length();
            ++lllllllllllllIIlIlIIlIlIlIIIIlIl;
            ++lllllllllllllIIlIlIIlIlIIlllllIl;
            "".length();
            if (" ".length() >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIlIIlIlIlIIIIlll);
    }
    
    public QueryStringDecoder(final String lllllllllllllIIlIlIIlIllIIlIlIlI, final boolean lllllllllllllIIlIlIIlIllIIlIllII) {
        this(lllllllllllllIIlIlIIlIllIIlIlIlI, HttpConstants.DEFAULT_CHARSET, lllllllllllllIIlIlIIlIllIIlIllII);
    }
    
    private boolean addParam(final Map<String, List<String>> lllllllllllllIIlIlIIlIlIlIlllIlI, final String lllllllllllllIIlIlIIlIlIlIlllIIl, final String lllllllllllllIIlIlIIlIlIlIllllIl) {
        if (llIllIlIIIllIII(this.nParams, this.maxParams)) {
            return QueryStringDecoder.lIIllIlllIllIl[2] != 0;
        }
        List<String> lllllllllllllIIlIlIIlIlIlIllllII = lllllllllllllIIlIlIIlIlIlIlllIlI.get(lllllllllllllIIlIlIIlIlIlIlllIIl);
        if (llIllIlIIIIllll(lllllllllllllIIlIlIIlIlIlIllllII)) {
            lllllllllllllIIlIlIIlIlIlIllllII = new ArrayList<String>(QueryStringDecoder.lIIllIlllIllIl[0]);
            lllllllllllllIIlIlIIlIlIlIlllIlI.put(lllllllllllllIIlIlIIlIlIlIlllIIl, lllllllllllllIIlIlIIlIlIlIllllII);
            "".length();
        }
        lllllllllllllIIlIlIIlIlIlIllllII.add(lllllllllllllIIlIlIIlIlIlIllllIl);
        "".length();
        this.nParams += QueryStringDecoder.lIIllIlllIllIl[0];
        return QueryStringDecoder.lIIllIlllIllIl[0] != 0;
    }
    
    public Map<String, List<String>> parameters() {
        if (llIllIlIIIIllll(this.params)) {
            if (llIllIlIIIlIlII(this.hasPath ? 1 : 0)) {
                final int lllllllllllllIIlIlIIlIlIllIllllI = this.path().length();
                if (llIllIlIIIlIlIl(this.uri.length(), lllllllllllllIIlIlIIlIlIllIllllI)) {
                    return Collections.emptyMap();
                }
                this.decodeParams(this.uri.substring(lllllllllllllIIlIlIIlIlIllIllllI + QueryStringDecoder.lIIllIlllIllIl[0]));
                "".length();
                if (-" ".length() > 0) {
                    return null;
                }
            }
            else {
                if (llIllIlIIIlIlII(this.uri.isEmpty() ? 1 : 0)) {
                    return Collections.emptyMap();
                }
                this.decodeParams(this.uri);
            }
        }
        return this.params;
    }
    
    private static void llIllIlIIIIlIll() {
        (lIIllIlllIlIlI = new String[QueryStringDecoder.lIIllIlllIllIl[34]])[QueryStringDecoder.lIIllIlllIllIl[2]] = llIllIlIIIIIlII("FAc+LT0a", "sbJxO");
        QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[0]] = llIllIlIIIIIlII("NRozADwzBg==", "VrRrO");
        QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[3]] = llIllIlIIIIIlII("DDAACiUTMBUpfkE=", "aQxZD");
        QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[4]] = llIllIlIIIIIlIl("Z53eilpNDTFpI40yCvnyRWzR2cs+Lf5yT5tuCQ8K0Gs=", "kkgQU");
        QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[5]] = llIllIlIIIIIlIl("QX6V5RpLBZI=", "sXiiO");
        QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[6]] = llIllIlIIIIIlIl("r+Lc/tuchXk=", "zlDub");
        QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[7]] = llIllIlIIIIIlII("IA08Mxg/DSkQQ20=", "MlDcy");
        QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[8]] = llIllIlIIIIlIIl("hjqaItKiu3PL+BBuEgTNdINeJ2Y+0qPi94z+J9JYJhE=", "LHaRH");
        QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[9]] = llIllIlIIIIlIIl("g73N5xezEoY=", "zdDig");
        QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[11]] = llIllIlIIIIlIIl("OW+d/QZ4UoY=", "tyGBk");
        QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[15]] = llIllIlIIIIIlII("", "UQtEL");
        QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[16]] = llIllIlIIIIIlII("", "QpGXc");
        QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[17]] = llIllIlIIIIIlII("", "UFlux");
        QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[18]] = llIllIlIIIIlIIl("l9Z9K32y+7o=", "dEFnl");
        QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[22]] = llIllIlIIIIIlIl("IIKiJ9pSrfXHNS0BbVto7yNjKBI6EGfkv0kTbLSlw1Gy2g59CrbAjohRR5U1eTlD", "NLLzO");
        QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[23]] = llIllIlIIIIIlII("ASYWDBAQK0QdChImFB1ZAiIVDRwfJAFYGAVnARYdUSgCWAoFNQ0WHktn", "qGdxy");
        QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[25]] = llIllIlIIIIIlII("PhYzGB0+HGUcAjQZNRxRJB00DBQ5GyBZEXI=", "WxEyq");
        QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[26]] = llIllIlIIIIlIIl("NbCtzGatGG3Hb8eB2pW1Ig==", "YyzmR");
        QueryStringDecoder.lIIllIlllIlIlI[QueryStringDecoder.lIIllIlllIllIl[27]] = llIllIlIIIIlIIl("FHROPTM5yRA=", "HFReA");
    }
    
    private static boolean llIllIlIIIlIllI(final int lllllllllllllIIlIlIIlIlIIlIlIlll, final int lllllllllllllIIlIlIIlIlIIlIlIllI) {
        return lllllllllllllIIlIlIIlIlIIlIlIlll < lllllllllllllIIlIlIIlIlIIlIlIllI;
    }
    
    public QueryStringDecoder(final String lllllllllllllIIlIlIIlIllIIlIIlII, final Charset lllllllllllllIIlIlIIlIllIIlIIIII) {
        this(lllllllllllllIIlIlIIlIllIIlIIlII, lllllllllllllIIlIlIIlIllIIlIIIII, (boolean)(QueryStringDecoder.lIIllIlllIllIl[0] != 0));
    }
}
