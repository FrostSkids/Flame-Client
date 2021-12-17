// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public enum EnumPacketDirection
{
    CLIENTBOUND(EnumPacketDirection.lIIIIIIllIlllI[EnumPacketDirection.lIIIIIIlllIIll[1]], EnumPacketDirection.lIIIIIIlllIIll[1]);
    
    private static final /* synthetic */ int[] lIIIIIIlllIIll;
    private static final /* synthetic */ String[] lIIIIIIllIlllI;
    
    SERVERBOUND(EnumPacketDirection.lIIIIIIllIlllI[EnumPacketDirection.lIIIIIIlllIIll[0]], EnumPacketDirection.lIIIIIIlllIIll[0]);
    
    private EnumPacketDirection(final String lllllllllllllIlIlIIIIIIllIIIIIII, final int lllllllllllllIlIlIIIIIIlIlllllll) {
    }
    
    private static String lIllIlIIllIlIII(final String lllllllllllllIlIlIIIIIIlIlIlIlll, final String lllllllllllllIlIlIIIIIIlIlIlIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIIIIIlIlIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIIIIIlIlIlIlII.getBytes(StandardCharsets.UTF_8)), EnumPacketDirection.lIIIIIIlllIIll[3]), "DES");
            final Cipher lllllllllllllIlIlIIIIIIlIlIllIIl = Cipher.getInstance("DES");
            lllllllllllllIlIlIIIIIIlIlIllIIl.init(EnumPacketDirection.lIIIIIIlllIIll[2], lllllllllllllIlIlIIIIIIlIlIllIlI);
            return new String(lllllllllllllIlIlIIIIIIlIlIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIIIIIlIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIIIIIlIlIllIII) {
            lllllllllllllIlIlIIIIIIlIlIllIII.printStackTrace();
            return null;
        }
    }
    
    private static void lIllIlIIllIlIlI() {
        (lIIIIIIllIlllI = new String[EnumPacketDirection.lIIIIIIlllIIll[2]])[EnumPacketDirection.lIIIIIIlllIIll[0]] = lIllIlIIllIlIII("AuBMbGpOgMxbFcynQlrhAg==", "lWDyA");
        EnumPacketDirection.lIIIIIIllIlllI[EnumPacketDirection.lIIIIIIlllIIll[1]] = lIllIlIIllIlIIl("CwIfBgIcDBkWAgw=", "HNVCL");
    }
    
    private static String lIllIlIIllIlIIl(String lllllllllllllIlIlIIIIIIlIllIIlll, final String lllllllllllllIlIlIIIIIIlIllIlIll) {
        lllllllllllllIlIlIIIIIIlIllIIlll = new String(Base64.getDecoder().decode(lllllllllllllIlIlIIIIIIlIllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIIIIIIlIllIlIlI = new StringBuilder();
        final char[] lllllllllllllIlIlIIIIIIlIllIlIIl = lllllllllllllIlIlIIIIIIlIllIlIll.toCharArray();
        int lllllllllllllIlIlIIIIIIlIllIlIII = EnumPacketDirection.lIIIIIIlllIIll[0];
        final float lllllllllllllIlIlIIIIIIlIllIIIlI = (Object)lllllllllllllIlIlIIIIIIlIllIIlll.toCharArray();
        final char lllllllllllllIlIlIIIIIIlIllIIIIl = (char)lllllllllllllIlIlIIIIIIlIllIIIlI.length;
        short lllllllllllllIlIlIIIIIIlIllIIIII = (short)EnumPacketDirection.lIIIIIIlllIIll[0];
        while (lIllIlIIlllIIll(lllllllllllllIlIlIIIIIIlIllIIIII, lllllllllllllIlIlIIIIIIlIllIIIIl)) {
            final char lllllllllllllIlIlIIIIIIlIllIllIl = lllllllllllllIlIlIIIIIIlIllIIIlI[lllllllllllllIlIlIIIIIIlIllIIIII];
            lllllllllllllIlIlIIIIIIlIllIlIlI.append((char)(lllllllllllllIlIlIIIIIIlIllIllIl ^ lllllllllllllIlIlIIIIIIlIllIlIIl[lllllllllllllIlIlIIIIIIlIllIlIII % lllllllllllllIlIlIIIIIIlIllIlIIl.length]));
            "".length();
            ++lllllllllllllIlIlIIIIIIlIllIlIII;
            ++lllllllllllllIlIlIIIIIIlIllIIIII;
            "".length();
            if (((67 + 74 - 120 + 138 ^ 113 + 91 - 57 + 26) & (0xC3 ^ 0x84 ^ (0x60 ^ 0x15) ^ -" ".length()) & (((0xEA ^ 0xA5 ^ (0xD5 ^ 0x8A)) & (0x69 ^ 0x2C ^ (0x27 ^ 0x72) ^ -" ".length())) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIIIIIIlIllIlIlI);
    }
    
    private static boolean lIllIlIIlllIIll(final int lllllllllllllIlIlIIIIIIlIlIIllll, final int lllllllllllllIlIlIIIIIIlIlIIlllI) {
        return lllllllllllllIlIlIIIIIIlIlIIllll < lllllllllllllIlIlIIIIIIlIlIIlllI;
    }
    
    private static void lIllIlIIlllIIIl() {
        (lIIIIIIlllIIll = new int[4])[0] = ((0x56 ^ 0x1D ^ (0x88 ^ 0x9B)) & (0x46 ^ 0x6E ^ (0x5E ^ 0x2E) ^ -" ".length()));
        EnumPacketDirection.lIIIIIIlllIIll[1] = " ".length();
        EnumPacketDirection.lIIIIIIlllIIll[2] = "  ".length();
        EnumPacketDirection.lIIIIIIlllIIll[3] = (0x53 ^ 0x5B);
    }
    
    static {
        lIllIlIIlllIIIl();
        lIllIlIIllIlIlI();
        final EnumPacketDirection[] enum$VALUES = new EnumPacketDirection[EnumPacketDirection.lIIIIIIlllIIll[2]];
        enum$VALUES[EnumPacketDirection.lIIIIIIlllIIll[0]] = EnumPacketDirection.SERVERBOUND;
        enum$VALUES[EnumPacketDirection.lIIIIIIlllIIll[1]] = EnumPacketDirection.CLIENTBOUND;
        ENUM$VALUES = enum$VALUES;
    }
}
