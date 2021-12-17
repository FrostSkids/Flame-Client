// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.oio;

import java.net.ConnectException;
import io.netty.channel.ChannelPromise;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.channel.ThreadPerChannelEventLoop;
import io.netty.channel.EventLoop;
import io.netty.channel.Channel;
import java.net.SocketAddress;
import io.netty.channel.AbstractChannel;

public abstract class AbstractOioChannel extends AbstractChannel
{
    private volatile /* synthetic */ boolean readPending;
    private static final /* synthetic */ int[] lllIIIlIIlIlII;
    private final /* synthetic */ Runnable readTask;
    
    protected abstract void doRead();
    
    private static void lIIlllIlIIllllll() {
        (lllIIIlIIlIlII = new int[2])[0] = " ".length();
        AbstractOioChannel.lllIIIlIIlIlII[1] = (0xFFFFE3FE & 0x1FE9);
    }
    
    protected void setReadPending(final boolean llllllllllllIllIIIIIllIIIIlIlIlI) {
        this.readPending = llllllllllllIllIIIIIllIIIIlIlIlI;
    }
    
    protected boolean isReadPending() {
        return this.readPending;
    }
    
    protected abstract void doConnect(final SocketAddress p0, final SocketAddress p1) throws Exception;
    
    @Override
    protected void doBeginRead() throws Exception {
        if (lIIlllIlIlIIIIII(this.isReadPending() ? 1 : 0)) {
            return;
        }
        this.setReadPending((boolean)(AbstractOioChannel.lllIIIlIIlIlII[0] != 0));
        this.eventLoop().execute(this.readTask);
    }
    
    protected AbstractOioChannel(final Channel llllllllllllIllIIIIIllIIIIllllIl) {
        super(llllllllllllIllIIIIIllIIIIllllIl);
        this.readTask = new Runnable() {
            private static final /* synthetic */ int[] llIllllIlIIIlI;
            
            static {
                lIIllIlIlIlIIlII();
            }
            
            private static boolean lIIllIlIlIlIIlIl(final int llllllllllllIllIIIlllIllIIIllIIl) {
                return llllllllllllIllIIIlllIllIIIllIIl == 0;
            }
            
            private static void lIIllIlIlIlIIlII() {
                (llIllllIlIIIlI = new int[1])[0] = ((56 + 53 + 30 + 108 ^ 85 + 139 - 158 + 126) & (0x8F ^ 0xA0 ^ (0x41 ^ 0x59) ^ -" ".length()));
            }
            
            @Override
            public void run() {
                if (lIIllIlIlIlIIlIl(AbstractOioChannel.this.isReadPending() ? 1 : 0) && lIIllIlIlIlIIlIl(AbstractOioChannel.this.config().isAutoRead() ? 1 : 0)) {
                    return;
                }
                AbstractOioChannel.this.setReadPending((boolean)(AbstractOioChannel$1.llIllllIlIIIlI[0] != 0));
                AbstractOioChannel.this.doRead();
            }
        };
    }
    
    private static boolean lIIlllIlIlIIIIII(final int llllllllllllIllIIIIIllIIIIlIIllI) {
        return llllllllllllIllIIIIIllIIIIlIIllI != 0;
    }
    
    @Override
    protected AbstractUnsafe newUnsafe() {
        return new DefaultOioUnsafe();
    }
    
    static {
        lIIlllIlIIllllll();
        SO_TIMEOUT = AbstractOioChannel.lllIIIlIIlIlII[1];
    }
    
    @Override
    protected boolean isCompatible(final EventLoop llllllllllllIllIIIIIllIIIIllIlIl) {
        return llllllllllllIllIIIIIllIIIIllIlIl instanceof ThreadPerChannelEventLoop;
    }
    
    private final class DefaultOioUnsafe extends AbstractUnsafe
    {
        private static final /* synthetic */ String[] lIllIllIlllIlI;
        private static final /* synthetic */ int[] lIllIllIlllIll;
        
        private static void llllllllllIIIIl() {
            (lIllIllIlllIlI = new String[DefaultOioUnsafe.lIllIllIlllIll[1]])[DefaultOioUnsafe.lIllIllIlllIll[0]] = lllllllllIlllll("eFA=", "BpJqM");
        }
        
        private static String lllllllllIlllll(String llllllllllllIllllllIlIlIllIlIlII, final String llllllllllllIllllllIlIlIllIllIII) {
            llllllllllllIllllllIlIlIllIlIlII = new String(Base64.getDecoder().decode(llllllllllllIllllllIlIlIllIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllllllIlIlIllIlIlll = new StringBuilder();
            final char[] llllllllllllIllllllIlIlIllIlIllI = llllllllllllIllllllIlIlIllIllIII.toCharArray();
            int llllllllllllIllllllIlIlIllIlIlIl = DefaultOioUnsafe.lIllIllIlllIll[0];
            final long llllllllllllIllllllIlIlIllIIllll = (Object)llllllllllllIllllllIlIlIllIlIlII.toCharArray();
            final String llllllllllllIllllllIlIlIllIIlllI = (String)llllllllllllIllllllIlIlIllIIllll.length;
            byte llllllllllllIllllllIlIlIllIIllIl = (byte)DefaultOioUnsafe.lIllIllIlllIll[0];
            while (llllllllllIllll(llllllllllllIllllllIlIlIllIIllIl, (int)llllllllllllIllllllIlIlIllIIlllI)) {
                final char llllllllllllIllllllIlIlIllIllIlI = llllllllllllIllllllIlIlIllIIllll[llllllllllllIllllllIlIlIllIIllIl];
                llllllllllllIllllllIlIlIllIlIlll.append((char)(llllllllllllIllllllIlIlIllIllIlI ^ llllllllllllIllllllIlIlIllIlIllI[llllllllllllIllllllIlIlIllIlIlIl % llllllllllllIllllllIlIlIllIlIllI.length]));
                "".length();
                ++llllllllllllIllllllIlIlIllIlIlIl;
                ++llllllllllllIllllllIlIlIllIIllIl;
                "".length();
                if (-(0x46 ^ 0x42) > 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllllllIlIlIllIlIlll);
        }
        
        private static boolean llllllllllIllIl(final int llllllllllllIllllllIlIlIllIIIllI) {
            return llllllllllllIllllllIlIlIllIIIllI != 0;
        }
        
        static {
            llllllllllIllII();
            llllllllllIIIIl();
        }
        
        private static boolean llllllllllIlllI(final int llllllllllllIllllllIlIlIllIIIlII) {
            return llllllllllllIllllllIlIlIllIIIlII == 0;
        }
        
        private static boolean llllllllllIllll(final int llllllllllllIllllllIlIlIllIIlIIl, final int llllllllllllIllllllIlIlIllIIlIII) {
            return llllllllllllIllllllIlIlIllIIlIIl < llllllllllllIllllllIlIlIllIIlIII;
        }
        
        private static void llllllllllIllII() {
            (lIllIllIlllIll = new int[2])[0] = ((0x31 ^ 0x12) & ~(0x38 ^ 0x1B));
            DefaultOioUnsafe.lIllIllIlllIll[1] = " ".length();
        }
        
        @Override
        public void connect(final SocketAddress llllllllllllIllllllIlIlIllllIIll, final SocketAddress llllllllllllIllllllIlIlIllllIIlI, final ChannelPromise llllllllllllIllllllIlIlIlllIllIl) {
            if (!llllllllllIllIl(llllllllllllIllllllIlIlIlllIllIl.setUncancellable() ? 1 : 0) || llllllllllIlllI(this.ensureOpen(llllllllllllIllllllIlIlIlllIllIl) ? 1 : 0)) {
                return;
            }
            try {
                final boolean llllllllllllIllllllIlIlIllllIlll = AbstractOioChannel.this.isActive();
                AbstractOioChannel.this.doConnect(llllllllllllIllllllIlIlIllllIIll, llllllllllllIllllllIlIlIllllIIlI);
                this.safeSetSuccess(llllllllllllIllllllIlIlIlllIllIl);
                if (llllllllllIlllI(llllllllllllIllllllIlIlIllllIlll ? 1 : 0) && llllllllllIllIl(AbstractOioChannel.this.isActive() ? 1 : 0)) {
                    AbstractOioChannel.this.pipeline().fireChannelActive();
                    "".length();
                }
                "".length();
                if ((0xBC ^ 0xB8) <= 0) {
                    return;
                }
            }
            catch (Throwable llllllllllllIllllllIlIlIllllIlIl) {
                if (llllllllllIllIl((llllllllllllIllllllIlIlIllllIlIl instanceof ConnectException) ? 1 : 0)) {
                    final Throwable llllllllllllIllllllIlIlIllllIllI = new ConnectException(String.valueOf(new StringBuilder().append(llllllllllllIllllllIlIlIllllIlIl.getMessage()).append(DefaultOioUnsafe.lIllIllIlllIlI[DefaultOioUnsafe.lIllIllIlllIll[0]]).append(llllllllllllIllllllIlIlIllllIIll)));
                    llllllllllllIllllllIlIlIllllIllI.setStackTrace(llllllllllllIllllllIlIlIllllIlIl.getStackTrace());
                    llllllllllllIllllllIlIlIllllIlIl = llllllllllllIllllllIlIlIllllIllI;
                }
                this.safeSetFailure(llllllllllllIllllllIlIlIlllIllIl, llllllllllllIllllllIlIlIllllIlIl);
                this.closeIfClosed();
            }
        }
    }
}
