// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.EntityLivingBase;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.renderer.entity.layers.LayerSlimeGel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.monster.EntitySlime;

public class RenderSlime extends RenderLiving<EntitySlime>
{
    private static final /* synthetic */ ResourceLocation slimeTextures;
    private static final /* synthetic */ int[] llIlIlIIIIlIII;
    private static final /* synthetic */ String[] llIlIlIIIIIlll;
    
    private static boolean lIIlIIllIlllIllI(final int llllllllllllIllIlIllIIllIIIllIII, final int llllllllllllIllIlIllIIllIIIlIlll) {
        return llllllllllllIllIlIllIIllIIIllIII < llllllllllllIllIlIllIIllIIIlIlll;
    }
    
    private static void lIIlIIllIlllIlII() {
        (llIlIlIIIIIlll = new String[RenderSlime.llIlIlIIIIlIII[1]])[RenderSlime.llIlIlIIIIlIII[0]] = lIIlIIllIlllIIll("FTw7Ez8TPDBILw8tKhMzTiovDicEdjALIww8bRckBg==", "aYCgJ");
    }
    
    private static void lIIlIIllIlllIlIl() {
        (llIlIlIIIIlIII = new int[2])[0] = ((0x22 ^ 0x33) & ~(0xD5 ^ 0xC4));
        RenderSlime.llIlIlIIIIlIII[1] = " ".length();
    }
    
    public RenderSlime(final RenderManager llllllllllllIllIlIllIIllIlllIlII, final ModelBase llllllllllllIllIlIllIIllIlllIIll, final float llllllllllllIllIlIllIIllIlllIllI) {
        super(llllllllllllIllIlIllIIllIlllIlII, llllllllllllIllIlIllIIllIlllIIll, llllllllllllIllIlIllIIllIlllIllI);
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerSlimeGel(this));
        "".length();
    }
    
    private static String lIIlIIllIlllIIll(String llllllllllllIllIlIllIIllIIlIIIll, final String llllllllllllIllIlIllIIllIIlIIlll) {
        llllllllllllIllIlIllIIllIIlIIIll = new String(Base64.getDecoder().decode(llllllllllllIllIlIllIIllIIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIllIIllIIlIIllI = new StringBuilder();
        final char[] llllllllllllIllIlIllIIllIIlIIlIl = llllllllllllIllIlIllIIllIIlIIlll.toCharArray();
        int llllllllllllIllIlIllIIllIIlIIlII = RenderSlime.llIlIlIIIIlIII[0];
        final boolean llllllllllllIllIlIllIIllIIIllllI = (Object)llllllllllllIllIlIllIIllIIlIIIll.toCharArray();
        final float llllllllllllIllIlIllIIllIIIlllIl = llllllllllllIllIlIllIIllIIIllllI.length;
        int llllllllllllIllIlIllIIllIIIlllII = RenderSlime.llIlIlIIIIlIII[0];
        while (lIIlIIllIlllIllI(llllllllllllIllIlIllIIllIIIlllII, (int)llllllllllllIllIlIllIIllIIIlllIl)) {
            final char llllllllllllIllIlIllIIllIIlIlIIl = llllllllllllIllIlIllIIllIIIllllI[llllllllllllIllIlIllIIllIIIlllII];
            llllllllllllIllIlIllIIllIIlIIllI.append((char)(llllllllllllIllIlIllIIllIIlIlIIl ^ llllllllllllIllIlIllIIllIIlIIlIl[llllllllllllIllIlIllIIllIIlIIlII % llllllllllllIllIlIllIIllIIlIIlIl.length]));
            "".length();
            ++llllllllllllIllIlIllIIllIIlIIlII;
            ++llllllllllllIllIlIllIIllIIIlllII;
            "".length();
            if ((0x8F ^ 0x8A) == 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIllIIllIIlIIllI);
    }
    
    static {
        lIIlIIllIlllIlIl();
        lIIlIIllIlllIlII();
        slimeTextures = new ResourceLocation(RenderSlime.llIlIlIIIIIlll[RenderSlime.llIlIlIIIIlIII[0]]);
    }
    
    @Override
    protected void preRenderCallback(final EntitySlime llllllllllllIllIlIllIIllIlIlIIIl, final float llllllllllllIllIlIllIIllIlIlIIII) {
        final float llllllllllllIllIlIllIIllIlIlIlII = (float)llllllllllllIllIlIllIIllIlIlIIIl.getSlimeSize();
        final float llllllllllllIllIlIllIIllIlIlIIll = (llllllllllllIllIlIllIIllIlIlIIIl.prevSquishFactor + (llllllllllllIllIlIllIIllIlIlIIIl.squishFactor - llllllllllllIllIlIllIIllIlIlIIIl.prevSquishFactor) * llllllllllllIllIlIllIIllIlIlIIII) / (llllllllllllIllIlIllIIllIlIlIlII * 0.5f + 1.0f);
        final float llllllllllllIllIlIllIIllIlIlIIlI = 1.0f / (llllllllllllIllIlIllIIllIlIlIIll + 1.0f);
        GlStateManager.scale(llllllllllllIllIlIllIIllIlIlIIlI * llllllllllllIllIlIllIIllIlIlIlII, 1.0f / llllllllllllIllIlIllIIllIlIlIIlI * llllllllllllIllIlIllIIllIlIlIlII, llllllllllllIllIlIllIIllIlIlIIlI * llllllllllllIllIlIllIIllIlIlIlII);
    }
    
    @Override
    public void doRender(final EntitySlime llllllllllllIllIlIllIIllIllIIIlI, final double llllllllllllIllIlIllIIllIllIlIII, final double llllllllllllIllIlIllIIllIllIIlll, final double llllllllllllIllIlIllIIllIlIlllll, final float llllllllllllIllIlIllIIllIlIllllI, final float llllllllllllIllIlIllIIllIllIIlII) {
        this.shadowSize = 0.25f * llllllllllllIllIlIllIIllIllIIIlI.getSlimeSize();
        super.doRender(llllllllllllIllIlIllIIllIllIIIlI, llllllllllllIllIlIllIIllIllIlIII, llllllllllllIllIlIllIIllIllIIlll, llllllllllllIllIlIllIIllIlIlllll, llllllllllllIllIlIllIIllIlIllllI, llllllllllllIllIlIllIIllIllIIlII);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntitySlime llllllllllllIllIlIllIIllIlIIlIll) {
        return RenderSlime.slimeTextures;
    }
}
