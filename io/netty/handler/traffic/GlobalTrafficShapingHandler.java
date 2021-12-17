// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.traffic;

import io.netty.util.concurrent.EventExecutor;
import java.util.concurrent.TimeUnit;
import java.util.LinkedList;
import io.netty.channel.ChannelPromise;
import java.util.Iterator;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.List;
import java.util.Map;
import io.netty.channel.ChannelHandler;

@ChannelHandler.Sharable
public class GlobalTrafficShapingHandler extends AbstractTrafficShapingHandler
{
    private /* synthetic */ Map<Integer, List<ToSend>> messagesQueues;
    private static final /* synthetic */ String[] lIIIIlIIlIIIll;
    private static final /* synthetic */ int[] lIIIIlIIlIIlll;
    
    public final void release() {
        if (lIlllIIIlIIlIII(this.trafficCounter)) {
            this.trafficCounter.stop();
        }
    }
    
    public GlobalTrafficShapingHandler(final ScheduledExecutorService lllllllllllllIlIIllIIIlIlIllllII, final long lllllllllllllIlIIllIIIlIlIllIlll, final long lllllllllllllIlIIllIIIlIlIllIllI) {
        super(lllllllllllllIlIIllIIIlIlIllIlll, lllllllllllllIlIIllIIIlIlIllIllI);
        this.messagesQueues = new HashMap<Integer, List<ToSend>>();
        this.createGlobalTrafficCounter(lllllllllllllIlIIllIIIlIlIllllII);
    }
    
    private static String lIlllIIIlIIIIIl(String lllllllllllllIlIIllIIIlIIIlllIII, final String lllllllllllllIlIIllIIIlIIIllIlll) {
        lllllllllllllIlIIllIIIlIIIlllIII = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIllIIIlIIIlllIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIllIIIlIIIlllIll = new StringBuilder();
        final char[] lllllllllllllIlIIllIIIlIIIlllIlI = lllllllllllllIlIIllIIIlIIIllIlll.toCharArray();
        int lllllllllllllIlIIllIIIlIIIlllIIl = GlobalTrafficShapingHandler.lIIIIlIIlIIlll[0];
        final long lllllllllllllIlIIllIIIlIIIllIIll = (Object)((String)lllllllllllllIlIIllIIIlIIIlllIII).toCharArray();
        final Exception lllllllllllllIlIIllIIIlIIIllIIlI = (Exception)lllllllllllllIlIIllIIIlIIIllIIll.length;
        short lllllllllllllIlIIllIIIlIIIllIIIl = (short)GlobalTrafficShapingHandler.lIIIIlIIlIIlll[0];
        while (lIlllIIIlIIlllI(lllllllllllllIlIIllIIIlIIIllIIIl, (int)lllllllllllllIlIIllIIIlIIIllIIlI)) {
            final char lllllllllllllIlIIllIIIlIIIlllllI = lllllllllllllIlIIllIIIlIIIllIIll[lllllllllllllIlIIllIIIlIIIllIIIl];
            lllllllllllllIlIIllIIIlIIIlllIll.append((char)(lllllllllllllIlIIllIIIlIIIlllllI ^ lllllllllllllIlIIllIIIlIIIlllIlI[lllllllllllllIlIIllIIIlIIIlllIIl % lllllllllllllIlIIllIIIlIIIlllIlI.length]));
            "".length();
            ++lllllllllllllIlIIllIIIlIIIlllIIl;
            ++lllllllllllllIlIIllIIIlIIIllIIIl;
            "".length();
            if (((215 + 71 - 158 + 124 ^ 166 + 152 - 169 + 44) & (0x11 ^ 0x37 ^ (0x1E ^ 0x5) ^ -" ".length())) >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIllIIIlIIIlllIll);
    }
    
    private static void lIlllIIIlIIIIlI() {
        (lIIIIlIIlIIIll = new String[GlobalTrafficShapingHandler.lIIIIlIIlIIlll[2]])[GlobalTrafficShapingHandler.lIIIIlIIlIIlll[0]] = lIlllIIIlIIIIIl("KTspLwA4LD4=", "LCLLu");
        GlobalTrafficShapingHandler.lIIIIlIIlIIIll[GlobalTrafficShapingHandler.lIIIIlIIlIIlll[1]] = lIlllIIIlIIIIIl("KxoqLhMAIgY=", "lvELr");
    }
    
    private static boolean lIlllIIIlIIllIl(final int lllllllllllllIlIIllIIIlIIIlIIIlI) {
        return lllllllllllllIlIIllIIIlIIIlIIIlI <= 0;
    }
    
    private static boolean lIlllIIIlIIIlll(final Object lllllllllllllIlIIllIIIlIIIlIlIII) {
        return lllllllllllllIlIIllIIIlIIIlIlIII == null;
    }
    
    private synchronized void sendAllValid(final ChannelHandlerContext lllllllllllllIlIIllIIIlIIlIlIIll, final List<ToSend> lllllllllllllIlIIllIIIlIIlIlIlII) {
        while (lIlllIIIlIIlIll(lllllllllllllIlIIllIIIlIIlIlIlII.isEmpty() ? 1 : 0)) {
            final ToSend lllllllllllllIlIIllIIIlIIlIlIlll = lllllllllllllIlIIllIIIlIIlIlIlII.remove(GlobalTrafficShapingHandler.lIIIIlIIlIIlll[0]);
            if (lIlllIIIlIIllIl(lIlllIIIlIIllII(lllllllllllllIlIIllIIIlIIlIlIlll.date, System.currentTimeMillis()))) {
                lllllllllllllIlIIllIIIlIIlIlIIll.write(lllllllllllllIlIIllIIIlIIlIlIlll.toSend, lllllllllllllIlIIllIIIlIIlIlIlll.promise);
                "".length();
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
                "".length();
                if (-" ".length() >= (0x69 ^ 0x6D)) {
                    return;
                }
                continue;
            }
            else {
                lllllllllllllIlIIllIIIlIIlIlIlII.add(GlobalTrafficShapingHandler.lIIIIlIIlIIlll[0], lllllllllllllIlIIllIIIlIIlIlIlll);
                "".length();
                if (-(7 + 153 - 137 + 133 ^ 32 + 83 - 62 + 99) > 0) {
                    return;
                }
                break;
            }
        }
        lllllllllllllIlIIllIIIlIIlIlIIll.flush();
        "".length();
    }
    
    private static boolean lIlllIIIlIIlIll(final int lllllllllllllIlIIllIIIlIIIlIIlII) {
        return lllllllllllllIlIIllIIIlIIIlIIlII == 0;
    }
    
    public GlobalTrafficShapingHandler(final ScheduledExecutorService lllllllllllllIlIIllIIIlIllIIlIlI, final long lllllllllllllIlIIllIIIlIllIIlIIl, final long lllllllllllllIlIIllIIIlIllIIlIII, final long lllllllllllllIlIIllIIIlIllIIIlll) {
        super(lllllllllllllIlIIllIIIlIllIIlIIl, lllllllllllllIlIIllIIIlIllIIlIII, lllllllllllllIlIIllIIIlIllIIIlll);
        this.messagesQueues = new HashMap<Integer, List<ToSend>>();
        this.createGlobalTrafficCounter(lllllllllllllIlIIllIIIlIllIIlIlI);
    }
    
    @Override
    public synchronized void handlerRemoved(final ChannelHandlerContext lllllllllllllIlIIllIIIlIIllllllI) throws Exception {
        final Integer lllllllllllllIlIIllIIIlIIlllllIl = lllllllllllllIlIIllIIIlIIllllllI.channel().hashCode();
        final List<ToSend> lllllllllllllIlIIllIIIlIIlllllII = this.messagesQueues.remove(lllllllllllllIlIIllIIIlIIlllllIl);
        if (lIlllIIIlIIlIII(lllllllllllllIlIIllIIIlIIlllllII)) {
            final Iterator lllllllllllllIlIIllIIIlIlIIIIIII = lllllllllllllIlIIllIIIlIIlllllII.iterator();
            while (lIlllIIIlIIlIIl(lllllllllllllIlIIllIIIlIlIIIIIII.hasNext() ? 1 : 0)) {
                final ToSend lllllllllllllIlIIllIIIlIlIIIIIIl = lllllllllllllIlIIllIIIlIlIIIIIII.next();
                if (lIlllIIIlIIlIIl((lllllllllllllIlIIllIIIlIlIIIIIIl.toSend instanceof ByteBuf) ? 1 : 0)) {
                    ((ByteBuf)lllllllllllllIlIIllIIIlIlIIIIIIl.toSend).release();
                    "".length();
                }
                "".length();
                if (((0xF2 ^ 0xA2) & ~(0x6 ^ 0x56)) != ((0x6B ^ 0x4C) & ~(0x55 ^ 0x72))) {
                    return;
                }
            }
            lllllllllllllIlIIllIIIlIIlllllII.clear();
        }
    }
    
    private static boolean lIlllIIIlIIlIIl(final int lllllllllllllIlIIllIIIlIIIlIIllI) {
        return lllllllllllllIlIIllIIIlIIIlIIllI != 0;
    }
    
    private static void lIlllIIIlIIIllI() {
        (lIIIIlIIlIIlll = new int[3])[0] = ((145 + 114 - 250 + 143 ^ 28 + 159 - 111 + 99) & (120 + 75 - 99 + 35 ^ 157 + 4 - 155 + 174 ^ -" ".length()));
        GlobalTrafficShapingHandler.lIIIIlIIlIIlll[1] = " ".length();
        GlobalTrafficShapingHandler.lIIIIlIIlIIlll[2] = "  ".length();
    }
    
    private static boolean lIlllIIIlIIlIII(final Object lllllllllllllIlIIllIIIlIIIlIlIlI) {
        return lllllllllllllIlIIllIIIlIIIlIlIlI != null;
    }
    
    public GlobalTrafficShapingHandler(final ScheduledExecutorService lllllllllllllIlIIllIIIlIllIllIll, final long lllllllllllllIlIIllIIIlIllIlIlII, final long lllllllllllllIlIIllIIIlIllIlIIll, final long lllllllllllllIlIIllIIIlIllIlIIlI, final long lllllllllllllIlIIllIIIlIllIlIlll) {
        super(lllllllllllllIlIIllIIIlIllIlIlII, lllllllllllllIlIIllIIIlIllIlIIll, lllllllllllllIlIIllIIIlIllIlIIlI, lllllllllllllIlIIllIIIlIllIlIlll);
        this.messagesQueues = new HashMap<Integer, List<ToSend>>();
        this.createGlobalTrafficCounter(lllllllllllllIlIIllIIIlIllIllIll);
    }
    
    @Override
    protected synchronized void submitWrite(final ChannelHandlerContext lllllllllllllIlIIllIIIlIIllIIIlI, final Object lllllllllllllIlIIllIIIlIIllIlIlI, final long lllllllllllllIlIIllIIIlIIllIlIIl, final ChannelPromise lllllllllllllIlIIllIIIlIIllIlIII) {
        final Integer lllllllllllllIlIIllIIIlIIllIIlll = lllllllllllllIlIIllIIIlIIllIIIlI.channel().hashCode();
        List<ToSend> lllllllllllllIlIIllIIIlIIllIIllI = this.messagesQueues.get(lllllllllllllIlIIllIIIlIIllIIlll);
        if (lIlllIIIlIIlIll(lIlllIIIlIIlIlI(lllllllllllllIlIIllIIIlIIllIlIIl, 0L)) && (!lIlllIIIlIIlIII(lllllllllllllIlIIllIIIlIIllIIllI) || lIlllIIIlIIlIIl(lllllllllllllIlIIllIIIlIIllIIllI.isEmpty() ? 1 : 0))) {
            lllllllllllllIlIIllIIIlIIllIIIlI.write(lllllllllllllIlIIllIIIlIIllIlIlI, lllllllllllllIlIIllIIIlIIllIlIII);
            "".length();
            return;
        }
        final ToSend lllllllllllllIlIIllIIIlIIllIIlIl = new ToSend(lllllllllllllIlIIllIIIlIIllIlIIl, lllllllllllllIlIIllIIIlIIllIlIlI, lllllllllllllIlIIllIIIlIIllIlIII);
        if (lIlllIIIlIIIlll(lllllllllllllIlIIllIIIlIIllIIllI)) {
            lllllllllllllIlIIllIIIlIIllIIllI = new LinkedList<ToSend>();
            this.messagesQueues.put(lllllllllllllIlIIllIIIlIIllIIlll, lllllllllllllIlIIllIIIlIIllIIllI);
            "".length();
        }
        lllllllllllllIlIIllIIIlIIllIIllI.add(lllllllllllllIlIIllIIIlIIllIIlIl);
        "".length();
        final List<ToSend> lllllllllllllIlIIllIIIlIIllIIlII = lllllllllllllIlIIllIIIlIIllIIllI;
        lllllllllllllIlIIllIIIlIIllIIIlI.executor().schedule((Runnable)new Runnable() {
            @Override
            public void run() {
                GlobalTrafficShapingHandler.this.sendAllValid(lllllllllllllIlIIllIIIlIIllIIIlI, lllllllllllllIlIIllIIIlIIllIIlII);
            }
        }, lllllllllllllIlIIllIIIlIIllIlIIl, TimeUnit.MILLISECONDS);
        "".length();
    }
    
    public GlobalTrafficShapingHandler(final ScheduledExecutorService lllllllllllllIlIIllIIIlIlIlIlIll, final long lllllllllllllIlIIllIIIlIlIlIlIlI) {
        super(lllllllllllllIlIIllIIIlIlIlIlIlI);
        this.messagesQueues = new HashMap<Integer, List<ToSend>>();
        this.createGlobalTrafficCounter(lllllllllllllIlIIllIIIlIlIlIlIll);
    }
    
    private static int lIlllIIIlIIllII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    static {
        lIlllIIIlIIIllI();
        lIlllIIIlIIIIlI();
    }
    
    private static int lIlllIIIlIIlIlI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public void handlerAdded(final ChannelHandlerContext lllllllllllllIlIIllIIIlIlIIIlIlI) throws Exception {
        final Integer lllllllllllllIlIIllIIIlIlIIIllIl = lllllllllllllIlIIllIIIlIlIIIlIlI.channel().hashCode();
        final List<ToSend> lllllllllllllIlIIllIIIlIlIIIllII = new LinkedList<ToSend>();
        this.messagesQueues.put(lllllllllllllIlIIllIIIlIlIIIllIl, lllllllllllllIlIIllIIIlIlIIIllII);
        "".length();
    }
    
    void createGlobalTrafficCounter(final ScheduledExecutorService lllllllllllllIlIIllIIIlIlllIIlII) {
        if (lIlllIIIlIIIlll(lllllllllllllIlIIllIIIlIlllIIlII)) {
            throw new NullPointerException(GlobalTrafficShapingHandler.lIIIIlIIlIIIll[GlobalTrafficShapingHandler.lIIIIlIIlIIlll[0]]);
        }
        final TrafficCounter lllllllllllllIlIIllIIIlIlllIIllI = new TrafficCounter(this, lllllllllllllIlIIllIIIlIlllIIlII, GlobalTrafficShapingHandler.lIIIIlIIlIIIll[GlobalTrafficShapingHandler.lIIIIlIIlIIlll[1]], this.checkInterval);
        this.setTrafficCounter(lllllllllllllIlIIllIIIlIlllIIllI);
        lllllllllllllIlIIllIIIlIlllIIllI.start();
    }
    
    private static boolean lIlllIIIlIIlllI(final int lllllllllllllIlIIllIIIlIIIlIllIl, final int lllllllllllllIlIIllIIIlIIIlIllII) {
        return lllllllllllllIlIIllIIIlIIIlIllIl < lllllllllllllIlIIllIIIlIIIlIllII;
    }
    
    public GlobalTrafficShapingHandler(final EventExecutor lllllllllllllIlIIllIIIlIlIlIIIll) {
        this.messagesQueues = new HashMap<Integer, List<ToSend>>();
        this.createGlobalTrafficCounter(lllllllllllllIlIIllIIIlIlIlIIIll);
    }
    
    private static final class ToSend
    {
        final /* synthetic */ long date;
        final /* synthetic */ Object toSend;
        final /* synthetic */ ChannelPromise promise;
        
        private ToSend(final long lllllllllllllIIlIllIIlllIIllIlIl, final Object lllllllllllllIIlIllIIlllIIllIlII, final ChannelPromise lllllllllllllIIlIllIIlllIIllIIll) {
            this.date = System.currentTimeMillis() + lllllllllllllIIlIllIIlllIIllIlIl;
            this.toSend = lllllllllllllIIlIllIIlllIIllIlII;
            this.promise = lllllllllllllIIlIllIIlllIIllIIll;
        }
    }
}
