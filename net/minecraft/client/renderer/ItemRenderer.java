// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.item.EnumAction;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Arrays;
import net.minecraft.world.storage.MapData;
import net.minecraft.world.World;
import net.minecraft.init.Items;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.util.MathHelper;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.client.renderer.entity.RenderItem;

public class ItemRenderer
{
    private final /* synthetic */ RenderItem itemRenderer;
    private /* synthetic */ ItemStack itemToRender;
    private /* synthetic */ float prevEquippedProgress;
    private /* synthetic */ float equippedProgress;
    private /* synthetic */ int equippedItemSlot;
    private static final /* synthetic */ ResourceLocation RES_MAP_BACKGROUND;
    private final /* synthetic */ RenderManager renderManager;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$item$EnumAction;
    private static final /* synthetic */ String[] lllIIlllllIIIl;
    private static final /* synthetic */ ResourceLocation RES_UNDERWATER_OVERLAY;
    private final /* synthetic */ Minecraft mc;
    private static final /* synthetic */ int[] lllIIllllllIII;
    
    static {
        lIlIIIIlIIIllIIl();
        lIlIIIIlIIIlIIll();
        RES_MAP_BACKGROUND = new ResourceLocation(ItemRenderer.lllIIlllllIIIl[ItemRenderer.lllIIllllllIII[0]]);
        RES_UNDERWATER_OVERLAY = new ResourceLocation(ItemRenderer.lllIIlllllIIIl[ItemRenderer.lllIIllllllIII[1]]);
    }
    
    private static String lIlIIIIlIIIlIIlI(final String llllllllllllIlIlllIlIIIllIIlllll, final String llllllllllllIlIlllIlIIIllIIllllI) {
        try {
            final SecretKeySpec llllllllllllIlIlllIlIIIllIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIlIIIllIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllIlIIIllIlIIIll = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllIlIIIllIlIIIll.init(ItemRenderer.lllIIllllllIII[6], llllllllllllIlIlllIlIIIllIlIIlII);
            return new String(llllllllllllIlIlllIlIIIllIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIlIIIllIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIlIIIllIlIIIlI) {
            llllllllllllIlIlllIlIIIllIlIIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIIIlIIlIIIll(final int llllllllllllIlIlllIlIIIlIlllIIlI, final int llllllllllllIlIlllIlIIIlIlllIIIl) {
        return llllllllllllIlIlllIlIIIlIlllIIlI != llllllllllllIlIlllIlIIIlIlllIIIl;
    }
    
    private static String lIlIIIIlIIIlIIIl(String llllllllllllIlIlllIlIIIllIllIIIl, final String llllllllllllIlIlllIlIIIllIllIlIl) {
        llllllllllllIlIlllIlIIIllIllIIIl = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIlIlllIlIIIllIllIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllIlIIIllIllIlII = new StringBuilder();
        final char[] llllllllllllIlIlllIlIIIllIllIIll = llllllllllllIlIlllIlIIIllIllIlIl.toCharArray();
        int llllllllllllIlIlllIlIIIllIllIIlI = ItemRenderer.lllIIllllllIII[0];
        final int llllllllllllIlIlllIlIIIllIlIllII = (Object)((String)llllllllllllIlIlllIlIIIllIllIIIl).toCharArray();
        final short llllllllllllIlIlllIlIIIllIlIlIll = (short)llllllllllllIlIlllIlIIIllIlIllII.length;
        long llllllllllllIlIlllIlIIIllIlIlIlI = ItemRenderer.lllIIllllllIII[0];
        while (lIlIIIIlIIlIlllI((int)llllllllllllIlIlllIlIIIllIlIlIlI, llllllllllllIlIlllIlIIIllIlIlIll)) {
            final char llllllllllllIlIlllIlIIIllIllIlll = llllllllllllIlIlllIlIIIllIlIllII[llllllllllllIlIlllIlIIIllIlIlIlI];
            llllllllllllIlIlllIlIIIllIllIlII.append((char)(llllllllllllIlIlllIlIIIllIllIlll ^ llllllllllllIlIlllIlIIIllIllIIll[llllllllllllIlIlllIlIIIllIllIIlI % llllllllllllIlIlllIlIIIllIllIIll.length]));
            "".length();
            ++llllllllllllIlIlllIlIIIllIllIIlI;
            ++llllllllllllIlIlllIlIIIllIlIlIlI;
            "".length();
            if (((0x58 ^ 0x1C) & ~(0x85 ^ 0xC1)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllIlIIIllIllIlII);
    }
    
    private static boolean lIlIIIIlIIlIlllI(final int llllllllllllIlIlllIlIIIllIIIlIII, final int llllllllllllIlIlllIlIIIllIIIIlll) {
        return llllllllllllIlIlllIlIIIllIIIlIII < llllllllllllIlIlllIlIIIllIIIIlll;
    }
    
    private void transformFirstPersonItem(final float llllllllllllIlIlllIlIIlIlIlllIlI, final float llllllllllllIlIlllIlIIlIlIlllIIl) {
        GlStateManager.translate(0.56f, -0.52f, -0.71999997f);
        GlStateManager.translate(0.0f, llllllllllllIlIlllIlIIlIlIlllIlI * -0.6f, 0.0f);
        GlStateManager.rotate(45.0f, 0.0f, 1.0f, 0.0f);
        final float llllllllllllIlIlllIlIIlIlIlllIII = MathHelper.sin(llllllllllllIlIlllIlIIlIlIlllIIl * llllllllllllIlIlllIlIIlIlIlllIIl * 3.1415927f);
        final float llllllllllllIlIlllIlIIlIlIllIlll = MathHelper.sin(MathHelper.sqrt_float(llllllllllllIlIlllIlIIlIlIlllIIl) * 3.1415927f);
        GlStateManager.rotate(llllllllllllIlIlllIlIIlIlIlllIII * -20.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(llllllllllllIlIlllIlIIlIlIllIlll * -20.0f, 0.0f, 0.0f, 1.0f);
        GlStateManager.rotate(llllllllllllIlIlllIlIIlIlIllIlll * -80.0f, 1.0f, 0.0f, 0.0f);
        GlStateManager.scale(0.4f, 0.4f, 0.4f);
    }
    
    private static boolean lIlIIIIlIIIlllIl(final int llllllllllllIlIlllIlIIIlIllllIll) {
        return llllllllllllIlIlllIlIIIlIllllIll == 0;
    }
    
    private void renderItemMap(final AbstractClientPlayer llllllllllllIlIlllIlIIllIIIIllll, final float llllllllllllIlIlllIlIIllIIIIlllI, final float llllllllllllIlIlllIlIIllIIIllIll, final float llllllllllllIlIlllIlIIllIIIllIlI) {
        final float llllllllllllIlIlllIlIIllIIIllIIl = -0.4f * MathHelper.sin(MathHelper.sqrt_float(llllllllllllIlIlllIlIIllIIIllIlI) * 3.1415927f);
        final float llllllllllllIlIlllIlIIllIIIllIII = 0.2f * MathHelper.sin(MathHelper.sqrt_float(llllllllllllIlIlllIlIIllIIIllIlI) * 3.1415927f * 2.0f);
        final float llllllllllllIlIlllIlIIllIIIlIlll = -0.2f * MathHelper.sin(llllllllllllIlIlllIlIIllIIIllIlI * 3.1415927f);
        GlStateManager.translate(llllllllllllIlIlllIlIIllIIIllIIl, llllllllllllIlIlllIlIIllIIIllIII, llllllllllllIlIlllIlIIllIIIlIlll);
        final float llllllllllllIlIlllIlIIllIIIlIllI = this.func_178100_c(llllllllllllIlIlllIlIIllIIIIlllI);
        GlStateManager.translate(0.0f, 0.04f, -0.72f);
        GlStateManager.translate(0.0f, llllllllllllIlIlllIlIIllIIIllIll * -1.2f, 0.0f);
        GlStateManager.translate(0.0f, llllllllllllIlIlllIlIIllIIIlIllI * -0.5f, 0.0f);
        GlStateManager.rotate(90.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(llllllllllllIlIlllIlIIllIIIlIllI * -85.0f, 0.0f, 0.0f, 1.0f);
        GlStateManager.rotate(0.0f, 1.0f, 0.0f, 0.0f);
        this.renderPlayerArms(llllllllllllIlIlllIlIIllIIIIllll);
        final float llllllllllllIlIlllIlIIllIIIlIlIl = MathHelper.sin(llllllllllllIlIlllIlIIllIIIllIlI * llllllllllllIlIlllIlIIllIIIllIlI * 3.1415927f);
        final float llllllllllllIlIlllIlIIllIIIlIlII = MathHelper.sin(MathHelper.sqrt_float(llllllllllllIlIlllIlIIllIIIllIlI) * 3.1415927f);
        GlStateManager.rotate(llllllllllllIlIlllIlIIllIIIlIlIl * -20.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(llllllllllllIlIlllIlIIllIIIlIlII * -20.0f, 0.0f, 0.0f, 1.0f);
        GlStateManager.rotate(llllllllllllIlIlllIlIIllIIIlIlII * -80.0f, 1.0f, 0.0f, 0.0f);
        GlStateManager.scale(0.38f, 0.38f, 0.38f);
        GlStateManager.rotate(90.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(180.0f, 0.0f, 0.0f, 1.0f);
        GlStateManager.rotate(0.0f, 1.0f, 0.0f, 0.0f);
        GlStateManager.translate(-1.0f, -1.0f, 0.0f);
        GlStateManager.scale(0.015625f, 0.015625f, 0.015625f);
        this.mc.getTextureManager().bindTexture(ItemRenderer.RES_MAP_BACKGROUND);
        final Tessellator llllllllllllIlIlllIlIIllIIIlIIll = Tessellator.getInstance();
        final WorldRenderer llllllllllllIlIlllIlIIllIIIlIIlI = llllllllllllIlIlllIlIIllIIIlIIll.getWorldRenderer();
        GL11.glNormal3f(0.0f, 0.0f, -1.0f);
        llllllllllllIlIlllIlIIllIIIlIIlI.begin(ItemRenderer.lllIIllllllIII[5], DefaultVertexFormats.POSITION_TEX);
        llllllllllllIlIlllIlIIllIIIlIIlI.pos(-7.0, 135.0, 0.0).tex(0.0, 1.0).endVertex();
        llllllllllllIlIlllIlIIllIIIlIIlI.pos(135.0, 135.0, 0.0).tex(1.0, 1.0).endVertex();
        llllllllllllIlIlllIlIIllIIIlIIlI.pos(135.0, -7.0, 0.0).tex(1.0, 0.0).endVertex();
        llllllllllllIlIlllIlIIllIIIlIIlI.pos(-7.0, -7.0, 0.0).tex(0.0, 0.0).endVertex();
        llllllllllllIlIlllIlIIllIIIlIIll.draw();
        final MapData llllllllllllIlIlllIlIIllIIIlIIIl = Items.filled_map.getMapData(this.itemToRender, this.mc.theWorld);
        if (lIlIIIIlIIIllIlI(llllllllllllIlIlllIlIIllIIIlIIIl)) {
            this.mc.entityRenderer.getMapItemRenderer().renderMap(llllllllllllIlIlllIlIIllIIIlIIIl, (boolean)(ItemRenderer.lllIIllllllIII[0] != 0));
        }
    }
    
    private static String lIlIIIIlIIIIlIlI(final String llllllllllllIlIlllIlIIIllIIlIIlI, final String llllllllllllIlIlllIlIIIllIIlIIIl) {
        try {
            final SecretKeySpec llllllllllllIlIlllIlIIIllIIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIlIIIllIIlIIIl.getBytes(StandardCharsets.UTF_8)), ItemRenderer.lllIIllllllIII[7]), "DES");
            final Cipher llllllllllllIlIlllIlIIIllIIlIllI = Cipher.getInstance("DES");
            llllllllllllIlIlllIlIIIllIIlIllI.init(ItemRenderer.lllIIllllllIII[6], llllllllllllIlIlllIlIIIllIIlIlll);
            return new String(llllllllllllIlIlllIlIIIllIIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIlIIIllIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIlIIIllIIlIlIl) {
            llllllllllllIlIlllIlIIIllIIlIlIl.printStackTrace();
            return null;
        }
    }
    
    private float func_178100_c(final float llllllllllllIlIlllIlIIllIlIlllII) {
        float llllllllllllIlIlllIlIIllIlIllIlI = 1.0f - llllllllllllIlIlllIlIIllIlIlllII / 45.0f + 0.1f;
        llllllllllllIlIlllIlIIllIlIllIlI = MathHelper.clamp_float(llllllllllllIlIlllIlIIllIlIllIlI, 0.0f, 1.0f);
        llllllllllllIlIlllIlIIllIlIllIlI = -MathHelper.cos(llllllllllllIlIlllIlIIllIlIllIlI * 3.1415927f) * 0.5f + 0.5f;
        return llllllllllllIlIlllIlIIllIlIllIlI;
    }
    
    private void renderWaterOverlayTexture(final float llllllllllllIlIlllIlIIlIIIlIIlII) {
        this.mc.getTextureManager().bindTexture(ItemRenderer.RES_UNDERWATER_OVERLAY);
        final Tessellator llllllllllllIlIlllIlIIlIIIlIIIll = Tessellator.getInstance();
        final WorldRenderer llllllllllllIlIlllIlIIlIIIlIIIlI = llllllllllllIlIlllIlIIlIIIlIIIll.getWorldRenderer();
        final float llllllllllllIlIlllIlIIlIIIlIIIIl = this.mc.thePlayer.getBrightness(llllllllllllIlIlllIlIIlIIIlIIlII);
        GlStateManager.color(llllllllllllIlIlllIlIIlIIIlIIIIl, llllllllllllIlIlllIlIIlIIIlIIIIl, llllllllllllIlIlllIlIIlIIIlIIIIl, 0.5f);
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(ItemRenderer.lllIIllllllIII[8], ItemRenderer.lllIIllllllIII[9], ItemRenderer.lllIIllllllIII[1], ItemRenderer.lllIIllllllIII[0]);
        GlStateManager.pushMatrix();
        final float llllllllllllIlIlllIlIIlIIIlIIIII = 4.0f;
        final float llllllllllllIlIlllIlIIlIIIIlllll = -1.0f;
        final float llllllllllllIlIlllIlIIlIIIIllllI = 1.0f;
        final float llllllllllllIlIlllIlIIlIIIIlllIl = -1.0f;
        final float llllllllllllIlIlllIlIIlIIIIlllII = 1.0f;
        final float llllllllllllIlIlllIlIIlIIIIllIll = -0.5f;
        final float llllllllllllIlIlllIlIIlIIIIllIlI = -this.mc.thePlayer.rotationYaw / 64.0f;
        final float llllllllllllIlIlllIlIIlIIIIllIIl = this.mc.thePlayer.rotationPitch / 64.0f;
        llllllllllllIlIlllIlIIlIIIlIIIlI.begin(ItemRenderer.lllIIllllllIII[5], DefaultVertexFormats.POSITION_TEX);
        llllllllllllIlIlllIlIIlIIIlIIIlI.pos(-1.0, -1.0, -0.5).tex(4.0f + llllllllllllIlIlllIlIIlIIIIllIlI, 4.0f + llllllllllllIlIlllIlIIlIIIIllIIl).endVertex();
        llllllllllllIlIlllIlIIlIIIlIIIlI.pos(1.0, -1.0, -0.5).tex(0.0f + llllllllllllIlIlllIlIIlIIIIllIlI, 4.0f + llllllllllllIlIlllIlIIlIIIIllIIl).endVertex();
        llllllllllllIlIlllIlIIlIIIlIIIlI.pos(1.0, 1.0, -0.5).tex(0.0f + llllllllllllIlIlllIlIIlIIIIllIlI, 0.0f + llllllllllllIlIlllIlIIlIIIIllIIl).endVertex();
        llllllllllllIlIlllIlIIlIIIlIIIlI.pos(-1.0, 1.0, -0.5).tex(4.0f + llllllllllllIlIlllIlIIlIIIIllIlI, 0.0f + llllllllllllIlIlllIlIIlIIIIllIIl).endVertex();
        llllllllllllIlIlllIlIIlIIIlIIIll.draw();
        GlStateManager.popMatrix();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.disableBlend();
    }
    
    public ItemRenderer(final Minecraft llllllllllllIlIlllIlIIllllIlIIlI) {
        this.equippedItemSlot = ItemRenderer.lllIIllllllIII[2];
        this.mc = llllllllllllIlIlllIlIIllllIlIIlI;
        this.renderManager = llllllllllllIlIlllIlIIllllIlIIlI.getRenderManager();
        this.itemRenderer = llllllllllllIlIlllIlIIllllIlIIlI.getRenderItem();
    }
    
    private static boolean lIlIIIIlIIlIlIII(final int llllllllllllIlIlllIlIIIlIlllIlll) {
        return llllllllllllIlIlllIlIIIlIlllIlll < 0;
    }
    
    public void resetEquippedProgress() {
        this.equippedProgress = 0.0f;
    }
    
    private void func_178103_d() {
        GlStateManager.translate(-0.5f, 0.2f, 0.0f);
        GlStateManager.rotate(30.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(-80.0f, 1.0f, 0.0f, 0.0f);
        GlStateManager.rotate(60.0f, 0.0f, 1.0f, 0.0f);
    }
    
    private static boolean lIlIIIIlIIIllIlI(final Object llllllllllllIlIlllIlIIIllIIIIlIl) {
        return llllllllllllIlIlllIlIIIllIIIIlIl != null;
    }
    
    public void resetEquippedProgress2() {
        this.equippedProgress = 0.0f;
    }
    
    private static boolean lIlIIIIlIIlIIIlI(final int llllllllllllIlIlllIlIIIllIIIllII, final int llllllllllllIlIlllIlIIIllIIIlIll) {
        return llllllllllllIlIlllIlIIIllIIIllII >= llllllllllllIlIlllIlIIIllIIIlIll;
    }
    
    public void updateEquippedItem() {
        this.prevEquippedProgress = this.equippedProgress;
        final EntityPlayer llllllllllllIlIlllIlIIIlllIlIlIl = this.mc.thePlayer;
        final ItemStack llllllllllllIlIlllIlIIIlllIlIlII = llllllllllllIlIlllIlIIIlllIlIlIl.inventory.getCurrentItem();
        boolean llllllllllllIlIlllIlIIIlllIlIIll = ItemRenderer.lllIIllllllIII[0] != 0;
        if (lIlIIIIlIIIllIlI(this.itemToRender) && lIlIIIIlIIIllIlI(llllllllllllIlIlllIlIIIlllIlIlII)) {
            if (lIlIIIIlIIIlllIl(this.itemToRender.getIsItemStackEqual(llllllllllllIlIlllIlIIIlllIlIlII) ? 1 : 0)) {
                llllllllllllIlIlllIlIIIlllIlIIll = (ItemRenderer.lllIIllllllIII[1] != 0);
                "".length();
                if ((0x6A ^ 0x17 ^ (0x76 ^ 0xF)) <= 0) {
                    return;
                }
            }
        }
        else if (lIlIIIIlIIlIIllI(this.itemToRender) && lIlIIIIlIIlIIllI(llllllllllllIlIlllIlIIIlllIlIlII)) {
            llllllllllllIlIlllIlIIIlllIlIIll = (ItemRenderer.lllIIllllllIII[0] != 0);
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        else {
            llllllllllllIlIlllIlIIIlllIlIIll = (ItemRenderer.lllIIllllllIII[1] != 0);
        }
        final float llllllllllllIlIlllIlIIIlllIlIIlI = 0.4f;
        float n;
        if (lIlIIIIlIIIllIll(llllllllllllIlIlllIlIIIlllIlIIll ? 1 : 0)) {
            n = 0.0f;
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else {
            n = 1.0f;
        }
        final float llllllllllllIlIlllIlIIIlllIlIIIl = n;
        final float llllllllllllIlIlllIlIIIlllIlIIII = MathHelper.clamp_float(llllllllllllIlIlllIlIIIlllIlIIIl - this.equippedProgress, -llllllllllllIlIlllIlIIIlllIlIIlI, llllllllllllIlIlllIlIIIlllIlIIlI);
        this.equippedProgress += llllllllllllIlIlllIlIIIlllIlIIII;
        if (lIlIIIIlIIlIlIII(lIlIIIIlIIlIIlIl(this.equippedProgress, 0.1f))) {
            this.itemToRender = llllllllllllIlIlllIlIIIlllIlIlII;
            this.equippedItemSlot = llllllllllllIlIlllIlIIIlllIlIlIl.inventory.currentItem;
        }
    }
    
    private void func_178098_a(final float llllllllllllIlIlllIlIIlIlIlIlIIl, final AbstractClientPlayer llllllllllllIlIlllIlIIlIlIlIIIII) {
        GlStateManager.rotate(-18.0f, 0.0f, 0.0f, 1.0f);
        GlStateManager.rotate(-12.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(-8.0f, 1.0f, 0.0f, 0.0f);
        GlStateManager.translate(-0.9f, 0.2f, 0.0f);
        final float llllllllllllIlIlllIlIIlIlIlIIlll = this.itemToRender.getMaxItemUseDuration() - (llllllllllllIlIlllIlIIlIlIlIIIII.getItemInUseCount() - llllllllllllIlIlllIlIIlIlIlIlIIl + 1.0f);
        float llllllllllllIlIlllIlIIlIlIlIIllI = llllllllllllIlIlllIlIIlIlIlIIlll / 20.0f;
        llllllllllllIlIlllIlIIlIlIlIIllI = (llllllllllllIlIlllIlIIlIlIlIIllI * llllllllllllIlIlllIlIIlIlIlIIllI + llllllllllllIlIlllIlIIlIlIlIIllI * 2.0f) / 3.0f;
        if (lIlIIIIlIIlIIIIl(lIlIIIIlIIlIIIII(llllllllllllIlIlllIlIIlIlIlIIllI, 1.0f))) {
            llllllllllllIlIlllIlIIlIlIlIIllI = 1.0f;
        }
        if (lIlIIIIlIIlIIIIl(lIlIIIIlIIlIIIII(llllllllllllIlIlllIlIIlIlIlIIllI, 0.1f))) {
            final float llllllllllllIlIlllIlIIlIlIlIIlIl = MathHelper.sin((llllllllllllIlIlllIlIIlIlIlIIlll - 0.1f) * 1.3f);
            final float llllllllllllIlIlllIlIIlIlIlIIlII = llllllllllllIlIlllIlIIlIlIlIIllI - 0.1f;
            final float llllllllllllIlIlllIlIIlIlIlIIIll = llllllllllllIlIlllIlIIlIlIlIIlIl * llllllllllllIlIlllIlIIlIlIlIIlII;
            GlStateManager.translate(llllllllllllIlIlllIlIIlIlIlIIIll * 0.0f, llllllllllllIlIlllIlIIlIlIlIIIll * 0.01f, llllllllllllIlIlllIlIIlIlIlIIIll * 0.0f);
        }
        GlStateManager.translate(llllllllllllIlIlllIlIIlIlIlIIllI * 0.0f, llllllllllllIlIlllIlIIlIlIlIIllI * 0.0f, llllllllllllIlIlllIlIIlIlIlIIllI * 0.1f);
        GlStateManager.scale(1.0f, 1.0f, 1.0f + llllllllllllIlIlllIlIIlIlIlIIllI * 0.2f);
    }
    
    private static int lIlIIIIlIIlIIlIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private void func_178095_a(final AbstractClientPlayer llllllllllllIlIlllIlIIlIlllIlIll, final float llllllllllllIlIlllIlIIlIllllIlIl, final float llllllllllllIlIlllIlIIlIllllIlII) {
        final float llllllllllllIlIlllIlIIlIllllIIll = -0.3f * MathHelper.sin(MathHelper.sqrt_float(llllllllllllIlIlllIlIIlIllllIlII) * 3.1415927f);
        final float llllllllllllIlIlllIlIIlIllllIIlI = 0.4f * MathHelper.sin(MathHelper.sqrt_float(llllllllllllIlIlllIlIIlIllllIlII) * 3.1415927f * 2.0f);
        final float llllllllllllIlIlllIlIIlIllllIIIl = -0.4f * MathHelper.sin(llllllllllllIlIlllIlIIlIllllIlII * 3.1415927f);
        GlStateManager.translate(llllllllllllIlIlllIlIIlIllllIIll, llllllllllllIlIlllIlIIlIllllIIlI, llllllllllllIlIlllIlIIlIllllIIIl);
        GlStateManager.translate(0.64000005f, -0.6f, -0.71999997f);
        GlStateManager.translate(0.0f, llllllllllllIlIlllIlIIlIllllIlIl * -0.6f, 0.0f);
        GlStateManager.rotate(45.0f, 0.0f, 1.0f, 0.0f);
        final float llllllllllllIlIlllIlIIlIllllIIII = MathHelper.sin(llllllllllllIlIlllIlIIlIllllIlII * llllllllllllIlIlllIlIIlIllllIlII * 3.1415927f);
        final float llllllllllllIlIlllIlIIlIlllIllll = MathHelper.sin(MathHelper.sqrt_float(llllllllllllIlIlllIlIIlIllllIlII) * 3.1415927f);
        GlStateManager.rotate(llllllllllllIlIlllIlIIlIlllIllll * 70.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(llllllllllllIlIlllIlIIlIllllIIII * -20.0f, 0.0f, 0.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(llllllllllllIlIlllIlIIlIlllIlIll.getLocationSkin());
        GlStateManager.translate(-1.0f, 3.6f, 3.5f);
        GlStateManager.rotate(120.0f, 0.0f, 0.0f, 1.0f);
        GlStateManager.rotate(200.0f, 1.0f, 0.0f, 0.0f);
        GlStateManager.rotate(-135.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.scale(1.0f, 1.0f, 1.0f);
        GlStateManager.translate(5.6f, 0.0f, 0.0f);
        final Render<AbstractClientPlayer> llllllllllllIlIlllIlIIlIlllIlllI = this.renderManager.getEntityRenderObject(this.mc.thePlayer);
        GlStateManager.disableCull();
        final RenderPlayer llllllllllllIlIlllIlIIlIlllIllIl = (RenderPlayer)llllllllllllIlIlllIlIIlIlllIlllI;
        llllllllllllIlIlllIlIIlIlllIllIl.renderRightArm(this.mc.thePlayer);
        GlStateManager.enableCull();
    }
    
    private static int lIlIIIIlIIIllllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private void renderLeftArm(final RenderPlayer llllllllllllIlIlllIlIIllIlIIIIIl) {
        GlStateManager.pushMatrix();
        GlStateManager.rotate(92.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(45.0f, 1.0f, 0.0f, 0.0f);
        GlStateManager.rotate(41.0f, 0.0f, 0.0f, 1.0f);
        GlStateManager.translate(-0.3f, -1.1f, 0.45f);
        llllllllllllIlIlllIlIIllIlIIIIIl.renderLeftArm(this.mc.thePlayer);
        GlStateManager.popMatrix();
    }
    
    private static boolean lIlIIIIlIIIllIll(final int llllllllllllIlIlllIlIIIlIlllllIl) {
        return llllllllllllIlIlllIlIIIlIlllllIl != 0;
    }
    
    private void func_178101_a(final float llllllllllllIlIlllIlIIlllIlIIIIl, final float llllllllllllIlIlllIlIIlllIIlllll) {
        GlStateManager.pushMatrix();
        GlStateManager.rotate(llllllllllllIlIlllIlIIlllIlIIIIl, 1.0f, 0.0f, 0.0f);
        GlStateManager.rotate(llllllllllllIlIlllIlIIlllIIlllll, 0.0f, 1.0f, 0.0f);
        RenderHelper.enableStandardItemLighting();
        GlStateManager.popMatrix();
    }
    
    private static boolean lIlIIIIlIIIlllII(final Object llllllllllllIlIlllIlIIIllIIIIIlI, final Object llllllllllllIlIlllIlIIIllIIIIIIl) {
        return llllllllllllIlIlllIlIIIllIIIIIlI == llllllllllllIlIlllIlIIIllIIIIIIl;
    }
    
    public void renderItem(final EntityLivingBase llllllllllllIlIlllIlIIlllIlllIIl, final ItemStack llllllllllllIlIlllIlIIlllIlllllI, final ItemCameraTransforms.TransformType llllllllllllIlIlllIlIIlllIllIlll) {
        if (lIlIIIIlIIIllIlI(llllllllllllIlIlllIlIIlllIlllllI)) {
            final Item llllllllllllIlIlllIlIIlllIllllII = llllllllllllIlIlllIlIIlllIlllllI.getItem();
            final Block llllllllllllIlIlllIlIIlllIlllIll = Block.getBlockFromItem(llllllllllllIlIlllIlIIlllIllllII);
            GlStateManager.pushMatrix();
            if (lIlIIIIlIIIllIll(this.itemRenderer.shouldRenderItemIn3D(llllllllllllIlIlllIlIIlllIlllllI) ? 1 : 0)) {
                GlStateManager.scale(2.0f, 2.0f, 2.0f);
                if (lIlIIIIlIIIllIll(this.isBlockTranslucent(llllllllllllIlIlllIlIIlllIlllIll) ? 1 : 0)) {
                    GlStateManager.depthMask((boolean)(ItemRenderer.lllIIllllllIII[0] != 0));
                }
            }
            this.itemRenderer.renderItemModelForEntity(llllllllllllIlIlllIlIIlllIlllllI, llllllllllllIlIlllIlIIlllIlllIIl, llllllllllllIlIlllIlIIlllIllIlll);
            if (lIlIIIIlIIIllIll(this.isBlockTranslucent(llllllllllllIlIlllIlIIlllIlllIll) ? 1 : 0)) {
                GlStateManager.depthMask((boolean)(ItemRenderer.lllIIllllllIII[1] != 0));
            }
            GlStateManager.popMatrix();
        }
    }
    
    private void renderPlayerArms(final AbstractClientPlayer llllllllllllIlIlllIlIIllIIllIlII) {
        this.mc.getTextureManager().bindTexture(llllllllllllIlIlllIlIIllIIllIlII.getLocationSkin());
        final Render<AbstractClientPlayer> llllllllllllIlIlllIlIIllIIllIIlI = this.renderManager.getEntityRenderObject(this.mc.thePlayer);
        final RenderPlayer llllllllllllIlIlllIlIIllIIllIIIl = (RenderPlayer)llllllllllllIlIlllIlIIllIIllIIlI;
        if (lIlIIIIlIIIlllIl(llllllllllllIlIlllIlIIllIIllIlII.isInvisible() ? 1 : 0)) {
            GlStateManager.disableCull();
            this.renderRightArm(llllllllllllIlIlllIlIIllIIllIIIl);
            this.renderLeftArm(llllllllllllIlIlllIlIIllIIllIIIl);
            GlStateManager.enableCull();
        }
    }
    
    private void func_178104_a(final AbstractClientPlayer llllllllllllIlIlllIlIIlIllIIllII, final float llllllllllllIlIlllIlIIlIllIIlIll) {
        final float llllllllllllIlIlllIlIIlIllIIlIlI = llllllllllllIlIlllIlIIlIllIIllII.getItemInUseCount() - llllllllllllIlIlllIlIIlIllIIlIll + 1.0f;
        final float llllllllllllIlIlllIlIIlIllIIlIIl = llllllllllllIlIlllIlIIlIllIIlIlI / this.itemToRender.getMaxItemUseDuration();
        float llllllllllllIlIlllIlIIlIllIIlIII = MathHelper.abs(MathHelper.cos(llllllllllllIlIlllIlIIlIllIIlIlI / 4.0f * 3.1415927f) * 0.1f);
        if (lIlIIIIlIIIlllll(lIlIIIIlIIIllllI(llllllllllllIlIlllIlIIlIllIIlIIl, 0.8f))) {
            llllllllllllIlIlllIlIIlIllIIlIII = 0.0f;
        }
        GlStateManager.translate(0.0f, llllllllllllIlIlllIlIIlIllIIlIII, 0.0f);
        final float llllllllllllIlIlllIlIIlIllIIIlll = 1.0f - (float)Math.pow(llllllllllllIlIlllIlIIlIllIIlIIl, 27.0);
        GlStateManager.translate(llllllllllllIlIlllIlIIlIllIIIlll * 0.6f, llllllllllllIlIlllIlIIlIllIIIlll * -0.5f, llllllllllllIlIlllIlIIlIllIIIlll * 0.0f);
        GlStateManager.rotate(llllllllllllIlIlllIlIIlIllIIIlll * 90.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(llllllllllllIlIlllIlIIlIllIIIlll * 10.0f, 1.0f, 0.0f, 0.0f);
        GlStateManager.rotate(llllllllllllIlIlllIlIIlIllIIIlll * 30.0f, 0.0f, 0.0f, 1.0f);
    }
    
    public void renderOverlays(final float llllllllllllIlIlllIlIIlIIlllIIII) {
        GlStateManager.disableAlpha();
        if (lIlIIIIlIIIllIll(this.mc.thePlayer.isEntityInsideOpaqueBlock() ? 1 : 0)) {
            IBlockState llllllllllllIlIlllIlIIlIIllIllll = this.mc.theWorld.getBlockState(new BlockPos(this.mc.thePlayer));
            final EntityPlayer llllllllllllIlIlllIlIIlIIllIlllI = this.mc.thePlayer;
            int llllllllllllIlIlllIlIIlIIllIllIl = ItemRenderer.lllIIllllllIII[0];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIlIIIIlIIlIIIlI(llllllllllllIlIlllIlIIlIIllIllIl, ItemRenderer.lllIIllllllIII[7])) {
                final double llllllllllllIlIlllIlIIlIIllIllII = llllllllllllIlIlllIlIIlIIllIlllI.posX + ((llllllllllllIlIlllIlIIlIIllIllIl >> ItemRenderer.lllIIllllllIII[0]) % ItemRenderer.lllIIllllllIII[6] - 0.5f) * llllllllllllIlIlllIlIIlIIllIlllI.width * 0.8f;
                final double llllllllllllIlIlllIlIIlIIllIlIll = llllllllllllIlIlllIlIIlIIllIlllI.posY + ((llllllllllllIlIlllIlIIlIIllIllIl >> ItemRenderer.lllIIllllllIII[1]) % ItemRenderer.lllIIllllllIII[6] - 0.5f) * 0.1f;
                final double llllllllllllIlIlllIlIIlIIllIlIlI = llllllllllllIlIlllIlIIlIIllIlllI.posZ + ((llllllllllllIlIlllIlIIlIIllIllIl >> ItemRenderer.lllIIllllllIII[6]) % ItemRenderer.lllIIllllllIII[6] - 0.5f) * llllllllllllIlIlllIlIIlIIllIlllI.width * 0.8f;
                final BlockPos llllllllllllIlIlllIlIIlIIllIlIIl = new BlockPos(llllllllllllIlIlllIlIIlIIllIllII, llllllllllllIlIlllIlIIlIIllIlIll + llllllllllllIlIlllIlIIlIIllIlllI.getEyeHeight(), llllllllllllIlIlllIlIIlIIllIlIlI);
                final IBlockState llllllllllllIlIlllIlIIlIIllIlIII = this.mc.theWorld.getBlockState(llllllllllllIlIlllIlIIlIIllIlIIl);
                if (lIlIIIIlIIIllIll(llllllllllllIlIlllIlIIlIIllIlIII.getBlock().isVisuallyOpaque() ? 1 : 0)) {
                    llllllllllllIlIlllIlIIlIIllIllll = llllllllllllIlIlllIlIIlIIllIlIII;
                }
                ++llllllllllllIlIlllIlIIlIIllIllIl;
            }
            if (lIlIIIIlIIlIIIll(llllllllllllIlIlllIlIIlIIllIllll.getBlock().getRenderType(), ItemRenderer.lllIIllllllIII[2])) {
                this.func_178108_a(llllllllllllIlIlllIlIIlIIlllIIII, this.mc.getBlockRendererDispatcher().getBlockModelShapes().getTexture(llllllllllllIlIlllIlIIlIIllIllll));
            }
        }
        if (lIlIIIIlIIIlllIl(this.mc.thePlayer.isSpectator() ? 1 : 0)) {
            if (lIlIIIIlIIIllIll(this.mc.thePlayer.isInsideOfMaterial(Material.water) ? 1 : 0)) {
                this.renderWaterOverlayTexture(llllllllllllIlIlllIlIIlIIlllIIII);
            }
            if (lIlIIIIlIIIllIll(this.mc.thePlayer.isBurning() ? 1 : 0)) {
                this.renderFireInFirstPerson(llllllllllllIlIlllIlIIlIIlllIIII);
            }
        }
        GlStateManager.enableAlpha();
    }
    
    private boolean isBlockTranslucent(final Block llllllllllllIlIlllIlIIlllIlIllIl) {
        if (lIlIIIIlIIIllIlI(llllllllllllIlIlllIlIIlllIlIllIl) && lIlIIIIlIIIlllII(llllllllllllIlIlllIlIIlllIlIllIl.getBlockLayer(), EnumWorldBlockLayer.TRANSLUCENT)) {
            return ItemRenderer.lllIIllllllIII[1] != 0;
        }
        return ItemRenderer.lllIIllllllIII[0] != 0;
    }
    
    private void func_178105_d(final float llllllllllllIlIlllIlIIlIllIllIII) {
        final float llllllllllllIlIlllIlIIlIllIllIll = -0.4f * MathHelper.sin(MathHelper.sqrt_float(llllllllllllIlIlllIlIIlIllIllIII) * 3.1415927f);
        final float llllllllllllIlIlllIlIIlIllIllIlI = 0.2f * MathHelper.sin(MathHelper.sqrt_float(llllllllllllIlIlllIlIIlIllIllIII) * 3.1415927f * 2.0f);
        final float llllllllllllIlIlllIlIIlIllIllIIl = -0.2f * MathHelper.sin(llllllllllllIlIlllIlIIlIllIllIII * 3.1415927f);
        GlStateManager.translate(llllllllllllIlIlllIlIIlIllIllIll, llllllllllllIlIlllIlIIlIllIllIlI, llllllllllllIlIlllIlIIlIllIllIIl);
    }
    
    private static boolean lIlIIIIlIIlIIllI(final Object llllllllllllIlIlllIlIIIlIlllllll) {
        return llllllllllllIlIlllIlIIIlIlllllll == null;
    }
    
    private static int lIlIIIIlIIlIIIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIlIIIIlIIIlllll(final int llllllllllllIlIlllIlIIIlIllllIIl) {
        return llllllllllllIlIlllIlIIIlIllllIIl >= 0;
    }
    
    private void func_178109_a(final AbstractClientPlayer llllllllllllIlIlllIlIIlllIIIIIII) {
        final int llllllllllllIlIlllIlIIlllIIIIllI = this.mc.theWorld.getCombinedLight(new BlockPos(llllllllllllIlIlllIlIIlllIIIIIII.posX, llllllllllllIlIlllIlIIlllIIIIIII.posY + llllllllllllIlIlllIlIIlllIIIIIII.getEyeHeight(), llllllllllllIlIlllIlIIlllIIIIIII.posZ), ItemRenderer.lllIIllllllIII[0]);
        final float llllllllllllIlIlllIlIIlllIIIIlIl = (float)(llllllllllllIlIlllIlIIlllIIIIllI & ItemRenderer.lllIIllllllIII[3]);
        final float llllllllllllIlIlllIlIIlllIIIIIll = (float)(llllllllllllIlIlllIlIIlllIIIIllI >> ItemRenderer.lllIIllllllIII[4]);
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, llllllllllllIlIlllIlIIlllIIIIlIl, llllllllllllIlIlllIlIIlllIIIIIll);
    }
    
    public void renderItemInFirstPerson(final float llllllllllllIlIlllIlIIlIlIIIlllI) {
        final boolean llllllllllllIlIlllIlIIlIlIIIllIl = ItemRenderer.lllIIllllllIII[1] != 0;
        final boolean llllllllllllIlIlllIlIIlIlIIIllII = ItemRenderer.lllIIllllllIII[0] != 0;
        final float llllllllllllIlIlllIlIIlIlIIIlIll = 1.0f - (this.prevEquippedProgress + (this.equippedProgress - this.prevEquippedProgress) * llllllllllllIlIlllIlIIlIlIIIlllI);
        final AbstractClientPlayer llllllllllllIlIlllIlIIlIlIIIlIlI = this.mc.thePlayer;
        final float llllllllllllIlIlllIlIIlIlIIIlIIl = llllllllllllIlIlllIlIIlIlIIIlIlI.getSwingProgress(llllllllllllIlIlllIlIIlIlIIIlllI);
        final float llllllllllllIlIlllIlIIlIlIIIlIII = llllllllllllIlIlllIlIIlIlIIIlIlI.prevRotationPitch + (llllllllllllIlIlllIlIIlIlIIIlIlI.rotationPitch - llllllllllllIlIlllIlIIlIlIIIlIlI.prevRotationPitch) * llllllllllllIlIlllIlIIlIlIIIlllI;
        final float llllllllllllIlIlllIlIIlIlIIIIlll = llllllllllllIlIlllIlIIlIlIIIlIlI.prevRotationYaw + (llllllllllllIlIlllIlIIlIlIIIlIlI.rotationYaw - llllllllllllIlIlllIlIIlIlIIIlIlI.prevRotationYaw) * llllllllllllIlIlllIlIIlIlIIIlllI;
        this.func_178101_a(llllllllllllIlIlllIlIIlIlIIIlIII, llllllllllllIlIlllIlIIlIlIIIIlll);
        this.func_178109_a(llllllllllllIlIlllIlIIlIlIIIlIlI);
        this.func_178110_a((EntityPlayerSP)llllllllllllIlIlllIlIIlIlIIIlIlI, llllllllllllIlIlllIlIIlIlIIIlllI);
        GlStateManager.enableRescaleNormal();
        GlStateManager.pushMatrix();
        if (lIlIIIIlIIIllIll(llllllllllllIlIlllIlIIlIlIIIllII ? 1 : 0)) {
            GL11.glScaled(-1.0, 1.0, 1.0);
            GlStateManager.disableCull();
        }
        if (lIlIIIIlIIIllIlI(this.itemToRender)) {
            Label_0470: {
                if (lIlIIIIlIIIlllII(this.itemToRender.getItem(), Items.filled_map)) {
                    this.renderItemMap(llllllllllllIlIlllIlIIlIlIIIlIlI, llllllllllllIlIlllIlIIlIlIIIlIII, llllllllllllIlIlllIlIIlIlIIIlIll, llllllllllllIlIlllIlIIlIlIIIlIIl);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else if (lIlIIIIlIIlIIIIl(llllllllllllIlIlllIlIIlIlIIIlIlI.getItemInUseCount())) {
                    final EnumAction llllllllllllIlIlllIlIIlIlIIIIllI = this.itemToRender.getItemUseAction();
                    switch ($SWITCH_TABLE$net$minecraft$item$EnumAction()[llllllllllllIlIlllIlIIlIlIIIIllI.ordinal()]) {
                        case 1: {
                            this.transformFirstPersonItem(llllllllllllIlIlllIlIIlIlIIIlIll, 0.0f);
                            "".length();
                            if (-" ".length() >= 0) {
                                return;
                            }
                            break Label_0470;
                        }
                        case 2:
                        case 3: {
                            this.func_178104_a(llllllllllllIlIlllIlIIlIlIIIlIlI, llllllllllllIlIlllIlIIlIlIIIlllI);
                            this.transformFirstPersonItem(llllllllllllIlIlllIlIIlIlIIIlIll, llllllllllllIlIlllIlIIlIlIIIlIIl);
                            "".length();
                            if (-(0x9D ^ 0xA9 ^ (0x98 ^ 0xA8)) > 0) {
                                return;
                            }
                            break Label_0470;
                        }
                        case 4: {
                            this.transformFirstPersonItem(0.2f, llllllllllllIlIlllIlIIlIlIIIlIIl);
                            this.func_178103_d();
                            GlStateManager.translate(-0.5f, 0.2f, 0.0f);
                            "".length();
                            if (null != null) {
                                return;
                            }
                            break Label_0470;
                        }
                        case 5: {
                            this.transformFirstPersonItem(llllllllllllIlIlllIlIIlIlIIIlIll, llllllllllllIlIlllIlIIlIlIIIlIIl);
                            this.func_178098_a(llllllllllllIlIlllIlIIlIlIIIlllI, llllllllllllIlIlllIlIIlIlIIIlIlI);
                            break;
                        }
                    }
                    "".length();
                    if (((0xAC ^ 0x8E ^ (0x2C ^ 0x5A)) & (174 + 26 - 25 + 25 ^ 124 + 54 - 94 + 72 ^ -" ".length())) != ((0x95 ^ 0x92 ^ (0x17 ^ 0x34)) & (0x89 ^ 0x8D ^ (0xBD ^ 0x9D) ^ -" ".length()))) {
                        return;
                    }
                }
                else {
                    this.func_178105_d(llllllllllllIlIlllIlIIlIlIIIlIIl);
                    this.transformFirstPersonItem(llllllllllllIlIlllIlIIlIlIIIlIll, llllllllllllIlIlllIlIIlIlIIIlIIl);
                }
            }
            this.renderItem(llllllllllllIlIlllIlIIlIlIIIlIlI, this.itemToRender, ItemCameraTransforms.TransformType.FIRST_PERSON);
            "".length();
            if (((0x1B ^ 0x2A ^ (0xBA ^ 0xB0)) & (0x7 ^ 0x68 ^ (0x92 ^ 0xC6) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else if (lIlIIIIlIIIlllIl(llllllllllllIlIlllIlIIlIlIIIlIlI.isInvisible() ? 1 : 0)) {
            this.func_178095_a(llllllllllllIlIlllIlIIlIlIIIlIlI, llllllllllllIlIlllIlIIlIlIIIlIll, llllllllllllIlIlllIlIIlIlIIIlIIl);
        }
        GlStateManager.popMatrix();
        GlStateManager.disableRescaleNormal();
        RenderHelper.disableStandardItemLighting();
    }
    
    private void renderFireInFirstPerson(final float llllllllllllIlIlllIlIIIllllllIll) {
        final Tessellator llllllllllllIlIlllIlIIIllllllIlI = Tessellator.getInstance();
        final WorldRenderer llllllllllllIlIlllIlIIIllllllIIl = llllllllllllIlIlllIlIIIllllllIlI.getWorldRenderer();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 0.9f);
        GlStateManager.depthFunc(ItemRenderer.lllIIllllllIII[10]);
        GlStateManager.depthMask((boolean)(ItemRenderer.lllIIllllllIII[0] != 0));
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(ItemRenderer.lllIIllllllIII[8], ItemRenderer.lllIIllllllIII[9], ItemRenderer.lllIIllllllIII[1], ItemRenderer.lllIIllllllIII[0]);
        final float llllllllllllIlIlllIlIIIllllllIII = 1.0f;
        int llllllllllllIlIlllIlIIIlllllIlll = ItemRenderer.lllIIllllllIII[0];
        "".length();
        if ("   ".length() <= 0) {
            return;
        }
        while (!lIlIIIIlIIlIIIlI(llllllllllllIlIlllIlIIIlllllIlll, ItemRenderer.lllIIllllllIII[6])) {
            GlStateManager.pushMatrix();
            final TextureAtlasSprite llllllllllllIlIlllIlIIIlllllIllI = this.mc.getTextureMapBlocks().getAtlasSprite(ItemRenderer.lllIIlllllIIIl[ItemRenderer.lllIIllllllIII[6]]);
            this.mc.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
            final float llllllllllllIlIlllIlIIIlllllIlIl = llllllllllllIlIlllIlIIIlllllIllI.getMinU();
            final float llllllllllllIlIlllIlIIIlllllIlII = llllllllllllIlIlllIlIIIlllllIllI.getMaxU();
            final float llllllllllllIlIlllIlIIIlllllIIll = llllllllllllIlIlllIlIIIlllllIllI.getMinV();
            final float llllllllllllIlIlllIlIIIlllllIIlI = llllllllllllIlIlllIlIIIlllllIllI.getMaxV();
            final float llllllllllllIlIlllIlIIIlllllIIIl = (0.0f - llllllllllllIlIlllIlIIIllllllIII) / 2.0f;
            final float llllllllllllIlIlllIlIIIlllllIIII = llllllllllllIlIlllIlIIIlllllIIIl + llllllllllllIlIlllIlIIIllllllIII;
            final float llllllllllllIlIlllIlIIIllllIllll = 0.0f - llllllllllllIlIlllIlIIIllllllIII / 2.0f;
            final float llllllllllllIlIlllIlIIIllllIlllI = llllllllllllIlIlllIlIIIllllIllll + llllllllllllIlIlllIlIIIllllllIII;
            final float llllllllllllIlIlllIlIIIllllIllIl = -0.5f;
            GlStateManager.translate(-(llllllllllllIlIlllIlIIIlllllIlll * ItemRenderer.lllIIllllllIII[6] - ItemRenderer.lllIIllllllIII[1]) * 0.24f, -0.3f, 0.0f);
            GlStateManager.rotate((llllllllllllIlIlllIlIIIlllllIlll * ItemRenderer.lllIIllllllIII[6] - ItemRenderer.lllIIllllllIII[1]) * 10.0f, 0.0f, 1.0f, 0.0f);
            llllllllllllIlIlllIlIIIllllllIIl.begin(ItemRenderer.lllIIllllllIII[5], DefaultVertexFormats.POSITION_TEX);
            llllllllllllIlIlllIlIIIllllllIIl.pos(llllllllllllIlIlllIlIIIlllllIIIl, llllllllllllIlIlllIlIIIllllIllll, llllllllllllIlIlllIlIIIllllIllIl).tex(llllllllllllIlIlllIlIIIlllllIlII, llllllllllllIlIlllIlIIIlllllIIlI).endVertex();
            llllllllllllIlIlllIlIIIllllllIIl.pos(llllllllllllIlIlllIlIIIlllllIIII, llllllllllllIlIlllIlIIIllllIllll, llllllllllllIlIlllIlIIIllllIllIl).tex(llllllllllllIlIlllIlIIIlllllIlIl, llllllllllllIlIlllIlIIIlllllIIlI).endVertex();
            llllllllllllIlIlllIlIIIllllllIIl.pos(llllllllllllIlIlllIlIIIlllllIIII, llllllllllllIlIlllIlIIIllllIlllI, llllllllllllIlIlllIlIIIllllIllIl).tex(llllllllllllIlIlllIlIIIlllllIlIl, llllllllllllIlIlllIlIIIlllllIIll).endVertex();
            llllllllllllIlIlllIlIIIllllllIIl.pos(llllllllllllIlIlllIlIIIlllllIIIl, llllllllllllIlIlllIlIIIllllIlllI, llllllllllllIlIlllIlIIIllllIllIl).tex(llllllllllllIlIlllIlIIIlllllIlII, llllllllllllIlIlllIlIIIlllllIIll).endVertex();
            llllllllllllIlIlllIlIIIllllllIlI.draw();
            GlStateManager.popMatrix();
            ++llllllllllllIlIlllIlIIIlllllIlll;
        }
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.disableBlend();
        GlStateManager.depthMask((boolean)(ItemRenderer.lllIIllllllIII[1] != 0));
        GlStateManager.depthFunc(ItemRenderer.lllIIllllllIII[11]);
    }
    
    private void renderRightArm(final RenderPlayer llllllllllllIlIlllIlIIllIlIIlIlI) {
        GlStateManager.pushMatrix();
        GlStateManager.rotate(54.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(64.0f, 1.0f, 0.0f, 0.0f);
        GlStateManager.rotate(-62.0f, 0.0f, 0.0f, 1.0f);
        GlStateManager.translate(0.25f, -0.85f, 0.75f);
        llllllllllllIlIlllIlIIllIlIIlIlI.renderRightArm(this.mc.thePlayer);
        GlStateManager.popMatrix();
    }
    
    private static void lIlIIIIlIIIlIIll() {
        (lllIIlllllIIIl = new String[ItemRenderer.lllIIllllllIII[14]])[ItemRenderer.lllIIllllllIII[0]] = lIlIIIIlIIIIlIlI("LzXROIh2+onQvpapxOs06vtqLs+PjJQ7jVdYQ/Jv+Kk=", "RRLlH");
        ItemRenderer.lllIIlllllIIIl[ItemRenderer.lllIIllllllIII[1]] = lIlIIIIlIIIlIIIl("NycbPx4xJxBkBioxAGQeLSYGORwiNgY5RTMsBA==", "CBcKk");
        ItemRenderer.lllIIlllllIIIl[ItemRenderer.lllIIllllllIII[6]] = lIlIIIIlIIIlIIlI("kjfszbdXLF9nL3lgeLlpyBxiNThuwaL8mnP4IHLCFVQ=", "NOGNK");
    }
    
    private static void lIlIIIIlIIIllIIl() {
        (lllIIllllllIII = new int[15])[0] = ((0x73 ^ 0x7F ^ (0xB5 ^ 0x86)) & (70 + 110 - 138 + 102 ^ 15 + 121 - 70 + 109 ^ -" ".length()));
        ItemRenderer.lllIIllllllIII[1] = " ".length();
        ItemRenderer.lllIIllllllIII[2] = -" ".length();
        ItemRenderer.lllIIllllllIII[3] = (-" ".length() & (-1 & 0xFFFF));
        ItemRenderer.lllIIllllllIII[4] = (0x9A ^ 0xAA ^ (0x1C ^ 0x3C));
        ItemRenderer.lllIIllllllIII[5] = (0xB9 ^ 0xBE);
        ItemRenderer.lllIIllllllIII[6] = "  ".length();
        ItemRenderer.lllIIllllllIII[7] = (0xCD ^ 0xC2 ^ (0x49 ^ 0x4E));
        ItemRenderer.lllIIllllllIII[8] = (-(0xFFFFCCFE & 0x3B3F) & (0xFFFF8B7F & 0x7FBF));
        ItemRenderer.lllIIllllllIII[9] = (-(0xFFFFDFF9 & 0x34FF) & (0xFFFFBFFF & 0x57FB));
        ItemRenderer.lllIIllllllIII[10] = (0xFFFFA34F & 0x5EB7);
        ItemRenderer.lllIIllllllIII[11] = (-(0xFFFFFFFD & 0x78B7) & (0xFFFFFEBF & 0x7BF7));
        ItemRenderer.lllIIllllllIII[12] = (0x64 ^ 0x47 ^ (0xA ^ 0x2D));
        ItemRenderer.lllIIllllllIII[13] = (0x9A ^ 0x9F);
        ItemRenderer.lllIIllllllIII[14] = "   ".length();
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$item$EnumAction() {
        final int[] $switch_TABLE$net$minecraft$item$EnumAction = ItemRenderer.$SWITCH_TABLE$net$minecraft$item$EnumAction;
        if (lIlIIIIlIIIllIlI($switch_TABLE$net$minecraft$item$EnumAction)) {
            return $switch_TABLE$net$minecraft$item$EnumAction;
        }
        "".length();
        final Exception llllllllllllIlIlllIlIIIlllIIIIIl = (Object)new int[EnumAction.values().length];
        try {
            llllllllllllIlIlllIlIIIlllIIIIIl[EnumAction.BLOCK.ordinal()] = ItemRenderer.lllIIllllllIII[12];
            "".length();
            if ((0x79 ^ 0x4F ^ (0x65 ^ 0x57)) == ((0x28 ^ 0x24 ^ (0x6B ^ 0x6)) & (0x79 ^ 0x4F ^ (0xD4 ^ 0x83) ^ -" ".length()))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIlIlllIlIIIlllIIIIIl[EnumAction.BOW.ordinal()] = ItemRenderer.lllIIllllllIII[13];
            "".length();
            if (((0x36 ^ 0x1B ^ (0x9E ^ 0x86)) & (37 + 48 + 12 + 70 ^ 118 + 92 - 133 + 69 ^ -" ".length())) < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIlIlllIlIIIlllIIIIIl[EnumAction.DRINK.ordinal()] = ItemRenderer.lllIIllllllIII[14];
            "".length();
            if (((0x7E ^ 0x5F) & ~(0xE0 ^ 0xC1)) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIlIlllIlIIIlllIIIIIl[EnumAction.EAT.ordinal()] = ItemRenderer.lllIIllllllIII[6];
            "".length();
            if (-(0x36 ^ 0x31 ^ "   ".length()) >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            llllllllllllIlIlllIlIIIlllIIIIIl[EnumAction.NONE.ordinal()] = ItemRenderer.lllIIllllllIII[1];
            "".length();
            if (-(56 + 77 - 103 + 110 ^ 31 + 68 - 15 + 52) > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        return ItemRenderer.$SWITCH_TABLE$net$minecraft$item$EnumAction = (int[])(Object)llllllllllllIlIlllIlIIIlllIIIIIl;
    }
    
    private void func_178108_a(final float llllllllllllIlIlllIlIIlIIlIIlllI, final TextureAtlasSprite llllllllllllIlIlllIlIIlIIlIIllIl) {
        this.mc.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
        final Tessellator llllllllllllIlIlllIlIIlIIlIIllII = Tessellator.getInstance();
        final WorldRenderer llllllllllllIlIlllIlIIlIIlIIlIll = llllllllllllIlIlllIlIIlIIlIIllII.getWorldRenderer();
        final float llllllllllllIlIlllIlIIlIIlIIlIlI = 0.1f;
        GlStateManager.color(0.1f, 0.1f, 0.1f, 0.5f);
        GlStateManager.pushMatrix();
        final float llllllllllllIlIlllIlIIlIIlIIlIIl = -1.0f;
        final float llllllllllllIlIlllIlIIlIIlIIlIII = 1.0f;
        final float llllllllllllIlIlllIlIIlIIlIIIlll = -1.0f;
        final float llllllllllllIlIlllIlIIlIIlIIIllI = 1.0f;
        final float llllllllllllIlIlllIlIIlIIlIIIlIl = -0.5f;
        final float llllllllllllIlIlllIlIIlIIlIIIlII = llllllllllllIlIlllIlIIlIIlIIllIl.getMinU();
        final float llllllllllllIlIlllIlIIlIIlIIIIll = llllllllllllIlIlllIlIIlIIlIIllIl.getMaxU();
        final float llllllllllllIlIlllIlIIlIIlIIIIlI = llllllllllllIlIlllIlIIlIIlIIllIl.getMinV();
        final float llllllllllllIlIlllIlIIlIIlIIIIIl = llllllllllllIlIlllIlIIlIIlIIllIl.getMaxV();
        llllllllllllIlIlllIlIIlIIlIIlIll.begin(ItemRenderer.lllIIllllllIII[5], DefaultVertexFormats.POSITION_TEX);
        llllllllllllIlIlllIlIIlIIlIIlIll.pos(-1.0, -1.0, -0.5).tex(llllllllllllIlIlllIlIIlIIlIIIIll, llllllllllllIlIlllIlIIlIIlIIIIIl).endVertex();
        llllllllllllIlIlllIlIIlIIlIIlIll.pos(1.0, -1.0, -0.5).tex(llllllllllllIlIlllIlIIlIIlIIIlII, llllllllllllIlIlllIlIIlIIlIIIIIl).endVertex();
        llllllllllllIlIlllIlIIlIIlIIlIll.pos(1.0, 1.0, -0.5).tex(llllllllllllIlIlllIlIIlIIlIIIlII, llllllllllllIlIlllIlIIlIIlIIIIlI).endVertex();
        llllllllllllIlIlllIlIIlIIlIIlIll.pos(-1.0, 1.0, -0.5).tex(llllllllllllIlIlllIlIIlIIlIIIIll, llllllllllllIlIlllIlIIlIIlIIIIlI).endVertex();
        llllllllllllIlIlllIlIIlIIlIIllII.draw();
        GlStateManager.popMatrix();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
    }
    
    private void func_178110_a(final EntityPlayerSP llllllllllllIlIlllIlIIllIlllIIIl, final float llllllllllllIlIlllIlIIllIlllIIII) {
        final float llllllllllllIlIlllIlIIllIllIlllI = llllllllllllIlIlllIlIIllIlllIIIl.prevRenderArmPitch + (llllllllllllIlIlllIlIIllIlllIIIl.renderArmPitch - llllllllllllIlIlllIlIIllIlllIIIl.prevRenderArmPitch) * llllllllllllIlIlllIlIIllIlllIIII;
        final float llllllllllllIlIlllIlIIllIllIllII = llllllllllllIlIlllIlIIllIlllIIIl.prevRenderArmYaw + (llllllllllllIlIlllIlIIllIlllIIIl.renderArmYaw - llllllllllllIlIlllIlIIllIlllIIIl.prevRenderArmYaw) * llllllllllllIlIlllIlIIllIlllIIII;
        GlStateManager.rotate((llllllllllllIlIlllIlIIllIlllIIIl.rotationPitch - llllllllllllIlIlllIlIIllIllIlllI) * 0.1f, 1.0f, 0.0f, 0.0f);
        GlStateManager.rotate((llllllllllllIlIlllIlIIllIlllIIIl.rotationYaw - llllllllllllIlIlllIlIIllIllIllII) * 0.1f, 0.0f, 1.0f, 0.0f);
    }
    
    private static boolean lIlIIIIlIIlIIIIl(final int llllllllllllIlIlllIlIIIlIlllIlIl) {
        return llllllllllllIlIlllIlIIIlIlllIlIl > 0;
    }
}
