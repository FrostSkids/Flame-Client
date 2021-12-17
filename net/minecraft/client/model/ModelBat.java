// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.Entity;

public class ModelBat extends ModelBase
{
    private /* synthetic */ ModelRenderer batOuterLeftWing;
    private /* synthetic */ ModelRenderer batOuterRightWing;
    private /* synthetic */ ModelRenderer batBody;
    private static final /* synthetic */ int[] llIIlIllIlIllI;
    private /* synthetic */ ModelRenderer batHead;
    private /* synthetic */ ModelRenderer batRightWing;
    private /* synthetic */ ModelRenderer batLeftWing;
    
    public ModelBat() {
        this.textureWidth = ModelBat.llIIlIllIlIllI[0];
        this.textureHeight = ModelBat.llIIlIllIlIllI[0];
        this.batHead = new ModelRenderer(this, ModelBat.llIIlIllIlIllI[1], ModelBat.llIIlIllIlIllI[1]);
        this.batHead.addBox(-3.0f, -3.0f, -3.0f, ModelBat.llIIlIllIlIllI[2], ModelBat.llIIlIllIlIllI[2], ModelBat.llIIlIllIlIllI[2]);
        "".length();
        final ModelRenderer llllllllllllIlllIIIlIlIIIIIlllll = new ModelRenderer(this, ModelBat.llIIlIllIlIllI[3], ModelBat.llIIlIllIlIllI[1]);
        llllllllllllIlllIIIlIlIIIIIlllll.addBox(-4.0f, -6.0f, -2.0f, ModelBat.llIIlIllIlIllI[4], ModelBat.llIIlIllIlIllI[5], ModelBat.llIIlIllIlIllI[6]);
        "".length();
        this.batHead.addChild(llllllllllllIlllIIIlIlIIIIIlllll);
        final ModelRenderer llllllllllllIlllIIIlIlIIIIIllllI = new ModelRenderer(this, ModelBat.llIIlIllIlIllI[3], ModelBat.llIIlIllIlIllI[1]);
        llllllllllllIlllIIIlIlIIIIIllllI.mirror = (ModelBat.llIIlIllIlIllI[6] != 0);
        llllllllllllIlllIIIlIlIIIIIllllI.addBox(1.0f, -6.0f, -2.0f, ModelBat.llIIlIllIlIllI[4], ModelBat.llIIlIllIlIllI[5], ModelBat.llIIlIllIlIllI[6]);
        "".length();
        this.batHead.addChild(llllllllllllIlllIIIlIlIIIIIllllI);
        this.batBody = new ModelRenderer(this, ModelBat.llIIlIllIlIllI[1], ModelBat.llIIlIllIlIllI[7]);
        this.batBody.addBox(-3.0f, 4.0f, -3.0f, ModelBat.llIIlIllIlIllI[2], ModelBat.llIIlIllIlIllI[8], ModelBat.llIIlIllIlIllI[2]);
        "".length();
        this.batBody.setTextureOffset(ModelBat.llIIlIllIlIllI[1], ModelBat.llIIlIllIlIllI[9]).addBox(-5.0f, 16.0f, 0.0f, ModelBat.llIIlIllIlIllI[10], ModelBat.llIIlIllIlIllI[2], ModelBat.llIIlIllIlIllI[6]);
        "".length();
        this.batRightWing = new ModelRenderer(this, ModelBat.llIIlIllIlIllI[11], ModelBat.llIIlIllIlIllI[1]);
        this.batRightWing.addBox(-12.0f, 1.0f, 1.5f, ModelBat.llIIlIllIlIllI[10], ModelBat.llIIlIllIlIllI[7], ModelBat.llIIlIllIlIllI[6]);
        "".length();
        this.batOuterRightWing = new ModelRenderer(this, ModelBat.llIIlIllIlIllI[3], ModelBat.llIIlIllIlIllI[7]);
        this.batOuterRightWing.setRotationPoint(-12.0f, 1.0f, 1.5f);
        this.batOuterRightWing.addBox(-8.0f, 1.0f, 0.0f, ModelBat.llIIlIllIlIllI[12], ModelBat.llIIlIllIlIllI[8], ModelBat.llIIlIllIlIllI[6]);
        "".length();
        this.batLeftWing = new ModelRenderer(this, ModelBat.llIIlIllIlIllI[11], ModelBat.llIIlIllIlIllI[1]);
        this.batLeftWing.mirror = (ModelBat.llIIlIllIlIllI[6] != 0);
        this.batLeftWing.addBox(2.0f, 1.0f, 1.5f, ModelBat.llIIlIllIlIllI[10], ModelBat.llIIlIllIlIllI[7], ModelBat.llIIlIllIlIllI[6]);
        "".length();
        this.batOuterLeftWing = new ModelRenderer(this, ModelBat.llIIlIllIlIllI[3], ModelBat.llIIlIllIlIllI[7]);
        this.batOuterLeftWing.mirror = (ModelBat.llIIlIllIlIllI[6] != 0);
        this.batOuterLeftWing.setRotationPoint(12.0f, 1.0f, 1.5f);
        this.batOuterLeftWing.addBox(0.0f, 1.0f, 0.0f, ModelBat.llIIlIllIlIllI[12], ModelBat.llIIlIllIlIllI[8], ModelBat.llIIlIllIlIllI[6]);
        "".length();
        this.batBody.addChild(this.batRightWing);
        this.batBody.addChild(this.batLeftWing);
        this.batRightWing.addChild(this.batOuterRightWing);
        this.batLeftWing.addChild(this.batOuterLeftWing);
    }
    
    @Override
    public void setRotationAngles(final float llllllllllllIlllIIIlIIlllllllIll, final float llllllllllllIlllIIIlIIlllllllIlI, final float llllllllllllIlllIIIlIIlllllllIIl, final float llllllllllllIlllIIIlIIllllllIIII, final float llllllllllllIlllIIIlIIlllllIllll, final float llllllllllllIlllIIIlIIllllllIllI, final Entity llllllllllllIlllIIIlIIlllllIlllI) {
        if (lIIIllIllIlllIII(((EntityBat)llllllllllllIlllIIIlIIlllllIlllI).getIsBatHanging() ? 1 : 0)) {
            final float llllllllllllIlllIIIlIIllllllIlII = 57.295776f;
            this.batHead.rotateAngleX = llllllllllllIlllIIIlIIlllllIllll / 57.295776f;
            this.batHead.rotateAngleY = 3.1415927f - llllllllllllIlllIIIlIIllllllIIII / 57.295776f;
            this.batHead.rotateAngleZ = 3.1415927f;
            this.batHead.setRotationPoint(0.0f, -2.0f, 0.0f);
            this.batRightWing.setRotationPoint(-3.0f, 0.0f, 3.0f);
            this.batLeftWing.setRotationPoint(3.0f, 0.0f, 3.0f);
            this.batBody.rotateAngleX = 3.1415927f;
            this.batRightWing.rotateAngleX = -0.15707964f;
            this.batRightWing.rotateAngleY = -1.2566371f;
            this.batOuterRightWing.rotateAngleY = -1.7278761f;
            this.batLeftWing.rotateAngleX = this.batRightWing.rotateAngleX;
            this.batLeftWing.rotateAngleY = -this.batRightWing.rotateAngleY;
            this.batOuterLeftWing.rotateAngleY = -this.batOuterRightWing.rotateAngleY;
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        else {
            final float llllllllllllIlllIIIlIIllllllIIll = 57.295776f;
            this.batHead.rotateAngleX = llllllllllllIlllIIIlIIlllllIllll / 57.295776f;
            this.batHead.rotateAngleY = llllllllllllIlllIIIlIIllllllIIII / 57.295776f;
            this.batHead.rotateAngleZ = 0.0f;
            this.batHead.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.batRightWing.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.batLeftWing.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.batBody.rotateAngleX = 0.7853982f + MathHelper.cos(llllllllllllIlllIIIlIIlllllllIIl * 0.1f) * 0.15f;
            this.batBody.rotateAngleY = 0.0f;
            this.batRightWing.rotateAngleY = MathHelper.cos(llllllllllllIlllIIIlIIlllllllIIl * 1.3f) * 3.1415927f * 0.25f;
            this.batLeftWing.rotateAngleY = -this.batRightWing.rotateAngleY;
            this.batOuterRightWing.rotateAngleY = this.batRightWing.rotateAngleY * 0.5f;
            this.batOuterLeftWing.rotateAngleY = -this.batRightWing.rotateAngleY * 0.5f;
        }
    }
    
    private static boolean lIIIllIllIlllIII(final int llllllllllllIlllIIIlIIlllllIlIll) {
        return llllllllllllIlllIIIlIIlllllIlIll != 0;
    }
    
    @Override
    public void render(final Entity llllllllllllIlllIIIlIlIIIIIlIIIl, final float llllllllllllIlllIIIlIlIIIIIlIIII, final float llllllllllllIlllIIIlIlIIIIIIllll, final float llllllllllllIlllIIIlIlIIIIIIlllI, final float llllllllllllIlllIIIlIlIIIIIIIlIl, final float llllllllllllIlllIIIlIlIIIIIIllII, final float llllllllllllIlllIIIlIlIIIIIIIIll) {
        this.setRotationAngles(llllllllllllIlllIIIlIlIIIIIlIIII, llllllllllllIlllIIIlIlIIIIIIllll, llllllllllllIlllIIIlIlIIIIIIlllI, llllllllllllIlllIIIlIlIIIIIIIlIl, llllllllllllIlllIIIlIlIIIIIIllII, llllllllllllIlllIIIlIlIIIIIIIIll, llllllllllllIlllIIIlIlIIIIIlIIIl);
        this.batHead.render(llllllllllllIlllIIIlIlIIIIIIIIll);
        this.batBody.render(llllllllllllIlllIIIlIlIIIIIIIIll);
    }
    
    private static void lIIIllIllIllIlll() {
        (llIIlIllIlIllI = new int[13])[0] = (56 + 122 - 138 + 156 ^ 100 + 56 - 34 + 10);
        ModelBat.llIIlIllIlIllI[1] = ((0x62 ^ 0x59) & ~(0x23 ^ 0x18));
        ModelBat.llIIlIllIlIllI[2] = (0xF4 ^ 0xB9 ^ (0x62 ^ 0x29));
        ModelBat.llIIlIllIlIllI[3] = ("  ".length() ^ (0x3D ^ 0x27));
        ModelBat.llIIlIllIlIllI[4] = "   ".length();
        ModelBat.llIIlIllIlIllI[5] = (0x14 ^ 0x1 ^ (0x9A ^ 0x8B));
        ModelBat.llIIlIllIlIllI[6] = " ".length();
        ModelBat.llIIlIllIlIllI[7] = (0xBC ^ 0xAC);
        ModelBat.llIIlIllIlIllI[8] = (121 + 59 - 77 + 32 ^ 96 + 116 - 179 + 106);
        ModelBat.llIIlIllIlIllI[9] = (0x2A ^ 0x8);
        ModelBat.llIIlIllIlIllI[10] = (0x1F ^ 0x15);
        ModelBat.llIIlIllIlIllI[11] = (199 + 197 - 327 + 168 ^ 30 + 154 - 147 + 162);
        ModelBat.llIIlIllIlIllI[12] = (0x63 ^ 0x6B);
    }
    
    static {
        lIIIllIllIllIlll();
    }
}
