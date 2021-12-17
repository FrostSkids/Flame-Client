// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import io.netty.util.internal.SystemPropertyUtil;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicInteger;
import io.netty.util.internal.logging.InternalLogger;
import java.util.Map;
import io.netty.util.concurrent.FastThreadLocal;

public abstract class Recycler<T>
{
    private static final /* synthetic */ String[] lIlllllIIIIIlI;
    private final /* synthetic */ FastThreadLocal<Stack<T>> threadLocal;
    private static final /* synthetic */ FastThreadLocal<Map<Stack<?>, WeakOrderQueue>> DELAYED_RECYCLED;
    private static final /* synthetic */ int INITIAL_CAPACITY;
    private static final /* synthetic */ int OWN_THREAD_ID;
    private static final /* synthetic */ InternalLogger logger;
    private final /* synthetic */ int maxCapacity;
    private static final /* synthetic */ int[] lIlllllIIIIlIl;
    private static final /* synthetic */ AtomicInteger ID_GENERATOR;
    private static final /* synthetic */ int DEFAULT_MAX_CAPACITY;
    
    private static boolean lIIIIlIlIIIIllll(final Object llllllllllllIllllIIllllIlIlIllIl, final Object llllllllllllIllllIIllllIlIlIllII) {
        return llllllllllllIllllIIllllIlIlIllIl != llllllllllllIllllIIllllIlIlIllII;
    }
    
    private static boolean lIIIIlIlIIIlIIIl(final int llllllllllllIllllIIllllIlIlIlIII) {
        return llllllllllllIllllIIllllIlIlIlIII != 0;
    }
    
    protected Recycler(final int llllllllllllIllllIIllllIlllIIlIl) {
        this.threadLocal = new FastThreadLocal<Stack<T>>() {
            @Override
            protected Stack<T> initialValue() {
                return new Stack<T>(Recycler.this, Thread.currentThread(), Recycler.this.maxCapacity);
            }
        };
        this.maxCapacity = Math.max(Recycler.lIlllllIIIIlIl[0], llllllllllllIllllIIllllIlllIIlIl);
    }
    
    private static String lIIIIlIlIIIIIlIl(final String llllllllllllIllllIIllllIllIIIIII, final String llllllllllllIllllIIllllIlIllllll) {
        try {
            final SecretKeySpec llllllllllllIllllIIllllIllIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIllllIlIllllll.getBytes(StandardCharsets.UTF_8)), Recycler.lIlllllIIIIlIl[6]), "DES");
            final Cipher llllllllllllIllllIIllllIllIIIlII = Cipher.getInstance("DES");
            llllllllllllIllllIIllllIllIIIlII.init(Recycler.lIlllllIIIIlIl[3], llllllllllllIllllIIllllIllIIIlIl);
            return new String(llllllllllllIllllIIllllIllIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIllllIllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIllllIllIIIIll) {
            llllllllllllIllllIIllllIllIIIIll.printStackTrace();
            return null;
        }
    }
    
    protected Recycler() {
        this(Recycler.DEFAULT_MAX_CAPACITY);
    }
    
    public final boolean recycle(final T llllllllllllIllllIIllllIllIlIIlI, final Handle llllllllllllIllllIIllllIllIlIlIl) {
        final DefaultHandle llllllllllllIllllIIllllIllIlIlII = (DefaultHandle)llllllllllllIllllIIllllIllIlIlIl;
        if (lIIIIlIlIIIIllll(llllllllllllIllllIIllllIllIlIlII.stack.parent, this)) {
            return Recycler.lIlllllIIIIlIl[0] != 0;
        }
        if (lIIIIlIlIIIIllll(llllllllllllIllllIIllllIllIlIIlI, llllllllllllIllllIIllllIllIlIlII.value)) {
            throw new IllegalArgumentException(Recycler.lIlllllIIIIIlI[Recycler.lIlllllIIIIlIl[0]]);
        }
        llllllllllllIllllIIllllIllIlIlII.recycle();
        return Recycler.lIlllllIIIIlIl[1] != 0;
    }
    
    private static void lIIIIlIlIIIIlIII() {
        (lIlllllIIIIIlI = new String[Recycler.lIlllllIIIIlIl[5]])[Recycler.lIlllllIIIIlIl[0]] = lIIIIlIlIIIIIlIl("bpX2rKXSeOaU+MMcQ0li7WHYEOzJEONSWFmVqg9WDsk=", "PDool");
        Recycler.lIlllllIIIIIlI[Recycler.lIlllllIIIIlIl[1]] = lIIIIlIlIIIIIlll("WS84Pq5BU+k42W2dMM2QKVjgppd0hDlRPG57pt6EoEvNO7ia+y/3nA==", "RcAnD");
        Recycler.lIlllllIIIIIlI[Recycler.lIlllllIIIIlIl[3]] = lIIIIlIlIIIIIlll("Ml5NwHtb3c6jMYuF1k3cxqIVy0r4zDUOSYSZpiwgsKWiFOjVRzGLfUsqY38Uirib", "RWtni");
    }
    
    private static boolean lIIIIlIlIIIlIIII(final int llllllllllllIllllIIllllIlIlIIllI) {
        return llllllllllllIllllIIllllIlIlIIllI <= 0;
    }
    
    private static void lIIIIlIlIIIIllIl() {
        (lIlllllIIIIlIl = new int[7])[0] = ((0x31 ^ 0x3F ^ (0x36 ^ 0x3C)) & (15 + 34 + 94 + 50 ^ 99 + 28 + 59 + 11 ^ -" ".length()));
        Recycler.lIlllllIIIIlIl[1] = " ".length();
        Recycler.lIlllllIIIIlIl[2] = (0xFFFFEC95 & 0x4136A);
        Recycler.lIlllllIIIIlIl[3] = "  ".length();
        Recycler.lIlllllIIIIlIl[4] = (0xFFFF8374 & 0x7D8B);
        Recycler.lIlllllIIIIlIl[5] = "   ".length();
        Recycler.lIlllllIIIIlIl[6] = (0x7E ^ 0x76);
    }
    
    private static boolean lIIIIlIlIIIIlllI(final Object llllllllllllIllllIIllllIlIlIlIlI) {
        return llllllllllllIllllIIllllIlIlIlIlI == null;
    }
    
    public final T get() {
        final Stack<T> llllllllllllIllllIIllllIlllIIIII = this.threadLocal.get();
        DefaultHandle llllllllllllIllllIIllllIllIlllll = llllllllllllIllllIIllllIlllIIIII.pop();
        if (lIIIIlIlIIIIlllI(llllllllllllIllllIIllllIllIlllll)) {
            llllllllllllIllllIIllllIllIlllll = llllllllllllIllllIIllllIlllIIIII.newHandle();
            llllllllllllIllllIIllllIllIlllll.value = this.newObject(llllllllllllIllllIIllllIllIlllll);
            "".length();
        }
        return (T)llllllllllllIllllIIllllIllIlllll.value;
    }
    
    protected abstract T newObject(final Handle p0);
    
    static {
        lIIIIlIlIIIIllIl();
        lIIIIlIlIIIIlIII();
        logger = InternalLoggerFactory.getInstance(Recycler.class);
        ID_GENERATOR = new AtomicInteger(Integer.MIN_VALUE);
        OWN_THREAD_ID = Recycler.ID_GENERATOR.getAndIncrement();
        int llllllllllllIllllIIllllIllIIlIll = SystemPropertyUtil.getInt(Recycler.lIlllllIIIIIlI[Recycler.lIlllllIIIIlIl[1]], Recycler.lIlllllIIIIlIl[0]);
        if (lIIIIlIlIIIlIIII(llllllllllllIllllIIllllIllIIlIll)) {
            llllllllllllIllllIIllllIllIIlIll = Recycler.lIlllllIIIIlIl[2];
        }
        DEFAULT_MAX_CAPACITY = llllllllllllIllllIIllllIllIIlIll;
        if (lIIIIlIlIIIlIIIl(Recycler.logger.isDebugEnabled() ? 1 : 0)) {
            Recycler.logger.debug(Recycler.lIlllllIIIIIlI[Recycler.lIlllllIIIIlIl[3]], (Object)Recycler.DEFAULT_MAX_CAPACITY);
        }
        INITIAL_CAPACITY = Math.min(Recycler.DEFAULT_MAX_CAPACITY, Recycler.lIlllllIIIIlIl[4]);
        DELAYED_RECYCLED = new FastThreadLocal<Map<Stack<?>, WeakOrderQueue>>() {
            @Override
            protected Map<Stack<?>, WeakOrderQueue> initialValue() {
                return new WeakHashMap<Stack<?>, WeakOrderQueue>();
            }
        };
    }
    
    private static String lIIIIlIlIIIIIlll(final String llllllllllllIllllIIllllIlIllIlIl, final String llllllllllllIllllIIllllIlIllIlII) {
        try {
            final SecretKeySpec llllllllllllIllllIIllllIlIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIllllIlIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIllllIlIllIlll = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIllllIlIllIlll.init(Recycler.lIlllllIIIIlIl[3], llllllllllllIllllIIllllIlIlllIII);
            return new String(llllllllllllIllllIIllllIlIllIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIllllIlIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIllllIlIllIllI) {
            llllllllllllIllllIIllllIlIllIllI.printStackTrace();
            return null;
        }
    }
    
    static final class Stack<T>
    {
        private /* synthetic */ DefaultHandle[] elements;
        private static final /* synthetic */ int[] lIlIIlIIIIlIII;
        private static final /* synthetic */ String[] lIlIIIlllIlIll;
        private /* synthetic */ WeakOrderQueue prev;
        final /* synthetic */ Recycler<T> parent;
        private /* synthetic */ int size;
        final /* synthetic */ Thread thread;
        private volatile /* synthetic */ WeakOrderQueue head;
        private final /* synthetic */ int maxCapacity;
        private /* synthetic */ WeakOrderQueue cursor;
        
        private static void lllIIlIIlIIllIl() {
            (lIlIIlIIIIlIII = new int[4])[0] = ((0xCA ^ 0x8C ^ (0x5D ^ 0x50)) & (140 + 113 - 142 + 120 ^ 96 + 43 - 135 + 168 ^ -" ".length()));
            Stack.lIlIIlIIIIlIII[1] = " ".length();
            Stack.lIlIIlIIIIlIII[2] = "  ".length();
            Stack.lIlIIlIIIIlIII[3] = (30 + 77 + 83 + 10 ^ 68 + 187 - 133 + 70);
        }
        
        private static void lllIIlIIIIlIIII() {
            (lIlIIIlllIlIll = new String[Stack.lIlIIlIIIIlIII[2]])[Stack.lIlIIlIIIIlIII[0]] = lllIIlIIIIIllIl("PjAmPQQgMCFkCjk5MS0XIDBlMA4hMDY=", "LUEDg");
            Stack.lIlIIIlllIlIll[Stack.lIlIIlIIIIlIII[1]] = lllIIlIIIIIlllI("h13McOZCpFTHGYrLFau7TXLg5nZ/1e2+", "OCQhF");
        }
        
        boolean scavengeSome() {
            boolean lllllllllllllIIIllIIlIlIlIIIllIl = Stack.lIlIIlIIIIlIII[0] != 0;
            WeakOrderQueue lllllllllllllIIIllIIlIlIlIIIllII = this.cursor;
            WeakOrderQueue lllllllllllllIIIllIIlIlIlIIIlIll = this.prev;
            while (lllIIlIIlIlIIIl(lllllllllllllIIIllIIlIlIlIIIllII)) {
                if (lllIIlIIlIlIIII(lllllllllllllIIIllIIlIlIlIIIllII.transfer(this) ? 1 : 0)) {
                    lllllllllllllIIIllIIlIlIlIIIllIl = (Stack.lIlIIlIIIIlIII[1] != 0);
                    "".length();
                    if (-"  ".length() > 0) {
                        return ((0x7A ^ 0x6D ^ (0x80 ^ 0x8F)) & (181 + 131 - 194 + 71 ^ 151 + 64 - 202 + 152 ^ -" ".length())) != 0x0;
                    }
                    break;
                }
                else {
                    final WeakOrderQueue lllllllllllllIIIllIIlIlIlIIIllll = lllllllllllllIIIllIIlIlIlIIIllII.next;
                    if (lllIIlIIlIlIIlI(lllllllllllllIIIllIIlIlIlIIIllII.owner.get())) {
                        if (lllIIlIIlIlIIII(lllllllllllllIIIllIIlIlIlIIIllII.hasFinalData() ? 1 : 0)) {
                            while (!lllIIlIIlIIlllI(lllllllllllllIIIllIIlIlIlIIIllII.transfer(this) ? 1 : 0)) {}
                            "".length();
                            if ((0xBE ^ 0xC5 ^ 73 + 1 - 46 + 99) != (0x4C ^ 0x6F ^ (0xA7 ^ 0x80))) {
                                return ((0xD6 ^ 0xAA ^ (0xE0 ^ 0x89)) & (0xAE ^ 0xB8 ^ "   ".length() ^ -" ".length())) != 0x0;
                            }
                        }
                        if (lllIIlIIlIlIIIl(lllllllllllllIIIllIIlIlIlIIIlIll)) {
                            lllllllllllllIIIllIIlIlIlIIIlIll.next = lllllllllllllIIIllIIlIlIlIIIllll;
                            "".length();
                            "".length();
                            if ("   ".length() <= 0) {
                                return ((0x59 ^ 0x46 ^ (0x40 ^ 0x6E)) & (61 + 142 - 166 + 115 ^ 135 + 89 - 81 + 26 ^ -" ".length())) != 0x0;
                            }
                        }
                    }
                    else {
                        lllllllllllllIIIllIIlIlIlIIIlIll = lllllllllllllIIIllIIlIlIlIIIllII;
                    }
                    lllllllllllllIIIllIIlIlIlIIIllII = lllllllllllllIIIllIIlIlIlIIIllll;
                    "".length();
                    if ("   ".length() <= " ".length()) {
                        return ((78 + 31 - 59 + 85 ^ 151 + 43 - 176 + 158) & (0x4E ^ 0xE ^ (0x11 ^ 0x66) ^ -" ".length())) != 0x0;
                    }
                    continue;
                }
            }
            this.prev = lllllllllllllIIIllIIlIlIlIIIlIll;
            this.cursor = lllllllllllllIIIllIIlIlIlIIIllII;
            return lllllllllllllIIIllIIlIlIlIIIllIl;
        }
        
        private static boolean lllIIlIIlIlIlIl(final int lllllllllllllIIIllIIlIlIIIllIIll, final int lllllllllllllIIIllIIlIlIIIllIIlI) {
            return lllllllllllllIIIllIIlIlIIIllIIll < lllllllllllllIIIllIIlIlIIIllIIlI;
        }
        
        private static boolean lllIIlIIlIlIIIl(final Object lllllllllllllIIIllIIlIlIIIllIIII) {
            return lllllllllllllIIIllIIlIlIIIllIIII != null;
        }
        
        private static boolean lllIIlIIlIlIIlI(final Object lllllllllllllIIIllIIlIlIIIlIlllI) {
            return lllllllllllllIIIllIIlIlIIIlIlllI == null;
        }
        
        static {
            lllIIlIIlIIllIl();
            lllIIlIIIIlIIII();
        }
        
        void push(final DefaultHandle lllllllllllllIIIllIIlIlIlIIIIIIl) {
            if (lllIIlIIlIlIIII(lllllllllllllIIIllIIlIlIlIIIIIIl.recycleId | lllllllllllllIIIllIIlIlIlIIIIIIl.lastRecycledId)) {
                throw new IllegalStateException(Stack.lIlIIIlllIlIll[Stack.lIlIIlIIIIlIII[1]]);
            }
            lllllllllllllIIIllIIlIlIlIIIIIIl.recycleId = (lllllllllllllIIIllIIlIlIlIIIIIIl.lastRecycledId = Recycler.OWN_THREAD_ID);
            "".length();
            final int lllllllllllllIIIllIIlIlIlIIIIIII = this.size;
            if (lllIIlIIlIlIlII(lllllllllllllIIIllIIlIlIlIIIIIII, this.elements.length)) {
                if (lllIIlIIlIlIlII(lllllllllllllIIIllIIlIlIlIIIIIII, this.maxCapacity)) {
                    return;
                }
                this.elements = Arrays.copyOf(this.elements, lllllllllllllIIIllIIlIlIlIIIIIII << Stack.lIlIIlIIIIlIII[1]);
            }
            this.elements[lllllllllllllIIIllIIlIlIlIIIIIII] = lllllllllllllIIIllIIlIlIlIIIIIIl;
            this.size = lllllllllllllIIIllIIlIlIlIIIIIII + Stack.lIlIIlIIIIlIII[1];
        }
        
        boolean scavenge() {
            if (lllIIlIIlIlIIII(this.scavengeSome() ? 1 : 0)) {
                return Stack.lIlIIlIIIIlIII[1] != 0;
            }
            this.prev = null;
            this.cursor = this.head;
            return Stack.lIlIIlIIIIlIII[0] != 0;
        }
        
        private static String lllIIlIIIIIlllI(final String lllllllllllllIIIllIIlIlIIlIlIlIl, final String lllllllllllllIIIllIIlIlIIlIlIlII) {
            try {
                final SecretKeySpec lllllllllllllIIIllIIlIlIIlIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIlIlIIlIlIlII.getBytes(StandardCharsets.UTF_8)), Stack.lIlIIlIIIIlIII[3]), "DES");
                final Cipher lllllllllllllIIIllIIlIlIIlIllIIl = Cipher.getInstance("DES");
                lllllllllllllIIIllIIlIlIIlIllIIl.init(Stack.lIlIIlIIIIlIII[2], lllllllllllllIIIllIIlIlIIlIllIlI);
                return new String(lllllllllllllIIIllIIlIlIIlIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIlIlIIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIllIIlIlIIlIllIII) {
                lllllllllllllIIIllIIlIlIIlIllIII.printStackTrace();
                return null;
            }
        }
        
        Stack(final Thread lllllllllllllIIIllIIlIlIlIlIIIlI, final int lllllllllllllIIIllIIlIlIlIlIIlIl) {
            this.thread = lllllllllllllIIIllIIlIlIlIlIIIlI;
            this.maxCapacity = lllllllllllllIIIllIIlIlIlIlIIlIl;
            this.elements = new DefaultHandle[Recycler.INITIAL_CAPACITY];
        }
        
        private static boolean lllIIlIIlIIlllI(final int lllllllllllllIIIllIIlIlIIIlIlIlI) {
            return lllllllllllllIIIllIIlIlIIIlIlIlI == 0;
        }
        
        private static boolean lllIIlIIlIIllll(final int lllllllllllllIIIllIIlIlIIIlIIlll, final int lllllllllllllIIIllIIlIlIIIlIIllI) {
            return lllllllllllllIIIllIIlIlIIIlIIlll != lllllllllllllIIIllIIlIlIIIlIIllI;
        }
        
        private static boolean lllIIlIIlIlIIII(final int lllllllllllllIIIllIIlIlIIIlIllII) {
            return lllllllllllllIIIllIIlIlIIIlIllII != 0;
        }
        
        private static String lllIIlIIIIIllIl(String lllllllllllllIIIllIIlIlIIlIIIIlI, final String lllllllllllllIIIllIIlIlIIlIIIllI) {
            lllllllllllllIIIllIIlIlIIlIIIIlI = new String(Base64.getDecoder().decode(lllllllllllllIIIllIIlIlIIlIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIIllIIlIlIIlIIIlIl = new StringBuilder();
            final char[] lllllllllllllIIIllIIlIlIIlIIIlII = lllllllllllllIIIllIIlIlIIlIIIllI.toCharArray();
            int lllllllllllllIIIllIIlIlIIlIIIIll = Stack.lIlIIlIIIIlIII[0];
            final int lllllllllllllIIIllIIlIlIIIllllIl = (Object)lllllllllllllIIIllIIlIlIIlIIIIlI.toCharArray();
            final Exception lllllllllllllIIIllIIlIlIIIllllII = (Exception)lllllllllllllIIIllIIlIlIIIllllIl.length;
            byte lllllllllllllIIIllIIlIlIIIlllIll = (byte)Stack.lIlIIlIIIIlIII[0];
            while (lllIIlIIlIlIlIl(lllllllllllllIIIllIIlIlIIIlllIll, (int)lllllllllllllIIIllIIlIlIIIllllII)) {
                final char lllllllllllllIIIllIIlIlIIlIIlIII = lllllllllllllIIIllIIlIlIIIllllIl[lllllllllllllIIIllIIlIlIIIlllIll];
                lllllllllllllIIIllIIlIlIIlIIIlIl.append((char)(lllllllllllllIIIllIIlIlIIlIIlIII ^ lllllllllllllIIIllIIlIlIIlIIIlII[lllllllllllllIIIllIIlIlIIlIIIIll % lllllllllllllIIIllIIlIlIIlIIIlII.length]));
                "".length();
                ++lllllllllllllIIIllIIlIlIIlIIIIll;
                ++lllllllllllllIIIllIIlIlIIIlllIll;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIIllIIlIlIIlIIIlIl);
        }
        
        DefaultHandle newHandle() {
            return new DefaultHandle(this);
        }
        
        private static boolean lllIIlIIlIlIlII(final int lllllllllllllIIIllIIlIlIIIllIlll, final int lllllllllllllIIIllIIlIlIIIllIllI) {
            return lllllllllllllIIIllIIlIlIIIllIlll == lllllllllllllIIIllIIlIlIIIllIllI;
        }
        
        DefaultHandle pop() {
            int lllllllllllllIIIllIIlIlIlIIlllII = this.size;
            if (lllIIlIIlIIlllI(lllllllllllllIIIllIIlIlIlIIlllII)) {
                if (lllIIlIIlIIlllI(this.scavenge() ? 1 : 0)) {
                    return null;
                }
                lllllllllllllIIIllIIlIlIlIIlllII = this.size;
            }
            --lllllllllllllIIIllIIlIlIlIIlllII;
            final DefaultHandle lllllllllllllIIIllIIlIlIlIIllIll = this.elements[lllllllllllllIIIllIIlIlIlIIlllII];
            if (lllIIlIIlIIllll(lllllllllllllIIIllIIlIlIlIIllIll.lastRecycledId, lllllllllllllIIIllIIlIlIlIIllIll.recycleId)) {
                throw new IllegalStateException(Stack.lIlIIIlllIlIll[Stack.lIlIIlIIIIlIII[0]]);
            }
            lllllllllllllIIIllIIlIlIlIIllIll.recycleId = Stack.lIlIIlIIIIlIII[0];
            "".length();
            lllllllllllllIIIllIIlIlIlIIllIll.lastRecycledId = Stack.lIlIIlIIIIlIII[0];
            "".length();
            this.size = lllllllllllllIIIllIIlIlIlIIlllII;
            return lllllllllllllIIIllIIlIlIlIIllIll;
        }
    }
    
    private static final class WeakOrderQueue
    {
        private final /* synthetic */ int id;
        private /* synthetic */ WeakOrderQueue next;
        private static final /* synthetic */ int[] llIIIllIllIlll;
        private /* synthetic */ Link tail;
        private final /* synthetic */ WeakReference<Thread> owner;
        private /* synthetic */ Link head;
        private static final /* synthetic */ String[] llIIIllIllIlII;
        
        WeakOrderQueue(final Stack<?> llllllllllllIlllIlIIIlllllIIllIl, final Thread llllllllllllIlllIlIIIlllllIIlIIl) {
            this.id = Recycler.ID_GENERATOR.getAndIncrement();
            final Link link = new Link();
            this.tail = link;
            this.head = link;
            this.owner = new WeakReference<Thread>(llllllllllllIlllIlIIIlllllIIlIIl);
            final boolean llllllllllllIlllIlIIIlllllIIlIII = (boolean)llllllllllllIlllIlIIIlllllIIllIl;
            synchronized (llllllllllllIlllIlIIIlllllIIllIl) {
                this.next = ((Stack<Object>)llllllllllllIlllIlIIIlllllIIllIl).head;
                ((Stack<Object>)llllllllllllIlllIlIIIlllllIIllIl).head = this;
                "".length();
                // monitorexit(llllllllllllIlllIlIIIlllllIIllIl)
                "".length();
                if ("  ".length() == " ".length()) {
                    throw null;
                }
            }
        }
        
        void add(final DefaultHandle llllllllllllIlllIlIIIlllllIIIIIl) {
            llllllllllllIlllIlIIIlllllIIIIIl.lastRecycledId = this.id;
            "".length();
            Link llllllllllllIlllIlIIIlllllIIIIII = this.tail;
            int llllllllllllIlllIlIIIllllIllllll;
            if (lIIIlIlIlIIllIlI(llllllllllllIlllIlIIIllllIllllll = llllllllllllIlllIlIIIlllllIIIIII.get(), WeakOrderQueue.llIIIllIllIlll[0])) {
                llllllllllllIlllIlIIIlllllIIIIII = (this.tail = (llllllllllllIlllIlIIIlllllIIIIII.next = new Link()));
                llllllllllllIlllIlIIIllllIllllll = llllllllllllIlllIlIIIlllllIIIIII.get();
            }
            (llllllllllllIlllIlIIIlllllIIIIII.elements[llllllllllllIlllIlIIIllllIllllll] = llllllllllllIlllIlIIIlllllIIIIIl).stack = null;
            "".length();
            llllllllllllIlllIlIIIlllllIIIIII.lazySet(llllllllllllIlllIlIIIllllIllllll + WeakOrderQueue.llIIIllIllIlll[1]);
        }
        
        private static boolean lIIIlIlIlIIlllll(final int llllllllllllIlllIlIIIlllIllIllll) {
            return llllllllllllIlllIlIIIlllIllIllll == 0;
        }
        
        private static boolean lIIIlIlIlIIlllIl(final int llllllllllllIlllIlIIIlllIlllIllI, final int llllllllllllIlllIlIIIlllIlllIlIl) {
            return llllllllllllIlllIlIIIlllIlllIllI > llllllllllllIlllIlIIIlllIlllIlIl;
        }
        
        private static boolean lIIIlIlIlIIllIlI(final int llllllllllllIlllIlIIIlllIllllllI, final int llllllllllllIlllIlIIIlllIlllllIl) {
            return llllllllllllIlllIlIIIlllIllllllI == llllllllllllIlllIlIIIlllIlllllIl;
        }
        
        private static boolean lIIIlIlIlIlIIIII(final Object llllllllllllIlllIlIIIlllIlllIIll) {
            return llllllllllllIlllIlIIIlllIlllIIll != null;
        }
        
        static {
            lIIIlIlIlIIllIIl();
            lIIIlIlIlIIlIIIl();
            LINK_CAPACITY = WeakOrderQueue.llIIIllIllIlll[0];
        }
        
        private static void lIIIlIlIlIIlIIIl() {
            (llIIIllIllIlII = new String[WeakOrderQueue.llIIIllIllIlll[1]])[WeakOrderQueue.llIIIllIllIlll[2]] = lIIIlIlIlIIIllll("/sA4aYMtN8Ds17xdYNJMw4TGatwwKEXb", "ZTPSP");
        }
        
        boolean hasFinalData() {
            int n;
            if (lIIIlIlIlIIllIll(this.tail.readIndex, this.tail.get())) {
                n = WeakOrderQueue.llIIIllIllIlll[1];
                "".length();
                if (((0x3D ^ 0x64 ^ (0x1 ^ 0x53)) & (0xC1 ^ 0xB7 ^ (0x56 ^ 0x2B) ^ -" ".length())) > "   ".length()) {
                    return ((0x48 ^ 0x10 ^ (0x58 ^ 0x1F)) & (0x3F ^ 0x63 ^ (0x3A ^ 0x79) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = WeakOrderQueue.llIIIllIllIlll[2];
            }
            return n != 0;
        }
        
        boolean transfer(final Stack<?> llllllllllllIlllIlIIIllllIlIIIlI) {
            Link llllllllllllIlllIlIIIllllIlIlIlI = this.head;
            if (lIIIlIlIlIIlllII(llllllllllllIlllIlIIIllllIlIlIlI)) {
                return WeakOrderQueue.llIIIllIllIlll[2] != 0;
            }
            if (lIIIlIlIlIIllIlI(llllllllllllIlllIlIIIllllIlIlIlI.readIndex, WeakOrderQueue.llIIIllIllIlll[0])) {
                if (lIIIlIlIlIIlllII(llllllllllllIlllIlIIIllllIlIlIlI.next)) {
                    return WeakOrderQueue.llIIIllIllIlll[2] != 0;
                }
                llllllllllllIlllIlIIIllllIlIlIlI = (this.head = llllllllllllIlllIlIIIllllIlIlIlI.next);
            }
            int llllllllllllIlllIlIIIllllIlIlIIl = llllllllllllIlllIlIIIllllIlIlIlI.readIndex;
            final int llllllllllllIlllIlIIIllllIlIlIII = llllllllllllIlllIlIIIllllIlIlIlI.get();
            if (lIIIlIlIlIIllIlI(llllllllllllIlllIlIIIllllIlIlIIl, llllllllllllIlllIlIIIllllIlIlIII)) {
                return WeakOrderQueue.llIIIllIllIlll[2] != 0;
            }
            final int llllllllllllIlllIlIIIllllIlIIlll = llllllllllllIlllIlIIIllllIlIlIII - llllllllllllIlllIlIIIllllIlIlIIl;
            if (lIIIlIlIlIIlllIl(((Stack<Object>)llllllllllllIlllIlIIIllllIlIIIlI).size + llllllllllllIlllIlIIIllllIlIIlll, ((Stack<Object>)llllllllllllIlllIlIIIllllIlIIIlI).elements.length)) {
                ((Stack<Object>)llllllllllllIlllIlIIIllllIlIIIlI).elements = Arrays.copyOf(((Stack<Object>)llllllllllllIlllIlIIIllllIlIIIlI).elements, (((Stack<Object>)llllllllllllIlllIlIIIllllIlIIIlI).size + llllllllllllIlllIlIIIllllIlIIlll) * WeakOrderQueue.llIIIllIllIlll[3]);
                "".length();
            }
            final DefaultHandle[] llllllllllllIlllIlIIIllllIlIIllI = llllllllllllIlllIlIIIllllIlIlIlI.elements;
            final DefaultHandle[] llllllllllllIlllIlIIIllllIlIIlIl = ((Stack<Object>)llllllllllllIlllIlIIIllllIlIIIlI).elements;
            int llllllllllllIlllIlIIIllllIlIIlII = ((Stack<Object>)llllllllllllIlllIlIIIllllIlIIIlI).size;
            while (lIIIlIlIlIIllllI(llllllllllllIlllIlIIIllllIlIlIIl, llllllllllllIlllIlIIIllllIlIlIII)) {
                final DefaultHandle llllllllllllIlllIlIIIllllIlIllIl = llllllllllllIlllIlIIIllllIlIIllI[llllllllllllIlllIlIIIllllIlIlIIl];
                if (lIIIlIlIlIIlllll(llllllllllllIlllIlIIIllllIlIllIl.recycleId)) {
                    llllllllllllIlllIlIIIllllIlIllIl.recycleId = llllllllllllIlllIlIIIllllIlIllIl.lastRecycledId;
                    "".length();
                    "".length();
                    if ("  ".length() == 0) {
                        return ((157 + 32 - 163 + 186 ^ 131 + 95 - 197 + 122) & (0x9C ^ 0xA8 ^ (0x4B ^ 0x3C) ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIIlIlIlIIllIll(llllllllllllIlllIlIIIllllIlIllIl.recycleId, llllllllllllIlllIlIIIllllIlIllIl.lastRecycledId)) {
                    throw new IllegalStateException(WeakOrderQueue.llIIIllIllIlII[WeakOrderQueue.llIIIllIllIlll[2]]);
                }
                llllllllllllIlllIlIIIllllIlIllIl.stack = llllllllllllIlllIlIIIllllIlIIIlI;
                "".length();
                llllllllllllIlllIlIIIllllIlIIlIl[llllllllllllIlllIlIIIllllIlIIlII++] = llllllllllllIlllIlIIIllllIlIllIl;
                llllllllllllIlllIlIIIllllIlIIllI[llllllllllllIlllIlIIIllllIlIlIIl++] = null;
                "".length();
                if ((0x17 ^ 0x12) == 0x0) {
                    return ((0x6D ^ 0xF) & ~(0x13 ^ 0x71)) != 0x0;
                }
            }
            ((Stack<Object>)llllllllllllIlllIlIIIllllIlIIIlI).size = llllllllllllIlllIlIIIllllIlIIlII;
            "".length();
            if (lIIIlIlIlIIllIlI(llllllllllllIlllIlIIIllllIlIlIII, WeakOrderQueue.llIIIllIllIlll[0]) && lIIIlIlIlIlIIIII(llllllllllllIlllIlIIIllllIlIlIlI.next)) {
                this.head = llllllllllllIlllIlIIIllllIlIlIlI.next;
            }
            llllllllllllIlllIlIIIllllIlIlIlI.readIndex = llllllllllllIlllIlIIIllllIlIlIII;
            "".length();
            return WeakOrderQueue.llIIIllIllIlll[1] != 0;
        }
        
        private static void lIIIlIlIlIIllIIl() {
            (llIIIllIllIlll = new int[5])[0] = (41 + 50 + 41 + 2 ^ 148 + 66 - 210 + 146);
            WeakOrderQueue.llIIIllIllIlll[1] = " ".length();
            WeakOrderQueue.llIIIllIllIlll[2] = ((0x34 ^ 0x60 ^ (0x7A ^ 0x35)) & (76 + 44 - 37 + 138 ^ 69 + 78 + 40 + 11 ^ -" ".length()));
            WeakOrderQueue.llIIIllIllIlll[3] = "  ".length();
            WeakOrderQueue.llIIIllIllIlll[4] = (0x77 ^ 0x68 ^ (0x11 ^ 0x6));
        }
        
        private static String lIIIlIlIlIIIllll(final String llllllllllllIlllIlIIIllllIIIIlII, final String llllllllllllIlllIlIIIllllIIIIlIl) {
            try {
                final SecretKeySpec llllllllllllIlllIlIIIllllIIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIIllllIIIIlIl.getBytes(StandardCharsets.UTF_8)), WeakOrderQueue.llIIIllIllIlll[4]), "DES");
                final Cipher llllllllllllIlllIlIIIllllIIIlIII = Cipher.getInstance("DES");
                llllllllllllIlllIlIIIllllIIIlIII.init(WeakOrderQueue.llIIIllIllIlll[3], llllllllllllIlllIlIIIllllIIIlIIl);
                return new String(llllllllllllIlllIlIIIllllIIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIIllllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIlIIIllllIIIIlll) {
                llllllllllllIlllIlIIIllllIIIIlll.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIIlIlIlIIllllI(final int llllllllllllIlllIlIIIlllIllllIlI, final int llllllllllllIlllIlIIIlllIllllIIl) {
            return llllllllllllIlllIlIIIlllIllllIlI < llllllllllllIlllIlIIIlllIllllIIl;
        }
        
        private static boolean lIIIlIlIlIIllIll(final int llllllllllllIlllIlIIIlllIllIllII, final int llllllllllllIlllIlIIIlllIllIlIll) {
            return llllllllllllIlllIlIIIlllIllIllII != llllllllllllIlllIlIIIlllIllIlIll;
        }
        
        private static boolean lIIIlIlIlIIlllII(final Object llllllllllllIlllIlIIIlllIlllIIIl) {
            return llllllllllllIlllIlIIIlllIlllIIIl == null;
        }
        
        private static final class Link extends AtomicInteger
        {
            private /* synthetic */ Link next;
            private final /* synthetic */ DefaultHandle[] elements;
            private /* synthetic */ int readIndex;
            private static final /* synthetic */ int[] lIIIlIIIllIIII;
            
            private Link() {
                this.elements = new DefaultHandle[Link.lIIIlIIIllIIII[0]];
            }
            
            static {
                lIlllllIlIIlIII();
            }
            
            private static void lIlllllIlIIlIII() {
                (lIIIlIIIllIIII = new int[1])[0] = (0x60 ^ 0x70);
            }
        }
    }
    
    static final class DefaultHandle implements Handle
    {
        private /* synthetic */ Stack<?> stack;
        private /* synthetic */ int lastRecycledId;
        private /* synthetic */ Object value;
        private /* synthetic */ int recycleId;
        
        DefaultHandle(final Stack<?> llllllllllllIllllllIIlIIllIlIIlI) {
            this.stack = llllllllllllIllllllIIlIIllIlIIlI;
        }
        
        private static boolean lIIIIIIIIllIIIlI(final Object llllllllllllIllllllIIlIIlIIlllII) {
            return llllllllllllIllllllIIlIIlIIlllII == null;
        }
        
        public void recycle() {
            final Thread llllllllllllIllllllIIlIIllIIllII = Thread.currentThread();
            if (lIIIIIIIIllIIIIl(llllllllllllIllllllIIlIIllIIllII, this.stack.thread)) {
                this.stack.push(this);
                return;
            }
            final Map<Stack<?>, WeakOrderQueue> llllllllllllIllllllIIlIIllIIlIll = Recycler.DELAYED_RECYCLED.get();
            WeakOrderQueue llllllllllllIllllllIIlIIllIIlIlI = llllllllllllIllllllIIlIIllIIlIll.get(this.stack);
            if (lIIIIIIIIllIIIlI(llllllllllllIllllllIIlIIllIIlIlI)) {
                llllllllllllIllllllIIlIIllIIlIll.put(this.stack, llllllllllllIllllllIIlIIllIIlIlI = new WeakOrderQueue(this.stack, llllllllllllIllllllIIlIIllIIllII));
                "".length();
            }
            llllllllllllIllllllIIlIIllIIlIlI.add(this);
        }
        
        private static boolean lIIIIIIIIllIIIIl(final Object llllllllllllIllllllIIlIIlIIlllll, final Object llllllllllllIllllllIIlIIlIIllllI) {
            return llllllllllllIllllllIIlIIlIIlllll == llllllllllllIllllllIIlIIlIIllllI;
        }
    }
    
    public interface Handle
    {
    }
}
