// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources;

import com.google.common.collect.ImmutableSet;
import net.minecraft.client.resources.data.IMetadataSection;
import net.minecraft.client.resources.data.IMetadataSerializer;
import net.minecraft.client.renderer.texture.TextureUtil;
import java.awt.image.BufferedImage;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;
import net.minecraft.util.ResourceLocation;
import java.io.File;
import java.util.Map;
import java.util.Set;

public class DefaultResourcePack implements IResourcePack
{
    public static final /* synthetic */ Set<String> defaultResourceDomains;
    private static final /* synthetic */ String[] lllIIlIIIllIIl;
    private static final /* synthetic */ int[] lllIIlIIIllIll;
    private final /* synthetic */ Map<String, File> mapAssets;
    
    public InputStream getInputStreamAssets(final ResourceLocation llllllllllllIlIlllllIIIIllllllIl) throws IOException, FileNotFoundException {
        final File llllllllllllIlIlllllIIIIllllllII = this.mapAssets.get(llllllllllllIlIlllllIIIIllllllIl.toString());
        InputStream inputStream;
        if (lIIllllIlllllllI(llllllllllllIlIlllllIIIIllllllII) && lIIllllIllllllll(llllllllllllIlIlllllIIIIllllllII.isFile() ? 1 : 0)) {
            inputStream = new FileInputStream(llllllllllllIlIlllllIIIIllllllII);
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        else {
            inputStream = null;
        }
        return inputStream;
    }
    
    private static boolean lIIlllllIIIIIIII(final Object llllllllllllIlIlllllIIIIlIlIIlII) {
        return llllllllllllIlIlllllIIIIlIlIIlII == null;
    }
    
    private static boolean lIIllllIlllllllI(final Object llllllllllllIlIlllllIIIIlIlIIllI) {
        return llllllllllllIlIlllllIIIIlIlIIllI != null;
    }
    
    private static void lIIllllIlllllIIl() {
        (lllIIlIIIllIIl = new String[DefaultResourcePack.lllIIlIIIllIll[8]])[DefaultResourcePack.lllIIlIIIllIll[0]] = lIIllllIllllIlIl("yKQoFAOSAhRC3tY8Y8XMLQ==", "wutwf");
        DefaultResourcePack.lllIIlIIIllIIl[DefaultResourcePack.lllIIlIIIllIll[1]] = lIIllllIllllIllI("YOvU77t+MDo=", "YawWQ");
        DefaultResourcePack.lllIIlIIIllIIl[DefaultResourcePack.lllIIlIIIllIll[2]] = lIIllllIllllIllI("mi7nRdV3q00cp9tokjsbCg==", "SMaoi");
        DefaultResourcePack.lllIIlIIIllIIl[DefaultResourcePack.lllIIlIIIllIll[3]] = lIIllllIllllIlIl("dYArymQ6xTE=", "XWMvZ");
        DefaultResourcePack.lllIIlIIIllIIl[DefaultResourcePack.lllIIlIIIllIll[4]] = lIIllllIllllIlll("GzIPBHQGMAEKLgo=", "kSloZ");
        DefaultResourcePack.lllIIlIIIllIIl[DefaultResourcePack.lllIIlIIIllIll[5]] = lIIllllIllllIllI("L0I1wAG3l50=", "nrJpu");
        DefaultResourcePack.lllIIlIIIllIIl[DefaultResourcePack.lllIIlIIIllIll[6]] = lIIllllIllllIllI("meVJMv+vGmT//Yew1O7Pew==", "QCahm");
        DefaultResourcePack.lllIIlIIIllIIl[DefaultResourcePack.lllIIlIIIllIll[7]] = lIIllllIllllIllI("aYOI3Wv1Ycc=", "zLVVL");
    }
    
    private static boolean lIIllllIllllllll(final int llllllllllllIlIlllllIIIIlIlIIIlI) {
        return llllllllllllIlIlllllIIIIlIlIIIlI != 0;
    }
    
    private static boolean lIIlllllIIIIIIIl(final int llllllllllllIlIlllllIIIIlIlIIIII) {
        return llllllllllllIlIlllllIIIIlIlIIIII == 0;
    }
    
    private static String lIIllllIllllIllI(final String llllllllllllIlIlllllIIIIllIlIlII, final String llllllllllllIlIlllllIIIIllIlIIll) {
        try {
            final SecretKeySpec llllllllllllIlIlllllIIIIllIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllllIIIIllIlIIll.getBytes(StandardCharsets.UTF_8)), DefaultResourcePack.lllIIlIIIllIll[8]), "DES");
            final Cipher llllllllllllIlIlllllIIIIllIllIII = Cipher.getInstance("DES");
            llllllllllllIlIlllllIIIIllIllIII.init(DefaultResourcePack.lllIIlIIIllIll[2], llllllllllllIlIlllllIIIIllIllIIl);
            return new String(llllllllllllIlIlllllIIIIllIllIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllllIIIIllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllllIIIIllIlIlll) {
            llllllllllllIlIlllllIIIIllIlIlll.printStackTrace();
            return null;
        }
    }
    
    private static String lIIllllIllllIlll(String llllllllllllIlIlllllIIIIllIIIIIl, final String llllllllllllIlIlllllIIIIllIIIlIl) {
        llllllllllllIlIlllllIIIIllIIIIIl = new String(Base64.getDecoder().decode(llllllllllllIlIlllllIIIIllIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllllIIIIllIIIlII = new StringBuilder();
        final char[] llllllllllllIlIlllllIIIIllIIIIll = llllllllllllIlIlllllIIIIllIIIlIl.toCharArray();
        int llllllllllllIlIlllllIIIIllIIIIlI = DefaultResourcePack.lllIIlIIIllIll[0];
        final long llllllllllllIlIlllllIIIIlIllllII = (Object)llllllllllllIlIlllllIIIIllIIIIIl.toCharArray();
        final short llllllllllllIlIlllllIIIIlIlllIll = (short)llllllllllllIlIlllllIIIIlIllllII.length;
        char llllllllllllIlIlllllIIIIlIlllIlI = (char)DefaultResourcePack.lllIIlIIIllIll[0];
        while (lIIlllllIIIIIIlI(llllllllllllIlIlllllIIIIlIlllIlI, llllllllllllIlIlllllIIIIlIlllIll)) {
            final char llllllllllllIlIlllllIIIIllIIIlll = llllllllllllIlIlllllIIIIlIllllII[llllllllllllIlIlllllIIIIlIlllIlI];
            llllllllllllIlIlllllIIIIllIIIlII.append((char)(llllllllllllIlIlllllIIIIllIIIlll ^ llllllllllllIlIlllllIIIIllIIIIll[llllllllllllIlIlllllIIIIllIIIIlI % llllllllllllIlIlllllIIIIllIIIIll.length]));
            "".length();
            ++llllllllllllIlIlllllIIIIllIIIIlI;
            ++llllllllllllIlIlllllIIIIlIlllIlI;
            "".length();
            if (-" ".length() > -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllllIIIIllIIIlII);
    }
    
    @Override
    public BufferedImage getPackImage() throws IOException {
        return TextureUtil.readBufferedImage(DefaultResourcePack.class.getResourceAsStream(String.valueOf(new StringBuilder(DefaultResourcePack.lllIIlIIIllIIl[DefaultResourcePack.lllIIlIIIllIll[5]]).append(new ResourceLocation(DefaultResourcePack.lllIIlIIIllIIl[DefaultResourcePack.lllIIlIIIllIll[6]]).getResourcePath()))));
    }
    
    private InputStream getResourceStream(final ResourceLocation llllllllllllIlIlllllIIIIllllIlIl) {
        return DefaultResourcePack.class.getResourceAsStream(String.valueOf(new StringBuilder(DefaultResourcePack.lllIIlIIIllIIl[DefaultResourcePack.lllIIlIIIllIll[2]]).append(llllllllllllIlIlllllIIIIllllIlIl.getResourceDomain()).append(DefaultResourcePack.lllIIlIIIllIIl[DefaultResourcePack.lllIIlIIIllIll[3]]).append(llllllllllllIlIlllllIIIIllllIlIl.getResourcePath())));
    }
    
    @Override
    public Set<String> getResourceDomains() {
        return DefaultResourcePack.defaultResourceDomains;
    }
    
    @Override
    public InputStream getInputStream(final ResourceLocation llllllllllllIlIlllllIIIlIIIIIlII) throws IOException {
        final InputStream llllllllllllIlIlllllIIIlIIIIIlll = this.getResourceStream(llllllllllllIlIlllllIIIlIIIIIlII);
        if (lIIllllIlllllllI(llllllllllllIlIlllllIIIlIIIIIlll)) {
            return llllllllllllIlIlllllIIIlIIIIIlll;
        }
        final InputStream llllllllllllIlIlllllIIIlIIIIIllI = this.getInputStreamAssets(llllllllllllIlIlllllIIIlIIIIIlII);
        if (lIIllllIlllllllI(llllllllllllIlIlllllIIIlIIIIIllI)) {
            return llllllllllllIlIlllllIIIlIIIIIllI;
        }
        throw new FileNotFoundException(llllllllllllIlIlllllIIIlIIIIIlII.getResourcePath());
    }
    
    @Override
    public <T extends IMetadataSection> T getPackMetadata(final IMetadataSerializer llllllllllllIlIlllllIIIIlllIlIII, final String llllllllllllIlIlllllIIIIlllIIlll) throws IOException {
        try {
            final InputStream llllllllllllIlIlllllIIIIlllIIllI = new FileInputStream(this.mapAssets.get(DefaultResourcePack.lllIIlIIIllIIl[DefaultResourcePack.lllIIlIIIllIll[4]]));
            return AbstractResourcePack.readMetadata(llllllllllllIlIlllllIIIIlllIlIII, llllllllllllIlIlllllIIIIlllIIllI, llllllllllllIlIlllllIIIIlllIIlll);
        }
        catch (RuntimeException llllllllllllIlIlllllIIIIlllIIlIl) {
            return null;
        }
        catch (FileNotFoundException llllllllllllIlIlllllIIIIlllIIlII) {
            return null;
        }
    }
    
    private static boolean lIIlllllIIIIIIlI(final int llllllllllllIlIlllllIIIIlIlIlIIl, final int llllllllllllIlIlllllIIIIlIlIlIII) {
        return llllllllllllIlIlllllIIIIlIlIlIIl < llllllllllllIlIlllllIIIIlIlIlIII;
    }
    
    @Override
    public String getPackName() {
        return DefaultResourcePack.lllIIlIIIllIIl[DefaultResourcePack.lllIIlIIIllIll[7]];
    }
    
    public DefaultResourcePack(final Map<String, File> llllllllllllIlIlllllIIIlIIIIlllI) {
        this.mapAssets = llllllllllllIlIlllllIIIlIIIIlllI;
    }
    
    private static String lIIllllIllllIlIl(final String llllllllllllIlIlllllIIIIlIlIllll, final String llllllllllllIlIlllllIIIIlIlIlllI) {
        try {
            final SecretKeySpec llllllllllllIlIlllllIIIIlIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllllIIIIlIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllllIIIIlIllIIll = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllllIIIIlIllIIll.init(DefaultResourcePack.lllIIlIIIllIll[2], llllllllllllIlIlllllIIIIlIllIlII);
            return new String(llllllllllllIlIlllllIIIIlIllIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllllIIIIlIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllllIIIIlIllIIlI) {
            llllllllllllIlIlllllIIIIlIllIIlI.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIllllIllllllIl();
        lIIllllIlllllIIl();
        defaultResourceDomains = (Set)ImmutableSet.of((Object)DefaultResourcePack.lllIIlIIIllIIl[DefaultResourcePack.lllIIlIIIllIll[0]], (Object)DefaultResourcePack.lllIIlIIIllIIl[DefaultResourcePack.lllIIlIIIllIll[1]]);
    }
    
    private static void lIIllllIllllllIl() {
        (lllIIlIIIllIll = new int[9])[0] = ((0xAD ^ 0xB6) & ~(0x8D ^ 0x96));
        DefaultResourcePack.lllIIlIIIllIll[1] = " ".length();
        DefaultResourcePack.lllIIlIIIllIll[2] = "  ".length();
        DefaultResourcePack.lllIIlIIIllIll[3] = "   ".length();
        DefaultResourcePack.lllIIlIIIllIll[4] = (0xAC ^ 0xA8);
        DefaultResourcePack.lllIIlIIIllIll[5] = (0x75 ^ 0x70);
        DefaultResourcePack.lllIIlIIIllIll[6] = (0x2F ^ 0x29);
        DefaultResourcePack.lllIIlIIIllIll[7] = (0xF1 ^ 0xA1 ^ (0xC0 ^ 0x97));
        DefaultResourcePack.lllIIlIIIllIll[8] = (0xB6 ^ 0xBE);
    }
    
    @Override
    public boolean resourceExists(final ResourceLocation llllllllllllIlIlllllIIIIlllIllll) {
        if (lIIlllllIIIIIIII(this.getResourceStream(llllllllllllIlIlllllIIIIlllIllll)) && lIIlllllIIIIIIIl(this.mapAssets.containsKey(llllllllllllIlIlllllIIIIlllIllll.toString()) ? 1 : 0)) {
            return DefaultResourcePack.lllIIlIIIllIll[0] != 0;
        }
        return DefaultResourcePack.lllIIlIIIllIll[1] != 0;
    }
}
