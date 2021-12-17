// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.entity.layers.LayerSaddle;
import net.minecraft.client.model.ModelBase;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.passive.EntityPig;

public class RenderPig extends RenderLiving<EntityPig>
{
    private static final /* synthetic */ ResourceLocation pigTextures;
    private static final /* synthetic */ int[] llIllIllIlIIlI;
    private static final /* synthetic */ String[] llIllIllIlIIIl;
    
    private static void lIIllIIIIlIIIlIl() {
        (llIllIllIlIIlI = new int[2])[0] = ((55 + 184 - 129 + 110 ^ 4 + 38 - 19 + 174) & (0x6B ^ 0x44 ^ (0x8C ^ 0xBA) ^ -" ".length()));
        RenderPig.llIllIllIlIIlI[1] = " ".length();
    }
    
    private static void lIIllIIIIlIIIlII() {
        (llIllIllIlIIIl = new String[RenderPig.llIllIllIlIIlI[1]])[RenderPig.llIllIllIlIIlI[0]] = lIIllIIIIlIIIIll("JSgCORkjKAliCT85EzkVfj0TKkMhJB1jHD8q", "QMzMl");
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityPig llllllllllllIllIIllIIlIlIlIIIlIl) {
        return RenderPig.pigTextures;
    }
    
    private static String lIIllIIIIlIIIIll(String llllllllllllIllIIllIIlIlIIllIIIl, final String llllllllllllIllIIllIIlIlIIllIIII) {
        llllllllllllIllIIllIIlIlIIllIIIl = new String(Base64.getDecoder().decode(llllllllllllIllIIllIIlIlIIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIllIIlIlIIllIlII = new StringBuilder();
        final char[] llllllllllllIllIIllIIlIlIIllIIll = llllllllllllIllIIllIIlIlIIllIIII.toCharArray();
        int llllllllllllIllIIllIIlIlIIllIIlI = RenderPig.llIllIllIlIIlI[0];
        final short llllllllllllIllIIllIIlIlIIlIllII = (Object)llllllllllllIllIIllIIlIlIIllIIIl.toCharArray();
        final char llllllllllllIllIIllIIlIlIIlIlIll = (char)llllllllllllIllIIllIIlIlIIlIllII.length;
        float llllllllllllIllIIllIIlIlIIlIlIlI = RenderPig.llIllIllIlIIlI[0];
        while (lIIllIIIIlIIIllI((int)llllllllllllIllIIllIIlIlIIlIlIlI, llllllllllllIllIIllIIlIlIIlIlIll)) {
            final char llllllllllllIllIIllIIlIlIIllIlll = llllllllllllIllIIllIIlIlIIlIllII[llllllllllllIllIIllIIlIlIIlIlIlI];
            llllllllllllIllIIllIIlIlIIllIlII.append((char)(llllllllllllIllIIllIIlIlIIllIlll ^ llllllllllllIllIIllIIlIlIIllIIll[llllllllllllIllIIllIIlIlIIllIIlI % llllllllllllIllIIllIIlIlIIllIIll.length]));
            "".length();
            ++llllllllllllIllIIllIIlIlIIllIIlI;
            ++llllllllllllIllIIllIIlIlIIlIlIlI;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIllIIlIlIIllIlII);
    }
    
    static {
        lIIllIIIIlIIIlIl();
        lIIllIIIIlIIIlII();
        pigTextures = new ResourceLocation(RenderPig.llIllIllIlIIIl[RenderPig.llIllIllIlIIlI[0]]);
    }
    
    public RenderPig(final RenderManager llllllllllllIllIIllIIlIlIlIIlIIl, final ModelBase llllllllllllIllIIllIIlIlIlIIlIII, final float llllllllllllIllIIllIIlIlIlIIlIll) {
        super(llllllllllllIllIIllIIlIlIlIIlIIl, llllllllllllIllIIllIIlIlIlIIlIII, llllllllllllIllIIllIIlIlIlIIlIll);
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerSaddle(this));
        "".length();
    }
    
    private static boolean lIIllIIIIlIIIllI(final int llllllllllllIllIIllIIlIlIIlIIllI, final int llllllllllllIllIIllIIlIlIIlIIlIl) {
        return llllllllllllIllIIllIIlIlIIlIIllI < llllllllllllIllIIllIIlIlIIlIIlIl;
    }
}
