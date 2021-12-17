// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.shader;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import com.google.gson.JsonSyntaxException;
import net.minecraft.client.resources.IResource;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import com.google.common.base.Charsets;
import com.google.gson.JsonParser;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Iterator;
import net.minecraft.client.renderer.texture.ITextureObject;
import com.google.gson.JsonObject;
import org.lwjgl.opengl.GL11;
import java.io.FileNotFoundException;
import net.minecraft.util.ResourceLocation;
import com.google.gson.JsonArray;
import net.minecraft.util.JsonUtils;
import com.google.gson.JsonElement;
import net.minecraft.client.renderer.texture.TextureManager;
import java.io.IOException;
import net.minecraft.client.util.JsonException;
import java.util.Map;
import org.lwjgl.util.vector.Matrix4f;
import net.minecraft.client.resources.IResourceManager;
import java.util.List;

public class ShaderGroup
{
    private /* synthetic */ float field_148037_k;
    private /* synthetic */ String shaderGroupName;
    private static final /* synthetic */ String[] llIlllIlIIllII;
    private static final /* synthetic */ int[] llIlllIlIIllIl;
    private /* synthetic */ float field_148036_j;
    private /* synthetic */ Framebuffer mainFramebuffer;
    private final /* synthetic */ List<Shader> listShaders;
    private /* synthetic */ IResourceManager resourceManager;
    private /* synthetic */ Matrix4f projectionMatrix;
    private final /* synthetic */ Map<String, Framebuffer> mapFramebuffers;
    private final /* synthetic */ List<Framebuffer> listFramebuffers;
    private /* synthetic */ int mainFramebufferWidth;
    private /* synthetic */ int mainFramebufferHeight;
    
    public Shader addShader(final String llllllllllllIllIIlIIlIIlIIlllllI, final Framebuffer llllllllllllIllIIlIIlIIlIIllllIl, final Framebuffer llllllllllllIllIIlIIlIIlIIllllII) throws JsonException, IOException {
        final Shader llllllllllllIllIIlIIlIIlIIlllIll = new Shader(this.resourceManager, llllllllllllIllIIlIIlIIlIIlllllI, llllllllllllIllIIlIIlIIlIIllllIl, llllllllllllIllIIlIIlIIlIIllllII);
        this.listShaders.add(this.listShaders.size(), llllllllllllIllIIlIIlIIlIIlllIll);
        return llllllllllllIllIIlIIlIIlIIlllIll;
    }
    
    public Framebuffer getFramebufferRaw(final String llllllllllllIllIIlIIlIIlIlIlllIl) {
        return this.mapFramebuffers.get(llllllllllllIllIIlIIlIIlIlIlllIl);
    }
    
    private void parsePass(final TextureManager llllllllllllIllIIlIIlIIllIIllIII, final JsonElement llllllllllllIllIIlIIlIIllIllIlIl) throws JsonException, IOException {
        final JsonObject llllllllllllIllIIlIIlIIllIllIlII = JsonUtils.getJsonObject(llllllllllllIllIIlIIlIIllIllIlIl, ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[13]]);
        final String llllllllllllIllIIlIIlIIllIllIIll = JsonUtils.getString(llllllllllllIllIIlIIlIIllIllIlII, ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[14]]);
        final String llllllllllllIllIIlIIlIIllIllIIlI = JsonUtils.getString(llllllllllllIllIIlIIlIIllIllIlII, ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[15]]);
        final String llllllllllllIllIIlIIlIIllIllIIIl = JsonUtils.getString(llllllllllllIllIIlIIlIIllIllIlII, ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[16]]);
        final Framebuffer llllllllllllIllIIlIIlIIllIllIIII = this.getFramebuffer(llllllllllllIllIIlIIlIIllIllIIlI);
        final Framebuffer llllllllllllIllIIlIIlIIllIlIllll = this.getFramebuffer(llllllllllllIllIIlIIlIIllIllIIIl);
        if (lIIllIIllIllIlll(llllllllllllIllIIlIIlIIllIllIIII)) {
            throw new JsonException(String.valueOf(new StringBuilder(ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[17]]).append(llllllllllllIllIIlIIlIIllIllIIlI).append(ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[18]])));
        }
        if (lIIllIIllIllIlll(llllllllllllIllIIlIIlIIllIlIllll)) {
            throw new JsonException(String.valueOf(new StringBuilder(ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[19]]).append(llllllllllllIllIIlIIlIIllIllIIIl).append(ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[20]])));
        }
        final Shader llllllllllllIllIIlIIlIIllIlIlllI = this.addShader(llllllllllllIllIIlIIlIIllIllIIll, llllllllllllIllIIlIIlIIllIllIIII, llllllllllllIllIIlIIlIIllIlIllll);
        final JsonArray llllllllllllIllIIlIIlIIllIlIllIl = JsonUtils.getJsonArray(llllllllllllIllIIlIIlIIllIllIlII, ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[21]], null);
        if (lIIllIIllIlllIII(llllllllllllIllIIlIIlIIllIlIllIl)) {
            int llllllllllllIllIIlIIlIIllIlIllII = ShaderGroup.llIlllIlIIllIl[0];
            final double llllllllllllIllIIlIIlIIllIIIllII = (double)llllllllllllIllIIlIIlIIllIlIllIl.iterator();
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIllIIllIllIllI(((Iterator)llllllllllllIllIIlIIlIIllIIIllII).hasNext() ? 1 : 0)) {
                final JsonElement llllllllllllIllIIlIIlIIllIlIlIll = ((Iterator<JsonElement>)llllllllllllIllIIlIIlIIllIIIllII).next();
                try {
                    final JsonObject llllllllllllIllIIlIIlIIllIlIlIlI = JsonUtils.getJsonObject(llllllllllllIllIIlIIlIIllIlIlIll, ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[22]]);
                    final String llllllllllllIllIIlIIlIIllIlIlIIl = JsonUtils.getString(llllllllllllIllIIlIIlIIllIlIlIlI, ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[23]]);
                    final String llllllllllllIllIIlIIlIIllIlIlIII = JsonUtils.getString(llllllllllllIllIIlIIlIIllIlIlIlI, ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[24]]);
                    final Framebuffer llllllllllllIllIIlIIlIIllIlIIlll = this.getFramebuffer(llllllllllllIllIIlIIlIIllIlIlIII);
                    if (lIIllIIllIllIlll(llllllllllllIllIIlIIlIIllIlIIlll)) {
                        final ResourceLocation llllllllllllIllIIlIIlIIllIlIIllI = new ResourceLocation(String.valueOf(new StringBuilder(ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[25]]).append(llllllllllllIllIIlIIlIIllIlIlIII).append(ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[26]])));
                        try {
                            this.resourceManager.getResource(llllllllllllIllIIlIIlIIllIlIIllI);
                            "".length();
                            "".length();
                            if (null != null) {
                                return;
                            }
                        }
                        catch (FileNotFoundException llllllllllllIllIIlIIlIIllIlIIlIl) {
                            throw new JsonException(String.valueOf(new StringBuilder(ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[27]]).append(llllllllllllIllIIlIIlIIllIlIlIII).append(ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[28]])));
                        }
                        llllllllllllIllIIlIIlIIllIIllIII.bindTexture(llllllllllllIllIIlIIlIIllIlIIllI);
                        final ITextureObject llllllllllllIllIIlIIlIIllIlIIlII = llllllllllllIllIIlIIlIIllIIllIII.getTexture(llllllllllllIllIIlIIlIIllIlIIllI);
                        final int llllllllllllIllIIlIIlIIllIlIIIll = JsonUtils.getInt(llllllllllllIllIIlIIlIIllIlIlIlI, ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[29]]);
                        final int llllllllllllIllIIlIIlIIllIlIIIlI = JsonUtils.getInt(llllllllllllIllIIlIIlIIllIlIlIlI, ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[30]]);
                        final boolean llllllllllllIllIIlIIlIIllIlIIIIl = JsonUtils.getBoolean(llllllllllllIllIIlIIlIIllIlIlIlI, ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[31]]);
                        if (lIIllIIllIllIlIl(llllllllllllIllIIlIIlIIllIlIIIIl ? 1 : 0)) {
                            GL11.glTexParameteri(ShaderGroup.llIlllIlIIllIl[32], ShaderGroup.llIlllIlIIllIl[33], ShaderGroup.llIlllIlIIllIl[34]);
                            GL11.glTexParameteri(ShaderGroup.llIlllIlIIllIl[32], ShaderGroup.llIlllIlIIllIl[35], ShaderGroup.llIlllIlIIllIl[34]);
                            "".length();
                            if (((0x4A ^ 0x11) & ~(0x71 ^ 0x2A)) != 0x0) {
                                return;
                            }
                        }
                        else {
                            GL11.glTexParameteri(ShaderGroup.llIlllIlIIllIl[32], ShaderGroup.llIlllIlIIllIl[33], ShaderGroup.llIlllIlIIllIl[36]);
                            GL11.glTexParameteri(ShaderGroup.llIlllIlIIllIl[32], ShaderGroup.llIlllIlIIllIl[35], ShaderGroup.llIlllIlIIllIl[36]);
                        }
                        llllllllllllIllIIlIIlIIllIlIlllI.addAuxFramebuffer(llllllllllllIllIIlIIlIIllIlIlIIl, llllllllllllIllIIlIIlIIllIlIIlII.getGlTextureId(), llllllllllllIllIIlIIlIIllIlIIIll, llllllllllllIllIIlIIlIIllIlIIIlI);
                        "".length();
                        if (-"  ".length() > 0) {
                            return;
                        }
                    }
                    else {
                        llllllllllllIllIIlIIlIIllIlIlllI.addAuxFramebuffer(llllllllllllIllIIlIIlIIllIlIlIIl, llllllllllllIllIIlIIlIIllIlIIlll, llllllllllllIllIIlIIlIIllIlIIlll.framebufferTextureWidth, llllllllllllIllIIlIIlIIllIlIIlll.framebufferTextureHeight);
                        "".length();
                        if ("  ".length() < 0) {
                            return;
                        }
                    }
                }
                catch (Exception llllllllllllIllIIlIIlIIllIlIIIII) {
                    final JsonException llllllllllllIllIIlIIlIIllIIlllll = JsonException.func_151379_a(llllllllllllIllIIlIIlIIllIlIIIII);
                    llllllllllllIllIIlIIlIIllIIlllll.func_151380_a(String.valueOf(new StringBuilder(ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[37]]).append(llllllllllllIllIIlIIlIIllIlIllII).append(ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[38]])));
                    throw llllllllllllIllIIlIIlIIllIIlllll;
                }
                ++llllllllllllIllIIlIIlIIllIlIllII;
            }
        }
        final JsonArray llllllllllllIllIIlIIlIIllIIllllI = JsonUtils.getJsonArray(llllllllllllIllIIlIIlIIllIllIlII, ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[39]], null);
        if (lIIllIIllIlllIII(llllllllllllIllIIlIIlIIllIIllllI)) {
            int llllllllllllIllIIlIIlIIllIIlllIl = ShaderGroup.llIlllIlIIllIl[0];
            final Iterator iterator = llllllllllllIllIIlIIlIIllIIllllI.iterator();
            "".length();
            if ("   ".length() == 0) {
                return;
            }
            while (!lIIllIIllIllIllI(iterator.hasNext() ? 1 : 0)) {
                final JsonElement llllllllllllIllIIlIIlIIllIIlllII = iterator.next();
                try {
                    this.initUniform(llllllllllllIllIIlIIlIIllIIlllII);
                    "".length();
                    if (-" ".length() > 0) {
                        return;
                    }
                }
                catch (Exception llllllllllllIllIIlIIlIIllIIllIll) {
                    final JsonException llllllllllllIllIIlIIlIIllIIllIlI = JsonException.func_151379_a(llllllllllllIllIIlIIlIIllIIllIll);
                    llllllllllllIllIIlIIlIIllIIllIlI.func_151380_a(String.valueOf(new StringBuilder(ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[40]]).append(llllllllllllIllIIlIIlIIllIIlllIl).append(ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[41]])));
                    throw llllllllllllIllIIlIIlIIllIIllIlI;
                }
                ++llllllllllllIllIIlIIlIIllIIlllIl;
            }
        }
    }
    
    private static boolean lIIllIIllIllIlll(final Object llllllllllllIllIIlIIlIIIllIlIIlI) {
        return llllllllllllIllIIlIIlIIIllIlIIlI == null;
    }
    
    private static boolean lIIllIIllIlllIIl(final int llllllllllllIllIIlIIlIIIllIllIll, final int llllllllllllIllIIlIIlIIIllIllIlI) {
        return llllllllllllIllIIlIIlIIIllIllIll == llllllllllllIllIIlIIlIIIllIllIlI;
    }
    
    private static boolean lIIllIIllIllIlIl(final int llllllllllllIllIIlIIlIIIllIlIIII) {
        return llllllllllllIllIIlIIlIIIllIlIIII != 0;
    }
    
    public void loadShaderGroup(final float llllllllllllIllIIlIIlIIlIIIllllI) {
        if (lIIllIIllIllllII(lIIllIIllIlllIlI(llllllllllllIllIIlIIlIIlIIIllllI, this.field_148037_k))) {
            this.field_148036_j += 1.0f - this.field_148037_k;
            this.field_148036_j += llllllllllllIllIIlIIlIIlIIIllllI;
            "".length();
            if (-" ".length() >= (0x66 ^ 0x62)) {
                return;
            }
        }
        else {
            this.field_148036_j += llllllllllllIllIIlIIlIIlIIIllllI - this.field_148037_k;
        }
        this.field_148037_k = llllllllllllIllIIlIIlIIlIIIllllI;
        "".length();
        if (-" ".length() >= 0) {
            return;
        }
        while (!lIIllIIllIllllIl(lIIllIIllIlllIll(this.field_148036_j, 20.0f))) {
            this.field_148036_j -= 20.0f;
        }
        final char llllllllllllIllIIlIIlIIlIIIllIIl = (char)this.listShaders.iterator();
        "".length();
        if ("  ".length() <= 0) {
            return;
        }
        while (!lIIllIIllIllIllI(((Iterator)llllllllllllIllIIlIIlIIlIIIllIIl).hasNext() ? 1 : 0)) {
            final Shader llllllllllllIllIIlIIlIIlIIIlllIl = ((Iterator<Shader>)llllllllllllIllIIlIIlIIlIIIllIIl).next();
            llllllllllllIllIIlIIlIIlIIIlllIl.loadShader(this.field_148036_j / 20.0f);
        }
    }
    
    private static String lIIllIIllIllIIIl(String llllllllllllIllIIlIIlIIIllllIIll, final String llllllllllllIllIIlIIlIIIllllIlll) {
        llllllllllllIllIIlIIlIIIllllIIll = new String(Base64.getDecoder().decode(llllllllllllIllIIlIIlIIIllllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIlIIlIIIllllIllI = new StringBuilder();
        final char[] llllllllllllIllIIlIIlIIIllllIlIl = llllllllllllIllIIlIIlIIIllllIlll.toCharArray();
        int llllllllllllIllIIlIIlIIIllllIlII = ShaderGroup.llIlllIlIIllIl[0];
        final int llllllllllllIllIIlIIlIIIlllIlllI = (Object)llllllllllllIllIIlIIlIIIllllIIll.toCharArray();
        final char llllllllllllIllIIlIIlIIIlllIllIl = (char)llllllllllllIllIIlIIlIIIlllIlllI.length;
        float llllllllllllIllIIlIIlIIIlllIllII = ShaderGroup.llIlllIlIIllIl[0];
        while (lIIllIIllIlllllI((int)llllllllllllIllIIlIIlIIIlllIllII, llllllllllllIllIIlIIlIIIlllIllIl)) {
            final char llllllllllllIllIIlIIlIIIlllllIIl = llllllllllllIllIIlIIlIIIlllIlllI[llllllllllllIllIIlIIlIIIlllIllII];
            llllllllllllIllIIlIIlIIIllllIllI.append((char)(llllllllllllIllIIlIIlIIIlllllIIl ^ llllllllllllIllIIlIIlIIIllllIlIl[llllllllllllIllIIlIIlIIIllllIlII % llllllllllllIllIIlIIlIIIllllIlIl.length]));
            "".length();
            ++llllllllllllIllIIlIIlIIIllllIlII;
            ++llllllllllllIllIIlIIlIIIlllIllII;
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIlIIlIIIllllIllI);
    }
    
    static {
        lIIllIIllIllIlII();
        lIIllIIllIllIIll();
    }
    
    public void parseGroup(final TextureManager llllllllllllIllIIlIIlIIllllIllIl, final ResourceLocation llllllllllllIllIIlIIlIIllllIllII) throws IOException, JsonException, JsonSyntaxException {
        final JsonParser llllllllllllIllIIlIIlIIllllllllI = new JsonParser();
        InputStream llllllllllllIllIIlIIlIIlllllllIl = null;
        try {
            final IResource llllllllllllIllIIlIIlIIlllllllII = this.resourceManager.getResource(llllllllllllIllIIlIIlIIllllIllII);
            llllllllllllIllIIlIIlIIlllllllIl = llllllllllllIllIIlIIlIIlllllllII.getInputStream();
            final JsonObject llllllllllllIllIIlIIlIIllllllIll = llllllllllllIllIIlIIlIIllllllllI.parse(IOUtils.toString(llllllllllllIllIIlIIlIIlllllllIl, Charsets.UTF_8)).getAsJsonObject();
            if (lIIllIIllIllIlIl(JsonUtils.isJsonArray(llllllllllllIllIIlIIlIIllllllIll, ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[0]]) ? 1 : 0)) {
                final JsonArray llllllllllllIllIIlIIlIIllllllIlI = llllllllllllIllIIlIIlIIllllllIll.getAsJsonArray(ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[1]]);
                int llllllllllllIllIIlIIlIIllllllIIl = ShaderGroup.llIlllIlIIllIl[0];
                final char llllllllllllIllIIlIIlIIllllIIlII = (char)llllllllllllIllIIlIIlIIllllllIlI.iterator();
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
                while (!lIIllIIllIllIllI(((Iterator)llllllllllllIllIIlIIlIIllllIIlII).hasNext() ? 1 : 0)) {
                    final JsonElement llllllllllllIllIIlIIlIIllllllIII = ((Iterator<JsonElement>)llllllllllllIllIIlIIlIIllllIIlII).next();
                    try {
                        this.initTarget(llllllllllllIllIIlIIlIIllllllIII);
                        "".length();
                        if (" ".length() > " ".length()) {
                            return;
                        }
                    }
                    catch (Exception llllllllllllIllIIlIIlIIlllllIlll) {
                        final JsonException llllllllllllIllIIlIIlIIlllllIllI = JsonException.func_151379_a(llllllllllllIllIIlIIlIIlllllIlll);
                        llllllllllllIllIIlIIlIIlllllIllI.func_151380_a(String.valueOf(new StringBuilder(ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[2]]).append(llllllllllllIllIIlIIlIIllllllIIl).append(ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[3]])));
                        throw llllllllllllIllIIlIIlIIlllllIllI;
                    }
                    ++llllllllllllIllIIlIIlIIllllllIIl;
                }
            }
            if (lIIllIIllIllIlIl(JsonUtils.isJsonArray(llllllllllllIllIIlIIlIIllllllIll, ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[4]]) ? 1 : 0)) {
                final JsonArray llllllllllllIllIIlIIlIIlllllIlIl = llllllllllllIllIIlIIlIIllllllIll.getAsJsonArray(ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[5]]);
                int llllllllllllIllIIlIIlIIlllllIlII = ShaderGroup.llIlllIlIIllIl[0];
                final char llllllllllllIllIIlIIlIIllllIIlII = (char)llllllllllllIllIIlIIlIIlllllIlIl.iterator();
                "".length();
                if (null != null) {
                    return;
                }
                while (!lIIllIIllIllIllI(((Iterator)llllllllllllIllIIlIIlIIllllIIlII).hasNext() ? 1 : 0)) {
                    final JsonElement llllllllllllIllIIlIIlIIlllllIIll = ((Iterator<JsonElement>)llllllllllllIllIIlIIlIIllllIIlII).next();
                    try {
                        this.parsePass(llllllllllllIllIIlIIlIIllllIllIl, llllllllllllIllIIlIIlIIlllllIIll);
                        "".length();
                        if (-"  ".length() >= 0) {
                            return;
                        }
                    }
                    catch (Exception llllllllllllIllIIlIIlIIlllllIIlI) {
                        final JsonException llllllllllllIllIIlIIlIIlllllIIIl = JsonException.func_151379_a(llllllllllllIllIIlIIlIIlllllIIlI);
                        llllllllllllIllIIlIIlIIlllllIIIl.func_151380_a(String.valueOf(new StringBuilder(ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[6]]).append(llllllllllllIllIIlIIlIIlllllIlII).append(ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[7]])));
                        throw llllllllllllIllIIlIIlIIlllllIIIl;
                    }
                    ++llllllllllllIllIIlIIlIIlllllIlII;
                }
                "".length();
                if ((0x75 ^ 0x71) < "   ".length()) {
                    return;
                }
            }
        }
        catch (Exception llllllllllllIllIIlIIlIIlllllIIII) {
            final JsonException llllllllllllIllIIlIIlIIllllIllll = JsonException.func_151379_a(llllllllllllIllIIlIIlIIlllllIIII);
            llllllllllllIllIIlIIlIIllllIllll.func_151381_b(llllllllllllIllIIlIIlIIllllIllII.getResourcePath());
            throw llllllllllllIllIIlIIlIIllllIllll;
        }
        finally {
            IOUtils.closeQuietly(llllllllllllIllIIlIIlIIlllllllIl);
        }
        IOUtils.closeQuietly(llllllllllllIllIIlIIlIIlllllllIl);
    }
    
    private static void lIIllIIllIllIlII() {
        (llIlllIlIIllIl = new int[52])[0] = ((0x47 ^ 0x7D ^ (0x18 ^ 0x69)) & (43 + 123 - 65 + 26 ^ (0x9B ^ 0xAF) ^ -" ".length()));
        ShaderGroup.llIlllIlIIllIl[1] = " ".length();
        ShaderGroup.llIlllIlIIllIl[2] = "  ".length();
        ShaderGroup.llIlllIlIIllIl[3] = "   ".length();
        ShaderGroup.llIlllIlIIllIl[4] = (0x58 ^ 0x7F ^ (0xB2 ^ 0x91));
        ShaderGroup.llIlllIlIIllIl[5] = (0x4C ^ 0x49);
        ShaderGroup.llIlllIlIIllIl[6] = (0x85 ^ 0x83);
        ShaderGroup.llIlllIlIIllIl[7] = (0xBD ^ 0xBA);
        ShaderGroup.llIlllIlIIllIl[8] = (0x87 ^ 0x8F);
        ShaderGroup.llIlllIlIIllIl[9] = (0x4C ^ 0x45);
        ShaderGroup.llIlllIlIIllIl[10] = (0xB9 ^ 0xB3);
        ShaderGroup.llIlllIlIIllIl[11] = (0x72 ^ 0x79);
        ShaderGroup.llIlllIlIIllIl[12] = (166 + 47 - 93 + 47 ^ 90 + 124 - 89 + 46);
        ShaderGroup.llIlllIlIIllIl[13] = (0x2D ^ 0x29 ^ (0x44 ^ 0x4D));
        ShaderGroup.llIlllIlIIllIl[14] = (0x3B ^ 0x35);
        ShaderGroup.llIlllIlIIllIl[15] = (0x36 ^ 0x5F ^ (0xC4 ^ 0xA2));
        ShaderGroup.llIlllIlIIllIl[16] = (81 + 39 - 66 + 124 ^ 155 + 52 - 179 + 134);
        ShaderGroup.llIlllIlIIllIl[17] = (0x19 ^ 0x8);
        ShaderGroup.llIlllIlIIllIl[18] = (0x7A ^ 0x68);
        ShaderGroup.llIlllIlIIllIl[19] = (0xF ^ 0x65 ^ (0xA ^ 0x73));
        ShaderGroup.llIlllIlIIllIl[20] = (0x1F ^ 0xB);
        ShaderGroup.llIlllIlIIllIl[21] = (0x5C ^ 0x49);
        ShaderGroup.llIlllIlIIllIl[22] = (0x87 ^ 0x91);
        ShaderGroup.llIlllIlIIllIl[23] = (0x2B ^ 0x3C);
        ShaderGroup.llIlllIlIIllIl[24] = (0xE ^ 0x42 ^ (0x7B ^ 0x2F));
        ShaderGroup.llIlllIlIIllIl[25] = (1 + 160 - 90 + 109 ^ 123 + 128 - 140 + 62);
        ShaderGroup.llIlllIlIIllIl[26] = (0x6F ^ 0x75);
        ShaderGroup.llIlllIlIIllIl[27] = (0x32 ^ 0x75 ^ (0x0 ^ 0x5C));
        ShaderGroup.llIlllIlIIllIl[28] = (0x5A ^ 0xE ^ (0xD8 ^ 0x90));
        ShaderGroup.llIlllIlIIllIl[29] = (0x10 ^ 0x7D ^ (0xEB ^ 0x9B));
        ShaderGroup.llIlllIlIIllIl[30] = (0xEA ^ 0xAB ^ (0x25 ^ 0x7A));
        ShaderGroup.llIlllIlIIllIl[31] = (0x75 ^ 0x6A);
        ShaderGroup.llIlllIlIIllIl[32] = (0xFFFFFDF5 & 0xFEB);
        ShaderGroup.llIlllIlIIllIl[33] = (-(0xFFFFDFFB & 0x76FD) & (0xFFFFFFFB & 0x7EFD));
        ShaderGroup.llIlllIlIIllIl[34] = (-(0xFFFF8F5F & 0x71FF) & (0xFFFFE7FF & 0x3F5F));
        ShaderGroup.llIlllIlIIllIl[35] = (-(0xFFFFF76F & 0x5BFC) & (-1 & 0x7B6B));
        ShaderGroup.llIlllIlIIllIl[36] = (0xFFFFBE11 & 0x67EE);
        ShaderGroup.llIlllIlIIllIl[37] = (0xE ^ 0x2E);
        ShaderGroup.llIlllIlIIllIl[38] = (0xF ^ 0x2E);
        ShaderGroup.llIlllIlIIllIl[39] = (0x6A ^ 0x48);
        ShaderGroup.llIlllIlIIllIl[40] = (0x18 ^ 0x3B);
        ShaderGroup.llIlllIlIIllIl[41] = (0x7D ^ 0x59);
        ShaderGroup.llIlllIlIIllIl[42] = (64 + 49 - 106 + 156 ^ 78 + 6 + 23 + 27);
        ShaderGroup.llIlllIlIIllIl[43] = (0xD2 ^ 0x9A ^ (0xF1 ^ 0x9F));
        ShaderGroup.llIlllIlIIllIl[44] = (100 + 96 - 162 + 105 ^ 146 + 33 - 97 + 90);
        ShaderGroup.llIlllIlIIllIl[45] = (0xBC ^ 0x94);
        ShaderGroup.llIlllIlIIllIl[46] = (0x24 ^ 0x2F ^ (0x6A ^ 0x48));
        ShaderGroup.llIlllIlIIllIl[47] = (0x65 ^ 0x4F);
        ShaderGroup.llIlllIlIIllIl[48] = (0x68 ^ 0x43);
        ShaderGroup.llIlllIlIIllIl[49] = (0x76 ^ 0x5A);
        ShaderGroup.llIlllIlIIllIl[50] = (0x51 ^ 0x34 ^ (0x1 ^ 0x49));
        ShaderGroup.llIlllIlIIllIl[51] = (0x44 ^ 0x4C ^ (0x5E ^ 0x78));
    }
    
    public void createBindFramebuffers(final int llllllllllllIllIIlIIlIIlIIlIIlll, final int llllllllllllIllIIlIIlIIlIIlIlIll) {
        this.mainFramebufferWidth = this.mainFramebuffer.framebufferTextureWidth;
        this.mainFramebufferHeight = this.mainFramebuffer.framebufferTextureHeight;
        this.resetProjectionMatrix();
        Exception llllllllllllIllIIlIIlIIlIIlIIlII = (Exception)this.listShaders.iterator();
        "".length();
        if (((((0x9D ^ 0x97) & ~(0x74 ^ 0x7E)) ^ (0xA6 ^ 0x91)) & (0xD0 ^ 0xA9 ^ (0x8E ^ 0xC0) ^ -" ".length())) > 0) {
            return;
        }
        while (!lIIllIIllIllIllI(((Iterator)llllllllllllIllIIlIIlIIlIIlIIlII).hasNext() ? 1 : 0)) {
            final Shader llllllllllllIllIIlIIlIIlIIlIlIlI = ((Iterator<Shader>)llllllllllllIllIIlIIlIIlIIlIIlII).next();
            llllllllllllIllIIlIIlIIlIIlIlIlI.setProjectionMatrix(this.projectionMatrix);
        }
        llllllllllllIllIIlIIlIIlIIlIIlII = (Exception)this.listFramebuffers.iterator();
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIllIIllIllIllI(((Iterator)llllllllllllIllIIlIIlIIlIIlIIlII).hasNext() ? 1 : 0)) {
            final Framebuffer llllllllllllIllIIlIIlIIlIIlIlIIl = ((Iterator<Framebuffer>)llllllllllllIllIIlIIlIIlIIlIIlII).next();
            llllllllllllIllIIlIIlIIlIIlIlIIl.createBindFramebuffer(llllllllllllIllIIlIIlIIlIIlIIlll, llllllllllllIllIIlIIlIIlIIlIlIll);
        }
    }
    
    private static boolean lIIllIIllIllllII(final int llllllllllllIllIIlIIlIIIllIIllII) {
        return llllllllllllIllIIlIIlIIIllIIllII < 0;
    }
    
    private void resetProjectionMatrix() {
        this.projectionMatrix = new Matrix4f();
        this.projectionMatrix.setIdentity();
        "".length();
        this.projectionMatrix.m00 = 2.0f / this.mainFramebuffer.framebufferTextureWidth;
        this.projectionMatrix.m11 = 2.0f / -this.mainFramebuffer.framebufferTextureHeight;
        this.projectionMatrix.m22 = -0.0020001999f;
        this.projectionMatrix.m33 = 1.0f;
        this.projectionMatrix.m03 = -1.0f;
        this.projectionMatrix.m13 = 1.0f;
        this.projectionMatrix.m23 = -1.0001999f;
    }
    
    private void initUniform(final JsonElement llllllllllllIllIIlIIlIIlIlllIllI) throws JsonException {
        final JsonObject llllllllllllIllIIlIIlIIlIlllIlIl = JsonUtils.getJsonObject(llllllllllllIllIIlIIlIIlIlllIllI, ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[42]]);
        final String llllllllllllIllIIlIIlIIlIlllIlII = JsonUtils.getString(llllllllllllIllIIlIIlIIlIlllIlIl, ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[43]]);
        final ShaderUniform llllllllllllIllIIlIIlIIlIlllIIll = this.listShaders.get(this.listShaders.size() - ShaderGroup.llIlllIlIIllIl[1]).getShaderManager().getShaderUniform(llllllllllllIllIIlIIlIIlIlllIlII);
        if (lIIllIIllIllIlll(llllllllllllIllIIlIIlIIlIlllIIll)) {
            throw new JsonException(String.valueOf(new StringBuilder(ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[44]]).append(llllllllllllIllIIlIIlIIlIlllIlII).append(ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[45]])));
        }
        final float[] llllllllllllIllIIlIIlIIlIlllIIlI = new float[ShaderGroup.llIlllIlIIllIl[4]];
        int llllllllllllIllIIlIIlIIlIlllIIIl = ShaderGroup.llIlllIlIIllIl[0];
        final double llllllllllllIllIIlIIlIIlIllIIlIl = (double)JsonUtils.getJsonArray(llllllllllllIllIIlIIlIIlIlllIlIl, ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[46]]).iterator();
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIllIIllIllIllI(((Iterator)llllllllllllIllIIlIIlIIlIllIIlIl).hasNext() ? 1 : 0)) {
            final JsonElement llllllllllllIllIIlIIlIIlIlllIIII = ((Iterator<JsonElement>)llllllllllllIllIIlIIlIIlIllIIlIl).next();
            try {
                llllllllllllIllIIlIIlIIlIlllIIlI[llllllllllllIllIIlIIlIIlIlllIIIl] = JsonUtils.getFloat(llllllllllllIllIIlIIlIIlIlllIIII, ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[47]]);
                "".length();
                if ((31 + 68 + 16 + 18 ^ 66 + 96 - 105 + 72) > (0x1E ^ 0x9 ^ (0x90 ^ 0x83))) {
                    return;
                }
            }
            catch (Exception llllllllllllIllIIlIIlIIlIllIllll) {
                final JsonException llllllllllllIllIIlIIlIIlIllIlllI = JsonException.func_151379_a(llllllllllllIllIIlIIlIIlIllIllll);
                llllllllllllIllIIlIIlIIlIllIlllI.func_151380_a(String.valueOf(new StringBuilder(ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[48]]).append(llllllllllllIllIIlIIlIIlIlllIIIl).append(ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[49]])));
                throw llllllllllllIllIIlIIlIIlIllIlllI;
            }
            ++llllllllllllIllIIlIIlIIlIlllIIIl;
        }
        switch (llllllllllllIllIIlIIlIIlIlllIIIl) {
            default: {
                "".length();
                if (" ".length() < 0) {
                    return;
                }
                break;
            }
            case 1: {
                llllllllllllIllIIlIIlIIlIlllIIll.set(llllllllllllIllIIlIIlIIlIlllIIlI[ShaderGroup.llIlllIlIIllIl[0]]);
                "".length();
                if (-"   ".length() >= 0) {
                    return;
                }
                break;
            }
            case 2: {
                llllllllllllIllIIlIIlIIlIlllIIll.set(llllllllllllIllIIlIIlIIlIlllIIlI[ShaderGroup.llIlllIlIIllIl[0]], llllllllllllIllIIlIIlIIlIlllIIlI[ShaderGroup.llIlllIlIIllIl[1]]);
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
                break;
            }
            case 3: {
                llllllllllllIllIIlIIlIIlIlllIIll.set(llllllllllllIllIIlIIlIIlIlllIIlI[ShaderGroup.llIlllIlIIllIl[0]], llllllllllllIllIIlIIlIIlIlllIIlI[ShaderGroup.llIlllIlIIllIl[1]], llllllllllllIllIIlIIlIIlIlllIIlI[ShaderGroup.llIlllIlIIllIl[2]]);
                "".length();
                if ((0x30 ^ 0x35) <= 0) {
                    return;
                }
                break;
            }
            case 4: {
                llllllllllllIllIIlIIlIIlIlllIIll.set(llllllllllllIllIIlIIlIIlIlllIIlI[ShaderGroup.llIlllIlIIllIl[0]], llllllllllllIllIIlIIlIIlIlllIIlI[ShaderGroup.llIlllIlIIllIl[1]], llllllllllllIllIIlIIlIIlIlllIIlI[ShaderGroup.llIlllIlIIllIl[2]], llllllllllllIllIIlIIlIIlIlllIIlI[ShaderGroup.llIlllIlIIllIl[3]]);
                break;
            }
        }
    }
    
    private void initTarget(final JsonElement llllllllllllIllIIlIIlIIlllIllIIl) throws JsonException {
        if (lIIllIIllIllIlIl(JsonUtils.isString(llllllllllllIllIIlIIlIIlllIllIIl) ? 1 : 0)) {
            this.addFramebuffer(llllllllllllIllIIlIIlIIlllIllIIl.getAsString(), this.mainFramebufferWidth, this.mainFramebufferHeight);
            "".length();
            if (" ".length() < 0) {
                return;
            }
        }
        else {
            final JsonObject llllllllllllIllIIlIIlIIlllIllIII = JsonUtils.getJsonObject(llllllllllllIllIIlIIlIIlllIllIIl, ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[8]]);
            final String llllllllllllIllIIlIIlIIlllIlIlll = JsonUtils.getString(llllllllllllIllIIlIIlIIlllIllIII, ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[9]]);
            final int llllllllllllIllIIlIIlIIlllIlIllI = JsonUtils.getInt(llllllllllllIllIIlIIlIIlllIllIII, ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[10]], this.mainFramebufferWidth);
            final int llllllllllllIllIIlIIlIIlllIlIlIl = JsonUtils.getInt(llllllllllllIllIIlIIlIIlllIllIII, ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[11]], this.mainFramebufferHeight);
            if (lIIllIIllIllIlIl(this.mapFramebuffers.containsKey(llllllllllllIllIIlIIlIIlllIlIlll) ? 1 : 0)) {
                throw new JsonException(String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIIlIIlIIlllIlIlll)).append(ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[12]])));
            }
            this.addFramebuffer(llllllllllllIllIIlIIlIIlllIlIlll, llllllllllllIllIIlIIlIIlllIlIllI, llllllllllllIllIIlIIlIIlllIlIlIl);
        }
    }
    
    private static boolean lIIllIIllIllllIl(final int llllllllllllIllIIlIIlIIIllIIlIlI) {
        return llllllllllllIllIIlIIlIIIllIIlIlI <= 0;
    }
    
    private static boolean lIIllIIllIllIllI(final int llllllllllllIllIIlIIlIIIllIIlllI) {
        return llllllllllllIllIIlIIlIIIllIIlllI == 0;
    }
    
    public void deleteShaderGroup() {
        boolean llllllllllllIllIIlIIlIIlIlIIIlIl = (boolean)this.mapFramebuffers.values().iterator();
        "".length();
        if (" ".length() == 0) {
            return;
        }
        while (!lIIllIIllIllIllI(((Iterator)llllllllllllIllIIlIIlIIlIlIIIlIl).hasNext() ? 1 : 0)) {
            final Framebuffer llllllllllllIllIIlIIlIIlIlIIlIIl = ((Iterator<Framebuffer>)llllllllllllIllIIlIIlIIlIlIIIlIl).next();
            llllllllllllIllIIlIIlIIlIlIIlIIl.deleteFramebuffer();
        }
        llllllllllllIllIIlIIlIIlIlIIIlIl = (boolean)this.listShaders.iterator();
        "".length();
        if (((153 + 68 - 116 + 67 ^ 154 + 7 - 67 + 90) & (0xBA ^ 0x97 ^ (0x53 ^ 0x6A) ^ -" ".length())) < 0) {
            return;
        }
        while (!lIIllIIllIllIllI(((Iterator)llllllllllllIllIIlIIlIIlIlIIIlIl).hasNext() ? 1 : 0)) {
            final Shader llllllllllllIllIIlIIlIIlIlIIlIII = ((Iterator<Shader>)llllllllllllIllIIlIIlIIlIlIIIlIl).next();
            llllllllllllIllIIlIIlIIlIlIIlIII.deleteShader();
        }
        this.listShaders.clear();
    }
    
    public final String getShaderGroupName() {
        return this.shaderGroupName;
    }
    
    private Framebuffer getFramebuffer(final String llllllllllllIllIIlIIlIIlIIIlIIlI) {
        Framebuffer mainFramebuffer;
        if (lIIllIIllIllIlll(llllllllllllIllIIlIIlIIlIIIlIIlI)) {
            mainFramebuffer = null;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (lIIllIIllIllIlIl(llllllllllllIllIIlIIlIIlIIIlIIlI.equals(ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[50]]) ? 1 : 0)) {
            mainFramebuffer = this.mainFramebuffer;
            "".length();
            if ("  ".length() < ((0x7D ^ 0x43) & ~(0x59 ^ 0x67))) {
                return null;
            }
        }
        else {
            mainFramebuffer = this.mapFramebuffers.get(llllllllllllIllIIlIIlIIlIIIlIIlI);
        }
        return mainFramebuffer;
    }
    
    public ShaderGroup(final TextureManager llllllllllllIllIIlIIlIlIIIIlIIll, final IResourceManager llllllllllllIllIIlIIlIlIIIIlIIlI, final Framebuffer llllllllllllIllIIlIIlIlIIIIlIllI, final ResourceLocation llllllllllllIllIIlIIlIlIIIIlIlIl) throws JsonException, IOException, JsonSyntaxException {
        this.listShaders = (List<Shader>)Lists.newArrayList();
        this.mapFramebuffers = (Map<String, Framebuffer>)Maps.newHashMap();
        this.listFramebuffers = (List<Framebuffer>)Lists.newArrayList();
        this.resourceManager = llllllllllllIllIIlIIlIlIIIIlIIlI;
        this.mainFramebuffer = llllllllllllIllIIlIIlIlIIIIlIllI;
        this.field_148036_j = 0.0f;
        this.field_148037_k = 0.0f;
        this.mainFramebufferWidth = llllllllllllIllIIlIIlIlIIIIlIllI.framebufferWidth;
        this.mainFramebufferHeight = llllllllllllIllIIlIIlIlIIIIlIllI.framebufferHeight;
        this.shaderGroupName = llllllllllllIllIIlIIlIlIIIIlIlIl.toString();
        this.resetProjectionMatrix();
        this.parseGroup(llllllllllllIllIIlIIlIlIIIIlIIll, llllllllllllIllIIlIIlIlIIIIlIlIl);
    }
    
    private static int lIIllIIllIlllIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIIllIIllIlllIII(final Object llllllllllllIllIIlIIlIIIllIlIlII) {
        return llllllllllllIllIIlIIlIIIllIlIlII != null;
    }
    
    private static void lIIllIIllIllIIll() {
        (llIlllIlIIllII = new String[ShaderGroup.llIlllIlIIllIl[51]])[ShaderGroup.llIlllIlIIllIl[0]] = lIIllIIllIllIIII("tMofyC5Jz0Q=", "Dfncj");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[1]] = lIIllIIllIllIIIl("IgYGAzwiFA==", "VgtdY");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[2]] = lIIllIIllIllIIIl("PDAXEzw8Ij4=", "HQetY");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[3]] = lIIllIIllIllIIII("OhBmPYbhAwI=", "vPghV");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[4]] = lIIllIIllIllIIlI("v44K5i0Jmv0=", "JKVsw");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[5]] = lIIllIIllIllIIlI("CKhBOLoSj7g=", "NQEpU");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[6]] = lIIllIIllIllIIlI("KWidRFNkeWc=", "HNhhP");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[7]] = lIIllIIllIllIIII("JQr7UMl9Q/8=", "OccNI");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[8]] = lIIllIIllIllIIlI("sNv1KEEuCX0=", "bbCpu");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[9]] = lIIllIIllIllIIIl("KwIiPw==", "EcOZg");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[10]] = lIIllIIllIllIIlI("A7f5AJXrwEE=", "tNGQS");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[11]] = lIIllIIllIllIIlI("Q1gyO20btJU=", "tMiNI");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[12]] = lIIllIIllIllIIII("oJ5lGLs7WwKBeVFguTNliTsKGmBQvTX+", "ILCnx");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[13]] = lIIllIIllIllIIIl("IQY+PA==", "QgMOf");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[14]] = lIIllIIllIllIIlI("KwSp5fPedhs=", "wgXSZ");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[15]] = lIIllIIllIllIIII("TXoXn62ZrppkRu+xAyLVXg==", "RIcHv");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[16]] = lIIllIIllIllIIIl("KgUSEyI3FwMT", "EpfgC");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[17]] = lIIllIIllIllIIII("ABL9X/8/gwmccg/MEkTO9Q==", "ZYyiF");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[18]] = lIIllIIllIllIIlI("rcaglwHkoS1IXCVl6J7U4XnTcIprc8Xf", "pIWRe");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[19]] = lIIllIIllIllIIlI("+WxDH+aCkBlpv9ogU+4Q7Q==", "VrtBs");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[20]] = lIIllIIllIllIIIl("dk4FLBciTg8sBnELGSoBJQ==", "QnaCr");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[21]] = lIIllIIllIllIIlI("O7STuUvMonq/o6aYUQL5kA==", "zGDQh");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[22]] = lIIllIIllIllIIIl("BQMRLTEWEQwt", "dviYP");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[23]] = lIIllIIllIllIIII("FyChWGw/Bi0=", "FEIHi");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[24]] = lIIllIIllIllIIII("lE6ThPB/Y2c=", "FvIos");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[25]] = lIIllIIllIllIIII("uPI0UYIyO+qtJXApOOguR+wiNX8pRXZw", "KYPzz");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[26]] = lIIllIIllIllIIIl("WgAYPw==", "tpvXb");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[27]] = lIIllIIllIllIIIl("MzIJDwQTdxMKEwYyE0sOE3cTDhkVIhUOQUY=", "aWgka");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[28]] = lIIllIIllIllIIII("1IYsRtVgN+0DJB/qgcpWnwA5T+g0gU1S", "ZsUuF");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[29]] = lIIllIIllIllIIII("4hoeEB7MfZE=", "FiGQq");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[30]] = lIIllIIllIllIIlI("N7fBfMzWyz0=", "bWQoC");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[31]] = lIIllIIllIllIIII("t49UeL2EkavNnwAhftH9zg==", "ERPEf");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[37]] = lIIllIIllIllIIlI("5WWmSpA0m4x2Fv+ONCq4Mg==", "NwyfK");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[38]] = lIIllIIllIllIIII("0AsSPhRNacI=", "jWzba");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[39]] = lIIllIIllIllIIlI("KieuQ/eyCOixNym+4Uajyg==", "zAzsa");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[40]] = lIIllIIllIllIIIl("PQA4Dxo6AyIy", "HnQiu");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[41]] = lIIllIIllIllIIIl("Mw==", "nGXdZ");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[42]] = lIIllIIllIllIIIl("JCI/Aj8jIQ==", "QLVdP");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[43]] = lIIllIIllIllIIII("mpvu58LTjlA=", "hGpFU");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[44]] = lIIllIIllIllIIIl("HwoTNyE4CVp2", "JdzQN");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[45]] = lIIllIIllIllIIII("/sLjnU/ZBOVKN8S3MlgWpSaVwdEUvZbj", "gNQQT");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[46]] = lIIllIIllIllIIlI("uEnl2cPj3eU=", "VfGqt");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[47]] = lIIllIIllIllIIlI("dk4brIThSJA=", "hVQkb");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[48]] = lIIllIIllIllIIII("N/GEpJV1W9k=", "Iqnnh");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[49]] = lIIllIIllIllIIII("1Bqv8AREUJo=", "BSgDX");
        ShaderGroup.llIlllIlIIllII[ShaderGroup.llIlllIlIIllIl[50]] = lIIllIIllIllIIIl("GAEGLwgHCQ4+URgJASQ=", "uhhJk");
    }
    
    private static int lIIllIIllIlllIlI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public void addFramebuffer(final String llllllllllllIllIIlIIlIIlIlIlIllI, final int llllllllllllIllIIlIIlIIlIlIlIlIl, final int llllllllllllIllIIlIIlIIlIlIIllll) {
        final Framebuffer llllllllllllIllIIlIIlIIlIlIlIIll = new Framebuffer(llllllllllllIllIIlIIlIIlIlIlIlIl, llllllllllllIllIIlIIlIIlIlIIllll, (boolean)(ShaderGroup.llIlllIlIIllIl[1] != 0));
        llllllllllllIllIIlIIlIIlIlIlIIll.setFramebufferColor(0.0f, 0.0f, 0.0f, 0.0f);
        this.mapFramebuffers.put(llllllllllllIllIIlIIlIIlIlIlIllI, llllllllllllIllIIlIIlIIlIlIlIIll);
        "".length();
        if (lIIllIIllIlllIIl(llllllllllllIllIIlIIlIIlIlIlIlIl, this.mainFramebufferWidth) && lIIllIIllIlllIIl(llllllllllllIllIIlIIlIIlIlIIllll, this.mainFramebufferHeight)) {
            this.listFramebuffers.add(llllllllllllIllIIlIIlIIlIlIlIIll);
            "".length();
        }
    }
    
    private static String lIIllIIllIllIIII(final String llllllllllllIllIIlIIlIIIlllIIIIl, final String llllllllllllIllIIlIIlIIIlllIIIII) {
        try {
            final SecretKeySpec llllllllllllIllIIlIIlIIIlllIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIlIIIlllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlIIlIIIlllIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlIIlIIIlllIIlIl.init(ShaderGroup.llIlllIlIIllIl[2], llllllllllllIllIIlIIlIIIlllIIllI);
            return new String(llllllllllllIllIIlIIlIIIlllIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIlIIIlllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIIlIIIlllIIlII) {
            llllllllllllIllIIlIIlIIIlllIIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllIIllIlllllI(final int llllllllllllIllIIlIIlIIIllIlIlll, final int llllllllllllIllIIlIIlIIIllIlIllI) {
        return llllllllllllIllIIlIIlIIIllIlIlll < llllllllllllIllIIlIIlIIIllIlIllI;
    }
    
    private static String lIIllIIllIllIIlI(final String llllllllllllIllIIlIIlIIlIIIIIllI, final String llllllllllllIllIIlIIlIIlIIIIIlll) {
        try {
            final SecretKeySpec llllllllllllIllIIlIIlIIlIIIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIlIIlIIIIIlll.getBytes(StandardCharsets.UTF_8)), ShaderGroup.llIlllIlIIllIl[8]), "DES");
            final Cipher llllllllllllIllIIlIIlIIlIIIIlIlI = Cipher.getInstance("DES");
            llllllllllllIllIIlIIlIIlIIIIlIlI.init(ShaderGroup.llIlllIlIIllIl[2], llllllllllllIllIIlIIlIIlIIIIlIll);
            return new String(llllllllllllIllIIlIIlIIlIIIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIlIIlIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIIlIIlIIIIlIIl) {
            llllllllllllIllIIlIIlIIlIIIIlIIl.printStackTrace();
            return null;
        }
    }
}
