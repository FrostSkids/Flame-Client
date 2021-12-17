// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.lang.reflect.Array;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReadWriteLock;

public class ThreadSafeBoundList<T>
{
    private final /* synthetic */ Class<? extends T> field_152760_b;
    private /* synthetic */ int field_152762_d;
    private static final /* synthetic */ int[] llIIlIIIlllIII;
    private final /* synthetic */ ReadWriteLock field_152761_c;
    private /* synthetic */ int field_152763_e;
    private final /* synthetic */ T[] field_152759_a;
    
    public int func_152758_b() {
        this.field_152761_c.readLock().lock();
        final int llllllllllllIlllIIlIlllIIIllIlll = this.field_152759_a.length;
        this.field_152761_c.readLock().unlock();
        return llllllllllllIlllIIlIlllIIIllIlll;
    }
    
    private static boolean lIIIllIIIIIlIIll(final int llllllllllllIlllIIlIlllIIIIlllll) {
        return llllllllllllIlllIIlIlllIIIIlllll < 0;
    }
    
    public T func_152757_a(final T llllllllllllIlllIIlIlllIIIllllIl) {
        this.field_152761_c.writeLock().lock();
        this.field_152759_a[this.field_152763_e] = llllllllllllIlllIIlIlllIIIllllIl;
        this.field_152763_e = (this.field_152763_e + ThreadSafeBoundList.llIIlIIIlllIII[0]) % this.func_152758_b();
        if (lIIIllIIIIIlIIlI(this.field_152762_d, this.func_152758_b())) {
            this.field_152762_d += ThreadSafeBoundList.llIIlIIIlllIII[0];
        }
        this.field_152761_c.writeLock().unlock();
        return llllllllllllIlllIIlIlllIIIllllIl;
    }
    
    public ThreadSafeBoundList(final Class<? extends T> llllllllllllIlllIIlIlllIIlIIIlIl, final int llllllllllllIlllIIlIlllIIlIIIlII) {
        this.field_152761_c = new ReentrantReadWriteLock();
        this.field_152760_b = llllllllllllIlllIIlIlllIIlIIIlIl;
        this.field_152759_a = (T[])Array.newInstance(llllllllllllIlllIIlIlllIIlIIIlIl, llllllllllllIlllIIlIlllIIlIIIlII);
    }
    
    static {
        lIIIllIIIIIlIIIl();
    }
    
    private static void lIIIllIIIIIlIIIl() {
        (llIIlIIIlllIII = new int[2])[0] = " ".length();
        ThreadSafeBoundList.llIIlIIIlllIII[1] = ((0x38 ^ 0x64) & ~(0xD9 ^ 0x85));
    }
    
    private static boolean lIIIllIIIIIlIIlI(final int llllllllllllIlllIIlIlllIIIlIIIlI, final int llllllllllllIlllIIlIlllIIIlIIIIl) {
        return llllllllllllIlllIIlIlllIIIlIIIlI < llllllllllllIlllIIlIlllIIIlIIIIl;
    }
    
    public T[] func_152756_c() {
        final Object[] llllllllllllIlllIIlIlllIIIlIllll = (Object[])Array.newInstance(this.field_152760_b, this.field_152762_d);
        this.field_152761_c.readLock().lock();
        int llllllllllllIlllIIlIlllIIIlIlllI = ThreadSafeBoundList.llIIlIIIlllIII[1];
        "".length();
        if (" ".length() < -" ".length()) {
            return null;
        }
        while (!lIIIllIIIIIlIlII(llllllllllllIlllIIlIlllIIIlIlllI, this.field_152762_d)) {
            int llllllllllllIlllIIlIlllIIIlIllIl = (this.field_152763_e - this.field_152762_d + llllllllllllIlllIIlIlllIIIlIlllI) % this.func_152758_b();
            if (lIIIllIIIIIlIIll(llllllllllllIlllIIlIlllIIIlIllIl)) {
                llllllllllllIlllIIlIlllIIIlIllIl += this.func_152758_b();
            }
            llllllllllllIlllIIlIlllIIIlIllll[llllllllllllIlllIIlIlllIIIlIlllI] = this.field_152759_a[llllllllllllIlllIIlIlllIIIlIllIl];
            ++llllllllllllIlllIIlIlllIIIlIlllI;
        }
        this.field_152761_c.readLock().unlock();
        return (T[])llllllllllllIlllIIlIlllIIIlIllll;
    }
    
    private static boolean lIIIllIIIIIlIlII(final int llllllllllllIlllIIlIlllIIIlIIllI, final int llllllllllllIlllIIlIlllIIIlIIlIl) {
        return llllllllllllIlllIIlIlllIIIlIIllI >= llllllllllllIlllIIlIlllIIIlIIlIl;
    }
}
