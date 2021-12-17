// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.svg;

import org.newdawn.slick.Color;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Properties;

public class NonGeometricData
{
    private static final /* synthetic */ String[] lllIIIllIIIIll;
    private static final /* synthetic */ int[] lllIIIllIIIllI;
    private /* synthetic */ String metaData;
    private /* synthetic */ Properties props;
    
    private static boolean lIIlllIlllIllllI(final int llllllllllllIllIIIIIIIIlIIIlIllI, final int llllllllllllIllIIIIIIIIlIIIlIlIl) {
        return llllllllllllIllIIIIIIIIlIIIlIllI < llllllllllllIllIIIIIIIIlIIIlIlIl;
    }
    
    public String getAsReference(final String llllllllllllIllIIIIIIIIlIllIIIIl) {
        String llllllllllllIllIIIIIIIIlIllIIIII = this.getAttribute(llllllllllllIllIIIIIIIIlIllIIIIl);
        if (lIIlllIlllIllllI(llllllllllllIllIIIIIIIIlIllIIIII.length(), NonGeometricData.lllIIIllIIIllI[7])) {
            return NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[27]];
        }
        llllllllllllIllIIIIIIIIlIllIIIII = llllllllllllIllIIIIIIIIlIllIIIII.substring(NonGeometricData.lllIIIllIIIllI[5], llllllllllllIllIIIIIIIIlIllIIIII.length() - NonGeometricData.lllIIIllIIIllI[1]);
        return llllllllllllIllIIIIIIIIlIllIIIII;
    }
    
    private static boolean lIIlllIllllIIIII(final int llllllllllllIllIIIIIIIIlIIIIllIl) {
        return llllllllllllIllIIIIIIIIlIIIIllIl > 0;
    }
    
    private static boolean lIIlllIlllIllIll(final int llllllllllllIllIIIIIIIIlIIIlIIIl) {
        return llllllllllllIllIIIIIIIIlIIIlIIIl != 0;
    }
    
    static {
        lIIlllIlllIllIlI();
        lIIlllIlllIllIIl();
        STROKE_MITERLIMIT = NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[33]];
        STROKE_OPACITY = NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[34]];
        ID = NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[35]];
        NONE = NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[36]];
        FILL = NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[37]];
        OPACITY = NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[38]];
        STROKE_DASHARRAY = NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[39]];
        STROKE = NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[40]];
        STROKE_WIDTH = NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[41]];
        STROKE_DASHOFFSET = NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[42]];
    }
    
    private static String lIIlllIlllIIlIlI(final String llllllllllllIllIIIIIIIIlIlIIIIIl, final String llllllllllllIllIIIIIIIIlIlIIIIII) {
        try {
            final SecretKeySpec llllllllllllIllIIIIIIIIlIlIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIIIIlIlIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIIIIIIlIlIIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIIIIIIlIlIIIlIl.init(NonGeometricData.lllIIIllIIIllI[2], llllllllllllIllIIIIIIIIlIlIIIllI);
            return new String(llllllllllllIllIIIIIIIIlIlIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIIIIlIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIIIIIlIlIIIlII) {
            llllllllllllIllIIIIIIIIlIlIIIlII.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlllIlllIllIIl() {
        (lllIIIllIIIIll = new String[NonGeometricData.lllIIIllIIIllI[43]])[NonGeometricData.lllIIIllIIIllI[0]] = lIIlllIlllIIlIII("Isurucii1Wc=", "hfapL");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[1]] = lIIlllIlllIIlIIl("FQEUIRkDWBEnFhId", "fufNr");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[2]] = lIIlllIlllIIlIIl("Ww==", "jDcTc");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[3]] = lIIlllIlllIIlIlI("Bl8bmc9SmV4=", "fUFDl");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[4]] = lIIlllIlllIIlIlI("FHz7wrDhreo=", "nDSBy");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[5]] = lIIlllIlllIIlIlI("ArezG7H/Pjo=", "NIQdr");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[6]] = lIIlllIlllIIlIII("ymCERz1s++s=", "pehZm");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[7]] = lIIlllIlllIIlIlI("t2oiEqfvcY8=", "HjCZR");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[8]] = lIIlllIlllIIlIlI("xvqP6TAO1YQ=", "dZVhM");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[9]] = lIIlllIlllIIlIII("XK64GE1+8Sw=", "WPBtq");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[10]] = lIIlllIlllIIlIII("cBAeW5i3sZ8=", "pXmeo");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[11]] = lIIlllIlllIIlIII("wa2pDQq8eaIz46T46o43fw==", "nklFv");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[12]] = lIIlllIlllIIlIlI("6k3aJpFZe60=", "IbkcL");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[13]] = lIIlllIlllIIlIlI("uyU0bv+oEEo=", "tHDvf");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[14]] = lIIlllIlllIIlIII("pKLqK25/wik=", "OtPYb");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[15]] = lIIlllIlllIIlIII("58vGpwaMwLItuLtt9Yzh3Q==", "TuAEW");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[16]] = lIIlllIlllIIlIIl("", "huNKX");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[17]] = lIIlllIlllIIlIII("/OhCrXcyVxE=", "dNnLG");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[18]] = lIIlllIlllIIlIII("ZJhdDBRDGWM=", "aBOTV");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[19]] = lIIlllIlllIIlIII("U81Bxbl+z4A=", "JuKHt");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[20]] = lIIlllIlllIIlIIl("JgMgFQ==", "HlNpj");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[21]] = lIIlllIlllIIlIII("uQVv7fWyYzY=", "KzhFN");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[22]] = lIIlllIlllIIlIIl("", "ZrcBK");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[23]] = lIIlllIlllIIlIIl("Cx4RNz4d", "xjcXU");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[24]] = lIIlllIlllIIlIlI("wfi7hFcYypE=", "aKZcu");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[25]] = lIIlllIlllIIlIIl("MRIGMQYSEwYmTw==", "pfrCo");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[26]] = lIIlllIlllIIlIlI("uLZ4pGG5PIigV/dp9Pb3tZYj69vdzsaKdWEe7waKzwM=", "eeOuq");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[27]] = lIIlllIlllIIlIII("LhFiFaoctks=", "kuWyW");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[28]] = lIIlllIlllIIlIlI("7NRdgEH5t6Jp//GnheGnTA==", "tQVsH");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[29]] = lIIlllIlllIIlIlI("Ikaj/dYUV1mx/xw/x8DAwHoPP5XwaG2+oaIZV9DUBLo=", "jdpQv");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[30]] = lIIlllIlllIIlIII("HZyzY985QCQ=", "Ndyvy");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[31]] = lIIlllIlllIIlIII("LYqCG5HeaRc=", "ImTqM");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[32]] = lIIlllIlllIIlIII("6WYiDf5jo3ZA3K1Xrv2VrA==", "ADiVi");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[33]] = lIIlllIlllIIlIII("loxWbhPBh3ZzDN6L5jtZ8Ihx1H0S8xfq", "gitcR");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[34]] = lIIlllIlllIIlIlI("mZpoPH8g1Ogz8jQQP6hmLg==", "zDFCg");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[35]] = lIIlllIlllIIlIlI("fERTm0AOwFU=", "RRxGx");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[36]] = lIIlllIlllIIlIII("SIKORun4O8k=", "ylvwi");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[37]] = lIIlllIlllIIlIlI("NFjO3MuPlJo=", "QCaNS");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[38]] = lIIlllIlllIIlIII("GMiMWbHNgBE=", "yLDkB");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[39]] = lIIlllIlllIIlIlI("XlB5FT8uKo/EcPbdINhxEIm9bfmIF4fu", "TNPne");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[40]] = lIIlllIlllIIlIlI("f15/RVcjAQ8=", "XZQzz");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[41]] = lIIlllIlllIIlIIl("AC4iPxMWdyc5HAcy", "sZPPx");
        NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[42]] = lIIlllIlllIIlIlI("nAz17gmeB398HtG8Pyvu9qhhdssIqX7u", "kmdRG");
    }
    
    private static String lIIlllIlllIIlIII(final String llllllllllllIllIIIIIIIIlIIllIlII, final String llllllllllllIllIIIIIIIIlIIllIIll) {
        try {
            final SecretKeySpec llllllllllllIllIIIIIIIIlIIlllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIIIIlIIllIIll.getBytes(StandardCharsets.UTF_8)), NonGeometricData.lllIIIllIIIllI[8]), "DES");
            final Cipher llllllllllllIllIIIIIIIIlIIlllIII = Cipher.getInstance("DES");
            llllllllllllIllIIIIIIIIlIIlllIII.init(NonGeometricData.lllIIIllIIIllI[2], llllllllllllIllIIIIIIIIlIIlllIIl);
            return new String(llllllllllllIllIIIIIIIIlIIlllIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIIIIlIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIIIIIlIIllIlll) {
            llllllllllllIllIIIIIIIIlIIllIlll.printStackTrace();
            return null;
        }
    }
    
    public boolean isFilled() {
        return this.isColor(NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[30]]);
    }
    
    public boolean isStroked() {
        int n;
        if (lIIlllIlllIllIll(this.isColor(NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[31]]) ? 1 : 0) && lIIlllIllllIIIII(lIIlllIlllIlllll(this.getAsFloat(NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[32]]), 0.0f))) {
            n = NonGeometricData.lllIIIllIIIllI[1];
            "".length();
            if ("  ".length() >= "   ".length()) {
                return ((0x2C ^ 0x16 ^ (0xAB ^ 0xA0)) & (0x7C ^ 0x67 ^ (0xB8 ^ 0x92) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = NonGeometricData.lllIIIllIIIllI[0];
        }
        return n != 0;
    }
    
    private static int lIIlllIlllIlllll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public boolean isColor(final String llllllllllllIllIIIIIIIIlIllllIlI) {
        return this.getAttribute(llllllllllllIllIIIIIIIIlIllllIlI).startsWith(NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[24]]);
    }
    
    public float getAsFloat(final String llllllllllllIllIIIIIIIIlIlIlIllI) {
        final String llllllllllllIllIIIIIIIIlIlIlIlIl = this.getAttribute(llllllllllllIllIIIIIIIIlIlIlIllI);
        if (lIIlllIlllIlllII(llllllllllllIllIIIIIIIIlIlIlIlIl)) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(llllllllllllIllIIIIIIIIlIlIlIlIl);
        }
        catch (NumberFormatException llllllllllllIllIIIIIIIIlIlIllIII) {
            throw new RuntimeException(String.valueOf(new StringBuilder().append(NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[28]]).append(llllllllllllIllIIIIIIIIlIlIlIllI).append(NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[29]]).append(this.getAttribute(llllllllllllIllIIIIIIIIlIlIlIllI))));
        }
    }
    
    public String getAttribute(final String llllllllllllIllIIIIIIIIlIllIllll) {
        return this.props.getProperty(llllllllllllIllIIIIIIIIlIllIllll);
    }
    
    public String getMetaData() {
        return this.metaData;
    }
    
    private static void lIIlllIlllIllIlI() {
        (lllIIIllIIIllI = new int[44])[0] = (" ".length() & ~" ".length());
        NonGeometricData.lllIIIllIIIllI[1] = " ".length();
        NonGeometricData.lllIIIllIIIllI[2] = "  ".length();
        NonGeometricData.lllIIIllIIIllI[3] = "   ".length();
        NonGeometricData.lllIIIllIIIllI[4] = (84 + 48 - 81 + 99 ^ 113 + 25 - 10 + 18);
        NonGeometricData.lllIIIllIIIllI[5] = (0x85 ^ 0x94 ^ (0x9F ^ 0x8B));
        NonGeometricData.lllIIIllIIIllI[6] = (0x3C ^ 0x3A);
        NonGeometricData.lllIIIllIIIllI[7] = (0xAB ^ 0xAC);
        NonGeometricData.lllIIIllIIIllI[8] = (180 + 174 - 289 + 135 ^ 76 + 45 + 4 + 67);
        NonGeometricData.lllIIIllIIIllI[9] = (0x76 ^ 0x2B ^ (0xFB ^ 0xAF));
        NonGeometricData.lllIIIllIIIllI[10] = (0x4F ^ 0x0 ^ (0x1B ^ 0x5E));
        NonGeometricData.lllIIIllIIIllI[11] = (0xB7 ^ 0xBC);
        NonGeometricData.lllIIIllIIIllI[12] = (0x49 ^ 0x45);
        NonGeometricData.lllIIIllIIIllI[13] = (0x65 ^ 0x68);
        NonGeometricData.lllIIIllIIIllI[14] = (0xCF ^ 0xC1);
        NonGeometricData.lllIIIllIIIllI[15] = (0x44 ^ 0x4B);
        NonGeometricData.lllIIIllIIIllI[16] = (0x78 ^ 0x47 ^ (0x44 ^ 0x6B));
        NonGeometricData.lllIIIllIIIllI[17] = (0x8 ^ 0x19);
        NonGeometricData.lllIIIllIIIllI[18] = (0x13 ^ 0x1);
        NonGeometricData.lllIIIllIIIllI[19] = (0x89 ^ 0xC0 ^ (0xFE ^ 0xA4));
        NonGeometricData.lllIIIllIIIllI[20] = (0x7C ^ 0x46 ^ (0x4D ^ 0x63));
        NonGeometricData.lllIIIllIIIllI[21] = (0x6C ^ 0x79);
        NonGeometricData.lllIIIllIIIllI[22] = (0x67 ^ 0x27 ^ (0x3D ^ 0x6B));
        NonGeometricData.lllIIIllIIIllI[23] = (73 + 68 - 18 + 37 ^ 83 + 136 - 158 + 122);
        NonGeometricData.lllIIIllIIIllI[24] = (0x2F ^ 0x37);
        NonGeometricData.lllIIIllIIIllI[25] = (0x55 ^ 0x4C);
        NonGeometricData.lllIIIllIIIllI[26] = (0xB2 ^ 0xA8);
        NonGeometricData.lllIIIllIIIllI[27] = (0x6A ^ 0x50 ^ (0x32 ^ 0x13));
        NonGeometricData.lllIIIllIIIllI[28] = (0x16 ^ 0xA);
        NonGeometricData.lllIIIllIIIllI[29] = (0xD8 ^ 0xA3 ^ (0x27 ^ 0x41));
        NonGeometricData.lllIIIllIIIllI[30] = (0xA7 ^ 0xB9);
        NonGeometricData.lllIIIllIIIllI[31] = (0x8A ^ 0x95);
        NonGeometricData.lllIIIllIIIllI[32] = (0xAC ^ 0x8C);
        NonGeometricData.lllIIIllIIIllI[33] = (0x58 ^ 0x72 ^ (0xC ^ 0x7));
        NonGeometricData.lllIIIllIIIllI[34] = (0x30 ^ 0x12);
        NonGeometricData.lllIIIllIIIllI[35] = (113 + 78 - 104 + 44 ^ 20 + 61 - 12 + 91);
        NonGeometricData.lllIIIllIIIllI[36] = (0x29 ^ 0xD);
        NonGeometricData.lllIIIllIIIllI[37] = (0xBA ^ 0x9F);
        NonGeometricData.lllIIIllIIIllI[38] = (0x7C ^ 0x56 ^ (0xCF ^ 0xC3));
        NonGeometricData.lllIIIllIIIllI[39] = (0xBB ^ 0x9C);
        NonGeometricData.lllIIIllIIIllI[40] = (41 + 9 - 40 + 125 ^ 145 + 35 - 9 + 4);
        NonGeometricData.lllIIIllIIIllI[41] = (0x15 ^ 0x3C);
        NonGeometricData.lllIIIllIIIllI[42] = (0x71 ^ 0x55 ^ (0xD ^ 0x3));
        NonGeometricData.lllIIIllIIIllI[43] = (101 + 68 - 108 + 66 ^ (0xCB ^ 0x9F));
    }
    
    private String morphColor(final String llllllllllllIllIIIIIIIIllIIIlIII) {
        if (lIIlllIlllIllIll(llllllllllllIllIIIIIIIIllIIIlIII.equals(NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[3]]) ? 1 : 0)) {
            return NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[4]];
        }
        if (lIIlllIlllIllIll(llllllllllllIllIIIIIIIIllIIIlIII.equals(NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[5]]) ? 1 : 0)) {
            return NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[6]];
        }
        if (lIIlllIlllIllIll(llllllllllllIllIIIIIIIIllIIIlIII.equals(NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[7]]) ? 1 : 0)) {
            return NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[8]];
        }
        return llllllllllllIllIIIIIIIIllIIIlIII;
    }
    
    private static boolean lIIlllIlllIlllIl(final int llllllllllllIllIIIIIIIIlIIIIllll) {
        return llllllllllllIllIIIIIIIIlIIIIllll == 0;
    }
    
    public Color getAsColor(final String llllllllllllIllIIIIIIIIlIllIIlll) {
        if (lIIlllIlllIlllIl(this.isColor(llllllllllllIllIIIIIIIIlIllIIlll) ? 1 : 0)) {
            throw new RuntimeException(String.valueOf(new StringBuilder().append(NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[25]]).append(llllllllllllIllIIIIIIIIlIllIIlll).append(NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[26]]).append(this.getAttribute(llllllllllllIllIIIIIIIIlIllIIlll))));
        }
        final int llllllllllllIllIIIIIIIIlIllIlIIl = Integer.parseInt(this.getAttribute(llllllllllllIllIIIIIIIIlIllIIlll).substring(NonGeometricData.lllIIIllIIIllI[1]), NonGeometricData.lllIIIllIIIllI[16]);
        return new Color(llllllllllllIllIIIIIIIIlIllIlIIl);
    }
    
    public NonGeometricData(final String llllllllllllIllIIIIIIIIllIIIlIll) {
        this.metaData = NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[0]];
        this.props = new Properties();
        this.metaData = llllllllllllIllIIIIIIIIllIIIlIll;
        this.addAttribute(NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[1]], NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[2]]);
    }
    
    public void addAttribute(final String llllllllllllIllIIIIIIIIlIlllllll, String llllllllllllIllIIIIIIIIlIllllllI) {
        if (lIIlllIlllIlllII(llllllllllllIllIIIIIIIIlIllllllI)) {
            llllllllllllIllIIIIIIIIlIllllllI = NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[9]];
        }
        if (lIIlllIlllIllIll(llllllllllllIllIIIIIIIIlIlllllll.equals(NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[10]]) ? 1 : 0)) {
            llllllllllllIllIIIIIIIIlIllllllI = this.morphColor((String)llllllllllllIllIIIIIIIIlIllllllI);
        }
        if (lIIlllIlllIllIll(llllllllllllIllIIIIIIIIlIlllllll.equals(NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[11]]) ? 1 : 0) && lIIlllIlllIllIll(((String)llllllllllllIllIIIIIIIIlIllllllI).equals(NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[12]]) ? 1 : 0)) {
            this.props.setProperty(NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[13]], NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[14]]);
            "".length();
        }
        if (lIIlllIlllIllIll(llllllllllllIllIIIIIIIIlIlllllll.equals(NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[15]]) ? 1 : 0)) {
            if (lIIlllIlllIllIll(((String)llllllllllllIllIIIIIIIIlIllllllI).equals(NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[16]]) ? 1 : 0)) {
                llllllllllllIllIIIIIIIIlIllllllI = NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[17]];
            }
            if (lIIlllIlllIllIll(((String)llllllllllllIllIIIIIIIIlIllllllI).endsWith(NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[18]]) ? 1 : 0)) {
                llllllllllllIllIIIIIIIIlIllllllI = ((String)llllllllllllIllIIIIIIIIlIllllllI).substring(NonGeometricData.lllIIIllIIIllI[0], ((String)llllllllllllIllIIIIIIIIlIllllllI).length() - NonGeometricData.lllIIIllIIIllI[2]);
            }
        }
        if (lIIlllIlllIllIll(llllllllllllIllIIIIIIIIlIlllllll.equals(NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[19]]) ? 1 : 0)) {
            if (lIIlllIlllIllIll(NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[20]].equals(this.props.getProperty(NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[21]])) ? 1 : 0)) {
                return;
            }
            if (lIIlllIlllIllIll(NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[22]].equals(this.props.getProperty(NonGeometricData.lllIIIllIIIIll[NonGeometricData.lllIIIllIIIllI[23]])) ? 1 : 0)) {
                return;
            }
            llllllllllllIllIIIIIIIIlIllllllI = this.morphColor((String)llllllllllllIllIIIIIIIIlIllllllI);
        }
        this.props.setProperty(llllllllllllIllIIIIIIIIlIlllllll, (String)llllllllllllIllIIIIIIIIlIllllllI);
        "".length();
    }
    
    private static boolean lIIlllIlllIlllII(final Object llllllllllllIllIIIIIIIIlIIIlIIll) {
        return llllllllllllIllIIIIIIIIlIIIlIIll == null;
    }
    
    private static String lIIlllIlllIIlIIl(String llllllllllllIllIIIIIIIIlIIlIIIIl, final String llllllllllllIllIIIIIIIIlIIlIIIII) {
        llllllllllllIllIIIIIIIIlIIlIIIIl = new String(Base64.getDecoder().decode(llllllllllllIllIIIIIIIIlIIlIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIIIIIlIIlIIlII = new StringBuilder();
        final char[] llllllllllllIllIIIIIIIIlIIlIIIll = llllllllllllIllIIIIIIIIlIIlIIIII.toCharArray();
        int llllllllllllIllIIIIIIIIlIIlIIIlI = NonGeometricData.lllIIIllIIIllI[0];
        final char llllllllllllIllIIIIIIIIlIIIlllII = (Object)llllllllllllIllIIIIIIIIlIIlIIIIl.toCharArray();
        final byte llllllllllllIllIIIIIIIIlIIIllIll = (byte)llllllllllllIllIIIIIIIIlIIIlllII.length;
        double llllllllllllIllIIIIIIIIlIIIllIlI = NonGeometricData.lllIIIllIIIllI[0];
        while (lIIlllIlllIllllI((int)llllllllllllIllIIIIIIIIlIIIllIlI, llllllllllllIllIIIIIIIIlIIIllIll)) {
            final char llllllllllllIllIIIIIIIIlIIlIIlll = llllllllllllIllIIIIIIIIlIIIlllII[llllllllllllIllIIIIIIIIlIIIllIlI];
            llllllllllllIllIIIIIIIIlIIlIIlII.append((char)(llllllllllllIllIIIIIIIIlIIlIIlll ^ llllllllllllIllIIIIIIIIlIIlIIIll[llllllllllllIllIIIIIIIIlIIlIIIlI % llllllllllllIllIIIIIIIIlIIlIIIll.length]));
            "".length();
            ++llllllllllllIllIIIIIIIIlIIlIIIlI;
            ++llllllllllllIllIIIIIIIIlIIIllIlI;
            "".length();
            if (((0x6A ^ 0x33 ^ (0x4D ^ 0x33)) & (0x82 ^ 0xB4 ^ (0x5 ^ 0x14) ^ -" ".length())) == " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIIIIIlIIlIIlII);
    }
}
