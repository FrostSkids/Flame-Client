// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.entity.Entity;

public class ModelLeashKnot extends ModelBase
{
    public /* synthetic */ ModelRenderer field_110723_a;
    private static final /* synthetic */ int[] lIllIIIlllIIlI;
    
    private static void lllllIIlIIIIIIl() {
        (lIllIIIlllIIlI = new int[4])[0] = ((0xD0 ^ 0x9B ^ (0xEE ^ 0xAE)) & (0x62 ^ 0x24 ^ (0x0 ^ 0x4D) ^ -" ".length()));
        ModelLeashKnot.lIllIIIlllIIlI[1] = (0x6A ^ 0x9 ^ (0x46 ^ 0x5));
        ModelLeashKnot.lIllIIIlllIIlI[2] = (23 + 35 + 71 + 59 ^ 168 + 15 - 13 + 16);
        ModelLeashKnot.lIllIIIlllIIlI[3] = (0xAC ^ 0xA4);
    }
    
    @Override
    public void render(final Entity lllllllllllllIIIIIlIlIIIlIIlIIII, final float lllllllllllllIIIIIlIlIIIlIIlIlll, final float lllllllllllllIIIIIlIlIIIlIIlIllI, final float lllllllllllllIIIIIlIlIIIlIIIllIl, final float lllllllllllllIIIIIlIlIIIlIIlIlII, final float lllllllllllllIIIIIlIlIIIlIIIlIll, final float lllllllllllllIIIIIlIlIIIlIIIlIlI) {
        this.setRotationAngles(lllllllllllllIIIIIlIlIIIlIIlIlll, lllllllllllllIIIIIlIlIIIlIIlIllI, lllllllllllllIIIIIlIlIIIlIIIllIl, lllllllllllllIIIIIlIlIIIlIIlIlII, lllllllllllllIIIIIlIlIIIlIIIlIll, lllllllllllllIIIIIlIlIIIlIIIlIlI, lllllllllllllIIIIIlIlIIIlIIlIIII);
        this.field_110723_a.render(lllllllllllllIIIIIlIlIIIlIIIlIlI);
    }
    
    public ModelLeashKnot() {
        this(ModelLeashKnot.lIllIIIlllIIlI[0], ModelLeashKnot.lIllIIIlllIIlI[0], ModelLeashKnot.lIllIIIlllIIlI[1], ModelLeashKnot.lIllIIIlllIIlI[1]);
    }
    
    @Override
    public void setRotationAngles(final float lllllllllllllIIIIIlIlIIIlIIIIIII, final float lllllllllllllIIIIIlIlIIIIlllllll, final float lllllllllllllIIIIIlIlIIIIllllllI, final float lllllllllllllIIIIIlIlIIIIlllllIl, final float lllllllllllllIIIIIlIlIIIIlllllII, final float lllllllllllllIIIIIlIlIIIIllllIll, final Entity lllllllllllllIIIIIlIlIIIIllllIlI) {
        super.setRotationAngles(lllllllllllllIIIIIlIlIIIlIIIIIII, lllllllllllllIIIIIlIlIIIIlllllll, lllllllllllllIIIIIlIlIIIIllllllI, lllllllllllllIIIIIlIlIIIIlllllIl, lllllllllllllIIIIIlIlIIIIlllllII, lllllllllllllIIIIIlIlIIIIllllIll, lllllllllllllIIIIIlIlIIIIllllIlI);
        this.field_110723_a.rotateAngleY = lllllllllllllIIIIIlIlIIIIlllllIl / 57.295776f;
        this.field_110723_a.rotateAngleX = lllllllllllllIIIIIlIlIIIIlllllII / 57.295776f;
    }
    
    public ModelLeashKnot(final int lllllllllllllIIIIIlIlIIIlIlIIlIl, final int lllllllllllllIIIIIlIlIIIlIlIIlII, final int lllllllllllllIIIIIlIlIIIlIlIIIll, final int lllllllllllllIIIIIlIlIIIlIlIIlll) {
        this.textureWidth = lllllllllllllIIIIIlIlIIIlIlIIIll;
        this.textureHeight = lllllllllllllIIIIIlIlIIIlIlIIlll;
        this.field_110723_a = new ModelRenderer(this, lllllllllllllIIIIIlIlIIIlIlIIlIl, lllllllllllllIIIIIlIlIIIlIlIIlII);
        this.field_110723_a.addBox(-3.0f, -6.0f, -3.0f, ModelLeashKnot.lIllIIIlllIIlI[2], ModelLeashKnot.lIllIIIlllIIlI[3], ModelLeashKnot.lIllIIIlllIIlI[2], 0.0f);
        this.field_110723_a.setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    static {
        lllllIIlIIIIIIl();
    }
}
