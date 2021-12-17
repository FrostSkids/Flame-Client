// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.shader;

import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import net.minecraft.client.util.JsonException;
import java.io.IOException;
import net.minecraft.client.renderer.OpenGlHelper;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.apache.logging.log4j.Logger;

public class ShaderLinkHelper
{
    private static final /* synthetic */ String[] lIIlllIIllIlll;
    private static final /* synthetic */ Logger logger;
    private static /* synthetic */ ShaderLinkHelper staticShaderLinkHelper;
    private static final /* synthetic */ int[] lIIlllIIlllIlI;
    
    private static void llIllIllIIlIlIl() {
        (lIIlllIIllIlll = new String[ShaderLinkHelper.lIIlllIIlllIlI[6]])[ShaderLinkHelper.lIIlllIIlllIlI[0]] = llIllIllIIlIIlI("DkbnGlJUvDiLFOJdrZONvlQKSGj2jGWXrA9uLmM75yWQF6UP/CxuPKSsd0PgXgkdP84QDjeO3ys=", "Psroe");
        ShaderLinkHelper.lIIlllIIllIlll[ShaderLinkHelper.lIIlllIIlllIlI[1]] = llIllIllIIlIIll("Xw==", "vCAev");
        ShaderLinkHelper.lIIlllIIllIlll[ShaderLinkHelper.lIIlllIIlllIlI[2]] = llIllIllIIlIIll("JgsWJQpDHAopFxYXEC8KBh1EPRAGF0QmEQ0SDSQfQwkWJR8RGAlqGwwXECsRDRAKLVg1KkQ=", "cydJx");
        ShaderLinkHelper.lIIlllIIllIlll[ShaderLinkHelper.lIIlllIIlllIlI[3]] = llIllIllIIlIIll("SREJI0IvI0c=", "ipgGb");
        ShaderLinkHelper.lIIlllIIllIlll[ShaderLinkHelper.lIIlllIIlllIlI[4]] = llIllIllIIlIlII("cw/NWayF/AFM/9UM2w5B4A==", "IGlCD");
    }
    
    private static boolean llIllIllIIlllIl(final int lllllllllllllIIlIlIIIIIlIlIIIIIl) {
        return lllllllllllllIIlIlIIIIIlIlIIIIIl <= 0;
    }
    
    private static String llIllIllIIlIlII(final String lllllllllllllIIlIlIIIIIlIlIllIIl, final String lllllllllllllIIlIlIIIIIlIlIllIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIIIIIlIlIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIIIIlIlIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIlIIIIIlIlIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIlIIIIIlIlIlllIl.init(ShaderLinkHelper.lIIlllIIlllIlI[2], lllllllllllllIIlIlIIIIIlIlIllllI);
            return new String(lllllllllllllIIlIlIIIIIlIlIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIIIIlIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIIIIIlIlIlllII) {
            lllllllllllllIIlIlIIIIIlIlIlllII.printStackTrace();
            return null;
        }
    }
    
    public void deleteShader(final ShaderManager lllllllllllllIIlIlIIIIIllIIIIllI) {
        lllllllllllllIIlIlIIIIIllIIIIllI.getFragmentShaderLoader().deleteShader(lllllllllllllIIlIlIIIIIllIIIIllI);
        lllllllllllllIIlIlIIIIIllIIIIllI.getVertexShaderLoader().deleteShader(lllllllllllllIIlIlIIIIIllIIIIllI);
        OpenGlHelper.glDeleteProgram(lllllllllllllIIlIlIIIIIllIIIIllI.getProgram());
    }
    
    public static ShaderLinkHelper getStaticShaderLinkHelper() {
        return ShaderLinkHelper.staticShaderLinkHelper;
    }
    
    public void linkProgram(final ShaderManager lllllllllllllIIlIlIIIIIlIlllllII) throws IOException {
        lllllllllllllIIlIlIIIIIlIlllllII.getFragmentShaderLoader().attachShader(lllllllllllllIIlIlIIIIIlIlllllII);
        lllllllllllllIIlIlIIIIIlIlllllII.getVertexShaderLoader().attachShader(lllllllllllllIIlIlIIIIIlIlllllII);
        OpenGlHelper.glLinkProgram(lllllllllllllIIlIlIIIIIlIlllllII.getProgram());
        final int lllllllllllllIIlIlIIIIIlIlllllIl = OpenGlHelper.glGetProgrami(lllllllllllllIIlIlIIIIIlIlllllII.getProgram(), OpenGlHelper.GL_LINK_STATUS);
        if (llIllIllIIllllI(lllllllllllllIIlIlIIIIIlIlllllIl)) {
            ShaderLinkHelper.logger.warn(String.valueOf(new StringBuilder(ShaderLinkHelper.lIIlllIIllIlll[ShaderLinkHelper.lIIlllIIlllIlI[2]]).append(lllllllllllllIIlIlIIIIIlIlllllII.getVertexShaderLoader().getShaderFilename()).append(ShaderLinkHelper.lIIlllIIllIlll[ShaderLinkHelper.lIIlllIIlllIlI[3]]).append(lllllllllllllIIlIlIIIIIlIlllllII.getFragmentShaderLoader().getShaderFilename()).append(ShaderLinkHelper.lIIlllIIllIlll[ShaderLinkHelper.lIIlllIIlllIlI[4]])));
            ShaderLinkHelper.logger.warn(OpenGlHelper.glGetProgramInfoLog(lllllllllllllIIlIlIIIIIlIlllllII.getProgram(), ShaderLinkHelper.lIIlllIIlllIlI[5]));
        }
    }
    
    public int createProgram() throws JsonException {
        final int lllllllllllllIIlIlIIIIIllIIIIIll = OpenGlHelper.glCreateProgram();
        if (llIllIllIIlllIl(lllllllllllllIIlIlIIIIIllIIIIIll)) {
            throw new JsonException(String.valueOf(new StringBuilder(ShaderLinkHelper.lIIlllIIllIlll[ShaderLinkHelper.lIIlllIIlllIlI[0]]).append(lllllllllllllIIlIlIIIIIllIIIIIll).append(ShaderLinkHelper.lIIlllIIllIlll[ShaderLinkHelper.lIIlllIIlllIlI[1]])));
        }
        return lllllllllllllIIlIlIIIIIllIIIIIll;
    }
    
    static {
        llIllIllIIlllII();
        llIllIllIIlIlIl();
        logger = LogManager.getLogger();
    }
    
    private static void llIllIllIIlllII() {
        (lIIlllIIlllIlI = new int[8])[0] = ((122 + 118 - 208 + 117 ^ 108 + 56 - 122 + 121) & (0x89 ^ 0x81 ^ (0x62 ^ 0x5C) ^ -" ".length()));
        ShaderLinkHelper.lIIlllIIlllIlI[1] = " ".length();
        ShaderLinkHelper.lIIlllIIlllIlI[2] = "  ".length();
        ShaderLinkHelper.lIIlllIIlllIlI[3] = "   ".length();
        ShaderLinkHelper.lIIlllIIlllIlI[4] = (0x8F ^ 0x86 ^ (0xBA ^ 0xB7));
        ShaderLinkHelper.lIIlllIIlllIlI[5] = (0xFFFF83AF & 0xFC50);
        ShaderLinkHelper.lIIlllIIlllIlI[6] = (0xA1 ^ 0xA4);
        ShaderLinkHelper.lIIlllIIlllIlI[7] = (57 + 33 + 47 + 65 ^ 91 + 191 - 206 + 118);
    }
    
    private static boolean llIllIllIIlllll(final int lllllllllllllIIlIlIIIIIlIlIIIllI, final int lllllllllllllIIlIlIIIIIlIlIIIlIl) {
        return lllllllllllllIIlIlIIIIIlIlIIIllI < lllllllllllllIIlIlIIIIIlIlIIIlIl;
    }
    
    private static String llIllIllIIlIIll(String lllllllllllllIIlIlIIIIIlIllIlIll, final String lllllllllllllIIlIlIIIIIlIllIllll) {
        lllllllllllllIIlIlIIIIIlIllIlIll = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIlIIIIIlIllIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIlIIIIIlIllIlllI = new StringBuilder();
        final char[] lllllllllllllIIlIlIIIIIlIllIllIl = lllllllllllllIIlIlIIIIIlIllIllll.toCharArray();
        int lllllllllllllIIlIlIIIIIlIllIllII = ShaderLinkHelper.lIIlllIIlllIlI[0];
        final byte lllllllllllllIIlIlIIIIIlIllIIllI = (Object)((String)lllllllllllllIIlIlIIIIIlIllIlIll).toCharArray();
        final float lllllllllllllIIlIlIIIIIlIllIIlIl = lllllllllllllIIlIlIIIIIlIllIIllI.length;
        double lllllllllllllIIlIlIIIIIlIllIIlII = ShaderLinkHelper.lIIlllIIlllIlI[0];
        while (llIllIllIIlllll((int)lllllllllllllIIlIlIIIIIlIllIIlII, (int)lllllllllllllIIlIlIIIIIlIllIIlIl)) {
            final char lllllllllllllIIlIlIIIIIlIlllIIIl = lllllllllllllIIlIlIIIIIlIllIIllI[lllllllllllllIIlIlIIIIIlIllIIlII];
            lllllllllllllIIlIlIIIIIlIllIlllI.append((char)(lllllllllllllIIlIlIIIIIlIlllIIIl ^ lllllllllllllIIlIlIIIIIlIllIllIl[lllllllllllllIIlIlIIIIIlIllIllII % lllllllllllllIIlIlIIIIIlIllIllIl.length]));
            "".length();
            ++lllllllllllllIIlIlIIIIIlIllIllII;
            ++lllllllllllllIIlIlIIIIIlIllIIlII;
            "".length();
            if (((0x40 ^ 0x6A) & ~(0x7 ^ 0x2D)) == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIlIIIIIlIllIlllI);
    }
    
    private static boolean llIllIllIIllllI(final int lllllllllllllIIlIlIIIIIlIlIIIIll) {
        return lllllllllllllIIlIlIIIIIlIlIIIIll == 0;
    }
    
    private static String llIllIllIIlIIlI(final String lllllllllllllIIlIlIIIIIlIlIIllII, final String lllllllllllllIIlIlIIIIIlIlIIllIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIIIIIlIlIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIIIIlIlIIllIl.getBytes(StandardCharsets.UTF_8)), ShaderLinkHelper.lIIlllIIlllIlI[7]), "DES");
            final Cipher lllllllllllllIIlIlIIIIIlIlIlIIII = Cipher.getInstance("DES");
            lllllllllllllIIlIlIIIIIlIlIlIIII.init(ShaderLinkHelper.lIIlllIIlllIlI[2], lllllllllllllIIlIlIIIIIlIlIlIIIl);
            return new String(lllllllllllllIIlIlIIIIIlIlIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIIIIlIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIIIIIlIlIIllll) {
            lllllllllllllIIlIlIIIIIlIlIIllll.printStackTrace();
            return null;
        }
    }
    
    public static void setNewStaticShaderLinkHelper() {
        ShaderLinkHelper.staticShaderLinkHelper = new ShaderLinkHelper();
    }
}
