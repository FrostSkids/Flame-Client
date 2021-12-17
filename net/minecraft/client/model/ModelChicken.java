// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;

public class ModelChicken extends ModelBase
{
    public /* synthetic */ ModelRenderer rightLeg;
    public /* synthetic */ ModelRenderer leftWing;
    public /* synthetic */ ModelRenderer rightWing;
    public /* synthetic */ ModelRenderer bill;
    public /* synthetic */ ModelRenderer body;
    public /* synthetic */ ModelRenderer leftLeg;
    public /* synthetic */ ModelRenderer head;
    public /* synthetic */ ModelRenderer chin;
    private static final /* synthetic */ int[] lllIlllIIIlIll;
    
    private static boolean lIlIIlIllIIIlIIl(final int llllllllllllIlIllIIIIllIIIllIIIl) {
        return llllllllllllIlIllIIIIllIIIllIIIl != 0;
    }
    
    static {
        lIlIIlIllIIIlIII();
    }
    
    public ModelChicken() {
        final int llllllllllllIlIllIIIIllIIllIIlII = ModelChicken.lllIlllIIIlIll[0];
        this.head = new ModelRenderer(this, ModelChicken.lllIlllIIIlIll[1], ModelChicken.lllIlllIIIlIll[1]);
        this.head.addBox(-2.0f, -6.0f, -2.0f, ModelChicken.lllIlllIIIlIll[2], ModelChicken.lllIlllIIIlIll[3], ModelChicken.lllIlllIIIlIll[4], 0.0f);
        this.head.setRotationPoint(0.0f, (float)(ModelChicken.lllIlllIIIlIll[5] + llllllllllllIlIllIIIIllIIllIIlII), -4.0f);
        this.bill = new ModelRenderer(this, ModelChicken.lllIlllIIIlIll[6], ModelChicken.lllIlllIIIlIll[1]);
        this.bill.addBox(-2.0f, -4.0f, -4.0f, ModelChicken.lllIlllIIIlIll[2], ModelChicken.lllIlllIIIlIll[7], ModelChicken.lllIlllIIIlIll[7], 0.0f);
        this.bill.setRotationPoint(0.0f, (float)(ModelChicken.lllIlllIIIlIll[5] + llllllllllllIlIllIIIIllIIllIIlII), -4.0f);
        this.chin = new ModelRenderer(this, ModelChicken.lllIlllIIIlIll[6], ModelChicken.lllIlllIIIlIll[2]);
        this.chin.addBox(-1.0f, -2.0f, -3.0f, ModelChicken.lllIlllIIIlIll[7], ModelChicken.lllIlllIIIlIll[7], ModelChicken.lllIlllIIIlIll[7], 0.0f);
        this.chin.setRotationPoint(0.0f, (float)(ModelChicken.lllIlllIIIlIll[5] + llllllllllllIlIllIIIIllIIllIIlII), -4.0f);
        this.body = new ModelRenderer(this, ModelChicken.lllIlllIIIlIll[1], ModelChicken.lllIlllIIIlIll[8]);
        this.body.addBox(-3.0f, -4.0f, -3.0f, ModelChicken.lllIlllIIIlIll[3], ModelChicken.lllIlllIIIlIll[9], ModelChicken.lllIlllIIIlIll[3], 0.0f);
        this.body.setRotationPoint(0.0f, (float)llllllllllllIlIllIIIIllIIllIIlII, 0.0f);
        this.rightLeg = new ModelRenderer(this, ModelChicken.lllIlllIIIlIll[10], ModelChicken.lllIlllIIIlIll[1]);
        this.rightLeg.addBox(-1.0f, 0.0f, -3.0f, ModelChicken.lllIlllIIIlIll[4], ModelChicken.lllIlllIIIlIll[11], ModelChicken.lllIlllIIIlIll[4]);
        "".length();
        this.rightLeg.setRotationPoint(-2.0f, (float)(ModelChicken.lllIlllIIIlIll[4] + llllllllllllIlIllIIIIllIIllIIlII), 1.0f);
        this.leftLeg = new ModelRenderer(this, ModelChicken.lllIlllIIIlIll[10], ModelChicken.lllIlllIIIlIll[1]);
        this.leftLeg.addBox(-1.0f, 0.0f, -3.0f, ModelChicken.lllIlllIIIlIll[4], ModelChicken.lllIlllIIIlIll[11], ModelChicken.lllIlllIIIlIll[4]);
        "".length();
        this.leftLeg.setRotationPoint(1.0f, (float)(ModelChicken.lllIlllIIIlIll[4] + llllllllllllIlIllIIIIllIIllIIlII), 1.0f);
        this.rightWing = new ModelRenderer(this, ModelChicken.lllIlllIIIlIll[12], ModelChicken.lllIlllIIIlIll[13]);
        this.rightWing.addBox(0.0f, 0.0f, -3.0f, ModelChicken.lllIlllIIIlIll[14], ModelChicken.lllIlllIIIlIll[2], ModelChicken.lllIlllIIIlIll[3]);
        "".length();
        this.rightWing.setRotationPoint(-4.0f, (float)(ModelChicken.lllIlllIIIlIll[15] + llllllllllllIlIllIIIIllIIllIIlII), 0.0f);
        this.leftWing = new ModelRenderer(this, ModelChicken.lllIlllIIIlIll[12], ModelChicken.lllIlllIIIlIll[13]);
        this.leftWing.addBox(-1.0f, 0.0f, -3.0f, ModelChicken.lllIlllIIIlIll[14], ModelChicken.lllIlllIIIlIll[2], ModelChicken.lllIlllIIIlIll[3]);
        "".length();
        this.leftWing.setRotationPoint(4.0f, (float)(ModelChicken.lllIlllIIIlIll[15] + llllllllllllIlIllIIIIllIIllIIlII), 0.0f);
    }
    
    private static void lIlIIlIllIIIlIII() {
        (lllIlllIIIlIll = new int[16])[0] = ("   ".length() ^ (0xBD ^ 0xAE));
        ModelChicken.lllIlllIIIlIll[1] = ((0xA4 ^ 0x93) & ~(0x62 ^ 0x55));
        ModelChicken.lllIlllIIIlIll[2] = (30 + 77 - 84 + 130 ^ 74 + 108 - 93 + 68);
        ModelChicken.lllIlllIIIlIll[3] = (0x8E ^ 0xA5 ^ (0x41 ^ 0x6C));
        ModelChicken.lllIlllIIIlIll[4] = "   ".length();
        ModelChicken.lllIlllIIIlIll[5] = -" ".length();
        ModelChicken.lllIlllIIIlIll[6] = (0x71 ^ 0x7F);
        ModelChicken.lllIlllIIIlIll[7] = "  ".length();
        ModelChicken.lllIlllIIIlIll[8] = (1 + 158 + 27 + 4 ^ 70 + 111 - 136 + 138);
        ModelChicken.lllIlllIIIlIll[9] = (0xAC ^ 0xA4);
        ModelChicken.lllIlllIIIlIll[10] = (0x7E ^ 0x64 ^ ((0x93 ^ 0x82) & ~(0x17 ^ 0x6)));
        ModelChicken.lllIlllIIIlIll[11] = (151 + 76 - 202 + 160 ^ 184 + 22 - 188 + 170);
        ModelChicken.lllIlllIIIlIll[12] = (0x74 ^ 0x6C);
        ModelChicken.lllIlllIIIlIll[13] = (0x56 ^ 0x5B);
        ModelChicken.lllIlllIIIlIll[14] = " ".length();
        ModelChicken.lllIlllIIIlIll[15] = -"   ".length();
    }
    
    @Override
    public void setRotationAngles(final float llllllllllllIlIllIIIIllIIIllIlll, final float llllllllllllIlIllIIIIllIIIllIllI, final float llllllllllllIlIllIIIIllIIIllllIl, final float llllllllllllIlIllIIIIllIIIllllII, final float llllllllllllIlIllIIIIllIIIlllIll, final float llllllllllllIlIllIIIIllIIIlllIlI, final Entity llllllllllllIlIllIIIIllIIIlllIIl) {
        this.head.rotateAngleX = llllllllllllIlIllIIIIllIIIlllIll / 57.295776f;
        this.head.rotateAngleY = llllllllllllIlIllIIIIllIIIllllII / 57.295776f;
        this.bill.rotateAngleX = this.head.rotateAngleX;
        this.bill.rotateAngleY = this.head.rotateAngleY;
        this.chin.rotateAngleX = this.head.rotateAngleX;
        this.chin.rotateAngleY = this.head.rotateAngleY;
        this.body.rotateAngleX = 1.5707964f;
        this.rightLeg.rotateAngleX = MathHelper.cos(llllllllllllIlIllIIIIllIIIllIlll * 0.6662f) * 1.4f * llllllllllllIlIllIIIIllIIIllIllI;
        this.leftLeg.rotateAngleX = MathHelper.cos(llllllllllllIlIllIIIIllIIIllIlll * 0.6662f + 3.1415927f) * 1.4f * llllllllllllIlIllIIIIllIIIllIllI;
        this.rightWing.rotateAngleZ = llllllllllllIlIllIIIIllIIIllllIl;
        this.leftWing.rotateAngleZ = -llllllllllllIlIllIIIIllIIIllllIl;
    }
    
    @Override
    public void render(final Entity llllllllllllIlIllIIIIllIIlIIlllI, final float llllllllllllIlIllIIIIllIIlIIllIl, final float llllllllllllIlIllIIIIllIIlIIllII, final float llllllllllllIlIllIIIIllIIlIlIlII, final float llllllllllllIlIllIIIIllIIlIlIIll, final float llllllllllllIlIllIIIIllIIlIIlIIl, final float llllllllllllIlIllIIIIllIIlIlIIIl) {
        this.setRotationAngles(llllllllllllIlIllIIIIllIIlIIllIl, llllllllllllIlIllIIIIllIIlIIllII, llllllllllllIlIllIIIIllIIlIlIlII, llllllllllllIlIllIIIIllIIlIlIIll, llllllllllllIlIllIIIIllIIlIIlIIl, llllllllllllIlIllIIIIllIIlIlIIIl, llllllllllllIlIllIIIIllIIlIIlllI);
        if (lIlIIlIllIIIlIIl(this.isChild ? 1 : 0)) {
            final float llllllllllllIlIllIIIIllIIlIlIIII = 2.0f;
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.0f, 5.0f * llllllllllllIlIllIIIIllIIlIlIIIl, 2.0f * llllllllllllIlIllIIIIllIIlIlIIIl);
            this.head.render(llllllllllllIlIllIIIIllIIlIlIIIl);
            this.bill.render(llllllllllllIlIllIIIIllIIlIlIIIl);
            this.chin.render(llllllllllllIlIllIIIIllIIlIlIIIl);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.scale(1.0f / llllllllllllIlIllIIIIllIIlIlIIII, 1.0f / llllllllllllIlIllIIIIllIIlIlIIII, 1.0f / llllllllllllIlIllIIIIllIIlIlIIII);
            GlStateManager.translate(0.0f, 24.0f * llllllllllllIlIllIIIIllIIlIlIIIl, 0.0f);
            this.body.render(llllllllllllIlIllIIIIllIIlIlIIIl);
            this.rightLeg.render(llllllllllllIlIllIIIIllIIlIlIIIl);
            this.leftLeg.render(llllllllllllIlIllIIIIllIIlIlIIIl);
            this.rightWing.render(llllllllllllIlIllIIIIllIIlIlIIIl);
            this.leftWing.render(llllllllllllIlIllIIIIllIIlIlIIIl);
            GlStateManager.popMatrix();
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
        else {
            this.head.render(llllllllllllIlIllIIIIllIIlIlIIIl);
            this.bill.render(llllllllllllIlIllIIIIllIIlIlIIIl);
            this.chin.render(llllllllllllIlIllIIIIllIIlIlIIIl);
            this.body.render(llllllllllllIlIllIIIIllIIlIlIIIl);
            this.rightLeg.render(llllllllllllIlIllIIIIllIIlIlIIIl);
            this.leftLeg.render(llllllllllllIlIllIIIIllIIlIlIIIl);
            this.rightWing.render(llllllllllllIlIllIIIIllIIlIlIIIl);
            this.leftWing.render(llllllllllllIlIllIIIIllIIlIlIIIl);
        }
    }
}
