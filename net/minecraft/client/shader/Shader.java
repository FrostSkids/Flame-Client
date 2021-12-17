// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.shader;

import java.util.Iterator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import java.io.IOException;
import net.minecraft.client.util.JsonException;
import com.google.common.collect.Lists;
import net.minecraft.client.resources.IResourceManager;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import org.lwjgl.util.vector.Matrix4f;

public class Shader
{
    private final /* synthetic */ ShaderManager manager;
    private /* synthetic */ Matrix4f projectionMatrix;
    private final /* synthetic */ List<Integer> listAuxHeights;
    public final /* synthetic */ Framebuffer framebufferIn;
    private final /* synthetic */ List<String> listAuxNames;
    public final /* synthetic */ Framebuffer framebufferOut;
    private static final /* synthetic */ String[] lllIIIIlIIIlll;
    private static final /* synthetic */ int[] lllIIIIlIIlIll;
    private final /* synthetic */ List<Object> listAuxFramebuffers;
    private final /* synthetic */ List<Integer> listAuxWidths;
    
    private static boolean lIIlllIIlIIIIlIl(final int llllllllllllIllIIIIlIlllIllIlIII) {
        return llllllllllllIllIIIIlIlllIllIlIII != 0;
    }
    
    private static boolean lIIlllIIlIIIIllI(final int llllllllllllIllIIIIlIlllIllIIllI) {
        return llllllllllllIllIIIIlIlllIllIIllI == 0;
    }
    
    private static String lIIlllIIIllllIll(final String llllllllllllIllIIIIlIllllIIllIlI, final String llllllllllllIllIIIIlIllllIIllIIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIIlIllllIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIlIllllIIllIIl.getBytes(StandardCharsets.UTF_8)), Shader.lllIIIIlIIlIll[9]), "DES");
            final Cipher llllllllllllIllIIIIlIllllIIllllI = Cipher.getInstance("DES");
            llllllllllllIllIIIIlIllllIIllllI.init(Shader.lllIIIIlIIlIll[2], llllllllllllIllIIIIlIllllIIlllll);
            return new String(llllllllllllIllIIIIlIllllIIllllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIlIllllIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIlIllllIIlllIl) {
            llllllllllllIllIIIIlIllllIIlllIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlllIIlIIIIIIl() {
        (lllIIIIlIIIlll = new String[Shader.lllIIIIlIIlIll[7]])[Shader.lllIIIIlIIlIll[0]] = lIIlllIIIllllIll("pvPWkKps4WSmR94vOshicA==", "dMJau");
        Shader.lllIIIIlIIIlll[Shader.lllIIIIlIIlIll[1]] = lIIlllIIIlllllII("Fh8PCygtDw==", "WjwXA");
        Shader.lllIIIIlIIIlll[Shader.lllIIIIlIIlIll[2]] = lIIlllIIIlllllIl("NwEDzv5MlzI=", "IVpQd");
        Shader.lllIIIIlIIIlll[Shader.lllIIIIlIIlIll[3]] = lIIlllIIIlllllIl("PyOPbd/Tn0Q=", "jTdik");
        Shader.lllIIIIlIIIlll[Shader.lllIIIIlIIlIll[4]] = lIIlllIIIllllIll("AQGoGFBigpo=", "PlLgc");
        Shader.lllIIIIlIIIlll[Shader.lllIIIIlIIlIll[5]] = lIIlllIIIlllllIl("43AG0be+XF4=", "vMlEp");
        Shader.lllIIIIlIIIlll[Shader.lllIIIIlIIlIll[6]] = lIIlllIIIllllIll("eNQlPtySwc76LTEghdxqpA==", "xrRjT");
    }
    
    public void addAuxFramebuffer(final String llllllllllllIllIIIIlIlllllIlIIIl, final Object llllllllllllIllIIIIlIlllllIlIIII, final int llllllllllllIllIIIIlIlllllIIllll, final int llllllllllllIllIIIIlIlllllIIlIIl) {
        this.listAuxNames.add(this.listAuxNames.size(), llllllllllllIllIIIIlIlllllIlIIIl);
        this.listAuxFramebuffers.add(this.listAuxFramebuffers.size(), llllllllllllIllIIIIlIlllllIlIIII);
        this.listAuxWidths.add(this.listAuxWidths.size(), llllllllllllIllIIIIlIlllllIIllll);
        this.listAuxHeights.add(this.listAuxHeights.size(), llllllllllllIllIIIIlIlllllIIlIIl);
    }
    
    public void setProjectionMatrix(final Matrix4f llllllllllllIllIIIIlIlllllIIIIlI) {
        this.projectionMatrix = llllllllllllIllIIIIlIlllllIIIIlI;
    }
    
    private static boolean lIIlllIIlIIIIlII(final int llllllllllllIllIIIIlIlllIllIllll, final int llllllllllllIllIIIIlIlllIllIlllI) {
        return llllllllllllIllIIIIlIlllIllIllll >= llllllllllllIllIIIIlIlllIllIlllI;
    }
    
    public Shader(final IResourceManager llllllllllllIllIIIIlIlllllIllllI, final String llllllllllllIllIIIIlIlllllIlllIl, final Framebuffer llllllllllllIllIIIIlIllllllIIIIl, final Framebuffer llllllllllllIllIIIIlIlllllIllIll) throws JsonException, IOException {
        this.listAuxFramebuffers = (List<Object>)Lists.newArrayList();
        this.listAuxNames = (List<String>)Lists.newArrayList();
        this.listAuxWidths = (List<Integer>)Lists.newArrayList();
        this.listAuxHeights = (List<Integer>)Lists.newArrayList();
        this.manager = new ShaderManager(llllllllllllIllIIIIlIlllllIllllI, llllllllllllIllIIIIlIlllllIlllIl);
        this.framebufferIn = llllllllllllIllIIIIlIllllllIIIIl;
        this.framebufferOut = llllllllllllIllIIIIlIlllllIllIll;
    }
    
    static {
        lIIlllIIlIIIIIll();
        lIIlllIIlIIIIIIl();
    }
    
    private void preLoadShader() {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.disableBlend();
        GlStateManager.disableDepth();
        GlStateManager.disableAlpha();
        GlStateManager.disableFog();
        GlStateManager.disableLighting();
        GlStateManager.disableColorMaterial();
        GlStateManager.enableTexture2D();
        GlStateManager.bindTexture(Shader.lllIIIIlIIlIll[0]);
    }
    
    public void deleteShader() {
        this.manager.deleteShader();
    }
    
    private static String lIIlllIIIlllllIl(final String llllllllllllIllIIIIlIlllIlllIlll, final String llllllllllllIllIIIIlIlllIlllIllI) {
        try {
            final SecretKeySpec llllllllllllIllIIIIlIlllIllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIlIlllIlllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIIlIlllIllllIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIIlIlllIllllIIl.init(Shader.lllIIIIlIIlIll[2], llllllllllllIllIIIIlIlllIllllIlI);
            return new String(llllllllllllIllIIIIlIlllIllllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIlIlllIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIlIlllIllllIII) {
            llllllllllllIllIIIIlIlllIllllIII.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlllIIlIIIIIll() {
        (lllIIIIlIIlIll = new int[10])[0] = ((0xD9 ^ 0xC1) & ~(0x75 ^ 0x6D));
        Shader.lllIIIIlIIlIll[1] = " ".length();
        Shader.lllIIIIlIIlIll[2] = "  ".length();
        Shader.lllIIIIlIIlIll[3] = "   ".length();
        Shader.lllIIIIlIIlIll[4] = (0x21 ^ 0x25);
        Shader.lllIIIIlIIlIll[5] = (0xF3 ^ 0x8B ^ (0xED ^ 0x90));
        Shader.lllIIIIlIIlIll[6] = (0x92 ^ 0x94);
        Shader.lllIIIIlIIlIll[7] = (0x58 ^ 0x79 ^ (0x84 ^ 0xA2));
        Shader.lllIIIIlIIlIll[8] = 102 + 174 - 33 + 12;
        Shader.lllIIIIlIIlIll[9] = (0x5A ^ 0x52);
    }
    
    private static boolean lIIlllIIlIIIIlll(final int llllllllllllIllIIIIlIlllIllIlIll, final int llllllllllllIllIIIIlIlllIllIlIlI) {
        return llllllllllllIllIIIIlIlllIllIlIll < llllllllllllIllIIIIlIlllIllIlIlI;
    }
    
    private static String lIIlllIIIlllllII(String llllllllllllIllIIIIlIllllIIIIlll, final String llllllllllllIllIIIIlIllllIIIlIll) {
        llllllllllllIllIIIIlIllllIIIIlll = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIIlIllllIIIIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIlIllllIIIlIlI = new StringBuilder();
        final char[] llllllllllllIllIIIIlIllllIIIlIIl = llllllllllllIllIIIIlIllllIIIlIll.toCharArray();
        int llllllllllllIllIIIIlIllllIIIlIII = Shader.lllIIIIlIIlIll[0];
        final short llllllllllllIllIIIIlIllllIIIIIlI = (Object)((String)llllllllllllIllIIIIlIllllIIIIlll).toCharArray();
        final short llllllllllllIllIIIIlIllllIIIIIIl = (short)llllllllllllIllIIIIlIllllIIIIIlI.length;
        boolean llllllllllllIllIIIIlIllllIIIIIII = Shader.lllIIIIlIIlIll[0] != 0;
        while (lIIlllIIlIIIIlll(llllllllllllIllIIIIlIllllIIIIIII ? 1 : 0, llllllllllllIllIIIIlIllllIIIIIIl)) {
            final char llllllllllllIllIIIIlIllllIIIllIl = llllllllllllIllIIIIlIllllIIIIIlI[llllllllllllIllIIIIlIllllIIIIIII];
            llllllllllllIllIIIIlIllllIIIlIlI.append((char)(llllllllllllIllIIIIlIllllIIIllIl ^ llllllllllllIllIIIIlIllllIIIlIIl[llllllllllllIllIIIIlIllllIIIlIII % llllllllllllIllIIIIlIllllIIIlIIl.length]));
            "".length();
            ++llllllllllllIllIIIIlIllllIIIlIII;
            ++llllllllllllIllIIIIlIllllIIIIIII;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIlIllllIIIlIlI);
    }
    
    public void loadShader(final float llllllllllllIllIIIIlIllllIlIlllI) {
        this.preLoadShader();
        this.framebufferIn.unbindFramebuffer();
        final float llllllllllllIllIIIIlIllllIllIllI = (float)this.framebufferOut.framebufferTextureWidth;
        final float llllllllllllIllIIIIlIllllIllIlIl = (float)this.framebufferOut.framebufferTextureHeight;
        GlStateManager.viewport(Shader.lllIIIIlIIlIll[0], Shader.lllIIIIlIIlIll[0], (int)llllllllllllIllIIIIlIllllIllIllI, (int)llllllllllllIllIIIIlIllllIllIlIl);
        this.manager.addSamplerTexture(Shader.lllIIIIlIIIlll[Shader.lllIIIIlIIlIll[0]], this.framebufferIn);
        int llllllllllllIllIIIIlIllllIllIlII = Shader.lllIIIIlIIlIll[0];
        "".length();
        if ("   ".length() < 0) {
            return;
        }
        while (!lIIlllIIlIIIIlII(llllllllllllIllIIIIlIllllIllIlII, this.listAuxFramebuffers.size())) {
            this.manager.addSamplerTexture(this.listAuxNames.get(llllllllllllIllIIIIlIllllIllIlII), this.listAuxFramebuffers.get(llllllllllllIllIIIIlIllllIllIlII));
            this.manager.getShaderUniformOrDefault(String.valueOf(new StringBuilder(Shader.lllIIIIlIIIlll[Shader.lllIIIIlIIlIll[1]]).append(llllllllllllIllIIIIlIllllIllIlII))).set(this.listAuxWidths.get(llllllllllllIllIIIIlIllllIllIlII), this.listAuxHeights.get(llllllllllllIllIIIIlIllllIllIlII));
            ++llllllllllllIllIIIIlIllllIllIlII;
        }
        this.manager.getShaderUniformOrDefault(Shader.lllIIIIlIIIlll[Shader.lllIIIIlIIlIll[2]]).set(this.projectionMatrix);
        this.manager.getShaderUniformOrDefault(Shader.lllIIIIlIIIlll[Shader.lllIIIIlIIlIll[3]]).set((float)this.framebufferIn.framebufferTextureWidth, (float)this.framebufferIn.framebufferTextureHeight);
        this.manager.getShaderUniformOrDefault(Shader.lllIIIIlIIIlll[Shader.lllIIIIlIIlIll[4]]).set(llllllllllllIllIIIIlIllllIllIllI, llllllllllllIllIIIIlIllllIllIlIl);
        this.manager.getShaderUniformOrDefault(Shader.lllIIIIlIIIlll[Shader.lllIIIIlIIlIll[5]]).set(llllllllllllIllIIIIlIllllIlIlllI);
        final Minecraft llllllllllllIllIIIIlIllllIllIIll = Minecraft.getMinecraft();
        this.manager.getShaderUniformOrDefault(Shader.lllIIIIlIIIlll[Shader.lllIIIIlIIlIll[6]]).set((float)llllllllllllIllIIIIlIllllIllIIll.displayWidth, (float)llllllllllllIllIIIIlIllllIllIIll.displayHeight);
        this.manager.useShader();
        this.framebufferOut.framebufferClear();
        this.framebufferOut.bindFramebuffer((boolean)(Shader.lllIIIIlIIlIll[0] != 0));
        GlStateManager.depthMask((boolean)(Shader.lllIIIIlIIlIll[0] != 0));
        GlStateManager.colorMask((boolean)(Shader.lllIIIIlIIlIll[1] != 0), (boolean)(Shader.lllIIIIlIIlIll[1] != 0), (boolean)(Shader.lllIIIIlIIlIll[1] != 0), (boolean)(Shader.lllIIIIlIIlIll[1] != 0));
        final Tessellator llllllllllllIllIIIIlIllllIllIIlI = Tessellator.getInstance();
        final WorldRenderer llllllllllllIllIIIIlIllllIllIIIl = llllllllllllIllIIIIlIllllIllIIlI.getWorldRenderer();
        llllllllllllIllIIIIlIllllIllIIIl.begin(Shader.lllIIIIlIIlIll[7], DefaultVertexFormats.POSITION_COLOR);
        llllllllllllIllIIIIlIllllIllIIIl.pos(0.0, llllllllllllIllIIIIlIllllIllIlIl, 500.0).color(Shader.lllIIIIlIIlIll[8], Shader.lllIIIIlIIlIll[8], Shader.lllIIIIlIIlIll[8], Shader.lllIIIIlIIlIll[8]).endVertex();
        llllllllllllIllIIIIlIllllIllIIIl.pos(llllllllllllIllIIIIlIllllIllIllI, llllllllllllIllIIIIlIllllIllIlIl, 500.0).color(Shader.lllIIIIlIIlIll[8], Shader.lllIIIIlIIlIll[8], Shader.lllIIIIlIIlIll[8], Shader.lllIIIIlIIlIll[8]).endVertex();
        llllllllllllIllIIIIlIllllIllIIIl.pos(llllllllllllIllIIIIlIllllIllIllI, 0.0, 500.0).color(Shader.lllIIIIlIIlIll[8], Shader.lllIIIIlIIlIll[8], Shader.lllIIIIlIIlIll[8], Shader.lllIIIIlIIlIll[8]).endVertex();
        llllllllllllIllIIIIlIllllIllIIIl.pos(0.0, 0.0, 500.0).color(Shader.lllIIIIlIIlIll[8], Shader.lllIIIIlIIlIll[8], Shader.lllIIIIlIIlIll[8], Shader.lllIIIIlIIlIll[8]).endVertex();
        llllllllllllIllIIIIlIllllIllIIlI.draw();
        GlStateManager.depthMask((boolean)(Shader.lllIIIIlIIlIll[1] != 0));
        GlStateManager.colorMask((boolean)(Shader.lllIIIIlIIlIll[1] != 0), (boolean)(Shader.lllIIIIlIIlIll[1] != 0), (boolean)(Shader.lllIIIIlIIlIll[1] != 0), (boolean)(Shader.lllIIIIlIIlIll[1] != 0));
        this.manager.endShader();
        this.framebufferOut.unbindFramebuffer();
        this.framebufferIn.unbindFramebufferTexture();
        final double llllllllllllIllIIIIlIllllIlIIlll = (double)this.listAuxFramebuffers.iterator();
        "".length();
        if (-" ".length() != -" ".length()) {
            return;
        }
        while (!lIIlllIIlIIIIllI(((Iterator)llllllllllllIllIIIIlIllllIlIIlll).hasNext() ? 1 : 0)) {
            final Object llllllllllllIllIIIIlIllllIllIIII = ((Iterator<Object>)llllllllllllIllIIIIlIllllIlIIlll).next();
            if (lIIlllIIlIIIIlIl((llllllllllllIllIIIIlIllllIllIIII instanceof Framebuffer) ? 1 : 0)) {
                ((Framebuffer)llllllllllllIllIIIIlIllllIllIIII).unbindFramebufferTexture();
            }
        }
    }
    
    public ShaderManager getShaderManager() {
        return this.manager;
    }
}
