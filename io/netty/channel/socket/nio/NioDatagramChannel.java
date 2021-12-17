// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.socket.nio;

import io.netty.channel.DefaultAddressedEnvelope;
import io.netty.util.ReferenceCounted;
import java.nio.channels.SelectableChannel;
import io.netty.channel.Channel;
import java.util.Arrays;
import io.netty.channel.socket.InternetProtocolFamily;
import java.nio.ByteBuffer;
import io.netty.channel.ChannelOutboundBuffer;
import java.io.IOException;
import io.netty.channel.ChannelException;
import java.net.InetSocketAddress;
import io.netty.channel.AddressedEnvelope;
import io.netty.util.internal.StringUtil;
import io.netty.channel.socket.DatagramPacket;
import io.netty.util.internal.PlatformDependent;
import java.util.Iterator;
import io.netty.channel.ChannelOption;
import io.netty.buffer.ByteBuf;
import java.net.SocketException;
import io.netty.channel.ChannelConfig;
import java.util.ArrayList;
import java.util.HashMap;
import io.netty.channel.ChannelPromise;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.ChannelFuture;
import java.net.NetworkInterface;
import java.net.SocketAddress;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.channel.ChannelMetadata;
import io.netty.channel.socket.DatagramChannelConfig;
import java.nio.channels.MembershipKey;
import java.util.List;
import java.net.InetAddress;
import java.util.Map;
import java.nio.channels.spi.SelectorProvider;
import io.netty.channel.socket.DatagramChannel;
import io.netty.channel.nio.AbstractNioMessageChannel;

public final class NioDatagramChannel extends AbstractNioMessageChannel implements DatagramChannel
{
    private static final /* synthetic */ SelectorProvider DEFAULT_SELECTOR_PROVIDER;
    private static final /* synthetic */ int[] llIlIIIlIIIIIl;
    private static final /* synthetic */ String[] llIlIIIIllllIl;
    private /* synthetic */ Map<InetAddress, List<MembershipKey>> memberships;
    private final /* synthetic */ DatagramChannelConfig config;
    private static final /* synthetic */ ChannelMetadata METADATA;
    private static final /* synthetic */ String EXPECTED_TYPES;
    private /* synthetic */ RecvByteBufAllocator.Handle allocHandle;
    
    private static void lIIlIIIllIIIlIIl() {
        (llIlIIIIllllIl = new String[NioDatagramChannel.llIlIIIlIIIIIl[18]])[NioDatagramChannel.llIlIIIlIIIIIl[0]] = lIIlIIIllIIIIIlI("UEz1xOTKL2IsWbsSKg/0oRJRLp0z4BxWoBD6EtnIWO4=", "frGxV");
        NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[1]] = lIIlIIIllIIIIlII("i/QvQ2TJe7BZVTR1O8vokiRamSCVc4/u6kRXU2clDEM=", "acgWg");
        NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[3]] = lIIlIIIllIIIIlII("rGpJMLDR3S7jYTEpB6dbTPOzbR94k2fpDDI0YBzp8+w=", "tGUef");
        NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[5]] = lIIlIIIllIIIIIlI("jfgDiNnKiyfzzeGubp6GIgWrdmnaRMfxLuCR7yWepRo=", "mNsXe");
        NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[6]] = lIIlIIIllIIIIlIl("JzEDGhkpJRwaMS4gHQsDOQ==", "JDonp");
        NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[7]] = lIIlIIIllIIIIlII("52l61HXCYLE47Mwov9TUXHZ0nXAznTKg", "DeDsM");
        NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[8]] = lIIlIIIllIIIIIlI("jDz6lqfKQW8geTjytGpfukPqOJfBkA2Z", "RLoPA");
        NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[2]] = lIIlIIIllIIIIIlI("mFGOfDSQzBuUz44VRTI6/rVMkdRRPEmC", "pQGDI");
        NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[9]] = lIIlIIIllIIIIlIl("JTQKFyQrIBUXDCwlFAY+Ow==", "HAfcM");
        NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[10]] = lIIlIIIllIIIIlII("J7H5JtwarJ6ArB5Aq3qt0g==", "ukglv");
        NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[11]] = lIIlIIIllIIIIlIl("ICIeGB48LCMBBSs1DA4SKw==", "NGjoq");
        NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[12]] = lIIlIIIllIIIIlIl("VWkNOwYQIhwmEk9h", "uAhCv");
        NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[13]] = lIIlIIIllIIIIIlI("Qjpnl2Hoa9M=", "oLxMG");
        NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[15]] = lIIlIIIllIIIIlIl("Tmk=", "bIqLI");
        NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[16]] = lIIlIIIllIIIIlII("7Q7ryyGqR9A=", "lDZNa");
    }
    
    @Override
    protected boolean doConnect(final SocketAddress llllllllllllIllIllIlIlIlIllIlIIl, final SocketAddress llllllllllllIllIllIlIlIlIllIllII) throws Exception {
        if (lIIlIIIllIIlIIlI(llllllllllllIllIllIlIlIlIllIllII)) {
            this.javaChannel().socket().bind(llllllllllllIllIllIlIlIlIllIllII);
        }
        boolean llllllllllllIllIllIlIlIlIllIlIll = NioDatagramChannel.llIlIIIlIIIIIl[0] != 0;
        try {
            this.javaChannel().connect(llllllllllllIllIllIlIlIlIllIlIIl);
            "".length();
            llllllllllllIllIllIlIlIlIllIlIll = (NioDatagramChannel.llIlIIIlIIIIIl[1] != 0);
            final long llllllllllllIllIllIlIlIlIllIIllI = NioDatagramChannel.llIlIIIlIIIIIl[1];
            return llllllllllllIllIllIlIlIlIllIIllI != 0L;
        }
        finally {
            if (lIIlIIIllIIlIIIl(llllllllllllIllIllIlIlIlIllIlIll ? 1 : 0)) {
                this.doClose();
            }
        }
    }
    
    @Override
    public ChannelFuture block(final InetAddress llllllllllllIllIllIlIlIIIllIIIlI, final NetworkInterface llllllllllllIllIllIlIlIIIlIlllIl, final InetAddress llllllllllllIllIllIlIlIIIlIlllII) {
        return this.block(llllllllllllIllIllIlIlIIIllIIIlI, llllllllllllIllIllIlIlIIIlIlllIl, llllllllllllIllIllIlIlIIIlIlllII, this.newPromise());
    }
    
    private static String lIIlIIIllIIIIlII(final String llllllllllllIllIllIlIIlllllIIlII, final String llllllllllllIllIllIlIIlllllIIIll) {
        try {
            final SecretKeySpec llllllllllllIllIllIlIIlllllIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIlIIlllllIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllIlIIlllllIlIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIllIlIIlllllIlIII.init(NioDatagramChannel.llIlIIIlIIIIIl[3], llllllllllllIllIllIlIIlllllIlIIl);
            return new String(llllllllllllIllIllIlIIlllllIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIlIIlllllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIlIIlllllIIlll) {
            llllllllllllIllIllIlIIlllllIIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIIIllIIlIIIl(final int llllllllllllIllIllIlIIllllIlIIIl) {
        return llllllllllllIllIllIlIIllllIlIIIl == 0;
    }
    
    @Override
    public ChannelFuture joinGroup(final InetAddress llllllllllllIllIllIlIlIIllIIIIll, final NetworkInterface llllllllllllIllIllIlIlIIlIllllIl, final InetAddress llllllllllllIllIllIlIlIIlIllllII, final ChannelPromise llllllllllllIllIllIlIlIIllIIIIII) {
        checkJavaVersion();
        if (lIIlIIIllIIIlllI(llllllllllllIllIllIlIlIIllIIIIll)) {
            throw new NullPointerException(NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[6]]);
        }
        if (lIIlIIIllIIIlllI(llllllllllllIllIllIlIlIIlIllllIl)) {
            throw new NullPointerException(NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[7]]);
        }
        try {
            MembershipKey llllllllllllIllIllIlIlIIllIIIllI;
            if (lIIlIIIllIIIlllI(llllllllllllIllIllIlIlIIlIllllII)) {
                final MembershipKey llllllllllllIllIllIlIlIIllIIlIII = this.javaChannel().join(llllllllllllIllIllIlIlIIllIIIIll, llllllllllllIllIllIlIlIIlIllllIl);
                "".length();
                if (-" ".length() >= "   ".length()) {
                    return null;
                }
            }
            else {
                llllllllllllIllIllIlIlIIllIIIllI = this.javaChannel().join(llllllllllllIllIllIlIlIIllIIIIll, llllllllllllIllIllIlIlIIlIllllIl, llllllllllllIllIllIlIlIIlIllllII);
            }
            final float llllllllllllIllIllIlIlIIlIlllIIl = (float)this;
            synchronized (this) {
                List<MembershipKey> llllllllllllIllIllIlIlIIllIIIlll = null;
                if (lIIlIIIllIIIlllI(this.memberships)) {
                    this.memberships = new HashMap<InetAddress, List<MembershipKey>>();
                    "".length();
                    if ((0xA5 ^ 0xA1) < -" ".length()) {
                        return null;
                    }
                }
                else {
                    llllllllllllIllIllIlIlIIllIIIlll = this.memberships.get(llllllllllllIllIllIlIlIIllIIIIll);
                }
                if (lIIlIIIllIIIlllI(llllllllllllIllIllIlIlIIllIIIlll)) {
                    llllllllllllIllIllIlIlIIllIIIlll = new ArrayList<MembershipKey>();
                    this.memberships.put(llllllllllllIllIllIlIlIIllIIIIll, llllllllllllIllIllIlIlIIllIIIlll);
                    "".length();
                }
                llllllllllllIllIllIlIlIIllIIIlll.add(llllllllllllIllIllIlIlIIllIIIllI);
                "".length();
                // monitorexit(this)
                "".length();
                if (((" ".length() ^ (0xD8 ^ 0x9F)) & (44 + 103 - 125 + 107 ^ 46 + 110 - 103 + 146 ^ -" ".length())) < -" ".length()) {
                    return null;
                }
            }
            llllllllllllIllIllIlIlIIllIIIIII.setSuccess();
            "".length();
            "".length();
            if ("   ".length() == "  ".length()) {
                return null;
            }
        }
        catch (Throwable llllllllllllIllIllIlIlIIllIIIlIl) {
            llllllllllllIllIllIlIlIIllIIIIII.setFailure(llllllllllllIllIllIlIlIIllIIIlIl);
            "".length();
        }
        return llllllllllllIllIllIlIlIIllIIIIII;
    }
    
    @Override
    public ChannelFuture block(final InetAddress llllllllllllIllIllIlIlIIIIlIlIII, final InetAddress llllllllllllIllIllIlIlIIIIlIlIll, final ChannelPromise llllllllllllIllIllIlIlIIIIlIlIlI) {
        try {
            return this.block(llllllllllllIllIllIlIlIIIIlIlIII, NetworkInterface.getByInetAddress(this.localAddress().getAddress()), llllllllllllIllIllIlIlIIIIlIlIll, llllllllllllIllIllIlIlIIIIlIlIlI);
        }
        catch (SocketException llllllllllllIllIllIlIlIIIIlIlllI) {
            llllllllllllIllIllIlIlIIIIlIlIlI.setFailure((Throwable)llllllllllllIllIllIlIlIIIIlIlllI);
            "".length();
            return llllllllllllIllIllIlIlIIIIlIlIlI;
        }
    }
    
    private static boolean isSingleDirectBuffer(final ByteBuf llllllllllllIllIllIlIlIlIIIIllIl) {
        int n;
        if (lIIlIIIllIIlIIII(llllllllllllIllIllIlIlIlIIIIllIl.isDirect() ? 1 : 0) && lIIlIIIllIIlIlII(llllllllllllIllIllIlIlIlIIIIllIl.nioBufferCount(), NioDatagramChannel.llIlIIIlIIIIIl[1])) {
            n = NioDatagramChannel.llIlIIIlIIIIIl[1];
            "".length();
            if (((0x7 ^ 0x4F) & ~(0xC3 ^ 0x8B)) != 0x0) {
                return ((0x2E ^ 0x10) & ~(0x7 ^ 0x39)) != 0x0;
            }
        }
        else {
            n = NioDatagramChannel.llIlIIIlIIIIIl[0];
        }
        return n != 0;
    }
    
    @Override
    public ChannelFuture joinGroup(final InetAddress llllllllllllIllIllIlIlIIllIllIII, final NetworkInterface llllllllllllIllIllIlIlIIllIlIIll, final InetAddress llllllllllllIllIllIlIlIIllIlIIlI) {
        return this.joinGroup(llllllllllllIllIllIlIlIIllIllIII, llllllllllllIllIllIlIlIIllIlIIll, llllllllllllIllIllIlIlIIllIlIIlI, this.newPromise());
    }
    
    @Override
    public boolean isActive() {
        final java.nio.channels.DatagramChannel llllllllllllIllIllIlIlIllIIIlIIl = this.javaChannel();
        int n;
        if (lIIlIIIllIIlIIII(llllllllllllIllIllIlIlIllIIIlIIl.isOpen() ? 1 : 0) && ((lIIlIIIllIIlIIII(((boolean)this.config.getOption(ChannelOption.DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION)) ? 1 : 0) && !lIIlIIIllIIlIIIl(this.isRegistered() ? 1 : 0)) || lIIlIIIllIIlIIII(llllllllllllIllIllIlIlIllIIIlIIl.socket().isBound() ? 1 : 0))) {
            n = NioDatagramChannel.llIlIIIlIIIIIl[1];
            "".length();
            if ("   ".length() < "   ".length()) {
                return ((0xC2 ^ 0x93) & ~(0x97 ^ 0xC6)) != 0x0;
            }
        }
        else {
            n = NioDatagramChannel.llIlIIIlIIIIIl[0];
        }
        return n != 0;
    }
    
    @Override
    public ChannelFuture leaveGroup(final InetAddress llllllllllllIllIllIlIlIIIlllIlIl, final NetworkInterface llllllllllllIllIllIlIlIIIlllIlII, final InetAddress llllllllllllIllIllIlIlIIIlllIIll, final ChannelPromise llllllllllllIllIllIlIlIIIlllIIlI) {
        checkJavaVersion();
        if (lIIlIIIllIIIlllI(llllllllllllIllIllIlIlIIIlllIlIl)) {
            throw new NullPointerException(NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[8]]);
        }
        if (lIIlIIIllIIIlllI(llllllllllllIllIllIlIlIIIlllIlII)) {
            throw new NullPointerException(NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[2]]);
        }
        final byte llllllllllllIllIllIlIlIIIllIllII = (byte)this;
        synchronized (this) {
            if (lIIlIIIllIIlIIlI(this.memberships)) {
                final List<MembershipKey> llllllllllllIllIllIlIlIIIlllIlll = this.memberships.get(llllllllllllIllIllIlIlIIIlllIlIl);
                if (lIIlIIIllIIlIIlI(llllllllllllIllIllIlIlIIIlllIlll)) {
                    final Iterator<MembershipKey> llllllllllllIllIllIlIlIIIllllIII = llllllllllllIllIllIlIlIIIlllIlll.iterator();
                    while (lIIlIIIllIIlIIII(llllllllllllIllIllIlIlIIIllllIII.hasNext() ? 1 : 0)) {
                        final MembershipKey llllllllllllIllIllIlIlIIIllllIIl = llllllllllllIllIllIlIlIIIllllIII.next();
                        if (lIIlIIIllIIlIIII(llllllllllllIllIllIlIlIIIlllIlII.equals(llllllllllllIllIllIlIlIIIllllIIl.networkInterface()) ? 1 : 0) && ((lIIlIIIllIIIlllI(llllllllllllIllIllIlIlIIIlllIIll) && !lIIlIIIllIIlIIlI(llllllllllllIllIllIlIlIIIllllIIl.sourceAddress())) || (lIIlIIIllIIlIIlI(llllllllllllIllIllIlIlIIIlllIIll) && lIIlIIIllIIlIIII(llllllllllllIllIllIlIlIIIlllIIll.equals(llllllllllllIllIllIlIlIIIllllIIl.sourceAddress()) ? 1 : 0)))) {
                            llllllllllllIllIllIlIlIIIllllIIl.drop();
                            llllllllllllIllIllIlIlIIIllllIII.remove();
                        }
                        "".length();
                        if ((0x93 ^ 0xA6 ^ (0xA9 ^ 0x98)) < (46 + 67 - 3 + 56 ^ 83 + 0 + 18 + 61)) {
                            return null;
                        }
                    }
                    if (lIIlIIIllIIlIIII(llllllllllllIllIllIlIlIIIlllIlll.isEmpty() ? 1 : 0)) {
                        this.memberships.remove(llllllllllllIllIllIlIlIIIlllIlIl);
                        "".length();
                    }
                }
            }
            // monitorexit(this)
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        llllllllllllIllIllIlIlIIIlllIIlI.setSuccess();
        "".length();
        return llllllllllllIllIllIlIlIIIlllIIlI;
    }
    
    private static void checkJavaVersion() {
        if (lIIlIIIllIIIllll(PlatformDependent.javaVersion(), NioDatagramChannel.llIlIIIlIIIIIl[2])) {
            throw new UnsupportedOperationException(NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[3]]);
        }
    }
    
    static {
        lIIlIIIllIIIllIl();
        lIIlIIIllIIIlIIl();
        METADATA = new ChannelMetadata((boolean)(NioDatagramChannel.llIlIIIlIIIIIl[1] != 0));
        DEFAULT_SELECTOR_PROVIDER = SelectorProvider.provider();
        EXPECTED_TYPES = String.valueOf(new StringBuilder().append(NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[12]]).append(StringUtil.simpleClassName(DatagramPacket.class)).append(NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[13]]).append(StringUtil.simpleClassName(AddressedEnvelope.class)).append((char)NioDatagramChannel.llIlIIIlIIIIIl[14]).append(StringUtil.simpleClassName(ByteBuf.class)).append(NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[15]]).append(StringUtil.simpleClassName(SocketAddress.class)).append(NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[16]]).append(StringUtil.simpleClassName(ByteBuf.class)).append((char)NioDatagramChannel.llIlIIIlIIIIIl[17]));
    }
    
    @Override
    protected SocketAddress localAddress0() {
        return this.javaChannel().socket().getLocalSocketAddress();
    }
    
    @Override
    public InetSocketAddress remoteAddress() {
        return (InetSocketAddress)super.remoteAddress();
    }
    
    @Override
    protected boolean continueOnWriteError() {
        return NioDatagramChannel.llIlIIIlIIIIIl[1] != 0;
    }
    
    private static boolean lIIlIIIllIIIlllI(final Object llllllllllllIllIllIlIIllllIlIlIl) {
        return llllllllllllIllIllIlIIllllIlIlIl == null;
    }
    
    @Override
    public ChannelFuture leaveGroup(final InetSocketAddress llllllllllllIllIllIlIlIIlIIlIllI, final NetworkInterface llllllllllllIllIllIlIlIIlIIlIlIl, final ChannelPromise llllllllllllIllIllIlIlIIlIIlIIII) {
        return this.leaveGroup(llllllllllllIllIllIlIlIIlIIlIllI.getAddress(), llllllllllllIllIllIlIlIIlIIlIlIl, null, llllllllllllIllIllIlIlIIlIIlIIII);
    }
    
    public NioDatagramChannel(final SelectorProvider llllllllllllIllIllIlIlIllIlIlIII) {
        this(newSocket(llllllllllllIllIllIlIlIllIlIlIII));
    }
    
    private static boolean lIIlIIIllIIlIIlI(final Object llllllllllllIllIllIlIIllllIlIlll) {
        return llllllllllllIllIllIlIIllllIlIlll != null;
    }
    
    private static java.nio.channels.DatagramChannel newSocket(final SelectorProvider llllllllllllIllIllIlIlIllIlllIlI) {
        try {
            return llllllllllllIllIllIlIlIllIlllIlI.openDatagramChannel();
        }
        catch (IOException llllllllllllIllIllIlIlIllIlllIll) {
            throw new ChannelException(NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[0]], llllllllllllIllIllIlIlIllIlllIll);
        }
    }
    
    @Override
    public ChannelFuture block(final InetAddress llllllllllllIllIllIlIlIIIIllIlIl, final InetAddress llllllllllllIllIllIlIlIIIIllIlll) {
        return this.block(llllllllllllIllIllIlIlIIIIllIlIl, llllllllllllIllIllIlIlIIIIllIlll, this.newPromise());
    }
    
    @Override
    protected void setReadPending(final boolean llllllllllllIllIllIlIlIIIIIlllll) {
        super.setReadPending(llllllllllllIllIllIlIlIIIIIlllll);
    }
    
    @Override
    public boolean isConnected() {
        return this.javaChannel().isConnected();
    }
    
    @Override
    protected boolean doWriteMessage(final Object llllllllllllIllIllIlIlIlIIlIlIll, final ChannelOutboundBuffer llllllllllllIllIllIlIlIlIIlIlIlI) throws Exception {
        ByteBuf llllllllllllIllIllIlIlIlIIlIlIII = null;
        SocketAddress llllllllllllIllIllIlIlIlIIlIlIIl;
        if (lIIlIIIllIIlIIII((llllllllllllIllIllIlIlIlIIlIlIll instanceof AddressedEnvelope) ? 1 : 0)) {
            final AddressedEnvelope<ByteBuf, SocketAddress> llllllllllllIllIllIlIlIlIIllIIII = (AddressedEnvelope<ByteBuf, SocketAddress>)llllllllllllIllIllIlIlIlIIlIlIll;
            final SocketAddress llllllllllllIllIllIlIlIlIIlIllll = llllllllllllIllIllIlIlIlIIllIIII.recipient();
            final ByteBuf llllllllllllIllIllIlIlIlIIlIlllI = llllllllllllIllIllIlIlIlIIllIIII.content();
            "".length();
            if (" ".length() > "   ".length()) {
                return ((0x8F ^ 0xBA) & ~(0x98 ^ 0xAD)) != 0x0;
            }
        }
        else {
            llllllllllllIllIllIlIlIlIIlIlIII = (ByteBuf)llllllllllllIllIllIlIlIlIIlIlIll;
            llllllllllllIllIllIlIlIlIIlIlIIl = null;
        }
        final int llllllllllllIllIllIlIlIlIIlIIlll = llllllllllllIllIllIlIlIlIIlIlIII.readableBytes();
        if (lIIlIIIllIIlIIIl(llllllllllllIllIllIlIlIlIIlIIlll)) {
            return NioDatagramChannel.llIlIIIlIIIIIl[1] != 0;
        }
        final ByteBuffer llllllllllllIllIllIlIlIlIIlIIllI = llllllllllllIllIllIlIlIlIIlIlIII.internalNioBuffer(llllllllllllIllIllIlIlIlIIlIlIII.readerIndex(), llllllllllllIllIllIlIlIlIIlIIlll);
        int llllllllllllIllIllIlIlIlIIlIIlIl = 0;
        if (lIIlIIIllIIlIIlI(llllllllllllIllIllIlIlIlIIlIlIIl)) {
            final int llllllllllllIllIllIlIlIlIIlIllIl = this.javaChannel().send(llllllllllllIllIllIlIlIlIIlIIllI, llllllllllllIllIllIlIlIlIIlIlIIl);
            "".length();
            if (" ".length() > "  ".length()) {
                return ((0x6B ^ 0x7 ^ (0x66 ^ 0x33)) & (3 + 171 - 140 + 140 ^ 100 + 69 - 126 + 108 ^ -" ".length())) != 0x0;
            }
        }
        else {
            llllllllllllIllIllIlIlIlIIlIIlIl = this.javaChannel().write(llllllllllllIllIllIlIlIlIIlIIllI);
        }
        int n;
        if (lIIlIIIllIIlIIll(llllllllllllIllIllIlIlIlIIlIIlIl)) {
            n = NioDatagramChannel.llIlIIIlIIIIIl[1];
            "".length();
            if (-(0x30 ^ 0x35) >= 0) {
                return ((0x8F ^ 0xAE) & ~(0x97 ^ 0xB6)) != 0x0;
            }
        }
        else {
            n = NioDatagramChannel.llIlIIIlIIIIIl[0];
        }
        return n != 0;
    }
    
    @Override
    public ChannelFuture leaveGroup(final InetAddress llllllllllllIllIllIlIlIIlIIIIllI, final NetworkInterface llllllllllllIllIllIlIlIIlIIIIlIl, final InetAddress llllllllllllIllIllIlIlIIlIIIIlII) {
        return this.leaveGroup(llllllllllllIllIllIlIlIIlIIIIllI, llllllllllllIllIllIlIlIIlIIIIlIl, llllllllllllIllIllIlIlIIlIIIIlII, this.newPromise());
    }
    
    @Override
    public ChannelFuture leaveGroup(final InetSocketAddress llllllllllllIllIllIlIlIIlIlIIIII, final NetworkInterface llllllllllllIllIllIlIlIIlIIlllll) {
        return this.leaveGroup(llllllllllllIllIllIlIlIIlIlIIIII, llllllllllllIllIllIlIlIIlIIlllll, this.newPromise());
    }
    
    @Override
    public ChannelFuture joinGroup(final InetAddress llllllllllllIllIllIlIlIIllllIlIl, final ChannelPromise llllllllllllIllIllIlIlIIllllIlll) {
        try {
            return this.joinGroup(llllllllllllIllIllIlIlIIllllIlIl, NetworkInterface.getByInetAddress(this.localAddress().getAddress()), null, llllllllllllIllIllIlIlIIllllIlll);
        }
        catch (SocketException llllllllllllIllIllIlIlIIlllllIlI) {
            llllllllllllIllIllIlIlIIllllIlll.setFailure((Throwable)llllllllllllIllIllIlIlIIlllllIlI);
            "".length();
            return llllllllllllIllIllIlIlIIllllIlll;
        }
    }
    
    @Override
    public DatagramChannelConfig config() {
        return this.config;
    }
    
    private static java.nio.channels.DatagramChannel newSocket(final SelectorProvider llllllllllllIllIllIlIlIllIllIIIl, final InternetProtocolFamily llllllllllllIllIllIlIlIllIllIIII) {
        if (lIIlIIIllIIIlllI(llllllllllllIllIllIlIlIllIllIIII)) {
            return newSocket(llllllllllllIllIllIlIlIllIllIIIl);
        }
        checkJavaVersion();
        try {
            return llllllllllllIllIllIlIlIllIllIIIl.openDatagramChannel(ProtocolFamilyConverter.convert(llllllllllllIllIllIlIlIllIllIIII));
        }
        catch (IOException llllllllllllIllIllIlIlIllIllIlII) {
            throw new ChannelException(NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[1]], llllllllllllIllIllIlIlIllIllIlII);
        }
    }
    
    @Override
    protected SocketAddress remoteAddress0() {
        return this.javaChannel().socket().getRemoteSocketAddress();
    }
    
    @Override
    protected void doDisconnect() throws Exception {
        this.javaChannel().disconnect();
        "".length();
    }
    
    public NioDatagramChannel() {
        this(newSocket(NioDatagramChannel.DEFAULT_SELECTOR_PROVIDER));
    }
    
    public NioDatagramChannel(final SelectorProvider llllllllllllIllIllIlIlIllIIllIll, final InternetProtocolFamily llllllllllllIllIllIlIlIllIIllIlI) {
        this(newSocket(llllllllllllIllIllIlIlIllIIllIll, llllllllllllIllIllIlIlIllIIllIlI));
    }
    
    @Override
    protected int doReadMessages(final List<Object> llllllllllllIllIllIlIlIlIlIIIIll) throws Exception {
        final java.nio.channels.DatagramChannel llllllllllllIllIllIlIlIlIlIIlIIl = this.javaChannel();
        final DatagramChannelConfig llllllllllllIllIllIlIlIlIlIIlIII = this.config();
        RecvByteBufAllocator.Handle llllllllllllIllIllIlIlIlIlIIIlll = this.allocHandle;
        if (lIIlIIIllIIIlllI(llllllllllllIllIllIlIlIlIlIIIlll)) {
            llllllllllllIllIllIlIlIlIlIIIlll = (this.allocHandle = llllllllllllIllIllIlIlIlIlIIlIII.getRecvByteBufAllocator().newHandle());
        }
        final ByteBuf llllllllllllIllIllIlIlIlIlIIIllI = llllllllllllIllIllIlIlIlIlIIIlll.allocate(llllllllllllIllIllIlIlIlIlIIlIII.getAllocator());
        boolean llllllllllllIllIllIlIlIlIlIIIlIl = NioDatagramChannel.llIlIIIlIIIIIl[1] != 0;
        try {
            final ByteBuffer llllllllllllIllIllIlIlIlIlIlIIII = llllllllllllIllIllIlIlIlIlIIIllI.internalNioBuffer(llllllllllllIllIllIlIlIlIlIIIllI.writerIndex(), llllllllllllIllIllIlIlIlIlIIIllI.writableBytes());
            final int llllllllllllIllIllIlIlIlIlIIllll = llllllllllllIllIllIlIlIlIlIlIIII.position();
            final InetSocketAddress llllllllllllIllIllIlIlIlIlIIlllI = (InetSocketAddress)llllllllllllIllIllIlIlIlIlIIlIIl.receive(llllllllllllIllIllIlIlIlIlIlIIII);
            if (lIIlIIIllIIIlllI(llllllllllllIllIllIlIlIlIlIIlllI)) {
                final char llllllllllllIllIllIlIlIlIIlllIlI = (char)NioDatagramChannel.llIlIIIlIIIIIl[0];
                return llllllllllllIllIllIlIlIlIIlllIlI;
            }
            final int llllllllllllIllIllIlIlIlIlIIllIl = llllllllllllIllIllIlIlIlIlIlIIII.position() - llllllllllllIllIllIlIlIlIlIIllll;
            llllllllllllIllIllIlIlIlIlIIIllI.writerIndex(llllllllllllIllIllIlIlIlIlIIIllI.writerIndex() + llllllllllllIllIllIlIlIlIlIIllIl);
            "".length();
            llllllllllllIllIllIlIlIlIlIIIlll.record(llllllllllllIllIllIlIlIlIlIIllIl);
            llllllllllllIllIllIlIlIlIlIIIIll.add(new DatagramPacket(llllllllllllIllIllIlIlIlIlIIIllI, this.localAddress(), llllllllllllIllIllIlIlIlIlIIlllI));
            "".length();
            llllllllllllIllIllIlIlIlIlIIIlIl = (NioDatagramChannel.llIlIIIlIIIIIl[0] != 0);
            final String llllllllllllIllIllIlIlIlIIlllIIl = (String)NioDatagramChannel.llIlIIIlIIIIIl[1];
            return (int)llllllllllllIllIllIlIlIlIIlllIIl;
        }
        catch (Throwable llllllllllllIllIllIlIlIlIlIIllII) {
            PlatformDependent.throwException(llllllllllllIllIllIlIlIlIlIIllII);
            final short llllllllllllIllIllIlIlIlIIllllII = (short)NioDatagramChannel.llIlIIIlIIIIIl[4];
            return llllllllllllIllIllIlIlIlIIllllII;
        }
        finally {
            if (lIIlIIIllIIlIIII(llllllllllllIllIllIlIlIlIlIIIlIl ? 1 : 0)) {
                llllllllllllIllIllIlIlIlIlIIIllI.release();
                "".length();
            }
        }
    }
    
    private static boolean lIIlIIIllIIlIIII(final int llllllllllllIllIllIlIIllllIlIIll) {
        return llllllllllllIllIllIlIIllllIlIIll != 0;
    }
    
    private static String lIIlIIIllIIIIIlI(final String llllllllllllIllIllIlIlIIIIIIlIll, final String llllllllllllIllIllIlIlIIIIIIlIlI) {
        try {
            final SecretKeySpec llllllllllllIllIllIlIlIIIIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIlIlIIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), NioDatagramChannel.llIlIIIlIIIIIl[9]), "DES");
            final Cipher llllllllllllIllIllIlIlIIIIIIllIl = Cipher.getInstance("DES");
            llllllllllllIllIllIlIlIIIIIIllIl.init(NioDatagramChannel.llIlIIIlIIIIIl[3], llllllllllllIllIllIlIlIIIIIIlllI);
            return new String(llllllllllllIllIllIlIlIIIIIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIlIlIIIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIlIlIIIIIIllII) {
            llllllllllllIllIllIlIlIIIIIIllII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public InetSocketAddress localAddress() {
        return (InetSocketAddress)super.localAddress();
    }
    
    public NioDatagramChannel(final InternetProtocolFamily llllllllllllIllIllIlIlIllIlIIIlI) {
        this(newSocket(NioDatagramChannel.DEFAULT_SELECTOR_PROVIDER, llllllllllllIllIllIlIlIllIlIIIlI));
    }
    
    public NioDatagramChannel(final java.nio.channels.DatagramChannel llllllllllllIllIllIlIlIllIIlIIll) {
        super(null, llllllllllllIllIllIlIlIllIIlIIll, NioDatagramChannel.llIlIIIlIIIIIl[1]);
        this.config = new NioDatagramChannelConfig(this, llllllllllllIllIllIlIlIllIIlIIll);
    }
    
    private static String lIIlIIIllIIIIlIl(String llllllllllllIllIllIlIIllllllIllI, final String llllllllllllIllIllIlIIllllllIlIl) {
        llllllllllllIllIllIlIIllllllIllI = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIllIllIlIIllllllIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIllIlIIlllllllIIl = new StringBuilder();
        final char[] llllllllllllIllIllIlIIlllllllIII = llllllllllllIllIllIlIIllllllIlIl.toCharArray();
        int llllllllllllIllIllIlIIllllllIlll = NioDatagramChannel.llIlIIIlIIIIIl[0];
        final int llllllllllllIllIllIlIIllllllIIIl = (Object)((String)llllllllllllIllIllIlIIllllllIllI).toCharArray();
        final int llllllllllllIllIllIlIIllllllIIII = llllllllllllIllIllIlIIllllllIIIl.length;
        short llllllllllllIllIllIlIIlllllIllll = (short)NioDatagramChannel.llIlIIIlIIIIIl[0];
        while (lIIlIIIllIIIllll(llllllllllllIllIllIlIIlllllIllll, llllllllllllIllIllIlIIllllllIIII)) {
            final char llllllllllllIllIllIlIIllllllllII = llllllllllllIllIllIlIIllllllIIIl[llllllllllllIllIllIlIIlllllIllll];
            llllllllllllIllIllIlIIlllllllIIl.append((char)(llllllllllllIllIllIlIIllllllllII ^ llllllllllllIllIllIlIIlllllllIII[llllllllllllIllIllIlIIllllllIlll % llllllllllllIllIllIlIIlllllllIII.length]));
            "".length();
            ++llllllllllllIllIllIlIIllllllIlll;
            ++llllllllllllIllIllIlIIlllllIllll;
            "".length();
            if ("  ".length() == " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIllIlIIlllllllIIl);
    }
    
    @Override
    public ChannelFuture leaveGroup(final InetAddress llllllllllllIllIllIlIlIIlIlIIlll, final ChannelPromise llllllllllllIllIllIlIlIIlIlIlIIl) {
        try {
            return this.leaveGroup(llllllllllllIllIllIlIlIIlIlIIlll, NetworkInterface.getByInetAddress(this.localAddress().getAddress()), null, llllllllllllIllIllIlIlIIlIlIlIIl);
        }
        catch (SocketException llllllllllllIllIllIlIlIIlIlIllII) {
            llllllllllllIllIllIlIlIIlIlIlIIl.setFailure((Throwable)llllllllllllIllIllIlIlIIlIlIllII);
            "".length();
            return llllllllllllIllIllIlIlIIlIlIlIIl;
        }
    }
    
    @Override
    protected void doClose() throws Exception {
        this.javaChannel().close();
    }
    
    @Override
    public ChannelFuture joinGroup(final InetSocketAddress llllllllllllIllIllIlIlIIlllIIIII, final NetworkInterface llllllllllllIllIllIlIlIIllIlllll, final ChannelPromise llllllllllllIllIllIlIlIIllIllllI) {
        return this.joinGroup(llllllllllllIllIllIlIlIIlllIIIII.getAddress(), llllllllllllIllIllIlIlIIllIlllll, null, llllllllllllIllIllIlIlIIllIllllI);
    }
    
    @Override
    protected void doBind(final SocketAddress llllllllllllIllIllIlIlIlIlllIlll) throws Exception {
        this.javaChannel().socket().bind(llllllllllllIllIllIlIlIlIlllIlll);
    }
    
    private static void lIIlIIIllIIIllIl() {
        (llIlIIIlIIIIIl = new int[19])[0] = ((0x24 ^ 0x78 ^ (0x2B ^ 0x79)) & (0x27 ^ 0x4F ^ (0x75 ^ 0x13) ^ -" ".length()));
        NioDatagramChannel.llIlIIIlIIIIIl[1] = " ".length();
        NioDatagramChannel.llIlIIIlIIIIIl[2] = (0xB6 ^ 0xB1);
        NioDatagramChannel.llIlIIIlIIIIIl[3] = "  ".length();
        NioDatagramChannel.llIlIIIlIIIIIl[4] = -" ".length();
        NioDatagramChannel.llIlIIIlIIIIIl[5] = "   ".length();
        NioDatagramChannel.llIlIIIlIIIIIl[6] = (0x89 ^ 0x8D);
        NioDatagramChannel.llIlIIIlIIIIIl[7] = (0x75 ^ 0x70);
        NioDatagramChannel.llIlIIIlIIIIIl[8] = (0xC1 ^ 0xC4 ^ "   ".length());
        NioDatagramChannel.llIlIIIlIIIIIl[9] = (159 + 47 - 38 + 36 ^ 51 + 44 + 100 + 1);
        NioDatagramChannel.llIlIIIlIIIIIl[10] = (0x98 ^ 0x91);
        NioDatagramChannel.llIlIIIlIIIIIl[11] = (0xCB ^ 0xA2 ^ (0xFE ^ 0x9D));
        NioDatagramChannel.llIlIIIlIIIIIl[12] = (12 + 144 - 138 + 135 ^ 123 + 93 - 125 + 55);
        NioDatagramChannel.llIlIIIlIIIIIl[13] = (0x46 ^ 0x4A);
        NioDatagramChannel.llIlIIIlIIIIIl[14] = (46 + 96 - 31 + 57 ^ 10 + 25 - 27 + 140);
        NioDatagramChannel.llIlIIIlIIIIIl[15] = (0x4C ^ 0x10 ^ (0x4B ^ 0x1A));
        NioDatagramChannel.llIlIIIlIIIIIl[16] = (0x9A ^ 0x94);
        NioDatagramChannel.llIlIIIlIIIIIl[17] = (0x31 ^ 0x18);
        NioDatagramChannel.llIlIIIlIIIIIl[18] = (0x38 ^ 0x37);
    }
    
    private static boolean lIIlIIIllIIIllll(final int llllllllllllIllIllIlIIllllIllIlI, final int llllllllllllIllIllIlIIllllIllIIl) {
        return llllllllllllIllIllIlIIllllIllIlI < llllllllllllIllIllIlIIllllIllIIl;
    }
    
    @Override
    public ChannelFuture leaveGroup(final InetAddress llllllllllllIllIllIlIlIIlIllIIll) {
        return this.leaveGroup(llllllllllllIllIllIlIlIIlIllIIll, this.newPromise());
    }
    
    @Override
    public ChannelMetadata metadata() {
        return NioDatagramChannel.METADATA;
    }
    
    @Override
    protected void doFinishConnect() throws Exception {
        throw new Error();
    }
    
    private static boolean lIIlIIIllIIlIIll(final int llllllllllllIllIllIlIIllllIIllll) {
        return llllllllllllIllIllIlIIllllIIllll > 0;
    }
    
    @Override
    protected java.nio.channels.DatagramChannel javaChannel() {
        return (java.nio.channels.DatagramChannel)super.javaChannel();
    }
    
    @Override
    public ChannelFuture block(final InetAddress llllllllllllIllIllIlIlIIIlIIlIll, final NetworkInterface llllllllllllIllIllIlIlIIIlIIIlIl, final InetAddress llllllllllllIllIllIlIlIIIlIIlIIl, final ChannelPromise llllllllllllIllIllIlIlIIIlIIlIII) {
        checkJavaVersion();
        if (lIIlIIIllIIIlllI(llllllllllllIllIllIlIlIIIlIIlIll)) {
            throw new NullPointerException(NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[9]]);
        }
        if (lIIlIIIllIIIlllI(llllllllllllIllIllIlIlIIIlIIlIIl)) {
            throw new NullPointerException(NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[10]]);
        }
        if (lIIlIIIllIIIlllI(llllllllllllIllIllIlIlIIIlIIIlIl)) {
            throw new NullPointerException(NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[11]]);
        }
        final float llllllllllllIllIllIlIlIIIlIIIIlI = (float)this;
        synchronized (this) {
            if (lIIlIIIllIIlIIlI(this.memberships)) {
                final List<MembershipKey> llllllllllllIllIllIlIlIIIlIIllIl = this.memberships.get(llllllllllllIllIllIlIlIIIlIIlIll);
                final Iterator llllllllllllIllIllIlIlIIIlIIlllI = llllllllllllIllIllIlIlIIIlIIllIl.iterator();
                while (lIIlIIIllIIlIIII(llllllllllllIllIllIlIlIIIlIIlllI.hasNext() ? 1 : 0)) {
                    final MembershipKey llllllllllllIllIllIlIlIIIlIIllll = llllllllllllIllIllIlIlIIIlIIlllI.next();
                    if (lIIlIIIllIIlIIII(llllllllllllIllIllIlIlIIIlIIIlIl.equals(llllllllllllIllIllIlIlIIIlIIllll.networkInterface()) ? 1 : 0)) {
                        try {
                            llllllllllllIllIllIlIlIIIlIIllll.block(llllllllllllIllIllIlIlIIIlIIlIIl);
                            "".length();
                            "".length();
                            if (" ".length() <= 0) {
                                return null;
                            }
                        }
                        catch (IOException llllllllllllIllIllIlIlIIIlIlIIII) {
                            llllllllllllIllIllIlIlIIIlIIlIII.setFailure((Throwable)llllllllllllIllIllIlIlIIIlIlIIII);
                            "".length();
                        }
                    }
                    "".length();
                    if (" ".length() <= 0) {
                        return null;
                    }
                }
            }
            // monitorexit(this)
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        llllllllllllIllIllIlIlIIIlIIlIII.setSuccess();
        "".length();
        return llllllllllllIllIllIlIlIIIlIIlIII;
    }
    
    @Override
    public ChannelFuture joinGroup(final InetAddress llllllllllllIllIllIlIlIIllllllll) {
        return this.joinGroup(llllllllllllIllIllIlIlIIllllllll, this.newPromise());
    }
    
    @Override
    protected Object filterOutboundMessage(final Object llllllllllllIllIllIlIlIlIIIlIIll) {
        if (lIIlIIIllIIlIIII((llllllllllllIllIllIlIlIlIIIlIIll instanceof DatagramPacket) ? 1 : 0)) {
            final DatagramPacket llllllllllllIllIllIlIlIlIIIllIIl = (DatagramPacket)llllllllllllIllIllIlIlIlIIIlIIll;
            final ByteBuf llllllllllllIllIllIlIlIlIIIllIII = ((DefaultAddressedEnvelope<ByteBuf, A>)llllllllllllIllIllIlIlIlIIIllIIl).content();
            if (lIIlIIIllIIlIIII(isSingleDirectBuffer(llllllllllllIllIllIlIlIlIIIllIII) ? 1 : 0)) {
                return llllllllllllIllIllIlIlIlIIIllIIl;
            }
            return new DatagramPacket(this.newDirectBuffer(llllllllllllIllIllIlIlIlIIIllIIl, llllllllllllIllIllIlIlIlIIIllIII), ((DefaultAddressedEnvelope<M, InetSocketAddress>)llllllllllllIllIllIlIlIlIIIllIIl).recipient());
        }
        else {
            if (!lIIlIIIllIIlIIII((llllllllllllIllIllIlIlIlIIIlIIll instanceof ByteBuf) ? 1 : 0)) {
                if (lIIlIIIllIIlIIII((llllllllllllIllIllIlIlIlIIIlIIll instanceof AddressedEnvelope) ? 1 : 0)) {
                    final AddressedEnvelope<Object, SocketAddress> llllllllllllIllIllIlIlIlIIIlIlIl = (AddressedEnvelope<Object, SocketAddress>)llllllllllllIllIllIlIlIlIIIlIIll;
                    if (lIIlIIIllIIlIIII((llllllllllllIllIllIlIlIlIIIlIlIl.content() instanceof ByteBuf) ? 1 : 0)) {
                        final ByteBuf llllllllllllIllIllIlIlIlIIIlIllI = llllllllllllIllIllIlIlIlIIIlIlIl.content();
                        if (lIIlIIIllIIlIIII(isSingleDirectBuffer(llllllllllllIllIllIlIlIlIIIlIllI) ? 1 : 0)) {
                            return llllllllllllIllIllIlIlIlIIIlIlIl;
                        }
                        return new DefaultAddressedEnvelope(this.newDirectBuffer(llllllllllllIllIllIlIlIlIIIlIlIl, llllllllllllIllIllIlIlIlIIIlIllI), llllllllllllIllIllIlIlIlIIIlIlIl.recipient());
                    }
                }
                throw new UnsupportedOperationException(String.valueOf(new StringBuilder().append(NioDatagramChannel.llIlIIIIllllIl[NioDatagramChannel.llIlIIIlIIIIIl[5]]).append(StringUtil.simpleClassName(llllllllllllIllIllIlIlIlIIIlIIll)).append(NioDatagramChannel.EXPECTED_TYPES)));
            }
            final ByteBuf llllllllllllIllIllIlIlIlIIIlIlll = (ByteBuf)llllllllllllIllIllIlIlIlIIIlIIll;
            if (lIIlIIIllIIlIIII(isSingleDirectBuffer(llllllllllllIllIllIlIlIlIIIlIlll) ? 1 : 0)) {
                return llllllllllllIllIllIlIlIlIIIlIlll;
            }
            return this.newDirectBuffer(llllllllllllIllIllIlIlIlIIIlIlll);
        }
    }
    
    @Override
    public ChannelFuture joinGroup(final InetSocketAddress llllllllllllIllIllIlIlIIlllIlllI, final NetworkInterface llllllllllllIllIllIlIlIIlllIllIl) {
        return this.joinGroup(llllllllllllIllIllIlIlIIlllIlllI, llllllllllllIllIllIlIlIIlllIllIl, this.newPromise());
    }
    
    private static boolean lIIlIIIllIIlIlII(final int llllllllllllIllIllIlIIllllIllllI, final int llllllllllllIllIllIlIIllllIlllIl) {
        return llllllllllllIllIllIlIIllllIllllI == llllllllllllIllIllIlIIllllIlllIl;
    }
}
