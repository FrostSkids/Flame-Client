// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.util;

import java.awt.image.ImageObserver;
import java.awt.Image;
import java.awt.Graphics2D;
import java.nio.ByteBuffer;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.TextureImpl;
import org.newdawn.slick.opengl.InternalTextureLoader;
import org.newdawn.slick.opengl.ImageIOImageData;
import java.io.IOException;
import org.newdawn.slick.opengl.Texture;
import java.awt.image.BufferedImage;

public class BufferedImageUtil
{
    private static final /* synthetic */ int[] lIllllIIIlIIIl;
    
    static {
        lIIIIIllllllIIII();
    }
    
    public static Texture getTexture(final String llllllllllllIllllIlIlllIIlIlllIl, final BufferedImage llllllllllllIllllIlIlllIIlIllIII, final int llllllllllllIllllIlIlllIIlIllIll) throws IOException {
        final Texture llllllllllllIllllIlIlllIIlIllIlI = getTexture(llllllllllllIllllIlIlllIIlIlllIl, llllllllllllIllllIlIlllIIlIllIII, BufferedImageUtil.lIllllIIIlIIIl[0], BufferedImageUtil.lIllllIIIlIIIl[1], llllllllllllIllllIlIlllIIlIllIll, llllllllllllIllllIlIlllIIlIllIll);
        return llllllllllllIllllIlIlllIIlIllIlI;
    }
    
    private static boolean lIIIIIllllllIIIl(final int llllllllllllIllllIlIlllIIIIlIlII) {
        return llllllllllllIllllIlIlllIIIIlIlII != 0;
    }
    
    public static Texture getTexture(final String llllllllllllIllllIlIlllIIlIIlIIl, final BufferedImage llllllllllllIllllIlIlllIIlIIlIII, final int llllllllllllIllllIlIlllIIlIIIlll, final int llllllllllllIllllIlIlllIIIlllIlI, final int llllllllllllIllllIlIlllIIlIIIlIl, final int llllllllllllIllllIlIlllIIIlllIII) throws IOException {
        final ImageIOImageData llllllllllllIllllIlIlllIIlIIIIll = new ImageIOImageData();
        int llllllllllllIllllIlIlllIIlIIIIlI = BufferedImageUtil.lIllllIIIlIIIl[3];
        final int llllllllllllIllllIlIlllIIlIIIIIl = InternalTextureLoader.createTextureID();
        final TextureImpl llllllllllllIllllIlIlllIIlIIIIII = new TextureImpl(llllllllllllIllllIlIlllIIlIIlIIl, llllllllllllIllllIlIlllIIlIIIlll, llllllllllllIllllIlIlllIIlIIIIIl);
        Renderer.get().glEnable(BufferedImageUtil.lIllllIIIlIIIl[0]);
        Renderer.get().glBindTexture(llllllllllllIllllIlIlllIIlIIIlll, llllllllllllIllllIlIlllIIlIIIIIl);
        final BufferedImage llllllllllllIllllIlIlllIIIllllll = llllllllllllIllllIlIlllIIlIIlIII;
        llllllllllllIllllIlIlllIIlIIIIII.setWidth(llllllllllllIllllIlIlllIIIllllll.getWidth());
        llllllllllllIllllIlIlllIIlIIIIII.setHeight(llllllllllllIllllIlIlllIIIllllll.getHeight());
        if (lIIIIIllllllIIIl(llllllllllllIllllIlIlllIIIllllll.getColorModel().hasAlpha() ? 1 : 0)) {
            llllllllllllIllllIlIlllIIlIIIIlI = BufferedImageUtil.lIllllIIIlIIIl[1];
            "".length();
            if (((0xF ^ 0x3F) & ~(0xB ^ 0x3B)) != 0x0) {
                return null;
            }
        }
        else {
            llllllllllllIllllIlIlllIIlIIIIlI = BufferedImageUtil.lIllllIIIlIIIl[4];
        }
        final ByteBuffer llllllllllllIllllIlIlllIIIlllllI = llllllllllllIllllIlIlllIIlIIIIll.imageToByteBuffer(llllllllllllIllllIlIlllIIIllllll, (boolean)(BufferedImageUtil.lIllllIIIlIIIl[3] != 0), (boolean)(BufferedImageUtil.lIllllIIIlIIIl[3] != 0), null);
        llllllllllllIllllIlIlllIIlIIIIII.setTextureHeight(llllllllllllIllllIlIlllIIlIIIIll.getTexHeight());
        llllllllllllIllllIlIlllIIlIIIIII.setTextureWidth(llllllllllllIllllIlIlllIIlIIIIll.getTexWidth());
        final TextureImpl textureImpl = llllllllllllIllllIlIlllIIlIIIIII;
        int alpha;
        if (lIIIIIllllllIIlI(llllllllllllIllllIlIlllIIlIIIIll.getDepth(), BufferedImageUtil.lIllllIIIlIIIl[5])) {
            alpha = BufferedImageUtil.lIllllIIIlIIIl[6];
            "".length();
            if ("  ".length() > "   ".length()) {
                return null;
            }
        }
        else {
            alpha = BufferedImageUtil.lIllllIIIlIIIl[3];
        }
        textureImpl.setAlpha((boolean)(alpha != 0));
        if (lIIIIIllllllIIlI(llllllllllllIllllIlIlllIIlIIIlll, BufferedImageUtil.lIllllIIIlIIIl[0])) {
            Renderer.get().glTexParameteri(llllllllllllIllllIlIlllIIlIIIlll, BufferedImageUtil.lIllllIIIlIIIl[7], llllllllllllIllllIlIlllIIlIIIlIl);
            Renderer.get().glTexParameteri(llllllllllllIllllIlIlllIIlIIIlll, BufferedImageUtil.lIllllIIIlIIIl[8], llllllllllllIllllIlIlllIIIlllIII);
            if (lIIIIIllllllIIIl(Renderer.get().canTextureMirrorClamp() ? 1 : 0)) {
                Renderer.get().glTexParameteri(BufferedImageUtil.lIllllIIIlIIIl[0], BufferedImageUtil.lIllllIIIlIIIl[9], BufferedImageUtil.lIllllIIIlIIIl[10]);
                Renderer.get().glTexParameteri(BufferedImageUtil.lIllllIIIlIIIl[0], BufferedImageUtil.lIllllIIIlIIIl[11], BufferedImageUtil.lIllllIIIlIIIl[10]);
                "".length();
                if (-(0x39 ^ 0x33 ^ (0x9E ^ 0x90)) >= 0) {
                    return null;
                }
            }
            else {
                Renderer.get().glTexParameteri(BufferedImageUtil.lIllllIIIlIIIl[0], BufferedImageUtil.lIllllIIIlIIIl[9], BufferedImageUtil.lIllllIIIlIIIl[12]);
                Renderer.get().glTexParameteri(BufferedImageUtil.lIllllIIIlIIIl[0], BufferedImageUtil.lIllllIIIlIIIl[11], BufferedImageUtil.lIllllIIIlIIIl[12]);
            }
        }
        Renderer.get().glTexImage2D(llllllllllllIllllIlIlllIIlIIIlll, BufferedImageUtil.lIllllIIIlIIIl[3], llllllllllllIllllIlIlllIIIlllIlI, llllllllllllIllllIlIlllIIlIIIIII.getTextureWidth(), llllllllllllIllllIlIlllIIlIIIIII.getTextureHeight(), BufferedImageUtil.lIllllIIIlIIIl[3], llllllllllllIllllIlIlllIIlIIIIlI, BufferedImageUtil.lIllllIIIlIIIl[13], llllllllllllIllllIlIlllIIIlllllI);
        return llllllllllllIllllIlIlllIIlIIIIII;
    }
    
    private static boolean lIIIIIllllllIIlI(final int llllllllllllIllllIlIlllIIIIlIlll, final int llllllllllllIllllIlIlllIIIIlIllI) {
        return llllllllllllIllllIlIlllIIIIlIlll == llllllllllllIllllIlIlllIIIIlIllI;
    }
    
    private static void copyArea(final BufferedImage llllllllllllIllllIlIlllIIIlIIIIl, final int llllllllllllIllllIlIlllIIIlIIIII, final int llllllllllllIllllIlIlllIIIlIIlll, final int llllllllllllIllllIlIlllIIIlIIllI, final int llllllllllllIllllIlIlllIIIlIIlIl, final int llllllllllllIllllIlIlllIIIlIIlII, final int llllllllllllIllllIlIlllIIIIllIll) {
        final Graphics2D llllllllllllIllllIlIlllIIIlIIIlI = (Graphics2D)llllllllllllIllllIlIlllIIIlIIIIl.getGraphics();
        llllllllllllIllllIlIlllIIIlIIIlI.drawImage(llllllllllllIllllIlIlllIIIlIIIIl.getSubimage(llllllllllllIllllIlIlllIIIlIIIII, llllllllllllIllllIlIlllIIIlIIlll, llllllllllllIllllIlIlllIIIlIIllI, llllllllllllIllllIlIlllIIIlIIlIl), llllllllllllIllllIlIlllIIIlIIIII + llllllllllllIllllIlIlllIIIlIIlII, llllllllllllIllllIlIlllIIIlIIlll + llllllllllllIllllIlIlllIIIIllIll, null);
        "".length();
    }
    
    private static void lIIIIIllllllIIII() {
        (lIllllIIIlIIIl = new int[14])[0] = (0xFFFF9DFB & 0x6FE5);
        BufferedImageUtil.lIllllIIIlIIIl[1] = (-(0xFFFFF17B & 0x2EF7) & (0xFFFFBBFE & 0x7D7B));
        BufferedImageUtil.lIllllIIIlIIIl[2] = (-(0xFFFFF9B3 & 0x576F) & (0xFFFFFF73 & 0x77AF));
        BufferedImageUtil.lIllllIIIlIIIl[3] = ((125 + 107 - 198 + 154 ^ 110 + 23 - 2 + 23) & (0x7 ^ 0x3 ^ (0x4A ^ 0x68) ^ -" ".length()));
        BufferedImageUtil.lIllllIIIlIIIl[4] = (0xFFFFFB5F & 0x1DA7);
        BufferedImageUtil.lIllllIIIlIIIl[5] = (0x75 ^ 0x69 ^ (0x3F ^ 0x3));
        BufferedImageUtil.lIllllIIIlIIIl[6] = " ".length();
        BufferedImageUtil.lIllllIIIlIIIl[7] = (-(0xFFFFFD7F & 0x53CF) & (0xFFFFFD4F & 0x7BFF));
        BufferedImageUtil.lIllllIIIlIIIl[8] = (0xFFFFAFBB & 0x7844);
        BufferedImageUtil.lIllllIIIlIIIl[9] = (-(0xFFFFE2FE & 0x5FF7) & (0xFFFFEBFF & 0x7EF7));
        BufferedImageUtil.lIllllIIIlIIIl[10] = (0xFFFF9FEF & 0xE753);
        BufferedImageUtil.lIllllIIIlIIIl[11] = (-(0xFFFFFFB5 & 0x457F) & (0xFFFFEDF7 & 0x7F3F));
        BufferedImageUtil.lIllllIIIlIIIl[12] = (-(0xFFFFFBFD & 0x16F6) & (0xFFFFBFF3 & 0x7BFF));
        BufferedImageUtil.lIllllIIIlIIIl[13] = (0xFFFF9E01 & 0x75FF);
    }
    
    public static Texture getTexture(final String llllllllllllIllllIlIlllIIllIIlII, final BufferedImage llllllllllllIllllIlIlllIIllIIIll) throws IOException {
        final Texture llllllllllllIllllIlIlllIIllIIlIl = getTexture(llllllllllllIllllIlIlllIIllIIlII, llllllllllllIllllIlIlllIIllIIIll, BufferedImageUtil.lIllllIIIlIIIl[0], BufferedImageUtil.lIllllIIIlIIIl[1], BufferedImageUtil.lIllllIIIlIIIl[2], BufferedImageUtil.lIllllIIIlIIIl[2]);
        return llllllllllllIllllIlIlllIIllIIlIl;
    }
}
