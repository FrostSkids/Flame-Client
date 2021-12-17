// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal;

import java.security.SecureRandom;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.internal.logging.InternalLogger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Random;

public final class ThreadLocalRandom extends Random
{
    private static final /* synthetic */ AtomicLong seedUniquifier;
    private static final /* synthetic */ int[] lIlllIIlllIIll;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ String[] lIlllIIlllIIlI;
    /* synthetic */ boolean initialized;
    private static volatile /* synthetic */ long initialSeedUniquifier;
    private /* synthetic */ long rnd;
    
    private static int lIIIIIlIIIlIlIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static String lIIIIIlIIIIlllll(final String llllllllllllIlllllIIlIllIIIlIIlI, final String llllllllllllIlllllIIlIllIIIIllll) {
        try {
            final SecretKeySpec llllllllllllIlllllIIlIllIIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIlIllIIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllIIlIllIIIlIlII = Cipher.getInstance("Blowfish");
            llllllllllllIlllllIIlIllIIIlIlII.init(ThreadLocalRandom.lIlllIIlllIIll[2], llllllllllllIlllllIIlIllIIIlIlIl);
            return new String(llllllllllllIlllllIIlIllIIIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIlIllIIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIIlIllIIIlIIll) {
            llllllllllllIlllllIIlIllIIIlIIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void setSeed(final long llllllllllllIlllllIIlIllIllllIlI) {
        if (lIIIIIlIIIlIIllI(this.initialized ? 1 : 0)) {
            throw new UnsupportedOperationException();
        }
        this.rnd = ((llllllllllllIlllllIIlIllIllllIlI ^ 0x5DEECE66DL) & 0xFFFFFFFFFFFFL);
    }
    
    private static boolean lIIIIIlIIIlIlllI(final int llllllllllllIlllllIIlIllIIIIIllI, final int llllllllllllIlllllIIlIllIIIIIlIl) {
        return llllllllllllIlllllIIlIllIIIIIllI < llllllllllllIlllllIIlIllIIIIIlIl;
    }
    
    public long nextLong(long llllllllllllIlllllIIlIllIlIllIll) {
        if (lIIIIIlIIIlIIlII(lIIIIIlIIIlIlIIl(llllllllllllIlllllIIlIllIlIllIll, 0L))) {
            throw new IllegalArgumentException(ThreadLocalRandom.lIlllIIlllIIlI[ThreadLocalRandom.lIlllIIlllIIll[10]]);
        }
        long llllllllllllIlllllIIlIllIlIlllIl = 0L;
        while (lIIIIIlIIIlIlIlI(lIIIIIlIIIlIlIIl(llllllllllllIlllllIIlIllIlIllIll, 2147483647L))) {
            final int llllllllllllIlllllIIlIllIllIIIlI = this.next(ThreadLocalRandom.lIlllIIlllIIll[2]);
            final long llllllllllllIlllllIIlIllIllIIIIl = llllllllllllIlllllIIlIllIlIllIll >>> ThreadLocalRandom.lIlllIIlllIIll[1];
            long n;
            if (lIIIIIlIIIlIIIll(llllllllllllIlllllIIlIllIllIIIlI & ThreadLocalRandom.lIlllIIlllIIll[2])) {
                n = llllllllllllIlllllIIlIllIllIIIIl;
                "".length();
                if (" ".length() <= 0) {
                    return 0L;
                }
            }
            else {
                n = llllllllllllIlllllIIlIllIlIllIll - llllllllllllIlllllIIlIllIllIIIIl;
            }
            final long llllllllllllIlllllIIlIllIllIIIII = n;
            if (lIIIIIlIIIlIIIll(llllllllllllIlllllIIlIllIllIIIlI & ThreadLocalRandom.lIlllIIlllIIll[1])) {
                llllllllllllIlllllIIlIllIlIlllIl += llllllllllllIlllllIIlIllIlIllIll - llllllllllllIlllllIIlIllIllIIIII;
            }
            llllllllllllIlllllIIlIllIlIllIll = llllllllllllIlllllIIlIllIllIIIII;
            "".length();
            if (-(0xC2 ^ 0xC6) >= 0) {
                return 0L;
            }
        }
        return llllllllllllIlllllIIlIllIlIlllIl + this.nextInt((int)llllllllllllIlllllIIlIllIlIllIll);
    }
    
    public static void setInitialSeedUniquifier(final long llllllllllllIlllllIIlIlllIlIIlll) {
        ThreadLocalRandom.initialSeedUniquifier = llllllllllllIlllllIIlIlllIlIIlll;
    }
    
    private static boolean lIIIIIlIIIlIIlII(final int llllllllllllIlllllIIlIlIlllllIll) {
        return llllllllllllIlllllIIlIlIlllllIll <= 0;
    }
    
    ThreadLocalRandom() {
        super(newSeed());
        this.initialized = (ThreadLocalRandom.lIlllIIlllIIll[1] != 0);
    }
    
    private static boolean lIIIIIlIIIlIIllI(final int llllllllllllIlllllIIlIllIIIIIIIl) {
        return llllllllllllIlllllIIlIllIIIIIIIl != 0;
    }
    
    private static int lIIIIIlIIIlIIIlI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static String lIIIIIlIIIIllllI(final String llllllllllllIlllllIIlIllIIIlllll, final String llllllllllllIlllllIIlIllIIIllllI) {
        try {
            final SecretKeySpec llllllllllllIlllllIIlIllIIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIlIllIIIllllI.getBytes(StandardCharsets.UTF_8)), ThreadLocalRandom.lIlllIIlllIIll[13]), "DES");
            final Cipher llllllllllllIlllllIIlIllIIlIIIIl = Cipher.getInstance("DES");
            llllllllllllIlllllIIlIllIIlIIIIl.init(ThreadLocalRandom.lIlllIIlllIIll[2], llllllllllllIlllllIIlIllIIlIIIlI);
            return new String(llllllllllllIlllllIIlIllIIlIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIlIllIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIIlIllIIlIIIII) {
            llllllllllllIlllllIIlIllIIlIIIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIIlIIIlIIIll(final int llllllllllllIlllllIIlIlIllllllll) {
        return llllllllllllIlllllIIlIlIllllllll == 0;
    }
    
    public double nextDouble(final double llllllllllllIlllllIIlIllIlIIIIll, final double llllllllllllIlllllIIlIllIIllllll) {
        if (lIIIIIlIIIlIlIlI(lIIIIIlIIIlIllIl(llllllllllllIlllllIIlIllIlIIIIll, llllllllllllIlllllIIlIllIIllllll))) {
            throw new IllegalArgumentException();
        }
        return this.nextDouble() * (llllllllllllIlllllIIlIllIIllllll - llllllllllllIlllllIIlIllIlIIIIll) + llllllllllllIlllllIIlIllIlIIIIll;
    }
    
    private static long newSeed() {
        final long llllllllllllIlllllIIlIlllIIIIlIl = System.nanoTime();
        do {
            final long llllllllllllIlllllIIlIlllIIIlIII = ThreadLocalRandom.seedUniquifier.get();
            long initialSeedUniquifier;
            if (lIIIIIlIIIlIIllI(lIIIIIlIIIlIIlll(llllllllllllIlllllIIlIlllIIIlIII, 0L))) {
                initialSeedUniquifier = llllllllllllIlllllIIlIlllIIIlIII;
                "".length();
                if (-"   ".length() > 0) {
                    return 0L;
                }
            }
            else {
                initialSeedUniquifier = getInitialSeedUniquifier();
            }
            final long llllllllllllIlllllIIlIlllIIIIlll = initialSeedUniquifier;
            final long llllllllllllIlllllIIlIlllIIIIllI = llllllllllllIlllllIIlIlllIIIIlll * 181783497276652981L;
            if (lIIIIIlIIIlIIllI(ThreadLocalRandom.seedUniquifier.compareAndSet(llllllllllllIlllllIIlIlllIIIlIII, llllllllllllIlllllIIlIlllIIIIllI) ? 1 : 0)) {
                if (lIIIIIlIIIlIIIll(lIIIIIlIIIlIIlll(llllllllllllIlllllIIlIlllIIIlIII, 0L)) && lIIIIIlIIIlIIllI(ThreadLocalRandom.logger.isDebugEnabled() ? 1 : 0)) {
                    final InternalLogger logger = ThreadLocalRandom.logger;
                    final String format = ThreadLocalRandom.lIlllIIlllIIlI[ThreadLocalRandom.lIlllIIlllIIll[8]];
                    final Object[] args = new Object[ThreadLocalRandom.lIlllIIlllIIll[2]];
                    args[ThreadLocalRandom.lIlllIIlllIIll[0]] = llllllllllllIlllllIIlIlllIIIIlll;
                    args[ThreadLocalRandom.lIlllIIlllIIll[1]] = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - llllllllllllIlllllIIlIlllIIIIlIl);
                    logger.debug(String.format(format, args));
                }
                return llllllllllllIlllllIIlIlllIIIIllI ^ System.nanoTime();
            }
            "".length();
        } while (((113 + 67 - 95 + 165 ^ 129 + 66 - 126 + 92) & (24 + 123 - 114 + 203 ^ 32 + 19 + 102 + 30 ^ -" ".length())) != "  ".length());
        return 0L;
    }
    
    private static int lIIIIIlIIIlIllII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static void lIIIIIlIIIlIIIIl() {
        (lIlllIIlllIIll = new int[15])[0] = ((0x45 ^ 0x6E) & ~(0x4E ^ 0x65));
        ThreadLocalRandom.lIlllIIlllIIll[1] = " ".length();
        ThreadLocalRandom.lIlllIIlllIIll[2] = "  ".length();
        ThreadLocalRandom.lIlllIIlllIIll[3] = (0x1C ^ 0x24);
        ThreadLocalRandom.lIlllIIlllIIll[4] = (137 + 89 - 177 + 100 ^ 51 + 154 - 146 + 106);
        ThreadLocalRandom.lIlllIIlllIIll[5] = (0x54 ^ 0x7C);
        ThreadLocalRandom.lIlllIIlllIIll[6] = "   ".length();
        ThreadLocalRandom.lIlllIIlllIIll[7] = (0x24 ^ 0x6A ^ (0x4B ^ 0x25));
        ThreadLocalRandom.lIlllIIlllIIll[8] = (0x9 ^ 0xD);
        ThreadLocalRandom.lIlllIIlllIIll[9] = (71 + 91 - 158 + 150 ^ 56 + 67 - 111 + 118);
        ThreadLocalRandom.lIlllIIlllIIll[10] = (0x67 ^ 0x6D ^ (0xCF ^ 0xC0));
        ThreadLocalRandom.lIlllIIlllIIll[11] = (36 + 77 - 22 + 70 ^ 132 + 71 - 29 + 3);
        ThreadLocalRandom.lIlllIIlllIIll[12] = (99 + 48 - 81 + 93 ^ 39 + 143 - 90 + 61);
        ThreadLocalRandom.lIlllIIlllIIll[13] = (0x5 ^ 0xD);
        ThreadLocalRandom.lIlllIIlllIIll[14] = (0x43 ^ 0x44);
    }
    
    private static int lIIIIIlIIIlIIlll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public double nextDouble(final double llllllllllllIlllllIIlIllIlIIlIlI) {
        if (lIIIIIlIIIlIIlII(lIIIIIlIIIlIllII(llllllllllllIlllllIIlIllIlIIlIlI, 0.0))) {
            throw new IllegalArgumentException(ThreadLocalRandom.lIlllIIlllIIlI[ThreadLocalRandom.lIlllIIlllIIll[12]]);
        }
        return this.nextDouble() * llllllllllllIlllllIIlIllIlIIlIlI;
    }
    
    public int nextInt(final int llllllllllllIlllllIIlIllIllIlIlI, final int llllllllllllIlllllIIlIllIllIlIIl) {
        if (lIIIIIlIIIlIlIII(llllllllllllIlllllIIlIllIllIlIlI, llllllllllllIlllllIIlIllIllIlIIl)) {
            throw new IllegalArgumentException();
        }
        return this.nextInt(llllllllllllIlllllIIlIllIllIlIIl - llllllllllllIlllllIIlIllIllIlIlI) + llllllllllllIlllllIIlIllIllIlIlI;
    }
    
    private static void lIIIIIlIIIlIIIII() {
        (lIlllIIlllIIlI = new String[ThreadLocalRandom.lIlllIIlllIIll[14]])[ThreadLocalRandom.lIlllIIlllIIll[0]] = lIIIIIlIIIIlllIl("GT1lCiEEJjJKLR47Pw0lHAEuASAlPCIVMRk0IgE2", "pRKdD");
        ThreadLocalRandom.lIlllIIlllIIlI[ThreadLocalRandom.lIlllIIlllIIll[1]] = lIIIIIlIIIIllllI("oM5pxTVne86Zu/jj1Ym13fnRbij87uw0xErneHBr4nc=", "zXfrZ");
        ThreadLocalRandom.lIlllIIlllIIlI[ThreadLocalRandom.lIlllIIlllIIll[2]] = lIIIIIlIIIIlllll("NsNUD0X67u0LZhuY8Hyj3Sd/fParO1aqFinwX31lZNODDdXE4r2ShlnOIbkeej1rb4ck4Uo63/exLV3dTZLgNutyoYudCoV6Uso+EJNCdPPy3rBqbW4lHg==", "AObPT");
        ThreadLocalRandom.lIlllIIlllIIlI[ThreadLocalRandom.lIlllIIlllIIll[6]] = lIIIIIlIIIIllllI("2tZWHlEaO4MUFa2C0/p/v4Izba2JujnP+k4twGATWVunPhRzbvu0zIYGZ7DdL1cqJJlFVWtFhzwWGJ0N/in6QFlgtFA7EcNlO98//Gs5SU8=", "QcHSo");
        ThreadLocalRandom.lIlllIIlllIIlI[ThreadLocalRandom.lIlllIIlllIIll[8]] = lIIIIIlIIIIllllI("omYHJV1gskUK4yW/sNlAak0/Ps++zL7CgNCmdGKnE2sBqJ2DunT6MIK+TmOTa5Jvfk4tTM+NHN8=", "AGJlS");
        ThreadLocalRandom.lIlllIIlllIIlI[ThreadLocalRandom.lIlllIIlllIIll[10]] = lIIIIIlIIIIllllI("2CwOeU6RGT36um2Q6R8MRsa3WRPDj02L", "CgSrn");
        ThreadLocalRandom.lIlllIIlllIIlI[ThreadLocalRandom.lIlllIIlllIIll[12]] = lIIIIIlIIIIllllI("L6hw3KuBPUjVRHMGc3WUTuVflx6NfVNz", "QbQFU");
    }
    
    private static boolean lIIIIIlIIIlIlIlI(final int llllllllllllIlllllIIlIlIllllllIl) {
        return llllllllllllIlllllIIlIlIllllllIl >= 0;
    }
    
    private static String lIIIIIlIIIIlllIl(String llllllllllllIlllllIIlIllIIlIllll, final String llllllllllllIlllllIIlIllIIllIIll) {
        llllllllllllIlllllIIlIllIIlIllll = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIlllllIIlIllIIlIllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllIIlIllIIllIIlI = new StringBuilder();
        final char[] llllllllllllIlllllIIlIllIIllIIIl = llllllllllllIlllllIIlIllIIllIIll.toCharArray();
        int llllllllllllIlllllIIlIllIIllIIII = ThreadLocalRandom.lIlllIIlllIIll[0];
        final float llllllllllllIlllllIIlIllIIlIlIlI = (Object)((String)llllllllllllIlllllIIlIllIIlIllll).toCharArray();
        final Exception llllllllllllIlllllIIlIllIIlIlIIl = (Exception)llllllllllllIlllllIIlIllIIlIlIlI.length;
        int llllllllllllIlllllIIlIllIIlIlIII = ThreadLocalRandom.lIlllIIlllIIll[0];
        while (lIIIIIlIIIlIlllI(llllllllllllIlllllIIlIllIIlIlIII, (int)llllllllllllIlllllIIlIllIIlIlIIl)) {
            final char llllllllllllIlllllIIlIllIIllIlIl = llllllllllllIlllllIIlIllIIlIlIlI[llllllllllllIlllllIIlIllIIlIlIII];
            llllllllllllIlllllIIlIllIIllIIlI.append((char)(llllllllllllIlllllIIlIllIIllIlIl ^ llllllllllllIlllllIIlIllIIllIIIl[llllllllllllIlllllIIlIllIIllIIII % llllllllllllIlllllIIlIllIIllIIIl.length]));
            "".length();
            ++llllllllllllIlllllIIlIllIIllIIII;
            ++llllllllllllIlllllIIlIllIIlIlIII;
            "".length();
            if (-" ".length() > " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllIIlIllIIllIIlI);
    }
    
    private static int lIIIIIlIIIlIllIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIIIIIlIIIlIlIII(final int llllllllllllIlllllIIlIllIIIIlIlI, final int llllllllllllIlllllIIlIllIIIIlIIl) {
        return llllllllllllIlllllIIlIllIIIIlIlI >= llllllllllllIlllllIIlIllIIIIlIIl;
    }
    
    @Override
    protected int next(final int llllllllllllIlllllIIlIllIlllIIlI) {
        this.rnd = (this.rnd * 25214903917L + 11L & 0xFFFFFFFFFFFFL);
        return (int)(this.rnd >>> ThreadLocalRandom.lIlllIIlllIIll[4] - llllllllllllIlllllIIlIllIlllIIlI);
    }
    
    public static ThreadLocalRandom current() {
        return InternalThreadLocalMap.get().random();
    }
    
    static {
        lIIIIIlIIIlIIIIl();
        lIIIIIlIIIlIIIII();
        logger = InternalLoggerFactory.getInstance(ThreadLocalRandom.class);
        seedUniquifier = new AtomicLong();
    }
    
    private static int lIIIIIlIIIlIlIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIIIIIlIIIlIIlIl(final Object llllllllllllIlllllIIlIllIIIIIIll) {
        return llllllllllllIlllllIIlIllIIIIIIll != null;
    }
    
    public static synchronized long getInitialSeedUniquifier() {
        long llllllllllllIlllllIIlIlllIIlIlIl = ThreadLocalRandom.initialSeedUniquifier;
        if (lIIIIIlIIIlIIIll(lIIIIIlIIIlIIIlI(llllllllllllIlllllIIlIlllIIlIlIl, 0L))) {
            llllllllllllIlllllIIlIlllIIlIlIl = (ThreadLocalRandom.initialSeedUniquifier = SystemPropertyUtil.getLong(ThreadLocalRandom.lIlllIIlllIIlI[ThreadLocalRandom.lIlllIIlllIIll[0]], 0L));
        }
        if (lIIIIIlIIIlIIIll(lIIIIIlIIIlIIIlI(llllllllllllIlllllIIlIlllIIlIlIl, 0L))) {
            final BlockingQueue<byte[]> llllllllllllIlllllIIlIlllIIllIlI = new LinkedBlockingQueue<byte[]>();
            final Thread llllllllllllIlllllIIlIlllIIllIIl = new Thread(ThreadLocalRandom.lIlllIIlllIIlI[ThreadLocalRandom.lIlllIIlllIIll[1]]) {
                private static final /* synthetic */ int[] lIIIllIIIIIllI;
                
                @Override
                public void run() {
                    final SecureRandom lllllllllllllIlIIIIIllllIllllIll = new SecureRandom();
                    llllllllllllIlllllIIlIlllIIllIlI.add(lllllllllllllIlIIIIIllllIllllIll.generateSeed(ThreadLocalRandom$1.lIIIllIIIIIllI[0]));
                    "".length();
                }
                
                static {
                    llIIIIlIlIIlIIl();
                }
                
                private static void llIIIIlIlIIlIIl() {
                    (lIIIllIIIIIllI = new int[1])[0] = (0x15 ^ 0x1D);
                }
            };
            llllllllllllIlllllIIlIlllIIllIIl.setDaemon((boolean)(ThreadLocalRandom.lIlllIIlllIIll[1] != 0));
            llllllllllllIlllllIIlIlllIIllIIl.start();
            llllllllllllIlllllIIlIlllIIllIIl.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                private static final /* synthetic */ int[] llIIlIIlIlIlIl;
                private static final /* synthetic */ String[] llIIlIIlIlIlII;
                
                private static void lIIIllIIIllIIlll() {
                    (llIIlIIlIlIlIl = new int[3])[0] = ((0x1 ^ 0x45) & ~(0xFB ^ 0xBF));
                    ThreadLocalRandom$2.llIIlIIlIlIlIl[1] = " ".length();
                    ThreadLocalRandom$2.llIIlIIlIlIlIl[2] = "  ".length();
                }
                
                static {
                    lIIIllIIIllIIlll();
                    lIIIllIIIllIIllI();
                }
                
                private static String lIIIllIIIllIIlIl(final String llllllllllllIlllIIlIlIIllIIlIIII, final String llllllllllllIlllIIlIlIIllIIIllll) {
                    try {
                        final SecretKeySpec llllllllllllIlllIIlIlIIllIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlIlIIllIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                        final Cipher llllllllllllIlllIIlIlIIllIIlIlII = Cipher.getInstance("Blowfish");
                        llllllllllllIlllIIlIlIIllIIlIlII.init(ThreadLocalRandom$2.llIIlIIlIlIlIl[2], llllllllllllIlllIIlIlIIllIIlIlIl);
                        return new String(llllllllllllIlllIIlIlIIllIIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlIlIIllIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception llllllllllllIlllIIlIlIIllIIlIIll) {
                        llllllllllllIlllIIlIlIIllIIlIIll.printStackTrace();
                        return null;
                    }
                }
                
                @Override
                public void uncaughtException(final Thread llllllllllllIlllIIlIlIIllIIllIll, final Throwable llllllllllllIlllIIlIlIIllIIlllII) {
                    ThreadLocalRandom.logger.debug(ThreadLocalRandom$2.llIIlIIlIlIlII[ThreadLocalRandom$2.llIIlIIlIlIlIl[0]], llllllllllllIlllIIlIlIIllIIllIll.getName(), llllllllllllIlllIIlIlIIllIIlllII);
                }
                
                private static void lIIIllIIIllIIllI() {
                    (llIIlIIlIlIlII = new String[ThreadLocalRandom$2.llIIlIIlIlIlIl[1]])[ThreadLocalRandom$2.llIIlIIlIlIlIl[0]] = lIIIllIIIllIIlIl("sHPXsU3RTNBLZbveQekhcCW6Z5qKvZiC09Bey6lUnSiec11zKWdyPg==", "WtTXC");
                }
            });
            final long llllllllllllIlllllIIlIlllIIllIII = 3L;
            final long llllllllllllIlllllIIlIlllIIlIlll = System.nanoTime() + TimeUnit.SECONDS.toNanos(3L);
            boolean llllllllllllIlllllIIlIlllIIlIllI = ThreadLocalRandom.lIlllIIlllIIll[0] != 0;
            do {
                final long llllllllllllIlllllIIlIlllIIllIll = llllllllllllIlllllIIlIlllIIlIlll - System.nanoTime();
                Label_0545: {
                    if (!lIIIIIlIIIlIIlII(lIIIIIlIIIlIIIlI(llllllllllllIlllllIIlIlllIIllIll, 0L))) {
                        try {
                            final byte[] llllllllllllIlllllIIlIlllIIlllIl = llllllllllllIlllllIIlIlllIIllIlI.poll(llllllllllllIlllllIIlIlllIIllIll, TimeUnit.NANOSECONDS);
                            if (lIIIIIlIIIlIIlIl(llllllllllllIlllllIIlIlllIIlllIl)) {
                                llllllllllllIlllllIIlIlllIIlIlIl = (((long)llllllllllllIlllllIIlIlllIIlllIl[ThreadLocalRandom.lIlllIIlllIIll[0]] & 0xFFL) << ThreadLocalRandom.lIlllIIlllIIll[3] | ((long)llllllllllllIlllllIIlIlllIIlllIl[ThreadLocalRandom.lIlllIIlllIIll[1]] & 0xFFL) << ThreadLocalRandom.lIlllIIlllIIll[4] | ((long)llllllllllllIlllllIIlIlllIIlllIl[ThreadLocalRandom.lIlllIIlllIIll[2]] & 0xFFL) << ThreadLocalRandom.lIlllIIlllIIll[5] | ((long)llllllllllllIlllllIIlIlllIIlllIl[ThreadLocalRandom.lIlllIIlllIIll[6]] & 0xFFL) << ThreadLocalRandom.lIlllIIlllIIll[7] | ((long)llllllllllllIlllllIIlIlllIIlllIl[ThreadLocalRandom.lIlllIIlllIIll[8]] & 0xFFL) << ThreadLocalRandom.lIlllIIlllIIll[9] | ((long)llllllllllllIlllllIIlIlllIIlllIl[ThreadLocalRandom.lIlllIIlllIIll[10]] & 0xFFL) << ThreadLocalRandom.lIlllIIlllIIll[11] | ((long)llllllllllllIlllllIIlIlllIIlllIl[ThreadLocalRandom.lIlllIIlllIIll[12]] & 0xFFL) << ThreadLocalRandom.lIlllIIlllIIll[13] | ((long)llllllllllllIlllllIIlIlllIIlllIl[ThreadLocalRandom.lIlllIIlllIIll[14]] & 0xFFL));
                                "".length();
                                if (-" ".length() == ((0x40 ^ 0x5D) & ~(0xBD ^ 0xA0))) {
                                    return 0L;
                                }
                                break Label_0545;
                            }
                            else {
                                "".length();
                                if ("   ".length() == ((17 + 199 - 46 + 53 ^ 85 + 55 - 22 + 35) & (0x5 ^ 0x3F ^ (0x42 ^ 0x3E) ^ -" ".length()))) {
                                    return 0L;
                                }
                            }
                        }
                        catch (InterruptedException llllllllllllIlllllIIlIlllIIlllII) {
                            llllllllllllIlllllIIlIlllIIlIllI = (ThreadLocalRandom.lIlllIIlllIIll[1] != 0);
                            ThreadLocalRandom.logger.warn(ThreadLocalRandom.lIlllIIlllIIlI[ThreadLocalRandom.lIlllIIlllIIll[6]]);
                            "".length();
                            if ((0x1 ^ 0x5) != (0x60 ^ 0x64)) {
                                return 0L;
                            }
                            break Label_0545;
                        }
                        "".length();
                        continue;
                    }
                    llllllllllllIlllllIIlIlllIIllIIl.interrupt();
                    ThreadLocalRandom.logger.warn(ThreadLocalRandom.lIlllIIlllIIlI[ThreadLocalRandom.lIlllIIlllIIll[2]], (Object)3L);
                    "".length();
                    if (" ".length() >= "   ".length()) {
                        return 0L;
                    }
                }
                llllllllllllIlllllIIlIlllIIlIlIl ^= 0x3255ECDC33BAE119L;
                llllllllllllIlllllIIlIlllIIlIlIl = (ThreadLocalRandom.initialSeedUniquifier = (llllllllllllIlllllIIlIlllIIlIlIl ^ Long.reverse(System.nanoTime())));
                if (lIIIIIlIIIlIIllI(llllllllllllIlllllIIlIlllIIlIllI ? 1 : 0)) {
                    Thread.currentThread().interrupt();
                    llllllllllllIlllllIIlIlllIIllIIl.interrupt();
                    return llllllllllllIlllllIIlIlllIIlIlIl;
                }
                return llllllllllllIlllllIIlIlllIIlIlIl;
            } while (("  ".length() & ("  ".length() ^ -" ".length())) >= 0);
            return 0L;
        }
        return llllllllllllIlllllIIlIlllIIlIlIl;
    }
    
    public long nextLong(final long llllllllllllIlllllIIlIllIlIlIIlI, final long llllllllllllIlllllIIlIllIlIlIIIl) {
        if (lIIIIIlIIIlIlIlI(lIIIIIlIIIlIlIll(llllllllllllIlllllIIlIllIlIlIIlI, llllllllllllIlllllIIlIllIlIlIIIl))) {
            throw new IllegalArgumentException();
        }
        return this.nextLong(llllllllllllIlllllIIlIllIlIlIIIl - llllllllllllIlllllIIlIllIlIlIIlI) + llllllllllllIlllllIIlIllIlIlIIlI;
    }
}
