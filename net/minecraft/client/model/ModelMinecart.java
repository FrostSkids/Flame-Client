// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.entity.Entity;

public class ModelMinecart extends ModelBase
{
    public /* synthetic */ ModelRenderer[] sideModels;
    private static final /* synthetic */ int[] lllIIlllllIIII;
    
    static {
        lIlIIIIlIIIIlIII();
    }
    
    private static void lIlIIIIlIIIIlIII() {
        (lllIIlllllIIII = new int[13])[0] = (140 + 85 - 161 + 118 ^ 51 + 68 - 63 + 121);
        ModelMinecart.lllIIlllllIIII[1] = ((0xA2 ^ 0x9A) & ~(0x78 ^ 0x40));
        ModelMinecart.lllIIlllllIIII[2] = (0x90 ^ 0x9A);
        ModelMinecart.lllIIlllllIIII[3] = " ".length();
        ModelMinecart.lllIIlllllIIII[4] = "  ".length();
        ModelMinecart.lllIIlllllIIII[5] = "   ".length();
        ModelMinecart.lllIIlllllIIII[6] = (0x4E ^ 0x4A);
        ModelMinecart.lllIIlllllIIII[7] = (129 + 115 - 168 + 122 ^ 139 + 81 - 33 + 8);
        ModelMinecart.lllIIlllllIIII[8] = (0x86 ^ 0xAA);
        ModelMinecart.lllIIlllllIIII[9] = (0xA1 ^ 0xB5);
        ModelMinecart.lllIIlllllIIII[10] = (0x55 ^ 0x34 ^ (0x36 ^ 0x5F));
        ModelMinecart.lllIIlllllIIII[11] = (0x64 ^ 0x4F ^ (0x7F ^ 0x44));
        ModelMinecart.lllIIlllllIIII[12] = (0x8D ^ 0x8B);
    }
    
    @Override
    public void render(final Entity llllllllllllIlIlllIlIlIIllIllIII, final float llllllllllllIlIlllIlIlIIllIlIlll, final float llllllllllllIlIlllIlIlIIllIlIllI, final float llllllllllllIlIlllIlIlIIllIlIlIl, final float llllllllllllIlIlllIlIlIIllIlIlII, final float llllllllllllIlIlllIlIlIIllIlIIll, final float llllllllllllIlIlllIlIlIIllIlIIlI) {
        this.sideModels[ModelMinecart.lllIIlllllIIII[7]].rotationPointY = 4.0f - llllllllllllIlIlllIlIlIIllIlIlIl;
        int llllllllllllIlIlllIlIlIIllIlIIIl = ModelMinecart.lllIIlllllIIII[1];
        "".length();
        if (((157 + 146 - 170 + 61 ^ 25 + 82 - 92 + 115) & (0x8D ^ 0x87 ^ (0xC ^ 0x46) ^ -" ".length())) < 0) {
            return;
        }
        while (!lIlIIIIlIIIIlIIl(llllllllllllIlIlllIlIlIIllIlIIIl, ModelMinecart.lllIIlllllIIII[12])) {
            this.sideModels[llllllllllllIlIlllIlIlIIllIlIIIl].render(llllllllllllIlIlllIlIlIIllIlIIlI);
            ++llllllllllllIlIlllIlIlIIllIlIIIl;
        }
    }
    
    private static boolean lIlIIIIlIIIIlIIl(final int llllllllllllIlIlllIlIlIIllIIlIlI, final int llllllllllllIlIlllIlIlIIllIIlIIl) {
        return llllllllllllIlIlllIlIlIIllIIlIlI >= llllllllllllIlIlllIlIlIIllIIlIIl;
    }
    
    public ModelMinecart() {
        this.sideModels = new ModelRenderer[ModelMinecart.lllIIlllllIIII[0]];
        this.sideModels[ModelMinecart.lllIIlllllIIII[1]] = new ModelRenderer(this, ModelMinecart.lllIIlllllIIII[1], ModelMinecart.lllIIlllllIIII[2]);
        this.sideModels[ModelMinecart.lllIIlllllIIII[3]] = new ModelRenderer(this, ModelMinecart.lllIIlllllIIII[1], ModelMinecart.lllIIlllllIIII[1]);
        this.sideModels[ModelMinecart.lllIIlllllIIII[4]] = new ModelRenderer(this, ModelMinecart.lllIIlllllIIII[1], ModelMinecart.lllIIlllllIIII[1]);
        this.sideModels[ModelMinecart.lllIIlllllIIII[5]] = new ModelRenderer(this, ModelMinecart.lllIIlllllIIII[1], ModelMinecart.lllIIlllllIIII[1]);
        this.sideModels[ModelMinecart.lllIIlllllIIII[6]] = new ModelRenderer(this, ModelMinecart.lllIIlllllIIII[1], ModelMinecart.lllIIlllllIIII[1]);
        this.sideModels[ModelMinecart.lllIIlllllIIII[7]] = new ModelRenderer(this, ModelMinecart.lllIIlllllIIII[8], ModelMinecart.lllIIlllllIIII[2]);
        final int llllllllllllIlIlllIlIlIIlllIIllI = ModelMinecart.lllIIlllllIIII[9];
        final int llllllllllllIlIlllIlIlIIlllIIlIl = ModelMinecart.lllIIlllllIIII[10];
        final int llllllllllllIlIlllIlIlIIlllIIlII = ModelMinecart.lllIIlllllIIII[11];
        final int llllllllllllIlIlllIlIlIIlllIIIll = ModelMinecart.lllIIlllllIIII[6];
        this.sideModels[ModelMinecart.lllIIlllllIIII[1]].addBox((float)(-llllllllllllIlIlllIlIlIIlllIIllI / ModelMinecart.lllIIlllllIIII[4]), (float)(-llllllllllllIlIlllIlIlIIlllIIlII / ModelMinecart.lllIIlllllIIII[4]), -1.0f, llllllllllllIlIlllIlIlIIlllIIllI, llllllllllllIlIlllIlIlIIlllIIlII, ModelMinecart.lllIIlllllIIII[4], 0.0f);
        this.sideModels[ModelMinecart.lllIIlllllIIII[1]].setRotationPoint(0.0f, (float)llllllllllllIlIlllIlIlIIlllIIIll, 0.0f);
        this.sideModels[ModelMinecart.lllIIlllllIIII[7]].addBox((float)(-llllllllllllIlIlllIlIlIIlllIIllI / ModelMinecart.lllIIlllllIIII[4] + ModelMinecart.lllIIlllllIIII[3]), (float)(-llllllllllllIlIlllIlIlIIlllIIlII / ModelMinecart.lllIIlllllIIII[4] + ModelMinecart.lllIIlllllIIII[3]), -1.0f, llllllllllllIlIlllIlIlIIlllIIllI - ModelMinecart.lllIIlllllIIII[4], llllllllllllIlIlllIlIlIIlllIIlII - ModelMinecart.lllIIlllllIIII[4], ModelMinecart.lllIIlllllIIII[3], 0.0f);
        this.sideModels[ModelMinecart.lllIIlllllIIII[7]].setRotationPoint(0.0f, (float)llllllllllllIlIlllIlIlIIlllIIIll, 0.0f);
        this.sideModels[ModelMinecart.lllIIlllllIIII[3]].addBox((float)(-llllllllllllIlIlllIlIlIIlllIIllI / ModelMinecart.lllIIlllllIIII[4] + ModelMinecart.lllIIlllllIIII[4]), (float)(-llllllllllllIlIlllIlIlIIlllIIlIl - ModelMinecart.lllIIlllllIIII[3]), -1.0f, llllllllllllIlIlllIlIlIIlllIIllI - ModelMinecart.lllIIlllllIIII[6], llllllllllllIlIlllIlIlIIlllIIlIl, ModelMinecart.lllIIlllllIIII[4], 0.0f);
        this.sideModels[ModelMinecart.lllIIlllllIIII[3]].setRotationPoint((float)(-llllllllllllIlIlllIlIlIIlllIIllI / ModelMinecart.lllIIlllllIIII[4] + ModelMinecart.lllIIlllllIIII[3]), (float)llllllllllllIlIlllIlIlIIlllIIIll, 0.0f);
        this.sideModels[ModelMinecart.lllIIlllllIIII[4]].addBox((float)(-llllllllllllIlIlllIlIlIIlllIIllI / ModelMinecart.lllIIlllllIIII[4] + ModelMinecart.lllIIlllllIIII[4]), (float)(-llllllllllllIlIlllIlIlIIlllIIlIl - ModelMinecart.lllIIlllllIIII[3]), -1.0f, llllllllllllIlIlllIlIlIIlllIIllI - ModelMinecart.lllIIlllllIIII[6], llllllllllllIlIlllIlIlIIlllIIlIl, ModelMinecart.lllIIlllllIIII[4], 0.0f);
        this.sideModels[ModelMinecart.lllIIlllllIIII[4]].setRotationPoint((float)(llllllllllllIlIlllIlIlIIlllIIllI / ModelMinecart.lllIIlllllIIII[4] - ModelMinecart.lllIIlllllIIII[3]), (float)llllllllllllIlIlllIlIlIIlllIIIll, 0.0f);
        this.sideModels[ModelMinecart.lllIIlllllIIII[5]].addBox((float)(-llllllllllllIlIlllIlIlIIlllIIllI / ModelMinecart.lllIIlllllIIII[4] + ModelMinecart.lllIIlllllIIII[4]), (float)(-llllllllllllIlIlllIlIlIIlllIIlIl - ModelMinecart.lllIIlllllIIII[3]), -1.0f, llllllllllllIlIlllIlIlIIlllIIllI - ModelMinecart.lllIIlllllIIII[6], llllllllllllIlIlllIlIlIIlllIIlIl, ModelMinecart.lllIIlllllIIII[4], 0.0f);
        this.sideModels[ModelMinecart.lllIIlllllIIII[5]].setRotationPoint(0.0f, (float)llllllllllllIlIlllIlIlIIlllIIIll, (float)(-llllllllllllIlIlllIlIlIIlllIIlII / ModelMinecart.lllIIlllllIIII[4] + ModelMinecart.lllIIlllllIIII[3]));
        this.sideModels[ModelMinecart.lllIIlllllIIII[6]].addBox((float)(-llllllllllllIlIlllIlIlIIlllIIllI / ModelMinecart.lllIIlllllIIII[4] + ModelMinecart.lllIIlllllIIII[4]), (float)(-llllllllllllIlIlllIlIlIIlllIIlIl - ModelMinecart.lllIIlllllIIII[3]), -1.0f, llllllllllllIlIlllIlIlIIlllIIllI - ModelMinecart.lllIIlllllIIII[6], llllllllllllIlIlllIlIlIIlllIIlIl, ModelMinecart.lllIIlllllIIII[4], 0.0f);
        this.sideModels[ModelMinecart.lllIIlllllIIII[6]].setRotationPoint(0.0f, (float)llllllllllllIlIlllIlIlIIlllIIIll, (float)(llllllllllllIlIlllIlIlIIlllIIlII / ModelMinecart.lllIIlllllIIII[4] - ModelMinecart.lllIIlllllIIII[3]));
        this.sideModels[ModelMinecart.lllIIlllllIIII[1]].rotateAngleX = 1.5707964f;
        this.sideModels[ModelMinecart.lllIIlllllIIII[3]].rotateAngleY = 4.712389f;
        this.sideModels[ModelMinecart.lllIIlllllIIII[4]].rotateAngleY = 1.5707964f;
        this.sideModels[ModelMinecart.lllIIlllllIIII[5]].rotateAngleY = 3.1415927f;
        this.sideModels[ModelMinecart.lllIIlllllIIII[7]].rotateAngleX = -1.5707964f;
    }
}
