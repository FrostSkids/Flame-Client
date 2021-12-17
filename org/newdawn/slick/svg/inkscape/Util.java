// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.svg.inkscape;

import org.newdawn.slick.svg.ParsingException;
import org.newdawn.slick.svg.NonGeometricData;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.StringTokenizer;
import org.newdawn.slick.geom.Transform;
import org.w3c.dom.Element;

public class Util
{
    private static final /* synthetic */ int[] llllIIIIIllII;
    private static final /* synthetic */ String[] llllIIIIIlIlI;
    
    private static boolean lIlIIlllIIIIIlI(final Object lllllllllllllIlIllllIlIlIlllIlII) {
        return lllllllllllllIlIllllIlIlIlllIlII != null;
    }
    
    static Transform getTransform(final Element lllllllllllllIlIllllIlIlllIlIIll) {
        return getTransform(lllllllllllllIlIllllIlIlllIlIIll, Util.llllIIIIIlIlI[Util.llllIIIIIllII[27]]);
    }
    
    private static void lIlIIlllIIIIIII() {
        (llllIIIIIlIlI = new String[Util.llllIIIIIllII[42]])[Util.llllIIIIIllII[0]] = lIlIIllIllIllII("I9fBH7R6+jc=", "NcCcX");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[1]] = lIlIIllIlllIIIl("KAA=", "Adiex");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[2]] = lIlIIllIlllIIIl("HiArCQ==", "xIGej");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[3]] = lIlIIllIlllIIlI("2Ennhkgkp7M=", "ZrSnx");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[4]] = lIlIIllIlllIIlI("1LMawWY4fec=", "KDpSP");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[5]] = lIlIIllIlllIIlI("7gcBiNaZDyk=", "OxloQ");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[6]] = lIlIIllIlllIIlI("bXYOiHDfkJ0=", "uDDBb");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[7]] = lIlIIllIlllIIlI("uv0OZXmL0ok=", "MSxGx");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[8]] = lIlIIllIlllIIIl("KhIQJCc8SwYqPzEHEDktIA==", "YfbKL");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[9]] = lIlIIllIlllIIIl("GDIIPQYOax4zHgMnCCAMEg==", "kFzRm");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[10]] = lIlIIllIlllIIIl("GC0rKDMOdD0mKwM2PyErDi0=", "kYYGX");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[11]] = lIlIIllIllIllII("VxqxBo20WFYakO/Qt31BIgViwO6Mj5hK", "dYHUL");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[12]] = lIlIIllIllIllII("9dm9w7UG8zXF/V/9iQsDqa6abBgADI4k", "jfLxP");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[13]] = lIlIIllIllIllII("YzhmOPoqG4vyuX7W/pp+uFcK9/xHXBzs", "JALcF");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[14]] = lIlIIllIllIllII("iO7ACWjYKHfNC7ypgOFPxg==", "hlcSE");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[15]] = lIlIIllIlllIIIl("PT8XBjwrZgoZNi0iERA=", "NKeiW");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[16]] = lIlIIllIllIllII("NzURo8qh/ar1muSJqi/htg==", "vLyZU");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[17]] = lIlIIllIllIllII("e0RbwEu6Q4d7i1xdK0mdFw==", "JsOMr");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[18]] = lIlIIllIlllIIlI("vCWHhfzni5ld3kZxHkVetC4EMDt6vFV7gn1JvMFfnMfNFGu2QoyhADAgiqp6VD/u", "ZNNgo");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[19]] = lIlIIllIlllIIIl("PBIFMBo=", "PsgUv");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[20]] = lIlIIllIlllIIIl("", "ORuRG");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[21]] = lIlIIllIlllIIIl("PCM=", "UGesw");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[22]] = lIlIIllIlllIIlI("i704snipm8Y=", "pLLAU");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[23]] = lIlIIllIlllIIIl("", "swGqu");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[24]] = lIlIIllIlllIIlI("JA8G3ti/tYo=", "lUBRR");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[26]] = lIlIIllIllIllII("Pvyj44gyaHY=", "YDglh");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[27]] = lIlIIllIllIllII("GoJpitWwWsFCTVbXCm1IHA==", "TejEV");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[28]] = lIlIIllIlllIIlI("/MM/cvqEqsY=", "ZeRcH");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[29]] = lIlIIllIllIllII("im3AxmvNh53MTMNTE/AV6w==", "XCfJj");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[30]] = lIlIIllIlllIIIl("MxovKiIrCToheQ==", "GhNDQ");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[31]] = lIlIIllIlllIIlI("pzuOjmT6mac=", "Owdzq");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[32]] = lIlIIllIllIllII("7QveDh1/yYA=", "EUmtY");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[33]] = lIlIIllIlllIIIl("Gw0MPSUORA==", "vlxOL");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[34]] = lIlIIllIlllIIIl("dFg=", "XxawT");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[35]] = lIlIIllIlllIIIl("", "yViZo");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[36]] = lIlIIllIllIllII("9Bp17eoMy3wissuKNYygM0WPonV9CLzwMc7cOucxZAWgTZXXLmcSKPd7iXIMSAyEXQO+pKy1iQU=", "phaic");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[37]] = lIlIIllIlllIIlI("VsRyIoXRFIWvoP/ZVeE7GAmgsqQNBVDF", "KgLhh");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[38]] = lIlIIllIllIllII("ZK7uyBxd90Q=", "QyaZX");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[39]] = lIlIIllIllIllII("enW66eO/r9AwLkDma2vV65OV0eZtS9dqQ8uFGFj0pAo=", "VgTQW");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[40]] = lIlIIllIllIllII("uNIgZ40Yw4R2xQ5VnmoGMBMxo+jT6sC2kGg2SWn17Ow+qePLsAxLMA8o7hkBY6vE", "GHgfA");
        Util.llllIIIIIlIlI[Util.llllIIIIIllII[41]] = lIlIIllIlllIIlI("YonKjU7bLFE+7471JKeLzlmHMDU57+qAQvJJGSr/TFa/mpeH675t891Y8eOLV5Tif74z8JmY7l0=", "rgAgW");
    }
    
    private static boolean lIlIIlllIIIIlIl(final Object lllllllllllllIlIllllIlIlIlllIIlI) {
        return lllllllllllllIlIllllIlIlIlllIIlI == null;
    }
    
    private static boolean lIlIIlllIIIIllI(final int lllllllllllllIlIllllIlIlIlllIIII) {
        return lllllllllllllIlIllllIlIlIlllIIII != 0;
    }
    
    public static String getAsReference(String lllllllllllllIlIllllIlIllIlIllIl) {
        if (lIlIIlllIIIIlll(lllllllllllllIlIllllIlIllIlIllIl.length(), Util.llllIIIIIllII[2])) {
            return Util.llllIIIIIlIlI[Util.llllIIIIIllII[38]];
        }
        lllllllllllllIlIllllIlIllIlIllIl = lllllllllllllIlIllllIlIllIlIllIl.substring(Util.llllIIIIIllII[1], lllllllllllllIlIllllIlIllIlIllIl.length());
        return lllllllllllllIlIllllIlIllIlIllIl;
    }
    
    static String getStyle(final Element lllllllllllllIlIllllIlIllllIllII, final String lllllllllllllIlIllllIlIllllIlIll) {
        final String lllllllllllllIlIllllIlIllllIlIlI = lllllllllllllIlIllllIlIllllIllII.getAttribute(lllllllllllllIlIllllIlIllllIlIll);
        if (lIlIIlllIIIIIlI(lllllllllllllIlIllllIlIllllIlIlI) && lIlIIlllIIIIlII(lllllllllllllIlIllllIlIllllIlIlI.length())) {
            return lllllllllllllIlIllllIlIllllIlIlI;
        }
        final String lllllllllllllIlIllllIlIllllIlIIl = lllllllllllllIlIllllIlIllllIllII.getAttribute(Util.llllIIIIIlIlI[Util.llllIIIIIllII[22]]);
        return extractStyle(lllllllllllllIlIllllIlIllllIlIIl, lllllllllllllIlIllllIlIllllIlIll);
    }
    
    static {
        lIlIIlllIIIIIIl();
        lIlIIlllIIIIIII();
        XLINK = Util.llllIIIIIlIlI[Util.llllIIIIIllII[39]];
        INKSCAPE = Util.llllIIIIIlIlI[Util.llllIIIIIllII[40]];
        SODIPODI = Util.llllIIIIIlIlI[Util.llllIIIIIllII[41]];
    }
    
    static Transform getTransform(final Element lllllllllllllIlIllllIlIlllIIIIIl, final String lllllllllllllIlIllllIlIlllIIIIll) {
        String lllllllllllllIlIllllIlIlllIIIIlI = lllllllllllllIlIllllIlIlllIIIIIl.getAttribute(lllllllllllllIlIllllIlIlllIIIIll);
        if (lIlIIlllIIIIlIl(lllllllllllllIlIllllIlIlllIIIIlI)) {
            return new Transform();
        }
        if (lIlIIlllIIIIllI(lllllllllllllIlIllllIlIlllIIIIlI.equals(Util.llllIIIIIlIlI[Util.llllIIIIIllII[28]]) ? 1 : 0)) {
            return new Transform();
        }
        if (lIlIIlllIIIIllI(lllllllllllllIlIllllIlIlllIIIIlI.startsWith(Util.llllIIIIIlIlI[Util.llllIIIIIllII[29]]) ? 1 : 0)) {
            lllllllllllllIlIllllIlIlllIIIIlI = lllllllllllllIlIllllIlIlllIIIIlI.substring(Util.llllIIIIIllII[0], lllllllllllllIlIllllIlIlllIIIIlI.length() - Util.llllIIIIIllII[1]);
            lllllllllllllIlIllllIlIlllIIIIlI = lllllllllllllIlIllllIlIlllIIIIlI.substring(Util.llllIIIIIlIlI[Util.llllIIIIIllII[30]].length());
            final StringTokenizer lllllllllllllIlIllllIlIlllIIlIll = new StringTokenizer(lllllllllllllIlIllllIlIlllIIIIlI, Util.llllIIIIIlIlI[Util.llllIIIIIllII[31]]);
            final float lllllllllllllIlIllllIlIlllIIlIlI = Float.parseFloat(lllllllllllllIlIllllIlIlllIIlIll.nextToken());
            final float lllllllllllllIlIllllIlIlllIIlIIl = Float.parseFloat(lllllllllllllIlIllllIlIlllIIlIll.nextToken());
            return Transform.createTranslateTransform(lllllllllllllIlIllllIlIlllIIlIlI, lllllllllllllIlIllllIlIlllIIlIIl);
        }
        if (lIlIIlllIIIIllI(lllllllllllllIlIllllIlIlllIIIIlI.startsWith(Util.llllIIIIIlIlI[Util.llllIIIIIllII[32]]) ? 1 : 0)) {
            final float[] lllllllllllllIlIllllIlIlllIIIlll = new float[Util.llllIIIIIllII[6]];
            lllllllllllllIlIllllIlIlllIIIIlI = lllllllllllllIlIllllIlIlllIIIIlI.substring(Util.llllIIIIIllII[0], lllllllllllllIlIllllIlIlllIIIIlI.length() - Util.llllIIIIIllII[1]);
            lllllllllllllIlIllllIlIlllIIIIlI = lllllllllllllIlIllllIlIlllIIIIlI.substring(Util.llllIIIIIlIlI[Util.llllIIIIIllII[33]].length());
            final StringTokenizer lllllllllllllIlIllllIlIlllIIIllI = new StringTokenizer(lllllllllllllIlIllllIlIlllIIIIlI, Util.llllIIIIIlIlI[Util.llllIIIIIllII[34]]);
            final float[] lllllllllllllIlIllllIlIlllIIIlIl = new float[Util.llllIIIIIllII[6]];
            int lllllllllllllIlIllllIlIlllIIlIII = Util.llllIIIIIllII[0];
            while (lIlIIlllIIIIlll(lllllllllllllIlIllllIlIlllIIlIII, lllllllllllllIlIllllIlIlllIIIlIl.length)) {
                lllllllllllllIlIllllIlIlllIIIlIl[lllllllllllllIlIllllIlIlllIIlIII] = Float.parseFloat(lllllllllllllIlIllllIlIlllIIIllI.nextToken());
                ++lllllllllllllIlIllllIlIlllIIlIII;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            lllllllllllllIlIllllIlIlllIIIlll[Util.llllIIIIIllII[0]] = lllllllllllllIlIllllIlIlllIIIlIl[Util.llllIIIIIllII[0]];
            lllllllllllllIlIllllIlIlllIIIlll[Util.llllIIIIIllII[1]] = lllllllllllllIlIllllIlIlllIIIlIl[Util.llllIIIIIllII[2]];
            lllllllllllllIlIllllIlIlllIIIlll[Util.llllIIIIIllII[2]] = lllllllllllllIlIllllIlIlllIIIlIl[Util.llllIIIIIllII[4]];
            lllllllllllllIlIllllIlIlllIIIlll[Util.llllIIIIIllII[3]] = lllllllllllllIlIllllIlIlllIIIlIl[Util.llllIIIIIllII[1]];
            lllllllllllllIlIllllIlIlllIIIlll[Util.llllIIIIIllII[4]] = lllllllllllllIlIllllIlIlllIIIlIl[Util.llllIIIIIllII[3]];
            lllllllllllllIlIllllIlIlllIIIlll[Util.llllIIIIIllII[5]] = lllllllllllllIlIllllIlIlllIIIlIl[Util.llllIIIIIllII[5]];
            return new Transform(lllllllllllllIlIllllIlIlllIIIlll);
        }
        return new Transform();
    }
    
    private static String lIlIIllIlllIIlI(final String lllllllllllllIlIllllIlIlIlllllll, final String lllllllllllllIlIllllIlIlIlllllII) {
        try {
            final SecretKeySpec lllllllllllllIlIllllIlIllIIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllllIlIlIlllllII.getBytes(StandardCharsets.UTF_8)), Util.llllIIIIIllII[8]), "DES");
            final Cipher lllllllllllllIlIllllIlIllIIIIIIl = Cipher.getInstance("DES");
            lllllllllllllIlIllllIlIllIIIIIIl.init(Util.llllIIIIIllII[2], lllllllllllllIlIllllIlIllIIIIIlI);
            return new String(lllllllllllllIlIllllIlIllIIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllllIlIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllllIlIllIIIIIII) {
            lllllllllllllIlIllllIlIllIIIIIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIlllIIIIlII(final int lllllllllllllIlIllllIlIlIllIllII) {
        return lllllllllllllIlIllllIlIlIllIllII > 0;
    }
    
    private static void lIlIIlllIIIIIIl() {
        (llllIIIIIllII = new int[43])[0] = ((0x26 ^ 0x13) & ~(0xA3 ^ 0x96));
        Util.llllIIIIIllII[1] = " ".length();
        Util.llllIIIIIllII[2] = "  ".length();
        Util.llllIIIIIllII[3] = "   ".length();
        Util.llllIIIIIllII[4] = (0x45 ^ 0x41);
        Util.llllIIIIIllII[5] = (0x6F ^ 0x6A);
        Util.llllIIIIIllII[6] = (0x80 ^ 0x86);
        Util.llllIIIIIllII[7] = (100 + 90 - 94 + 77 ^ 60 + 40 + 56 + 14);
        Util.llllIIIIIllII[8] = (0x9A ^ 0x92);
        Util.llllIIIIIllII[9] = (0x4C ^ 0x62 ^ (0x54 ^ 0x73));
        Util.llllIIIIIllII[10] = (0xA3 ^ 0xA9);
        Util.llllIIIIIllII[11] = (0x55 ^ 0x5E);
        Util.llllIIIIIllII[12] = (0x8A ^ 0x86);
        Util.llllIIIIIllII[13] = (121 + 121 - 93 + 26 ^ 155 + 121 - 237 + 123);
        Util.llllIIIIIllII[14] = (0x68 ^ 0x66);
        Util.llllIIIIIllII[15] = (0x7B ^ 0xE ^ (0xD4 ^ 0xAE));
        Util.llllIIIIIllII[16] = (0x8E ^ 0x9E);
        Util.llllIIIIIllII[17] = (0xB1 ^ 0xA0);
        Util.llllIIIIIllII[18] = (0x1 ^ 0x13);
        Util.llllIIIIIllII[19] = (0x72 ^ 0x61);
        Util.llllIIIIIllII[20] = (0xAD ^ 0xB9);
        Util.llllIIIIIllII[21] = (0xB ^ 0x3E ^ (0x28 ^ 0x8));
        Util.llllIIIIIllII[22] = (0xF2 ^ 0x9F ^ (0xE7 ^ 0x9C));
        Util.llllIIIIIllII[23] = (0x7 ^ 0x6C ^ (0x49 ^ 0x35));
        Util.llllIIIIIllII[24] = (0x31 ^ 0x65 ^ (0xD ^ 0x41));
        Util.llllIIIIIllII[25] = (0xF9 ^ 0xC3);
        Util.llllIIIIIllII[26] = (0x10 ^ 0x9);
        Util.llllIIIIIllII[27] = (0x40 ^ 0x2B ^ (0x4C ^ 0x3D));
        Util.llllIIIIIllII[28] = (0xD8 ^ 0xC3);
        Util.llllIIIIIllII[29] = (0x8 ^ 0x14);
        Util.llllIIIIIllII[30] = (7 + 13 + 101 + 7 ^ 114 + 155 - 142 + 30);
        Util.llllIIIIIllII[31] = (0x77 ^ 0x69);
        Util.llllIIIIIllII[32] = (0x5F ^ 0x70 ^ (0x9E ^ 0xAE));
        Util.llllIIIIIllII[33] = (124 + 64 - 66 + 7 ^ 11 + 79 + 4 + 67);
        Util.llllIIIIIllII[34] = (38 + 153 - 114 + 90 ^ 18 + 38 - 34 + 112);
        Util.llllIIIIIllII[35] = (103 + 136 - 84 + 0 ^ 127 + 57 - 78 + 79);
        Util.llllIIIIIllII[36] = (0xE4 ^ 0xC7);
        Util.llllIIIIIllII[37] = (0xD1 ^ 0xA6 ^ (0x23 ^ 0x70));
        Util.llllIIIIIllII[38] = (0x96 ^ 0xB3);
        Util.llllIIIIIllII[39] = (0x59 ^ 0x3C ^ (0x3 ^ 0x40));
        Util.llllIIIIIllII[40] = (0xB6 ^ 0xC3 ^ (0x7E ^ 0x2C));
        Util.llllIIIIIllII[41] = (0x5 ^ 0x2D);
        Util.llllIIIIIllII[42] = (0xAB ^ 0xA1 ^ (0xAA ^ 0x89));
    }
    
    private static String lIlIIllIlllIIIl(String lllllllllllllIlIllllIlIllIIIllll, final String lllllllllllllIlIllllIlIllIIlIIll) {
        lllllllllllllIlIllllIlIllIIIllll = new String(Base64.getDecoder().decode(lllllllllllllIlIllllIlIllIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllllIlIllIIlIIlI = new StringBuilder();
        final char[] lllllllllllllIlIllllIlIllIIlIIIl = lllllllllllllIlIllllIlIllIIlIIll.toCharArray();
        int lllllllllllllIlIllllIlIllIIlIIII = Util.llllIIIIIllII[0];
        final float lllllllllllllIlIllllIlIllIIIlIlI = (Object)lllllllllllllIlIllllIlIllIIIllll.toCharArray();
        final float lllllllllllllIlIllllIlIllIIIlIIl = lllllllllllllIlIllllIlIllIIIlIlI.length;
        long lllllllllllllIlIllllIlIllIIIlIII = Util.llllIIIIIllII[0];
        while (lIlIIlllIIIIlll((int)lllllllllllllIlIllllIlIllIIIlIII, (int)lllllllllllllIlIllllIlIllIIIlIIl)) {
            final char lllllllllllllIlIllllIlIllIIlIlIl = lllllllllllllIlIllllIlIllIIIlIlI[lllllllllllllIlIllllIlIllIIIlIII];
            lllllllllllllIlIllllIlIllIIlIIlI.append((char)(lllllllllllllIlIllllIlIllIIlIlIl ^ lllllllllllllIlIllllIlIllIIlIIIl[lllllllllllllIlIllllIlIllIIlIIII % lllllllllllllIlIllllIlIllIIlIIIl.length]));
            "".length();
            ++lllllllllllllIlIllllIlIllIIlIIII;
            ++lllllllllllllIlIllllIlIllIIIlIII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllllIlIllIIlIIlI);
    }
    
    static String extractStyle(final String lllllllllllllIlIllllIlIlllIllIlI, final String lllllllllllllIlIllllIlIlllIlllII) {
        if (lIlIIlllIIIIlIl(lllllllllllllIlIllllIlIlllIllIlI)) {
            return Util.llllIIIIIlIlI[Util.llllIIIIIllII[23]];
        }
        final StringTokenizer lllllllllllllIlIllllIlIlllIllIll = new StringTokenizer(lllllllllllllIlIllllIlIlllIllIlI, Util.llllIIIIIlIlI[Util.llllIIIIIllII[24]]);
        while (lIlIIlllIIIIllI(lllllllllllllIlIllllIlIlllIllIll.hasMoreTokens() ? 1 : 0)) {
            final String lllllllllllllIlIllllIlIlllIlllll = lllllllllllllIlIllllIlIlllIllIll.nextToken();
            final String lllllllllllllIlIllllIlIlllIllllI = lllllllllllllIlIllllIlIlllIlllll.substring(Util.llllIIIIIllII[0], lllllllllllllIlIllllIlIlllIlllll.indexOf(Util.llllIIIIIllII[25]));
            if (lIlIIlllIIIIllI(lllllllllllllIlIllllIlIlllIllllI.equals(lllllllllllllIlIllllIlIlllIlllII) ? 1 : 0)) {
                return lllllllllllllIlIllllIlIlllIlllll.substring(lllllllllllllIlIllllIlIlllIlllll.indexOf(Util.llllIIIIIllII[25]) + Util.llllIIIIIllII[1]);
            }
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        return Util.llllIIIIIlIlI[Util.llllIIIIIllII[26]];
    }
    
    private static String lIlIIllIllIllII(final String lllllllllllllIlIllllIlIllIlIIIlI, final String lllllllllllllIlIllllIlIllIlIIIll) {
        try {
            final SecretKeySpec lllllllllllllIlIllllIlIllIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllllIlIllIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllllIlIllIlIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllllIlIllIlIIllI.init(Util.llllIIIIIllII[2], lllllllllllllIlIllllIlIllIlIIlll);
            return new String(lllllllllllllIlIllllIlIllIlIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllllIlIllIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllllIlIllIlIIlIl) {
            lllllllllllllIlIllllIlIllIlIIlIl.printStackTrace();
            return null;
        }
    }
    
    static NonGeometricData getNonGeometricData(final Element lllllllllllllIlIllllIlIllllllIIl) {
        final String lllllllllllllIlIllllIlIllllllIll = getMetaData(lllllllllllllIlIllllIlIllllllIIl);
        final NonGeometricData lllllllllllllIlIllllIlIllllllIlI = new InkscapeNonGeometricData(lllllllllllllIlIllllIlIllllllIll, lllllllllllllIlIllllIlIllllllIIl);
        lllllllllllllIlIllllIlIllllllIlI.addAttribute(Util.llllIIIIIlIlI[Util.llllIIIIIllII[0]], lllllllllllllIlIllllIlIllllllIIl.getAttribute(Util.llllIIIIIlIlI[Util.llllIIIIIllII[1]]));
        lllllllllllllIlIllllIlIllllllIlI.addAttribute(Util.llllIIIIIlIlI[Util.llllIIIIIllII[2]], getStyle(lllllllllllllIlIllllIlIllllllIIl, Util.llllIIIIIlIlI[Util.llllIIIIIllII[3]]));
        lllllllllllllIlIllllIlIllllllIlI.addAttribute(Util.llllIIIIIlIlI[Util.llllIIIIIllII[4]], getStyle(lllllllllllllIlIllllIlIllllllIIl, Util.llllIIIIIlIlI[Util.llllIIIIIllII[5]]));
        lllllllllllllIlIllllIlIllllllIlI.addAttribute(Util.llllIIIIIlIlI[Util.llllIIIIIllII[6]], getStyle(lllllllllllllIlIllllIlIllllllIIl, Util.llllIIIIIlIlI[Util.llllIIIIIllII[7]]));
        lllllllllllllIlIllllIlIllllllIlI.addAttribute(Util.llllIIIIIlIlI[Util.llllIIIIIllII[8]], getStyle(lllllllllllllIlIllllIlIllllllIIl, Util.llllIIIIIlIlI[Util.llllIIIIIllII[9]]));
        lllllllllllllIlIllllIlIllllllIlI.addAttribute(Util.llllIIIIIlIlI[Util.llllIIIIIllII[10]], getStyle(lllllllllllllIlIllllIlIllllllIIl, Util.llllIIIIIlIlI[Util.llllIIIIIllII[11]]));
        lllllllllllllIlIllllIlIllllllIlI.addAttribute(Util.llllIIIIIlIlI[Util.llllIIIIIllII[12]], getStyle(lllllllllllllIlIllllIlIllllllIIl, Util.llllIIIIIlIlI[Util.llllIIIIIllII[13]]));
        lllllllllllllIlIllllIlIllllllIlI.addAttribute(Util.llllIIIIIlIlI[Util.llllIIIIIllII[14]], getStyle(lllllllllllllIlIllllIlIllllllIIl, Util.llllIIIIIlIlI[Util.llllIIIIIllII[15]]));
        lllllllllllllIlIllllIlIllllllIlI.addAttribute(Util.llllIIIIIlIlI[Util.llllIIIIIllII[16]], getStyle(lllllllllllllIlIllllIlIllllllIIl, Util.llllIIIIIlIlI[Util.llllIIIIIllII[17]]));
        return lllllllllllllIlIllllIlIllllllIlI;
    }
    
    private static boolean lIlIIlllIIIIlll(final int lllllllllllllIlIllllIlIlIlllIlll, final int lllllllllllllIlIllllIlIlIlllIllI) {
        return lllllllllllllIlIllllIlIlIlllIlll < lllllllllllllIlIllllIlIlIlllIllI;
    }
    
    static String getMetaData(final Element lllllllllllllIlIllllIlIlllllIlII) {
        final String lllllllllllllIlIllllIlIlllllIIll = lllllllllllllIlIllllIlIlllllIlII.getAttributeNS(Util.llllIIIIIlIlI[Util.llllIIIIIllII[18]], Util.llllIIIIIlIlI[Util.llllIIIIIllII[19]]);
        if (lIlIIlllIIIIIlI(lllllllllllllIlIllllIlIlllllIIll) && lIlIIlllIIIIIll(lllllllllllllIlIllllIlIlllllIIll.equals(Util.llllIIIIIlIlI[Util.llllIIIIIllII[20]]) ? 1 : 0)) {
            return lllllllllllllIlIllllIlIlllllIIll;
        }
        return lllllllllllllIlIllllIlIlllllIlII.getAttribute(Util.llllIIIIIlIlI[Util.llllIIIIIllII[21]]);
    }
    
    private static boolean lIlIIlllIIIIIll(final int lllllllllllllIlIllllIlIlIllIlllI) {
        return lllllllllllllIlIllllIlIlIllIlllI == 0;
    }
    
    static float getFloatAttribute(final Element lllllllllllllIlIllllIlIllIllIIlI, final String lllllllllllllIlIllllIlIllIllIlII) throws ParsingException {
        String lllllllllllllIlIllllIlIllIllIIll = lllllllllllllIlIllllIlIllIllIIlI.getAttribute(lllllllllllllIlIllllIlIllIllIlII);
        if (!lIlIIlllIIIIIlI(lllllllllllllIlIllllIlIllIllIIll) || lIlIIlllIIIIllI(lllllllllllllIlIllllIlIllIllIIll.equals(Util.llllIIIIIlIlI[Util.llllIIIIIllII[35]]) ? 1 : 0)) {
            lllllllllllllIlIllllIlIllIllIIll = lllllllllllllIlIllllIlIllIllIIlI.getAttributeNS(Util.llllIIIIIlIlI[Util.llllIIIIIllII[36]], lllllllllllllIlIllllIlIllIllIlII);
        }
        try {
            return Float.parseFloat(lllllllllllllIlIllllIlIllIllIIll);
        }
        catch (NumberFormatException lllllllllllllIlIllllIlIllIllIllI) {
            throw new ParsingException(lllllllllllllIlIllllIlIllIllIIlI, String.valueOf(new StringBuilder().append(Util.llllIIIIIlIlI[Util.llllIIIIIllII[37]]).append(lllllllllllllIlIllllIlIllIllIlII)), lllllllllllllIlIllllIlIllIllIllI);
        }
    }
}
