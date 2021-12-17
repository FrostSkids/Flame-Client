// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;

public class ModelVillager extends ModelBase
{
    public /* synthetic */ ModelRenderer villagerArms;
    public /* synthetic */ ModelRenderer leftVillagerLeg;
    public /* synthetic */ ModelRenderer rightVillagerLeg;
    public /* synthetic */ ModelRenderer villagerHead;
    public /* synthetic */ ModelRenderer villagerNose;
    public /* synthetic */ ModelRenderer villagerBody;
    private static final /* synthetic */ int[] lllIlIIlIllIIl;
    
    public ModelVillager(final float llllllllllllIlIllIllllIlIIlIllIl, final float llllllllllllIlIllIllllIlIIlIIlll, final int llllllllllllIlIllIllllIlIIlIlIll, final int llllllllllllIlIllIllllIlIIlIlIlI) {
        this.villagerHead = new ModelRenderer(this).setTextureSize(llllllllllllIlIllIllllIlIIlIlIll, llllllllllllIlIllIllllIlIIlIlIlI);
        this.villagerHead.setRotationPoint(0.0f, 0.0f + llllllllllllIlIllIllllIlIIlIIlll, 0.0f);
        this.villagerHead.setTextureOffset(ModelVillager.lllIlIIlIllIIl[1], ModelVillager.lllIlIIlIllIIl[1]).addBox(-4.0f, -10.0f, -4.0f, ModelVillager.lllIlIIlIllIIl[2], ModelVillager.lllIlIIlIllIIl[3], ModelVillager.lllIlIIlIllIIl[2], llllllllllllIlIllIllllIlIIlIllIl);
        this.villagerNose = new ModelRenderer(this).setTextureSize(llllllllllllIlIllIllllIlIIlIlIll, llllllllllllIlIllIllllIlIIlIlIlI);
        this.villagerNose.setRotationPoint(0.0f, llllllllllllIlIllIllllIlIIlIIlll - 2.0f, 0.0f);
        this.villagerNose.setTextureOffset(ModelVillager.lllIlIIlIllIIl[4], ModelVillager.lllIlIIlIllIIl[1]).addBox(-1.0f, -1.0f, -6.0f, ModelVillager.lllIlIIlIllIIl[5], ModelVillager.lllIlIIlIllIIl[6], ModelVillager.lllIlIIlIllIIl[5], llllllllllllIlIllIllllIlIIlIllIl);
        this.villagerHead.addChild(this.villagerNose);
        this.villagerBody = new ModelRenderer(this).setTextureSize(llllllllllllIlIllIllllIlIIlIlIll, llllllllllllIlIllIllllIlIIlIlIlI);
        this.villagerBody.setRotationPoint(0.0f, 0.0f + llllllllllllIlIllIllllIlIIlIIlll, 0.0f);
        this.villagerBody.setTextureOffset(ModelVillager.lllIlIIlIllIIl[7], ModelVillager.lllIlIIlIllIIl[8]).addBox(-4.0f, 0.0f, -3.0f, ModelVillager.lllIlIIlIllIIl[2], ModelVillager.lllIlIIlIllIIl[9], ModelVillager.lllIlIIlIllIIl[10], llllllllllllIlIllIllllIlIIlIllIl);
        this.villagerBody.setTextureOffset(ModelVillager.lllIlIIlIllIIl[1], ModelVillager.lllIlIIlIllIIl[11]).addBox(-4.0f, 0.0f, -3.0f, ModelVillager.lllIlIIlIllIIl[2], ModelVillager.lllIlIIlIllIIl[12], ModelVillager.lllIlIIlIllIIl[10], llllllllllllIlIllIllllIlIIlIllIl + 0.5f);
        this.villagerArms = new ModelRenderer(this).setTextureSize(llllllllllllIlIllIllllIlIIlIlIll, llllllllllllIlIllIllllIlIIlIlIlI);
        this.villagerArms.setRotationPoint(0.0f, 0.0f + llllllllllllIlIllIllllIlIIlIIlll + 2.0f, 0.0f);
        this.villagerArms.setTextureOffset(ModelVillager.lllIlIIlIllIIl[13], ModelVillager.lllIlIIlIllIIl[14]).addBox(-8.0f, -2.0f, -2.0f, ModelVillager.lllIlIIlIllIIl[6], ModelVillager.lllIlIIlIllIIl[2], ModelVillager.lllIlIIlIllIIl[6], llllllllllllIlIllIllllIlIIlIllIl);
        this.villagerArms.setTextureOffset(ModelVillager.lllIlIIlIllIIl[13], ModelVillager.lllIlIIlIllIIl[14]).addBox(4.0f, -2.0f, -2.0f, ModelVillager.lllIlIIlIllIIl[6], ModelVillager.lllIlIIlIllIIl[2], ModelVillager.lllIlIIlIllIIl[6], llllllllllllIlIllIllllIlIIlIllIl);
        this.villagerArms.setTextureOffset(ModelVillager.lllIlIIlIllIIl[15], ModelVillager.lllIlIIlIllIIl[11]).addBox(-4.0f, 2.0f, -2.0f, ModelVillager.lllIlIIlIllIIl[2], ModelVillager.lllIlIIlIllIIl[6], ModelVillager.lllIlIIlIllIIl[6], llllllllllllIlIllIllllIlIIlIllIl);
        this.rightVillagerLeg = new ModelRenderer(this, ModelVillager.lllIlIIlIllIIl[1], ModelVillager.lllIlIIlIllIIl[14]).setTextureSize(llllllllllllIlIllIllllIlIIlIlIll, llllllllllllIlIllIllllIlIIlIlIlI);
        this.rightVillagerLeg.setRotationPoint(-2.0f, 12.0f + llllllllllllIlIllIllllIlIIlIIlll, 0.0f);
        this.rightVillagerLeg.addBox(-2.0f, 0.0f, -2.0f, ModelVillager.lllIlIIlIllIIl[6], ModelVillager.lllIlIIlIllIIl[9], ModelVillager.lllIlIIlIllIIl[6], llllllllllllIlIllIllllIlIIlIllIl);
        this.leftVillagerLeg = new ModelRenderer(this, ModelVillager.lllIlIIlIllIIl[1], ModelVillager.lllIlIIlIllIIl[14]).setTextureSize(llllllllllllIlIllIllllIlIIlIlIll, llllllllllllIlIllIllllIlIIlIlIlI);
        this.leftVillagerLeg.mirror = (ModelVillager.lllIlIIlIllIIl[16] != 0);
        this.leftVillagerLeg.setRotationPoint(2.0f, 12.0f + llllllllllllIlIllIllllIlIIlIIlll, 0.0f);
        this.leftVillagerLeg.addBox(-2.0f, 0.0f, -2.0f, ModelVillager.lllIlIIlIllIIl[6], ModelVillager.lllIlIIlIllIIl[9], ModelVillager.lllIlIIlIllIIl[6], llllllllllllIlIllIllllIlIIlIllIl);
    }
    
    @Override
    public void render(final Entity llllllllllllIlIllIllllIlIIIlIIll, final float llllllllllllIlIllIllllIlIIIllIlI, final float llllllllllllIlIllIllllIlIIIllIIl, final float llllllllllllIlIllIllllIlIIIllIII, final float llllllllllllIlIllIllllIlIIIIllll, final float llllllllllllIlIllIllllIlIIIIlllI, final float llllllllllllIlIllIllllIlIIIlIlIl) {
        this.setRotationAngles(llllllllllllIlIllIllllIlIIIllIlI, llllllllllllIlIllIllllIlIIIllIIl, llllllllllllIlIllIllllIlIIIllIII, llllllllllllIlIllIllllIlIIIIllll, llllllllllllIlIllIllllIlIIIIlllI, llllllllllllIlIllIllllIlIIIlIlIl, llllllllllllIlIllIllllIlIIIlIIll);
        this.villagerHead.render(llllllllllllIlIllIllllIlIIIlIlIl);
        this.villagerBody.render(llllllllllllIlIllIllllIlIIIlIlIl);
        this.rightVillagerLeg.render(llllllllllllIlIllIllllIlIIIlIlIl);
        this.leftVillagerLeg.render(llllllllllllIlIllIllllIlIIIlIlIl);
        this.villagerArms.render(llllllllllllIlIllIllllIlIIIlIlIl);
    }
    
    private static void lIlIIIlIIIllllll() {
        (lllIlIIlIllIIl = new int[17])[0] = (0xE7 ^ 0xA7);
        ModelVillager.lllIlIIlIllIIl[1] = ((0x95 ^ 0xBA) & ~(0x21 ^ 0xE));
        ModelVillager.lllIlIIlIllIIl[2] = (0xF4 ^ 0xB1 ^ (0xF8 ^ 0xB5));
        ModelVillager.lllIlIIlIllIIl[3] = (172 + 172 - 200 + 42 ^ 71 + 144 - 121 + 82);
        ModelVillager.lllIlIIlIllIIl[4] = (0x47 ^ 0x2F ^ (0xD6 ^ 0xA6));
        ModelVillager.lllIlIIlIllIIl[5] = "  ".length();
        ModelVillager.lllIlIIlIllIIl[6] = (0x1C ^ 0x18);
        ModelVillager.lllIlIIlIllIIl[7] = (93 + 164 - 171 + 96 ^ 59 + 149 - 115 + 73);
        ModelVillager.lllIlIIlIllIIl[8] = (15 + 74 + 10 + 58 ^ 50 + 126 - 68 + 29);
        ModelVillager.lllIlIIlIllIIl[9] = (0xB9 ^ 0xB5);
        ModelVillager.lllIlIIlIllIIl[10] = (0x5 ^ 0x58 ^ (0x15 ^ 0x4E));
        ModelVillager.lllIlIIlIllIIl[11] = (0x91 ^ 0xB7);
        ModelVillager.lllIlIIlIllIIl[12] = (26 + 24 + 19 + 62 ^ 13 + 30 + 49 + 53);
        ModelVillager.lllIlIIlIllIIl[13] = (0x64 ^ 0x48);
        ModelVillager.lllIlIIlIllIIl[14] = (111 + 46 - 99 + 75 ^ 35 + 71 + 11 + 30);
        ModelVillager.lllIlIIlIllIIl[15] = (0xA9 ^ 0x88 ^ (0x7A ^ 0x73));
        ModelVillager.lllIlIIlIllIIl[16] = " ".length();
    }
    
    static {
        lIlIIIlIIIllllll();
    }
    
    public ModelVillager(final float llllllllllllIlIllIllllIlIIllIlII) {
        this(llllllllllllIlIllIllllIlIIllIlII, 0.0f, ModelVillager.lllIlIIlIllIIl[0], ModelVillager.lllIlIIlIllIIl[0]);
    }
    
    @Override
    public void setRotationAngles(final float llllllllllllIlIllIllllIIlllllllI, final float llllllllllllIlIllIllllIIllllllIl, final float llllllllllllIlIllIllllIlIIIIIlII, final float llllllllllllIlIllIllllIlIIIIIIll, final float llllllllllllIlIllIllllIlIIIIIIlI, final float llllllllllllIlIllIllllIlIIIIIIIl, final Entity llllllllllllIlIllIllllIlIIIIIIII) {
        this.villagerHead.rotateAngleY = llllllllllllIlIllIllllIlIIIIIIll / 57.295776f;
        this.villagerHead.rotateAngleX = llllllllllllIlIllIllllIlIIIIIIlI / 57.295776f;
        this.villagerArms.rotationPointY = 3.0f;
        this.villagerArms.rotationPointZ = -1.0f;
        this.villagerArms.rotateAngleX = -0.75f;
        this.rightVillagerLeg.rotateAngleX = MathHelper.cos(llllllllllllIlIllIllllIIlllllllI * 0.6662f) * 1.4f * llllllllllllIlIllIllllIIllllllIl * 0.5f;
        this.leftVillagerLeg.rotateAngleX = MathHelper.cos(llllllllllllIlIllIllllIIlllllllI * 0.6662f + 3.1415927f) * 1.4f * llllllllllllIlIllIllllIIllllllIl * 0.5f;
        this.rightVillagerLeg.rotateAngleY = 0.0f;
        this.leftVillagerLeg.rotateAngleY = 0.0f;
    }
}
