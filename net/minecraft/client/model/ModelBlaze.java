// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;

public class ModelBlaze extends ModelBase
{
    private static final /* synthetic */ int[] lllIlIIIllllII;
    private /* synthetic */ ModelRenderer blazeHead;
    private /* synthetic */ ModelRenderer[] blazeSticks;
    
    private static boolean lIlIIIIllllIlIII(final int llllllllllllIlIlllIIIllIlIIIlIIl, final int llllllllllllIlIlllIIIllIlIIIlIII) {
        return llllllllllllIlIlllIIIllIlIIIlIIl >= llllllllllllIlIlllIIIllIlIIIlIII;
    }
    
    static {
        lIlIIIIllllIIlll();
    }
    
    @Override
    public void render(final Entity llllllllllllIlIlllIIIllIlIlIlIll, final float llllllllllllIlIlllIIIllIlIllIIll, final float llllllllllllIlIlllIIIllIlIllIIlI, final float llllllllllllIlIlllIIIllIlIllIIIl, final float llllllllllllIlIlllIIIllIlIllIIII, final float llllllllllllIlIlllIIIllIlIlIllll, final float llllllllllllIlIlllIIIllIlIlIlllI) {
        this.setRotationAngles(llllllllllllIlIlllIIIllIlIllIIll, llllllllllllIlIlllIIIllIlIllIIlI, llllllllllllIlIlllIIIllIlIllIIIl, llllllllllllIlIlllIIIllIlIllIIII, llllllllllllIlIlllIIIllIlIlIllll, llllllllllllIlIlllIIIllIlIlIlllI, llllllllllllIlIlllIIIllIlIlIlIll);
        this.blazeHead.render(llllllllllllIlIlllIIIllIlIlIlllI);
        int llllllllllllIlIlllIIIllIlIlIllIl = ModelBlaze.lllIlIIIllllII[1];
        "".length();
        if (-" ".length() >= " ".length()) {
            return;
        }
        while (!lIlIIIIllllIlIII(llllllllllllIlIlllIIIllIlIlIllIl, this.blazeSticks.length)) {
            this.blazeSticks[llllllllllllIlIlllIIIllIlIlIllIl].render(llllllllllllIlIlllIIIllIlIlIlllI);
            ++llllllllllllIlIlllIIIllIlIlIllIl;
        }
    }
    
    private static void lIlIIIIllllIIlll() {
        (lllIlIIIllllII = new int[6])[0] = (0x25 ^ 0x29);
        ModelBlaze.lllIlIIIllllII[1] = ((0x6C ^ 0x60 ^ (0x29 ^ 0x16)) & (0x18 ^ 0x27 ^ (0x1 ^ 0xD) ^ -" ".length()));
        ModelBlaze.lllIlIIIllllII[2] = (0x5F ^ 0x3 ^ (0x78 ^ 0x34));
        ModelBlaze.lllIlIIIllllII[3] = "  ".length();
        ModelBlaze.lllIlIIIllllII[4] = (0xBD ^ 0xB5);
        ModelBlaze.lllIlIIIllllII[5] = (0xA5 ^ 0xA1);
    }
    
    public ModelBlaze() {
        this.blazeSticks = new ModelRenderer[ModelBlaze.lllIlIIIllllII[0]];
        int llllllllllllIlIlllIIIllIllIIIIIl = ModelBlaze.lllIlIIIllllII[1];
        "".length();
        if ("  ".length() < 0) {
            throw null;
        }
        while (!lIlIIIIllllIlIII(llllllllllllIlIlllIIIllIllIIIIIl, this.blazeSticks.length)) {
            (this.blazeSticks[llllllllllllIlIlllIIIllIllIIIIIl] = new ModelRenderer(this, ModelBlaze.lllIlIIIllllII[1], ModelBlaze.lllIlIIIllllII[2])).addBox(0.0f, 0.0f, 0.0f, ModelBlaze.lllIlIIIllllII[3], ModelBlaze.lllIlIIIllllII[4], ModelBlaze.lllIlIIIllllII[3]);
            "".length();
            ++llllllllllllIlIlllIIIllIllIIIIIl;
        }
        this.blazeHead = new ModelRenderer(this, ModelBlaze.lllIlIIIllllII[1], ModelBlaze.lllIlIIIllllII[1]);
        this.blazeHead.addBox(-4.0f, -4.0f, -4.0f, ModelBlaze.lllIlIIIllllII[4], ModelBlaze.lllIlIIIllllII[4], ModelBlaze.lllIlIIIllllII[4]);
        "".length();
    }
    
    @Override
    public void setRotationAngles(final float llllllllllllIlIlllIIIllIlIIlllII, final float llllllllllllIlIlllIIIllIlIIllIll, final float llllllllllllIlIlllIIIllIlIIlIIII, final float llllllllllllIlIlllIIIllIlIIIllll, final float llllllllllllIlIlllIIIllIlIIllIII, final float llllllllllllIlIlllIIIllIlIIlIlll, final Entity llllllllllllIlIlllIIIllIlIIlIllI) {
        float llllllllllllIlIlllIIIllIlIIlIlIl = llllllllllllIlIlllIIIllIlIIlIIII * 3.1415927f * -0.1f;
        int llllllllllllIlIlllIIIllIlIIlIlII = ModelBlaze.lllIlIIIllllII[1];
        "".length();
        if ((126 + 77 - 166 + 115 ^ 36 + 64 - 75 + 131) < " ".length()) {
            return;
        }
        while (!lIlIIIIllllIlIII(llllllllllllIlIlllIIIllIlIIlIlII, ModelBlaze.lllIlIIIllllII[5])) {
            this.blazeSticks[llllllllllllIlIlllIIIllIlIIlIlII].rotationPointY = -2.0f + MathHelper.cos((llllllllllllIlIlllIIIllIlIIlIlII * ModelBlaze.lllIlIIIllllII[3] + llllllllllllIlIlllIIIllIlIIlIIII) * 0.25f);
            this.blazeSticks[llllllllllllIlIlllIIIllIlIIlIlII].rotationPointX = MathHelper.cos(llllllllllllIlIlllIIIllIlIIlIlIl) * 9.0f;
            this.blazeSticks[llllllllllllIlIlllIIIllIlIIlIlII].rotationPointZ = MathHelper.sin(llllllllllllIlIlllIIIllIlIIlIlIl) * 9.0f;
            ++llllllllllllIlIlllIIIllIlIIlIlIl;
            ++llllllllllllIlIlllIIIllIlIIlIlII;
        }
        llllllllllllIlIlllIIIllIlIIlIlIl = 0.7853982f + llllllllllllIlIlllIIIllIlIIlIIII * 3.1415927f * 0.03f;
        int llllllllllllIlIlllIIIllIlIIlIIll = ModelBlaze.lllIlIIIllllII[5];
        "".length();
        if (-(0x7D ^ 0x78) >= 0) {
            return;
        }
        while (!lIlIIIIllllIlIII(llllllllllllIlIlllIIIllIlIIlIIll, ModelBlaze.lllIlIIIllllII[4])) {
            this.blazeSticks[llllllllllllIlIlllIIIllIlIIlIIll].rotationPointY = 2.0f + MathHelper.cos((llllllllllllIlIlllIIIllIlIIlIIll * ModelBlaze.lllIlIIIllllII[3] + llllllllllllIlIlllIIIllIlIIlIIII) * 0.25f);
            this.blazeSticks[llllllllllllIlIlllIIIllIlIIlIIll].rotationPointX = MathHelper.cos(llllllllllllIlIlllIIIllIlIIlIlIl) * 7.0f;
            this.blazeSticks[llllllllllllIlIlllIIIllIlIIlIIll].rotationPointZ = MathHelper.sin(llllllllllllIlIlllIIIllIlIIlIlIl) * 7.0f;
            ++llllllllllllIlIlllIIIllIlIIlIlIl;
            ++llllllllllllIlIlllIIIllIlIIlIIll;
        }
        llllllllllllIlIlllIIIllIlIIlIlIl = 0.47123894f + llllllllllllIlIlllIIIllIlIIlIIII * 3.1415927f * -0.05f;
        int llllllllllllIlIlllIIIllIlIIlIIlI = ModelBlaze.lllIlIIIllllII[4];
        "".length();
        if (((0xF ^ 0x55) & ~(0xE7 ^ 0xBD)) > 0) {
            return;
        }
        while (!lIlIIIIllllIlIII(llllllllllllIlIlllIIIllIlIIlIIlI, ModelBlaze.lllIlIIIllllII[0])) {
            this.blazeSticks[llllllllllllIlIlllIIIllIlIIlIIlI].rotationPointY = 11.0f + MathHelper.cos((llllllllllllIlIlllIIIllIlIIlIIlI * 1.5f + llllllllllllIlIlllIIIllIlIIlIIII) * 0.5f);
            this.blazeSticks[llllllllllllIlIlllIIIllIlIIlIIlI].rotationPointX = MathHelper.cos(llllllllllllIlIlllIIIllIlIIlIlIl) * 5.0f;
            this.blazeSticks[llllllllllllIlIlllIIIllIlIIlIIlI].rotationPointZ = MathHelper.sin(llllllllllllIlIlllIIIllIlIIlIlIl) * 5.0f;
            ++llllllllllllIlIlllIIIllIlIIlIlIl;
            ++llllllllllllIlIlllIIIllIlIIlIIlI;
        }
        this.blazeHead.rotateAngleY = llllllllllllIlIlllIIIllIlIIIllll / 57.295776f;
        this.blazeHead.rotateAngleX = llllllllllllIlIlllIIIllIlIIllIII / 57.295776f;
    }
}
