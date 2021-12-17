// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;

public class ModelSnowMan extends ModelBase
{
    public /* synthetic */ ModelRenderer leftHand;
    public /* synthetic */ ModelRenderer bottomBody;
    public /* synthetic */ ModelRenderer head;
    public /* synthetic */ ModelRenderer body;
    private static final /* synthetic */ int[] llIIIIlllIIlIl;
    public /* synthetic */ ModelRenderer rightHand;
    
    @Override
    public void render(final Entity llllllllllllIlllIllIlIIIIIlllllI, final float llllllllllllIlllIllIlIIIIIllIlIl, final float llllllllllllIlllIllIlIIIIIllIlII, final float llllllllllllIlllIllIlIIIIIlllIll, final float llllllllllllIlllIllIlIIIIIllIIlI, final float llllllllllllIlllIllIlIIIIIlllIIl, final float llllllllllllIlllIllIlIIIIIlllIII) {
        this.setRotationAngles(llllllllllllIlllIllIlIIIIIllIlIl, llllllllllllIlllIllIlIIIIIllIlII, llllllllllllIlllIllIlIIIIIlllIll, llllllllllllIlllIllIlIIIIIllIIlI, llllllllllllIlllIllIlIIIIIlllIIl, llllllllllllIlllIllIlIIIIIlllIII, llllllllllllIlllIllIlIIIIIlllllI);
        this.body.render(llllllllllllIlllIllIlIIIIIlllIII);
        this.bottomBody.render(llllllllllllIlllIllIlIIIIIlllIII);
        this.head.render(llllllllllllIlllIllIlIIIIIlllIII);
        this.rightHand.render(llllllllllllIlllIllIlIIIIIlllIII);
        this.leftHand.render(llllllllllllIlllIllIlIIIIIlllIII);
    }
    
    static {
        lIIIlIIIIlIlIlIl();
    }
    
    private static void lIIIlIIIIlIlIlIl() {
        (llIIIIlllIIlIl = new int[9])[0] = ((85 + 0 - 31 + 116 ^ 171 + 104 - 174 + 80) & (90 + 69 - 80 + 87 ^ 169 + 94 - 87 + 9 ^ -" ".length()));
        ModelSnowMan.llIIIIlllIIlIl[1] = (0xC9 ^ 0xA1 ^ (0x9B ^ 0xB3));
        ModelSnowMan.llIIIIlllIIlIl[2] = (0x2E ^ 0x26);
        ModelSnowMan.llIIIIlllIIlIl[3] = (0x8 ^ 0x33 ^ (0x64 ^ 0x7F));
        ModelSnowMan.llIIIIlllIIlIl[4] = (0xA6 ^ 0x8A ^ (0x3C ^ 0x1C));
        ModelSnowMan.llIIIIlllIIlIl[5] = "  ".length();
        ModelSnowMan.llIIIIlllIIlIl[6] = (0x1 ^ 0x11);
        ModelSnowMan.llIIIIlllIIlIl[7] = (0xA9 ^ 0xA3);
        ModelSnowMan.llIIIIlllIIlIl[8] = (0xA0 ^ 0x84);
    }
    
    public ModelSnowMan() {
        final float llllllllllllIlllIllIlIIIIllIlIlI = 4.0f;
        final float llllllllllllIlllIllIlIIIIllIlIIl = 0.0f;
        this.head = new ModelRenderer(this, ModelSnowMan.llIIIIlllIIlIl[0], ModelSnowMan.llIIIIlllIIlIl[0]).setTextureSize(ModelSnowMan.llIIIIlllIIlIl[1], ModelSnowMan.llIIIIlllIIlIl[1]);
        this.head.addBox(-4.0f, -8.0f, -4.0f, ModelSnowMan.llIIIIlllIIlIl[2], ModelSnowMan.llIIIIlllIIlIl[2], ModelSnowMan.llIIIIlllIIlIl[2], llllllllllllIlllIllIlIIIIllIlIIl - 0.5f);
        this.head.setRotationPoint(0.0f, 0.0f + llllllllllllIlllIllIlIIIIllIlIlI, 0.0f);
        this.rightHand = new ModelRenderer(this, ModelSnowMan.llIIIIlllIIlIl[3], ModelSnowMan.llIIIIlllIIlIl[0]).setTextureSize(ModelSnowMan.llIIIIlllIIlIl[1], ModelSnowMan.llIIIIlllIIlIl[1]);
        this.rightHand.addBox(-1.0f, 0.0f, -1.0f, ModelSnowMan.llIIIIlllIIlIl[4], ModelSnowMan.llIIIIlllIIlIl[5], ModelSnowMan.llIIIIlllIIlIl[5], llllllllllllIlllIllIlIIIIllIlIIl - 0.5f);
        this.rightHand.setRotationPoint(0.0f, 0.0f + llllllllllllIlllIllIlIIIIllIlIlI + 9.0f - 7.0f, 0.0f);
        this.leftHand = new ModelRenderer(this, ModelSnowMan.llIIIIlllIIlIl[3], ModelSnowMan.llIIIIlllIIlIl[0]).setTextureSize(ModelSnowMan.llIIIIlllIIlIl[1], ModelSnowMan.llIIIIlllIIlIl[1]);
        this.leftHand.addBox(-1.0f, 0.0f, -1.0f, ModelSnowMan.llIIIIlllIIlIl[4], ModelSnowMan.llIIIIlllIIlIl[5], ModelSnowMan.llIIIIlllIIlIl[5], llllllllllllIlllIllIlIIIIllIlIIl - 0.5f);
        this.leftHand.setRotationPoint(0.0f, 0.0f + llllllllllllIlllIllIlIIIIllIlIlI + 9.0f - 7.0f, 0.0f);
        this.body = new ModelRenderer(this, ModelSnowMan.llIIIIlllIIlIl[0], ModelSnowMan.llIIIIlllIIlIl[6]).setTextureSize(ModelSnowMan.llIIIIlllIIlIl[1], ModelSnowMan.llIIIIlllIIlIl[1]);
        this.body.addBox(-5.0f, -10.0f, -5.0f, ModelSnowMan.llIIIIlllIIlIl[7], ModelSnowMan.llIIIIlllIIlIl[7], ModelSnowMan.llIIIIlllIIlIl[7], llllllllllllIlllIllIlIIIIllIlIIl - 0.5f);
        this.body.setRotationPoint(0.0f, 0.0f + llllllllllllIlllIllIlIIIIllIlIlI + 9.0f, 0.0f);
        this.bottomBody = new ModelRenderer(this, ModelSnowMan.llIIIIlllIIlIl[0], ModelSnowMan.llIIIIlllIIlIl[8]).setTextureSize(ModelSnowMan.llIIIIlllIIlIl[1], ModelSnowMan.llIIIIlllIIlIl[1]);
        this.bottomBody.addBox(-6.0f, -12.0f, -6.0f, ModelSnowMan.llIIIIlllIIlIl[4], ModelSnowMan.llIIIIlllIIlIl[4], ModelSnowMan.llIIIIlllIIlIl[4], llllllllllllIlllIllIlIIIIllIlIIl - 0.5f);
        this.bottomBody.setRotationPoint(0.0f, 0.0f + llllllllllllIlllIllIlIIIIllIlIlI + 20.0f, 0.0f);
    }
    
    @Override
    public void setRotationAngles(final float llllllllllllIlllIllIlIIIIlIlIIII, final float llllllllllllIlllIllIlIIIIlIllIIl, final float llllllllllllIlllIllIlIIIIlIllIII, final float llllllllllllIlllIllIlIIIIlIIllIl, final float llllllllllllIlllIllIlIIIIlIIllII, final float llllllllllllIlllIllIlIIIIlIIlIll, final Entity llllllllllllIlllIllIlIIIIlIIlIlI) {
        super.setRotationAngles(llllllllllllIlllIllIlIIIIlIlIIII, llllllllllllIlllIllIlIIIIlIllIIl, llllllllllllIlllIllIlIIIIlIllIII, llllllllllllIlllIllIlIIIIlIIllIl, llllllllllllIlllIllIlIIIIlIIllII, llllllllllllIlllIllIlIIIIlIIlIll, llllllllllllIlllIllIlIIIIlIIlIlI);
        this.head.rotateAngleY = llllllllllllIlllIllIlIIIIlIIllIl / 57.295776f;
        this.head.rotateAngleX = llllllllllllIlllIllIlIIIIlIIllII / 57.295776f;
        this.body.rotateAngleY = llllllllllllIlllIllIlIIIIlIIllIl / 57.295776f * 0.25f;
        final float llllllllllllIlllIllIlIIIIlIlIIll = MathHelper.sin(this.body.rotateAngleY);
        final float llllllllllllIlllIllIlIIIIlIlIIlI = MathHelper.cos(this.body.rotateAngleY);
        this.rightHand.rotateAngleZ = 1.0f;
        this.leftHand.rotateAngleZ = -1.0f;
        this.rightHand.rotateAngleY = 0.0f + this.body.rotateAngleY;
        this.leftHand.rotateAngleY = 3.1415927f + this.body.rotateAngleY;
        this.rightHand.rotationPointX = llllllllllllIlllIllIlIIIIlIlIIlI * 5.0f;
        this.rightHand.rotationPointZ = -llllllllllllIlllIllIlIIIIlIlIIll * 5.0f;
        this.leftHand.rotationPointX = -llllllllllllIlllIllIlIIIIlIlIIlI * 5.0f;
        this.leftHand.rotationPointZ = llllllllllllIlllIllIlIIIIlIlIIll * 5.0f;
    }
}
