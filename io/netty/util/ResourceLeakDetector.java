// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util;

import java.util.ArrayDeque;
import java.util.Deque;
import java.lang.ref.PhantomReference;
import java.util.Iterator;
import java.util.EnumSet;
import io.netty.util.internal.SystemPropertyUtil;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.StringUtil;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import io.netty.util.internal.logging.InternalLogger;

public final class ResourceLeakDetector<T>
{
    private static final /* synthetic */ int[] llIIIIIIlIlIIl;
    private /* synthetic */ long active;
    private final /* synthetic */ int samplingInterval;
    private final /* synthetic */ DefaultResourceLeak head;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ String[] llIIIIIIIllIlI;
    private static /* synthetic */ Level level;
    private final /* synthetic */ DefaultResourceLeak tail;
    private static final /* synthetic */ Level DEFAULT_LEVEL;
    private final /* synthetic */ AtomicBoolean loggedTooManyActive;
    private /* synthetic */ long leakCheckCnt;
    private final /* synthetic */ ConcurrentMap<String, Boolean> reportedLeaks;
    private final /* synthetic */ ReferenceQueue<Object> refQueue;
    private static final /* synthetic */ String[] STACK_TRACE_ELEMENT_EXCLUSIONS;
    private final /* synthetic */ long maxActive;
    private final /* synthetic */ String resourceType;
    
    public ResourceLeakDetector(final Class<?> llllllllllllIlllIlllllIllllIlllI, final int llllllllllllIlllIlllllIllllIlIIl, final long llllllllllllIlllIlllllIllllIllII) {
        this(StringUtil.simpleClassName(llllllllllllIlllIlllllIllllIlllI), llllllllllllIlllIlllllIllllIlIIl, llllllllllllIlllIlllllIllllIllII);
    }
    
    public ResourceLeakDetector(final String llllllllllllIlllIlllllIlllIllllI, final int llllllllllllIlllIlllllIlllIlllIl, final long llllllllllllIlllIlllllIllllIIIII) {
        this.head = new DefaultResourceLeak((Object)null);
        this.tail = new DefaultResourceLeak((Object)null);
        this.refQueue = new ReferenceQueue<Object>();
        this.reportedLeaks = PlatformDependent.newConcurrentHashMap();
        this.loggedTooManyActive = new AtomicBoolean();
        if (lIIIIllIlllIIlIl(llllllllllllIlllIlllllIlllIllllI)) {
            throw new NullPointerException(ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[0]]);
        }
        if (lIIIIllIlllIIlll(llllllllllllIlllIlllllIlllIlllIl)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[3]]).append(llllllllllllIlllIlllllIlllIlllIl).append(ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[4]])));
        }
        if (lIIIIllIlllIIlll(lIIIIllIlllIIllI(llllllllllllIlllIlllllIllllIIIII, 0L))) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[5]]).append(llllllllllllIlllIlllllIllllIIIII).append(ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[6]])));
        }
        this.resourceType = llllllllllllIlllIlllllIlllIllllI;
        this.samplingInterval = llllllllllllIlllIlllllIlllIlllIl;
        this.maxActive = llllllllllllIlllIlllllIllllIIIII;
        this.head.next = this.tail;
        "".length();
        this.tail.prev = this.head;
        "".length();
    }
    
    private static boolean lIIIIllIlllIIlIl(final Object llllllllllllIlllIlllllIlIIlllIll) {
        return llllllllllllIlllIlllllIlIIlllIll == null;
    }
    
    public ResourceLeakDetector(final Class<?> llllllllllllIlllIlllllIllllllIlI) {
        this(StringUtil.simpleClassName(llllllllllllIlllIlllllIllllllIlI));
    }
    
    private static String lIIIIllIlIlIIlII(String llllllllllllIlllIlllllIlIlIlIIll, final String llllllllllllIlllIlllllIlIlIlIlll) {
        llllllllllllIlllIlllllIlIlIlIIll = new String(Base64.getDecoder().decode(llllllllllllIlllIlllllIlIlIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlllllIlIlIlIllI = new StringBuilder();
        final char[] llllllllllllIlllIlllllIlIlIlIlIl = llllllllllllIlllIlllllIlIlIlIlll.toCharArray();
        int llllllllllllIlllIlllllIlIlIlIlII = ResourceLeakDetector.llIIIIIIlIlIIl[1];
        final Exception llllllllllllIlllIlllllIlIlIIlllI = (Object)llllllllllllIlllIlllllIlIlIlIIll.toCharArray();
        final String llllllllllllIlllIlllllIlIlIIllIl = (String)llllllllllllIlllIlllllIlIlIIlllI.length;
        int llllllllllllIlllIlllllIlIlIIllII = ResourceLeakDetector.llIIIIIIlIlIIl[1];
        while (lIIIIllIlllIlIlI(llllllllllllIlllIlllllIlIlIIllII, (int)llllllllllllIlllIlllllIlIlIIllIl)) {
            final char llllllllllllIlllIlllllIlIlIllIIl = llllllllllllIlllIlllllIlIlIIlllI[llllllllllllIlllIlllllIlIlIIllII];
            llllllllllllIlllIlllllIlIlIlIllI.append((char)(llllllllllllIlllIlllllIlIlIllIIl ^ llllllllllllIlllIlllllIlIlIlIlIl[llllllllllllIlllIlllllIlIlIlIlII % llllllllllllIlllIlllllIlIlIlIlIl.length]));
            "".length();
            ++llllllllllllIlllIlllllIlIlIlIlII;
            ++llllllllllllIlllIlllllIlIlIIllII;
            "".length();
            if (" ".length() <= -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlllllIlIlIlIllI);
    }
    
    public ResourceLeakDetector(final String llllllllllllIlllIlllllIlllllIlII) {
        this(llllllllllllIlllIlllllIlllllIlII, ResourceLeakDetector.llIIIIIIlIlIIl[2], Long.MAX_VALUE);
    }
    
    private void reportLeak(final Level llllllllllllIlllIlllllIlllIIIllI) {
        if (lIIIIllIlllIlIll(ResourceLeakDetector.logger.isErrorEnabled() ? 1 : 0)) {
            do {
                final DefaultResourceLeak llllllllllllIlllIlllllIlllIIllIl = (DefaultResourceLeak)this.refQueue.poll();
                if (lIIIIllIlllIIlIl(llllllllllllIlllIlllllIlllIIllIl)) {
                    "".length();
                    if (((0xE ^ 0x20) & ~(0x96 ^ 0xB8)) != 0x0) {
                        return;
                    }
                }
                else {
                    llllllllllllIlllIlllllIlllIIllIl.close();
                    "".length();
                    "".length();
                }
            } while (-" ".length() <= "  ".length());
            return;
        }
        int samplingInterval;
        if (lIIIIllIlllIlIIl(llllllllllllIlllIlllllIlllIIIllI, Level.PARANOID)) {
            samplingInterval = ResourceLeakDetector.llIIIIIIlIlIIl[0];
            "".length();
            if (-((" ".length() & ~" ".length()) ^ (0x3F ^ 0x3B)) >= 0) {
                return;
            }
        }
        else {
            samplingInterval = this.samplingInterval;
        }
        final int llllllllllllIlllIlllllIlllIIlIII = samplingInterval;
        if (lIIIIllIlllIllIl(lIIIIllIlllIllII(this.active * llllllllllllIlllIlllllIlllIIlIII, this.maxActive)) && lIIIIllIlllIIIll(this.loggedTooManyActive.compareAndSet((boolean)(ResourceLeakDetector.llIIIIIIlIlIIl[1] != 0), (boolean)(ResourceLeakDetector.llIIIIIIlIlIIl[0] != 0)) ? 1 : 0)) {
            ResourceLeakDetector.logger.error(String.valueOf(new StringBuilder().append(ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[7]]).append(this.resourceType).append(ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[8]]).append(this.resourceType).append(ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[9]]).append(ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[10]])));
        }
        while (true) {
            final DefaultResourceLeak llllllllllllIlllIlllllIlllIIllII = (DefaultResourceLeak)this.refQueue.poll();
            if (lIIIIllIlllIIlIl(llllllllllllIlllIlllllIlllIIllII)) {
                "".length();
                if (" ".length() >= (0x25 ^ 0x21)) {
                    return;
                }
            }
            else {
                llllllllllllIlllIlllllIlllIIllII.clear();
                if (lIIIIllIlllIlIll(llllllllllllIlllIlllllIlllIIllII.close() ? 1 : 0)) {
                    "".length();
                    if ((0xB4 ^ 0xAB ^ (0x23 ^ 0x38)) < ("   ".length() & ("   ".length() ^ -" ".length()))) {
                        return;
                    }
                    continue;
                }
                else {
                    final String llllllllllllIlllIlllllIlllIIlIll = llllllllllllIlllIlllllIlllIIllII.toString();
                    if (lIIIIllIlllIIlIl(this.reportedLeaks.putIfAbsent(llllllllllllIlllIlllllIlllIIlIll, Boolean.TRUE))) {
                        if (lIIIIllIlllIIIll(llllllllllllIlllIlllllIlllIIlIll.isEmpty() ? 1 : 0)) {
                            final InternalLogger logger = ResourceLeakDetector.logger;
                            final String s = ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[11]];
                            final Object[] array = new Object[ResourceLeakDetector.llIIIIIIlIlIIl[5]];
                            array[ResourceLeakDetector.llIIIIIIlIlIIl[1]] = this.resourceType;
                            array[ResourceLeakDetector.llIIIIIIlIlIIl[0]] = ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[12]];
                            array[ResourceLeakDetector.llIIIIIIlIlIIl[3]] = Level.ADVANCED.name().toLowerCase();
                            array[ResourceLeakDetector.llIIIIIIlIlIIl[4]] = StringUtil.simpleClassName(this);
                            logger.error(s, array);
                            "".length();
                            if ("   ".length() != "   ".length()) {
                                return;
                            }
                        }
                        else {
                            ResourceLeakDetector.logger.error(ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[13]], this.resourceType, llllllllllllIlllIlllllIlllIIlIll);
                        }
                    }
                    "".length();
                    if ((0xAF ^ 0xAB) == 0x0) {
                        return;
                    }
                    continue;
                }
            }
        }
    }
    
    private static boolean lIIIIllIlllIIlll(final int llllllllllllIlllIlllllIlIIllIlIl) {
        return llllllllllllIlllIlllllIlIIllIlIl <= 0;
    }
    
    private static int lIIIIllIlllIlIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIIIIllIlllIlIlI(final int llllllllllllIlllIlllllIlIlIIlIII, final int llllllllllllIlllIlllllIlIlIIIlll) {
        return llllllllllllIlllIlllllIlIlIIlIII < llllllllllllIlllIlllllIlIlIIIlll;
    }
    
    private static boolean lIIIIllIlllIIlII(final int llllllllllllIlllIlllllIlIlIIIlII, final int llllllllllllIlllIlllllIlIlIIIIll) {
        return llllllllllllIlllIlllllIlIlIIIlII > llllllllllllIlllIlllllIlIlIIIIll;
    }
    
    private static boolean lIIIIllIlllIllIl(final int llllllllllllIlllIlllllIlIIllIIll) {
        return llllllllllllIlllIlllllIlIIllIIll > 0;
    }
    
    private static void lIIIIllIlIlIIllI() {
        (llIIIIIIIllIlI = new String[ResourceLeakDetector.llIIIIIIlIlIIl[25]])[ResourceLeakDetector.llIIIIIIlIlIIl[1]] = lIIIIllIlIlIIIll("g9UXTxA7Z4E=", "EiOrH");
        ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[0]] = lIIIIllIlIlIIlII("GiknCDoaLzEzNhgp", "hLTgO");
        ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[3]] = lIIIIllIlIlIIIll("zMrc+GXOwTb4qYYfYy4OiQbH8FuacPYE", "GMOHt");
        ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[4]] = lIIIIllIlIlIIlIl("nHMK72iFNNnmwFUmIzZEpw==", "NYoEV");
        ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[5]] = lIIIIllIlIlIIIll("rvyGb6mLJYj+CgZfzWVOyw==", "XPHAf");
        ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[6]] = lIIIIllIlIlIIlII("WEwQHjodBwEDLkJERE1j", "xdufJ");
        ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[7]] = lIIIIllIlIlIIlII("BBcHGnVoCykkbykgI3EsOjcnJSYmNWYlICdyKzAhMXI=", "HRFQO");
        ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[8]] = lIIIIllIlIlIIlII("RT4/FT4EOTIDOUt3cQ==", "eWQfJ");
        ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[9]] = lIIIIllIlIlIIIll("br3wXq/aTSG+ila2CLYTlJGXe80ofltE17eEaXw6zhsKvDTfMmynJ/ttpiootU87SKoYLjDXpHklKjAfp/6rJw==", "vFCEA");
        ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[10]] = lIIIIllIlIlIIIll("gbQQB2Mn+d31wk+HRaF2YaCVlUUVnsCUE6WGTXXhBJz9XsCHdZuArhjglEvpPRbY", "ebbjU");
        ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[11]] = lIIIIllIlIlIIIll("5a2eroi6isS1AWr0UNnW//43hkkQmGCl7npUSqLeTzH59dXaWqEBrZ7uyesYsuVojN3LGtJ56/IMrzTfu3ytM1ggrBunTDhi1GuCWkP1GGMAwM8vI5KQFoyWgSsDCS+mm19OPFmdGG16Wd+rPlAc26bbHc99Rb8dkTgI3orbK6xqEabes3EjdVb+YVs9maJWbMUqubsyz3f6b7O5JazoZH2VDDubPu2mAlSvxVpDOL4DC7oKNkneY7nOgae9+QgO4TdAH6F8yI6dHLs0+6vqtXQSuxn79ya9QRcYgC8B+FE=", "xdRDE");
        ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[12]] = lIIIIllIlIlIIlIl("t/WogbSFPGmgWMeihlP+iRjmbzgX1MFwp8zBy8pA8oA=", "edlZN");
        ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[13]] = lIIIIllIlIlIIlIl("uMKplgYdkXk7fP2FtuT6myFeRpmkrOPJW101T+t2Is4veZFeK8pi0WCGFCeAXskoJ12dYWT7Udcbsw2B/o1q0ADt94h1sEwE", "ujeFq");
        ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[15]] = lIIIIllIlIlIIIll("g5r4B3ik76PIuxWiRPR9Zf/GzI+Khca3Z772XWcdwrE=", "EYllM");
        ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[16]] = lIIIIllIlIlIIlIl("mbsd7BcBcLaiB4nNX+zX4TejejJDRNrSokgfwOCBfzkDWXAjuPZcZQ==", "iYYEQ");
        ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[17]] = lIIIIllIlIlIIlIl("jcxTUFmckJlp2yN5p7258neviTHjsgG6oeOrt+R58+/rOtPxhpOaSw==", "XMwYu");
        ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[18]] = lIIIIllIlIlIIlII("SwoBDUsIKxwWHEggBzAAFSEdEAYDAg0DDiIrHAcGEicHDF9GNRU=", "fNhbe");
        ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[19]] = lIIIIllIlIlIIIll("fiiRpHBbNYaOlmKSRcrRlObOXNzm8H+xNy0URHXCzZvVYci2FBkyzAC1M/6Sy0w6bEb+o5tVfSC53qlDyOVy8xrWVYUXiFeonbcQZa6d53s=", "lFryY");
        ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[20]] = lIIIIllIlIlIIIll("PIad9d2aQeRqM4XjsHyzxUSsFTByG8WnhVWdC5jNRho=", "mdAmp");
        ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[21]] = lIIIIllIlIlIIlII("HRVqKwwADj1rBREbLwEMAB8nMQAbFAggHxEW", "tzDEi");
        ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[22]] = lIIIIllIlIlIIIll("keM6e3DPStWN0t9pHAXtmg==", "EOHNW");
        ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[23]] = lIIIIllIlIlIIIll("lMMMfjdnsvz6WLj95rJ27u8dh9mq3Mbv+1UzRdnX6yU=", "TYGKT");
        ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[24]] = lIIIIllIlIlIIlII("Hx9HBCsCBBBELAMWDw88WDELGToEEQoeDA8EDCg7EDEFBiEVER0FPFgEBiYrFxsoHS8EFSsfKBAVG0I=", "vpijN");
    }
    
    public static void setLevel(final Level llllllllllllIlllIllllllIIIIIIIII) {
        if (lIIIIllIlllIIlIl(llllllllllllIlllIllllllIIIIIIIII)) {
            throw new NullPointerException(ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[1]]);
        }
        ResourceLeakDetector.level = llllllllllllIlllIllllllIIIIIIIII;
    }
    
    private static boolean lIIIIllIlllIlllI(final Object llllllllllllIlllIlllllIlIIllllIl) {
        return llllllllllllIlllIlllllIlIIllllIl != null;
    }
    
    private static boolean lIIIIllIlllIlIIl(final Object llllllllllllIlllIlllllIlIlIIIIII, final Object llllllllllllIlllIlllllIlIIllllll) {
        return llllllllllllIlllIlllllIlIlIIIIII == llllllllllllIlllIlllllIlIIllllll;
    }
    
    static String newRecord(int llllllllllllIlllIlllllIllIlIlIII) {
        final StringBuilder llllllllllllIlllIlllllIllIlIlIlI = new StringBuilder(ResourceLeakDetector.llIIIIIIlIlIIl[14]);
        final StackTraceElement[] llllllllllllIlllIlllllIllIlIlllI;
        final StackTraceElement[] llllllllllllIlllIlllllIllIlIlIIl = llllllllllllIlllIlllllIllIlIlllI = new Throwable().getStackTrace();
        final int llllllllllllIlllIlllllIllIlIllIl = llllllllllllIlllIlllllIllIlIlllI.length;
        int llllllllllllIlllIlllllIllIlIllII = ResourceLeakDetector.llIIIIIIlIlIIl[1];
        while (lIIIIllIlllIlIlI(llllllllllllIlllIlllllIllIlIllII, llllllllllllIlllIlllllIllIlIllIl)) {
            final StackTraceElement llllllllllllIlllIlllllIllIlIllll = llllllllllllIlllIlllllIllIlIlllI[llllllllllllIlllIlllllIllIlIllII];
            if (lIIIIllIlllIllIl(llllllllllllIlllIlllllIllIlIlIII)) {
                --llllllllllllIlllIlllllIllIlIlIII;
                "".length();
                if (-" ".length() > 0) {
                    return null;
                }
            }
            else {
                final String llllllllllllIlllIlllllIllIllIIIl = llllllllllllIlllIlllllIllIlIllll.toString();
                boolean llllllllllllIlllIlllllIllIllIIII = ResourceLeakDetector.llIIIIIIlIlIIl[1] != 0;
                final String[] llllllllllllIlllIlllllIllIllIlII = ResourceLeakDetector.STACK_TRACE_ELEMENT_EXCLUSIONS;
                final int llllllllllllIlllIlllllIllIllIIll = llllllllllllIlllIlllllIllIllIlII.length;
                int llllllllllllIlllIlllllIllIllIIlI = ResourceLeakDetector.llIIIIIIlIlIIl[1];
                while (lIIIIllIlllIlIlI(llllllllllllIlllIlllllIllIllIIlI, llllllllllllIlllIlllllIllIllIIll)) {
                    final String llllllllllllIlllIlllllIllIllIlIl = llllllllllllIlllIlllllIllIllIlII[llllllllllllIlllIlllllIllIllIIlI];
                    if (lIIIIllIlllIIIll(llllllllllllIlllIlllllIllIllIIIl.startsWith(llllllllllllIlllIlllllIllIllIlIl) ? 1 : 0)) {
                        llllllllllllIlllIlllllIllIllIIII = (ResourceLeakDetector.llIIIIIIlIlIIl[0] != 0);
                        "".length();
                        if ("   ".length() == " ".length()) {
                            return null;
                        }
                        break;
                    }
                    else {
                        ++llllllllllllIlllIlllllIllIllIIlI;
                        "".length();
                        if (" ".length() < ((0xBD ^ 0xB6) & ~(0x8B ^ 0x80))) {
                            return null;
                        }
                        continue;
                    }
                }
                if (lIIIIllIlllIlIll(llllllllllllIlllIlllllIllIllIIII ? 1 : 0)) {
                    llllllllllllIlllIlllllIllIlIlIlI.append((char)ResourceLeakDetector.llIIIIIIlIlIIl[10]);
                    "".length();
                    llllllllllllIlllIlllllIllIlIlIlI.append(llllllllllllIlllIlllllIllIllIIIl);
                    "".length();
                    llllllllllllIlllIlllllIllIlIlIlI.append(StringUtil.NEWLINE);
                    "".length();
                }
            }
            ++llllllllllllIlllIlllllIllIlIllII;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlllllIllIlIlIlI);
    }
    
    private static String lIIIIllIlIlIIlIl(final String llllllllllllIlllIlllllIlIllIIllI, final String llllllllllllIlllIlllllIlIllIIlIl) {
        try {
            final SecretKeySpec llllllllllllIlllIlllllIlIllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlllllIlIllIIlIl.getBytes(StandardCharsets.UTF_8)), ResourceLeakDetector.llIIIIIIlIlIIl[9]), "DES");
            final Cipher llllllllllllIlllIlllllIlIllIlIlI = Cipher.getInstance("DES");
            llllllllllllIlllIlllllIlIllIlIlI.init(ResourceLeakDetector.llIIIIIIlIlIIl[3], llllllllllllIlllIlllllIlIllIlIll);
            return new String(llllllllllllIlllIlllllIlIllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlllllIlIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlllllIlIllIlIIl) {
            llllllllllllIlllIlllllIlIllIlIIl.printStackTrace();
            return null;
        }
    }
    
    public ResourceLeak open(final T llllllllllllIlllIlllllIlllIlIlll) {
        final Level llllllllllllIlllIlllllIlllIlIllI = ResourceLeakDetector.level;
        if (lIIIIllIlllIlIIl(llllllllllllIlllIlllllIlllIlIllI, Level.DISABLED)) {
            return null;
        }
        if (!lIIIIllIlllIlIlI(llllllllllllIlllIlllllIlllIlIllI.ordinal(), Level.PARANOID.ordinal())) {
            this.reportLeak(llllllllllllIlllIlllllIlllIlIllI);
            return new DefaultResourceLeak(llllllllllllIlllIlllllIlllIlIlll);
        }
        if (lIIIIllIlllIlIll(lIIIIllIlllIlIII(this.leakCheckCnt++ % this.samplingInterval, 0L))) {
            this.reportLeak(llllllllllllIlllIlllllIlllIlIllI);
            return new DefaultResourceLeak(llllllllllllIlllIlllllIlllIlIlll);
        }
        return null;
    }
    
    private static boolean lIIIIllIlllIIIll(final int llllllllllllIlllIlllllIlIIlllIIl) {
        return llllllllllllIlllIlllllIlIIlllIIl != 0;
    }
    
    private static int lIIIIllIlllIllII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static void lIIIIllIlllIIIlI() {
        (llIIIIIIlIlIIl = new int[26])[0] = " ".length();
        ResourceLeakDetector.llIIIIIIlIlIIl[1] = ((0xFB ^ 0xA6) & ~(0xF9 ^ 0xA4));
        ResourceLeakDetector.llIIIIIIlIlIIl[2] = (0x7A ^ 0xB);
        ResourceLeakDetector.llIIIIIIlIlIIl[3] = "  ".length();
        ResourceLeakDetector.llIIIIIIlIlIIl[4] = "   ".length();
        ResourceLeakDetector.llIIIIIIlIlIIl[5] = (27 + 64 - 5 + 110 ^ 2 + 173 - 103 + 120);
        ResourceLeakDetector.llIIIIIIlIlIIl[6] = (0x75 ^ 0x70);
        ResourceLeakDetector.llIIIIIIlIlIIl[7] = (0x11 ^ 0x17);
        ResourceLeakDetector.llIIIIIIlIlIIl[8] = (0x60 ^ 0x67);
        ResourceLeakDetector.llIIIIIIlIlIIl[9] = (72 + 131 - 141 + 70 ^ 88 + 118 - 89 + 23);
        ResourceLeakDetector.llIIIIIIlIlIIl[10] = (0x1F ^ 0x16);
        ResourceLeakDetector.llIIIIIIlIlIIl[11] = (0x70 ^ 0x7A);
        ResourceLeakDetector.llIIIIIIlIlIIl[12] = (0x1E ^ 0x15);
        ResourceLeakDetector.llIIIIIIlIlIIl[13] = (0x2 ^ 0xE);
        ResourceLeakDetector.llIIIIIIlIlIIl[14] = (-(0xFFFFD79F & 0x2F6F) & (0xFFFFB71E & 0x5FEF));
        ResourceLeakDetector.llIIIIIIlIlIIl[15] = (0x5E ^ 0x53);
        ResourceLeakDetector.llIIIIIIlIlIIl[16] = (0x33 ^ 0x9 ^ (0x27 ^ 0x13));
        ResourceLeakDetector.llIIIIIIlIlIIl[17] = (123 + 67 - 76 + 48 ^ 32 + 44 - 10 + 107);
        ResourceLeakDetector.llIIIIIIlIlIIl[18] = (0x2C ^ 0x3C);
        ResourceLeakDetector.llIIIIIIlIlIIl[19] = (0x46 ^ 0x57);
        ResourceLeakDetector.llIIIIIIlIlIIl[20] = (0x12 ^ 0x0);
        ResourceLeakDetector.llIIIIIIlIlIIl[21] = (0xBD ^ 0xAE);
        ResourceLeakDetector.llIIIIIIlIlIIl[22] = (0x60 ^ 0x74);
        ResourceLeakDetector.llIIIIIIlIlIIl[23] = (0x80 ^ 0x95);
        ResourceLeakDetector.llIIIIIIlIlIIl[24] = (0x52 ^ 0x44);
        ResourceLeakDetector.llIIIIIIlIlIIl[25] = (47 + 58 + 66 + 1 ^ 145 + 50 - 22 + 14);
    }
    
    static {
        lIIIIllIlllIIIlI();
        lIIIIllIlIlIIllI();
        PROP_LEVEL = ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[15]];
        DEFAULT_SAMPLING_INTERVAL = ResourceLeakDetector.llIIIIIIlIlIIl[2];
        DEFAULT_LEVEL = Level.SIMPLE;
        logger = InternalLoggerFactory.getInstance(ResourceLeakDetector.class);
        boolean llllllllllllIlllIlllllIllIIIIllI = false;
        if (lIIIIllIlllIlllI(SystemPropertyUtil.get(ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[16]]))) {
            final boolean llllllllllllIlllIlllllIllIIIlIIl = SystemPropertyUtil.getBoolean(ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[17]], (boolean)(ResourceLeakDetector.llIIIIIIlIlIIl[1] != 0));
            ResourceLeakDetector.logger.debug(ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[18]], (Object)llllllllllllIlllIlllllIllIIIlIIl);
            ResourceLeakDetector.logger.warn(ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[19]], ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[20]], ResourceLeakDetector.DEFAULT_LEVEL.name().toLowerCase());
            "".length();
            if ((0x10 ^ 0x14) < "  ".length()) {
                return;
            }
        }
        else {
            llllllllllllIlllIlllllIllIIIIllI = (ResourceLeakDetector.llIIIIIIlIlIIl[1] != 0);
        }
        Level level;
        if (lIIIIllIlllIIIll(llllllllllllIlllIlllllIllIIIIllI ? 1 : 0)) {
            level = Level.DISABLED;
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else {
            level = ResourceLeakDetector.DEFAULT_LEVEL;
        }
        final Level llllllllllllIlllIlllllIllIIIIlIl = level;
        final String llllllllllllIlllIlllllIllIIIIlII = SystemPropertyUtil.get(ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[21]], llllllllllllIlllIlllllIllIIIIlIl.name()).trim().toUpperCase();
        Level llllllllllllIlllIlllllIllIIIIIll = ResourceLeakDetector.DEFAULT_LEVEL;
        final Iterator llllllllllllIlllIlllllIllIIIIlll = EnumSet.allOf(Level.class).iterator();
        while (lIIIIllIlllIIIll(llllllllllllIlllIlllllIllIIIIlll.hasNext() ? 1 : 0)) {
            final Level llllllllllllIlllIlllllIllIIIlIII = llllllllllllIlllIlllllIllIIIIlll.next();
            if (!lIIIIllIlllIlIll(llllllllllllIlllIlllllIllIIIIlII.equals(llllllllllllIlllIlllllIllIIIlIII.name()) ? 1 : 0) || lIIIIllIlllIIIll(llllllllllllIlllIlllllIllIIIIlII.equals(String.valueOf(llllllllllllIlllIlllllIllIIIlIII.ordinal())) ? 1 : 0)) {
                llllllllllllIlllIlllllIllIIIIIll = llllllllllllIlllIlllllIllIIIlIII;
            }
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        ResourceLeakDetector.level = llllllllllllIlllIlllllIllIIIIIll;
        if (lIIIIllIlllIIIll(ResourceLeakDetector.logger.isDebugEnabled() ? 1 : 0)) {
            ResourceLeakDetector.logger.debug(ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[22]], ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[23]], llllllllllllIlllIlllllIllIIIIIll.name().toLowerCase());
        }
        final String[] stack_TRACE_ELEMENT_EXCLUSIONS = new String[ResourceLeakDetector.llIIIIIIlIlIIl[0]];
        stack_TRACE_ELEMENT_EXCLUSIONS[ResourceLeakDetector.llIIIIIIlIlIIl[1]] = ResourceLeakDetector.llIIIIIIIllIlI[ResourceLeakDetector.llIIIIIIlIlIIl[24]];
        STACK_TRACE_ELEMENT_EXCLUSIONS = stack_TRACE_ELEMENT_EXCLUSIONS;
    }
    
    @Deprecated
    public static void setEnabled(final boolean llllllllllllIlllIllllllIIIIIIlII) {
        Level level;
        if (lIIIIllIlllIIIll(llllllllllllIlllIllllllIIIIIIlII ? 1 : 0)) {
            level = Level.SIMPLE;
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            level = Level.DISABLED;
        }
        setLevel(level);
    }
    
    private static String lIIIIllIlIlIIIll(final String llllllllllllIlllIlllllIlIlllIlIl, final String llllllllllllIlllIlllllIlIlllIIlI) {
        try {
            final SecretKeySpec llllllllllllIlllIlllllIlIllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlllllIlIlllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlllllIlIlllIlll = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlllllIlIlllIlll.init(ResourceLeakDetector.llIIIIIIlIlIIl[3], llllllllllllIlllIlllllIlIllllIII);
            return new String(llllllllllllIlllIlllllIlIlllIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlllllIlIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlllllIlIlllIllI) {
            llllllllllllIlllIlllllIlIlllIllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIllIlllIlIll(final int llllllllllllIlllIlllllIlIIllIlll) {
        return llllllllllllIlllIlllllIlIIllIlll == 0;
    }
    
    public static boolean isEnabled() {
        int n;
        if (lIIIIllIlllIIlII(getLevel().ordinal(), Level.DISABLED.ordinal())) {
            n = ResourceLeakDetector.llIIIIIIlIlIIl[0];
            "".length();
            if (null != null) {
                return ((0x5C ^ 0x59 ^ (0x4A ^ 0x47)) & (0x35 ^ 0x5C ^ (0x5E ^ 0x3F) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = ResourceLeakDetector.llIIIIIIlIlIIl[1];
        }
        return n != 0;
    }
    
    public static Level getLevel() {
        return ResourceLeakDetector.level;
    }
    
    private static int lIIIIllIlllIIllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public enum Level
    {
        private static final /* synthetic */ int[] llIIIIIIlIlIII;
        
        DISABLED, 
        ADVANCED, 
        PARANOID, 
        SIMPLE;
        
        private static final /* synthetic */ String[] llIIIIIIlIIlll;
        
        private static void lIIIIllIllIllllI() {
            (llIIIIIIlIIlll = new String[Level.llIIIIIIlIlIII[4]])[Level.llIIIIIIlIlIII[0]] = lIIIIllIllIllIll("5mzjPmKlwyvO0cDAVZ1OCQ==", "HWapN");
            Level.llIIIIIIlIIlll[Level.llIIIIIIlIlIII[1]] = lIIIIllIllIlllII("2yeOFHLfIQ0=", "INdJQ");
            Level.llIIIIIIlIIlll[Level.llIIIIIIlIlIII[2]] = lIIIIllIllIlllIl("Izw+Ex4hPSw=", "bxhRP");
            Level.llIIIIIIlIIlll[Level.llIIIIIIlIlIII[3]] = lIIIIllIllIllIll("DJMPfqb5QxmHfWHJ077++g==", "qOiKn");
        }
        
        private static void lIIIIllIlllIIIII() {
            (llIIIIIIlIlIII = new int[6])[0] = ((0x7 ^ 0x4D ^ (0x78 ^ 0xF)) & (129 + 16 - 10 + 6 ^ 94 + 144 - 118 + 56 ^ -" ".length()));
            Level.llIIIIIIlIlIII[1] = " ".length();
            Level.llIIIIIIlIlIII[2] = "  ".length();
            Level.llIIIIIIlIlIII[3] = "   ".length();
            Level.llIIIIIIlIlIII[4] = (0xC0 ^ 0xC4);
            Level.llIIIIIIlIlIII[5] = (0xC ^ 0x4);
        }
        
        private static String lIIIIllIllIlllII(final String llllllllllllIlllIllllllIIIlIIlll, final String llllllllllllIlllIllllllIIIlIIllI) {
            try {
                final SecretKeySpec llllllllllllIlllIllllllIIIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllllllIIIlIIllI.getBytes(StandardCharsets.UTF_8)), Level.llIIIIIIlIlIII[5]), "DES");
                final Cipher llllllllllllIlllIllllllIIIlIlIIl = Cipher.getInstance("DES");
                llllllllllllIlllIllllllIIIlIlIIl.init(Level.llIIIIIIlIlIII[2], llllllllllllIlllIllllllIIIlIlIlI);
                return new String(llllllllllllIlllIllllllIIIlIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllllllIIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIllllllIIIlIlIII) {
                llllllllllllIlllIllllllIIIlIlIII.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIIIllIlllIIIIl(final int llllllllllllIlllIllllllIIIIIIlll, final int llllllllllllIlllIllllllIIIIIIllI) {
            return llllllllllllIlllIllllllIIIIIIlll < llllllllllllIlllIllllllIIIIIIllI;
        }
        
        private static String lIIIIllIllIlllIl(String llllllllllllIlllIllllllIIIIlIIlI, final String llllllllllllIlllIllllllIIIIlIllI) {
            llllllllllllIlllIllllllIIIIlIIlI = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIllllllIIIIlIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlllIllllllIIIIlIlIl = new StringBuilder();
            final char[] llllllllllllIlllIllllllIIIIlIlII = llllllllllllIlllIllllllIIIIlIllI.toCharArray();
            int llllllllllllIlllIllllllIIIIlIIll = Level.llIIIIIIlIlIII[0];
            final int llllllllllllIlllIllllllIIIIIllIl = (Object)((String)llllllllllllIlllIllllllIIIIlIIlI).toCharArray();
            final short llllllllllllIlllIllllllIIIIIllII = (short)llllllllllllIlllIllllllIIIIIllIl.length;
            int llllllllllllIlllIllllllIIIIIlIll = Level.llIIIIIIlIlIII[0];
            while (lIIIIllIlllIIIIl(llllllllllllIlllIllllllIIIIIlIll, llllllllllllIlllIllllllIIIIIllII)) {
                final char llllllllllllIlllIllllllIIIIllIII = llllllllllllIlllIllllllIIIIIllIl[llllllllllllIlllIllllllIIIIIlIll];
                llllllllllllIlllIllllllIIIIlIlIl.append((char)(llllllllllllIlllIllllllIIIIllIII ^ llllllllllllIlllIllllllIIIIlIlII[llllllllllllIlllIllllllIIIIlIIll % llllllllllllIlllIllllllIIIIlIlII.length]));
                "".length();
                ++llllllllllllIlllIllllllIIIIlIIll;
                ++llllllllllllIlllIllllllIIIIIlIll;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlllIllllllIIIIlIlIl);
        }
        
        static {
            lIIIIllIlllIIIII();
            lIIIIllIllIllllI();
            final Level[] $values = new Level[Level.llIIIIIIlIlIII[4]];
            $values[Level.llIIIIIIlIlIII[0]] = Level.DISABLED;
            $values[Level.llIIIIIIlIlIII[1]] = Level.SIMPLE;
            $values[Level.llIIIIIIlIlIII[2]] = Level.ADVANCED;
            $values[Level.llIIIIIIlIlIII[3]] = Level.PARANOID;
            $VALUES = $values;
        }
        
        private static String lIIIIllIllIllIll(final String llllllllllllIlllIllllllIIIllIIlI, final String llllllllllllIlllIllllllIIIllIIll) {
            try {
                final SecretKeySpec llllllllllllIlllIllllllIIIllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllllllIIIllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlllIllllllIIIllIllI = Cipher.getInstance("Blowfish");
                llllllllllllIlllIllllllIIIllIllI.init(Level.llIIIIIIlIlIII[2], llllllllllllIlllIllllllIIIllIlll);
                return new String(llllllllllllIlllIllllllIIIllIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllllllIIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIllllllIIIllIlIl) {
                llllllllllllIlllIllllllIIIllIlIl.printStackTrace();
                return null;
            }
        }
    }
    
    private final class DefaultResourceLeak extends PhantomReference<Object> implements ResourceLeak
    {
        private final /* synthetic */ AtomicBoolean freed;
        private /* synthetic */ DefaultResourceLeak next;
        private final /* synthetic */ String creationRecord;
        private /* synthetic */ DefaultResourceLeak prev;
        private final /* synthetic */ Deque<String> lastRecords;
        private static final /* synthetic */ int[] llIIlIllIlIIlI;
        private static final /* synthetic */ String[] llIIlIllIlIIIl;
        
        private static boolean lIIIllIllIlIlIll(final int llllllllllllIlllIIIlIlIIIlIIlIIl, final int llllllllllllIlllIIIlIlIIIlIIlIII) {
            return llllllllllllIlllIIIlIlIIIlIIlIIl >= llllllllllllIlllIIIlIlIIIlIIlIII;
        }
        
        private static void lIIIllIllIlIlIIl() {
            (llIIlIllIlIIlI = new int[9])[0] = "   ".length();
            DefaultResourceLeak.llIIlIllIlIIlI[1] = " ".length();
            DefaultResourceLeak.llIIlIllIlIIlI[2] = "  ".length();
            DefaultResourceLeak.llIIlIllIlIIlI[3] = (0xA1 ^ 0xA5);
            DefaultResourceLeak.llIIlIllIlIIlI[4] = ((0x4F ^ 0x5A) & ~(0xAE ^ 0xBB));
            DefaultResourceLeak.llIIlIllIlIIlI[5] = (-(0xFFFFB6F5 & 0x5DBE) & (0xFFFFD4F3 & 0x7FBF));
            DefaultResourceLeak.llIIlIllIlIIlI[6] = (0xE5 ^ 0xC6);
            DefaultResourceLeak.llIIlIllIlIIlI[7] = (0x2D ^ 0x17);
            DefaultResourceLeak.llIIlIllIlIIlI[8] = (0x8D ^ 0x99 ^ (0x91 ^ 0x8D));
        }
        
        @Override
        public void record() {
            if (lIIIllIllIlIlIlI(this.creationRecord)) {
                final String llllllllllllIlllIIIlIlIIlIlIIIll = ResourceLeakDetector.newRecord(DefaultResourceLeak.llIIlIllIlIIlI[2]);
                synchronized (this.lastRecords) {
                    final int llllllllllllIlllIIIlIlIIlIlIIlII = this.lastRecords.size();
                    if (!lIIIllIllIlIllII(llllllllllllIlllIIIlIlIIlIlIIlII) || lIIIllIllIlIllIl(this.lastRecords.getLast().equals(llllllllllllIlllIIIlIlIIlIlIIIll) ? 1 : 0)) {
                        this.lastRecords.add(llllllllllllIlllIIIlIlIIlIlIIIll);
                        "".length();
                    }
                    if (lIIIllIllIlIlllI(llllllllllllIlllIIIlIlIIlIlIIlII, DefaultResourceLeak.llIIlIllIlIIlI[3])) {
                        this.lastRecords.removeFirst();
                        "".length();
                    }
                    // monitorexit(this.lastRecords)
                    "".length();
                    if (" ".length() >= "  ".length()) {
                        return;
                    }
                }
            }
        }
        
        static {
            lIIIllIllIlIlIIl();
            lIIIllIllIlIlIII();
            MAX_RECORDS = DefaultResourceLeak.llIIlIllIlIIlI[3];
        }
        
        private static String lIIIllIllIlIIlIl(String llllllllllllIlllIIIlIlIIIllIlllI, final String llllllllllllIlllIIIlIlIIIlllIIlI) {
            llllllllllllIlllIIIlIlIIIllIlllI = new String(Base64.getDecoder().decode(llllllllllllIlllIIIlIlIIIllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlllIIIlIlIIIlllIIIl = new StringBuilder();
            final char[] llllllllllllIlllIIIlIlIIIlllIIII = llllllllllllIlllIIIlIlIIIlllIIlI.toCharArray();
            int llllllllllllIlllIIIlIlIIIllIllll = DefaultResourceLeak.llIIlIllIlIIlI[4];
            final double llllllllllllIlllIIIlIlIIIllIlIIl = (Object)llllllllllllIlllIIIlIlIIIllIlllI.toCharArray();
            final char llllllllllllIlllIIIlIlIIIllIlIII = (char)llllllllllllIlllIIIlIlIIIllIlIIl.length;
            boolean llllllllllllIlllIIIlIlIIIllIIlll = DefaultResourceLeak.llIIlIllIlIIlI[4] != 0;
            while (lIIIllIllIllIIlI(llllllllllllIlllIIIlIlIIIllIIlll ? 1 : 0, llllllllllllIlllIIIlIlIIIllIlIII)) {
                final char llllllllllllIlllIIIlIlIIIlllIlII = llllllllllllIlllIIIlIlIIIllIlIIl[llllllllllllIlllIIIlIlIIIllIIlll];
                llllllllllllIlllIIIlIlIIIlllIIIl.append((char)(llllllllllllIlllIIIlIlIIIlllIlII ^ llllllllllllIlllIIIlIlIIIlllIIII[llllllllllllIlllIIIlIlIIIllIllll % llllllllllllIlllIIIlIlIIIlllIIII.length]));
                "".length();
                ++llllllllllllIlllIIIlIlIIIllIllll;
                ++llllllllllllIlllIIIlIlIIIllIIlll;
                "".length();
                if ("  ".length() == 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlllIIIlIlIIIlllIIIl);
        }
        
        private static boolean lIIIllIllIlIllll(final Object llllllllllllIlllIIIlIlIIIIllllII) {
            return llllllllllllIlllIIIlIlIIIIllllII == null;
        }
        
        private static boolean lIIIllIllIlIlllI(final int llllllllllllIlllIIIlIlIIIlIIIIIl, final int llllllllllllIlllIIIlIlIIIlIIIIII) {
            return llllllllllllIlllIIIlIlIIIlIIIIIl > llllllllllllIlllIIIlIlIIIlIIIIII;
        }
        
        private static boolean lIIIllIllIlIllII(final int llllllllllllIlllIIIlIlIIIIlllIlI) {
            return llllllllllllIlllIIIlIlIIIIlllIlI != 0;
        }
        
        @Override
        public String toString() {
            if (lIIIllIllIlIllll(this.creationRecord)) {
                return DefaultResourceLeak.llIIlIllIlIIIl[DefaultResourceLeak.llIIlIllIlIIlI[4]];
            }
            final Object[] llllllllllllIlllIIIlIlIIlIIIllll;
            synchronized (this.lastRecords) {
                llllllllllllIlllIIIlIlIIlIIIllll = this.lastRecords.toArray();
                // monitorexit(this.lastRecords)
                "".length();
                if ("  ".length() <= " ".length()) {
                    return null;
                }
            }
            final StringBuilder llllllllllllIlllIIIlIlIIlIIIlllI = new StringBuilder(DefaultResourceLeak.llIIlIllIlIIlI[5]);
            llllllllllllIlllIIIlIlIIlIIIlllI.append(StringUtil.NEWLINE);
            "".length();
            llllllllllllIlllIIIlIlIIlIIIlllI.append(DefaultResourceLeak.llIIlIllIlIIIl[DefaultResourceLeak.llIIlIllIlIIlI[1]]);
            "".length();
            llllllllllllIlllIIIlIlIIlIIIlllI.append(llllllllllllIlllIIIlIlIIlIIIllll.length);
            "".length();
            llllllllllllIlllIIIlIlIIlIIIlllI.append(StringUtil.NEWLINE);
            "".length();
            if (lIIIllIllIllIIII(llllllllllllIlllIIIlIlIIlIIIllll.length)) {
                int llllllllllllIlllIIIlIlIIlIIlIIIl = llllllllllllIlllIIIlIlIIlIIIllll.length - DefaultResourceLeak.llIIlIllIlIIlI[1];
                while (lIIIllIllIllIIIl(llllllllllllIlllIIIlIlIIlIIlIIIl)) {
                    llllllllllllIlllIIIlIlIIlIIIlllI.append((char)DefaultResourceLeak.llIIlIllIlIIlI[6]);
                    "".length();
                    llllllllllllIlllIIIlIlIIlIIIlllI.append(llllllllllllIlllIIIlIlIIlIIlIIIl + DefaultResourceLeak.llIIlIllIlIIlI[1]);
                    "".length();
                    llllllllllllIlllIIIlIlIIlIIIlllI.append((char)DefaultResourceLeak.llIIlIllIlIIlI[7]);
                    "".length();
                    llllllllllllIlllIIIlIlIIlIIIlllI.append(StringUtil.NEWLINE);
                    "".length();
                    llllllllllllIlllIIIlIlIIlIIIlllI.append(llllllllllllIlllIIIlIlIIlIIIllll[llllllllllllIlllIIIlIlIIlIIlIIIl]);
                    "".length();
                    --llllllllllllIlllIIIlIlIIlIIlIIIl;
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
            }
            llllllllllllIlllIIIlIlIIlIIIlllI.append(DefaultResourceLeak.llIIlIllIlIIIl[DefaultResourceLeak.llIIlIllIlIIlI[2]]);
            "".length();
            llllllllllllIlllIIIlIlIIlIIIlllI.append(StringUtil.NEWLINE);
            "".length();
            llllllllllllIlllIIIlIlIIlIIIlllI.append(this.creationRecord);
            "".length();
            llllllllllllIlllIIIlIlIIlIIIlllI.setLength(llllllllllllIlllIIIlIlIIlIIIlllI.length() - StringUtil.NEWLINE.length());
            return String.valueOf(llllllllllllIlllIIIlIlIIlIIIlllI);
        }
        
        @Override
        public boolean close() {
            if (lIIIllIllIlIllII(this.freed.compareAndSet((boolean)(DefaultResourceLeak.llIIlIllIlIIlI[4] != 0), (boolean)(DefaultResourceLeak.llIIlIllIlIIlI[1] != 0)) ? 1 : 0)) {
                synchronized (ResourceLeakDetector.this.head) {
                    ResourceLeakDetector.this.active--;
                    this.prev.next = this.next;
                    this.next.prev = this.prev;
                    this.prev = null;
                    this.next = null;
                    // monitorexit(ResourceLeakDetector.access$300(this.this$0))
                    "".length();
                    if (" ".length() > "   ".length()) {
                        return ((0xB4 ^ 0xA3) & ~(0x24 ^ 0x33)) != 0x0;
                    }
                }
                return DefaultResourceLeak.llIIlIllIlIIlI[1] != 0;
            }
            return DefaultResourceLeak.llIIlIllIlIIlI[4] != 0;
        }
        
        private static boolean lIIIllIllIllIIlI(final int llllllllllllIlllIIIlIlIIIlIIIlIl, final int llllllllllllIlllIIIlIlIIIlIIIlII) {
            return llllllllllllIlllIIIlIlIIIlIIIlIl < llllllllllllIlllIIIlIlIIIlIIIlII;
        }
        
        private static boolean lIIIllIllIllIIIl(final int llllllllllllIlllIIIlIlIIIIllIllI) {
            return llllllllllllIlllIIIlIlIIIIllIllI >= 0;
        }
        
        DefaultResourceLeak(final Object llllllllllllIlllIIIlIlIIlIlIllIl) {
            ReferenceQueue<? super Object> access$200;
            if (lIIIllIllIlIlIlI(llllllllllllIlllIIIlIlIIlIlIllIl)) {
                access$200 = ResourceLeakDetector.this.refQueue;
                "".length();
                if (null != null) {
                    throw null;
                }
            }
            else {
                access$200 = null;
            }
            super(llllllllllllIlllIIIlIlIIlIlIllIl, access$200);
            this.lastRecords = new ArrayDeque<String>();
            if (lIIIllIllIlIlIlI(llllllllllllIlllIIIlIlIIlIlIllIl)) {
                final Level llllllllllllIlllIIIlIlIIlIllIIlI = ResourceLeakDetector.getLevel();
                if (lIIIllIllIlIlIll(llllllllllllIlllIIIlIlIIlIllIIlI.ordinal(), Level.ADVANCED.ordinal())) {
                    this.creationRecord = ResourceLeakDetector.newRecord(DefaultResourceLeak.llIIlIllIlIIlI[0]);
                    "".length();
                    if (null != null) {
                        throw null;
                    }
                }
                else {
                    this.creationRecord = null;
                }
                synchronized (ResourceLeakDetector.this.head) {
                    this.prev = ResourceLeakDetector.this.head;
                    this.next = ResourceLeakDetector.this.head.next;
                    ResourceLeakDetector.this.head.next.prev = this;
                    ResourceLeakDetector.this.head.next = this;
                    ResourceLeakDetector.this.active++;
                    // monitorexit(ResourceLeakDetector.access$300(llllllllllllIlllIIIlIlIIlIlIlllI))
                    "".length();
                    if (-" ".length() >= ("  ".length() ^ (0x25 ^ 0x23))) {
                        throw null;
                    }
                }
                this.freed = new AtomicBoolean();
                "".length();
                if (((0x9 ^ 0x1B) & ~(0x2C ^ 0x3E)) > 0) {
                    throw null;
                }
            }
            else {
                this.creationRecord = null;
                this.freed = new AtomicBoolean((boolean)(DefaultResourceLeak.llIIlIllIlIIlI[1] != 0));
            }
        }
        
        private static boolean lIIIllIllIlIlIlI(final Object llllllllllllIlllIIIlIlIIIIlllllI) {
            return llllllllllllIlllIIIlIlIIIIlllllI != null;
        }
        
        private static boolean lIIIllIllIllIIII(final int llllllllllllIlllIIIlIlIIIIllIlII) {
            return llllllllllllIlllIIIlIlIIIIllIlII > 0;
        }
        
        private static String lIIIllIllIlIIlll(final String llllllllllllIlllIIIlIlIIIlIlIIIl, final String llllllllllllIlllIIIlIlIIIlIlIIII) {
            try {
                final SecretKeySpec llllllllllllIlllIIIlIlIIIlIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIlIlIIIlIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlllIIIlIlIIIlIlIIll = Cipher.getInstance("Blowfish");
                llllllllllllIlllIIIlIlIIIlIlIIll.init(DefaultResourceLeak.llIIlIllIlIIlI[2], llllllllllllIlllIIIlIlIIIlIlIlII);
                return new String(llllllllllllIlllIIIlIlIIIlIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIlIlIIIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIIIlIlIIIlIlIIlI) {
                llllllllllllIlllIIIlIlIIIlIlIIlI.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIIllIllIlIllIl(final int llllllllllllIlllIIIlIlIIIIlllIII) {
            return llllllllllllIlllIIIlIlIIIIlllIII == 0;
        }
        
        private static void lIIIllIllIlIlIII() {
            (llIIlIllIlIIIl = new String[DefaultResourceLeak.llIIlIllIlIIlI[0]])[DefaultResourceLeak.llIIlIllIlIIlI[4]] = lIIIllIllIlIIlIl("", "UldVp");
            DefaultResourceLeak.llIIlIllIlIIIl[DefaultResourceLeak.llIIlIllIlIIlI[1]] = lIIIllIllIlIIllI("z42iX9CqO03daPRa9eXudad8NYCT9rKr", "DcJIw");
            DefaultResourceLeak.llIIlIllIlIIIl[DefaultResourceLeak.llIIlIllIlIIlI[2]] = lIIIllIllIlIIlll("7WC5UAZTYLWvbDnRddgpzg==", "BURlU");
        }
        
        private static String lIIIllIllIlIIllI(final String llllllllllllIlllIIIlIlIIIlIllllI, final String llllllllllllIlllIIIlIlIIIlIllIll) {
            try {
                final SecretKeySpec llllllllllllIlllIIIlIlIIIllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIlIlIIIlIllIll.getBytes(StandardCharsets.UTF_8)), DefaultResourceLeak.llIIlIllIlIIlI[8]), "DES");
                final Cipher llllllllllllIlllIIIlIlIIIllIIIII = Cipher.getInstance("DES");
                llllllllllllIlllIIIlIlIIIllIIIII.init(DefaultResourceLeak.llIIlIllIlIIlI[2], llllllllllllIlllIIIlIlIIIllIIIIl);
                return new String(llllllllllllIlllIIIlIlIIIllIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIlIlIIIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIIIlIlIIIlIlllll) {
                llllllllllllIlllIIIlIlIIIlIlllll.printStackTrace();
                return null;
            }
        }
    }
}
