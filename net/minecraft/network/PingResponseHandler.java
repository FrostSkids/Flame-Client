// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network;

import org.apache.logging.log4j.LogManager;
import java.util.Arrays;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.channel.ChannelFutureListener;
import io.netty.buffer.Unpooled;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.server.MinecraftServer;
import com.google.common.base.Charsets;
import java.net.InetSocketAddress;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.apache.logging.log4j.Logger;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class PingResponseHandler extends ChannelInboundHandlerAdapter
{
    private /* synthetic */ NetworkSystem networkSystem;
    private static final /* synthetic */ String[] lIlIIlllIlllII;
    private static final /* synthetic */ Logger logger;
    private static final /* synthetic */ int[] lIlIlIIIIIllII;
    
    private static String lllIlIIllIIIllI(String lllllllllllllIIIlIllIIlIllIlllll, final String lllllllllllllIIIlIllIIlIllIllllI) {
        lllllllllllllIIIlIllIIlIllIlllll = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlIllIIlIllIlllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIllIIlIlllIIIlI = new StringBuilder();
        final char[] lllllllllllllIIIlIllIIlIlllIIIIl = lllllllllllllIIIlIllIIlIllIllllI.toCharArray();
        int lllllllllllllIIIlIllIIlIlllIIIII = PingResponseHandler.lIlIlIIIIIllII[2];
        final long lllllllllllllIIIlIllIIlIllIllIlI = (Object)((String)lllllllllllllIIIlIllIIlIllIlllll).toCharArray();
        final char lllllllllllllIIIlIllIIlIllIllIIl = (char)lllllllllllllIIIlIllIIlIllIllIlI.length;
        int lllllllllllllIIIlIllIIlIllIllIII = PingResponseHandler.lIlIlIIIIIllII[2];
        while (lllIlIlIlIllIIl(lllllllllllllIIIlIllIIlIllIllIII, lllllllllllllIIIlIllIIlIllIllIIl)) {
            final char lllllllllllllIIIlIllIIlIlllIIlIl = lllllllllllllIIIlIllIIlIllIllIlI[lllllllllllllIIIlIllIIlIllIllIII];
            lllllllllllllIIIlIllIIlIlllIIIlI.append((char)(lllllllllllllIIIlIllIIlIlllIIlIl ^ lllllllllllllIIIlIllIIlIlllIIIIl[lllllllllllllIIIlIllIIlIlllIIIII % lllllllllllllIIIlIllIIlIlllIIIIl.length]));
            "".length();
            ++lllllllllllllIIIlIllIIlIlllIIIII;
            ++lllllllllllllIIIlIllIIlIllIllIII;
            "".length();
            if (((0xBD ^ 0x9D) & ~(0xB1 ^ 0x91)) != ((0x8D ^ 0xA2) & ~(0x66 ^ 0x49))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIllIIlIlllIIIlI);
    }
    
    @Override
    public void channelRead(final ChannelHandlerContext lllllllllllllIIIlIllIIllIIlIIlII, final Object lllllllllllllIIIlIllIIllIIllIIlI) throws Exception {
        final ByteBuf lllllllllllllIIIlIllIIllIIllIIIl = (ByteBuf)lllllllllllllIIIlIllIIllIIllIIlI;
        lllllllllllllIIIlIllIIllIIllIIIl.markReaderIndex();
        "".length();
        boolean lllllllllllllIIIlIllIIllIIllIIII = PingResponseHandler.lIlIlIIIIIllII[0] != 0;
        try {
            if (lllIlIlIlIlIIll(lllllllllllllIIIlIllIIllIIllIIIl.readUnsignedByte(), PingResponseHandler.lIlIlIIIIIllII[1])) {
                final InetSocketAddress lllllllllllllIIIlIllIIllIIlIllll = (InetSocketAddress)lllllllllllllIIIlIllIIllIIlIIlII.channel().remoteAddress();
                final MinecraftServer lllllllllllllIIIlIllIIllIIlIlllI = this.networkSystem.getServer();
                final int lllllllllllllIIIlIllIIllIIlIllIl = lllllllllllllIIIlIllIIllIIllIIIl.readableBytes();
                switch (lllllllllllllIIIlIllIIllIIlIllIl) {
                    case 0: {
                        final Logger logger = PingResponseHandler.logger;
                        final String s = PingResponseHandler.lIlIIlllIlllII[PingResponseHandler.lIlIlIIIIIllII[2]];
                        final Object[] array = new Object[PingResponseHandler.lIlIlIIIIIllII[3]];
                        array[PingResponseHandler.lIlIlIIIIIllII[2]] = lllllllllllllIIIlIllIIllIIlIllll.getAddress();
                        array[PingResponseHandler.lIlIlIIIIIllII[0]] = lllllllllllllIIIlIllIIllIIlIllll.getPort();
                        logger.debug(s, array);
                        final String format = PingResponseHandler.lIlIIlllIlllII[PingResponseHandler.lIlIlIIIIIllII[0]];
                        final Object[] args = new Object[PingResponseHandler.lIlIlIIIIIllII[4]];
                        args[PingResponseHandler.lIlIlIIIIIllII[2]] = lllllllllllllIIIlIllIIllIIlIlllI.getMOTD();
                        args[PingResponseHandler.lIlIlIIIIIllII[0]] = lllllllllllllIIIlIllIIllIIlIlllI.getCurrentPlayerCount();
                        args[PingResponseHandler.lIlIlIIIIIllII[3]] = lllllllllllllIIIlIllIIllIIlIlllI.getMaxPlayers();
                        final String lllllllllllllIIIlIllIIllIIlIllII = String.format(format, args);
                        this.writeAndFlush(lllllllllllllIIIlIllIIllIIlIIlII, this.getStringBuffer(lllllllllllllIIIlIllIIllIIlIllII));
                        "".length();
                        if (-"  ".length() > 0) {
                            return;
                        }
                        break;
                    }
                    case 1: {
                        if (lllIlIlIlIlIlII(lllllllllllllIIIlIllIIllIIllIIIl.readUnsignedByte(), PingResponseHandler.lIlIlIIIIIllII[0])) {
                            if (lllIlIlIlIlIlIl(lllllllllllllIIIlIllIIllIIllIIII ? 1 : 0)) {
                                lllllllllllllIIIlIllIIllIIllIIIl.resetReaderIndex();
                                "".length();
                                lllllllllllllIIIlIllIIllIIlIIlII.channel().pipeline().remove(PingResponseHandler.lIlIIlllIlllII[PingResponseHandler.lIlIlIIIIIllII[3]]);
                                "".length();
                                lllllllllllllIIIlIllIIllIIlIIlII.fireChannelRead(lllllllllllllIIIlIllIIllIIllIIlI);
                                "".length();
                            }
                            return;
                        }
                        final Logger logger2 = PingResponseHandler.logger;
                        final String s2 = PingResponseHandler.lIlIIlllIlllII[PingResponseHandler.lIlIlIIIIIllII[4]];
                        final Object[] array2 = new Object[PingResponseHandler.lIlIlIIIIIllII[3]];
                        array2[PingResponseHandler.lIlIlIIIIIllII[2]] = lllllllllllllIIIlIllIIllIIlIllll.getAddress();
                        array2[PingResponseHandler.lIlIlIIIIIllII[0]] = lllllllllllllIIIlIllIIllIIlIllll.getPort();
                        logger2.debug(s2, array2);
                        final String format2 = PingResponseHandler.lIlIIlllIlllII[PingResponseHandler.lIlIlIIIIIllII[5]];
                        final Object[] args2 = new Object[PingResponseHandler.lIlIlIIIIIllII[6]];
                        args2[PingResponseHandler.lIlIlIIIIIllII[2]] = PingResponseHandler.lIlIlIIIIIllII[7];
                        args2[PingResponseHandler.lIlIlIIIIIllII[0]] = lllllllllllllIIIlIllIIllIIlIlllI.getMinecraftVersion();
                        args2[PingResponseHandler.lIlIlIIIIIllII[3]] = lllllllllllllIIIlIllIIllIIlIlllI.getMOTD();
                        args2[PingResponseHandler.lIlIlIIIIIllII[4]] = lllllllllllllIIIlIllIIllIIlIlllI.getCurrentPlayerCount();
                        args2[PingResponseHandler.lIlIlIIIIIllII[5]] = lllllllllllllIIIlIllIIllIIlIlllI.getMaxPlayers();
                        final String lllllllllllllIIIlIllIIllIIlIlIll = String.format(format2, args2);
                        this.writeAndFlush(lllllllllllllIIIlIllIIllIIlIIlII, this.getStringBuffer(lllllllllllllIIIlIllIIllIIlIlIll));
                        "".length();
                        if (null != null) {
                            return;
                        }
                        break;
                    }
                    default: {
                        int n;
                        if (lllIlIlIlIlIIll(lllllllllllllIIIlIllIIllIIllIIIl.readUnsignedByte(), PingResponseHandler.lIlIlIIIIIllII[0])) {
                            n = PingResponseHandler.lIlIlIIIIIllII[0];
                            "".length();
                            if (((0x4D ^ 0x24 ^ (0x32 ^ 0x62)) & (0x46 ^ 0x2B ^ (0x4F ^ 0x1B) ^ -" ".length())) == " ".length()) {
                                return;
                            }
                        }
                        else {
                            n = PingResponseHandler.lIlIlIIIIIllII[2];
                        }
                        final int n2;
                        boolean lllllllllllllIIIlIllIIllIIlIlIlI = (n2 = n) != 0;
                        int n3;
                        if (lllIlIlIlIlIIll(lllllllllllllIIIlIllIIllIIllIIIl.readUnsignedByte(), PingResponseHandler.lIlIlIIIIIllII[8])) {
                            n3 = PingResponseHandler.lIlIlIIIIIllII[0];
                            "".length();
                            if (((0x3C ^ 0x7A) & ~(0x21 ^ 0x67)) > (0x6B ^ 0x6F)) {
                                return;
                            }
                        }
                        else {
                            n3 = PingResponseHandler.lIlIlIIIIIllII[2];
                        }
                        lllllllllllllIIIlIllIIllIIlIlIlI = ((n2 & n3) != 0x0);
                        lllllllllllllIIIlIllIIllIIlIlIlI &= PingResponseHandler.lIlIIlllIlllII[PingResponseHandler.lIlIlIIIIIllII[6]].equals(new String(lllllllllllllIIIlIllIIllIIllIIIl.readBytes(lllllllllllllIIIlIllIIllIIllIIIl.readShort() * PingResponseHandler.lIlIlIIIIIllII[3]).array(), Charsets.UTF_16BE));
                        final int lllllllllllllIIIlIllIIllIIlIlIIl = lllllllllllllIIIlIllIIllIIllIIIl.readUnsignedShort();
                        final int n4 = lllllllllllllIIIlIllIIllIIlIlIlI ? 1 : 0;
                        int n5;
                        if (lllIlIlIlIlIllI(lllllllllllllIIIlIllIIllIIllIIIl.readUnsignedByte(), PingResponseHandler.lIlIlIIIIIllII[9])) {
                            n5 = PingResponseHandler.lIlIlIIIIIllII[0];
                            "".length();
                            if ((0x30 ^ 0x35) == 0x0) {
                                return;
                            }
                        }
                        else {
                            n5 = PingResponseHandler.lIlIlIIIIIllII[2];
                        }
                        final int n6;
                        lllllllllllllIIIlIllIIllIIlIlIlI = ((n6 = (n4 & n5)) != 0);
                        int n7;
                        if (lllIlIlIlIlIIll(PingResponseHandler.lIlIlIIIIIllII[4] + lllllllllllllIIIlIllIIllIIllIIIl.readBytes(lllllllllllllIIIlIllIIllIIllIIIl.readShort() * PingResponseHandler.lIlIlIIIIIllII[3]).array().length + PingResponseHandler.lIlIlIIIIIllII[5], lllllllllllllIIIlIllIIllIIlIlIIl)) {
                            n7 = PingResponseHandler.lIlIlIIIIIllII[0];
                            "".length();
                            if (-" ".length() != -" ".length()) {
                                return;
                            }
                        }
                        else {
                            n7 = PingResponseHandler.lIlIlIIIIIllII[2];
                        }
                        final int n8;
                        lllllllllllllIIIlIllIIllIIlIlIlI = ((n8 = (n6 & n7)) != 0);
                        int n9;
                        if (lllIlIlIlIlIlll(lllllllllllllIIIlIllIIllIIllIIIl.readInt(), PingResponseHandler.lIlIlIIIIIllII[10])) {
                            n9 = PingResponseHandler.lIlIlIIIIIllII[0];
                            "".length();
                            if ("  ".length() == " ".length()) {
                                return;
                            }
                        }
                        else {
                            n9 = PingResponseHandler.lIlIlIIIIIllII[2];
                        }
                        final int n10;
                        lllllllllllllIIIlIllIIllIIlIlIlI = ((n10 = (n8 & n9)) != 0);
                        int n11;
                        if (lllIlIlIlIllIII(lllllllllllllIIIlIllIIllIIllIIIl.readableBytes())) {
                            n11 = PingResponseHandler.lIlIlIIIIIllII[0];
                            "".length();
                            if ("  ".length() >= (0xFB ^ 0xA6 ^ (0x49 ^ 0x10))) {
                                return;
                            }
                        }
                        else {
                            n11 = PingResponseHandler.lIlIlIIIIIllII[2];
                        }
                        lllllllllllllIIIlIllIIllIIlIlIlI = ((n10 & n11) != 0x0);
                        if (lllIlIlIlIllIII(lllllllllllllIIIlIllIIllIIlIlIlI ? 1 : 0)) {
                            if (lllIlIlIlIlIlIl(lllllllllllllIIIlIllIIllIIllIIII ? 1 : 0)) {
                                lllllllllllllIIIlIllIIllIIllIIIl.resetReaderIndex();
                                "".length();
                                lllllllllllllIIIlIllIIllIIlIIlII.channel().pipeline().remove(PingResponseHandler.lIlIIlllIlllII[PingResponseHandler.lIlIlIIIIIllII[11]]);
                                "".length();
                                lllllllllllllIIIlIllIIllIIlIIlII.fireChannelRead(lllllllllllllIIIlIllIIllIIllIIlI);
                                "".length();
                            }
                            return;
                        }
                        final Logger logger3 = PingResponseHandler.logger;
                        final String s3 = PingResponseHandler.lIlIIlllIlllII[PingResponseHandler.lIlIlIIIIIllII[12]];
                        final Object[] array3 = new Object[PingResponseHandler.lIlIlIIIIIllII[3]];
                        array3[PingResponseHandler.lIlIlIIIIIllII[2]] = lllllllllllllIIIlIllIIllIIlIllll.getAddress();
                        array3[PingResponseHandler.lIlIlIIIIIllII[0]] = lllllllllllllIIIlIllIIllIIlIllll.getPort();
                        logger3.debug(s3, array3);
                        final String format3 = PingResponseHandler.lIlIIlllIlllII[PingResponseHandler.lIlIlIIIIIllII[13]];
                        final Object[] args3 = new Object[PingResponseHandler.lIlIlIIIIIllII[6]];
                        args3[PingResponseHandler.lIlIlIIIIIllII[2]] = PingResponseHandler.lIlIlIIIIIllII[7];
                        args3[PingResponseHandler.lIlIlIIIIIllII[0]] = lllllllllllllIIIlIllIIllIIlIlllI.getMinecraftVersion();
                        args3[PingResponseHandler.lIlIlIIIIIllII[3]] = lllllllllllllIIIlIllIIllIIlIlllI.getMOTD();
                        args3[PingResponseHandler.lIlIlIIIIIllII[4]] = lllllllllllllIIIlIllIIllIIlIlllI.getCurrentPlayerCount();
                        args3[PingResponseHandler.lIlIlIIIIIllII[5]] = lllllllllllllIIIlIllIIllIIlIlllI.getMaxPlayers();
                        final String lllllllllllllIIIlIllIIllIIlIlIII = String.format(format3, args3);
                        final ByteBuf lllllllllllllIIIlIllIIllIIlIIlll = this.getStringBuffer(lllllllllllllIIIlIllIIllIIlIlIII);
                        try {
                            this.writeAndFlush(lllllllllllllIIIlIllIIllIIlIIlII, lllllllllllllIIIlIllIIllIIlIIlll);
                            "".length();
                            if ("  ".length() < 0) {
                                return;
                            }
                        }
                        finally {
                            lllllllllllllIIIlIllIIllIIlIIlll.release();
                            "".length();
                        }
                        lllllllllllllIIIlIllIIllIIlIIlll.release();
                        "".length();
                        break;
                    }
                }
                lllllllllllllIIIlIllIIllIIllIIIl.release();
                "".length();
                lllllllllllllIIIlIllIIllIIllIIII = (PingResponseHandler.lIlIlIIIIIllII[2] != 0);
                if (lllIlIlIlIlIlIl(lllllllllllllIIIlIllIIllIIllIIII ? 1 : 0)) {
                    lllllllllllllIIIlIllIIllIIllIIIl.resetReaderIndex();
                    "".length();
                    lllllllllllllIIIlIllIIllIIlIIlII.channel().pipeline().remove(PingResponseHandler.lIlIIlllIlllII[PingResponseHandler.lIlIlIIIIIllII[14]]);
                    "".length();
                    lllllllllllllIIIlIllIIllIIlIIlII.fireChannelRead(lllllllllllllIIIlIllIIllIIllIIlI);
                    "".length();
                }
                return;
            }
        }
        catch (RuntimeException lllllllllllllIIIlIllIIllIIlIIllI) {
            if (lllIlIlIlIlIlIl(lllllllllllllIIIlIllIIllIIllIIII ? 1 : 0)) {
                lllllllllllllIIIlIllIIllIIllIIIl.resetReaderIndex();
                "".length();
                lllllllllllllIIIlIllIIllIIlIIlII.channel().pipeline().remove(PingResponseHandler.lIlIIlllIlllII[PingResponseHandler.lIlIlIIIIIllII[15]]);
                "".length();
                lllllllllllllIIIlIllIIllIIlIIlII.fireChannelRead(lllllllllllllIIIlIllIIllIIllIIlI);
                "".length();
            }
            return;
        }
        finally {
            if (lllIlIlIlIlIlIl(lllllllllllllIIIlIllIIllIIllIIII ? 1 : 0)) {
                lllllllllllllIIIlIllIIllIIllIIIl.resetReaderIndex();
                "".length();
                lllllllllllllIIIlIllIIllIIlIIlII.channel().pipeline().remove(PingResponseHandler.lIlIIlllIlllII[PingResponseHandler.lIlIlIIIIIllII[16]]);
                "".length();
                lllllllllllllIIIlIllIIllIIlIIlII.fireChannelRead(lllllllllllllIIIlIllIIllIIllIIlI);
                "".length();
            }
        }
        if (lllIlIlIlIlIlIl(lllllllllllllIIIlIllIIllIIllIIII ? 1 : 0)) {
            lllllllllllllIIIlIllIIllIIllIIIl.resetReaderIndex();
            "".length();
            lllllllllllllIIIlIllIIllIIlIIlII.channel().pipeline().remove(PingResponseHandler.lIlIIlllIlllII[PingResponseHandler.lIlIlIIIIIllII[17]]);
            "".length();
            lllllllllllllIIIlIllIIllIIlIIlII.fireChannelRead(lllllllllllllIIIlIllIIllIIllIIlI);
            "".length();
        }
    }
    
    private static void lllIlIIllIIlIlI() {
        (lIlIIlllIlllII = new String[PingResponseHandler.lIlIlIIIIIllII[19]])[PingResponseHandler.lIlIlIIIIIllII[2]] = lllIlIIllIIIlII("gkjT7kvfGxQ69nDumwHQ5uQEzGIi0uP8apunov9B/Xs=", "lyGpM");
        PingResponseHandler.lIlIIlllIlllII[PingResponseHandler.lIlIlIIIIIllII[0]] = lllIlIIllIIIlIl("NwG1H8YiF+nbxXwP94rb7w==", "GYOEj");
        PingResponseHandler.lIlIIlllIlllII[PingResponseHandler.lIlIlIIIIIllII[3]] = lllIlIIllIIIlII("waGpNXyLIVgbqlqfAK71mQ==", "AEmsS");
        PingResponseHandler.lIlIIlllIlllII[PingResponseHandler.lIlIlIIIIIllII[4]] = lllIlIIllIIIlII("kgOhOmuia3+nYiQTClPHSdrb6R5U3am/vVT0VokJCAA=", "drlZf");
        PingResponseHandler.lIlIIlllIlllII[PingResponseHandler.lIlIlIIIIIllII[5]] = lllIlIIllIIIlIl("h3inrnstBQYtlO8cgdtA1Auc7N3HGQow", "WMawq");
        PingResponseHandler.lIlIIlllIlllII[PingResponseHandler.lIlIlIIIIIllII[6]] = lllIlIIllIIIlII("HWfOvyZXQcg7kgs2rAs3aw==", "EdqHf");
        PingResponseHandler.lIlIIlllIlllII[PingResponseHandler.lIlIlIIIIIllII[11]] = lllIlIIllIIIllI("OCQmBgEtHjASByY4", "TAAgb");
        PingResponseHandler.lIlIIlllIlllII[PingResponseHandler.lIlIlIIIIIllII[12]] = lllIlIIllIIIlII("xY8l3curroymhN9wsRzgh1szditBAKuh", "OuWiy");
        PingResponseHandler.lIlIIlllIlllII[PingResponseHandler.lIlIlIIIIIllII[13]] = lllIlIIllIIIlII("uqtla6QYbnSD5Stz6dT7T937VIM6Fb+J", "TpuqN");
        PingResponseHandler.lIlIIlllIlllII[PingResponseHandler.lIlIlIIIIIllII[14]] = lllIlIIllIIIllI("BiArLAYTGj04ABg8", "jELMe");
        PingResponseHandler.lIlIIlllIlllII[PingResponseHandler.lIlIlIIIIIllII[15]] = lllIlIIllIIIlII("pA4c5X3VzHm/Y+nxxa5biw==", "mVXcg");
        PingResponseHandler.lIlIIlllIlllII[PingResponseHandler.lIlIlIIIIIllII[16]] = lllIlIIllIIIllI("CA0gDi4dNzYaKBYR", "dhGoM");
        PingResponseHandler.lIlIIlllIlllII[PingResponseHandler.lIlIlIIIIIllII[17]] = lllIlIIllIIIlIl("CiNy1ebr2ilHUxnJv9YPTw==", "qPkrL");
    }
    
    private static void lllIlIlIlIlIIlI() {
        (lIlIlIIIIIllII = new int[20])[0] = " ".length();
        PingResponseHandler.lIlIlIIIIIllII[1] = (0x79 ^ 0x7C) + (0x24 ^ 0x1C) - (0xAA ^ 0xAE) + (2 + 174 - 159 + 180);
        PingResponseHandler.lIlIlIIIIIllII[2] = ((78 + 33 - 74 + 111 ^ 117 + 84 - 80 + 13) & (180 + 160 - 263 + 106 ^ 120 + 18 - 45 + 72 ^ -" ".length()));
        PingResponseHandler.lIlIlIIIIIllII[3] = "  ".length();
        PingResponseHandler.lIlIlIIIIIllII[4] = "   ".length();
        PingResponseHandler.lIlIlIIIIIllII[5] = (0x1D ^ 0x19);
        PingResponseHandler.lIlIlIIIIIllII[6] = (0x6F ^ 0x6A);
        PingResponseHandler.lIlIlIIIIIllII[7] = (0x10 ^ 0x19) + (0x6A ^ 0x5) - (0x2C ^ 0x59) + (0xDE ^ 0xA2);
        PingResponseHandler.lIlIlIIIIIllII[8] = 10 + 43 - 51 + 126 + (0x38 ^ 0x53) - (0xD7 ^ 0x91) + (0xEC ^ 0xB9);
        PingResponseHandler.lIlIlIIIIIllII[9] = (0x70 ^ 0x39);
        PingResponseHandler.lIlIlIIIIIllII[10] = (-1 & 0xFFFF);
        PingResponseHandler.lIlIlIIIIIllII[11] = (124 + 85 - 136 + 94 ^ 152 + 61 - 99 + 47);
        PingResponseHandler.lIlIlIIIIIllII[12] = (0x8C ^ 0xB2 ^ (0x97 ^ 0xAE));
        PingResponseHandler.lIlIlIIIIIllII[13] = (0xF ^ 0x7);
        PingResponseHandler.lIlIlIIIIIllII[14] = (0x7F ^ 0x76);
        PingResponseHandler.lIlIlIIIIIllII[15] = (0xB6 ^ 0xBC);
        PingResponseHandler.lIlIlIIIIIllII[16] = (67 + 119 - 140 + 136 ^ 79 + 25 - 82 + 167);
        PingResponseHandler.lIlIlIIIIIllII[17] = (0x70 ^ 0x17 ^ (0xE4 ^ 0x8F));
        PingResponseHandler.lIlIlIIIIIllII[18] = (0x7 ^ 0x49) + (119 + 138 - 183 + 78) - (0xC ^ 0x9) + (0x64 ^ 0x7A);
        PingResponseHandler.lIlIlIIIIIllII[19] = (0xBC ^ 0x8F ^ (0xA7 ^ 0x99));
    }
    
    private static String lllIlIIllIIIlIl(final String lllllllllllllIIIlIllIIlIllIIllll, final String lllllllllllllIIIlIllIIlIllIIllII) {
        try {
            final SecretKeySpec lllllllllllllIIIlIllIIlIllIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIllIIlIllIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIllIIlIllIlIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIllIIlIllIlIIIl.init(PingResponseHandler.lIlIlIIIIIllII[3], lllllllllllllIIIlIllIIlIllIlIIlI);
            return new String(lllllllllllllIIIlIllIIlIllIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIllIIlIllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIllIIlIllIlIIII) {
            lllllllllllllIIIlIllIIlIllIlIIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIlIlIlIlIIll(final int lllllllllllllIIIlIllIIlIllIIIlll, final int lllllllllllllIIIlIllIIlIllIIIllI) {
        return lllllllllllllIIIlIllIIlIllIIIlll == lllllllllllllIIIlIllIIlIllIIIllI;
    }
    
    private static boolean lllIlIlIlIlIlll(final int lllllllllllllIIIlIllIIlIlIlllIll, final int lllllllllllllIIIlIllIIlIlIlllIlI) {
        return lllllllllllllIIIlIllIIlIlIlllIll <= lllllllllllllIIIlIllIIlIlIlllIlI;
    }
    
    private ByteBuf getStringBuffer(final String lllllllllllllIIIlIllIIllIIIIIIlI) {
        final ByteBuf lllllllllllllIIIlIllIIllIIIIIlIl = Unpooled.buffer();
        lllllllllllllIIIlIllIIllIIIIIlIl.writeByte(PingResponseHandler.lIlIlIIIIIllII[18]);
        "".length();
        final char[] lllllllllllllIIIlIllIIllIIIIIlII = lllllllllllllIIIlIllIIllIIIIIIlI.toCharArray();
        lllllllllllllIIIlIllIIllIIIIIlIl.writeShort(lllllllllllllIIIlIllIIllIIIIIlII.length);
        "".length();
        final boolean lllllllllllllIIIlIllIIlIllllllII;
        final float lllllllllllllIIIlIllIIlIllllllIl = ((char[])(Object)(lllllllllllllIIIlIllIIlIllllllII = (boolean)(Object)lllllllllllllIIIlIllIIllIIIIIlII)).length;
        float lllllllllllllIIIlIllIIlIlllllllI = PingResponseHandler.lIlIlIIIIIllII[2];
        "".length();
        if ((0x5B ^ 0x5F) < 0) {
            return null;
        }
        while (!lllIlIlIlIlIllI((int)lllllllllllllIIIlIllIIlIlllllllI, (int)lllllllllllllIIIlIllIIlIllllllIl)) {
            final char lllllllllllllIIIlIllIIllIIIIIIll = lllllllllllllIIIlIllIIlIllllllII[lllllllllllllIIIlIllIIlIlllllllI];
            lllllllllllllIIIlIllIIllIIIIIlIl.writeChar(lllllllllllllIIIlIllIIllIIIIIIll);
            "".length();
            ++lllllllllllllIIIlIllIIlIlllllllI;
        }
        return lllllllllllllIIIlIllIIllIIIIIlIl;
    }
    
    public PingResponseHandler(final NetworkSystem lllllllllllllIIIlIllIIllIlIIIlIl) {
        this.networkSystem = lllllllllllllIIIlIllIIllIlIIIlIl;
    }
    
    private void writeAndFlush(final ChannelHandlerContext lllllllllllllIIIlIllIIllIIIlIIII, final ByteBuf lllllllllllllIIIlIllIIllIIIIllll) {
        lllllllllllllIIIlIllIIllIIIlIIII.pipeline().firstContext().writeAndFlush(lllllllllllllIIIlIllIIllIIIIllll).addListener((GenericFutureListener<? extends Future<? super Void>>)ChannelFutureListener.CLOSE);
        "".length();
    }
    
    private static String lllIlIIllIIIlII(final String lllllllllllllIIIlIllIIlIllllIlII, final String lllllllllllllIIIlIllIIlIllllIIll) {
        try {
            final SecretKeySpec lllllllllllllIIIlIllIIlIllllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIllIIlIllllIIll.getBytes(StandardCharsets.UTF_8)), PingResponseHandler.lIlIlIIIIIllII[13]), "DES");
            final Cipher lllllllllllllIIIlIllIIlIllllIllI = Cipher.getInstance("DES");
            lllllllllllllIIIlIllIIlIllllIllI.init(PingResponseHandler.lIlIlIIIIIllII[3], lllllllllllllIIIlIllIIlIllllIlll);
            return new String(lllllllllllllIIIlIllIIlIllllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIllIIlIllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIllIIlIllllIlIl) {
            lllllllllllllIIIlIllIIlIllllIlIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIlIlIlIlIlII(final int lllllllllllllIIIlIllIIlIlIllIIll, final int lllllllllllllIIIlIllIIlIlIllIIlI) {
        return lllllllllllllIIIlIllIIlIlIllIIll != lllllllllllllIIIlIllIIlIlIllIIlI;
    }
    
    private static boolean lllIlIlIlIllIIl(final int lllllllllllllIIIlIllIIlIlIllllll, final int lllllllllllllIIIlIllIIlIlIlllllI) {
        return lllllllllllllIIIlIllIIlIlIllllll < lllllllllllllIIIlIllIIlIlIlllllI;
    }
    
    private static boolean lllIlIlIlIlIllI(final int lllllllllllllIIIlIllIIlIllIIIIll, final int lllllllllllllIIIlIllIIlIllIIIIlI) {
        return lllllllllllllIIIlIllIIlIllIIIIll >= lllllllllllllIIIlIllIIlIllIIIIlI;
    }
    
    private static boolean lllIlIlIlIllIII(final int lllllllllllllIIIlIllIIlIlIllIllI) {
        return lllllllllllllIIIlIllIIlIlIllIllI == 0;
    }
    
    private static boolean lllIlIlIlIlIlIl(final int lllllllllllllIIIlIllIIlIlIlllIII) {
        return lllllllllllllIIIlIllIIlIlIlllIII != 0;
    }
    
    static {
        lllIlIlIlIlIIlI();
        lllIlIIllIIlIlI();
        logger = LogManager.getLogger();
    }
}
