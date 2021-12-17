// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import sun.misc.Unsafe;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class UnsafeAtomicReferenceFieldUpdater<U, M> extends AtomicReferenceFieldUpdater<U, M>
{
    private final /* synthetic */ Unsafe unsafe;
    private static final /* synthetic */ int[] lIlllllIIIIIll;
    private static final /* synthetic */ String[] lIlllllIIIIIIl;
    private final /* synthetic */ long offset;
    
    private static String lIIIIlIlIIIIIlII(final String llllllllllllIllllIIllllIllllIIll, final String llllllllllllIllllIIllllIllllIlII) {
        try {
            final SecretKeySpec llllllllllllIllllIIllllIlllllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIllllIllllIlII.getBytes(StandardCharsets.UTF_8)), UnsafeAtomicReferenceFieldUpdater.lIlllllIIIIIll[2]), "DES");
            final Cipher llllllllllllIllllIIllllIllllIlll = Cipher.getInstance("DES");
            llllllllllllIllllIIllllIllllIlll.init(UnsafeAtomicReferenceFieldUpdater.lIlllllIIIIIll[3], llllllllllllIllllIIllllIlllllIII);
            return new String(llllllllllllIllllIIllllIllllIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIllllIllllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIllllIllllIllI) {
            llllllllllllIllllIIllllIllllIllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public M get(final U llllllllllllIllllIIllllIllllllIl) {
        return (M)this.unsafe.getObjectVolatile(llllllllllllIllllIIllllIllllllIl, this.offset);
    }
    
    @Override
    public boolean compareAndSet(final U llllllllllllIllllIIlllllIIlIIlll, final M llllllllllllIllllIIlllllIIlIIllI, final M llllllllllllIllllIIlllllIIlIIIIl) {
        return this.unsafe.compareAndSwapObject(llllllllllllIllllIIlllllIIlIIlll, this.offset, llllllllllllIllllIIlllllIIlIIllI, llllllllllllIllllIIlllllIIlIIIIl);
    }
    
    static {
        lIIIIlIlIIIIlIIl();
        lIIIIlIlIIIIIllI();
    }
    
    private static boolean lIIIIlIlIIIIlIlI(final int llllllllllllIllllIIllllIlllIlllI) {
        return llllllllllllIllllIIllllIlllIlllI == 0;
    }
    
    private static void lIIIIlIlIIIIIllI() {
        (lIlllllIIIIIIl = new String[UnsafeAtomicReferenceFieldUpdater.lIlllllIIIIIll[1]])[UnsafeAtomicReferenceFieldUpdater.lIlllllIIIIIll[0]] = lIIIIlIlIIIIIlII("m21TV/a8ufaX7vnqeokPkvBv8/5HBp1A", "VbOmd");
    }
    
    UnsafeAtomicReferenceFieldUpdater(final Unsafe llllllllllllIllllIIlllllIIllIlIl, final Class<U> llllllllllllIllllIIlllllIIlIllll, final String llllllllllllIllllIIlllllIIlIlllI) throws NoSuchFieldException {
        final Field llllllllllllIllllIIlllllIIllIIlI = llllllllllllIllllIIlllllIIlIllll.getDeclaredField(llllllllllllIllllIIlllllIIlIlllI);
        if (lIIIIlIlIIIIlIlI(Modifier.isVolatile(llllllllllllIllllIIlllllIIllIIlI.getModifiers()) ? 1 : 0)) {
            throw new IllegalArgumentException(UnsafeAtomicReferenceFieldUpdater.lIlllllIIIIIIl[UnsafeAtomicReferenceFieldUpdater.lIlllllIIIIIll[0]]);
        }
        this.unsafe = llllllllllllIllllIIlllllIIllIlIl;
        this.offset = llllllllllllIllllIIlllllIIllIlIl.objectFieldOffset(llllllllllllIllllIIlllllIIllIIlI);
    }
    
    @Override
    public void lazySet(final U llllllllllllIllllIIlllllIIIIIlll, final M llllllllllllIllllIIlllllIIIIIIll) {
        this.unsafe.putOrderedObject(llllllllllllIllllIIlllllIIIIIlll, this.offset, llllllllllllIllllIIlllllIIIIIIll);
    }
    
    private static void lIIIIlIlIIIIlIIl() {
        (lIlllllIIIIIll = new int[4])[0] = ("   ".length() & ~"   ".length());
        UnsafeAtomicReferenceFieldUpdater.lIlllllIIIIIll[1] = " ".length();
        UnsafeAtomicReferenceFieldUpdater.lIlllllIIIIIll[2] = (0x2F ^ 0x27);
        UnsafeAtomicReferenceFieldUpdater.lIlllllIIIIIll[3] = "  ".length();
    }
    
    @Override
    public void set(final U llllllllllllIllllIIlllllIIIIllIl, final M llllllllllllIllllIIlllllIIIIllll) {
        this.unsafe.putObjectVolatile(llllllllllllIllllIIlllllIIIIllIl, this.offset, llllllllllllIllllIIlllllIIIIllll);
    }
    
    @Override
    public boolean weakCompareAndSet(final U llllllllllllIllllIIlllllIIIllIll, final M llllllllllllIllllIIlllllIIIllIlI, final M llllllllllllIllllIIlllllIIIlIlIl) {
        return this.unsafe.compareAndSwapObject(llllllllllllIllllIIlllllIIIllIll, this.offset, llllllllllllIllllIIlllllIIIllIlI, llllllllllllIllllIIlllllIIIlIlIl);
    }
}
