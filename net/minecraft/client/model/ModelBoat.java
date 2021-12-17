// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.entity.Entity;

public class ModelBoat extends ModelBase
{
    private static final /* synthetic */ int[] llIIllIlIllIIl;
    public /* synthetic */ ModelRenderer[] boatSides;
    
    private static void lIIIlllIlllIllIl() {
        (llIIllIlIllIIl = new int[10])[0] = (0x25 ^ 0x74 ^ (0x6D ^ 0x39));
        ModelBoat.llIIllIlIllIIl[1] = ((38 + 50 - 14 + 70 ^ 50 + 19 + 91 + 14) & (0x18 ^ 0x41 ^ (0x17 ^ 0x70) ^ -" ".length()));
        ModelBoat.llIIllIlIllIIl[2] = (0x20 ^ 0x28);
        ModelBoat.llIIllIlIllIIl[3] = " ".length();
        ModelBoat.llIIllIlIllIIl[4] = "  ".length();
        ModelBoat.llIIllIlIllIIl[5] = "   ".length();
        ModelBoat.llIIllIlIllIIl[6] = (75 + 80 - 81 + 57 ^ 69 + 19 + 18 + 29);
        ModelBoat.llIIllIlIllIIl[7] = (((0xD6 ^ 0x85) & ~(0x1B ^ 0x48)) ^ (0xAE ^ 0xB6));
        ModelBoat.llIIllIlIllIIl[8] = (0x5A ^ 0x5C);
        ModelBoat.llIIllIlIllIIl[9] = (0x5 ^ 0x1F ^ (0x19 ^ 0x17));
    }
    
    public ModelBoat() {
        this.boatSides = new ModelRenderer[ModelBoat.llIIllIlIllIIl[0]];
        this.boatSides[ModelBoat.llIIllIlIllIIl[1]] = new ModelRenderer(this, ModelBoat.llIIllIlIllIIl[1], ModelBoat.llIIllIlIllIIl[2]);
        this.boatSides[ModelBoat.llIIllIlIllIIl[3]] = new ModelRenderer(this, ModelBoat.llIIllIlIllIIl[1], ModelBoat.llIIllIlIllIIl[1]);
        this.boatSides[ModelBoat.llIIllIlIllIIl[4]] = new ModelRenderer(this, ModelBoat.llIIllIlIllIIl[1], ModelBoat.llIIllIlIllIIl[1]);
        this.boatSides[ModelBoat.llIIllIlIllIIl[5]] = new ModelRenderer(this, ModelBoat.llIIllIlIllIIl[1], ModelBoat.llIIllIlIllIIl[1]);
        this.boatSides[ModelBoat.llIIllIlIllIIl[6]] = new ModelRenderer(this, ModelBoat.llIIllIlIllIIl[1], ModelBoat.llIIllIlIllIIl[1]);
        final int llllllllllllIlllIIIIIIIlIllllIII = ModelBoat.llIIllIlIllIIl[7];
        final int llllllllllllIlllIIIIIIIlIlllIlll = ModelBoat.llIIllIlIllIIl[8];
        final int llllllllllllIlllIIIIIIIlIlllIllI = ModelBoat.llIIllIlIllIIl[9];
        final int llllllllllllIlllIIIIIIIlIlllIlIl = ModelBoat.llIIllIlIllIIl[6];
        this.boatSides[ModelBoat.llIIllIlIllIIl[1]].addBox((float)(-llllllllllllIlllIIIIIIIlIllllIII / ModelBoat.llIIllIlIllIIl[4]), (float)(-llllllllllllIlllIIIIIIIlIlllIllI / ModelBoat.llIIllIlIllIIl[4] + ModelBoat.llIIllIlIllIIl[4]), -3.0f, llllllllllllIlllIIIIIIIlIllllIII, llllllllllllIlllIIIIIIIlIlllIllI - ModelBoat.llIIllIlIllIIl[6], ModelBoat.llIIllIlIllIIl[6], 0.0f);
        this.boatSides[ModelBoat.llIIllIlIllIIl[1]].setRotationPoint(0.0f, (float)llllllllllllIlllIIIIIIIlIlllIlIl, 0.0f);
        this.boatSides[ModelBoat.llIIllIlIllIIl[3]].addBox((float)(-llllllllllllIlllIIIIIIIlIllllIII / ModelBoat.llIIllIlIllIIl[4] + ModelBoat.llIIllIlIllIIl[4]), (float)(-llllllllllllIlllIIIIIIIlIlllIlll - ModelBoat.llIIllIlIllIIl[3]), -1.0f, llllllllllllIlllIIIIIIIlIllllIII - ModelBoat.llIIllIlIllIIl[6], llllllllllllIlllIIIIIIIlIlllIlll, ModelBoat.llIIllIlIllIIl[4], 0.0f);
        this.boatSides[ModelBoat.llIIllIlIllIIl[3]].setRotationPoint((float)(-llllllllllllIlllIIIIIIIlIllllIII / ModelBoat.llIIllIlIllIIl[4] + ModelBoat.llIIllIlIllIIl[3]), (float)llllllllllllIlllIIIIIIIlIlllIlIl, 0.0f);
        this.boatSides[ModelBoat.llIIllIlIllIIl[4]].addBox((float)(-llllllllllllIlllIIIIIIIlIllllIII / ModelBoat.llIIllIlIllIIl[4] + ModelBoat.llIIllIlIllIIl[4]), (float)(-llllllllllllIlllIIIIIIIlIlllIlll - ModelBoat.llIIllIlIllIIl[3]), -1.0f, llllllllllllIlllIIIIIIIlIllllIII - ModelBoat.llIIllIlIllIIl[6], llllllllllllIlllIIIIIIIlIlllIlll, ModelBoat.llIIllIlIllIIl[4], 0.0f);
        this.boatSides[ModelBoat.llIIllIlIllIIl[4]].setRotationPoint((float)(llllllllllllIlllIIIIIIIlIllllIII / ModelBoat.llIIllIlIllIIl[4] - ModelBoat.llIIllIlIllIIl[3]), (float)llllllllllllIlllIIIIIIIlIlllIlIl, 0.0f);
        this.boatSides[ModelBoat.llIIllIlIllIIl[5]].addBox((float)(-llllllllllllIlllIIIIIIIlIllllIII / ModelBoat.llIIllIlIllIIl[4] + ModelBoat.llIIllIlIllIIl[4]), (float)(-llllllllllllIlllIIIIIIIlIlllIlll - ModelBoat.llIIllIlIllIIl[3]), -1.0f, llllllllllllIlllIIIIIIIlIllllIII - ModelBoat.llIIllIlIllIIl[6], llllllllllllIlllIIIIIIIlIlllIlll, ModelBoat.llIIllIlIllIIl[4], 0.0f);
        this.boatSides[ModelBoat.llIIllIlIllIIl[5]].setRotationPoint(0.0f, (float)llllllllllllIlllIIIIIIIlIlllIlIl, (float)(-llllllllllllIlllIIIIIIIlIlllIllI / ModelBoat.llIIllIlIllIIl[4] + ModelBoat.llIIllIlIllIIl[3]));
        this.boatSides[ModelBoat.llIIllIlIllIIl[6]].addBox((float)(-llllllllllllIlllIIIIIIIlIllllIII / ModelBoat.llIIllIlIllIIl[4] + ModelBoat.llIIllIlIllIIl[4]), (float)(-llllllllllllIlllIIIIIIIlIlllIlll - ModelBoat.llIIllIlIllIIl[3]), -1.0f, llllllllllllIlllIIIIIIIlIllllIII - ModelBoat.llIIllIlIllIIl[6], llllllllllllIlllIIIIIIIlIlllIlll, ModelBoat.llIIllIlIllIIl[4], 0.0f);
        this.boatSides[ModelBoat.llIIllIlIllIIl[6]].setRotationPoint(0.0f, (float)llllllllllllIlllIIIIIIIlIlllIlIl, (float)(llllllllllllIlllIIIIIIIlIlllIllI / ModelBoat.llIIllIlIllIIl[4] - ModelBoat.llIIllIlIllIIl[3]));
        this.boatSides[ModelBoat.llIIllIlIllIIl[1]].rotateAngleX = 1.5707964f;
        this.boatSides[ModelBoat.llIIllIlIllIIl[3]].rotateAngleY = 4.712389f;
        this.boatSides[ModelBoat.llIIllIlIllIIl[4]].rotateAngleY = 1.5707964f;
        this.boatSides[ModelBoat.llIIllIlIllIIl[5]].rotateAngleY = 3.1415927f;
    }
    
    private static boolean lIIIlllIlllIlllI(final int llllllllllllIlllIIIIIIIlIlIllllI, final int llllllllllllIlllIIIIIIIlIlIlllIl) {
        return llllllllllllIlllIIIIIIIlIlIllllI >= llllllllllllIlllIIIIIIIlIlIlllIl;
    }
    
    @Override
    public void render(final Entity llllllllllllIlllIIIIIIIlIllIlIll, final float llllllllllllIlllIIIIIIIlIllIlIlI, final float llllllllllllIlllIIIIIIIlIllIlIIl, final float llllllllllllIlllIIIIIIIlIllIlIII, final float llllllllllllIlllIIIIIIIlIllIIlll, final float llllllllllllIlllIIIIIIIlIllIIllI, final float llllllllllllIlllIIIIIIIlIllIIIlI) {
        int llllllllllllIlllIIIIIIIlIllIIlII = ModelBoat.llIIllIlIllIIl[1];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIIlllIlllIlllI(llllllllllllIlllIIIIIIIlIllIIlII, ModelBoat.llIIllIlIllIIl[0])) {
            this.boatSides[llllllllllllIlllIIIIIIIlIllIIlII].render(llllllllllllIlllIIIIIIIlIllIIIlI);
            ++llllllllllllIlllIIIIIIIlIllIIlII;
        }
    }
    
    static {
        lIIIlllIlllIllIl();
    }
}
