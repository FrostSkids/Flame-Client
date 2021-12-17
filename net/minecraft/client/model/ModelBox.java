// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.client.renderer.WorldRenderer;

public class ModelBox
{
    private /* synthetic */ TexturedQuad[] quadList;
    public final /* synthetic */ float posY2;
    public final /* synthetic */ float posX1;
    public final /* synthetic */ float posZ2;
    public final /* synthetic */ float posY1;
    private static final /* synthetic */ int[] lIlllIllIIlIIl;
    public final /* synthetic */ float posX2;
    public final /* synthetic */ float posZ1;
    private /* synthetic */ PositionTextureVertex[] vertexPositions;
    public /* synthetic */ String boxName;
    
    private static void lIIIIIllIIlIlIlI() {
        (lIlllIllIIlIIl = new int[9])[0] = (((0x47 ^ 0x71) & ~(0x1A ^ 0x2C)) ^ (0xC9 ^ 0xC1));
        ModelBox.lIlllIllIIlIIl[1] = (0x0 ^ 0x6);
        ModelBox.lIlllIllIIlIIl[2] = ((0xDC ^ 0xC2 ^ (0x13 ^ 0x1)) & (" ".length() ^ (0x58 ^ 0x55) ^ -" ".length()));
        ModelBox.lIlllIllIIlIIl[3] = " ".length();
        ModelBox.lIlllIllIIlIIl[4] = "  ".length();
        ModelBox.lIlllIllIIlIIl[5] = "   ".length();
        ModelBox.lIlllIllIIlIIl[6] = (0x26 ^ 0x22);
        ModelBox.lIlllIllIIlIIl[7] = (0x2E ^ 0x43 ^ (0x78 ^ 0x10));
        ModelBox.lIlllIllIIlIIl[8] = (0x14 ^ 0x13);
    }
    
    public ModelBox(final ModelRenderer llllllllllllIllllIlllIlIllllIlII, final int llllllllllllIllllIlllIlIllllIIll, final int llllllllllllIllllIlllIlIlllIIlll, final float llllllllllllIllllIlllIlIllllIIIl, final float llllllllllllIllllIlllIlIllllIIII, final float llllllllllllIllllIlllIlIlllIllll, final int llllllllllllIllllIlllIlIlllIlllI, final int llllllllllllIllllIlllIlIlllIIIlI, final int llllllllllllIllllIlllIlIlllIIIIl, final float llllllllllllIllllIlllIlIlllIIIII) {
        this(llllllllllllIllllIlllIlIllllIlII, llllllllllllIllllIlllIlIllllIIll, llllllllllllIllllIlllIlIlllIIlll, llllllllllllIllllIlllIlIllllIIIl, llllllllllllIllllIlllIlIllllIIII, llllllllllllIllllIlllIlIlllIllll, llllllllllllIllllIlllIlIlllIlllI, llllllllllllIllllIlllIlIlllIIIlI, llllllllllllIllllIlllIlIlllIIIIl, llllllllllllIllllIlllIlIlllIIIII, llllllllllllIllllIlllIlIllllIlII.mirror);
    }
    
    public ModelBox setBoxName(final String llllllllllllIllllIlllIlIlIIIIlIl) {
        this.boxName = llllllllllllIllllIlllIlIlIIIIlIl;
        return this;
    }
    
    private static boolean lIIIIIllIIlIlIll(final int llllllllllllIllllIlllIlIIlllllll) {
        return llllllllllllIllllIlllIlIIlllllll != 0;
    }
    
    private static boolean lIIIIIllIIlIllII(final int llllllllllllIllllIlllIlIlIIIIIlI, final int llllllllllllIllllIlllIlIlIIIIIIl) {
        return llllllllllllIllllIlllIlIlIIIIIlI >= llllllllllllIllllIlllIlIlIIIIIIl;
    }
    
    public ModelBox(final ModelRenderer llllllllllllIllllIlllIlIlIlIllIl, final int llllllllllllIllllIlllIlIlIlIllII, final int llllllllllllIllllIlllIlIllIIIlII, float llllllllllllIllllIlllIlIllIIIIll, float llllllllllllIllllIlllIlIllIIIIlI, float llllllllllllIllllIlllIlIlIlIlIII, final int llllllllllllIllllIlllIlIlIlIIlll, final int llllllllllllIllllIlllIlIlIlIIllI, final int llllllllllllIllllIlllIlIlIlIIlIl, final float llllllllllllIllllIlllIlIlIlIIlII, final boolean llllllllllllIllllIlllIlIlIlIIIll) {
        this.posX1 = llllllllllllIllllIlllIlIllIIIIll;
        this.posY1 = llllllllllllIllllIlllIlIllIIIIlI;
        this.posZ1 = llllllllllllIllllIlllIlIlIlIlIII;
        this.posX2 = llllllllllllIllllIlllIlIllIIIIll + llllllllllllIllllIlllIlIlIlIIlll;
        this.posY2 = llllllllllllIllllIlllIlIllIIIIlI + llllllllllllIllllIlllIlIlIlIIllI;
        this.posZ2 = llllllllllllIllllIlllIlIlIlIlIII + llllllllllllIllllIlllIlIlIlIIlIl;
        this.vertexPositions = new PositionTextureVertex[ModelBox.lIlllIllIIlIIl[0]];
        this.quadList = new TexturedQuad[ModelBox.lIlllIllIIlIIl[1]];
        float llllllllllllIllllIlllIlIlIlllIll = llllllllllllIllllIlllIlIllIIIIll + llllllllllllIllllIlllIlIlIlIIlll;
        float llllllllllllIllllIlllIlIlIlllIlI = llllllllllllIllllIlllIlIllIIIIlI + llllllllllllIllllIlllIlIlIlIIllI;
        float llllllllllllIllllIlllIlIlIlllIIl = llllllllllllIllllIlllIlIlIlIlIII + llllllllllllIllllIlllIlIlIlIIlIl;
        llllllllllllIllllIlllIlIllIIIIll -= llllllllllllIllllIlllIlIlIlIIlII;
        llllllllllllIllllIlllIlIllIIIIlI -= llllllllllllIllllIlllIlIlIlIIlII;
        llllllllllllIllllIlllIlIlIlIlIII -= llllllllllllIllllIlllIlIlIlIIlII;
        llllllllllllIllllIlllIlIlIlllIll += llllllllllllIllllIlllIlIlIlIIlII;
        llllllllllllIllllIlllIlIlIlllIlI += llllllllllllIllllIlllIlIlIlIIlII;
        llllllllllllIllllIlllIlIlIlllIIl += llllllllllllIllllIlllIlIlIlIIlII;
        if (lIIIIIllIIlIlIll(llllllllllllIllllIlllIlIlIlIIIll ? 1 : 0)) {
            final float llllllllllllIllllIlllIlIlIlllIII = llllllllllllIllllIlllIlIlIlllIll;
            llllllllllllIllllIlllIlIlIlllIll = llllllllllllIllllIlllIlIllIIIIll;
            llllllllllllIllllIlllIlIllIIIIll = llllllllllllIllllIlllIlIlIlllIII;
        }
        final PositionTextureVertex llllllllllllIllllIlllIlIlIllIlll = new PositionTextureVertex(llllllllllllIllllIlllIlIllIIIIll, llllllllllllIllllIlllIlIllIIIIlI, llllllllllllIllllIlllIlIlIlIlIII, 0.0f, 0.0f);
        final PositionTextureVertex llllllllllllIllllIlllIlIlIllIllI = new PositionTextureVertex(llllllllllllIllllIlllIlIlIlllIll, llllllllllllIllllIlllIlIllIIIIlI, llllllllllllIllllIlllIlIlIlIlIII, 0.0f, 8.0f);
        final PositionTextureVertex llllllllllllIllllIlllIlIlIllIlIl = new PositionTextureVertex(llllllllllllIllllIlllIlIlIlllIll, llllllllllllIllllIlllIlIlIlllIlI, llllllllllllIllllIlllIlIlIlIlIII, 8.0f, 8.0f);
        final PositionTextureVertex llllllllllllIllllIlllIlIlIllIlII = new PositionTextureVertex(llllllllllllIllllIlllIlIllIIIIll, llllllllllllIllllIlllIlIlIlllIlI, llllllllllllIllllIlllIlIlIlIlIII, 8.0f, 0.0f);
        final PositionTextureVertex llllllllllllIllllIlllIlIlIllIIll = new PositionTextureVertex(llllllllllllIllllIlllIlIllIIIIll, llllllllllllIllllIlllIlIllIIIIlI, llllllllllllIllllIlllIlIlIlllIIl, 0.0f, 0.0f);
        final PositionTextureVertex llllllllllllIllllIlllIlIlIllIIlI = new PositionTextureVertex(llllllllllllIllllIlllIlIlIlllIll, llllllllllllIllllIlllIlIllIIIIlI, llllllllllllIllllIlllIlIlIlllIIl, 0.0f, 8.0f);
        final PositionTextureVertex llllllllllllIllllIlllIlIlIllIIIl = new PositionTextureVertex(llllllllllllIllllIlllIlIlIlllIll, llllllllllllIllllIlllIlIlIlllIlI, llllllllllllIllllIlllIlIlIlllIIl, 8.0f, 8.0f);
        final PositionTextureVertex llllllllllllIllllIlllIlIlIllIIII = new PositionTextureVertex(llllllllllllIllllIlllIlIllIIIIll, llllllllllllIllllIlllIlIlIlllIlI, llllllllllllIllllIlllIlIlIlllIIl, 8.0f, 0.0f);
        this.vertexPositions[ModelBox.lIlllIllIIlIIl[2]] = llllllllllllIllllIlllIlIlIllIlll;
        this.vertexPositions[ModelBox.lIlllIllIIlIIl[3]] = llllllllllllIllllIlllIlIlIllIllI;
        this.vertexPositions[ModelBox.lIlllIllIIlIIl[4]] = llllllllllllIllllIlllIlIlIllIlIl;
        this.vertexPositions[ModelBox.lIlllIllIIlIIl[5]] = llllllllllllIllllIlllIlIlIllIlII;
        this.vertexPositions[ModelBox.lIlllIllIIlIIl[6]] = llllllllllllIllllIlllIlIlIllIIll;
        this.vertexPositions[ModelBox.lIlllIllIIlIIl[7]] = llllllllllllIllllIlllIlIlIllIIlI;
        this.vertexPositions[ModelBox.lIlllIllIIlIIl[1]] = llllllllllllIllllIlllIlIlIllIIIl;
        this.vertexPositions[ModelBox.lIlllIllIIlIIl[8]] = llllllllllllIllllIlllIlIlIllIIII;
        final TexturedQuad[] quadList = this.quadList;
        final int n = ModelBox.lIlllIllIIlIIl[2];
        final PositionTextureVertex[] lllllllllllllIIIllIlIIllIlIllIIl = new PositionTextureVertex[ModelBox.lIlllIllIIlIIl[6]];
        lllllllllllllIIIllIlIIllIlIllIIl[ModelBox.lIlllIllIIlIIl[2]] = llllllllllllIllllIlllIlIlIllIIlI;
        lllllllllllllIIIllIlIIllIlIllIIl[ModelBox.lIlllIllIIlIIl[3]] = llllllllllllIllllIlllIlIlIllIllI;
        lllllllllllllIIIllIlIIllIlIllIIl[ModelBox.lIlllIllIIlIIl[4]] = llllllllllllIllllIlllIlIlIllIlIl;
        lllllllllllllIIIllIlIIllIlIllIIl[ModelBox.lIlllIllIIlIIl[5]] = llllllllllllIllllIlllIlIlIllIIIl;
        quadList[n] = new TexturedQuad(lllllllllllllIIIllIlIIllIlIllIIl, llllllllllllIllllIlllIlIlIlIllII + llllllllllllIllllIlllIlIlIlIIlIl + llllllllllllIllllIlllIlIlIlIIlll, llllllllllllIllllIlllIlIllIIIlII + llllllllllllIllllIlllIlIlIlIIlIl, llllllllllllIllllIlllIlIlIlIllII + llllllllllllIllllIlllIlIlIlIIlIl + llllllllllllIllllIlllIlIlIlIIlll + llllllllllllIllllIlllIlIlIlIIlIl, llllllllllllIllllIlllIlIllIIIlII + llllllllllllIllllIlllIlIlIlIIlIl + llllllllllllIllllIlllIlIlIlIIllI, llllllllllllIllllIlllIlIlIlIllIl.textureWidth, llllllllllllIllllIlllIlIlIlIllIl.textureHeight);
        final TexturedQuad[] quadList2 = this.quadList;
        final int n2 = ModelBox.lIlllIllIIlIIl[3];
        final PositionTextureVertex[] lllllllllllllIIIllIlIIllIlIllIIl2 = new PositionTextureVertex[ModelBox.lIlllIllIIlIIl[6]];
        lllllllllllllIIIllIlIIllIlIllIIl2[ModelBox.lIlllIllIIlIIl[2]] = llllllllllllIllllIlllIlIlIllIlll;
        lllllllllllllIIIllIlIIllIlIllIIl2[ModelBox.lIlllIllIIlIIl[3]] = llllllllllllIllllIlllIlIlIllIIll;
        lllllllllllllIIIllIlIIllIlIllIIl2[ModelBox.lIlllIllIIlIIl[4]] = llllllllllllIllllIlllIlIlIllIIII;
        lllllllllllllIIIllIlIIllIlIllIIl2[ModelBox.lIlllIllIIlIIl[5]] = llllllllllllIllllIlllIlIlIllIlII;
        quadList2[n2] = new TexturedQuad(lllllllllllllIIIllIlIIllIlIllIIl2, llllllllllllIllllIlllIlIlIlIllII, llllllllllllIllllIlllIlIllIIIlII + llllllllllllIllllIlllIlIlIlIIlIl, llllllllllllIllllIlllIlIlIlIllII + llllllllllllIllllIlllIlIlIlIIlIl, llllllllllllIllllIlllIlIllIIIlII + llllllllllllIllllIlllIlIlIlIIlIl + llllllllllllIllllIlllIlIlIlIIllI, llllllllllllIllllIlllIlIlIlIllIl.textureWidth, llllllllllllIllllIlllIlIlIlIllIl.textureHeight);
        final TexturedQuad[] quadList3 = this.quadList;
        final int n3 = ModelBox.lIlllIllIIlIIl[4];
        final PositionTextureVertex[] lllllllllllllIIIllIlIIllIlIllIIl3 = new PositionTextureVertex[ModelBox.lIlllIllIIlIIl[6]];
        lllllllllllllIIIllIlIIllIlIllIIl3[ModelBox.lIlllIllIIlIIl[2]] = llllllllllllIllllIlllIlIlIllIIlI;
        lllllllllllllIIIllIlIIllIlIllIIl3[ModelBox.lIlllIllIIlIIl[3]] = llllllllllllIllllIlllIlIlIllIIll;
        lllllllllllllIIIllIlIIllIlIllIIl3[ModelBox.lIlllIllIIlIIl[4]] = llllllllllllIllllIlllIlIlIllIlll;
        lllllllllllllIIIllIlIIllIlIllIIl3[ModelBox.lIlllIllIIlIIl[5]] = llllllllllllIllllIlllIlIlIllIllI;
        quadList3[n3] = new TexturedQuad(lllllllllllllIIIllIlIIllIlIllIIl3, llllllllllllIllllIlllIlIlIlIllII + llllllllllllIllllIlllIlIlIlIIlIl, llllllllllllIllllIlllIlIllIIIlII, llllllllllllIllllIlllIlIlIlIllII + llllllllllllIllllIlllIlIlIlIIlIl + llllllllllllIllllIlllIlIlIlIIlll, llllllllllllIllllIlllIlIllIIIlII + llllllllllllIllllIlllIlIlIlIIlIl, llllllllllllIllllIlllIlIlIlIllIl.textureWidth, llllllllllllIllllIlllIlIlIlIllIl.textureHeight);
        final TexturedQuad[] quadList4 = this.quadList;
        final int n4 = ModelBox.lIlllIllIIlIIl[5];
        final PositionTextureVertex[] lllllllllllllIIIllIlIIllIlIllIIl4 = new PositionTextureVertex[ModelBox.lIlllIllIIlIIl[6]];
        lllllllllllllIIIllIlIIllIlIllIIl4[ModelBox.lIlllIllIIlIIl[2]] = llllllllllllIllllIlllIlIlIllIlIl;
        lllllllllllllIIIllIlIIllIlIllIIl4[ModelBox.lIlllIllIIlIIl[3]] = llllllllllllIllllIlllIlIlIllIlII;
        lllllllllllllIIIllIlIIllIlIllIIl4[ModelBox.lIlllIllIIlIIl[4]] = llllllllllllIllllIlllIlIlIllIIII;
        lllllllllllllIIIllIlIIllIlIllIIl4[ModelBox.lIlllIllIIlIIl[5]] = llllllllllllIllllIlllIlIlIllIIIl;
        quadList4[n4] = new TexturedQuad(lllllllllllllIIIllIlIIllIlIllIIl4, llllllllllllIllllIlllIlIlIlIllII + llllllllllllIllllIlllIlIlIlIIlIl + llllllllllllIllllIlllIlIlIlIIlll, llllllllllllIllllIlllIlIllIIIlII + llllllllllllIllllIlllIlIlIlIIlIl, llllllllllllIllllIlllIlIlIlIllII + llllllllllllIllllIlllIlIlIlIIlIl + llllllllllllIllllIlllIlIlIlIIlll + llllllllllllIllllIlllIlIlIlIIlll, llllllllllllIllllIlllIlIllIIIlII, llllllllllllIllllIlllIlIlIlIllIl.textureWidth, llllllllllllIllllIlllIlIlIlIllIl.textureHeight);
        final TexturedQuad[] quadList5 = this.quadList;
        final int n5 = ModelBox.lIlllIllIIlIIl[6];
        final PositionTextureVertex[] lllllllllllllIIIllIlIIllIlIllIIl5 = new PositionTextureVertex[ModelBox.lIlllIllIIlIIl[6]];
        lllllllllllllIIIllIlIIllIlIllIIl5[ModelBox.lIlllIllIIlIIl[2]] = llllllllllllIllllIlllIlIlIllIllI;
        lllllllllllllIIIllIlIIllIlIllIIl5[ModelBox.lIlllIllIIlIIl[3]] = llllllllllllIllllIlllIlIlIllIlll;
        lllllllllllllIIIllIlIIllIlIllIIl5[ModelBox.lIlllIllIIlIIl[4]] = llllllllllllIllllIlllIlIlIllIlII;
        lllllllllllllIIIllIlIIllIlIllIIl5[ModelBox.lIlllIllIIlIIl[5]] = llllllllllllIllllIlllIlIlIllIlIl;
        quadList5[n5] = new TexturedQuad(lllllllllllllIIIllIlIIllIlIllIIl5, llllllllllllIllllIlllIlIlIlIllII + llllllllllllIllllIlllIlIlIlIIlIl, llllllllllllIllllIlllIlIllIIIlII + llllllllllllIllllIlllIlIlIlIIlIl, llllllllllllIllllIlllIlIlIlIllII + llllllllllllIllllIlllIlIlIlIIlIl + llllllllllllIllllIlllIlIlIlIIlll, llllllllllllIllllIlllIlIllIIIlII + llllllllllllIllllIlllIlIlIlIIlIl + llllllllllllIllllIlllIlIlIlIIllI, llllllllllllIllllIlllIlIlIlIllIl.textureWidth, llllllllllllIllllIlllIlIlIlIllIl.textureHeight);
        final TexturedQuad[] quadList6 = this.quadList;
        final int n6 = ModelBox.lIlllIllIIlIIl[7];
        final PositionTextureVertex[] lllllllllllllIIIllIlIIllIlIllIIl6 = new PositionTextureVertex[ModelBox.lIlllIllIIlIIl[6]];
        lllllllllllllIIIllIlIIllIlIllIIl6[ModelBox.lIlllIllIIlIIl[2]] = llllllllllllIllllIlllIlIlIllIIll;
        lllllllllllllIIIllIlIIllIlIllIIl6[ModelBox.lIlllIllIIlIIl[3]] = llllllllllllIllllIlllIlIlIllIIlI;
        lllllllllllllIIIllIlIIllIlIllIIl6[ModelBox.lIlllIllIIlIIl[4]] = llllllllllllIllllIlllIlIlIllIIIl;
        lllllllllllllIIIllIlIIllIlIllIIl6[ModelBox.lIlllIllIIlIIl[5]] = llllllllllllIllllIlllIlIlIllIIII;
        quadList6[n6] = new TexturedQuad(lllllllllllllIIIllIlIIllIlIllIIl6, llllllllllllIllllIlllIlIlIlIllII + llllllllllllIllllIlllIlIlIlIIlIl + llllllllllllIllllIlllIlIlIlIIlll + llllllllllllIllllIlllIlIlIlIIlIl, llllllllllllIllllIlllIlIllIIIlII + llllllllllllIllllIlllIlIlIlIIlIl, llllllllllllIllllIlllIlIlIlIllII + llllllllllllIllllIlllIlIlIlIIlIl + llllllllllllIllllIlllIlIlIlIIlll + llllllllllllIllllIlllIlIlIlIIlIl + llllllllllllIllllIlllIlIlIlIIlll, llllllllllllIllllIlllIlIllIIIlII + llllllllllllIllllIlllIlIlIlIIlIl + llllllllllllIllllIlllIlIlIlIIllI, llllllllllllIllllIlllIlIlIlIllIl.textureWidth, llllllllllllIllllIlllIlIlIlIllIl.textureHeight);
        if (lIIIIIllIIlIlIll(llllllllllllIllllIlllIlIlIlIIIll ? 1 : 0)) {
            int llllllllllllIllllIlllIlIlIlIllll = ModelBox.lIlllIllIIlIIl[2];
            "".length();
            if (((0x93 ^ 0xA0) & ~(0x6E ^ 0x5D)) == -" ".length()) {
                throw null;
            }
            while (!lIIIIIllIIlIllII(llllllllllllIllllIlllIlIlIlIllll, this.quadList.length)) {
                this.quadList[llllllllllllIllllIlllIlIlIlIllll].flipFace();
                ++llllllllllllIllllIlllIlIlIlIllll;
            }
        }
    }
    
    static {
        lIIIIIllIIlIlIlI();
    }
    
    public void render(final WorldRenderer llllllllllllIllllIlllIlIlIIIllIl, final float llllllllllllIllllIlllIlIlIIIllII) {
        int llllllllllllIllllIlllIlIlIIIllll = ModelBox.lIlllIllIIlIIl[2];
        "".length();
        if (((118 + 82 - 77 + 118 ^ 128 + 64 - 16 + 19) & (0xDD ^ 0xA6 ^ (0x6F ^ 0x26) ^ -" ".length())) != 0x0) {
            return;
        }
        while (!lIIIIIllIIlIllII(llllllllllllIllllIlllIlIlIIIllll, this.quadList.length)) {
            this.quadList[llllllllllllIllllIlllIlIlIIIllll].draw(llllllllllllIllllIlllIlIlIIIllIl, llllllllllllIllllIlllIlIlIIIllII);
            ++llllllllllllIllllIlllIlIlIIIllll;
        }
    }
}
