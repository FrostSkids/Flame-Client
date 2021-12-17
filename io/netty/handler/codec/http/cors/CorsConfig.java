// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.cors;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Date;
import java.util.Arrays;
import io.netty.util.internal.StringUtil;
import java.util.Iterator;
import io.netty.handler.codec.http.DefaultHttpHeaders;
import io.netty.handler.codec.http.HttpHeaders;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Collections;
import io.netty.handler.codec.http.HttpMethod;
import java.util.concurrent.Callable;
import java.util.Map;
import java.util.Set;

public final class CorsConfig
{
    private final /* synthetic */ Set<String> origins;
    private final /* synthetic */ Set<String> allowedRequestHeaders;
    private static final /* synthetic */ int[] lIlIIlIIIIlIll;
    private final /* synthetic */ Set<String> exposeHeaders;
    private final /* synthetic */ Map<CharSequence, Callable<?>> preflightHeaders;
    private final /* synthetic */ boolean allowNullOrigin;
    private final /* synthetic */ Set<HttpMethod> allowedRequestMethods;
    private final /* synthetic */ boolean anyOrigin;
    private final /* synthetic */ boolean shortCurcuit;
    private final /* synthetic */ long maxAge;
    private final /* synthetic */ boolean enabled;
    private static final /* synthetic */ String[] lIlIIlIIIIlIlI;
    private final /* synthetic */ boolean allowCredentials;
    
    public boolean isNullOriginAllowed() {
        return this.allowNullOrigin;
    }
    
    public Set<String> exposedHeaders() {
        return Collections.unmodifiableSet((Set<? extends String>)this.exposeHeaders);
    }
    
    public static Builder withAnyOrigin() {
        return new Builder();
    }
    
    private static boolean lllIIlIIlllIlll(final int lllllllllllllIIIlllIIllIIIlIIIlI) {
        return lllllllllllllIIIlllIIllIIIlIIIlI != 0;
    }
    
    public String origin() {
        String s;
        if (lllIIlIIlllIlll(this.origins.isEmpty() ? 1 : 0)) {
            s = CorsConfig.lIlIIlIIIIlIlI[CorsConfig.lIlIIlIIIIlIll[0]];
            "".length();
            if ("   ".length() == ((0x77 ^ 0x57) & ~(0x13 ^ 0x33))) {
                return null;
            }
        }
        else {
            s = this.origins.iterator().next();
        }
        return s;
    }
    
    public Set<String> origins() {
        return this.origins;
    }
    
    private static boolean lllIIlIIllllIII(final int lllllllllllllIIIlllIIllIIIlIIlIl, final int lllllllllllllIIIlllIIllIIIlIIlII) {
        return lllllllllllllIIIlllIIllIIIlIIlIl < lllllllllllllIIIlllIIllIIIlIIlII;
    }
    
    public static Builder withOrigin(final String lllllllllllllIIIlllIIllIIllIIlIl) {
        if (lllIIlIIlllIlll(CorsConfig.lIlIIlIIIIlIlI[CorsConfig.lIlIIlIIIIlIll[12]].equals(lllllllllllllIIIlllIIllIIllIIlIl) ? 1 : 0)) {
            return new Builder();
        }
        final String[] llllllllllllIlllIIIllIlIllIlllll = new String[CorsConfig.lIlIIlIIIIlIll[1]];
        llllllllllllIlllIIIllIlIllIlllll[CorsConfig.lIlIIlIIIIlIll[0]] = lllllllllllllIIIlllIIllIIllIIlIl;
        return new Builder(llllllllllllIlllIIIllIlIllIlllll);
    }
    
    public boolean isCorsSupportEnabled() {
        return this.enabled;
    }
    
    private CorsConfig(final Builder lllllllllllllIIIlllIIllIlIlIIIlI) {
        this.origins = new LinkedHashSet<String>(lllllllllllllIIIlllIIllIlIlIIIlI.origins);
        this.anyOrigin = lllllllllllllIIIlllIIllIlIlIIIlI.anyOrigin;
        this.enabled = lllllllllllllIIIlllIIllIlIlIIIlI.enabled;
        this.exposeHeaders = lllllllllllllIIIlllIIllIlIlIIIlI.exposeHeaders;
        this.allowCredentials = lllllllllllllIIIlllIIllIlIlIIIlI.allowCredentials;
        this.maxAge = lllllllllllllIIIlllIIllIlIlIIIlI.maxAge;
        this.allowedRequestMethods = lllllllllllllIIIlllIIllIlIlIIIlI.requestMethods;
        this.allowedRequestHeaders = lllllllllllllIIIlllIIllIlIlIIIlI.requestHeaders;
        this.allowNullOrigin = lllllllllllllIIIlllIIllIlIlIIIlI.allowNullOrigin;
        this.preflightHeaders = lllllllllllllIIIlllIIllIlIlIIIlI.preflightHeaders;
        this.shortCurcuit = lllllllllllllIIIlllIIllIlIlIIIlI.shortCurcuit;
    }
    
    public boolean isCredentialsAllowed() {
        return this.allowCredentials;
    }
    
    private static String lllIIlIIlllIIlI(final String lllllllllllllIIIlllIIllIIlIIIlIl, final String lllllllllllllIIIlllIIllIIlIIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIlllIIllIIlIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIIllIIlIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlllIIllIIlIIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlllIIllIIlIIIlll.init(CorsConfig.lIlIIlIIIIlIll[3], lllllllllllllIIIlllIIllIIlIIlIII);
            return new String(lllllllllllllIIIlllIIllIIlIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIIllIIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllIIllIIlIIIllI) {
            lllllllllllllIIIlllIIllIIlIIIllI.printStackTrace();
            return null;
        }
    }
    
    private static String lllIIlIIlllIIll(String lllllllllllllIIIlllIIllIIIllIIII, final String lllllllllllllIIIlllIIllIIIllIlII) {
        lllllllllllllIIIlllIIllIIIllIIII = new String(Base64.getDecoder().decode(lllllllllllllIIIlllIIllIIIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlllIIllIIIllIIll = new StringBuilder();
        final char[] lllllllllllllIIIlllIIllIIIllIIlI = lllllllllllllIIIlllIIllIIIllIlII.toCharArray();
        int lllllllllllllIIIlllIIllIIIllIIIl = CorsConfig.lIlIIlIIIIlIll[0];
        final char lllllllllllllIIIlllIIllIIIlIlIll = (Object)lllllllllllllIIIlllIIllIIIllIIII.toCharArray();
        final char lllllllllllllIIIlllIIllIIIlIlIlI = (char)lllllllllllllIIIlllIIllIIIlIlIll.length;
        char lllllllllllllIIIlllIIllIIIlIlIIl = (char)CorsConfig.lIlIIlIIIIlIll[0];
        while (lllIIlIIllllIII(lllllllllllllIIIlllIIllIIIlIlIIl, lllllllllllllIIIlllIIllIIIlIlIlI)) {
            final char lllllllllllllIIIlllIIllIIIllIllI = lllllllllllllIIIlllIIllIIIlIlIll[lllllllllllllIIIlllIIllIIIlIlIIl];
            lllllllllllllIIIlllIIllIIIllIIll.append((char)(lllllllllllllIIIlllIIllIIIllIllI ^ lllllllllllllIIIlllIIllIIIllIIlI[lllllllllllllIIIlllIIllIIIllIIIl % lllllllllllllIIIlllIIllIIIllIIlI.length]));
            "".length();
            ++lllllllllllllIIIlllIIllIIIllIIIl;
            ++lllllllllllllIIIlllIIllIIIlIlIIl;
            "".length();
            if (-(81 + 95 + 4 + 13 ^ 139 + 178 - 223 + 103) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlllIIllIIIllIIll);
    }
    
    public long maxAge() {
        return this.maxAge;
    }
    
    public HttpHeaders preflightResponseHeaders() {
        if (lllIIlIIlllIlll(this.preflightHeaders.isEmpty() ? 1 : 0)) {
            return HttpHeaders.EMPTY_HEADERS;
        }
        final HttpHeaders lllllllllllllIIIlllIIllIIllllIII = new DefaultHttpHeaders();
        final Iterator lllllllllllllIIIlllIIllIIllllIlI = this.preflightHeaders.entrySet().iterator();
        while (lllIIlIIlllIlll(lllllllllllllIIIlllIIllIIllllIlI.hasNext() ? 1 : 0)) {
            final Map.Entry<CharSequence, Callable<?>> lllllllllllllIIIlllIIllIIllllIll = lllllllllllllIIIlllIIllIIllllIlI.next();
            final Object lllllllllllllIIIlllIIllIIlllllII = getValue(lllllllllllllIIIlllIIllIIllllIll.getValue());
            if (lllIIlIIlllIlll((lllllllllllllIIIlllIIllIIlllllII instanceof Iterable) ? 1 : 0)) {
                lllllllllllllIIIlllIIllIIllllIII.add(lllllllllllllIIIlllIIllIIllllIll.getKey(), (Iterable<?>)lllllllllllllIIIlllIIllIIlllllII);
                "".length();
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                lllllllllllllIIIlllIIllIIllllIII.add(lllllllllllllIIIlllIIllIIllllIll.getKey(), lllllllllllllIIIlllIIllIIlllllII);
                "".length();
            }
            "".length();
            if ((0xA8 ^ 0xAC) < 0) {
                return null;
            }
        }
        return lllllllllllllIIIlllIIllIIllllIII;
    }
    
    private static <T> T getValue(final Callable<T> lllllllllllllIIIlllIIllIIllIlIll) {
        try {
            return lllllllllllllIIIlllIIllIIllIlIll.call();
        }
        catch (Exception lllllllllllllIIIlllIIllIIllIllIl) {
            throw new IllegalStateException(String.valueOf(new StringBuilder().append(CorsConfig.lIlIIlIIIIlIlI[CorsConfig.lIlIIlIIIIlIll[1]]).append(lllllllllllllIIIlllIIllIIllIlIll).append((char)CorsConfig.lIlIIlIIIIlIll[2])), lllllllllllllIIIlllIIllIIllIllIl);
        }
    }
    
    public static Builder withOrigins(final String... lllllllllllllIIIlllIIllIIllIIIIl) {
        return new Builder(lllllllllllllIIIlllIIllIIllIIIIl);
    }
    
    private static void lllIIlIIlllIlIl() {
        (lIlIIlIIIIlIlI = new String[CorsConfig.lIlIIlIIIIlIll[13]])[CorsConfig.lIlIIlIIIIlIll[0]] = lllIIlIIlllIIlI("pLPqMgm6Wyk=", "OifGc");
        CorsConfig.lIlIIlIIIIlIlI[CorsConfig.lIlIIlIIIIlIll[1]] = lllIIlIIlllIIll("EAsyBitzCigebzQBKQ89MhAiSjkyCDIPbzULNUosMggrCy0/AWcx", "SdGjO");
        CorsConfig.lIlIIlIIIIlIlI[CorsConfig.lIlIIlIIIIlIll[3]] = lllIIlIIlllIIlI("gM3cG6K9C1c+xYlLAfzgyA==", "FZrlj");
        CorsConfig.lIlIIlIIIIlIlI[CorsConfig.lIlIIlIIIIlIll[4]] = lllIIlIIlllIIll("b0w8HCUkBT0dcQ==", "ClSnL");
        CorsConfig.lIlIIlIIIIlIlI[CorsConfig.lIlIIlIIIIlIll[5]] = lllIIlIIlllIlII("EwaGxsLDfH6r+ecM02eYLA==", "jjnEG");
        CorsConfig.lIlIIlIIIIlIlI[CorsConfig.lIlIIlIIIIlIll[6]] = lllIIlIIlllIIlI("N4UPO7Hd3xoG1OwM4bi4K5nmp/X7+Cx6", "qnqqA");
        CorsConfig.lIlIIlIIIIlIlI[CorsConfig.lIlIIlIIIIlIll[7]] = lllIIlIIlllIlII("F/lzSXFkVTY2zGSuPdDFqaTQHbLOcRgn", "rNgqS");
        CorsConfig.lIlIIlIIIIlIlI[CorsConfig.lIlIIlIIIIlIll[8]] = lllIIlIIlllIlII("TtT35eZfR7axkAE4ou31rg==", "YeAFJ");
        CorsConfig.lIlIIlIIIIlIlI[CorsConfig.lIlIIlIIIIlIll[9]] = lllIIlIIlllIlII("6BiDDlZCXtEihX01MAypHhI0/HulDGKWspD9ZwF0M4o=", "jKZyl");
        CorsConfig.lIlIIlIIIIlIlI[CorsConfig.lIlIIlIIIIlIll[10]] = lllIIlIIlllIlII("OSnxa3wHpu2xuFFRy/ZbiiVwQobq7mfK8PGwJy7xNbE=", "HAiNw");
        CorsConfig.lIlIIlIIIIlIlI[CorsConfig.lIlIIlIIIIlIll[11]] = lllIIlIIlllIlII("YEuT0oi2dZOuYBZ4J7kL/B57KbRUvj6l", "oSndP");
        CorsConfig.lIlIIlIIIIlIlI[CorsConfig.lIlIIlIIIIlIll[12]] = lllIIlIIlllIlII("55ZUkqUuD2A=", "DfHco");
    }
    
    public Set<HttpMethod> allowedRequestMethods() {
        return Collections.unmodifiableSet((Set<? extends HttpMethod>)this.allowedRequestMethods);
    }
    
    static {
        lllIIlIIlllIllI();
        lllIIlIIlllIlIl();
    }
    
    public Set<String> allowedRequestHeaders() {
        return Collections.unmodifiableSet((Set<? extends String>)this.allowedRequestHeaders);
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(StringUtil.simpleClassName(this)).append(CorsConfig.lIlIIlIIIIlIlI[CorsConfig.lIlIIlIIIIlIll[3]]).append(this.enabled).append(CorsConfig.lIlIIlIIIIlIlI[CorsConfig.lIlIIlIIIIlIll[4]]).append(this.origins).append(CorsConfig.lIlIIlIIIIlIlI[CorsConfig.lIlIIlIIIIlIll[5]]).append(this.anyOrigin).append(CorsConfig.lIlIIlIIIIlIlI[CorsConfig.lIlIIlIIIIlIll[6]]).append(this.exposeHeaders).append(CorsConfig.lIlIIlIIIIlIlI[CorsConfig.lIlIIlIIIIlIll[7]]).append(this.allowCredentials).append(CorsConfig.lIlIIlIIIIlIlI[CorsConfig.lIlIIlIIIIlIll[8]]).append(this.maxAge).append(CorsConfig.lIlIIlIIIIlIlI[CorsConfig.lIlIIlIIIIlIll[9]]).append(this.allowedRequestMethods).append(CorsConfig.lIlIIlIIIIlIlI[CorsConfig.lIlIIlIIIIlIll[10]]).append(this.allowedRequestHeaders).append(CorsConfig.lIlIIlIIIIlIlI[CorsConfig.lIlIIlIIIIlIll[11]]).append(this.preflightHeaders).append((char)CorsConfig.lIlIIlIIIIlIll[2]));
    }
    
    private static String lllIIlIIlllIlII(final String lllllllllllllIIIlllIIllIIlIlIIlI, final String lllllllllllllIIIlllIIllIIlIIllll) {
        try {
            final SecretKeySpec lllllllllllllIIIlllIIllIIlIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIIllIIlIIllll.getBytes(StandardCharsets.UTF_8)), CorsConfig.lIlIIlIIIIlIll[9]), "DES");
            final Cipher lllllllllllllIIIlllIIllIIlIlIlII = Cipher.getInstance("DES");
            lllllllllllllIIIlllIIllIIlIlIlII.init(CorsConfig.lIlIIlIIIIlIll[3], lllllllllllllIIIlllIIllIIlIlIlIl);
            return new String(lllllllllllllIIIlllIIllIIlIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIIllIIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllIIllIIlIlIIll) {
            lllllllllllllIIIlllIIllIIlIlIIll.printStackTrace();
            return null;
        }
    }
    
    public boolean isShortCurcuit() {
        return this.shortCurcuit;
    }
    
    private static void lllIIlIIlllIllI() {
        (lIlIIlIIIIlIll = new int[14])[0] = ((194 + 56 - 38 + 18 ^ 47 + 25 - 19 + 127) & (100 + 75 - 149 + 186 ^ 108 + 67 - 152 + 111 ^ -" ".length()));
        CorsConfig.lIlIIlIIIIlIll[1] = " ".length();
        CorsConfig.lIlIIlIIIIlIll[2] = (29 + 226 - 151 + 127 ^ 0 + 62 + 112 + 12);
        CorsConfig.lIlIIlIIIIlIll[3] = "  ".length();
        CorsConfig.lIlIIlIIIIlIll[4] = "   ".length();
        CorsConfig.lIlIIlIIIIlIll[5] = (0x90 ^ 0x94);
        CorsConfig.lIlIIlIIIIlIll[6] = (105 + 163 - 163 + 89 ^ 114 + 67 - 34 + 52);
        CorsConfig.lIlIIlIIIIlIll[7] = (0x2 ^ 0x4);
        CorsConfig.lIlIIlIIIIlIll[8] = (0x12 ^ 0x15);
        CorsConfig.lIlIIlIIIIlIll[9] = (0x72 ^ 0x7A);
        CorsConfig.lIlIIlIIIIlIll[10] = (0x9A ^ 0x93);
        CorsConfig.lIlIIlIIIIlIll[11] = (0xC ^ 0x6);
        CorsConfig.lIlIIlIIIIlIll[12] = (0x17 ^ 0x1C);
        CorsConfig.lIlIIlIIIIlIll[13] = (119 + 25 - 94 + 153 ^ 65 + 30 + 18 + 86);
    }
    
    public boolean isAnyOriginSupported() {
        return this.anyOrigin;
    }
    
    public static final class DateValueGenerator implements Callable<Date>
    {
        @Override
        public Date call() throws Exception {
            return new Date();
        }
    }
    
    public static class Builder
    {
        private /* synthetic */ boolean shortCurcuit;
        private static final /* synthetic */ String[] llIIlIlIlIIlll;
        private /* synthetic */ boolean enabled;
        private /* synthetic */ boolean allowNullOrigin;
        private final /* synthetic */ Set<String> exposeHeaders;
        private final /* synthetic */ Set<HttpMethod> requestMethods;
        private final /* synthetic */ Set<String> origins;
        private /* synthetic */ boolean noPreflightHeaders;
        private static final /* synthetic */ int[] llIIlIlIlIlIII;
        private final /* synthetic */ Map<CharSequence, Callable<?>> preflightHeaders;
        private /* synthetic */ boolean allowCredentials;
        private final /* synthetic */ boolean anyOrigin;
        private /* synthetic */ long maxAge;
        private final /* synthetic */ Set<String> requestHeaders;
        
        public CorsConfig build() {
            if (lIIIllIlIIllIIII(this.preflightHeaders.isEmpty() ? 1 : 0) && lIIIllIlIIllIIIl(this.noPreflightHeaders ? 1 : 0)) {
                this.preflightHeaders.put(Builder.llIIlIlIlIIlll[Builder.llIIlIlIlIlIII[1]], new DateValueGenerator());
                "".length();
                this.preflightHeaders.put(Builder.llIIlIlIlIIlll[Builder.llIIlIlIlIlIII[0]], new ConstantValueGenerator((Object)Builder.llIIlIlIlIIlll[Builder.llIIlIlIlIlIII[2]]));
                "".length();
            }
            return new CorsConfig(this, null);
        }
        
        public Builder allowNullOrigin() {
            this.allowNullOrigin = (Builder.llIIlIlIlIlIII[0] != 0);
            return this;
        }
        
        private static String lIIIllIlIIlIlIlI(final String llllllllllllIlllIIIllIlIIllIllII, final String llllllllllllIlllIIIllIlIIllIlIll) {
            try {
                final SecretKeySpec llllllllllllIlllIIIllIlIIlllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIllIlIIllIlIll.getBytes(StandardCharsets.UTF_8)), Builder.llIIlIlIlIlIII[4]), "DES");
                final Cipher llllllllllllIlllIIIllIlIIlllIIII = Cipher.getInstance("DES");
                llllllllllllIlllIIIllIlIIlllIIII.init(Builder.llIIlIlIlIlIII[2], llllllllllllIlllIIIllIlIIlllIIIl);
                return new String(llllllllllllIlllIIIllIlIIlllIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIllIlIIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIIIllIlIIllIllll) {
                llllllllllllIlllIIIllIlIIllIllll.printStackTrace();
                return null;
            }
        }
        
        public Builder allowedRequestHeaders(final String... llllllllllllIlllIIIllIlIlIllllIl) {
            this.requestHeaders.addAll(Arrays.asList(llllllllllllIlllIIIllIlIlIllllIl));
            "".length();
            return this;
        }
        
        private static String lIIIllIlIIlIlIll(final String llllllllllllIlllIIIllIlIIllIIIIl, final String llllllllllllIlllIIIllIlIIlIllllI) {
            try {
                final SecretKeySpec llllllllllllIlllIIIllIlIIllIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIllIlIIlIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlllIIIllIlIIllIIIll = Cipher.getInstance("Blowfish");
                llllllllllllIlllIIIllIlIIllIIIll.init(Builder.llIIlIlIlIlIII[2], llllllllllllIlllIIIllIlIIllIIlII);
                return new String(llllllllllllIlllIIIllIlIIllIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIllIlIIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIIIllIlIIllIIIlI) {
                llllllllllllIlllIIIllIlIIllIIIlI.printStackTrace();
                return null;
            }
        }
        
        public Builder allowedRequestMethods(final HttpMethod... llllllllllllIlllIIIllIlIllIIIIll) {
            this.requestMethods.addAll(Arrays.asList(llllllllllllIlllIIIllIlIllIIIIll));
            "".length();
            return this;
        }
        
        public Builder(final String... llllllllllllIlllIIIllIlIllIlllll) {
            this.enabled = (Builder.llIIlIlIlIlIII[0] != 0);
            this.exposeHeaders = new HashSet<String>();
            this.requestMethods = new HashSet<HttpMethod>();
            this.requestHeaders = new HashSet<String>();
            this.preflightHeaders = new HashMap<CharSequence, Callable<?>>();
            this.origins = new LinkedHashSet<String>(Arrays.asList(llllllllllllIlllIIIllIlIllIlllll));
            this.anyOrigin = (Builder.llIIlIlIlIlIII[1] != 0);
        }
        
        public Builder exposeHeaders(final String... llllllllllllIlllIIIllIlIllIlIIlI) {
            this.exposeHeaders.addAll(Arrays.asList(llllllllllllIlllIIIllIlIllIlIIlI));
            "".length();
            return this;
        }
        
        private static void lIIIllIlIIlIlllI() {
            (llIIlIlIlIlIII = new int[5])[0] = " ".length();
            Builder.llIIlIlIlIlIII[1] = ((0x23 ^ 0x2C ^ (0x7D ^ 0x33)) & (140 + 123 - 137 + 105 ^ 16 + 74 - 21 + 97 ^ -" ".length()));
            Builder.llIIlIlIlIlIII[2] = "  ".length();
            Builder.llIIlIlIlIlIII[3] = "   ".length();
            Builder.llIIlIlIlIlIII[4] = (0xBE ^ 0xB6);
        }
        
        private static void lIIIllIlIIlIllIl() {
            (llIIlIlIlIIlll = new String[Builder.llIIlIlIlIlIII[3]])[Builder.llIIlIlIlIlIII[1]] = lIIIllIlIIlIlIlI("i1Cf6ilvnaw=", "zgaIH");
            Builder.llIIlIlIlIIlll[Builder.llIIlIlIlIlIII[0]] = lIIIllIlIIlIlIll("DOlCjvuIgCS8VvP9JN6zug==", "uhcFW");
            Builder.llIIlIlIlIIlll[Builder.llIIlIlIlIlIII[2]] = lIIIllIlIIlIllII("Sg==", "zMsVB");
        }
        
        static {
            lIIIllIlIIlIlllI();
            lIIIllIlIIlIllIl();
        }
        
        public <T> Builder preflightResponseHeader(final String llllllllllllIlllIIIllIlIlIlIIlII, final Callable<T> llllllllllllIlllIIIllIlIlIlIIIII) {
            this.preflightHeaders.put(llllllllllllIlllIIIllIlIlIlIIlII, llllllllllllIlllIIIllIlIlIlIIIII);
            "".length();
            return this;
        }
        
        private static boolean lIIIllIlIIlIllll(final int llllllllllllIlllIIIllIlIIlIIIIIl, final int llllllllllllIlllIIIllIlIIlIIIIII) {
            return llllllllllllIlllIIIllIlIIlIIIIIl == llllllllllllIlllIIIllIlIIlIIIIII;
        }
        
        public Builder allowCredentials() {
            this.allowCredentials = (Builder.llIIlIlIlIlIII[0] != 0);
            return this;
        }
        
        public Builder preflightResponseHeader(final CharSequence llllllllllllIlllIIIllIlIlIllIllI, final Object... llllllllllllIlllIIIllIlIlIllIIlI) {
            if (lIIIllIlIIlIllll(llllllllllllIlllIIIllIlIlIllIIlI.length, Builder.llIIlIlIlIlIII[0])) {
                this.preflightHeaders.put(llllllllllllIlllIIIllIlIlIllIllI, new ConstantValueGenerator(llllllllllllIlllIIIllIlIlIllIIlI[Builder.llIIlIlIlIlIII[1]]));
                "".length();
                "".length();
                if ("   ".length() < 0) {
                    return null;
                }
            }
            else {
                this.preflightResponseHeader(llllllllllllIlllIIIllIlIlIllIllI, Arrays.asList(llllllllllllIlllIIIllIlIlIllIIlI));
                "".length();
            }
            return this;
        }
        
        private static boolean lIIIllIlIIllIIII(final int llllllllllllIlllIIIllIlIIIlllIlI) {
            return llllllllllllIlllIIIllIlIIIlllIlI != 0;
        }
        
        public <T> Builder preflightResponseHeader(final CharSequence llllllllllllIlllIIIllIlIlIlIllIl, final Iterable<T> llllllllllllIlllIIIllIlIlIlIllII) {
            this.preflightHeaders.put(llllllllllllIlllIIIllIlIlIlIllIl, new ConstantValueGenerator((Object)llllllllllllIlllIIIllIlIlIlIllII));
            "".length();
            return this;
        }
        
        private static boolean lIIIllIlIIllIIlI(final int llllllllllllIlllIIIllIlIIIllllIl, final int llllllllllllIlllIIIllIlIIIllllII) {
            return llllllllllllIlllIIIllIlIIIllllIl < llllllllllllIlllIIIllIlIIIllllII;
        }
        
        private static boolean lIIIllIlIIllIIIl(final int llllllllllllIlllIIIllIlIIIlllIII) {
            return llllllllllllIlllIIIllIlIIIlllIII == 0;
        }
        
        public Builder noPreflightResponseHeaders() {
            this.noPreflightHeaders = (Builder.llIIlIlIlIlIII[0] != 0);
            return this;
        }
        
        public Builder shortCurcuit() {
            this.shortCurcuit = (Builder.llIIlIlIlIlIII[0] != 0);
            return this;
        }
        
        private static String lIIIllIlIIlIllII(String llllllllllllIlllIIIllIlIIlIIllII, final String llllllllllllIlllIIIllIlIIlIlIIII) {
            llllllllllllIlllIIIllIlIIlIIllII = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIIIllIlIIlIIllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlllIIIllIlIIlIIllll = new StringBuilder();
            final char[] llllllllllllIlllIIIllIlIIlIIlllI = llllllllllllIlllIIIllIlIIlIlIIII.toCharArray();
            int llllllllllllIlllIIIllIlIIlIIllIl = Builder.llIIlIlIlIlIII[1];
            final short llllllllllllIlllIIIllIlIIlIIIlll = (Object)((String)llllllllllllIlllIIIllIlIIlIIllII).toCharArray();
            final int llllllllllllIlllIIIllIlIIlIIIllI = llllllllllllIlllIIIllIlIIlIIIlll.length;
            String llllllllllllIlllIIIllIlIIlIIIlIl = (String)Builder.llIIlIlIlIlIII[1];
            while (lIIIllIlIIllIIlI((int)llllllllllllIlllIIIllIlIIlIIIlIl, llllllllllllIlllIIIllIlIIlIIIllI)) {
                final char llllllllllllIlllIIIllIlIIlIlIIlI = llllllllllllIlllIIIllIlIIlIIIlll[llllllllllllIlllIIIllIlIIlIIIlIl];
                llllllllllllIlllIIIllIlIIlIIllll.append((char)(llllllllllllIlllIIIllIlIIlIlIIlI ^ llllllllllllIlllIIIllIlIIlIIlllI[llllllllllllIlllIIIllIlIIlIIllIl % llllllllllllIlllIIIllIlIIlIIlllI.length]));
                "".length();
                ++llllllllllllIlllIIIllIlIIlIIllIl;
                ++llllllllllllIlllIIIllIlIIlIIIlIl;
                "".length();
                if ((0xC6 ^ 0xB8 ^ (0x7E ^ 0x4)) <= 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlllIIIllIlIIlIIllll);
        }
        
        public Builder maxAge(final long llllllllllllIlllIIIllIlIllIIlIIl) {
            this.maxAge = llllllllllllIlllIIIllIlIllIIlIIl;
            return this;
        }
        
        public Builder disable() {
            this.enabled = (Builder.llIIlIlIlIlIII[1] != 0);
            return this;
        }
        
        public Builder() {
            this.enabled = (Builder.llIIlIlIlIlIII[0] != 0);
            this.exposeHeaders = new HashSet<String>();
            this.requestMethods = new HashSet<HttpMethod>();
            this.requestHeaders = new HashSet<String>();
            this.preflightHeaders = new HashMap<CharSequence, Callable<?>>();
            this.anyOrigin = (Builder.llIIlIlIlIlIII[0] != 0);
            this.origins = Collections.emptySet();
        }
    }
    
    private static final class ConstantValueGenerator implements Callable<Object>
    {
        private static final /* synthetic */ int[] lIIIllIllIIIll;
        private static final /* synthetic */ String[] lIIIllIllIIIlI;
        private final /* synthetic */ Object value;
        
        static {
            llIIIlIlIIIIlIl();
            llIIIlIlIIIIlII();
        }
        
        private static void llIIIlIlIIIIlIl() {
            (lIIIllIllIIIll = new int[4])[0] = ((0x65 ^ 0x48 ^ (0x7F ^ 0x2)) & (0x15 ^ 0x39 ^ (0x52 ^ 0x2E) ^ -" ".length()));
            ConstantValueGenerator.lIIIllIllIIIll[1] = " ".length();
            ConstantValueGenerator.lIIIllIllIIIll[2] = (11 + 156 - 78 + 87 ^ 50 + 85 + 49 + 0);
            ConstantValueGenerator.lIIIllIllIIIll[3] = "  ".length();
        }
        
        private static boolean llIIIlIlIIIIllI(final Object lllllllllllllIIlllllllIIllIllIll) {
            return lllllllllllllIIlllllllIIllIllIll == null;
        }
        
        @Override
        public Object call() {
            return this.value;
        }
        
        private static void llIIIlIlIIIIlII() {
            (lIIIllIllIIIlI = new String[ConstantValueGenerator.lIIIllIllIIIll[1]])[ConstantValueGenerator.lIIIllIllIIIll[0]] = llIIIlIlIIIIIIl("IYe277v/pUplRzCCCEgYvTWUPuVc/YU3", "LDnLz");
        }
        
        private static String llIIIlIlIIIIIIl(final String lllllllllllllIIlllllllIIlllIIIII, final String lllllllllllllIIlllllllIIlllIIIIl) {
            try {
                final SecretKeySpec lllllllllllllIIlllllllIIlllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllllllIIlllIIIIl.getBytes(StandardCharsets.UTF_8)), ConstantValueGenerator.lIIIllIllIIIll[2]), "DES");
                final Cipher lllllllllllllIIlllllllIIlllIIlII = Cipher.getInstance("DES");
                lllllllllllllIIlllllllIIlllIIlII.init(ConstantValueGenerator.lIIIllIllIIIll[3], lllllllllllllIIlllllllIIlllIIlIl);
                return new String(lllllllllllllIIlllllllIIlllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllllllIIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlllllllIIlllIIIll) {
                lllllllllllllIIlllllllIIlllIIIll.printStackTrace();
                return null;
            }
        }
        
        private ConstantValueGenerator(final Object lllllllllllllIIlllllllIIllllIllI) {
            if (llIIIlIlIIIIllI(lllllllllllllIIlllllllIIllllIllI)) {
                throw new IllegalArgumentException(ConstantValueGenerator.lIIIllIllIIIlI[ConstantValueGenerator.lIIIllIllIIIll[0]]);
            }
            this.value = lllllllllllllIIlllllllIIllllIllI;
        }
    }
}
