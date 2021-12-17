// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.cors;

import io.netty.channel.ChannelPromise;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.channel.ChannelFutureListener;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.channel.ChannelDuplexHandler;

public class CorsHandler extends ChannelDuplexHandler
{
    private final /* synthetic */ CorsConfig config;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ String[] llIllIIlIIllII;
    private /* synthetic */ HttpRequest request;
    private static final /* synthetic */ int[] llIllIIllIIlII;
    
    private void setAllowCredentials(final HttpResponse llllllllllllIllIIllllIIIIlllIIll) {
        if (lIIlIlllIIlIIIll(this.config.isCredentialsAllowed() ? 1 : 0)) {
            llllllllllllIllIIllllIIIIlllIIll.headers().set(CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[11]], CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[12]]);
            "".length();
        }
    }
    
    private static void lIIlIlllIIlIIIlI() {
        (llIllIIllIIlII = new int[21])[0] = ((0xBF ^ 0xA3) & ~(0x48 ^ 0x54));
        CorsHandler.llIllIIllIIlII[1] = " ".length();
        CorsHandler.llIllIIllIIlII[2] = "  ".length();
        CorsHandler.llIllIIllIIlII[3] = "   ".length();
        CorsHandler.llIllIIllIIlII[4] = (10 + 26 + 111 + 34 ^ 132 + 94 - 73 + 24);
        CorsHandler.llIllIIllIIlII[5] = (0x7 ^ 0x2);
        CorsHandler.llIllIIllIIlII[6] = (0x7D ^ 0x7B);
        CorsHandler.llIllIIllIIlII[7] = (0xE0 ^ 0x93 ^ (0x4A ^ 0x3E));
        CorsHandler.llIllIIllIIlII[8] = (0x6 ^ 0xE);
        CorsHandler.llIllIIllIIlII[9] = (46 + 113 - 26 + 44 ^ 1 + 157 - 54 + 80);
        CorsHandler.llIllIIllIIlII[10] = (0x56 ^ 0x5C);
        CorsHandler.llIllIIllIIlII[11] = (0x29 ^ 0x22);
        CorsHandler.llIllIIllIIlII[12] = (93 + 7 + 9 + 36 ^ 78 + 10 - 8 + 77);
        CorsHandler.llIllIIllIIlII[13] = (0x45 ^ 0x48);
        CorsHandler.llIllIIllIIlII[14] = (0x8B ^ 0x85);
        CorsHandler.llIllIIllIIlII[15] = (32 + 163 - 61 + 57 ^ 49 + 142 - 22 + 7);
        CorsHandler.llIllIIllIIlII[16] = (0xA5 ^ 0x9C ^ (0x29 ^ 0x0));
        CorsHandler.llIllIIllIIlII[17] = (0x7D ^ 0x6C);
        CorsHandler.llIllIIllIIlII[18] = (37 + 42 + 76 + 33 ^ 115 + 35 - 79 + 103);
        CorsHandler.llIllIIllIIlII[19] = (0x7B ^ 0x68);
        CorsHandler.llIllIIllIIlII[20] = (127 + 94 - 195 + 103 ^ 115 + 89 - 187 + 132);
    }
    
    private void setAllowHeaders(final HttpResponse llllllllllllIllIIllllIIIIlIllIll) {
        llllllllllllIllIIllllIIIIlIllIll.headers().set(CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[17]], this.config.allowedRequestHeaders());
        "".length();
    }
    
    @Override
    public void channelRead(final ChannelHandlerContext llllllllllllIllIIllllIIIlIlIllIl, final Object llllllllllllIllIIllllIIIlIlIllII) throws Exception {
        if (lIIlIlllIIlIIIll(this.config.isCorsSupportEnabled() ? 1 : 0) && lIIlIlllIIlIIIll((llllllllllllIllIIllllIIIlIlIllII instanceof HttpRequest) ? 1 : 0)) {
            this.request = (HttpRequest)llllllllllllIllIIllllIIIlIlIllII;
            if (lIIlIlllIIlIIIll(isPreflightRequest(this.request) ? 1 : 0)) {
                this.handlePreflight(llllllllllllIllIIllllIIIlIlIllIl, this.request);
                return;
            }
            if (lIIlIlllIIlIIIll(this.config.isShortCurcuit() ? 1 : 0) && lIIlIlllIIlIIlII(this.validateOrigin() ? 1 : 0)) {
                forbidden(llllllllllllIllIIllllIIIlIlIllIl, this.request);
                return;
            }
        }
        llllllllllllIllIIllllIIIlIlIllIl.fireChannelRead(llllllllllllIllIIllllIIIlIlIllII);
        "".length();
    }
    
    @Override
    public void exceptionCaught(final ChannelHandlerContext llllllllllllIllIIllllIIIIlIIIIII, final Throwable llllllllllllIllIIllllIIIIIllllll) throws Exception {
        CorsHandler.logger.error(CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[19]], llllllllllllIllIIllllIIIIIllllll);
        llllllllllllIllIIllllIIIIlIIIIII.fireExceptionCaught(llllllllllllIllIIllllIIIIIllllll);
        "".length();
    }
    
    private void setMaxAge(final HttpResponse llllllllllllIllIIllllIIIIlIlIlIl) {
        llllllllllllIllIIllllIIIIlIlIlIl.headers().set(CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[18]], this.config.maxAge());
        "".length();
    }
    
    private void handlePreflight(final ChannelHandlerContext llllllllllllIllIIllllIIIlIlIIIlI, final HttpRequest llllllllllllIllIIllllIIIlIlIIlIl) {
        final HttpResponse llllllllllllIllIIllllIIIlIlIIlII = new DefaultFullHttpResponse(llllllllllllIllIIllllIIIlIlIIlIl.getProtocolVersion(), HttpResponseStatus.OK);
        if (lIIlIlllIIlIIIll(this.setOrigin(llllllllllllIllIIllllIIIlIlIIlII) ? 1 : 0)) {
            this.setAllowMethods(llllllllllllIllIIllllIIIlIlIIlII);
            this.setAllowHeaders(llllllllllllIllIIllllIIIlIlIIlII);
            this.setAllowCredentials(llllllllllllIllIIllllIIIlIlIIlII);
            this.setMaxAge(llllllllllllIllIIllllIIIlIlIIlII);
            this.setPreflightHeaders(llllllllllllIllIIllllIIIlIlIIlII);
        }
        llllllllllllIllIIllllIIIlIlIIIlI.writeAndFlush(llllllllllllIllIIllllIIIlIlIIlII).addListener((GenericFutureListener<? extends Future<? super Void>>)ChannelFutureListener.CLOSE);
        "".length();
    }
    
    private static void forbidden(final ChannelHandlerContext llllllllllllIllIIllllIIIIIllllII, final HttpRequest llllllllllllIllIIllllIIIIIlllIIl) {
        llllllllllllIllIIllllIIIIIllllII.writeAndFlush(new DefaultFullHttpResponse(llllllllllllIllIIllllIIIIIlllIIl.getProtocolVersion(), HttpResponseStatus.FORBIDDEN)).addListener((GenericFutureListener<? extends Future<? super Void>>)ChannelFutureListener.CLOSE);
        "".length();
    }
    
    private static boolean lIIlIlllIIlIIlII(final int llllllllllllIllIIlllIllllllllIll) {
        return llllllllllllIllIIlllIllllllllIll == 0;
    }
    
    private static void setVaryHeader(final HttpResponse llllllllllllIllIIllllIIIlIIIIIll) {
        llllllllllllIllIIllllIIIlIIIIIll.headers().set(CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[7]], CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[8]]);
        "".length();
    }
    
    private void setPreflightHeaders(final HttpResponse llllllllllllIllIIllllIIIlIIllIlI) {
        llllllllllllIllIIllllIIIlIIllIlI.headers().add(this.config.preflightResponseHeaders());
        "".length();
    }
    
    private static boolean isPreflightRequest(final HttpRequest llllllllllllIllIIllllIIIIlllIIII) {
        final HttpHeaders llllllllllllIllIIllllIIIIllIllll = llllllllllllIllIIllllIIIIlllIIII.headers();
        int n;
        if (lIIlIlllIIlIIIll(llllllllllllIllIIllllIIIIlllIIII.getMethod().equals(HttpMethod.OPTIONS) ? 1 : 0) && lIIlIlllIIlIIIll(llllllllllllIllIIllllIIIIllIllll.contains(CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[13]]) ? 1 : 0) && lIIlIlllIIlIIIll(llllllllllllIllIIllllIIIIllIllll.contains(CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[14]]) ? 1 : 0)) {
            n = CorsHandler.llIllIIllIIlII[1];
            "".length();
            if (-" ".length() >= 0) {
                return ((104 + 143 - 183 + 99 ^ 85 + 96 - 145 + 137) & (109 + 106 - 54 + 3 ^ 136 + 109 - 218 + 143 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = CorsHandler.llIllIIllIIlII[0];
        }
        return n != 0;
    }
    
    static {
        lIIlIlllIIlIIIlI();
        lIIlIllIllIllIII();
        logger = InternalLoggerFactory.getInstance(CorsHandler.class);
    }
    
    private boolean setOrigin(final HttpResponse llllllllllllIllIIllllIIIlIIlIIlI) {
        final String llllllllllllIllIIllllIIIlIIlIlII = this.request.headers().get(CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[0]]);
        if (lIIlIlllIIlIIlIl(llllllllllllIllIIllllIIIlIIlIlII)) {
            if (lIIlIlllIIlIIIll(CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[1]].equals(llllllllllllIllIIllllIIIlIIlIlII) ? 1 : 0) && lIIlIlllIIlIIIll(this.config.isNullOriginAllowed() ? 1 : 0)) {
                setAnyOrigin(llllllllllllIllIIllllIIIlIIlIIlI);
                return CorsHandler.llIllIIllIIlII[1] != 0;
            }
            if (lIIlIlllIIlIIIll(this.config.isAnyOriginSupported() ? 1 : 0)) {
                if (lIIlIlllIIlIIIll(this.config.isCredentialsAllowed() ? 1 : 0)) {
                    this.echoRequestOrigin(llllllllllllIllIIllllIIIlIIlIIlI);
                    setVaryHeader(llllllllllllIllIIllllIIIlIIlIIlI);
                    "".length();
                    if (-"  ".length() > 0) {
                        return ((0x2E ^ 0x64) & ~(0xFE ^ 0xB4)) != 0x0;
                    }
                }
                else {
                    setAnyOrigin(llllllllllllIllIIllllIIIlIIlIIlI);
                }
                return CorsHandler.llIllIIllIIlII[1] != 0;
            }
            if (lIIlIlllIIlIIIll(this.config.origins().contains(llllllllllllIllIIllllIIIlIIlIlII) ? 1 : 0)) {
                setOrigin(llllllllllllIllIIllllIIIlIIlIIlI, llllllllllllIllIIllllIIIlIIlIlII);
                setVaryHeader(llllllllllllIllIIllllIIIlIIlIIlI);
                return CorsHandler.llIllIIllIIlII[1] != 0;
            }
            CorsHandler.logger.debug(String.valueOf(new StringBuilder().append(CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[2]]).append(llllllllllllIllIIllllIIIlIIlIlII).append(CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[3]]).append(this.config.origins())));
        }
        return CorsHandler.llIllIIllIIlII[0] != 0;
    }
    
    private static boolean lIIlIlllIIlIIllI(final Object llllllllllllIllIIlllIlllllllllll) {
        return llllllllllllIllIIlllIlllllllllll == null;
    }
    
    private void echoRequestOrigin(final HttpResponse llllllllllllIllIIllllIIIlIIIIlll) {
        setOrigin(llllllllllllIllIIllllIIIlIIIIlll, this.request.headers().get(CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[6]]));
    }
    
    public CorsHandler(final CorsConfig llllllllllllIllIIllllIIIlIllIlll) {
        this.config = llllllllllllIllIIllllIIIlIllIlll;
    }
    
    private static String lIIlIllIllIlIlIl(final String llllllllllllIllIIllllIIIIIllIIIl, final String llllllllllllIllIIllllIIIIIllIIII) {
        try {
            final SecretKeySpec llllllllllllIllIIllllIIIIIllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllllIIIIIllIIII.getBytes(StandardCharsets.UTF_8)), CorsHandler.llIllIIllIIlII[8]), "DES");
            final Cipher llllllllllllIllIIllllIIIIIllIIll = Cipher.getInstance("DES");
            llllllllllllIllIIllllIIIIIllIIll.init(CorsHandler.llIllIIllIIlII[2], llllllllllllIllIIllllIIIIIllIlII);
            return new String(llllllllllllIllIIllllIIIIIllIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllllIIIIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllllIIIIIllIIlI) {
            llllllllllllIllIIllllIIIIIllIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIlllIIlIIIll(final int llllllllllllIllIIlllIlllllllllIl) {
        return llllllllllllIllIIlllIlllllllllIl != 0;
    }
    
    private static void lIIlIllIllIllIII() {
        (llIllIIlIIllII = new String[CorsHandler.llIllIIllIIlII[20]])[CorsHandler.llIllIIllIIlII[0]] = lIIlIllIllIlIlIl("HhAo2mIkVhE=", "MrzwA");
        CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[1]] = lIIlIllIllIlIllI("KzsoJQ==", "ENDIB");
        CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[2]] = lIIlIllIllIlIllI("OSorGBEYO3oCBgIoMwNUMA==", "kOZmt");
        CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[3]] = lIIlIllIllIlIlIl("ptlsaHdb4eVz33bUWnmc6CwTampdZVwFvRmRUHhKCASeO4I8rn4NEQ==", "dskcr");
        CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[4]] = lIIlIllIllIlIlll("N/oCwuZKO5E=", "udxdX");
        CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[5]] = lIIlIllIllIlIllI("DCAgKg==", "bULFD");
        CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[6]] = lIIlIllIllIlIlll("eijeQ5jZMmQ=", "uIxpP");
        CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[7]] = lIIlIllIllIlIllI("Fw0RHQ==", "Alcdl");
        CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[8]] = lIIlIllIllIlIllI("Nz8DFygW", "xMjpA");
        CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[9]] = lIIlIllIllIlIllI("RA==", "nnEkW");
        CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[10]] = lIIlIllIllIlIllI("BhYWDRw0WDYHATMHGgRCBhkZBxhqOgcBCC4b", "Guuho");
        CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[11]] = lIIlIllIllIlIllI("KQ0KESIbQyobPxwcBhh8KQIFGyZFLRsRNQ0AHR0wBB0=", "hnitQ");
        CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[12]] = lIIlIllIllIlIllI("DQMSLQ==", "yqgHH");
        CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[13]] = lIIlIllIllIlIllI("PyITCREe", "pPznx");
        CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[14]] = lIIlIllIllIlIlll("hwROZuwp9bRTW3LtPJ1QhgNqx+LW/C7zO/EB4hAawoE=", "RTAPW");
        CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[15]] = lIIlIllIllIlIlll("ir1YLhF+uysUtGhMBQD8gMRYPrVBJ0qX3Df+qszbgUI=", "Slmuw");
        CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[16]] = lIIlIllIllIlIlll("29DfDaK2eUbOczF3U8HQD4u9Ndh8mavcgOzT8yczDqg=", "JoVLE");
        CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[17]] = lIIlIllIllIlIlll("xmf4RwHOvP7hupqDkKbcYfN5k4/8XsUaiCFZ/VgM76g=", "TGlqF");
        CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[18]] = lIIlIllIllIlIlll("TslN6gVxLW0xpeMUqNhPNvt12HZm+mFQ", "ItYRh");
        CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[19]] = lIIlIllIllIlIlll("SZggxPSTzie624j6to0C6hfPsChhqfTM0HsYAeZfjJk=", "YyDHH");
    }
    
    private static String lIIlIllIllIlIllI(String llllllllllllIllIIllllIIIIIIIllll, final String llllllllllllIllIIllllIIIIIIlIIll) {
        llllllllllllIllIIllllIIIIIIIllll = new String(Base64.getDecoder().decode(llllllllllllIllIIllllIIIIIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIllllIIIIIIlIIlI = new StringBuilder();
        final char[] llllllllllllIllIIllllIIIIIIlIIIl = llllllllllllIllIIllllIIIIIIlIIll.toCharArray();
        int llllllllllllIllIIllllIIIIIIlIIII = CorsHandler.llIllIIllIIlII[0];
        final byte llllllllllllIllIIllllIIIIIIIlIlI = (Object)llllllllllllIllIIllllIIIIIIIllll.toCharArray();
        final double llllllllllllIllIIllllIIIIIIIlIIl = llllllllllllIllIIllllIIIIIIIlIlI.length;
        byte llllllllllllIllIIllllIIIIIIIlIII = (byte)CorsHandler.llIllIIllIIlII[0];
        while (lIIlIlllIIlIIlll(llllllllllllIllIIllllIIIIIIIlIII, (int)llllllllllllIllIIllllIIIIIIIlIIl)) {
            final char llllllllllllIllIIllllIIIIIIlIlIl = llllllllllllIllIIllllIIIIIIIlIlI[llllllllllllIllIIllllIIIIIIIlIII];
            llllllllllllIllIIllllIIIIIIlIIlI.append((char)(llllllllllllIllIIllllIIIIIIlIlIl ^ llllllllllllIllIIllllIIIIIIlIIIl[llllllllllllIllIIllllIIIIIIlIIII % llllllllllllIllIIllllIIIIIIlIIIl.length]));
            "".length();
            ++llllllllllllIllIIllllIIIIIIlIIII;
            ++llllllllllllIllIIllllIIIIIIIlIII;
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIllllIIIIIIlIIlI);
    }
    
    private static String lIIlIllIllIlIlll(final String llllllllllllIllIIllllIIIIIlIIlII, final String llllllllllllIllIIllllIIIIIlIIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIIllllIIIIIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllllIIIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIllllIIIIIlIIllI = Cipher.getInstance("Blowfish");
            llllllllllllIllIIllllIIIIIlIIllI.init(CorsHandler.llIllIIllIIlII[2], llllllllllllIllIIllllIIIIIlIIlll);
            return new String(llllllllllllIllIIllllIIIIIlIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllllIIIIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllllIIIIIlIIlIl) {
            llllllllllllIllIIllllIIIIIlIIlIl.printStackTrace();
            return null;
        }
    }
    
    private void setAllowMethods(final HttpResponse llllllllllllIllIIllllIIIIllIIIIl) {
        llllllllllllIllIIllllIIIIllIIIIl.headers().set(CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[16]], this.config.allowedRequestMethods());
        "".length();
    }
    
    private static boolean lIIlIlllIIlIIlll(final int llllllllllllIllIIllllIIIIIIIIlII, final int llllllllllllIllIIllllIIIIIIIIIll) {
        return llllllllllllIllIIllllIIIIIIIIlII < llllllllllllIllIIllllIIIIIIIIIll;
    }
    
    private static void setOrigin(final HttpResponse llllllllllllIllIIllllIIIIlllllII, final String llllllllllllIllIIllllIIIIllllIll) {
        llllllllllllIllIIllllIIIIlllllII.headers().set(CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[10]], llllllllllllIllIIllllIIIIllllIll);
        "".length();
    }
    
    private static boolean lIIlIlllIIlIIlIl(final Object llllllllllllIllIIllllIIIIIIIIIIl) {
        return llllllllllllIllIIllllIIIIIIIIIIl != null;
    }
    
    private void setExposeHeaders(final HttpResponse llllllllllllIllIIllllIIIIllIlIIl) {
        if (lIIlIlllIIlIIlII(this.config.exposedHeaders().isEmpty() ? 1 : 0)) {
            llllllllllllIllIIllllIIIIllIlIIl.headers().set(CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[15]], this.config.exposedHeaders());
            "".length();
        }
    }
    
    private static void setAnyOrigin(final HttpResponse llllllllllllIllIIllllIIIIlllllll) {
        setOrigin(llllllllllllIllIIllllIIIIlllllll, CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[9]]);
    }
    
    private boolean validateOrigin() {
        if (lIIlIlllIIlIIIll(this.config.isAnyOriginSupported() ? 1 : 0)) {
            return CorsHandler.llIllIIllIIlII[1] != 0;
        }
        final String llllllllllllIllIIllllIIIlIIIllIl = this.request.headers().get(CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[4]]);
        if (lIIlIlllIIlIIllI(llllllllllllIllIIllllIIIlIIIllIl)) {
            return CorsHandler.llIllIIllIIlII[1] != 0;
        }
        if (lIIlIlllIIlIIIll(CorsHandler.llIllIIlIIllII[CorsHandler.llIllIIllIIlII[5]].equals(llllllllllllIllIIllllIIIlIIIllIl) ? 1 : 0) && lIIlIlllIIlIIIll(this.config.isNullOriginAllowed() ? 1 : 0)) {
            return CorsHandler.llIllIIllIIlII[1] != 0;
        }
        return this.config.origins().contains(llllllllllllIllIIllllIIIlIIIllIl);
    }
    
    @Override
    public void write(final ChannelHandlerContext llllllllllllIllIIllllIIIIlIIlIIl, final Object llllllllllllIllIIllllIIIIlIIllII, final ChannelPromise llllllllllllIllIIllllIIIIlIIIlll) throws Exception {
        if (lIIlIlllIIlIIIll(this.config.isCorsSupportEnabled() ? 1 : 0) && lIIlIlllIIlIIIll((llllllllllllIllIIllllIIIIlIIllII instanceof HttpResponse) ? 1 : 0)) {
            final HttpResponse llllllllllllIllIIllllIIIIlIIllll = (HttpResponse)llllllllllllIllIIllllIIIIlIIllII;
            if (lIIlIlllIIlIIIll(this.setOrigin(llllllllllllIllIIllllIIIIlIIllll) ? 1 : 0)) {
                this.setAllowCredentials(llllllllllllIllIIllllIIIIlIIllll);
                this.setAllowHeaders(llllllllllllIllIIllllIIIIlIIllll);
                this.setExposeHeaders(llllllllllllIllIIllllIIIIlIIllll);
            }
        }
        llllllllllllIllIIllllIIIIlIIlIIl.writeAndFlush(llllllllllllIllIIllllIIIIlIIllII, llllllllllllIllIIllllIIIIlIIIlll);
        "".length();
    }
}
