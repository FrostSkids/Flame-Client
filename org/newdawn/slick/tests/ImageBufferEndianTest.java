// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import java.util.Arrays;
import org.newdawn.slick.Graphics;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.SlickException;
import java.nio.ByteOrder;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Color;
import org.newdawn.slick.Image;
import org.newdawn.slick.ImageBuffer;
import org.newdawn.slick.BasicGame;

public class ImageBufferEndianTest extends BasicGame
{
    private /* synthetic */ ImageBuffer redImageBuffer;
    private /* synthetic */ String endian;
    private static final /* synthetic */ int[] lIlIlIIlIlIlll;
    private /* synthetic */ Image fromRed;
    private /* synthetic */ ImageBuffer blueImageBuffer;
    private static final /* synthetic */ String[] lIlIlIIlIIIIlI;
    private /* synthetic */ Image fromBlue;
    
    private static void lllIllIIIllllIl() {
        (lIlIlIIlIlIlll = new int[12])[0] = ((88 + 20 - 14 + 71 ^ 165 + 101 - 249 + 155) & (0xA1 ^ 0x9D ^ (0x50 ^ 0x65) ^ -" ".length()));
        ImageBufferEndianTest.lIlIlIIlIlIlll[1] = (-(0xFFFFF5F0 & 0x6A1F) & (0xFFFFE72F & 0x7BFF));
        ImageBufferEndianTest.lIlIlIIlIlIlll[2] = (-(0xFFFFBDF5 & 0x73AE) & (0xFFFFF7FB & 0x3BFF));
        ImageBufferEndianTest.lIlIlIIlIlIlll[3] = " ".length();
        ImageBufferEndianTest.lIlIlIIlIlIlll[4] = "  ".length();
        ImageBufferEndianTest.lIlIlIIlIlIlll[5] = "   ".length();
        ImageBufferEndianTest.lIlIlIIlIlIlll[6] = (0x4 ^ 0x4F ^ (0x22 ^ 0x6D));
        ImageBufferEndianTest.lIlIlIIlIlIlll[7] = (0x58 ^ 0x5D);
        ImageBufferEndianTest.lIlIlIIlIlIlll[8] = (13 + 105 - 54 + 105 ^ 129 + 89 - 147 + 104);
        ImageBufferEndianTest.lIlIlIIlIlIlll[9] = (0x76 ^ 0x12);
        ImageBufferEndianTest.lIlIlIIlIlIlll[10] = (0xE ^ 0x9);
        ImageBufferEndianTest.lIlIlIIlIlIlll[11] = (0x59 ^ 0x51);
    }
    
    private void fillImageBufferWithColor(final ImageBuffer lllllllllllllIIIlIlIIIlIIIllllIl, final Color lllllllllllllIIIlIlIIIlIIlIIIIII, final int lllllllllllllIIIlIlIIIlIIIlllIll, final int lllllllllllllIIIlIlIIIlIIIlllIlI) {
        int lllllllllllllIIIlIlIIIlIIlIIIIll = ImageBufferEndianTest.lIlIlIIlIlIlll[0];
        while (lllIllIIIllllll(lllllllllllllIIIlIlIIIlIIlIIIIll, lllllllllllllIIIlIlIIIlIIIlllIll)) {
            int lllllllllllllIIIlIlIIIlIIlIIIlII = ImageBufferEndianTest.lIlIlIIlIlIlll[0];
            while (lllIllIIIllllll(lllllllllllllIIIlIlIIIlIIlIIIlII, lllllllllllllIIIlIlIIIlIIIlllIlI)) {
                lllllllllllllIIIlIlIIIlIIIllllIl.setRGBA(lllllllllllllIIIlIlIIIlIIlIIIIll, lllllllllllllIIIlIlIIIlIIlIIIlII, lllllllllllllIIIlIlIIIlIIlIIIIII.getRed(), lllllllllllllIIIlIlIIIlIIlIIIIII.getGreen(), lllllllllllllIIIlIlIIIlIIlIIIIII.getBlue(), lllllllllllllIIIlIlIIIlIIlIIIIII.getAlpha());
                ++lllllllllllllIIIlIlIIIlIIlIIIlII;
                "".length();
                if ((187 + 61 - 221 + 170 ^ 101 + 31 - 72 + 133) <= -" ".length()) {
                    return;
                }
            }
            ++lllllllllllllIIIlIlIIIlIIlIIIIll;
            "".length();
            if ("   ".length() == 0) {
                return;
            }
        }
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIIIlIlIIIlIIlIIllII) throws SlickException {
        if (lllIllIIIlllllI(ByteOrder.nativeOrder(), ByteOrder.BIG_ENDIAN)) {
            this.endian = ImageBufferEndianTest.lIlIlIIlIIIIlI[ImageBufferEndianTest.lIlIlIIlIlIlll[6]];
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        else if (lllIllIIIlllllI(ByteOrder.nativeOrder(), ByteOrder.LITTLE_ENDIAN)) {
            this.endian = ImageBufferEndianTest.lIlIlIIlIIIIlI[ImageBufferEndianTest.lIlIlIIlIlIlll[7]];
            "".length();
            if (-(0x5F ^ 0x6F ^ (0x83 ^ 0xB7)) > 0) {
                return;
            }
        }
        else {
            this.endian = ImageBufferEndianTest.lIlIlIIlIIIIlI[ImageBufferEndianTest.lIlIlIIlIlIlll[8]];
        }
        this.redImageBuffer = new ImageBuffer(ImageBufferEndianTest.lIlIlIIlIlIlll[9], ImageBufferEndianTest.lIlIlIIlIlIlll[9]);
        this.fillImageBufferWithColor(this.redImageBuffer, Color.red, ImageBufferEndianTest.lIlIlIIlIlIlll[9], ImageBufferEndianTest.lIlIlIIlIlIlll[9]);
        this.blueImageBuffer = new ImageBuffer(ImageBufferEndianTest.lIlIlIIlIlIlll[9], ImageBufferEndianTest.lIlIlIIlIlIlll[9]);
        this.fillImageBufferWithColor(this.blueImageBuffer, Color.blue, ImageBufferEndianTest.lIlIlIIlIlIlll[9], ImageBufferEndianTest.lIlIlIIlIlIlll[9]);
        this.fromRed = this.redImageBuffer.getImage();
        this.fromBlue = this.blueImageBuffer.getImage();
    }
    
    private static boolean lllIllIIIlllllI(final Object lllllllllllllIIIlIlIIIIlllllllII, final Object lllllllllllllIIIlIlIIIIllllllIll) {
        return lllllllllllllIIIlIlIIIIlllllllII == lllllllllllllIIIlIlIIIIllllllIll;
    }
    
    private static String lllIllIIIIIIIll(final String lllllllllllllIIIlIlIIIlIIIlIllIl, final String lllllllllllllIIIlIlIIIlIIIlIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlIIIlIIIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlIIIlIIIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIlIIIlIIIlIllll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIlIIIlIIIlIllll.init(ImageBufferEndianTest.lIlIlIIlIlIlll[4], lllllllllllllIIIlIlIIIlIIIllIIII);
            return new String(lllllllllllllIIIlIlIIIlIIIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlIIIlIIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlIIIlIIIlIlllI) {
            lllllllllllllIIIlIlIIIlIIIlIlllI.printStackTrace();
            return null;
        }
    }
    
    public ImageBufferEndianTest() {
        super(ImageBufferEndianTest.lIlIlIIlIIIIlI[ImageBufferEndianTest.lIlIlIIlIlIlll[0]]);
    }
    
    public void render(final GameContainer lllllllllllllIIIlIlIIIlIIlIlIIlI, final Graphics lllllllllllllIIIlIlIIIlIIlIlIIIl) throws SlickException {
        lllllllllllllIIIlIlIIIlIIlIlIIIl.setColor(Color.white);
        lllllllllllllIIIlIlIIIlIIlIlIIIl.drawString(String.valueOf(new StringBuilder().append(ImageBufferEndianTest.lIlIlIIlIIIIlI[ImageBufferEndianTest.lIlIlIIlIlIlll[3]]).append(this.endian)), 10.0f, 100.0f);
        lllllllllllllIIIlIlIIIlIIlIlIIIl.drawString(ImageBufferEndianTest.lIlIlIIlIIIIlI[ImageBufferEndianTest.lIlIlIIlIlIlll[4]], 10.0f, 200.0f);
        lllllllllllllIIIlIlIIIlIIlIlIIIl.drawImage(this.fromRed, 10.0f, 220.0f);
        lllllllllllllIIIlIlIIIlIIlIlIIIl.drawString(ImageBufferEndianTest.lIlIlIIlIIIIlI[ImageBufferEndianTest.lIlIlIIlIlIlll[5]], 410.0f, 200.0f);
        lllllllllllllIIIlIlIIIlIIlIlIIIl.drawImage(this.fromBlue, 410.0f, 220.0f);
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIIIlIlIIIlIIIllIllI, final int lllllllllllllIIIlIlIIIlIIIllIlIl) throws SlickException {
    }
    
    private static String lllIllIIIIIllll(String lllllllllllllIIIlIlIIIlIIIIIlIll, final String lllllllllllllIIIlIlIIIlIIIIIlIlI) {
        lllllllllllllIIIlIlIIIlIIIIIlIll = (byte)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlIlIIIlIIIIIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIlIIIlIIIIIlllI = new StringBuilder();
        final char[] lllllllllllllIIIlIlIIIlIIIIIllIl = lllllllllllllIIIlIlIIIlIIIIIlIlI.toCharArray();
        int lllllllllllllIIIlIlIIIlIIIIIllII = ImageBufferEndianTest.lIlIlIIlIlIlll[0];
        final double lllllllllllllIIIlIlIIIlIIIIIIllI = (Object)((String)lllllllllllllIIIlIlIIIlIIIIIlIll).toCharArray();
        final Exception lllllllllllllIIIlIlIIIlIIIIIIlIl = (Exception)lllllllllllllIIIlIlIIIlIIIIIIllI.length;
        double lllllllllllllIIIlIlIIIlIIIIIIlII = ImageBufferEndianTest.lIlIlIIlIlIlll[0];
        while (lllIllIIIllllll((int)lllllllllllllIIIlIlIIIlIIIIIIlII, (int)lllllllllllllIIIlIlIIIlIIIIIIlIl)) {
            final char lllllllllllllIIIlIlIIIlIIIIlIIIl = lllllllllllllIIIlIlIIIlIIIIIIllI[lllllllllllllIIIlIlIIIlIIIIIIlII];
            lllllllllllllIIIlIlIIIlIIIIIlllI.append((char)(lllllllllllllIIIlIlIIIlIIIIlIIIl ^ lllllllllllllIIIlIlIIIlIIIIIllIl[lllllllllllllIIIlIlIIIlIIIIIllII % lllllllllllllIIIlIlIIIlIIIIIllIl.length]));
            "".length();
            ++lllllllllllllIIIlIlIIIlIIIIIllII;
            ++lllllllllllllIIIlIlIIIlIIIIIIlII;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIlIIIlIIIIIlllI);
    }
    
    private static void lllIllIIIIlIIII() {
        (lIlIlIIlIIIIlI = new String[ImageBufferEndianTest.lIlIlIIlIlIlll[10]])[ImageBufferEndianTest.lIlIlIIlIlIlll[0]] = lllIllIIIIIIIll("h6awrTRrYjZH0PJsbUs8Va2q9jVw24XV", "yVxIx");
        ImageBufferEndianTest.lIlIlIIlIIIIlI[ImageBufferEndianTest.lIlIlIIlIlIlll[3]] = lllIllIIIIIIlII("rv3ngC6my9fRd7zGjLdlIQ==", "kwMsx");
        ImageBufferEndianTest.lIlIlIIlIIIIlI[ImageBufferEndianTest.lIlIlIIlIlIlll[4]] = lllIllIIIIIIIll("ahSCRMp77+t9zJ/qCYQCs4/+RT6MRDh1h2lid+lagL4=", "vsMCw");
        ImageBufferEndianTest.lIlIlIIlIIIIlI[ImageBufferEndianTest.lIlIlIIlIlIlll[5]] = lllIllIIIIIIIll("LO5ac83+/BDTuDvOtD0SCgnhxyOLoMVbUymTEYz53UQ=", "IBAAv");
        ImageBufferEndianTest.lIlIlIIlIIIIlI[ImageBufferEndianTest.lIlIlIIlIlIlll[6]] = lllIllIIIIIIIll("ASjoFMjyUDLZplDSHbMsgA==", "TiBNc");
        ImageBufferEndianTest.lIlIlIIlIIIIlI[ImageBufferEndianTest.lIlIlIIlIlIlll[7]] = lllIllIIIIIIlII("t3eb5+ng9q1d1Dp2lugSMA==", "PtuUP");
        ImageBufferEndianTest.lIlIlIIlIIIIlI[ImageBufferEndianTest.lIlIlIIlIlIlll[8]] = lllIllIIIIIllll("BRxXMQkOEg==", "kswXm");
    }
    
    private static boolean lllIllIIIllllll(final int lllllllllllllIIIlIlIIIlIIIIIIIII, final int lllllllllllllIIIlIlIIIIlllllllll) {
        return lllllllllllllIIIlIlIIIlIIIIIIIII < lllllllllllllIIIlIlIIIIlllllllll;
    }
    
    private static String lllIllIIIIIIlII(final String lllllllllllllIIIlIlIIIlIIIIllllI, final String lllllllllllllIIIlIlIIIlIIIIlllIl) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlIIIlIIIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlIIIlIIIIlllIl.getBytes(StandardCharsets.UTF_8)), ImageBufferEndianTest.lIlIlIIlIlIlll[11]), "DES");
            final Cipher lllllllllllllIIIlIlIIIlIIIlIIIlI = Cipher.getInstance("DES");
            lllllllllllllIIIlIlIIIlIIIlIIIlI.init(ImageBufferEndianTest.lIlIlIIlIlIlll[4], lllllllllllllIIIlIlIIIlIIIlIIIll);
            return new String(lllllllllllllIIIlIlIIIlIIIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlIIIlIIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlIIIlIIIlIIIIl) {
            lllllllllllllIIIlIlIIIlIIIlIIIIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lllIllIIIllllIl();
        lllIllIIIIlIIII();
    }
    
    public static void main(final String[] lllllllllllllIIIlIlIIIlIIlIlIlll) {
        try {
            final AppGameContainer lllllllllllllIIIlIlIIIlIIlIllIIl = new AppGameContainer(new ImageBufferEndianTest());
            lllllllllllllIIIlIlIIIlIIlIllIIl.setDisplayMode(ImageBufferEndianTest.lIlIlIIlIlIlll[1], ImageBufferEndianTest.lIlIlIIlIlIlll[2], (boolean)(ImageBufferEndianTest.lIlIlIIlIlIlll[0] != 0));
            lllllllllllllIIIlIlIIIlIIlIllIIl.start();
            "".length();
            if (" ".length() == ((0x9 ^ 0x40) & ~(0xCE ^ 0x87))) {
                return;
            }
        }
        catch (SlickException lllllllllllllIIIlIlIIIlIIlIllIII) {
            lllllllllllllIIIlIlIIIlIIlIllIII.printStackTrace();
        }
    }
}
