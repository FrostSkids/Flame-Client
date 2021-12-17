// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.channel.ChannelFutureListener;
import io.netty.buffer.Unpooled;
import java.util.Arrays;
import java.util.List;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.handler.codec.CorruptedFrameException;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.TooLongFrameException;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.ReplayingDecoder;

public class WebSocket08FrameDecoder extends ReplayingDecoder<State> implements WebSocketFrameDecoder
{
    private /* synthetic */ ByteBuf framePayload;
    private /* synthetic */ ByteBuf payloadBuffer;
    private /* synthetic */ boolean receivedClosingHandshake;
    private static final /* synthetic */ int[] lIlIlIllllIlII;
    private /* synthetic */ Utf8Validator utf8Validator;
    private /* synthetic */ int frameOpcode;
    private final /* synthetic */ boolean maskedPayload;
    private /* synthetic */ long framePayloadLength;
    private final /* synthetic */ long maxFramePayloadLength;
    private /* synthetic */ int fragmentedFramesCount;
    private static final /* synthetic */ InternalLogger logger;
    private /* synthetic */ int framePayloadBytesRead;
    private /* synthetic */ boolean frameFinalFlag;
    private static final /* synthetic */ String[] lIlIlIlllIllIl;
    private final /* synthetic */ boolean allowExtensions;
    private /* synthetic */ int frameRsv;
    private /* synthetic */ byte[] maskingKey;
    
    private static int toFrameLength(final long lllllllllllllIIIIllllIlIlllIIlIl) {
        if (lllIllllllIIIII(lllIllllllIIlII(lllllllllllllIIIIllllIlIlllIIlIl, 2147483647L))) {
            throw new TooLongFrameException(String.valueOf(new StringBuilder().append(WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[22]]).append(lllllllllllllIIIIllllIlIlllIIlIl)));
        }
        return (int)lllllllllllllIIIIllllIlIlllIIlIl;
    }
    
    private static boolean lllIlllllIllIll(final int lllllllllllllIIIIllllIlIIlllIIlI) {
        return lllllllllllllIIIIllllIlIIlllIIlI == 0;
    }
    
    private void checkUTF8String(final ChannelHandlerContext lllllllllllllIIIIllllIlIllIlllIl, final ByteBuf lllllllllllllIIIIllllIlIllIlllII) {
        try {
            if (lllIllllllIIIIl(this.utf8Validator)) {
                this.utf8Validator = new Utf8Validator();
            }
            this.utf8Validator.check(lllllllllllllIIIIllllIlIllIlllII);
            "".length();
            if (((31 + 32 + 53 + 28 ^ 98 + 48 - 8 + 23) & (0xF7 ^ 0xC3 ^ (0x7B ^ 0x7E) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        catch (CorruptedFrameException lllllllllllllIIIIllllIlIllIlllll) {
            this.protocolViolation(lllllllllllllIIIIllllIlIllIlllIl, lllllllllllllIIIIllllIlIllIlllll);
        }
    }
    
    private static int lllIlllllIllIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private void protocolViolation(final ChannelHandlerContext lllllllllllllIIIIllllIlIllllIIIl, final String lllllllllllllIIIIllllIlIllllIIII) {
        this.protocolViolation(lllllllllllllIIIIllllIlIllllIIIl, new CorruptedFrameException(lllllllllllllIIIIllllIlIllllIIII));
    }
    
    private static String lllIlllllIIllII(final String lllllllllllllIIIIllllIlIlIIllllI, final String lllllllllllllIIIIllllIlIlIIlllIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIllllIlIlIlIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllllIlIlIIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIllllIlIlIlIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIllllIlIlIlIIIlI.init(WebSocket08FrameDecoder.lIlIlIllllIlII[7], lllllllllllllIIIIllllIlIlIlIIIll);
            return new String(lllllllllllllIIIIllllIlIlIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllllIlIlIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllllIlIlIlIIIIl) {
            lllllllllllllIIIIllllIlIlIlIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIlllllIlllll(final int lllllllllllllIIIIllllIlIIllIlllI) {
        return lllllllllllllIIIIllllIlIIllIlllI < 0;
    }
    
    private static int lllIllllllIIlII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static void lllIlllllIlIIlI() {
        (lIlIlIlllIllIl = new String[WebSocket08FrameDecoder.lIlIlIllllIlII[30]])[WebSocket08FrameDecoder.lIlIlIllllIlII[0]] = lllIlllllIIlIlI("VxnmHx7YhmgNgs222tsDcvvDRaBAR7gSGBJ2eQYxczzGzKnt6sE2sQ==", "VqfJu");
        WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[2]] = lllIlllllIIlIll("ORkXcmxWanFyLAUuYTwiSy85JigFOSg9I0skJDUiHyMgJigPZmEAHj1w", "kJARM");
        WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[7]] = lllIlllllIIlIlI("GTb/RpmLxDbExnUA7fVmN1McQQ/kV/k44kP0M1AA/Ts=", "OVgmX");
        WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[9]] = lllIlllllIIlIll("MRQMDDsyCBkOMncFAgUiJQkBSzAlBwAO", "WfmkV");
        WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[4]] = lllIlllllIIlIll("ADoWGzAMOVgJMAI4HU81CiEQTzICLBQAIwd1FAosBCEQT3xDZEpaYgw2DAo2EA==", "cUxoB");
        WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[14]] = lllIlllllIIllII("QUDIHLqK8vg3UpOws+Oa0/hshbK/VuO73bZ7lR8v0WU+4eoT1EI6Hw==", "HjwTM");
        WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[15]] = lllIlllllIIlIll("ADIJKj4EMg5vNB44GSp3ETgEOyUdO0opJRM6D28gGyMCbycTLgYgNhZ3Bio5UmY=", "rWjOW");
        WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[8]] = lllIlllllIIlIll("ECQHMUgSNxI9DVQwADkGE2UBNRsRNwU1DFQqAzMHECBT", "tEsPh");
        WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[11]] = lllIlllllIIlIll("ASkXKwYFKRBuDBwiACcBBi0AJwAdbBAvGxJsEjwOHilUIRoHPx0qClMqBi8IHikaOgoXbBkrHAAtEys=", "sLtNo");
        WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[12]] = lllIlllllIIlIll("KiAtLR0uICpoGjcrYysbNjEnJgE5MScnGnghLzwVeCM8KRk9ZTkgHTQgbiEaKywqLVQ+Ny8vGT0rOi0QeCgrOwc5Iis=", "XENHt");
        WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[13]] = lllIlllllIIllII("9LvFo4CoMyQ1+uDCgmBqZEsyz/+TqCZVWtrvasF5RXTB6zN12cakQCfuC2FKi4Uz549yqrGiAMAr3exVL5nvLA==", "rCPRM");
        WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[17]] = lllIlllllIIlIlI("zgk/tnBZqWIvBa7blGZGUY2ovN9dLUcRRcsaIuFZXRuLFxNrE4tbsL6e0QJCFEORVAQt947zze9mbPmDA8gA9g==", "yZlBS");
        WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[18]] = lllIlllllIIlIll("CS4hUgQ2LjQXQigqNxUWLG82FEI=", "DOYrb");
        WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[19]] = lllIlllllIIlIll("WB0JElYaEA0PVh0NCwQTHBAMTw==", "xuhav");
        WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[20]] = lllIlllllIIlIll("KwgKAi8GAw5NHAoPOgIoBAgdTQ0dDAQIawMIBwo/B1ASEA==", "omimK");
        WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[5]] = lllIlllllIIlIll("BBAPOBczUQUzGygVBHYPIhNBJRckGgQiWCEDADsdZwYIIhBnHhE1FyMUW3Y=", "GqaVx");
        WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[21]] = lllIlllllIIlIll("KwshEB0cDWkRUQoGLwYZWAsrFxRW", "xcNeq");
        WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[22]] = lllIlllllIIllII("wnOz2U4bJ2c=", "SwXCB");
        WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[23]] = lllIlllllIIlIlI("ZKyNhNzodw5QIxrpGcRfM5fjZcX6EC9tem+HRd3nIVY=", "yKXly");
        WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[29]] = lllIlllllIIlIlI("XbZxPnBv3ENsxLDiZVnXj5BuBf3+gcKkoW/htFPuIS+np1kB9GQDXg==", "yyGSh");
    }
    
    protected void checkCloseFrameBody(final ChannelHandlerContext lllllllllllllIIIIllllIlIllIIlIlI, final ByteBuf lllllllllllllIIIIllllIlIllIIlIIl) {
        if (!lllIllllllIIIlI(lllllllllllllIIIIllllIlIllIIlIIl) || lllIlllllIllIll(lllllllllllllIIIIllllIlIllIIlIIl.isReadable() ? 1 : 0)) {
            return;
        }
        if (lllIlllllIllllI(lllllllllllllIIIIllllIlIllIIlIIl.readableBytes(), WebSocket08FrameDecoder.lIlIlIllllIlII[2])) {
            this.protocolViolation(lllllllllllllIIIIllllIlIllIIlIlI, WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[23]]);
        }
        final int lllllllllllllIIIIllllIlIllIIllIl = lllllllllllllIIIIllllIlIllIIlIIl.readerIndex();
        lllllllllllllIIIIllllIlIllIIlIIl.readerIndex(WebSocket08FrameDecoder.lIlIlIllllIlII[0]);
        "".length();
        final int lllllllllllllIIIIllllIlIllIIllII = lllllllllllllIIIIllllIlIllIIlIIl.readShort();
        if ((lllIllllllIIlIl(lllllllllllllIIIIllllIlIllIIllII) && !lllIlllllIlllII(lllllllllllllIIIIllllIlIllIIllII, WebSocket08FrameDecoder.lIlIlIllllIlII[24])) || (lllIllllllIIllI(lllllllllllllIIIIllllIlIllIIllII, WebSocket08FrameDecoder.lIlIlIllllIlII[25]) && !lllIlllllIlllII(lllllllllllllIIIIllllIlIllIIllII, WebSocket08FrameDecoder.lIlIlIllllIlII[26])) || (lllIllllllIIllI(lllllllllllllIIIIllllIlIllIIllII, WebSocket08FrameDecoder.lIlIlIllllIlII[27]) && lllIllllllIIlll(lllllllllllllIIIIllllIlIllIIllII, WebSocket08FrameDecoder.lIlIlIllllIlII[28]))) {
            this.protocolViolation(lllllllllllllIIIIllllIlIllIIlIlI, String.valueOf(new StringBuilder().append(WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[29]]).append(lllllllllllllIIIIllllIlIllIIllII)));
        }
        if (lllIlllllIllIlI(lllllllllllllIIIIllllIlIllIIlIIl.isReadable() ? 1 : 0)) {
            try {
                new Utf8Validator().check(lllllllllllllIIIIllllIlIllIIlIIl);
                "".length();
                if (-(0x6E ^ 0x6B) >= 0) {
                    return;
                }
            }
            catch (CorruptedFrameException lllllllllllllIIIIllllIlIllIlIIIl) {
                this.protocolViolation(lllllllllllllIIIIllllIlIllIIlIlI, lllllllllllllIIIIllllIlIllIlIIIl);
            }
        }
        lllllllllllllIIIIllllIlIllIIlIIl.readerIndex(lllllllllllllIIIIllllIlIllIIllIl);
        "".length();
    }
    
    private static boolean lllIllllllIIIlI(final Object lllllllllllllIIIIllllIlIIllllIII) {
        return lllllllllllllIIIIllllIlIIllllIII != null;
    }
    
    private static boolean lllIllllllIIlIl(final int lllllllllllllIIIIllllIlIIlllIIII) {
        return lllllllllllllIIIIllllIlIIlllIIII >= 0;
    }
    
    private static boolean lllIllllllIIIll(final int lllllllllllllIIIIllllIlIlIIIIIll, final int lllllllllllllIIIIllllIlIlIIIIIlI) {
        return lllllllllllllIIIIllllIlIlIIIIIll < lllllllllllllIIIIllllIlIlIIIIIlI;
    }
    
    private static boolean lllIllllllIIlll(final int lllllllllllllIIIIllllIlIIlllllll, final int lllllllllllllIIIIllllIlIIllllllI) {
        return lllllllllllllIIIIllllIlIIlllllll <= lllllllllllllIIIIllllIlIIllllllI;
    }
    
    private static boolean lllIllllllIIIIl(final Object lllllllllllllIIIIllllIlIIlllIllI) {
        return lllllllllllllIIIIllllIlIIlllIllI == null;
    }
    
    private void unmask(final ByteBuf lllllllllllllIIIIllllIlIllllllII) {
        int lllllllllllllIIIIllllIlIlllllllI = lllllllllllllIIIIllllIlIllllllII.readerIndex();
        while (lllIllllllIIIll(lllllllllllllIIIIllllIlIlllllllI, lllllllllllllIIIIllllIlIllllllII.writerIndex())) {
            lllllllllllllIIIIllllIlIllllllII.setByte(lllllllllllllIIIIllllIlIlllllllI, lllllllllllllIIIIllllIlIllllllII.getByte(lllllllllllllIIIIllllIlIlllllllI) ^ this.maskingKey[lllllllllllllIIIIllllIlIlllllllI % WebSocket08FrameDecoder.lIlIlIllllIlII[4]]);
            "".length();
            ++lllllllllllllIIIIllllIlIlllllllI;
            "".length();
            if ((110 + 3 - 24 + 61 ^ 105 + 3 + 5 + 33) < "  ".length()) {
                return;
            }
        }
    }
    
    @Override
    protected void decode(final ChannelHandlerContext lllllllllllllIIIIllllIllIIIIllIl, final ByteBuf lllllllllllllIIIIllllIllIIIIlIII, final List<Object> lllllllllllllIIIIllllIllIIIIlIll) throws Exception {
        if (lllIlllllIllIlI(this.receivedClosingHandshake ? 1 : 0)) {
            lllllllllllllIIIIllllIllIIIIlIII.skipBytes(this.actualReadableBytes());
            "".length();
            return;
        }
        try {
            switch (WebSocket08FrameDecoder$1.$SwitchMap$io$netty$handler$codec$http$websocketx$WebSocket08FrameDecoder$State[this.state().ordinal()]) {
                case 1: {
                    this.framePayloadBytesRead = WebSocket08FrameDecoder.lIlIlIllllIlII[0];
                    this.framePayloadLength = -1L;
                    this.framePayload = null;
                    this.payloadBuffer = null;
                    byte lllllllllllllIIIIllllIllIIIlIlII = lllllllllllllIIIIllllIllIIIIlIII.readByte();
                    int frameFinalFlag;
                    if (lllIlllllIllIlI(lllllllllllllIIIIllllIllIIIlIlII & WebSocket08FrameDecoder.lIlIlIllllIlII[1])) {
                        frameFinalFlag = WebSocket08FrameDecoder.lIlIlIllllIlII[2];
                        "".length();
                        if (((0xC1 ^ 0xC7 ^ (0x11 ^ 0x1F)) & (0x70 ^ 0x56 ^ (0x6 ^ 0x28) ^ -" ".length())) != 0x0) {
                            return;
                        }
                    }
                    else {
                        frameFinalFlag = WebSocket08FrameDecoder.lIlIlIllllIlII[0];
                    }
                    this.frameFinalFlag = (frameFinalFlag != 0);
                    this.frameRsv = (lllllllllllllIIIIllllIllIIIlIlII & WebSocket08FrameDecoder.lIlIlIllllIlII[3]) >> WebSocket08FrameDecoder.lIlIlIllllIlII[4];
                    this.frameOpcode = (lllllllllllllIIIIllllIllIIIlIlII & WebSocket08FrameDecoder.lIlIlIllllIlII[5]);
                    if (lllIlllllIllIlI(WebSocket08FrameDecoder.logger.isDebugEnabled() ? 1 : 0)) {
                        WebSocket08FrameDecoder.logger.debug(WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[0]], (Object)this.frameOpcode);
                    }
                    lllllllllllllIIIIllllIllIIIlIlII = lllllllllllllIIIIllllIllIIIIlIII.readByte();
                    int n;
                    if (lllIlllllIllIlI(lllllllllllllIIIIllllIllIIIlIlII & WebSocket08FrameDecoder.lIlIlIllllIlII[1])) {
                        n = WebSocket08FrameDecoder.lIlIlIllllIlII[2];
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    else {
                        n = WebSocket08FrameDecoder.lIlIlIllllIlII[0];
                    }
                    final boolean lllllllllllllIIIIllllIllIIIlIIll = n != 0;
                    final int lllllllllllllIIIIllllIllIIIlIIlI = lllllllllllllIIIIllllIllIIIlIlII & WebSocket08FrameDecoder.lIlIlIllllIlII[6];
                    if (lllIlllllIllIlI(this.frameRsv) && lllIlllllIllIll(this.allowExtensions ? 1 : 0)) {
                        this.protocolViolation(lllllllllllllIIIIllllIllIIIIllIl, String.valueOf(new StringBuilder().append(WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[2]]).append(this.frameRsv)));
                        return;
                    }
                    if (lllIlllllIllIlI(this.maskedPayload ? 1 : 0) && lllIlllllIllIll(lllllllllllllIIIIllllIllIIIlIIll ? 1 : 0)) {
                        this.protocolViolation(lllllllllllllIIIIllllIllIIIIllIl, WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[7]]);
                        return;
                    }
                    if (lllIlllllIlllII(this.frameOpcode, WebSocket08FrameDecoder.lIlIlIllllIlII[8])) {
                        if (lllIlllllIllIll(this.frameFinalFlag ? 1 : 0)) {
                            this.protocolViolation(lllllllllllllIIIIllllIllIIIIllIl, WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[9]]);
                            return;
                        }
                        if (lllIlllllIlllII(lllllllllllllIIIIllllIllIIIlIIlI, WebSocket08FrameDecoder.lIlIlIllllIlII[10])) {
                            this.protocolViolation(lllllllllllllIIIIllllIllIIIIllIl, WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[4]]);
                            return;
                        }
                        if (lllIlllllIlllIl(this.frameOpcode, WebSocket08FrameDecoder.lIlIlIllllIlII[11]) && lllIlllllIlllIl(this.frameOpcode, WebSocket08FrameDecoder.lIlIlIllllIlII[12]) && lllIlllllIlllIl(this.frameOpcode, WebSocket08FrameDecoder.lIlIlIllllIlII[13])) {
                            this.protocolViolation(lllllllllllllIIIIllllIllIIIIllIl, String.valueOf(new StringBuilder().append(WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[14]]).append(this.frameOpcode)));
                            return;
                        }
                        if (lllIlllllIllllI(this.frameOpcode, WebSocket08FrameDecoder.lIlIlIllllIlII[11]) && lllIlllllIllllI(lllllllllllllIIIIllllIllIIIlIIlI, WebSocket08FrameDecoder.lIlIlIllllIlII[2])) {
                            this.protocolViolation(lllllllllllllIIIIllllIllIIIIllIl, WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[15]]);
                            return;
                        }
                    }
                    else {
                        if (lllIlllllIllIlI(this.frameOpcode) && lllIlllllIlllIl(this.frameOpcode, WebSocket08FrameDecoder.lIlIlIllllIlII[2]) && lllIlllllIlllIl(this.frameOpcode, WebSocket08FrameDecoder.lIlIlIllllIlII[7])) {
                            this.protocolViolation(lllllllllllllIIIIllllIllIIIIllIl, String.valueOf(new StringBuilder().append(WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[8]]).append(this.frameOpcode)));
                            return;
                        }
                        if (lllIlllllIllIll(this.fragmentedFramesCount) && lllIlllllIllIll(this.frameOpcode)) {
                            this.protocolViolation(lllllllllllllIIIIllllIllIIIIllIl, WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[11]]);
                            return;
                        }
                        if (lllIlllllIllIlI(this.fragmentedFramesCount) && lllIlllllIllIlI(this.frameOpcode) && lllIlllllIlllIl(this.frameOpcode, WebSocket08FrameDecoder.lIlIlIllllIlII[12])) {
                            this.protocolViolation(lllllllllllllIIIIllllIllIIIIllIl, WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[12]]);
                            return;
                        }
                    }
                    if (lllIlllllIllllI(lllllllllllllIIIIllllIllIIIlIIlI, WebSocket08FrameDecoder.lIlIlIllllIlII[16])) {
                        this.framePayloadLength = lllllllllllllIIIIllllIllIIIIlIII.readUnsignedShort();
                        if (lllIlllllIlllll(lllIlllllIllIIl(this.framePayloadLength, 126L))) {
                            this.protocolViolation(lllllllllllllIIIIllllIllIIIIllIl, WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[13]]);
                            return;
                        }
                    }
                    else if (lllIlllllIllllI(lllllllllllllIIIIllllIllIIIlIIlI, WebSocket08FrameDecoder.lIlIlIllllIlII[6])) {
                        this.framePayloadLength = lllllllllllllIIIIllllIllIIIIlIII.readLong();
                        if (lllIlllllIlllll(lllIlllllIllIIl(this.framePayloadLength, 65536L))) {
                            this.protocolViolation(lllllllllllllIIIIllllIllIIIIllIl, WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[17]]);
                            return;
                        }
                    }
                    else {
                        this.framePayloadLength = lllllllllllllIIIIllllIllIIIlIIlI;
                    }
                    if (lllIllllllIIIII(lllIlllllIllIIl(this.framePayloadLength, this.maxFramePayloadLength))) {
                        this.protocolViolation(lllllllllllllIIIIllllIllIIIIllIl, String.valueOf(new StringBuilder().append(WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[18]]).append(this.maxFramePayloadLength).append(WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[19]])));
                        return;
                    }
                    if (lllIlllllIllIlI(WebSocket08FrameDecoder.logger.isDebugEnabled() ? 1 : 0)) {
                        WebSocket08FrameDecoder.logger.debug(WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[20]], (Object)this.framePayloadLength);
                    }
                    this.checkpoint(State.MASKING_KEY);
                }
                case 2: {
                    if (lllIlllllIllIlI(this.maskedPayload ? 1 : 0)) {
                        if (lllIllllllIIIIl(this.maskingKey)) {
                            this.maskingKey = new byte[WebSocket08FrameDecoder.lIlIlIllllIlII[4]];
                        }
                        lllllllllllllIIIIllllIllIIIIlIII.readBytes(this.maskingKey);
                        "".length();
                    }
                    this.checkpoint(State.PAYLOAD);
                }
                case 3: {
                    final int lllllllllllllIIIIllllIllIIIlIIIl = this.actualReadableBytes();
                    final long lllllllllllllIIIIllllIllIIIlIIII = this.framePayloadBytesRead + lllllllllllllIIIIllllIllIIIlIIIl;
                    if (lllIlllllIllIll(lllIlllllIllIIl(lllllllllllllIIIIllllIllIIIlIIII, this.framePayloadLength))) {
                        this.payloadBuffer = lllllllllllllIIIIllllIllIIIIllIl.alloc().buffer(lllllllllllllIIIIllllIllIIIlIIIl);
                        this.payloadBuffer.writeBytes(lllllllllllllIIIIllllIllIIIIlIII, lllllllllllllIIIIllllIllIIIlIIIl);
                        "".length();
                        "".length();
                        if (" ".length() < 0) {
                            return;
                        }
                    }
                    else {
                        if (lllIlllllIlllll(lllIlllllIllIIl(lllllllllllllIIIIllllIllIIIlIIII, this.framePayloadLength))) {
                            if (lllIllllllIIIIl(this.framePayload)) {
                                this.framePayload = lllllllllllllIIIIllllIllIIIIllIl.alloc().buffer(toFrameLength(this.framePayloadLength));
                            }
                            this.framePayload.writeBytes(lllllllllllllIIIIllllIllIIIIlIII, lllllllllllllIIIIllllIllIIIlIIIl);
                            "".length();
                            this.framePayloadBytesRead += lllllllllllllIIIIllllIllIIIlIIIl;
                            return;
                        }
                        if (lllIllllllIIIII(lllIlllllIllIIl(lllllllllllllIIIIllllIllIIIlIIII, this.framePayloadLength))) {
                            if (lllIllllllIIIIl(this.framePayload)) {
                                this.framePayload = lllllllllllllIIIIllllIllIIIIllIl.alloc().buffer(toFrameLength(this.framePayloadLength));
                            }
                            this.framePayload.writeBytes(lllllllllllllIIIIllllIllIIIIlIII, toFrameLength(this.framePayloadLength - this.framePayloadBytesRead));
                            "".length();
                        }
                    }
                    this.checkpoint(State.FRAME_START);
                    if (lllIllllllIIIIl(this.framePayload)) {
                        this.framePayload = this.payloadBuffer;
                        this.payloadBuffer = null;
                        "".length();
                        if ((0x4B ^ 0x4D ^ "  ".length()) == " ".length()) {
                            return;
                        }
                    }
                    else if (lllIllllllIIIlI(this.payloadBuffer)) {
                        this.framePayload.writeBytes(this.payloadBuffer);
                        "".length();
                        this.payloadBuffer.release();
                        "".length();
                        this.payloadBuffer = null;
                    }
                    if (lllIlllllIllIlI(this.maskedPayload ? 1 : 0)) {
                        this.unmask(this.framePayload);
                    }
                    if (lllIlllllIllllI(this.frameOpcode, WebSocket08FrameDecoder.lIlIlIllllIlII[12])) {
                        lllllllllllllIIIIllllIllIIIIlIll.add(new PingWebSocketFrame(this.frameFinalFlag, this.frameRsv, this.framePayload));
                        "".length();
                        this.framePayload = null;
                        return;
                    }
                    if (lllIlllllIllllI(this.frameOpcode, WebSocket08FrameDecoder.lIlIlIllllIlII[13])) {
                        lllllllllllllIIIIllllIllIIIIlIll.add(new PongWebSocketFrame(this.frameFinalFlag, this.frameRsv, this.framePayload));
                        "".length();
                        this.framePayload = null;
                        return;
                    }
                    if (lllIlllllIllllI(this.frameOpcode, WebSocket08FrameDecoder.lIlIlIllllIlII[11])) {
                        this.checkCloseFrameBody(lllllllllllllIIIIllllIllIIIIllIl, this.framePayload);
                        this.receivedClosingHandshake = (WebSocket08FrameDecoder.lIlIlIllllIlII[2] != 0);
                        lllllllllllllIIIIllllIllIIIIlIll.add(new CloseWebSocketFrame(this.frameFinalFlag, this.frameRsv, this.framePayload));
                        "".length();
                        this.framePayload = null;
                        return;
                    }
                    if (lllIlllllIllIlI(this.frameFinalFlag ? 1 : 0)) {
                        if (lllIlllllIlllIl(this.frameOpcode, WebSocket08FrameDecoder.lIlIlIllllIlII[12])) {
                            this.fragmentedFramesCount = WebSocket08FrameDecoder.lIlIlIllllIlII[0];
                            if (!lllIlllllIlllIl(this.frameOpcode, WebSocket08FrameDecoder.lIlIlIllllIlII[2]) || (lllIllllllIIIlI(this.utf8Validator) && lllIlllllIllIlI(this.utf8Validator.isChecking() ? 1 : 0))) {
                                this.checkUTF8String(lllllllllllllIIIIllllIllIIIIllIl, this.framePayload);
                                this.utf8Validator.finish();
                                "".length();
                                if ("  ".length() == 0) {
                                    return;
                                }
                            }
                        }
                    }
                    else {
                        if (lllIlllllIllIll(this.fragmentedFramesCount)) {
                            if (lllIlllllIllllI(this.frameOpcode, WebSocket08FrameDecoder.lIlIlIllllIlII[2])) {
                                this.checkUTF8String(lllllllllllllIIIIllllIllIIIIllIl, this.framePayload);
                                "".length();
                                if ("  ".length() == -" ".length()) {
                                    return;
                                }
                            }
                        }
                        else if (lllIllllllIIIlI(this.utf8Validator) && lllIlllllIllIlI(this.utf8Validator.isChecking() ? 1 : 0)) {
                            this.checkUTF8String(lllllllllllllIIIIllllIllIIIIllIl, this.framePayload);
                        }
                        this.fragmentedFramesCount += WebSocket08FrameDecoder.lIlIlIllllIlII[2];
                    }
                    if (lllIlllllIllllI(this.frameOpcode, WebSocket08FrameDecoder.lIlIlIllllIlII[2])) {
                        lllllllllllllIIIIllllIllIIIIlIll.add(new TextWebSocketFrame(this.frameFinalFlag, this.frameRsv, this.framePayload));
                        "".length();
                        this.framePayload = null;
                        return;
                    }
                    if (lllIlllllIllllI(this.frameOpcode, WebSocket08FrameDecoder.lIlIlIllllIlII[7])) {
                        lllllllllllllIIIIllllIllIIIIlIll.add(new BinaryWebSocketFrame(this.frameFinalFlag, this.frameRsv, this.framePayload));
                        "".length();
                        this.framePayload = null;
                        return;
                    }
                    if (lllIlllllIllIll(this.frameOpcode)) {
                        lllllllllllllIIIIllllIllIIIIlIll.add(new ContinuationWebSocketFrame(this.frameFinalFlag, this.frameRsv, this.framePayload));
                        "".length();
                        this.framePayload = null;
                        return;
                    }
                    throw new UnsupportedOperationException(String.valueOf(new StringBuilder().append(WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[5]]).append(this.frameOpcode)));
                }
                case 4: {
                    lllllllllllllIIIIllllIllIIIIlIII.readByte();
                    "".length();
                }
                default: {
                    throw new Error(WebSocket08FrameDecoder.lIlIlIlllIllIl[WebSocket08FrameDecoder.lIlIlIllllIlII[21]]);
                }
            }
        }
        catch (Exception lllllllllllllIIIIllllIllIIIIllll) {
            if (lllIllllllIIIlI(this.payloadBuffer)) {
                if (lllIllllllIIIII(this.payloadBuffer.refCnt())) {
                    this.payloadBuffer.release();
                    "".length();
                }
                this.payloadBuffer = null;
            }
            if (lllIllllllIIIlI(this.framePayload)) {
                if (lllIllllllIIIII(this.framePayload.refCnt())) {
                    this.framePayload.release();
                    "".length();
                }
                this.framePayload = null;
            }
            throw lllllllllllllIIIIllllIllIIIIllll;
        }
    }
    
    private static boolean lllIlllllIlllIl(final int lllllllllllllIIIIllllIlIIllIlIIl, final int lllllllllllllIIIIllllIlIIllIlIII) {
        return lllllllllllllIIIIllllIlIIllIlIIl != lllllllllllllIIIIllllIlIIllIlIII;
    }
    
    private static String lllIlllllIIlIlI(final String lllllllllllllIIIIllllIlIlIIlIIll, final String lllllllllllllIIIIllllIlIlIIlIIII) {
        try {
            final SecretKeySpec lllllllllllllIIIIllllIlIlIIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllllIlIlIIlIIII.getBytes(StandardCharsets.UTF_8)), WebSocket08FrameDecoder.lIlIlIllllIlII[11]), "DES");
            final Cipher lllllllllllllIIIIllllIlIlIIlIlIl = Cipher.getInstance("DES");
            lllllllllllllIIIIllllIlIlIIlIlIl.init(WebSocket08FrameDecoder.lIlIlIllllIlII[7], lllllllllllllIIIIllllIlIlIIlIllI);
            return new String(lllllllllllllIIIIllllIlIlIIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllllIlIlIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllllIlIlIIlIlII) {
            lllllllllllllIIIIllllIlIlIIlIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIllllllIIIII(final int lllllllllllllIIIIllllIlIIllIllII) {
        return lllllllllllllIIIIllllIlIIllIllII > 0;
    }
    
    private static void lllIlllllIllIII() {
        (lIlIlIllllIlII = new int[31])[0] = ((0x18 ^ 0x5D) & ~(0x2F ^ 0x6A));
        WebSocket08FrameDecoder.lIlIlIllllIlII[1] = 28 + 122 - 38 + 16;
        WebSocket08FrameDecoder.lIlIlIllllIlII[2] = " ".length();
        WebSocket08FrameDecoder.lIlIlIllllIlII[3] = (0x7D ^ 0x3F ^ (0x7A ^ 0x48));
        WebSocket08FrameDecoder.lIlIlIllllIlII[4] = (0x93 ^ 0xAD ^ (0x86 ^ 0xBC));
        WebSocket08FrameDecoder.lIlIlIllllIlII[5] = (0xB2 ^ 0xBD);
        WebSocket08FrameDecoder.lIlIlIllllIlII[6] = 66 + 112 - 117 + 66;
        WebSocket08FrameDecoder.lIlIlIllllIlII[7] = "  ".length();
        WebSocket08FrameDecoder.lIlIlIllllIlII[8] = (161 + 18 - 131 + 117 ^ 60 + 66 - 114 + 150);
        WebSocket08FrameDecoder.lIlIlIllllIlII[9] = "   ".length();
        WebSocket08FrameDecoder.lIlIlIllllIlII[10] = (159 + 116 - 99 + 52 ^ 150 + 43 - 185 + 145);
        WebSocket08FrameDecoder.lIlIlIllllIlII[11] = (79 + 146 - 73 + 21 ^ 142 + 63 - 155 + 115);
        WebSocket08FrameDecoder.lIlIlIllllIlII[12] = (0xF0 ^ 0x9D ^ (0xFF ^ 0x9B));
        WebSocket08FrameDecoder.lIlIlIllllIlII[13] = (0xAB ^ 0xA1);
        WebSocket08FrameDecoder.lIlIlIllllIlII[14] = (125 + 148 - 174 + 76 ^ 12 + 137 - 52 + 73);
        WebSocket08FrameDecoder.lIlIlIllllIlII[15] = (0x73 ^ 0x75);
        WebSocket08FrameDecoder.lIlIlIllllIlII[16] = (0x6F ^ 0x11);
        WebSocket08FrameDecoder.lIlIlIllllIlII[17] = (0x0 ^ 0xB ^ ((0x4 ^ 0x4F) & ~(0x3E ^ 0x75)));
        WebSocket08FrameDecoder.lIlIlIllllIlII[18] = (2 + 118 - 6 + 18 ^ 122 + 53 - 156 + 117);
        WebSocket08FrameDecoder.lIlIlIllllIlII[19] = (0x1C ^ 0x18 ^ (0x27 ^ 0x2E));
        WebSocket08FrameDecoder.lIlIlIllllIlII[20] = (0x3D ^ 0x33);
        WebSocket08FrameDecoder.lIlIlIllllIlII[21] = (0x3C ^ 0x60 ^ (0x59 ^ 0x15));
        WebSocket08FrameDecoder.lIlIlIllllIlII[22] = (0x2C ^ 0x42 ^ 115 + 26 - 53 + 39);
        WebSocket08FrameDecoder.lIlIlIllllIlII[23] = (0x38 ^ 0x42 ^ (0x2B ^ 0x43));
        WebSocket08FrameDecoder.lIlIlIllllIlII[24] = (0xFFFF97E7 & 0x6BFF);
        WebSocket08FrameDecoder.lIlIlIllllIlII[25] = (-(0xFFFF9677 & 0x799B) & (0xFFFFBBFE & 0x57FF));
        WebSocket08FrameDecoder.lIlIlIllllIlII[26] = (0xFFFFEBEE & 0x17FF);
        WebSocket08FrameDecoder.lIlIlIllllIlII[27] = (0xFFFFE3F4 & 0x1FFF);
        WebSocket08FrameDecoder.lIlIlIllllIlII[28] = (0xFFFF9BBF & 0x6FF7);
        WebSocket08FrameDecoder.lIlIlIllllIlII[29] = (0x41 ^ 0x55 ^ (0x3A ^ 0x3D));
        WebSocket08FrameDecoder.lIlIlIllllIlII[30] = (0x72 ^ 0x7B ^ (0x18 ^ 0x5));
    }
    
    private void protocolViolation(final ChannelHandlerContext lllllllllllllIIIIllllIlIlllIlIII, final CorruptedFrameException lllllllllllllIIIIllllIlIlllIlIlI) {
        this.checkpoint(State.CORRUPT);
        if (lllIlllllIllIlI(lllllllllllllIIIIllllIlIlllIlIII.channel().isActive() ? 1 : 0)) {
            lllllllllllllIIIIllllIlIlllIlIII.writeAndFlush(Unpooled.EMPTY_BUFFER).addListener((GenericFutureListener<? extends Future<? super Void>>)ChannelFutureListener.CLOSE);
            "".length();
        }
        throw lllllllllllllIIIIllllIlIlllIlIlI;
    }
    
    private static String lllIlllllIIlIll(String lllllllllllllIIIIllllIlIlIllIIII, final String lllllllllllllIIIIllllIlIlIlIllll) {
        lllllllllllllIIIIllllIlIlIllIIII = new String(Base64.getDecoder().decode(lllllllllllllIIIIllllIlIlIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIllllIlIlIllIIll = new StringBuilder();
        final char[] lllllllllllllIIIIllllIlIlIllIIlI = lllllllllllllIIIIllllIlIlIlIllll.toCharArray();
        int lllllllllllllIIIIllllIlIlIllIIIl = WebSocket08FrameDecoder.lIlIlIllllIlII[0];
        final double lllllllllllllIIIIllllIlIlIlIlIll = (Object)lllllllllllllIIIIllllIlIlIllIIII.toCharArray();
        final short lllllllllllllIIIIllllIlIlIlIlIlI = (short)lllllllllllllIIIIllllIlIlIlIlIll.length;
        double lllllllllllllIIIIllllIlIlIlIlIIl = WebSocket08FrameDecoder.lIlIlIllllIlII[0];
        while (lllIllllllIIIll((int)lllllllllllllIIIIllllIlIlIlIlIIl, lllllllllllllIIIIllllIlIlIlIlIlI)) {
            final char lllllllllllllIIIIllllIlIlIllIllI = lllllllllllllIIIIllllIlIlIlIlIll[lllllllllllllIIIIllllIlIlIlIlIIl];
            lllllllllllllIIIIllllIlIlIllIIll.append((char)(lllllllllllllIIIIllllIlIlIllIllI ^ lllllllllllllIIIIllllIlIlIllIIlI[lllllllllllllIIIIllllIlIlIllIIIl % lllllllllllllIIIIllllIlIlIllIIlI.length]));
            "".length();
            ++lllllllllllllIIIIllllIlIlIllIIIl;
            ++lllllllllllllIIIIllllIlIlIlIlIIl;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIllllIlIlIllIIll);
    }
    
    private static boolean lllIlllllIlllII(final int lllllllllllllIIIIllllIlIIllllIll, final int lllllllllllllIIIIllllIlIIllllIlI) {
        return lllllllllllllIIIIllllIlIIllllIll > lllllllllllllIIIIllllIlIIllllIlI;
    }
    
    private static boolean lllIlllllIllllI(final int lllllllllllllIIIIllllIlIlIIIlIll, final int lllllllllllllIIIIllllIlIlIIIlIlI) {
        return lllllllllllllIIIIllllIlIlIIIlIll == lllllllllllllIIIIllllIlIlIIIlIlI;
    }
    
    static {
        lllIlllllIllIII();
        lllIlllllIlIIlI();
        OPCODE_CLOSE = (byte)WebSocket08FrameDecoder.lIlIlIllllIlII[11];
        OPCODE_CONT = (byte)WebSocket08FrameDecoder.lIlIlIllllIlII[0];
        OPCODE_BINARY = (byte)WebSocket08FrameDecoder.lIlIlIllllIlII[7];
        OPCODE_TEXT = (byte)WebSocket08FrameDecoder.lIlIlIllllIlII[2];
        OPCODE_PONG = (byte)WebSocket08FrameDecoder.lIlIlIllllIlII[13];
        OPCODE_PING = (byte)WebSocket08FrameDecoder.lIlIlIllllIlII[12];
        logger = InternalLoggerFactory.getInstance(WebSocket08FrameDecoder.class);
    }
    
    public WebSocket08FrameDecoder(final boolean lllllllllllllIIIIllllIllIIlIIIII, final boolean lllllllllllllIIIIllllIllIIIlllll, final int lllllllllllllIIIIllllIllIIlIIIlI) {
        super(State.FRAME_START);
        this.maskedPayload = lllllllllllllIIIIllllIllIIlIIIII;
        this.allowExtensions = lllllllllllllIIIIllllIllIIIlllll;
        this.maxFramePayloadLength = lllllllllllllIIIIllllIllIIlIIIlI;
    }
    
    @Override
    public void channelInactive(final ChannelHandlerContext lllllllllllllIIIIllllIlIllIIIIlI) throws Exception {
        super.channelInactive(lllllllllllllIIIIllllIlIllIIIIlI);
        if (lllIllllllIIIlI(this.framePayload)) {
            this.framePayload.release();
            "".length();
        }
        if (lllIllllllIIIlI(this.payloadBuffer)) {
            this.payloadBuffer.release();
            "".length();
        }
    }
    
    private static boolean lllIllllllIIllI(final int lllllllllllllIIIIllllIlIlIIIIlll, final int lllllllllllllIIIIllllIlIlIIIIllI) {
        return lllllllllllllIIIIllllIlIlIIIIlll >= lllllllllllllIIIIllllIlIlIIIIllI;
    }
    
    private static boolean lllIlllllIllIlI(final int lllllllllllllIIIIllllIlIIlllIlII) {
        return lllllllllllllIIIIllllIlIIlllIlII != 0;
    }
    
    enum State
    {
        private static final /* synthetic */ int[] llIllIllllIIII;
        
        MASKING_KEY;
        
        private static final /* synthetic */ String[] llIllIllIIllII;
        
        FRAME_START, 
        PAYLOAD, 
        CORRUPT;
        
        private static boolean lIIllIIIlIIllllI(final int llllllllllllIllIIlIllllIIIIllIII, final int llllllllllllIllIIlIllllIIIIlIlll) {
            return llllllllllllIllIIlIllllIIIIllIII < llllllllllllIllIIlIllllIIIIlIlll;
        }
        
        private static String lIIllIIIIIllllII(final String llllllllllllIllIIlIllllIIIlIlIll, final String llllllllllllIllIIlIllllIIIlIllII) {
            try {
                final SecretKeySpec llllllllllllIllIIlIllllIIIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIllllIIIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIIlIllllIIIlIllll = Cipher.getInstance("Blowfish");
                llllllllllllIllIIlIllllIIIlIllll.init(State.llIllIllllIIII[2], llllllllllllIllIIlIllllIIIllIIII);
                return new String(llllllllllllIllIIlIllllIIIlIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIllllIIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIlIllllIIIlIlllI) {
                llllllllllllIllIIlIllllIIIlIlllI.printStackTrace();
                return null;
            }
        }
        
        private static String lIIllIIIIIllIlIl(final String llllllllllllIllIIlIllllIIIlIIIII, final String llllllllllllIllIIlIllllIIIIlllIl) {
            try {
                final SecretKeySpec llllllllllllIllIIlIllllIIIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIllllIIIIlllIl.getBytes(StandardCharsets.UTF_8)), State.llIllIllllIIII[5]), "DES");
                final Cipher llllllllllllIllIIlIllllIIIlIIIlI = Cipher.getInstance("DES");
                llllllllllllIllIIlIllllIIIlIIIlI.init(State.llIllIllllIIII[2], llllllllllllIllIIlIllllIIIlIIIll);
                return new String(llllllllllllIllIIlIllllIIIlIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIllllIIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIlIllllIIIlIIIIl) {
                llllllllllllIllIIlIllllIIIlIIIIl.printStackTrace();
                return null;
            }
        }
        
        static {
            lIIllIIIlIIlllIl();
            lIIllIIIIllIIIll();
            final State[] $values = new State[State.llIllIllllIIII[4]];
            $values[State.llIllIllllIIII[0]] = State.FRAME_START;
            $values[State.llIllIllllIIII[1]] = State.MASKING_KEY;
            $values[State.llIllIllllIIII[2]] = State.PAYLOAD;
            $values[State.llIllIllllIIII[3]] = State.CORRUPT;
            $VALUES = $values;
        }
        
        private static void lIIllIIIIllIIIll() {
            (llIllIllIIllII = new String[State.llIllIllllIIII[4]])[State.llIllIllllIIII[0]] = lIIllIIIIIllIlIl("LGAjyP+EM0hqRTh8FaOgCQ==", "FInNz");
            State.llIllIllIIllII[State.llIllIllllIIII[1]] = lIIllIIIIIlllIll("OQUpIBs6AyUgFy0=", "tDzkR");
            State.llIllIllIIllII[State.llIllIllllIIII[2]] = lIIllIIIIIllIlIl("uma0+4xrxio=", "jJqqk");
            State.llIllIllIIllII[State.llIllIllllIIII[3]] = lIIllIIIIIllllII("PZX854WaLqA=", "VHYNW");
        }
        
        private static String lIIllIIIIIlllIll(String llllllllllllIllIIlIllllIIIllllIl, final String llllllllllllIllIIlIllllIIIllllII) {
            llllllllllllIllIIlIllllIIIllllIl = (short)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIlIllllIIIllllIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIIlIllllIIlIIIIII = new StringBuilder();
            final char[] llllllllllllIllIIlIllllIIIllllll = llllllllllllIllIIlIllllIIIllllII.toCharArray();
            int llllllllllllIllIIlIllllIIIlllllI = State.llIllIllllIIII[0];
            final char llllllllllllIllIIlIllllIIIlllIII = (Object)((String)llllllllllllIllIIlIllllIIIllllIl).toCharArray();
            final String llllllllllllIllIIlIllllIIIllIlll = (String)llllllllllllIllIIlIllllIIIlllIII.length;
            float llllllllllllIllIIlIllllIIIllIllI = State.llIllIllllIIII[0];
            while (lIIllIIIlIIllllI((int)llllllllllllIllIIlIllllIIIllIllI, (int)llllllllllllIllIIlIllllIIIllIlll)) {
                final char llllllllllllIllIIlIllllIIlIIIIll = llllllllllllIllIIlIllllIIIlllIII[llllllllllllIllIIlIllllIIIllIllI];
                llllllllllllIllIIlIllllIIlIIIIII.append((char)(llllllllllllIllIIlIllllIIlIIIIll ^ llllllllllllIllIIlIllllIIIllllll[llllllllllllIllIIlIllllIIIlllllI % llllllllllllIllIIlIllllIIIllllll.length]));
                "".length();
                ++llllllllllllIllIIlIllllIIIlllllI;
                ++llllllllllllIllIIlIllllIIIllIllI;
                "".length();
                if ("   ".length() < 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIIlIllllIIlIIIIII);
        }
        
        private static void lIIllIIIlIIlllIl() {
            (llIllIllllIIII = new int[6])[0] = ((0xBC ^ 0x88) & ~(0xA5 ^ 0x91));
            State.llIllIllllIIII[1] = " ".length();
            State.llIllIllllIIII[2] = "  ".length();
            State.llIllIllllIIII[3] = "   ".length();
            State.llIllIllllIIII[4] = (0xC0 ^ 0xC4);
            State.llIllIllllIIII[5] = (0x6E ^ 0x66);
        }
    }
}
