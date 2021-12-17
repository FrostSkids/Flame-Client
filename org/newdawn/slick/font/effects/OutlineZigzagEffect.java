// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.font.effects;

import java.awt.geom.PathIterator;
import java.awt.BasicStroke;
import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.Color;
import java.util.Iterator;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.awt.Stroke;
import java.util.List;

public class OutlineZigzagEffect extends OutlineEffect
{
    private /* synthetic */ float wavelength;
    private /* synthetic */ float amplitude;
    private static final /* synthetic */ int[] lIllllllIlIIll;
    private static final /* synthetic */ String[] lIllllllIlIIII;
    
    public float getAmplitude() {
        return this.amplitude;
    }
    
    public void setAmplitude(final float llllllllllllIllllIIlIIlllIlIlIIl) {
        this.amplitude = llllllllllllIllllIIlIIlllIlIlIIl;
    }
    
    @Override
    public List getValues() {
        final List llllllllllllIllllIIlIIlllIIllIIl = super.getValues();
        llllllllllllIllllIIlIIlllIIllIIl.add(EffectUtil.floatValue(OutlineZigzagEffect.lIllllllIlIIII[OutlineZigzagEffect.lIllllllIlIIll[1]], this.wavelength, 1.0f, 100.0f, OutlineZigzagEffect.lIllllllIlIIII[OutlineZigzagEffect.lIllllllIlIIll[2]]));
        "".length();
        llllllllllllIllllIIlIIlllIIllIIl.add(EffectUtil.floatValue(OutlineZigzagEffect.lIllllllIlIIII[OutlineZigzagEffect.lIllllllIlIIll[3]], this.amplitude, 0.5f, 50.0f, OutlineZigzagEffect.lIllllllIlIIII[OutlineZigzagEffect.lIllllllIlIIll[4]]));
        "".length();
        return llllllllllllIllllIIlIIlllIIllIIl;
    }
    
    private static boolean lIIIIlIlllIlIIIl(final int llllllllllllIllllIIlIIllIlIlIIII, final int llllllllllllIllllIIlIIllIlIIllll) {
        return llllllllllllIllllIIlIIllIlIlIIII < llllllllllllIllllIIlIIllIlIIllll;
    }
    
    @Override
    public String toString() {
        return OutlineZigzagEffect.lIllllllIlIIII[OutlineZigzagEffect.lIllllllIlIIll[0]];
    }
    
    public OutlineZigzagEffect() {
        this.amplitude = 1.0f;
        this.wavelength = 3.0f;
        this.setStroke(new ZigzagStroke());
    }
    
    private static void lIIIIlIlllIIllll() {
        (lIllllllIlIIll = new int[9])[0] = ((0xFE ^ 0xBE) & ~(0x1F ^ 0x5F));
        OutlineZigzagEffect.lIllllllIlIIll[1] = " ".length();
        OutlineZigzagEffect.lIllllllIlIIll[2] = "  ".length();
        OutlineZigzagEffect.lIllllllIlIIll[3] = "   ".length();
        OutlineZigzagEffect.lIllllllIlIIll[4] = (140 + 46 - 84 + 72 ^ 45 + 9 + 45 + 71);
        OutlineZigzagEffect.lIllllllIlIIll[5] = (0xBA ^ 0xBF);
        OutlineZigzagEffect.lIllllllIlIIll[6] = (136 + 189 - 267 + 133 ^ 98 + 32 + 19 + 36);
        OutlineZigzagEffect.lIllllllIlIIll[7] = ("  ".length() ^ (0x3F ^ 0x3A));
        OutlineZigzagEffect.lIllllllIlIIll[8] = (45 + 101 - 38 + 35 ^ 117 + 98 - 185 + 105);
    }
    
    private static void lIIIIlIlllIIlllI() {
        (lIllllllIlIIII = new String[OutlineZigzagEffect.lIllllllIlIIll[7]])[OutlineZigzagEffect.lIllllllIlIIll[0]] = lIIIIlIlllIIlIll("Lchw/iVSJYy+fGGUnRBAS45CPYsuPaI5", "kigBE");
        OutlineZigzagEffect.lIllllllIlIIII[OutlineZigzagEffect.lIllllllIlIIll[1]] = lIIIIlIlllIIllII("JS0YFQAXIgkEBA==", "rLnpl");
        OutlineZigzagEffect.lIllllllIlIIII[OutlineZigzagEffect.lIllllllIlIIll[2]] = lIIIIlIlllIIlIll("HOk5IqJ8bwsIp6cJrVTW5+e2IS5FVt4uxrqXBHnt2VUjodCvzQXDJuVLTR5XDl+h6R9Lod9O/WOcNE8nAXRiw9QU0F9Jn+WrkiC9uZJdFN2kM/2NTaQ0Etm+h1yXm3EAzFmqZmvWVe61W90tH7xgfKIb/2tfctGTnqJRDKrDkxQ=", "TQflc");
        OutlineZigzagEffect.lIllllllIlIIII[OutlineZigzagEffect.lIllllllIlIIll[3]] = lIIIIlIlllIIllIl("q+cGwduw+akYfvQd6Jxd+Q==", "vfsUF");
        OutlineZigzagEffect.lIllllllIlIIII[OutlineZigzagEffect.lIllllllIlIIll[4]] = lIIIIlIlllIIllII("Iw4qEWUEAzcWLBkBYwEqGRIxDSkERjcKIFcHLhIpHhI2BiBXCSVCMR8DYw0wAwoqDCBZRhcKIFcEKgUiEhRjFi0SRjUDKQIDb0IxHwNjDyoFA2MWLRJGOQsiDQckEWUADy8OZQEHMRtr", "wfCbE");
        OutlineZigzagEffect.lIllllllIlIIII[OutlineZigzagEffect.lIllllllIlIIll[5]] = lIIIIlIlllIIllIl("n/OXwSR5EFysURNI12F6pA==", "hEBiy");
        OutlineZigzagEffect.lIllllllIlIIII[OutlineZigzagEffect.lIllllllIlIIll[6]] = lIIIIlIlllIIllIl("tQnjiuc9bAyB1GqXo5J7Vw==", "MXumL");
    }
    
    private static String lIIIIlIlllIIllIl(final String llllllllllllIllllIIlIIllIlllIIII, final String llllllllllllIllllIIlIIllIllIllIl) {
        try {
            final SecretKeySpec llllllllllllIllllIIlIIllIlllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlIIllIllIllIl.getBytes(StandardCharsets.UTF_8)), OutlineZigzagEffect.lIllllllIlIIll[8]), "DES");
            final Cipher llllllllllllIllllIIlIIllIlllIIlI = Cipher.getInstance("DES");
            llllllllllllIllllIIlIIllIlllIIlI.init(OutlineZigzagEffect.lIllllllIlIIll[2], llllllllllllIllllIIlIIllIlllIIll);
            return new String(llllllllllllIllllIIlIIllIlllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlIIllIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIlIIllIlllIIIl) {
            llllllllllllIllllIIlIIllIlllIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void setValues(final List llllllllllllIllllIIlIIlllIIIllll) {
        super.setValues(llllllllllllIllllIIlIIlllIIIllll);
        final Iterator llllllllllllIllllIIlIIlllIIlIIIl = llllllllllllIllllIIlIIlllIIIllll.iterator();
        while (lIIIIlIlllIlIIII(llllllllllllIllllIIlIIlllIIlIIIl.hasNext() ? 1 : 0)) {
            final ConfigurableEffect.Value llllllllllllIllllIIlIIlllIIlIIlI = llllllllllllIllllIIlIIlllIIlIIIl.next();
            if (lIIIIlIlllIlIIII(llllllllllllIllllIIlIIlllIIlIIlI.getName().equals(OutlineZigzagEffect.lIllllllIlIIII[OutlineZigzagEffect.lIllllllIlIIll[5]]) ? 1 : 0)) {
                this.wavelength = (float)llllllllllllIllllIIlIIlllIIlIIlI.getObject();
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            }
            else if (lIIIIlIlllIlIIII(llllllllllllIllllIIlIIlllIIlIIlI.getName().equals(OutlineZigzagEffect.lIllllllIlIIII[OutlineZigzagEffect.lIllllllIlIIll[6]]) ? 1 : 0)) {
                this.amplitude = (float)llllllllllllIllllIIlIIlllIIlIIlI.getObject();
            }
            "".length();
            if (null != null) {
                return;
            }
        }
    }
    
    public void setWavelength(final float llllllllllllIllllIIlIIlllIllIIlI) {
        this.wavelength = llllllllllllIllllIIlIIlllIllIIlI;
    }
    
    private static boolean lIIIIlIlllIlIIII(final int llllllllllllIllllIIlIIllIlIIllIl) {
        return llllllllllllIllllIIlIIllIlIIllIl != 0;
    }
    
    public float getWavelength() {
        return this.wavelength;
    }
    
    static {
        lIIIIlIlllIIllll();
        lIIIIlIlllIIlllI();
    }
    
    public OutlineZigzagEffect(final int llllllllllllIllllIIlIIlllIIlllll, final Color llllllllllllIllllIIlIIlllIIllllI) {
        super(llllllllllllIllllIIlIIlllIIlllll, llllllllllllIllllIIlIIlllIIllllI);
        this.amplitude = 1.0f;
        this.wavelength = 3.0f;
    }
    
    private static String lIIIIlIlllIIllII(String llllllllllllIllllIIlIIllIlIllIll, final String llllllllllllIllllIIlIIllIlIlllll) {
        llllllllllllIllllIIlIIllIlIllIll = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIIlIIllIlIllIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIIlIIllIlIllllI = new StringBuilder();
        final char[] llllllllllllIllllIIlIIllIlIlllIl = llllllllllllIllllIIlIIllIlIlllll.toCharArray();
        int llllllllllllIllllIIlIIllIlIlllII = OutlineZigzagEffect.lIllllllIlIIll[0];
        final String llllllllllllIllllIIlIIllIlIlIllI = (Object)((String)llllllllllllIllllIIlIIllIlIllIll).toCharArray();
        final String llllllllllllIllllIIlIIllIlIlIlIl = (String)llllllllllllIllllIIlIIllIlIlIllI.length;
        double llllllllllllIllllIIlIIllIlIlIlII = OutlineZigzagEffect.lIllllllIlIIll[0];
        while (lIIIIlIlllIlIIIl((int)llllllllllllIllllIIlIIllIlIlIlII, (int)llllllllllllIllllIIlIIllIlIlIlIl)) {
            final char llllllllllllIllllIIlIIllIllIIIIl = llllllllllllIllllIIlIIllIlIlIllI[llllllllllllIllllIIlIIllIlIlIlII];
            llllllllllllIllllIIlIIllIlIllllI.append((char)(llllllllllllIllllIIlIIllIllIIIIl ^ llllllllllllIllllIIlIIllIlIlllIl[llllllllllllIllllIIlIIllIlIlllII % llllllllllllIllllIIlIIllIlIlllIl.length]));
            "".length();
            ++llllllllllllIllllIIlIIllIlIlllII;
            ++llllllllllllIllllIIlIIllIlIlIlII;
            "".length();
            if ("  ".length() > (0xA7 ^ 0xA3)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIIlIIllIlIllllI);
    }
    
    private static String lIIIIlIlllIIlIll(final String llllllllllllIllllIIlIIllIlllllIl, final String llllllllllllIllllIIlIIllIlllllII) {
        try {
            final SecretKeySpec llllllllllllIllllIIlIIlllIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlIIllIlllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIlIIllIlllllll = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIlIIllIlllllll.init(OutlineZigzagEffect.lIllllllIlIIll[2], llllllllllllIllllIIlIIlllIIIIIII);
            return new String(llllllllllllIllllIIlIIllIlllllll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlIIllIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIlIIllIllllllI) {
            llllllllllllIllllIIlIIllIllllllI.printStackTrace();
            return null;
        }
    }
    
    private class ZigzagStroke implements Stroke
    {
        private static final /* synthetic */ int[] lIlIllIlIIIIlI;
        
        static {
            llllIIIlIllllIl();
        }
        
        private static boolean llllIIIlIllllll(final int lllllllllllllIIIIllIllIlIIIllIIl) {
            return lllllllllllllIIIIllIllIlIIIllIIl == 0;
        }
        
        private static boolean llllIIIllIIIIIl(final int lllllllllllllIIIIllIllIlIIIlllII, final int lllllllllllllIIIIllIllIlIIIllIll) {
            return lllllllllllllIIIIllIllIlIIIlllII == lllllllllllllIIIIllIllIlIIIllIll;
        }
        
        private static int llllIIIlIlllllI(final float n, final float n2) {
            return fcmpl(n, n2);
        }
        
        public Shape createStrokedShape(final Shape lllllllllllllIIIIllIllIlIIlllIII) {
            final GeneralPath lllllllllllllIIIIllIllIlIlIIIlIl = new GeneralPath();
            final PathIterator lllllllllllllIIIIllIllIlIlIIIlII = new FlatteningPathIterator(lllllllllllllIIIIllIllIlIIlllIII.getPathIterator(null), 1.0);
            final float[] lllllllllllllIIIIllIllIlIlIIIIll = new float[ZigzagStroke.lIlIllIlIIIIlI[0]];
            float lllllllllllllIIIIllIllIlIlIIIIlI = 0.0f;
            float lllllllllllllIIIIllIllIlIlIIIIIl = 0.0f;
            float lllllllllllllIIIIllIllIlIlIIIIII = 0.0f;
            float lllllllllllllIIIIllIllIlIIllllll = 0.0f;
            float lllllllllllllIIIIllIllIlIIlllllI = 0.0f;
            float lllllllllllllIIIIllIllIlIIllllIl = 0.0f;
            int lllllllllllllIIIIllIllIlIIllllII = ZigzagStroke.lIlIllIlIIIIlI[1];
            float lllllllllllllIIIIllIllIlIIlllIll = 0.0f;
            int lllllllllllllIIIIllIllIlIIlllIlI = ZigzagStroke.lIlIllIlIIIIlI[1];
            while (llllIIIlIllllll(lllllllllllllIIIIllIllIlIlIIIlII.isDone() ? 1 : 0)) {
                lllllllllllllIIIIllIllIlIIllllII = lllllllllllllIIIIllIllIlIlIIIlII.currentSegment(lllllllllllllIIIIllIllIlIlIIIIll);
                switch (lllllllllllllIIIIllIllIlIIllllII) {
                    case 0: {
                        lllllllllllllIIIIllIllIlIlIIIIII = (lllllllllllllIIIIllIllIlIlIIIIlI = lllllllllllllIIIIllIllIlIlIIIIll[ZigzagStroke.lIlIllIlIIIIlI[1]]);
                        lllllllllllllIIIIllIllIlIIllllll = (lllllllllllllIIIIllIllIlIlIIIIIl = lllllllllllllIIIIllIllIlIlIIIIll[ZigzagStroke.lIlIllIlIIIIlI[2]]);
                        lllllllllllllIIIIllIllIlIlIIIlIl.moveTo(lllllllllllllIIIIllIllIlIlIIIIlI, lllllllllllllIIIIllIllIlIlIIIIIl);
                        lllllllllllllIIIIllIllIlIIlllIll = OutlineZigzagEffect.this.wavelength / 2.0f;
                        "".length();
                        if (((0x96 ^ 0xC4) & ~(0xD7 ^ 0x85)) != 0x0) {
                            return null;
                        }
                        break;
                    }
                    case 4: {
                        lllllllllllllIIIIllIllIlIlIIIIll[ZigzagStroke.lIlIllIlIIIIlI[1]] = lllllllllllllIIIIllIllIlIlIIIIlI;
                        lllllllllllllIIIIllIllIlIlIIIIll[ZigzagStroke.lIlIllIlIIIIlI[2]] = lllllllllllllIIIIllIllIlIlIIIIIl;
                    }
                    case 1: {
                        lllllllllllllIIIIllIllIlIIlllllI = lllllllllllllIIIIllIllIlIlIIIIll[ZigzagStroke.lIlIllIlIIIIlI[1]];
                        lllllllllllllIIIIllIllIlIIllllIl = lllllllllllllIIIIllIllIlIlIIIIll[ZigzagStroke.lIlIllIlIIIIlI[2]];
                        final float lllllllllllllIIIIllIllIlIlIIlIlI = lllllllllllllIIIIllIllIlIIlllllI - lllllllllllllIIIIllIllIlIlIIIIII;
                        final float lllllllllllllIIIIllIllIlIlIIlIIl = lllllllllllllIIIIllIllIlIIllllIl - lllllllllllllIIIIllIllIlIIllllll;
                        final float lllllllllllllIIIIllIllIlIlIIlIII = (float)Math.sqrt(lllllllllllllIIIIllIllIlIlIIlIlI * lllllllllllllIIIIllIllIlIlIIlIlI + lllllllllllllIIIIllIllIlIlIIlIIl * lllllllllllllIIIIllIllIlIlIIlIIl);
                        if (llllIIIllIIIIII(llllIIIlIlllllI(lllllllllllllIIIIllIllIlIlIIlIII, lllllllllllllIIIIllIllIlIIlllIll))) {
                            final float lllllllllllllIIIIllIllIlIlIIlIll = 1.0f / lllllllllllllIIIIllIllIlIlIIlIII;
                            while (llllIIIllIIIIII(llllIIIlIlllllI(lllllllllllllIIIIllIllIlIlIIlIII, lllllllllllllIIIIllIllIlIIlllIll))) {
                                final float lllllllllllllIIIIllIllIlIlIIllIl = lllllllllllllIIIIllIllIlIlIIIIII + lllllllllllllIIIIllIllIlIIlllIll * lllllllllllllIIIIllIllIlIlIIlIlI * lllllllllllllIIIIllIllIlIlIIlIll;
                                final float lllllllllllllIIIIllIllIlIlIIllII = lllllllllllllIIIIllIllIlIIllllll + lllllllllllllIIIIllIllIlIIlllIll * lllllllllllllIIIIllIllIlIlIIlIIl * lllllllllllllIIIIllIllIlIlIIlIll;
                                if (llllIIIlIllllll(lllllllllllllIIIIllIllIlIIlllIlI & ZigzagStroke.lIlIllIlIIIIlI[2])) {
                                    lllllllllllllIIIIllIllIlIlIIIlIl.lineTo(lllllllllllllIIIIllIllIlIlIIllIl + OutlineZigzagEffect.this.amplitude * lllllllllllllIIIIllIllIlIlIIlIIl * lllllllllllllIIIIllIllIlIlIIlIll, lllllllllllllIIIIllIllIlIlIIllII - OutlineZigzagEffect.this.amplitude * lllllllllllllIIIIllIllIlIlIIlIlI * lllllllllllllIIIIllIllIlIlIIlIll);
                                    "".length();
                                    if ("   ".length() > "   ".length()) {
                                        return null;
                                    }
                                }
                                else {
                                    lllllllllllllIIIIllIllIlIlIIIlIl.lineTo(lllllllllllllIIIIllIllIlIlIIllIl - OutlineZigzagEffect.this.amplitude * lllllllllllllIIIIllIllIlIlIIlIIl * lllllllllllllIIIIllIllIlIlIIlIll, lllllllllllllIIIIllIllIlIlIIllII + OutlineZigzagEffect.this.amplitude * lllllllllllllIIIIllIllIlIlIIlIlI * lllllllllllllIIIIllIllIlIlIIlIll);
                                }
                                lllllllllllllIIIIllIllIlIIlllIll += OutlineZigzagEffect.this.wavelength;
                                ++lllllllllllllIIIIllIllIlIIlllIlI;
                                "".length();
                                if ((161 + 16 - 40 + 53 ^ 179 + 56 - 94 + 45) <= 0) {
                                    return null;
                                }
                            }
                        }
                        lllllllllllllIIIIllIllIlIIlllIll -= lllllllllllllIIIIllIllIlIlIIlIII;
                        lllllllllllllIIIIllIllIlIlIIIIII = lllllllllllllIIIIllIllIlIIlllllI;
                        lllllllllllllIIIIllIllIlIIllllll = lllllllllllllIIIIllIllIlIIllllIl;
                        if (llllIIIllIIIIIl(lllllllllllllIIIIllIllIlIIllllII, ZigzagStroke.lIlIllIlIIIIlI[3])) {
                            lllllllllllllIIIIllIllIlIlIIIlIl.closePath();
                            break;
                        }
                        break;
                    }
                }
                lllllllllllllIIIIllIllIlIlIIIlII.next();
                "".length();
                if ((0x11 ^ 0x15) < 0) {
                    return null;
                }
            }
            return new BasicStroke(OutlineZigzagEffect.this.getWidth(), ZigzagStroke.lIlIllIlIIIIlI[4], OutlineZigzagEffect.this.getJoin()).createStrokedShape(lllllllllllllIIIIllIllIlIlIIIlIl);
        }
        
        private static boolean llllIIIllIIIIII(final int lllllllllllllIIIIllIllIlIIIlIlll) {
            return lllllllllllllIIIIllIllIlIIIlIlll >= 0;
        }
        
        private static void llllIIIlIllllIl() {
            (lIlIllIlIIIIlI = new int[5])[0] = (0x99 ^ 0xC7 ^ (0x59 ^ 0x1));
            ZigzagStroke.lIlIllIlIIIIlI[1] = ((0xE3 ^ 0xB4) & ~(0xEC ^ 0xBB));
            ZigzagStroke.lIlIllIlIIIIlI[2] = " ".length();
            ZigzagStroke.lIlIllIlIIIIlI[3] = (0x74 ^ 0x5D ^ (0x8A ^ 0xA7));
            ZigzagStroke.lIlIllIlIIIIlI[4] = "  ".length();
        }
    }
}
