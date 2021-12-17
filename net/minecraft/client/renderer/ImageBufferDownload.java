// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import java.awt.Graphics;
import java.awt.image.DataBufferInt;
import java.awt.image.ImageObserver;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class ImageBufferDownload implements IImageBuffer
{
    private /* synthetic */ int imageHeight;
    private static final /* synthetic */ int[] lIIlIIllIlIlIl;
    private /* synthetic */ int[] imageData;
    private /* synthetic */ int imageWidth;
    
    private static boolean llIIlllIIIIIlIl(final Object lllllllllllllIIllIllIIlllllIIIIl) {
        return lllllllllllllIIllIllIIlllllIIIIl == null;
    }
    
    private void setAreaOpaque(final int lllllllllllllIIllIllIlIIIIIIllII, final int lllllllllllllIIllIllIlIIIIIlIIlI, final int lllllllllllllIIllIllIlIIIIIIlIlI, final int lllllllllllllIIllIllIlIIIIIIlIIl) {
        int lllllllllllllIIllIllIlIIIIIIllll = lllllllllllllIIllIllIlIIIIIIllII;
        "".length();
        if (null != null) {
            return;
        }
        while (!llIIlllIIIIlIII(lllllllllllllIIllIllIlIIIIIIllll, lllllllllllllIIllIllIlIIIIIIlIlI)) {
            int lllllllllllllIIllIllIlIIIIIIlllI = lllllllllllllIIllIllIlIIIIIlIIlI;
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
            while (!llIIlllIIIIlIII(lllllllllllllIIllIllIlIIIIIIlllI, lllllllllllllIIllIllIlIIIIIIlIIl)) {
                final int[] imageData = this.imageData;
                final int n = lllllllllllllIIllIllIlIIIIIIllll + lllllllllllllIIllIllIlIIIIIIlllI * this.imageWidth;
                imageData[n] |= ImageBufferDownload.lIIlIIllIlIlIl[18];
                ++lllllllllllllIIllIllIlIIIIIIlllI;
            }
            ++lllllllllllllIIllIllIlIIIIIIllll;
        }
    }
    
    private static void llIIlllIIIIIlII() {
        (lIIlIIllIlIlIl = new int[22])[0] = (0xCE ^ 0x8E);
        ImageBufferDownload.lIIlIIllIlIlIl[1] = "  ".length();
        ImageBufferDownload.lIIlIIllIlIlIl[2] = ((0x2B ^ 0x16) & ~(0x38 ^ 0x5));
        ImageBufferDownload.lIIlIIllIlIlIl[3] = (0xD ^ 0x3 ^ (0x1B ^ 0x35));
        ImageBufferDownload.lIIlIIllIlIlIl[4] = (0x16 ^ 0xE);
        ImageBufferDownload.lIIlIIllIlIlIl[5] = (5 + 121 - 114 + 117 ^ 131 + 147 - 227 + 126);
        ImageBufferDownload.lIIlIIllIlIlIl[6] = (0x20 ^ 0x5B ^ (0xE5 ^ 0x8A));
        ImageBufferDownload.lIIlIIllIlIlIl[7] = (0xA2 ^ 0x96);
        ImageBufferDownload.lIIlIIllIlIlIl[8] = (90 + 72 - 92 + 100 ^ 27 + 63 - 29 + 113);
        ImageBufferDownload.lIIlIIllIlIlIl[9] = (0x2A ^ 0x6F ^ (0x70 ^ 0x25));
        ImageBufferDownload.lIIlIIllIlIlIl[10] = (0x37 ^ 0x3F);
        ImageBufferDownload.lIIlIIllIlIlIl[11] = (0x5C ^ 0x8 ^ (0xE ^ 0x46));
        ImageBufferDownload.lIIlIIllIlIlIl[12] = (0x25 ^ 0x29);
        ImageBufferDownload.lIIlIIllIlIlIl[13] = (75 + 144 - 132 + 72 ^ 28 + 8 + 40 + 107);
        ImageBufferDownload.lIIlIIllIlIlIl[14] = (0x68 ^ 0x4C);
        ImageBufferDownload.lIIlIIllIlIlIl[15] = (0x81 ^ 0xAD);
        ImageBufferDownload.lIIlIIllIlIlIl[16] = (0xBC ^ 0x84);
        ImageBufferDownload.lIIlIIllIlIlIl[17] = (-" ".length() & (-1 & 0xFFFFFF));
        ImageBufferDownload.lIIlIIllIlIlIl[18] = -(-(0xFFFFF6B3 & 0x1F7F) & (0xFFFF9EFE & 0x1007733));
        ImageBufferDownload.lIIlIIllIlIlIl[19] = 45 + 249 - 278 + 239;
        ImageBufferDownload.lIIlIIllIlIlIl[20] = 81 + 126 - 107 + 28;
        ImageBufferDownload.lIIlIIllIlIlIl[21] = " ".length();
    }
    
    static {
        llIIlllIIIIIlII();
    }
    
    private static boolean llIIlllIIIIIllI(final int lllllllllllllIIllIllIIlllllIllII, final int lllllllllllllIIllIllIIlllllIlIll) {
        return lllllllllllllIIllIllIIlllllIllII == lllllllllllllIIllIllIIlllllIlIll;
    }
    
    private static boolean llIIlllIIIIlIII(final int lllllllllllllIIllIllIIlllllIlIII, final int lllllllllllllIIllIllIIlllllIIlll) {
        return lllllllllllllIIllIllIIlllllIlIII >= lllllllllllllIIllIllIIlllllIIlll;
    }
    
    private boolean hasTransparency(final int lllllllllllllIIllIllIIllllllIlIl, final int lllllllllllllIIllIllIIllllllllII, final int lllllllllllllIIllIllIIllllllIIll, final int lllllllllllllIIllIllIIlllllllIlI) {
        int lllllllllllllIIllIllIIlllllllIIl = lllllllllllllIIllIllIIllllllIlIl;
        "".length();
        if ("   ".length() <= ((0x3B ^ 0xF) & ~(0xE ^ 0x3A))) {
            return ((0x7B ^ 0x5E) & ~(0x6D ^ 0x48)) != 0x0;
        }
        while (!llIIlllIIIIlIII(lllllllllllllIIllIllIIlllllllIIl, lllllllllllllIIllIllIIllllllIIll)) {
            int lllllllllllllIIllIllIIlllllllIII = lllllllllllllIIllIllIIllllllllII;
            "".length();
            if (null != null) {
                return ((0x58 ^ 0x71 ^ (0x75 ^ 0x40)) & (92 + 4 + 21 + 42 ^ 80 + 69 - 56 + 38 ^ -" ".length())) != 0x0;
            }
            while (!llIIlllIIIIlIII(lllllllllllllIIllIllIIlllllllIII, lllllllllllllIIllIllIIlllllllIlI)) {
                final int lllllllllllllIIllIllIIllllllIlll = this.imageData[lllllllllllllIIllIllIIlllllllIIl + lllllllllllllIIllIllIIlllllllIII * this.imageWidth];
                if (llIIlllIIIIlIIl(lllllllllllllIIllIllIIllllllIlll >> ImageBufferDownload.lIIlIIllIlIlIl[4] & ImageBufferDownload.lIIlIIllIlIlIl[19], ImageBufferDownload.lIIlIIllIlIlIl[20])) {
                    return ImageBufferDownload.lIIlIIllIlIlIl[21] != 0;
                }
                ++lllllllllllllIIllIllIIlllllllIII;
            }
            ++lllllllllllllIIllIllIIlllllllIIl;
        }
        return ImageBufferDownload.lIIlIIllIlIlIl[2] != 0;
    }
    
    @Override
    public BufferedImage parseUserSkin(final BufferedImage lllllllllllllIIllIllIlIIIIllIlII) {
        if (llIIlllIIIIIlIl(lllllllllllllIIllIllIlIIIIllIlII)) {
            return null;
        }
        this.imageWidth = ImageBufferDownload.lIIlIIllIlIlIl[0];
        this.imageHeight = ImageBufferDownload.lIIlIIllIlIlIl[0];
        final BufferedImage lllllllllllllIIllIllIlIIIIllIlll = new BufferedImage(this.imageWidth, this.imageHeight, ImageBufferDownload.lIIlIIllIlIlIl[1]);
        final Graphics lllllllllllllIIllIllIlIIIIllIllI = lllllllllllllIIllIllIlIIIIllIlll.getGraphics();
        lllllllllllllIIllIllIlIIIIllIllI.drawImage(lllllllllllllIIllIllIlIIIIllIlII, ImageBufferDownload.lIIlIIllIlIlIl[2], ImageBufferDownload.lIIlIIllIlIlIl[2], null);
        "".length();
        if (llIIlllIIIIIllI(lllllllllllllIIllIllIlIIIIllIlII.getHeight(), ImageBufferDownload.lIIlIIllIlIlIl[3])) {
            lllllllllllllIIllIllIlIIIIllIllI.drawImage(lllllllllllllIIllIllIlIIIIllIlll, ImageBufferDownload.lIIlIIllIlIlIl[4], ImageBufferDownload.lIIlIIllIlIlIl[5], ImageBufferDownload.lIIlIIllIlIlIl[6], ImageBufferDownload.lIIlIIllIlIlIl[7], ImageBufferDownload.lIIlIIllIlIlIl[8], ImageBufferDownload.lIIlIIllIlIlIl[9], ImageBufferDownload.lIIlIIllIlIlIl[10], ImageBufferDownload.lIIlIIllIlIlIl[6], null);
            "".length();
            lllllllllllllIIllIllIlIIIIllIllI.drawImage(lllllllllllllIIllIllIlIIIIllIlll, ImageBufferDownload.lIIlIIllIlIlIl[11], ImageBufferDownload.lIIlIIllIlIlIl[5], ImageBufferDownload.lIIlIIllIlIlIl[4], ImageBufferDownload.lIIlIIllIlIlIl[7], ImageBufferDownload.lIIlIIllIlIlIl[10], ImageBufferDownload.lIIlIIllIlIlIl[9], ImageBufferDownload.lIIlIIllIlIlIl[12], ImageBufferDownload.lIIlIIllIlIlIl[6], null);
            "".length();
            lllllllllllllIIllIllIlIIIIllIllI.drawImage(lllllllllllllIIllIllIlIIIIllIlll, ImageBufferDownload.lIIlIIllIlIlIl[6], ImageBufferDownload.lIIlIIllIlIlIl[7], ImageBufferDownload.lIIlIIllIlIlIl[9], ImageBufferDownload.lIIlIIllIlIlIl[0], ImageBufferDownload.lIIlIIllIlIlIl[10], ImageBufferDownload.lIIlIIllIlIlIl[6], ImageBufferDownload.lIIlIIllIlIlIl[12], ImageBufferDownload.lIIlIIllIlIlIl[3], null);
            "".length();
            lllllllllllllIIllIllIlIIIIllIllI.drawImage(lllllllllllllIIllIllIlIIIIllIlll, ImageBufferDownload.lIIlIIllIlIlIl[4], ImageBufferDownload.lIIlIIllIlIlIl[7], ImageBufferDownload.lIIlIIllIlIlIl[6], ImageBufferDownload.lIIlIIllIlIlIl[0], ImageBufferDownload.lIIlIIllIlIlIl[8], ImageBufferDownload.lIIlIIllIlIlIl[6], ImageBufferDownload.lIIlIIllIlIlIl[10], ImageBufferDownload.lIIlIIllIlIlIl[3], null);
            "".length();
            lllllllllllllIIllIllIlIIIIllIllI.drawImage(lllllllllllllIIllIllIlIIIIllIlll, ImageBufferDownload.lIIlIIllIlIlIl[11], ImageBufferDownload.lIIlIIllIlIlIl[7], ImageBufferDownload.lIIlIIllIlIlIl[4], ImageBufferDownload.lIIlIIllIlIlIl[0], ImageBufferDownload.lIIlIIllIlIlIl[2], ImageBufferDownload.lIIlIIllIlIlIl[6], ImageBufferDownload.lIIlIIllIlIlIl[8], ImageBufferDownload.lIIlIIllIlIlIl[3], null);
            "".length();
            lllllllllllllIIllIllIlIIIIllIllI.drawImage(lllllllllllllIIllIllIlIIIIllIlll, ImageBufferDownload.lIIlIIllIlIlIl[3], ImageBufferDownload.lIIlIIllIlIlIl[7], ImageBufferDownload.lIIlIIllIlIlIl[11], ImageBufferDownload.lIIlIIllIlIlIl[0], ImageBufferDownload.lIIlIIllIlIlIl[12], ImageBufferDownload.lIIlIIllIlIlIl[6], ImageBufferDownload.lIIlIIllIlIlIl[9], ImageBufferDownload.lIIlIIllIlIlIl[3], null);
            "".length();
            lllllllllllllIIllIllIlIIIIllIllI.drawImage(lllllllllllllIIllIllIlIIIIllIlll, ImageBufferDownload.lIIlIIllIlIlIl[13], ImageBufferDownload.lIIlIIllIlIlIl[5], ImageBufferDownload.lIIlIIllIlIlIl[14], ImageBufferDownload.lIIlIIllIlIlIl[7], ImageBufferDownload.lIIlIIllIlIlIl[15], ImageBufferDownload.lIIlIIllIlIlIl[9], ImageBufferDownload.lIIlIIllIlIlIl[5], ImageBufferDownload.lIIlIIllIlIlIl[6], null);
            "".length();
            lllllllllllllIIllIllIlIIIIllIllI.drawImage(lllllllllllllIIllIllIlIIIIllIlll, ImageBufferDownload.lIIlIIllIlIlIl[15], ImageBufferDownload.lIIlIIllIlIlIl[5], ImageBufferDownload.lIIlIIllIlIlIl[13], ImageBufferDownload.lIIlIIllIlIlIl[7], ImageBufferDownload.lIIlIIllIlIlIl[5], ImageBufferDownload.lIIlIIllIlIlIl[9], ImageBufferDownload.lIIlIIllIlIlIl[7], ImageBufferDownload.lIIlIIllIlIlIl[6], null);
            "".length();
            lllllllllllllIIllIllIlIIIIllIllI.drawImage(lllllllllllllIIllIllIlIIIIllIlll, ImageBufferDownload.lIIlIIllIlIlIl[14], ImageBufferDownload.lIIlIIllIlIlIl[7], ImageBufferDownload.lIIlIIllIlIlIl[3], ImageBufferDownload.lIIlIIllIlIlIl[0], ImageBufferDownload.lIIlIIllIlIlIl[5], ImageBufferDownload.lIIlIIllIlIlIl[6], ImageBufferDownload.lIIlIIllIlIlIl[7], ImageBufferDownload.lIIlIIllIlIlIl[3], null);
            "".length();
            lllllllllllllIIllIllIlIIIIllIllI.drawImage(lllllllllllllIIllIllIlIIIIllIlll, ImageBufferDownload.lIIlIIllIlIlIl[13], ImageBufferDownload.lIIlIIllIlIlIl[7], ImageBufferDownload.lIIlIIllIlIlIl[14], ImageBufferDownload.lIIlIIllIlIlIl[0], ImageBufferDownload.lIIlIIllIlIlIl[15], ImageBufferDownload.lIIlIIllIlIlIl[6], ImageBufferDownload.lIIlIIllIlIlIl[5], ImageBufferDownload.lIIlIIllIlIlIl[3], null);
            "".length();
            lllllllllllllIIllIllIlIIIIllIllI.drawImage(lllllllllllllIIllIllIlIIIIllIlll, ImageBufferDownload.lIIlIIllIlIlIl[15], ImageBufferDownload.lIIlIIllIlIlIl[7], ImageBufferDownload.lIIlIIllIlIlIl[13], ImageBufferDownload.lIIlIIllIlIlIl[0], ImageBufferDownload.lIIlIIllIlIlIl[13], ImageBufferDownload.lIIlIIllIlIlIl[6], ImageBufferDownload.lIIlIIllIlIlIl[15], ImageBufferDownload.lIIlIIllIlIlIl[3], null);
            "".length();
            lllllllllllllIIllIllIlIIIIllIllI.drawImage(lllllllllllllIIllIllIlIIIIllIlll, ImageBufferDownload.lIIlIIllIlIlIl[5], ImageBufferDownload.lIIlIIllIlIlIl[7], ImageBufferDownload.lIIlIIllIlIlIl[15], ImageBufferDownload.lIIlIIllIlIlIl[0], ImageBufferDownload.lIIlIIllIlIlIl[7], ImageBufferDownload.lIIlIIllIlIlIl[6], ImageBufferDownload.lIIlIIllIlIlIl[16], ImageBufferDownload.lIIlIIllIlIlIl[3], null);
            "".length();
        }
        lllllllllllllIIllIllIlIIIIllIllI.dispose();
        this.imageData = ((DataBufferInt)lllllllllllllIIllIllIlIIIIllIlll.getRaster().getDataBuffer()).getData();
        this.setAreaOpaque(ImageBufferDownload.lIIlIIllIlIlIl[2], ImageBufferDownload.lIIlIIllIlIlIl[2], ImageBufferDownload.lIIlIIllIlIlIl[3], ImageBufferDownload.lIIlIIllIlIlIl[9]);
        this.setAreaTransparent(ImageBufferDownload.lIIlIIllIlIlIl[3], ImageBufferDownload.lIIlIIllIlIlIl[2], ImageBufferDownload.lIIlIIllIlIlIl[0], ImageBufferDownload.lIIlIIllIlIlIl[3]);
        this.setAreaOpaque(ImageBufferDownload.lIIlIIllIlIlIl[2], ImageBufferDownload.lIIlIIllIlIlIl[9], ImageBufferDownload.lIIlIIllIlIlIl[0], ImageBufferDownload.lIIlIIllIlIlIl[3]);
        this.setAreaTransparent(ImageBufferDownload.lIIlIIllIlIlIl[2], ImageBufferDownload.lIIlIIllIlIlIl[3], ImageBufferDownload.lIIlIIllIlIlIl[9], ImageBufferDownload.lIIlIIllIlIlIl[5]);
        this.setAreaTransparent(ImageBufferDownload.lIIlIIllIlIlIl[9], ImageBufferDownload.lIIlIIllIlIlIl[3], ImageBufferDownload.lIIlIIllIlIlIl[13], ImageBufferDownload.lIIlIIllIlIlIl[5]);
        this.setAreaTransparent(ImageBufferDownload.lIIlIIllIlIlIl[13], ImageBufferDownload.lIIlIIllIlIlIl[3], ImageBufferDownload.lIIlIIllIlIlIl[16], ImageBufferDownload.lIIlIIllIlIlIl[5]);
        this.setAreaTransparent(ImageBufferDownload.lIIlIIllIlIlIl[2], ImageBufferDownload.lIIlIIllIlIlIl[5], ImageBufferDownload.lIIlIIllIlIlIl[9], ImageBufferDownload.lIIlIIllIlIlIl[0]);
        this.setAreaOpaque(ImageBufferDownload.lIIlIIllIlIlIl[9], ImageBufferDownload.lIIlIIllIlIlIl[5], ImageBufferDownload.lIIlIIllIlIlIl[5], ImageBufferDownload.lIIlIIllIlIlIl[0]);
        this.setAreaTransparent(ImageBufferDownload.lIIlIIllIlIlIl[5], ImageBufferDownload.lIIlIIllIlIlIl[5], ImageBufferDownload.lIIlIIllIlIlIl[0], ImageBufferDownload.lIIlIIllIlIlIl[0]);
        return lllllllllllllIIllIllIlIIIIllIlll;
    }
    
    private void setAreaTransparent(final int lllllllllllllIIllIllIlIIIIlIlIII, final int lllllllllllllIIllIllIlIIIIlIIIII, final int lllllllllllllIIllIllIlIIIIlIIllI, final int lllllllllllllIIllIllIlIIIIIllllI) {
        if (llIIlllIIIIIlll(this.hasTransparency(lllllllllllllIIllIllIlIIIIlIlIII, lllllllllllllIIllIllIlIIIIlIIIII, lllllllllllllIIllIllIlIIIIlIIllI, lllllllllllllIIllIllIlIIIIIllllI) ? 1 : 0)) {
            int lllllllllllllIIllIllIlIIIIlIIlII = lllllllllllllIIllIllIlIIIIlIlIII;
            "".length();
            if (((86 + 92 - 169 + 211 ^ 182 + 79 - 178 + 106) & (114 + 78 - 163 + 164 ^ 0 + 69 - 12 + 103 ^ -" ".length())) != 0x0) {
                return;
            }
            while (!llIIlllIIIIlIII(lllllllllllllIIllIllIlIIIIlIIlII, lllllllllllllIIllIllIlIIIIlIIllI)) {
                int lllllllllllllIIllIllIlIIIIlIIIll = lllllllllllllIIllIllIlIIIIlIIIII;
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
                while (!llIIlllIIIIlIII(lllllllllllllIIllIllIlIIIIlIIIll, lllllllllllllIIllIllIlIIIIIllllI)) {
                    final int[] imageData = this.imageData;
                    final int n = lllllllllllllIIllIllIlIIIIlIIlII + lllllllllllllIIllIllIlIIIIlIIIll * this.imageWidth;
                    imageData[n] &= ImageBufferDownload.lIIlIIllIlIlIl[17];
                    ++lllllllllllllIIllIllIlIIIIlIIIll;
                }
                ++lllllllllllllIIllIllIlIIIIlIIlII;
            }
        }
    }
    
    private static boolean llIIlllIIIIIlll(final int lllllllllllllIIllIllIIllllIlllll) {
        return lllllllllllllIIllIllIIllllIlllll == 0;
    }
    
    private static boolean llIIlllIIIIlIIl(final int lllllllllllllIIllIllIIlllllIIlII, final int lllllllllllllIIllIllIIlllllIIIll) {
        return lllllllllllllIIllIllIIlllllIIlII < lllllllllllllIIllIllIIlllllIIIll;
    }
    
    @Override
    public void skinAvailable() {
    }
}
