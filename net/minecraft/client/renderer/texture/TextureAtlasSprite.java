// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.texture;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.io.Serializable;
import java.util.concurrent.Callable;
import net.minecraft.crash.CrashReport;
import net.minecraft.util.ResourceLocation;
import java.io.IOException;
import java.util.Iterator;
import net.minecraft.client.resources.data.AnimationFrame;
import com.google.common.collect.Lists;
import java.awt.image.BufferedImage;
import java.util.List;
import net.minecraft.client.resources.data.AnimationMetadataSection;

public class TextureAtlasSprite
{
    private static /* synthetic */ String locationNameCompass;
    protected /* synthetic */ int height;
    private /* synthetic */ float minV;
    protected /* synthetic */ int originY;
    protected /* synthetic */ boolean rotated;
    private static /* synthetic */ String locationNameClock;
    protected /* synthetic */ int tickCounter;
    protected /* synthetic */ int frameCounter;
    protected /* synthetic */ int originX;
    private /* synthetic */ float maxU;
    private final /* synthetic */ String iconName;
    private /* synthetic */ AnimationMetadataSection animationMetadata;
    private /* synthetic */ float maxV;
    private static final /* synthetic */ int[] llIIIllllllIlI;
    private static final /* synthetic */ String[] llIIIlllllIIIl;
    private /* synthetic */ float minU;
    protected /* synthetic */ int width;
    protected /* synthetic */ int[][] interpolatedFrameData;
    protected /* synthetic */ List<int[][]> framesTextureData;
    
    public float getMinV() {
        return this.minV;
    }
    
    private static int[][] getFrameTextureData(final int[][] llllllllllllIlllIIlllIllIIIllIIl, final int llllllllllllIlllIIlllIllIIIlIIIl, final int llllllllllllIlllIIlllIllIIIlIIII, final int llllllllllllIlllIIlllIllIIIlIllI) {
        final int[][] llllllllllllIlllIIlllIllIIIlIlIl = new int[llllllllllllIlllIIlllIllIIIllIIl.length][];
        int llllllllllllIlllIIlllIllIIIlIlII = TextureAtlasSprite.llIIIllllllIlI[0];
        "".length();
        if ("  ".length() != "  ".length()) {
            return null;
        }
        while (!lIIIlIllIlIllIll(llllllllllllIlllIIlllIllIIIlIlII, llllllllllllIlllIIlllIllIIIllIIl.length)) {
            final int[] llllllllllllIlllIIlllIllIIIlIIll = llllllllllllIlllIIlllIllIIIllIIl[llllllllllllIlllIIlllIllIIIlIlII];
            if (lIIIlIllIllIIIII(llllllllllllIlllIIlllIllIIIlIIll)) {
                llllllllllllIlllIIlllIllIIIlIlIl[llllllllllllIlllIIlllIllIIIlIlII] = new int[(llllllllllllIlllIIlllIllIIIlIIIl >> llllllllllllIlllIIlllIllIIIlIlII) * (llllllllllllIlllIIlllIllIIIlIIII >> llllllllllllIlllIIlllIllIIIlIlII)];
                System.arraycopy(llllllllllllIlllIIlllIllIIIlIIll, llllllllllllIlllIIlllIllIIIlIllI * llllllllllllIlllIIlllIllIIIlIlIl[llllllllllllIlllIIlllIllIIIlIlII].length, llllllllllllIlllIIlllIllIIIlIlIl[llllllllllllIlllIIlllIllIIIlIlII], TextureAtlasSprite.llIIIllllllIlI[0], llllllllllllIlllIIlllIllIIIlIlIl[llllllllllllIlllIIlllIllIIIlIlII].length);
            }
            ++llllllllllllIlllIIlllIllIIIlIlII;
        }
        return llllllllllllIlllIIlllIllIIIlIlIl;
    }
    
    public void loadSprite(final BufferedImage[] llllllllllllIlllIIlllIllIlIIlIll, final AnimationMetadataSection llllllllllllIlllIIlllIllIlIIlIlI) throws IOException {
        this.resetSprite();
        final int llllllllllllIlllIIlllIllIlIllIII = llllllllllllIlllIIlllIllIlIIlIll[TextureAtlasSprite.llIIIllllllIlI[0]].getWidth();
        final int llllllllllllIlllIIlllIllIlIlIlll = llllllllllllIlllIIlllIllIlIIlIll[TextureAtlasSprite.llIIIllllllIlI[0]].getHeight();
        this.width = llllllllllllIlllIIlllIllIlIllIII;
        this.height = llllllllllllIlllIIlllIllIlIlIlll;
        final int[][] llllllllllllIlllIIlllIllIlIlIllI = new int[llllllllllllIlllIIlllIllIlIIlIll.length][];
        int llllllllllllIlllIIlllIllIlIlIlIl = TextureAtlasSprite.llIIIllllllIlI[0];
        "".length();
        if ((0x2E ^ 0x2B) <= 0) {
            return;
        }
        while (!lIIIlIllIlIllIll(llllllllllllIlllIIlllIllIlIlIlIl, llllllllllllIlllIIlllIllIlIIlIll.length)) {
            final BufferedImage llllllllllllIlllIIlllIllIlIlIlII = llllllllllllIlllIIlllIllIlIIlIll[llllllllllllIlllIIlllIllIlIlIlIl];
            if (lIIIlIllIllIIIII(llllllllllllIlllIIlllIllIlIlIlII)) {
                if (lIIIlIllIllIIIll(llllllllllllIlllIIlllIllIlIlIlIl) && (!lIIIlIllIllIIIlI(llllllllllllIlllIIlllIllIlIlIlII.getWidth(), llllllllllllIlllIIlllIllIlIllIII >> llllllllllllIlllIIlllIllIlIlIlIl) || lIIIlIllIlIlllIl(llllllllllllIlllIIlllIllIlIlIlII.getHeight(), llllllllllllIlllIIlllIllIlIlIlll >> llllllllllllIlllIIlllIllIlIlIlIl))) {
                    final String format = TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[8]];
                    final Object[] args = new Object[TextureAtlasSprite.llIIIllllllIlI[9]];
                    args[TextureAtlasSprite.llIIIllllllIlI[0]] = llllllllllllIlllIIlllIllIlIlIlIl;
                    args[TextureAtlasSprite.llIIIllllllIlI[1]] = llllllllllllIlllIIlllIllIlIlIlII.getWidth();
                    args[TextureAtlasSprite.llIIIllllllIlI[8]] = llllllllllllIlllIIlllIllIlIlIlII.getHeight();
                    args[TextureAtlasSprite.llIIIllllllIlI[10]] = llllllllllllIlllIIlllIllIlIllIII >> llllllllllllIlllIIlllIllIlIlIlIl;
                    args[TextureAtlasSprite.llIIIllllllIlI[11]] = llllllllllllIlllIIlllIllIlIlIlll >> llllllllllllIlllIIlllIllIlIlIlIl;
                    throw new RuntimeException(String.format(format, args));
                }
                llllllllllllIlllIIlllIllIlIlIllI[llllllllllllIlllIIlllIllIlIlIlIl] = new int[llllllllllllIlllIIlllIllIlIlIlII.getWidth() * llllllllllllIlllIIlllIllIlIlIlII.getHeight()];
                llllllllllllIlllIIlllIllIlIlIlII.getRGB(TextureAtlasSprite.llIIIllllllIlI[0], TextureAtlasSprite.llIIIllllllIlI[0], llllllllllllIlllIIlllIllIlIlIlII.getWidth(), llllllllllllIlllIIlllIllIlIlIlII.getHeight(), llllllllllllIlllIIlllIllIlIlIllI[llllllllllllIlllIIlllIllIlIlIlIl], TextureAtlasSprite.llIIIllllllIlI[0], llllllllllllIlllIIlllIllIlIlIlII.getWidth());
                "".length();
            }
            ++llllllllllllIlllIIlllIllIlIlIlIl;
        }
        if (lIIIlIllIllIIIIl(llllllllllllIlllIIlllIllIlIIlIlI)) {
            if (lIIIlIllIlIlllIl(llllllllllllIlllIIlllIllIlIlIlll, llllllllllllIlllIIlllIllIlIllIII)) {
                throw new RuntimeException(TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[10]]);
            }
            this.framesTextureData.add(llllllllllllIlllIIlllIllIlIlIllI);
            "".length();
            "".length();
            if (-(0x24 ^ 0x20) >= 0) {
                return;
            }
        }
        else {
            final int llllllllllllIlllIIlllIllIlIlIIll = llllllllllllIlllIIlllIllIlIlIlll / llllllllllllIlllIIlllIllIlIllIII;
            final int llllllllllllIlllIIlllIllIlIlIIlI = llllllllllllIlllIIlllIllIlIllIII;
            final int llllllllllllIlllIIlllIllIlIlIIIl = llllllllllllIlllIIlllIllIlIllIII;
            this.height = this.width;
            if (lIIIlIllIllIIIll(llllllllllllIlllIIlllIllIlIIlIlI.getFrameCount())) {
                final Iterator llllllllllllIlllIIlllIllIlIlIIII = llllllllllllIlllIIlllIllIlIIlIlI.getFrameIndexSet().iterator();
                "".length();
                if ("  ".length() >= (0xA5 ^ 0x81 ^ (0x24 ^ 0x4))) {
                    return;
                }
                while (!lIIIlIllIlIlllII(llllllllllllIlllIIlllIllIlIlIIII.hasNext() ? 1 : 0)) {
                    final int llllllllllllIlllIIlllIllIlIIllll = llllllllllllIlllIIlllIllIlIlIIII.next();
                    if (lIIIlIllIlIllIll(llllllllllllIlllIIlllIllIlIIllll, llllllllllllIlllIIlllIllIlIlIIll)) {
                        throw new RuntimeException(String.valueOf(new StringBuilder(TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[11]]).append(llllllllllllIlllIIlllIllIlIIllll)));
                    }
                    this.allocateFrameTextureData(llllllllllllIlllIIlllIllIlIIllll);
                    this.framesTextureData.set(llllllllllllIlllIIlllIllIlIIllll, getFrameTextureData(llllllllllllIlllIIlllIllIlIlIllI, llllllllllllIlllIIlllIllIlIlIIlI, llllllllllllIlllIIlllIllIlIlIIIl, llllllllllllIlllIIlllIllIlIIllll));
                    "".length();
                }
                this.animationMetadata = llllllllllllIlllIIlllIllIlIIlIlI;
                "".length();
                if ((0x34 ^ 0x30) != (0x84 ^ 0x80)) {
                    return;
                }
            }
            else {
                final List<AnimationFrame> llllllllllllIlllIIlllIllIlIIlllI = (List<AnimationFrame>)Lists.newArrayList();
                int llllllllllllIlllIIlllIllIlIIllIl = TextureAtlasSprite.llIIIllllllIlI[0];
                "".length();
                if (((112 + 111 - 195 + 143 ^ 62 + 70 - 59 + 65) & (0x68 ^ 0x3B ^ (0x5D ^ 0x2F) ^ -" ".length())) != 0x0) {
                    return;
                }
                while (!lIIIlIllIlIllIll(llllllllllllIlllIIlllIllIlIIllIl, llllllllllllIlllIIlllIllIlIlIIll)) {
                    this.framesTextureData.add(getFrameTextureData(llllllllllllIlllIIlllIllIlIlIllI, llllllllllllIlllIIlllIllIlIlIIlI, llllllllllllIlllIIlllIllIlIlIIIl, llllllllllllIlllIIlllIllIlIIllIl));
                    "".length();
                    llllllllllllIlllIIlllIllIlIIlllI.add(new AnimationFrame(llllllllllllIlllIIlllIllIlIIllIl, TextureAtlasSprite.llIIIllllllIlI[12]));
                    "".length();
                    ++llllllllllllIlllIIlllIllIlIIllIl;
                }
                this.animationMetadata = new AnimationMetadataSection(llllllllllllIlllIIlllIllIlIIlllI, this.width, this.height, llllllllllllIlllIIlllIllIlIIlIlI.getFrameTime(), llllllllllllIlllIIlllIllIlIIlIlI.isInterpolate());
            }
        }
    }
    
    private void resetSprite() {
        this.animationMetadata = null;
        this.setFramesTextureData(Lists.newArrayList());
        this.frameCounter = TextureAtlasSprite.llIIIllllllIlI[0];
        this.tickCounter = TextureAtlasSprite.llIIIllllllIlI[0];
    }
    
    private static boolean lIIIlIllIlIlllII(final int llllllllllllIlllIIlllIlIlIlIllII) {
        return llllllllllllIlllIIlllIlIlIlIllII == 0;
    }
    
    protected static TextureAtlasSprite makeAtlasSprite(final ResourceLocation llllllllllllIlllIIllllIIIIIIIllI) {
        final String llllllllllllIlllIIllllIIIIIIIlIl = llllllllllllIlllIIllllIIIIIIIllI.toString();
        TextureAtlasSprite textureAtlasSprite;
        if (lIIIlIllIlIllIlI(TextureAtlasSprite.locationNameClock.equals(llllllllllllIlllIIllllIIIIIIIlIl) ? 1 : 0)) {
            textureAtlasSprite = new TextureClock(llllllllllllIlllIIllllIIIIIIIlIl);
            "".length();
            if (" ".length() > "   ".length()) {
                return null;
            }
        }
        else if (lIIIlIllIlIllIlI(TextureAtlasSprite.locationNameCompass.equals(llllllllllllIlllIIllllIIIIIIIlIl) ? 1 : 0)) {
            textureAtlasSprite = new TextureCompass(llllllllllllIlllIIllllIIIIIIIlIl);
            "".length();
            if ("   ".length() > (0x58 ^ 0x5C)) {
                return null;
            }
        }
        else {
            textureAtlasSprite = new TextureAtlasSprite(llllllllllllIlllIIllllIIIIIIIlIl);
        }
        return textureAtlasSprite;
    }
    
    public void generateMipmaps(final int llllllllllllIlllIIlllIllIIlllIII) {
        final List<int[][]> llllllllllllIlllIIlllIllIIllIlll = (List<int[][]>)Lists.newArrayList();
        int llllllllllllIlllIIlllIllIIllIllI = TextureAtlasSprite.llIIIllllllIlI[0];
        "".length();
        if (((26 + 64 + 34 + 47 ^ 75 + 21 + 84 + 11) & (0x16 ^ 0x20 ^ (0x50 ^ 0x72) ^ -" ".length())) < -" ".length()) {
            return;
        }
        while (!lIIIlIllIlIllIll(llllllllllllIlllIIlllIllIIllIllI, this.framesTextureData.size())) {
            final int[][] llllllllllllIlllIIlllIllIIllIlIl = this.framesTextureData.get(llllllllllllIlllIIlllIllIIllIllI);
            if (lIIIlIllIllIIIII(llllllllllllIlllIIlllIllIIllIlIl)) {
                try {
                    llllllllllllIlllIIlllIllIIllIlll.add(TextureUtil.generateMipmapData(llllllllllllIlllIIlllIllIIlllIII, this.width, llllllllllllIlllIIlllIllIIllIlIl));
                    "".length();
                    "".length();
                    if ("  ".length() < 0) {
                        return;
                    }
                }
                catch (Throwable llllllllllllIlllIIlllIllIIllIlII) {
                    final CrashReport llllllllllllIlllIIlllIllIIllIIll = CrashReport.makeCrashReport(llllllllllllIlllIIlllIllIIllIlII, TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[9]]);
                    final CrashReportCategory llllllllllllIlllIIlllIllIIllIIlI = llllllllllllIlllIIlllIllIIllIIll.makeCategory(TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[13]]);
                    llllllllllllIlllIIlllIllIIllIIlI.addCrashSection(TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[14]], llllllllllllIlllIIlllIllIIllIllI);
                    llllllllllllIlllIIlllIllIIllIIlI.addCrashSectionCallable(TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[5]], new Callable<String>() {
                        private static final /* synthetic */ String[] llIIIIlIIlIIIl;
                        private static final /* synthetic */ int[] llIIIIllIIlIll;
                        
                        private static boolean lIIIlIIIIIllIIIl(final int llllllllllllIlllIllIlIllIIIllIll, final int llllllllllllIlllIllIlIllIIIllIlI) {
                            return llllllllllllIlllIllIlIllIIIllIll < llllllllllllIlllIllIlIllIIIllIlI;
                        }
                        
                        @Override
                        public String call() throws Exception {
                            final StringBuilder llllllllllllIlllIllIlIllIlIIIIll = new StringBuilder();
                            final int llllllllllllIlllIllIlIllIIllllII;
                            final char llllllllllllIlllIllIlIllIIllllIl = (char)((int[][])(Object)(llllllllllllIlllIllIlIllIIllllII = (int)(Object)llllllllllllIlllIIlllIllIIllIlIl)).length;
                            float llllllllllllIlllIllIlIllIIlllllI = TextureAtlasSprite$1.llIIIIllIIlIll[0];
                            "".length();
                            if (((0x30 ^ 0x66) & ~(0x35 ^ 0x63)) >= "   ".length()) {
                                return null;
                            }
                            while (!lIIIlIIIIIllIIII((int)llllllllllllIlllIllIlIllIIlllllI, llllllllllllIlllIllIlIllIIllllIl)) {
                                final int[] llllllllllllIlllIllIlIllIlIIIIlI = llllllllllllIlllIllIlIllIIllllII[llllllllllllIlllIllIlIllIIlllllI];
                                if (lIIIlIIIIIlIlllI(llllllllllllIlllIllIlIllIlIIIIll.length())) {
                                    llllllllllllIlllIllIlIllIlIIIIll.append(TextureAtlasSprite$1.llIIIIlIIlIIIl[TextureAtlasSprite$1.llIIIIllIIlIll[0]]);
                                    "".length();
                                }
                                final StringBuilder sb = llllllllllllIlllIllIlIllIlIIIIll;
                                Serializable value;
                                if (lIIIlIIIIIlIllll(llllllllllllIlllIllIlIllIlIIIIlI)) {
                                    value = TextureAtlasSprite$1.llIIIIlIIlIIIl[TextureAtlasSprite$1.llIIIIllIIlIll[1]];
                                    "".length();
                                    if (-" ".length() == "   ".length()) {
                                        return null;
                                    }
                                }
                                else {
                                    value = llllllllllllIlllIllIlIllIlIIIIlI.length;
                                }
                                sb.append(value);
                                "".length();
                                ++llllllllllllIlllIllIlIllIIlllllI;
                            }
                            return String.valueOf(llllllllllllIlllIllIlIllIlIIIIll);
                        }
                        
                        private static boolean lIIIlIIIIIllIIII(final int llllllllllllIlllIllIlIllIIIlllll, final int llllllllllllIlllIllIlIllIIIllllI) {
                            return llllllllllllIlllIllIlIllIIIlllll >= llllllllllllIlllIllIlIllIIIllllI;
                        }
                        
                        private static boolean lIIIlIIIIIlIllll(final Object llllllllllllIlllIllIlIllIIIllIII) {
                            return llllllllllllIlllIllIlIllIIIllIII == null;
                        }
                        
                        private static void lIIIlIIIIIlIllIl() {
                            (llIIIIllIIlIll = new int[3])[0] = ((0xDE ^ 0x88) & ~(0x3F ^ 0x69));
                            TextureAtlasSprite$1.llIIIIllIIlIll[1] = " ".length();
                            TextureAtlasSprite$1.llIIIIllIIlIll[2] = "  ".length();
                        }
                        
                        private static void lIIIIllllIlllIII() {
                            (llIIIIlIIlIIIl = new String[TextureAtlasSprite$1.llIIIIllIIlIll[2]])[TextureAtlasSprite$1.llIIIIllIIlIll[0]] = lIIIIllllIllIlll("ZGQ=", "HDBoI");
                            TextureAtlasSprite$1.llIIIIlIIlIIIl[TextureAtlasSprite$1.llIIIIllIIlIll[1]] = lIIIIllllIllIlll("Lzc8Ag==", "ABPni");
                        }
                        
                        private static String lIIIIllllIllIlll(String llllllllllllIlllIllIlIllIIlIllll, final String llllllllllllIlllIllIlIllIIlIlIIl) {
                            llllllllllllIlllIllIlIllIIlIllll = new String(Base64.getDecoder().decode(llllllllllllIlllIllIlIllIIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                            final StringBuilder llllllllllllIlllIllIlIllIIlIllIl = new StringBuilder();
                            final char[] llllllllllllIlllIllIlIllIIlIllII = llllllllllllIlllIllIlIllIIlIlIIl.toCharArray();
                            int llllllllllllIlllIllIlIllIIlIlIll = TextureAtlasSprite$1.llIIIIllIIlIll[0];
                            final int llllllllllllIlllIllIlIllIIlIIlIl = (Object)llllllllllllIlllIllIlIllIIlIllll.toCharArray();
                            final String llllllllllllIlllIllIlIllIIlIIlII = (String)llllllllllllIlllIllIlIllIIlIIlIl.length;
                            boolean llllllllllllIlllIllIlIllIIlIIIll = TextureAtlasSprite$1.llIIIIllIIlIll[0] != 0;
                            while (lIIIlIIIIIllIIIl(llllllllllllIlllIllIlIllIIlIIIll ? 1 : 0, (int)llllllllllllIlllIllIlIllIIlIIlII)) {
                                final char llllllllllllIlllIllIlIllIIllIIII = llllllllllllIlllIllIlIllIIlIIlIl[llllllllllllIlllIllIlIllIIlIIIll];
                                llllllllllllIlllIllIlIllIIlIllIl.append((char)(llllllllllllIlllIllIlIllIIllIIII ^ llllllllllllIlllIllIlIllIIlIllII[llllllllllllIlllIllIlIllIIlIlIll % llllllllllllIlllIllIlIllIIlIllII.length]));
                                "".length();
                                ++llllllllllllIlllIllIlIllIIlIlIll;
                                ++llllllllllllIlllIllIlIllIIlIIIll;
                                "".length();
                                if (((0x1 ^ 0x5F) & ~(0x6F ^ 0x31)) != 0x0) {
                                    return null;
                                }
                            }
                            return String.valueOf(llllllllllllIlllIllIlIllIIlIllIl);
                        }
                        
                        private static boolean lIIIlIIIIIlIlllI(final int llllllllllllIlllIllIlIllIIIlIllI) {
                            return llllllllllllIlllIllIlIllIIIlIllI > 0;
                        }
                        
                        static {
                            lIIIlIIIIIlIllIl();
                            lIIIIllllIlllIII();
                        }
                    });
                    throw new ReportedException(llllllllllllIlllIIlllIllIIllIIll);
                }
            }
            ++llllllllllllIlllIIlllIllIIllIllI;
        }
        this.setFramesTextureData(llllllllllllIlllIIlllIllIIllIlll);
    }
    
    private static boolean lIIIlIllIllIIIIl(final Object llllllllllllIlllIIlllIlIlIllIIII) {
        return llllllllllllIlllIIlllIlIlIllIIII == null;
    }
    
    private static boolean lIIIlIllIlIllIll(final int llllllllllllIlllIIlllIlIllIIIIIl, final int llllllllllllIlllIIlllIlIllIIIIII) {
        return llllllllllllIlllIIlllIlIllIIIIIl >= llllllllllllIlllIIlllIlIllIIIIII;
    }
    
    public int getFrameCount() {
        return this.framesTextureData.size();
    }
    
    private static boolean lIIIlIllIllIIlII(final int llllllllllllIlllIIlllIlIlIlllIIl, final int llllllllllllIlllIIlllIlIlIlllIII) {
        return llllllllllllIlllIIlllIlIlIlllIIl <= llllllllllllIlllIIlllIlIlIlllIII;
    }
    
    public void updateAnimation() {
        this.tickCounter += TextureAtlasSprite.llIIIllllllIlI[1];
        if (lIIIlIllIlIllIll(this.tickCounter, this.animationMetadata.getFrameTimeSingle(this.frameCounter))) {
            final int llllllllllllIlllIIlllIlllIlIllII = this.animationMetadata.getFrameIndex(this.frameCounter);
            int n;
            if (lIIIlIllIlIlllII(this.animationMetadata.getFrameCount())) {
                n = this.framesTextureData.size();
                "".length();
                if ((0x39 ^ 0x5F ^ (0xB ^ 0x69)) == -" ".length()) {
                    return;
                }
            }
            else {
                n = this.animationMetadata.getFrameCount();
            }
            final int llllllllllllIlllIIlllIlllIlIlIll = n;
            this.frameCounter = (this.frameCounter + TextureAtlasSprite.llIIIllllllIlI[1]) % llllllllllllIlllIIlllIlllIlIlIll;
            this.tickCounter = TextureAtlasSprite.llIIIllllllIlI[0];
            final int llllllllllllIlllIIlllIlllIlIlIlI = this.animationMetadata.getFrameIndex(this.frameCounter);
            if (lIIIlIllIlIlllIl(llllllllllllIlllIIlllIlllIlIllII, llllllllllllIlllIIlllIlllIlIlIlI) && lIIIlIllIlIllllI(llllllllllllIlllIIlllIlllIlIlIlI) && lIIIlIllIlIlllll(llllllllllllIlllIIlllIlllIlIlIlI, this.framesTextureData.size())) {
                TextureUtil.uploadTextureMipmap(this.framesTextureData.get(llllllllllllIlllIIlllIlllIlIlIlI), this.width, this.height, this.originX, this.originY, (boolean)(TextureAtlasSprite.llIIIllllllIlI[0] != 0), (boolean)(TextureAtlasSprite.llIIIllllllIlI[0] != 0));
                "".length();
                if ((0xA ^ 0x29 ^ (0x31 ^ 0x16)) == 0x0) {
                    return;
                }
            }
        }
        else if (lIIIlIllIlIllIlI(this.animationMetadata.isInterpolate() ? 1 : 0)) {
            this.updateAnimationInterpolated();
        }
    }
    
    public void setIconWidth(final int llllllllllllIlllIIlllIllIllIllll) {
        this.width = llllllllllllIlllIIlllIllIllIllll;
    }
    
    private static boolean lIIIlIllIlIlllll(final int llllllllllllIlllIIlllIlIlIllllIl, final int llllllllllllIlllIIlllIlIlIllllII) {
        return llllllllllllIlllIIlllIlIlIllllIl < llllllllllllIlllIIlllIlIlIllllII;
    }
    
    public int[][] getFrameTextureData(final int llllllllllllIlllIIlllIllIllllIII) {
        return this.framesTextureData.get(llllllllllllIlllIIlllIllIllllIII);
    }
    
    private static boolean lIIIlIllIllIIIlI(final int llllllllllllIlllIIlllIlIllIIIlIl, final int llllllllllllIlllIIlllIlIllIIIlII) {
        return llllllllllllIlllIIlllIlIllIIIlIl == llllllllllllIlllIIlllIlIllIIIlII;
    }
    
    public float getMaxV() {
        return this.maxV;
    }
    
    public float getMaxU() {
        return this.maxU;
    }
    
    private static boolean lIIIlIllIllIIIll(final int llllllllllllIlllIIlllIlIlIlIlIII) {
        return llllllllllllIlllIIlllIlIlIlIlIII > 0;
    }
    
    private static boolean lIIIlIllIllIIllI(final int llllllllllllIlllIIlllIlIlIllIlIl, final int llllllllllllIlllIIlllIlIlIllIlII) {
        return llllllllllllIlllIIlllIlIlIllIlIl > llllllllllllIlllIIlllIlIlIllIlII;
    }
    
    public void clearFramesTextureData() {
        this.framesTextureData.clear();
    }
    
    public void setFramesTextureData(final List<int[][]> llllllllllllIlllIIlllIllIIIIIIII) {
        this.framesTextureData = llllllllllllIlllIIlllIllIIIIIIII;
    }
    
    public static void setLocationNameCompass(final String llllllllllllIlllIIlllIllllllllIl) {
        TextureAtlasSprite.locationNameCompass = llllllllllllIlllIIlllIllllllllIl;
    }
    
    protected TextureAtlasSprite(final String llllllllllllIlllIIllllIIIIIIlIIl) {
        this.framesTextureData = (List<int[][]>)Lists.newArrayList();
        this.iconName = llllllllllllIlllIIllllIIIIIIlIIl;
    }
    
    public float getInterpolatedV(final double llllllllllllIlllIIlllIlllIlllIIl) {
        final float llllllllllllIlllIIlllIlllIlllIII = this.maxV - this.minV;
        return this.minV + llllllllllllIlllIIlllIlllIlllIII * ((float)llllllllllllIlllIIlllIlllIlllIIl / 16.0f);
    }
    
    private static boolean lIIIlIllIllIIIII(final Object llllllllllllIlllIIlllIlIlIllIIlI) {
        return llllllllllllIlllIIlllIlIlIllIIlI != null;
    }
    
    public static void setLocationNameClock(final String llllllllllllIlllIIllllIIIIIIIIIl) {
        TextureAtlasSprite.locationNameClock = llllllllllllIlllIIllllIIIIIIIIIl;
    }
    
    private static String lIIIlIllIlIIIIlI(String llllllllllllIlllIIlllIlIllIlIIII, final String llllllllllllIlllIIlllIlIllIIllll) {
        llllllllllllIlllIIlllIlIllIlIIII = new String(Base64.getDecoder().decode(llllllllllllIlllIIlllIlIllIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIlllIlIllIlIIll = new StringBuilder();
        final char[] llllllllllllIlllIIlllIlIllIlIIlI = llllllllllllIlllIIlllIlIllIIllll.toCharArray();
        int llllllllllllIlllIIlllIlIllIlIIIl = TextureAtlasSprite.llIIIllllllIlI[0];
        final boolean llllllllllllIlllIIlllIlIllIIlIll = (Object)llllllllllllIlllIIlllIlIllIlIIII.toCharArray();
        final double llllllllllllIlllIIlllIlIllIIlIlI = llllllllllllIlllIIlllIlIllIIlIll.length;
        float llllllllllllIlllIIlllIlIllIIlIIl = TextureAtlasSprite.llIIIllllllIlI[0];
        while (lIIIlIllIlIlllll((int)llllllllllllIlllIIlllIlIllIIlIIl, (int)llllllllllllIlllIIlllIlIllIIlIlI)) {
            final char llllllllllllIlllIIlllIlIllIlIllI = llllllllllllIlllIIlllIlIllIIlIll[llllllllllllIlllIIlllIlIllIIlIIl];
            llllllllllllIlllIIlllIlIllIlIIll.append((char)(llllllllllllIlllIIlllIlIllIlIllI ^ llllllllllllIlllIIlllIlIllIlIIlI[llllllllllllIlllIIlllIlIllIlIIIl % llllllllllllIlllIIlllIlIllIlIIlI.length]));
            "".length();
            ++llllllllllllIlllIIlllIlIllIlIIIl;
            ++llllllllllllIlllIIlllIlIllIIlIIl;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIlllIlIllIlIIll);
    }
    
    private static boolean lIIIlIllIlIlllIl(final int llllllllllllIlllIIlllIlIlIlIIlIl, final int llllllllllllIlllIIlllIlIlIlIIlII) {
        return llllllllllllIlllIIlllIlIlIlIIlIl != llllllllllllIlllIIlllIlIlIlIIlII;
    }
    
    private static void lIIIlIllIlIIllll() {
        (llIIIlllllIIIl = new String[TextureAtlasSprite.llIIIllllllIlI[27]])[TextureAtlasSprite.llIIIllllllIlI[0]] = lIIIlIllIlIIIIlI("BjoMBhANIUoJCAssDg==", "dOejd");
        TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[1]] = lIIIlIllIlIIIIll("Qb4Qbs/42w4qixShVyZ3tw==", "Fgqfo");
        TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[8]] = lIIIlIllIlIIIlII("S+x1eV92njbhFmad4hvCaAT7jM3n2M+TatSsDqlEeeiTnMk95amM1MEB7EyvfZ9JUoVAdeMSOLiFeJSz9Z8nGTNKrSi9Cn2n", "eSIng");
        TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[10]] = lIIIlIllIlIIIIll("PMi1P+CigPwWUAw1D8Ad6eegSOJ1igHh76BOmql5ogDXUalZl6UZ6YVvs9fPoRRF", "qYxyV");
        TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[11]] = lIIIlIllIlIIIIll("cNxiGQqkrmaSbW5qKtpmz8nxpVb241By", "vfFvD");
        TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[9]] = lIIIlIllIlIIIIll("01LkRnTG3m62GWgleOEYCwSpkQ9dDqAZzUaWtb3atfY=", "VVrCi");
        TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[13]] = lIIIlIllIlIIIlII("QBDuLm7LDmVbqbL9V+veHLFT++tbIy72", "etlOu");
        TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[14]] = lIIIlIllIlIIIlII("cPut4W7ZTh27I80EsPje/Q==", "zcrpV");
        TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[5]] = lIIIlIllIlIIIIlI("EB8XOBF2Hh8vESU=", "VmvUt");
        TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[15]] = lIIIlIllIlIIIIlI("HRYcLDs7FiUsIigANyg8IAcBIyAoHgFlaQ==", "IsdXN");
        TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[17]] = lIIIlIllIlIIIIll("l6seA+hbinlBau6NqzkN2A==", "SCUUo");
        TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[18]] = lIIIlIllIlIIIlII("GLQp+Mrr6V0ntBpowevmyg==", "AMprP");
        TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[19]] = lIIIlIllIlIIIIll("BNwpn66ywwo=", "ZIIZS");
        TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[20]] = lIIIlIllIlIIIIlI("ZWMAWg==", "ICygE");
        TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[21]] = lIIIlIllIlIIIIll("n3gBCWRvfTued7xbXpsu5g==", "OOmlv");
        TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[22]] = lIIIlIllIlIIIIlI("R0shMwkfA2s=", "kkVZm");
        TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[3]] = lIIIlIllIlIIIIlI("YWEkeXQ=", "MAQII");
        TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[23]] = lIIIlIllIlIIIIlI("b3I3Xms=", "CRBoV");
        TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[24]] = lIIIlIllIlIIIIll("k46tAemWjE0=", "IZREy");
        TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[25]] = lIIIlIllIlIIIIlI("fXEwU1o=", "QQFbg");
    }
    
    private static boolean lIIIlIllIlIllllI(final int llllllllllllIlllIIlllIlIlIlIlIlI) {
        return llllllllllllIlllIIlllIlIlIlIlIlI >= 0;
    }
    
    public int getIconHeight() {
        return this.height;
    }
    
    private void allocateFrameTextureData(final int llllllllllllIlllIIlllIllIIlIIlIl) {
        if (lIIIlIllIllIIlII(this.framesTextureData.size(), llllllllllllIlllIIlllIllIIlIIlIl)) {
            int llllllllllllIlllIIlllIllIIlIIlII = this.framesTextureData.size();
            "".length();
            if (" ".length() == 0) {
                return;
            }
            while (!lIIIlIllIllIIllI(llllllllllllIlllIIlllIllIIlIIlII, llllllllllllIlllIIlllIllIIlIIlIl)) {
                this.framesTextureData.add(null);
                "".length();
                ++llllllllllllIlllIIlllIllIIlIIlII;
            }
        }
    }
    
    private static boolean lIIIlIllIlIllIlI(final int llllllllllllIlllIIlllIlIlIlIlllI) {
        return llllllllllllIlllIIlllIlIlIlIlllI != 0;
    }
    
    public float getMinU() {
        return this.minU;
    }
    
    public int getIconWidth() {
        return this.width;
    }
    
    public String getIconName() {
        return this.iconName;
    }
    
    static {
        lIIIlIllIlIllIIl();
        lIIIlIllIlIIllll();
        TextureAtlasSprite.locationNameClock = TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[0]];
        TextureAtlasSprite.locationNameCompass = TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[1]];
    }
    
    public int getOriginY() {
        return this.originY;
    }
    
    private static void lIIIlIllIlIllIIl() {
        (llIIIllllllIlI = new int[28])[0] = ((0xE ^ 0x33 ^ (0x37 ^ 0x31)) & (31 + 249 - 131 + 105 ^ 133 + 144 - 126 + 46 ^ -" ".length()));
        TextureAtlasSprite.llIIIllllllIlI[1] = " ".length();
        TextureAtlasSprite.llIIIllllllIlI[2] = (-(0xFFFFAE3F & 0x7FF7) & (0xFFFFAEB6 & 0xFF7F7F));
        TextureAtlasSprite.llIIIllllllIlI[3] = (0x98 ^ 0x88);
        TextureAtlasSprite.llIIIllllllIlI[4] = (-(25 + 14 - 30 + 139) & (-1 & 0xFF93));
        TextureAtlasSprite.llIIIllllllIlI[5] = (0x37 ^ 0x3F);
        TextureAtlasSprite.llIIIllllllIlI[6] = 166 + 196 - 258 + 115 + (173 + 95 - 66 + 40) - (0xFFFFBD6D & 0x43DA) + (0xE5 ^ 0x9F);
        TextureAtlasSprite.llIIIllllllIlI[7] = -(-(0xFFFFDFEB & 0x79FF) & (0xFFFFD9EA & 0x1007FFF));
        TextureAtlasSprite.llIIIllllllIlI[8] = "  ".length();
        TextureAtlasSprite.llIIIllllllIlI[9] = (0x0 ^ 0x4 ^ " ".length());
        TextureAtlasSprite.llIIIllllllIlI[10] = "   ".length();
        TextureAtlasSprite.llIIIllllllIlI[11] = (0x50 ^ 0x54);
        TextureAtlasSprite.llIIIllllllIlI[12] = -" ".length();
        TextureAtlasSprite.llIIIllllllIlI[13] = (0x8C ^ 0x8A);
        TextureAtlasSprite.llIIIllllllIlI[14] = (144 + 128 - 142 + 24 ^ 99 + 99 - 145 + 104);
        TextureAtlasSprite.llIIIllllllIlI[15] = (0x7B ^ 0x72);
        TextureAtlasSprite.llIIIllllllIlI[16] = (96 + 92 - 75 + 42 ^ 60 + 10 + 94 + 24);
        TextureAtlasSprite.llIIIllllllIlI[17] = (0xA1 ^ 0xAB);
        TextureAtlasSprite.llIIIllllllIlI[18] = (0x32 ^ 0x39);
        TextureAtlasSprite.llIIIllllllIlI[19] = (0xB8 ^ 0xB4);
        TextureAtlasSprite.llIIIllllllIlI[20] = (0x72 ^ 0x7F);
        TextureAtlasSprite.llIIIllllllIlI[21] = (127 + 159 - 132 + 50 ^ 45 + 156 - 84 + 77);
        TextureAtlasSprite.llIIIllllllIlI[22] = (0xAC ^ 0xB2 ^ (0x4A ^ 0x5B));
        TextureAtlasSprite.llIIIllllllIlI[23] = (0xAC ^ 0xBD);
        TextureAtlasSprite.llIIIllllllIlI[24] = (145 + 24 - 27 + 13 ^ 110 + 26 - 92 + 93);
        TextureAtlasSprite.llIIIllllllIlI[25] = (1 + 140 - 16 + 38 ^ 153 + 117 - 117 + 23);
        TextureAtlasSprite.llIIIllllllIlI[26] = (32 + 80 - 83 + 218 ^ 49 + 39 + 23 + 27);
        TextureAtlasSprite.llIIIllllllIlI[27] = (0x12 ^ 0x6);
    }
    
    public void copyFrom(final TextureAtlasSprite llllllllllllIlllIIlllIllllIlllll) {
        this.originX = llllllllllllIlllIIlllIllllIlllll.originX;
        this.originY = llllllllllllIlllIIlllIllllIlllll.originY;
        this.width = llllllllllllIlllIIlllIllllIlllll.width;
        this.height = llllllllllllIlllIIlllIllllIlllll.height;
        this.rotated = llllllllllllIlllIIlllIllllIlllll.rotated;
        this.minU = llllllllllllIlllIIlllIllllIlllll.minU;
        this.maxU = llllllllllllIlllIIlllIllllIlllll.maxU;
        this.minV = llllllllllllIlllIIlllIllllIlllll.minV;
        this.maxV = llllllllllllIlllIIlllIllllIlllll.maxV;
    }
    
    public void setIconHeight(final int llllllllllllIlllIIlllIllIllIlIIl) {
        this.height = llllllllllllIlllIIlllIllIllIlIIl;
    }
    
    public float getInterpolatedU(final double llllllllllllIlllIIlllIllllIIlIII) {
        final float llllllllllllIlllIIlllIllllIIIlll = this.maxU - this.minU;
        return this.minU + llllllllllllIlllIIlllIllllIIIlll * (float)llllllllllllIlllIIlllIllllIIlIII / 16.0f;
    }
    
    private static String lIIIlIllIlIIIIll(final String llllllllllllIlllIIlllIlIllllIIII, final String llllllllllllIlllIIlllIlIllllIIIl) {
        try {
            final SecretKeySpec llllllllllllIlllIIlllIlIllllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlllIlIllllIIIl.getBytes(StandardCharsets.UTF_8)), TextureAtlasSprite.llIIIllllllIlI[5]), "DES");
            final Cipher llllllllllllIlllIIlllIlIllllIlII = Cipher.getInstance("DES");
            llllllllllllIlllIIlllIlIllllIlII.init(TextureAtlasSprite.llIIIllllllIlI[8], llllllllllllIlllIIlllIlIllllIlIl);
            return new String(llllllllllllIlllIIlllIlIllllIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlllIlIllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIlllIlIllllIIll) {
            llllllllllllIlllIIlllIlIllllIIll.printStackTrace();
            return null;
        }
    }
    
    public int getOriginX() {
        return this.originX;
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder(TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[15]]).append(this.iconName).append((char)TextureAtlasSprite.llIIIllllllIlI[16]).append(TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[17]]).append(this.framesTextureData.size()).append(TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[18]]).append(this.rotated).append(TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[19]]).append(this.originX).append(TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[20]]).append(this.originY).append(TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[21]]).append(this.height).append(TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[22]]).append(this.width).append(TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[3]]).append(this.minU).append(TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[23]]).append(this.maxU).append(TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[24]]).append(this.minV).append(TextureAtlasSprite.llIIIlllllIIIl[TextureAtlasSprite.llIIIllllllIlI[25]]).append(this.maxV).append((char)TextureAtlasSprite.llIIIllllllIlI[26]));
    }
    
    private static String lIIIlIllIlIIIlII(final String llllllllllllIlllIIlllIlIlllIIlIl, final String llllllllllllIlllIIlllIlIlllIIIlI) {
        try {
            final SecretKeySpec llllllllllllIlllIIlllIlIlllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlllIlIlllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIlllIlIlllIIlll = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIlllIlIlllIIlll.init(TextureAtlasSprite.llIIIllllllIlI[8], llllllllllllIlllIIlllIlIlllIlIII);
            return new String(llllllllllllIlllIIlllIlIlllIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlllIlIlllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIlllIlIlllIIllI) {
            llllllllllllIlllIIlllIlIlllIIllI.printStackTrace();
            return null;
        }
    }
    
    public void initSprite(final int llllllllllllIlllIIlllIlllllIlIll, final int llllllllllllIlllIIlllIlllllIlIlI, final int llllllllllllIlllIIlllIlllllIlIIl, final int llllllllllllIlllIIlllIllllllIIII, final boolean llllllllllllIlllIIlllIlllllIIlll) {
        this.originX = llllllllllllIlllIIlllIlllllIlIIl;
        this.originY = llllllllllllIlllIIlllIllllllIIII;
        this.rotated = llllllllllllIlllIIlllIlllllIIlll;
        final float llllllllllllIlllIIlllIlllllIlllI = (float)(0.009999999776482582 / llllllllllllIlllIIlllIlllllIlIll);
        final float llllllllllllIlllIIlllIlllllIllIl = (float)(0.009999999776482582 / llllllllllllIlllIIlllIlllllIlIlI);
        this.minU = llllllllllllIlllIIlllIlllllIlIIl / (float)llllllllllllIlllIIlllIlllllIlIll + llllllllllllIlllIIlllIlllllIlllI;
        this.maxU = (llllllllllllIlllIIlllIlllllIlIIl + this.width) / (float)llllllllllllIlllIIlllIlllllIlIll - llllllllllllIlllIIlllIlllllIlllI;
        this.minV = llllllllllllIlllIIlllIllllllIIII / (float)llllllllllllIlllIIlllIlllllIlIlI + llllllllllllIlllIIlllIlllllIllIl;
        this.maxV = (llllllllllllIlllIIlllIllllllIIII + this.height) / (float)llllllllllllIlllIIlllIlllllIlIlI - llllllllllllIlllIIlllIlllllIllIl;
    }
    
    public boolean hasAnimationMetadata() {
        if (lIIIlIllIllIIIII(this.animationMetadata)) {
            return TextureAtlasSprite.llIIIllllllIlI[1] != 0;
        }
        return TextureAtlasSprite.llIIIllllllIlI[0] != 0;
    }
    
    private void updateAnimationInterpolated() {
        final double llllllllllllIlllIIlllIlllIIlIllI = 1.0 - this.tickCounter / (double)this.animationMetadata.getFrameTimeSingle(this.frameCounter);
        final int llllllllllllIlllIIlllIlllIIlIlIl = this.animationMetadata.getFrameIndex(this.frameCounter);
        int n;
        if (lIIIlIllIlIlllII(this.animationMetadata.getFrameCount())) {
            n = this.framesTextureData.size();
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            n = this.animationMetadata.getFrameCount();
        }
        final int llllllllllllIlllIIlllIlllIIlIlII = n;
        final int llllllllllllIlllIIlllIlllIIlIIll = this.animationMetadata.getFrameIndex((this.frameCounter + TextureAtlasSprite.llIIIllllllIlI[1]) % llllllllllllIlllIIlllIlllIIlIlII);
        if (lIIIlIllIlIlllIl(llllllllllllIlllIIlllIlllIIlIlIl, llllllllllllIlllIIlllIlllIIlIIll) && lIIIlIllIlIllllI(llllllllllllIlllIIlllIlllIIlIIll) && lIIIlIllIlIlllll(llllllllllllIlllIIlllIlllIIlIIll, this.framesTextureData.size())) {
            final int[][] llllllllllllIlllIIlllIlllIIlIIlI = this.framesTextureData.get(llllllllllllIlllIIlllIlllIIlIlIl);
            final int[][] llllllllllllIlllIIlllIlllIIlIIIl = this.framesTextureData.get(llllllllllllIlllIIlllIlllIIlIIll);
            if (!lIIIlIllIllIIIII(this.interpolatedFrameData) || lIIIlIllIlIlllIl(this.interpolatedFrameData.length, llllllllllllIlllIIlllIlllIIlIIlI.length)) {
                this.interpolatedFrameData = new int[llllllllllllIlllIIlllIlllIIlIIlI.length][];
            }
            int llllllllllllIlllIIlllIlllIIlIIII = TextureAtlasSprite.llIIIllllllIlI[0];
            "".length();
            if ("  ".length() <= " ".length()) {
                return;
            }
            while (!lIIIlIllIlIllIll(llllllllllllIlllIIlllIlllIIlIIII, llllllllllllIlllIIlllIlllIIlIIlI.length)) {
                if (lIIIlIllIllIIIIl(this.interpolatedFrameData[llllllllllllIlllIIlllIlllIIlIIII])) {
                    this.interpolatedFrameData[llllllllllllIlllIIlllIlllIIlIIII] = new int[llllllllllllIlllIIlllIlllIIlIIlI[llllllllllllIlllIIlllIlllIIlIIII].length];
                }
                if (lIIIlIllIlIlllll(llllllllllllIlllIIlllIlllIIlIIII, llllllllllllIlllIIlllIlllIIlIIIl.length) && lIIIlIllIllIIIlI(llllllllllllIlllIIlllIlllIIlIIIl[llllllllllllIlllIIlllIlllIIlIIII].length, llllllllllllIlllIIlllIlllIIlIIlI[llllllllllllIlllIIlllIlllIIlIIII].length)) {
                    int llllllllllllIlllIIlllIlllIIIllll = TextureAtlasSprite.llIIIllllllIlI[0];
                    "".length();
                    if (((217 + 60 - 88 + 34 ^ 18 + 101 - 13 + 36) & (0xD1 ^ 0xC6 ^ (0x7E ^ 0x38) ^ -" ".length())) != ((0xFD ^ 0x95 ^ (0xE2 ^ 0xAA)) & (0xE0 ^ 0xA2 ^ (0x7 ^ 0x65) ^ -" ".length()))) {
                        return;
                    }
                    while (!lIIIlIllIlIllIll(llllllllllllIlllIIlllIlllIIIllll, llllllllllllIlllIIlllIlllIIlIIlI[llllllllllllIlllIIlllIlllIIlIIII].length)) {
                        final int llllllllllllIlllIIlllIlllIIIlllI = llllllllllllIlllIIlllIlllIIlIIlI[llllllllllllIlllIIlllIlllIIlIIII][llllllllllllIlllIIlllIlllIIIllll];
                        final int llllllllllllIlllIIlllIlllIIIllIl = llllllllllllIlllIIlllIlllIIlIIIl[llllllllllllIlllIIlllIlllIIlIIII][llllllllllllIlllIIlllIlllIIIllll];
                        final int llllllllllllIlllIIlllIlllIIIllII = (int)(((llllllllllllIlllIIlllIlllIIIlllI & TextureAtlasSprite.llIIIllllllIlI[2]) >> TextureAtlasSprite.llIIIllllllIlI[3]) * llllllllllllIlllIIlllIlllIIlIllI + ((llllllllllllIlllIIlllIlllIIIllIl & TextureAtlasSprite.llIIIllllllIlI[2]) >> TextureAtlasSprite.llIIIllllllIlI[3]) * (1.0 - llllllllllllIlllIIlllIlllIIlIllI));
                        final int llllllllllllIlllIIlllIlllIIIlIll = (int)(((llllllllllllIlllIIlllIlllIIIlllI & TextureAtlasSprite.llIIIllllllIlI[4]) >> TextureAtlasSprite.llIIIllllllIlI[5]) * llllllllllllIlllIIlllIlllIIlIllI + ((llllllllllllIlllIIlllIlllIIIllIl & TextureAtlasSprite.llIIIllllllIlI[4]) >> TextureAtlasSprite.llIIIllllllIlI[5]) * (1.0 - llllllllllllIlllIIlllIlllIIlIllI));
                        final int llllllllllllIlllIIlllIlllIIIlIlI = (int)((llllllllllllIlllIIlllIlllIIIlllI & TextureAtlasSprite.llIIIllllllIlI[6]) * llllllllllllIlllIIlllIlllIIlIllI + (llllllllllllIlllIIlllIlllIIIllIl & TextureAtlasSprite.llIIIllllllIlI[6]) * (1.0 - llllllllllllIlllIIlllIlllIIlIllI));
                        this.interpolatedFrameData[llllllllllllIlllIIlllIlllIIlIIII][llllllllllllIlllIIlllIlllIIIllll] = ((llllllllllllIlllIIlllIlllIIIlllI & TextureAtlasSprite.llIIIllllllIlI[7]) | llllllllllllIlllIIlllIlllIIIllII << TextureAtlasSprite.llIIIllllllIlI[3] | llllllllllllIlllIIlllIlllIIIlIll << TextureAtlasSprite.llIIIllllllIlI[5] | llllllllllllIlllIIlllIlllIIIlIlI);
                        ++llllllllllllIlllIIlllIlllIIIllll;
                    }
                }
                ++llllllllllllIlllIIlllIlllIIlIIII;
            }
            TextureUtil.uploadTextureMipmap(this.interpolatedFrameData, this.width, this.height, this.originX, this.originY, (boolean)(TextureAtlasSprite.llIIIllllllIlI[0] != 0), (boolean)(TextureAtlasSprite.llIIIllllllIlI[0] != 0));
        }
    }
}
