// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.entity.EntityLivingBase;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.layers.LayerMooshroomMushroom;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.passive.EntityMooshroom;

public class RenderMooshroom extends RenderLiving<EntityMooshroom>
{
    private static final /* synthetic */ String[] lllIlllIIIIlII;
    private static final /* synthetic */ int[] lllIlllIIIIllI;
    private static final /* synthetic */ ResourceLocation mooshroomTextures;
    
    public RenderMooshroom(final RenderManager llllllllllllIlIllIIIlIIlIlIlIlII, final ModelBase llllllllllllIlIllIIIlIIlIlIlIIlI, final float llllllllllllIlIllIIIlIIlIlIlIIIl) {
        super(llllllllllllIlIllIIIlIIlIlIlIlII, llllllllllllIlIllIIIlIIlIlIlIIlI, llllllllllllIlIllIIIlIIlIlIlIIIl);
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerMooshroomMushroom(this));
        "".length();
    }
    
    private static void lIlIIlIlIlllllII() {
        (lllIlllIIIIllI = new int[2])[0] = ((0x6 ^ 0x34) & ~(0x80 ^ 0xB2));
        RenderMooshroom.lllIlllIIIIllI[1] = " ".length();
    }
    
    static {
        lIlIIlIlIlllllII();
        lIlIIlIlIllIlllI();
        mooshroomTextures = new ResourceLocation(RenderMooshroom.lllIlllIIIIlII[RenderMooshroom.lllIlllIIIIllI[0]]);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityMooshroom llllllllllllIlIllIIIlIIlIlIIllII) {
        return RenderMooshroom.mooshroomTextures;
    }
    
    private static String lIlIIlIlIllIllII(String llllllllllllIlIllIIIlIIlIIlIIIll, final String llllllllllllIlIllIIIlIIlIIlIlIlI) {
        llllllllllllIlIllIIIlIIlIIlIIIll = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllIIIlIIlIIlIIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIIIlIIlIIlIlIII = new StringBuilder();
        final char[] llllllllllllIlIllIIIlIIlIIlIIllI = llllllllllllIlIllIIIlIIlIIlIlIlI.toCharArray();
        int llllllllllllIlIllIIIlIIlIIlIIlIl = RenderMooshroom.lllIlllIIIIllI[0];
        final short llllllllllllIlIllIIIlIIlIIIllIll = (Object)((String)llllllllllllIlIllIIIlIIlIIlIIIll).toCharArray();
        final boolean llllllllllllIlIllIIIlIIlIIIllIIl = llllllllllllIlIllIIIlIIlIIIllIll.length != 0;
        char llllllllllllIlIllIIIlIIlIIIlIlll = (char)RenderMooshroom.lllIlllIIIIllI[0];
        while (lIlIIlIlIlllllIl(llllllllllllIlIllIIIlIIlIIIlIlll, llllllllllllIlIllIIIlIIlIIIllIIl ? 1 : 0)) {
            final char llllllllllllIlIllIIIlIIlIIlIllIl = llllllllllllIlIllIIIlIIlIIIllIll[llllllllllllIlIllIIIlIIlIIIlIlll];
            llllllllllllIlIllIIIlIIlIIlIlIII.append((char)(llllllllllllIlIllIIIlIIlIIlIllIl ^ llllllllllllIlIllIIIlIIlIIlIIllI[llllllllllllIlIllIIIlIIlIIlIIlIl % llllllllllllIlIllIIIlIIlIIlIIllI.length]));
            "".length();
            ++llllllllllllIlIllIIIlIIlIIlIIlIl;
            ++llllllllllllIlIllIIIlIIlIIIlIlll;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIIIlIIlIIlIlIII);
    }
    
    private static boolean lIlIIlIlIlllllIl(final int llllllllllllIlIllIIIlIIlIIIlIIII, final int llllllllllllIlIllIIIlIIlIIIIlllI) {
        return llllllllllllIlIllIIIlIIlIIIlIIII < llllllllllllIlIllIIIlIIlIIIIlllI;
    }
    
    private static void lIlIIlIlIllIlllI() {
        (lllIlllIIIIlII = new String[RenderMooshroom.lllIlllIIIIllI[1]])[RenderMooshroom.lllIlllIIIIllI[0]] = lIlIIlIlIllIllII("LBcUPBwqFx9nDDYGBTwQdxEDP0Y1HQM7ASodAyVHKBwL", "XrlHi");
    }
}
