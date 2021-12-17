// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Collections;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Set;

public class DefaultCookie implements Cookie
{
    private /* synthetic */ String value;
    private /* synthetic */ String domain;
    private /* synthetic */ Set<Integer> ports;
    private /* synthetic */ int version;
    private static final /* synthetic */ String[] lIlIlllIIllIIl;
    private /* synthetic */ String path;
    private /* synthetic */ boolean secure;
    private /* synthetic */ String commentUrl;
    private /* synthetic */ long maxAge;
    private /* synthetic */ boolean discard;
    private static final /* synthetic */ int[] lIlIlllIIllllI;
    private /* synthetic */ String comment;
    private /* synthetic */ Set<Integer> unmodifiablePorts;
    private /* synthetic */ boolean httpOnly;
    private final /* synthetic */ String name;
    
    @Override
    public void setPath(final String lllllllllllllIIIIlIllIlIIlIlllll) {
        this.path = validateValue(DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[9]], lllllllllllllIIIIlIllIlIIlIlllll);
    }
    
    private static boolean llllIIlllIIlllI(final Object lllllllllllllIIIIlIllIIllIIIlIIl) {
        return lllllllllllllIIIIlIllIIllIIIlIIl != null;
    }
    
    private static void llllIIlllIIIIll() {
        (lIlIlllIIllIIl = new String[DefaultCookie.lIlIlllIIllllI[28]])[DefaultCookie.lIlIlllIIllllI[0]] = llllIIllIllllII("k6Df++Neiqg=", "UUaPX");
        DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[1]] = llllIIllIllllIl("DggTGwNLCwICHw==", "kecoz");
        DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[3]] = llllIIllIllllIl("Gw40A0IWADcSAxwBKkYMGgF0BxEWBjBGAR0OKwcBAQorXEI=", "uoYfb");
        DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[4]] = llllIIllIlllllI("+he13hybLRc77KmD1zTE7uZt+lfvM0uwgYXElUSqKJ3KgckkVB+tkXOQqB+w1bdATvUUKUMXDPP0oDoSJJLyM5gVIjuvkBkkG2j/ehmOSo8=", "Jvkxl");
        DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[6]] = llllIIllIllllII("92SEsaS0R5EAUZ4b87ceyWHDbzuBXK8FPYRPQVZXMDzchLM3o7aX5g==", "jBfZS");
        DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[7]] = llllIIllIllllIl("ACc8PSo=", "vFPHO");
        DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[8]] = llllIIllIlllllI("eMRDOjEBRSY=", "YrBRT");
        DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[9]] = llllIIllIllllIl("FC8VDg==", "dNafd");
        DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[10]] = llllIIllIllllIl("ETo0PTUcIQ==", "rUYPP");
        DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[11]] = llllIIllIllllII("xP88rTJDC+k5DoDySReODA==", "WbvlR");
        DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[12]] = llllIIllIllllIl("GzwwGBc=", "kSBld");
        DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[14]] = llllIIllIllllIl("JCMrP1M7OS1rHDJsKyodMyljaw==", "TLYKs");
        DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[15]] = llllIIllIllllII("E6Th23oDeNPW4BM0VKt8gIVORnhIX9eK", "chNMu");
        DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[18]] = llllIIllIllllII("KRfu+AAsEE0hT9WPcdks2w==", "TxSQZ");
        DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[19]] = llllIIllIllllII("gR2RFbY48mw=", "jEaRz");
        DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[20]] = llllIIllIllllII("IAsaP8U8DbEJsCMD7tM7vQ==", "YpIvp");
        DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[21]] = llllIIllIllllIl("WmY1FD03IT1I", "vFXuE");
        DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[23]] = llllIIllIlllllI("/zlvuaEuVl3AkFzWPxM9HQ==", "kvpor");
        DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[24]] = llllIIllIllllII("m03BxaQ7hp77p2Axj/TYxg==", "lQELF");
        DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[25]] = llllIIllIllllII("pP1emsXVCmQltqziwPPOdjBc7UiG76voXYRCkv8niK4Ys+dhjyhPt6VonLICEVGRRh34k1t0u54=", "ygdQx");
        DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[26]] = llllIIllIllllIl("XhUTMBg5Lz0aVk0=", "eIalv");
    }
    
    @Override
    public void setDiscard(final boolean lllllllllllllIIIIlIllIlIIlIIIlII) {
        this.discard = lllllllllllllIIIIlIllIlIIlIIIlII;
    }
    
    private static void llllIIlllIIIllI() {
        (lIlIlllIIllllI = new int[29])[0] = ((45 + 155 - 157 + 192 ^ 159 + 46 - 101 + 95) & (145 + 97 - 48 + 40 ^ 113 + 24 + 19 + 42 ^ -" ".length()));
        DefaultCookie.lIlIlllIIllllI[1] = " ".length();
        DefaultCookie.lIlIlllIIllllI[2] = 21 + 67 - 2 + 41;
        DefaultCookie.lIlIlllIIllllI[3] = "  ".length();
        DefaultCookie.lIlIlllIIllllI[4] = "   ".length();
        DefaultCookie.lIlIlllIIllllI[5] = (7 + 131 - 95 + 96 ^ 68 + 72 - 104 + 139);
        DefaultCookie.lIlIlllIIllllI[6] = (0x27 ^ 0x3C ^ (0x95 ^ 0x8A));
        DefaultCookie.lIlIlllIIllllI[7] = (0x74 ^ 0x71);
        DefaultCookie.lIlIlllIIllllI[8] = (0x20 ^ 0x26);
        DefaultCookie.lIlIlllIIllllI[9] = (0xA ^ 0x6E ^ (0xF0 ^ 0x93));
        DefaultCookie.lIlIlllIIllllI[10] = (0x13 ^ 0x1B);
        DefaultCookie.lIlIlllIIllllI[11] = (0xDD ^ 0xBA ^ (0xF4 ^ 0x9A));
        DefaultCookie.lIlIlllIIllllI[12] = (0xB7 ^ 0xBD);
        DefaultCookie.lIlIlllIIllllI[13] = (-" ".length() & (-1 & 0xFFFF));
        DefaultCookie.lIlIlllIIllllI[14] = (0x86 ^ 0x8D);
        DefaultCookie.lIlIlllIIllllI[15] = (0x47 ^ 0x6E ^ (0x9C ^ 0xB9));
        DefaultCookie.lIlIlllIIllllI[16] = -" ".length();
        DefaultCookie.lIlIlllIIllllI[17] = (0x46 ^ 0x7B);
        DefaultCookie.lIlIlllIIllllI[18] = (0x93 ^ 0x9E);
        DefaultCookie.lIlIlllIIllllI[19] = (0x59 ^ 0x57);
        DefaultCookie.lIlIlllIIllllI[20] = (0xA2 ^ 0xAD);
        DefaultCookie.lIlIlllIIllllI[21] = (0xC4 ^ 0xA6 ^ (0x77 ^ 0x5));
        DefaultCookie.lIlIlllIIllllI[22] = (158 + 13 - 8 + 14 ^ 151 + 149 - 140 + 34);
        DefaultCookie.lIlIlllIIllllI[23] = (36 + 100 - 128 + 139 ^ 44 + 18 + 30 + 38);
        DefaultCookie.lIlIlllIIllllI[24] = (0xA ^ 0x18);
        DefaultCookie.lIlIlllIIllllI[25] = (0x5E ^ 0x4D);
        DefaultCookie.lIlIlllIIllllI[26] = (0xBC ^ 0xA8);
        DefaultCookie.lIlIlllIIllllI[27] = (0xA2 ^ 0x8B);
        DefaultCookie.lIlIlllIIllllI[28] = (0x17 ^ 0x2);
    }
    
    private static boolean llllIIlllIIlIIl(final int lllllllllllllIIIIlIllIIllIIlIIII, final int lllllllllllllIIIIlIllIIllIIIllll) {
        return lllllllllllllIIIIlIllIIllIIlIIII < lllllllllllllIIIIlIllIIllIIIllll;
    }
    
    static {
        llllIIlllIIIllI();
        llllIIlllIIIIll();
    }
    
    @Override
    public String getComment() {
        return this.comment;
    }
    
    private static String llllIIllIllllII(final String lllllllllllllIIIIlIllIIllIIlllII, final String lllllllllllllIIIIlIllIIllIIllIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIllIIllIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIllIIllIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIlIllIIllIIllllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIlIllIIllIIllllI.init(DefaultCookie.lIlIlllIIllllI[3], lllllllllllllIIIIlIllIIllIIlllll);
            return new String(lllllllllllllIIIIlIllIIllIIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIllIIllIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIllIIllIIlllIl) {
            lllllllllllllIIIIlIllIIllIIlllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIIlllIIlIlI(final int lllllllllllllIIIIlIllIIllIIIllII, final int lllllllllllllIIIIlIllIIllIIIlIll) {
        return lllllllllllllIIIIlIllIIllIIIllII > lllllllllllllIIIIlIllIIllIIIlIll;
    }
    
    @Override
    public boolean isHttpOnly() {
        return this.httpOnly;
    }
    
    @Override
    public void setHttpOnly(final boolean lllllllllllllIIIIlIllIIlllllIllI) {
        this.httpOnly = lllllllllllllIIIIlIllIIlllllIllI;
    }
    
    @Override
    public void setDomain(final String lllllllllllllIIIIlIllIlIIllIlIlI) {
        this.domain = validateValue(DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[8]], lllllllllllllIIIIlIllIlIIllIlIlI);
    }
    
    @Override
    public int compareTo(final Cookie lllllllllllllIIIIlIllIIllllIIlIl) {
        int lllllllllllllIIIIlIllIIllllIIlII = this.getName().compareToIgnoreCase(lllllllllllllIIIIlIllIIllllIIlIl.getName());
        if (llllIIlllIIlIII(lllllllllllllIIIIlIllIIllllIIlII)) {
            return lllllllllllllIIIIlIllIIllllIIlII;
        }
        if (llllIIlllIIIlll(this.getPath())) {
            if (llllIIlllIIlllI(lllllllllllllIIIIlIllIIllllIIlIl.getPath())) {
                return DefaultCookie.lIlIlllIIllllI[16];
            }
        }
        else {
            if (llllIIlllIIIlll(lllllllllllllIIIIlIllIIllllIIlIl.getPath())) {
                return DefaultCookie.lIlIlllIIllllI[1];
            }
            lllllllllllllIIIIlIllIIllllIIlII = this.getPath().compareTo(lllllllllllllIIIIlIllIIllllIIlIl.getPath());
            if (llllIIlllIIlIII(lllllllllllllIIIIlIllIIllllIIlII)) {
                return lllllllllllllIIIIlIllIIllllIIlII;
            }
        }
        if (llllIIlllIIIlll(this.getDomain())) {
            if (llllIIlllIIlllI(lllllllllllllIIIIlIllIIllllIIlIl.getDomain())) {
                return DefaultCookie.lIlIlllIIllllI[16];
            }
            return DefaultCookie.lIlIlllIIllllI[0];
        }
        else {
            if (llllIIlllIIIlll(lllllllllllllIIIIlIllIIllllIIlIl.getDomain())) {
                return DefaultCookie.lIlIlllIIllllI[1];
            }
            lllllllllllllIIIIlIllIIllllIIlII = this.getDomain().compareToIgnoreCase(lllllllllllllIIIIlIllIIllllIIlIl.getDomain());
            return lllllllllllllIIIIlIllIIllllIIlII;
        }
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    public DefaultCookie(String lllllllllllllIIIIlIllIlIlIIIIIII, final String lllllllllllllIIIIlIllIlIlIIIIIlI) {
        this.ports = Collections.emptySet();
        this.unmodifiablePorts = this.ports;
        this.maxAge = Long.MIN_VALUE;
        if (llllIIlllIIIlll(lllllllllllllIIIIlIllIlIlIIIIIII)) {
            throw new NullPointerException(DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[0]]);
        }
        lllllllllllllIIIIlIllIlIlIIIIIII = lllllllllllllIIIIlIllIlIlIIIIIII.trim();
        if (llllIIlllIIlIII(lllllllllllllIIIIlIllIlIlIIIIIII.isEmpty() ? 1 : 0)) {
            throw new IllegalArgumentException(DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[1]]);
        }
        int lllllllllllllIIIIlIllIlIlIIIIlIl = DefaultCookie.lIlIlllIIllllI[0];
        while (llllIIlllIIlIIl(lllllllllllllIIIIlIllIlIlIIIIlIl, lllllllllllllIIIIlIllIlIlIIIIIII.length())) {
            final char lllllllllllllIIIIlIllIlIlIIIIllI = lllllllllllllIIIIlIllIlIlIIIIIII.charAt(lllllllllllllIIIIlIllIlIlIIIIlIl);
            if (llllIIlllIIlIlI(lllllllllllllIIIIlIllIlIlIIIIllI, DefaultCookie.lIlIlllIIllllI[2])) {
                throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[3]]).append(lllllllllllllIIIIlIllIlIlIIIIIII)));
            }
            switch (lllllllllllllIIIIlIllIlIlIIIIllI) {
                case '\t':
                case '\n':
                case '\u000b':
                case '\f':
                case '\r':
                case ' ':
                case ',':
                case ';':
                case '=': {
                    throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[4]]).append(lllllllllllllIIIIlIllIlIlIIIIIII)));
                }
                default: {
                    ++lllllllllllllIIIIlIllIlIlIIIIlIl;
                    "".length();
                    if (null != null) {
                        throw null;
                    }
                    continue;
                }
            }
        }
        if (llllIIlllIIlIll(lllllllllllllIIIIlIllIlIlIIIIIII.charAt(DefaultCookie.lIlIlllIIllllI[0]), DefaultCookie.lIlIlllIIllllI[5])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[6]]).append(lllllllllllllIIIIlIllIlIlIIIIIII)));
        }
        this.name = lllllllllllllIIIIlIllIlIlIIIIIII;
        this.setValue(lllllllllllllIIIIlIllIlIlIIIIIlI);
    }
    
    @Override
    public void setPorts(final int... lllllllllllllIIIIlIllIlIIIlIllll) {
        if (llllIIlllIIIlll(lllllllllllllIIIIlIllIlIIIlIllll)) {
            throw new NullPointerException(DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[12]]);
        }
        final int[] lllllllllllllIIIIlIllIlIIIllIIIl = lllllllllllllIIIIlIllIlIIIlIllll.clone();
        if (llllIIlllIIllII(lllllllllllllIIIIlIllIlIIIllIIIl.length)) {
            final Set<Integer> emptySet = Collections.emptySet();
            this.ports = emptySet;
            this.unmodifiablePorts = emptySet;
            "".length();
            if (-" ".length() > (0x1E ^ 0x1A)) {
                return;
            }
        }
        else {
            final Set<Integer> lllllllllllllIIIIlIllIlIIIllIlII = new TreeSet<Integer>();
            final int[] lllllllllllllIIIIlIllIlIIIllIlll = lllllllllllllIIIIlIllIlIIIllIIIl;
            final int lllllllllllllIIIIlIllIlIIIllIllI = lllllllllllllIIIIlIllIlIIIllIlll.length;
            int lllllllllllllIIIIlIllIlIIIllIlIl = DefaultCookie.lIlIlllIIllllI[0];
            while (llllIIlllIIlIIl(lllllllllllllIIIIlIllIlIIIllIlIl, lllllllllllllIIIIlIllIlIIIllIllI)) {
                final int lllllllllllllIIIIlIllIlIIIlllIII = lllllllllllllIIIIlIllIlIIIllIlll[lllllllllllllIIIIlIllIlIIIllIlIl];
                if (!llllIIlllIIllIl(lllllllllllllIIIIlIllIlIIIlllIII) || llllIIlllIIlIlI(lllllllllllllIIIIlIllIlIIIlllIII, DefaultCookie.lIlIlllIIllllI[13])) {
                    throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[14]]).append(lllllllllllllIIIIlIllIlIIIlllIII)));
                }
                lllllllllllllIIIIlIllIlIIIllIlII.add(lllllllllllllIIIIlIllIlIIIlllIII);
                "".length();
                ++lllllllllllllIIIIlIllIlIIIllIlIl;
                "".length();
                if (((0x36 ^ 0x0) & ~(0x67 ^ 0x51)) != 0x0) {
                    return;
                }
            }
            this.ports = lllllllllllllIIIIlIllIlIIIllIlII;
            this.unmodifiablePorts = null;
        }
    }
    
    private static boolean llllIIlllIIlIII(final int lllllllllllllIIIIlIllIIllIIIIlIl) {
        return lllllllllllllIIIIlIllIIllIIIIlIl != 0;
    }
    
    @Override
    public void setPorts(final Iterable<Integer> lllllllllllllIIIIlIllIlIIIIlllIl) {
        final Set<Integer> lllllllllllllIIIIlIllIlIIIIlllll = new TreeSet<Integer>();
        final Iterator lllllllllllllIIIIlIllIlIIIlIIIlI = lllllllllllllIIIIlIllIlIIIIlllIl.iterator();
        while (llllIIlllIIlIII(lllllllllllllIIIIlIllIlIIIlIIIlI.hasNext() ? 1 : 0)) {
            final int lllllllllllllIIIIlIllIlIIIlIIIll = lllllllllllllIIIIlIllIlIIIlIIIlI.next();
            if (!llllIIlllIIllIl(lllllllllllllIIIIlIllIlIIIlIIIll) || llllIIlllIIlIlI(lllllllllllllIIIIlIllIlIIIlIIIll, DefaultCookie.lIlIlllIIllllI[13])) {
                throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[15]]).append(lllllllllllllIIIIlIllIlIIIlIIIll)));
            }
            lllllllllllllIIIIlIllIlIIIIlllll.add(lllllllllllllIIIIlIllIlIIIlIIIll);
            "".length();
            "".length();
            if ("   ".length() <= "  ".length()) {
                return;
            }
        }
        if (llllIIlllIIlIII(lllllllllllllIIIIlIllIlIIIIlllll.isEmpty() ? 1 : 0)) {
            final Set<Integer> emptySet = Collections.emptySet();
            this.ports = emptySet;
            this.unmodifiablePorts = emptySet;
            "".length();
            if (-" ".length() > "  ".length()) {
                return;
            }
        }
        else {
            this.ports = lllllllllllllIIIIlIllIlIIIIlllll;
            this.unmodifiablePorts = null;
        }
    }
    
    @Override
    public int getVersion() {
        return this.version;
    }
    
    @Override
    public void setVersion(final int lllllllllllllIIIIlIllIlIIIIIlIlI) {
        this.version = lllllllllllllIIIIlIllIlIIIIIlIlI;
    }
    
    @Override
    public void setMaxAge(final long lllllllllllllIIIIlIllIlIIIIlIIIl) {
        this.maxAge = lllllllllllllIIIIlIllIlIIIIlIIIl;
    }
    
    private static boolean llllIIlllIIlIll(final int lllllllllllllIIIIlIllIIllIIlIlII, final int lllllllllllllIIIIlIllIIllIIlIIll) {
        return lllllllllllllIIIIlIllIIllIIlIlII == lllllllllllllIIIIlIllIIllIIlIIll;
    }
    
    @Override
    public String getPath() {
        return this.path;
    }
    
    @Override
    public String getValue() {
        return this.value;
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIIIIlIllIIllllIlllI) {
        if (llllIIlllIIllII((lllllllllllllIIIIlIllIIllllIlllI instanceof Cookie) ? 1 : 0)) {
            return DefaultCookie.lIlIlllIIllllI[0] != 0;
        }
        final Cookie lllllllllllllIIIIlIllIIllllIllIl = (Cookie)lllllllllllllIIIIlIllIIllllIlllI;
        if (llllIIlllIIllII(this.getName().equalsIgnoreCase(lllllllllllllIIIIlIllIIllllIllIl.getName()) ? 1 : 0)) {
            return DefaultCookie.lIlIlllIIllllI[0] != 0;
        }
        if (llllIIlllIIIlll(this.getPath())) {
            if (llllIIlllIIlllI(lllllllllllllIIIIlIllIIllllIllIl.getPath())) {
                return DefaultCookie.lIlIlllIIllllI[0] != 0;
            }
        }
        else {
            if (llllIIlllIIIlll(lllllllllllllIIIIlIllIIllllIllIl.getPath())) {
                return DefaultCookie.lIlIlllIIllllI[0] != 0;
            }
            if (llllIIlllIIllII(this.getPath().equals(lllllllllllllIIIIlIllIIllllIllIl.getPath()) ? 1 : 0)) {
                return DefaultCookie.lIlIlllIIllllI[0] != 0;
            }
        }
        if (llllIIlllIIIlll(this.getDomain())) {
            if (llllIIlllIIlllI(lllllllllllllIIIIlIllIIllllIllIl.getDomain())) {
                return DefaultCookie.lIlIlllIIllllI[0] != 0;
            }
            return DefaultCookie.lIlIlllIIllllI[1] != 0;
        }
        else {
            if (llllIIlllIIIlll(lllllllllllllIIIIlIllIIllllIllIl.getDomain())) {
                return DefaultCookie.lIlIlllIIllllI[0] != 0;
            }
            return this.getDomain().equalsIgnoreCase(lllllllllllllIIIIlIllIIllllIllIl.getDomain());
        }
    }
    
    private static boolean llllIIlllIIllIl(final int lllllllllllllIIIIlIllIIlIllllllI) {
        return lllllllllllllIIIIlIllIIlIllllllI > 0;
    }
    
    private static String llllIIllIlllllI(final String lllllllllllllIIIIlIllIIllIllllll, final String lllllllllllllIIIIlIllIIllIlllllI) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIllIIlllIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIllIIllIlllllI.getBytes(StandardCharsets.UTF_8)), DefaultCookie.lIlIlllIIllllI[10]), "DES");
            final Cipher lllllllllllllIIIIlIllIIlllIIIIll = Cipher.getInstance("DES");
            lllllllllllllIIIIlIllIIlllIIIIll.init(DefaultCookie.lIlIlllIIllllI[3], lllllllllllllIIIIlIllIIlllIIIlII);
            return new String(lllllllllllllIIIIlIllIIlllIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIllIIllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIllIIlllIIIIlI) {
            lllllllllllllIIIIlIllIIlllIIIIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public long getMaxAge() {
        return this.maxAge;
    }
    
    private static int llllIIlllIIllll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public void setSecure(final boolean lllllllllllllIIIIlIllIlIIIIIIIIl) {
        this.secure = lllllllllllllIIIIlIllIlIIIIIIIIl;
    }
    
    @Override
    public Set<Integer> getPorts() {
        if (llllIIlllIIIlll(this.unmodifiablePorts)) {
            this.unmodifiablePorts = Collections.unmodifiableSet((Set<? extends Integer>)this.ports);
        }
        return this.unmodifiablePorts;
    }
    
    @Override
    public void setCommentUrl(final String lllllllllllllIIIIlIllIlIIlIIllIl) {
        this.commentUrl = validateValue(DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[11]], lllllllllllllIIIIlIllIlIIlIIllIl);
    }
    
    private static String validateValue(final String lllllllllllllIIIIlIllIIlllIlIIlI, String lllllllllllllIIIIlIllIIlllIlIIIl) {
        if (llllIIlllIIIlll(lllllllllllllIIIIlIllIIlllIlIIIl)) {
            return null;
        }
        lllllllllllllIIIIlIllIIlllIlIIIl = lllllllllllllIIIIlIllIIlllIlIIIl.trim();
        if (llllIIlllIIlIII(lllllllllllllIIIIlIllIIlllIlIIIl.isEmpty() ? 1 : 0)) {
            return null;
        }
        int lllllllllllllIIIIlIllIIlllIlIlIl = DefaultCookie.lIlIlllIIllllI[0];
        while (llllIIlllIIlIIl(lllllllllllllIIIIlIllIIlllIlIlIl, lllllllllllllIIIIlIllIIlllIlIIIl.length())) {
            final char lllllllllllllIIIIlIllIIlllIlIllI = lllllllllllllIIIIlIllIIlllIlIIIl.charAt(lllllllllllllIIIIlIllIIlllIlIlIl);
            switch (lllllllllllllIIIIlIllIIlllIlIllI) {
                case '\n':
                case '\u000b':
                case '\f':
                case '\r':
                case ';': {
                    throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(lllllllllllllIIIIlIllIIlllIlIIlI).append(DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[25]]).append(DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[26]]).append(lllllllllllllIIIIlIllIIlllIlIIIl).append((char)DefaultCookie.lIlIlllIIllllI[27])));
                }
                default: {
                    ++lllllllllllllIIIIlIllIIlllIlIlIl;
                    "".length();
                    if ("  ".length() == " ".length()) {
                        return null;
                    }
                    continue;
                }
            }
        }
        return lllllllllllllIIIIlIllIIlllIlIIIl;
    }
    
    @Override
    public boolean isDiscard() {
        return this.discard;
    }
    
    @Override
    public String getDomain() {
        return this.domain;
    }
    
    private static boolean llllIIlllIIIlll(final Object lllllllllllllIIIIlIllIIllIIIIlll) {
        return lllllllllllllIIIIlIllIIllIIIIlll == null;
    }
    
    @Override
    public String getCommentUrl() {
        return this.commentUrl;
    }
    
    private static String llllIIllIllllIl(String lllllllllllllIIIIlIllIIllIlIllII, final String lllllllllllllIIIIlIllIIllIllIIII) {
        lllllllllllllIIIIlIllIIllIlIllII = new String(Base64.getDecoder().decode(lllllllllllllIIIIlIllIIllIlIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlIllIIllIlIllll = new StringBuilder();
        final char[] lllllllllllllIIIIlIllIIllIlIlllI = lllllllllllllIIIIlIllIIllIllIIII.toCharArray();
        int lllllllllllllIIIIlIllIIllIlIllIl = DefaultCookie.lIlIlllIIllllI[0];
        final long lllllllllllllIIIIlIllIIllIlIIlll = (Object)lllllllllllllIIIIlIllIIllIlIllII.toCharArray();
        final long lllllllllllllIIIIlIllIIllIlIIllI = lllllllllllllIIIIlIllIIllIlIIlll.length;
        char lllllllllllllIIIIlIllIIllIlIIlIl = (char)DefaultCookie.lIlIlllIIllllI[0];
        while (llllIIlllIIlIIl(lllllllllllllIIIIlIllIIllIlIIlIl, (int)lllllllllllllIIIIlIllIIllIlIIllI)) {
            final char lllllllllllllIIIIlIllIIllIllIIlI = lllllllllllllIIIIlIllIIllIlIIlll[lllllllllllllIIIIlIllIIllIlIIlIl];
            lllllllllllllIIIIlIllIIllIlIllll.append((char)(lllllllllllllIIIIlIllIIllIllIIlI ^ lllllllllllllIIIIlIllIIllIlIlllI[lllllllllllllIIIIlIllIIllIlIllIl % lllllllllllllIIIIlIllIIllIlIlllI.length]));
            "".length();
            ++lllllllllllllIIIIlIllIIllIlIllIl;
            ++lllllllllllllIIIIlIllIIllIlIIlIl;
            "".length();
            if (-" ".length() > (122 + 112 - 183 + 98 ^ 93 + 125 - 185 + 112)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlIllIIllIlIllll);
    }
    
    @Override
    public void setValue(final String lllllllllllllIIIIlIllIlIIlllIIll) {
        if (llllIIlllIIIlll(lllllllllllllIIIIlIllIlIIlllIIll)) {
            throw new NullPointerException(DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[7]]);
        }
        this.value = lllllllllllllIIIIlIllIlIIlllIIll;
    }
    
    @Override
    public String toString() {
        final StringBuilder lllllllllllllIIIIlIllIIlllIlllIl = new StringBuilder();
        lllllllllllllIIIIlIllIIlllIlllIl.append(this.getName());
        "".length();
        lllllllllllllIIIIlIllIIlllIlllIl.append((char)DefaultCookie.lIlIlllIIllllI[17]);
        "".length();
        lllllllllllllIIIIlIllIIlllIlllIl.append(this.getValue());
        "".length();
        if (llllIIlllIIlllI(this.getDomain())) {
            lllllllllllllIIIIlIllIIlllIlllIl.append(DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[18]]);
            "".length();
            lllllllllllllIIIIlIllIIlllIlllIl.append(this.getDomain());
            "".length();
        }
        if (llllIIlllIIlllI(this.getPath())) {
            lllllllllllllIIIIlIllIIlllIlllIl.append(DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[19]]);
            "".length();
            lllllllllllllIIIIlIllIIlllIlllIl.append(this.getPath());
            "".length();
        }
        if (llllIIlllIIlllI(this.getComment())) {
            lllllllllllllIIIIlIllIIlllIlllIl.append(DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[20]]);
            "".length();
            lllllllllllllIIIIlIllIIlllIlllIl.append(this.getComment());
            "".length();
        }
        if (llllIIlllIlIIII(llllIIlllIIllll(this.getMaxAge(), 0L))) {
            lllllllllllllIIIIlIllIIlllIlllIl.append(DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[21]]);
            "".length();
            lllllllllllllIIIIlIllIIlllIlllIl.append(this.getMaxAge());
            "".length();
            lllllllllllllIIIIlIllIIlllIlllIl.append((char)DefaultCookie.lIlIlllIIllllI[22]);
            "".length();
        }
        if (llllIIlllIIlIII(this.isSecure() ? 1 : 0)) {
            lllllllllllllIIIIlIllIIlllIlllIl.append(DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[23]]);
            "".length();
        }
        if (llllIIlllIIlIII(this.isHttpOnly() ? 1 : 0)) {
            lllllllllllllIIIIlIllIIlllIlllIl.append(DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[24]]);
            "".length();
        }
        return String.valueOf(lllllllllllllIIIIlIllIIlllIlllIl);
    }
    
    @Override
    public void setComment(final String lllllllllllllIIIIlIllIlIIlIllIII) {
        this.comment = validateValue(DefaultCookie.lIlIlllIIllIIl[DefaultCookie.lIlIlllIIllllI[10]], lllllllllllllIIIIlIllIlIIlIllIII);
    }
    
    private static boolean llllIIlllIIllII(final int lllllllllllllIIIIlIllIIllIIIIIll) {
        return lllllllllllllIIIIlIllIIllIIIIIll == 0;
    }
    
    @Override
    public int hashCode() {
        return this.getName().hashCode();
    }
    
    @Override
    public boolean isSecure() {
        return this.secure;
    }
    
    private static boolean llllIIlllIlIIII(final int lllllllllllllIIIIlIllIIllIIIIIIl) {
        return lllllllllllllIIIIlIllIIllIIIIIIl >= 0;
    }
}
