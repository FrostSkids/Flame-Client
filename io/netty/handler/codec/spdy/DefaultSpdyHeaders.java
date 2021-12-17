// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import java.util.NoSuchElementException;
import java.util.TreeSet;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class DefaultSpdyHeaders extends SpdyHeaders
{
    private static final /* synthetic */ int[] llIlIlllIlllIl;
    private static final /* synthetic */ String[] llIlIlllIllIII;
    private final /* synthetic */ HeaderEntry head;
    private final /* synthetic */ HeaderEntry[] entries;
    
    @Override
    public boolean isEmpty() {
        int n;
        if (lIIlIlIllllIIIII(this.head, this.head.after)) {
            n = DefaultSpdyHeaders.llIlIlllIlllIl[1];
            "".length();
            if (null != null) {
                return ((0x7C ^ 0x26) & ~(0xC8 ^ 0x92)) != 0x0;
            }
        }
        else {
            n = DefaultSpdyHeaders.llIlIlllIlllIl[0];
        }
        return n != 0;
    }
    
    private static boolean lIIlIlIllllIIIII(final Object llllllllllllIllIlIIIllIllIllIIll, final Object llllllllllllIllIlIIIllIllIllIIlI) {
        return llllllllllllIllIlIIIllIllIllIIll == llllllllllllIllIlIIIllIllIllIIlI;
    }
    
    private static boolean lIIlIlIlllIllIll(final Object llllllllllllIllIlIIIllIllIllIIII) {
        return llllllllllllIllIlIIIllIllIllIIII == null;
    }
    
    private static boolean lIIlIlIlllIllIII(final int llllllllllllIllIlIIIllIllIlIlIlI) {
        return llllllllllllIllIlIIIllIllIlIlIlI > 0;
    }
    
    private static String lIIlIlIlllIIlIlI(final String llllllllllllIllIlIIIllIlllIllllI, final String llllllllllllIllIlIIIllIlllIlllIl) {
        try {
            final SecretKeySpec llllllllllllIllIlIIIllIllllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIIllIlllIlllIl.getBytes(StandardCharsets.UTF_8)), DefaultSpdyHeaders.llIlIlllIlllIl[12]), "DES");
            final Cipher llllllllllllIllIlIIIllIllllIIIII = Cipher.getInstance("DES");
            llllllllllllIllIlIIIllIllllIIIII.init(DefaultSpdyHeaders.llIlIlllIlllIl[9], llllllllllllIllIlIIIllIllllIIIIl);
            return new String(llllllllllllIllIlIIIllIllllIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIIllIlllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIIllIlllIlllll) {
            llllllllllllIllIlIIIllIlllIlllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public List<String> getAll(final String llllllllllllIllIlIIIlllIIIlllllI) {
        if (lIIlIlIlllIllIll(llllllllllllIllIlIIIlllIIIlllllI)) {
            throw new NullPointerException(DefaultSpdyHeaders.llIlIlllIllIII[DefaultSpdyHeaders.llIlIlllIlllIl[10]]);
        }
        final LinkedList<String> llllllllllllIllIlIIIlllIIlIIIIll = new LinkedList<String>();
        final int llllllllllllIllIlIIIlllIIlIIIIlI = hash(llllllllllllIllIlIIIlllIIIlllllI);
        final int llllllllllllIllIlIIIlllIIlIIIIIl = index(llllllllllllIllIlIIIlllIIlIIIIlI);
        HeaderEntry llllllllllllIllIlIIIlllIIlIIIIII = this.entries[llllllllllllIllIlIIIlllIIlIIIIIl];
        while (lIIlIlIlllIlllIl(llllllllllllIllIlIIIlllIIlIIIIII)) {
            if (lIIlIlIlllIllIIl(llllllllllllIllIlIIIlllIIlIIIIII.hash, llllllllllllIllIlIIIlllIIlIIIIlI) && lIIlIlIlllIlllII(eq(llllllllllllIllIlIIIlllIIIlllllI, llllllllllllIllIlIIIlllIIlIIIIII.key) ? 1 : 0)) {
                llllllllllllIllIlIIIlllIIlIIIIll.addFirst(llllllllllllIllIlIIIlllIIlIIIIII.value);
            }
            llllllllllllIllIlIIIlllIIlIIIIII = llllllllllllIllIlIIIlllIIlIIIIII.next;
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        return llllllllllllIllIlIIIlllIIlIIIIll;
    }
    
    private static boolean lIIlIlIlllIllIlI(final int llllllllllllIllIlIIIllIllIlIIlll, final int llllllllllllIllIlIIIllIllIlIIllI) {
        return llllllllllllIllIlIIIllIllIlIIlll != llllllllllllIllIlIIIllIllIlIIllI;
    }
    
    private static int hash(final String llllllllllllIllIlIIIlllIlllllIlI) {
        int llllllllllllIllIlIIIlllIlllllIIl = DefaultSpdyHeaders.llIlIlllIlllIl[0];
        int llllllllllllIllIlIIIlllIlllllIll = llllllllllllIllIlIIIlllIlllllIlI.length() - DefaultSpdyHeaders.llIlIlllIlllIl[1];
        while (lIIlIlIlllIlIlIl(llllllllllllIllIlIIIlllIlllllIll)) {
            char llllllllllllIllIlIIIlllIllllllII = llllllllllllIllIlIIIlllIlllllIlI.charAt(llllllllllllIllIlIIIlllIlllllIll);
            if (lIIlIlIlllIlIllI(llllllllllllIllIlIIIlllIllllllII, DefaultSpdyHeaders.llIlIlllIlllIl[2]) && lIIlIlIlllIlIlll(llllllllllllIllIlIIIlllIllllllII, DefaultSpdyHeaders.llIlIlllIlllIl[3])) {
                llllllllllllIllIlIIIlllIllllllII += (char)DefaultSpdyHeaders.llIlIlllIlllIl[4];
            }
            llllllllllllIllIlIIIlllIlllllIIl = DefaultSpdyHeaders.llIlIlllIlllIl[5] * llllllllllllIllIlIIIlllIlllllIIl + llllllllllllIllIlIIIlllIllllllII;
            --llllllllllllIllIlIIIlllIlllllIll;
            "".length();
            if ("   ".length() < "   ".length()) {
                return (0x3D ^ 0x7D) & ~(0x83 ^ 0xC3);
            }
        }
        if (lIIlIlIlllIllIII(llllllllllllIllIlIIIlllIlllllIIl)) {
            return llllllllllllIllIlIIIlllIlllllIIl;
        }
        if (lIIlIlIlllIllIIl(llllllllllllIllIlIIIlllIlllllIIl, Integer.MIN_VALUE)) {
            return DefaultSpdyHeaders.llIlIlllIlllIl[6];
        }
        return -llllllllllllIllIlIIIlllIlllllIIl;
    }
    
    private static boolean lIIlIlIlllIllllI(final int llllllllllllIllIlIIIllIlllIIIIIl, final int llllllllllllIllIlIIIllIlllIIIIII) {
        return llllllllllllIllIlIIIllIlllIIIIIl < llllllllllllIllIlIIIllIlllIIIIII;
    }
    
    @Override
    public SpdyHeaders set(final String llllllllllllIllIlIIIlllIIllIlllI, final Iterable<?> llllllllllllIllIlIIIlllIIllIllIl) {
        if (lIIlIlIlllIllIll(llllllllllllIllIlIIIlllIIllIllIl)) {
            throw new NullPointerException(DefaultSpdyHeaders.llIlIlllIllIII[DefaultSpdyHeaders.llIlIlllIlllIl[1]]);
        }
        final String llllllllllllIllIlIIIlllIIllIllII = llllllllllllIllIlIIIlllIIllIlllI.toLowerCase();
        SpdyCodecUtil.validateHeaderName(llllllllllllIllIlIIIlllIIllIllII);
        final int llllllllllllIllIlIIIlllIIllIlIll = hash(llllllllllllIllIlIIIlllIIllIllII);
        final int llllllllllllIllIlIIIlllIIllIlIlI = index(llllllllllllIllIlIIIlllIIllIlIll);
        this.remove0(llllllllllllIllIlIIIlllIIllIlIll, llllllllllllIllIlIIIlllIIllIlIlI, llllllllllllIllIlIIIlllIIllIllII);
        final Iterator llllllllllllIllIlIIIlllIIlllIIII = llllllllllllIllIlIIIlllIIllIllIl.iterator();
        while (lIIlIlIlllIlllII(llllllllllllIllIlIIIlllIIlllIIII.hasNext() ? 1 : 0)) {
            final Object llllllllllllIllIlIIIlllIIlllIIIl = llllllllllllIllIlIIIlllIIlllIIII.next();
            if (lIIlIlIlllIllIll(llllllllllllIllIlIIIlllIIlllIIIl)) {
                "".length();
                if (null != null) {
                    return null;
                }
                break;
            }
            else {
                final String llllllllllllIllIlIIIlllIIlllIIlI = toString(llllllllllllIllIlIIIlllIIlllIIIl);
                SpdyCodecUtil.validateHeaderValue(llllllllllllIllIlIIIlllIIlllIIlI);
                this.add0(llllllllllllIllIlIIIlllIIllIlIll, llllllllllllIllIlIIIlllIIllIlIlI, llllllllllllIllIlIIIlllIIllIllII, llllllllllllIllIlIIIlllIIlllIIlI);
                "".length();
                if ("   ".length() == 0) {
                    return null;
                }
                continue;
            }
        }
        return this;
    }
    
    private static String lIIlIlIlllIIlIIl(final String llllllllllllIllIlIIIllIlllIIllll, final String llllllllllllIllIlIIIllIlllIlIIII) {
        try {
            final SecretKeySpec llllllllllllIllIlIIIllIlllIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIIllIlllIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIIIllIlllIlIIll = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIIIllIlllIlIIll.init(DefaultSpdyHeaders.llIlIlllIlllIl[9], llllllllllllIllIlIIIllIlllIlIlII);
            return new String(llllllllllllIllIlIIIllIlllIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIIllIlllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIIllIlllIlIIlI) {
            llllllllllllIllIlIIIllIlllIlIIlI.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlIlIlllIIllII() {
        (llIlIlllIllIII = new String[DefaultSpdyHeaders.llIlIlllIlllIl[11]])[DefaultSpdyHeaders.llIlIlllIlllIl[0]] = lIIlIlIlllIIlIIl("Xubc0IhuAOU=", "NkmNI");
        DefaultSpdyHeaders.llIlIlllIllIII[DefaultSpdyHeaders.llIlIlllIlllIl[1]] = lIIlIlIlllIIlIlI("1M9NK2CtviY=", "HOzIX");
        DefaultSpdyHeaders.llIlIlllIllIII[DefaultSpdyHeaders.llIlIlllIlllIl[9]] = lIIlIlIlllIIlIll("IxQLEA==", "Mufum");
        DefaultSpdyHeaders.llIlIlllIllIII[DefaultSpdyHeaders.llIlIlllIlllIl[10]] = lIIlIlIlllIIlIlI("7mPGurNWsZg=", "rTkSh");
    }
    
    private static boolean lIIlIlIlllIlIllI(final int llllllllllllIllIlIIIllIlllIIIlIl, final int llllllllllllIllIlIIIllIlllIIIlII) {
        return llllllllllllIllIlIIIllIlllIIIlIl >= llllllllllllIllIlIIIllIlllIIIlII;
    }
    
    @Override
    public SpdyHeaders clear() {
        int llllllllllllIllIlIIIlllIIlIllllI = DefaultSpdyHeaders.llIlIlllIlllIl[0];
        while (lIIlIlIlllIllllI(llllllllllllIllIlIIIlllIIlIllllI, this.entries.length)) {
            this.entries[llllllllllllIllIlIIIlllIIlIllllI] = null;
            ++llllllllllllIllIlIIIlllIIlIllllI;
            "".length();
            if (-(0xFB ^ 0xC7 ^ (0x8B ^ 0xB3)) > 0) {
                return null;
            }
        }
        final HeaderEntry head = this.head;
        final HeaderEntry head2 = this.head;
        final HeaderEntry head3 = this.head;
        head2.after = head3;
        head.before = head3;
        return this;
    }
    
    private static boolean lIIlIlIlllIlIlll(final int llllllllllllIllIlIIIllIllIllllIl, final int llllllllllllIllIlIIIllIllIllllII) {
        return llllllllllllIllIlIIIllIllIllllIl <= llllllllllllIllIlIIIllIllIllllII;
    }
    
    static {
        lIIlIlIlllIlIlII();
        lIIlIlIlllIIllII();
        BUCKET_SIZE = DefaultSpdyHeaders.llIlIlllIlllIl[7];
    }
    
    @Override
    public String get(final String llllllllllllIllIlIIIlllIIlIIllll) {
        if (lIIlIlIlllIllIll(llllllllllllIllIlIIIlllIIlIIllll)) {
            throw new NullPointerException(DefaultSpdyHeaders.llIlIlllIllIII[DefaultSpdyHeaders.llIlIlllIlllIl[9]]);
        }
        final int llllllllllllIllIlIIIlllIIlIlIIll = hash(llllllllllllIllIlIIIlllIIlIIllll);
        final int llllllllllllIllIlIIIlllIIlIlIIlI = index(llllllllllllIllIlIIIlllIIlIlIIll);
        HeaderEntry llllllllllllIllIlIIIlllIIlIlIIIl = this.entries[llllllllllllIllIlIIIlllIIlIlIIlI];
        while (lIIlIlIlllIlllIl(llllllllllllIllIlIIIlllIIlIlIIIl)) {
            if (lIIlIlIlllIllIIl(llllllllllllIllIlIIIlllIIlIlIIIl.hash, llllllllllllIllIlIIIlllIIlIlIIll) && lIIlIlIlllIlllII(eq(llllllllllllIllIlIIIlllIIlIIllll, llllllllllllIllIlIIIlllIIlIlIIIl.key) ? 1 : 0)) {
                return llllllllllllIllIlIIIlllIIlIlIIIl.value;
            }
            llllllllllllIllIlIIIlllIIlIlIIIl = llllllllllllIllIlIIIlllIIlIlIIIl.next;
            "".length();
            if ((103 + 167 - 183 + 101 ^ 182 + 69 - 121 + 55) == 0x0) {
                return null;
            }
        }
        return null;
    }
    
    DefaultSpdyHeaders() {
        this.entries = new HeaderEntry[DefaultSpdyHeaders.llIlIlllIlllIl[7]];
        this.head = new HeaderEntry(DefaultSpdyHeaders.llIlIlllIlllIl[8], null, null);
        final HeaderEntry head = this.head;
        final HeaderEntry head2 = this.head;
        final HeaderEntry head3 = this.head;
        head2.after = head3;
        head.before = head3;
    }
    
    private static boolean lIIlIlIlllIlllll(final Object llllllllllllIllIlIIIllIllIlllIIl, final Object llllllllllllIllIlIIIllIllIlllIII) {
        return llllllllllllIllIlIIIllIllIlllIIl != llllllllllllIllIlIIIllIllIlllIII;
    }
    
    @Override
    public SpdyHeaders add(final String llllllllllllIllIlIIIlllIllIlIlII, final Object llllllllllllIllIlIIIlllIllIIllII) {
        final String llllllllllllIllIlIIIlllIllIlIIlI = llllllllllllIllIlIIIlllIllIlIlII.toLowerCase();
        SpdyCodecUtil.validateHeaderName(llllllllllllIllIlIIIlllIllIlIIlI);
        final String llllllllllllIllIlIIIlllIllIlIIIl = toString(llllllllllllIllIlIIIlllIllIIllII);
        SpdyCodecUtil.validateHeaderValue(llllllllllllIllIlIIIlllIllIlIIIl);
        final int llllllllllllIllIlIIIlllIllIlIIII = hash(llllllllllllIllIlIIIlllIllIlIIlI);
        final int llllllllllllIllIlIIIlllIllIIllll = index(llllllllllllIllIlIIIlllIllIlIIII);
        this.add0(llllllllllllIllIlIIIlllIllIlIIII, llllllllllllIllIlIIIlllIllIIllll, llllllllllllIllIlIIIlllIllIlIIlI, llllllllllllIllIlIIIlllIllIlIIIl);
        return this;
    }
    
    @Override
    public List<Map.Entry<String, String>> entries() {
        final List<Map.Entry<String, String>> llllllllllllIllIlIIIlllIIIllIlIl = new LinkedList<Map.Entry<String, String>>();
        HeaderEntry llllllllllllIllIlIIIlllIIIllIlII = this.head.after;
        while (lIIlIlIlllIlllll(llllllllllllIllIlIIIlllIIIllIlII, this.head)) {
            llllllllllllIllIlIIIlllIIIllIlIl.add(llllllllllllIllIlIIIlllIIIllIlII);
            "".length();
            llllllllllllIllIlIIIlllIIIllIlII = llllllllllllIllIlIIIlllIIIllIlII.after;
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        return llllllllllllIllIlIIIlllIIIllIlIl;
    }
    
    private static String toString(final Object llllllllllllIllIlIIIlllIIIIIIIIl) {
        if (lIIlIlIlllIllIll(llllllllllllIllIlIIIlllIIIIIIIIl)) {
            return null;
        }
        return llllllllllllIllIlIIIlllIIIIIIIIl.toString();
    }
    
    private static boolean eq(final String llllllllllllIllIlIIIlllIlllIlIll, final String llllllllllllIllIlIIIlllIlllIIlll) {
        final int llllllllllllIllIlIIIlllIlllIlIIl = llllllllllllIllIlIIIlllIlllIlIll.length();
        if (lIIlIlIlllIllIlI(llllllllllllIllIlIIIlllIlllIlIIl, llllllllllllIllIlIIIlllIlllIIlll.length())) {
            return DefaultSpdyHeaders.llIlIlllIlllIl[0] != 0;
        }
        int llllllllllllIllIlIIIlllIlllIllII = llllllllllllIllIlIIIlllIlllIlIIl - DefaultSpdyHeaders.llIlIlllIlllIl[1];
        while (lIIlIlIlllIlIlIl(llllllllllllIllIlIIIlllIlllIllII)) {
            char llllllllllllIllIlIIIlllIlllIlllI = llllllllllllIllIlIIIlllIlllIlIll.charAt(llllllllllllIllIlIIIlllIlllIllII);
            char llllllllllllIllIlIIIlllIlllIllIl = llllllllllllIllIlIIIlllIlllIIlll.charAt(llllllllllllIllIlIIIlllIlllIllII);
            if (lIIlIlIlllIllIlI(llllllllllllIllIlIIIlllIlllIlllI, llllllllllllIllIlIIIlllIlllIllIl)) {
                if (lIIlIlIlllIlIllI(llllllllllllIllIlIIIlllIlllIlllI, DefaultSpdyHeaders.llIlIlllIlllIl[2]) && lIIlIlIlllIlIlll(llllllllllllIllIlIIIlllIlllIlllI, DefaultSpdyHeaders.llIlIlllIlllIl[3])) {
                    llllllllllllIllIlIIIlllIlllIlllI += (char)DefaultSpdyHeaders.llIlIlllIlllIl[4];
                }
                if (lIIlIlIlllIlIllI(llllllllllllIllIlIIIlllIlllIllIl, DefaultSpdyHeaders.llIlIlllIlllIl[2]) && lIIlIlIlllIlIlll(llllllllllllIllIlIIIlllIlllIllIl, DefaultSpdyHeaders.llIlIlllIlllIl[3])) {
                    llllllllllllIllIlIIIlllIlllIllIl += (char)DefaultSpdyHeaders.llIlIlllIlllIl[4];
                }
                if (lIIlIlIlllIllIlI(llllllllllllIllIlIIIlllIlllIlllI, llllllllllllIllIlIIIlllIlllIllIl)) {
                    return DefaultSpdyHeaders.llIlIlllIlllIl[0] != 0;
                }
            }
            --llllllllllllIllIlIIIlllIlllIllII;
            "".length();
            if (null != null) {
                return ((0xCD ^ 0x9E ^ (0x4E ^ 0x52)) & (0x63 ^ 0x5D ^ (0xCC ^ 0xBD) ^ -" ".length())) != 0x0;
            }
        }
        return DefaultSpdyHeaders.llIlIlllIlllIl[1] != 0;
    }
    
    private static String lIIlIlIlllIIlIll(String llllllllllllIllIlIIIllIllllIlllI, final String llllllllllllIllIlIIIllIllllIllIl) {
        llllllllllllIllIlIIIllIllllIlllI = (byte)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIIIllIllllIlllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIIIllIlllllIIIl = new StringBuilder();
        final char[] llllllllllllIllIlIIIllIlllllIIII = llllllllllllIllIlIIIllIllllIllIl.toCharArray();
        int llllllllllllIllIlIIIllIllllIllll = DefaultSpdyHeaders.llIlIlllIlllIl[0];
        final char llllllllllllIllIlIIIllIllllIlIIl = (Object)((String)llllllllllllIllIlIIIllIllllIlllI).toCharArray();
        final int llllllllllllIllIlIIIllIllllIlIII = llllllllllllIllIlIIIllIllllIlIIl.length;
        int llllllllllllIllIlIIIllIllllIIlll = DefaultSpdyHeaders.llIlIlllIlllIl[0];
        while (lIIlIlIlllIllllI(llllllllllllIllIlIIIllIllllIIlll, llllllllllllIllIlIIIllIllllIlIII)) {
            final char llllllllllllIllIlIIIllIlllllIlII = llllllllllllIllIlIIIllIllllIlIIl[llllllllllllIllIlIIIllIllllIIlll];
            llllllllllllIllIlIIIllIlllllIIIl.append((char)(llllllllllllIllIlIIIllIlllllIlII ^ llllllllllllIllIlIIIllIlllllIIII[llllllllllllIllIlIIIllIllllIllll % llllllllllllIllIlIIIllIlllllIIII.length]));
            "".length();
            ++llllllllllllIllIlIIIllIllllIllll;
            ++llllllllllllIllIlIIIllIllllIIlll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIIIllIlllllIIIl);
    }
    
    @Override
    public boolean contains(final String llllllllllllIllIlIIIlllIIIlIlIII) {
        int n;
        if (lIIlIlIlllIlllIl(this.get(llllllllllllIllIlIIIlllIIIlIlIII))) {
            n = DefaultSpdyHeaders.llIlIlllIlllIl[1];
            "".length();
            if ("  ".length() == 0) {
                return ((132 + 133 - 227 + 97 ^ 71 + 57 - 119 + 185) & (199 + 193 - 365 + 198 ^ 6 + 123 - 103 + 138 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = DefaultSpdyHeaders.llIlIlllIlllIl[0];
        }
        return n != 0;
    }
    
    private static boolean lIIlIlIlllIlllII(final int llllllllllllIllIlIIIllIllIlIlllI) {
        return llllllllllllIllIlIIIllIllIlIlllI != 0;
    }
    
    @Override
    public SpdyHeaders remove(final String llllllllllllIllIlIIIlllIlIlIllII) {
        if (lIIlIlIlllIllIll(llllllllllllIllIlIIIlllIlIlIllII)) {
            throw new NullPointerException(DefaultSpdyHeaders.llIlIlllIllIII[DefaultSpdyHeaders.llIlIlllIlllIl[0]]);
        }
        final String llllllllllllIllIlIIIlllIlIlIlIll = llllllllllllIllIlIIIlllIlIlIllII.toLowerCase();
        final int llllllllllllIllIlIIIlllIlIlIlIlI = hash(llllllllllllIllIlIIIlllIlIlIlIll);
        final int llllllllllllIllIlIIIlllIlIlIlIIl = index(llllllllllllIllIlIIIlllIlIlIlIlI);
        this.remove0(llllllllllllIllIlIIIlllIlIlIlIlI, llllllllllllIllIlIIIlllIlIlIlIIl, llllllllllllIllIlIIIlllIlIlIlIll);
        return this;
    }
    
    private static void lIIlIlIlllIlIlII() {
        (llIlIlllIlllIl = new int[13])[0] = ((0x4F ^ 0x7F) & ~(0x77 ^ 0x47));
        DefaultSpdyHeaders.llIlIlllIlllIl[1] = " ".length();
        DefaultSpdyHeaders.llIlIlllIlllIl[2] = (0x15 ^ 0x54);
        DefaultSpdyHeaders.llIlIlllIlllIl[3] = (0xF6 ^ 0xAC);
        DefaultSpdyHeaders.llIlIlllIlllIl[4] = (0x2 ^ 0x22);
        DefaultSpdyHeaders.llIlIlllIlllIl[5] = (0x52 ^ 0x30 ^ (0xE1 ^ 0x9C));
        DefaultSpdyHeaders.llIlIlllIlllIl[6] = (-1 & Integer.MAX_VALUE);
        DefaultSpdyHeaders.llIlIlllIlllIl[7] = (147 + 118 - 192 + 85 ^ 17 + 0 + 101 + 25);
        DefaultSpdyHeaders.llIlIlllIlllIl[8] = -" ".length();
        DefaultSpdyHeaders.llIlIlllIlllIl[9] = "  ".length();
        DefaultSpdyHeaders.llIlIlllIlllIl[10] = "   ".length();
        DefaultSpdyHeaders.llIlIlllIlllIl[11] = (0x1E ^ 0xD ^ (0xD7 ^ 0xC0));
        DefaultSpdyHeaders.llIlIlllIlllIl[12] = (0x79 ^ 0x71);
    }
    
    @Override
    public SpdyHeaders set(final String llllllllllllIllIlIIIlllIlIIIIIIl, final Object llllllllllllIllIlIIIlllIlIIIIIII) {
        final String llllllllllllIllIlIIIlllIlIIIIllI = llllllllllllIllIlIIIlllIlIIIIIIl.toLowerCase();
        SpdyCodecUtil.validateHeaderName(llllllllllllIllIlIIIlllIlIIIIllI);
        final String llllllllllllIllIlIIIlllIlIIIIlIl = toString(llllllllllllIllIlIIIlllIlIIIIIII);
        SpdyCodecUtil.validateHeaderValue(llllllllllllIllIlIIIlllIlIIIIlIl);
        final int llllllllllllIllIlIIIlllIlIIIIlII = hash(llllllllllllIllIlIIIlllIlIIIIllI);
        final int llllllllllllIllIlIIIlllIlIIIIIll = index(llllllllllllIllIlIIIlllIlIIIIlII);
        this.remove0(llllllllllllIllIlIIIlllIlIIIIlII, llllllllllllIllIlIIIlllIlIIIIIll, llllllllllllIllIlIIIlllIlIIIIllI);
        this.add0(llllllllllllIllIlIIIlllIlIIIIlII, llllllllllllIllIlIIIlllIlIIIIIll, llllllllllllIllIlIIIlllIlIIIIllI, llllllllllllIllIlIIIlllIlIIIIlIl);
        return this;
    }
    
    private void remove0(final int llllllllllllIllIlIIIlllIlIIlIlIl, final int llllllllllllIllIlIIIlllIlIIllIIl, final String llllllllllllIllIlIIIlllIlIIllIII) {
        HeaderEntry llllllllllllIllIlIIIlllIlIIlIlll = this.entries[llllllllllllIllIlIIIlllIlIIllIIl];
        if (lIIlIlIlllIllIll(llllllllllllIllIlIIIlllIlIIlIlll)) {
            return;
        }
        while (lIIlIlIlllIllIIl(llllllllllllIllIlIIIlllIlIIlIlll.hash, llllllllllllIllIlIIIlllIlIIlIlIl) && lIIlIlIlllIlllII(eq(llllllllllllIllIlIIIlllIlIIllIII, llllllllllllIllIlIIIlllIlIIlIlll.key) ? 1 : 0)) {
            llllllllllllIllIlIIIlllIlIIlIlll.remove();
            final HeaderEntry llllllllllllIllIlIIIlllIlIIlllIl = llllllllllllIllIlIIIlllIlIIlIlll.next;
            if (!lIIlIlIlllIlllIl(llllllllllllIllIlIIIlllIlIIlllIl)) {
                this.entries[llllllllllllIllIlIIIlllIlIIllIIl] = null;
                return;
            }
            this.entries[llllllllllllIllIlIIIlllIlIIllIIl] = llllllllllllIllIlIIIlllIlIIlllIl;
            llllllllllllIllIlIIIlllIlIIlIlll = llllllllllllIllIlIIIlllIlIIlllIl;
            "".length();
            if ((" ".length() & (" ".length() ^ -" ".length())) > 0) {
                return;
            }
            "".length();
            if (((0xC4 ^ 0x9E) & ~(0x48 ^ 0x12)) > 0) {
                return;
            }
        }
        do {
            final HeaderEntry llllllllllllIllIlIIIlllIlIIlllII = llllllllllllIllIlIIIlllIlIIlIlll.next;
            if (lIIlIlIlllIllIll(llllllllllllIllIlIIIlllIlIIlllII)) {
                "".length();
                if (((0xF ^ 0x5B) & ~(0x2D ^ 0x79)) != 0x0) {
                    return;
                }
            }
            else {
                if (lIIlIlIlllIllIIl(llllllllllllIllIlIIIlllIlIIlllII.hash, llllllllllllIllIlIIIlllIlIIlIlIl) && lIIlIlIlllIlllII(eq(llllllllllllIllIlIIIlllIlIIllIII, llllllllllllIllIlIIIlllIlIIlllII.key) ? 1 : 0)) {
                    llllllllllllIllIlIIIlllIlIIlIlll.next = llllllllllllIllIlIIIlllIlIIlllII.next;
                    llllllllllllIllIlIIIlllIlIIlllII.remove();
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    llllllllllllIllIlIIIlllIlIIlIlll = llllllllllllIllIlIIIlllIlIIlllII;
                }
                "".length();
            }
        } while (" ".length() != -" ".length());
    }
    
    @Override
    public SpdyHeaders add(final String llllllllllllIllIlIIIlllIIIIlIIlI, final Iterable<?> llllllllllllIllIlIIIlllIIIIIllII) {
        SpdyCodecUtil.validateHeaderValue(llllllllllllIllIlIIIlllIIIIlIIlI);
        final int llllllllllllIllIlIIIlllIIIIlIIII = hash(llllllllllllIllIlIIIlllIIIIlIIlI);
        final int llllllllllllIllIlIIIlllIIIIIllll = index(llllllllllllIllIlIIIlllIIIIlIIII);
        final Iterator llllllllllllIllIlIIIlllIIIIlIlII = llllllllllllIllIlIIIlllIIIIIllII.iterator();
        while (lIIlIlIlllIlllII(llllllllllllIllIlIIIlllIIIIlIlII.hasNext() ? 1 : 0)) {
            final Object llllllllllllIllIlIIIlllIIIIlIlIl = llllllllllllIllIlIIIlllIIIIlIlII.next();
            final String llllllllllllIllIlIIIlllIIIIlIllI = toString(llllllllllllIllIlIIIlllIIIIlIlIl);
            SpdyCodecUtil.validateHeaderValue(llllllllllllIllIlIIIlllIIIIlIllI);
            this.add0(llllllllllllIllIlIIIlllIIIIlIIII, llllllllllllIllIlIIIlllIIIIIllll, llllllllllllIllIlIIIlllIIIIlIIlI, llllllllllllIllIlIIIlllIIIIlIllI);
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return this;
    }
    
    @Override
    public Set<String> names() {
        final Set<String> llllllllllllIllIlIIIlllIIIlIIIll = new TreeSet<String>();
        HeaderEntry llllllllllllIllIlIIIlllIIIlIIIlI = this.head.after;
        while (lIIlIlIlllIlllll(llllllllllllIllIlIIIlllIIIlIIIlI, this.head)) {
            llllllllllllIllIlIIIlllIIIlIIIll.add(llllllllllllIllIlIIIlllIIIlIIIlI.key);
            "".length();
            llllllllllllIllIlIIIlllIIIlIIIlI = llllllllllllIllIlIIIlllIIIlIIIlI.after;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return llllllllllllIllIlIIIlllIIIlIIIll;
    }
    
    private void add0(final int llllllllllllIllIlIIIlllIlIlllIII, final int llllllllllllIllIlIIIlllIlIlllllI, final String llllllllllllIllIlIIIlllIlIllIllI, final String llllllllllllIllIlIIIlllIlIllllII) {
        final HeaderEntry llllllllllllIllIlIIIlllIlIlllIll = this.entries[llllllllllllIllIlIIIlllIlIlllllI];
        final HeaderEntry llllllllllllIllIlIIIlllIlIlllIlI = this.entries[llllllllllllIllIlIIIlllIlIlllllI] = new HeaderEntry(llllllllllllIllIlIIIlllIlIlllIII, llllllllllllIllIlIIIlllIlIllIllI, llllllllllllIllIlIIIlllIlIllllII);
        llllllllllllIllIlIIIlllIlIlllIlI.next = llllllllllllIllIlIIIlllIlIlllIll;
        llllllllllllIllIlIIIlllIlIlllIlI.addBefore(this.head);
    }
    
    private static boolean lIIlIlIlllIlIlIl(final int llllllllllllIllIlIIIllIllIlIllII) {
        return llllllllllllIllIlIIIllIllIlIllII >= 0;
    }
    
    private static boolean lIIlIlIlllIlllIl(final Object llllllllllllIllIlIIIllIllIllIllI) {
        return llllllllllllIllIlIIIllIllIllIllI != null;
    }
    
    @Override
    public Iterator<Map.Entry<String, String>> iterator() {
        return new HeaderIterator();
    }
    
    private static int index(final int llllllllllllIllIlIIIlllIlllIIIII) {
        return llllllllllllIllIlIIIlllIlllIIIII % DefaultSpdyHeaders.llIlIlllIlllIl[7];
    }
    
    private static boolean lIIlIlIlllIllIIl(final int llllllllllllIllIlIIIllIlllIIlIIl, final int llllllllllllIllIlIIIllIlllIIlIII) {
        return llllllllllllIllIlIIIllIlllIIlIIl == llllllllllllIllIlIIIllIlllIIlIII;
    }
    
    private final class HeaderIterator implements Iterator<Map.Entry<String, String>>
    {
        private /* synthetic */ HeaderEntry current;
        private static final /* synthetic */ int[] lIIIIIlllIllIl;
        
        private static boolean lIllIllllIlIIlI(final Object lllllllllllllIlIIllIlIlllIIIllll, final Object lllllllllllllIlIIllIlIlllIIIlllI) {
            return lllllllllllllIlIIllIlIlllIIIllll == lllllllllllllIlIIllIlIlllIIIlllI;
        }
        
        private static void lIllIllllIlIIII() {
            (lIIIIIlllIllIl = new int[2])[0] = " ".length();
            HeaderIterator.lIIIIIlllIllIl[1] = ((0xBA ^ 0x96) & ~(0x8 ^ 0x24));
        }
        
        @Override
        public boolean hasNext() {
            int n;
            if (lIllIllllIlIIIl(this.current.after, DefaultSpdyHeaders.this.head)) {
                n = HeaderIterator.lIIIIIlllIllIl[0];
                "".length();
                if (-(0x4C ^ 0x48) >= 0) {
                    return ((0xEE ^ 0xA7) & ~(0x26 ^ 0x6F)) != 0x0;
                }
            }
            else {
                n = HeaderIterator.lIIIIIlllIllIl[1];
            }
            return n != 0;
        }
        
        @Override
        public Map.Entry<String, String> next() {
            this.current = this.current.after;
            if (lIllIllllIlIIlI(this.current, DefaultSpdyHeaders.this.head)) {
                throw new NoSuchElementException();
            }
            return this.current;
        }
        
        static {
            lIllIllllIlIIII();
        }
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
        
        private static boolean lIllIllllIlIIIl(final Object lllllllllllllIlIIllIlIlllIIlIIll, final Object lllllllllllllIlIIllIlIlllIIlIIlI) {
            return lllllllllllllIlIIllIlIlllIIlIIll != lllllllllllllIlIIllIlIlllIIlIIlI;
        }
        
        private HeaderIterator() {
            this.current = DefaultSpdyHeaders.this.head;
        }
    }
    
    private static final class HeaderEntry implements Map.Entry<String, String>
    {
        /* synthetic */ HeaderEntry before;
        /* synthetic */ String value;
        private static final /* synthetic */ String[] lIlllIIlllllIl;
        private static final /* synthetic */ int[] lIlllIIllllllI;
        /* synthetic */ HeaderEntry after;
        /* synthetic */ HeaderEntry next;
        final /* synthetic */ int hash;
        final /* synthetic */ String key;
        
        static {
            lIIIIIlIIllIIIll();
            lIIIIIlIIllIIIlI();
        }
        
        private static boolean lIIIIIlIIllIIlIl(final int llllllllllllIlllllIIIllIIIIllllI, final int llllllllllllIlllllIIIllIIIIlllIl) {
            return llllllllllllIlllllIIIllIIIIllllI < llllllllllllIlllllIIIllIIIIlllIl;
        }
        
        void addBefore(final HeaderEntry llllllllllllIlllllIIIllIIlIllIIl) {
            this.after = llllllllllllIlllllIIIllIIlIllIIl;
            this.before = llllllllllllIlllllIIIllIIlIllIIl.before;
            this.before.after = this;
            this.after.before = this;
        }
        
        private static String lIIIIIlIIllIIIIl(String llllllllllllIlllllIIIllIIIlIlIIl, final String llllllllllllIlllllIIIllIIIlIllIl) {
            llllllllllllIlllllIIIllIIIlIlIIl = new String(Base64.getDecoder().decode(llllllllllllIlllllIIIllIIIlIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlllllIIIllIIIlIllII = new StringBuilder();
            final char[] llllllllllllIlllllIIIllIIIlIlIll = llllllllllllIlllllIIIllIIIlIllIl.toCharArray();
            int llllllllllllIlllllIIIllIIIlIlIlI = HeaderEntry.lIlllIIllllllI[0];
            final String llllllllllllIlllllIIIllIIIlIIlII = (Object)llllllllllllIlllllIIIllIIIlIlIIl.toCharArray();
            final long llllllllllllIlllllIIIllIIIlIIIll = llllllllllllIlllllIIIllIIIlIIlII.length;
            byte llllllllllllIlllllIIIllIIIlIIIlI = (byte)HeaderEntry.lIlllIIllllllI[0];
            while (lIIIIIlIIllIIlIl(llllllllllllIlllllIIIllIIIlIIIlI, (int)llllllllllllIlllllIIIllIIIlIIIll)) {
                final char llllllllllllIlllllIIIllIIIlIllll = llllllllllllIlllllIIIllIIIlIIlII[llllllllllllIlllllIIIllIIIlIIIlI];
                llllllllllllIlllllIIIllIIIlIllII.append((char)(llllllllllllIlllllIIIllIIIlIllll ^ llllllllllllIlllllIIIllIIIlIlIll[llllllllllllIlllllIIIllIIIlIlIlI % llllllllllllIlllllIIIllIIIlIlIll.length]));
                "".length();
                ++llllllllllllIlllllIIIllIIIlIlIlI;
                ++llllllllllllIlllllIIIllIIIlIIIlI;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlllllIIIllIIIlIllII);
        }
        
        private static void lIIIIIlIIllIIIll() {
            (lIlllIIllllllI = new int[3])[0] = ((0x3D ^ 0x73) & ~(0x61 ^ 0x2F));
            HeaderEntry.lIlllIIllllllI[1] = (0x35 ^ 0x8);
            HeaderEntry.lIlllIIllllllI[2] = " ".length();
        }
        
        private static void lIIIIIlIIllIIIlI() {
            (lIlllIIlllllIl = new String[HeaderEntry.lIlllIIllllllI[2]])[HeaderEntry.lIlllIIllllllI[0]] = lIIIIIlIIllIIIIl("HTkPHj0=", "kXckX");
        }
        
        HeaderEntry(final int llllllllllllIlllllIIIllIIllIIIlI, final String llllllllllllIlllllIIIllIIllIIlIl, final String llllllllllllIlllllIIIllIIllIIlII) {
            this.hash = llllllllllllIlllllIIIllIIllIIIlI;
            this.key = llllllllllllIlllllIIIllIIllIIlIl;
            this.value = llllllllllllIlllllIIIllIIllIIlII;
        }
        
        @Override
        public String getKey() {
            return this.key;
        }
        
        @Override
        public String setValue(final String llllllllllllIlllllIIIllIIlIIllII) {
            if (lIIIIIlIIllIIlII(llllllllllllIlllllIIIllIIlIIllII)) {
                throw new NullPointerException(HeaderEntry.lIlllIIlllllIl[HeaderEntry.lIlllIIllllllI[0]]);
            }
            SpdyCodecUtil.validateHeaderValue(llllllllllllIlllllIIIllIIlIIllII);
            final String llllllllllllIlllllIIIllIIlIIlIll = this.value;
            this.value = llllllllllllIlllllIIIllIIlIIllII;
            return llllllllllllIlllllIIIllIIlIIlIll;
        }
        
        @Override
        public String toString() {
            return String.valueOf(new StringBuilder().append(this.key).append((char)HeaderEntry.lIlllIIllllllI[1]).append(this.value));
        }
        
        @Override
        public String getValue() {
            return this.value;
        }
        
        private static boolean lIIIIIlIIllIIlII(final Object llllllllllllIlllllIIIllIIIIllIll) {
            return llllllllllllIlllllIIIllIIIIllIll == null;
        }
        
        void remove() {
            this.before.after = this.after;
            this.after.before = this.before;
        }
    }
}
