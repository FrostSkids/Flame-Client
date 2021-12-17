// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.entity.Entity;

public class ModelSquid extends ModelBase
{
    private static final /* synthetic */ int[] lIlIIlIlIIIlII;
    /* synthetic */ ModelRenderer[] squidTentacles;
    /* synthetic */ ModelRenderer squidBody;
    
    @Override
    public void render(final Entity lllllllllllllIIIllIlllIIllIlIllI, final float lllllllllllllIIIllIlllIIllIlIlIl, final float lllllllllllllIIIllIlllIIllIIlIll, final float lllllllllllllIIIllIlllIIllIIlIlI, final float lllllllllllllIIIllIlllIIllIlIIlI, final float lllllllllllllIIIllIlllIIllIlIIIl, final float lllllllllllllIIIllIlllIIllIIIlll) {
        this.setRotationAngles(lllllllllllllIIIllIlllIIllIlIlIl, lllllllllllllIIIllIlllIIllIIlIll, lllllllllllllIIIllIlllIIllIIlIlI, lllllllllllllIIIllIlllIIllIlIIlI, lllllllllllllIIIllIlllIIllIlIIIl, lllllllllllllIIIllIlllIIllIIIlll, lllllllllllllIIIllIlllIIllIlIllI);
        this.squidBody.render(lllllllllllllIIIllIlllIIllIIIlll);
        int lllllllllllllIIIllIlllIIllIIllll = ModelSquid.lIlIIlIlIIIlII[2];
        "".length();
        if (((0x3B ^ 0xA) & ~(0xB8 ^ 0x89)) > 0) {
            return;
        }
        while (!lllIIlIllllllIl(lllllllllllllIIIllIlllIIllIIllll, this.squidTentacles.length)) {
            this.squidTentacles[lllllllllllllIIIllIlllIIllIIllll].render(lllllllllllllIIIllIlllIIllIIIlll);
            ++lllllllllllllIIIllIlllIIllIIllll;
        }
    }
    
    static {
        lllIIlIllllllII();
    }
    
    public ModelSquid() {
        this.squidTentacles = new ModelRenderer[ModelSquid.lIlIIlIlIIIlII[0]];
        final int lllllllllllllIIIllIlllIlIIIIIIII = ModelSquid.lIlIIlIlIIIlII[1];
        this.squidBody = new ModelRenderer(this, ModelSquid.lIlIIlIlIIIlII[2], ModelSquid.lIlIIlIlIIIlII[2]);
        this.squidBody.addBox(-6.0f, -8.0f, -6.0f, ModelSquid.lIlIIlIlIIIlII[3], ModelSquid.lIlIIlIlIIIlII[4], ModelSquid.lIlIIlIlIIIlII[3]);
        "".length();
        final ModelRenderer squidBody = this.squidBody;
        squidBody.rotationPointY += ModelSquid.lIlIIlIlIIIlII[5] + lllllllllllllIIIllIlllIlIIIIIIII;
        int lllllllllllllIIIllIlllIIllllllll = ModelSquid.lIlIIlIlIIIlII[2];
        "".length();
        if (null != null) {
            throw null;
        }
        while (!lllIIlIllllllIl(lllllllllllllIIIllIlllIIllllllll, this.squidTentacles.length)) {
            this.squidTentacles[lllllllllllllIIIllIlllIIllllllll] = new ModelRenderer(this, ModelSquid.lIlIIlIlIIIlII[6], ModelSquid.lIlIIlIlIIIlII[2]);
            double lllllllllllllIIIllIlllIIlllllllI = lllllllllllllIIIllIlllIIllllllll * 3.141592653589793 * 2.0 / this.squidTentacles.length;
            final float lllllllllllllIIIllIlllIIllllllIl = (float)Math.cos(lllllllllllllIIIllIlllIIlllllllI) * 5.0f;
            final float lllllllllllllIIIllIlllIIllllllII = (float)Math.sin(lllllllllllllIIIllIlllIIlllllllI) * 5.0f;
            this.squidTentacles[lllllllllllllIIIllIlllIIllllllll].addBox(-1.0f, 0.0f, -1.0f, ModelSquid.lIlIIlIlIIIlII[7], ModelSquid.lIlIIlIlIIIlII[8], ModelSquid.lIlIIlIlIIIlII[7]);
            "".length();
            this.squidTentacles[lllllllllllllIIIllIlllIIllllllll].rotationPointX = lllllllllllllIIIllIlllIIllllllIl;
            this.squidTentacles[lllllllllllllIIIllIlllIIllllllll].rotationPointZ = lllllllllllllIIIllIlllIIllllllII;
            this.squidTentacles[lllllllllllllIIIllIlllIIllllllll].rotationPointY = (float)(ModelSquid.lIlIIlIlIIIlII[9] + lllllllllllllIIIllIlllIlIIIIIIII);
            lllllllllllllIIIllIlllIIlllllllI = lllllllllllllIIIllIlllIIllllllll * 3.141592653589793 * -2.0 / this.squidTentacles.length + 1.5707963267948966;
            this.squidTentacles[lllllllllllllIIIllIlllIIllllllll].rotateAngleY = (float)lllllllllllllIIIllIlllIIlllllllI;
            ++lllllllllllllIIIllIlllIIllllllll;
        }
    }
    
    private static boolean lllIIlIllllllIl(final int lllllllllllllIIIllIlllIIllIIIIll, final int lllllllllllllIIIllIlllIIllIIIIlI) {
        return lllllllllllllIIIllIlllIIllIIIIll >= lllllllllllllIIIllIlllIIllIIIIlI;
    }
    
    private static void lllIIlIllllllII() {
        (lIlIIlIlIIIlII = new int[10])[0] = (0x98 ^ 0x90);
        ModelSquid.lIlIIlIlIIIlII[1] = -(0x21 ^ 0x31);
        ModelSquid.lIlIIlIlIIIlII[2] = ((0xE6 ^ 0xB8) & ~(0xD1 ^ 0x8F));
        ModelSquid.lIlIIlIlIIIlII[3] = (0x84 ^ 0x88);
        ModelSquid.lIlIIlIlIIIlII[4] = (0x2E ^ 0x33 ^ (0x2F ^ 0x22));
        ModelSquid.lIlIIlIlIIIlII[5] = (0x63 ^ 0x59 ^ (0x5A ^ 0x78));
        ModelSquid.lIlIIlIlIIIlII[6] = (95 + 38 - 46 + 104 ^ 110 + 103 - 158 + 88);
        ModelSquid.lIlIIlIlIIIlII[7] = "  ".length();
        ModelSquid.lIlIIlIlIIIlII[8] = (48 + 64 - 15 + 79 ^ 136 + 95 - 134 + 65);
        ModelSquid.lIlIIlIlIIIlII[9] = (0x17 ^ 0x8);
    }
    
    @Override
    public void setRotationAngles(final float lllllllllllllIIIllIlllIIlllIlllI, final float lllllllllllllIIIllIlllIIlllIllIl, final float lllllllllllllIIIllIlllIIlllIllII, final float lllllllllllllIIIllIlllIIlllIlIll, final float lllllllllllllIIIllIlllIIlllIlIlI, final float lllllllllllllIIIllIlllIIlllIlIIl, final Entity lllllllllllllIIIllIlllIIlllIlIII) {
        final int lllllllllllllIIIllIlllIIlllIIIIl;
        final char lllllllllllllIIIllIlllIIlllIIIlI = (char)((ModelRenderer[])(Object)(lllllllllllllIIIllIlllIIlllIIIIl = (int)(Object)this.squidTentacles)).length;
        byte lllllllllllllIIIllIlllIIlllIIIll = (byte)ModelSquid.lIlIIlIlIIIlII[2];
        "".length();
        if ("   ".length() != "   ".length()) {
            return;
        }
        while (!lllIIlIllllllIl(lllllllllllllIIIllIlllIIlllIIIll, lllllllllllllIIIllIlllIIlllIIIlI)) {
            final ModelRenderer lllllllllllllIIIllIlllIIlllIIlll = lllllllllllllIIIllIlllIIlllIIIIl[lllllllllllllIIIllIlllIIlllIIIll];
            lllllllllllllIIIllIlllIIlllIIlll.rotateAngleX = lllllllllllllIIIllIlllIIlllIllII;
            ++lllllllllllllIIIllIlllIIlllIIIll;
        }
    }
}
