// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import io.netty.handler.ssl.SslHandler;
import java.util.List;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelInboundHandler;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpResponseEncoder;
import io.netty.channel.ChannelHandler;
import io.netty.handler.codec.http.HttpRequestDecoder;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.internal.StringUtil;
import javax.net.ssl.SSLEngine;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.handler.codec.ByteToMessageDecoder;

public abstract class SpdyOrHttpChooser extends ByteToMessageDecoder
{
    private final /* synthetic */ int maxSpdyContentLength;
    private static final /* synthetic */ int[] lIllIlIIIlIlII;
    private final /* synthetic */ int maxHttpContentLength;
    private static final /* synthetic */ String[] lIllIIllIlIllI;
    
    private static String lllllIlIllIIIIl(final String lllllllllllllIIIIIIIlIIlIllIllIl, final String lllllllllllllIIIIIIIlIIlIllIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIIlIIlIlllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIlIIlIllIlIlI.getBytes(StandardCharsets.UTF_8)), SpdyOrHttpChooser.lIllIlIIIlIlII[9]), "DES");
            final Cipher lllllllllllllIIIIIIIlIIlIllIllll = Cipher.getInstance("DES");
            lllllllllllllIIIIIIIlIIlIllIllll.init(SpdyOrHttpChooser.lIllIlIIIlIlII[1], lllllllllllllIIIIIIIlIIlIlllIIII);
            return new String(lllllllllllllIIIIIIIlIIlIllIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIlIIlIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIIlIIlIllIlllI) {
            lllllllllllllIIIIIIIlIIlIllIlllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllllIllllllIlI(final int lllllllllllllIIIIIIIlIIlIlIIIIII, final int lllllllllllllIIIIIIIlIIlIIllllll) {
        return lllllllllllllIIIIIIIlIIlIlIIIIII < lllllllllllllIIIIIIIlIIlIIllllll;
    }
    
    protected SelectedProtocol getProtocol(final SSLEngine lllllllllllllIIIIIIIlIIllIlIIIll) {
        final String[] lllllllllllllIIIIIIIlIIllIlIIlIl = StringUtil.split(lllllllllllllIIIIIIIlIIllIlIIIll.getSession().getProtocol(), (char)SpdyOrHttpChooser.lIllIlIIIlIlII[0]);
        if (lllllIllllllIlI(lllllllllllllIIIIIIIlIIllIlIIlIl.length, SpdyOrHttpChooser.lIllIlIIIlIlII[1])) {
            return SelectedProtocol.HTTP_1_1;
        }
        final SelectedProtocol lllllllllllllIIIIIIIlIIllIlIIlII = SelectedProtocol.protocol(lllllllllllllIIIIIIIlIIllIlIIlIl[SpdyOrHttpChooser.lIllIlIIIlIlII[2]]);
        return lllllllllllllIIIIIIIlIIllIlIIlII;
    }
    
    private static void lllllIllllllIIl() {
        (lIllIlIIIlIlII = new int[14])[0] = (158 + 13 - 38 + 35 ^ 7 + 21 + 67 + 51);
        SpdyOrHttpChooser.lIllIlIIIlIlII[1] = "  ".length();
        SpdyOrHttpChooser.lIllIlIIIlIlII[2] = " ".length();
        SpdyOrHttpChooser.lIllIlIIIlIlII[3] = ((0x6E ^ 0x3 ^ (0x1E ^ 0x4A)) & (87 + 29 - 95 + 109 ^ 183 + 89 - 107 + 22 ^ -" ".length()));
        SpdyOrHttpChooser.lIllIlIIIlIlII[4] = "   ".length();
        SpdyOrHttpChooser.lIllIlIIIlIlII[5] = (0xEE ^ 0xBB ^ (0xC4 ^ 0x95));
        SpdyOrHttpChooser.lIllIlIIIlIlII[6] = (0x2E ^ 0x72 ^ (0xE9 ^ 0xB0));
        SpdyOrHttpChooser.lIllIlIIIlIlII[7] = (0xA7 ^ 0xA1);
        SpdyOrHttpChooser.lIllIlIIIlIlII[8] = (0xE8 ^ 0xB4 ^ (0xC6 ^ 0x9D));
        SpdyOrHttpChooser.lIllIlIIIlIlII[9] = (0xEF ^ 0x8C ^ (0xFE ^ 0x95));
        SpdyOrHttpChooser.lIllIlIIIlIlII[10] = (0x33 ^ 0x3A);
        SpdyOrHttpChooser.lIllIlIIIlIlII[11] = (140 + 71 - 161 + 107 ^ 120 + 9 - 67 + 89);
        SpdyOrHttpChooser.lIllIlIIIlIlII[12] = (0x20 ^ 0x4B ^ (0x6 ^ 0x66));
        SpdyOrHttpChooser.lIllIlIIIlIlII[13] = (0xB8 ^ 0xB4);
    }
    
    private static String lllllIlIllIIlII(String lllllllllllllIIIIIIIlIIlIlIllIII, final String lllllllllllllIIIIIIIlIIlIlIlIlll) {
        lllllllllllllIIIIIIIlIIlIlIllIII = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIIIIlIIlIlIllIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIIIlIIlIlIllIll = new StringBuilder();
        final char[] lllllllllllllIIIIIIIlIIlIlIllIlI = lllllllllllllIIIIIIIlIIlIlIlIlll.toCharArray();
        int lllllllllllllIIIIIIIlIIlIlIllIIl = SpdyOrHttpChooser.lIllIlIIIlIlII[3];
        final long lllllllllllllIIIIIIIlIIlIlIlIIll = (Object)((String)lllllllllllllIIIIIIIlIIlIlIllIII).toCharArray();
        final Exception lllllllllllllIIIIIIIlIIlIlIlIIlI = (Exception)lllllllllllllIIIIIIIlIIlIlIlIIll.length;
        int lllllllllllllIIIIIIIlIIlIlIlIIIl = SpdyOrHttpChooser.lIllIlIIIlIlII[3];
        while (lllllIllllllIlI(lllllllllllllIIIIIIIlIIlIlIlIIIl, (int)lllllllllllllIIIIIIIlIIlIlIlIIlI)) {
            final char lllllllllllllIIIIIIIlIIlIlIllllI = lllllllllllllIIIIIIIlIIlIlIlIIll[lllllllllllllIIIIIIIlIIlIlIlIIIl];
            lllllllllllllIIIIIIIlIIlIlIllIll.append((char)(lllllllllllllIIIIIIIlIIlIlIllllI ^ lllllllllllllIIIIIIIlIIlIlIllIlI[lllllllllllllIIIIIIIlIIlIlIllIIl % lllllllllllllIIIIIIIlIIlIlIllIlI.length]));
            "".length();
            ++lllllllllllllIIIIIIIlIIlIlIllIIl;
            ++lllllllllllllIIIIIIIlIIlIlIlIIIl;
            "".length();
            if (" ".length() <= -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIIIlIIlIlIllIll);
    }
    
    private static boolean lllllIlllllllII(final Object lllllllllllllIIIIIIIlIIlIIllllIl) {
        return lllllllllllllIIIIIIIlIIlIIllllIl == null;
    }
    
    protected void addHttpHandlers(final ChannelHandlerContext lllllllllllllIIIIIIIlIIlIlllllII) {
        final ChannelPipeline lllllllllllllIIIIIIIlIIlIllllIll = lllllllllllllIIIIIIIlIIlIlllllII.pipeline();
        lllllllllllllIIIIIIIlIIlIllllIll.addLast(SpdyOrHttpChooser.lIllIIllIlIllI[SpdyOrHttpChooser.lIllIlIIIlIlII[9]], new HttpRequestDecoder());
        "".length();
        lllllllllllllIIIIIIIlIIlIllllIll.addLast(SpdyOrHttpChooser.lIllIIllIlIllI[SpdyOrHttpChooser.lIllIlIIIlIlII[10]], new HttpResponseEncoder());
        "".length();
        lllllllllllllIIIIIIIlIIlIllllIll.addLast(SpdyOrHttpChooser.lIllIIllIlIllI[SpdyOrHttpChooser.lIllIlIIIlIlII[11]], new HttpObjectAggregator(this.maxHttpContentLength));
        "".length();
        lllllllllllllIIIIIIIlIIlIllllIll.addLast(SpdyOrHttpChooser.lIllIIllIlIllI[SpdyOrHttpChooser.lIllIlIIIlIlII[12]], this.createHttpRequestHandlerForHttp());
        "".length();
    }
    
    protected abstract ChannelInboundHandler createHttpRequestHandlerForHttp();
    
    static {
        lllllIllllllIIl();
        lllllIlIllIIlll();
    }
    
    private static void lllllIlIllIIlll() {
        (lIllIIllIlIllI = new String[SpdyOrHttpChooser.lIllIlIIIlIlII[13]])[SpdyOrHttpChooser.lIllIlIIIlIlII[3]] = lllllIlIllIIIIl("lk6fVAgjRIAhs7QmsvcEljU3YmARvDv9uN9P0KMUT7o=", "iDFgz");
        SpdyOrHttpChooser.lIllIIllIlIllI[SpdyOrHttpChooser.lIllIlIIIlIlII[2]] = lllllIlIllIIIIl("h5Y3TtUxSmodRDAgvXv6vliZPuMDa9M906/kaoaVyWw=", "lABbq");
        SpdyOrHttpChooser.lIllIIllIlIllI[SpdyOrHttpChooser.lIllIlIIIlIlII[1]] = lllllIlIllIIIll("Oe0KRWDsiB1ueCemSzRXvw==", "QCyOQ");
        SpdyOrHttpChooser.lIllIIllIlIllI[SpdyOrHttpChooser.lIllIlIIIlIlII[4]] = lllllIlIllIIIIl("wFFSDcEefkiAPR2XCs6h2gEqpbabfW97", "KEbBw");
        SpdyOrHttpChooser.lIllIIllIlIllI[SpdyOrHttpChooser.lIllIlIIIlIlII[5]] = lllllIlIllIIIll("VqbBJSy6FwVPKRYfXo6Prg==", "LEGyH");
        SpdyOrHttpChooser.lIllIIllIlIllI[SpdyOrHttpChooser.lIllIlIIIlIlII[6]] = lllllIlIllIIIll("ImlmV6hT03Jqo7l7Zs84FA==", "ahdhO");
        SpdyOrHttpChooser.lIllIIllIlIllI[SpdyOrHttpChooser.lIllIlIIIlIlII[7]] = lllllIlIllIIlII("HBYBIx8bFAA7ISYCLTsiCwoAKA==", "ofeZL");
        SpdyOrHttpChooser.lIllIIllIlIllI[SpdyOrHttpChooser.lIllIlIIIlIlII[8]] = lllllIlIllIIIIl("510AgoKxUwV03DQr2DWQ2KDoIiPgJaVa", "faeVP");
        SpdyOrHttpChooser.lIllIIllIlIllI[SpdyOrHttpChooser.lIllIlIIIlIlII[9]] = lllllIlIllIIIll("Te1YGJn8jDRzlvnBTtSIeDJjcawsWfBT", "MMXTK");
        SpdyOrHttpChooser.lIllIIllIlIllI[SpdyOrHttpChooser.lIllIlIIIlIlII[10]] = lllllIlIllIIlII("GzczJCIWMDc7HgAmAjoTHCciJg==", "sCGTp");
        SpdyOrHttpChooser.lIllIIllIlIllI[SpdyOrHttpChooser.lIllIlIIIlIlII[11]] = lllllIlIllIIIIl("CU5+JSYl71OSuEwGLUTka3obtukTO4Wp", "Ujtfp");
        SpdyOrHttpChooser.lIllIIllIlIllI[SpdyOrHttpChooser.lIllIlIIIlIlII[12]] = lllllIlIllIIIll("fRAKCVXoaMr1/Z2ysAq6R0+NgHze0FYB", "CzJwh");
    }
    
    @Override
    protected void decode(final ChannelHandlerContext lllllllllllllIIIIIIIlIIllIIllIIl, final ByteBuf lllllllllllllIIIIIIIlIIllIIlllII, final List<Object> lllllllllllllIIIIIIIlIIllIIllIll) throws Exception {
        if (lllllIllllllIll(this.initPipeline(lllllllllllllIIIIIIIlIIllIIllIIl) ? 1 : 0)) {
            lllllllllllllIIIIIIIlIIllIIllIIl.pipeline().remove(this);
            "".length();
        }
    }
    
    protected void addSpdyHandlers(final ChannelHandlerContext lllllllllllllIIIIIIIlIIllIIIIlll, final SpdyVersion lllllllllllllIIIIIIIlIIllIIIIllI) {
        final ChannelPipeline lllllllllllllIIIIIIIlIIllIIIIlIl = lllllllllllllIIIIIIIlIIllIIIIlll.pipeline();
        lllllllllllllIIIIIIIlIIllIIIIlIl.addLast(SpdyOrHttpChooser.lIllIIllIlIllI[SpdyOrHttpChooser.lIllIlIIIlIlII[1]], new SpdyFrameCodec(lllllllllllllIIIIIIIlIIllIIIIllI));
        "".length();
        lllllllllllllIIIIIIIlIIllIIIIlIl.addLast(SpdyOrHttpChooser.lIllIIllIlIllI[SpdyOrHttpChooser.lIllIlIIIlIlII[4]], new SpdySessionHandler(lllllllllllllIIIIIIIlIIllIIIIllI, (boolean)(SpdyOrHttpChooser.lIllIlIIIlIlII[2] != 0)));
        "".length();
        lllllllllllllIIIIIIIlIIllIIIIlIl.addLast(SpdyOrHttpChooser.lIllIIllIlIllI[SpdyOrHttpChooser.lIllIlIIIlIlII[5]], new SpdyHttpEncoder(lllllllllllllIIIIIIIlIIllIIIIllI));
        "".length();
        lllllllllllllIIIIIIIlIIllIIIIlIl.addLast(SpdyOrHttpChooser.lIllIIllIlIllI[SpdyOrHttpChooser.lIllIlIIIlIlII[6]], new SpdyHttpDecoder(lllllllllllllIIIIIIIlIIllIIIIllI, this.maxSpdyContentLength));
        "".length();
        lllllllllllllIIIIIIIlIIllIIIIlIl.addLast(SpdyOrHttpChooser.lIllIIllIlIllI[SpdyOrHttpChooser.lIllIlIIIlIlII[7]], new SpdyHttpResponseStreamIdHandler());
        "".length();
        lllllllllllllIIIIIIIlIIllIIIIlIl.addLast(SpdyOrHttpChooser.lIllIIllIlIllI[SpdyOrHttpChooser.lIllIlIIIlIlII[8]], this.createHttpRequestHandlerForSpdy());
        "".length();
    }
    
    private static String lllllIlIllIIIll(final String lllllllllllllIIIIIIIlIIlIlIIlIII, final String lllllllllllllIIIIIIIlIIlIlIIIlll) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIIlIIlIlIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIlIIlIlIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIIIlIIlIlIIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIIIlIIlIlIIlIlI.init(SpdyOrHttpChooser.lIllIlIIIlIlII[1], lllllllllllllIIIIIIIlIIlIlIIlIll);
            return new String(lllllllllllllIIIIIIIlIIlIlIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIlIIlIlIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIIlIIlIlIIlIIl) {
            lllllllllllllIIIIIIIlIIlIlIIlIIl.printStackTrace();
            return null;
        }
    }
    
    private boolean initPipeline(final ChannelHandlerContext lllllllllllllIIIIIIIlIIllIIlIIll) {
        final SslHandler lllllllllllllIIIIIIIlIIllIIlIIlI = lllllllllllllIIIIIIIlIIllIIlIIll.pipeline().get(SslHandler.class);
        if (lllllIlllllllII(lllllllllllllIIIIIIIlIIllIIlIIlI)) {
            throw new IllegalStateException(SpdyOrHttpChooser.lIllIIllIlIllI[SpdyOrHttpChooser.lIllIlIIIlIlII[3]]);
        }
        final SelectedProtocol lllllllllllllIIIIIIIlIIllIIlIIIl = this.getProtocol(lllllllllllllIIIIIIIlIIllIIlIIlI.engine());
        switch (SpdyOrHttpChooser$1.$SwitchMap$io$netty$handler$codec$spdy$SpdyOrHttpChooser$SelectedProtocol[lllllllllllllIIIIIIIlIIllIIlIIIl.ordinal()]) {
            case 1: {
                return SpdyOrHttpChooser.lIllIlIIIlIlII[3] != 0;
            }
            case 2: {
                this.addSpdyHandlers(lllllllllllllIIIIIIIlIIllIIlIIll, SpdyVersion.SPDY_3_1);
                "".length();
                if (" ".length() <= 0) {
                    return ((0x1 ^ 0x14 ^ (0x0 ^ 0x47)) & (0xF ^ 0x67 ^ (0x36 ^ 0xC) ^ -" ".length())) != 0x0;
                }
                break;
            }
            case 3:
            case 4: {
                this.addHttpHandlers(lllllllllllllIIIIIIIlIIllIIlIIll);
                "".length();
                if (-" ".length() >= "   ".length()) {
                    return ((0xF3 ^ 0xB7) & ~(0x5B ^ 0x1F)) != 0x0;
                }
                break;
            }
            default: {
                throw new IllegalStateException(SpdyOrHttpChooser.lIllIIllIlIllI[SpdyOrHttpChooser.lIllIlIIIlIlII[2]]);
            }
        }
        return SpdyOrHttpChooser.lIllIlIIIlIlII[2] != 0;
    }
    
    protected ChannelInboundHandler createHttpRequestHandlerForSpdy() {
        return this.createHttpRequestHandlerForHttp();
    }
    
    private static boolean lllllIllllllIll(final int lllllllllllllIIIIIIIlIIlIIlllIll) {
        return lllllllllllllIIIIIIIlIIlIIlllIll != 0;
    }
    
    protected SpdyOrHttpChooser(final int lllllllllllllIIIIIIIlIIllIlIllII, final int lllllllllllllIIIIIIIlIIllIlIlIll) {
        this.maxSpdyContentLength = lllllllllllllIIIIIIIlIIllIlIllII;
        this.maxHttpContentLength = lllllllllllllIIIIIIIlIIllIlIlIll;
    }
    
    public enum SelectedProtocol
    {
        private final /* synthetic */ String name;
        
        SPDY_3_1(SelectedProtocol.lIIIIlIlIIIlIl[SelectedProtocol.lIIIIlIlIIlIII[1]]);
        
        private static final /* synthetic */ int[] lIIIIlIlIIlIII;
        
        HTTP_1_1(SelectedProtocol.lIIIIlIlIIIlIl[SelectedProtocol.lIIIIlIlIIlIII[3]]), 
        HTTP_1_0(SelectedProtocol.lIIIIlIlIIIlIl[SelectedProtocol.lIIIIlIlIIlIII[5]]);
        
        private static final /* synthetic */ String[] lIIIIlIlIIIlIl;
        
        UNKNOWN(SelectedProtocol.lIIIIlIlIIIlIl[SelectedProtocol.lIIIIlIlIIlIII[7]]);
        
        private SelectedProtocol(final String lllllllllllllIlIIlIllIllllIIlIlI) {
            this.name = lllllllllllllIlIIlIllIllllIIlIlI;
        }
        
        public String protocolName() {
            return this.name;
        }
        
        private static String lIlllIIlIllIIIl(final String lllllllllllllIlIIlIllIllIlllIlII, final String lllllllllllllIlIIlIllIllIlllIlIl) {
            try {
                final SecretKeySpec lllllllllllllIlIIlIllIllIllllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIllIllIlllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIIlIllIllIllllIII = Cipher.getInstance("Blowfish");
                lllllllllllllIlIIlIllIllIllllIII.init(SelectedProtocol.lIIIIlIlIIlIII[2], lllllllllllllIlIIlIllIllIllllIIl);
                return new String(lllllllllllllIlIIlIllIllIllllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIllIllIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIlIllIllIlllIlll) {
                lllllllllllllIlIIlIllIllIlllIlll.printStackTrace();
                return null;
            }
        }
        
        private static void lIlllIIlIllIIlI() {
            (lIIIIlIlIIIlIl = new String[SelectedProtocol.lIIIIlIlIIlIII[8]])[SelectedProtocol.lIIIIlIlIIlIII[0]] = lIlllIIlIlIllll("JAIpMBNEDVw=", "wRmiL");
            SelectedProtocol.lIIIIlIlIIIlIl[SelectedProtocol.lIIIIlIlIIlIII[1]] = lIlllIIlIlIllll("KwIrPHlrXH4=", "XrOEV");
            SelectedProtocol.lIIIIlIlIIIlIl[SelectedProtocol.lIIIIlIlIIlIII[2]] = lIlllIIlIllIIII("XnAd2xRqAcQaNy1DAeo+QQ==", "VkERd");
            SelectedProtocol.lIIIIlIlIIIlIl[SelectedProtocol.lIIIIlIlIIlIII[3]] = lIlllIIlIllIIIl("Z/I2smUke5r9Gv7z6WLFhw==", "eEYih");
            SelectedProtocol.lIIIIlIlIIIlIl[SelectedProtocol.lIIIIlIlIIlIII[4]] = lIlllIIlIllIIIl("bMSWG5gtxFoBAkrGv8aQOw==", "wRNMs");
            SelectedProtocol.lIIIIlIlIIIlIl[SelectedProtocol.lIIIIlIlIIlIII[5]] = lIlllIIlIllIIII("azm6eEAHFbpZtYIQFNkkow==", "UlGsU");
            SelectedProtocol.lIIIIlIlIIIlIl[SelectedProtocol.lIIIIlIlIIlIII[6]] = lIlllIIlIlIllll("HgsePyEcCw==", "KEUqn");
            SelectedProtocol.lIIIIlIlIIIlIl[SelectedProtocol.lIIIIlIlIIlIII[7]] = lIlllIIlIlIllll("OBYNKD8aFg==", "mxfFP");
        }
        
        private static void lIlllIIllIIIIll() {
            (lIIIIlIlIIlIII = new int[9])[0] = ((0x4B ^ 0x78) & ~(0x59 ^ 0x6A));
            SelectedProtocol.lIIIIlIlIIlIII[1] = " ".length();
            SelectedProtocol.lIIIIlIlIIlIII[2] = "  ".length();
            SelectedProtocol.lIIIIlIlIIlIII[3] = "   ".length();
            SelectedProtocol.lIIIIlIlIIlIII[4] = (0x7 ^ 0xB ^ (0x90 ^ 0x98));
            SelectedProtocol.lIIIIlIlIIlIII[5] = (0xC0 ^ 0xC5);
            SelectedProtocol.lIIIIlIlIIlIII[6] = (56 + 86 - 63 + 104 ^ 56 + 100 - 79 + 100);
            SelectedProtocol.lIIIIlIlIIlIII[7] = (0x90 ^ 0x99 ^ (0x6D ^ 0x63));
            SelectedProtocol.lIIIIlIlIIlIII[8] = (0xCA ^ 0xC2);
        }
        
        private static boolean lIlllIIllIIIlII(final int lllllllllllllIlIIlIllIllIlIlIllI, final int lllllllllllllIlIIlIllIllIlIlIlIl) {
            return lllllllllllllIlIIlIllIllIlIlIllI < lllllllllllllIlIIlIllIllIlIlIlIl;
        }
        
        private static String lIlllIIlIllIIII(final String lllllllllllllIlIIlIllIlllIIIlIll, final String lllllllllllllIlIIlIllIlllIIIlIIl) {
            try {
                final SecretKeySpec lllllllllllllIlIIlIllIlllIIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIllIlllIIIlIIl.getBytes(StandardCharsets.UTF_8)), SelectedProtocol.lIIIIlIlIIlIII[8]), "DES");
                final Cipher lllllllllllllIlIIlIllIlllIIIlllI = Cipher.getInstance("DES");
                lllllllllllllIlIIlIllIlllIIIlllI.init(SelectedProtocol.lIIIIlIlIIlIII[2], lllllllllllllIlIIlIllIlllIIlIIII);
                return new String(lllllllllllllIlIIlIllIlllIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIllIlllIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIlIllIlllIIIllII) {
                lllllllllllllIlIIlIllIlllIIIllII.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIlllIIllIIIlIl(final int lllllllllllllIlIIlIllIllIlIlIIll) {
            return lllllllllllllIlIIlIllIllIlIlIIll != 0;
        }
        
        private static String lIlllIIlIlIllll(String lllllllllllllIlIIlIllIllIllIIIIl, final String lllllllllllllIlIIlIllIllIllIIIII) {
            lllllllllllllIlIIlIllIllIllIIIIl = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIlIllIllIllIIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIIlIllIllIllIIlII = new StringBuilder();
            final char[] lllllllllllllIlIIlIllIllIllIIIll = lllllllllllllIlIIlIllIllIllIIIII.toCharArray();
            int lllllllllllllIlIIlIllIllIllIIIlI = SelectedProtocol.lIIIIlIlIIlIII[0];
            final short lllllllllllllIlIIlIllIllIlIlllII = (Object)((String)lllllllllllllIlIIlIllIllIllIIIIl).toCharArray();
            final byte lllllllllllllIlIIlIllIllIlIllIll = (byte)lllllllllllllIlIIlIllIllIlIlllII.length;
            Exception lllllllllllllIlIIlIllIllIlIllIlI = (Exception)SelectedProtocol.lIIIIlIlIIlIII[0];
            while (lIlllIIllIIIlII((int)lllllllllllllIlIIlIllIllIlIllIlI, lllllllllllllIlIIlIllIllIlIllIll)) {
                final char lllllllllllllIlIIlIllIllIllIIlll = lllllllllllllIlIIlIllIllIlIlllII[lllllllllllllIlIIlIllIllIlIllIlI];
                lllllllllllllIlIIlIllIllIllIIlII.append((char)(lllllllllllllIlIIlIllIllIllIIlll ^ lllllllllllllIlIIlIllIllIllIIIll[lllllllllllllIlIIlIllIllIllIIIlI % lllllllllllllIlIIlIllIllIllIIIll.length]));
                "".length();
                ++lllllllllllllIlIIlIllIllIllIIIlI;
                ++lllllllllllllIlIIlIllIllIlIllIlI;
                "".length();
                if (((0x4B ^ 0x11) & ~(0x5F ^ 0x5)) < -" ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIIlIllIllIllIIlII);
        }
        
        public static SelectedProtocol protocol(final String lllllllllllllIlIIlIllIlllIlIlIII) {
            final SelectedProtocol[] lllllllllllllIlIIlIllIlllIlIllII = values();
            final int lllllllllllllIlIIlIllIlllIlIlIll = lllllllllllllIlIIlIllIlllIlIllII.length;
            int lllllllllllllIlIIlIllIlllIlIlIlI = SelectedProtocol.lIIIIlIlIIlIII[0];
            while (lIlllIIllIIIlII(lllllllllllllIlIIlIllIlllIlIlIlI, lllllllllllllIlIIlIllIlllIlIlIll)) {
                final SelectedProtocol lllllllllllllIlIIlIllIlllIlIllIl = lllllllllllllIlIIlIllIlllIlIllII[lllllllllllllIlIIlIllIlllIlIlIlI];
                if (lIlllIIllIIIlIl(lllllllllllllIlIIlIllIlllIlIllIl.protocolName().equals(lllllllllllllIlIIlIllIlllIlIlIII) ? 1 : 0)) {
                    return lllllllllllllIlIIlIllIlllIlIllIl;
                }
                ++lllllllllllllIlIIlIllIlllIlIlIlI;
                "".length();
                if ("  ".length() > "   ".length()) {
                    return null;
                }
            }
            return SelectedProtocol.UNKNOWN;
        }
        
        static {
            lIlllIIllIIIIll();
            lIlllIIlIllIIlI();
            final SelectedProtocol[] $values = new SelectedProtocol[SelectedProtocol.lIIIIlIlIIlIII[4]];
            $values[SelectedProtocol.lIIIIlIlIIlIII[0]] = SelectedProtocol.SPDY_3_1;
            $values[SelectedProtocol.lIIIIlIlIIlIII[1]] = SelectedProtocol.HTTP_1_1;
            $values[SelectedProtocol.lIIIIlIlIIlIII[2]] = SelectedProtocol.HTTP_1_0;
            $values[SelectedProtocol.lIIIIlIlIIlIII[3]] = SelectedProtocol.UNKNOWN;
            $VALUES = $values;
        }
    }
}
