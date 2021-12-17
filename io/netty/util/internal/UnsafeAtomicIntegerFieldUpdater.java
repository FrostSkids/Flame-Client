// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

final class UnsafeAtomicIntegerFieldUpdater<T> extends AtomicIntegerFieldUpdater<T>
{
    private final /* synthetic */ long offset;
    private static final /* synthetic */ String[] llllllIlIlIII;
    private final /* synthetic */ Unsafe unsafe;
    private static final /* synthetic */ int[] llllllIlIlIIl;
    
    @Override
    public void set(final T lllllllllllllIlIlIlIlIIIIlIIIIII, final int lllllllllllllIlIlIlIlIIIIIllllll) {
        this.unsafe.putIntVolatile(lllllllllllllIlIlIlIlIIIIlIIIIII, this.offset, lllllllllllllIlIlIlIlIIIIIllllll);
    }
    
    static {
        lIllIIIIIIllllI();
        lIllIIIIIIlllIl();
    }
    
    private static void lIllIIIIIIllllI() {
        (llllllIlIlIIl = new int[3])[0] = ((0x56 ^ 0x34) & ~(0xFD ^ 0x9F));
        UnsafeAtomicIntegerFieldUpdater.llllllIlIlIIl[1] = " ".length();
        UnsafeAtomicIntegerFieldUpdater.llllllIlIlIIl[2] = "  ".length();
    }
    
    UnsafeAtomicIntegerFieldUpdater(final Unsafe lllllllllllllIlIlIlIlIIIIllIIlIl, final Class<?> lllllllllllllIlIlIlIlIIIIllIIlII, final String lllllllllllllIlIlIlIlIIIIllIIIll) throws NoSuchFieldException {
        final Field lllllllllllllIlIlIlIlIIIIllIIIlI = lllllllllllllIlIlIlIlIIIIllIIlII.getDeclaredField(lllllllllllllIlIlIlIlIIIIllIIIll);
        if (lIllIIIIIIlllll(Modifier.isVolatile(lllllllllllllIlIlIlIlIIIIllIIIlI.getModifiers()) ? 1 : 0)) {
            throw new IllegalArgumentException(UnsafeAtomicIntegerFieldUpdater.llllllIlIlIII[UnsafeAtomicIntegerFieldUpdater.llllllIlIlIIl[0]]);
        }
        this.unsafe = lllllllllllllIlIlIlIlIIIIllIIlIl;
        this.offset = lllllllllllllIlIlIlIlIIIIllIIlIl.objectFieldOffset(lllllllllllllIlIlIlIlIIIIllIIIlI);
    }
    
    @Override
    public boolean compareAndSet(final T lllllllllllllIlIlIlIlIIIIlIlIIll, final int lllllllllllllIlIlIlIlIIIIlIlIIlI, final int lllllllllllllIlIlIlIlIIIIlIlIIIl) {
        return this.unsafe.compareAndSwapInt(lllllllllllllIlIlIlIlIIIIlIlIIll, this.offset, lllllllllllllIlIlIlIlIIIIlIlIIlI, lllllllllllllIlIlIlIlIIIIlIlIIIl);
    }
    
    @Override
    public void lazySet(final T lllllllllllllIlIlIlIlIIIIIllIlll, final int lllllllllllllIlIlIlIlIIIIIllIllI) {
        this.unsafe.putOrderedInt(lllllllllllllIlIlIlIlIIIIIllIlll, this.offset, lllllllllllllIlIlIlIlIIIIIllIllI);
    }
    
    @Override
    public int get(final T lllllllllllllIlIlIlIlIIIIIlIllIl) {
        return this.unsafe.getIntVolatile(lllllllllllllIlIlIlIlIIIIIlIllIl, this.offset);
    }
    
    private static void lIllIIIIIIlllIl() {
        (llllllIlIlIII = new String[UnsafeAtomicIntegerFieldUpdater.llllllIlIlIIl[1]])[UnsafeAtomicIntegerFieldUpdater.llllllIlIlIIl[0]] = lIllIIIIIIlllII("1jSd1m5IVyB1cFR5JQLpiakYy03BFjnl", "dFMrn");
    }
    
    @Override
    public boolean weakCompareAndSet(final T lllllllllllllIlIlIlIlIIIIlIIlIll, final int lllllllllllllIlIlIlIlIIIIlIIlIlI, final int lllllllllllllIlIlIlIlIIIIlIIIlIl) {
        return this.unsafe.compareAndSwapInt(lllllllllllllIlIlIlIlIIIIlIIlIll, this.offset, lllllllllllllIlIlIlIlIIIIlIIlIlI, lllllllllllllIlIlIlIlIIIIlIIIlIl);
    }
    
    private static String lIllIIIIIIlllII(final String lllllllllllllIlIlIlIlIIIIIlIIlIl, final String lllllllllllllIlIlIlIlIIIIIlIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlIlIIIIIlIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIlIIIIIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIlIlIIIIIlIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIlIlIIIIIlIIlll.init(UnsafeAtomicIntegerFieldUpdater.llllllIlIlIIl[2], lllllllllllllIlIlIlIlIIIIIlIlIII);
            return new String(lllllllllllllIlIlIlIlIIIIIlIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIlIIIIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlIlIIIIIlIIllI) {
            lllllllllllllIlIlIlIlIIIIIlIIllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIIIIIIlllll(final int lllllllllllllIlIlIlIlIIIIIIllllI) {
        return lllllllllllllIlIlIlIlIIIIIIllllI == 0;
    }
}
