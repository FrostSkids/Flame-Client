// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.epoll;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.ChannelOption;

public final class EpollChannelOption<T> extends ChannelOption<T>
{
    private static final /* synthetic */ String[] lllIIIlIlIIIll;
    private static final /* synthetic */ int[] lllIIIlIlIlIIl;
    
    private static String lIIlllIlIllIllIl(final String llllllllllllIllIIIIIIllllIIIIlII, final String llllllllllllIllIIIIIIllllIIIIIll) {
        try {
            final SecretKeySpec llllllllllllIllIIIIIIllllIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIIllllIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIIIIllllIIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIIIIllllIIIlIII.init(EpollChannelOption.lllIIIlIlIlIIl[2], llllllllllllIllIIIIIIllllIIIlIIl);
            return new String(llllllllllllIllIIIIIIllllIIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIIllllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIIIllllIIIIlll) {
            llllllllllllIllIIIIIIllllIIIIlll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlllIlIlllIllI() {
        (lllIIIlIlIlIIl = new int[7])[0] = ((0xB0 ^ 0x8C ^ (0x4C ^ 0x40)) & (82 + 80 - 37 + 43 ^ 16 + 101 + 12 + 23 ^ -" ".length()));
        EpollChannelOption.lllIIIlIlIlIIl[1] = " ".length();
        EpollChannelOption.lllIIIlIlIlIIl[2] = "  ".length();
        EpollChannelOption.lllIIIlIlIlIIl[3] = "   ".length();
        EpollChannelOption.lllIIIlIlIlIIl[4] = (0x7B ^ 0x7F);
        EpollChannelOption.lllIIIlIlIlIIl[5] = (106 + 157 - 97 + 28 ^ 37 + 194 - 223 + 191);
        EpollChannelOption.lllIIIlIlIlIIl[6] = (0x73 ^ 0x1E ^ (0xA7 ^ 0xC2));
    }
    
    private static boolean lIIlllIlIlllIlll(final int llllllllllllIllIIIIIIlllIlIllIIl, final int llllllllllllIllIIIIIIlllIlIllIII) {
        return llllllllllllIllIIIIIIlllIlIllIIl < llllllllllllIllIIIIIIlllIlIllIII;
    }
    
    private static void lIIlllIlIlllIlII() {
        (lllIIIlIlIIIll = new String[EpollChannelOption.lllIIIlIlIlIIl[5]])[EpollChannelOption.lllIIIlIlIlIIl[0]] = lIIlllIlIlIllIIl("Pg4oFRolHzM=", "jMxJY");
        EpollChannelOption.lllIIIlIlIIIll[EpollChannelOption.lllIIIlIlIlIIl[1]] = lIIlllIlIlIllIlI("GU+eVTT7zCWVu2EJUiF3JQ==", "YcpCD");
        EpollChannelOption.lllIIIlIlIIIll[EpollChannelOption.lllIIIlIlIlIIl[2]] = lIIlllIlIlIllIIl("JCg/Cx41Lj8dGyQ9Iw==", "pkoTU");
        EpollChannelOption.lllIIIlIlIIIll[EpollChannelOption.lllIIIlIlIlIIl[3]] = lIIlllIlIlIllIIl("ABopMToRHCktPwA=", "TYynq");
        EpollChannelOption.lllIIIlIlIIIll[EpollChannelOption.lllIIIlIlIlIIl[4]] = lIIlllIlIllIllIl("kVwXG3hccpoZb0QPLglUmw==", "ptFUE");
    }
    
    private EpollChannelOption(final String llllllllllllIllIIIIIIllllIIlIIII) {
        super(llllllllllllIllIIIIIIllllIIlIIII);
    }
    
    static {
        lIIlllIlIlllIllI();
        lIIlllIlIlllIlII();
        TCP_CORK = ChannelOption.valueOf(EpollChannelOption.lllIIIlIlIIIll[EpollChannelOption.lllIIIlIlIlIIl[0]]);
        TCP_KEEPIDLE = ChannelOption.valueOf(EpollChannelOption.lllIIIlIlIIIll[EpollChannelOption.lllIIIlIlIlIIl[1]]);
        TCP_KEEPINTVL = ChannelOption.valueOf(EpollChannelOption.lllIIIlIlIIIll[EpollChannelOption.lllIIIlIlIlIIl[2]]);
        TCP_KEEPCNT = ChannelOption.valueOf(EpollChannelOption.lllIIIlIlIIIll[EpollChannelOption.lllIIIlIlIlIIl[3]]);
        SO_REUSEPORT = ChannelOption.valueOf(EpollChannelOption.lllIIIlIlIIIll[EpollChannelOption.lllIIIlIlIlIIl[4]]);
    }
    
    private static String lIIlllIlIlIllIlI(final String llllllllllllIllIIIIIIlllIlllIlll, final String llllllllllllIllIIIIIIlllIlllIllI) {
        try {
            final SecretKeySpec llllllllllllIllIIIIIIlllIlllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIIlllIlllIllI.getBytes(StandardCharsets.UTF_8)), EpollChannelOption.lllIIIlIlIlIIl[6]), "DES");
            final Cipher llllllllllllIllIIIIIIlllIllllIll = Cipher.getInstance("DES");
            llllllllllllIllIIIIIIlllIllllIll.init(EpollChannelOption.lllIIIlIlIlIIl[2], llllllllllllIllIIIIIIlllIlllllII);
            return new String(llllllllllllIllIIIIIIlllIllllIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIIlllIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIIIlllIllllIlI) {
            llllllllllllIllIIIIIIlllIllllIlI.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlllIlIlIllIIl(String llllllllllllIllIIIIIIlllIllIIlII, final String llllllllllllIllIIIIIIlllIllIlIII) {
        llllllllllllIllIIIIIIlllIllIIlII = new String(Base64.getDecoder().decode(llllllllllllIllIIIIIIlllIllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIIIlllIllIIlll = new StringBuilder();
        final char[] llllllllllllIllIIIIIIlllIllIIllI = llllllllllllIllIIIIIIlllIllIlIII.toCharArray();
        int llllllllllllIllIIIIIIlllIllIIlIl = EpollChannelOption.lllIIIlIlIlIIl[0];
        final int llllllllllllIllIIIIIIlllIlIlllll = (Object)llllllllllllIllIIIIIIlllIllIIlII.toCharArray();
        final short llllllllllllIllIIIIIIlllIlIllllI = (short)llllllllllllIllIIIIIIlllIlIlllll.length;
        boolean llllllllllllIllIIIIIIlllIlIlllIl = EpollChannelOption.lllIIIlIlIlIIl[0] != 0;
        while (lIIlllIlIlllIlll(llllllllllllIllIIIIIIlllIlIlllIl ? 1 : 0, llllllllllllIllIIIIIIlllIlIllllI)) {
            final char llllllllllllIllIIIIIIlllIllIlIlI = llllllllllllIllIIIIIIlllIlIlllll[llllllllllllIllIIIIIIlllIlIlllIl];
            llllllllllllIllIIIIIIlllIllIIlll.append((char)(llllllllllllIllIIIIIIlllIllIlIlI ^ llllllllllllIllIIIIIIlllIllIIllI[llllllllllllIllIIIIIIlllIllIIlIl % llllllllllllIllIIIIIIlllIllIIllI.length]));
            "".length();
            ++llllllllllllIllIIIIIIlllIllIIlIl;
            ++llllllllllllIllIIIIIIlllIlIlllIl;
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIIIlllIllIIlll);
    }
}
