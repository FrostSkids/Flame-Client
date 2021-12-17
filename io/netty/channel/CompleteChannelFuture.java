// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.concurrent.EventExecutor;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.concurrent.CompleteFuture;

abstract class CompleteChannelFuture extends CompleteFuture<Void> implements ChannelFuture
{
    private static final /* synthetic */ int[] lllIIIIIIlIlll;
    private final /* synthetic */ Channel channel;
    private static final /* synthetic */ String[] lllIIIIIIlIlIl;
    
    @Override
    public ChannelFuture addListener(final GenericFutureListener<? extends Future<? super Void>> llllllllllllIllIIIlIIIIllIlllIII) {
        super.addListener(llllllllllllIllIIIlIIIIllIlllIII);
        "".length();
        return this;
    }
    
    protected CompleteChannelFuture(final Channel llllllllllllIllIIIlIIIIlllIIIlIl, final EventExecutor llllllllllllIllIIIlIIIIlllIIIlll) {
        super(llllllllllllIllIIIlIIIIlllIIIlll);
        if (lIIllIlllllllIlI(llllllllllllIllIIIlIIIIlllIIIlIl)) {
            throw new NullPointerException(CompleteChannelFuture.lllIIIIIIlIlIl[CompleteChannelFuture.lllIIIIIIlIlll[0]]);
        }
        this.channel = llllllllllllIllIIIlIIIIlllIIIlIl;
    }
    
    private static String lIIllIllllllIIll(final String llllllllllllIllIIIlIIIIlIllIIlIl, final String llllllllllllIllIIIlIIIIlIllIIllI) {
        try {
            final SecretKeySpec llllllllllllIllIIIlIIIIlIllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIIIIlIllIIllI.getBytes(StandardCharsets.UTF_8)), CompleteChannelFuture.lllIIIIIIlIlll[2]), "DES");
            final Cipher llllllllllllIllIIIlIIIIlIllIlIIl = Cipher.getInstance("DES");
            llllllllllllIllIIIlIIIIlIllIlIIl.init(CompleteChannelFuture.lllIIIIIIlIlll[3], llllllllllllIllIIIlIIIIlIllIlIlI);
            return new String(llllllllllllIllIIIlIIIIlIllIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIIIIlIllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIlIIIIlIllIlIII) {
            llllllllllllIllIIIlIIIIlIllIlIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected EventExecutor executor() {
        final EventExecutor llllllllllllIllIIIlIIIIlllIIIIII = super.executor();
        if (lIIllIlllllllIlI(llllllllllllIllIIIlIIIIlllIIIIII)) {
            return this.channel().eventLoop();
        }
        return llllllllllllIllIIIlIIIIlllIIIIII;
    }
    
    @Override
    public ChannelFuture awaitUninterruptibly() {
        return this;
    }
    
    @Override
    public ChannelFuture removeListeners(final GenericFutureListener<? extends Future<? super Void>>... llllllllllllIllIIIlIIIIllIlIlIII) {
        super.removeListeners(llllllllllllIllIIIlIIIIllIlIlIII);
        "".length();
        return this;
    }
    
    @Override
    public Void getNow() {
        return null;
    }
    
    @Override
    public ChannelFuture sync() throws InterruptedException {
        return this;
    }
    
    @Override
    public ChannelFuture addListeners(final GenericFutureListener<? extends Future<? super Void>>... llllllllllllIllIIIlIIIIllIllIlII) {
        super.addListeners(llllllllllllIllIIIlIIIIllIllIlII);
        "".length();
        return this;
    }
    
    private static void lIIllIllllllIlII() {
        (lllIIIIIIlIlIl = new String[CompleteChannelFuture.lllIIIIIIlIlll[1]])[CompleteChannelFuture.lllIIIIIIlIlll[0]] = lIIllIllllllIIll("QJqNkJ62sqY=", "kKlXg");
    }
    
    @Override
    public ChannelFuture await() throws InterruptedException {
        return this;
    }
    
    @Override
    public Channel channel() {
        return this.channel;
    }
    
    @Override
    public ChannelFuture removeListener(final GenericFutureListener<? extends Future<? super Void>> llllllllllllIllIIIlIIIIllIlIlllI) {
        super.removeListener(llllllllllllIllIIIlIIIIllIlIlllI);
        "".length();
        return this;
    }
    
    @Override
    public ChannelFuture syncUninterruptibly() {
        return this;
    }
    
    private static void lIIllIlllllllIIl() {
        (lllIIIIIIlIlll = new int[4])[0] = ((92 + 22 + 10 + 3 ^ (0x49 ^ 0x2A)) & (0x31 ^ 0xC ^ (0x14 ^ 0x35) ^ -" ".length()));
        CompleteChannelFuture.lllIIIIIIlIlll[1] = " ".length();
        CompleteChannelFuture.lllIIIIIIlIlll[2] = (45 + 107 - 27 + 15 ^ 44 + 89 - 116 + 115);
        CompleteChannelFuture.lllIIIIIIlIlll[3] = "  ".length();
    }
    
    private static boolean lIIllIlllllllIlI(final Object llllllllllllIllIIIlIIIIlIllIIIII) {
        return llllllllllllIllIIIlIIIIlIllIIIII == null;
    }
    
    static {
        lIIllIlllllllIIl();
        lIIllIllllllIlII();
    }
}
