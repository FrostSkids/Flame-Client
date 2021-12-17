// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import java.util.Arrays;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ModelDragon extends ModelBase
{
    private /* synthetic */ ModelRenderer rearFoot;
    private /* synthetic */ ModelRenderer frontLeg;
    private /* synthetic */ ModelRenderer rearLegTip;
    private /* synthetic */ ModelRenderer head;
    private /* synthetic */ ModelRenderer jaw;
    private /* synthetic */ ModelRenderer body;
    private /* synthetic */ ModelRenderer rearLeg;
    private static final /* synthetic */ int[] llIlIlIlIIllIl;
    private /* synthetic */ ModelRenderer spine;
    private /* synthetic */ ModelRenderer frontLegTip;
    private static final /* synthetic */ String[] llIlIlIlIIlIIl;
    private /* synthetic */ ModelRenderer frontFoot;
    private /* synthetic */ ModelRenderer wing;
    private /* synthetic */ float partialTicks;
    private /* synthetic */ ModelRenderer wingTip;
    
    public ModelDragon(final float llllllllllllIllIlIlIIllIlIlIllll) {
        this.textureWidth = ModelDragon.llIlIlIlIIllIl[0];
        this.textureHeight = ModelDragon.llIlIlIlIIllIl[0];
        this.setTextureOffset(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[1]], ModelDragon.llIlIlIlIIllIl[1], ModelDragon.llIlIlIlIIllIl[1]);
        this.setTextureOffset(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[2]], ModelDragon.llIlIlIlIIllIl[3], ModelDragon.llIlIlIlIIllIl[4]);
        this.setTextureOffset(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[5]], ModelDragon.llIlIlIlIIllIl[3], ModelDragon.llIlIlIlIIllIl[6]);
        this.setTextureOffset(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[7]], ModelDragon.llIlIlIlIIllIl[1], ModelDragon.llIlIlIlIIllIl[1]);
        this.setTextureOffset(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[8]], ModelDragon.llIlIlIlIIllIl[9], ModelDragon.llIlIlIlIIllIl[1]);
        this.setTextureOffset(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[10]], ModelDragon.llIlIlIlIIllIl[11], ModelDragon.llIlIlIlIIllIl[1]);
        this.setTextureOffset(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[12]], ModelDragon.llIlIlIlIIllIl[9], ModelDragon.llIlIlIlIIllIl[13]);
        this.setTextureOffset(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[14]], ModelDragon.llIlIlIlIIllIl[9], ModelDragon.llIlIlIlIIllIl[4]);
        this.setTextureOffset(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[15]], ModelDragon.llIlIlIlIIllIl[16], ModelDragon.llIlIlIlIIllIl[17]);
        this.setTextureOffset(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[18]], ModelDragon.llIlIlIlIIllIl[16], ModelDragon.llIlIlIlIIllIl[19]);
        this.setTextureOffset(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[20]], ModelDragon.llIlIlIlIIllIl[9], ModelDragon.llIlIlIlIIllIl[21]);
        this.setTextureOffset(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[22]], ModelDragon.llIlIlIlIIllIl[9], ModelDragon.llIlIlIlIIllIl[23]);
        this.setTextureOffset(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[24]], ModelDragon.llIlIlIlIIllIl[6], ModelDragon.llIlIlIlIIllIl[21]);
        this.setTextureOffset(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[25]], ModelDragon.llIlIlIlIIllIl[26], ModelDragon.llIlIlIlIIllIl[21]);
        this.setTextureOffset(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[27]], ModelDragon.llIlIlIlIIllIl[28], ModelDragon.llIlIlIlIIllIl[29]);
        this.setTextureOffset(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[30]], ModelDragon.llIlIlIlIIllIl[31], ModelDragon.llIlIlIlIIllIl[32]);
        this.setTextureOffset(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[33]], ModelDragon.llIlIlIlIIllIl[1], ModelDragon.llIlIlIlIIllIl[1]);
        this.setTextureOffset(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[34]], ModelDragon.llIlIlIlIIllIl[35], ModelDragon.llIlIlIlIIllIl[1]);
        this.setTextureOffset(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[36]], ModelDragon.llIlIlIlIIllIl[9], ModelDragon.llIlIlIlIIllIl[1]);
        final float llllllllllllIllIlIlIIllIlIlIlllI = -16.0f;
        this.head = new ModelRenderer(this, ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[37]]);
        this.head.addBox(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[38]], -6.0f, -1.0f, -8.0f + llllllllllllIllIlIlIIllIlIlIlllI, ModelDragon.llIlIlIlIIllIl[24], ModelDragon.llIlIlIlIIllIl[10], ModelDragon.llIlIlIlIIllIl[33]);
        "".length();
        this.head.addBox(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[39]], -8.0f, -8.0f, 6.0f + llllllllllllIllIlIlIIllIlIlIlllI, ModelDragon.llIlIlIlIIllIl[33], ModelDragon.llIlIlIlIIllIl[33], ModelDragon.llIlIlIlIIllIl[33]);
        "".length();
        this.head.mirror = (ModelDragon.llIlIlIlIIllIl[2] != 0);
        this.head.addBox(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[40]], -5.0f, -12.0f, 12.0f + llllllllllllIllIlIlIIllIlIlIlllI, ModelDragon.llIlIlIlIIllIl[5], ModelDragon.llIlIlIlIIllIl[8], ModelDragon.llIlIlIlIIllIl[12]);
        "".length();
        this.head.addBox(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[41]], -5.0f, -3.0f, -6.0f + llllllllllllIllIlIlIIllIlIlIlllI, ModelDragon.llIlIlIlIIllIl[5], ModelDragon.llIlIlIlIIllIl[5], ModelDragon.llIlIlIlIIllIl[8]);
        "".length();
        this.head.mirror = (ModelDragon.llIlIlIlIIllIl[1] != 0);
        this.head.addBox(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[42]], 3.0f, -12.0f, 12.0f + llllllllllllIllIlIlIIllIlIlIlllI, ModelDragon.llIlIlIlIIllIl[5], ModelDragon.llIlIlIlIIllIl[8], ModelDragon.llIlIlIlIIllIl[12]);
        "".length();
        this.head.addBox(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[43]], 3.0f, -3.0f, -6.0f + llllllllllllIllIlIlIIllIlIlIlllI, ModelDragon.llIlIlIlIIllIl[5], ModelDragon.llIlIlIlIIllIl[5], ModelDragon.llIlIlIlIIllIl[8]);
        "".length();
        this.jaw = new ModelRenderer(this, ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[44]]);
        this.jaw.setRotationPoint(0.0f, 4.0f, 8.0f + llllllllllllIllIlIlIIllIlIlIlllI);
        this.jaw.addBox(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[45]], -6.0f, 0.0f, -16.0f, ModelDragon.llIlIlIlIIllIl[24], ModelDragon.llIlIlIlIIllIl[8], ModelDragon.llIlIlIlIIllIl[33]);
        "".length();
        this.head.addChild(this.jaw);
        this.spine = new ModelRenderer(this, ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[46]]);
        this.spine.addBox(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[47]], -5.0f, -5.0f, -5.0f, ModelDragon.llIlIlIlIIllIl[20], ModelDragon.llIlIlIlIIllIl[20], ModelDragon.llIlIlIlIIllIl[20]);
        "".length();
        this.spine.addBox(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[13]], -1.0f, -9.0f, -3.0f, ModelDragon.llIlIlIlIIllIl[5], ModelDragon.llIlIlIlIIllIl[8], ModelDragon.llIlIlIlIIllIl[12]);
        "".length();
        this.body = new ModelRenderer(this, ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[48]]);
        this.body.setRotationPoint(0.0f, 4.0f, 8.0f);
        this.body.addBox(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[49]], -12.0f, 0.0f, -16.0f, ModelDragon.llIlIlIlIIllIl[42], ModelDragon.llIlIlIlIIllIl[42], ModelDragon.llIlIlIlIIllIl[50]);
        "".length();
        this.body.addBox(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[51]], -1.0f, -6.0f, -10.0f, ModelDragon.llIlIlIlIIllIl[5], ModelDragon.llIlIlIlIIllIl[12], ModelDragon.llIlIlIlIIllIl[24]);
        "".length();
        this.body.addBox(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[52]], -1.0f, -6.0f, 10.0f, ModelDragon.llIlIlIlIIllIl[5], ModelDragon.llIlIlIlIIllIl[12], ModelDragon.llIlIlIlIIllIl[24]);
        "".length();
        this.body.addBox(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[53]], -1.0f, -6.0f, 30.0f, ModelDragon.llIlIlIlIIllIl[5], ModelDragon.llIlIlIlIIllIl[12], ModelDragon.llIlIlIlIIllIl[24]);
        "".length();
        this.wing = new ModelRenderer(this, ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[54]]);
        this.wing.setRotationPoint(-12.0f, 5.0f, 2.0f);
        this.wing.addBox(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[55]], -56.0f, -4.0f, -4.0f, ModelDragon.llIlIlIlIIllIl[56], ModelDragon.llIlIlIlIIllIl[15], ModelDragon.llIlIlIlIIllIl[15]);
        "".length();
        this.wing.addBox(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[57]], -56.0f, 0.0f, 2.0f, ModelDragon.llIlIlIlIIllIl[56], ModelDragon.llIlIlIlIIllIl[1], ModelDragon.llIlIlIlIIllIl[56]);
        "".length();
        this.wingTip = new ModelRenderer(this, ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[58]]);
        this.wingTip.setRotationPoint(-56.0f, 0.0f, 0.0f);
        this.wingTip.addBox(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[59]], -56.0f, -2.0f, -2.0f, ModelDragon.llIlIlIlIIllIl[56], ModelDragon.llIlIlIlIIllIl[8], ModelDragon.llIlIlIlIIllIl[8]);
        "".length();
        this.wingTip.addBox(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[60]], -56.0f, 0.0f, 2.0f, ModelDragon.llIlIlIlIIllIl[56], ModelDragon.llIlIlIlIIllIl[1], ModelDragon.llIlIlIlIIllIl[56]);
        "".length();
        this.wing.addChild(this.wingTip);
        this.frontLeg = new ModelRenderer(this, ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[61]]);
        this.frontLeg.setRotationPoint(-12.0f, 20.0f, 2.0f);
        this.frontLeg.addBox(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[62]], -4.0f, -4.0f, -4.0f, ModelDragon.llIlIlIlIIllIl[15], ModelDragon.llIlIlIlIIllIl[42], ModelDragon.llIlIlIlIIllIl[15]);
        "".length();
        this.frontLegTip = new ModelRenderer(this, ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[17]]);
        this.frontLegTip.setRotationPoint(0.0f, 20.0f, -1.0f);
        this.frontLegTip.addBox(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[63]], -3.0f, -1.0f, -3.0f, ModelDragon.llIlIlIlIIllIl[12], ModelDragon.llIlIlIlIIllIl[42], ModelDragon.llIlIlIlIIllIl[12]);
        "".length();
        this.frontLeg.addChild(this.frontLegTip);
        this.frontFoot = new ModelRenderer(this, ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[64]]);
        this.frontFoot.setRotationPoint(0.0f, 23.0f, 0.0f);
        this.frontFoot.addBox(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[65]], -4.0f, 0.0f, -12.0f, ModelDragon.llIlIlIlIIllIl[15], ModelDragon.llIlIlIlIIllIl[8], ModelDragon.llIlIlIlIIllIl[33]);
        "".length();
        this.frontLegTip.addChild(this.frontFoot);
        this.rearLeg = new ModelRenderer(this, ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[35]]);
        this.rearLeg.setRotationPoint(-16.0f, 16.0f, 42.0f);
        this.rearLeg.addBox(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[66]], -8.0f, -4.0f, -8.0f, ModelDragon.llIlIlIlIIllIl[33], ModelDragon.llIlIlIlIIllIl[49], ModelDragon.llIlIlIlIIllIl[33]);
        "".length();
        this.rearLegTip = new ModelRenderer(this, ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[67]]);
        this.rearLegTip.setRotationPoint(0.0f, 32.0f, -4.0f);
        this.rearLegTip.addBox(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[68]], -6.0f, -2.0f, 0.0f, ModelDragon.llIlIlIlIIllIl[24], ModelDragon.llIlIlIlIIllIl[49], ModelDragon.llIlIlIlIIllIl[24]);
        "".length();
        this.rearLeg.addChild(this.rearLegTip);
        this.rearFoot = new ModelRenderer(this, ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[69]]);
        this.rearFoot.setRotationPoint(0.0f, 31.0f, 4.0f);
        this.rearFoot.addBox(ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[32]], -9.0f, 0.0f, -20.0f, ModelDragon.llIlIlIlIIllIl[36], ModelDragon.llIlIlIlIIllIl[12], ModelDragon.llIlIlIlIIllIl[42]);
        "".length();
        this.rearLegTip.addChild(this.rearFoot);
    }
    
    private static int lIIlIlIIIlIllIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIIlIlIIIlIllIll(final int llllllllllllIllIlIlIIllIIIlIIlII) {
        return llllllllllllIllIlIlIIllIIIlIIlII >= 0;
    }
    
    private static boolean lIIlIlIIIlIlllII(final int llllllllllllIllIlIlIIllIIIlIlIIl, final int llllllllllllIllIlIlIIllIIIlIlIII) {
        return llllllllllllIllIlIlIIllIIIlIlIIl < llllllllllllIllIlIlIIllIIIlIlIII;
    }
    
    private static int lIIlIlIIIlIllIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static String lIIlIlIIIlIIIIll(String llllllllllllIllIlIlIIllIIIlllIII, final String llllllllllllIllIlIlIIllIIIllIlll) {
        llllllllllllIllIlIlIIllIIIlllIII = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIlIIllIIIlllIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIlIIllIIIlllIll = new StringBuilder();
        final char[] llllllllllllIllIlIlIIllIIIlllIlI = llllllllllllIllIlIlIIllIIIllIlll.toCharArray();
        int llllllllllllIllIlIlIIllIIIlllIIl = ModelDragon.llIlIlIlIIllIl[1];
        final String llllllllllllIllIlIlIIllIIIllIIll = (Object)((String)llllllllllllIllIlIlIIllIIIlllIII).toCharArray();
        final float llllllllllllIllIlIlIIllIIIllIIlI = llllllllllllIllIlIlIIllIIIllIIll.length;
        byte llllllllllllIllIlIlIIllIIIllIIIl = (byte)ModelDragon.llIlIlIlIIllIl[1];
        while (lIIlIlIIIlIlllII(llllllllllllIllIlIlIIllIIIllIIIl, (int)llllllllllllIllIlIlIIllIIIllIIlI)) {
            final char llllllllllllIllIlIlIIllIIIlllllI = llllllllllllIllIlIlIIllIIIllIIll[llllllllllllIllIlIlIIllIIIllIIIl];
            llllllllllllIllIlIlIIllIIIlllIll.append((char)(llllllllllllIllIlIlIIllIIIlllllI ^ llllllllllllIllIlIlIIllIIIlllIlI[llllllllllllIllIlIlIIllIIIlllIIl % llllllllllllIllIlIlIIllIIIlllIlI.length]));
            "".length();
            ++llllllllllllIllIlIlIIllIIIlllIIl;
            ++llllllllllllIllIlIlIIllIIIllIIIl;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIlIIllIIIlllIll);
    }
    
    private float updateRotations(double llllllllllllIllIlIlIIllIIllIIIlI) {
        "".length();
        if (-" ".length() >= (0x68 ^ 0x6C)) {
            return 0.0f;
        }
        while (!lIIlIlIIIlIllIlI(lIIlIlIIIlIllIII(llllllllllllIllIlIlIIllIIllIIIlI, 180.0))) {
            llllllllllllIllIlIlIIllIIllIIIlI -= 360.0;
        }
        "".length();
        if ((73 + 55 - 25 + 69 ^ 0 + 29 + 55 + 85) == 0x0) {
            return 0.0f;
        }
        while (!lIIlIlIIIlIllIll(lIIlIlIIIlIllIIl(llllllllllllIllIlIlIIllIIllIIIlI, -180.0))) {
            llllllllllllIllIlIlIIllIIllIIIlI += 360.0;
        }
        return (float)llllllllllllIllIlIlIIllIIllIIIlI;
    }
    
    private static boolean lIIlIlIIIlIlIllI(final int llllllllllllIllIlIlIIllIIIlIllIl, final int llllllllllllIllIlIlIIllIIIlIllII) {
        return llllllllllllIllIlIlIIllIIIlIllIl >= llllllllllllIllIlIlIIllIIIlIllII;
    }
    
    private static String lIIlIlIIIlIIIlIl(final String llllllllllllIllIlIlIIllIIlIllIlI, final String llllllllllllIllIlIlIIllIIlIllIIl) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIIllIIlIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIIllIIlIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIlIIllIIlIlllII = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIlIIllIIlIlllII.init(ModelDragon.llIlIlIlIIllIl[5], llllllllllllIllIlIlIIllIIlIlllIl);
            return new String(llllllllllllIllIlIlIIllIIlIlllII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIIllIIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIIllIIlIllIll) {
            llllllllllllIllIlIlIIllIIlIllIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void setLivingAnimations(final EntityLivingBase llllllllllllIllIlIlIIllIlIlIlIII, final float llllllllllllIllIlIlIIllIlIlIIlll, final float llllllllllllIllIlIlIIllIlIlIIllI, final float llllllllllllIllIlIlIIllIlIlIIlIl) {
        this.partialTicks = llllllllllllIllIlIlIIllIlIlIIlIl;
    }
    
    private static void lIIlIlIIIlIlIIIl() {
        (llIlIlIlIIlIIl = new String[ModelDragon.llIlIlIlIIllIl[72]])[ModelDragon.llIlIlIlIIllIl[1]] = lIIlIlIIIlIIIIll("GiQnKnsaJCcq", "xKCSU");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[2]] = lIIlIlIIIlIIIIll("MTg4AGw1Oj8J", "FQVgB");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[5]] = lIIlIlIIIlIIIIll("Lh0BFAcwBEEAGDAa", "Ytoss");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[7]] = lIIlIlIIIlIIIIll("Oi0bPQstL1QiBiEm", "HHzOg");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[8]] = lIIlIlIIIlIIIIll("GAIYEwgFCA1PAwsOFw==", "jgyan");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[10]] = lIIlIlIIIlIIIlII("z25nLVN8iFFadM7Aw0dXIg==", "vZuvd");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[12]] = lIIlIlIIIlIIIIll("IyI0LHk+NyUtJSMiNCw=", "KGUHW");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[14]] = lIIlIlIIIlIIIIll("DjMcDEwbNRwO", "yZrkb");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[15]] = lIIlIlIIIlIIIlIl("zWCcoDJsw26gVN5nMC5qzA==", "FxZMH");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[18]] = lIIlIlIIIlIIIlIl("BunLGDMUpAY=", "mbEgU");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[20]] = lIIlIlIIIlIIIlII("MS2qDQQuewZaceVe3+iLeA==", "nPlHE");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[22]] = lIIlIlIIIlIIIIll("EgslPRIMEmU4CQsH", "ebKZf");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[24]] = lIIlIlIIIlIIIIll("MCEFCDwwPAUSZjsyAwg=", "VSjfH");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[25]] = lIIlIlIIIlIIIIll("BCQFIngILh4=", "jAfIV");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[27]] = lIIlIlIIIlIIIlIl("5OV7vjAcZd5rl0xrFggmUtjybPIsRhpw", "dqADc");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[30]] = lIIlIlIIIlIIIlII("HH9HE+alOtWtWNe0oy7/Lw==", "xsZUY");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[33]] = lIIlIlIIIlIIIlII("p3343J/GeOQ8U/H0gHxiQA==", "nlwLV");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[34]] = lIIlIlIIIlIIIIll("KSQxMm80IjM1JA==", "GARYA");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[36]] = lIIlIlIIIlIIIlII("DUqtvM6Eo37IDKGRnj7N5A==", "DAqjW");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[37]] = lIIlIlIIIlIIIlII("iABVCw9e6uw=", "aKqGt");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[38]] = lIIlIlIIIlIIIlII("QDvJZJhPPlKy9CTBn48Png==", "CbPbq");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[39]] = lIIlIlIIIlIIIlII("ozTmL6ek5JFrfezhay+oJg==", "XoUAh");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[40]] = lIIlIlIIIlIIIlII("g84IgUvLpsI=", "gMPsQ");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[41]] = lIIlIlIIIlIIIlII("yAJ5KbKS4BY=", "UIlBN");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[42]] = lIIlIlIIIlIIIlII("vdFrIJgKd4Y=", "ziZyD");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[43]] = lIIlIlIIIlIIIlII("Fo3t7QArc6Q=", "pQwcO");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[44]] = lIIlIlIIIlIIIlIl("LDNJCFNaBls=", "szpde");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[45]] = lIIlIlIIIlIIIIll("BBI7", "nsLGo");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[46]] = lIIlIlIIIlIIIlII("Nt9AUm8bEdI=", "qfjAl");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[47]] = lIIlIlIIIlIIIlIl("+noLmGZEVBE=", "NXEch");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[13]] = lIIlIlIIIlIIIlII("4vYuydWYLbE=", "sfBGv");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[48]] = lIIlIlIIIlIIIlIl("huIrZ2WK4X4=", "COWUg");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[49]] = lIIlIlIIIlIIIlIl("8jF4iknWM5Y=", "rxsSx");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[51]] = lIIlIlIIIlIIIlII("5UYqzU4qyHs=", "EXyTZ");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[52]] = lIIlIlIIIlIIIIll("AiA7LxI=", "qCZCw");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[53]] = lIIlIlIIIlIIIlII("/d5bK9ytock=", "gxEZS");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[54]] = lIIlIlIIIlIIIlIl("QPMN7lPLWdI=", "zOchW");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[55]] = lIIlIlIIIlIIIlIl("L7nnDcO2iSM=", "GKrVb");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[57]] = lIIlIlIIIlIIIlIl("HFkJYR0Xrco=", "ItBph");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[58]] = lIIlIlIIIlIIIIll("MSQIDj0vPQ==", "FMfiI");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[59]] = lIIlIlIIIlIIIlII("AorDU/zN4bQ=", "nkACR");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[60]] = lIIlIlIIIlIIIlII("cUfPbai6i0U=", "Mgcny");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[61]] = lIIlIlIIIlIIIIll("LSIENgYnNQw=", "KPkXr");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[62]] = lIIlIlIIIlIIIIll("Agw7Lw==", "omRAq");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[17]] = lIIlIlIIIlIIIlII("CQ/RrDIxnZ2D8WuaQjfsGw==", "oXIkH");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[63]] = lIIlIlIIIlIIIlII("uzP5HD6BPcA=", "RXoAk");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[64]] = lIIlIlIIIlIIIlII("1mYvm7GuZmzNUu7+qBdINg==", "SpYQX");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[65]] = lIIlIlIIIlIIIlIl("X3HsNYTb104=", "SWemk");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[35]] = lIIlIlIIIlIIIlII("fGTDLK3bYDQ=", "NRYwL");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[66]] = lIIlIlIIIlIIIlII("FUkrjOR5N24=", "SdVAh");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[67]] = lIIlIlIIIlIIIIll("FSA0Gi4CIiEBMg==", "gEUhB");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[68]] = lIIlIlIIIlIIIIll("HQksGg==", "phEtU");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[69]] = lIIlIlIIIlIIIIll("AwIlPiQeCDA=", "qgDLB");
        ModelDragon.llIlIlIlIIlIIl[ModelDragon.llIlIlIlIIllIl[32]] = lIIlIlIIIlIIIlII("7waWFn6fb2g=", "gRDzs");
    }
    
    private static void lIIlIlIIIlIlIlIl() {
        (llIlIlIlIIllIl = new int[73])[0] = (0xFFFFA122 & 0x5FDD);
        ModelDragon.llIlIlIlIIllIl[1] = ((0xA8 ^ 0x98) & ~(0x51 ^ 0x61));
        ModelDragon.llIlIlIlIIllIl[2] = " ".length();
        ModelDragon.llIlIlIlIIllIl[3] = -(0x8B ^ 0xB3);
        ModelDragon.llIlIlIlIIllIl[4] = (0xF0 ^ 0x99 ^ (0x13 ^ 0x22));
        ModelDragon.llIlIlIlIIllIl[5] = "  ".length();
        ModelDragon.llIlIlIlIIllIl[6] = (0x3B ^ 0x6A) + (0xBD ^ 0x9A) - -(0xD4 ^ 0xC2) + "  ".length();
        ModelDragon.llIlIlIlIIllIl[7] = "   ".length();
        ModelDragon.llIlIlIlIIllIl[8] = (0x24 ^ 0x7D ^ (0xCA ^ 0x97));
        ModelDragon.llIlIlIlIIllIl[9] = (152 + 163 - 104 + 31 ^ 38 + 102 - 125 + 115);
        ModelDragon.llIlIlIlIIllIl[10] = (0x7D ^ 0x17 ^ (0xA ^ 0x65));
        ModelDragon.llIlIlIlIIllIl[11] = 24 + 77 - 12 + 65 + (0x1F ^ 0xF) - (93 + 27 - 58 + 72) + (149 + 87 - 141 + 65);
        ModelDragon.llIlIlIlIIllIl[12] = (0x42 ^ 0x3C ^ (0x1B ^ 0x63));
        ModelDragon.llIlIlIlIIllIl[13] = (0x55 ^ 0x4B);
        ModelDragon.llIlIlIlIIllIl[14] = (0xAB ^ 0xAC);
        ModelDragon.llIlIlIlIIllIl[15] = (0x7A ^ 0x72);
        ModelDragon.llIlIlIlIIllIl[16] = 44 + 174 - 85 + 43;
        ModelDragon.llIlIlIlIIllIl[17] = (0xB9 ^ 0x8D ^ (0x10 ^ 0x8));
        ModelDragon.llIlIlIlIIllIl[18] = (0x3E ^ 0x37);
        ModelDragon.llIlIlIlIIllIl[19] = (0xE3 ^ 0x97 ^ (0x66 ^ 0x53));
        ModelDragon.llIlIlIlIIllIl[20] = (0x36 ^ 0x3C);
        ModelDragon.llIlIlIlIIllIl[21] = (0x62 ^ 0xA);
        ModelDragon.llIlIlIlIIllIl[22] = (0xB9 ^ 0xB2);
        ModelDragon.llIlIlIlIIllIl[23] = 35 + 31 + 8 + 55 + (0x5B ^ 0x45) - (0xEA ^ 0x9E) + (0xC1 ^ 0x9C);
        ModelDragon.llIlIlIlIIllIl[24] = (0x69 ^ 0x65);
        ModelDragon.llIlIlIlIIllIl[25] = (0x78 ^ 0x75);
        ModelDragon.llIlIlIlIIllIl[26] = (0x88 ^ 0x85) + (0x4C ^ 0x74) - (0x36 ^ 0xE) + (147 + 16 + 8 + 8);
        ModelDragon.llIlIlIlIIllIl[27] = (0x30 ^ 0x1B ^ (0xB5 ^ 0x90));
        ModelDragon.llIlIlIlIIllIl[28] = 71 + 102 - 54 + 107;
        ModelDragon.llIlIlIlIIllIl[29] = (0x19 ^ 0xA) + (0x9A ^ 0x84) - (0x94 ^ 0xA4) + (62 + 6 + 66 + 3);
        ModelDragon.llIlIlIlIIllIl[30] = (27 + 95 + 4 + 80 ^ 122 + 162 - 180 + 89);
        ModelDragon.llIlIlIlIIllIl[31] = 44 + 138 - 161 + 199;
        ModelDragon.llIlIlIlIIllIl[32] = (0x70 ^ 0x45);
        ModelDragon.llIlIlIlIIllIl[33] = (0x2A ^ 0x3A);
        ModelDragon.llIlIlIlIIllIl[34] = (0x60 ^ 0x71);
        ModelDragon.llIlIlIlIIllIl[35] = (0x6A ^ 0x5A);
        ModelDragon.llIlIlIlIIllIl[36] = (0x58 ^ 0x4A);
        ModelDragon.llIlIlIlIIllIl[37] = (63 + 99 - 55 + 39 ^ 42 + 35 - 8 + 60);
        ModelDragon.llIlIlIlIIllIl[38] = (0xA7 ^ 0xB3);
        ModelDragon.llIlIlIlIIllIl[39] = (0x37 ^ 0x22);
        ModelDragon.llIlIlIlIIllIl[40] = (0x20 ^ 0x5E ^ (0xF3 ^ 0x9B));
        ModelDragon.llIlIlIlIIllIl[41] = (0x67 ^ 0x70);
        ModelDragon.llIlIlIlIIllIl[42] = (169 + 30 - 118 + 141 ^ 55 + 167 - 185 + 161);
        ModelDragon.llIlIlIlIIllIl[43] = (0x19 ^ 0x0);
        ModelDragon.llIlIlIlIIllIl[44] = (0x98 ^ 0x82);
        ModelDragon.llIlIlIlIIllIl[45] = (0x46 ^ 0x5D);
        ModelDragon.llIlIlIlIIllIl[46] = (0xB8 ^ 0x9D ^ (0xA9 ^ 0x90));
        ModelDragon.llIlIlIlIIllIl[47] = (0x43 ^ 0x69 ^ (0x50 ^ 0x67));
        ModelDragon.llIlIlIlIIllIl[48] = (0x4 ^ 0x1B);
        ModelDragon.llIlIlIlIIllIl[49] = (0x65 ^ 0x45);
        ModelDragon.llIlIlIlIIllIl[50] = (0x58 ^ 0x18);
        ModelDragon.llIlIlIlIIllIl[51] = (0xFA ^ 0xC2 ^ (0xDB ^ 0xC2));
        ModelDragon.llIlIlIlIIllIl[52] = (0xCA ^ 0xBA ^ (0xF0 ^ 0xA2));
        ModelDragon.llIlIlIlIIllIl[53] = (0x2 ^ 0x21);
        ModelDragon.llIlIlIlIIllIl[54] = (0xA ^ 0x2E);
        ModelDragon.llIlIlIlIIllIl[55] = (133 + 84 - 140 + 73 ^ 29 + 12 - 2 + 140);
        ModelDragon.llIlIlIlIIllIl[56] = (0xAE ^ 0x96);
        ModelDragon.llIlIlIlIIllIl[57] = (0x4 ^ 0x22);
        ModelDragon.llIlIlIlIIllIl[58] = (0x22 ^ 0x5);
        ModelDragon.llIlIlIlIIllIl[59] = (0x47 ^ 0x6F);
        ModelDragon.llIlIlIlIIllIl[60] = (4 + 21 + 17 + 90 ^ 132 + 39 - 36 + 38);
        ModelDragon.llIlIlIlIIllIl[61] = (0xA2 ^ 0x88);
        ModelDragon.llIlIlIlIIllIl[62] = (68 + 99 - 151 + 117 ^ 19 + 134 - 24 + 45);
        ModelDragon.llIlIlIlIIllIl[63] = (0x95 ^ 0xB8);
        ModelDragon.llIlIlIlIIllIl[64] = (0x3F ^ 0x5D ^ (0xF2 ^ 0xBE));
        ModelDragon.llIlIlIlIIllIl[65] = (0x7D ^ 0x52);
        ModelDragon.llIlIlIlIIllIl[66] = (82 + 175 - 152 + 76 ^ 29 + 93 - 16 + 26);
        ModelDragon.llIlIlIlIIllIl[67] = (0x2F ^ 0x11 ^ (0xCF ^ 0xC3));
        ModelDragon.llIlIlIlIIllIl[68] = (0x83 ^ 0xB0);
        ModelDragon.llIlIlIlIIllIl[69] = (0xA ^ 0x4B ^ (0x2E ^ 0x5B));
        ModelDragon.llIlIlIlIIllIl[70] = (0xFFFFA6C7 & 0x5D3C);
        ModelDragon.llIlIlIlIIllIl[71] = (-(0xFFFFF2BB & 0x1FEF) & (0xFFFF96FF & 0x7FAF));
        ModelDragon.llIlIlIlIIllIl[72] = (188 + 18 - 69 + 106 ^ 81 + 94 - 123 + 145);
    }
    
    static {
        lIIlIlIIIlIlIlIl();
        lIIlIlIIIlIlIIIl();
    }
    
    private static boolean lIIlIlIIIlIllIlI(final int llllllllllllIllIlIlIIllIIIlIIIlI) {
        return llllllllllllIllIlIlIIllIIIlIIIlI < 0;
    }
    
    private static boolean lIIlIlIIIlIlIlll(final int llllllllllllIllIlIlIIllIIIlIIllI) {
        return llllllllllllIllIlIlIIllIIIlIIllI == 0;
    }
    
    @Override
    public void render(final Entity llllllllllllIllIlIlIIllIlIIlIIII, final float llllllllllllIllIlIlIIllIlIIIllll, final float llllllllllllIllIlIlIIllIlIIIlllI, final float llllllllllllIllIlIlIIllIlIIIllIl, final float llllllllllllIllIlIlIIllIlIIIllII, final float llllllllllllIllIlIlIIllIlIIIlIll, final float llllllllllllIllIlIlIIllIlIIIlIlI) {
        GlStateManager.pushMatrix();
        final EntityDragon llllllllllllIllIlIlIIllIlIIIlIIl = (EntityDragon)llllllllllllIllIlIlIIllIlIIlIIII;
        final float llllllllllllIllIlIlIIllIlIIIlIII = llllllllllllIllIlIlIIllIlIIIlIIl.prevAnimTime + (llllllllllllIllIlIlIIllIlIIIlIIl.animTime - llllllllllllIllIlIlIIllIlIIIlIIl.prevAnimTime) * this.partialTicks;
        this.jaw.rotateAngleX = (float)(Math.sin(llllllllllllIllIlIlIIllIlIIIlIII * 3.1415927f * 2.0f) + 1.0) * 0.2f;
        float llllllllllllIllIlIlIIllIlIIIIlll = (float)(Math.sin(llllllllllllIllIlIlIIllIlIIIlIII * 3.1415927f * 2.0f - 1.0f) + 1.0);
        llllllllllllIllIlIlIIllIlIIIIlll = (llllllllllllIllIlIlIIllIlIIIIlll * llllllllllllIllIlIlIIllIlIIIIlll * 1.0f + llllllllllllIllIlIlIIllIlIIIIlll * 2.0f) * 0.05f;
        GlStateManager.translate(0.0f, llllllllllllIllIlIlIIllIlIIIIlll - 2.0f, -3.0f);
        GlStateManager.rotate(llllllllllllIllIlIlIIllIlIIIIlll * 2.0f, 1.0f, 0.0f, 0.0f);
        float llllllllllllIllIlIlIIllIlIIIIllI = -30.0f;
        float llllllllllllIllIlIlIIllIlIIIIlIl = 0.0f;
        final float llllllllllllIllIlIlIIllIlIIIIlII = 1.5f;
        double[] llllllllllllIllIlIlIIllIlIIIIIll = llllllllllllIllIlIlIIllIlIIIlIIl.getMovementOffsets(ModelDragon.llIlIlIlIIllIl[12], this.partialTicks);
        final float llllllllllllIllIlIlIIllIlIIIIIlI = this.updateRotations(llllllllllllIllIlIlIIllIlIIIlIIl.getMovementOffsets(ModelDragon.llIlIlIlIIllIl[10], this.partialTicks)[ModelDragon.llIlIlIlIIllIl[1]] - llllllllllllIllIlIlIIllIlIIIlIIl.getMovementOffsets(ModelDragon.llIlIlIlIIllIl[20], this.partialTicks)[ModelDragon.llIlIlIlIIllIl[1]]);
        final float llllllllllllIllIlIlIIllIlIIIIIIl = this.updateRotations(llllllllllllIllIlIlIIllIlIIIlIIl.getMovementOffsets(ModelDragon.llIlIlIlIIllIl[10], this.partialTicks)[ModelDragon.llIlIlIlIIllIl[1]] + llllllllllllIllIlIlIIllIlIIIIIlI / 2.0f);
        llllllllllllIllIlIlIIllIlIIIIllI += 2.0f;
        float llllllllllllIllIlIlIIllIlIIIIIII = llllllllllllIllIlIlIIllIlIIIlIII * 3.1415927f * 2.0f;
        llllllllllllIllIlIlIIllIlIIIIllI = 20.0f;
        float llllllllllllIllIlIlIIllIIlllllll = -12.0f;
        int llllllllllllIllIlIlIIllIIllllllI = ModelDragon.llIlIlIlIIllIl[1];
        "".length();
        if (((" ".length() ^ (0x6E ^ 0x27)) & (225 + 223 - 444 + 247 ^ 118 + 69 - 49 + 41 ^ -" ".length())) == " ".length()) {
            return;
        }
        while (!lIIlIlIIIlIlIllI(llllllllllllIllIlIlIIllIIllllllI, ModelDragon.llIlIlIlIIllIl[10])) {
            final double[] llllllllllllIllIlIlIIllIIlllllIl = llllllllllllIllIlIlIIllIlIIIlIIl.getMovementOffsets(ModelDragon.llIlIlIlIIllIl[10] - llllllllllllIllIlIlIIllIIllllllI, this.partialTicks);
            final float llllllllllllIllIlIlIIllIIlllllII = (float)Math.cos(llllllllllllIllIlIlIIllIIllllllI * 0.45f + llllllllllllIllIlIlIIllIlIIIIIII) * 0.15f;
            this.spine.rotateAngleY = this.updateRotations(llllllllllllIllIlIlIIllIIlllllIl[ModelDragon.llIlIlIlIIllIl[1]] - llllllllllllIllIlIlIIllIlIIIIIll[ModelDragon.llIlIlIlIIllIl[1]]) * 3.1415927f / 180.0f * llllllllllllIllIlIlIIllIlIIIIlII;
            this.spine.rotateAngleX = llllllllllllIllIlIlIIllIIlllllII + (float)(llllllllllllIllIlIlIIllIIlllllIl[ModelDragon.llIlIlIlIIllIl[2]] - llllllllllllIllIlIlIIllIlIIIIIll[ModelDragon.llIlIlIlIIllIl[2]]) * 3.1415927f / 180.0f * llllllllllllIllIlIlIIllIlIIIIlII * 5.0f;
            this.spine.rotateAngleZ = -this.updateRotations(llllllllllllIllIlIlIIllIIlllllIl[ModelDragon.llIlIlIlIIllIl[1]] - llllllllllllIllIlIlIIllIlIIIIIIl) * 3.1415927f / 180.0f * llllllllllllIllIlIlIIllIlIIIIlII;
            this.spine.rotationPointY = llllllllllllIllIlIlIIllIlIIIIllI;
            this.spine.rotationPointZ = llllllllllllIllIlIlIIllIIlllllll;
            this.spine.rotationPointX = llllllllllllIllIlIlIIllIlIIIIlIl;
            llllllllllllIllIlIlIIllIlIIIIllI += (float)(Math.sin(this.spine.rotateAngleX) * 10.0);
            llllllllllllIllIlIlIIllIIlllllll -= (float)(Math.cos(this.spine.rotateAngleY) * Math.cos(this.spine.rotateAngleX) * 10.0);
            llllllllllllIllIlIlIIllIlIIIIlIl -= (float)(Math.sin(this.spine.rotateAngleY) * Math.cos(this.spine.rotateAngleX) * 10.0);
            this.spine.render(llllllllllllIllIlIlIIllIlIIIlIlI);
            ++llllllllllllIllIlIlIIllIIllllllI;
        }
        this.head.rotationPointY = llllllllllllIllIlIlIIllIlIIIIllI;
        this.head.rotationPointZ = llllllllllllIllIlIlIIllIIlllllll;
        this.head.rotationPointX = llllllllllllIllIlIlIIllIlIIIIlIl;
        double[] llllllllllllIllIlIlIIllIIllllIll = llllllllllllIllIlIlIIllIlIIIlIIl.getMovementOffsets(ModelDragon.llIlIlIlIIllIl[1], this.partialTicks);
        this.head.rotateAngleY = this.updateRotations(llllllllllllIllIlIlIIllIIllllIll[ModelDragon.llIlIlIlIIllIl[1]] - llllllllllllIllIlIlIIllIlIIIIIll[ModelDragon.llIlIlIlIIllIl[1]]) * 3.1415927f / 180.0f * 1.0f;
        this.head.rotateAngleZ = -this.updateRotations(llllllllllllIllIlIlIIllIIllllIll[ModelDragon.llIlIlIlIIllIl[1]] - llllllllllllIllIlIlIIllIlIIIIIIl) * 3.1415927f / 180.0f * 1.0f;
        this.head.render(llllllllllllIllIlIlIIllIlIIIlIlI);
        GlStateManager.pushMatrix();
        GlStateManager.translate(0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(-llllllllllllIllIlIlIIllIlIIIIIlI * llllllllllllIllIlIlIIllIlIIIIlII * 1.0f, 0.0f, 0.0f, 1.0f);
        GlStateManager.translate(0.0f, -1.0f, 0.0f);
        this.body.rotateAngleZ = 0.0f;
        this.body.render(llllllllllllIllIlIlIIllIlIIIlIlI);
        int llllllllllllIllIlIlIIllIIllllIlI = ModelDragon.llIlIlIlIIllIl[1];
        "".length();
        if ("  ".length() == 0) {
            return;
        }
        while (!lIIlIlIIIlIlIllI(llllllllllllIllIlIlIIllIIllllIlI, ModelDragon.llIlIlIlIIllIl[5])) {
            GlStateManager.enableCull();
            final float llllllllllllIllIlIlIIllIIllllIIl = llllllllllllIllIlIlIIllIlIIIlIII * 3.1415927f * 2.0f;
            this.wing.rotateAngleX = 0.125f - (float)Math.cos(llllllllllllIllIlIlIIllIIllllIIl) * 0.2f;
            this.wing.rotateAngleY = 0.25f;
            this.wing.rotateAngleZ = (float)(Math.sin(llllllllllllIllIlIlIIllIIllllIIl) + 0.125) * 0.8f;
            this.wingTip.rotateAngleZ = -(float)(Math.sin(llllllllllllIllIlIlIIllIIllllIIl + 2.0f) + 0.5) * 0.75f;
            this.rearLeg.rotateAngleX = 1.0f + llllllllllllIllIlIlIIllIlIIIIlll * 0.1f;
            this.rearLegTip.rotateAngleX = 0.5f + llllllllllllIllIlIlIIllIlIIIIlll * 0.1f;
            this.rearFoot.rotateAngleX = 0.75f + llllllllllllIllIlIlIIllIlIIIIlll * 0.1f;
            this.frontLeg.rotateAngleX = 1.3f + llllllllllllIllIlIlIIllIlIIIIlll * 0.1f;
            this.frontLegTip.rotateAngleX = -0.5f - llllllllllllIllIlIlIIllIlIIIIlll * 0.1f;
            this.frontFoot.rotateAngleX = 0.75f + llllllllllllIllIlIlIIllIlIIIIlll * 0.1f;
            this.wing.render(llllllllllllIllIlIlIIllIlIIIlIlI);
            this.frontLeg.render(llllllllllllIllIlIlIIllIlIIIlIlI);
            this.rearLeg.render(llllllllllllIllIlIlIIllIlIIIlIlI);
            GlStateManager.scale(-1.0f, 1.0f, 1.0f);
            if (lIIlIlIIIlIlIlll(llllllllllllIllIlIlIIllIIllllIlI)) {
                GlStateManager.cullFace(ModelDragon.llIlIlIlIIllIl[70]);
            }
            ++llllllllllllIllIlIlIIllIIllllIlI;
        }
        GlStateManager.popMatrix();
        GlStateManager.cullFace(ModelDragon.llIlIlIlIIllIl[71]);
        GlStateManager.disableCull();
        float llllllllllllIllIlIlIIllIIllllIII = -(float)Math.sin(llllllllllllIllIlIlIIllIlIIIlIII * 3.1415927f * 2.0f) * 0.0f;
        llllllllllllIllIlIlIIllIlIIIIIII = llllllllllllIllIlIlIIllIlIIIlIII * 3.1415927f * 2.0f;
        llllllllllllIllIlIlIIllIlIIIIllI = 10.0f;
        llllllllllllIllIlIlIIllIIlllllll = 60.0f;
        llllllllllllIllIlIlIIllIlIIIIlIl = 0.0f;
        llllllllllllIllIlIlIIllIlIIIIIll = llllllllllllIllIlIlIIllIlIIIlIIl.getMovementOffsets(ModelDragon.llIlIlIlIIllIl[22], this.partialTicks);
        int llllllllllllIllIlIlIIllIIlllIlll = ModelDragon.llIlIlIlIIllIl[1];
        "".length();
        if (((0xDB ^ 0x88) & ~(0xD0 ^ 0x83)) != 0x0) {
            return;
        }
        while (!lIIlIlIIIlIlIllI(llllllllllllIllIlIlIIllIIlllIlll, ModelDragon.llIlIlIlIIllIl[24])) {
            llllllllllllIllIlIlIIllIIllllIll = llllllllllllIllIlIlIIllIlIIIlIIl.getMovementOffsets(ModelDragon.llIlIlIlIIllIl[24] + llllllllllllIllIlIlIIllIIlllIlll, this.partialTicks);
            llllllllllllIllIlIlIIllIIllllIII += (float)(Math.sin(llllllllllllIllIlIlIIllIIlllIlll * 0.45f + llllllllllllIllIlIlIIllIlIIIIIII) * 0.05000000074505806);
            this.spine.rotateAngleY = (this.updateRotations(llllllllllllIllIlIlIIllIIllllIll[ModelDragon.llIlIlIlIIllIl[1]] - llllllllllllIllIlIlIIllIlIIIIIll[ModelDragon.llIlIlIlIIllIl[1]]) * llllllllllllIllIlIlIIllIlIIIIlII + 180.0f) * 3.1415927f / 180.0f;
            this.spine.rotateAngleX = llllllllllllIllIlIlIIllIIllllIII + (float)(llllllllllllIllIlIlIIllIIllllIll[ModelDragon.llIlIlIlIIllIl[2]] - llllllllllllIllIlIlIIllIlIIIIIll[ModelDragon.llIlIlIlIIllIl[2]]) * 3.1415927f / 180.0f * llllllllllllIllIlIlIIllIlIIIIlII * 5.0f;
            this.spine.rotateAngleZ = this.updateRotations(llllllllllllIllIlIlIIllIIllllIll[ModelDragon.llIlIlIlIIllIl[1]] - llllllllllllIllIlIlIIllIlIIIIIIl) * 3.1415927f / 180.0f * llllllllllllIllIlIlIIllIlIIIIlII;
            this.spine.rotationPointY = llllllllllllIllIlIlIIllIlIIIIllI;
            this.spine.rotationPointZ = llllllllllllIllIlIlIIllIIlllllll;
            this.spine.rotationPointX = llllllllllllIllIlIlIIllIlIIIIlIl;
            llllllllllllIllIlIlIIllIlIIIIllI += (float)(Math.sin(this.spine.rotateAngleX) * 10.0);
            llllllllllllIllIlIlIIllIIlllllll -= (float)(Math.cos(this.spine.rotateAngleY) * Math.cos(this.spine.rotateAngleX) * 10.0);
            llllllllllllIllIlIlIIllIlIIIIlIl -= (float)(Math.sin(this.spine.rotateAngleY) * Math.cos(this.spine.rotateAngleX) * 10.0);
            this.spine.render(llllllllllllIllIlIlIIllIlIIIlIlI);
            ++llllllllllllIllIlIlIIllIIlllIlll;
        }
        GlStateManager.popMatrix();
    }
    
    private static String lIIlIlIIIlIIIlII(final String llllllllllllIllIlIlIIllIIlIIllIl, final String llllllllllllIllIlIlIIllIIlIIlIlI) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIIllIIlIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIIllIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), ModelDragon.llIlIlIlIIllIl[15]), "DES");
            final Cipher llllllllllllIllIlIlIIllIIlIIllll = Cipher.getInstance("DES");
            llllllllllllIllIlIlIIllIIlIIllll.init(ModelDragon.llIlIlIlIIllIl[5], llllllllllllIllIlIlIIllIIlIlIIII);
            return new String(llllllllllllIllIlIlIIllIIlIIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIIllIIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIIllIIlIIlllI) {
            llllllllllllIllIlIlIIllIIlIIlllI.printStackTrace();
            return null;
        }
    }
}
