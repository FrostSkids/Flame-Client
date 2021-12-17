// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import java.io.Serializable;
import io.netty.channel.ChannelPromise;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;
import java.util.Iterator;
import java.util.Comparator;
import java.util.TreeMap;
import io.netty.util.internal.PlatformDependent;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

final class SpdySession
{
    private final /* synthetic */ AtomicInteger activeLocalStreams;
    private final /* synthetic */ StreamComparator streamComparator;
    private final /* synthetic */ AtomicInteger sendWindowSize;
    private final /* synthetic */ AtomicInteger receiveWindowSize;
    private final /* synthetic */ AtomicInteger activeRemoteStreams;
    private static final /* synthetic */ int[] lIllIIlIIIlIll;
    private final /* synthetic */ Map<Integer, StreamState> activeStreams;
    
    boolean isLocalSideClosed(final int lllllllllllllIIIIIlIIlIIllIlIlIl) {
        final StreamState lllllllllllllIIIIIlIIlIIllIlIlll = this.activeStreams.get(lllllllllllllIIIIIlIIlIIllIlIlIl);
        int n;
        if (!lllllIIlIlllIIl(lllllllllllllIIIIIlIIlIIllIlIlll) || lllllIIlIllIllI(lllllllllllllIIIIIlIIlIIllIlIlll.isLocalSideClosed() ? 1 : 0)) {
            n = SpdySession.lIllIIlIIIlIll[0];
            "".length();
            if (((0x92 ^ 0x8D ^ (0x1A ^ 0x57)) & (88 + 186 - 108 + 38 ^ 53 + 141 - 95 + 59 ^ -" ".length())) != 0x0) {
                return ((23 + 121 - 49 + 132 ^ 178 + 116 - 215 + 115) & (" ".length() ^ (0x1A ^ 0x3A) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = SpdySession.lIllIIlIIIlIll[1];
        }
        return n != 0;
    }
    
    int numActiveStreams(final boolean lllllllllllllIIIIIlIIlIlIIllIlll) {
        if (lllllIIlIllIllI(lllllllllllllIIIIIlIIlIlIIllIlll ? 1 : 0)) {
            return this.activeRemoteStreams.get();
        }
        return this.activeLocalStreams.get();
    }
    
    SpdySession(final int lllllllllllllIIIIIlIIlIlIIlllllI, final int lllllllllllllIIIIIlIIlIlIIllllIl) {
        this.activeLocalStreams = new AtomicInteger();
        this.activeRemoteStreams = new AtomicInteger();
        this.activeStreams = (Map<Integer, StreamState>)PlatformDependent.newConcurrentHashMap();
        this.streamComparator = new StreamComparator();
        this.sendWindowSize = new AtomicInteger(lllllllllllllIIIIIlIIlIlIIlllllI);
        this.receiveWindowSize = new AtomicInteger(lllllllllllllIIIIIlIIlIlIIllllIl);
    }
    
    boolean noActiveStreams() {
        return this.activeStreams.isEmpty();
    }
    
    void acceptStream(final int lllllllllllllIIIIIlIIlIlIIIlIlII, final byte lllllllllllllIIIIIlIIlIlIIIlIIll, final boolean lllllllllllllIIIIIlIIlIlIIIlIIlI, final boolean lllllllllllllIIIIIlIIlIlIIIlIIIl, final int lllllllllllllIIIIIlIIlIlIIIlIIII, final int lllllllllllllIIIIIlIIlIlIIIIllll, final boolean lllllllllllllIIIIIlIIlIlIIIIlllI) {
        if (!lllllIIlIllIllI(lllllllllllllIIIIIlIIlIlIIIlIIlI ? 1 : 0) || lllllIIlIllIlll(lllllllllllllIIIIIlIIlIlIIIlIIIl ? 1 : 0)) {
            final StreamState lllllllllllllIIIIIlIIlIlIIIllllI = this.activeStreams.put(lllllllllllllIIIIIlIIlIlIIIlIlII, new StreamState(lllllllllllllIIIIIlIIlIlIIIlIIll, lllllllllllllIIIIIlIIlIlIIIlIIlI, lllllllllllllIIIIIlIIlIlIIIlIIIl, lllllllllllllIIIIIlIIlIlIIIlIIII, lllllllllllllIIIIIlIIlIlIIIIllll));
            if (lllllIIlIlllIII(lllllllllllllIIIIIlIIlIlIIIllllI)) {
                if (lllllIIlIllIllI(lllllllllllllIIIIIlIIlIlIIIIlllI ? 1 : 0)) {
                    this.activeRemoteStreams.incrementAndGet();
                    "".length();
                    "".length();
                    if ("   ".length() <= -" ".length()) {
                        return;
                    }
                }
                else {
                    this.activeLocalStreams.incrementAndGet();
                    "".length();
                }
            }
        }
    }
    
    boolean putPendingWrite(final int lllllllllllllIIIIIlIIlIIIllIlIlI, final PendingWrite lllllllllllllIIIIIlIIlIIIllIlIIl) {
        final StreamState lllllllllllllIIIIIlIIlIIIllIllII = this.activeStreams.get(lllllllllllllIIIIIlIIlIIIllIlIlI);
        int n;
        if (lllllIIlIlllIIl(lllllllllllllIIIIIlIIlIIIllIllII) && lllllIIlIllIllI(lllllllllllllIIIIIlIIlIIIllIllII.putPendingWrite(lllllllllllllIIIIIlIIlIIIllIlIIl) ? 1 : 0)) {
            n = SpdySession.lIllIIlIIIlIll[0];
            "".length();
            if (((72 + 2 - 41 + 105 ^ 101 + 120 - 68 + 8) & (45 + 165 - 136 + 115 ^ 68 + 93 - 11 + 0 ^ -" ".length())) > 0) {
                return ((50 + 130 - 28 + 87 ^ 117 + 121 - 109 + 60) & (0x2B ^ 0x5 ^ (0x27 ^ 0x5B) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = SpdySession.lIllIIlIIIlIll[1];
        }
        return n != 0;
    }
    
    void closeRemoteSide(final int lllllllllllllIIIIIlIIlIIlllIIIll, final boolean lllllllllllllIIIIIlIIlIIlllIIIlI) {
        final StreamState lllllllllllllIIIIIlIIlIIlllIIIIl = this.activeStreams.get(lllllllllllllIIIIIlIIlIIlllIIIll);
        if (lllllIIlIlllIIl(lllllllllllllIIIIIlIIlIIlllIIIIl)) {
            lllllllllllllIIIIIlIIlIIlllIIIIl.closeRemoteSide();
            if (lllllIIlIllIllI(lllllllllllllIIIIIlIIlIIlllIIIIl.isLocalSideClosed() ? 1 : 0)) {
                this.removeActiveStream(lllllllllllllIIIIIlIIlIIlllIIIll, lllllllllllllIIIIIlIIlIIlllIIIlI);
                "".length();
            }
        }
    }
    
    void receivedReply(final int lllllllllllllIIIIIlIIlIIlIlllIlI) {
        final StreamState lllllllllllllIIIIIlIIlIIlIlllIIl = this.activeStreams.get(lllllllllllllIIIIIlIIlIIlIlllIlI);
        if (lllllIIlIlllIIl(lllllllllllllIIIIIlIIlIIlIlllIIl)) {
            lllllllllllllIIIIIlIIlIIlIlllIIl.receivedReply();
        }
    }
    
    boolean isRemoteSideClosed(final int lllllllllllllIIIIIlIIlIIlllIllIl) {
        final StreamState lllllllllllllIIIIIlIIlIIlllIllII = this.activeStreams.get(lllllllllllllIIIIIlIIlIIlllIllIl);
        int n;
        if (!lllllIIlIlllIIl(lllllllllllllIIIIIlIIlIIlllIllII) || lllllIIlIllIllI(lllllllllllllIIIIIlIIlIIlllIllII.isRemoteSideClosed() ? 1 : 0)) {
            n = SpdySession.lIllIIlIIIlIll[0];
            "".length();
            if ((158 + 83 - 97 + 22 ^ 139 + 157 - 212 + 78) <= -" ".length()) {
                return ((0x88 ^ 0x84 ^ (0x31 ^ 0x79)) & (0x32 ^ 0x60 ^ (0x56 ^ 0x40) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = SpdySession.lIllIIlIIIlIll[1];
        }
        return n != 0;
    }
    
    PendingWrite removePendingWrite(final int lllllllllllllIIIIIlIIlIIIlIIllIl) {
        final StreamState lllllllllllllIIIIIlIIlIIIlIIllll = this.activeStreams.get(lllllllllllllIIIIIlIIlIIIlIIllIl);
        PendingWrite removePendingWrite;
        if (lllllIIlIlllIIl(lllllllllllllIIIIIlIIlIIIlIIllll)) {
            removePendingWrite = lllllllllllllIIIIIlIIlIIIlIIllll.removePendingWrite();
            "".length();
            if (-(39 + 81 - 76 + 152 ^ 100 + 163 - 113 + 43) >= 0) {
                return null;
            }
        }
        else {
            removePendingWrite = null;
        }
        return removePendingWrite;
    }
    
    int updateReceiveWindowSize(final int lllllllllllllIIIIIlIIlIIlIIlIlll, final int lllllllllllllIIIIIlIIlIIlIIlIllI) {
        if (lllllIIlIllIlll(lllllllllllllIIIIIlIIlIIlIIlIlll)) {
            return this.receiveWindowSize.addAndGet(lllllllllllllIIIIIlIIlIIlIIlIllI);
        }
        final StreamState lllllllllllllIIIIIlIIlIIlIIllIIl = this.activeStreams.get(lllllllllllllIIIIIlIIlIIlIIlIlll);
        if (lllllIIlIlllIII(lllllllllllllIIIIIlIIlIIlIIllIIl)) {
            return SpdySession.lIllIIlIIIlIll[2];
        }
        if (lllllIIlIlllIlI(lllllllllllllIIIIIlIIlIIlIIlIllI)) {
            lllllllllllllIIIIIlIIlIIlIIllIIl.setReceiveWindowSizeLowerBound(SpdySession.lIllIIlIIIlIll[1]);
        }
        return lllllllllllllIIIIIlIIlIIlIIllIIl.updateReceiveWindowSize(lllllllllllllIIIIIlIIlIIlIIlIllI);
    }
    
    boolean isActiveStream(final int lllllllllllllIIIIIlIIlIlIIllIIII) {
        return this.activeStreams.containsKey(lllllllllllllIIIIIlIIlIlIIllIIII);
    }
    
    static {
        lllllIIlIllIlIl();
    }
    
    void removeStream(final int lllllllllllllIIIIIlIIlIIlllllIlI, final Throwable lllllllllllllIIIIIlIIlIIlllllIIl, final boolean lllllllllllllIIIIIlIIlIIllllIIll) {
        final StreamState lllllllllllllIIIIIlIIlIIllllIlll = this.removeActiveStream(lllllllllllllIIIIIlIIlIIlllllIlI, lllllllllllllIIIIIlIIlIIllllIIll);
        if (lllllIIlIlllIIl(lllllllllllllIIIIIlIIlIIllllIlll)) {
            lllllllllllllIIIIIlIIlIIllllIlll.clearPendingWrites(lllllllllllllIIIIIlIIlIIlllllIIl);
        }
    }
    
    Map<Integer, StreamState> activeStreams() {
        final Map<Integer, StreamState> lllllllllllllIIIIIlIIlIlIIlIlIlI = new TreeMap<Integer, StreamState>(this.streamComparator);
        lllllllllllllIIIIIlIIlIlIIlIlIlI.putAll(this.activeStreams);
        return lllllllllllllIIIIIlIIlIlIIlIlIlI;
    }
    
    boolean hasReceivedReply(final int lllllllllllllIIIIIlIIlIIllIIIIll) {
        final StreamState lllllllllllllIIIIIlIIlIIllIIIIlI = this.activeStreams.get(lllllllllllllIIIIIlIIlIIllIIIIll);
        int n;
        if (lllllIIlIlllIIl(lllllllllllllIIIIIlIIlIIllIIIIlI) && lllllIIlIllIllI(lllllllllllllIIIIIlIIlIIllIIIIlI.hasReceivedReply() ? 1 : 0)) {
            n = SpdySession.lIllIIlIIIlIll[0];
            "".length();
            if ("   ".length() != "   ".length()) {
                return ("   ".length() & ~"   ".length()) != 0x0;
            }
        }
        else {
            n = SpdySession.lIllIIlIIIlIll[1];
        }
        return n != 0;
    }
    
    private static boolean lllllIIlIllIlll(final int lllllllllllllIIIIIlIIlIIIlIIIIIl) {
        return lllllllllllllIIIIIlIIlIIIlIIIIIl == 0;
    }
    
    void updateAllReceiveWindowSizes(final int lllllllllllllIIIIIlIIlIIIlllIllI) {
        final Iterator lllllllllllllIIIIIlIIlIIIllllIlI = this.activeStreams.values().iterator();
        while (lllllIIlIllIllI(lllllllllllllIIIIIlIIlIIIllllIlI.hasNext() ? 1 : 0)) {
            final StreamState lllllllllllllIIIIIlIIlIIIllllIll = lllllllllllllIIIIIlIIlIIIllllIlI.next();
            lllllllllllllIIIIIlIIlIIIllllIll.updateReceiveWindowSize(lllllllllllllIIIIIlIIlIIIlllIllI);
            "".length();
            if (lllllIIlIlllIll(lllllllllllllIIIIIlIIlIIIlllIllI)) {
                lllllllllllllIIIIIlIIlIIIllllIll.setReceiveWindowSizeLowerBound(lllllllllllllIIIIIlIIlIIIlllIllI);
            }
            "".length();
            if ("  ".length() < 0) {
                return;
            }
        }
    }
    
    private static boolean lllllIIlIllIllI(final int lllllllllllllIIIIIlIIlIIIlIIIIll) {
        return lllllllllllllIIIIIlIIlIIIlIIIIll != 0;
    }
    
    private static boolean lllllIIlIlllIII(final Object lllllllllllllIIIIIlIIlIIIlIIIlIl) {
        return lllllllllllllIIIIIlIIlIIIlIIIlIl == null;
    }
    
    private StreamState removeActiveStream(final int lllllllllllllIIIIIlIIlIlIIIIIIll, final boolean lllllllllllllIIIIIlIIlIlIIIIIIlI) {
        final StreamState lllllllllllllIIIIIlIIlIlIIIIIlIl = this.activeStreams.remove(lllllllllllllIIIIIlIIlIlIIIIIIll);
        if (lllllIIlIlllIIl(lllllllllllllIIIIIlIIlIlIIIIIlIl)) {
            if (lllllIIlIllIllI(lllllllllllllIIIIIlIIlIlIIIIIIlI ? 1 : 0)) {
                this.activeRemoteStreams.decrementAndGet();
                "".length();
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                this.activeLocalStreams.decrementAndGet();
                "".length();
            }
        }
        return lllllllllllllIIIIIlIIlIlIIIIIlIl;
    }
    
    private static boolean lllllIIlIlllIIl(final Object lllllllllllllIIIIIlIIlIIIlIIIlll) {
        return lllllllllllllIIIIIlIIlIIIlIIIlll != null;
    }
    
    private static boolean lllllIIlIlllIll(final int lllllllllllllIIIIIlIIlIIIIllllll) {
        return lllllllllllllIIIIIlIIlIIIIllllll < 0;
    }
    
    private static boolean lllllIIlIlllIlI(final int lllllllllllllIIIIIlIIlIIIIllllIl) {
        return lllllllllllllIIIIIlIIlIIIIllllIl > 0;
    }
    
    PendingWrite getPendingWrite(final int lllllllllllllIIIIIlIIlIIIlIlllII) {
        if (lllllIIlIllIlll(lllllllllllllIIIIIlIIlIIIlIlllII)) {
            final Iterator lllllllllllllIIIIIlIIlIIIlIllllI = this.activeStreams().entrySet().iterator();
            while (lllllIIlIllIllI(lllllllllllllIIIIIlIIlIIIlIllllI.hasNext() ? 1 : 0)) {
                final Map.Entry<Integer, StreamState> lllllllllllllIIIIIlIIlIIIlIlllll = lllllllllllllIIIIIlIIlIIIlIllllI.next();
                final StreamState lllllllllllllIIIIIlIIlIIIllIIIII = lllllllllllllIIIIIlIIlIIIlIlllll.getValue();
                if (lllllIIlIlllIlI(lllllllllllllIIIIIlIIlIIIllIIIII.getSendWindowSize())) {
                    final PendingWrite lllllllllllllIIIIIlIIlIIIllIIIIl = lllllllllllllIIIIIlIIlIIIllIIIII.getPendingWrite();
                    if (lllllIIlIlllIIl(lllllllllllllIIIIIlIIlIIIllIIIIl)) {
                        return lllllllllllllIIIIIlIIlIIIllIIIIl;
                    }
                }
                "".length();
                if (" ".length() > (0x30 ^ 0x34)) {
                    return null;
                }
            }
            return null;
        }
        final StreamState lllllllllllllIIIIIlIIlIIIlIllIll = this.activeStreams.get(lllllllllllllIIIIIlIIlIIIlIlllII);
        PendingWrite pendingWrite;
        if (lllllIIlIlllIIl(lllllllllllllIIIIIlIIlIIIlIllIll)) {
            pendingWrite = lllllllllllllIIIIIlIIlIIIlIllIll.getPendingWrite();
            "".length();
            if ((6 + 184 - 43 + 44 ^ 97 + 64 + 3 + 23) == " ".length()) {
                return null;
            }
        }
        else {
            pendingWrite = null;
        }
        return pendingWrite;
    }
    
    int getReceiveWindowSizeLowerBound(final int lllllllllllllIIIIIlIIlIIlIIIllIl) {
        if (lllllIIlIllIlll(lllllllllllllIIIIIlIIlIIlIIIllIl)) {
            return SpdySession.lIllIIlIIIlIll[1];
        }
        final StreamState lllllllllllllIIIIIlIIlIIlIIIllll = this.activeStreams.get(lllllllllllllIIIIIlIIlIIlIIIllIl);
        int receiveWindowSizeLowerBound;
        if (lllllIIlIlllIIl(lllllllllllllIIIIIlIIlIIlIIIllll)) {
            receiveWindowSizeLowerBound = lllllllllllllIIIIIlIIlIIlIIIllll.getReceiveWindowSizeLowerBound();
            "".length();
            if ("  ".length() != "  ".length()) {
                return (0x7D ^ 0x6B ^ (0xEF ^ 0xBF)) & (0xFB ^ 0xC5 ^ (0x13 ^ 0x6B) ^ -" ".length());
            }
        }
        else {
            receiveWindowSizeLowerBound = SpdySession.lIllIIlIIIlIll[1];
        }
        return receiveWindowSizeLowerBound;
    }
    
    int updateSendWindowSize(final int lllllllllllllIIIIIlIIlIIlIlIIIll, final int lllllllllllllIIIIIlIIlIIlIlIIllI) {
        if (lllllIIlIllIlll(lllllllllllllIIIIIlIIlIIlIlIIIll)) {
            return this.sendWindowSize.addAndGet(lllllllllllllIIIIIlIIlIIlIlIIllI);
        }
        final StreamState lllllllllllllIIIIIlIIlIIlIlIIlIl = this.activeStreams.get(lllllllllllllIIIIIlIIlIIlIlIIIll);
        int updateSendWindowSize;
        if (lllllIIlIlllIIl(lllllllllllllIIIIIlIIlIIlIlIIlIl)) {
            updateSendWindowSize = lllllllllllllIIIIIlIIlIIlIlIIlIl.updateSendWindowSize(lllllllllllllIIIIIlIIlIIlIlIIllI);
            "".length();
            if ("   ".length() < 0) {
                return "  ".length() & ("  ".length() ^ -" ".length());
            }
        }
        else {
            updateSendWindowSize = SpdySession.lIllIIlIIIlIll[2];
        }
        return updateSendWindowSize;
    }
    
    int getSendWindowSize(final int lllllllllllllIIIIIlIIlIIlIllIIIl) {
        if (lllllIIlIllIlll(lllllllllllllIIIIIlIIlIIlIllIIIl)) {
            return this.sendWindowSize.get();
        }
        final StreamState lllllllllllllIIIIIlIIlIIlIllIIII = this.activeStreams.get(lllllllllllllIIIIIlIIlIIlIllIIIl);
        int sendWindowSize;
        if (lllllIIlIlllIIl(lllllllllllllIIIIIlIIlIIlIllIIII)) {
            sendWindowSize = lllllllllllllIIIIIlIIlIIlIllIIII.getSendWindowSize();
            "".length();
            if (-" ".length() >= 0) {
                return (0xDB ^ 0x8B) & ~(0x32 ^ 0x62);
            }
        }
        else {
            sendWindowSize = SpdySession.lIllIIlIIIlIll[2];
        }
        return sendWindowSize;
    }
    
    private static void lllllIIlIllIlIl() {
        (lIllIIlIIIlIll = new int[3])[0] = " ".length();
        SpdySession.lIllIIlIIIlIll[1] = ((32 + 99 - 94 + 106 ^ 1 + 152 - 131 + 165) & (0x24 ^ 0x6A ^ (0x3 ^ 0x79) ^ -" ".length()));
        SpdySession.lIllIIlIIIlIll[2] = -" ".length();
    }
    
    void updateAllSendWindowSizes(final int lllllllllllllIIIIIlIIlIIlIIIIlII) {
        final Iterator lllllllllllllIIIIIlIIlIIlIIIIllI = this.activeStreams.values().iterator();
        while (lllllIIlIllIllI(lllllllllllllIIIIIlIIlIIlIIIIllI.hasNext() ? 1 : 0)) {
            final StreamState lllllllllllllIIIIIlIIlIIlIIIIlll = lllllllllllllIIIIIlIIlIIlIIIIllI.next();
            lllllllllllllIIIIIlIIlIIlIIIIlll.updateSendWindowSize(lllllllllllllIIIIIlIIlIIlIIIIlII);
            "".length();
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
    }
    
    void closeLocalSide(final int lllllllllllllIIIIIlIIlIIllIIlllI, final boolean lllllllllllllIIIIIlIIlIIllIIllIl) {
        final StreamState lllllllllllllIIIIIlIIlIIllIIllII = this.activeStreams.get(lllllllllllllIIIIIlIIlIIllIIlllI);
        if (lllllIIlIlllIIl(lllllllllllllIIIIIlIIlIIllIIllII)) {
            lllllllllllllIIIIIlIIlIIllIIllII.closeLocalSide();
            if (lllllIIlIllIllI(lllllllllllllIIIIIlIIlIIllIIllII.isRemoteSideClosed() ? 1 : 0)) {
                this.removeActiveStream(lllllllllllllIIIIIlIIlIIllIIlllI, lllllllllllllIIIIIlIIlIIllIIllIl);
                "".length();
            }
        }
    }
    
    private static final class StreamState
    {
        private /* synthetic */ int receiveWindowSizeLowerBound;
        private /* synthetic */ boolean remoteSideClosed;
        private final /* synthetic */ AtomicInteger sendWindowSize;
        private final /* synthetic */ Queue<PendingWrite> pendingWriteQueue;
        private final /* synthetic */ AtomicInteger receiveWindowSize;
        private static final /* synthetic */ int[] llIlllIIlIIlII;
        private /* synthetic */ boolean receivedReply;
        private /* synthetic */ boolean localSideClosed;
        private final /* synthetic */ byte priority;
        
        int updateSendWindowSize(final int llllllllllllIllIIlIIlllllllIIIll) {
            return this.sendWindowSize.addAndGet(llllllllllllIllIIlIIlllllllIIIll);
        }
        
        int updateReceiveWindowSize(final int llllllllllllIllIIlIIllllllIlllIl) {
            return this.receiveWindowSize.addAndGet(llllllllllllIllIIlIIllllllIlllIl);
        }
        
        void closeRemoteSide() {
            this.remoteSideClosed = (StreamState.llIlllIIlIIlII[0] != 0);
        }
        
        boolean isLocalSideClosed() {
            return this.localSideClosed;
        }
        
        void receivedReply() {
            this.receivedReply = (StreamState.llIlllIIlIIlII[0] != 0);
        }
        
        boolean putPendingWrite(final PendingWrite llllllllllllIllIIlIIllllllIIlllI) {
            return this.pendingWriteQueue.offer(llllllllllllIllIIlIIllllllIIlllI);
        }
        
        void clearPendingWrites(final Throwable llllllllllllIllIIlIIllllllIIIIII) {
            do {
                final PendingWrite llllllllllllIllIIlIIllllllIIIlII = this.pendingWriteQueue.poll();
                if (lIIllIIlIlIlIllI(llllllllllllIllIIlIIllllllIIIlII)) {
                    "".length();
                    if (((179 + 118 - 282 + 230 ^ 15 + 189 - 94 + 84) & (110 + 10 - 24 + 57 ^ 104 + 98 - 34 + 6 ^ -" ".length())) == "   ".length()) {
                        return;
                    }
                }
                else {
                    llllllllllllIllIIlIIllllllIIIlII.fail(llllllllllllIllIIlIIllllllIIIIII);
                    "".length();
                }
            } while (null == null);
        }
        
        int getSendWindowSize() {
            return this.sendWindowSize.get();
        }
        
        boolean hasReceivedReply() {
            return this.receivedReply;
        }
        
        void setReceiveWindowSizeLowerBound(final int llllllllllllIllIIlIIllllllIlIlII) {
            this.receiveWindowSizeLowerBound = llllllllllllIllIIlIIllllllIlIlII;
        }
        
        boolean isRemoteSideClosed() {
            return this.remoteSideClosed;
        }
        
        byte getPriority() {
            return this.priority;
        }
        
        PendingWrite getPendingWrite() {
            return this.pendingWriteQueue.peek();
        }
        
        static {
            lIIllIIlIlIlIlIl();
        }
        
        int getReceiveWindowSizeLowerBound() {
            return this.receiveWindowSizeLowerBound;
        }
        
        private static void lIIllIIlIlIlIlIl() {
            (llIlllIIlIIlII = new int[1])[0] = " ".length();
        }
        
        void closeLocalSide() {
            this.localSideClosed = (StreamState.llIlllIIlIIlII[0] != 0);
        }
        
        private static boolean lIIllIIlIlIlIllI(final Object llllllllllllIllIIlIIlllllIllllIl) {
            return llllllllllllIllIIlIIlllllIllllIl == null;
        }
        
        PendingWrite removePendingWrite() {
            return this.pendingWriteQueue.poll();
        }
        
        StreamState(final byte llllllllllllIllIIlIlIIIIIIIIlIll, final boolean llllllllllllIllIIlIlIIIIIIIIlIlI, final boolean llllllllllllIllIIlIlIIIIIIIIlIIl, final int llllllllllllIllIIlIlIIIIIIIIIIlI, final int llllllllllllIllIIlIlIIIIIIIIIlll) {
            this.pendingWriteQueue = new ConcurrentLinkedQueue<PendingWrite>();
            this.priority = llllllllllllIllIIlIlIIIIIIIIlIll;
            this.remoteSideClosed = llllllllllllIllIIlIlIIIIIIIIlIlI;
            this.localSideClosed = llllllllllllIllIIlIlIIIIIIIIlIIl;
            this.sendWindowSize = new AtomicInteger(llllllllllllIllIIlIlIIIIIIIIIIlI);
            this.receiveWindowSize = new AtomicInteger(llllllllllllIllIIlIlIIIIIIIIIlll);
        }
    }
    
    public static final class PendingWrite
    {
        final /* synthetic */ ChannelPromise promise;
        final /* synthetic */ SpdyDataFrame spdyDataFrame;
        
        PendingWrite(final SpdyDataFrame llllllllllllIlIllIIIIlIllIllllII, final ChannelPromise llllllllllllIlIllIIIIlIllIlllIll) {
            this.spdyDataFrame = llllllllllllIlIllIIIIlIllIllllII;
            this.promise = llllllllllllIlIllIIIIlIllIlllIll;
        }
        
        void fail(final Throwable llllllllllllIlIllIIIIlIllIllIlll) {
            this.spdyDataFrame.release();
            "".length();
            this.promise.setFailure(llllllllllllIlIllIIIIlIllIllIlll);
            "".length();
        }
    }
    
    private final class StreamComparator implements Comparator<Integer>, Serializable
    {
        StreamComparator() {
        }
        
        private static boolean lIlIIIlIlIIIlIlI(final int llllllllllllIlIllIlllIIllIIlIIlI) {
            return llllllllllllIlIllIlllIIllIIlIIlI != 0;
        }
        
        @Override
        public int compare(final Integer llllllllllllIlIllIlllIIllIlIIlll, final Integer llllllllllllIlIllIlllIIllIlIIIII) {
            final StreamState llllllllllllIlIllIlllIIllIlIIlIl = SpdySession.this.activeStreams.get(llllllllllllIlIllIlllIIllIlIIlll);
            final StreamState llllllllllllIlIllIlllIIllIlIIlII = SpdySession.this.activeStreams.get(llllllllllllIlIllIlllIIllIlIIIII);
            final int llllllllllllIlIllIlllIIllIlIIIll = llllllllllllIlIllIlllIIllIlIIlIl.getPriority() - llllllllllllIlIllIlllIIllIlIIlII.getPriority();
            if (lIlIIIlIlIIIlIlI(llllllllllllIlIllIlllIIllIlIIIll)) {
                return llllllllllllIlIllIlllIIllIlIIIll;
            }
            return llllllllllllIlIllIlllIIllIlIIlll - llllllllllllIlIllIlllIIllIlIIIII;
        }
    }
}
