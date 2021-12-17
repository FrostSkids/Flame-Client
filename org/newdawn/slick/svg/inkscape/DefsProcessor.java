// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.svg.inkscape;

import org.newdawn.slick.svg.ParsingException;
import org.w3c.dom.NodeList;
import org.newdawn.slick.Color;
import org.newdawn.slick.svg.Gradient;
import java.util.ArrayList;
import org.newdawn.slick.util.Log;
import org.newdawn.slick.geom.Transform;
import org.newdawn.slick.svg.Diagram;
import org.newdawn.slick.svg.Loader;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import org.w3c.dom.Element;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class DefsProcessor implements ElementProcessor
{
    private static final /* synthetic */ String[] lllIIlllIlIllI;
    private static final /* synthetic */ int[] lllIIllllIIIlI;
    
    static {
        lIlIIIIIllIIllIl();
        lIlIIIIIllIIlIII();
    }
    
    private static boolean lIlIIIIIllIlIIIl(final int llllllllllllIlIlllIllIIlIlIIllII) {
        return llllllllllllIlIlllIllIIlIlIIllII > 0;
    }
    
    private static void lIlIIIIIllIIllIl() {
        (lllIIllllIIIlI = new int[48])[0] = ((0x34 ^ 0x16) & ~(0xB6 ^ 0x94));
        DefsProcessor.lllIIllllIIIlI[1] = " ".length();
        DefsProcessor.lllIIllllIIIlI[2] = "  ".length();
        DefsProcessor.lllIIllllIIIlI[3] = "   ".length();
        DefsProcessor.lllIIllllIIIlI[4] = (0x37 ^ 0x33);
        DefsProcessor.lllIIllllIIIlI[5] = (143 + 101 - 194 + 143 ^ 56 + 36 + 23 + 81);
        DefsProcessor.lllIIllllIIIlI[6] = (0x1C ^ 0x36 ^ (0x43 ^ 0x6F));
        DefsProcessor.lllIIllllIIIlI[7] = (0x8A ^ 0x8D);
        DefsProcessor.lllIIllllIIIlI[8] = (0x8B ^ 0x83);
        DefsProcessor.lllIIllllIIIlI[9] = (0x1F ^ 0x16);
        DefsProcessor.lllIIllllIIIlI[10] = (0x97 ^ 0x9D);
        DefsProcessor.lllIIllllIIIlI[11] = (0x46 ^ 0x4D);
        DefsProcessor.lllIIllllIIIlI[12] = (0x65 ^ 0x61 ^ (0x54 ^ 0x5C));
        DefsProcessor.lllIIllllIIIlI[13] = (" ".length() ^ (0xBD ^ 0xB1));
        DefsProcessor.lllIIllllIIIlI[14] = (0xBF ^ 0xB1);
        DefsProcessor.lllIIllllIIIlI[15] = (0x25 ^ 0x70 ^ (0x1F ^ 0x45));
        DefsProcessor.lllIIllllIIIlI[16] = (0xA4 ^ 0xB4);
        DefsProcessor.lllIIllllIIIlI[17] = (0x28 ^ 0x39);
        DefsProcessor.lllIIllllIIIlI[18] = (0x29 ^ 0x3B);
        DefsProcessor.lllIIllllIIIlI[19] = (0x8 ^ 0x1B);
        DefsProcessor.lllIIllllIIIlI[20] = (0x43 ^ 0x57);
        DefsProcessor.lllIIllllIIIlI[21] = (" ".length() ^ (0x75 ^ 0x61));
        DefsProcessor.lllIIllllIIIlI[22] = (0x50 ^ 0x46);
        DefsProcessor.lllIIllllIIIlI[23] = (68 + 106 - 28 + 10 ^ 87 + 103 - 69 + 18);
        DefsProcessor.lllIIllllIIIlI[24] = (0x48 ^ 0x50);
        DefsProcessor.lllIIllllIIIlI[25] = (0x1D ^ 0x4);
        DefsProcessor.lllIIllllIIIlI[26] = (12 + 80 - 44 + 98 ^ 119 + 97 - 158 + 78);
        DefsProcessor.lllIIllllIIIlI[27] = (86 + 107 - 133 + 70 ^ 133 + 18 - 122 + 124);
        DefsProcessor.lllIIllllIIIlI[28] = (0x23 ^ 0x4F ^ (0xFF ^ 0x8F));
        DefsProcessor.lllIIllllIIIlI[29] = (0x60 ^ 0x7D);
        DefsProcessor.lllIIllllIIIlI[30] = (0x9F ^ 0x81);
        DefsProcessor.lllIIllllIIIlI[31] = (0x39 ^ 0x26);
        DefsProcessor.lllIIllllIIIlI[32] = (0x0 ^ 0x20);
        DefsProcessor.lllIIllllIIIlI[33] = (0x22 ^ 0x3);
        DefsProcessor.lllIIllllIIIlI[34] = (0x77 ^ 0x55);
        DefsProcessor.lllIIllllIIIlI[35] = (0x6B ^ 0x48);
        DefsProcessor.lllIIllllIIIlI[36] = (0x4B ^ 0xB ^ (0x7A ^ 0x1E));
        DefsProcessor.lllIIllllIIIlI[37] = (0xBE ^ 0x9B);
        DefsProcessor.lllIIllllIIIlI[38] = (144 + 133 - 243 + 119 ^ 41 + 132 - 85 + 103);
        DefsProcessor.lllIIllllIIIlI[39] = (42 + 27 - 43 + 138 ^ 88 + 77 - 101 + 67);
        DefsProcessor.lllIIllllIIIlI[40] = (0x4A ^ 0x15 ^ (0xE0 ^ 0x97));
        DefsProcessor.lllIIllllIIIlI[41] = (0x31 ^ 0x18);
        DefsProcessor.lllIIllllIIIlI[42] = (0x47 ^ 0x6D);
        DefsProcessor.lllIIllllIIIlI[43] = (9 + 106 - 38 + 62 ^ 136 + 44 - 165 + 145);
        DefsProcessor.lllIIllllIIIlI[44] = (0x54 ^ 0x6D ^ (0x30 ^ 0x25));
        DefsProcessor.lllIIllllIIIlI[45] = (101 + 90 - 63 + 62 ^ 84 + 31 - 47 + 79);
        DefsProcessor.lllIIllllIIIlI[46] = (0x5D ^ 0x73);
        DefsProcessor.lllIIllllIIIlI[47] = (0x3 ^ 0x72 ^ (0x54 ^ 0xA));
    }
    
    private static void lIlIIIIIllIIlIII() {
        (lllIIlllIlIllI = new String[DefsProcessor.lllIIllllIIIlI[47]])[DefsProcessor.lllIIllllIIIlI[0]] = lIlIIIIIllIIIIlI("HZbjlkKpI2c=", "jWHpK");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[1]] = lIlIIIIIllIIIIlI("X8zQOp7XgoU=", "XTAYA");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[2]] = lIlIIIIIllIIIIll("DSEVMR0=", "dLtVx");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[3]] = lIlIIIIIllIIIlII("xiArpgt1dMRZLqchijm1nTgvUQPWV3noyIyErFJ3kyuPglKPLXH8qTtjcvxEgZy4w7RuazO9DTHRbg/2D23xFMPWbPQ0CNQ57pwdhGHlkAI=", "EGHKv");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[4]] = lIlIIIIIllIIIIll("ODI=", "QVhuc");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[5]] = lIlIIIIIllIIIlII("aYVkae0M9PW57I1rrKQYpLTEmNCvrFW5RRMTteox3TE=", "Hsmkb");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[6]] = lIlIIIIIllIIIIlI("cJaFIhATL80=", "XfpxW");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[7]] = lIlIIIIIllIIIlII("iw+bUtPGVuSgAjjwAEAeXQ==", "ZUNYv");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[8]] = lIlIIIIIllIIIIll("LiE=", "GEIqs");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[9]] = lIlIIIIIllIIIIlI("Y7hr8M7nbkfUradSmoL1eYhZED6O0BvQ", "UbOJv");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[10]] = lIlIIIIIllIIIlII("1GHs2CYZfQI=", "esgHV");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[11]] = lIlIIIIIllIIIIll("C2M=", "sRAtU");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[12]] = lIlIIIIIllIIIlII("jjdWdnEOc1s=", "vTTqI");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[13]] = lIlIIIIIllIIIlII("5NSWuXLHeh0=", "ujWDF");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[14]] = lIlIIIIIllIIIIll("EmU=", "kTrjl");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[15]] = lIlIIIIIllIIIIll("D3g=", "vIvBP");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[16]] = lIlIIIIIllIIIIll("NnE=", "OCEuy");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[17]] = lIlIIIIIllIIIlII("18D9I3mGecg=", "OTbTO");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[18]] = lIlIIIIIllIIIIll("Aj4/AE5FZTwHA0Q9eF4bGC1kQU1Tc2QIGAMkIA==", "jJKpt");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[19]] = lIlIIIIIllIIIlII("a+EP+OiGKI4=", "aBdtQ");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[20]] = lIlIIIIIllIIIlII("V5Eg5B3A4Q4=", "wLZIe");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[21]] = lIlIIIIIllIIIlII("18k70Vqv8KI=", "VgapV");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[22]] = lIlIIIIIllIIIlII("sWz+A1984MU=", "pTTii");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[23]] = lIlIIIIIllIIIIlI("YNrhEK5MO+AMa+bw4DdrHA==", "aVqnN");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[24]] = lIlIIIIIllIIIlII("9nwzUVxqByw=", "wvvPq");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[25]] = lIlIIIIIllIIIIlI("cGdcrBLXwp+BXYRi1pXPGg==", "MAmFp");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[26]] = lIlIIIIIllIIIlII("6X3+geM9H7MQaow7ArN5zw==", "dupbg");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[27]] = lIlIIIIIllIIIIll("PwA=", "VdhtL");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[28]] = lIlIIIIIllIIIlII("cG9YSHEiAx7fEtJHrojRoMhrjspSSSHy", "ZJlbW");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[29]] = lIlIIIIIllIIIIlI("V7bvR1VHV9A=", "bMJTr");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[30]] = lIlIIIIIllIIIIll("BQ0=", "fupFl");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[31]] = lIlIIIIIllIIIIll("Lio=", "MShQY");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[32]] = lIlIIIIIllIIIIlI("Nr3Zb2Rd/i4=", "yGgMD");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[33]] = lIlIIIIIllIIIlII("ovSusO7lxQE=", "jfOiP");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[34]] = lIlIIIIIllIIIlII("Q6LR+h47BqY=", "fYDWZ");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[35]] = lIlIIIIIllIIIIlI("e10pj/kakBo=", "odZqI");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[36]] = lIlIIIIIllIIIIll("PwE=", "YxPoY");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[37]] = lIlIIIIIllIIIlII("m0JH252mGFQ=", "BzZDq");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[38]] = lIlIIIIIllIIIIlI("a/EDEGLnZp0=", "uecOf");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[39]] = lIlIIIIIllIIIlII("RGHx3SZ0X1c1/qeuYJLX+bRgvUaz8pKNJyeuBQSOvP8=", "wHhqT");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[40]] = lIlIIIIIllIIIIlI("W1orNB9XUtw=", "tOqsA");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[41]] = lIlIIIIIllIIIIll("JDo+Gw==", "WNQkO");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[42]] = lIlIIIIIllIIIIlI("EtWkVceEAIo=", "Ocswy");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[43]] = lIlIIIIIllIIIIlI("wFUlIzkSMxA=", "ZgFNa");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[44]] = lIlIIIIIllIIIIll("HyM7JUoPODg6FQ==", "lWTUg");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[45]] = lIlIIIIIllIIIlII("Gxxm1BbktUE=", "VWgAS");
        DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[46]] = lIlIIIIIllIIIIlI("Dw1CGiRP/Gpp/w5AQ1K5GA==", "WpaHD");
    }
    
    private static boolean lIlIIIIIllIlIIII(final int llllllllllllIlIlllIllIIlIlIIlllI) {
        return llllllllllllIlIlllIllIIlIlIIlllI == 0;
    }
    
    private static boolean lIlIIIIIllIIllll(final int llllllllllllIlIlllIllIIlIlIlIlIl, final int llllllllllllIlIlllIllIIlIlIlIlII) {
        return llllllllllllIlIlllIllIIlIlIlIlIl < llllllllllllIlIlllIllIIlIlIlIlII;
    }
    
    private static String lIlIIIIIllIIIIll(String llllllllllllIlIlllIllIIlIllIllIl, final String llllllllllllIlIlllIllIIlIlllIIIl) {
        llllllllllllIlIlllIllIIlIllIllIl = new String(Base64.getDecoder().decode(llllllllllllIlIlllIllIIlIllIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllIllIIlIlllIIII = new StringBuilder();
        final char[] llllllllllllIlIlllIllIIlIllIllll = llllllllllllIlIlllIllIIlIlllIIIl.toCharArray();
        int llllllllllllIlIlllIllIIlIllIlllI = DefsProcessor.lllIIllllIIIlI[0];
        final float llllllllllllIlIlllIllIIlIllIlIII = (Object)llllllllllllIlIlllIllIIlIllIllIl.toCharArray();
        final byte llllllllllllIlIlllIllIIlIllIIlll = (byte)llllllllllllIlIlllIllIIlIllIlIII.length;
        long llllllllllllIlIlllIllIIlIllIIllI = DefsProcessor.lllIIllllIIIlI[0];
        while (lIlIIIIIllIIllll((int)llllllllllllIlIlllIllIIlIllIIllI, llllllllllllIlIlllIllIIlIllIIlll)) {
            final char llllllllllllIlIlllIllIIlIlllIIll = llllllllllllIlIlllIllIIlIllIlIII[llllllllllllIlIlllIllIIlIllIIllI];
            llllllllllllIlIlllIllIIlIlllIIII.append((char)(llllllllllllIlIlllIllIIlIlllIIll ^ llllllllllllIlIlllIllIIlIllIllll[llllllllllllIlIlllIllIIlIllIlllI % llllllllllllIlIlllIllIIlIllIllll.length]));
            "".length();
            ++llllllllllllIlIlllIllIIlIllIlllI;
            ++llllllllllllIlIlllIllIIlIllIIllI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllIllIIlIlllIIII);
    }
    
    private int stringLength(final String llllllllllllIlIlllIllIIllIIIlIlI) {
        if (lIlIIIIIllIlIIlI(llllllllllllIlIlllIllIIllIIIlIlI)) {
            return DefsProcessor.lllIIllllIIIlI[0];
        }
        return llllllllllllIlIlllIllIIllIIIlIlI.length();
    }
    
    public boolean handles(final Element llllllllllllIlIlllIllIIllllIIIII) {
        if (lIlIIIIIllIIlllI(llllllllllllIlIlllIllIIllllIIIII.getNodeName().equals(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[0]]) ? 1 : 0)) {
            return DefsProcessor.lllIIllllIIIlI[1] != 0;
        }
        return DefsProcessor.lllIIllllIIIlI[0] != 0;
    }
    
    private static String lIlIIIIIllIIIIlI(final String llllllllllllIlIlllIllIIllIIIIIlI, final String llllllllllllIlIlllIllIIlIlllllll) {
        try {
            final SecretKeySpec llllllllllllIlIlllIllIIllIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIllIIlIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllIllIIllIIIIlII = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllIllIIllIIIIlII.init(DefsProcessor.lllIIllllIIIlI[2], llllllllllllIlIlllIllIIllIIIIlIl);
            return new String(llllllllllllIlIlllIllIIllIIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIllIIllIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIllIIllIIIIIll) {
            llllllllllllIlIlllIllIIllIIIIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIIIIllIIlllI(final int llllllllllllIlIlllIllIIlIlIlIIII) {
        return llllllllllllIlIlllIllIIlIlIlIIII != 0;
    }
    
    private static String lIlIIIIIllIIIlII(final String llllllllllllIlIlllIllIIlIlIllIll, final String llllllllllllIlIlllIllIIlIlIlllII) {
        try {
            final SecretKeySpec llllllllllllIlIlllIllIIlIllIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIllIIlIlIlllII.getBytes(StandardCharsets.UTF_8)), DefsProcessor.lllIIllllIIIlI[8]), "DES");
            final Cipher llllllllllllIlIlllIllIIlIlIlllll = Cipher.getInstance("DES");
            llllllllllllIlIlllIllIIlIlIlllll.init(DefsProcessor.lllIIllllIIIlI[2], llllllllllllIlIlllIllIIlIllIIIII);
            return new String(llllllllllllIlIlllIllIIlIlIlllll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIllIIlIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIllIIlIlIllllI) {
            llllllllllllIlIlllIllIIlIlIllllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIIIIllIlIIlI(final Object llllllllllllIlIlllIllIIlIlIlIIlI) {
        return llllllllllllIlIlllIllIIlIlIlIIlI == null;
    }
    
    public void process(final Loader llllllllllllIlIlllIllIIllIlIlIIl, final Element llllllllllllIlIlllIllIIllIlIlIII, final Diagram llllllllllllIlIlllIllIIllIIlllll, final Transform llllllllllllIlIlllIllIIllIlIIllI) throws ParsingException {
        final NodeList llllllllllllIlIlllIllIIllIlIIlIl = llllllllllllIlIlllIllIIllIlIlIII.getElementsByTagName(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[1]]);
        int llllllllllllIlIlllIllIIlllIIIllI = DefsProcessor.lllIIllllIIIlI[0];
        while (lIlIIIIIllIIllll(llllllllllllIlIlllIllIIlllIIIllI, llllllllllllIlIlllIllIIllIlIIlIl.getLength())) {
            final Element llllllllllllIlIlllIllIIlllIIlIll = (Element)llllllllllllIlIlllIllIIllIlIIlIl.item(llllllllllllIlIlllIllIIlllIIIllI);
            final NodeList llllllllllllIlIlllIllIIlllIIlIlI = llllllllllllIlIlllIllIIlllIIlIll.getElementsByTagName(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[2]]);
            if (lIlIIIIIllIlIIII(llllllllllllIlIlllIllIIlllIIlIlI.getLength())) {
                Log.warn(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[3]]);
                "".length();
                if ("   ".length() != "   ".length()) {
                    return;
                }
            }
            else {
                final Element llllllllllllIlIlllIllIIlllIIlIIl = (Element)llllllllllllIlIlllIllIIlllIIlIlI.item(DefsProcessor.lllIIllllIIIlI[0]);
                final String llllllllllllIlIlllIllIIlllIIlIII = llllllllllllIlIlllIllIIlllIIlIll.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[4]]);
                final String llllllllllllIlIlllIllIIlllIIIlll = llllllllllllIlIlllIllIIlllIIlIIl.getAttributeNS(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[5]], DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[6]]);
                llllllllllllIlIlllIllIIllIIlllll.addPatternDef(llllllllllllIlIlllIllIIlllIIlIII, llllllllllllIlIlllIllIIlllIIIlll);
            }
            ++llllllllllllIlIlllIllIIlllIIIllI;
            "".length();
            if (-" ".length() == " ".length()) {
                return;
            }
        }
        final NodeList llllllllllllIlIlllIllIIllIlIIlII = llllllllllllIlIlllIllIIllIlIlIII.getElementsByTagName(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[7]]);
        final ArrayList llllllllllllIlIlllIllIIllIlIIIll = new ArrayList();
        int llllllllllllIlIlllIllIIllIlllIIl = DefsProcessor.lllIIllllIIIlI[0];
        while (lIlIIIIIllIIllll(llllllllllllIlIlllIllIIllIlllIIl, llllllllllllIlIlllIllIIllIlIIlII.getLength())) {
            final Element llllllllllllIlIlllIllIIllIllllIl = (Element)llllllllllllIlIlllIllIIllIlIIlII.item(llllllllllllIlIlllIllIIllIlllIIl);
            final String llllllllllllIlIlllIllIIllIllllII = llllllllllllIlIlllIllIIllIllllIl.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[8]]);
            final Gradient llllllllllllIlIlllIllIIllIlllIll = new Gradient(llllllllllllIlIlllIllIIllIllllII, (boolean)(DefsProcessor.lllIIllllIIIlI[0] != 0));
            llllllllllllIlIlllIllIIllIlllIll.setTransform(Util.getTransform(llllllllllllIlIlllIllIIllIllllIl, DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[9]]));
            if (lIlIIIIIllIlIIIl(this.stringLength(llllllllllllIlIlllIllIIllIllllIl.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[10]])))) {
                llllllllllllIlIlllIllIIllIlllIll.setX1(Float.parseFloat(llllllllllllIlIlllIllIIllIllllIl.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[11]])));
            }
            if (lIlIIIIIllIlIIIl(this.stringLength(llllllllllllIlIlllIllIIllIllllIl.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[12]])))) {
                llllllllllllIlIlllIllIIllIlllIll.setX2(Float.parseFloat(llllllllllllIlIlllIllIIllIllllIl.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[13]])));
            }
            if (lIlIIIIIllIlIIIl(this.stringLength(llllllllllllIlIlllIllIIllIllllIl.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[14]])))) {
                llllllllllllIlIlllIllIIllIlllIll.setY1(Float.parseFloat(llllllllllllIlIlllIllIIllIllllIl.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[15]])));
            }
            if (lIlIIIIIllIlIIIl(this.stringLength(llllllllllllIlIlllIllIIllIllllIl.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[16]])))) {
                llllllllllllIlIlllIllIIllIlllIll.setY2(Float.parseFloat(llllllllllllIlIlllIllIIllIllllIl.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[17]])));
            }
            final String llllllllllllIlIlllIllIIllIlllIlI = llllllllllllIlIlllIllIIllIllllIl.getAttributeNS(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[18]], DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[19]]);
            if (lIlIIIIIllIlIIIl(this.stringLength(llllllllllllIlIlllIllIIllIlllIlI))) {
                llllllllllllIlIlllIllIIllIlllIll.reference(llllllllllllIlIlllIllIIllIlllIlI.substring(DefsProcessor.lllIIllllIIIlI[1]));
                llllllllllllIlIlllIllIIllIlIIIll.add(llllllllllllIlIlllIllIIllIlllIll);
                "".length();
                "".length();
                if (((0x39 ^ 0x30) & ~(0x87 ^ 0x8E)) == (0x1F ^ 0x1B)) {
                    return;
                }
            }
            else {
                final NodeList llllllllllllIlIlllIllIIllIlllllI = llllllllllllIlIlllIllIIllIllllIl.getElementsByTagName(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[20]]);
                int llllllllllllIlIlllIllIIllIllllll = DefsProcessor.lllIIllllIIIlI[0];
                while (lIlIIIIIllIIllll(llllllllllllIlIlllIllIIllIllllll, llllllllllllIlIlllIllIIllIlllllI.getLength())) {
                    final Element llllllllllllIlIlllIllIIlllIIIlIl = (Element)llllllllllllIlIlllIllIIllIlllllI.item(llllllllllllIlIlllIllIIllIllllll);
                    final float llllllllllllIlIlllIllIIlllIIIlII = Float.parseFloat(llllllllllllIlIlllIllIIlllIIIlIl.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[21]]));
                    final String llllllllllllIlIlllIllIIlllIIIIll = Util.extractStyle(llllllllllllIlIlllIllIIlllIIIlIl.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[22]]), DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[23]]);
                    final String llllllllllllIlIlllIllIIlllIIIIlI = Util.extractStyle(llllllllllllIlIlllIllIIlllIIIlIl.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[24]]), DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[25]]);
                    final int llllllllllllIlIlllIllIIlllIIIIIl = Integer.parseInt(llllllllllllIlIlllIllIIlllIIIIll.substring(DefsProcessor.lllIIllllIIIlI[1]), DefsProcessor.lllIIllllIIIlI[16]);
                    final Color llllllllllllIlIlllIllIIlllIIIIII = new Color(llllllllllllIlIlllIllIIlllIIIIIl);
                    llllllllllllIlIlllIllIIlllIIIIII.a = Float.parseFloat(llllllllllllIlIlllIllIIlllIIIIlI);
                    llllllllllllIlIlllIllIIllIlllIll.addStep(llllllllllllIlIlllIllIIlllIIIlII, llllllllllllIlIlllIllIIlllIIIIII);
                    ++llllllllllllIlIlllIllIIllIllllll;
                    "".length();
                    if (((0x40 ^ 0x22 ^ (0x69 ^ 0x43)) & (30 + 175 + 14 + 3 ^ 46 + 118 - 119 + 105 ^ -" ".length())) < -" ".length()) {
                        return;
                    }
                }
                llllllllllllIlIlllIllIIllIlllIll.getImage();
                "".length();
            }
            llllllllllllIlIlllIllIIllIIlllll.addGradient(llllllllllllIlIlllIllIIllIllllII, llllllllllllIlIlllIllIIllIlllIll);
            ++llllllllllllIlIlllIllIIllIlllIIl;
            "".length();
            if (null != null) {
                return;
            }
        }
        final NodeList llllllllllllIlIlllIllIIllIlIIIlI = llllllllllllIlIlllIllIIllIlIlIII.getElementsByTagName(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[26]]);
        int llllllllllllIlIlllIllIIllIlIllII = DefsProcessor.lllIIllllIIIlI[0];
        while (lIlIIIIIllIIllll(llllllllllllIlIlllIllIIllIlIllII, llllllllllllIlIlllIllIIllIlIIIlI.getLength())) {
            final Element llllllllllllIlIlllIllIIllIllIIII = (Element)llllllllllllIlIlllIllIIllIlIIIlI.item(llllllllllllIlIlllIllIIllIlIllII);
            final String llllllllllllIlIlllIllIIllIlIllll = llllllllllllIlIlllIllIIllIllIIII.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[27]]);
            final Gradient llllllllllllIlIlllIllIIllIlIlllI = new Gradient(llllllllllllIlIlllIllIIllIlIllll, (boolean)(DefsProcessor.lllIIllllIIIlI[1] != 0));
            llllllllllllIlIlllIllIIllIlIlllI.setTransform(Util.getTransform(llllllllllllIlIlllIllIIllIllIIII, DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[28]]));
            if (lIlIIIIIllIlIIIl(this.stringLength(llllllllllllIlIlllIllIIllIllIIII.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[29]])))) {
                llllllllllllIlIlllIllIIllIlIlllI.setX1(Float.parseFloat(llllllllllllIlIlllIllIIllIllIIII.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[30]])));
            }
            if (lIlIIIIIllIlIIIl(this.stringLength(llllllllllllIlIlllIllIIllIllIIII.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[31]])))) {
                llllllllllllIlIlllIllIIllIlIlllI.setY1(Float.parseFloat(llllllllllllIlIlllIllIIllIllIIII.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[32]])));
            }
            if (lIlIIIIIllIlIIIl(this.stringLength(llllllllllllIlIlllIllIIllIllIIII.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[33]])))) {
                llllllllllllIlIlllIllIIllIlIlllI.setX2(Float.parseFloat(llllllllllllIlIlllIllIIllIllIIII.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[34]])));
            }
            if (lIlIIIIIllIlIIIl(this.stringLength(llllllllllllIlIlllIllIIllIllIIII.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[35]])))) {
                llllllllllllIlIlllIllIIllIlIlllI.setY2(Float.parseFloat(llllllllllllIlIlllIllIIllIllIIII.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[36]])));
            }
            if (lIlIIIIIllIlIIIl(this.stringLength(llllllllllllIlIlllIllIIllIllIIII.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[37]])))) {
                llllllllllllIlIlllIllIIllIlIlllI.setR(Float.parseFloat(llllllllllllIlIlllIllIIllIllIIII.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[38]])));
            }
            final String llllllllllllIlIlllIllIIllIlIllIl = llllllllllllIlIlllIllIIllIllIIII.getAttributeNS(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[39]], DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[40]]);
            if (lIlIIIIIllIlIIIl(this.stringLength(llllllllllllIlIlllIllIIllIlIllIl))) {
                llllllllllllIlIlllIllIIllIlIlllI.reference(llllllllllllIlIlllIllIIllIlIllIl.substring(DefsProcessor.lllIIllllIIIlI[1]));
                llllllllllllIlIlllIllIIllIlIIIll.add(llllllllllllIlIlllIllIIllIlIlllI);
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                final NodeList llllllllllllIlIlllIllIIllIllIIIl = llllllllllllIlIlllIllIIllIllIIII.getElementsByTagName(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[41]]);
                int llllllllllllIlIlllIllIIllIllIIlI = DefsProcessor.lllIIllllIIIlI[0];
                while (lIlIIIIIllIIllll(llllllllllllIlIlllIllIIllIllIIlI, llllllllllllIlIlllIllIIllIllIIIl.getLength())) {
                    final Element llllllllllllIlIlllIllIIllIlllIII = (Element)llllllllllllIlIlllIllIIllIllIIIl.item(llllllllllllIlIlllIllIIllIllIIlI);
                    final float llllllllllllIlIlllIllIIllIllIlll = Float.parseFloat(llllllllllllIlIlllIllIIllIlllIII.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[42]]));
                    final String llllllllllllIlIlllIllIIllIllIllI = Util.extractStyle(llllllllllllIlIlllIllIIllIlllIII.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[43]]), DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[44]]);
                    final String llllllllllllIlIlllIllIIllIllIlIl = Util.extractStyle(llllllllllllIlIlllIllIIllIlllIII.getAttribute(DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[45]]), DefsProcessor.lllIIlllIlIllI[DefsProcessor.lllIIllllIIIlI[46]]);
                    final int llllllllllllIlIlllIllIIllIllIlII = Integer.parseInt(llllllllllllIlIlllIllIIllIllIllI.substring(DefsProcessor.lllIIllllIIIlI[1]), DefsProcessor.lllIIllllIIIlI[16]);
                    final Color llllllllllllIlIlllIllIIllIllIIll = new Color(llllllllllllIlIlllIllIIllIllIlII);
                    llllllllllllIlIlllIllIIllIllIIll.a = Float.parseFloat(llllllllllllIlIlllIllIIllIllIlIl);
                    llllllllllllIlIlllIllIIllIlIlllI.addStep(llllllllllllIlIlllIllIIllIllIlll, llllllllllllIlIlllIllIIllIllIIll);
                    ++llllllllllllIlIlllIllIIllIllIIlI;
                    "".length();
                    if (-" ".length() >= 0) {
                        return;
                    }
                }
                llllllllllllIlIlllIllIIllIlIlllI.getImage();
                "".length();
            }
            llllllllllllIlIlllIllIIllIIlllll.addGradient(llllllllllllIlIlllIllIIllIlIllll, llllllllllllIlIlllIllIIllIlIlllI);
            ++llllllllllllIlIlllIllIIllIlIllII;
            "".length();
            if (null != null) {
                return;
            }
        }
        int llllllllllllIlIlllIllIIllIlIlIll = DefsProcessor.lllIIllllIIIlI[0];
        while (lIlIIIIIllIIllll(llllllllllllIlIlllIllIIllIlIlIll, llllllllllllIlIlllIllIIllIlIIIll.size())) {
            llllllllllllIlIlllIllIIllIlIIIll.get(llllllllllllIlIlllIllIIllIlIlIll).resolve(llllllllllllIlIlllIllIIllIIlllll);
            llllllllllllIlIlllIllIIllIlIIIll.get(llllllllllllIlIlllIllIIllIlIlIll).getImage();
            "".length();
            ++llllllllllllIlIlllIllIIllIlIlIll;
            "".length();
            if ("  ".length() <= -" ".length()) {
                return;
            }
        }
    }
}
