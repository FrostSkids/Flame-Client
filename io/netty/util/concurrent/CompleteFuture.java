// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.concurrent;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.TimeUnit;

public abstract class CompleteFuture<V> extends AbstractFuture<V>
{
    private final /* synthetic */ EventExecutor executor;
    private static final /* synthetic */ int[] llIIIllIIllIII;
    private static final /* synthetic */ String[] llIIIllIIlIllI;
    
    private static void lIIIlIlIIlIIIllI() {
        (llIIIllIIllIII = new int[3])[0] = ((0x66 ^ 0x6E) & ~(0x24 ^ 0x2C));
        CompleteFuture.llIIIllIIllIII[1] = " ".length();
        CompleteFuture.llIIIllIIllIII[2] = "  ".length();
    }
    
    @Override
    public Future<V> addListeners(final GenericFutureListener<? extends Future<? super V>>... llllllllllllIlllIlIIlIllllIIIIlI) {
        if (lIIIlIlIIlIIIlll(llllllllllllIlllIlIIlIllllIIIIlI)) {
            throw new NullPointerException(CompleteFuture.llIIIllIIlIllI[CompleteFuture.llIIIllIIllIII[1]]);
        }
        final GenericFutureListener[] llllllllllllIlllIlIIlIllllIIIllI = llllllllllllIlllIlIIlIllllIIIIlI;
        final int llllllllllllIlllIlIIlIllllIIIlIl = llllllllllllIlllIlIIlIllllIIIllI.length;
        int llllllllllllIlllIlIIlIllllIIIlII = CompleteFuture.llIIIllIIllIII[0];
        while (lIIIlIlIIlIIlIII(llllllllllllIlllIlIIlIllllIIIlII, llllllllllllIlllIlIIlIllllIIIlIl)) {
            final GenericFutureListener<? extends Future<? super V>> llllllllllllIlllIlIIlIllllIIIlll = (GenericFutureListener<? extends Future<? super V>>)llllllllllllIlllIlIIlIllllIIIllI[llllllllllllIlllIlIIlIllllIIIlII];
            if (lIIIlIlIIlIIIlll(llllllllllllIlllIlIIlIllllIIIlll)) {
                "".length();
                if ((7 + 148 - 103 + 140 ^ 18 + 172 - 84 + 90) <= "   ".length()) {
                    return null;
                }
                break;
            }
            else {
                DefaultPromise.notifyListener(this.executor(), this, llllllllllllIlllIlIIlIllllIIIlll);
                ++llllllllllllIlllIlIIlIllllIIIlII;
                "".length();
                if (" ".length() == 0) {
                    return null;
                }
                continue;
            }
        }
        return this;
    }
    
    @Override
    public Future<V> removeListener(final GenericFutureListener<? extends Future<? super V>> llllllllllllIlllIlIIlIlllIlllIIl) {
        return this;
    }
    
    private static boolean lIIIlIlIIlIIIlll(final Object llllllllllllIlllIlIIlIllIlIIIIIl) {
        return llllllllllllIlllIlIIlIllIlIIIIIl == null;
    }
    
    private static void lIIIlIlIIlIIIlIl() {
        (llIIIllIIlIllI = new String[CompleteFuture.llIIIllIIllIII[2]])[CompleteFuture.llIIIllIIllIII[0]] = lIIIlIlIIlIIIIll("DY6t8yzgX0IUi6M2w4QRlw==", "qJQmf");
        CompleteFuture.llIIIllIIlIllI[CompleteFuture.llIIIllIIllIII[1]] = lIIIlIlIIlIIIlII("NRA9NzU3HDww", "YyNCP");
    }
    
    @Override
    public Future<V> syncUninterruptibly() {
        return this;
    }
    
    @Override
    public boolean awaitUninterruptibly(final long llllllllllllIlllIlIIlIlllIIlIllI) {
        return CompleteFuture.llIIIllIIllIII[1] != 0;
    }
    
    @Override
    public boolean await(final long llllllllllllIlllIlIIlIlllIlIllll, final TimeUnit llllllllllllIlllIlIIlIlllIlIlllI) throws InterruptedException {
        if (lIIIlIlIIlIIlIlI(Thread.interrupted() ? 1 : 0)) {
            throw new InterruptedException();
        }
        return CompleteFuture.llIIIllIIllIII[1] != 0;
    }
    
    static {
        lIIIlIlIIlIIIllI();
        lIIIlIlIIlIIIlIl();
    }
    
    private static boolean lIIIlIlIIlIIlIII(final int llllllllllllIlllIlIIlIllIlIIIlII, final int llllllllllllIlllIlIIlIllIlIIIIll) {
        return llllllllllllIlllIlIIlIllIlIIIlII < llllllllllllIlllIlIIlIllIlIIIIll;
    }
    
    @Override
    public Future<V> awaitUninterruptibly() {
        return this;
    }
    
    private static String lIIIlIlIIlIIIIll(final String llllllllllllIlllIlIIlIllIllllIll, final String llllllllllllIlllIlIIlIllIlllIllI) {
        try {
            final SecretKeySpec llllllllllllIlllIlIIlIlllIIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIlIllIlllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlIIlIllIlllllll = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlIIlIllIlllllll.init(CompleteFuture.llIIIllIIllIII[2], llllllllllllIlllIlIIlIlllIIIIIIl);
            return new String(llllllllllllIlllIlIIlIllIlllllll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIlIllIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIIlIllIlllllIl) {
            llllllllllllIlllIlIIlIllIlllllIl.printStackTrace();
            return null;
        }
    }
    
    protected CompleteFuture(final EventExecutor llllllllllllIlllIlIIlIllllIllIIl) {
        this.executor = llllllllllllIlllIlIIlIllllIllIIl;
    }
    
    @Override
    public boolean isCancelled() {
        return CompleteFuture.llIIIllIIllIII[0] != 0;
    }
    
    @Override
    public Future<V> sync() throws InterruptedException {
        return this;
    }
    
    @Override
    public boolean isDone() {
        return CompleteFuture.llIIIllIIllIII[1] != 0;
    }
    
    @Override
    public boolean cancel(final boolean llllllllllllIlllIlIIlIlllIIIllll) {
        return CompleteFuture.llIIIllIIllIII[0] != 0;
    }
    
    protected EventExecutor executor() {
        return this.executor;
    }
    
    @Override
    public boolean isCancellable() {
        return CompleteFuture.llIIIllIIllIII[0] != 0;
    }
    
    @Override
    public Future<V> await() throws InterruptedException {
        if (lIIIlIlIIlIIlIlI(Thread.interrupted() ? 1 : 0)) {
            throw new InterruptedException();
        }
        return this;
    }
    
    private static String lIIIlIlIIlIIIlII(String llllllllllllIlllIlIIlIllIlIlIlll, final String llllllllllllIlllIlIIlIllIlIllllI) {
        llllllllllllIlllIlIIlIllIlIlIlll = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIlIIlIllIlIlIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlIIlIllIlIlllII = new StringBuilder();
        final char[] llllllllllllIlllIlIIlIllIlIllIlI = llllllllllllIlllIlIIlIllIlIllllI.toCharArray();
        int llllllllllllIlllIlIIlIllIlIllIII = CompleteFuture.llIIIllIIllIII[0];
        final int llllllllllllIlllIlIIlIllIlIIlllI = (Object)((String)llllllllllllIlllIlIIlIllIlIlIlll).toCharArray();
        final Exception llllllllllllIlllIlIIlIllIlIIllIl = (Exception)llllllllllllIlllIlIIlIllIlIIlllI.length;
        Exception llllllllllllIlllIlIIlIllIlIIlIll = (Exception)CompleteFuture.llIIIllIIllIII[0];
        while (lIIIlIlIIlIIlIII((int)llllllllllllIlllIlIIlIllIlIIlIll, (int)llllllllllllIlllIlIIlIllIlIIllIl)) {
            final char llllllllllllIlllIlIIlIllIllIIIlI = llllllllllllIlllIlIIlIllIlIIlllI[llllllllllllIlllIlIIlIllIlIIlIll];
            llllllllllllIlllIlIIlIllIlIlllII.append((char)(llllllllllllIlllIlIIlIllIllIIIlI ^ llllllllllllIlllIlIIlIllIlIllIlI[llllllllllllIlllIlIIlIllIlIllIII % llllllllllllIlllIlIIlIllIlIllIlI.length]));
            "".length();
            ++llllllllllllIlllIlIIlIllIlIllIII;
            ++llllllllllllIlllIlIIlIllIlIIlIll;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlIIlIllIlIlllII);
    }
    
    private static boolean lIIIlIlIIlIIlIlI(final int llllllllllllIlllIlIIlIllIIllllll) {
        return llllllllllllIlllIlIIlIllIIllllll != 0;
    }
    
    @Override
    public boolean awaitUninterruptibly(final long llllllllllllIlllIlIIlIlllIIlllII, final TimeUnit llllllllllllIlllIlIIlIlllIIllIlI) {
        return CompleteFuture.llIIIllIIllIII[1] != 0;
    }
    
    @Override
    public Future<V> addListener(final GenericFutureListener<? extends Future<? super V>> llllllllllllIlllIlIIlIllllIIlllI) {
        if (lIIIlIlIIlIIIlll(llllllllllllIlllIlIIlIllllIIlllI)) {
            throw new NullPointerException(CompleteFuture.llIIIllIIlIllI[CompleteFuture.llIIIllIIllIII[0]]);
        }
        DefaultPromise.notifyListener(this.executor(), this, llllllllllllIlllIlIIlIllllIIlllI);
        return this;
    }
    
    @Override
    public Future<V> removeListeners(final GenericFutureListener<? extends Future<? super V>>... llllllllllllIlllIlIIlIlllIllIlIl) {
        return this;
    }
    
    @Override
    public boolean await(final long llllllllllllIlllIlIIlIlllIlIIlIl) throws InterruptedException {
        if (lIIIlIlIIlIIlIlI(Thread.interrupted() ? 1 : 0)) {
            throw new InterruptedException();
        }
        return CompleteFuture.llIIIllIIllIII[1] != 0;
    }
}
