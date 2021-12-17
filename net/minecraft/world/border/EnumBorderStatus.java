// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.border;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public enum EnumBorderStatus
{
    GROWING(EnumBorderStatus.llIIIIlIIlIlll[EnumBorderStatus.llIIIIlIIllIII[0]], EnumBorderStatus.llIIIIlIIllIII[0], EnumBorderStatus.llIIIIlIIllIII[1]);
    
    private static final /* synthetic */ String[] llIIIIlIIlIlll;
    
    STATIONARY(EnumBorderStatus.llIIIIlIIlIlll[EnumBorderStatus.llIIIIlIIllIII[4]], EnumBorderStatus.llIIIIlIIllIII[4], EnumBorderStatus.llIIIIlIIllIII[5]), 
    SHRINKING(EnumBorderStatus.llIIIIlIIlIlll[EnumBorderStatus.llIIIIlIIllIII[2]], EnumBorderStatus.llIIIIlIIllIII[2], EnumBorderStatus.llIIIIlIIllIII[3]);
    
    private final /* synthetic */ int id;
    private static final /* synthetic */ int[] llIIIIlIIllIII;
    
    private static String lIIIIlllllIIIlll(final String llllllllllllIlllIlllIIIIIllllllI, final String llllllllllllIlllIlllIIIIIllllIll) {
        try {
            final SecretKeySpec llllllllllllIlllIlllIIIIlIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlllIIIIIllllIll.getBytes(StandardCharsets.UTF_8)), EnumBorderStatus.llIIIIlIIllIII[7]), "DES");
            final Cipher llllllllllllIlllIlllIIIIlIIIIIII = Cipher.getInstance("DES");
            llllllllllllIlllIlllIIIIlIIIIIII.init(EnumBorderStatus.llIIIIlIIllIII[4], llllllllllllIlllIlllIIIIlIIIIIIl);
            return new String(llllllllllllIlllIlllIIIIlIIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlllIIIIIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlllIIIIIlllllll) {
            llllllllllllIlllIlllIIIIIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIlllllIIlIIl() {
        (llIIIIlIIllIII = new int[8])[0] = ((0x1C ^ 0x3F ^ (0x33 ^ 0x36)) & (0xDC ^ 0xA1 ^ (0xEE ^ 0xB5) ^ -" ".length()));
        EnumBorderStatus.llIIIIlIIllIII[1] = (0xFFFFFF9E & 0x40FFE1);
        EnumBorderStatus.llIIIIlIIllIII[2] = " ".length();
        EnumBorderStatus.llIIIIlIIllIII[3] = (-(0xFFFFDFCB & 0x6BFF) & (0xFFFFFBFA & 0xFF7FFF));
        EnumBorderStatus.llIIIIlIIllIII[4] = "  ".length();
        EnumBorderStatus.llIIIIlIIllIII[5] = (0xFFFFB6FF & 0x20E9FF);
        EnumBorderStatus.llIIIIlIIllIII[6] = "   ".length();
        EnumBorderStatus.llIIIIlIIllIII[7] = (64 + 94 - 102 + 92 ^ 147 + 146 - 177 + 40);
    }
    
    private static String lIIIIlllllIIIllI(String llllllllllllIlllIlllIIIIlIIIlllI, final String llllllllllllIlllIlllIIIIlIIIllIl) {
        llllllllllllIlllIlllIIIIlIIIlllI = new String(Base64.getDecoder().decode(llllllllllllIlllIlllIIIIlIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlllIIIIlIIlIIIl = new StringBuilder();
        final char[] llllllllllllIlllIlllIIIIlIIlIIII = llllllllllllIlllIlllIIIIlIIIllIl.toCharArray();
        int llllllllllllIlllIlllIIIIlIIIllll = EnumBorderStatus.llIIIIlIIllIII[0];
        final byte llllllllllllIlllIlllIIIIlIIIlIIl = (Object)llllllllllllIlllIlllIIIIlIIIlllI.toCharArray();
        final String llllllllllllIlllIlllIIIIlIIIlIII = (String)llllllllllllIlllIlllIIIIlIIIlIIl.length;
        Exception llllllllllllIlllIlllIIIIlIIIIlll = (Exception)EnumBorderStatus.llIIIIlIIllIII[0];
        while (lIIIIlllllIIlIlI((int)llllllllllllIlllIlllIIIIlIIIIlll, (int)llllllllllllIlllIlllIIIIlIIIlIII)) {
            final char llllllllllllIlllIlllIIIIlIIlIlII = llllllllllllIlllIlllIIIIlIIIlIIl[llllllllllllIlllIlllIIIIlIIIIlll];
            llllllllllllIlllIlllIIIIlIIlIIIl.append((char)(llllllllllllIlllIlllIIIIlIIlIlII ^ llllllllllllIlllIlllIIIIlIIlIIII[llllllllllllIlllIlllIIIIlIIIllll % llllllllllllIlllIlllIIIIlIIlIIII.length]));
            "".length();
            ++llllllllllllIlllIlllIIIIlIIIllll;
            ++llllllllllllIlllIlllIIIIlIIIIlll;
            "".length();
            if (((52 + 26 + 7 + 43 ^ 142 + 128 - 103 + 13) & (0x80 ^ 0x9E ^ (0x2D ^ 0x7) ^ -" ".length())) != ((22 + 118 - 45 + 33 ^ 113 + 66 - 18 + 0) & (0xF ^ 0x33 ^ (0x55 ^ 0x48) ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlllIIIIlIIlIIIl);
    }
    
    static {
        lIIIIlllllIIlIIl();
        lIIIIlllllIIlIII();
        final EnumBorderStatus[] enum$VALUES = new EnumBorderStatus[EnumBorderStatus.llIIIIlIIllIII[6]];
        enum$VALUES[EnumBorderStatus.llIIIIlIIllIII[0]] = EnumBorderStatus.GROWING;
        enum$VALUES[EnumBorderStatus.llIIIIlIIllIII[2]] = EnumBorderStatus.SHRINKING;
        enum$VALUES[EnumBorderStatus.llIIIIlIIllIII[4]] = EnumBorderStatus.STATIONARY;
        ENUM$VALUES = enum$VALUES;
    }
    
    private static void lIIIIlllllIIlIII() {
        (llIIIIlIIlIlll = new String[EnumBorderStatus.llIIIIlIIllIII[6]])[EnumBorderStatus.llIIIIlIIllIII[0]] = lIIIIlllllIIIllI("ExotLQcaDw==", "THbzN");
        EnumBorderStatus.llIIIIlIIlIlll[EnumBorderStatus.llIIIIlIIllIII[2]] = lIIIIlllllIIIllI("BgwVETseDQkf", "UDGXu");
        EnumBorderStatus.llIIIIlIIlIlll[EnumBorderStatus.llIIIIlIIllIII[4]] = lIIIIlllllIIIlll("gZzI9wxDTGjuvAuKVbzI0A==", "TLSZb");
    }
    
    private static boolean lIIIIlllllIIlIlI(final int llllllllllllIlllIlllIIIIIlllIllI, final int llllllllllllIlllIlllIIIIIlllIlIl) {
        return llllllllllllIlllIlllIIIIIlllIllI < llllllllllllIlllIlllIIIIIlllIlIl;
    }
    
    public int getID() {
        return this.id;
    }
    
    private EnumBorderStatus(final String llllllllllllIlllIlllIIIIlIlIlIll, final int llllllllllllIlllIlllIIIIlIlIlIlI, final int llllllllllllIlllIlllIIIIlIlIlIIl) {
        this.id = llllllllllllIlllIlllIIIIlIlIlIIl;
    }
}
