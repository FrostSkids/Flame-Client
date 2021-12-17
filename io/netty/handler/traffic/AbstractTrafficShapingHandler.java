// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.traffic;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import io.netty.util.Attribute;
import java.util.concurrent.TimeUnit;
import io.netty.buffer.ByteBufHolder;
import io.netty.buffer.ByteBuf;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.channel.ChannelPromise;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.AttributeKey;
import io.netty.channel.ChannelDuplexHandler;

public abstract class AbstractTrafficShapingHandler extends ChannelDuplexHandler
{
    private /* synthetic */ long writeLimit;
    protected /* synthetic */ long maxTime;
    private static final /* synthetic */ AttributeKey<Runnable> REOPEN_TASK;
    private static final /* synthetic */ AttributeKey<Boolean> READ_SUSPENDED;
    protected /* synthetic */ TrafficCounter trafficCounter;
    private static final /* synthetic */ InternalLogger logger;
    protected /* synthetic */ long checkInterval;
    private static final /* synthetic */ String[] llIllIIIIIIIII;
    private /* synthetic */ long readLimit;
    private static final /* synthetic */ int[] llIllIIIIlIIII;
    
    private static boolean lIIlIllIIlIIIlII(final Object llllllllllllIllIlIIIIlIlIIIlIllI) {
        return llllllllllllIllIlIIIIlIlIIIlIllI != null;
    }
    
    @Override
    public void write(final ChannelHandlerContext llllllllllllIllIlIIIIlIlIllIIlII, final Object llllllllllllIllIlIIIIlIlIllIIIll, final ChannelPromise llllllllllllIllIlIIIIlIlIllIIIlI) throws Exception {
        final long llllllllllllIllIlIIIIlIlIllIIIIl = this.calculateSize(llllllllllllIllIlIIIIlIlIllIIIll);
        if (lIIlIllIIlIIIllI(lIIlIllIIlIIlIlI(llllllllllllIllIlIIIIlIlIllIIIIl, 0L)) && lIIlIllIIlIIIlII(this.trafficCounter)) {
            final long llllllllllllIllIlIIIIlIlIllIIllI = this.trafficCounter.writeTimeToWait(llllllllllllIllIlIIIIlIlIllIIIIl, this.writeLimit, this.maxTime);
            if (lIIlIllIIlIIIlll(lIIlIllIIlIIlIlI(llllllllllllIllIlIIIIlIlIllIIllI, 10L))) {
                if (lIIlIllIIlIIlIII(AbstractTrafficShapingHandler.logger.isDebugEnabled() ? 1 : 0)) {
                    AbstractTrafficShapingHandler.logger.debug(String.valueOf(new StringBuilder().append(AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[8]]).append(llllllllllllIllIlIIIIlIlIllIIlII.channel().hashCode()).append(AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[9]]).append(llllllllllllIllIlIIIIlIlIllIIllI).append(AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[10]]).append(llllllllllllIllIlIIIIlIlIllIIlII.channel().config().isAutoRead()).append(AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[11]]).append(isHandlerActive(llllllllllllIllIlIIIIlIlIllIIlII))));
                }
                this.submitWrite(llllllllllllIllIlIIIIlIlIllIIlII, llllllllllllIllIlIIIIlIlIllIIIll, llllllllllllIllIlIIIIlIlIllIIllI, llllllllllllIllIlIIIIlIlIllIIIlI);
                return;
            }
        }
        this.submitWrite(llllllllllllIllIlIIIIlIlIllIIlII, llllllllllllIllIlIIIIlIlIllIIIll, 0L, llllllllllllIllIlIIIIlIlIllIIIlI);
    }
    
    public TrafficCounter trafficCounter() {
        return this.trafficCounter;
    }
    
    public void setWriteLimit(final long llllllllllllIllIlIIIIlIllIllIIll) {
        this.writeLimit = llllllllllllIllIlIIIIlIllIllIIll;
        if (lIIlIllIIlIIIlII(this.trafficCounter)) {
            this.trafficCounter.resetAccounting(System.currentTimeMillis() + 1L);
        }
    }
    
    public void configure(final long llllllllllllIllIlIIIIlIlllIIIIll, final long llllllllllllIllIlIIIIlIlllIIIlIl) {
        this.writeLimit = llllllllllllIllIlIIIIlIlllIIIIll;
        this.readLimit = llllllllllllIllIlIIIIlIlllIIIlIl;
        if (lIIlIllIIlIIIlII(this.trafficCounter)) {
            this.trafficCounter.resetAccounting(System.currentTimeMillis() + 1L);
        }
    }
    
    private static boolean lIIlIllIIlIIlIIl(final Object llllllllllllIllIlIIIIlIlIIIlIlII) {
        return llllllllllllIllIlIIIIlIlIIIlIlII == null;
    }
    
    private static boolean lIIlIllIIlIIlIll(final int llllllllllllIllIlIIIIlIlIIIllIIl, final int llllllllllllIllIlIIIIlIlIIIllIII) {
        return llllllllllllIllIlIIIIlIlIIIllIIl < llllllllllllIllIlIIIIlIlIIIllIII;
    }
    
    public void configure(final long llllllllllllIllIlIIIIlIlllIlIIIl, final long llllllllllllIllIlIIIIlIlllIIllII, final long llllllllllllIllIlIIIIlIlllIIllll) {
        this.configure(llllllllllllIllIlIIIIlIlllIlIIIl, llllllllllllIllIlIIIIlIlllIIllII);
        this.configure(llllllllllllIllIlIIIIlIlllIIllll);
    }
    
    void setTrafficCounter(final TrafficCounter llllllllllllIllIlIIIIllIIIIIIllI) {
        this.trafficCounter = llllllllllllIllIlIIIIllIIIIIIllI;
    }
    
    public long getReadLimit() {
        return this.readLimit;
    }
    
    private static boolean lIIlIllIIlIIIllI(final int llllllllllllIllIlIIIIlIlIIIIlllI) {
        return llllllllllllIllIlIIIIlIlIIIIlllI > 0;
    }
    
    public void configure(final long llllllllllllIllIlIIIIlIllIllllII) {
        this.checkInterval = llllllllllllIllIlIIIIlIllIllllII;
        if (lIIlIllIIlIIIlII(this.trafficCounter)) {
            this.trafficCounter.configure(this.checkInterval);
        }
    }
    
    protected AbstractTrafficShapingHandler() {
        this(0L, 0L, 1000L, 15000L);
    }
    
    public void setCheckInterval(final long llllllllllllIllIlIIIIlIllIlIIIll) {
        this.checkInterval = llllllllllllIllIlIIIIlIllIlIIIll;
        if (lIIlIllIIlIIIlII(this.trafficCounter)) {
            this.trafficCounter.configure(llllllllllllIllIlIIIIlIllIlIIIll);
        }
    }
    
    private static void lIIlIllIIIlIIIII() {
        (llIllIIIIIIIII = new String[AbstractTrafficShapingHandler.llIllIIIIlIIII[18]])[AbstractTrafficShapingHandler.llIllIIIIlIIII[0]] = lIIlIllIIIIlllII("Bg4RIh8gCko=", "EfpLq");
        AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[1]] = lIIlIllIIIIlllIl("LDhciTHcVUn70uYPwpRpXg==", "QVJJt");
        AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[2]] = lIIlIllIIIIllllI("Z9JO8l7hs7Q=", "nVDVd");
        AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[3]] = lIIlIllIIIIlllIl("WUIF/lPZcjA=", "VcXBz");
        AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[4]] = lIIlIllIIIIlllII("NAAqCTQSBHE=", "whKgZ");
        AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[5]] = lIIlIllIIIIlllII("ZhE3CjUjLCZZIy8sIxVlNTYjDTA1Yn9HZQ==", "FBByE");
        AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[6]] = lIIlIllIIIIlllIl("DjsPXT1KUYQ=", "FdYdM");
        AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[7]] = lIIlIllIIIIlllII("STI/JCFJNzMnPQwrMyxtCDFsaA==", "iEVHM");
        AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[8]] = lIIlIllIIIIlllII("FwwqHTgxCHE=", "TdKsV");
        AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[9]] = lIIlIllIIIIlllIl("z6XU+6IgG9Me9L/r9+DMfSteYUANSZLE", "zNiBg");
        AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[10]] = lIIlIllIIIIllllI("ZKo5N0bRMLo=", "GdJjq");
        AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[11]] = lIIlIllIIIIllllI("R8ANZwkcsPo=", "pOBAV");
        AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[12]] = lIIlIllIIIIlllIl("kqp1gv1TZW8LKXdDYXD5gb91dfrxwOGGIm87uHkeHQzMes+cRF+vGg==", "LdCck");
        AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[13]] = lIIlIllIIIIllllI("bjsyoU7p6k1b4Os8IJI0dA==", "ZutAm");
        AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[14]] = lIIlIllIIIIllllI("elf6dGq0U7OVl6xlJWJ/GQ==", "wXwEG");
        AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[15]] = lIIlIllIIIIllllI("UsF6gusJXGA=", "Hdcva");
        AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[16]] = lIIlIllIIIIlllII("QSM1BRUwIiUXASo/NAEV", "oqpDQ");
        AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[17]] = lIIlIllIIIIllllI("R4rNUUQ03w8WzoeHHCj/Jw==", "dBXSn");
    }
    
    private static boolean lIIlIllIIlIIlIII(final int llllllllllllIllIlIIIIlIlIIIlIIlI) {
        return llllllllllllIllIlIIIIlIlIIIlIIlI != 0;
    }
    
    protected AbstractTrafficShapingHandler(final long llllllllllllIllIlIIIIlIllllllIII, final long llllllllllllIllIlIIIIlIlllllllII, final long llllllllllllIllIlIIIIlIlllllIllI, final long llllllllllllIllIlIIIIlIllllllIlI) {
        this.maxTime = 15000L;
        this.checkInterval = 1000L;
        this.writeLimit = llllllllllllIllIlIIIIlIllllllIII;
        this.readLimit = llllllllllllIllIlIIIIlIlllllllII;
        this.checkInterval = llllllllllllIllIlIIIIlIlllllIllI;
        this.maxTime = llllllllllllIllIlIIIIlIllllllIlI;
    }
    
    private static String lIIlIllIIIIlllII(String llllllllllllIllIlIIIIlIlIIlIIlIl, final String llllllllllllIllIlIIIIlIlIIlIIlII) {
        llllllllllllIllIlIIIIlIlIIlIIlIl = new String(Base64.getDecoder().decode(llllllllllllIllIlIIIIlIlIIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIIIIlIlIIlIlIlI = new StringBuilder();
        final char[] llllllllllllIllIlIIIIlIlIIlIlIII = llllllllllllIllIlIIIIlIlIIlIIlII.toCharArray();
        int llllllllllllIllIlIIIIlIlIIlIIlll = AbstractTrafficShapingHandler.llIllIIIIlIIII[0];
        final Exception llllllllllllIllIlIIIIlIlIIIlllll = (Object)llllllllllllIllIlIIIIlIlIIlIIlIl.toCharArray();
        final Exception llllllllllllIllIlIIIIlIlIIIllllI = (Exception)llllllllllllIllIlIIIIlIlIIIlllll.length;
        int llllllllllllIllIlIIIIlIlIIIlllIl = AbstractTrafficShapingHandler.llIllIIIIlIIII[0];
        while (lIIlIllIIlIIlIll(llllllllllllIllIlIIIIlIlIIIlllIl, (int)llllllllllllIllIlIIIIlIlIIIllllI)) {
            final char llllllllllllIllIlIIIIlIlIIlIllIl = llllllllllllIllIlIIIIlIlIIIlllll[llllllllllllIllIlIIIIlIlIIIlllIl];
            llllllllllllIllIlIIIIlIlIIlIlIlI.append((char)(llllllllllllIllIlIIIIlIlIIlIllIl ^ llllllllllllIllIlIIIIlIlIIlIlIII[llllllllllllIllIlIIIIlIlIIlIIlll % llllllllllllIllIlIIIIlIlIIlIlIII.length]));
            "".length();
            ++llllllllllllIllIlIIIIlIlIIlIIlll;
            ++llllllllllllIllIlIIIIlIlIIIlllIl;
            "".length();
            if (((0x3C ^ 0x8) & ~(0xAE ^ 0x9A)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIIIIlIlIIlIlIlI);
    }
    
    public void setMaxTimeWait(final long llllllllllllIllIlIIIIlIllIIllIIl) {
        this.maxTime = llllllllllllIllIlIIIIlIllIIllIIl;
    }
    
    private static int lIIlIllIIlIIlIlI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public long getCheckInterval() {
        return this.checkInterval;
    }
    
    protected AbstractTrafficShapingHandler(final long llllllllllllIllIlIIIIlIllllIlIll, final long llllllllllllIllIlIIIIlIllllIlllI, final long llllllllllllIllIlIIIIlIllllIlIIl) {
        this(llllllllllllIllIlIIIIlIllllIlIll, llllllllllllIllIlIIIIlIllllIlllI, llllllllllllIllIlIIIIlIllllIlIIl, 15000L);
    }
    
    static {
        lIIlIllIIlIIIIll();
        lIIlIllIIIlIIIII();
        logger = InternalLoggerFactory.getInstance(AbstractTrafficShapingHandler.class);
        READ_SUSPENDED = AttributeKey.valueOf(String.valueOf(new StringBuilder().append(AbstractTrafficShapingHandler.class.getName()).append(AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[16]])));
        REOPEN_TASK = AttributeKey.valueOf(String.valueOf(new StringBuilder().append(AbstractTrafficShapingHandler.class.getName()).append(AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[17]])));
    }
    
    public long getWriteLimit() {
        return this.writeLimit;
    }
    
    @Override
    public void read(final ChannelHandlerContext llllllllllllIllIlIIIIlIlIllIllIl) {
        if (lIIlIllIIlIIlIII(isHandlerActive(llllllllllllIllIlIIIIlIlIllIllIl) ? 1 : 0)) {
            llllllllllllIllIlIIIIlIlIllIllIl.read();
            "".length();
        }
    }
    
    protected long calculateSize(final Object llllllllllllIllIlIIIIlIlIlIlIIlI) {
        if (lIIlIllIIlIIlIII((llllllllllllIllIlIIIIlIlIlIlIIlI instanceof ByteBuf) ? 1 : 0)) {
            return ((ByteBuf)llllllllllllIllIlIIIIlIlIlIlIIlI).readableBytes();
        }
        if (lIIlIllIIlIIlIII((llllllllllllIllIlIIIIlIlIlIlIIlI instanceof ByteBufHolder) ? 1 : 0)) {
            return ((ByteBufHolder)llllllllllllIllIlIIIIlIlIlIlIIlI).content().readableBytes();
        }
        return -1L;
    }
    
    public long getMaxTimeWait() {
        return this.maxTime;
    }
    
    private static int lIIlIllIIlIIIlIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    protected abstract void submitWrite(final ChannelHandlerContext p0, final Object p1, final long p2, final ChannelPromise p3);
    
    public void setReadLimit(final long llllllllllllIllIlIIIIlIllIlIllII) {
        this.readLimit = llllllllllllIllIlIIIIlIllIlIllII;
        if (lIIlIllIIlIIIlII(this.trafficCounter)) {
            this.trafficCounter.resetAccounting(System.currentTimeMillis() + 1L);
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder append = new StringBuilder().append(AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[12]]).append(this.writeLimit).append(AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[13]]).append(this.readLimit).append(AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[14]]);
        String string;
        if (lIIlIllIIlIIIlII(this.trafficCounter)) {
            string = this.trafficCounter.toString();
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        else {
            string = AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[15]];
        }
        return String.valueOf(append.append(string));
    }
    
    @Override
    public void channelRead(final ChannelHandlerContext llllllllllllIllIlIIIIlIlIlllllII, final Object llllllllllllIllIlIIIIlIlIllllIll) throws Exception {
        final long llllllllllllIllIlIIIIlIlIllllllI = this.calculateSize(llllllllllllIllIlIIIIlIlIllllIll);
        if (lIIlIllIIlIIIllI(lIIlIllIIlIIIlIl(llllllllllllIllIlIIIIlIlIllllllI, 0L)) && lIIlIllIIlIIIlII(this.trafficCounter)) {
            final long llllllllllllIllIlIIIIlIllIIIIIlI = this.trafficCounter.readTimeToWait(llllllllllllIllIlIIIIlIlIllllllI, this.readLimit, this.maxTime);
            if (lIIlIllIIlIIIlll(lIIlIllIIlIIIlIl(llllllllllllIllIlIIIIlIllIIIIIlI, 10L))) {
                if (lIIlIllIIlIIlIII(AbstractTrafficShapingHandler.logger.isDebugEnabled() ? 1 : 0)) {
                    AbstractTrafficShapingHandler.logger.debug(String.valueOf(new StringBuilder().append(AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[0]]).append(llllllllllllIllIlIIIIlIlIlllllII.channel().hashCode()).append(AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[1]]).append(llllllllllllIllIlIIIIlIllIIIIIlI).append(AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[2]]).append(llllllllllllIllIlIIIIlIlIlllllII.channel().config().isAutoRead()).append(AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[3]]).append(isHandlerActive(llllllllllllIllIlIIIIlIlIlllllII))));
                }
                if (lIIlIllIIlIIlIII(llllllllllllIllIlIIIIlIlIlllllII.channel().config().isAutoRead() ? 1 : 0) && lIIlIllIIlIIlIII(isHandlerActive(llllllllllllIllIlIIIIlIlIlllllII) ? 1 : 0)) {
                    llllllllllllIllIlIIIIlIlIlllllII.channel().config().setAutoRead((boolean)(AbstractTrafficShapingHandler.llIllIIIIlIIII[0] != 0));
                    "".length();
                    llllllllllllIllIlIIIIlIlIlllllII.attr(AbstractTrafficShapingHandler.READ_SUSPENDED).set((boolean)(AbstractTrafficShapingHandler.llIllIIIIlIIII[1] != 0));
                    final Attribute<Runnable> llllllllllllIllIlIIIIlIllIIIIlII = llllllllllllIllIlIIIIlIlIlllllII.attr(AbstractTrafficShapingHandler.REOPEN_TASK);
                    Runnable llllllllllllIllIlIIIIlIllIIIIIll = llllllllllllIllIlIIIIlIllIIIIlII.get();
                    if (lIIlIllIIlIIlIIl(llllllllllllIllIlIIIIlIllIIIIIll)) {
                        llllllllllllIllIlIIIIlIllIIIIIll = new ReopenReadTimerTask(llllllllllllIllIlIIIIlIlIlllllII);
                        llllllllllllIllIlIIIIlIllIIIIlII.set(llllllllllllIllIlIIIIlIllIIIIIll);
                    }
                    llllllllllllIllIlIIIIlIlIlllllII.executor().schedule(llllllllllllIllIlIIIIlIllIIIIIll, llllllllllllIllIlIIIIlIllIIIIIlI, TimeUnit.MILLISECONDS);
                    "".length();
                    if (lIIlIllIIlIIlIII(AbstractTrafficShapingHandler.logger.isDebugEnabled() ? 1 : 0)) {
                        AbstractTrafficShapingHandler.logger.debug(String.valueOf(new StringBuilder().append(AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[4]]).append(llllllllllllIllIlIIIIlIlIlllllII.channel().hashCode()).append(AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[5]]).append(llllllllllllIllIlIIIIlIlIlllllII.channel().config().isAutoRead()).append(AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[6]]).append(isHandlerActive(llllllllllllIllIlIIIIlIlIlllllII)).append(AbstractTrafficShapingHandler.llIllIIIIIIIII[AbstractTrafficShapingHandler.llIllIIIIlIIII[7]]).append(llllllllllllIllIlIIIIlIllIIIIIlI)));
                    }
                }
            }
        }
        llllllllllllIllIlIIIIlIlIlllllII.fireChannelRead(llllllllllllIllIlIIIIlIlIllllIll);
        "".length();
    }
    
    private static String lIIlIllIIIIllllI(final String llllllllllllIllIlIIIIlIlIIllllII, final String llllllllllllIllIlIIIIlIlIIlllIIl) {
        try {
            final SecretKeySpec llllllllllllIllIlIIIIlIlIIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIIIlIlIIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIIIIlIlIIlllllI = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIIIIlIlIIlllllI.init(AbstractTrafficShapingHandler.llIllIIIIlIIII[2], llllllllllllIllIlIIIIlIlIIllllll);
            return new String(llllllllllllIllIlIIIIlIlIIlllllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIIIlIlIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIIIlIlIIllllIl) {
            llllllllllllIllIlIIIIlIlIIllllIl.printStackTrace();
            return null;
        }
    }
    
    protected void doAccounting(final TrafficCounter llllllllllllIllIlIIIIlIllIIIllII) {
    }
    
    private static boolean lIIlIllIIlIIIlll(final int llllllllllllIllIlIIIIlIlIIIlIIII) {
        return llllllllllllIllIlIIIIlIlIIIlIIII >= 0;
    }
    
    private static void lIIlIllIIlIIIIll() {
        (llIllIIIIlIIII = new int[19])[0] = ((143 + 62 - 54 + 21 ^ 86 + 142 - 175 + 115) & (" ".length() ^ (0xB5 ^ 0xB0) ^ -" ".length()));
        AbstractTrafficShapingHandler.llIllIIIIlIIII[1] = " ".length();
        AbstractTrafficShapingHandler.llIllIIIIlIIII[2] = "  ".length();
        AbstractTrafficShapingHandler.llIllIIIIlIIII[3] = "   ".length();
        AbstractTrafficShapingHandler.llIllIIIIlIIII[4] = (0x60 ^ 0x14 ^ (0xF4 ^ 0x84));
        AbstractTrafficShapingHandler.llIllIIIIlIIII[5] = (0x2D ^ 0x4D ^ (0x7A ^ 0x1F));
        AbstractTrafficShapingHandler.llIllIIIIlIIII[6] = (0x6B ^ 0x6D);
        AbstractTrafficShapingHandler.llIllIIIIlIIII[7] = (89 + 144 - 126 + 68 ^ 7 + 64 - 55 + 152);
        AbstractTrafficShapingHandler.llIllIIIIlIIII[8] = (0xBE ^ 0xB6);
        AbstractTrafficShapingHandler.llIllIIIIlIIII[9] = (0x42 ^ 0x4B);
        AbstractTrafficShapingHandler.llIllIIIIlIIII[10] = (0x5D ^ 0x57);
        AbstractTrafficShapingHandler.llIllIIIIlIIII[11] = (0x6C ^ 0x67);
        AbstractTrafficShapingHandler.llIllIIIIlIIII[12] = (0x40 ^ 0x4C);
        AbstractTrafficShapingHandler.llIllIIIIlIIII[13] = (0x6A ^ 0x67);
        AbstractTrafficShapingHandler.llIllIIIIlIIII[14] = (0x4C ^ 0x42);
        AbstractTrafficShapingHandler.llIllIIIIlIIII[15] = (0x3 ^ 0xC);
        AbstractTrafficShapingHandler.llIllIIIIlIIII[16] = (0x60 ^ 0xA ^ (0xD8 ^ 0xA2));
        AbstractTrafficShapingHandler.llIllIIIIlIIII[17] = (110 + 163 - 168 + 59 ^ 134 + 90 - 101 + 58);
        AbstractTrafficShapingHandler.llIllIIIIlIIII[18] = (0x8 ^ 0x1A);
    }
    
    protected AbstractTrafficShapingHandler(final long llllllllllllIllIlIIIIlIllllIIIIl, final long llllllllllllIllIlIIIIlIllllIIIII) {
        this(llllllllllllIllIlIIIIlIllllIIIIl, llllllllllllIllIlIIIIlIllllIIIII, 1000L, 15000L);
    }
    
    protected AbstractTrafficShapingHandler(final long llllllllllllIllIlIIIIlIlllIllIIl) {
        this(0L, 0L, llllllllllllIllIlIIIIlIlllIllIIl, 15000L);
    }
    
    private static String lIIlIllIIIIlllIl(final String llllllllllllIllIlIIIIlIlIlIIIlll, final String llllllllllllIllIlIIIIlIlIlIIIllI) {
        try {
            final SecretKeySpec llllllllllllIllIlIIIIlIlIlIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIIIlIlIlIIIllI.getBytes(StandardCharsets.UTF_8)), AbstractTrafficShapingHandler.llIllIIIIlIIII[8]), "DES");
            final Cipher llllllllllllIllIlIIIIlIlIlIIlIll = Cipher.getInstance("DES");
            llllllllllllIllIlIIIIlIlIlIIlIll.init(AbstractTrafficShapingHandler.llIllIIIIlIIII[2], llllllllllllIllIlIIIIlIlIlIIllII);
            return new String(llllllllllllIllIlIIIIlIlIlIIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIIIlIlIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIIIlIlIlIIlIlI) {
            llllllllllllIllIlIIIIlIlIlIIlIlI.printStackTrace();
            return null;
        }
    }
    
    protected static boolean isHandlerActive(final ChannelHandlerContext llllllllllllIllIlIIIIlIlIlllIlII) {
        final Boolean llllllllllllIllIlIIIIlIlIlllIIll = llllllllllllIllIlIIIIlIlIlllIlII.attr(AbstractTrafficShapingHandler.READ_SUSPENDED).get();
        int n;
        if (!lIIlIllIIlIIIlII(llllllllllllIllIlIIIIlIlIlllIIll) || lIIlIllIIlIIlIII(Boolean.FALSE.equals(llllllllllllIllIlIIIIlIlIlllIIll) ? 1 : 0)) {
            n = AbstractTrafficShapingHandler.llIllIIIIlIIII[1];
            "".length();
            if (" ".length() <= ((0x20 ^ 0x27) & ~(0x7 ^ 0x0))) {
                return ((0xE7 ^ 0x85) & ~(0xC1 ^ 0xA3)) != 0x0;
            }
        }
        else {
            n = AbstractTrafficShapingHandler.llIllIIIIlIIII[0];
        }
        return n != 0;
    }
    
    private static final class ReopenReadTimerTask implements Runnable
    {
        final /* synthetic */ ChannelHandlerContext ctx;
        private static final /* synthetic */ String[] lIllllIlIIlllI;
        private static final /* synthetic */ int[] lIllllIlIlIIII;
        
        private static String lIIIIlIIIlllIlIl(final String llllllllllllIllllIlIIlIllllIIlll, final String llllllllllllIllllIlIIlIllllIIlII) {
            try {
                final SecretKeySpec llllllllllllIllllIlIIlIllllIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIIlIllllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllllIlIIlIllllIlIIl = Cipher.getInstance("Blowfish");
                llllllllllllIllllIlIIlIllllIlIIl.init(ReopenReadTimerTask.lIllllIlIlIIII[2], llllllllllllIllllIlIIlIllllIlIlI);
                return new String(llllllllllllIllllIlIIlIllllIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIIlIllllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllIlIIlIllllIlIII) {
                llllllllllllIllllIlIIlIllllIlIII.printStackTrace();
                return null;
            }
        }
        
        @Override
        public void run() {
            if (lIIIIlIIIlllllIl(this.ctx.channel().config().isAutoRead() ? 1 : 0) && lIIIIlIIIllllllI(AbstractTrafficShapingHandler.isHandlerActive(this.ctx) ? 1 : 0)) {
                if (lIIIIlIIIllllllI(AbstractTrafficShapingHandler.logger.isDebugEnabled() ? 1 : 0)) {
                    AbstractTrafficShapingHandler.logger.debug(String.valueOf(new StringBuilder().append(ReopenReadTimerTask.lIllllIlIIlllI[ReopenReadTimerTask.lIllllIlIlIIII[0]]).append(this.ctx.channel().hashCode()).append(ReopenReadTimerTask.lIllllIlIIlllI[ReopenReadTimerTask.lIllllIlIlIIII[1]]).append(this.ctx.channel().config().isAutoRead()).append(ReopenReadTimerTask.lIllllIlIIlllI[ReopenReadTimerTask.lIllllIlIlIIII[2]]).append(AbstractTrafficShapingHandler.isHandlerActive(this.ctx))));
                }
                this.ctx.attr(AbstractTrafficShapingHandler.READ_SUSPENDED).set((boolean)(ReopenReadTimerTask.lIllllIlIlIIII[0] != 0));
                "".length();
                if ("   ".length() == (0xAA ^ 0x85 ^ (0x5E ^ 0x75))) {
                    return;
                }
            }
            else {
                if (lIIIIlIIIllllllI(AbstractTrafficShapingHandler.logger.isDebugEnabled() ? 1 : 0)) {
                    if (lIIIIlIIIllllllI(this.ctx.channel().config().isAutoRead() ? 1 : 0) && lIIIIlIIIlllllIl(AbstractTrafficShapingHandler.isHandlerActive(this.ctx) ? 1 : 0)) {
                        AbstractTrafficShapingHandler.logger.debug(String.valueOf(new StringBuilder().append(ReopenReadTimerTask.lIllllIlIIlllI[ReopenReadTimerTask.lIllllIlIlIIII[3]]).append(this.ctx.channel().hashCode()).append(ReopenReadTimerTask.lIllllIlIIlllI[ReopenReadTimerTask.lIllllIlIlIIII[4]]).append(this.ctx.channel().config().isAutoRead()).append(ReopenReadTimerTask.lIllllIlIIlllI[ReopenReadTimerTask.lIllllIlIlIIII[5]]).append(AbstractTrafficShapingHandler.isHandlerActive(this.ctx))));
                        "".length();
                        if (-" ".length() > 0) {
                            return;
                        }
                    }
                    else {
                        AbstractTrafficShapingHandler.logger.debug(String.valueOf(new StringBuilder().append(ReopenReadTimerTask.lIllllIlIIlllI[ReopenReadTimerTask.lIllllIlIlIIII[6]]).append(this.ctx.channel().hashCode()).append(ReopenReadTimerTask.lIllllIlIIlllI[ReopenReadTimerTask.lIllllIlIlIIII[7]]).append(this.ctx.channel().config().isAutoRead()).append(ReopenReadTimerTask.lIllllIlIIlllI[ReopenReadTimerTask.lIllllIlIlIIII[8]]).append(AbstractTrafficShapingHandler.isHandlerActive(this.ctx))));
                    }
                }
                this.ctx.attr(AbstractTrafficShapingHandler.READ_SUSPENDED).set((boolean)(ReopenReadTimerTask.lIllllIlIlIIII[0] != 0));
                this.ctx.channel().config().setAutoRead((boolean)(ReopenReadTimerTask.lIllllIlIlIIII[1] != 0));
                "".length();
                this.ctx.channel().read();
                "".length();
            }
            if (lIIIIlIIIllllllI(AbstractTrafficShapingHandler.logger.isDebugEnabled() ? 1 : 0)) {
                AbstractTrafficShapingHandler.logger.debug(String.valueOf(new StringBuilder().append(ReopenReadTimerTask.lIllllIlIIlllI[ReopenReadTimerTask.lIllllIlIlIIII[9]]).append(this.ctx.channel().hashCode()).append(ReopenReadTimerTask.lIllllIlIIlllI[ReopenReadTimerTask.lIllllIlIlIIII[10]]).append(this.ctx.channel().config().isAutoRead()).append(ReopenReadTimerTask.lIllllIlIIlllI[ReopenReadTimerTask.lIllllIlIlIIII[11]]).append(AbstractTrafficShapingHandler.isHandlerActive(this.ctx))));
            }
        }
        
        private static boolean lIIIIlIIIlllllll(final int llllllllllllIllllIlIIlIlllIlllll, final int llllllllllllIllllIlIIlIlllIllllI) {
            return llllllllllllIllllIlIIlIlllIlllll < llllllllllllIllllIlIIlIlllIllllI;
        }
        
        private static void lIIIIlIIIlllllII() {
            (lIllllIlIlIIII = new int[13])[0] = ((0x20 ^ 0x71) & ~(0x34 ^ 0x65));
            ReopenReadTimerTask.lIllllIlIlIIII[1] = " ".length();
            ReopenReadTimerTask.lIllllIlIlIIII[2] = "  ".length();
            ReopenReadTimerTask.lIllllIlIlIIII[3] = "   ".length();
            ReopenReadTimerTask.lIllllIlIlIIII[4] = (0x32 ^ 0x36);
            ReopenReadTimerTask.lIllllIlIlIIII[5] = (111 + 67 - 170 + 164 ^ 121 + 19 + 10 + 19);
            ReopenReadTimerTask.lIllllIlIlIIII[6] = (0xD ^ 0xB);
            ReopenReadTimerTask.lIllllIlIlIIII[7] = (31 + 146 - 100 + 89 ^ 150 + 92 - 207 + 126);
            ReopenReadTimerTask.lIllllIlIlIIII[8] = (0x6C ^ 0x61 ^ (0xB9 ^ 0xBC));
            ReopenReadTimerTask.lIllllIlIlIIII[9] = (0x38 ^ 0x14 ^ (0x4C ^ 0x69));
            ReopenReadTimerTask.lIllllIlIlIIII[10] = (0x4A ^ 0x66 ^ (0x58 ^ 0x7E));
            ReopenReadTimerTask.lIllllIlIlIIII[11] = (0x41 ^ 0x22 ^ (0x30 ^ 0x58));
            ReopenReadTimerTask.lIllllIlIlIIII[12] = (0x28 ^ 0x24);
        }
        
        private static boolean lIIIIlIIIlllllIl(final int llllllllllllIllllIlIIlIlllIllIlI) {
            return llllllllllllIllllIlIIlIlllIllIlI == 0;
        }
        
        static {
            lIIIIlIIIlllllII();
            lIIIIlIIIlllIlll();
        }
        
        private static boolean lIIIIlIIIllllllI(final int llllllllllllIllllIlIIlIlllIlllII) {
            return llllllllllllIllllIlIIlIlllIlllII != 0;
        }
        
        ReopenReadTimerTask(final ChannelHandlerContext llllllllllllIllllIlIIllIIIIllIIl) {
            this.ctx = llllllllllllIllllIlIIllIIIIllIIl;
        }
        
        private static void lIIIIlIIIlllIlll() {
            (lIllllIlIIlllI = new String[ReopenReadTimerTask.lIllllIlIlIIII[12]])[ReopenReadTimerTask.lIllllIlIlIIII[0]] = lIIIIlIIIlllIlII("MB8OKyMWG1U=", "swoEM");
            ReopenReadTimerTask.lIllllIlIIlllI[ReopenReadTimerTask.lIllllIlIlIIII[1]] = lIIIIlIIIlllIlII("TBw9OmI5PCE7MRw3PCp4TA==", "lRRNB");
            ReopenReadTimerTask.lIllllIlIIlllI[ReopenReadTimerTask.lIllllIlIlIIII[2]] = lIIIIlIIIlllIlII("Yw==", "YXIvp");
            ReopenReadTimerTask.lIllllIlIIlllI[ReopenReadTimerTask.lIllllIlIlIIII[3]] = lIIIIlIIIlllIlIl("bTFSwC1rdNW3aBbCrlDxvg==", "TCkJV");
            ReopenReadTimerTask.lIllllIlIIlllI[ReopenReadTimerTask.lIllllIlIlIIII[4]] = lIIIIlIIIlllIlII("Yw8mPQQwKi0gFXl6", "CZHNq");
            ReopenReadTimerTask.lIllllIlIIlllI[ReopenReadTimerTask.lIllllIlIlIIII[5]] = lIIIIlIIIlllIllI("fBtLw2j0Zfc=", "zHWGE");
            ReopenReadTimerTask.lIllllIlIIlllI[ReopenReadTimerTask.lIllllIlIlIIII[6]] = lIIIIlIIIlllIllI("W4wFlACEpSEGZMzL/E6/ww==", "HlVye");
            ReopenReadTimerTask.lIllllIlIIlllI[ReopenReadTimerTask.lIllllIlIlIIII[7]] = lIIIIlIIIlllIlII("cxsbOggyOVQdCyAgBzgAPTFOaA==", "SUtHe");
            ReopenReadTimerTask.lIllllIlIIlllI[ReopenReadTimerTask.lIllllIlIlIIII[8]] = lIIIIlIIIlllIlII("dA==", "NEuoN");
            ReopenReadTimerTask.lIllllIlIIlllI[ReopenReadTimerTask.lIllllIlIlIIII[9]] = lIIIIlIIIlllIlIl("iIyJAajcMOlchwcT4DnZkQ==", "MCVaf");
            ReopenReadTimerTask.lIllllIlIIlllI[ReopenReadTimerTask.lIllllIlIlIIII[10]] = lIIIIlIIIlllIlIl("V3adrlgjZGuOaB636x67ejkKqm8hn6PQvwjHg9ZVWu4=", "PHdsm");
            ReopenReadTimerTask.lIllllIlIIlllI[ReopenReadTimerTask.lIllllIlIlIIII[11]] = lIIIIlIIIlllIlII("fg==", "DMIYT");
        }
        
        private static String lIIIIlIIIlllIllI(final String llllllllllllIllllIlIIlIlllllIlII, final String llllllllllllIllllIlIIlIlllllIIIl) {
            try {
                final SecretKeySpec llllllllllllIllllIlIIlIlllllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIIlIlllllIIIl.getBytes(StandardCharsets.UTF_8)), ReopenReadTimerTask.lIllllIlIlIIII[8]), "DES");
                final Cipher llllllllllllIllllIlIIlIlllllIllI = Cipher.getInstance("DES");
                llllllllllllIllllIlIIlIlllllIllI.init(ReopenReadTimerTask.lIllllIlIlIIII[2], llllllllllllIllllIlIIlIlllllIlll);
                return new String(llllllllllllIllllIlIIlIlllllIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIIlIlllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllIlIIlIlllllIlIl) {
                llllllllllllIllllIlIIlIlllllIlIl.printStackTrace();
                return null;
            }
        }
        
        private static String lIIIIlIIIlllIlII(String llllllllllllIllllIlIIllIIIIIIlII, final String llllllllllllIllllIlIIllIIIIIIIll) {
            llllllllllllIllllIlIIllIIIIIIlII = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIlIIllIIIIIIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllllIlIIllIIIIIIlll = new StringBuilder();
            final char[] llllllllllllIllllIlIIllIIIIIIllI = llllllllllllIllllIlIIllIIIIIIIll.toCharArray();
            int llllllllllllIllllIlIIllIIIIIIlIl = ReopenReadTimerTask.lIllllIlIlIIII[0];
            final boolean llllllllllllIllllIlIIlIlllllllll = (Object)((String)llllllllllllIllllIlIIllIIIIIIlII).toCharArray();
            final long llllllllllllIllllIlIIlIllllllllI = llllllllllllIllllIlIIlIlllllllll.length;
            Exception llllllllllllIllllIlIIlIlllllllIl = (Exception)ReopenReadTimerTask.lIllllIlIlIIII[0];
            while (lIIIIlIIIlllllll((int)llllllllllllIllllIlIIlIlllllllIl, (int)llllllllllllIllllIlIIlIllllllllI)) {
                final char llllllllllllIllllIlIIllIIIIIlIlI = llllllllllllIllllIlIIlIlllllllll[llllllllllllIllllIlIIlIlllllllIl];
                llllllllllllIllllIlIIllIIIIIIlll.append((char)(llllllllllllIllllIlIIllIIIIIlIlI ^ llllllllllllIllllIlIIllIIIIIIllI[llllllllllllIllllIlIIllIIIIIIlIl % llllllllllllIllllIlIIllIIIIIIllI.length]));
                "".length();
                ++llllllllllllIllllIlIIllIIIIIIlIl;
                ++llllllllllllIllllIlIIlIlllllllIl;
                "".length();
                if ((0x3 ^ 0x7) <= "   ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllllIlIIllIIIIIIlll);
        }
    }
}
