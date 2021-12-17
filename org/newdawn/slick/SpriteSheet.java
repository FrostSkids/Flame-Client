// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick;

import java.io.IOException;
import java.net.URL;
import java.io.InputStream;
import org.newdawn.slick.opengl.Texture;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class SpriteSheet extends Image
{
    private /* synthetic */ int th;
    private /* synthetic */ int spacing;
    private /* synthetic */ Image target;
    private static final /* synthetic */ int[] lIIlIIllllIlII;
    private /* synthetic */ Image[][] subImages;
    private static final /* synthetic */ String[] lIIlIIllllIIll;
    private /* synthetic */ int tw;
    private /* synthetic */ int margin;
    
    public SpriteSheet(final String lllllllllllllIIllIlIlIlllllIIIlI, final int lllllllllllllIIllIlIlIlllllIIIIl, final int lllllllllllllIIllIlIlIlllllIIIII, final Color lllllllllllllIIllIlIlIllllIlllll) throws SlickException {
        this(lllllllllllllIIllIlIlIlllllIIIlI, lllllllllllllIIllIlIlIlllllIIIIl, lllllllllllllIIllIlIlIlllllIIIII, lllllllllllllIIllIlIlIllllIlllll, SpriteSheet.lIIlIIllllIlII[0]);
    }
    
    private static String llIIlllIllIlllI(final String lllllllllllllIIllIlIlIllIllIIIII, final String lllllllllllllIIllIlIlIllIllIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIllIlIlIllIllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlIlIllIllIIIIl.getBytes(StandardCharsets.UTF_8)), SpriteSheet.lIIlIIllllIlII[8]), "DES");
            final Cipher lllllllllllllIIllIlIlIllIllIIlII = Cipher.getInstance("DES");
            lllllllllllllIIllIlIlIllIllIIlII.init(SpriteSheet.lIIlIIllllIlII[1], lllllllllllllIIllIlIlIllIllIIlIl);
            return new String(lllllllllllllIIllIlIlIllIllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlIlIllIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIlIlIllIllIIIll) {
            lllllllllllllIIllIlIlIllIllIIIll.printStackTrace();
            return null;
        }
    }
    
    private static void llIIlllIlllIIlI() {
        (lIIlIIllllIlII = new int[9])[0] = ((0xE1 ^ 0xAF ^ (0xB8 ^ 0xC4)) & (183 + 55 - 146 + 153 ^ 176 + 48 - 188 + 163 ^ -" ".length()));
        SpriteSheet.lIIlIIllllIlII[1] = "  ".length();
        SpriteSheet.lIIlIIllllIlII[2] = " ".length();
        SpriteSheet.lIIlIIllllIlII[3] = "   ".length();
        SpriteSheet.lIIlIIllllIlII[4] = (0xC ^ 0x57 ^ (0x6D ^ 0x32));
        SpriteSheet.lIIlIIllllIlII[5] = (0x46 ^ 0x3E ^ (0x7E ^ 0x3));
        SpriteSheet.lIIlIIllllIlII[6] = (0x3B ^ 0x3D);
        SpriteSheet.lIIlIIllllIlII[7] = (0x36 ^ 0x31);
        SpriteSheet.lIIlIIllllIlII[8] = (36 + 70 + 14 + 15 ^ 87 + 131 - 214 + 139);
    }
    
    @Override
    public void setTexture(final Texture lllllllllllllIIllIlIlIllIlllIlll) {
        if (llIIlllIllllIII(this.target, this)) {
            super.setTexture(lllllllllllllIIllIlIlIllIlllIlll);
            return;
        }
        this.target.setTexture(lllllllllllllIIllIlIlIllIlllIlll);
    }
    
    static {
        llIIlllIlllIIlI();
        llIIlllIlllIIIl();
    }
    
    private static boolean llIIlllIllllIII(final Object lllllllllllllIIllIlIlIllIIlllIII, final Object lllllllllllllIIllIlIlIllIIllIlll) {
        return lllllllllllllIIllIlIlIllIIlllIII == lllllllllllllIIllIlIlIllIIllIlll;
    }
    
    private static boolean llIIlllIlllIlll(final int lllllllllllllIIllIlIlIllIlIIIIlI, final int lllllllllllllIIllIlIlIllIlIIIIIl) {
        return lllllllllllllIIllIlIlIllIlIIIIlI >= lllllllllllllIIllIlIlIllIlIIIIIl;
    }
    
    private static boolean llIIlllIlllIIll(final Object lllllllllllllIIllIlIlIllIIlllIll) {
        return lllllllllllllIIllIlIlIllIIlllIll != null;
    }
    
    public SpriteSheet(final Image lllllllllllllIIllIlIllIIIIIIllII, final int lllllllllllllIIllIlIllIIIIIIIllI, final int lllllllllllllIIllIlIllIIIIIIlIlI, final int lllllllllllllIIllIlIllIIIIIIIlII) {
        this(lllllllllllllIIllIlIllIIIIIIllII, lllllllllllllIIllIlIllIIIIIIIllI, lllllllllllllIIllIlIllIIIIIIlIlI, lllllllllllllIIllIlIllIIIIIIIlII, SpriteSheet.lIIlIIllllIlII[0]);
    }
    
    public SpriteSheet(final String lllllllllllllIIllIlIlIllllIIIIIl, final InputStream lllllllllllllIIllIlIlIlllIlllIll, final int lllllllllllllIIllIlIlIlllIllllll, final int lllllllllllllIIllIlIlIlllIlllllI) throws SlickException {
        super(lllllllllllllIIllIlIlIlllIlllIll, lllllllllllllIIllIlIlIllllIIIIIl, (boolean)(SpriteSheet.lIIlIIllllIlII[0] != 0));
        this.margin = SpriteSheet.lIIlIIllllIlII[0];
        this.target = this;
        this.tw = lllllllllllllIIllIlIlIlllIllllll;
        this.th = lllllllllllllIIllIlIlIlllIlllllI;
    }
    
    private static String llIIlllIllIllIl(final String lllllllllllllIIllIlIlIllIllIllIl, final String lllllllllllllIIllIlIlIllIllIlllI) {
        try {
            final SecretKeySpec lllllllllllllIIllIlIlIllIlllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlIlIllIllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIlIlIllIlllIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIlIlIllIlllIIIl.init(SpriteSheet.lIIlIIllllIlII[1], lllllllllllllIIllIlIlIllIlllIIlI);
            return new String(lllllllllllllIIllIlIlIllIlllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlIlIllIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIlIlIllIlllIIII) {
            lllllllllllllIIllIlIlIllIlllIIII.printStackTrace();
            return null;
        }
    }
    
    private static String llIIlllIlllIIII(String lllllllllllllIIllIlIlIllIlIIllIl, final String lllllllllllllIIllIlIlIllIlIIllII) {
        lllllllllllllIIllIlIlIllIlIIllIl = new String(Base64.getDecoder().decode(lllllllllllllIIllIlIlIllIlIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIlIlIllIlIlIIII = new StringBuilder();
        final char[] lllllllllllllIIllIlIlIllIlIIllll = lllllllllllllIIllIlIlIllIlIIllII.toCharArray();
        int lllllllllllllIIllIlIlIllIlIIlllI = SpriteSheet.lIIlIIllllIlII[0];
        final Exception lllllllllllllIIllIlIlIllIlIIlIII = (Object)lllllllllllllIIllIlIlIllIlIIllIl.toCharArray();
        final String lllllllllllllIIllIlIlIllIlIIIlll = (String)lllllllllllllIIllIlIlIllIlIIlIII.length;
        long lllllllllllllIIllIlIlIllIlIIIllI = SpriteSheet.lIIlIIllllIlII[0];
        while (llIIlllIlllIlIl((int)lllllllllllllIIllIlIlIllIlIIIllI, (int)lllllllllllllIIllIlIlIllIlIIIlll)) {
            final char lllllllllllllIIllIlIlIllIlIlIIll = lllllllllllllIIllIlIlIllIlIIlIII[lllllllllllllIIllIlIlIllIlIIIllI];
            lllllllllllllIIllIlIlIllIlIlIIII.append((char)(lllllllllllllIIllIlIlIllIlIlIIll ^ lllllllllllllIIllIlIlIllIlIIllll[lllllllllllllIIllIlIlIllIlIIlllI % lllllllllllllIIllIlIlIllIlIIllll.length]));
            "".length();
            ++lllllllllllllIIllIlIlIllIlIIlllI;
            ++lllllllllllllIIllIlIlIllIlIIIllI;
            "".length();
            if (-" ".length() == " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIlIlIllIlIlIIII);
    }
    
    public int getHorizontalCount() {
        this.target.init();
        this.initImpl();
        return this.subImages.length;
    }
    
    public Image getSprite(final int lllllllllllllIIllIlIlIlllIIllIIl, final int lllllllllllllIIllIlIlIlllIIllIll) {
        this.target.init();
        this.initImpl();
        if (!llIIlllIlllIllI(lllllllllllllIIllIlIlIlllIIllIIl) || llIIlllIlllIlll(lllllllllllllIIllIlIlIlllIIllIIl, this.subImages.length)) {
            throw new RuntimeException(String.valueOf(new StringBuilder().append(SpriteSheet.lIIlIIllllIIll[SpriteSheet.lIIlIIllllIlII[4]]).append(lllllllllllllIIllIlIlIlllIIllIIl).append(SpriteSheet.lIIlIIllllIIll[SpriteSheet.lIIlIIllllIlII[5]]).append(lllllllllllllIIllIlIlIlllIIllIll)));
        }
        if (!llIIlllIlllIllI(lllllllllllllIIllIlIlIlllIIllIll) || llIIlllIlllIlll(lllllllllllllIIllIlIlIlllIIllIll, this.subImages[SpriteSheet.lIIlIIllllIlII[0]].length)) {
            throw new RuntimeException(String.valueOf(new StringBuilder().append(SpriteSheet.lIIlIIllllIIll[SpriteSheet.lIIlIIllllIlII[6]]).append(lllllllllllllIIllIlIlIlllIIllIIl).append(SpriteSheet.lIIlIIllllIIll[SpriteSheet.lIIlIIllllIlII[7]]).append(lllllllllllllIIllIlIlIlllIIllIll)));
        }
        return this.target.getSubImage(lllllllllllllIIllIlIlIlllIIllIIl * (this.tw + this.spacing) + this.margin, lllllllllllllIIllIlIlIlllIIllIll * (this.th + this.spacing) + this.margin, this.tw, this.th);
    }
    
    public SpriteSheet(final Image lllllllllllllIIllIlIllIIIIIlllIl, final int lllllllllllllIIllIlIllIIIIIlllII, final int lllllllllllllIIllIlIllIIIIIllIll, final int lllllllllllllIIllIlIllIIIIIllIlI, final int lllllllllllllIIllIlIllIIIIIlIIll) {
        super(lllllllllllllIIllIlIllIIIIIlllIl);
        this.margin = SpriteSheet.lIIlIIllllIlII[0];
        this.target = lllllllllllllIIllIlIllIIIIIlllIl;
        this.tw = lllllllllllllIIllIlIllIIIIIlllII;
        this.th = lllllllllllllIIllIlIllIIIIIllIll;
        this.spacing = lllllllllllllIIllIlIllIIIIIllIlI;
        this.margin = lllllllllllllIIllIlIllIIIIIlIIll;
        this.initImpl();
    }
    
    private static boolean llIIlllIlllIlIl(final int lllllllllllllIIllIlIlIllIIlllllI, final int lllllllllllllIIllIlIlIllIIllllIl) {
        return lllllllllllllIIllIlIlIllIIlllllI < lllllllllllllIIllIlIlIllIIllllIl;
    }
    
    @Override
    protected void initImpl() {
        if (llIIlllIlllIIll(this.subImages)) {
            return;
        }
        final int lllllllllllllIIllIlIlIlllIllIIII = (this.getWidth() - this.margin * SpriteSheet.lIIlIIllllIlII[1] - this.tw) / (this.tw + this.spacing) + SpriteSheet.lIIlIIllllIlII[2];
        int lllllllllllllIIllIlIlIlllIlIllll = (this.getHeight() - this.margin * SpriteSheet.lIIlIIllllIlII[1] - this.th) / (this.th + this.spacing) + SpriteSheet.lIIlIIllllIlII[2];
        if (llIIlllIlllIlII((this.getHeight() - this.th) % (this.th + this.spacing))) {
            ++lllllllllllllIIllIlIlIlllIlIllll;
        }
        this.subImages = new Image[lllllllllllllIIllIlIlIlllIllIIII][lllllllllllllIIllIlIlIlllIlIllll];
        int lllllllllllllIIllIlIlIlllIllIIlI = SpriteSheet.lIIlIIllllIlII[0];
        while (llIIlllIlllIlIl(lllllllllllllIIllIlIlIlllIllIIlI, lllllllllllllIIllIlIlIlllIllIIII)) {
            int lllllllllllllIIllIlIlIlllIllIIll = SpriteSheet.lIIlIIllllIlII[0];
            while (llIIlllIlllIlIl(lllllllllllllIIllIlIlIlllIllIIll, lllllllllllllIIllIlIlIlllIlIllll)) {
                this.subImages[lllllllllllllIIllIlIlIlllIllIIlI][lllllllllllllIIllIlIlIlllIllIIll] = this.getSprite(lllllllllllllIIllIlIlIlllIllIIlI, lllllllllllllIIllIlIlIlllIllIIll);
                ++lllllllllllllIIllIlIlIlllIllIIll;
                "".length();
                if ("   ".length() <= ((0x19 ^ 0x1F) & ~(0x98 ^ 0x9E))) {
                    return;
                }
            }
            ++lllllllllllllIIllIlIlIlllIllIIlI;
            "".length();
            if ((0x39 ^ 0x3C) <= 0) {
                return;
            }
        }
    }
    
    public void renderInUse(final int lllllllllllllIIllIlIlIlllIIIlIll, final int lllllllllllllIIllIlIlIlllIIIlIlI, final int lllllllllllllIIllIlIlIlllIIIIlII, final int lllllllllllllIIllIlIlIlllIIIlIII) {
        this.subImages[lllllllllllllIIllIlIlIlllIIIIlII][lllllllllllllIIllIlIlIlllIIIlIII].drawEmbedded((float)lllllllllllllIIllIlIlIlllIIIlIll, (float)lllllllllllllIIllIlIlIlllIIIlIlI, (float)this.tw, (float)this.th);
    }
    
    private static boolean llIIlllIlllIlII(final int lllllllllllllIIllIlIlIllIIllIlIl) {
        return lllllllllllllIIllIlIlIllIIllIlIl != 0;
    }
    
    private static void llIIlllIlllIIIl() {
        (lIIlIIllllIIll = new String[SpriteSheet.lIIlIIllllIlII[8]])[SpriteSheet.lIIlIIllllIlII[0]] = llIIlllIllIllIl("fMzRby67TZdmLY/cPPLAUhvPMNTSFritxDD94KYIcts=", "ZEdWf");
        SpriteSheet.lIIlIIllllIIll[SpriteSheet.lIIlIIllllIlII[2]] = llIIlllIllIlllI("Kna8LngPZv0=", "jzXcH");
        SpriteSheet.lIIlIIllllIIll[SpriteSheet.lIIlIIllllIlII[1]] = llIIlllIllIllIl("PM0YqRJkiAz4QAv8fgnfwby29y4t6BPf2BBZNzWA+uo=", "YdLtn");
        SpriteSheet.lIIlIIllllIIll[SpriteSheet.lIIlIIllllIlII[3]] = llIIlllIlllIIII("fw==", "SKZhC");
        SpriteSheet.lIIlIIllllIIll[SpriteSheet.lIIlIIllllIlII[4]] = llIIlllIlllIIII("PCQKKywONg1CLholSA0nTyIAByQbcQoNNAE1G1hh", "oQhbA");
        SpriteSheet.lIIlIIllllIIll[SpriteSheet.lIIlIIllllIlII[5]] = llIIlllIllIllIl("kSCU6iIkB4k=", "eZTZO");
        SpriteSheet.lIIlIIllllIIll[SpriteSheet.lIIlIIllllIlII[6]] = llIIlllIlllIIII("HycEPTQtNQNUNjkmRhs/bCEOETw4cgQbLCI2FU55", "LRftY");
        SpriteSheet.lIIlIIllllIIll[SpriteSheet.lIIlIIllllIlII[7]] = llIIlllIllIlllI("cOpStjRlPIM=", "TrYea");
    }
    
    @Override
    public void endUse() {
        if (llIIlllIllllIII(this.target, this)) {
            super.endUse();
            return;
        }
        this.target.endUse();
    }
    
    private static boolean llIIlllIlllIllI(final int lllllllllllllIIllIlIlIllIIllIIll) {
        return lllllllllllllIIllIlIlIllIIllIIll >= 0;
    }
    
    public Image getSubImage(final int lllllllllllllIIllIlIlIlllIlIIIlI, final int lllllllllllllIIllIlIlIlllIlIIlII) {
        this.init();
        if (!llIIlllIlllIllI(lllllllllllllIIllIlIlIlllIlIIIlI) || llIIlllIlllIlll(lllllllllllllIIllIlIlIlllIlIIIlI, this.subImages.length)) {
            throw new RuntimeException(String.valueOf(new StringBuilder().append(SpriteSheet.lIIlIIllllIIll[SpriteSheet.lIIlIIllllIlII[0]]).append(lllllllllllllIIllIlIlIlllIlIIIlI).append(SpriteSheet.lIIlIIllllIIll[SpriteSheet.lIIlIIllllIlII[2]]).append(lllllllllllllIIllIlIlIlllIlIIlII)));
        }
        if (!llIIlllIlllIllI(lllllllllllllIIllIlIlIlllIlIIlII) || llIIlllIlllIlll(lllllllllllllIIllIlIlIlllIlIIlII, this.subImages[SpriteSheet.lIIlIIllllIlII[0]].length)) {
            throw new RuntimeException(String.valueOf(new StringBuilder().append(SpriteSheet.lIIlIIllllIIll[SpriteSheet.lIIlIIllllIlII[1]]).append(lllllllllllllIIllIlIlIlllIlIIIlI).append(SpriteSheet.lIIlIIllllIIll[SpriteSheet.lIIlIIllllIlII[3]]).append(lllllllllllllIIllIlIlIlllIlIIlII)));
        }
        return this.subImages[lllllllllllllIIllIlIlIlllIlIIIlI][lllllllllllllIIllIlIlIlllIlIIlII];
    }
    
    public SpriteSheet(final String lllllllllllllIIllIlIlIllllIlIIlI, final int lllllllllllllIIllIlIlIllllIlIIIl, final int lllllllllllllIIllIlIlIllllIIlIlI, final Color lllllllllllllIIllIlIlIllllIIlIIl, final int lllllllllllllIIllIlIlIllllIIlIII) throws SlickException {
        super(lllllllllllllIIllIlIlIllllIlIIlI, (boolean)(SpriteSheet.lIIlIIllllIlII[0] != 0), SpriteSheet.lIIlIIllllIlII[1], lllllllllllllIIllIlIlIllllIIlIIl);
        this.margin = SpriteSheet.lIIlIIllllIlII[0];
        this.target = this;
        this.tw = lllllllllllllIIllIlIlIllllIlIIIl;
        this.th = lllllllllllllIIllIlIlIllllIIlIlI;
        this.spacing = lllllllllllllIIllIlIlIllllIIlIII;
    }
    
    public SpriteSheet(final URL lllllllllllllIIllIlIllIIIIllIlll, final int lllllllllllllIIllIlIllIIIIllIIlI, final int lllllllllllllIIllIlIllIIIIllIlIl) throws IOException, SlickException {
        this(new Image(lllllllllllllIIllIlIllIIIIllIlll.openStream(), lllllllllllllIIllIlIllIIIIllIlll.toString(), (boolean)(SpriteSheet.lIIlIIllllIlII[0] != 0)), lllllllllllllIIllIlIllIIIIllIIlI, lllllllllllllIIllIlIllIIIIllIlIl);
    }
    
    public int getVerticalCount() {
        this.target.init();
        this.initImpl();
        return this.subImages[SpriteSheet.lIIlIIllllIlII[0]].length;
    }
    
    public SpriteSheet(final Image lllllllllllllIIllIlIllIIIIlIlIll, final int lllllllllllllIIllIlIllIIIIlIlIlI, final int lllllllllllllIIllIlIllIIIIlIIlIl) {
        super(lllllllllllllIIllIlIllIIIIlIlIll);
        this.margin = SpriteSheet.lIIlIIllllIlII[0];
        this.target = lllllllllllllIIllIlIllIIIIlIlIll;
        this.tw = lllllllllllllIIllIlIllIIIIlIlIlI;
        this.th = lllllllllllllIIllIlIllIIIIlIIlIl;
        this.initImpl();
    }
    
    @Override
    public void startUse() {
        if (llIIlllIllllIII(this.target, this)) {
            super.startUse();
            return;
        }
        this.target.startUse();
    }
    
    public SpriteSheet(final String lllllllllllllIIllIlIlIlllllIllll, final int lllllllllllllIIllIlIlIlllllIlllI, final int lllllllllllllIIllIlIlIlllllIllIl) throws SlickException {
        this(lllllllllllllIIllIlIlIlllllIllll, lllllllllllllIIllIlIlIlllllIlllI, lllllllllllllIIllIlIlIlllllIllIl, null);
    }
    
    public SpriteSheet(final String lllllllllllllIIllIlIlIllllllllIl, final int lllllllllllllIIllIlIlIllllllIlll, final int lllllllllllllIIllIlIlIlllllllIll, final int lllllllllllllIIllIlIlIllllllIlIl) throws SlickException {
        this(lllllllllllllIIllIlIlIllllllllIl, lllllllllllllIIllIlIlIllllllIlll, lllllllllllllIIllIlIlIlllllllIll, null, lllllllllllllIIllIlIlIllllllIlIl);
    }
}
