// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.EntityLivingBase;

public class ModelMagmaCube extends ModelBase
{
    /* synthetic */ ModelRenderer[] segments;
    private static final /* synthetic */ int[] lIlIIIllllllll;
    /* synthetic */ ModelRenderer core;
    
    private static void lllIIlIIIllIlIl() {
        (lIlIIIllllllll = new int[10])[0] = (0x97 ^ 0x88 ^ (0x6A ^ 0x7D));
        ModelMagmaCube.lIlIIIllllllll[1] = ((0xF9 ^ 0x9A) & ~(0x66 ^ 0x5));
        ModelMagmaCube.lIlIIIllllllll[2] = "  ".length();
        ModelMagmaCube.lIlIIIllllllll[3] = (0x0 ^ 0x18);
        ModelMagmaCube.lIlIIIllllllll[4] = (0x5 ^ 0xC ^ "   ".length());
        ModelMagmaCube.lIlIIIllllllll[5] = "   ".length();
        ModelMagmaCube.lIlIIIllllllll[6] = (0x83 ^ 0x90);
        ModelMagmaCube.lIlIIIllllllll[7] = (97 + 170 - 104 + 49 ^ 5 + 58 + 13 + 120);
        ModelMagmaCube.lIlIIIllllllll[8] = " ".length();
        ModelMagmaCube.lIlIIIllllllll[9] = (75 + 125 - 99 + 29 ^ 110 + 121 - 119 + 22);
    }
    
    private static boolean lllIIlIIIlllIlI(final int lllllllllllllIIIlllIllIIIllIlllI) {
        return lllllllllllllIIIlllIllIIIllIlllI < 0;
    }
    
    private static int lllIIlIIIlllIII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public void setLivingAnimations(final EntityLivingBase lllllllllllllIIIlllIllIIlIIlllll, final float lllllllllllllIIIlllIllIIlIIllllI, final float lllllllllllllIIIlllIllIIlIIlllIl, final float lllllllllllllIIIlllIllIIlIIlIllI) {
        final EntityMagmaCube lllllllllllllIIIlllIllIIlIIllIll = (EntityMagmaCube)lllllllllllllIIIlllIllIIlIIlllll;
        float lllllllllllllIIIlllIllIIlIIllIlI = lllllllllllllIIIlllIllIIlIIllIll.prevSquishFactor + (lllllllllllllIIIlllIllIIlIIllIll.squishFactor - lllllllllllllIIIlllIllIIlIIllIll.prevSquishFactor) * lllllllllllllIIIlllIllIIlIIlIllI;
        if (lllIIlIIIlllIlI(lllIIlIIIlllIII(lllllllllllllIIIlllIllIIlIIllIlI, 0.0f))) {
            lllllllllllllIIIlllIllIIlIIllIlI = 0.0f;
        }
        int lllllllllllllIIIlllIllIIlIIllIIl = ModelMagmaCube.lIlIIIllllllll[1];
        "".length();
        if ("  ".length() <= 0) {
            return;
        }
        while (!lllIIlIIIllIlll(lllllllllllllIIIlllIllIIlIIllIIl, this.segments.length)) {
            this.segments[lllllllllllllIIIlllIllIIlIIllIIl].rotationPointY = -(ModelMagmaCube.lIlIIIllllllll[9] - lllllllllllllIIIlllIllIIlIIllIIl) * lllllllllllllIIIlllIllIIlIIllIlI * 1.7f;
            ++lllllllllllllIIIlllIllIIlIIllIIl;
        }
    }
    
    private static boolean lllIIlIIIllIlll(final int lllllllllllllIIIlllIllIIIlllIIIl, final int lllllllllllllIIIlllIllIIIlllIIII) {
        return lllllllllllllIIIlllIllIIIlllIIIl >= lllllllllllllIIIlllIllIIIlllIIII;
    }
    
    private static boolean lllIIlIIIllIllI(final int lllllllllllllIIIlllIllIIIlllIlIl, final int lllllllllllllIIIlllIllIIIlllIlII) {
        return lllllllllllllIIIlllIllIIIlllIlIl == lllllllllllllIIIlllIllIIIlllIlII;
    }
    
    public ModelMagmaCube() {
        this.segments = new ModelRenderer[ModelMagmaCube.lIlIIIllllllll[0]];
        int lllllllllllllIIIlllIllIIlIlIllIl = ModelMagmaCube.lIlIIIllllllll[1];
        "".length();
        if ((0x50 ^ 0x1F ^ (0x6B ^ 0x20)) <= 0) {
            throw null;
        }
        while (!lllIIlIIIllIlll(lllllllllllllIIIlllIllIIlIlIllIl, this.segments.length)) {
            int lllllllllllllIIIlllIllIIlIlIllII = ModelMagmaCube.lIlIIIllllllll[1];
            int lllllllllllllIIIlllIllIIlIlIlIll = lllllllllllllIIIlllIllIIlIlIllIl;
            if (lllIIlIIIllIllI(lllllllllllllIIIlllIllIIlIlIllIl, ModelMagmaCube.lIlIIIllllllll[2])) {
                lllllllllllllIIIlllIllIIlIlIllII = ModelMagmaCube.lIlIIIllllllll[3];
                lllllllllllllIIIlllIllIIlIlIlIll = ModelMagmaCube.lIlIIIllllllll[4];
                "".length();
                if (((0x6 ^ 0x13) & ~(0xF ^ 0x1A)) < -" ".length()) {
                    throw null;
                }
            }
            else if (lllIIlIIIllIllI(lllllllllllllIIIlllIllIIlIlIllIl, ModelMagmaCube.lIlIIIllllllll[5])) {
                lllllllllllllIIIlllIllIIlIlIllII = ModelMagmaCube.lIlIIIllllllll[3];
                lllllllllllllIIIlllIllIIlIlIlIll = ModelMagmaCube.lIlIIIllllllll[6];
            }
            (this.segments[lllllllllllllIIIlllIllIIlIlIllIl] = new ModelRenderer(this, lllllllllllllIIIlllIllIIlIlIllII, lllllllllllllIIIlllIllIIlIlIlIll)).addBox(-4.0f, (float)(ModelMagmaCube.lIlIIIllllllll[7] + lllllllllllllIIIlllIllIIlIlIllIl), -4.0f, ModelMagmaCube.lIlIIIllllllll[0], ModelMagmaCube.lIlIIIllllllll[8], ModelMagmaCube.lIlIIIllllllll[0]);
            "".length();
            ++lllllllllllllIIIlllIllIIlIlIllIl;
        }
        this.core = new ModelRenderer(this, ModelMagmaCube.lIlIIIllllllll[1], ModelMagmaCube.lIlIIIllllllll[7]);
        this.core.addBox(-2.0f, 18.0f, -2.0f, ModelMagmaCube.lIlIIIllllllll[9], ModelMagmaCube.lIlIIIllllllll[9], ModelMagmaCube.lIlIIIllllllll[9]);
        "".length();
    }
    
    @Override
    public void render(final Entity lllllllllllllIIIlllIllIIIlllllll, final float lllllllllllllIIIlllIllIIlIIIIlll, final float lllllllllllllIIIlllIllIIlIIIIllI, final float lllllllllllllIIIlllIllIIlIIIIlIl, final float lllllllllllllIIIlllIllIIlIIIIlII, final float lllllllllllllIIIlllIllIIIllllIlI, final float lllllllllllllIIIlllIllIIlIIIIIlI) {
        this.setRotationAngles(lllllllllllllIIIlllIllIIlIIIIlll, lllllllllllllIIIlllIllIIlIIIIllI, lllllllllllllIIIlllIllIIlIIIIlIl, lllllllllllllIIIlllIllIIlIIIIlII, lllllllllllllIIIlllIllIIIllllIlI, lllllllllllllIIIlllIllIIlIIIIIlI, lllllllllllllIIIlllIllIIIlllllll);
        this.core.render(lllllllllllllIIIlllIllIIlIIIIIlI);
        int lllllllllllllIIIlllIllIIlIIIIIIl = ModelMagmaCube.lIlIIIllllllll[1];
        "".length();
        if ((" ".length() & (" ".length() ^ -" ".length())) != ((0x3D ^ 0xE ^ (0x2D ^ 0x1B)) & (180 + 176 - 268 + 98 ^ 42 + 14 + 99 + 36 ^ -" ".length()))) {
            return;
        }
        while (!lllIIlIIIllIlll(lllllllllllllIIIlllIllIIlIIIIIIl, this.segments.length)) {
            this.segments[lllllllllllllIIIlllIllIIlIIIIIIl].render(lllllllllllllIIIlllIllIIlIIIIIlI);
            ++lllllllllllllIIIlllIllIIlIIIIIIl;
        }
    }
    
    static {
        lllIIlIIIllIlIl();
    }
}
