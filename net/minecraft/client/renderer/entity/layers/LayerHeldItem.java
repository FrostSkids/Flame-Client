// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity.layers;

import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.EntityLivingBase;

public class LayerHeldItem implements LayerRenderer<EntityLivingBase>
{
    private static final /* synthetic */ int[] lIIIIlllllllII;
    private final /* synthetic */ RendererLivingEntity<?> livingEntityRenderer;
    
    static {
        lIllllIlIlllIIl();
    }
    
    public LayerHeldItem(final RendererLivingEntity<?> lllllllllllllIlIIIlllIIIlIlIIllI) {
        this.livingEntityRenderer = lllllllllllllIlIIIlllIIIlIlIIllI;
    }
    
    private static boolean lIllllIlIllllII(final int lllllllllllllIlIIIlllIIIlIIIIllI, final int lllllllllllllIlIIIlllIIIlIIIIlIl) {
        return lllllllllllllIlIIIlllIIIlIIIIllI == lllllllllllllIlIIIlllIIIlIIIIlIl;
    }
    
    private static void lIllllIlIlllIIl() {
        (lIIIIlllllllII = new int[2])[0] = ((0x35 ^ 0x66) & ~(0xC9 ^ 0x9A));
        LayerHeldItem.lIIIIlllllllII[1] = "  ".length();
    }
    
    @Override
    public void doRenderLayer(final EntityLivingBase lllllllllllllIlIIIlllIIIlIIlllII, final float lllllllllllllIlIIIlllIIIlIIllIll, final float lllllllllllllIlIIIlllIIIlIIllIlI, final float lllllllllllllIlIIIlllIIIlIIllIIl, final float lllllllllllllIlIIIlllIIIlIIllIII, final float lllllllllllllIlIIIlllIIIlIIlIlll, final float lllllllllllllIlIIIlllIIIlIIlIllI, final float lllllllllllllIlIIIlllIIIlIIlIlIl) {
        ItemStack lllllllllllllIlIIIlllIIIlIIlIlII = lllllllllllllIlIIIlllIIIlIIlllII.getHeldItem();
        if (lIllllIlIlllIlI(lllllllllllllIlIIIlllIIIlIIlIlII)) {
            GlStateManager.pushMatrix();
            if (lIllllIlIlllIll(this.livingEntityRenderer.getMainModel().isChild ? 1 : 0)) {
                final float lllllllllllllIlIIIlllIIIlIIlIIll = 0.5f;
                GlStateManager.translate(0.0f, 0.625f, 0.0f);
                GlStateManager.rotate(-20.0f, -1.0f, 0.0f, 0.0f);
                GlStateManager.scale(lllllllllllllIlIIIlllIIIlIIlIIll, lllllllllllllIlIIIlllIIIlIIlIIll, lllllllllllllIlIIIlllIIIlIIlIIll);
            }
            ((ModelBiped)this.livingEntityRenderer.getMainModel()).postRenderArm(0.0625f);
            GlStateManager.translate(-0.0625f, 0.4375f, 0.0625f);
            if (lIllllIlIlllIll((lllllllllllllIlIIIlllIIIlIIlllII instanceof EntityPlayer) ? 1 : 0) && lIllllIlIlllIlI(((EntityPlayer)lllllllllllllIlIIIlllIIIlIIlllII).fishEntity)) {
                lllllllllllllIlIIIlllIIIlIIlIlII = new ItemStack(Items.fishing_rod, LayerHeldItem.lIIIIlllllllII[0]);
            }
            final Item lllllllllllllIlIIIlllIIIlIIlIIlI = lllllllllllllIlIIIlllIIIlIIlIlII.getItem();
            final Minecraft lllllllllllllIlIIIlllIIIlIIlIIIl = Minecraft.getMinecraft();
            if (lIllllIlIlllIll((lllllllllllllIlIIIlllIIIlIIlIIlI instanceof ItemBlock) ? 1 : 0) && lIllllIlIllllII(Block.getBlockFromItem(lllllllllllllIlIIIlllIIIlIIlIIlI).getRenderType(), LayerHeldItem.lIIIIlllllllII[1])) {
                GlStateManager.translate(0.0f, 0.1875f, -0.3125f);
                GlStateManager.rotate(20.0f, 1.0f, 0.0f, 0.0f);
                GlStateManager.rotate(45.0f, 0.0f, 1.0f, 0.0f);
                final float lllllllllllllIlIIIlllIIIlIIlIIII = 0.375f;
                GlStateManager.scale(-lllllllllllllIlIIIlllIIIlIIlIIII, -lllllllllllllIlIIIlllIIIlIIlIIII, lllllllllllllIlIIIlllIIIlIIlIIII);
            }
            if (lIllllIlIlllIll(lllllllllllllIlIIIlllIIIlIIlllII.isSneaking() ? 1 : 0)) {
                GlStateManager.translate(0.0f, 0.203125f, 0.0f);
            }
            lllllllllllllIlIIIlllIIIlIIlIIIl.getItemRenderer().renderItem(lllllllllllllIlIIIlllIIIlIIlllII, lllllllllllllIlIIIlllIIIlIIlIlII, ItemCameraTransforms.TransformType.THIRD_PERSON);
            GlStateManager.popMatrix();
        }
    }
    
    private static boolean lIllllIlIlllIlI(final Object lllllllllllllIlIIIlllIIIlIIIIIll) {
        return lllllllllllllIlIIIlllIIIlIIIIIll != null;
    }
    
    @Override
    public boolean shouldCombineTextures() {
        return LayerHeldItem.lIIIIlllllllII[0] != 0;
    }
    
    private static boolean lIllllIlIlllIll(final int lllllllllllllIlIIIlllIIIlIIIIIIl) {
        return lllllllllllllIlIIIlllIIIlIIIIIIl != 0;
    }
}
