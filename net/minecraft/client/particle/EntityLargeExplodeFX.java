// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.WorldRenderer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.client.renderer.texture.TextureManager;

public class EntityLargeExplodeFX extends EntityFX
{
    private /* synthetic */ TextureManager theRenderEngine;
    private /* synthetic */ float field_70582_as;
    private static final /* synthetic */ VertexFormat field_181549_az;
    private static final /* synthetic */ ResourceLocation EXPLOSION_TEXTURE;
    private /* synthetic */ int field_70581_a;
    private static final /* synthetic */ String[] lIllllIIIIIlll;
    private /* synthetic */ int field_70584_aq;
    private static final /* synthetic */ int[] lIllllIIIIlIII;
    
    static {
        lIIIIIlllIlllIII();
        lIIIIIlllIllIlll();
        EXPLOSION_TEXTURE = new ResourceLocation(EntityLargeExplodeFX.lIllllIIIIIlll[EntityLargeExplodeFX.lIllllIIIIlIII[0]]);
        field_181549_az = new VertexFormat().func_181721_a(DefaultVertexFormats.POSITION_3F).func_181721_a(DefaultVertexFormats.TEX_2F).func_181721_a(DefaultVertexFormats.COLOR_4UB).func_181721_a(DefaultVertexFormats.TEX_2S).func_181721_a(DefaultVertexFormats.NORMAL_3B).func_181721_a(DefaultVertexFormats.PADDING_1B);
    }
    
    @Override
    public int getBrightnessForRender(final float llllllllllllIllllIllIIIlllllIIlI) {
        return EntityLargeExplodeFX.lIllllIIIIlIII[6];
    }
    
    private static String lIIIIIlllIllIllI(String llllllllllllIllllIllIIIlllIllllI, final String llllllllllllIllllIllIIIllllIIIlI) {
        llllllllllllIllllIllIIIlllIllllI = new String(Base64.getDecoder().decode(llllllllllllIllllIllIIIlllIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIllIIIllllIIIIl = new StringBuilder();
        final char[] llllllllllllIllllIllIIIllllIIIII = llllllllllllIllllIllIIIllllIIIlI.toCharArray();
        int llllllllllllIllllIllIIIlllIlllll = EntityLargeExplodeFX.lIllllIIIIlIII[0];
        final short llllllllllllIllllIllIIIlllIllIIl = (Object)llllllllllllIllllIllIIIlllIllllI.toCharArray();
        final char llllllllllllIllllIllIIIlllIllIII = (char)llllllllllllIllllIllIIIlllIllIIl.length;
        double llllllllllllIllllIllIIIlllIlIlll = EntityLargeExplodeFX.lIllllIIIIlIII[0];
        while (lIIIIIlllIlllIll((int)llllllllllllIllllIllIIIlllIlIlll, llllllllllllIllllIllIIIlllIllIII)) {
            final char llllllllllllIllllIllIIIllllIIlII = llllllllllllIllllIllIIIlllIllIIl[llllllllllllIllllIllIIIlllIlIlll];
            llllllllllllIllllIllIIIllllIIIIl.append((char)(llllllllllllIllllIllIIIllllIIlII ^ llllllllllllIllllIllIIIllllIIIII[llllllllllllIllllIllIIIlllIlllll % llllllllllllIllllIllIIIllllIIIII.length]));
            "".length();
            ++llllllllllllIllllIllIIIlllIlllll;
            ++llllllllllllIllllIllIIIlllIlIlll;
            "".length();
            if ((0xC6 ^ 0xC3) == 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIllIIIllllIIIIl);
    }
    
    private static boolean lIIIIIlllIlllIlI(final int llllllllllllIllllIllIIIlllIlIIll, final int llllllllllllIllllIllIIIlllIlIIlI) {
        return llllllllllllIllllIllIIIlllIlIIll == llllllllllllIllllIllIIIlllIlIIlI;
    }
    
    private static boolean lIIIIIlllIlllIIl(final int llllllllllllIllllIllIIIlllIIlIll, final int llllllllllllIllllIllIIIlllIIlIlI) {
        return llllllllllllIllllIllIIIlllIIlIll <= llllllllllllIllllIllIIIlllIIlIlI;
    }
    
    private static void lIIIIIlllIllIlll() {
        (lIllllIIIIIlll = new String[EntityLargeExplodeFX.lIllllIIIIlIII[7]])[EntityLargeExplodeFX.lIllllIIIIlIII[0]] = lIIIIIlllIllIllI("LiAWDh0oIB1VDTQxBw4RdSAWCgQ1NgcVBnQ1AB0=", "ZEnzh");
    }
    
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.field_70581_a += EntityLargeExplodeFX.lIllllIIIIlIII[7];
        if (lIIIIIlllIlllIlI(this.field_70581_a, this.field_70584_aq)) {
            this.setDead();
        }
    }
    
    private static boolean lIIIIIlllIlllIll(final int llllllllllllIllllIllIIIlllIIllll, final int llllllllllllIllllIllIIIlllIIlllI) {
        return llllllllllllIllllIllIIIlllIIllll < llllllllllllIllllIllIIIlllIIlllI;
    }
    
    private static void lIIIIIlllIlllIII() {
        (lIllllIIIIlIII = new int[9])[0] = ((0xBE ^ 0x9E ^ (0x4A ^ 0x56)) & (0xF ^ 0x22 ^ (0x17 ^ 0x6) ^ -" ".length()));
        EntityLargeExplodeFX.lIllllIIIIlIII[1] = ("   ".length() ^ (0x6 ^ 0x3));
        EntityLargeExplodeFX.lIllllIIIIlIII[2] = (0x66 ^ 0x62);
        EntityLargeExplodeFX.lIllllIIIIlIII[3] = (0xA9 ^ 0xA6);
        EntityLargeExplodeFX.lIllllIIIIlIII[4] = (0xC7 ^ 0xC0);
        EntityLargeExplodeFX.lIllllIIIIlIII[5] = 72 + 146 - 176 + 198;
        EntityLargeExplodeFX.lIllllIIIIlIII[6] = (0xFFFFFCF6 & 0xF3F9);
        EntityLargeExplodeFX.lIllllIIIIlIII[7] = " ".length();
        EntityLargeExplodeFX.lIllllIIIIlIII[8] = "   ".length();
    }
    
    @Override
    public void renderParticle(final WorldRenderer llllllllllllIllllIllIIlIIIIlIlIl, final Entity llllllllllllIllllIllIIlIIIIlIlII, final float llllllllllllIllllIllIIlIIIIIIIlI, final float llllllllllllIllllIllIIlIIIIlIIlI, final float llllllllllllIllllIllIIlIIIIlIIIl, final float llllllllllllIllllIllIIIlllllllll, final float llllllllllllIllllIllIIlIIIIIllll, final float llllllllllllIllllIllIIlIIIIIlllI) {
        final int llllllllllllIllllIllIIlIIIIIllIl = (int)((this.field_70581_a + llllllllllllIllllIllIIlIIIIIIIlI) * 15.0f / this.field_70584_aq);
        if (lIIIIIlllIlllIIl(llllllllllllIllllIllIIlIIIIIllIl, EntityLargeExplodeFX.lIllllIIIIlIII[3])) {
            this.theRenderEngine.bindTexture(EntityLargeExplodeFX.EXPLOSION_TEXTURE);
            final float llllllllllllIllllIllIIlIIIIIllII = llllllllllllIllllIllIIlIIIIIllIl % EntityLargeExplodeFX.lIllllIIIIlIII[2] / 4.0f;
            final float llllllllllllIllllIllIIlIIIIIlIll = llllllllllllIllllIllIIlIIIIIllII + 0.24975f;
            final float llllllllllllIllllIllIIlIIIIIlIlI = llllllllllllIllllIllIIlIIIIIllIl / EntityLargeExplodeFX.lIllllIIIIlIII[2] / 4.0f;
            final float llllllllllllIllllIllIIlIIIIIlIIl = llllllllllllIllllIllIIlIIIIIlIlI + 0.24975f;
            final float llllllllllllIllllIllIIlIIIIIlIII = 2.0f * this.field_70582_as;
            final float llllllllllllIllllIllIIlIIIIIIlll = (float)(this.prevPosX + (this.posX - this.prevPosX) * llllllllllllIllllIllIIlIIIIIIIlI - EntityLargeExplodeFX.interpPosX);
            final float llllllllllllIllllIllIIlIIIIIIllI = (float)(this.prevPosY + (this.posY - this.prevPosY) * llllllllllllIllllIllIIlIIIIIIIlI - EntityLargeExplodeFX.interpPosY);
            final float llllllllllllIllllIllIIlIIIIIIlIl = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * llllllllllllIllllIllIIlIIIIIIIlI - EntityLargeExplodeFX.interpPosZ);
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.disableLighting();
            RenderHelper.disableStandardItemLighting();
            llllllllllllIllllIllIIlIIIIlIlIl.begin(EntityLargeExplodeFX.lIllllIIIIlIII[4], EntityLargeExplodeFX.field_181549_az);
            llllllllllllIllllIllIIlIIIIlIlIl.pos(llllllllllllIllllIllIIlIIIIIIlll - llllllllllllIllllIllIIlIIIIlIIlI * llllllllllllIllllIllIIlIIIIIlIII - llllllllllllIllllIllIIlIIIIIllll * llllllllllllIllllIllIIlIIIIIlIII, llllllllllllIllllIllIIlIIIIIIllI - llllllllllllIllllIllIIlIIIIlIIIl * llllllllllllIllllIllIIlIIIIIlIII, llllllllllllIllllIllIIlIIIIIIlIl - llllllllllllIllllIllIIIlllllllll * llllllllllllIllllIllIIlIIIIIlIII - llllllllllllIllllIllIIlIIIIIlllI * llllllllllllIllllIllIIlIIIIIlIII).tex(llllllllllllIllllIllIIlIIIIIlIll, llllllllllllIllllIllIIlIIIIIlIIl).color(this.particleRed, this.particleGreen, this.particleBlue, 1.0f).lightmap(EntityLargeExplodeFX.lIllllIIIIlIII[0], EntityLargeExplodeFX.lIllllIIIIlIII[5]).normal(0.0f, 1.0f, 0.0f).endVertex();
            llllllllllllIllllIllIIlIIIIlIlIl.pos(llllllllllllIllllIllIIlIIIIIIlll - llllllllllllIllllIllIIlIIIIlIIlI * llllllllllllIllllIllIIlIIIIIlIII + llllllllllllIllllIllIIlIIIIIllll * llllllllllllIllllIllIIlIIIIIlIII, llllllllllllIllllIllIIlIIIIIIllI + llllllllllllIllllIllIIlIIIIlIIIl * llllllllllllIllllIllIIlIIIIIlIII, llllllllllllIllllIllIIlIIIIIIlIl - llllllllllllIllllIllIIIlllllllll * llllllllllllIllllIllIIlIIIIIlIII + llllllllllllIllllIllIIlIIIIIlllI * llllllllllllIllllIllIIlIIIIIlIII).tex(llllllllllllIllllIllIIlIIIIIlIll, llllllllllllIllllIllIIlIIIIIlIlI).color(this.particleRed, this.particleGreen, this.particleBlue, 1.0f).lightmap(EntityLargeExplodeFX.lIllllIIIIlIII[0], EntityLargeExplodeFX.lIllllIIIIlIII[5]).normal(0.0f, 1.0f, 0.0f).endVertex();
            llllllllllllIllllIllIIlIIIIlIlIl.pos(llllllllllllIllllIllIIlIIIIIIlll + llllllllllllIllllIllIIlIIIIlIIlI * llllllllllllIllllIllIIlIIIIIlIII + llllllllllllIllllIllIIlIIIIIllll * llllllllllllIllllIllIIlIIIIIlIII, llllllllllllIllllIllIIlIIIIIIllI + llllllllllllIllllIllIIlIIIIlIIIl * llllllllllllIllllIllIIlIIIIIlIII, llllllllllllIllllIllIIlIIIIIIlIl + llllllllllllIllllIllIIIlllllllll * llllllllllllIllllIllIIlIIIIIlIII + llllllllllllIllllIllIIlIIIIIlllI * llllllllllllIllllIllIIlIIIIIlIII).tex(llllllllllllIllllIllIIlIIIIIllII, llllllllllllIllllIllIIlIIIIIlIlI).color(this.particleRed, this.particleGreen, this.particleBlue, 1.0f).lightmap(EntityLargeExplodeFX.lIllllIIIIlIII[0], EntityLargeExplodeFX.lIllllIIIIlIII[5]).normal(0.0f, 1.0f, 0.0f).endVertex();
            llllllllllllIllllIllIIlIIIIlIlIl.pos(llllllllllllIllllIllIIlIIIIIIlll + llllllllllllIllllIllIIlIIIIlIIlI * llllllllllllIllllIllIIlIIIIIlIII - llllllllllllIllllIllIIlIIIIIllll * llllllllllllIllllIllIIlIIIIIlIII, llllllllllllIllllIllIIlIIIIIIllI - llllllllllllIllllIllIIlIIIIlIIIl * llllllllllllIllllIllIIlIIIIIlIII, llllllllllllIllllIllIIlIIIIIIlIl + llllllllllllIllllIllIIIlllllllll * llllllllllllIllllIllIIlIIIIIlIII - llllllllllllIllllIllIIlIIIIIlllI * llllllllllllIllllIllIIlIIIIIlIII).tex(llllllllllllIllllIllIIlIIIIIllII, llllllllllllIllllIllIIlIIIIIlIIl).color(this.particleRed, this.particleGreen, this.particleBlue, 1.0f).lightmap(EntityLargeExplodeFX.lIllllIIIIlIII[0], EntityLargeExplodeFX.lIllllIIIIlIII[5]).normal(0.0f, 1.0f, 0.0f).endVertex();
            Tessellator.getInstance().draw();
            GlStateManager.enableLighting();
        }
    }
    
    protected EntityLargeExplodeFX(final TextureManager llllllllllllIllllIllIIlIIIlIllIl, final World llllllllllllIllllIllIIlIIIlIllII, final double llllllllllllIllllIllIIlIIIlIlIll, final double llllllllllllIllllIllIIlIIIllIIll, final double llllllllllllIllllIllIIlIIIlIlIIl, final double llllllllllllIllllIllIIlIIIlIlIII, final double llllllllllllIllllIllIIlIIIllIIII, final double llllllllllllIllllIllIIlIIIlIllll) {
        super(llllllllllllIllllIllIIlIIIlIllII, llllllllllllIllllIllIIlIIIlIlIll, llllllllllllIllllIllIIlIIIllIIll, llllllllllllIllllIllIIlIIIlIlIIl, 0.0, 0.0, 0.0);
        this.theRenderEngine = llllllllllllIllllIllIIlIIIlIllIl;
        this.field_70584_aq = EntityLargeExplodeFX.lIllllIIIIlIII[1] + this.rand.nextInt(EntityLargeExplodeFX.lIllllIIIIlIII[2]);
        final float particleRed = this.rand.nextFloat() * 0.6f + 0.4f;
        this.particleBlue = particleRed;
        this.particleGreen = particleRed;
        this.particleRed = particleRed;
        this.field_70582_as = 1.0f - (float)llllllllllllIllllIllIIlIIIlIlIII * 0.5f;
    }
    
    @Override
    public int getFXLayer() {
        return EntityLargeExplodeFX.lIllllIIIIlIII[8];
    }
    
    public static class Factory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int llllllllllllIllllllIIIIIlIIIIIll, final World llllllllllllIllllllIIIIIlIIIIIlI, final double llllllllllllIllllllIIIIIIllllIIl, final double llllllllllllIllllllIIIIIlIIIIIII, final double llllllllllllIllllllIIIIIIlllllll, final double llllllllllllIllllllIIIIIIlllIllI, final double llllllllllllIllllllIIIIIIlllIlIl, final double llllllllllllIllllllIIIIIIlllIlII, final int... llllllllllllIllllllIIIIIIllllIll) {
            return new EntityLargeExplodeFX(Minecraft.getMinecraft().getTextureManager(), llllllllllllIllllllIIIIIlIIIIIlI, llllllllllllIllllllIIIIIIllllIIl, llllllllllllIllllllIIIIIlIIIIIII, llllllllllllIllllllIIIIIIlllllll, llllllllllllIllllllIIIIIIlllIllI, llllllllllllIllllllIIIIIIlllIlIl, llllllllllllIllllllIIIIIIlllIlII);
        }
    }
}
