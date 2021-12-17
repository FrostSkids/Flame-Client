// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.socket.oio;

import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import io.netty.channel.Channel;
import java.util.Arrays;
import io.netty.channel.socket.ServerSocketChannelConfig;
import io.netty.channel.ChannelOutboundBuffer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.IOException;
import io.netty.channel.ChannelException;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import io.netty.channel.ChannelConfig;
import java.util.concurrent.locks.Lock;
import java.net.ServerSocket;
import io.netty.channel.ChannelMetadata;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.channel.socket.ServerSocketChannel;
import io.netty.channel.oio.AbstractOioMessageChannel;

public class OioServerSocketChannel extends AbstractOioMessageChannel implements ServerSocketChannel
{
    private final /* synthetic */ OioServerSocketChannelConfig config;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ String[] lIIllIlIIlIIII;
    private static final /* synthetic */ ChannelMetadata METADATA;
    final /* synthetic */ ServerSocket socket;
    private static final /* synthetic */ int[] lIIllIlIIlIIIl;
    final /* synthetic */ Lock shutdownLock;
    
    @Override
    public boolean isOpen() {
        int n;
        if (llIllIIIlIIIIll(this.socket.isClosed() ? 1 : 0)) {
            n = OioServerSocketChannel.lIIllIlIIlIIIl[1];
            "".length();
            if (-" ".length() >= 0) {
                return ((0x6F ^ 0x1 ^ (0xA1 ^ 0x95)) & (0x4B ^ 0x44 ^ (0x27 ^ 0x72) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = OioServerSocketChannel.lIIllIlIIlIIIl[0];
        }
        return n != 0;
    }
    
    @Override
    protected void doBind(final SocketAddress lllllllllllllIIlIlIllIIIIlIlIlIl) throws Exception {
        this.socket.bind(lllllllllllllIIlIlIllIIIIlIlIlIl, this.config.getBacklog());
    }
    
    @Override
    public InetSocketAddress remoteAddress() {
        return null;
    }
    
    @Override
    protected void doConnect(final SocketAddress lllllllllllllIIlIlIllIIIIIlllIlI, final SocketAddress lllllllllllllIIlIlIllIIIIIlllIIl) throws Exception {
        throw new UnsupportedOperationException();
    }
    
    static {
        llIllIIIlIIIIIl();
        llIllIIIlIIIIII();
        logger = InternalLoggerFactory.getInstance(OioServerSocketChannel.class);
        METADATA = new ChannelMetadata((boolean)(OioServerSocketChannel.lIIllIlIIlIIIl[0] != 0));
    }
    
    private static boolean llIllIIIlIIIIlI(final Object lllllllllllllIIlIlIlIllllllIllIl) {
        return lllllllllllllIIlIlIlIllllllIllIl == null;
    }
    
    @Override
    public boolean isActive() {
        int n;
        if (llIllIIIlIIIlII(this.isOpen() ? 1 : 0) && llIllIIIlIIIlII(this.socket.isBound() ? 1 : 0)) {
            n = OioServerSocketChannel.lIIllIlIIlIIIl[1];
            "".length();
            if (-"   ".length() >= 0) {
                return ((0xB6 ^ 0xBA) & ~(0x76 ^ 0x7A)) != 0x0;
            }
        }
        else {
            n = OioServerSocketChannel.lIIllIlIIlIIIl[0];
        }
        return n != 0;
    }
    
    @Override
    protected SocketAddress remoteAddress0() {
        return null;
    }
    
    public OioServerSocketChannel() {
        this(newServerSocket());
    }
    
    private static ServerSocket newServerSocket() {
        try {
            return new ServerSocket();
        }
        catch (IOException lllllllllllllIIlIlIllIIIlIIIIIII) {
            throw new ChannelException(OioServerSocketChannel.lIIllIlIIlIIII[OioServerSocketChannel.lIIllIlIIlIIIl[0]], lllllllllllllIIlIlIllIIIlIIIIIII);
        }
    }
    
    @Override
    protected void setReadPending(final boolean lllllllllllllIIlIlIllIIIIIllIIll) {
        super.setReadPending(lllllllllllllIIlIlIllIIIIIllIIll);
    }
    
    private static String llIllIIIIlllllI(final String lllllllllllllIIlIlIllIIIIIIlllIl, final String lllllllllllllIIlIlIllIIIIIIlllII) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIllIIIIIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIllIIIIIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIlIllIIIIIIlllll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIlIllIIIIIIlllll.init(OioServerSocketChannel.lIIllIlIIlIIIl[3], lllllllllllllIIlIlIllIIIIIlIIIII);
            return new String(lllllllllllllIIlIlIllIIIIIIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIllIIIIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIllIIIIIIllllI) {
            lllllllllllllIIlIlIllIIIIIIllllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ChannelMetadata metadata() {
        return OioServerSocketChannel.METADATA;
    }
    
    @Override
    protected Object filterOutboundMessage(final Object lllllllllllllIIlIlIllIIIIIllllII) throws Exception {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public InetSocketAddress localAddress() {
        return (InetSocketAddress)super.localAddress();
    }
    
    @Override
    public OioServerSocketChannelConfig config() {
        return this.config;
    }
    
    @Override
    protected void doWrite(final ChannelOutboundBuffer lllllllllllllIIlIlIllIIIIIlllllI) throws Exception {
        throw new UnsupportedOperationException();
    }
    
    private static void llIllIIIlIIIIII() {
        (lIIllIlIIlIIII = new String[OioServerSocketChannel.lIIllIlIIlIIIl[9]])[OioServerSocketChannel.lIIllIlIIlIIIl[0]] = llIllIIIIllllIl("TRw32CRX6qU1zrxCCSkGhbaNpRDff4LaNYB7yQljFJ6fxkFr5DkAqQ==", "zNJGI");
        OioServerSocketChannel.lIIllIlIIlIIII[OioServerSocketChannel.lIIllIlIIlIIIl[1]] = llIllIIIIlllllI("ORc74dozhhw=", "VgKAr");
        OioServerSocketChannel.lIIllIlIIlIIII[OioServerSocketChannel.lIIllIlIIlIIIl[3]] = llIllIIIIllllll("EQovJBAzSzInVTQHKTsQdwpmOBQlHy8pGTsSZiEbPh8vKRk+ESMsVSQEJSMQI0U=", "WkFHu");
        OioServerSocketChannel.lIIllIlIIlIIII[OioServerSocketChannel.lIIllIlIIlIIIl[4]] = llIllIIIIlllllI("WBLbSWwFT2pjXtV9YkU7AOBgt3UG4JGScLQlIUrct9rBcrW8sITvtMvSEOkTWuf2", "AlNJi");
        OioServerSocketChannel.lIIllIlIIlIIII[OioServerSocketChannel.lIIllIlIIlIIIl[5]] = llIllIIIIllllIl("YIERhuko4H905OWfL/iCHaWcU243gSPLwLA3EaF/plnglTlLEmOlAHNpK4Ut6t5k", "SriAX");
        OioServerSocketChannel.lIIllIlIIlIIII[OioServerSocketChannel.lIIllIlIIlIIIl[7]] = llIllIIIIlllllI("Nqltjg201fGUzbbjNb9mpjah0m62tceDBldFTuokzGUCK9pG6rAdOCZnQRub4M9F1HxeIM+MXX4=", "qbTYy");
        OioServerSocketChannel.lIIllIlIIlIIII[OioServerSocketChannel.lIIllIlIIlIIIl[8]] = llIllIIIIllllll("ESQ7KTIzZSYqdzQpPTYydyRyNjg0LjcxeQ==", "WEREW");
    }
    
    private static void llIllIIIlIIIIIl() {
        (lIIllIlIIlIIIl = new int[11])[0] = ((0x65 ^ 0x5) & ~(0xD7 ^ 0xB7));
        OioServerSocketChannel.lIIllIlIIlIIIl[1] = " ".length();
        OioServerSocketChannel.lIIllIlIIlIIIl[2] = (-(0xFFFFEE07 & 0x79FF) & (0xFFFFEFFE & 0x7BEF));
        OioServerSocketChannel.lIIllIlIIlIIIl[3] = "  ".length();
        OioServerSocketChannel.lIIllIlIIlIIIl[4] = "   ".length();
        OioServerSocketChannel.lIIllIlIIlIIIl[5] = (0xEA ^ 0x93 ^ (0xC0 ^ 0xBD));
        OioServerSocketChannel.lIIllIlIIlIIIl[6] = -" ".length();
        OioServerSocketChannel.lIIllIlIIlIIIl[7] = (0x29 ^ 0x2C);
        OioServerSocketChannel.lIIllIlIIlIIIl[8] = (0x67 ^ 0x61);
        OioServerSocketChannel.lIIllIlIIlIIIl[9] = (162 + 51 - 192 + 164 ^ 3 + 82 - 40 + 145);
        OioServerSocketChannel.lIIllIlIIlIIIl[10] = (0x78 ^ 0x70);
    }
    
    @Override
    protected void doDisconnect() throws Exception {
        throw new UnsupportedOperationException();
    }
    
    private static boolean llIllIIIlIIIlIl(final int lllllllllllllIIlIlIlIlllllllIIII, final int lllllllllllllIIlIlIlIllllllIllll) {
        return lllllllllllllIIlIlIlIlllllllIIII < lllllllllllllIIlIlIlIllllllIllll;
    }
    
    @Override
    protected SocketAddress localAddress0() {
        return this.socket.getLocalSocketAddress();
    }
    
    private static String llIllIIIIllllll(String lllllllllllllIIlIlIlIllllllllIll, final String lllllllllllllIIlIlIlIllllllllIlI) {
        lllllllllllllIIlIlIlIllllllllIll = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIlIlIllllllllIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIlIlIllllllllllI = new StringBuilder();
        final char[] lllllllllllllIIlIlIlIlllllllllIl = lllllllllllllIIlIlIlIllllllllIlI.toCharArray();
        int lllllllllllllIIlIlIlIlllllllllII = OioServerSocketChannel.lIIllIlIIlIIIl[0];
        final float lllllllllllllIIlIlIlIlllllllIllI = (Object)((String)lllllllllllllIIlIlIlIllllllllIll).toCharArray();
        final Exception lllllllllllllIIlIlIlIlllllllIlIl = (Exception)lllllllllllllIIlIlIlIlllllllIllI.length;
        String lllllllllllllIIlIlIlIlllllllIlII = (String)OioServerSocketChannel.lIIllIlIIlIIIl[0];
        while (llIllIIIlIIIlIl((int)lllllllllllllIIlIlIlIlllllllIlII, (int)lllllllllllllIIlIlIlIlllllllIlIl)) {
            final char lllllllllllllIIlIlIllIIIIIIIIIIl = lllllllllllllIIlIlIlIlllllllIllI[lllllllllllllIIlIlIlIlllllllIlII];
            lllllllllllllIIlIlIlIllllllllllI.append((char)(lllllllllllllIIlIlIllIIIIIIIIIIl ^ lllllllllllllIIlIlIlIlllllllllIl[lllllllllllllIIlIlIlIlllllllllII % lllllllllllllIIlIlIlIlllllllllIl.length]));
            "".length();
            ++lllllllllllllIIlIlIlIlllllllllII;
            ++lllllllllllllIIlIlIlIlllllllIlII;
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIlIlIllllllllllI);
    }
    
    private static boolean llIllIIIlIIIIll(final int lllllllllllllIIlIlIlIllllllIlIIl) {
        return lllllllllllllIIlIlIlIllllllIlIIl == 0;
    }
    
    @Override
    protected void doClose() throws Exception {
        this.socket.close();
    }
    
    private static String llIllIIIIllllIl(final String lllllllllllllIIlIlIllIIIIIIlIIII, final String lllllllllllllIIlIlIllIIIIIIIllll) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIllIIIIIIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIllIIIIIIIllll.getBytes(StandardCharsets.UTF_8)), OioServerSocketChannel.lIIllIlIIlIIIl[10]), "DES");
            final Cipher lllllllllllllIIlIlIllIIIIIIlIIlI = Cipher.getInstance("DES");
            lllllllllllllIIlIlIllIIIIIIlIIlI.init(OioServerSocketChannel.lIIllIlIIlIIIl[3], lllllllllllllIIlIlIllIIIIIIlIIll);
            return new String(lllllllllllllIIlIlIllIIIIIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIllIIIIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIllIIIIIIlIIIl) {
            lllllllllllllIIlIlIllIIIIIIlIIIl.printStackTrace();
            return null;
        }
    }
    
    public OioServerSocketChannel(final ServerSocket lllllllllllllIIlIlIllIIIIllIlllI) {
        super(null);
        this.shutdownLock = new ReentrantLock();
        if (llIllIIIlIIIIlI(lllllllllllllIIlIlIllIIIIllIlllI)) {
            throw new NullPointerException(OioServerSocketChannel.lIIllIlIIlIIII[OioServerSocketChannel.lIIllIlIIlIIIl[1]]);
        }
        boolean lllllllllllllIIlIlIllIIIIlllIIII = OioServerSocketChannel.lIIllIlIIlIIIl[0] != 0;
        try {
            lllllllllllllIIlIlIllIIIIllIlllI.setSoTimeout(OioServerSocketChannel.lIIllIlIIlIIIl[2]);
            lllllllllllllIIlIlIllIIIIlllIIII = (OioServerSocketChannel.lIIllIlIIlIIIl[1] != 0);
            if (llIllIIIlIIIIll(lllllllllllllIIlIlIllIIIIlllIIII ? 1 : 0)) {
                try {
                    lllllllllllllIIlIlIllIIIIllIlllI.close();
                    "".length();
                    if (-"  ".length() >= 0) {
                        throw null;
                    }
                }
                catch (IOException lllllllllllllIIlIlIllIIIIlllIlIl) {
                    if (llIllIIIlIIIlII(OioServerSocketChannel.logger.isWarnEnabled() ? 1 : 0)) {
                        OioServerSocketChannel.logger.warn(OioServerSocketChannel.lIIllIlIIlIIII[OioServerSocketChannel.lIIllIlIIlIIIl[3]], lllllllllllllIIlIlIllIIIIlllIlIl);
                    }
                    "".length();
                    if (-"   ".length() >= 0) {
                        throw null;
                    }
                }
            }
        }
        catch (IOException lllllllllllllIIlIlIllIIIIlllIlII) {
            throw new ChannelException(OioServerSocketChannel.lIIllIlIIlIIII[OioServerSocketChannel.lIIllIlIIlIIIl[4]], lllllllllllllIIlIlIllIIIIlllIlII);
        }
        finally {
            if (llIllIIIlIIIIll(lllllllllllllIIlIlIllIIIIlllIIII ? 1 : 0)) {
                try {
                    lllllllllllllIIlIlIllIIIIllIlllI.close();
                    "".length();
                    if (null != null) {
                        throw null;
                    }
                }
                catch (IOException lllllllllllllIIlIlIllIIIIlllIIll) {
                    if (llIllIIIlIIIlII(OioServerSocketChannel.logger.isWarnEnabled() ? 1 : 0)) {
                        OioServerSocketChannel.logger.warn(OioServerSocketChannel.lIIllIlIIlIIII[OioServerSocketChannel.lIIllIlIIlIIIl[5]], lllllllllllllIIlIlIllIIIIlllIIll);
                    }
                }
            }
        }
        this.socket = lllllllllllllIIlIlIllIIIIllIlllI;
        this.config = new DefaultOioServerSocketChannelConfig(this, lllllllllllllIIlIlIllIIIIllIlllI);
    }
    
    private static boolean llIllIIIlIIIlII(final int lllllllllllllIIlIlIlIllllllIlIll) {
        return lllllllllllllIIlIlIlIllllllIlIll != 0;
    }
    
    @Override
    protected int doReadMessages(final List<Object> lllllllllllllIIlIlIllIIIIlIIIIll) throws Exception {
        if (llIllIIIlIIIlII(this.socket.isClosed() ? 1 : 0)) {
            return OioServerSocketChannel.lIIllIlIIlIIIl[6];
        }
        try {
            final Socket lllllllllllllIIlIlIllIIIIlIIlIII = this.socket.accept();
            try {
                lllllllllllllIIlIlIllIIIIlIIIIll.add(new OioSocketChannel(this, lllllllllllllIIlIlIllIIIIlIIlIII));
                "".length();
                return OioServerSocketChannel.lIIllIlIIlIIIl[1];
            }
            catch (Throwable lllllllllllllIIlIlIllIIIIlIIlIIl) {
                OioServerSocketChannel.logger.warn(OioServerSocketChannel.lIIllIlIIlIIII[OioServerSocketChannel.lIIllIlIIlIIIl[7]], lllllllllllllIIlIlIllIIIIlIIlIIl);
                try {
                    lllllllllllllIIlIlIllIIIIlIIlIII.close();
                    "".length();
                    if (((75 + 112 - 49 + 79 ^ 151 + 75 - 175 + 106) & (218 + 84 - 196 + 141 ^ 9 + 58 + 67 + 45 ^ -" ".length())) > 0) {
                        return (0x4B ^ 0x7A ^ (0x37 ^ 0x29)) & (0x4D ^ 0x5 ^ (0xA ^ 0x6D) ^ -" ".length());
                    }
                }
                catch (Throwable lllllllllllllIIlIlIllIIIIlIIlIlI) {
                    OioServerSocketChannel.logger.warn(OioServerSocketChannel.lIIllIlIIlIIII[OioServerSocketChannel.lIIllIlIIlIIIl[8]], lllllllllllllIIlIlIllIIIIlIIlIlI);
                }
                "".length();
                if ((0x28 ^ 0x2C) < "   ".length()) {
                    return (0x2B ^ 0x37) & ~(0x23 ^ 0x3F);
                }
                return OioServerSocketChannel.lIIllIlIIlIIIl[0];
            }
        }
        catch (SocketTimeoutException ex) {}
        return OioServerSocketChannel.lIIllIlIIlIIIl[0];
    }
}
