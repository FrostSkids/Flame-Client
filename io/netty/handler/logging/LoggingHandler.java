// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.logging;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import io.netty.util.internal.StringUtil;
import io.netty.buffer.ByteBuf;
import java.net.SocketAddress;
import io.netty.channel.ChannelPromise;
import io.netty.buffer.ByteBufHolder;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLogLevel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelDuplexHandler;

@ChannelHandler.Sharable
public class LoggingHandler extends ChannelDuplexHandler
{
    private static final /* synthetic */ LogLevel DEFAULT_LEVEL;
    protected final /* synthetic */ InternalLogLevel internalLevel;
    private static final /* synthetic */ String NEWLINE;
    private final /* synthetic */ LogLevel level;
    protected final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ String[] BYTE2HEX;
    private static final /* synthetic */ char[] BYTE2CHAR;
    private static final /* synthetic */ String[] BYTEPADDING;
    private static final /* synthetic */ int[] lIlllIIlIllIlI;
    private static final /* synthetic */ String[] lIllIllIIIlIIl;
    private static final /* synthetic */ String[] HEXPADDING;
    
    @Override
    public void channelRegistered(final ChannelHandlerContext llllllllllllIlllllIIllIlIlIIlIlI) throws Exception {
        if (lIIIIIlIIIIIIIlI(this.logger.isEnabled(this.internalLevel) ? 1 : 0)) {
            this.logger.log(this.internalLevel, this.format(llllllllllllIlllllIIllIlIlIIlIlI, LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[6]]));
        }
        super.channelRegistered(llllllllllllIlllllIIllIlIlIIlIlI);
    }
    
    private static boolean lIIIIIlIIIIIIIlI(final int llllllllllllIlllllIIllIIIIllIIIl) {
        return llllllllllllIlllllIIllIIIIllIIIl != 0;
    }
    
    private static String lllllllIllIlIlI(String llllllllllllIlllllIIllIIIllIlIll, final String llllllllllllIlllllIIllIIIllIlIlI) {
        llllllllllllIlllllIIllIIIllIlIll = new String(Base64.getDecoder().decode(llllllllllllIlllllIIllIIIllIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllIIllIIIllIlllI = new StringBuilder();
        final char[] llllllllllllIlllllIIllIIIllIllIl = llllllllllllIlllllIIllIIIllIlIlI.toCharArray();
        int llllllllllllIlllllIIllIIIllIllII = LoggingHandler.lIlllIIlIllIlI[0];
        final char llllllllllllIlllllIIllIIIllIIllI = (Object)llllllllllllIlllllIIllIIIllIlIll.toCharArray();
        final boolean llllllllllllIlllllIIllIIIllIIlIl = llllllllllllIlllllIIllIIIllIIllI.length != 0;
        double llllllllllllIlllllIIllIIIllIIlII = LoggingHandler.lIlllIIlIllIlI[0];
        while (lIIIIIlIIIIIIlIl((int)llllllllllllIlllllIIllIIIllIIlII, llllllllllllIlllllIIllIIIllIIlIl ? 1 : 0)) {
            final char llllllllllllIlllllIIllIIIlllIIIl = llllllllllllIlllllIIllIIIllIIllI[llllllllllllIlllllIIllIIIllIIlII];
            llllllllllllIlllllIIllIIIllIlllI.append((char)(llllllllllllIlllllIIllIIIlllIIIl ^ llllllllllllIlllllIIllIIIllIllIl[llllllllllllIlllllIIllIIIllIllII % llllllllllllIlllllIIllIIIllIllIl.length]));
            "".length();
            ++llllllllllllIlllllIIllIIIllIllII;
            ++llllllllllllIlllllIIllIIIllIIlII;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllIIllIIIllIlllI);
    }
    
    protected String formatNonByteBuf(final String llllllllllllIlllllIIllIIlIIlIllI, final Object llllllllllllIlllllIIllIIlIIlIIll) {
        return String.valueOf(new StringBuilder().append(llllllllllllIlllllIIllIIlIIlIllI).append(LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[32]]).append(llllllllllllIlllllIIllIIlIIlIIll));
    }
    
    public LogLevel level() {
        return this.level;
    }
    
    public LoggingHandler(final String llllllllllllIlllllIIllIlIllIIIlI, final LogLevel llllllllllllIlllllIIllIlIlIllllI) {
        if (lIIIIIlIIIIIIIIl(llllllllllllIlllllIIllIlIllIIIlI)) {
            throw new NullPointerException(LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[3]]);
        }
        if (lIIIIIlIIIIIIIIl(llllllllllllIlllllIIllIlIlIllllI)) {
            throw new NullPointerException(LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[4]]);
        }
        this.logger = InternalLoggerFactory.getInstance(llllllllllllIlllllIIllIlIllIIIlI);
        this.level = llllllllllllIlllllIIllIlIlIllllI;
        this.internalLevel = llllllllllllIlllllIIllIlIlIllllI.toInternalLevel();
    }
    
    protected String formatByteBufHolder(final String llllllllllllIlllllIIllIIlIIIlIll, final ByteBufHolder llllllllllllIlllllIIllIIlIIIllIl) {
        return this.formatByteBuf(llllllllllllIlllllIIllIIlIIIlIll, llllllllllllIlllllIIllIIlIIIllIl.content());
    }
    
    @Override
    public void channelActive(final ChannelHandlerContext llllllllllllIlllllIIllIlIIllllII) throws Exception {
        if (lIIIIIlIIIIIIIlI(this.logger.isEnabled(this.internalLevel) ? 1 : 0)) {
            this.logger.log(this.internalLevel, this.format(llllllllllllIlllllIIllIlIIllllII, LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[8]]));
        }
        super.channelActive(llllllllllllIlllllIIllIlIIllllII);
    }
    
    private static void lIIIIIIlllllllll() {
        (lIlllIIlIllIlI = new int[39])[0] = ((0x98 ^ 0x83 ^ (0x96 ^ 0x85)) & (0x7B ^ 0x39 ^ (0x6E ^ 0x24) ^ -" ".length()));
        LoggingHandler.lIlllIIlIllIlI[1] = " ".length();
        LoggingHandler.lIlllIIlIllIlI[2] = "  ".length();
        LoggingHandler.lIlllIIlIllIlI[3] = "   ".length();
        LoggingHandler.lIlllIIlIllIlI[4] = (0x96 ^ 0x92);
        LoggingHandler.lIlllIIlIllIlI[5] = (0x3C ^ 0x66 ^ (0x4C ^ 0x36));
        LoggingHandler.lIlllIIlIllIlI[6] = (0x2E ^ 0x1F ^ (0x7C ^ 0x48));
        LoggingHandler.lIlllIIlIllIlI[7] = (0xB6 ^ 0xC5 ^ (0x2F ^ 0x5A));
        LoggingHandler.lIlllIIlIllIlI[8] = (0x5E ^ 0x59);
        LoggingHandler.lIlllIIlIllIlI[9] = (0x6E ^ 0x66);
        LoggingHandler.lIlllIIlIllIlI[10] = (64 + 76 - 12 + 61 ^ 139 + 44 - 179 + 176);
        LoggingHandler.lIlllIIlIllIlI[11] = (92 + 113 - 183 + 120 ^ 38 + 78 - 27 + 43);
        LoggingHandler.lIlllIIlIllIlI[12] = (0x44 ^ 0x4F);
        LoggingHandler.lIlllIIlIllIlI[13] = (0x40 ^ 0x69);
        LoggingHandler.lIlllIIlIllIlI[14] = (0x3B ^ 0x37);
        LoggingHandler.lIlllIIlIllIlI[15] = ("   ".length() ^ (0x3D ^ 0x33));
        LoggingHandler.lIlllIIlIllIlI[16] = (0x1 ^ 0xF);
        LoggingHandler.lIlllIIlIllIlI[17] = (0x6B ^ 0x25 ^ (0x40 ^ 0x1));
        LoggingHandler.lIlllIIlIllIlI[18] = (0x6F ^ 0x7F);
        LoggingHandler.lIlllIIlIllIlI[19] = (51 + 125 - 111 + 120 ^ 77 + 73 - 66 + 84);
        LoggingHandler.lIlllIIlIllIlI[20] = (0x4C ^ 0x1A ^ (0x47 ^ 0x3));
        LoggingHandler.lIlllIIlIllIlI[21] = (0x6F ^ 0x7C);
        LoggingHandler.lIlllIIlIllIlI[22] = (0xD7 ^ 0x84 ^ "   ".length());
        LoggingHandler.lIlllIIlIllIlI[23] = (0xB7 ^ 0x9F);
        LoggingHandler.lIlllIIlIllIlI[24] = (0x44 ^ 0x2B ^ (0xED ^ 0xC0));
        LoggingHandler.lIlllIIlIllIlI[25] = (0xDB ^ 0x8E ^ (0xFF ^ 0xBE));
        LoggingHandler.lIlllIIlIllIlI[26] = (((0x38 ^ 0x6E) & ~(0xDF ^ 0x89)) ^ (0x19 ^ 0xC));
        LoggingHandler.lIlllIIlIllIlI[27] = (0x7 ^ 0x11);
        LoggingHandler.lIlllIIlIllIlI[28] = (25 + 106 + 51 + 29 ^ 26 + 112 - 92 + 129);
        LoggingHandler.lIlllIIlIllIlI[29] = (0x6D ^ 0x7A);
        LoggingHandler.lIlllIIlIllIlI[30] = (92 + 82 + 5 + 5 ^ 63 + 151 - 74 + 20);
        LoggingHandler.lIlllIIlIllIlI[31] = (0x7D ^ 0x2C ^ (0xF7 ^ 0xBF));
        LoggingHandler.lIlllIIlIllIlI[32] = (0x16 ^ 0x6C ^ (0x53 ^ 0x33));
        LoggingHandler.lIlllIIlIllIlI[33] = (-(0xFFFFBFF7 & 0x76FA) & (0xFFFFBFFB & 0x77F5));
        LoggingHandler.lIlllIIlIllIlI[34] = (0x71 ^ 0x6A);
        LoggingHandler.lIlllIIlIllIlI[35] = (0x65 ^ 0x35 ^ (0xF4 ^ 0xBB));
        LoggingHandler.lIlllIIlIllIlI[36] = 57 + 78 - 110 + 102;
        LoggingHandler.lIlllIIlIllIlI[37] = (0xBA ^ 0x94);
        LoggingHandler.lIlllIIlIllIlI[38] = (91 + 31 + 9 + 32 ^ 24 + 14 + 93 + 60);
    }
    
    @Override
    public void close(final ChannelHandlerContext llllllllllllIlllllIIllIIlllllIII, final ChannelPromise llllllllllllIlllllIIllIIllllIlll) throws Exception {
        if (lIIIIIlIIIIIIIlI(this.logger.isEnabled(this.internalLevel) ? 1 : 0)) {
            this.logger.log(this.internalLevel, this.format(llllllllllllIlllllIIllIIlllllIII, LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[17]]));
        }
        super.close(llllllllllllIlllllIIllIIlllllIII, llllllllllllIlllllIIllIIllllIlll);
    }
    
    private static boolean lIIIIIlIIIIIIlII(final int llllllllllllIlllllIIllIIIIlIllll) {
        return llllllllllllIlllllIIllIIIIlIllll == 0;
    }
    
    @Override
    public void bind(final ChannelHandlerContext llllllllllllIlllllIIllIlIIIllllI, final SocketAddress llllllllllllIlllllIIllIlIIIllIIl, final ChannelPromise llllllllllllIlllllIIllIlIIIllIII) throws Exception {
        if (lIIIIIlIIIIIIIlI(this.logger.isEnabled(this.internalLevel) ? 1 : 0)) {
            this.logger.log(this.internalLevel, this.format(llllllllllllIlllllIIllIlIIIllllI, String.valueOf(new StringBuilder().append(LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[12]]).append(llllllllllllIlllllIIllIlIIIllIIl).append((char)LoggingHandler.lIlllIIlIllIlI[13]))));
        }
        super.bind(llllllllllllIlllllIIllIlIIIllllI, llllllllllllIlllllIIllIlIIIllIIl, llllllllllllIlllllIIllIlIIIllIII);
    }
    
    public LoggingHandler(final Class<?> llllllllllllIlllllIIllIlIlllIllI) {
        this(llllllllllllIlllllIIllIlIlllIllI, LoggingHandler.DEFAULT_LEVEL);
    }
    
    public LoggingHandler(final Class<?> llllllllllllIlllllIIllIlIlllIIIl, final LogLevel llllllllllllIlllllIIllIlIllIllIl) {
        if (lIIIIIlIIIIIIIIl(llllllllllllIlllllIIllIlIlllIIIl)) {
            throw new NullPointerException(LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[1]]);
        }
        if (lIIIIIlIIIIIIIIl(llllllllllllIlllllIIllIlIllIllIl)) {
            throw new NullPointerException(LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[2]]);
        }
        this.logger = InternalLoggerFactory.getInstance(llllllllllllIlllllIIllIlIlllIIIl);
        this.level = llllllllllllIlllllIIllIlIllIllIl;
        this.internalLevel = llllllllllllIlllllIIllIlIllIllIl.toInternalLevel();
    }
    
    private static boolean lIIIIIlIIIIIIlll(final int llllllllllllIlllllIIllIIIIlllIlI, final int llllllllllllIlllllIIllIIIIlllIIl) {
        return llllllllllllIlllllIIllIIIIlllIlI <= llllllllllllIlllllIIllIIIIlllIIl;
    }
    
    private static boolean lIIIIIlIIIIIIllI(final int llllllllllllIlllllIIllIIIlIIIllI, final int llllllllllllIlllllIIllIIIlIIIlIl) {
        return llllllllllllIlllllIIllIIIlIIIllI == llllllllllllIlllllIIllIIIlIIIlIl;
    }
    
    public LoggingHandler(final String llllllllllllIlllllIIllIlIllIlIIl) {
        this(llllllllllllIlllllIIllIlIllIlIIl, LoggingHandler.DEFAULT_LEVEL);
    }
    
    @Override
    public void channelUnregistered(final ChannelHandlerContext llllllllllllIlllllIIllIlIlIIIlII) throws Exception {
        if (lIIIIIlIIIIIIIlI(this.logger.isEnabled(this.internalLevel) ? 1 : 0)) {
            this.logger.log(this.internalLevel, this.format(llllllllllllIlllllIIllIlIlIIIlII, LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[7]]));
        }
        super.channelUnregistered(llllllllllllIlllllIIllIlIlIIIlII);
    }
    
    @Override
    public void exceptionCaught(final ChannelHandlerContext llllllllllllIlllllIIllIlIIlIlllI, final Throwable llllllllllllIlllllIIllIlIIlIllIl) throws Exception {
        if (lIIIIIlIIIIIIIlI(this.logger.isEnabled(this.internalLevel) ? 1 : 0)) {
            this.logger.log(this.internalLevel, this.format(llllllllllllIlllllIIllIlIIlIlllI, String.valueOf(new StringBuilder().append(LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[10]]).append(llllllllllllIlllllIIllIlIIlIllIl))), llllllllllllIlllllIIllIlIIlIllIl);
        }
        super.exceptionCaught(llllllllllllIlllllIIllIlIIlIlllI, llllllllllllIlllllIIllIlIIlIllIl);
    }
    
    @Override
    public void connect(final ChannelHandlerContext llllllllllllIlllllIIllIlIIIIllII, final SocketAddress llllllllllllIlllllIIllIlIIIlIIII, final SocketAddress llllllllllllIlllllIIllIlIIIIllll, final ChannelPromise llllllllllllIlllllIIllIlIIIIlIIl) throws Exception {
        if (lIIIIIlIIIIIIIlI(this.logger.isEnabled(this.internalLevel) ? 1 : 0)) {
            this.logger.log(this.internalLevel, this.format(llllllllllllIlllllIIllIlIIIIllII, String.valueOf(new StringBuilder().append(LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[14]]).append(llllllllllllIlllllIIllIlIIIlIIII).append(LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[15]]).append(llllllllllllIlllllIIllIlIIIIllll).append((char)LoggingHandler.lIlllIIlIllIlI[13]))));
        }
        super.connect(llllllllllllIlllllIIllIlIIIIllII, llllllllllllIlllllIIllIlIIIlIIII, llllllllllllIlllllIIllIlIIIIllll, llllllllllllIlllllIIllIlIIIIlIIl);
    }
    
    @Override
    public void flush(final ChannelHandlerContext llllllllllllIlllllIIllIIllIlIIll) throws Exception {
        if (lIIIIIlIIIIIIIlI(this.logger.isEnabled(this.internalLevel) ? 1 : 0)) {
            this.logger.log(this.internalLevel, this.format(llllllllllllIlllllIIllIIllIlIIll, LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[21]]));
        }
        llllllllllllIlllllIIllIIllIlIIll.flush();
        "".length();
    }
    
    public LoggingHandler() {
        this(LoggingHandler.DEFAULT_LEVEL);
    }
    
    @Override
    public void userEventTriggered(final ChannelHandlerContext llllllllllllIlllllIIllIlIIlIIlIl, final Object llllllllllllIlllllIIllIlIIlIIlII) throws Exception {
        if (lIIIIIlIIIIIIIlI(this.logger.isEnabled(this.internalLevel) ? 1 : 0)) {
            this.logger.log(this.internalLevel, this.format(llllllllllllIlllllIIllIlIIlIIlIl, String.valueOf(new StringBuilder().append(LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[11]]).append(llllllllllllIlllllIIllIlIIlIIlII))));
        }
        super.userEventTriggered(llllllllllllIlllllIIllIlIIlIIlIl, llllllllllllIlllllIIllIlIIlIIlII);
    }
    
    private static boolean lIIIIIlIIIIIIlIl(final int llllllllllllIlllllIIllIIIIlllllI, final int llllllllllllIlllllIIllIIIIllllIl) {
        return llllllllllllIlllllIIllIIIIlllllI < llllllllllllIlllllIIllIIIIllllIl;
    }
    
    @Override
    public void deregister(final ChannelHandlerContext llllllllllllIlllllIIllIIllllIIlI, final ChannelPromise llllllllllllIlllllIIllIIllllIIIl) throws Exception {
        if (lIIIIIlIIIIIIIlI(this.logger.isEnabled(this.internalLevel) ? 1 : 0)) {
            this.logger.log(this.internalLevel, this.format(llllllllllllIlllllIIllIIllllIIlI, LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[18]]));
        }
        super.deregister(llllllllllllIlllllIIllIIllllIIlI, llllllllllllIlllllIIllIIllllIIIl);
    }
    
    private static boolean lIIIIIlIIIIIlIII(final int llllllllllllIlllllIIllIIIIllIllI, final int llllllllllllIlllllIIllIIIIllIlIl) {
        return llllllllllllIlllllIIllIIIIllIllI > llllllllllllIlllllIIllIIIIllIlIl;
    }
    
    @Override
    public void write(final ChannelHandlerContext llllllllllllIlllllIIllIIllIlllll, final Object llllllllllllIlllllIIllIIllIllIlI, final ChannelPromise llllllllllllIlllllIIllIIllIllIIl) throws Exception {
        this.logMessage(llllllllllllIlllllIIllIIllIlllll, LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[20]], llllllllllllIlllllIIllIIllIllIlI);
        llllllllllllIlllllIIllIIllIlllll.write(llllllllllllIlllllIIllIIllIllIlI, llllllllllllIlllllIIllIIllIllIIl);
        "".length();
    }
    
    protected String formatByteBuf(final String llllllllllllIlllllIIllIIlIlIllII, final ByteBuf llllllllllllIlllllIIllIIlIlIIIll) {
        final int llllllllllllIlllllIIllIIlIlIlIlI = llllllllllllIlllllIIllIIlIlIIIll.readableBytes();
        final int n = llllllllllllIlllllIIllIIlIlIlIlI / LoggingHandler.lIlllIIlIllIlI[18];
        int n2;
        if (lIIIIIlIIIIIIlII(llllllllllllIlllllIIllIIlIlIlIlI % LoggingHandler.lIlllIIlIllIlI[17])) {
            n2 = LoggingHandler.lIlllIIlIllIlI[0];
            "".length();
            if (((56 + 74 - 33 + 52 ^ 9 + 147 - 3 + 22) & (0xF4 ^ 0x9D ^ (0x44 ^ 0x17) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            n2 = LoggingHandler.lIlllIIlIllIlI[1];
        }
        final int llllllllllllIlllllIIllIIlIlIlIIl = n + n2 + LoggingHandler.lIlllIIlIllIlI[4];
        final StringBuilder llllllllllllIlllllIIllIIlIlIlIII = new StringBuilder(llllllllllllIlllllIIllIIlIlIlIIl * LoggingHandler.lIlllIIlIllIlI[22] + llllllllllllIlllllIIllIIlIlIllII.length() + LoggingHandler.lIlllIIlIllIlI[18]);
        llllllllllllIlllllIIllIIlIlIlIII.append(llllllllllllIlllllIIllIIlIlIllII).append((char)LoggingHandler.lIlllIIlIllIlI[23]).append(llllllllllllIlllllIIllIIlIlIlIlI).append((char)LoggingHandler.lIlllIIlIllIlI[24]).append((char)LoggingHandler.lIlllIIlIllIlI[13]);
        "".length();
        llllllllllllIlllllIIllIIlIlIlIII.append(String.valueOf(new StringBuilder().append(LoggingHandler.NEWLINE).append(LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[25]]).append(LoggingHandler.NEWLINE).append(LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[26]]).append(LoggingHandler.NEWLINE).append(LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[27]])));
        "".length();
        final int llllllllllllIlllllIIllIIlIlIIlll = llllllllllllIlllllIIllIIlIlIIIll.readerIndex();
        final int llllllllllllIlllllIIllIIlIlIIllI = llllllllllllIlllllIIllIIlIlIIIll.writerIndex();
        int llllllllllllIlllllIIllIIlIlIIlIl = llllllllllllIlllllIIllIIlIlIIlll;
        while (lIIIIIlIIIIIIlIl(llllllllllllIlllllIIllIIlIlIIlIl, llllllllllllIlllllIIllIIlIlIIllI)) {
            final int llllllllllllIlllllIIllIIlIllIIIl = llllllllllllIlllllIIllIIlIlIIlIl - llllllllllllIlllllIIllIIlIlIIlll;
            final int llllllllllllIlllllIIllIIlIllIIII = llllllllllllIlllllIIllIIlIllIIIl & LoggingHandler.lIlllIIlIllIlI[17];
            if (lIIIIIlIIIIIIlII(llllllllllllIlllllIIllIIlIllIIII)) {
                llllllllllllIlllllIIllIIlIlIlIII.append(LoggingHandler.NEWLINE);
                "".length();
                llllllllllllIlllllIIllIIlIlIlIII.append(Long.toHexString(((long)llllllllllllIlllllIIllIIlIllIIIl & 0xFFFFFFFFL) | 0x100000000L));
                "".length();
                llllllllllllIlllllIIllIIlIlIlIII.setCharAt(llllllllllllIlllllIIllIIlIlIlIII.length() - LoggingHandler.lIlllIIlIllIlI[10], (char)LoggingHandler.lIlllIIlIllIlI[28]);
                llllllllllllIlllllIIllIIlIlIlIII.append((char)LoggingHandler.lIlllIIlIllIlI[28]);
                "".length();
            }
            llllllllllllIlllllIIllIIlIlIlIII.append(LoggingHandler.BYTE2HEX[llllllllllllIlllllIIllIIlIlIIIll.getUnsignedByte(llllllllllllIlllllIIllIIlIlIIlIl)]);
            "".length();
            if (lIIIIIlIIIIIIllI(llllllllllllIlllllIIllIIlIllIIII, LoggingHandler.lIlllIIlIllIlI[17])) {
                llllllllllllIlllllIIllIIlIlIlIII.append(LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[29]]);
                "".length();
                int llllllllllllIlllllIIllIIlIllIIlI = llllllllllllIlllllIIllIIlIlIIlIl - LoggingHandler.lIlllIIlIllIlI[17];
                while (lIIIIIlIIIIIIlll(llllllllllllIlllllIIllIIlIllIIlI, llllllllllllIlllllIIllIIlIlIIlIl)) {
                    llllllllllllIlllllIIllIIlIlIlIII.append(LoggingHandler.BYTE2CHAR[llllllllllllIlllllIIllIIlIlIIIll.getUnsignedByte(llllllllllllIlllllIIllIIlIllIIlI)]);
                    "".length();
                    ++llllllllllllIlllllIIllIIlIllIIlI;
                    "".length();
                    if (-" ".length() >= " ".length()) {
                        return null;
                    }
                }
                llllllllllllIlllllIIllIIlIlIlIII.append((char)LoggingHandler.lIlllIIlIllIlI[28]);
                "".length();
            }
            ++llllllllllllIlllllIIllIIlIlIIlIl;
            "".length();
            if ("  ".length() <= -" ".length()) {
                return null;
            }
        }
        if (lIIIIIlIIIIIIIlI(llllllllllllIlllllIIllIIlIlIIlIl - llllllllllllIlllllIIllIIlIlIIlll & LoggingHandler.lIlllIIlIllIlI[17])) {
            final int llllllllllllIlllllIIllIIlIlIlllI = llllllllllllIlllllIIllIIlIlIlIlI & LoggingHandler.lIlllIIlIllIlI[17];
            llllllllllllIlllllIIllIIlIlIlIII.append(LoggingHandler.HEXPADDING[llllllllllllIlllllIIllIIlIlIlllI]);
            "".length();
            llllllllllllIlllllIIllIIlIlIlIII.append(LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[30]]);
            "".length();
            int llllllllllllIlllllIIllIIlIlIllll = llllllllllllIlllllIIllIIlIlIIlIl - llllllllllllIlllllIIllIIlIlIlllI;
            while (lIIIIIlIIIIIIlIl(llllllllllllIlllllIIllIIlIlIllll, llllllllllllIlllllIIllIIlIlIIlIl)) {
                llllllllllllIlllllIIllIIlIlIlIII.append(LoggingHandler.BYTE2CHAR[llllllllllllIlllllIIllIIlIlIIIll.getUnsignedByte(llllllllllllIlllllIIllIIlIlIllll)]);
                "".length();
                ++llllllllllllIlllllIIllIIlIlIllll;
                "".length();
                if (-" ".length() >= " ".length()) {
                    return null;
                }
            }
            llllllllllllIlllllIIllIIlIlIlIII.append(LoggingHandler.BYTEPADDING[llllllllllllIlllllIIllIIlIlIlllI]);
            "".length();
            llllllllllllIlllllIIllIIlIlIlIII.append((char)LoggingHandler.lIlllIIlIllIlI[28]);
            "".length();
        }
        llllllllllllIlllllIIllIIlIlIlIII.append(String.valueOf(new StringBuilder().append(LoggingHandler.NEWLINE).append(LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[31]])));
        "".length();
        return String.valueOf(llllllllllllIlllllIIllIIlIlIlIII);
    }
    
    protected String formatMessage(final String llllllllllllIlllllIIllIIllIIIIlI, final Object llllllllllllIlllllIIllIIllIIIIIl) {
        if (lIIIIIlIIIIIIIlI((llllllllllllIlllllIIllIIllIIIIIl instanceof ByteBuf) ? 1 : 0)) {
            return this.formatByteBuf(llllllllllllIlllllIIllIIllIIIIlI, (ByteBuf)llllllllllllIlllllIIllIIllIIIIIl);
        }
        if (lIIIIIlIIIIIIIlI((llllllllllllIlllllIIllIIllIIIIIl instanceof ByteBufHolder) ? 1 : 0)) {
            return this.formatByteBufHolder(llllllllllllIlllllIIllIIllIIIIlI, (ByteBufHolder)llllllllllllIlllllIIllIIllIIIIIl);
        }
        return this.formatNonByteBuf(llllllllllllIlllllIIllIIllIIIIlI, llllllllllllIlllllIIllIIllIIIIIl);
    }
    
    public LoggingHandler(final LogLevel llllllllllllIlllllIIllIlIlllllII) {
        if (lIIIIIlIIIIIIIIl(llllllllllllIlllllIIllIlIlllllII)) {
            throw new NullPointerException(LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[0]]);
        }
        this.logger = InternalLoggerFactory.getInstance(this.getClass());
        this.level = llllllllllllIlllllIIllIlIlllllII;
        this.internalLevel = llllllllllllIlllllIIllIlIlllllII.toInternalLevel();
    }
    
    @Override
    public void channelInactive(final ChannelHandlerContext llllllllllllIlllllIIllIlIIlllIII) throws Exception {
        if (lIIIIIlIIIIIIIlI(this.logger.isEnabled(this.internalLevel) ? 1 : 0)) {
            this.logger.log(this.internalLevel, this.format(llllllllllllIlllllIIllIlIIlllIII, LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[9]]));
        }
        super.channelInactive(llllllllllllIlllllIIllIlIIlllIII);
    }
    
    @Override
    public void channelRead(final ChannelHandlerContext llllllllllllIlllllIIllIIlllIIllI, final Object llllllllllllIlllllIIllIIlllIlIII) throws Exception {
        this.logMessage(llllllllllllIlllllIIllIIlllIIllI, LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[19]], llllllllllllIlllllIIllIIlllIlIII);
        llllllllllllIlllllIIllIIlllIIllI.fireChannelRead(llllllllllllIlllllIIllIIlllIlIII);
        "".length();
    }
    
    protected String format(final ChannelHandlerContext llllllllllllIlllllIIllIlIlIlIlIl, final String llllllllllllIlllllIIllIlIlIlIlII) {
        final String llllllllllllIlllllIIllIlIlIlIIll = llllllllllllIlllllIIllIlIlIlIlIl.channel().toString();
        final StringBuilder llllllllllllIlllllIIllIlIlIlIIlI = new StringBuilder(llllllllllllIlllllIIllIlIlIlIIll.length() + llllllllllllIlllllIIllIlIlIlIlII.length() + LoggingHandler.lIlllIIlIllIlI[1]);
        llllllllllllIlllllIIllIlIlIlIIlI.append(llllllllllllIlllllIIllIlIlIlIIll);
        "".length();
        llllllllllllIlllllIIllIlIlIlIIlI.append((char)LoggingHandler.lIlllIIlIllIlI[5]);
        "".length();
        llllllllllllIlllllIIllIlIlIlIIlI.append(llllllllllllIlllllIIllIlIlIlIlII);
        "".length();
        return String.valueOf(llllllllllllIlllllIIllIlIlIlIIlI);
    }
    
    private void logMessage(final ChannelHandlerContext llllllllllllIlllllIIllIIllIIllIl, final String llllllllllllIlllllIIllIIllIIllII, final Object llllllllllllIlllllIIllIIllIIlIll) {
        if (lIIIIIlIIIIIIIlI(this.logger.isEnabled(this.internalLevel) ? 1 : 0)) {
            this.logger.log(this.internalLevel, this.format(llllllllllllIlllllIIllIIllIIllIl, this.formatMessage(llllllllllllIlllllIIllIIllIIllII, llllllllllllIlllllIIllIIllIIlIll)));
        }
    }
    
    static {
        lIIIIIIlllllllll();
        lIIIIIIllIllllIl();
        DEFAULT_LEVEL = LogLevel.DEBUG;
        NEWLINE = StringUtil.NEWLINE;
        BYTE2HEX = new String[LoggingHandler.lIlllIIlIllIlI[33]];
        HEXPADDING = new String[LoggingHandler.lIlllIIlIllIlI[18]];
        BYTEPADDING = new String[LoggingHandler.lIlllIIlIllIlI[18]];
        BYTE2CHAR = new char[LoggingHandler.lIlllIIlIllIlI[33]];
        int llllllllllllIlllllIIllIIIlllllll = LoggingHandler.lIlllIIlIllIlI[0];
        while (lIIIIIlIIIIIIlIl(llllllllllllIlllllIIllIIIlllllll, LoggingHandler.BYTE2HEX.length)) {
            LoggingHandler.BYTE2HEX[llllllllllllIlllllIIllIIIlllllll] = String.valueOf(new StringBuilder().append((char)LoggingHandler.lIlllIIlIllIlI[5]).append(StringUtil.byteToHexStringPadded(llllllllllllIlllllIIllIIIlllllll)));
            ++llllllllllllIlllllIIllIIIlllllll;
            "".length();
            if ("  ".length() >= (0x85 ^ 0x81)) {
                return;
            }
        }
        llllllllllllIlllllIIllIIIlllllll = LoggingHandler.lIlllIIlIllIlI[0];
        while (lIIIIIlIIIIIIlIl(llllllllllllIlllllIIllIIIlllllll, LoggingHandler.HEXPADDING.length)) {
            final int llllllllllllIlllllIIllIIlIIIIlII = LoggingHandler.HEXPADDING.length - llllllllllllIlllllIIllIIIlllllll;
            final StringBuilder llllllllllllIlllllIIllIIlIIIIIll = new StringBuilder(llllllllllllIlllllIIllIIlIIIIlII * LoggingHandler.lIlllIIlIllIlI[3]);
            int llllllllllllIlllllIIllIIlIIIIlIl = LoggingHandler.lIlllIIlIllIlI[0];
            while (lIIIIIlIIIIIIlIl(llllllllllllIlllllIIllIIlIIIIlIl, llllllllllllIlllllIIllIIlIIIIlII)) {
                llllllllllllIlllllIIllIIlIIIIIll.append(LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[34]]);
                "".length();
                ++llllllllllllIlllllIIllIIlIIIIlIl;
                "".length();
                if (-"  ".length() > 0) {
                    return;
                }
            }
            LoggingHandler.HEXPADDING[llllllllllllIlllllIIllIIIlllllll] = String.valueOf(llllllllllllIlllllIIllIIlIIIIIll);
            ++llllllllllllIlllllIIllIIIlllllll;
            "".length();
            if ("  ".length() == (0x83 ^ 0x87)) {
                return;
            }
        }
        llllllllllllIlllllIIllIIIlllllll = LoggingHandler.lIlllIIlIllIlI[0];
        while (lIIIIIlIIIIIIlIl(llllllllllllIlllllIIllIIIlllllll, LoggingHandler.BYTEPADDING.length)) {
            final int llllllllllllIlllllIIllIIlIIIIIIl = LoggingHandler.BYTEPADDING.length - llllllllllllIlllllIIllIIIlllllll;
            final StringBuilder llllllllllllIlllllIIllIIlIIIIIII = new StringBuilder(llllllllllllIlllllIIllIIlIIIIIIl);
            int llllllllllllIlllllIIllIIlIIIIIlI = LoggingHandler.lIlllIIlIllIlI[0];
            while (lIIIIIlIIIIIIlIl(llllllllllllIlllllIIllIIlIIIIIlI, llllllllllllIlllllIIllIIlIIIIIIl)) {
                llllllllllllIlllllIIllIIlIIIIIII.append((char)LoggingHandler.lIlllIIlIllIlI[5]);
                "".length();
                ++llllllllllllIlllllIIllIIlIIIIIlI;
                "".length();
                if (-" ".length() == ((0x2E ^ 0x75 ^ ((0xAC ^ 0xA4) & ~(0x64 ^ 0x6C))) & (28 + 28 - 40 + 233 ^ 7 + 47 - 47 + 155 ^ -" ".length()))) {
                    return;
                }
            }
            LoggingHandler.BYTEPADDING[llllllllllllIlllllIIllIIIlllllll] = String.valueOf(llllllllllllIlllllIIllIIlIIIIIII);
            ++llllllllllllIlllllIIllIIIlllllll;
            "".length();
            if (-(0x1E ^ 0x1B) >= 0) {
                return;
            }
        }
        llllllllllllIlllllIIllIIIlllllll = LoggingHandler.lIlllIIlIllIlI[0];
        while (lIIIIIlIIIIIIlIl(llllllllllllIlllllIIllIIIlllllll, LoggingHandler.BYTE2CHAR.length)) {
            if (!lIIIIIlIIIIIlIII(llllllllllllIlllllIIllIIIlllllll, LoggingHandler.lIlllIIlIllIlI[35]) || lIIIIIlIIIIIlIIl(llllllllllllIlllllIIllIIIlllllll, LoggingHandler.lIlllIIlIllIlI[36])) {
                LoggingHandler.BYTE2CHAR[llllllllllllIlllllIIllIIIlllllll] = (char)LoggingHandler.lIlllIIlIllIlI[37];
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            else {
                LoggingHandler.BYTE2CHAR[llllllllllllIlllllIIllIIIlllllll] = (char)llllllllllllIlllllIIllIIIlllllll;
            }
            ++llllllllllllIlllllIIllIIIlllllll;
            "".length();
            if (((8 + 119 - 63 + 68 ^ 183 + 143 - 142 + 3) & (0xFA ^ 0xC1 ^ (0x18 ^ 0x1C) ^ -" ".length())) > 0) {
                return;
            }
        }
    }
    
    private static String lllllllIllIlIll(final String llllllllllllIlllllIIllIIIlIllIIl, final String llllllllllllIlllllIIllIIIlIllIII) {
        try {
            final SecretKeySpec llllllllllllIlllllIIllIIIlIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIllIIIlIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllIIllIIIlIlllIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllllIIllIIIlIlllIl.init(LoggingHandler.lIlllIIlIllIlI[2], llllllllllllIlllllIIllIIIlIllllI);
            return new String(llllllllllllIlllllIIllIIIlIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIllIIIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIIllIIIlIlllII) {
            llllllllllllIlllllIIllIIIlIlllII.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIIIllIllllIl() {
        (lIllIllIIIlIIl = new String[LoggingHandler.lIlllIIlIllIlI[38]])[LoggingHandler.lIlllIIlIllIlI[0]] = lllllllIllIlIlI("AwcFMTQ=", "obsTX");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[1]] = lllllllIllIlIll("BembHmdPqwU=", "LVCNJ");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[2]] = lllllllIllIllII("J1ypRP5NSME=", "sLIEY");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[3]] = lllllllIllIllII("qX5Mw3aBj5k=", "LZqBB");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[4]] = lllllllIllIlIlI("BSwmKiE=", "iIPOM");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[6]] = lllllllIllIlIll("aHGM/p2LAmdlaKNAEuUG2g==", "pPxNS");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[7]] = lllllllIllIllII("W4bt8K9NzFr7n96OvzyhKA==", "NDhVp");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[8]] = lllllllIllIlIlI("KwU7IBov", "jFoiL");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[9]] = lllllllIllIllII("nLy1CpREx9VhqtPIm71xWA==", "malxQ");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[10]] = lllllllIllIlIlI("MhczLD0jBj8nV1c=", "wOpim");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[11]] = lllllllIllIlIlI("FDQ8PgwEMTwiB3tH", "AgylS");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[12]] = lllllllIllIllII("YUEy/Uah4hQ=", "vNczZ");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[14]] = lllllllIllIlIll("8AumMBEKct0/dbTq7Pk1NQ==", "YjusY");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[15]] = lllllllIllIlIlI("bWI=", "ABTgb");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[16]] = lllllllIllIlIll("PmGjCsiVDFo4EVaGwCOS3w==", "EeaBD");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[17]] = lllllllIllIlIll("axyCPQQaJ7w=", "EicNt");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[18]] = lllllllIllIllII("UGO3IfsebFXppmoXb/GqQA==", "HNCPr");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[19]] = lllllllIllIlIll("dL5U7f311zTfyntv8qdIWg==", "OUFCM");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[20]] = lllllllIllIllII("OBxoqRuh+zE=", "jDWaI");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[21]] = lllllllIllIlIlI("EiElMCk=", "Tmpca");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[25]] = lllllllIllIllII("qPwYh2C5fUvtUYvQE06nytSorPdDRXCs1Kis90NFcKzUqKz3Q0VwrNSorPdDRXCs1Kis90NFcKza0GNA90Ts7Q==", "QXBYx");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[26]] = lllllllIllIlIlI("dFBBemN0UEF6P3RQUXpjZVBBaGN0Q0F6d3RQVHpjYlBBbWN0SEF6enRQAHpjNlBBOWN0FEF6JnRQB3o/", "TpaZC");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[27]] = lllllllIllIlIll("qAqDfb8BB0SoSqKght9ijMqWc2UCsDyFypZzZQKwPIXKlnNlArA8hcqWc2UCsDyFypZzZQKwPIWrDnyMkIn1U8qWc2UCsDyFKbxCl4OAg4M=", "CEBMj");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[29]] = lllllllIllIlIll("oWqr8NCdrog=", "WWCnF");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[30]] = lllllllIllIllII("dhGk3GYHMRg=", "lLAov");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[31]] = lllllllIllIllII("3El3u+YDEgvQbM2pMHtfLN+SiT9Aub8+35KJP0C5vz7fkok/QLm/Pt+SiT9Aub8+35KJP0C5vz6ypek/vF2Yvt+SiT9Aub8+kFI2fPzUjOg=", "TMooz");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[32]] = lllllllIllIllII("JKPyOs9WaQ0=", "lzDky");
        LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[34]] = lllllllIllIllII("0rfrNLkjq5w=", "wLiCd");
    }
    
    private static boolean lIIIIIlIIIIIIIIl(final Object llllllllllllIlllllIIllIIIIllIIll) {
        return llllllllllllIlllllIIllIIIIllIIll == null;
    }
    
    private static boolean lIIIIIlIIIIIlIIl(final int llllllllllllIlllllIIllIIIlIIIIlI, final int llllllllllllIlllllIIllIIIlIIIIIl) {
        return llllllllllllIlllllIIllIIIlIIIIlI >= llllllllllllIlllllIIllIIIlIIIIIl;
    }
    
    private static String lllllllIllIllII(final String llllllllllllIlllllIIllIIIlIIlllI, final String llllllllllllIlllllIIllIIIlIIlIll) {
        try {
            final SecretKeySpec llllllllllllIlllllIIllIIIlIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIllIIIlIIlIll.getBytes(StandardCharsets.UTF_8)), LoggingHandler.lIlllIIlIllIlI[9]), "DES");
            final Cipher llllllllllllIlllllIIllIIIlIlIIII = Cipher.getInstance("DES");
            llllllllllllIlllllIIllIIIlIlIIII.init(LoggingHandler.lIlllIIlIllIlI[2], llllllllllllIlllllIIllIIIlIlIIIl);
            return new String(llllllllllllIlllllIIllIIIlIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIllIIIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIIllIIIlIIllll) {
            llllllllllllIlllllIIllIIIlIIllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void disconnect(final ChannelHandlerContext llllllllllllIlllllIIllIlIIIIIIIl, final ChannelPromise llllllllllllIlllllIIllIlIIIIIIll) throws Exception {
        if (lIIIIIlIIIIIIIlI(this.logger.isEnabled(this.internalLevel) ? 1 : 0)) {
            this.logger.log(this.internalLevel, this.format(llllllllllllIlllllIIllIlIIIIIIIl, LoggingHandler.lIllIllIIIlIIl[LoggingHandler.lIlllIIlIllIlI[16]]));
        }
        super.disconnect(llllllllllllIlllllIIllIlIIIIIIIl, llllllllllllIlllllIIllIlIIIIIIll);
    }
}
