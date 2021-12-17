// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network;

import io.netty.bootstrap.AbstractBootstrap;
import net.minecraft.crash.CrashReportCategory;
import java.util.Iterator;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.util.IChatComponent;
import net.minecraft.network.play.server.S40PacketDisconnect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ReportedException;
import java.util.concurrent.Callable;
import net.minecraft.crash.CrashReport;
import java.net.SocketAddress;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import io.netty.channel.socket.ServerSocketChannel;
import io.netty.channel.EventLoopGroup;
import java.util.Arrays;
import net.minecraft.server.network.NetHandlerHandshakeTCP;
import net.minecraft.util.MessageSerializer;
import net.minecraft.util.MessageSerializer2;
import net.minecraft.util.MessageDeserializer;
import net.minecraft.util.MessageDeserializer2;
import io.netty.channel.ChannelHandler;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.Channel;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.epoll.Epoll;
import java.net.InetAddress;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Collections;
import com.google.common.collect.Lists;
import org.apache.logging.log4j.Logger;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.ChannelFuture;
import io.netty.channel.local.LocalEventLoopGroup;
import java.util.List;
import io.netty.channel.epoll.EpollEventLoopGroup;
import net.minecraft.util.LazyLoadBase;
import net.minecraft.server.MinecraftServer;

public class NetworkSystem
{
    private final /* synthetic */ MinecraftServer mcServer;
    public static final /* synthetic */ LazyLoadBase<EpollEventLoopGroup> field_181141_b;
    public volatile /* synthetic */ boolean isAlive;
    private final /* synthetic */ List<NetworkManager> networkManagers;
    private static final /* synthetic */ String[] llllIIIllIlll;
    private static final /* synthetic */ int[] llllIIlIIIlIl;
    private final /* synthetic */ List<ChannelFuture> endpoints;
    public static final /* synthetic */ LazyLoadBase<NioEventLoopGroup> eventLoops;
    private static final /* synthetic */ Logger logger;
    
    public NetworkSystem(final MinecraftServer lllllllllllllIlIlllIlIlIIlIlllll) {
        this.endpoints = Collections.synchronizedList((List<ChannelFuture>)Lists.newArrayList());
        this.networkManagers = Collections.synchronizedList((List<NetworkManager>)Lists.newArrayList());
        this.mcServer = lllllllllllllIlIlllIlIlIIlIlllll;
        this.isAlive = (NetworkSystem.llllIIlIIIlIl[0] != 0);
    }
    
    private static String lIlIlIIIIIIIlII(final String lllllllllllllIlIlllIlIIllllllIII, final String lllllllllllllIlIlllIlIIllllllIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlllIlIIlllllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIlIIllllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlllIlIIlllllllII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlllIlIIlllllllII.init(NetworkSystem.llllIIlIIIlIl[2], lllllllllllllIlIlllIlIIlllllllIl);
            return new String(lllllllllllllIlIlllIlIIlllllllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIlIIllllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlllIlIIllllllIll) {
            lllllllllllllIlIlllIlIIllllllIll.printStackTrace();
            return null;
        }
    }
    
    public MinecraftServer getServer() {
        return this.mcServer;
    }
    
    private static String lIlIlIIIIIIIlIl(String lllllllllllllIlIlllIlIlIIIIIlIlI, final String lllllllllllllIlIlllIlIlIIIIIlllI) {
        lllllllllllllIlIlllIlIlIIIIIlIlI = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlllIlIlIIIIIlIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlllIlIlIIIIIllIl = new StringBuilder();
        final char[] lllllllllllllIlIlllIlIlIIIIIllII = lllllllllllllIlIlllIlIlIIIIIlllI.toCharArray();
        int lllllllllllllIlIlllIlIlIIIIIlIll = NetworkSystem.llllIIlIIIlIl[1];
        final long lllllllllllllIlIlllIlIlIIIIIIlIl = (Object)((String)lllllllllllllIlIlllIlIlIIIIIlIlI).toCharArray();
        final int lllllllllllllIlIlllIlIlIIIIIIlII = lllllllllllllIlIlllIlIlIIIIIIlIl.length;
        Exception lllllllllllllIlIlllIlIlIIIIIIIll = (Exception)NetworkSystem.llllIIlIIIlIl[1];
        while (lIlIlIIIIIllIlI((int)lllllllllllllIlIlllIlIlIIIIIIIll, lllllllllllllIlIlllIlIlIIIIIIlII)) {
            final char lllllllllllllIlIlllIlIlIIIIlIIII = lllllllllllllIlIlllIlIlIIIIIIlIl[lllllllllllllIlIlllIlIlIIIIIIIll];
            lllllllllllllIlIlllIlIlIIIIIllIl.append((char)(lllllllllllllIlIlllIlIlIIIIlIIII ^ lllllllllllllIlIlllIlIlIIIIIllII[lllllllllllllIlIlllIlIlIIIIIlIll % lllllllllllllIlIlllIlIlIIIIIllII.length]));
            "".length();
            ++lllllllllllllIlIlllIlIlIIIIIlIll;
            ++lllllllllllllIlIlllIlIlIIIIIIIll;
            "".length();
            if ((0xB5 ^ 0x97 ^ (0x7E ^ 0x58)) < ((0x33 ^ 0x48 ^ (0xF9 ^ 0x92)) & (150 + 56 - 71 + 55 ^ 132 + 142 - 153 + 53 ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlllIlIlIIIIIllIl);
    }
    
    private static void lIlIlIIIIIIIllI() {
        (llllIIIllIlll = new String[NetworkSystem.llllIIlIIIlIl[8]])[NetworkSystem.llllIIlIIIlIl[1]] = lIlIlIIIIIIIIll("TtpSUepNSdeV4Pi1re9RDSHKC4gnDeSGaKjbt3TlVgE=", "ETGZb");
        NetworkSystem.llllIIIllIlll[NetworkSystem.llllIIlIIIlIl[0]] = lIlIlIIIIIIIIll("nuRlQxzR90+3UxoQBdT08e61x3k7hMBIRuE0eUHgADg=", "amdaI");
        NetworkSystem.llllIIIllIlll[NetworkSystem.llllIIlIIIlIl[2]] = lIlIlIIIIIIIlII("I756bMWKVxrNEty/USZbEgH6iqisPxLi/ZpW/PzQBo5oFAw217Ejcw==", "RUrvi");
        NetworkSystem.llllIIIllIlll[NetworkSystem.llllIIlIIIlIl[3]] = lIlIlIIIIIIIlIl("JToVExAfNFYVHBw8BAFZEjwYFhwSJx8XFw==", "qSvxy");
        NetworkSystem.llllIIIllIlll[NetworkSystem.llllIIlIIIlIl[4]] = lIlIlIIIIIIIlIl("EAYSIj8qCFEqOSoBFCoiLQAf", "DoqIV");
        NetworkSystem.llllIIIllIlll[NetworkSystem.llllIIlIIIlIl[5]] = lIlIlIIIIIIIIll("rlTz4rLtabv0VXfPPewapg==", "EQztb");
        NetworkSystem.llllIIIllIlll[NetworkSystem.llllIIlIIIlIl[6]] = lIlIlIIIIIIIlII("at0mpguG3UYR2B/vI/7YW4qAPVWpVQDOkZmrlKkS6WA=", "rlptx");
        NetworkSystem.llllIIIllIlll[NetworkSystem.llllIIlIIIlIl[7]] = lIlIlIIIIIIIIll("GSL5dR/K17p+Sxwh6CQUglCWLtvw7Q8k", "Tsngs");
    }
    
    public void addLanEndpoint(final InetAddress lllllllllllllIlIlllIlIlIIlIlIlIl, final int lllllllllllllIlIlllIlIlIIlIlIlII) throws IOException {
        synchronized (this.endpoints) {
            Class<? extends ServerSocketChannel> lllllllllllllIlIlllIlIlIIlIlIIlI = null;
            LazyLoadBase<? extends EventLoopGroup> lllllllllllllIlIlllIlIlIIlIlIIII = null;
            if (lIlIlIIIIIllIII(Epoll.isAvailable() ? 1 : 0) && lIlIlIIIIIllIII(this.mcServer.func_181035_ah() ? 1 : 0)) {
                final Class<? extends ServerSocketChannel> lllllllllllllIlIlllIlIlIIlIlIIll = EpollServerSocketChannel.class;
                final LazyLoadBase<? extends EventLoopGroup> lllllllllllllIlIlllIlIlIIlIlIIIl = NetworkSystem.field_181141_b;
                NetworkSystem.logger.info(NetworkSystem.llllIIIllIlll[NetworkSystem.llllIIlIIIlIl[1]]);
                "".length();
                if ((0x1B ^ 0x1F) <= 0) {
                    return;
                }
            }
            else {
                lllllllllllllIlIlllIlIlIIlIlIIlI = NioServerSocketChannel.class;
                lllllllllllllIlIlllIlIlIIlIlIIII = NetworkSystem.eventLoops;
                NetworkSystem.logger.info(NetworkSystem.llllIIIllIlll[NetworkSystem.llllIIlIIIlIl[0]]);
            }
            this.endpoints.add(((AbstractBootstrap<ServerBootstrap, C>)((AbstractBootstrap<ServerBootstrap, Channel>)new ServerBootstrap()).channel(lllllllllllllIlIlllIlIlIIlIlIIlI).childHandler(new ChannelInitializer<Channel>() {
                private static final /* synthetic */ String[] lIlIIlIlIIllII;
                private static final /* synthetic */ int[] lIlIIlIlIIllIl;
                
                private static void lllIIllIIIlIlIl() {
                    (lIlIIlIlIIllIl = new int[10])[0] = " ".length();
                    NetworkSystem$4.lIlIIlIlIIllIl[1] = ((0xDC ^ 0xA7 ^ (0x1A ^ 0x79)) & (0x30 ^ 0xF ^ (0x2B ^ 0xC) ^ -" ".length()));
                    NetworkSystem$4.lIlIIlIlIIllIl[2] = (0x47 ^ 0x59);
                    NetworkSystem$4.lIlIIlIlIIllIl[3] = "  ".length();
                    NetworkSystem$4.lIlIIlIlIIllIl[4] = "   ".length();
                    NetworkSystem$4.lIlIIlIlIIllIl[5] = (0x72 ^ 0x76);
                    NetworkSystem$4.lIlIIlIlIIllIl[6] = (96 + 120 - 152 + 74 ^ 121 + 140 - 126 + 8);
                    NetworkSystem$4.lIlIIlIlIIllIl[7] = (0x86 ^ 0x80);
                    NetworkSystem$4.lIlIIlIlIIllIl[8] = (0x8E ^ 0x89);
                    NetworkSystem$4.lIlIIlIlIIllIl[9] = (0x2A ^ 0x22);
                }
                
                @Override
                protected void initChannel(final Channel lllllllllllllIIIllIllIllIIIIllIl) throws Exception {
                    try {
                        lllllllllllllIIIllIllIllIIIIllIl.config().setOption(ChannelOption.TCP_NODELAY, (boolean)(NetworkSystem$4.lIlIIlIlIIllIl[0] != 0));
                        "".length();
                        "".length();
                        if (((0x3 ^ 0x47) & ~(0xE1 ^ 0xA5)) <= -" ".length()) {
                            return;
                        }
                    }
                    catch (ChannelException ex) {}
                    lllllllllllllIIIllIllIllIIIIllIl.pipeline().addLast(NetworkSystem$4.lIlIIlIlIIllII[NetworkSystem$4.lIlIIlIlIIllIl[1]], new ReadTimeoutHandler(NetworkSystem$4.lIlIIlIlIIllIl[2])).addLast(NetworkSystem$4.lIlIIlIlIIllII[NetworkSystem$4.lIlIIlIlIIllIl[0]], new PingResponseHandler(NetworkSystem.this)).addLast(NetworkSystem$4.lIlIIlIlIIllII[NetworkSystem$4.lIlIIlIlIIllIl[3]], new MessageDeserializer2()).addLast(NetworkSystem$4.lIlIIlIlIIllII[NetworkSystem$4.lIlIIlIlIIllIl[4]], new MessageDeserializer(EnumPacketDirection.SERVERBOUND)).addLast(NetworkSystem$4.lIlIIlIlIIllII[NetworkSystem$4.lIlIIlIlIIllIl[5]], new MessageSerializer2()).addLast(NetworkSystem$4.lIlIIlIlIIllII[NetworkSystem$4.lIlIIlIlIIllIl[6]], new MessageSerializer(EnumPacketDirection.CLIENTBOUND));
                    "".length();
                    final NetworkManager lllllllllllllIIIllIllIllIIIIllII = new NetworkManager(EnumPacketDirection.SERVERBOUND);
                    NetworkSystem.this.networkManagers.add(lllllllllllllIIIllIllIllIIIIllII);
                    "".length();
                    lllllllllllllIIIllIllIllIIIIllIl.pipeline().addLast(NetworkSystem$4.lIlIIlIlIIllII[NetworkSystem$4.lIlIIlIlIIllIl[7]], lllllllllllllIIIllIllIllIIIIllII);
                    "".length();
                    lllllllllllllIIIllIllIllIIIIllII.setNetHandler(new NetHandlerHandshakeTCP(NetworkSystem.this.mcServer, lllllllllllllIIIllIllIllIIIIllII));
                }
                
                private static String lllIIllIIIlIIlI(String lllllllllllllIIIllIllIlIlllllIIl, final String lllllllllllllIIIllIllIlIlllllIII) {
                    lllllllllllllIIIllIllIlIlllllIIl = new String(Base64.getDecoder().decode(lllllllllllllIIIllIllIlIlllllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                    final StringBuilder lllllllllllllIIIllIllIlIllllllII = new StringBuilder();
                    final char[] lllllllllllllIIIllIllIlIlllllIll = lllllllllllllIIIllIllIlIlllllIII.toCharArray();
                    int lllllllllllllIIIllIllIlIlllllIlI = NetworkSystem$4.lIlIIlIlIIllIl[1];
                    final String lllllllllllllIIIllIllIlIllllIlII = (String)(Object)lllllllllllllIIIllIllIlIlllllIIl.toCharArray();
                    final double lllllllllllllIIIllIllIlIllllIIll = lllllllllllllIIIllIllIlIllllIlII.length;
                    short lllllllllllllIIIllIllIlIllllIIlI = (short)NetworkSystem$4.lIlIIlIlIIllIl[1];
                    while (lllIIllIIIlIllI(lllllllllllllIIIllIllIlIllllIIlI, (int)lllllllllllllIIIllIllIlIllllIIll)) {
                        final char lllllllllllllIIIllIllIlIllllllll = lllllllllllllIIIllIllIlIllllIlII[lllllllllllllIIIllIllIlIllllIIlI];
                        lllllllllllllIIIllIllIlIllllllII.append((char)(lllllllllllllIIIllIllIlIllllllll ^ lllllllllllllIIIllIllIlIlllllIll[lllllllllllllIIIllIllIlIlllllIlI % lllllllllllllIIIllIllIlIlllllIll.length]));
                        "".length();
                        ++lllllllllllllIIIllIllIlIlllllIlI;
                        ++lllllllllllllIIIllIllIlIllllIIlI;
                        "".length();
                        if ((80 + 21 - 37 + 117 ^ 163 + 150 - 230 + 94) == 0x0) {
                            return null;
                        }
                    }
                    return String.valueOf(lllllllllllllIIIllIllIlIllllllII);
                }
                
                private static String lllIIllIIIIllII(final String lllllllllllllIIIllIllIlIllIllIlI, final String lllllllllllllIIIllIllIlIllIllIll) {
                    try {
                        final SecretKeySpec lllllllllllllIIIllIllIlIllIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIllIlIllIllIll.getBytes(StandardCharsets.UTF_8)), NetworkSystem$4.lIlIIlIlIIllIl[9]), "DES");
                        final Cipher lllllllllllllIIIllIllIlIllIllllI = Cipher.getInstance("DES");
                        lllllllllllllIIIllIllIlIllIllllI.init(NetworkSystem$4.lIlIIlIlIIllIl[3], lllllllllllllIIIllIllIlIllIlllll);
                        return new String(lllllllllllllIIIllIllIlIllIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIllIlIllIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception lllllllllllllIIIllIllIlIllIlllIl) {
                        lllllllllllllIIIllIllIlIllIlllIl.printStackTrace();
                        return null;
                    }
                }
                
                private static String lllIIllIIIlIIll(final String lllllllllllllIIIllIllIlIlllIlIIl, final String lllllllllllllIIIllIllIlIlllIlIII) {
                    try {
                        final SecretKeySpec lllllllllllllIIIllIllIlIlllIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIllIlIlllIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                        final Cipher lllllllllllllIIIllIllIlIlllIlIll = Cipher.getInstance("Blowfish");
                        lllllllllllllIIIllIllIlIlllIlIll.init(NetworkSystem$4.lIlIIlIlIIllIl[3], lllllllllllllIIIllIllIlIlllIllII);
                        return new String(lllllllllllllIIIllIllIlIlllIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIllIlIlllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception lllllllllllllIIIllIllIlIlllIlIlI) {
                        lllllllllllllIIIllIllIlIlllIlIlI.printStackTrace();
                        return null;
                    }
                }
                
                private static void lllIIllIIIlIlII() {
                    (lIlIIlIlIIllII = new String[NetworkSystem$4.lIlIIlIlIIllIl[8]])[NetworkSystem$4.lIlIIlIlIIllIl[1]] = lllIIllIIIIllII("5BOZrVBzB7M=", "miiXP");
                    NetworkSystem$4.lIlIIlIlIIllII[NetworkSystem$4.lIlIIlIlIIllIl[0]] = lllIIllIIIIllII("UdioKeWDg7D5x7g7dkvpNQ==", "eEsQy");
                    NetworkSystem$4.lIlIIlIlIIllII[NetworkSystem$4.lIlIIlIlIIllIl[3]] = lllIIllIIIlIIlI("HBQ+BDYbASA=", "odRmB");
                    NetworkSystem$4.lIlIIlIlIIllII[NetworkSystem$4.lIlIIlIlIIllIl[4]] = lllIIllIIIlIIlI("NQYNGis0EQ==", "QcnuO");
                    NetworkSystem$4.lIlIIlIlIIllII[NetworkSystem$4.lIlIIlIlIIllIl[5]] = lllIIllIIIlIIlI("GzAtBQ0FJi0H", "kBHuh");
                    NetworkSystem$4.lIlIIlIlIIllII[NetworkSystem$4.lIlIIlIlIIllIl[6]] = lllIIllIIIIllII("HOVoAOrNM+w=", "tGoqF");
                    NetworkSystem$4.lIlIIlIlIIllII[NetworkSystem$4.lIlIIlIlIIllIl[7]] = lllIIllIIIlIIll("9NRxAo42LjsdSdUaPy0Mig==", "CjxFu");
                }
                
                static {
                    lllIIllIIIlIlIl();
                    lllIIllIIIlIlII();
                }
                
                private static boolean lllIIllIIIlIllI(final int lllllllllllllIIIllIllIlIllIlIlII, final int lllllllllllllIIIllIllIlIllIlIIll) {
                    return lllllllllllllIIIllIllIlIllIlIlII < lllllllllllllIIIllIllIlIllIlIIll;
                }
            }).group((EventLoopGroup)lllllllllllllIlIlllIlIlIIlIlIIII.getValue())).localAddress(lllllllllllllIlIlllIlIlIIlIlIlIl, lllllllllllllIlIlllIlIlIIlIlIlII).bind().syncUninterruptibly());
            "".length();
            // monitorexit(this.endpoints)
            "".length();
            if ("  ".length() < 0) {
                return;
            }
        }
    }
    
    static {
        lIlIlIIIIIlIlll();
        lIlIlIIIIIIIllI();
        logger = LogManager.getLogger();
        eventLoops = new LazyLoadBase<NioEventLoopGroup>() {
            private static final /* synthetic */ int[] llIllllIIllIlI;
            private static final /* synthetic */ String[] llIllllIIllIIl;
            
            private static void lIIllIlIlIIlIIll() {
                (llIllllIIllIIl = new String[NetworkSystem$1.llIllllIIllIlI[1]])[NetworkSystem$1.llIllllIIllIlI[0]] = lIIllIlIlIIlIIlI("T/3dQ0hyq6ZP5ht91OdB6o2klHuCHbwk", "dUWmu");
            }
            
            private static String lIIllIlIlIIlIIlI(final String llllllllllllIllIIIllllIIIIIIlIlI, final String llllllllllllIllIIIllllIIIIIIIlll) {
                try {
                    final SecretKeySpec llllllllllllIllIIIllllIIIIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllllIIIIIIIlll.getBytes(StandardCharsets.UTF_8)), NetworkSystem$1.llIllllIIllIlI[2]), "DES");
                    final Cipher llllllllllllIllIIIllllIIIIIIllII = Cipher.getInstance("DES");
                    llllllllllllIllIIIllllIIIIIIllII.init(NetworkSystem$1.llIllllIIllIlI[3], llllllllllllIllIIIllllIIIIIIllIl);
                    return new String(llllllllllllIllIIIllllIIIIIIllII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllllIIIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIllIIIllllIIIIIIlIll) {
                    llllllllllllIllIIIllllIIIIIIlIll.printStackTrace();
                    return null;
                }
            }
            
            @Override
            protected NioEventLoopGroup load() {
                return new NioEventLoopGroup(NetworkSystem$1.llIllllIIllIlI[0], new ThreadFactoryBuilder().setNameFormat(NetworkSystem$1.llIllllIIllIIl[NetworkSystem$1.llIllllIIllIlI[0]]).setDaemon((boolean)(NetworkSystem$1.llIllllIIllIlI[1] != 0)).build());
            }
            
            static {
                lIIllIlIlIIlIlII();
                lIIllIlIlIIlIIll();
            }
            
            private static void lIIllIlIlIIlIlII() {
                (llIllllIIllIlI = new int[4])[0] = ((0x2A ^ 0x6E) & ~(0xE4 ^ 0xA0));
                NetworkSystem$1.llIllllIIllIlI[1] = " ".length();
                NetworkSystem$1.llIllllIIllIlI[2] = (0x66 ^ 0x74 ^ (0x78 ^ 0x62));
                NetworkSystem$1.llIllllIIllIlI[3] = "  ".length();
            }
        };
        field_181141_b = new LazyLoadBase<EpollEventLoopGroup>() {
            private static final /* synthetic */ String[] llIIIIIlllIlIl;
            private static final /* synthetic */ int[] llIIIIIllllIIl;
            
            private static void lIIIIlllIlllllll() {
                (llIIIIIlllIlIl = new String[NetworkSystem$2.llIIIIIllllIIl[1]])[NetworkSystem$2.llIIIIIllllIIl[0]] = lIIIIlllIlllllIl("RSJKwTD7YFgbVo3qN4+3RjhYPFaDTuJiGdqBDYWUH4I=", "oCSFL");
            }
            
            static {
                lIIIIllllIIIIIIl();
                lIIIIlllIlllllll();
            }
            
            private static void lIIIIllllIIIIIIl() {
                (llIIIIIllllIIl = new int[3])[0] = ((0x3F ^ 0x44 ^ (0xCF ^ 0xB1)) & (30 + 76 + 20 + 53 ^ 100 + 71 - 60 + 71 ^ -" ".length()));
                NetworkSystem$2.llIIIIIllllIIl[1] = " ".length();
                NetworkSystem$2.llIIIIIllllIIl[2] = "  ".length();
            }
            
            private static String lIIIIlllIlllllIl(final String llllllllllllIlllIlllIlIlIIlIllll, final String llllllllllllIlllIlllIlIlIIllIIII) {
                try {
                    final SecretKeySpec llllllllllllIlllIlllIlIlIIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlllIlIlIIllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher llllllllllllIlllIlllIlIlIIllIIll = Cipher.getInstance("Blowfish");
                    llllllllllllIlllIlllIlIlIIllIIll.init(NetworkSystem$2.llIIIIIllllIIl[2], llllllllllllIlllIlllIlIlIIllIlII);
                    return new String(llllllllllllIlllIlllIlIlIIllIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlllIlIlIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlllIlllIlIlIIllIIlI) {
                    llllllllllllIlllIlllIlIlIIllIIlI.printStackTrace();
                    return null;
                }
            }
            
            @Override
            protected EpollEventLoopGroup load() {
                return new EpollEventLoopGroup(NetworkSystem$2.llIIIIIllllIIl[0], new ThreadFactoryBuilder().setNameFormat(NetworkSystem$2.llIIIIIlllIlIl[NetworkSystem$2.llIIIIIllllIIl[0]]).setDaemon((boolean)(NetworkSystem$2.llIIIIIllllIIl[1] != 0)).build());
            }
        };
        SERVER_LOCAL_EVENTLOOP = new LazyLoadBase<LocalEventLoopGroup>() {
            private static final /* synthetic */ String[] lllIIIlIllIlIl;
            private static final /* synthetic */ int[] lllIIIlIllIllI;
            
            private static void lIIlllIllIlIIllI() {
                (lllIIIlIllIlIl = new String[NetworkSystem$3.lllIIIlIllIllI[1]])[NetworkSystem$3.lllIIIlIllIllI[0]] = lIIlllIllIlIIlIl("IisjMhNMAjglCwBuBCMYGislZiMjbnRjDg==", "lNWFj");
            }
            
            @Override
            protected LocalEventLoopGroup load() {
                return new LocalEventLoopGroup(NetworkSystem$3.lllIIIlIllIllI[0], new ThreadFactoryBuilder().setNameFormat(NetworkSystem$3.lllIIIlIllIlIl[NetworkSystem$3.lllIIIlIllIllI[0]]).setDaemon((boolean)(NetworkSystem$3.lllIIIlIllIllI[1] != 0)).build());
            }
            
            private static boolean lIIlllIllIlIlIII(final int llllllllllllIllIIIIIIlIIlIllIllI, final int llllllllllllIllIIIIIIlIIlIllIlIl) {
                return llllllllllllIllIIIIIIlIIlIllIllI < llllllllllllIllIIIIIIlIIlIllIlIl;
            }
            
            static {
                lIIlllIllIlIIlll();
                lIIlllIllIlIIllI();
            }
            
            private static void lIIlllIllIlIIlll() {
                (lllIIIlIllIllI = new int[2])[0] = ((0x24 ^ 0x63) & ~(0x24 ^ 0x63));
                NetworkSystem$3.lllIIIlIllIllI[1] = " ".length();
            }
            
            private static String lIIlllIllIlIIlIl(String llllllllllllIllIIIIIIlIIllIIIllI, final String llllllllllllIllIIIIIIlIIllIIIlIl) {
                llllllllllllIllIIIIIIlIIllIIIllI = new String(Base64.getDecoder().decode(llllllllllllIllIIIIIIlIIllIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIllIIIIIIlIIllIIIlII = new StringBuilder();
                final char[] llllllllllllIllIIIIIIlIIllIIIIll = llllllllllllIllIIIIIIlIIllIIIlIl.toCharArray();
                int llllllllllllIllIIIIIIlIIllIIIIlI = NetworkSystem$3.lllIIIlIllIllI[0];
                final int llllllllllllIllIIIIIIlIIlIllllII = (Object)llllllllllllIllIIIIIIlIIllIIIllI.toCharArray();
                final short llllllllllllIllIIIIIIlIIlIlllIll = (short)llllllllllllIllIIIIIIlIIlIllllII.length;
                double llllllllllllIllIIIIIIlIIlIlllIlI = NetworkSystem$3.lllIIIlIllIllI[0];
                while (lIIlllIllIlIlIII((int)llllllllllllIllIIIIIIlIIlIlllIlI, llllllllllllIllIIIIIIlIIlIlllIll)) {
                    final char llllllllllllIllIIIIIIlIIllIIIlll = llllllllllllIllIIIIIIlIIlIllllII[llllllllllllIllIIIIIIlIIlIlllIlI];
                    llllllllllllIllIIIIIIlIIllIIIlII.append((char)(llllllllllllIllIIIIIIlIIllIIIlll ^ llllllllllllIllIIIIIIlIIllIIIIll[llllllllllllIllIIIIIIlIIllIIIIlI % llllllllllllIllIIIIIIlIIllIIIIll.length]));
                    "".length();
                    ++llllllllllllIllIIIIIIlIIllIIIIlI;
                    ++llllllllllllIllIIIIIIlIIlIlllIlI;
                    "".length();
                    if (" ".length() == 0) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIllIIIIIIlIIllIIIlII);
            }
        };
    }
    
    public SocketAddress addLocalEndpoint() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        net/minecraft/network/NetworkSystem.endpoints:Ljava/util/List;
        //     4: dup            
        //     5: astore_2        /* lllllllllllllIlIlllIlIlIIlIIIIIl */
        //     6: monitorenter   
        //     7: new             Lio/netty/bootstrap/ServerBootstrap;
        //    10: dup            
        //    11: invokespecial   io/netty/bootstrap/ServerBootstrap.<init>:()V
        //    14: ldc_w           Lio/netty/channel/local/LocalServerChannel;.class
        //    17: invokevirtual   io/netty/bootstrap/ServerBootstrap.channel:(Ljava/lang/Class;)Lio/netty/bootstrap/AbstractBootstrap;
        //    20: checkcast       Lio/netty/bootstrap/ServerBootstrap;
        //    23: new             Lnet/minecraft/network/NetworkSystem$5;
        //    26: dup            
        //    27: aload_0         /* lllllllllllllIlIlllIlIlIIlIIIllI */
        //    28: invokespecial   net/minecraft/network/NetworkSystem$5.<init>:(Lnet/minecraft/network/NetworkSystem;)V
        //    31: invokevirtual   io/netty/bootstrap/ServerBootstrap.childHandler:(Lio/netty/channel/ChannelHandler;)Lio/netty/bootstrap/ServerBootstrap;
        //    34: getstatic       net/minecraft/network/NetworkSystem.eventLoops:Lnet/minecraft/util/LazyLoadBase;
        //    37: invokevirtual   net/minecraft/util/LazyLoadBase.getValue:()Ljava/lang/Object;
        //    40: checkcast       Lio/netty/channel/EventLoopGroup;
        //    43: invokevirtual   io/netty/bootstrap/ServerBootstrap.group:(Lio/netty/channel/EventLoopGroup;)Lio/netty/bootstrap/ServerBootstrap;
        //    46: getstatic       io/netty/channel/local/LocalAddress.ANY:Lio/netty/channel/local/LocalAddress;
        //    49: invokevirtual   io/netty/bootstrap/ServerBootstrap.localAddress:(Ljava/net/SocketAddress;)Lio/netty/bootstrap/AbstractBootstrap;
        //    52: checkcast       Lio/netty/bootstrap/ServerBootstrap;
        //    55: invokevirtual   io/netty/bootstrap/ServerBootstrap.bind:()Lio/netty/channel/ChannelFuture;
        //    58: invokeinterface io/netty/channel/ChannelFuture.syncUninterruptibly:()Lio/netty/channel/ChannelFuture;
        //    63: astore_1        /* lllllllllllllIlIlllIlIlIIlIIIlIl */
        //    64: aload_0         /* lllllllllllllIlIlllIlIlIIlIIIllI */
        //    65: getfield        net/minecraft/network/NetworkSystem.endpoints:Ljava/util/List;
        //    68: aload_1         /* lllllllllllllIlIlllIlIlIIlIIIlIl */
        //    69: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    74: ldc             ""
        //    76: invokevirtual   java/lang/String.length:()I
        //    79: pop2           
        //    80: aload_2         /* lllllllllllllIlIlllIlIlIIlIIIIIl */
        //    81: monitorexit    
        //    82: ldc             ""
        //    84: invokevirtual   java/lang/String.length:()I
        //    87: pop            
        //    88: ldc             " "
        //    90: invokevirtual   java/lang/String.length:()I
        //    93: ifgt            101
        //    96: aconst_null    
        //    97: areturn        
        //    98: aload_2         /* lllllllllllllIlIlllIlIlIIlIIIIIl */
        //    99: monitorexit    
        //   100: athrow         
        //   101: aload_1         /* lllllllllllllIlIlllIlIlIIlIIIlII */
        //   102: invokeinterface io/netty/channel/ChannelFuture.channel:()Lio/netty/channel/Channel;
        //   107: invokeinterface io/netty/channel/Channel.localAddress:()Ljava/net/SocketAddress;
        //   112: areturn        
        //    StackMapTable: 00 02 FF 00 62 00 03 07 00 02 00 07 01 4A 00 01 07 01 67 FF 00 02 00 03 07 00 02 07 01 45 07 01 4A 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  7      82     98     101    Any
        //  98     100    98     101    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static boolean lIlIlIIIIIllIlI(final int lllllllllllllIlIlllIlIIllllIIlIl, final int lllllllllllllIlIlllIlIIllllIIlII) {
        return lllllllllllllIlIlllIlIIllllIIlIl < lllllllllllllIlIlllIlIIllllIIlII;
    }
    
    public void terminateEndpoints() {
        this.isAlive = (NetworkSystem.llllIIlIIIlIl[1] != 0);
        final boolean lllllllllllllIlIlllIlIlIIIllIlll = (boolean)this.endpoints.iterator();
        "".length();
        if (-(0xA4 ^ 0xA0) >= 0) {
            return;
        }
        while (!lIlIlIIIIIllIIl(((Iterator)lllllllllllllIlIlllIlIlIIIllIlll).hasNext() ? 1 : 0)) {
            final ChannelFuture lllllllllllllIlIlllIlIlIIIlllIll = ((Iterator<ChannelFuture>)lllllllllllllIlIlllIlIlIIIllIlll).next();
            try {
                lllllllllllllIlIlllIlIlIIIlllIll.channel().close().sync();
                "".length();
                "".length();
                if (-(0x7 ^ 0x3) >= 0) {
                    return;
                }
                continue;
            }
            catch (InterruptedException lllllllllllllIlIlllIlIlIIIlllIlI) {
                NetworkSystem.logger.error(NetworkSystem.llllIIIllIlll[NetworkSystem.llllIIlIIIlIl[2]]);
            }
        }
    }
    
    private static boolean lIlIlIIIIIllIIl(final int lllllllllllllIlIlllIlIIllllIIIII) {
        return lllllllllllllIlIlllIlIIllllIIIII == 0;
    }
    
    public void networkTick() {
        synchronized (this.networkManagers) {
            final Iterator<NetworkManager> lllllllllllllIlIlllIlIlIIIlIllIl = this.networkManagers.iterator();
            "".length();
            if (null != null) {
                return;
            }
            while (!lIlIlIIIIIllIIl(lllllllllllllIlIlllIlIlIIIlIllIl.hasNext() ? 1 : 0)) {
                final NetworkManager lllllllllllllIlIlllIlIlIIIlIllII = lllllllllllllIlIlllIlIlIIIlIllIl.next();
                if (lIlIlIIIIIllIIl(lllllllllllllIlIlllIlIlIIIlIllII.hasNoChannel() ? 1 : 0)) {
                    if (lIlIlIIIIIllIIl(lllllllllllllIlIlllIlIlIIIlIllII.isChannelOpen() ? 1 : 0)) {
                        lllllllllllllIlIlllIlIlIIIlIllIl.remove();
                        lllllllllllllIlIlllIlIlIIIlIllII.checkDisconnected();
                        "".length();
                        if ("   ".length() != "   ".length()) {
                            return;
                        }
                        continue;
                    }
                    else {
                        try {
                            lllllllllllllIlIlllIlIlIIIlIllII.processReceivedPackets();
                            "".length();
                            if (" ".length() < 0) {
                                return;
                            }
                            continue;
                        }
                        catch (Exception lllllllllllllIlIlllIlIlIIIlIlIll) {
                            if (lIlIlIIIIIllIII(lllllllllllllIlIlllIlIlIIIlIllII.isLocalChannel() ? 1 : 0)) {
                                final CrashReport lllllllllllllIlIlllIlIlIIIlIlIlI = CrashReport.makeCrashReport(lllllllllllllIlIlllIlIlIIIlIlIll, NetworkSystem.llllIIIllIlll[NetworkSystem.llllIIlIIIlIl[3]]);
                                final CrashReportCategory lllllllllllllIlIlllIlIlIIIlIlIIl = lllllllllllllIlIlllIlIlIIIlIlIlI.makeCategory(NetworkSystem.llllIIIllIlll[NetworkSystem.llllIIlIIIlIl[4]]);
                                lllllllllllllIlIlllIlIlIIIlIlIIl.addCrashSectionCallable(NetworkSystem.llllIIIllIlll[NetworkSystem.llllIIlIIIlIl[5]], new Callable<String>() {
                                    @Override
                                    public String call() throws Exception {
                                        return lllllllllllllIlIlllIlIlIIIlIllII.toString();
                                    }
                                });
                                throw new ReportedException(lllllllllllllIlIlllIlIlIIIlIlIlI);
                            }
                            NetworkSystem.logger.warn(String.valueOf(new StringBuilder(NetworkSystem.llllIIIllIlll[NetworkSystem.llllIIlIIIlIl[6]]).append(lllllllllllllIlIlllIlIlIIIlIllII.getRemoteAddress())), (Throwable)lllllllllllllIlIlllIlIlIIIlIlIll);
                            final ChatComponentText lllllllllllllIlIlllIlIlIIIlIlIII = new ChatComponentText(NetworkSystem.llllIIIllIlll[NetworkSystem.llllIIlIIIlIl[7]]);
                            lllllllllllllIlIlllIlIlIIIlIllII.sendPacket(new S40PacketDisconnect(lllllllllllllIlIlllIlIlIIIlIlIII), new GenericFutureListener<Future<? super Void>>() {
                                @Override
                                public void operationComplete(final Future<? super Void> llllllllllllIlllIllIlllllIIllIIl) throws Exception {
                                    lllllllllllllIlIlllIlIlIIIlIllII.closeChannel(lllllllllllllIlIlllIlIlIIIlIlIII);
                                }
                            }, (GenericFutureListener<? extends Future<? super Void>>[])new GenericFutureListener[NetworkSystem.llllIIlIIIlIl[1]]);
                            lllllllllllllIlIlllIlIlIIIlIllII.disableAutoRead();
                        }
                    }
                }
            }
            // monitorexit(this.networkManagers)
            "".length();
            if ("  ".length() > (6 + 117 + 11 + 43 ^ 97 + 175 - 136 + 45)) {
                return;
            }
        }
    }
    
    private static boolean lIlIlIIIIIllIII(final int lllllllllllllIlIlllIlIIllllIIIlI) {
        return lllllllllllllIlIlllIlIIllllIIIlI != 0;
    }
    
    private static void lIlIlIIIIIlIlll() {
        (llllIIlIIIlIl = new int[9])[0] = " ".length();
        NetworkSystem.llllIIlIIIlIl[1] = ((0x45 ^ 0x7 ^ (0xE ^ 0x14)) & (0xAE ^ 0x99 ^ (0xD ^ 0x62) ^ -" ".length()));
        NetworkSystem.llllIIlIIIlIl[2] = "  ".length();
        NetworkSystem.llllIIlIIIlIl[3] = "   ".length();
        NetworkSystem.llllIIlIIIlIl[4] = (0xDE ^ 0xC2 ^ (0x47 ^ 0x5F));
        NetworkSystem.llllIIlIIIlIl[5] = (0x7 ^ 0x3 ^ " ".length());
        NetworkSystem.llllIIlIIIlIl[6] = (0x4D ^ 0x4B);
        NetworkSystem.llllIIlIIIlIl[7] = (0x4F ^ 0x48);
        NetworkSystem.llllIIlIIIlIl[8] = (0x54 ^ 0x33 ^ (0xF9 ^ 0x96));
    }
    
    private static String lIlIlIIIIIIIIll(final String lllllllllllllIlIlllIlIIllllIlIll, final String lllllllllllllIlIlllIlIIllllIllII) {
        try {
            final SecretKeySpec lllllllllllllIlIlllIlIIlllllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIlIIllllIllII.getBytes(StandardCharsets.UTF_8)), NetworkSystem.llllIIlIIIlIl[8]), "DES");
            final Cipher lllllllllllllIlIlllIlIIllllIllll = Cipher.getInstance("DES");
            lllllllllllllIlIlllIlIIllllIllll.init(NetworkSystem.llllIIlIIIlIl[2], lllllllllllllIlIlllIlIIlllllIIII);
            return new String(lllllllllllllIlIlllIlIIllllIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIlIIllllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlllIlIIllllIlllI) {
            lllllllllllllIlIlllIlIIllllIlllI.printStackTrace();
            return null;
        }
    }
}
