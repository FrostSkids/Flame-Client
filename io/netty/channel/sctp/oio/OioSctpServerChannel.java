// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.sctp.oio;

import io.netty.channel.sctp.DefaultSctpServerChannelConfig;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.channel.ChannelConfig;
import com.sun.nio.sctp.SctpChannel;
import java.nio.channels.SelectionKey;
import java.util.List;
import io.netty.channel.Channel;
import java.util.Iterator;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import io.netty.channel.ChannelOutboundBuffer;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelPromise;
import java.net.InetAddress;
import java.io.IOException;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelMetadata;
import java.nio.channels.Selector;
import io.netty.channel.sctp.SctpServerChannelConfig;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.channel.sctp.SctpServerChannel;
import io.netty.channel.oio.AbstractOioMessageChannel;

public class OioSctpServerChannel extends AbstractOioMessageChannel implements SctpServerChannel
{
    private static final /* synthetic */ int[] lIIIlIIlllllIl;
    private static final /* synthetic */ InternalLogger logger;
    private final /* synthetic */ SctpServerChannelConfig config;
    private final /* synthetic */ Selector selector;
    private final /* synthetic */ com.sun.nio.sctp.SctpServerChannel sch;
    private static final /* synthetic */ String[] lIIIlIIlllllII;
    private static final /* synthetic */ ChannelMetadata METADATA;
    
    private static com.sun.nio.sctp.SctpServerChannel newServerSocket() {
        try {
            return com.sun.nio.sctp.SctpServerChannel.open();
        }
        catch (IOException lllllllllllllIlIIIlIIIlllIlIlllI) {
            throw new ChannelException(OioSctpServerChannel.lIIIlIIlllllII[OioSctpServerChannel.lIIIlIIlllllIl[0]], lllllllllllllIlIIIlIIIlllIlIlllI);
        }
    }
    
    @Override
    public ChannelFuture unbindAddress(final InetAddress lllllllllllllIlIIIlIIIllIIllIIIl, final ChannelPromise lllllllllllllIlIIIlIIIllIIllIIII) {
        if (llIIIIIIIIIlIIl(this.eventLoop().inEventLoop() ? 1 : 0)) {
            try {
                this.sch.unbindAddress(lllllllllllllIlIIIlIIIllIIllIIIl);
                "".length();
                lllllllllllllIlIIIlIIIllIIllIIII.setSuccess();
                "".length();
                "".length();
                if ("  ".length() > (0x95 ^ 0x91)) {
                    return null;
                }
                return lllllllllllllIlIIIlIIIllIIllIIII;
            }
            catch (Throwable lllllllllllllIlIIIlIIIllIIllIIll) {
                lllllllllllllIlIIIlIIIllIIllIIII.setFailure(lllllllllllllIlIIIlIIIllIIllIIll);
                "".length();
                "".length();
                if ("  ".length() != "  ".length()) {
                    return null;
                }
                return lllllllllllllIlIIIlIIIllIIllIIII;
            }
        }
        this.eventLoop().execute(new Runnable() {
            @Override
            public void run() {
                OioSctpServerChannel.this.unbindAddress(lllllllllllllIlIIIlIIIllIIllIIIl, lllllllllllllIlIIIlIIIllIIllIIII);
                "".length();
            }
        });
        return lllllllllllllIlIIIlIIIllIIllIIII;
    }
    
    @Override
    protected void doDisconnect() throws Exception {
        throw new UnsupportedOperationException();
    }
    
    @Override
    protected void doClose() throws Exception {
        try {
            this.selector.close();
            "".length();
            if (" ".length() != " ".length()) {
                return;
            }
        }
        catch (IOException lllllllllllllIlIIIlIIIllIllIlIlI) {
            OioSctpServerChannel.logger.warn(OioSctpServerChannel.lIIIlIIlllllII[OioSctpServerChannel.lIIIlIIlllllIl[6]], lllllllllllllIlIIIlIIIllIllIlIlI);
        }
        this.sch.close();
    }
    
    @Override
    public boolean isActive() {
        int n;
        if (llIIIIIIIIIlIIl(this.isOpen() ? 1 : 0) && llIIIIIIIIIlIlI(this.localAddress0())) {
            n = OioSctpServerChannel.lIIIlIIlllllIl[1];
            "".length();
            if (null != null) {
                return ((0x1B ^ 0x79 ^ (0x59 ^ 0x71)) & (0xC ^ 0x3B ^ (0xE4 ^ 0x99) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = OioSctpServerChannel.lIIIlIIlllllIl[0];
        }
        return n != 0;
    }
    
    @Override
    protected void doWrite(final ChannelOutboundBuffer lllllllllllllIlIIIlIIIllIIlIIlIl) throws Exception {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public InetSocketAddress localAddress() {
        return (InetSocketAddress)super.localAddress();
    }
    
    private static void llIIIIIIIIIIlIl() {
        (lIIIlIIlllllII = new String[OioSctpServerChannel.lIIIlIIlllllIl[10]])[OioSctpServerChannel.lIIIlIIlllllIl[0]] = llIIIIIIIIIIIlI("1Rexe5G3gd5Fyh2UzXOeilcO1cvVr1D5MGjjiSVAkuTMwU9whgMDng==", "XgNuz");
        OioSctpServerChannel.lIIIlIIlllllII[OioSctpServerChannel.lIIIlIIlllllIl[1]] = llIIIIIIIIIIIll("CRMfFXYJFRkTMwhQCA03FB4OCQ==", "zpkeV");
        OioSctpServerChannel.lIIIlIIlllllII[OioSctpServerChannel.lIIIlIIlllllIl[3]] = llIIIIIIIIIIlII("Xbqknza9SlFMmBxWQFI/AJ8kPoR3IW0qQ8LLfYf3s2L1cZSm7Bh42g==", "ikxom");
        OioSctpServerChannel.lIIIlIIlllllII[OioSctpServerChannel.lIIIlIIlllllIl[4]] = llIIIIIIIIIIIlI("FQPtfccW0zm8moLEhnNHarD8dOaPNapLJdK26rUoruphh3w3unh1cuoN/f3gwUGT", "Lewap");
        OioSctpServerChannel.lIIIlIIlllllII[OioSctpServerChannel.lIIIlIIlllllIl[5]] = llIIIIIIIIIIIlI("SGX6hyBQE+DS5Um3nFfcRzDDROvxDVEEC1NRdHybdEwuw3vU4BGsVg==", "pFbhk");
        OioSctpServerChannel.lIIIlIIlllllII[OioSctpServerChannel.lIIIlIIlllllIl[6]] = llIIIIIIIIIIIll("LAM8KykOQiEobAkOOjQpSgN1NCkGBzYzIxhM", "jbUGL");
        OioSctpServerChannel.lIIIlIIlllllII[OioSctpServerChannel.lIIIlIIlllllIl[8]] = llIIIIIIIIIIIll("HwQsDSI9RTEOZzoXIAAzPEUkQSk8EmUCLzgLKwQreQM3Dip5BCtBJjoGIBEzPAFlEiQtFWUCLzgLKwQrdw==", "YeEaG");
        OioSctpServerChannel.lIIIlIIlllllII[OioSctpServerChannel.lIIIlIIlllllIl[9]] = llIIIIIIIIIIlII("p8b18saShR9TbUpssfFEN09cPhkqS4snMoCqaTGtyGM=", "TkzGF");
    }
    
    @Override
    public ChannelFuture bindAddress(final InetAddress lllllllllllllIlIIIlIIIllIlIIIIII, final ChannelPromise lllllllllllllIlIIIlIIIllIIllllll) {
        if (llIIIIIIIIIlIIl(this.eventLoop().inEventLoop() ? 1 : 0)) {
            try {
                this.sch.bindAddress(lllllllllllllIlIIIlIIIllIlIIIIII);
                "".length();
                lllllllllllllIlIIIlIIIllIIllllll.setSuccess();
                "".length();
                "".length();
                if (-"  ".length() > 0) {
                    return null;
                }
                return lllllllllllllIlIIIlIIIllIIllllll;
            }
            catch (Throwable lllllllllllllIlIIIlIIIllIlIIIlIl) {
                lllllllllllllIlIIIlIIIllIIllllll.setFailure(lllllllllllllIlIIIlIIIllIlIIIlIl);
                "".length();
                "".length();
                if ("  ".length() > "  ".length()) {
                    return null;
                }
                return lllllllllllllIlIIIlIIIllIIllllll;
            }
        }
        this.eventLoop().execute(new Runnable() {
            @Override
            public void run() {
                OioSctpServerChannel.this.bindAddress(lllllllllllllIlIIIlIIIllIlIIIIII, lllllllllllllIlIIIlIIIllIIllllll);
                "".length();
            }
        });
        return lllllllllllllIlIIIlIIIllIIllllll;
    }
    
    static {
        llIIIIIIIIIIllI();
        llIIIIIIIIIIlIl();
        logger = InternalLoggerFactory.getInstance(OioSctpServerChannel.class);
        METADATA = new ChannelMetadata((boolean)(OioSctpServerChannel.lIIIlIIlllllIl[0] != 0));
    }
    
    private static boolean llIIIIIIIIIllII(final int lllllllllllllIlIIIlIIIlIllIlllll, final int lllllllllllllIlIIIlIIIlIllIllllI) {
        return lllllllllllllIlIIIlIIIlIllIlllll < lllllllllllllIlIIIlIIIlIllIllllI;
    }
    
    private static boolean llIIIIIIIIIlIIl(final int lllllllllllllIlIIIlIIIlIllIllIII) {
        return lllllllllllllIlIIIlIIIlIllIllIII != 0;
    }
    
    @Override
    public Set<InetSocketAddress> allLocalAddresses() {
        try {
            final Set<SocketAddress> lllllllllllllIlIIIlIIIllIllllllI = this.sch.getAllLocalAddresses();
            final Set<InetSocketAddress> lllllllllllllIlIIIlIIIllIlllllIl = new LinkedHashSet<InetSocketAddress>(lllllllllllllIlIIIlIIIllIllllllI.size());
            final Iterator lllllllllllllIlIIIlIIIllIlllllll = lllllllllllllIlIIIlIIIllIllllllI.iterator();
            while (llIIIIIIIIIlIIl(lllllllllllllIlIIIlIIIllIlllllll.hasNext() ? 1 : 0)) {
                final SocketAddress lllllllllllllIlIIIlIIIlllIIIIIII = lllllllllllllIlIIIlIIIllIlllllll.next();
                lllllllllllllIlIIIlIIIllIlllllIl.add((InetSocketAddress)lllllllllllllIlIIIlIIIlllIIIIIII);
                "".length();
                "".length();
                if (-(0x44 ^ 0x40) > 0) {
                    return null;
                }
            }
            return lllllllllllllIlIIIlIIIllIlllllIl;
        }
        catch (Throwable lllllllllllllIlIIIlIIIllIlllllII) {
            return Collections.emptySet();
        }
    }
    
    @Override
    public ChannelMetadata metadata() {
        return OioSctpServerChannel.METADATA;
    }
    
    public OioSctpServerChannel(final com.sun.nio.sctp.SctpServerChannel lllllllllllllIlIIIlIIIlllIIlllII) {
        super(null);
        if (llIIIIIIIIIIlll(lllllllllllllIlIIIlIIIlllIIlllII)) {
            throw new NullPointerException(OioSctpServerChannel.lIIIlIIlllllII[OioSctpServerChannel.lIIIlIIlllllIl[1]]);
        }
        this.sch = lllllllllllllIlIIIlIIIlllIIlllII;
        boolean lllllllllllllIlIIIlIIIlllIIllllI = OioSctpServerChannel.lIIIlIIlllllIl[0] != 0;
        try {
            lllllllllllllIlIIIlIIIlllIIlllII.configureBlocking((boolean)(OioSctpServerChannel.lIIIlIIlllllIl[0] != 0));
            "".length();
            this.selector = Selector.open();
            lllllllllllllIlIIIlIIIlllIIlllII.register(this.selector, OioSctpServerChannel.lIIIlIIlllllIl[2]);
            "".length();
            this.config = new OioSctpServerChannelConfig(this, lllllllllllllIlIIIlIIIlllIIlllII);
            lllllllllllllIlIIIlIIIlllIIllllI = (OioSctpServerChannel.lIIIlIIlllllIl[1] != 0);
            if (llIIIIIIIIIlIII(lllllllllllllIlIIIlIIIlllIIllllI ? 1 : 0)) {
                try {
                    lllllllllllllIlIIIlIIIlllIIlllII.close();
                    "".length();
                    if (-" ".length() != -" ".length()) {
                        throw null;
                    }
                }
                catch (IOException lllllllllllllIlIIIlIIIlllIlIIIll) {
                    OioSctpServerChannel.logger.warn(OioSctpServerChannel.lIIIlIIlllllII[OioSctpServerChannel.lIIIlIIlllllIl[3]], lllllllllllllIlIIIlIIIlllIlIIIll);
                    "".length();
                    if (" ".length() != " ".length()) {
                        throw null;
                    }
                }
            }
        }
        catch (Exception lllllllllllllIlIIIlIIIlllIlIIIlI) {
            throw new ChannelException(OioSctpServerChannel.lIIIlIIlllllII[OioSctpServerChannel.lIIIlIIlllllIl[4]], lllllllllllllIlIIIlIIIlllIlIIIlI);
        }
        finally {
            if (llIIIIIIIIIlIII(lllllllllllllIlIIIlIIIlllIIllllI ? 1 : 0)) {
                try {
                    lllllllllllllIlIIIlIIIlllIIlllII.close();
                    "".length();
                    if (null != null) {
                        throw null;
                    }
                }
                catch (IOException lllllllllllllIlIIIlIIIlllIlIIIIl) {
                    OioSctpServerChannel.logger.warn(OioSctpServerChannel.lIIIlIIlllllII[OioSctpServerChannel.lIIIlIIlllllIl[5]], lllllllllllllIlIIIlIIIlllIlIIIIl);
                }
            }
        }
    }
    
    @Override
    protected void doBind(final SocketAddress lllllllllllllIlIIIlIIIllIllIllll) throws Exception {
        this.sch.bind(lllllllllllllIlIIIlIIIllIllIllll, this.config.getBacklog());
        "".length();
    }
    
    private static boolean llIIIIIIIIIlIll(final int lllllllllllllIlIIIlIIIlIllIlIlII) {
        return lllllllllllllIlIIIlIIIlIllIlIlII > 0;
    }
    
    @Override
    protected void doConnect(final SocketAddress lllllllllllllIlIIIlIIIllIIlIlIlI, final SocketAddress lllllllllllllIlIIIlIIIllIIlIlIIl) throws Exception {
        throw new UnsupportedOperationException();
    }
    
    @Override
    protected SocketAddress localAddress0() {
        try {
            final Iterator<SocketAddress> lllllllllllllIlIIIlIIIlllIIIlIlI = this.sch.getAllLocalAddresses().iterator();
            if (llIIIIIIIIIlIIl(lllllllllllllIlIIIlIIIlllIIIlIlI.hasNext() ? 1 : 0)) {
                return lllllllllllllIlIIIlIIIlllIIIlIlI.next();
            }
            "".length();
            if (((0x95 ^ 0xBB) & ~(0x7A ^ 0x54)) < -" ".length()) {
                return null;
            }
        }
        catch (IOException ex) {}
        return null;
    }
    
    @Override
    protected SocketAddress remoteAddress0() {
        return null;
    }
    
    private static boolean llIIIIIIIIIIlll(final Object lllllllllllllIlIIIlIIIlIllIllIlI) {
        return lllllllllllllIlIIIlIIIlIllIllIlI == null;
    }
    
    @Override
    protected int doReadMessages(final List<Object> lllllllllllllIlIIIlIIIllIlIllIIl) throws Exception {
        if (llIIIIIIIIIlIII(this.isActive() ? 1 : 0)) {
            return OioSctpServerChannel.lIIIlIIlllllIl[7];
        }
        SctpChannel lllllllllllllIlIIIlIIIllIlIllIII = null;
        int lllllllllllllIlIIIlIIIllIlIlIlll = OioSctpServerChannel.lIIIlIIlllllIl[0];
        try {
            final int lllllllllllllIlIIIlIIIllIlIlllIl = this.selector.select(1000L);
            if (llIIIIIIIIIlIll(lllllllllllllIlIIIlIIIllIlIlllIl)) {
                final Iterator<SelectionKey> lllllllllllllIlIIIlIIIllIlIllllI = this.selector.selectedKeys().iterator();
                do {
                    final SelectionKey lllllllllllllIlIIIlIIIllIlIlllll = lllllllllllllIlIIIlIIIllIlIllllI.next();
                    lllllllllllllIlIIIlIIIllIlIllllI.remove();
                    if (llIIIIIIIIIlIIl(lllllllllllllIlIIIlIIIllIlIlllll.isAcceptable() ? 1 : 0)) {
                        lllllllllllllIlIIIlIIIllIlIllIII = this.sch.accept();
                        if (llIIIIIIIIIlIlI(lllllllllllllIlIIIlIIIllIlIllIII)) {
                            lllllllllllllIlIIIlIIIllIlIllIIl.add(new OioSctpChannel(this, lllllllllllllIlIIIlIIIllIlIllIII));
                            "".length();
                            ++lllllllllllllIlIIIlIIIllIlIlIlll;
                        }
                    }
                    if (llIIIIIIIIIlIII(lllllllllllllIlIIIlIIIllIlIllllI.hasNext() ? 1 : 0)) {
                        return lllllllllllllIlIIIlIIIllIlIlIlll;
                    }
                    "".length();
                } while (((0x2A ^ 0x2E) & ~(0x94 ^ 0x90)) == 0x0);
                return (0xD6 ^ 0x82) & ~(0x35 ^ 0x61);
            }
            "".length();
            if ((0x48 ^ 0x58 ^ (0xAF ^ 0xBB)) != (56 + 75 - 51 + 61 ^ 61 + 125 - 134 + 85)) {
                return (0xDC ^ 0xC1 ^ (0x3A ^ 0x14)) & (71 + 40 - 102 + 181 ^ 30 + 54 - 50 + 107 ^ -" ".length());
            }
        }
        catch (Throwable lllllllllllllIlIIIlIIIllIlIllIll) {
            OioSctpServerChannel.logger.warn(OioSctpServerChannel.lIIIlIIlllllII[OioSctpServerChannel.lIIIlIIlllllIl[8]], lllllllllllllIlIIIlIIIllIlIllIll);
            if (llIIIIIIIIIlIlI(lllllllllllllIlIIIlIIIllIlIllIII)) {
                try {
                    lllllllllllllIlIIIlIIIllIlIllIII.close();
                    "".length();
                    if ((0x67 ^ 0x46 ^ (0x66 ^ 0x43)) == 0x0) {
                        return (0x36 ^ 0x19 ^ (0x26 ^ 0x3E)) & (45 + 93 - 117 + 106 ^ (0xEF ^ 0xA7) ^ -" ".length());
                    }
                    return lllllllllllllIlIIIlIIIllIlIlIlll;
                }
                catch (Throwable lllllllllllllIlIIIlIIIllIlIlllII) {
                    OioSctpServerChannel.logger.warn(OioSctpServerChannel.lIIIlIIlllllII[OioSctpServerChannel.lIIIlIIlllllIl[9]], lllllllllllllIlIIIlIIIllIlIlllII);
                }
            }
        }
        return lllllllllllllIlIIIlIIIllIlIlIlll;
    }
    
    @Override
    protected Object filterOutboundMessage(final Object lllllllllllllIlIIIlIIIllIIlIIIll) throws Exception {
        throw new UnsupportedOperationException();
    }
    
    private static void llIIIIIIIIIIllI() {
        (lIIIlIIlllllIl = new int[11])[0] = ((0x6 ^ 0x1 ^ (0x90 ^ 0xAD)) & (65 + 89 - 124 + 131 ^ 71 + 69 - 38 + 53 ^ -" ".length()));
        OioSctpServerChannel.lIIIlIIlllllIl[1] = " ".length();
        OioSctpServerChannel.lIIIlIIlllllIl[2] = (0x84 ^ 0x94);
        OioSctpServerChannel.lIIIlIIlllllIl[3] = "  ".length();
        OioSctpServerChannel.lIIIlIIlllllIl[4] = "   ".length();
        OioSctpServerChannel.lIIIlIIlllllIl[5] = (0x95 ^ 0x91);
        OioSctpServerChannel.lIIIlIIlllllIl[6] = (0x4D ^ 0x48);
        OioSctpServerChannel.lIIIlIIlllllIl[7] = -" ".length();
        OioSctpServerChannel.lIIIlIIlllllIl[8] = (0xCA ^ 0x95 ^ (0x4C ^ 0x15));
        OioSctpServerChannel.lIIIlIIlllllIl[9] = (34 + 71 - 43 + 78 ^ 24 + 35 - 31 + 111);
        OioSctpServerChannel.lIIIlIIlllllIl[10] = (0x6B ^ 0x63);
    }
    
    public OioSctpServerChannel() {
        this(newServerSocket());
    }
    
    private static boolean llIIIIIIIIIlIlI(final Object lllllllllllllIlIIIlIIIlIllIlllII) {
        return lllllllllllllIlIIIlIIIlIllIlllII != null;
    }
    
    @Override
    public SctpServerChannelConfig config() {
        return this.config;
    }
    
    private static boolean llIIIIIIIIIlIII(final int lllllllllllllIlIIIlIIIlIllIlIllI) {
        return lllllllllllllIlIIIlIIIlIllIlIllI == 0;
    }
    
    @Override
    public ChannelFuture unbindAddress(final InetAddress lllllllllllllIlIIIlIIIllIIlllIlI) {
        return this.unbindAddress(lllllllllllllIlIIIlIIIllIIlllIlI, this.newPromise());
    }
    
    @Override
    public boolean isOpen() {
        return this.sch.isOpen();
    }
    
    private static String llIIIIIIIIIIIll(String lllllllllllllIlIIIlIIIlIllllIlll, final String lllllllllllllIlIIIlIIIlIlllllIll) {
        lllllllllllllIlIIIlIIIlIllllIlll = new String(Base64.getDecoder().decode(lllllllllllllIlIIIlIIIlIllllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIlIIIlIlllllIlI = new StringBuilder();
        final char[] lllllllllllllIlIIIlIIIlIlllllIIl = lllllllllllllIlIIIlIIIlIlllllIll.toCharArray();
        int lllllllllllllIlIIIlIIIlIlllllIII = OioSctpServerChannel.lIIIlIIlllllIl[0];
        final int lllllllllllllIlIIIlIIIlIllllIIlI = (Object)lllllllllllllIlIIIlIIIlIllllIlll.toCharArray();
        final byte lllllllllllllIlIIIlIIIlIllllIIIl = (byte)lllllllllllllIlIIIlIIIlIllllIIlI.length;
        boolean lllllllllllllIlIIIlIIIlIllllIIII = OioSctpServerChannel.lIIIlIIlllllIl[0] != 0;
        while (llIIIIIIIIIllII(lllllllllllllIlIIIlIIIlIllllIIII ? 1 : 0, lllllllllllllIlIIIlIIIlIllllIIIl)) {
            final char lllllllllllllIlIIIlIIIlIllllllIl = lllllllllllllIlIIIlIIIlIllllIIlI[lllllllllllllIlIIIlIIIlIllllIIII];
            lllllllllllllIlIIIlIIIlIlllllIlI.append((char)(lllllllllllllIlIIIlIIIlIllllllIl ^ lllllllllllllIlIIIlIIIlIlllllIIl[lllllllllllllIlIIIlIIIlIlllllIII % lllllllllllllIlIIIlIIIlIlllllIIl.length]));
            "".length();
            ++lllllllllllllIlIIIlIIIlIlllllIII;
            ++lllllllllllllIlIIIlIIIlIllllIIII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIlIIIlIlllllIlI);
    }
    
    private static String llIIIIIIIIIIIlI(final String lllllllllllllIlIIIlIIIlIlllIIlll, final String lllllllllllllIlIIIlIIIlIlllIIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlIIIlIlllIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlIIIlIlllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIlIIIlIlllIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIlIIIlIlllIlIIl.init(OioSctpServerChannel.lIIIlIIlllllIl[3], lllllllllllllIlIIIlIIIlIlllIlIlI);
            return new String(lllllllllllllIlIIIlIIIlIlllIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlIIIlIlllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlIIIlIlllIlIII) {
            lllllllllllllIlIIIlIIIlIlllIlIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ChannelFuture bindAddress(final InetAddress lllllllllllllIlIIIlIIIllIlIIllII) {
        return this.bindAddress(lllllllllllllIlIIIlIIIllIlIIllII, this.newPromise());
    }
    
    private static String llIIIIIIIIIIlII(final String lllllllllllllIlIIIlIIIllIIIIlIlI, final String lllllllllllllIlIIIlIIIllIIIIlIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlIIIllIIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlIIIllIIIIlIll.getBytes(StandardCharsets.UTF_8)), OioSctpServerChannel.lIIIlIIlllllIl[10]), "DES");
            final Cipher lllllllllllllIlIIIlIIIllIIIIlllI = Cipher.getInstance("DES");
            lllllllllllllIlIIIlIIIllIIIIlllI.init(OioSctpServerChannel.lIIIlIIlllllIl[3], lllllllllllllIlIIIlIIIllIIIIllll);
            return new String(lllllllllllllIlIIIlIIIllIIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlIIIllIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlIIIllIIIIllIl) {
            lllllllllllllIlIIIlIIIllIIIIllIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public InetSocketAddress remoteAddress() {
        return null;
    }
    
    private final class OioSctpServerChannelConfig extends DefaultSctpServerChannelConfig
    {
        private static final /* synthetic */ int[] lIIIIllIIlIIIl;
        
        private static void lIlllIllIIIllll() {
            (lIIIIllIIlIIIl = new int[1])[0] = ((0x32 ^ 0x10) & ~(0x82 ^ 0xA0));
        }
        
        static {
            lIlllIllIIIllll();
        }
        
        private OioSctpServerChannelConfig(final OioSctpServerChannel lllllllllllllIlIIlIIllllIIIIIlII, final com.sun.nio.sctp.SctpServerChannel lllllllllllllIlIIlIIllllIIIIIlll) {
            super(lllllllllllllIlIIlIIllllIIIIIlII, lllllllllllllIlIIlIIllllIIIIIlll);
        }
        
        @Override
        protected void autoReadCleared() {
            AbstractOioChannel.this.setReadPending((boolean)(OioSctpServerChannelConfig.lIIIIllIIlIIIl[0] != 0));
        }
    }
}
