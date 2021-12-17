// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal.chmv8;

import java.security.PrivilegedActionException;
import java.security.AccessController;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import sun.misc.Unsafe;

public abstract class CountedCompleter<T> extends ForkJoinTask<T>
{
    private static final /* synthetic */ long PENDING;
    final /* synthetic */ CountedCompleter<?> completer;
    private static final /* synthetic */ int[] lIIlIIllIIlIII;
    volatile /* synthetic */ int pending;
    private static final /* synthetic */ Unsafe U;
    private static final /* synthetic */ String[] lIIlIIllIIIlIl;
    
    public final void setPendingCount(final int lllllllllllllIIllIllIlIlllIIllII) {
        this.pending = lllllllllllllIIllIllIlIlllIIllII;
    }
    
    protected CountedCompleter(final CountedCompleter<?> lllllllllllllIIllIllIlIllllIIIII) {
        this.completer = lllllllllllllIIllIllIlIllllIIIII;
    }
    
    private static boolean llIIllIllllIlII(final Object lllllllllllllIIllIllIlIlIlIIIlll) {
        return lllllllllllllIIllIllIlIlIlIIIlll == null;
    }
    
    @Override
    protected final boolean exec() {
        this.compute();
        return CountedCompleter.lIIlIIllIIlIII[1] != 0;
    }
    
    public final CountedCompleter<?> getCompleter() {
        return this.completer;
    }
    
    private static boolean llIIllIllllIIlI(final Object lllllllllllllIIllIllIlIlIlIIlIIl) {
        return lllllllllllllIIllIllIlIlIlIIlIIl != null;
    }
    
    public final void tryComplete() {
        CountedCompleter<?> lllllllllllllIIllIllIlIllIlIIIll;
        CountedCompleter<?> lllllllllllllIIllIllIlIllIlIIlII = lllllllllllllIIllIllIlIllIlIIIll = this;
        while (true) {
            final int lllllllllllllIIllIllIlIllIlIIllI;
            if (llIIllIllllIIll(lllllllllllllIIllIllIlIllIlIIllI = lllllllllllllIIllIllIlIllIlIIlII.pending)) {
                lllllllllllllIIllIllIlIllIlIIlII.onCompletion(lllllllllllllIIllIllIlIllIlIIIll);
                if (llIIllIllllIlII(lllllllllllllIIllIllIlIllIlIIlII = (lllllllllllllIIllIllIlIllIlIIIll = lllllllllllllIIllIllIlIllIlIIlII).completer)) {
                    lllllllllllllIIllIllIlIllIlIIIll.quietlyComplete();
                    return;
                }
                continue;
            }
            else {
                if (llIIllIllllIIIl(CountedCompleter.U.compareAndSwapInt(lllllllllllllIIllIllIlIllIlIIlII, CountedCompleter.PENDING, lllllllllllllIIllIllIlIllIlIIllI, lllllllllllllIIllIllIlIllIlIIllI - CountedCompleter.lIIlIIllIIlIII[0]) ? 1 : 0)) {
                    return;
                }
                continue;
            }
        }
    }
    
    public final boolean compareAndSetPendingCount(final int lllllllllllllIIllIllIlIllIlllIll, final int lllllllllllllIIllIllIlIllIlllIlI) {
        return CountedCompleter.U.compareAndSwapInt(this, CountedCompleter.PENDING, lllllllllllllIIllIllIlIllIlllIll, lllllllllllllIIllIllIlIllIlllIlI);
    }
    
    public abstract void compute();
    
    private static boolean llIIllIllllIIIl(final int lllllllllllllIIllIllIlIlIlIIIlIl) {
        return lllllllllllllIIllIllIlIlIlIIIlIl != 0;
    }
    
    private static boolean llIIllIllllIIll(final int lllllllllllllIIllIllIlIlIlIIIIll) {
        return lllllllllllllIIllIllIlIlIlIIIIll == 0;
    }
    
    public final int decrementPendingCountUnlessZero() {
        int lllllllllllllIIllIllIlIllIllIllI;
        while (llIIllIllllIIIl(lllllllllllllIIllIllIlIllIllIllI = this.pending) && !llIIllIllllIIIl(CountedCompleter.U.compareAndSwapInt(this, CountedCompleter.PENDING, lllllllllllllIIllIllIlIllIllIllI, lllllllllllllIIllIllIlIllIllIllI - CountedCompleter.lIIlIIllIIlIII[0]) ? 1 : 0)) {}
        return lllllllllllllIIllIllIlIllIllIllI;
    }
    
    private static boolean llIIllIllllIlIl(final int lllllllllllllIIllIllIlIlIlIIIIIl) {
        return lllllllllllllIIllIllIlIlIlIIIIIl >= 0;
    }
    
    private static void llIIllIllllIIII() {
        (lIIlIIllIIlIII = new int[3])[0] = " ".length();
        CountedCompleter.lIIlIIllIIlIII[1] = ((0x10 ^ 0x55) & ~(0xCB ^ 0x8E));
        CountedCompleter.lIIlIIllIIlIII[2] = "  ".length();
    }
    
    private static String llIIllIlllIlIlI(final String lllllllllllllIIllIllIlIlIlIlIlII, final String lllllllllllllIIllIllIlIlIlIlIIll) {
        try {
            final SecretKeySpec lllllllllllllIIllIllIlIlIlIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIllIlIlIlIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIllIlIlIlIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIllIlIlIlIlIllI.init(CountedCompleter.lIIlIIllIIlIII[2], lllllllllllllIIllIllIlIlIlIlIlll);
            return new String(lllllllllllllIIllIllIlIlIlIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIllIlIlIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIllIlIlIlIlIlIl) {
            lllllllllllllIIllIllIlIlIlIlIlIl.printStackTrace();
            return null;
        }
    }
    
    private static Unsafe getUnsafe() {
        try {
            return Unsafe.getUnsafe();
        }
        catch (SecurityException lllllllllllllIIllIllIlIlIllIIIIl) {
            try {
                return AccessController.doPrivileged((PrivilegedExceptionAction<Unsafe>)new PrivilegedExceptionAction<Unsafe>() {
                    private static final /* synthetic */ String[] lIIIIIllIIlllI;
                    private static final /* synthetic */ int[] lIIIIlIIIIIIll;
                    
                    private static void lIllIllllllIlIl() {
                        (lIIIIlIIIIIIll = new int[2])[0] = ((0x86 ^ 0xA7) & ~(0x95 ^ 0xB4));
                        CountedCompleter$1.lIIIIlIIIIIIll[1] = " ".length();
                    }
                    
                    static {
                        lIllIllllllIlIl();
                        lIllIlllIIIlIII();
                    }
                    
                    private static void lIllIlllIIIlIII() {
                        (lIIIIIllIIlllI = new String[CountedCompleter$1.lIIIIlIIIIIIll[1]])[CountedCompleter$1.lIIIIlIIIIIIll[0]] = lIllIlllIIIIlll("EBIIVRcKCQwTJw==", "dzmuB");
                    }
                    
                    private static boolean lIllIllllllIlll(final int lllllllllllllIlIIllIlIIllIIlIlIl) {
                        return lllllllllllllIlIIllIlIIllIIlIlIl != 0;
                    }
                    
                    @Override
                    public Unsafe run() throws Exception {
                        final Class<Unsafe> lllllllllllllIlIIllIlIIllIllllII = Unsafe.class;
                        final Field[] lllllllllllllIlIIllIlIIlllIIIIII = lllllllllllllIlIIllIlIIllIllllII.getDeclaredFields();
                        final int lllllllllllllIlIIllIlIIllIllllll = lllllllllllllIlIIllIlIIlllIIIIII.length;
                        int lllllllllllllIlIIllIlIIllIlllllI = CountedCompleter$1.lIIIIlIIIIIIll[0];
                        while (lIllIllllllIllI(lllllllllllllIlIIllIlIIllIlllllI, lllllllllllllIlIIllIlIIllIllllll)) {
                            final Field lllllllllllllIlIIllIlIIlllIIIIIl = lllllllllllllIlIIllIlIIlllIIIIII[lllllllllllllIlIIllIlIIllIlllllI];
                            lllllllllllllIlIIllIlIIlllIIIIIl.setAccessible((boolean)(CountedCompleter$1.lIIIIlIIIIIIll[1] != 0));
                            final Object lllllllllllllIlIIllIlIIlllIIIIlI = lllllllllllllIlIIllIlIIlllIIIIIl.get(null);
                            if (lIllIllllllIlll(lllllllllllllIlIIllIlIIllIllllII.isInstance(lllllllllllllIlIIllIlIIlllIIIIlI) ? 1 : 0)) {
                                return lllllllllllllIlIIllIlIIllIllllII.cast(lllllllllllllIlIIllIlIIlllIIIIlI);
                            }
                            ++lllllllllllllIlIIllIlIIllIlllllI;
                            "".length();
                            if (null != null) {
                                return null;
                            }
                        }
                        throw new NoSuchFieldError(CountedCompleter$1.lIIIIIllIIlllI[CountedCompleter$1.lIIIIlIIIIIIll[0]]);
                    }
                    
                    private static boolean lIllIllllllIllI(final int lllllllllllllIlIIllIlIIllIIllIII, final int lllllllllllllIlIIllIlIIllIIlIlll) {
                        return lllllllllllllIlIIllIlIIllIIllIII < lllllllllllllIlIIllIlIIllIIlIlll;
                    }
                    
                    private static String lIllIlllIIIIlll(String lllllllllllllIlIIllIlIIllIlIlIII, final String lllllllllllllIlIIllIlIIllIlIIIlI) {
                        lllllllllllllIlIIllIlIIllIlIlIII = new String(Base64.getDecoder().decode(lllllllllllllIlIIllIlIIllIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                        final StringBuilder lllllllllllllIlIIllIlIIllIlIIllI = new StringBuilder();
                        final char[] lllllllllllllIlIIllIlIIllIlIIlIl = lllllllllllllIlIIllIlIIllIlIIIlI.toCharArray();
                        int lllllllllllllIlIIllIlIIllIlIIlII = CountedCompleter$1.lIIIIlIIIIIIll[0];
                        final short lllllllllllllIlIIllIlIIllIIllllI = (Object)lllllllllllllIlIIllIlIIllIlIlIII.toCharArray();
                        final int lllllllllllllIlIIllIlIIllIIlllIl = lllllllllllllIlIIllIlIIllIIllllI.length;
                        String lllllllllllllIlIIllIlIIllIIlllII = (String)CountedCompleter$1.lIIIIlIIIIIIll[0];
                        while (lIllIllllllIllI((int)lllllllllllllIlIIllIlIIllIIlllII, lllllllllllllIlIIllIlIIllIIlllIl)) {
                            final char lllllllllllllIlIIllIlIIllIlIlIIl = lllllllllllllIlIIllIlIIllIIllllI[lllllllllllllIlIIllIlIIllIIlllII];
                            lllllllllllllIlIIllIlIIllIlIIllI.append((char)(lllllllllllllIlIIllIlIIllIlIlIIl ^ lllllllllllllIlIIllIlIIllIlIIlIl[lllllllllllllIlIIllIlIIllIlIIlII % lllllllllllllIlIIllIlIIllIlIIlIl.length]));
                            "".length();
                            ++lllllllllllllIlIIllIlIIllIlIIlII;
                            ++lllllllllllllIlIIllIlIIllIIlllII;
                            "".length();
                            if (null != null) {
                                return null;
                            }
                        }
                        return String.valueOf(lllllllllllllIlIIllIlIIllIlIIllI);
                    }
                });
            }
            catch (PrivilegedActionException lllllllllllllIIllIllIlIlIllIIIII) {
                throw new RuntimeException(CountedCompleter.lIIlIIllIIIlIl[CountedCompleter.lIIlIIllIIlIII[1]], lllllllllllllIIllIllIlIlIllIIIII.getCause());
            }
        }
    }
    
    protected CountedCompleter(final CountedCompleter<?> lllllllllllllIIllIllIlIllllIlIlI, final int lllllllllllllIIllIllIlIllllIIllI) {
        this.completer = lllllllllllllIIllIllIlIllllIlIlI;
        this.pending = lllllllllllllIIllIllIlIllllIIllI;
    }
    
    public final CountedCompleter<?> firstComplete() {
        int lllllllllllllIIllIllIlIllIIIIlll;
        while (!llIIllIllllIIll(lllllllllllllIIllIllIlIllIIIIlll = this.pending)) {
            if (llIIllIllllIIIl(CountedCompleter.U.compareAndSwapInt(this, CountedCompleter.PENDING, lllllllllllllIIllIllIlIllIIIIlll, lllllllllllllIIllIllIlIllIIIIlll - CountedCompleter.lIIlIIllIIlIII[0]) ? 1 : 0)) {
                return null;
            }
        }
        return this;
    }
    
    public final void quietlyCompleteRoot() {
        CountedCompleter<?> lllllllllllllIIllIllIlIlIllllIlI = this;
        CountedCompleter<?> lllllllllllllIIllIllIlIlIllllIIl;
        while (!llIIllIllllIlII(lllllllllllllIIllIllIlIlIllllIIl = lllllllllllllIIllIllIlIlIllllIlI.completer)) {
            lllllllllllllIIllIllIlIlIllllIlI = lllllllllllllIIllIllIlIlIllllIIl;
            "".length();
            if (-" ".length() == "  ".length()) {
                return;
            }
        }
        lllllllllllllIIllIllIlIlIllllIlI.quietlyComplete();
    }
    
    public final CountedCompleter<?> nextComplete() {
        final CountedCompleter<?> lllllllllllllIIllIllIlIllIIIIIII;
        if (llIIllIllllIIlI(lllllllllllllIIllIllIlIllIIIIIII = this.completer)) {
            return lllllllllllllIIllIllIlIllIIIIIII.firstComplete();
        }
        this.quietlyComplete();
        return null;
    }
    
    @Override
    public void complete(final T lllllllllllllIIllIllIlIllIIIlIll) {
        this.setRawResult(lllllllllllllIIllIllIlIllIIIlIll);
        this.onCompletion(this);
        this.quietlyComplete();
        final CountedCompleter<?> lllllllllllllIIllIllIlIllIIIllIl;
        if (llIIllIllllIIlI(lllllllllllllIIllIllIlIllIIIllIl = this.completer)) {
            lllllllllllllIIllIllIlIllIIIllIl.tryComplete();
        }
    }
    
    public final void propagateCompletion() {
        CountedCompleter<?> lllllllllllllIIllIllIlIllIIlIlll;
        CountedCompleter<?> lllllllllllllIIllIllIlIllIIllIII = lllllllllllllIIllIllIlIllIIlIlll = this;
        while (true) {
            final int lllllllllllllIIllIllIlIllIIllIlI;
            if (llIIllIllllIIll(lllllllllllllIIllIllIlIllIIllIlI = lllllllllllllIIllIllIlIllIIllIII.pending)) {
                if (llIIllIllllIlII(lllllllllllllIIllIllIlIllIIllIII = (lllllllllllllIIllIllIlIllIIlIlll = lllllllllllllIIllIllIlIllIIllIII).completer)) {
                    lllllllllllllIIllIllIlIllIIlIlll.quietlyComplete();
                    return;
                }
                continue;
            }
            else {
                if (llIIllIllllIIIl(CountedCompleter.U.compareAndSwapInt(lllllllllllllIIllIllIlIllIIllIII, CountedCompleter.PENDING, lllllllllllllIIllIllIlIllIIllIlI, lllllllllllllIIllIllIlIllIIllIlI - CountedCompleter.lIIlIIllIIlIII[0]) ? 1 : 0)) {
                    return;
                }
                continue;
            }
        }
    }
    
    public void onCompletion(final CountedCompleter<?> lllllllllllllIIllIllIlIlllIllIll) {
    }
    
    public final CountedCompleter<?> getRoot() {
        CountedCompleter<?> lllllllllllllIIllIllIlIllIlIllll = this;
        CountedCompleter<?> lllllllllllllIIllIllIlIllIlIlllI;
        while (llIIllIllllIIlI(lllllllllllllIIllIllIlIllIlIlllI = lllllllllllllIIllIllIlIllIlIllll.completer)) {
            lllllllllllllIIllIllIlIllIlIllll = lllllllllllllIIllIllIlIllIlIlllI;
            "".length();
            if (((0xBE ^ 0x81) & ~(0x58 ^ 0x67)) < -" ".length()) {
                return null;
            }
        }
        return lllllllllllllIIllIllIlIllIlIllll;
    }
    
    public final int getPendingCount() {
        return this.pending;
    }
    
    @Override
    protected void setRawResult(final T lllllllllllllIIllIllIlIlIllIIIll) {
    }
    
    @Override
    void internalPropagateException(final Throwable lllllllllllllIIllIllIlIlIllIlIll) {
        CountedCompleter<?> lllllllllllllIIllIllIlIlIllIllIl;
        CountedCompleter<?> lllllllllllllIIllIllIlIlIllIlllI = lllllllllllllIIllIllIlIlIllIllIl = this;
        while (llIIllIllllIIIl(lllllllllllllIIllIllIlIlIllIlllI.onExceptionalCompletion(lllllllllllllIIllIllIlIlIllIlIll, lllllllllllllIIllIllIlIlIllIllIl) ? 1 : 0) && llIIllIllllIIlI(lllllllllllllIIllIllIlIlIllIlllI = (lllllllllllllIIllIllIlIlIllIllIl = lllllllllllllIIllIllIlIlIllIlllI).completer) && llIIllIllllIlIl(lllllllllllllIIllIllIlIlIllIlllI.status) && llIIllIllllIllI(lllllllllllllIIllIllIlIlIllIlllI.recordExceptionalCompletion(lllllllllllllIIllIllIlIlIllIlIll), Integer.MIN_VALUE)) {
            "".length();
            if (" ".length() < ((0x4B ^ 0x1A) & ~(0x7 ^ 0x56))) {
                return;
            }
        }
    }
    
    private static boolean llIIllIllllIllI(final int lllllllllllllIIllIllIlIlIlIIllII, final int lllllllllllllIIllIllIlIlIlIIlIll) {
        return lllllllllllllIIllIllIlIlIlIIllII == lllllllllllllIIllIllIlIlIlIIlIll;
    }
    
    public final void addToPendingCount(final int lllllllllllllIIllIllIlIlllIIIlII) {
        int lllllllllllllIIllIllIlIlllIIIllI;
        while (!llIIllIllllIIIl(CountedCompleter.U.compareAndSwapInt(this, CountedCompleter.PENDING, lllllllllllllIIllIllIlIlllIIIllI = this.pending, lllllllllllllIIllIllIlIlllIIIllI + lllllllllllllIIllIllIlIlllIIIlII) ? 1 : 0)) {}
    }
    
    private static void llIIllIlllIlIll() {
        (lIIlIIllIIIlIl = new String[CountedCompleter.lIIlIIllIIlIII[2]])[CountedCompleter.lIIlIIllIIlIII[1]] = llIIllIlllIlIlI("QV+qUxbnIIM6GMUlAkzslspcVgW64qjkGWh++kkVx8E=", "ZoYeB");
        CountedCompleter.lIIlIIllIIIlIl[CountedCompleter.lIIlIIllIIlIII[0]] = llIIllIlllIlIlI("KHuee7uh37c=", "qrxBX");
    }
    
    public boolean onExceptionalCompletion(final Throwable lllllllllllllIIllIllIlIlllIllIIl, final CountedCompleter<?> lllllllllllllIIllIllIlIlllIllIII) {
        return CountedCompleter.lIIlIIllIIlIII[0] != 0;
    }
    
    protected CountedCompleter() {
        this.completer = null;
    }
    
    static {
        llIIllIllllIIII();
        llIIllIlllIlIll();
        try {
            U = getUnsafe();
            PENDING = CountedCompleter.U.objectFieldOffset(CountedCompleter.class.getDeclaredField(CountedCompleter.lIIlIIllIIIlIl[CountedCompleter.lIIlIIllIIlIII[0]]));
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
        }
        catch (Exception lllllllllllllIIllIllIlIlIlIlllIl) {
            throw new Error(lllllllllllllIIllIllIlIlIlIlllIl);
        }
    }
    
    @Override
    public T getRawResult() {
        return null;
    }
}
