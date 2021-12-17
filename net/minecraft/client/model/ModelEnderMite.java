// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;

public class ModelEnderMite extends ModelBase
{
    private static final /* synthetic */ int[] lllIlIllIllIlI;
    private static final /* synthetic */ int[][] field_178716_a;
    private static final /* synthetic */ int[][] field_178714_b;
    private static final /* synthetic */ int field_178715_c;
    private final /* synthetic */ ModelRenderer[] field_178713_d;
    
    @Override
    public void setRotationAngles(final float llllllllllllIlIllIlIIlllllIIIIIl, final float llllllllllllIlIllIlIIlllllIIIIII, final float llllllllllllIlIllIlIIllllIllllll, final float llllllllllllIlIllIlIIllllIlllllI, final float llllllllllllIlIllIlIIllllIllllIl, final float llllllllllllIlIllIlIIllllIllllII, final Entity llllllllllllIlIllIlIIllllIlllIll) {
        int llllllllllllIlIllIlIIllllIlllIlI = ModelEnderMite.lllIlIllIllIlI[1];
        "".length();
        if (-(90 + 91 - 35 + 34 ^ 93 + 58 + 9 + 16) > 0) {
            return;
        }
        while (!lIlIIIllIllIIIII(llllllllllllIlIllIlIIllllIlllIlI, this.field_178713_d.length)) {
            this.field_178713_d[llllllllllllIlIllIlIIllllIlllIlI].rotateAngleY = MathHelper.cos(llllllllllllIlIllIlIIllllIllllll * 0.9f + llllllllllllIlIllIlIIllllIlllIlI * 0.15f * 3.1415927f) * 3.1415927f * 0.01f * (ModelEnderMite.lllIlIllIllIlI[3] + Math.abs(llllllllllllIlIllIlIIllllIlllIlI - ModelEnderMite.lllIlIllIllIlI[4]));
            this.field_178713_d[llllllllllllIlIllIlIIllllIlllIlI].rotationPointX = MathHelper.sin(llllllllllllIlIllIlIIllllIllllll * 0.9f + llllllllllllIlIllIlIIllllIlllIlI * 0.15f * 3.1415927f) * 3.1415927f * 0.1f * Math.abs(llllllllllllIlIllIlIIllllIlllIlI - ModelEnderMite.lllIlIllIllIlI[4]);
            ++llllllllllllIlIllIlIIllllIlllIlI;
        }
    }
    
    static {
        lIlIIIllIlIllllI();
        final int[][] field_178716_a2 = new int[ModelEnderMite.lllIlIllIllIlI[0]][];
        final int n = ModelEnderMite.lllIlIllIllIlI[1];
        final int[] array = new int[ModelEnderMite.lllIlIllIllIlI[2]];
        array[ModelEnderMite.lllIlIllIllIlI[1]] = ModelEnderMite.lllIlIllIllIlI[0];
        array[ModelEnderMite.lllIlIllIllIlI[3]] = ModelEnderMite.lllIlIllIllIlI[2];
        array[ModelEnderMite.lllIlIllIllIlI[4]] = ModelEnderMite.lllIlIllIllIlI[4];
        field_178716_a2[n] = array;
        final int n2 = ModelEnderMite.lllIlIllIllIlI[3];
        final int[] array2 = new int[ModelEnderMite.lllIlIllIllIlI[2]];
        array2[ModelEnderMite.lllIlIllIllIlI[1]] = ModelEnderMite.lllIlIllIllIlI[5];
        array2[ModelEnderMite.lllIlIllIllIlI[3]] = ModelEnderMite.lllIlIllIllIlI[0];
        array2[ModelEnderMite.lllIlIllIllIlI[4]] = ModelEnderMite.lllIlIllIllIlI[6];
        field_178716_a2[n2] = array2;
        final int n3 = ModelEnderMite.lllIlIllIllIlI[4];
        final int[] array3 = new int[ModelEnderMite.lllIlIllIllIlI[2]];
        array3[ModelEnderMite.lllIlIllIllIlI[1]] = ModelEnderMite.lllIlIllIllIlI[2];
        array3[ModelEnderMite.lllIlIllIllIlI[3]] = ModelEnderMite.lllIlIllIllIlI[2];
        array3[ModelEnderMite.lllIlIllIllIlI[4]] = ModelEnderMite.lllIlIllIllIlI[3];
        field_178716_a2[n3] = array3;
        final int n4 = ModelEnderMite.lllIlIllIllIlI[2];
        final int[] array4 = new int[ModelEnderMite.lllIlIllIllIlI[2]];
        array4[ModelEnderMite.lllIlIllIllIlI[1]] = ModelEnderMite.lllIlIllIllIlI[3];
        array4[ModelEnderMite.lllIlIllIllIlI[3]] = ModelEnderMite.lllIlIllIllIlI[4];
        array4[ModelEnderMite.lllIlIllIllIlI[4]] = ModelEnderMite.lllIlIllIllIlI[3];
        field_178716_a2[n4] = array4;
        field_178716_a = field_178716_a2;
        final int[][] field_178714_b2 = new int[ModelEnderMite.lllIlIllIllIlI[0]][];
        field_178714_b2[ModelEnderMite.lllIlIllIllIlI[1]] = new int[ModelEnderMite.lllIlIllIllIlI[4]];
        final int n5 = ModelEnderMite.lllIlIllIllIlI[3];
        final int[] array5 = new int[ModelEnderMite.lllIlIllIllIlI[4]];
        array5[ModelEnderMite.lllIlIllIllIlI[3]] = ModelEnderMite.lllIlIllIllIlI[6];
        field_178714_b2[n5] = array5;
        final int n6 = ModelEnderMite.lllIlIllIllIlI[4];
        final int[] array6 = new int[ModelEnderMite.lllIlIllIllIlI[4]];
        array6[ModelEnderMite.lllIlIllIllIlI[3]] = ModelEnderMite.lllIlIllIllIlI[7];
        field_178714_b2[n6] = array6;
        final int n7 = ModelEnderMite.lllIlIllIllIlI[2];
        final int[] array7 = new int[ModelEnderMite.lllIlIllIllIlI[4]];
        array7[ModelEnderMite.lllIlIllIllIlI[3]] = ModelEnderMite.lllIlIllIllIlI[8];
        field_178714_b2[n7] = array7;
        field_178714_b = field_178714_b2;
        field_178715_c = ModelEnderMite.field_178716_a.length;
    }
    
    private static boolean lIlIIIllIlIlllll(final int llllllllllllIlIllIlIIllllIllIIII, final int llllllllllllIlIllIlIIllllIlIllll) {
        return llllllllllllIlIllIlIIllllIllIIII < llllllllllllIlIllIlIIllllIlIllll;
    }
    
    private static boolean lIlIIIllIllIIIII(final int llllllllllllIlIllIlIIllllIllIlII, final int llllllllllllIlIllIlIIllllIllIIll) {
        return llllllllllllIlIllIlIIllllIllIlII >= llllllllllllIlIllIlIIllllIllIIll;
    }
    
    @Override
    public void render(final Entity llllllllllllIlIllIlIIlllllIlIllI, final float llllllllllllIlIllIlIIlllllIlIlIl, final float llllllllllllIlIllIlIIlllllIlIlII, final float llllllllllllIlIllIlIIlllllIIlIlI, final float llllllllllllIlIllIlIIlllllIlIIlI, final float llllllllllllIlIllIlIIlllllIIlIII, final float llllllllllllIlIllIlIIlllllIlIIII) {
        this.setRotationAngles(llllllllllllIlIllIlIIlllllIlIlIl, llllllllllllIlIllIlIIlllllIlIlII, llllllllllllIlIllIlIIlllllIIlIlI, llllllllllllIlIllIlIIlllllIlIIlI, llllllllllllIlIllIlIIlllllIIlIII, llllllllllllIlIllIlIIlllllIlIIII, llllllllllllIlIllIlIIlllllIlIllI);
        int llllllllllllIlIllIlIIlllllIIllll = ModelEnderMite.lllIlIllIllIlI[1];
        "".length();
        if ((172 + 9 - 75 + 79 ^ 77 + 9 - 21 + 124) <= "  ".length()) {
            return;
        }
        while (!lIlIIIllIllIIIII(llllllllllllIlIllIlIIlllllIIllll, this.field_178713_d.length)) {
            this.field_178713_d[llllllllllllIlIllIlIIlllllIIllll].render(llllllllllllIlIllIlIIlllllIlIIII);
            ++llllllllllllIlIllIlIIlllllIIllll;
        }
    }
    
    public ModelEnderMite() {
        this.field_178713_d = new ModelRenderer[ModelEnderMite.field_178715_c];
        float llllllllllllIlIllIlIIllllllIIlIl = -3.5f;
        int llllllllllllIlIllIlIIllllllIIlII = ModelEnderMite.lllIlIllIllIlI[1];
        "".length();
        if (((0xA7 ^ 0x9E) & ~(0xB5 ^ 0x8C)) >= " ".length()) {
            throw null;
        }
        while (!lIlIIIllIllIIIII(llllllllllllIlIllIlIIllllllIIlII, this.field_178713_d.length)) {
            (this.field_178713_d[llllllllllllIlIllIlIIllllllIIlII] = new ModelRenderer(this, ModelEnderMite.field_178714_b[llllllllllllIlIllIlIIllllllIIlII][ModelEnderMite.lllIlIllIllIlI[1]], ModelEnderMite.field_178714_b[llllllllllllIlIllIlIIllllllIIlII][ModelEnderMite.lllIlIllIllIlI[3]])).addBox(ModelEnderMite.field_178716_a[llllllllllllIlIllIlIIllllllIIlII][ModelEnderMite.lllIlIllIllIlI[1]] * -0.5f, 0.0f, ModelEnderMite.field_178716_a[llllllllllllIlIllIlIIllllllIIlII][ModelEnderMite.lllIlIllIllIlI[4]] * -0.5f, ModelEnderMite.field_178716_a[llllllllllllIlIllIlIIllllllIIlII][ModelEnderMite.lllIlIllIllIlI[1]], ModelEnderMite.field_178716_a[llllllllllllIlIllIlIIllllllIIlII][ModelEnderMite.lllIlIllIllIlI[3]], ModelEnderMite.field_178716_a[llllllllllllIlIllIlIIllllllIIlII][ModelEnderMite.lllIlIllIllIlI[4]]);
            "".length();
            this.field_178713_d[llllllllllllIlIllIlIIllllllIIlII].setRotationPoint(0.0f, (float)(ModelEnderMite.lllIlIllIllIlI[9] - ModelEnderMite.field_178716_a[llllllllllllIlIllIlIIllllllIIlII][ModelEnderMite.lllIlIllIllIlI[3]]), llllllllllllIlIllIlIIllllllIIlIl);
            if (lIlIIIllIlIlllll(llllllllllllIlIllIlIIllllllIIlII, this.field_178713_d.length - ModelEnderMite.lllIlIllIllIlI[3])) {
                llllllllllllIlIllIlIIllllllIIlIl += (ModelEnderMite.field_178716_a[llllllllllllIlIllIlIIllllllIIlII][ModelEnderMite.lllIlIllIllIlI[4]] + ModelEnderMite.field_178716_a[llllllllllllIlIllIlIIllllllIIlII + ModelEnderMite.lllIlIllIllIlI[3]][ModelEnderMite.lllIlIllIllIlI[4]]) * 0.5f;
            }
            ++llllllllllllIlIllIlIIllllllIIlII;
        }
    }
    
    private static void lIlIIIllIlIllllI() {
        (lllIlIllIllIlI = new int[10])[0] = (0x8F ^ 0x8B);
        ModelEnderMite.lllIlIllIllIlI[1] = ((0xAD ^ 0xBC) & ~(0x18 ^ 0x9));
        ModelEnderMite.lllIlIllIllIlI[2] = "   ".length();
        ModelEnderMite.lllIlIllIllIlI[3] = " ".length();
        ModelEnderMite.lllIlIllIllIlI[4] = "  ".length();
        ModelEnderMite.lllIlIllIllIlI[5] = (137 + 61 - 189 + 144 ^ 157 + 37 - 173 + 138);
        ModelEnderMite.lllIlIllIllIlI[6] = (0xF1 ^ 0x98 ^ (0xD5 ^ 0xB9));
        ModelEnderMite.lllIlIllIllIlI[7] = (0x2E ^ 0xD ^ (0xA1 ^ 0x8C));
        ModelEnderMite.lllIlIllIllIlI[8] = (0x39 ^ 0x6B ^ (0x2D ^ 0x6D));
        ModelEnderMite.lllIlIllIllIlI[9] = (0xB7 ^ 0xBB ^ (0x79 ^ 0x6D));
    }
}
