// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.Entity;

public class ModelHorse extends ModelBase
{
    private /* synthetic */ ModelRenderer frontRightLeg;
    private /* synthetic */ ModelRenderer horseRightEar;
    private /* synthetic */ ModelRenderer muleRightEar;
    private /* synthetic */ ModelRenderer horseRightFaceMetal;
    private /* synthetic */ ModelRenderer body;
    private /* synthetic */ ModelRenderer horseRightRein;
    private /* synthetic */ ModelRenderer mane;
    private /* synthetic */ ModelRenderer neck;
    private /* synthetic */ ModelRenderer horseLeftFaceMetal;
    private /* synthetic */ ModelRenderer tailMiddle;
    private /* synthetic */ ModelRenderer horseSaddleFront;
    private /* synthetic */ ModelRenderer tailBase;
    private /* synthetic */ ModelRenderer field_178711_b;
    private /* synthetic */ ModelRenderer field_178712_c;
    private /* synthetic */ ModelRenderer horseSaddleBack;
    private /* synthetic */ ModelRenderer tailTip;
    private static final /* synthetic */ int[] lllIIllIlIIlIl;
    private /* synthetic */ ModelRenderer frontLeftLeg;
    private /* synthetic */ ModelRenderer frontLeftShin;
    private /* synthetic */ ModelRenderer horseLeftSaddleMetal;
    private /* synthetic */ ModelRenderer frontRightHoof;
    private /* synthetic */ ModelRenderer backRightHoof;
    private /* synthetic */ ModelRenderer horseLeftEar;
    private /* synthetic */ ModelRenderer horseLeftSaddleRope;
    private /* synthetic */ ModelRenderer muleRightChest;
    private /* synthetic */ ModelRenderer horseSaddleBottom;
    private /* synthetic */ ModelRenderer backRightLeg;
    private /* synthetic */ ModelRenderer muleLeftEar;
    private /* synthetic */ ModelRenderer backLeftShin;
    private /* synthetic */ ModelRenderer horseLeftRein;
    private /* synthetic */ ModelRenderer horseRightSaddleRope;
    private /* synthetic */ ModelRenderer horseFaceRopes;
    private /* synthetic */ ModelRenderer head;
    private /* synthetic */ ModelRenderer horseRightSaddleMetal;
    private /* synthetic */ ModelRenderer backRightShin;
    private /* synthetic */ ModelRenderer muleLeftChest;
    private /* synthetic */ ModelRenderer frontLeftHoof;
    private /* synthetic */ ModelRenderer backLeftLeg;
    private /* synthetic */ ModelRenderer backLeftHoof;
    private /* synthetic */ ModelRenderer frontRightShin;
    
    private float updateHorseRotation(final float llllllllllllIlIllllIIIIIIIIlIlII, final float llllllllllllIlIllllIIIIIIIIlIIll, final float llllllllllllIlIllllIIIIIIIIlIIlI) {
        float llllllllllllIlIllllIIIIIIIIlIIIl = llllllllllllIlIllllIIIIIIIIlIIll - llllllllllllIlIllllIIIIIIIIlIlII;
        "".length();
        if (null != null) {
            return 0.0f;
        }
        while (!lIlIIIIIIlIllIll(lIlIIIIIIlIllIIl(llllllllllllIlIllllIIIIIIIIlIIIl, -180.0f))) {
            llllllllllllIlIllllIIIIIIIIlIIIl += 360.0f;
        }
        "".length();
        if (-" ".length() > 0) {
            return 0.0f;
        }
        while (!lIlIIIIIIlIlllII(lIlIIIIIIlIllIlI(llllllllllllIlIllllIIIIIIIIlIIIl, 180.0f))) {
            llllllllllllIlIllllIIIIIIIIlIIIl -= 360.0f;
        }
        return llllllllllllIlIllllIIIIIIIIlIlII + llllllllllllIlIllllIIIIIIIIlIIlI * llllllllllllIlIllllIIIIIIIIlIIIl;
    }
    
    private static boolean lIlIIIIIIlIlIlIl(final int llllllllllllIlIlllIlllllIllIllIl, final int llllllllllllIlIlllIlllllIllIllII) {
        return llllllllllllIlIlllIlllllIllIllIl != llllllllllllIlIlllIlllllIllIllII;
    }
    
    static {
        lIlIIIIIIlIlIIlI();
    }
    
    private static boolean lIlIIIIIIlIllIII(final int llllllllllllIlIlllIlllllIlllIIlI) {
        return llllllllllllIlIlllIlllllIlllIIlI <= 0;
    }
    
    public ModelHorse() {
        this.textureWidth = ModelHorse.lllIIllIlIIlIl[0];
        this.textureHeight = ModelHorse.lllIIllIlIIlIl[0];
        this.body = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[1], ModelHorse.lllIIllIlIIlIl[2]);
        this.body.addBox(-5.0f, -8.0f, -19.0f, ModelHorse.lllIIllIlIIlIl[3], ModelHorse.lllIIllIlIIlIl[3], ModelHorse.lllIIllIlIIlIl[4]);
        "".length();
        this.body.setRotationPoint(0.0f, 11.0f, 9.0f);
        this.tailBase = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[5], ModelHorse.lllIIllIlIIlIl[1]);
        this.tailBase.addBox(-1.0f, -1.0f, 0.0f, ModelHorse.lllIIllIlIIlIl[6], ModelHorse.lllIIllIlIIlIl[6], ModelHorse.lllIIllIlIIlIl[7]);
        "".length();
        this.tailBase.setRotationPoint(0.0f, 3.0f, 14.0f);
        this.setBoxRotation(this.tailBase, -1.134464f, 0.0f, 0.0f);
        this.tailMiddle = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[8], ModelHorse.lllIIllIlIIlIl[9]);
        this.tailMiddle.addBox(-1.5f, -2.0f, 3.0f, ModelHorse.lllIIllIlIIlIl[7], ModelHorse.lllIIllIlIIlIl[10], ModelHorse.lllIIllIlIIlIl[9]);
        "".length();
        this.tailMiddle.setRotationPoint(0.0f, 3.0f, 14.0f);
        this.setBoxRotation(this.tailMiddle, -1.134464f, 0.0f, 0.0f);
        this.tailTip = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[4], ModelHorse.lllIIllIlIIlIl[7]);
        this.tailTip.addBox(-1.5f, -4.5f, 9.0f, ModelHorse.lllIIllIlIIlIl[7], ModelHorse.lllIIllIlIIlIl[10], ModelHorse.lllIIllIlIIlIl[9]);
        "".length();
        this.tailTip.setRotationPoint(0.0f, 3.0f, 14.0f);
        this.setBoxRotation(this.tailTip, -1.40215f, 0.0f, 0.0f);
        this.backLeftLeg = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[11], ModelHorse.lllIIllIlIIlIl[12]);
        this.backLeftLeg.addBox(-2.5f, -2.0f, -2.5f, ModelHorse.lllIIllIlIIlIl[10], ModelHorse.lllIIllIlIIlIl[13], ModelHorse.lllIIllIlIIlIl[14]);
        "".length();
        this.backLeftLeg.setRotationPoint(4.0f, 9.0f, 11.0f);
        this.backLeftShin = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[11], ModelHorse.lllIIllIlIIlIl[15]);
        this.backLeftShin.addBox(-2.0f, 0.0f, -1.5f, ModelHorse.lllIIllIlIIlIl[7], ModelHorse.lllIIllIlIIlIl[14], ModelHorse.lllIIllIlIIlIl[7]);
        "".length();
        this.backLeftShin.setRotationPoint(4.0f, 16.0f, 11.0f);
        this.backLeftHoof = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[11], ModelHorse.lllIIllIlIIlIl[16]);
        this.backLeftHoof.addBox(-2.5f, 5.1f, -2.0f, ModelHorse.lllIIllIlIIlIl[10], ModelHorse.lllIIllIlIIlIl[7], ModelHorse.lllIIllIlIIlIl[10]);
        "".length();
        this.backLeftHoof.setRotationPoint(4.0f, 16.0f, 11.0f);
        this.backRightLeg = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[17], ModelHorse.lllIIllIlIIlIl[12]);
        this.backRightLeg.addBox(-1.5f, -2.0f, -2.5f, ModelHorse.lllIIllIlIIlIl[10], ModelHorse.lllIIllIlIIlIl[13], ModelHorse.lllIIllIlIIlIl[14]);
        "".length();
        this.backRightLeg.setRotationPoint(-4.0f, 9.0f, 11.0f);
        this.backRightShin = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[17], ModelHorse.lllIIllIlIIlIl[15]);
        this.backRightShin.addBox(-1.0f, 0.0f, -1.5f, ModelHorse.lllIIllIlIIlIl[7], ModelHorse.lllIIllIlIIlIl[14], ModelHorse.lllIIllIlIIlIl[7]);
        "".length();
        this.backRightShin.setRotationPoint(-4.0f, 16.0f, 11.0f);
        this.backRightHoof = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[17], ModelHorse.lllIIllIlIIlIl[16]);
        this.backRightHoof.addBox(-1.5f, 5.1f, -2.0f, ModelHorse.lllIIllIlIIlIl[10], ModelHorse.lllIIllIlIIlIl[7], ModelHorse.lllIIllIlIIlIl[10]);
        "".length();
        this.backRightHoof.setRotationPoint(-4.0f, 16.0f, 11.0f);
        this.frontLeftLeg = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[5], ModelHorse.lllIIllIlIIlIl[12]);
        this.frontLeftLeg.addBox(-1.9f, -1.0f, -2.1f, ModelHorse.lllIIllIlIIlIl[7], ModelHorse.lllIIllIlIIlIl[18], ModelHorse.lllIIllIlIIlIl[10]);
        "".length();
        this.frontLeftLeg.setRotationPoint(4.0f, 9.0f, -8.0f);
        this.frontLeftShin = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[5], ModelHorse.lllIIllIlIIlIl[19]);
        this.frontLeftShin.addBox(-1.9f, 0.0f, -1.6f, ModelHorse.lllIIllIlIIlIl[7], ModelHorse.lllIIllIlIIlIl[14], ModelHorse.lllIIllIlIIlIl[7]);
        "".length();
        this.frontLeftShin.setRotationPoint(4.0f, 16.0f, -8.0f);
        this.frontLeftHoof = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[5], ModelHorse.lllIIllIlIIlIl[16]);
        this.frontLeftHoof.addBox(-2.4f, 5.1f, -2.1f, ModelHorse.lllIIllIlIIlIl[10], ModelHorse.lllIIllIlIIlIl[7], ModelHorse.lllIIllIlIIlIl[10]);
        "".length();
        this.frontLeftHoof.setRotationPoint(4.0f, 16.0f, -8.0f);
        this.frontRightLeg = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[20], ModelHorse.lllIIllIlIIlIl[12]);
        this.frontRightLeg.addBox(-1.1f, -1.0f, -2.1f, ModelHorse.lllIIllIlIIlIl[7], ModelHorse.lllIIllIlIIlIl[18], ModelHorse.lllIIllIlIIlIl[10]);
        "".length();
        this.frontRightLeg.setRotationPoint(-4.0f, 9.0f, -8.0f);
        this.frontRightShin = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[20], ModelHorse.lllIIllIlIIlIl[19]);
        this.frontRightShin.addBox(-1.1f, 0.0f, -1.6f, ModelHorse.lllIIllIlIIlIl[7], ModelHorse.lllIIllIlIIlIl[14], ModelHorse.lllIIllIlIIlIl[7]);
        "".length();
        this.frontRightShin.setRotationPoint(-4.0f, 16.0f, -8.0f);
        this.frontRightHoof = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[20], ModelHorse.lllIIllIlIIlIl[16]);
        this.frontRightHoof.addBox(-1.6f, 5.1f, -2.1f, ModelHorse.lllIIllIlIIlIl[10], ModelHorse.lllIIllIlIIlIl[7], ModelHorse.lllIIllIlIIlIl[10]);
        "".length();
        this.frontRightHoof.setRotationPoint(-4.0f, 16.0f, -8.0f);
        this.head = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[1], ModelHorse.lllIIllIlIIlIl[1]);
        this.head.addBox(-2.5f, -10.0f, -1.5f, ModelHorse.lllIIllIlIIlIl[14], ModelHorse.lllIIllIlIIlIl[14], ModelHorse.lllIIllIlIIlIl[9]);
        "".length();
        this.head.setRotationPoint(0.0f, 4.0f, -10.0f);
        this.setBoxRotation(this.head, 0.5235988f, 0.0f, 0.0f);
        this.field_178711_b = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[4], ModelHorse.lllIIllIlIIlIl[21]);
        this.field_178711_b.addBox(-2.0f, -10.0f, -7.0f, ModelHorse.lllIIllIlIIlIl[10], ModelHorse.lllIIllIlIIlIl[7], ModelHorse.lllIIllIlIIlIl[22]);
        "".length();
        this.field_178711_b.setRotationPoint(0.0f, 3.95f, -10.0f);
        this.setBoxRotation(this.field_178711_b, 0.5235988f, 0.0f, 0.0f);
        this.field_178712_c = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[4], ModelHorse.lllIIllIlIIlIl[23]);
        this.field_178712_c.addBox(-2.0f, -7.0f, -6.5f, ModelHorse.lllIIllIlIIlIl[10], ModelHorse.lllIIllIlIIlIl[6], ModelHorse.lllIIllIlIIlIl[14]);
        "".length();
        this.field_178712_c.setRotationPoint(0.0f, 4.0f, -10.0f);
        this.setBoxRotation(this.field_178712_c, 0.5235988f, 0.0f, 0.0f);
        this.head.addChild(this.field_178711_b);
        this.head.addChild(this.field_178712_c);
        this.horseLeftEar = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[1], ModelHorse.lllIIllIlIIlIl[1]);
        this.horseLeftEar.addBox(0.45f, -12.0f, 4.0f, ModelHorse.lllIIllIlIIlIl[6], ModelHorse.lllIIllIlIIlIl[7], ModelHorse.lllIIllIlIIlIl[24]);
        "".length();
        this.horseLeftEar.setRotationPoint(0.0f, 4.0f, -10.0f);
        this.setBoxRotation(this.horseLeftEar, 0.5235988f, 0.0f, 0.0f);
        this.horseRightEar = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[1], ModelHorse.lllIIllIlIIlIl[1]);
        this.horseRightEar.addBox(-2.45f, -12.0f, 4.0f, ModelHorse.lllIIllIlIIlIl[6], ModelHorse.lllIIllIlIIlIl[7], ModelHorse.lllIIllIlIIlIl[24]);
        "".length();
        this.horseRightEar.setRotationPoint(0.0f, 4.0f, -10.0f);
        this.setBoxRotation(this.horseRightEar, 0.5235988f, 0.0f, 0.0f);
        this.muleLeftEar = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[1], ModelHorse.lllIIllIlIIlIl[25]);
        this.muleLeftEar.addBox(-2.0f, -16.0f, 4.0f, ModelHorse.lllIIllIlIIlIl[6], ModelHorse.lllIIllIlIIlIl[9], ModelHorse.lllIIllIlIIlIl[24]);
        "".length();
        this.muleLeftEar.setRotationPoint(0.0f, 4.0f, -10.0f);
        this.setBoxRotation(this.muleLeftEar, 0.5235988f, 0.0f, 0.2617994f);
        this.muleRightEar = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[1], ModelHorse.lllIIllIlIIlIl[25]);
        this.muleRightEar.addBox(0.0f, -16.0f, 4.0f, ModelHorse.lllIIllIlIIlIl[6], ModelHorse.lllIIllIlIIlIl[9], ModelHorse.lllIIllIlIIlIl[24]);
        "".length();
        this.muleRightEar.setRotationPoint(0.0f, 4.0f, -10.0f);
        this.setBoxRotation(this.muleRightEar, 0.5235988f, 0.0f, -0.2617994f);
        this.neck = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[1], ModelHorse.lllIIllIlIIlIl[25]);
        this.neck.addBox(-2.05f, -9.8f, -2.0f, ModelHorse.lllIIllIlIIlIl[10], ModelHorse.lllIIllIlIIlIl[26], ModelHorse.lllIIllIlIIlIl[18]);
        "".length();
        this.neck.setRotationPoint(0.0f, 4.0f, -10.0f);
        this.setBoxRotation(this.neck, 0.5235988f, 0.0f, 0.0f);
        this.muleLeftChest = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[1], ModelHorse.lllIIllIlIIlIl[2]);
        this.muleLeftChest.addBox(-3.0f, 0.0f, 0.0f, ModelHorse.lllIIllIlIIlIl[18], ModelHorse.lllIIllIlIIlIl[18], ModelHorse.lllIIllIlIIlIl[7]);
        "".length();
        this.muleLeftChest.setRotationPoint(-7.5f, 3.0f, 10.0f);
        this.setBoxRotation(this.muleLeftChest, 0.0f, 1.5707964f, 0.0f);
        this.muleRightChest = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[1], ModelHorse.lllIIllIlIIlIl[27]);
        this.muleRightChest.addBox(-3.0f, 0.0f, 0.0f, ModelHorse.lllIIllIlIIlIl[18], ModelHorse.lllIIllIlIIlIl[18], ModelHorse.lllIIllIlIIlIl[7]);
        "".length();
        this.muleRightChest.setRotationPoint(4.5f, 3.0f, 10.0f);
        this.setBoxRotation(this.muleRightChest, 0.0f, 1.5707964f, 0.0f);
        this.horseSaddleBottom = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[28], ModelHorse.lllIIllIlIIlIl[1]);
        this.horseSaddleBottom.addBox(-5.0f, 0.0f, -3.0f, ModelHorse.lllIIllIlIIlIl[3], ModelHorse.lllIIllIlIIlIl[24], ModelHorse.lllIIllIlIIlIl[18]);
        "".length();
        this.horseSaddleBottom.setRotationPoint(0.0f, 2.0f, 2.0f);
        this.horseSaddleFront = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[29], ModelHorse.lllIIllIlIIlIl[13]);
        this.horseSaddleFront.addBox(-1.5f, -1.0f, -3.0f, ModelHorse.lllIIllIlIIlIl[7], ModelHorse.lllIIllIlIIlIl[24], ModelHorse.lllIIllIlIIlIl[6]);
        "".length();
        this.horseSaddleFront.setRotationPoint(0.0f, 2.0f, 2.0f);
        this.horseSaddleBack = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[28], ModelHorse.lllIIllIlIIlIl[13]);
        this.horseSaddleBack.addBox(-4.0f, -1.0f, 3.0f, ModelHorse.lllIIllIlIIlIl[18], ModelHorse.lllIIllIlIIlIl[24], ModelHorse.lllIIllIlIIlIl[6]);
        "".length();
        this.horseSaddleBack.setRotationPoint(0.0f, 2.0f, 2.0f);
        this.horseLeftSaddleMetal = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[30], ModelHorse.lllIIllIlIIlIl[1]);
        this.horseLeftSaddleMetal.addBox(-0.5f, 6.0f, -1.0f, ModelHorse.lllIIllIlIIlIl[24], ModelHorse.lllIIllIlIIlIl[6], ModelHorse.lllIIllIlIIlIl[6]);
        "".length();
        this.horseLeftSaddleMetal.setRotationPoint(5.0f, 3.0f, 2.0f);
        this.horseLeftSaddleRope = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[31], ModelHorse.lllIIllIlIIlIl[1]);
        this.horseLeftSaddleRope.addBox(-0.5f, 0.0f, -0.5f, ModelHorse.lllIIllIlIIlIl[24], ModelHorse.lllIIllIlIIlIl[22], ModelHorse.lllIIllIlIIlIl[24]);
        "".length();
        this.horseLeftSaddleRope.setRotationPoint(5.0f, 3.0f, 2.0f);
        this.horseRightSaddleMetal = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[30], ModelHorse.lllIIllIlIIlIl[10]);
        this.horseRightSaddleMetal.addBox(-0.5f, 6.0f, -1.0f, ModelHorse.lllIIllIlIIlIl[24], ModelHorse.lllIIllIlIIlIl[6], ModelHorse.lllIIllIlIIlIl[6]);
        "".length();
        this.horseRightSaddleMetal.setRotationPoint(-5.0f, 3.0f, 2.0f);
        this.horseRightSaddleRope = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[28], ModelHorse.lllIIllIlIIlIl[1]);
        this.horseRightSaddleRope.addBox(-0.5f, 0.0f, -0.5f, ModelHorse.lllIIllIlIIlIl[24], ModelHorse.lllIIllIlIIlIl[22], ModelHorse.lllIIllIlIIlIl[24]);
        "".length();
        this.horseRightSaddleRope.setRotationPoint(-5.0f, 3.0f, 2.0f);
        this.horseLeftFaceMetal = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[30], ModelHorse.lllIIllIlIIlIl[32]);
        this.horseLeftFaceMetal.addBox(1.5f, -8.0f, -4.0f, ModelHorse.lllIIllIlIIlIl[24], ModelHorse.lllIIllIlIIlIl[6], ModelHorse.lllIIllIlIIlIl[6]);
        "".length();
        this.horseLeftFaceMetal.setRotationPoint(0.0f, 4.0f, -10.0f);
        this.setBoxRotation(this.horseLeftFaceMetal, 0.5235988f, 0.0f, 0.0f);
        this.horseRightFaceMetal = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[30], ModelHorse.lllIIllIlIIlIl[32]);
        this.horseRightFaceMetal.addBox(-2.5f, -8.0f, -4.0f, ModelHorse.lllIIllIlIIlIl[24], ModelHorse.lllIIllIlIIlIl[6], ModelHorse.lllIIllIlIIlIl[6]);
        "".length();
        this.horseRightFaceMetal.setRotationPoint(0.0f, 4.0f, -10.0f);
        this.setBoxRotation(this.horseRightFaceMetal, 0.5235988f, 0.0f, 0.0f);
        this.horseLeftRein = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[5], ModelHorse.lllIIllIlIIlIl[3]);
        this.horseLeftRein.addBox(2.6f, -6.0f, -6.0f, ModelHorse.lllIIllIlIIlIl[1], ModelHorse.lllIIllIlIIlIl[7], ModelHorse.lllIIllIlIIlIl[33]);
        "".length();
        this.horseLeftRein.setRotationPoint(0.0f, 4.0f, -10.0f);
        this.horseRightRein = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[5], ModelHorse.lllIIllIlIIlIl[14]);
        this.horseRightRein.addBox(-2.6f, -6.0f, -6.0f, ModelHorse.lllIIllIlIIlIl[1], ModelHorse.lllIIllIlIIlIl[7], ModelHorse.lllIIllIlIIlIl[33]);
        "".length();
        this.horseRightRein.setRotationPoint(0.0f, 4.0f, -10.0f);
        this.mane = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[34], ModelHorse.lllIIllIlIIlIl[1]);
        this.mane.addBox(-1.0f, -11.5f, 5.0f, ModelHorse.lllIIllIlIIlIl[6], ModelHorse.lllIIllIlIIlIl[33], ModelHorse.lllIIllIlIIlIl[10]);
        "".length();
        this.mane.setRotationPoint(0.0f, 4.0f, -10.0f);
        this.setBoxRotation(this.mane, 0.5235988f, 0.0f, 0.0f);
        this.horseFaceRopes = new ModelRenderer(this, ModelHorse.lllIIllIlIIlIl[28], ModelHorse.lllIIllIlIIlIl[25]);
        this.horseFaceRopes.addBox(-2.5f, -10.1f, -7.0f, ModelHorse.lllIIllIlIIlIl[14], ModelHorse.lllIIllIlIIlIl[14], ModelHorse.lllIIllIlIIlIl[25], 0.2f);
        this.horseFaceRopes.setRotationPoint(0.0f, 4.0f, -10.0f);
        this.setBoxRotation(this.horseFaceRopes, 0.5235988f, 0.0f, 0.0f);
    }
    
    private static boolean lIlIIIIIIlIlIlll(final int llllllllllllIlIlllIlllllIllllIIl) {
        return llllllllllllIlIlllIlllllIllllIIl == 0;
    }
    
    private static void lIlIIIIIIlIlIIlI() {
        (lllIIllIlIIlIl = new int[35])[0] = (0xA3 ^ 0x96) + (0x3D ^ 0x5A) - (63 + 111 - 59 + 15) + (0x4F ^ 0x29);
        ModelHorse.lllIIllIlIIlIl[1] = ((0x86 ^ 0xB7) & ~(0x2C ^ 0x1D));
        ModelHorse.lllIIllIlIIlIl[2] = (0x47 ^ 0x65);
        ModelHorse.lllIIllIlIIlIl[3] = (0x67 ^ 0x6D);
        ModelHorse.lllIIllIlIIlIl[4] = (0xB1 ^ 0xA9);
        ModelHorse.lllIIllIlIIlIl[5] = (30 + 36 + 45 + 41 ^ 138 + 175 - 208 + 75);
        ModelHorse.lllIIllIlIIlIl[6] = "  ".length();
        ModelHorse.lllIIllIlIIlIl[7] = "   ".length();
        ModelHorse.lllIIllIlIIlIl[8] = (0xA8 ^ 0x8E);
        ModelHorse.lllIIllIlIIlIl[9] = (0x2B ^ 0x2C);
        ModelHorse.lllIIllIlIIlIl[10] = (0x71 ^ 0x61 ^ (0x57 ^ 0x43));
        ModelHorse.lllIIllIlIIlIl[11] = (0x9 ^ 0x47);
        ModelHorse.lllIIllIlIIlIl[12] = (0x2A ^ 0x37);
        ModelHorse.lllIIllIlIIlIl[13] = (0x28 ^ 0x3 ^ (0x6E ^ 0x4C));
        ModelHorse.lllIIllIlIIlIl[14] = (0x8C ^ 0x89);
        ModelHorse.lllIIllIlIIlIl[15] = (0x5A ^ 0x71);
        ModelHorse.lllIIllIlIIlIl[16] = (0x6C ^ 0x5F);
        ModelHorse.lllIIllIlIIlIl[17] = (0x50 ^ 0x73 ^ (0x3F ^ 0x7C));
        ModelHorse.lllIIllIlIIlIl[18] = (0x77 ^ 0x7F);
        ModelHorse.lllIIllIlIIlIl[19] = (0x9D ^ 0xA6 ^ (0x8F ^ 0x9D));
        ModelHorse.lllIIllIlIIlIl[20] = (39 + 40 - 51 + 223 ^ 50 + 111 + 18 + 20);
        ModelHorse.lllIIllIlIIlIl[21] = (0x1E ^ 0xC);
        ModelHorse.lllIIllIlIIlIl[22] = (37 + 105 + 14 + 22 ^ 70 + 3 + 84 + 23);
        ModelHorse.lllIIllIlIIlIl[23] = (0x51 ^ 0x5F ^ (0xB9 ^ 0xAC));
        ModelHorse.lllIIllIlIIlIl[24] = " ".length();
        ModelHorse.lllIIllIlIIlIl[25] = (0x30 ^ 0x67 ^ (0xD6 ^ 0x8D));
        ModelHorse.lllIIllIlIIlIl[26] = (0x32 ^ 0x45 ^ (0x3E ^ 0x47));
        ModelHorse.lllIIllIlIIlIl[27] = (0x20 ^ 0xF);
        ModelHorse.lllIIllIlIIlIl[28] = (0x40 ^ 0x75 ^ (0x31 ^ 0x54));
        ModelHorse.lllIIllIlIIlIl[29] = (0x34 ^ 0x5E);
        ModelHorse.lllIIllIlIIlIl[30] = (0x20 ^ 0x6A);
        ModelHorse.lllIIllIlIIlIl[31] = (0x59 ^ 0x1F);
        ModelHorse.lllIIllIlIIlIl[32] = (0xFF ^ 0x89 ^ (0x41 ^ 0x3A));
        ModelHorse.lllIIllIlIIlIl[33] = (0xA0 ^ 0xB0);
        ModelHorse.lllIIllIlIIlIl[34] = (0xC2 ^ 0xC4 ^ (0x34 ^ 0x8));
    }
    
    private static int lIlIIIIIIlIlIIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIlIIIIIIlIllIll(final int llllllllllllIlIlllIlllllIlllIllI) {
        return llllllllllllIlIlllIlllllIlllIllI >= 0;
    }
    
    private static boolean lIlIIIIIIlIlllII(final int llllllllllllIlIlllIlllllIlllIlII) {
        return llllllllllllIlIlllIlllllIlllIlII < 0;
    }
    
    private static boolean lIlIIIIIIlIlIllI(final Object llllllllllllIlIlllIllllllIIIIIIl) {
        return llllllllllllIlIlllIllllllIIIIIIl != null;
    }
    
    private void setBoxRotation(final ModelRenderer llllllllllllIlIllllIIIIIIIIlllIl, final float llllllllllllIlIllllIIIIIIIlIIIII, final float llllllllllllIlIllllIIIIIIIIllIll, final float llllllllllllIlIllllIIIIIIIIllllI) {
        llllllllllllIlIllllIIIIIIIIlllIl.rotateAngleX = llllllllllllIlIllllIIIIIIIlIIIII;
        llllllllllllIlIllllIIIIIIIIlllIl.rotateAngleY = llllllllllllIlIllllIIIIIIIIllIll;
        llllllllllllIlIllllIIIIIIIIlllIl.rotateAngleZ = llllllllllllIlIllllIIIIIIIIllllI;
    }
    
    private static int lIlIIIIIIlIllIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int lIlIIIIIIlIlllIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIlIIIIIIlIlllll(final int llllllllllllIlIlllIlllllIlllIIII) {
        return llllllllllllIlIlllIlllllIlllIIII > 0;
    }
    
    private static int lIlIIIIIIlIllIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public void render(final Entity llllllllllllIlIllllIIIIIIIllIIlI, final float llllllllllllIlIllllIIIIIIlIIIIll, final float llllllllllllIlIllllIIIIIIlIIIIlI, final float llllllllllllIlIllllIIIIIIlIIIIIl, final float llllllllllllIlIllllIIIIIIlIIIIII, final float llllllllllllIlIllllIIIIIIIllllll, final float llllllllllllIlIllllIIIIIIIlllllI) {
        final EntityHorse llllllllllllIlIllllIIIIIIIllllIl = (EntityHorse)llllllllllllIlIllllIIIIIIIllIIlI;
        final int llllllllllllIlIllllIIIIIIIllllII = llllllllllllIlIllllIIIIIIIllllIl.getHorseType();
        final float llllllllllllIlIllllIIIIIIIlllIll = llllllllllllIlIllllIIIIIIIllllIl.getGrassEatingAmount(0.0f);
        final boolean llllllllllllIlIllllIIIIIIIlllIlI = llllllllllllIlIllllIIIIIIIllllIl.isAdultHorse();
        int n;
        if (lIlIIIIIIlIlIlII(llllllllllllIlIllllIIIIIIIlllIlI ? 1 : 0) && lIlIIIIIIlIlIlII(llllllllllllIlIllllIIIIIIIllllIl.isHorseSaddled() ? 1 : 0)) {
            n = ModelHorse.lllIIllIlIIlIl[24];
            "".length();
            if ("  ".length() <= " ".length()) {
                return;
            }
        }
        else {
            n = ModelHorse.lllIIllIlIIlIl[1];
        }
        final boolean llllllllllllIlIllllIIIIIIIlllIIl = n != 0;
        int n2;
        if (lIlIIIIIIlIlIlII(llllllllllllIlIllllIIIIIIIlllIlI ? 1 : 0) && lIlIIIIIIlIlIlII(llllllllllllIlIllllIIIIIIIllllIl.isChested() ? 1 : 0)) {
            n2 = ModelHorse.lllIIllIlIIlIl[24];
            "".length();
            if ("  ".length() <= ((0x28 ^ 0x14) & ~(0x2A ^ 0x16))) {
                return;
            }
        }
        else {
            n2 = ModelHorse.lllIIllIlIIlIl[1];
        }
        final boolean llllllllllllIlIllllIIIIIIIlllIII = n2 != 0;
        int n3;
        if (lIlIIIIIIlIlIlIl(llllllllllllIlIllllIIIIIIIllllII, ModelHorse.lllIIllIlIIlIl[24]) && lIlIIIIIIlIlIlIl(llllllllllllIlIllllIIIIIIIllllII, ModelHorse.lllIIllIlIIlIl[6])) {
            n3 = ModelHorse.lllIIllIlIIlIl[1];
            "".length();
            if ((96 + 96 - 127 + 62 ^ (0x67 ^ 0x1C)) <= " ".length()) {
                return;
            }
        }
        else {
            n3 = ModelHorse.lllIIllIlIIlIl[24];
        }
        final boolean llllllllllllIlIllllIIIIIIIllIlll = n3 != 0;
        final float llllllllllllIlIllllIIIIIIIllIllI = llllllllllllIlIllllIIIIIIIllllIl.getHorseSize();
        int n4;
        if (lIlIIIIIIlIlIllI(llllllllllllIlIllllIIIIIIIllllIl.riddenByEntity)) {
            n4 = ModelHorse.lllIIllIlIIlIl[24];
            "".length();
            if ("   ".length() <= " ".length()) {
                return;
            }
        }
        else {
            n4 = ModelHorse.lllIIllIlIIlIl[1];
        }
        final boolean llllllllllllIlIllllIIIIIIIllIlIl = n4 != 0;
        if (lIlIIIIIIlIlIlII(llllllllllllIlIllllIIIIIIIlllIIl ? 1 : 0)) {
            this.horseFaceRopes.render(llllllllllllIlIllllIIIIIIIlllllI);
            this.horseSaddleBottom.render(llllllllllllIlIllllIIIIIIIlllllI);
            this.horseSaddleFront.render(llllllllllllIlIllllIIIIIIIlllllI);
            this.horseSaddleBack.render(llllllllllllIlIllllIIIIIIIlllllI);
            this.horseLeftSaddleRope.render(llllllllllllIlIllllIIIIIIIlllllI);
            this.horseLeftSaddleMetal.render(llllllllllllIlIllllIIIIIIIlllllI);
            this.horseRightSaddleRope.render(llllllllllllIlIllllIIIIIIIlllllI);
            this.horseRightSaddleMetal.render(llllllllllllIlIllllIIIIIIIlllllI);
            this.horseLeftFaceMetal.render(llllllllllllIlIllllIIIIIIIlllllI);
            this.horseRightFaceMetal.render(llllllllllllIlIllllIIIIIIIlllllI);
            if (lIlIIIIIIlIlIlII(llllllllllllIlIllllIIIIIIIllIlIl ? 1 : 0)) {
                this.horseLeftRein.render(llllllllllllIlIllllIIIIIIIlllllI);
                this.horseRightRein.render(llllllllllllIlIllllIIIIIIIlllllI);
            }
        }
        if (lIlIIIIIIlIlIlll(llllllllllllIlIllllIIIIIIIlllIlI ? 1 : 0)) {
            GlStateManager.pushMatrix();
            GlStateManager.scale(llllllllllllIlIllllIIIIIIIllIllI, 0.5f + llllllllllllIlIllllIIIIIIIllIllI * 0.5f, llllllllllllIlIllllIIIIIIIllIllI);
            GlStateManager.translate(0.0f, 0.95f * (1.0f - llllllllllllIlIllllIIIIIIIllIllI), 0.0f);
        }
        this.backLeftLeg.render(llllllllllllIlIllllIIIIIIIlllllI);
        this.backLeftShin.render(llllllllllllIlIllllIIIIIIIlllllI);
        this.backLeftHoof.render(llllllllllllIlIllllIIIIIIIlllllI);
        this.backRightLeg.render(llllllllllllIlIllllIIIIIIIlllllI);
        this.backRightShin.render(llllllllllllIlIllllIIIIIIIlllllI);
        this.backRightHoof.render(llllllllllllIlIllllIIIIIIIlllllI);
        this.frontLeftLeg.render(llllllllllllIlIllllIIIIIIIlllllI);
        this.frontLeftShin.render(llllllllllllIlIllllIIIIIIIlllllI);
        this.frontLeftHoof.render(llllllllllllIlIllllIIIIIIIlllllI);
        this.frontRightLeg.render(llllllllllllIlIllllIIIIIIIlllllI);
        this.frontRightShin.render(llllllllllllIlIllllIIIIIIIlllllI);
        this.frontRightHoof.render(llllllllllllIlIllllIIIIIIIlllllI);
        if (lIlIIIIIIlIlIlll(llllllllllllIlIllllIIIIIIIlllIlI ? 1 : 0)) {
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.scale(llllllllllllIlIllllIIIIIIIllIllI, llllllllllllIlIllllIIIIIIIllIllI, llllllllllllIlIllllIIIIIIIllIllI);
            GlStateManager.translate(0.0f, 1.35f * (1.0f - llllllllllllIlIllllIIIIIIIllIllI), 0.0f);
        }
        this.body.render(llllllllllllIlIllllIIIIIIIlllllI);
        this.tailBase.render(llllllllllllIlIllllIIIIIIIlllllI);
        this.tailMiddle.render(llllllllllllIlIllllIIIIIIIlllllI);
        this.tailTip.render(llllllllllllIlIllllIIIIIIIlllllI);
        this.neck.render(llllllllllllIlIllllIIIIIIIlllllI);
        this.mane.render(llllllllllllIlIllllIIIIIIIlllllI);
        if (lIlIIIIIIlIlIlll(llllllllllllIlIllllIIIIIIIlllIlI ? 1 : 0)) {
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            final float llllllllllllIlIllllIIIIIIIllIlII = 0.5f + llllllllllllIlIllllIIIIIIIllIllI * llllllllllllIlIllllIIIIIIIllIllI * 0.5f;
            GlStateManager.scale(llllllllllllIlIllllIIIIIIIllIlII, llllllllllllIlIllllIIIIIIIllIlII, llllllllllllIlIllllIIIIIIIllIlII);
            if (lIlIIIIIIlIllIII(lIlIIIIIIlIlIIll(llllllllllllIlIllllIIIIIIIlllIll, 0.0f))) {
                GlStateManager.translate(0.0f, 1.35f * (1.0f - llllllllllllIlIllllIIIIIIIllIllI), 0.0f);
                "".length();
                if ((0x88 ^ 0x8C) <= 0) {
                    return;
                }
            }
            else {
                GlStateManager.translate(0.0f, 0.9f * (1.0f - llllllllllllIlIllllIIIIIIIllIllI) * llllllllllllIlIllllIIIIIIIlllIll + 1.35f * (1.0f - llllllllllllIlIllllIIIIIIIllIllI) * (1.0f - llllllllllllIlIllllIIIIIIIlllIll), 0.15f * (1.0f - llllllllllllIlIllllIIIIIIIllIllI) * llllllllllllIlIllllIIIIIIIlllIll);
            }
        }
        if (lIlIIIIIIlIlIlII(llllllllllllIlIllllIIIIIIIllIlll ? 1 : 0)) {
            this.muleLeftEar.render(llllllllllllIlIllllIIIIIIIlllllI);
            this.muleRightEar.render(llllllllllllIlIllllIIIIIIIlllllI);
            "".length();
            if (-" ".length() == ((0x29 ^ 0x79 ^ (0x2A ^ 0x52)) & (0x44 ^ 0x0 ^ (0x14 ^ 0x78) ^ -" ".length()))) {
                return;
            }
        }
        else {
            this.horseLeftEar.render(llllllllllllIlIllllIIIIIIIlllllI);
            this.horseRightEar.render(llllllllllllIlIllllIIIIIIIlllllI);
        }
        this.head.render(llllllllllllIlIllllIIIIIIIlllllI);
        if (lIlIIIIIIlIlIlll(llllllllllllIlIllllIIIIIIIlllIlI ? 1 : 0)) {
            GlStateManager.popMatrix();
        }
        if (lIlIIIIIIlIlIlII(llllllllllllIlIllllIIIIIIIlllIII ? 1 : 0)) {
            this.muleLeftChest.render(llllllllllllIlIllllIIIIIIIlllllI);
            this.muleRightChest.render(llllllllllllIlIllllIIIIIIIlllllI);
        }
    }
    
    @Override
    public void setLivingAnimations(final EntityLivingBase llllllllllllIlIlllIllllllllIIIlI, final float llllllllllllIlIlllIllllllIllIIII, final float llllllllllllIlIlllIllllllllIIIII, final float llllllllllllIlIlllIllllllIlIlllI) {
        super.setLivingAnimations(llllllllllllIlIlllIllllllllIIIlI, llllllllllllIlIlllIllllllIllIIII, llllllllllllIlIlllIllllllllIIIII, llllllllllllIlIlllIllllllIlIlllI);
        final float llllllllllllIlIlllIlllllllIlllIl = this.updateHorseRotation(llllllllllllIlIlllIllllllllIIIlI.prevRenderYawOffset, llllllllllllIlIlllIllllllllIIIlI.renderYawOffset, llllllllllllIlIlllIllllllIlIlllI);
        final float llllllllllllIlIlllIlllllllIllIll = this.updateHorseRotation(llllllllllllIlIlllIllllllllIIIlI.prevRotationYawHead, llllllllllllIlIlllIllllllllIIIlI.rotationYawHead, llllllllllllIlIlllIllllllIlIlllI);
        final float llllllllllllIlIlllIlllllllIllIlI = llllllllllllIlIlllIllllllllIIIlI.prevRotationPitch + (llllllllllllIlIlllIllllllllIIIlI.rotationPitch - llllllllllllIlIlllIllllllllIIIlI.prevRotationPitch) * llllllllllllIlIlllIllllllIlIlllI;
        float llllllllllllIlIlllIlllllllIllIII = llllllllllllIlIlllIlllllllIllIll - llllllllllllIlIlllIlllllllIlllIl;
        float llllllllllllIlIlllIlllllllIlIllI = llllllllllllIlIlllIlllllllIllIlI / 57.295776f;
        if (lIlIIIIIIlIlllll(lIlIIIIIIlIlllIl(llllllllllllIlIlllIlllllllIllIII, 20.0f))) {
            llllllllllllIlIlllIlllllllIllIII = 20.0f;
        }
        if (lIlIIIIIIlIlllII(lIlIIIIIIlIllllI(llllllllllllIlIlllIlllllllIllIII, -20.0f))) {
            llllllllllllIlIlllIlllllllIllIII = -20.0f;
        }
        if (lIlIIIIIIlIlllll(lIlIIIIIIlIlllIl(llllllllllllIlIlllIllllllllIIIII, 0.2f))) {
            llllllllllllIlIlllIlllllllIlIllI += MathHelper.cos(llllllllllllIlIlllIllllllIllIIII * 0.4f) * 0.15f * llllllllllllIlIlllIllllllllIIIII;
        }
        final EntityHorse llllllllllllIlIlllIlllllllIlIlII = (EntityHorse)llllllllllllIlIlllIllllllllIIIlI;
        final float llllllllllllIlIlllIlllllllIlIIlI = llllllllllllIlIlllIlllllllIlIlII.getGrassEatingAmount(llllllllllllIlIlllIllllllIlIlllI);
        final float llllllllllllIlIlllIlllllllIlIIII = llllllllllllIlIlllIlllllllIlIlII.getRearingAmount(llllllllllllIlIlllIllllllIlIlllI);
        final float llllllllllllIlIlllIlllllllIIlllI = 1.0f - llllllllllllIlIlllIlllllllIlIIII;
        final float llllllllllllIlIlllIlllllllIIllII = llllllllllllIlIlllIlllllllIlIlII.getMouthOpennessAngle(llllllllllllIlIlllIllllllIlIlllI);
        int n;
        if (lIlIIIIIIlIlIlII(llllllllllllIlIlllIlllllllIlIlII.field_110278_bp)) {
            n = ModelHorse.lllIIllIlIIlIl[24];
            "".length();
            if (((0x88 ^ 0x91 ^ (0x3A ^ 0x42)) & (0x89 ^ 0xA1 ^ (0x69 ^ 0x20) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            n = ModelHorse.lllIIllIlIIlIl[1];
        }
        final boolean llllllllllllIlIlllIlllllllIIlIll = n != 0;
        final boolean llllllllllllIlIlllIlllllllIIlIIl = llllllllllllIlIlllIlllllllIlIlII.isHorseSaddled();
        int n2;
        if (lIlIIIIIIlIlIllI(llllllllllllIlIlllIlllllllIlIlII.riddenByEntity)) {
            n2 = ModelHorse.lllIIllIlIIlIl[24];
            "".length();
            if (" ".length() != " ".length()) {
                return;
            }
        }
        else {
            n2 = ModelHorse.lllIIllIlIIlIl[1];
        }
        final boolean llllllllllllIlIlllIlllllllIIIlll = n2 != 0;
        final float llllllllllllIlIlllIlllllllIIIlIl = llllllllllllIlIlllIllllllllIIIlI.ticksExisted + llllllllllllIlIlllIllllllIlIlllI;
        final float llllllllllllIlIlllIlllllllIIIIll = MathHelper.cos(llllllllllllIlIlllIllllllIllIIII * 0.6662f + 3.1415927f);
        final float llllllllllllIlIlllIlllllllIIIIIl = llllllllllllIlIlllIlllllllIIIIll * 0.8f * llllllllllllIlIlllIllllllllIIIII;
        this.head.rotationPointY = 4.0f;
        this.head.rotationPointZ = -10.0f;
        this.tailBase.rotationPointY = 3.0f;
        this.tailMiddle.rotationPointZ = 14.0f;
        this.muleRightChest.rotationPointY = 3.0f;
        this.muleRightChest.rotationPointZ = 10.0f;
        this.body.rotateAngleX = 0.0f;
        this.head.rotateAngleX = 0.5235988f + llllllllllllIlIlllIlllllllIlIllI;
        this.head.rotateAngleY = llllllllllllIlIlllIlllllllIllIII / 57.295776f;
        this.head.rotateAngleX = llllllllllllIlIlllIlllllllIlIIII * (0.2617994f + llllllllllllIlIlllIlllllllIlIllI) + llllllllllllIlIlllIlllllllIlIIlI * 2.18166f + (1.0f - Math.max(llllllllllllIlIlllIlllllllIlIIII, llllllllllllIlIlllIlllllllIlIIlI)) * this.head.rotateAngleX;
        this.head.rotateAngleY = llllllllllllIlIlllIlllllllIlIIII * llllllllllllIlIlllIlllllllIllIII / 57.295776f + (1.0f - Math.max(llllllllllllIlIlllIlllllllIlIIII, llllllllllllIlIlllIlllllllIlIIlI)) * this.head.rotateAngleY;
        this.head.rotationPointY = llllllllllllIlIlllIlllllllIlIIII * -6.0f + llllllllllllIlIlllIlllllllIlIIlI * 11.0f + (1.0f - Math.max(llllllllllllIlIlllIlllllllIlIIII, llllllllllllIlIlllIlllllllIlIIlI)) * this.head.rotationPointY;
        this.head.rotationPointZ = llllllllllllIlIlllIlllllllIlIIII * -1.0f + llllllllllllIlIlllIlllllllIlIIlI * -10.0f + (1.0f - Math.max(llllllllllllIlIlllIlllllllIlIIII, llllllllllllIlIlllIlllllllIlIIlI)) * this.head.rotationPointZ;
        this.tailBase.rotationPointY = llllllllllllIlIlllIlllllllIlIIII * 9.0f + llllllllllllIlIlllIlllllllIIlllI * this.tailBase.rotationPointY;
        this.tailMiddle.rotationPointZ = llllllllllllIlIlllIlllllllIlIIII * 18.0f + llllllllllllIlIlllIlllllllIIlllI * this.tailMiddle.rotationPointZ;
        this.muleRightChest.rotationPointY = llllllllllllIlIlllIlllllllIlIIII * 5.5f + llllllllllllIlIlllIlllllllIIlllI * this.muleRightChest.rotationPointY;
        this.muleRightChest.rotationPointZ = llllllllllllIlIlllIlllllllIlIIII * 15.0f + llllllllllllIlIlllIlllllllIIlllI * this.muleRightChest.rotationPointZ;
        this.body.rotateAngleX = llllllllllllIlIlllIlllllllIlIIII * -45.0f / 57.295776f + llllllllllllIlIlllIlllllllIIlllI * this.body.rotateAngleX;
        this.horseLeftEar.rotationPointY = this.head.rotationPointY;
        this.horseRightEar.rotationPointY = this.head.rotationPointY;
        this.muleLeftEar.rotationPointY = this.head.rotationPointY;
        this.muleRightEar.rotationPointY = this.head.rotationPointY;
        this.neck.rotationPointY = this.head.rotationPointY;
        this.field_178711_b.rotationPointY = 0.02f;
        this.field_178712_c.rotationPointY = 0.0f;
        this.mane.rotationPointY = this.head.rotationPointY;
        this.horseLeftEar.rotationPointZ = this.head.rotationPointZ;
        this.horseRightEar.rotationPointZ = this.head.rotationPointZ;
        this.muleLeftEar.rotationPointZ = this.head.rotationPointZ;
        this.muleRightEar.rotationPointZ = this.head.rotationPointZ;
        this.neck.rotationPointZ = this.head.rotationPointZ;
        this.field_178711_b.rotationPointZ = 0.02f - llllllllllllIlIlllIlllllllIIllII * 1.0f;
        this.field_178712_c.rotationPointZ = 0.0f + llllllllllllIlIlllIlllllllIIllII * 1.0f;
        this.mane.rotationPointZ = this.head.rotationPointZ;
        this.horseLeftEar.rotateAngleX = this.head.rotateAngleX;
        this.horseRightEar.rotateAngleX = this.head.rotateAngleX;
        this.muleLeftEar.rotateAngleX = this.head.rotateAngleX;
        this.muleRightEar.rotateAngleX = this.head.rotateAngleX;
        this.neck.rotateAngleX = this.head.rotateAngleX;
        this.field_178711_b.rotateAngleX = 0.0f - 0.09424778f * llllllllllllIlIlllIlllllllIIllII;
        this.field_178712_c.rotateAngleX = 0.0f + 0.15707964f * llllllllllllIlIlllIlllllllIIllII;
        this.mane.rotateAngleX = this.head.rotateAngleX;
        this.horseLeftEar.rotateAngleY = this.head.rotateAngleY;
        this.horseRightEar.rotateAngleY = this.head.rotateAngleY;
        this.muleLeftEar.rotateAngleY = this.head.rotateAngleY;
        this.muleRightEar.rotateAngleY = this.head.rotateAngleY;
        this.neck.rotateAngleY = this.head.rotateAngleY;
        this.field_178711_b.rotateAngleY = 0.0f;
        this.field_178712_c.rotateAngleY = 0.0f;
        this.mane.rotateAngleY = this.head.rotateAngleY;
        this.muleLeftChest.rotateAngleX = llllllllllllIlIlllIlllllllIIIIIl / 5.0f;
        this.muleRightChest.rotateAngleX = -llllllllllllIlIlllIlllllllIIIIIl / 5.0f;
        float llllllllllllIlIlllIllllllIllllll = 1.5707964f;
        final float llllllllllllIlIlllIllllllIllllIl = 4.712389f;
        final float llllllllllllIlIlllIllllllIllllII = -1.0471976f;
        final float llllllllllllIlIlllIllllllIlllIll = 0.2617994f * llllllllllllIlIlllIlllllllIlIIII;
        final float llllllllllllIlIlllIllllllIlllIIl = MathHelper.cos(llllllllllllIlIlllIlllllllIIIlIl * 0.6f + 3.1415927f);
        this.frontLeftLeg.rotationPointY = -2.0f * llllllllllllIlIlllIlllllllIlIIII + 9.0f * llllllllllllIlIlllIlllllllIIlllI;
        this.frontLeftLeg.rotationPointZ = -2.0f * llllllllllllIlIlllIlllllllIlIIII + -8.0f * llllllllllllIlIlllIlllllllIIlllI;
        this.frontRightLeg.rotationPointY = this.frontLeftLeg.rotationPointY;
        this.frontRightLeg.rotationPointZ = this.frontLeftLeg.rotationPointZ;
        this.backLeftShin.rotationPointY = this.backLeftLeg.rotationPointY + MathHelper.sin(1.5707964f + llllllllllllIlIlllIllllllIlllIll + llllllllllllIlIlllIlllllllIIlllI * -llllllllllllIlIlllIlllllllIIIIll * 0.5f * llllllllllllIlIlllIllllllllIIIII) * 7.0f;
        this.backLeftShin.rotationPointZ = this.backLeftLeg.rotationPointZ + MathHelper.cos(4.712389f + llllllllllllIlIlllIllllllIlllIll + llllllllllllIlIlllIlllllllIIlllI * -llllllllllllIlIlllIlllllllIIIIll * 0.5f * llllllllllllIlIlllIllllllllIIIII) * 7.0f;
        this.backRightShin.rotationPointY = this.backRightLeg.rotationPointY + MathHelper.sin(1.5707964f + llllllllllllIlIlllIllllllIlllIll + llllllllllllIlIlllIlllllllIIlllI * llllllllllllIlIlllIlllllllIIIIll * 0.5f * llllllllllllIlIlllIllllllllIIIII) * 7.0f;
        this.backRightShin.rotationPointZ = this.backRightLeg.rotationPointZ + MathHelper.cos(4.712389f + llllllllllllIlIlllIllllllIlllIll + llllllllllllIlIlllIlllllllIIlllI * llllllllllllIlIlllIlllllllIIIIll * 0.5f * llllllllllllIlIlllIllllllllIIIII) * 7.0f;
        final float llllllllllllIlIlllIllllllIllIlll = (-1.0471976f + llllllllllllIlIlllIllllllIlllIIl) * llllllllllllIlIlllIlllllllIlIIII + llllllllllllIlIlllIlllllllIIIIIl * llllllllllllIlIlllIlllllllIIlllI;
        final float llllllllllllIlIlllIllllllIllIlIl = (-1.0471976f + -llllllllllllIlIlllIllllllIlllIIl) * llllllllllllIlIlllIlllllllIlIIII + -llllllllllllIlIlllIlllllllIIIIIl * llllllllllllIlIlllIlllllllIIlllI;
        this.frontLeftShin.rotationPointY = this.frontLeftLeg.rotationPointY + MathHelper.sin(1.5707964f + llllllllllllIlIlllIllllllIllIlll) * 7.0f;
        this.frontLeftShin.rotationPointZ = this.frontLeftLeg.rotationPointZ + MathHelper.cos(4.712389f + llllllllllllIlIlllIllllllIllIlll) * 7.0f;
        this.frontRightShin.rotationPointY = this.frontRightLeg.rotationPointY + MathHelper.sin(1.5707964f + llllllllllllIlIlllIllllllIllIlIl) * 7.0f;
        this.frontRightShin.rotationPointZ = this.frontRightLeg.rotationPointZ + MathHelper.cos(4.712389f + llllllllllllIlIlllIllllllIllIlIl) * 7.0f;
        this.backLeftLeg.rotateAngleX = llllllllllllIlIlllIllllllIlllIll + -llllllllllllIlIlllIlllllllIIIIll * 0.5f * llllllllllllIlIlllIllllllllIIIII * llllllllllllIlIlllIlllllllIIlllI;
        this.backLeftShin.rotateAngleX = -0.08726646f * llllllllllllIlIlllIlllllllIlIIII + (-llllllllllllIlIlllIlllllllIIIIll * 0.5f * llllllllllllIlIlllIllllllllIIIII - Math.max(0.0f, llllllllllllIlIlllIlllllllIIIIll * 0.5f * llllllllllllIlIlllIllllllllIIIII)) * llllllllllllIlIlllIlllllllIIlllI;
        this.backLeftHoof.rotateAngleX = this.backLeftShin.rotateAngleX;
        this.backRightLeg.rotateAngleX = llllllllllllIlIlllIllllllIlllIll + llllllllllllIlIlllIlllllllIIIIll * 0.5f * llllllllllllIlIlllIllllllllIIIII * llllllllllllIlIlllIlllllllIIlllI;
        this.backRightShin.rotateAngleX = -0.08726646f * llllllllllllIlIlllIlllllllIlIIII + (llllllllllllIlIlllIlllllllIIIIll * 0.5f * llllllllllllIlIlllIllllllllIIIII - Math.max(0.0f, -llllllllllllIlIlllIlllllllIIIIll * 0.5f * llllllllllllIlIlllIllllllllIIIII)) * llllllllllllIlIlllIlllllllIIlllI;
        this.backRightHoof.rotateAngleX = this.backRightShin.rotateAngleX;
        this.frontLeftLeg.rotateAngleX = llllllllllllIlIlllIllllllIllIlll;
        this.frontLeftShin.rotateAngleX = (this.frontLeftLeg.rotateAngleX + 3.1415927f * Math.max(0.0f, 0.2f + llllllllllllIlIlllIllllllIlllIIl * 0.2f)) * llllllllllllIlIlllIlllllllIlIIII + (llllllllllllIlIlllIlllllllIIIIIl + Math.max(0.0f, llllllllllllIlIlllIlllllllIIIIll * 0.5f * llllllllllllIlIlllIllllllllIIIII)) * llllllllllllIlIlllIlllllllIIlllI;
        this.frontLeftHoof.rotateAngleX = this.frontLeftShin.rotateAngleX;
        this.frontRightLeg.rotateAngleX = llllllllllllIlIlllIllllllIllIlIl;
        this.frontRightShin.rotateAngleX = (this.frontRightLeg.rotateAngleX + 3.1415927f * Math.max(0.0f, 0.2f - llllllllllllIlIlllIllllllIlllIIl * 0.2f)) * llllllllllllIlIlllIlllllllIlIIII + (-llllllllllllIlIlllIlllllllIIIIIl + Math.max(0.0f, -llllllllllllIlIlllIlllllllIIIIll * 0.5f * llllllllllllIlIlllIllllllllIIIII)) * llllllllllllIlIlllIlllllllIIlllI;
        this.frontRightHoof.rotateAngleX = this.frontRightShin.rotateAngleX;
        this.backLeftHoof.rotationPointY = this.backLeftShin.rotationPointY;
        this.backLeftHoof.rotationPointZ = this.backLeftShin.rotationPointZ;
        this.backRightHoof.rotationPointY = this.backRightShin.rotationPointY;
        this.backRightHoof.rotationPointZ = this.backRightShin.rotationPointZ;
        this.frontLeftHoof.rotationPointY = this.frontLeftShin.rotationPointY;
        this.frontLeftHoof.rotationPointZ = this.frontLeftShin.rotationPointZ;
        this.frontRightHoof.rotationPointY = this.frontRightShin.rotationPointY;
        this.frontRightHoof.rotationPointZ = this.frontRightShin.rotationPointZ;
        if (lIlIIIIIIlIlIlII(llllllllllllIlIlllIlllllllIIlIIl ? 1 : 0)) {
            this.horseSaddleBottom.rotationPointY = llllllllllllIlIlllIlllllllIlIIII * 0.5f + llllllllllllIlIlllIlllllllIIlllI * 2.0f;
            this.horseSaddleBottom.rotationPointZ = llllllllllllIlIlllIlllllllIlIIII * 11.0f + llllllllllllIlIlllIlllllllIIlllI * 2.0f;
            this.horseSaddleFront.rotationPointY = this.horseSaddleBottom.rotationPointY;
            this.horseSaddleBack.rotationPointY = this.horseSaddleBottom.rotationPointY;
            this.horseLeftSaddleRope.rotationPointY = this.horseSaddleBottom.rotationPointY;
            this.horseRightSaddleRope.rotationPointY = this.horseSaddleBottom.rotationPointY;
            this.horseLeftSaddleMetal.rotationPointY = this.horseSaddleBottom.rotationPointY;
            this.horseRightSaddleMetal.rotationPointY = this.horseSaddleBottom.rotationPointY;
            this.muleLeftChest.rotationPointY = this.muleRightChest.rotationPointY;
            this.horseSaddleFront.rotationPointZ = this.horseSaddleBottom.rotationPointZ;
            this.horseSaddleBack.rotationPointZ = this.horseSaddleBottom.rotationPointZ;
            this.horseLeftSaddleRope.rotationPointZ = this.horseSaddleBottom.rotationPointZ;
            this.horseRightSaddleRope.rotationPointZ = this.horseSaddleBottom.rotationPointZ;
            this.horseLeftSaddleMetal.rotationPointZ = this.horseSaddleBottom.rotationPointZ;
            this.horseRightSaddleMetal.rotationPointZ = this.horseSaddleBottom.rotationPointZ;
            this.muleLeftChest.rotationPointZ = this.muleRightChest.rotationPointZ;
            this.horseSaddleBottom.rotateAngleX = this.body.rotateAngleX;
            this.horseSaddleFront.rotateAngleX = this.body.rotateAngleX;
            this.horseSaddleBack.rotateAngleX = this.body.rotateAngleX;
            this.horseLeftRein.rotationPointY = this.head.rotationPointY;
            this.horseRightRein.rotationPointY = this.head.rotationPointY;
            this.horseFaceRopes.rotationPointY = this.head.rotationPointY;
            this.horseLeftFaceMetal.rotationPointY = this.head.rotationPointY;
            this.horseRightFaceMetal.rotationPointY = this.head.rotationPointY;
            this.horseLeftRein.rotationPointZ = this.head.rotationPointZ;
            this.horseRightRein.rotationPointZ = this.head.rotationPointZ;
            this.horseFaceRopes.rotationPointZ = this.head.rotationPointZ;
            this.horseLeftFaceMetal.rotationPointZ = this.head.rotationPointZ;
            this.horseRightFaceMetal.rotationPointZ = this.head.rotationPointZ;
            this.horseLeftRein.rotateAngleX = llllllllllllIlIlllIlllllllIlIllI;
            this.horseRightRein.rotateAngleX = llllllllllllIlIlllIlllllllIlIllI;
            this.horseFaceRopes.rotateAngleX = this.head.rotateAngleX;
            this.horseLeftFaceMetal.rotateAngleX = this.head.rotateAngleX;
            this.horseRightFaceMetal.rotateAngleX = this.head.rotateAngleX;
            this.horseFaceRopes.rotateAngleY = this.head.rotateAngleY;
            this.horseLeftFaceMetal.rotateAngleY = this.head.rotateAngleY;
            this.horseLeftRein.rotateAngleY = this.head.rotateAngleY;
            this.horseRightFaceMetal.rotateAngleY = this.head.rotateAngleY;
            this.horseRightRein.rotateAngleY = this.head.rotateAngleY;
            if (lIlIIIIIIlIlIlII(llllllllllllIlIlllIlllllllIIIlll ? 1 : 0)) {
                this.horseLeftSaddleRope.rotateAngleX = -1.0471976f;
                this.horseLeftSaddleMetal.rotateAngleX = -1.0471976f;
                this.horseRightSaddleRope.rotateAngleX = -1.0471976f;
                this.horseRightSaddleMetal.rotateAngleX = -1.0471976f;
                this.horseLeftSaddleRope.rotateAngleZ = 0.0f;
                this.horseLeftSaddleMetal.rotateAngleZ = 0.0f;
                this.horseRightSaddleRope.rotateAngleZ = 0.0f;
                this.horseRightSaddleMetal.rotateAngleZ = 0.0f;
                "".length();
                if ((0x26 ^ 0x17 ^ (0x81 ^ 0xB5)) == 0x0) {
                    return;
                }
            }
            else {
                this.horseLeftSaddleRope.rotateAngleX = llllllllllllIlIlllIlllllllIIIIIl / 3.0f;
                this.horseLeftSaddleMetal.rotateAngleX = llllllllllllIlIlllIlllllllIIIIIl / 3.0f;
                this.horseRightSaddleRope.rotateAngleX = llllllllllllIlIlllIlllllllIIIIIl / 3.0f;
                this.horseRightSaddleMetal.rotateAngleX = llllllllllllIlIlllIlllllllIIIIIl / 3.0f;
                this.horseLeftSaddleRope.rotateAngleZ = llllllllllllIlIlllIlllllllIIIIIl / 5.0f;
                this.horseLeftSaddleMetal.rotateAngleZ = llllllllllllIlIlllIlllllllIIIIIl / 5.0f;
                this.horseRightSaddleRope.rotateAngleZ = -llllllllllllIlIlllIlllllllIIIIIl / 5.0f;
                this.horseRightSaddleMetal.rotateAngleZ = -llllllllllllIlIlllIlllllllIIIIIl / 5.0f;
            }
        }
        llllllllllllIlIlllIllllllIllllll = -1.3089f + llllllllllllIlIlllIllllllllIIIII * 1.5f;
        if (lIlIIIIIIlIlllll(lIlIIIIIIlIlllIl(llllllllllllIlIlllIllllllIllllll, 0.0f))) {
            llllllllllllIlIlllIllllllIllllll = 0.0f;
        }
        if (lIlIIIIIIlIlIlII(llllllllllllIlIlllIlllllllIIlIll ? 1 : 0)) {
            this.tailBase.rotateAngleY = MathHelper.cos(llllllllllllIlIlllIlllllllIIIlIl * 0.7f);
            llllllllllllIlIlllIllllllIllllll = 0.0f;
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        else {
            this.tailBase.rotateAngleY = 0.0f;
        }
        this.tailMiddle.rotateAngleY = this.tailBase.rotateAngleY;
        this.tailTip.rotateAngleY = this.tailBase.rotateAngleY;
        this.tailMiddle.rotationPointY = this.tailBase.rotationPointY;
        this.tailTip.rotationPointY = this.tailBase.rotationPointY;
        this.tailMiddle.rotationPointZ = this.tailBase.rotationPointZ;
        this.tailTip.rotationPointZ = this.tailBase.rotationPointZ;
        this.tailBase.rotateAngleX = llllllllllllIlIlllIllllllIllllll;
        this.tailMiddle.rotateAngleX = llllllllllllIlIlllIllllllIllllll;
        this.tailTip.rotateAngleX = -0.2618f + llllllllllllIlIlllIllllllIllllll;
    }
    
    private static boolean lIlIIIIIIlIlIlII(final int llllllllllllIlIlllIlllllIlllllIl) {
        return llllllllllllIlIlllIlllllIlllllIl != 0;
    }
    
    private static int lIlIIIIIIlIllllI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
}
