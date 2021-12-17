// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.texture;

import org.apache.logging.log4j.LogManager;
import com.google.common.collect.Lists;
import net.minecraft.crash.CrashReportCategory;
import java.util.Iterator;
import net.minecraft.client.resources.IResource;
import com.google.common.collect.Maps;
import net.minecraft.client.renderer.StitcherException;
import net.minecraft.util.ReportedException;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.Callable;
import net.minecraft.crash.CrashReport;
import net.minecraft.client.resources.data.AnimationMetadataSection;
import java.io.IOException;
import net.minecraft.util.MathHelper;
import net.minecraft.client.resources.data.TextureMetadataSection;
import java.awt.image.BufferedImage;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.Logger;
import java.util.List;
import java.util.Map;

public class TextureMap extends AbstractTexture implements ITickableTextureObject
{
    private final /* synthetic */ Map<String, TextureAtlasSprite> mapUploadedSprites;
    private final /* synthetic */ TextureAtlasSprite missingImage;
    private final /* synthetic */ Map<String, TextureAtlasSprite> mapRegisteredSprites;
    private final /* synthetic */ IIconCreator iconCreator;
    private final /* synthetic */ List<TextureAtlasSprite> listAnimatedSprites;
    private static final /* synthetic */ Logger logger;
    private static final /* synthetic */ String[] llIIllIllIlIII;
    private final /* synthetic */ String basePath;
    private /* synthetic */ int mipmapLevels;
    private static final /* synthetic */ int[] llIIllIllIlIIl;
    
    private static boolean lIIIllllIIIlIlII(final Object llllllllllllIllIlllllllIIllllIlI) {
        return llllllllllllIllIlllllllIIllllIlI == null;
    }
    
    public void loadTextureAtlas(final IResourceManager llllllllllllIllIllllllllIIIllllI) {
        final int llllllllllllIllIllllllllIIIlllIl = Minecraft.getGLMaximumTextureSize();
        final Stitcher llllllllllllIllIllllllllIIIlllII = new Stitcher(llllllllllllIllIllllllllIIIlllIl, llllllllllllIllIllllllllIIIlllIl, (boolean)(TextureMap.llIIllIllIlIIl[1] != 0), TextureMap.llIIllIllIlIIl[0], this.mipmapLevels);
        this.mapUploadedSprites.clear();
        this.listAnimatedSprites.clear();
        int llllllllllllIllIllllllllIIIllIll = TextureMap.llIIllIllIlIIl[4];
        int llllllllllllIllIllllllllIIIllIlI = TextureMap.llIIllIllIlIIl[1] << this.mipmapLevels;
        final char llllllllllllIllIlllllllIllllIIlI = (char)this.mapRegisteredSprites.entrySet().iterator();
        "".length();
        if ((0xC1 ^ 0xC5) < 0) {
            return;
        }
        while (!lIIIllllIIIIllll(((Iterator)llllllllllllIllIlllllllIllllIIlI).hasNext() ? 1 : 0)) {
            final Map.Entry<String, TextureAtlasSprite> llllllllllllIllIllllllllIIIllIIl = ((Iterator<Map.Entry<String, TextureAtlasSprite>>)llllllllllllIllIlllllllIllllIIlI).next();
            final TextureAtlasSprite llllllllllllIllIllllllllIIIllIII = llllllllllllIllIllllllllIIIllIIl.getValue();
            final ResourceLocation llllllllllllIllIllllllllIIIlIlll = new ResourceLocation(llllllllllllIllIllllllllIIIllIII.getIconName());
            final ResourceLocation llllllllllllIllIllllllllIIIlIllI = this.completeResourceLocation(llllllllllllIllIllllllllIIIlIlll, TextureMap.llIIllIllIlIIl[0]);
            try {
                final IResource llllllllllllIllIllllllllIIIlIlIl = llllllllllllIllIllllllllIIIllllI.getResource(llllllllllllIllIllllllllIIIlIllI);
                final BufferedImage[] llllllllllllIllIllllllllIIIlIlII = new BufferedImage[TextureMap.llIIllIllIlIIl[1] + this.mipmapLevels];
                llllllllllllIllIllllllllIIIlIlII[TextureMap.llIIllIllIlIIl[0]] = TextureUtil.readBufferedImage(llllllllllllIllIllllllllIIIlIlIl.getInputStream());
                final TextureMetadataSection llllllllllllIllIllllllllIIIlIIll = llllllllllllIllIllllllllIIIlIlIl.getMetadata(TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[5]]);
                if (lIIIllllIIIIlllI(llllllllllllIllIllllllllIIIlIIll)) {
                    final List<Integer> llllllllllllIllIllllllllIIIlIIlI = llllllllllllIllIllllllllIIIlIIll.getListMipmaps();
                    if (lIIIllllIIIIllll(llllllllllllIllIllllllllIIIlIIlI.isEmpty() ? 1 : 0)) {
                        final int llllllllllllIllIllllllllIIIlIIIl = llllllllllllIllIllllllllIIIlIlII[TextureMap.llIIllIllIlIIl[0]].getWidth();
                        final int llllllllllllIllIllllllllIIIlIIII = llllllllllllIllIllllllllIIIlIlII[TextureMap.llIIllIllIlIIl[0]].getHeight();
                        if (!lIIIllllIIIlIIII(MathHelper.roundUpToPowerOfTwo(llllllllllllIllIllllllllIIIlIIIl), llllllllllllIllIllllllllIIIlIIIl) || lIIIllllIIIlIIIl(MathHelper.roundUpToPowerOfTwo(llllllllllllIllIllllllllIIIlIIII), llllllllllllIllIllllllllIIIlIIII)) {
                            throw new RuntimeException(TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[6]]);
                        }
                    }
                    final Iterator llllllllllllIllIllllllllIIIIllll = llllllllllllIllIllllllllIIIlIIlI.iterator();
                    "".length();
                    if (" ".length() > "   ".length()) {
                        return;
                    }
                    while (!lIIIllllIIIIllll(llllllllllllIllIllllllllIIIIllll.hasNext() ? 1 : 0)) {
                        final int llllllllllllIllIllllllllIIIIlllI = llllllllllllIllIllllllllIIIIllll.next();
                        if (lIIIllllIIIlIIlI(llllllllllllIllIllllllllIIIIlllI) && lIIIllllIIIlIIll(llllllllllllIllIllllllllIIIIlllI, llllllllllllIllIllllllllIIIlIlII.length - TextureMap.llIIllIllIlIIl[1]) && lIIIllllIIIlIlII(llllllllllllIllIllllllllIIIlIlII[llllllllllllIllIllllllllIIIIlllI])) {
                            final ResourceLocation llllllllllllIllIllllllllIIIIllIl = this.completeResourceLocation(llllllllllllIllIllllllllIIIlIlll, llllllllllllIllIllllllllIIIIlllI);
                            try {
                                llllllllllllIllIllllllllIIIlIlII[llllllllllllIllIllllllllIIIIlllI] = TextureUtil.readBufferedImage(llllllllllllIllIllllllllIIIllllI.getResource(llllllllllllIllIllllllllIIIIllIl).getInputStream());
                                "".length();
                                if (-(5 + 168 + 12 + 6 ^ 163 + 142 - 157 + 39) >= 0) {
                                    return;
                                }
                                continue;
                            }
                            catch (IOException llllllllllllIllIllllllllIIIIllII) {
                                final Logger logger = TextureMap.logger;
                                final String s = TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[7]];
                                final Object[] array = new Object[TextureMap.llIIllIllIlIIl[5]];
                                array[TextureMap.llIIllIllIlIIl[0]] = llllllllllllIllIllllllllIIIIlllI;
                                array[TextureMap.llIIllIllIlIIl[1]] = llllllllllllIllIllllllllIIIIllIl;
                                array[TextureMap.llIIllIllIlIIl[2]] = llllllllllllIllIllllllllIIIIllII;
                                logger.error(s, array);
                            }
                        }
                    }
                }
                final AnimationMetadataSection llllllllllllIllIllllllllIIIIlIll = llllllllllllIllIllllllllIIIlIlIl.getMetadata(TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[8]]);
                llllllllllllIllIllllllllIIIllIII.loadSprite(llllllllllllIllIllllllllIIIlIlII, llllllllllllIllIllllllllIIIIlIll);
                "".length();
                if (null != null) {
                    return;
                }
            }
            catch (RuntimeException llllllllllllIllIllllllllIIIIlIlI) {
                TextureMap.logger.error(String.valueOf(new StringBuilder(TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[9]]).append(llllllllllllIllIllllllllIIIlIllI)), (Throwable)llllllllllllIllIllllllllIIIIlIlI);
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
                continue;
            }
            catch (IOException llllllllllllIllIllllllllIIIIlIIl) {
                TextureMap.logger.error(String.valueOf(new StringBuilder(TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[10]]).append(llllllllllllIllIllllllllIIIlIllI)), (Throwable)llllllllllllIllIllllllllIIIIlIIl);
                "".length();
                if (null != null) {
                    return;
                }
                continue;
            }
            llllllllllllIllIllllllllIIIllIll = Math.min(llllllllllllIllIllllllllIIIllIll, Math.min(llllllllllllIllIllllllllIIIllIII.getIconWidth(), llllllllllllIllIllllllllIIIllIII.getIconHeight()));
            final int llllllllllllIllIllllllllIIIIlIII = Math.min(Integer.lowestOneBit(llllllllllllIllIllllllllIIIllIII.getIconWidth()), Integer.lowestOneBit(llllllllllllIllIllllllllIIIllIII.getIconHeight()));
            if (lIIIllllIIIlIIll(llllllllllllIllIllllllllIIIIlIII, llllllllllllIllIllllllllIIIllIlI)) {
                final Logger logger2 = TextureMap.logger;
                final String s2 = TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[11]];
                final Object[] array2 = new Object[TextureMap.llIIllIllIlIIl[7]];
                array2[TextureMap.llIIllIllIlIIl[0]] = llllllllllllIllIllllllllIIIlIllI;
                array2[TextureMap.llIIllIllIlIIl[1]] = llllllllllllIllIllllllllIIIllIII.getIconWidth();
                array2[TextureMap.llIIllIllIlIIl[2]] = llllllllllllIllIllllllllIIIllIII.getIconHeight();
                array2[TextureMap.llIIllIllIlIIl[5]] = MathHelper.calculateLogBaseTwo(llllllllllllIllIllllllllIIIllIlI);
                array2[TextureMap.llIIllIllIlIIl[6]] = MathHelper.calculateLogBaseTwo(llllllllllllIllIllllllllIIIIlIII);
                logger2.warn(s2, array2);
                llllllllllllIllIllllllllIIIllIlI = llllllllllllIllIllllllllIIIIlIII;
            }
            llllllllllllIllIllllllllIIIlllII.addSprite(llllllllllllIllIllllllllIIIllIII);
        }
        final int llllllllllllIllIllllllllIIIIIlll = Math.min(llllllllllllIllIllllllllIIIllIll, llllllllllllIllIllllllllIIIllIlI);
        final int llllllllllllIllIllllllllIIIIIllI = MathHelper.calculateLogBaseTwo(llllllllllllIllIllllllllIIIIIlll);
        if (lIIIllllIIIlIIll(llllllllllllIllIllllllllIIIIIllI, this.mipmapLevels)) {
            final Logger logger3 = TextureMap.logger;
            final String s3 = TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[12]];
            final Object[] array3 = new Object[TextureMap.llIIllIllIlIIl[6]];
            array3[TextureMap.llIIllIllIlIIl[0]] = this.basePath;
            array3[TextureMap.llIIllIllIlIIl[1]] = this.mipmapLevels;
            array3[TextureMap.llIIllIllIlIIl[2]] = llllllllllllIllIllllllllIIIIIllI;
            array3[TextureMap.llIIllIllIlIIl[5]] = llllllllllllIllIllllllllIIIIIlll;
            logger3.warn(s3, array3);
            this.mipmapLevels = llllllllllllIllIllllllllIIIIIllI;
        }
        final boolean llllllllllllIllIlllllllIllllIIII = (boolean)this.mapRegisteredSprites.values().iterator();
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIIllllIIIIllll(((Iterator)llllllllllllIllIlllllllIllllIIII).hasNext() ? 1 : 0)) {
            final TextureAtlasSprite llllllllllllIllIllllllllIIIIIlIl = ((Iterator<TextureAtlasSprite>)llllllllllllIllIlllllllIllllIIII).next();
            try {
                llllllllllllIllIllllllllIIIIIlIl.generateMipmaps(this.mipmapLevels);
                "".length();
                if ("   ".length() == " ".length()) {
                    return;
                }
                continue;
            }
            catch (Throwable llllllllllllIllIllllllllIIIIIlII) {
                final CrashReport llllllllllllIllIllllllllIIIIIIll = CrashReport.makeCrashReport(llllllllllllIllIllllllllIIIIIlII, TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[13]]);
                final CrashReportCategory llllllllllllIllIllllllllIIIIIIlI = llllllllllllIllIllllllllIIIIIIll.makeCategory(TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[14]]);
                llllllllllllIllIllllllllIIIIIIlI.addCrashSectionCallable(TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[15]], new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        return llllllllllllIllIllllllllIIIIIlIl.getIconName();
                    }
                });
                llllllllllllIllIllllllllIIIIIIlI.addCrashSectionCallable(TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[16]], new Callable<String>() {
                    private static final /* synthetic */ String[] llllllIlllIlI;
                    private static final /* synthetic */ int[] llllllIlllIll;
                    
                    private static String lIllIIIIlIIIIII(String lllllllllllllIlIlIlIIllIIllllllI, final String lllllllllllllIlIlIlIIllIIlllllIl) {
                        lllllllllllllIlIlIlIIllIIllllllI = new String(Base64.getDecoder().decode(lllllllllllllIlIlIlIIllIIllllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                        final StringBuilder lllllllllllllIlIlIlIIllIlIIIIIIl = new StringBuilder();
                        final char[] lllllllllllllIlIlIlIIllIlIIIIIII = lllllllllllllIlIlIlIIllIIlllllIl.toCharArray();
                        int lllllllllllllIlIlIlIIllIIlllllll = TextureMap$2.llllllIlllIll[0];
                        final byte lllllllllllllIlIlIlIIllIIllllIIl = (Object)lllllllllllllIlIlIlIIllIIllllllI.toCharArray();
                        final short lllllllllllllIlIlIlIIllIIllllIII = (short)lllllllllllllIlIlIlIIllIIllllIIl.length;
                        char lllllllllllllIlIlIlIIllIIlllIlll = (char)TextureMap$2.llllllIlllIll[0];
                        while (lIllIIIIlIIIIll(lllllllllllllIlIlIlIIllIIlllIlll, lllllllllllllIlIlIlIIllIIllllIII)) {
                            final char lllllllllllllIlIlIlIIllIlIIIIlII = lllllllllllllIlIlIlIIllIIllllIIl[lllllllllllllIlIlIlIIllIIlllIlll];
                            lllllllllllllIlIlIlIIllIlIIIIIIl.append((char)(lllllllllllllIlIlIlIIllIlIIIIlII ^ lllllllllllllIlIlIlIIllIlIIIIIII[lllllllllllllIlIlIlIIllIIlllllll % lllllllllllllIlIlIlIIllIlIIIIIII.length]));
                            "".length();
                            ++lllllllllllllIlIlIlIIllIIlllllll;
                            ++lllllllllllllIlIlIlIIllIIlllIlll;
                            "".length();
                            if (-"  ".length() >= 0) {
                                return null;
                            }
                        }
                        return String.valueOf(lllllllllllllIlIlIlIIllIlIIIIIIl);
                    }
                    
                    private static boolean lIllIIIIlIIIIll(final int lllllllllllllIlIlIlIIllIIlllIIll, final int lllllllllllllIlIlIlIIllIIlllIIlI) {
                        return lllllllllllllIlIlIlIIllIIlllIIll < lllllllllllllIlIlIlIIllIIlllIIlI;
                    }
                    
                    static {
                        lIllIIIIlIIIIlI();
                        lIllIIIIlIIIIIl();
                    }
                    
                    private static void lIllIIIIlIIIIIl() {
                        (llllllIlllIlI = new String[TextureMap$2.llllllIlllIll[1]])[TextureMap$2.llllllIlllIll[0]] = lIllIIIIlIIIIII("WQFL", "yykIx");
                    }
                    
                    @Override
                    public String call() throws Exception {
                        return String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllllllllIIIIIlIl.getIconWidth())).append(TextureMap$2.llllllIlllIlI[TextureMap$2.llllllIlllIll[0]]).append(llllllllllllIllIllllllllIIIIIlIl.getIconHeight()));
                    }
                    
                    private static void lIllIIIIlIIIIlI() {
                        (llllllIlllIll = new int[2])[0] = ((111 + 130 - 186 + 95 ^ 5 + 5 + 10 + 108) & (0xB4 ^ 0xA7 ^ (0xD ^ 0x8) ^ -" ".length()));
                        TextureMap$2.llllllIlllIll[1] = " ".length();
                    }
                });
                llllllllllllIllIllllllllIIIIIIlI.addCrashSectionCallable(TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[17]], new Callable<String>() {
                    private static final /* synthetic */ String[] lllIIllIIlllll;
                    private static final /* synthetic */ int[] lllIIllIlIIIII;
                    
                    private static String lIlIIIIIIlIIlIlI(final String llllllllllllIlIllllIIIIIlIIIIIlI, final String llllllllllllIlIllllIIIIIIlllllll) {
                        try {
                            final SecretKeySpec llllllllllllIlIllllIIIIIlIIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIIIIIIlllllll.getBytes(StandardCharsets.UTF_8)), TextureMap$3.lllIIllIlIIIII[2]), "DES");
                            final Cipher llllllllllllIlIllllIIIIIlIIIIlII = Cipher.getInstance("DES");
                            llllllllllllIlIllllIIIIIlIIIIlII.init(TextureMap$3.lllIIllIlIIIII[3], llllllllllllIlIllllIIIIIlIIIIlIl);
                            return new String(llllllllllllIlIllllIIIIIlIIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIIIIIlIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                        }
                        catch (Exception llllllllllllIlIllllIIIIIlIIIIIll) {
                            llllllllllllIlIllllIIIIIlIIIIIll.printStackTrace();
                            return null;
                        }
                    }
                    
                    private static void lIlIIIIIIlIIllIl() {
                        (lllIIllIlIIIII = new int[4])[0] = ((0x8E ^ 0xC3 ^ (0x90 ^ 0x8C)) & (180 + 65 - 122 + 85 ^ 77 + 77 - 63 + 38 ^ -" ".length()));
                        TextureMap$3.lllIIllIlIIIII[1] = " ".length();
                        TextureMap$3.lllIIllIlIIIII[2] = (0x80 ^ 0x88);
                        TextureMap$3.lllIIllIlIIIII[3] = "  ".length();
                    }
                    
                    private static void lIlIIIIIIlIIlIll() {
                        (lllIIllIIlllll = new String[TextureMap$3.lllIIllIlIIIII[1]])[TextureMap$3.lllIIllIlIIIII[0]] = lIlIIIIIIlIIlIlI("J4freojbzlw=", "TzJkR");
                    }
                    
                    static {
                        lIlIIIIIIlIIllIl();
                        lIlIIIIIIlIIlIll();
                    }
                    
                    @Override
                    public String call() throws Exception {
                        return String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllllllllIIIIIlIl.getFrameCount())).append(TextureMap$3.lllIIllIIlllll[TextureMap$3.lllIIllIlIIIII[0]]));
                    }
                });
                llllllllllllIllIllllllllIIIIIIlI.addCrashSection(TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[3]], this.mipmapLevels);
                throw new ReportedException(llllllllllllIllIllllllllIIIIIIll);
            }
        }
        this.missingImage.generateMipmaps(this.mipmapLevels);
        llllllllllllIllIllllllllIIIlllII.addSprite(this.missingImage);
        try {
            llllllllllllIllIllllllllIIIlllII.doStitch();
            "".length();
            if ((0x47 ^ 0x43) < ((0x57 ^ 0x51) & ~(0x70 ^ 0x76))) {
                return;
            }
        }
        catch (StitcherException llllllllllllIllIllllllllIIIIIIIl) {
            throw llllllllllllIllIllllllllIIIIIIIl;
        }
        final Logger logger4 = TextureMap.logger;
        final String s4 = TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[18]];
        final Object[] array4 = new Object[TextureMap.llIIllIllIlIIl[5]];
        array4[TextureMap.llIIllIllIlIIl[0]] = llllllllllllIllIllllllllIIIlllII.getCurrentWidth();
        array4[TextureMap.llIIllIllIlIIl[1]] = llllllllllllIllIllllllllIIIlllII.getCurrentHeight();
        array4[TextureMap.llIIllIllIlIIl[2]] = this.basePath;
        logger4.info(s4, array4);
        TextureUtil.allocateTextureImpl(this.getGlTextureId(), this.mipmapLevels, llllllllllllIllIllllllllIIIlllII.getCurrentWidth(), llllllllllllIllIllllllllIIIlllII.getCurrentHeight());
        final Map<String, TextureAtlasSprite> llllllllllllIllIllllllllIIIIIIII = (Map<String, TextureAtlasSprite>)Maps.newHashMap((Map)this.mapRegisteredSprites);
        final Iterator<TextureAtlasSprite> iterator = llllllllllllIllIllllllllIIIlllII.getStichSlots().iterator();
        "".length();
        if ((0x14 ^ 0x10) <= -" ".length()) {
            return;
        }
        while (!lIIIllllIIIIllll(iterator.hasNext() ? 1 : 0)) {
            final TextureAtlasSprite llllllllllllIllIlllllllIllllllll = iterator.next();
            final String llllllllllllIllIlllllllIlllllllI = llllllllllllIllIlllllllIllllllll.getIconName();
            llllllllllllIllIllllllllIIIIIIII.remove(llllllllllllIllIlllllllIlllllllI);
            "".length();
            this.mapUploadedSprites.put(llllllllllllIllIlllllllIlllllllI, llllllllllllIllIlllllllIllllllll);
            "".length();
            try {
                TextureUtil.uploadTextureMipmap(llllllllllllIllIlllllllIllllllll.getFrameTextureData(TextureMap.llIIllIllIlIIl[0]), llllllllllllIllIlllllllIllllllll.getIconWidth(), llllllllllllIllIlllllllIllllllll.getIconHeight(), llllllllllllIllIlllllllIllllllll.getOriginX(), llllllllllllIllIlllllllIllllllll.getOriginY(), (boolean)(TextureMap.llIIllIllIlIIl[0] != 0), (boolean)(TextureMap.llIIllIllIlIIl[0] != 0));
                "".length();
                if ("  ".length() != "  ".length()) {
                    return;
                }
            }
            catch (Throwable llllllllllllIllIlllllllIllllllIl) {
                final CrashReport llllllllllllIllIlllllllIllllllII = CrashReport.makeCrashReport(llllllllllllIllIlllllllIllllllIl, TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[19]]);
                final CrashReportCategory llllllllllllIllIlllllllIlllllIll = llllllllllllIllIlllllllIllllllII.makeCategory(TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[20]]);
                llllllllllllIllIlllllllIlllllIll.addCrashSection(TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[21]], this.basePath);
                llllllllllllIllIlllllllIlllllIll.addCrashSection(TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[22]], llllllllllllIllIlllllllIllllllll);
                throw new ReportedException(llllllllllllIllIlllllllIllllllII);
            }
            if (lIIIllllIIIlIlIl(llllllllllllIllIlllllllIllllllll.hasAnimationMetadata() ? 1 : 0)) {
                this.listAnimatedSprites.add(llllllllllllIllIlllllllIllllllll);
                "".length();
            }
        }
        final Iterator<TextureAtlasSprite> iterator2 = llllllllllllIllIllllllllIIIIIIII.values().iterator();
        "".length();
        if ("  ".length() > (0xD ^ 0x9)) {
            return;
        }
        while (!lIIIllllIIIIllll(iterator2.hasNext() ? 1 : 0)) {
            final TextureAtlasSprite llllllllllllIllIlllllllIlllllIlI = iterator2.next();
            llllllllllllIllIlllllllIlllllIlI.copyFrom(this.missingImage);
        }
    }
    
    private static boolean lIIIllllIIIlIIII(final int llllllllllllIllIlllllllIlIIIIIll, final int llllllllllllIllIlllllllIlIIIIIlI) {
        return llllllllllllIllIlllllllIlIIIIIll == llllllllllllIllIlllllllIlIIIIIlI;
    }
    
    private static void lIIIllllIIIIllII() {
        (llIIllIllIlIII = new String[TextureMap.llIIllIllIlIIl[28]])[TextureMap.llIIllIllIlIIl[0]] = lIIIllllIIIIlIIl("AyIRPToALAwh", "nKbNS");
        TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[1]] = lIIIllllIIIIlIlI("OpP8Ig0pF7Cn9dD435lUW/AhRu2FlQqzAEh8VoKsxJQ=", "DVuVv");
        TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[2]] = lIIIllllIIIIlIIl("FSwnBhAWIjoa", "xETuy");
        TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[5]] = lIIIllllIIIIlIlI("N5DqLaLT7hM=", "dqTiq");
        TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[6]] = lIIIllllIIIIlIlI("q0UD9CEZLt71tzcTIIQ/Ymzns8+17d3zHnGhbzp/875XpBb7uxDsskMiyse/k5mmfblewO8OIgYtSuGzpbwJ6zOsv7gpT3Zc", "PxVHe");
        TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[7]] = lIIIllllIIIIlIlI("9JqG+kutXQJ2Z0pSGDMkpQh1yuL34Bldxyl4ykmEWwUqoEd82lLICw==", "orcwn");
        TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[8]] = lIIIllllIIIIlIll("vErOuBakUIYdgpADTnbfaw==", "AYakG");
        TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[9]] = lIIIllllIIIIlIll("Kzq3Fnym1KBYAtrewe5N+uEp5X1PFelaOQs5yfSZiyE=", "GcETP");
        TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[10]] = lIIIllllIIIIlIll("wrDDc7o7zeKvWG2/aKoZYvcVl0ifQQKTdzHCh5BH7sLeQFHubMSB2g==", "PvcGR");
        TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[11]] = lIIIllllIIIIlIll("dI1B6RMqZNUCYgbi2mBCgv9gCcp1hviSinQJaD+PoZi/duPpjg0/vFZtIGceaM77YKgkgzRrTXgX27DLs/Sf2g==", "ftYTp");
        TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[12]] = lIIIllllIIIIlIlI("SC8A5tAsdfvsn5p2lp7lZm+xhdoqqfZiPFq41SspC/BCsleYkr0dn0MCJhhG99lyp0pplaomZMuC9zNmFjKlrd0osHvcyI9ekTm8RJyIJE4=", "yNLhg");
        TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[13]] = lIIIllllIIIIlIlI("einWuPvcIBef2glUJdk5eg==", "BkAis");
        TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[14]] = lIIIllllIIIIlIll("mgVxr/LWVEKPBJyaAxwY9Vgj7p6qYzr8", "QhHHm");
        TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[15]] = lIIIllllIIIIlIll("RemUWvDUywQcl/Mbc/6L/w==", "slHIF");
        TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[16]] = lIIIllllIIIIlIlI("2WQ7j0bOHMm59XO8ZJqohA==", "jpvoo");
        TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[17]] = lIIIllllIIIIlIll("K44qO43VUSykj+obluIsQQ==", "lezZF");
        TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[3]] = lIIIllllIIIIlIlI("eZ2wgS5wldFJS091Hx9qTw==", "mPRuJ");
        TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[18]] = lIIIllllIIIIlIIl("EQA3Mgc3FmhzCC8KKS5TKQ9/Mgc+EyE=", "RrRSs");
        TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[19]] = lIIIllllIIIIlIlI("tBD8zmsmr31A+CdqqqfyQYF/7RmvpMBN", "gbgLk");
        TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[20]] = lIIIllllIIIIlIll("JD2JAq2b/WDQ7Dzb9c+ahguTuzDGquNo3NQhxmjdMcc=", "rVIcx");
        TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[21]] = lIIIllllIIIIlIIl("DC0FNBBtKQghCw==", "MYiUc");
        TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[22]] = lIIIllllIIIIlIll("Vvkmu6AXO0o=", "cytfV");
        TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[23]] = lIIIllllIIIIlIlI("QwWtAeyHUpY=", "wQjUC");
        TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[24]] = lIIIllllIIIIlIll("3jIP2pKenz4=", "ZrMTT");
        TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[25]] = lIIIllllIIIIlIlI("oMKNxXCuxloqzSJ+nQ2rALU6GCF746Nj", "rQqRj");
        TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[26]] = lIIIllllIIIIlIll("p6V1eyuv9yA=", "yHetm");
        TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[27]] = lIIIllllIIIIlIlI("L2rZFugWWTx2LfrBUw2xlguRfLdmTk0JVwK/fpHEPbE=", "ADldV");
    }
    
    private void initMissingImage() {
        final int[] llllllllllllIllIllllllllIlIIIllI = TextureUtil.missingTextureData;
        this.missingImage.setIconWidth(TextureMap.llIIllIllIlIIl[3]);
        this.missingImage.setIconHeight(TextureMap.llIIllIllIlIIl[3]);
        final int[][] llllllllllllIllIllllllllIlIIIlIl = new int[this.mipmapLevels + TextureMap.llIIllIllIlIIl[1]][];
        llllllllllllIllIllllllllIlIIIlIl[TextureMap.llIIllIllIlIIl[0]] = llllllllllllIllIllllllllIlIIIllI;
        final TextureAtlasSprite missingImage = this.missingImage;
        final int[][][] array = new int[TextureMap.llIIllIllIlIIl[1]][][];
        array[TextureMap.llIIllIllIlIIl[0]] = llllllllllllIllIllllllllIlIIIlIl;
        missingImage.setFramesTextureData(Lists.newArrayList((Object[])array));
    }
    
    public void updateAnimations() {
        TextureUtil.bindTexture(this.getGlTextureId());
        final long llllllllllllIllIlllllllIllIIllIl = (long)this.listAnimatedSprites.iterator();
        "".length();
        if (-(0x9 ^ 0xD) > 0) {
            return;
        }
        while (!lIIIllllIIIIllll(((Iterator)llllllllllllIllIlllllllIllIIllIl).hasNext() ? 1 : 0)) {
            final TextureAtlasSprite llllllllllllIllIlllllllIllIlIIII = ((Iterator<TextureAtlasSprite>)llllllllllllIllIlllllllIllIIllIl).next();
            llllllllllllIllIlllllllIllIlIIII.updateAnimation();
        }
    }
    
    @Override
    public void tick() {
        this.updateAnimations();
    }
    
    public TextureAtlasSprite getAtlasSprite(final String llllllllllllIllIlllllllIllIlIllI) {
        TextureAtlasSprite llllllllllllIllIlllllllIllIllIII = this.mapUploadedSprites.get(llllllllllllIllIlllllllIllIlIllI);
        if (lIIIllllIIIlIlII(llllllllllllIllIlllllllIllIllIII)) {
            llllllllllllIllIlllllllIllIllIII = this.missingImage;
        }
        return llllllllllllIllIlllllllIllIllIII;
    }
    
    public TextureMap(final String llllllllllllIllIllllllllIlIlIlII) {
        this(llllllllllllIllIllllllllIlIlIlII, null);
    }
    
    private static boolean lIIIllllIIIIlllI(final Object llllllllllllIllIlllllllIIlllllII) {
        return llllllllllllIllIlllllllIIlllllII != null;
    }
    
    private ResourceLocation completeResourceLocation(final ResourceLocation llllllllllllIllIlllllllIllIlllll, final int llllllllllllIllIlllllllIlllIIIIl) {
        ResourceLocation resourceLocation;
        if (lIIIllllIIIIllll(llllllllllllIllIlllllllIlllIIIIl)) {
            final String resourceDomain;
            final String format;
            final Object[] args;
            resourceLocation = new ResourceLocation(resourceDomain, String.format(format, args));
            resourceDomain = llllllllllllIllIlllllllIllIlllll.getResourceDomain();
            format = TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[23]];
            args = new Object[TextureMap.llIIllIllIlIIl[5]];
            args[TextureMap.llIIllIllIlIIl[0]] = this.basePath;
            args[TextureMap.llIIllIllIlIIl[1]] = llllllllllllIllIlllllllIllIlllll.getResourcePath();
            args[TextureMap.llIIllIllIlIIl[2]] = TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[24]];
            "".length();
            if ("  ".length() == "   ".length()) {
                return null;
            }
        }
        else {
            final String resourceDomain2;
            final String format2;
            final Object[] args2;
            resourceLocation = new ResourceLocation(resourceDomain2, String.format(format2, args2));
            resourceDomain2 = llllllllllllIllIlllllllIllIlllll.getResourceDomain();
            format2 = TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[25]];
            args2 = new Object[TextureMap.llIIllIllIlIIl[6]];
            args2[TextureMap.llIIllIllIlIIl[0]] = this.basePath;
            args2[TextureMap.llIIllIllIlIIl[1]] = llllllllllllIllIlllllllIllIlllll.getResourcePath();
            args2[TextureMap.llIIllIllIlIIl[2]] = llllllllllllIllIlllllllIlllIIIIl;
            args2[TextureMap.llIIllIllIlIIl[5]] = TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[26]];
        }
        return resourceLocation;
    }
    
    static {
        lIIIllllIIIIllIl();
        lIIIllllIIIIllII();
        logger = LogManager.getLogger();
        LOCATION_MISSING_TEXTURE = new ResourceLocation(TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[0]]);
        locationBlocksTexture = new ResourceLocation(TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[1]]);
    }
    
    private static String lIIIllllIIIIlIIl(String llllllllllllIllIlllllllIlIlIlIII, final String llllllllllllIllIlllllllIlIlIIlll) {
        llllllllllllIllIlllllllIlIlIlIII = new String(Base64.getDecoder().decode(llllllllllllIllIlllllllIlIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlllllllIlIlIlIll = new StringBuilder();
        final char[] llllllllllllIllIlllllllIlIlIlIlI = llllllllllllIllIlllllllIlIlIIlll.toCharArray();
        int llllllllllllIllIlllllllIlIlIlIIl = TextureMap.llIIllIllIlIIl[0];
        final char llllllllllllIllIlllllllIlIlIIIll = (Object)llllllllllllIllIlllllllIlIlIlIII.toCharArray();
        final double llllllllllllIllIlllllllIlIlIIIlI = llllllllllllIllIlllllllIlIlIIIll.length;
        char llllllllllllIllIlllllllIlIlIIIIl = (char)TextureMap.llIIllIllIlIIl[0];
        while (lIIIllllIIIlIIll(llllllllllllIllIlllllllIlIlIIIIl, (int)llllllllllllIllIlllllllIlIlIIIlI)) {
            final char llllllllllllIllIlllllllIlIlIlllI = llllllllllllIllIlllllllIlIlIIIll[llllllllllllIllIlllllllIlIlIIIIl];
            llllllllllllIllIlllllllIlIlIlIll.append((char)(llllllllllllIllIlllllllIlIlIlllI ^ llllllllllllIllIlllllllIlIlIlIlI[llllllllllllIllIlllllllIlIlIlIIl % llllllllllllIllIlllllllIlIlIlIlI.length]));
            "".length();
            ++llllllllllllIllIlllllllIlIlIlIIl;
            ++llllllllllllIllIlllllllIlIlIIIIl;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlllllllIlIlIlIll);
    }
    
    public TextureAtlasSprite getMissingSprite() {
        return this.missingImage;
    }
    
    private static boolean lIIIllllIIIlIIll(final int llllllllllllIllIlllllllIIlllllll, final int llllllllllllIllIlllllllIIllllllI) {
        return llllllllllllIllIlllllllIIlllllll < llllllllllllIllIlllllllIIllllllI;
    }
    
    @Override
    public void loadTexture(final IResourceManager llllllllllllIllIllllllllIIlllllI) throws IOException {
        if (lIIIllllIIIIlllI(this.iconCreator)) {
            this.loadSprites(llllllllllllIllIllllllllIIlllllI, this.iconCreator);
        }
    }
    
    private static void lIIIllllIIIIllIl() {
        (llIIllIllIlIIl = new int[29])[0] = ((0x76 ^ 0x33 ^ (0xC3 ^ 0x90)) & (0x4C ^ 0x68 ^ (0x3B ^ 0x9) ^ -" ".length()));
        TextureMap.llIIllIllIlIIl[1] = " ".length();
        TextureMap.llIIllIllIlIIl[2] = "  ".length();
        TextureMap.llIIllIllIlIIl[3] = (0x9F ^ 0xBB ^ (0xB8 ^ 0x8C));
        TextureMap.llIIllIllIlIIl[4] = (-1 & Integer.MAX_VALUE);
        TextureMap.llIIllIllIlIIl[5] = "   ".length();
        TextureMap.llIIllIllIlIIl[6] = (0x45 ^ 0x76 ^ (0xB7 ^ 0x80));
        TextureMap.llIIllIllIlIIl[7] = (0xB6 ^ 0xB3);
        TextureMap.llIIllIllIlIIl[8] = (71 + 98 - 49 + 9 ^ 128 + 43 - 109 + 73);
        TextureMap.llIIllIllIlIIl[9] = (0x16 ^ 0x11);
        TextureMap.llIIllIllIlIIl[10] = (53 + 60 - 1 + 33 ^ 51 + 109 - 49 + 42);
        TextureMap.llIIllIllIlIIl[11] = (0x12 ^ 0x1B);
        TextureMap.llIIllIllIlIIl[12] = (0x6D ^ 0x67);
        TextureMap.llIIllIllIlIIl[13] = (0x6C ^ 0x67);
        TextureMap.llIIllIllIlIIl[14] = (0xCE ^ 0xC2);
        TextureMap.llIIllIllIlIIl[15] = (113 + 107 - 156 + 118 ^ 82 + 151 - 119 + 73);
        TextureMap.llIIllIllIlIIl[16] = (0xFB ^ 0x81 ^ (0x1A ^ 0x6E));
        TextureMap.llIIllIllIlIIl[17] = (0x4B ^ 0x7B ^ (0x70 ^ 0x4F));
        TextureMap.llIIllIllIlIIl[18] = (0x20 ^ 0x1A ^ (0x53 ^ 0x78));
        TextureMap.llIIllIllIlIIl[19] = (0x43 ^ 0x51);
        TextureMap.llIIllIllIlIIl[20] = (0xA8 ^ 0xBB);
        TextureMap.llIIllIllIlIIl[21] = (0x9D ^ 0x89);
        TextureMap.llIIllIllIlIIl[22] = (0x20 ^ 0x35);
        TextureMap.llIIllIllIlIIl[23] = (0xB4 ^ 0xA2);
        TextureMap.llIIllIllIlIIl[24] = (0x7F ^ 0x68);
        TextureMap.llIIllIllIlIIl[25] = (0xD9 ^ 0x87 ^ (0x39 ^ 0x7F));
        TextureMap.llIIllIllIlIIl[26] = (0xA ^ 0x13);
        TextureMap.llIIllIllIlIIl[27] = (0x16 ^ 0xC);
        TextureMap.llIIllIllIlIIl[28] = (0x74 ^ 0x19 ^ (0xD3 ^ 0xA5));
    }
    
    private static boolean lIIIllllIIIlIlIl(final int llllllllllllIllIlllllllIIllllIII) {
        return llllllllllllIllIlllllllIIllllIII != 0;
    }
    
    public TextureMap(final String llllllllllllIllIllllllllIlIIllll, final IIconCreator llllllllllllIllIllllllllIlIIlllI) {
        this.listAnimatedSprites = (List<TextureAtlasSprite>)Lists.newArrayList();
        this.mapRegisteredSprites = (Map<String, TextureAtlasSprite>)Maps.newHashMap();
        this.mapUploadedSprites = (Map<String, TextureAtlasSprite>)Maps.newHashMap();
        this.missingImage = new TextureAtlasSprite(TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[2]]);
        this.basePath = llllllllllllIllIllllllllIlIIllll;
        this.iconCreator = llllllllllllIllIllllllllIlIIlllI;
    }
    
    private static String lIIIllllIIIIlIll(final String llllllllllllIllIlllllllIlIIIlIIl, final String llllllllllllIllIlllllllIlIIIlIlI) {
        try {
            final SecretKeySpec llllllllllllIllIlllllllIlIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllllllIlIIIlIlI.getBytes(StandardCharsets.UTF_8)), TextureMap.llIIllIllIlIIl[10]), "DES");
            final Cipher llllllllllllIllIlllllllIlIIIllIl = Cipher.getInstance("DES");
            llllllllllllIllIlllllllIlIIIllIl.init(TextureMap.llIIllIllIlIIl[2], llllllllllllIllIlllllllIlIIIlllI);
            return new String(llllllllllllIllIlllllllIlIIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllllllIlIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllllllIlIIIllII) {
            llllllllllllIllIlllllllIlIIIllII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIllllIIIlIIIl(final int llllllllllllIllIlllllllIIlllIIIl, final int llllllllllllIllIlllllllIIlllIIII) {
        return llllllllllllIllIlllllllIIlllIIIl != llllllllllllIllIlllllllIIlllIIII;
    }
    
    public void setMipmapLevels(final int llllllllllllIllIlllllllIlIllllIl) {
        this.mipmapLevels = llllllllllllIllIlllllllIlIllllIl;
    }
    
    public void loadSprites(final IResourceManager llllllllllllIllIllllllllIIllIlII, final IIconCreator llllllllllllIllIllllllllIIllIIll) {
        this.mapRegisteredSprites.clear();
        llllllllllllIllIllllllllIIllIIll.registerSprites(this);
        this.initMissingImage();
        this.deleteGlTexture();
        this.loadTextureAtlas(llllllllllllIllIllllllllIIllIlII);
    }
    
    private static String lIIIllllIIIIlIlI(final String llllllllllllIllIlllllllIlIIllIII, final String llllllllllllIllIlllllllIlIIlIlll) {
        try {
            final SecretKeySpec llllllllllllIllIlllllllIlIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllllllIlIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlllllllIlIIllIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllIlllllllIlIIllIlI.init(TextureMap.llIIllIllIlIIl[2], llllllllllllIllIlllllllIlIIllIll);
            return new String(llllllllllllIllIlllllllIlIIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllllllIlIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllllllIlIIllIIl) {
            llllllllllllIllIlllllllIlIIllIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIllllIIIlIIlI(final int llllllllllllIllIlllllllIIlllIlII) {
        return llllllllllllIllIlllllllIIlllIlII > 0;
    }
    
    private static boolean lIIIllllIIIIllll(final int llllllllllllIllIlllllllIIlllIllI) {
        return llllllllllllIllIlllllllIIlllIllI == 0;
    }
    
    public TextureAtlasSprite registerSprite(final ResourceLocation llllllllllllIllIlllllllIllIIIlIl) {
        if (lIIIllllIIIlIlII(llllllllllllIllIlllllllIllIIIlIl)) {
            throw new IllegalArgumentException(TextureMap.llIIllIllIlIII[TextureMap.llIIllIllIlIIl[27]]);
        }
        TextureAtlasSprite llllllllllllIllIlllllllIllIIIlll = this.mapRegisteredSprites.get(llllllllllllIllIlllllllIllIIIlIl);
        if (lIIIllllIIIlIlII(llllllllllllIllIlllllllIllIIIlll)) {
            llllllllllllIllIlllllllIllIIIlll = TextureAtlasSprite.makeAtlasSprite(llllllllllllIllIlllllllIllIIIlIl);
            this.mapRegisteredSprites.put(llllllllllllIllIlllllllIllIIIlIl.toString(), llllllllllllIllIlllllllIllIIIlll);
            "".length();
        }
        return llllllllllllIllIlllllllIllIIIlll;
    }
}
