// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.traffic;

import java.util.concurrent.TimeUnit;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import io.netty.util.internal.logging.InternalLogger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.ScheduledFuture;

public class TrafficCounter
{
    private /* synthetic */ long lastNonNullWrittenBytes;
    private volatile /* synthetic */ ScheduledFuture<?> scheduledFuture;
    private static final /* synthetic */ String[] lIIIIlIlIlllll;
    private final /* synthetic */ AbstractTrafficShapingHandler trafficShapingHandler;
    private final /* synthetic */ AtomicLong currentWrittenBytes;
    private final /* synthetic */ AtomicLong cumulativeWrittenBytes;
    private /* synthetic */ long lastNonNullReadTime;
    final /* synthetic */ String name;
    private final /* synthetic */ AtomicLong cumulativeReadBytes;
    private static final /* synthetic */ InternalLogger logger;
    private /* synthetic */ long lastCumulativeTime;
    private /* synthetic */ long lastNonNullReadBytes;
    private /* synthetic */ Runnable monitor;
    private /* synthetic */ long lastWrittenBytes;
    final /* synthetic */ AtomicLong checkInterval;
    private /* synthetic */ long lastNonNullWrittenTime;
    private /* synthetic */ long lastWriteThroughput;
    private /* synthetic */ long lastReadThroughput;
    private final /* synthetic */ AtomicLong lastTime;
    private /* synthetic */ long lastReadBytes;
    final /* synthetic */ AtomicBoolean monitorActive;
    private final /* synthetic */ ScheduledExecutorService executor;
    private final /* synthetic */ AtomicLong currentReadBytes;
    private static final /* synthetic */ int[] lIIIIlIllIIlll;
    
    public long currentReadBytes() {
        return this.currentReadBytes.get();
    }
    
    private static boolean lIlllIlIIlllllI(final int lllllllllllllIlIIlIlIIlIllllIIII) {
        return lllllllllllllIlIIlIlIIlIllllIIII < 0;
    }
    
    private static int lIlllIlIIllIlIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static int lIlllIlIIllllll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public long lastReadBytes() {
        return this.lastReadBytes;
    }
    
    public TrafficCounter(final AbstractTrafficShapingHandler lllllllllllllIlIIlIlIIlllllIIIlI, final ScheduledExecutorService lllllllllllllIlIIlIlIIlllllIIIII, final String lllllllllllllIlIIlIlIIlllllIIlll, final long lllllllllllllIlIIlIlIIlllllIIlIl) {
        this.currentWrittenBytes = new AtomicLong();
        this.currentReadBytes = new AtomicLong();
        this.cumulativeWrittenBytes = new AtomicLong();
        this.cumulativeReadBytes = new AtomicLong();
        this.lastTime = new AtomicLong();
        this.checkInterval = new AtomicLong(1000L);
        this.monitorActive = new AtomicBoolean();
        this.trafficShapingHandler = lllllllllllllIlIIlIlIIlllllIIIlI;
        this.executor = lllllllllllllIlIIlIlIIlllllIIIII;
        this.name = lllllllllllllIlIIlIlIIlllllIIlll;
        this.lastCumulativeTime = System.currentTimeMillis();
        this.configure(lllllllllllllIlIIlIlIIlllllIIlIl);
    }
    
    public long lastReadThroughput() {
        return this.lastReadThroughput;
    }
    
    private static int lIlllIlIIllllIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    static {
        lIlllIlIIllIlII();
        lIlllIlIIlIIlll();
        logger = InternalLoggerFactory.getInstance(TrafficCounter.class);
    }
    
    public synchronized void stop() {
        if (lIlllIlIIlllIII(this.monitorActive.get() ? 1 : 0)) {
            return;
        }
        this.monitorActive.set((boolean)(TrafficCounter.lIIIIlIllIIlll[1] != 0));
        this.resetAccounting(System.currentTimeMillis());
        if (lIlllIlIIlllIIl(this.trafficShapingHandler)) {
            this.trafficShapingHandler.doAccounting(this);
        }
        if (lIlllIlIIlllIIl(this.scheduledFuture)) {
            this.scheduledFuture.cancel((boolean)(TrafficCounter.lIIIIlIllIIlll[0] != 0));
            "".length();
        }
    }
    
    public long cumulativeReadBytes() {
        return this.cumulativeReadBytes.get();
    }
    
    public long lastTime() {
        return this.lastTime.get();
    }
    
    private static boolean lIlllIlIlIIIlII(final int lllllllllllllIlIIlIlIIlIlllllIIl, final int lllllllllllllIlIIlIlIIlIlllllIII) {
        return lllllllllllllIlIIlIlIIlIlllllIIl < lllllllllllllIlIIlIlIIlIlllllIII;
    }
    
    private static int lIlllIlIIlllIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIlllIlIIllIllI(final int lllllllllllllIlIIlIlIIlIllllIlII) {
        return lllllllllllllIlIIlIlIIlIllllIlII != 0;
    }
    
    private static void lIlllIlIIlIIlll() {
        (lIIIIlIlIlllll = new String[TrafficCounter.lIIIIlIllIIlll[27]])[TrafficCounter.lIIIIlIllIIlll[1]] = lIlllIlIIIlIlIl("DxMSME49ExkhCjscFGQAIQRRKwV0UA==", "NpqDn");
        TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[0]] = lIlllIlIIIlIlll("VSHF7YIQF0A=", "bUgdi");
        TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[2]] = lIlllIlIIIlIlIl("RA00DCxE", "dkFcA");
        TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[3]] = lIlllIlIIIlIlIl("LDg7K3RY", "xQVNN");
        TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[4]] = lIlllIlIIIlIlll("tVB7ifU121M=", "odvTd");
        TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[5]] = lIlllIlIIIlIlll("e5wKaQw12vg=", "aMDpQ");
        TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[6]] = lIlllIlIIIlIlll("mwfP7QX8iqg=", "fHXKA");
        TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[7]] = lIlllIlIIIlIlIl("TA==", "vEvCF");
        TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[8]] = lIlllIlIIIlIlIl("bw==", "UDwCn");
        TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[9]] = lIlllIlIIIllIll("LoGpMTpB4QY=", "BfYej");
        TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[10]] = lIlllIlIIIlIlIl("fg==", "DrXEQ");
        TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[11]] = lIlllIlIIIlIlll("GrPDpXMK+ZE=", "iFOEJ");
        TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[12]] = lIlllIlIIIlIlIl("Fh06H3di", "BtWzM");
        TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[13]] = lIlllIlIIIlIlIl("bA==", "VlfnI");
        TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[14]] = lIlllIlIIIllIll("M5fl5inBqYc=", "LEOcd");
        TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[15]] = lIlllIlIIIlIlll("W4mjDI1cInU=", "SCwUX");
        TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[16]] = lIlllIlIIIllIll("9tcNFNLjFM8=", "kNiXe");
        TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[17]] = lIlllIlIIIlIlll("J/0daGFYpNU=", "VfsEc");
        TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[18]] = lIlllIlIIIllIll("+fuYTTV+yJQ=", "cTZER");
        TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[19]] = lIlllIlIIIllIll("xs5wna1lT0Y=", "MRvDs");
        TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[20]] = lIlllIlIIIlIlll("dKrqnHzF4q8=", "jDxqY");
        TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[21]] = lIlllIlIIIlIlll("ATUSqzXqUStKkkhzLvC0nQ==", "GknHL");
        TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[22]] = lIlllIlIIIlIlll("LGynDO6O1KNNI4KLet8pvTXUymxaRh0E", "XToxM");
        TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[23]] = lIlllIlIIIlIlll("N8nVON8kufOncXdG95dLOw==", "ezDFX");
        TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[24]] = lIlllIlIIIlIlll("XWlgQIXljHzAzQ+XfrMrrH+kCzGoju1O", "Oqrso");
        TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[25]] = lIlllIlIIIllIll("YyRVFzwyRR+WxrRua6gt/6yWqZ7IzAFd", "UhPpS");
        TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[26]] = lIlllIlIIIlIlll("9Yz13KxPEqU=", "iuvdE");
    }
    
    private static int lIlllIlIIlllIlI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public long checkInterval() {
        return this.checkInterval.get();
    }
    
    private static boolean lIlllIlIIllllII(final int lllllllllllllIlIIlIlIIlIlllIlllI) {
        return lllllllllllllIlIIlIlIIlIlllIlllI <= 0;
    }
    
    public synchronized long readTimeToWait(final long lllllllllllllIlIIlIlIIllIllIIIll, final long lllllllllllllIlIIlIlIIllIllIlIIl, final long lllllllllllllIlIIlIlIIllIllIIIII) {
        final long lllllllllllllIlIIlIlIIllIllIIlll = System.currentTimeMillis();
        this.bytesRecvFlowControl(lllllllllllllIlIIlIlIIllIllIIIll);
        if (lIlllIlIIlllIII(lIlllIlIIllllIl(lllllllllllllIlIIlIlIIllIllIlIIl, 0L))) {
            return 0L;
        }
        long lllllllllllllIlIIlIlIIllIllIIllI = this.currentReadBytes.get();
        final long lllllllllllllIlIIlIlIIllIllIIlIl = lllllllllllllIlIIlIlIIllIllIIlll - this.lastTime.get();
        if (!lIlllIlIIllIlll(lIlllIlIIllllIl(lllllllllllllIlIIlIlIIllIllIIlIl, 10L)) || !lIlllIlIIllIlll(lIlllIlIIllllIl(lllllllllllllIlIIlIlIIllIllIIllI, 0L))) {
            if (lIlllIlIIllIlll(lIlllIlIIllllIl(this.lastNonNullReadBytes, 0L)) && lIlllIlIIlllllI(lIlllIlIIllllIl(this.lastNonNullReadTime + 10L, lllllllllllllIlIIlIlIIllIllIIlll))) {
                final long lllllllllllllIlIIlIlIIllIlllIIII = lllllllllllllIlIIlIlIIllIllIIllI + this.lastNonNullReadBytes;
                final long lllllllllllllIlIIlIlIIllIllIllll = lllllllllllllIlIIlIlIIllIllIIlll - this.lastNonNullReadTime;
                final long lllllllllllllIlIIlIlIIllIllIlllI = (lllllllllllllIlIIlIlIIllIlllIIII * 1000L / lllllllllllllIlIIlIlIIllIllIlIIl - lllllllllllllIlIIlIlIIllIllIllll) / 10L * 10L;
                if (lIlllIlIIllIlll(lIlllIlIIllllIl(lllllllllllllIlIIlIlIIllIllIlllI, 10L))) {
                    if (lIlllIlIIllIllI(TrafficCounter.logger.isDebugEnabled() ? 1 : 0)) {
                        TrafficCounter.logger.debug(String.valueOf(new StringBuilder().append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[6]]).append(lllllllllllllIlIIlIlIIllIllIlllI).append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[7]]).append(lllllllllllllIlIIlIlIIllIlllIIII).append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[8]]).append(lllllllllllllIlIIlIlIIllIllIllll)));
                    }
                    long n;
                    if (lIlllIlIIllIlll(lIlllIlIIllllIl(lllllllllllllIlIIlIlIIllIllIlllI, lllllllllllllIlIIlIlIIllIllIIIII))) {
                        n = lllllllllllllIlIIlIlIIllIllIIIII;
                        "".length();
                        if (" ".length() >= "   ".length()) {
                            return 0L;
                        }
                    }
                    else {
                        n = lllllllllllllIlIIlIlIIllIllIlllI;
                    }
                    return n;
                }
                "".length();
                if ("  ".length() != "  ".length()) {
                    return 0L;
                }
            }
            else {
                lllllllllllllIlIIlIlIIllIllIIllI += this.lastReadBytes;
                final long lllllllllllllIlIIlIlIIllIllIllIl = 10L;
                final long lllllllllllllIlIIlIlIIllIllIllII = (lllllllllllllIlIIlIlIIllIllIIllI * 1000L / lllllllllllllIlIIlIlIIllIllIlIIl - lllllllllllllIlIIlIlIIllIllIllIl) / 10L * 10L;
                if (lIlllIlIIllIlll(lIlllIlIIllllIl(lllllllllllllIlIIlIlIIllIllIllII, 10L))) {
                    if (lIlllIlIIllIllI(TrafficCounter.logger.isDebugEnabled() ? 1 : 0)) {
                        TrafficCounter.logger.debug(String.valueOf(new StringBuilder().append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[9]]).append(lllllllllllllIlIIlIlIIllIllIllII).append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[10]]).append(lllllllllllllIlIIlIlIIllIllIIllI).append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[11]]).append(lllllllllllllIlIIlIlIIllIllIllIl)));
                    }
                    long n2;
                    if (lIlllIlIIllIlll(lIlllIlIIllllIl(lllllllllllllIlIIlIlIIllIllIllII, lllllllllllllIlIIlIlIIllIllIIIII))) {
                        n2 = lllllllllllllIlIIlIlIIllIllIIIII;
                        "".length();
                        if (((43 + 56 - 94 + 126 ^ 101 + 74 - 8 + 11) & (0xAA ^ 0xAF ^ (0x96 ^ 0xA2) ^ -" ".length())) > "  ".length()) {
                            return 0L;
                        }
                    }
                    else {
                        n2 = lllllllllllllIlIIlIlIIllIllIllII;
                    }
                    return n2;
                }
            }
            return 0L;
        }
        final long lllllllllllllIlIIlIlIIllIlllIIIl = (lllllllllllllIlIIlIlIIllIllIIllI * 1000L / lllllllllllllIlIIlIlIIllIllIlIIl - lllllllllllllIlIIlIlIIllIllIIlIl) / 10L * 10L;
        if (lIlllIlIIllIlll(lIlllIlIIllllIl(lllllllllllllIlIIlIlIIllIlllIIIl, 10L))) {
            if (lIlllIlIIllIllI(TrafficCounter.logger.isDebugEnabled() ? 1 : 0)) {
                TrafficCounter.logger.debug(String.valueOf(new StringBuilder().append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[3]]).append(lllllllllllllIlIIlIlIIllIlllIIIl).append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[4]]).append(lllllllllllllIlIIlIlIIllIllIIllI).append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[5]]).append(lllllllllllllIlIIlIlIIllIllIIlIl)));
            }
            long n3;
            if (lIlllIlIIllIlll(lIlllIlIIllllIl(lllllllllllllIlIIlIlIIllIlllIIIl, lllllllllllllIlIIlIlIIllIllIIIII))) {
                n3 = lllllllllllllIlIIlIlIIllIllIIIII;
                "".length();
                if (null != null) {
                    return 0L;
                }
            }
            else {
                n3 = lllllllllllllIlIIlIlIIllIlllIIIl;
            }
            return n3;
        }
        return 0L;
    }
    
    synchronized void resetAccounting(final long lllllllllllllIlIIlIlIIllllllllIl) {
        final long lllllllllllllIlIIlIlIlIIIIIIIIIl = lllllllllllllIlIIlIlIIllllllllIl - this.lastTime.getAndSet(lllllllllllllIlIIlIlIIllllllllIl);
        if (lIlllIlIIlllIII(lIlllIlIIlllIlI(lllllllllllllIlIIlIlIlIIIIIIIIIl, 0L))) {
            return;
        }
        if (lIlllIlIIllIllI(TrafficCounter.logger.isDebugEnabled() ? 1 : 0) && lIlllIlIIllIlll(lIlllIlIIlllIlI(lllllllllllllIlIIlIlIlIIIIIIIIIl, 2L * this.checkInterval()))) {
            TrafficCounter.logger.debug(String.valueOf(new StringBuilder().append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[1]]).append(lllllllllllllIlIIlIlIlIIIIIIIIIl).append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[0]]).append(this.checkInterval()).append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[2]]).append(this.name)));
        }
        this.lastReadBytes = this.currentReadBytes.getAndSet(0L);
        this.lastWrittenBytes = this.currentWrittenBytes.getAndSet(0L);
        this.lastReadThroughput = this.lastReadBytes / lllllllllllllIlIIlIlIlIIIIIIIIIl * 1000L;
        this.lastWriteThroughput = this.lastWrittenBytes / lllllllllllllIlIIlIlIlIIIIIIIIIl * 1000L;
        if (lIlllIlIIllIlll(lIlllIlIIlllIlI(this.lastWrittenBytes, 0L))) {
            this.lastNonNullWrittenBytes = this.lastWrittenBytes;
            this.lastNonNullWrittenTime = lllllllllllllIlIIlIlIIllllllllIl;
        }
        if (lIlllIlIIllIlll(lIlllIlIIlllIlI(this.lastReadBytes, 0L))) {
            this.lastNonNullReadBytes = this.lastReadBytes;
            this.lastNonNullReadTime = lllllllllllllIlIIlIlIIllllllllIl;
        }
    }
    
    private static boolean lIlllIlIIlllIII(final int lllllllllllllIlIIlIlIIlIllllIIlI) {
        return lllllllllllllIlIIlIlIIlIllllIIlI == 0;
    }
    
    private static String lIlllIlIIIllIll(final String lllllllllllllIlIIlIlIIllIIlIIlII, final String lllllllllllllIlIIlIlIIllIIlIIIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIlIIllIIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIlIIllIIlIIIll.getBytes(StandardCharsets.UTF_8)), TrafficCounter.lIIIIlIllIIlll[8]), "DES");
            final Cipher lllllllllllllIlIIlIlIIllIIlIlIII = Cipher.getInstance("DES");
            lllllllllllllIlIIlIlIIllIIlIlIII.init(TrafficCounter.lIIIIlIllIIlll[2], lllllllllllllIlIIlIlIIllIIlIlIIl);
            return new String(lllllllllllllIlIIlIlIIllIIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIlIIllIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIlIIllIIlIIlll) {
            lllllllllllllIlIIlIlIIllIIlIIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlllIlIIlllIIl(final Object lllllllllllllIlIIlIlIIlIllllIllI) {
        return lllllllllllllIlIIlIlIIlIllllIllI != null;
    }
    
    public void resetCumulativeTime() {
        this.lastCumulativeTime = System.currentTimeMillis();
        this.cumulativeReadBytes.set(0L);
        this.cumulativeWrittenBytes.set(0L);
    }
    
    public long currentWrittenBytes() {
        return this.currentWrittenBytes.get();
    }
    
    public synchronized void start() {
        if (lIlllIlIIllIllI(this.monitorActive.get() ? 1 : 0)) {
            return;
        }
        this.lastTime.set(System.currentTimeMillis());
        if (lIlllIlIIllIlll(lIlllIlIIllIlIl(this.checkInterval.get(), 0L))) {
            this.monitorActive.set((boolean)(TrafficCounter.lIIIIlIllIIlll[0] != 0));
            this.monitor = new TrafficMonitoringTask(this.trafficShapingHandler, this);
            this.scheduledFuture = this.executor.schedule(this.monitor, this.checkInterval.get(), TimeUnit.MILLISECONDS);
        }
    }
    
    void bytesWriteFlowControl(final long lllllllllllllIlIIlIlIIlllIllIIlI) {
        this.currentWrittenBytes.addAndGet(lllllllllllllIlIIlIlIIlllIllIIlI);
        this.cumulativeWrittenBytes.addAndGet(lllllllllllllIlIIlIlIIlllIllIIlI);
    }
    
    public long cumulativeWrittenBytes() {
        return this.cumulativeWrittenBytes.get();
    }
    
    public long lastWrittenBytes() {
        return this.lastWrittenBytes;
    }
    
    public void configure(final long lllllllllllllIlIIlIlIIllllIIllIl) {
        final long lllllllllllllIlIIlIlIIllllIlIIII = lllllllllllllIlIIlIlIIllllIIllIl / 10L * 10L;
        if (lIlllIlIIllIllI(lIlllIlIIlllIll(this.checkInterval.get(), lllllllllllllIlIIlIlIIllllIlIIII))) {
            this.checkInterval.set(lllllllllllllIlIIlIlIIllllIlIIII);
            if (lIlllIlIIllllII(lIlllIlIIlllIll(lllllllllllllIlIIlIlIIllllIlIIII, 0L))) {
                this.stop();
                this.lastTime.set(System.currentTimeMillis());
                "".length();
                if (((0xFA ^ 0xB4) & ~(0x34 ^ 0x7A)) != 0x0) {
                    return;
                }
            }
            else {
                this.start();
            }
        }
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[21]]).append(this.name).append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[22]]).append(this.lastReadThroughput >> TrafficCounter.lIIIIlIllIIlll[10]).append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[23]]).append(this.lastWriteThroughput >> TrafficCounter.lIIIIlIllIIlll[10]).append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[24]]).append(this.currentReadBytes.get() >> TrafficCounter.lIIIIlIllIIlll[10]).append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[25]]).append(this.currentWrittenBytes.get() >> TrafficCounter.lIIIIlIllIIlll[10]).append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[26]]));
    }
    
    private static void lIlllIlIIllIlII() {
        (lIIIIlIllIIlll = new int[28])[0] = " ".length();
        TrafficCounter.lIIIIlIllIIlll[1] = ((0x92 ^ 0xB9) & ~(0x93 ^ 0xB8));
        TrafficCounter.lIIIIlIllIIlll[2] = "  ".length();
        TrafficCounter.lIIIIlIllIIlll[3] = "   ".length();
        TrafficCounter.lIIIIlIllIIlll[4] = (0xBA ^ 0x87 ^ (0xAF ^ 0x96));
        TrafficCounter.lIIIIlIllIIlll[5] = (0x59 ^ 0x28 ^ (0x1B ^ 0x6F));
        TrafficCounter.lIIIIlIllIIlll[6] = ("   ".length() ^ (0x92 ^ 0x97));
        TrafficCounter.lIIIIlIllIIlll[7] = (0x72 ^ 0x7E ^ (0x31 ^ 0x3A));
        TrafficCounter.lIIIIlIllIIlll[8] = (0x64 ^ 0x13 ^ 56 + 55 - 51 + 67);
        TrafficCounter.lIIIIlIllIIlll[9] = (0x5D ^ 0x54);
        TrafficCounter.lIIIIlIllIIlll[10] = (0xB7 ^ 0xBD);
        TrafficCounter.lIIIIlIllIIlll[11] = (0x82 ^ 0xB5 ^ (0x49 ^ 0x75));
        TrafficCounter.lIIIIlIllIIlll[12] = (0xA5 ^ 0xA9);
        TrafficCounter.lIIIIlIllIIlll[13] = (0xCA ^ 0xC7);
        TrafficCounter.lIIIIlIllIIlll[14] = (0x2D ^ 0x1C ^ (0x2E ^ 0x11));
        TrafficCounter.lIIIIlIllIIlll[15] = (159 + 64 - 83 + 39 ^ 34 + 44 + 36 + 74);
        TrafficCounter.lIIIIlIllIIlll[16] = (0x9C ^ 0x8C);
        TrafficCounter.lIIIIlIllIIlll[17] = (0x5A ^ 0x6A ^ (0xAF ^ 0x8E));
        TrafficCounter.lIIIIlIllIIlll[18] = (0xF0 ^ 0xB5 ^ (0xDE ^ 0x89));
        TrafficCounter.lIIIIlIllIIlll[19] = (127 + 82 - 74 + 9 ^ 115 + 78 - 183 + 121);
        TrafficCounter.lIIIIlIllIIlll[20] = (0x6A ^ 0x46 ^ (0x35 ^ 0xD));
        TrafficCounter.lIIIIlIllIIlll[21] = (0x7 ^ 0xE ^ (0x1E ^ 0x2));
        TrafficCounter.lIIIIlIllIIlll[22] = (0x6A ^ 0x7C);
        TrafficCounter.lIIIIlIllIIlll[23] = (0x30 ^ 0x3C ^ (0x3A ^ 0x21));
        TrafficCounter.lIIIIlIllIIlll[24] = (0x12 ^ 0x50 ^ (0x71 ^ 0x2B));
        TrafficCounter.lIIIIlIllIIlll[25] = (0x2B ^ 0x46 ^ (0x78 ^ 0xC));
        TrafficCounter.lIIIIlIllIIlll[26] = (0x98 ^ 0x82);
        TrafficCounter.lIIIIlIllIIlll[27] = (0x58 ^ 0x78 ^ (0x6A ^ 0x51));
    }
    
    private static String lIlllIlIIIlIlIl(String lllllllllllllIlIIlIlIIllIIIlIIIl, final String lllllllllllllIlIIlIlIIllIIIlIIII) {
        lllllllllllllIlIIlIlIIllIIIlIIIl = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIlIlIIllIIIlIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIlIIllIIIlIlII = new StringBuilder();
        final char[] lllllllllllllIlIIlIlIIllIIIlIIll = lllllllllllllIlIIlIlIIllIIIlIIII.toCharArray();
        int lllllllllllllIlIIlIlIIllIIIlIIlI = TrafficCounter.lIIIIlIllIIlll[1];
        final String lllllllllllllIlIIlIlIIllIIIIllII = (Object)((String)lllllllllllllIlIIlIlIIllIIIlIIIl).toCharArray();
        final String lllllllllllllIlIIlIlIIllIIIIlIll = (String)lllllllllllllIlIIlIlIIllIIIIllII.length;
        double lllllllllllllIlIIlIlIIllIIIIlIlI = TrafficCounter.lIIIIlIllIIlll[1];
        while (lIlllIlIlIIIlII((int)lllllllllllllIlIIlIlIIllIIIIlIlI, (int)lllllllllllllIlIIlIlIIllIIIIlIll)) {
            final char lllllllllllllIlIIlIlIIllIIIlIlll = lllllllllllllIlIIlIlIIllIIIIllII[lllllllllllllIlIIlIlIIllIIIIlIlI];
            lllllllllllllIlIIlIlIIllIIIlIlII.append((char)(lllllllllllllIlIIlIlIIllIIIlIlll ^ lllllllllllllIlIIlIlIIllIIIlIIll[lllllllllllllIlIIlIlIIllIIIlIIlI % lllllllllllllIlIIlIlIIllIIIlIIll.length]));
            "".length();
            ++lllllllllllllIlIIlIlIIllIIIlIIlI;
            ++lllllllllllllIlIIlIlIIllIIIIlIlI;
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIlIIllIIIlIlII);
    }
    
    public long lastCumulativeTime() {
        return this.lastCumulativeTime;
    }
    
    public String name() {
        return this.name;
    }
    
    private static boolean lIlllIlIIllIlll(final int lllllllllllllIlIIlIlIIlIlllIllII) {
        return lllllllllllllIlIIlIlIIlIlllIllII > 0;
    }
    
    void bytesRecvFlowControl(final long lllllllllllllIlIIlIlIIllllIIIIll) {
        this.currentReadBytes.addAndGet(lllllllllllllIlIIlIlIIllllIIIIll);
        this.cumulativeReadBytes.addAndGet(lllllllllllllIlIIlIlIIllllIIIIll);
    }
    
    public synchronized long writeTimeToWait(final long lllllllllllllIlIIlIlIIllIlIIlIIl, final long lllllllllllllIlIIlIlIIllIlIIIIII, final long lllllllllllllIlIIlIlIIllIIllllll) {
        this.bytesWriteFlowControl(lllllllllllllIlIIlIlIIllIlIIlIIl);
        if (lIlllIlIIlllIII(lIlllIlIIllllll(lllllllllllllIlIIlIlIIllIlIIIIII, 0L))) {
            return 0L;
        }
        long lllllllllllllIlIIlIlIIllIlIIIllI = this.currentWrittenBytes.get();
        final long lllllllllllllIlIIlIlIIllIlIIIlIl = System.currentTimeMillis();
        final long lllllllllllllIlIIlIlIIllIlIIIlII = lllllllllllllIlIIlIlIIllIlIIIlIl - this.lastTime.get();
        if (!lIlllIlIIllIlll(lIlllIlIIllllll(lllllllllllllIlIIlIlIIllIlIIIlII, 10L)) || !lIlllIlIIllIlll(lIlllIlIIllllll(lllllllllllllIlIIlIlIIllIlIIIllI, 0L))) {
            if (lIlllIlIIllIlll(lIlllIlIIllllll(this.lastNonNullWrittenBytes, 0L)) && lIlllIlIIlllllI(lIlllIlIIllllll(this.lastNonNullWrittenTime + 10L, lllllllllllllIlIIlIlIIllIlIIIlIl))) {
                final long lllllllllllllIlIIlIlIIllIlIIllll = lllllllllllllIlIIlIlIIllIlIIIllI + this.lastNonNullWrittenBytes;
                final long lllllllllllllIlIIlIlIIllIlIIlllI = lllllllllllllIlIIlIlIIllIlIIIlIl - this.lastNonNullWrittenTime;
                final long lllllllllllllIlIIlIlIIllIlIIllIl = (lllllllllllllIlIIlIlIIllIlIIllll * 1000L / lllllllllllllIlIIlIlIIllIlIIIIII - lllllllllllllIlIIlIlIIllIlIIlllI) / 10L * 10L;
                if (lIlllIlIIllIlll(lIlllIlIIllllll(lllllllllllllIlIIlIlIIllIlIIllIl, 10L))) {
                    if (lIlllIlIIllIllI(TrafficCounter.logger.isDebugEnabled() ? 1 : 0)) {
                        TrafficCounter.logger.debug(String.valueOf(new StringBuilder().append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[15]]).append(lllllllllllllIlIIlIlIIllIlIIllIl).append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[16]]).append(lllllllllllllIlIIlIlIIllIlIIllll).append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[17]]).append(lllllllllllllIlIIlIlIIllIlIIlllI)));
                    }
                    long n;
                    if (lIlllIlIIllIlll(lIlllIlIIllllll(lllllllllllllIlIIlIlIIllIlIIllIl, lllllllllllllIlIIlIlIIllIIllllll))) {
                        n = lllllllllllllIlIIlIlIIllIIllllll;
                        "".length();
                        if (-"   ".length() >= 0) {
                            return 0L;
                        }
                    }
                    else {
                        n = lllllllllllllIlIIlIlIIllIlIIllIl;
                    }
                    return n;
                }
                "".length();
                if (-" ".length() > 0) {
                    return 0L;
                }
            }
            else {
                lllllllllllllIlIIlIlIIllIlIIIllI += this.lastWrittenBytes;
                final long lllllllllllllIlIIlIlIIllIlIIllII = 10L + Math.abs(lllllllllllllIlIIlIlIIllIlIIIlII);
                final long lllllllllllllIlIIlIlIIllIlIIlIll = (lllllllllllllIlIIlIlIIllIlIIIllI * 1000L / lllllllllllllIlIIlIlIIllIlIIIIII - lllllllllllllIlIIlIlIIllIlIIllII) / 10L * 10L;
                if (lIlllIlIIllIlll(lIlllIlIIllllll(lllllllllllllIlIIlIlIIllIlIIlIll, 10L))) {
                    if (lIlllIlIIllIllI(TrafficCounter.logger.isDebugEnabled() ? 1 : 0)) {
                        TrafficCounter.logger.debug(String.valueOf(new StringBuilder().append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[18]]).append(lllllllllllllIlIIlIlIIllIlIIlIll).append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[19]]).append(lllllllllllllIlIIlIlIIllIlIIIllI).append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[20]]).append(lllllllllllllIlIIlIlIIllIlIIllII)));
                    }
                    long n2;
                    if (lIlllIlIIllIlll(lIlllIlIIllllll(lllllllllllllIlIIlIlIIllIlIIlIll, lllllllllllllIlIIlIlIIllIIllllll))) {
                        n2 = lllllllllllllIlIIlIlIIllIIllllll;
                        "".length();
                        if (-" ".length() >= 0) {
                            return 0L;
                        }
                    }
                    else {
                        n2 = lllllllllllllIlIIlIlIIllIlIIlIll;
                    }
                    return n2;
                }
            }
            return 0L;
        }
        final long lllllllllllllIlIIlIlIIllIlIlIIII = (lllllllllllllIlIIlIlIIllIlIIIllI * 1000L / lllllllllllllIlIIlIlIIllIlIIIIII - lllllllllllllIlIIlIlIIllIlIIIlII) / 10L * 10L;
        if (lIlllIlIIllIlll(lIlllIlIIllllll(lllllllllllllIlIIlIlIIllIlIlIIII, 10L))) {
            if (lIlllIlIIllIllI(TrafficCounter.logger.isDebugEnabled() ? 1 : 0)) {
                TrafficCounter.logger.debug(String.valueOf(new StringBuilder().append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[12]]).append(lllllllllllllIlIIlIlIIllIlIlIIII).append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[13]]).append(lllllllllllllIlIIlIlIIllIlIIIllI).append(TrafficCounter.lIIIIlIlIlllll[TrafficCounter.lIIIIlIllIIlll[14]]).append(lllllllllllllIlIIlIlIIllIlIIIlII)));
            }
            long n3;
            if (lIlllIlIIllIlll(lIlllIlIIllllll(lllllllllllllIlIIlIlIIllIlIlIIII, lllllllllllllIlIIlIlIIllIIllllll))) {
                n3 = lllllllllllllIlIIlIlIIllIIllllll;
                "".length();
                if ("  ".length() <= ((0x18 ^ 0x52) & ~(0xC8 ^ 0x82))) {
                    return 0L;
                }
            }
            else {
                n3 = lllllllllllllIlIIlIlIIllIlIlIIII;
            }
            return n3;
        }
        return 0L;
    }
    
    public long lastWriteThroughput() {
        return this.lastWriteThroughput;
    }
    
    private static String lIlllIlIIIlIlll(final String lllllllllllllIlIIlIlIIlIllllllll, final String lllllllllllllIlIIlIlIIllIIIIIIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIlIIllIIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIlIIllIIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIlIIllIIIIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIlIIllIIIIIIll.init(TrafficCounter.lIIIIlIllIIlll[2], lllllllllllllIlIIlIlIIllIIIIIlII);
            return new String(lllllllllllllIlIIlIlIIllIIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIlIIlIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIlIIllIIIIIIlI) {
            lllllllllllllIlIIlIlIIllIIIIIIlI.printStackTrace();
            return null;
        }
    }
    
    private static class TrafficMonitoringTask implements Runnable
    {
        private final /* synthetic */ TrafficCounter counter;
        private final /* synthetic */ AbstractTrafficShapingHandler trafficShapingHandler1;
        
        private static boolean lllIIIIIIIIIIll(final Object lllllllllllllIIlIIIlIlIIllIlIIII) {
            return lllllllllllllIIlIIIlIlIIllIlIIII != null;
        }
        
        private static boolean lllIIIIIIIIIIlI(final int lllllllllllllIIlIIIlIlIIllIIlllI) {
            return lllllllllllllIIlIIIlIlIIllIIlllI == 0;
        }
        
        @Override
        public void run() {
            if (lllIIIIIIIIIIlI(this.counter.monitorActive.get() ? 1 : 0)) {
                return;
            }
            final long lllllllllllllIIlIIIlIlIIllIlIlII = System.currentTimeMillis();
            this.counter.resetAccounting(lllllllllllllIIlIIIlIlIIllIlIlII);
            if (lllIIIIIIIIIIll(this.trafficShapingHandler1)) {
                this.trafficShapingHandler1.doAccounting(this.counter);
            }
            this.counter.scheduledFuture = this.counter.executor.schedule(this, this.counter.checkInterval.get(), TimeUnit.MILLISECONDS);
            "".length();
        }
        
        protected TrafficMonitoringTask(final AbstractTrafficShapingHandler lllllllllllllIIlIIIlIlIIllIlllII) {
            this.trafficShapingHandler1 = lllllllllllllIIlIIIlIlIIllIlllII;
        }
    }
}
