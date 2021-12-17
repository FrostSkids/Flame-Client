// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import com.google.common.collect.Lists;
import net.minecraft.client.renderer.GlStateManager;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.Tessellator;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.GLAllocation;
import java.util.List;

public class ModelRenderer
{
    public /* synthetic */ float offsetX;
    public /* synthetic */ float rotationPointY;
    public /* synthetic */ float offsetY;
    public /* synthetic */ float offsetZ;
    public /* synthetic */ float rotationPointZ;
    public /* synthetic */ boolean isHidden;
    private static final /* synthetic */ int[] llIIIIIIlIIIII;
    public /* synthetic */ float rotationPointX;
    public /* synthetic */ boolean showModel;
    public /* synthetic */ float textureHeight;
    private /* synthetic */ boolean compiled;
    public /* synthetic */ float rotateAngleX;
    public /* synthetic */ float textureWidth;
    private static final /* synthetic */ String[] llIIIIIIIlllll;
    public final /* synthetic */ String boxName;
    public /* synthetic */ List<ModelBox> cubeList;
    public /* synthetic */ float rotateAngleZ;
    public /* synthetic */ List<ModelRenderer> childModels;
    public /* synthetic */ float rotateAngleY;
    private /* synthetic */ int textureOffsetX;
    private /* synthetic */ int displayList;
    private /* synthetic */ int textureOffsetY;
    private /* synthetic */ ModelBase baseModel;
    
    private static void lIIIIllIllIIIlll() {
        (llIIIIIIIlllll = new String[ModelRenderer.llIIIIIIlIIIII[0]])[ModelRenderer.llIIIIIIlIIIII[1]] = lIIIIllIllIIIllI("fs2VkoM2Vik=", "nytzJ");
    }
    
    private void compileDisplayList(final float llllllllllllIlllIlllllllIIIIlllI) {
        this.displayList = GLAllocation.generateDisplayLists(ModelRenderer.llIIIIIIlIIIII[0]);
        GL11.glNewList(this.displayList, ModelRenderer.llIIIIIIlIIIII[2]);
        final WorldRenderer llllllllllllIlllIlllllllIIIlIIIl = Tessellator.getInstance().getWorldRenderer();
        int llllllllllllIlllIlllllllIIIlIIII = ModelRenderer.llIIIIIIlIIIII[1];
        "".length();
        if ("   ".length() <= 0) {
            return;
        }
        while (!lIIIIllIllIIlllI(llllllllllllIlllIlllllllIIIlIIII, this.cubeList.size())) {
            this.cubeList.get(llllllllllllIlllIlllllllIIIlIIII).render(llllllllllllIlllIlllllllIIIlIIIl, llllllllllllIlllIlllllllIIIIlllI);
            ++llllllllllllIlllIlllllllIIIlIIII;
        }
        GL11.glEndList();
        this.compiled = (ModelRenderer.llIIIIIIlIIIII[0] != 0);
    }
    
    static {
        lIIIIllIllIIlIII();
        lIIIIllIllIIIlll();
    }
    
    private static boolean lIIIIllIllIIllIl(final Object llllllllllllIlllIllllllIllllIIII) {
        return llllllllllllIlllIllllllIllllIIII != null;
    }
    
    public ModelRenderer addBox(final float llllllllllllIlllIlllllllIlllIIII, final float llllllllllllIlllIlllllllIllIllll, final float llllllllllllIlllIlllllllIllIlllI, final int llllllllllllIlllIlllllllIllIllIl, final int llllllllllllIlllIlllllllIllIllII, final int llllllllllllIlllIlllllllIllIlIll) {
        this.cubeList.add(new ModelBox(this, this.textureOffsetX, this.textureOffsetY, llllllllllllIlllIlllllllIlllIIII, llllllllllllIlllIlllllllIllIllll, llllllllllllIlllIlllllllIllIlllI, llllllllllllIlllIlllllllIllIllIl, llllllllllllIlllIlllllllIllIllII, llllllllllllIlllIlllllllIllIlIll, 0.0f));
        "".length();
        return this;
    }
    
    public void addBox(final float llllllllllllIlllIlllllllIlIIIIIl, final float llllllllllllIlllIlllllllIlIIIIII, final float llllllllllllIlllIlllllllIIllllll, final int llllllllllllIlllIlllllllIlIIIllI, final int llllllllllllIlllIlllllllIlIIIlIl, final int llllllllllllIlllIlllllllIIllllII, final float llllllllllllIlllIlllllllIIlllIll) {
        this.cubeList.add(new ModelBox(this, this.textureOffsetX, this.textureOffsetY, llllllllllllIlllIlllllllIlIIIIIl, llllllllllllIlllIlllllllIlIIIIII, llllllllllllIlllIlllllllIIllllll, llllllllllllIlllIlllllllIlIIIllI, llllllllllllIlllIlllllllIlIIIlIl, llllllllllllIlllIlllllllIIllllII, llllllllllllIlllIlllllllIIlllIll));
        "".length();
    }
    
    public ModelRenderer(final ModelBase llllllllllllIlllIllllllllIlllIII) {
        this(llllllllllllIlllIllllllllIlllIII, null);
    }
    
    private static String lIIIIllIllIIIllI(final String llllllllllllIlllIllllllIlllllIll, final String llllllllllllIlllIllllllIlllllIII) {
        try {
            final SecretKeySpec llllllllllllIlllIllllllIlllllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllllllIlllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIllllllIllllllIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllIllllllIllllllIl.init(ModelRenderer.llIIIIIIlIIIII[3], llllllllllllIlllIllllllIlllllllI);
            return new String(llllllllllllIlllIllllllIllllllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllllllIlllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllllllIllllllII) {
            llllllllllllIlllIllllllIllllllII.printStackTrace();
            return null;
        }
    }
    
    public void postRender(final float llllllllllllIlllIlllllllIIIllIlI) {
        if (lIIIIllIllIIlIll(this.isHidden ? 1 : 0) && lIIIIllIllIIllII(this.showModel ? 1 : 0)) {
            if (lIIIIllIllIIlIll(this.compiled ? 1 : 0)) {
                this.compileDisplayList(llllllllllllIlllIlllllllIIIllIlI);
            }
            if (lIIIIllIllIIlIll(lIIIIllIllIlIIII(this.rotateAngleX, 0.0f)) && lIIIIllIllIIlIll(lIIIIllIllIlIIII(this.rotateAngleY, 0.0f)) && lIIIIllIllIIlIll(lIIIIllIllIlIIII(this.rotateAngleZ, 0.0f))) {
                if (!lIIIIllIllIIlIll(lIIIIllIllIlIIII(this.rotationPointX, 0.0f)) || !lIIIIllIllIIlIll(lIIIIllIllIlIIII(this.rotationPointY, 0.0f)) || lIIIIllIllIIllII(lIIIIllIllIlIIII(this.rotationPointZ, 0.0f))) {
                    GlStateManager.translate(this.rotationPointX * llllllllllllIlllIlllllllIIIllIlI, this.rotationPointY * llllllllllllIlllIlllllllIIIllIlI, this.rotationPointZ * llllllllllllIlllIlllllllIIIllIlI);
                    "".length();
                    if (("  ".length() & ("  ".length() ^ -" ".length())) != 0x0) {
                        return;
                    }
                }
            }
            else {
                GlStateManager.translate(this.rotationPointX * llllllllllllIlllIlllllllIIIllIlI, this.rotationPointY * llllllllllllIlllIlllllllIIIllIlI, this.rotationPointZ * llllllllllllIlllIlllllllIIIllIlI);
                if (lIIIIllIllIIllII(lIIIIllIllIlIIII(this.rotateAngleZ, 0.0f))) {
                    GlStateManager.rotate(this.rotateAngleZ * 57.295776f, 0.0f, 0.0f, 1.0f);
                }
                if (lIIIIllIllIIllII(lIIIIllIllIlIIII(this.rotateAngleY, 0.0f))) {
                    GlStateManager.rotate(this.rotateAngleY * 57.295776f, 0.0f, 1.0f, 0.0f);
                }
                if (lIIIIllIllIIllII(lIIIIllIllIlIIII(this.rotateAngleX, 0.0f))) {
                    GlStateManager.rotate(this.rotateAngleX * 57.295776f, 1.0f, 0.0f, 0.0f);
                }
            }
        }
    }
    
    public void addChild(final ModelRenderer llllllllllllIlllIllllllllIlIIlII) {
        if (lIIIIllIllIIlIIl(this.childModels)) {
            this.childModels = (List<ModelRenderer>)Lists.newArrayList();
        }
        this.childModels.add(llllllllllllIlllIllllllllIlIIlII);
        "".length();
    }
    
    public ModelRenderer setTextureSize(final int llllllllllllIlllIlllllllIIIIIlll, final int llllllllllllIlllIlllllllIIIIIllI) {
        this.textureWidth = (float)llllllllllllIlllIlllllllIIIIIlll;
        this.textureHeight = (float)llllllllllllIlllIlllllllIIIIIllI;
        return this;
    }
    
    private static int lIIIIllIllIlIIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public ModelRenderer addBox(final float llllllllllllIlllIlllllllIllIIIIl, final float llllllllllllIlllIlllllllIlIllIII, final float llllllllllllIlllIlllllllIlIlllll, final int llllllllllllIlllIlllllllIlIllllI, final int llllllllllllIlllIlllllllIlIlllIl, final int llllllllllllIlllIlllllllIlIlIlII, final boolean llllllllllllIlllIlllllllIlIllIll) {
        this.cubeList.add(new ModelBox(this, this.textureOffsetX, this.textureOffsetY, llllllllllllIlllIlllllllIllIIIIl, llllllllllllIlllIlllllllIlIllIII, llllllllllllIlllIlllllllIlIlllll, llllllllllllIlllIlllllllIlIllllI, llllllllllllIlllIlllllllIlIlllIl, llllllllllllIlllIlllllllIlIlIlII, 0.0f, llllllllllllIlllIlllllllIlIllIll));
        "".length();
        return this;
    }
    
    private static boolean lIIIIllIllIIllII(final int llllllllllllIlllIllllllIlllIllII) {
        return llllllllllllIlllIllllllIlllIllII != 0;
    }
    
    private static int lIIIIllIllIIllll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public ModelRenderer(final ModelBase llllllllllllIlllIllllllllIllIIII, final int llllllllllllIlllIllllllllIlIlIll, final int llllllllllllIlllIllllllllIlIlllI) {
        this(llllllllllllIlllIllllllllIllIIII);
        this.setTextureOffset(llllllllllllIlllIllllllllIlIlIll, llllllllllllIlllIllllllllIlIlllI);
        "".length();
    }
    
    private static boolean lIIIIllIllIIlIIl(final Object llllllllllllIlllIllllllIlllIlllI) {
        return llllllllllllIlllIllllllIlllIlllI == null;
    }
    
    private static boolean lIIIIllIllIIlIll(final int llllllllllllIlllIllllllIlllIlIlI) {
        return llllllllllllIlllIllllllIlllIlIlI == 0;
    }
    
    private static boolean lIIIIllIllIIlllI(final int llllllllllllIlllIllllllIllllIIll, final int llllllllllllIlllIllllllIllllIIlI) {
        return llllllllllllIlllIllllllIllllIIll >= llllllllllllIlllIllllllIllllIIlI;
    }
    
    private static void lIIIIllIllIIlIII() {
        (llIIIIIIlIIIII = new int[4])[0] = " ".length();
        ModelRenderer.llIIIIIIlIIIII[1] = ((0xED ^ 0x8D ^ (0x4C ^ 0x17)) & (0x73 ^ 0x31 ^ (0xE4 ^ 0x9D) ^ -" ".length()));
        ModelRenderer.llIIIIIIlIIIII[2] = (-(0xFFFFF4D4 & 0xFFF) & (0xFFFF9FFF & 0x77D3));
        ModelRenderer.llIIIIIIlIIIII[3] = "  ".length();
    }
    
    public void setRotationPoint(final float llllllllllllIlllIlllllllIIllIlIl, final float llllllllllllIlllIlllllllIIllIIII, final float llllllllllllIlllIlllllllIIllIIll) {
        this.rotationPointX = llllllllllllIlllIlllllllIIllIlIl;
        this.rotationPointY = llllllllllllIlllIlllllllIIllIIII;
        this.rotationPointZ = llllllllllllIlllIlllllllIIllIIll;
    }
    
    private static int lIIIIllIllIIlIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void renderWithRotation(final float llllllllllllIlllIlllllllIIlIIIII) {
        if (lIIIIllIllIIlIll(this.isHidden ? 1 : 0) && lIIIIllIllIIllII(this.showModel ? 1 : 0)) {
            if (lIIIIllIllIIlIll(this.compiled ? 1 : 0)) {
                this.compileDisplayList(llllllllllllIlllIlllllllIIlIIIII);
            }
            GlStateManager.pushMatrix();
            GlStateManager.translate(this.rotationPointX * llllllllllllIlllIlllllllIIlIIIII, this.rotationPointY * llllllllllllIlllIlllllllIIlIIIII, this.rotationPointZ * llllllllllllIlllIlllllllIIlIIIII);
            if (lIIIIllIllIIllII(lIIIIllIllIIllll(this.rotateAngleY, 0.0f))) {
                GlStateManager.rotate(this.rotateAngleY * 57.295776f, 0.0f, 1.0f, 0.0f);
            }
            if (lIIIIllIllIIllII(lIIIIllIllIIllll(this.rotateAngleX, 0.0f))) {
                GlStateManager.rotate(this.rotateAngleX * 57.295776f, 1.0f, 0.0f, 0.0f);
            }
            if (lIIIIllIllIIllII(lIIIIllIllIIllll(this.rotateAngleZ, 0.0f))) {
                GlStateManager.rotate(this.rotateAngleZ * 57.295776f, 0.0f, 0.0f, 1.0f);
            }
            GlStateManager.callList(this.displayList);
            GlStateManager.popMatrix();
        }
    }
    
    public ModelRenderer addBox(String llllllllllllIlllIllllllllIIIIlll, final float llllllllllllIlllIllllllllIIIllll, final float llllllllllllIlllIllllllllIIIlllI, final float llllllllllllIlllIllllllllIIIIlII, final int llllllllllllIlllIllllllllIIIllII, final int llllllllllllIlllIllllllllIIIlIll, final int llllllllllllIlllIllllllllIIIIIIl) {
        llllllllllllIlllIllllllllIIIIlll = (long)String.valueOf(new StringBuilder(String.valueOf(this.boxName)).append(ModelRenderer.llIIIIIIIlllll[ModelRenderer.llIIIIIIlIIIII[1]]).append((String)llllllllllllIlllIllllllllIIIIlll));
        final TextureOffset llllllllllllIlllIllllllllIIIlIIl = this.baseModel.getTextureOffset((String)llllllllllllIlllIllllllllIIIIlll);
        this.setTextureOffset(llllllllllllIlllIllllllllIIIlIIl.textureOffsetX, llllllllllllIlllIllllllllIIIlIIl.textureOffsetY);
        "".length();
        this.cubeList.add(new ModelBox(this, this.textureOffsetX, this.textureOffsetY, llllllllllllIlllIllllllllIIIllll, llllllllllllIlllIllllllllIIIlllI, llllllllllllIlllIllllllllIIIIlII, llllllllllllIlllIllllllllIIIllII, llllllllllllIlllIllllllllIIIlIll, llllllllllllIlllIllllllllIIIIIIl, 0.0f).setBoxName((String)llllllllllllIlllIllllllllIIIIlll));
        "".length();
        return this;
    }
    
    public void render(final float llllllllllllIlllIlllllllIIlIIlIl) {
        if (lIIIIllIllIIlIll(this.isHidden ? 1 : 0) && lIIIIllIllIIllII(this.showModel ? 1 : 0)) {
            if (lIIIIllIllIIlIll(this.compiled ? 1 : 0)) {
                this.compileDisplayList(llllllllllllIlllIlllllllIIlIIlIl);
            }
            GlStateManager.translate(this.offsetX, this.offsetY, this.offsetZ);
            if (lIIIIllIllIIlIll(lIIIIllIllIIlIlI(this.rotateAngleX, 0.0f)) && lIIIIllIllIIlIll(lIIIIllIllIIlIlI(this.rotateAngleY, 0.0f)) && lIIIIllIllIIlIll(lIIIIllIllIIlIlI(this.rotateAngleZ, 0.0f))) {
                if (lIIIIllIllIIlIll(lIIIIllIllIIlIlI(this.rotationPointX, 0.0f)) && lIIIIllIllIIlIll(lIIIIllIllIIlIlI(this.rotationPointY, 0.0f)) && lIIIIllIllIIlIll(lIIIIllIllIIlIlI(this.rotationPointZ, 0.0f))) {
                    GlStateManager.callList(this.displayList);
                    if (lIIIIllIllIIllIl(this.childModels)) {
                        int llllllllllllIlllIlllllllIIlIlIIl = ModelRenderer.llIIIIIIlIIIII[1];
                        "".length();
                        if (((0x69 ^ 0x30) & ~(0x2E ^ 0x77)) != 0x0) {
                            return;
                        }
                        while (!lIIIIllIllIIlllI(llllllllllllIlllIlllllllIIlIlIIl, this.childModels.size())) {
                            this.childModels.get(llllllllllllIlllIlllllllIIlIlIIl).render(llllllllllllIlllIlllllllIIlIIlIl);
                            ++llllllllllllIlllIlllllllIIlIlIIl;
                        }
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                }
                else {
                    GlStateManager.translate(this.rotationPointX * llllllllllllIlllIlllllllIIlIIlIl, this.rotationPointY * llllllllllllIlllIlllllllIIlIIlIl, this.rotationPointZ * llllllllllllIlllIlllllllIIlIIlIl);
                    GlStateManager.callList(this.displayList);
                    if (lIIIIllIllIIllIl(this.childModels)) {
                        int llllllllllllIlllIlllllllIIlIlIII = ModelRenderer.llIIIIIIlIIIII[1];
                        "".length();
                        if (null != null) {
                            return;
                        }
                        while (!lIIIIllIllIIlllI(llllllllllllIlllIlllllllIIlIlIII, this.childModels.size())) {
                            this.childModels.get(llllllllllllIlllIlllllllIIlIlIII).render(llllllllllllIlllIlllllllIIlIIlIl);
                            ++llllllllllllIlllIlllllllIIlIlIII;
                        }
                    }
                    GlStateManager.translate(-this.rotationPointX * llllllllllllIlllIlllllllIIlIIlIl, -this.rotationPointY * llllllllllllIlllIlllllllIIlIIlIl, -this.rotationPointZ * llllllllllllIlllIlllllllIIlIIlIl);
                    "".length();
                    if (" ".length() < 0) {
                        return;
                    }
                }
            }
            else {
                GlStateManager.pushMatrix();
                GlStateManager.translate(this.rotationPointX * llllllllllllIlllIlllllllIIlIIlIl, this.rotationPointY * llllllllllllIlllIlllllllIIlIIlIl, this.rotationPointZ * llllllllllllIlllIlllllllIIlIIlIl);
                if (lIIIIllIllIIllII(lIIIIllIllIIlIlI(this.rotateAngleZ, 0.0f))) {
                    GlStateManager.rotate(this.rotateAngleZ * 57.295776f, 0.0f, 0.0f, 1.0f);
                }
                if (lIIIIllIllIIllII(lIIIIllIllIIlIlI(this.rotateAngleY, 0.0f))) {
                    GlStateManager.rotate(this.rotateAngleY * 57.295776f, 0.0f, 1.0f, 0.0f);
                }
                if (lIIIIllIllIIllII(lIIIIllIllIIlIlI(this.rotateAngleX, 0.0f))) {
                    GlStateManager.rotate(this.rotateAngleX * 57.295776f, 1.0f, 0.0f, 0.0f);
                }
                GlStateManager.callList(this.displayList);
                if (lIIIIllIllIIllIl(this.childModels)) {
                    int llllllllllllIlllIlllllllIIlIIlll = ModelRenderer.llIIIIIIlIIIII[1];
                    "".length();
                    if (null != null) {
                        return;
                    }
                    while (!lIIIIllIllIIlllI(llllllllllllIlllIlllllllIIlIIlll, this.childModels.size())) {
                        this.childModels.get(llllllllllllIlllIlllllllIIlIIlll).render(llllllllllllIlllIlllllllIIlIIlIl);
                        ++llllllllllllIlllIlllllllIIlIIlll;
                    }
                }
                GlStateManager.popMatrix();
            }
            GlStateManager.translate(-this.offsetX, -this.offsetY, -this.offsetZ);
        }
    }
    
    public ModelRenderer setTextureOffset(final int llllllllllllIlllIllllllllIIlllII, final int llllllllllllIlllIllllllllIIllIll) {
        this.textureOffsetX = llllllllllllIlllIllllllllIIlllII;
        this.textureOffsetY = llllllllllllIlllIllllllllIIllIll;
        return this;
    }
    
    public ModelRenderer(final ModelBase llllllllllllIlllIllllllllIllllIl, final String llllllllllllIlllIllllllllIllllII) {
        this.textureWidth = 64.0f;
        this.textureHeight = 32.0f;
        this.showModel = (ModelRenderer.llIIIIIIlIIIII[0] != 0);
        this.cubeList = (List<ModelBox>)Lists.newArrayList();
        this.baseModel = llllllllllllIlllIllllllllIllllIl;
        llllllllllllIlllIllllllllIllllIl.boxList.add(this);
        "".length();
        this.boxName = llllllllllllIlllIllllllllIllllII;
        this.setTextureSize(llllllllllllIlllIllllllllIllllIl.textureWidth, llllllllllllIlllIllllllllIllllIl.textureHeight);
        "".length();
    }
}
