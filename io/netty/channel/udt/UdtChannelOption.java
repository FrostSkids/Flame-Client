// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.udt;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.ChannelOption;

public final class UdtChannelOption<T> extends ChannelOption<T>
{
    private static final /* synthetic */ String[] lIIlllllIlIllI;
    private static final /* synthetic */ int[] lIIlllllIllIII;
    
    static {
        llIllllIllIIIll();
        llIllllIllIIIII();
        PROTOCOL_RECEIVE_BUFFER_SIZE = new UdtChannelOption<Integer>(UdtChannelOption.lIIlllllIlIllI[UdtChannelOption.lIIlllllIllIII[0]]);
        PROTOCOL_SEND_BUFFER_SIZE = new UdtChannelOption<Integer>(UdtChannelOption.lIIlllllIlIllI[UdtChannelOption.lIIlllllIllIII[1]]);
        SYSTEM_RECEIVE_BUFFER_SIZE = new UdtChannelOption<Integer>(UdtChannelOption.lIIlllllIlIllI[UdtChannelOption.lIIlllllIllIII[2]]);
        SYSTEM_SEND_BUFFER_SIZE = new UdtChannelOption<Integer>(UdtChannelOption.lIIlllllIlIllI[UdtChannelOption.lIIlllllIllIII[3]]);
    }
    
    private static String llIllllIlIllIll(final String lllllllllllllIIlIIlIIIllIIllllll, final String lllllllllllllIIlIIlIIIllIIlllllI) {
        try {
            final SecretKeySpec lllllllllllllIIlIIlIIIllIlIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIIIllIIlllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIlIIIllIlIIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIlIIIllIlIIIIIl.init(UdtChannelOption.lIIlllllIllIII[2], lllllllllllllIIlIIlIIIllIlIIIIlI);
            return new String(lllllllllllllIIlIIlIIIllIlIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIIIllIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIlIIIllIlIIIIII) {
            lllllllllllllIIlIIlIIIllIlIIIIII.printStackTrace();
            return null;
        }
    }
    
    private UdtChannelOption(final String lllllllllllllIIlIIlIIIllIllIlllI) {
        super(lllllllllllllIIlIIlIIIllIllIlllI);
    }
    
    private static void llIllllIllIIIll() {
        (lIIlllllIllIII = new int[6])[0] = ((0x51 ^ 0x14) & ~(0xC2 ^ 0x87));
        UdtChannelOption.lIIlllllIllIII[1] = " ".length();
        UdtChannelOption.lIIlllllIllIII[2] = "  ".length();
        UdtChannelOption.lIIlllllIllIII[3] = "   ".length();
        UdtChannelOption.lIIlllllIllIII[4] = (0x6A ^ 0x6E);
        UdtChannelOption.lIIlllllIllIII[5] = (0x50 ^ 0x58);
    }
    
    private static void llIllllIllIIIII() {
        (lIIlllllIlIllI = new String[UdtChannelOption.lIIlllllIllIII[4]])[UdtChannelOption.lIIlllllIllIII[0]] = llIllllIlIllIll("0Sw99Ck15l4OQtQL7RmUs/PNMYqtA5ugQHJcIdt5GrQ=", "dgeNX");
        UdtChannelOption.lIIlllllIlIllI[UdtChannelOption.lIIlllllIllIII[1]] = llIllllIlIlllIl("1IE9ox5RIZUqYrXRWptKAsJcepenb5U9yvU98/v7+L0=", "TEjCv");
        UdtChannelOption.lIIlllllIlIllI[UdtChannelOption.lIIlllllIllIII[2]] = llIllllIlIlllll("PxIhNQkhFCAkDykCJCQTLh40Jwk+FCEoFik=", "lKraL");
        UdtChannelOption.lIIlllllIlIllI[UdtChannelOption.lIIlllllIllIII[3]] = llIllllIlIlllll("PjM4HDYgNTgNPSk1KR01Ky85FyAkMC4=", "mjkHs");
    }
    
    private static boolean llIllllIllIIlII(final int lllllllllllllIIlIIlIIIllIIllIlll, final int lllllllllllllIIlIIlIIIllIIllIllI) {
        return lllllllllllllIIlIIlIIIllIIllIlll < lllllllllllllIIlIIlIIIllIIllIllI;
    }
    
    private static String llIllllIlIlllIl(final String lllllllllllllIIlIIlIIIllIlIIlIlI, final String lllllllllllllIIlIIlIIIllIlIIlIll) {
        try {
            final SecretKeySpec lllllllllllllIIlIIlIIIllIlIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIIIllIlIIlIll.getBytes(StandardCharsets.UTF_8)), UdtChannelOption.lIIlllllIllIII[5]), "DES");
            final Cipher lllllllllllllIIlIIlIIIllIlIIlllI = Cipher.getInstance("DES");
            lllllllllllllIIlIIlIIIllIlIIlllI.init(UdtChannelOption.lIIlllllIllIII[2], lllllllllllllIIlIIlIIIllIlIIllll);
            return new String(lllllllllllllIIlIIlIIIllIlIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIIIllIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIlIIIllIlIIllIl) {
            lllllllllllllIIlIIlIIIllIlIIllIl.printStackTrace();
            return null;
        }
    }
    
    private static String llIllllIlIlllll(String lllllllllllllIIlIIlIIIllIlIlllII, final String lllllllllllllIIlIIlIIIllIllIIIII) {
        lllllllllllllIIlIIlIIIllIlIlllII = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIlIIIllIlIlllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIlIIIllIlIlllll = new StringBuilder();
        final char[] lllllllllllllIIlIIlIIIllIlIllllI = lllllllllllllIIlIIlIIIllIllIIIII.toCharArray();
        int lllllllllllllIIlIIlIIIllIlIlllIl = UdtChannelOption.lIIlllllIllIII[0];
        final Exception lllllllllllllIIlIIlIIIllIlIlIlll = (Object)((String)lllllllllllllIIlIIlIIIllIlIlllII).toCharArray();
        final String lllllllllllllIIlIIlIIIllIlIlIllI = (String)lllllllllllllIIlIIlIIIllIlIlIlll.length;
        short lllllllllllllIIlIIlIIIllIlIlIlIl = (short)UdtChannelOption.lIIlllllIllIII[0];
        while (llIllllIllIIlII(lllllllllllllIIlIIlIIIllIlIlIlIl, (int)lllllllllllllIIlIIlIIIllIlIlIllI)) {
            final char lllllllllllllIIlIIlIIIllIllIIIlI = lllllllllllllIIlIIlIIIllIlIlIlll[lllllllllllllIIlIIlIIIllIlIlIlIl];
            lllllllllllllIIlIIlIIIllIlIlllll.append((char)(lllllllllllllIIlIIlIIIllIllIIIlI ^ lllllllllllllIIlIIlIIIllIlIllllI[lllllllllllllIIlIIlIIIllIlIlllIl % lllllllllllllIIlIIlIIIllIlIllllI.length]));
            "".length();
            ++lllllllllllllIIlIIlIIIllIlIlllIl;
            ++lllllllllllllIIlIIlIIIllIlIlIlIl;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIlIIIllIlIlllll);
    }
}
