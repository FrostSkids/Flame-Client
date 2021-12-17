// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl;

import org.newdawn.slick.util.Log;
import java.io.BufferedInputStream;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.io.InputStream;
import java.util.ArrayList;

public class CompositeImageData implements LoadableImageData
{
    private /* synthetic */ LoadableImageData picked;
    private /* synthetic */ ArrayList sources;
    private static final /* synthetic */ String[] llllIlIlIlIll;
    private static final /* synthetic */ int[] llllIllIlIIlI;
    
    public void configureEdging(final boolean lllllllllllllIlIllIlIIIlIlIllIll) {
        int lllllllllllllIlIllIlIIIlIlIlllll = CompositeImageData.llllIllIlIIlI[0];
        while (lIlIlIllIlIIIll(lllllllllllllIlIllIlIIIlIlIlllll, this.sources.size())) {
            this.sources.get(lllllllllllllIlIllIlIIIlIlIlllll).configureEdging(lllllllllllllIlIllIlIIIlIlIllIll);
            ++lllllllllllllIlIllIlIIIlIlIlllll;
            "".length();
            if (" ".length() < 0) {
                return;
            }
        }
    }
    
    public CompositeImageData() {
        this.sources = new ArrayList();
    }
    
    public ByteBuffer loadImage(final InputStream lllllllllllllIlIllIlIIIllIIlllIl, final boolean lllllllllllllIlIllIlIIIllIIlllII, final int[] lllllllllllllIlIllIlIIIllIIlIlll) throws IOException {
        return this.loadImage(lllllllllllllIlIllIlIIIllIIlllIl, lllllllllllllIlIllIlIIIllIIlllII, (boolean)(CompositeImageData.llllIllIlIIlI[0] != 0), lllllllllllllIlIllIlIIIllIIlIlll);
    }
    
    static {
        lIlIlIllIlIIIlI();
        lIlIlIlIlIIIlIl();
    }
    
    private static void lIlIlIllIlIIIlI() {
        (llllIllIlIIlI = new int[4])[0] = ((0xC6 ^ 0x8D) & ~(0xD6 ^ 0x9D));
        CompositeImageData.llllIllIlIIlI[1] = " ".length();
        CompositeImageData.llllIllIlIIlI[2] = "  ".length();
        CompositeImageData.llllIllIlIIlI[3] = (0xAF ^ 0xA7);
    }
    
    public ByteBuffer getImageBufferData() {
        this.checkPicked();
        return this.picked.getImageBufferData();
    }
    
    private static String lIlIlIlIlIIIlII(final String lllllllllllllIlIllIlIIIlIlIlIIII, final String lllllllllllllIlIllIlIIIlIlIIllll) {
        try {
            final SecretKeySpec lllllllllllllIlIllIlIIIlIlIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIlIIIlIlIIllll.getBytes(StandardCharsets.UTF_8)), CompositeImageData.llllIllIlIIlI[3]), "DES");
            final Cipher lllllllllllllIlIllIlIIIlIlIlIlII = Cipher.getInstance("DES");
            lllllllllllllIlIllIlIIIlIlIlIlII.init(CompositeImageData.llllIllIlIIlI[2], lllllllllllllIlIllIlIIIlIlIlIlIl);
            return new String(lllllllllllllIlIllIlIIIlIlIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIlIIIlIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIlIIIlIlIlIIll) {
            lllllllllllllIlIllIlIIIlIlIlIIll.printStackTrace();
            return null;
        }
    }
    
    public int getWidth() {
        this.checkPicked();
        return this.picked.getWidth();
    }
    
    public int getTexWidth() {
        this.checkPicked();
        return this.picked.getTexWidth();
    }
    
    public void add(final LoadableImageData lllllllllllllIlIllIlIIIllIlIlIll) {
        this.sources.add(lllllllllllllIlIllIlIIIllIlIlIll);
        "".length();
    }
    
    public ByteBuffer loadImage(final InputStream lllllllllllllIlIllIlIIIllIIIIIII, final boolean lllllllllllllIlIllIlIIIllIIIIlll, final boolean lllllllllllllIlIllIlIIIllIIIIllI, final int[] lllllllllllllIlIllIlIIIllIIIIlIl) throws IOException {
        final CompositeIOException lllllllllllllIlIllIlIIIllIIIIlII = new CompositeIOException();
        ByteBuffer lllllllllllllIlIllIlIIIllIIIIIll = null;
        final BufferedInputStream lllllllllllllIlIllIlIIIllIIIIIlI = new BufferedInputStream(lllllllllllllIlIllIlIIIllIIIIIII, lllllllllllllIlIllIlIIIllIIIIIII.available());
        lllllllllllllIlIllIlIIIllIIIIIlI.mark(lllllllllllllIlIllIlIIIllIIIIIII.available());
        int lllllllllllllIlIllIlIIIllIIIlIlI = CompositeImageData.llllIllIlIIlI[0];
        while (lIlIlIllIlIIIll(lllllllllllllIlIllIlIIIllIIIlIlI, this.sources.size())) {
            lllllllllllllIlIllIlIIIllIIIIIlI.reset();
            try {
                final LoadableImageData lllllllllllllIlIllIlIIIllIIIllII = this.sources.get(lllllllllllllIlIllIlIIIllIIIlIlI);
                lllllllllllllIlIllIlIIIllIIIIIll = lllllllllllllIlIllIlIIIllIIIllII.loadImage(lllllllllllllIlIllIlIIIllIIIIIlI, lllllllllllllIlIllIlIIIllIIIIlll, lllllllllllllIlIllIlIIIllIIIIllI, lllllllllllllIlIllIlIIIllIIIIlIl);
                this.picked = lllllllllllllIlIllIlIIIllIIIllII;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (Exception lllllllllllllIlIllIlIIIllIIIlIll) {
                Log.warn(String.valueOf(new StringBuilder().append(this.sources.get(lllllllllllllIlIllIlIIIllIIIlIlI).getClass()).append(CompositeImageData.llllIlIlIlIll[CompositeImageData.llllIllIlIIlI[0]])), lllllllllllllIlIllIlIIIllIIIlIll);
                lllllllllllllIlIllIlIIIllIIIIlII.addException(lllllllllllllIlIllIlIIIllIIIlIll);
                ++lllllllllllllIlIllIlIIIllIIIlIlI;
                "".length();
                if (((164 + 50 - 151 + 122 ^ 116 + 54 - 124 + 98) & (0x83 ^ 0xBA ^ (0x6 ^ 0x16) ^ -" ".length())) != (" ".length() & (" ".length() ^ -" ".length()))) {
                    return null;
                }
                continue;
            }
            break;
        }
        if (lIlIlIllIlIIlII(this.picked)) {
            throw lllllllllllllIlIllIlIIIllIIIIlII;
        }
        return lllllllllllllIlIllIlIIIllIIIIIll;
    }
    
    private void checkPicked() {
        if (lIlIlIllIlIIlII(this.picked)) {
            throw new RuntimeException(CompositeImageData.llllIlIlIlIll[CompositeImageData.llllIllIlIIlI[1]]);
        }
    }
    
    public int getDepth() {
        this.checkPicked();
        return this.picked.getDepth();
    }
    
    public int getHeight() {
        this.checkPicked();
        return this.picked.getHeight();
    }
    
    private static void lIlIlIlIlIIIlIl() {
        (llllIlIlIlIll = new String[CompositeImageData.llllIllIlIIlI[2]])[CompositeImageData.llllIllIlIIlI[0]] = lIlIlIlIlIIIlII("nJGFpJg4rxy86MVocysEL9SZsLsokpEb0DAXnnr8LzU=", "fQEOE");
        CompositeImageData.llllIlIlIlIll[CompositeImageData.llllIllIlIIlI[1]] = lIlIlIlIlIIIlII("bpxyjc79j83Gz7pLxHZ804TGhmyGAf0NJwTh+wyALSl6j/UDYzvgcYzH4Mxwwogt2aWWeqdF6pL5mJrJw4WOXyH5QPDLpEet", "DVhdL");
    }
    
    private static boolean lIlIlIllIlIIlII(final Object lllllllllllllIlIllIlIIIlIlIIIlll) {
        return lllllllllllllIlIllIlIIIlIlIIIlll == null;
    }
    
    public int getTexHeight() {
        this.checkPicked();
        return this.picked.getTexHeight();
    }
    
    public ByteBuffer loadImage(final InputStream lllllllllllllIlIllIlIIIllIlIIlIl) throws IOException {
        return this.loadImage(lllllllllllllIlIllIlIIIllIlIIlIl, (boolean)(CompositeImageData.llllIllIlIIlI[0] != 0), null);
    }
    
    private static boolean lIlIlIllIlIIIll(final int lllllllllllllIlIllIlIIIlIlIIlIlI, final int lllllllllllllIlIllIlIIIlIlIIlIIl) {
        return lllllllllllllIlIllIlIIIlIlIIlIlI < lllllllllllllIlIllIlIIIlIlIIlIIl;
    }
}
