// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.sctp;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.sun.nio.sctp.SctpStandardSocketOptions;
import java.net.SocketAddress;
import io.netty.channel.ChannelOption;

public class SctpChannelOption<T> extends ChannelOption<T>
{
    private static final /* synthetic */ int[] lllIlIIIlIllIl;
    private static final /* synthetic */ String[] lllIlIIIlIlIII;
    
    private static void lIlIIIIllIlIIlll() {
        (lllIlIIIlIlIII = new String[SctpChannelOption.lllIlIIIlIllIl[7]])[SctpChannelOption.lllIlIIIlIllIl[0]] = lIlIIIIllIlIIIll("MhhLnbWUs5XdPGHoHfB+fKRAQGRkWgBH", "VdpIa");
        SctpChannelOption.lllIlIIIlIlIII[SctpChannelOption.lllIlIIIlIllIl[1]] = lIlIIIIllIlIIIll("Tz4qzMKhJgvkA9rUXPfFqHmBXdM+AXwI", "JZUma");
        SctpChannelOption.lllIlIIIlIlIII[SctpChannelOption.lllIlIIIlIllIl[2]] = lIlIIIIllIlIIlII("k8Ee93I3WfWylM1V0S91WZ+OhLm0ZPSrp5Lm/7JP6os=", "HgSQF");
        SctpChannelOption.lllIlIIIlIlIII[SctpChannelOption.lllIlIIIlIllIl[3]] = lIlIIIIllIlIIlII("5v3UWvlmfB5OUjsiwHpVDRmRMx1kXSuk", "rvNYa");
        SctpChannelOption.lllIlIIIlIlIII[SctpChannelOption.lllIlIIIlIllIl[4]] = lIlIIIIllIlIIlII("3TXaXYcPCVE7E97bL2nwVA==", "StIuL");
        SctpChannelOption.lllIlIIIlIlIII[SctpChannelOption.lllIlIIIlIllIl[5]] = lIlIIIIllIlIIIll("5kHGo93O75qzMzG6m5N/wiS2ioyAcJDd", "bVcjF");
        SctpChannelOption.lllIlIIIlIlIII[SctpChannelOption.lllIlIIIlIllIl[6]] = lIlIIIIllIlIIllI("CRUSFggJExIZBx8TFBkHCB8LBwUDCQcCEwg=", "ZVFFW");
    }
    
    private static String lIlIIIIllIlIIIll(final String llllllllllllIlIlllIIlIIlIlIlIIII, final String llllllllllllIlIlllIIlIIlIlIIlIIl) {
        try {
            final SecretKeySpec llllllllllllIlIlllIIlIIlIlIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIIlIIlIlIIlIIl.getBytes(StandardCharsets.UTF_8)), SctpChannelOption.lllIlIIIlIllIl[8]), "DES");
            final Cipher llllllllllllIlIlllIIlIIlIlIlIlIl = Cipher.getInstance("DES");
            llllllllllllIlIlllIIlIIlIlIlIlIl.init(SctpChannelOption.lllIlIIIlIllIl[2], llllllllllllIlIlllIIlIIlIlIlIlll);
            return new String(llllllllllllIlIlllIIlIIlIlIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIIlIIlIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIIlIIlIlIlIIll) {
            llllllllllllIlIlllIIlIIlIlIlIIll.printStackTrace();
            return null;
        }
    }
    
    static {
        lIlIIIIllIlllIII();
        lIlIIIIllIlIIlll();
        SCTP_DISABLE_FRAGMENTS = new SctpChannelOption<Boolean>(SctpChannelOption.lllIlIIIlIlIII[SctpChannelOption.lllIlIIIlIllIl[0]]);
        SCTP_EXPLICIT_COMPLETE = new SctpChannelOption<Boolean>(SctpChannelOption.lllIlIIIlIlIII[SctpChannelOption.lllIlIIIlIllIl[1]]);
        SCTP_FRAGMENT_INTERLEAVE = new SctpChannelOption<Integer>(SctpChannelOption.lllIlIIIlIlIII[SctpChannelOption.lllIlIIIlIllIl[2]]);
        SCTP_INIT_MAXSTREAMS = new SctpChannelOption<SctpStandardSocketOptions.InitMaxStreams>(SctpChannelOption.lllIlIIIlIlIII[SctpChannelOption.lllIlIIIlIllIl[3]]);
        SCTP_NODELAY = new SctpChannelOption<Boolean>(SctpChannelOption.lllIlIIIlIlIII[SctpChannelOption.lllIlIIIlIllIl[4]]);
        SCTP_PRIMARY_ADDR = new SctpChannelOption<SocketAddress>(SctpChannelOption.lllIlIIIlIlIII[SctpChannelOption.lllIlIIIlIllIl[5]]);
        SCTP_SET_PEER_PRIMARY_ADDR = new SctpChannelOption<SocketAddress>(SctpChannelOption.lllIlIIIlIlIII[SctpChannelOption.lllIlIIIlIllIl[6]]);
    }
    
    @Deprecated
    protected SctpChannelOption(final String llllllllllllIlIlllIIlIIllIIlIIlI) {
        super(llllllllllllIlIlllIIlIIllIIlIIlI);
    }
    
    private static boolean lIlIIIIllIlllIIl(final int llllllllllllIlIlllIIlIIlIIlIllll, final int llllllllllllIlIlllIIlIIlIIlIlllI) {
        return llllllllllllIlIlllIIlIIlIIlIllll < llllllllllllIlIlllIIlIIlIIlIlllI;
    }
    
    private static void lIlIIIIllIlllIII() {
        (lllIlIIIlIllIl = new int[9])[0] = ((0x12 ^ 0x41) & ~(0x1B ^ 0x48));
        SctpChannelOption.lllIlIIIlIllIl[1] = " ".length();
        SctpChannelOption.lllIlIIIlIllIl[2] = "  ".length();
        SctpChannelOption.lllIlIIIlIllIl[3] = "   ".length();
        SctpChannelOption.lllIlIIIlIllIl[4] = (0x14 ^ 0x10);
        SctpChannelOption.lllIlIIIlIllIl[5] = (0x16 ^ 0x13);
        SctpChannelOption.lllIlIIIlIllIl[6] = (0xD2 ^ 0x90 ^ (0x55 ^ 0x11));
        SctpChannelOption.lllIlIIIlIllIl[7] = (0x8 ^ 0x5A ^ (0x1F ^ 0x4A));
        SctpChannelOption.lllIlIIIlIllIl[8] = (64 + 74 - 68 + 78 ^ 122 + 58 - 27 + 3);
    }
    
    private static String lIlIIIIllIlIIlII(final String llllllllllllIlIlllIIlIIlIIlllIIl, final String llllllllllllIlIlllIIlIIlIIllIllI) {
        try {
            final SecretKeySpec llllllllllllIlIlllIIlIIlIIlllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIIlIIlIIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllIIlIIlIIllllIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllIIlIIlIIllllIl.init(SctpChannelOption.lllIlIIIlIllIl[2], llllllllllllIlIlllIIlIIlIIlllllI);
            return new String(llllllllllllIlIlllIIlIIlIIllllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIIlIIlIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIIlIIlIIlllIll) {
            llllllllllllIlIlllIIlIIlIIlllIll.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIIIIllIlIIllI(String llllllllllllIlIlllIIlIIlIlllIIll, final String llllllllllllIlIlllIIlIIlIlllIIlI) {
        llllllllllllIlIlllIIlIIlIlllIIll = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIlIlllIIlIIlIlllIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllIIlIIlIllllIIl = new StringBuilder();
        final char[] llllllllllllIlIlllIIlIIlIlllIlll = llllllllllllIlIlllIIlIIlIlllIIlI.toCharArray();
        int llllllllllllIlIlllIIlIIlIlllIlIl = SctpChannelOption.lllIlIIIlIllIl[0];
        final short llllllllllllIlIlllIIlIIlIllIlIll = (Object)((String)llllllllllllIlIlllIIlIIlIlllIIll).toCharArray();
        final int llllllllllllIlIlllIIlIIlIllIlIIl = llllllllllllIlIlllIIlIIlIllIlIll.length;
        byte llllllllllllIlIlllIIlIIlIllIIlll = (byte)SctpChannelOption.lllIlIIIlIllIl[0];
        while (lIlIIIIllIlllIIl(llllllllllllIlIlllIIlIIlIllIIlll, llllllllllllIlIlllIIlIIlIllIlIIl)) {
            final char llllllllllllIlIlllIIlIIlIlllllll = llllllllllllIlIlllIIlIIlIllIlIll[llllllllllllIlIlllIIlIIlIllIIlll];
            llllllllllllIlIlllIIlIIlIllllIIl.append((char)(llllllllllllIlIlllIIlIIlIlllllll ^ llllllllllllIlIlllIIlIIlIlllIlll[llllllllllllIlIlllIIlIIlIlllIlIl % llllllllllllIlIlllIIlIIlIlllIlll.length]));
            "".length();
            ++llllllllllllIlIlllIIlIIlIlllIlIl;
            ++llllllllllllIlIlllIIlIIlIllIIlll;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllIIlIIlIllllIIl);
    }
}
