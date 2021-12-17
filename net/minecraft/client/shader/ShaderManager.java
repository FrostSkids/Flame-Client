// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.shader;

import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import com.google.common.base.Charsets;
import net.minecraft.util.ResourceLocation;
import com.google.gson.JsonParser;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import net.minecraft.client.resources.IResourceManager;
import java.util.Arrays;
import java.util.Iterator;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.client.util.JsonException;
import net.minecraft.util.JsonUtils;
import com.google.gson.JsonElement;
import net.minecraft.client.util.JsonBlendingMode;
import org.apache.logging.log4j.Logger;
import java.util.Map;
import java.util.List;

public class ShaderManager
{
    private final /* synthetic */ boolean useFaceCulling;
    private final /* synthetic */ List<Integer> attribLocations;
    private /* synthetic */ boolean isDirty;
    private final /* synthetic */ ShaderLoader fragmentShaderLoader;
    private static final /* synthetic */ ShaderDefault defaultShaderUniform;
    private final /* synthetic */ List<String> attributes;
    private final /* synthetic */ Map<String, ShaderUniform> mappedShaderUniforms;
    private static final /* synthetic */ Logger logger;
    private static /* synthetic */ int currentProgram;
    private final /* synthetic */ JsonBlendingMode field_148016_p;
    private static final /* synthetic */ int[] lIlIlIlIIlIlll;
    private static /* synthetic */ ShaderManager staticShaderManager;
    private final /* synthetic */ List<Integer> shaderSamplerLocations;
    private final /* synthetic */ List<Integer> shaderUniformLocations;
    private final /* synthetic */ List<ShaderUniform> shaderUniforms;
    private final /* synthetic */ List<String> samplerNames;
    private final /* synthetic */ ShaderLoader vertexShaderLoader;
    private static final /* synthetic */ String[] lIlIlIlIIIIlIl;
    private final /* synthetic */ Map<String, Object> shaderSamplers;
    private static /* synthetic */ boolean field_148000_e;
    private final /* synthetic */ int program;
    private final /* synthetic */ String programFilename;
    
    private void parseUniform(final JsonElement lllllllllllllIIIlIIIIllllIIIIIII) throws JsonException {
        final JsonObject lllllllllllllIIIlIIIIlllIlllllll = JsonUtils.getJsonObject(lllllllllllllIIIlIIIIllllIIIIIII, ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[26]]);
        final String lllllllllllllIIIlIIIIlllIllllllI = JsonUtils.getString(lllllllllllllIIIlIIIIlllIlllllll, ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[27]]);
        final int lllllllllllllIIIlIIIIlllIlllllIl = ShaderUniform.parseType(JsonUtils.getString(lllllllllllllIIIlIIIIlllIlllllll, ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[28]]));
        final int lllllllllllllIIIlIIIIlllIlllllII = JsonUtils.getInt(lllllllllllllIIIlIIIIlllIlllllll, ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[29]]);
        final float[] lllllllllllllIIIlIIIIlllIllllIll = new float[Math.max(lllllllllllllIIIlIIIIlllIlllllII, ShaderManager.lIlIlIlIIlIlll[17])];
        final JsonArray lllllllllllllIIIlIIIIlllIllllIlI = JsonUtils.getJsonArray(lllllllllllllIIIlIIIIlllIlllllll, ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[30]]);
        if (lllIllIllllllll(lllllllllllllIIIlIIIIlllIllllIlI.size(), lllllllllllllIIIlIIIIlllIlllllII) && lllIlllIIIIIIlI(lllllllllllllIIIlIIIIlllIllllIlI.size(), ShaderManager.lIlIlIlIIlIlll[1])) {
            throw new JsonException(String.valueOf(new StringBuilder(ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[31]]).append(lllllllllllllIIIlIIIIlllIlllllII).append(ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[32]]).append(lllllllllllllIIIlIIIIlllIllllIlI.size()).append(ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[33]])));
        }
        int lllllllllllllIIIlIIIIlllIllllIIl = ShaderManager.lIlIlIlIIlIlll[2];
        final double lllllllllllllIIIlIIIIlllIllIlIIl = (double)lllllllllllllIIIlIIIIlllIllllIlI.iterator();
        "".length();
        if (-" ".length() == " ".length()) {
            return;
        }
        while (!lllIllIllllllIl(((Iterator)lllllllllllllIIIlIIIIlllIllIlIIl).hasNext() ? 1 : 0)) {
            final JsonElement lllllllllllllIIIlIIIIlllIllllIII = ((Iterator<JsonElement>)lllllllllllllIIIlIIIIlllIllIlIIl).next();
            try {
                lllllllllllllIIIlIIIIlllIllllIll[lllllllllllllIIIlIIIIlllIllllIIl] = JsonUtils.getFloat(lllllllllllllIIIlIIIIlllIllllIII, ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[34]]);
                "".length();
                if ("   ".length() == " ".length()) {
                    return;
                }
            }
            catch (Exception lllllllllllllIIIlIIIIlllIlllIlll) {
                final JsonException lllllllllllllIIIlIIIIlllIlllIllI = JsonException.func_151379_a(lllllllllllllIIIlIIIIlllIlllIlll);
                lllllllllllllIIIlIIIIlllIlllIllI.func_151380_a(String.valueOf(new StringBuilder(ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[35]]).append(lllllllllllllIIIlIIIIlllIllllIIl).append(ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[36]])));
                throw lllllllllllllIIIlIIIIlllIlllIllI;
            }
            ++lllllllllllllIIIlIIIIlllIllllIIl;
        }
        if (lllIlllIIIIIIlI(lllllllllllllIIIlIIIIlllIlllllII, ShaderManager.lIlIlIlIIlIlll[1]) && lllIlllIIIIIIIl(lllllllllllllIIIlIIIIlllIllllIlI.size(), ShaderManager.lIlIlIlIIlIlll[1])) {
            "".length();
            if (((0x6D ^ 0x47) & ~(0x5A ^ 0x70)) >= "  ".length()) {
                return;
            }
            while (!lllIllIlllllllI(lllllllllllllIIIlIIIIlllIllllIIl, lllllllllllllIIIlIIIIlllIlllllII)) {
                lllllllllllllIIIlIIIIlllIllllIll[lllllllllllllIIIlIIIIlllIllllIIl] = lllllllllllllIIIlIIIIlllIllllIll[ShaderManager.lIlIlIlIIlIlll[2]];
                ++lllllllllllllIIIlIIIIlllIllllIIl;
            }
        }
        int n;
        if (lllIlllIIIIIIlI(lllllllllllllIIIlIIIIlllIlllllII, ShaderManager.lIlIlIlIIlIlll[1]) && lllIlllIIIIIIll(lllllllllllllIIIlIIIIlllIlllllII, ShaderManager.lIlIlIlIIlIlll[5]) && lllIlllIIIIIlII(lllllllllllllIIIlIIIIlllIlllllIl, ShaderManager.lIlIlIlIIlIlll[9])) {
            n = lllllllllllllIIIlIIIIlllIlllllII - ShaderManager.lIlIlIlIIlIlll[1];
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else {
            n = ShaderManager.lIlIlIlIIlIlll[2];
        }
        final int lllllllllllllIIIlIIIIlllIlllIlIl = n;
        final ShaderUniform lllllllllllllIIIlIIIIlllIlllIlII = new ShaderUniform(lllllllllllllIIIlIIIIlllIllllllI, lllllllllllllIIIlIIIIlllIlllllIl + lllllllllllllIIIlIIIIlllIlllIlIl, lllllllllllllIIIlIIIIlllIlllllII, this);
        if (lllIlllIIIIIIll(lllllllllllllIIIlIIIIlllIlllllIl, ShaderManager.lIlIlIlIIlIlll[4])) {
            lllllllllllllIIIlIIIIlllIlllIlII.set((int)lllllllllllllIIIlIIIIlllIllllIll[ShaderManager.lIlIlIlIIlIlll[2]], (int)lllllllllllllIIIlIIIIlllIllllIll[ShaderManager.lIlIlIlIIlIlll[1]], (int)lllllllllllllIIIlIIIIlllIllllIll[ShaderManager.lIlIlIlIIlIlll[3]], (int)lllllllllllllIIIlIIIIlllIllllIll[ShaderManager.lIlIlIlIIlIlll[4]]);
            "".length();
            if (-" ".length() > (134 + 26 - 25 + 10 ^ 130 + 120 - 171 + 70)) {
                return;
            }
        }
        else if (lllIlllIIIIIIll(lllllllllllllIIIlIIIIlllIlllllIl, ShaderManager.lIlIlIlIIlIlll[8])) {
            lllllllllllllIIIlIIIIlllIlllIlII.func_148092_b(lllllllllllllIIIlIIIIlllIllllIll[ShaderManager.lIlIlIlIIlIlll[2]], lllllllllllllIIIlIIIIlllIllllIll[ShaderManager.lIlIlIlIIlIlll[1]], lllllllllllllIIIlIIIIlllIllllIll[ShaderManager.lIlIlIlIIlIlll[3]], lllllllllllllIIIlIIIIlllIllllIll[ShaderManager.lIlIlIlIIlIlll[4]]);
            "".length();
            if (-" ".length() > "  ".length()) {
                return;
            }
        }
        else {
            lllllllllllllIIIlIIIIlllIlllIlII.set(lllllllllllllIIIlIIIIlllIllllIll);
        }
        this.shaderUniforms.add(lllllllllllllIIIlIIIIlllIlllIlII);
        "".length();
    }
    
    private static String lllIllIlIllllIl(final String lllllllllllllIIIlIIIIlllIIlllllI, final String lllllllllllllIIIlIIIIlllIIlllIll) {
        try {
            final SecretKeySpec lllllllllllllIIIlIIIIlllIlIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIIIlllIIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIIIIlllIlIIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIIIIlllIlIIIIII.init(ShaderManager.lIlIlIlIIlIlll[3], lllllllllllllIIIlIIIIlllIlIIIIIl);
            return new String(lllllllllllllIIIlIIIIlllIlIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIIIlllIIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIIIIlllIIllllll) {
            lllllllllllllIIIlIIIIlllIIllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIlllIIIIIIll(final int lllllllllllllIIIlIIIIlllIIIlllIl, final int lllllllllllllIIIlIIIIlllIIIlllII) {
        return lllllllllllllIIIlIIIIlllIIIlllIl <= lllllllllllllIIIlIIIIlllIIIlllII;
    }
    
    public ShaderUniform getShaderUniformOrDefault(final String lllllllllllllIIIlIIIIllllIlllIlI) {
        ShaderUniform defaultShaderUniform;
        if (lllIlllIIIIIIII(this.mappedShaderUniforms.containsKey(lllllllllllllIIIlIIIIllllIlllIlI) ? 1 : 0)) {
            defaultShaderUniform = this.mappedShaderUniforms.get(lllllllllllllIIIlIIIIllllIlllIlI);
            "".length();
            if ((0x80 ^ 0x84) <= 0) {
                return null;
            }
        }
        else {
            defaultShaderUniform = ShaderManager.defaultShaderUniform;
        }
        return defaultShaderUniform;
    }
    
    public void useShader() {
        this.isDirty = (ShaderManager.lIlIlIlIIlIlll[2] != 0);
        ShaderManager.staticShaderManager = this;
        this.field_148016_p.func_148109_a();
        if (lllIllIllllllll(this.program, ShaderManager.currentProgram)) {
            OpenGlHelper.glUseProgram(this.program);
            ShaderManager.currentProgram = this.program;
        }
        if (lllIlllIIIIIIII(this.useFaceCulling ? 1 : 0)) {
            GlStateManager.enableCull();
            "".length();
            if (((151 + 87 - 191 + 115 ^ 124 + 136 - 148 + 42) & (0x2C ^ 0x76 ^ (0xFA ^ 0x98) ^ -" ".length())) == -" ".length()) {
                return;
            }
        }
        else {
            GlStateManager.disableCull();
        }
        int lllllllllllllIIIlIIIIlllllIIlllI = ShaderManager.lIlIlIlIIlIlll[2];
        "".length();
        if ("  ".length() < 0) {
            return;
        }
        while (!lllIllIlllllllI(lllllllllllllIIIlIIIIlllllIIlllI, this.shaderSamplerLocations.size())) {
            if (lllIllIllllllII(this.shaderSamplers.get(this.samplerNames.get(lllllllllllllIIIlIIIIlllllIIlllI)))) {
                GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit + lllllllllllllIIIlIIIIlllllIIlllI);
                GlStateManager.enableTexture2D();
                final Object lllllllllllllIIIlIIIIlllllIIllIl = this.shaderSamplers.get(this.samplerNames.get(lllllllllllllIIIlIIIIlllllIIlllI));
                int lllllllllllllIIIlIIIIlllllIIllII = ShaderManager.lIlIlIlIIlIlll[0];
                if (lllIlllIIIIIIII((lllllllllllllIIIlIIIIlllllIIllIl instanceof Framebuffer) ? 1 : 0)) {
                    lllllllllllllIIIlIIIIlllllIIllII = ((Framebuffer)lllllllllllllIIIlIIIIlllllIIllIl).framebufferTexture;
                    "".length();
                    if (((0x93 ^ 0x8F ^ (0x24 ^ 0x6E)) & (" ".length() ^ (0xC8 ^ 0x9F) ^ -" ".length())) != 0x0) {
                        return;
                    }
                }
                else if (lllIlllIIIIIIII((lllllllllllllIIIlIIIIlllllIIllIl instanceof ITextureObject) ? 1 : 0)) {
                    lllllllllllllIIIlIIIIlllllIIllII = ((ITextureObject)lllllllllllllIIIlIIIIlllllIIllIl).getGlTextureId();
                    "".length();
                    if ((0xE9 ^ 0xC2 ^ (0x3F ^ 0x10)) < 0) {
                        return;
                    }
                }
                else if (lllIlllIIIIIIII((lllllllllllllIIIlIIIIlllllIIllIl instanceof Integer) ? 1 : 0)) {
                    lllllllllllllIIIlIIIIlllllIIllII = (int)lllllllllllllIIIlIIIIlllllIIllIl;
                }
                if (lllIllIllllllll(lllllllllllllIIIlIIIIlllllIIllII, ShaderManager.lIlIlIlIIlIlll[0])) {
                    GlStateManager.bindTexture(lllllllllllllIIIlIIIIlllllIIllII);
                    OpenGlHelper.glUniform1i(OpenGlHelper.glGetUniformLocation(this.program, this.samplerNames.get(lllllllllllllIIIlIIIIlllllIIlllI)), lllllllllllllIIIlIIIIlllllIIlllI);
                }
            }
            ++lllllllllllllIIIlIIIIlllllIIlllI;
        }
        final Iterator<ShaderUniform> iterator = this.shaderUniforms.iterator();
        "".length();
        if (null != null) {
            return;
        }
        while (!lllIllIllllllIl(iterator.hasNext() ? 1 : 0)) {
            final ShaderUniform lllllllllllllIIIlIIIIlllllIIlIll = iterator.next();
            lllllllllllllIIIlIIIIlllllIIlIll.upload();
        }
    }
    
    private static boolean lllIllIllllllll(final int lllllllllllllIIIlIIIIlllIIIIllll, final int lllllllllllllIIIlIIIIlllIIIIlllI) {
        return lllllllllllllIIIlIIIIlllIIIIllll != lllllllllllllIIIlIIIIlllIIIIlllI;
    }
    
    public ShaderUniform getShaderUniform(final String lllllllllllllIIIlIIIIlllllIIIIII) {
        ShaderUniform shaderUniform;
        if (lllIlllIIIIIIII(this.mappedShaderUniforms.containsKey(lllllllllllllIIIlIIIIlllllIIIIII) ? 1 : 0)) {
            shaderUniform = this.mappedShaderUniforms.get(lllllllllllllIIIlIIIIlllllIIIIII);
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        else {
            shaderUniform = null;
        }
        return shaderUniform;
    }
    
    private void setupUniforms() {
        int lllllllllllllIIIlIIIIllllIllIIII = ShaderManager.lIlIlIlIIlIlll[2];
        int lllllllllllllIIIlIIIIllllIlIllll = ShaderManager.lIlIlIlIIlIlll[2];
        "".length();
        if (-" ".length() == "   ".length()) {
            return;
        }
        while (!lllIllIlllllllI(lllllllllllllIIIlIIIIllllIllIIII, this.samplerNames.size())) {
            final String lllllllllllllIIIlIIIIllllIlIlllI = this.samplerNames.get(lllllllllllllIIIlIIIIllllIllIIII);
            final int lllllllllllllIIIlIIIIllllIlIllIl = OpenGlHelper.glGetUniformLocation(this.program, lllllllllllllIIIlIIIIllllIlIlllI);
            if (lllIlllIIIIIIIl(lllllllllllllIIIlIIIIllllIlIllIl, ShaderManager.lIlIlIlIIlIlll[0])) {
                ShaderManager.logger.warn(String.valueOf(new StringBuilder(ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[17]]).append(this.programFilename).append(ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[18]]).append(lllllllllllllIIIlIIIIllllIlIlllI).append(ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[19]])));
                this.shaderSamplers.remove(lllllllllllllIIIlIIIIllllIlIlllI);
                "".length();
                this.samplerNames.remove(lllllllllllllIIIlIIIIllllIlIllll);
                "".length();
                --lllllllllllllIIIlIIIIllllIlIllll;
                "".length();
                if (-(124 + 32 - 27 + 29 ^ 36 + 82 - 19 + 55) > 0) {
                    return;
                }
            }
            else {
                this.shaderSamplerLocations.add(lllllllllllllIIIlIIIIllllIlIllIl);
                "".length();
            }
            ++lllllllllllllIIIlIIIIllllIllIIII;
            ++lllllllllllllIIIlIIIIllllIlIllll;
        }
        final Iterator<ShaderUniform> iterator = this.shaderUniforms.iterator();
        "".length();
        if ("   ".length() == 0) {
            return;
        }
        while (!lllIllIllllllIl(iterator.hasNext() ? 1 : 0)) {
            final ShaderUniform lllllllllllllIIIlIIIIllllIlIllII = iterator.next();
            final String lllllllllllllIIIlIIIIllllIlIlIll = lllllllllllllIIIlIIIIllllIlIllII.getShaderName();
            final int lllllllllllllIIIlIIIIllllIlIlIlI = OpenGlHelper.glGetUniformLocation(this.program, lllllllllllllIIIlIIIIllllIlIlIll);
            if (lllIlllIIIIIIIl(lllllllllllllIIIlIIIIllllIlIlIlI, ShaderManager.lIlIlIlIIlIlll[0])) {
                ShaderManager.logger.warn(String.valueOf(new StringBuilder(ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[20]]).append(lllllllllllllIIIlIIIIllllIlIlIll).append(ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[21]]).append(ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[22]])));
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
                continue;
            }
            else {
                this.shaderUniformLocations.add(lllllllllllllIIIlIIIIllllIlIlIlI);
                "".length();
                lllllllllllllIIIlIIIIllllIlIllII.setUniformLocation(lllllllllllllIIIlIIIIllllIlIlIlI);
                this.mappedShaderUniforms.put(lllllllllllllIIIlIIIIllllIlIlIll, lllllllllllllIIIlIIIIllllIlIllII);
                "".length();
            }
        }
    }
    
    public void addSamplerTexture(final String lllllllllllllIIIlIIIIllllIIlIIll, final Object lllllllllllllIIIlIIIIllllIIlIIlI) {
        if (lllIlllIIIIIIII(this.shaderSamplers.containsKey(lllllllllllllIIIlIIIIllllIIlIIll) ? 1 : 0)) {
            this.shaderSamplers.remove(lllllllllllllIIIlIIIIllllIIlIIll);
            "".length();
        }
        this.shaderSamplers.put(lllllllllllllIIIlIIIIllllIIlIIll, lllllllllllllIIIlIIIIllllIIlIIlI);
        "".length();
        this.markDirty();
    }
    
    private static String lllIllIlIlllIll(String lllllllllllllIIIlIIIIlllIlIIlllI, final String lllllllllllllIIIlIIIIlllIlIIllIl) {
        lllllllllllllIIIlIIIIlllIlIIlllI = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlIIIIlllIlIIlllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIIIIlllIlIlIIIl = new StringBuilder();
        final char[] lllllllllllllIIIlIIIIlllIlIlIIII = lllllllllllllIIIlIIIIlllIlIIllIl.toCharArray();
        int lllllllllllllIIIlIIIIlllIlIIllll = ShaderManager.lIlIlIlIIlIlll[2];
        final byte lllllllllllllIIIlIIIIlllIlIIlIIl = (Object)((String)lllllllllllllIIIlIIIIlllIlIIlllI).toCharArray();
        final byte lllllllllllllIIIlIIIIlllIlIIlIII = (byte)lllllllllllllIIIlIIIIlllIlIIlIIl.length;
        float lllllllllllllIIIlIIIIlllIlIIIlll = ShaderManager.lIlIlIlIIlIlll[2];
        while (lllIlllIIIIIlII((int)lllllllllllllIIIlIIIIlllIlIIIlll, lllllllllllllIIIlIIIIlllIlIIlIII)) {
            final char lllllllllllllIIIlIIIIlllIlIlIlII = lllllllllllllIIIlIIIIlllIlIIlIIl[lllllllllllllIIIlIIIIlllIlIIIlll];
            lllllllllllllIIIlIIIIlllIlIlIIIl.append((char)(lllllllllllllIIIlIIIIlllIlIlIlII ^ lllllllllllllIIIlIIIIlllIlIlIIII[lllllllllllllIIIlIIIIlllIlIIllll % lllllllllllllIIIlIIIIlllIlIlIIII.length]));
            "".length();
            ++lllllllllllllIIIlIIIIlllIlIIllll;
            ++lllllllllllllIIIlIIIIlllIlIIIlll;
            "".length();
            if (((0xF9 ^ 0xB7) & ~(0x39 ^ 0x77)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIIIIlllIlIlIIIl);
    }
    
    private static void lllIllIllIIIIlI() {
        (lIlIlIlIIIIlIl = new String[ShaderManager.lIlIlIlIIlIlll[37]])[ShaderManager.lIlIlIlIIlIlll[2]] = lllIllIlIlllIll("OworLik6EWU6PicFOCshZw==", "HbJJL");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[1]] = lllIllIlIllllII("20we9+3sRko=", "yveaY");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[3]] = lllIllIlIllllIl("KYblzszCQp8=", "nNATp");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[4]] = lllIllIlIlllIll("CDAwCgALLCU=", "nBQmm");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[5]] = lllIllIlIllllII("9wspZ5v0HNFu83YcK6IfGA==", "klwpu");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[6]] = lllIllIlIllllII("8deceFJdllJv8grTqqPbnA==", "iTEYr");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[7]] = lllIllIlIllllIl("0TacUwrAGcQ=", "TCpCx");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[8]] = lllIllIlIllllIl("zb5x8QbqrMV39TagwmKEFQ==", "SELxR");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[9]] = lllIllIlIllllIl("Bwi8J6SPH+Hcsw/GomtbYg==", "rjuqa");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[10]] = lllIllIlIlllIll("MRUZKj4yFBk9JAs=", "PamXW");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[11]] = lllIllIlIllllII("TtbiFt+DGJk=", "YjrKt");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[12]] = lllIllIlIllllIl("h5QYoQKPPsFc4kadD8Zq7Q==", "bNluh");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[13]] = lllIllIlIllllII("6WjMBF+jykyl79t3nY4Qgw==", "qzwbt");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[14]] = lllIllIlIlllIll("OQ==", "dGHBM");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[15]] = lllIllIlIlllIll("DTsILwo=", "oWmAn");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[16]] = lllIllIlIlllIll("BDccDw==", "gBpcx");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[17]] = lllIllIlIllllII("LDOf/MJaqLA=", "lrqJz");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[18]] = lllIllIlIlllIll("IA02IiVjDCw6YSULLSphMAMuPi0mEGMgIC4HJ24=", "CbCNA");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[19]] = lllIllIlIllllIl("BBz7940W5nCdN6cOy539Tg+MkHWkYedQngW1S0AiR5thciK7sJ/tYw==", "XljoJ");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[20]] = lllIllIlIlllIll("FxozGQB0GykBRDIcKBFEIRsvEwsmGGYbBTkQIlU=", "TuFud");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[21]] = lllIllIlIllllII("X8mDiyTxfuK4xGAVyamZNwSdELrsJoq7", "aToeU");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[22]] = lllIllIlIlllIll("Whg8DSofGXQcPBUMJg0jVA==", "zkTlN");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[23]] = lllIllIlIllllIl("s6RykuEarKE=", "wjPjp");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[24]] = lllIllIlIllllIl("D07INzVtX9A=", "mWBQc");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[25]] = lllIllIlIlllIll("JR8hCw==", "CvMnH");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[26]] = lllIllIlIlllIll("GgYqKAMdBQ==", "ohCNl");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[27]] = lllIllIlIlllIll("ARQoEw==", "ouEvo");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[28]] = lllIllIlIllllII("ZVxDbYXGrWE=", "HErDG");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[29]] = lllIllIlIllllIl("5etXgfizfLI=", "zWVBA");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[30]] = lllIllIlIlllIll("PDk9Dw85", "JXQzj");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[31]] = lllIllIlIllllII("emlfK1WkRs18nUiuQZbXgLG1nVzcGorX3X+8H9c71DbP+Qu7Y5QGQTwbjSdi95tT", "slXOr");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[32]] = lllIllIlIllllIl("eNmGH81J5JqjAcjxZzEWvw==", "Jrckk");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[33]] = lllIllIlIllllII("165rYEOOze8=", "KWoyZ");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[34]] = lllIllIlIlllIll("LzQlAjQ=", "YUIwQ");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[35]] = lllIllIlIlllIll("LAwrIhYpNg==", "ZmGWs");
        ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[36]] = lllIllIlIllllII("eBK8tzwK81s=", "BhBBw");
    }
    
    private static void lllIllIlllllIll() {
        (lIlIlIlIIlIlll = new int[38])[0] = -" ".length();
        ShaderManager.lIlIlIlIIlIlll[1] = " ".length();
        ShaderManager.lIlIlIlIIlIlll[2] = ((0xF ^ 0x45) & ~(0x2A ^ 0x60));
        ShaderManager.lIlIlIlIIlIlll[3] = "  ".length();
        ShaderManager.lIlIlIlIIlIlll[4] = "   ".length();
        ShaderManager.lIlIlIlIIlIlll[5] = (0x4 ^ 0x0);
        ShaderManager.lIlIlIlIIlIlll[6] = (0xFC ^ 0x85 ^ (0xBC ^ 0xC0));
        ShaderManager.lIlIlIlIIlIlll[7] = (40 + 62 + 14 + 44 ^ 124 + 23 - 59 + 78);
        ShaderManager.lIlIlIlIIlIlll[8] = (83 + 130 - 138 + 68 ^ 127 + 22 - 27 + 14);
        ShaderManager.lIlIlIlIIlIlll[9] = (0xA8 ^ 0xA0);
        ShaderManager.lIlIlIlIIlIlll[10] = (0x5 ^ 0xC);
        ShaderManager.lIlIlIlIIlIlll[11] = (0xD ^ 0x38 ^ (0x31 ^ 0xE));
        ShaderManager.lIlIlIlIIlIlll[12] = (0x11 ^ 0x5B ^ (0x69 ^ 0x28));
        ShaderManager.lIlIlIlIIlIlll[13] = (0xF6 ^ 0x87 ^ (0xD2 ^ 0xAF));
        ShaderManager.lIlIlIlIIlIlll[14] = (0x9A ^ 0x97);
        ShaderManager.lIlIlIlIIlIlll[15] = (53 + 47 - 86 + 176 ^ 87 + 171 - 186 + 104);
        ShaderManager.lIlIlIlIIlIlll[16] = (0x2F ^ 0x20);
        ShaderManager.lIlIlIlIIlIlll[17] = (0x81 ^ 0x91);
        ShaderManager.lIlIlIlIIlIlll[18] = (0x5D ^ 0x7A ^ (0x39 ^ 0xF));
        ShaderManager.lIlIlIlIIlIlll[19] = (0xA4 ^ 0xB6);
        ShaderManager.lIlIlIlIIlIlll[20] = (109 + 39 - 122 + 158 ^ 24 + 105 - 19 + 61);
        ShaderManager.lIlIlIlIIlIlll[21] = (0x85 ^ 0xA4 ^ (0x20 ^ 0x15));
        ShaderManager.lIlIlIlIIlIlll[22] = (65 + 72 - 20 + 31 ^ 105 + 14 - 118 + 128);
        ShaderManager.lIlIlIlIIlIlll[23] = (0x3F ^ 0x46 ^ (0x16 ^ 0x79));
        ShaderManager.lIlIlIlIIlIlll[24] = (0x60 ^ 0x72 ^ (0x55 ^ 0x50));
        ShaderManager.lIlIlIlIIlIlll[25] = (0x6D ^ 0x7 ^ (0xC2 ^ 0xB0));
        ShaderManager.lIlIlIlIIlIlll[26] = (0x5 ^ 0x1C);
        ShaderManager.lIlIlIlIIlIlll[27] = (0x14 ^ 0xE);
        ShaderManager.lIlIlIlIIlIlll[28] = (0x0 ^ 0x28 ^ (0x46 ^ 0x75));
        ShaderManager.lIlIlIlIIlIlll[29] = (0x4C ^ 0x50);
        ShaderManager.lIlIlIlIIlIlll[30] = (0xA2 ^ 0xBF);
        ShaderManager.lIlIlIlIIlIlll[31] = (0xFA ^ 0xBD ^ (0x70 ^ 0x29));
        ShaderManager.lIlIlIlIIlIlll[32] = (0x8D ^ 0x92);
        ShaderManager.lIlIlIlIIlIlll[33] = (0x9A ^ 0xBA);
        ShaderManager.lIlIlIlIIlIlll[34] = (0x6C ^ 0x5D ^ (0x80 ^ 0x90));
        ShaderManager.lIlIlIlIIlIlll[35] = (0x37 ^ 0x15);
        ShaderManager.lIlIlIlIIlIlll[36] = (0x1F ^ 0x53 ^ (0x23 ^ 0x4C));
        ShaderManager.lIlIlIlIIlIlll[37] = (0xA2 ^ 0x86);
    }
    
    public ShaderLoader getFragmentShaderLoader() {
        return this.fragmentShaderLoader;
    }
    
    private static boolean lllIllIllllllII(final Object lllllllllllllIIIlIIIIlllIIIlIllI) {
        return lllllllllllllIIIlIIIIlllIIIlIllI != null;
    }
    
    private static boolean lllIlllIIIIIIIl(final int lllllllllllllIIIlIIIIlllIIlIlIIl, final int lllllllllllllIIIlIIIIlllIIlIlIII) {
        return lllllllllllllIIIlIIIIlllIIlIlIIl == lllllllllllllIIIlIIIIlllIIlIlIII;
    }
    
    public int getProgram() {
        return this.program;
    }
    
    public void endShader() {
        OpenGlHelper.glUseProgram(ShaderManager.lIlIlIlIIlIlll[2]);
        ShaderManager.currentProgram = ShaderManager.lIlIlIlIIlIlll[0];
        ShaderManager.staticShaderManager = null;
        ShaderManager.field_148000_e = (ShaderManager.lIlIlIlIIlIlll[1] != 0);
        int lllllllllllllIIIlIIIIlllllIlIllI = ShaderManager.lIlIlIlIIlIlll[2];
        "".length();
        if ("   ".length() < " ".length()) {
            return;
        }
        while (!lllIllIlllllllI(lllllllllllllIIIlIIIIlllllIlIllI, this.shaderSamplerLocations.size())) {
            if (lllIllIllllllII(this.shaderSamplers.get(this.samplerNames.get(lllllllllllllIIIlIIIIlllllIlIllI)))) {
                GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit + lllllllllllllIIIlIIIIlllllIlIllI);
                GlStateManager.bindTexture(ShaderManager.lIlIlIlIIlIlll[2]);
            }
            ++lllllllllllllIIIlIIIIlllllIlIllI;
        }
    }
    
    private static boolean lllIllIlllllllI(final int lllllllllllllIIIlIIIIlllIIlIIlIl, final int lllllllllllllIIIlIIIIlllIIlIIlII) {
        return lllllllllllllIIIlIIIIlllIIlIIlIl >= lllllllllllllIIIlIIIIlllIIlIIlII;
    }
    
    private static boolean lllIllIllllllIl(final int lllllllllllllIIIlIIIIlllIIIlIIlI) {
        return lllllllllllllIIIlIIIIlllIIIlIIlI == 0;
    }
    
    private static boolean lllIlllIIIIIIlI(final int lllllllllllllIIIlIIIIlllIIIllIIl, final int lllllllllllllIIIlIIIIlllIIIllIII) {
        return lllllllllllllIIIlIIIIlllIIIllIIl > lllllllllllllIIIlIIIIlllIIIllIII;
    }
    
    private void parseSampler(final JsonElement lllllllllllllIIIlIIIIllllIIllIlI) throws JsonException {
        final JsonObject lllllllllllllIIIlIIIIllllIIlllIl = JsonUtils.getJsonObject(lllllllllllllIIIlIIIIllllIIllIlI, ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[23]]);
        final String lllllllllllllIIIlIIIIllllIIlllII = JsonUtils.getString(lllllllllllllIIIlIIIIllllIIlllIl, ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[24]]);
        if (lllIllIllllllIl(JsonUtils.isString(lllllllllllllIIIlIIIIllllIIlllIl, ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[25]]) ? 1 : 0)) {
            this.shaderSamplers.put(lllllllllllllIIIlIIIIllllIIlllII, null);
            "".length();
            this.samplerNames.add(lllllllllllllIIIlIIIIllllIIlllII);
            "".length();
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else {
            this.samplerNames.add(lllllllllllllIIIlIIIIllllIIlllII);
            "".length();
        }
    }
    
    private static String lllIllIlIllllII(final String lllllllllllllIIIlIIIIlllIIlIllll, final String lllllllllllllIIIlIIIIlllIIlIlllI) {
        try {
            final SecretKeySpec lllllllllllllIIIlIIIIlllIIllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIIIlllIIlIlllI.getBytes(StandardCharsets.UTF_8)), ShaderManager.lIlIlIlIIlIlll[9]), "DES");
            final Cipher lllllllllllllIIIlIIIIlllIIllIIll = Cipher.getInstance("DES");
            lllllllllllllIIIlIIIIlllIIllIIll.init(ShaderManager.lIlIlIlIIlIlll[3], lllllllllllllIIIlIIIIlllIIllIlII);
            return new String(lllllllllllllIIIlIIIIlllIIllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIIIlllIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIIIIlllIIllIIlI) {
            lllllllllllllIIIlIIIIlllIIllIIlI.printStackTrace();
            return null;
        }
    }
    
    public void markDirty() {
        this.isDirty = (ShaderManager.lIlIlIlIIlIlll[1] != 0);
    }
    
    public ShaderLoader getVertexShaderLoader() {
        return this.vertexShaderLoader;
    }
    
    public void deleteShader() {
        ShaderLinkHelper.getStaticShaderLinkHelper().deleteShader(this);
    }
    
    private static boolean lllIlllIIIIIIII(final int lllllllllllllIIIlIIIIlllIIIlIlII) {
        return lllllllllllllIIIlIIIIlllIIIlIlII != 0;
    }
    
    public ShaderManager(final IResourceManager lllllllllllllIIIlIIIIllllllIllIl, final String lllllllllllllIIIlIIIIllllllIllII) throws IOException, JsonException {
        this.shaderSamplers = (Map<String, Object>)Maps.newHashMap();
        this.samplerNames = (List<String>)Lists.newArrayList();
        this.shaderSamplerLocations = (List<Integer>)Lists.newArrayList();
        this.shaderUniforms = (List<ShaderUniform>)Lists.newArrayList();
        this.shaderUniformLocations = (List<Integer>)Lists.newArrayList();
        this.mappedShaderUniforms = (Map<String, ShaderUniform>)Maps.newHashMap();
        final JsonParser lllllllllllllIIIlIIIlIIIIIIIIlll = new JsonParser();
        final ResourceLocation lllllllllllllIIIlIIIlIIIIIIIIllI = new ResourceLocation(String.valueOf(new StringBuilder(ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[2]]).append(lllllllllllllIIIlIIIIllllllIllII).append(ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[1]])));
        this.programFilename = lllllllllllllIIIlIIIIllllllIllII;
        InputStream lllllllllllllIIIlIIIlIIIIIIIIlIl = null;
        try {
            lllllllllllllIIIlIIIlIIIIIIIIlIl = lllllllllllllIIIlIIIIllllllIllIl.getResource(lllllllllllllIIIlIIIlIIIIIIIIllI).getInputStream();
            final JsonObject lllllllllllllIIIlIIIlIIIIIIIIlII = lllllllllllllIIIlIIIlIIIIIIIIlll.parse(IOUtils.toString(lllllllllllllIIIlIIIlIIIIIIIIlIl, Charsets.UTF_8)).getAsJsonObject();
            final String lllllllllllllIIIlIIIlIIIIIIIIIll = JsonUtils.getString(lllllllllllllIIIlIIIlIIIIIIIIlII, ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[3]]);
            final String lllllllllllllIIIlIIIlIIIIIIIIIlI = JsonUtils.getString(lllllllllllllIIIlIIIlIIIIIIIIlII, ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[4]]);
            final JsonArray lllllllllllllIIIlIIIlIIIIIIIIIIl = JsonUtils.getJsonArray(lllllllllllllIIIlIIIlIIIIIIIIlII, ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[5]], null);
            if (lllIllIllllllII(lllllllllllllIIIlIIIlIIIIIIIIIIl)) {
                int lllllllllllllIIIlIIIlIIIIIIIIIII = ShaderManager.lIlIlIlIIlIlll[2];
                final Iterator iterator = lllllllllllllIIIlIIIlIIIIIIIIIIl.iterator();
                "".length();
                if (" ".length() == 0) {
                    throw null;
                }
                while (!lllIllIllllllIl(iterator.hasNext() ? 1 : 0)) {
                    final JsonElement lllllllllllllIIIlIIIIlllllllllll = iterator.next();
                    try {
                        this.parseSampler(lllllllllllllIIIlIIIIlllllllllll);
                        "".length();
                        if (-" ".length() == ((0x70 ^ 0x30) & ~(0xC8 ^ 0x88))) {
                            throw null;
                        }
                    }
                    catch (Exception lllllllllllllIIIlIIIIllllllllllI) {
                        final JsonException lllllllllllllIIIlIIIIlllllllllIl = JsonException.func_151379_a(lllllllllllllIIIlIIIIllllllllllI);
                        lllllllllllllIIIlIIIIlllllllllIl.func_151380_a(String.valueOf(new StringBuilder(ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[6]]).append(lllllllllllllIIIlIIIlIIIIIIIIIII).append(ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[7]])));
                        throw lllllllllllllIIIlIIIIlllllllllIl;
                    }
                    ++lllllllllllllIIIlIIIlIIIIIIIIIII;
                }
            }
            final JsonArray lllllllllllllIIIlIIIIlllllllllII = JsonUtils.getJsonArray(lllllllllllllIIIlIIIlIIIIIIIIlII, ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[8]], null);
            if (lllIllIllllllII(lllllllllllllIIIlIIIIlllllllllII)) {
                int lllllllllllllIIIlIIIIllllllllIll = ShaderManager.lIlIlIlIIlIlll[2];
                this.attribLocations = (List<Integer>)Lists.newArrayListWithCapacity(lllllllllllllIIIlIIIIlllllllllII.size());
                this.attributes = (List<String>)Lists.newArrayListWithCapacity(lllllllllllllIIIlIIIIlllllllllII.size());
                final Iterator iterator2 = lllllllllllllIIIlIIIIlllllllllII.iterator();
                "".length();
                if ("   ".length() <= 0) {
                    throw null;
                }
                while (!lllIllIllllllIl(iterator2.hasNext() ? 1 : 0)) {
                    final JsonElement lllllllllllllIIIlIIIIllllllllIlI = iterator2.next();
                    try {
                        this.attributes.add(JsonUtils.getString(lllllllllllllIIIlIIIIllllllllIlI, ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[9]]));
                        "".length();
                        "".length();
                        if (null != null) {
                            throw null;
                        }
                    }
                    catch (Exception lllllllllllllIIIlIIIIllllllllIIl) {
                        final JsonException lllllllllllllIIIlIIIIllllllllIII = JsonException.func_151379_a(lllllllllllllIIIlIIIIllllllllIIl);
                        lllllllllllllIIIlIIIIllllllllIII.func_151380_a(String.valueOf(new StringBuilder(ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[10]]).append(lllllllllllllIIIlIIIIllllllllIll).append(ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[11]])));
                        throw lllllllllllllIIIlIIIIllllllllIII;
                    }
                    ++lllllllllllllIIIlIIIIllllllllIll;
                }
                "".length();
                if (((0x52 ^ 0x61) & ~(0x36 ^ 0x5)) != 0x0) {
                    throw null;
                }
            }
            else {
                this.attribLocations = null;
                this.attributes = null;
            }
            final JsonArray lllllllllllllIIIlIIIIlllllllIlll = JsonUtils.getJsonArray(lllllllllllllIIIlIIIlIIIIIIIIlII, ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[12]], null);
            if (lllIllIllllllII(lllllllllllllIIIlIIIIlllllllIlll)) {
                int lllllllllllllIIIlIIIIlllllllIllI = ShaderManager.lIlIlIlIIlIlll[2];
                final Exception lllllllllllllIIIlIIIIllllllIIIII = (Exception)lllllllllllllIIIlIIIIlllllllIlll.iterator();
                "".length();
                if ("  ".length() != "  ".length()) {
                    throw null;
                }
                while (!lllIllIllllllIl(((Iterator)lllllllllllllIIIlIIIIllllllIIIII).hasNext() ? 1 : 0)) {
                    final JsonElement lllllllllllllIIIlIIIIlllllllIlIl = ((Iterator<JsonElement>)lllllllllllllIIIlIIIIllllllIIIII).next();
                    try {
                        this.parseUniform(lllllllllllllIIIlIIIIlllllllIlIl);
                        "".length();
                        if (" ".length() >= (0x75 ^ 0x2B ^ (0xD6 ^ 0x8C))) {
                            throw null;
                        }
                    }
                    catch (Exception lllllllllllllIIIlIIIIlllllllIlII) {
                        final JsonException lllllllllllllIIIlIIIIlllllllIIll = JsonException.func_151379_a(lllllllllllllIIIlIIIIlllllllIlII);
                        lllllllllllllIIIlIIIIlllllllIIll.func_151380_a(String.valueOf(new StringBuilder(ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[13]]).append(lllllllllllllIIIlIIIIlllllllIllI).append(ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[14]])));
                        throw lllllllllllllIIIlIIIIlllllllIIll;
                    }
                    ++lllllllllllllIIIlIIIIlllllllIllI;
                }
            }
            this.field_148016_p = JsonBlendingMode.func_148110_a(JsonUtils.getJsonObject(lllllllllllllIIIlIIIlIIIIIIIIlII, ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[15]], null));
            this.useFaceCulling = JsonUtils.getBoolean(lllllllllllllIIIlIIIlIIIIIIIIlII, ShaderManager.lIlIlIlIIIIlIl[ShaderManager.lIlIlIlIIlIlll[16]], (boolean)(ShaderManager.lIlIlIlIIlIlll[1] != 0));
            this.vertexShaderLoader = ShaderLoader.loadShader(lllllllllllllIIIlIIIIllllllIllIl, ShaderLoader.ShaderType.VERTEX, lllllllllllllIIIlIIIlIIIIIIIIIll);
            this.fragmentShaderLoader = ShaderLoader.loadShader(lllllllllllllIIIlIIIIllllllIllIl, ShaderLoader.ShaderType.FRAGMENT, lllllllllllllIIIlIIIlIIIIIIIIIlI);
            this.program = ShaderLinkHelper.getStaticShaderLinkHelper().createProgram();
            ShaderLinkHelper.getStaticShaderLinkHelper().linkProgram(this);
            this.setupUniforms();
            if (lllIllIllllllII(this.attributes)) {
                final Iterator<String> iterator3 = this.attributes.iterator();
                "".length();
                if ((0x7E ^ 0x7A) != (0x3F ^ 0x3B)) {
                    throw null;
                }
                while (!lllIllIllllllIl(iterator3.hasNext() ? 1 : 0)) {
                    final String lllllllllllllIIIlIIIIlllllllIIlI = iterator3.next();
                    final int lllllllllllllIIIlIIIIlllllllIIIl = OpenGlHelper.glGetAttribLocation(this.program, lllllllllllllIIIlIIIIlllllllIIlI);
                    this.attribLocations.add(lllllllllllllIIIlIIIIlllllllIIIl);
                    "".length();
                }
                "".length();
                if (" ".length() < -" ".length()) {
                    throw null;
                }
            }
        }
        catch (Exception lllllllllllllIIIlIIIIlllllllIIII) {
            final JsonException lllllllllllllIIIlIIIIllllllIllll = JsonException.func_151379_a(lllllllllllllIIIlIIIIlllllllIIII);
            lllllllllllllIIIlIIIIllllllIllll.func_151381_b(lllllllllllllIIIlIIIlIIIIIIIIllI.getResourcePath());
            throw lllllllllllllIIIlIIIIllllllIllll;
        }
        finally {
            IOUtils.closeQuietly(lllllllllllllIIIlIIIlIIIIIIIIlIl);
        }
        IOUtils.closeQuietly(lllllllllllllIIIlIIIlIIIIIIIIlIl);
        this.markDirty();
    }
    
    static {
        lllIllIlllllIll();
        lllIllIllIIIIlI();
        logger = LogManager.getLogger();
        defaultShaderUniform = new ShaderDefault();
        ShaderManager.staticShaderManager = null;
        ShaderManager.currentProgram = ShaderManager.lIlIlIlIIlIlll[0];
        ShaderManager.field_148000_e = (ShaderManager.lIlIlIlIIlIlll[1] != 0);
    }
    
    private static boolean lllIlllIIIIIlII(final int lllllllllllllIIIlIIIIlllIIlIIIIl, final int lllllllllllllIIIlIIIIlllIIlIIIII) {
        return lllllllllllllIIIlIIIIlllIIlIIIIl < lllllllllllllIIIlIIIIlllIIlIIIII;
    }
}
