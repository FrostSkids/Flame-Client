// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.util.concurrent.EventExecutor;
import io.netty.util.concurrent.EventExecutorGroup;
import java.util.concurrent.ThreadFactory;
import io.netty.util.concurrent.SingleThreadEventExecutor;

public abstract class SingleThreadEventLoop extends SingleThreadEventExecutor implements EventLoop
{
    private static final /* synthetic */ String[] llIllIlllIlIII;
    private static final /* synthetic */ int[] llIllIlllIlIlI;
    
    private static void lIIllIIIIlllIllI() {
        (llIllIlllIlIII = new String[SingleThreadEventLoop.llIllIlllIlIlI[2]])[SingleThreadEventLoop.llIllIlllIlIlI[0]] = lIIllIIIIlllIlII("lKwIkLg0LDo=", "DFrzh");
        SingleThreadEventLoop.llIllIlllIlIII[SingleThreadEventLoop.llIllIlllIlIlI[1]] = lIIllIIIIlllIlIl("GDAmJgwbJw==", "hBIKe");
    }
    
    @Override
    public ChannelFuture register(final Channel llllllllllllIllIIllIIIIlIlllllIl, final ChannelPromise llllllllllllIllIIllIIIIlIllllIll) {
        if (lIIllIIIlIIIlIII(llllllllllllIllIIllIIIIlIlllllIl)) {
            throw new NullPointerException(SingleThreadEventLoop.llIllIlllIlIII[SingleThreadEventLoop.llIllIlllIlIlI[0]]);
        }
        if (lIIllIIIlIIIlIII(llllllllllllIllIIllIIIIlIllllIll)) {
            throw new NullPointerException(SingleThreadEventLoop.llIllIlllIlIII[SingleThreadEventLoop.llIllIlllIlIlI[1]]);
        }
        llllllllllllIllIIllIIIIlIlllllIl.unsafe().register(this, llllllllllllIllIIllIIIIlIllllIll);
        return llllllllllllIllIIllIIIIlIllllIll;
    }
    
    private static void lIIllIIIlIIIIlll() {
        (llIllIlllIlIlI = new int[3])[0] = ((0x43 ^ 0x45) & ~(0x77 ^ 0x71));
        SingleThreadEventLoop.llIllIlllIlIlI[1] = " ".length();
        SingleThreadEventLoop.llIllIlllIlIlI[2] = "  ".length();
    }
    
    @Override
    protected boolean wakesUpForTask(final Runnable llllllllllllIllIIllIIIIlIlllIIll) {
        int n;
        if (lIIllIIIlIIIlIIl((llllllllllllIllIIllIIIIlIlllIIll instanceof NonWakeupRunnable) ? 1 : 0)) {
            n = SingleThreadEventLoop.llIllIlllIlIlI[1];
            "".length();
            if ((0x7E ^ 0x40 ^ (0x57 ^ 0x6D)) <= "   ".length()) {
                return ((0xF8 ^ 0xB7 ^ (0x4A ^ 0x66)) & (0xF3 ^ 0xA9 ^ (0xFA ^ 0xC3) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = SingleThreadEventLoop.llIllIlllIlIlI[0];
        }
        return n != 0;
    }
    
    protected SingleThreadEventLoop(final EventLoopGroup llllllllllllIllIIllIIIIllIlIIlII, final ThreadFactory llllllllllllIllIIllIIIIllIlIIlll, final boolean llllllllllllIllIIllIIIIllIlIIllI) {
        super(llllllllllllIllIIllIIIIllIlIIlII, llllllllllllIllIIllIIIIllIlIIlll, llllllllllllIllIIllIIIIllIlIIllI);
    }
    
    private static boolean lIIllIIIlIIIlIIl(final int llllllllllllIllIIllIIIIlIIllIIII) {
        return llllllllllllIllIIllIIIIlIIllIIII == 0;
    }
    
    @Override
    public EventLoop next() {
        return (EventLoop)super.next();
    }
    
    private static String lIIllIIIIlllIlIl(String llllllllllllIllIIllIIIIlIlIllIll, final String llllllllllllIllIIllIIIIlIlIllIlI) {
        llllllllllllIllIIllIIIIlIlIllIll = (short)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIllIIIIlIlIllIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIllIIIIlIlIllllI = new StringBuilder();
        final char[] llllllllllllIllIIllIIIIlIlIlllIl = llllllllllllIllIIllIIIIlIlIllIlI.toCharArray();
        int llllllllllllIllIIllIIIIlIlIlllII = SingleThreadEventLoop.llIllIlllIlIlI[0];
        final String llllllllllllIllIIllIIIIlIlIlIllI = (Object)((String)llllllllllllIllIIllIIIIlIlIllIll).toCharArray();
        final byte llllllllllllIllIIllIIIIlIlIlIlIl = (byte)llllllllllllIllIIllIIIIlIlIlIllI.length;
        char llllllllllllIllIIllIIIIlIlIlIlII = (char)SingleThreadEventLoop.llIllIlllIlIlI[0];
        while (lIIllIIIlIIIlIlI(llllllllllllIllIIllIIIIlIlIlIlII, llllllllllllIllIIllIIIIlIlIlIlIl)) {
            final char llllllllllllIllIIllIIIIlIllIIIIl = llllllllllllIllIIllIIIIlIlIlIllI[llllllllllllIllIIllIIIIlIlIlIlII];
            llllllllllllIllIIllIIIIlIlIllllI.append((char)(llllllllllllIllIIllIIIIlIllIIIIl ^ llllllllllllIllIIllIIIIlIlIlllIl[llllllllllllIllIIllIIIIlIlIlllII % llllllllllllIllIIllIIIIlIlIlllIl.length]));
            "".length();
            ++llllllllllllIllIIllIIIIlIlIlllII;
            ++llllllllllllIllIIllIIIIlIlIlIlII;
            "".length();
            if (((0x78 ^ 0x1C ^ (0x55 ^ 0x16)) & (0x1D ^ 0x39 ^ "   ".length() ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIllIIIIlIlIllllI);
    }
    
    private static boolean lIIllIIIlIIIlIII(final Object llllllllllllIllIIllIIIIlIIllIlIl) {
        return llllllllllllIllIIllIIIIlIIllIlIl == null;
    }
    
    private static String lIIllIIIIlllIlII(final String llllllllllllIllIIllIIIIlIlIIlIIl, final String llllllllllllIllIIllIIIIlIlIIlIlI) {
        try {
            final SecretKeySpec llllllllllllIllIIllIIIIlIlIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllIIIIlIlIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIllIIIIlIlIIllIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIllIIIIlIlIIllIl.init(SingleThreadEventLoop.llIllIlllIlIlI[2], llllllllllllIllIIllIIIIlIlIIlllI);
            return new String(llllllllllllIllIIllIIIIlIlIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllIIIIlIlIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllIIIIlIlIIllII) {
            llllllllllllIllIIllIIIIlIlIIllII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllIIIlIIIlIlI(final int llllllllllllIllIIllIIIIlIIllllIl, final int llllllllllllIllIIllIIIIlIIlllIlI) {
        return llllllllllllIllIIllIIIIlIIllllIl < llllllllllllIllIIllIIIIlIIlllIlI;
    }
    
    @Override
    public EventLoopGroup parent() {
        return (EventLoopGroup)super.parent();
    }
    
    @Override
    public ChannelFuture register(final Channel llllllllllllIllIIllIIIIllIIlIlII) {
        return this.register(llllllllllllIllIIllIIIIllIIlIlII, new DefaultChannelPromise(llllllllllllIllIIllIIIIllIIlIlII, this));
    }
    
    static {
        lIIllIIIlIIIIlll();
        lIIllIIIIlllIllI();
    }
    
    interface NonWakeupRunnable extends Runnable
    {
    }
}
