// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import java.util.Arrays;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.ARBMultitexture;
import oshi.hardware.Processor;
import org.lwjgl.opengl.ContextCapabilities;
import oshi.SystemInfo;
import net.minecraft.client.settings.GameSettings;
import org.lwjgl.opengl.GLContext;
import java.nio.IntBuffer;
import org.lwjgl.opengl.ARBVertexShader;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.EXTBlendFuncSeparate;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.ARBVertexBufferObject;
import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.ARBShaderObjects;
import java.nio.ByteBuffer;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.ARBFramebufferObject;
import org.lwjgl.opengl.GL30;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class OpenGlHelper
{
    public static /* synthetic */ int GL_TEXTURE2;
    public static /* synthetic */ int GL_PREVIOUS;
    public static /* synthetic */ int GL_FB_INCOMPLETE_DRAW_BUFFER;
    private static /* synthetic */ boolean arbTextureEnvCombine;
    public static /* synthetic */ boolean nvidia;
    public static /* synthetic */ int GL_COMBINE;
    public static /* synthetic */ int GL_SOURCE0_ALPHA;
    public static /* synthetic */ boolean field_181062_Q;
    private static final /* synthetic */ String[] llIllllIlIIlII;
    public static /* synthetic */ int defaultTexUnit;
    public static /* synthetic */ int GL_OPERAND1_ALPHA;
    public static /* synthetic */ int GL_PRIMARY_COLOR;
    public static /* synthetic */ int GL_COMBINE_ALPHA;
    public static /* synthetic */ int GL_ARRAY_BUFFER;
    private static /* synthetic */ boolean openGL14;
    public static /* synthetic */ int GL_COMPILE_STATUS;
    public static /* synthetic */ boolean vboSupported;
    public static /* synthetic */ int GL_STATIC_DRAW;
    private static final /* synthetic */ int[] llIllllIlIIlIl;
    public static /* synthetic */ int GL_VERTEX_SHADER;
    public static /* synthetic */ int GL_FB_INCOMPLETE_ATTACHMENT;
    public static /* synthetic */ int GL_SOURCE1_RGB;
    public static /* synthetic */ int GL_CONSTANT;
    public static /* synthetic */ boolean field_181063_b;
    public static /* synthetic */ int GL_SOURCE0_RGB;
    public static /* synthetic */ int lightmapTexUnit;
    public static /* synthetic */ int GL_OPERAND2_ALPHA;
    public static /* synthetic */ boolean openGL21;
    public static /* synthetic */ int GL_LINK_STATUS;
    private static /* synthetic */ boolean arbShaders;
    public static /* synthetic */ int GL_OPERAND0_RGB;
    private static /* synthetic */ boolean shadersAvailable;
    private static /* synthetic */ boolean arbMultitexture;
    private static /* synthetic */ int framebufferType;
    public static /* synthetic */ int GL_DEPTH_ATTACHMENT;
    public static /* synthetic */ int GL_OPERAND2_RGB;
    private static /* synthetic */ boolean arbVbo;
    public static /* synthetic */ boolean framebufferSupported;
    public static /* synthetic */ int GL_FRAMEBUFFER_COMPLETE;
    private static /* synthetic */ String field_183030_aa;
    public static /* synthetic */ int GL_FB_INCOMPLETE_READ_BUFFER;
    public static /* synthetic */ int GL_OPERAND0_ALPHA;
    public static /* synthetic */ int GL_SOURCE2_RGB;
    public static /* synthetic */ int GL_SOURCE1_ALPHA;
    public static /* synthetic */ int GL_FRAMEBUFFER;
    public static /* synthetic */ int GL_FRAGMENT_SHADER;
    public static /* synthetic */ int GL_INTERPOLATE;
    public static /* synthetic */ boolean extBlendFuncSeparate;
    private static /* synthetic */ String logText;
    public static /* synthetic */ int GL_OPERAND1_RGB;
    public static /* synthetic */ int GL_COLOR_ATTACHMENT0;
    public static /* synthetic */ boolean shadersSupported;
    public static /* synthetic */ int GL_COMBINE_RGB;
    public static /* synthetic */ int GL_RENDERBUFFER;
    public static /* synthetic */ int GL_SOURCE2_ALPHA;
    public static /* synthetic */ int GL_FB_INCOMPLETE_MISS_ATTACH;
    
    private static String lIIllIlIlIlIlIII(final String llllllllllllIllIIIIllIlIlIlllIIl, final String llllllllllllIllIIIIllIlIlIlllIII) {
        try {
            final SecretKeySpec llllllllllllIllIIIIllIlIlIlllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIllIlIlIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIIllIlIlIllllIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIIllIlIlIllllIl.init(OpenGlHelper.llIllllIlIIlIl[5], llllllllllllIllIIIIllIlIlIlllllI);
            return new String(llllllllllllIllIIIIllIlIlIllllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIllIlIlIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIllIlIlIllllII) {
            llllllllllllIllIIIIllIlIlIllllII.printStackTrace();
            return null;
        }
    }
    
    public static int glCheckFramebufferStatus(final int llllllllllllIllIIIIllIllIIIlIIlI) {
        if (lIIllIlIlIlIllII(OpenGlHelper.framebufferSupported ? 1 : 0)) {
            return OpenGlHelper.llIllllIlIIlIl[101];
        }
        switch (OpenGlHelper.framebufferType) {
            case 0: {
                return GL30.glCheckFramebufferStatus(llllllllllllIllIIIIllIllIIIlIIlI);
            }
            case 1: {
                return ARBFramebufferObject.glCheckFramebufferStatus(llllllllllllIllIIIIllIllIIIlIIlI);
            }
            case 2: {
                return EXTFramebufferObject.glCheckFramebufferStatusEXT(llllllllllllIllIIIIllIllIIIlIIlI);
            }
            default: {
                return OpenGlHelper.llIllllIlIIlIl[101];
            }
        }
    }
    
    public static void glShaderSource(final int llllllllllllIllIIIIllIllllIIllIl, final ByteBuffer llllllllllllIllIIIIllIllllIIlllI) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            ARBShaderObjects.glShaderSourceARB(llllllllllllIllIIIIllIllllIIllIl, llllllllllllIllIIIIllIllllIIlllI);
            "".length();
            if ((27 + 58 + 58 + 4 ^ 45 + 3 + 20 + 83) == 0x0) {
                return;
            }
        }
        else {
            GL20.glShaderSource(llllllllllllIllIIIIllIllllIIllIl, llllllllllllIllIIIIllIllllIIlllI);
        }
    }
    
    public static void glLinkProgram(final int llllllllllllIllIIIIllIlllIlIlllI) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            ARBShaderObjects.glLinkProgramARB(llllllllllllIllIIIIllIlllIlIlllI);
            "".length();
            if (((0x96 ^ 0x83) & ~(0x22 ^ 0x37)) != 0x0) {
                return;
            }
        }
        else {
            GL20.glLinkProgram(llllllllllllIllIIIIllIlllIlIlllI);
        }
    }
    
    public static void glRenderbufferStorage(final int llllllllllllIllIIIIllIllIIlIIlII, final int llllllllllllIllIIIIllIllIIlIIlll, final int llllllllllllIllIIIIllIllIIlIIIlI, final int llllllllllllIllIIIIllIllIIlIIlIl) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.framebufferSupported ? 1 : 0)) {
            switch (OpenGlHelper.framebufferType) {
                case 0: {
                    GL30.glRenderbufferStorage(llllllllllllIllIIIIllIllIIlIIlII, llllllllllllIllIIIIllIllIIlIIlll, llllllllllllIllIIIIllIllIIlIIIlI, llllllllllllIllIIIIllIllIIlIIlIl);
                    "".length();
                    if (((0x68 ^ 0x40) & ~(0x41 ^ 0x69)) != 0x0) {
                        return;
                    }
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glRenderbufferStorage(llllllllllllIllIIIIllIllIIlIIlII, llllllllllllIllIIIIllIllIIlIIlll, llllllllllllIllIIIIllIllIIlIIIlI, llllllllllllIllIIIIllIllIIlIIlIl);
                    "".length();
                    if (((0x79 ^ 0x69) & ~(0x41 ^ 0x51)) <= -" ".length()) {
                        return;
                    }
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glRenderbufferStorageEXT(llllllllllllIllIIIIllIllIIlIIlII, llllllllllllIllIIIIllIllIIlIIlll, llllllllllllIllIIIIllIllIIlIIIlI, llllllllllllIllIIIIllIllIIlIIlIl);
                    break;
                }
            }
        }
    }
    
    public static int glGetShaderi(final int llllllllllllIllIIIIllIllllIIIlII, final int llllllllllllIllIIIIllIllllIIIlIl) {
        int n;
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            n = ARBShaderObjects.glGetObjectParameteriARB(llllllllllllIllIIIIllIllllIIIlII, llllllllllllIllIIIIllIllllIIIlIl);
            "".length();
            if ("  ".length() <= -" ".length()) {
                return (0x7A ^ 0x2B) & ~(0x64 ^ 0x35);
            }
        }
        else {
            n = GL20.glGetShaderi(llllllllllllIllIIIIllIllllIIIlII, llllllllllllIllIIIIllIllllIIIlIl);
        }
        return n;
    }
    
    public static void glUniform1(final int llllllllllllIllIIIIllIlllIIllIIl, final FloatBuffer llllllllllllIllIIIIllIlllIIllIII) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            ARBShaderObjects.glUniform1ARB(llllllllllllIllIIIIllIlllIIllIIl, llllllllllllIllIIIIllIlllIIllIII);
            "".length();
            if ("  ".length() >= (0x25 ^ 0x21)) {
                return;
            }
        }
        else {
            GL20.glUniform1(llllllllllllIllIIIIllIlllIIllIIl, llllllllllllIllIIIIllIlllIIllIII);
        }
    }
    
    public static void glDeleteBuffers(final int llllllllllllIllIIIIllIllIlIIIIII) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbVbo ? 1 : 0)) {
            ARBVertexBufferObject.glDeleteBuffersARB(llllllllllllIllIIIIllIllIlIIIIII);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            GL15.glDeleteBuffers(llllllllllllIllIIIIllIllIlIIIIII);
        }
    }
    
    public static void glAttachShader(final int llllllllllllIllIIIIllIllllIllIll, final int llllllllllllIllIIIIllIllllIllIlI) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            ARBShaderObjects.glAttachObjectARB(llllllllllllIllIIIIllIllllIllIll, llllllllllllIllIIIIllIllllIllIlI);
            "".length();
            if ((0xBA ^ 0x9E ^ (0x57 ^ 0x76)) <= 0) {
                return;
            }
        }
        else {
            GL20.glAttachShader(llllllllllllIllIIIIllIllllIllIll, llllllllllllIllIIIIllIllllIllIlI);
        }
    }
    
    private static boolean lIIllIlIlIlIllIl(final Object llllllllllllIllIIIIllIlIlIllIIII) {
        return llllllllllllIllIIIIllIlIlIllIIII == null;
    }
    
    public static void glUniform2(final int llllllllllllIllIIIIllIlllIIIllIl, final FloatBuffer llllllllllllIllIIIIllIlllIIIlIlI) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            ARBShaderObjects.glUniform2ARB(llllllllllllIllIIIIllIlllIIIllIl, llllllllllllIllIIIIllIlllIIIlIlI);
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        else {
            GL20.glUniform2(llllllllllllIllIIIIllIlllIIIllIl, llllllllllllIllIIIIllIlllIIIlIlI);
        }
    }
    
    private static boolean lIIllIlIlIlIllII(final int llllllllllllIllIIIIllIlIlIlIllII) {
        return llllllllllllIllIIIIllIlIlIlIllII == 0;
    }
    
    private static boolean lIIllIlIlIlIlIll(final int llllllllllllIllIIIIllIlIlIlIlllI) {
        return llllllllllllIllIIIIllIlIlIlIlllI != 0;
    }
    
    public static void glUniformMatrix3(final int llllllllllllIllIIIIllIllIllIIlIl, final boolean llllllllllllIllIIIIllIllIllIIlII, final FloatBuffer llllllllllllIllIIIIllIllIllIIIII) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            ARBShaderObjects.glUniformMatrix3ARB(llllllllllllIllIIIIllIllIllIIlIl, llllllllllllIllIIIIllIllIllIIlII, llllllllllllIllIIIIllIllIllIIIII);
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else {
            GL20.glUniformMatrix3(llllllllllllIllIIIIllIllIllIIlIl, llllllllllllIllIIIIllIllIllIIlII, llllllllllllIllIIIIllIllIllIIIII);
        }
    }
    
    public static boolean isFramebufferEnabled() {
        if (lIIllIlIlIlIlIll(OpenGlHelper.framebufferSupported ? 1 : 0) && lIIllIlIlIlIlIll(Minecraft.getMinecraft().gameSettings.fboEnable ? 1 : 0)) {
            return OpenGlHelper.llIllllIlIIlIl[1] != 0;
        }
        return OpenGlHelper.llIllllIlIIlIl[0] != 0;
    }
    
    public static int glGetProgrami(final int llllllllllllIllIIIIllIllllIlllll, final int llllllllllllIllIIIIllIlllllIIIII) {
        int n;
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            n = ARBShaderObjects.glGetObjectParameteriARB(llllllllllllIllIIIIllIllllIlllll, llllllllllllIllIIIIllIlllllIIIII);
            "".length();
            if ((0xD9 ^ 0xA3 ^ (0xFC ^ 0x82)) <= "  ".length()) {
                return (0x27 ^ 0x30 ^ (0x16 ^ 0x5A)) & (" ".length() ^ (0x48 ^ 0x12) ^ -" ".length());
            }
        }
        else {
            n = GL20.glGetProgrami(llllllllllllIllIIIIllIllllIlllll, llllllllllllIllIIIIllIlllllIIIII);
        }
        return n;
    }
    
    public static void glBlendFunc(final int llllllllllllIllIIIIllIlIlllIlIll, final int llllllllllllIllIIIIllIlIlllIlllI, final int llllllllllllIllIIIIllIlIlllIlIIl, final int llllllllllllIllIIIIllIlIlllIlIII) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.openGL14 ? 1 : 0)) {
            if (lIIllIlIlIlIlIll(OpenGlHelper.extBlendFuncSeparate ? 1 : 0)) {
                EXTBlendFuncSeparate.glBlendFuncSeparateEXT(llllllllllllIllIIIIllIlIlllIlIll, llllllllllllIllIIIIllIlIlllIlllI, llllllllllllIllIIIIllIlIlllIlIIl, llllllllllllIllIIIIllIlIlllIlIII);
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
            }
            else {
                GL14.glBlendFuncSeparate(llllllllllllIllIIIIllIlIlllIlIll, llllllllllllIllIIIIllIlIlllIlllI, llllllllllllIllIIIIllIlIlllIlIIl, llllllllllllIllIIIIllIlIlllIlIII);
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
            }
        }
        else {
            GL11.glBlendFunc(llllllllllllIllIIIIllIlIlllIlIll, llllllllllllIllIIIIllIlIlllIlllI);
        }
    }
    
    public static void glCompileShader(final int llllllllllllIllIIIIllIllllIIlIlI) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            ARBShaderObjects.glCompileShaderARB(llllllllllllIllIIIIllIllllIIlIlI);
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        else {
            GL20.glCompileShader(llllllllllllIllIIIIllIllllIIlIlI);
        }
    }
    
    public static String glGetProgramInfoLog(final int llllllllllllIllIIIIllIlllIlllIlI, final int llllllllllllIllIIIIllIlllIllIlll) {
        String s;
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            s = ARBShaderObjects.glGetInfoLogARB(llllllllllllIllIIIIllIlllIlllIlI, llllllllllllIllIIIIllIlllIllIlll);
            "".length();
            if ("  ".length() <= " ".length()) {
                return null;
            }
        }
        else {
            s = GL20.glGetProgramInfoLog(llllllllllllIllIIIIllIlllIlllIlI, llllllllllllIllIIIIllIlllIllIlll);
        }
        return s;
    }
    
    public static void glUniformMatrix2(final int llllllllllllIllIIIIllIllIllIlllI, final boolean llllllllllllIllIIIIllIllIllIllIl, final FloatBuffer llllllllllllIllIIIIllIllIllIllII) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            ARBShaderObjects.glUniformMatrix2ARB(llllllllllllIllIIIIllIllIllIlllI, llllllllllllIllIIIIllIllIllIllIl, llllllllllllIllIIIIllIllIllIllII);
            "".length();
            if ((0x7A ^ 0x7E) < 0) {
                return;
            }
        }
        else {
            GL20.glUniformMatrix2(llllllllllllIllIIIIllIllIllIlllI, llllllllllllIllIIIIllIllIllIllIl, llllllllllllIllIIIIllIllIllIllII);
        }
    }
    
    public static int glGenRenderbuffers() {
        if (lIIllIlIlIlIllII(OpenGlHelper.framebufferSupported ? 1 : 0)) {
            return OpenGlHelper.llIllllIlIIlIl[101];
        }
        switch (OpenGlHelper.framebufferType) {
            case 0: {
                return GL30.glGenRenderbuffers();
            }
            case 1: {
                return ARBFramebufferObject.glGenRenderbuffers();
            }
            case 2: {
                return EXTFramebufferObject.glGenRenderbuffersEXT();
            }
            default: {
                return OpenGlHelper.llIllllIlIIlIl[101];
            }
        }
    }
    
    public static void glDeleteShader(final int llllllllllllIllIIIIllIllllIlIllI) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            ARBShaderObjects.glDeleteObjectARB(llllllllllllIllIIIIllIllllIlIllI);
            "".length();
            if (-" ".length() > "  ".length()) {
                return;
            }
        }
        else {
            GL20.glDeleteShader(llllllllllllIllIIIIllIllllIlIllI);
        }
    }
    
    static {
        lIIllIlIlIlIlIlI();
        lIIllIlIlIlIlIIl();
        OpenGlHelper.logText = OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[0]];
    }
    
    public static int glGenBuffers() {
        int n;
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbVbo ? 1 : 0)) {
            n = ARBVertexBufferObject.glGenBuffersARB();
            "".length();
            if ("  ".length() > "  ".length()) {
                return (0x2E ^ 0x7B ^ (0x45 ^ 0x58)) & (0x94 ^ 0xC3 ^ (0x1 ^ 0x1E) ^ -" ".length());
            }
        }
        else {
            n = GL15.glGenBuffers();
        }
        return n;
    }
    
    public static int glGetUniformLocation(final int llllllllllllIllIIIIllIlllIlIlIll, final CharSequence llllllllllllIllIIIIllIlllIlIlIlI) {
        int n;
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            n = ARBShaderObjects.glGetUniformLocationARB(llllllllllllIllIIIIllIlllIlIlIll, llllllllllllIllIIIIllIlllIlIlIlI);
            "".length();
            if ((0xBA ^ 0xBE) <= -" ".length()) {
                return (0x2C ^ 0x4F) & ~(0x9 ^ 0x6A);
            }
        }
        else {
            n = GL20.glGetUniformLocation(llllllllllllIllIIIIllIlllIlIlIll, llllllllllllIllIIIIllIlllIlIlIlI);
        }
        return n;
    }
    
    public static int glCreateShader(final int llllllllllllIllIIIIllIllllIlIIll) {
        int n;
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            n = ARBShaderObjects.glCreateShaderObjectARB(llllllllllllIllIIIIllIllllIlIIll);
            "".length();
            if (((0x43 ^ 0x6A) & ~(0xA1 ^ 0x88)) > 0) {
                return "  ".length() & ~"  ".length();
            }
        }
        else {
            n = GL20.glCreateShader(llllllllllllIllIIIIllIllllIlIIll);
        }
        return n;
    }
    
    private static String lIIllIlIlIlIIlll(String llllllllllllIllIIIIllIlIllIIlIll, final String llllllllllllIllIIIIllIlIllIIlIlI) {
        llllllllllllIllIIIIllIlIllIIlIll = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIIllIlIllIIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIllIlIllIIlllI = new StringBuilder();
        final char[] llllllllllllIllIIIIllIlIllIIllIl = llllllllllllIllIIIIllIlIllIIlIlI.toCharArray();
        int llllllllllllIllIIIIllIlIllIIllII = OpenGlHelper.llIllllIlIIlIl[0];
        final char llllllllllllIllIIIIllIlIllIIIllI = (Object)((String)llllllllllllIllIIIIllIlIllIIlIll).toCharArray();
        final boolean llllllllllllIllIIIIllIlIllIIIlIl = llllllllllllIllIIIIllIlIllIIIllI.length != 0;
        Exception llllllllllllIllIIIIllIlIllIIIlII = (Exception)OpenGlHelper.llIllllIlIIlIl[0];
        while (lIIlllIIIlIIIlII((int)llllllllllllIllIIIIllIlIllIIIlII, llllllllllllIllIIIIllIlIllIIIlIl ? 1 : 0)) {
            final char llllllllllllIllIIIIllIlIllIlIIIl = llllllllllllIllIIIIllIlIllIIIllI[llllllllllllIllIIIIllIlIllIIIlII];
            llllllllllllIllIIIIllIlIllIIlllI.append((char)(llllllllllllIllIIIIllIlIllIlIIIl ^ llllllllllllIllIIIIllIlIllIIllIl[llllllllllllIllIIIIllIlIllIIllII % llllllllllllIllIIIIllIlIllIIllIl.length]));
            "".length();
            ++llllllllllllIllIIIIllIlIllIIllII;
            ++llllllllllllIllIIIIllIlIllIIIlII;
            "".length();
            if ((0xC6 ^ 0xC3) == 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIllIlIllIIlllI);
    }
    
    public static void glBindRenderbuffer(final int llllllllllllIllIIIIllIllIIllIllI, final int llllllllllllIllIIIIllIllIIllIIll) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.framebufferSupported ? 1 : 0)) {
            switch (OpenGlHelper.framebufferType) {
                case 0: {
                    GL30.glBindRenderbuffer(llllllllllllIllIIIIllIllIIllIllI, llllllllllllIllIIIIllIllIIllIIll);
                    "".length();
                    if (-" ".length() >= 0) {
                        return;
                    }
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glBindRenderbuffer(llllllllllllIllIIIIllIllIIllIllI, llllllllllllIllIIIIllIllIIllIIll);
                    "".length();
                    if (((0xE0 ^ 0xB4) & ~(0x16 ^ 0x42)) != 0x0) {
                        return;
                    }
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glBindRenderbufferEXT(llllllllllllIllIIIIllIllIIllIllI, llllllllllllIllIIIIllIllIIllIIll);
                    break;
                }
            }
        }
    }
    
    public static int glGetAttribLocation(final int llllllllllllIllIIIIllIllIlIlIlII, final CharSequence llllllllllllIllIIIIllIllIlIlIIIl) {
        int n;
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            n = ARBVertexShader.glGetAttribLocationARB(llllllllllllIllIIIIllIllIlIlIlII, llllllllllllIllIIIIllIllIlIlIIIl);
            "".length();
            if ("  ".length() <= ((0x3A ^ 0x36) & ~(0x78 ^ 0x74))) {
                return (0x7E ^ 0x5C) & ~(0x93 ^ 0xB1);
            }
        }
        else {
            n = GL20.glGetAttribLocation(llllllllllllIllIIIIllIllIlIlIlII, llllllllllllIllIIIIllIllIlIlIIIl);
        }
        return n;
    }
    
    public static void glDeleteRenderbuffers(final int llllllllllllIllIIIIllIllIIllIIIl) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.framebufferSupported ? 1 : 0)) {
            switch (OpenGlHelper.framebufferType) {
                case 0: {
                    GL30.glDeleteRenderbuffers(llllllllllllIllIIIIllIllIIllIIIl);
                    "".length();
                    if ("   ".length() <= -" ".length()) {
                        return;
                    }
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glDeleteRenderbuffers(llllllllllllIllIIIIllIllIIllIIIl);
                    "".length();
                    if (-"  ".length() > 0) {
                        return;
                    }
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glDeleteRenderbuffersEXT(llllllllllllIllIIIIllIllIIllIIIl);
                    break;
                }
            }
        }
    }
    
    public static void glUniform1(final int llllllllllllIllIIIIllIlllIlIIlIl, final IntBuffer llllllllllllIllIIIIllIlllIlIIlII) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            ARBShaderObjects.glUniform1ARB(llllllllllllIllIIIIllIlllIlIIlIl, llllllllllllIllIIIIllIlllIlIIlII);
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        else {
            GL20.glUniform1(llllllllllllIllIIIIllIlllIlIIlIl, llllllllllllIllIIIIllIlllIlIIlII);
        }
    }
    
    public static void glUniform3(final int llllllllllllIllIIIIllIllIlllllll, final FloatBuffer llllllllllllIllIIIIllIlllIIIIIII) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            ARBShaderObjects.glUniform3ARB(llllllllllllIllIIIIllIllIlllllll, llllllllllllIllIIIIllIlllIIIIIII);
            "".length();
            if ((14 + 99 - 67 + 99 ^ 95 + 43 - 91 + 102) <= 0) {
                return;
            }
        }
        else {
            GL20.glUniform3(llllllllllllIllIIIIllIllIlllllll, llllllllllllIllIIIIllIlllIIIIIII);
        }
    }
    
    private static boolean lIIlllIIIlIIIlII(final int llllllllllllIllIIIIllIlIlIllIIll, final int llllllllllllIllIIIIllIlIlIllIIlI) {
        return llllllllllllIllIIIIllIlIlIllIIll < llllllllllllIllIIIIllIlIlIllIIlI;
    }
    
    public static void glUniform3(final int llllllllllllIllIIIIllIlllIIIIlll, final IntBuffer llllllllllllIllIIIIllIlllIIIIlII) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            ARBShaderObjects.glUniform3ARB(llllllllllllIllIIIIllIlllIIIIlll, llllllllllllIllIIIIllIlllIIIIlII);
            "".length();
            if (((0x47 ^ 0x77) & ~(0x81 ^ 0xB1)) != 0x0) {
                return;
            }
        }
        else {
            GL20.glUniform3(llllllllllllIllIIIIllIlllIIIIlll, llllllllllllIllIIIIllIlllIIIIlII);
        }
    }
    
    public static boolean areShadersSupported() {
        return OpenGlHelper.shadersSupported;
    }
    
    public static void glUniform2(final int llllllllllllIllIIIIllIlllIIlIIIl, final IntBuffer llllllllllllIllIIIIllIlllIIlIIII) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            ARBShaderObjects.glUniform2ARB(llllllllllllIllIIIIllIlllIIlIIIl, llllllllllllIllIIIIllIlllIIlIIII);
            "".length();
            if ((0x98 ^ 0x9C) <= 0) {
                return;
            }
        }
        else {
            GL20.glUniform2(llllllllllllIllIIIIllIlllIIlIIIl, llllllllllllIllIIIIllIlllIIlIIII);
        }
    }
    
    public static int glCreateProgram() {
        int n;
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            n = ARBShaderObjects.glCreateProgramObjectARB();
            "".length();
            if (((0x70 ^ 0x2C ^ (0x8 ^ 0x1E)) & (0x48 ^ 0x64 ^ (0x12 ^ 0x74) ^ -" ".length())) != 0x0) {
                return (107 + 148 - 249 + 185 ^ 66 + 49 - 88 + 106) & (108 + 21 - 47 + 63 ^ 79 + 56 - 115 + 151 ^ -" ".length());
            }
        }
        else {
            n = GL20.glCreateProgram();
        }
        return n;
    }
    
    public static void glDeleteFramebuffers(final int llllllllllllIllIIIIllIllIIlIllIl) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.framebufferSupported ? 1 : 0)) {
            switch (OpenGlHelper.framebufferType) {
                case 0: {
                    GL30.glDeleteFramebuffers(llllllllllllIllIIIIllIllIIlIllIl);
                    "".length();
                    if (-"  ".length() > 0) {
                        return;
                    }
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glDeleteFramebuffers(llllllllllllIllIIIIllIllIIlIllIl);
                    "".length();
                    if (-(0xAD ^ 0xA9) >= 0) {
                        return;
                    }
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glDeleteFramebuffersEXT(llllllllllllIllIIIIllIllIIlIllIl);
                    break;
                }
            }
        }
    }
    
    public static void glBufferData(final int llllllllllllIllIIIIllIllIlIIIlII, final ByteBuffer llllllllllllIllIIIIllIllIlIIIllI, final int llllllllllllIllIIIIllIllIlIIIIlI) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbVbo ? 1 : 0)) {
            ARBVertexBufferObject.glBufferDataARB(llllllllllllIllIIIIllIllIlIIIlII, llllllllllllIllIIIIllIllIlIIIllI, llllllllllllIllIIIIllIllIlIIIIlI);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            GL15.glBufferData(llllllllllllIllIIIIllIllIlIIIlII, llllllllllllIllIIIIllIllIlIIIllI, llllllllllllIllIIIIllIllIlIIIIlI);
        }
    }
    
    public static int glGenFramebuffers() {
        if (lIIllIlIlIlIllII(OpenGlHelper.framebufferSupported ? 1 : 0)) {
            return OpenGlHelper.llIllllIlIIlIl[101];
        }
        switch (OpenGlHelper.framebufferType) {
            case 0: {
                return GL30.glGenFramebuffers();
            }
            case 1: {
                return ARBFramebufferObject.glGenFramebuffers();
            }
            case 2: {
                return EXTFramebufferObject.glGenFramebuffersEXT();
            }
            default: {
                return OpenGlHelper.llIllllIlIIlIl[101];
            }
        }
    }
    
    private static void lIIllIlIlIlIlIlI() {
        (llIllllIlIIlIl = new int[104])[0] = ((121 + 97 - 83 + 46 ^ 129 + 125 - 214 + 119) & (0xD ^ 0x5F ^ (0x4B ^ 0x33) ^ -" ".length()));
        OpenGlHelper.llIllllIlIIlIl[1] = " ".length();
        OpenGlHelper.llIllllIlIIlIl[2] = (-(0xFFFFC92F & 0x37DA) & (0xFFFFB5E9 & 0xCFDF));
        OpenGlHelper.llIllllIlIIlIl[3] = (-(0xFFFFFDBF & 0x2B53) & (0xFFFFBFD7 & 0xEDFB));
        OpenGlHelper.llIllllIlIIlIl[4] = (-(0xFFFFDF7E & 0x6BBF) & (-1 & 0xCFFF));
        OpenGlHelper.llIllllIlIIlIl[5] = "  ".length();
        OpenGlHelper.llIllllIlIIlIl[6] = "   ".length();
        OpenGlHelper.llIllllIlIIlIl[7] = (0xFFFFA57A & 0xDFF5);
        OpenGlHelper.llIllllIlIIlIl[8] = (0xFFFFED77 & 0x97FD);
        OpenGlHelper.llIllllIlIIlIl[9] = (0xFFFFFDFF & 0x8777);
        OpenGlHelper.llIllllIlIIlIl[10] = (-(0xFFFFBFFF & 0x6A0A) & (0xFFFFAFFF & 0xFF7F));
        OpenGlHelper.llIllllIlIIlIl[11] = (0xFFFFDD7E & 0xA7F9);
        OpenGlHelper.llIllllIlIIlIl[12] = (-(0xFFFFA2AD & 0x7FDF) & (0xFFFFAFFD & 0xF7FF));
        OpenGlHelper.llIllllIlIIlIl[13] = (-(0xFFFFFF16 & 0x7AEF) & (0xFFFFFF8F & 0xFFF5));
        OpenGlHelper.llIllllIlIIlIl[14] = (-(0xFFFF9F53 & 0x7ABD) & (0xFFFFFF9D & 0x9FF3));
        OpenGlHelper.llIllllIlIIlIl[15] = (0xFFFF95F6 & 0xEF8B);
        OpenGlHelper.llIllllIlIIlIl[16] = (-(0xA5 ^ 0xAC) & (0xFFFFAFFB & 0xD59C));
        OpenGlHelper.llIllllIlIIlIl[17] = (0xFFFFD599 & 0xAFF7);
        OpenGlHelper.llIllllIlIIlIl[18] = (0xFFFF95DA & 0xEFB7);
        OpenGlHelper.llIllllIlIIlIl[19] = (0xFFFF9F76 & 0xE5FB);
        OpenGlHelper.llIllllIlIIlIl[20] = (0xFFFFB5EE & 0xCF99);
        OpenGlHelper.llIllllIlIIlIl[21] = (-(0xFFFFEDBD & 0x5A67) & (0xFFFFDFBF & 0xEDED));
        OpenGlHelper.llIllllIlIIlIl[22] = (0xFFFFE7AF & 0x9DDA);
        OpenGlHelper.llIllllIlIIlIl[23] = (0xFFFFDDDF & 0xA7B8);
        OpenGlHelper.llIllllIlIIlIl[24] = (0xFFFFC5DF & 0xBFB9);
        OpenGlHelper.llIllllIlIIlIl[25] = (0xFFFFB5DB & 0xCFBE);
        OpenGlHelper.llIllllIlIIlIl[26] = (0x1E ^ 0x1A);
        OpenGlHelper.llIllllIlIIlIl[27] = (0x69 ^ 0x77 ^ (0x2B ^ 0x30));
        OpenGlHelper.llIllllIlIIlIl[28] = (0xBB ^ 0xBD);
        OpenGlHelper.llIllllIlIIlIl[29] = (0xFFFFEDCF & 0x9F70);
        OpenGlHelper.llIllllIlIIlIl[30] = (-(0xFFFFF5FF & 0x5A2B) & (0xFFFFFDEF & 0xDF7B));
        OpenGlHelper.llIllllIlIIlIl[31] = (0xFFFF9DF4 & 0xEEEB);
        OpenGlHelper.llIllllIlIIlIl[32] = (-(0xFFFFCBBF & 0x76ED) & (0xFFFFCFAC & 0xFFFF));
        OpenGlHelper.llIllllIlIIlIl[33] = (0xFFFFBCD7 & 0xCFFD);
        OpenGlHelper.llIllllIlIIlIl[34] = (-(0xFFFFAFE3 & 0x511E) & (0xFFFFEDDF & 0x9FF7));
        OpenGlHelper.llIllllIlIIlIl[35] = (-(0xFFFFD97F & 0x7781) & (0xFFFFDDF7 & 0xFFDF));
        OpenGlHelper.llIllllIlIIlIl[36] = (0xFFFFAEFB & 0xDDDF);
        OpenGlHelper.llIllllIlIIlIl[37] = (-(0xFFFF9F3E & 0x73E3) & (0xFFFF9FFD & 0xFFFF));
        OpenGlHelper.llIllllIlIIlIl[38] = (45 + 138 - 106 + 75 ^ 102 + 12 - 12 + 57);
        OpenGlHelper.llIllllIlIIlIl[39] = (0x62 ^ 0x6A);
        OpenGlHelper.llIllllIlIIlIl[40] = (0x25 ^ 0x2C);
        OpenGlHelper.llIllllIlIIlIl[41] = (0xB9 ^ 0xB3);
        OpenGlHelper.llIllllIlIIlIl[42] = (0x42 ^ 0x49);
        OpenGlHelper.llIllllIlIIlIl[43] = (71 + 98 - 87 + 119 ^ 41 + 23 + 12 + 121);
        OpenGlHelper.llIllllIlIIlIl[44] = (0x15 ^ 0x18);
        OpenGlHelper.llIllllIlIIlIl[45] = (154 + 113 - 142 + 34 ^ 15 + 124 - 131 + 137);
        OpenGlHelper.llIllllIlIIlIl[46] = (0x87 ^ 0x88);
        OpenGlHelper.llIllllIlIIlIl[47] = (0x27 ^ 0x37);
        OpenGlHelper.llIllllIlIIlIl[48] = (0x6 ^ 0x11 ^ (0x9F ^ 0x99));
        OpenGlHelper.llIllllIlIIlIl[49] = (143 + 33 - 66 + 42 ^ 42 + 20 - 6 + 82);
        OpenGlHelper.llIllllIlIIlIl[50] = (0xE6 ^ 0xA3 ^ (0x2F ^ 0x79));
        OpenGlHelper.llIllllIlIIlIl[51] = (0x17 ^ 0x33 ^ (0xF0 ^ 0xC0));
        OpenGlHelper.llIllllIlIIlIl[52] = (0x3B ^ 0x2E);
        OpenGlHelper.llIllllIlIIlIl[53] = (0x38 ^ 0x7B ^ (0x44 ^ 0x11));
        OpenGlHelper.llIllllIlIIlIl[54] = (0x19 ^ 0xE);
        OpenGlHelper.llIllllIlIIlIl[55] = (0x61 ^ 0x3A ^ (0x18 ^ 0x5B));
        OpenGlHelper.llIllllIlIIlIl[56] = (0x99 ^ 0x80);
        OpenGlHelper.llIllllIlIIlIl[57] = (0x8A ^ 0xA7 ^ (0x25 ^ 0x12));
        OpenGlHelper.llIllllIlIIlIl[58] = (0x77 ^ 0x6C);
        OpenGlHelper.llIllllIlIIlIl[59] = (0x1C ^ 0x0);
        OpenGlHelper.llIllllIlIIlIl[60] = (0x63 ^ 0x4D ^ (0xB8 ^ 0x8B));
        OpenGlHelper.llIllllIlIIlIl[61] = (0x40 ^ 0x63 ^ (0xB8 ^ 0x85));
        OpenGlHelper.llIllllIlIIlIl[62] = (0x3 ^ 0x4D ^ (0x67 ^ 0x36));
        OpenGlHelper.llIllllIlIIlIl[63] = (0xCC ^ 0xBF ^ (0x27 ^ 0x74));
        OpenGlHelper.llIllllIlIIlIl[64] = (0x49 ^ 0x6C ^ (0x9A ^ 0x9E));
        OpenGlHelper.llIllllIlIIlIl[65] = (3 + 103 + 8 + 52 ^ 113 + 15 - 20 + 24);
        OpenGlHelper.llIllllIlIIlIl[66] = (-(0xFFFFFCEE & 0x1373) & (0xFFFFFBEF & 0x9FF3));
        OpenGlHelper.llIllllIlIIlIl[67] = (-(0xFFFFF73B & 0x3CF7) & (0xFFFFFFB3 & 0xBFFF));
        OpenGlHelper.llIllllIlIIlIl[68] = (-(0xFFFFADFF & 0x768F) & (0xFFFFEFBF & 0xBFFF));
        OpenGlHelper.llIllllIlIIlIl[69] = (0xFFFF8BFA & 0xFF35);
        OpenGlHelper.llIllllIlIIlIl[70] = (0x45 ^ 0x66);
        OpenGlHelper.llIllllIlIIlIl[71] = (156 + 17 - 107 + 118 ^ 38 + 101 - 77 + 94);
        OpenGlHelper.llIllllIlIIlIl[72] = (0x15 ^ 0x7E ^ (0xD7 ^ 0x99));
        OpenGlHelper.llIllllIlIIlIl[73] = (0xC ^ 0x2A);
        OpenGlHelper.llIllllIlIIlIl[74] = (0x70 ^ 0x57);
        OpenGlHelper.llIllllIlIIlIl[75] = (0x5 ^ 0x2D);
        OpenGlHelper.llIllllIlIIlIl[76] = (0xF ^ 0x66 ^ (0xD2 ^ 0x92));
        OpenGlHelper.llIllllIlIIlIl[77] = (0xFF ^ 0x85 ^ (0xDE ^ 0x8E));
        OpenGlHelper.llIllllIlIIlIl[78] = (0x49 ^ 0x70 ^ (0x2 ^ 0x10));
        OpenGlHelper.llIllllIlIIlIl[79] = (0x85 ^ 0xA9);
        OpenGlHelper.llIllllIlIIlIl[80] = (0x3 ^ 0x2E);
        OpenGlHelper.llIllllIlIIlIl[81] = (0x58 ^ 0x13 ^ (0x40 ^ 0x25));
        OpenGlHelper.llIllllIlIIlIl[82] = (0xA ^ 0x13 ^ (0xF2 ^ 0xC4));
        OpenGlHelper.llIllllIlIIlIl[83] = (10 + 28 + 41 + 58 ^ 65 + 72 - 134 + 182);
        OpenGlHelper.llIllllIlIIlIl[84] = (5 + 118 - 76 + 80 ^ (0xE6 ^ 0xA8));
        OpenGlHelper.llIllllIlIIlIl[85] = (0x2B ^ 0x22 ^ (0x20 ^ 0x1B));
        OpenGlHelper.llIllllIlIIlIl[86] = (0x1D ^ 0x2E);
        OpenGlHelper.llIllllIlIIlIl[87] = (0xFFFF9F39 & 0x7FC6);
        OpenGlHelper.llIllllIlIIlIl[88] = (0xF0 ^ 0xC4);
        OpenGlHelper.llIllllIlIIlIl[89] = (0x5 ^ 0x23 ^ (0x94 ^ 0x87));
        OpenGlHelper.llIllllIlIIlIl[90] = (0x5A ^ 0x6C);
        OpenGlHelper.llIllllIlIIlIl[91] = (69 + 138 - 202 + 158 ^ 70 + 0 + 52 + 26);
        OpenGlHelper.llIllllIlIIlIl[92] = (0x6C ^ 0x79 ^ (0x94 ^ 0xB9));
        OpenGlHelper.llIllllIlIIlIl[93] = (0xDC ^ 0x96 ^ (0xCC ^ 0xBF));
        OpenGlHelper.llIllllIlIIlIl[94] = (-(0xFFFFBD5D & 0x72AE) & (0xFFFFB8EF & 0xFFFF));
        OpenGlHelper.llIllllIlIIlIl[95] = (0xFFFFBCB2 & 0xCBDF);
        OpenGlHelper.llIllllIlIIlIl[96] = (105 + 186 - 53 + 11 ^ 77 + 144 - 80 + 54);
        OpenGlHelper.llIllllIlIIlIl[97] = (0xF9 ^ 0xC2);
        OpenGlHelper.llIllllIlIIlIl[98] = (0x69 ^ 0x6C ^ (0x48 ^ 0x71));
        OpenGlHelper.llIllllIlIIlIl[99] = (101 + 50 - 97 + 102 ^ 130 + 70 - 173 + 134);
        OpenGlHelper.llIllllIlIIlIl[100] = (0xC9 ^ 0xA9 ^ (0xF7 ^ 0xA9));
        OpenGlHelper.llIllllIlIIlIl[101] = -" ".length();
        OpenGlHelper.llIllllIlIIlIl[102] = (0xA3 ^ 0x9C);
        OpenGlHelper.llIllllIlIIlIl[103] = (0x70 ^ 0x30);
    }
    
    public static void initializeTextures() {
        final ContextCapabilities llllllllllllIllIIIIllIlllllIlIIl = GLContext.getCapabilities();
        int arbMultitexture;
        if (lIIllIlIlIlIlIll(llllllllllllIllIIIIllIlllllIlIIl.GL_ARB_multitexture ? 1 : 0) && lIIllIlIlIlIllII(llllllllllllIllIIIIllIlllllIlIIl.OpenGL13 ? 1 : 0)) {
            arbMultitexture = OpenGlHelper.llIllllIlIIlIl[1];
            "".length();
            if (((0x6 ^ 0x47) & ~(0x63 ^ 0x22)) != 0x0) {
                return;
            }
        }
        else {
            arbMultitexture = OpenGlHelper.llIllllIlIIlIl[0];
        }
        OpenGlHelper.arbMultitexture = (arbMultitexture != 0);
        int arbTextureEnvCombine;
        if (lIIllIlIlIlIlIll(llllllllllllIllIIIIllIlllllIlIIl.GL_ARB_texture_env_combine ? 1 : 0) && lIIllIlIlIlIllII(llllllllllllIllIIIIllIlllllIlIIl.OpenGL13 ? 1 : 0)) {
            arbTextureEnvCombine = OpenGlHelper.llIllllIlIIlIl[1];
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else {
            arbTextureEnvCombine = OpenGlHelper.llIllllIlIIlIl[0];
        }
        OpenGlHelper.arbTextureEnvCombine = (arbTextureEnvCombine != 0);
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbMultitexture ? 1 : 0)) {
            OpenGlHelper.logText = String.valueOf(new StringBuilder(String.valueOf(OpenGlHelper.logText)).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[1]]));
            OpenGlHelper.defaultTexUnit = OpenGlHelper.llIllllIlIIlIl[2];
            OpenGlHelper.lightmapTexUnit = OpenGlHelper.llIllllIlIIlIl[3];
            OpenGlHelper.GL_TEXTURE2 = OpenGlHelper.llIllllIlIIlIl[4];
            "".length();
            if ((0x52 ^ 0x44 ^ (0xA7 ^ 0xB5)) != (0x22 ^ 0x3D ^ (0x39 ^ 0x22))) {
                return;
            }
        }
        else {
            OpenGlHelper.logText = String.valueOf(new StringBuilder(String.valueOf(OpenGlHelper.logText)).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[5]]));
            OpenGlHelper.defaultTexUnit = OpenGlHelper.llIllllIlIIlIl[2];
            OpenGlHelper.lightmapTexUnit = OpenGlHelper.llIllllIlIIlIl[3];
            OpenGlHelper.GL_TEXTURE2 = OpenGlHelper.llIllllIlIIlIl[4];
        }
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbTextureEnvCombine ? 1 : 0)) {
            OpenGlHelper.logText = String.valueOf(new StringBuilder(String.valueOf(OpenGlHelper.logText)).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[6]]));
            OpenGlHelper.GL_COMBINE = OpenGlHelper.llIllllIlIIlIl[7];
            OpenGlHelper.GL_INTERPOLATE = OpenGlHelper.llIllllIlIIlIl[8];
            OpenGlHelper.GL_PRIMARY_COLOR = OpenGlHelper.llIllllIlIIlIl[9];
            OpenGlHelper.GL_CONSTANT = OpenGlHelper.llIllllIlIIlIl[10];
            OpenGlHelper.GL_PREVIOUS = OpenGlHelper.llIllllIlIIlIl[11];
            OpenGlHelper.GL_COMBINE_RGB = OpenGlHelper.llIllllIlIIlIl[12];
            OpenGlHelper.GL_SOURCE0_RGB = OpenGlHelper.llIllllIlIIlIl[13];
            OpenGlHelper.GL_SOURCE1_RGB = OpenGlHelper.llIllllIlIIlIl[14];
            OpenGlHelper.GL_SOURCE2_RGB = OpenGlHelper.llIllllIlIIlIl[15];
            OpenGlHelper.GL_OPERAND0_RGB = OpenGlHelper.llIllllIlIIlIl[16];
            OpenGlHelper.GL_OPERAND1_RGB = OpenGlHelper.llIllllIlIIlIl[17];
            OpenGlHelper.GL_OPERAND2_RGB = OpenGlHelper.llIllllIlIIlIl[18];
            OpenGlHelper.GL_COMBINE_ALPHA = OpenGlHelper.llIllllIlIIlIl[19];
            OpenGlHelper.GL_SOURCE0_ALPHA = OpenGlHelper.llIllllIlIIlIl[20];
            OpenGlHelper.GL_SOURCE1_ALPHA = OpenGlHelper.llIllllIlIIlIl[21];
            OpenGlHelper.GL_SOURCE2_ALPHA = OpenGlHelper.llIllllIlIIlIl[22];
            OpenGlHelper.GL_OPERAND0_ALPHA = OpenGlHelper.llIllllIlIIlIl[23];
            OpenGlHelper.GL_OPERAND1_ALPHA = OpenGlHelper.llIllllIlIIlIl[24];
            OpenGlHelper.GL_OPERAND2_ALPHA = OpenGlHelper.llIllllIlIIlIl[25];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            OpenGlHelper.logText = String.valueOf(new StringBuilder(String.valueOf(OpenGlHelper.logText)).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[26]]));
            OpenGlHelper.GL_COMBINE = OpenGlHelper.llIllllIlIIlIl[7];
            OpenGlHelper.GL_INTERPOLATE = OpenGlHelper.llIllllIlIIlIl[8];
            OpenGlHelper.GL_PRIMARY_COLOR = OpenGlHelper.llIllllIlIIlIl[9];
            OpenGlHelper.GL_CONSTANT = OpenGlHelper.llIllllIlIIlIl[10];
            OpenGlHelper.GL_PREVIOUS = OpenGlHelper.llIllllIlIIlIl[11];
            OpenGlHelper.GL_COMBINE_RGB = OpenGlHelper.llIllllIlIIlIl[12];
            OpenGlHelper.GL_SOURCE0_RGB = OpenGlHelper.llIllllIlIIlIl[13];
            OpenGlHelper.GL_SOURCE1_RGB = OpenGlHelper.llIllllIlIIlIl[14];
            OpenGlHelper.GL_SOURCE2_RGB = OpenGlHelper.llIllllIlIIlIl[15];
            OpenGlHelper.GL_OPERAND0_RGB = OpenGlHelper.llIllllIlIIlIl[16];
            OpenGlHelper.GL_OPERAND1_RGB = OpenGlHelper.llIllllIlIIlIl[17];
            OpenGlHelper.GL_OPERAND2_RGB = OpenGlHelper.llIllllIlIIlIl[18];
            OpenGlHelper.GL_COMBINE_ALPHA = OpenGlHelper.llIllllIlIIlIl[19];
            OpenGlHelper.GL_SOURCE0_ALPHA = OpenGlHelper.llIllllIlIIlIl[20];
            OpenGlHelper.GL_SOURCE1_ALPHA = OpenGlHelper.llIllllIlIIlIl[21];
            OpenGlHelper.GL_SOURCE2_ALPHA = OpenGlHelper.llIllllIlIIlIl[22];
            OpenGlHelper.GL_OPERAND0_ALPHA = OpenGlHelper.llIllllIlIIlIl[23];
            OpenGlHelper.GL_OPERAND1_ALPHA = OpenGlHelper.llIllllIlIIlIl[24];
            OpenGlHelper.GL_OPERAND2_ALPHA = OpenGlHelper.llIllllIlIIlIl[25];
        }
        int extBlendFuncSeparate;
        if (lIIllIlIlIlIlIll(llllllllllllIllIIIIllIlllllIlIIl.GL_EXT_blend_func_separate ? 1 : 0) && lIIllIlIlIlIllII(llllllllllllIllIIIIllIlllllIlIIl.OpenGL14 ? 1 : 0)) {
            extBlendFuncSeparate = OpenGlHelper.llIllllIlIIlIl[1];
            "".length();
            if ((90 + 120 - 96 + 28 ^ 12 + 88 - 90 + 128) < 0) {
                return;
            }
        }
        else {
            extBlendFuncSeparate = OpenGlHelper.llIllllIlIIlIl[0];
        }
        OpenGlHelper.extBlendFuncSeparate = (extBlendFuncSeparate != 0);
        int openGL14;
        if (lIIllIlIlIlIllII(llllllllllllIllIIIIllIlllllIlIIl.OpenGL14 ? 1 : 0) && lIIllIlIlIlIllII(llllllllllllIllIIIIllIlllllIlIIl.GL_EXT_blend_func_separate ? 1 : 0)) {
            openGL14 = OpenGlHelper.llIllllIlIIlIl[0];
            "".length();
            if ("   ".length() == 0) {
                return;
            }
        }
        else {
            openGL14 = OpenGlHelper.llIllllIlIIlIl[1];
        }
        OpenGlHelper.openGL14 = (openGL14 != 0);
        int framebufferSupported;
        if (lIIllIlIlIlIlIll(OpenGlHelper.openGL14 ? 1 : 0) && (!lIIllIlIlIlIllII(llllllllllllIllIIIIllIlllllIlIIl.GL_ARB_framebuffer_object ? 1 : 0) || !lIIllIlIlIlIllII(llllllllllllIllIIIIllIlllllIlIIl.GL_EXT_framebuffer_object ? 1 : 0) || lIIllIlIlIlIlIll(llllllllllllIllIIIIllIlllllIlIIl.OpenGL30 ? 1 : 0))) {
            framebufferSupported = OpenGlHelper.llIllllIlIIlIl[1];
            "".length();
            if (-" ".length() == ((0x21 ^ 0x2E) & ~(0x73 ^ 0x7C))) {
                return;
            }
        }
        else {
            framebufferSupported = OpenGlHelper.llIllllIlIIlIl[0];
        }
        OpenGlHelper.framebufferSupported = (framebufferSupported != 0);
        if (lIIllIlIlIlIlIll(OpenGlHelper.framebufferSupported ? 1 : 0)) {
            OpenGlHelper.logText = String.valueOf(new StringBuilder(String.valueOf(OpenGlHelper.logText)).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[27]]));
            if (lIIllIlIlIlIlIll(llllllllllllIllIIIIllIlllllIlIIl.OpenGL30 ? 1 : 0)) {
                OpenGlHelper.logText = String.valueOf(new StringBuilder(String.valueOf(OpenGlHelper.logText)).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[28]]));
                OpenGlHelper.framebufferType = OpenGlHelper.llIllllIlIIlIl[0];
                OpenGlHelper.GL_FRAMEBUFFER = OpenGlHelper.llIllllIlIIlIl[29];
                OpenGlHelper.GL_RENDERBUFFER = OpenGlHelper.llIllllIlIIlIl[30];
                OpenGlHelper.GL_COLOR_ATTACHMENT0 = OpenGlHelper.llIllllIlIIlIl[31];
                OpenGlHelper.GL_DEPTH_ATTACHMENT = OpenGlHelper.llIllllIlIIlIl[32];
                OpenGlHelper.GL_FRAMEBUFFER_COMPLETE = OpenGlHelper.llIllllIlIIlIl[33];
                OpenGlHelper.GL_FB_INCOMPLETE_ATTACHMENT = OpenGlHelper.llIllllIlIIlIl[34];
                OpenGlHelper.GL_FB_INCOMPLETE_MISS_ATTACH = OpenGlHelper.llIllllIlIIlIl[35];
                OpenGlHelper.GL_FB_INCOMPLETE_DRAW_BUFFER = OpenGlHelper.llIllllIlIIlIl[36];
                OpenGlHelper.GL_FB_INCOMPLETE_READ_BUFFER = OpenGlHelper.llIllllIlIIlIl[37];
                "".length();
                if ((0x9 ^ 0x15 ^ (0xB3 ^ 0xAB)) == 0x0) {
                    return;
                }
            }
            else if (lIIllIlIlIlIlIll(llllllllllllIllIIIIllIlllllIlIIl.GL_ARB_framebuffer_object ? 1 : 0)) {
                OpenGlHelper.logText = String.valueOf(new StringBuilder(String.valueOf(OpenGlHelper.logText)).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[38]]));
                OpenGlHelper.framebufferType = OpenGlHelper.llIllllIlIIlIl[1];
                OpenGlHelper.GL_FRAMEBUFFER = OpenGlHelper.llIllllIlIIlIl[29];
                OpenGlHelper.GL_RENDERBUFFER = OpenGlHelper.llIllllIlIIlIl[30];
                OpenGlHelper.GL_COLOR_ATTACHMENT0 = OpenGlHelper.llIllllIlIIlIl[31];
                OpenGlHelper.GL_DEPTH_ATTACHMENT = OpenGlHelper.llIllllIlIIlIl[32];
                OpenGlHelper.GL_FRAMEBUFFER_COMPLETE = OpenGlHelper.llIllllIlIIlIl[33];
                OpenGlHelper.GL_FB_INCOMPLETE_MISS_ATTACH = OpenGlHelper.llIllllIlIIlIl[35];
                OpenGlHelper.GL_FB_INCOMPLETE_ATTACHMENT = OpenGlHelper.llIllllIlIIlIl[34];
                OpenGlHelper.GL_FB_INCOMPLETE_DRAW_BUFFER = OpenGlHelper.llIllllIlIIlIl[36];
                OpenGlHelper.GL_FB_INCOMPLETE_READ_BUFFER = OpenGlHelper.llIllllIlIIlIl[37];
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
            }
            else if (lIIllIlIlIlIlIll(llllllllllllIllIIIIllIlllllIlIIl.GL_EXT_framebuffer_object ? 1 : 0)) {
                OpenGlHelper.logText = String.valueOf(new StringBuilder(String.valueOf(OpenGlHelper.logText)).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[39]]));
                OpenGlHelper.framebufferType = OpenGlHelper.llIllllIlIIlIl[5];
                OpenGlHelper.GL_FRAMEBUFFER = OpenGlHelper.llIllllIlIIlIl[29];
                OpenGlHelper.GL_RENDERBUFFER = OpenGlHelper.llIllllIlIIlIl[30];
                OpenGlHelper.GL_COLOR_ATTACHMENT0 = OpenGlHelper.llIllllIlIIlIl[31];
                OpenGlHelper.GL_DEPTH_ATTACHMENT = OpenGlHelper.llIllllIlIIlIl[32];
                OpenGlHelper.GL_FRAMEBUFFER_COMPLETE = OpenGlHelper.llIllllIlIIlIl[33];
                OpenGlHelper.GL_FB_INCOMPLETE_MISS_ATTACH = OpenGlHelper.llIllllIlIIlIl[35];
                OpenGlHelper.GL_FB_INCOMPLETE_ATTACHMENT = OpenGlHelper.llIllllIlIIlIl[34];
                OpenGlHelper.GL_FB_INCOMPLETE_DRAW_BUFFER = OpenGlHelper.llIllllIlIIlIl[36];
                OpenGlHelper.GL_FB_INCOMPLETE_READ_BUFFER = OpenGlHelper.llIllllIlIIlIl[37];
                "".length();
                if (null != null) {
                    return;
                }
            }
        }
        else {
            OpenGlHelper.logText = String.valueOf(new StringBuilder(String.valueOf(OpenGlHelper.logText)).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[40]]));
            final StringBuilder append = new StringBuilder(String.valueOf(OpenGlHelper.logText)).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[41]]);
            String str;
            if (lIIllIlIlIlIlIll(llllllllllllIllIIIIllIlllllIlIIl.OpenGL14 ? 1 : 0)) {
                str = OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[42]];
                "".length();
                if (" ".length() > "  ".length()) {
                    return;
                }
            }
            else {
                str = OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[43]];
            }
            OpenGlHelper.logText = String.valueOf(append.append(str).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[44]]));
            final StringBuilder append2 = new StringBuilder(String.valueOf(OpenGlHelper.logText)).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[45]]);
            String str2;
            if (lIIllIlIlIlIlIll(llllllllllllIllIIIIllIlllllIlIIl.GL_EXT_blend_func_separate ? 1 : 0)) {
                str2 = OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[46]];
                "".length();
                if ((0x2E ^ 0x2A) <= " ".length()) {
                    return;
                }
            }
            else {
                str2 = OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[47]];
            }
            OpenGlHelper.logText = String.valueOf(append2.append(str2).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[48]]));
            final StringBuilder append3 = new StringBuilder(String.valueOf(OpenGlHelper.logText)).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[49]]);
            String str3;
            if (lIIllIlIlIlIlIll(llllllllllllIllIIIIllIlllllIlIIl.OpenGL30 ? 1 : 0)) {
                str3 = OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[50]];
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            }
            else {
                str3 = OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[51]];
            }
            OpenGlHelper.logText = String.valueOf(append3.append(str3).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[52]]));
            final StringBuilder append4 = new StringBuilder(String.valueOf(OpenGlHelper.logText)).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[53]]);
            String str4;
            if (lIIllIlIlIlIlIll(llllllllllllIllIIIIllIlllllIlIIl.GL_ARB_framebuffer_object ? 1 : 0)) {
                str4 = OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[54]];
                "".length();
                if (-(0x68 ^ 0x6C) > 0) {
                    return;
                }
            }
            else {
                str4 = OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[55]];
            }
            OpenGlHelper.logText = String.valueOf(append4.append(str4).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[56]]));
            final StringBuilder append5 = new StringBuilder(String.valueOf(OpenGlHelper.logText)).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[57]]);
            String str5;
            if (lIIllIlIlIlIlIll(llllllllllllIllIIIIllIlllllIlIIl.GL_EXT_framebuffer_object ? 1 : 0)) {
                str5 = OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[58]];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                str5 = OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[59]];
            }
            OpenGlHelper.logText = String.valueOf(append5.append(str5).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[60]]));
        }
        OpenGlHelper.openGL21 = llllllllllllIllIIIIllIlllllIlIIl.OpenGL21;
        int shadersAvailable;
        if (lIIllIlIlIlIllII(OpenGlHelper.openGL21 ? 1 : 0) && (!lIIllIlIlIlIlIll(llllllllllllIllIIIIllIlllllIlIIl.GL_ARB_vertex_shader ? 1 : 0) || !lIIllIlIlIlIlIll(llllllllllllIllIIIIllIlllllIlIIl.GL_ARB_fragment_shader ? 1 : 0) || lIIllIlIlIlIllII(llllllllllllIllIIIIllIlllllIlIIl.GL_ARB_shader_objects ? 1 : 0))) {
            shadersAvailable = OpenGlHelper.llIllllIlIIlIl[0];
            "".length();
            if (" ".length() >= "  ".length()) {
                return;
            }
        }
        else {
            shadersAvailable = OpenGlHelper.llIllllIlIIlIl[1];
        }
        OpenGlHelper.shadersAvailable = (shadersAvailable != 0);
        final StringBuilder append6 = new StringBuilder(String.valueOf(OpenGlHelper.logText)).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[61]]);
        String str6;
        if (lIIllIlIlIlIlIll(OpenGlHelper.shadersAvailable ? 1 : 0)) {
            str6 = OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[62]];
            "".length();
            if (((0xBE ^ 0x9C) & ~(0x9B ^ 0xB9)) == (0x37 ^ 0x33)) {
                return;
            }
        }
        else {
            str6 = OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[63]];
        }
        OpenGlHelper.logText = String.valueOf(append6.append(str6).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[64]]));
        if (lIIllIlIlIlIlIll(OpenGlHelper.shadersAvailable ? 1 : 0)) {
            if (lIIllIlIlIlIlIll(llllllllllllIllIIIIllIlllllIlIIl.OpenGL21 ? 1 : 0)) {
                OpenGlHelper.logText = String.valueOf(new StringBuilder(String.valueOf(OpenGlHelper.logText)).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[65]]));
                OpenGlHelper.arbShaders = (OpenGlHelper.llIllllIlIIlIl[0] != 0);
                OpenGlHelper.GL_LINK_STATUS = OpenGlHelper.llIllllIlIIlIl[66];
                OpenGlHelper.GL_COMPILE_STATUS = OpenGlHelper.llIllllIlIIlIl[67];
                OpenGlHelper.GL_VERTEX_SHADER = OpenGlHelper.llIllllIlIIlIl[68];
                OpenGlHelper.GL_FRAGMENT_SHADER = OpenGlHelper.llIllllIlIIlIl[69];
                "".length();
                if (-(0x17 ^ 0x13) >= 0) {
                    return;
                }
            }
            else {
                OpenGlHelper.logText = String.valueOf(new StringBuilder(String.valueOf(OpenGlHelper.logText)).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[70]]));
                OpenGlHelper.arbShaders = (OpenGlHelper.llIllllIlIIlIl[1] != 0);
                OpenGlHelper.GL_LINK_STATUS = OpenGlHelper.llIllllIlIIlIl[66];
                OpenGlHelper.GL_COMPILE_STATUS = OpenGlHelper.llIllllIlIIlIl[67];
                OpenGlHelper.GL_VERTEX_SHADER = OpenGlHelper.llIllllIlIIlIl[68];
                OpenGlHelper.GL_FRAGMENT_SHADER = OpenGlHelper.llIllllIlIIlIl[69];
                "".length();
                if (-" ".length() >= "  ".length()) {
                    return;
                }
            }
        }
        else {
            final StringBuilder append7 = new StringBuilder(String.valueOf(OpenGlHelper.logText)).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[71]]);
            String str7;
            if (lIIllIlIlIlIlIll(llllllllllllIllIIIIllIlllllIlIIl.OpenGL21 ? 1 : 0)) {
                str7 = OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[72]];
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
            }
            else {
                str7 = OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[73]];
            }
            OpenGlHelper.logText = String.valueOf(append7.append(str7).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[74]]));
            final StringBuilder append8 = new StringBuilder(String.valueOf(OpenGlHelper.logText)).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[75]]);
            String str8;
            if (lIIllIlIlIlIlIll(llllllllllllIllIIIIllIlllllIlIIl.GL_ARB_shader_objects ? 1 : 0)) {
                str8 = OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[76]];
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
            }
            else {
                str8 = OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[77]];
            }
            OpenGlHelper.logText = String.valueOf(append8.append(str8).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[78]]));
            final StringBuilder append9 = new StringBuilder(String.valueOf(OpenGlHelper.logText)).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[79]]);
            String str9;
            if (lIIllIlIlIlIlIll(llllllllllllIllIIIIllIlllllIlIIl.GL_ARB_vertex_shader ? 1 : 0)) {
                str9 = OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[80]];
                "".length();
                if ("  ".length() < ((0x2C ^ 0x63) & ~(0x13 ^ 0x5C))) {
                    return;
                }
            }
            else {
                str9 = OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[81]];
            }
            OpenGlHelper.logText = String.valueOf(append9.append(str9).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[82]]));
            final StringBuilder append10 = new StringBuilder(String.valueOf(OpenGlHelper.logText)).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[83]]);
            String str10;
            if (lIIllIlIlIlIlIll(llllllllllllIllIIIIllIlllllIlIIl.GL_ARB_fragment_shader ? 1 : 0)) {
                str10 = OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[84]];
                "".length();
                if (-" ".length() > ((0x55 ^ 0x7 ^ (0x49 ^ 0x3C)) & ("   ".length() ^ (0x2A ^ 0xE) ^ -" ".length()))) {
                    return;
                }
            }
            else {
                str10 = OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[85]];
            }
            OpenGlHelper.logText = String.valueOf(append10.append(str10).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[86]]));
        }
        int shadersSupported;
        if (lIIllIlIlIlIlIll(OpenGlHelper.framebufferSupported ? 1 : 0) && lIIllIlIlIlIlIll(OpenGlHelper.shadersAvailable ? 1 : 0)) {
            shadersSupported = OpenGlHelper.llIllllIlIIlIl[1];
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else {
            shadersSupported = OpenGlHelper.llIllllIlIIlIl[0];
        }
        OpenGlHelper.shadersSupported = (shadersSupported != 0);
        final String llllllllllllIllIIIIllIlllllIlIII = GL11.glGetString(OpenGlHelper.llIllllIlIIlIl[87]).toLowerCase();
        OpenGlHelper.nvidia = llllllllllllIllIIIIllIlllllIlIII.contains(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[88]]);
        int arbVbo;
        if (lIIllIlIlIlIllII(llllllllllllIllIIIIllIlllllIlIIl.OpenGL15 ? 1 : 0) && lIIllIlIlIlIlIll(llllllllllllIllIIIIllIlllllIlIIl.GL_ARB_vertex_buffer_object ? 1 : 0)) {
            arbVbo = OpenGlHelper.llIllllIlIIlIl[1];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            arbVbo = OpenGlHelper.llIllllIlIIlIl[0];
        }
        OpenGlHelper.arbVbo = (arbVbo != 0);
        int vboSupported;
        if (lIIllIlIlIlIllII(llllllllllllIllIIIIllIlllllIlIIl.OpenGL15 ? 1 : 0) && lIIllIlIlIlIllII(OpenGlHelper.arbVbo ? 1 : 0)) {
            vboSupported = OpenGlHelper.llIllllIlIIlIl[0];
            "".length();
            if (" ".length() == "   ".length()) {
                return;
            }
        }
        else {
            vboSupported = OpenGlHelper.llIllllIlIIlIl[1];
        }
        OpenGlHelper.vboSupported = (vboSupported != 0);
        final StringBuilder append11 = new StringBuilder(String.valueOf(OpenGlHelper.logText)).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[89]]);
        String str11;
        if (lIIllIlIlIlIlIll(OpenGlHelper.vboSupported ? 1 : 0)) {
            str11 = OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[90]];
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        else {
            str11 = OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[91]];
        }
        OpenGlHelper.logText = String.valueOf(append11.append(str11).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[92]]));
        if (lIIllIlIlIlIlIll(OpenGlHelper.vboSupported ? 1 : 0)) {
            if (lIIllIlIlIlIlIll(OpenGlHelper.arbVbo ? 1 : 0)) {
                OpenGlHelper.logText = String.valueOf(new StringBuilder(String.valueOf(OpenGlHelper.logText)).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[93]]));
                OpenGlHelper.GL_STATIC_DRAW = OpenGlHelper.llIllllIlIIlIl[94];
                OpenGlHelper.GL_ARRAY_BUFFER = OpenGlHelper.llIllllIlIIlIl[95];
                "".length();
                if (((134 + 227 - 193 + 87 ^ 141 + 90 - 126 + 69) & (0x28 ^ 0x15 ^ (0xE5 ^ 0x89) ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else {
                OpenGlHelper.logText = String.valueOf(new StringBuilder(String.valueOf(OpenGlHelper.logText)).append(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[96]]));
                OpenGlHelper.GL_STATIC_DRAW = OpenGlHelper.llIllllIlIIlIl[94];
                OpenGlHelper.GL_ARRAY_BUFFER = OpenGlHelper.llIllllIlIIlIl[95];
            }
        }
        OpenGlHelper.field_181063_b = llllllllllllIllIIIIllIlllllIlIII.contains(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[97]]);
        if (lIIllIlIlIlIlIll(OpenGlHelper.field_181063_b ? 1 : 0)) {
            if (lIIllIlIlIlIlIll(OpenGlHelper.vboSupported ? 1 : 0)) {
                OpenGlHelper.field_181062_Q = (OpenGlHelper.llIllllIlIIlIl[1] != 0);
                "".length();
                if (-"   ".length() >= 0) {
                    return;
                }
            }
            else {
                GameSettings.Options.RENDER_DISTANCE.setValueMax(16.0f);
            }
        }
        try {
            final Processor[] llllllllllllIllIIIIllIlllllIIlll = new SystemInfo().getHardware().getProcessors();
            final String format = OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[98]];
            final Object[] args = new Object[OpenGlHelper.llIllllIlIIlIl[5]];
            args[OpenGlHelper.llIllllIlIIlIl[0]] = llllllllllllIllIIIIllIlllllIIlll.length;
            args[OpenGlHelper.llIllllIlIIlIl[1]] = llllllllllllIllIIIIllIlllllIIlll[OpenGlHelper.llIllllIlIIlIl[0]];
            OpenGlHelper.field_183030_aa = String.format(format, args).replaceAll(OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[99]], OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[100]]);
            "".length();
            if (((0x24 ^ 0x7A ^ (0x7E ^ 0x36)) & (0x2 ^ 0x39 ^ (0x83 ^ 0xAE) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        catch (Throwable t) {}
    }
    
    public static void glUseProgram(final int llllllllllllIllIIIIllIlllIllIlIl) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            ARBShaderObjects.glUseProgramObjectARB(llllllllllllIllIIIIllIlllIllIlIl);
            "".length();
            if (((152 + 36 - 159 + 169 ^ 55 + 137 - 56 + 7) & (0xE3 ^ 0xBF ^ (0x2B ^ 0x3E) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            GL20.glUseProgram(llllllllllllIllIIIIllIlllIllIlIl);
        }
    }
    
    public static void glFramebufferTexture2D(final int llllllllllllIllIIIIllIllIIIIllII, final int llllllllllllIllIIIIllIllIIIIlIll, final int llllllllllllIllIIIIllIllIIIIIlIl, final int llllllllllllIllIIIIllIllIIIIlIIl, final int llllllllllllIllIIIIllIllIIIIlIII) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.framebufferSupported ? 1 : 0)) {
            switch (OpenGlHelper.framebufferType) {
                case 0: {
                    GL30.glFramebufferTexture2D(llllllllllllIllIIIIllIllIIIIllII, llllllllllllIllIIIIllIllIIIIlIll, llllllllllllIllIIIIllIllIIIIIlIl, llllllllllllIllIIIIllIllIIIIlIIl, llllllllllllIllIIIIllIllIIIIlIII);
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glFramebufferTexture2D(llllllllllllIllIIIIllIllIIIIllII, llllllllllllIllIIIIllIllIIIIlIll, llllllllllllIllIIIIllIllIIIIIlIl, llllllllllllIllIIIIllIllIIIIlIIl, llllllllllllIllIIIIllIllIIIIlIII);
                    "".length();
                    if ("   ".length() <= " ".length()) {
                        return;
                    }
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glFramebufferTexture2DEXT(llllllllllllIllIIIIllIllIIIIllII, llllllllllllIllIIIIllIllIIIIlIll, llllllllllllIllIIIIllIllIIIIIlIl, llllllllllllIllIIIIllIllIIIIlIIl, llllllllllllIllIIIIllIllIIIIlIII);
                    break;
                }
            }
        }
    }
    
    public static boolean useVbo() {
        if (lIIllIlIlIlIlIll(OpenGlHelper.vboSupported ? 1 : 0) && lIIllIlIlIlIlIll(Minecraft.getMinecraft().gameSettings.useVbo ? 1 : 0)) {
            return OpenGlHelper.llIllllIlIIlIl[1] != 0;
        }
        return OpenGlHelper.llIllllIlIIlIl[0] != 0;
    }
    
    private static void lIIllIlIlIlIlIIl() {
        (llIllllIlIIlII = new String[OpenGlHelper.llIllllIlIIlIl[103]])[OpenGlHelper.llIllllIlIIlIl[0]] = lIIllIlIlIlIIllI("OP0qWpH0opc=", "sfnsF");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[1]] = lIIllIlIlIlIIllI("WkV6w9d1+U0fN5BNnH/GTQswOPwLliQ4dMLDJ2KyY6s=", "BUUFl");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[5]] = lIIllIlIlIlIIlll("AzcBOi92AyR0eXh3SDk9OjABIC0uMB0mITgjRl4=", "VDhTH");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[6]] = lIIllIlIlIlIlIII("jIddvrdAXyoufFBo2TYSn1fcDOilmVfqOInIaDwP8TY=", "PsszQ");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[26]] = lIIllIlIlIlIIllI("UkvpCzeis5Ixr7AuZBHix2kPkcU5GJTBh09MCwFUqeRFIsBhxKYmbw==", "FDHiP");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[27]] = lIIllIlIlIlIIllI("L4PpBj1eVLsMJGqhP39JWeZuC/m4sgLZEKFN06/MRJlRh99IJv/LUg==", "HoCSk");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[28]] = lIIllIlIlIlIlIII("wbiLChdVGHtRMAmJP3+Q4cDvjzGZ2XQ52xc0Om/Q3mzmTjeSqaOlGECkT0E/5eXziXWxznfgW/SKIaDuO06+sw==", "WcaeQ");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[38]] = lIIllIlIlIlIlIII("Y45PTOH9BuHo+9pCLiZZRDPjkOe4lWhVr7nfApogalvRdzzLO/MBSRZ/Wagj2ewlkj1Fo9xlKR7GqNxG9SUcQiyF2HCOUfiXF4hOpNeW6fU=", "ubFoA");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[39]] = lIIllIlIlIlIIlll("BB0NJSwzJDQfKDQjPx84Hio7EC8iMXkTOWE2LAo6LjctHy5vTw==", "AEYzJ");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[40]] = lIIllIlIlIlIlIII("h7TP1WbjGT83/i8BxEPSOTw8UYvs2fMIcOI2EY/l5SBy2Yg1Q6UDzA==", "MKcYm");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[41]] = lIIllIlIlIlIlIII("zfEtp1ccwQRsOijsY7ncgg==", "EoTOg");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[42]] = lIIllIlIlIlIIlll("", "OgLrO");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[43]] = lIIllIlIlIlIlIII("gknq8DaYt/k=", "bQXod");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[44]] = lIIllIlIlIlIIlll("HA8fEQMdDgoFQE8=", "ozoal");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[45]] = lIIllIlIlIlIIllI("YoFOxYruNimYK84YodgPJDhrtU9JlKk4eJ8OmKRCMDU=", "zVECM");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[46]] = lIIllIlIlIlIIllI("WbHL82EatGM=", "jTIJg");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[47]] = lIIllIlIlIlIIlll("OQscaQ==", "WdhIk");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[48]] = lIIllIlIlIlIIllI("fRFitwJntjwri6ek/PmnLw==", "thGAs");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[49]] = lIIllIlIlIlIIllI("ZhZUwQQ9MUCTKHysEC15pw==", "XTXFs");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[50]] = lIIllIlIlIlIlIII("WiU8bnL/0do=", "AnkvU");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[51]] = lIIllIlIlIlIIllI("eGd5RtxCMQ4=", "GnzjR");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[52]] = lIIllIlIlIlIlIII("mHfT/1GSbmPT6c+i1X1tqg==", "QXsff");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[53]] = lIIllIlIlIlIIllI("DPSdOyOrsatMN+wPTKtz7YgQusSenBFt7+oI7tjIC7o=", "CCqoq");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[54]] = lIIllIlIlIlIIllI("lmzPIV/XXCE=", "egDmk");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[55]] = lIIllIlIlIlIlIII("oyTIsmvbhi4=", "HsbTT");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[56]] = lIIllIlIlIlIIllI("dcLI7ykocAujmXUpUXKzVw==", "prdOj");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[57]] = lIIllIlIlIlIIllI("lAoRU9+e9X/fP6bsmNA2szexfypNFUJicUKqkyud27s=", "Zjbyh");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[58]] = lIIllIlIlIlIlIII("BHUcK6HZ4K0=", "PUils");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[59]] = lIIllIlIlIlIIllI("E3yn13CsLew=", "VnbPc");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[60]] = lIIllIlIlIlIlIII("7dxhFbzwS114UUjwIkmGLg==", "LmsaA");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[61]] = lIIllIlIlIlIlIII("SmsjBNgZ9ug4fHH4Tt44cA==", "DHqhv");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[62]] = lIIllIlIlIlIIllI("/sBZCG9SHZ0=", "xTKTK");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[63]] = lIIllIlIlIlIIlll("NCoTdg==", "ZEgVs");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[64]] = lIIllIlIlIlIIlll("Ijk7ByAiLTYLbCEqOQ85MCp6", "COZnL");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[65]] = lIIllIlIlIlIIllI("lP5M3hPIYQePnbpscjDB/Q5EWblMGJv0JZqarUj0yUc=", "dMsVW");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[70]] = lIIllIlIlIlIIllI("PF0g7qFVV2qZOCZLz17GLshkmslDm0crCBM7OLdUOXLAo6FM8QgjIfRzrvGQKHmXhiUXXdL9wKJbd9rkoEGGoF5DfR/MUgWGaXYOV1GCCc8=", "VxgRX");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[71]] = lIIllIlIlIlIlIII("wCXhN4OJMngwwFdOuEw1Qw==", "cowkM");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[72]] = lIIllIlIlIlIIlll("", "zYYbn");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[73]] = lIIllIlIlIlIIlll("PjYQbg==", "PYdNh");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[74]] = lIIllIlIlIlIIllI("6MOiZsYOWRq6IIzUpvRRjw==", "KurUY");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[75]] = lIIllIlIlIlIIllI("bXCG1q1FClKLTNjIH5yHdwprkpsjElkK", "tcsQF");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[76]] = lIIllIlIlIlIIlll("", "GNvAF");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[77]] = lIIllIlIlIlIIlll("GSMHRg==", "wLsfZ");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[78]] = lIIllIlIlIlIlIII("t2QbMvUJYZAuOZcRcqpvKw==", "Jdwet");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[79]] = lIIllIlIlIlIIllI("5GVZeqHVGtSKPo6SxAP97Ac9A14zNRjh", "iANOY");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[80]] = lIIllIlIlIlIIllI("2ZA+5HZQEls=", "zzyBG");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[81]] = lIIllIlIlIlIIlll("JD4Wbg==", "JQbNR");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[82]] = lIIllIlIlIlIlIII("mbIBIxHYCKoDqvShXHiHPw==", "rYVfj");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[83]] = lIIllIlIlIlIIllI("St2sAqFidhBNOMNMsYQ+4+jZmXXXE5rf", "NbzQz");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[84]] = lIIllIlIlIlIIllI("qbthE7HGErM=", "iuayC");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[85]] = lIIllIlIlIlIlIII("BCFy3DoTECQ=", "kBmGL");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[86]] = lIIllIlIlIlIlIII("/PLKI84BxfTXDm1ZsWM9gw==", "UchjN");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[88]] = lIIllIlIlIlIIllI("5EwK/U3jTrY=", "FFkmb");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[89]] = lIIllIlIlIlIIllI("zfbnvUSKI6ezIeS3EfMVbQ==", "RRjsW");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[90]] = lIIllIlIlIlIIllI("B9H1FZZPwaM=", "nNNFJ");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[91]] = lIIllIlIlIlIlIII("OzAdixkcvcc=", "uJbDS");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[92]] = lIIllIlIlIlIIlll("KhoQIhwqDh0uUCkJEioFOAlR", "KlqKp");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[93]] = lIIllIlIlIlIIllI("Yg+h4OYj5vKMyXomrr9RYO3eTUDKSjJrLQjzN4gs9fb0N3Z9OjNRiA==", "TbbhF");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[96]] = lIIllIlIlIlIlIII("HChS6EK+R0Ii3+xRKuSC477QU24x+qM4pAcd7YEa05Y=", "lLyOM");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[97]] = lIIllIlIlIlIIllI("WCGnAElVznQ=", "ZgVIr");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[98]] = lIIllIlIlIlIlIII("vT6TaM4L+PM=", "vpbdX");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[99]] = lIIllIlIlIlIIlll("BT9q", "YLAVU");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[100]] = lIIllIlIlIlIlIII("WFdK8AiMjak=", "AlxDK");
        OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[102]] = lIIllIlIlIlIlIII("7ie4hiBAn3XpvQbPRP16eA==", "tXZkO");
    }
    
    public static String glGetShaderInfoLog(final int llllllllllllIllIIIIllIllllIIIIII, final int llllllllllllIllIIIIllIlllIllllIl) {
        String s;
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            s = ARBShaderObjects.glGetInfoLogARB(llllllllllllIllIIIIllIllllIIIIII, llllllllllllIllIIIIllIlllIllllIl);
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        else {
            s = GL20.glGetShaderInfoLog(llllllllllllIllIIIIllIllllIIIIII, llllllllllllIllIIIIllIlllIllllIl);
        }
        return s;
    }
    
    public static void glUniformMatrix4(final int llllllllllllIllIIIIllIllIlIllIIl, final boolean llllllllllllIllIIIIllIllIlIllIII, final FloatBuffer llllllllllllIllIIIIllIllIlIlIlll) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            ARBShaderObjects.glUniformMatrix4ARB(llllllllllllIllIIIIllIllIlIllIIl, llllllllllllIllIIIIllIllIlIllIII, llllllllllllIllIIIIllIllIlIlIlll);
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else {
            GL20.glUniformMatrix4(llllllllllllIllIIIIllIllIlIllIIl, llllllllllllIllIIIIllIllIlIllIII, llllllllllllIllIIIIllIllIlIlIlll);
        }
    }
    
    public static void setActiveTexture(final int llllllllllllIllIIIIllIllIIIIIIIl) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbMultitexture ? 1 : 0)) {
            ARBMultitexture.glActiveTextureARB(llllllllllllIllIIIIllIllIIIIIIIl);
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        else {
            GL13.glActiveTexture(llllllllllllIllIIIIllIllIIIIIIIl);
        }
    }
    
    public static void glUniform4(final int llllllllllllIllIIIIllIllIlllIIll, final FloatBuffer llllllllllllIllIIIIllIllIlllIIlI) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            ARBShaderObjects.glUniform4ARB(llllllllllllIllIIIIllIllIlllIIll, llllllllllllIllIIIIllIllIlllIIlI);
            "".length();
            if (((0x4F ^ 0x62) & ~(0x70 ^ 0x5D)) != 0x0) {
                return;
            }
        }
        else {
            GL20.glUniform4(llllllllllllIllIIIIllIllIlllIIll, llllllllllllIllIIIIllIllIlllIIlI);
        }
    }
    
    public static void glBindFramebuffer(final int llllllllllllIllIIIIllIllIIllllII, final int llllllllllllIllIIIIllIllIIlllIll) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.framebufferSupported ? 1 : 0)) {
            switch (OpenGlHelper.framebufferType) {
                case 0: {
                    GL30.glBindFramebuffer(llllllllllllIllIIIIllIllIIllllII, llllllllllllIllIIIIllIllIIlllIll);
                    "".length();
                    if (-"  ".length() > 0) {
                        return;
                    }
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glBindFramebuffer(llllllllllllIllIIIIllIllIIllllII, llllllllllllIllIIIIllIllIIlllIll);
                    "".length();
                    if ("  ".length() < -" ".length()) {
                        return;
                    }
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glBindFramebufferEXT(llllllllllllIllIIIIllIllIIllllII, llllllllllllIllIIIIllIllIIlllIll);
                    break;
                }
            }
        }
    }
    
    public static void glFramebufferRenderbuffer(final int llllllllllllIllIIIIllIllIIIlllII, final int llllllllllllIllIIIIllIllIIIlIlll, final int llllllllllllIllIIIIllIllIIIllIlI, final int llllllllllllIllIIIIllIllIIIlIlIl) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.framebufferSupported ? 1 : 0)) {
            switch (OpenGlHelper.framebufferType) {
                case 0: {
                    GL30.glFramebufferRenderbuffer(llllllllllllIllIIIIllIllIIIlllII, llllllllllllIllIIIIllIllIIIlIlll, llllllllllllIllIIIIllIllIIIllIlI, llllllllllllIllIIIIllIllIIIlIlIl);
                    "".length();
                    if ("  ".length() <= ((0xF9 ^ 0xB3 ^ (0xDB ^ 0x88)) & (32 + 123 - 30 + 30 ^ 21 + 84 - 88 + 113 ^ -" ".length()))) {
                        return;
                    }
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glFramebufferRenderbuffer(llllllllllllIllIIIIllIllIIIlllII, llllllllllllIllIIIIllIllIIIlIlll, llllllllllllIllIIIIllIllIIIllIlI, llllllllllllIllIIIIllIllIIIlIlIl);
                    "".length();
                    if (" ".length() >= (0x9C ^ 0x98)) {
                        return;
                    }
                    break;
                }
                case 2: {
                    EXTFramebufferObject.glFramebufferRenderbufferEXT(llllllllllllIllIIIIllIllIIIlllII, llllllllllllIllIIIIllIllIIIlIlll, llllllllllllIllIIIIllIllIIIllIlI, llllllllllllIllIIIIllIllIIIlIlIl);
                    break;
                }
            }
        }
    }
    
    public static void glUniform1i(final int llllllllllllIllIIIIllIlllIIlllll, final int llllllllllllIllIIIIllIlllIIllllI) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            ARBShaderObjects.glUniform1iARB(llllllllllllIllIIIIllIlllIIlllll, llllllllllllIllIIIIllIlllIIllllI);
            "".length();
            if ((0x1A ^ 0x20 ^ (0x85 ^ 0xBB)) == 0x0) {
                return;
            }
        }
        else {
            GL20.glUniform1i(llllllllllllIllIIIIllIlllIIlllll, llllllllllllIllIIIIllIlllIIllllI);
        }
    }
    
    public static String func_183029_j() {
        String field_183030_aa;
        if (lIIllIlIlIlIllIl(OpenGlHelper.field_183030_aa)) {
            field_183030_aa = OpenGlHelper.llIllllIlIIlII[OpenGlHelper.llIllllIlIIlIl[102]];
            "".length();
            if (((1 + 11 + 95 + 32 ^ 69 + 107 - 53 + 73) & (49 + 141 - 111 + 134 ^ 126 + 89 - 91 + 30 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            field_183030_aa = OpenGlHelper.field_183030_aa;
        }
        return field_183030_aa;
    }
    
    public static void glDeleteProgram(final int llllllllllllIllIIIIllIlllIllIIIl) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            ARBShaderObjects.glDeleteObjectARB(llllllllllllIllIIIIllIlllIllIIIl);
            "".length();
            if (" ".length() == (0x56 ^ 0x52)) {
                return;
            }
        }
        else {
            GL20.glDeleteProgram(llllllllllllIllIIIIllIlllIllIIIl);
        }
    }
    
    public static String getLogText() {
        return OpenGlHelper.logText;
    }
    
    public static void setLightmapTextureCoords(final int llllllllllllIllIIIIllIlIllllIllI, final float llllllllllllIllIIIIllIlIlllllIII, final float llllllllllllIllIIIIllIlIllllIlII) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbMultitexture ? 1 : 0)) {
            ARBMultitexture.glMultiTexCoord2fARB(llllllllllllIllIIIIllIlIllllIllI, llllllllllllIllIIIIllIlIlllllIII, llllllllllllIllIIIIllIlIllllIlII);
            "".length();
            if (((0x3D ^ 0x17 ^ (0x46 ^ 0x4A)) & (0xA ^ 0x1F ^ (0x53 ^ 0x60) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            GL13.glMultiTexCoord2f(llllllllllllIllIIIIllIlIllllIllI, llllllllllllIllIIIIllIlIlllllIII, llllllllllllIllIIIIllIlIllllIlII);
        }
    }
    
    private static String lIIllIlIlIlIIllI(final String llllllllllllIllIIIIllIlIllIllllI, final String llllllllllllIllIIIIllIlIllIlllIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIIllIlIlllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIllIlIllIlllIl.getBytes(StandardCharsets.UTF_8)), OpenGlHelper.llIllllIlIIlIl[39]), "DES");
            final Cipher llllllllllllIllIIIIllIlIlllIIIlI = Cipher.getInstance("DES");
            llllllllllllIllIIIIllIlIlllIIIlI.init(OpenGlHelper.llIllllIlIIlIl[5], llllllllllllIllIIIIllIlIlllIIIll);
            return new String(llllllllllllIllIIIIllIlIlllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIllIlIllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIllIlIlllIIIIl) {
            llllllllllllIllIIIIllIlIlllIIIIl.printStackTrace();
            return null;
        }
    }
    
    public static void glUniform4(final int llllllllllllIllIIIIllIllIllllIIl, final IntBuffer llllllllllllIllIIIIllIllIllllIII) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbShaders ? 1 : 0)) {
            ARBShaderObjects.glUniform4ARB(llllllllllllIllIIIIllIllIllllIIl, llllllllllllIllIIIIllIllIllllIII);
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else {
            GL20.glUniform4(llllllllllllIllIIIIllIllIllllIIl, llllllllllllIllIIIIllIllIllllIII);
        }
    }
    
    public static void setClientActiveTexture(final int llllllllllllIllIIIIllIlIllllllIl) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbMultitexture ? 1 : 0)) {
            ARBMultitexture.glClientActiveTextureARB(llllllllllllIllIIIIllIlIllllllIl);
            "".length();
            if (" ".length() < ((0xE5 ^ 0xAE) & ~(0x1A ^ 0x51))) {
                return;
            }
        }
        else {
            GL13.glClientActiveTexture(llllllllllllIllIIIIllIlIllllllIl);
        }
    }
    
    public static void glBindBuffer(final int llllllllllllIllIIIIllIllIlIIllII, final int llllllllllllIllIIIIllIllIlIIlIll) {
        if (lIIllIlIlIlIlIll(OpenGlHelper.arbVbo ? 1 : 0)) {
            ARBVertexBufferObject.glBindBufferARB(llllllllllllIllIIIIllIllIlIIllII, llllllllllllIllIIIIllIllIlIIlIll);
            "".length();
            if (((0x47 ^ 0x66) & ~(0xBC ^ 0x9D)) == (0x2A ^ 0x2E)) {
                return;
            }
        }
        else {
            GL15.glBindBuffer(llllllllllllIllIIIIllIllIlIIllII, llllllllllllIllIIIIllIllIlIIlIll);
        }
    }
}
