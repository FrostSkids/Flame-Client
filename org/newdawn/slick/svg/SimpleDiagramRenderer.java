// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.svg;

import org.newdawn.slick.geom.TexCoordGenerator;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.geom.ShapeRenderer;
import org.newdawn.slick.Color;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.TextureImpl;
import org.newdawn.slick.Graphics;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.opengl.renderer.SGL;

public class SimpleDiagramRenderer
{
    private static final /* synthetic */ int[] lIlllllIIlllIl;
    public /* synthetic */ int list;
    private static final /* synthetic */ String[] lIllllIlIIIIll;
    protected static /* synthetic */ SGL GL;
    public /* synthetic */ Diagram diagram;
    
    private static String lIIIIlIIIlIlllII(final String llllllllllllIllllIIllIllIIIlIlII, final String llllllllllllIllllIIllIllIIIlIIll) {
        try {
            final SecretKeySpec llllllllllllIllllIIllIllIIIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIllIllIIIlIIll.getBytes(StandardCharsets.UTF_8)), SimpleDiagramRenderer.lIlllllIIlllIl[10]), "DES");
            final Cipher llllllllllllIllllIIllIllIIIllIII = Cipher.getInstance("DES");
            llllllllllllIllllIIllIllIIIllIII.init(SimpleDiagramRenderer.lIlllllIIlllIl[4], llllllllllllIllllIIllIllIIIllIIl);
            return new String(llllllllllllIllllIIllIllIIIllIII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIllIllIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIllIllIIIlIlll) {
            llllllllllllIllllIIllIllIIIlIlll.printStackTrace();
            return null;
        }
    }
    
    public void render(final Graphics llllllllllllIllllIIllIllIlIIIIll) {
        if (lIIIIlIlIlIlIlII(this.list, SimpleDiagramRenderer.lIlllllIIlllIl[0])) {
            this.list = SimpleDiagramRenderer.GL.glGenLists(SimpleDiagramRenderer.lIlllllIIlllIl[1]);
            SimpleDiagramRenderer.GL.glNewList(this.list, SimpleDiagramRenderer.lIlllllIIlllIl[2]);
            render(llllllllllllIllllIIllIllIlIIIIll, this.diagram);
            SimpleDiagramRenderer.GL.glEndList();
        }
        SimpleDiagramRenderer.GL.glCallList(this.list);
        TextureImpl.bindNone();
    }
    
    static {
        lIIIIlIlIlIlIIll();
        lIIIIlIIIllIIIII();
        SimpleDiagramRenderer.GL = Renderer.get();
    }
    
    private static boolean lIIIIlIlIlIlIllI(final int llllllllllllIllllIIllIlIlllIllIl) {
        return llllllllllllIllllIIllIlIlllIllIl != 0;
    }
    
    private static String lIIIIlIIIlIllIll(final String llllllllllllIllllIIllIllIIlIIIIl, final String llllllllllllIllllIIllIllIIlIIIII) {
        try {
            final SecretKeySpec llllllllllllIllllIIllIllIIlIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIllIllIIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIllIllIIlIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIllIllIIlIIlIl.init(SimpleDiagramRenderer.lIlllllIIlllIl[4], llllllllllllIllllIIllIllIIlIIllI);
            return new String(llllllllllllIllllIIllIllIIlIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIllIllIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIllIllIIlIIlII) {
            llllllllllllIllllIIllIllIIlIIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIlIlIlIlIlII(final int llllllllllllIllllIIllIlIllllIllI, final int llllllllllllIllllIIllIlIllllIlIl) {
        return llllllllllllIllllIIllIlIllllIllI == llllllllllllIllllIIllIlIllllIlIl;
    }
    
    public SimpleDiagramRenderer(final Diagram llllllllllllIllllIIllIllIlIIlIll) {
        this.list = SimpleDiagramRenderer.lIlllllIIlllIl[0];
        this.diagram = llllllllllllIllllIIllIllIlIIlIll;
    }
    
    private static void lIIIIlIIIllIIIII() {
        (lIllllIlIIIIll = new String[SimpleDiagramRenderer.lIlllllIIlllIl[9]])[SimpleDiagramRenderer.lIlllllIIlllIl[3]] = lIIIIlIIIlIllIll("s7xS7oiqKrA=", "rguin");
        SimpleDiagramRenderer.lIllllIlIIIIll[SimpleDiagramRenderer.lIlllllIIlllIl[1]] = lIIIIlIIIlIlllII("Lnm3Vk9vFq4=", "ZtuBe");
        SimpleDiagramRenderer.lIllllIlIIIIll[SimpleDiagramRenderer.lIlllllIIlllIl[4]] = lIIIIlIIIlIlllIl("Lx8AKA==", "IvlDa");
        SimpleDiagramRenderer.lIllllIlIIIIll[SimpleDiagramRenderer.lIlllllIIlllIl[5]] = lIIIIlIIIlIlllIl("MhAtDQEwHw==", "bQyYD");
        SimpleDiagramRenderer.lIllllIlIIIIll[SimpleDiagramRenderer.lIlllllIIlllIl[6]] = lIIIIlIIIlIllIll("yOzmLgbIwx8=", "xgIjI");
        SimpleDiagramRenderer.lIllllIlIIIIll[SimpleDiagramRenderer.lIlllllIIlllIl[7]] = lIIIIlIIIlIlllII("vW1D2kfw5GQ=", "SHnah");
        SimpleDiagramRenderer.lIllllIlIIIIll[SimpleDiagramRenderer.lIlllllIIlllIl[8]] = lIIIIlIIIlIlllIl("KhEXICY8SBImKS0N", "YeeOM");
    }
    
    public static void render(final Graphics llllllllllllIllllIIllIllIIllIIlI, final Diagram llllllllllllIllllIIllIllIIllIIll) {
        int llllllllllllIllllIIllIllIIllIlIl = SimpleDiagramRenderer.lIlllllIIlllIl[3];
        while (lIIIIlIlIlIlIlIl(llllllllllllIllllIIllIllIIllIlIl, llllllllllllIllllIIllIllIIllIIll.getFigureCount())) {
            final Figure llllllllllllIllllIIllIllIIllIllI = llllllllllllIllllIIllIllIIllIIll.getFigure(llllllllllllIllllIIllIllIIllIlIl);
            if (lIIIIlIlIlIlIllI(llllllllllllIllllIIllIllIIllIllI.getData().isFilled() ? 1 : 0)) {
                if (lIIIIlIlIlIlIllI(llllllllllllIllllIIllIllIIllIllI.getData().isColor(SimpleDiagramRenderer.lIllllIlIIIIll[SimpleDiagramRenderer.lIlllllIIlllIl[3]]) ? 1 : 0)) {
                    llllllllllllIllllIIllIllIIllIIlI.setColor(llllllllllllIllllIIllIllIIllIllI.getData().getAsColor(SimpleDiagramRenderer.lIllllIlIIIIll[SimpleDiagramRenderer.lIlllllIIlllIl[1]]));
                    llllllllllllIllllIIllIllIIllIIlI.fill(llllllllllllIllllIIllIllIIllIIll.getFigure(llllllllllllIllllIIllIllIIllIlIl).getShape());
                    llllllllllllIllllIIllIllIIllIIlI.setAntiAlias((boolean)(SimpleDiagramRenderer.lIlllllIIlllIl[1] != 0));
                    llllllllllllIllllIIllIllIIllIIlI.draw(llllllllllllIllllIIllIllIIllIIll.getFigure(llllllllllllIllllIIllIllIIllIlIl).getShape());
                    llllllllllllIllllIIllIllIIllIIlI.setAntiAlias((boolean)(SimpleDiagramRenderer.lIlllllIIlllIl[3] != 0));
                }
                final String llllllllllllIllllIIllIllIIllIlll = llllllllllllIllllIIllIllIIllIllI.getData().getAsReference(SimpleDiagramRenderer.lIllllIlIIIIll[SimpleDiagramRenderer.lIlllllIIlllIl[4]]);
                if (lIIIIlIlIlIlIlll(llllllllllllIllllIIllIllIIllIIll.getPatternDef(llllllllllllIllllIIllIllIIllIlll))) {
                    System.out.println(SimpleDiagramRenderer.lIllllIlIIIIll[SimpleDiagramRenderer.lIlllllIIlllIl[5]]);
                }
                if (lIIIIlIlIlIlIlll(llllllllllllIllllIIllIllIIllIIll.getGradient(llllllllllllIllllIIllIllIIllIlll))) {
                    final Gradient llllllllllllIllllIIllIllIIlllIlI = llllllllllllIllllIIllIllIIllIIll.getGradient(llllllllllllIllllIIllIllIIllIlll);
                    final Shape llllllllllllIllllIIllIllIIlllIIl = llllllllllllIllllIIllIllIIllIIll.getFigure(llllllllllllIllllIIllIllIIllIlIl).getShape();
                    TexCoordGenerator llllllllllllIllllIIllIllIIlllIII = null;
                    if (lIIIIlIlIlIlIllI(llllllllllllIllllIIllIllIIlllIlI.isRadial() ? 1 : 0)) {
                        llllllllllllIllllIIllIllIIlllIII = new RadialGradientFill(llllllllllllIllllIIllIllIIlllIIl, llllllllllllIllllIIllIllIIllIIll.getFigure(llllllllllllIllllIIllIllIIllIlIl).getTransform(), llllllllllllIllllIIllIllIIlllIlI);
                        "".length();
                        if (-" ".length() == "   ".length()) {
                            return;
                        }
                    }
                    else {
                        llllllllllllIllllIIllIllIIlllIII = new LinearGradientFill(llllllllllllIllllIIllIllIIlllIIl, llllllllllllIllllIIllIllIIllIIll.getFigure(llllllllllllIllllIIllIllIIllIlIl).getTransform(), llllllllllllIllllIIllIllIIlllIlI);
                    }
                    Color.white.bind();
                    ShapeRenderer.texture(llllllllllllIllllIIllIllIIlllIIl, llllllllllllIllllIIllIllIIlllIlI.getImage(), llllllllllllIllllIIllIllIIlllIII);
                }
            }
            if (lIIIIlIlIlIlIllI(llllllllllllIllllIIllIllIIllIllI.getData().isStroked() ? 1 : 0) && lIIIIlIlIlIlIllI(llllllllllllIllllIIllIllIIllIllI.getData().isColor(SimpleDiagramRenderer.lIllllIlIIIIll[SimpleDiagramRenderer.lIlllllIIlllIl[6]]) ? 1 : 0)) {
                llllllllllllIllllIIllIllIIllIIlI.setColor(llllllllllllIllllIIllIllIIllIllI.getData().getAsColor(SimpleDiagramRenderer.lIllllIlIIIIll[SimpleDiagramRenderer.lIlllllIIlllIl[7]]));
                llllllllllllIllllIIllIllIIllIIlI.setLineWidth(llllllllllllIllllIIllIllIIllIllI.getData().getAsFloat(SimpleDiagramRenderer.lIllllIlIIIIll[SimpleDiagramRenderer.lIlllllIIlllIl[8]]));
                llllllllllllIllllIIllIllIIllIIlI.setAntiAlias((boolean)(SimpleDiagramRenderer.lIlllllIIlllIl[1] != 0));
                llllllllllllIllllIIllIllIIllIIlI.draw(llllllllllllIllllIIllIllIIllIIll.getFigure(llllllllllllIllllIIllIllIIllIlIl).getShape());
                llllllllllllIllllIIllIllIIllIIlI.setAntiAlias((boolean)(SimpleDiagramRenderer.lIlllllIIlllIl[3] != 0));
                llllllllllllIllllIIllIllIIllIIlI.resetLineWidth();
            }
            ++llllllllllllIllllIIllIllIIllIlIl;
            "".length();
            if ((0xB1 ^ 0xB5) == 0x0) {
                return;
            }
        }
    }
    
    private static boolean lIIIIlIlIlIlIlIl(final int llllllllllllIllllIIllIlIllllIIlI, final int llllllllllllIllllIIllIlIllllIIIl) {
        return llllllllllllIllllIIllIlIllllIIlI < llllllllllllIllllIIllIlIllllIIIl;
    }
    
    private static boolean lIIIIlIlIlIlIlll(final Object llllllllllllIllllIIllIlIlllIllll) {
        return llllllllllllIllllIIllIlIlllIllll != null;
    }
    
    private static String lIIIIlIIIlIlllIl(String llllllllllllIllllIIllIllIIIIIIIl, final String llllllllllllIllllIIllIllIIIIIIII) {
        llllllllllllIllllIIllIllIIIIIIIl = new String(Base64.getDecoder().decode(llllllllllllIllllIIllIllIIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIIllIllIIIIIlII = new StringBuilder();
        final char[] llllllllllllIllllIIllIllIIIIIIll = llllllllllllIllllIIllIllIIIIIIII.toCharArray();
        int llllllllllllIllllIIllIllIIIIIIlI = SimpleDiagramRenderer.lIlllllIIlllIl[3];
        final float llllllllllllIllllIIllIlIllllllII = (Object)llllllllllllIllllIIllIllIIIIIIIl.toCharArray();
        final byte llllllllllllIllllIIllIlIlllllIll = (byte)llllllllllllIllllIIllIlIllllllII.length;
        Exception llllllllllllIllllIIllIlIlllllIlI = (Exception)SimpleDiagramRenderer.lIlllllIIlllIl[3];
        while (lIIIIlIlIlIlIlIl((int)llllllllllllIllllIIllIlIlllllIlI, llllllllllllIllllIIllIlIlllllIll)) {
            final char llllllllllllIllllIIllIllIIIIIlll = llllllllllllIllllIIllIlIllllllII[llllllllllllIllllIIllIlIlllllIlI];
            llllllllllllIllllIIllIllIIIIIlII.append((char)(llllllllllllIllllIIllIllIIIIIlll ^ llllllllllllIllllIIllIllIIIIIIll[llllllllllllIllllIIllIllIIIIIIlI % llllllllllllIllllIIllIllIIIIIIll.length]));
            "".length();
            ++llllllllllllIllllIIllIllIIIIIIlI;
            ++llllllllllllIllllIIllIlIlllllIlI;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIIllIllIIIIIlII);
    }
    
    private static void lIIIIlIlIlIlIIll() {
        (lIlllllIIlllIl = new int[11])[0] = -" ".length();
        SimpleDiagramRenderer.lIlllllIIlllIl[1] = " ".length();
        SimpleDiagramRenderer.lIlllllIIlllIl[2] = (-(0xFFFFD297 & 0x6DFE) & (0xFFFFF3BF & 0x5FD5));
        SimpleDiagramRenderer.lIlllllIIlllIl[3] = ((0x44 ^ 0x30 ^ (0x40 ^ 0x56)) & (0x5D ^ 0x24 ^ (0x16 ^ 0xD) ^ -" ".length()));
        SimpleDiagramRenderer.lIlllllIIlllIl[4] = "  ".length();
        SimpleDiagramRenderer.lIlllllIIlllIl[5] = "   ".length();
        SimpleDiagramRenderer.lIlllllIIlllIl[6] = (0xD2 ^ 0xC0 ^ (0x45 ^ 0x53));
        SimpleDiagramRenderer.lIlllllIIlllIl[7] = (74 + 183 - 225 + 152 ^ 59 + 79 - 47 + 98);
        SimpleDiagramRenderer.lIlllllIIlllIl[8] = (0x4A ^ 0xF ^ (0xE ^ 0x4D));
        SimpleDiagramRenderer.lIlllllIIlllIl[9] = (0x9B ^ 0x9C);
        SimpleDiagramRenderer.lIlllllIIlllIl[10] = (0x8B ^ 0x83);
    }
}
