// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelOcelot extends ModelBase
{
    /* synthetic */ ModelRenderer ocelotTail;
    private static final /* synthetic */ int[] lIIIIIIlIIIlIl;
    /* synthetic */ ModelRenderer ocelotBackRightLeg;
    /* synthetic */ ModelRenderer ocelotHead;
    private static final /* synthetic */ String[] lIIIIIIlIIIlII;
    /* synthetic */ ModelRenderer ocelotFrontRightLeg;
    /* synthetic */ ModelRenderer ocelotFrontLeftLeg;
    /* synthetic */ ModelRenderer ocelotTail2;
    /* synthetic */ ModelRenderer ocelotBody;
    /* synthetic */ ModelRenderer ocelotBackLeftLeg;
    /* synthetic */ int field_78163_i;
    
    @Override
    public void render(final Entity lllllllllllllIlIlIIIlIllllllIlII, final float lllllllllllllIlIlIIIlIllllllIIll, final float lllllllllllllIlIlIIIlIllllllIIlI, final float lllllllllllllIlIlIIIlIllllllIIIl, final float lllllllllllllIlIlIIIlIllllllIIII, final float lllllllllllllIlIlIIIlIlllllIIllI, final float lllllllllllllIlIlIIIlIlllllIlllI) {
        this.setRotationAngles(lllllllllllllIlIlIIIlIllllllIIll, lllllllllllllIlIlIIIlIllllllIIlI, lllllllllllllIlIlIIIlIllllllIIIl, lllllllllllllIlIlIIIlIllllllIIII, lllllllllllllIlIlIIIlIlllllIIllI, lllllllllllllIlIlIIIlIlllllIlllI, lllllllllllllIlIlIIIlIllllllIlII);
        if (lIllIIllllIlIll(this.isChild ? 1 : 0)) {
            final float lllllllllllllIlIlIIIlIlllllIllIl = 2.0f;
            GlStateManager.pushMatrix();
            GlStateManager.scale(1.5f / lllllllllllllIlIlIIIlIlllllIllIl, 1.5f / lllllllllllllIlIlIIIlIlllllIllIl, 1.5f / lllllllllllllIlIlIIIlIlllllIllIl);
            GlStateManager.translate(0.0f, 10.0f * lllllllllllllIlIlIIIlIlllllIlllI, 4.0f * lllllllllllllIlIlIIIlIlllllIlllI);
            this.ocelotHead.render(lllllllllllllIlIlIIIlIlllllIlllI);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.scale(1.0f / lllllllllllllIlIlIIIlIlllllIllIl, 1.0f / lllllllllllllIlIlIIIlIlllllIllIl, 1.0f / lllllllllllllIlIlIIIlIlllllIllIl);
            GlStateManager.translate(0.0f, 24.0f * lllllllllllllIlIlIIIlIlllllIlllI, 0.0f);
            this.ocelotBody.render(lllllllllllllIlIlIIIlIlllllIlllI);
            this.ocelotBackLeftLeg.render(lllllllllllllIlIlIIIlIlllllIlllI);
            this.ocelotBackRightLeg.render(lllllllllllllIlIlIIIlIlllllIlllI);
            this.ocelotFrontLeftLeg.render(lllllllllllllIlIlIIIlIlllllIlllI);
            this.ocelotFrontRightLeg.render(lllllllllllllIlIlIIIlIlllllIlllI);
            this.ocelotTail.render(lllllllllllllIlIlIIIlIlllllIlllI);
            this.ocelotTail2.render(lllllllllllllIlIlIIIlIlllllIlllI);
            GlStateManager.popMatrix();
            "".length();
            if ("  ".length() == " ".length()) {
                return;
            }
        }
        else {
            this.ocelotHead.render(lllllllllllllIlIlIIIlIlllllIlllI);
            this.ocelotBody.render(lllllllllllllIlIlIIIlIlllllIlllI);
            this.ocelotTail.render(lllllllllllllIlIlIIIlIlllllIlllI);
            this.ocelotTail2.render(lllllllllllllIlIlIIIlIlllllIlllI);
            this.ocelotBackLeftLeg.render(lllllllllllllIlIlIIIlIlllllIlllI);
            this.ocelotBackRightLeg.render(lllllllllllllIlIlIIIlIlllllIlllI);
            this.ocelotFrontLeftLeg.render(lllllllllllllIlIlIIIlIlllllIlllI);
            this.ocelotFrontRightLeg.render(lllllllllllllIlIlIIIlIlllllIlllI);
        }
    }
    
    private static String lIllIIlllIIllll(final String lllllllllllllIlIlIIIlIlllIllllII, final String lllllllllllllIlIlIIIlIlllIlllIll) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIIlIllllIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIIlIlllIlllIll.getBytes(StandardCharsets.UTF_8)), ModelOcelot.lIIIIIIlIIIlIl[10]), "DES");
            final Cipher lllllllllllllIlIlIIIlIllllIIIIII = Cipher.getInstance("DES");
            lllllllllllllIlIlIIIlIllllIIIIII.init(ModelOcelot.lIIIIIIlIIIlIl[3], lllllllllllllIlIlIIIlIllllIIIIIl);
            return new String(lllllllllllllIlIlIIIlIllllIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIIlIlllIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIIlIlllIllllll) {
            lllllllllllllIlIlIIIlIlllIllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIIllllIllll(final int lllllllllllllIlIlIIIlIlllIIIllIl, final int lllllllllllllIlIlIIIlIlllIIIllII) {
        return lllllllllllllIlIlIIIlIlllIIIllIl < lllllllllllllIlIlIIIlIlllIIIllII;
    }
    
    static {
        lIllIIllllIlIlI();
        lIllIIlllIlIIlI();
    }
    
    private static void lIllIIlllIlIIlI() {
        (lIIIIIIlIIIlII = new String[ModelOcelot.lIIIIIIlIIIlIl[16]])[ModelOcelot.lIIIIIIlIIIlIl[1]] = lIllIIlllIIllll("0bzn4Ut+jnfLFtbZl5KsMQ==", "EzTzX");
        ModelOcelot.lIIIIIIlIIIlII[ModelOcelot.lIIIIIIlIIIlIl[0]] = lIllIIlllIlIIII("TJFVqTjmq6S2rR+6d96KPg==", "ZFErc");
        ModelOcelot.lIIIIIIlIIIlII[ModelOcelot.lIIIIIIlIIIlIl[3]] = lIllIIlllIlIIII("IpZ3D14dpcLO4o2zSMVqPw==", "jNtXH");
        ModelOcelot.lIIIIIIlIIIlII[ModelOcelot.lIIIIIIlIIIlIl[5]] = lIllIIlllIlIIIl("GRELE1oUFRhF", "qtjwt");
        ModelOcelot.lIIIIIIlIIIlII[ModelOcelot.lIIIIIIlIIIlIl[7]] = lIllIIlllIIllll("jPiY99/sjm8=", "bpVkP");
        ModelOcelot.lIIIIIIlIIIlII[ModelOcelot.lIIIIIIlIIIlIl[8]] = lIllIIlllIlIIII("oZQYEzYtXxU=", "ngWik");
        ModelOcelot.lIIIIIIlIIIlII[ModelOcelot.lIIIIIIlIIIlIl[6]] = lIllIIlllIIllll("Xvk34qgl5xE=", "pRGXL");
        ModelOcelot.lIIIIIIlIIIlII[ModelOcelot.lIIIIIIlIIIlIl[9]] = lIllIIlllIIllll("bXRanomkPgY=", "KcmlA");
        ModelOcelot.lIIIIIIlIIIlII[ModelOcelot.lIIIIIIlIIIlIl[10]] = lIllIIlllIlIIIl("DiwKaw==", "kMxYV");
    }
    
    private static boolean lIllIIllllIllIl(final int lllllllllllllIlIlIIIlIlllIIlIIIl, final int lllllllllllllIlIlIIIlIlllIIlIIII) {
        return lllllllllllllIlIlIIIlIlllIIlIIIl == lllllllllllllIlIlIIIlIlllIIlIIII;
    }
    
    private static String lIllIIlllIlIIIl(String lllllllllllllIlIlIIIlIlllIIlllII, final String lllllllllllllIlIlIIIlIlllIlIIIII) {
        lllllllllllllIlIlIIIlIlllIIlllII = (short)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIIIlIlllIIlllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIIIlIlllIIlllll = new StringBuilder();
        final char[] lllllllllllllIlIlIIIlIlllIIllllI = lllllllllllllIlIlIIIlIlllIlIIIII.toCharArray();
        int lllllllllllllIlIlIIIlIlllIIlllIl = ModelOcelot.lIIIIIIlIIIlIl[1];
        final int lllllllllllllIlIlIIIlIlllIIlIlll = (Object)((String)lllllllllllllIlIlIIIlIlllIIlllII).toCharArray();
        final int lllllllllllllIlIlIIIlIlllIIlIllI = lllllllllllllIlIlIIIlIlllIIlIlll.length;
        long lllllllllllllIlIlIIIlIlllIIlIlIl = ModelOcelot.lIIIIIIlIIIlIl[1];
        while (lIllIIllllIllll((int)lllllllllllllIlIlIIIlIlllIIlIlIl, lllllllllllllIlIlIIIlIlllIIlIllI)) {
            final char lllllllllllllIlIlIIIlIlllIlIIIlI = lllllllllllllIlIlIIIlIlllIIlIlll[lllllllllllllIlIlIIIlIlllIIlIlIl];
            lllllllllllllIlIlIIIlIlllIIlllll.append((char)(lllllllllllllIlIlIIIlIlllIlIIIlI ^ lllllllllllllIlIlIIIlIlllIIllllI[lllllllllllllIlIlIIIlIlllIIlllIl % lllllllllllllIlIlIIIlIlllIIllllI.length]));
            "".length();
            ++lllllllllllllIlIlIIIlIlllIIlllIl;
            ++lllllllllllllIlIlIIIlIlllIIlIlIl;
            "".length();
            if ((0x4F ^ 0x4B) <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIIIlIlllIIlllll);
    }
    
    @Override
    public void setRotationAngles(final float lllllllllllllIlIlIIIlIllllIlllIl, final float lllllllllllllIlIlIIIlIllllIlllII, final float lllllllllllllIlIlIIIlIllllIllIll, final float lllllllllllllIlIlIIIlIllllIllIlI, final float lllllllllllllIlIlIIIlIllllIllIIl, final float lllllllllllllIlIlIIIlIllllIllIII, final Entity lllllllllllllIlIlIIIlIllllIlIlll) {
        this.ocelotHead.rotateAngleX = lllllllllllllIlIlIIIlIllllIllIIl / 57.295776f;
        this.ocelotHead.rotateAngleY = lllllllllllllIlIlIIIlIllllIllIlI / 57.295776f;
        if (lIllIIllllIllII(this.field_78163_i, ModelOcelot.lIIIIIIlIIIlIl[5])) {
            this.ocelotBody.rotateAngleX = 1.5707964f;
            if (lIllIIllllIllIl(this.field_78163_i, ModelOcelot.lIIIIIIlIIIlIl[3])) {
                this.ocelotBackLeftLeg.rotateAngleX = MathHelper.cos(lllllllllllllIlIlIIIlIllllIlllIl * 0.6662f) * 1.0f * lllllllllllllIlIlIIIlIllllIlllII;
                this.ocelotBackRightLeg.rotateAngleX = MathHelper.cos(lllllllllllllIlIlIIIlIllllIlllIl * 0.6662f + 0.3f) * 1.0f * lllllllllllllIlIlIIIlIllllIlllII;
                this.ocelotFrontLeftLeg.rotateAngleX = MathHelper.cos(lllllllllllllIlIlIIIlIllllIlllIl * 0.6662f + 3.1415927f + 0.3f) * 1.0f * lllllllllllllIlIlIIIlIllllIlllII;
                this.ocelotFrontRightLeg.rotateAngleX = MathHelper.cos(lllllllllllllIlIlIIIlIllllIlllIl * 0.6662f + 3.1415927f) * 1.0f * lllllllllllllIlIlIIIlIllllIlllII;
                this.ocelotTail2.rotateAngleX = 1.7278761f + 0.31415927f * MathHelper.cos(lllllllllllllIlIlIIIlIllllIlllIl) * lllllllllllllIlIlIIIlIllllIlllII;
                "".length();
                if ((0x4C ^ 0xD ^ (0xF6 ^ 0xB3)) <= 0) {
                    return;
                }
            }
            else {
                this.ocelotBackLeftLeg.rotateAngleX = MathHelper.cos(lllllllllllllIlIlIIIlIllllIlllIl * 0.6662f) * 1.0f * lllllllllllllIlIlIIIlIllllIlllII;
                this.ocelotBackRightLeg.rotateAngleX = MathHelper.cos(lllllllllllllIlIlIIIlIllllIlllIl * 0.6662f + 3.1415927f) * 1.0f * lllllllllllllIlIlIIIlIllllIlllII;
                this.ocelotFrontLeftLeg.rotateAngleX = MathHelper.cos(lllllllllllllIlIlIIIlIllllIlllIl * 0.6662f + 3.1415927f) * 1.0f * lllllllllllllIlIlIIIlIllllIlllII;
                this.ocelotFrontRightLeg.rotateAngleX = MathHelper.cos(lllllllllllllIlIlIIIlIllllIlllIl * 0.6662f) * 1.0f * lllllllllllllIlIlIIIlIllllIlllII;
                if (lIllIIllllIllIl(this.field_78163_i, ModelOcelot.lIIIIIIlIIIlIl[0])) {
                    this.ocelotTail2.rotateAngleX = 1.7278761f + 0.7853982f * MathHelper.cos(lllllllllllllIlIlIIIlIllllIlllIl) * lllllllllllllIlIlIIIlIllllIlllII;
                    "".length();
                    if (((78 + 119 - 114 + 103 ^ 73 + 120 - 184 + 172) & (11 + 111 - 86 + 109 ^ 52 + 54 - 64 + 116 ^ -" ".length())) > 0) {
                        return;
                    }
                }
                else {
                    this.ocelotTail2.rotateAngleX = 1.7278761f + 0.47123894f * MathHelper.cos(lllllllllllllIlIlIIIlIllllIlllIl) * lllllllllllllIlIlIIIlIllllIlllII;
                }
            }
        }
    }
    
    public ModelOcelot() {
        this.field_78163_i = ModelOcelot.lIIIIIIlIIIlIl[0];
        this.setTextureOffset(ModelOcelot.lIIIIIIlIIIlII[ModelOcelot.lIIIIIIlIIIlIl[1]], ModelOcelot.lIIIIIIlIIIlIl[1], ModelOcelot.lIIIIIIlIIIlIl[1]);
        this.setTextureOffset(ModelOcelot.lIIIIIIlIIIlII[ModelOcelot.lIIIIIIlIIIlIl[0]], ModelOcelot.lIIIIIIlIIIlIl[1], ModelOcelot.lIIIIIIlIIIlIl[2]);
        this.setTextureOffset(ModelOcelot.lIIIIIIlIIIlII[ModelOcelot.lIIIIIIlIIIlIl[3]], ModelOcelot.lIIIIIIlIIIlIl[1], ModelOcelot.lIIIIIIlIIIlIl[4]);
        this.setTextureOffset(ModelOcelot.lIIIIIIlIIIlII[ModelOcelot.lIIIIIIlIIIlIl[5]], ModelOcelot.lIIIIIIlIIIlIl[6], ModelOcelot.lIIIIIIlIIIlIl[4]);
        this.ocelotHead = new ModelRenderer(this, ModelOcelot.lIIIIIIlIIIlII[ModelOcelot.lIIIIIIlIIIlIl[7]]);
        this.ocelotHead.addBox(ModelOcelot.lIIIIIIlIIIlII[ModelOcelot.lIIIIIIlIIIlIl[8]], -2.5f, -2.0f, -3.0f, ModelOcelot.lIIIIIIlIIIlIl[8], ModelOcelot.lIIIIIIlIIIlIl[7], ModelOcelot.lIIIIIIlIIIlIl[8]);
        "".length();
        this.ocelotHead.addBox(ModelOcelot.lIIIIIIlIIIlII[ModelOcelot.lIIIIIIlIIIlIl[6]], -1.5f, 0.0f, -4.0f, ModelOcelot.lIIIIIIlIIIlIl[5], ModelOcelot.lIIIIIIlIIIlIl[3], ModelOcelot.lIIIIIIlIIIlIl[3]);
        "".length();
        this.ocelotHead.addBox(ModelOcelot.lIIIIIIlIIIlII[ModelOcelot.lIIIIIIlIIIlIl[9]], -2.0f, -3.0f, 0.0f, ModelOcelot.lIIIIIIlIIIlIl[0], ModelOcelot.lIIIIIIlIIIlIl[0], ModelOcelot.lIIIIIIlIIIlIl[3]);
        "".length();
        this.ocelotHead.addBox(ModelOcelot.lIIIIIIlIIIlII[ModelOcelot.lIIIIIIlIIIlIl[10]], 1.0f, -3.0f, 0.0f, ModelOcelot.lIIIIIIlIIIlIl[0], ModelOcelot.lIIIIIIlIIIlIl[0], ModelOcelot.lIIIIIIlIIIlIl[3]);
        "".length();
        this.ocelotHead.setRotationPoint(0.0f, 15.0f, -9.0f);
        this.ocelotBody = new ModelRenderer(this, ModelOcelot.lIIIIIIlIIIlIl[11], ModelOcelot.lIIIIIIlIIIlIl[1]);
        this.ocelotBody.addBox(-2.0f, 3.0f, -8.0f, ModelOcelot.lIIIIIIlIIIlIl[7], ModelOcelot.lIIIIIIlIIIlIl[12], ModelOcelot.lIIIIIIlIIIlIl[6], 0.0f);
        this.ocelotBody.setRotationPoint(0.0f, 12.0f, -10.0f);
        this.ocelotTail = new ModelRenderer(this, ModelOcelot.lIIIIIIlIIIlIl[1], ModelOcelot.lIIIIIIlIIIlIl[13]);
        this.ocelotTail.addBox(-0.5f, 0.0f, 0.0f, ModelOcelot.lIIIIIIlIIIlIl[0], ModelOcelot.lIIIIIIlIIIlIl[10], ModelOcelot.lIIIIIIlIIIlIl[0]);
        "".length();
        this.ocelotTail.rotateAngleX = 0.9f;
        this.ocelotTail.setRotationPoint(0.0f, 15.0f, 8.0f);
        this.ocelotTail2 = new ModelRenderer(this, ModelOcelot.lIIIIIIlIIIlIl[7], ModelOcelot.lIIIIIIlIIIlIl[13]);
        this.ocelotTail2.addBox(-0.5f, 0.0f, 0.0f, ModelOcelot.lIIIIIIlIIIlIl[0], ModelOcelot.lIIIIIIlIIIlIl[10], ModelOcelot.lIIIIIIlIIIlIl[0]);
        "".length();
        this.ocelotTail2.setRotationPoint(0.0f, 20.0f, 14.0f);
        this.ocelotBackLeftLeg = new ModelRenderer(this, ModelOcelot.lIIIIIIlIIIlIl[10], ModelOcelot.lIIIIIIlIIIlIl[14]);
        this.ocelotBackLeftLeg.addBox(-1.0f, 0.0f, 1.0f, ModelOcelot.lIIIIIIlIIIlIl[3], ModelOcelot.lIIIIIIlIIIlIl[6], ModelOcelot.lIIIIIIlIIIlIl[3]);
        "".length();
        this.ocelotBackLeftLeg.setRotationPoint(1.1f, 18.0f, 5.0f);
        this.ocelotBackRightLeg = new ModelRenderer(this, ModelOcelot.lIIIIIIlIIIlIl[10], ModelOcelot.lIIIIIIlIIIlIl[14]);
        this.ocelotBackRightLeg.addBox(-1.0f, 0.0f, 1.0f, ModelOcelot.lIIIIIIlIIIlIl[3], ModelOcelot.lIIIIIIlIIIlIl[6], ModelOcelot.lIIIIIIlIIIlIl[3]);
        "".length();
        this.ocelotBackRightLeg.setRotationPoint(-1.1f, 18.0f, 5.0f);
        this.ocelotFrontLeftLeg = new ModelRenderer(this, ModelOcelot.lIIIIIIlIIIlIl[15], ModelOcelot.lIIIIIIlIIIlIl[1]);
        this.ocelotFrontLeftLeg.addBox(-1.0f, 0.0f, 0.0f, ModelOcelot.lIIIIIIlIIIlIl[3], ModelOcelot.lIIIIIIlIIIlIl[4], ModelOcelot.lIIIIIIlIIIlIl[3]);
        "".length();
        this.ocelotFrontLeftLeg.setRotationPoint(1.2f, 13.8f, -5.0f);
        this.ocelotFrontRightLeg = new ModelRenderer(this, ModelOcelot.lIIIIIIlIIIlIl[15], ModelOcelot.lIIIIIIlIIIlIl[1]);
        this.ocelotFrontRightLeg.addBox(-1.0f, 0.0f, 0.0f, ModelOcelot.lIIIIIIlIIIlIl[3], ModelOcelot.lIIIIIIlIIIlIl[4], ModelOcelot.lIIIIIIlIIIlIl[3]);
        "".length();
        this.ocelotFrontRightLeg.setRotationPoint(-1.2f, 13.8f, -5.0f);
    }
    
    private static boolean lIllIIllllIllII(final int lllllllllllllIlIlIIIlIlllIIIIlll, final int lllllllllllllIlIlIIIlIlllIIIIllI) {
        return lllllllllllllIlIlIIIlIlllIIIIlll != lllllllllllllIlIlIIIlIlllIIIIllI;
    }
    
    @Override
    public void setLivingAnimations(final EntityLivingBase lllllllllllllIlIlIIIlIllllIIllIl, final float lllllllllllllIlIlIIIlIllllIIllII, final float lllllllllllllIlIlIIIlIllllIIlIll, final float lllllllllllllIlIlIIIlIllllIIlIlI) {
        final EntityOcelot lllllllllllllIlIlIIIlIllllIIlIIl = (EntityOcelot)lllllllllllllIlIlIIIlIllllIIllIl;
        this.ocelotBody.rotationPointY = 12.0f;
        this.ocelotBody.rotationPointZ = -10.0f;
        this.ocelotHead.rotationPointY = 15.0f;
        this.ocelotHead.rotationPointZ = -9.0f;
        this.ocelotTail.rotationPointY = 15.0f;
        this.ocelotTail.rotationPointZ = 8.0f;
        this.ocelotTail2.rotationPointY = 20.0f;
        this.ocelotTail2.rotationPointZ = 14.0f;
        final ModelRenderer ocelotFrontLeftLeg = this.ocelotFrontLeftLeg;
        final ModelRenderer ocelotFrontRightLeg = this.ocelotFrontRightLeg;
        final float n = 13.8f;
        ocelotFrontRightLeg.rotationPointY = n;
        ocelotFrontLeftLeg.rotationPointY = n;
        final ModelRenderer ocelotFrontLeftLeg2 = this.ocelotFrontLeftLeg;
        final ModelRenderer ocelotFrontRightLeg2 = this.ocelotFrontRightLeg;
        final float n2 = -5.0f;
        ocelotFrontRightLeg2.rotationPointZ = n2;
        ocelotFrontLeftLeg2.rotationPointZ = n2;
        final ModelRenderer ocelotBackLeftLeg = this.ocelotBackLeftLeg;
        final ModelRenderer ocelotBackRightLeg = this.ocelotBackRightLeg;
        final float n3 = 18.0f;
        ocelotBackRightLeg.rotationPointY = n3;
        ocelotBackLeftLeg.rotationPointY = n3;
        final ModelRenderer ocelotBackLeftLeg2 = this.ocelotBackLeftLeg;
        final ModelRenderer ocelotBackRightLeg2 = this.ocelotBackRightLeg;
        final float n4 = 5.0f;
        ocelotBackRightLeg2.rotationPointZ = n4;
        ocelotBackLeftLeg2.rotationPointZ = n4;
        this.ocelotTail.rotateAngleX = 0.9f;
        if (lIllIIllllIlIll(lllllllllllllIlIlIIIlIllllIIlIIl.isSneaking() ? 1 : 0)) {
            final ModelRenderer ocelotBody = this.ocelotBody;
            ++ocelotBody.rotationPointY;
            final ModelRenderer ocelotHead = this.ocelotHead;
            ocelotHead.rotationPointY += 2.0f;
            final ModelRenderer ocelotTail = this.ocelotTail;
            ++ocelotTail.rotationPointY;
            final ModelRenderer ocelotTail2 = this.ocelotTail2;
            ocelotTail2.rotationPointY -= 4.0f;
            final ModelRenderer ocelotTail3 = this.ocelotTail2;
            ocelotTail3.rotationPointZ += 2.0f;
            this.ocelotTail.rotateAngleX = 1.5707964f;
            this.ocelotTail2.rotateAngleX = 1.5707964f;
            this.field_78163_i = ModelOcelot.lIIIIIIlIIIlIl[1];
            "".length();
            if ((0x22 ^ 0x27) <= 0) {
                return;
            }
        }
        else if (lIllIIllllIlIll(lllllllllllllIlIlIIIlIllllIIlIIl.isSprinting() ? 1 : 0)) {
            this.ocelotTail2.rotationPointY = this.ocelotTail.rotationPointY;
            final ModelRenderer ocelotTail4 = this.ocelotTail2;
            ocelotTail4.rotationPointZ += 2.0f;
            this.ocelotTail.rotateAngleX = 1.5707964f;
            this.ocelotTail2.rotateAngleX = 1.5707964f;
            this.field_78163_i = ModelOcelot.lIIIIIIlIIIlIl[3];
            "".length();
            if (((0xFC ^ 0x85 ^ (0xE ^ 0x5E)) & (0x63 ^ 0x12 ^ (0x3C ^ 0x64) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else if (lIllIIllllIlIll(lllllllllllllIlIlIIIlIllllIIlIIl.isSitting() ? 1 : 0)) {
            this.ocelotBody.rotateAngleX = 0.7853982f;
            final ModelRenderer ocelotBody2 = this.ocelotBody;
            ocelotBody2.rotationPointY -= 4.0f;
            final ModelRenderer ocelotBody3 = this.ocelotBody;
            ocelotBody3.rotationPointZ += 5.0f;
            final ModelRenderer ocelotHead2 = this.ocelotHead;
            ocelotHead2.rotationPointY -= 3.3f;
            final ModelRenderer ocelotHead3 = this.ocelotHead;
            ++ocelotHead3.rotationPointZ;
            final ModelRenderer ocelotTail5 = this.ocelotTail;
            ocelotTail5.rotationPointY += 8.0f;
            final ModelRenderer ocelotTail6 = this.ocelotTail;
            ocelotTail6.rotationPointZ -= 2.0f;
            final ModelRenderer ocelotTail7 = this.ocelotTail2;
            ocelotTail7.rotationPointY += 2.0f;
            final ModelRenderer ocelotTail8 = this.ocelotTail2;
            ocelotTail8.rotationPointZ -= 0.8f;
            this.ocelotTail.rotateAngleX = 1.7278761f;
            this.ocelotTail2.rotateAngleX = 2.670354f;
            final ModelRenderer ocelotFrontLeftLeg3 = this.ocelotFrontLeftLeg;
            final ModelRenderer ocelotFrontRightLeg3 = this.ocelotFrontRightLeg;
            final float n5 = -0.15707964f;
            ocelotFrontRightLeg3.rotateAngleX = n5;
            ocelotFrontLeftLeg3.rotateAngleX = n5;
            final ModelRenderer ocelotFrontLeftLeg4 = this.ocelotFrontLeftLeg;
            final ModelRenderer ocelotFrontRightLeg4 = this.ocelotFrontRightLeg;
            final float n6 = 15.8f;
            ocelotFrontRightLeg4.rotationPointY = n6;
            ocelotFrontLeftLeg4.rotationPointY = n6;
            final ModelRenderer ocelotFrontLeftLeg5 = this.ocelotFrontLeftLeg;
            final ModelRenderer ocelotFrontRightLeg5 = this.ocelotFrontRightLeg;
            final float n7 = -7.0f;
            ocelotFrontRightLeg5.rotationPointZ = n7;
            ocelotFrontLeftLeg5.rotationPointZ = n7;
            final ModelRenderer ocelotBackLeftLeg3 = this.ocelotBackLeftLeg;
            final ModelRenderer ocelotBackRightLeg3 = this.ocelotBackRightLeg;
            final float n8 = -1.5707964f;
            ocelotBackRightLeg3.rotateAngleX = n8;
            ocelotBackLeftLeg3.rotateAngleX = n8;
            final ModelRenderer ocelotBackLeftLeg4 = this.ocelotBackLeftLeg;
            final ModelRenderer ocelotBackRightLeg4 = this.ocelotBackRightLeg;
            final float n9 = 21.0f;
            ocelotBackRightLeg4.rotationPointY = n9;
            ocelotBackLeftLeg4.rotationPointY = n9;
            final ModelRenderer ocelotBackLeftLeg5 = this.ocelotBackLeftLeg;
            final ModelRenderer ocelotBackRightLeg5 = this.ocelotBackRightLeg;
            final float n10 = 1.0f;
            ocelotBackRightLeg5.rotationPointZ = n10;
            ocelotBackLeftLeg5.rotationPointZ = n10;
            this.field_78163_i = ModelOcelot.lIIIIIIlIIIlIl[5];
            "".length();
            if ((0x3A ^ 0x3E) == 0x0) {
                return;
            }
        }
        else {
            this.field_78163_i = ModelOcelot.lIIIIIIlIIIlIl[0];
        }
    }
    
    private static String lIllIIlllIlIIII(final String lllllllllllllIlIlIIIlIlllIllIIIl, final String lllllllllllllIlIlIIIlIlllIlIlllI) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIIlIlllIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIIlIlllIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIIIlIlllIllIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIIIlIlllIllIIll.init(ModelOcelot.lIIIIIIlIIIlIl[3], lllllllllllllIlIlIIIlIlllIllIlII);
            return new String(lllllllllllllIlIlIIIlIlllIllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIIlIlllIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIIlIlllIllIIlI) {
            lllllllllllllIlIlIIIlIlllIllIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIIllllIlIll(final int lllllllllllllIlIlIIIlIlllIIIlIlI) {
        return lllllllllllllIlIlIIIlIlllIIIlIlI != 0;
    }
    
    private static void lIllIIllllIlIlI() {
        (lIIIIIIlIIIlIl = new int[17])[0] = " ".length();
        ModelOcelot.lIIIIIIlIIIlIl[1] = ((0xFE ^ 0x8E ^ (0x64 ^ 0x22)) & (0x72 ^ 0x29 ^ (0xF0 ^ 0x9D) ^ -" ".length()));
        ModelOcelot.lIIIIIIlIIIlIl[2] = (95 + 152 - 154 + 98 ^ 107 + 150 - 96 + 6);
        ModelOcelot.lIIIIIIlIIIlIl[3] = "  ".length();
        ModelOcelot.lIIIIIIlIIIlIl[4] = (12 + 16 - 17 + 141 ^ 3 + 14 + 2 + 127);
        ModelOcelot.lIIIIIIlIIIlIl[5] = "   ".length();
        ModelOcelot.lIIIIIIlIIIlIl[6] = (0x19 ^ 0x58 ^ (0xD ^ 0x4A));
        ModelOcelot.lIIIIIIlIIIlIl[7] = (117 + 132 - 198 + 102 ^ 32 + 86 + 34 + 5);
        ModelOcelot.lIIIIIIlIIIlIl[8] = (0x83 ^ 0x86);
        ModelOcelot.lIIIIIIlIIIlIl[9] = (0x17 ^ 0x10);
        ModelOcelot.lIIIIIIlIIIlIl[10] = (82 + 107 - 84 + 73 ^ 46 + 36 - 46 + 150);
        ModelOcelot.lIIIIIIlIIIlIl[11] = (0x8 ^ 0x1C);
        ModelOcelot.lIIIIIIlIIIlIl[12] = (0x92 ^ 0x82);
        ModelOcelot.lIIIIIIlIIIlIl[13] = (0x96 ^ 0x99);
        ModelOcelot.lIIIIIIlIIIlIl[14] = (0x97 ^ 0x9A);
        ModelOcelot.lIIIIIIlIIIlIl[15] = (73 + 52 - 88 + 100 ^ 83 + 81 - 87 + 84);
        ModelOcelot.lIIIIIIlIIIlIl[16] = (0x1E ^ 0x17);
    }
}
