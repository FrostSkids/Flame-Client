// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.util.Vec3;
import net.minecraft.client.Minecraft;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.Entity;

public class ModelGuardian extends ModelBase
{
    private /* synthetic */ ModelRenderer guardianEye;
    private /* synthetic */ ModelRenderer guardianBody;
    private static final /* synthetic */ int[] lIllIIIIIlIIll;
    private /* synthetic */ ModelRenderer[] guardianSpines;
    private /* synthetic */ ModelRenderer[] guardianTail;
    
    @Override
    public void render(final Entity lllllllllllllIIIIlIIIllllIIlIlIl, final float lllllllllllllIIIIlIIIllllIIIllII, final float lllllllllllllIIIIlIIIllllIIlIIll, final float lllllllllllllIIIIlIIIllllIIIlIlI, final float lllllllllllllIIIIlIIIllllIIlIIIl, final float lllllllllllllIIIIlIIIllllIIlIIII, final float lllllllllllllIIIIlIIIllllIIIIlll) {
        this.setRotationAngles(lllllllllllllIIIIlIIIllllIIIllII, lllllllllllllIIIIlIIIllllIIlIIll, lllllllllllllIIIIlIIIllllIIIlIlI, lllllllllllllIIIIlIIIllllIIlIIIl, lllllllllllllIIIIlIIIllllIIlIIII, lllllllllllllIIIIlIIIllllIIIIlll, lllllllllllllIIIIlIIIllllIIlIlIl);
        this.guardianBody.render(lllllllllllllIIIIlIIIllllIIIIlll);
    }
    
    private static boolean llllIllIIIIlIll(final int lllllllllllllIIIIlIIIlllIIlllIll) {
        return lllllllllllllIIIIlIIIlllIIlllIll != 0;
    }
    
    private static boolean llllIllIIIIllII(final Object lllllllllllllIIIIlIIIlllIIllllIl) {
        return lllllllllllllIIIIlIIIlllIIllllIl != null;
    }
    
    @Override
    public void setRotationAngles(final float lllllllllllllIIIIlIIIlllIlllIIII, final float lllllllllllllIIIIlIIIlllIllIllll, final float lllllllllllllIIIIlIIIlllIlIlIllI, final float lllllllllllllIIIIlIIIlllIllIllIl, final float lllllllllllllIIIIlIIIlllIllIllII, final float lllllllllllllIIIIlIIIlllIllIlIll, final Entity lllllllllllllIIIIlIIIlllIllIlIlI) {
        final EntityGuardian lllllllllllllIIIIlIIIlllIllIlIIl = (EntityGuardian)lllllllllllllIIIIlIIIlllIllIlIlI;
        final float lllllllllllllIIIIlIIIlllIllIlIII = lllllllllllllIIIIlIIIlllIlIlIllI - lllllllllllllIIIIlIIIlllIllIlIIl.ticksExisted;
        this.guardianBody.rotateAngleY = lllllllllllllIIIIlIIIlllIllIllIl / 57.295776f;
        this.guardianBody.rotateAngleX = lllllllllllllIIIIlIIIlllIllIllII / 57.295776f;
        final float[] array = new float[ModelGuardian.lIllIIIIIlIIll[1]];
        array[ModelGuardian.lIllIIIIIlIIll[2]] = 1.75f;
        array[ModelGuardian.lIllIIIIIlIIll[6]] = 0.25f;
        array[ModelGuardian.lIllIIIIIlIIll[5]] = 0.0f;
        array[ModelGuardian.lIllIIIIIlIIll[10]] = 0.0f;
        array[ModelGuardian.lIllIIIIIlIIll[11]] = 0.5f;
        array[ModelGuardian.lIllIIIIIlIIll[19]] = 0.5f;
        array[ModelGuardian.lIllIIIIIlIIll[16]] = 0.5f;
        array[ModelGuardian.lIllIIIIIlIIll[13]] = 0.5f;
        array[ModelGuardian.lIllIIIIIlIIll[9]] = 1.25f;
        array[ModelGuardian.lIllIIIIIlIIll[8]] = 0.75f;
        array[ModelGuardian.lIllIIIIIlIIll[20]] = 0.0f;
        array[ModelGuardian.lIllIIIIIlIIll[21]] = 0.0f;
        final float[] lllllllllllllIIIIlIIIlllIllIIlll = array;
        final float[] array2 = new float[ModelGuardian.lIllIIIIIlIIll[1]];
        array2[ModelGuardian.lIllIIIIIlIIll[2]] = 0.0f;
        array2[ModelGuardian.lIllIIIIIlIIll[6]] = 0.0f;
        array2[ModelGuardian.lIllIIIIIlIIll[5]] = 0.0f;
        array2[ModelGuardian.lIllIIIIIlIIll[10]] = 0.0f;
        array2[ModelGuardian.lIllIIIIIlIIll[11]] = 0.25f;
        array2[ModelGuardian.lIllIIIIIlIIll[19]] = 1.75f;
        array2[ModelGuardian.lIllIIIIIlIIll[16]] = 1.25f;
        array2[ModelGuardian.lIllIIIIIlIIll[13]] = 0.75f;
        array2[ModelGuardian.lIllIIIIIlIIll[9]] = 0.0f;
        array2[ModelGuardian.lIllIIIIIlIIll[8]] = 0.0f;
        array2[ModelGuardian.lIllIIIIIlIIll[20]] = 0.0f;
        array2[ModelGuardian.lIllIIIIIlIIll[21]] = 0.0f;
        final float[] lllllllllllllIIIIlIIIlllIllIIllI = array2;
        final float[] array3 = new float[ModelGuardian.lIllIIIIIlIIll[1]];
        array3[ModelGuardian.lIllIIIIIlIIll[2]] = 0.0f;
        array3[ModelGuardian.lIllIIIIIlIIll[6]] = 0.0f;
        array3[ModelGuardian.lIllIIIIIlIIll[5]] = 0.25f;
        array3[ModelGuardian.lIllIIIIIlIIll[10]] = 1.75f;
        array3[ModelGuardian.lIllIIIIIlIIll[11]] = 0.0f;
        array3[ModelGuardian.lIllIIIIIlIIll[19]] = 0.0f;
        array3[ModelGuardian.lIllIIIIIlIIll[16]] = 0.0f;
        array3[ModelGuardian.lIllIIIIIlIIll[13]] = 0.0f;
        array3[ModelGuardian.lIllIIIIIlIIll[9]] = 0.0f;
        array3[ModelGuardian.lIllIIIIIlIIll[8]] = 0.0f;
        array3[ModelGuardian.lIllIIIIIlIIll[20]] = 0.75f;
        array3[ModelGuardian.lIllIIIIIlIIll[21]] = 1.25f;
        final float[] lllllllllllllIIIIlIIIlllIllIIlIl = array3;
        final float[] array4 = new float[ModelGuardian.lIllIIIIIlIIll[1]];
        array4[ModelGuardian.lIllIIIIIlIIll[2]] = 0.0f;
        array4[ModelGuardian.lIllIIIIIlIIll[6]] = 0.0f;
        array4[ModelGuardian.lIllIIIIIlIIll[5]] = 8.0f;
        array4[ModelGuardian.lIllIIIIIlIIll[10]] = -8.0f;
        array4[ModelGuardian.lIllIIIIIlIIll[11]] = -8.0f;
        array4[ModelGuardian.lIllIIIIIlIIll[19]] = 8.0f;
        array4[ModelGuardian.lIllIIIIIlIIll[16]] = 8.0f;
        array4[ModelGuardian.lIllIIIIIlIIll[13]] = -8.0f;
        array4[ModelGuardian.lIllIIIIIlIIll[9]] = 0.0f;
        array4[ModelGuardian.lIllIIIIIlIIll[8]] = 0.0f;
        array4[ModelGuardian.lIllIIIIIlIIll[20]] = 8.0f;
        array4[ModelGuardian.lIllIIIIIlIIll[21]] = -8.0f;
        final float[] lllllllllllllIIIIlIIIlllIllIIlII = array4;
        final float[] array5 = new float[ModelGuardian.lIllIIIIIlIIll[1]];
        array5[ModelGuardian.lIllIIIIIlIIll[2]] = -8.0f;
        array5[ModelGuardian.lIllIIIIIlIIll[6]] = -8.0f;
        array5[ModelGuardian.lIllIIIIIlIIll[5]] = -8.0f;
        array5[ModelGuardian.lIllIIIIIlIIll[10]] = -8.0f;
        array5[ModelGuardian.lIllIIIIIlIIll[11]] = 0.0f;
        array5[ModelGuardian.lIllIIIIIlIIll[19]] = 0.0f;
        array5[ModelGuardian.lIllIIIIIlIIll[16]] = 0.0f;
        array5[ModelGuardian.lIllIIIIIlIIll[13]] = 0.0f;
        array5[ModelGuardian.lIllIIIIIlIIll[9]] = 8.0f;
        array5[ModelGuardian.lIllIIIIIlIIll[8]] = 8.0f;
        array5[ModelGuardian.lIllIIIIIlIIll[20]] = 8.0f;
        array5[ModelGuardian.lIllIIIIIlIIll[21]] = 8.0f;
        final float[] lllllllllllllIIIIlIIIlllIllIIIll = array5;
        final float[] array6 = new float[ModelGuardian.lIllIIIIIlIIll[1]];
        array6[ModelGuardian.lIllIIIIIlIIll[2]] = 8.0f;
        array6[ModelGuardian.lIllIIIIIlIIll[6]] = -8.0f;
        array6[ModelGuardian.lIllIIIIIlIIll[5]] = 0.0f;
        array6[ModelGuardian.lIllIIIIIlIIll[10]] = 0.0f;
        array6[ModelGuardian.lIllIIIIIlIIll[11]] = -8.0f;
        array6[ModelGuardian.lIllIIIIIlIIll[19]] = -8.0f;
        array6[ModelGuardian.lIllIIIIIlIIll[16]] = 8.0f;
        array6[ModelGuardian.lIllIIIIIlIIll[13]] = 8.0f;
        array6[ModelGuardian.lIllIIIIIlIIll[9]] = 8.0f;
        array6[ModelGuardian.lIllIIIIIlIIll[8]] = -8.0f;
        array6[ModelGuardian.lIllIIIIIlIIll[20]] = 0.0f;
        array6[ModelGuardian.lIllIIIIIlIIll[21]] = 0.0f;
        final float[] lllllllllllllIIIIlIIIlllIllIIIlI = array6;
        final float lllllllllllllIIIIlIIIlllIllIIIIl = (1.0f - lllllllllllllIIIIlIIIlllIllIlIIl.func_175469_o(lllllllllllllIIIIlIIIlllIllIlIII)) * 0.55f;
        int lllllllllllllIIIIlIIIlllIllIIIII = ModelGuardian.lIllIIIIIlIIll[2];
        "".length();
        if (-"  ".length() >= 0) {
            return;
        }
        while (!llllIllIIIIlIIl(lllllllllllllIIIIlIIIlllIllIIIII, ModelGuardian.lIllIIIIIlIIll[1])) {
            this.guardianSpines[lllllllllllllIIIIlIIIlllIllIIIII].rotateAngleX = 3.1415927f * lllllllllllllIIIIlIIIlllIllIIlll[lllllllllllllIIIIlIIIlllIllIIIII];
            this.guardianSpines[lllllllllllllIIIIlIIIlllIllIIIII].rotateAngleY = 3.1415927f * lllllllllllllIIIIlIIIlllIllIIllI[lllllllllllllIIIIlIIIlllIllIIIII];
            this.guardianSpines[lllllllllllllIIIIlIIIlllIllIIIII].rotateAngleZ = 3.1415927f * lllllllllllllIIIIlIIIlllIllIIlIl[lllllllllllllIIIIlIIIlllIllIIIII];
            this.guardianSpines[lllllllllllllIIIIlIIIlllIllIIIII].rotationPointX = lllllllllllllIIIIlIIIlllIllIIlII[lllllllllllllIIIIlIIIlllIllIIIII] * (1.0f + MathHelper.cos(lllllllllllllIIIIlIIIlllIlIlIllI * 1.5f + lllllllllllllIIIIlIIIlllIllIIIII) * 0.01f - lllllllllllllIIIIlIIIlllIllIIIIl);
            this.guardianSpines[lllllllllllllIIIIlIIIlllIllIIIII].rotationPointY = 16.0f + lllllllllllllIIIIlIIIlllIllIIIll[lllllllllllllIIIIlIIIlllIllIIIII] * (1.0f + MathHelper.cos(lllllllllllllIIIIlIIIlllIlIlIllI * 1.5f + lllllllllllllIIIIlIIIlllIllIIIII) * 0.01f - lllllllllllllIIIIlIIIlllIllIIIIl);
            this.guardianSpines[lllllllllllllIIIIlIIIlllIllIIIII].rotationPointZ = lllllllllllllIIIIlIIIlllIllIIIlI[lllllllllllllIIIIlIIIlllIllIIIII] * (1.0f + MathHelper.cos(lllllllllllllIIIIlIIIlllIlIlIllI * 1.5f + lllllllllllllIIIIlIIIlllIllIIIII) * 0.01f - lllllllllllllIIIIlIIIlllIllIIIIl);
            ++lllllllllllllIIIIlIIIlllIllIIIII;
        }
        this.guardianEye.rotationPointZ = -8.25f;
        Entity lllllllllllllIIIIlIIIlllIlIlllll = Minecraft.getMinecraft().getRenderViewEntity();
        if (llllIllIIIIlIll(lllllllllllllIIIIlIIIlllIllIlIIl.hasTargetedEntity() ? 1 : 0)) {
            lllllllllllllIIIIlIIIlllIlIlllll = lllllllllllllIIIIlIIIlllIllIlIIl.getTargetedEntity();
        }
        if (llllIllIIIIllII(lllllllllllllIIIIlIIIlllIlIlllll)) {
            final Vec3 lllllllllllllIIIIlIIIlllIlIllllI = lllllllllllllIIIIlIIIlllIlIlllll.getPositionEyes(0.0f);
            final Vec3 lllllllllllllIIIIlIIIlllIlIlllIl = lllllllllllllIIIIlIIIlllIllIlIlI.getPositionEyes(0.0f);
            final double lllllllllllllIIIIlIIIlllIlIlllII = lllllllllllllIIIIlIIIlllIlIllllI.yCoord - lllllllllllllIIIIlIIIlllIlIlllIl.yCoord;
            if (llllIllIIIIllIl(llllIllIIIIlIlI(lllllllllllllIIIIlIIIlllIlIlllII, 0.0))) {
                this.guardianEye.rotationPointY = 0.0f;
                "".length();
                if ("   ".length() < ((0x3B ^ 0x67) & ~(0x61 ^ 0x3D))) {
                    return;
                }
            }
            else {
                this.guardianEye.rotationPointY = 1.0f;
            }
            Vec3 lllllllllllllIIIIlIIIlllIlIllIll = lllllllllllllIIIIlIIIlllIllIlIlI.getLook(0.0f);
            lllllllllllllIIIIlIIIlllIlIllIll = new Vec3(lllllllllllllIIIIlIIIlllIlIllIll.xCoord, 0.0, lllllllllllllIIIIlIIIlllIlIllIll.zCoord);
            final Vec3 lllllllllllllIIIIlIIIlllIlIllIlI = new Vec3(lllllllllllllIIIIlIIIlllIlIlllIl.xCoord - lllllllllllllIIIIlIIIlllIlIllllI.xCoord, 0.0, lllllllllllllIIIIlIIIlllIlIlllIl.zCoord - lllllllllllllIIIIlIIIlllIlIllllI.zCoord).normalize().rotateYaw(1.5707964f);
            final double lllllllllllllIIIIlIIIlllIlIllIIl = lllllllllllllIIIIlIIIlllIlIllIll.dotProduct(lllllllllllllIIIIlIIIlllIlIllIlI);
            this.guardianEye.rotationPointX = MathHelper.sqrt_float((float)Math.abs(lllllllllllllIIIIlIIIlllIlIllIIl)) * 2.0f * (float)Math.signum(lllllllllllllIIIIlIIIlllIlIllIIl);
        }
        this.guardianEye.showModel = (ModelGuardian.lIllIIIIIlIIll[6] != 0);
        final float lllllllllllllIIIIlIIIlllIlIllIII = lllllllllllllIIIIlIIIlllIllIlIIl.func_175471_a(lllllllllllllIIIIlIIIlllIllIlIII);
        this.guardianTail[ModelGuardian.lIllIIIIIlIIll[2]].rotateAngleY = MathHelper.sin(lllllllllllllIIIIlIIIlllIlIllIII) * 3.1415927f * 0.05f;
        this.guardianTail[ModelGuardian.lIllIIIIIlIIll[6]].rotateAngleY = MathHelper.sin(lllllllllllllIIIIlIIIlllIlIllIII) * 3.1415927f * 0.1f;
        this.guardianTail[ModelGuardian.lIllIIIIIlIIll[6]].rotationPointX = -1.5f;
        this.guardianTail[ModelGuardian.lIllIIIIIlIIll[6]].rotationPointY = 0.5f;
        this.guardianTail[ModelGuardian.lIllIIIIIlIIll[6]].rotationPointZ = 14.0f;
        this.guardianTail[ModelGuardian.lIllIIIIIlIIll[5]].rotateAngleY = MathHelper.sin(lllllllllllllIIIIlIIIlllIlIllIII) * 3.1415927f * 0.15f;
        this.guardianTail[ModelGuardian.lIllIIIIIlIIll[5]].rotationPointX = 0.5f;
        this.guardianTail[ModelGuardian.lIllIIIIIlIIll[5]].rotationPointY = 0.5f;
        this.guardianTail[ModelGuardian.lIllIIIIIlIIll[5]].rotationPointZ = 6.0f;
    }
    
    public int func_178706_a() {
        return ModelGuardian.lIllIIIIIlIIll[12];
    }
    
    static {
        llllIllIIIIlIII();
    }
    
    private static boolean llllIllIIIIlIIl(final int lllllllllllllIIIIlIIIlllIlIIIIII, final int lllllllllllllIIIIlIIIlllIIllllll) {
        return lllllllllllllIIIIlIIIlllIlIIIIII >= lllllllllllllIIIIlIIIlllIIllllll;
    }
    
    private static int llllIllIIIIlIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean llllIllIIIIllIl(final int lllllllllllllIIIIlIIIlllIIlllIIl) {
        return lllllllllllllIIIIlIIIlllIIlllIIl > 0;
    }
    
    private static void llllIllIIIIlIII() {
        (lIllIIIIIlIIll = new int[22])[0] = (202 + 116 - 174 + 111 ^ 188 + 156 - 257 + 104);
        ModelGuardian.lIllIIIIIlIIll[1] = (0xB7 ^ 0xBB);
        ModelGuardian.lIllIIIIIlIIll[2] = ("   ".length() & ~"   ".length());
        ModelGuardian.lIllIIIIIlIIll[3] = (0x66 ^ 0x41 ^ (0x71 ^ 0x46));
        ModelGuardian.lIllIIIIIlIIll[4] = (0xF1 ^ 0xBB ^ (0x97 ^ 0xC1));
        ModelGuardian.lIllIIIIIlIIll[5] = "  ".length();
        ModelGuardian.lIllIIIIIlIIll[6] = " ".length();
        ModelGuardian.lIllIIIIIlIIll[7] = (0x5A ^ 0x7B ^ (0x8C ^ 0x85));
        ModelGuardian.lIllIIIIIlIIll[8] = (2 + 45 - 5 + 94 ^ 5 + 15 + 39 + 70);
        ModelGuardian.lIllIIIIIlIIll[9] = (0x8E ^ 0x86);
        ModelGuardian.lIllIIIIIlIIll[10] = "   ".length();
        ModelGuardian.lIllIIIIIlIIll[11] = (63 + 101 - 127 + 119 ^ 118 + 94 - 169 + 109);
        ModelGuardian.lIllIIIIIlIIll[12] = (0x95 ^ 0xA3);
        ModelGuardian.lIllIIIIIlIIll[13] = (0x17 ^ 0x10);
        ModelGuardian.lIllIIIIIlIIll[14] = (0x6E ^ 0x47);
        ModelGuardian.lIllIIIIIlIIll[15] = (134 + 76 - 137 + 101 ^ 88 + 45 - 121 + 130);
        ModelGuardian.lIllIIIIIlIIll[16] = (0x62 ^ 0x4D ^ (0x34 ^ 0x1D));
        ModelGuardian.lIllIIIIIlIIll[17] = (0x83 ^ 0x9A);
        ModelGuardian.lIllIIIIIlIIll[18] = (133 + 81 - 188 + 153 ^ 82 + 47 - 27 + 58);
        ModelGuardian.lIllIIIIIlIIll[19] = (0x64 ^ 0x61);
        ModelGuardian.lIllIIIIIlIIll[20] = (0x35 ^ 0x3F);
        ModelGuardian.lIllIIIIIlIIll[21] = (0x63 ^ 0x1F ^ (0xE2 ^ 0x95));
    }
    
    public ModelGuardian() {
        this.textureWidth = ModelGuardian.lIllIIIIIlIIll[0];
        this.textureHeight = ModelGuardian.lIllIIIIIlIIll[0];
        this.guardianSpines = new ModelRenderer[ModelGuardian.lIllIIIIIlIIll[1]];
        this.guardianBody = new ModelRenderer(this);
        this.guardianBody.setTextureOffset(ModelGuardian.lIllIIIIIlIIll[2], ModelGuardian.lIllIIIIIlIIll[2]).addBox(-6.0f, 10.0f, -8.0f, ModelGuardian.lIllIIIIIlIIll[1], ModelGuardian.lIllIIIIIlIIll[1], ModelGuardian.lIllIIIIIlIIll[3]);
        "".length();
        this.guardianBody.setTextureOffset(ModelGuardian.lIllIIIIIlIIll[2], ModelGuardian.lIllIIIIIlIIll[4]).addBox(-8.0f, 10.0f, -6.0f, ModelGuardian.lIllIIIIIlIIll[5], ModelGuardian.lIllIIIIIlIIll[1], ModelGuardian.lIllIIIIIlIIll[1]);
        "".length();
        this.guardianBody.setTextureOffset(ModelGuardian.lIllIIIIIlIIll[2], ModelGuardian.lIllIIIIIlIIll[4]).addBox(6.0f, 10.0f, -6.0f, ModelGuardian.lIllIIIIIlIIll[5], ModelGuardian.lIllIIIIIlIIll[1], ModelGuardian.lIllIIIIIlIIll[1], (boolean)(ModelGuardian.lIllIIIIIlIIll[6] != 0));
        "".length();
        this.guardianBody.setTextureOffset(ModelGuardian.lIllIIIIIlIIll[3], ModelGuardian.lIllIIIIIlIIll[7]).addBox(-6.0f, 8.0f, -6.0f, ModelGuardian.lIllIIIIIlIIll[1], ModelGuardian.lIllIIIIIlIIll[5], ModelGuardian.lIllIIIIIlIIll[1]);
        "".length();
        this.guardianBody.setTextureOffset(ModelGuardian.lIllIIIIIlIIll[3], ModelGuardian.lIllIIIIIlIIll[7]).addBox(-6.0f, 22.0f, -6.0f, ModelGuardian.lIllIIIIIlIIll[1], ModelGuardian.lIllIIIIIlIIll[5], ModelGuardian.lIllIIIIIlIIll[1]);
        "".length();
        int lllllllllllllIIIIlIIIllllIlIIIlI = ModelGuardian.lIllIIIIIlIIll[2];
        "".length();
        if (((0x30 ^ 0x2E) & ~(0xAF ^ 0xB1)) != 0x0) {
            throw null;
        }
        while (!llllIllIIIIlIIl(lllllllllllllIIIIlIIIllllIlIIIlI, this.guardianSpines.length)) {
            (this.guardianSpines[lllllllllllllIIIIlIIIllllIlIIIlI] = new ModelRenderer(this, ModelGuardian.lIllIIIIIlIIll[2], ModelGuardian.lIllIIIIIlIIll[2])).addBox(-1.0f, -4.5f, -1.0f, ModelGuardian.lIllIIIIIlIIll[5], ModelGuardian.lIllIIIIIlIIll[8], ModelGuardian.lIllIIIIIlIIll[5]);
            "".length();
            this.guardianBody.addChild(this.guardianSpines[lllllllllllllIIIIlIIIllllIlIIIlI]);
            ++lllllllllllllIIIIlIIIllllIlIIIlI;
        }
        this.guardianEye = new ModelRenderer(this, ModelGuardian.lIllIIIIIlIIll[9], ModelGuardian.lIllIIIIIlIIll[2]);
        this.guardianEye.addBox(-1.0f, 15.0f, 0.0f, ModelGuardian.lIllIIIIIlIIll[5], ModelGuardian.lIllIIIIIlIIll[5], ModelGuardian.lIllIIIIIlIIll[6]);
        "".length();
        this.guardianBody.addChild(this.guardianEye);
        this.guardianTail = new ModelRenderer[ModelGuardian.lIllIIIIIlIIll[10]];
        (this.guardianTail[ModelGuardian.lIllIIIIIlIIll[2]] = new ModelRenderer(this, ModelGuardian.lIllIIIIIlIIll[7], ModelGuardian.lIllIIIIIlIIll[2])).addBox(-2.0f, 14.0f, 7.0f, ModelGuardian.lIllIIIIIlIIll[11], ModelGuardian.lIllIIIIIlIIll[11], ModelGuardian.lIllIIIIIlIIll[9]);
        "".length();
        (this.guardianTail[ModelGuardian.lIllIIIIIlIIll[6]] = new ModelRenderer(this, ModelGuardian.lIllIIIIIlIIll[2], ModelGuardian.lIllIIIIIlIIll[12])).addBox(0.0f, 14.0f, 0.0f, ModelGuardian.lIllIIIIIlIIll[10], ModelGuardian.lIllIIIIIlIIll[10], ModelGuardian.lIllIIIIIlIIll[13]);
        "".length();
        this.guardianTail[ModelGuardian.lIllIIIIIlIIll[5]] = new ModelRenderer(this);
        this.guardianTail[ModelGuardian.lIllIIIIIlIIll[5]].setTextureOffset(ModelGuardian.lIllIIIIIlIIll[14], ModelGuardian.lIllIIIIIlIIll[15]).addBox(0.0f, 14.0f, 0.0f, ModelGuardian.lIllIIIIIlIIll[5], ModelGuardian.lIllIIIIIlIIll[5], ModelGuardian.lIllIIIIIlIIll[16]);
        "".length();
        this.guardianTail[ModelGuardian.lIllIIIIIlIIll[5]].setTextureOffset(ModelGuardian.lIllIIIIIlIIll[17], ModelGuardian.lIllIIIIIlIIll[18]).addBox(1.0f, 10.5f, 3.0f, ModelGuardian.lIllIIIIIlIIll[6], ModelGuardian.lIllIIIIIlIIll[8], ModelGuardian.lIllIIIIIlIIll[8]);
        "".length();
        this.guardianBody.addChild(this.guardianTail[ModelGuardian.lIllIIIIIlIIll[2]]);
        this.guardianTail[ModelGuardian.lIllIIIIIlIIll[2]].addChild(this.guardianTail[ModelGuardian.lIllIIIIIlIIll[6]]);
        this.guardianTail[ModelGuardian.lIllIIIIIlIIll[6]].addChild(this.guardianTail[ModelGuardian.lIllIIIIIlIIll[5]]);
    }
}
