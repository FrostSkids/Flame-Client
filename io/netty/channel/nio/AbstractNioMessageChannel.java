// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.nio;

import java.util.ArrayList;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.ChannelConfig;
import io.netty.channel.ServerChannel;
import java.nio.channels.SelectionKey;
import java.io.IOException;
import java.util.List;
import io.netty.channel.AbstractChannel;
import java.nio.channels.SelectableChannel;
import io.netty.channel.Channel;
import io.netty.channel.ChannelOutboundBuffer;

public abstract class AbstractNioMessageChannel extends AbstractNioChannel
{
    private static final /* synthetic */ int[] lllIIllIIIIIIl;
    
    private static boolean lIlIIIIIIIIIlIII(final int llllllllllllIlIllllIIIlllllIllIl) {
        return llllllllllllIlIllllIIIlllllIllIl >= 0;
    }
    
    protected abstract boolean doWriteMessage(final Object p0, final ChannelOutboundBuffer p1) throws Exception;
    
    protected AbstractNioMessageChannel(final Channel llllllllllllIlIllllIIlIIIIIlIlII, final SelectableChannel llllllllllllIlIllllIIlIIIIIlIlll, final int llllllllllllIlIllllIIlIIIIIlIllI) {
        super(llllllllllllIlIllllIIlIIIIIlIlII, llllllllllllIlIllllIIlIIIIIlIlll, llllllllllllIlIllllIIlIIIIIlIllI);
    }
    
    private static boolean lIlIIIIIIIIIlIIl(final int llllllllllllIlIllllIIIlllllIllll) {
        return llllllllllllIlIllllIIIlllllIllll == 0;
    }
    
    private static boolean lIlIIIIIIIIIIlll(final int llllllllllllIlIllllIIIllllllIIIl) {
        return llllllllllllIlIllllIIIllllllIIIl != 0;
    }
    
    private static void lIlIIIIIIIIIIlIl() {
        (lllIIllIIIIIIl = new int[4])[0] = (0x2B ^ 0x34 ^ (0xAF ^ 0xB4));
        AbstractNioMessageChannel.lllIIllIIIIIIl[1] = -(0x8 ^ 0xD);
        AbstractNioMessageChannel.lllIIllIIIIIIl[2] = ((0xFF ^ 0x9D) & ~(0xF ^ 0x6D));
        AbstractNioMessageChannel.lllIIllIIIIIIl[3] = " ".length();
    }
    
    protected boolean continueOnWriteError() {
        return AbstractNioMessageChannel.lllIIllIIIIIIl[2] != 0;
    }
    
    protected abstract int doReadMessages(final List<Object> p0) throws Exception;
    
    @Override
    protected void doWrite(final ChannelOutboundBuffer llllllllllllIlIllllIIlIIIIIIIIlI) throws Exception {
        final SelectionKey llllllllllllIlIllllIIlIIIIIIIIIl = this.selectionKey();
        final int llllllllllllIlIllllIIlIIIIIIIIII = llllllllllllIlIllllIIlIIIIIIIIIl.interestOps();
        do {
            final Object llllllllllllIlIllllIIlIIIIIIIlII = llllllllllllIlIllllIIlIIIIIIIIlI.current();
            if (!lIlIIIIIIIIIIllI(llllllllllllIlIllllIIlIIIIIIIlII)) {
                try {
                    boolean llllllllllllIlIllllIIlIIIIIIIllI = AbstractNioMessageChannel.lllIIllIIIIIIl[2] != 0;
                    int llllllllllllIlIllllIIlIIIIIIIlll = this.config().getWriteSpinCount() - AbstractNioMessageChannel.lllIIllIIIIIIl[3];
                    while (lIlIIIIIIIIIlIII(llllllllllllIlIllllIIlIIIIIIIlll)) {
                        if (lIlIIIIIIIIIIlll(this.doWriteMessage(llllllllllllIlIllllIIlIIIIIIIlII, llllllllllllIlIllllIIlIIIIIIIIlI) ? 1 : 0)) {
                            llllllllllllIlIllllIIlIIIIIIIllI = (AbstractNioMessageChannel.lllIIllIIIIIIl[3] != 0);
                            "".length();
                            if ((0x21 ^ 0x25) <= "   ".length()) {
                                return;
                            }
                            break;
                        }
                        else {
                            --llllllllllllIlIllllIIlIIIIIIIlll;
                            "".length();
                            if (((0xA0 ^ 0xA9) & ~(0x1F ^ 0x16)) >= "  ".length()) {
                                return;
                            }
                            continue;
                        }
                    }
                    if (lIlIIIIIIIIIIlll(llllllllllllIlIllllIIlIIIIIIIllI ? 1 : 0)) {
                        llllllllllllIlIllllIIlIIIIIIIIlI.remove();
                        "".length();
                        "".length();
                        if (("   ".length() & ~"   ".length()) > 0) {
                            return;
                        }
                        "".length();
                        if (" ".length() > (0x8A ^ 0xB3 ^ (0x3 ^ 0x3E))) {
                            return;
                        }
                    }
                    else {
                        if (lIlIIIIIIIIIlIIl(llllllllllllIlIllllIIlIIIIIIIIII & AbstractNioMessageChannel.lllIIllIIIIIIl[0])) {
                            llllllllllllIlIllllIIlIIIIIIIIIl.interestOps(llllllllllllIlIllllIIlIIIIIIIIII | AbstractNioMessageChannel.lllIIllIIIIIIl[0]);
                            "".length();
                        }
                        "".length();
                        if (-" ".length() > " ".length()) {
                            return;
                        }
                        return;
                    }
                }
                catch (IOException llllllllllllIlIllllIIlIIIIIIIlIl) {
                    if (!lIlIIIIIIIIIIlll(this.continueOnWriteError() ? 1 : 0)) {
                        throw llllllllllllIlIllllIIlIIIIIIIlIl;
                    }
                    llllllllllllIlIllllIIlIIIIIIIIlI.remove(llllllllllllIlIllllIIlIIIIIIIlIl);
                    "".length();
                    "".length();
                    if (((0x25 ^ 0x7E) & ~(0x7F ^ 0x24)) > (0x5E ^ 0x5A)) {
                        return;
                    }
                }
                "".length();
                continue;
            }
            if (lIlIIIIIIIIIIlll(llllllllllllIlIllllIIlIIIIIIIIII & AbstractNioMessageChannel.lllIIllIIIIIIl[0])) {
                llllllllllllIlIllllIIlIIIIIIIIIl.interestOps(llllllllllllIlIllllIIlIIIIIIIIII & AbstractNioMessageChannel.lllIIllIIIIIIl[1]);
                "".length();
                "".length();
                if (((0x2E ^ 0x5F ^ (0x65 ^ 0x44)) & (0xDF ^ 0xB5 ^ (0x2E ^ 0x14) ^ -" ".length())) == "  ".length()) {
                    return;
                }
            }
        } while ((132 + 86 - 202 + 144 ^ 1 + 162 - 50 + 51) > " ".length());
    }
    
    private static boolean lIlIIIIIIIIIIllI(final Object llllllllllllIlIllllIIIllllllIIll) {
        return llllllllllllIlIllllIIIllllllIIll == null;
    }
    
    @Override
    protected AbstractNioUnsafe newUnsafe() {
        return new NioMessageUnsafe();
    }
    
    static {
        lIlIIIIIIIIIIlIl();
    }
    
    private final class NioMessageUnsafe extends AbstractNioUnsafe
    {
        private static final /* synthetic */ int[] llIIIIlllllIII;
        private final /* synthetic */ List<Object> readBuf;
        static final /* synthetic */ boolean $assertionsDisabled;
        
        private static boolean lIIIlIIIlIIIIlll(final int llllllllllllIlllIllIIllIIlIIlIII) {
            return llllllllllllIlllIllIIllIIlIIlIII != 0;
        }
        
        private static boolean lIIIlIIIlIIIIlIl(final int llllllllllllIlllIllIIllIIlIIllIl, final int llllllllllllIlllIllIIllIIlIIllII) {
            return llllllllllllIlllIllIIllIIlIIllIl < llllllllllllIlllIllIIllIIlIIllII;
        }
        
        private static boolean lIIIlIIIlIIIIllI(final Object llllllllllllIlllIllIIllIIlIIlIlI) {
            return llllllllllllIlllIllIIllIIlIIlIlI != null;
        }
        
        private static boolean lIIIlIIIlIIIIIlI(final int llllllllllllIlllIllIIllIIlIIIlII) {
            return llllllllllllIlllIllIIllIIlIIIlII < 0;
        }
        
        private static void lIIIlIIIlIIIIIII() {
            (llIIIIlllllIII = new int[2])[0] = ((0x67 ^ 0x48) & ~(0x4A ^ 0x65));
            NioMessageUnsafe.llIIIIlllllIII[1] = " ".length();
        }
        
        static {
            lIIIlIIIlIIIIIII();
            int $assertionsDisabled2;
            if (lIIIlIIIlIIIIIIl(AbstractNioMessageChannel.class.desiredAssertionStatus() ? 1 : 0)) {
                $assertionsDisabled2 = NioMessageUnsafe.llIIIIlllllIII[1];
                "".length();
                if (" ".length() == "  ".length()) {
                    return;
                }
            }
            else {
                $assertionsDisabled2 = NioMessageUnsafe.llIIIIlllllIII[0];
            }
            $assertionsDisabled = ($assertionsDisabled2 != 0);
        }
        
        private static boolean lIIIlIIIlIIIIlII(final int llllllllllllIlllIllIIllIIlIlIIIl, final int llllllllllllIlllIllIIllIIlIlIIII) {
            return llllllllllllIlllIllIIllIIlIlIIIl >= llllllllllllIlllIllIIllIIlIlIIII;
        }
        
        @Override
        public void read() {
            if (lIIIlIIIlIIIIIIl(NioMessageUnsafe.$assertionsDisabled ? 1 : 0) && lIIIlIIIlIIIIIIl(AbstractNioMessageChannel.this.eventLoop().inEventLoop() ? 1 : 0)) {
                throw new AssertionError();
            }
            final ChannelConfig llllllllllllIlllIllIIllIIllIlIII = AbstractNioMessageChannel.this.config();
            if (lIIIlIIIlIIIIIIl(llllllllllllIlllIllIIllIIllIlIII.isAutoRead() ? 1 : 0) && lIIIlIIIlIIIIIIl(AbstractNioMessageChannel.this.isReadPending() ? 1 : 0)) {
                this.removeReadOp();
                return;
            }
            final int llllllllllllIlllIllIIllIIllIIlll = llllllllllllIlllIllIIllIIllIlIII.getMaxMessagesPerRead();
            final ChannelPipeline llllllllllllIlllIllIIllIIllIIllI = AbstractNioMessageChannel.this.pipeline();
            boolean llllllllllllIlllIllIIllIIllIIlIl = NioMessageUnsafe.llIIIIlllllIII[0] != 0;
            Throwable llllllllllllIlllIllIIllIIllIIlII = null;
            try {
                Label_0258: {
                    try {
                        do {
                            final int llllllllllllIlllIllIIllIIllIllIl = AbstractNioMessageChannel.this.doReadMessages(this.readBuf);
                            if (lIIIlIIIlIIIIIIl(llllllllllllIlllIllIIllIIllIllIl)) {
                                "".length();
                                if ("   ".length() == 0) {
                                    return;
                                }
                            }
                            else if (lIIIlIIIlIIIIIlI(llllllllllllIlllIllIIllIIllIllIl)) {
                                llllllllllllIlllIllIIllIIllIIlIl = (NioMessageUnsafe.llIIIIlllllIII[1] != 0);
                                "".length();
                                if (-" ".length() >= "  ".length()) {
                                    return;
                                }
                            }
                            else if (lIIIlIIIlIIIIIIl(llllllllllllIlllIllIIllIIllIlIII.isAutoRead() ? 1 : 0)) {
                                "".length();
                                if (null != null) {
                                    return;
                                }
                            }
                            else {
                                if (!lIIIlIIIlIIIIlII(this.readBuf.size(), llllllllllllIlllIllIIllIIllIIlll)) {
                                    "".length();
                                    continue;
                                }
                                "".length();
                                if (null != null) {
                                    return;
                                }
                            }
                            "".length();
                            if (null != null) {
                                return;
                            }
                            break Label_0258;
                        } while ((0x2A ^ 0x7D ^ (0xE5 ^ 0xB6)) != 0x0);
                        return;
                    }
                    catch (Throwable llllllllllllIlllIllIIllIIllIllII) {
                        llllllllllllIlllIllIIllIIllIIlII = llllllllllllIlllIllIIllIIllIllII;
                    }
                }
                AbstractNioMessageChannel.this.setReadPending((boolean)(NioMessageUnsafe.llIIIIlllllIII[0] != 0));
                final int llllllllllllIlllIllIIllIIllIlIlI = this.readBuf.size();
                int llllllllllllIlllIllIIllIIllIlIll = NioMessageUnsafe.llIIIIlllllIII[0];
                while (lIIIlIIIlIIIIlIl(llllllllllllIlllIllIIllIIllIlIll, llllllllllllIlllIllIIllIIllIlIlI)) {
                    llllllllllllIlllIllIIllIIllIIllI.fireChannelRead(this.readBuf.get(llllllllllllIlllIllIIllIIllIlIll));
                    "".length();
                    ++llllllllllllIlllIllIIllIIllIlIll;
                    "".length();
                    if ("  ".length() > "   ".length()) {
                        return;
                    }
                }
                this.readBuf.clear();
                llllllllllllIlllIllIIllIIllIIllI.fireChannelReadComplete();
                "".length();
                if (lIIIlIIIlIIIIllI(llllllllllllIlllIllIIllIIllIIlII)) {
                    if (lIIIlIIIlIIIIlll((llllllllllllIlllIllIIllIIllIIlII instanceof IOException) ? 1 : 0)) {
                        int n;
                        if (lIIIlIIIlIIIIIIl((AbstractNioMessageChannel.this instanceof ServerChannel) ? 1 : 0)) {
                            n = NioMessageUnsafe.llIIIIlllllIII[1];
                            "".length();
                            if (((185 + 113 - 237 + 148 ^ 125 + 39 - 62 + 47) & (0x3D ^ 0xB ^ (0x13 ^ 0x61) ^ -" ".length())) != ((0x16 ^ 0x26 ^ (0x91 ^ 0x8E)) & (71 + 52 - 21 + 41 ^ 132 + 113 - 131 + 46 ^ -" ".length()))) {
                                return;
                            }
                        }
                        else {
                            n = NioMessageUnsafe.llIIIIlllllIII[0];
                        }
                        llllllllllllIlllIllIIllIIllIIlIl = (n != 0);
                    }
                    llllllllllllIlllIllIIllIIllIIllI.fireExceptionCaught(llllllllllllIlllIllIIllIIllIIlII);
                    "".length();
                }
                if (lIIIlIIIlIIIIlll(llllllllllllIlllIllIIllIIllIIlIl ? 1 : 0) && lIIIlIIIlIIIIlll(AbstractNioMessageChannel.this.isOpen() ? 1 : 0)) {
                    this.close(this.voidPromise());
                }
                if (lIIIlIIIlIIIIIIl(llllllllllllIlllIllIIllIIllIlIII.isAutoRead() ? 1 : 0) && lIIIlIIIlIIIIIIl(AbstractNioMessageChannel.this.isReadPending() ? 1 : 0)) {
                    this.removeReadOp();
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
            }
            finally {
                if (lIIIlIIIlIIIIIIl(llllllllllllIlllIllIIllIIllIlIII.isAutoRead() ? 1 : 0) && lIIIlIIIlIIIIIIl(AbstractNioMessageChannel.this.isReadPending() ? 1 : 0)) {
                    this.removeReadOp();
                }
            }
        }
        
        private static boolean lIIIlIIIlIIIIIIl(final int llllllllllllIlllIllIIllIIlIIIllI) {
            return llllllllllllIlllIllIIllIIlIIIllI == 0;
        }
        
        private NioMessageUnsafe() {
            this.readBuf = new ArrayList<Object>();
        }
    }
}
