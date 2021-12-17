// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.socket.oio;

import io.netty.channel.socket.SocketChannelConfig;
import io.netty.channel.ChannelException;
import java.io.IOException;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelConfig;
import io.netty.channel.Channel;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import io.netty.channel.EventLoop;
import io.netty.channel.ChannelPromise;
import java.net.InetSocketAddress;
import io.netty.channel.ChannelFuture;
import io.netty.channel.socket.ServerSocketChannel;
import java.net.SocketTimeoutException;
import io.netty.channel.ConnectTimeoutException;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.net.SocketAddress;
import java.net.Socket;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.oio.OioByteStreamChannel;

public class OioSocketChannel extends OioByteStreamChannel implements SocketChannel
{
    private static final /* synthetic */ String[] lllIIIIIllllII;
    private final /* synthetic */ OioSocketChannelConfig config;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ int[] lllIIIIlllIIll;
    private final /* synthetic */ Socket socket;
    
    @Override
    protected void doClose() throws Exception {
        this.socket.close();
    }
    
    private static String lIIlllIIIlIlIIlI(String llllllllllllIllIIIIIlllllllIlIIl, final String llllllllllllIllIIIIIlllllllIlIII) {
        llllllllllllIllIIIIIlllllllIlIIl = new String(Base64.getDecoder().decode(llllllllllllIllIIIIIlllllllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIIlllllllIllII = new StringBuilder();
        final char[] llllllllllllIllIIIIIlllllllIlIll = llllllllllllIllIIIIIlllllllIlIII.toCharArray();
        int llllllllllllIllIIIIIlllllllIlIlI = OioSocketChannel.lllIIIIlllIIll[0];
        final String llllllllllllIllIIIIIlllllllIIlII = (Object)llllllllllllIllIIIIIlllllllIlIIl.toCharArray();
        final boolean llllllllllllIllIIIIIlllllllIIIll = llllllllllllIllIIIIIlllllllIIlII.length != 0;
        short llllllllllllIllIIIIIlllllllIIIlI = (short)OioSocketChannel.lllIIIIlllIIll[0];
        while (lIIlllIIlllllllI(llllllllllllIllIIIIIlllllllIIIlI, llllllllllllIllIIIIIlllllllIIIll ? 1 : 0)) {
            final char llllllllllllIllIIIIIlllllllIllll = llllllllllllIllIIIIIlllllllIIlII[llllllllllllIllIIIIIlllllllIIIlI];
            llllllllllllIllIIIIIlllllllIllII.append((char)(llllllllllllIllIIIIIlllllllIllll ^ llllllllllllIllIIIIIlllllllIlIll[llllllllllllIllIIIIIlllllllIlIlI % llllllllllllIllIIIIIlllllllIlIll.length]));
            "".length();
            ++llllllllllllIllIIIIIlllllllIlIlI;
            ++llllllllllllIllIIIIIlllllllIIIlI;
            "".length();
            if (-" ".length() > (0x58 ^ 0x5C)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIIlllllllIllII);
    }
    
    @Override
    public boolean isOpen() {
        int n;
        if (lIIlllIIlllllIIl(this.socket.isClosed() ? 1 : 0)) {
            n = OioSocketChannel.lllIIIIlllIIll[2];
            "".length();
            if (null != null) {
                return (" ".length() & ~" ".length()) != 0x0;
            }
        }
        else {
            n = OioSocketChannel.lllIIIIlllIIll[0];
        }
        return n != 0;
    }
    
    static {
        lIIlllIIllllIlll();
        lIIlllIIIlIllIII();
        logger = InternalLoggerFactory.getInstance(OioSocketChannel.class);
    }
    
    @Override
    protected void doConnect(final SocketAddress llllllllllllIllIIIIlIIIIIIlIIIll, final SocketAddress llllllllllllIllIIIIlIIIIIIlIIIlI) throws Exception {
        if (lIIlllIIllllllIl(llllllllllllIllIIIIlIIIIIIlIIIlI)) {
            this.socket.bind(llllllllllllIllIIIIlIIIIIIlIIIlI);
        }
        boolean llllllllllllIllIIIIlIIIIIIlIIIIl = OioSocketChannel.lllIIIIlllIIll[0] != 0;
        try {
            this.socket.connect(llllllllllllIllIIIIlIIIIIIlIIIll, this.config().getConnectTimeoutMillis());
            this.activate(this.socket.getInputStream(), this.socket.getOutputStream());
            llllllllllllIllIIIIlIIIIIIlIIIIl = (OioSocketChannel.lllIIIIlllIIll[2] != 0);
            if (lIIlllIIlllllIIl(llllllllllllIllIIIIlIIIIIIlIIIIl ? 1 : 0)) {
                this.doClose();
                "".length();
                if (((0x5 ^ 0x1C ^ (0xB4 ^ 0x85)) & (0x70 ^ 0x0 ^ (0xC8 ^ 0x90) ^ -" ".length()) & (((0x1A ^ 0x32 ^ (0x6B ^ 0x7F)) & (0xD8 ^ 0x9E ^ (0xC4 ^ 0xBE) ^ -" ".length())) ^ -" ".length())) > ((0x2A ^ 0x24 ^ (0xA6 ^ 0xB4)) & (0x25 ^ 0x76 ^ (0x7F ^ 0x30) ^ -" ".length()))) {
                    return;
                }
            }
        }
        catch (SocketTimeoutException llllllllllllIllIIIIlIIIIIIlIIlIl) {
            final ConnectTimeoutException llllllllllllIllIIIIlIIIIIIlIIllI = new ConnectTimeoutException(String.valueOf(new StringBuilder().append(OioSocketChannel.lllIIIIIllllII[OioSocketChannel.lllIIIIlllIIll[5]]).append(llllllllllllIllIIIIlIIIIIIlIIIll)));
            llllllllllllIllIIIIlIIIIIIlIIllI.setStackTrace(llllllllllllIllIIIIlIIIIIIlIIlIl.getStackTrace());
            throw llllllllllllIllIIIIlIIIIIIlIIllI;
        }
        finally {
            if (lIIlllIIlllllIIl(llllllllllllIllIIIIlIIIIIIlIIIIl ? 1 : 0)) {
                this.doClose();
            }
        }
    }
    
    public OioSocketChannel() {
        this(new Socket());
    }
    
    private static boolean lIIlllIIllllllIl(final Object llllllllllllIllIIIIIllllllIIIIIl) {
        return llllllllllllIllIIIIIllllllIIIIIl != null;
    }
    
    @Override
    public ServerSocketChannel parent() {
        return (ServerSocketChannel)super.parent();
    }
    
    @Override
    public boolean isInputShutdown() {
        return super.isInputShutdown();
    }
    
    @Override
    public ChannelFuture shutdownOutput() {
        return this.shutdownOutput(this.newPromise());
    }
    
    @Override
    public InetSocketAddress remoteAddress() {
        return (InetSocketAddress)super.remoteAddress();
    }
    
    @Override
    public ChannelFuture shutdownOutput(final ChannelPromise llllllllllllIllIIIIlIIIIIlIIIIlI) {
        final EventLoop llllllllllllIllIIIIlIIIIIlIIIlII = this.eventLoop();
        if (lIIlllIIlllllIII(llllllllllllIllIIIIlIIIIIlIIIlII.inEventLoop() ? 1 : 0)) {
            try {
                this.socket.shutdownOutput();
                llllllllllllIllIIIIlIIIIIlIIIIlI.setSuccess();
                "".length();
                "".length();
                if ("   ".length() <= 0) {
                    return null;
                }
                return llllllllllllIllIIIIlIIIIIlIIIIlI;
            }
            catch (Throwable llllllllllllIllIIIIlIIIIIlIIIlll) {
                llllllllllllIllIIIIlIIIIIlIIIIlI.setFailure(llllllllllllIllIIIIlIIIIIlIIIlll);
                "".length();
                "".length();
                if (-"  ".length() > 0) {
                    return null;
                }
                return llllllllllllIllIIIIlIIIIIlIIIIlI;
            }
        }
        llllllllllllIllIIIIlIIIIIlIIIlII.execute(new Runnable() {
            @Override
            public void run() {
                OioSocketChannel.this.shutdownOutput(llllllllllllIllIIIIlIIIIIlIIIIlI);
                "".length();
            }
        });
        return llllllllllllIllIIIIlIIIIIlIIIIlI;
    }
    
    @Override
    protected void setReadPending(final boolean llllllllllllIllIIIIlIIIIIIIIlIlI) {
        super.setReadPending(llllllllllllIllIIIIlIIIIIIIIlIlI);
    }
    
    private static String lIIlllIIIlIlIllI(final String llllllllllllIllIIIIIllllllIIlIlI, final String llllllllllllIllIIIIIllllllIIlIll) {
        try {
            final SecretKeySpec llllllllllllIllIIIIIllllllIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIllllllIIlIll.getBytes(StandardCharsets.UTF_8)), OioSocketChannel.lllIIIIlllIIll[7]), "DES");
            final Cipher llllllllllllIllIIIIIllllllIIlllI = Cipher.getInstance("DES");
            llllllllllllIllIIIIIllllllIIlllI.init(OioSocketChannel.lllIIIIlllIIll[3], llllllllllllIllIIIIIllllllIIllll);
            return new String(llllllllllllIllIIIIIllllllIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIllllllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIIllllllIIllIl) {
            llllllllllllIllIIIIIllllllIIllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlllIIlllllllI(final int llllllllllllIllIIIIIllllllIIIlII, final int llllllllllllIllIIIIIllllllIIIIll) {
        return llllllllllllIllIIIIIllllllIIIlII < llllllllllllIllIIIIIllllllIIIIll;
    }
    
    private static boolean lIIlllIIlllllIII(final int llllllllllllIllIIIIIlllllIllllll) {
        return llllllllllllIllIIIIIlllllIllllll != 0;
    }
    
    private static void lIIlllIIIlIllIII() {
        (lllIIIIIllllII = new String[OioSocketChannel.lllIIIIlllIIll[6]])[OioSocketChannel.lllIIIIlllIIll[0]] = lIIlllIIIlIlIIlI("IAArORACQTY6VQUNLSYQRgBiJhoFCichWw==", "faBUu");
        OioSocketChannel.lllIIIIIllllII[OioSocketChannel.lllIIIIlllIIll[2]] = lIIlllIIIlIlIIll("Dva8Sk9qQKNDO0v03YlEs9EgnCKyev5JLGJvNkc+v8o=", "iJFEq");
        OioSocketChannel.lllIIIIIllllII[OioSocketChannel.lllIIIIlllIIll[3]] = lIIlllIIIlIlIllI("N4jh09EkzXY64c+0egab143CvwOHcnrnCQusuMN5Mgg=", "SumsO");
        OioSocketChannel.lllIIIIIllllII[OioSocketChannel.lllIIIIlllIIll[5]] = lIIlllIIIlIlIllI("hwbTwCEce+9djNdQ5hThVH7zYtVoRlfN", "teiUR");
    }
    
    public OioSocketChannel(final Socket llllllllllllIllIIIIlIIIIlIIIIlIl) {
        this(null, llllllllllllIllIIIIlIIIIlIIIIlIl);
    }
    
    private static String lIIlllIIIlIlIIll(final String llllllllllllIllIIIIIllllllIllIIl, final String llllllllllllIllIIIIIllllllIlIllI) {
        try {
            final SecretKeySpec llllllllllllIllIIIIIllllllIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIllllllIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIIIllllllIllIll = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIIIllllllIllIll.init(OioSocketChannel.lllIIIIlllIIll[3], llllllllllllIllIIIIIllllllIlllII);
            return new String(llllllllllllIllIIIIIllllllIllIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIllllllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIIllllllIllIlI) {
            llllllllllllIllIIIIIllllllIllIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected int doReadBytes(final ByteBuf llllllllllllIllIIIIlIIIIIlIIllIl) throws Exception {
        if (lIIlllIIlllllIII(this.socket.isClosed() ? 1 : 0)) {
            return OioSocketChannel.lllIIIIlllIIll[4];
        }
        try {
            return super.doReadBytes(llllllllllllIllIIIIlIIIIIlIIllIl);
        }
        catch (SocketTimeoutException llllllllllllIllIIIIlIIIIIlIlIIIl) {
            return OioSocketChannel.lllIIIIlllIIll[0];
        }
    }
    
    @Override
    protected SocketAddress remoteAddress0() {
        return this.socket.getRemoteSocketAddress();
    }
    
    @Override
    public boolean isActive() {
        int n;
        if (lIIlllIIlllllIIl(this.socket.isClosed() ? 1 : 0) && lIIlllIIlllllIII(this.socket.isConnected() ? 1 : 0)) {
            n = OioSocketChannel.lllIIIIlllIIll[2];
            "".length();
            if (" ".length() == 0) {
                return ((0x50 ^ 0x18 ^ (0x63 ^ 0x68)) & (120 + 164 - 251 + 167 ^ 107 + 64 - 137 + 105 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = OioSocketChannel.lllIIIIlllIIll[0];
        }
        return n != 0;
    }
    
    @Override
    protected SocketAddress localAddress0() {
        return this.socket.getLocalSocketAddress();
    }
    
    private static void lIIlllIIllllIlll() {
        (lllIIIIlllIIll = new int[8])[0] = ((0xCD ^ 0x84) & ~(0x55 ^ 0x1C));
        OioSocketChannel.lllIIIIlllIIll[1] = (0xFFFFBFFB & 0x43EC);
        OioSocketChannel.lllIIIIlllIIll[2] = " ".length();
        OioSocketChannel.lllIIIIlllIIll[3] = "  ".length();
        OioSocketChannel.lllIIIIlllIIll[4] = -" ".length();
        OioSocketChannel.lllIIIIlllIIll[5] = "   ".length();
        OioSocketChannel.lllIIIIlllIIll[6] = (0x82 ^ 0x86);
        OioSocketChannel.lllIIIIlllIIll[7] = (0x68 ^ 0x60);
    }
    
    private static boolean lIIlllIIlllllIIl(final int llllllllllllIllIIIIIlllllIllllIl) {
        return llllllllllllIllIIIIIlllllIllllIl == 0;
    }
    
    @Override
    protected void doDisconnect() throws Exception {
        this.doClose();
    }
    
    public OioSocketChannel(final Channel llllllllllllIllIIIIlIIIIIllIllll, final Socket llllllllllllIllIIIIlIIIIIlllIIlI) {
        super(llllllllllllIllIIIIlIIIIIllIllll);
        this.socket = llllllllllllIllIIIIlIIIIIlllIIlI;
        this.config = new DefaultOioSocketChannelConfig(this, llllllllllllIllIIIIlIIIIIlllIIlI);
        boolean llllllllllllIllIIIIlIIIIIlllIIIl = OioSocketChannel.lllIIIIlllIIll[0] != 0;
        try {
            if (lIIlllIIlllllIII(llllllllllllIllIIIIlIIIIIlllIIlI.isConnected() ? 1 : 0)) {
                this.activate(llllllllllllIllIIIIlIIIIIlllIIlI.getInputStream(), llllllllllllIllIIIIlIIIIIlllIIlI.getOutputStream());
            }
            llllllllllllIllIIIIlIIIIIlllIIlI.setSoTimeout(OioSocketChannel.lllIIIIlllIIll[1]);
            llllllllllllIllIIIIlIIIIIlllIIIl = (OioSocketChannel.lllIIIIlllIIll[2] != 0);
            if (lIIlllIIlllllIIl(llllllllllllIllIIIIlIIIIIlllIIIl ? 1 : 0)) {
                try {
                    llllllllllllIllIIIIlIIIIIlllIIlI.close();
                    "".length();
                    if (null != null) {
                        throw null;
                    }
                }
                catch (IOException llllllllllllIllIIIIlIIIIIlllIlll) {
                    OioSocketChannel.logger.warn(OioSocketChannel.lllIIIIIllllII[OioSocketChannel.lllIIIIlllIIll[0]], llllllllllllIllIIIIlIIIIIlllIlll);
                    "".length();
                    if (null != null) {
                        throw null;
                    }
                }
            }
        }
        catch (Exception llllllllllllIllIIIIlIIIIIlllIllI) {
            throw new ChannelException(OioSocketChannel.lllIIIIIllllII[OioSocketChannel.lllIIIIlllIIll[2]], llllllllllllIllIIIIlIIIIIlllIllI);
        }
        finally {
            if (lIIlllIIlllllIIl(llllllllllllIllIIIIlIIIIIlllIIIl ? 1 : 0)) {
                try {
                    llllllllllllIllIIIIlIIIIIlllIIlI.close();
                    "".length();
                    if (-" ".length() > "   ".length()) {
                        throw null;
                    }
                }
                catch (IOException llllllllllllIllIIIIlIIIIIlllIlIl) {
                    OioSocketChannel.logger.warn(OioSocketChannel.lllIIIIIllllII[OioSocketChannel.lllIIIIlllIIll[3]], llllllllllllIllIIIIlIIIIIlllIlIl);
                }
            }
        }
    }
    
    @Override
    protected void doBind(final SocketAddress llllllllllllIllIIIIlIIIIIIlIlllI) throws Exception {
        this.socket.bind(llllllllllllIllIIIIlIIIIIIlIlllI);
    }
    
    @Override
    public OioSocketChannelConfig config() {
        return this.config;
    }
    
    @Override
    protected boolean checkInputShutdown() {
        if (lIIlllIIlllllIII(this.isInputShutdown() ? 1 : 0)) {
            try {
                Thread.sleep(this.config().getSoTimeout());
                "".length();
                if (" ".length() != " ".length()) {
                    return ((0x43 ^ 0x67 ^ (0xE8 ^ 0xAF)) & (68 + 119 - 27 + 48 ^ 171 + 165 - 170 + 13 ^ -" ".length())) != 0x0;
                }
            }
            catch (Throwable t) {}
            return OioSocketChannel.lllIIIIlllIIll[2] != 0;
        }
        return OioSocketChannel.lllIIIIlllIIll[0] != 0;
    }
    
    @Override
    public InetSocketAddress localAddress() {
        return (InetSocketAddress)super.localAddress();
    }
    
    @Override
    public boolean isOutputShutdown() {
        int n;
        if (!lIIlllIIlllllIIl(this.socket.isOutputShutdown() ? 1 : 0) || lIIlllIIlllllIIl(this.isActive() ? 1 : 0)) {
            n = OioSocketChannel.lllIIIIlllIIll[2];
            "".length();
            if (null != null) {
                return ((0xE5 ^ 0xB0) & ~(0xCF ^ 0x9A)) != 0x0;
            }
        }
        else {
            n = OioSocketChannel.lllIIIIlllIIll[0];
        }
        return n != 0;
    }
}
