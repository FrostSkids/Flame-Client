// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import java.util.Random;

public class ModelGhast extends ModelBase
{
    private static final /* synthetic */ int[] lIllIIlIlIlIIl;
    /* synthetic */ ModelRenderer body;
    /* synthetic */ ModelRenderer[] tentacles;
    
    private static void lllllIIlllllIll() {
        (lIllIIlIlIlIIl = new int[10])[0] = (0x34 ^ 0x3D);
        ModelGhast.lIllIIlIlIlIIl[1] = -(0xF9 ^ 0xBA ^ (0xCD ^ 0x9E));
        ModelGhast.lIllIIlIlIlIIl[2] = ((0x1C ^ 0x5F) & ~(0x2F ^ 0x6C));
        ModelGhast.lIllIIlIlIlIIl[3] = (0x18 ^ 0x8);
        ModelGhast.lIllIIlIlIlIIl[4] = (0x2E ^ 0x36);
        ModelGhast.lIllIIlIlIlIIl[5] = "   ".length();
        ModelGhast.lIllIIlIlIlIIl[6] = "  ".length();
        ModelGhast.lIllIIlIlIlIIl[7] = (0x40 ^ 0x47);
        ModelGhast.lIllIIlIlIlIIl[8] = (0x9 ^ 0x1);
        ModelGhast.lIllIIlIlIlIIl[9] = (155 + 166 - 201 + 100 ^ 19 + 148 - 40 + 68);
    }
    
    private static boolean lllllIIllllllII(final int lllllllllllllIIIIIIllllIllIlIIll, final int lllllllllllllIIIIIIllllIllIlIIlI) {
        return lllllllllllllIIIIIIllllIllIlIIll >= lllllllllllllIIIIIIllllIllIlIIlI;
    }
    
    public ModelGhast() {
        this.tentacles = new ModelRenderer[ModelGhast.lIllIIlIlIlIIl[0]];
        final int lllllllllllllIIIIIIlllllIIIlIIlI = ModelGhast.lIllIIlIlIlIIl[1];
        this.body = new ModelRenderer(this, ModelGhast.lIllIIlIlIlIIl[2], ModelGhast.lIllIIlIlIlIIl[2]);
        this.body.addBox(-8.0f, -8.0f, -8.0f, ModelGhast.lIllIIlIlIlIIl[3], ModelGhast.lIllIIlIlIlIIl[3], ModelGhast.lIllIIlIlIlIIl[3]);
        "".length();
        final ModelRenderer body = this.body;
        body.rotationPointY += ModelGhast.lIllIIlIlIlIIl[4] + lllllllllllllIIIIIIlllllIIIlIIlI;
        final Random lllllllllllllIIIIIIlllllIIIlIIIl = new Random(1660L);
        int lllllllllllllIIIIIIlllllIIIlIIII = ModelGhast.lIllIIlIlIlIIl[2];
        "".length();
        if (" ".length() <= 0) {
            throw null;
        }
        while (!lllllIIllllllII(lllllllllllllIIIIIIlllllIIIlIIII, this.tentacles.length)) {
            this.tentacles[lllllllllllllIIIIIIlllllIIIlIIII] = new ModelRenderer(this, ModelGhast.lIllIIlIlIlIIl[2], ModelGhast.lIllIIlIlIlIIl[2]);
            final float lllllllllllllIIIIIIlllllIIIIllll = ((lllllllllllllIIIIIIlllllIIIlIIII % ModelGhast.lIllIIlIlIlIIl[5] - lllllllllllllIIIIIIlllllIIIlIIII / ModelGhast.lIllIIlIlIlIIl[5] % ModelGhast.lIllIIlIlIlIIl[6] * 0.5f + 0.25f) / 2.0f * 2.0f - 1.0f) * 5.0f;
            final float lllllllllllllIIIIIIlllllIIIIlllI = (lllllllllllllIIIIIIlllllIIIlIIII / ModelGhast.lIllIIlIlIlIIl[5] / 2.0f * 2.0f - 1.0f) * 5.0f;
            final int lllllllllllllIIIIIIlllllIIIIllIl = lllllllllllllIIIIIIlllllIIIlIIIl.nextInt(ModelGhast.lIllIIlIlIlIIl[7]) + ModelGhast.lIllIIlIlIlIIl[8];
            this.tentacles[lllllllllllllIIIIIIlllllIIIlIIII].addBox(-1.0f, 0.0f, -1.0f, ModelGhast.lIllIIlIlIlIIl[6], lllllllllllllIIIIIIlllllIIIIllIl, ModelGhast.lIllIIlIlIlIIl[6]);
            "".length();
            this.tentacles[lllllllllllllIIIIIIlllllIIIlIIII].rotationPointX = lllllllllllllIIIIIIlllllIIIIllll;
            this.tentacles[lllllllllllllIIIIIIlllllIIIlIIII].rotationPointZ = lllllllllllllIIIIIIlllllIIIIlllI;
            this.tentacles[lllllllllllllIIIIIIlllllIIIlIIII].rotationPointY = (float)(ModelGhast.lIllIIlIlIlIIl[9] + lllllllllllllIIIIIIlllllIIIlIIlI);
            ++lllllllllllllIIIIIIlllllIIIlIIII;
        }
    }
    
    @Override
    public void render(final Entity lllllllllllllIIIIIIllllIlllIlIIl, final float lllllllllllllIIIIIIllllIlllIlIII, final float lllllllllllllIIIIIIllllIllIllllI, final float lllllllllllllIIIIIIllllIllIlllIl, final float lllllllllllllIIIIIIllllIlllIIlIl, final float lllllllllllllIIIIIIllllIllIllIll, final float lllllllllllllIIIIIIllllIllIllIlI) {
        this.setRotationAngles(lllllllllllllIIIIIIllllIlllIlIII, lllllllllllllIIIIIIllllIllIllllI, lllllllllllllIIIIIIllllIllIlllIl, lllllllllllllIIIIIIllllIlllIIlIl, lllllllllllllIIIIIIllllIllIllIll, lllllllllllllIIIIIIllllIllIllIlI, lllllllllllllIIIIIIllllIlllIlIIl);
        GlStateManager.pushMatrix();
        GlStateManager.translate(0.0f, 0.6f, 0.0f);
        this.body.render(lllllllllllllIIIIIIllllIllIllIlI);
        final boolean lllllllllllllIIIIIIllllIllIlIllI;
        final int lllllllllllllIIIIIIllllIllIlIlll = ((ModelRenderer[])(Object)(lllllllllllllIIIIIIllllIllIlIllI = (boolean)(Object)this.tentacles)).length;
        int lllllllllllllIIIIIIllllIllIllIII = ModelGhast.lIllIIlIlIlIIl[2];
        "".length();
        if (" ".length() < " ".length()) {
            return;
        }
        while (!lllllIIllllllII(lllllllllllllIIIIIIllllIllIllIII, lllllllllllllIIIIIIllllIllIlIlll)) {
            final ModelRenderer lllllllllllllIIIIIIllllIlllIIIlI = lllllllllllllIIIIIIllllIllIlIllI[lllllllllllllIIIIIIllllIllIllIII];
            lllllllllllllIIIIIIllllIlllIIIlI.render(lllllllllllllIIIIIIllllIllIllIlI);
            ++lllllllllllllIIIIIIllllIllIllIII;
        }
        GlStateManager.popMatrix();
    }
    
    @Override
    public void setRotationAngles(final float lllllllllllllIIIIIIlllllIIIIIIIl, final float lllllllllllllIIIIIIlllllIIIIIIII, final float lllllllllllllIIIIIIllllIllllllll, final float lllllllllllllIIIIIIllllIlllllllI, final float lllllllllllllIIIIIIllllIllllllIl, final float lllllllllllllIIIIIIllllIllllllII, final Entity lllllllllllllIIIIIIllllIlllllIll) {
        int lllllllllllllIIIIIIllllIlllllIlI = ModelGhast.lIllIIlIlIlIIl[2];
        "".length();
        if ("   ".length() == 0) {
            return;
        }
        while (!lllllIIllllllII(lllllllllllllIIIIIIllllIlllllIlI, this.tentacles.length)) {
            this.tentacles[lllllllllllllIIIIIIllllIlllllIlI].rotateAngleX = 0.2f * MathHelper.sin(lllllllllllllIIIIIIllllIllllllll * 0.3f + lllllllllllllIIIIIIllllIlllllIlI) + 0.4f;
            ++lllllllllllllIIIIIIllllIlllllIlI;
        }
    }
    
    static {
        lllllIIlllllIll();
    }
}
