// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

public class ModelChest extends ModelBase
{
    public /* synthetic */ ModelRenderer chestBelow;
    private static final /* synthetic */ int[] llllIIIIlllIl;
    public /* synthetic */ ModelRenderer chestLid;
    public /* synthetic */ ModelRenderer chestKnob;
    
    public void renderAll() {
        this.chestKnob.rotateAngleX = this.chestLid.rotateAngleX;
        this.chestLid.render(0.0625f);
        this.chestKnob.render(0.0625f);
        this.chestBelow.render(0.0625f);
    }
    
    private static void lIlIIlllIlIlIIl() {
        (llllIIIIlllIl = new int[9])[0] = ((0xDB ^ 0x93) & ~(0x22 ^ 0x6A));
        ModelChest.llllIIIIlllIl[1] = (0xD6 ^ 0x96);
        ModelChest.llllIIIIlllIl[2] = (0x7C ^ 0x72);
        ModelChest.llllIIIIlllIl[3] = (0x9F ^ 0x9A);
        ModelChest.llllIIIIlllIl[4] = "  ".length();
        ModelChest.llllIIIIlllIl[5] = (6 + 154 - 102 + 118 ^ 68 + 18 + 64 + 30);
        ModelChest.llllIIIIlllIl[6] = " ".length();
        ModelChest.llllIIIIlllIl[7] = (120 + 73 - 115 + 63 ^ 108 + 98 - 96 + 48);
        ModelChest.llllIIIIlllIl[8] = (0xCC ^ 0xC6);
    }
    
    public ModelChest() {
        this.chestLid = new ModelRenderer(this, ModelChest.llllIIIIlllIl[0], ModelChest.llllIIIIlllIl[0]).setTextureSize(ModelChest.llllIIIIlllIl[1], ModelChest.llllIIIIlllIl[1]);
        this.chestLid.addBox(0.0f, -5.0f, -14.0f, ModelChest.llllIIIIlllIl[2], ModelChest.llllIIIIlllIl[3], ModelChest.llllIIIIlllIl[2], 0.0f);
        this.chestLid.rotationPointX = 1.0f;
        this.chestLid.rotationPointY = 7.0f;
        this.chestLid.rotationPointZ = 15.0f;
        this.chestKnob = new ModelRenderer(this, ModelChest.llllIIIIlllIl[0], ModelChest.llllIIIIlllIl[0]).setTextureSize(ModelChest.llllIIIIlllIl[1], ModelChest.llllIIIIlllIl[1]);
        this.chestKnob.addBox(-1.0f, -2.0f, -15.0f, ModelChest.llllIIIIlllIl[4], ModelChest.llllIIIIlllIl[5], ModelChest.llllIIIIlllIl[6], 0.0f);
        this.chestKnob.rotationPointX = 8.0f;
        this.chestKnob.rotationPointY = 7.0f;
        this.chestKnob.rotationPointZ = 15.0f;
        this.chestBelow = new ModelRenderer(this, ModelChest.llllIIIIlllIl[0], ModelChest.llllIIIIlllIl[7]).setTextureSize(ModelChest.llllIIIIlllIl[1], ModelChest.llllIIIIlllIl[1]);
        this.chestBelow.addBox(0.0f, 0.0f, 0.0f, ModelChest.llllIIIIlllIl[2], ModelChest.llllIIIIlllIl[8], ModelChest.llllIIIIlllIl[2], 0.0f);
        this.chestBelow.rotationPointX = 1.0f;
        this.chestBelow.rotationPointY = 6.0f;
        this.chestBelow.rotationPointZ = 1.0f;
    }
    
    static {
        lIlIIlllIlIlIIl();
    }
}
