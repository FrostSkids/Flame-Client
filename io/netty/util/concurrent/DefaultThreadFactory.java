// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.concurrent;

import java.util.Arrays;
import java.util.Locale;
import io.netty.util.internal.StringUtil;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;

public class DefaultThreadFactory implements ThreadFactory
{
    private final /* synthetic */ boolean daemon;
    private final /* synthetic */ String prefix;
    private static final /* synthetic */ String[] lllIlIIIIlllll;
    private static final /* synthetic */ int[] lllIlIIIlIIIII;
    private final /* synthetic */ AtomicInteger nextId;
    private static final /* synthetic */ AtomicInteger poolId;
    private final /* synthetic */ int priority;
    
    private static boolean lIlIIIIllIIlIllI(final int llllllllllllIlIlllIIlIlllIIllIlI) {
        return llllllllllllIlIlllIIlIlllIIllIlI != 0;
    }
    
    private static boolean lIlIIIIllIIllIII(final int llllllllllllIlIlllIIlIlllIlIIIIl, final int llllllllllllIlIlllIIlIlllIlIIIII) {
        return llllllllllllIlIlllIIlIlllIlIIIIl > llllllllllllIlIlllIIlIlllIlIIIII;
    }
    
    protected Thread newThread(final Runnable llllllllllllIlIlllIIlIlllllIIIIl, final String llllllllllllIlIlllIIlIlllllIIIII) {
        return new FastThreadLocalThread(llllllllllllIlIlllIIlIlllllIIIIl, llllllllllllIlIlllIIlIlllllIIIII);
    }
    
    static {
        lIlIIIIllIIlIlII();
        lIlIIIIllIIlIIll();
        poolId = new AtomicInteger();
    }
    
    public DefaultThreadFactory(final Class<?> llllllllllllIlIlllIIllIIIIIIIlll, final boolean llllllllllllIlIlllIIllIIIIIIlIlI, final int llllllllllllIlIlllIIllIIIIIIlIIl) {
        this(toPoolName(llllllllllllIlIlllIIllIIIIIIIlll), llllllllllllIlIlllIIllIIIIIIlIlI, llllllllllllIlIlllIIllIIIIIIlIIl);
    }
    
    public DefaultThreadFactory(final Class<?> llllllllllllIlIlllIIllIIIIlIllIl, final boolean llllllllllllIlIlllIIllIIIIlIllll) {
        this(llllllllllllIlIlllIIllIIIIlIllIl, llllllllllllIlIlllIIllIIIIlIllll, DefaultThreadFactory.lllIlIIIlIIIII[1]);
    }
    
    private static boolean lIlIIIIllIIllIll(final int llllllllllllIlIlllIIlIlllIlIIlll, final int llllllllllllIlIlllIIlIlllIlIIlIl) {
        return llllllllllllIlIlllIIlIlllIlIIlll < llllllllllllIlIlllIIlIlllIlIIlIl;
    }
    
    private static void lIlIIIIllIIlIlII() {
        (lllIlIIIlIIIII = new int[9])[0] = ((0x2D ^ 0x3F) & ~(0x97 ^ 0x85));
        DefaultThreadFactory.lllIlIIIlIIIII[1] = (0xD5 ^ 0x97 ^ (0x3F ^ 0x78));
        DefaultThreadFactory.lllIlIIIlIIIII[2] = " ".length();
        DefaultThreadFactory.lllIlIIIlIIIII[3] = "  ".length();
        DefaultThreadFactory.lllIlIIIlIIIII[4] = (34 + 10 + 14 + 103 ^ 34 + 48 - 67 + 156);
        DefaultThreadFactory.lllIlIIIlIIIII[5] = "   ".length();
        DefaultThreadFactory.lllIlIIIlIIIII[6] = (122 + 95 - 176 + 96 ^ 72 + 29 + 19 + 21);
        DefaultThreadFactory.lllIlIIIlIIIII[7] = (0x14 ^ 0x39);
        DefaultThreadFactory.lllIlIIIlIIIII[8] = (0xAA ^ 0xA2);
    }
    
    @Override
    public Thread newThread(final Runnable llllllllllllIlIlllIIlIlllllIlIIl) {
        final Thread llllllllllllIlIlllIIlIlllllIlIll = this.newThread(new DefaultRunnableDecorator(llllllllllllIlIlllIIlIlllllIlIIl), String.valueOf(new StringBuilder().append(this.prefix).append(this.nextId.incrementAndGet())));
        try {
            if (lIlIIIIllIIlIllI(llllllllllllIlIlllIIlIlllllIlIll.isDaemon() ? 1 : 0)) {
                if (lIlIIIIllIIllIIl(this.daemon ? 1 : 0)) {
                    llllllllllllIlIlllIIlIlllllIlIll.setDaemon((boolean)(DefaultThreadFactory.lllIlIIIlIIIII[0] != 0));
                    "".length();
                    if ("  ".length() == 0) {
                        return null;
                    }
                }
            }
            else if (lIlIIIIllIIlIllI(this.daemon ? 1 : 0)) {
                llllllllllllIlIlllIIlIlllllIlIll.setDaemon((boolean)(DefaultThreadFactory.lllIlIIIlIIIII[2] != 0));
            }
            if (lIlIIIIllIIllIlI(llllllllllllIlIlllIIlIlllllIlIll.getPriority(), this.priority)) {
                llllllllllllIlIlllIIlIlllllIlIll.setPriority(this.priority);
            }
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        catch (Exception ex) {}
        return llllllllllllIlIlllIIlIlllllIlIll;
    }
    
    public DefaultThreadFactory(final String llllllllllllIlIlllIIllIIIIllIlIl) {
        this(llllllllllllIlIlllIIllIIIIllIlIl, (boolean)(DefaultThreadFactory.lllIlIIIlIIIII[0] != 0), DefaultThreadFactory.lllIlIIIlIIIII[1]);
    }
    
    private static boolean lIlIIIIllIIllIIl(final int llllllllllllIlIlllIIlIlllIIlIllI) {
        return llllllllllllIlIlllIIlIlllIIlIllI == 0;
    }
    
    private static boolean lIlIIIIllIIlIlIl(final Object llllllllllllIlIlllIIlIlllIIllllI) {
        return llllllllllllIlIlllIIlIlllIIllllI == null;
    }
    
    private static String lIlIIIIllIIlIIII(final String llllllllllllIlIlllIIlIllllIllIII, final String llllllllllllIlIlllIIlIllllIlIlIl) {
        try {
            final SecretKeySpec llllllllllllIlIlllIIlIllllIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIIlIllllIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllIIlIllllIllIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllIIlIllllIllIlI.init(DefaultThreadFactory.lllIlIIIlIIIII[3], llllllllllllIlIlllIIlIllllIllIll);
            return new String(llllllllllllIlIlllIIlIllllIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIIlIllllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIIlIllllIllIIl) {
            llllllllllllIlIlllIIlIllllIllIIl.printStackTrace();
            return null;
        }
    }
    
    public DefaultThreadFactory(final String llllllllllllIlIlllIIllIIIIlIIlII, final boolean llllllllllllIlIlllIIllIIIIlIIIll) {
        this(llllllllllllIlIlllIIllIIIIlIIlII, llllllllllllIlIlllIIllIIIIlIIIll, DefaultThreadFactory.lllIlIIIlIIIII[1]);
    }
    
    private static String lIlIIIIllIIlIIIl(String llllllllllllIlIlllIIlIllllIIIIll, final String llllllllllllIlIlllIIlIllllIIIIlI) {
        llllllllllllIlIlllIIlIllllIIIIll = new String(Base64.getDecoder().decode(llllllllllllIlIlllIIlIllllIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllIIlIllllIIIllI = new StringBuilder();
        final char[] llllllllllllIlIlllIIlIllllIIIlIl = llllllllllllIlIlllIIlIllllIIIIlI.toCharArray();
        int llllllllllllIlIlllIIlIllllIIIlII = DefaultThreadFactory.lllIlIIIlIIIII[0];
        final String llllllllllllIlIlllIIlIlllIlllllI = (Object)llllllllllllIlIlllIIlIllllIIIIll.toCharArray();
        final char llllllllllllIlIlllIIlIlllIllllIl = (char)llllllllllllIlIlllIIlIlllIlllllI.length;
        long llllllllllllIlIlllIIlIlllIllllII = DefaultThreadFactory.lllIlIIIlIIIII[0];
        while (lIlIIIIllIIllIll((int)llllllllllllIlIlllIIlIlllIllllII, llllllllllllIlIlllIIlIlllIllllIl)) {
            final char llllllllllllIlIlllIIlIllllIIlIIl = llllllllllllIlIlllIIlIlllIlllllI[llllllllllllIlIlllIIlIlllIllllII];
            llllllllllllIlIlllIIlIllllIIIllI.append((char)(llllllllllllIlIlllIIlIllllIIlIIl ^ llllllllllllIlIlllIIlIllllIIIlIl[llllllllllllIlIlllIIlIllllIIIlII % llllllllllllIlIlllIIlIllllIIIlIl.length]));
            "".length();
            ++llllllllllllIlIlllIIlIllllIIIlII;
            ++llllllllllllIlIlllIIlIlllIllllII;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllIIlIllllIIIllI);
    }
    
    private static boolean lIlIIIIllIIllIlI(final int llllllllllllIlIlllIIlIlllIIlIIII, final int llllllllllllIlIlllIIlIlllIIIlllI) {
        return llllllllllllIlIlllIIlIlllIIlIIII != llllllllllllIlIlllIIlIlllIIIlllI;
    }
    
    private static boolean lIlIIIIllIIlIlll(final int llllllllllllIlIlllIIlIlllIlIlIll, final int llllllllllllIlIlllIIlIlllIlIlIlI) {
        return llllllllllllIlIlllIIlIlllIlIlIll >= llllllllllllIlIlllIIlIlllIlIlIlI;
    }
    
    private static String toPoolName(final Class<?> llllllllllllIlIlllIIllIIIIIIIIII) {
        if (lIlIIIIllIIlIlIl(llllllllllllIlIlllIIllIIIIIIIIII)) {
            throw new NullPointerException(DefaultThreadFactory.lllIlIIIIlllll[DefaultThreadFactory.lllIlIIIlIIIII[0]]);
        }
        final String llllllllllllIlIlllIIllIIIIIIIIIl = StringUtil.simpleClassName(llllllllllllIlIlllIIllIIIIIIIIII);
        switch (llllllllllllIlIlllIIllIIIIIIIIIl.length()) {
            case 0: {
                return DefaultThreadFactory.lllIlIIIIlllll[DefaultThreadFactory.lllIlIIIlIIIII[2]];
            }
            case 1: {
                return llllllllllllIlIlllIIllIIIIIIIIIl.toLowerCase(Locale.US);
            }
            default: {
                if (lIlIIIIllIIlIllI(Character.isUpperCase(llllllllllllIlIlllIIllIIIIIIIIIl.charAt(DefaultThreadFactory.lllIlIIIlIIIII[0])) ? 1 : 0) && lIlIIIIllIIlIllI(Character.isLowerCase(llllllllllllIlIlllIIllIIIIIIIIIl.charAt(DefaultThreadFactory.lllIlIIIlIIIII[2])) ? 1 : 0)) {
                    return String.valueOf(new StringBuilder().append(Character.toLowerCase(llllllllllllIlIlllIIllIIIIIIIIIl.charAt(DefaultThreadFactory.lllIlIIIlIIIII[0]))).append(llllllllllllIlIlllIIllIIIIIIIIIl.substring(DefaultThreadFactory.lllIlIIIlIIIII[2])));
                }
                return llllllllllllIlIlllIIllIIIIIIIIIl;
            }
        }
    }
    
    private static String lIlIIIIllIIlIIlI(final String llllllllllllIlIlllIIlIlllIllIIll, final String llllllllllllIlIlllIIlIlllIllIIII) {
        try {
            final SecretKeySpec llllllllllllIlIlllIIlIlllIllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIIlIlllIllIIII.getBytes(StandardCharsets.UTF_8)), DefaultThreadFactory.lllIlIIIlIIIII[8]), "DES");
            final Cipher llllllllllllIlIlllIIlIlllIllIlIl = Cipher.getInstance("DES");
            llllllllllllIlIlllIIlIlllIllIlIl.init(DefaultThreadFactory.lllIlIIIlIIIII[3], llllllllllllIlIlllIIlIlllIllIllI);
            return new String(llllllllllllIlIlllIIlIlllIllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIIlIlllIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIIlIlllIllIlII) {
            llllllllllllIlIlllIIlIlllIllIlII.printStackTrace();
            return null;
        }
    }
    
    public DefaultThreadFactory(final Class<?> llllllllllllIlIlllIIllIIIIIllllI, final int llllllllllllIlIlllIIllIIIIIllIlI) {
        this(llllllllllllIlIlllIIllIIIIIllllI, (boolean)(DefaultThreadFactory.lllIlIIIlIIIII[0] != 0), llllllllllllIlIlllIIllIIIIIllIlI);
    }
    
    public DefaultThreadFactory(final Class<?> llllllllllllIlIlllIIllIIIIllllIl) {
        this(llllllllllllIlIlllIIllIIIIllllIl, (boolean)(DefaultThreadFactory.lllIlIIIlIIIII[0] != 0), DefaultThreadFactory.lllIlIIIlIIIII[1]);
    }
    
    public DefaultThreadFactory(final String llllllllllllIlIlllIIlIllllllIlIl, final boolean llllllllllllIlIlllIIlIlllllllIII, final int llllllllllllIlIlllIIlIllllllIIll) {
        this.nextId = new AtomicInteger();
        if (lIlIIIIllIIlIlIl(llllllllllllIlIlllIIlIllllllIlIl)) {
            throw new NullPointerException(DefaultThreadFactory.lllIlIIIIlllll[DefaultThreadFactory.lllIlIIIlIIIII[3]]);
        }
        if (!lIlIIIIllIIlIlll(llllllllllllIlIlllIIlIllllllIIll, DefaultThreadFactory.lllIlIIIlIIIII[2]) || lIlIIIIllIIllIII(llllllllllllIlIlllIIlIllllllIIll, DefaultThreadFactory.lllIlIIIlIIIII[4])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(DefaultThreadFactory.lllIlIIIIlllll[DefaultThreadFactory.lllIlIIIlIIIII[5]]).append(llllllllllllIlIlllIIlIllllllIIll).append(DefaultThreadFactory.lllIlIIIIlllll[DefaultThreadFactory.lllIlIIIlIIIII[6]])));
        }
        this.prefix = String.valueOf(new StringBuilder().append(llllllllllllIlIlllIIlIllllllIlIl).append((char)DefaultThreadFactory.lllIlIIIlIIIII[7]).append(DefaultThreadFactory.poolId.incrementAndGet()).append((char)DefaultThreadFactory.lllIlIIIlIIIII[7]));
        this.daemon = llllllllllllIlIlllIIlIlllllllIII;
        this.priority = llllllllllllIlIlllIIlIllllllIIll;
    }
    
    private static void lIlIIIIllIIlIIll() {
        (lllIlIIIIlllll = new String[DefaultThreadFactory.lllIlIIIlIIIII[1]])[DefaultThreadFactory.lllIlIIIlIIIII[0]] = lIlIIIIllIIlIIII("YpnH9gxUgBcQGcneMuATDA==", "OtGUc");
        DefaultThreadFactory.lllIlIIIIlllll[DefaultThreadFactory.lllIlIIIlIIIII[2]] = lIlIIIIllIIlIIIl("BQsCIxUHCw==", "peiMz");
        DefaultThreadFactory.lllIlIIIIlllll[DefaultThreadFactory.lllIlIIIlIIIII[3]] = lIlIIIIllIIlIIII("wSrIaLPKasTqwjL59ttB2A==", "XbPZS");
        DefaultThreadFactory.lllIlIIIIlllll[DefaultThreadFactory.lllIlIIIlIIIII[5]] = lIlIIIIllIIlIIIl("ARAvNTMYFj9gYQ==", "qbFZA");
        DefaultThreadFactory.lllIlIIIIlllll[DefaultThreadFactory.lllIlIIIlIIIII[6]] = lIlIIIIllIIlIIlI("8b+SR+BIc33eLldrPkvdi2TC58FFZX8aCVS3KeFT4NdbPvCza84EsKJ9UPKxkXrKtDqskRGHn7s2heAN6mNsZgfMW5sYe5Jd", "GDCWl");
    }
    
    public DefaultThreadFactory(final String llllllllllllIlIlllIIllIIIIIlIIlI, final int llllllllllllIlIlllIIllIIIIIlIlII) {
        this(llllllllllllIlIlllIIllIIIIIlIIlI, (boolean)(DefaultThreadFactory.lllIlIIIlIIIII[0] != 0), llllllllllllIlIlllIIllIIIIIlIlII);
    }
    
    private static final class DefaultRunnableDecorator implements Runnable
    {
        private final /* synthetic */ Runnable r;
        
        @Override
        public void run() {
            try {
                this.r.run();
                FastThreadLocal.removeAll();
                "".length();
                if (((0x71 ^ 0x7C) & ~(0x10 ^ 0x1D)) > 0) {
                    return;
                }
            }
            finally {
                FastThreadLocal.removeAll();
            }
        }
        
        DefaultRunnableDecorator(final Runnable llllllllllllIlIllIllIIllIllIlIIl) {
            this.r = llllllllllllIlIllIllIIllIllIlIIl;
        }
    }
}
