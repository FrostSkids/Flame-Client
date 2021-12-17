// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.entity.Entity;

public class ModelSlime extends ModelBase
{
    /* synthetic */ ModelRenderer slimeBodies;
    /* synthetic */ ModelRenderer slimeLeftEye;
    /* synthetic */ ModelRenderer slimeRightEye;
    private static final /* synthetic */ int[] lIIIIlIlllIIIl;
    /* synthetic */ ModelRenderer slimeMouth;
    
    private static boolean lIlllIlIlIlIIlI(final Object lllllllllllllIlIIlIlIIlIlIIIIlII) {
        return lllllllllllllIlIIlIlIIlIlIIIIlII != null;
    }
    
    static {
        lIlllIlIlIlIIII();
    }
    
    private static void lIlllIlIlIlIIII() {
        (lIIIIlIlllIIIl = new int[7])[0] = ((0x1F ^ 0x3B ^ (0xA6 ^ 0x90)) & (93 + 76 - 60 + 21 ^ 9 + 11 + 20 + 104 ^ -" ".length()));
        ModelSlime.lIIIIlIlllIIIl[1] = (167 + 158 - 307 + 164 ^ 19 + 116 + 30 + 25);
        ModelSlime.lIIIIlIlllIIIl[2] = (0x62 ^ 0x64);
        ModelSlime.lIIIIlIlllIIIl[3] = (0x2B ^ 0xB);
        ModelSlime.lIIIIlIlllIIIl[4] = "  ".length();
        ModelSlime.lIIIIlIlllIIIl[5] = (60 + 59 - 48 + 59 ^ 126 + 98 - 205 + 115);
        ModelSlime.lIIIIlIlllIIIl[6] = " ".length();
    }
    
    @Override
    public void render(final Entity lllllllllllllIlIIlIlIIlIlIIIllII, final float lllllllllllllIlIIlIlIIlIlIIIlIll, final float lllllllllllllIlIIlIlIIlIlIIIlIlI, final float lllllllllllllIlIIlIlIIlIlIIlIIIl, final float lllllllllllllIlIIlIlIIlIlIIIlIII, final float lllllllllllllIlIIlIlIIlIlIIIIlll, final float lllllllllllllIlIIlIlIIlIlIIIIllI) {
        this.setRotationAngles(lllllllllllllIlIIlIlIIlIlIIIlIll, lllllllllllllIlIIlIlIIlIlIIIlIlI, lllllllllllllIlIIlIlIIlIlIIlIIIl, lllllllllllllIlIIlIlIIlIlIIIlIII, lllllllllllllIlIIlIlIIlIlIIIIlll, lllllllllllllIlIIlIlIIlIlIIIIllI, lllllllllllllIlIIlIlIIlIlIIIllII);
        this.slimeBodies.render(lllllllllllllIlIIlIlIIlIlIIIIllI);
        if (lIlllIlIlIlIIlI(this.slimeRightEye)) {
            this.slimeRightEye.render(lllllllllllllIlIIlIlIIlIlIIIIllI);
            this.slimeLeftEye.render(lllllllllllllIlIIlIlIIlIlIIIIllI);
            this.slimeMouth.render(lllllllllllllIlIIlIlIIlIlIIIIllI);
        }
    }
    
    public ModelSlime(final int lllllllllllllIlIIlIlIIlIlIIllllI) {
        this.slimeBodies = new ModelRenderer(this, ModelSlime.lIIIIlIlllIIIl[0], lllllllllllllIlIIlIlIIlIlIIllllI);
        this.slimeBodies.addBox(-4.0f, 16.0f, -4.0f, ModelSlime.lIIIIlIlllIIIl[1], ModelSlime.lIIIIlIlllIIIl[1], ModelSlime.lIIIIlIlllIIIl[1]);
        "".length();
        if (lIlllIlIlIlIIIl(lllllllllllllIlIIlIlIIlIlIIllllI)) {
            this.slimeBodies = new ModelRenderer(this, ModelSlime.lIIIIlIlllIIIl[0], lllllllllllllIlIIlIlIIlIlIIllllI);
            this.slimeBodies.addBox(-3.0f, 17.0f, -3.0f, ModelSlime.lIIIIlIlllIIIl[2], ModelSlime.lIIIIlIlllIIIl[2], ModelSlime.lIIIIlIlllIIIl[2]);
            "".length();
            this.slimeRightEye = new ModelRenderer(this, ModelSlime.lIIIIlIlllIIIl[3], ModelSlime.lIIIIlIlllIIIl[0]);
            this.slimeRightEye.addBox(-3.25f, 18.0f, -3.5f, ModelSlime.lIIIIlIlllIIIl[4], ModelSlime.lIIIIlIlllIIIl[4], ModelSlime.lIIIIlIlllIIIl[4]);
            "".length();
            this.slimeLeftEye = new ModelRenderer(this, ModelSlime.lIIIIlIlllIIIl[3], ModelSlime.lIIIIlIlllIIIl[5]);
            this.slimeLeftEye.addBox(1.25f, 18.0f, -3.5f, ModelSlime.lIIIIlIlllIIIl[4], ModelSlime.lIIIIlIlllIIIl[4], ModelSlime.lIIIIlIlllIIIl[4]);
            "".length();
            this.slimeMouth = new ModelRenderer(this, ModelSlime.lIIIIlIlllIIIl[3], ModelSlime.lIIIIlIlllIIIl[1]);
            this.slimeMouth.addBox(0.0f, 21.0f, -3.5f, ModelSlime.lIIIIlIlllIIIl[6], ModelSlime.lIIIIlIlllIIIl[6], ModelSlime.lIIIIlIlllIIIl[6]);
            "".length();
        }
    }
    
    private static boolean lIlllIlIlIlIIIl(final int lllllllllllllIlIIlIlIIlIlIIIIIlI) {
        return lllllllllllllIlIIlIlIIlIlIIIIIlI > 0;
    }
}
