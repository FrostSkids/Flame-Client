// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.item.EntityPainting;

public class RenderPainting extends Render<EntityPainting>
{
    private static final /* synthetic */ ResourceLocation KRISTOFFER_PAINTING_TEXTURE;
    private static final /* synthetic */ String[] llIllIIllllIlI;
    private static final /* synthetic */ int[] llIllIlIlIllll;
    
    public RenderPainting(final RenderManager llllllllllllIllIIllIlIllIIllIlII) {
        super(llllllllllllIllIIllIlIllIIllIlII);
    }
    
    private static boolean lIIlIllllllIlIIl(final int llllllllllllIllIIllIlIlIIllIllll, final int llllllllllllIllIIllIlIlIIllIlllI) {
        return llllllllllllIllIIllIlIlIIllIllll >= llllllllllllIllIIllIlIlIIllIlllI;
    }
    
    private static String lIIlIlllIlIIlIlI(final String llllllllllllIllIIllIlIlIIlllIlIl, final String llllllllllllIllIIllIlIlIIlllIlII) {
        try {
            final SecretKeySpec llllllllllllIllIIllIlIlIIllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllIlIlIIlllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIllIlIlIIllllIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIllIlIlIIllllIIl.init(RenderPainting.llIllIlIlIllll[5], llllllllllllIllIIllIlIlIIllllIlI);
            return new String(llllllllllllIllIIllIlIlIIllllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllIlIlIIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllIlIlIIllllIII) {
            llllllllllllIllIIllIlIlIIllllIII.printStackTrace();
            return null;
        }
    }
    
    private void renderPainting(final EntityPainting llllllllllllIllIIllIlIlIllllIIlI, final int llllllllllllIllIIllIlIlIllllIIIl, final int llllllllllllIllIIllIlIlIllIIllll, final int llllllllllllIllIIllIlIlIllIIlllI, final int llllllllllllIllIIllIlIlIlllIlllI) {
        final float llllllllllllIllIIllIlIlIlllIllIl = -llllllllllllIllIIllIlIlIllllIIIl / 2.0f;
        final float llllllllllllIllIIllIlIlIlllIllII = -llllllllllllIllIIllIlIlIllIIllll / 2.0f;
        final float llllllllllllIllIIllIlIlIlllIlIll = 0.5f;
        final float llllllllllllIllIIllIlIlIlllIlIlI = 0.75f;
        final float llllllllllllIllIIllIlIlIlllIlIIl = 0.8125f;
        final float llllllllllllIllIIllIlIlIlllIlIII = 0.0f;
        final float llllllllllllIllIIllIlIlIlllIIlll = 0.0625f;
        final float llllllllllllIllIIllIlIlIlllIIllI = 0.75f;
        final float llllllllllllIllIIllIlIlIlllIIlIl = 0.8125f;
        final float llllllllllllIllIIllIlIlIlllIIlII = 0.001953125f;
        final float llllllllllllIllIIllIlIlIlllIIIll = 0.001953125f;
        final float llllllllllllIllIIllIlIlIlllIIIlI = 0.7519531f;
        final float llllllllllllIllIIllIlIlIlllIIIIl = 0.7519531f;
        final float llllllllllllIllIIllIlIlIlllIIIII = 0.0f;
        final float llllllllllllIllIIllIlIlIllIlllll = 0.0625f;
        int llllllllllllIllIIllIlIlIllIllllI = RenderPainting.llIllIlIlIllll[0];
        "".length();
        if (" ".length() <= ((0xED ^ 0xC2 ^ (0xDD ^ 0xA4)) & (0x3A ^ 0x66 ^ (0x77 ^ 0x7D) ^ -" ".length()))) {
            return;
        }
        while (!lIIlIllllllIlIIl(llllllllllllIllIIllIlIlIllIllllI, llllllllllllIllIIllIlIlIllllIIIl / RenderPainting.llIllIlIlIllll[2])) {
            int llllllllllllIllIIllIlIlIllIlllIl = RenderPainting.llIllIlIlIllll[0];
            "".length();
            if (((0x51 ^ 0x6B) & ~(0xA7 ^ 0x9D)) == "  ".length()) {
                return;
            }
            while (!lIIlIllllllIlIIl(llllllllllllIllIIllIlIlIllIlllIl, llllllllllllIllIIllIlIlIllIIllll / RenderPainting.llIllIlIlIllll[2])) {
                final float llllllllllllIllIIllIlIlIllIlllII = llllllllllllIllIIllIlIlIlllIllIl + (llllllllllllIllIIllIlIlIllIllllI + RenderPainting.llIllIlIlIllll[1]) * RenderPainting.llIllIlIlIllll[2];
                final float llllllllllllIllIIllIlIlIllIllIll = llllllllllllIllIIllIlIlIlllIllIl + llllllllllllIllIIllIlIlIllIllllI * RenderPainting.llIllIlIlIllll[2];
                final float llllllllllllIllIIllIlIlIllIllIlI = llllllllllllIllIIllIlIlIlllIllII + (llllllllllllIllIIllIlIlIllIlllIl + RenderPainting.llIllIlIlIllll[1]) * RenderPainting.llIllIlIlIllll[2];
                final float llllllllllllIllIIllIlIlIllIllIIl = llllllllllllIllIIllIlIlIlllIllII + llllllllllllIllIIllIlIlIllIlllIl * RenderPainting.llIllIlIlIllll[2];
                this.setLightmap(llllllllllllIllIIllIlIlIllllIIlI, (llllllllllllIllIIllIlIlIllIlllII + llllllllllllIllIIllIlIlIllIllIll) / 2.0f, (llllllllllllIllIIllIlIlIllIllIlI + llllllllllllIllIIllIlIlIllIllIIl) / 2.0f);
                final float llllllllllllIllIIllIlIlIllIllIII = (llllllllllllIllIIllIlIlIllIIlllI + llllllllllllIllIIllIlIlIllllIIIl - llllllllllllIllIIllIlIlIllIllllI * RenderPainting.llIllIlIlIllll[2]) / 256.0f;
                final float llllllllllllIllIIllIlIlIllIlIlll = (llllllllllllIllIIllIlIlIllIIlllI + llllllllllllIllIIllIlIlIllllIIIl - (llllllllllllIllIIllIlIlIllIllllI + RenderPainting.llIllIlIlIllll[1]) * RenderPainting.llIllIlIlIllll[2]) / 256.0f;
                final float llllllllllllIllIIllIlIlIllIlIllI = (llllllllllllIllIIllIlIlIlllIlllI + llllllllllllIllIIllIlIlIllIIllll - llllllllllllIllIIllIlIlIllIlllIl * RenderPainting.llIllIlIlIllll[2]) / 256.0f;
                final float llllllllllllIllIIllIlIlIllIlIlIl = (llllllllllllIllIIllIlIlIlllIlllI + llllllllllllIllIIllIlIlIllIIllll - (llllllllllllIllIIllIlIlIllIlllIl + RenderPainting.llIllIlIlIllll[1]) * RenderPainting.llIllIlIlIllll[2]) / 256.0f;
                final Tessellator llllllllllllIllIIllIlIlIllIlIlII = Tessellator.getInstance();
                final WorldRenderer llllllllllllIllIIllIlIlIllIlIIll = llllllllllllIllIIllIlIlIllIlIlII.getWorldRenderer();
                llllllllllllIllIIllIlIlIllIlIIll.begin(RenderPainting.llIllIlIlIllll[3], DefaultVertexFormats.POSITION_TEX_NORMAL);
                llllllllllllIllIIllIlIlIllIlIIll.pos(llllllllllllIllIIllIlIlIllIlllII, llllllllllllIllIIllIlIlIllIllIIl, -llllllllllllIllIIllIlIlIlllIlIll).tex(llllllllllllIllIIllIlIlIllIlIlll, llllllllllllIllIIllIlIlIllIlIllI).normal(0.0f, 0.0f, -1.0f).endVertex();
                llllllllllllIllIIllIlIlIllIlIIll.pos(llllllllllllIllIIllIlIlIllIllIll, llllllllllllIllIIllIlIlIllIllIIl, -llllllllllllIllIIllIlIlIlllIlIll).tex(llllllllllllIllIIllIlIlIllIllIII, llllllllllllIllIIllIlIlIllIlIllI).normal(0.0f, 0.0f, -1.0f).endVertex();
                llllllllllllIllIIllIlIlIllIlIIll.pos(llllllllllllIllIIllIlIlIllIllIll, llllllllllllIllIIllIlIlIllIllIlI, -llllllllllllIllIIllIlIlIlllIlIll).tex(llllllllllllIllIIllIlIlIllIllIII, llllllllllllIllIIllIlIlIllIlIlIl).normal(0.0f, 0.0f, -1.0f).endVertex();
                llllllllllllIllIIllIlIlIllIlIIll.pos(llllllllllllIllIIllIlIlIllIlllII, llllllllllllIllIIllIlIlIllIllIlI, -llllllllllllIllIIllIlIlIlllIlIll).tex(llllllllllllIllIIllIlIlIllIlIlll, llllllllllllIllIIllIlIlIllIlIlIl).normal(0.0f, 0.0f, -1.0f).endVertex();
                llllllllllllIllIIllIlIlIllIlIIll.pos(llllllllllllIllIIllIlIlIllIlllII, llllllllllllIllIIllIlIlIllIllIlI, llllllllllllIllIIllIlIlIlllIlIll).tex(llllllllllllIllIIllIlIlIlllIlIlI, llllllllllllIllIIllIlIlIlllIlIII).normal(0.0f, 0.0f, 1.0f).endVertex();
                llllllllllllIllIIllIlIlIllIlIIll.pos(llllllllllllIllIIllIlIlIllIllIll, llllllllllllIllIIllIlIlIllIllIlI, llllllllllllIllIIllIlIlIlllIlIll).tex(llllllllllllIllIIllIlIlIlllIlIIl, llllllllllllIllIIllIlIlIlllIlIII).normal(0.0f, 0.0f, 1.0f).endVertex();
                llllllllllllIllIIllIlIlIllIlIIll.pos(llllllllllllIllIIllIlIlIllIllIll, llllllllllllIllIIllIlIlIllIllIIl, llllllllllllIllIIllIlIlIlllIlIll).tex(llllllllllllIllIIllIlIlIlllIlIIl, llllllllllllIllIIllIlIlIlllIIlll).normal(0.0f, 0.0f, 1.0f).endVertex();
                llllllllllllIllIIllIlIlIllIlIIll.pos(llllllllllllIllIIllIlIlIllIlllII, llllllllllllIllIIllIlIlIllIllIIl, llllllllllllIllIIllIlIlIlllIlIll).tex(llllllllllllIllIIllIlIlIlllIlIlI, llllllllllllIllIIllIlIlIlllIIlll).normal(0.0f, 0.0f, 1.0f).endVertex();
                llllllllllllIllIIllIlIlIllIlIIll.pos(llllllllllllIllIIllIlIlIllIlllII, llllllllllllIllIIllIlIlIllIllIlI, -llllllllllllIllIIllIlIlIlllIlIll).tex(llllllllllllIllIIllIlIlIlllIIllI, llllllllllllIllIIllIlIlIlllIIlII).normal(0.0f, 1.0f, 0.0f).endVertex();
                llllllllllllIllIIllIlIlIllIlIIll.pos(llllllllllllIllIIllIlIlIllIllIll, llllllllllllIllIIllIlIlIllIllIlI, -llllllllllllIllIIllIlIlIlllIlIll).tex(llllllllllllIllIIllIlIlIlllIIlIl, llllllllllllIllIIllIlIlIlllIIlII).normal(0.0f, 1.0f, 0.0f).endVertex();
                llllllllllllIllIIllIlIlIllIlIIll.pos(llllllllllllIllIIllIlIlIllIllIll, llllllllllllIllIIllIlIlIllIllIlI, llllllllllllIllIIllIlIlIlllIlIll).tex(llllllllllllIllIIllIlIlIlllIIlIl, llllllllllllIllIIllIlIlIlllIIIll).normal(0.0f, 1.0f, 0.0f).endVertex();
                llllllllllllIllIIllIlIlIllIlIIll.pos(llllllllllllIllIIllIlIlIllIlllII, llllllllllllIllIIllIlIlIllIllIlI, llllllllllllIllIIllIlIlIlllIlIll).tex(llllllllllllIllIIllIlIlIlllIIllI, llllllllllllIllIIllIlIlIlllIIIll).normal(0.0f, 1.0f, 0.0f).endVertex();
                llllllllllllIllIIllIlIlIllIlIIll.pos(llllllllllllIllIIllIlIlIllIlllII, llllllllllllIllIIllIlIlIllIllIIl, llllllllllllIllIIllIlIlIlllIlIll).tex(llllllllllllIllIIllIlIlIlllIIllI, llllllllllllIllIIllIlIlIlllIIlII).normal(0.0f, -1.0f, 0.0f).endVertex();
                llllllllllllIllIIllIlIlIllIlIIll.pos(llllllllllllIllIIllIlIlIllIllIll, llllllllllllIllIIllIlIlIllIllIIl, llllllllllllIllIIllIlIlIlllIlIll).tex(llllllllllllIllIIllIlIlIlllIIlIl, llllllllllllIllIIllIlIlIlllIIlII).normal(0.0f, -1.0f, 0.0f).endVertex();
                llllllllllllIllIIllIlIlIllIlIIll.pos(llllllllllllIllIIllIlIlIllIllIll, llllllllllllIllIIllIlIlIllIllIIl, -llllllllllllIllIIllIlIlIlllIlIll).tex(llllllllllllIllIIllIlIlIlllIIlIl, llllllllllllIllIIllIlIlIlllIIIll).normal(0.0f, -1.0f, 0.0f).endVertex();
                llllllllllllIllIIllIlIlIllIlIIll.pos(llllllllllllIllIIllIlIlIllIlllII, llllllllllllIllIIllIlIlIllIllIIl, -llllllllllllIllIIllIlIlIlllIlIll).tex(llllllllllllIllIIllIlIlIlllIIllI, llllllllllllIllIIllIlIlIlllIIIll).normal(0.0f, -1.0f, 0.0f).endVertex();
                llllllllllllIllIIllIlIlIllIlIIll.pos(llllllllllllIllIIllIlIlIllIlllII, llllllllllllIllIIllIlIlIllIllIlI, llllllllllllIllIIllIlIlIlllIlIll).tex(llllllllllllIllIIllIlIlIlllIIIIl, llllllllllllIllIIllIlIlIlllIIIII).normal(-1.0f, 0.0f, 0.0f).endVertex();
                llllllllllllIllIIllIlIlIllIlIIll.pos(llllllllllllIllIIllIlIlIllIlllII, llllllllllllIllIIllIlIlIllIllIIl, llllllllllllIllIIllIlIlIlllIlIll).tex(llllllllllllIllIIllIlIlIlllIIIIl, llllllllllllIllIIllIlIlIllIlllll).normal(-1.0f, 0.0f, 0.0f).endVertex();
                llllllllllllIllIIllIlIlIllIlIIll.pos(llllllllllllIllIIllIlIlIllIlllII, llllllllllllIllIIllIlIlIllIllIIl, -llllllllllllIllIIllIlIlIlllIlIll).tex(llllllllllllIllIIllIlIlIlllIIIlI, llllllllllllIllIIllIlIlIllIlllll).normal(-1.0f, 0.0f, 0.0f).endVertex();
                llllllllllllIllIIllIlIlIllIlIIll.pos(llllllllllllIllIIllIlIlIllIlllII, llllllllllllIllIIllIlIlIllIllIlI, -llllllllllllIllIIllIlIlIlllIlIll).tex(llllllllllllIllIIllIlIlIlllIIIlI, llllllllllllIllIIllIlIlIlllIIIII).normal(-1.0f, 0.0f, 0.0f).endVertex();
                llllllllllllIllIIllIlIlIllIlIIll.pos(llllllllllllIllIIllIlIlIllIllIll, llllllllllllIllIIllIlIlIllIllIlI, -llllllllllllIllIIllIlIlIlllIlIll).tex(llllllllllllIllIIllIlIlIlllIIIIl, llllllllllllIllIIllIlIlIlllIIIII).normal(1.0f, 0.0f, 0.0f).endVertex();
                llllllllllllIllIIllIlIlIllIlIIll.pos(llllllllllllIllIIllIlIlIllIllIll, llllllllllllIllIIllIlIlIllIllIIl, -llllllllllllIllIIllIlIlIlllIlIll).tex(llllllllllllIllIIllIlIlIlllIIIIl, llllllllllllIllIIllIlIlIllIlllll).normal(1.0f, 0.0f, 0.0f).endVertex();
                llllllllllllIllIIllIlIlIllIlIIll.pos(llllllllllllIllIIllIlIlIllIllIll, llllllllllllIllIIllIlIlIllIllIIl, llllllllllllIllIIllIlIlIlllIlIll).tex(llllllllllllIllIIllIlIlIlllIIIlI, llllllllllllIllIIllIlIlIllIlllll).normal(1.0f, 0.0f, 0.0f).endVertex();
                llllllllllllIllIIllIlIlIllIlIIll.pos(llllllllllllIllIIllIlIlIllIllIll, llllllllllllIllIIllIlIlIllIllIlI, llllllllllllIllIIllIlIlIlllIlIll).tex(llllllllllllIllIIllIlIlIlllIIIlI, llllllllllllIllIIllIlIlIlllIIIII).normal(1.0f, 0.0f, 0.0f).endVertex();
                llllllllllllIllIIllIlIlIllIlIlII.draw();
                ++llllllllllllIllIIllIlIlIllIlllIl;
            }
            ++llllllllllllIllIIllIlIlIllIllllI;
        }
    }
    
    private void setLightmap(final EntityPainting llllllllllllIllIIllIlIlIlIIllIlI, final float llllllllllllIllIIllIlIlIlIlIIlII, final float llllllllllllIllIIllIlIlIlIlIIIll) {
        int llllllllllllIllIIllIlIlIlIlIIIlI = MathHelper.floor_double(llllllllllllIllIIllIlIlIlIIllIlI.posX);
        final int llllllllllllIllIIllIlIlIlIlIIIIl = MathHelper.floor_double(llllllllllllIllIIllIlIlIlIIllIlI.posY + llllllllllllIllIIllIlIlIlIlIIIll / 16.0f);
        int llllllllllllIllIIllIlIlIlIlIIIII = MathHelper.floor_double(llllllllllllIllIIllIlIlIlIIllIlI.posZ);
        final EnumFacing llllllllllllIllIIllIlIlIlIIlllll = llllllllllllIllIIllIlIlIlIIllIlI.facingDirection;
        if (lIIlIllllllIlIlI(llllllllllllIllIIllIlIlIlIIlllll, EnumFacing.NORTH)) {
            llllllllllllIllIIllIlIlIlIlIIIlI = MathHelper.floor_double(llllllllllllIllIIllIlIlIlIIllIlI.posX + llllllllllllIllIIllIlIlIlIlIIlII / 16.0f);
        }
        if (lIIlIllllllIlIlI(llllllllllllIllIIllIlIlIlIIlllll, EnumFacing.WEST)) {
            llllllllllllIllIIllIlIlIlIlIIIII = MathHelper.floor_double(llllllllllllIllIIllIlIlIlIIllIlI.posZ - llllllllllllIllIIllIlIlIlIlIIlII / 16.0f);
        }
        if (lIIlIllllllIlIlI(llllllllllllIllIIllIlIlIlIIlllll, EnumFacing.SOUTH)) {
            llllllllllllIllIIllIlIlIlIlIIIlI = MathHelper.floor_double(llllllllllllIllIIllIlIlIlIIllIlI.posX - llllllllllllIllIIllIlIlIlIlIIlII / 16.0f);
        }
        if (lIIlIllllllIlIlI(llllllllllllIllIIllIlIlIlIIlllll, EnumFacing.EAST)) {
            llllllllllllIllIIllIlIlIlIlIIIII = MathHelper.floor_double(llllllllllllIllIIllIlIlIlIIllIlI.posZ + llllllllllllIllIIllIlIlIlIlIIlII / 16.0f);
        }
        final int llllllllllllIllIIllIlIlIlIIllllI = this.renderManager.worldObj.getCombinedLight(new BlockPos(llllllllllllIllIIllIlIlIlIlIIIlI, llllllllllllIllIIllIlIlIlIlIIIIl, llllllllllllIllIIllIlIlIlIlIIIII), RenderPainting.llIllIlIlIllll[0]);
        final int llllllllllllIllIIllIlIlIlIIlllIl = llllllllllllIllIIllIlIlIlIIllllI % RenderPainting.llIllIlIlIllll[4];
        final int llllllllllllIllIIllIlIlIlIIlllII = llllllllllllIllIIllIlIlIlIIllllI / RenderPainting.llIllIlIlIllll[4];
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)llllllllllllIllIIllIlIlIlIIlllIl, (float)llllllllllllIllIIllIlIlIlIIlllII);
        GlStateManager.color(1.0f, 1.0f, 1.0f);
    }
    
    private static boolean lIIlIllllllIlIlI(final Object llllllllllllIllIIllIlIlIIllIlIll, final Object llllllllllllIllIIllIlIlIIllIlIlI) {
        return llllllllllllIllIIllIlIlIIllIlIll == llllllllllllIllIIllIlIlIIllIlIlI;
    }
    
    static {
        lIIlIllllllIlIII();
        lIIlIlllIlIIlIll();
        KRISTOFFER_PAINTING_TEXTURE = new ResourceLocation(RenderPainting.llIllIIllllIlI[RenderPainting.llIllIlIlIllll[0]]);
    }
    
    private static void lIIlIlllIlIIlIll() {
        (llIllIIllllIlI = new String[RenderPainting.llIllIlIlIllll[1]])[RenderPainting.llIllIlIlIllll[0]] = lIIlIlllIlIIlIlI("3SBzzS65X05oze4LfAhDsDgWZeSwczLgmXiMU2rj+pvaScsyWgtkw757Vb/T7TUocnxfewx38eQ=", "SKEMC");
    }
    
    private static void lIIlIllllllIlIII() {
        (llIllIlIlIllll = new int[6])[0] = ((73 + 65 - 22 + 11 ^ (0x58 ^ 0x16)) & (124 + 119 - 112 + 1 ^ 147 + 84 - 224 + 174 ^ -" ".length()));
        RenderPainting.llIllIlIlIllll[1] = " ".length();
        RenderPainting.llIllIlIlIllll[2] = (0xEE ^ 0x97 ^ (0x77 ^ 0x1E));
        RenderPainting.llIllIlIlIllll[3] = (0x3B ^ 0x3C);
        RenderPainting.llIllIlIlIllll[4] = (0xFFFFF30C & 0x10CF3);
        RenderPainting.llIllIlIlIllll[5] = "  ".length();
    }
    
    @Override
    public void doRender(final EntityPainting llllllllllllIllIIllIlIllIIIllllI, final double llllllllllllIllIIllIlIllIIIlllIl, final double llllllllllllIllIIllIlIllIIlIIlIl, final double llllllllllllIllIIllIlIllIIlIIlII, final float llllllllllllIllIIllIlIllIIlIIIll, final float llllllllllllIllIIllIlIllIIlIIIlI) {
        GlStateManager.pushMatrix();
        GlStateManager.translate(llllllllllllIllIIllIlIllIIIlllIl, llllllllllllIllIIllIlIllIIlIIlIl, llllllllllllIllIIllIlIllIIlIIlII);
        GlStateManager.rotate(180.0f - llllllllllllIllIIllIlIllIIlIIIll, 0.0f, 1.0f, 0.0f);
        GlStateManager.enableRescaleNormal();
        this.bindEntityTexture(llllllllllllIllIIllIlIllIIIllllI);
        "".length();
        final EntityPainting.EnumArt llllllllllllIllIIllIlIllIIlIIIIl = llllllllllllIllIIllIlIllIIIllllI.art;
        final float llllllllllllIllIIllIlIllIIlIIIII = 0.0625f;
        GlStateManager.scale(llllllllllllIllIIllIlIllIIlIIIII, llllllllllllIllIIllIlIllIIlIIIII, llllllllllllIllIIllIlIllIIlIIIII);
        this.renderPainting(llllllllllllIllIIllIlIllIIIllllI, llllllllllllIllIIllIlIllIIlIIIIl.sizeX, llllllllllllIllIIllIlIllIIlIIIIl.sizeY, llllllllllllIllIIllIlIllIIlIIIIl.offsetX, llllllllllllIllIIllIlIllIIlIIIIl.offsetY);
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
        super.doRender(llllllllllllIllIIllIlIllIIIllllI, llllllllllllIllIIllIlIllIIIlllIl, llllllllllllIllIIllIlIllIIlIIlIl, llllllllllllIllIIllIlIllIIlIIlII, llllllllllllIllIIllIlIllIIlIIIll, llllllllllllIllIIllIlIllIIlIIIlI);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityPainting llllllllllllIllIIllIlIllIIIlIlIl) {
        return RenderPainting.KRISTOFFER_PAINTING_TEXTURE;
    }
}
