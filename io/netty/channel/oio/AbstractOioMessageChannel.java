// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.oio;

import java.util.ArrayList;
import io.netty.channel.Channel;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.ChannelConfig;
import java.io.IOException;
import java.util.List;

public abstract class AbstractOioMessageChannel extends AbstractOioChannel
{
    private final /* synthetic */ List<Object> readBuf;
    private static final /* synthetic */ int[] lIIlIIllllIIlI;
    
    private static void llIIlllIlIllIIl() {
        (lIIlIIllllIIlI = new int[2])[0] = ((0x8 ^ 0xE) & ~(0x8 ^ 0xE));
        AbstractOioMessageChannel.lIIlIIllllIIlI[1] = " ".length();
    }
    
    @Override
    protected void doRead() {
        final ChannelConfig lllllllllllllIIllIlIllllIlIIIlII = this.config();
        final ChannelPipeline lllllllllllllIIllIlIllllIlIIIIll = this.pipeline();
        boolean lllllllllllllIIllIlIllllIlIIIIlI = AbstractOioMessageChannel.lIIlIIllllIIlI[0] != 0;
        final int lllllllllllllIIllIlIllllIlIIIIIl = lllllllllllllIIllIlIllllIlIIIlII.getMaxMessagesPerRead();
        Throwable lllllllllllllIIllIlIllllIlIIIIII = null;
        int lllllllllllllIIllIlIllllIIllllll = AbstractOioMessageChannel.lIIlIIllllIIlI[0];
        Label_0166: {
            try {
                while (true) {
                    do {
                        lllllllllllllIIllIlIllllIIllllll = this.doReadMessages(this.readBuf);
                        if (llIIlllIlIllIlI(lllllllllllllIIllIlIllllIIllllll)) {
                            "".length();
                            if ((0x23 ^ 0x27) < 0) {
                                return;
                            }
                        }
                        else if (llIIlllIlIllIll(lllllllllllllIIllIlIllllIIllllll)) {
                            lllllllllllllIIllIlIllllIlIIIIlI = (AbstractOioMessageChannel.lIIlIIllllIIlI[1] != 0);
                            "".length();
                            if ("  ".length() <= 0) {
                                return;
                            }
                        }
                        else if (llIIlllIlIlllII(this.readBuf.size(), lllllllllllllIIllIlIllllIlIIIIIl)) {
                            continue;
                        }
                        "".length();
                        if ("  ".length() == 0) {
                            return;
                        }
                        break Label_0166;
                    } while (!llIIlllIlIllIlI(lllllllllllllIIllIlIllllIlIIIlII.isAutoRead() ? 1 : 0));
                    "".length();
                    if (" ".length() != " ".length()) {
                        return;
                    }
                    continue;
                }
            }
            catch (Throwable lllllllllllllIIllIlIllllIlIIIlll) {
                lllllllllllllIIllIlIllllIlIIIIII = lllllllllllllIIllIlIllllIlIIIlll;
            }
        }
        final int lllllllllllllIIllIlIllllIIlllllI = this.readBuf.size();
        int lllllllllllllIIllIlIllllIlIIIllI = AbstractOioMessageChannel.lIIlIIllllIIlI[0];
        while (llIIlllIlIlllII(lllllllllllllIIllIlIllllIlIIIllI, lllllllllllllIIllIlIllllIIlllllI)) {
            lllllllllllllIIllIlIllllIlIIIIll.fireChannelRead(this.readBuf.get(lllllllllllllIIllIlIllllIlIIIllI));
            "".length();
            ++lllllllllllllIIllIlIllllIlIIIllI;
            "".length();
            if (" ".length() < " ".length()) {
                return;
            }
        }
        this.readBuf.clear();
        lllllllllllllIIllIlIllllIlIIIIll.fireChannelReadComplete();
        "".length();
        if (llIIlllIlIlllIl(lllllllllllllIIllIlIllllIlIIIIII)) {
            if (llIIlllIlIllllI((lllllllllllllIIllIlIllllIlIIIIII instanceof IOException) ? 1 : 0)) {
                lllllllllllllIIllIlIllllIlIIIIlI = (AbstractOioMessageChannel.lIIlIIllllIIlI[1] != 0);
            }
            this.pipeline().fireExceptionCaught(lllllllllllllIIllIlIllllIlIIIIII);
            "".length();
        }
        if (llIIlllIlIllllI(lllllllllllllIIllIlIllllIlIIIIlI ? 1 : 0)) {
            if (llIIlllIlIllllI(this.isOpen() ? 1 : 0)) {
                this.unsafe().close(this.unsafe().voidPromise());
                "".length();
                if (-" ".length() > "  ".length()) {
                    return;
                }
            }
        }
        else if (llIIlllIlIllIlI(lllllllllllllIIllIlIllllIIllllll) && llIIlllIlIllllI(this.isActive() ? 1 : 0)) {
            this.read();
            "".length();
        }
    }
    
    private static boolean llIIlllIlIllIlI(final int lllllllllllllIIllIlIllllIIlIlIll) {
        return lllllllllllllIIllIlIllllIIlIlIll == 0;
    }
    
    private static boolean llIIlllIlIlllIl(final Object lllllllllllllIIllIlIllllIIlIllll) {
        return lllllllllllllIIllIlIllllIIlIllll != null;
    }
    
    static {
        llIIlllIlIllIIl();
    }
    
    private static boolean llIIlllIlIllIll(final int lllllllllllllIIllIlIllllIIlIlIIl) {
        return lllllllllllllIIllIlIllllIIlIlIIl < 0;
    }
    
    protected abstract int doReadMessages(final List<Object> p0) throws Exception;
    
    private static boolean llIIlllIlIlllII(final int lllllllllllllIIllIlIllllIIllIIlI, final int lllllllllllllIIllIlIllllIIllIIIl) {
        return lllllllllllllIIllIlIllllIIllIIlI < lllllllllllllIIllIlIllllIIllIIIl;
    }
    
    private static boolean llIIlllIlIllllI(final int lllllllllllllIIllIlIllllIIlIllIl) {
        return lllllllllllllIIllIlIllllIIlIllIl != 0;
    }
    
    protected AbstractOioMessageChannel(final Channel lllllllllllllIIllIlIllllIlIlIIIl) {
        super(lllllllllllllIIllIlIllllIlIlIIIl);
        this.readBuf = new ArrayList<Object>();
    }
}
