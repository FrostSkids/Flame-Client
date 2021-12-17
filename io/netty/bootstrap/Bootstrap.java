// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.bootstrap;

import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.channel.ChannelFutureListener;
import java.util.Iterator;
import io.netty.channel.ChannelPipeline;
import io.netty.util.AttributeKey;
import io.netty.channel.ChannelOption;
import java.util.Map;
import io.netty.channel.ChannelHandler;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.net.InetSocketAddress;
import io.netty.channel.ChannelPromise;
import io.netty.channel.ChannelFuture;
import java.net.SocketAddress;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.channel.Channel;

public final class Bootstrap extends AbstractBootstrap<Bootstrap, Channel>
{
    private static final /* synthetic */ String[] lllIIIIIIlllII;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ int[] lllIIIIIlIIIlI;
    private volatile /* synthetic */ SocketAddress remoteAddress;
    
    private Bootstrap(final Bootstrap llllllllllllIllIIIlIIIIIIllllIIl) {
        super(llllllllllllIllIIIlIIIIIIllllIIl);
        this.remoteAddress = llllllllllllIllIIIlIIIIIIllllIIl.remoteAddress;
    }
    
    public ChannelFuture connect(final SocketAddress llllllllllllIllIIIlIIIIIIIlllIll, final SocketAddress llllllllllllIllIIIlIIIIIIIllllIl) {
        if (lIIlllIIIIIlIIIl(llllllllllllIllIIIlIIIIIIIlllIll)) {
            throw new NullPointerException(Bootstrap.lllIIIIIIlllII[Bootstrap.lllIIIIIlIIIlI[2]]);
        }
        this.validate();
        "".length();
        return this.doConnect(llllllllllllIllIIIlIIIIIIIlllIll, llllllllllllIllIIIlIIIIIIIllllIl);
    }
    
    public ChannelFuture connect(final String llllllllllllIllIIIlIIIIIIlIlIIll, final int llllllllllllIllIIIlIIIIIIlIlIlIl) {
        return this.connect(new InetSocketAddress(llllllllllllIllIIIlIIIIIIlIlIIll, llllllllllllIllIIIlIIIIIIlIlIlIl));
    }
    
    private static void lIIlllIIIIIlIIII() {
        (lllIIIIIlIIIlI = new int[10])[0] = ((0xA5 ^ 0x9C) & ~(0x6A ^ 0x53));
        Bootstrap.lllIIIIIlIIIlI[1] = " ".length();
        Bootstrap.lllIIIIIlIIIlI[2] = "  ".length();
        Bootstrap.lllIIIIIlIIIlI[3] = "   ".length();
        Bootstrap.lllIIIIIlIIIlI[4] = (0x6D ^ 0x69);
        Bootstrap.lllIIIIIlIIIlI[5] = (0x8E ^ 0xC3 ^ (0xD4 ^ 0x9C));
        Bootstrap.lllIIIIIlIIIlI[6] = (0x14 ^ 0x12);
        Bootstrap.lllIIIIIlIIIlI[7] = (0xB5 ^ 0x9C);
        Bootstrap.lllIIIIIlIIIlI[8] = (148 + 95 - 157 + 105 ^ 48 + 43 + 81 + 12);
        Bootstrap.lllIIIIIlIIIlI[9] = (0xA3 ^ 0xAB);
    }
    
    private static boolean lIIlllIIIIIlIlIl(final int llllllllllllIllIIIIllllllIlIIIlI, final int llllllllllllIllIIIIllllllIlIIIIl) {
        return llllllllllllIllIIIIllllllIlIIIlI < llllllllllllIllIIIIllllllIlIIIIl;
    }
    
    private static String lIIllIllllllllIl(final String llllllllllllIllIIIIlllllllIIllIl, final String llllllllllllIllIIIIlllllllIIlllI) {
        try {
            final SecretKeySpec llllllllllllIllIIIIlllllllIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIlllllllIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIIlllllllIlIIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIIlllllllIlIIIl.init(Bootstrap.lllIIIIIlIIIlI[2], llllllllllllIllIIIIlllllllIlIIlI);
            return new String(llllllllllllIllIIIIlllllllIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIlllllllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIlllllllIlIIII) {
            llllllllllllIllIIIIlllllllIlIIII.printStackTrace();
            return null;
        }
    }
    
    public Bootstrap remoteAddress(final SocketAddress llllllllllllIllIIIlIIIIIIlllIIll) {
        this.remoteAddress = llllllllllllIllIIIlIIIIIIlllIIll;
        return this;
    }
    
    public ChannelFuture connect(final SocketAddress llllllllllllIllIIIlIIIIIIlIIIlIl) {
        if (lIIlllIIIIIlIIIl(llllllllllllIllIIIlIIIIIIlIIIlIl)) {
            throw new NullPointerException(Bootstrap.lllIIIIIIlllII[Bootstrap.lllIIIIIlIIIlI[1]]);
        }
        this.validate();
        "".length();
        return this.doConnect(llllllllllllIllIIIlIIIIIIlIIIlIl, this.localAddress());
    }
    
    private static String lIIllIllllllllII(String llllllllllllIllIIIIllllllIlIllIl, final String llllllllllllIllIIIIllllllIllIIIl) {
        llllllllllllIllIIIIllllllIlIllIl = new String(Base64.getDecoder().decode(llllllllllllIllIIIIllllllIlIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIllllllIllIIII = new StringBuilder();
        final char[] llllllllllllIllIIIIllllllIlIllll = llllllllllllIllIIIIllllllIllIIIl.toCharArray();
        int llllllllllllIllIIIIllllllIlIlllI = Bootstrap.lllIIIIIlIIIlI[0];
        final long llllllllllllIllIIIIllllllIlIlIII = (Object)llllllllllllIllIIIIllllllIlIllIl.toCharArray();
        final Exception llllllllllllIllIIIIllllllIlIIlll = (Exception)llllllllllllIllIIIIllllllIlIlIII.length;
        double llllllllllllIllIIIIllllllIlIIllI = Bootstrap.lllIIIIIlIIIlI[0];
        while (lIIlllIIIIIlIlIl((int)llllllllllllIllIIIIllllllIlIIllI, (int)llllllllllllIllIIIIllllllIlIIlll)) {
            final char llllllllllllIllIIIIllllllIllIIll = llllllllllllIllIIIIllllllIlIlIII[llllllllllllIllIIIIllllllIlIIllI];
            llllllllllllIllIIIIllllllIllIIII.append((char)(llllllllllllIllIIIIllllllIllIIll ^ llllllllllllIllIIIIllllllIlIllll[llllllllllllIllIIIIllllllIlIlllI % llllllllllllIllIIIIllllllIlIllll.length]));
            "".length();
            ++llllllllllllIllIIIIllllllIlIlllI;
            ++llllllllllllIllIIIIllllllIlIIllI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIllllllIllIIII);
    }
    
    private static String lIIllIlllllllIll(final String llllllllllllIllIIIIlllllllIIIIlI, final String llllllllllllIllIIIIllllllIllllll) {
        try {
            final SecretKeySpec llllllllllllIllIIIIlllllllIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIllllllIllllll.getBytes(StandardCharsets.UTF_8)), Bootstrap.lllIIIIIlIIIlI[9]), "DES");
            final Cipher llllllllllllIllIIIIlllllllIIIlII = Cipher.getInstance("DES");
            llllllllllllIllIIIIlllllllIIIlII.init(Bootstrap.lllIIIIIlIIIlI[2], llllllllllllIllIIIIlllllllIIIlIl);
            return new String(llllllllllllIllIIIIlllllllIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIlllllllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIlllllllIIIIll) {
            llllllllllllIllIIIIlllllllIIIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlllIIIIIlIIIl(final Object llllllllllllIllIIIIllllllIIlllIl) {
        return llllllllllllIllIIIIllllllIIlllIl == null;
    }
    
    @Override
    public String toString() {
        if (lIIlllIIIIIlIIIl(this.remoteAddress)) {
            return super.toString();
        }
        final StringBuilder llllllllllllIllIIIIlllllllllIIIl = new StringBuilder(super.toString());
        llllllllllllIllIIIIlllllllllIIIl.setLength(llllllllllllIllIIIIlllllllllIIIl.length() - Bootstrap.lllIIIIIlIIIlI[1]);
        llllllllllllIllIIIIlllllllllIIIl.append(Bootstrap.lllIIIIIIlllII[Bootstrap.lllIIIIIlIIIlI[6]]);
        "".length();
        llllllllllllIllIIIIlllllllllIIIl.append(this.remoteAddress);
        "".length();
        llllllllllllIllIIIIlllllllllIIIl.append((char)Bootstrap.lllIIIIIlIIIlI[7]);
        "".length();
        return String.valueOf(llllllllllllIllIIIIlllllllllIIIl);
    }
    
    @Override
    public Bootstrap validate() {
        super.validate();
        "".length();
        if (lIIlllIIIIIlIIIl(this.handler())) {
            throw new IllegalStateException(Bootstrap.lllIIIIIIlllII[Bootstrap.lllIIIIIlIIIlI[5]]);
        }
        return this;
    }
    
    private static void lIIlllIIIIIIlIll() {
        (lllIIIIIIlllII = new String[Bootstrap.lllIIIIIlIIIlI[8]])[Bootstrap.lllIIIIIlIIIlI[0]] = lIIllIlllllllIll("n85MS7KYsqxbUs7lTcJ4m30jykGVxRuD", "WqlYo");
        Bootstrap.lllIIIIIIlllII[Bootstrap.lllIIIIIlIIIlI[1]] = lIIllIllllllllII("FS8vHjkCCyYVPwI5MQ==", "gJBqM");
        Bootstrap.lllIIIIIIlllII[Bootstrap.lllIIIIIlIIIlI[2]] = lIIllIllllllllIl("Ibo2qiGlwX+uuHeOUQqjzQ==", "GLoRw");
        Bootstrap.lllIIIIIIlllII[Bootstrap.lllIIIIIlIIIlI[3]] = lIIllIllllllllIl("xb/T7Ra2DpNppQ1wwMvLX0pwg4+QB6kWXDWa/IqvAxY=", "CzRAk");
        Bootstrap.lllIIIIIIlllII[Bootstrap.lllIIIIIlIIIlI[4]] = lIIllIlllllllIll("Z5/MEGRgJKc/jqZ4Kz/08JBdBJf83PQFmPvi05XhUVa5cy43IrnoWQ==", "enjpl");
        Bootstrap.lllIIIIIIlllII[Bootstrap.lllIIIIIlIIIlI[5]] = lIIllIllllllllIl("zh/u/nVcMPDumiFweVMOCg==", "tOcGg");
        Bootstrap.lllIIIIIIlllII[Bootstrap.lllIIIIIlIIIlI[6]] = lIIllIlllllllIll("xNiXLxhjeVuMw3+rxCUj/mOsApOPopGV", "kPpiM");
    }
    
    private static boolean lIIlllIIIIIlIIlI(final Object llllllllllllIllIIIIllllllIIlllll) {
        return llllllllllllIllIIIIllllllIIlllll != null;
    }
    
    private static boolean lIIlllIIIIIlIIll(final int llllllllllllIllIIIIllllllIIllIll) {
        return llllllllllllIllIIIIllllllIIllIll != 0;
    }
    
    public ChannelFuture connect() {
        this.validate();
        "".length();
        final SocketAddress llllllllllllIllIIIlIIIIIIlIlllIl = this.remoteAddress;
        if (lIIlllIIIIIlIIIl(llllllllllllIllIIIlIIIIIIlIlllIl)) {
            throw new IllegalStateException(Bootstrap.lllIIIIIIlllII[Bootstrap.lllIIIIIlIIIlI[0]]);
        }
        return this.doConnect(llllllllllllIllIIIlIIIIIIlIlllIl, this.localAddress());
    }
    
    public Bootstrap remoteAddress(final String llllllllllllIllIIIlIIIIIIllIlllI, final int llllllllllllIllIIIlIIIIIIllIllIl) {
        this.remoteAddress = new InetSocketAddress(llllllllllllIllIIIlIIIIIIllIlllI, llllllllllllIllIIIlIIIIIIllIllIl);
        return this;
    }
    
    public Bootstrap remoteAddress(final InetAddress llllllllllllIllIIIlIIIIIIllIIIlI, final int llllllllllllIllIIIlIIIIIIllIIlII) {
        this.remoteAddress = new InetSocketAddress(llllllllllllIllIIIlIIIIIIllIIIlI, llllllllllllIllIIIlIIIIIIllIIlII);
        return this;
    }
    
    public Bootstrap() {
    }
    
    static {
        lIIlllIIIIIlIIII();
        lIIlllIIIIIIlIll();
        logger = InternalLoggerFactory.getInstance(Bootstrap.class);
    }
    
    public ChannelFuture connect(final InetAddress llllllllllllIllIIIlIIIIIIlIIllIl, final int llllllllllllIllIIIlIIIIIIlIIllII) {
        return this.connect(new InetSocketAddress(llllllllllllIllIIIlIIIIIIlIIllIl, llllllllllllIllIIIlIIIIIIlIIllII));
    }
    
    @Override
    void init(final Channel llllllllllllIllIIIlIIIIIIIIIIIll) throws Exception {
        final ChannelPipeline pipeline;
        final ChannelPipeline llllllllllllIllIIIlIIIIIIIIIIlll = pipeline = llllllllllllIllIIIlIIIIIIIIIIIll.pipeline();
        final ChannelHandler[] array = new ChannelHandler[Bootstrap.lllIIIIIlIIIlI[1]];
        array[Bootstrap.lllIIIIIlIIIlI[0]] = this.handler();
        pipeline.addLast(array);
        "".length();
        final Map<ChannelOption<?>, Object> llllllllllllIllIIIlIIIIIIIIIIllI = this.options();
        synchronized (llllllllllllIllIIIlIIIIIIIIIIllI) {
            final Iterator llllllllllllIllIIIlIIIIIIIIIllII = llllllllllllIllIIIlIIIIIIIIIIllI.entrySet().iterator();
            while (lIIlllIIIIIlIIll(llllllllllllIllIIIlIIIIIIIIIllII.hasNext() ? 1 : 0)) {
                final Map.Entry<ChannelOption<?>, Object> llllllllllllIllIIIlIIIIIIIIIllIl = llllllllllllIllIIIlIIIIIIIIIllII.next();
                try {
                    if (lIIlllIIIIIlIlII(llllllllllllIllIIIlIIIIIIIIIIIll.config().setOption(llllllllllllIllIIIlIIIIIIIIIllIl.getKey(), llllllllllllIllIIIlIIIIIIIIIllIl.getValue()) ? 1 : 0)) {
                        Bootstrap.logger.warn(String.valueOf(new StringBuilder().append(Bootstrap.lllIIIIIIlllII[Bootstrap.lllIIIIIlIIIlI[3]]).append(llllllllllllIllIIIlIIIIIIIIIllIl)));
                    }
                    "".length();
                    if ((0x83 ^ 0x86) == 0x0) {
                        return;
                    }
                }
                catch (Throwable llllllllllllIllIIIlIIIIIIIIIlllI) {
                    Bootstrap.logger.warn(String.valueOf(new StringBuilder().append(Bootstrap.lllIIIIIIlllII[Bootstrap.lllIIIIIlIIIlI[4]]).append(llllllllllllIllIIIlIIIIIIIIIIIll)), llllllllllllIllIIIlIIIIIIIIIlllI);
                }
                "".length();
                if (((0x96 ^ 0xB1) & ~(0x24 ^ 0x3)) >= "  ".length()) {
                    return;
                }
            }
            // monitorexit(llllllllllllIllIIIlIIIIIIIIIIllI)
            "".length();
            if (-" ".length() > " ".length()) {
                return;
            }
        }
        final Map<AttributeKey<?>, Object> llllllllllllIllIIIlIIIIIIIIIIlIl = this.attrs();
        synchronized (llllllllllllIllIIIlIIIIIIIIIIlIl) {
            final Iterator llllllllllllIllIIIlIIIIIIIIIlIlI = llllllllllllIllIIIlIIIIIIIIIIlIl.entrySet().iterator();
            while (lIIlllIIIIIlIIll(llllllllllllIllIIIlIIIIIIIIIlIlI.hasNext() ? 1 : 0)) {
                final Map.Entry<AttributeKey<?>, Object> llllllllllllIllIIIlIIIIIIIIIlIll = llllllllllllIllIIIlIIIIIIIIIlIlI.next();
                llllllllllllIllIIIlIIIIIIIIIIIll.attr(llllllllllllIllIIIlIIIIIIIIIlIll.getKey()).set(llllllllllllIllIIIlIIIIIIIIIlIll.getValue());
                "".length();
                if (-(0x15 ^ 0x10 ^ " ".length()) >= 0) {
                    return;
                }
            }
            // monitorexit(llllllllllllIllIIIlIIIIIIIIIIlIl)
            "".length();
            if ("  ".length() <= " ".length()) {
                return;
            }
        }
    }
    
    private static boolean lIIlllIIIIIlIlII(final int llllllllllllIllIIIIllllllIIllIIl) {
        return llllllllllllIllIIIIllllllIIllIIl == 0;
    }
    
    private static void doConnect0(final ChannelFuture llllllllllllIllIIIlIIIIIIIlIIIlI, final Channel llllllllllllIllIIIlIIIIIIIlIIIIl, final SocketAddress llllllllllllIllIIIlIIIIIIIIllIll, final SocketAddress llllllllllllIllIIIlIIIIIIIIlllll, final ChannelPromise llllllllllllIllIIIlIIIIIIIIllllI) {
        llllllllllllIllIIIlIIIIIIIlIIIIl.eventLoop().execute(new Runnable() {
            private static boolean lIlIIlIIIIIIIlIl(final int llllllllllllIlIllIIllllIlIllIlII) {
                return llllllllllllIlIllIIllllIlIllIlII != 0;
            }
            
            private static boolean lIlIIlIIIIIIIllI(final Object llllllllllllIlIllIIllllIlIllIllI) {
                return llllllllllllIlIllIIllllIlIllIllI == null;
            }
            
            @Override
            public void run() {
                if (lIlIIlIIIIIIIlIl(llllllllllllIllIIIlIIIIIIIlIIIlI.isSuccess() ? 1 : 0)) {
                    if (lIlIIlIIIIIIIllI(llllllllllllIllIIIlIIIIIIIIlllll)) {
                        llllllllllllIllIIIlIIIIIIIlIIIIl.connect(llllllllllllIllIIIlIIIIIIIIllIll, llllllllllllIllIIIlIIIIIIIIllllI);
                        "".length();
                        "".length();
                        if (((0xE5 ^ 0xA3) & ~(0x81 ^ 0xC7)) > "   ".length()) {
                            return;
                        }
                    }
                    else {
                        llllllllllllIllIIIlIIIIIIIlIIIIl.connect(llllllllllllIllIIIlIIIIIIIIllIll, llllllllllllIllIIIlIIIIIIIIlllll, llllllllllllIllIIIlIIIIIIIIllllI);
                        "".length();
                    }
                    llllllllllllIllIIIlIIIIIIIIllllI.addListener((GenericFutureListener<? extends Future<? super Void>>)ChannelFutureListener.CLOSE_ON_FAILURE);
                    "".length();
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    llllllllllllIllIIIlIIIIIIIIllllI.setFailure(llllllllllllIllIIIlIIIIIIIlIIIlI.cause());
                    "".length();
                }
            }
        });
    }
    
    private ChannelFuture doConnect(final SocketAddress llllllllllllIllIIIlIIIIIIIllIIlI, final SocketAddress llllllllllllIllIIIlIIIIIIIlIlIll) {
        final ChannelFuture llllllllllllIllIIIlIIIIIIIllIIII = this.initAndRegister();
        final Channel llllllllllllIllIIIlIIIIIIIlIllll = llllllllllllIllIIIlIIIIIIIllIIII.channel();
        if (lIIlllIIIIIlIIlI(llllllllllllIllIIIlIIIIIIIllIIII.cause())) {
            return llllllllllllIllIIIlIIIIIIIllIIII;
        }
        final ChannelPromise llllllllllllIllIIIlIIIIIIIlIlllI = llllllllllllIllIIIlIIIIIIIlIllll.newPromise();
        if (lIIlllIIIIIlIIll(llllllllllllIllIIIlIIIIIIIllIIII.isDone() ? 1 : 0)) {
            doConnect0(llllllllllllIllIIIlIIIIIIIllIIII, llllllllllllIllIIIlIIIIIIIlIllll, llllllllllllIllIIIlIIIIIIIllIIlI, llllllllllllIllIIIlIIIIIIIlIlIll, llllllllllllIllIIIlIIIIIIIlIlllI);
            "".length();
            if ("   ".length() > "   ".length()) {
                return null;
            }
        }
        else {
            llllllllllllIllIIIlIIIIIIIllIIII.addListener((GenericFutureListener<? extends Future<? super Void>>)new ChannelFutureListener() {
                @Override
                public void operationComplete(final ChannelFuture lllllllllllllIIIllIlIIlIlIIlIlII) throws Exception {
                    doConnect0(llllllllllllIllIIIlIIIIIIIllIIII, llllllllllllIllIIIlIIIIIIIlIllll, llllllllllllIllIIIlIIIIIIIllIIlI, llllllllllllIllIIIlIIIIIIIlIlIll, llllllllllllIllIIIlIIIIIIIlIlllI);
                }
            });
            "".length();
        }
        return llllllllllllIllIIIlIIIIIIIlIlllI;
    }
    
    @Override
    public Bootstrap clone() {
        return new Bootstrap(this);
    }
}
