// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.concurrent;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.Executor;

public final class ImmediateExecutor implements Executor
{
    private static final /* synthetic */ String[] lIIlIlllIlllll;
    private static final /* synthetic */ int[] lIIlIllllIIIII;
    
    private static void llIlIlIIIIlIllI() {
        (lIIlIllllIIIII = new int[3])[0] = ((47 + 113 - 127 + 110 ^ 153 + 118 - 269 + 184) & (0x7C ^ 0x71 ^ (0x33 ^ 0xB) ^ -" ".length()));
        ImmediateExecutor.lIIlIllllIIIII[1] = " ".length();
        ImmediateExecutor.lIIlIllllIIIII[2] = "  ".length();
    }
    
    private ImmediateExecutor() {
    }
    
    static {
        llIlIlIIIIlIllI();
        llIlIlIIIIlIlIl();
        INSTANCE = new ImmediateExecutor();
    }
    
    @Override
    public void execute(final Runnable lllllllllllllIIllIIIIIIlIlIlIIlI) {
        if (llIlIlIIIIlIlll(lllllllllllllIIllIIIIIIlIlIlIIlI)) {
            throw new NullPointerException(ImmediateExecutor.lIIlIlllIlllll[ImmediateExecutor.lIIlIllllIIIII[0]]);
        }
        lllllllllllllIIllIIIIIIlIlIlIIlI.run();
    }
    
    private static boolean llIlIlIIIIlIlll(final Object lllllllllllllIIllIIIIIIlIlIIIIll) {
        return lllllllllllllIIllIIIIIIlIlIIIIll == null;
    }
    
    private static String llIlIlIIIIlIlII(final String lllllllllllllIIllIIIIIIlIlIIlIII, final String lllllllllllllIIllIIIIIIlIlIIIlll) {
        try {
            final SecretKeySpec lllllllllllllIIllIIIIIIlIlIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIIIIIlIlIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIIIIIIlIlIIllII = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIIIIIIlIlIIllII.init(ImmediateExecutor.lIIlIllllIIIII[2], lllllllllllllIIllIIIIIIlIlIIllIl);
            return new String(lllllllllllllIIllIIIIIIlIlIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIIIIIlIlIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIIIIIlIlIIlIll) {
            lllllllllllllIIllIIIIIIlIlIIlIll.printStackTrace();
            return null;
        }
    }
    
    private static void llIlIlIIIIlIlIl() {
        (lIIlIlllIlllll = new String[ImmediateExecutor.lIIlIllllIIIII[1]])[ImmediateExecutor.lIIlIllllIIIII[0]] = llIlIlIIIIlIlII("62xHi41eDGw=", "OsbVi");
    }
}
