// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.ModelMinecart;
import net.minecraft.client.Minecraft;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.Vec3;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.item.EntityMinecart;

public class RenderMinecart<T extends EntityMinecart> extends Render<T>
{
    private static final /* synthetic */ int[] lIllIlllIlllll;
    private static final /* synthetic */ String[] lIllIlllIllllI;
    protected /* synthetic */ ModelBase modelMinecart;
    private static final /* synthetic */ ResourceLocation minecartTextures;
    
    private static void lIIIIIIIIlIlIIIl() {
        (lIllIlllIlllll = new int[7])[0] = ((85 + 183 - 188 + 121 ^ 84 + 143 - 71 + 2) & (0x11 ^ 0x3B ^ (0x5F ^ 0x22) ^ -" ".length()));
        RenderMinecart.lIllIlllIlllll[1] = (0x63 ^ 0x73);
        RenderMinecart.lIllIlllIlllll[2] = (0x82 ^ 0x96);
        RenderMinecart.lIllIlllIlllll[3] = (0x7 ^ 0x45 ^ (0xE ^ 0x54));
        RenderMinecart.lIllIlllIlllll[4] = -" ".length();
        RenderMinecart.lIllIlllIlllll[5] = (0x40 ^ 0x3C ^ (0xF8 ^ 0x8C));
        RenderMinecart.lIllIlllIlllll[6] = " ".length();
    }
    
    private static boolean lIIIIIIIIlIllIIl(final int llllllllllllIllllllIIlIIllIllllI) {
        return llllllllllllIllllllIIlIIllIllllI < 0;
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final T llllllllllllIllllllIIlIlIIIllllI) {
        return RenderMinecart.minecartTextures;
    }
    
    private static int lIIIIIIIIlIlIlII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIIIIIIIIlIllIII(final int llllllllllllIllllllIIlIIlllIIIII) {
        return llllllllllllIllllllIIlIIlllIIIII != 0;
    }
    
    static {
        lIIIIIIIIlIlIIIl();
        lIIIIIIIIlIlIIII();
        minecartTextures = new ResourceLocation(RenderMinecart.lIllIlllIllllI[RenderMinecart.lIllIlllIlllll[0]]);
    }
    
    private static boolean lIIIIIIIIlIlIlll(final Object llllllllllllIllllllIIlIIlllIIIlI) {
        return llllllllllllIllllllIIlIIlllIIIlI == null;
    }
    
    private static boolean lIIIIIIIIlIllIlI(final int llllllllllllIllllllIIlIIllIlllII) {
        return llllllllllllIllllllIIlIIllIlllII > 0;
    }
    
    private static void lIIIIIIIIlIlIIII() {
        (lIllIlllIllllI = new String[RenderMinecart.lIllIlllIlllll[6]])[RenderMinecart.lIllIlllIlllll[0]] = lIIIIIIIIlIIllll("JDwuIyciPCV4Nz4tPyMrfzQ/OTczOCQjfCA3MQ==", "PYVWR");
    }
    
    private static boolean lIIIIIIIIlIlIllI(final Object llllllllllllIllllllIIlIIlllIIlII) {
        return llllllllllllIllllllIIlIIlllIIlII != null;
    }
    
    private static int lIIIIIIIIlIlIIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIIIIIIIIlIllIll(final int llllllllllllIllllllIIlIIllIllIIl, final int llllllllllllIllllllIIlIIllIllIII) {
        return llllllllllllIllllllIIlIIllIllIIl != llllllllllllIllllllIIlIIllIllIII;
    }
    
    private static String lIIIIIIIIlIIllll(String llllllllllllIllllllIIlIIllllIIlI, final String llllllllllllIllllllIIlIIllllIllI) {
        llllllllllllIllllllIIlIIllllIIlI = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIllllllIIlIIllllIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllllIIlIIllllIlIl = new StringBuilder();
        final char[] llllllllllllIllllllIIlIIllllIlII = llllllllllllIllllllIIlIIllllIllI.toCharArray();
        int llllllllllllIllllllIIlIIllllIIll = RenderMinecart.lIllIlllIlllll[0];
        final String llllllllllllIllllllIIlIIlllIllIl = (Object)((String)llllllllllllIllllllIIlIIllllIIlI).toCharArray();
        final short llllllllllllIllllllIIlIIlllIllII = (short)llllllllllllIllllllIIlIIlllIllIl.length;
        int llllllllllllIllllllIIlIIlllIlIll = RenderMinecart.lIllIlllIlllll[0];
        while (lIIIIIIIIlIlllII(llllllllllllIllllllIIlIIlllIlIll, llllllllllllIllllllIIlIIlllIllII)) {
            final char llllllllllllIllllllIIlIIlllllIII = llllllllllllIllllllIIlIIlllIllIl[llllllllllllIllllllIIlIIlllIlIll];
            llllllllllllIllllllIIlIIllllIlIl.append((char)(llllllllllllIllllllIIlIIlllllIII ^ llllllllllllIllllllIIlIIllllIlII[llllllllllllIllllllIIlIIllllIIll % llllllllllllIllllllIIlIIllllIlII.length]));
            "".length();
            ++llllllllllllIllllllIIlIIllllIIll;
            ++llllllllllllIllllllIIlIIlllIlIll;
            "".length();
            if (-(0x9A ^ 0x9F) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllllIIlIIllllIlIl);
    }
    
    private static boolean lIIIIIIIIlIlllII(final int llllllllllllIllllllIIlIIlllIIlll, final int llllllllllllIllllllIIlIIlllIIllI) {
        return llllllllllllIllllllIIlIIlllIIlll < llllllllllllIllllllIIlIIlllIIllI;
    }
    
    @Override
    public void doRender(final T llllllllllllIllllllIIlIlIlIIllIl, double llllllllllllIllllllIIlIlIIllIIll, double llllllllllllIllllllIIlIlIIllIIlI, double llllllllllllIllllllIIlIlIIllIIIl, float llllllllllllIllllllIIlIlIIllIIII, final float llllllllllllIllllllIIlIlIlIIlIII) {
        GlStateManager.pushMatrix();
        this.bindEntityTexture(llllllllllllIllllllIIlIlIlIIllIl);
        "".length();
        long llllllllllllIllllllIIlIlIlIIIlll = llllllllllllIllllllIIlIlIlIIllIl.getEntityId() * 493286711L;
        llllllllllllIllllllIIlIlIlIIIlll = llllllllllllIllllllIIlIlIlIIIlll * llllllllllllIllllllIIlIlIlIIIlll * 4392167121L + llllllllllllIllllllIIlIlIlIIIlll * 98761L;
        final float llllllllllllIllllllIIlIlIlIIIllI = (((llllllllllllIllllllIIlIlIlIIIlll >> RenderMinecart.lIllIlllIlllll[1] & 0x7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        final float llllllllllllIllllllIIlIlIlIIIlIl = (((llllllllllllIllllllIIlIlIlIIIlll >> RenderMinecart.lIllIlllIlllll[2] & 0x7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        final float llllllllllllIllllllIIlIlIlIIIlII = (((llllllllllllIllllllIIlIlIlIIIlll >> RenderMinecart.lIllIlllIlllll[3] & 0x7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        GlStateManager.translate(llllllllllllIllllllIIlIlIlIIIllI, llllllllllllIllllllIIlIlIlIIIlIl, llllllllllllIllllllIIlIlIlIIIlII);
        final double llllllllllllIllllllIIlIlIlIIIIll = llllllllllllIllllllIIlIlIlIIllIl.lastTickPosX + (llllllllllllIllllllIIlIlIlIIllIl.posX - llllllllllllIllllllIIlIlIlIIllIl.lastTickPosX) * llllllllllllIllllllIIlIlIlIIlIII;
        final double llllllllllllIllllllIIlIlIlIIIIlI = llllllllllllIllllllIIlIlIlIIllIl.lastTickPosY + (llllllllllllIllllllIIlIlIlIIllIl.posY - llllllllllllIllllllIIlIlIlIIllIl.lastTickPosY) * llllllllllllIllllllIIlIlIlIIlIII;
        final double llllllllllllIllllllIIlIlIlIIIIIl = llllllllllllIllllllIIlIlIlIIllIl.lastTickPosZ + (llllllllllllIllllllIIlIlIlIIllIl.posZ - llllllllllllIllllllIIlIlIlIIllIl.lastTickPosZ) * llllllllllllIllllllIIlIlIlIIlIII;
        final double llllllllllllIllllllIIlIlIlIIIIII = 0.30000001192092896;
        final Vec3 llllllllllllIllllllIIlIlIIllllll = llllllllllllIllllllIIlIlIlIIllIl.func_70489_a(llllllllllllIllllllIIlIlIlIIIIll, llllllllllllIllllllIIlIlIlIIIIlI, llllllllllllIllllllIIlIlIlIIIIIl);
        float llllllllllllIllllllIIlIlIIlllllI = llllllllllllIllllllIIlIlIlIIllIl.prevRotationPitch + (llllllllllllIllllllIIlIlIlIIllIl.rotationPitch - llllllllllllIllllllIIlIlIlIIllIl.prevRotationPitch) * llllllllllllIllllllIIlIlIlIIlIII;
        if (lIIIIIIIIlIlIllI(llllllllllllIllllllIIlIlIIllllll)) {
            Vec3 llllllllllllIllllllIIlIlIIllllIl = llllllllllllIllllllIIlIlIlIIllIl.func_70495_a(llllllllllllIllllllIIlIlIlIIIIll, llllllllllllIllllllIIlIlIlIIIIlI, llllllllllllIllllllIIlIlIlIIIIIl, llllllllllllIllllllIIlIlIlIIIIII);
            Vec3 llllllllllllIllllllIIlIlIIllllII = llllllllllllIllllllIIlIlIlIIllIl.func_70495_a(llllllllllllIllllllIIlIlIlIIIIll, llllllllllllIllllllIIlIlIlIIIIlI, llllllllllllIllllllIIlIlIlIIIIIl, -llllllllllllIllllllIIlIlIlIIIIII);
            if (lIIIIIIIIlIlIlll(llllllllllllIllllllIIlIlIIllllIl)) {
                llllllllllllIllllllIIlIlIIllllIl = llllllllllllIllllllIIlIlIIllllll;
            }
            if (lIIIIIIIIlIlIlll(llllllllllllIllllllIIlIlIIllllII)) {
                llllllllllllIllllllIIlIlIIllllII = llllllllllllIllllllIIlIlIIllllll;
            }
            llllllllllllIllllllIIlIlIIllIIll += llllllllllllIllllllIIlIlIIllllll.xCoord - llllllllllllIllllllIIlIlIlIIIIll;
            llllllllllllIllllllIIlIlIIllIIlI += (llllllllllllIllllllIIlIlIIllllIl.yCoord + llllllllllllIllllllIIlIlIIllllII.yCoord) / 2.0 - llllllllllllIllllllIIlIlIlIIIIlI;
            llllllllllllIllllllIIlIlIIllIIIl += llllllllllllIllllllIIlIlIIllllll.zCoord - llllllllllllIllllllIIlIlIlIIIIIl;
            Vec3 llllllllllllIllllllIIlIlIIlllIll = llllllllllllIllllllIIlIlIIllllII.addVector(-llllllllllllIllllllIIlIlIIllllIl.xCoord, -llllllllllllIllllllIIlIlIIllllIl.yCoord, -llllllllllllIllllllIIlIlIIllllIl.zCoord);
            if (lIIIIIIIIlIllIII(lIIIIIIIIlIlIIlI(llllllllllllIllllllIIlIlIIlllIll.lengthVector(), 0.0))) {
                llllllllllllIllllllIIlIlIIlllIll = llllllllllllIllllllIIlIlIIlllIll.normalize();
                llllllllllllIllllllIIlIlIIllIIII = (float)(Math.atan2(llllllllllllIllllllIIlIlIIlllIll.zCoord, llllllllllllIllllllIIlIlIIlllIll.xCoord) * 180.0 / 3.141592653589793);
                llllllllllllIllllllIIlIlIIlllllI = (float)(Math.atan(llllllllllllIllllllIIlIlIIlllIll.yCoord) * 73.0);
            }
        }
        GlStateManager.translate((float)llllllllllllIllllllIIlIlIIllIIll, (float)llllllllllllIllllllIIlIlIIllIIlI + 0.375f, (float)llllllllllllIllllllIIlIlIIllIIIl);
        GlStateManager.rotate((float)(180.0f - llllllllllllIllllllIIlIlIIllIIII), 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(-llllllllllllIllllllIIlIlIIlllllI, 0.0f, 0.0f, 1.0f);
        final float llllllllllllIllllllIIlIlIIlllIlI = llllllllllllIllllllIIlIlIlIIllIl.getRollingAmplitude() - llllllllllllIllllllIIlIlIlIIlIII;
        float llllllllllllIllllllIIlIlIIlllIIl = llllllllllllIllllllIIlIlIlIIllIl.getDamage() - llllllllllllIllllllIIlIlIlIIlIII;
        if (lIIIIIIIIlIllIIl(lIIIIIIIIlIlIlII(llllllllllllIllllllIIlIlIIlllIIl, 0.0f))) {
            llllllllllllIllllllIIlIlIIlllIIl = 0.0f;
        }
        if (lIIIIIIIIlIllIlI(lIIIIIIIIlIlIlIl(llllllllllllIllllllIIlIlIIlllIlI, 0.0f))) {
            GlStateManager.rotate(MathHelper.sin(llllllllllllIllllllIIlIlIIlllIlI) * llllllllllllIllllllIIlIlIIlllIlI * llllllllllllIllllllIIlIlIIlllIIl / 10.0f * llllllllllllIllllllIIlIlIlIIllIl.getRollingDirection(), 1.0f, 0.0f, 0.0f);
        }
        final int llllllllllllIllllllIIlIlIIlllIII = llllllllllllIllllllIIlIlIlIIllIl.getDisplayTileOffset();
        final IBlockState llllllllllllIllllllIIlIlIIllIlll = llllllllllllIllllllIIlIlIlIIllIl.getDisplayTile();
        if (lIIIIIIIIlIllIll(llllllllllllIllllllIIlIlIIllIlll.getBlock().getRenderType(), RenderMinecart.lIllIlllIlllll[4])) {
            GlStateManager.pushMatrix();
            this.bindTexture(TextureMap.locationBlocksTexture);
            final float llllllllllllIllllllIIlIlIIllIllI = 0.75f;
            GlStateManager.scale(llllllllllllIllllllIIlIlIIllIllI, llllllllllllIllllllIIlIlIIllIllI, llllllllllllIllllllIIlIlIIllIllI);
            GlStateManager.translate(-0.5f, (llllllllllllIllllllIIlIlIIlllIII - RenderMinecart.lIllIlllIlllll[5]) / 16.0f, 0.5f);
            this.func_180560_a(llllllllllllIllllllIIlIlIlIIllIl, llllllllllllIllllllIIlIlIlIIlIII, llllllllllllIllllllIIlIlIIllIlll);
            GlStateManager.popMatrix();
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            this.bindEntityTexture(llllllllllllIllllllIIlIlIlIIllIl);
            "".length();
        }
        GlStateManager.scale(-1.0f, -1.0f, 1.0f);
        this.modelMinecart.render(llllllllllllIllllllIIlIlIlIIllIl, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        GlStateManager.popMatrix();
        super.doRender(llllllllllllIllllllIIlIlIlIIllIl, llllllllllllIllllllIIlIlIIllIIll, llllllllllllIllllllIIlIlIIllIIlI, llllllllllllIllllllIIlIlIIllIIIl, (float)llllllllllllIllllllIIlIlIIllIIII, llllllllllllIllllllIIlIlIlIIlIII);
    }
    
    private static int lIIIIIIIIlIlIlIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    protected void func_180560_a(final T llllllllllllIllllllIIlIlIIIllIIl, final float llllllllllllIllllllIIlIlIIIlIlIl, final IBlockState llllllllllllIllllllIIlIlIIIlIlII) {
        GlStateManager.pushMatrix();
        Minecraft.getMinecraft().getBlockRendererDispatcher().renderBlockBrightness(llllllllllllIllllllIIlIlIIIlIlII, llllllllllllIllllllIIlIlIIIllIIl.getBrightness(llllllllllllIllllllIIlIlIIIlIlIl));
        GlStateManager.popMatrix();
    }
    
    public RenderMinecart(final RenderManager llllllllllllIllllllIIlIlIllIIlIl) {
        super(llllllllllllIllllllIIlIlIllIIlIl);
        this.modelMinecart = new ModelMinecart();
        this.shadowSize = 0.5f;
    }
}
