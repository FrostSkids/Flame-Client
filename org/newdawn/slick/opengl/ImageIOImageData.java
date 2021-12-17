// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl;

import java.awt.image.WritableRaster;
import java.nio.ByteOrder;
import java.awt.image.DataBufferByte;
import java.awt.Color;
import java.util.Hashtable;
import java.awt.Point;
import java.awt.image.Raster;
import javax.imageio.ImageIO;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.awt.image.ComponentColorModel;
import java.awt.color.ColorSpace;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.io.InputStream;
import java.awt.image.ImageObserver;
import java.awt.Image;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class ImageIOImageData implements LoadableImageData
{
    private /* synthetic */ int texWidth;
    private /* synthetic */ int width;
    private static final /* synthetic */ ColorModel glAlphaColorModel;
    private /* synthetic */ int height;
    private /* synthetic */ boolean edging;
    private static final /* synthetic */ String[] lIlllIIlIlllIl;
    private /* synthetic */ int depth;
    private /* synthetic */ int texHeight;
    private static final /* synthetic */ ColorModel glColorModel;
    private static final /* synthetic */ int[] lIlllIIlIllllI;
    
    public int getTexWidth() {
        return this.texWidth;
    }
    
    private static boolean lIIIIIIllllIlIII(final Object llllllllllllIlllllIIllllIIIIIlll) {
        return llllllllllllIlllllIIllllIIIIIlll != null;
    }
    
    public int getTexHeight() {
        return this.texHeight;
    }
    
    public ImageIOImageData() {
        this.edging = (ImageIOImageData.lIlllIIlIllllI[0] != 0);
    }
    
    private void copyArea(final BufferedImage llllllllllllIlllllIIllllIIllIIlI, final int llllllllllllIlllllIIllllIIllIIIl, final int llllllllllllIlllllIIllllIIlllIII, final int llllllllllllIlllllIIllllIIllIlll, final int llllllllllllIlllllIIllllIIlIlllI, final int llllllllllllIlllllIIllllIIllIlIl, final int llllllllllllIlllllIIllllIIlIllII) {
        final Graphics2D llllllllllllIlllllIIllllIIllIIll = (Graphics2D)llllllllllllIlllllIIllllIIllIIlI.getGraphics();
        llllllllllllIlllllIIllllIIllIIll.drawImage(llllllllllllIlllllIIllllIIllIIlI.getSubimage(llllllllllllIlllllIIllllIIllIIIl, llllllllllllIlllllIIllllIIlllIII, llllllllllllIlllllIIllllIIllIlll, llllllllllllIlllllIIllllIIlIlllI), llllllllllllIlllllIIllllIIllIIIl + llllllllllllIlllllIIllllIIllIlIl, llllllllllllIlllllIIllllIIlllIII + llllllllllllIlllllIIllllIIlIllII, null);
        "".length();
    }
    
    private static void lIIIIIIllllIIllI() {
        (lIlllIIlIlllIl = new String[ImageIOImageData.lIlllIIlIllllI[0]])[ImageIOImageData.lIlllIIlIllllI[1]] = lIIIIIIllllIIlIl("Cy8YAAALDTAKBCUnPQYRI2IdCAAxLF4TRTE2FhUAYisNQBZiKxQGAids", "BByge");
    }
    
    public int getWidth() {
        return this.width;
    }
    
    public ByteBuffer loadImage(final InputStream llllllllllllIlllllIIlllllIIIlllI, final boolean llllllllllllIlllllIIlllllIIIllIl, final int[] llllllllllllIlllllIIlllllIIIllII) throws IOException {
        return this.loadImage(llllllllllllIlllllIIlllllIIIlllI, llllllllllllIlllllIIlllllIIIllIl, (boolean)(ImageIOImageData.lIlllIIlIllllI[1] != 0), llllllllllllIlllllIIlllllIIIllII);
    }
    
    static {
        lIIIIIIllllIIlll();
        lIIIIIIllllIIllI();
        final ColorSpace instance = ColorSpace.getInstance(ImageIOImageData.lIlllIIlIllllI[8]);
        final int[] bits = new int[ImageIOImageData.lIlllIIlIllllI[4]];
        bits[ImageIOImageData.lIlllIIlIllllI[1]] = ImageIOImageData.lIlllIIlIllllI[9];
        bits[ImageIOImageData.lIlllIIlIllllI[0]] = ImageIOImageData.lIlllIIlIllllI[9];
        bits[ImageIOImageData.lIlllIIlIllllI[2]] = ImageIOImageData.lIlllIIlIllllI[9];
        bits[ImageIOImageData.lIlllIIlIllllI[6]] = ImageIOImageData.lIlllIIlIllllI[9];
        glAlphaColorModel = new ComponentColorModel(instance, bits, (boolean)(ImageIOImageData.lIlllIIlIllllI[0] != 0), (boolean)(ImageIOImageData.lIlllIIlIllllI[1] != 0), ImageIOImageData.lIlllIIlIllllI[6], ImageIOImageData.lIlllIIlIllllI[1]);
        final ColorSpace instance2 = ColorSpace.getInstance(ImageIOImageData.lIlllIIlIllllI[8]);
        final int[] bits2 = new int[ImageIOImageData.lIlllIIlIllllI[4]];
        bits2[ImageIOImageData.lIlllIIlIllllI[1]] = ImageIOImageData.lIlllIIlIllllI[9];
        bits2[ImageIOImageData.lIlllIIlIllllI[0]] = ImageIOImageData.lIlllIIlIllllI[9];
        bits2[ImageIOImageData.lIlllIIlIllllI[2]] = ImageIOImageData.lIlllIIlIllllI[9];
        bits2[ImageIOImageData.lIlllIIlIllllI[6]] = ImageIOImageData.lIlllIIlIllllI[1];
        glColorModel = new ComponentColorModel(instance2, bits2, (boolean)(ImageIOImageData.lIlllIIlIllllI[1] != 0), (boolean)(ImageIOImageData.lIlllIIlIllllI[1] != 0), ImageIOImageData.lIlllIIlIllllI[0], ImageIOImageData.lIlllIIlIllllI[1]);
    }
    
    public int getDepth() {
        return this.depth;
    }
    
    public void configureEdging(final boolean llllllllllllIlllllIIllllIIlIIlIl) {
        this.edging = llllllllllllIlllllIIllllIIlIIlIl;
    }
    
    private static String lIIIIIIllllIIlIl(String llllllllllllIlllllIIllllIIIlIlIl, final String llllllllllllIlllllIIllllIIIllIIl) {
        llllllllllllIlllllIIllllIIIlIlIl = new String(Base64.getDecoder().decode(llllllllllllIlllllIIllllIIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllIIllllIIIllIII = new StringBuilder();
        final char[] llllllllllllIlllllIIllllIIIlIlll = llllllllllllIlllllIIllllIIIllIIl.toCharArray();
        int llllllllllllIlllllIIllllIIIlIllI = ImageIOImageData.lIlllIIlIllllI[1];
        final String llllllllllllIlllllIIllllIIIlIIII = (Object)llllllllllllIlllllIIllllIIIlIlIl.toCharArray();
        final float llllllllllllIlllllIIllllIIIIllll = llllllllllllIlllllIIllllIIIlIIII.length;
        float llllllllllllIlllllIIllllIIIIlllI = ImageIOImageData.lIlllIIlIllllI[1];
        while (lIIIIIIllllIlIIl((int)llllllllllllIlllllIIllllIIIIlllI, (int)llllllllllllIlllllIIllllIIIIllll)) {
            final char llllllllllllIlllllIIllllIIIllIll = llllllllllllIlllllIIllllIIIlIIII[llllllllllllIlllllIIllllIIIIlllI];
            llllllllllllIlllllIIllllIIIllIII.append((char)(llllllllllllIlllllIIllllIIIllIll ^ llllllllllllIlllllIIllllIIIlIlll[llllllllllllIlllllIIllllIIIlIllI % llllllllllllIlllllIIllllIIIlIlll.length]));
            "".length();
            ++llllllllllllIlllllIIllllIIIlIllI;
            ++llllllllllllIlllllIIllllIIIIlllI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllIIllllIIIllIII);
    }
    
    private static boolean lIIIIIIllllIlIIl(final int llllllllllllIlllllIIllllIIIIlIlI, final int llllllllllllIlllllIIllllIIIIlIIl) {
        return llllllllllllIlllllIIllllIIIIlIlI < llllllllllllIlllllIIllllIIIIlIIl;
    }
    
    public ByteBuffer loadImage(final InputStream llllllllllllIlllllIIllllIllllllI, final boolean llllllllllllIlllllIIllllIlllllIl, boolean llllllllllllIlllllIIlllllIIIIIlI, final int[] llllllllllllIlllllIIlllllIIIIIIl) throws IOException {
        if (lIIIIIIllllIlIII(llllllllllllIlllllIIlllllIIIIIIl)) {
            llllllllllllIlllllIIlllllIIIIIlI = (ImageIOImageData.lIlllIIlIllllI[0] != 0);
        }
        final BufferedImage llllllllllllIlllllIIlllllIIIIIII = ImageIO.read(llllllllllllIlllllIIllllIllllllI);
        return this.imageToByteBuffer(llllllllllllIlllllIIlllllIIIIIII, llllllllllllIlllllIIllllIlllllIl, llllllllllllIlllllIIlllllIIIIIlI, llllllllllllIlllllIIlllllIIIIIIl);
    }
    
    public ByteBuffer getImageBufferData() {
        throw new RuntimeException(ImageIOImageData.lIlllIIlIlllIl[ImageIOImageData.lIlllIIlIllllI[1]]);
    }
    
    public ByteBuffer imageToByteBuffer(final BufferedImage llllllllllllIlllllIIllllIlIlIlII, final boolean llllllllllllIlllllIIllllIlIlIIll, final boolean llllllllllllIlllllIIllllIlIlIIlI, final int[] llllllllllllIlllllIIllllIlIllllI) {
        ByteBuffer llllllllllllIlllllIIllllIlIlllIl = null;
        int llllllllllllIlllllIIllllIlIllIlI = ImageIOImageData.lIlllIIlIllllI[2];
        int llllllllllllIlllllIIllllIlIllIIl = ImageIOImageData.lIlllIIlIllllI[2];
        while (lIIIIIIllllIlIIl(llllllllllllIlllllIIllllIlIllIlI, llllllllllllIlllllIIllllIlIlIlII.getWidth())) {
            llllllllllllIlllllIIllllIlIllIlI *= ImageIOImageData.lIlllIIlIllllI[2];
            "".length();
            if (null != null) {
                return null;
            }
        }
        while (lIIIIIIllllIlIIl(llllllllllllIlllllIIllllIlIllIIl, llllllllllllIlllllIIllllIlIlIlII.getHeight())) {
            llllllllllllIlllllIIllllIlIllIIl *= ImageIOImageData.lIlllIIlIllllI[2];
            "".length();
            if ("  ".length() == -" ".length()) {
                return null;
            }
        }
        this.width = llllllllllllIlllllIIllllIlIlIlII.getWidth();
        this.height = llllllllllllIlllllIIllllIlIlIlII.getHeight();
        this.texHeight = llllllllllllIlllllIIllllIlIllIIl;
        this.texWidth = llllllllllllIlllllIIllllIlIllIlI;
        int n;
        if (!lIIIIIIllllIlIlI(llllllllllllIlllllIIllllIlIlIlII.getColorModel().hasAlpha() ? 1 : 0) || lIIIIIIllllIlIll(llllllllllllIlllllIIllllIlIlIIlI ? 1 : 0)) {
            n = ImageIOImageData.lIlllIIlIllllI[0];
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        else {
            n = ImageIOImageData.lIlllIIlIllllI[1];
        }
        final boolean llllllllllllIlllllIIllllIlIllIII = n != 0;
        BufferedImage llllllllllllIlllllIIllllIlIllIll = null;
        if (lIIIIIIllllIlIll(llllllllllllIlllllIIllllIlIllIII ? 1 : 0)) {
            this.depth = ImageIOImageData.lIlllIIlIllllI[3];
            final WritableRaster llllllllllllIlllllIIllllIllIlIII = Raster.createInterleavedRaster(ImageIOImageData.lIlllIIlIllllI[1], llllllllllllIlllllIIllllIlIllIlI, llllllllllllIlllllIIllllIlIllIIl, ImageIOImageData.lIlllIIlIllllI[4], null);
            final BufferedImage llllllllllllIlllllIIllllIllIIlll = new BufferedImage(ImageIOImageData.glAlphaColorModel, llllllllllllIlllllIIllllIllIlIII, (boolean)(ImageIOImageData.lIlllIIlIllllI[1] != 0), new Hashtable<Object, Object>());
            "".length();
            if ("  ".length() < -" ".length()) {
                return null;
            }
        }
        else {
            this.depth = ImageIOImageData.lIlllIIlIllllI[5];
            final WritableRaster llllllllllllIlllllIIllllIlIlllII = Raster.createInterleavedRaster(ImageIOImageData.lIlllIIlIllllI[1], llllllllllllIlllllIIllllIlIllIlI, llllllllllllIlllllIIllllIlIllIIl, ImageIOImageData.lIlllIIlIllllI[6], null);
            llllllllllllIlllllIIllllIlIllIll = new BufferedImage(ImageIOImageData.glColorModel, llllllllllllIlllllIIllllIlIlllII, (boolean)(ImageIOImageData.lIlllIIlIllllI[1] != 0), new Hashtable<Object, Object>());
        }
        final Graphics2D llllllllllllIlllllIIllllIlIlIlll = (Graphics2D)llllllllllllIlllllIIllllIlIllIll.getGraphics();
        if (lIIIIIIllllIlIll(llllllllllllIlllllIIllllIlIllIII ? 1 : 0)) {
            llllllllllllIlllllIIllllIlIlIlll.setColor(new Color(0.0f, 0.0f, 0.0f, 0.0f));
            llllllllllllIlllllIIllllIlIlIlll.fillRect(ImageIOImageData.lIlllIIlIllllI[1], ImageIOImageData.lIlllIIlIllllI[1], llllllllllllIlllllIIllllIlIllIlI, llllllllllllIlllllIIllllIlIllIIl);
        }
        if (lIIIIIIllllIlIll(llllllllllllIlllllIIllllIlIlIIll ? 1 : 0)) {
            llllllllllllIlllllIIllllIlIlIlll.scale(1.0, -1.0);
            llllllllllllIlllllIIllllIlIlIlll.drawImage(llllllllllllIlllllIIllllIlIlIlII, ImageIOImageData.lIlllIIlIllllI[1], -this.height, null);
            "".length();
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            llllllllllllIlllllIIllllIlIlIlll.drawImage(llllllllllllIlllllIIllllIlIlIlII, ImageIOImageData.lIlllIIlIllllI[1], ImageIOImageData.lIlllIIlIllllI[1], null);
            "".length();
        }
        if (lIIIIIIllllIlIll(this.edging ? 1 : 0)) {
            if (lIIIIIIllllIlIIl(this.height, llllllllllllIlllllIIllllIlIllIIl - ImageIOImageData.lIlllIIlIllllI[0])) {
                this.copyArea(llllllllllllIlllllIIllllIlIllIll, ImageIOImageData.lIlllIIlIllllI[1], ImageIOImageData.lIlllIIlIllllI[1], this.width, ImageIOImageData.lIlllIIlIllllI[0], ImageIOImageData.lIlllIIlIllllI[1], llllllllllllIlllllIIllllIlIllIIl - ImageIOImageData.lIlllIIlIllllI[0]);
                this.copyArea(llllllllllllIlllllIIllllIlIllIll, ImageIOImageData.lIlllIIlIllllI[1], this.height - ImageIOImageData.lIlllIIlIllllI[0], this.width, ImageIOImageData.lIlllIIlIllllI[0], ImageIOImageData.lIlllIIlIllllI[1], ImageIOImageData.lIlllIIlIllllI[0]);
            }
            if (lIIIIIIllllIlIIl(this.width, llllllllllllIlllllIIllllIlIllIlI - ImageIOImageData.lIlllIIlIllllI[0])) {
                this.copyArea(llllllllllllIlllllIIllllIlIllIll, ImageIOImageData.lIlllIIlIllllI[1], ImageIOImageData.lIlllIIlIllllI[1], ImageIOImageData.lIlllIIlIllllI[0], this.height, llllllllllllIlllllIIllllIlIllIlI - ImageIOImageData.lIlllIIlIllllI[0], ImageIOImageData.lIlllIIlIllllI[1]);
                this.copyArea(llllllllllllIlllllIIllllIlIllIll, this.width - ImageIOImageData.lIlllIIlIllllI[0], ImageIOImageData.lIlllIIlIllllI[1], ImageIOImageData.lIlllIIlIllllI[0], this.height, ImageIOImageData.lIlllIIlIllllI[0], ImageIOImageData.lIlllIIlIllllI[1]);
            }
        }
        final byte[] llllllllllllIlllllIIllllIlIlIllI = ((DataBufferByte)llllllllllllIlllllIIllllIlIllIll.getRaster().getDataBuffer()).getData();
        if (lIIIIIIllllIlIII(llllllllllllIlllllIIllllIlIllllI)) {
            int llllllllllllIlllllIIllllIllIIIll = ImageIOImageData.lIlllIIlIllllI[1];
            while (lIIIIIIllllIlIIl(llllllllllllIlllllIIllllIllIIIll, llllllllllllIlllllIIllllIlIlIllI.length)) {
                boolean llllllllllllIlllllIIllllIllIIlII = ImageIOImageData.lIlllIIlIllllI[0] != 0;
                int llllllllllllIlllllIIllllIllIIlIl = ImageIOImageData.lIlllIIlIllllI[1];
                while (lIIIIIIllllIlIIl(llllllllllllIlllllIIllllIllIIlIl, ImageIOImageData.lIlllIIlIllllI[6])) {
                    int n2;
                    if (lIIIIIIllllIllII(llllllllllllIlllllIIllllIlIlIllI[llllllllllllIlllllIIllllIllIIIll + llllllllllllIlllllIIllllIllIIlIl])) {
                        n2 = ImageIOImageData.lIlllIIlIllllI[7] + llllllllllllIlllllIIllllIlIlIllI[llllllllllllIlllllIIllllIllIIIll + llllllllllllIlllllIIllllIllIIlIl];
                        "".length();
                        if (" ".length() >= (0xCF ^ 0xBA ^ (0xC8 ^ 0xB9))) {
                            return null;
                        }
                    }
                    else {
                        n2 = llllllllllllIlllllIIllllIlIlIllI[llllllllllllIlllllIIllllIllIIIll + llllllllllllIlllllIIllllIllIIlIl];
                    }
                    final int llllllllllllIlllllIIllllIllIIllI = n2;
                    if (lIIIIIIllllIllIl(llllllllllllIlllllIIllllIllIIllI, llllllllllllIlllllIIllllIlIllllI[llllllllllllIlllllIIllllIllIIlIl])) {
                        llllllllllllIlllllIIllllIllIIlII = (ImageIOImageData.lIlllIIlIllllI[1] != 0);
                    }
                    ++llllllllllllIlllllIIllllIllIIlIl;
                    "".length();
                    if (-"   ".length() >= 0) {
                        return null;
                    }
                }
                if (lIIIIIIllllIlIll(llllllllllllIlllllIIllllIllIIlII ? 1 : 0)) {
                    llllllllllllIlllllIIllllIlIlIllI[llllllllllllIlllllIIllllIllIIIll + ImageIOImageData.lIlllIIlIllllI[6]] = (byte)ImageIOImageData.lIlllIIlIllllI[1];
                }
                llllllllllllIlllllIIllllIllIIIll += 4;
                "".length();
                if ((0x4D ^ 0x49) < "  ".length()) {
                    return null;
                }
            }
        }
        llllllllllllIlllllIIllllIlIlllIl = ByteBuffer.allocateDirect(llllllllllllIlllllIIllllIlIlIllI.length);
        llllllllllllIlllllIIllllIlIlllIl.order(ByteOrder.nativeOrder());
        "".length();
        llllllllllllIlllllIIllllIlIlllIl.put(llllllllllllIlllllIIllllIlIlIllI, ImageIOImageData.lIlllIIlIllllI[1], llllllllllllIlllllIIllllIlIlIllI.length);
        "".length();
        llllllllllllIlllllIIllllIlIlllIl.flip();
        "".length();
        llllllllllllIlllllIIllllIlIlIlll.dispose();
        return llllllllllllIlllllIIllllIlIlllIl;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    private static boolean lIIIIIIllllIllII(final int llllllllllllIlllllIIllllIIIIIIIl) {
        return llllllllllllIlllllIIllllIIIIIIIl < 0;
    }
    
    private static boolean lIIIIIIllllIllIl(final int llllllllllllIlllllIIlllIlllllllI, final int llllllllllllIlllllIIlllIllllllIl) {
        return llllllllllllIlllllIIlllIlllllllI != llllllllllllIlllllIIlllIllllllIl;
    }
    
    private static boolean lIIIIIIllllIlIlI(final int llllllllllllIlllllIIllllIIIIIIll) {
        return llllllllllllIlllllIIllllIIIIIIll == 0;
    }
    
    public ByteBuffer loadImage(final InputStream llllllllllllIlllllIIlllllIIllIlI) throws IOException {
        return this.loadImage(llllllllllllIlllllIIlllllIIllIlI, (boolean)(ImageIOImageData.lIlllIIlIllllI[0] != 0), null);
    }
    
    private static boolean lIIIIIIllllIlIll(final int llllllllllllIlllllIIllllIIIIIlIl) {
        return llllllllllllIlllllIIllllIIIIIlIl != 0;
    }
    
    private static void lIIIIIIllllIIlll() {
        (lIlllIIlIllllI = new int[10])[0] = " ".length();
        ImageIOImageData.lIlllIIlIllllI[1] = ((0x65 ^ 0x63) & ~(0x8B ^ 0x8D));
        ImageIOImageData.lIlllIIlIllllI[2] = "  ".length();
        ImageIOImageData.lIlllIIlIllllI[3] = (40 + 78 - 54 + 124 ^ 8 + 117 + 4 + 27);
        ImageIOImageData.lIlllIIlIllllI[4] = (0xCB ^ 0xB0 ^ 24 + 53 - 45 + 95);
        ImageIOImageData.lIlllIIlIllllI[5] = (0x2A ^ 0x32);
        ImageIOImageData.lIlllIIlIllllI[6] = "   ".length();
        ImageIOImageData.lIlllIIlIllllI[7] = (-(0xFFFFBBDC & 0x46FB) & (0xFFFFBFD7 & 0x43FF));
        ImageIOImageData.lIlllIIlIllllI[8] = (-(0xFFFF92B8 & 0x7D5F) & (0xFFFF9FFF & 0x73FF));
        ImageIOImageData.lIlllIIlIllllI[9] = (0xBB ^ 0xB3);
    }
}
