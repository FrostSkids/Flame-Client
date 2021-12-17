// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.entity.layers.LayerSheepWool;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.passive.EntitySheep;

public class RenderSheep extends RenderLiving<EntitySheep>
{
    private static final /* synthetic */ String[] llIlIIlIllllII;
    private static final /* synthetic */ int[] llIlIIlIlllllI;
    private static final /* synthetic */ ResourceLocation shearedSheepTextures;
    
    static {
        lIIlIIlIllIIIlII();
        lIIlIIlIllIIIIII();
        shearedSheepTextures = new ResourceLocation(RenderSheep.llIlIIlIllllII[RenderSheep.llIlIIlIlllllI[0]]);
    }
    
    private static String lIIlIIlIlIllllll(String llllllllllllIllIllIIIIIIllIlllll, final String llllllllllllIllIllIIIIIIllIllllI) {
        llllllllllllIllIllIIIIIIllIlllll = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIllIllIIIIIIllIlllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIllIIIIIIlllIIIlI = new StringBuilder();
        final char[] llllllllllllIllIllIIIIIIlllIIIIl = llllllllllllIllIllIIIIIIllIllllI.toCharArray();
        int llllllllllllIllIllIIIIIIlllIIIII = RenderSheep.llIlIIlIlllllI[0];
        final float llllllllllllIllIllIIIIIIllIllIlI = (Object)((String)llllllllllllIllIllIIIIIIllIlllll).toCharArray();
        final int llllllllllllIllIllIIIIIIllIllIIl = llllllllllllIllIllIIIIIIllIllIlI.length;
        char llllllllllllIllIllIIIIIIllIllIII = (char)RenderSheep.llIlIIlIlllllI[0];
        while (lIIlIIlIllIIIlIl(llllllllllllIllIllIIIIIIllIllIII, llllllllllllIllIllIIIIIIllIllIIl)) {
            final char llllllllllllIllIllIIIIIIlllIIlIl = llllllllllllIllIllIIIIIIllIllIlI[llllllllllllIllIllIIIIIIllIllIII];
            llllllllllllIllIllIIIIIIlllIIIlI.append((char)(llllllllllllIllIllIIIIIIlllIIlIl ^ llllllllllllIllIllIIIIIIlllIIIIl[llllllllllllIllIllIIIIIIlllIIIII % llllllllllllIllIllIIIIIIlllIIIIl.length]));
            "".length();
            ++llllllllllllIllIllIIIIIIlllIIIII;
            ++llllllllllllIllIllIIIIIIllIllIII;
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIllIIIIIIlllIIIlI);
    }
    
    private static void lIIlIIlIllIIIIII() {
        (llIlIIlIllllII = new String[RenderSheep.llIlIIlIlllllI[1]])[RenderSheep.llIlIIlIlllllI[0]] = lIIlIIlIlIllllll("Ow8fJDw9DxR/LCEeDiQwYBkPNSw/RRQ4LCoaSSAnKA==", "OjgPI");
    }
    
    private static void lIIlIIlIllIIIlII() {
        (llIlIIlIlllllI = new int[2])[0] = ((0x3 ^ 0x62 ^ (0x17 ^ 0x29)) & ("  ".length() ^ (0xE6 ^ 0xBB) ^ -" ".length()));
        RenderSheep.llIlIIlIlllllI[1] = " ".length();
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntitySheep llllllllllllIllIllIIIIIIllllIIll) {
        return RenderSheep.shearedSheepTextures;
    }
    
    private static boolean lIIlIIlIllIIIlIl(final int llllllllllllIllIllIIIIIIllIlIlII, final int llllllllllllIllIllIIIIIIllIlIIll) {
        return llllllllllllIllIllIIIIIIllIlIlII < llllllllllllIllIllIIIIIIllIlIIll;
    }
    
    public RenderSheep(final RenderManager llllllllllllIllIllIIIIIIllllIlll, final ModelBase llllllllllllIllIllIIIIIIlllllIlI, final float llllllllllllIllIllIIIIIIlllllIIl) {
        super(llllllllllllIllIllIIIIIIllllIlll, llllllllllllIllIllIIIIIIlllllIlI, llllllllllllIllIllIIIIIIlllllIIl);
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerSheepWool(this));
        "".length();
    }
}
