// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import java.io.IOException;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import net.minecraft.client.Minecraft;
import java.net.URL;
import java.net.HttpURLConnection;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.renderer.texture.TextureUtil;
import java.io.File;
import java.awt.image.BufferedImage;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.Logger;
import net.minecraft.client.renderer.texture.SimpleTexture;

public class ThreadDownloadImageData extends SimpleTexture
{
    private final /* synthetic */ String imageUrl;
    private static final /* synthetic */ Logger logger;
    private final /* synthetic */ IImageBuffer imageBuffer;
    private static final /* synthetic */ AtomicInteger threadDownloadCounter;
    private /* synthetic */ BufferedImage bufferedImage;
    private final /* synthetic */ File cacheFile;
    private static final /* synthetic */ String[] lIllllIlIlIlll;
    private /* synthetic */ boolean textureUploaded;
    private static final /* synthetic */ int[] lIllllIlIllIII;
    private /* synthetic */ Thread imageThread;
    
    private static boolean lIIIIlIIlIlIIIll(final int llllllllllllIllllIlIIlIIIlIIllII) {
        return llllllllllllIllllIlIIlIIIlIIllII != 0;
    }
    
    private void checkTextureUploaded() {
        if (lIIIIlIIlIlIIIII(this.textureUploaded ? 1 : 0) && lIIIIlIIlIlIIIIl(this.bufferedImage)) {
            if (lIIIIlIIlIlIIIIl(this.textureLocation)) {
                this.deleteGlTexture();
            }
            TextureUtil.uploadTextureImage(super.getGlTextureId(), this.bufferedImage);
            "".length();
            this.textureUploaded = (ThreadDownloadImageData.lIllllIlIllIII[1] != 0);
        }
    }
    
    protected void loadTextureFromServer() {
        this.imageThread = new Thread(String.valueOf(new StringBuilder(ThreadDownloadImageData.lIllllIlIlIlll[ThreadDownloadImageData.lIllllIlIllIII[2]]).append(ThreadDownloadImageData.threadDownloadCounter.incrementAndGet()))) {
            private static final /* synthetic */ int[] llIlIIIlIllllI;
            private static final /* synthetic */ String[] llIlIIIlIlllIl;
            
            private static boolean lIIlIIlIIIIIIllI(final Object llllllllllllIllIllIIllIlIIllIIIl) {
                return llllllllllllIllIllIIllIlIIllIIIl != null;
            }
            
            private static String lIIlIIlIIIIIIIlI(String llllllllllllIllIllIIllIlIlIlIIII, final String llllllllllllIllIllIIllIlIlIlIlII) {
                llllllllllllIllIllIIllIlIlIlIIII = new String(Base64.getDecoder().decode(llllllllllllIllIllIIllIlIlIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIllIllIIllIlIlIlIIll = new StringBuilder();
                final char[] llllllllllllIllIllIIllIlIlIlIIlI = llllllllllllIllIllIIllIlIlIlIlII.toCharArray();
                int llllllllllllIllIllIIllIlIlIlIIIl = ThreadDownloadImageData$1.llIlIIIlIllllI[0];
                final int llllllllllllIllIllIIllIlIlIIlIll = (Object)llllllllllllIllIllIIllIlIlIlIIII.toCharArray();
                final float llllllllllllIllIllIIllIlIlIIlIlI = llllllllllllIllIllIIllIlIlIIlIll.length;
                double llllllllllllIllIllIIllIlIlIIlIIl = ThreadDownloadImageData$1.llIlIIIlIllllI[0];
                while (lIIlIIlIIIIIIlll((int)llllllllllllIllIllIIllIlIlIIlIIl, (int)llllllllllllIllIllIIllIlIlIIlIlI)) {
                    final char llllllllllllIllIllIIllIlIlIlIllI = llllllllllllIllIllIIllIlIlIIlIll[llllllllllllIllIllIIllIlIlIIlIIl];
                    llllllllllllIllIllIIllIlIlIlIIll.append((char)(llllllllllllIllIllIIllIlIlIlIllI ^ llllllllllllIllIllIIllIlIlIlIIlI[llllllllllllIllIllIIllIlIlIlIIIl % llllllllllllIllIllIIllIlIlIlIIlI.length]));
                    "".length();
                    ++llllllllllllIllIllIIllIlIlIlIIIl;
                    ++llllllllllllIllIllIIllIlIlIIlIIl;
                    "".length();
                    if (((0x42 ^ 0x6D) & ~(0x50 ^ 0x7F)) != 0x0) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIllIllIIllIlIlIlIIll);
            }
            
            private static void lIIlIIlIIIIIIIll() {
                (llIlIIIlIlllIl = new String[ThreadDownloadImageData$1.llIlIIIlIllllI[1]])[ThreadDownloadImageData$1.llIlIIIlIllllI[0]] = lIIlIIlIIIIIIIIl("EO1/BzlyJG0ApxNV9wcaIJTNkqVh9b3E22hk7M4fLvht2pohMMJ/yw==", "QrXok");
                ThreadDownloadImageData$1.llIlIIIlIlllIl[ThreadDownloadImageData$1.llIlIIIlIllllI[2]] = lIIlIIlIIIIIIIlI("EDsPBBA9cw5IEDwjFAQbMjBaAAAnJFocESsgDxoR", "STzht");
            }
            
            private static String lIIlIIlIIIIIIIIl(final String llllllllllllIllIllIIllIlIIlllllI, final String llllllllllllIllIllIIllIlIIllllll) {
                try {
                    final SecretKeySpec llllllllllllIllIllIIllIlIlIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIllIlIIllllll.getBytes(StandardCharsets.UTF_8)), ThreadDownloadImageData$1.llIlIIIlIllllI[4]), "DES");
                    final Cipher llllllllllllIllIllIIllIlIlIIIIlI = Cipher.getInstance("DES");
                    llllllllllllIllIllIIllIlIlIIIIlI.init(ThreadDownloadImageData$1.llIlIIIlIllllI[1], llllllllllllIllIllIIllIlIlIIIIll);
                    return new String(llllllllllllIllIllIIllIlIlIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIllIlIIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIllIllIIllIlIlIIIIIl) {
                    llllllllllllIllIllIIllIlIlIIIIIl.printStackTrace();
                    return null;
                }
            }
            
            private static boolean lIIlIIlIIIIIIlIl(final int llllllllllllIllIllIIllIlIIlllIII, final int llllllllllllIllIllIIllIlIIllIlll) {
                return llllllllllllIllIllIIllIlIIlllIII == llllllllllllIllIllIIllIlIIllIlll;
            }
            
            @Override
            public void run() {
                HttpURLConnection llllllllllllIllIllIIllIlIllIIlll = null;
                final Logger access$0 = ThreadDownloadImageData.logger;
                final String s = ThreadDownloadImageData$1.llIlIIIlIlllIl[ThreadDownloadImageData$1.llIlIIIlIllllI[0]];
                final Object[] array = new Object[ThreadDownloadImageData$1.llIlIIIlIllllI[1]];
                array[ThreadDownloadImageData$1.llIlIIIlIllllI[0]] = ThreadDownloadImageData.this.imageUrl;
                array[ThreadDownloadImageData$1.llIlIIIlIllllI[2]] = ThreadDownloadImageData.this.cacheFile;
                access$0.debug(s, array);
                try {
                    llllllllllllIllIllIIllIlIllIIlll = (HttpURLConnection)new URL(ThreadDownloadImageData.this.imageUrl).openConnection(Minecraft.getMinecraft().getProxy());
                    llllllllllllIllIllIIllIlIllIIlll.setDoInput((boolean)(ThreadDownloadImageData$1.llIlIIIlIllllI[2] != 0));
                    llllllllllllIllIllIIllIlIllIIlll.setDoOutput((boolean)(ThreadDownloadImageData$1.llIlIIIlIllllI[0] != 0));
                    llllllllllllIllIllIIllIlIllIIlll.connect();
                    if (lIIlIIlIIIIIIlIl(llllllllllllIllIllIIllIlIllIIlll.getResponseCode() / ThreadDownloadImageData$1.llIlIIIlIllllI[3], ThreadDownloadImageData$1.llIlIIIlIllllI[1])) {
                        BufferedImage llllllllllllIllIllIIllIlIllIIlIl;
                        if (lIIlIIlIIIIIIllI(ThreadDownloadImageData.this.cacheFile)) {
                            FileUtils.copyInputStreamToFile(llllllllllllIllIllIIllIlIllIIlll.getInputStream(), ThreadDownloadImageData.this.cacheFile);
                            final BufferedImage llllllllllllIllIllIIllIlIllIIllI = ImageIO.read(ThreadDownloadImageData.this.cacheFile);
                            "".length();
                            if ("   ".length() <= "  ".length()) {
                                return;
                            }
                        }
                        else {
                            llllllllllllIllIllIIllIlIllIIlIl = TextureUtil.readBufferedImage(llllllllllllIllIllIIllIlIllIIlll.getInputStream());
                        }
                        if (lIIlIIlIIIIIIllI(ThreadDownloadImageData.this.imageBuffer)) {
                            llllllllllllIllIllIIllIlIllIIlIl = ThreadDownloadImageData.this.imageBuffer.parseUserSkin(llllllllllllIllIllIIllIlIllIIlIl);
                        }
                        ThreadDownloadImageData.this.setBufferedImage(llllllllllllIllIllIIllIlIllIIlIl);
                        return;
                    }
                }
                catch (Exception llllllllllllIllIllIIllIlIllIIlII) {
                    ThreadDownloadImageData.logger.error(ThreadDownloadImageData$1.llIlIIIlIlllIl[ThreadDownloadImageData$1.llIlIIIlIllllI[2]], (Throwable)llllllllllllIllIllIIllIlIllIIlII);
                    return;
                }
                finally {
                    if (lIIlIIlIIIIIIllI(llllllllllllIllIllIIllIlIllIIlll)) {
                        llllllllllllIllIllIIllIlIllIIlll.disconnect();
                    }
                }
                if (lIIlIIlIIIIIIllI(llllllllllllIllIllIIllIlIllIIlll)) {
                    llllllllllllIllIllIIllIlIllIIlll.disconnect();
                }
            }
            
            private static boolean lIIlIIlIIIIIIlll(final int llllllllllllIllIllIIllIlIIllIlII, final int llllllllllllIllIllIIllIlIIllIIll) {
                return llllllllllllIllIllIIllIlIIllIlII < llllllllllllIllIllIIllIlIIllIIll;
            }
            
            static {
                lIIlIIlIIIIIIlII();
                lIIlIIlIIIIIIIll();
            }
            
            private static void lIIlIIlIIIIIIlII() {
                (llIlIIIlIllllI = new int[5])[0] = ((0xE9 ^ 0xB6) & ~(0x4C ^ 0x13));
                ThreadDownloadImageData$1.llIlIIIlIllllI[1] = "  ".length();
                ThreadDownloadImageData$1.llIlIIIlIllllI[2] = " ".length();
                ThreadDownloadImageData$1.llIlIIIlIllllI[3] = (0xF0 ^ 0x94);
                ThreadDownloadImageData$1.llIlIIIlIllllI[4] = (0xBC ^ 0xB4);
            }
        };
        this.imageThread.setDaemon((boolean)(ThreadDownloadImageData.lIllllIlIllIII[1] != 0));
        this.imageThread.start();
    }
    
    static {
        lIIIIlIIlIIlllll();
        lIIIIlIIlIIlllII();
        logger = LogManager.getLogger();
        threadDownloadCounter = new AtomicInteger(ThreadDownloadImageData.lIllllIlIllIII[0]);
    }
    
    public void setBufferedImage(final BufferedImage llllllllllllIllllIlIIlIIlIIllIlI) {
        this.bufferedImage = llllllllllllIllllIlIIlIIlIIllIlI;
        if (lIIIIlIIlIlIIIIl(this.imageBuffer)) {
            this.imageBuffer.skinAvailable();
        }
    }
    
    private static String lIIIIlIIlIIlIIlI(String llllllllllllIllllIlIIlIIIllIlIll, final String llllllllllllIllllIlIIlIIIllIlIlI) {
        llllllllllllIllllIlIIlIIIllIlIll = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIlIIlIIIllIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIlIIlIIIllIlllI = new StringBuilder();
        final char[] llllllllllllIllllIlIIlIIIllIllIl = llllllllllllIllllIlIIlIIIllIlIlI.toCharArray();
        int llllllllllllIllllIlIIlIIIllIllII = ThreadDownloadImageData.lIllllIlIllIII[0];
        final boolean llllllllllllIllllIlIIlIIIllIIllI = (Object)((String)llllllllllllIllllIlIIlIIIllIlIll).toCharArray();
        final char llllllllllllIllllIlIIlIIIllIIlIl = (char)llllllllllllIllllIlIIlIIIllIIllI.length;
        byte llllllllllllIllllIlIIlIIIllIIlII = (byte)ThreadDownloadImageData.lIllllIlIllIII[0];
        while (lIIIIlIIlIlIIlII(llllllllllllIllllIlIIlIIIllIIlII, llllllllllllIllllIlIIlIIIllIIlIl)) {
            final char llllllllllllIllllIlIIlIIIlllIIIl = llllllllllllIllllIlIIlIIIllIIllI[llllllllllllIllllIlIIlIIIllIIlII];
            llllllllllllIllllIlIIlIIIllIlllI.append((char)(llllllllllllIllllIlIIlIIIlllIIIl ^ llllllllllllIllllIlIIlIIIllIllIl[llllllllllllIllllIlIIlIIIllIllII % llllllllllllIllllIlIIlIIIllIllIl.length]));
            "".length();
            ++llllllllllllIllllIlIIlIIIllIllII;
            ++llllllllllllIllllIlIIlIIIllIIlII;
            "".length();
            if ("  ".length() == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIlIIlIIIllIlllI);
    }
    
    private static void lIIIIlIIlIIlllll() {
        (lIllllIlIllIII = new int[5])[0] = ((0x20 ^ 0x7F) & ~(0xCA ^ 0x95));
        ThreadDownloadImageData.lIllllIlIllIII[1] = " ".length();
        ThreadDownloadImageData.lIllllIlIllIII[2] = "  ".length();
        ThreadDownloadImageData.lIllllIlIllIII[3] = "   ".length();
        ThreadDownloadImageData.lIllllIlIllIII[4] = (0x89 ^ 0x87 ^ (0x81 ^ 0x87));
    }
    
    private static void lIIIIlIIlIIlllII() {
        (lIllllIlIlIlll = new String[ThreadDownloadImageData.lIllllIlIllIII[3]])[ThreadDownloadImageData.lIllllIlIllIII[0]] = lIIIIlIIlIIlIIlI("DyIAEB4tKkEcAzc9QQASOzkUBhJjKxMbGmMhDhcWL20CFRQrKEFcDD5k", "CMatw");
        ThreadDownloadImageData.lIllllIlIlIlll[ThreadDownloadImageData.lIllllIlIllIII[1]] = lIIIIlIIlIIlIlIl("EWIwugzl7PGTcxUopoeJ2FvSszeTBdS2", "CZlfc");
        ThreadDownloadImageData.lIllllIlIlIlll[ThreadDownloadImageData.lIllllIlIllIII[2]] = lIIIIlIIlIIllIll("qybL6IXDF5G2XJla60NHRPcF8wNbcLl2", "XYjkC");
    }
    
    private static boolean lIIIIlIIlIlIIIIl(final Object llllllllllllIllllIlIIlIIIlIlIIII) {
        return llllllllllllIllllIlIIlIIIlIlIIII != null;
    }
    
    private static boolean lIIIIlIIlIlIIlII(final int llllllllllllIllllIlIIlIIIlIlIIll, final int llllllllllllIllllIlIIlIIIlIlIIlI) {
        return llllllllllllIllllIlIIlIIIlIlIIll < llllllllllllIllllIlIIlIIIlIlIIlI;
    }
    
    private static String lIIIIlIIlIIllIll(final String llllllllllllIllllIlIIlIIlIIIIIII, final String llllllllllllIllllIlIIlIIIlllllll) {
        try {
            final SecretKeySpec llllllllllllIllllIlIIlIIlIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIIlIIIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIlIIlIIlIIIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllllIlIIlIIlIIIIIlI.init(ThreadDownloadImageData.lIllllIlIllIII[2], llllllllllllIllllIlIIlIIlIIIIIll);
            return new String(llllllllllllIllllIlIIlIIlIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIIlIIlIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlIIlIIlIIIIIIl) {
            llllllllllllIllllIlIIlIIlIIIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIlIIlIlIIIII(final int llllllllllllIllllIlIIlIIIlIIlIlI) {
        return llllllllllllIllllIlIIlIIIlIIlIlI == 0;
    }
    
    private static boolean lIIIIlIIlIlIIIlI(final Object llllllllllllIllllIlIIlIIIlIIlllI) {
        return llllllllllllIllllIlIIlIIIlIIlllI == null;
    }
    
    public ThreadDownloadImageData(final File llllllllllllIllllIlIIlIIlIlIlIIl, final String llllllllllllIllllIlIIlIIlIlIlIII, final ResourceLocation llllllllllllIllllIlIIlIIlIlIIlll, final IImageBuffer llllllllllllIllllIlIIlIIlIlIIllI) {
        super(llllllllllllIllllIlIIlIIlIlIIlll);
        this.cacheFile = llllllllllllIllllIlIIlIIlIlIlIIl;
        this.imageUrl = llllllllllllIllllIlIIlIIlIlIlIII;
        this.imageBuffer = llllllllllllIllllIlIIlIIlIlIIllI;
    }
    
    @Override
    public void loadTexture(final IResourceManager llllllllllllIllllIlIIlIIlIIlIIlI) throws IOException {
        if (lIIIIlIIlIlIIIlI(this.bufferedImage) && lIIIIlIIlIlIIIIl(this.textureLocation)) {
            super.loadTexture(llllllllllllIllllIlIIlIIlIIlIIlI);
        }
        if (lIIIIlIIlIlIIIlI(this.imageThread)) {
            if (lIIIIlIIlIlIIIIl(this.cacheFile) && lIIIIlIIlIlIIIll(this.cacheFile.isFile() ? 1 : 0)) {
                final Logger logger = ThreadDownloadImageData.logger;
                final String s = ThreadDownloadImageData.lIllllIlIlIlll[ThreadDownloadImageData.lIllllIlIllIII[0]];
                final Object[] array = new Object[ThreadDownloadImageData.lIllllIlIllIII[1]];
                array[ThreadDownloadImageData.lIllllIlIllIII[0]] = this.cacheFile;
                logger.debug(s, array);
                try {
                    this.bufferedImage = ImageIO.read(this.cacheFile);
                    if (!lIIIIlIIlIlIIIIl(this.imageBuffer)) {
                        return;
                    }
                    this.setBufferedImage(this.imageBuffer.parseUserSkin(this.bufferedImage));
                    "".length();
                    if (-"  ".length() > 0) {
                        return;
                    }
                    return;
                }
                catch (IOException llllllllllllIllllIlIIlIIlIIlIlII) {
                    ThreadDownloadImageData.logger.error(String.valueOf(new StringBuilder(ThreadDownloadImageData.lIllllIlIlIlll[ThreadDownloadImageData.lIllllIlIllIII[1]]).append(this.cacheFile)), (Throwable)llllllllllllIllllIlIIlIIlIIlIlII);
                    this.loadTextureFromServer();
                    "".length();
                    if ("  ".length() == " ".length()) {
                        return;
                    }
                    return;
                }
            }
            this.loadTextureFromServer();
        }
    }
    
    @Override
    public int getGlTextureId() {
        this.checkTextureUploaded();
        return super.getGlTextureId();
    }
    
    private static String lIIIIlIIlIIlIlIl(final String llllllllllllIllllIlIIlIIIlIllIIl, final String llllllllllllIllllIlIIlIIIlIllIlI) {
        try {
            final SecretKeySpec llllllllllllIllllIlIIlIIIlIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIIlIIIlIllIlI.getBytes(StandardCharsets.UTF_8)), ThreadDownloadImageData.lIllllIlIllIII[4]), "DES");
            final Cipher llllllllllllIllllIlIIlIIIlIlllIl = Cipher.getInstance("DES");
            llllllllllllIllllIlIIlIIIlIlllIl.init(ThreadDownloadImageData.lIllllIlIllIII[2], llllllllllllIllllIlIIlIIIlIllllI);
            return new String(llllllllllllIllllIlIIlIIIlIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIIlIIIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlIIlIIIlIlllII) {
            llllllllllllIllllIlIIlIIIlIlllII.printStackTrace();
            return null;
        }
    }
}
