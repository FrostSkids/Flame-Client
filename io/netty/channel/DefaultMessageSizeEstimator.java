// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import io.netty.buffer.ByteBufHolder;
import io.netty.buffer.ByteBuf;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public final class DefaultMessageSizeEstimator implements MessageSizeEstimator
{
    private static final /* synthetic */ int[] lIIIllIlIllllI;
    private final /* synthetic */ Handle handle;
    private static final /* synthetic */ String[] lIIIllIlIlllII;
    
    private static void llIIIlIIlllIIll() {
        (lIIIllIlIllllI = new int[3])[0] = ((0xFD ^ 0xC0) & ~(0xB9 ^ 0x84));
        DefaultMessageSizeEstimator.lIIIllIlIllllI[1] = " ".length();
        DefaultMessageSizeEstimator.lIIIllIlIllllI[2] = "  ".length();
    }
    
    private static boolean llIIIlIIlllIlIl(final int lllllllllllllIIllllllllIIIIllIIl, final int lllllllllllllIIllllllllIIIIllIII) {
        return lllllllllllllIIllllllllIIIIllIIl < lllllllllllllIIllllllllIIIIllIII;
    }
    
    @Override
    public Handle newHandle() {
        return this.handle;
    }
    
    private static void llIIIlIIlllIIlI() {
        (lIIIllIlIlllII = new String[DefaultMessageSizeEstimator.lIIIllIlIllllI[2]])[DefaultMessageSizeEstimator.lIIIllIlIllllI[0]] = llIIIlIIllIlllI("GS8yNi4bLwoxOwl7eQ==", "lAYXA");
        DefaultMessageSizeEstimator.lIIIllIlIlllII[DefaultMessageSizeEstimator.lIIIllIlIllllI[1]] = llIIIlIIllIllll("LQsWNqbdfuQ6q+JM3DUxpGYkH208d0PJ", "JgTCS");
    }
    
    private static String llIIIlIIllIllll(final String lllllllllllllIIllllllllIIIIlllll, final String lllllllllllllIIllllllllIIIlIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIllllllllIIIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllllllIIIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllllllIIIlIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllllllIIIlIIIll.init(DefaultMessageSizeEstimator.lIIIllIlIllllI[2], lllllllllllllIIllllllllIIIlIIlII);
            return new String(lllllllllllllIIllllllllIIIlIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllllllIIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllllllIIIlIIIlI) {
            lllllllllllllIIllllllllIIIlIIIlI.printStackTrace();
            return null;
        }
    }
    
    private static String llIIIlIIllIlllI(String lllllllllllllIIllllllllIIIllIIIl, final String lllllllllllllIIllllllllIIIllIIII) {
        lllllllllllllIIllllllllIIIllIIIl = (byte)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllllllllIIIllIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllllllllIIIllIlII = new StringBuilder();
        final char[] lllllllllllllIIllllllllIIIllIIll = lllllllllllllIIllllllllIIIllIIII.toCharArray();
        int lllllllllllllIIllllllllIIIllIIlI = DefaultMessageSizeEstimator.lIIIllIlIllllI[0];
        final boolean lllllllllllllIIllllllllIIIlIllII = (Object)((String)lllllllllllllIIllllllllIIIllIIIl).toCharArray();
        final String lllllllllllllIIllllllllIIIlIlIll = (String)lllllllllllllIIllllllllIIIlIllII.length;
        char lllllllllllllIIllllllllIIIlIlIlI = (char)DefaultMessageSizeEstimator.lIIIllIlIllllI[0];
        while (llIIIlIIlllIlIl(lllllllllllllIIllllllllIIIlIlIlI, (int)lllllllllllllIIllllllllIIIlIlIll)) {
            final char lllllllllllllIIllllllllIIIllIlll = lllllllllllllIIllllllllIIIlIllII[lllllllllllllIIllllllllIIIlIlIlI];
            lllllllllllllIIllllllllIIIllIlII.append((char)(lllllllllllllIIllllllllIIIllIlll ^ lllllllllllllIIllllllllIIIllIIll[lllllllllllllIIllllllllIIIllIIlI % lllllllllllllIIllllllllIIIllIIll.length]));
            "".length();
            ++lllllllllllllIIllllllllIIIllIIlI;
            ++lllllllllllllIIllllllllIIIlIlIlI;
            "".length();
            if (-" ".length() > -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllllllllIIIllIlII);
    }
    
    private static boolean llIIIlIIlllIlII(final int lllllllllllllIIllllllllIIIIlIllI) {
        return lllllllllllllIIllllllllIIIIlIllI < 0;
    }
    
    public DefaultMessageSizeEstimator(final int lllllllllllllIIllllllllIIlIIIlII) {
        if (llIIIlIIlllIlII(lllllllllllllIIllllllllIIlIIIlII)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(DefaultMessageSizeEstimator.lIIIllIlIlllII[DefaultMessageSizeEstimator.lIIIllIlIllllI[0]]).append(lllllllllllllIIllllllllIIlIIIlII).append(DefaultMessageSizeEstimator.lIIIllIlIlllII[DefaultMessageSizeEstimator.lIIIllIlIllllI[1]])));
        }
        this.handle = new HandleImpl(lllllllllllllIIllllllllIIlIIIlII);
    }
    
    static {
        llIIIlIIlllIIll();
        llIIIlIIlllIIlI();
        DEFAULT = new DefaultMessageSizeEstimator(DefaultMessageSizeEstimator.lIIIllIlIllllI[0]);
    }
    
    private static final class HandleImpl implements Handle
    {
        private final /* synthetic */ int unknownSize;
        private static final /* synthetic */ int[] lIlIllllllIlll;
        
        @Override
        public int size(final Object lllllllllllllIIIIlIIlIllIllIIlll) {
            if (llllIlIllIIIllI((lllllllllllllIIIIlIIlIllIllIIlll instanceof ByteBuf) ? 1 : 0)) {
                return ((ByteBuf)lllllllllllllIIIIlIIlIllIllIIlll).readableBytes();
            }
            if (llllIlIllIIIllI((lllllllllllllIIIIlIIlIllIllIIlll instanceof ByteBufHolder) ? 1 : 0)) {
                return ((ByteBufHolder)lllllllllllllIIIIlIIlIllIllIIlll).content().readableBytes();
            }
            if (llllIlIllIIIllI((lllllllllllllIIIIlIIlIllIllIIlll instanceof FileRegion) ? 1 : 0)) {
                return HandleImpl.lIlIllllllIlll[0];
            }
            return this.unknownSize;
        }
        
        private HandleImpl(final int lllllllllllllIIIIlIIlIllIllIllIl) {
            this.unknownSize = lllllllllllllIIIIlIIlIllIllIllIl;
        }
        
        private static void llllIlIllIIIlIl() {
            (lIlIllllllIlll = new int[1])[0] = ((30 + 147 - 102 + 99 ^ 135 + 120 - 171 + 55) & (62 + 90 - 132 + 110 ^ 129 + 15 - 92 + 115 ^ -" ".length()));
        }
        
        private static boolean llllIlIllIIIllI(final int lllllllllllllIIIIlIIlIllIlIllllI) {
            return lllllllllllllIIIIlIIlIllIlIllllI != 0;
        }
        
        static {
            llllIlIllIIIlIl();
        }
    }
}
