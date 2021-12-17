// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.concurrent;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class DefaultProgressivePromise<V> extends DefaultPromise<V> implements ProgressivePromise<V>
{
    private static final /* synthetic */ int[] llIIIIIlllIIll;
    private static final /* synthetic */ String[] llIIIIIlllIIII;
    
    @Override
    public ProgressivePromise<V> syncUninterruptibly() {
        super.syncUninterruptibly();
        "".length();
        return this;
    }
    
    private static String lIIIIlllIllIlIll(final String llllllllllllIlllIlllIlIlllIllIll, final String llllllllllllIlllIlllIlIlllIllIlI) {
        try {
            final SecretKeySpec llllllllllllIlllIlllIlIlllIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlllIlIlllIllIlI.getBytes(StandardCharsets.UTF_8)), DefaultProgressivePromise.llIIIIIlllIIll[7]), "DES");
            final Cipher llllllllllllIlllIlllIlIlllIlllIl = Cipher.getInstance("DES");
            llllllllllllIlllIlllIlIlllIlllIl.init(DefaultProgressivePromise.llIIIIIlllIIll[2], llllllllllllIlllIlllIlIlllIllllI);
            return new String(llllllllllllIlllIlllIlIlllIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlllIlIlllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlllIlIlllIlllII) {
            llllllllllllIlllIlllIlIlllIlllII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ProgressivePromise<V> addListeners(final GenericFutureListener<? extends Future<? super V>>... llllllllllllIlllIlllIllIlIIIlllI) {
        super.addListeners(llllllllllllIlllIlllIllIlIIIlllI);
        "".length();
        return this;
    }
    
    @Override
    public ProgressivePromise<V> setProgress(final long llllllllllllIlllIlllIllIlIlIIIlI, long llllllllllllIlllIlllIllIlIlIIIIl) {
        if (lIIIIlllIlllIlII(lIIIIlllIlllIIll(llllllllllllIlllIlllIllIlIlIIIIl, 0L))) {
            llllllllllllIlllIlllIllIlIlIIIIl = -1L;
            if (lIIIIlllIlllIlII(lIIIIlllIlllIIll(llllllllllllIlllIlllIllIlIlIIIlI, 0L))) {
                throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(DefaultProgressivePromise.llIIIIIlllIIII[DefaultProgressivePromise.llIIIIIlllIIll[0]]).append(llllllllllllIlllIlllIllIlIlIIIlI).append(DefaultProgressivePromise.llIIIIIlllIIII[DefaultProgressivePromise.llIIIIIlllIIll[1]])));
            }
        }
        else if (!lIIIIlllIlllIlIl(lIIIIlllIlllIIll(llllllllllllIlllIlllIllIlIlIIIlI, 0L)) || lIIIIlllIlllIllI(lIIIIlllIlllIIll(llllllllllllIlllIlllIllIlIlIIIlI, llllllllllllIlllIlllIllIlIlIIIIl))) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(DefaultProgressivePromise.llIIIIIlllIIII[DefaultProgressivePromise.llIIIIIlllIIll[2]]).append(llllllllllllIlllIlllIllIlIlIIIlI).append(DefaultProgressivePromise.llIIIIIlllIIII[DefaultProgressivePromise.llIIIIIlllIIll[3]]).append(llllllllllllIlllIlllIllIlIlIIIIl).append(DefaultProgressivePromise.llIIIIIlllIIII[DefaultProgressivePromise.llIIIIIlllIIll[4]])));
        }
        if (lIIIIlllIlllIlll(this.isDone() ? 1 : 0)) {
            throw new IllegalStateException(DefaultProgressivePromise.llIIIIIlllIIII[DefaultProgressivePromise.llIIIIIlllIIll[5]]);
        }
        this.notifyProgressiveListeners(llllllllllllIlllIlllIllIlIlIIIlI, llllllllllllIlllIlllIllIlIlIIIIl);
        return this;
    }
    
    private static int lIIIIlllIlllIIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static void lIIIIlllIlllIIlI() {
        (llIIIIIlllIIll = new int[8])[0] = ((107 + 52 + 23 + 30 ^ 90 + 72 - 157 + 133) & (0xB0 ^ 0xC6 ^ (0x66 ^ 0x4E) ^ -" ".length()));
        DefaultProgressivePromise.llIIIIIlllIIll[1] = " ".length();
        DefaultProgressivePromise.llIIIIIlllIIll[2] = "  ".length();
        DefaultProgressivePromise.llIIIIIlllIIll[3] = "   ".length();
        DefaultProgressivePromise.llIIIIIlllIIll[4] = (0x78 ^ 0x7C);
        DefaultProgressivePromise.llIIIIIlllIIll[5] = (0x88 ^ 0xC7 ^ (0x2B ^ 0x61));
        DefaultProgressivePromise.llIIIIIlllIIll[6] = (0xA0 ^ 0xA6);
        DefaultProgressivePromise.llIIIIIlllIIll[7] = (0x3E ^ 0x36);
    }
    
    private static void lIIIIlllIllIllII() {
        (llIIIIIlllIIII = new String[DefaultProgressivePromise.llIIIIIlllIIll[6]])[DefaultProgressivePromise.llIIIIIlllIIll[0]] = lIIIIlllIllIlIIl("CiE9BDAfICFZYg==", "zSRcB");
        DefaultProgressivePromise.llIIIIIlllIIII[DefaultProgressivePromise.llIIIIIlllIIll[1]] = lIIIIlllIllIlIIl("c2UMMSo2Lh0sPmltV3R6Y2Q=", "SMiIZ");
        DefaultProgressivePromise.llIIIIIlllIIII[DefaultProgressivePromise.llIIIIIlllIIll[2]] = lIIIIlllIllIlIIl("NDM/CgEhMiNXUw==", "DAPms");
        DefaultProgressivePromise.llIIIIIlllIIII[DefaultProgressivePromise.llIIIIIlllIIll[3]] = lIIIIlllIllIlIlI("GPfvTi1LiCyhttJN/ZwxasZ1x+cFbDc3Fq+JhfsBqkq+XsaVqTxHMg==", "Zxzeu");
        DefaultProgressivePromise.llIIIIIlllIIII[DefaultProgressivePromise.llIIIIIlllIIll[4]] = lIIIIlllIllIlIll("UefeMyZQzG4=", "mqWjh");
        DefaultProgressivePromise.llIIIIIlllIIII[DefaultProgressivePromise.llIIIIIlllIIll[5]] = lIIIIlllIllIlIlI("yerJsNHorGOq1dlEFzFXBduu3+zkAXhk", "ymivT");
    }
    
    private static boolean lIIIIlllIlllIlll(final int llllllllllllIlllIlllIlIllIlllIII) {
        return llllllllllllIlllIlllIlIllIlllIII != 0;
    }
    
    private static String lIIIIlllIllIlIIl(String llllllllllllIlllIlllIlIlllIIIllI, final String llllllllllllIlllIlllIlIlllIIIlIl) {
        llllllllllllIlllIlllIlIlllIIIllI = new String(Base64.getDecoder().decode(llllllllllllIlllIlllIlIlllIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlllIlIlllIIlIIl = new StringBuilder();
        final char[] llllllllllllIlllIlllIlIlllIIlIII = llllllllllllIlllIlllIlIlllIIIlIl.toCharArray();
        int llllllllllllIlllIlllIlIlllIIIlll = DefaultProgressivePromise.llIIIIIlllIIll[0];
        final int llllllllllllIlllIlllIlIlllIIIIIl = (Object)llllllllllllIlllIlllIlIlllIIIllI.toCharArray();
        final byte llllllllllllIlllIlllIlIlllIIIIII = (byte)llllllllllllIlllIlllIlIlllIIIIIl.length;
        int llllllllllllIlllIlllIlIllIllllll = DefaultProgressivePromise.llIIIIIlllIIll[0];
        while (lIIIIlllIllllIlI(llllllllllllIlllIlllIlIllIllllll, llllllllllllIlllIlllIlIlllIIIIII)) {
            final char llllllllllllIlllIlllIlIlllIIllII = llllllllllllIlllIlllIlIlllIIIIIl[llllllllllllIlllIlllIlIllIllllll];
            llllllllllllIlllIlllIlIlllIIlIIl.append((char)(llllllllllllIlllIlllIlIlllIIllII ^ llllllllllllIlllIlllIlIlllIIlIII[llllllllllllIlllIlllIlIlllIIIlll % llllllllllllIlllIlllIlIlllIIlIII.length]));
            "".length();
            ++llllllllllllIlllIlllIlIlllIIIlll;
            ++llllllllllllIlllIlllIlIllIllllll;
            "".length();
            if (-(0x0 ^ 0x4) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlllIlIlllIIlIIl);
    }
    
    @Override
    public ProgressivePromise<V> sync() throws InterruptedException {
        super.sync();
        "".length();
        return this;
    }
    
    @Override
    public ProgressivePromise<V> setFailure(final Throwable llllllllllllIlllIlllIllIIllIlIII) {
        super.setFailure(llllllllllllIlllIlllIllIIllIlIII);
        "".length();
        return this;
    }
    
    private static boolean lIIIIlllIlllIlII(final int llllllllllllIlllIlllIlIllIllIlII) {
        return llllllllllllIlllIlllIlIllIllIlII < 0;
    }
    
    protected DefaultProgressivePromise() {
    }
    
    @Override
    public ProgressivePromise<V> awaitUninterruptibly() {
        super.awaitUninterruptibly();
        "".length();
        return this;
    }
    
    @Override
    public ProgressivePromise<V> addListener(final GenericFutureListener<? extends Future<? super V>> llllllllllllIlllIlllIllIlIIlIIlI) {
        super.addListener(llllllllllllIlllIlllIllIlIIlIIlI);
        "".length();
        return this;
    }
    
    @Override
    public ProgressivePromise<V> removeListener(final GenericFutureListener<? extends Future<? super V>> llllllllllllIlllIlllIllIlIIIIllI) {
        super.removeListener(llllllllllllIlllIlllIllIlIIIIllI);
        "".length();
        return this;
    }
    
    @Override
    public ProgressivePromise<V> removeListeners(final GenericFutureListener<? extends Future<? super V>>... llllllllllllIlllIlllIllIlIIIIIlI) {
        super.removeListeners(llllllllllllIlllIlllIllIlIIIIIlI);
        "".length();
        return this;
    }
    
    @Override
    public ProgressivePromise<V> setSuccess(final V llllllllllllIlllIlllIllIIllIlllI) {
        super.setSuccess(llllllllllllIlllIlllIllIIllIlllI);
        "".length();
        return this;
    }
    
    public DefaultProgressivePromise(final EventExecutor llllllllllllIlllIlllIllIlIlIllll) {
        super(llllllllllllIlllIlllIllIlIlIllll);
    }
    
    private static int lIIIIlllIllllIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static String lIIIIlllIllIlIlI(final String llllllllllllIlllIlllIlIllllIIllI, final String llllllllllllIlllIlllIlIllllIIlIl) {
        try {
            final SecretKeySpec llllllllllllIlllIlllIlIllllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlllIlIllllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlllIlIllllIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlllIlIllllIlIlI.init(DefaultProgressivePromise.llIIIIIlllIIll[2], llllllllllllIlllIlllIlIllllIlIll);
            return new String(llllllllllllIlllIlllIlIllllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlllIlIllllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlllIlIllllIlIIl) {
            llllllllllllIlllIlllIlIllllIlIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIlllIllllIIl(final int llllllllllllIlllIlllIlIllIllIIlI) {
        return llllllllllllIlllIlllIlIllIllIIlI <= 0;
    }
    
    private static boolean lIIIIlllIllllIlI(final int llllllllllllIlllIlllIlIllIlllIll, final int llllllllllllIlllIlllIlIllIlllIlI) {
        return llllllllllllIlllIlllIlIllIlllIll < llllllllllllIlllIlllIlIllIlllIlI;
    }
    
    private static boolean lIIIIlllIlllIlIl(final int llllllllllllIlllIlllIlIllIllIllI) {
        return llllllllllllIlllIlllIlIllIllIllI >= 0;
    }
    
    @Override
    public ProgressivePromise<V> await() throws InterruptedException {
        super.await();
        "".length();
        return this;
    }
    
    private static boolean lIIIIlllIlllIllI(final int llllllllllllIlllIlllIlIllIllIIII) {
        return llllllllllllIlllIlllIlIllIllIIII > 0;
    }
    
    static {
        lIIIIlllIlllIIlI();
        lIIIIlllIllIllII();
    }
    
    @Override
    public boolean tryProgress(final long llllllllllllIlllIlllIllIlIIlllII, long llllllllllllIlllIlllIllIlIIllIII) {
        if (lIIIIlllIlllIlII(lIIIIlllIllllIII(llllllllllllIlllIlllIllIlIIllIII, 0L))) {
            llllllllllllIlllIlllIllIlIIllIII = -1L;
            if (!lIIIIlllIlllIlIl(lIIIIlllIllllIII(llllllllllllIlllIlllIllIlIIlllII, 0L)) || lIIIIlllIlllIlll(this.isDone() ? 1 : 0)) {
                return DefaultProgressivePromise.llIIIIIlllIIll[0] != 0;
            }
        }
        else if (!lIIIIlllIlllIlIl(lIIIIlllIllllIII(llllllllllllIlllIlllIllIlIIlllII, 0L)) || !lIIIIlllIllllIIl(lIIIIlllIllllIII(llllllllllllIlllIlllIllIlIIlllII, llllllllllllIlllIlllIllIlIIllIII)) || lIIIIlllIlllIlll(this.isDone() ? 1 : 0)) {
            return DefaultProgressivePromise.llIIIIIlllIIll[0] != 0;
        }
        this.notifyProgressiveListeners(llllllllllllIlllIlllIllIlIIlllII, llllllllllllIlllIlllIllIlIIllIII);
        return DefaultProgressivePromise.llIIIIIlllIIll[1] != 0;
    }
}
