// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network;

import io.netty.bootstrap.AbstractBootstrap;
import io.netty.channel.local.LocalServerChannel;
import net.minecraft.util.ChatComponentText;
import com.google.common.collect.Queues;
import net.minecraft.util.ITickable;
import io.netty.channel.local.LocalChannel;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.LogManager;
import net.minecraft.util.CryptManager;
import javax.crypto.SecretKey;
import io.netty.handler.timeout.TimeoutException;
import net.minecraft.util.ChatComponentTranslation;
import org.apache.commons.lang3.ArrayUtils;
import io.netty.channel.socket.SocketChannel;
import net.minecraft.util.MessageSerializer;
import net.minecraft.util.MessageSerializer2;
import net.minecraft.util.MessageDeserializer;
import net.minecraft.util.MessageDeserializer2;
import io.netty.channel.ChannelHandler;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelOption;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.epoll.Epoll;
import java.net.InetAddress;
import org.apache.commons.lang3.Validate;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.Queue;
import io.netty.channel.Channel;
import io.netty.channel.local.LocalEventLoopGroup;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import io.netty.channel.nio.NioEventLoopGroup;
import org.apache.logging.log4j.Logger;
import net.minecraft.util.IChatComponent;
import io.netty.util.AttributeKey;
import java.net.SocketAddress;
import io.netty.channel.epoll.EpollEventLoopGroup;
import net.minecraft.util.LazyLoadBase;
import org.apache.logging.log4j.Marker;
import io.netty.channel.SimpleChannelInboundHandler;

public class NetworkManager extends SimpleChannelInboundHandler<Packet>
{
    public static final /* synthetic */ LazyLoadBase<EpollEventLoopGroup> field_181125_e;
    private /* synthetic */ SocketAddress socketAddress;
    public static final /* synthetic */ Marker logMarkerNetwork;
    public static final /* synthetic */ AttributeKey<EnumConnectionState> attrKeyConnectionState;
    private /* synthetic */ IChatComponent terminationReason;
    private static final /* synthetic */ String[] lllIIlllIIIIlI;
    private static final /* synthetic */ Logger logger;
    public static final /* synthetic */ LazyLoadBase<NioEventLoopGroup> CLIENT_NIO_EVENTLOOP;
    private final /* synthetic */ ReentrantReadWriteLock field_181680_j;
    public static final /* synthetic */ LazyLoadBase<LocalEventLoopGroup> CLIENT_LOCAL_EVENTLOOP;
    private /* synthetic */ INetHandler packetListener;
    private /* synthetic */ boolean disconnected;
    private static final /* synthetic */ int[] lllIIlllIIIlll;
    private /* synthetic */ Channel channel;
    private /* synthetic */ boolean isEncrypted;
    private final /* synthetic */ EnumPacketDirection direction;
    private final /* synthetic */ Queue<InboundHandlerTuplePacketListener> outboundPacketsQueue;
    
    private static boolean lIlIIIIIlIllIlII(final Object llllllllllllIlIlllIllIlIlllIlIll, final Object llllllllllllIlIlllIllIlIlllIlIlI) {
        return llllllllllllIlIlllIllIlIlllIlIll != llllllllllllIlIlllIllIlIlllIlIlI;
    }
    
    private void dispatchPacket(final Packet llllllllllllIlIlllIllIlllIIIIIlI, final GenericFutureListener<? extends Future<? super Void>>[] llllllllllllIlIlllIllIlllIIIIIIl) {
        final EnumConnectionState llllllllllllIlIlllIllIlllIIIIllI = EnumConnectionState.getFromPacket(llllllllllllIlIlllIllIlllIIIIIlI);
        final EnumConnectionState llllllllllllIlIlllIllIlllIIIIlIl = this.channel.attr(NetworkManager.attrKeyConnectionState).get();
        if (lIlIIIIIlIllIlII(llllllllllllIlIlllIllIlllIIIIlIl, llllllllllllIlIlllIllIlllIIIIllI)) {
            NetworkManager.logger.debug(NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[10]]);
            this.channel.config().setAutoRead((boolean)(NetworkManager.lllIIlllIIIlll[0] != 0));
            "".length();
        }
        if (lIlIIIIIlIllIIll(this.channel.eventLoop().inEventLoop() ? 1 : 0)) {
            if (lIlIIIIIlIllIlII(llllllllllllIlIlllIllIlllIIIIllI, llllllllllllIlIlllIllIlllIIIIlIl)) {
                this.setConnectionState(llllllllllllIlIlllIllIlllIIIIllI);
            }
            final ChannelFuture llllllllllllIlIlllIllIlllIIIIlII = this.channel.writeAndFlush(llllllllllllIlIlllIllIlllIIIIIlI);
            if (lIlIIIIIlIllIlIl(llllllllllllIlIlllIllIlllIIIIIIl)) {
                llllllllllllIlIlllIllIlllIIIIlII.addListeners(llllllllllllIlIlllIllIlllIIIIIIl);
                "".length();
            }
            llllllllllllIlIlllIllIlllIIIIlII.addListener((GenericFutureListener<? extends Future<? super Void>>)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
            "".length();
            "".length();
            if ((111 + 10 + 26 + 25 ^ 45 + 19 + 38 + 66) <= 0) {
                return;
            }
        }
        else {
            this.channel.eventLoop().execute(new Runnable() {
                @Override
                public void run() {
                    if (lIllIIlIlIIlIll(llllllllllllIlIlllIllIlllIIIIllI, llllllllllllIlIlllIllIlllIIIIlIl)) {
                        NetworkManager.this.setConnectionState(llllllllllllIlIlllIllIlllIIIIllI);
                    }
                    final ChannelFuture lllllllllllllIlIlIIlIIlllIIlIlIl = NetworkManager.this.channel.writeAndFlush(llllllllllllIlIlllIllIlllIIIIIlI);
                    if (lIllIIlIlIIllII(llllllllllllIlIlllIllIlllIIIIIIl)) {
                        lllllllllllllIlIlIIlIIlllIIlIlIl.addListeners((GenericFutureListener<? extends Future<? super Void>>[])llllllllllllIlIlllIllIlllIIIIIIl);
                        "".length();
                    }
                    lllllllllllllIlIlIIlIIlllIIlIlIl.addListener((GenericFutureListener<? extends Future<? super Void>>)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
                    "".length();
                }
                
                private static boolean lIllIIlIlIIllII(final Object lllllllllllllIlIlIIlIIlllIIIllIl) {
                    return lllllllllllllIlIlIIlIIlllIIIllIl != null;
                }
                
                private static boolean lIllIIlIlIIlIll(final Object lllllllllllllIlIlIIlIIlllIIlIIII, final Object lllllllllllllIlIlIIlIIlllIIIllll) {
                    return lllllllllllllIlIlIIlIIlllIIlIIII != lllllllllllllIlIlIIlIIlllIIIllll;
                }
            });
        }
    }
    
    public INetHandler getNetHandler() {
        return this.packetListener;
    }
    
    @Override
    protected void channelRead0(final ChannelHandlerContext llllllllllllIlIlllIllIlllIllIIII, final Packet llllllllllllIlIlllIllIlllIlIllIl) throws Exception {
        if (lIlIIIIIlIllIIll(this.channel.isOpen() ? 1 : 0)) {
            try {
                llllllllllllIlIlllIllIlllIlIllIl.processPacket(this.packetListener);
                "".length();
                if (-(0x93 ^ 0xC5 ^ (0x76 ^ 0x24)) > 0) {
                    return;
                }
            }
            catch (ThreadQuickExitException ex) {}
        }
    }
    
    public void setNetHandler(final INetHandler llllllllllllIlIlllIllIlllIlIlIII) {
        Validate.notNull((Object)llllllllllllIlIlllIllIlllIlIlIII, NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[8]], new Object[NetworkManager.lllIIlllIIIlll[0]]);
        "".length();
        final Logger logger = NetworkManager.logger;
        final String s = NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[9]];
        final Object[] array = new Object[NetworkManager.lllIIlllIIIlll[2]];
        array[NetworkManager.lllIIlllIIIlll[0]] = this;
        array[NetworkManager.lllIIlllIIIlll[1]] = llllllllllllIlIlllIllIlllIlIlIII;
        logger.debug(s, array);
        this.packetListener = llllllllllllIlIlllIllIlllIlIlIII;
    }
    
    public void sendPacket(final Packet llllllllllllIlIlllIllIlllIIlllll) {
        if (lIlIIIIIlIllIIll(this.isChannelOpen() ? 1 : 0)) {
            this.flushOutboundQueue();
            this.dispatchPacket(llllllllllllIlIlllIllIlllIIlllll, null);
            "".length();
            if (-" ".length() == "  ".length()) {
                return;
            }
        }
        else {
            this.field_181680_j.writeLock().lock();
            try {
                this.outboundPacketsQueue.add(new InboundHandlerTuplePacketListener(llllllllllllIlIlllIllIlllIIlllll, (GenericFutureListener<? extends Future<? super Void>>[])null));
                "".length();
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            }
            finally {
                this.field_181680_j.writeLock().unlock();
            }
            this.field_181680_j.writeLock().unlock();
        }
    }
    
    public boolean isChannelOpen() {
        if (lIlIIIIIlIllIlIl(this.channel) && lIlIIIIIlIllIIll(this.channel.isOpen() ? 1 : 0)) {
            return NetworkManager.lllIIlllIIIlll[1] != 0;
        }
        return NetworkManager.lllIIlllIIIlll[0] != 0;
    }
    
    private static boolean lIlIIIIIlIllIlIl(final Object llllllllllllIlIlllIllIlIlllIlIII) {
        return llllllllllllIlIlllIllIlIlllIlIII != null;
    }
    
    private static boolean lIlIIIIIlIllIllI(final int llllllllllllIlIlllIllIlIlllIIIlI) {
        return llllllllllllIlIlllIllIlIlllIIIlI == 0;
    }
    
    private static boolean lIlIIIIIlIllIIll(final int llllllllllllIlIlllIllIlIlllIIlII) {
        return llllllllllllIlIlllIllIlIlllIIlII != 0;
    }
    
    public void disableAutoRead() {
        this.channel.config().setAutoRead((boolean)(NetworkManager.lllIIlllIIIlll[0] != 0));
        "".length();
    }
    
    public static NetworkManager func_181124_a(final InetAddress llllllllllllIlIlllIllIllIlIllIII, final int llllllllllllIlIlllIllIllIlIlIlll, final boolean llllllllllllIlIlllIllIllIlIllllI) {
        final NetworkManager llllllllllllIlIlllIllIllIlIlllIl = new NetworkManager(EnumPacketDirection.CLIENTBOUND);
        Class<? extends SocketChannel> llllllllllllIlIlllIllIllIlIllIll = null;
        LazyLoadBase<? extends EventLoopGroup> llllllllllllIlIlllIllIllIlIllIIl = null;
        if (lIlIIIIIlIllIIll(Epoll.isAvailable() ? 1 : 0) && lIlIIIIIlIllIIll(llllllllllllIlIlllIllIllIlIllllI ? 1 : 0)) {
            final Class<? extends SocketChannel> llllllllllllIlIlllIllIllIlIlllII = EpollSocketChannel.class;
            final LazyLoadBase<? extends EventLoopGroup> llllllllllllIlIlllIllIllIlIllIlI = NetworkManager.field_181125_e;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            llllllllllllIlIlllIllIllIlIllIll = NioSocketChannel.class;
            llllllllllllIlIlllIllIllIlIllIIl = NetworkManager.CLIENT_NIO_EVENTLOOP;
        }
        ((AbstractBootstrap<Bootstrap, C>)((AbstractBootstrap<Bootstrap, C>)new Bootstrap()).group((EventLoopGroup)llllllllllllIlIlllIllIllIlIllIIl.getValue())).handler(new ChannelInitializer<Channel>() {
            private static final /* synthetic */ int[] lIIlllIlIlIlII;
            private static final /* synthetic */ String[] lIIlllIlIlIIlI;
            
            static {
                llIllIlllllIIlI();
                llIllIllllIllIl();
            }
            
            private static String llIllIllllIlIlI(final String lllllllllllllIIlIIllllIIIIIllllI, final String lllllllllllllIIlIIllllIIIIIlllIl) {
                try {
                    final SecretKeySpec lllllllllllllIIlIIllllIIIIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIllllIIIIIlllIl.getBytes(StandardCharsets.UTF_8)), NetworkManager$5.lIIlllIlIlIlII[8]), "DES");
                    final Cipher lllllllllllllIIlIIllllIIIIlIIIII = Cipher.getInstance("DES");
                    lllllllllllllIIlIIllllIIIIlIIIII.init(NetworkManager$5.lIIlllIlIlIlII[3], lllllllllllllIIlIIllllIIIIlIIIIl);
                    return new String(lllllllllllllIIlIIllllIIIIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIllllIIIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIlIIllllIIIIIlllll) {
                    lllllllllllllIIlIIllllIIIIIlllll.printStackTrace();
                    return null;
                }
            }
            
            @Override
            protected void initChannel(final Channel lllllllllllllIIlIIllllIIIIllIllI) throws Exception {
                try {
                    lllllllllllllIIlIIllllIIIIllIllI.config().setOption(ChannelOption.TCP_NODELAY, (boolean)(NetworkManager$5.lIIlllIlIlIlII[0] != 0));
                    "".length();
                    "".length();
                    if (" ".length() < " ".length()) {
                        return;
                    }
                }
                catch (ChannelException ex) {}
                lllllllllllllIIlIIllllIIIIllIllI.pipeline().addLast(NetworkManager$5.lIIlllIlIlIIlI[NetworkManager$5.lIIlllIlIlIlII[1]], new ReadTimeoutHandler(NetworkManager$5.lIIlllIlIlIlII[2])).addLast(NetworkManager$5.lIIlllIlIlIIlI[NetworkManager$5.lIIlllIlIlIlII[0]], new MessageDeserializer2()).addLast(NetworkManager$5.lIIlllIlIlIIlI[NetworkManager$5.lIIlllIlIlIlII[3]], new MessageDeserializer(EnumPacketDirection.CLIENTBOUND)).addLast(NetworkManager$5.lIIlllIlIlIIlI[NetworkManager$5.lIIlllIlIlIlII[4]], new MessageSerializer2()).addLast(NetworkManager$5.lIIlllIlIlIIlI[NetworkManager$5.lIIlllIlIlIlII[5]], new MessageSerializer(EnumPacketDirection.SERVERBOUND)).addLast(NetworkManager$5.lIIlllIlIlIIlI[NetworkManager$5.lIIlllIlIlIlII[6]], llllllllllllIlIlllIllIllIlIlllIl);
                "".length();
            }
            
            private static String llIllIllllIlIll(final String lllllllllllllIIlIIllllIIIIlIlIll, final String lllllllllllllIIlIIllllIIIIlIlIlI) {
                try {
                    final SecretKeySpec lllllllllllllIIlIIllllIIIIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIllllIIIIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher lllllllllllllIIlIIllllIIIIlIllIl = Cipher.getInstance("Blowfish");
                    lllllllllllllIIlIIllllIIIIlIllIl.init(NetworkManager$5.lIIlllIlIlIlII[3], lllllllllllllIIlIIllllIIIIlIlllI);
                    return new String(lllllllllllllIIlIIllllIIIIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIllllIIIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIlIIllllIIIIlIllII) {
                    lllllllllllllIIlIIllllIIIIlIllII.printStackTrace();
                    return null;
                }
            }
            
            private static void llIllIlllllIIlI() {
                (lIIlllIlIlIlII = new int[9])[0] = " ".length();
                NetworkManager$5.lIIlllIlIlIlII[1] = ((0x4 ^ 0x79 ^ (0x24 ^ 0x7A)) & (0x6C ^ 0x74 ^ (0x15 ^ 0x2E) ^ -" ".length()));
                NetworkManager$5.lIIlllIlIlIlII[2] = (0x81 ^ 0x9F);
                NetworkManager$5.lIIlllIlIlIlII[3] = "  ".length();
                NetworkManager$5.lIIlllIlIlIlII[4] = "   ".length();
                NetworkManager$5.lIIlllIlIlIlII[5] = (0xFE ^ 0x9A ^ (0xCF ^ 0xAF));
                NetworkManager$5.lIIlllIlIlIlII[6] = (45 + 179 - 182 + 138 ^ 111 + 56 - 0 + 10);
                NetworkManager$5.lIIlllIlIlIlII[7] = (0xA1 ^ 0x8B ^ (0x31 ^ 0x1D));
                NetworkManager$5.lIIlllIlIlIlII[8] = (150 + 108 - 126 + 43 ^ 103 + 94 - 187 + 157);
            }
            
            private static void llIllIllllIllIl() {
                (lIIlllIlIlIIlI = new String[NetworkManager$5.lIIlllIlIlIlII[7]])[NetworkManager$5.lIIlllIlIlIlII[1]] = llIllIllllIlIlI("z4CjsekcIFw=", "ccFNK");
                NetworkManager$5.lIIlllIlIlIIlI[NetworkManager$5.lIIlllIlIlIlII[0]] = llIllIllllIlIll("RcFGlJtZekVkAjUa7cH7Eg==", "xPGzn");
                NetworkManager$5.lIIlllIlIlIIlI[NetworkManager$5.lIIlllIlIlIlII[3]] = llIllIllllIlIll("G55Gec86HKU=", "AQKkj");
                NetworkManager$5.lIIlllIlIlIIlI[NetworkManager$5.lIIlllIlIlIlII[4]] = llIllIllllIlIll("9eIwvSj6apnvmEauX12rmA==", "yZmZr");
                NetworkManager$5.lIIlllIlIlIIlI[NetworkManager$5.lIIlllIlIlIlII[5]] = llIllIllllIlIlI("L9IF08roXSI=", "mOcAH");
                NetworkManager$5.lIIlllIlIlIIlI[NetworkManager$5.lIIlllIlIlIlII[6]] = llIllIllllIlIlI("DZ0m7J0EfqKLPshUNa7uZg==", "qVQcr");
            }
        }).channel(llllllllllllIlIlllIllIllIlIllIll).connect(llllllllllllIlIlllIllIllIlIllIII, llllllllllllIlIlllIllIllIlIlIlll).syncUninterruptibly();
        "".length();
        return llllllllllllIlIlllIllIllIlIlllIl;
    }
    
    private static String lIlIIIIIlIlIIIIl(final String llllllllllllIlIlllIllIlIllllIlIl, final String llllllllllllIlIlllIllIlIllllIlII) {
        try {
            final SecretKeySpec llllllllllllIlIlllIllIlIlllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIllIlIllllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllIllIlIlllllIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllIllIlIlllllIIl.init(NetworkManager.lllIIlllIIIlll[2], llllllllllllIlIlllIllIlIlllllIlI);
            return new String(llllllllllllIlIlllIllIlIlllllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIllIlIllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIllIlIlllllIII) {
            llllllllllllIlIlllIllIlIlllllIII.printStackTrace();
            return null;
        }
    }
    
    private void flushOutboundQueue() {
        if (lIlIIIIIlIllIlIl(this.channel) && lIlIIIIIlIllIIll(this.channel.isOpen() ? 1 : 0)) {
            this.field_181680_j.readLock().lock();
            try {
                "".length();
                if (((0xB7 ^ 0x91 ^ (0x6 ^ 0x6A)) & (144 + 125 - 154 + 87 ^ 115 + 37 - 124 + 100 ^ -" ".length())) != 0x0) {
                    return;
                }
                while (!lIlIIIIIlIllIIll(this.outboundPacketsQueue.isEmpty() ? 1 : 0)) {
                    final InboundHandlerTuplePacketListener llllllllllllIlIlllIllIllIllllIIl = this.outboundPacketsQueue.poll();
                    this.dispatchPacket(llllllllllllIlIlllIllIllIllllIIl.packet, llllllllllllIlIlllIllIllIllllIIl.futureListeners);
                }
                "".length();
                if (((0x1D ^ 0x0) & ~(0x2 ^ 0x1F)) != 0x0) {
                    return;
                }
            }
            finally {
                this.field_181680_j.readLock().unlock();
            }
            this.field_181680_j.readLock().unlock();
        }
    }
    
    public void sendPacket(final Packet llllllllllllIlIlllIllIlllIIlIlll, final GenericFutureListener<? extends Future<? super Void>> llllllllllllIlIlllIllIlllIIlIIlI, final GenericFutureListener<? extends Future<? super Void>>... llllllllllllIlIlllIllIlllIIlIIIl) {
        if (lIlIIIIIlIllIIll(this.isChannelOpen() ? 1 : 0)) {
            this.flushOutboundQueue();
            this.dispatchPacket(llllllllllllIlIlllIllIlllIIlIlll, (GenericFutureListener<? extends Future<? super Void>>[])ArrayUtils.add((Object[])llllllllllllIlIlllIllIlllIIlIIIl, NetworkManager.lllIIlllIIIlll[0], (Object)llllllllllllIlIlllIllIlllIIlIIlI));
            "".length();
            if ((0x51 ^ 0x55) > (0xA1 ^ 0xA5)) {
                return;
            }
        }
        else {
            this.field_181680_j.writeLock().lock();
            try {
                this.outboundPacketsQueue.add(new InboundHandlerTuplePacketListener(llllllllllllIlIlllIllIlllIIlIlll, (GenericFutureListener<? extends Future<? super Void>>[])ArrayUtils.add((Object[])llllllllllllIlIlllIllIlllIIlIIIl, NetworkManager.lllIIlllIIIlll[0], (Object)llllllllllllIlIlllIllIlllIIlIIlI)));
                "".length();
                "".length();
                if (((0xE3 ^ 0xB5) & ~(0x1D ^ 0x4B)) > (0x87 ^ 0x83)) {
                    return;
                }
            }
            finally {
                this.field_181680_j.writeLock().unlock();
            }
            this.field_181680_j.writeLock().unlock();
        }
    }
    
    public boolean hasNoChannel() {
        if (lIlIIIIIlIllIlll(this.channel)) {
            return NetworkManager.lllIIlllIIIlll[1] != 0;
        }
        return NetworkManager.lllIIlllIIIlll[0] != 0;
    }
    
    private static boolean lIlIIIIIlIlllIIl(final int llllllllllllIlIlllIllIlIlllIllll, final int llllllllllllIlIlllIllIlIlllIlllI) {
        return llllllllllllIlIlllIllIlIlllIllll < llllllllllllIlIlllIllIlIlllIlllI;
    }
    
    public IChatComponent getExitMessage() {
        return this.terminationReason;
    }
    
    @Override
    public void channelInactive(final ChannelHandlerContext llllllllllllIlIlllIllIllllIIIIIl) throws Exception {
        this.closeChannel(new ChatComponentTranslation(NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[4]], new Object[NetworkManager.lllIIlllIIIlll[0]]));
    }
    
    private static void lIlIIIIIlIlIlIll() {
        (lllIIlllIIIIlI = new String[NetworkManager.lllIIlllIIIlll[29]])[NetworkManager.lllIIlllIIIlll[0]] = lIlIIIIIlIlIIIII("ABPGu0Hq2LE=", "tRzIr");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[1]] = lIlIIIIIlIlIIIIl("KmshZXAtqvlt5eBff5y1AA==", "tGBsn");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[2]] = lIlIIIIIlIlIIIII("uJ3LB9uK9zvS4iFS5i1RiQ==", "QWgYp");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[3]] = lIlIIIIIlIlIIIII("YVXtBv7fw6qNDhBkz/G9+2/YjOmfZlUo", "YRoSw");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[4]] = lIlIIIIIlIlIIIII("wzra9kSjy9Df2D87WQ7HmAqo1RcyU2YX", "wzqtY");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[5]] = lIlIIIIIlIlIIIIl("GFY6iV0MPksVwiSOmtEhn7RRvrD2O1qo", "NSVRE");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[6]] = lIlIIIIIlIlIIIII("gsm9GO/xfjRRjXFV8cb1puB0QdZuwFnrgEtfoRmnys0=", "MeYnF");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[7]] = lIlIIIIIlIlIIIll("PCk8DQsbJiRIPA0kLRgNHCgmUlk=", "uGHhy");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[8]] = lIlIIIIIlIlIIIII("0uv5Z+mEudYs5fU1ppTLeQ==", "ycVdI");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[9]] = lIlIIIIIlIlIIIII("Xwhkd+g3cIk9bF9LQqx8HZcIFIE8z6wzQBRcYa/CvSg=", "VTgHN");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[10]] = lIlIIIIIlIlIIIIl("gNvdqqkppq05v5LMwhxxaA1qSySX51Vk", "YPpDd");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[11]] = lIlIIIIIlIlIIIIl("Fm+ekgwy6MSpDxltPl8L5A==", "vazLF");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[12]] = lIlIIIIIlIlIIIII("UwkRCA/T7b0=", "lLKxi");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[13]] = lIlIIIIIlIlIIIII("WW+rBLb/eu9A+6ChheY4ag==", "LsBoz");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[14]] = lIlIIIIIlIlIIIIl("LJKa53i5tGg=", "VxRPk");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[15]] = lIlIIIIIlIlIIIll("KicXJCU+MBE4Ow==", "NBtKH");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[16]] = lIlIIIIIlIlIIIll("LjI1OhU6JTMmCw==", "JWVUx");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[17]] = lIlIIIIIlIlIIIIl("c/Jb+lbI65g=", "IUxyo");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[18]] = lIlIIIIIlIlIIIll("EAQOAyoEEwgfNA==", "tamlG");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[19]] = lIlIIIIIlIlIIIIl("birFHRl2fecVVkPfRGx8cA==", "GNlcr");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[20]] = lIlIIIIIlIlIIIIl("aTuUPNEsmdycTYT0PdxfFQ==", "AUsxO");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[21]] = lIlIIIIIlIlIIIll("CgwhOTYKEA==", "obBVR");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[22]] = lIlIIIIIlIlIIIIl("KDK5Xc8b8LsjdneKRm4TGg==", "xIZjm");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[23]] = lIlIIIIIlIlIIIII("Ib/UrWLIlirBrXxhS/LocQ==", "RmFuA");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[24]] = lIlIIIIIlIlIIIII("HvvgF3IZiKnUfXUt/isPTA==", "SASUN");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[25]] = lIlIIIIIlIlIIIIl("hoy5NeL9XUjRTHq4R96cXg==", "HgvyN");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[26]] = lIlIIIIIlIlIIIIl("Vr49EmdKYQeHMyc/ynRBOg==", "FXLgG");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[27]] = lIlIIIIIlIlIIIII("g35ekTtCDsvwBmLHbtpqDQ==", "wDfNj");
        NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[28]] = lIlIIIIIlIlIIIll("HQw7EwIQKTwEDRoDOxINAQQ6GUZcTTYWAhkIMVcaAgQ2Eg==", "umUwn");
    }
    
    public SocketAddress getRemoteAddress() {
        return this.socketAddress;
    }
    
    @Override
    public void exceptionCaught(final ChannelHandlerContext llllllllllllIlIlllIllIlllIlllIll, final Throwable llllllllllllIlIlllIllIlllIllIllI) throws Exception {
        ChatComponentTranslation llllllllllllIlIlllIllIlllIlllIII = null;
        if (lIlIIIIIlIllIIll((llllllllllllIlIlllIllIlllIllIllI instanceof TimeoutException) ? 1 : 0)) {
            final ChatComponentTranslation llllllllllllIlIlllIllIlllIlllIIl = new ChatComponentTranslation(NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[5]], new Object[NetworkManager.lllIIlllIIIlll[0]]);
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
        else {
            final String lllllllllllllIlIIlIlllIIlIIIIIlI = NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[6]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[NetworkManager.lllIIlllIIIlll[1]];
            lllllllllllllIlIIlIlllIIlIIIIIIl[NetworkManager.lllIIlllIIIlll[0]] = String.valueOf(new StringBuilder(NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[7]]).append(llllllllllllIlIlllIllIlllIllIllI));
            llllllllllllIlIlllIllIlllIlllIII = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl);
        }
        this.closeChannel(llllllllllllIlIlllIllIlllIlllIII);
    }
    
    public void enableEncryption(final SecretKey llllllllllllIlIlllIllIllIlIIIlll) {
        this.isEncrypted = (NetworkManager.lllIIlllIIIlll[1] != 0);
        this.channel.pipeline().addBefore(NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[11]], NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[12]], new NettyEncryptingDecoder(CryptManager.createNetCipherInstance(NetworkManager.lllIIlllIIIlll[2], llllllllllllIlIlllIllIllIlIIIlll)));
        "".length();
        this.channel.pipeline().addBefore(NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[13]], NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[14]], new NettyEncryptingEncoder(CryptManager.createNetCipherInstance(NetworkManager.lllIIlllIIIlll[1], llllllllllllIlIlllIllIllIlIIIlll)));
        "".length();
    }
    
    public void setConnectionState(final EnumConnectionState llllllllllllIlIlllIllIllllIIIllI) {
        this.channel.attr(NetworkManager.attrKeyConnectionState).set(llllllllllllIlIlllIllIllllIIIllI);
        this.channel.config().setAutoRead((boolean)(NetworkManager.lllIIlllIIIlll[1] != 0));
        "".length();
        NetworkManager.logger.debug(NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[3]]);
    }
    
    private static void lIlIIIIIlIllIIlI() {
        (lllIIlllIIIlll = new int[30])[0] = ((52 + 153 - 188 + 178 ^ 33 + 97 - 58 + 60) & (0x61 ^ 0x26 ^ ((0xAC ^ 0x9B) & ~(0x56 ^ 0x61)) ^ -" ".length()));
        NetworkManager.lllIIlllIIIlll[1] = " ".length();
        NetworkManager.lllIIlllIIIlll[2] = "  ".length();
        NetworkManager.lllIIlllIIIlll[3] = "   ".length();
        NetworkManager.lllIIlllIIIlll[4] = (0x70 ^ 0x74);
        NetworkManager.lllIIlllIIIlll[5] = (169 + 61 - 227 + 175 ^ 174 + 79 - 152 + 82);
        NetworkManager.lllIIlllIIIlll[6] = (0x74 ^ 0x72);
        NetworkManager.lllIIlllIIIlll[7] = (74 + 38 + 2 + 48 ^ 58 + 63 - 94 + 138);
        NetworkManager.lllIIlllIIIlll[8] = (0x88 ^ 0xB5 ^ (0x8 ^ 0x3D));
        NetworkManager.lllIIlllIIIlll[9] = (149 + 26 - 153 + 146 ^ 107 + 143 - 155 + 66);
        NetworkManager.lllIIlllIIIlll[10] = (0x1A ^ 0x10);
        NetworkManager.lllIIlllIIIlll[11] = (148 + 78 - 179 + 117 ^ 73 + 18 - 44 + 128);
        NetworkManager.lllIIlllIIIlll[12] = (0xAE ^ 0xA2);
        NetworkManager.lllIIlllIIIlll[13] = (32 + 72 - 45 + 78 ^ 34 + 64 - 65 + 99);
        NetworkManager.lllIIlllIIIlll[14] = (0x3F ^ 0x31);
        NetworkManager.lllIIlllIIIlll[15] = (0x2B ^ 0x24);
        NetworkManager.lllIIlllIIIlll[16] = (0x5A ^ 0x75 ^ (0xA9 ^ 0x96));
        NetworkManager.lllIIlllIIIlll[17] = (0x35 ^ 0x24);
        NetworkManager.lllIIlllIIIlll[18] = (0x32 ^ 0x20);
        NetworkManager.lllIIlllIIIlll[19] = (31 + 159 - 146 + 123 ^ 95 + 25 - 48 + 108);
        NetworkManager.lllIIlllIIIlll[20] = (0x6B ^ 0x7F);
        NetworkManager.lllIIlllIIIlll[21] = (0x1F ^ 0x5A ^ (0xD5 ^ 0x85));
        NetworkManager.lllIIlllIIIlll[22] = (85 + 99 - 183 + 126 ^ (0x64 ^ 0xD));
        NetworkManager.lllIIlllIIIlll[23] = (0xA3 ^ 0xB4);
        NetworkManager.lllIIlllIIIlll[24] = (0x61 ^ 0x79);
        NetworkManager.lllIIlllIIIlll[25] = (0xBA ^ 0x90 ^ (0x40 ^ 0x73));
        NetworkManager.lllIIlllIIIlll[26] = (0x6B ^ 0x5A ^ (0xAD ^ 0x86));
        NetworkManager.lllIIlllIIIlll[27] = (0x93 ^ 0xBB ^ (0x84 ^ 0xB7));
        NetworkManager.lllIIlllIIIlll[28] = (0x4E ^ 0x52);
        NetworkManager.lllIIlllIIIlll[29] = (89 + 24 - 65 + 129 ^ 144 + 140 - 174 + 62);
    }
    
    private static boolean lIlIIIIIlIllIlll(final Object llllllllllllIlIlllIllIlIlllIIllI) {
        return llllllllllllIlIlllIllIlIlllIIllI == null;
    }
    
    public void closeChannel(final IChatComponent llllllllllllIlIlllIllIllIllIlIlI) {
        if (lIlIIIIIlIllIIll(this.channel.isOpen() ? 1 : 0)) {
            this.channel.close().awaitUninterruptibly();
            "".length();
            this.terminationReason = llllllllllllIlIlllIllIllIllIlIlI;
        }
    }
    
    private static String lIlIIIIIlIlIIIII(final String llllllllllllIlIlllIllIllIIIlllII, final String llllllllllllIlIlllIllIllIIIllIIl) {
        try {
            final SecretKeySpec llllllllllllIlIlllIllIllIIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIllIllIIIllIIl.getBytes(StandardCharsets.UTF_8)), NetworkManager.lllIIlllIIIlll[8]), "DES");
            final Cipher llllllllllllIlIlllIllIllIIIllllI = Cipher.getInstance("DES");
            llllllllllllIlIlllIllIllIIIllllI.init(NetworkManager.lllIIlllIIIlll[2], llllllllllllIlIlllIllIllIIIlllll);
            return new String(llllllllllllIlIlllIllIllIIIllllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIllIllIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIllIllIIIlllIl) {
            llllllllllllIlIlllIllIllIIIlllIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lIlIIIIIlIllIIlI();
        lIlIIIIIlIlIlIll();
        logger = LogManager.getLogger();
        logMarkerNetwork = MarkerManager.getMarker(NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[0]]);
        logMarkerPackets = MarkerManager.getMarker(NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[1]], NetworkManager.logMarkerNetwork);
        attrKeyConnectionState = AttributeKey.valueOf(NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[2]]);
        CLIENT_NIO_EVENTLOOP = new LazyLoadBase<NioEventLoopGroup>() {
            private static final /* synthetic */ int[] llIIlIIIIlIlII;
            private static final /* synthetic */ String[] llIIlIIIIlIIll;
            
            private static String lIIIlIlllIlIIlII(final String llllllllllllIlllIIllIlIIlIIIllII, final String llllllllllllIlllIIllIlIIlIIIlIIl) {
                try {
                    final SecretKeySpec llllllllllllIlllIIllIlIIlIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIllIlIIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher llllllllllllIlllIIllIlIIlIIIlllI = Cipher.getInstance("Blowfish");
                    llllllllllllIlllIIllIlIIlIIIlllI.init(NetworkManager$1.llIIlIIIIlIlII[2], llllllllllllIlllIIllIlIIlIIIllll);
                    return new String(llllllllllllIlllIIllIlIIlIIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIllIlIIlIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlllIIllIlIIlIIIllIl) {
                    llllllllllllIlllIIllIlIIlIIIllIl.printStackTrace();
                    return null;
                }
            }
            
            private static void lIIIlIlllIlIIllI() {
                (llIIlIIIIlIlII = new int[3])[0] = ((83 + 10 - 72 + 135 ^ 13 + 65 - 61 + 178) & (61 + 17 - 16 + 159 ^ 129 + 33 - 55 + 23 ^ -" ".length()));
                NetworkManager$1.llIIlIIIIlIlII[1] = " ".length();
                NetworkManager$1.llIIlIIIIlIlII[2] = "  ".length();
            }
            
            private static void lIIIlIlllIlIIlIl() {
                (llIIlIIIIlIIll = new String[NetworkManager$1.llIIlIIIIlIlII[1]])[NetworkManager$1.llIIlIIIIlIlII[0]] = lIIIlIlllIlIIlII("37VRQFmxVPmGk2kz+73i8BbIdySlVPj7", "SIRqu");
            }
            
            @Override
            protected NioEventLoopGroup load() {
                return new NioEventLoopGroup(NetworkManager$1.llIIlIIIIlIlII[0], new ThreadFactoryBuilder().setNameFormat(NetworkManager$1.llIIlIIIIlIIll[NetworkManager$1.llIIlIIIIlIlII[0]]).setDaemon((boolean)(NetworkManager$1.llIIlIIIIlIlII[1] != 0)).build());
            }
            
            static {
                lIIIlIlllIlIIllI();
                lIIIlIlllIlIIlIl();
            }
        };
        field_181125_e = new LazyLoadBase<EpollEventLoopGroup>() {
            private static final /* synthetic */ int[] llIIlIlIIIIIlI;
            private static final /* synthetic */ String[] llIIlIlIIIIIIl;
            
            private static void lIIIllIIllIlIlII() {
                (llIIlIlIIIIIIl = new String[NetworkManager$2.llIIlIlIIIIIlI[1]])[NetworkManager$2.llIIlIlIIIIIlI[0]] = lIIIllIIllIlIIll("M0D71W1kQmIzob3QLvYmMmVaikq1R4QXe/rx3fQUuQk=", "zEqUN");
            }
            
            private static String lIIIllIIllIlIIll(final String llllllllllllIlllIIlIIIIllIIIIlIl, final String llllllllllllIlllIIlIIIIllIIIIlII) {
                try {
                    final SecretKeySpec llllllllllllIlllIIlIIIIllIIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlIIIIllIIIIlII.getBytes(StandardCharsets.UTF_8)), NetworkManager$2.llIIlIlIIIIIlI[2]), "DES");
                    final Cipher llllllllllllIlllIIlIIIIllIIIIlll = Cipher.getInstance("DES");
                    llllllllllllIlllIIlIIIIllIIIIlll.init(NetworkManager$2.llIIlIlIIIIIlI[3], llllllllllllIlllIIlIIIIllIIIlIII);
                    return new String(llllllllllllIlllIIlIIIIllIIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlIIIIllIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlllIIlIIIIllIIIIllI) {
                    llllllllllllIlllIIlIIIIllIIIIllI.printStackTrace();
                    return null;
                }
            }
            
            static {
                lIIIllIIllIlIlIl();
                lIIIllIIllIlIlII();
            }
            
            @Override
            protected EpollEventLoopGroup load() {
                return new EpollEventLoopGroup(NetworkManager$2.llIIlIlIIIIIlI[0], new ThreadFactoryBuilder().setNameFormat(NetworkManager$2.llIIlIlIIIIIIl[NetworkManager$2.llIIlIlIIIIIlI[0]]).setDaemon((boolean)(NetworkManager$2.llIIlIlIIIIIlI[1] != 0)).build());
            }
            
            private static void lIIIllIIllIlIlIl() {
                (llIIlIlIIIIIlI = new int[4])[0] = ((0x8A ^ 0x8F) & ~(0xA5 ^ 0xA0));
                NetworkManager$2.llIIlIlIIIIIlI[1] = " ".length();
                NetworkManager$2.llIIlIlIIIIIlI[2] = (0x1F ^ 0x17);
                NetworkManager$2.llIIlIlIIIIIlI[3] = "  ".length();
            }
        };
        CLIENT_LOCAL_EVENTLOOP = new LazyLoadBase<LocalEventLoopGroup>() {
            private static final /* synthetic */ String[] lIIllllIllIIlI;
            private static final /* synthetic */ int[] lIIllllIllIlIl;
            
            private static void llIllllIIlIIlII() {
                (lIIllllIllIlIl = new int[3])[0] = ((45 + 55 - 50 + 98 ^ 2 + 132 - 10 + 68) & (160 + 49 - 128 + 112 ^ 37 + 99 - 105 + 118 ^ -" ".length()));
                NetworkManager$3.lIIllllIllIlIl[1] = " ".length();
                NetworkManager$3.lIIllllIllIlIl[2] = "  ".length();
            }
            
            static {
                llIllllIIlIIlII();
                llIllllIIIlllll();
            }
            
            private static String llIllllIIIllllI(final String lllllllllllllIIlIIlIIllIIlIIlIlI, final String lllllllllllllIIlIIlIIllIIlIIlIll) {
                try {
                    final SecretKeySpec lllllllllllllIIlIIlIIllIIlIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIIllIIlIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher lllllllllllllIIlIIlIIllIIlIIlllI = Cipher.getInstance("Blowfish");
                    lllllllllllllIIlIIlIIllIIlIIlllI.init(NetworkManager$3.lIIllllIllIlIl[2], lllllllllllllIIlIIlIIllIIlIIllll);
                    return new String(lllllllllllllIIlIIlIIllIIlIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIIllIIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIlIIlIIllIIlIIllIl) {
                    lllllllllllllIIlIIlIIllIIlIIllIl.printStackTrace();
                    return null;
                }
            }
            
            @Override
            protected LocalEventLoopGroup load() {
                return new LocalEventLoopGroup(NetworkManager$3.lIIllllIllIlIl[0], new ThreadFactoryBuilder().setNameFormat(NetworkManager$3.lIIllllIllIIlI[NetworkManager$3.lIIllllIllIlIl[0]]).setDaemon((boolean)(NetworkManager$3.lIIllllIllIlIl[1] != 0)).build());
            }
            
            private static void llIllllIIIlllll() {
                (lIIllllIllIIlI = new String[NetworkManager$3.lIIllllIllIlIl[1]])[NetworkManager$3.lIIllllIllIlIl[0]] = llIllllIIIllllI("NkfNusxjhVhpw4aLKKQNBgdzzMFWxDznGezbcdIEerw=", "CUkhG");
            }
        };
    }
    
    private static boolean lIlIIIIIlIlllIII(final int llllllllllllIlIlllIllIlIlllIIIII) {
        return llllllllllllIlIlllIllIlIlllIIIII >= 0;
    }
    
    @Override
    public void channelActive(final ChannelHandlerContext llllllllllllIlIlllIllIllllIIlIll) throws Exception {
        super.channelActive(llllllllllllIlIlllIllIllllIIlIll);
        this.channel = llllllllllllIlIlllIllIllllIIlIll.channel();
        this.socketAddress = this.channel.remoteAddress();
        try {
            this.setConnectionState(EnumConnectionState.HANDSHAKING);
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        }
        catch (Throwable llllllllllllIlIlllIllIllllIIllIl) {
            NetworkManager.logger.fatal((Object)llllllllllllIlIlllIllIllllIIllIl);
        }
    }
    
    public boolean getIsencrypted() {
        return this.isEncrypted;
    }
    
    private static String lIlIIIIIlIlIIIll(String llllllllllllIlIlllIllIllIIIIIlll, final String llllllllllllIlIlllIllIllIIIIIllI) {
        llllllllllllIlIlllIllIllIIIIIlll = new String(Base64.getDecoder().decode(llllllllllllIlIlllIllIllIIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllIllIllIIIIlIlI = new StringBuilder();
        final char[] llllllllllllIlIlllIllIllIIIIlIIl = llllllllllllIlIlllIllIllIIIIIllI.toCharArray();
        int llllllllllllIlIlllIllIllIIIIlIII = NetworkManager.lllIIlllIIIlll[0];
        final double llllllllllllIlIlllIllIllIIIIIIlI = (Object)llllllllllllIlIlllIllIllIIIIIlll.toCharArray();
        final float llllllllllllIlIlllIllIllIIIIIIIl = llllllllllllIlIlllIllIllIIIIIIlI.length;
        char llllllllllllIlIlllIllIllIIIIIIII = (char)NetworkManager.lllIIlllIIIlll[0];
        while (lIlIIIIIlIlllIIl(llllllllllllIlIlllIllIllIIIIIIII, (int)llllllllllllIlIlllIllIllIIIIIIIl)) {
            final char llllllllllllIlIlllIllIllIIIIllIl = llllllllllllIlIlllIllIllIIIIIIlI[llllllllllllIlIlllIllIllIIIIIIII];
            llllllllllllIlIlllIllIllIIIIlIlI.append((char)(llllllllllllIlIlllIllIllIIIIllIl ^ llllllllllllIlIlllIllIllIIIIlIIl[llllllllllllIlIlllIllIllIIIIlIII % llllllllllllIlIlllIllIllIIIIlIIl.length]));
            "".length();
            ++llllllllllllIlIlllIllIllIIIIlIII;
            ++llllllllllllIlIlllIllIllIIIIIIII;
            "".length();
            if ((0x99 ^ 0x9D) < " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllIllIllIIIIlIlI);
    }
    
    public static NetworkManager provideLocalClient(final SocketAddress llllllllllllIlIlllIllIllIlIIlllI) {
        final NetworkManager llllllllllllIlIlllIllIllIlIIllll = new NetworkManager(EnumPacketDirection.CLIENTBOUND);
        ((AbstractBootstrap<Bootstrap, C>)((AbstractBootstrap<Bootstrap, C>)new Bootstrap()).group(NetworkManager.CLIENT_LOCAL_EVENTLOOP.getValue())).handler(new ChannelInitializer<Channel>() {
            private static final /* synthetic */ String[] llIIIllllIlllI;
            private static final /* synthetic */ int[] llIIIlllllIIII;
            
            static {
                lIIIlIllIlIIIIIl();
                lIIIlIllIIlllIll();
            }
            
            private static void lIIIlIllIlIIIIIl() {
                (llIIIlllllIIII = new int[4])[0] = ((0xD ^ 0x53) & ~(0x0 ^ 0x5E));
                NetworkManager$6.llIIIlllllIIII[1] = " ".length();
                NetworkManager$6.llIIIlllllIIII[2] = (0xA8 ^ 0xA0);
                NetworkManager$6.llIIIlllllIIII[3] = "  ".length();
            }
            
            @Override
            protected void initChannel(final Channel llllllllllllIlllIIllllIIlllIIlIl) throws Exception {
                llllllllllllIlllIIllllIIlllIIlIl.pipeline().addLast(NetworkManager$6.llIIIllllIlllI[NetworkManager$6.llIIIlllllIIII[0]], llllllllllllIlIlllIllIllIlIIllll);
                "".length();
            }
            
            private static String lIIIlIllIIlllIIl(final String llllllllllllIlllIIllllIIllIllIll, final String llllllllllllIlllIIllllIIllIllIlI) {
                try {
                    final SecretKeySpec llllllllllllIlllIIllllIIllIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIllllIIllIllIlI.getBytes(StandardCharsets.UTF_8)), NetworkManager$6.llIIIlllllIIII[2]), "DES");
                    final Cipher llllllllllllIlllIIllllIIllIlllIl = Cipher.getInstance("DES");
                    llllllllllllIlllIIllllIIllIlllIl.init(NetworkManager$6.llIIIlllllIIII[3], llllllllllllIlllIIllllIIllIllllI);
                    return new String(llllllllllllIlllIIllllIIllIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIllllIIllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlllIIllllIIllIlllII) {
                    llllllllllllIlllIIllllIIllIlllII.printStackTrace();
                    return null;
                }
            }
            
            private static void lIIIlIllIIlllIll() {
                (llIIIllllIlllI = new String[NetworkManager$6.llIIIlllllIIII[1]])[NetworkManager$6.llIIIlllllIIII[0]] = lIIIlIllIIlllIIl("D4JT9LE7h9Ru+XGY60cs7Q==", "wLhcq");
            }
        }).channel(LocalChannel.class).connect(llllllllllllIlIlllIllIllIlIIlllI).syncUninterruptibly();
        "".length();
        return llllllllllllIlIlllIllIllIlIIllll;
    }
    
    public void processReceivedPackets() {
        this.flushOutboundQueue();
        if (lIlIIIIIlIllIIll((this.packetListener instanceof ITickable) ? 1 : 0)) {
            ((ITickable)this.packetListener).update();
        }
        this.channel.flush();
        "".length();
    }
    
    public NetworkManager(final EnumPacketDirection llllllllllllIlIlllIllIllllIlIlIl) {
        this.outboundPacketsQueue = (Queue<InboundHandlerTuplePacketListener>)Queues.newConcurrentLinkedQueue();
        this.field_181680_j = new ReentrantReadWriteLock();
        this.direction = llllllllllllIlIlllIllIllllIlIlIl;
    }
    
    public void checkDisconnected() {
        if (lIlIIIIIlIllIlIl(this.channel) && lIlIIIIIlIllIllI(this.channel.isOpen() ? 1 : 0)) {
            if (lIlIIIIIlIllIllI(this.disconnected ? 1 : 0)) {
                this.disconnected = (NetworkManager.lllIIlllIIIlll[1] != 0);
                if (lIlIIIIIlIllIlIl(this.getExitMessage())) {
                    this.getNetHandler().onDisconnect(this.getExitMessage());
                    "".length();
                    if (-" ".length() > -" ".length()) {
                        return;
                    }
                }
                else if (lIlIIIIIlIllIlIl(this.getNetHandler())) {
                    this.getNetHandler().onDisconnect(new ChatComponentText(NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[27]]));
                    "".length();
                    if (-" ".length() >= 0) {
                        return;
                    }
                }
            }
            else {
                NetworkManager.logger.warn(NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[28]]);
            }
        }
    }
    
    public void setCompressionTreshold(final int llllllllllllIlIlllIllIllIIlIllll) {
        if (lIlIIIIIlIlllIII(llllllllllllIlIlllIllIllIIlIllll)) {
            if (lIlIIIIIlIllIIll((this.channel.pipeline().get(NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[15]]) instanceof NettyCompressionDecoder) ? 1 : 0)) {
                ((NettyCompressionDecoder)this.channel.pipeline().get(NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[16]])).setCompressionTreshold(llllllllllllIlIlllIllIllIIlIllll);
                "".length();
                if ((0x46 ^ 0x31 ^ (0x5E ^ 0x2D)) <= " ".length()) {
                    return;
                }
            }
            else {
                this.channel.pipeline().addBefore(NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[17]], NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[18]], new NettyCompressionDecoder(llllllllllllIlIlllIllIllIIlIllll));
                "".length();
            }
            if (lIlIIIIIlIllIIll((this.channel.pipeline().get(NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[19]]) instanceof NettyCompressionEncoder) ? 1 : 0)) {
                ((NettyCompressionEncoder)this.channel.pipeline().get(NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[20]])).setCompressionTreshold(llllllllllllIlIlllIllIllIIlIllll);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.channel.pipeline().addBefore(NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[21]], NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[22]], new NettyCompressionEncoder(llllllllllllIlIlllIllIllIIlIllll));
                "".length();
                "".length();
                if (((0x2 ^ 0x5C) & ~(0x54 ^ 0xA)) > 0) {
                    return;
                }
            }
        }
        else {
            if (lIlIIIIIlIllIIll((this.channel.pipeline().get(NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[23]]) instanceof NettyCompressionDecoder) ? 1 : 0)) {
                this.channel.pipeline().remove(NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[24]]);
                "".length();
            }
            if (lIlIIIIIlIllIIll((this.channel.pipeline().get(NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[25]]) instanceof NettyCompressionEncoder) ? 1 : 0)) {
                this.channel.pipeline().remove(NetworkManager.lllIIlllIIIIlI[NetworkManager.lllIIlllIIIlll[26]]);
                "".length();
            }
        }
    }
    
    public boolean isLocalChannel() {
        if (lIlIIIIIlIllIllI((this.channel instanceof LocalChannel) ? 1 : 0) && lIlIIIIIlIllIllI((this.channel instanceof LocalServerChannel) ? 1 : 0)) {
            return NetworkManager.lllIIlllIIIlll[0] != 0;
        }
        return NetworkManager.lllIIlllIIIlll[1] != 0;
    }
    
    static class InboundHandlerTuplePacketListener
    {
        private final /* synthetic */ GenericFutureListener<? extends Future<? super Void>>[] futureListeners;
        private final /* synthetic */ Packet packet;
        
        public InboundHandlerTuplePacketListener(final Packet llllllllllllIlllIlIIIlllIIllIlIl, final GenericFutureListener<? extends Future<? super Void>>... llllllllllllIlllIlIIIlllIIllIlII) {
            this.packet = llllllllllllIlllIlIIIlllIIllIlIl;
            this.futureListeners = llllllllllllIlllIlIIIlllIIllIlII;
        }
    }
}
