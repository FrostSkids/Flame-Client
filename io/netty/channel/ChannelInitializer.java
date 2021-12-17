// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.internal.logging.InternalLogger;

@ChannelHandler.Sharable
public abstract class ChannelInitializer<C extends Channel> extends ChannelInboundHandlerAdapter
{
    private static final /* synthetic */ String[] lIlIIIIlllIIIl;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ int[] lIlIIIIlllIlII;
    
    protected abstract void initChannel(final C p0) throws Exception;
    
    private static String lllIIIIllllllll(final String lllllllllllllIIlIIIIIIllIlllIlII, final String lllllllllllllIIlIIIIIIllIlllIIll) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIIIIllIllllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIIIllIlllIIll.getBytes(StandardCharsets.UTF_8)), ChannelInitializer.lIlIIIIlllIlII[2]), "DES");
            final Cipher lllllllllllllIIlIIIIIIllIllllIII = Cipher.getInstance("DES");
            lllllllllllllIIlIIIIIIllIllllIII.init(ChannelInitializer.lIlIIIIlllIlII[3], lllllllllllllIIlIIIIIIllIllllIIl);
            return new String(lllllllllllllIIlIIIIIIllIllllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIIIllIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIIIIllIlllIlll) {
            lllllllllllllIIlIIIIIIllIlllIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIIIlIIIIIlII(final int lllllllllllllIIlIIIIIIllIllIllIl) {
        return lllllllllllllIIlIIIIIIllIllIllIl == 0;
    }
    
    private static void lllIIIlIIIIIIlI() {
        (lIlIIIIlllIlII = new int[4])[0] = ((0x7D ^ 0xE ^ (0xBB ^ 0xA9)) & (174 + 7 - 80 + 128 ^ 111 + 55 - 69 + 35 ^ -" ".length()));
        ChannelInitializer.lIlIIIIlllIlII[1] = " ".length();
        ChannelInitializer.lIlIIIIlllIlII[2] = (0x2 ^ 0x39 ^ (0x4E ^ 0x7D));
        ChannelInitializer.lIlIIIIlllIlII[3] = "  ".length();
    }
    
    static {
        lllIIIlIIIIIIlI();
        lllIIIlIIIIIIII();
        logger = InternalLoggerFactory.getInstance(ChannelInitializer.class);
    }
    
    @Override
    public final void channelRegistered(final ChannelHandlerContext lllllllllllllIIlIIIIIIlllIIIIIlI) throws Exception {
        final ChannelPipeline lllllllllllllIIlIIIIIIlllIIIIlIl = lllllllllllllIIlIIIIIIlllIIIIIlI.pipeline();
        boolean lllllllllllllIIlIIIIIIlllIIIIlII = ChannelInitializer.lIlIIIIlllIlII[0] != 0;
        try {
            this.initChannel(lllllllllllllIIlIIIIIIlllIIIIIlI.channel());
            lllllllllllllIIlIIIIIIlllIIIIlIl.remove(this);
            "".length();
            lllllllllllllIIlIIIIIIlllIIIIIlI.fireChannelRegistered();
            "".length();
            lllllllllllllIIlIIIIIIlllIIIIlII = (ChannelInitializer.lIlIIIIlllIlII[1] != 0);
            if (lllIIIlIIIIIIll(lllllllllllllIIlIIIIIIlllIIIIlIl.context(this))) {
                lllllllllllllIIlIIIIIIlllIIIIlIl.remove(this);
                "".length();
            }
            if (lllIIIlIIIIIlII(lllllllllllllIIlIIIIIIlllIIIIlII ? 1 : 0)) {
                lllllllllllllIIlIIIIIIlllIIIIIlI.close();
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
            }
        }
        catch (Throwable lllllllllllllIIlIIIIIIlllIIIlIII) {
            ChannelInitializer.logger.warn(String.valueOf(new StringBuilder().append(ChannelInitializer.lIlIIIIlllIIIl[ChannelInitializer.lIlIIIIlllIlII[0]]).append(lllllllllllllIIlIIIIIIlllIIIIIlI.channel())), lllllllllllllIIlIIIIIIlllIIIlIII);
            if (lllIIIlIIIIIIll(lllllllllllllIIlIIIIIIlllIIIIlIl.context(this))) {
                lllllllllllllIIlIIIIIIlllIIIIlIl.remove(this);
                "".length();
            }
            if (lllIIIlIIIIIlII(lllllllllllllIIlIIIIIIlllIIIIlII ? 1 : 0)) {
                lllllllllllllIIlIIIIIIlllIIIIIlI.close();
                "".length();
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
            }
        }
        finally {
            if (lllIIIlIIIIIIll(lllllllllllllIIlIIIIIIlllIIIIlIl.context(this))) {
                lllllllllllllIIlIIIIIIlllIIIIlIl.remove(this);
                "".length();
            }
            if (lllIIIlIIIIIlII(lllllllllllllIIlIIIIIIlllIIIIlII ? 1 : 0)) {
                lllllllllllllIIlIIIIIIlllIIIIIlI.close();
                "".length();
            }
        }
    }
    
    private static boolean lllIIIlIIIIIIll(final Object lllllllllllllIIlIIIIIIllIllIllll) {
        return lllllllllllllIIlIIIIIIllIllIllll != null;
    }
    
    private static void lllIIIlIIIIIIII() {
        (lIlIIIIlllIIIl = new String[ChannelInitializer.lIlIIIIlllIlII[1]])[ChannelInitializer.lIlIIIIlllIlII[0]] = lllIIIIllllllll("u1gotzvlHmQ4pdv7ZEndQd2KnA2DeVm35CD1BAct7QU+uK2POKXDU3g6cAEniL+u", "FPmVr");
    }
}
