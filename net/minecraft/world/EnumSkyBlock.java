// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public enum EnumSkyBlock
{
    SKY(EnumSkyBlock.llllIIIlIlIll[EnumSkyBlock.llllIIIlIllII[0]], EnumSkyBlock.llllIIIlIllII[0], EnumSkyBlock.llllIIIlIllII[1]);
    
    public final /* synthetic */ int defaultLightValue;
    private static final /* synthetic */ int[] llllIIIlIllII;
    
    BLOCK(EnumSkyBlock.llllIIIlIlIll[EnumSkyBlock.llllIIIlIllII[2]], EnumSkyBlock.llllIIIlIllII[2], EnumSkyBlock.llllIIIlIllII[0]);
    
    private static final /* synthetic */ String[] llllIIIlIlIll;
    
    private static void lIlIIllllIlIlII() {
        (llllIIIlIllII = new int[5])[0] = ((0xF9 ^ 0x9B) & ~(0x54 ^ 0x36));
        EnumSkyBlock.llllIIIlIllII[1] = (0xAA ^ 0xA5);
        EnumSkyBlock.llllIIIlIllII[2] = " ".length();
        EnumSkyBlock.llllIIIlIllII[3] = "  ".length();
        EnumSkyBlock.llllIIIlIllII[4] = (0x50 ^ 0x58);
    }
    
    private static void lIlIIllllIlIIll() {
        (llllIIIlIlIll = new String[EnumSkyBlock.llllIIIlIllII[3]])[EnumSkyBlock.llllIIIlIllII[0]] = lIlIIllllIIlllI("pWtXH9ARwpw=", "qxUfF");
        EnumSkyBlock.llllIIIlIlIll[EnumSkyBlock.llllIIIlIllII[2]] = lIlIIllllIlIIlI("FycoOwM=", "UkgxH");
    }
    
    private static String lIlIIllllIlIIlI(String lllllllllllllIlIllllIIIlIIlllIII, final String lllllllllllllIlIllllIIIlIIllIlll) {
        lllllllllllllIlIllllIIIlIIlllIII = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIllllIIIlIIlllIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllllIIIlIIlllIll = new StringBuilder();
        final char[] lllllllllllllIlIllllIIIlIIlllIlI = lllllllllllllIlIllllIIIlIIllIlll.toCharArray();
        int lllllllllllllIlIllllIIIlIIlllIIl = EnumSkyBlock.llllIIIlIllII[0];
        final boolean lllllllllllllIlIllllIIIlIIllIIll = (Object)((String)lllllllllllllIlIllllIIIlIIlllIII).toCharArray();
        final int lllllllllllllIlIllllIIIlIIllIIlI = lllllllllllllIlIllllIIIlIIllIIll.length;
        char lllllllllllllIlIllllIIIlIIllIIIl = (char)EnumSkyBlock.llllIIIlIllII[0];
        while (lIlIIllllIlIlIl(lllllllllllllIlIllllIIIlIIllIIIl, lllllllllllllIlIllllIIIlIIllIIlI)) {
            final char lllllllllllllIlIllllIIIlIIlllllI = lllllllllllllIlIllllIIIlIIllIIll[lllllllllllllIlIllllIIIlIIllIIIl];
            lllllllllllllIlIllllIIIlIIlllIll.append((char)(lllllllllllllIlIllllIIIlIIlllllI ^ lllllllllllllIlIllllIIIlIIlllIlI[lllllllllllllIlIllllIIIlIIlllIIl % lllllllllllllIlIllllIIIlIIlllIlI.length]));
            "".length();
            ++lllllllllllllIlIllllIIIlIIlllIIl;
            ++lllllllllllllIlIllllIIIlIIllIIIl;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllllIIIlIIlllIll);
    }
    
    private EnumSkyBlock(final String lllllllllllllIlIllllIIIlIlIlllll, final int lllllllllllllIlIllllIIIlIlIllllI, final int lllllllllllllIlIllllIIIlIlIlllIl) {
        this.defaultLightValue = lllllllllllllIlIllllIIIlIlIlllIl;
    }
    
    private static String lIlIIllllIIlllI(final String lllllllllllllIlIllllIIIlIlIIlIll, final String lllllllllllllIlIllllIIIlIlIIllII) {
        try {
            final SecretKeySpec lllllllllllllIlIllllIIIlIlIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllllIIIlIlIIllII.getBytes(StandardCharsets.UTF_8)), EnumSkyBlock.llllIIIlIllII[4]), "DES");
            final Cipher lllllllllllllIlIllllIIIlIlIIllll = Cipher.getInstance("DES");
            lllllllllllllIlIllllIIIlIlIIllll.init(EnumSkyBlock.llllIIIlIllII[3], lllllllllllllIlIllllIIIlIlIlIIII);
            return new String(lllllllllllllIlIllllIIIlIlIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllllIIIlIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllllIIIlIlIIlllI) {
            lllllllllllllIlIllllIIIlIlIIlllI.printStackTrace();
            return null;
        }
    }
    
    static {
        lIlIIllllIlIlII();
        lIlIIllllIlIIll();
        final EnumSkyBlock[] enum$VALUES = new EnumSkyBlock[EnumSkyBlock.llllIIIlIllII[3]];
        enum$VALUES[EnumSkyBlock.llllIIIlIllII[0]] = EnumSkyBlock.SKY;
        enum$VALUES[EnumSkyBlock.llllIIIlIllII[2]] = EnumSkyBlock.BLOCK;
        ENUM$VALUES = enum$VALUES;
    }
    
    private static boolean lIlIIllllIlIlIl(final int lllllllllllllIlIllllIIIlIIlIllIl, final int lllllllllllllIlIllllIIIlIIlIllII) {
        return lllllllllllllIlIllllIIIlIIlIllIl < lllllllllllllIlIllllIIIlIIlIllII;
    }
}
