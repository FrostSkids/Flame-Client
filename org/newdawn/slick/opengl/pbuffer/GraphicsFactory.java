// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl.pbuffer;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.util.Log;
import org.newdawn.slick.SlickException;
import org.lwjgl.opengl.Pbuffer;
import org.lwjgl.opengl.GLContext;
import java.util.HashMap;

public class GraphicsFactory
{
    private static /* synthetic */ boolean fbo;
    private static /* synthetic */ boolean init;
    private static /* synthetic */ boolean pbufferRT;
    private static final /* synthetic */ String[] llllllllIllIl;
    private static /* synthetic */ boolean pbuffer;
    private static /* synthetic */ HashMap graphics;
    private static final /* synthetic */ int[] llllllllIllll;
    
    private static void init() throws SlickException {
        GraphicsFactory.init = (GraphicsFactory.llllllllIllll[0] != 0);
        if (lIllIIIlllIlIll(GraphicsFactory.fbo ? 1 : 0)) {
            GraphicsFactory.fbo = GLContext.getCapabilities().GL_EXT_framebuffer_object;
        }
        int pbuffer;
        if (lIllIIIlllIlIll(Pbuffer.getCapabilities() & GraphicsFactory.llllllllIllll[0])) {
            pbuffer = GraphicsFactory.llllllllIllll[0];
            "".length();
            if ("   ".length() == 0) {
                return;
            }
        }
        else {
            pbuffer = GraphicsFactory.llllllllIllll[1];
        }
        GraphicsFactory.pbuffer = (pbuffer != 0);
        int pbufferRT;
        if (lIllIIIlllIlIll(Pbuffer.getCapabilities() & GraphicsFactory.llllllllIllll[2])) {
            pbufferRT = GraphicsFactory.llllllllIllll[0];
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
        else {
            pbufferRT = GraphicsFactory.llllllllIllll[1];
        }
        GraphicsFactory.pbufferRT = (pbufferRT != 0);
        if (lIllIIIlllIllII(GraphicsFactory.fbo ? 1 : 0) && lIllIIIlllIllII(GraphicsFactory.pbuffer ? 1 : 0) && lIllIIIlllIllII(GraphicsFactory.pbufferRT ? 1 : 0)) {
            throw new SlickException(GraphicsFactory.llllllllIllIl[GraphicsFactory.llllllllIllll[1]]);
        }
        Log.info(String.valueOf(new StringBuilder().append(GraphicsFactory.llllllllIllIl[GraphicsFactory.llllllllIllll[0]]).append(GraphicsFactory.fbo).append(GraphicsFactory.llllllllIllIl[GraphicsFactory.llllllllIllll[2]]).append(GraphicsFactory.pbuffer).append(GraphicsFactory.llllllllIllIl[GraphicsFactory.llllllllIllll[3]]).append(GraphicsFactory.pbufferRT)));
    }
    
    private static Graphics createGraphics(final Image lllllllllllllIlIlIIllIIlIIIIIIlI) throws SlickException {
        init();
        if (lIllIIIlllIlIll(GraphicsFactory.fbo ? 1 : 0)) {
            try {
                return new FBOGraphics(lllllllllllllIlIlIIllIIlIIIIIIlI);
            }
            catch (Exception lllllllllllllIlIlIIllIIlIIIIIlII) {
                GraphicsFactory.fbo = (GraphicsFactory.llllllllIllll[1] != 0);
                Log.warn(GraphicsFactory.llllllllIllIl[GraphicsFactory.llllllllIllll[4]]);
            }
        }
        if (!lIllIIIlllIlIll(GraphicsFactory.pbuffer ? 1 : 0)) {
            throw new SlickException(GraphicsFactory.llllllllIllIl[GraphicsFactory.llllllllIllll[5]]);
        }
        if (lIllIIIlllIlIll(GraphicsFactory.pbufferRT ? 1 : 0)) {
            return new PBufferGraphics(lllllllllllllIlIlIIllIIlIIIIIIlI);
        }
        return new PBufferUniqueGraphics(lllllllllllllIlIlIIllIIlIIIIIIlI);
    }
    
    private static boolean lIllIIIlllIlllI(final Object lllllllllllllIlIlIIllIIIllIIlIIl) {
        return lllllllllllllIlIlIIllIIIllIIlIIl != null;
    }
    
    public static boolean usingFBO() {
        return GraphicsFactory.fbo;
    }
    
    private static void lIllIIIlllIlIlI() {
        (llllllllIllll = new int[8])[0] = " ".length();
        GraphicsFactory.llllllllIllll[1] = ((0x22 ^ 0x18) & ~(0x76 ^ 0x4C));
        GraphicsFactory.llllllllIllll[2] = "  ".length();
        GraphicsFactory.llllllllIllll[3] = "   ".length();
        GraphicsFactory.llllllllIllll[4] = (0x4C ^ 0x48);
        GraphicsFactory.llllllllIllll[5] = (0x77 ^ 0x72);
        GraphicsFactory.llllllllIllll[6] = (0x1E ^ 0x18);
        GraphicsFactory.llllllllIllll[7] = (112 + 60 - 32 + 40 ^ 144 + 56 - 42 + 30);
    }
    
    private static String lIllIIIlllIIIIl(final String lllllllllllllIlIlIIllIIIllIlIlII, final String lllllllllllllIlIlIIllIIIllIlIIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIllIIIllIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIllIIIllIlIIIl.getBytes(StandardCharsets.UTF_8)), GraphicsFactory.llllllllIllll[7]), "DES");
            final Cipher lllllllllllllIlIlIIllIIIllIlIllI = Cipher.getInstance("DES");
            lllllllllllllIlIlIIllIIIllIlIllI.init(GraphicsFactory.llllllllIllll[2], lllllllllllllIlIlIIllIIIllIlIlll);
            return new String(lllllllllllllIlIlIIllIIIllIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIllIIIllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIllIIIllIlIlIl) {
            lllllllllllllIlIlIIllIIIllIlIlIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIllIIIllIlllll(String lllllllllllllIlIlIIllIIIlllIIlII, final String lllllllllllllIlIlIIllIIIlllIIIll) {
        lllllllllllllIlIlIIllIIIlllIIlII = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIIllIIIlllIIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIIllIIIlllIIlll = new StringBuilder();
        final char[] lllllllllllllIlIlIIllIIIlllIIllI = lllllllllllllIlIlIIllIIIlllIIIll.toCharArray();
        int lllllllllllllIlIlIIllIIIlllIIlIl = GraphicsFactory.llllllllIllll[1];
        final byte lllllllllllllIlIlIIllIIIllIlllll = (Object)((String)lllllllllllllIlIlIIllIIIlllIIlII).toCharArray();
        final byte lllllllllllllIlIlIIllIIIllIllllI = (byte)lllllllllllllIlIlIIllIIIllIlllll.length;
        double lllllllllllllIlIlIIllIIIllIlllIl = GraphicsFactory.llllllllIllll[1];
        while (lIllIIIlllIllll((int)lllllllllllllIlIlIIllIIIllIlllIl, lllllllllllllIlIlIIllIIIllIllllI)) {
            final char lllllllllllllIlIlIIllIIIlllIlIlI = lllllllllllllIlIlIIllIIIllIlllll[lllllllllllllIlIlIIllIIIllIlllIl];
            lllllllllllllIlIlIIllIIIlllIIlll.append((char)(lllllllllllllIlIlIIllIIIlllIlIlI ^ lllllllllllllIlIlIIllIIIlllIIllI[lllllllllllllIlIlIIllIIIlllIIlIl % lllllllllllllIlIlIIllIIIlllIIllI.length]));
            "".length();
            ++lllllllllllllIlIlIIllIIIlllIIlIl;
            ++lllllllllllllIlIlIIllIIIllIlllIl;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIIllIIIlllIIlll);
    }
    
    public static void setUseFBO(final boolean lllllllllllllIlIlIIllIIlIIIlIIll) {
        GraphicsFactory.fbo = lllllllllllllIlIlIIllIIlIIIlIIll;
    }
    
    public static Graphics getGraphicsForImage(final Image lllllllllllllIlIlIIllIIlIIIlIIII) throws SlickException {
        Graphics lllllllllllllIlIlIIllIIlIIIIllll = GraphicsFactory.graphics.get(lllllllllllllIlIlIIllIIlIIIlIIII.getTexture());
        if (lIllIIIlllIllIl(lllllllllllllIlIlIIllIIlIIIIllll)) {
            lllllllllllllIlIlIIllIIlIIIIllll = createGraphics(lllllllllllllIlIlIIllIIlIIIlIIII);
            GraphicsFactory.graphics.put(lllllllllllllIlIlIIllIIlIIIlIIII.getTexture(), lllllllllllllIlIlIIllIIlIIIIllll);
            "".length();
        }
        return lllllllllllllIlIlIIllIIlIIIIllll;
    }
    
    private static String lIllIIIlllIIIII(final String lllllllllllllIlIlIIllIIIlllllIIl, final String lllllllllllllIlIlIIllIIIlllllIII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIllIIIllllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIllIIIlllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIIllIIIlllllIll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIIllIIIlllllIll.init(GraphicsFactory.llllllllIllll[2], lllllllllllllIlIlIIllIIIllllllII);
            return new String(lllllllllllllIlIlIIllIIIlllllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIllIIIlllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIllIIIlllllIlI) {
            lllllllllllllIlIlIIllIIIlllllIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIIIlllIlIll(final int lllllllllllllIlIlIIllIIIllIIIlIl) {
        return lllllllllllllIlIlIIllIIIllIIIlIl != 0;
    }
    
    private static void lIllIIIlllIIIlI() {
        (llllllllIllIl = new String[GraphicsFactory.llllllllIllll[6]])[GraphicsFactory.llllllllIllll[1]] = lIllIIIllIlllll("GAgvKEYOFz80IQ1HOTsUJUc+NQMyRzQ1EmEULyoWLhUuegknASk5FCQCNHoENAE8PxQyRzs0AmEPPzQFJEc5OwhmE3oyBy8DNj9GNQ8/egI4CTs3DyJHMzcHJgIpehQkFi8zFCQDejwJM0cuMg8yRzsqFi0OOTsSKAg0dA==", "AgZZf");
        GraphicsFactory.llllllllIllIl[GraphicsFactory.llllllllIllll[0]] = lIllIIIlllIIIII("3cA+iZUzo1tzH8NJr7ZMtZGSOWVgGS74", "Upmlx");
        GraphicsFactory.llllllllIllIl[GraphicsFactory.llllllllIllll[2]] = lIllIIIlllIIIIl("oXCH9EPzZeUG/ePS/sNfVQ==", "mxLyp");
        GraphicsFactory.llllllllIllIl[GraphicsFactory.llllllllIllll[3]] = lIllIIIlllIIIII("HLybL1vYBFst0FVdUr8EDg==", "lnAFV");
        GraphicsFactory.llllllllIllIl[GraphicsFactory.llllllllIllll[4]] = lIllIIIlllIIIIl("3dfhwqlPdo4pWYU8iIaG3s2DjZ/Zm7DhqUJ+KMWPbH+XiBufUio1mVD3IYqhkRTX", "rvYRw");
        GraphicsFactory.llllllllIllIl[GraphicsFactory.llllllllIllll[5]] = lIllIIIllIlllll("KxUiCSQJVD8KYQ4GLgQ1CFQkAyceFzkAJANUKRAnCxE5RSQbESVFNQUbPgIpTQAjAGEOFTkBYR8ROwozGQdrDDVKB2sVLh4HIgctCA==", "mtKeA");
    }
    
    public static void releaseGraphicsForImage(final Image lllllllllllllIlIlIIllIIlIIIIlIlI) throws SlickException {
        final Graphics lllllllllllllIlIlIIllIIlIIIIlIIl = GraphicsFactory.graphics.remove(lllllllllllllIlIlIIllIIlIIIIlIlI.getTexture());
        if (lIllIIIlllIlllI(lllllllllllllIlIlIIllIIlIIIIlIIl)) {
            lllllllllllllIlIlIIllIIlIIIIlIIl.destroy();
        }
    }
    
    static {
        lIllIIIlllIlIlI();
        lIllIIIlllIIIlI();
        GraphicsFactory.graphics = new HashMap();
        GraphicsFactory.pbuffer = (GraphicsFactory.llllllllIllll[0] != 0);
        GraphicsFactory.pbufferRT = (GraphicsFactory.llllllllIllll[0] != 0);
        GraphicsFactory.fbo = (GraphicsFactory.llllllllIllll[0] != 0);
        GraphicsFactory.init = (GraphicsFactory.llllllllIllll[1] != 0);
    }
    
    public static boolean usingPBuffer() {
        int n;
        if (lIllIIIlllIllII(GraphicsFactory.fbo ? 1 : 0) && lIllIIIlllIlIll(GraphicsFactory.pbuffer ? 1 : 0)) {
            n = GraphicsFactory.llllllllIllll[0];
            "".length();
            if (null != null) {
                return ((0x99 ^ 0xA9) & ~(0xF ^ 0x3F)) != 0x0;
            }
        }
        else {
            n = GraphicsFactory.llllllllIllll[1];
        }
        return n != 0;
    }
    
    private static boolean lIllIIIlllIllII(final int lllllllllllllIlIlIIllIIIllIIIIll) {
        return lllllllllllllIlIlIIllIIIllIIIIll == 0;
    }
    
    private static boolean lIllIIIlllIllll(final int lllllllllllllIlIlIIllIIIllIIllII, final int lllllllllllllIlIlIIllIIIllIIlIll) {
        return lllllllllllllIlIlIIllIIIllIIllII < lllllllllllllIlIlIIllIIIllIIlIll;
    }
    
    private static boolean lIllIIIlllIllIl(final Object lllllllllllllIlIlIIllIIIllIIIlll) {
        return lllllllllllllIlIlIIllIIIllIIIlll == null;
    }
}
