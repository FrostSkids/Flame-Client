// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import java.util.concurrent.RejectedExecutionException;
import java.net.InetSocketAddress;
import io.netty.util.internal.PlatformDependent;
import java.io.IOException;
import io.netty.util.ReferenceCountUtil;
import io.netty.util.internal.OneTimeTask;
import io.netty.util.concurrent.Promise;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.concurrent.EventExecutor;
import io.netty.util.internal.ThreadLocalRandom;
import io.netty.buffer.ByteBufAllocator;
import io.netty.util.internal.EmptyArrays;
import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.util.internal.logging.InternalLogger;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.ClosedChannelException;
import java.net.SocketAddress;
import io.netty.util.DefaultAttributeMap;

public abstract class AbstractChannel extends DefaultAttributeMap implements Channel
{
    private static final /* synthetic */ String[] llIIlIlllIIlll;
    private /* synthetic */ boolean strValActive;
    private volatile /* synthetic */ SocketAddress remoteAddress;
    private final /* synthetic */ CloseFuture closeFuture;
    private final /* synthetic */ VoidChannelPromise voidPromise;
    private final /* synthetic */ long hashCode;
    private volatile /* synthetic */ EventLoop eventLoop;
    private final /* synthetic */ DefaultChannelPipeline pipeline;
    private static final /* synthetic */ int[] llIIlIlllIlIII;
    private volatile /* synthetic */ boolean registered;
    static final /* synthetic */ ClosedChannelException CLOSED_CHANNEL_EXCEPTION;
    private final /* synthetic */ Channel parent;
    private final /* synthetic */ VoidChannelPromise unsafeVoidPromise;
    private /* synthetic */ MessageSizeEstimator.Handle estimatorHandle;
    static final /* synthetic */ NotYetConnectedException NOT_YET_CONNECTED_EXCEPTION;
    private final /* synthetic */ Unsafe unsafe;
    private /* synthetic */ String strVal;
    private final /* synthetic */ ChannelFuture succeededFuture;
    private volatile /* synthetic */ SocketAddress localAddress;
    private static final /* synthetic */ InternalLogger logger;
    
    @Override
    public final int compareTo(final Channel llllllllllllIlllIIIlIIIlIIlIlIIl) {
        if (lIIIllIllllIlllI(this, llllllllllllIlllIIIlIIIlIIlIlIIl)) {
            return AbstractChannel.llIIlIlllIlIII[1];
        }
        long llllllllllllIlllIIIlIIIlIIlIlIII = this.hashCode - llllllllllllIlllIIIlIIIlIIlIlIIl.hashCode();
        if (lIIIllIlllllIIII(lIIIllIllllIllll(llllllllllllIlllIIIlIIIlIIlIlIII, 0L))) {
            return AbstractChannel.llIIlIlllIlIII[0];
        }
        if (lIIIllIlllllIIIl(lIIIllIllllIllll(llllllllllllIlllIIIlIIIlIIlIlIII, 0L))) {
            return AbstractChannel.llIIlIlllIlIII[2];
        }
        llllllllllllIlllIIIlIIIlIIlIlIII = System.identityHashCode(this) - System.identityHashCode(llllllllllllIlllIIIlIIIlIIlIlIIl);
        if (lIIIllIllllIllII(lIIIllIllllIllll(llllllllllllIlllIIIlIIIlIIlIlIII, 0L))) {
            return (int)llllllllllllIlllIIIlIIIlIIlIlIII;
        }
        throw new Error();
    }
    
    static {
        lIIIllIllllIlIlI();
        lIIIllIllllIlIIl();
        logger = InternalLoggerFactory.getInstance(AbstractChannel.class);
        CLOSED_CHANNEL_EXCEPTION = new ClosedChannelException();
        NOT_YET_CONNECTED_EXCEPTION = new NotYetConnectedException();
        AbstractChannel.CLOSED_CHANNEL_EXCEPTION.setStackTrace(EmptyArrays.EMPTY_STACK_TRACE);
        AbstractChannel.NOT_YET_CONNECTED_EXCEPTION.setStackTrace(EmptyArrays.EMPTY_STACK_TRACE);
    }
    
    protected abstract void doBind(final SocketAddress p0) throws Exception;
    
    protected abstract SocketAddress localAddress0();
    
    protected abstract void doWrite(final ChannelOutboundBuffer p0) throws Exception;
    
    @Override
    public ChannelFuture deregister(final ChannelPromise llllllllllllIlllIIIlIIIlIllIllIl) {
        return this.pipeline.deregister(llllllllllllIlllIIIlIIIlIllIllIl);
    }
    
    @Override
    public final boolean equals(final Object llllllllllllIlllIIIlIIIlIIllIIII) {
        int n;
        if (lIIIllIllllIlllI(this, llllllllllllIlllIIIlIIIlIIllIIII)) {
            n = AbstractChannel.llIIlIlllIlIII[0];
            "".length();
            if ("  ".length() != "  ".length()) {
                return ((0xDE ^ 0x94 ^ (0x5E ^ 0x47)) & (0x79 ^ 0x2 ^ (0x63 ^ 0x4B) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = AbstractChannel.llIIlIlllIlIII[1];
        }
        return n != 0;
    }
    
    private static void lIIIllIllllIlIlI() {
        (llIIlIlllIlIII = new int[9])[0] = " ".length();
        AbstractChannel.llIIlIlllIlIII[1] = ((0xF ^ 0x37 ^ (0x5C ^ 0x70)) & (69 + 16 - 52 + 98 ^ 56 + 141 - 166 + 120 ^ -" ".length()));
        AbstractChannel.llIIlIlllIlIII[2] = -" ".length();
        AbstractChannel.llIIlIlllIlIII[3] = (0xFE ^ 0x87 ^ (0x6E ^ 0x13));
        AbstractChannel.llIIlIlllIlIII[4] = "  ".length();
        AbstractChannel.llIIlIlllIlIII[5] = "   ".length();
        AbstractChannel.llIIlIlllIlIII[6] = (0x1B ^ 0x67 ^ (0xFF ^ 0x86));
        AbstractChannel.llIIlIlllIlIII[7] = (0x95 ^ 0xAA ^ (0x27 ^ 0x1E));
        AbstractChannel.llIIlIlllIlIII[8] = (0x3D ^ 0x6F ^ (0x42 ^ 0x18));
    }
    
    protected void doDeregister() throws Exception {
    }
    
    @Override
    public final int hashCode() {
        return (int)this.hashCode;
    }
    
    private static boolean lIIIllIllllIlIll(final Object llllllllllllIlllIIIlIIIIllIIIlll) {
        return llllllllllllIlllIIIlIIIIllIIIlll != null;
    }
    
    protected void invalidateRemoteAddress() {
        this.remoteAddress = null;
    }
    
    @Override
    public ByteBufAllocator alloc() {
        return this.config().getAllocator();
    }
    
    @Override
    public ChannelFuture close(final ChannelPromise llllllllllllIlllIIIlIIIlIlllIIll) {
        return this.pipeline.close(llllllllllllIlllIIIlIIIlIlllIIll);
    }
    
    @Override
    public ChannelFuture close() {
        return this.pipeline.close();
    }
    
    @Override
    public ChannelFuture connect(final SocketAddress llllllllllllIlllIIIlIIIllIlIllIl, final SocketAddress llllllllllllIlllIIIlIIIllIlIllII) {
        return this.pipeline.connect(llllllllllllIlllIIIlIIIllIlIllIl, llllllllllllIlllIIIlIIIllIlIllII);
    }
    
    @Override
    public ChannelProgressivePromise newProgressivePromise() {
        return new DefaultChannelProgressivePromise(this);
    }
    
    @Override
    public ChannelFuture disconnect(final ChannelPromise llllllllllllIlllIIIlIIIlIllllIIl) {
        return this.pipeline.disconnect(llllllllllllIlllIIIlIIIlIllllIIl);
    }
    
    protected AbstractChannel(final Channel llllllllllllIlllIIIlIIIllllIlllI) {
        this.hashCode = ThreadLocalRandom.current().nextLong();
        this.succeededFuture = new SucceededChannelFuture(this, null);
        this.voidPromise = new VoidChannelPromise(this, (boolean)(AbstractChannel.llIIlIlllIlIII[0] != 0));
        this.unsafeVoidPromise = new VoidChannelPromise(this, (boolean)(AbstractChannel.llIIlIlllIlIII[1] != 0));
        this.closeFuture = new CloseFuture(this);
        this.parent = llllllllllllIlllIIIlIIIllllIlllI;
        this.unsafe = this.newUnsafe();
        this.pipeline = new DefaultChannelPipeline(this);
    }
    
    private static boolean lIIIllIlllllIIIl(final int llllllllllllIlllIIIlIIIIlIllllIl) {
        return llllllllllllIlllIIIlIIIIlIllllIl < 0;
    }
    
    private static int lIIIllIllllIllll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public SocketAddress remoteAddress() {
        SocketAddress llllllllllllIlllIIIlIIIlllIIIlll = this.remoteAddress;
        if (lIIIllIllllIllIl(llllllllllllIlllIIIlIIIlllIIIlll)) {
            try {
                llllllllllllIlllIIIlIIIlllIIIlll = (this.remoteAddress = this.unsafe().remoteAddress());
                "".length();
                if (-(0x4 ^ 0x1) >= 0) {
                    return null;
                }
            }
            catch (Throwable llllllllllllIlllIIIlIIIlllIIlIIl) {
                return null;
            }
        }
        return llllllllllllIlllIIIlIIIlllIIIlll;
    }
    
    @Override
    public boolean isRegistered() {
        return this.registered;
    }
    
    @Override
    public ChannelPromise newPromise() {
        return new DefaultChannelPromise(this);
    }
    
    @Override
    public ChannelFuture newFailedFuture(final Throwable llllllllllllIlllIIIlIIIlIIllllll) {
        return new FailedChannelFuture(this, null, llllllllllllIlllIIIlIIIlIIllllll);
    }
    
    @Override
    public ChannelFuture closeFuture() {
        return this.closeFuture;
    }
    
    protected Object filterOutboundMessage(final Object llllllllllllIlllIIIlIIIlIIIIIlIl) throws Exception {
        return llllllllllllIlllIIIlIIIlIIIIIlIl;
    }
    
    @Override
    public ChannelFuture connect(final SocketAddress llllllllllllIlllIIIlIIIllIllIlII) {
        return this.pipeline.connect(llllllllllllIlllIIIlIIIllIllIlII);
    }
    
    @Override
    public ChannelFuture bind(final SocketAddress llllllllllllIlllIIIlIIIllIIlIlIl, final ChannelPromise llllllllllllIlllIIIlIIIllIIlIlII) {
        return this.pipeline.bind(llllllllllllIlllIIIlIIIllIIlIlIl, llllllllllllIlllIIIlIIIllIIlIlII);
    }
    
    @Override
    public ChannelFuture newSucceededFuture() {
        return this.succeededFuture;
    }
    
    @Override
    public ChannelFuture write(final Object llllllllllllIlllIIIlIIIlIllIIlII) {
        return this.pipeline.write(llllllllllllIlllIIIlIIIlIllIIlII);
    }
    
    private static String lIIIllIllllIIlll(final String llllllllllllIlllIIIlIIIIllIlllIl, final String llllllllllllIlllIIIlIIIIllIlllII) {
        try {
            final SecretKeySpec llllllllllllIlllIIIlIIIIlllIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIlIIIIllIlllII.getBytes(StandardCharsets.UTF_8)), AbstractChannel.llIIlIlllIlIII[8]), "DES");
            final Cipher llllllllllllIlllIIIlIIIIlllIIIIl = Cipher.getInstance("DES");
            llllllllllllIlllIIIlIIIIlllIIIIl.init(AbstractChannel.llIIlIlllIlIII[4], llllllllllllIlllIIIlIIIIlllIIIlI);
            return new String(llllllllllllIlllIIIlIIIIlllIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIlIIIIllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIlIIIIlllIIIII) {
            llllllllllllIlllIIIlIIIIlllIIIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ChannelFuture deregister() {
        return this.pipeline.deregister();
    }
    
    private static boolean lIIIllIllllIlllI(final Object llllllllllllIlllIIIlIIIIllIIIlII, final Object llllllllllllIlllIIIlIIIIllIIIIll) {
        return llllllllllllIlllIIIlIIIIllIIIlII == llllllllllllIlllIIIlIIIIllIIIIll;
    }
    
    protected void invalidateLocalAddress() {
        this.localAddress = null;
    }
    
    @Override
    public ChannelFuture bind(final SocketAddress llllllllllllIlllIIIlIIIllIlllIlI) {
        return this.pipeline.bind(llllllllllllIlllIIIlIIIllIlllIlI);
    }
    
    @Override
    public ChannelFuture connect(final SocketAddress llllllllllllIlllIIIlIIIllIIIIlIl, final SocketAddress llllllllllllIlllIIIlIIIllIIIIlII, final ChannelPromise llllllllllllIlllIIIlIIIlIlllllll) {
        return this.pipeline.connect(llllllllllllIlllIIIlIIIllIIIIlIl, llllllllllllIlllIIIlIIIllIIIIlII, llllllllllllIlllIIIlIIIlIlllllll);
    }
    
    @Override
    public ChannelPipeline pipeline() {
        return this.pipeline;
    }
    
    @Override
    public Channel parent() {
        return this.parent;
    }
    
    @Override
    public Channel flush() {
        this.pipeline.flush();
        "".length();
        return this;
    }
    
    @Override
    public ChannelFuture write(final Object llllllllllllIlllIIIlIIIlIlIlllll, final ChannelPromise llllllllllllIlllIIIlIIIlIlIllllI) {
        return this.pipeline.write(llllllllllllIlllIIIlIIIlIlIlllll, llllllllllllIlllIIIlIIIlIlIllllI);
    }
    
    protected abstract SocketAddress remoteAddress0();
    
    @Override
    public Unsafe unsafe() {
        return this.unsafe;
    }
    
    private static boolean lIIIllIllllIllII(final int llllllllllllIlllIIIlIIIIlIllllll) {
        return llllllllllllIlllIIIlIIIIlIllllll != 0;
    }
    
    protected abstract boolean isCompatible(final EventLoop p0);
    
    protected abstract void doBeginRead() throws Exception;
    
    protected abstract AbstractUnsafe newUnsafe();
    
    final MessageSizeEstimator.Handle estimatorHandle() {
        if (lIIIllIllllIllIl(this.estimatorHandle)) {
            this.estimatorHandle = this.config().getMessageSizeEstimator().newHandle();
        }
        return this.estimatorHandle;
    }
    
    protected void doRegister() throws Exception {
    }
    
    @Override
    public Channel read() {
        this.pipeline.read();
        "".length();
        return this;
    }
    
    private static boolean lIIIllIllllIllIl(final Object llllllllllllIlllIIIlIIIIllIIIIIl) {
        return llllllllllllIlllIIIlIIIIllIIIIIl == null;
    }
    
    @Override
    public ChannelFuture writeAndFlush(final Object llllllllllllIlllIIIlIIIlIlIIllIl, final ChannelPromise llllllllllllIlllIIIlIIIlIlIIllII) {
        return this.pipeline.writeAndFlush(llllllllllllIlllIIIlIIIlIlIIllIl, llllllllllllIlllIIIlIIIlIlIIllII);
    }
    
    private static void lIIIllIllllIlIIl() {
        (llIIlIlllIIlll = new String[AbstractChannel.llIIlIlllIlIII[7]])[AbstractChannel.llIIlIlllIlIII[1]] = lIIIllIllllIIlll("9EC9q81ZcCzkDILDmq9xlYTPY++C46ttXMbiL2NNfsqwuhl168rIaQ==", "FThzZ");
        AbstractChannel.llIIlIlllIIlll[AbstractChannel.llIIlIlllIlIII[0]] = lIIIllIllllIlIII("yhW6gS+DpN4l0GIiUFg1jiiFJxzyQHxj", "gYllc");
        AbstractChannel.llIIlIlllIIlll[AbstractChannel.llIIlIlllIlIII[4]] = lIIIllIllllIIlll("lxWiD8txqhk=", "ExMNv");
        AbstractChannel.llIIlIlllIIlll[AbstractChannel.llIIlIlllIlIII[5]] = lIIIllIllllIIlll("CWQZxragNjM=", "KQHyI");
        AbstractChannel.llIIlIlllIIlll[AbstractChannel.llIIlIlllIlIII[3]] = lIIIllIllllIIlll("AKVlwbcaZ8Nsj4GPzGQaKdnid0rnrq0F", "oWkvV");
        AbstractChannel.llIIlIlllIIlll[AbstractChannel.llIIlIlllIlIII[6]] = lIIIllIllllIlIII("+Q8CGTxPhNcXBYscf4Kl5g==", "TsnWI");
    }
    
    @Override
    public String toString() {
        final boolean llllllllllllIlllIIIlIIIlIIIllIIl = this.isActive();
        if (lIIIllIlllllIIlI(this.strValActive ? 1 : 0, llllllllllllIlllIIIlIIIlIIIllIIl ? 1 : 0) && lIIIllIllllIlIll(this.strVal)) {
            return this.strVal;
        }
        final SocketAddress llllllllllllIlllIIIlIIIlIIIllIII = this.remoteAddress();
        final SocketAddress llllllllllllIlllIIIlIIIlIIIlIlll = this.localAddress();
        if (lIIIllIllllIlIll(llllllllllllIlllIIIlIIIlIIIllIII)) {
            SocketAddress llllllllllllIlllIIIlIIIlIIIlllII;
            SocketAddress llllllllllllIlllIIIlIIIlIIIllIll;
            if (lIIIllIllllIllIl(this.parent)) {
                final SocketAddress llllllllllllIlllIIIlIIIlIIIllllI = llllllllllllIlllIIIlIIIlIIIlIlll;
                final SocketAddress llllllllllllIlllIIIlIIIlIIIlllIl = llllllllllllIlllIIIlIIIlIIIllIII;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                llllllllllllIlllIIIlIIIlIIIlllII = llllllllllllIlllIIIlIIIlIIIllIII;
                llllllllllllIlllIIIlIIIlIIIllIll = llllllllllllIlllIIIlIIIlIIIlIlll;
            }
            final String format = AbstractChannel.llIIlIlllIIlll[AbstractChannel.llIIlIlllIlIII[0]];
            final Object[] args = new Object[AbstractChannel.llIIlIlllIlIII[3]];
            args[AbstractChannel.llIIlIlllIlIII[1]] = (int)this.hashCode;
            args[AbstractChannel.llIIlIlllIlIII[0]] = llllllllllllIlllIIIlIIIlIIIlllII;
            final int n = AbstractChannel.llIIlIlllIlIII[4];
            String s;
            if (lIIIllIllllIllII(llllllllllllIlllIIIlIIIlIIIllIIl ? 1 : 0)) {
                s = AbstractChannel.llIIlIlllIIlll[AbstractChannel.llIIlIlllIlIII[4]];
                "".length();
                if ("  ".length() == (0x68 ^ 0x6C)) {
                    return null;
                }
            }
            else {
                s = AbstractChannel.llIIlIlllIIlll[AbstractChannel.llIIlIlllIlIII[5]];
            }
            args[n] = s;
            args[AbstractChannel.llIIlIlllIlIII[5]] = llllllllllllIlllIIIlIIIlIIIllIll;
            this.strVal = String.format(format, args);
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        else if (lIIIllIllllIlIll(llllllllllllIlllIIIlIIIlIIIlIlll)) {
            final String format2 = AbstractChannel.llIIlIlllIIlll[AbstractChannel.llIIlIlllIlIII[3]];
            final Object[] args2 = new Object[AbstractChannel.llIIlIlllIlIII[4]];
            args2[AbstractChannel.llIIlIlllIlIII[1]] = (int)this.hashCode;
            args2[AbstractChannel.llIIlIlllIlIII[0]] = llllllllllllIlllIIIlIIIlIIIlIlll;
            this.strVal = String.format(format2, args2);
            "".length();
            if (" ".length() >= (0x86 ^ 0x82)) {
                return null;
            }
        }
        else {
            final String format3 = AbstractChannel.llIIlIlllIIlll[AbstractChannel.llIIlIlllIlIII[6]];
            final Object[] args3 = new Object[AbstractChannel.llIIlIlllIlIII[0]];
            args3[AbstractChannel.llIIlIlllIlIII[1]] = (int)this.hashCode;
            this.strVal = String.format(format3, args3);
        }
        this.strValActive = llllllllllllIlllIIIlIIIlIIIllIIl;
        return this.strVal;
    }
    
    private static String lIIIllIllllIlIII(final String llllllllllllIlllIIIlIIIIllIlIIlI, final String llllllllllllIlllIIIlIIIIllIlIIIl) {
        try {
            final SecretKeySpec llllllllllllIlllIIIlIIIIllIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIlIIIIllIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIIlIIIIllIlIlII = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIIlIIIIllIlIlII.init(AbstractChannel.llIIlIlllIlIII[4], llllllllllllIlllIIIlIIIIllIlIlIl);
            return new String(llllllllllllIlllIIIlIIIIllIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIlIIIIllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIlIIIIllIlIIll) {
            llllllllllllIlllIIIlIIIIllIlIIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ChannelFuture connect(final SocketAddress llllllllllllIlllIIIlIIIllIIIllII, final ChannelPromise llllllllllllIlllIIIlIIIllIIIlllI) {
        return this.pipeline.connect(llllllllllllIlllIIIlIIIllIIIllII, llllllllllllIlllIIIlIIIllIIIlllI);
    }
    
    protected abstract void doDisconnect() throws Exception;
    
    @Override
    public ChannelFuture disconnect() {
        return this.pipeline.disconnect();
    }
    
    @Override
    public boolean isWritable() {
        final ChannelOutboundBuffer llllllllllllIlllIIIlIIIllllIlIlI = this.unsafe.outboundBuffer();
        int n;
        if (lIIIllIllllIlIll(llllllllllllIlllIIIlIIIllllIlIlI) && lIIIllIllllIllII(llllllllllllIlllIIIlIIIllllIlIlI.isWritable() ? 1 : 0)) {
            n = AbstractChannel.llIIlIlllIlIII[0];
            "".length();
            if (-"   ".length() >= 0) {
                return ((0x72 ^ 0x3B) & ~(0xDB ^ 0x92)) != 0x0;
            }
        }
        else {
            n = AbstractChannel.llIIlIlllIlIII[1];
        }
        return n != 0;
    }
    
    private static boolean lIIIllIlllllIIII(final int llllllllllllIlllIIIlIIIIlIlllIll) {
        return llllllllllllIlllIIIlIIIIlIlllIll > 0;
    }
    
    private static boolean lIIIllIlllllIIlI(final int llllllllllllIlllIIIlIIIIllIIlIlI, final int llllllllllllIlllIIIlIIIIllIIlIIl) {
        return llllllllllllIlllIIIlIIIIllIIlIlI == llllllllllllIlllIIIlIIIIllIIlIIl;
    }
    
    @Override
    public ChannelFuture writeAndFlush(final Object llllllllllllIlllIIIlIIIlIlIlIlll) {
        return this.pipeline.writeAndFlush(llllllllllllIlllIIIlIIIlIlIlIlll);
    }
    
    protected abstract void doClose() throws Exception;
    
    @Override
    public final ChannelPromise voidPromise() {
        return this.voidPromise;
    }
    
    @Override
    public EventLoop eventLoop() {
        final EventLoop llllllllllllIlllIIIlIIIlllIllIll = this.eventLoop;
        if (lIIIllIllllIllIl(llllllllllllIlllIIIlIIIlllIllIll)) {
            throw new IllegalStateException(AbstractChannel.llIIlIlllIIlll[AbstractChannel.llIIlIlllIlIII[1]]);
        }
        return llllllllllllIlllIIIlIIIlllIllIll;
    }
    
    @Override
    public SocketAddress localAddress() {
        SocketAddress llllllllllllIlllIIIlIIIlllIlIIll = this.localAddress;
        if (lIIIllIllllIllIl(llllllllllllIlllIIIlIIIlllIlIIll)) {
            try {
                llllllllllllIlllIIIlIIIlllIlIIll = (this.localAddress = this.unsafe().localAddress());
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (Throwable llllllllllllIlllIIIlIIIlllIlIlIl) {
                return null;
            }
        }
        return llllllllllllIlllIIIlIIIlllIlIIll;
    }
    
    static final class CloseFuture extends DefaultChannelPromise
    {
        boolean setClosed() {
            return super.trySuccess();
        }
        
        @Override
        public boolean trySuccess() {
            throw new IllegalStateException();
        }
        
        @Override
        public boolean tryFailure(final Throwable lllllllllllllIIIllIIlIlllllIlIlI) {
            throw new IllegalStateException();
        }
        
        CloseFuture(final AbstractChannel lllllllllllllIIIllIIlIllllllIIlI) {
            super(lllllllllllllIIIllIIlIllllllIIlI);
        }
        
        @Override
        public ChannelPromise setFailure(final Throwable lllllllllllllIIIllIIlIlllllIllIl) {
            throw new IllegalStateException();
        }
        
        @Override
        public ChannelPromise setSuccess() {
            throw new IllegalStateException();
        }
    }
    
    protected abstract class AbstractUnsafe implements Unsafe
    {
        private static final /* synthetic */ int[] llIlIIIlIllIll;
        private /* synthetic */ boolean inFlush0;
        private /* synthetic */ ChannelOutboundBuffer outboundBuffer;
        private static final /* synthetic */ String[] llIlIIIlIllIII;
        
        private static void lIIlIIIlllllIlII() {
            (llIlIIIlIllIII = new String[AbstractUnsafe.llIlIIIlIllIll[11]])[AbstractUnsafe.llIlIIIlIllIll[0]] = lIIlIIIllllIllll("KRwUPDMABR4i", "LjqRG");
            AbstractUnsafe.llIlIIIlIllIII[AbstractUnsafe.llIlIIIlIllIll[1]] = lIIlIIIllllIllll("ChYLGQEMFh4VFlgHA1ATFlMJBhcWB0wcHRcDTBEeChYNFAs=", "xslpr");
            AbstractUnsafe.llIlIIIlIllIII[AbstractUnsafe.llIlIIIlIllIll[2]] = lIIlIIIlllllIIII("ypZ2YXlHIiuPe0m8dhYU75TeaFV/cpB4O/+Ux4a0m+8=", "qlnLh");
            AbstractUnsafe.llIlIIIlIllIII[AbstractUnsafe.llIlIIIlIllIll[3]] = lIIlIIIllllIllll("FjorFih9NjUaPjk7PlUscDYxFCM+MDVVOjg6KhBtIjA+HD4kJzgBJD87eQEsIz55AiwjdTcaOXA0OhYoICE8EW0yLHkUI3AwLxAjJHU1GiIgb3kOMA==", "PUYuM");
            AbstractUnsafe.llIlIIIlIllIII[AbstractUnsafe.llIlIIIlIllIll[4]] = lIIlIIIlllllIIIl("rWYNkbdh0UEQM1AQLJx79u9k+yjiVh6R60mwXaYNtVHePglGxqEbDVw7tEK7n/3wDmGxhM2VrL+IkdhVmX+dqmgrKLsPpWyUlei9s9Q9oubm/oDB1rsOsGI0kRVKIr3rA/194ewVrfCQcyZ3Xj3Vg5W1Y9YZiIOAoZztlfCOekNl07LGamp12A==", "iiTyA");
            AbstractUnsafe.llIlIIIlIllIII[AbstractUnsafe.llIlIIIlIllIll[5]] = lIIlIIIlllllIIII("W/AR43Mo7TaeeqatF3fD++/44t2Nkq2J", "RGsqw");
            AbstractUnsafe.llIlIIIlIllIII[AbstractUnsafe.llIlIIIlIllIll[6]] = lIIlIIIllllIllll("KRQQPDALVQ0/dQwZFiMwTxRZMz0OGxc1OUE=", "ouyPU");
            AbstractUnsafe.llIlIIIlIllIII[AbstractUnsafe.llIlIIIlIllIll[7]] = lIIlIIIllllIllll("JQMyABYVDiMdAlAILxsDABk+FwhQAjQbEwIfMhxGBwU+FANQCTIKAxcEJAwDAgQ5H0YRTTQQBx4DMhRI", "pmWxf");
            AbstractUnsafe.llIlIIIlIllIII[AbstractUnsafe.llIlIIIlIllIll[8]] = lIIlIIIlllllIIII("QPREBD7f7cNm6wxsqYNbQno4FRiUzgBaAajUDb0WCvoWS2lBwhnmzNuaXp5/lfOCNZtqmDxQhqIaIgJdHlASPDwHsawy+Sh4", "GByoh");
            AbstractUnsafe.llIlIIIlIllIII[AbstractUnsafe.llIlIIIlIllIll[9]] = lIIlIIIlllllIIIl("ApR+CCiGXpGxAPO4nbukuS/eQFWbhgIoYy0zwJB49A3Qb8ZVFTKtY5Qgh+3ewWMUlUT8AlwNGTLjx9sSZYv/qyLzcQ32X0+X", "kpcYI");
            AbstractUnsafe.llIlIIIlIllIII[AbstractUnsafe.llIlIIIlIllIll[10]] = lIIlIIIllllIllll("GSgmVz96ICYGJDEsaAQqKSJoHCouLDpQKilpDQYuND0EHyQqaToVIT8qPBUveiA8", "ZIHpK");
        }
        
        @Override
        public final void register(final EventLoop llllllllllllIllIllIIlllIlIIIIIlI, final ChannelPromise llllllllllllIllIllIIlllIIllllllI) {
            if (lIIlIIIllllllIIl(llllllllllllIllIllIIlllIlIIIIIlI)) {
                throw new NullPointerException(AbstractUnsafe.llIlIIIlIllIII[AbstractUnsafe.llIlIIIlIllIll[0]]);
            }
            if (lIIlIIIllllllIlI(AbstractChannel.this.isRegistered() ? 1 : 0)) {
                llllllllllllIllIllIIlllIIllllllI.setFailure((Throwable)new IllegalStateException(AbstractUnsafe.llIlIIIlIllIII[AbstractUnsafe.llIlIIIlIllIll[1]]));
                "".length();
                return;
            }
            if (lIIlIIIllllllIll(AbstractChannel.this.isCompatible(llllllllllllIllIllIIlllIlIIIIIlI) ? 1 : 0)) {
                llllllllllllIllIllIIlllIIllllllI.setFailure((Throwable)new IllegalStateException(String.valueOf(new StringBuilder().append(AbstractUnsafe.llIlIIIlIllIII[AbstractUnsafe.llIlIIIlIllIll[2]]).append(llllllllllllIllIllIIlllIlIIIIIlI.getClass().getName()))));
                "".length();
                return;
            }
            AbstractChannel.this.eventLoop = llllllllllllIllIllIIlllIlIIIIIlI;
            "".length();
            if (lIIlIIIllllllIlI(llllllllllllIllIllIIlllIlIIIIIlI.inEventLoop() ? 1 : 0)) {
                this.register0(llllllllllllIllIllIIlllIIllllllI);
                "".length();
                if ((0xB8 ^ 0xBC) <= 0) {
                    return;
                }
            }
            else {
                try {
                    llllllllllllIllIllIIlllIlIIIIIlI.execute(new OneTimeTask() {
                        @Override
                        public void run() {
                            AbstractUnsafe.this.register0(llllllllllllIllIllIIlllIIllllllI);
                        }
                    });
                    "".length();
                    if ((0x71 ^ 0x75) == "   ".length()) {
                        return;
                    }
                }
                catch (Throwable llllllllllllIllIllIIlllIlIIIIlII) {
                    AbstractChannel.logger.warn(AbstractUnsafe.llIlIIIlIllIII[AbstractUnsafe.llIlIIIlIllIll[3]], AbstractChannel.this, llllllllllllIllIllIIlllIlIIIIlII);
                    this.closeForcibly();
                    AbstractChannel.this.closeFuture.setClosed();
                    "".length();
                    this.safeSetFailure(llllllllllllIllIllIIlllIIllllllI, llllllllllllIllIllIIlllIlIIIIlII);
                }
            }
        }
        
        @Override
        public final void flush() {
            final ChannelOutboundBuffer llllllllllllIllIllIIlllIIIIllIll = this.outboundBuffer;
            if (lIIlIIIllllllIIl(llllllllllllIllIllIIlllIIIIllIll)) {
                return;
            }
            llllllllllllIllIllIIlllIIIIllIll.addFlush();
            this.flush0();
        }
        
        @Override
        public final void write(Object llllllllllllIllIllIIlllIIIlIIIll, final ChannelPromise llllllllllllIllIllIIlllIIIlIIlll) {
            final ChannelOutboundBuffer llllllllllllIllIllIIlllIIIlIIllI = this.outboundBuffer;
            if (lIIlIIIllllllIIl(llllllllllllIllIllIIlllIIIlIIllI)) {
                this.safeSetFailure(llllllllllllIllIllIIlllIIIlIIlll, AbstractChannel.CLOSED_CHANNEL_EXCEPTION);
                ReferenceCountUtil.release(llllllllllllIllIllIIlllIIIlIIIll);
                "".length();
                return;
            }
            int llllllllllllIllIllIIlllIIIlIIlIl;
            try {
                llllllllllllIllIllIIlllIIIlIIIll = AbstractChannel.this.filterOutboundMessage(llllllllllllIllIllIIlllIIIlIIIll);
                llllllllllllIllIllIIlllIIIlIIlIl = AbstractChannel.this.estimatorHandle().size(llllllllllllIllIllIIlllIIIlIIIll);
                if (lIIlIIIlllllllII(llllllllllllIllIllIIlllIIIlIIlIl)) {
                    llllllllllllIllIllIIlllIIIlIIlIl = AbstractUnsafe.llIlIIIlIllIll[0];
                }
                "".length();
                if ("   ".length() <= -" ".length()) {
                    return;
                }
            }
            catch (Throwable llllllllllllIllIllIIlllIIIlIlIlI) {
                this.safeSetFailure(llllllllllllIllIllIIlllIIIlIIlll, llllllllllllIllIllIIlllIIIlIlIlI);
                ReferenceCountUtil.release(llllllllllllIllIllIIlllIIIlIIIll);
                "".length();
                return;
            }
            llllllllllllIllIllIIlllIIIlIIllI.addMessage(llllllllllllIllIllIIlllIIIlIIIll, llllllllllllIllIllIIlllIIIlIIlIl, llllllllllllIllIllIIlllIIIlIIlll);
        }
        
        protected final void safeSetSuccess(final ChannelPromise llllllllllllIllIllIIlllIIIIIIIlI) {
            if (lIIlIIIllllllIll((llllllllllllIllIllIIlllIIIIIIIlI instanceof VoidChannelPromise) ? 1 : 0) && lIIlIIIllllllIll(llllllllllllIllIllIIlllIIIIIIIlI.trySuccess() ? 1 : 0)) {
                AbstractChannel.logger.warn(AbstractUnsafe.llIlIIIlIllIII[AbstractUnsafe.llIlIIIlIllIll[8]], llllllllllllIllIllIIlllIIIIIIIlI);
            }
        }
        
        @Override
        public final void close(final ChannelPromise llllllllllllIllIllIIlllIIlIlIIII) {
            if (lIIlIIIllllllIll(llllllllllllIllIllIIlllIIlIlIIII.setUncancellable() ? 1 : 0)) {
                return;
            }
            if (lIIlIIIllllllIlI(this.inFlush0 ? 1 : 0)) {
                this.invokeLater(new OneTimeTask() {
                    @Override
                    public void run() {
                        AbstractUnsafe.this.close(llllllllllllIllIllIIlllIIlIlIIII);
                    }
                });
                return;
            }
            if (lIIlIIIllllllIlI(AbstractChannel.this.closeFuture.isDone() ? 1 : 0)) {
                this.safeSetSuccess(llllllllllllIllIllIIlllIIlIlIIII);
                return;
            }
            final boolean llllllllllllIllIllIIlllIIlIIllll = AbstractChannel.this.isActive();
            final ChannelOutboundBuffer llllllllllllIllIllIIlllIIlIIlllI = this.outboundBuffer;
            this.outboundBuffer = null;
            try {
                AbstractChannel.this.doClose();
                AbstractChannel.this.closeFuture.setClosed();
                "".length();
                this.safeSetSuccess(llllllllllllIllIllIIlllIIlIlIIII);
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            }
            catch (Throwable llllllllllllIllIllIIlllIIlIlIIlI) {
                AbstractChannel.this.closeFuture.setClosed();
                "".length();
                this.safeSetFailure(llllllllllllIllIllIIlllIIlIlIIII, llllllllllllIllIllIIlllIIlIlIIlI);
            }
            try {
                llllllllllllIllIllIIlllIIlIIlllI.failFlushed(AbstractChannel.CLOSED_CHANNEL_EXCEPTION);
                llllllllllllIllIllIIlllIIlIIlllI.close(AbstractChannel.CLOSED_CHANNEL_EXCEPTION);
                if (lIIlIIIllllllIlI(llllllllllllIllIllIIlllIIlIIllll ? 1 : 0) && lIIlIIIllllllIll(AbstractChannel.this.isActive() ? 1 : 0)) {
                    this.invokeLater(new OneTimeTask() {
                        @Override
                        public void run() {
                            AbstractChannel.this.pipeline.fireChannelInactive();
                            "".length();
                        }
                    });
                }
                this.deregister(this.voidPromise());
                "".length();
                if (((0x23 ^ 0x15) & ~(0x24 ^ 0x12)) > 0) {
                    return;
                }
            }
            finally {
                if (lIIlIIIllllllIlI(llllllllllllIllIllIIlllIIlIIllll ? 1 : 0) && lIIlIIIllllllIll(AbstractChannel.this.isActive() ? 1 : 0)) {
                    this.invokeLater(new OneTimeTask() {
                        @Override
                        public void run() {
                            AbstractChannel.this.pipeline.fireChannelInactive();
                            "".length();
                        }
                    });
                }
                this.deregister(this.voidPromise());
            }
        }
        
        protected final void safeSetFailure(final ChannelPromise llllllllllllIllIllIIllIlllllllIl, final Throwable llllllllllllIllIllIIllIlllllllII) {
            if (lIIlIIIllllllIll((llllllllllllIllIllIIllIlllllllIl instanceof VoidChannelPromise) ? 1 : 0) && lIIlIIIllllllIll(llllllllllllIllIllIIllIlllllllIl.tryFailure(llllllllllllIllIllIIllIlllllllII) ? 1 : 0)) {
                AbstractChannel.logger.warn(AbstractUnsafe.llIlIIIlIllIII[AbstractUnsafe.llIlIIIlIllIll[9]], llllllllllllIllIllIIllIlllllllIl, llllllllllllIllIllIIllIlllllllII);
            }
        }
        
        @Override
        public final SocketAddress remoteAddress() {
            return AbstractChannel.this.remoteAddress0();
        }
        
        private static boolean lIIlIIIlllllllII(final int llllllllllllIllIllIIllIllIlIlIII) {
            return llllllllllllIllIllIIllIllIlIlIII < 0;
        }
        
        @Override
        public final void beginRead() {
            if (lIIlIIIllllllIll(AbstractChannel.this.isActive() ? 1 : 0)) {
                return;
            }
            try {
                AbstractChannel.this.doBeginRead();
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
            }
            catch (Exception llllllllllllIllIllIIlllIIIllIlII) {
                this.invokeLater(new OneTimeTask() {
                    @Override
                    public void run() {
                        AbstractChannel.this.pipeline.fireExceptionCaught(llllllllllllIllIllIIlllIIIllIlII);
                        "".length();
                    }
                });
                this.close(this.voidPromise());
            }
        }
        
        @Override
        public final void closeForcibly() {
            try {
                AbstractChannel.this.doClose();
                "".length();
                if (-"  ".length() > 0) {
                    return;
                }
            }
            catch (Exception llllllllllllIllIllIIlllIIlIIIlIl) {
                AbstractChannel.logger.warn(AbstractUnsafe.llIlIIIlIllIII[AbstractUnsafe.llIlIIIlIllIll[6]], llllllllllllIllIllIIlllIIlIIIlIl);
            }
        }
        
        protected final void closeIfClosed() {
            if (lIIlIIIllllllIlI(AbstractChannel.this.isOpen() ? 1 : 0)) {
                return;
            }
            this.close(this.voidPromise());
        }
        
        @Override
        public final ChannelOutboundBuffer outboundBuffer() {
            return this.outboundBuffer;
        }
        
        protected void flush0() {
            if (lIIlIIIllllllIlI(this.inFlush0 ? 1 : 0)) {
                return;
            }
            final ChannelOutboundBuffer llllllllllllIllIllIIlllIIIIlIIlI = this.outboundBuffer;
            if (!lIIlIIIlllllllIl(llllllllllllIllIllIIlllIIIIlIIlI) || lIIlIIIllllllIlI(llllllllllllIllIllIIlllIIIIlIIlI.isEmpty() ? 1 : 0)) {
                return;
            }
            this.inFlush0 = (AbstractUnsafe.llIlIIIlIllIll[1] != 0);
            if (lIIlIIIllllllIll(AbstractChannel.this.isActive() ? 1 : 0)) {
                try {
                    if (lIIlIIIllllllIlI(AbstractChannel.this.isOpen() ? 1 : 0)) {
                        llllllllllllIllIllIIlllIIIIlIIlI.failFlushed(AbstractChannel.NOT_YET_CONNECTED_EXCEPTION);
                        "".length();
                        if (-" ".length() >= "  ".length()) {
                            return;
                        }
                    }
                    else {
                        llllllllllllIllIllIIlllIIIIlIIlI.failFlushed(AbstractChannel.CLOSED_CHANNEL_EXCEPTION);
                    }
                    this.inFlush0 = (AbstractUnsafe.llIlIIIlIllIll[0] != 0);
                    "".length();
                    if (" ".length() < -" ".length()) {
                        return;
                    }
                }
                finally {
                    this.inFlush0 = (AbstractUnsafe.llIlIIIlIllIll[0] != 0);
                }
                return;
            }
            try {
                AbstractChannel.this.doWrite(llllllllllllIllIllIIlllIIIIlIIlI);
                this.inFlush0 = (AbstractUnsafe.llIlIIIlIllIll[0] != 0);
                "".length();
                if ((0x41 ^ 0x45) < (0x9E ^ 0x9A)) {
                    return;
                }
            }
            catch (Throwable llllllllllllIllIllIIlllIIIIlIlII) {
                llllllllllllIllIllIIlllIIIIlIIlI.failFlushed(llllllllllllIllIllIIlllIIIIlIlII);
                if (lIIlIIIllllllIlI((llllllllllllIllIllIIlllIIIIlIlII instanceof IOException) ? 1 : 0) && lIIlIIIllllllIlI(AbstractChannel.this.config().isAutoClose() ? 1 : 0)) {
                    this.close(this.voidPromise());
                }
                this.inFlush0 = (AbstractUnsafe.llIlIIIlIllIll[0] != 0);
                "".length();
                if (null != null) {
                    return;
                }
            }
            finally {
                this.inFlush0 = (AbstractUnsafe.llIlIIIlIllIll[0] != 0);
            }
        }
        
        private static String lIIlIIIlllllIIIl(final String llllllllllllIllIllIIllIlllIllllI, final String llllllllllllIllIllIIllIlllIlllIl) {
            try {
                final SecretKeySpec llllllllllllIllIllIIllIllllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIllIlllIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIllIIllIllllIIIlI = Cipher.getInstance("Blowfish");
                llllllllllllIllIllIIllIllllIIIlI.init(AbstractUnsafe.llIlIIIlIllIll[2], llllllllllllIllIllIIllIllllIIIll);
                return new String(llllllllllllIllIllIIllIllllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIllIlllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIllIIllIllllIIIIl) {
                llllllllllllIllIllIIllIllllIIIIl.printStackTrace();
                return null;
            }
        }
        
        private void register0(final ChannelPromise llllllllllllIllIllIIlllIIlllIlll) {
            try {
                if (!lIIlIIIllllllIlI(llllllllllllIllIllIIlllIIlllIlll.setUncancellable() ? 1 : 0) || lIIlIIIllllllIll(this.ensureOpen(llllllllllllIllIllIIlllIIlllIlll) ? 1 : 0)) {
                    return;
                }
                AbstractChannel.this.doRegister();
                AbstractChannel.this.registered = (boolean)(AbstractUnsafe.llIlIIIlIllIll[1] != 0);
                "".length();
                this.safeSetSuccess(llllllllllllIllIllIIlllIIlllIlll);
                AbstractChannel.this.pipeline.fireChannelRegistered();
                "".length();
                if (lIIlIIIllllllIlI(AbstractChannel.this.isActive() ? 1 : 0)) {
                    AbstractChannel.this.pipeline.fireChannelActive();
                    "".length();
                }
                "".length();
                if ("  ".length() <= -" ".length()) {
                    return;
                }
            }
            catch (Throwable llllllllllllIllIllIIlllIIllllIIl) {
                this.closeForcibly();
                AbstractChannel.this.closeFuture.setClosed();
                "".length();
                this.safeSetFailure(llllllllllllIllIllIIlllIIlllIlll, llllllllllllIllIllIIlllIIllllIIl);
            }
        }
        
        private static String lIIlIIIlllllIIII(final String llllllllllllIllIllIIllIlllIlIIll, final String llllllllllllIllIllIIllIlllIlIIlI) {
            try {
                final SecretKeySpec llllllllllllIllIllIIllIlllIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIllIlllIlIIlI.getBytes(StandardCharsets.UTF_8)), AbstractUnsafe.llIlIIIlIllIll[8]), "DES");
                final Cipher llllllllllllIllIllIIllIlllIlIlIl = Cipher.getInstance("DES");
                llllllllllllIllIllIIllIlllIlIlIl.init(AbstractUnsafe.llIlIIIlIllIll[2], llllllllllllIllIllIIllIlllIlIllI);
                return new String(llllllllllllIllIllIIllIlllIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIllIlllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIllIIllIlllIlIlII) {
                llllllllllllIllIllIIllIlllIlIlII.printStackTrace();
                return null;
            }
        }
        
        @Override
        public final void bind(final SocketAddress llllllllllllIllIllIIlllIIllIlIII, final ChannelPromise llllllllllllIllIllIIlllIIllIIlll) {
            if (!lIIlIIIllllllIlI(llllllllllllIllIllIIlllIIllIIlll.setUncancellable() ? 1 : 0) || lIIlIIIllllllIll(this.ensureOpen(llllllllllllIllIllIIlllIIllIIlll) ? 1 : 0)) {
                return;
            }
            if (lIIlIIIllllllIll(PlatformDependent.isWindows() ? 1 : 0) && lIIlIIIllllllIll(PlatformDependent.isRoot() ? 1 : 0) && lIIlIIIllllllIlI(Boolean.TRUE.equals(AbstractChannel.this.config().getOption(ChannelOption.SO_BROADCAST)) ? 1 : 0) && lIIlIIIllllllIlI((llllllllllllIllIllIIlllIIllIlIII instanceof InetSocketAddress) ? 1 : 0) && lIIlIIIllllllIll(((InetSocketAddress)llllllllllllIllIllIIlllIIllIlIII).getAddress().isAnyLocalAddress() ? 1 : 0)) {
                AbstractChannel.logger.warn(String.valueOf(new StringBuilder().append(AbstractUnsafe.llIlIIIlIllIII[AbstractUnsafe.llIlIIIlIllIll[4]]).append(llllllllllllIllIllIIlllIIllIlIII).append(AbstractUnsafe.llIlIIIlIllIII[AbstractUnsafe.llIlIIIlIllIll[5]])));
            }
            final boolean llllllllllllIllIllIIlllIIllIlIlI = AbstractChannel.this.isActive();
            try {
                AbstractChannel.this.doBind(llllllllllllIllIllIIlllIIllIlIII);
                "".length();
                if (((0xB8 ^ 0xA3 ^ (0x24 ^ 0xF)) & (34 + 131 - 9 + 32 ^ 131 + 139 - 247 + 117 ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            catch (Throwable llllllllllllIllIllIIlllIIllIlllI) {
                this.safeSetFailure(llllllllllllIllIllIIlllIIllIIlll, llllllllllllIllIllIIlllIIllIlllI);
                this.closeIfClosed();
                return;
            }
            if (lIIlIIIllllllIll(llllllllllllIllIllIIlllIIllIlIlI ? 1 : 0) && lIIlIIIllllllIlI(AbstractChannel.this.isActive() ? 1 : 0)) {
                this.invokeLater(new OneTimeTask() {
                    @Override
                    public void run() {
                        AbstractChannel.this.pipeline.fireChannelActive();
                        "".length();
                    }
                });
            }
            this.safeSetSuccess(llllllllllllIllIllIIlllIIllIIlll);
        }
        
        private static boolean lIIlIIIllllllIIl(final Object llllllllllllIllIllIIllIllIlIlllI) {
            return llllllllllllIllIllIIllIllIlIlllI == null;
        }
        
        private void invokeLater(final Runnable llllllllllllIllIllIIllIllllIllll) {
            try {
                AbstractChannel.this.eventLoop().execute(llllllllllllIllIllIIllIllllIllll);
                "".length();
                if ("   ".length() < "  ".length()) {
                    return;
                }
            }
            catch (RejectedExecutionException llllllllllllIllIllIIllIlllllIIll) {
                AbstractChannel.logger.warn(AbstractUnsafe.llIlIIIlIllIII[AbstractUnsafe.llIlIIIlIllIll[10]], llllllllllllIllIllIIllIlllllIIll);
            }
        }
        
        @Override
        public final SocketAddress localAddress() {
            return AbstractChannel.this.localAddress0();
        }
        
        protected AbstractUnsafe() {
            this.outboundBuffer = new ChannelOutboundBuffer(AbstractChannel.this);
        }
        
        @Override
        public final ChannelPromise voidPromise() {
            return AbstractChannel.this.unsafeVoidPromise;
        }
        
        private static boolean lIIlIIIlllllllIl(final Object llllllllllllIllIllIIllIllIllIIII) {
            return llllllllllllIllIllIIllIllIllIIII != null;
        }
        
        private static boolean lIIlIIIllllllllI(final int llllllllllllIllIllIIllIllIllIIll, final int llllllllllllIllIllIIllIllIllIIlI) {
            return llllllllllllIllIllIIllIllIllIIll < llllllllllllIllIllIIllIllIllIIlI;
        }
        
        private static boolean lIIlIIIllllllIll(final int llllllllllllIllIllIIllIllIlIlIlI) {
            return llllllllllllIllIllIIllIllIlIlIlI == 0;
        }
        
        private static boolean lIIlIIIllllllIlI(final int llllllllllllIllIllIIllIllIlIllII) {
            return llllllllllllIllIllIIllIllIlIllII != 0;
        }
        
        protected final boolean ensureOpen(final ChannelPromise llllllllllllIllIllIIlllIIIIIIlll) {
            if (lIIlIIIllllllIlI(AbstractChannel.this.isOpen() ? 1 : 0)) {
                return AbstractUnsafe.llIlIIIlIllIll[1] != 0;
            }
            this.safeSetFailure(llllllllllllIllIllIIlllIIIIIIlll, AbstractChannel.CLOSED_CHANNEL_EXCEPTION);
            return AbstractUnsafe.llIlIIIlIllIll[0] != 0;
        }
        
        private static String lIIlIIIllllIllll(String llllllllllllIllIllIIllIllIlllllI, final String llllllllllllIllIllIIllIllIllllIl) {
            llllllllllllIllIllIIllIllIlllllI = new String(Base64.getDecoder().decode(llllllllllllIllIllIIllIllIlllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIllIIllIlllIIIIIl = new StringBuilder();
            final char[] llllllllllllIllIllIIllIlllIIIIII = llllllllllllIllIllIIllIllIllllIl.toCharArray();
            int llllllllllllIllIllIIllIllIllllll = AbstractUnsafe.llIlIIIlIllIll[0];
            final char llllllllllllIllIllIIllIllIlllIIl = (Object)llllllllllllIllIllIIllIllIlllllI.toCharArray();
            final boolean llllllllllllIllIllIIllIllIlllIII = llllllllllllIllIllIIllIllIlllIIl.length != 0;
            float llllllllllllIllIllIIllIllIllIlll = AbstractUnsafe.llIlIIIlIllIll[0];
            while (lIIlIIIllllllllI((int)llllllllllllIllIllIIllIllIllIlll, llllllllllllIllIllIIllIllIlllIII ? 1 : 0)) {
                final char llllllllllllIllIllIIllIlllIIIlII = llllllllllllIllIllIIllIllIlllIIl[llllllllllllIllIllIIllIllIllIlll];
                llllllllllllIllIllIIllIlllIIIIIl.append((char)(llllllllllllIllIllIIllIlllIIIlII ^ llllllllllllIllIllIIllIlllIIIIII[llllllllllllIllIllIIllIllIllllll % llllllllllllIllIllIIllIlllIIIIII.length]));
                "".length();
                ++llllllllllllIllIllIIllIllIllllll;
                ++llllllllllllIllIllIIllIllIllIlll;
                "".length();
                if ("   ".length() != "   ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIllIIllIlllIIIIIl);
        }
        
        static {
            lIIlIIIllllllIII();
            lIIlIIIlllllIlII();
        }
        
        @Override
        public final void deregister(final ChannelPromise llllllllllllIllIllIIlllIIIlllIll) {
            if (lIIlIIIllllllIll(llllllllllllIllIllIIlllIIIlllIll.setUncancellable() ? 1 : 0)) {
                return;
            }
            if (lIIlIIIllllllIll(AbstractChannel.this.registered ? 1 : 0)) {
                this.safeSetSuccess(llllllllllllIllIllIIlllIIIlllIll);
                return;
            }
            try {
                AbstractChannel.this.doDeregister();
                if (lIIlIIIllllllIlI(AbstractChannel.this.registered ? 1 : 0)) {
                    AbstractChannel.this.registered = (boolean)(AbstractUnsafe.llIlIIIlIllIll[0] != 0);
                    "".length();
                    this.invokeLater(new OneTimeTask() {
                        @Override
                        public void run() {
                            AbstractChannel.this.pipeline.fireChannelUnregistered();
                            "".length();
                        }
                    });
                    this.safeSetSuccess(llllllllllllIllIllIIlllIIIlllIll);
                    "".length();
                    if ((0xE ^ 0xA) == 0x0) {
                        return;
                    }
                }
                else {
                    this.safeSetSuccess(llllllllllllIllIllIIlllIIIlllIll);
                    "".length();
                    if (" ".length() >= (0xE6 ^ 0xB5 ^ (0x4D ^ 0x1A))) {
                        return;
                    }
                }
            }
            catch (Throwable llllllllllllIllIllIIlllIIIllllIl) {
                AbstractChannel.logger.warn(AbstractUnsafe.llIlIIIlIllIII[AbstractUnsafe.llIlIIIlIllIll[7]], llllllllllllIllIllIIlllIIIllllIl);
                if (lIIlIIIllllllIlI(AbstractChannel.this.registered ? 1 : 0)) {
                    AbstractChannel.this.registered = (boolean)(AbstractUnsafe.llIlIIIlIllIll[0] != 0);
                    "".length();
                    this.invokeLater(new OneTimeTask() {
                        @Override
                        public void run() {
                            AbstractChannel.this.pipeline.fireChannelUnregistered();
                            "".length();
                        }
                    });
                    this.safeSetSuccess(llllllllllllIllIllIIlllIIIlllIll);
                    "".length();
                    if (" ".length() <= -" ".length()) {
                        return;
                    }
                }
                else {
                    this.safeSetSuccess(llllllllllllIllIllIIlllIIIlllIll);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
            }
            finally {
                if (lIIlIIIllllllIlI(AbstractChannel.this.registered ? 1 : 0)) {
                    AbstractChannel.this.registered = (boolean)(AbstractUnsafe.llIlIIIlIllIll[0] != 0);
                    "".length();
                    this.invokeLater(new OneTimeTask() {
                        @Override
                        public void run() {
                            AbstractChannel.this.pipeline.fireChannelUnregistered();
                            "".length();
                        }
                    });
                    this.safeSetSuccess(llllllllllllIllIllIIlllIIIlllIll);
                    "".length();
                    if (((0xB ^ 0xD) & ~(0x32 ^ 0x34)) > " ".length()) {
                        return;
                    }
                }
                else {
                    this.safeSetSuccess(llllllllllllIllIllIIlllIIIlllIll);
                }
            }
        }
        
        private static void lIIlIIIllllllIII() {
            (llIlIIIlIllIll = new int[12])[0] = ((0x37 ^ 0x25) & ~(0x38 ^ 0x2A));
            AbstractUnsafe.llIlIIIlIllIll[1] = " ".length();
            AbstractUnsafe.llIlIIIlIllIll[2] = "  ".length();
            AbstractUnsafe.llIlIIIlIllIll[3] = "   ".length();
            AbstractUnsafe.llIlIIIlIllIll[4] = (84 + 150 - 227 + 150 ^ 123 + 140 - 194 + 84);
            AbstractUnsafe.llIlIIIlIllIll[5] = (0xFE ^ 0xAC ^ (0xCE ^ 0x99));
            AbstractUnsafe.llIlIIIlIllIll[6] = (110 + 50 - 78 + 83 ^ 105 + 120 - 170 + 108);
            AbstractUnsafe.llIlIIIlIllIll[7] = (0x6B ^ 0x6C);
            AbstractUnsafe.llIlIIIlIllIll[8] = (176 + 52 - 220 + 178 ^ 144 + 102 - 175 + 107);
            AbstractUnsafe.llIlIIIlIllIll[9] = (0x98 ^ 0x91);
            AbstractUnsafe.llIlIIIlIllIll[10] = (0x93 ^ 0x99);
            AbstractUnsafe.llIlIIIlIllIll[11] = (0x9E ^ 0x95);
        }
        
        @Override
        public final void disconnect(final ChannelPromise llllllllllllIllIllIIlllIIlIllIll) {
            if (lIIlIIIllllllIll(llllllllllllIllIllIIlllIIlIllIll.setUncancellable() ? 1 : 0)) {
                return;
            }
            final boolean llllllllllllIllIllIIlllIIlIlllIl = AbstractChannel.this.isActive();
            try {
                AbstractChannel.this.doDisconnect();
                "".length();
                if (-(0x5E ^ 0x5A) > 0) {
                    return;
                }
            }
            catch (Throwable llllllllllllIllIllIIlllIIllIIIII) {
                this.safeSetFailure(llllllllllllIllIllIIlllIIlIllIll, llllllllllllIllIllIIlllIIllIIIII);
                this.closeIfClosed();
                return;
            }
            if (lIIlIIIllllllIlI(llllllllllllIllIllIIlllIIlIlllIl ? 1 : 0) && lIIlIIIllllllIll(AbstractChannel.this.isActive() ? 1 : 0)) {
                this.invokeLater(new OneTimeTask() {
                    @Override
                    public void run() {
                        AbstractChannel.this.pipeline.fireChannelInactive();
                        "".length();
                    }
                });
            }
            this.safeSetSuccess(llllllllllllIllIllIIlllIIlIllIll);
            this.closeIfClosed();
        }
    }
}
