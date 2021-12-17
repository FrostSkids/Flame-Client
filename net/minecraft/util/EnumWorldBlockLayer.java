// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public enum EnumWorldBlockLayer
{
    private final /* synthetic */ String layerName;
    private static final /* synthetic */ int[] lIIIllllIlIlIl;
    
    CUTOUT(EnumWorldBlockLayer.lIIIllllIlIIII[EnumWorldBlockLayer.lIIIllllIlIlIl[4]], EnumWorldBlockLayer.lIIIllllIlIlIl[2], EnumWorldBlockLayer.lIIIllllIlIIII[EnumWorldBlockLayer.lIIIllllIlIlIl[5]]), 
    SOLID(EnumWorldBlockLayer.lIIIllllIlIIII[EnumWorldBlockLayer.lIIIllllIlIlIl[0]], EnumWorldBlockLayer.lIIIllllIlIlIl[0], EnumWorldBlockLayer.lIIIllllIlIIII[EnumWorldBlockLayer.lIIIllllIlIlIl[1]]);
    
    private static final /* synthetic */ String[] lIIIllllIlIIII;
    
    TRANSLUCENT(EnumWorldBlockLayer.lIIIllllIlIIII[EnumWorldBlockLayer.lIIIllllIlIlIl[6]], EnumWorldBlockLayer.lIIIllllIlIlIl[3], EnumWorldBlockLayer.lIIIllllIlIIII[EnumWorldBlockLayer.lIIIllllIlIlIl[7]]), 
    CUTOUT_MIPPED(EnumWorldBlockLayer.lIIIllllIlIIII[EnumWorldBlockLayer.lIIIllllIlIlIl[2]], EnumWorldBlockLayer.lIIIllllIlIlIl[1], EnumWorldBlockLayer.lIIIllllIlIIII[EnumWorldBlockLayer.lIIIllllIlIlIl[3]]);
    
    private static String llIIIlllllIIIlI(final String lllllllllllllIIllllIIlllIlllIlII, final String lllllllllllllIIllllIIlllIlllIIll) {
        try {
            final SecretKeySpec lllllllllllllIIllllIIlllIlllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIIlllIlllIIll.getBytes(StandardCharsets.UTF_8)), EnumWorldBlockLayer.lIIIllllIlIlIl[8]), "DES");
            final Cipher lllllllllllllIIllllIIlllIlllIllI = Cipher.getInstance("DES");
            lllllllllllllIIllllIIlllIlllIllI.init(EnumWorldBlockLayer.lIIIllllIlIlIl[2], lllllllllllllIIllllIIlllIlllIlll);
            return new String(lllllllllllllIIllllIIlllIlllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIIlllIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIIlllIlllIlIl) {
            lllllllllllllIIllllIIlllIlllIlIl.printStackTrace();
            return null;
        }
    }
    
    private static String llIIIllllIlllll(final String lllllllllllllIIllllIIlllIlllllll, final String lllllllllllllIIllllIIllllIIIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIllllIIllllIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIIllllIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllIIllllIIIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllIIllllIIIIIll.init(EnumWorldBlockLayer.lIIIllllIlIlIl[2], lllllllllllllIIllllIIllllIIIIlII);
            return new String(lllllllllllllIIllllIIllllIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIIlllIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIIllllIIIIIlI) {
            lllllllllllllIIllllIIllllIIIIIlI.printStackTrace();
            return null;
        }
    }
    
    private static void llIIIlllllIlIll() {
        (lIIIllllIlIlIl = new int[9])[0] = ((0x7F ^ 0x40) & ~(0x39 ^ 0x6));
        EnumWorldBlockLayer.lIIIllllIlIlIl[1] = " ".length();
        EnumWorldBlockLayer.lIIIllllIlIlIl[2] = "  ".length();
        EnumWorldBlockLayer.lIIIllllIlIlIl[3] = "   ".length();
        EnumWorldBlockLayer.lIIIllllIlIlIl[4] = (0x49 ^ 0x21 ^ (0x2E ^ 0x42));
        EnumWorldBlockLayer.lIIIllllIlIlIl[5] = (0x73 ^ 0x31 ^ (0x63 ^ 0x24));
        EnumWorldBlockLayer.lIIIllllIlIlIl[6] = (0x17 ^ 0x11);
        EnumWorldBlockLayer.lIIIllllIlIlIl[7] = (0x8D ^ 0xC0 ^ (0x43 ^ 0x9));
        EnumWorldBlockLayer.lIIIllllIlIlIl[8] = (0xA5 ^ 0xAD);
    }
    
    private static String llIIIlllllIIIIl(String lllllllllllllIIllllIIlllIlIlllll, final String lllllllllllllIIllllIIlllIlIllllI) {
        lllllllllllllIIllllIIlllIlIlllll = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllllIIlllIlIlllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllllIIlllIllIIIlI = new StringBuilder();
        final char[] lllllllllllllIIllllIIlllIllIIIIl = lllllllllllllIIllllIIlllIlIllllI.toCharArray();
        int lllllllllllllIIllllIIlllIllIIIII = EnumWorldBlockLayer.lIIIllllIlIlIl[0];
        final Exception lllllllllllllIIllllIIlllIlIllIlI = (Object)((String)lllllllllllllIIllllIIlllIlIlllll).toCharArray();
        final char lllllllllllllIIllllIIlllIlIllIIl = (char)lllllllllllllIIllllIIlllIlIllIlI.length;
        float lllllllllllllIIllllIIlllIlIllIII = EnumWorldBlockLayer.lIIIllllIlIlIl[0];
        while (llIIIlllllIllII((int)lllllllllllllIIllllIIlllIlIllIII, lllllllllllllIIllllIIlllIlIllIIl)) {
            final char lllllllllllllIIllllIIlllIllIIlIl = lllllllllllllIIllllIIlllIlIllIlI[lllllllllllllIIllllIIlllIlIllIII];
            lllllllllllllIIllllIIlllIllIIIlI.append((char)(lllllllllllllIIllllIIlllIllIIlIl ^ lllllllllllllIIllllIIlllIllIIIIl[lllllllllllllIIllllIIlllIllIIIII % lllllllllllllIIllllIIlllIllIIIIl.length]));
            "".length();
            ++lllllllllllllIIllllIIlllIllIIIII;
            ++lllllllllllllIIllllIIlllIlIllIII;
            "".length();
            if ("   ".length() > (37 + 104 - 135 + 155 ^ 32 + 65 + 55 + 13)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllllIIlllIllIIIlI);
    }
    
    @Override
    public String toString() {
        return this.layerName;
    }
    
    private EnumWorldBlockLayer(final String lllllllllllllIIllllIIllllIIlIllI, final int lllllllllllllIIllllIIllllIIlIlIl, final String lllllllllllllIIllllIIllllIIlIlII) {
        this.layerName = lllllllllllllIIllllIIllllIIlIlII;
    }
    
    static {
        llIIIlllllIlIll();
        llIIIlllllIIIll();
        final EnumWorldBlockLayer[] enum$VALUES = new EnumWorldBlockLayer[EnumWorldBlockLayer.lIIIllllIlIlIl[4]];
        enum$VALUES[EnumWorldBlockLayer.lIIIllllIlIlIl[0]] = EnumWorldBlockLayer.SOLID;
        enum$VALUES[EnumWorldBlockLayer.lIIIllllIlIlIl[1]] = EnumWorldBlockLayer.CUTOUT_MIPPED;
        enum$VALUES[EnumWorldBlockLayer.lIIIllllIlIlIl[2]] = EnumWorldBlockLayer.CUTOUT;
        enum$VALUES[EnumWorldBlockLayer.lIIIllllIlIlIl[3]] = EnumWorldBlockLayer.TRANSLUCENT;
        ENUM$VALUES = enum$VALUES;
    }
    
    private static boolean llIIIlllllIllII(final int lllllllllllllIIllllIIlllIlIlIlII, final int lllllllllllllIIllllIIlllIlIlIIll) {
        return lllllllllllllIIllllIIlllIlIlIlII < lllllllllllllIIllllIIlllIlIlIIll;
    }
    
    private static void llIIIlllllIIIll() {
        (lIIIllllIlIIII = new String[EnumWorldBlockLayer.lIIIllllIlIlIl[8]])[EnumWorldBlockLayer.lIIIllllIlIlIl[0]] = llIIIllllIlllll("636ajJjMS2c=", "ahYMt");
        EnumWorldBlockLayer.lIIIllllIlIIII[EnumWorldBlockLayer.lIIIllllIlIlIl[1]] = llIIIlllllIIIIl("JSo6Cxc=", "vEVbs");
        EnumWorldBlockLayer.lIIIllllIlIIII[EnumWorldBlockLayer.lIIIllllIlIlIl[2]] = llIIIlllllIIIIl("ExA+KDkEGicuPAAALg==", "PEjgl");
        EnumWorldBlockLayer.lIIIllllIlIIII[EnumWorldBlockLayer.lIIIllllIlIlIl[3]] = llIIIllllIlllll("fpcHJsNenFTImqI5quHgBQ==", "qauuR");
        EnumWorldBlockLayer.lIIIllllIlIIII[EnumWorldBlockLayer.lIIIllllIlIlIl[4]] = llIIIlllllIIIlI("UOlKwoNV7LM=", "JNdAB");
        EnumWorldBlockLayer.lIIIllllIlIIII[EnumWorldBlockLayer.lIIIllllIlIlIl[5]] = llIIIlllllIIIlI("xiGw9FuQr5o=", "QBbpu");
        EnumWorldBlockLayer.lIIIllllIlIIII[EnumWorldBlockLayer.lIIIllllIlIlIl[6]] = llIIIlllllIIIIl("MCIIFCkoJQofNDA=", "dpIZz");
        EnumWorldBlockLayer.lIIIllllIlIIII[EnumWorldBlockLayer.lIIIllllIlIlIl[7]] = llIIIlllllIIIIl("Mz0AJTQLOgIuKRM=", "gOaKG");
    }
}
