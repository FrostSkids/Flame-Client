// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.network;

import io.netty.bootstrap.AbstractBootstrap;
import org.apache.logging.log4j.LogManager;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.channel.ChannelPipeline;
import net.minecraft.util.MathHelper;
import com.google.common.collect.Iterables;
import com.google.common.base.Charsets;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.channel.ChannelFutureListener;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.buffer.ByteBuf;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelOption;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.bootstrap.Bootstrap;
import java.net.UnknownHostException;
import net.minecraft.network.status.client.C00PacketServerQuery;
import net.minecraft.network.handshake.client.C00Handshake;
import net.minecraft.network.EnumConnectionState;
import net.minecraft.network.INetHandler;
import com.mojang.authlib.GameProfile;
import net.minecraft.network.ServerStatusResponse;
import net.minecraft.network.Packet;
import net.minecraft.network.status.client.C01PacketPing;
import org.apache.commons.lang3.ArrayUtils;
import net.minecraft.network.status.server.S00PacketServerInfo;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.network.status.server.S01PacketPong;
import net.minecraft.network.status.INetHandlerStatusClient;
import java.net.InetAddress;
import net.minecraft.client.multiplayer.ServerAddress;
import net.minecraft.client.multiplayer.ServerData;
import java.util.Collections;
import com.google.common.collect.Lists;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Iterator;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.network.NetworkManager;
import java.util.List;
import org.apache.logging.log4j.Logger;
import com.google.common.base.Splitter;

public class OldServerPinger
{
    private static final /* synthetic */ Splitter PING_RESPONSE_SPLITTER;
    private static final /* synthetic */ int[] llIlIlIIlIllIl;
    private static final /* synthetic */ Logger logger;
    private final /* synthetic */ List<NetworkManager> pingDestinations;
    private static final /* synthetic */ String[] llIlIlIIlIllII;
    
    public void clearPendingNetworks() {
        synchronized (this.pingDestinations) {
            final Iterator<NetworkManager> llllllllllllIllIlIlIllIIlllIIIll = this.pingDestinations.iterator();
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIlIIlllllIIllI(llllllllllllIllIlIlIllIIlllIIIll.hasNext() ? 1 : 0)) {
                final NetworkManager llllllllllllIllIlIlIllIIlllIIIlI = llllllllllllIllIlIlIllIIlllIIIll.next();
                if (lIIlIIlllllIIlIl(llllllllllllIllIlIlIllIIlllIIIlI.isChannelOpen() ? 1 : 0)) {
                    llllllllllllIllIlIlIllIIlllIIIll.remove();
                    llllllllllllIllIlIlIllIIlllIIIlI.closeChannel(new ChatComponentText(OldServerPinger.llIlIlIIlIllII[OldServerPinger.llIlIlIIlIllIl[3]]));
                }
            }
            // monitorexit(this.pingDestinations)
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        }
    }
    
    private static String lIIlIIlllllIIIlI(final String llllllllllllIllIlIlIllIIllIIIlIl, final String llllllllllllIllIlIlIllIIllIIIlII) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIllIIllIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIllIIllIIIlII.getBytes(StandardCharsets.UTF_8)), OldServerPinger.llIlIlIIlIllIl[5]), "DES");
            final Cipher llllllllllllIllIlIlIllIIllIIIlll = Cipher.getInstance("DES");
            llllllllllllIllIlIlIllIIllIIIlll.init(OldServerPinger.llIlIlIIlIllIl[4], llllllllllllIllIlIlIllIIllIIlIII);
            return new String(llllllllllllIllIlIlIllIIllIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIllIIllIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIllIIllIIIllI) {
            llllllllllllIllIlIlIllIIllIIIllI.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlIIlllllIIlII() {
        (llIlIlIIlIllIl = new int[6])[0] = ((0xB ^ 0x69) & ~(0xFE ^ 0x9C));
        OldServerPinger.llIlIlIIlIllIl[1] = (0x1E ^ 0x18);
        OldServerPinger.llIlIlIIlIllIl[2] = (0x7B ^ 0x54);
        OldServerPinger.llIlIlIIlIllIl[3] = " ".length();
        OldServerPinger.llIlIlIIlIllIl[4] = "  ".length();
        OldServerPinger.llIlIlIIlIllIl[5] = (123 + 60 - 17 + 10 ^ 122 + 67 - 120 + 115);
    }
    
    public OldServerPinger() {
        this.pingDestinations = Collections.synchronizedList((List<NetworkManager>)Lists.newArrayList());
    }
    
    public void pingPendingNetworks() {
        synchronized (this.pingDestinations) {
            final Iterator<NetworkManager> llllllllllllIllIlIlIllIIlllIlllI = this.pingDestinations.iterator();
            "".length();
            if (((42 + 170 - 82 + 57 ^ 156 + 144 - 123 + 14) & (0x1C ^ 0x1A ^ "  ".length() ^ -" ".length())) > 0) {
                return;
            }
            while (!lIIlIIlllllIIllI(llllllllllllIllIlIlIllIIlllIlllI.hasNext() ? 1 : 0)) {
                final NetworkManager llllllllllllIllIlIlIllIIlllIllIl = llllllllllllIllIlIlIllIIlllIlllI.next();
                if (lIIlIIlllllIIlIl(llllllllllllIllIlIlIllIIlllIllIl.isChannelOpen() ? 1 : 0)) {
                    llllllllllllIllIlIlIllIIlllIllIl.processReceivedPackets();
                    "".length();
                    if (((36 + 20 - 30 + 117 ^ 73 + 103 - 73 + 76) & (32 + 110 - 127 + 151 ^ 15 + 55 - 69 + 153 ^ -" ".length())) < 0) {
                        return;
                    }
                    continue;
                }
                else {
                    llllllllllllIllIlIlIllIIlllIlllI.remove();
                    llllllllllllIllIlIlIllIIlllIllIl.checkDisconnected();
                }
            }
            // monitorexit(this.pingDestinations)
            "".length();
            if (null != null) {
                return;
            }
        }
    }
    
    private static void lIIlIIlllllIIIll() {
        (llIlIlIIlIllII = new String[OldServerPinger.llIlIlIIlIllIl[4]])[OldServerPinger.llIlIlIIlIllIl[0]] = lIIlIIlllllIIIIl("/igYaJ+AcGlNy4EWtMwS0A==", "OzZwv");
        OldServerPinger.llIlIlIIlIllII[OldServerPinger.llIlIlIIlIllIl[3]] = lIIlIIlllllIIIlI("X1DGKL2f60d9hkfg7HtOFA==", "XiQpM");
    }
    
    public void ping(final ServerData llllllllllllIllIlIlIllIlIIIIIlIl) throws UnknownHostException {
        final ServerAddress llllllllllllIllIlIlIllIlIIIIIlII = ServerAddress.func_78860_a(llllllllllllIllIlIlIllIlIIIIIlIl.serverIP);
        final NetworkManager llllllllllllIllIlIlIllIlIIIIIIll = NetworkManager.func_181124_a(InetAddress.getByName(llllllllllllIllIlIlIllIlIIIIIlII.getIP()), llllllllllllIllIlIlIllIlIIIIIlII.getPort(), (boolean)(OldServerPinger.llIlIlIIlIllIl[0] != 0));
        this.pingDestinations.add(llllllllllllIllIlIlIllIlIIIIIIll);
        "".length();
        llllllllllllIllIlIlIllIlIIIIIlIl.serverMOTD = OldServerPinger.llIlIlIIlIllII[OldServerPinger.llIlIlIIlIllIl[0]];
        llllllllllllIllIlIlIllIlIIIIIlIl.pingToServer = -1L;
        llllllllllllIllIlIlIllIlIIIIIlIl.playerList = null;
        llllllllllllIllIlIlIllIlIIIIIIll.setNetHandler(new INetHandlerStatusClient() {
            private /* synthetic */ boolean field_183009_e = OldServerPinger$1.lIlIIlllIlIlII[0];
            private /* synthetic */ boolean field_147403_d = OldServerPinger$1.lIlIIlllIlIlII[0];
            private static final /* synthetic */ String[] lIlIIlllIlIIll;
            private static final /* synthetic */ int[] lIlIIlllIlIlII;
            private /* synthetic */ long field_175092_e = 0L;
            
            @Override
            public void handlePong(final S01PacketPong lllllllllllllIIIlIllllllIlllIlll) {
                final long lllllllllllllIIIlIllllllIlllIllI = this.field_175092_e;
                final long lllllllllllllIIIlIllllllIlllIlIl = Minecraft.getSystemTime();
                llllllllllllIllIlIlIllIlIIIIIlIl.pingToServer = lllllllllllllIIIlIllllllIlllIlIl - lllllllllllllIIIlIllllllIlllIllI;
                llllllllllllIllIlIlIllIlIIIIIIll.closeChannel(new ChatComponentText(OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[12]]));
            }
            
            static {
                lllIlIIlIIlllIl();
                lllIlIIlIIlllII();
            }
            
            private static String lllIlIIlIIllIIl(String lllllllllllllIIIlIllllllIlIIIIlI, final String lllllllllllllIIIlIllllllIlIIIllI) {
                lllllllllllllIIIlIllllllIlIIIIlI = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlIllllllIlIIIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder lllllllllllllIIIlIllllllIlIIIlIl = new StringBuilder();
                final char[] lllllllllllllIIIlIllllllIlIIIlII = lllllllllllllIIIlIllllllIlIIIllI.toCharArray();
                int lllllllllllllIIIlIllllllIlIIIIll = OldServerPinger$1.lIlIIlllIlIlII[0];
                final byte lllllllllllllIIIlIllllllIIllllIl = (Object)((String)lllllllllllllIIIlIllllllIlIIIIlI).toCharArray();
                final double lllllllllllllIIIlIllllllIIllllII = lllllllllllllIIIlIllllllIIllllIl.length;
                boolean lllllllllllllIIIlIllllllIIlllIll = OldServerPinger$1.lIlIIlllIlIlII[0] != 0;
                while (lllIlIIlIlIIIlI(lllllllllllllIIIlIllllllIIlllIll ? 1 : 0, (int)lllllllllllllIIIlIllllllIIllllII)) {
                    final char lllllllllllllIIIlIllllllIlIIlIII = lllllllllllllIIIlIllllllIIllllIl[lllllllllllllIIIlIllllllIIlllIll];
                    lllllllllllllIIIlIllllllIlIIIlIl.append((char)(lllllllllllllIIIlIllllllIlIIlIII ^ lllllllllllllIIIlIllllllIlIIIlII[lllllllllllllIIIlIllllllIlIIIIll % lllllllllllllIIIlIllllllIlIIIlII.length]));
                    "".length();
                    ++lllllllllllllIIIlIllllllIlIIIIll;
                    ++lllllllllllllIIIlIllllllIIlllIll;
                    "".length();
                    if (" ".length() < ((0xEE ^ 0xA8) & ~(0x49 ^ 0xF))) {
                        return null;
                    }
                }
                return String.valueOf(lllllllllllllIIIlIllllllIlIIIlIl);
            }
            
            private static boolean lllIlIIlIIllllI(final int lllllllllllllIIIlIllllllIIlIlllI) {
                return lllllllllllllIIIlIllllllIIlIlllI != 0;
            }
            
            private static void lllIlIIlIIlllIl() {
                (lIlIIlllIlIlII = new int[18])[0] = ((0xF8 ^ 0x88 ^ (0xDE ^ 0x9A)) & (21 + 81 - 38 + 99 ^ 2 + 149 - 18 + 18 ^ -" ".length()));
                OldServerPinger$1.lIlIIlllIlIlII[1] = " ".length();
                OldServerPinger$1.lIlIIlllIlIlII[2] = "  ".length();
                OldServerPinger$1.lIlIIlllIlIlII[3] = "   ".length();
                OldServerPinger$1.lIlIIlllIlIlII[4] = (0x3 ^ 0x14 ^ (0x49 ^ 0x5A));
                OldServerPinger$1.lIlIIlllIlIlII[5] = (0x1F ^ 0x1A);
                OldServerPinger$1.lIlIIlllIlIlII[6] = (182 + 143 - 226 + 95 ^ 81 + 186 - 162 + 91);
                OldServerPinger$1.lIlIIlllIlIlII[7] = (0x8 ^ 0xF);
                OldServerPinger$1.lIlIIlllIlIlII[8] = (" ".length() ^ (0x1F ^ 0x16));
                OldServerPinger$1.lIlIIlllIlIlII[9] = (37 + 140 - 35 + 4 ^ 85 + 56 - 75 + 89);
                OldServerPinger$1.lIlIIlllIlIlII[10] = (0x8 ^ 0x2);
                OldServerPinger$1.lIlIIlllIlIlII[11] = (0x99 ^ 0x92);
                OldServerPinger$1.lIlIIlllIlIlII[12] = (0x56 ^ 0x5A);
                OldServerPinger$1.lIlIIlllIlIlII[13] = (0x63 ^ 0x69 ^ (0x81 ^ 0x86));
                OldServerPinger$1.lIlIIlllIlIlII[14] = (0x69 ^ 0x67);
                OldServerPinger$1.lIlIIlllIlIlII[15] = (0xCB ^ 0xC4);
                OldServerPinger$1.lIlIIlllIlIlII[16] = (0x34 ^ 0x2E ^ (0x36 ^ 0x3C));
                OldServerPinger$1.lIlIIlllIlIlII[17] = (101 + 34 - 118 + 124 ^ 120 + 107 - 202 + 131);
            }
            
            private static String lllIlIIlIIllIll(final String lllllllllllllIIIlIllllllIlIlIlIl, final String lllllllllllllIIIlIllllllIlIlIlII) {
                try {
                    final SecretKeySpec lllllllllllllIIIlIllllllIlIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIllllllIlIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher lllllllllllllIIIlIllllllIlIllIIl = Cipher.getInstance("Blowfish");
                    lllllllllllllIIIlIllllllIlIllIIl.init(OldServerPinger$1.lIlIIlllIlIlII[2], lllllllllllllIIIlIllllllIlIllIlI);
                    return new String(lllllllllllllIIIlIllllllIlIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIllllllIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIIlIllllllIlIllIII) {
                    lllllllllllllIIIlIllllllIlIllIII.printStackTrace();
                    return null;
                }
            }
            
            private static void lllIlIIlIIlllII() {
                (lIlIIlllIlIIll = new String[OldServerPinger$1.lIlIIlllIlIlII[17]])[OldServerPinger$1.lIlIIlllIlIlII[0]] = lllIlIIlIIllIIl("GSYkEAM9JiNVHyUxIgQfLjAzEA5rMDMUHj4w", "KCGuj");
                OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[1]] = lllIlIIlIIllIlI("EOvmkTRX7EQ=", "IbpFW");
                OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[2]] = lllIlIIlIIllIll("2SNEkpuwedA=", "MHQPe");
                OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[3]] = lllIlIIlIIllIlI("4Wx3PaB12Ew=", "CVrJs");
                OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[4]] = lllIlIIlIIllIIl("Tw==", "EhMwk");
                OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[5]] = lllIlIIlIIllIlI("EZsHK2SSOxw=", "OUwGk");
                OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[6]] = lllIlIIlIIllIIl("RX9tcQ4FNWM=", "kQCQo");
                OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[7]] = lllIlIIlIIllIlI("L9buCOjS8KNlHxSURYlyzg==", "bVyMM");
                OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[8]] = lllIlIIlIIllIlI("CAgYrM593oE=", "QeDaG");
                OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[9]] = lllIlIIlIIllIlI("Pa/dITgtlYvLIaiKb/9jhIrJDj+ffU9k", "EuGXR");
                OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[10]] = lllIlIIlIIllIlI("FdXr1392a+liHzZwarJ74SS3g14CvoH+", "UxvGo");
                OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[11]] = lllIlIIlIIllIIl("IicfKhsCLUk4Ehk/DDlXAioGJVdDPAcgGQQ+B2sRBDsEKgNC", "kIiKw");
                OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[12]] = lllIlIIlIIllIlI("feSGljrWhfIiGx6Bj+yWtg==", "ARGCm");
                OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[13]] = lllIlIIlIIllIll("uBgQi/6aFDeXjiHlPPPGqA==", "QGKLp");
                OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[14]] = lllIlIIlIIllIll("75FLYOHt5Vs=", "bfBnn");
                OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[15]] = lllIlIIlIIllIlI("tjUpIybuBZm6wz30Fv7i5GKvgW96exgoAVEjKZ2CZRo=", "HZHmY");
                OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[16]] = lllIlIIlIIllIIl("", "nDrYH");
            }
            
            private static boolean lllIlIIlIlIIIII(final int lllllllllllllIIIlIllllllIIlIlIlI) {
                return lllllllllllllIIIlIllllllIIlIlIlI > 0;
            }
            
            private static boolean lllIlIIlIIlllll(final Object lllllllllllllIIIlIllllllIIllIIII) {
                return lllllllllllllIIIlIllllllIIllIIII != null;
            }
            
            @Override
            public void onDisconnect(final IChatComponent lllllllllllllIIIlIllllllIllIlllI) {
                if (lllIlIIlIlIIIll(this.field_147403_d ? 1 : 0)) {
                    OldServerPinger.logger.error(String.valueOf(new StringBuilder(OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[13]]).append(llllllllllllIllIlIlIllIlIIIIIlIl.serverIP).append(OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[14]]).append(lllllllllllllIIIlIllllllIllIlllI.getUnformattedText())));
                    llllllllllllIllIlIlIllIlIIIIIlIl.serverMOTD = String.valueOf(new StringBuilder().append(EnumChatFormatting.DARK_RED).append(OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[15]]));
                    llllllllllllIllIlIlIllIlIIIIIlIl.populationInfo = OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[16]];
                    OldServerPinger.this.tryCompatibilityPing(llllllllllllIllIlIlIllIlIIIIIlIl);
                }
            }
            
            private static boolean lllIlIIlIlIIIIl(final int lllllllllllllIIIlIllllllIIllIlll, final int lllllllllllllIIIlIllllllIIllIllI) {
                return lllllllllllllIIIlIllllllIIllIlll >= lllllllllllllIIIlIllllllIIllIllI;
            }
            
            private static String lllIlIIlIIllIlI(final String lllllllllllllIIIlIllllllIllIIIlI, final String lllllllllllllIIIlIllllllIllIIIIl) {
                try {
                    final SecretKeySpec lllllllllllllIIIlIllllllIllIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIllllllIllIIIIl.getBytes(StandardCharsets.UTF_8)), OldServerPinger$1.lIlIIlllIlIlII[8]), "DES");
                    final Cipher lllllllllllllIIIlIllllllIllIIllI = Cipher.getInstance("DES");
                    lllllllllllllIIIlIllllllIllIIllI.init(OldServerPinger$1.lIlIIlllIlIlII[2], lllllllllllllIIIlIllllllIllIIlll);
                    return new String(lllllllllllllIIIlIllllllIllIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIllllllIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIIlIllllllIllIIlIl) {
                    lllllllllllllIIIlIllllllIllIIlIl.printStackTrace();
                    return null;
                }
            }
            
            private static boolean lllIlIIlIlIIIlI(final int lllllllllllllIIIlIllllllIIllIIll, final int lllllllllllllIIIlIllllllIIllIIlI) {
                return lllllllllllllIIIlIllllllIIllIIll < lllllllllllllIIIlIllllllIIllIIlI;
            }
            
            @Override
            public void handleServerInfo(final S00PacketServerInfo lllllllllllllIIIlIlllllllIIIIIlI) {
                if (lllIlIIlIIllllI(this.field_183009_e ? 1 : 0)) {
                    llllllllllllIllIlIlIllIlIIIIIIll.closeChannel(new ChatComponentText(OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[0]]));
                    "".length();
                    if ("   ".length() <= -" ".length()) {
                        return;
                    }
                }
                else {
                    this.field_183009_e = (OldServerPinger$1.lIlIIlllIlIlII[1] != 0);
                    final ServerStatusResponse lllllllllllllIIIlIlllllllIIIIlll = lllllllllllllIIIlIlllllllIIIIIlI.getResponse();
                    if (lllIlIIlIIlllll(lllllllllllllIIIlIlllllllIIIIlll.getServerDescription())) {
                        llllllllllllIllIlIlIllIlIIIIIlIl.serverMOTD = lllllllllllllIIIlIlllllllIIIIlll.getServerDescription().getFormattedText();
                        "".length();
                        if ("  ".length() < ((0x5D ^ 0x51 ^ (0x5E ^ 0x11)) & (104 + 146 - 133 + 88 ^ 2 + 140 - 68 + 68 ^ -" ".length()))) {
                            return;
                        }
                    }
                    else {
                        llllllllllllIllIlIlIllIlIIIIIlIl.serverMOTD = OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[1]];
                    }
                    if (lllIlIIlIIlllll(lllllllllllllIIIlIlllllllIIIIlll.getProtocolVersionInfo())) {
                        llllllllllllIllIlIlIllIlIIIIIlIl.gameVersion = lllllllllllllIIIlIlllllllIIIIlll.getProtocolVersionInfo().getName();
                        llllllllllllIllIlIlIllIlIIIIIlIl.version = lllllllllllllIIIlIlllllllIIIIlll.getProtocolVersionInfo().getProtocol();
                        "".length();
                        if (((0x2A ^ 0x6C) & ~(0x5F ^ 0x19)) >= (0xB ^ 0xF)) {
                            return;
                        }
                    }
                    else {
                        llllllllllllIllIlIlIllIlIIIIIlIl.gameVersion = OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[2]];
                        llllllllllllIllIlIlIllIlIIIIIlIl.version = OldServerPinger$1.lIlIIlllIlIlII[0];
                    }
                    if (lllIlIIlIIlllll(lllllllllllllIIIlIlllllllIIIIlll.getPlayerCountData())) {
                        llllllllllllIllIlIlIllIlIIIIIlIl.populationInfo = String.valueOf(new StringBuilder().append(EnumChatFormatting.GRAY).append(lllllllllllllIIIlIlllllllIIIIlll.getPlayerCountData().getOnlinePlayerCount()).append(EnumChatFormatting.DARK_GRAY).append(OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[3]]).append(EnumChatFormatting.GRAY).append(lllllllllllllIIIlIlllllllIIIIlll.getPlayerCountData().getMaxPlayers()));
                        if (lllIlIIlIIllllI(ArrayUtils.isNotEmpty((Object[])lllllllllllllIIIlIlllllllIIIIlll.getPlayerCountData().getPlayers()) ? 1 : 0)) {
                            final StringBuilder lllllllllllllIIIlIlllllllIIIIllI = new StringBuilder();
                            final char lllllllllllllIIIlIllllllIlllllII;
                            final long lllllllllllllIIIlIllllllIlllllIl = ((GameProfile[])(Object)(lllllllllllllIIIlIllllllIlllllII = (char)(Object)lllllllllllllIIIlIlllllllIIIIlll.getPlayerCountData().getPlayers())).length;
                            double lllllllllllllIIIlIllllllIllllllI = OldServerPinger$1.lIlIIlllIlIlII[0];
                            "".length();
                            if (((0x66 ^ 0x1 ^ (0xF7 ^ 0x95)) & (38 + 32 - 27 + 130 ^ 137 + 10 - 6 + 27 ^ -" ".length())) != 0x0) {
                                return;
                            }
                            while (!lllIlIIlIlIIIIl((int)lllllllllllllIIIlIllllllIllllllI, (int)lllllllllllllIIIlIllllllIlllllIl)) {
                                final GameProfile lllllllllllllIIIlIlllllllIIIIlIl = lllllllllllllIIIlIllllllIlllllII[lllllllllllllIIIlIllllllIllllllI];
                                if (lllIlIIlIlIIIII(lllllllllllllIIIlIlllllllIIIIllI.length())) {
                                    lllllllllllllIIIlIlllllllIIIIllI.append(OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[4]]);
                                    "".length();
                                }
                                lllllllllllllIIIlIlllllllIIIIllI.append(lllllllllllllIIIlIlllllllIIIIlIl.getName());
                                "".length();
                                ++lllllllllllllIIIlIllllllIllllllI;
                            }
                            if (lllIlIIlIlIIIlI(lllllllllllllIIIlIlllllllIIIIlll.getPlayerCountData().getPlayers().length, lllllllllllllIIIlIlllllllIIIIlll.getPlayerCountData().getOnlinePlayerCount())) {
                                if (lllIlIIlIlIIIII(lllllllllllllIIIlIlllllllIIIIllI.length())) {
                                    lllllllllllllIIIlIlllllllIIIIllI.append(OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[5]]);
                                    "".length();
                                }
                                lllllllllllllIIIlIlllllllIIIIllI.append(OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[6]]).append(lllllllllllllIIIlIlllllllIIIIlll.getPlayerCountData().getOnlinePlayerCount() - lllllllllllllIIIlIlllllllIIIIlll.getPlayerCountData().getPlayers().length).append(OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[7]]);
                                "".length();
                            }
                            llllllllllllIllIlIlIllIlIIIIIlIl.playerList = String.valueOf(lllllllllllllIIIlIlllllllIIIIllI);
                            "".length();
                            if (((65 + 43 - 84 + 158 ^ 2 + 118 - 75 + 94) & (0x1F ^ 0x50 ^ (0x10 ^ 0x62) ^ -" ".length())) != 0x0) {
                                return;
                            }
                        }
                    }
                    else {
                        llllllllllllIllIlIlIllIlIIIIIlIl.populationInfo = String.valueOf(new StringBuilder().append(EnumChatFormatting.DARK_GRAY).append(OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[8]]));
                    }
                    if (lllIlIIlIIlllll(lllllllllllllIIIlIlllllllIIIIlll.getFavicon())) {
                        final String lllllllllllllIIIlIlllllllIIIIlII = lllllllllllllIIIlIlllllllIIIIlll.getFavicon();
                        if (lllIlIIlIIllllI(lllllllllllllIIIlIlllllllIIIIlII.startsWith(OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[9]]) ? 1 : 0)) {
                            llllllllllllIllIlIlIllIlIIIIIlIl.setBase64EncodedIconData(lllllllllllllIIIlIlllllllIIIIlII.substring(OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[10]].length()));
                            "".length();
                            if ("  ".length() < "  ".length()) {
                                return;
                            }
                        }
                        else {
                            OldServerPinger.logger.error(OldServerPinger$1.lIlIIlllIlIIll[OldServerPinger$1.lIlIIlllIlIlII[11]]);
                            "".length();
                            if (-" ".length() >= (0x13 ^ 0x2D ^ (0xF ^ 0x35))) {
                                return;
                            }
                        }
                    }
                    else {
                        llllllllllllIllIlIlIllIlIIIIIlIl.setBase64EncodedIconData(null);
                    }
                    this.field_175092_e = Minecraft.getSystemTime();
                    llllllllllllIllIlIlIllIlIIIIIIll.sendPacket(new C01PacketPing(this.field_175092_e));
                    this.field_147403_d = (OldServerPinger$1.lIlIIlllIlIlII[1] != 0);
                }
            }
            
            private static boolean lllIlIIlIlIIIll(final int lllllllllllllIIIlIllllllIIlIllII) {
                return lllllllllllllIIIlIllllllIIlIllII == 0;
            }
        });
        try {
            llllllllllllIllIlIlIllIlIIIIIIll.sendPacket(new C00Handshake(OldServerPinger.llIlIlIIlIllIl[2], llllllllllllIllIlIlIllIlIIIIIlII.getIP(), llllllllllllIllIlIlIllIlIIIIIlII.getPort(), EnumConnectionState.STATUS));
            llllllllllllIllIlIlIllIlIIIIIIll.sendPacket(new C00PacketServerQuery());
            "".length();
            if (((0x50 ^ 0x60 ^ (0xBC ^ 0x9A)) & (126 + 11 - 98 + 89 ^ 134 + 83 - 89 + 22 ^ -" ".length())) != 0x0) {
                return;
            }
        }
        catch (Throwable llllllllllllIllIlIlIllIlIIIIIIlI) {
            OldServerPinger.logger.error((Object)llllllllllllIllIlIlIllIlIIIIIIlI);
        }
    }
    
    private static String lIIlIIlllllIIIIl(final String llllllllllllIllIlIlIllIIllIlIIlI, final String llllllllllllIllIlIlIllIIllIlIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIllIIllIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIllIIllIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIlIllIIllIlIlII = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIlIllIIllIlIlII.init(OldServerPinger.llIlIlIIlIllIl[4], llllllllllllIllIlIlIllIIllIlIlIl);
            return new String(llllllllllllIllIlIlIllIIllIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIllIIllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIllIIllIlIIll) {
            llllllllllllIllIlIlIllIIllIlIIll.printStackTrace();
            return null;
        }
    }
    
    private void tryCompatibilityPing(final ServerData llllllllllllIllIlIlIllIIllllIlIl) {
        final ServerAddress llllllllllllIllIlIlIllIIllllIlll = ServerAddress.func_78860_a(llllllllllllIllIlIlIllIIllllIlIl.serverIP);
        ((AbstractBootstrap<Bootstrap, C>)((AbstractBootstrap<Bootstrap, C>)new Bootstrap()).group(NetworkManager.CLIENT_NIO_EVENTLOOP.getValue())).handler(new ChannelInitializer<Channel>() {
            private static final /* synthetic */ int[] llIIIIIlIIllII;
            
            @Override
            protected void initChannel(final Channel llllllllllllIlllIllllIIllIllllIl) throws Exception {
                try {
                    llllllllllllIlllIllllIIllIllllIl.config().setOption(ChannelOption.TCP_NODELAY, (boolean)(OldServerPinger$2.llIIIIIlIIllII[0] != 0));
                    "".length();
                    "".length();
                    if (((0xA9 ^ 0xB7) & ~(0xC ^ 0x12)) == " ".length()) {
                        return;
                    }
                }
                catch (ChannelException ex) {}
                final ChannelPipeline pipeline = llllllllllllIlllIllllIIllIllllIl.pipeline();
                final ChannelHandler[] array = new ChannelHandler[OldServerPinger$2.llIIIIIlIIllII[0]];
                array[OldServerPinger$2.llIIIIIlIIllII[1]] = new SimpleChannelInboundHandler<ByteBuf>() {
                    private static final /* synthetic */ String[] llIlIIllllIIll;
                    private static final /* synthetic */ int[] llIlIIllllIlII;
                    
                    private static String lIIlIIllIlIlIIII(final String llllllllllllIllIlIllIllIlIIIlIII, final String llllllllllllIllIlIllIllIlIIIlIIl) {
                        try {
                            final SecretKeySpec llllllllllllIllIlIllIllIlIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIllIllIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), OldServerPinger$2$1.llIlIIllllIlII[12]), "DES");
                            final Cipher llllllllllllIllIlIllIllIlIIIllII = Cipher.getInstance("DES");
                            llllllllllllIllIlIllIllIlIIIllII.init(OldServerPinger$2$1.llIlIIllllIlII[5], llllllllllllIllIlIllIllIlIIIllIl);
                            return new String(llllllllllllIllIlIllIllIlIIIllII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIllIllIlIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                        }
                        catch (Exception llllllllllllIllIlIllIllIlIIIlIll) {
                            llllllllllllIllIlIllIllIlIIIlIll.printStackTrace();
                            return null;
                        }
                    }
                    
                    static {
                        lIIlIIllIlIlIIll();
                        lIIlIIllIlIlIIlI();
                    }
                    
                    private static boolean lIIlIIllIlIlIlIl(final int llllllllllllIllIlIllIllIlIIIIIlI, final int llllllllllllIllIlIllIllIlIIIIIIl) {
                        return llllllllllllIllIlIllIllIlIIIIIlI == llllllllllllIllIlIllIllIlIIIIIIl;
                    }
                    
                    private static void lIIlIIllIlIlIIll() {
                        (llIlIIllllIlII = new int[13])[0] = (0x64 ^ 0xE) + (72 + 134 - 121 + 108) - (0x36 ^ 0x59) + (0x2A ^ 0x68);
                        OldServerPinger$2$1.llIlIIllllIlII[1] = " ".length();
                        OldServerPinger$2$1.llIlIIllllIlII[2] = 121 + 145 - 116 + 57 + (0xE2 ^ 0x81) - (0x14 ^ 0x52) + (0xA3 ^ 0xAD);
                        OldServerPinger$2$1.llIlIIllllIlII[3] = ((0x18 ^ 0x3B ^ (0xEA ^ 0x98)) & (110 + 190 - 145 + 44 ^ 47 + 96 - 49 + 56 ^ -" ".length()));
                        OldServerPinger$2$1.llIlIIllllIlII[4] = (23 + 127 - 90 + 89 ^ 12 + 69 - 15 + 80);
                        OldServerPinger$2$1.llIlIIllllIlII[5] = "  ".length();
                        OldServerPinger$2$1.llIlIIllllIlII[6] = 86 + 80 - 152 + 113;
                        OldServerPinger$2$1.llIlIIllllIlII[7] = 31 + 148 - 18 + 47 + (0x32 ^ 0x2E) - (219 + 39 - 36 + 0) + (147 + 39 - 73 + 128);
                        OldServerPinger$2$1.llIlIIllllIlII[8] = "   ".length();
                        OldServerPinger$2$1.llIlIIllllIlII[9] = (0x4C ^ 0x48);
                        OldServerPinger$2$1.llIlIIllllIlII[10] = -" ".length();
                        OldServerPinger$2$1.llIlIIllllIlII[11] = (0x44 ^ 0x25 ^ (0x6D ^ 0x9));
                        OldServerPinger$2$1.llIlIIllllIlII[12] = (0xBE ^ 0xC6 ^ (0x53 ^ 0x23));
                    }
                    
                    private static boolean lIIlIIllIlIlIlII(final int llllllllllllIllIlIllIllIIllllllI, final int llllllllllllIllIlIllIllIIlllllIl) {
                        return llllllllllllIllIlIllIllIIllllllI >= llllllllllllIllIlIllIllIIlllllIl;
                    }
                    
                    @Override
                    public void channelActive(final ChannelHandlerContext llllllllllllIllIlIllIllIllIlIIlI) throws Exception {
                        super.channelActive(llllllllllllIllIlIllIllIllIlIIlI);
                        final ByteBuf llllllllllllIllIlIllIllIllIlIlll = Unpooled.buffer();
                        try {
                            llllllllllllIllIlIllIllIllIlIlll.writeByte(OldServerPinger$2$1.llIlIIllllIlII[0]);
                            "".length();
                            llllllllllllIllIlIllIllIllIlIlll.writeByte(OldServerPinger$2$1.llIlIIllllIlII[1]);
                            "".length();
                            llllllllllllIllIlIllIllIllIlIlll.writeByte(OldServerPinger$2$1.llIlIIllllIlII[2]);
                            "".length();
                            char[] llllllllllllIllIlIllIllIllIlIllI = OldServerPinger$2$1.llIlIIllllIIll[OldServerPinger$2$1.llIlIIllllIlII[3]].toCharArray();
                            llllllllllllIllIlIllIllIllIlIlll.writeShort(llllllllllllIllIlIllIllIllIlIllI.length);
                            "".length();
                            long llllllllllllIllIlIllIllIllIIllII;
                            char llllllllllllIllIlIllIllIllIIllIl = (char)((char[])(Object)(llllllllllllIllIlIllIllIllIIllII = (long)(Object)llllllllllllIllIlIllIllIllIlIllI)).length;
                            float llllllllllllIllIlIllIllIllIIlllI = OldServerPinger$2$1.llIlIIllllIlII[3];
                            "".length();
                            if (" ".length() == ((0x3C ^ 0x7) & ~(0x63 ^ 0x58))) {
                                return;
                            }
                            while (!lIIlIIllIlIlIlII((int)llllllllllllIllIlIllIllIllIIlllI, llllllllllllIllIlIllIllIllIIllIl)) {
                                final char llllllllllllIllIlIllIllIllIlIlIl = llllllllllllIllIlIllIllIllIIllII[llllllllllllIllIlIllIllIllIIlllI];
                                llllllllllllIllIlIllIllIllIlIlll.writeChar(llllllllllllIllIlIllIllIllIlIlIl);
                                "".length();
                                ++llllllllllllIllIlIllIllIllIIlllI;
                            }
                            llllllllllllIllIlIllIllIllIlIlll.writeShort(OldServerPinger$2$1.llIlIIllllIlII[4] + OldServerPinger$2$1.llIlIIllllIlII[5] * llllllllllllIllIlIlIllIIllllIlll.getIP().length());
                            "".length();
                            llllllllllllIllIlIllIllIllIlIlll.writeByte(OldServerPinger$2$1.llIlIIllllIlII[6]);
                            "".length();
                            llllllllllllIllIlIllIllIllIlIllI = llllllllllllIllIlIlIllIIllllIlll.getIP().toCharArray();
                            llllllllllllIllIlIllIllIllIlIlll.writeShort(llllllllllllIllIlIllIllIllIlIllI.length);
                            "".length();
                            llllllllllllIllIlIllIllIllIIllIl = (char)((char[])(Object)(llllllllllllIllIlIllIllIllIIllII = (long)(Object)llllllllllllIllIlIllIllIllIlIllI)).length;
                            llllllllllllIllIlIllIllIllIIlllI = OldServerPinger$2$1.llIlIIllllIlII[3];
                            "".length();
                            if ("   ".length() == 0) {
                                return;
                            }
                            while (!lIIlIIllIlIlIlII((int)llllllllllllIllIlIllIllIllIIlllI, llllllllllllIllIlIllIllIllIIllIl)) {
                                final char llllllllllllIllIlIllIllIllIlIlII = llllllllllllIllIlIllIllIllIIllII[llllllllllllIllIlIllIllIllIIlllI];
                                llllllllllllIllIlIllIllIllIlIlll.writeChar(llllllllllllIllIlIllIllIllIlIlII);
                                "".length();
                                ++llllllllllllIllIlIllIllIllIIlllI;
                            }
                            llllllllllllIllIlIllIllIllIlIlll.writeInt(llllllllllllIllIlIlIllIIllllIlll.getPort());
                            "".length();
                            llllllllllllIllIlIllIllIllIlIIlI.channel().writeAndFlush(llllllllllllIllIlIllIllIllIlIlll).addListener((GenericFutureListener<? extends Future<? super Void>>)ChannelFutureListener.CLOSE_ON_FAILURE);
                            "".length();
                            "".length();
                            if ((0x5E ^ 0x2F ^ (0x25 ^ 0x50)) < 0) {
                                return;
                            }
                        }
                        finally {
                            llllllllllllIllIlIllIllIllIlIlll.release();
                            "".length();
                        }
                        llllllllllllIllIlIllIllIllIlIlll.release();
                        "".length();
                    }
                    
                    @Override
                    protected void channelRead0(final ChannelHandlerContext llllllllllllIllIlIllIllIlIlllllI, final ByteBuf llllllllllllIllIlIllIllIlIllIIlI) throws Exception {
                        final short llllllllllllIllIlIllIllIlIllllII = llllllllllllIllIlIllIllIlIllIIlI.readUnsignedByte();
                        if (lIIlIIllIlIlIlIl(llllllllllllIllIlIllIllIlIllllII, OldServerPinger$2$1.llIlIIllllIlII[7])) {
                            final String llllllllllllIllIlIllIllIlIlllIll = new String(llllllllllllIllIlIllIllIlIllIIlI.readBytes(llllllllllllIllIlIllIllIlIllIIlI.readShort() * OldServerPinger$2$1.llIlIIllllIlII[5]).array(), Charsets.UTF_16BE);
                            final String[] llllllllllllIllIlIllIllIlIlllIlI = (String[])Iterables.toArray(OldServerPinger.PING_RESPONSE_SPLITTER.split((CharSequence)llllllllllllIllIlIllIllIlIlllIll), (Class)String.class);
                            if (lIIlIIllIlIlIllI(OldServerPinger$2$1.llIlIIllllIIll[OldServerPinger$2$1.llIlIIllllIlII[1]].equals(llllllllllllIllIlIllIllIlIlllIlI[OldServerPinger$2$1.llIlIIllllIlII[3]]) ? 1 : 0)) {
                                final int llllllllllllIllIlIllIllIlIlllIIl = MathHelper.parseIntWithDefault(llllllllllllIllIlIllIllIlIlllIlI[OldServerPinger$2$1.llIlIIllllIlII[1]], OldServerPinger$2$1.llIlIIllllIlII[3]);
                                final String llllllllllllIllIlIllIllIlIlllIII = llllllllllllIllIlIllIllIlIlllIlI[OldServerPinger$2$1.llIlIIllllIlII[5]];
                                final String llllllllllllIllIlIllIllIlIllIlll = llllllllllllIllIlIllIllIlIlllIlI[OldServerPinger$2$1.llIlIIllllIlII[8]];
                                final int llllllllllllIllIlIllIllIlIllIllI = MathHelper.parseIntWithDefault(llllllllllllIllIlIllIllIlIlllIlI[OldServerPinger$2$1.llIlIIllllIlII[9]], OldServerPinger$2$1.llIlIIllllIlII[10]);
                                final int llllllllllllIllIlIllIllIlIllIlIl = MathHelper.parseIntWithDefault(llllllllllllIllIlIllIllIlIlllIlI[OldServerPinger$2$1.llIlIIllllIlII[11]], OldServerPinger$2$1.llIlIIllllIlII[10]);
                                llllllllllllIllIlIlIllIIllllIlIl.version = OldServerPinger$2$1.llIlIIllllIlII[10];
                                llllllllllllIllIlIlIllIIllllIlIl.gameVersion = llllllllllllIllIlIllIllIlIlllIII;
                                llllllllllllIllIlIlIllIIllllIlIl.serverMOTD = llllllllllllIllIlIllIllIlIllIlll;
                                llllllllllllIllIlIlIllIIllllIlIl.populationInfo = String.valueOf(new StringBuilder().append(EnumChatFormatting.GRAY).append(llllllllllllIllIlIllIllIlIllIllI).append(EnumChatFormatting.DARK_GRAY).append(OldServerPinger$2$1.llIlIIllllIIll[OldServerPinger$2$1.llIlIIllllIlII[5]]).append(EnumChatFormatting.GRAY).append(llllllllllllIllIlIllIllIlIllIlIl));
                            }
                        }
                        llllllllllllIllIlIllIllIlIlllllI.close();
                        "".length();
                    }
                    
                    private static String lIIlIIllIlIlIIIl(final String llllllllllllIllIlIllIllIlIIlIlIl, final String llllllllllllIllIlIllIllIlIIlIllI) {
                        try {
                            final SecretKeySpec llllllllllllIllIlIllIllIlIIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIllIllIlIIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                            final Cipher llllllllllllIllIlIllIllIlIIllIIl = Cipher.getInstance("Blowfish");
                            llllllllllllIllIlIllIllIlIIllIIl.init(OldServerPinger$2$1.llIlIIllllIlII[5], llllllllllllIllIlIllIllIlIIllIlI);
                            return new String(llllllllllllIllIlIllIllIlIIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIllIllIlIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                        }
                        catch (Exception llllllllllllIllIlIllIllIlIIllIII) {
                            llllllllllllIllIlIllIllIlIIllIII.printStackTrace();
                            return null;
                        }
                    }
                    
                    private static void lIIlIIllIlIlIIlI() {
                        (llIlIIllllIIll = new String[OldServerPinger$2$1.llIlIIllllIlII[8]])[OldServerPinger$2$1.llIlIIllllIlII[3]] = lIIlIIllIlIlIIII("XBrTXl6HSF8UNn34+xImaw==", "bAlvg");
                        OldServerPinger$2$1.llIlIIllllIIll[OldServerPinger$2$1.llIlIIllllIlII[1]] = lIIlIIllIlIlIIIl("A42xlULnOCw=", "TwqLF");
                        OldServerPinger$2$1.llIlIIllllIIll[OldServerPinger$2$1.llIlIIllllIlII[5]] = lIIlIIllIlIlIIIl("7RVyGOQkoxA=", "DaPZD");
                    }
                    
                    @Override
                    public void exceptionCaught(final ChannelHandlerContext llllllllllllIllIlIllIllIlIlIIlll, final Throwable llllllllllllIllIlIllIllIlIlIIllI) throws Exception {
                        llllllllllllIllIlIllIllIlIlIIlll.close();
                        "".length();
                    }
                    
                    private static boolean lIIlIIllIlIlIllI(final int llllllllllllIllIlIllIllIIllllIll) {
                        return llllllllllllIllIlIllIllIIllllIll != 0;
                    }
                };
                pipeline.addLast(array);
                "".length();
            }
            
            static {
                lIIIIlllIIllIlIl();
            }
            
            private static void lIIIIlllIIllIlIl() {
                (llIIIIIlIIllII = new int[2])[0] = " ".length();
                OldServerPinger$2.llIIIIIlIIllII[1] = ((0x99 ^ 0x95) & ~(0x42 ^ 0x4E));
            }
        }).channel(NioSocketChannel.class).connect(llllllllllllIllIlIlIllIIllllIlll.getIP(), llllllllllllIllIlIlIllIIllllIlll.getPort());
        "".length();
    }
    
    private static boolean lIIlIIlllllIIlIl(final int llllllllllllIllIlIlIllIIlIlllllI) {
        return llllllllllllIllIlIlIllIIlIlllllI != 0;
    }
    
    private static boolean lIIlIIlllllIIllI(final int llllllllllllIllIlIlIllIIlIllllII) {
        return llllllllllllIllIlIlIllIIlIllllII == 0;
    }
    
    static {
        lIIlIIlllllIIlII();
        lIIlIIlllllIIIll();
        PING_RESPONSE_SPLITTER = Splitter.on((char)OldServerPinger.llIlIlIIlIllIl[0]).limit(OldServerPinger.llIlIlIIlIllIl[1]);
        logger = LogManager.getLogger();
    }
}
