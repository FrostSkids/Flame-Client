// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.traffic;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.TimeUnit;
import io.netty.channel.ChannelPromise;
import java.util.concurrent.ScheduledExecutorService;
import java.util.LinkedList;
import java.util.Iterator;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.util.List;

public class ChannelTrafficShapingHandler extends AbstractTrafficShapingHandler
{
    private /* synthetic */ List<ToSend> messagesQueue;
    private static final /* synthetic */ String[] lIIlIIIIIlllll;
    private static final /* synthetic */ int[] lIIlIIIIlIIIII;
    
    private static boolean llIIlIIlIlIlIll(final Object lllllllllllllIIlllIlllIIIlIlIIlI) {
        return lllllllllllllIIlllIlllIIIlIlIIlI != null;
    }
    
    private static int llIIlIIlIlIllll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    static {
        llIIlIIlIlIlIlI();
        llIIlIIlIlIlIIl();
    }
    
    @Override
    public synchronized void handlerRemoved(final ChannelHandlerContext lllllllllllllIIlllIlllIIlIIIIlIl) throws Exception {
        if (llIIlIIlIlIlIll(this.trafficCounter)) {
            this.trafficCounter.stop();
        }
        final Iterator lllllllllllllIIlllIlllIIlIIIIlll = this.messagesQueue.iterator();
        while (llIIlIIlIlIllII(lllllllllllllIIlllIlllIIlIIIIlll.hasNext() ? 1 : 0)) {
            final ToSend lllllllllllllIIlllIlllIIlIIIlIII = lllllllllllllIIlllIlllIIlIIIIlll.next();
            if (llIIlIIlIlIllII((lllllllllllllIIlllIlllIIlIIIlIII.toSend instanceof ByteBuf) ? 1 : 0)) {
                ((ByteBuf)lllllllllllllIIlllIlllIIlIIIlIII.toSend).release();
                "".length();
            }
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        this.messagesQueue.clear();
    }
    
    public ChannelTrafficShapingHandler(final long lllllllllllllIIlllIlllIIlIIlllII, final long lllllllllllllIIlllIlllIIlIIllllI) {
        super(lllllllllllllIIlllIlllIIlIIlllII, lllllllllllllIIlllIlllIIlIIllllI);
        this.messagesQueue = new LinkedList<ToSend>();
    }
    
    private static void llIIlIIlIlIlIIl() {
        (lIIlIIIIIlllll = new String[ChannelTrafficShapingHandler.lIIlIIIIlIIIII[1]])[ChannelTrafficShapingHandler.lIIlIIIIlIIIII[0]] = llIIlIIlIlIlIII("KNG3xqKjv73xI9QtudMvKQ==", "vMYBB");
    }
    
    private static void llIIlIIlIlIlIlI() {
        (lIIlIIIIlIIIII = new int[3])[0] = ((0xA8 ^ 0x8F ^ (0x38 ^ 0x46)) & (177 + 110 - 266 + 212 ^ 105 + 157 - 141 + 55 ^ -" ".length()));
        ChannelTrafficShapingHandler.lIIlIIIIlIIIII[1] = " ".length();
        ChannelTrafficShapingHandler.lIIlIIIIlIIIII[2] = "  ".length();
    }
    
    private synchronized void sendAllValid(final ChannelHandlerContext lllllllllllllIIlllIlllIIIllIlIII) {
        while (llIIlIIlIlIlllI(this.messagesQueue.isEmpty() ? 1 : 0)) {
            final ToSend lllllllllllllIIlllIlllIIIllIllII = this.messagesQueue.remove(ChannelTrafficShapingHandler.lIIlIIIIlIIIII[0]);
            if (llIIlIIlIllIIII(llIIlIIlIlIllll(lllllllllllllIIlllIlllIIIllIllII.date, System.currentTimeMillis()))) {
                lllllllllllllIIlllIlllIIIllIlIII.write(lllllllllllllIIlllIlllIIIllIllII.toSend, lllllllllllllIIlllIlllIIIllIllII.promise);
                "".length();
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
                "".length();
                if (null != null) {
                    return;
                }
                continue;
            }
            else {
                this.messagesQueue.add(ChannelTrafficShapingHandler.lIIlIIIIlIIIII[0], lllllllllllllIIlllIlllIIIllIllII);
                "".length();
                if (-(0x4E ^ 0x4B) >= 0) {
                    return;
                }
                break;
            }
        }
        lllllllllllllIIlllIlllIIIllIlIII.flush();
        "".length();
    }
    
    private static boolean llIIlIIlIllIIII(final int lllllllllllllIIlllIlllIIIlIIllII) {
        return lllllllllllllIIlllIlllIIIlIIllII <= 0;
    }
    
    private static int llIIlIIlIlIllIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean llIIlIIlIlIlllI(final int lllllllllllllIIlllIlllIIIlIIlllI) {
        return lllllllllllllIIlllIlllIIIlIIlllI == 0;
    }
    
    public ChannelTrafficShapingHandler(final long lllllllllllllIIlllIlllIIlIlllIII, final long lllllllllllllIIlllIlllIIlIllIIlI, final long lllllllllllllIIlllIlllIIlIllIllI, final long lllllllllllllIIlllIlllIIlIllIlIl) {
        super(lllllllllllllIIlllIlllIIlIlllIII, lllllllllllllIIlllIlllIIlIllIIlI, lllllllllllllIIlllIlllIIlIllIllI, lllllllllllllIIlllIlllIIlIllIlIl);
        this.messagesQueue = new LinkedList<ToSend>();
    }
    
    public ChannelTrafficShapingHandler(final long lllllllllllllIIlllIlllIIlIIlIlll) {
        super(lllllllllllllIIlllIlllIIlIIlIlll);
        this.messagesQueue = new LinkedList<ToSend>();
    }
    
    @Override
    public void handlerAdded(final ChannelHandlerContext lllllllllllllIIlllIlllIIlIIlIIII) throws Exception {
        final TrafficCounter lllllllllllllIIlllIlllIIlIIIllll = new TrafficCounter(this, lllllllllllllIIlllIlllIIlIIlIIII.executor(), String.valueOf(new StringBuilder().append(ChannelTrafficShapingHandler.lIIlIIIIIlllll[ChannelTrafficShapingHandler.lIIlIIIIlIIIII[0]]).append(lllllllllllllIIlllIlllIIlIIlIIII.channel().hashCode())), this.checkInterval);
        this.setTrafficCounter(lllllllllllllIIlllIlllIIlIIIllll);
        lllllllllllllIIlllIlllIIlIIIllll.start();
    }
    
    @Override
    protected synchronized void submitWrite(final ChannelHandlerContext lllllllllllllIIlllIlllIIIlllIlII, final Object lllllllllllllIIlllIlllIIIllllIIl, final long lllllllllllllIIlllIlllIIIlllIIlI, final ChannelPromise lllllllllllllIIlllIlllIIIlllIIIl) {
        if (llIIlIIlIlIlllI(llIIlIIlIlIllIl(lllllllllllllIIlllIlllIIIlllIIlI, 0L)) && llIIlIIlIlIllII(this.messagesQueue.isEmpty() ? 1 : 0)) {
            lllllllllllllIIlllIlllIIIlllIlII.write(lllllllllllllIIlllIlllIIIllllIIl, lllllllllllllIIlllIlllIIIlllIIIl);
            "".length();
            return;
        }
        final ToSend lllllllllllllIIlllIlllIIIlllIllI = new ToSend(lllllllllllllIIlllIlllIIIlllIIlI, lllllllllllllIIlllIlllIIIllllIIl, lllllllllllllIIlllIlllIIIlllIIIl);
        this.messagesQueue.add(lllllllllllllIIlllIlllIIIlllIllI);
        "".length();
        lllllllllllllIIlllIlllIIIlllIlII.executor().schedule((Runnable)new Runnable() {
            @Override
            public void run() {
                ChannelTrafficShapingHandler.this.sendAllValid(lllllllllllllIIlllIlllIIIlllIlII);
            }
        }, lllllllllllllIIlllIlllIIIlllIIlI, TimeUnit.MILLISECONDS);
        "".length();
    }
    
    public ChannelTrafficShapingHandler(final long lllllllllllllIIlllIlllIIlIlIIllI, final long lllllllllllllIIlllIlllIIlIlIlIIl, final long lllllllllllllIIlllIlllIIlIlIIlII) {
        super(lllllllllllllIIlllIlllIIlIlIIllI, lllllllllllllIIlllIlllIIlIlIlIIl, lllllllllllllIIlllIlllIIlIlIIlII);
        this.messagesQueue = new LinkedList<ToSend>();
    }
    
    private static boolean llIIlIIlIlIllII(final int lllllllllllllIIlllIlllIIIlIlIIII) {
        return lllllllllllllIIlllIlllIIIlIlIIII != 0;
    }
    
    private static String llIIlIIlIlIlIII(final String lllllllllllllIIlllIlllIIIlIlIlll, final String lllllllllllllIIlllIlllIIIlIllIII) {
        try {
            final SecretKeySpec lllllllllllllIIlllIlllIIIlIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIlllIIIlIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllIlllIIIlIllIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllIlllIIIlIllIll.init(ChannelTrafficShapingHandler.lIIlIIIIlIIIII[2], lllllllllllllIIlllIlllIIIlIlllII);
            return new String(lllllllllllllIIlllIlllIIIlIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIlllIIIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIlllIIIlIllIlI) {
            lllllllllllllIIlllIlllIIIlIllIlI.printStackTrace();
            return null;
        }
    }
    
    private static final class ToSend
    {
        final /* synthetic */ ChannelPromise promise;
        final /* synthetic */ long date;
        final /* synthetic */ Object toSend;
        
        private ToSend(final long llllllllllllIlllIllIllllllIIIIII, final Object llllllllllllIlllIllIlllllIllIlll, final ChannelPromise llllllllllllIlllIllIlllllIllIlIl) {
            this.date = System.currentTimeMillis() + llllllllllllIlllIllIllllllIIIIII;
            this.toSend = llllllllllllIlllIllIlllllIllIlll;
            this.promise = llllllllllllIlllIllIlllllIllIlIl;
        }
    }
}
