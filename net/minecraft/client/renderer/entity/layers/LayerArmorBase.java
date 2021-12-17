// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity.layers;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import com.google.common.collect.Maps;
import net.minecraft.item.ItemArmor;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.util.ResourceLocation;
import java.util.Map;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.model.ModelBase;

public abstract class LayerArmorBase<T extends ModelBase> implements LayerRenderer<EntityLivingBase>
{
    private /* synthetic */ float colorR;
    protected /* synthetic */ T field_177189_c;
    private static final /* synthetic */ String[] llIIlllllIIIII;
    protected /* synthetic */ T field_177186_d;
    private static final /* synthetic */ Map<String, ResourceLocation> ARMOR_TEXTURE_RES_MAP;
    private /* synthetic */ float colorG;
    protected static final /* synthetic */ ResourceLocation ENCHANTED_ITEM_GLINT_RES;
    private static final /* synthetic */ int[] llIIlllllIIIIl;
    private final /* synthetic */ RendererLivingEntity<?> renderer;
    private /* synthetic */ float colorB;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$item$ItemArmor$ArmorMaterial;
    private /* synthetic */ boolean field_177193_i;
    private /* synthetic */ float alpha;
    
    private ResourceLocation getArmorResource(final ItemArmor llllllllllllIllIlllIIlllIIIlIIII, final boolean llllllllllllIllIlllIIlllIIIIllll) {
        return this.getArmorResource(llllllllllllIllIlllIIlllIIIlIIII, llllllllllllIllIlllIIlllIIIIllll, null);
    }
    
    private static boolean lIIlIIIIIlllllll(final Object llllllllllllIllIlllIIllIlIlllIlI) {
        return llllllllllllIllIlllIIllIlIlllIlI != null;
    }
    
    private static boolean lIIlIIIIlIIIIlIl(final int llllllllllllIllIlllIIllIlIllllIl, final int llllllllllllIllIlllIIllIlIllllII) {
        return llllllllllllIllIlllIIllIlIllllIl < llllllllllllIllIlllIIllIlIllllII;
    }
    
    private ResourceLocation getArmorResource(final ItemArmor llllllllllllIllIlllIIlllIIIIIlIl, final boolean llllllllllllIllIlllIIlllIIIIIlII, final String llllllllllllIllIlllIIllIlllllllI) {
        final String format = LayerArmorBase.llIIlllllIIIII[LayerArmorBase.llIIlllllIIIIl[3]];
        final Object[] args = new Object[LayerArmorBase.llIIlllllIIIIl[2]];
        args[LayerArmorBase.llIIlllllIIIIl[0]] = llllllllllllIllIlllIIlllIIIIIlIl.getArmorMaterial().getName();
        final int n = LayerArmorBase.llIIlllllIIIIl[4];
        int i;
        if (lIIlIIIIlIIIIIII(llllllllllllIllIlllIIlllIIIIIlII ? 1 : 0)) {
            i = LayerArmorBase.llIIlllllIIIIl[3];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            i = LayerArmorBase.llIIlllllIIIIl[4];
        }
        args[n] = i;
        final int n2 = LayerArmorBase.llIIlllllIIIIl[3];
        String format2;
        if (lIIlIIIIlIIIIlII(llllllllllllIllIlllIIllIlllllllI)) {
            format2 = LayerArmorBase.llIIlllllIIIII[LayerArmorBase.llIIlllllIIIIl[2]];
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        else {
            final String format3 = LayerArmorBase.llIIlllllIIIII[LayerArmorBase.llIIlllllIIIIl[1]];
            final Object[] args2 = new Object[LayerArmorBase.llIIlllllIIIIl[4]];
            args2[LayerArmorBase.llIIlllllIIIIl[0]] = llllllllllllIllIlllIIllIlllllllI;
            format2 = String.format(format3, args2);
        }
        args[n2] = format2;
        final String llllllllllllIllIlllIIlllIIIIIIlI = String.format(format, args);
        ResourceLocation llllllllllllIllIlllIIlllIIIIIIIl = LayerArmorBase.ARMOR_TEXTURE_RES_MAP.get(llllllllllllIllIlllIIlllIIIIIIlI);
        if (lIIlIIIIlIIIIlII(llllllllllllIllIlllIIlllIIIIIIIl)) {
            llllllllllllIllIlllIIlllIIIIIIIl = new ResourceLocation(llllllllllllIllIlllIIlllIIIIIIlI);
            LayerArmorBase.ARMOR_TEXTURE_RES_MAP.put(llllllllllllIllIlllIIlllIIIIIIlI, llllllllllllIllIlllIIlllIIIIIIIl);
            "".length();
        }
        return llllllllllllIllIlllIIlllIIIIIIIl;
    }
    
    private static boolean lIIlIIIIlIIIIIlI(final int llllllllllllIllIlllIIllIllIIIlIl, final int llllllllllllIllIlllIIllIllIIIlII) {
        return llllllllllllIllIlllIIllIllIIIlIl == llllllllllllIllIlllIIllIllIIIlII;
    }
    
    static {
        lIIlIIIIIllllllI();
        lIIlIIIIIlllllIl();
        ENCHANTED_ITEM_GLINT_RES = new ResourceLocation(LayerArmorBase.llIIlllllIIIII[LayerArmorBase.llIIlllllIIIIl[0]]);
        ARMOR_TEXTURE_RES_MAP = Maps.newHashMap();
    }
    
    private static void lIIlIIIIIllllllI() {
        (llIIlllllIIIIl = new int[14])[0] = ("   ".length() & ~"   ".length());
        LayerArmorBase.llIIlllllIIIIl[1] = (0xB1 ^ 0xB5);
        LayerArmorBase.llIIlllllIIIIl[2] = "   ".length();
        LayerArmorBase.llIIlllllIIIIl[3] = "  ".length();
        LayerArmorBase.llIIlllllIIIIl[4] = " ".length();
        LayerArmorBase.llIIlllllIIIIl[5] = (203 + 132 - 126 + 0 ^ 43 + 167 - 59 + 42);
        LayerArmorBase.llIIlllllIIIIl[6] = 65 + 36 - 84 + 238;
        LayerArmorBase.llIIlllllIIIIl[7] = (0x62 ^ 0x70 ^ (0xDD ^ 0xC7));
        LayerArmorBase.llIIlllllIIIIl[8] = (-(0xFFFF9DF9 & 0x7E77) & (0xFFFF9E7B & 0x7FF6));
        LayerArmorBase.llIIlllllIIIIl[9] = (0xFFFFF7AD & 0xB52);
        LayerArmorBase.llIIlllllIIIIl[10] = (-(0xFFFFC85F & 0x3FAA) & (0xFFFFBF6B & 0x5F9F));
        LayerArmorBase.llIIlllllIIIIl[11] = (0xFFFF97DA & 0x7F25);
        LayerArmorBase.llIIlllllIIIIl[12] = (0xFFFFF703 & 0xAFF);
        LayerArmorBase.llIIlllllIIIIl[13] = (94 + 4 + 31 + 28 ^ 19 + 109 - 74 + 98);
    }
    
    protected abstract void func_177179_a(final T p0, final int p1);
    
    @Override
    public boolean shouldCombineTextures() {
        return LayerArmorBase.llIIlllllIIIIl[0] != 0;
    }
    
    private static boolean lIIlIIIIlIIIIIll(final int llllllllllllIllIlllIIllIllIIIIIl, final int llllllllllllIllIlllIIllIllIIIIII) {
        return llllllllllllIllIlllIIllIllIIIIIl >= llllllllllllIllIlllIIllIllIIIIII;
    }
    
    @Override
    public void doRenderLayer(final EntityLivingBase llllllllllllIllIlllIIllllIIlIIIl, final float llllllllllllIllIlllIIllllIIllIIl, final float llllllllllllIllIlllIIllllIIIllll, final float llllllllllllIllIlllIIllllIIlIlll, final float llllllllllllIllIlllIIllllIIlIllI, final float llllllllllllIllIlllIIllllIIlIlIl, final float llllllllllllIllIlllIIllllIIlIlII, final float llllllllllllIllIlllIIllllIIlIIll) {
        this.renderLayer(llllllllllllIllIlllIIllllIIlIIIl, llllllllllllIllIlllIIllllIIllIIl, llllllllllllIllIlllIIllllIIIllll, llllllllllllIllIlllIIllllIIlIlll, llllllllllllIllIlllIIllllIIlIllI, llllllllllllIllIlllIIllllIIlIlIl, llllllllllllIllIlllIIllllIIlIlII, llllllllllllIllIlllIIllllIIlIIll, LayerArmorBase.llIIlllllIIIIl[1]);
        this.renderLayer(llllllllllllIllIlllIIllllIIlIIIl, llllllllllllIllIlllIIllllIIllIIl, llllllllllllIllIlllIIllllIIIllll, llllllllllllIllIlllIIllllIIlIlll, llllllllllllIllIlllIIllllIIlIllI, llllllllllllIllIlllIIllllIIlIlIl, llllllllllllIllIlllIIllllIIlIlII, llllllllllllIllIlllIIllllIIlIIll, LayerArmorBase.llIIlllllIIIIl[2]);
        this.renderLayer(llllllllllllIllIlllIIllllIIlIIIl, llllllllllllIllIlllIIllllIIllIIl, llllllllllllIllIlllIIllllIIIllll, llllllllllllIllIlllIIllllIIlIlll, llllllllllllIllIlllIIllllIIlIllI, llllllllllllIllIlllIIllllIIlIlIl, llllllllllllIllIlllIIllllIIlIlII, llllllllllllIllIlllIIllllIIlIIll, LayerArmorBase.llIIlllllIIIIl[3]);
        this.renderLayer(llllllllllllIllIlllIIllllIIlIIIl, llllllllllllIllIlllIIllllIIllIIl, llllllllllllIllIlllIIllllIIIllll, llllllllllllIllIlllIIllllIIlIlll, llllllllllllIllIlllIIllllIIlIllI, llllllllllllIllIlllIIllllIIlIlIl, llllllllllllIllIlllIIllllIIlIlII, llllllllllllIllIlllIIllllIIlIIll, LayerArmorBase.llIIlllllIIIIl[4]);
    }
    
    private void func_177183_a(final EntityLivingBase llllllllllllIllIlllIIlllIIlIIIlI, final T llllllllllllIllIlllIIlllIIlIIIIl, final float llllllllllllIllIlllIIlllIIlIIIII, final float llllllllllllIllIlllIIlllIIIlllll, final float llllllllllllIllIlllIIlllIIlIllIl, final float llllllllllllIllIlllIIlllIIlIllII, final float llllllllllllIllIlllIIlllIIlIlIll, final float llllllllllllIllIlllIIlllIIIllIll, final float llllllllllllIllIlllIIlllIIlIlIIl) {
        final float llllllllllllIllIlllIIlllIIlIlIII = llllllllllllIllIlllIIlllIIlIIIlI.ticksExisted + llllllllllllIllIlllIIlllIIlIllIl;
        this.renderer.bindTexture(LayerArmorBase.ENCHANTED_ITEM_GLINT_RES);
        GlStateManager.enableBlend();
        GlStateManager.depthFunc(LayerArmorBase.llIIlllllIIIIl[8]);
        GlStateManager.depthMask((boolean)(LayerArmorBase.llIIlllllIIIIl[0] != 0));
        final float llllllllllllIllIlllIIlllIIlIIlll = 0.5f;
        GlStateManager.color(llllllllllllIllIlllIIlllIIlIIlll, llllllllllllIllIlllIIlllIIlIIlll, llllllllllllIllIlllIIlllIIlIIlll, 1.0f);
        int llllllllllllIllIlllIIlllIIlIIllI = LayerArmorBase.llIIlllllIIIIl[0];
        "".length();
        if ((0xB2 ^ 0xB6) == 0x0) {
            return;
        }
        while (!lIIlIIIIlIIIIIll(llllllllllllIllIlllIIlllIIlIIllI, LayerArmorBase.llIIlllllIIIIl[3])) {
            GlStateManager.disableLighting();
            GlStateManager.blendFunc(LayerArmorBase.llIIlllllIIIIl[9], LayerArmorBase.llIIlllllIIIIl[4]);
            final float llllllllllllIllIlllIIlllIIlIIlIl = 0.76f;
            GlStateManager.color(0.5f * llllllllllllIllIlllIIlllIIlIIlIl, 0.25f * llllllllllllIllIlllIIlllIIlIIlIl, 0.8f * llllllllllllIllIlllIIlllIIlIIlIl, 1.0f);
            GlStateManager.matrixMode(LayerArmorBase.llIIlllllIIIIl[10]);
            GlStateManager.loadIdentity();
            final float llllllllllllIllIlllIIlllIIlIIlII = 0.33333334f;
            GlStateManager.scale(llllllllllllIllIlllIIlllIIlIIlII, llllllllllllIllIlllIIlllIIlIIlII, llllllllllllIllIlllIIlllIIlIIlII);
            GlStateManager.rotate(30.0f - llllllllllllIllIlllIIlllIIlIIllI * 60.0f, 0.0f, 0.0f, 1.0f);
            GlStateManager.translate(0.0f, llllllllllllIllIlllIIlllIIlIlIII * (0.001f + llllllllllllIllIlllIIlllIIlIIllI * 0.003f) * 20.0f, 0.0f);
            GlStateManager.matrixMode(LayerArmorBase.llIIlllllIIIIl[11]);
            llllllllllllIllIlllIIlllIIlIIIIl.render(llllllllllllIllIlllIIlllIIlIIIlI, llllllllllllIllIlllIIlllIIlIIIII, llllllllllllIllIlllIIlllIIIlllll, llllllllllllIllIlllIIlllIIlIllII, llllllllllllIllIlllIIlllIIlIlIll, llllllllllllIllIlllIIlllIIIllIll, llllllllllllIllIlllIIlllIIlIlIIl);
            ++llllllllllllIllIlllIIlllIIlIIllI;
        }
        GlStateManager.matrixMode(LayerArmorBase.llIIlllllIIIIl[10]);
        GlStateManager.loadIdentity();
        GlStateManager.matrixMode(LayerArmorBase.llIIlllllIIIIl[11]);
        GlStateManager.enableLighting();
        GlStateManager.depthMask((boolean)(LayerArmorBase.llIIlllllIIIIl[4] != 0));
        GlStateManager.depthFunc(LayerArmorBase.llIIlllllIIIIl[12]);
        GlStateManager.disableBlend();
    }
    
    private void renderLayer(final EntityLivingBase llllllllllllIllIlllIIlllIllIIIll, final float llllllllllllIllIlllIIlllIllIIIlI, final float llllllllllllIllIlllIIlllIlllIIll, final float llllllllllllIllIlllIIlllIlllIIlI, final float llllllllllllIllIlllIIlllIlIlllll, final float llllllllllllIllIlllIIlllIlIllllI, final float llllllllllllIllIlllIIlllIlIlllIl, final float llllllllllllIllIlllIIlllIllIlllI, final int llllllllllllIllIlllIIlllIllIllIl) {
        final ItemStack llllllllllllIllIlllIIlllIllIllII = this.getCurrentArmor(llllllllllllIllIlllIIlllIllIIIll, llllllllllllIllIlllIIlllIllIllIl);
        if (lIIlIIIIIlllllll(llllllllllllIllIlllIIlllIllIllII) && lIIlIIIIlIIIIIII((llllllllllllIllIlllIIlllIllIllII.getItem() instanceof ItemArmor) ? 1 : 0)) {
            final ItemArmor llllllllllllIllIlllIIlllIllIlIll = (ItemArmor)llllllllllllIllIlllIIlllIllIllII.getItem();
            final T llllllllllllIllIlllIIlllIllIlIlI = this.func_177175_a(llllllllllllIllIlllIIlllIllIllIl);
            llllllllllllIllIlllIIlllIllIlIlI.setModelAttributes(this.renderer.getMainModel());
            llllllllllllIllIlllIIlllIllIlIlI.setLivingAnimations(llllllllllllIllIlllIIlllIllIIIll, llllllllllllIllIlllIIlllIllIIIlI, llllllllllllIllIlllIIlllIlllIIll, llllllllllllIllIlllIIlllIlllIIlI);
            this.func_177179_a(llllllllllllIllIlllIIlllIllIlIlI, llllllllllllIllIlllIIlllIllIllIl);
            final boolean llllllllllllIllIlllIIlllIllIlIIl = this.isSlotForLeggings(llllllllllllIllIlllIIlllIllIllIl);
            this.renderer.bindTexture(this.getArmorResource(llllllllllllIllIlllIIlllIllIlIll, llllllllllllIllIlllIIlllIllIlIIl));
            switch ($SWITCH_TABLE$net$minecraft$item$ItemArmor$ArmorMaterial()[llllllllllllIllIlllIIlllIllIlIll.getArmorMaterial().ordinal()]) {
                case 1: {
                    final int llllllllllllIllIlllIIlllIllIlIII = llllllllllllIllIlllIIlllIllIlIll.getColor(llllllllllllIllIlllIIlllIllIllII);
                    final float llllllllllllIllIlllIIlllIllIIlll = (llllllllllllIllIlllIIlllIllIlIII >> LayerArmorBase.llIIlllllIIIIl[5] & LayerArmorBase.llIIlllllIIIIl[6]) / 255.0f;
                    final float llllllllllllIllIlllIIlllIllIIllI = (llllllllllllIllIlllIIlllIllIlIII >> LayerArmorBase.llIIlllllIIIIl[7] & LayerArmorBase.llIIlllllIIIIl[6]) / 255.0f;
                    final float llllllllllllIllIlllIIlllIllIIlIl = (llllllllllllIllIlllIIlllIllIlIII & LayerArmorBase.llIIlllllIIIIl[6]) / 255.0f;
                    GlStateManager.color(this.colorR * llllllllllllIllIlllIIlllIllIIlll, this.colorG * llllllllllllIllIlllIIlllIllIIllI, this.colorB * llllllllllllIllIlllIIlllIllIIlIl, this.alpha);
                    llllllllllllIllIlllIIlllIllIlIlI.render(llllllllllllIllIlllIIlllIllIIIll, llllllllllllIllIlllIIlllIllIIIlI, llllllllllllIllIlllIIlllIlllIIll, llllllllllllIllIlllIIlllIlIlllll, llllllllllllIllIlllIIlllIlIllllI, llllllllllllIllIlllIIlllIlIlllIl, llllllllllllIllIlllIIlllIllIlllI);
                    this.renderer.bindTexture(this.getArmorResource(llllllllllllIllIlllIIlllIllIlIll, llllllllllllIllIlllIIlllIllIlIIl, LayerArmorBase.llIIlllllIIIII[LayerArmorBase.llIIlllllIIIIl[4]]));
                }
                case 2:
                case 3:
                case 4:
                case 5: {
                    GlStateManager.color(this.colorR, this.colorG, this.colorB, this.alpha);
                    llllllllllllIllIlllIIlllIllIlIlI.render(llllllllllllIllIlllIIlllIllIIIll, llllllllllllIllIlllIIlllIllIIIlI, llllllllllllIllIlllIIlllIlllIIll, llllllllllllIllIlllIIlllIlIlllll, llllllllllllIllIlllIIlllIlIllllI, llllllllllllIllIlllIIlllIlIlllIl, llllllllllllIllIlllIIlllIllIlllI);
                    break;
                }
            }
            if (lIIlIIIIlIIIIIIl(this.field_177193_i ? 1 : 0) && lIIlIIIIlIIIIIII(llllllllllllIllIlllIIlllIllIllII.isItemEnchanted() ? 1 : 0)) {
                this.func_177183_a(llllllllllllIllIlllIIlllIllIIIll, llllllllllllIllIlllIIlllIllIlIlI, llllllllllllIllIlllIIlllIllIIIlI, llllllllllllIllIlllIIlllIlllIIll, llllllllllllIllIlllIIlllIlllIIlI, llllllllllllIllIlllIIlllIlIlllll, llllllllllllIllIlllIIlllIlIllllI, llllllllllllIllIlllIIlllIlIlllIl, llllllllllllIllIlllIIlllIllIlllI);
            }
        }
    }
    
    private static boolean lIIlIIIIlIIIIlII(final Object llllllllllllIllIlllIIllIlIlllIII) {
        return llllllllllllIllIlllIIllIlIlllIII == null;
    }
    
    public T func_177175_a(final int llllllllllllIllIlllIIlllIlIIIllI) {
        ModelBase modelBase;
        if (lIIlIIIIlIIIIIII(this.isSlotForLeggings(llllllllllllIllIlllIIlllIlIIIllI) ? 1 : 0)) {
            modelBase = this.field_177189_c;
            "".length();
            if (-(0x4E ^ 0x74 ^ (0x89 ^ 0xB6)) >= 0) {
                return null;
            }
        }
        else {
            modelBase = this.field_177186_d;
        }
        return (T)modelBase;
    }
    
    public LayerArmorBase(final RendererLivingEntity<?> llllllllllllIllIlllIIllllIlIIlIl) {
        this.alpha = 1.0f;
        this.colorR = 1.0f;
        this.colorG = 1.0f;
        this.colorB = 1.0f;
        this.renderer = llllllllllllIllIlllIIllllIlIIlIl;
        this.initArmor();
    }
    
    private static String lIIlIIIIIllllIll(String llllllllllllIllIlllIIllIlllIlIlI, final String llllllllllllIllIlllIIllIlllIlllI) {
        llllllllllllIllIlllIIllIlllIlIlI = new String(Base64.getDecoder().decode(llllllllllllIllIlllIIllIlllIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlllIIllIlllIllIl = new StringBuilder();
        final char[] llllllllllllIllIlllIIllIlllIllII = llllllllllllIllIlllIIllIlllIlllI.toCharArray();
        int llllllllllllIllIlllIIllIlllIlIll = LayerArmorBase.llIIlllllIIIIl[0];
        final double llllllllllllIllIlllIIllIlllIIlIl = (Object)llllllllllllIllIlllIIllIlllIlIlI.toCharArray();
        final String llllllllllllIllIlllIIllIlllIIlII = (String)llllllllllllIllIlllIIllIlllIIlIl.length;
        String llllllllllllIllIlllIIllIlllIIIll = (String)LayerArmorBase.llIIlllllIIIIl[0];
        while (lIIlIIIIlIIIIlIl((int)llllllllllllIllIlllIIllIlllIIIll, (int)llllllllllllIllIlllIIllIlllIIlII)) {
            final char llllllllllllIllIlllIIllIllllIIII = llllllllllllIllIlllIIllIlllIIlIl[llllllllllllIllIlllIIllIlllIIIll];
            llllllllllllIllIlllIIllIlllIllIl.append((char)(llllllllllllIllIlllIIllIllllIIII ^ llllllllllllIllIlllIIllIlllIllII[llllllllllllIllIlllIIllIlllIlIll % llllllllllllIllIlllIIllIlllIllII.length]));
            "".length();
            ++llllllllllllIllIlllIIllIlllIlIll;
            ++llllllllllllIllIlllIIllIlllIIIll;
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlllIIllIlllIllIl);
    }
    
    private static String lIIlIIIIIllllIlI(final String llllllllllllIllIlllIIllIllIllIII, final String llllllllllllIllIlllIIllIllIllIIl) {
        try {
            final SecretKeySpec llllllllllllIllIlllIIllIllIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIIllIllIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlllIIllIllIlllII = Cipher.getInstance("Blowfish");
            llllllllllllIllIlllIIllIllIlllII.init(LayerArmorBase.llIIlllllIIIIl[3], llllllllllllIllIlllIIllIllIlllIl);
            return new String(llllllllllllIllIlllIIllIllIlllII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIIllIllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllIIllIllIllIll) {
            llllllllllllIllIlllIIllIllIllIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIIIIlIIIIIII(final int llllllllllllIllIlllIIllIlIllIllI) {
        return llllllllllllIllIlllIIllIlIllIllI != 0;
    }
    
    private static boolean lIIlIIIIlIIIIIIl(final int llllllllllllIllIlllIIllIlIllIlII) {
        return llllllllllllIllIlllIIllIlIllIlII == 0;
    }
    
    private static void lIIlIIIIIlllllIl() {
        (llIIlllllIIIII = new String[LayerArmorBase.llIIlllllIIIIl[13]])[LayerArmorBase.llIIlllllIIIIl[0]] = lIIlIIIIIllllIlI("Q4ir9JP4S2bt5wzW4m+hAra0qsklNIbFX5mqrslzyn34f6sHH7Eulg==", "slMda");
        LayerArmorBase.llIIlllllIIIII[LayerArmorBase.llIIlllllIIIIl[4]] = lIIlIIIIIllllIll("CjoGIRwENQ==", "eLcSp");
        LayerArmorBase.llIIlllllIIIII[LayerArmorBase.llIIlllllIIIIl[3]] = lIIlIIIIIllllIlI("b1KptxYwwtrW+ns2FFjL1f49GWu/qDlXk652TTj0tuX9NobUdFiPcA==", "pAaDi");
        LayerArmorBase.llIIlllllIIIII[LayerArmorBase.llIIlllllIIIIl[2]] = lIIlIIIIIllllIlI("QTvHNz+6hl4=", "TcEGU");
        LayerArmorBase.llIIlllllIIIII[LayerArmorBase.llIIlllllIIIIl[1]] = lIIlIIIIIlllllII("jY1ZD6YRCVQ=", "UpNQG");
    }
    
    protected abstract void initArmor();
    
    private static String lIIlIIIIIlllllII(final String llllllllllllIllIlllIIllIllIIlIll, final String llllllllllllIllIlllIIllIllIIlIlI) {
        try {
            final SecretKeySpec llllllllllllIllIlllIIllIllIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIIllIllIIlIlI.getBytes(StandardCharsets.UTF_8)), LayerArmorBase.llIIlllllIIIIl[7]), "DES");
            final Cipher llllllllllllIllIlllIIllIllIIllll = Cipher.getInstance("DES");
            llllllllllllIllIlllIIllIllIIllll.init(LayerArmorBase.llIIlllllIIIIl[3], llllllllllllIllIlllIIllIllIlIIII);
            return new String(llllllllllllIllIlllIIllIllIIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIIllIllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllIIllIllIIlllI) {
            llllllllllllIllIlllIIllIllIIlllI.printStackTrace();
            return null;
        }
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$item$ItemArmor$ArmorMaterial() {
        final int[] $switch_TABLE$net$minecraft$item$ItemArmor$ArmorMaterial = LayerArmorBase.$SWITCH_TABLE$net$minecraft$item$ItemArmor$ArmorMaterial;
        if (lIIlIIIIIlllllll($switch_TABLE$net$minecraft$item$ItemArmor$ArmorMaterial)) {
            return $switch_TABLE$net$minecraft$item$ItemArmor$ArmorMaterial;
        }
        "".length();
        final int llllllllllllIllIlllIIllIlllllIlI = (Object)new int[ItemArmor.ArmorMaterial.values().length];
        try {
            llllllllllllIllIlllIIllIlllllIlI[ItemArmor.ArmorMaterial.CHAIN.ordinal()] = LayerArmorBase.llIIlllllIIIIl[3];
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIllIlllIIllIlllllIlI[ItemArmor.ArmorMaterial.DIAMOND.ordinal()] = LayerArmorBase.llIIlllllIIIIl[13];
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIllIlllIIllIlllllIlI[ItemArmor.ArmorMaterial.GOLD.ordinal()] = LayerArmorBase.llIIlllllIIIIl[1];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIllIlllIIllIlllllIlI[ItemArmor.ArmorMaterial.IRON.ordinal()] = LayerArmorBase.llIIlllllIIIIl[2];
            "".length();
            if (-" ".length() >= "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            llllllllllllIllIlllIIllIlllllIlI[ItemArmor.ArmorMaterial.LEATHER.ordinal()] = LayerArmorBase.llIIlllllIIIIl[4];
            "".length();
            if (" ".length() > "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        return LayerArmorBase.$SWITCH_TABLE$net$minecraft$item$ItemArmor$ArmorMaterial = (int[])(Object)llllllllllllIllIlllIIllIlllllIlI;
    }
    
    private boolean isSlotForLeggings(final int llllllllllllIllIlllIIlllIlIIIIlI) {
        if (lIIlIIIIlIIIIIlI(llllllllllllIllIlllIIlllIlIIIIlI, LayerArmorBase.llIIlllllIIIIl[3])) {
            return LayerArmorBase.llIIlllllIIIIl[4] != 0;
        }
        return LayerArmorBase.llIIlllllIIIIl[0] != 0;
    }
    
    public ItemStack getCurrentArmor(final EntityLivingBase llllllllllllIllIlllIIlllIlIIllll, final int llllllllllllIllIlllIIlllIlIIllII) {
        return llllllllllllIllIlllIIlllIlIIllll.getCurrentArmor(llllllllllllIllIlllIIlllIlIIllII - LayerArmorBase.llIIlllllIIIIl[4]);
    }
}
