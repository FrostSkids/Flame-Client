// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.bootstrap;

import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.concurrent.Future;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import java.util.concurrent.TimeUnit;
import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.internal.StringUtil;
import java.util.LinkedHashMap;
import java.util.Iterator;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.Channel;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.AttributeKey;
import io.netty.channel.ChannelOption;
import java.util.Map;
import io.netty.channel.ServerChannel;

public final class ServerBootstrap extends AbstractBootstrap<ServerBootstrap, ServerChannel>
{
    private final /* synthetic */ Map<ChannelOption<?>, Object> childOptions;
    private final /* synthetic */ Map<AttributeKey<?>, Object> childAttrs;
    private static final /* synthetic */ int[] lIIIIlIIIlllIl;
    private static final /* synthetic */ String[] lIIIIIlllllllI;
    private static final /* synthetic */ InternalLogger logger;
    private volatile /* synthetic */ EventLoopGroup childGroup;
    private volatile /* synthetic */ ChannelHandler childHandler;
    
    public ServerBootstrap childHandler(final ChannelHandler lllllllllllllIlIIllIIllllIIllIIl) {
        if (lIlllIIIIlIIIll(lllllllllllllIlIIllIIllllIIllIIl)) {
            throw new NullPointerException(ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[4]]);
        }
        this.childHandler = lllllllllllllIlIIllIIllllIIllIIl;
        return this;
    }
    
    private static boolean lIlllIIIIlIIlII(final Object lllllllllllllIlIIllIIIlllIIIllIl) {
        return lllllllllllllIlIIllIIIlllIIIllIl != null;
    }
    
    private static String lIllIlllllIIIll(final String lllllllllllllIlIIllIIIlllIlIlIIl, final String lllllllllllllIlIIllIIIlllIlIlIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIllIIIlllIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIIIlllIlIlIII.getBytes(StandardCharsets.UTF_8)), ServerBootstrap.lIIIIlIIIlllIl[8]), "DES");
            final Cipher lllllllllllllIlIIllIIIlllIlIlIll = Cipher.getInstance("DES");
            lllllllllllllIlIIllIIIlllIlIlIll.init(ServerBootstrap.lIIIIlIIIlllIl[2], lllllllllllllIlIIllIIIlllIlIllII);
            return new String(lllllllllllllIlIIllIIIlllIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIIIlllIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllIIIlllIlIlIlI) {
            lllllllllllllIlIIllIIIlllIlIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlllIIIIlIIIll(final Object lllllllllllllIlIIllIIIlllIIIlIll) {
        return lllllllllllllIlIIllIIIlllIIIlIll == null;
    }
    
    public <T> ServerBootstrap childAttr(final AttributeKey<T> lllllllllllllIlIIllIIllllIlIIIll, final T lllllllllllllIlIIllIIllllIIlllll) {
        if (lIlllIIIIlIIIll(lllllllllllllIlIIllIIllllIlIIIll)) {
            throw new NullPointerException(ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[3]]);
        }
        if (lIlllIIIIlIIIll(lllllllllllllIlIIllIIllllIIlllll)) {
            this.childAttrs.remove(lllllllllllllIlIIllIIllllIlIIIll);
            "".length();
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            this.childAttrs.put(lllllllllllllIlIIllIIllllIlIIIll, lllllllllllllIlIIllIIllllIIlllll);
            "".length();
        }
        return this;
    }
    
    public EventLoopGroup childGroup() {
        return this.childGroup;
    }
    
    public <T> ServerBootstrap childOption(final ChannelOption<T> lllllllllllllIlIIllIIllllIlIllll, final T lllllllllllllIlIIllIIllllIlIlIll) {
        if (lIlllIIIIlIIIll(lllllllllllllIlIIllIIllllIlIllll)) {
            throw new NullPointerException(ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[2]]);
        }
        if (lIlllIIIIlIIIll(lllllllllllllIlIIllIIllllIlIlIll)) {
            synchronized (this.childOptions) {
                this.childOptions.remove(lllllllllllllIlIIllIIllllIlIllll);
                "".length();
                // monitorexit(this.childOptions)
                "".length();
                if (-" ".length() == "  ".length()) {
                    return null;
                }
            }
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        else {
            synchronized (this.childOptions) {
                this.childOptions.put(lllllllllllllIlIIllIIllllIlIllll, lllllllllllllIlIIllIIllllIlIlIll);
                "".length();
                // monitorexit(this.childOptions)
                "".length();
                if (-(81 + 68 - 142 + 144 ^ 58 + 45 - 1 + 45) > 0) {
                    return null;
                }
            }
        }
        return this;
    }
    
    static {
        lIlllIIIIlIIIlI();
        lIllIlllllIllIl();
        logger = InternalLoggerFactory.getInstance(ServerBootstrap.class);
    }
    
    private static boolean lIlllIIIIlIIlIl(final int lllllllllllllIlIIllIIIlllIIIlIIl) {
        return lllllllllllllIlIIllIIIlllIIIlIIl != 0;
    }
    
    public ServerBootstrap group(final EventLoopGroup lllllllllllllIlIIllIIllllIlllIII, final EventLoopGroup lllllllllllllIlIIllIIllllIllIlll) {
        super.group(lllllllllllllIlIIllIIllllIlllIII);
        "".length();
        if (lIlllIIIIlIIIll(lllllllllllllIlIIllIIllllIllIlll)) {
            throw new NullPointerException(ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[0]]);
        }
        if (lIlllIIIIlIIlII(this.childGroup)) {
            throw new IllegalStateException(ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[1]]);
        }
        this.childGroup = lllllllllllllIlIIllIIllllIllIlll;
        return this;
    }
    
    @Override
    public ServerBootstrap validate() {
        super.validate();
        "".length();
        if (lIlllIIIIlIIIll(this.childHandler)) {
            throw new IllegalStateException(ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[5]]);
        }
        if (lIlllIIIIlIIIll(this.childGroup)) {
            ServerBootstrap.logger.warn(ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[6]]);
            this.childGroup = this.group();
        }
        return this;
    }
    
    @Override
    void init(final Channel lllllllllllllIlIIllIIlllIlllllII) throws Exception {
        final Map<ChannelOption<?>, Object> lllllllllllllIlIIllIIllllIIIIlII = this.options();
        synchronized (lllllllllllllIlIIllIIllllIIIIlII) {
            lllllllllllllIlIIllIIlllIlllllII.config().setOptions(lllllllllllllIlIIllIIllllIIIIlII);
            "".length();
            // monitorexit(lllllllllllllIlIIllIIllllIIIIlII)
            "".length();
            if ((0x91 ^ 0x94) == 0x0) {
                return;
            }
        }
        final Map<AttributeKey<?>, Object> lllllllllllllIlIIllIIllllIIIIIll = this.attrs();
        synchronized (lllllllllllllIlIIllIIllllIIIIIll) {
            final Iterator lllllllllllllIlIIllIIllllIIIIlll = lllllllllllllIlIIllIIllllIIIIIll.entrySet().iterator();
            while (lIlllIIIIlIIlIl(lllllllllllllIlIIllIIllllIIIIlll.hasNext() ? 1 : 0)) {
                final Map.Entry<AttributeKey<?>, Object> lllllllllllllIlIIllIIllllIIIlIII = lllllllllllllIlIIllIIllllIIIIlll.next();
                final AttributeKey<Object> lllllllllllllIlIIllIIllllIIIlIIl = lllllllllllllIlIIllIIllllIIIlIII.getKey();
                lllllllllllllIlIIllIIlllIlllllII.attr(lllllllllllllIlIIllIIllllIIIlIIl).set(lllllllllllllIlIIllIIllllIIIlIII.getValue());
                "".length();
                if (((11 + 136 + 11 + 29 ^ 20 + 115 - 100 + 97) & (0xCB ^ 0x83 ^ (0xFB ^ 0x8C) ^ -" ".length())) <= -" ".length()) {
                    return;
                }
            }
            // monitorexit(lllllllllllllIlIIllIIllllIIIIIll)
            "".length();
            if ("   ".length() > (0x48 ^ 0x4C)) {
                return;
            }
        }
        final ChannelPipeline lllllllllllllIlIIllIIllllIIIIIlI = lllllllllllllIlIIllIIlllIlllllII.pipeline();
        if (lIlllIIIIlIIlII(this.handler())) {
            final ChannelPipeline channelPipeline = lllllllllllllIlIIllIIllllIIIIIlI;
            final ChannelHandler[] array = new ChannelHandler[ServerBootstrap.lIIIIlIIIlllIl[1]];
            array[ServerBootstrap.lIIIIlIIIlllIl[0]] = this.handler();
            channelPipeline.addLast(array);
            "".length();
        }
        final EventLoopGroup lllllllllllllIlIIllIIllllIIIIIIl = this.childGroup;
        final ChannelHandler lllllllllllllIlIIllIIllllIIIIIII = this.childHandler;
        final Map.Entry<ChannelOption<?>, Object>[] lllllllllllllIlIIllIIlllIlllllll;
        synchronized (this.childOptions) {
            lllllllllllllIlIIllIIlllIlllllll = this.childOptions.entrySet().toArray(newOptionArray(this.childOptions.size()));
            // monitorexit(this.childOptions)
            "".length();
            if (" ".length() != " ".length()) {
                return;
            }
        }
        final Map.Entry<AttributeKey<?>, Object>[] lllllllllllllIlIIllIIlllIllllllI;
        synchronized (this.childAttrs) {
            lllllllllllllIlIIllIIlllIllllllI = this.childAttrs.entrySet().toArray(newAttrArray(this.childAttrs.size()));
            // monitorexit(this.childAttrs)
            "".length();
            if ((0x19 ^ 0x1D) <= 0) {
                return;
            }
        }
        final ChannelPipeline channelPipeline2 = lllllllllllllIlIIllIIllllIIIIIlI;
        final ChannelHandler[] array2 = new ChannelHandler[ServerBootstrap.lIIIIlIIIlllIl[1]];
        array2[ServerBootstrap.lIIIIlIIIlllIl[0]] = new ChannelInitializer<Channel>() {
            private static final /* synthetic */ int[] lIIIIIIlllIIIl;
            
            public void initChannel(final Channel lllllllllllllIlIlIIIIIIllIIIIllI) throws Exception {
                final ChannelPipeline pipeline = lllllllllllllIlIlIIIIIIllIIIIllI.pipeline();
                final ChannelHandler[] array = new ChannelHandler[ServerBootstrap$1.lIIIIIIlllIIIl[0]];
                array[ServerBootstrap$1.lIIIIIIlllIIIl[1]] = new ServerBootstrapAcceptor(lllllllllllllIlIIllIIllllIIIIIIl, lllllllllllllIlIIllIIllllIIIIIII, lllllllllllllIlIIllIIlllIlllllll, lllllllllllllIlIIllIIlllIllllllI);
                pipeline.addLast(array);
                "".length();
            }
            
            static {
                lIllIlIIllIllII();
            }
            
            private static void lIllIlIIllIllII() {
                (lIIIIIIlllIIIl = new int[2])[0] = " ".length();
                ServerBootstrap$1.lIIIIIIlllIIIl[1] = ((0x4F ^ 0x7F ^ (0x42 ^ 0x34)) & (0x77 ^ 0x30 ^ " ".length() ^ -" ".length()));
            }
        };
        channelPipeline2.addLast(array2);
        "".length();
    }
    
    @Override
    public ServerBootstrap group(final EventLoopGroup lllllllllllllIlIIllIIlllllIIIIlI) {
        return this.group(lllllllllllllIlIIllIIlllllIIIIlI, lllllllllllllIlIIllIIlllllIIIIlI);
    }
    
    private static boolean lIlllIIIIlIIllI(final int lllllllllllllIlIIllIIIlllIIIIlll) {
        return lllllllllllllIlIIllIIIlllIIIIlll == 0;
    }
    
    private static boolean lIlllIIIIlIlIII(final int lllllllllllllIlIIllIIIlllIIlIIII, final int lllllllllllllIlIIllIIIlllIIIllll) {
        return lllllllllllllIlIIllIIIlllIIlIIII < lllllllllllllIlIIllIIIlllIIIllll;
    }
    
    @Override
    public ServerBootstrap clone() {
        return new ServerBootstrap(this);
    }
    
    private static String lIllIlllllIlIII(String lllllllllllllIlIIllIIIlllIlllIIl, final String lllllllllllllIlIIllIIlllIIllllll) {
        lllllllllllllIlIIllIIIlllIlllIIl = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIllIIIlllIlllIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIllIIlllIIlllllI = new StringBuilder();
        final char[] lllllllllllllIlIIllIIIlllIlllIll = lllllllllllllIlIIllIIlllIIllllll.toCharArray();
        int lllllllllllllIlIIllIIIlllIlllIlI = ServerBootstrap.lIIIIlIIIlllIl[0];
        final long lllllllllllllIlIIllIIIlllIllIlII = (Object)((String)lllllllllllllIlIIllIIIlllIlllIIl).toCharArray();
        final long lllllllllllllIlIIllIIIlllIllIIll = lllllllllllllIlIIllIIIlllIllIlII.length;
        double lllllllllllllIlIIllIIIlllIllIIlI = ServerBootstrap.lIIIIlIIIlllIl[0];
        while (lIlllIIIIlIlIII((int)lllllllllllllIlIIllIIIlllIllIIlI, (int)lllllllllllllIlIIllIIIlllIllIIll)) {
            final char lllllllllllllIlIIllIIlllIlIIIIIl = lllllllllllllIlIIllIIIlllIllIlII[lllllllllllllIlIIllIIIlllIllIIlI];
            lllllllllllllIlIIllIIlllIIlllllI.append((char)(lllllllllllllIlIIllIIlllIlIIIIIl ^ lllllllllllllIlIIllIIIlllIlllIll[lllllllllllllIlIIllIIIlllIlllIlI % lllllllllllllIlIIllIIIlllIlllIll.length]));
            "".length();
            ++lllllllllllllIlIIllIIIlllIlllIlI;
            ++lllllllllllllIlIIllIIIlllIllIIlI;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIllIIlllIIlllllI);
    }
    
    public ServerBootstrap() {
        this.childOptions = new LinkedHashMap<ChannelOption<?>, Object>();
        this.childAttrs = new LinkedHashMap<AttributeKey<?>, Object>();
    }
    
    private static Map.Entry<ChannelOption<?>, Object>[] newOptionArray(final int lllllllllllllIlIIllIIlllIllIllIl) {
        return (Map.Entry<ChannelOption<?>, Object>[])new Map.Entry[lllllllllllllIlIIllIIlllIllIllIl];
    }
    
    private ServerBootstrap(final ServerBootstrap lllllllllllllIlIIllIIlllllIIlIll) {
        super(lllllllllllllIlIIllIIlllllIIlIll);
        this.childOptions = new LinkedHashMap<ChannelOption<?>, Object>();
        this.childAttrs = new LinkedHashMap<AttributeKey<?>, Object>();
        this.childGroup = lllllllllllllIlIIllIIlllllIIlIll.childGroup;
        this.childHandler = lllllllllllllIlIIllIIlllllIIlIll.childHandler;
        synchronized (lllllllllllllIlIIllIIlllllIIlIll.childOptions) {
            this.childOptions.putAll(lllllllllllllIlIIllIIlllllIIlIll.childOptions);
            // monitorexit(lllllllllllllIlIIllIIlllllIIlIll.childOptions)
            "".length();
            if (null != null) {
                throw null;
            }
        }
        synchronized (lllllllllllllIlIIllIIlllllIIlIll.childAttrs) {
            this.childAttrs.putAll(lllllllllllllIlIIllIIlllllIIlIll.childAttrs);
            // monitorexit(lllllllllllllIlIIllIIlllllIIlIll.childAttrs)
            "".length();
            if ((0xA3 ^ 0xA7) < 0) {
                throw null;
            }
        }
    }
    
    private static boolean lIlllIIIIlIIlll(final int lllllllllllllIlIIllIIIlllIIlIlII, final int lllllllllllllIlIIllIIIlllIIlIIll) {
        return lllllllllllllIlIIllIIIlllIIlIlII == lllllllllllllIlIIllIIIlllIIlIIll;
    }
    
    private static String lIllIlllllIIIlI(final String lllllllllllllIlIIllIIIlllIIlllII, final String lllllllllllllIlIIllIIIlllIIllIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIllIIIlllIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIIIlllIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIllIIIlllIIllllI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIllIIIlllIIllllI.init(ServerBootstrap.lIIIIlIIIlllIl[2], lllllllllllllIlIIllIIIlllIIlllll);
            return new String(lllllllllllllIlIIllIIIlllIIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIIIlllIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllIIIlllIIlllIl) {
            lllllllllllllIlIIllIIIlllIIlllIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIlllIIIIlIIIlI() {
        (lIIIIlIIIlllIl = new int[19])[0] = ((0x1D ^ 0x31) & ~(0x25 ^ 0x9));
        ServerBootstrap.lIIIIlIIIlllIl[1] = " ".length();
        ServerBootstrap.lIIIIlIIIlllIl[2] = "  ".length();
        ServerBootstrap.lIIIIlIIIlllIl[3] = "   ".length();
        ServerBootstrap.lIIIIlIIIlllIl[4] = (0x4E ^ 0x4A);
        ServerBootstrap.lIIIIlIIIlllIl[5] = (0x91 ^ 0xA4 ^ (0x2D ^ 0x1D));
        ServerBootstrap.lIIIIlIIIlllIl[6] = (0x83 ^ 0x85);
        ServerBootstrap.lIIIIlIIIlllIl[7] = (0x1D ^ 0x1A);
        ServerBootstrap.lIIIIlIIIlllIl[8] = (0x69 ^ 0x61);
        ServerBootstrap.lIIIIlIIIlllIl[9] = (0x76 ^ 0x2C ^ (0x78 ^ 0x2B));
        ServerBootstrap.lIIIIlIIIlllIl[10] = (0x7B ^ 0x71);
        ServerBootstrap.lIIIIlIIIlllIl[11] = (0x8D ^ 0x86);
        ServerBootstrap.lIIIIlIIIlllIl[12] = (0x25 ^ 0x72 ^ (0x49 ^ 0x12));
        ServerBootstrap.lIIIIlIIIlllIl[13] = (0x19 ^ 0x41 ^ (0x40 ^ 0x15));
        ServerBootstrap.lIIIIlIIIlllIl[14] = (147 + 99 - 158 + 119 ^ 58 + 68 - 87 + 154);
        ServerBootstrap.lIIIIlIIIlllIl[15] = (0x68 ^ 0x67);
        ServerBootstrap.lIIIIlIIIlllIl[16] = (0x50 ^ 0x3C ^ (0x45 ^ 0x1));
        ServerBootstrap.lIIIIlIIIlllIl[17] = (0x6D ^ 0x44);
        ServerBootstrap.lIIIIlIIIlllIl[18] = (17 + 167 - 86 + 83 ^ 42 + 6 - 1 + 118);
    }
    
    private static Map.Entry<AttributeKey<?>, Object>[] newAttrArray(final int lllllllllllllIlIIllIIlllIllIlIlI) {
        return (Map.Entry<AttributeKey<?>, Object>[])new Map.Entry[lllllllllllllIlIIllIIlllIllIlIlI];
    }
    
    private static void lIllIlllllIllIl() {
        (lIIIIIlllllllI = new String[ServerBootstrap.lIIIIlIIIlllIl[18]])[ServerBootstrap.lIIIIlIIIlllIl[0]] = lIllIlllllIIIlI("hqF6nAyPaxAr2I+x6JUGow==", "KptaA");
        ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[1]] = lIllIlllllIIIll("tauTvpTuHXqguepUNs5xfgPXIyeR+Cq8", "luAGn");
        ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[2]] = lIllIlllllIIIlI("rlSdQcSG0f/t0kQCxtWIpw==", "FiKwJ");
        ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[3]] = lIllIlllllIIIlI("WOKPooVkYMG/XhGH9w5cPg==", "MvEar");
        ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[4]] = lIllIlllllIlIII("EA85NAo7Bj48AhYV", "sgPXn");
        ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[5]] = lIllIlllllIIIlI("CIJOIuGEF9oPbZiEr2dsViC2S7215Bc3", "fVZOo");
        ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[6]] = lIllIlllllIIIll("CtBz4gyc935TS+O2462TGBmynECs3vLleU8LBdhUoYT2CJ/LJGYWmJyffv8WWoD4mEEvuYW6+c4=", "WxZtn");
        ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[7]] = lIllIlllllIIIll("xfOtOdD0Fk8=", "ieOId");
        ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[8]] = lIllIlllllIIIll("UlsIE+CZ/Uh2lExWCavUnQ==", "xWQqc");
        ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[9]] = lIllIlllllIIIlI("HixfUKkHDxY=", "xqFRR");
        ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[10]] = lIllIlllllIIIlI("cbb9bYAY0lzNOL/LWSLMFQ==", "HIQEA");
        ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[11]] = lIllIlllllIIIll("ycQwSwRwQ+A=", "WqSKE");
        ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[12]] = lIllIlllllIIIlI("TrzByJy3LpBkJNXlsYNS2A==", "WnZLm");
        ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[13]] = lIllIlllllIIIlI("mjSrO5oxXBs=", "SuHBQ");
        ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[14]] = lIllIlllllIlIII("Eh07IQs5FDwpAxQHaG0=", "quRMo");
        ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[15]] = lIllIlllllIlIII("SEI=", "dbrLM");
    }
    
    @Override
    public String toString() {
        final StringBuilder lllllllllllllIlIIllIIlllIlIlllll = new StringBuilder(super.toString());
        lllllllllllllIlIIllIIlllIlIlllll.setLength(lllllllllllllIlIIllIIlllIlIlllll.length() - ServerBootstrap.lIIIIlIIIlllIl[1]);
        lllllllllllllIlIIllIIlllIlIlllll.append(ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[7]]);
        "".length();
        if (lIlllIIIIlIIlII(this.childGroup)) {
            lllllllllllllIlIIllIIlllIlIlllll.append(ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[8]]);
            "".length();
            lllllllllllllIlIIllIIlllIlIlllll.append(StringUtil.simpleClassName(this.childGroup));
            "".length();
            lllllllllllllIlIIllIIlllIlIlllll.append(ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[9]]);
            "".length();
        }
        synchronized (this.childOptions) {
            if (lIlllIIIIlIIllI(this.childOptions.isEmpty() ? 1 : 0)) {
                lllllllllllllIlIIllIIlllIlIlllll.append(ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[10]]);
                "".length();
                lllllllllllllIlIIllIIlllIlIlllll.append(this.childOptions);
                "".length();
                lllllllllllllIlIIllIIlllIlIlllll.append(ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[11]]);
                "".length();
            }
            // monitorexit(this.childOptions)
            "".length();
            if (null != null) {
                return null;
            }
        }
        synchronized (this.childAttrs) {
            if (lIlllIIIIlIIllI(this.childAttrs.isEmpty() ? 1 : 0)) {
                lllllllllllllIlIIllIIlllIlIlllll.append(ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[12]]);
                "".length();
                lllllllllllllIlIIllIIlllIlIlllll.append(this.childAttrs);
                "".length();
                lllllllllllllIlIIllIIlllIlIlllll.append(ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[13]]);
                "".length();
            }
            // monitorexit(this.childAttrs)
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        if (lIlllIIIIlIIlII(this.childHandler)) {
            lllllllllllllIlIIllIIlllIlIlllll.append(ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[14]]);
            "".length();
            lllllllllllllIlIIllIIlllIlIlllll.append(this.childHandler);
            "".length();
            lllllllllllllIlIIllIIlllIlIlllll.append(ServerBootstrap.lIIIIIlllllllI[ServerBootstrap.lIIIIlIIIlllIl[15]]);
            "".length();
        }
        if (lIlllIIIIlIIlll(lllllllllllllIlIIllIIlllIlIlllll.charAt(lllllllllllllIlIIllIIlllIlIlllll.length() - ServerBootstrap.lIIIIlIIIlllIl[1]), ServerBootstrap.lIIIIlIIIlllIl[16])) {
            lllllllllllllIlIIllIIlllIlIlllll.append((char)ServerBootstrap.lIIIIlIIIlllIl[17]);
            "".length();
            "".length();
            if ((0xA1 ^ 0x93 ^ (0x2D ^ 0x1A)) == 0x0) {
                return null;
            }
        }
        else {
            lllllllllllllIlIIllIIlllIlIlllll.setCharAt(lllllllllllllIlIIllIIlllIlIlllll.length() - ServerBootstrap.lIIIIlIIIlllIl[2], (char)ServerBootstrap.lIIIIlIIIlllIl[17]);
            lllllllllllllIlIIllIIlllIlIlllll.setLength(lllllllllllllIlIIllIIlllIlIlllll.length() - ServerBootstrap.lIIIIlIIIlllIl[1]);
        }
        return String.valueOf(lllllllllllllIlIIllIIlllIlIlllll);
    }
    
    private static class ServerBootstrapAcceptor extends ChannelInboundHandlerAdapter
    {
        private final /* synthetic */ EventLoopGroup childGroup;
        private final /* synthetic */ ChannelHandler childHandler;
        private static final /* synthetic */ int[] lIlIIllIIIllIl;
        private final /* synthetic */ Map.Entry<ChannelOption<?>, Object>[] childOptions;
        private static final /* synthetic */ String[] lIlIIllIIIlIII;
        private final /* synthetic */ Map.Entry<AttributeKey<?>, Object>[] childAttrs;
        
        private static String lllIIlllIlIlIIl(final String lllllllllllllIIIllIlIIIllIIIIlII, final String lllllllllllllIIIllIlIIIllIIIIIll) {
            try {
                final SecretKeySpec lllllllllllllIIIllIlIIIllIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIlIIIllIIIIIll.getBytes(StandardCharsets.UTF_8)), ServerBootstrapAcceptor.lIlIIllIIIllIl[4]), "DES");
                final Cipher lllllllllllllIIIllIlIIIllIIIIllI = Cipher.getInstance("DES");
                lllllllllllllIIIllIlIIIllIIIIllI.init(ServerBootstrapAcceptor.lIlIIllIIIllIl[2], lllllllllllllIIIllIlIIIllIIIIlll);
                return new String(lllllllllllllIIIllIlIIIllIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIlIIIllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIllIlIIIllIIIIlIl) {
                lllllllllllllIIIllIlIIIllIIIIlIl.printStackTrace();
                return null;
            }
        }
        
        private static boolean lllIIlllIllIIII(final int lllllllllllllIIIllIlIIIlIlllIlll) {
            return lllllllllllllIIIllIlIIIlIlllIlll == 0;
        }
        
        private static void lllIIlllIlIlllI() {
            (lIlIIllIIIllIl = new int[5])[0] = " ".length();
            ServerBootstrapAcceptor.lIlIIllIIIllIl[1] = ((0xC1 ^ 0x8E) & ~(0x27 ^ 0x68));
            ServerBootstrapAcceptor.lIlIIllIIIllIl[2] = "  ".length();
            ServerBootstrapAcceptor.lIlIIllIIIllIl[3] = "   ".length();
            ServerBootstrapAcceptor.lIlIIllIIIllIl[4] = (0x15 ^ 0x9 ^ (0x8B ^ 0x9F));
        }
        
        private static String lllIIlllIlIllII(final String lllllllllllllIIIllIlIIIllIIlIIIl, final String lllllllllllllIIIllIlIIIllIIlIIII) {
            try {
                final SecretKeySpec lllllllllllllIIIllIlIIIllIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIlIIIllIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIIllIlIIIllIIlIIll = Cipher.getInstance("Blowfish");
                lllllllllllllIIIllIlIIIllIIlIIll.init(ServerBootstrapAcceptor.lIlIIllIIIllIl[2], lllllllllllllIIIllIlIIIllIIlIlII);
                return new String(lllllllllllllIIIllIlIIIllIIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIlIIIllIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIllIlIIIllIIlIIlI) {
                lllllllllllllIIIllIlIIIllIIlIIlI.printStackTrace();
                return null;
            }
        }
        
        private static boolean lllIIlllIllIIIl(final int lllllllllllllIIIllIlIIIlIllllIIl) {
            return lllllllllllllIIIllIlIIIlIllllIIl != 0;
        }
        
        ServerBootstrapAcceptor(final EventLoopGroup lllllllllllllIIIllIlIIIlllIlIlll, final ChannelHandler lllllllllllllIIIllIlIIIlllIlIllI, final Map.Entry<ChannelOption<?>, Object>[] lllllllllllllIIIllIlIIIlllIlIlIl, final Map.Entry<AttributeKey<?>, Object>[] lllllllllllllIIIllIlIIIlllIlIlII) {
            this.childGroup = lllllllllllllIIIllIlIIIlllIlIlll;
            this.childHandler = lllllllllllllIIIllIlIIIlllIlIllI;
            this.childOptions = lllllllllllllIIIllIlIIIlllIlIlIl;
            this.childAttrs = lllllllllllllIIIllIlIIIlllIlIlII;
        }
        
        private static void lllIIlllIlIllIl() {
            (lIlIIllIIIlIII = new String[ServerBootstrapAcceptor.lIlIIllIIIllIl[3]])[ServerBootstrapAcceptor.lIlIIllIIIllIl[1]] = lllIIlllIlIlIIl("/Gn3tjmHWIrJgwM5CtNwMyctHp8j0/v/FVqffF+SXkk=", "VTvdw");
            ServerBootstrapAcceptor.lIlIIllIIIlIII[ServerBootstrapAcceptor.lIlIIllIIIllIl[0]] = lllIIlllIlIlIIl("rYTMPRS+N71v5tp8IFZGZ3NVxhQlJNHPZAaCkk2cQN72+K8cCUwr5g==", "Tczyv");
            ServerBootstrapAcceptor.lIlIIllIIIlIII[ServerBootstrapAcceptor.lIlIIllIIIllIl[2]] = lllIIlllIlIllII("GyAx4lcgPCC1EY+LuFfcoXwEmG/3u1hGLYvC6YhXdFLPaj4W2XeyWiftg47q4tSF", "hoDNv");
        }
        
        @Override
        public void exceptionCaught(final ChannelHandlerContext lllllllllllllIIIllIlIIIllIlIIlIl, final Throwable lllllllllllllIIIllIlIIIllIlIIIII) throws Exception {
            final ChannelConfig lllllllllllllIIIllIlIIIllIlIIIll = lllllllllllllIIIllIlIIIllIlIIlIl.channel().config();
            if (lllIIlllIllIIIl(lllllllllllllIIIllIlIIIllIlIIIll.isAutoRead() ? 1 : 0)) {
                lllllllllllllIIIllIlIIIllIlIIIll.setAutoRead((boolean)(ServerBootstrapAcceptor.lIlIIllIIIllIl[1] != 0));
                "".length();
                lllllllllllllIIIllIlIIIllIlIIlIl.channel().eventLoop().schedule((Runnable)new Runnable() {
                    private static final /* synthetic */ int[] lIIIIlIIIIIllI;
                    
                    @Override
                    public void run() {
                        lllllllllllllIIIllIlIIIllIlIIIll.setAutoRead((boolean)(ServerBootstrap$ServerBootstrapAcceptor$2.lIIIIlIIIIIllI[0] != 0));
                        "".length();
                    }
                    
                    private static void lIllIlllllllIII() {
                        (lIIIIlIIIIIllI = new int[1])[0] = " ".length();
                    }
                    
                    static {
                        lIllIlllllllIII();
                    }
                }, 1L, TimeUnit.SECONDS);
                "".length();
            }
            lllllllllllllIIIllIlIIIllIlIIlIl.fireExceptionCaught(lllllllllllllIIIllIlIIIllIlIIIII);
            "".length();
        }
        
        static {
            lllIIlllIlIlllI();
            lllIIlllIlIllIl();
        }
        
        private static boolean lllIIlllIlIllll(final int lllllllllllllIIIllIlIIIlIlllllII, final int lllllllllllllIIIllIlIIIlIllllIll) {
            return lllllllllllllIIIllIlIIIlIlllllII < lllllllllllllIIIllIlIIIlIllllIll;
        }
        
        @Override
        public void channelRead(final ChannelHandlerContext lllllllllllllIIIllIlIIIllIlllIll, final Object lllllllllllllIIIllIlIIIllIllIlll) {
            final Channel lllllllllllllIIIllIlIIIllIlllIIl = (Channel)lllllllllllllIIIllIlIIIllIllIlll;
            final ChannelPipeline pipeline = lllllllllllllIIIllIlIIIllIlllIIl.pipeline();
            final ChannelHandler[] array = new ChannelHandler[ServerBootstrapAcceptor.lIlIIllIIIllIl[0]];
            array[ServerBootstrapAcceptor.lIlIIllIIIllIl[1]] = this.childHandler;
            pipeline.addLast(array);
            "".length();
            final Map.Entry[] lllllllllllllIIIllIlIIIlllIIIlII = this.childOptions;
            final int lllllllllllllIIIllIlIIIlllIIIIll = lllllllllllllIIIllIlIIIlllIIIlII.length;
            int lllllllllllllIIIllIlIIIlllIIIIlI = ServerBootstrapAcceptor.lIlIIllIIIllIl[1];
            while (lllIIlllIlIllll(lllllllllllllIIIllIlIIIlllIIIIlI, lllllllllllllIIIllIlIIIlllIIIIll)) {
                final Map.Entry<ChannelOption<?>, Object> lllllllllllllIIIllIlIIIlllIIIlIl = (Map.Entry<ChannelOption<?>, Object>)lllllllllllllIIIllIlIIIlllIIIlII[lllllllllllllIIIllIlIIIlllIIIIlI];
                try {
                    if (lllIIlllIllIIII(lllllllllllllIIIllIlIIIllIlllIIl.config().setOption(lllllllllllllIIIllIlIIIlllIIIlIl.getKey(), lllllllllllllIIIllIlIIIlllIIIlIl.getValue()) ? 1 : 0)) {
                        ServerBootstrap.logger.warn(String.valueOf(new StringBuilder().append(ServerBootstrapAcceptor.lIlIIllIIIlIII[ServerBootstrapAcceptor.lIlIIllIIIllIl[1]]).append(lllllllllllllIIIllIlIIIlllIIIlIl)));
                    }
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                catch (Throwable lllllllllllllIIIllIlIIIlllIIIllI) {
                    ServerBootstrap.logger.warn(String.valueOf(new StringBuilder().append(ServerBootstrapAcceptor.lIlIIllIIIlIII[ServerBootstrapAcceptor.lIlIIllIIIllIl[0]]).append(lllllllllllllIIIllIlIIIllIlllIIl)), lllllllllllllIIIllIlIIIlllIIIllI);
                }
                ++lllllllllllllIIIllIlIIIlllIIIIlI;
                "".length();
                if (-"  ".length() > 0) {
                    return;
                }
            }
            final Map.Entry[] lllllllllllllIIIllIlIIIlllIIIIII = this.childAttrs;
            final int lllllllllllllIIIllIlIIIllIllllll = lllllllllllllIIIllIlIIIlllIIIIII.length;
            int lllllllllllllIIIllIlIIIllIlllllI = ServerBootstrapAcceptor.lIlIIllIIIllIl[1];
            while (lllIIlllIlIllll(lllllllllllllIIIllIlIIIllIlllllI, lllllllllllllIIIllIlIIIllIllllll)) {
                final Map.Entry<AttributeKey<?>, Object> lllllllllllllIIIllIlIIIlllIIIIIl = (Map.Entry<AttributeKey<?>, Object>)lllllllllllllIIIllIlIIIlllIIIIII[lllllllllllllIIIllIlIIIllIlllllI];
                lllllllllllllIIIllIlIIIllIlllIIl.attr(lllllllllllllIIIllIlIIIlllIIIIIl.getKey()).set(lllllllllllllIIIllIlIIIlllIIIIIl.getValue());
                ++lllllllllllllIIIllIlIIIllIlllllI;
                "".length();
                if (" ".length() == "   ".length()) {
                    return;
                }
            }
            try {
                this.childGroup.register(lllllllllllllIIIllIlIIIllIlllIIl).addListener((GenericFutureListener<? extends Future<? super Void>>)new ChannelFutureListener() {
                    @Override
                    public void operationComplete(final ChannelFuture llllllllllllIlIllllIlIIIlIIIIllI) throws Exception {
                        if (lIIllllllIIlllll(llllllllllllIlIllllIlIIIlIIIIllI.isSuccess() ? 1 : 0)) {
                            forceClose(lllllllllllllIIIllIlIIIllIlllIIl, llllllllllllIlIllllIlIIIlIIIIllI.cause());
                        }
                    }
                    
                    private static boolean lIIllllllIIlllll(final int llllllllllllIlIllllIlIIIIlllllII) {
                        return llllllllllllIlIllllIlIIIIlllllII == 0;
                    }
                });
                "".length();
                "".length();
                if ((0x8E ^ 0xAD ^ (0x91 ^ 0xB6)) < 0) {
                    return;
                }
            }
            catch (Throwable lllllllllllllIIIllIlIIIllIllllIl) {
                forceClose(lllllllllllllIIIllIlIIIllIlllIIl, lllllllllllllIIIllIlIIIllIllllIl);
            }
        }
        
        private static void forceClose(final Channel lllllllllllllIIIllIlIIIllIlIlllI, final Throwable lllllllllllllIIIllIlIIIllIlIlIll) {
            lllllllllllllIIIllIlIIIllIlIlllI.unsafe().closeForcibly();
            ServerBootstrap.logger.warn(String.valueOf(new StringBuilder().append(ServerBootstrapAcceptor.lIlIIllIIIlIII[ServerBootstrapAcceptor.lIlIIllIIIllIl[2]]).append(lllllllllllllIIIllIlIIIllIlIlllI)), lllllllllllllIIIllIlIIIllIlIlIll);
        }
    }
}
