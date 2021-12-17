// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick;

import org.lwjgl.BufferUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.opengl.ImageData;

public class ImageBuffer implements ImageData
{
    private /* synthetic */ int height;
    private /* synthetic */ int texHeight;
    private /* synthetic */ byte[] rawData;
    private static final /* synthetic */ String[] lIlIlIllIlIIlI;
    private /* synthetic */ int texWidth;
    private static final /* synthetic */ int[] lIlIlIlllIlllI;
    private /* synthetic */ int width;
    
    private static String lllIllllIlIIIII(final String lllllllllllllIIIIllllIllIlIlIlll, final String lllllllllllllIIIIllllIllIlIlIllI) {
        try {
            final SecretKeySpec lllllllllllllIIIIllllIllIlIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllllIllIlIlIllI.getBytes(StandardCharsets.UTF_8)), ImageBuffer.lIlIlIlllIlllI[6]), "DES");
            final Cipher lllllllllllllIIIIllllIllIlIllIll = Cipher.getInstance("DES");
            lllllllllllllIIIIllllIllIlIllIll.init(ImageBuffer.lIlIlIlllIlllI[4], lllllllllllllIIIIllllIllIlIlllII);
            return new String(lllllllllllllIIIIllllIllIlIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllllIllIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllllIllIlIllIlI) {
            lllllllllllllIIIIllllIllIlIllIlI.printStackTrace();
            return null;
        }
    }
    
    private static void lllIllllIlIIIll() {
        (lIlIlIllIlIIlI = new String[ImageBuffer.lIlIlIlllIlllI[5]])[ImageBuffer.lIlIlIlllIlllI[2]] = lllIllllIlIIIII("9N6Ul5PgsxZFZsksKxNKPeflf6G+K6X2", "fgBLe");
        ImageBuffer.lIlIlIllIlIIlI[ImageBuffer.lIlIlIlllIlllI[3]] = lllIllllIlIIIIl("+jXRdWFIZAs=", "NprwC");
        ImageBuffer.lIlIlIllIlIIlI[ImageBuffer.lIlIlIlllIlllI[4]] = lllIllllIlIIIIl("g1USnq/u/haVEflwXQgaRPLRjlNBHDSq", "TiHZW");
    }
    
    public int getTexWidth() {
        return this.texWidth;
    }
    
    private int get2Fold(final int lllllllllllllIIIIllllIllIllIIIlI) {
        int lllllllllllllIIIIllllIllIllIIIll = ImageBuffer.lIlIlIlllIlllI[4];
        while (lllIlllllIIllll(lllllllllllllIIIIllllIllIllIIIll, lllllllllllllIIIIllllIllIllIIIlI)) {
            lllllllllllllIIIIllllIllIllIIIll *= ImageBuffer.lIlIlIlllIlllI[4];
            "".length();
            if ((134 + 144 - 231 + 116 ^ 75 + 26 + 11 + 55) <= "   ".length()) {
                return (0x2B ^ 0x1A ^ (0x8E ^ 0x97)) & (90 + 7 + 56 + 83 ^ 64 + 53 - 30 + 109 ^ -" ".length());
            }
        }
        return lllllllllllllIIIIllllIllIllIIIll;
    }
    
    private static void lllIlllllIIllIl() {
        (lIlIlIlllIlllI = new int[7])[0] = (0x47 ^ 0x43);
        ImageBuffer.lIlIlIlllIlllI[1] = (55 + 16 - 58 + 167 ^ 68 + 122 - 106 + 64);
        ImageBuffer.lIlIlIlllIlllI[2] = ((0x5B ^ 0x0) & ~(0xF8 ^ 0xA3));
        ImageBuffer.lIlIlIlllIlllI[3] = " ".length();
        ImageBuffer.lIlIlIlllIlllI[4] = "  ".length();
        ImageBuffer.lIlIlIlllIlllI[5] = "   ".length();
        ImageBuffer.lIlIlIlllIlllI[6] = (0x13 ^ 0x1B);
    }
    
    private static boolean lllIlllllIlIIII(final int lllllllllllllIIIIllllIllIlIIIlII, final int lllllllllllllIIIIllllIllIlIIIIll) {
        return lllllllllllllIIIIllllIllIlIIIlII >= lllllllllllllIIIIllllIllIlIIIIll;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    private static boolean lllIlllllIIlllI(final int lllllllllllllIIIIllllIllIIlllIIl) {
        return lllllllllllllIIIIllllIllIIlllIIl >= 0;
    }
    
    static {
        lllIlllllIIllIl();
        lllIllllIlIIIll();
    }
    
    public void setRGBA(final int lllllllllllllIIIIllllIllIlllllll, final int lllllllllllllIIIIllllIllIlllIllI, final int lllllllllllllIIIIllllIllIlllIlIl, final int lllllllllllllIIIIllllIllIlllllII, final int lllllllllllllIIIIllllIllIlllIIll, final int lllllllllllllIIIIllllIllIllllIlI) {
        if (!lllIlllllIIlllI(lllllllllllllIIIIllllIllIlllllll) || !lllIlllllIIllll(lllllllllllllIIIIllllIllIlllllll, this.width) || !lllIlllllIIlllI(lllllllllllllIIIIllllIllIlllIllI) || lllIlllllIlIIII(lllllllllllllIIIIllllIllIlllIllI, this.height)) {
            throw new RuntimeException(String.valueOf(new StringBuilder().append(ImageBuffer.lIlIlIllIlIIlI[ImageBuffer.lIlIlIlllIlllI[2]]).append(lllllllllllllIIIIllllIllIlllllll).append(ImageBuffer.lIlIlIllIlIIlI[ImageBuffer.lIlIlIlllIlllI[3]]).append(lllllllllllllIIIIllllIllIlllIllI).append(ImageBuffer.lIlIlIllIlIIlI[ImageBuffer.lIlIlIlllIlllI[4]])));
        }
        final int lllllllllllllIIIIllllIllIllllIIl = (lllllllllllllIIIIllllIllIlllllll + lllllllllllllIIIIllllIllIlllIllI * this.texWidth) * ImageBuffer.lIlIlIlllIlllI[0];
        if (lllIlllllIlIIIl(ByteOrder.nativeOrder(), ByteOrder.BIG_ENDIAN)) {
            this.rawData[lllllllllllllIIIIllllIllIllllIIl] = (byte)lllllllllllllIIIIllllIllIlllIIll;
            this.rawData[lllllllllllllIIIIllllIllIllllIIl + ImageBuffer.lIlIlIlllIlllI[3]] = (byte)lllllllllllllIIIIllllIllIlllllII;
            this.rawData[lllllllllllllIIIIllllIllIllllIIl + ImageBuffer.lIlIlIlllIlllI[4]] = (byte)lllllllllllllIIIIllllIllIlllIlIl;
            this.rawData[lllllllllllllIIIIllllIllIllllIIl + ImageBuffer.lIlIlIlllIlllI[5]] = (byte)lllllllllllllIIIIllllIllIllllIlI;
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.rawData[lllllllllllllIIIIllllIllIllllIIl] = (byte)lllllllllllllIIIIllllIllIlllIlIl;
            this.rawData[lllllllllllllIIIIllllIllIllllIIl + ImageBuffer.lIlIlIlllIlllI[3]] = (byte)lllllllllllllIIIIllllIllIlllllII;
            this.rawData[lllllllllllllIIIIllllIllIllllIIl + ImageBuffer.lIlIlIlllIlllI[4]] = (byte)lllllllllllllIIIIllllIllIlllIIll;
            this.rawData[lllllllllllllIIIIllllIllIllllIIl + ImageBuffer.lIlIlIlllIlllI[5]] = (byte)lllllllllllllIIIIllllIllIllllIlI;
        }
    }
    
    public int getDepth() {
        return ImageBuffer.lIlIlIlllIlllI[1];
    }
    
    public Image getImage() {
        return new Image(this);
    }
    
    public byte[] getRGBA() {
        return this.rawData;
    }
    
    private static boolean lllIlllllIlIIIl(final Object lllllllllllllIIIIllllIllIIllllII, final Object lllllllllllllIIIIllllIllIIlllIll) {
        return lllllllllllllIIIIllllIllIIllllII == lllllllllllllIIIIllllIllIIlllIll;
    }
    
    public ImageBuffer(final int lllllllllllllIIIIllllIlllIlIIIll, final int lllllllllllllIIIIllllIlllIIlllll) {
        this.width = lllllllllllllIIIIllllIlllIlIIIll;
        this.height = lllllllllllllIIIIllllIlllIIlllll;
        this.texWidth = this.get2Fold(lllllllllllllIIIIllllIlllIlIIIll);
        this.texHeight = this.get2Fold(lllllllllllllIIIIllllIlllIIlllll);
        this.rawData = new byte[this.texWidth * this.texHeight * ImageBuffer.lIlIlIlllIlllI[0]];
    }
    
    public ByteBuffer getImageBufferData() {
        final ByteBuffer lllllllllllllIIIIllllIlllIIIlIll = BufferUtils.createByteBuffer(this.rawData.length);
        lllllllllllllIIIIllllIlllIIIlIll.put(this.rawData);
        "".length();
        lllllllllllllIIIIllllIlllIIIlIll.flip();
        "".length();
        return lllllllllllllIIIIllllIlllIIIlIll;
    }
    
    public int getWidth() {
        return this.width;
    }
    
    public int getTexHeight() {
        return this.texHeight;
    }
    
    public Image getImage(final int lllllllllllllIIIIllllIllIllIlIlI) {
        return new Image(this, lllllllllllllIIIIllllIllIllIlIlI);
    }
    
    private static String lllIllllIlIIIIl(final String lllllllllllllIIIIllllIllIlIIllII, final String lllllllllllllIIIIllllIllIlIIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIllllIllIlIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllllIllIlIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIllllIllIlIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIllllIllIlIIlllI.init(ImageBuffer.lIlIlIlllIlllI[4], lllllllllllllIIIIllllIllIlIIllll);
            return new String(lllllllllllllIIIIllllIllIlIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllllIllIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllllIllIlIIllIl) {
            lllllllllllllIIIIllllIllIlIIllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIlllllIIllll(final int lllllllllllllIIIIllllIllIlIIIIII, final int lllllllllllllIIIIllllIllIIllllll) {
        return lllllllllllllIIIIllllIllIlIIIIII < lllllllllllllIIIIllllIllIIllllll;
    }
}
