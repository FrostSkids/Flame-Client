// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import io.netty.util.concurrent.Future;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public final class ChannelPromiseNotifier implements ChannelFutureListener
{
    private static final /* synthetic */ String[] llIIIIlllIIIll;
    private final /* synthetic */ ChannelPromise[] promises;
    private static final /* synthetic */ int[] llIIIIlllIIllI;
    
    private static boolean lIIIlIIIIlIlIlll(final Object llllllllllllIlllIllIIllllllIllII) {
        return llllllllllllIlllIllIIllllllIllII == null;
    }
    
    private static String lIIIlIIIIlIlIIll(final String llllllllllllIlllIllIIlllllllIlll, final String llllllllllllIlllIllIIlllllllIlII) {
        try {
            final SecretKeySpec llllllllllllIlllIllIIllllllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIlllllllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIllIIllllllllIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllIllIIllllllllIIl.init(ChannelPromiseNotifier.llIIIIlllIIllI[2], llllllllllllIlllIllIIllllllllIlI);
            return new String(llllllllllllIlllIllIIllllllllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIlllllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIIllllllllIII) {
            llllllllllllIlllIllIIllllllllIII.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIIlIIIIlIlIllI();
        lIIIlIIIIlIlIlII();
    }
    
    private static void lIIIlIIIIlIlIllI() {
        (llIIIIlllIIllI = new int[3])[0] = ((24 + 16 + 39 + 90 ^ 107 + 109 - 84 + 50) & (0x24 ^ 0x0 ^ (0x44 ^ 0x7F) ^ -" ".length()));
        ChannelPromiseNotifier.llIIIIlllIIllI[1] = " ".length();
        ChannelPromiseNotifier.llIIIIlllIIllI[2] = "  ".length();
    }
    
    private static void lIIIlIIIIlIlIlII() {
        (llIIIIlllIIIll = new String[ChannelPromiseNotifier.llIIIIlllIIllI[2]])[ChannelPromiseNotifier.llIIIIlllIIllI[0]] = lIIIlIIIIlIlIIll("Fr9vBChMpYE3ca+V/e4Kpg==", "YEqSC");
        ChannelPromiseNotifier.llIIIIlllIIIll[ChannelPromiseNotifier.llIIIIlllIIllI[1]] = lIIIlIIIIlIlIIll("KQe+xsfC7nvg5x6VKjVAFf+7sQX8ZLX0EgeOBdIgvy/gwctwqVSx3A==", "Wqodv");
    }
    
    @Override
    public void operationComplete(final ChannelFuture llllllllllllIlllIllIlIIIIIIIllIl) throws Exception {
        if (lIIIlIIIIlIllIIl(llllllllllllIlllIllIlIIIIIIIllIl.isSuccess() ? 1 : 0)) {
            final ChannelPromise[] llllllllllllIlllIllIlIIIIIIlIlIl = this.promises;
            final int llllllllllllIlllIllIlIIIIIIlIlII = llllllllllllIlllIllIlIIIIIIlIlIl.length;
            int llllllllllllIlllIllIlIIIIIIlIIll = ChannelPromiseNotifier.llIIIIlllIIllI[0];
            while (lIIIlIIIIlIllIII(llllllllllllIlllIllIlIIIIIIlIIll, llllllllllllIlllIllIlIIIIIIlIlII)) {
                final ChannelPromise llllllllllllIlllIllIlIIIIIIlIllI = llllllllllllIlllIllIlIIIIIIlIlIl[llllllllllllIlllIllIlIIIIIIlIIll];
                llllllllllllIlllIllIlIIIIIIlIllI.setSuccess();
                "".length();
                ++llllllllllllIlllIllIlIIIIIIlIIll;
                "".length();
                if (-"   ".length() >= 0) {
                    return;
                }
            }
            return;
        }
        final Throwable llllllllllllIlllIllIlIIIIIIIllII = llllllllllllIlllIllIlIIIIIIIllIl.cause();
        final ChannelPromise[] llllllllllllIlllIllIlIIIIIIlIIIl = this.promises;
        final int llllllllllllIlllIllIlIIIIIIlIIII = llllllllllllIlllIllIlIIIIIIlIIIl.length;
        int llllllllllllIlllIllIlIIIIIIIllll = ChannelPromiseNotifier.llIIIIlllIIllI[0];
        while (lIIIlIIIIlIllIII(llllllllllllIlllIllIlIIIIIIIllll, llllllllllllIlllIllIlIIIIIIlIIII)) {
            final ChannelPromise llllllllllllIlllIllIlIIIIIIlIIlI = llllllllllllIlllIllIlIIIIIIlIIIl[llllllllllllIlllIllIlIIIIIIIllll];
            llllllllllllIlllIllIlIIIIIIlIIlI.setFailure(llllllllllllIlllIllIlIIIIIIIllII);
            "".length();
            ++llllllllllllIlllIllIlIIIIIIIllll;
            "".length();
            if (((99 + 58 - 50 + 45 ^ 123 + 127 - 228 + 137) & (0x4D ^ 0x1F ^ (0x2D ^ 0x78) ^ -" ".length())) != 0x0) {
                return;
            }
        }
    }
    
    private static boolean lIIIlIIIIlIllIII(final int llllllllllllIlllIllIIllllllIllll, final int llllllllllllIlllIllIIllllllIlllI) {
        return llllllllllllIlllIllIIllllllIllll < llllllllllllIlllIllIIllllllIlllI;
    }
    
    public ChannelPromiseNotifier(final ChannelPromise... llllllllllllIlllIllIlIIIIIlIIIlI) {
        if (lIIIlIIIIlIlIlll(llllllllllllIlllIllIlIIIIIlIIIlI)) {
            throw new NullPointerException(ChannelPromiseNotifier.llIIIIlllIIIll[ChannelPromiseNotifier.llIIIIlllIIllI[0]]);
        }
        final ChannelPromise[] llllllllllllIlllIllIlIIIIIlIlIII = llllllllllllIlllIllIlIIIIIlIIIlI;
        final int llllllllllllIlllIllIlIIIIIlIIlll = llllllllllllIlllIllIlIIIIIlIlIII.length;
        int llllllllllllIlllIllIlIIIIIlIIllI = ChannelPromiseNotifier.llIIIIlllIIllI[0];
        while (lIIIlIIIIlIllIII(llllllllllllIlllIllIlIIIIIlIIllI, llllllllllllIlllIllIlIIIIIlIIlll)) {
            final ChannelPromise llllllllllllIlllIllIlIIIIIlIlIIl = llllllllllllIlllIllIlIIIIIlIlIII[llllllllllllIlllIllIlIIIIIlIIllI];
            if (lIIIlIIIIlIlIlll(llllllllllllIlllIllIlIIIIIlIlIIl)) {
                throw new IllegalArgumentException(ChannelPromiseNotifier.llIIIIlllIIIll[ChannelPromiseNotifier.llIIIIlllIIllI[1]]);
            }
            ++llllllllllllIlllIllIlIIIIIlIIllI;
            "".length();
            if (-"   ".length() >= 0) {
                throw null;
            }
        }
        this.promises = llllllllllllIlllIllIlIIIIIlIIIlI.clone();
    }
    
    private static boolean lIIIlIIIIlIllIIl(final int llllllllllllIlllIllIIllllllIlIlI) {
        return llllllllllllIlllIllIIllllllIlIlI != 0;
    }
}
