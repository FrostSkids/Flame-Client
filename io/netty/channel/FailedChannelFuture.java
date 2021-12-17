// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import io.netty.util.concurrent.EventExecutor;
import io.netty.util.internal.PlatformDependent;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.concurrent.Future;

final class FailedChannelFuture extends CompleteChannelFuture
{
    private static final /* synthetic */ int[] llIlIllIlIIlll;
    private final /* synthetic */ Throwable cause;
    private static final /* synthetic */ String[] llIlIllIlIIllI;
    
    private static String lIIlIlIlIlIIlIII(final String llllllllllllIllIlIIlIlllIlIlllll, final String llllllllllllIllIlIIlIlllIlIlllII) {
        try {
            final SecretKeySpec llllllllllllIllIlIIlIlllIllIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIlIlllIlIlllII.getBytes(StandardCharsets.UTF_8)), FailedChannelFuture.llIlIllIlIIlll[2]), "DES");
            final Cipher llllllllllllIllIlIIlIlllIllIIIIl = Cipher.getInstance("DES");
            llllllllllllIllIlIIlIlllIllIIIIl.init(FailedChannelFuture.llIlIllIlIIlll[3], llllllllllllIllIlIIlIlllIllIIIlI);
            return new String(llllllllllllIllIlIIlIlllIllIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIlIlllIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIlIlllIllIIIII) {
            llllllllllllIllIlIIlIlllIllIIIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ChannelFuture sync() {
        PlatformDependent.throwException(this.cause);
        return this;
    }
    
    private static void lIIlIlIlIlIIlIlI() {
        (llIlIllIlIIlll = new int[4])[0] = ((0x3B ^ 0x15 ^ (0xE ^ 0x62)) & (148 + 214 - 329 + 214 ^ 178 + 38 - 119 + 84 ^ -" ".length()));
        FailedChannelFuture.llIlIllIlIIlll[1] = " ".length();
        FailedChannelFuture.llIlIllIlIIlll[2] = (0xBE ^ 0xB6);
        FailedChannelFuture.llIlIllIlIIlll[3] = "  ".length();
    }
    
    private static void lIIlIlIlIlIIlIIl() {
        (llIlIllIlIIllI = new String[FailedChannelFuture.llIlIllIlIIlll[1]])[FailedChannelFuture.llIlIllIlIIlll[0]] = lIIlIlIlIlIIlIII("m33iXeglbw8=", "uectT");
    }
    
    @Override
    public Throwable cause() {
        return this.cause;
    }
    
    static {
        lIIlIlIlIlIIlIlI();
        lIIlIlIlIlIIlIIl();
    }
    
    private static boolean lIIlIlIlIlIIlIll(final Object llllllllllllIllIlIIlIlllIlIllIII) {
        return llllllllllllIllIlIIlIlllIlIllIII == null;
    }
    
    @Override
    public boolean isSuccess() {
        return FailedChannelFuture.llIlIllIlIIlll[0] != 0;
    }
    
    FailedChannelFuture(final Channel llllllllllllIllIlIIlIlllIlllllIl, final EventExecutor llllllllllllIllIlIIlIlllIlllllII, final Throwable llllllllllllIllIlIIlIlllIllllIll) {
        super(llllllllllllIllIlIIlIlllIlllllIl, llllllllllllIllIlIIlIlllIlllllII);
        if (lIIlIlIlIlIIlIll(llllllllllllIllIlIIlIlllIllllIll)) {
            throw new NullPointerException(FailedChannelFuture.llIlIllIlIIllI[FailedChannelFuture.llIlIllIlIIlll[0]]);
        }
        this.cause = llllllllllllIllIlIIlIlllIllllIll;
    }
    
    @Override
    public ChannelFuture syncUninterruptibly() {
        PlatformDependent.throwException(this.cause);
        return this;
    }
}
