// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpVersion;
import java.util.Arrays;
import java.util.Set;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.handler.codec.http.HttpResponseStatus;
import java.util.Map;

public abstract class SpdyHeaders implements Iterable<Map.Entry<String, String>>
{
    private static final /* synthetic */ String[] lIllIIlIIllllI;
    private static final /* synthetic */ int[] lIllIIlIllllIl;
    
    public static void setStatus(final int lllllllllllllIIIIIIllIllllIllIlI, final SpdyHeadersFrame lllllllllllllIIIIIIllIllllIlIlll, final HttpResponseStatus lllllllllllllIIIIIIllIllllIlIllI) {
        lllllllllllllIIIIIIllIllllIlIlll.headers().set(SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[13]], lllllllllllllIIIIIIllIllllIlIllI.toString());
        "".length();
    }
    
    public static void removeVersion(final int lllllllllllllIIIIIIllIllllIIIlIl, final SpdyHeadersFrame lllllllllllllIIIIIIllIllllIIIIll) {
        lllllllllllllIIIIIIllIllllIIIIll.headers().remove(SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[17]]);
        "".length();
    }
    
    public static HttpResponseStatus getStatus(final int lllllllllllllIIIIIIllIlllllIIlII, final SpdyHeadersFrame lllllllllllllIIIIIIllIlllllIIIlI) {
        try {
            final String lllllllllllllIIIIIIllIlllllIIlll = lllllllllllllIIIIIIllIlllllIIIlI.headers().get(SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[10]]);
            final int lllllllllllllIIIIIIllIlllllIIllI = lllllllllllllIIIIIIllIlllllIIlll.indexOf(SpdyHeaders.lIllIIlIllllIl[11]);
            if (lllllIlIIllIIIl(lllllllllllllIIIIIIllIlllllIIllI, SpdyHeaders.lIllIIlIllllIl[12])) {
                return HttpResponseStatus.valueOf(Integer.parseInt(lllllllllllllIIIIIIllIlllllIIlll));
            }
            final int lllllllllllllIIIIIIllIlllllIlIlI = Integer.parseInt(lllllllllllllIIIIIIllIlllllIIlll.substring(SpdyHeaders.lIllIIlIllllIl[0], lllllllllllllIIIIIIllIlllllIIllI));
            final String lllllllllllllIIIIIIllIlllllIlIIl = lllllllllllllIIIIIIllIlllllIIlll.substring(lllllllllllllIIIIIIllIlllllIIllI + SpdyHeaders.lIllIIlIllllIl[1]);
            final HttpResponseStatus lllllllllllllIIIIIIllIlllllIlIII = HttpResponseStatus.valueOf(lllllllllllllIIIIIIllIlllllIlIlI);
            if (lllllIlIIllIIlI(lllllllllllllIIIIIIllIlllllIlIII.reasonPhrase().equals(lllllllllllllIIIIIIllIlllllIlIIl) ? 1 : 0)) {
                return lllllllllllllIIIIIIllIlllllIlIII;
            }
            return new HttpResponseStatus(lllllllllllllIIIIIIllIlllllIlIlI, lllllllllllllIIIIIIllIlllllIlIIl);
        }
        catch (Exception lllllllllllllIIIIIIllIlllllIIlIl) {
            return null;
        }
    }
    
    public static void setHeader(final SpdyHeadersFrame lllllllllllllIIIIIIlllIIIIlIllIl, final String lllllllllllllIIIIIIlllIIIIlIllll, final Iterable<?> lllllllllllllIIIIIIlllIIIIlIlIll) {
        lllllllllllllIIIIIIlllIIIIlIllIl.headers().set(lllllllllllllIIIIIIlllIIIIlIllll, lllllllllllllIIIIIIlllIIIIlIlIll);
        "".length();
    }
    
    public static void setHeader(final SpdyHeadersFrame lllllllllllllIIIIIIlllIIIIlllIIl, final String lllllllllllllIIIIIIlllIIIIllIlIl, final Object lllllllllllllIIIIIIlllIIIIllIlll) {
        lllllllllllllIIIIIIlllIIIIlllIIl.headers().set(lllllllllllllIIIIIIlllIIIIllIlIl, lllllllllllllIIIIIIlllIIIIllIlll);
        "".length();
    }
    
    public abstract boolean contains(final String p0);
    
    public static void removeScheme(final int lllllllllllllIIIIIIlllIIIIIIIIlI, final SpdyHeadersFrame lllllllllllllIIIIIIlllIIIIIIIIIl) {
        lllllllllllllIIIIIIlllIIIIIIIIIl.headers().remove(SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[6]]);
        "".length();
    }
    
    private static String lllllIIllIIllIl(final String lllllllllllllIIIIIIllIlllIIIIIll, final String lllllllllllllIIIIIIllIlllIIIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIllIlllIIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIllIlllIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIIllIlllIIIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIIllIlllIIIIlll.init(SpdyHeaders.lIllIIlIllllIl[2], lllllllllllllIIIIIIllIlllIIIlIII);
            return new String(lllllllllllllIIIIIIllIlllIIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIllIlllIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIllIlllIIIIllI) {
            lllllllllllllIIIIIIllIlllIIIIllI.printStackTrace();
            return null;
        }
    }
    
    public static void removeUrl(final int lllllllllllllIIIIIIllIllllIlIlII, final SpdyHeadersFrame lllllllllllllIIIIIIllIllllIlIIll) {
        lllllllllllllIIIIIIllIllllIlIIll.headers().remove(SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[14]]);
        "".length();
    }
    
    public static void removeHost(final SpdyHeadersFrame lllllllllllllIIIIIIlllIIIIlIIIII) {
        lllllllllllllIIIIIIlllIIIIlIIIII.headers().remove(SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[0]]);
        "".length();
    }
    
    public abstract String get(final String p0);
    
    public abstract SpdyHeaders set(final String p0, final Object p1);
    
    public static String getScheme(final int lllllllllllllIIIIIIllIlllllllllI, final SpdyHeadersFrame lllllllllllllIIIIIIllIllllllllII) {
        return lllllllllllllIIIIIIllIllllllllII.headers().get(SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[7]]);
    }
    
    public abstract boolean isEmpty();
    
    public abstract SpdyHeaders set(final String p0, final Iterable<?> p1);
    
    @Override
    public Iterator<Map.Entry<String, String>> iterator() {
        return this.entries().iterator();
    }
    
    public static void removeMethod(final int lllllllllllllIIIIIIlllIIIIIlIlII, final SpdyHeadersFrame lllllllllllllIIIIIIlllIIIIIlIIll) {
        lllllllllllllIIIIIIlllIIIIIlIIll.headers().remove(SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[3]]);
        "".length();
    }
    
    static {
        lllllIlIIlIllll();
        lllllIIllIlIIII();
        EMPTY_HEADERS = new SpdyHeaders() {
            private static final /* synthetic */ String[] lIIIlllIIllIll;
            private static final /* synthetic */ int[] lIIIlllIIlllII;
            
            @Override
            public boolean isEmpty() {
                return SpdyHeaders$1.lIIIlllIIlllII[1] != 0;
            }
            
            @Override
            public String get(final String lllllllllllllIIlllllIIllIIIllIlI) {
                return null;
            }
            
            @Override
            public SpdyHeaders set(final String lllllllllllllIIlllllIIllIIlIIIll, final Iterable<?> lllllllllllllIIlllllIIllIIlIIIlI) {
                throw new UnsupportedOperationException(SpdyHeaders$1.lIIIlllIIllIll[SpdyHeaders$1.lIIIlllIIlllII[3]]);
            }
            
            private static void llIIIllIIlIllII() {
                (lIIIlllIIlllII = new int[8])[0] = ((0xA0 ^ 0xBA ^ (0x7A ^ 0x0)) & (0x81 ^ 0xA1 ^ (0x39 ^ 0x79) ^ -" ".length()));
                SpdyHeaders$1.lIIIlllIIlllII[1] = " ".length();
                SpdyHeaders$1.lIIIlllIIlllII[2] = "  ".length();
                SpdyHeaders$1.lIIIlllIIlllII[3] = "   ".length();
                SpdyHeaders$1.lIIIlllIIlllII[4] = (108 + 68 - 121 + 98 ^ 130 + 156 - 221 + 92);
                SpdyHeaders$1.lIIIlllIIlllII[5] = (0x39 ^ 0x3C);
                SpdyHeaders$1.lIIIlllIIlllII[6] = (0x8E ^ 0x89 ^ " ".length());
                SpdyHeaders$1.lIIIlllIIlllII[7] = (0x2B ^ 0x23);
            }
            
            @Override
            public List<String> getAll(final String lllllllllllllIIlllllIIllIIllIIll) {
                return Collections.emptyList();
            }
            
            @Override
            public Iterator<Map.Entry<String, String>> iterator() {
                return this.entries().iterator();
            }
            
            @Override
            public Set<String> names() {
                return Collections.emptySet();
            }
            
            private static String llIIIllIIlIlIII(String lllllllllllllIIlllllIIllIIIIlIlI, final String lllllllllllllIIlllllIIllIIIIlIIl) {
                lllllllllllllIIlllllIIllIIIIlIlI = new String(Base64.getDecoder().decode(lllllllllllllIIlllllIIllIIIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder lllllllllllllIIlllllIIllIIIIllIl = new StringBuilder();
                final char[] lllllllllllllIIlllllIIllIIIIllII = lllllllllllllIIlllllIIllIIIIlIIl.toCharArray();
                int lllllllllllllIIlllllIIllIIIIlIll = SpdyHeaders$1.lIIIlllIIlllII[0];
                final float lllllllllllllIIlllllIIllIIIIIlIl = (Object)lllllllllllllIIlllllIIllIIIIlIlI.toCharArray();
                final int lllllllllllllIIlllllIIllIIIIIlII = lllllllllllllIIlllllIIllIIIIIlIl.length;
                String lllllllllllllIIlllllIIllIIIIIIll = (String)SpdyHeaders$1.lIIIlllIIlllII[0];
                while (llIIIllIIlIllIl((int)lllllllllllllIIlllllIIllIIIIIIll, lllllllllllllIIlllllIIllIIIIIlII)) {
                    final char lllllllllllllIIlllllIIllIIIlIIII = lllllllllllllIIlllllIIllIIIIIlIl[lllllllllllllIIlllllIIllIIIIIIll];
                    lllllllllllllIIlllllIIllIIIIllIl.append((char)(lllllllllllllIIlllllIIllIIIlIIII ^ lllllllllllllIIlllllIIllIIIIllII[lllllllllllllIIlllllIIllIIIIlIll % lllllllllllllIIlllllIIllIIIIllII.length]));
                    "".length();
                    ++lllllllllllllIIlllllIIllIIIIlIll;
                    ++lllllllllllllIIlllllIIllIIIIIIll;
                    "".length();
                    if (((0xC4 ^ 0xC0) & ~(0x26 ^ 0x22)) != 0x0) {
                        return null;
                    }
                }
                return String.valueOf(lllllllllllllIIlllllIIllIIIIllIl);
            }
            
            @Override
            public SpdyHeaders add(final String lllllllllllllIIlllllIIllIIlIlIIl, final Iterable<?> lllllllllllllIIlllllIIllIIlIlIII) {
                throw new UnsupportedOperationException(SpdyHeaders$1.lIIIlllIIllIll[SpdyHeaders$1.lIIIlllIIlllII[1]]);
            }
            
            private static String llIIIllIIlIlIIl(final String lllllllllllllIIlllllIIlIlllIllIl, final String lllllllllllllIIlllllIIlIlllIllII) {
                try {
                    final SecretKeySpec lllllllllllllIIlllllIIlIllllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllllIIlIlllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher lllllllllllllIIlllllIIlIlllIllll = Cipher.getInstance("Blowfish");
                    lllllllllllllIIlllllIIlIlllIllll.init(SpdyHeaders$1.lIIIlllIIlllII[2], lllllllllllllIIlllllIIlIllllIIII);
                    return new String(lllllllllllllIIlllllIIlIlllIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllllIIlIlllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIlllllIIlIlllIlllI) {
                    lllllllllllllIIlllllIIlIlllIlllI.printStackTrace();
                    return null;
                }
            }
            
            @Override
            public SpdyHeaders remove(final String lllllllllllllIIlllllIIllIIlIIIII) {
                throw new UnsupportedOperationException(SpdyHeaders$1.lIIIlllIIllIll[SpdyHeaders$1.lIIIlllIIlllII[4]]);
            }
            
            static {
                llIIIllIIlIllII();
                llIIIllIIlIlIll();
            }
            
            @Override
            public SpdyHeaders add(final String lllllllllllllIIlllllIIllIIlIllII, final Object lllllllllllllIIlllllIIllIIlIlIll) {
                throw new UnsupportedOperationException(SpdyHeaders$1.lIIIlllIIllIll[SpdyHeaders$1.lIIIlllIIlllII[0]]);
            }
            
            @Override
            public SpdyHeaders set(final String lllllllllllllIIlllllIIllIIlIIllI, final Object lllllllllllllIIlllllIIllIIlIIlIl) {
                throw new UnsupportedOperationException(SpdyHeaders$1.lIIIlllIIllIll[SpdyHeaders$1.lIIIlllIIlllII[2]]);
            }
            
            private static void llIIIllIIlIlIll() {
                (lIIIlllIIllIll = new String[SpdyHeaders$1.lIIIlllIIlllII[6]])[SpdyHeaders$1.lIIIlllIIlllII[0]] = llIIIllIIlIlIII("OyMUJ1QmKBk6", "IFuCt");
                SpdyHeaders$1.lIIIlllIIllIll[SpdyHeaders$1.lIIIlllIIlllII[1]] = llIIIllIIlIlIII("EwctIlIODCA/", "abLFr");
                SpdyHeaders$1.lIIIlllIIllIll[SpdyHeaders$1.lIIIlllIIlllII[2]] = llIIIllIIlIlIIl("aVWw424N9a2qm2SXcjg4zw==", "UYRIl");
                SpdyHeaders$1.lIIIlllIIllIll[SpdyHeaders$1.lIIIlllIIlllII[3]] = llIIIllIIlIlIII("FQYEBXMIDQkY", "gceaS");
                SpdyHeaders$1.lIIIlllIIllIll[SpdyHeaders$1.lIIIlllIIlllII[4]] = llIIIllIIlIlIII("MAooIGktASU9", "BoIDI");
                SpdyHeaders$1.lIIIlllIIllIll[SpdyHeaders$1.lIIIlllIIlllII[5]] = llIIIllIIlIlIlI("eecLPi2ZLt+Bw26WgHhtxw==", "fVSOd");
            }
            
            @Override
            public List<Map.Entry<String, String>> entries() {
                return Collections.emptyList();
            }
            
            @Override
            public boolean contains(final String lllllllllllllIIlllllIIllIIllIIII) {
                return SpdyHeaders$1.lIIIlllIIlllII[0] != 0;
            }
            
            @Override
            public SpdyHeaders clear() {
                throw new UnsupportedOperationException(SpdyHeaders$1.lIIIlllIIllIll[SpdyHeaders$1.lIIIlllIIlllII[5]]);
            }
            
            private static boolean llIIIllIIlIllIl(final int lllllllllllllIIlllllIIlIlllIIlIl, final int lllllllllllllIIlllllIIlIlllIIlII) {
                return lllllllllllllIIlllllIIlIlllIIlIl < lllllllllllllIIlllllIIlIlllIIlII;
            }
            
            private static String llIIIllIIlIlIlI(final String lllllllllllllIIlllllIIlIlllllIlI, final String lllllllllllllIIlllllIIlIllllIlll) {
                try {
                    final SecretKeySpec lllllllllllllIIlllllIIlIllllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllllIIlIllllIlll.getBytes(StandardCharsets.UTF_8)), SpdyHeaders$1.lIIIlllIIlllII[7]), "DES");
                    final Cipher lllllllllllllIIlllllIIlIllllllII = Cipher.getInstance("DES");
                    lllllllllllllIIlllllIIlIllllllII.init(SpdyHeaders$1.lIIIlllIIlllII[2], lllllllllllllIIlllllIIlIllllllIl);
                    return new String(lllllllllllllIIlllllIIlIllllllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllllIIlIlllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIlllllIIlIlllllIll) {
                    lllllllllllllIIlllllIIlIlllllIll.printStackTrace();
                    return null;
                }
            }
        };
    }
    
    public abstract Set<String> names();
    
    private static boolean lllllIlIIllIIlI(final int lllllllllllllIIIIIIllIllIlllIlII) {
        return lllllllllllllIIIIIIllIllIlllIlII != 0;
    }
    
    public static void setVersion(final int lllllllllllllIIIIIIllIlllIlllIIl, final SpdyHeadersFrame lllllllllllllIIIIIIllIlllIlllIII, final HttpVersion lllllllllllllIIIIIIllIlllIllIlIl) {
        lllllllllllllIIIIIIllIlllIlllIII.headers().set(SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[19]], lllllllllllllIIIIIIllIlllIllIlIl.text());
        "".length();
    }
    
    public abstract SpdyHeaders add(final String p0, final Object p1);
    
    public abstract SpdyHeaders remove(final String p0);
    
    public static void setScheme(final int lllllllllllllIIIIIIllIlllllllIIl, final SpdyHeadersFrame lllllllllllllIIIIIIllIllllllIllI, final String lllllllllllllIIIIIIllIllllllIlll) {
        lllllllllllllIIIIIIllIllllllIllI.headers().set(SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[8]], lllllllllllllIIIIIIllIllllllIlll);
        "".length();
    }
    
    private static boolean lllllIlIIllIIll(final int lllllllllllllIIIIIIllIllIllllIIl, final int lllllllllllllIIIIIIllIllIllllIII) {
        return lllllllllllllIIIIIIllIllIllllIIl < lllllllllllllIIIIIIllIllIllllIII;
    }
    
    public abstract List<Map.Entry<String, String>> entries();
    
    public static HttpMethod getMethod(final int lllllllllllllIIIIIIlllIIIIIIlllI, final SpdyHeadersFrame lllllllllllllIIIIIIlllIIIIIIllII) {
        try {
            return HttpMethod.valueOf(lllllllllllllIIIIIIlllIIIIIIllII.headers().get(SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[4]]));
        }
        catch (Exception lllllllllllllIIIIIIlllIIIIIIllll) {
            return null;
        }
    }
    
    public static String getHeader(final SpdyHeadersFrame lllllllllllllIIIIIIlllIIIlIIllII, final String lllllllllllllIIIIIIlllIIIlIIlIIl) {
        return lllllllllllllIIIIIIlllIIIlIIllII.headers().get(lllllllllllllIIIIIIlllIIIlIIlIIl);
    }
    
    public static String getHeader(final SpdyHeadersFrame lllllllllllllIIIIIIlllIIIlIIIIII, final String lllllllllllllIIIIIIlllIIIlIIIIll, final String lllllllllllllIIIIIIlllIIIIlllllI) {
        final String lllllllllllllIIIIIIlllIIIlIIIIIl = lllllllllllllIIIIIIlllIIIlIIIIII.headers().get(lllllllllllllIIIIIIlllIIIlIIIIll);
        if (lllllIlIIllIIII(lllllllllllllIIIIIIlllIIIlIIIIIl)) {
            return lllllllllllllIIIIIIlllIIIIlllllI;
        }
        return lllllllllllllIIIIIIlllIIIlIIIIIl;
    }
    
    private static String lllllIIllIIllII(String lllllllllllllIIIIIIllIlllIlIIlll, final String lllllllllllllIIIIIIllIlllIlIIllI) {
        lllllllllllllIIIIIIllIlllIlIIlll = new String(Base64.getDecoder().decode(lllllllllllllIIIIIIllIlllIlIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIIllIlllIlIIlIl = new StringBuilder();
        final char[] lllllllllllllIIIIIIllIlllIlIIlII = lllllllllllllIIIIIIllIlllIlIIllI.toCharArray();
        int lllllllllllllIIIIIIllIlllIlIIIll = SpdyHeaders.lIllIIlIllllIl[0];
        final short lllllllllllllIIIIIIllIlllIIlllIl = (Object)lllllllllllllIIIIIIllIlllIlIIlll.toCharArray();
        final short lllllllllllllIIIIIIllIlllIIlllII = (short)lllllllllllllIIIIIIllIlllIIlllIl.length;
        short lllllllllllllIIIIIIllIlllIIllIll = (short)SpdyHeaders.lIllIIlIllllIl[0];
        while (lllllIlIIllIIll(lllllllllllllIIIIIIllIlllIIllIll, lllllllllllllIIIIIIllIlllIIlllII)) {
            final char lllllllllllllIIIIIIllIlllIlIlIII = lllllllllllllIIIIIIllIlllIIlllIl[lllllllllllllIIIIIIllIlllIIllIll];
            lllllllllllllIIIIIIllIlllIlIIlIl.append((char)(lllllllllllllIIIIIIllIlllIlIlIII ^ lllllllllllllIIIIIIllIlllIlIIlII[lllllllllllllIIIIIIllIlllIlIIIll % lllllllllllllIIIIIIllIlllIlIIlII.length]));
            "".length();
            ++lllllllllllllIIIIIIllIlllIlIIIll;
            ++lllllllllllllIIIIIIllIlllIIllIll;
            "".length();
            if (((0x97 ^ 0x89) & ~(0x10 ^ 0xE)) < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIIllIlllIlIIlIl);
    }
    
    private static void lllllIIllIlIIII() {
        (lIllIIlIIllllI = new String[SpdyHeaders.lIllIIlIllllIl[20]])[SpdyHeaders.lIllIIlIllllIl[0]] = lllllIIllIIlIlI("qbjCSQt11Hc=", "CCIzy");
        SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[1]] = lllllIIllIIllII("fgwtKS0=", "DdBZY");
        SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[2]] = lllllIIllIIllII("VAMEJA4=", "nkkWz");
        SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[3]] = lllllIIllIIllIl("OqltupORovs=", "Trbyw");
        SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[4]] = lllllIIllIIlIlI("gk19hxRm78k=", "euhtZ");
        SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[5]] = lllllIIllIIllIl("cWygjowZnwI=", "BWlzv");
        SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[6]] = lllllIIllIIllIl("osyWCQDR3Hc=", "CRAGe");
        SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[7]] = lllllIIllIIllIl("7zmz5ItATEI=", "EkdrX");
        SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[8]] = lllllIIllIIllIl("1tIEMekxm9I=", "TaDDZ");
        SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[9]] = lllllIIllIIlIlI("gm1dWaRAG7k=", "veklG");
        SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[10]] = lllllIIllIIllIl("9X+ukSEH6J4=", "oUPBO");
        SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[13]] = lllllIIllIIllIl("g0Dp90ldT6w=", "mytUU");
        SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[14]] = lllllIIllIIllIl("cN3CY3mK9GE=", "Bqzox");
        SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[15]] = lllllIIllIIllII("bBUCBhI=", "Vecrz");
        SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[16]] = lllllIIllIIlIlI("DGMmd8mh6z4=", "ajBLI");
        SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[17]] = lllllIIllIIllIl("iM17Oattl41XOfXS6kaCsQ==", "mZlwc");
        SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[18]] = lllllIIllIIlIlI("j0IjmLtFAHnOfXa/ydKsOg==", "ZSLkX");
        SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[19]] = lllllIIllIIlIlI("g3oAlwfVRXPImMd8VqQ6Rw==", "gpGhK");
    }
    
    public abstract SpdyHeaders clear();
    
    private static boolean lllllIlIIllIIIl(final int lllllllllllllIIIIIIllIllIlllllIl, final int lllllllllllllIIIIIIllIllIlllllII) {
        return lllllllllllllIIIIIIllIllIlllllIl == lllllllllllllIIIIIIllIllIlllllII;
    }
    
    private static boolean lllllIlIIllIIII(final Object lllllllllllllIIIIIIllIllIlllIllI) {
        return lllllllllllllIIIIIIllIllIlllIllI == null;
    }
    
    public static String getUrl(final int lllllllllllllIIIIIIllIllllIlIIII, final SpdyHeadersFrame lllllllllllllIIIIIIllIllllIIlllI) {
        return lllllllllllllIIIIIIllIllllIIlllI.headers().get(SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[15]]);
    }
    
    public static void removeStatus(final int lllllllllllllIIIIIIllIllllllIIll, final SpdyHeadersFrame lllllllllllllIIIIIIllIllllllIIIl) {
        lllllllllllllIIIIIIllIllllllIIIl.headers().remove(SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[9]]);
        "".length();
    }
    
    public static void setMethod(final int lllllllllllllIIIIIIlllIIIIIIlIII, final SpdyHeadersFrame lllllllllllllIIIIIIlllIIIIIIIlIl, final HttpMethod lllllllllllllIIIIIIlllIIIIIIIlII) {
        lllllllllllllIIIIIIlllIIIIIIIlIl.headers().set(SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[5]], lllllllllllllIIIIIIlllIIIIIIIlII.name());
        "".length();
    }
    
    private static void lllllIlIIlIllll() {
        (lIllIIlIllllIl = new int[21])[0] = ((0xFF ^ 0xB1 ^ (0x5F ^ 0x44)) & (0xC3 ^ 0xA1 ^ (0x2 ^ 0x35) ^ -" ".length()));
        SpdyHeaders.lIllIIlIllllIl[1] = " ".length();
        SpdyHeaders.lIllIIlIllllIl[2] = "  ".length();
        SpdyHeaders.lIllIIlIllllIl[3] = "   ".length();
        SpdyHeaders.lIllIIlIllllIl[4] = (0x5A ^ 0x5E);
        SpdyHeaders.lIllIIlIllllIl[5] = (60 + 137 - 172 + 117 ^ 76 + 71 - 110 + 102);
        SpdyHeaders.lIllIIlIllllIl[6] = (0x18 ^ 0x4E ^ (0xF8 ^ 0xA8));
        SpdyHeaders.lIllIIlIllllIl[7] = (48 + 125 - 126 + 106 ^ 2 + 51 + 44 + 61);
        SpdyHeaders.lIllIIlIllllIl[8] = (98 + 83 - 79 + 73 ^ 46 + 152 - 67 + 36);
        SpdyHeaders.lIllIIlIllllIl[9] = (0x75 ^ 0x12 ^ (0x7B ^ 0x15));
        SpdyHeaders.lIllIIlIllllIl[10] = (0x4F ^ 0x45);
        SpdyHeaders.lIllIIlIllllIl[11] = (0x38 ^ 0x18);
        SpdyHeaders.lIllIIlIllllIl[12] = -" ".length();
        SpdyHeaders.lIllIIlIllllIl[13] = (0x8E ^ 0x85);
        SpdyHeaders.lIllIIlIllllIl[14] = (0xCA ^ 0xC6);
        SpdyHeaders.lIllIIlIllllIl[15] = (117 + 91 - 187 + 148 ^ 149 + 37 - 184 + 162);
        SpdyHeaders.lIllIIlIllllIl[16] = (93 + 35 - 0 + 37 ^ 54 + 107 - 129 + 139);
        SpdyHeaders.lIllIIlIllllIl[17] = (0x71 ^ 0x2F ^ (0x6B ^ 0x3A));
        SpdyHeaders.lIllIIlIllllIl[18] = (0x1D ^ 0xD);
        SpdyHeaders.lIllIIlIllllIl[19] = (0x3A ^ 0x2B);
        SpdyHeaders.lIllIIlIllllIl[20] = (0x1E ^ 0xC ^ ((0x1D ^ 0x2A) & ~(0xBF ^ 0x88)));
    }
    
    public abstract List<String> getAll(final String p0);
    
    public static void setUrl(final int lllllllllllllIIIIIIllIllllIIlIll, final SpdyHeadersFrame lllllllllllllIIIIIIllIllllIIlIlI, final String lllllllllllllIIIIIIllIllllIIIlll) {
        lllllllllllllIIIIIIllIllllIIlIlI.headers().set(SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[16]], lllllllllllllIIIIIIllIllllIIIlll);
        "".length();
    }
    
    public abstract SpdyHeaders add(final String p0, final Iterable<?> p1);
    
    public static void setHost(final SpdyHeadersFrame lllllllllllllIIIIIIlllIIIIIlIlll, final String lllllllllllllIIIIIIlllIIIIIllIII) {
        lllllllllllllIIIIIIlllIIIIIlIlll.headers().set(SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[2]], lllllllllllllIIIIIIlllIIIIIllIII);
        "".length();
    }
    
    public static void addHeader(final SpdyHeadersFrame lllllllllllllIIIIIIlllIIIIlIIlll, final String lllllllllllllIIIIIIlllIIIIlIIIll, final Object lllllllllllllIIIIIIlllIIIIlIIlIl) {
        lllllllllllllIIIIIIlllIIIIlIIlll.headers().add(lllllllllllllIIIIIIlllIIIIlIIIll, lllllllllllllIIIIIIlllIIIIlIIlIl);
        "".length();
    }
    
    public static HttpVersion getVersion(final int lllllllllllllIIIIIIllIlllIllllll, final SpdyHeadersFrame lllllllllllllIIIIIIllIlllIlllllI) {
        try {
            return HttpVersion.valueOf(lllllllllllllIIIIIIllIlllIlllllI.headers().get(SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[18]]));
        }
        catch (Exception lllllllllllllIIIIIIllIllllIIIIII) {
            return null;
        }
    }
    
    public static String getHost(final SpdyHeadersFrame lllllllllllllIIIIIIlllIIIIIlllII) {
        return lllllllllllllIIIIIIlllIIIIIlllII.headers().get(SpdyHeaders.lIllIIlIIllllI[SpdyHeaders.lIllIIlIllllIl[1]]);
    }
    
    private static String lllllIIllIIlIlI(final String lllllllllllllIIIIIIllIlllIIlIIlI, final String lllllllllllllIIIIIIllIlllIIlIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIllIlllIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIllIlllIIlIIIl.getBytes(StandardCharsets.UTF_8)), SpdyHeaders.lIllIIlIllllIl[8]), "DES");
            final Cipher lllllllllllllIIIIIIllIlllIIlIlII = Cipher.getInstance("DES");
            lllllllllllllIIIIIIllIlllIIlIlII.init(SpdyHeaders.lIllIIlIllllIl[2], lllllllllllllIIIIIIllIlllIIlIlIl);
            return new String(lllllllllllllIIIIIIllIlllIIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIllIlllIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIllIlllIIlIIll) {
            lllllllllllllIIIIIIllIlllIIlIIll.printStackTrace();
            return null;
        }
    }
    
    public static final class HttpNames
    {
        private static final /* synthetic */ int[] lIIllllllllIII;
        private static final /* synthetic */ String[] lIIlllllllIlll;
        
        private HttpNames() {
        }
        
        private static String llIllllllIlllII(String lllllllllllllIIlIIIllIIlllIlllIl, final String lllllllllllllIIlIIIllIIlllIlllII) {
            lllllllllllllIIlIIIllIIlllIlllIl = new String(Base64.getDecoder().decode(lllllllllllllIIlIIIllIIlllIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIlIIIllIIllllIIIII = new StringBuilder();
            final char[] lllllllllllllIIlIIIllIIlllIlllll = lllllllllllllIIlIIIllIIlllIlllII.toCharArray();
            int lllllllllllllIIlIIIllIIlllIllllI = HttpNames.lIIllllllllIII[0];
            final int lllllllllllllIIlIIIllIIlllIllIII = (Object)lllllllllllllIIlIIIllIIlllIlllIl.toCharArray();
            final double lllllllllllllIIlIIIllIIlllIlIlll = lllllllllllllIIlIIIllIIlllIllIII.length;
            int lllllllllllllIIlIIIllIIlllIlIllI = HttpNames.lIIllllllllIII[0];
            while (llIllllllIlllll(lllllllllllllIIlIIIllIIlllIlIllI, (int)lllllllllllllIIlIIIllIIlllIlIlll)) {
                final char lllllllllllllIIlIIIllIIllllIIIll = lllllllllllllIIlIIIllIIlllIllIII[lllllllllllllIIlIIIllIIlllIlIllI];
                lllllllllllllIIlIIIllIIllllIIIII.append((char)(lllllllllllllIIlIIIllIIllllIIIll ^ lllllllllllllIIlIIIllIIlllIlllll[lllllllllllllIIlIIIllIIlllIllllI % lllllllllllllIIlIIIllIIlllIlllll.length]));
                "".length();
                ++lllllllllllllIIlIIIllIIlllIllllI;
                ++lllllllllllllIIlIIIllIIlllIlIllI;
                "".length();
                if (-"  ".length() > 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIlIIIllIIllllIIIII);
        }
        
        private static boolean llIllllllIlllll(final int lllllllllllllIIlIIIllIIllIlllIII, final int lllllllllllllIIlIIIllIIllIllIlll) {
            return lllllllllllllIIlIIIllIIllIlllIII < lllllllllllllIIlIIIllIIllIllIlll;
        }
        
        private static void llIllllllIllllI() {
            (lIIllllllllIII = new int[8])[0] = ((0x6E ^ 0xC) & ~(0xFD ^ 0x9F));
            HttpNames.lIIllllllllIII[1] = " ".length();
            HttpNames.lIIllllllllIII[2] = "  ".length();
            HttpNames.lIIllllllllIII[3] = "   ".length();
            HttpNames.lIIllllllllIII[4] = (0x87 ^ 0x83);
            HttpNames.lIIllllllllIII[5] = (123 + 70 - 181 + 147 ^ 6 + 20 - 23 + 151);
            HttpNames.lIIllllllllIII[6] = (109 + 65 - 150 + 143 ^ 71 + 14 + 3 + 73);
            HttpNames.lIIllllllllIII[7] = (0x55 ^ 0x1 ^ (0xCF ^ 0x93));
        }
        
        private static void llIllllllIlllIl() {
            (lIIlllllllIlll = new String[HttpNames.lIIllllllllIII[6]])[HttpNames.lIIllllllllIII[0]] = llIllllllIlIIlI("GnOSBwxJZqE=", "SfMpB");
            HttpNames.lIIlllllllIlll[HttpNames.lIIllllllllIII[1]] = llIllllllIlIlll("k6+qn564RiU=", "mxXga");
            HttpNames.lIIlllllllIlll[HttpNames.lIIllllllllIII[2]] = llIllllllIlllII("aRsWGiI+DQ==", "ShurG");
            HttpNames.lIIlllllllIlll[HttpNames.lIIllllllllIII[3]] = llIllllllIlllII("dw43AiYiBw==", "McRvN");
            HttpNames.lIIlllllllIlll[HttpNames.lIIllllllllIII[4]] = llIllllllIlIIlI("ntExZhrebqt/ING/OjWGrQ==", "GLyCJ");
            HttpNames.lIIlllllllIlll[HttpNames.lIIllllllllIII[5]] = llIllllllIlllII("SB8sEi8=", "roMfG");
        }
        
        static {
            llIllllllIllllI();
            llIllllllIlllIl();
            HOST = HttpNames.lIIlllllllIlll[HttpNames.lIIllllllllIII[0]];
            STATUS = HttpNames.lIIlllllllIlll[HttpNames.lIIllllllllIII[1]];
            SCHEME = HttpNames.lIIlllllllIlll[HttpNames.lIIllllllllIII[2]];
            METHOD = HttpNames.lIIlllllllIlll[HttpNames.lIIllllllllIII[3]];
            VERSION = HttpNames.lIIlllllllIlll[HttpNames.lIIllllllllIII[4]];
            PATH = HttpNames.lIIlllllllIlll[HttpNames.lIIllllllllIII[5]];
        }
        
        private static String llIllllllIlIIlI(final String lllllllllllllIIlIIIllIIlllIIlIll, final String lllllllllllllIIlIIIllIIlllIIlIlI) {
            try {
                final SecretKeySpec lllllllllllllIIlIIIllIIlllIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIllIIlllIIlIlI.getBytes(StandardCharsets.UTF_8)), HttpNames.lIIllllllllIII[7]), "DES");
                final Cipher lllllllllllllIIlIIIllIIlllIIllll = Cipher.getInstance("DES");
                lllllllllllllIIlIIIllIIlllIIllll.init(HttpNames.lIIllllllllIII[2], lllllllllllllIIlIIIllIIlllIlIIII);
                return new String(lllllllllllllIIlIIIllIIlllIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIllIIlllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIIIllIIlllIIlllI) {
                lllllllllllllIIlIIIllIIlllIIlllI.printStackTrace();
                return null;
            }
        }
        
        private static String llIllllllIlIlll(final String lllllllllllllIIlIIIllIIllIlllllI, final String lllllllllllllIIlIIIllIIllIllllll) {
            try {
                final SecretKeySpec lllllllllllllIIlIIIllIIlllIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIllIIllIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlIIIllIIlllIIIIlI = Cipher.getInstance("Blowfish");
                lllllllllllllIIlIIIllIIlllIIIIlI.init(HttpNames.lIIllllllllIII[2], lllllllllllllIIlIIIllIIlllIIIIll);
                return new String(lllllllllllllIIlIIIllIIlllIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIllIIllIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIIIllIIlllIIIIIl) {
                lllllllllllllIIlIIIllIIlllIIIIIl.printStackTrace();
                return null;
            }
        }
    }
}
