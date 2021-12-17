// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.text.SimpleDateFormat;
import org.apache.logging.log4j.LogManager;
import java.util.Arrays;
import net.minecraft.event.ClickEvent;
import java.awt.image.RenderedImage;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;
import org.lwjgl.BufferUtils;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.shader.Framebuffer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Date;
import java.io.File;
import java.nio.IntBuffer;
import java.text.DateFormat;
import org.apache.logging.log4j.Logger;

public class ScreenShotHelper
{
    private static final /* synthetic */ Logger logger;
    private static final /* synthetic */ DateFormat dateFormat;
    private static final /* synthetic */ int[] lIIlIlIlIlllII;
    private static /* synthetic */ IntBuffer pixelBuffer;
    private static /* synthetic */ int[] pixelValues;
    private static final /* synthetic */ String[] lIIlIlIlIlIlIl;
    
    private static boolean llIlIIIIllIlIlI(final int lllllllllllllIIllIIlllIllllIIlll, final int lllllllllllllIIllIIlllIllllIIllI) {
        return lllllllllllllIIllIIlllIllllIIlll < lllllllllllllIIllIIlllIllllIIllI;
    }
    
    private static File getTimestampedPNGFileForDirectory(final File lllllllllllllIIllIIllllIIIlIIlll) {
        final String lllllllllllllIIllIIllllIIIlIlIlI = ScreenShotHelper.dateFormat.format(new Date()).toString();
        int lllllllllllllIIllIIllllIIIlIlIIl = ScreenShotHelper.lIIlIlIlIlllII[1];
        do {
            final StringBuilder sb = new StringBuilder(String.valueOf(lllllllllllllIIllIIllllIIIlIlIlI));
            String value;
            if (llIlIIIIllIllIl(lllllllllllllIIllIIllllIIIlIlIIl, ScreenShotHelper.lIIlIlIlIlllII[1])) {
                value = ScreenShotHelper.lIIlIlIlIlIlIl[ScreenShotHelper.lIIlIlIlIlllII[11]];
                "".length();
                if ((0x12 ^ 0x64 ^ (0x75 ^ 0x6)) == 0x0) {
                    return null;
                }
            }
            else {
                value = String.valueOf(new StringBuilder(ScreenShotHelper.lIIlIlIlIlIlIl[ScreenShotHelper.lIIlIlIlIlllII[12]]).append(lllllllllllllIIllIIllllIIIlIlIIl));
            }
            final File lllllllllllllIIllIIllllIIIlIlIII = new File(lllllllllllllIIllIIllllIIIlIIlll, String.valueOf(sb.append(value).append(ScreenShotHelper.lIIlIlIlIlIlIl[ScreenShotHelper.lIIlIlIlIlllII[13]])));
            if (llIlIIIIllIlllI(lllllllllllllIIllIIllllIIIlIlIII.exists() ? 1 : 0)) {
                return lllllllllllllIIllIIllllIIIlIlIII;
            }
            ++lllllllllllllIIllIIllllIIIlIlIIl;
            "".length();
        } while (null == null);
        return null;
    }
    
    private static String llIlIIIIlIlIlIl(final String lllllllllllllIIllIIlllIlllllIlll, final String lllllllllllllIIllIIlllIlllllIlII) {
        try {
            final SecretKeySpec lllllllllllllIIllIIlllIllllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIlllIlllllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIIlllIllllllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIIlllIllllllIIl.init(ScreenShotHelper.lIIlIlIlIlllII[7], lllllllllllllIIllIIlllIllllllIlI);
            return new String(lllllllllllllIIllIIlllIllllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIlllIlllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIlllIllllllIII) {
            lllllllllllllIIllIIlllIllllllIII.printStackTrace();
            return null;
        }
    }
    
    private static void llIlIIIIlIllIll() {
        (lIIlIlIlIlIlIl = new String[ScreenShotHelper.lIIlIlIlIlllII[14]])[ScreenShotHelper.lIIlIlIlIlllII[0]] = llIlIIIIlIlIlIl("JslWUTnvmhZXZR9ZWmIaRq1tYDqmYhx9", "HGPkF");
        ScreenShotHelper.lIIlIlIlIlIlIl[ScreenShotHelper.lIIlIlIlIlllII[1]] = llIlIIIIlIllIIl("6GgYEUHrXTEBhwl2r+d5jA==", "aNpOe");
        ScreenShotHelper.lIIlIlIlIlIlIl[ScreenShotHelper.lIIlIlIlIlllII[7]] = llIlIIIIlIlIlIl("V54F80p34Cc=", "vgrPR");
        ScreenShotHelper.lIIlIlIlIlIlIl[ScreenShotHelper.lIIlIlIlIlllII[8]] = llIlIIIIlIlIlIl("/ChaEfoiGbcqpkAAhkWUWssnSb8hc5wI", "bCYlN");
        ScreenShotHelper.lIIlIlIlIlIlIl[ScreenShotHelper.lIIlIlIlIlllII[9]] = llIlIIIIlIllIIl("CYEMPhmT+HOW62tgiaY/83iqplq8ijHHoCBlC7iv0nM=", "smwpM");
        ScreenShotHelper.lIIlIlIlIlIlIl[ScreenShotHelper.lIIlIlIlIlllII[10]] = llIlIIIIlIllIIl("98P+Q0xwJDMkuJl3saRDCqA7pBHKgoq7", "WqLIq");
        ScreenShotHelper.lIIlIlIlIlIlIl[ScreenShotHelper.lIIlIlIlIlllII[11]] = llIlIIIIlIllIIl("yHnZ3W8gNfk=", "ocdNT");
        ScreenShotHelper.lIIlIlIlIlIlIl[ScreenShotHelper.lIIlIlIlIlllII[12]] = llIlIIIIlIllIlI("OQ==", "fPQqP");
        ScreenShotHelper.lIIlIlIlIlIlIl[ScreenShotHelper.lIIlIlIlIlllII[13]] = llIlIIIIlIllIIl("BD0YI1E7kIA=", "wUeiA");
    }
    
    private static boolean llIlIIIIllIlllI(final int lllllllllllllIIllIIlllIlllIllllI) {
        return lllllllllllllIIllIIlllIlllIllllI == 0;
    }
    
    public static IChatComponent saveScreenshot(final File lllllllllllllIIllIIllllIIlIllIII, final int lllllllllllllIIllIIllllIIlIllIll, final int lllllllllllllIIllIIllllIIlIlIllI, final Framebuffer lllllllllllllIIllIIllllIIlIllIIl) {
        return saveScreenshot(lllllllllllllIIllIIllllIIlIllIII, null, lllllllllllllIIllIIllllIIlIllIll, lllllllllllllIIllIIllllIIlIlIllI, lllllllllllllIIllIIllllIIlIllIIl);
    }
    
    public static IChatComponent saveScreenshot(final File lllllllllllllIIllIIllllIIlIIlIIl, final String lllllllllllllIIllIIllllIIIlllIIl, int lllllllllllllIIllIIllllIIIlllIII, int lllllllllllllIIllIIllllIIIllIlll, final Framebuffer lllllllllllllIIllIIllllIIlIIIlIl) {
        try {
            final File lllllllllllllIIllIIllllIIlIIIlII = new File(lllllllllllllIIllIIllllIIlIIlIIl, ScreenShotHelper.lIIlIlIlIlIlIl[ScreenShotHelper.lIIlIlIlIlllII[1]]);
            lllllllllllllIIllIIllllIIlIIIlII.mkdir();
            "".length();
            if (llIlIIIIllIlIII(OpenGlHelper.isFramebufferEnabled() ? 1 : 0)) {
                lllllllllllllIIllIIllllIIIlllIII = lllllllllllllIIllIIllllIIlIIIlIl.framebufferTextureWidth;
                lllllllllllllIIllIIllllIIIllIlll = lllllllllllllIIllIIllllIIlIIIlIl.framebufferTextureHeight;
            }
            final int lllllllllllllIIllIIllllIIlIIIIll = (int)(lllllllllllllIIllIIllllIIIlllIII * lllllllllllllIIllIIllllIIIllIlll);
            if (!llIlIIIIllIlIIl(ScreenShotHelper.pixelBuffer) || llIlIIIIllIlIlI(ScreenShotHelper.pixelBuffer.capacity(), lllllllllllllIIllIIllllIIlIIIIll)) {
                ScreenShotHelper.pixelBuffer = BufferUtils.createIntBuffer(lllllllllllllIIllIIllllIIlIIIIll);
                ScreenShotHelper.pixelValues = new int[lllllllllllllIIllIIllllIIlIIIIll];
            }
            GL11.glPixelStorei(ScreenShotHelper.lIIlIlIlIlllII[2], ScreenShotHelper.lIIlIlIlIlllII[1]);
            GL11.glPixelStorei(ScreenShotHelper.lIIlIlIlIlllII[3], ScreenShotHelper.lIIlIlIlIlllII[1]);
            ScreenShotHelper.pixelBuffer.clear();
            "".length();
            if (llIlIIIIllIlIII(OpenGlHelper.isFramebufferEnabled() ? 1 : 0)) {
                GlStateManager.bindTexture(lllllllllllllIIllIIllllIIlIIIlIl.framebufferTexture);
                GL11.glGetTexImage(ScreenShotHelper.lIIlIlIlIlllII[4], ScreenShotHelper.lIIlIlIlIlllII[0], ScreenShotHelper.lIIlIlIlIlllII[5], ScreenShotHelper.lIIlIlIlIlllII[6], ScreenShotHelper.pixelBuffer);
                "".length();
                if (" ".length() <= 0) {
                    return null;
                }
            }
            else {
                GL11.glReadPixels(ScreenShotHelper.lIIlIlIlIlllII[0], ScreenShotHelper.lIIlIlIlIlllII[0], (int)lllllllllllllIIllIIllllIIIlllIII, (int)lllllllllllllIIllIIllllIIIllIlll, ScreenShotHelper.lIIlIlIlIlllII[5], ScreenShotHelper.lIIlIlIlIlllII[6], ScreenShotHelper.pixelBuffer);
            }
            ScreenShotHelper.pixelBuffer.get(ScreenShotHelper.pixelValues);
            "".length();
            TextureUtil.processPixelValues(ScreenShotHelper.pixelValues, (int)lllllllllllllIIllIIllllIIIlllIII, (int)lllllllllllllIIllIIllllIIIllIlll);
            BufferedImage lllllllllllllIIllIIllllIIlIIIIlI = null;
            if (llIlIIIIllIlIII(OpenGlHelper.isFramebufferEnabled() ? 1 : 0)) {
                lllllllllllllIIllIIllllIIlIIIIlI = new BufferedImage(lllllllllllllIIllIIllllIIlIIIlIl.framebufferWidth, lllllllllllllIIllIIllllIIlIIIlIl.framebufferHeight, ScreenShotHelper.lIIlIlIlIlllII[1]);
                int lllllllllllllIIllIIllllIIlIIIIII;
                final int lllllllllllllIIllIIllllIIlIIIIIl = lllllllllllllIIllIIllllIIlIIIIII = lllllllllllllIIllIIllllIIlIIIlIl.framebufferTextureHeight - lllllllllllllIIllIIllllIIlIIIlIl.framebufferHeight;
                "".length();
                if (((209 + 207 - 219 + 52 ^ 16 + 95 - 39 + 90) & (0xBF ^ 0x82 ^ (0x42 ^ 0x24) ^ -" ".length())) > (97 + 132 - 227 + 163 ^ 9 + 24 + 49 + 79)) {
                    return null;
                }
                while (!llIlIIIIllIlIll(lllllllllllllIIllIIllllIIlIIIIII, lllllllllllllIIllIIllllIIlIIIlIl.framebufferTextureHeight)) {
                    int lllllllllllllIIllIIllllIIIllllll = ScreenShotHelper.lIIlIlIlIlllII[0];
                    "".length();
                    if (-" ".length() >= "   ".length()) {
                        return null;
                    }
                    while (!llIlIIIIllIlIll(lllllllllllllIIllIIllllIIIllllll, lllllllllllllIIllIIllllIIlIIIlIl.framebufferWidth)) {
                        lllllllllllllIIllIIllllIIlIIIIlI.setRGB(lllllllllllllIIllIIllllIIIllllll, lllllllllllllIIllIIllllIIlIIIIII - lllllllllllllIIllIIllllIIlIIIIIl, ScreenShotHelper.pixelValues[lllllllllllllIIllIIllllIIlIIIIII * lllllllllllllIIllIIllllIIlIIIlIl.framebufferTextureWidth + lllllllllllllIIllIIllllIIIllllll]);
                        ++lllllllllllllIIllIIllllIIIllllll;
                    }
                    ++lllllllllllllIIllIIllllIIlIIIIII;
                }
                "".length();
                if ("  ".length() <= 0) {
                    return null;
                }
            }
            else {
                lllllllllllllIIllIIllllIIlIIIIlI = new BufferedImage((int)lllllllllllllIIllIIllllIIIlllIII, (int)lllllllllllllIIllIIllllIIIllIlll, ScreenShotHelper.lIIlIlIlIlllII[1]);
                lllllllllllllIIllIIllllIIlIIIIlI.setRGB(ScreenShotHelper.lIIlIlIlIlllII[0], ScreenShotHelper.lIIlIlIlIlllII[0], (int)lllllllllllllIIllIIllllIIIlllIII, (int)lllllllllllllIIllIIllllIIIllIlll, ScreenShotHelper.pixelValues, ScreenShotHelper.lIIlIlIlIlllII[0], (int)lllllllllllllIIllIIllllIIIlllIII);
            }
            File lllllllllllllIIllIIllllIIIllllIl = null;
            if (llIlIIIIllIllII(lllllllllllllIIllIIllllIIIlllIIl)) {
                final File lllllllllllllIIllIIllllIIIlllllI = getTimestampedPNGFileForDirectory(lllllllllllllIIllIIllllIIlIIIlII);
                "".length();
                if ("   ".length() < " ".length()) {
                    return null;
                }
            }
            else {
                lllllllllllllIIllIIllllIIIllllIl = new File(lllllllllllllIIllIIllllIIlIIIlII, lllllllllllllIIllIIllllIIIlllIIl);
            }
            ImageIO.write(lllllllllllllIIllIIllllIIlIIIIlI, ScreenShotHelper.lIIlIlIlIlIlIl[ScreenShotHelper.lIIlIlIlIlllII[7]], lllllllllllllIIllIIllllIIIllllIl);
            "".length();
            final IChatComponent lllllllllllllIIllIIllllIIIllllII = new ChatComponentText(lllllllllllllIIllIIllllIIIllllIl.getName());
            lllllllllllllIIllIIllllIIIllllII.getChatStyle().setChatClickEvent(new ClickEvent(ClickEvent.Action.OPEN_FILE, lllllllllllllIIllIIllllIIIllllIl.getAbsolutePath()));
            "".length();
            lllllllllllllIIllIIllllIIIllllII.getChatStyle().setUnderlined((boolean)(ScreenShotHelper.lIIlIlIlIlllII[1] != 0));
            "".length();
            final String lllllllllllllIlIIlIlllIIlIIIIIlI = ScreenShotHelper.lIIlIlIlIlIlIl[ScreenShotHelper.lIIlIlIlIlllII[8]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[ScreenShotHelper.lIIlIlIlIlllII[1]];
            lllllllllllllIlIIlIlllIIlIIIIIIl[ScreenShotHelper.lIIlIlIlIlllII[0]] = lllllllllllllIIllIIllllIIIllllII;
            return new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl);
        }
        catch (Exception lllllllllllllIIllIIllllIIIlllIll) {
            ScreenShotHelper.logger.warn(ScreenShotHelper.lIIlIlIlIlIlIl[ScreenShotHelper.lIIlIlIlIlllII[9]], (Throwable)lllllllllllllIIllIIllllIIIlllIll);
            final String lllllllllllllIlIIlIlllIIlIIIIIlI2 = ScreenShotHelper.lIIlIlIlIlIlIl[ScreenShotHelper.lIIlIlIlIlllII[10]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl2 = new Object[ScreenShotHelper.lIIlIlIlIlllII[1]];
            lllllllllllllIlIIlIlllIIlIIIIIIl2[ScreenShotHelper.lIIlIlIlIlllII[0]] = lllllllllllllIIllIIllllIIIlllIll.getMessage();
            return new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI2, lllllllllllllIlIIlIlllIIlIIIIIIl2);
        }
    }
    
    private static String llIlIIIIlIllIIl(final String lllllllllllllIIllIIllllIIIIIIlII, final String lllllllllllllIIllIIllllIIIIIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIllIIllllIIIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIllllIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), ScreenShotHelper.lIIlIlIlIlllII[13]), "DES");
            final Cipher lllllllllllllIIllIIllllIIIIIIllI = Cipher.getInstance("DES");
            lllllllllllllIIllIIllllIIIIIIllI.init(ScreenShotHelper.lIIlIlIlIlllII[7], lllllllllllllIIllIIllllIIIIIIlll);
            return new String(lllllllllllllIIllIIllllIIIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIllllIIIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIllllIIIIIIlIl) {
            lllllllllllllIIllIIllllIIIIIIlIl.printStackTrace();
            return null;
        }
    }
    
    private static void llIlIIIIllIIlll() {
        (lIIlIlIlIlllII = new int[15])[0] = ((0x33 ^ 0x7 ^ (0x1D ^ 0x7A)) & (0x3D ^ 0x39 ^ (0x1 ^ 0x56) ^ -" ".length()));
        ScreenShotHelper.lIIlIlIlIlllII[1] = " ".length();
        ScreenShotHelper.lIIlIlIlIlllII[2] = (0xFFFFED3F & 0x1FC5);
        ScreenShotHelper.lIIlIlIlIlllII[3] = (-(0xFFFFB137 & 0x7FCB) & (0xFFFFFFF7 & 0x3DFF));
        ScreenShotHelper.lIIlIlIlIlllII[4] = (-(0xFFFFC2FB & 0x7F1F) & (0xFFFFFFFB & 0x4FFF));
        ScreenShotHelper.lIIlIlIlIlllII[5] = (0xFFFFF6EF & 0x89F1);
        ScreenShotHelper.lIIlIlIlIlllII[6] = (0xFFFF97EF & 0xEB77);
        ScreenShotHelper.lIIlIlIlIlllII[7] = "  ".length();
        ScreenShotHelper.lIIlIlIlIlllII[8] = "   ".length();
        ScreenShotHelper.lIIlIlIlIlllII[9] = (128 + 56 - 89 + 83 ^ 154 + 62 - 102 + 68);
        ScreenShotHelper.lIIlIlIlIlllII[10] = (84 + 78 - 147 + 140 ^ 70 + 149 - 117 + 56);
        ScreenShotHelper.lIIlIlIlIlllII[11] = (0x4C ^ 0x51 ^ (0x53 ^ 0x48));
        ScreenShotHelper.lIIlIlIlIlllII[12] = (0x18 ^ 0x1F);
        ScreenShotHelper.lIIlIlIlIlllII[13] = (0x53 ^ 0x5B);
        ScreenShotHelper.lIIlIlIlIlllII[14] = (0x5B ^ 0x3E ^ (0x9 ^ 0x65));
    }
    
    private static boolean llIlIIIIllIlIIl(final Object lllllllllllllIIllIIlllIllllIIlII) {
        return lllllllllllllIIllIIlllIllllIIlII != null;
    }
    
    private static boolean llIlIIIIllIllII(final Object lllllllllllllIIllIIlllIllllIIIlI) {
        return lllllllllllllIIllIIlllIllllIIIlI == null;
    }
    
    private static boolean llIlIIIIllIlIll(final int lllllllllllllIIllIIlllIllllIlIll, final int lllllllllllllIIllIIlllIllllIlIlI) {
        return lllllllllllllIIllIIlllIllllIlIll >= lllllllllllllIIllIIlllIllllIlIlI;
    }
    
    private static boolean llIlIIIIllIlIII(final int lllllllllllllIIllIIlllIllllIIIII) {
        return lllllllllllllIIllIIlllIllllIIIII != 0;
    }
    
    private static boolean llIlIIIIllIllIl(final int lllllllllllllIIllIIlllIllllIllll, final int lllllllllllllIIllIIlllIllllIlllI) {
        return lllllllllllllIIllIIlllIllllIllll == lllllllllllllIIllIIlllIllllIlllI;
    }
    
    static {
        llIlIIIIllIIlll();
        llIlIIIIlIllIll();
        logger = LogManager.getLogger();
        dateFormat = new SimpleDateFormat(ScreenShotHelper.lIIlIlIlIlIlIl[ScreenShotHelper.lIIlIlIlIlllII[0]]);
    }
    
    private static String llIlIIIIlIllIlI(String lllllllllllllIIllIIllllIIIIlIlII, final String lllllllllllllIIllIIllllIIIIlIIll) {
        lllllllllllllIIllIIllllIIIIlIlII = new String(Base64.getDecoder().decode(lllllllllllllIIllIIllllIIIIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIIllllIIIIlIlll = new StringBuilder();
        final char[] lllllllllllllIIllIIllllIIIIlIllI = lllllllllllllIIllIIllllIIIIlIIll.toCharArray();
        int lllllllllllllIIllIIllllIIIIlIlIl = ScreenShotHelper.lIIlIlIlIlllII[0];
        final int lllllllllllllIIllIIllllIIIIIllll = (Object)lllllllllllllIIllIIllllIIIIlIlII.toCharArray();
        final long lllllllllllllIIllIIllllIIIIIlllI = lllllllllllllIIllIIllllIIIIIllll.length;
        short lllllllllllllIIllIIllllIIIIIllIl = (short)ScreenShotHelper.lIIlIlIlIlllII[0];
        while (llIlIIIIllIlIlI(lllllllllllllIIllIIllllIIIIIllIl, (int)lllllllllllllIIllIIllllIIIIIlllI)) {
            final char lllllllllllllIIllIIllllIIIIllIlI = lllllllllllllIIllIIllllIIIIIllll[lllllllllllllIIllIIllllIIIIIllIl];
            lllllllllllllIIllIIllllIIIIlIlll.append((char)(lllllllllllllIIllIIllllIIIIllIlI ^ lllllllllllllIIllIIllllIIIIlIllI[lllllllllllllIIllIIllllIIIIlIlIl % lllllllllllllIIllIIllllIIIIlIllI.length]));
            "".length();
            ++lllllllllllllIIllIIllllIIIIlIlIl;
            ++lllllllllllllIIllIIllllIIIIIllIl;
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIIllllIIIIlIlll);
    }
}
