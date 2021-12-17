// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.font.effects;

import java.awt.geom.PathIterator;
import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.AffineTransform;
import java.awt.BasicStroke;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.Color;
import java.util.Iterator;
import java.util.List;
import java.awt.Stroke;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class OutlineWobbleEffect extends OutlineEffect
{
    private /* synthetic */ float detail;
    private static final /* synthetic */ String[] lllIIllIlIllII;
    private /* synthetic */ float amplitude;
    private static final /* synthetic */ int[] lllIIllIlIlllI;
    
    @Override
    public String toString() {
        return OutlineWobbleEffect.lllIIllIlIllII[OutlineWobbleEffect.lllIIllIlIlllI[0]];
    }
    
    public float getDetail() {
        return this.detail;
    }
    
    private static String lIlIIIIIIlllIIlI(final String llllllllllllIlIlllIllllIlIIIllll, final String llllllllllllIlIlllIllllIlIIIllII) {
        try {
            final SecretKeySpec llllllllllllIlIlllIllllIlIIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIllllIlIIIllII.getBytes(StandardCharsets.UTF_8)), OutlineWobbleEffect.lllIIllIlIlllI[8]), "DES");
            final Cipher llllllllllllIlIlllIllllIlIIlIIIl = Cipher.getInstance("DES");
            llllllllllllIlIlllIllllIlIIlIIIl.init(OutlineWobbleEffect.lllIIllIlIlllI[1], llllllllllllIlIlllIllllIlIIlIIlI);
            return new String(llllllllllllIlIlllIllllIlIIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIllllIlIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIllllIlIIlIIII) {
            llllllllllllIlIlllIllllIlIIlIIII.printStackTrace();
            return null;
        }
    }
    
    public OutlineWobbleEffect() {
        this.detail = 1.0f;
        this.amplitude = 1.0f;
        this.setStroke(new WobbleStroke());
    }
    
    private static String lIlIIIIIIlllIIll(String llllllllllllIlIlllIllllIlIIlllll, final String llllllllllllIlIlllIllllIlIIllllI) {
        llllllllllllIlIlllIllllIlIIlllll = new String(Base64.getDecoder().decode(llllllllllllIlIlllIllllIlIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllIllllIlIlIIIlI = new StringBuilder();
        final char[] llllllllllllIlIlllIllllIlIlIIIIl = llllllllllllIlIlllIllllIlIIllllI.toCharArray();
        int llllllllllllIlIlllIllllIlIlIIIII = OutlineWobbleEffect.lllIIllIlIlllI[0];
        final double llllllllllllIlIlllIllllIlIIllIlI = (Object)llllllllllllIlIlllIllllIlIIlllll.toCharArray();
        final Exception llllllllllllIlIlllIllllIlIIllIIl = (Exception)llllllllllllIlIlllIllllIlIIllIlI.length;
        long llllllllllllIlIlllIllllIlIIllIII = OutlineWobbleEffect.lllIIllIlIlllI[0];
        while (lIlIIIIIIllllIIl((int)llllllllllllIlIlllIllllIlIIllIII, (int)llllllllllllIlIlllIllllIlIIllIIl)) {
            final char llllllllllllIlIlllIllllIlIlIIlIl = llllllllllllIlIlllIllllIlIIllIlI[llllllllllllIlIlllIllllIlIIllIII];
            llllllllllllIlIlllIllllIlIlIIIlI.append((char)(llllllllllllIlIlllIllllIlIlIIlIl ^ llllllllllllIlIlllIllllIlIlIIIIl[llllllllllllIlIlllIllllIlIlIIIII % llllllllllllIlIlllIllllIlIlIIIIl.length]));
            "".length();
            ++llllllllllllIlIlllIllllIlIlIIIII;
            ++llllllllllllIlIlllIllllIlIIllIII;
            "".length();
            if (((0x9B ^ 0x96 ^ (0x47 ^ 0x4D)) & (0x37 ^ 0x19 ^ (0xD ^ 0x24) ^ -" ".length())) >= " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllIllllIlIlIIIlI);
    }
    
    @Override
    public void setValues(final List llllllllllllIlIlllIllllIlIlllIIl) {
        super.setValues(llllllllllllIlIlllIllllIlIlllIIl);
        final Iterator llllllllllllIlIlllIllllIlIlllIll = llllllllllllIlIlllIllllIlIlllIIl.iterator();
        while (lIlIIIIIIllllIII(llllllllllllIlIlllIllllIlIlllIll.hasNext() ? 1 : 0)) {
            final ConfigurableEffect.Value llllllllllllIlIlllIllllIlIllllII = llllllllllllIlIlllIllllIlIlllIll.next();
            if (lIlIIIIIIllllIII(llllllllllllIlIlllIllllIlIllllII.getName().equals(OutlineWobbleEffect.lllIIllIlIllII[OutlineWobbleEffect.lllIIllIlIlllI[5]]) ? 1 : 0)) {
                this.detail = (float)llllllllllllIlIlllIllllIlIllllII.getObject();
                "".length();
                if ("  ".length() <= " ".length()) {
                    return;
                }
            }
            else if (lIlIIIIIIllllIII(llllllllllllIlIlllIllllIlIllllII.getName().equals(OutlineWobbleEffect.lllIIllIlIllII[OutlineWobbleEffect.lllIIllIlIlllI[6]]) ? 1 : 0)) {
                this.amplitude = (float)llllllllllllIlIlllIllllIlIllllII.getObject();
            }
            "".length();
            if (((0x39 ^ 0x7B) & ~(0xD2 ^ 0x90)) > 0) {
                return;
            }
        }
    }
    
    static {
        lIlIIIIIIlllIlll();
        lIlIIIIIIlllIlII();
    }
    
    private static boolean lIlIIIIIIllllIII(final int llllllllllllIlIlllIllllIIlllIlll) {
        return llllllllllllIlIlllIllllIIlllIlll != 0;
    }
    
    private static String lIlIIIIIIlllIIIl(final String llllllllllllIlIlllIllllIlIIIIIII, final String llllllllllllIlIlllIllllIlIIIIIIl) {
        try {
            final SecretKeySpec llllllllllllIlIlllIllllIlIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIllllIlIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllIllllIlIIIIlII = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllIllllIlIIIIlII.init(OutlineWobbleEffect.lllIIllIlIlllI[1], llllllllllllIlIlllIllllIlIIIIlIl);
            return new String(llllllllllllIlIlllIllllIlIIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIllllIlIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIllllIlIIIIIll) {
            llllllllllllIlIlllIllllIlIIIIIll.printStackTrace();
            return null;
        }
    }
    
    public void setDetail(final float llllllllllllIlIlllIllllIllIllIlI) {
        this.detail = llllllllllllIlIlllIllllIllIllIlI;
    }
    
    private static void lIlIIIIIIlllIlII() {
        (lllIIllIlIllII = new String[OutlineWobbleEffect.lllIIllIlIlllI[7]])[OutlineWobbleEffect.lllIIllIlIlllI[0]] = lIlIIIIIIlllIIIl("0z7krpMFLrv9qCgZEJBdk0ss+0Dv4RJL", "xVsHs");
        OutlineWobbleEffect.lllIIllIlIllII[OutlineWobbleEffect.lllIIllIlIlllI[2]] = lIlIIIIIIlllIIlI("IRGGCOpQnzI=", "ZNMcl");
        OutlineWobbleEffect.lllIIllIlIllII[OutlineWobbleEffect.lllIIllIlIlllI[1]] = lIlIIIIIIlllIIll("AjsmEXMlNjsWOjg0bwE8OCc9DT8lcycNJHY3KhYyPz8qBnMiOypCPCMnIws9M3M4Cz86cy0HfXYAIgM/OjY9Qj0jPi0HISVzLAMmJTZvFjszcyAXJzo6IQdzIjxvCjIgNm8PPCQ2bwY2IjImDn0=", "VSObS");
        OutlineWobbleEffect.lllIIllIlIllII[OutlineWobbleEffect.lllIIllIlIlllI[3]] = lIlIIIIIIlllIIlI("ifsgzEdC+j4u85BkowpFhA==", "xfesN");
        OutlineWobbleEffect.lllIIllIlIllII[OutlineWobbleEffect.lllIIllIlIlllI[4]] = lIlIIIIIIlllIIIl("TqjTzrowSv3D93TY0g73Ckt1gh4gJ+mOCG0dCOUHt7E8nfZn5pDkXMN48dQVtPUqwE4Si3qD4zs=", "lQOKi");
        OutlineWobbleEffect.lllIIllIlIllII[OutlineWobbleEffect.lllIIllIlIlllI[5]] = lIlIIIIIIlllIIlI("WyfJ+RzC50A=", "mJAXW");
        OutlineWobbleEffect.lllIIllIlIllII[OutlineWobbleEffect.lllIIllIlIlllI[6]] = lIlIIIIIIlllIIll("Ei81Kw0nNyEi", "SBEGd");
    }
    
    private static void lIlIIIIIIlllIlll() {
        (lllIIllIlIlllI = new int[9])[0] = ((109 + 136 - 193 + 140 ^ 54 + 80 - 27 + 29) & (198 + 29 - 140 + 153 ^ 160 + 9 - 153 + 168 ^ -" ".length()));
        OutlineWobbleEffect.lllIIllIlIlllI[1] = "  ".length();
        OutlineWobbleEffect.lllIIllIlIlllI[2] = " ".length();
        OutlineWobbleEffect.lllIIllIlIlllI[3] = "   ".length();
        OutlineWobbleEffect.lllIIllIlIlllI[4] = (74 + 152 - 67 + 10 ^ 111 + 128 - 107 + 41);
        OutlineWobbleEffect.lllIIllIlIlllI[5] = (" ".length() ^ (0xAB ^ 0xAF));
        OutlineWobbleEffect.lllIIllIlIlllI[6] = (116 + 194 - 281 + 166 ^ 28 + 17 - 34 + 186);
        OutlineWobbleEffect.lllIIllIlIlllI[7] = (0xB7 ^ 0xB0);
        OutlineWobbleEffect.lllIIllIlIlllI[8] = (0x8A ^ 0x82);
    }
    
    public void setAmplitude(final float llllllllllllIlIlllIllllIllIlIIIl) {
        this.amplitude = llllllllllllIlIlllIllllIllIlIIIl;
    }
    
    @Override
    public List getValues() {
        final List llllllllllllIlIlllIllllIllIIIIll = super.getValues();
        llllllllllllIlIlllIllllIllIIIIll.remove(OutlineWobbleEffect.lllIIllIlIlllI[1]);
        "".length();
        llllllllllllIlIlllIllllIllIIIIll.add(EffectUtil.floatValue(OutlineWobbleEffect.lllIIllIlIllII[OutlineWobbleEffect.lllIIllIlIlllI[2]], this.detail, 1.0f, 50.0f, OutlineWobbleEffect.lllIIllIlIllII[OutlineWobbleEffect.lllIIllIlIlllI[1]]));
        "".length();
        llllllllllllIlIlllIllllIllIIIIll.add(EffectUtil.floatValue(OutlineWobbleEffect.lllIIllIlIllII[OutlineWobbleEffect.lllIIllIlIlllI[3]], this.amplitude, 0.5f, 50.0f, OutlineWobbleEffect.lllIIllIlIllII[OutlineWobbleEffect.lllIIllIlIlllI[4]]));
        "".length();
        return llllllllllllIlIlllIllllIllIIIIll;
    }
    
    private static boolean lIlIIIIIIllllIIl(final int llllllllllllIlIlllIllllIIllllIlI, final int llllllllllllIlIlllIllllIIllllIIl) {
        return llllllllllllIlIlllIllllIIllllIlI < llllllllllllIlIlllIllllIIllllIIl;
    }
    
    public OutlineWobbleEffect(final int llllllllllllIlIlllIllllIllIIlIIl, final Color llllllllllllIlIlllIllllIllIIlIII) {
        super(llllllllllllIlIlllIllllIllIIlIIl, llllllllllllIlIlllIllllIllIIlIII);
        this.detail = 1.0f;
        this.amplitude = 1.0f;
    }
    
    public float getAmplitude() {
        return this.amplitude;
    }
    
    private class WobbleStroke implements Stroke
    {
        private static final /* synthetic */ int[] llIIIIIllIlIll;
        
        private static boolean lIIIIlllIlIlllIl(final int llllllllllllIlllIlllIlllIIlIIIlI) {
            return llllllllllllIlllIlllIlllIIlIIIlI >= 0;
        }
        
        private static int lIIIIlllIlIllIlI(final float n, final float n2) {
            return fcmpl(n, n2);
        }
        
        private static void lIIIIlllIlIllIIl() {
            (llIIIIIllIlIll = new int[4])[0] = "  ".length();
            WobbleStroke.llIIIIIllIlIll[1] = (118 + 60 - 134 + 95 ^ 80 + 0 + 22 + 39);
            WobbleStroke.llIIIIIllIlIll[2] = ((0xBB ^ 0x95) & ~(0x92 ^ 0xBC));
            WobbleStroke.llIIIIIllIlIll[3] = " ".length();
        }
        
        public Shape createStrokedShape(Shape llllllllllllIlllIlllIlllIlIIllIl) {
            final GeneralPath llllllllllllIlllIlllIlllIllIIIlI = new GeneralPath();
            llllllllllllIlllIlllIlllIlIIllIl = (String)new BasicStroke(OutlineWobbleEffect.this.getWidth(), WobbleStroke.llIIIIIllIlIll[0], OutlineWobbleEffect.this.getJoin()).createStrokedShape((Shape)llllllllllllIlllIlllIlllIlIIllIl);
            final PathIterator llllllllllllIlllIlllIlllIllIIIII = new FlatteningPathIterator(((Shape)llllllllllllIlllIlllIlllIlIIllIl).getPathIterator(null), 1.0);
            final float[] llllllllllllIlllIlllIlllIlIllllI = new float[WobbleStroke.llIIIIIllIlIll[1]];
            float llllllllllllIlllIlllIlllIlIllIll = 0.0f;
            float llllllllllllIlllIlllIlllIlIllIIl = 0.0f;
            float llllllllllllIlllIlllIlllIlIlIlll = 0.0f;
            float llllllllllllIlllIlllIlllIlIlIllI = 0.0f;
            float llllllllllllIlllIlllIlllIlIlIlII = 0.0f;
            float llllllllllllIlllIlllIlllIlIlIIlI = 0.0f;
            int llllllllllllIlllIlllIlllIlIlIIII = WobbleStroke.llIIIIIllIlIll[2];
            float llllllllllllIlllIlllIlllIlIIllll = 0.0f;
            while (lIIIIlllIlIllIll(llllllllllllIlllIlllIlllIllIIIII.isDone() ? 1 : 0)) {
                llllllllllllIlllIlllIlllIlIlIIII = llllllllllllIlllIlllIlllIllIIIII.currentSegment(llllllllllllIlllIlllIlllIlIllllI);
                switch (llllllllllllIlllIlllIlllIlIlIIII) {
                    case 0: {
                        llllllllllllIlllIlllIlllIlIlIlll = (llllllllllllIlllIlllIlllIlIllIll = this.randomize(llllllllllllIlllIlllIlllIlIllllI[WobbleStroke.llIIIIIllIlIll[2]]));
                        llllllllllllIlllIlllIlllIlIlIllI = (llllllllllllIlllIlllIlllIlIllIIl = this.randomize(llllllllllllIlllIlllIlllIlIllllI[WobbleStroke.llIIIIIllIlIll[3]]));
                        llllllllllllIlllIlllIlllIllIIIlI.moveTo(llllllllllllIlllIlllIlllIlIllIll, llllllllllllIlllIlllIlllIlIllIIl);
                        llllllllllllIlllIlllIlllIlIIllll = 0.0f;
                        "".length();
                        if (" ".length() == -" ".length()) {
                            return null;
                        }
                        break;
                    }
                    case 4: {
                        llllllllllllIlllIlllIlllIlIllllI[WobbleStroke.llIIIIIllIlIll[2]] = llllllllllllIlllIlllIlllIlIllIll;
                        llllllllllllIlllIlllIlllIlIllllI[WobbleStroke.llIIIIIllIlIll[3]] = llllllllllllIlllIlllIlllIlIllIIl;
                    }
                    case 1: {
                        llllllllllllIlllIlllIlllIlIlIlII = this.randomize(llllllllllllIlllIlllIlllIlIllllI[WobbleStroke.llIIIIIllIlIll[2]]);
                        llllllllllllIlllIlllIlllIlIlIIlI = this.randomize(llllllllllllIlllIlllIlllIlIllllI[WobbleStroke.llIIIIIllIlIll[3]]);
                        final float llllllllllllIlllIlllIlllIllIlIlI = llllllllllllIlllIlllIlllIlIlIlII - llllllllllllIlllIlllIlllIlIlIlll;
                        final float llllllllllllIlllIlllIlllIllIlIIl = llllllllllllIlllIlllIlllIlIlIIlI - llllllllllllIlllIlllIlllIlIlIllI;
                        final float llllllllllllIlllIlllIlllIllIIlll = (float)Math.sqrt(llllllllllllIlllIlllIlllIllIlIlI * llllllllllllIlllIlllIlllIllIlIlI + llllllllllllIlllIlllIlllIllIlIIl * llllllllllllIlllIlllIlllIllIlIIl);
                        if (lIIIIlllIlIlllIl(lIIIIlllIlIllIlI(llllllllllllIlllIlllIlllIllIIlll, llllllllllllIlllIlllIlllIlIIllll))) {
                            final float llllllllllllIlllIlllIlllIllIlIll = 1.0f / llllllllllllIlllIlllIlllIllIIlll;
                            while (lIIIIlllIlIlllIl(lIIIIlllIlIllIlI(llllllllllllIlllIlllIlllIllIIlll, llllllllllllIlllIlllIlllIlIIllll))) {
                                final float llllllllllllIlllIlllIlllIllIllIl = llllllllllllIlllIlllIlllIlIlIlll + llllllllllllIlllIlllIlllIlIIllll * llllllllllllIlllIlllIlllIllIlIlI * llllllllllllIlllIlllIlllIllIlIll;
                                final float llllllllllllIlllIlllIlllIllIllII = llllllllllllIlllIlllIlllIlIlIllI + llllllllllllIlllIlllIlllIlIIllll * llllllllllllIlllIlllIlllIllIlIIl * llllllllllllIlllIlllIlllIllIlIll;
                                llllllllllllIlllIlllIlllIllIIIlI.lineTo(this.randomize(llllllllllllIlllIlllIlllIllIllIl), this.randomize(llllllllllllIlllIlllIlllIllIllII));
                                llllllllllllIlllIlllIlllIlIIllll += OutlineWobbleEffect.this.detail;
                                "".length();
                                if ((148 + 6 - 44 + 46 ^ 98 + 20 - 24 + 58) < " ".length()) {
                                    return null;
                                }
                            }
                        }
                        llllllllllllIlllIlllIlllIlIIllll -= llllllllllllIlllIlllIlllIllIIlll;
                        llllllllllllIlllIlllIlllIlIlIlll = llllllllllllIlllIlllIlllIlIlIlII;
                        llllllllllllIlllIlllIlllIlIlIllI = llllllllllllIlllIlllIlllIlIlIIlI;
                        break;
                    }
                }
                llllllllllllIlllIlllIlllIllIIIII.next();
                "".length();
                if ("  ".length() > "   ".length()) {
                    return null;
                }
            }
            return llllllllllllIlllIlllIlllIllIIIlI;
        }
        
        static {
            lIIIIlllIlIllIIl();
        }
        
        private static boolean lIIIIlllIlIllIll(final int llllllllllllIlllIlllIlllIIlIIlII) {
            return llllllllllllIlllIlllIlllIIlIIlII == 0;
        }
        
        private float randomize(final float llllllllllllIlllIlllIlllIIlIllll) {
            return llllllllllllIlllIlllIlllIIlIllll + (float)Math.random() * OutlineWobbleEffect.this.amplitude * 2.0f - 1.0f;
        }
    }
}
