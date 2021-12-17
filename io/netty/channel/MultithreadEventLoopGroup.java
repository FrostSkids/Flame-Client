// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import io.netty.util.concurrent.EventExecutor;
import io.netty.util.internal.SystemPropertyUtil;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.concurrent.DefaultThreadFactory;
import java.util.concurrent.ThreadFactory;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.concurrent.MultithreadEventExecutorGroup;

public abstract class MultithreadEventLoopGroup extends MultithreadEventExecutorGroup implements EventLoopGroup
{
    private static final /* synthetic */ int DEFAULT_EVENT_LOOP_THREADS;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ String[] lllllIlIIIIll;
    private static final /* synthetic */ int[] lllllIlIIIlIl;
    
    @Override
    public ChannelFuture register(final Channel lllllllllllllIlIlIllIlllIllIlIIl, final ChannelPromise lllllllllllllIlIlIllIlllIllIIIlI) {
        return this.next().register(lllllllllllllIlIlIllIlllIllIlIIl, lllllllllllllIlIlIllIlllIllIIIlI);
    }
    
    private static void lIlIlllIIllllIl() {
        (lllllIlIIIlIl = new int[5])[0] = (0x32 ^ 0x38);
        MultithreadEventLoopGroup.lllllIlIIIlIl[1] = " ".length();
        MultithreadEventLoopGroup.lllllIlIIIlIl[2] = ((0x12 ^ 0x4F ^ (0x5A ^ 0x32)) & (" ".length() ^ (0x68 ^ 0x5C) ^ -" ".length()));
        MultithreadEventLoopGroup.lllllIlIIIlIl[3] = "  ".length();
        MultithreadEventLoopGroup.lllllIlIIIlIl[4] = (60 + 28 + 45 + 53 ^ 157 + 70 - 215 + 166);
    }
    
    @Override
    protected ThreadFactory newDefaultThreadFactory() {
        return new DefaultThreadFactory(this.getClass(), MultithreadEventLoopGroup.lllllIlIIIlIl[0]);
    }
    
    @Override
    public EventLoop next() {
        return (EventLoop)super.next();
    }
    
    private static String lIlIlllIIlIIllI(final String lllllllllllllIlIlIllIlllIIlIlllI, final String lllllllllllllIlIlIllIlllIIlIIlll) {
        try {
            final SecretKeySpec lllllllllllllIlIlIllIlllIIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIllIlllIIlIIlll.getBytes(StandardCharsets.UTF_8)), MultithreadEventLoopGroup.lllllIlIIIlIl[4]), "DES");
            final Cipher lllllllllllllIlIlIllIlllIIllIIlI = Cipher.getInstance("DES");
            lllllllllllllIlIlIllIlllIIllIIlI.init(MultithreadEventLoopGroup.lllllIlIIIlIl[3], lllllllllllllIlIlIllIlllIIllIIll);
            return new String(lllllllllllllIlIlIllIlllIIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIllIlllIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIllIlllIIllIIII) {
            lllllllllllllIlIlIllIlllIIllIIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ChannelFuture register(final Channel lllllllllllllIlIlIllIlllIlllIIII) {
        return this.next().register(lllllllllllllIlIlIllIlllIlllIIII);
    }
    
    private static void lIlIlllIIllllII() {
        (lllllIlIIIIll = new String[MultithreadEventLoopGroup.lllllIlIIIlIl[3]])[MultithreadEventLoopGroup.lllllIlIIIlIl[2]] = lIlIlllIIlIIllI("1F77WWc7ejQ8fGczNrUWsaFeQPBJkA721GIcGYT0BQg=", "edFFf");
        MultithreadEventLoopGroup.lllllIlIIIIll[MultithreadEventLoopGroup.lllllIlIIIlIl[1]] = lIlIlllIIlIllIl("YXWe88KncAHO5YKvnAM/RL0jWJsDtPx/D8ehjzNkslU=", "aENAH");
    }
    
    private static boolean lIlIlllIIllllll(final int lllllllllllllIlIlIllIlllIIlIIIII) {
        return lllllllllllllIlIlIllIlllIIlIIIII != 0;
    }
    
    private static boolean lIlIlllIIlllllI(final int lllllllllllllIlIlIllIlllIIIllIll) {
        return lllllllllllllIlIlIllIlllIIIllIll == 0;
    }
    
    protected MultithreadEventLoopGroup(final int lllllllllllllIlIlIllIllllIIIIIlI, final ThreadFactory lllllllllllllIlIlIllIllllIIIIlIl, final Object... lllllllllllllIlIlIllIllllIIIIlII) {
        int default_EVENT_LOOP_THREADS;
        if (lIlIlllIIlllllI(lllllllllllllIlIlIllIllllIIIIIlI)) {
            default_EVENT_LOOP_THREADS = MultithreadEventLoopGroup.DEFAULT_EVENT_LOOP_THREADS;
            "".length();
            if ("  ".length() < ((0xF ^ 0x0) & ~(0x99 ^ 0x96))) {
                throw null;
            }
        }
        else {
            default_EVENT_LOOP_THREADS = lllllllllllllIlIlIllIllllIIIIIlI;
        }
        super(default_EVENT_LOOP_THREADS, lllllllllllllIlIlIllIllllIIIIlIl, lllllllllllllIlIlIllIllllIIIIlII);
    }
    
    static {
        lIlIlllIIllllIl();
        lIlIlllIIllllII();
        logger = InternalLoggerFactory.getInstance(MultithreadEventLoopGroup.class);
        DEFAULT_EVENT_LOOP_THREADS = Math.max(MultithreadEventLoopGroup.lllllIlIIIlIl[1], SystemPropertyUtil.getInt(MultithreadEventLoopGroup.lllllIlIIIIll[MultithreadEventLoopGroup.lllllIlIIIlIl[2]], Runtime.getRuntime().availableProcessors() * MultithreadEventLoopGroup.lllllIlIIIlIl[3]));
        if (lIlIlllIIllllll(MultithreadEventLoopGroup.logger.isDebugEnabled() ? 1 : 0)) {
            MultithreadEventLoopGroup.logger.debug(MultithreadEventLoopGroup.lllllIlIIIIll[MultithreadEventLoopGroup.lllllIlIIIlIl[1]], (Object)MultithreadEventLoopGroup.DEFAULT_EVENT_LOOP_THREADS);
        }
    }
    
    private static String lIlIlllIIlIllIl(final String lllllllllllllIlIlIllIlllIIlllllI, final String lllllllllllllIlIlIllIlllIlIIIIII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIllIlllIlIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIllIlllIlIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIllIlllIlIIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIllIlllIlIIIllI.init(MultithreadEventLoopGroup.lllllIlIIIlIl[3], lllllllllllllIlIlIllIlllIlIIlIII);
            return new String(lllllllllllllIlIlIllIlllIlIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIllIlllIIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIllIlllIlIIIlII) {
            lllllllllllllIlIlIllIlllIlIIIlII.printStackTrace();
            return null;
        }
    }
}
