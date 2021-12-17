// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl;

import java.io.FileInputStream;
import java.io.File;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.util.ResourceLoader;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.lang.ref.SoftReference;
import java.nio.IntBuffer;
import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.opengl.renderer.SGL;
import java.util.HashMap;

public class InternalTextureLoader
{
    private /* synthetic */ boolean deferred;
    private static final /* synthetic */ int[] lIIIIllIlIIIIl;
    private /* synthetic */ HashMap texturesLinear;
    private /* synthetic */ int dstPixelFormat;
    private static final /* synthetic */ InternalTextureLoader loader;
    protected static /* synthetic */ SGL GL;
    private /* synthetic */ boolean holdTextureData;
    private static final /* synthetic */ String[] lIIIIllIIlllII;
    private /* synthetic */ HashMap texturesNearest;
    
    private static boolean lIlllIlllIIllIl(final int lllllllllllllIlIIlIIlIlIlllIlIll, final int lllllllllllllIlIIlIIlIlIlllIlIlI) {
        return lllllllllllllIlIIlIIlIlIlllIlIll < lllllllllllllIlIIlIIlIlIlllIlIlI;
    }
    
    private InternalTextureLoader() {
        this.texturesLinear = new HashMap();
        this.texturesNearest = new HashMap();
        this.dstPixelFormat = InternalTextureLoader.lIIIIllIlIIIIl[0];
    }
    
    private static String lIlllIllIllIlII(final String lllllllllllllIlIIlIIlIllIIIllIlI, final String lllllllllllllIlIIlIIlIllIIIllIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIlIllIIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIlIllIIIllIll.getBytes(StandardCharsets.UTF_8)), InternalTextureLoader.lIIIIllIlIIIIl[19]), "DES");
            final Cipher lllllllllllllIlIIlIIlIllIIIllllI = Cipher.getInstance("DES");
            lllllllllllllIlIIlIIlIllIIIllllI.init(InternalTextureLoader.lIIIIllIlIIIIl[5], lllllllllllllIlIIlIIlIllIIIlllll);
            return new String(lllllllllllllIlIIlIIlIllIIIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIlIllIIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIlIllIIIlllIl) {
            lllllllllllllIlIIlIIlIllIIIlllIl.printStackTrace();
            return null;
        }
    }
    
    public Texture getTexture(final InputStream lllllllllllllIlIIlIIllIIIIIIlIII, final String lllllllllllllIlIIlIIllIIIIIIIIlI, final boolean lllllllllllllIlIIlIIllIIIIIIIIIl, final int lllllllllllllIlIIlIIllIIIIIIIlIl) throws IOException {
        return this.getTexture(lllllllllllllIlIIlIIllIIIIIIlIII, lllllllllllllIlIIlIIllIIIIIIIIlI, lllllllllllllIlIIlIIllIIIIIIIIIl, lllllllllllllIlIIlIIllIIIIIIIlIl, null);
    }
    
    private static boolean lIlllIlllIIlIIl(final int lllllllllllllIlIIlIIlIlIlllIllll, final int lllllllllllllIlIIlIIlIlIlllIlllI) {
        return lllllllllllllIlIIlIIlIlIlllIllll == lllllllllllllIlIIlIIlIlIlllIlllI;
    }
    
    private TextureImpl getTexture(final InputStream lllllllllllllIlIIlIIlIllllIIlIII, final String lllllllllllllIlIIlIIlIlllIllIIlI, final int lllllllllllllIlIIlIIlIlllIllIIIl, final int lllllllllllllIlIIlIIlIlllIllIIII, final int lllllllllllllIlIIlIIlIllllIIIlII, final boolean lllllllllllllIlIIlIIlIllllIIIIll, final int[] lllllllllllllIlIIlIIlIlllIlIllIl) throws IOException {
        final LoadableImageData lllllllllllllIlIIlIIlIllllIIIIII = ImageDataFactory.getImageDataFor(lllllllllllllIlIIlIIlIlllIllIIlI);
        final ByteBuffer lllllllllllllIlIIlIIlIllllIIIIIl = lllllllllllllIlIIlIIlIllllIIIIII.loadImage(new BufferedInputStream(lllllllllllllIlIIlIIlIllllIIlIII), lllllllllllllIlIIlIIlIllllIIIIll, lllllllllllllIlIIlIIlIlllIlIllIl);
        final int lllllllllllllIlIIlIIlIlllIllllll = createTextureID();
        final TextureImpl lllllllllllllIlIIlIIlIlllIlllllI = new TextureImpl(lllllllllllllIlIIlIIlIlllIllIIlI, lllllllllllllIlIIlIIlIlllIllIIIl, lllllllllllllIlIIlIIlIlllIllllll);
        InternalTextureLoader.GL.glBindTexture(lllllllllllllIlIIlIIlIlllIllIIIl, lllllllllllllIlIIlIIlIlllIllllll);
        final int lllllllllllllIlIIlIIlIlllIllllIl = lllllllllllllIlIIlIIlIllllIIIIII.getWidth();
        final int lllllllllllllIlIIlIIlIlllIllllII = lllllllllllllIlIIlIIlIllllIIIIII.getHeight();
        int n;
        if (lIlllIlllIIlIIl(lllllllllllllIlIIlIIlIllllIIIIII.getDepth(), InternalTextureLoader.lIIIIllIlIIIIl[9])) {
            n = InternalTextureLoader.lIIIIllIlIIIIl[2];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            n = InternalTextureLoader.lIIIIllIlIIIIl[3];
        }
        final boolean lllllllllllllIlIIlIIlIlllIlllIIl = n != 0;
        lllllllllllllIlIIlIIlIlllIlllllI.setTextureWidth(lllllllllllllIlIIlIIlIllllIIIIII.getTexWidth());
        lllllllllllllIlIIlIIlIlllIlllllI.setTextureHeight(lllllllllllllIlIIlIIlIllllIIIIII.getTexHeight());
        final int lllllllllllllIlIIlIIlIlllIlllIll = lllllllllllllIlIIlIIlIlllIlllllI.getTextureWidth();
        final int lllllllllllllIlIIlIIlIlllIlllIlI = lllllllllllllIlIIlIIlIlllIlllllI.getTextureHeight();
        final IntBuffer lllllllllllllIlIIlIIlIlllIlllIII = BufferUtils.createIntBuffer(InternalTextureLoader.lIIIIllIlIIIIl[10]);
        InternalTextureLoader.GL.glGetInteger(InternalTextureLoader.lIIIIllIlIIIIl[11], lllllllllllllIlIIlIIlIlllIlllIII);
        final int lllllllllllllIlIIlIIlIlllIllIlll = lllllllllllllIlIIlIIlIlllIlllIII.get(InternalTextureLoader.lIIIIllIlIIIIl[3]);
        if (!lIlllIlllIIlIll(lllllllllllllIlIIlIIlIlllIlllIll, lllllllllllllIlIIlIIlIlllIllIlll) || lIlllIlllIIllII(lllllllllllllIlIIlIIlIlllIlllIlI, lllllllllllllIlIIlIIlIlllIllIlll)) {
            throw new IOException(InternalTextureLoader.lIIIIllIIlllII[InternalTextureLoader.lIIIIllIlIIIIl[12]]);
        }
        int n2;
        if (lIlllIlllIIlIII(lllllllllllllIlIIlIIlIlllIlllIIl ? 1 : 0)) {
            n2 = InternalTextureLoader.lIIIIllIlIIIIl[0];
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        else {
            n2 = InternalTextureLoader.lIIIIllIlIIIIl[13];
        }
        final int lllllllllllllIlIIlIIlIlllIllIllI = n2;
        int n3;
        if (lIlllIlllIIlIII(lllllllllllllIlIIlIIlIlllIlllIIl ? 1 : 0)) {
            n3 = InternalTextureLoader.lIIIIllIlIIIIl[7];
            "".length();
            if (((0xBD ^ 0x93) & ~(0x35 ^ 0x1B)) > 0) {
                return null;
            }
        }
        else {
            n3 = InternalTextureLoader.lIIIIllIlIIIIl[6];
        }
        final int lllllllllllllIlIIlIIlIlllIllIlIl = n3;
        lllllllllllllIlIIlIIlIlllIlllllI.setWidth(lllllllllllllIlIIlIIlIlllIllllIl);
        lllllllllllllIlIIlIIlIlllIlllllI.setHeight(lllllllllllllIlIIlIIlIlllIllllII);
        lllllllllllllIlIIlIIlIlllIlllllI.setAlpha(lllllllllllllIlIIlIIlIlllIlllIIl);
        if (lIlllIlllIIlIII(this.holdTextureData ? 1 : 0)) {
            lllllllllllllIlIIlIIlIlllIlllllI.setTextureData(lllllllllllllIlIIlIIlIlllIllIllI, lllllllllllllIlIIlIIlIlllIllIlIl, lllllllllllllIlIIlIIlIllllIIIlII, lllllllllllllIlIIlIIlIlllIllIIII, lllllllllllllIlIIlIIlIllllIIIIIl);
        }
        final SGL gl = InternalTextureLoader.GL;
        final SGL gl2 = InternalTextureLoader.GL;
        "".length();
        gl.glTexParameteri(lllllllllllllIlIIlIIlIlllIllIIIl, InternalTextureLoader.lIIIIllIlIIIIl[14], lllllllllllllIlIIlIIlIllllIIIlII);
        final SGL gl3 = InternalTextureLoader.GL;
        final SGL gl4 = InternalTextureLoader.GL;
        "".length();
        gl3.glTexParameteri(lllllllllllllIlIIlIIlIlllIllIIIl, InternalTextureLoader.lIIIIllIlIIIIl[15], lllllllllllllIlIIlIIlIlllIllIIII);
        InternalTextureLoader.GL.glTexImage2D(lllllllllllllIlIIlIIlIlllIllIIIl, InternalTextureLoader.lIIIIllIlIIIIl[3], this.dstPixelFormat, get2Fold(lllllllllllllIlIIlIIlIlllIllllIl), get2Fold(lllllllllllllIlIIlIIlIlllIllllII), InternalTextureLoader.lIIIIllIlIIIIl[3], lllllllllllllIlIIlIIlIlllIllIllI, InternalTextureLoader.lIIIIllIlIIIIl[16], lllllllllllllIlIIlIIlIllllIIIIIl);
        return lllllllllllllIlIIlIIlIlllIlllllI;
    }
    
    public void setHoldTextureData(final boolean lllllllllllllIlIIlIIllIIIlllIIIl) {
        this.holdTextureData = lllllllllllllIlIIlIIllIIIlllIIIl;
    }
    
    public TextureImpl getTexture(final InputStream lllllllllllllIlIIlIIlIllllllIIII, final String lllllllllllllIlIIlIIlIlllllIIllI, final boolean lllllllllllllIlIIlIIlIlllllIlllI, final int lllllllllllllIlIIlIIlIlllllIllIl, final int[] lllllllllllllIlIIlIIlIlllllIIIll) throws IOException {
        if (lIlllIlllIIlIII(this.deferred ? 1 : 0)) {
            return new DeferredTexture(lllllllllllllIlIIlIIlIllllllIIII, lllllllllllllIlIIlIIlIlllllIIllI, lllllllllllllIlIIlIIlIlllllIlllI, lllllllllllllIlIIlIIlIlllllIllIl, lllllllllllllIlIIlIIlIlllllIIIll);
        }
        HashMap lllllllllllllIlIIlIIlIlllllIlIll = this.texturesLinear;
        if (lIlllIlllIIlIIl(lllllllllllllIlIIlIIlIlllllIllIl, InternalTextureLoader.lIIIIllIlIIIIl[4])) {
            lllllllllllllIlIIlIIlIlllllIlIll = this.texturesNearest;
        }
        String lllllllllllllIlIIlIIlIlllllIlIlI = lllllllllllllIlIIlIIlIlllllIIllI;
        if (lIlllIlllIIlIlI(lllllllllllllIlIIlIIlIlllllIIIll)) {
            lllllllllllllIlIIlIIlIlllllIlIlI = String.valueOf(new StringBuilder().append(lllllllllllllIlIIlIIlIlllllIlIlI).append(InternalTextureLoader.lIIIIllIIlllII[InternalTextureLoader.lIIIIllIlIIIIl[3]]).append(lllllllllllllIlIIlIIlIlllllIIIll[InternalTextureLoader.lIIIIllIlIIIIl[3]]).append(InternalTextureLoader.lIIIIllIIlllII[InternalTextureLoader.lIIIIllIlIIIIl[2]]).append(lllllllllllllIlIIlIIlIlllllIIIll[InternalTextureLoader.lIIIIllIlIIIIl[2]]).append(InternalTextureLoader.lIIIIllIIlllII[InternalTextureLoader.lIIIIllIlIIIIl[5]]).append(lllllllllllllIlIIlIIlIlllllIIIll[InternalTextureLoader.lIIIIllIlIIIIl[5]]));
        }
        lllllllllllllIlIIlIIlIlllllIlIlI = String.valueOf(new StringBuilder().append(lllllllllllllIlIIlIIlIlllllIlIlI).append(InternalTextureLoader.lIIIIllIIlllII[InternalTextureLoader.lIIIIllIlIIIIl[6]]).append(lllllllllllllIlIIlIIlIlllllIlllI));
        if (lIlllIlllIIlIII(this.holdTextureData ? 1 : 0)) {
            final TextureImpl lllllllllllllIlIIlIIlIllllllIlIl = lllllllllllllIlIIlIIlIlllllIlIll.get(lllllllllllllIlIIlIIlIlllllIlIlI);
            if (lIlllIlllIIlIlI(lllllllllllllIlIIlIIlIllllllIlIl)) {
                return lllllllllllllIlIIlIIlIllllllIlIl;
            }
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        else {
            final SoftReference lllllllllllllIlIIlIIlIllllllIIll = lllllllllllllIlIIlIIlIlllllIlIll.get(lllllllllllllIlIIlIIlIlllllIlIlI);
            if (lIlllIlllIIlIlI(lllllllllllllIlIIlIIlIllllllIIll)) {
                final TextureImpl lllllllllllllIlIIlIIlIllllllIlII = lllllllllllllIlIIlIIlIllllllIIll.get();
                if (lIlllIlllIIlIlI(lllllllllllllIlIIlIIlIllllllIlII)) {
                    return lllllllllllllIlIIlIIlIllllllIlII;
                }
                lllllllllllllIlIIlIIlIlllllIlIll.remove(lllllllllllllIlIIlIIlIlllllIlIlI);
                "".length();
            }
        }
        try {
            InternalTextureLoader.GL.glGetError();
            "".length();
            if (-(0xBE ^ 0xBA) >= 0) {
                return null;
            }
        }
        catch (NullPointerException lllllllllllllIlIIlIIlIllllllIIlI) {
            throw new RuntimeException(InternalTextureLoader.lIIIIllIIlllII[InternalTextureLoader.lIIIIllIlIIIIl[7]]);
        }
        final TextureImpl lllllllllllllIlIIlIIlIlllllIlIIl = this.getTexture(lllllllllllllIlIIlIIlIllllllIIII, lllllllllllllIlIIlIIlIlllllIIllI, InternalTextureLoader.lIIIIllIlIIIIl[8], lllllllllllllIlIIlIIlIlllllIllIl, lllllllllllllIlIIlIIlIlllllIllIl, lllllllllllllIlIIlIIlIlllllIlllI, lllllllllllllIlIIlIIlIlllllIIIll);
        lllllllllllllIlIIlIIlIlllllIlIIl.setCacheName(lllllllllllllIlIIlIIlIlllllIlIlI);
        if (lIlllIlllIIlIII(this.holdTextureData ? 1 : 0)) {
            lllllllllllllIlIIlIIlIlllllIlIll.put(lllllllllllllIlIIlIIlIlllllIlIlI, lllllllllllllIlIIlIIlIlllllIlIIl);
            "".length();
            "".length();
            if ((89 + 116 - 198 + 129 ^ 20 + 120 - 128 + 128) < 0) {
                return null;
            }
        }
        else {
            lllllllllllllIlIIlIIlIlllllIlIll.put(lllllllllllllIlIIlIIlIlllllIlIlI, new SoftReference<TextureImpl>(lllllllllllllIlIIlIIlIlllllIlIIl));
            "".length();
        }
        return lllllllllllllIlIIlIIlIlllllIlIIl;
    }
    
    public static InternalTextureLoader get() {
        return InternalTextureLoader.loader;
    }
    
    private static void lIlllIllIlllIIl() {
        (lIIIIllIIlllII = new String[InternalTextureLoader.lIIIIllIlIIIIl[19]])[InternalTextureLoader.lIIIIllIlIIIIl[3]] = lIlllIllIllIIll("bw==", "UzGeX");
        InternalTextureLoader.lIIIIllIIlllII[InternalTextureLoader.lIIIIllIlIIIIl[2]] = lIlllIllIllIlII("G5UtW+8uB4M=", "IgQyD");
        InternalTextureLoader.lIIIIllIIlllII[InternalTextureLoader.lIIIIllIlIIIIl[5]] = lIlllIllIllIlIl("tQVB5ozaie8=", "dypHg");
        InternalTextureLoader.lIIIIllIIlllII[InternalTextureLoader.lIIIIllIlIIIIl[6]] = lIlllIllIllIIll("ag==", "PwWaZ");
        InternalTextureLoader.lIIIIllIIlllII[InternalTextureLoader.lIIIIllIlIIIIl[7]] = lIlllIllIllIIll("IA8TNBRJABMgFA1CADYCBhcAMBQaQh8mAh1CEDZRBQ0TNxQNQhMgURkDACdRBgRSOh8AFlp6UQYQUicZDEIVMhwMQh48HhlMUgcZDBtSMBAHDB0nUQsHUj8eCAYXN1ELBxQ8AwxCGz0YHQsTPxgaAwY6HgdM", "ibrSq");
        InternalTextureLoader.lIIIIllIIlllII[InternalTextureLoader.lIIIIllIlIIIIl[12]] = lIlllIllIllIlIl("ksxuiFvKpBhHwve6eD7wb3FeGl/eJ2tnhtifq4/LWZgeUBkwjVjbUeTIWOAWh4Bg5MIDnvoOhDUP7WTW0f856g==", "KOKfm");
        InternalTextureLoader.lIIIIllIIlllII[InternalTextureLoader.lIIIIllIlIIIIl[17]] = lIlllIllIllIlII("lJpfttjzeSNXt3c3aGdThw==", "rLNDS");
        InternalTextureLoader.lIIIIllIIlllII[InternalTextureLoader.lIIIIllIlIIIIl[18]] = lIlllIllIllIlII("i0BTP1Hd1kddoxGAytjz7Guc7yRf45yk9j3su4rgmdl75sNRROYwBlF5RD2m6NhOrqvTeUKjU6ArGoBwF/HQKw==", "kujJd");
    }
    
    public void reload() {
        Iterator lllllllllllllIlIIlIIlIllIIllllll = this.texturesLinear.values().iterator();
        while (lIlllIlllIIlIII(lllllllllllllIlIIlIIlIllIIllllll.hasNext() ? 1 : 0)) {
            lllllllllllllIlIIlIIlIllIIllllll.next().reload();
            "".length();
            if (" ".length() <= ((0x48 ^ 0x57) & ~(0x5A ^ 0x45))) {
                return;
            }
        }
        lllllllllllllIlIIlIIlIllIIllllll = this.texturesNearest.values().iterator();
        while (lIlllIlllIIlIII(lllllllllllllIlIIlIIlIllIIllllll.hasNext() ? 1 : 0)) {
            lllllllllllllIlIIlIIlIllIIllllll.next().reload();
            "".length();
            if (null != null) {
                return;
            }
        }
    }
    
    public static IntBuffer createIntBuffer(final int lllllllllllllIlIIlIIlIllIlIIIllI) {
        final ByteBuffer lllllllllllllIlIIlIIlIllIlIIIlIl = ByteBuffer.allocateDirect(InternalTextureLoader.lIIIIllIlIIIIl[7] * lllllllllllllIlIIlIIlIllIlIIIllI);
        lllllllllllllIlIIlIIlIllIlIIIlIl.order(ByteOrder.nativeOrder());
        "".length();
        return lllllllllllllIlIIlIIlIllIlIIIlIl.asIntBuffer();
    }
    
    public void clear(final String lllllllllllllIlIIlIIllIIIllIIIII) {
        this.texturesLinear.remove(lllllllllllllIlIIlIIllIIIllIIIII);
        "".length();
        this.texturesNearest.remove(lllllllllllllIlIIlIIllIIIllIIIII);
        "".length();
    }
    
    private static void lIlllIlllIIIlll() {
        (lIIIIllIlIIIIl = new int[20])[0] = (0xFFFFDB8A & 0x3D7D);
        InternalTextureLoader.lIIIIllIlIIIIl[1] = (0xFFFFAC7F & 0xD3DB);
        InternalTextureLoader.lIIIIllIlIIIIl[2] = " ".length();
        InternalTextureLoader.lIIIIllIlIIIIl[3] = ((0x17 ^ 0x57 ^ (0xFB ^ 0xA9)) & (0x69 ^ 0x3F ^ (0x1E ^ 0x5A) ^ -" ".length()));
        InternalTextureLoader.lIIIIllIlIIIIl[4] = (-(0xFFFFD8ED & 0x77F7) & (0xFFFFF7F6 & 0x7EED));
        InternalTextureLoader.lIIIIllIlIIIIl[5] = "  ".length();
        InternalTextureLoader.lIIIIllIlIIIIl[6] = "   ".length();
        InternalTextureLoader.lIIIIllIlIIIIl[7] = (0x1B ^ 0x54 ^ (0x50 ^ 0x1B));
        InternalTextureLoader.lIIIIllIlIIIIl[8] = (0xFFFF9DF7 & 0x6FE9);
        InternalTextureLoader.lIIIIllIlIIIIl[9] = (0x69 ^ 0x49);
        InternalTextureLoader.lIIIIllIlIIIIl[10] = (0x38 ^ 0x45 ^ (0x43 ^ 0x2E));
        InternalTextureLoader.lIIIIllIlIIIIl[11] = (-(0xFFFFF24B & 0x6FF5) & (0xFFFFFF7F & 0x6FF3));
        InternalTextureLoader.lIIIIllIlIIIIl[12] = (0x4E ^ 0x4B);
        InternalTextureLoader.lIIIIllIlIIIIl[13] = (0xFFFFFFC7 & 0x193F);
        InternalTextureLoader.lIIIIllIlIIIIl[14] = (0xFFFFAFC1 & 0x783F);
        InternalTextureLoader.lIIIIllIlIIIIl[15] = (0xFFFFFF39 & 0x28C6);
        InternalTextureLoader.lIIIIllIlIIIIl[16] = (-(0xFFFFF1EF & 0x6FDF) & (0xFFFFF7FF & 0x7DCF));
        InternalTextureLoader.lIIIIllIlIIIIl[17] = (0x13 ^ 0x15);
        InternalTextureLoader.lIIIIllIlIIIIl[18] = (2 + 55 - 56 + 149 ^ 59 + 128 - 137 + 95);
        InternalTextureLoader.lIIIIllIlIIIIl[19] = (0x30 ^ 0x34 ^ (0xC ^ 0x0));
    }
    
    public void clear() {
        this.texturesLinear.clear();
        this.texturesNearest.clear();
    }
    
    private static boolean lIlllIlllIIlIlI(final Object lllllllllllllIlIIlIIlIlIlllIIIII) {
        return lllllllllllllIlIIlIIlIlIlllIIIII != null;
    }
    
    private static String lIlllIllIllIlIl(final String lllllllllllllIlIIlIIlIlIllllIlll, final String lllllllllllllIlIIlIIlIlIllllIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIlIlIlllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIlIlIllllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIIlIlIlllllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIIlIlIlllllIIl.init(InternalTextureLoader.lIIIIllIlIIIIl[5], lllllllllllllIlIIlIIlIlIlllllIlI);
            return new String(lllllllllllllIlIIlIIlIlIlllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIlIlIllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIlIlIlllllIII) {
            lllllllllllllIlIIlIIlIlIlllllIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlllIlllIIlIll(final int lllllllllllllIlIIlIIlIlIlllIIlll, final int lllllllllllllIlIIlIIlIlIlllIIllI) {
        return lllllllllllllIlIIlIIlIlIlllIIlll <= lllllllllllllIlIIlIIlIlIlllIIllI;
    }
    
    public int reload(final TextureImpl lllllllllllllIlIIlIIlIllIIlIlIlI, final int lllllllllllllIlIIlIIlIllIIllIIlI, final int lllllllllllllIlIIlIIlIllIIllIIIl, final int lllllllllllllIlIIlIIlIllIIllIIII, final int lllllllllllllIlIIlIIlIllIIlIIlll, final ByteBuffer lllllllllllllIlIIlIIlIllIIlIIllI) {
        final int lllllllllllllIlIIlIIlIllIIlIllIl = InternalTextureLoader.lIIIIllIlIIIIl[8];
        final int lllllllllllllIlIIlIIlIllIIlIllII = createTextureID();
        InternalTextureLoader.GL.glBindTexture(lllllllllllllIlIIlIIlIllIIlIllIl, lllllllllllllIlIIlIIlIllIIlIllII);
        InternalTextureLoader.GL.glTexParameteri(lllllllllllllIlIIlIIlIllIIlIllIl, InternalTextureLoader.lIIIIllIlIIIIl[14], lllllllllllllIlIIlIIlIllIIllIIII);
        InternalTextureLoader.GL.glTexParameteri(lllllllllllllIlIIlIIlIllIIlIllIl, InternalTextureLoader.lIIIIllIlIIIIl[15], lllllllllllllIlIIlIIlIllIIlIIlll);
        InternalTextureLoader.GL.glTexImage2D(lllllllllllllIlIIlIIlIllIIlIllIl, InternalTextureLoader.lIIIIllIlIIIIl[3], this.dstPixelFormat, lllllllllllllIlIIlIIlIllIIlIlIlI.getTextureWidth(), lllllllllllllIlIIlIIlIllIIlIlIlI.getTextureHeight(), InternalTextureLoader.lIIIIllIlIIIIl[3], lllllllllllllIlIIlIIlIllIIllIIlI, InternalTextureLoader.lIIIIllIlIIIIl[16], lllllllllllllIlIIlIIlIllIIlIIllI);
        return lllllllllllllIlIIlIIlIllIIlIllII;
    }
    
    public Texture getTexture(final String lllllllllllllIlIIlIIllIIIIlIIlII, final boolean lllllllllllllIlIIlIIllIIIIlIIIll, final int lllllllllllllIlIIlIIllIIIIlIIlll) throws IOException {
        final InputStream lllllllllllllIlIIlIIllIIIIlIIllI = ResourceLoader.getResourceAsStream(lllllllllllllIlIIlIIllIIIIlIIlII);
        return this.getTexture(lllllllllllllIlIIlIIllIIIIlIIllI, lllllllllllllIlIIlIIllIIIIlIIlII, lllllllllllllIlIIlIIllIIIIlIIIll, lllllllllllllIlIIlIIllIIIIlIIlll, null);
    }
    
    public Texture createTexture(final int lllllllllllllIlIIlIIlIlllIIllIII, final int lllllllllllllIlIIlIIlIlllIIlIlll) throws IOException {
        return this.createTexture(lllllllllllllIlIIlIIlIlllIIllIII, lllllllllllllIlIIlIIlIlllIIlIlll, InternalTextureLoader.lIIIIllIlIIIIl[4]);
    }
    
    private static String lIlllIllIllIIll(String lllllllllllllIlIIlIIlIllIIIIIlll, final String lllllllllllllIlIIlIIlIllIIIIlIll) {
        lllllllllllllIlIIlIIlIllIIIIIlll = new String(Base64.getDecoder().decode(lllllllllllllIlIIlIIlIllIIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIIlIllIIIIlIlI = new StringBuilder();
        final char[] lllllllllllllIlIIlIIlIllIIIIlIIl = lllllllllllllIlIIlIIlIllIIIIlIll.toCharArray();
        int lllllllllllllIlIIlIIlIllIIIIlIII = InternalTextureLoader.lIIIIllIlIIIIl[3];
        final float lllllllllllllIlIIlIIlIllIIIIIIlI = (Object)lllllllllllllIlIIlIIlIllIIIIIlll.toCharArray();
        final double lllllllllllllIlIIlIIlIllIIIIIIIl = lllllllllllllIlIIlIIlIllIIIIIIlI.length;
        byte lllllllllllllIlIIlIIlIllIIIIIIII = (byte)InternalTextureLoader.lIIIIllIlIIIIl[3];
        while (lIlllIlllIIllIl(lllllllllllllIlIIlIIlIllIIIIIIII, (int)lllllllllllllIlIIlIIlIllIIIIIIIl)) {
            final char lllllllllllllIlIIlIIlIllIIIIllIl = lllllllllllllIlIIlIIlIllIIIIIIlI[lllllllllllllIlIIlIIlIllIIIIIIII];
            lllllllllllllIlIIlIIlIllIIIIlIlI.append((char)(lllllllllllllIlIIlIIlIllIIIIllIl ^ lllllllllllllIlIIlIIlIllIIIIlIIl[lllllllllllllIlIIlIIlIllIIIIlIII % lllllllllllllIlIIlIIlIllIIIIlIIl.length]));
            "".length();
            ++lllllllllllllIlIIlIIlIllIIIIlIII;
            ++lllllllllllllIlIIlIIlIllIIIIIIII;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIIlIllIIIIlIlI);
    }
    
    static {
        lIlllIlllIIIlll();
        lIlllIllIlllIIl();
        InternalTextureLoader.GL = Renderer.get();
        loader = new InternalTextureLoader();
    }
    
    public boolean isDeferredLoading() {
        return this.deferred;
    }
    
    public Texture getTexture(final File lllllllllllllIlIIlIIllIIIIllIlIl, final boolean lllllllllllllIlIIlIIllIIIIllIlII, final int lllllllllllllIlIIlIIllIIIIlllIlI, final int[] lllllllllllllIlIIlIIllIIIIllIIlI) throws IOException {
        final String lllllllllllllIlIIlIIllIIIIlllIII = lllllllllllllIlIIlIIllIIIIllIlIl.getAbsolutePath();
        final InputStream lllllllllllllIlIIlIIllIIIIllIlll = new FileInputStream(lllllllllllllIlIIlIIllIIIIllIlIl);
        return this.getTexture(lllllllllllllIlIIlIIllIIIIllIlll, lllllllllllllIlIIlIIllIIIIlllIII, lllllllllllllIlIIlIIllIIIIllIlII, lllllllllllllIlIIlIIllIIIIlllIlI, lllllllllllllIlIIlIIllIIIIllIIlI);
    }
    
    public void setDeferredLoading(final boolean lllllllllllllIlIIlIIllIIIllIlIll) {
        this.deferred = lllllllllllllIlIIlIIllIIIllIlIll;
    }
    
    private static boolean lIlllIlllIIllII(final int lllllllllllllIlIIlIIlIlIlllIIIll, final int lllllllllllllIlIIlIIlIlIlllIIIlI) {
        return lllllllllllllIlIIlIIlIlIlllIIIll > lllllllllllllIlIIlIIlIlIlllIIIlI;
    }
    
    public void set16BitMode() {
        this.dstPixelFormat = InternalTextureLoader.lIIIIllIlIIIIl[1];
    }
    
    public Texture getTexture(final String lllllllllllllIlIIlIIllIIIIIllIIl, final boolean lllllllllllllIlIIlIIllIIIIIllIII, final int lllllllllllllIlIIlIIllIIIIIlIlll, final int[] lllllllllllllIlIIlIIllIIIIIlIIII) throws IOException {
        final InputStream lllllllllllllIlIIlIIllIIIIIlIlIl = ResourceLoader.getResourceAsStream(lllllllllllllIlIIlIIllIIIIIllIIl);
        return this.getTexture(lllllllllllllIlIIlIIllIIIIIlIlIl, lllllllllllllIlIIlIIllIIIIIllIIl, lllllllllllllIlIIlIIllIIIIIllIII, lllllllllllllIlIIlIIllIIIIIlIlll, lllllllllllllIlIIlIIllIIIIIlIIII);
    }
    
    public Texture getTexture(final File lllllllllllllIlIIlIIllIIIlIIlIIl, final boolean lllllllllllllIlIIlIIllIIIlIIlIII, final int lllllllllllllIlIIlIIllIIIlIIllIl) throws IOException {
        final String lllllllllllllIlIIlIIllIIIlIIllII = lllllllllllllIlIIlIIllIIIlIIlIIl.getAbsolutePath();
        final InputStream lllllllllllllIlIIlIIllIIIlIIlIll = new FileInputStream(lllllllllllllIlIIlIIllIIIlIIlIIl);
        return this.getTexture(lllllllllllllIlIIlIIllIIIlIIlIll, lllllllllllllIlIIlIIllIIIlIIllII, lllllllllllllIlIIlIIllIIIlIIlIII, lllllllllllllIlIIlIIllIIIlIIllIl, null);
    }
    
    public Texture createTexture(final int lllllllllllllIlIIlIIlIlllIIIlIll, final int lllllllllllllIlIIlIIlIlllIIIllll, final int lllllllllllllIlIIlIIlIlllIIIlIIl) throws IOException {
        final ImageData lllllllllllllIlIIlIIlIlllIIIllIl = new EmptyImageData(lllllllllllllIlIIlIIlIlllIIIlIll, lllllllllllllIlIIlIIlIlllIIIllll);
        return this.getTexture(lllllllllllllIlIIlIIlIlllIIIllIl, lllllllllllllIlIIlIIlIlllIIIlIIl);
    }
    
    private static boolean lIlllIlllIIlIII(final int lllllllllllllIlIIlIIlIlIllIllllI) {
        return lllllllllllllIlIIlIIlIlIllIllllI != 0;
    }
    
    public static int createTextureID() {
        final IntBuffer lllllllllllllIlIIlIIllIIIlIllIII = createIntBuffer(InternalTextureLoader.lIIIIllIlIIIIl[2]);
        InternalTextureLoader.GL.glGenTextures(lllllllllllllIlIIlIIllIIIlIllIII);
        return lllllllllllllIlIIlIIllIIIlIllIII.get(InternalTextureLoader.lIIIIllIlIIIIl[3]);
    }
    
    public Texture getTexture(final ImageData lllllllllllllIlIIlIIlIllIllIIIII, final int lllllllllllllIlIIlIIlIllIlIlllll) throws IOException {
        final int lllllllllllllIlIIlIIlIllIlllIIIl = InternalTextureLoader.lIIIIllIlIIIIl[8];
        final ByteBuffer lllllllllllllIlIIlIIlIllIlllIIII = lllllllllllllIlIIlIIlIllIllIIIII.getImageBufferData();
        final int lllllllllllllIlIIlIIlIllIllIllll = createTextureID();
        final TextureImpl lllllllllllllIlIIlIIlIllIllIlllI = new TextureImpl(String.valueOf(new StringBuilder().append(InternalTextureLoader.lIIIIllIIlllII[InternalTextureLoader.lIIIIllIlIIIIl[17]]).append(lllllllllllllIlIIlIIlIllIllIIIII)), lllllllllllllIlIIlIIlIllIlllIIIl, lllllllllllllIlIIlIIlIllIllIllll);
        final int lllllllllllllIlIIlIIlIllIllIllIl = lllllllllllllIlIIlIIlIllIlIlllll;
        final int lllllllllllllIlIIlIIlIllIllIllII = lllllllllllllIlIIlIIlIllIlIlllll;
        final boolean lllllllllllllIlIIlIIlIllIllIlIll = InternalTextureLoader.lIIIIllIlIIIIl[3] != 0;
        InternalTextureLoader.GL.glBindTexture(lllllllllllllIlIIlIIlIllIlllIIIl, lllllllllllllIlIIlIIlIllIllIllll);
        final int lllllllllllllIlIIlIIlIllIllIlIlI = lllllllllllllIlIIlIIlIllIllIIIII.getWidth();
        final int lllllllllllllIlIIlIIlIllIllIlIIl = lllllllllllllIlIIlIIlIllIllIIIII.getHeight();
        int n;
        if (lIlllIlllIIlIIl(lllllllllllllIlIIlIIlIllIllIIIII.getDepth(), InternalTextureLoader.lIIIIllIlIIIIl[9])) {
            n = InternalTextureLoader.lIIIIllIlIIIIl[2];
            "".length();
            if ((0x44 ^ 0x2C ^ (0x26 ^ 0x4A)) <= ((0x64 ^ 0x8 ^ (0xF6 ^ 0x84)) & (43 + 23 - 47 + 134 ^ 1 + 90 + 21 + 23 ^ -" ".length()))) {
                return null;
            }
        }
        else {
            n = InternalTextureLoader.lIIIIllIlIIIIl[3];
        }
        final boolean lllllllllllllIlIIlIIlIllIllIIllI = n != 0;
        lllllllllllllIlIIlIIlIllIllIlllI.setTextureWidth(lllllllllllllIlIIlIIlIllIllIIIII.getTexWidth());
        lllllllllllllIlIIlIIlIllIllIlllI.setTextureHeight(lllllllllllllIlIIlIIlIllIllIIIII.getTexHeight());
        final int lllllllllllllIlIIlIIlIllIllIlIII = lllllllllllllIlIIlIIlIllIllIlllI.getTextureWidth();
        final int lllllllllllllIlIIlIIlIllIllIIlll = lllllllllllllIlIIlIIlIllIllIlllI.getTextureHeight();
        int n2;
        if (lIlllIlllIIlIII(lllllllllllllIlIIlIIlIllIllIIllI ? 1 : 0)) {
            n2 = InternalTextureLoader.lIIIIllIlIIIIl[0];
            "".length();
            if (" ".length() >= "   ".length()) {
                return null;
            }
        }
        else {
            n2 = InternalTextureLoader.lIIIIllIlIIIIl[13];
        }
        final int lllllllllllllIlIIlIIlIllIllIIlIl = n2;
        int n3;
        if (lIlllIlllIIlIII(lllllllllllllIlIIlIIlIllIllIIllI ? 1 : 0)) {
            n3 = InternalTextureLoader.lIIIIllIlIIIIl[7];
            "".length();
            if (-(0x7 ^ 0x2) >= 0) {
                return null;
            }
        }
        else {
            n3 = InternalTextureLoader.lIIIIllIlIIIIl[6];
        }
        final int lllllllllllllIlIIlIIlIllIllIIlII = n3;
        lllllllllllllIlIIlIIlIllIllIlllI.setWidth(lllllllllllllIlIIlIIlIllIllIlIlI);
        lllllllllllllIlIIlIIlIllIllIlllI.setHeight(lllllllllllllIlIIlIIlIllIllIlIIl);
        lllllllllllllIlIIlIIlIllIllIlllI.setAlpha(lllllllllllllIlIIlIIlIllIllIIllI);
        final IntBuffer lllllllllllllIlIIlIIlIllIllIIIll = BufferUtils.createIntBuffer(InternalTextureLoader.lIIIIllIlIIIIl[10]);
        InternalTextureLoader.GL.glGetInteger(InternalTextureLoader.lIIIIllIlIIIIl[11], lllllllllllllIlIIlIIlIllIllIIIll);
        final int lllllllllllllIlIIlIIlIllIllIIIlI = lllllllllllllIlIIlIIlIllIllIIIll.get(InternalTextureLoader.lIIIIllIlIIIIl[3]);
        if (!lIlllIlllIIlIll(lllllllllllllIlIIlIIlIllIllIlIII, lllllllllllllIlIIlIIlIllIllIIIlI) || lIlllIlllIIllII(lllllllllllllIlIIlIIlIllIllIIlll, lllllllllllllIlIIlIIlIllIllIIIlI)) {
            throw new IOException(InternalTextureLoader.lIIIIllIIlllII[InternalTextureLoader.lIIIIllIlIIIIl[18]]);
        }
        if (lIlllIlllIIlIII(this.holdTextureData ? 1 : 0)) {
            lllllllllllllIlIIlIIlIllIllIlllI.setTextureData(lllllllllllllIlIIlIIlIllIllIIlIl, lllllllllllllIlIIlIIlIllIllIIlII, lllllllllllllIlIIlIIlIllIllIllIl, lllllllllllllIlIIlIIlIllIllIllII, lllllllllllllIlIIlIIlIllIlllIIII);
        }
        InternalTextureLoader.GL.glTexParameteri(lllllllllllllIlIIlIIlIllIlllIIIl, InternalTextureLoader.lIIIIllIlIIIIl[14], lllllllllllllIlIIlIIlIllIllIllIl);
        InternalTextureLoader.GL.glTexParameteri(lllllllllllllIlIIlIIlIllIlllIIIl, InternalTextureLoader.lIIIIllIlIIIIl[15], lllllllllllllIlIIlIIlIllIllIllII);
        InternalTextureLoader.GL.glTexImage2D(lllllllllllllIlIIlIIlIllIlllIIIl, InternalTextureLoader.lIIIIllIlIIIIl[3], this.dstPixelFormat, get2Fold(lllllllllllllIlIIlIIlIllIllIlIlI), get2Fold(lllllllllllllIlIIlIIlIllIllIlIIl), InternalTextureLoader.lIIIIllIlIIIIl[3], lllllllllllllIlIIlIIlIllIllIIlIl, InternalTextureLoader.lIIIIllIlIIIIl[16], lllllllllllllIlIIlIIlIllIlllIIII);
        return lllllllllllllIlIIlIIlIllIllIlllI;
    }
    
    public static int get2Fold(final int lllllllllllllIlIIlIIlIllIlIIllII) {
        int lllllllllllllIlIIlIIlIllIlIIlIll = InternalTextureLoader.lIIIIllIlIIIIl[5];
        while (lIlllIlllIIllIl(lllllllllllllIlIIlIIlIllIlIIlIll, lllllllllllllIlIIlIIlIllIlIIllII)) {
            lllllllllllllIlIIlIIlIllIlIIlIll *= InternalTextureLoader.lIIIIllIlIIIIl[5];
            "".length();
            if (((0x66 ^ 0x61 ^ (0x74 ^ 0x25)) & ("   ".length() ^ (0x7A ^ 0x2F) ^ -" ".length())) > (0x45 ^ 0x5A ^ (0xA4 ^ 0xBF))) {
                return (116 + 12 - 46 + 55 ^ 56 + 87 - 62 + 71) & (0x16 ^ 0x12 ^ (0x99 ^ 0x8C) ^ -" ".length());
            }
        }
        return lllllllllllllIlIIlIIlIllIlIIlIll;
    }
}
