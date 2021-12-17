// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity.layers;

import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.GlStateManager;
import client.cosmetics.impl.CapeChecker;
import net.minecraft.entity.player.EnumPlayerModelParts;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.entity.AbstractClientPlayer;

public class LayerCape implements LayerRenderer<AbstractClientPlayer>
{
    private final /* synthetic */ RenderPlayer playerRenderer;
    private static final /* synthetic */ int[] lIIlllIIIIllIl;
    private static final /* synthetic */ String[] lIIlllIIIIllII;
    
    @Override
    public boolean shouldCombineTextures() {
        return LayerCape.lIIlllIIIIllIl[0] != 0;
    }
    
    public LayerCape(final RenderPlayer lllllllllllllIIlIlIIIllllllIIlIl) {
        this.playerRenderer = lllllllllllllIIlIlIIIllllllIIlIl;
    }
    
    private static boolean llIllIlIlIlIllI(final int lllllllllllllIIlIlIIIllllIIIIlIl) {
        return lllllllllllllIIlIlIIIllllIIIIlIl == 0;
    }
    
    private static int llIllIlIlIlIlII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static void llIllIlIlIlIIll() {
        (lIIlllIIIIllIl = new int[2])[0] = ((39 + 47 - 23 + 133 ^ 16 + 73 - 29 + 79) & (0xA7 ^ 0xBE ^ (0xE ^ 0x58) ^ -" ".length()));
        LayerCape.lIIlllIIIIllIl[1] = " ".length();
    }
    
    private static void llIllIlIlIlIIlI() {
        (lIIlllIIIIllII = new String[LayerCape.lIIlllIIIIllIl[1]])[LayerCape.lIIlllIIIIllIl[0]] = llIllIlIlIlIIIl("PBUlNCM0Czc2MiZXJzI2MFY0PSE=", "UxDSF");
    }
    
    private static String llIllIlIlIlIIIl(String lllllllllllllIIlIlIIIllllIIlIlIl, final String lllllllllllllIIlIlIIIllllIIlIlII) {
        lllllllllllllIIlIlIIIllllIIlIlIl = new String(Base64.getDecoder().decode(lllllllllllllIIlIlIIIllllIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIlIIIllllIIllIII = new StringBuilder();
        final char[] lllllllllllllIIlIlIIIllllIIlIlll = lllllllllllllIIlIlIIIllllIIlIlII.toCharArray();
        int lllllllllllllIIlIlIIIllllIIlIllI = LayerCape.lIIlllIIIIllIl[0];
        final Exception lllllllllllllIIlIlIIIllllIIlIIII = (Object)lllllllllllllIIlIlIIIllllIIlIlIl.toCharArray();
        final int lllllllllllllIIlIlIIIllllIIIllll = lllllllllllllIIlIlIIIllllIIlIIII.length;
        byte lllllllllllllIIlIlIIIllllIIIlllI = (byte)LayerCape.lIIlllIIIIllIl[0];
        while (llIllIlIlIllIII(lllllllllllllIIlIlIIIllllIIIlllI, lllllllllllllIIlIlIIIllllIIIllll)) {
            final char lllllllllllllIIlIlIIIllllIIllIll = lllllllllllllIIlIlIIIllllIIlIIII[lllllllllllllIIlIlIIIllllIIIlllI];
            lllllllllllllIIlIlIIIllllIIllIII.append((char)(lllllllllllllIIlIlIIIllllIIllIll ^ lllllllllllllIIlIlIIIllllIIlIlll[lllllllllllllIIlIlIIIllllIIlIllI % lllllllllllllIIlIlIIIllllIIlIlll.length]));
            "".length();
            ++lllllllllllllIIlIlIIIllllIIlIllI;
            ++lllllllllllllIIlIlIIIllllIIIlllI;
            "".length();
            if (" ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIlIIIllllIIllIII);
    }
    
    private static boolean llIllIlIlIllIII(final int lllllllllllllIIlIlIIIllllIIIlIlI, final int lllllllllllllIIlIlIIIllllIIIlIIl) {
        return lllllllllllllIIlIlIIIllllIIIlIlI < lllllllllllllIIlIlIIIllllIIIlIIl;
    }
    
    static {
        llIllIlIlIlIIll();
        llIllIlIlIlIIlI();
    }
    
    private static boolean llIllIlIlIlIlIl(final int lllllllllllllIIlIlIIIllllIIIIlll) {
        return lllllllllllllIIlIlIIIllllIIIIlll != 0;
    }
    
    private static boolean llIllIlIlIlIlll(final int lllllllllllllIIlIlIIIllllIIIIIll) {
        return lllllllllllllIIlIlIIIllllIIIIIll < 0;
    }
    
    @Override
    public void doRenderLayer(final AbstractClientPlayer lllllllllllllIIlIlIIIlllllIlIllI, final float lllllllllllllIIlIlIIIlllllIlIlIl, final float lllllllllllllIIlIlIIIlllllIlIlII, final float lllllllllllllIIlIlIIIlllllIlIIll, final float lllllllllllllIIlIlIIIlllllIlIIlI, final float lllllllllllllIIlIlIIIlllllIlIIIl, final float lllllllllllllIIlIlIIIlllllIlIIII, final float lllllllllllllIIlIlIIIlllllIIllll) {
        if (llIllIlIlIlIlIl(lllllllllllllIIlIlIIIlllllIlIllI.hasPlayerInfo() ? 1 : 0) && llIllIlIlIlIllI(lllllllllllllIIlIlIIIlllllIlIllI.isInvisible() ? 1 : 0) && llIllIlIlIlIlIl(lllllllllllllIIlIlIIIlllllIlIllI.isWearing(EnumPlayerModelParts.CAPE) ? 1 : 0) && llIllIlIlIlIlIl(CapeChecker.ownsCape(lllllllllllllIIlIlIIIlllllIlIllI) ? 1 : 0)) {
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            this.playerRenderer.bindTexture(new ResourceLocation(LayerCape.lIIlllIIIIllII[LayerCape.lIIlllIIIIllIl[0]]));
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.0f, 0.0f, 0.125f);
            final double lllllllllllllIIlIlIIIlllllIIlllI = lllllllllllllIIlIlIIIlllllIlIllI.prevChasingPosX + (lllllllllllllIIlIlIIIlllllIlIllI.chasingPosX - lllllllllllllIIlIlIIIlllllIlIllI.prevChasingPosX) * lllllllllllllIIlIlIIIlllllIlIIll - (lllllllllllllIIlIlIIIlllllIlIllI.prevPosX + (lllllllllllllIIlIlIIIlllllIlIllI.posX - lllllllllllllIIlIlIIIlllllIlIllI.prevPosX) * lllllllllllllIIlIlIIIlllllIlIIll);
            final double lllllllllllllIIlIlIIIlllllIIllIl = lllllllllllllIIlIlIIIlllllIlIllI.prevChasingPosY + (lllllllllllllIIlIlIIIlllllIlIllI.chasingPosY - lllllllllllllIIlIlIIIlllllIlIllI.prevChasingPosY) * lllllllllllllIIlIlIIIlllllIlIIll - (lllllllllllllIIlIlIIIlllllIlIllI.prevPosY + (lllllllllllllIIlIlIIIlllllIlIllI.posY - lllllllllllllIIlIlIIIlllllIlIllI.prevPosY) * lllllllllllllIIlIlIIIlllllIlIIll);
            final double lllllllllllllIIlIlIIIlllllIIllII = lllllllllllllIIlIlIIIlllllIlIllI.prevChasingPosZ + (lllllllllllllIIlIlIIIlllllIlIllI.chasingPosZ - lllllllllllllIIlIlIIIlllllIlIllI.prevChasingPosZ) * lllllllllllllIIlIlIIIlllllIlIIll - (lllllllllllllIIlIlIIIlllllIlIllI.prevPosZ + (lllllllllllllIIlIlIIIlllllIlIllI.posZ - lllllllllllllIIlIlIIIlllllIlIllI.prevPosZ) * lllllllllllllIIlIlIIIlllllIlIIll);
            final float lllllllllllllIIlIlIIIlllllIIlIll = lllllllllllllIIlIlIIIlllllIlIllI.prevRenderYawOffset + (lllllllllllllIIlIlIIIlllllIlIllI.renderYawOffset - lllllllllllllIIlIlIIIlllllIlIllI.prevRenderYawOffset) * lllllllllllllIIlIlIIIlllllIlIIll;
            final double lllllllllllllIIlIlIIIlllllIIlIlI = MathHelper.sin(lllllllllllllIIlIlIIIlllllIIlIll * 3.1415927f / 180.0f);
            final double lllllllllllllIIlIlIIIlllllIIlIIl = -MathHelper.cos(lllllllllllllIIlIlIIIlllllIIlIll * 3.1415927f / 180.0f);
            float lllllllllllllIIlIlIIIlllllIIlIII = (float)lllllllllllllIIlIlIIIlllllIIllIl * 10.0f;
            lllllllllllllIIlIlIIIlllllIIlIII = MathHelper.clamp_float(lllllllllllllIIlIlIIIlllllIIlIII, -6.0f, 32.0f);
            float lllllllllllllIIlIlIIIlllllIIIlll = (float)(lllllllllllllIIlIlIIIlllllIIlllI * lllllllllllllIIlIlIIIlllllIIlIlI + lllllllllllllIIlIlIIIlllllIIllII * lllllllllllllIIlIlIIIlllllIIlIIl) * 100.0f;
            final float lllllllllllllIIlIlIIIlllllIIIllI = (float)(lllllllllllllIIlIlIIIlllllIIlllI * lllllllllllllIIlIlIIIlllllIIlIIl - lllllllllllllIIlIlIIIlllllIIllII * lllllllllllllIIlIlIIIlllllIIlIlI) * 100.0f;
            if (llIllIlIlIlIlll(llIllIlIlIlIlII(lllllllllllllIIlIlIIIlllllIIIlll, 0.0f))) {
                lllllllllllllIIlIlIIIlllllIIIlll = 0.0f;
            }
            final float lllllllllllllIIlIlIIIlllllIIIlIl = lllllllllllllIIlIlIIIlllllIlIllI.prevCameraYaw + (lllllllllllllIIlIlIIIlllllIlIllI.cameraYaw - lllllllllllllIIlIlIIIlllllIlIllI.prevCameraYaw) * lllllllllllllIIlIlIIIlllllIlIIll;
            lllllllllllllIIlIlIIIlllllIIlIII += MathHelper.sin((lllllllllllllIIlIlIIIlllllIlIllI.prevDistanceWalkedModified + (lllllllllllllIIlIlIIIlllllIlIllI.distanceWalkedModified - lllllllllllllIIlIlIIIlllllIlIllI.prevDistanceWalkedModified) * lllllllllllllIIlIlIIIlllllIlIIll) * 6.0f) * 32.0f * lllllllllllllIIlIlIIIlllllIIIlIl;
            if (llIllIlIlIlIlIl(lllllllllllllIIlIlIIIlllllIlIllI.isSneaking() ? 1 : 0)) {
                lllllllllllllIIlIlIIIlllllIIlIII += 25.0f;
            }
            GlStateManager.rotate(6.0f + lllllllllllllIIlIlIIIlllllIIIlll / 2.0f + lllllllllllllIIlIlIIIlllllIIlIII, 1.0f, 0.0f, 0.0f);
            GlStateManager.rotate(lllllllllllllIIlIlIIIlllllIIIllI / 2.0f, 0.0f, 0.0f, 1.0f);
            GlStateManager.rotate(-lllllllllllllIIlIlIIIlllllIIIllI / 2.0f, 0.0f, 1.0f, 0.0f);
            GlStateManager.rotate(180.0f, 0.0f, 1.0f, 0.0f);
            this.playerRenderer.getMainModel().renderCape(0.0625f);
            GlStateManager.popMatrix();
        }
    }
}
