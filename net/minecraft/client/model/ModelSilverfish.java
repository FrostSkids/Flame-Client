// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;

public class ModelSilverfish extends ModelBase
{
    private static final /* synthetic */ int[][] silverfishTexturePositions;
    private /* synthetic */ float[] field_78170_c;
    private /* synthetic */ ModelRenderer[] silverfishBodyParts;
    private static final /* synthetic */ int[][] silverfishBoxLength;
    private /* synthetic */ ModelRenderer[] silverfishWings;
    private static final /* synthetic */ int[] llIlllIllIlIII;
    
    @Override
    public void setRotationAngles(final float llllllllllllIllIIlIIIIllllllIlII, final float llllllllllllIllIIlIIIIllllllIIll, final float llllllllllllIllIIlIIIIllllllIIlI, final float llllllllllllIllIIlIIIIllllllIIIl, final float llllllllllllIllIIlIIIIllllllIIII, final float llllllllllllIllIIlIIIIlllllIllll, final Entity llllllllllllIllIIlIIIIlllllIlllI) {
        int llllllllllllIllIIlIIIIlllllIllIl = ModelSilverfish.llIlllIllIlIII[1];
        "".length();
        if (((0x76 ^ 0x72 ^ (0x54 ^ 0x7)) & (0x7A ^ 0xB ^ (0xE1 ^ 0xC7) ^ -" ".length())) != 0x0) {
            return;
        }
        while (!lIIllIlIIIIlIIll(llllllllllllIllIIlIIIIlllllIllIl, this.silverfishBodyParts.length)) {
            this.silverfishBodyParts[llllllllllllIllIIlIIIIlllllIllIl].rotateAngleY = MathHelper.cos(llllllllllllIllIIlIIIIllllllIIlI * 0.9f + llllllllllllIllIIlIIIIlllllIllIl * 0.15f * 3.1415927f) * 3.1415927f * 0.05f * (ModelSilverfish.llIlllIllIlIII[3] + Math.abs(llllllllllllIllIIlIIIIlllllIllIl - ModelSilverfish.llIlllIllIlIII[4]));
            this.silverfishBodyParts[llllllllllllIllIIlIIIIlllllIllIl].rotationPointX = MathHelper.sin(llllllllllllIllIIlIIIIllllllIIlI * 0.9f + llllllllllllIllIIlIIIIlllllIllIl * 0.15f * 3.1415927f) * 3.1415927f * 0.2f * Math.abs(llllllllllllIllIIlIIIIlllllIllIl - ModelSilverfish.llIlllIllIlIII[4]);
            ++llllllllllllIllIIlIIIIlllllIllIl;
        }
        this.silverfishWings[ModelSilverfish.llIlllIllIlIII[1]].rotateAngleY = this.silverfishBodyParts[ModelSilverfish.llIlllIllIlIII[4]].rotateAngleY;
        this.silverfishWings[ModelSilverfish.llIlllIllIlIII[3]].rotateAngleY = this.silverfishBodyParts[ModelSilverfish.llIlllIllIlIII[5]].rotateAngleY;
        this.silverfishWings[ModelSilverfish.llIlllIllIlIII[3]].rotationPointX = this.silverfishBodyParts[ModelSilverfish.llIlllIllIlIII[5]].rotationPointX;
        this.silverfishWings[ModelSilverfish.llIlllIllIlIII[4]].rotateAngleY = this.silverfishBodyParts[ModelSilverfish.llIlllIllIlIII[3]].rotateAngleY;
        this.silverfishWings[ModelSilverfish.llIlllIllIlIII[4]].rotationPointX = this.silverfishBodyParts[ModelSilverfish.llIlllIllIlIII[3]].rotationPointX;
    }
    
    static {
        lIIllIlIIIIlIIIl();
        final int[][] silverfishBoxLength2 = new int[ModelSilverfish.llIlllIllIlIII[0]][];
        final int n = ModelSilverfish.llIlllIllIlIII[1];
        final int[] array = new int[ModelSilverfish.llIlllIllIlIII[2]];
        array[ModelSilverfish.llIlllIllIlIII[1]] = ModelSilverfish.llIlllIllIlIII[2];
        array[ModelSilverfish.llIlllIllIlIII[3]] = ModelSilverfish.llIlllIllIlIII[4];
        array[ModelSilverfish.llIlllIllIlIII[4]] = ModelSilverfish.llIlllIllIlIII[4];
        silverfishBoxLength2[n] = array;
        final int n2 = ModelSilverfish.llIlllIllIlIII[3];
        final int[] array2 = new int[ModelSilverfish.llIlllIllIlIII[2]];
        array2[ModelSilverfish.llIlllIllIlIII[1]] = ModelSilverfish.llIlllIllIlIII[5];
        array2[ModelSilverfish.llIlllIllIlIII[3]] = ModelSilverfish.llIlllIllIlIII[2];
        array2[ModelSilverfish.llIlllIllIlIII[4]] = ModelSilverfish.llIlllIllIlIII[4];
        silverfishBoxLength2[n2] = array2;
        final int n3 = ModelSilverfish.llIlllIllIlIII[4];
        final int[] array3 = new int[ModelSilverfish.llIlllIllIlIII[2]];
        array3[ModelSilverfish.llIlllIllIlIII[1]] = ModelSilverfish.llIlllIllIlIII[6];
        array3[ModelSilverfish.llIlllIllIlIII[3]] = ModelSilverfish.llIlllIllIlIII[5];
        array3[ModelSilverfish.llIlllIllIlIII[4]] = ModelSilverfish.llIlllIllIlIII[2];
        silverfishBoxLength2[n3] = array3;
        final int n4 = ModelSilverfish.llIlllIllIlIII[2];
        final int[] array4 = new int[ModelSilverfish.llIlllIllIlIII[2]];
        array4[ModelSilverfish.llIlllIllIlIII[1]] = ModelSilverfish.llIlllIllIlIII[2];
        array4[ModelSilverfish.llIlllIllIlIII[3]] = ModelSilverfish.llIlllIllIlIII[2];
        array4[ModelSilverfish.llIlllIllIlIII[4]] = ModelSilverfish.llIlllIllIlIII[2];
        silverfishBoxLength2[n4] = array4;
        final int n5 = ModelSilverfish.llIlllIllIlIII[5];
        final int[] array5 = new int[ModelSilverfish.llIlllIllIlIII[2]];
        array5[ModelSilverfish.llIlllIllIlIII[1]] = ModelSilverfish.llIlllIllIlIII[4];
        array5[ModelSilverfish.llIlllIllIlIII[3]] = ModelSilverfish.llIlllIllIlIII[4];
        array5[ModelSilverfish.llIlllIllIlIII[4]] = ModelSilverfish.llIlllIllIlIII[2];
        silverfishBoxLength2[n5] = array5;
        final int n6 = ModelSilverfish.llIlllIllIlIII[7];
        final int[] array6 = new int[ModelSilverfish.llIlllIllIlIII[2]];
        array6[ModelSilverfish.llIlllIllIlIII[1]] = ModelSilverfish.llIlllIllIlIII[4];
        array6[ModelSilverfish.llIlllIllIlIII[3]] = ModelSilverfish.llIlllIllIlIII[3];
        array6[ModelSilverfish.llIlllIllIlIII[4]] = ModelSilverfish.llIlllIllIlIII[4];
        silverfishBoxLength2[n6] = array6;
        final int n7 = ModelSilverfish.llIlllIllIlIII[6];
        final int[] array7 = new int[ModelSilverfish.llIlllIllIlIII[2]];
        array7[ModelSilverfish.llIlllIllIlIII[1]] = ModelSilverfish.llIlllIllIlIII[3];
        array7[ModelSilverfish.llIlllIllIlIII[3]] = ModelSilverfish.llIlllIllIlIII[3];
        array7[ModelSilverfish.llIlllIllIlIII[4]] = ModelSilverfish.llIlllIllIlIII[4];
        silverfishBoxLength2[n7] = array7;
        silverfishBoxLength = silverfishBoxLength2;
        final int[][] silverfishTexturePositions2 = new int[ModelSilverfish.llIlllIllIlIII[0]][];
        silverfishTexturePositions2[ModelSilverfish.llIlllIllIlIII[1]] = new int[ModelSilverfish.llIlllIllIlIII[4]];
        final int n8 = ModelSilverfish.llIlllIllIlIII[3];
        final int[] array8 = new int[ModelSilverfish.llIlllIllIlIII[4]];
        array8[ModelSilverfish.llIlllIllIlIII[3]] = ModelSilverfish.llIlllIllIlIII[5];
        silverfishTexturePositions2[n8] = array8;
        final int n9 = ModelSilverfish.llIlllIllIlIII[4];
        final int[] array9 = new int[ModelSilverfish.llIlllIllIlIII[4]];
        array9[ModelSilverfish.llIlllIllIlIII[3]] = ModelSilverfish.llIlllIllIlIII[8];
        silverfishTexturePositions2[n9] = array9;
        final int n10 = ModelSilverfish.llIlllIllIlIII[2];
        final int[] array10 = new int[ModelSilverfish.llIlllIllIlIII[4]];
        array10[ModelSilverfish.llIlllIllIlIII[3]] = ModelSilverfish.llIlllIllIlIII[9];
        silverfishTexturePositions2[n10] = array10;
        final int n11 = ModelSilverfish.llIlllIllIlIII[5];
        final int[] array11 = new int[ModelSilverfish.llIlllIllIlIII[4]];
        array11[ModelSilverfish.llIlllIllIlIII[3]] = ModelSilverfish.llIlllIllIlIII[10];
        silverfishTexturePositions2[n11] = array11;
        final int n12 = ModelSilverfish.llIlllIllIlIII[7];
        final int[] array12 = new int[ModelSilverfish.llIlllIllIlIII[4]];
        array12[ModelSilverfish.llIlllIllIlIII[1]] = ModelSilverfish.llIlllIllIlIII[11];
        silverfishTexturePositions2[n12] = array12;
        final int n13 = ModelSilverfish.llIlllIllIlIII[6];
        final int[] array13 = new int[ModelSilverfish.llIlllIllIlIII[4]];
        array13[ModelSilverfish.llIlllIllIlIII[1]] = ModelSilverfish.llIlllIllIlIII[12];
        array13[ModelSilverfish.llIlllIllIlIII[3]] = ModelSilverfish.llIlllIllIlIII[5];
        silverfishTexturePositions2[n13] = array13;
        silverfishTexturePositions = silverfishTexturePositions2;
    }
    
    private static void lIIllIlIIIIlIIIl() {
        (llIlllIllIlIII = new int[18])[0] = (0xE9 ^ 0xBE ^ (0xFF ^ 0xAF));
        ModelSilverfish.llIlllIllIlIII[1] = ((0x24 ^ 0x62 ^ (0x8E ^ 0xAB)) & (205 + 152 - 349 + 225 ^ 115 + 124 - 148 + 47 ^ -" ".length()));
        ModelSilverfish.llIlllIllIlIII[2] = "   ".length();
        ModelSilverfish.llIlllIllIlIII[3] = " ".length();
        ModelSilverfish.llIlllIllIlIII[4] = "  ".length();
        ModelSilverfish.llIlllIllIlIII[5] = (" ".length() ^ (0x4 ^ 0x1));
        ModelSilverfish.llIlllIllIlIII[6] = (0x82 ^ 0x84);
        ModelSilverfish.llIlllIllIlIII[7] = (0x6C ^ 0x61 ^ (0x22 ^ 0x2A));
        ModelSilverfish.llIlllIllIlIII[8] = (0x40 ^ 0x49);
        ModelSilverfish.llIlllIllIlIII[9] = (0x42 ^ 0x52);
        ModelSilverfish.llIlllIllIlIII[10] = (0xA7 ^ 0xB1);
        ModelSilverfish.llIlllIllIlIII[11] = (0x17 ^ 0x3 ^ (0x85 ^ 0x9A));
        ModelSilverfish.llIlllIllIlIII[12] = (0x24 ^ 0x5 ^ (0x9 ^ 0x25));
        ModelSilverfish.llIlllIllIlIII[13] = (0xA2 ^ 0xBA);
        ModelSilverfish.llIlllIllIlIII[14] = (0xBE ^ 0xAA);
        ModelSilverfish.llIlllIllIlIII[15] = (0x71 ^ 0x56 ^ (0x1A ^ 0x37));
        ModelSilverfish.llIlllIllIlIII[16] = (0xAC ^ 0xA4);
        ModelSilverfish.llIlllIllIlIII[17] = (0xA1 ^ 0xB3);
    }
    
    public ModelSilverfish() {
        this.silverfishBodyParts = new ModelRenderer[ModelSilverfish.llIlllIllIlIII[0]];
        this.field_78170_c = new float[ModelSilverfish.llIlllIllIlIII[0]];
        float llllllllllllIllIIlIIIlIIIIIllIIl = -3.5f;
        int llllllllllllIllIIlIIIlIIIIIllIII = ModelSilverfish.llIlllIllIlIII[1];
        "".length();
        if (-(0x69 ^ 0x6D) > 0) {
            throw null;
        }
        while (!lIIllIlIIIIlIIll(llllllllllllIllIIlIIIlIIIIIllIII, this.silverfishBodyParts.length)) {
            (this.silverfishBodyParts[llllllllllllIllIIlIIIlIIIIIllIII] = new ModelRenderer(this, ModelSilverfish.silverfishTexturePositions[llllllllllllIllIIlIIIlIIIIIllIII][ModelSilverfish.llIlllIllIlIII[1]], ModelSilverfish.silverfishTexturePositions[llllllllllllIllIIlIIIlIIIIIllIII][ModelSilverfish.llIlllIllIlIII[3]])).addBox(ModelSilverfish.silverfishBoxLength[llllllllllllIllIIlIIIlIIIIIllIII][ModelSilverfish.llIlllIllIlIII[1]] * -0.5f, 0.0f, ModelSilverfish.silverfishBoxLength[llllllllllllIllIIlIIIlIIIIIllIII][ModelSilverfish.llIlllIllIlIII[4]] * -0.5f, ModelSilverfish.silverfishBoxLength[llllllllllllIllIIlIIIlIIIIIllIII][ModelSilverfish.llIlllIllIlIII[1]], ModelSilverfish.silverfishBoxLength[llllllllllllIllIIlIIIlIIIIIllIII][ModelSilverfish.llIlllIllIlIII[3]], ModelSilverfish.silverfishBoxLength[llllllllllllIllIIlIIIlIIIIIllIII][ModelSilverfish.llIlllIllIlIII[4]]);
            "".length();
            this.silverfishBodyParts[llllllllllllIllIIlIIIlIIIIIllIII].setRotationPoint(0.0f, (float)(ModelSilverfish.llIlllIllIlIII[13] - ModelSilverfish.silverfishBoxLength[llllllllllllIllIIlIIIlIIIIIllIII][ModelSilverfish.llIlllIllIlIII[3]]), llllllllllllIllIIlIIIlIIIIIllIIl);
            this.field_78170_c[llllllllllllIllIIlIIIlIIIIIllIII] = llllllllllllIllIIlIIIlIIIIIllIIl;
            if (lIIllIlIIIIlIIlI(llllllllllllIllIIlIIIlIIIIIllIII, this.silverfishBodyParts.length - ModelSilverfish.llIlllIllIlIII[3])) {
                llllllllllllIllIIlIIIlIIIIIllIIl += (ModelSilverfish.silverfishBoxLength[llllllllllllIllIIlIIIlIIIIIllIII][ModelSilverfish.llIlllIllIlIII[4]] + ModelSilverfish.silverfishBoxLength[llllllllllllIllIIlIIIlIIIIIllIII + ModelSilverfish.llIlllIllIlIII[3]][ModelSilverfish.llIlllIllIlIII[4]]) * 0.5f;
            }
            ++llllllllllllIllIIlIIIlIIIIIllIII;
        }
        this.silverfishWings = new ModelRenderer[ModelSilverfish.llIlllIllIlIII[2]];
        (this.silverfishWings[ModelSilverfish.llIlllIllIlIII[1]] = new ModelRenderer(this, ModelSilverfish.llIlllIllIlIII[14], ModelSilverfish.llIlllIllIlIII[1])).addBox(-5.0f, 0.0f, ModelSilverfish.silverfishBoxLength[ModelSilverfish.llIlllIllIlIII[4]][ModelSilverfish.llIlllIllIlIII[4]] * -0.5f, ModelSilverfish.llIlllIllIlIII[15], ModelSilverfish.llIlllIllIlIII[16], ModelSilverfish.silverfishBoxLength[ModelSilverfish.llIlllIllIlIII[4]][ModelSilverfish.llIlllIllIlIII[4]]);
        "".length();
        this.silverfishWings[ModelSilverfish.llIlllIllIlIII[1]].setRotationPoint(0.0f, 16.0f, this.field_78170_c[ModelSilverfish.llIlllIllIlIII[4]]);
        (this.silverfishWings[ModelSilverfish.llIlllIllIlIII[3]] = new ModelRenderer(this, ModelSilverfish.llIlllIllIlIII[14], ModelSilverfish.llIlllIllIlIII[11])).addBox(-3.0f, 0.0f, ModelSilverfish.silverfishBoxLength[ModelSilverfish.llIlllIllIlIII[5]][ModelSilverfish.llIlllIllIlIII[4]] * -0.5f, ModelSilverfish.llIlllIllIlIII[6], ModelSilverfish.llIlllIllIlIII[5], ModelSilverfish.silverfishBoxLength[ModelSilverfish.llIlllIllIlIII[5]][ModelSilverfish.llIlllIllIlIII[4]]);
        "".length();
        this.silverfishWings[ModelSilverfish.llIlllIllIlIII[3]].setRotationPoint(0.0f, 20.0f, this.field_78170_c[ModelSilverfish.llIlllIllIlIII[5]]);
        (this.silverfishWings[ModelSilverfish.llIlllIllIlIII[4]] = new ModelRenderer(this, ModelSilverfish.llIlllIllIlIII[14], ModelSilverfish.llIlllIllIlIII[17])).addBox(-3.0f, 0.0f, ModelSilverfish.silverfishBoxLength[ModelSilverfish.llIlllIllIlIII[5]][ModelSilverfish.llIlllIllIlIII[4]] * -0.5f, ModelSilverfish.llIlllIllIlIII[6], ModelSilverfish.llIlllIllIlIII[7], ModelSilverfish.silverfishBoxLength[ModelSilverfish.llIlllIllIlIII[3]][ModelSilverfish.llIlllIllIlIII[4]]);
        "".length();
        this.silverfishWings[ModelSilverfish.llIlllIllIlIII[4]].setRotationPoint(0.0f, 19.0f, this.field_78170_c[ModelSilverfish.llIlllIllIlIII[3]]);
    }
    
    @Override
    public void render(final Entity llllllllllllIllIIlIIIlIIIIIIIIII, final float llllllllllllIllIIlIIIIllllllllll, final float llllllllllllIllIIlIIIlIIIIIIlIII, final float llllllllllllIllIIlIIIIllllllllIl, final float llllllllllllIllIIlIIIIllllllllII, final float llllllllllllIllIIlIIIIlllllllIll, final float llllllllllllIllIIlIIIlIIIIIIIlII) {
        this.setRotationAngles(llllllllllllIllIIlIIIIllllllllll, llllllllllllIllIIlIIIlIIIIIIlIII, llllllllllllIllIIlIIIIllllllllIl, llllllllllllIllIIlIIIIllllllllII, llllllllllllIllIIlIIIIlllllllIll, llllllllllllIllIIlIIIlIIIIIIIlII, llllllllllllIllIIlIIIlIIIIIIIIII);
        int llllllllllllIllIIlIIIlIIIIIIIIll = ModelSilverfish.llIlllIllIlIII[1];
        "".length();
        if (-" ".length() > 0) {
            return;
        }
        while (!lIIllIlIIIIlIIll(llllllllllllIllIIlIIIlIIIIIIIIll, this.silverfishBodyParts.length)) {
            this.silverfishBodyParts[llllllllllllIllIIlIIIlIIIIIIIIll].render(llllllllllllIllIIlIIIlIIIIIIIlII);
            ++llllllllllllIllIIlIIIlIIIIIIIIll;
        }
        int llllllllllllIllIIlIIIlIIIIIIIIlI = ModelSilverfish.llIlllIllIlIII[1];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIllIlIIIIlIIll(llllllllllllIllIIlIIIlIIIIIIIIlI, this.silverfishWings.length)) {
            this.silverfishWings[llllllllllllIllIIlIIIlIIIIIIIIlI].render(llllllllllllIllIIlIIIlIIIIIIIlII);
            ++llllllllllllIllIIlIIIlIIIIIIIIlI;
        }
    }
    
    private static boolean lIIllIlIIIIlIIlI(final int llllllllllllIllIIlIIIIlllllIIIll, final int llllllllllllIllIIlIIIIlllllIIIlI) {
        return llllllllllllIllIIlIIIIlllllIIIll < llllllllllllIllIIlIIIIlllllIIIlI;
    }
    
    private static boolean lIIllIlIIIIlIIll(final int llllllllllllIllIIlIIIIlllllIIlll, final int llllllllllllIllIIlIIIIlllllIIllI) {
        return llllllllllllIllIIlIIIIlllllIIlll >= llllllllllllIllIIlIIIIlllllIIllI;
    }
}
