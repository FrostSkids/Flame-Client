// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.layers.LayerSnowmanHead;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelSnowMan;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.monster.EntitySnowman;

public class RenderSnowMan extends RenderLiving<EntitySnowman>
{
    private static final /* synthetic */ int[] lllIllIlIIlIlI;
    private static final /* synthetic */ String[] lllIllIlIIlIIl;
    private static final /* synthetic */ ResourceLocation snowManTextures;
    
    private static String lIlIIlIIllIIlIII(String llllllllllllIlIllIIlIIlIIIIlllll, final String llllllllllllIlIllIIlIIlIIIlIIIll) {
        llllllllllllIlIllIIlIIlIIIIlllll = new String(Base64.getDecoder().decode(llllllllllllIlIllIIlIIlIIIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIIlIIlIIIlIIIlI = new StringBuilder();
        final char[] llllllllllllIlIllIIlIIlIIIlIIIIl = llllllllllllIlIllIIlIIlIIIlIIIll.toCharArray();
        int llllllllllllIlIllIIlIIlIIIlIIIII = RenderSnowMan.lllIllIlIIlIlI[0];
        final boolean llllllllllllIlIllIIlIIlIIIIllIlI = (Object)llllllllllllIlIllIIlIIlIIIIlllll.toCharArray();
        final double llllllllllllIlIllIIlIIlIIIIllIIl = llllllllllllIlIllIIlIIlIIIIllIlI.length;
        byte llllllllllllIlIllIIlIIlIIIIllIII = (byte)RenderSnowMan.lllIllIlIIlIlI[0];
        while (lIlIIlIIllIIlIll(llllllllllllIlIllIIlIIlIIIIllIII, (int)llllllllllllIlIllIIlIIlIIIIllIIl)) {
            final char llllllllllllIlIllIIlIIlIIIlIIlIl = llllllllllllIlIllIIlIIlIIIIllIlI[llllllllllllIlIllIIlIIlIIIIllIII];
            llllllllllllIlIllIIlIIlIIIlIIIlI.append((char)(llllllllllllIlIllIIlIIlIIIlIIlIl ^ llllllllllllIlIllIIlIIlIIIlIIIIl[llllllllllllIlIllIIlIIlIIIlIIIII % llllllllllllIlIllIIlIIlIIIlIIIIl.length]));
            "".length();
            ++llllllllllllIlIllIIlIIlIIIlIIIII;
            ++llllllllllllIlIllIIlIIlIIIIllIII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIIlIIlIIIlIIIlI);
    }
    
    public RenderSnowMan(final RenderManager llllllllllllIlIllIIlIIlIIIlllIlI) {
        super(llllllllllllIlIllIIlIIlIIIlllIlI, new ModelSnowMan(), 0.5f);
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerSnowmanHead(this));
        "".length();
    }
    
    private static void lIlIIlIIllIIlIlI() {
        (lllIllIlIIlIlI = new int[2])[0] = ((0x90 ^ 0xC4) & ~(0xD2 ^ 0x86));
        RenderSnowMan.lllIllIlIIlIlI[1] = " ".length();
    }
    
    @Override
    public ModelSnowMan getMainModel() {
        return (ModelSnowMan)super.getMainModel();
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntitySnowman llllllllllllIlIllIIlIIlIIIlllIII) {
        return RenderSnowMan.snowManTextures;
    }
    
    private static void lIlIIlIIllIIlIIl() {
        (lllIllIlIIlIIl = new String[RenderSnowMan.lllIllIlIIlIlI[1]])[RenderSnowMan.lllIllIlIIlIlI[0]] = lIlIIlIIllIIlIII("Gy0MOREdLQdiAQE8HTkdQDsaIhMCKRpjFAEv", "oHtMd");
    }
    
    static {
        lIlIIlIIllIIlIlI();
        lIlIIlIIllIIlIIl();
        snowManTextures = new ResourceLocation(RenderSnowMan.lllIllIlIIlIIl[RenderSnowMan.lllIllIlIIlIlI[0]]);
    }
    
    private static boolean lIlIIlIIllIIlIll(final int llllllllllllIlIllIIlIIlIIIIlIlII, final int llllllllllllIlIllIIlIIlIIIIlIIll) {
        return llllllllllllIlIllIIlIIlIIIIlIlII < llllllllllllIlIllIIlIIlIIIIlIIll;
    }
}
