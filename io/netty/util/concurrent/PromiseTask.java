// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.concurrent;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

class PromiseTask<V> extends DefaultPromise<V> implements RunnableFuture<V>
{
    protected final /* synthetic */ Callable<V> task;
    private static final /* synthetic */ String[] lllIIIlIIIIlIl;
    private static final /* synthetic */ int[] lllIIIlIlIIlII;
    
    @Override
    public final boolean setUncancellable() {
        throw new IllegalStateException();
    }
    
    static <T> Callable<T> toCallable(final Runnable llllllllllllIllIIIIIlIlIIlIlIIlI, final T llllllllllllIllIIIIIlIlIIlIlIIIl) {
        return new RunnableAdapter<T>(llllllllllllIllIIIIIlIlIIlIlIIlI, llllllllllllIllIIIIIlIlIIlIlIIIl);
    }
    
    private static void lIIlllIlIIIllIll() {
        (lllIIIlIIIIlIl = new String[PromiseTask.lllIIIlIlIIlII[0]])[PromiseTask.lllIIIlIlIIlII[1]] = lIIlllIlIIIllIlI("cDI4FSBqZg==", "PFYfK");
    }
    
    @Override
    public final Promise<V> setSuccess(final V llllllllllllIllIIIIIlIlIIIIllIII) {
        throw new IllegalStateException();
    }
    
    PromiseTask(final EventExecutor llllllllllllIllIIIIIlIlIIlIIlIIl, final Runnable llllllllllllIllIIIIIlIlIIlIIlIII, final V llllllllllllIllIIIIIlIlIIlIIIlll) {
        this(llllllllllllIllIIIIIlIlIIlIIlIIl, toCallable(llllllllllllIllIIIIIlIlIIlIIlIII, llllllllllllIllIIIIIlIlIIlIIIlll));
    }
    
    protected final Promise<V> setFailureInternal(final Throwable llllllllllllIllIIIIIlIlIIIlIIlII) {
        super.setFailure(llllllllllllIllIIIIIlIlIIIlIIlII);
        "".length();
        return this;
    }
    
    private static void lIIlllIlIlIllIll() {
        (lllIIIlIlIIlII = new int[4])[0] = " ".length();
        PromiseTask.lllIIIlIlIIlII[1] = ((0x97 ^ 0xC2) & ~(0x13 ^ 0x46));
        PromiseTask.lllIIIlIlIIlII[2] = (0x28 ^ 0x4);
        PromiseTask.lllIIIlIlIIlII[3] = (0x7C ^ 0x55);
    }
    
    protected final boolean tryFailureInternal(final Throwable llllllllllllIllIIIIIlIlIIIIllIlI) {
        return super.tryFailure(llllllllllllIllIIIIIlIlIIIIllIlI);
    }
    
    @Override
    public final boolean equals(final Object llllllllllllIllIIIIIlIlIIIllIIll) {
        int n;
        if (lIIlllIlIlIlllII(this, llllllllllllIllIIIIIlIlIIIllIIll)) {
            n = PromiseTask.lllIIIlIlIIlII[0];
            "".length();
            if (" ".length() >= (0x81 ^ 0x85)) {
                return ((0xE6 ^ 0xC2) & ~(0x7 ^ 0x23)) != 0x0;
            }
        }
        else {
            n = PromiseTask.lllIIIlIlIIlII[1];
        }
        return n != 0;
    }
    
    private static boolean lIIlllIlIlIlllIl(final int llllllllllllIllIIIIIlIIlllIllllI) {
        return llllllllllllIllIIIIIlIIlllIllllI != 0;
    }
    
    @Override
    public final boolean trySuccess(final V llllllllllllIllIIIIIlIlIIIIlIIII) {
        return PromiseTask.lllIIIlIlIIlII[1] != 0;
    }
    
    @Override
    protected StringBuilder toStringBuilder() {
        final StringBuilder llllllllllllIllIIIIIlIlIIIIIIIlI = super.toStringBuilder();
        llllllllllllIllIIIIIlIlIIIIIIIlI.setCharAt(llllllllllllIllIIIIIlIlIIIIIIIlI.length() - PromiseTask.lllIIIlIlIIlII[0], (char)PromiseTask.lllIIIlIlIIlII[2]);
        llllllllllllIllIIIIIlIlIIIIIIIlI.append(PromiseTask.lllIIIlIIIIlIl[PromiseTask.lllIIIlIlIIlII[1]]);
        "".length();
        llllllllllllIllIIIIIlIlIIIIIIIlI.append(this.task);
        "".length();
        llllllllllllIllIIIIIlIlIIIIIIIlI.append((char)PromiseTask.lllIIIlIlIIlII[3]);
        "".length();
        return llllllllllllIllIIIIIlIlIIIIIIIlI;
    }
    
    PromiseTask(final EventExecutor llllllllllllIllIIIIIlIlIIIlllIll, final Callable<V> llllllllllllIllIIIIIlIlIIIllllIl) {
        super(llllllllllllIllIIIIIlIlIIIlllIll);
        this.task = llllllllllllIllIIIIIlIlIIIllllIl;
    }
    
    private static boolean lIIlllIlIlIlllII(final Object llllllllllllIllIIIIIlIIllllIIIIl, final Object llllllllllllIllIIIIIlIIllllIIIII) {
        return llllllllllllIllIIIIIlIIllllIIIIl == llllllllllllIllIIIIIlIIllllIIIII;
    }
    
    private static String lIIlllIlIIIllIlI(String llllllllllllIllIIIIIlIIlllllIIII, final String llllllllllllIllIIIIIlIIlllllIlII) {
        llllllllllllIllIIIIIlIIlllllIIII = new String(Base64.getDecoder().decode(llllllllllllIllIIIIIlIIlllllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIIlIIlllllIIll = new StringBuilder();
        final char[] llllllllllllIllIIIIIlIIlllllIIlI = llllllllllllIllIIIIIlIIlllllIlII.toCharArray();
        int llllllllllllIllIIIIIlIIlllllIIIl = PromiseTask.lllIIIlIlIIlII[1];
        final int llllllllllllIllIIIIIlIIllllIlIll = (Object)llllllllllllIllIIIIIlIIlllllIIII.toCharArray();
        final boolean llllllllllllIllIIIIIlIIllllIlIlI = llllllllllllIllIIIIIlIIllllIlIll.length != 0;
        long llllllllllllIllIIIIIlIIllllIlIIl = PromiseTask.lllIIIlIlIIlII[1];
        while (lIIlllIlIlIllllI((int)llllllllllllIllIIIIIlIIllllIlIIl, llllllllllllIllIIIIIlIIllllIlIlI ? 1 : 0)) {
            final char llllllllllllIllIIIIIlIIlllllIllI = llllllllllllIllIIIIIlIIllllIlIll[llllllllllllIllIIIIIlIIllllIlIIl];
            llllllllllllIllIIIIIlIIlllllIIll.append((char)(llllllllllllIllIIIIIlIIlllllIllI ^ llllllllllllIllIIIIIlIIlllllIIlI[llllllllllllIllIIIIIlIIlllllIIIl % llllllllllllIllIIIIIlIIlllllIIlI.length]));
            "".length();
            ++llllllllllllIllIIIIIlIIlllllIIIl;
            ++llllllllllllIllIIIIIlIIllllIlIIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIIlIIlllllIIll);
    }
    
    @Override
    public final int hashCode() {
        return System.identityHashCode(this);
    }
    
    @Override
    public final boolean tryFailure(final Throwable llllllllllllIllIIIIIlIlIIIlIIIII) {
        return PromiseTask.lllIIIlIlIIlII[1] != 0;
    }
    
    private static boolean lIIlllIlIlIllllI(final int llllllllllllIllIIIIIlIIllllIIlIl, final int llllllllllllIllIIIIIlIIllllIIlII) {
        return llllllllllllIllIIIIIlIIllllIIlIl < llllllllllllIllIIIIIlIIllllIIlII;
    }
    
    @Override
    public final Promise<V> setFailure(final Throwable llllllllllllIllIIIIIlIlIIIlIlIII) {
        throw new IllegalStateException();
    }
    
    protected final Promise<V> setSuccessInternal(final V llllllllllllIllIIIIIlIlIIIIlIIlI) {
        super.setSuccess(llllllllllllIllIIIIIlIlIIIIlIIlI);
        "".length();
        return this;
    }
    
    static {
        lIIlllIlIlIllIll();
        lIIlllIlIIIllIll();
    }
    
    protected final boolean setUncancellableInternal() {
        return super.setUncancellable();
    }
    
    protected final boolean trySuccessInternal(final V llllllllllllIllIIIIIlIlIIIIIllII) {
        return super.trySuccess(llllllllllllIllIIIIIlIlIIIIIllII);
    }
    
    @Override
    public void run() {
        try {
            if (lIIlllIlIlIlllIl(this.setUncancellableInternal() ? 1 : 0)) {
                final V llllllllllllIllIIIIIlIlIIIlIlllI = this.task.call();
                this.setSuccessInternal(llllllllllllIllIIIIIlIlIIIlIlllI);
                "".length();
            }
            "".length();
            if (" ".length() != " ".length()) {
                return;
            }
        }
        catch (Throwable llllllllllllIllIIIIIlIlIIIlIllIl) {
            this.setFailureInternal(llllllllllllIllIIIIIlIlIIIlIllIl);
            "".length();
        }
    }
    
    private static final class RunnableAdapter<T> implements Callable<T>
    {
        final /* synthetic */ T result;
        private static final /* synthetic */ int[] lIllllIllIlIIl;
        private static final /* synthetic */ String[] lIllllIllIlIII;
        final /* synthetic */ Runnable task;
        
        private static void lIIIIlIIllIlIIIl() {
            (lIllllIllIlIIl = new int[5])[0] = ((0x7B ^ 0x3E) & ~(0x24 ^ 0x61));
            RunnableAdapter.lIllllIllIlIIl[1] = " ".length();
            RunnableAdapter.lIllllIllIlIIl[2] = (0xD5 ^ 0xC1 ^ (0x1C ^ 0x21));
            RunnableAdapter.lIllllIllIlIIl[3] = "  ".length();
            RunnableAdapter.lIllllIllIlIIl[4] = (0xA1 ^ 0xA9);
        }
        
        static {
            lIIIIlIIllIlIIIl();
            lIIIIlIIllIlIIII();
        }
        
        private static void lIIIIlIIllIlIIII() {
            (lIllllIllIlIII = new String[RunnableAdapter.lIllllIllIlIIl[3]])[RunnableAdapter.lIllllIllIlIIl[0]] = lIIIIlIIllIIlllI("UwyHBy5mMouBz8TeXzuK1Q==", "UMTUc");
            RunnableAdapter.lIllllIllIlIII[RunnableAdapter.lIllllIllIlIIl[1]] = lIIIIlIIllIIllll("Cyr2MfK15q1a4A8SHH/S9A==", "bMWLO");
        }
        
        RunnableAdapter(final Runnable llllllllllllIllllIlIIIlIIllIIlIl, final T llllllllllllIllllIlIIIlIIllIIIIl) {
            this.task = llllllllllllIllllIlIIIlIIllIIlIl;
            this.result = llllllllllllIllllIlIIIlIIllIIIIl;
        }
        
        @Override
        public String toString() {
            return String.valueOf(new StringBuilder().append(RunnableAdapter.lIllllIllIlIII[RunnableAdapter.lIllllIllIlIIl[0]]).append(this.task).append(RunnableAdapter.lIllllIllIlIII[RunnableAdapter.lIllllIllIlIIl[1]]).append(this.result).append((char)RunnableAdapter.lIllllIllIlIIl[2]));
        }
        
        @Override
        public T call() {
            this.task.run();
            return this.result;
        }
        
        private static String lIIIIlIIllIIllll(final String llllllllllllIllllIlIIIlIIlIlIIll, final String llllllllllllIllllIlIIIlIIlIlIIlI) {
            try {
                final SecretKeySpec llllllllllllIllllIlIIIlIIlIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIIIlIIlIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllllIlIIIlIIlIlIlIl = Cipher.getInstance("Blowfish");
                llllllllllllIllllIlIIIlIIlIlIlIl.init(RunnableAdapter.lIllllIllIlIIl[3], llllllllllllIllllIlIIIlIIlIlIllI);
                return new String(llllllllllllIllllIlIIIlIIlIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIIIlIIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllIlIIIlIIlIlIlII) {
                llllllllllllIllllIlIIIlIIlIlIlII.printStackTrace();
                return null;
            }
        }
        
        private static String lIIIIlIIllIIlllI(final String llllllllllllIllllIlIIIlIIlIIIlII, final String llllllllllllIllllIlIIIlIIlIIIIll) {
            try {
                final SecretKeySpec llllllllllllIllllIlIIIlIIlIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIIIlIIlIIIIll.getBytes(StandardCharsets.UTF_8)), RunnableAdapter.lIllllIllIlIIl[4]), "DES");
                final Cipher llllllllllllIllllIlIIIlIIlIIlIII = Cipher.getInstance("DES");
                llllllllllllIllllIlIIIlIIlIIlIII.init(RunnableAdapter.lIllllIllIlIIl[3], llllllllllllIllllIlIIIlIIlIIlIIl);
                return new String(llllllllllllIllllIlIIIlIIlIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIIIlIIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllIlIIIlIIlIIIlll) {
                llllllllllllIllllIlIIIlIIlIIIlll.printStackTrace();
                return null;
            }
        }
    }
}
