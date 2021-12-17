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
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

final class UnsafeAtomicLongFieldUpdater<T> extends AtomicLongFieldUpdater<T>
{
    private static final /* synthetic */ String[] lIllIlIIIlIlIl;
    private final /* synthetic */ long offset;
    private final /* synthetic */ Unsafe unsafe;
    private static final /* synthetic */ int[] lIllIlIIIlIllI;
    
    @Override
    public void lazySet(final T lllllllllllllIIIIIIIlIIlIIIIIllI, final long lllllllllllllIIIIIIIlIIlIIIIIlIl) {
        this.unsafe.putOrderedLong(lllllllllllllIIIIIIIlIIlIIIIIllI, this.offset, lllllllllllllIIIIIIIlIIlIIIIIlIl);
    }
    
    UnsafeAtomicLongFieldUpdater(final Unsafe lllllllllllllIIIIIIIlIIlIIlIllll, final Class<?> lllllllllllllIIIIIIIlIIlIIllIIll, final String lllllllllllllIIIIIIIlIIlIIllIIlI) throws NoSuchFieldException {
        final Field lllllllllllllIIIIIIIlIIlIIllIIIl = lllllllllllllIIIIIIIlIIlIIllIIll.getDeclaredField(lllllllllllllIIIIIIIlIIlIIllIIlI);
        if (llllllIIIIIIIII(Modifier.isVolatile(lllllllllllllIIIIIIIlIIlIIllIIIl.getModifiers()) ? 1 : 0)) {
            throw new IllegalArgumentException(UnsafeAtomicLongFieldUpdater.lIllIlIIIlIlIl[UnsafeAtomicLongFieldUpdater.lIllIlIIIlIllI[0]]);
        }
        this.unsafe = lllllllllllllIIIIIIIlIIlIIlIllll;
        this.offset = lllllllllllllIIIIIIIlIIlIIlIllll.objectFieldOffset(lllllllllllllIIIIIIIlIIlIIllIIIl);
    }
    
    private static void lllllIlllllllll() {
        (lIllIlIIIlIllI = new int[3])[0] = ((0xDB ^ 0xB6 ^ (0x10 ^ 0x39)) & (138 + 166 - 271 + 202 ^ 89 + 107 - 22 + 1 ^ -" ".length()));
        UnsafeAtomicLongFieldUpdater.lIllIlIIIlIllI[1] = " ".length();
        UnsafeAtomicLongFieldUpdater.lIllIlIIIlIllI[2] = "  ".length();
    }
    
    @Override
    public boolean weakCompareAndSet(final T lllllllllllllIIIIIIIlIIlIIIlIllI, final long lllllllllllllIIIIIIIlIIlIIIlIlIl, final long lllllllllllllIIIIIIIlIIlIIIlIlII) {
        return this.unsafe.compareAndSwapLong(lllllllllllllIIIIIIIlIIlIIIlIllI, this.offset, lllllllllllllIIIIIIIlIIlIIIlIlIl, lllllllllllllIIIIIIIlIIlIIIlIlII);
    }
    
    private static boolean llllllIIIIIIIII(final int lllllllllllllIIIIIIIlIIIlllIllIl) {
        return lllllllllllllIIIIIIIlIIIlllIllIl == 0;
    }
    
    @Override
    public void set(final T lllllllllllllIIIIIIIlIIlIIIIllll, final long lllllllllllllIIIIIIIlIIlIIIIlIll) {
        this.unsafe.putLongVolatile(lllllllllllllIIIIIIIlIIlIIIIllll, this.offset, lllllllllllllIIIIIIIlIIlIIIIlIll);
    }
    
    static {
        lllllIlllllllll();
        lllllIllllllllI();
    }
    
    private static void lllllIllllllllI() {
        (lIllIlIIIlIlIl = new String[UnsafeAtomicLongFieldUpdater.lIllIlIIIlIllI[1]])[UnsafeAtomicLongFieldUpdater.lIllIlIIIlIllI[0]] = lllllIlllllllIl("FAJdaW1++Zhk5eohCncNcElorNvnTsBq", "cYjGd");
    }
    
    @Override
    public boolean compareAndSet(final T lllllllllllllIIIIIIIlIIlIIlIIllI, final long lllllllllllllIIIIIIIlIIlIIlIIlIl, final long lllllllllllllIIIIIIIlIIlIIlIIlII) {
        return this.unsafe.compareAndSwapLong(lllllllllllllIIIIIIIlIIlIIlIIllI, this.offset, lllllllllllllIIIIIIIlIIlIIlIIlIl, lllllllllllllIIIIIIIlIIlIIlIIlII);
    }
    
    @Override
    public long get(final T lllllllllllllIIIIIIIlIIIlllllllI) {
        return this.unsafe.getLongVolatile(lllllllllllllIIIIIIIlIIIlllllllI, this.offset);
    }
    
    private static String lllllIlllllllIl(final String lllllllllllllIIIIIIIlIIIllllIIlI, final String lllllllllllllIIIIIIIlIIIllllIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIIlIIIllllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIlIIIllllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIIIlIIIllllIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIIIlIIIllllIllI.init(UnsafeAtomicLongFieldUpdater.lIllIlIIIlIllI[2], lllllllllllllIIIIIIIlIIIllllIlll);
            return new String(lllllllllllllIIIIIIIlIIIllllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIlIIIllllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIIlIIIllllIlIl) {
            lllllllllllllIIIIIIIlIIIllllIlIl.printStackTrace();
            return null;
        }
    }
}
