// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.shader;

import com.google.common.collect.Maps;
import java.util.Map;
import java.io.IOException;
import java.nio.ByteBuffer;
import net.minecraft.client.util.JsonException;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.BufferUtils;
import java.io.BufferedInputStream;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.renderer.OpenGlHelper;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class ShaderLoader
{
    private static final /* synthetic */ String[] lllIlIlllIllll;
    private /* synthetic */ int shaderAttachCount;
    private static final /* synthetic */ int[] lllIlIllllIIII;
    private final /* synthetic */ String shaderFilename;
    private /* synthetic */ int shader;
    private final /* synthetic */ ShaderType shaderType;
    
    private static String lIlIIIlllIIlIIll(final String llllllllllllIlIllIlIIlIlIIlIlIlI, final String llllllllllllIlIllIlIIlIlIIlIIlll) {
        try {
            final SecretKeySpec llllllllllllIlIllIlIIlIlIIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlIIlIlIIlIIlll.getBytes(StandardCharsets.UTF_8)), ShaderLoader.lllIlIllllIIII[5]), "DES");
            final Cipher llllllllllllIlIllIlIIlIlIIlIllII = Cipher.getInstance("DES");
            llllllllllllIlIllIlIIlIlIIlIllII.init(ShaderLoader.lllIlIllllIIII[3], llllllllllllIlIllIlIIlIlIIlIllIl);
            return new String(llllllllllllIlIllIlIIlIlIIlIllII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlIIlIlIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIlIIlIlIIlIlIll) {
            llllllllllllIlIllIlIIlIlIIlIlIll.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIIIlllIIlIlIl() {
        (lllIlIllllIIII = new int[6])[0] = ((0x56 ^ 0x30 ^ (0x64 ^ 0x52)) & (0x44 ^ 0x3E ^ (0x1E ^ 0x34) ^ -" ".length()));
        ShaderLoader.lllIlIllllIIII[1] = " ".length();
        ShaderLoader.lllIlIllllIIII[2] = (-(0xFFFF8F83 & 0x77FF) & (0xFFFFBFA7 & 0xC7DA));
        ShaderLoader.lllIlIllllIIII[3] = "  ".length();
        ShaderLoader.lllIlIllllIIII[4] = "   ".length();
        ShaderLoader.lllIlIllllIIII[5] = (0x12 ^ 0x1A);
    }
    
    private static boolean lIlIIIlllIIllIII(final int llllllllllllIlIllIlIIlIlIIIlIlII) {
        return llllllllllllIlIllIlIIlIlIIIlIlII == 0;
    }
    
    private static boolean lIlIIIlllIIlIllI(final int llllllllllllIlIllIlIIlIlIIIlIIlI) {
        return llllllllllllIlIllIlIIlIlIIIlIIlI <= 0;
    }
    
    private static boolean lIlIIIlllIIlIlll(final Object llllllllllllIlIllIlIIlIlIIIlIllI) {
        return llllllllllllIlIllIlIIlIlIIIlIllI == null;
    }
    
    public void deleteShader(final ShaderManager llllllllllllIlIllIlIIlIlIllIIIII) {
        this.shaderAttachCount -= ShaderLoader.lllIlIllllIIII[1];
        if (lIlIIIlllIIlIllI(this.shaderAttachCount)) {
            OpenGlHelper.glDeleteShader(this.shader);
            this.shaderType.getLoadedShaders().remove(this.shaderFilename);
            "".length();
        }
    }
    
    static {
        lIlIIIlllIIlIlIl();
        lIlIIIlllIIlIlII();
    }
    
    private static String lIlIIIlllIIlIIII(final String llllllllllllIlIllIlIIlIlIIIlllIl, final String llllllllllllIlIllIlIIlIlIIIllIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllIlIIlIlIIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlIIlIlIIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIlIIlIlIIIlllll = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIlIIlIlIIIlllll.init(ShaderLoader.lllIlIllllIIII[3], llllllllllllIlIllIlIIlIlIIlIIIII);
            return new String(llllllllllllIlIllIlIIlIlIIIlllll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlIIlIlIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIlIIlIlIIIllllI) {
            llllllllllllIlIllIlIIlIlIIIllllI.printStackTrace();
            return null;
        }
    }
    
    public static ShaderLoader loadShader(final IResourceManager llllllllllllIlIllIlIIlIlIlIIIlIl, final ShaderType llllllllllllIlIllIlIIlIlIlIIllll, final String llllllllllllIlIllIlIIlIlIlIIlllI) throws IOException {
        ShaderLoader llllllllllllIlIllIlIIlIlIlIIllIl = llllllllllllIlIllIlIIlIlIlIIllll.getLoadedShaders().get(llllllllllllIlIllIlIIlIlIlIIlllI);
        if (lIlIIIlllIIlIlll(llllllllllllIlIllIlIIlIlIlIIllIl)) {
            final ResourceLocation llllllllllllIlIllIlIIlIlIlIIllII = new ResourceLocation(String.valueOf(new StringBuilder(ShaderLoader.lllIlIlllIllll[ShaderLoader.lllIlIllllIIII[0]]).append(llllllllllllIlIllIlIIlIlIlIIlllI).append(llllllllllllIlIllIlIIlIlIlIIllll.getShaderExtension())));
            final BufferedInputStream llllllllllllIlIllIlIIlIlIlIIlIll = new BufferedInputStream(llllllllllllIlIllIlIIlIlIlIIIlIl.getResource(llllllllllllIlIllIlIIlIlIlIIllII).getInputStream());
            final byte[] llllllllllllIlIllIlIIlIlIlIIlIlI = toByteArray(llllllllllllIlIllIlIIlIlIlIIlIll);
            final ByteBuffer llllllllllllIlIllIlIIlIlIlIIlIIl = BufferUtils.createByteBuffer(llllllllllllIlIllIlIIlIlIlIIlIlI.length);
            llllllllllllIlIllIlIIlIlIlIIlIIl.put(llllllllllllIlIllIlIIlIlIlIIlIlI);
            "".length();
            llllllllllllIlIllIlIIlIlIlIIlIIl.position(ShaderLoader.lllIlIllllIIII[0]);
            "".length();
            final int llllllllllllIlIllIlIIlIlIlIIlIII = OpenGlHelper.glCreateShader(llllllllllllIlIllIlIIlIlIlIIllll.getShaderMode());
            OpenGlHelper.glShaderSource(llllllllllllIlIllIlIIlIlIlIIlIII, llllllllllllIlIllIlIIlIlIlIIlIIl);
            OpenGlHelper.glCompileShader(llllllllllllIlIllIlIIlIlIlIIlIII);
            if (lIlIIIlllIIllIII(OpenGlHelper.glGetShaderi(llllllllllllIlIllIlIIlIlIlIIlIII, OpenGlHelper.GL_COMPILE_STATUS))) {
                final String llllllllllllIlIllIlIIlIlIlIIIlll = StringUtils.trim(OpenGlHelper.glGetShaderInfoLog(llllllllllllIlIllIlIIlIlIlIIlIII, ShaderLoader.lllIlIllllIIII[2]));
                final JsonException llllllllllllIlIllIlIIlIlIlIIIllI = new JsonException(String.valueOf(new StringBuilder(ShaderLoader.lllIlIlllIllll[ShaderLoader.lllIlIllllIIII[1]]).append(llllllllllllIlIllIlIIlIlIlIIllll.getShaderName()).append(ShaderLoader.lllIlIlllIllll[ShaderLoader.lllIlIllllIIII[3]]).append(llllllllllllIlIllIlIIlIlIlIIIlll)));
                llllllllllllIlIllIlIIlIlIlIIIllI.func_151381_b(llllllllllllIlIllIlIIlIlIlIIllII.getResourcePath());
                throw llllllllllllIlIllIlIIlIlIlIIIllI;
            }
            llllllllllllIlIllIlIIlIlIlIIllIl = new ShaderLoader(llllllllllllIlIllIlIIlIlIlIIllll, llllllllllllIlIllIlIIlIlIlIIlIII, llllllllllllIlIllIlIIlIlIlIIlllI);
            llllllllllllIlIllIlIIlIlIlIIllll.getLoadedShaders().put(llllllllllllIlIllIlIIlIlIlIIlllI, llllllllllllIlIllIlIIlIlIlIIllIl);
            "".length();
        }
        return llllllllllllIlIllIlIIlIlIlIIllIl;
    }
    
    public String getShaderFilename() {
        return this.shaderFilename;
    }
    
    private ShaderLoader(final ShaderType llllllllllllIlIllIlIIlIlIllIllll, final int llllllllllllIlIllIlIIlIlIllIlllI, final String llllllllllllIlIllIlIIlIlIllIlIIl) {
        this.shaderAttachCount = ShaderLoader.lllIlIllllIIII[0];
        this.shaderType = llllllllllllIlIllIlIIlIlIllIllll;
        this.shader = llllllllllllIlIllIlIIlIlIllIlllI;
        this.shaderFilename = llllllllllllIlIllIlIIlIlIllIlIIl;
    }
    
    protected static byte[] toByteArray(final BufferedInputStream llllllllllllIlIllIlIIlIlIIllIlll) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    org/apache/commons/io/IOUtils.toByteArray:(Ljava/io/InputStream;)[B
        //     4: astore_1        /* llllllllllllIlIllIlIIlIlIIllIllI */
        //     5: ldc             ""
        //     7: invokevirtual   java/lang/String.length:()I
        //    10: pop            
        //    11: aconst_null    
        //    12: ifnull          24
        //    15: aconst_null    
        //    16: areturn        
        //    17: astore_2        /* llllllllllllIlIllIlIIlIlIIllIIlI */
        //    18: aload_0         /* llllllllllllIlIllIlIIlIlIIllIlII */
        //    19: invokevirtual   java/io/BufferedInputStream.close:()V
        //    22: aload_2         /* llllllllllllIlIllIlIIlIlIIllIIlI */
        //    23: athrow         
        //    24: aload_0         /* llllllllllllIlIllIlIIlIlIIllIlII */
        //    25: invokevirtual   java/io/BufferedInputStream.close:()V
        //    28: aload_1         /* llllllllllllIlIllIlIIlIlIIllIlIl */
        //    29: areturn        
        //    Exceptions:
        //  throws java.io.IOException
        //    StackMapTable: 00 02 51 07 01 69 FC 00 06 07 01 4C
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      17     17     24     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void attachShader(final ShaderManager llllllllllllIlIllIlIIlIlIllIIIll) {
        this.shaderAttachCount += ShaderLoader.lllIlIllllIIII[1];
        OpenGlHelper.glAttachShader(llllllllllllIlIllIlIIlIlIllIIIll.getProgram(), this.shader);
    }
    
    private static void lIlIIIlllIIlIlII() {
        (lllIlIlllIllll = new String[ShaderLoader.lllIlIllllIIII[4]])[ShaderLoader.lllIlIllllIIII[0]] = lIlIIIlllIIlIIII("dQg0qtinq084xAyFcA8v2DqfUQynVtQq", "GgVzA");
        ShaderLoader.lllIlIlllIllll[ShaderLoader.lllIlIllllIIII[1]] = lIlIIIlllIIlIIII("f4LmlrgybDIc86yPdDlSMfEXY1M4HeL+", "yFapj");
        ShaderLoader.lllIlIlllIllll[ShaderLoader.lllIlIllllIIII[3]] = lIlIIIlllIIlIIll("wRxIpY9xL9gJ7ayUklohEg==", "oqCHN");
    }
    
    public enum ShaderType
    {
        private final /* synthetic */ String shaderExtension;
        private final /* synthetic */ Map<String, ShaderLoader> loadedShaders;
        
        FRAGMENT(ShaderType.lIlIlllIIlllII[ShaderType.lIlIlllIIlllIl[3]], ShaderType.lIlIlllIIlllIl[1], ShaderType.lIlIlllIIlllII[ShaderType.lIlIlllIIlllIl[4]], ShaderType.lIlIlllIIlllII[ShaderType.lIlIlllIIlllIl[5]], OpenGlHelper.GL_FRAGMENT_SHADER), 
        VERTEX(ShaderType.lIlIlllIIlllII[ShaderType.lIlIlllIIlllIl[0]], ShaderType.lIlIlllIIlllIl[0], ShaderType.lIlIlllIIlllII[ShaderType.lIlIlllIIlllIl[1]], ShaderType.lIlIlllIIlllII[ShaderType.lIlIlllIIlllIl[2]], OpenGlHelper.GL_VERTEX_SHADER);
        
        private static final /* synthetic */ int[] lIlIlllIIlllIl;
        private static final /* synthetic */ String[] lIlIlllIIlllII;
        private final /* synthetic */ int shaderMode;
        private final /* synthetic */ String shaderName;
        
        protected Map<String, ShaderLoader> getLoadedShaders() {
            return this.loadedShaders;
        }
        
        private static String llllIIlllIIIIII(final String lllllllllllllIIIIlIllIlIlIlIIIII, final String lllllllllllllIIIIlIllIlIlIlIIIIl) {
            try {
                final SecretKeySpec lllllllllllllIIIIlIllIlIlIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIllIlIlIlIIIIl.getBytes(StandardCharsets.UTF_8)), ShaderType.lIlIlllIIlllIl[7]), "DES");
                final Cipher lllllllllllllIIIIlIllIlIlIlIIlII = Cipher.getInstance("DES");
                lllllllllllllIIIIlIllIlIlIlIIlII.init(ShaderType.lIlIlllIIlllIl[2], lllllllllllllIIIIlIllIlIlIlIIlIl);
                return new String(lllllllllllllIIIIlIllIlIlIlIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIllIlIlIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIIlIllIlIlIlIIIll) {
                lllllllllllllIIIIlIllIlIlIlIIIll.printStackTrace();
                return null;
            }
        }
        
        private static String llllIIlllIIIIIl(String lllllllllllllIIIIlIllIlIlIllIIlI, final String lllllllllllllIIIIlIllIlIlIllIllI) {
            lllllllllllllIIIIlIllIlIlIllIIlI = new String(Base64.getDecoder().decode(lllllllllllllIIIIlIllIlIlIllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIIIlIllIlIlIllIlIl = new StringBuilder();
            final char[] lllllllllllllIIIIlIllIlIlIllIlII = lllllllllllllIIIIlIllIlIlIllIllI.toCharArray();
            int lllllllllllllIIIIlIllIlIlIllIIll = ShaderType.lIlIlllIIlllIl[0];
            final short lllllllllllllIIIIlIllIlIlIlIllIl = (Object)lllllllllllllIIIIlIllIlIlIllIIlI.toCharArray();
            final boolean lllllllllllllIIIIlIllIlIlIlIllII = lllllllllllllIIIIlIllIlIlIlIllIl.length != 0;
            String lllllllllllllIIIIlIllIlIlIlIlIll = (String)ShaderType.lIlIlllIIlllIl[0];
            while (llllIIlllIIIlIl((int)lllllllllllllIIIIlIllIlIlIlIlIll, lllllllllllllIIIIlIllIlIlIlIllII ? 1 : 0)) {
                final char lllllllllllllIIIIlIllIlIlIlllIII = lllllllllllllIIIIlIllIlIlIlIllIl[lllllllllllllIIIIlIllIlIlIlIlIll];
                lllllllllllllIIIIlIllIlIlIllIlIl.append((char)(lllllllllllllIIIIlIllIlIlIlllIII ^ lllllllllllllIIIIlIllIlIlIllIlII[lllllllllllllIIIIlIllIlIlIllIIll % lllllllllllllIIIIlIllIlIlIllIlII.length]));
                "".length();
                ++lllllllllllllIIIIlIllIlIlIllIIll;
                ++lllllllllllllIIIIlIllIlIlIlIlIll;
                "".length();
                if (-" ".length() != -" ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIIIlIllIlIlIllIlIl);
        }
        
        protected String getShaderExtension() {
            return this.shaderExtension;
        }
        
        private static void llllIIlllIIIlII() {
            (lIlIlllIIlllIl = new int[8])[0] = (" ".length() & (" ".length() ^ -" ".length()));
            ShaderType.lIlIlllIIlllIl[1] = " ".length();
            ShaderType.lIlIlllIIlllIl[2] = "  ".length();
            ShaderType.lIlIlllIIlllIl[3] = "   ".length();
            ShaderType.lIlIlllIIlllIl[4] = (0x2 ^ 0x11 ^ (0x3 ^ 0x14));
            ShaderType.lIlIlllIIlllIl[5] = (0xB5 ^ 0xB0);
            ShaderType.lIlIlllIIlllIl[6] = (0x50 ^ 0x56);
            ShaderType.lIlIlllIIlllIl[7] = (96 + 99 - 180 + 113 ^ 60 + 59 + 10 + 7);
        }
        
        static {
            llllIIlllIIIlII();
            llllIIlllIIIIlI();
            final ShaderType[] enum$VALUES = new ShaderType[ShaderType.lIlIlllIIlllIl[2]];
            enum$VALUES[ShaderType.lIlIlllIIlllIl[0]] = ShaderType.VERTEX;
            enum$VALUES[ShaderType.lIlIlllIIlllIl[1]] = ShaderType.FRAGMENT;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static void llllIIlllIIIIlI() {
            (lIlIlllIIlllII = new String[ShaderType.lIlIlllIIlllIl[6]])[ShaderType.lIlIlllIIlllIl[0]] = llllIIllIllllll("f+2n1Wb6ebY=", "BCORk");
            ShaderType.lIlIlllIIlllII[ShaderType.lIlIlllIIlllIl[1]] = llllIIlllIIIIII("LO02XnAXtng=", "gWOSB");
            ShaderType.lIlIlllIIlllII[ShaderType.lIlIlllIIlllIl[2]] = llllIIllIllllll("YKlQUkWAHH8=", "QSEFt");
            ShaderType.lIlIlllIIlllII[ShaderType.lIlIlllIIlllIl[3]] = llllIIllIllllll("j1cCp7xZlvcrdTZuBHouCA==", "MGPfX");
            ShaderType.lIlIlllIIlllII[ShaderType.lIlIlllIIlllIl[4]] = llllIIlllIIIIIl("DzMVEzsMLwA=", "iAttV");
            ShaderType.lIlIlllIIlllII[ShaderType.lIlIlllIIlllIl[5]] = llllIIlllIIIIIl("eCohJA==", "VLRLr");
        }
        
        protected int getShaderMode() {
            return this.shaderMode;
        }
        
        private static String llllIIllIllllll(final String lllllllllllllIIIIlIllIlIlIIlIIll, final String lllllllllllllIIIIlIllIlIlIIlIIlI) {
            try {
                final SecretKeySpec lllllllllllllIIIIlIllIlIlIIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIllIlIlIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIIIlIllIlIlIIlIlll = Cipher.getInstance("Blowfish");
                lllllllllllllIIIIlIllIlIlIIlIlll.init(ShaderType.lIlIlllIIlllIl[2], lllllllllllllIIIIlIllIlIlIIllIII);
                return new String(lllllllllllllIIIIlIllIlIlIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIllIlIlIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIIlIllIlIlIIlIllI) {
                lllllllllllllIIIIlIllIlIlIIlIllI.printStackTrace();
                return null;
            }
        }
        
        private static boolean llllIIlllIIIlIl(final int lllllllllllllIIIIlIllIlIlIIIllIl, final int lllllllllllllIIIIlIllIlIlIIIllII) {
            return lllllllllllllIIIIlIllIlIlIIIllIl < lllllllllllllIIIIlIllIlIlIIIllII;
        }
        
        private ShaderType(final String lllllllllllllIIIIlIllIlIllIllIlI, final int lllllllllllllIIIIlIllIlIllIllIIl, final String lllllllllllllIIIIlIllIlIllIllIII, final String lllllllllllllIIIIlIllIlIllIlllIl, final int lllllllllllllIIIIlIllIlIllIlllII) {
            this.loadedShaders = (Map<String, ShaderLoader>)Maps.newHashMap();
            this.shaderName = lllllllllllllIIIIlIllIlIllIllIII;
            this.shaderExtension = lllllllllllllIIIIlIllIlIllIlllIl;
            this.shaderMode = lllllllllllllIIIIlIllIlIllIlllII;
        }
        
        public String getShaderName() {
            return this.shaderName;
        }
    }
}
