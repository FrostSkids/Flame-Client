// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity.layers;

import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.item.EnumDyeColor;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.entity.RenderWolf;
import net.minecraft.entity.passive.EntityWolf;

public class LayerWolfCollar implements LayerRenderer<EntityWolf>
{
    private static final /* synthetic */ int[] llllIlIIIIIII;
    private static final /* synthetic */ String[] llllIIllllllI;
    private final /* synthetic */ RenderWolf wolfRenderer;
    private static final /* synthetic */ ResourceLocation WOLF_COLLAR;
    
    public LayerWolfCollar(final RenderWolf lllllllllllllIlIlllIIIIlIIllIIlI) {
        this.wolfRenderer = lllllllllllllIlIlllIIIIlIIllIIlI;
    }
    
    private static boolean lIlIlIIlIllllII(final int lllllllllllllIlIlllIIIIIlllIIlIl, final int lllllllllllllIlIlllIIIIIlllIIlII) {
        return lllllllllllllIlIlllIIIIIlllIIlIl < lllllllllllllIlIlllIIIIIlllIIlII;
    }
    
    static {
        lIlIlIIlIlllIIl();
        lIlIlIIlIllIlIl();
        WOLF_COLLAR = new ResourceLocation(LayerWolfCollar.llllIIllllllI[LayerWolfCollar.llllIlIIIIIII[0]]);
    }
    
    private static void lIlIlIIlIllIlIl() {
        (llllIIllllllI = new String[LayerWolfCollar.llllIlIIIIIII[1]])[LayerWolfCollar.llllIlIIIIIII[0]] = lIlIlIIlIllIlII("EzMQMD0VMxtrLQkiATAxSCEHKC5IIQcoLjg1BygkBiRGNCYA", "gVhDH");
    }
    
    private static boolean lIlIlIIlIlllIll(final int lllllllllllllIlIlllIIIIIlllIIIII) {
        return lllllllllllllIlIlllIIIIIlllIIIII == 0;
    }
    
    @Override
    public boolean shouldCombineTextures() {
        return LayerWolfCollar.llllIlIIIIIII[1] != 0;
    }
    
    private static String lIlIlIIlIllIlII(String lllllllllllllIlIlllIIIIIllllIIII, final String lllllllllllllIlIlllIIIIIlllIllll) {
        lllllllllllllIlIlllIIIIIllllIIII = new String(Base64.getDecoder().decode(lllllllllllllIlIlllIIIIIllllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlllIIIIIllllIIll = new StringBuilder();
        final char[] lllllllllllllIlIlllIIIIIllllIIlI = lllllllllllllIlIlllIIIIIlllIllll.toCharArray();
        int lllllllllllllIlIlllIIIIIllllIIIl = LayerWolfCollar.llllIlIIIIIII[0];
        final byte lllllllllllllIlIlllIIIIIlllIlIll = (Object)lllllllllllllIlIlllIIIIIllllIIII.toCharArray();
        final boolean lllllllllllllIlIlllIIIIIlllIlIlI = lllllllllllllIlIlllIIIIIlllIlIll.length != 0;
        boolean lllllllllllllIlIlllIIIIIlllIlIIl = LayerWolfCollar.llllIlIIIIIII[0] != 0;
        while (lIlIlIIlIllllII(lllllllllllllIlIlllIIIIIlllIlIIl ? 1 : 0, lllllllllllllIlIlllIIIIIlllIlIlI ? 1 : 0)) {
            final char lllllllllllllIlIlllIIIIIllllIllI = lllllllllllllIlIlllIIIIIlllIlIll[lllllllllllllIlIlllIIIIIlllIlIIl];
            lllllllllllllIlIlllIIIIIllllIIll.append((char)(lllllllllllllIlIlllIIIIIllllIllI ^ lllllllllllllIlIlllIIIIIllllIIlI[lllllllllllllIlIlllIIIIIllllIIIl % lllllllllllllIlIlllIIIIIllllIIlI.length]));
            "".length();
            ++lllllllllllllIlIlllIIIIIllllIIIl;
            ++lllllllllllllIlIlllIIIIIlllIlIIl;
            "".length();
            if (" ".length() < -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlllIIIIIllllIIll);
    }
    
    private static boolean lIlIlIIlIlllIlI(final int lllllllllllllIlIlllIIIIIlllIIIlI) {
        return lllllllllllllIlIlllIIIIIlllIIIlI != 0;
    }
    
    @Override
    public void doRenderLayer(final EntityWolf lllllllllllllIlIlllIIIIlIIlIIllI, final float lllllllllllllIlIlllIIIIlIIlIIlIl, final float lllllllllllllIlIlllIIIIlIIIllIIl, final float lllllllllllllIlIlllIIIIlIIlIIIll, final float lllllllllllllIlIlllIIIIlIIlIIIlI, final float lllllllllllllIlIlllIIIIlIIIlIlll, final float lllllllllllllIlIlllIIIIlIIIlIllI, final float lllllllllllllIlIlllIIIIlIIIlllll) {
        if (lIlIlIIlIlllIlI(lllllllllllllIlIlllIIIIlIIlIIllI.isTamed() ? 1 : 0) && lIlIlIIlIlllIll(lllllllllllllIlIlllIIIIlIIlIIllI.isInvisible() ? 1 : 0)) {
            this.wolfRenderer.bindTexture(LayerWolfCollar.WOLF_COLLAR);
            final EnumDyeColor lllllllllllllIlIlllIIIIlIIIllllI = EnumDyeColor.byMetadata(lllllllllllllIlIlllIIIIlIIlIIllI.getCollarColor().getMetadata());
            final float[] lllllllllllllIlIlllIIIIlIIIlllIl = EntitySheep.func_175513_a(lllllllllllllIlIlllIIIIlIIIllllI);
            GlStateManager.color(lllllllllllllIlIlllIIIIlIIIlllIl[LayerWolfCollar.llllIlIIIIIII[0]], lllllllllllllIlIlllIIIIlIIIlllIl[LayerWolfCollar.llllIlIIIIIII[1]], lllllllllllllIlIlllIIIIlIIIlllIl[LayerWolfCollar.llllIlIIIIIII[2]]);
            this.wolfRenderer.getMainModel().render(lllllllllllllIlIlllIIIIlIIlIIllI, lllllllllllllIlIlllIIIIlIIlIIlIl, lllllllllllllIlIlllIIIIlIIIllIIl, lllllllllllllIlIlllIIIIlIIlIIIlI, lllllllllllllIlIlllIIIIlIIIlIlll, lllllllllllllIlIlllIIIIlIIIlIllI, lllllllllllllIlIlllIIIIlIIIlllll);
        }
    }
    
    private static void lIlIlIIlIlllIIl() {
        (llllIlIIIIIII = new int[3])[0] = ((0xB4 ^ 0xBA) & ~(0x6B ^ 0x65));
        LayerWolfCollar.llllIlIIIIIII[1] = " ".length();
        LayerWolfCollar.llllIlIIIIIII[2] = "  ".length();
    }
}
