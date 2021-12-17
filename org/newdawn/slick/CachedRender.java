// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick;

import org.newdawn.slick.opengl.renderer.Renderer;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import org.newdawn.slick.opengl.SlickCallable;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.opengl.renderer.SGL;

public class CachedRender
{
    private static final /* synthetic */ int[] lIIlIIlllIIIII;
    private /* synthetic */ Runnable runnable;
    private /* synthetic */ int list;
    private static final /* synthetic */ String[] lIIlIIllIIIllI;
    protected static /* synthetic */ SGL GL;
    
    public CachedRender(final Runnable lllllllllllllIIllIllIIlIllIlIllI) {
        this.list = CachedRender.lIIlIIlllIIIII[0];
        this.runnable = lllllllllllllIIllIllIIlIllIlIllI;
        this.build();
    }
    
    private static void llIIlllIIlIIlIl() {
        (lIIlIIlllIIIII = new int[6])[0] = -" ".length();
        CachedRender.lIIlIIlllIIIII[1] = " ".length();
        CachedRender.lIIlIIlllIIIII[2] = (-(0xFFFFEC1B & 0x37FE) & (0xFFFFBF9B & 0x777D));
        CachedRender.lIIlIIlllIIIII[3] = ((0xCB ^ 0x9A) & ~(0x3A ^ 0x6B));
        CachedRender.lIIlIIlllIIIII[4] = "  ".length();
        CachedRender.lIIlIIlllIIIII[5] = (0x1F ^ 0x4C ^ (0x33 ^ 0x68));
    }
    
    private static String llIIlllIIIIllll(String lllllllllllllIIllIllIIlIlIllIIII, final String lllllllllllllIIllIllIIlIlIlIllll) {
        lllllllllllllIIllIllIIlIlIllIIII = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllIllIIlIlIllIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIllIIlIlIllIIll = new StringBuilder();
        final char[] lllllllllllllIIllIllIIlIlIllIIlI = lllllllllllllIIllIllIIlIlIlIllll.toCharArray();
        int lllllllllllllIIllIllIIlIlIllIIIl = CachedRender.lIIlIIlllIIIII[3];
        final Exception lllllllllllllIIllIllIIlIlIlIlIll = (Object)((String)lllllllllllllIIllIllIIlIlIllIIII).toCharArray();
        final Exception lllllllllllllIIllIllIIlIlIlIlIlI = (Exception)lllllllllllllIIllIllIIlIlIlIlIll.length;
        char lllllllllllllIIllIllIIlIlIlIlIIl = (char)CachedRender.lIIlIIlllIIIII[3];
        while (llIIlllIIlIIlll(lllllllllllllIIllIllIIlIlIlIlIIl, (int)lllllllllllllIIllIllIIlIlIlIlIlI)) {
            final char lllllllllllllIIllIllIIlIlIllIllI = lllllllllllllIIllIllIIlIlIlIlIll[lllllllllllllIIllIllIIlIlIlIlIIl];
            lllllllllllllIIllIllIIlIlIllIIll.append((char)(lllllllllllllIIllIllIIlIlIllIllI ^ lllllllllllllIIllIllIIlIlIllIIlI[lllllllllllllIIllIllIIlIlIllIIIl % lllllllllllllIIllIllIIlIlIllIIlI.length]));
            "".length();
            ++lllllllllllllIIllIllIIlIlIllIIIl;
            ++lllllllllllllIIllIllIIlIlIlIlIIl;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIllIIlIlIllIIll);
    }
    
    private static boolean llIIlllIIlIIllI(final int lllllllllllllIIllIllIIlIlIlIIlIl, final int lllllllllllllIIllIllIIlIlIlIIlII) {
        return lllllllllllllIIllIllIIlIlIlIIlIl == lllllllllllllIIllIllIIlIlIlIIlII;
    }
    
    private void build() {
        if (!llIIlllIIlIIllI(this.list, CachedRender.lIIlIIlllIIIII[0])) {
            throw new RuntimeException(CachedRender.lIIlIIllIIIllI[CachedRender.lIIlIIlllIIIII[3]]);
        }
        this.list = CachedRender.GL.glGenLists(CachedRender.lIIlIIlllIIIII[1]);
        SlickCallable.enterSafeBlock();
        CachedRender.GL.glNewList(this.list, CachedRender.lIIlIIlllIIIII[2]);
        this.runnable.run();
        CachedRender.GL.glEndList();
        SlickCallable.leaveSafeBlock();
        "".length();
        if (-" ".length() >= "  ".length()) {
            return;
        }
    }
    
    private static String llIIlllIIIlIIII(final String lllllllllllllIIllIllIIlIllIIIIll, final String lllllllllllllIIllIllIIlIllIIIlII) {
        try {
            final SecretKeySpec lllllllllllllIIllIllIIlIllIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIllIIlIllIIIlII.getBytes(StandardCharsets.UTF_8)), CachedRender.lIIlIIlllIIIII[5]), "DES");
            final Cipher lllllllllllllIIllIllIIlIllIIIlll = Cipher.getInstance("DES");
            lllllllllllllIIllIllIIlIllIIIlll.init(CachedRender.lIIlIIlllIIIII[4], lllllllllllllIIllIllIIlIllIIlIII);
            return new String(lllllllllllllIIllIllIIlIllIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIllIIlIllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIllIIlIllIIIllI) {
            lllllllllllllIIllIllIIlIllIIIllI.printStackTrace();
            return null;
        }
    }
    
    private static void llIIlllIIIlIIIl() {
        (lIIlIIllIIIllI = new String[CachedRender.lIIlIIlllIIIII[4]])[CachedRender.lIIlIIlllIIIII[3]] = llIIlllIIIIllll("Kh0hNxgbHXUmGksLIDsZD0khOhBLDTwhBQcILHIZAhohchgEGzByAQMIO3IaBQowchwFSRYzFgMMMQAQBQ0wIA==", "kiURu");
        CachedRender.lIIlIIllIIIllI[CachedRender.lIIlIIlllIIIII[1]] = llIIlllIIIlIIII("TCPCiSdn6AIgux5dU6FVBFMSJmoi0vVjFVnWqZFw4EupJhU8YuGwIm4alpdomBjsBSkiD7OvbY6lUR6HPAMB+g==", "jqGlJ");
    }
    
    public void render() {
        if (llIIlllIIlIIllI(this.list, CachedRender.lIIlIIlllIIIII[0])) {
            throw new RuntimeException(CachedRender.lIIlIIllIIIllI[CachedRender.lIIlIIlllIIIII[1]]);
        }
        SlickCallable.enterSafeBlock();
        CachedRender.GL.glCallList(this.list);
        SlickCallable.leaveSafeBlock();
    }
    
    public void destroy() {
        CachedRender.GL.glDeleteLists(this.list, CachedRender.lIIlIIlllIIIII[1]);
        this.list = CachedRender.lIIlIIlllIIIII[0];
    }
    
    static {
        llIIlllIIlIIlIl();
        llIIlllIIIlIIIl();
        CachedRender.GL = Renderer.get();
    }
    
    private static boolean llIIlllIIlIIlll(final int lllllllllllllIIllIllIIlIlIlIIIIl, final int lllllllllllllIIllIllIIlIlIlIIIII) {
        return lllllllllllllIIllIllIIlIlIlIIIIl < lllllllllllllIIllIllIIlIlIlIIIII;
    }
}
