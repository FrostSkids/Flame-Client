// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import org.lwjgl.opengl.GL11;
import net.minecraft.util.Vec3;
import java.nio.FloatBuffer;

public class RenderHelper
{
    private static /* synthetic */ FloatBuffer colorBuffer;
    private static final /* synthetic */ Vec3 LIGHT1_POS;
    private static final /* synthetic */ Vec3 LIGHT0_POS;
    private static final /* synthetic */ int[] lIllIlIlllIlII;
    
    public static void disableStandardItemLighting() {
        GlStateManager.disableLighting();
        GlStateManager.disableLight(RenderHelper.lIllIlIlllIlII[1]);
        GlStateManager.disableLight(RenderHelper.lIllIlIlllIlII[2]);
        GlStateManager.disableColorMaterial();
    }
    
    public static void enableGUIStandardItemLighting() {
        GlStateManager.pushMatrix();
        GlStateManager.rotate(-30.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(165.0f, 1.0f, 0.0f, 0.0f);
        enableStandardItemLighting();
        GlStateManager.popMatrix();
    }
    
    public static void enableStandardItemLighting() {
        GlStateManager.enableLighting();
        GlStateManager.enableLight(RenderHelper.lIllIlIlllIlII[1]);
        GlStateManager.enableLight(RenderHelper.lIllIlIlllIlII[2]);
        GlStateManager.enableColorMaterial();
        GlStateManager.colorMaterial(RenderHelper.lIllIlIlllIlII[3], RenderHelper.lIllIlIlllIlII[4]);
        final float llllllllllllIllllllllIIlIIllIlII = 0.4f;
        final float llllllllllllIllllllllIIlIIllIIll = 0.6f;
        final float llllllllllllIllllllllIIlIIllIIlI = 0.0f;
        GL11.glLight(RenderHelper.lIllIlIlllIlII[5], RenderHelper.lIllIlIlllIlII[6], setColorBuffer(RenderHelper.LIGHT0_POS.xCoord, RenderHelper.LIGHT0_POS.yCoord, RenderHelper.LIGHT0_POS.zCoord, 0.0));
        GL11.glLight(RenderHelper.lIllIlIlllIlII[5], RenderHelper.lIllIlIlllIlII[7], setColorBuffer(llllllllllllIllllllllIIlIIllIIll, llllllllllllIllllllllIIlIIllIIll, llllllllllllIllllllllIIlIIllIIll, 1.0f));
        GL11.glLight(RenderHelper.lIllIlIlllIlII[5], RenderHelper.lIllIlIlllIlII[8], setColorBuffer(0.0f, 0.0f, 0.0f, 1.0f));
        GL11.glLight(RenderHelper.lIllIlIlllIlII[5], RenderHelper.lIllIlIlllIlII[9], setColorBuffer(llllllllllllIllllllllIIlIIllIIlI, llllllllllllIllllllllIIlIIllIIlI, llllllllllllIllllllllIIlIIllIIlI, 1.0f));
        GL11.glLight(RenderHelper.lIllIlIlllIlII[10], RenderHelper.lIllIlIlllIlII[6], setColorBuffer(RenderHelper.LIGHT1_POS.xCoord, RenderHelper.LIGHT1_POS.yCoord, RenderHelper.LIGHT1_POS.zCoord, 0.0));
        GL11.glLight(RenderHelper.lIllIlIlllIlII[10], RenderHelper.lIllIlIlllIlII[7], setColorBuffer(llllllllllllIllllllllIIlIIllIIll, llllllllllllIllllllllIIlIIllIIll, llllllllllllIllllllllIIlIIllIIll, 1.0f));
        GL11.glLight(RenderHelper.lIllIlIlllIlII[10], RenderHelper.lIllIlIlllIlII[8], setColorBuffer(0.0f, 0.0f, 0.0f, 1.0f));
        GL11.glLight(RenderHelper.lIllIlIlllIlII[10], RenderHelper.lIllIlIlllIlII[9], setColorBuffer(llllllllllllIllllllllIIlIIllIIlI, llllllllllllIllllllllIIlIIllIIlI, llllllllllllIllllllllIIlIIllIIlI, 1.0f));
        GlStateManager.shadeModel(RenderHelper.lIllIlIlllIlII[11]);
        GL11.glLightModel(RenderHelper.lIllIlIlllIlII[12], setColorBuffer(llllllllllllIllllllllIIlIIllIlII, llllllllllllIllllllllIIlIIllIlII, llllllllllllIllllllllIIlIIllIlII, 1.0f));
    }
    
    static {
        lllllllIIllIIIl();
        RenderHelper.colorBuffer = GLAllocation.createDirectFloatBuffer(RenderHelper.lIllIlIlllIlII[0]);
        LIGHT0_POS = new Vec3(0.20000000298023224, 1.0, -0.699999988079071).normalize();
        LIGHT1_POS = new Vec3(-0.20000000298023224, 1.0, 0.699999988079071).normalize();
    }
    
    private static void lllllllIIllIIIl() {
        (lIllIlIlllIlII = new int[13])[0] = (0x7A ^ 0x6A);
        RenderHelper.lIllIlIlllIlII[1] = ((0x92 ^ 0x81 ^ (0xED ^ 0xB5)) & (113 + 56 - 64 + 31 ^ 15 + 146 - 147 + 181 ^ -" ".length()));
        RenderHelper.lIllIlIlllIlII[2] = " ".length();
        RenderHelper.lIllIlIlllIlII[3] = (-(0xFFFFB7F7 & 0x59EE) & (0xFFFFDDFD & 0x37EF));
        RenderHelper.lIllIlIlllIlII[4] = (-(0xFFFFFDD5 & 0x626F) & (0xFFFFF7F6 & 0x7E4F));
        RenderHelper.lIllIlIlllIlII[5] = (-(0xFFFFA777 & 0x5DEF) & (0xFFFFD7FE & 0x6D67));
        RenderHelper.lIllIlIlllIlII[6] = (0xFFFFF21F & 0x1FE3);
        RenderHelper.lIllIlIlllIlII[7] = (0xFFFFFFF7 & 0x1209);
        RenderHelper.lIllIlIlllIlII[8] = (0xFFFF92CB & 0x7F34);
        RenderHelper.lIllIlIlllIlII[9] = (0xFFFFB363 & 0x5E9E);
        RenderHelper.lIllIlIlllIlII[10] = (-(0xFFFFDEB9 & 0x3B5F) & (0xFFFFDA3D & 0x7FDB));
        RenderHelper.lIllIlIlllIlII[11] = (0xFFFFDD55 & 0x3FAA);
        RenderHelper.lIllIlIlllIlII[12] = (-(0xFFFFFDCD & 0x26BB) & (0xFFFFAFDF & 0x7FFB));
    }
    
    private static FloatBuffer setColorBuffer(final double llllllllllllIllllllllIIlIIlIIllI, final double llllllllllllIllllllllIIlIIlIlIIl, final double llllllllllllIllllllllIIlIIlIIlII, final double llllllllllllIllllllllIIlIIlIIIll) {
        return setColorBuffer((float)llllllllllllIllllllllIIlIIlIIllI, (float)llllllllllllIllllllllIIlIIlIlIIl, (float)llllllllllllIllllllllIIlIIlIIlII, (float)llllllllllllIllllllllIIlIIlIIIll);
    }
    
    private static FloatBuffer setColorBuffer(final float llllllllllllIllllllllIIlIIIllllI, final float llllllllllllIllllllllIIlIIIlllIl, final float llllllllllllIllllllllIIlIIIllIII, final float llllllllllllIllllllllIIlIIIllIll) {
        RenderHelper.colorBuffer.clear();
        "".length();
        RenderHelper.colorBuffer.put(llllllllllllIllllllllIIlIIIllllI).put(llllllllllllIllllllllIIlIIIlllIl).put(llllllllllllIllllllllIIlIIIllIII).put(llllllllllllIllllllllIIlIIIllIll);
        "".length();
        RenderHelper.colorBuffer.flip();
        "".length();
        return RenderHelper.colorBuffer;
    }
}
