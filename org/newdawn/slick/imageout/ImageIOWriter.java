// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.imageout;

import java.io.IOException;
import java.awt.image.WritableRaster;
import java.awt.image.ColorModel;
import org.newdawn.slick.Color;
import java.awt.image.RenderedImage;
import javax.imageio.ImageIO;
import java.util.Hashtable;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.SampleModel;
import java.awt.image.Raster;
import java.awt.Point;
import java.awt.image.ComponentColorModel;
import java.awt.color.ColorSpace;
import java.awt.image.PixelInterleavedSampleModel;
import java.awt.image.DataBufferByte;
import java.nio.ByteBuffer;
import java.io.OutputStream;
import org.newdawn.slick.Image;

public class ImageIOWriter implements ImageWriter
{
    private static final /* synthetic */ int[] lIlllIIIlllllI;
    
    private static boolean lIIIIIIllIIlIlII(final int llllllllllllIlllllIlIIlllIIllIII, final int llllllllllllIlllllIlIIlllIIlIlll) {
        return llllllllllllIlllllIlIIlllIIllIII < llllllllllllIlllllIlIIlllIIlIlll;
    }
    
    static {
        lIIIIIIllIIlIIlI();
    }
    
    private static boolean lIIIIIIllIIlIIll(final int llllllllllllIlllllIlIIlllIIlIIll) {
        return llllllllllllIlllllIlIIlllIIlIIll == 0;
    }
    
    private static void lIIIIIIllIIlIIlI() {
        (lIlllIIIlllllI = new int[7])[0] = (0x76 ^ 0x72);
        ImageIOWriter.lIlllIIIlllllI[1] = "   ".length();
        ImageIOWriter.lIlllIIIlllllI[2] = ((0x1D ^ 0x3) & ~(0x39 ^ 0x27));
        ImageIOWriter.lIlllIIIlllllI[3] = " ".length();
        ImageIOWriter.lIlllIIIlllllI[4] = "  ".length();
        ImageIOWriter.lIlllIIIlllllI[5] = (-(0xFFFFECAF & 0x3F53) & (0xFFFFAFEA & 0x7FFF));
        ImageIOWriter.lIlllIIIlllllI[6] = (0x32 ^ 0x69 ^ (0x45 ^ 0x16));
    }
    
    private static boolean lIIIIIIllIIlIlIl(final int llllllllllllIlllllIlIIlllIIlIlIl) {
        return llllllllllllIlllllIlIIlllIIlIlIl != 0;
    }
    
    public void saveImage(final Image llllllllllllIlllllIlIIlllIllIIIl, final String llllllllllllIlllllIlIIlllIlIIlIl, final OutputStream llllllllllllIlllllIlIIlllIlIllll, final boolean llllllllllllIlllllIlIIlllIlIlllI) throws IOException {
        int llllllllllllIlllllIlIIlllIlIllIl = ImageIOWriter.lIlllIIIlllllI[0] * llllllllllllIlllllIlIIlllIllIIIl.getWidth() * llllllllllllIlllllIlIIlllIllIIIl.getHeight();
        if (lIIIIIIllIIlIIll(llllllllllllIlllllIlIIlllIlIlllI ? 1 : 0)) {
            llllllllllllIlllllIlIIlllIlIllIl = ImageIOWriter.lIlllIIIlllllI[1] * llllllllllllIlllllIlIIlllIllIIIl.getWidth() * llllllllllllIlllllIlIIlllIllIIIl.getHeight();
        }
        final ByteBuffer llllllllllllIlllllIlIIlllIlIllII = ByteBuffer.allocate(llllllllllllIlllllIlIIlllIlIllIl);
        int llllllllllllIlllllIlIIlllIllIlll = ImageIOWriter.lIlllIIIlllllI[2];
        while (lIIIIIIllIIlIlII(llllllllllllIlllllIlIIlllIllIlll, llllllllllllIlllllIlIIlllIllIIIl.getHeight())) {
            int llllllllllllIlllllIlIIlllIlllIII = ImageIOWriter.lIlllIIIlllllI[2];
            while (lIIIIIIllIIlIlII(llllllllllllIlllllIlIIlllIlllIII, llllllllllllIlllllIlIIlllIllIIIl.getWidth())) {
                final Color llllllllllllIlllllIlIIlllIlllIIl = llllllllllllIlllllIlIIlllIllIIIl.getColor(llllllllllllIlllllIlIIlllIlllIII, llllllllllllIlllllIlIIlllIllIlll);
                llllllllllllIlllllIlIIlllIlIllII.put((byte)(llllllllllllIlllllIlIIlllIlllIIl.r * 255.0f));
                "".length();
                llllllllllllIlllllIlIIlllIlIllII.put((byte)(llllllllllllIlllllIlIIlllIlllIIl.g * 255.0f));
                "".length();
                llllllllllllIlllllIlIIlllIlIllII.put((byte)(llllllllllllIlllllIlIIlllIlllIIl.b * 255.0f));
                "".length();
                if (lIIIIIIllIIlIlIl(llllllllllllIlllllIlIIlllIlIlllI ? 1 : 0)) {
                    llllllllllllIlllllIlIIlllIlIllII.put((byte)(llllllllllllIlllllIlIIlllIlllIIl.a * 255.0f));
                    "".length();
                }
                ++llllllllllllIlllllIlIIlllIlllIII;
                "".length();
                if ((0x2F ^ 0x2B) <= -" ".length()) {
                    return;
                }
            }
            ++llllllllllllIlllllIlIIlllIllIlll;
            "".length();
            if (" ".length() >= "   ".length()) {
                return;
            }
        }
        final DataBufferByte llllllllllllIlllllIlIIlllIlIlIll = new DataBufferByte(llllllllllllIlllllIlIIlllIlIllII.array(), llllllllllllIlllllIlIIlllIlIllIl);
        PixelInterleavedSampleModel llllllllllllIlllllIlIIlllIlIlIlI = null;
        ColorModel llllllllllllIlllllIlIIlllIlIlIIl;
        if (lIIIIIIllIIlIlIl(llllllllllllIlllllIlIIlllIlIlllI ? 1 : 0)) {
            final int[] array = new int[ImageIOWriter.lIlllIIIlllllI[0]];
            array[ImageIOWriter.lIlllIIIlllllI[2]] = ImageIOWriter.lIlllIIIlllllI[2];
            array[ImageIOWriter.lIlllIIIlllllI[3]] = ImageIOWriter.lIlllIIIlllllI[3];
            array[ImageIOWriter.lIlllIIIlllllI[4]] = ImageIOWriter.lIlllIIIlllllI[4];
            array[ImageIOWriter.lIlllIIIlllllI[1]] = ImageIOWriter.lIlllIIIlllllI[1];
            final int[] llllllllllllIlllllIlIIlllIllIllI = array;
            final PixelInterleavedSampleModel llllllllllllIlllllIlIIlllIllIlIl = new PixelInterleavedSampleModel(ImageIOWriter.lIlllIIIlllllI[2], llllllllllllIlllllIlIIlllIllIIIl.getWidth(), llllllllllllIlllllIlIIlllIllIIIl.getHeight(), ImageIOWriter.lIlllIIIlllllI[0], ImageIOWriter.lIlllIIIlllllI[0] * llllllllllllIlllllIlIIlllIllIIIl.getWidth(), llllllllllllIlllllIlIIlllIllIllI);
            final ColorSpace instance = ColorSpace.getInstance(ImageIOWriter.lIlllIIIlllllI[5]);
            final int[] bits = new int[ImageIOWriter.lIlllIIIlllllI[0]];
            bits[ImageIOWriter.lIlllIIIlllllI[2]] = ImageIOWriter.lIlllIIIlllllI[6];
            bits[ImageIOWriter.lIlllIIIlllllI[3]] = ImageIOWriter.lIlllIIIlllllI[6];
            bits[ImageIOWriter.lIlllIIIlllllI[4]] = ImageIOWriter.lIlllIIIlllllI[6];
            bits[ImageIOWriter.lIlllIIIlllllI[1]] = ImageIOWriter.lIlllIIIlllllI[6];
            final ColorModel llllllllllllIlllllIlIIlllIllIlII = new ComponentColorModel(instance, bits, (boolean)(ImageIOWriter.lIlllIIIlllllI[3] != 0), (boolean)(ImageIOWriter.lIlllIIIlllllI[2] != 0), ImageIOWriter.lIlllIIIlllllI[1], ImageIOWriter.lIlllIIIlllllI[2]);
            "".length();
            if (" ".length() <= -" ".length()) {
                return;
            }
        }
        else {
            final int[] array2 = new int[ImageIOWriter.lIlllIIIlllllI[1]];
            array2[ImageIOWriter.lIlllIIIlllllI[2]] = ImageIOWriter.lIlllIIIlllllI[2];
            array2[ImageIOWriter.lIlllIIIlllllI[3]] = ImageIOWriter.lIlllIIIlllllI[3];
            array2[ImageIOWriter.lIlllIIIlllllI[4]] = ImageIOWriter.lIlllIIIlllllI[4];
            final int[] llllllllllllIlllllIlIIlllIllIIll = array2;
            llllllllllllIlllllIlIIlllIlIlIlI = new PixelInterleavedSampleModel(ImageIOWriter.lIlllIIIlllllI[2], llllllllllllIlllllIlIIlllIllIIIl.getWidth(), llllllllllllIlllllIlIIlllIllIIIl.getHeight(), ImageIOWriter.lIlllIIIlllllI[1], ImageIOWriter.lIlllIIIlllllI[1] * llllllllllllIlllllIlIIlllIllIIIl.getWidth(), llllllllllllIlllllIlIIlllIllIIll);
            final ColorSpace instance2 = ColorSpace.getInstance(ImageIOWriter.lIlllIIIlllllI[5]);
            final int[] bits2 = new int[ImageIOWriter.lIlllIIIlllllI[0]];
            bits2[ImageIOWriter.lIlllIIIlllllI[2]] = ImageIOWriter.lIlllIIIlllllI[6];
            bits2[ImageIOWriter.lIlllIIIlllllI[3]] = ImageIOWriter.lIlllIIIlllllI[6];
            bits2[ImageIOWriter.lIlllIIIlllllI[4]] = ImageIOWriter.lIlllIIIlllllI[6];
            bits2[ImageIOWriter.lIlllIIIlllllI[1]] = ImageIOWriter.lIlllIIIlllllI[2];
            llllllllllllIlllllIlIIlllIlIlIIl = new ComponentColorModel(instance2, bits2, (boolean)(ImageIOWriter.lIlllIIIlllllI[2] != 0), (boolean)(ImageIOWriter.lIlllIIIlllllI[2] != 0), ImageIOWriter.lIlllIIIlllllI[3], ImageIOWriter.lIlllIIIlllllI[2]);
        }
        final WritableRaster llllllllllllIlllllIlIIlllIlIlIII = Raster.createWritableRaster(llllllllllllIlllllIlIIlllIlIlIlI, llllllllllllIlllllIlIIlllIlIlIll, new Point(ImageIOWriter.lIlllIIIlllllI[2], ImageIOWriter.lIlllIIIlllllI[2]));
        final BufferedImage llllllllllllIlllllIlIIlllIlIIlll = new BufferedImage(llllllllllllIlllllIlIIlllIlIlIIl, llllllllllllIlllllIlIIlllIlIlIII, (boolean)(ImageIOWriter.lIlllIIIlllllI[2] != 0), null);
        ImageIO.write(llllllllllllIlllllIlIIlllIlIIlll, llllllllllllIlllllIlIIlllIlIIlIl, llllllllllllIlllllIlIIlllIlIllll);
        "".length();
    }
}
