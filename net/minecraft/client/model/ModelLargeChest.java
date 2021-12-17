// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

public class ModelLargeChest extends ModelChest
{
    private static final /* synthetic */ int[] lllIllIIllIlII;
    
    static {
        lIlIIlIIlIIlIlIl();
    }
    
    public ModelLargeChest() {
        this.chestLid = new ModelRenderer(this, ModelLargeChest.lllIllIIllIlII[0], ModelLargeChest.lllIllIIllIlII[0]).setTextureSize(ModelLargeChest.lllIllIIllIlII[1], ModelLargeChest.lllIllIIllIlII[2]);
        this.chestLid.addBox(0.0f, -5.0f, -14.0f, ModelLargeChest.lllIllIIllIlII[3], ModelLargeChest.lllIllIIllIlII[4], ModelLargeChest.lllIllIIllIlII[5], 0.0f);
        this.chestLid.rotationPointX = 1.0f;
        this.chestLid.rotationPointY = 7.0f;
        this.chestLid.rotationPointZ = 15.0f;
        this.chestKnob = new ModelRenderer(this, ModelLargeChest.lllIllIIllIlII[0], ModelLargeChest.lllIllIIllIlII[0]).setTextureSize(ModelLargeChest.lllIllIIllIlII[1], ModelLargeChest.lllIllIIllIlII[2]);
        this.chestKnob.addBox(-1.0f, -2.0f, -15.0f, ModelLargeChest.lllIllIIllIlII[6], ModelLargeChest.lllIllIIllIlII[7], ModelLargeChest.lllIllIIllIlII[8], 0.0f);
        this.chestKnob.rotationPointX = 16.0f;
        this.chestKnob.rotationPointY = 7.0f;
        this.chestKnob.rotationPointZ = 15.0f;
        this.chestBelow = new ModelRenderer(this, ModelLargeChest.lllIllIIllIlII[0], ModelLargeChest.lllIllIIllIlII[9]).setTextureSize(ModelLargeChest.lllIllIIllIlII[1], ModelLargeChest.lllIllIIllIlII[2]);
        this.chestBelow.addBox(0.0f, 0.0f, 0.0f, ModelLargeChest.lllIllIIllIlII[3], ModelLargeChest.lllIllIIllIlII[10], ModelLargeChest.lllIllIIllIlII[5], 0.0f);
        this.chestBelow.rotationPointX = 1.0f;
        this.chestBelow.rotationPointY = 6.0f;
        this.chestBelow.rotationPointZ = 1.0f;
    }
    
    private static void lIlIIlIIlIIlIlIl() {
        (lllIllIIllIlII = new int[11])[0] = ((0x56 ^ 0x17) & ~(0xF4 ^ 0xB5));
        ModelLargeChest.lllIllIIllIlII[1] = 68 + 16 + 17 + 27;
        ModelLargeChest.lllIllIIllIlII[2] = (0x77 ^ 0x37);
        ModelLargeChest.lllIllIIllIlII[3] = (9 + 101 - 26 + 47 ^ 15 + 37 + 13 + 92);
        ModelLargeChest.lllIllIIllIlII[4] = (0xB8 ^ 0xAD ^ (0xD6 ^ 0xC6));
        ModelLargeChest.lllIllIIllIlII[5] = (0x63 ^ 0x6D);
        ModelLargeChest.lllIllIIllIlII[6] = "  ".length();
        ModelLargeChest.lllIllIIllIlII[7] = (2 + 93 - 55 + 97 ^ 85 + 69 - 57 + 44);
        ModelLargeChest.lllIllIIllIlII[8] = " ".length();
        ModelLargeChest.lllIllIIllIlII[9] = (0xA6 ^ 0xB5);
        ModelLargeChest.lllIllIIllIlII[10] = (0x80 ^ 0x8A);
    }
}
