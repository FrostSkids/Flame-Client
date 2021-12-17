// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.util.Vec3;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.WorldRenderer;

public class TexturedQuad
{
    public /* synthetic */ int nVertices;
    private /* synthetic */ boolean invertNormal;
    public /* synthetic */ PositionTextureVertex[] vertexPositions;
    private static final /* synthetic */ int[] lIlIIllIIIIIIl;
    
    public TexturedQuad(final PositionTextureVertex[] lllllllllllllIIIllIlIIllIllIllll) {
        this.vertexPositions = lllllllllllllIIIllIlIIllIllIllll;
        this.nVertices = lllllllllllllIIIllIlIIllIllIllll.length;
    }
    
    public void flipFace() {
        final PositionTextureVertex[] lllllllllllllIIIllIlIIllIlIIllII = new PositionTextureVertex[this.vertexPositions.length];
        int lllllllllllllIIIllIlIIllIlIIlIll = TexturedQuad.lIlIIllIIIIIIl[0];
        "".length();
        if (null != null) {
            return;
        }
        while (!lllIIlllIIllllI(lllllllllllllIIIllIlIIllIlIIlIll, this.vertexPositions.length)) {
            lllllllllllllIIIllIlIIllIlIIllII[lllllllllllllIIIllIlIIllIlIIlIll] = this.vertexPositions[this.vertexPositions.length - lllllllllllllIIIllIlIIllIlIIlIll - TexturedQuad.lIlIIllIIIIIIl[1]];
            ++lllllllllllllIIIllIlIIllIlIIlIll;
        }
        this.vertexPositions = lllllllllllllIIIllIlIIllIlIIllII;
    }
    
    private static boolean lllIIlllIIlllll(final int lllllllllllllIIIllIlIIllIIlIIIIl) {
        return lllllllllllllIIIllIlIIllIIlIIIIl != 0;
    }
    
    private static boolean lllIIlllIIllllI(final int lllllllllllllIIIllIlIIllIIlIIlII, final int lllllllllllllIIIllIlIIllIIlIIIll) {
        return lllllllllllllIIIllIlIIllIIlIIlII >= lllllllllllllIIIllIlIIllIIlIIIll;
    }
    
    public void draw(final WorldRenderer lllllllllllllIIIllIlIIllIIllIIII, final float lllllllllllllIIIllIlIIllIIlIllll) {
        final Vec3 lllllllllllllIIIllIlIIllIIlllIIl = this.vertexPositions[TexturedQuad.lIlIIllIIIIIIl[1]].vector3D.subtractReverse(this.vertexPositions[TexturedQuad.lIlIIllIIIIIIl[0]].vector3D);
        final Vec3 lllllllllllllIIIllIlIIllIIlllIII = this.vertexPositions[TexturedQuad.lIlIIllIIIIIIl[1]].vector3D.subtractReverse(this.vertexPositions[TexturedQuad.lIlIIllIIIIIIl[2]].vector3D);
        final Vec3 lllllllllllllIIIllIlIIllIIllIlll = lllllllllllllIIIllIlIIllIIlllIII.crossProduct(lllllllllllllIIIllIlIIllIIlllIIl).normalize();
        float lllllllllllllIIIllIlIIllIIllIllI = (float)lllllllllllllIIIllIlIIllIIllIlll.xCoord;
        float lllllllllllllIIIllIlIIllIIllIlIl = (float)lllllllllllllIIIllIlIIllIIllIlll.yCoord;
        float lllllllllllllIIIllIlIIllIIllIlII = (float)lllllllllllllIIIllIlIIllIIllIlll.zCoord;
        if (lllIIlllIIlllll(this.invertNormal ? 1 : 0)) {
            lllllllllllllIIIllIlIIllIIllIllI = -lllllllllllllIIIllIlIIllIIllIllI;
            lllllllllllllIIIllIlIIllIIllIlIl = -lllllllllllllIIIllIlIIllIIllIlIl;
            lllllllllllllIIIllIlIIllIIllIlII = -lllllllllllllIIIllIlIIllIIllIlII;
        }
        lllllllllllllIIIllIlIIllIIllIIII.begin(TexturedQuad.lIlIIllIIIIIIl[4], DefaultVertexFormats.OLDMODEL_POSITION_TEX_NORMAL);
        int lllllllllllllIIIllIlIIllIIllIIll = TexturedQuad.lIlIIllIIIIIIl[0];
        "".length();
        if ((0x9D ^ 0xC0 ^ (0x34 ^ 0x6D)) < "   ".length()) {
            return;
        }
        while (!lllIIlllIIllllI(lllllllllllllIIIllIlIIllIIllIIll, TexturedQuad.lIlIIllIIIIIIl[5])) {
            final PositionTextureVertex lllllllllllllIIIllIlIIllIIllIIlI = this.vertexPositions[lllllllllllllIIIllIlIIllIIllIIll];
            lllllllllllllIIIllIlIIllIIllIIII.pos(lllllllllllllIIIllIlIIllIIllIIlI.vector3D.xCoord * lllllllllllllIIIllIlIIllIIlIllll, lllllllllllllIIIllIlIIllIIllIIlI.vector3D.yCoord * lllllllllllllIIIllIlIIllIIlIllll, lllllllllllllIIIllIlIIllIIllIIlI.vector3D.zCoord * lllllllllllllIIIllIlIIllIIlIllll).tex(lllllllllllllIIIllIlIIllIIllIIlI.texturePositionX, lllllllllllllIIIllIlIIllIIllIIlI.texturePositionY).normal(lllllllllllllIIIllIlIIllIIllIllI, lllllllllllllIIIllIlIIllIIllIlIl, lllllllllllllIIIllIlIIllIIllIlII).endVertex();
            ++lllllllllllllIIIllIlIIllIIllIIll;
        }
        Tessellator.getInstance().draw();
    }
    
    public TexturedQuad(final PositionTextureVertex[] lllllllllllllIIIllIlIIllIlIllIIl, final int lllllllllllllIIIllIlIIllIlIllIII, final int lllllllllllllIIIllIlIIllIlIlIlll, final int lllllllllllllIIIllIlIIllIlIlIllI, final int lllllllllllllIIIllIlIIllIlIlIlIl, final float lllllllllllllIIIllIlIIllIlIllllI, final float lllllllllllllIIIllIlIIllIlIlIIll) {
        this(lllllllllllllIIIllIlIIllIlIllIIl);
        final float lllllllllllllIIIllIlIIllIlIlllII = 0.0f / lllllllllllllIIIllIlIIllIlIllllI;
        final float lllllllllllllIIIllIlIIllIlIllIll = 0.0f / lllllllllllllIIIllIlIIllIlIlIIll;
        lllllllllllllIIIllIlIIllIlIllIIl[TexturedQuad.lIlIIllIIIIIIl[0]] = lllllllllllllIIIllIlIIllIlIllIIl[TexturedQuad.lIlIIllIIIIIIl[0]].setTexturePosition(lllllllllllllIIIllIlIIllIlIlIllI / lllllllllllllIIIllIlIIllIlIllllI - lllllllllllllIIIllIlIIllIlIlllII, lllllllllllllIIIllIlIIllIlIlIlll / lllllllllllllIIIllIlIIllIlIlIIll + lllllllllllllIIIllIlIIllIlIllIll);
        lllllllllllllIIIllIlIIllIlIllIIl[TexturedQuad.lIlIIllIIIIIIl[1]] = lllllllllllllIIIllIlIIllIlIllIIl[TexturedQuad.lIlIIllIIIIIIl[1]].setTexturePosition(lllllllllllllIIIllIlIIllIlIllIII / lllllllllllllIIIllIlIIllIlIllllI + lllllllllllllIIIllIlIIllIlIlllII, lllllllllllllIIIllIlIIllIlIlIlll / lllllllllllllIIIllIlIIllIlIlIIll + lllllllllllllIIIllIlIIllIlIllIll);
        lllllllllllllIIIllIlIIllIlIllIIl[TexturedQuad.lIlIIllIIIIIIl[2]] = lllllllllllllIIIllIlIIllIlIllIIl[TexturedQuad.lIlIIllIIIIIIl[2]].setTexturePosition(lllllllllllllIIIllIlIIllIlIllIII / lllllllllllllIIIllIlIIllIlIllllI + lllllllllllllIIIllIlIIllIlIlllII, lllllllllllllIIIllIlIIllIlIlIlIl / lllllllllllllIIIllIlIIllIlIlIIll - lllllllllllllIIIllIlIIllIlIllIll);
        lllllllllllllIIIllIlIIllIlIllIIl[TexturedQuad.lIlIIllIIIIIIl[3]] = lllllllllllllIIIllIlIIllIlIllIIl[TexturedQuad.lIlIIllIIIIIIl[3]].setTexturePosition(lllllllllllllIIIllIlIIllIlIlIllI / lllllllllllllIIIllIlIIllIlIllllI - lllllllllllllIIIllIlIIllIlIlllII, lllllllllllllIIIllIlIIllIlIlIlIl / lllllllllllllIIIllIlIIllIlIlIIll - lllllllllllllIIIllIlIIllIlIllIll);
    }
    
    static {
        lllIIlllIIlllIl();
    }
    
    private static void lllIIlllIIlllIl() {
        (lIlIIllIIIIIIl = new int[6])[0] = ((114 + 129 - 215 + 154 ^ 82 + 123 - 204 + 135) & (0xB6 ^ 0x94 ^ (0xD ^ 0x11) ^ -" ".length()));
        TexturedQuad.lIlIIllIIIIIIl[1] = " ".length();
        TexturedQuad.lIlIIllIIIIIIl[2] = "  ".length();
        TexturedQuad.lIlIIllIIIIIIl[3] = "   ".length();
        TexturedQuad.lIlIIllIIIIIIl[4] = (173 + 163 - 331 + 194 ^ 119 + 117 - 132 + 88);
        TexturedQuad.lIlIIllIIIIIIl[5] = (0xA6 ^ 0xA2);
    }
}
