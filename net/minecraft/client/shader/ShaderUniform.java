// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.shader;

import org.apache.logging.log4j.LogManager;
import org.lwjgl.util.vector.Matrix4f;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.lwjgl.BufferUtils;
import net.minecraft.client.renderer.OpenGlHelper;
import java.nio.FloatBuffer;
import org.apache.logging.log4j.Logger;
import java.nio.IntBuffer;

public class ShaderUniform
{
    private final /* synthetic */ int uniformType;
    private /* synthetic */ boolean dirty;
    private /* synthetic */ int uniformLocation;
    private final /* synthetic */ ShaderManager shaderManager;
    private final /* synthetic */ IntBuffer uniformIntBuffer;
    private static final /* synthetic */ Logger logger;
    private static final /* synthetic */ String[] lIlIlllllIIIII;
    private final /* synthetic */ int uniformCount;
    private final /* synthetic */ FloatBuffer uniformFloatBuffer;
    private static final /* synthetic */ int[] lIlIlllllIIlIl;
    private final /* synthetic */ String shaderName;
    
    private void uploadFloat() {
        switch (this.uniformType) {
            case 4: {
                OpenGlHelper.glUniform1(this.uniformLocation, this.uniformFloatBuffer);
                "".length();
                if (-" ".length() > 0) {
                    return;
                }
                break;
            }
            case 5: {
                OpenGlHelper.glUniform2(this.uniformLocation, this.uniformFloatBuffer);
                "".length();
                if (((0x81 ^ 0xB8 ^ (0xF4 ^ 0x8C)) & (0xA ^ 0x37 ^ (0xBC ^ 0xC0) ^ -" ".length()) & (((0xBC ^ 0xAF ^ (0xB ^ 0x3F)) & (0x16 ^ 0x1B ^ (0x8D ^ 0xA7) ^ -" ".length())) ^ -" ".length())) >= " ".length()) {
                    return;
                }
                break;
            }
            case 6: {
                OpenGlHelper.glUniform3(this.uniformLocation, this.uniformFloatBuffer);
                "".length();
                if (-" ".length() > (0xC0 ^ 0xC4)) {
                    return;
                }
                break;
            }
            case 7: {
                OpenGlHelper.glUniform4(this.uniformLocation, this.uniformFloatBuffer);
                "".length();
                if (((65 + 80 - 79 + 81 ^ 53 + 52 - 96 + 123) & (0xB ^ 0x7E ^ (0x2B ^ 0x49) ^ -" ".length())) != 0x0) {
                    return;
                }
                break;
            }
            default: {
                ShaderUniform.logger.warn(String.valueOf(new StringBuilder(ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[16]]).append(this.uniformCount).append(ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[17]]).append(ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[18]])));
                break;
            }
        }
    }
    
    public ShaderUniform(final String lllllllllllllIIIIlIIllllIlIllllI, final int lllllllllllllIIIIlIIllllIllIIIlI, final int lllllllllllllIIIIlIIllllIllIIIIl, final ShaderManager lllllllllllllIIIIlIIllllIlIllIll) {
        this.shaderName = lllllllllllllIIIIlIIllllIlIllllI;
        this.uniformCount = lllllllllllllIIIIlIIllllIllIIIIl;
        this.uniformType = lllllllllllllIIIIlIIllllIllIIIlI;
        this.shaderManager = lllllllllllllIIIIlIIllllIlIllIll;
        if (llllIlIlIIIIllI(lllllllllllllIIIIlIIllllIllIIIlI, ShaderUniform.lIlIlllllIIlIl[0])) {
            this.uniformIntBuffer = BufferUtils.createIntBuffer(lllllllllllllIIIIlIIllllIllIIIIl);
            this.uniformFloatBuffer = null;
            "".length();
            if (" ".length() != " ".length()) {
                throw null;
            }
        }
        else {
            this.uniformIntBuffer = null;
            this.uniformFloatBuffer = BufferUtils.createFloatBuffer(lllllllllllllIIIIlIIllllIllIIIIl);
        }
        this.uniformLocation = ShaderUniform.lIlIlllllIIlIl[1];
        this.markDirty();
    }
    
    public void set(final float[] lllllllllllllIIIIlIIlllIlllllIll) {
        if (llllIlIlIIIlIll(lllllllllllllIIIIlIIlllIlllllIll.length, this.uniformCount)) {
            ShaderUniform.logger.warn(String.valueOf(new StringBuilder(ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[10]]).append(this.uniformCount).append(ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[11]]).append(lllllllllllllIIIIlIIlllIlllllIll.length).append(ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[6]])));
            "".length();
            if (((79 + 80 - 12 + 3 ^ 103 + 133 - 77 + 18) & (0xBE ^ 0x95 ^ (0x26 ^ 0x2A) ^ -" ".length())) < ((97 + 7 - 48 + 111 ^ 27 + 115 - 87 + 128) & (0x9D ^ 0xC7 ^ (0x1F ^ 0x55) ^ -" ".length()))) {
                return;
            }
        }
        else {
            this.uniformFloatBuffer.position(ShaderUniform.lIlIlllllIIlIl[3]);
            "".length();
            this.uniformFloatBuffer.put(lllllllllllllIIIIlIIlllIlllllIll);
            "".length();
            this.uniformFloatBuffer.position(ShaderUniform.lIlIlllllIIlIl[3]);
            "".length();
            this.markDirty();
        }
    }
    
    public void set(final float lllllllllllllIIIIlIIllllIlIIIIll) {
        this.uniformFloatBuffer.position(ShaderUniform.lIlIlllllIIlIl[3]);
        "".length();
        this.uniformFloatBuffer.put(ShaderUniform.lIlIlllllIIlIl[3], lllllllllllllIIIIlIIllllIlIIIIll);
        "".length();
        this.markDirty();
    }
    
    private static String llllIlIIlllIlll(final String lllllllllllllIIIIlIIlllIlIIIIlll, final String lllllllllllllIIIIlIIlllIlIIIlIII) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIIlllIlIIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIIlllIlIIIlIII.getBytes(StandardCharsets.UTF_8)), ShaderUniform.lIlIlllllIIlIl[6]), "DES");
            final Cipher lllllllllllllIIIIlIIlllIlIIIlIll = Cipher.getInstance("DES");
            lllllllllllllIIIIlIIlllIlIIIlIll.init(ShaderUniform.lIlIlllllIIlIl[5], lllllllllllllIIIIlIIlllIlIIIllII);
            return new String(lllllllllllllIIIIlIIlllIlIIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIIlllIlIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIIlllIlIIIlIlI) {
            lllllllllllllIIIIlIIlllIlIIIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static String llllIlIIlllllII(final String lllllllllllllIIIIlIIlllIlIlIllII, final String lllllllllllllIIIIlIIlllIlIlIlIll) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIIlllIlIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIIlllIlIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIlIIlllIlIllIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIlIIlllIlIllIIII.init(ShaderUniform.lIlIlllllIIlIl[5], lllllllllllllIIIIlIIlllIlIllIIIl);
            return new String(lllllllllllllIIIIlIIlllIlIllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIIlllIlIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIIlllIlIlIllll) {
            lllllllllllllIIIIlIIlllIlIlIllll.printStackTrace();
            return null;
        }
    }
    
    private void markDirty() {
        this.dirty = (ShaderUniform.lIlIlllllIIlIl[2] != 0);
        if (llllIlIlIIIIlll(this.shaderManager)) {
            this.shaderManager.markDirty();
        }
    }
    
    private void uploadInt() {
        switch (this.uniformType) {
            case 0: {
                OpenGlHelper.glUniform1(this.uniformLocation, this.uniformIntBuffer);
                "".length();
                if (" ".length() >= "  ".length()) {
                    return;
                }
                break;
            }
            case 1: {
                OpenGlHelper.glUniform2(this.uniformLocation, this.uniformIntBuffer);
                "".length();
                if (((0x56 ^ 0x1D) & ~(0xCF ^ 0x84)) <= -" ".length()) {
                    return;
                }
                break;
            }
            case 2: {
                OpenGlHelper.glUniform3(this.uniformLocation, this.uniformIntBuffer);
                "".length();
                if (" ".length() >= (0xC0 ^ 0xC4)) {
                    return;
                }
                break;
            }
            case 3: {
                OpenGlHelper.glUniform4(this.uniformLocation, this.uniformIntBuffer);
                "".length();
                if ((0xA6 ^ 0xA2) == -" ".length()) {
                    return;
                }
                break;
            }
            default: {
                ShaderUniform.logger.warn(String.valueOf(new StringBuilder(ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[13]]).append(this.uniformCount).append(ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[14]]).append(ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[15]])));
                break;
            }
        }
    }
    
    private static boolean llllIlIlIIIIlll(final Object lllllllllllllIIIIlIIlllIIlllIIlI) {
        return lllllllllllllIIIIlIIlllIIlllIIlI != null;
    }
    
    public void set(final float lllllllllllllIIIIlIIlllIlllIlIII, final float lllllllllllllIIIIlIIlllIllIlIllI, final float lllllllllllllIIIIlIIlllIlllIIllI, final float lllllllllllllIIIIlIIlllIllIlIlII, final float lllllllllllllIIIIlIIlllIllIlIIll, final float lllllllllllllIIIIlIIlllIllIlIIlI, final float lllllllllllllIIIIlIIlllIllIlIIIl, final float lllllllllllllIIIIlIIlllIllIlIIII, final float lllllllllllllIIIIlIIlllIlllIIIII, final float lllllllllllllIIIIlIIlllIllIIlllI, final float lllllllllllllIIIIlIIlllIllIIllIl, final float lllllllllllllIIIIlIIlllIllIIllII, final float lllllllllllllIIIIlIIlllIllIIlIll, final float lllllllllllllIIIIlIIlllIllIIlIlI, final float lllllllllllllIIIIlIIlllIllIIlIIl, final float lllllllllllllIIIIlIIlllIllIIlIII) {
        this.uniformFloatBuffer.position(ShaderUniform.lIlIlllllIIlIl[3]);
        "".length();
        this.uniformFloatBuffer.put(ShaderUniform.lIlIlllllIIlIl[3], lllllllllllllIIIIlIIlllIlllIlIII);
        "".length();
        this.uniformFloatBuffer.put(ShaderUniform.lIlIlllllIIlIl[2], lllllllllllllIIIIlIIlllIllIlIllI);
        "".length();
        this.uniformFloatBuffer.put(ShaderUniform.lIlIlllllIIlIl[5], lllllllllllllIIIIlIIlllIlllIIllI);
        "".length();
        this.uniformFloatBuffer.put(ShaderUniform.lIlIlllllIIlIl[0], lllllllllllllIIIIlIIlllIllIlIlII);
        "".length();
        this.uniformFloatBuffer.put(ShaderUniform.lIlIlllllIIlIl[4], lllllllllllllIIIIlIIlllIllIlIIll);
        "".length();
        this.uniformFloatBuffer.put(ShaderUniform.lIlIlllllIIlIl[8], lllllllllllllIIIIlIIlllIllIlIIlI);
        "".length();
        this.uniformFloatBuffer.put(ShaderUniform.lIlIlllllIIlIl[10], lllllllllllllIIIIlIIlllIllIlIIIl);
        "".length();
        this.uniformFloatBuffer.put(ShaderUniform.lIlIlllllIIlIl[11], lllllllllllllIIIIlIIlllIllIlIIII);
        "".length();
        this.uniformFloatBuffer.put(ShaderUniform.lIlIlllllIIlIl[6], lllllllllllllIIIIlIIlllIlllIIIII);
        "".length();
        this.uniformFloatBuffer.put(ShaderUniform.lIlIlllllIIlIl[7], lllllllllllllIIIIlIIlllIllIIlllI);
        "".length();
        this.uniformFloatBuffer.put(ShaderUniform.lIlIlllllIIlIl[9], lllllllllllllIIIIlIIlllIllIIllIl);
        "".length();
        this.uniformFloatBuffer.put(ShaderUniform.lIlIlllllIIlIl[12], lllllllllllllIIIIlIIlllIllIIllII);
        "".length();
        this.uniformFloatBuffer.put(ShaderUniform.lIlIlllllIIlIl[13], lllllllllllllIIIIlIIlllIllIIlIll);
        "".length();
        this.uniformFloatBuffer.put(ShaderUniform.lIlIlllllIIlIl[14], lllllllllllllIIIIlIIlllIllIIlIlI);
        "".length();
        this.uniformFloatBuffer.put(ShaderUniform.lIlIlllllIIlIl[15], lllllllllllllIIIIlIIlllIllIIlIIl);
        "".length();
        this.uniformFloatBuffer.put(ShaderUniform.lIlIlllllIIlIl[16], lllllllllllllIIIIlIIlllIllIIlIII);
        "".length();
        this.markDirty();
    }
    
    public void set(final float lllllllllllllIIIIlIIllllIIllIIII, final float lllllllllllllIIIIlIIllllIIlIllll, final float lllllllllllllIIIIlIIllllIIlIlllI) {
        this.uniformFloatBuffer.position(ShaderUniform.lIlIlllllIIlIl[3]);
        "".length();
        this.uniformFloatBuffer.put(ShaderUniform.lIlIlllllIIlIl[3], lllllllllllllIIIIlIIllllIIllIIII);
        "".length();
        this.uniformFloatBuffer.put(ShaderUniform.lIlIlllllIIlIl[2], lllllllllllllIIIIlIIllllIIlIllll);
        "".length();
        this.uniformFloatBuffer.put(ShaderUniform.lIlIlllllIIlIl[5], lllllllllllllIIIIlIIllllIIlIlllI);
        "".length();
        this.markDirty();
    }
    
    public static int parseType(final String lllllllllllllIIIIlIIllllIlIlIIll) {
        int lllllllllllllIIIIlIIllllIlIlIlII = ShaderUniform.lIlIlllllIIlIl[1];
        if (llllIlIlIIIlIII(lllllllllllllIIIIlIIllllIlIlIIll.equals(ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[3]]) ? 1 : 0)) {
            lllllllllllllIIIIlIIllllIlIlIlII = ShaderUniform.lIlIlllllIIlIl[3];
            "".length();
            if ((0x6 ^ 0x2) <= 0) {
                return (0x2F ^ 0x19) & ~(0x77 ^ 0x41);
            }
        }
        else if (llllIlIlIIIlIII(lllllllllllllIIIIlIIllllIlIlIIll.equals(ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[2]]) ? 1 : 0)) {
            lllllllllllllIIIIlIIllllIlIlIlII = ShaderUniform.lIlIlllllIIlIl[4];
            "".length();
            if (" ".length() == 0) {
                return (0x6A ^ 0x58) & ~(0x14 ^ 0x26);
            }
        }
        else if (llllIlIlIIIlIII(lllllllllllllIIIIlIIllllIlIlIIll.startsWith(ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[5]]) ? 1 : 0)) {
            if (llllIlIlIIIlIII(lllllllllllllIIIIlIIllllIlIlIIll.endsWith(ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[0]]) ? 1 : 0)) {
                lllllllllllllIIIIlIIllllIlIlIlII = ShaderUniform.lIlIlllllIIlIl[6];
                "".length();
                if ("  ".length() < 0) {
                    return (0x9D ^ 0x85) & ~(0x18 ^ 0x0);
                }
            }
            else if (llllIlIlIIIlIII(lllllllllllllIIIIlIIllllIlIlIIll.endsWith(ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[4]]) ? 1 : 0)) {
                lllllllllllllIIIIlIIllllIlIlIlII = ShaderUniform.lIlIlllllIIlIl[7];
                "".length();
                if (((65 + 54 + 24 + 8 ^ 93 + 128 - 114 + 85) & (0x15 ^ 0x2E ^ (0xA ^ 0x66) ^ -" ".length())) != 0x0) {
                    return (150 + 143 - 236 + 191 ^ 124 + 62 - 50 + 31) & (0x74 ^ 0x33 ^ (0xBD ^ 0xA5) ^ -" ".length());
                }
            }
            else if (llllIlIlIIIlIII(lllllllllllllIIIIlIIllllIlIlIIll.endsWith(ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[8]]) ? 1 : 0)) {
                lllllllllllllIIIIlIIllllIlIlIlII = ShaderUniform.lIlIlllllIIlIl[9];
            }
        }
        return lllllllllllllIIIIlIIllllIlIlIlII;
    }
    
    private static boolean llllIlIlIIIlIlI(final int lllllllllllllIIIIlIIlllIIllIllII) {
        return lllllllllllllIIIIlIIlllIIllIllII >= 0;
    }
    
    public void setUniformLocation(final int lllllllllllllIIIIlIIllllIlIIllII) {
        this.uniformLocation = lllllllllllllIIIIlIIllllIlIIllII;
    }
    
    private static String llllIlIIllllIII(String lllllllllllllIIIIlIIlllIlIIllIIl, final String lllllllllllllIIIIlIIlllIlIIlllIl) {
        lllllllllllllIIIIlIIlllIlIIllIIl = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIlIIlllIlIIllIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlIIlllIlIIlllII = new StringBuilder();
        final char[] lllllllllllllIIIIlIIlllIlIIllIll = lllllllllllllIIIIlIIlllIlIIlllIl.toCharArray();
        int lllllllllllllIIIIlIIlllIlIIllIlI = ShaderUniform.lIlIlllllIIlIl[3];
        final byte lllllllllllllIIIIlIIlllIlIIlIlII = (Object)((String)lllllllllllllIIIIlIIlllIlIIllIIl).toCharArray();
        final byte lllllllllllllIIIIlIIlllIlIIlIIll = (byte)lllllllllllllIIIIlIIlllIlIIlIlII.length;
        byte lllllllllllllIIIIlIIlllIlIIlIIlI = (byte)ShaderUniform.lIlIlllllIIlIl[3];
        while (llllIlIlIIIlIll(lllllllllllllIIIIlIIlllIlIIlIIlI, lllllllllllllIIIIlIIlllIlIIlIIll)) {
            final char lllllllllllllIIIIlIIlllIlIIlllll = lllllllllllllIIIIlIIlllIlIIlIlII[lllllllllllllIIIIlIIlllIlIIlIIlI];
            lllllllllllllIIIIlIIlllIlIIlllII.append((char)(lllllllllllllIIIIlIIlllIlIIlllll ^ lllllllllllllIIIIlIIlllIlIIllIll[lllllllllllllIIIIlIIlllIlIIllIlI % lllllllllllllIIIIlIIlllIlIIllIll.length]));
            "".length();
            ++lllllllllllllIIIIlIIlllIlIIllIlI;
            ++lllllllllllllIIIIlIIlllIlIIlIIlI;
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlIIlllIlIIlllII);
    }
    
    private static boolean llllIlIlIIIlIIl(final int lllllllllllllIIIIlIIlllIlIIIIIIl, final int lllllllllllllIIIIlIIlllIlIIIIIII) {
        return lllllllllllllIIIIlIIlllIlIIIIIIl >= lllllllllllllIIIIlIIlllIlIIIIIII;
    }
    
    private static boolean llllIlIlIIIllII(final int lllllllllllllIIIIlIIlllIIllIlllI) {
        return lllllllllllllIIIIlIIlllIIllIlllI == 0;
    }
    
    public void set(final Matrix4f lllllllllllllIIIIlIIlllIllIIIIlI) {
        this.set(lllllllllllllIIIIlIIlllIllIIIIlI.m00, lllllllllllllIIIIlIIlllIllIIIIlI.m01, lllllllllllllIIIIlIIlllIllIIIIlI.m02, lllllllllllllIIIIlIIlllIllIIIIlI.m03, lllllllllllllIIIIlIIlllIllIIIIlI.m10, lllllllllllllIIIIlIIlllIllIIIIlI.m11, lllllllllllllIIIIlIIlllIllIIIIlI.m12, lllllllllllllIIIIlIIlllIllIIIIlI.m13, lllllllllllllIIIIlIIlllIllIIIIlI.m20, lllllllllllllIIIIlIIlllIllIIIIlI.m21, lllllllllllllIIIIlIIlllIllIIIIlI.m22, lllllllllllllIIIIlIIlllIllIIIIlI.m23, lllllllllllllIIIIlIIlllIllIIIIlI.m30, lllllllllllllIIIIlIIlllIllIIIIlI.m31, lllllllllllllIIIIlIIlllIllIIIIlI.m32, lllllllllllllIIIIlIIlllIllIIIIlI.m33);
    }
    
    private static void llllIlIlIIIIlIl() {
        (lIlIlllllIIlIl = new int[20])[0] = "   ".length();
        ShaderUniform.lIlIlllllIIlIl[1] = -" ".length();
        ShaderUniform.lIlIlllllIIlIl[2] = " ".length();
        ShaderUniform.lIlIlllllIIlIl[3] = ((0x85 ^ 0xB0 ^ (0x9 ^ 0x11)) & (0xD3 ^ 0x83 ^ (0x20 ^ 0x5D) ^ -" ".length()));
        ShaderUniform.lIlIlllllIIlIl[4] = (0xB ^ 0xF);
        ShaderUniform.lIlIlllllIIlIl[5] = "  ".length();
        ShaderUniform.lIlIlllllIIlIl[6] = (0xB6 ^ 0xBE);
        ShaderUniform.lIlIlllllIIlIl[7] = (0x1 ^ 0x66 ^ (0xE7 ^ 0x89));
        ShaderUniform.lIlIlllllIIlIl[8] = (0x79 ^ 0x7C);
        ShaderUniform.lIlIlllllIIlIl[9] = (0xEA ^ 0x8F ^ (0x9 ^ 0x66));
        ShaderUniform.lIlIlllllIIlIl[10] = (0x56 ^ 0x50);
        ShaderUniform.lIlIlllllIIlIl[11] = (44 + 83 - 58 + 58 ^ (0x56 ^ 0x2E));
        ShaderUniform.lIlIlllllIIlIl[12] = (14 + 71 - 30 + 105 ^ 111 + 4 - 22 + 78);
        ShaderUniform.lIlIlllllIIlIl[13] = (0xFC ^ 0xAE ^ (0x2 ^ 0x5C));
        ShaderUniform.lIlIlllllIIlIl[14] = (0x55 ^ 0x58);
        ShaderUniform.lIlIlllllIIlIl[15] = (131 + 109 - 188 + 135 ^ 147 + 52 - 56 + 38);
        ShaderUniform.lIlIlllllIIlIl[16] = (0x4F ^ 0x40);
        ShaderUniform.lIlIlllllIIlIl[17] = (0x50 ^ 0x40);
        ShaderUniform.lIlIlllllIIlIl[18] = (0xC2 ^ 0x86 ^ (0x2B ^ 0x7E));
        ShaderUniform.lIlIlllllIIlIl[19] = (80 + 198 - 110 + 46 ^ 142 + 9 - 110 + 155);
    }
    
    public void func_148092_b(final float lllllllllllllIIIIlIIllllIIIlIIll, final float lllllllllllllIIIIlIIllllIIIlIlll, final float lllllllllllllIIIIlIIllllIIIlIllI, final float lllllllllllllIIIIlIIllllIIIlIlIl) {
        this.uniformFloatBuffer.position(ShaderUniform.lIlIlllllIIlIl[3]);
        "".length();
        if (llllIlIlIIIlIIl(this.uniformType, ShaderUniform.lIlIlllllIIlIl[4])) {
            this.uniformFloatBuffer.put(ShaderUniform.lIlIlllllIIlIl[3], lllllllllllllIIIIlIIllllIIIlIIll);
            "".length();
        }
        if (llllIlIlIIIlIIl(this.uniformType, ShaderUniform.lIlIlllllIIlIl[8])) {
            this.uniformFloatBuffer.put(ShaderUniform.lIlIlllllIIlIl[2], lllllllllllllIIIIlIIllllIIIlIlll);
            "".length();
        }
        if (llllIlIlIIIlIIl(this.uniformType, ShaderUniform.lIlIlllllIIlIl[10])) {
            this.uniformFloatBuffer.put(ShaderUniform.lIlIlllllIIlIl[5], lllllllllllllIIIIlIIllllIIIlIllI);
            "".length();
        }
        if (llllIlIlIIIlIIl(this.uniformType, ShaderUniform.lIlIlllllIIlIl[11])) {
            this.uniformFloatBuffer.put(ShaderUniform.lIlIlllllIIlIl[0], lllllllllllllIIIIlIIllllIIIlIlIl);
            "".length();
        }
        this.markDirty();
    }
    
    private static void llllIlIlIIIIIlI() {
        (lIlIlllllIIIII = new String[ShaderUniform.lIlIlllllIIlIl[19]])[ShaderUniform.lIlIlllllIIlIl[3]] = llllIlIIlllIlll("PB/P27bTVNA=", "bCtNz");
        ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[2]] = llllIlIIllllIII("HiIsBTE=", "xNCdE");
        ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[5]] = llllIlIIlllIlll("7QjmVUkQrQQ=", "dusyG");
        ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[0]] = llllIlIIllllIII("XjxI", "lDzcD");
        ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[4]] = llllIlIIlllIlll("WYBJ46h3f6s=", "edJxk");
        ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[8]] = llllIlIIlllllII("iJNta3BRWwc=", "PKJTF");
        ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[10]] = llllIlIIlllllII("TWEy15oqPIkLrR+txCxn0vTUJG0JCuZgEn5JKJe2H3hoR/M5KFAOaK7Y1bNqqFQSxyoEDaEEDlwSH4TfOJfvlg==", "hDyZy");
        ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[11]] = llllIlIIlllllII("VxQlKHGGS6M=", "IyAiA");
        ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[6]] = llllIlIIlllllII("X4sMTIKBiOmyDPne9QUvdA==", "gCdxy");
        ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[7]] = llllIlIIllllIII("AAIHDSsnAUAeNDkDDw9kNg0CByExQE4JMSFMGhI0MEwYCiggCU5D", "UlnkD");
        ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[9]] = llllIlIIlllIlll("clNC2X9vYkjX0dC/yXOfUQ==", "nOUFr");
        ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[12]] = llllIlIIlllIlll("5Oeg9pDA2Xnhmfuq20ymYKDvSFsmGdc4", "DtDFW");
        ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[13]] = llllIlIIlllllII("rOQTQszZbZNVLs63Y+gMt4/H++RZLKeb1JjhDp1y/+2UFgJk9jjT9Y4SDLil7WfG", "ocskd");
        ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[14]] = llllIlIIlllIlll("Ci24eFAzo+w=", "jGdHW");
        ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[15]] = llllIlIIlllllII("nFZKUhnfS3YMuEZ9px2XgHTJXddEB/3MlQobvC+c5MyVYEk7qu9b6A==", "JrsPR");
        ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[16]] = llllIlIIllllIII("LDkFNgQLOkIlGxU4DTRLGjYAPA4de0wyHg13Dz8eFyNMJgoVIglwQw==", "yWlPk");
        ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[17]] = llllIlIIlllIlll("mClDUrEdcyg=", "IQGFx");
        ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[18]] = llllIlIIllllIII("PRgebRA9Vx4lHHMFCyMeNlcFK1liVx4iWWdZSgQePRgYJBc0WQ==", "SwjMy");
    }
    
    public void set(final float lllllllllllllIIIIlIIllllIIlIIIlI, final float lllllllllllllIIIIlIIllllIIlIIllI, final float lllllllllllllIIIIlIIllllIIlIIlIl, final float lllllllllllllIIIIlIIllllIIIlllll) {
        this.uniformFloatBuffer.position(ShaderUniform.lIlIlllllIIlIl[3]);
        "".length();
        this.uniformFloatBuffer.put(lllllllllllllIIIIlIIllllIIlIIIlI);
        "".length();
        this.uniformFloatBuffer.put(lllllllllllllIIIIlIIllllIIlIIllI);
        "".length();
        this.uniformFloatBuffer.put(lllllllllllllIIIIlIIllllIIlIIlIl);
        "".length();
        this.uniformFloatBuffer.put(lllllllllllllIIIIlIIllllIIIlllll);
        "".length();
        this.uniformFloatBuffer.flip();
        "".length();
        this.markDirty();
    }
    
    static {
        llllIlIlIIIIlIl();
        llllIlIlIIIIIlI();
        logger = LogManager.getLogger();
    }
    
    private static boolean llllIlIlIIIIllI(final int lllllllllllllIIIIlIIlllIIllllIIl, final int lllllllllllllIIIIlIIlllIIllllIII) {
        return lllllllllllllIIIIlIIlllIIllllIIl <= lllllllllllllIIIIlIIlllIIllllIII;
    }
    
    public void upload() {
        if (llllIlIlIIIllII(this.dirty ? 1 : 0)) {}
        this.dirty = (ShaderUniform.lIlIlllllIIlIl[3] != 0);
        if (llllIlIlIIIIllI(this.uniformType, ShaderUniform.lIlIlllllIIlIl[0])) {
            this.uploadInt();
            "".length();
            if ((0xA6 ^ 0xA2) != (0xA2 ^ 0xA6)) {
                return;
            }
        }
        else if (llllIlIlIIIIllI(this.uniformType, ShaderUniform.lIlIlllllIIlIl[11])) {
            this.uploadFloat();
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        else {
            if (llllIlIlIIIllIl(this.uniformType, ShaderUniform.lIlIlllllIIlIl[9])) {
                ShaderUniform.logger.warn(String.valueOf(new StringBuilder(ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[7]]).append(this.uniformType).append(ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[9]]).append(ShaderUniform.lIlIlllllIIIII[ShaderUniform.lIlIlllllIIlIl[12]])));
                return;
            }
            this.uploadFloatMatrix();
        }
    }
    
    private static boolean llllIlIlIIIlIll(final int lllllllllllllIIIIlIIlllIIlllllIl, final int lllllllllllllIIIIlIIlllIIlllllII) {
        return lllllllllllllIIIIlIIlllIIlllllIl < lllllllllllllIIIIlIIlllIIlllllII;
    }
    
    private static boolean llllIlIlIIIlIII(final int lllllllllllllIIIIlIIlllIIlllIIII) {
        return lllllllllllllIIIIlIIlllIIlllIIII != 0;
    }
    
    private void uploadFloatMatrix() {
        switch (this.uniformType) {
            case 8: {
                OpenGlHelper.glUniformMatrix2(this.uniformLocation, (boolean)(ShaderUniform.lIlIlllllIIlIl[2] != 0), this.uniformFloatBuffer);
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
                break;
            }
            case 9: {
                OpenGlHelper.glUniformMatrix3(this.uniformLocation, (boolean)(ShaderUniform.lIlIlllllIIlIl[2] != 0), this.uniformFloatBuffer);
                "".length();
                if (" ".length() <= 0) {
                    return;
                }
                break;
            }
            case 10: {
                OpenGlHelper.glUniformMatrix4(this.uniformLocation, (boolean)(ShaderUniform.lIlIlllllIIlIl[2] != 0), this.uniformFloatBuffer);
                break;
            }
        }
    }
    
    private static boolean llllIlIlIIIllIl(final int lllllllllllllIIIIlIIlllIIlllIlIl, final int lllllllllllllIIIIlIIlllIIlllIlII) {
        return lllllllllllllIIIIlIIlllIIlllIlIl > lllllllllllllIIIIlIIlllIIlllIlII;
    }
    
    public String getShaderName() {
        return this.shaderName;
    }
    
    public void set(final int lllllllllllllIIIIlIIllllIIIIlIIl, final int lllllllllllllIIIIlIIllllIIIIIIll, final int lllllllllllllIIIIlIIllllIIIIIIlI, final int lllllllllllllIIIIlIIllllIIIIIllI) {
        this.uniformIntBuffer.position(ShaderUniform.lIlIlllllIIlIl[3]);
        "".length();
        if (llllIlIlIIIlIlI(this.uniformType)) {
            this.uniformIntBuffer.put(ShaderUniform.lIlIlllllIIlIl[3], lllllllllllllIIIIlIIllllIIIIlIIl);
            "".length();
        }
        if (llllIlIlIIIlIIl(this.uniformType, ShaderUniform.lIlIlllllIIlIl[2])) {
            this.uniformIntBuffer.put(ShaderUniform.lIlIlllllIIlIl[2], lllllllllllllIIIIlIIllllIIIIIIll);
            "".length();
        }
        if (llllIlIlIIIlIIl(this.uniformType, ShaderUniform.lIlIlllllIIlIl[5])) {
            this.uniformIntBuffer.put(ShaderUniform.lIlIlllllIIlIl[5], lllllllllllllIIIIlIIllllIIIIIIlI);
            "".length();
        }
        if (llllIlIlIIIlIIl(this.uniformType, ShaderUniform.lIlIlllllIIlIl[0])) {
            this.uniformIntBuffer.put(ShaderUniform.lIlIlllllIIlIl[0], lllllllllllllIIIIlIIllllIIIIIllI);
            "".length();
        }
        this.markDirty();
    }
    
    public void set(final float lllllllllllllIIIIlIIllllIIlllllI, final float lllllllllllllIIIIlIIllllIIlllIlI) {
        this.uniformFloatBuffer.position(ShaderUniform.lIlIlllllIIlIl[3]);
        "".length();
        this.uniformFloatBuffer.put(ShaderUniform.lIlIlllllIIlIl[3], lllllllllllllIIIIlIIllllIIlllllI);
        "".length();
        this.uniformFloatBuffer.put(ShaderUniform.lIlIlllllIIlIl[2], lllllllllllllIIIIlIIllllIIlllIlI);
        "".length();
        this.markDirty();
    }
}
