// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.bootstrap;

import io.netty.channel.ChannelException;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.concurrent.EventExecutor;
import io.netty.channel.DefaultChannelPromise;
import io.netty.util.concurrent.GlobalEventExecutor;
import java.net.InetSocketAddress;
import java.net.InetAddress;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.concurrent.Future;
import io.netty.channel.ChannelPromise;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelFuture;
import io.netty.util.internal.StringUtil;
import java.util.LinkedHashMap;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.util.AttributeKey;
import java.util.Map;
import io.netty.channel.ChannelHandler;
import java.net.SocketAddress;
import io.netty.channel.Channel;

public abstract class AbstractBootstrap<B extends AbstractBootstrap<B, C>, C extends Channel> implements Cloneable
{
    private volatile /* synthetic */ SocketAddress localAddress;
    private static final /* synthetic */ int[] lIIIIllllIIlII;
    private volatile /* synthetic */ ChannelFactory<? extends C> channelFactory;
    private volatile /* synthetic */ ChannelHandler handler;
    private final /* synthetic */ Map<AttributeKey<?>, Object> attrs;
    private volatile /* synthetic */ EventLoopGroup group;
    private final /* synthetic */ Map<ChannelOption<?>, Object> options;
    private static final /* synthetic */ String[] lIIIIlllIlllll;
    
    AbstractBootstrap() {
        this.options = new LinkedHashMap<ChannelOption<?>, Object>();
        this.attrs = new LinkedHashMap<AttributeKey<?>, Object>();
    }
    
    @Override
    public String toString() {
        final StringBuilder lllllllllllllIlIIIlllIllIlIIIlII = new StringBuilder();
        lllllllllllllIlIIIlllIllIlIIIlII.append(StringUtil.simpleClassName(this));
        "".length();
        lllllllllllllIlIIIlllIllIlIIIlII.append((char)AbstractBootstrap.lIIIIllllIIlII[12]);
        "".length();
        if (lIllllIlIIIlllI(this.group)) {
            lllllllllllllIlIIIlllIllIlIIIlII.append(AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[13]]);
            "".length();
            lllllllllllllIlIIIlllIllIlIIIlII.append(StringUtil.simpleClassName(this.group));
            "".length();
            lllllllllllllIlIIIlllIllIlIIIlII.append(AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[14]]);
            "".length();
        }
        if (lIllllIlIIIlllI(this.channelFactory)) {
            lllllllllllllIlIIIlllIllIlIIIlII.append(AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[15]]);
            "".length();
            lllllllllllllIlIIIlllIllIlIIIlII.append(this.channelFactory);
            "".length();
            lllllllllllllIlIIIlllIllIlIIIlII.append(AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[16]]);
            "".length();
        }
        if (lIllllIlIIIlllI(this.localAddress)) {
            lllllllllllllIlIIIlllIllIlIIIlII.append(AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[17]]);
            "".length();
            lllllllllllllIlIIIlllIllIlIIIlII.append(this.localAddress);
            "".length();
            lllllllllllllIlIIIlllIllIlIIIlII.append(AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[18]]);
            "".length();
        }
        synchronized (this.options) {
            if (lIllllIlIIlIIII(this.options.isEmpty() ? 1 : 0)) {
                lllllllllllllIlIIIlllIllIlIIIlII.append(AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[19]]);
                "".length();
                lllllllllllllIlIIIlllIllIlIIIlII.append(this.options);
                "".length();
                lllllllllllllIlIIIlllIllIlIIIlII.append(AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[20]]);
                "".length();
            }
            // monitorexit(this.options)
            "".length();
            if ((0xB5 ^ 0xB1) < (0x10 ^ 0x14)) {
                return null;
            }
        }
        synchronized (this.attrs) {
            if (lIllllIlIIlIIII(this.attrs.isEmpty() ? 1 : 0)) {
                lllllllllllllIlIIIlllIllIlIIIlII.append(AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[21]]);
                "".length();
                lllllllllllllIlIIIlllIllIlIIIlII.append(this.attrs);
                "".length();
                lllllllllllllIlIIIlllIllIlIIIlII.append(AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[22]]);
                "".length();
            }
            // monitorexit(this.attrs)
            "".length();
            if ((60 + 36 - 66 + 99 ^ 109 + 23 - 9 + 10) < "  ".length()) {
                return null;
            }
        }
        if (lIllllIlIIIlllI(this.handler)) {
            lllllllllllllIlIIIlllIllIlIIIlII.append(AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[23]]);
            "".length();
            lllllllllllllIlIIIlllIllIlIIIlII.append(this.handler);
            "".length();
            lllllllllllllIlIIIlllIllIlIIIlII.append(AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[24]]);
            "".length();
        }
        if (lIllllIlIIlIIIl(lllllllllllllIlIIIlllIllIlIIIlII.charAt(lllllllllllllIlIIIlllIllIlIIIlII.length() - AbstractBootstrap.lIIIIllllIIlII[1]), AbstractBootstrap.lIIIIllllIIlII[12])) {
            lllllllllllllIlIIIlllIllIlIIIlII.append((char)AbstractBootstrap.lIIIIllllIIlII[25]);
            "".length();
            "".length();
            if (-" ".length() >= (163 + 53 - 74 + 29 ^ 83 + 165 - 187 + 114)) {
                return null;
            }
        }
        else {
            lllllllllllllIlIIIlllIllIlIIIlII.setCharAt(lllllllllllllIlIIIlllIllIlIIIlII.length() - AbstractBootstrap.lIIIIllllIIlII[2], (char)AbstractBootstrap.lIIIIllllIIlII[25]);
            lllllllllllllIlIIIlllIllIlIIIlII.setLength(lllllllllllllIlIIIlllIllIlIIIlII.length() - AbstractBootstrap.lIIIIllllIIlII[1]);
        }
        return String.valueOf(lllllllllllllIlIIIlllIllIlIIIlII);
    }
    
    public B channelFactory(final ChannelFactory<? extends C> lllllllllllllIlIIIlllIllllllIIlI) {
        if (lIllllIlIIIllIl(lllllllllllllIlIIIlllIllllllIIlI)) {
            throw new NullPointerException(AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[3]]);
        }
        if (lIllllIlIIIlllI(this.channelFactory)) {
            throw new IllegalStateException(AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[4]]);
        }
        this.channelFactory = lllllllllllllIlIIIlllIllllllIIlI;
        return (B)this;
    }
    
    public ChannelFuture register() {
        this.validate();
        "".length();
        return this.initAndRegister();
    }
    
    final Map<ChannelOption<?>, Object> options() {
        return this.options;
    }
    
    private ChannelFuture doBind(final SocketAddress lllllllllllllIlIIIlllIlllIIIIIIl) {
        final ChannelFuture lllllllllllllIlIIIlllIlllIIIIIII = this.initAndRegister();
        final Channel lllllllllllllIlIIIlllIllIlllllll = lllllllllllllIlIIIlllIlllIIIIIII.channel();
        if (lIllllIlIIIlllI(lllllllllllllIlIIIlllIlllIIIIIII.cause())) {
            return lllllllllllllIlIIIlllIlllIIIIIII;
        }
        ChannelPromise lllllllllllllIlIIIlllIllIllllllI = null;
        if (lIllllIlIIIllll(lllllllllllllIlIIIlllIlllIIIIIII.isDone() ? 1 : 0)) {
            final ChannelPromise lllllllllllllIlIIIlllIlllIIIIIll = lllllllllllllIlIIIlllIllIlllllll.newPromise();
            doBind0(lllllllllllllIlIIIlllIlllIIIIIII, lllllllllllllIlIIIlllIllIlllllll, lllllllllllllIlIIIlllIlllIIIIIIl, lllllllllllllIlIIIlllIlllIIIIIll);
            "".length();
            if ("   ".length() > "   ".length()) {
                return null;
            }
        }
        else {
            lllllllllllllIlIIIlllIllIllllllI = new PendingRegistrationPromise(lllllllllllllIlIIIlllIllIlllllll);
            lllllllllllllIlIIIlllIlllIIIIIII.addListener((GenericFutureListener<? extends Future<? super Void>>)new ChannelFutureListener() {
                @Override
                public void operationComplete(final ChannelFuture lllllllllllllIIIIIIIIIIlIIlIlIlI) throws Exception {
                    doBind0(lllllllllllllIlIIIlllIlllIIIIIII, lllllllllllllIlIIIlllIllIlllllll, lllllllllllllIlIIIlllIlllIIIIIIl, lllllllllllllIlIIIlllIllIllllllI);
                }
            });
            "".length();
        }
        return lllllllllllllIlIIIlllIllIllllllI;
    }
    
    final ChannelFactory<? extends C> channelFactory() {
        return this.channelFactory;
    }
    
    private static boolean lIllllIlIIlIIIl(final int lllllllllllllIlIIIlllIlIllllIlll, final int lllllllllllllIlIIIlllIlIllllIlIl) {
        return lllllllllllllIlIIIlllIlIllllIlll == lllllllllllllIlIIIlllIlIllllIlIl;
    }
    
    public <T> B option(final ChannelOption<T> lllllllllllllIlIIIlllIllllIIIlll, final T lllllllllllllIlIIIlllIllllIIIllI) {
        if (lIllllIlIIIllIl(lllllllllllllIlIIIlllIllllIIIlll)) {
            throw new NullPointerException(AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[5]]);
        }
        if (lIllllIlIIIllIl(lllllllllllllIlIIIlllIllllIIIllI)) {
            synchronized (this.options) {
                this.options.remove(lllllllllllllIlIIIlllIllllIIIlll);
                "".length();
                // monitorexit(this.options)
                "".length();
                if ((0xD ^ 0x8) <= 0) {
                    return null;
                }
            }
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        else {
            synchronized (this.options) {
                this.options.put(lllllllllllllIlIIIlllIllllIIIlll, lllllllllllllIlIIIlllIllllIIIllI);
                "".length();
                // monitorexit(this.options)
                "".length();
                if ("  ".length() <= ((0xB0 ^ 0x81 ^ (0xEF ^ 0x8B)) & (0x2F ^ 0x73 ^ (0x27 ^ 0x2E) ^ -" ".length()))) {
                    return null;
                }
            }
        }
        return (B)this;
    }
    
    AbstractBootstrap(final AbstractBootstrap<B, C> lllllllllllllIlIIIllllIIIIIIIlll) {
        this.options = new LinkedHashMap<ChannelOption<?>, Object>();
        this.attrs = new LinkedHashMap<AttributeKey<?>, Object>();
        this.group = lllllllllllllIlIIIllllIIIIIIIlll.group;
        this.channelFactory = lllllllllllllIlIIIllllIIIIIIIlll.channelFactory;
        this.handler = lllllllllllllIlIIIllllIIIIIIIlll.handler;
        this.localAddress = lllllllllllllIlIIIllllIIIIIIIlll.localAddress;
        synchronized (lllllllllllllIlIIIllllIIIIIIIlll.options) {
            this.options.putAll(lllllllllllllIlIIIllllIIIIIIIlll.options);
            // monitorexit(lllllllllllllIlIIIllllIIIIIIIlll.options)
            "".length();
            if (null != null) {
                throw null;
            }
        }
        synchronized (lllllllllllllIlIIIllllIIIIIIIlll.attrs) {
            this.attrs.putAll(lllllllllllllIlIIIllllIIIIIIIlll.attrs);
            // monitorexit(lllllllllllllIlIIIllllIIIIIIIlll.attrs)
            "".length();
            if ("   ".length() < "   ".length()) {
                throw null;
            }
        }
    }
    
    private static void lIllllIlIIIllII() {
        (lIIIIllllIIlII = new int[27])[0] = ((89 + 52 - 76 + 135 ^ 111 + 48 - 36 + 10) & (0xF ^ 0x2E ^ (0xD1 ^ 0xBD) ^ -" ".length()));
        AbstractBootstrap.lIIIIllllIIlII[1] = " ".length();
        AbstractBootstrap.lIIIIllllIIlII[2] = "  ".length();
        AbstractBootstrap.lIIIIllllIIlII[3] = "   ".length();
        AbstractBootstrap.lIIIIllllIIlII[4] = (0x6 ^ 0x22 ^ (0x67 ^ 0x47));
        AbstractBootstrap.lIIIIllllIIlII[5] = (89 + 8 - 91 + 177 ^ 31 + 101 + 38 + 8);
        AbstractBootstrap.lIIIIllllIIlII[6] = (2 + 31 + 25 + 88 ^ 43 + 12 + 14 + 79);
        AbstractBootstrap.lIIIIllllIIlII[7] = (5 + 53 + 5 + 118 ^ 172 + 33 - 63 + 36);
        AbstractBootstrap.lIIIIllllIIlII[8] = (0x3D ^ 0x7A ^ (0x63 ^ 0x2C));
        AbstractBootstrap.lIIIIllllIIlII[9] = (0xA7 ^ 0xAE);
        AbstractBootstrap.lIIIIllllIIlII[10] = (0x5E ^ 0x14 ^ (0x8 ^ 0x48));
        AbstractBootstrap.lIIIIllllIIlII[11] = (126 + 112 - 147 + 63 ^ 18 + 89 + 20 + 18);
        AbstractBootstrap.lIIIIllllIIlII[12] = (0x35 ^ 0x1D);
        AbstractBootstrap.lIIIIllllIIlII[13] = (0x1A ^ 0x16);
        AbstractBootstrap.lIIIIllllIIlII[14] = (0x9B ^ 0xB5 ^ (0x90 ^ 0xB3));
        AbstractBootstrap.lIIIIllllIIlII[15] = (0xB6 ^ 0xB8);
        AbstractBootstrap.lIIIIllllIIlII[16] = (0x24 ^ 0x2B);
        AbstractBootstrap.lIIIIllllIIlII[17] = (0xB5 ^ 0xA5);
        AbstractBootstrap.lIIIIllllIIlII[18] = (34 + 67 - 76 + 138 ^ 136 + 41 - 155 + 156);
        AbstractBootstrap.lIIIIllllIIlII[19] = (0 + 50 - 48 + 168 ^ 164 + 49 - 99 + 70);
        AbstractBootstrap.lIIIIllllIIlII[20] = (0xBC ^ 0xAF);
        AbstractBootstrap.lIIIIllllIIlII[21] = (0x4C ^ 0x58);
        AbstractBootstrap.lIIIIllllIIlII[22] = (171 + 164 - 195 + 70 ^ 103 + 63 - 68 + 101);
        AbstractBootstrap.lIIIIllllIIlII[23] = ("   ".length() ^ (0x2D ^ 0x38));
        AbstractBootstrap.lIIIIllllIIlII[24] = (0x34 ^ 0x23);
        AbstractBootstrap.lIIIIllllIIlII[25] = (0x54 ^ 0x7D);
        AbstractBootstrap.lIIIIllllIIlII[26] = (72 + 205 - 89 + 34 ^ 129 + 79 - 187 + 177);
    }
    
    static {
        lIllllIlIIIllII();
        lIllllIlIIIlIII();
    }
    
    private static boolean lIllllIlIIlIIII(final int lllllllllllllIlIIIlllIlIllIlllIl) {
        return lllllllllllllIlIIIlllIlIllIlllIl == 0;
    }
    
    public B validate() {
        if (lIllllIlIIIllIl(this.group)) {
            throw new IllegalStateException(AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[7]]);
        }
        if (lIllllIlIIIllIl(this.channelFactory)) {
            throw new IllegalStateException(AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[8]]);
        }
        return (B)this;
    }
    
    public ChannelFuture bind(final InetAddress lllllllllllllIlIIIlllIlllIIlIIII, final int lllllllllllllIlIIIlllIlllIIIllll) {
        return this.bind(new InetSocketAddress(lllllllllllllIlIIIlllIlllIIlIIII, lllllllllllllIlIIIlllIlllIIIllll));
    }
    
    public abstract B clone();
    
    final SocketAddress localAddress() {
        return this.localAddress;
    }
    
    public B localAddress(final SocketAddress lllllllllllllIlIIIlllIlllllIllII) {
        this.localAddress = lllllllllllllIlIIIlllIlllllIllII;
        return (B)this;
    }
    
    public ChannelFuture bind() {
        this.validate();
        "".length();
        final SocketAddress lllllllllllllIlIIIlllIlllIlIlIIl = this.localAddress;
        if (lIllllIlIIIllIl(lllllllllllllIlIIIlllIlllIlIlIIl)) {
            throw new IllegalStateException(AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[9]]);
        }
        return this.doBind(lllllllllllllIlIIIlllIlllIlIlIIl);
    }
    
    public final EventLoopGroup group() {
        return this.group;
    }
    
    private static void lIllllIlIIIlIII() {
        (lIIIIlllIlllll = new String[AbstractBootstrap.lIIIIllllIIlII[26]])[AbstractBootstrap.lIIIIllllIIlII[0]] = lIllllIlIIIIIIl("Mgs+MCA=", "UyQEP");
        AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[1]] = lIllllIlIIIIIIl("MQoMFxt2CwYWSzcUEQcKMgE=", "Vxcbk");
        AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[2]] = lIllllIlIIIIIlI("h/uVWOgi4Lj/VVIjXkifdQ==", "HHXdA");
        AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[3]] = lIllllIlIIIIIIl("Dx0pLBwJGQ4jERgaOjs=", "luHBr");
        AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[4]] = lIllllIlIIIIIIl("CR0RKiUPGTYlKB4aAj1rGRAEZCoGBxUlLxM=", "jupDK");
        AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[5]] = lIllllIlIIIIIlI("a6I/dQzPQnA=", "TsJeG");
        AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[6]] = lIllllIlIIIIIll("y2OrExeOKjo=", "PrmNT");
        AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[7]] = lIllllIlIIIIIll("8SfwsgK8OftpM2HmWIBluQ==", "kqLmT");
        AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[8]] = lIllllIlIIIIIlI("HlfRe73gGQwtIeWmodAATgR0In27Fh3pFIeg2yTZRod/AW5wD888gg==", "Lajjr");
        AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[9]] = lIllllIlIIIIIll("ddTT0eVsUCLsTMZO4ycfwysWt2YvAXOU", "nijEb");
        AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[10]] = lIllllIlIIIIIlI("EL9xnNb3bdOrOAfCsEivTQ==", "JVhiS");
        AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[11]] = lIllllIlIIIIIlI("lAzpGI7yER8=", "feFIO");
        AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[13]] = lIllllIlIIIIIIl("PiQCFxtjdg==", "YVmbk");
        AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[14]] = lIllllIlIIIIIll("00mzkG76/Sg=", "IvZSr");
        AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[15]] = lIllllIlIIIIIlI("6spEu3nqAebYFk+2MA0Fi9mZPbsh19yZ", "VVYTc");
        AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[16]] = lIllllIlIIIIIll("uybO4KL4rm4=", "XXdhW");
        AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[17]] = lIllllIlIIIIIll("T4Pcbb9PVC2R2Ux5MFqHLg==", "dCqeR");
        AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[18]] = lIllllIlIIIIIll("2ftwamEYjsc=", "kdWgD");
        AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[19]] = lIllllIlIIIIIll("vRGIG1dH75ZvHfuu6lZ4cg==", "rgIDt");
        AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[20]] = lIllllIlIIIIIll("MykHGL37pJ4=", "oRTRI");
        AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[21]] = lIllllIlIIIIIlI("kkrYMF7mz2Q=", "WpKLs");
        AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[22]] = lIllllIlIIIIIlI("4Dzoe6P2L0s=", "zeDzS");
        AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[23]] = lIllllIlIIIIIlI("1jFRG4hdP8BYJthrbeqXew==", "FAspp");
        AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[24]] = lIllllIlIIIIIlI("XzJazpMWBWs=", "mLeBQ");
    }
    
    public B channel(final Class<? extends C> lllllllllllllIlIIIlllIlllllllIII) {
        if (lIllllIlIIIllIl(lllllllllllllIlIIIlllIlllllllIII)) {
            throw new NullPointerException(AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[2]]);
        }
        return this.channelFactory((ChannelFactory<? extends C>)new BootstrapChannelFactory<C>(lllllllllllllIlIIIlllIlllllllIII));
    }
    
    public ChannelFuture bind(final int lllllllllllllIlIIIlllIlllIlIIIll) {
        return this.bind(new InetSocketAddress(lllllllllllllIlIIIlllIlllIlIIIll));
    }
    
    final ChannelHandler handler() {
        return this.handler;
    }
    
    public B localAddress(final InetAddress lllllllllllllIlIIIlllIllllIlIllI, final int lllllllllllllIlIIIlllIllllIlIlIl) {
        return this.localAddress(new InetSocketAddress(lllllllllllllIlIIIlllIllllIlIllI, lllllllllllllIlIIIlllIllllIlIlIl));
    }
    
    abstract void init(final Channel p0) throws Exception;
    
    final Map<AttributeKey<?>, Object> attrs() {
        return this.attrs;
    }
    
    private static boolean lIllllIlIIIlllI(final Object lllllllllllllIlIIIlllIlIlllIlIIl) {
        return lllllllllllllIlIIIlllIlIlllIlIIl != null;
    }
    
    private static boolean lIllllIlIIIllIl(final Object lllllllllllllIlIIIlllIlIlllIIlII) {
        return lllllllllllllIlIIIlllIlIlllIIlII == null;
    }
    
    private static boolean lIllllIlIIIllll(final int lllllllllllllIlIIIlllIlIlllIIIIl) {
        return lllllllllllllIlIIIlllIlIlllIIIIl != 0;
    }
    
    final ChannelFuture initAndRegister() {
        final Channel lllllllllllllIlIIIlllIllIlllIIll = (Channel)this.channelFactory().newChannel();
        try {
            this.init(lllllllllllllIlIIIlllIllIlllIIll);
            "".length();
            if (((99 + 68 - 105 + 72 ^ 19 + 13 + 76 + 29) & (0x42 ^ 0x2A ^ (0x4F ^ 0x28) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        catch (Throwable lllllllllllllIlIIIlllIllIlllIlIl) {
            lllllllllllllIlIIIlllIllIlllIIll.unsafe().closeForcibly();
            return new DefaultChannelPromise(lllllllllllllIlIIIlllIllIlllIIll, GlobalEventExecutor.INSTANCE).setFailure(lllllllllllllIlIIIlllIllIlllIlIl);
        }
        final ChannelFuture lllllllllllllIlIIIlllIllIlllIIlI = this.group().register(lllllllllllllIlIIIlllIllIlllIIll);
        if (lIllllIlIIIlllI(lllllllllllllIlIIIlllIllIlllIIlI.cause())) {
            if (lIllllIlIIIllll(lllllllllllllIlIIIlllIllIlllIIll.isRegistered() ? 1 : 0)) {
                lllllllllllllIlIIIlllIllIlllIIll.close();
                "".length();
                "".length();
                if ("   ".length() == 0) {
                    return null;
                }
            }
            else {
                lllllllllllllIlIIIlllIllIlllIIll.unsafe().closeForcibly();
            }
        }
        return lllllllllllllIlIIIlllIllIlllIIlI;
    }
    
    public <T> B attr(final AttributeKey<T> lllllllllllllIlIIIlllIlllIllIlll, final T lllllllllllllIlIIIlllIlllIlllIlI) {
        if (lIllllIlIIIllIl(lllllllllllllIlIIIlllIlllIllIlll)) {
            throw new NullPointerException(AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[6]]);
        }
        if (lIllllIlIIIllIl(lllllllllllllIlIIIlllIlllIlllIlI)) {
            synchronized (this.attrs) {
                this.attrs.remove(lllllllllllllIlIIIlllIlllIllIlll);
                "".length();
                // monitorexit(this.attrs)
                "".length();
                if (-"   ".length() > 0) {
                    return null;
                }
            }
            "".length();
            if ("   ".length() <= ((19 + 66 - 25 + 75 ^ 143 + 12 + 16 + 3) & (97 + 91 - 185 + 156 ^ 48 + 91 - 32 + 75 ^ -" ".length()))) {
                return null;
            }
        }
        else {
            synchronized (this.attrs) {
                this.attrs.put(lllllllllllllIlIIIlllIlllIllIlll, lllllllllllllIlIIIlllIlllIlllIlI);
                "".length();
                // monitorexit(this.attrs)
                "".length();
                if (-"   ".length() > 0) {
                    return null;
                }
            }
        }
        final B lllllllllllllIlIIIlllIlllIlllIIl = (B)this;
        return lllllllllllllIlIIIlllIlllIlllIIl;
    }
    
    public ChannelFuture bind(final String lllllllllllllIlIIIlllIlllIIlllII, final int lllllllllllllIlIIIlllIlllIIllIll) {
        return this.bind(new InetSocketAddress(lllllllllllllIlIIIlllIlllIIlllII, lllllllllllllIlIIIlllIlllIIllIll));
    }
    
    private static boolean lIllllIlIIlIIlI(final int lllllllllllllIlIIIlllIlIlllIllll, final int lllllllllllllIlIIIlllIlIlllIllIl) {
        return lllllllllllllIlIIIlllIlIlllIllll < lllllllllllllIlIIIlllIlIlllIllIl;
    }
    
    public B localAddress(final String lllllllllllllIlIIIlllIllllIlllII, final int lllllllllllllIlIIIlllIllllIllIll) {
        return this.localAddress(new InetSocketAddress(lllllllllllllIlIIIlllIllllIlllII, lllllllllllllIlIIIlllIllllIllIll));
    }
    
    private static String lIllllIlIIIIIlI(final String lllllllllllllIlIIIlllIllIIlIIllI, final String lllllllllllllIlIIIlllIllIIlIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlllIllIIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlllIllIIlIIlIl.getBytes(StandardCharsets.UTF_8)), AbstractBootstrap.lIIIIllllIIlII[8]), "DES");
            final Cipher lllllllllllllIlIIIlllIllIIlIlIlI = Cipher.getInstance("DES");
            lllllllllllllIlIIIlllIllIIlIlIlI.init(AbstractBootstrap.lIIIIllllIIlII[2], lllllllllllllIlIIIlllIllIIlIlIll);
            return new String(lllllllllllllIlIIIlllIllIIlIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlllIllIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlllIllIIlIlIIl) {
            lllllllllllllIlIIIlllIllIIlIlIIl.printStackTrace();
            return null;
        }
    }
    
    private static void doBind0(final ChannelFuture lllllllllllllIlIIIlllIllIllIIllI, final Channel lllllllllllllIlIIIlllIllIllIlIIl, final SocketAddress lllllllllllllIlIIIlllIllIllIIlII, final ChannelPromise lllllllllllllIlIIIlllIllIllIIIll) {
        lllllllllllllIlIIIlllIllIllIlIIl.eventLoop().execute(new Runnable() {
            @Override
            public void run() {
                if (lIIIllllIIIIlIII(lllllllllllllIlIIIlllIllIllIIllI.isSuccess() ? 1 : 0)) {
                    lllllllllllllIlIIIlllIllIllIlIIl.bind(lllllllllllllIlIIIlllIllIllIIlII, lllllllllllllIlIIIlllIllIllIIIll).addListener((GenericFutureListener<? extends Future<? super Void>>)ChannelFutureListener.CLOSE_ON_FAILURE);
                    "".length();
                    "".length();
                    if ((0xBA ^ 0xBE) <= "   ".length()) {
                        return;
                    }
                }
                else {
                    lllllllllllllIlIIIlllIllIllIIIll.setFailure(lllllllllllllIlIIIlllIllIllIIllI.cause());
                    "".length();
                }
            }
            
            private static boolean lIIIllllIIIIlIII(final int llllllllllllIllIllllllllIlIllIlI) {
                return llllllllllllIllIllllllllIlIllIlI != 0;
            }
        });
    }
    
    public B localAddress(final int lllllllllllllIlIIIlllIlllllIIllI) {
        return this.localAddress(new InetSocketAddress(lllllllllllllIlIIIlllIlllllIIllI));
    }
    
    public B handler(final ChannelHandler lllllllllllllIlIIIlllIllIlIlllll) {
        if (lIllllIlIIIllIl(lllllllllllllIlIIIlllIllIlIlllll)) {
            throw new NullPointerException(AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[11]]);
        }
        this.handler = lllllllllllllIlIIIlllIllIlIlllll;
        return (B)this;
    }
    
    private static String lIllllIlIIIIIll(final String lllllllllllllIlIIIlllIllIIIllIll, final String lllllllllllllIlIIIlllIllIIIllIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlllIllIIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlllIllIIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIlllIllIIIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIlllIllIIIlllIl.init(AbstractBootstrap.lIIIIllllIIlII[2], lllllllllllllIlIIIlllIllIIIllllI);
            return new String(lllllllllllllIlIIIlllIllIIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlllIllIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlllIllIIIlllII) {
            lllllllllllllIlIIIlllIllIIIlllII.printStackTrace();
            return null;
        }
    }
    
    public B group(final EventLoopGroup lllllllllllllIlIIIlllIllllllllII) {
        if (lIllllIlIIIllIl(lllllllllllllIlIIIlllIllllllllII)) {
            throw new NullPointerException(AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[0]]);
        }
        if (lIllllIlIIIlllI(this.group)) {
            throw new IllegalStateException(AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[1]]);
        }
        this.group = lllllllllllllIlIIIlllIllllllllII;
        return (B)this;
    }
    
    private static String lIllllIlIIIIIIl(String lllllllllllllIlIIIlllIllIIIIIllI, final String lllllllllllllIlIIIlllIllIIIIIlIl) {
        lllllllllllllIlIIIlllIllIIIIIllI = new String(Base64.getDecoder().decode(lllllllllllllIlIIIlllIllIIIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIlllIllIIIIlIIl = new StringBuilder();
        final char[] lllllllllllllIlIIIlllIllIIIIlIII = lllllllllllllIlIIIlllIllIIIIIlIl.toCharArray();
        int lllllllllllllIlIIIlllIllIIIIIlll = AbstractBootstrap.lIIIIllllIIlII[0];
        final long lllllllllllllIlIIIlllIllIIIIIIIl = (Object)lllllllllllllIlIIIlllIllIIIIIllI.toCharArray();
        final char lllllllllllllIlIIIlllIllIIIIIIII = (char)lllllllllllllIlIIIlllIllIIIIIIIl.length;
        char lllllllllllllIlIIIlllIlIllllllll = (char)AbstractBootstrap.lIIIIllllIIlII[0];
        while (lIllllIlIIlIIlI(lllllllllllllIlIIIlllIlIllllllll, lllllllllllllIlIIIlllIllIIIIIIII)) {
            final char lllllllllllllIlIIIlllIllIIIIllII = lllllllllllllIlIIIlllIllIIIIIIIl[lllllllllllllIlIIIlllIlIllllllll];
            lllllllllllllIlIIIlllIllIIIIlIIl.append((char)(lllllllllllllIlIIIlllIllIIIIllII ^ lllllllllllllIlIIIlllIllIIIIlIII[lllllllllllllIlIIIlllIllIIIIIlll % lllllllllllllIlIIIlllIllIIIIlIII.length]));
            "".length();
            ++lllllllllllllIlIIIlllIllIIIIIlll;
            ++lllllllllllllIlIIIlllIlIllllllll;
            "".length();
            if (((0x47 ^ 0x4F) & ~(0x90 ^ 0x98)) != ((0xB0 ^ 0x91) & ~(0x39 ^ 0x18))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIlllIllIIIIlIIl);
    }
    
    public ChannelFuture bind(final SocketAddress lllllllllllllIlIIIlllIlllIIIlIIl) {
        this.validate();
        "".length();
        if (lIllllIlIIIllIl(lllllllllllllIlIIIlllIlllIIIlIIl)) {
            throw new NullPointerException(AbstractBootstrap.lIIIIlllIlllll[AbstractBootstrap.lIIIIllllIIlII[10]]);
        }
        return this.doBind(lllllllllllllIlIIIlllIlllIIIlIIl);
    }
    
    private static final class PendingRegistrationPromise extends DefaultChannelPromise
    {
        private static boolean lIllIIIllIIIIII(final int lllllllllllllIlIlIIllIlIlIlllllI) {
            return lllllllllllllIlIlIIllIlIlIlllllI != 0;
        }
        
        @Override
        protected EventExecutor executor() {
            if (lIllIIIllIIIIII(this.channel().isRegistered() ? 1 : 0)) {
                return super.executor();
            }
            return GlobalEventExecutor.INSTANCE;
        }
        
        private PendingRegistrationPromise(final Channel lllllllllllllIlIlIIllIlIllIIllII) {
            super(lllllllllllllIlIlIIllIlIllIIllII);
        }
    }
    
    private static final class BootstrapChannelFactory<T extends Channel> implements ChannelFactory<T>
    {
        private final /* synthetic */ Class<? extends T> clazz;
        private static final /* synthetic */ String[] llIllIlIllllII;
        private static final /* synthetic */ int[] llIllIlIllllIl;
        
        @Override
        public T newChannel() {
            try {
                return (T)this.clazz.newInstance();
            }
            catch (Throwable llllllllllllIllIIllIIllIlIllIIII) {
                throw new ChannelException(String.valueOf(new StringBuilder().append(BootstrapChannelFactory.llIllIlIllllII[BootstrapChannelFactory.llIllIlIllllIl[0]]).append(this.clazz)), llllllllllllIllIIllIIllIlIllIIII);
            }
        }
        
        private static void lIIllIIIIIlIIIlI() {
            (llIllIlIllllIl = new int[3])[0] = ((100 + 83 - 171 + 211 ^ 172 + 158 - 203 + 61) & (94 + 131 - 189 + 167 ^ 33 + 71 - 70 + 134 ^ -" ".length()));
            BootstrapChannelFactory.llIllIlIllllIl[1] = " ".length();
            BootstrapChannelFactory.llIllIlIllllIl[2] = "  ".length();
        }
        
        BootstrapChannelFactory(final Class<? extends T> llllllllllllIllIIllIIllIlIllIIll) {
            this.clazz = llllllllllllIllIIllIIllIlIllIIll;
        }
        
        private static String lIIllIIIIIlIIIII(String llllllllllllIllIIllIIllIlIIllIlI, final String llllllllllllIllIIllIIllIlIIllllI) {
            llllllllllllIllIIllIIllIlIIllIlI = new String(Base64.getDecoder().decode(llllllllllllIllIIllIIllIlIIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIIllIIllIlIIlllIl = new StringBuilder();
            final char[] llllllllllllIllIIllIIllIlIIlllII = llllllllllllIllIIllIIllIlIIllllI.toCharArray();
            int llllllllllllIllIIllIIllIlIIllIll = BootstrapChannelFactory.llIllIlIllllIl[0];
            final double llllllllllllIllIIllIIllIlIIlIlIl = (Object)llllllllllllIllIIllIIllIlIIllIlI.toCharArray();
            final String llllllllllllIllIIllIIllIlIIlIlII = (String)llllllllllllIllIIllIIllIlIIlIlIl.length;
            long llllllllllllIllIIllIIllIlIIlIIll = BootstrapChannelFactory.llIllIlIllllIl[0];
            while (lIIllIIIIIlIIIll((int)llllllllllllIllIIllIIllIlIIlIIll, (int)llllllllllllIllIIllIIllIlIIlIlII)) {
                final char llllllllllllIllIIllIIllIlIlIIIII = llllllllllllIllIIllIIllIlIIlIlIl[llllllllllllIllIIllIIllIlIIlIIll];
                llllllllllllIllIIllIIllIlIIlllIl.append((char)(llllllllllllIllIIllIIllIlIlIIIII ^ llllllllllllIllIIllIIllIlIIlllII[llllllllllllIllIIllIIllIlIIllIll % llllllllllllIllIIllIIllIlIIlllII.length]));
                "".length();
                ++llllllllllllIllIIllIIllIlIIllIll;
                ++llllllllllllIllIIllIIllIlIIlIIll;
                "".length();
                if ((0x6C ^ 0x68) < 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIIllIIllIlIIlllIl);
        }
        
        static {
            lIIllIIIIIlIIIlI();
            lIIllIIIIIlIIIIl();
        }
        
        private static void lIIllIIIIIlIIIIl() {
            (llIllIlIllllII = new String[BootstrapChannelFactory.llIllIlIllllIl[2]])[BootstrapChannelFactory.llIllIlIllllIl[0]] = lIIllIIIIIlIIIII("MBk2JQgAVyMoRAYFMiYQAFcULwULGTIrRAMFOCpEBhs2NBdF", "ewWGd");
            BootstrapChannelFactory.llIllIlIllllII[BootstrapChannelFactory.llIllIlIllllIl[1]] = lIIllIIIIIlIIIII("RiEvCRcb", "hBChd");
        }
        
        @Override
        public String toString() {
            return String.valueOf(new StringBuilder().append(StringUtil.simpleClassName(this.clazz)).append(BootstrapChannelFactory.llIllIlIllllII[BootstrapChannelFactory.llIllIlIllllIl[1]]));
        }
        
        private static boolean lIIllIIIIIlIIIll(final int llllllllllllIllIIllIIllIlIIIllll, final int llllllllllllIllIIllIIllIlIIIlllI) {
            return llllllllllllIllIIllIIllIlIIIllll < llllllllllllIllIIllIIllIlIIIlllI;
        }
    }
}
