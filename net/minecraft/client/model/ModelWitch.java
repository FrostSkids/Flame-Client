// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;

public class ModelWitch extends ModelVillager
{
    public /* synthetic */ boolean field_82900_g;
    private static final /* synthetic */ int[] lllIllllIlllll;
    private /* synthetic */ ModelRenderer witchHat;
    private /* synthetic */ ModelRenderer field_82901_h;
    
    private static void lIlIIllIIIIlllIl() {
        (lllIllllIlllll = new int[11])[0] = (0x2D ^ 0x20 ^ (0xF1 ^ 0xBC));
        ModelWitch.lllIllllIlllll[1] = 10 + 65 + 9 + 44;
        ModelWitch.lllIllllIlllll[2] = ((170 + 105 - 105 + 56 ^ 121 + 129 - 216 + 96) & (0x8 ^ 0x21 ^ (0xC3 ^ 0x8A) ^ -" ".length()));
        ModelWitch.lllIllllIlllll[3] = " ".length();
        ModelWitch.lllIllllIlllll[4] = (0x8F ^ 0x85);
        ModelWitch.lllIllllIlllll[5] = "  ".length();
        ModelWitch.lllIllllIlllll[6] = (0xD8 ^ 0x94);
        ModelWitch.lllIllllIlllll[7] = (0x99 ^ 0x9E);
        ModelWitch.lllIllllIlllll[8] = (0x79 ^ 0x7D);
        ModelWitch.lllIllllIlllll[9] = (96 + 150 - 79 + 37 ^ 95 + 14 - 64 + 110);
        ModelWitch.lllIllllIlllll[10] = (0x47 ^ 0x18);
    }
    
    @Override
    public void setRotationAngles(final float llllllllllllIlIlIlllllIlllIIIllI, final float llllllllllllIlIlIlllllIlllIIlllI, final float llllllllllllIlIlIlllllIlllIIIlII, final float llllllllllllIlIlIlllllIlllIIIIll, final float llllllllllllIlIlIlllllIlllIIIIlI, final float llllllllllllIlIlIlllllIlllIIIIIl, final Entity llllllllllllIlIlIlllllIlllIIlIIl) {
        super.setRotationAngles(llllllllllllIlIlIlllllIlllIIIllI, llllllllllllIlIlIlllllIlllIIlllI, llllllllllllIlIlIlllllIlllIIIlII, llllllllllllIlIlIlllllIlllIIIIll, llllllllllllIlIlIlllllIlllIIIIlI, llllllllllllIlIlIlllllIlllIIIIIl, llllllllllllIlIlIlllllIlllIIlIIl);
        final ModelRenderer villagerNose = this.villagerNose;
        final ModelRenderer villagerNose2 = this.villagerNose;
        final ModelRenderer villagerNose3 = this.villagerNose;
        final float offsetX = 0.0f;
        villagerNose3.offsetZ = offsetX;
        villagerNose2.offsetY = offsetX;
        villagerNose.offsetX = offsetX;
        final float llllllllllllIlIlIlllllIlllIIlIII = 0.01f * (llllllllllllIlIlIlllllIlllIIlIIl.getEntityId() % ModelWitch.lllIllllIlllll[4]);
        this.villagerNose.rotateAngleX = MathHelper.sin(llllllllllllIlIlIlllllIlllIIlIIl.ticksExisted * llllllllllllIlIlIlllllIlllIIlIII) * 4.5f * 3.1415927f / 180.0f;
        this.villagerNose.rotateAngleY = 0.0f;
        this.villagerNose.rotateAngleZ = MathHelper.cos(llllllllllllIlIlIlllllIlllIIlIIl.ticksExisted * llllllllllllIlIlIlllllIlllIIlIII) * 2.5f * 3.1415927f / 180.0f;
        if (lIlIIllIIIIllllI(this.field_82900_g ? 1 : 0)) {
            this.villagerNose.rotateAngleX = -0.9f;
            this.villagerNose.offsetZ = -0.09375f;
            this.villagerNose.offsetY = 0.1875f;
        }
    }
    
    static {
        lIlIIllIIIIlllIl();
    }
    
    public ModelWitch(final float llllllllllllIlIlIlllllIllllIIIlI) {
        super(llllllllllllIlIlIlllllIllllIIIlI, 0.0f, ModelWitch.lllIllllIlllll[0], ModelWitch.lllIllllIlllll[1]);
        this.field_82901_h = new ModelRenderer(this).setTextureSize(ModelWitch.lllIllllIlllll[0], ModelWitch.lllIllllIlllll[1]);
        this.field_82901_h.setRotationPoint(0.0f, -2.0f, 0.0f);
        this.field_82901_h.setTextureOffset(ModelWitch.lllIllllIlllll[2], ModelWitch.lllIllllIlllll[2]).addBox(0.0f, 3.0f, -6.75f, ModelWitch.lllIllllIlllll[3], ModelWitch.lllIllllIlllll[3], ModelWitch.lllIllllIlllll[3], -0.25f);
        this.villagerNose.addChild(this.field_82901_h);
        this.witchHat = new ModelRenderer(this).setTextureSize(ModelWitch.lllIllllIlllll[0], ModelWitch.lllIllllIlllll[1]);
        this.witchHat.setRotationPoint(-5.0f, -10.03125f, -5.0f);
        this.witchHat.setTextureOffset(ModelWitch.lllIllllIlllll[2], ModelWitch.lllIllllIlllll[0]).addBox(0.0f, 0.0f, 0.0f, ModelWitch.lllIllllIlllll[4], ModelWitch.lllIllllIlllll[5], ModelWitch.lllIllllIlllll[4]);
        "".length();
        this.villagerHead.addChild(this.witchHat);
        final ModelRenderer llllllllllllIlIlIlllllIllllIIIIl = new ModelRenderer(this).setTextureSize(ModelWitch.lllIllllIlllll[0], ModelWitch.lllIllllIlllll[1]);
        llllllllllllIlIlIlllllIllllIIIIl.setRotationPoint(1.75f, -4.0f, 2.0f);
        llllllllllllIlIlIlllllIllllIIIIl.setTextureOffset(ModelWitch.lllIllllIlllll[2], ModelWitch.lllIllllIlllll[6]).addBox(0.0f, 0.0f, 0.0f, ModelWitch.lllIllllIlllll[7], ModelWitch.lllIllllIlllll[8], ModelWitch.lllIllllIlllll[7]);
        "".length();
        llllllllllllIlIlIlllllIllllIIIIl.rotateAngleX = -0.05235988f;
        llllllllllllIlIlIlllllIllllIIIIl.rotateAngleZ = 0.02617994f;
        this.witchHat.addChild(llllllllllllIlIlIlllllIllllIIIIl);
        final ModelRenderer llllllllllllIlIlIlllllIllllIIIII = new ModelRenderer(this).setTextureSize(ModelWitch.lllIllllIlllll[0], ModelWitch.lllIllllIlllll[1]);
        llllllllllllIlIlIlllllIllllIIIII.setRotationPoint(1.75f, -4.0f, 2.0f);
        llllllllllllIlIlIlllllIllllIIIII.setTextureOffset(ModelWitch.lllIllllIlllll[2], ModelWitch.lllIllllIlllll[9]).addBox(0.0f, 0.0f, 0.0f, ModelWitch.lllIllllIlllll[8], ModelWitch.lllIllllIlllll[8], ModelWitch.lllIllllIlllll[8]);
        "".length();
        llllllllllllIlIlIlllllIllllIIIII.rotateAngleX = -0.10471976f;
        llllllllllllIlIlIlllllIllllIIIII.rotateAngleZ = 0.05235988f;
        llllllllllllIlIlIlllllIllllIIIIl.addChild(llllllllllllIlIlIlllllIllllIIIII);
        final ModelRenderer llllllllllllIlIlIlllllIlllIlllll = new ModelRenderer(this).setTextureSize(ModelWitch.lllIllllIlllll[0], ModelWitch.lllIllllIlllll[1]);
        llllllllllllIlIlIlllllIlllIlllll.setRotationPoint(1.75f, -2.0f, 2.0f);
        llllllllllllIlIlIlllllIlllIlllll.setTextureOffset(ModelWitch.lllIllllIlllll[2], ModelWitch.lllIllllIlllll[10]).addBox(0.0f, 0.0f, 0.0f, ModelWitch.lllIllllIlllll[3], ModelWitch.lllIllllIlllll[5], ModelWitch.lllIllllIlllll[3], 0.25f);
        llllllllllllIlIlIlllllIlllIlllll.rotateAngleX = -0.20943952f;
        llllllllllllIlIlIlllllIlllIlllll.rotateAngleZ = 0.10471976f;
        llllllllllllIlIlIlllllIllllIIIII.addChild(llllllllllllIlIlIlllllIlllIlllll);
    }
    
    private static boolean lIlIIllIIIIllllI(final int llllllllllllIlIlIlllllIllIllllIl) {
        return llllllllllllIlIlIlllllIllIllllIl != 0;
    }
}
