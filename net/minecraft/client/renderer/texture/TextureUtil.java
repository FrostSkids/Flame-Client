// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.texture;

import net.minecraft.util.ResourceLocation;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.Minecraft;
import java.io.IOException;
import java.io.InputStream;
import java.awt.image.BufferedImage;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.GLAllocation;
import org.apache.logging.log4j.LogManager;
import java.nio.IntBuffer;
import org.apache.logging.log4j.Logger;

public class TextureUtil
{
    private static final /* synthetic */ int[] llIllIIIlIIIII;
    public static final /* synthetic */ int[] missingTextureData;
    private static final /* synthetic */ int[] mipmapBuffer;
    private static final /* synthetic */ IntBuffer dataBuffer;
    public static final /* synthetic */ DynamicTexture missingTexture;
    
    public static int[][] generateMipmapData(final int llllllllllllIllIlIIIIIllllIIIIll, final int llllllllllllIllIlIIIIIllllIIIIlI, final int[][] llllllllllllIllIlIIIIIlllIllIIlI) {
        final int[][] llllllllllllIllIlIIIIIllllIIIIII = new int[llllllllllllIllIlIIIIIllllIIIIll + TextureUtil.llIllIIIlIIIII[6]][];
        llllllllllllIllIlIIIIIllllIIIIII[TextureUtil.llIllIIIlIIIII[5]] = llllllllllllIllIlIIIIIlllIllIIlI[TextureUtil.llIllIIIlIIIII[5]];
        if (lIIlIllIIllIllII(llllllllllllIllIlIIIIIllllIIIIll)) {
            boolean llllllllllllIllIlIIIIIlllIllllll = TextureUtil.llIllIIIlIIIII[5] != 0;
            int llllllllllllIllIlIIIIIlllIlllllI = TextureUtil.llIllIIIlIIIII[5];
            "".length();
            if ("  ".length() > (0xE5 ^ 0xBB ^ (0xC9 ^ 0x93))) {
                return null;
            }
            while (!lIIlIllIIllIlIlI(llllllllllllIllIlIIIIIlllIlllllI, llllllllllllIllIlIIIIIlllIllIIlI.length)) {
                if (lIIlIllIIllIlllI(llllllllllllIllIlIIIIIlllIllIIlI[TextureUtil.llIllIIIlIIIII[5]][llllllllllllIllIlIIIIIlllIlllllI] >> TextureUtil.llIllIIIlIIIII[13])) {
                    llllllllllllIllIlIIIIIlllIllllll = (TextureUtil.llIllIIIlIIIII[6] != 0);
                    "".length();
                    if (-"  ".length() > 0) {
                        return null;
                    }
                    break;
                }
                else {
                    ++llllllllllllIllIlIIIIIlllIlllllI;
                }
            }
            int llllllllllllIllIlIIIIIlllIllllIl = TextureUtil.llIllIIIlIIIII[6];
            "".length();
            if (null != null) {
                return null;
            }
            while (!lIIlIllIIlllIIII(llllllllllllIllIlIIIIIlllIllllIl, llllllllllllIllIlIIIIIllllIIIIll)) {
                if (lIIlIllIIllIllll(llllllllllllIllIlIIIIIlllIllIIlI[llllllllllllIllIlIIIIIlllIllllIl])) {
                    llllllllllllIllIlIIIIIllllIIIIII[llllllllllllIllIlIIIIIlllIllllIl] = llllllllllllIllIlIIIIIlllIllIIlI[llllllllllllIllIlIIIIIlllIllllIl];
                    "".length();
                    if ((180 + 56 - 182 + 129 ^ 46 + 143 - 30 + 19) == 0x0) {
                        return null;
                    }
                }
                else {
                    final int[] llllllllllllIllIlIIIIIlllIllllII = llllllllllllIllIlIIIIIllllIIIIII[llllllllllllIllIlIIIIIlllIllllIl - TextureUtil.llIllIIIlIIIII[6]];
                    final int[] llllllllllllIllIlIIIIIlllIlllIll = new int[llllllllllllIllIlIIIIIlllIllllII.length >> TextureUtil.llIllIIIlIIIII[7]];
                    final int llllllllllllIllIlIIIIIlllIlllIlI = llllllllllllIllIlIIIIIllllIIIIlI >> llllllllllllIllIlIIIIIlllIllllIl;
                    final int llllllllllllIllIlIIIIIlllIlllIIl = llllllllllllIllIlIIIIIlllIlllIll.length / llllllllllllIllIlIIIIIlllIlllIlI;
                    final int llllllllllllIllIlIIIIIlllIlllIII = llllllllllllIllIlIIIIIlllIlllIlI << TextureUtil.llIllIIIlIIIII[6];
                    int llllllllllllIllIlIIIIIlllIllIlll = TextureUtil.llIllIIIlIIIII[5];
                    "".length();
                    if (" ".length() == 0) {
                        return null;
                    }
                    while (!lIIlIllIIllIlIlI(llllllllllllIllIlIIIIIlllIllIlll, llllllllllllIllIlIIIIIlllIlllIlI)) {
                        int llllllllllllIllIlIIIIIlllIllIllI = TextureUtil.llIllIIIlIIIII[5];
                        "".length();
                        if ("   ".length() != "   ".length()) {
                            return null;
                        }
                        while (!lIIlIllIIllIlIlI(llllllllllllIllIlIIIIIlllIllIllI, llllllllllllIllIlIIIIIlllIlllIIl)) {
                            final int llllllllllllIllIlIIIIIlllIllIlIl = TextureUtil.llIllIIIlIIIII[7] * (llllllllllllIllIlIIIIIlllIllIlll + llllllllllllIllIlIIIIIlllIllIllI * llllllllllllIllIlIIIIIlllIlllIII);
                            llllllllllllIllIlIIIIIlllIlllIll[llllllllllllIllIlIIIIIlllIllIlll + llllllllllllIllIlIIIIIlllIllIllI * llllllllllllIllIlIIIIIlllIlllIlI] = blendColors(llllllllllllIllIlIIIIIlllIllllII[llllllllllllIllIlIIIIIlllIllIlIl + TextureUtil.llIllIIIlIIIII[5]], llllllllllllIllIlIIIIIlllIllllII[llllllllllllIllIlIIIIIlllIllIlIl + TextureUtil.llIllIIIlIIIII[6]], llllllllllllIllIlIIIIIlllIllllII[llllllllllllIllIlIIIIIlllIllIlIl + TextureUtil.llIllIIIlIIIII[5] + llllllllllllIllIlIIIIIlllIlllIII], llllllllllllIllIlIIIIIlllIllllII[llllllllllllIllIlIIIIIlllIllIlIl + TextureUtil.llIllIIIlIIIII[6] + llllllllllllIllIlIIIIIlllIlllIII], llllllllllllIllIlIIIIIlllIllllll);
                            ++llllllllllllIllIlIIIIIlllIllIllI;
                        }
                        ++llllllllllllIllIlIIIIIlllIllIlll;
                    }
                    llllllllllllIllIlIIIIIllllIIIIII[llllllllllllIllIlIIIIIlllIllllIl] = llllllllllllIllIlIIIIIlllIlllIll;
                }
                ++llllllllllllIllIlIIIIIlllIllllIl;
            }
        }
        return llllllllllllIllIlIIIIIllllIIIIII;
    }
    
    static {
        lIIlIllIIllIlIII();
        logger = LogManager.getLogger();
        dataBuffer = GLAllocation.createDirectIntBuffer(TextureUtil.llIllIIIlIIIII[0]);
        missingTexture = new DynamicTexture(TextureUtil.llIllIIIlIIIII[1], TextureUtil.llIllIIIlIIIII[1]);
        missingTextureData = TextureUtil.missingTexture.getTextureData();
        final int llllllllllllIllIlIIIIIllllllIlIl = TextureUtil.llIllIIIlIIIII[2];
        final int llllllllllllIllIlIIIIIllllllIlII = TextureUtil.llIllIIIlIIIII[3];
        final int[] array = new int[TextureUtil.llIllIIIlIIIII[4]];
        array[TextureUtil.llIllIIIlIIIII[5]] = TextureUtil.llIllIIIlIIIII[3];
        array[TextureUtil.llIllIIIlIIIII[6]] = TextureUtil.llIllIIIlIIIII[3];
        array[TextureUtil.llIllIIIlIIIII[7]] = TextureUtil.llIllIIIlIIIII[3];
        array[TextureUtil.llIllIIIlIIIII[8]] = TextureUtil.llIllIIIlIIIII[3];
        array[TextureUtil.llIllIIIlIIIII[9]] = TextureUtil.llIllIIIlIIIII[3];
        array[TextureUtil.llIllIIIlIIIII[10]] = TextureUtil.llIllIIIlIIIII[3];
        array[TextureUtil.llIllIIIlIIIII[11]] = TextureUtil.llIllIIIlIIIII[3];
        array[TextureUtil.llIllIIIlIIIII[12]] = TextureUtil.llIllIIIlIIIII[3];
        final int[] llllllllllllIllIlIIIIIllllllIIll = array;
        final int[] array2 = new int[TextureUtil.llIllIIIlIIIII[4]];
        array2[TextureUtil.llIllIIIlIIIII[5]] = TextureUtil.llIllIIIlIIIII[2];
        array2[TextureUtil.llIllIIIlIIIII[6]] = TextureUtil.llIllIIIlIIIII[2];
        array2[TextureUtil.llIllIIIlIIIII[7]] = TextureUtil.llIllIIIlIIIII[2];
        array2[TextureUtil.llIllIIIlIIIII[8]] = TextureUtil.llIllIIIlIIIII[2];
        array2[TextureUtil.llIllIIIlIIIII[9]] = TextureUtil.llIllIIIlIIIII[2];
        array2[TextureUtil.llIllIIIlIIIII[10]] = TextureUtil.llIllIIIlIIIII[2];
        array2[TextureUtil.llIllIIIlIIIII[11]] = TextureUtil.llIllIIIlIIIII[2];
        array2[TextureUtil.llIllIIIlIIIII[12]] = TextureUtil.llIllIIIlIIIII[2];
        final int[] llllllllllllIllIlIIIIIllllllIIlI = array2;
        final int llllllllllllIllIlIIIIIllllllIIIl = llllllllllllIllIlIIIIIllllllIIll.length;
        int llllllllllllIllIlIIIIIllllllIIII = TextureUtil.llIllIIIlIIIII[5];
        "".length();
        if (-"  ".length() >= 0) {
            return;
        }
        while (!lIIlIllIIllIlIlI(llllllllllllIllIlIIIIIllllllIIII, TextureUtil.llIllIIIlIIIII[1])) {
            int[] array3;
            if (lIIlIllIIllIlIIl(llllllllllllIllIlIIIIIllllllIIII, llllllllllllIllIlIIIIIllllllIIIl)) {
                array3 = llllllllllllIllIlIIIIIllllllIIll;
                "".length();
                if (((41 + 66 + 2 + 54 ^ 129 + 139 - 261 + 145) & (0x39 ^ 0x7D ^ 126 + 65 - 143 + 79 ^ -" ".length())) != ((89 + 89 + 18 + 25 ^ 80 + 73 - 94 + 72) & (0x97 ^ 0xC7 ^ (0x9D ^ 0x93) ^ -" ".length()))) {
                    return;
                }
            }
            else {
                array3 = llllllllllllIllIlIIIIIllllllIIlI;
            }
            System.arraycopy(array3, TextureUtil.llIllIIIlIIIII[5], TextureUtil.missingTextureData, TextureUtil.llIllIIIlIIIII[1] * llllllllllllIllIlIIIIIllllllIIII, llllllllllllIllIlIIIIIllllllIIIl);
            int[] array4;
            if (lIIlIllIIllIlIIl(llllllllllllIllIlIIIIIllllllIIII, llllllllllllIllIlIIIIIllllllIIIl)) {
                array4 = llllllllllllIllIlIIIIIllllllIIlI;
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
            else {
                array4 = llllllllllllIllIlIIIIIllllllIIll;
            }
            System.arraycopy(array4, TextureUtil.llIllIIIlIIIII[5], TextureUtil.missingTextureData, TextureUtil.llIllIIIlIIIII[1] * llllllllllllIllIlIIIIIllllllIIII + llllllllllllIllIlIIIIIllllllIIIl, llllllllllllIllIlIIIIIllllllIIIl);
            ++llllllllllllIllIlIIIIIllllllIIII;
        }
        TextureUtil.missingTexture.updateDynamicTexture();
        mipmapBuffer = new int[TextureUtil.llIllIIIlIIIII[9]];
    }
    
    public static void allocateTextureImpl(final int llllllllllllIllIlIIIIIlIllllllIl, final int llllllllllllIllIlIIIIIlIllllllII, final int llllllllllllIllIlIIIIIlIlllllIll, final int llllllllllllIllIlIIIIIlIlllllIlI) {
        deleteTexture(llllllllllllIllIlIIIIIlIllllllIl);
        bindTexture(llllllllllllIllIlIIIIIlIllllllIl);
        if (lIIlIllIIlllIIlI(llllllllllllIllIlIIIIIlIllllllII)) {
            GL11.glTexParameteri(TextureUtil.llIllIIIlIIIII[16], TextureUtil.llIllIIIlIIIII[19], llllllllllllIllIlIIIIIlIllllllII);
            GL11.glTexParameterf(TextureUtil.llIllIIIlIIIII[16], TextureUtil.llIllIIIlIIIII[20], 0.0f);
            GL11.glTexParameterf(TextureUtil.llIllIIIlIIIII[16], TextureUtil.llIllIIIlIIIII[21], (float)llllllllllllIllIlIIIIIlIllllllII);
            GL11.glTexParameterf(TextureUtil.llIllIIIlIIIII[16], TextureUtil.llIllIIIlIIIII[22], 0.0f);
        }
        int llllllllllllIllIlIIIIIlIlllllIIl = TextureUtil.llIllIIIlIIIII[5];
        "".length();
        if ("   ".length() == -" ".length()) {
            return;
        }
        while (!lIIlIllIIlllIIII(llllllllllllIllIlIIIIIlIlllllIIl, llllllllllllIllIlIIIIIlIllllllII)) {
            GL11.glTexImage2D(TextureUtil.llIllIIIlIIIII[16], llllllllllllIllIlIIIIIlIlllllIIl, TextureUtil.llIllIIIlIIIII[23], llllllllllllIllIlIIIIIlIlllllIll >> llllllllllllIllIlIIIIIlIlllllIIl, llllllllllllIllIlIIIIIlIlllllIlI >> llllllllllllIllIlIIIIIlIlllllIIl, TextureUtil.llIllIIIlIIIII[5], TextureUtil.llIllIIIlIIIII[17], TextureUtil.llIllIIIlIIIII[18], (IntBuffer)null);
            ++llllllllllllIllIlIIIIIlIlllllIIl;
        }
    }
    
    private static boolean lIIlIllIIlllIIII(final int llllllllllllIllIlIIIIIlIIlIIIIIl, final int llllllllllllIllIlIIIIIlIIlIIIIII) {
        return llllllllllllIllIlIIIIIlIIlIIIIIl > llllllllllllIllIlIIIIIlIIlIIIIII;
    }
    
    private static void uploadTextureImageSubImpl(final BufferedImage llllllllllllIllIlIIIIIlIllIlIlII, final int llllllllllllIllIlIIIIIlIllIlIIll, final int llllllllllllIllIlIIIIIlIllIIIlIl, final boolean llllllllllllIllIlIIIIIlIllIlIIIl, final boolean llllllllllllIllIlIIIIIlIllIlIIII) {
        final int llllllllllllIllIlIIIIIlIllIIllll = llllllllllllIllIlIIIIIlIllIlIlII.getWidth();
        final int llllllllllllIllIlIIIIIlIllIIlllI = llllllllllllIllIlIIIIIlIllIlIlII.getHeight();
        final int llllllllllllIllIlIIIIIlIllIIllIl = TextureUtil.llIllIIIlIIIII[0] / llllllllllllIllIlIIIIIlIllIIllll;
        final int[] llllllllllllIllIlIIIIIlIllIIllII = new int[llllllllllllIllIlIIIIIlIllIIllIl * llllllllllllIllIlIIIIIlIllIIllll];
        setTextureBlurred(llllllllllllIllIlIIIIIlIllIlIIIl);
        setTextureClamped(llllllllllllIllIlIIIIIlIllIlIIII);
        int llllllllllllIllIlIIIIIlIllIIlIll = TextureUtil.llIllIIIlIIIII[5];
        "".length();
        if (" ".length() <= ((0x5A ^ 0x11) & ~(0x41 ^ 0xA))) {
            return;
        }
        while (!lIIlIllIIllIlIlI(llllllllllllIllIlIIIIIlIllIIlIll, llllllllllllIllIlIIIIIlIllIIllll * llllllllllllIllIlIIIIIlIllIIlllI)) {
            final int llllllllllllIllIlIIIIIlIllIIlIlI = llllllllllllIllIlIIIIIlIllIIlIll / llllllllllllIllIlIIIIIlIllIIllll;
            final int llllllllllllIllIlIIIIIlIllIIlIIl = Math.min(llllllllllllIllIlIIIIIlIllIIllIl, llllllllllllIllIlIIIIIlIllIIlllI - llllllllllllIllIlIIIIIlIllIIlIlI);
            final int llllllllllllIllIlIIIIIlIllIIlIII = llllllllllllIllIlIIIIIlIllIIllll * llllllllllllIllIlIIIIIlIllIIlIIl;
            llllllllllllIllIlIIIIIlIllIlIlII.getRGB(TextureUtil.llIllIIIlIIIII[5], llllllllllllIllIlIIIIIlIllIIlIlI, llllllllllllIllIlIIIIIlIllIIllll, llllllllllllIllIlIIIIIlIllIIlIIl, llllllllllllIllIlIIIIIlIllIIllII, TextureUtil.llIllIIIlIIIII[5], llllllllllllIllIlIIIIIlIllIIllll);
            "".length();
            copyToBuffer(llllllllllllIllIlIIIIIlIllIIllII, llllllllllllIllIlIIIIIlIllIIlIII);
            GL11.glTexSubImage2D(TextureUtil.llIllIIIlIIIII[16], TextureUtil.llIllIIIlIIIII[5], llllllllllllIllIlIIIIIlIllIlIIll, llllllllllllIllIlIIIIIlIllIIIlIl + llllllllllllIllIlIIIIIlIllIIlIlI, llllllllllllIllIlIIIIIlIllIIllll, llllllllllllIllIlIIIIIlIllIIlIIl, TextureUtil.llIllIIIlIIIII[17], TextureUtil.llIllIIIlIIIII[18], TextureUtil.dataBuffer);
            llllllllllllIllIlIIIIIlIllIIlIll += llllllllllllIllIlIIIIIlIllIIllll * llllllllllllIllIlIIIIIlIllIIllIl;
        }
    }
    
    public static int uploadTextureImageSub(final int llllllllllllIllIlIIIIIlIlllIllIl, final BufferedImage llllllllllllIllIlIIIIIlIlllIllII, final int llllllllllllIllIlIIIIIlIlllIIlIl, final int llllllllllllIllIlIIIIIlIlllIlIlI, final boolean llllllllllllIllIlIIIIIlIlllIIIll, final boolean llllllllllllIllIlIIIIIlIlllIIIlI) {
        bindTexture(llllllllllllIllIlIIIIIlIlllIllIl);
        uploadTextureImageSubImpl(llllllllllllIllIlIIIIIlIlllIllII, llllllllllllIllIlIIIIIlIlllIIlIl, llllllllllllIllIlIIIIIlIlllIlIlI, llllllllllllIllIlIIIIIlIlllIIIll, llllllllllllIllIlIIIIIlIlllIIIlI);
        return llllllllllllIllIlIIIIIlIlllIllIl;
    }
    
    private static int blendColorComponent(final int llllllllllllIllIlIIIIIllIlllIIII, final int llllllllllllIllIlIIIIIllIllIllll, final int llllllllllllIllIlIIIIIllIllIlllI, final int llllllllllllIllIlIIIIIllIllIIIll, final int llllllllllllIllIlIIIIIllIllIIIlI) {
        final float llllllllllllIllIlIIIIIllIllIlIll = (float)Math.pow((llllllllllllIllIlIIIIIllIlllIIII >> llllllllllllIllIlIIIIIllIllIIIlI & TextureUtil.llIllIIIlIIIII[14]) / 255.0f, 2.2);
        final float llllllllllllIllIlIIIIIllIllIlIlI = (float)Math.pow((llllllllllllIllIlIIIIIllIllIllll >> llllllllllllIllIlIIIIIllIllIIIlI & TextureUtil.llIllIIIlIIIII[14]) / 255.0f, 2.2);
        final float llllllllllllIllIlIIIIIllIllIlIIl = (float)Math.pow((llllllllllllIllIlIIIIIllIllIlllI >> llllllllllllIllIlIIIIIllIllIIIlI & TextureUtil.llIllIIIlIIIII[14]) / 255.0f, 2.2);
        final float llllllllllllIllIlIIIIIllIllIlIII = (float)Math.pow((llllllllllllIllIlIIIIIllIllIIIll >> llllllllllllIllIlIIIIIllIllIIIlI & TextureUtil.llIllIIIlIIIII[14]) / 255.0f, 2.2);
        final float llllllllllllIllIlIIIIIllIllIIlll = (float)Math.pow((llllllllllllIllIlIIIIIllIllIlIll + llllllllllllIllIlIIIIIllIllIlIlI + llllllllllllIllIlIIIIIllIllIlIIl + llllllllllllIllIlIIIIIllIllIlIII) * 0.25, 0.45454545454545453);
        return (int)(llllllllllllIllIlIIIIIllIllIIlll * 255.0);
    }
    
    public static void processPixelValues(final int[] llllllllllllIllIlIIIIIlIIlIlIlll, final int llllllllllllIllIlIIIIIlIIlIlIllI, final int llllllllllllIllIlIIIIIlIIlIlIlIl) {
        final int[] llllllllllllIllIlIIIIIlIIlIlIlII = new int[llllllllllllIllIlIIIIIlIIlIlIllI];
        final int llllllllllllIllIlIIIIIlIIlIlIIll = llllllllllllIllIlIIIIIlIIlIlIlIl / TextureUtil.llIllIIIlIIIII[7];
        int llllllllllllIllIlIIIIIlIIlIlIIlI = TextureUtil.llIllIIIlIIIII[5];
        "".length();
        if (-" ".length() != -" ".length()) {
            return;
        }
        while (!lIIlIllIIllIlIlI(llllllllllllIllIlIIIIIlIIlIlIIlI, llllllllllllIllIlIIIIIlIIlIlIIll)) {
            System.arraycopy(llllllllllllIllIlIIIIIlIIlIlIlll, llllllllllllIllIlIIIIIlIIlIlIIlI * llllllllllllIllIlIIIIIlIIlIlIllI, llllllllllllIllIlIIIIIlIIlIlIlII, TextureUtil.llIllIIIlIIIII[5], llllllllllllIllIlIIIIIlIIlIlIllI);
            System.arraycopy(llllllllllllIllIlIIIIIlIIlIlIlll, (llllllllllllIllIlIIIIIlIIlIlIlIl - TextureUtil.llIllIIIlIIIII[6] - llllllllllllIllIlIIIIIlIIlIlIIlI) * llllllllllllIllIlIIIIIlIIlIlIllI, llllllllllllIllIlIIIIIlIIlIlIlll, llllllllllllIllIlIIIIIlIIlIlIIlI * llllllllllllIllIlIIIIIlIIlIlIllI, llllllllllllIllIlIIIIIlIIlIlIllI);
            System.arraycopy(llllllllllllIllIlIIIIIlIIlIlIlII, TextureUtil.llIllIIIlIIIII[5], llllllllllllIllIlIIIIIlIIlIlIlll, (llllllllllllIllIlIIIIIlIIlIlIlIl - TextureUtil.llIllIIIlIIIII[6] - llllllllllllIllIlIIIIIlIIlIlIIlI) * llllllllllllIllIlIIIIIlIIlIlIllI, llllllllllllIllIlIIIIIlIIlIlIllI);
            ++llllllllllllIllIlIIIIIlIIlIlIIlI;
        }
    }
    
    public static BufferedImage readBufferedImage(final InputStream llllllllllllIllIlIIIIIlIlIIIIlII) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    javax/imageio/ImageIO.read:(Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;
        //     4: astore_1        /* llllllllllllIllIlIIIIIlIlIIIIIll */
        //     5: ldc             ""
        //     7: invokevirtual   java/lang/String.length:()I
        //    10: pop            
        //    11: sipush          220
        //    14: sipush          192
        //    17: ixor           
        //    18: bipush          98
        //    20: bipush          38
        //    22: ixor           
        //    23: ixor           
        //    24: bipush          66
        //    26: bipush          114
        //    28: iadd           
        //    29: sipush          134
        //    32: isub           
        //    33: sipush          205
        //    36: iadd           
        //    37: bipush          40
        //    39: sipush          149
        //    42: iadd           
        //    43: bipush          99
        //    45: isub           
        //    46: bipush          73
        //    48: iadd           
        //    49: ixor           
        //    50: ldc             " "
        //    52: invokevirtual   java/lang/String.length:()I
        //    55: ineg           
        //    56: ixor           
        //    57: iand           
        //    58: ifeq            70
        //    61: aconst_null    
        //    62: areturn        
        //    63: astore_2        /* llllllllllllIllIlIIIIIlIIlllllll */
        //    64: aload_0         /* llllllllllllIllIlIIIIIlIlIIIIIIl */
        //    65: invokestatic    org/apache/commons/io/IOUtils.closeQuietly:(Ljava/io/InputStream;)V
        //    68: aload_2         /* llllllllllllIllIlIIIIIlIIlllllll */
        //    69: athrow         
        //    70: aload_0         /* llllllllllllIllIlIIIIIlIlIIIIIIl */
        //    71: invokestatic    org/apache/commons/io/IOUtils.closeQuietly:(Ljava/io/InputStream;)V
        //    74: aload_1         /* llllllllllllIllIlIIIIIlIlIIIIIlI */
        //    75: areturn        
        //    Exceptions:
        //  throws java.io.IOException
        //    StackMapTable: 00 02 F7 00 3F 07 01 59 FC 00 06 07 00 C7
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      63     63     70     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static void setTextureBlurred(final boolean llllllllllllIllIlIIIIIlIlIllIlIl) {
        setTextureBlurMipmap(llllllllllllIllIlIIIIIlIlIllIlIl, (boolean)(TextureUtil.llIllIIIlIIIII[5] != 0));
    }
    
    private static boolean lIIlIllIIllIlIIl(final int llllllllllllIllIlIIIIIlIIlIIIlIl, final int llllllllllllIllIlIIIIIlIIlIIIlII) {
        return llllllllllllIllIlIIIIIlIIlIIIlIl < llllllllllllIllIlIIIIIlIIlIIIlII;
    }
    
    public static void uploadTexture(final int llllllllllllIllIlIIIIIllllIlIlIl, final int[] llllllllllllIllIlIIIIIllllIlIlII, final int llllllllllllIllIlIIIIIllllIlIlll, final int llllllllllllIllIlIIIIIllllIlIIlI) {
        bindTexture(llllllllllllIllIlIIIIIllllIlIlIl);
        uploadTextureSub(TextureUtil.llIllIIIlIIIII[5], llllllllllllIllIlIIIIIllllIlIlII, llllllllllllIllIlIIIIIllllIlIlll, llllllllllllIllIlIIIIIllllIlIIlI, TextureUtil.llIllIIIlIIIII[5], TextureUtil.llIllIIIlIIIII[5], (boolean)(TextureUtil.llIllIIIlIIIII[5] != 0), (boolean)(TextureUtil.llIllIIIlIIIII[5] != 0), (boolean)(TextureUtil.llIllIIIlIIIII[5] != 0));
    }
    
    public static void uploadTextureMipmap(final int[][] llllllllllllIllIlIIIIIllIlIlIIll, final int llllllllllllIllIlIIIIIllIlIIlIIl, final int llllllllllllIllIlIIIIIllIlIIlIII, final int llllllllllllIllIlIIIIIllIlIlIIII, final int llllllllllllIllIlIIIIIllIlIIllll, final boolean llllllllllllIllIlIIIIIllIlIIIlIl, final boolean llllllllllllIllIlIIIIIllIlIIIlII) {
        int llllllllllllIllIlIIIIIllIlIIllII = TextureUtil.llIllIIIlIIIII[5];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIlIllIIllIlIlI(llllllllllllIllIlIIIIIllIlIIllII, llllllllllllIllIlIIIIIllIlIlIIll.length)) {
            final int[] llllllllllllIllIlIIIIIllIlIIlIll = llllllllllllIllIlIIIIIllIlIlIIll[llllllllllllIllIlIIIIIllIlIIllII];
            final int llllllllllllIllIlIIIIIllIIlIIlIl = llllllllllllIllIlIIIIIllIlIIllII;
            final int[] llllllllllllIllIlIIIIIllIIllIIlI = llllllllllllIllIlIIIIIllIlIIlIll;
            final int llllllllllllIllIlIIIIIllIIlIIIll = llllllllllllIllIlIIIIIllIlIIlIIl >> llllllllllllIllIlIIIIIllIlIIllII;
            final int llllllllllllIllIlIIIIIllIIlIIIlI = llllllllllllIllIlIIIIIllIlIIlIII >> llllllllllllIllIlIIIIIllIlIIllII;
            final int llllllllllllIllIlIIIIIllIIlIllll = llllllllllllIllIlIIIIIllIlIlIIII >> llllllllllllIllIlIIIIIllIlIIllII;
            final int llllllllllllIllIlIIIIIllIIlIlllI = llllllllllllIllIlIIIIIllIlIIllll >> llllllllllllIllIlIIIIIllIlIIllII;
            int llllllllllllIllIlIIIIIllIIIlllIl;
            if (lIIlIllIIlllIIII(llllllllllllIllIlIIIIIllIlIlIIll.length, TextureUtil.llIllIIIlIIIII[6])) {
                llllllllllllIllIlIIIIIllIIIlllIl = TextureUtil.llIllIIIlIIIII[6];
                "".length();
                if (" ".length() == "  ".length()) {
                    return;
                }
            }
            else {
                llllllllllllIllIlIIIIIllIIIlllIl = TextureUtil.llIllIIIlIIIII[5];
            }
            uploadTextureSub(llllllllllllIllIlIIIIIllIIlIIlIl, llllllllllllIllIlIIIIIllIIllIIlI, llllllllllllIllIlIIIIIllIIlIIIll, llllllllllllIllIlIIIIIllIIlIIIlI, llllllllllllIllIlIIIIIllIIlIllll, llllllllllllIllIlIIIIIllIIlIlllI, llllllllllllIllIlIIIIIllIlIIIlIl, llllllllllllIllIlIIIIIllIlIIIlII, (boolean)(llllllllllllIllIlIIIIIllIIIlllIl != 0));
            ++llllllllllllIllIlIIIIIllIlIIllII;
        }
    }
    
    private static void copyToBufferPos(final int[] llllllllllllIllIlIIIIIlIlIlIIlII, final int llllllllllllIllIlIIIIIlIlIIlllll, final int llllllllllllIllIlIIIIIlIlIlIIIlI) {
        int[] llllllllllllIllIlIIIIIlIlIlIIIIl = llllllllllllIllIlIIIIIlIlIlIIlII;
        if (lIIlIllIIlllIIIl(Minecraft.getMinecraft().gameSettings.anaglyph ? 1 : 0)) {
            llllllllllllIllIlIIIIIlIlIlIIIIl = updateAnaglyph(llllllllllllIllIlIIIIIlIlIlIIlII);
        }
        TextureUtil.dataBuffer.clear();
        "".length();
        TextureUtil.dataBuffer.put(llllllllllllIllIlIIIIIlIlIlIIIIl, llllllllllllIllIlIIIIIlIlIIlllll, llllllllllllIllIlIIIIIlIlIlIIIlI);
        "".length();
        TextureUtil.dataBuffer.position(TextureUtil.llIllIIIlIIIII[5]).limit(llllllllllllIllIlIIIIIlIlIlIIIlI);
        "".length();
    }
    
    private static void setTextureBlurMipmap(final boolean llllllllllllIllIlIIIIIlIlIllIIlI, final boolean llllllllllllIllIlIIIIIlIlIlIllll) {
        if (lIIlIllIIlllIIIl(llllllllllllIllIlIIIIIlIlIllIIlI ? 1 : 0)) {
            final int n = TextureUtil.llIllIIIlIIIII[16];
            final int n2 = TextureUtil.llIllIIIlIIIII[28];
            int n3;
            if (lIIlIllIIlllIIIl(llllllllllllIllIlIIIIIlIlIlIllll ? 1 : 0)) {
                n3 = TextureUtil.llIllIIIlIIIII[29];
                "".length();
                if (-" ".length() > (0x14 ^ 0x10)) {
                    return;
                }
            }
            else {
                n3 = TextureUtil.llIllIIIlIIIII[30];
            }
            GL11.glTexParameteri(n, n2, n3);
            GL11.glTexParameteri(TextureUtil.llIllIIIlIIIII[16], TextureUtil.llIllIIIlIIIII[31], TextureUtil.llIllIIIlIIIII[30]);
            "".length();
            if (" ".length() != " ".length()) {
                return;
            }
        }
        else {
            final int n4 = TextureUtil.llIllIIIlIIIII[16];
            final int n5 = TextureUtil.llIllIIIlIIIII[28];
            int n6;
            if (lIIlIllIIlllIIIl(llllllllllllIllIlIIIIIlIlIlIllll ? 1 : 0)) {
                n6 = TextureUtil.llIllIIIlIIIII[32];
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            }
            else {
                n6 = TextureUtil.llIllIIIlIIIII[33];
            }
            GL11.glTexParameteri(n4, n5, n6);
            GL11.glTexParameteri(TextureUtil.llIllIIIlIIIII[16], TextureUtil.llIllIIIlIIIII[31], TextureUtil.llIllIIIlIIIII[33]);
        }
    }
    
    private static void setTextureClamped(final boolean llllllllllllIllIlIIIIIlIlIlllIII) {
        if (lIIlIllIIlllIIIl(llllllllllllIllIlIIIIIlIlIlllIII ? 1 : 0)) {
            GL11.glTexParameteri(TextureUtil.llIllIIIlIIIII[16], TextureUtil.llIllIIIlIIIII[24], TextureUtil.llIllIIIlIIIII[25]);
            GL11.glTexParameteri(TextureUtil.llIllIIIlIIIII[16], TextureUtil.llIllIIIlIIIII[26], TextureUtil.llIllIIIlIIIII[25]);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            GL11.glTexParameteri(TextureUtil.llIllIIIlIIIII[16], TextureUtil.llIllIIIlIIIII[24], TextureUtil.llIllIIIlIIIII[27]);
            GL11.glTexParameteri(TextureUtil.llIllIIIlIIIII[16], TextureUtil.llIllIIIlIIIII[26], TextureUtil.llIllIIIlIIIII[27]);
        }
    }
    
    private static boolean lIIlIllIIllIllII(final int llllllllllllIllIlIIIIIlIIIllIllI) {
        return llllllllllllIllIlIIIIIlIIIllIllI > 0;
    }
    
    public static int uploadTextureImageAllocate(final int llllllllllllIllIlIIIIIllIIIlIIll, final BufferedImage llllllllllllIllIlIIIIIllIIIlIIlI, final boolean llllllllllllIllIlIIIIIllIIIIllIl, final boolean llllllllllllIllIlIIIIIllIIIIllII) {
        allocateTexture(llllllllllllIllIlIIIIIllIIIlIIll, llllllllllllIllIlIIIIIllIIIlIIlI.getWidth(), llllllllllllIllIlIIIIIllIIIlIIlI.getHeight());
        return uploadTextureImageSub(llllllllllllIllIlIIIIIllIIIlIIll, llllllllllllIllIlIIIIIllIIIlIIlI, TextureUtil.llIllIIIlIIIII[5], TextureUtil.llIllIIIlIIIII[5], llllllllllllIllIlIIIIIllIIIIllIl, llllllllllllIllIlIIIIIllIIIIllII);
    }
    
    public static void deleteTexture(final int llllllllllllIllIlIIIIIlllllIIlIl) {
        GlStateManager.deleteTexture(llllllllllllIllIlIIIIIlllllIIlIl);
    }
    
    private static void uploadTextureSub(final int llllllllllllIllIlIIIIIllIIlIIlIl, final int[] llllllllllllIllIlIIIIIllIIllIIlI, final int llllllllllllIllIlIIIIIllIIlIIIll, final int llllllllllllIllIlIIIIIllIIlIIIlI, final int llllllllllllIllIlIIIIIllIIlIllll, final int llllllllllllIllIlIIIIIllIIlIlllI, final boolean llllllllllllIllIlIIIIIllIIIlllll, final boolean llllllllllllIllIlIIIIIllIIIllllI, final boolean llllllllllllIllIlIIIIIllIIIlllIl) {
        final int llllllllllllIllIlIIIIIllIIlIlIlI = TextureUtil.llIllIIIlIIIII[0] / llllllllllllIllIlIIIIIllIIlIIIll;
        setTextureBlurMipmap(llllllllllllIllIlIIIIIllIIIlllll, llllllllllllIllIlIIIIIllIIIlllIl);
        setTextureClamped(llllllllllllIllIlIIIIIllIIIllllI);
        int llllllllllllIllIlIIIIIllIIlIlIII = TextureUtil.llIllIIIlIIIII[5];
        "".length();
        if ((46 + 30 + 33 + 41 ^ 134 + 12 - 95 + 95) <= "   ".length()) {
            return;
        }
        while (!lIIlIllIIllIlIlI(llllllllllllIllIlIIIIIllIIlIlIII, llllllllllllIllIlIIIIIllIIlIIIll * llllllllllllIllIlIIIIIllIIlIIIlI)) {
            final int llllllllllllIllIlIIIIIllIIlIIlll = llllllllllllIllIlIIIIIllIIlIlIII / llllllllllllIllIlIIIIIllIIlIIIll;
            final int llllllllllllIllIlIIIIIllIIlIlIIl = Math.min(llllllllllllIllIlIIIIIllIIlIlIlI, llllllllllllIllIlIIIIIllIIlIIIlI - llllllllllllIllIlIIIIIllIIlIIlll);
            final int llllllllllllIllIlIIIIIllIIlIIllI = llllllllllllIllIlIIIIIllIIlIIIll * llllllllllllIllIlIIIIIllIIlIlIIl;
            copyToBufferPos(llllllllllllIllIlIIIIIllIIllIIlI, llllllllllllIllIlIIIIIllIIlIlIII, llllllllllllIllIlIIIIIllIIlIIllI);
            GL11.glTexSubImage2D(TextureUtil.llIllIIIlIIIII[16], llllllllllllIllIlIIIIIllIIlIIlIl, llllllllllllIllIlIIIIIllIIlIllll, llllllllllllIllIlIIIIIllIIlIlllI + llllllllllllIllIlIIIIIllIIlIIlll, llllllllllllIllIlIIIIIllIIlIIIll, llllllllllllIllIlIIIIIllIIlIlIIl, TextureUtil.llIllIIIlIIIII[17], TextureUtil.llIllIIIlIIIII[18], TextureUtil.dataBuffer);
            llllllllllllIllIlIIIIIllIIlIlIII += llllllllllllIllIlIIIIIllIIlIIIll * llllllllllllIllIlIIIIIllIIlIlIIl;
        }
    }
    
    private static boolean lIIlIllIIllIlllI(final int llllllllllllIllIlIIIIIlIIIlllIlI) {
        return llllllllllllIllIlIIIIIlIIIlllIlI == 0;
    }
    
    public static int[] readImageData(final IResourceManager llllllllllllIllIlIIIIIlIlIIlIIll, final ResourceLocation llllllllllllIllIlIIIIIlIlIIIllII) throws IOException {
        final BufferedImage llllllllllllIllIlIIIIIlIlIIlIIIl = readBufferedImage(llllllllllllIllIlIIIIIlIlIIlIIll.getResource(llllllllllllIllIlIIIIIlIlIIIllII).getInputStream());
        final int llllllllllllIllIlIIIIIlIlIIlIIII = llllllllllllIllIlIIIIIlIlIIlIIIl.getWidth();
        final int llllllllllllIllIlIIIIIlIlIIIllll = llllllllllllIllIlIIIIIlIlIIlIIIl.getHeight();
        final int[] llllllllllllIllIlIIIIIlIlIIIlllI = new int[llllllllllllIllIlIIIIIlIlIIlIIII * llllllllllllIllIlIIIIIlIlIIIllll];
        llllllllllllIllIlIIIIIlIlIIlIIIl.getRGB(TextureUtil.llIllIIIlIIIII[5], TextureUtil.llIllIIIlIIIII[5], llllllllllllIllIlIIIIIlIlIIlIIII, llllllllllllIllIlIIIIIlIlIIIllll, llllllllllllIllIlIIIIIlIlIIIlllI, TextureUtil.llIllIIIlIIIII[5], llllllllllllIllIlIIIIIlIlIIlIIII);
        "".length();
        return llllllllllllIllIlIIIIIlIlIIIlllI;
    }
    
    private static boolean lIIlIllIIlllIIlI(final int llllllllllllIllIlIIIIIlIIIlllIII) {
        return llllllllllllIllIlIIIIIlIIIlllIII >= 0;
    }
    
    public static int glGenTextures() {
        return GlStateManager.generateTexture();
    }
    
    private static int blendColors(final int llllllllllllIllIlIIIIIlllIIIIlll, final int llllllllllllIllIlIIIIIlllIIllIII, final int llllllllllllIllIlIIIIIlllIIIIlIl, final int llllllllllllIllIlIIIIIlllIIlIllI, final boolean llllllllllllIllIlIIIIIlllIIIIIll) {
        if (lIIlIllIIllIlllI(llllllllllllIllIlIIIIIlllIIIIIll ? 1 : 0)) {
            final int llllllllllllIllIlIIIIIlllIIlIlII = blendColorComponent(llllllllllllIllIlIIIIIlllIIIIlll, llllllllllllIllIlIIIIIlllIIllIII, llllllllllllIllIlIIIIIlllIIIIlIl, llllllllllllIllIlIIIIIlllIIlIllI, TextureUtil.llIllIIIlIIIII[13]);
            final int llllllllllllIllIlIIIIIlllIIlIIll = blendColorComponent(llllllllllllIllIlIIIIIlllIIIIlll, llllllllllllIllIlIIIIIlllIIllIII, llllllllllllIllIlIIIIIlllIIIIlIl, llllllllllllIllIlIIIIIlllIIlIllI, TextureUtil.llIllIIIlIIIII[1]);
            final int llllllllllllIllIlIIIIIlllIIlIIlI = blendColorComponent(llllllllllllIllIlIIIIIlllIIIIlll, llllllllllllIllIlIIIIIlllIIllIII, llllllllllllIllIlIIIIIlllIIIIlIl, llllllllllllIllIlIIIIIlllIIlIllI, TextureUtil.llIllIIIlIIIII[4]);
            final int llllllllllllIllIlIIIIIlllIIlIIIl = blendColorComponent(llllllllllllIllIlIIIIIlllIIIIlll, llllllllllllIllIlIIIIIlllIIllIII, llllllllllllIllIlIIIIIlllIIIIlIl, llllllllllllIllIlIIIIIlllIIlIllI, TextureUtil.llIllIIIlIIIII[5]);
            return llllllllllllIllIlIIIIIlllIIlIlII << TextureUtil.llIllIIIlIIIII[13] | llllllllllllIllIlIIIIIlllIIlIIll << TextureUtil.llIllIIIlIIIII[1] | llllllllllllIllIlIIIIIlllIIlIIlI << TextureUtil.llIllIIIlIIIII[4] | llllllllllllIllIlIIIIIlllIIlIIIl;
        }
        TextureUtil.mipmapBuffer[TextureUtil.llIllIIIlIIIII[5]] = llllllllllllIllIlIIIIIlllIIIIlll;
        TextureUtil.mipmapBuffer[TextureUtil.llIllIIIlIIIII[6]] = llllllllllllIllIlIIIIIlllIIllIII;
        TextureUtil.mipmapBuffer[TextureUtil.llIllIIIlIIIII[7]] = llllllllllllIllIlIIIIIlllIIIIlIl;
        TextureUtil.mipmapBuffer[TextureUtil.llIllIIIlIIIII[8]] = llllllllllllIllIlIIIIIlllIIlIllI;
        float llllllllllllIllIlIIIIIlllIIlIIII = 0.0f;
        float llllllllllllIllIlIIIIIlllIIIllll = 0.0f;
        float llllllllllllIllIlIIIIIlllIIIlllI = 0.0f;
        float llllllllllllIllIlIIIIIlllIIIllIl = 0.0f;
        int llllllllllllIllIlIIIIIlllIIIllII = TextureUtil.llIllIIIlIIIII[5];
        "".length();
        if ("  ".length() < 0) {
            return (35 + 5 - 12 + 110 ^ 78 + 50 - 74 + 98) & (154 + 96 - 229 + 189 ^ 79 + 72 - 15 + 56 ^ -" ".length());
        }
        while (!lIIlIllIIllIlIlI(llllllllllllIllIlIIIIIlllIIIllII, TextureUtil.llIllIIIlIIIII[9])) {
            if (lIIlIllIIlllIIIl(TextureUtil.mipmapBuffer[llllllllllllIllIlIIIIIlllIIIllII] >> TextureUtil.llIllIIIlIIIII[13])) {
                llllllllllllIllIlIIIIIlllIIlIIII += (float)Math.pow((TextureUtil.mipmapBuffer[llllllllllllIllIlIIIIIlllIIIllII] >> TextureUtil.llIllIIIlIIIII[13] & TextureUtil.llIllIIIlIIIII[14]) / 255.0f, 2.2);
                llllllllllllIllIlIIIIIlllIIIllll += (float)Math.pow((TextureUtil.mipmapBuffer[llllllllllllIllIlIIIIIlllIIIllII] >> TextureUtil.llIllIIIlIIIII[1] & TextureUtil.llIllIIIlIIIII[14]) / 255.0f, 2.2);
                llllllllllllIllIlIIIIIlllIIIlllI += (float)Math.pow((TextureUtil.mipmapBuffer[llllllllllllIllIlIIIIIlllIIIllII] >> TextureUtil.llIllIIIlIIIII[4] & TextureUtil.llIllIIIlIIIII[14]) / 255.0f, 2.2);
                llllllllllllIllIlIIIIIlllIIIllIl += (float)Math.pow((TextureUtil.mipmapBuffer[llllllllllllIllIlIIIIIlllIIIllII] >> TextureUtil.llIllIIIlIIIII[5] & TextureUtil.llIllIIIlIIIII[14]) / 255.0f, 2.2);
            }
            ++llllllllllllIllIlIIIIIlllIIIllII;
        }
        llllllllllllIllIlIIIIIlllIIlIIII /= 4.0f;
        llllllllllllIllIlIIIIIlllIIIllll /= 4.0f;
        llllllllllllIllIlIIIIIlllIIIlllI /= 4.0f;
        llllllllllllIllIlIIIIIlllIIIllIl /= 4.0f;
        int llllllllllllIllIlIIIIIlllIIIlIll = (int)(Math.pow(llllllllllllIllIlIIIIIlllIIlIIII, 0.45454545454545453) * 255.0);
        final int llllllllllllIllIlIIIIIlllIIIlIlI = (int)(Math.pow(llllllllllllIllIlIIIIIlllIIIllll, 0.45454545454545453) * 255.0);
        final int llllllllllllIllIlIIIIIlllIIIlIIl = (int)(Math.pow(llllllllllllIllIlIIIIIlllIIIlllI, 0.45454545454545453) * 255.0);
        final int llllllllllllIllIlIIIIIlllIIIlIII = (int)(Math.pow(llllllllllllIllIlIIIIIlllIIIllIl, 0.45454545454545453) * 255.0);
        if (lIIlIllIIllIlIIl(llllllllllllIllIlIIIIIlllIIIlIll, TextureUtil.llIllIIIlIIIII[15])) {
            llllllllllllIllIlIIIIIlllIIIlIll = TextureUtil.llIllIIIlIIIII[5];
        }
        return llllllllllllIllIlIIIIIlllIIIlIll << TextureUtil.llIllIIIlIIIII[13] | llllllllllllIllIlIIIIIlllIIIlIlI << TextureUtil.llIllIIIlIIIII[1] | llllllllllllIllIlIIIIIlllIIIlIIl << TextureUtil.llIllIIIlIIIII[4] | llllllllllllIllIlIIIIIlllIIIlIII;
    }
    
    private static void copyToBuffer(final int[] llllllllllllIllIlIIIIIlIlIlIllII, final int llllllllllllIllIlIIIIIlIlIlIlIIl) {
        copyToBufferPos(llllllllllllIllIlIIIIIlIlIlIllII, TextureUtil.llIllIIIlIIIII[5], llllllllllllIllIlIIIIIlIlIlIlIIl);
    }
    
    public static int[] updateAnaglyph(final int[] llllllllllllIllIlIIIIIlIIllllIll) {
        final int[] llllllllllllIllIlIIIIIlIIllllIlI = new int[llllllllllllIllIlIIIIIlIIllllIll.length];
        int llllllllllllIllIlIIIIIlIIllllIIl = TextureUtil.llIllIIIlIIIII[5];
        "".length();
        if (-" ".length() >= 0) {
            return null;
        }
        while (!lIIlIllIIllIlIlI(llllllllllllIllIlIIIIIlIIllllIIl, llllllllllllIllIlIIIIIlIIllllIll.length)) {
            llllllllllllIllIlIIIIIlIIllllIlI[llllllllllllIllIlIIIIIlIIllllIIl] = anaglyphColor(llllllllllllIllIlIIIIIlIIllllIll[llllllllllllIllIlIIIIIlIIllllIIl]);
            ++llllllllllllIllIlIIIIIlIIllllIIl;
        }
        return llllllllllllIllIlIIIIIlIIllllIlI;
    }
    
    static void bindTexture(final int llllllllllllIllIlIIIIIlIlIIllIll) {
        GlStateManager.bindTexture(llllllllllllIllIlIIIIIlIlIIllIll);
    }
    
    private static boolean lIIlIllIIlllIIIl(final int llllllllllllIllIlIIIIIlIIIllllII) {
        return llllllllllllIllIlIIIIIlIIIllllII != 0;
    }
    
    private static boolean lIIlIllIIllIlIlI(final int llllllllllllIllIlIIIIIlIIlIIlIIl, final int llllllllllllIllIlIIIIIlIIlIIlIII) {
        return llllllllllllIllIlIIIIIlIIlIIlIIl >= llllllllllllIllIlIIIIIlIIlIIlIII;
    }
    
    public static int uploadTextureImage(final int llllllllllllIllIlIIIIIlllllIIIIl, final BufferedImage llllllllllllIllIlIIIIIllllIllllI) {
        return uploadTextureImageAllocate(llllllllllllIllIlIIIIIlllllIIIIl, llllllllllllIllIlIIIIIllllIllllI, (boolean)(TextureUtil.llIllIIIlIIIII[5] != 0), (boolean)(TextureUtil.llIllIIIlIIIII[5] != 0));
    }
    
    private static void lIIlIllIIllIlIII() {
        (llIllIIIlIIIII = new int[39])[0] = (0xFFFFF18E & 0x400E71);
        TextureUtil.llIllIIIlIIIII[1] = (0x3A ^ 0x54 ^ (0x19 ^ 0x67));
        TextureUtil.llIllIIIlIIIII[2] = -(0xFFFFD223 & 0x1002DDC);
        TextureUtil.llIllIIIlIIIII[3] = -(-(203 + 72 - 112 + 63) & (0xFFFFFFF9 & 0x7FFEF));
        TextureUtil.llIllIIIlIIIII[4] = (0x8 ^ 0x46 ^ (0xD2 ^ 0x94));
        TextureUtil.llIllIIIlIIIII[5] = ((145 + 37 - 174 + 190 ^ 56 + 147 - 63 + 12) & ("  ".length() ^ (0xF0 ^ 0xAC) ^ -" ".length()));
        TextureUtil.llIllIIIlIIIII[6] = " ".length();
        TextureUtil.llIllIIIlIIIII[7] = "  ".length();
        TextureUtil.llIllIIIlIIIII[8] = "   ".length();
        TextureUtil.llIllIIIlIIIII[9] = (0x57 ^ 0x53);
        TextureUtil.llIllIIIlIIIII[10] = (0x1E ^ 0xD ^ (0x53 ^ 0x45));
        TextureUtil.llIllIIIlIIIII[11] = (0xAC ^ 0x97 ^ (0x1C ^ 0x21));
        TextureUtil.llIllIIIlIIIII[12] = (0x53 ^ 0x54);
        TextureUtil.llIllIIIlIIIII[13] = (0x21 ^ 0x39);
        TextureUtil.llIllIIIlIIIII[14] = 33 + 188 - 150 + 171 + (0xF2 ^ 0xBC) - (0x7B ^ 0xE) + (0xB ^ 0x3F);
        TextureUtil.llIllIIIlIIIII[15] = (0x6D ^ 0x30 ^ (0x5A ^ 0x67));
        TextureUtil.llIllIIIlIIIII[16] = (0xFFFFADF3 & 0x5FED);
        TextureUtil.llIllIIIlIIIII[17] = (-(0xFFFFDFBD & 0x3B5B) & (0xFFFFDBFB & 0xBFFD));
        TextureUtil.llIllIIIlIIIII[18] = (0xFFFFF767 & 0x8BFF);
        TextureUtil.llIllIIIlIIIII[19] = (0xFFFF897D & 0xF7BF);
        TextureUtil.llIllIIIlIIIII[20] = (0xFFFF997A & 0xE7BF);
        TextureUtil.llIllIIIlIIIII[21] = (0xFFFF833F & 0xFDFB);
        TextureUtil.llIllIIIlIIIII[22] = (0xFFFFBFB3 & 0xC54D);
        TextureUtil.llIllIIIlIIIII[23] = (-(0xFFFFBF65 & 0x60DE) & (0xFFFFBFEB & 0x795F));
        TextureUtil.llIllIIIlIIIII[24] = (-(0xFFFF859D & 0x7BFF) & (0xFFFFABBE & 0x7DDF));
        TextureUtil.llIllIIIlIIIII[25] = (-(0xFFFFD767 & 0x6AFD) & (0xFFFFFF6F & 0x6BF4));
        TextureUtil.llIllIIIlIIIII[26] = (0xFFFFA97B & 0x7E87);
        TextureUtil.llIllIIIlIIIII[27] = (0xFFFFFD75 & 0x2B8B);
        TextureUtil.llIllIIIlIIIII[28] = (-(0xFFFF95FB & 0x6EEF) & (0xFFFFBFFF & 0x6CEB));
        TextureUtil.llIllIIIlIIIII[29] = (-(0xFFFFCFFF & 0x7869) & (0xFFFFEFFB & 0x7F6F));
        TextureUtil.llIllIIIlIIIII[30] = (0xFFFFFFFD & 0x2603);
        TextureUtil.llIllIIIlIIIII[31] = (-(0xFFFFD47F & 0x7BFF) & (0xFFFFFAFE & 0x7D7F));
        TextureUtil.llIllIIIlIIIII[32] = (-(0xFFFFCAFF & 0x7DA5) & (0xFFFFFFB6 & 0x6FEF));
        TextureUtil.llIllIIIlIIIII[33] = (0xFFFFF7E2 & 0x2E1D);
        TextureUtil.llIllIIIlIIIII[34] = (0xB1 ^ 0xAF);
        TextureUtil.llIllIIIlIIIII[35] = (0xA9 ^ 0x92);
        TextureUtil.llIllIIIlIIIII[36] = (0xCF ^ 0xC4);
        TextureUtil.llIllIIIlIIIII[37] = (0xFC ^ 0x98);
        TextureUtil.llIllIIIlIIIII[38] = (0x25 ^ 0x63);
    }
    
    private static boolean lIIlIllIIllIllll(final Object llllllllllllIllIlIIIIIlIIIlllllI) {
        return llllllllllllIllIlIIIIIlIIIlllllI != null;
    }
    
    public static void allocateTexture(final int llllllllllllIllIlIIIIIllIIIIIlIl, final int llllllllllllIllIlIIIIIllIIIIIlII, final int llllllllllllIllIlIIIIIllIIIIIIll) {
        allocateTextureImpl(llllllllllllIllIlIIIIIllIIIIIlIl, TextureUtil.llIllIIIlIIIII[5], llllllllllllIllIlIIIIIllIIIIIlII, llllllllllllIllIlIIIIIllIIIIIIll);
    }
    
    public static int anaglyphColor(final int llllllllllllIllIlIIIIIlIIllIllIl) {
        final int llllllllllllIllIlIIIIIlIIllIllII = llllllllllllIllIlIIIIIlIIllIllIl >> TextureUtil.llIllIIIlIIIII[13] & TextureUtil.llIllIIIlIIIII[14];
        final int llllllllllllIllIlIIIIIlIIllIlIll = llllllllllllIllIlIIIIIlIIllIllIl >> TextureUtil.llIllIIIlIIIII[1] & TextureUtil.llIllIIIlIIIII[14];
        final int llllllllllllIllIlIIIIIlIIllIlIlI = llllllllllllIllIlIIIIIlIIllIllIl >> TextureUtil.llIllIIIlIIIII[4] & TextureUtil.llIllIIIlIIIII[14];
        final int llllllllllllIllIlIIIIIlIIllIlIIl = llllllllllllIllIlIIIIIlIIllIllIl & TextureUtil.llIllIIIlIIIII[14];
        final int llllllllllllIllIlIIIIIlIIllIlIII = (llllllllllllIllIlIIIIIlIIllIlIll * TextureUtil.llIllIIIlIIIII[34] + llllllllllllIllIlIIIIIlIIllIlIlI * TextureUtil.llIllIIIlIIIII[35] + llllllllllllIllIlIIIIIlIIllIlIIl * TextureUtil.llIllIIIlIIIII[36]) / TextureUtil.llIllIIIlIIIII[37];
        final int llllllllllllIllIlIIIIIlIIllIIlll = (llllllllllllIllIlIIIIIlIIllIlIll * TextureUtil.llIllIIIlIIIII[34] + llllllllllllIllIlIIIIIlIIllIlIlI * TextureUtil.llIllIIIlIIIII[38]) / TextureUtil.llIllIIIlIIIII[37];
        final int llllllllllllIllIlIIIIIlIIllIIllI = (llllllllllllIllIlIIIIIlIIllIlIll * TextureUtil.llIllIIIlIIIII[34] + llllllllllllIllIlIIIIIlIIllIlIIl * TextureUtil.llIllIIIlIIIII[38]) / TextureUtil.llIllIIIlIIIII[37];
        return llllllllllllIllIlIIIIIlIIllIllII << TextureUtil.llIllIIIlIIIII[13] | llllllllllllIllIlIIIIIlIIllIlIII << TextureUtil.llIllIIIlIIIII[1] | llllllllllllIllIlIIIIIlIIllIIlll << TextureUtil.llIllIIIlIIIII[4] | llllllllllllIllIlIIIIIlIIllIIllI;
    }
}
