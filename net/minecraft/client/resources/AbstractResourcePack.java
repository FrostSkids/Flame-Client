// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources;

import com.google.gson.JsonObject;
import org.apache.commons.io.IOUtils;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.google.common.base.Charsets;
import net.minecraft.client.renderer.texture.TextureUtil;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.util.Arrays;
import java.io.IOException;
import net.minecraft.client.resources.data.IMetadataSection;
import net.minecraft.client.resources.data.IMetadataSerializer;
import org.apache.logging.log4j.LogManager;
import net.minecraft.util.ResourceLocation;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.File;
import org.apache.logging.log4j.Logger;

public abstract class AbstractResourcePack implements IResourcePack
{
    private static final /* synthetic */ Logger resourceLog;
    private static final /* synthetic */ int[] lIIllllIIIIllI;
    private static final /* synthetic */ String[] lIIllllIIIIlIl;
    protected final /* synthetic */ File resourcePackFile;
    
    private static void llIlllIIlllIIIl() {
        (lIIllllIIIIlIl = new String[AbstractResourcePack.lIIllllIIIIllI[5]])[AbstractResourcePack.lIIllllIIIIllI[0]] = llIlllIIllIllII("XP9ICq+2/RQRSur5pYxGcw==", "zTvTi");
        AbstractResourcePack.lIIllllIIIIlIl[AbstractResourcePack.lIIllllIIIIllI[2]] = llIlllIIllIlllI("FwELETYF", "vrxtB");
        AbstractResourcePack.lIIllllIIIIlIl[AbstractResourcePack.lIIllllIIIIllI[3]] = llIlllIIllIllll("fhFbM5P8nnAjM8wjj3UJRSOCV7/4HmxDcsXFDjZwBmRjkBLs4EhBGp++V8+xI3uEBtduqM2KkQc=", "jpjCS");
        AbstractResourcePack.lIIllllIIIIlIl[AbstractResourcePack.lIIllllIIIIllI[1]] = llIlllIIllIllII("wKC6XYC4mDPLamcIEGpKeQ==", "EwzFk");
        AbstractResourcePack.lIIllllIIIIlIl[AbstractResourcePack.lIIllllIIIIllI[4]] = llIlllIIllIllII("tl0c1XlCCvcEUMd1Nyb3kw==", "umlSy");
    }
    
    protected static String getRelativeName(final File lllllllllllllIIlIIllIIlIlIlIlIIl, final File lllllllllllllIIlIIllIIlIlIlIIllI) {
        return lllllllllllllIIlIIllIIlIlIlIlIIl.toURI().relativize(lllllllllllllIIlIIllIIlIlIlIIllI.toURI()).getPath();
    }
    
    protected abstract boolean hasResourceName(final String p0);
    
    private static String llIlllIIllIllII(final String lllllllllllllIIlIIllIIlIIllIIlll, final String lllllllllllllIIlIIllIIlIIllIIllI) {
        try {
            final SecretKeySpec lllllllllllllIIlIIllIIlIIllIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIllIIlIIllIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIllIIlIIllIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIllIIlIIllIlIll.init(AbstractResourcePack.lIIllllIIIIllI[3], lllllllllllllIIlIIllIIlIIllIllII);
            return new String(lllllllllllllIIlIIllIIlIIllIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIllIIlIIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIllIIlIIllIlIlI) {
            lllllllllllllIIlIIllIIlIIllIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static String llIlllIIllIlllI(String lllllllllllllIIlIIllIIlIIlIIIlll, final String lllllllllllllIIlIIllIIlIIlIIIllI) {
        lllllllllllllIIlIIllIIlIIlIIIlll = new String(Base64.getDecoder().decode(lllllllllllllIIlIIllIIlIIlIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIllIIlIIlIIlIlI = new StringBuilder();
        final char[] lllllllllllllIIlIIllIIlIIlIIlIIl = lllllllllllllIIlIIllIIlIIlIIIllI.toCharArray();
        int lllllllllllllIIlIIllIIlIIlIIlIII = AbstractResourcePack.lIIllllIIIIllI[0];
        final float lllllllllllllIIlIIllIIlIIlIIIIlI = (Object)lllllllllllllIIlIIllIIlIIlIIIlll.toCharArray();
        final boolean lllllllllllllIIlIIllIIlIIlIIIIIl = lllllllllllllIIlIIllIIlIIlIIIIlI.length != 0;
        float lllllllllllllIIlIIllIIlIIlIIIIII = AbstractResourcePack.lIIllllIIIIllI[0];
        while (llIlllIIlllIlII((int)lllllllllllllIIlIIllIIlIIlIIIIII, lllllllllllllIIlIIllIIlIIlIIIIIl ? 1 : 0)) {
            final char lllllllllllllIIlIIllIIlIIlIIllIl = lllllllllllllIIlIIllIIlIIlIIIIlI[lllllllllllllIIlIIllIIlIIlIIIIII];
            lllllllllllllIIlIIllIIlIIlIIlIlI.append((char)(lllllllllllllIIlIIllIIlIIlIIllIl ^ lllllllllllllIIlIIllIIlIIlIIlIIl[lllllllllllllIIlIIllIIlIIlIIlIII % lllllllllllllIIlIIllIIlIIlIIlIIl.length]));
            "".length();
            ++lllllllllllllIIlIIllIIlIIlIIlIII;
            ++lllllllllllllIIlIIllIIlIIlIIIIII;
            "".length();
            if (((0xD6 ^ 0xA5 ^ (0x9 ^ 0x75)) & (0x49 ^ 0x35 ^ (0x6D ^ 0x1E) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIllIIlIIlIIlIlI);
    }
    
    private static void llIlllIIlllIIll() {
        (lIIllllIIIIllI = new int[7])[0] = ((0xDB ^ 0x8E) & ~(0x35 ^ 0x60));
        AbstractResourcePack.lIIllllIIIIllI[1] = "   ".length();
        AbstractResourcePack.lIIllllIIIIllI[2] = " ".length();
        AbstractResourcePack.lIIllllIIIIllI[3] = "  ".length();
        AbstractResourcePack.lIIllllIIIIllI[4] = (0x2F ^ 0x2B);
        AbstractResourcePack.lIIllllIIIIllI[5] = (0x3D ^ 0x38);
        AbstractResourcePack.lIIllllIIIIllI[6] = (60 + 104 - 55 + 45 ^ 111 + 119 - 146 + 62);
    }
    
    private static String locationToName(final ResourceLocation lllllllllllllIIlIIllIIlIlIlIllIl) {
        final String format = AbstractResourcePack.lIIllllIIIIlIl[AbstractResourcePack.lIIllllIIIIllI[0]];
        final Object[] args = new Object[AbstractResourcePack.lIIllllIIIIllI[1]];
        args[AbstractResourcePack.lIIllllIIIIllI[0]] = AbstractResourcePack.lIIllllIIIIlIl[AbstractResourcePack.lIIllllIIIIllI[2]];
        args[AbstractResourcePack.lIIllllIIIIllI[2]] = lllllllllllllIIlIIllIIlIlIlIllIl.getResourceDomain();
        args[AbstractResourcePack.lIIllllIIIIllI[3]] = lllllllllllllIIlIIllIIlIlIlIllIl.getResourcePath();
        return String.format(format, args);
    }
    
    static {
        llIlllIIlllIIll();
        llIlllIIlllIIIl();
        resourceLog = LogManager.getLogger();
    }
    
    @Override
    public <T extends IMetadataSection> T getPackMetadata(final IMetadataSerializer lllllllllllllIIlIIllIIlIlIIIllII, final String lllllllllllllIIlIIllIIlIlIIIlllI) throws IOException {
        return readMetadata(lllllllllllllIIlIIllIIlIlIIIllII, this.getInputStreamByName(AbstractResourcePack.lIIllllIIIIlIl[AbstractResourcePack.lIIllllIIIIllI[1]]), lllllllllllllIIlIIllIIlIlIIIlllI);
    }
    
    private static String llIlllIIllIllll(final String lllllllllllllIIlIIllIIlIIlIllIlI, final String lllllllllllllIIlIIllIIlIIlIllIll) {
        try {
            final SecretKeySpec lllllllllllllIIlIIllIIlIIlIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIllIIlIIlIllIll.getBytes(StandardCharsets.UTF_8)), AbstractResourcePack.lIIllllIIIIllI[6]), "DES");
            final Cipher lllllllllllllIIlIIllIIlIIlIllllI = Cipher.getInstance("DES");
            lllllllllllllIIlIIllIIlIIlIllllI.init(AbstractResourcePack.lIIllllIIIIllI[3], lllllllllllllIIlIIllIIlIIlIlllll);
            return new String(lllllllllllllIIlIIllIIlIIlIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIllIIlIIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIllIIlIIlIlllIl) {
            lllllllllllllIIlIIllIIlIIlIlllIl.printStackTrace();
            return null;
        }
    }
    
    protected abstract InputStream getInputStreamByName(final String p0) throws IOException;
    
    @Override
    public BufferedImage getPackImage() throws IOException {
        return TextureUtil.readBufferedImage(this.getInputStreamByName(AbstractResourcePack.lIIllllIIIIlIl[AbstractResourcePack.lIIllllIIIIllI[4]]));
    }
    
    protected void logNameNotLowercase(final String lllllllllllllIIlIIllIIlIlIIlIlII) {
        final Logger resourceLog = AbstractResourcePack.resourceLog;
        final String s = AbstractResourcePack.lIIllllIIIIlIl[AbstractResourcePack.lIIllllIIIIllI[3]];
        final Object[] array = new Object[AbstractResourcePack.lIIllllIIIIllI[3]];
        array[AbstractResourcePack.lIIllllIIIIllI[0]] = lllllllllllllIIlIIllIIlIlIIlIlII;
        array[AbstractResourcePack.lIIllllIIIIllI[2]] = this.resourcePackFile;
        resourceLog.warn(s, array);
    }
    
    public AbstractResourcePack(final File lllllllllllllIIlIIllIIlIlIllIIIl) {
        this.resourcePackFile = lllllllllllllIIlIIllIIlIlIllIIIl;
    }
    
    private static boolean llIlllIIlllIlII(final int lllllllllllllIIlIIllIIlIIIllllII, final int lllllllllllllIIlIIllIIlIIIlllIll) {
        return lllllllllllllIIlIIllIIlIIIllllII < lllllllllllllIIlIIllIIlIIIlllIll;
    }
    
    static <T extends IMetadataSection> T readMetadata(final IMetadataSerializer lllllllllllllIIlIIllIIlIlIIIIIll, final InputStream lllllllllllllIIlIIllIIlIIlllllII, final String lllllllllllllIIlIIllIIlIlIIIIIIl) {
        JsonObject lllllllllllllIIlIIllIIlIlIIIIIII = null;
        BufferedReader lllllllllllllIIlIIllIIlIIlllllll = null;
        try {
            lllllllllllllIIlIIllIIlIIlllllll = new BufferedReader(new InputStreamReader(lllllllllllllIIlIIllIIlIIlllllII, Charsets.UTF_8));
            lllllllllllllIIlIIllIIlIlIIIIIII = new JsonParser().parse((Reader)lllllllllllllIIlIIllIIlIIlllllll).getAsJsonObject();
            "".length();
            if ((0xDD ^ 0x91 ^ (0xE7 ^ 0xAF)) == " ".length()) {
                return null;
            }
        }
        catch (RuntimeException lllllllllllllIIlIIllIIlIIllllllI) {
            throw new JsonParseException((Throwable)lllllllllllllIIlIIllIIlIIllllllI);
        }
        finally {
            IOUtils.closeQuietly((Reader)lllllllllllllIIlIIllIIlIIlllllll);
        }
        IOUtils.closeQuietly((Reader)lllllllllllllIIlIIllIIlIIlllllll);
        return lllllllllllllIIlIIllIIlIlIIIIIll.parseMetadataSection(lllllllllllllIIlIIllIIlIlIIIIIIl, lllllllllllllIIlIIllIIlIlIIIIIII);
    }
    
    @Override
    public boolean resourceExists(final ResourceLocation lllllllllllllIIlIIllIIlIlIIllIlI) {
        return this.hasResourceName(locationToName(lllllllllllllIIlIIllIIlIlIIllIlI));
    }
    
    @Override
    public String getPackName() {
        return this.resourcePackFile.getName();
    }
    
    @Override
    public InputStream getInputStream(final ResourceLocation lllllllllllllIIlIIllIIlIlIlIIIlI) throws IOException {
        return this.getInputStreamByName(locationToName(lllllllllllllIIlIIllIIlIlIlIIIlI));
    }
}
