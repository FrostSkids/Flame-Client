// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.item.ItemStack;
import net.minecraft.item.EnumAction;
import net.minecraft.entity.player.EnumPlayerModelParts;
import net.minecraft.client.entity.EntityPlayerSP;
import client.cosmetics.impl.CosmeticCrystalWings;
import client.cosmetics.impl.CosmSunGlasses;
import client.cosmetics.impl.CosmeticHalo;
import client.cosmetics.impl.CosmeticDragonWings;
import client.cosmetics.impl.CosmeticTopHat;
import net.minecraft.client.renderer.entity.layers.LayerCustomHead;
import net.minecraft.client.renderer.entity.layers.LayerCape;
import net.minecraft.client.renderer.entity.layers.LayerDeadmau5Head;
import net.minecraft.client.renderer.entity.layers.LayerArrow;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.client.model.ModelBase;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.client.entity.AbstractClientPlayer;

public class RenderPlayer extends RendererLivingEntity<AbstractClientPlayer>
{
    private static final /* synthetic */ String[] lIIlIlllIIIllI;
    private /* synthetic */ boolean smallArms;
    private static final /* synthetic */ int[] lIIlIlllIIlIIl;
    
    @Override
    protected void renderLivingAt(final AbstractClientPlayer lllllllllllllIIllIIIIlIlIIIlIllI, final double lllllllllllllIIllIIIIlIlIIIllIlI, final double lllllllllllllIIllIIIIlIlIIIllIIl, final double lllllllllllllIIllIIIIlIlIIIlIIll) {
        if (llIlIIlllIllllI(lllllllllllllIIllIIIIlIlIIIlIllI.isEntityAlive() ? 1 : 0) && llIlIIlllIllllI(lllllllllllllIIllIIIIlIlIIIlIllI.isPlayerSleeping() ? 1 : 0)) {
            super.renderLivingAt(lllllllllllllIIllIIIIlIlIIIlIllI, lllllllllllllIIllIIIIlIlIIIllIlI + lllllllllllllIIllIIIIlIlIIIlIllI.renderOffsetX, lllllllllllllIIllIIIIlIlIIIllIIl + lllllllllllllIIllIIIIlIlIIIlIllI.renderOffsetY, lllllllllllllIIllIIIIlIlIIIlIIll + lllllllllllllIIllIIIIlIlIIIlIllI.renderOffsetZ);
            "".length();
            if (-(0x9A ^ 0x9E) >= 0) {
                return;
            }
        }
        else {
            super.renderLivingAt(lllllllllllllIIllIIIIlIlIIIlIllI, lllllllllllllIIllIIIIlIlIIIllIlI, lllllllllllllIIllIIIIlIlIIIllIIl, lllllllllllllIIllIIIIlIlIIIlIIll);
        }
    }
    
    @Override
    protected void rotateCorpse(final AbstractClientPlayer lllllllllllllIIllIIIIlIlIIIIllII, final float lllllllllllllIIllIIIIlIlIIIIIllI, final float lllllllllllllIIllIIIIlIlIIIIlIlI, final float lllllllllllllIIllIIIIlIlIIIIIlII) {
        if (llIlIIlllIllllI(lllllllllllllIIllIIIIlIlIIIIllII.isEntityAlive() ? 1 : 0) && llIlIIlllIllllI(lllllllllllllIIllIIIIlIlIIIIllII.isPlayerSleeping() ? 1 : 0)) {
            GlStateManager.rotate(lllllllllllllIIllIIIIlIlIIIIllII.getBedOrientationInDegrees(), 0.0f, 1.0f, 0.0f);
            GlStateManager.rotate(this.getDeathMaxRotation(lllllllllllllIIllIIIIlIlIIIIllII), 0.0f, 0.0f, 1.0f);
            GlStateManager.rotate(270.0f, 0.0f, 1.0f, 0.0f);
            "".length();
            if (-" ".length() > ((0x5E ^ 0x1B) & ~(0x85 ^ 0xC0))) {
                return;
            }
        }
        else {
            super.rotateCorpse(lllllllllllllIIllIIIIlIlIIIIllII, lllllllllllllIIllIIIIlIlIIIIIllI, lllllllllllllIIllIIIIlIlIIIIlIlI, lllllllllllllIIllIIIIlIlIIIIIlII);
        }
    }
    
    private static boolean llIlIIllllIIIII(final int lllllllllllllIIllIIIIlIIlIlIllIl) {
        return lllllllllllllIIllIIIIlIIlIlIllIl == 0;
    }
    
    @Override
    public void transformHeldFull3DItemLayer() {
        GlStateManager.translate(0.0f, 0.1875f, 0.0f);
    }
    
    public RenderPlayer(final RenderManager lllllllllllllIIllIIIIlIllIIllIIl) {
        this(lllllllllllllIIllIIIIlIllIIllIIl, (boolean)(RenderPlayer.lIIlIlllIIlIIl[0] != 0));
    }
    
    public void renderRightArm(final AbstractClientPlayer lllllllllllllIIllIIIIlIlIIllIlII) {
        final float lllllllllllllIIllIIIIlIlIIllIIll = 1.0f;
        GlStateManager.color(lllllllllllllIIllIIIIlIlIIllIIll, lllllllllllllIIllIIIIlIlIIllIIll, lllllllllllllIIllIIIIlIlIIllIIll);
        final ModelPlayer lllllllllllllIIllIIIIlIlIIllIIlI = this.getMainModel();
        this.setModelVisibilities(lllllllllllllIIllIIIIlIlIIllIlII);
        lllllllllllllIIllIIIIlIlIIllIIlI.swingProgress = 0.0f;
        lllllllllllllIIllIIIIlIlIIllIIlI.isSneak = (RenderPlayer.lIIlIlllIIlIIl[0] != 0);
        lllllllllllllIIllIIIIlIlIIllIIlI.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, lllllllllllllIIllIIIIlIlIIllIlII);
        lllllllllllllIIllIIIIlIlIIllIIlI.renderRightArm();
    }
    
    @Override
    protected void renderOffsetLivingLabel(final AbstractClientPlayer lllllllllllllIIllIIIIlIlIlIIlllI, final double lllllllllllllIIllIIIIlIlIlIIIIlI, double lllllllllllllIIllIIIIlIlIlIIIIIl, final double lllllllllllllIIllIIIIlIlIlIIlIll, final String lllllllllllllIIllIIIIlIlIIllllll, final float lllllllllllllIIllIIIIlIlIIlllllI, final double lllllllllllllIIllIIIIlIlIIllllIl) {
        if (llIlIIllllIIlII(llIlIIllllIIIll(lllllllllllllIIllIIIIlIlIIllllIl, 100.0))) {
            final Scoreboard lllllllllllllIIllIIIIlIlIlIIIlll = lllllllllllllIIllIIIIlIlIlIIlllI.getWorldScoreboard();
            final ScoreObjective lllllllllllllIIllIIIIlIlIlIIIllI = lllllllllllllIIllIIIIlIlIlIIIlll.getObjectiveInDisplaySlot(RenderPlayer.lIIlIlllIIlIIl[3]);
            if (llIlIIllllIIlIl(lllllllllllllIIllIIIIlIlIlIIIllI)) {
                final Score lllllllllllllIIllIIIIlIlIlIIIlIl = lllllllllllllIIllIIIIlIlIlIIIlll.getValueFromObjective(lllllllllllllIIllIIIIlIlIlIIlllI.getName(), lllllllllllllIIllIIIIlIlIlIIIllI);
                this.renderLivingLabel(lllllllllllllIIllIIIIlIlIlIIlllI, String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIllIIIIlIlIlIIIlIl.getScorePoints())).append(RenderPlayer.lIIlIlllIIIllI[RenderPlayer.lIIlIlllIIlIIl[0]]).append(lllllllllllllIIllIIIIlIlIlIIIllI.getDisplayName())), lllllllllllllIIllIIIIlIlIlIIIIlI, (double)lllllllllllllIIllIIIIlIlIlIIIIIl, lllllllllllllIIllIIIIlIlIlIIlIll, RenderPlayer.lIIlIlllIIlIIl[4]);
                lllllllllllllIIllIIIIlIlIlIIIIIl += this.getFontRendererFromRenderManager().FONT_HEIGHT * 1.15f * lllllllllllllIIllIIIIlIlIIlllllI;
            }
        }
        super.renderOffsetLivingLabel(lllllllllllllIIllIIIIlIlIlIIlllI, lllllllllllllIIllIIIIlIlIlIIIIlI, (double)lllllllllllllIIllIIIIlIlIlIIIIIl, lllllllllllllIIllIIIIlIlIlIIlIll, lllllllllllllIIllIIIIlIlIIllllll, lllllllllllllIIllIIIIlIlIIlllllI, lllllllllllllIIllIIIIlIlIIllllIl);
    }
    
    private static int llIlIIllllIIIll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean llIlIIllllIIlII(final int lllllllllllllIIllIIIIlIIlIlIlIll) {
        return lllllllllllllIIllIIIIlIIlIlIlIll < 0;
    }
    
    private static void llIlIIlllIlllIl() {
        (lIIlIlllIIlIIl = new int[6])[0] = ((0x6A ^ 0x1E ^ (0x45 ^ 0x1D)) & (180 + 60 - 172 + 122 ^ 119 + 11 + 4 + 12 ^ -" ".length()));
        RenderPlayer.lIIlIlllIIlIIl[1] = " ".length();
        RenderPlayer.lIIlIlllIIlIIl[2] = "   ".length();
        RenderPlayer.lIIlIlllIIlIIl[3] = "  ".length();
        RenderPlayer.lIIlIlllIIlIIl[4] = (0x7E ^ 0x3E);
        RenderPlayer.lIIlIlllIIlIIl[5] = (0x2 ^ 0xA);
    }
    
    static {
        llIlIIlllIlllIl();
        llIlIIlllIlllII();
    }
    
    private static boolean llIlIIlllIllllI(final int lllllllllllllIIllIIIIlIIlIlIllll) {
        return lllllllllllllIIllIIIIlIIlIlIllll != 0;
    }
    
    private static boolean llIlIIllllIIIIl(final Object lllllllllllllIIllIIIIlIIlIllIIIl) {
        return lllllllllllllIIllIIIIlIIlIllIIIl == null;
    }
    
    private static boolean llIlIIllllIIlIl(final Object lllllllllllllIIllIIIIlIIlIllIIll) {
        return lllllllllllllIIllIIIIlIIlIllIIll != null;
    }
    
    private static String llIlIIlllIllIll(final String lllllllllllllIIllIIIIlIIlIlllllI, final String lllllllllllllIIllIIIIlIIlIllllIl) {
        try {
            final SecretKeySpec lllllllllllllIIllIIIIlIIllIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIIIlIIlIllllIl.getBytes(StandardCharsets.UTF_8)), RenderPlayer.lIIlIlllIIlIIl[5]), "DES");
            final Cipher lllllllllllllIIllIIIIlIIllIIIIII = Cipher.getInstance("DES");
            lllllllllllllIIllIIIIlIIllIIIIII.init(RenderPlayer.lIIlIlllIIlIIl[3], lllllllllllllIIllIIIIlIIllIIIIIl);
            return new String(lllllllllllllIIllIIIIlIIllIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIIIlIIlIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIIIlIIlIllllll) {
            lllllllllllllIIllIIIIlIIlIllllll.printStackTrace();
            return null;
        }
    }
    
    public RenderPlayer(final RenderManager lllllllllllllIIllIIIIlIllIIlIlII, final boolean lllllllllllllIIllIIIIlIllIIlIIll) {
        super(lllllllllllllIIllIIIIlIllIIlIlII, new ModelPlayer(0.0f, lllllllllllllIIllIIIIlIllIIlIIll), 0.5f);
        this.smallArms = lllllllllllllIIllIIIIlIllIIlIIll;
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerBipedArmor(this));
        "".length();
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerHeldItem(this));
        "".length();
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerArrow(this));
        "".length();
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerDeadmau5Head(this));
        "".length();
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerCape(this));
        "".length();
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerCustomHead(this.getMainModel().bipedHead));
        "".length();
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new CosmeticTopHat(this));
        "".length();
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new CosmeticDragonWings(this));
        "".length();
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new CosmeticHalo(this));
        "".length();
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new CosmSunGlasses(this));
        "".length();
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new CosmeticCrystalWings(this));
        "".length();
    }
    
    @Override
    public void doRender(final AbstractClientPlayer lllllllllllllIIllIIIIlIllIIIIIll, final double lllllllllllllIIllIIIIlIllIIIIIlI, final double lllllllllllllIIllIIIIlIlIllllIIl, final double lllllllllllllIIllIIIIlIlIllllIII, final float lllllllllllllIIllIIIIlIlIlllllll, final float lllllllllllllIIllIIIIlIlIlllIllI) {
        if (!llIlIIlllIllllI(lllllllllllllIIllIIIIlIllIIIIIll.isUser() ? 1 : 0) || llIlIIlllIlllll(this.renderManager.livingPlayer, lllllllllllllIIllIIIIlIllIIIIIll)) {
            double lllllllllllllIIllIIIIlIlIlllllIl = lllllllllllllIIllIIIIlIlIllllIIl;
            if (llIlIIlllIllllI(lllllllllllllIIllIIIIlIllIIIIIll.isSneaking() ? 1 : 0) && llIlIIllllIIIII((lllllllllllllIIllIIIIlIllIIIIIll instanceof EntityPlayerSP) ? 1 : 0)) {
                lllllllllllllIIllIIIIlIlIlllllIl = lllllllllllllIIllIIIIlIlIllllIIl - 0.125;
            }
            this.setModelVisibilities(lllllllllllllIIllIIIIlIllIIIIIll);
            super.doRender(lllllllllllllIIllIIIIlIllIIIIIll, lllllllllllllIIllIIIIlIllIIIIIlI, lllllllllllllIIllIIIIlIlIlllllIl, lllllllllllllIIllIIIIlIlIllllIII, lllllllllllllIIllIIIIlIlIlllllll, lllllllllllllIIllIIIIlIlIlllIllI);
        }
    }
    
    private void setModelVisibilities(final AbstractClientPlayer lllllllllllllIIllIIIIlIlIllIlllI) {
        final ModelPlayer lllllllllllllIIllIIIIlIlIllIllIl = this.getMainModel();
        if (llIlIIlllIllllI(lllllllllllllIIllIIIIlIlIllIlllI.isSpectator() ? 1 : 0)) {
            lllllllllllllIIllIIIIlIlIllIllIl.setInvisible((boolean)(RenderPlayer.lIIlIlllIIlIIl[0] != 0));
            lllllllllllllIIllIIIIlIlIllIllIl.bipedHead.showModel = (RenderPlayer.lIIlIlllIIlIIl[1] != 0);
            lllllllllllllIIllIIIIlIlIllIllIl.bipedHeadwear.showModel = (RenderPlayer.lIIlIlllIIlIIl[1] != 0);
            "".length();
            if ((0x5A ^ 0x39 ^ (0x7D ^ 0x1A)) == 0x0) {
                return;
            }
        }
        else {
            final ItemStack lllllllllllllIIllIIIIlIlIllIllII = lllllllllllllIIllIIIIlIlIllIlllI.inventory.getCurrentItem();
            lllllllllllllIIllIIIIlIlIllIllIl.setInvisible((boolean)(RenderPlayer.lIIlIlllIIlIIl[1] != 0));
            lllllllllllllIIllIIIIlIlIllIllIl.bipedHeadwear.showModel = lllllllllllllIIllIIIIlIlIllIlllI.isWearing(EnumPlayerModelParts.HAT);
            lllllllllllllIIllIIIIlIlIllIllIl.bipedBodyWear.showModel = lllllllllllllIIllIIIIlIlIllIlllI.isWearing(EnumPlayerModelParts.JACKET);
            lllllllllllllIIllIIIIlIlIllIllIl.bipedLeftLegwear.showModel = lllllllllllllIIllIIIIlIlIllIlllI.isWearing(EnumPlayerModelParts.LEFT_PANTS_LEG);
            lllllllllllllIIllIIIIlIlIllIllIl.bipedRightLegwear.showModel = lllllllllllllIIllIIIIlIlIllIlllI.isWearing(EnumPlayerModelParts.RIGHT_PANTS_LEG);
            lllllllllllllIIllIIIIlIlIllIllIl.bipedLeftArmwear.showModel = lllllllllllllIIllIIIIlIlIllIlllI.isWearing(EnumPlayerModelParts.LEFT_SLEEVE);
            lllllllllllllIIllIIIIlIlIllIllIl.bipedRightArmwear.showModel = lllllllllllllIIllIIIIlIlIllIlllI.isWearing(EnumPlayerModelParts.RIGHT_SLEEVE);
            lllllllllllllIIllIIIIlIlIllIllIl.heldItemLeft = RenderPlayer.lIIlIlllIIlIIl[0];
            lllllllllllllIIllIIIIlIlIllIllIl.aimedBow = (RenderPlayer.lIIlIlllIIlIIl[0] != 0);
            lllllllllllllIIllIIIIlIlIllIllIl.isSneak = lllllllllllllIIllIIIIlIlIllIlllI.isSneaking();
            if (llIlIIllllIIIIl(lllllllllllllIIllIIIIlIlIllIllII)) {
                lllllllllllllIIllIIIIlIlIllIllIl.heldItemRight = RenderPlayer.lIIlIlllIIlIIl[0];
                "".length();
                if ((0x2D ^ 0x29) == 0x0) {
                    return;
                }
            }
            else {
                lllllllllllllIIllIIIIlIlIllIllIl.heldItemRight = RenderPlayer.lIIlIlllIIlIIl[1];
                if (llIlIIllllIIIlI(lllllllllllllIIllIIIIlIlIllIlllI.getItemInUseCount())) {
                    final EnumAction lllllllllllllIIllIIIIlIlIllIlIll = lllllllllllllIIllIIIIlIlIllIllII.getItemUseAction();
                    if (llIlIIlllIlllll(lllllllllllllIIllIIIIlIlIllIlIll, EnumAction.BLOCK)) {
                        lllllllllllllIIllIIIIlIlIllIllIl.heldItemRight = RenderPlayer.lIIlIlllIIlIIl[2];
                        "".length();
                        if (" ".length() < -" ".length()) {
                            return;
                        }
                    }
                    else if (llIlIIlllIlllll(lllllllllllllIIllIIIIlIlIllIlIll, EnumAction.BOW)) {
                        lllllllllllllIIllIIIIlIlIllIllIl.aimedBow = (RenderPlayer.lIIlIlllIIlIIl[1] != 0);
                    }
                }
            }
        }
    }
    
    public void renderLeftArm(final AbstractClientPlayer lllllllllllllIIllIIIIlIlIIlIlIII) {
        final float lllllllllllllIIllIIIIlIlIIlIIlll = 1.0f;
        GlStateManager.color(lllllllllllllIIllIIIIlIlIIlIIlll, lllllllllllllIIllIIIIlIlIIlIIlll, lllllllllllllIIllIIIIlIlIIlIIlll);
        final ModelPlayer lllllllllllllIIllIIIIlIlIIlIIllI = this.getMainModel();
        this.setModelVisibilities(lllllllllllllIIllIIIIlIlIIlIlIII);
        lllllllllllllIIllIIIIlIlIIlIIllI.isSneak = (RenderPlayer.lIIlIlllIIlIIl[0] != 0);
        lllllllllllllIIllIIIIlIlIIlIIllI.swingProgress = 0.0f;
        lllllllllllllIIllIIIIlIlIIlIIllI.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, lllllllllllllIIllIIIIlIlIIlIlIII);
        lllllllllllllIIllIIIIlIlIIlIIllI.renderLeftArm();
    }
    
    @Override
    protected void preRenderCallback(final AbstractClientPlayer lllllllllllllIIllIIIIlIlIlIllllI, final float lllllllllllllIIllIIIIlIlIlIlllIl) {
        final float lllllllllllllIIllIIIIlIlIlIlllII = 0.9375f;
        GlStateManager.scale(lllllllllllllIIllIIIIlIlIlIlllII, lllllllllllllIIllIIIIlIlIlIlllII, lllllllllllllIIllIIIIlIlIlIlllII);
    }
    
    private static boolean llIlIIllllIIIlI(final int lllllllllllllIIllIIIIlIIlIlIlIIl) {
        return lllllllllllllIIllIIIIlIIlIlIlIIl > 0;
    }
    
    private static boolean llIlIIlllIlllll(final Object lllllllllllllIIllIIIIlIIlIllIllI, final Object lllllllllllllIIllIIIIlIIlIllIlIl) {
        return lllllllllllllIIllIIIIlIIlIllIllI == lllllllllllllIIllIIIIlIIlIllIlIl;
    }
    
    @Override
    public ModelPlayer getMainModel() {
        return (ModelPlayer)super.getMainModel();
    }
    
    private static void llIlIIlllIlllII() {
        (lIIlIlllIIIllI = new String[RenderPlayer.lIIlIlllIIlIIl[1]])[RenderPlayer.lIIlIlllIIlIIl[0]] = llIlIIlllIllIll("U6/a8XeKHwc=", "FuEsO");
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final AbstractClientPlayer lllllllllllllIIllIIIIlIlIllIIIlI) {
        return lllllllllllllIIllIIIIlIlIllIIIlI.getLocationSkin();
    }
}
