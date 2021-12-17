// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.shader;

import org.lwjgl.util.vector.Matrix4f;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ShaderDefault extends ShaderUniform
{
    private static final /* synthetic */ int[] lllllIIIIIIIl;
    private static final /* synthetic */ String[] lllllIIIIIIII;
    
    private static String lIlIllIIlIlIIIl(String lllllllllllllIlIllIIIlIllIIIllIl, final String lllllllllllllIlIllIIIlIllIIIllII) {
        lllllllllllllIlIllIIIlIllIIIllIl = new String(Base64.getDecoder().decode(lllllllllllllIlIllIIIlIllIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIIIlIllIIIlIll = new StringBuilder();
        final char[] lllllllllllllIlIllIIIlIllIIIlIlI = lllllllllllllIlIllIIIlIllIIIllII.toCharArray();
        int lllllllllllllIlIllIIIlIllIIIlIIl = ShaderDefault.lllllIIIIIIIl[0];
        final long lllllllllllllIlIllIIIlIllIIIIIll = (Object)lllllllllllllIlIllIIIlIllIIIllIl.toCharArray();
        final int lllllllllllllIlIllIIIlIllIIIIIlI = lllllllllllllIlIllIIIlIllIIIIIll.length;
        Exception lllllllllllllIlIllIIIlIllIIIIIIl = (Exception)ShaderDefault.lllllIIIIIIIl[0];
        while (lIlIllIIlIlIlIl((int)lllllllllllllIlIllIIIlIllIIIIIIl, lllllllllllllIlIllIIIlIllIIIIIlI)) {
            final char lllllllllllllIlIllIIIlIllIIIlllI = lllllllllllllIlIllIIIlIllIIIIIll[lllllllllllllIlIllIIIlIllIIIIIIl];
            lllllllllllllIlIllIIIlIllIIIlIll.append((char)(lllllllllllllIlIllIIIlIllIIIlllI ^ lllllllllllllIlIllIIIlIllIIIlIlI[lllllllllllllIlIllIIIlIllIIIlIIl % lllllllllllllIlIllIIIlIllIIIlIlI.length]));
            "".length();
            ++lllllllllllllIlIllIIIlIllIIIlIIl;
            ++lllllllllllllIlIllIIIlIllIIIIIIl;
            "".length();
            if (-(0xCD ^ 0x81 ^ (0xE8 ^ 0xA0)) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIIIlIllIIIlIll);
    }
    
    static {
        lIlIllIIlIlIlII();
        lIlIllIIlIlIIlI();
    }
    
    private static void lIlIllIIlIlIIlI() {
        (lllllIIIIIIII = new String[ShaderDefault.lllllIIIIIIIl[2]])[ShaderDefault.lllllIIIIIIIl[0]] = lIlIllIIlIlIIIl("HgYGFw4=", "zskzw");
    }
    
    private static boolean lIlIllIIlIlIlIl(final int lllllllllllllIlIllIIIlIlIlllllIl, final int lllllllllllllIlIllIIIlIlIlllllII) {
        return lllllllllllllIlIllIIIlIlIlllllIl < lllllllllllllIlIllIIIlIlIlllllII;
    }
    
    @Override
    public void set(final float lllllllllllllIlIllIIIlIllIlllllI, final float lllllllllllllIlIllIIIlIllIllllIl, final float lllllllllllllIlIllIIIlIllIllllII) {
    }
    
    public ShaderDefault() {
        super(ShaderDefault.lllllIIIIIIII[ShaderDefault.lllllIIIIIIIl[0]], ShaderDefault.lllllIIIIIIIl[1], ShaderDefault.lllllIIIIIIIl[2], null);
    }
    
    @Override
    public void set(final float lllllllllllllIlIllIIIlIllIlIlIIl, final float lllllllllllllIlIllIIIlIllIlIlIII, final float lllllllllllllIlIllIIIlIllIlIIlll, final float lllllllllllllIlIllIIIlIllIlIIllI, final float lllllllllllllIlIllIIIlIllIlIIlIl, final float lllllllllllllIlIllIIIlIllIlIIlII, final float lllllllllllllIlIllIIIlIllIlIIIll, final float lllllllllllllIlIllIIIlIllIlIIIlI, final float lllllllllllllIlIllIIIlIllIlIIIIl, final float lllllllllllllIlIllIIIlIllIlIIIII, final float lllllllllllllIlIllIIIlIllIIlllll, final float lllllllllllllIlIllIIIlIllIIllllI, final float lllllllllllllIlIllIIIlIllIIlllIl, final float lllllllllllllIlIllIIIlIllIIlllII, final float lllllllllllllIlIllIIIlIllIIllIll, final float lllllllllllllIlIllIIIlIllIIllIlI) {
    }
    
    @Override
    public void set(final float[] lllllllllllllIlIllIIIlIllIlIlIll) {
    }
    
    private static void lIlIllIIlIlIlII() {
        (lllllIIIIIIIl = new int[3])[0] = ((102 + 197 - 89 + 27 ^ 11 + 73 - 20 + 125) & (195 + 19 - 89 + 102 ^ 152 + 6 - 5 + 26 ^ -" ".length()));
        ShaderDefault.lllllIIIIIIIl[1] = (133 + 64 - 162 + 121 ^ 56 + 64 + 11 + 21);
        ShaderDefault.lllllIIIIIIIl[2] = " ".length();
    }
    
    @Override
    public void set(final Matrix4f lllllllllllllIlIllIIIlIllIIllIII) {
    }
    
    @Override
    public void set(final float lllllllllllllIlIllIIIlIlllIIIIIl, final float lllllllllllllIlIllIIIlIlllIIIIII) {
    }
    
    @Override
    public void func_148092_b(final float lllllllllllllIlIllIIIlIllIllIlIl, final float lllllllllllllIlIllIIIlIllIllIlII, final float lllllllllllllIlIllIIIlIllIllIIll, final float lllllllllllllIlIllIIIlIllIllIIlI) {
    }
    
    @Override
    public void set(final int lllllllllllllIlIllIIIlIllIllIIII, final int lllllllllllllIlIllIIIlIllIlIllll, final int lllllllllllllIlIllIIIlIllIlIlllI, final int lllllllllllllIlIllIIIlIllIlIllIl) {
    }
    
    @Override
    public void set(final float lllllllllllllIlIllIIIlIllIlllIlI, final float lllllllllllllIlIllIIIlIllIlllIIl, final float lllllllllllllIlIllIIIlIllIlllIII, final float lllllllllllllIlIllIIIlIllIllIlll) {
    }
    
    @Override
    public void set(final float lllllllllllllIlIllIIIlIlllIIIIll) {
    }
}
