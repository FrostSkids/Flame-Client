// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import java.util.Random;
import net.minecraft.entity.item.EntityItem;

public class RenderEntityItem extends Render<EntityItem>
{
    private /* synthetic */ Random field_177079_e;
    private final /* synthetic */ RenderItem itemRenderer;
    private static final /* synthetic */ int[] llIIlllllIIlIl;
    
    private static boolean lIIlIIIIlIIIlllI(final int llllllllllllIllIlIlllIIIIIIlIIII) {
        return llllllllllllIllIlIlllIIIIIIlIIII != 0;
    }
    
    private static boolean lIIlIIIIlIIlIIIl(final int llllllllllllIllIlllIIlIlllIlIlIl, final int llllllllllllIllIlllIIlIlllIlIlII) {
        return llllllllllllIllIlllIIlIlllIlIlIl >= llllllllllllIllIlllIIlIlllIlIlII;
    }
    
    private static boolean lIIlIIIIlIIIllll(final int llllllllllllIllIlIlllIIIIIIlIlll, final int llllllllllllIllIlIlllIIIIIIlIllI) {
        return llllllllllllIllIlIlllIIIIIIlIlll > llllllllllllIllIlIlllIIIIIIlIllI;
    }
    
    private int func_177077_a(final EntityItem llllllllllllIllIlllIIllIIlIIIlIl, final double llllllllllllIllIlllIIllIIIllIIIl, final double llllllllllllIllIlllIIllIIlIIIIll, final double llllllllllllIllIlllIIllIIIlIllll, final float llllllllllllIllIlllIIllIIlIIIIIl, final IBakedModel llllllllllllIllIlllIIllIIIlIllIl) {
        final ItemStack llllllllllllIllIlllIIllIIIllllll = llllllllllllIllIlllIIllIIlIIIlIl.getEntityItem();
        final Item llllllllllllIllIlllIIllIIIlllllI = llllllllllllIllIlllIIllIIIllllll.getItem();
        if (lIIlIIIIlIIIlIll(llllllllllllIllIlllIIllIIIlllllI)) {
            return RenderEntityItem.llIIlllllIIlIl[0];
        }
        final boolean llllllllllllIllIlllIIllIIIllllIl = llllllllllllIllIlllIIllIIIlIllIl.isGui3d();
        final int llllllllllllIllIlllIIllIIIllllII = this.func_177078_a(llllllllllllIllIlllIIllIIIllllll);
        final float llllllllllllIllIlllIIllIIIlllIll = 0.25f;
        float llllllllllllIllIlllIIllIIIlllIlI = -0.125f;
        if (lIIlIIIIlIIIllII(llllllllllllIllIlllIIllIIIllllIl ? 1 : 0)) {
            llllllllllllIllIlllIIllIIIlllIlI = -0.175f;
        }
        final float llllllllllllIllIlllIIllIIIlllIIl = llllllllllllIllIlllIIllIIIlIllIl.getItemCameraTransforms().getTransform(ItemCameraTransforms.TransformType.GROUND).scale.y;
        GlStateManager.translate((float)llllllllllllIllIlllIIllIIIllIIIl, (float)llllllllllllIllIlllIIllIIlIIIIll + llllllllllllIllIlllIIllIIIlllIlI + 0.25f * llllllllllllIllIlllIIllIIIlllIIl, (float)llllllllllllIllIlllIIllIIIlIllll);
        if (!lIIlIIIIlIIIllII(llllllllllllIllIlllIIllIIIllllIl ? 1 : 0) || lIIlIIIIlIIIllIl(this.renderManager.options)) {
            final float n = ((llllllllllllIllIlllIIllIIlIIIlIl.getAge() + llllllllllllIllIlllIIllIIlIIIIIl) / 20.0f + llllllllllllIllIlllIIllIIlIIIlIl.hoverStart) * 57.295776f;
        }
        if (lIIlIIIIlIIIllII(llllllllllllIllIlllIIllIIIllllIl ? 1 : 0)) {
            final float llllllllllllIllIlllIIllIIIlllIII = -0.0f * (llllllllllllIllIlllIIllIIIllllII - RenderEntityItem.llIIlllllIIlIl[1]) * 0.5f;
            final float llllllllllllIllIlllIIllIIIllIlll = -0.0f * (llllllllllllIllIlllIIllIIIllllII - RenderEntityItem.llIIlllllIIlIl[1]) * 0.5f;
            final float llllllllllllIllIlllIIllIIIllIllI = -0.046875f * (llllllllllllIllIlllIIllIIIllllII - RenderEntityItem.llIIlllllIIlIl[1]) * 0.5f;
            if (lIIlIIIIlIIIlllI(llllllllllllIllIlllIIllIIlIIIlIl.onGround ? 1 : 0)) {
                GlStateManager.rotate(180.0f, 0.0f, 1.0f, 1.0f);
            }
        }
        final float llllllllllllIllIlllIIllIIIllIlIl = 10.0f;
        if (lIIlIIIIlIIIllII(llllllllllllIllIlllIIllIIlIIIlIl.onGround ? 1 : 0)) {
            final float llllllllllllIllIlllIIllIIIllIlII = llllllllllllIllIlllIIllIIlIIIlIl.getAge() * llllllllllllIllIlllIIllIIIllIlIl % 360.0f;
            GlStateManager.rotate(llllllllllllIllIlllIIllIIIllIlII, 1.0f, 0.0f, 1.0f);
        }
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        return llllllllllllIllIlllIIllIIIllllII;
    }
    
    public RenderEntityItem(final RenderManager llllllllllllIllIlllIIllIIlIlllII, final RenderItem llllllllllllIllIlllIIllIIlIllIII) {
        super(llllllllllllIllIlllIIllIIlIlllII);
        this.field_177079_e = new Random();
        this.itemRenderer = llllllllllllIllIlllIIllIIlIllIII;
        this.shadowSize = 0.15f;
        this.shadowOpaque = 0.75f;
    }
    
    private static boolean lIIlIIIIlIIIllIl(final Object llllllllllllIllIlIlllIIIIIIlIlII) {
        return llllllllllllIllIlIlllIIIIIIlIlII != null;
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityItem llllllllllllIllIlllIIlIllllIlIlI) {
        return TextureMap.locationBlocksTexture;
    }
    
    private static void lIIlIIIIlIIIlIlI() {
        (llIIlllllIIlIl = new int[12])[0] = ("  ".length() & ~"  ".length());
        RenderEntityItem.llIIlllllIIlIl[1] = " ".length();
        RenderEntityItem.llIIlllllIIlIl[2] = (0x6D ^ 0x32 ^ (0x13 ^ 0x7C));
        RenderEntityItem.llIIlllllIIlIl[3] = (0x62 ^ 0x4B ^ (0x55 ^ 0x79));
        RenderEntityItem.llIIlllllIIlIl[4] = (0x0 ^ 0x20);
        RenderEntityItem.llIIlllllIIlIl[5] = (0x72 ^ 0x76);
        RenderEntityItem.llIIlllllIIlIl[6] = (0x97 ^ 0x87);
        RenderEntityItem.llIIlllllIIlIl[7] = "   ".length();
        RenderEntityItem.llIIlllllIIlIl[8] = "  ".length();
        RenderEntityItem.llIIlllllIIlIl[9] = (-(0xFFFFFD44 & 0x23BF) & (0xFFFFA317 & 0x7FEF));
        RenderEntityItem.llIIlllllIIlIl[10] = (0xFFFFCBEA & 0x3717);
        RenderEntityItem.llIIlllllIIlIl[11] = (0xFFFFE32B & 0x1FD7);
    }
    
    private int func_177078_a(final ItemStack llllllllllllIllIlllIIllIIIIlllll) {
        int llllllllllllIllIlllIIllIIIIllllI = RenderEntityItem.llIIlllllIIlIl[1];
        if (lIIlIIIIlIIIllll(llllllllllllIllIlllIIllIIIIlllll.stackSize, RenderEntityItem.llIIlllllIIlIl[2])) {
            llllllllllllIllIlllIIllIIIIllllI = RenderEntityItem.llIIlllllIIlIl[3];
            "".length();
            if ("  ".length() == 0) {
                return (44 + 40 - 58 + 121 ^ 116 + 145 - 223 + 118) & (41 + 55 + 11 + 64 ^ 44 + 87 - 42 + 75 ^ -" ".length());
            }
        }
        else if (lIIlIIIIlIIIllll(llllllllllllIllIlllIIllIIIIlllll.stackSize, RenderEntityItem.llIIlllllIIlIl[4])) {
            llllllllllllIllIlllIIllIIIIllllI = RenderEntityItem.llIIlllllIIlIl[5];
            "".length();
            if (null != null) {
                return " ".length() & ~" ".length();
            }
        }
        else if (lIIlIIIIlIIIllll(llllllllllllIllIlllIIllIIIIlllll.stackSize, RenderEntityItem.llIIlllllIIlIl[6])) {
            llllllllllllIllIlllIIllIIIIllllI = RenderEntityItem.llIIlllllIIlIl[7];
            "".length();
            if (-" ".length() >= "  ".length()) {
                return (0xD0 ^ 0xC5) & ~(0xD5 ^ 0xC0);
            }
        }
        else if (lIIlIIIIlIIIllll(llllllllllllIllIlllIIllIIIIlllll.stackSize, RenderEntityItem.llIIlllllIIlIl[1])) {
            llllllllllllIllIlllIIllIIIIllllI = RenderEntityItem.llIIlllllIIlIl[8];
        }
        return llllllllllllIllIlllIIllIIIIllllI;
    }
    
    private static boolean lIIlIIIIlIIIllII(final int llllllllllllIllIlIlllIIIIIIIlllI) {
        return llllllllllllIllIlIlllIIIIIIIlllI == 0;
    }
    
    private static boolean lIIlIIIIlIIlIIII(final int llllllllllllIllIlIlllIIIIIIIllII) {
        return llllllllllllIllIlIlllIIIIIIIllII > 0;
    }
    
    @Override
    public void doRender(final EntityItem llllllllllllIllIlllIIlIllllllIIl, final double llllllllllllIllIlllIIlIllllllIII, final double llllllllllllIllIlllIIlIlllllIlll, final double llllllllllllIllIlllIIlIlllllIllI, final float llllllllllllIllIlllIIllIIIIIIlll, final float llllllllllllIllIlllIIlIlllllIlII) {
        final ItemStack llllllllllllIllIlllIIllIIIIIIlIl = llllllllllllIllIlllIIlIllllllIIl.getEntityItem();
        this.field_177079_e.setSeed(187L);
        boolean llllllllllllIllIlllIIllIIIIIIlII = RenderEntityItem.llIIlllllIIlIl[0] != 0;
        if (lIIlIIIIlIIIlllI(this.bindEntityTexture(llllllllllllIllIlllIIlIllllllIIl) ? 1 : 0)) {
            this.renderManager.renderEngine.getTexture(this.getEntityTexture(llllllllllllIllIlllIIlIllllllIIl)).setBlurMipmap((boolean)(RenderEntityItem.llIIlllllIIlIl[0] != 0), (boolean)(RenderEntityItem.llIIlllllIIlIl[0] != 0));
            llllllllllllIllIlllIIllIIIIIIlII = (RenderEntityItem.llIIlllllIIlIl[1] != 0);
        }
        GlStateManager.enableRescaleNormal();
        GlStateManager.alphaFunc(RenderEntityItem.llIIlllllIIlIl[9], 0.1f);
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(RenderEntityItem.llIIlllllIIlIl[10], RenderEntityItem.llIIlllllIIlIl[11], RenderEntityItem.llIIlllllIIlIl[1], RenderEntityItem.llIIlllllIIlIl[0]);
        GlStateManager.pushMatrix();
        final IBakedModel llllllllllllIllIlllIIllIIIIIIIll = this.itemRenderer.getItemModelMesher().getItemModel(llllllllllllIllIlllIIllIIIIIIlIl);
        final int llllllllllllIllIlllIIllIIIIIIIlI = this.func_177077_a(llllllllllllIllIlllIIlIllllllIIl, llllllllllllIllIlllIIlIllllllIII, llllllllllllIllIlllIIlIlllllIlll, llllllllllllIllIlllIIlIlllllIllI, llllllllllllIllIlllIIlIlllllIlII, llllllllllllIllIlllIIllIIIIIIIll);
        int llllllllllllIllIlllIIllIIIIIIIIl = RenderEntityItem.llIIlllllIIlIl[0];
        "".length();
        if (-" ".length() >= 0) {
            return;
        }
        while (!lIIlIIIIlIIlIIIl(llllllllllllIllIlllIIllIIIIIIIIl, llllllllllllIllIlllIIllIIIIIIIlI)) {
            if (lIIlIIIIlIIIlllI(llllllllllllIllIlllIIllIIIIIIIll.isGui3d() ? 1 : 0)) {
                GlStateManager.pushMatrix();
                if (lIIlIIIIlIIlIIII(llllllllllllIllIlllIIllIIIIIIIIl)) {
                    final float llllllllllllIllIlllIIllIIIIIIIII = (this.field_177079_e.nextFloat() * 2.0f - 1.0f) * 0.15f;
                    final float llllllllllllIllIlllIIlIlllllllll = (this.field_177079_e.nextFloat() * 2.0f - 1.0f) * 0.15f;
                    final float llllllllllllIllIlllIIlIllllllllI = (this.field_177079_e.nextFloat() * 2.0f - 1.0f) * 0.15f;
                    GlStateManager.translate(llllllllllllIllIlllIIllIIIIIIIII, llllllllllllIllIlllIIlIlllllllll, llllllllllllIllIlllIIlIllllllllI);
                }
                GlStateManager.scale(0.5f, 0.5f, 0.5f);
                llllllllllllIllIlllIIllIIIIIIIll.getItemCameraTransforms().applyTransform(ItemCameraTransforms.TransformType.GROUND);
                this.itemRenderer.renderItem(llllllllllllIllIlllIIllIIIIIIlIl, llllllllllllIllIlllIIllIIIIIIIll);
                GlStateManager.popMatrix();
                "".length();
                if ("  ".length() < ((0xD1 ^ 0xBF ^ (0x41 ^ 0x37)) & (0xEF ^ 0x98 ^ (0x55 ^ 0x3A) ^ -" ".length()))) {
                    return;
                }
            }
            else {
                GlStateManager.pushMatrix();
                llllllllllllIllIlllIIllIIIIIIIll.getItemCameraTransforms().applyTransform(ItemCameraTransforms.TransformType.GROUND);
                this.itemRenderer.renderItem(llllllllllllIllIlllIIllIIIIIIlIl, llllllllllllIllIlllIIllIIIIIIIll);
                GlStateManager.popMatrix();
                final float llllllllllllIllIlllIIlIlllllllIl = llllllllllllIllIlllIIllIIIIIIIll.getItemCameraTransforms().ground.scale.x;
                final float llllllllllllIllIlllIIlIlllllllII = llllllllllllIllIlllIIllIIIIIIIll.getItemCameraTransforms().ground.scale.y;
                final float llllllllllllIllIlllIIlIllllllIll = llllllllllllIllIlllIIllIIIIIIIll.getItemCameraTransforms().ground.scale.z;
                GlStateManager.translate(0.0f * llllllllllllIllIlllIIlIlllllllIl, 0.0f * llllllllllllIllIlllIIlIlllllllII, 0.046875f * llllllllllllIllIlllIIlIllllllIll);
            }
            ++llllllllllllIllIlllIIllIIIIIIIIl;
        }
        GlStateManager.popMatrix();
        GlStateManager.disableRescaleNormal();
        GlStateManager.disableBlend();
        this.bindEntityTexture(llllllllllllIllIlllIIlIllllllIIl);
        "".length();
        if (lIIlIIIIlIIIlllI(llllllllllllIllIlllIIllIIIIIIlII ? 1 : 0)) {
            this.renderManager.renderEngine.getTexture(this.getEntityTexture(llllllllllllIllIlllIIlIllllllIIl)).restoreLastBlurMipmap();
        }
        super.doRender(llllllllllllIllIlllIIlIllllllIIl, llllllllllllIllIlllIIlIllllllIII, llllllllllllIllIlllIIlIlllllIlll, llllllllllllIllIlllIIlIlllllIllI, llllllllllllIllIlllIIllIIIIIIlll, llllllllllllIllIlllIIlIlllllIlII);
    }
    
    private static boolean lIIlIIIIlIIIlIll(final Object llllllllllllIllIlIlllIIIIIIlIIlI) {
        return llllllllllllIllIlIlllIIIIIIlIIlI == null;
    }
    
    static {
        lIIlIIIIlIIIlIlI();
    }
}
