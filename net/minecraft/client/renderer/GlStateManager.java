// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;

public class GlStateManager
{
    private static /* synthetic */ int activeShadeModel;
    private static /* synthetic */ BooleanState rescaleNormalState;
    private static /* synthetic */ StencilState stencilState;
    public static /* synthetic */ TextureState[] textureState;
    private static /* synthetic */ ColorLogicState colorLogicState;
    private static /* synthetic */ PolygonOffsetState polygonOffsetState;
    private static final /* synthetic */ int[] lIIllIllIIllll;
    private static /* synthetic */ ColorMaterialState colorMaterialState;
    private static /* synthetic */ FogState fogState;
    private static /* synthetic */ ClearState clearState;
    private static /* synthetic */ BlendState blendState;
    private static /* synthetic */ Color colorState;
    public static /* synthetic */ int activeTextureUnit;
    private static /* synthetic */ CullState cullState;
    private static /* synthetic */ AlphaState alphaState;
    private static /* synthetic */ ColorMask colorMaskState;
    private static /* synthetic */ BooleanState normalizeState;
    private static /* synthetic */ BooleanState lightingState;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$client$renderer$GlStateManager$TexGen;
    private static /* synthetic */ TexGenState texGenState;
    private static /* synthetic */ DepthState depthState;
    private static /* synthetic */ BooleanState[] lightState;
    
    public static void disableColorLogic() {
        GlStateManager.colorLogicState.field_179197_a.setDisabled();
    }
    
    public static void rotate(final float lllllllllllllIIlIlIIllIlIIllIIII, final float lllllllllllllIIlIlIIllIlIIllIIll, final float lllllllllllllIIlIlIIllIlIIlIlllI, final float lllllllllllllIIlIlIIllIlIIlIllIl) {
        GL11.glRotatef(lllllllllllllIIlIlIIllIlIIllIIII, lllllllllllllIIlIlIIllIlIIllIIll, lllllllllllllIIlIlIIllIlIIlIlllI, lllllllllllllIIlIlIIllIlIIlIllIl);
    }
    
    public static void colorMaterial(final int lllllllllllllIIlIlIIlllIIIIIlIlI, final int lllllllllllllIIlIlIIlllIIIIIlIIl) {
        if (!llIllIIllIllIlI(lllllllllllllIIlIlIIlllIIIIIlIlI, GlStateManager.colorMaterialState.field_179189_b) || llIllIIllIlllII(lllllllllllllIIlIlIIlllIIIIIlIIl, GlStateManager.colorMaterialState.field_179190_c)) {
            GlStateManager.colorMaterialState.field_179189_b = lllllllllllllIIlIlIIlllIIIIIlIlI;
            GlStateManager.colorMaterialState.field_179190_c = lllllllllllllIIlIlIIlllIIIIIlIIl;
            GL11.glColorMaterial(lllllllllllllIIlIlIIlllIIIIIlIlI, lllllllllllllIIlIlIIlllIIIIIlIIl);
        }
    }
    
    public static void disableLighting() {
        GlStateManager.lightingState.setDisabled();
    }
    
    private static TexGenCoord texGenCoord(final TexGen lllllllllllllIIlIlIIllIllIlIIIII) {
        switch ($SWITCH_TABLE$net$minecraft$client$renderer$GlStateManager$TexGen()[lllllllllllllIIlIlIIllIllIlIIIII.ordinal()]) {
            case 1: {
                return GlStateManager.texGenState.field_179064_a;
            }
            case 2: {
                return GlStateManager.texGenState.field_179062_b;
            }
            case 3: {
                return GlStateManager.texGenState.field_179063_c;
            }
            case 4: {
                return GlStateManager.texGenState.field_179061_d;
            }
            default: {
                return GlStateManager.texGenState.field_179064_a;
            }
        }
    }
    
    private static boolean llIllIIllIllIII(final int lllllllllllllIIlIlIIllIIlllIIlIl, final int lllllllllllllIIlIlIIllIIlllIIlII) {
        return lllllllllllllIIlIlIIllIIlllIIlIl >= lllllllllllllIIlIlIIllIIlllIIlII;
    }
    
    public static void disablePolygonOffset() {
        GlStateManager.polygonOffsetState.field_179044_a.setDisabled();
    }
    
    public static void enableBlend() {
        GlStateManager.blendState.field_179213_a.setEnabled();
    }
    
    public static void func_179105_a(final TexGen lllllllllllllIIlIlIIllIllIlIlIll, final int lllllllllllllIIlIlIIllIllIlIlIlI, final FloatBuffer lllllllllllllIIlIlIIllIllIlIlIII) {
        GL11.glTexGen(texGenCoord(lllllllllllllIIlIlIIllIllIlIlIll).field_179065_b, lllllllllllllIIlIlIIllIllIlIlIlI, lllllllllllllIIlIlIIllIllIlIlIII);
    }
    
    public static void disableCull() {
        GlStateManager.cullState.field_179054_a.setDisabled();
    }
    
    public static void setFogStart(final float lllllllllllllIIlIlIIllIllllIIllI) {
        if (llIllIIllIllIll(llIllIIllIllllI(lllllllllllllIIlIlIIllIllllIIllI, GlStateManager.fogState.field_179045_d))) {
            GlStateManager.fogState.field_179045_d = lllllllllllllIIlIlIIllIllllIIllI;
            GL11.glFogf(GlStateManager.lIIllIllIIllll[10], lllllllllllllIIlIlIIllIllllIIllI);
        }
    }
    
    public static void enableTexture2D() {
        GlStateManager.textureState[GlStateManager.activeTextureUnit].texture2DState.setEnabled();
    }
    
    public static void deleteTexture(final int lllllllllllllIIlIlIIllIllIIIlIII) {
        GL11.glDeleteTextures(lllllllllllllIIlIlIIllIllIIIlIII);
        final short lllllllllllllIIlIlIIllIllIIIIlII;
        final boolean lllllllllllllIIlIlIIllIllIIIIlIl = ((TextureState[])(Object)(lllllllllllllIIlIlIIllIllIIIIlII = (short)(Object)GlStateManager.textureState)).length != 0;
        char lllllllllllllIIlIlIIllIllIIIIllI = (char)GlStateManager.lIIllIllIIllll[3];
        "".length();
        if (" ".length() <= 0) {
            return;
        }
        while (!llIllIIllIllIII(lllllllllllllIIlIlIIllIllIIIIllI, lllllllllllllIIlIlIIllIllIIIIlIl ? 1 : 0)) {
            final TextureState lllllllllllllIIlIlIIllIllIIIlIlI = lllllllllllllIIlIlIIllIllIIIIlII[lllllllllllllIIlIlIIllIllIIIIllI];
            if (llIllIIllIllIlI(lllllllllllllIIlIlIIllIllIIIlIlI.textureName, lllllllllllllIIlIlIIllIllIIIlIII)) {
                lllllllllllllIIlIlIIllIllIIIlIlI.textureName = GlStateManager.lIIllIllIIllll[13];
            }
            ++lllllllllllllIIlIlIIllIllIIIIllI;
        }
    }
    
    public static int generateTexture() {
        return GL11.glGenTextures();
    }
    
    public static void tryBlendFuncSeparate(final int lllllllllllllIIlIlIIllIlllllIIlI, final int lllllllllllllIIlIlIIllIlllllIIIl, final int lllllllllllllIIlIlIIllIlllllIlII, final int lllllllllllllIIlIlIIllIlllllIIll) {
        if (!llIllIIllIllIlI(lllllllllllllIIlIlIIllIlllllIIlI, GlStateManager.blendState.srcFactor) || !llIllIIllIllIlI(lllllllllllllIIlIlIIllIlllllIIIl, GlStateManager.blendState.dstFactor) || !llIllIIllIllIlI(lllllllllllllIIlIlIIllIlllllIlII, GlStateManager.blendState.srcFactorAlpha) || llIllIIllIlllII(lllllllllllllIIlIlIIllIlllllIIll, GlStateManager.blendState.dstFactorAlpha)) {
            GlStateManager.blendState.srcFactor = lllllllllllllIIlIlIIllIlllllIIlI;
            GlStateManager.blendState.dstFactor = lllllllllllllIIlIlIIllIlllllIIIl;
            GlStateManager.blendState.srcFactorAlpha = lllllllllllllIIlIlIIllIlllllIlII;
            GlStateManager.blendState.dstFactorAlpha = lllllllllllllIIlIlIIllIlllllIIll;
            OpenGlHelper.glBlendFunc(lllllllllllllIIlIlIIllIlllllIIlI, lllllllllllllIIlIlIIllIlllllIIIl, lllllllllllllIIlIlIIllIlllllIlII, lllllllllllllIIlIlIIllIlllllIIll);
        }
    }
    
    public static void alphaFunc(final int lllllllllllllIIlIlIIlllIIIIlIllI, final float lllllllllllllIIlIlIIlllIIIIlIlIl) {
        if (!llIllIIllIllIlI(lllllllllllllIIlIlIIlllIIIIlIllI, GlStateManager.alphaState.func) || llIllIIllIllIll(llIllIIllIllIIl(lllllllllllllIIlIlIIlllIIIIlIlIl, GlStateManager.alphaState.ref))) {
            GlStateManager.alphaState.func = lllllllllllllIIlIlIIlllIIIIlIllI;
            GlStateManager.alphaState.ref = lllllllllllllIIlIlIIlllIIIIlIlIl;
            GL11.glAlphaFunc(lllllllllllllIIlIlIIlllIIIIlIllI, lllllllllllllIIlIlIIlllIIIIlIlIl);
        }
    }
    
    public static void enablePolygonOffset() {
        GlStateManager.polygonOffsetState.field_179044_a.setEnabled();
    }
    
    public static void disableAlpha() {
        GlStateManager.alphaState.field_179208_a.setDisabled();
    }
    
    public static void disableLight(final int lllllllllllllIIlIlIIlllIIIIIlllI) {
        GlStateManager.lightState[lllllllllllllIIlIlIIlllIIIIIlllI].setDisabled();
    }
    
    public static void callList(final int lllllllllllllIIlIlIIllIIlllIllll) {
        GL11.glCallList(lllllllllllllIIlIlIIllIIlllIllll);
    }
    
    public static void scale(final double lllllllllllllIIlIlIIllIlIIIlllIl, final double lllllllllllllIIlIlIIllIlIIIlllII, final double lllllllllllllIIlIlIIllIlIIIllIll) {
        GL11.glScaled(lllllllllllllIIlIlIIllIlIIIlllIl, lllllllllllllIIlIlIIllIlIIIlllII, lllllllllllllIIlIlIIllIlIIIllIll);
    }
    
    public static void colorMask(final boolean lllllllllllllIIlIlIIllIlIllIllIl, final boolean lllllllllllllIIlIlIIllIlIllIlIII, final boolean lllllllllllllIIlIlIIllIlIllIlIll, final boolean lllllllllllllIIlIlIIllIlIllIIllI) {
        if (!llIllIIllIllIlI(lllllllllllllIIlIlIIllIlIllIllIl ? 1 : 0, GlStateManager.colorMaskState.red ? 1 : 0) || !llIllIIllIllIlI(lllllllllllllIIlIlIIllIlIllIlIII ? 1 : 0, GlStateManager.colorMaskState.green ? 1 : 0) || !llIllIIllIllIlI(lllllllllllllIIlIlIIllIlIllIlIll ? 1 : 0, GlStateManager.colorMaskState.blue ? 1 : 0) || llIllIIllIlllII(lllllllllllllIIlIlIIllIlIllIIllI ? 1 : 0, GlStateManager.colorMaskState.alpha ? 1 : 0)) {
            GlStateManager.colorMaskState.red = lllllllllllllIIlIlIIllIlIllIllIl;
            GlStateManager.colorMaskState.green = lllllllllllllIIlIlIIllIlIllIlIII;
            GlStateManager.colorMaskState.blue = lllllllllllllIIlIlIIllIlIllIlIll;
            GlStateManager.colorMaskState.alpha = lllllllllllllIIlIlIIllIlIllIIllI;
            GL11.glColorMask(lllllllllllllIIlIlIIllIlIllIllIl, lllllllllllllIIlIlIIllIlIllIlIII, lllllllllllllIIlIlIIllIlIllIlIll, lllllllllllllIIlIlIIllIlIllIIllI);
        }
    }
    
    public static void enableAlpha() {
        GlStateManager.alphaState.field_179208_a.setEnabled();
    }
    
    public static void depthFunc(final int lllllllllllllIIlIlIIlllIIIIIIlIl) {
        if (llIllIIllIlllII(lllllllllllllIIlIlIIlllIIIIIIlIl, GlStateManager.depthState.depthFunc)) {
            GlStateManager.depthState.depthFunc = lllllllllllllIIlIlIIlllIIIIIIlIl;
            GL11.glDepthFunc(lllllllllllllIIlIlIIlllIIIIIIlIl);
        }
    }
    
    public static void getFloat(final int lllllllllllllIIlIlIIllIlIlIIllII, final FloatBuffer lllllllllllllIIlIlIIllIlIlIIllIl) {
        GL11.glGetFloat(lllllllllllllIIlIlIIllIlIlIIllII, lllllllllllllIIlIlIIllIlIlIIllIl);
    }
    
    public static void enableDepth() {
        GlStateManager.depthState.depthTest.setEnabled();
    }
    
    public static void resetColor() {
        final Color colorState = GlStateManager.colorState;
        final Color colorState2 = GlStateManager.colorState;
        final Color colorState3 = GlStateManager.colorState;
        final Color colorState4 = GlStateManager.colorState;
        final float n = -1.0f;
        colorState4.alpha = n;
        colorState3.blue = n;
        colorState2.green = n;
        colorState.red = n;
    }
    
    private static boolean llIllIIlllIIlIl(final Object lllllllllllllIIlIlIIllIIlllIIIlI) {
        return lllllllllllllIIlIlIIllIIlllIIIlI != null;
    }
    
    public static void enableFog() {
        GlStateManager.fogState.field_179049_a.setEnabled();
    }
    
    public static void disableColorMaterial() {
        GlStateManager.colorMaterialState.field_179191_a.setDisabled();
    }
    
    static {
        llIllIIllIlIlll();
        GlStateManager.alphaState = new AlphaState(null);
        GlStateManager.lightingState = new BooleanState(GlStateManager.lIIllIllIIllll[0]);
        GlStateManager.lightState = new BooleanState[GlStateManager.lIIllIllIIllll[1]];
        GlStateManager.colorMaterialState = new ColorMaterialState(null);
        GlStateManager.blendState = new BlendState(null);
        GlStateManager.depthState = new DepthState(null);
        GlStateManager.fogState = new FogState(null);
        GlStateManager.cullState = new CullState(null);
        GlStateManager.polygonOffsetState = new PolygonOffsetState(null);
        GlStateManager.colorLogicState = new ColorLogicState(null);
        GlStateManager.texGenState = new TexGenState(null);
        GlStateManager.clearState = new ClearState(null);
        GlStateManager.stencilState = new StencilState(null);
        GlStateManager.normalizeState = new BooleanState(GlStateManager.lIIllIllIIllll[2]);
        GlStateManager.activeTextureUnit = GlStateManager.lIIllIllIIllll[3];
        GlStateManager.textureState = new TextureState[GlStateManager.lIIllIllIIllll[1]];
        GlStateManager.activeShadeModel = GlStateManager.lIIllIllIIllll[4];
        GlStateManager.rescaleNormalState = new BooleanState(GlStateManager.lIIllIllIIllll[5]);
        GlStateManager.colorMaskState = new ColorMask(null);
        GlStateManager.colorState = new Color();
        int lllllllllllllIIlIlIIlllIIIIllllI = GlStateManager.lIIllIllIIllll[3];
        "".length();
        if ((0x38 ^ 0x3D) == 0x0) {
            return;
        }
        while (!llIllIIllIllIII(lllllllllllllIIlIlIIlllIIIIllllI, GlStateManager.lIIllIllIIllll[1])) {
            GlStateManager.lightState[lllllllllllllIIlIlIIlllIIIIllllI] = new BooleanState(GlStateManager.lIIllIllIIllll[6] + lllllllllllllIIlIlIIlllIIIIllllI);
            ++lllllllllllllIIlIlIIlllIIIIllllI;
        }
        int lllllllllllllIIlIlIIlllIIIIlllIl = GlStateManager.lIIllIllIIllll[3];
        "".length();
        if (" ".length() == (0x6E ^ 0x6A)) {
            return;
        }
        while (!llIllIIllIllIII(lllllllllllllIIlIlIIlllIIIIlllIl, GlStateManager.lIIllIllIIllll[1])) {
            GlStateManager.textureState[lllllllllllllIIlIlIIlllIIIIlllIl] = new TextureState(null);
            ++lllllllllllllIIlIlIIlllIIIIlllIl;
        }
    }
    
    public static void colorLogicOp(final int lllllllllllllIIlIlIIllIlllIlIlIl) {
        if (llIllIIllIlllII(lllllllllllllIIlIlIIllIlllIlIlIl, GlStateManager.colorLogicState.field_179196_b)) {
            GlStateManager.colorLogicState.field_179196_b = lllllllllllllIIlIlIIllIlllIlIlIl;
            GL11.glLogicOp(lllllllllllllIIlIlIIllIlllIlIlIl);
        }
    }
    
    private static boolean llIllIIllIllIlI(final int lllllllllllllIIlIlIIllIIlllIlIIl, final int lllllllllllllIIlIlIIllIIlllIlIII) {
        return lllllllllllllIIlIlIIllIIlllIlIIl == lllllllllllllIIlIlIIllIIlllIlIII;
    }
    
    private static int llIllIIlllIIIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public static void setFogDensity(final float lllllllllllllIIlIlIIllIllllIlIIl) {
        if (llIllIIllIllIll(llIllIIllIlllIl(lllllllllllllIIlIlIIllIllllIlIIl, GlStateManager.fogState.field_179048_c))) {
            GlStateManager.fogState.field_179048_c = lllllllllllllIIlIlIIllIllllIlIIl;
            GL11.glFogf(GlStateManager.lIIllIllIIllll[9], lllllllllllllIIlIlIIllIllllIlIIl);
        }
    }
    
    public static void pushMatrix() {
        GL11.glPushMatrix();
    }
    
    private static boolean llIllIIlllIIIIl(final int lllllllllllllIIlIlIIllIIllIllllI) {
        return lllllllllllllIIlIlIIllIIllIllllI == 0;
    }
    
    public static void disableFog() {
        GlStateManager.fogState.field_179049_a.setDisabled();
    }
    
    public static void enableLighting() {
        GlStateManager.lightingState.setEnabled();
    }
    
    public static void multMatrix(final FloatBuffer lllllllllllllIIlIlIIllIlIIIIIllI) {
        GL11.glMultMatrix(lllllllllllllIIlIlIIllIlIIIIIllI);
    }
    
    public static void setActiveTexture(final int lllllllllllllIIlIlIIllIllIIllIll) {
        if (llIllIIllIlllII(GlStateManager.activeTextureUnit, lllllllllllllIIlIlIIllIllIIllIll - OpenGlHelper.defaultTexUnit)) {
            GlStateManager.activeTextureUnit = lllllllllllllIIlIlIIllIllIIllIll - OpenGlHelper.defaultTexUnit;
            OpenGlHelper.setActiveTexture(lllllllllllllIIlIlIIllIllIIllIll);
        }
    }
    
    public static void viewport(final int lllllllllllllIIlIlIIllIlIlllIlIl, final int lllllllllllllIIlIlIIllIlIlllIlII, final int lllllllllllllIIlIlIIllIlIlllIlll, final int lllllllllllllIIlIlIIllIlIlllIllI) {
        GL11.glViewport(lllllllllllllIIlIlIIllIlIlllIlIl, lllllllllllllIIlIlIIllIlIlllIlII, lllllllllllllIIlIlIIllIlIlllIlll, lllllllllllllIIlIlIIllIlIlllIllI);
    }
    
    private static int llIllIIllIllIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public static void scale(final float lllllllllllllIIlIlIIllIlIIlIlIIl, final float lllllllllllllIIlIlIIllIlIIlIIlIl, final float lllllllllllllIIlIlIIllIlIIlIIlII) {
        GL11.glScalef(lllllllllllllIIlIlIIllIlIIlIlIIl, lllllllllllllIIlIlIIllIlIIlIIlIl, lllllllllllllIIlIlIIllIlIIlIIlII);
    }
    
    public static void translate(final double lllllllllllllIIlIlIIllIlIIIIlllI, final double lllllllllllllIIlIlIIllIlIIIIllIl, final double lllllllllllllIIlIlIIllIlIIIIlIIl) {
        GL11.glTranslated(lllllllllllllIIlIlIIllIlIIIIlllI, lllllllllllllIIlIlIIllIlIIIIllIl, lllllllllllllIIlIlIIllIlIIIIlIIl);
    }
    
    public static void texGen(final TexGen lllllllllllllIIlIlIIllIllIlllIIl, final int lllllllllllllIIlIlIIllIllIlllIII) {
        final TexGenCoord lllllllllllllIIlIlIIllIllIlllIlI = texGenCoord(lllllllllllllIIlIlIIllIllIlllIIl);
        if (llIllIIllIlllII(lllllllllllllIIlIlIIllIllIlllIII, lllllllllllllIIlIlIIllIllIlllIlI.field_179066_c)) {
            lllllllllllllIIlIlIIllIllIlllIlI.field_179066_c = lllllllllllllIIlIlIIllIllIlllIII;
            GL11.glTexGeni(lllllllllllllIIlIlIIllIllIlllIlI.field_179065_b, GlStateManager.lIIllIllIIllll[12], lllllllllllllIIlIlIIllIllIlllIII);
        }
    }
    
    public static void matrixMode(final int lllllllllllllIIlIlIIllIlIlIlIIlI) {
        GL11.glMatrixMode(lllllllllllllIIlIlIIllIlIlIlIIlI);
    }
    
    public static void clearDepth(final double lllllllllllllIIlIlIIllIlIllIIIll) {
        if (llIllIIllIllIll(llIllIIlllIIIlI(lllllllllllllIIlIlIIllIlIllIIIll, GlStateManager.clearState.field_179205_a))) {
            GlStateManager.clearState.field_179205_a = lllllllllllllIIlIlIIllIlIllIIIll;
            GL11.glClearDepth(lllllllllllllIIlIlIIllIlIllIIIll);
        }
    }
    
    public static void bindTexture(final int lllllllllllllIIlIlIIllIllIIIIIIl) {
        if (llIllIIllIlllII(lllllllllllllIIlIlIIllIllIIIIIIl, GlStateManager.textureState[GlStateManager.activeTextureUnit].textureName)) {
            GlStateManager.textureState[GlStateManager.activeTextureUnit].textureName = lllllllllllllIIlIlIIllIllIIIIIIl;
            GL11.glBindTexture(GlStateManager.lIIllIllIIllll[14], lllllllllllllIIlIlIIllIllIIIIIIl);
        }
    }
    
    public static void disableDepth() {
        GlStateManager.depthState.depthTest.setDisabled();
    }
    
    public static void pushAttrib() {
        GL11.glPushAttrib(GlStateManager.lIIllIllIIllll[7]);
    }
    
    public static void enableRescaleNormal() {
        GlStateManager.rescaleNormalState.setEnabled();
    }
    
    private static void llIllIIllIlIlll() {
        (lIIllIllIIllll = new int[19])[0] = (-(0xFFFFF5AF & 0x7EF7) & (0xFFFFFFF7 & 0x7FFE));
        GlStateManager.lIIllIllIIllll[1] = (0xC9 ^ 0xC1);
        GlStateManager.lIIllIllIIllll[2] = (0xFFFFFFEB & 0xBB5);
        GlStateManager.lIIllIllIIllll[3] = ((0x4A ^ 0x8) & ~(0x81 ^ 0xC3));
        GlStateManager.lIIllIllIIllll[4] = (-(0xFFFFEEFF & 0x33E7) & (-1 & 0x3FE7));
        GlStateManager.lIIllIllIIllll[5] = (0xFFFFF4BA & 0x8B7F);
        GlStateManager.lIIllIllIIllll[6] = (0xFFFFEFC4 & 0x503B);
        GlStateManager.lIIllIllIIllll[7] = (0xFFFFB979 & 0x66C6);
        GlStateManager.lIIllIllIIllll[8] = (-(0xFFFFE2B3 & 0x5DDF) & (0xFFFFDBF7 & 0x6FFF));
        GlStateManager.lIIllIllIIllll[9] = (-(0xFFFFE45D & 0x3FBF) & (0xFFFFFFFE & 0x2F7F));
        GlStateManager.lIIllIllIIllll[10] = (-(0xFFFFB5E9 & 0x6E1F) & (0xFFFFAF6F & 0x7FFB));
        GlStateManager.lIIllIllIIllll[11] = (-(0xFFFFB0DD & 0x7FBE) & (0xFFFFBFFF & 0x7BFF));
        GlStateManager.lIIllIllIIllll[12] = (0xFFFFAFF0 & 0x750F);
        GlStateManager.lIIllIllIIllll[13] = -" ".length();
        GlStateManager.lIIllIllIIllll[14] = (0xFFFFBDFD & 0x4FE3);
        GlStateManager.lIIllIllIIllll[15] = (0x93 ^ 0x97);
        GlStateManager.lIIllIllIIllll[16] = "   ".length();
        GlStateManager.lIIllIllIIllll[17] = " ".length();
        GlStateManager.lIIllIllIIllll[18] = "  ".length();
    }
    
    public static void clearColor(final float lllllllllllllIIlIlIIllIlIlIllllI, final float lllllllllllllIIlIlIIllIlIlIllIIl, final float lllllllllllllIIlIlIIllIlIlIlllII, final float lllllllllllllIIlIlIIllIlIlIllIll) {
        if (!llIllIIlllIIIIl(llIllIIlllIIIll(lllllllllllllIIlIlIIllIlIlIllllI, GlStateManager.clearState.field_179203_b.red)) || !llIllIIlllIIIIl(llIllIIlllIIIll(lllllllllllllIIlIlIIllIlIlIllIIl, GlStateManager.clearState.field_179203_b.green)) || !llIllIIlllIIIIl(llIllIIlllIIIll(lllllllllllllIIlIlIIllIlIlIlllII, GlStateManager.clearState.field_179203_b.blue)) || llIllIIllIllIll(llIllIIlllIIIll(lllllllllllllIIlIlIIllIlIlIllIll, GlStateManager.clearState.field_179203_b.alpha))) {
            GlStateManager.clearState.field_179203_b.red = lllllllllllllIIlIlIIllIlIlIllllI;
            GlStateManager.clearState.field_179203_b.green = lllllllllllllIIlIlIIllIlIlIllIIl;
            GlStateManager.clearState.field_179203_b.blue = lllllllllllllIIlIlIIllIlIlIlllII;
            GlStateManager.clearState.field_179203_b.alpha = lllllllllllllIIlIlIIllIlIlIllIll;
            GL11.glClearColor(lllllllllllllIIlIlIIllIlIlIllllI, lllllllllllllIIlIlIIllIlIlIllIIl, lllllllllllllIIlIlIIllIlIlIlllII, lllllllllllllIIlIlIIllIlIlIllIll);
        }
    }
    
    public static void translate(final float lllllllllllllIIlIlIIllIlIIIlIlll, final float lllllllllllllIIlIlIIllIlIIIlIllI, final float lllllllllllllIIlIlIIllIlIIIlIlIl) {
        GL11.glTranslatef(lllllllllllllIIlIlIIllIlIIIlIlll, lllllllllllllIIlIlIIllIlIIIlIllI, lllllllllllllIIlIlIIllIlIIIlIlIl);
    }
    
    private static int llIllIIlllIIIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public static void disableBlend() {
        GlStateManager.blendState.field_179213_a.setDisabled();
    }
    
    public static void enableNormalize() {
        GlStateManager.normalizeState.setEnabled();
    }
    
    public static void color(final float lllllllllllllIIlIlIIllIIllllIllI, final float lllllllllllllIIlIlIIllIIllllIlIl, final float lllllllllllllIIlIlIIllIIllllIlII) {
        color(lllllllllllllIIlIlIIllIIllllIllI, lllllllllllllIIlIlIIllIIllllIlIl, lllllllllllllIIlIlIIllIIllllIlII, 1.0f);
    }
    
    private static int llIllIIllIlllll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public static void doPolygonOffset(final float lllllllllllllIIlIlIIllIlllIllIll, final float lllllllllllllIIlIlIIllIlllIlllII) {
        if (!llIllIIlllIIIIl(llIllIIlllIIIII(lllllllllllllIIlIlIIllIlllIllIll, GlStateManager.polygonOffsetState.field_179043_c)) || llIllIIllIllIll(llIllIIlllIIIII(lllllllllllllIIlIlIIllIlllIlllII, GlStateManager.polygonOffsetState.field_179041_d))) {
            GlStateManager.polygonOffsetState.field_179043_c = lllllllllllllIIlIlIIllIlllIllIll;
            GlStateManager.polygonOffsetState.field_179041_d = lllllllllllllIIlIlIIllIlllIlllII;
            GL11.glPolygonOffset(lllllllllllllIIlIlIIllIlllIllIll, lllllllllllllIIlIlIIllIlllIlllII);
        }
    }
    
    public static void shadeModel(final int lllllllllllllIIlIlIIllIlIlllllll) {
        if (llIllIIllIlllII(lllllllllllllIIlIlIIllIlIlllllll, GlStateManager.activeShadeModel)) {
            GL11.glShadeModel(GlStateManager.activeShadeModel = lllllllllllllIIlIlIIllIlIlllllll);
        }
    }
    
    public static void disableNormalize() {
        GlStateManager.normalizeState.setDisabled();
    }
    
    public static void depthMask(final boolean lllllllllllllIIlIlIIlllIIIIIIIIl) {
        if (llIllIIllIlllII(lllllllllllllIIlIlIIlllIIIIIIIIl ? 1 : 0, GlStateManager.depthState.maskEnabled ? 1 : 0)) {
            GlStateManager.depthState.maskEnabled = lllllllllllllIIlIlIIlllIIIIIIIIl;
            GL11.glDepthMask(lllllllllllllIIlIlIIlllIIIIIIIIl);
        }
    }
    
    private static boolean llIllIIllIlllII(final int lllllllllllllIIlIlIIllIIllIllIll, final int lllllllllllllIIlIlIIllIIllIllIlI) {
        return lllllllllllllIIlIlIIllIIllIllIll != lllllllllllllIIlIlIIllIIllIllIlI;
    }
    
    public static void disableTexGenCoord(final TexGen lllllllllllllIIlIlIIllIlllIIlIII) {
        texGenCoord(lllllllllllllIIlIlIIllIlllIIlIII).field_179067_a.setDisabled();
    }
    
    public static void enableColorMaterial() {
        GlStateManager.colorMaterialState.field_179191_a.setEnabled();
    }
    
    public static void popMatrix() {
        GL11.glPopMatrix();
    }
    
    private static boolean llIllIIllIllIll(final int lllllllllllllIIlIlIIllIIlllIIIII) {
        return lllllllllllllIIlIlIIllIIlllIIIII != 0;
    }
    
    public static void setFog(final int lllllllllllllIIlIlIIllIllllIllIl) {
        if (llIllIIllIlllII(lllllllllllllIIlIlIIllIllllIllIl, GlStateManager.fogState.field_179047_b)) {
            GlStateManager.fogState.field_179047_b = lllllllllllllIIlIlIIllIllllIllIl;
            GL11.glFogi(GlStateManager.lIIllIllIIllll[8], lllllllllllllIIlIlIIllIllllIllIl);
        }
    }
    
    public static void loadIdentity() {
        GL11.glLoadIdentity();
    }
    
    public static void blendFunc(final int lllllllllllllIIlIlIIllIlllllllII, final int lllllllllllllIIlIlIIllIlllllllIl) {
        if (!llIllIIllIllIlI(lllllllllllllIIlIlIIllIlllllllII, GlStateManager.blendState.srcFactor) || llIllIIllIlllII(lllllllllllllIIlIlIIllIlllllllIl, GlStateManager.blendState.dstFactor)) {
            GlStateManager.blendState.srcFactor = lllllllllllllIIlIlIIllIlllllllII;
            GlStateManager.blendState.dstFactor = lllllllllllllIIlIlIIllIlllllllIl;
            GL11.glBlendFunc(lllllllllllllIIlIlIIllIlllllllII, lllllllllllllIIlIlIIllIlllllllIl);
        }
    }
    
    private static int llIllIIlllIIlII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public static void ortho(final double lllllllllllllIIlIlIIllIlIlIIIlII, final double lllllllllllllIIlIlIIllIlIlIIIIll, final double lllllllllllllIIlIlIIllIlIlIIIIlI, final double lllllllllllllIIlIlIIllIlIIlllIll, final double lllllllllllllIIlIlIIllIlIlIIIIII, final double lllllllllllllIIlIlIIllIlIIllllll) {
        GL11.glOrtho(lllllllllllllIIlIlIIllIlIlIIIlII, lllllllllllllIIlIlIIllIlIlIIIIll, lllllllllllllIIlIlIIllIlIlIIIIlI, lllllllllllllIIlIlIIllIlIIlllIll, lllllllllllllIIlIlIIllIlIlIIIIII, lllllllllllllIIlIlIIllIlIIllllll);
    }
    
    private static int llIllIIllIllllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public static void popAttrib() {
        GL11.glPopAttrib();
    }
    
    public static void disableRescaleNormal() {
        GlStateManager.rescaleNormalState.setDisabled();
    }
    
    public static void enableColorLogic() {
        GlStateManager.colorLogicState.field_179197_a.setEnabled();
    }
    
    public static void disableTexture2D() {
        GlStateManager.textureState[GlStateManager.activeTextureUnit].texture2DState.setDisabled();
    }
    
    private static int llIllIIlllIIIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$client$renderer$GlStateManager$TexGen() {
        final int[] $switch_TABLE$net$minecraft$client$renderer$GlStateManager$TexGen = GlStateManager.$SWITCH_TABLE$net$minecraft$client$renderer$GlStateManager$TexGen;
        if (llIllIIlllIIlIl($switch_TABLE$net$minecraft$client$renderer$GlStateManager$TexGen)) {
            return $switch_TABLE$net$minecraft$client$renderer$GlStateManager$TexGen;
        }
        "".length();
        final double lllllllllllllIIlIlIIllIIlllIllII = (Object)new int[TexGen.values().length];
        try {
            lllllllllllllIIlIlIIllIIlllIllII[TexGen.Q.ordinal()] = GlStateManager.lIIllIllIIllll[15];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIlIlIIllIIlllIllII[TexGen.R.ordinal()] = GlStateManager.lIIllIllIIllll[16];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIlIlIIllIIlllIllII[TexGen.S.ordinal()] = GlStateManager.lIIllIllIIllll[17];
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIIlIlIIllIIlllIllII[TexGen.T.ordinal()] = GlStateManager.lIIllIllIIllll[18];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        return GlStateManager.$SWITCH_TABLE$net$minecraft$client$renderer$GlStateManager$TexGen = (int[])(Object)lllllllllllllIIlIlIIllIIlllIllII;
    }
    
    public static void color(final float lllllllllllllIIlIlIIllIlIIIIIIIl, final float lllllllllllllIIlIlIIllIlIIIIIIII, final float lllllllllllllIIlIlIIllIIllllllll, final float lllllllllllllIIlIlIIllIIlllllllI) {
        if (!llIllIIlllIIIIl(llIllIIlllIIlII(lllllllllllllIIlIlIIllIlIIIIIIIl, GlStateManager.colorState.red)) || !llIllIIlllIIIIl(llIllIIlllIIlII(lllllllllllllIIlIlIIllIlIIIIIIII, GlStateManager.colorState.green)) || !llIllIIlllIIIIl(llIllIIlllIIlII(lllllllllllllIIlIlIIllIIllllllll, GlStateManager.colorState.blue)) || llIllIIllIllIll(llIllIIlllIIlII(lllllllllllllIIlIlIIllIIlllllllI, GlStateManager.colorState.alpha))) {
            GlStateManager.colorState.red = lllllllllllllIIlIlIIllIlIIIIIIIl;
            GlStateManager.colorState.green = lllllllllllllIIlIlIIllIlIIIIIIII;
            GlStateManager.colorState.blue = lllllllllllllIIlIlIIllIIllllllll;
            GlStateManager.colorState.alpha = lllllllllllllIIlIlIIllIIlllllllI;
            GL11.glColor4f(lllllllllllllIIlIlIIllIlIIIIIIIl, lllllllllllllIIlIlIIllIlIIIIIIII, lllllllllllllIIlIlIIllIIllllllll, lllllllllllllIIlIlIIllIIlllllllI);
        }
    }
    
    public static void setFogEnd(final float lllllllllllllIIlIlIIllIllllIIIll) {
        if (llIllIIllIllIll(llIllIIllIlllll(lllllllllllllIIlIlIIllIllllIIIll, GlStateManager.fogState.field_179046_e))) {
            GlStateManager.fogState.field_179046_e = lllllllllllllIIlIlIIllIllllIIIll;
            GL11.glFogf(GlStateManager.lIIllIllIIllll[11], lllllllllllllIIlIlIIllIllllIIIll);
        }
    }
    
    public static void enableTexGenCoord(final TexGen lllllllllllllIIlIlIIllIlllIIllIl) {
        texGenCoord(lllllllllllllIIlIlIIllIlllIIllIl).field_179067_a.setEnabled();
    }
    
    public static void enableCull() {
        GlStateManager.cullState.field_179054_a.setEnabled();
    }
    
    public static void enableLight(final int lllllllllllllIIlIlIIlllIIIIlIIII) {
        GlStateManager.lightState[lllllllllllllIIlIlIIlllIIIIlIIII].setEnabled();
    }
    
    private static int llIllIIllIlllIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public static void clear(final int lllllllllllllIIlIlIIllIlIlIlIlII) {
        GL11.glClear(lllllllllllllIIlIlIIllIlIlIlIlII);
    }
    
    public static void cullFace(final int lllllllllllllIIlIlIIllIllllIIIIl) {
        if (llIllIIllIlllII(lllllllllllllIIlIlIIllIllllIIIIl, GlStateManager.cullState.field_179053_b)) {
            GlStateManager.cullState.field_179053_b = lllllllllllllIIlIlIIllIllllIIIIl;
            GL11.glCullFace(lllllllllllllIIlIlIIllIllllIIIIl);
        }
    }
    
    static class ColorLogicState
    {
        private static final /* synthetic */ int[] lIllIIlIIlIIll;
        public /* synthetic */ BooleanState field_179197_a;
        public /* synthetic */ int field_179196_b;
        
        static {
            lllllIIllIIIlII();
        }
        
        private ColorLogicState() {
            this.field_179197_a = new BooleanState(ColorLogicState.lIllIIlIIlIIll[0]);
            this.field_179196_b = ColorLogicState.lIllIIlIIlIIll[1];
        }
        
        private static void lllllIIllIIIlII() {
            (lIllIIlIIlIIll = new int[2])[0] = (0xFFFF9FFB & 0x6BF6);
            ColorLogicState.lIllIIlIIlIIll[1] = (0xFFFFFF77 & 0x158B);
        }
    }
    
    static class BooleanState
    {
        private final /* synthetic */ int capability;
        private static final /* synthetic */ int[] lllIIllIIIIlIl;
        private /* synthetic */ boolean currentState;
        
        public void setDisabled() {
            this.setState((boolean)(BooleanState.lllIIllIIIIlIl[0] != 0));
        }
        
        public BooleanState(final int llllllllllllIlIllllIIIllIlllIIll) {
            this.currentState = (BooleanState.lllIIllIIIIlIl[0] != 0);
            this.capability = llllllllllllIlIllllIIIllIlllIIll;
        }
        
        public void setEnabled() {
            this.setState((boolean)(BooleanState.lllIIllIIIIlIl[1] != 0));
        }
        
        private static void lIlIIIIIIIIIlllI() {
            (lllIIllIIIIlIl = new int[2])[0] = ((0xFC ^ 0xC1) & ~(0x84 ^ 0xB9));
            BooleanState.lllIIllIIIIlIl[1] = " ".length();
        }
        
        private static boolean lIlIIIIIIIIlIIII(final int llllllllllllIlIllllIIIllIllIIlIl) {
            return llllllllllllIlIllllIIIllIllIIlIl != 0;
        }
        
        public void setState(final boolean llllllllllllIlIllllIIIllIllIIlll) {
            if (lIlIIIIIIIIIllll(llllllllllllIlIllllIIIllIllIIlll ? 1 : 0, this.currentState ? 1 : 0)) {
                this.currentState = llllllllllllIlIllllIIIllIllIIlll;
                if (lIlIIIIIIIIlIIII(llllllllllllIlIllllIIIllIllIIlll ? 1 : 0)) {
                    GL11.glEnable(this.capability);
                    "".length();
                    if (-(146 + 26 - 163 + 181 ^ 70 + 129 - 149 + 137) >= 0) {
                        return;
                    }
                }
                else {
                    GL11.glDisable(this.capability);
                }
            }
        }
        
        static {
            lIlIIIIIIIIIlllI();
        }
        
        private static boolean lIlIIIIIIIIIllll(final int llllllllllllIlIllllIIIllIllIIIlI, final int llllllllllllIlIllllIIIllIllIIIIl) {
            return llllllllllllIlIllllIIIllIllIIIlI != llllllllllllIlIllllIIIllIllIIIIl;
        }
    }
    
    static class StencilFunc
    {
        private static final /* synthetic */ int[] lIlllIlIllIIlI;
        public /* synthetic */ int field_179080_c;
        public /* synthetic */ int field_179079_b;
        public /* synthetic */ int field_179081_a;
        
        private static void lIIIIIlIlllIIlll() {
            (lIlllIlIllIIlI = new int[3])[0] = (-(0xFFFFE7B1 & 0x5CFF) & (0xFFFFDFFF & 0x66B7));
            StencilFunc.lIlllIlIllIIlI[1] = ((95 + 97 - 153 + 154 ^ 102 + 151 - 196 + 106) & (0xFD ^ 0xC4 ^ (0xD8 ^ 0x83) ^ -" ".length()));
            StencilFunc.lIlllIlIllIIlI[2] = -" ".length();
        }
        
        static {
            lIIIIIlIlllIIlll();
        }
        
        private StencilFunc() {
            this.field_179081_a = StencilFunc.lIlllIlIllIIlI[0];
            this.field_179079_b = StencilFunc.lIlllIlIllIIlI[1];
            this.field_179080_c = StencilFunc.lIlllIlIllIIlI[2];
        }
    }
    
    static class FogState
    {
        public /* synthetic */ BooleanState field_179049_a;
        public /* synthetic */ float field_179048_c;
        public /* synthetic */ float field_179045_d;
        public /* synthetic */ float field_179046_e;
        private static final /* synthetic */ int[] lIlIIlIllIIIll;
        public /* synthetic */ int field_179047_b;
        
        private static void lllIIllIlIIIIlI() {
            (lIlIIlIllIIIll = new int[2])[0] = (-(0xFFFFFD9D & 0x227B) & (0xFFFFFB79 & 0x2FFE));
            FogState.lIlIIlIllIIIll[1] = (0xFFFFA9C1 & 0x5E3E);
        }
        
        private FogState() {
            this.field_179049_a = new BooleanState(FogState.lIlIIlIllIIIll[0]);
            this.field_179047_b = FogState.lIlIIlIllIIIll[1];
            this.field_179048_c = 1.0f;
            this.field_179045_d = 0.0f;
            this.field_179046_e = 1.0f;
        }
        
        static {
            lllIIllIlIIIIlI();
        }
    }
    
    static class AlphaState
    {
        public /* synthetic */ float ref;
        public /* synthetic */ int func;
        private static final /* synthetic */ int[] llIllIllIlIlII;
        public /* synthetic */ BooleanState field_179208_a;
        
        private static void lIIllIIIIlIIIlll() {
            (llIllIllIlIlII = new int[2])[0] = (-(0xFFFFB41E & 0x7FEF) & (0xFFFFBFCD & 0x7FFF));
            AlphaState.llIllIllIlIlII[1] = (-(0xFFFFB923 & 0x56FD) & (0xFFFFBA27 & 0x57FF));
        }
        
        private AlphaState() {
            this.field_179208_a = new BooleanState(AlphaState.llIllIllIlIlII[0]);
            this.func = AlphaState.llIllIllIlIlII[1];
            this.ref = -1.0f;
        }
        
        static {
            lIIllIIIIlIIIlll();
        }
    }
    
    static class DepthState
    {
        public /* synthetic */ boolean maskEnabled;
        public /* synthetic */ int depthFunc;
        public /* synthetic */ BooleanState depthTest;
        private static final /* synthetic */ int[] llIIIllIIIIIII;
        
        private DepthState() {
            this.depthTest = new BooleanState(DepthState.llIIIllIIIIIII[0]);
            this.maskEnabled = (DepthState.llIIIllIIIIIII[1] != 0);
            this.depthFunc = DepthState.llIIIllIIIIIII[2];
        }
        
        static {
            lIIIlIIllllIIIlI();
        }
        
        private static void lIIIlIIllllIIIlI() {
            (llIIIllIIIIIII = new int[3])[0] = (0xFFFFDB73 & 0x2FFD);
            DepthState.llIIIllIIIIIII[1] = " ".length();
            DepthState.llIIIllIIIIIII[2] = (-(0xFFFFFCCB & 0x5FBD) & (0xFFFFDECF & 0x7FB9));
        }
    }
    
    static class TexGenCoord
    {
        public /* synthetic */ int field_179066_c;
        private static final /* synthetic */ int[] lIlllIllIllIII;
        public /* synthetic */ int field_179065_b;
        public /* synthetic */ BooleanState field_179067_a;
        
        public TexGenCoord(final int llllllllllllIllllIlllIIIIIIlIlII, final int llllllllllllIllllIlllIIIIIIlIllI) {
            this.field_179066_c = TexGenCoord.lIlllIllIllIII[0];
            this.field_179065_b = llllllllllllIllllIlllIIIIIIlIlII;
            this.field_179067_a = new BooleanState(llllllllllllIllllIlllIIIIIIlIllI);
        }
        
        private static void lIIIIIllIlIIlllI() {
            (lIlllIllIllIII = new int[1])[0] = -" ".length();
        }
        
        static {
            lIIIIIllIlIIlllI();
        }
    }
    
    static class TexGenState
    {
        public /* synthetic */ TexGenCoord field_179064_a;
        public /* synthetic */ TexGenCoord field_179061_d;
        public /* synthetic */ TexGenCoord field_179062_b;
        public /* synthetic */ TexGenCoord field_179063_c;
        private static final /* synthetic */ int[] lllIllIllIllII;
        
        static {
            lIlIIlIlIIlIIlIl();
        }
        
        private static void lIlIIlIlIIlIIlIl() {
            (lllIllIllIllII = new int[8])[0] = (0xFFFFBF1D & 0x60E2);
            TexGenState.lllIllIllIllII[1] = (-(0xFFFFFFE7 & 0x639B) & (0xFFFFFFEE & 0x6FF3));
            TexGenState.lllIllIllIllII[2] = (0xFFFFA529 & 0x7AD7);
            TexGenState.lllIllIllIllII[3] = (-(0xFFFFB397 & 0x5F7B) & (0xFFFFFF7B & 0x1FF7));
            TexGenState.lllIllIllIllII[4] = (-(0xFFFFFF8D & 0x4FF3) & (0xFFFFFFC6 & 0x6FBB));
            TexGenState.lllIllIllIllII[5] = (0xFFFFEF7F & 0x1CE2);
            TexGenState.lllIllIllIllII[6] = (-(0xFFFFF3DF & 0x1DFD) & (0xFFFFB1FF & 0x7FDF));
            TexGenState.lllIllIllIllII[7] = (0xFFFFECEF & 0x1F73);
        }
        
        private TexGenState() {
            this.field_179064_a = new TexGenCoord(TexGenState.lllIllIllIllII[0], TexGenState.lllIllIllIllII[1]);
            this.field_179062_b = new TexGenCoord(TexGenState.lllIllIllIllII[2], TexGenState.lllIllIllIllII[3]);
            this.field_179063_c = new TexGenCoord(TexGenState.lllIllIllIllII[4], TexGenState.lllIllIllIllII[5]);
            this.field_179061_d = new TexGenCoord(TexGenState.lllIllIllIllII[6], TexGenState.lllIllIllIllII[7]);
        }
    }
    
    public static class TextureState
    {
        private static final /* synthetic */ int[] lIlIIlIllIIllI;
        public /* synthetic */ int textureName;
        public /* synthetic */ BooleanState texture2DState;
        
        static {
            lllIIllIlIIIlII();
        }
        
        private static void lllIIllIlIIIlII() {
            (lIlIIlIllIIllI = new int[2])[0] = (-(0xFFFF9A1F & 0x77F7) & (0xFFFFBFFF & 0x5FF7));
            TextureState.lIlIIlIllIIllI[1] = ((0x3C ^ 0x6) & ~(0x14 ^ 0x2E));
        }
        
        private TextureState() {
            this.texture2DState = new BooleanState(TextureState.lIlIIlIllIIllI[0]);
            this.textureName = TextureState.lIlIIlIllIIllI[1];
        }
    }
    
    static class PolygonOffsetState
    {
        public /* synthetic */ BooleanState field_179042_b;
        public /* synthetic */ float field_179041_d;
        public /* synthetic */ BooleanState field_179044_a;
        public /* synthetic */ float field_179043_c;
        private static final /* synthetic */ int[] llIIllIllIllIl;
        
        private static void lIIIllllIIIllllI() {
            (llIIllIllIllIl = new int[2])[0] = (0xFFFFD1B7 & 0xAE7F);
            PolygonOffsetState.llIIllIllIllIl[1] = (-(0xFFFFDFAA & 0x6477) & (0xFFFFEFF3 & 0x7E2F));
        }
        
        static {
            lIIIllllIIIllllI();
        }
        
        private PolygonOffsetState() {
            this.field_179044_a = new BooleanState(PolygonOffsetState.llIIllIllIllIl[0]);
            this.field_179042_b = new BooleanState(PolygonOffsetState.llIIllIllIllIl[1]);
            this.field_179043_c = 0.0f;
            this.field_179041_d = 0.0f;
        }
    }
    
    static class BlendState
    {
        public /* synthetic */ BooleanState field_179213_a;
        public /* synthetic */ int srcFactorAlpha;
        public /* synthetic */ int dstFactor;
        private static final /* synthetic */ int[] llIllIIlllIlll;
        public /* synthetic */ int dstFactorAlpha;
        public /* synthetic */ int srcFactor;
        
        private static void lIIlIlllIlIIIIll() {
            (llIllIIlllIlll = new int[3])[0] = (-(0xFFFFB7AD & 0x5C53) & (0xFFFFFFFA & 0x1FE7));
            BlendState.llIllIIlllIlll[1] = " ".length();
            BlendState.llIllIIlllIlll[2] = ((0x49 ^ 0x55 ^ 22 + 74 + 23 + 8) & (24 + 85 - 37 + 183 ^ 23 + 99 - 94 + 128 ^ -" ".length()));
        }
        
        private BlendState() {
            this.field_179213_a = new BooleanState(BlendState.llIllIIlllIlll[0]);
            this.srcFactor = BlendState.llIllIIlllIlll[1];
            this.dstFactor = BlendState.llIllIIlllIlll[2];
            this.srcFactorAlpha = BlendState.llIllIIlllIlll[1];
            this.dstFactorAlpha = BlendState.llIllIIlllIlll[2];
        }
        
        static {
            lIIlIlllIlIIIIll();
        }
    }
    
    static class CullState
    {
        public /* synthetic */ int field_179053_b;
        public /* synthetic */ BooleanState field_179054_a;
        private static final /* synthetic */ int[] lIIllllIlIIIll;
        
        private CullState() {
            this.field_179054_a = new BooleanState(CullState.lIIllllIlIIIll[0]);
            this.field_179053_b = CullState.lIIllllIlIIIll[1];
        }
        
        private static void llIlllIlllIlllI() {
            (lIIllllIlIIIll = new int[2])[0] = (-(0xFFFFEEEE & 0x55B3) & (0xFFFFFFF5 & 0x4FEF));
            CullState.lIIllllIlIIIll[1] = (0xFFFFE41D & 0x1FE7);
        }
        
        static {
            llIlllIlllIlllI();
        }
    }
    
    static class Color
    {
        public /* synthetic */ float red;
        public /* synthetic */ float alpha;
        public /* synthetic */ float blue;
        public /* synthetic */ float green;
        
        public Color(final float llllllllllllIllllIlllIllllIIlIll, final float llllllllllllIllllIlllIllllIIIlIl, final float llllllllllllIllllIlllIllllIIlIIl, final float llllllllllllIllllIlllIllllIIIIll) {
            this.red = 1.0f;
            this.green = 1.0f;
            this.blue = 1.0f;
            this.alpha = 1.0f;
            this.red = llllllllllllIllllIlllIllllIIlIll;
            this.green = llllllllllllIllllIlllIllllIIIlIl;
            this.blue = llllllllllllIllllIlllIllllIIlIIl;
            this.alpha = llllllllllllIllllIlllIllllIIIIll;
        }
        
        public Color() {
            this.red = 1.0f;
            this.green = 1.0f;
            this.blue = 1.0f;
            this.alpha = 1.0f;
        }
    }
    
    static class ClearState
    {
        public /* synthetic */ double field_179205_a;
        public /* synthetic */ Color field_179203_b;
        public /* synthetic */ int field_179204_c;
        private static final /* synthetic */ int[] llIIllIlIIIIlI;
        
        private static void lIIIlllIllIIlIII() {
            (llIIllIlIIIIlI = new int[1])[0] = ((0x36 ^ 0x29) & ~(0xAA ^ 0xB5));
        }
        
        private ClearState() {
            this.field_179205_a = 1.0;
            this.field_179203_b = new Color(0.0f, 0.0f, 0.0f, 0.0f);
            this.field_179204_c = ClearState.llIIllIlIIIIlI[0];
        }
        
        static {
            lIIIlllIllIIlIII();
        }
    }
    
    public enum TexGen
    {
        private static final /* synthetic */ int[] lIIIIlllIIIIIl;
        private static final /* synthetic */ String[] lIIIIllIllllll;
        
        Q(TexGen.lIIIIllIllllll[TexGen.lIIIIlllIIIIIl[3]], TexGen.lIIIIlllIIIIIl[3]), 
        T(TexGen.lIIIIllIllllll[TexGen.lIIIIlllIIIIIl[1]], TexGen.lIIIIlllIIIIIl[1]), 
        S(TexGen.lIIIIllIllllll[TexGen.lIIIIlllIIIIIl[0]], TexGen.lIIIIlllIIIIIl[0]), 
        R(TexGen.lIIIIllIllllll[TexGen.lIIIIlllIIIIIl[2]], TexGen.lIIIIlllIIIIIl[2]);
        
        private static void lIllllIIIIlllIl() {
            (lIIIIllIllllll = new String[TexGen.lIIIIlllIIIIIl[4]])[TexGen.lIIIIlllIIIIIl[0]] = lIllllIIIIlllII("tN6HN/sCSP4=", "FjWch");
            TexGen.lIIIIllIllllll[TexGen.lIIIIlllIIIIIl[1]] = lIllllIIIIlllII("KzHGhKvAC5o=", "SPPjk");
            TexGen.lIIIIllIllllll[TexGen.lIIIIlllIIIIIl[2]] = lIllllIIIIlllII("+Nd3ers4JJU=", "ExgoP");
            TexGen.lIIIIllIllllll[TexGen.lIIIIlllIIIIIl[3]] = lIllllIIIIlllII("qmBwYOr9S/s=", "kTIfb");
        }
        
        private static void lIllllIIIlIIIIl() {
            (lIIIIlllIIIIIl = new int[6])[0] = ((0x6F ^ 0x5E) & ~(0x26 ^ 0x17));
            TexGen.lIIIIlllIIIIIl[1] = " ".length();
            TexGen.lIIIIlllIIIIIl[2] = "  ".length();
            TexGen.lIIIIlllIIIIIl[3] = "   ".length();
            TexGen.lIIIIlllIIIIIl[4] = (0x2D ^ 0x6C ^ (0xD2 ^ 0x97));
            TexGen.lIIIIlllIIIIIl[5] = (0x9B ^ 0x93);
        }
        
        private TexGen(final String lllllllllllllIlIIlIIIlIllIllIIIl, final int lllllllllllllIlIIlIIIlIllIllIIII) {
        }
        
        private static String lIllllIIIIlllII(final String lllllllllllllIlIIlIIIlIllIlIIIII, final String lllllllllllllIlIIlIIIlIllIIlllll) {
            try {
                final SecretKeySpec lllllllllllllIlIIlIIIlIllIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIIlIllIIlllll.getBytes(StandardCharsets.UTF_8)), TexGen.lIIIIlllIIIIIl[5]), "DES");
                final Cipher lllllllllllllIlIIlIIIlIllIlIIIlI = Cipher.getInstance("DES");
                lllllllllllllIlIIlIIIlIllIlIIIlI.init(TexGen.lIIIIlllIIIIIl[2], lllllllllllllIlIIlIIIlIllIlIIIll);
                return new String(lllllllllllllIlIIlIIIlIllIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIIlIllIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIlIIIlIllIlIIIIl) {
                lllllllllllllIlIIlIIIlIllIlIIIIl.printStackTrace();
                return null;
            }
        }
        
        static {
            lIllllIIIlIIIIl();
            lIllllIIIIlllIl();
            final TexGen[] enum$VALUES = new TexGen[TexGen.lIIIIlllIIIIIl[4]];
            enum$VALUES[TexGen.lIIIIlllIIIIIl[0]] = TexGen.S;
            enum$VALUES[TexGen.lIIIIlllIIIIIl[1]] = TexGen.T;
            enum$VALUES[TexGen.lIIIIlllIIIIIl[2]] = TexGen.R;
            enum$VALUES[TexGen.lIIIIlllIIIIIl[3]] = TexGen.Q;
            ENUM$VALUES = enum$VALUES;
        }
    }
    
    static class ColorMaterialState
    {
        public /* synthetic */ int field_179189_b;
        private static final /* synthetic */ int[] lIlllIlIIIllII;
        public /* synthetic */ BooleanState field_179191_a;
        public /* synthetic */ int field_179190_c;
        
        private ColorMaterialState() {
            this.field_179191_a = new BooleanState(ColorMaterialState.lIlllIlIIIllII[0]);
            this.field_179189_b = ColorMaterialState.lIlllIlIIIllII[1];
            this.field_179190_c = ColorMaterialState.lIlllIlIIIllII[2];
        }
        
        static {
            lIIIIIlIlIIIIllI();
        }
        
        private static void lIIIIIlIlIIIIllI() {
            (lIlllIlIIIllII = new int[3])[0] = (-(0xFFFF84A9 & 0x7FDF) & (0xFFFF9FFF & 0x6FDF));
            ColorMaterialState.lIlllIlIIIllII[1] = (-(0xFFFFFAFF & 0x7FA6) & (0xFFFFFFBD & 0x7EEF));
            ColorMaterialState.lIlllIlIIIllII[2] = (0xFFFF9E1B & 0x77E6);
        }
    }
    
    static class StencilState
    {
        public /* synthetic */ int field_179077_c;
        public /* synthetic */ int field_179074_d;
        public /* synthetic */ StencilFunc field_179078_a;
        public /* synthetic */ int field_179075_e;
        private static final /* synthetic */ int[] lllllIlIIIIIl;
        public /* synthetic */ int field_179076_b;
        
        private static void lIlIlllIIlIIlIl() {
            (lllllIlIIIIIl = new int[2])[0] = -" ".length();
            StencilState.lllllIlIIIIIl[1] = (0xFFFF9E3C & 0x7FC3);
        }
        
        static {
            lIlIlllIIlIIlIl();
        }
        
        private StencilState() {
            this.field_179078_a = new StencilFunc(null);
            this.field_179076_b = StencilState.lllllIlIIIIIl[0];
            this.field_179077_c = StencilState.lllllIlIIIIIl[1];
            this.field_179074_d = StencilState.lllllIlIIIIIl[1];
            this.field_179075_e = StencilState.lllllIlIIIIIl[1];
        }
    }
    
    static class ColorMask
    {
        private static final /* synthetic */ int[] lIIIIIllIlIlIl;
        public /* synthetic */ boolean alpha;
        public /* synthetic */ boolean green;
        public /* synthetic */ boolean blue;
        public /* synthetic */ boolean red;
        
        static {
            lIllIlllIIIllIl();
        }
        
        private ColorMask() {
            this.red = (ColorMask.lIIIIIllIlIlIl[0] != 0);
            this.green = (ColorMask.lIIIIIllIlIlIl[0] != 0);
            this.blue = (ColorMask.lIIIIIllIlIlIl[0] != 0);
            this.alpha = (ColorMask.lIIIIIllIlIlIl[0] != 0);
        }
        
        private static void lIllIlllIIIllIl() {
            (lIIIIIllIlIlIl = new int[1])[0] = " ".length();
        }
    }
}
