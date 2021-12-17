// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.layers.LayerEnderDragonDeath;
import net.minecraft.client.renderer.entity.layers.LayerEnderDragonEyes;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.client.model.ModelDragon;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.boss.EntityDragon;

public class RenderDragon extends RenderLiving<EntityDragon>
{
    private static final /* synthetic */ ResourceLocation enderDragonCrystalBeamTextures;
    private static final /* synthetic */ String[] lIIllllIlIllIl;
    private static final /* synthetic */ ResourceLocation enderDragonTextures;
    protected /* synthetic */ ModelDragon modelDragon;
    private static final /* synthetic */ ResourceLocation enderDragonExplodingTextures;
    private static final /* synthetic */ int[] lIIllllIlIlllI;
    
    @Override
    public void doRender(final EntityDragon lllllllllllllIIlIIlIlIIIllIIIlII, final double lllllllllllllIIlIIlIlIIIllIIIIll, final double lllllllllllllIIlIIlIlIIIllIIIIlI, final double lllllllllllllIIlIIlIlIIIlIlllIlI, final float lllllllllllllIIlIIlIlIIIllIIIIII, final float lllllllllllllIIlIIlIlIIIlIllllll) {
        BossStatus.setBossStatus(lllllllllllllIIlIIlIlIIIllIIIlII, (boolean)(RenderDragon.lIIllllIlIlllI[0] != 0));
        super.doRender(lllllllllllllIIlIIlIlIIIllIIIlII, lllllllllllllIIlIIlIlIIIllIIIIll, lllllllllllllIIlIIlIlIIIllIIIIlI, lllllllllllllIIlIIlIlIIIlIlllIlI, lllllllllllllIIlIIlIlIIIllIIIIII, lllllllllllllIIlIIlIlIIIlIllllll);
        if (llIllllIIIIllll(lllllllllllllIIlIIlIlIIIllIIIlII.healingEnderCrystal)) {
            this.drawRechargeRay(lllllllllllllIIlIIlIlIIIllIIIlII, lllllllllllllIIlIIlIlIIIllIIIIll, lllllllllllllIIlIIlIlIIIllIIIIlI, lllllllllllllIIlIIlIlIIIlIlllIlI, lllllllllllllIIlIIlIlIIIlIllllll);
        }
    }
    
    @Override
    protected void rotateCorpse(final EntityDragon lllllllllllllIIlIIlIlIIIlllIllII, final float lllllllllllllIIlIIlIlIIIllllIIll, final float lllllllllllllIIlIIlIlIIIllllIIlI, final float lllllllllllllIIlIIlIlIIIlllIlIll) {
        final float lllllllllllllIIlIIlIlIIIllllIIII = (float)lllllllllllllIIlIIlIlIIIlllIllII.getMovementOffsets(RenderDragon.lIIllllIlIlllI[3], lllllllllllllIIlIIlIlIIIlllIlIll)[RenderDragon.lIIllllIlIlllI[0]];
        final float lllllllllllllIIlIIlIlIIIlllIllll = (float)(lllllllllllllIIlIIlIlIIIlllIllII.getMovementOffsets(RenderDragon.lIIllllIlIlllI[4], lllllllllllllIIlIIlIlIIIlllIlIll)[RenderDragon.lIIllllIlIlllI[1]] - lllllllllllllIIlIIlIlIIIlllIllII.getMovementOffsets(RenderDragon.lIIllllIlIlllI[5], lllllllllllllIIlIIlIlIIIlllIlIll)[RenderDragon.lIIllllIlIlllI[1]]);
        GlStateManager.rotate(-lllllllllllllIIlIIlIlIIIllllIIII, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(lllllllllllllIIlIIlIlIIIlllIllll * 10.0f, 1.0f, 0.0f, 0.0f);
        GlStateManager.translate(0.0f, 0.0f, 1.0f);
        if (llIllllIIIIlllI(lllllllllllllIIlIIlIlIIIlllIllII.deathTime)) {
            float lllllllllllllIIlIIlIlIIIlllIlllI = (lllllllllllllIIlIIlIlIIIlllIllII.deathTime + lllllllllllllIIlIIlIlIIIlllIlIll - 1.0f) / 20.0f * 1.6f;
            lllllllllllllIIlIIlIlIIIlllIlllI = MathHelper.sqrt_float(lllllllllllllIIlIIlIlIIIlllIlllI);
            if (llIllllIIIIlllI(llIllllIIIIllIl(lllllllllllllIIlIIlIlIIIlllIlllI, 1.0f))) {
                lllllllllllllIIlIIlIlIIIlllIlllI = 1.0f;
            }
            GlStateManager.rotate(lllllllllllllIIlIIlIlIIIlllIlllI * this.getDeathMaxRotation(lllllllllllllIIlIIlIlIIIlllIllII), 0.0f, 0.0f, 1.0f);
        }
    }
    
    protected void drawRechargeRay(final EntityDragon lllllllllllllIIlIIlIlIIIlIlIIIII, final double lllllllllllllIIlIIlIlIIIlIIlllll, final double lllllllllllllIIlIIlIlIIIlIIllllI, final double lllllllllllllIIlIIlIlIIIlIIIIlll, final float lllllllllllllIIlIIlIlIIIlIIlllII) {
        final float lllllllllllllIIlIIlIlIIIlIIllIll = lllllllllllllIIlIIlIlIIIlIlIIIII.healingEnderCrystal.innerRotation + lllllllllllllIIlIIlIlIIIlIIlllII;
        float lllllllllllllIIlIIlIlIIIlIIllIlI = MathHelper.sin(lllllllllllllIIlIIlIlIIIlIIllIll * 0.2f) / 2.0f + 0.5f;
        lllllllllllllIIlIIlIlIIIlIIllIlI = (lllllllllllllIIlIIlIlIIIlIIllIlI * lllllllllllllIIlIIlIlIIIlIIllIlI + lllllllllllllIIlIIlIlIIIlIIllIlI) * 0.2f;
        final float lllllllllllllIIlIIlIlIIIlIIllIIl = (float)(lllllllllllllIIlIIlIlIIIlIlIIIII.healingEnderCrystal.posX - lllllllllllllIIlIIlIlIIIlIlIIIII.posX - (lllllllllllllIIlIIlIlIIIlIlIIIII.prevPosX - lllllllllllllIIlIIlIlIIIlIlIIIII.posX) * (1.0f - lllllllllllllIIlIIlIlIIIlIIlllII));
        final float lllllllllllllIIlIIlIlIIIlIIllIII = (float)(lllllllllllllIIlIIlIlIIIlIIllIlI + lllllllllllllIIlIIlIlIIIlIlIIIII.healingEnderCrystal.posY - 1.0 - lllllllllllllIIlIIlIlIIIlIlIIIII.posY - (lllllllllllllIIlIIlIlIIIlIlIIIII.prevPosY - lllllllllllllIIlIIlIlIIIlIlIIIII.posY) * (1.0f - lllllllllllllIIlIIlIlIIIlIIlllII));
        final float lllllllllllllIIlIIlIlIIIlIIlIlll = (float)(lllllllllllllIIlIIlIlIIIlIlIIIII.healingEnderCrystal.posZ - lllllllllllllIIlIIlIlIIIlIlIIIII.posZ - (lllllllllllllIIlIIlIlIIIlIlIIIII.prevPosZ - lllllllllllllIIlIIlIlIIIlIlIIIII.posZ) * (1.0f - lllllllllllllIIlIIlIlIIIlIIlllII));
        final float lllllllllllllIIlIIlIlIIIlIIlIllI = MathHelper.sqrt_float(lllllllllllllIIlIIlIlIIIlIIllIIl * lllllllllllllIIlIIlIlIIIlIIllIIl + lllllllllllllIIlIIlIlIIIlIIlIlll * lllllllllllllIIlIIlIlIIIlIIlIlll);
        final float lllllllllllllIIlIIlIlIIIlIIlIlIl = MathHelper.sqrt_float(lllllllllllllIIlIIlIlIIIlIIllIIl * lllllllllllllIIlIIlIlIIIlIIllIIl + lllllllllllllIIlIIlIlIIIlIIllIII * lllllllllllllIIlIIlIlIIIlIIllIII + lllllllllllllIIlIIlIlIIIlIIlIlll * lllllllllllllIIlIIlIlIIIlIIlIlll);
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)lllllllllllllIIlIIlIlIIIlIIlllll, (float)lllllllllllllIIlIIlIlIIIlIIllllI + 2.0f, (float)lllllllllllllIIlIIlIlIIIlIIIIlll);
        GlStateManager.rotate((float)(-Math.atan2(lllllllllllllIIlIIlIlIIIlIIlIlll, lllllllllllllIIlIIlIlIIIlIIllIIl)) * 180.0f / 3.1415927f - 90.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate((float)(-Math.atan2(lllllllllllllIIlIIlIlIIIlIIlIllI, lllllllllllllIIlIIlIlIIIlIIllIII)) * 180.0f / 3.1415927f - 90.0f, 1.0f, 0.0f, 0.0f);
        final Tessellator lllllllllllllIIlIIlIlIIIlIIlIlII = Tessellator.getInstance();
        final WorldRenderer lllllllllllllIIlIIlIlIIIlIIlIIll = lllllllllllllIIlIIlIlIIIlIIlIlII.getWorldRenderer();
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableCull();
        this.bindTexture(RenderDragon.enderDragonCrystalBeamTextures);
        GlStateManager.shadeModel(RenderDragon.lIIllllIlIlllI[11]);
        final float lllllllllllllIIlIIlIlIIIlIIlIIlI = 0.0f - (lllllllllllllIIlIIlIlIIIlIlIIIII.ticksExisted + lllllllllllllIIlIIlIlIIIlIIlllII) * 0.01f;
        final float lllllllllllllIIlIIlIlIIIlIIlIIIl = MathHelper.sqrt_float(lllllllllllllIIlIIlIlIIIlIIllIIl * lllllllllllllIIlIIlIlIIIlIIllIIl + lllllllllllllIIlIIlIlIIIlIIllIII * lllllllllllllIIlIIlIlIIIlIIllIII + lllllllllllllIIlIIlIlIIIlIIlIlll * lllllllllllllIIlIIlIlIIIlIIlIlll) / 32.0f - (lllllllllllllIIlIIlIlIIIlIlIIIII.ticksExisted + lllllllllllllIIlIIlIlIIIlIIlllII) * 0.01f;
        lllllllllllllIIlIIlIlIIIlIIlIIll.begin(RenderDragon.lIIllllIlIlllI[4], DefaultVertexFormats.POSITION_TEX_COLOR);
        final int lllllllllllllIIlIIlIlIIIlIIlIIII = RenderDragon.lIIllllIlIlllI[12];
        int lllllllllllllIIlIIlIlIIIlIIIllll = RenderDragon.lIIllllIlIlllI[0];
        "".length();
        if (-"  ".length() > 0) {
            return;
        }
        while (!llIllllIIIlIIII(lllllllllllllIIlIIlIlIIIlIIIllll, RenderDragon.lIIllllIlIlllI[12])) {
            final float lllllllllllllIIlIIlIlIIIlIIIlllI = MathHelper.sin(lllllllllllllIIlIIlIlIIIlIIIllll % RenderDragon.lIIllllIlIlllI[12] * 3.1415927f * 2.0f / 8.0f) * 0.75f;
            final float lllllllllllllIIlIIlIlIIIlIIIllIl = MathHelper.cos(lllllllllllllIIlIIlIlIIIlIIIllll % RenderDragon.lIIllllIlIlllI[12] * 3.1415927f * 2.0f / 8.0f) * 0.75f;
            final float lllllllllllllIIlIIlIlIIIlIIIllII = lllllllllllllIIlIIlIlIIIlIIIllll % RenderDragon.lIIllllIlIlllI[12] * 1.0f / 8.0f;
            lllllllllllllIIlIIlIlIIIlIIlIIll.pos(lllllllllllllIIlIIlIlIIIlIIIlllI * 0.2f, lllllllllllllIIlIIlIlIIIlIIIllIl * 0.2f, 0.0).tex(lllllllllllllIIlIIlIlIIIlIIIllII, lllllllllllllIIlIIlIlIIIlIIlIIIl).color(RenderDragon.lIIllllIlIlllI[0], RenderDragon.lIIllllIlIlllI[0], RenderDragon.lIIllllIlIlllI[0], RenderDragon.lIIllllIlIlllI[13]).endVertex();
            lllllllllllllIIlIIlIlIIIlIIlIIll.pos(lllllllllllllIIlIIlIlIIIlIIIlllI, lllllllllllllIIlIIlIlIIIlIIIllIl, lllllllllllllIIlIIlIlIIIlIIlIlIl).tex(lllllllllllllIIlIIlIlIIIlIIIllII, lllllllllllllIIlIIlIlIIIlIIlIIlI).color(RenderDragon.lIIllllIlIlllI[13], RenderDragon.lIIllllIlIlllI[13], RenderDragon.lIIllllIlIlllI[13], RenderDragon.lIIllllIlIlllI[13]).endVertex();
            ++lllllllllllllIIlIIlIlIIIlIIIllll;
        }
        lllllllllllllIIlIIlIlIIIlIIlIlII.draw();
        GlStateManager.enableCull();
        GlStateManager.shadeModel(RenderDragon.lIIllllIlIlllI[14]);
        RenderHelper.enableStandardItemLighting();
        GlStateManager.popMatrix();
    }
    
    private static void llIllllIIIIllII() {
        (lIIllllIlIlllI = new int[16])[0] = ((0x88 ^ 0x85 ^ "  ".length()) & (10 + 99 - 54 + 109 ^ 94 + 10 + 54 + 13 ^ -" ".length()));
        RenderDragon.lIIllllIlIlllI[1] = " ".length();
        RenderDragon.lIIllllIlIlllI[2] = "  ".length();
        RenderDragon.lIIllllIlIlllI[3] = (52 + 34 + 61 + 14 ^ 138 + 103 - 92 + 17);
        RenderDragon.lIIllllIlIlllI[4] = (106 + 164 - 178 + 75 ^ 102 + 28 - 48 + 80);
        RenderDragon.lIIllllIlIlllI[5] = (0x34 ^ 0x73 ^ (0x7 ^ 0x4A));
        RenderDragon.lIIllllIlIlllI[6] = (0xFFFF9AE7 & 0x671B);
        RenderDragon.lIIllllIlIlllI[7] = (0xFFFF9A8D & 0x6776);
        RenderDragon.lIIllllIlIlllI[8] = (-(0xFFFFFF67 & 0x49BD) & (0xFFFFEF7E & 0x5BA7));
        RenderDragon.lIIllllIlIlllI[9] = (0xFFFF938B & 0x6F76);
        RenderDragon.lIIllllIlIlllI[10] = (-(120 + 119 - 140 + 62) & (0xFFFF9FE7 & 0x63BB));
        RenderDragon.lIIllllIlIlllI[11] = (0xFFFFFDAD & 0x1F53);
        RenderDragon.lIIllllIlIlllI[12] = (12 + 52 + 61 + 47 ^ 122 + 137 - 129 + 34);
        RenderDragon.lIIllllIlIlllI[13] = 42 + 196 - 11 + 28;
        RenderDragon.lIIllllIlIlllI[14] = (-(0xFFFFFEF7 & 0x613E) & (0xFFFFFF35 & 0x7DFF));
        RenderDragon.lIIllllIlIlllI[15] = "   ".length();
    }
    
    private static boolean llIllllIIIlIIIl(final int lllllllllllllIIlIIlIlIIIIIlIllIl, final int lllllllllllllIIlIIlIlIIIIIlIllII) {
        return lllllllllllllIIlIIlIlIIIIIlIllIl < lllllllllllllIIlIIlIlIIIIIlIllII;
    }
    
    private static boolean llIllllIIIlIIII(final int lllllllllllllIIlIIlIlIIIIIlIlIIl, final int lllllllllllllIIlIIlIlIIIIIlIlIII) {
        return lllllllllllllIIlIIlIlIIIIIlIlIIl > lllllllllllllIIlIIlIlIIIIIlIlIII;
    }
    
    public RenderDragon(final RenderManager lllllllllllllIIlIIlIlIIIllllllII) {
        super(lllllllllllllIIlIIlIlIIIllllllII, new ModelDragon(0.0f), 0.5f);
        this.modelDragon = (ModelDragon)this.mainModel;
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerEnderDragonEyes(this));
        "".length();
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerEnderDragonDeath());
        "".length();
    }
    
    private static void llIllllIIIIlIll() {
        (lIIllllIlIllIl = new String[RenderDragon.lIIllllIlIlllI[15]])[RenderDragon.lIIllllIlIlllI[0]] = llIllllIIIIlIlI("LjYzBDooNjhfKjQnIgQ2dTYlFCooMDkJPC4yJ18qNDcuAiwoKjgELjYMKRUuN307Hig=", "ZSKpO");
        RenderDragon.lIIllllIlIllIl[RenderDragon.lIIllllIlIlllI[1]] = llIllllIIIIlIlI("OzUABDA9NQtfICEkEQQ8YDUWFCA9NAoRIiA+VxQ3LjcXHhoqKAgcKis5FhdrPz4f", "OPxpE");
        RenderDragon.lIIllllIlIllIl[RenderDragon.lIIllllIlIlllI[2]] = llIllllIIIIlIlI("JDMCFRsiMwlOCz4iExUXfzMUBQsiMggACT84VQUcMTEVD0AgOB0=", "PVzan");
    }
    
    @Override
    protected void renderModel(final EntityDragon lllllllllllllIIlIIlIlIIIllIlllIl, final float lllllllllllllIIlIIlIlIIIllIlIIll, final float lllllllllllllIIlIIlIlIIIllIllIll, final float lllllllllllllIIlIIlIlIIIllIllIlI, final float lllllllllllllIIlIIlIlIIIllIlIIII, final float lllllllllllllIIlIIlIlIIIllIllIII, final float lllllllllllllIIlIIlIlIIIllIlIlll) {
        if (llIllllIIIIlllI(lllllllllllllIIlIIlIlIIIllIlllIl.deathTicks)) {
            final float lllllllllllllIIlIIlIlIIIllIlIllI = lllllllllllllIIlIIlIlIIIllIlllIl.deathTicks / 200.0f;
            GlStateManager.depthFunc(RenderDragon.lIIllllIlIlllI[6]);
            GlStateManager.enableAlpha();
            GlStateManager.alphaFunc(RenderDragon.lIIllllIlIlllI[7], lllllllllllllIIlIIlIlIIIllIlIllI);
            this.bindTexture(RenderDragon.enderDragonExplodingTextures);
            this.mainModel.render(lllllllllllllIIlIIlIlIIIllIlllIl, lllllllllllllIIlIIlIlIIIllIlIIll, lllllllllllllIIlIIlIlIIIllIllIll, lllllllllllllIIlIIlIlIIIllIllIlI, lllllllllllllIIlIIlIlIIIllIlIIII, lllllllllllllIIlIIlIlIIIllIllIII, lllllllllllllIIlIIlIlIIIllIlIlll);
            GlStateManager.alphaFunc(RenderDragon.lIIllllIlIlllI[7], 0.1f);
            GlStateManager.depthFunc(RenderDragon.lIIllllIlIlllI[8]);
        }
        this.bindEntityTexture(lllllllllllllIIlIIlIlIIIllIlllIl);
        "".length();
        this.mainModel.render(lllllllllllllIIlIIlIlIIIllIlllIl, lllllllllllllIIlIIlIlIIIllIlIIll, lllllllllllllIIlIIlIlIIIllIllIll, lllllllllllllIIlIIlIlIIIllIllIlI, lllllllllllllIIlIIlIlIIIllIlIIII, lllllllllllllIIlIIlIlIIIllIllIII, lllllllllllllIIlIIlIlIIIllIlIlll);
        if (llIllllIIIIlllI(lllllllllllllIIlIIlIlIIIllIlllIl.hurtTime)) {
            GlStateManager.depthFunc(RenderDragon.lIIllllIlIlllI[8]);
            GlStateManager.disableTexture2D();
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(RenderDragon.lIIllllIlIlllI[9], RenderDragon.lIIllllIlIlllI[10]);
            GlStateManager.color(1.0f, 0.0f, 0.0f, 0.5f);
            this.mainModel.render(lllllllllllllIIlIIlIlIIIllIlllIl, lllllllllllllIIlIIlIlIIIllIlIIll, lllllllllllllIIlIIlIlIIIllIllIll, lllllllllllllIIlIIlIlIIIllIllIlI, lllllllllllllIIlIIlIlIIIllIlIIII, lllllllllllllIIlIIlIlIIIllIllIII, lllllllllllllIIlIIlIlIIIllIlIlll);
            GlStateManager.enableTexture2D();
            GlStateManager.disableBlend();
            GlStateManager.depthFunc(RenderDragon.lIIllllIlIlllI[6]);
        }
    }
    
    private static int llIllllIIIIllIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    static {
        llIllllIIIIllII();
        llIllllIIIIlIll();
        enderDragonCrystalBeamTextures = new ResourceLocation(RenderDragon.lIIllllIlIllIl[RenderDragon.lIIllllIlIlllI[0]]);
        enderDragonExplodingTextures = new ResourceLocation(RenderDragon.lIIllllIlIllIl[RenderDragon.lIIllllIlIlllI[1]]);
        enderDragonTextures = new ResourceLocation(RenderDragon.lIIllllIlIllIl[RenderDragon.lIIllllIlIlllI[2]]);
    }
    
    private static boolean llIllllIIIIllll(final Object lllllllllllllIIlIIlIlIIIIIlIIllI) {
        return lllllllllllllIIlIIlIlIIIIIlIIllI != null;
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityDragon lllllllllllllIIlIIlIlIIIIlllIlII) {
        return RenderDragon.enderDragonTextures;
    }
    
    private static boolean llIllllIIIIlllI(final int lllllllllllllIIlIIlIlIIIIIlIIlII) {
        return lllllllllllllIIlIIlIlIIIIIlIIlII > 0;
    }
    
    private static String llIllllIIIIlIlI(String lllllllllllllIIlIIlIlIIIIIlllIII, final String lllllllllllllIIlIIlIlIIIIIllIlll) {
        lllllllllllllIIlIIlIlIIIIIlllIII = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIlIlIIIIIlllIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIlIlIIIIIlllIll = new StringBuilder();
        final char[] lllllllllllllIIlIIlIlIIIIIlllIlI = lllllllllllllIIlIIlIlIIIIIllIlll.toCharArray();
        int lllllllllllllIIlIIlIlIIIIIlllIIl = RenderDragon.lIIllllIlIlllI[0];
        final boolean lllllllllllllIIlIIlIlIIIIIllIIll = (Object)((String)lllllllllllllIIlIIlIlIIIIIlllIII).toCharArray();
        final String lllllllllllllIIlIIlIlIIIIIllIIlI = (String)lllllllllllllIIlIIlIlIIIIIllIIll.length;
        Exception lllllllllllllIIlIIlIlIIIIIllIIIl = (Exception)RenderDragon.lIIllllIlIlllI[0];
        while (llIllllIIIlIIIl((int)lllllllllllllIIlIIlIlIIIIIllIIIl, (int)lllllllllllllIIlIIlIlIIIIIllIIlI)) {
            final char lllllllllllllIIlIIlIlIIIIIlllllI = lllllllllllllIIlIIlIlIIIIIllIIll[lllllllllllllIIlIIlIlIIIIIllIIIl];
            lllllllllllllIIlIIlIlIIIIIlllIll.append((char)(lllllllllllllIIlIIlIlIIIIIlllllI ^ lllllllllllllIIlIIlIlIIIIIlllIlI[lllllllllllllIIlIIlIlIIIIIlllIIl % lllllllllllllIIlIIlIlIIIIIlllIlI.length]));
            "".length();
            ++lllllllllllllIIlIIlIlIIIIIlllIIl;
            ++lllllllllllllIIlIIlIlIIIIIllIIIl;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIlIlIIIIIlllIll);
    }
}
