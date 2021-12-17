// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import java.util.Iterator;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.LinkedHashSet;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Set;

public final class ChannelPromiseAggregator implements ChannelFutureListener
{
    private /* synthetic */ Set<ChannelPromise> pendingPromises;
    private static final /* synthetic */ String[] llllIlllIIIll;
    private static final /* synthetic */ int[] llllIlllIIlII;
    private final /* synthetic */ ChannelPromise aggregatePromise;
    
    private static boolean lIlIllIIIIIlIIl(final int lllllllllllllIlIllIIlIIIlllllIII) {
        return lllllllllllllIlIllIIlIIIlllllIII == 0;
    }
    
    private static String lIlIllIIIIIIlIl(String lllllllllllllIlIllIIlIIlIIIIlllI, final String lllllllllllllIlIllIIlIIlIIIIllIl) {
        lllllllllllllIlIllIIlIIlIIIIlllI = (short)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIllIIlIIlIIIIlllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIIlIIlIIIlIIIl = new StringBuilder();
        final char[] lllllllllllllIlIllIIlIIlIIIlIIII = lllllllllllllIlIllIIlIIlIIIIllIl.toCharArray();
        int lllllllllllllIlIllIIlIIlIIIIllll = ChannelPromiseAggregator.llllIlllIIlII[0];
        final boolean lllllllllllllIlIllIIlIIlIIIIlIIl = (Object)((String)lllllllllllllIlIllIIlIIlIIIIlllI).toCharArray();
        final Exception lllllllllllllIlIllIIlIIlIIIIlIII = (Exception)lllllllllllllIlIllIIlIIlIIIIlIIl.length;
        double lllllllllllllIlIllIIlIIlIIIIIlll = ChannelPromiseAggregator.llllIlllIIlII[0];
        while (lIlIllIIIIIlIll((int)lllllllllllllIlIllIIlIIlIIIIIlll, (int)lllllllllllllIlIllIIlIIlIIIIlIII)) {
            final char lllllllllllllIlIllIIlIIlIIIlIlII = lllllllllllllIlIllIIlIIlIIIIlIIl[lllllllllllllIlIllIIlIIlIIIIIlll];
            lllllllllllllIlIllIIlIIlIIIlIIIl.append((char)(lllllllllllllIlIllIIlIIlIIIlIlII ^ lllllllllllllIlIllIIlIIlIIIlIIII[lllllllllllllIlIllIIlIIlIIIIllll % lllllllllllllIlIllIIlIIlIIIlIIII.length]));
            "".length();
            ++lllllllllllllIlIllIIlIIlIIIIllll;
            ++lllllllllllllIlIllIIlIIlIIIIIlll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIIlIIlIIIlIIIl);
    }
    
    public ChannelPromiseAggregator add(final ChannelPromise... lllllllllllllIlIllIIlIIlIIlllIII) {
        if (lIlIllIIIIIlIII(lllllllllllllIlIllIIlIIlIIlllIII)) {
            throw new NullPointerException(ChannelPromiseAggregator.llllIlllIIIll[ChannelPromiseAggregator.llllIlllIIlII[1]]);
        }
        if (lIlIllIIIIIlIIl(lllllllllllllIlIllIIlIIlIIlllIII.length)) {
            return this;
        }
        final long lllllllllllllIlIllIIlIIlIIllIlIl = (long)this;
        synchronized (this) {
            if (lIlIllIIIIIlIII(this.pendingPromises)) {
                int lllllllllllllIlIllIIlIIlIIlllllI = 0;
                if (lIlIllIIIIIlIlI(lllllllllllllIlIllIIlIIlIIlllIII.length, ChannelPromiseAggregator.llllIlllIIlII[1])) {
                    final int lllllllllllllIlIllIIlIIlIIllllll = lllllllllllllIlIllIIlIIlIIlllIII.length;
                    "".length();
                    if ("  ".length() == 0) {
                        return null;
                    }
                }
                else {
                    lllllllllllllIlIllIIlIIlIIlllllI = ChannelPromiseAggregator.llllIlllIIlII[2];
                }
                this.pendingPromises = new LinkedHashSet<ChannelPromise>(lllllllllllllIlIllIIlIIlIIlllllI);
            }
            final ChannelPromise[] lllllllllllllIlIllIIlIIlIIllllII = lllllllllllllIlIllIIlIIlIIlllIII;
            final int lllllllllllllIlIllIIlIIlIIlllIll = lllllllllllllIlIllIIlIIlIIllllII.length;
            int lllllllllllllIlIllIIlIIlIIlllIlI = ChannelPromiseAggregator.llllIlllIIlII[0];
            while (lIlIllIIIIIlIll(lllllllllllllIlIllIIlIIlIIlllIlI, lllllllllllllIlIllIIlIIlIIlllIll)) {
                final ChannelPromise lllllllllllllIlIllIIlIIlIIllllIl = lllllllllllllIlIllIIlIIlIIllllII[lllllllllllllIlIllIIlIIlIIlllIlI];
                if (lIlIllIIIIIlIII(lllllllllllllIlIllIIlIIlIIllllIl)) {
                    "".length();
                    if ("  ".length() < -" ".length()) {
                        return null;
                    }
                }
                else {
                    this.pendingPromises.add(lllllllllllllIlIllIIlIIlIIllllIl);
                    "".length();
                    lllllllllllllIlIllIIlIIlIIllllIl.addListener((GenericFutureListener<? extends Future<? super Void>>)this);
                    "".length();
                }
                ++lllllllllllllIlIllIIlIIlIIlllIlI;
                "".length();
                if ("  ".length() < ((0x86 ^ 0xB7) & ~(0xA8 ^ 0x99))) {
                    return null;
                }
            }
            // monitorexit(this)
            "".length();
            if (" ".length() >= (0x49 ^ 0x4D)) {
                return null;
            }
        }
        return this;
    }
    
    private static void lIlIllIIIIIIllI() {
        (llllIlllIIIll = new String[ChannelPromiseAggregator.llllIlllIIlII[2]])[ChannelPromiseAggregator.llllIlllIIlII[0]] = lIlIllIIIIIIlIl("LTIBMA8rNBInOj46CysZKQ==", "LUfBj");
        ChannelPromiseAggregator.llllIlllIIIll[ChannelPromiseAggregator.llllIlllIIlII[1]] = lIlIllIIIIIIlIl("Bio1OioFPSk=", "vXZWC");
    }
    
    public ChannelPromiseAggregator(final ChannelPromise lllllllllllllIlIllIIlIIlIlIIlIlI) {
        if (lIlIllIIIIIlIII(lllllllllllllIlIllIIlIIlIlIIlIlI)) {
            throw new NullPointerException(ChannelPromiseAggregator.llllIlllIIIll[ChannelPromiseAggregator.llllIlllIIlII[0]]);
        }
        this.aggregatePromise = lllllllllllllIlIllIIlIIlIlIIlIlI;
    }
    
    @Override
    public synchronized void operationComplete(final ChannelFuture lllllllllllllIlIllIIlIIlIIlIlIII) throws Exception {
        if (lIlIllIIIIIlIII(this.pendingPromises)) {
            this.aggregatePromise.setSuccess();
            "".length();
            "".length();
            if ((0x39 ^ 0x3D) < 0) {
                return;
            }
        }
        else {
            this.pendingPromises.remove(lllllllllllllIlIllIIlIIlIIlIlIII);
            "".length();
            if (lIlIllIIIIIlIIl(lllllllllllllIlIllIIlIIlIIlIlIII.isSuccess() ? 1 : 0)) {
                this.aggregatePromise.setFailure(lllllllllllllIlIllIIlIIlIIlIlIII.cause());
                "".length();
                final Iterator lllllllllllllIlIllIIlIIlIIlIlIlI = this.pendingPromises.iterator();
                while (lIlIllIIIIIllII(lllllllllllllIlIllIIlIIlIIlIlIlI.hasNext() ? 1 : 0)) {
                    final ChannelPromise lllllllllllllIlIllIIlIIlIIlIlIll = lllllllllllllIlIllIIlIIlIIlIlIlI.next();
                    lllllllllllllIlIllIIlIIlIIlIlIll.setFailure(lllllllllllllIlIllIIlIIlIIlIlIII.cause());
                    "".length();
                    "".length();
                    if ("  ".length() > "  ".length()) {
                        return;
                    }
                }
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            }
            else if (lIlIllIIIIIllII(this.pendingPromises.isEmpty() ? 1 : 0)) {
                this.aggregatePromise.setSuccess();
                "".length();
            }
        }
    }
    
    private static boolean lIlIllIIIIIlIll(final int lllllllllllllIlIllIIlIIlIIIIIIll, final int lllllllllllllIlIllIIlIIlIIIIIIlI) {
        return lllllllllllllIlIllIIlIIlIIIIIIll < lllllllllllllIlIllIIlIIlIIIIIIlI;
    }
    
    private static boolean lIlIllIIIIIlIlI(final int lllllllllllllIlIllIIlIIIllllllll, final int lllllllllllllIlIllIIlIIIlllllllI) {
        return lllllllllllllIlIllIIlIIIllllllll > lllllllllllllIlIllIIlIIIlllllllI;
    }
    
    static {
        lIlIllIIIIIIlll();
        lIlIllIIIIIIllI();
    }
    
    private static void lIlIllIIIIIIlll() {
        (llllIlllIIlII = new int[3])[0] = ((66 + 36 + 67 + 71 ^ 89 + 126 - 105 + 37) & (0x3B ^ 0x6B ^ (0x42 ^ 0x71) ^ -" ".length()));
        ChannelPromiseAggregator.llllIlllIIlII[1] = " ".length();
        ChannelPromiseAggregator.llllIlllIIlII[2] = "  ".length();
    }
    
    private static boolean lIlIllIIIIIlIII(final Object lllllllllllllIlIllIIlIIIllllllII) {
        return lllllllllllllIlIllIIlIIIllllllII == null;
    }
    
    private static boolean lIlIllIIIIIllII(final int lllllllllllllIlIllIIlIIIlllllIlI) {
        return lllllllllllllIlIllIIlIIIlllllIlI != 0;
    }
}
