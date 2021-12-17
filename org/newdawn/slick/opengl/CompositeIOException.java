// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.ArrayList;
import java.io.IOException;

public class CompositeIOException extends IOException
{
    private /* synthetic */ ArrayList exceptions;
    private static final /* synthetic */ int[] lIllIIIIlllIll;
    private static final /* synthetic */ String[] lIllIIIIIlIlII;
    
    public void addException(final Exception lllllllllllllIIIIIlllIIIlllIlIII) {
        this.exceptions.add(lllllllllllllIIIIIlllIIIlllIlIII);
        "".length();
    }
    
    private static String llllIllIIIIlllI(String lllllllllllllIIIIIlllIIIllIIllll, final String lllllllllllllIIIIIlllIIIllIIlllI) {
        lllllllllllllIIIIIlllIIIllIIllll = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIIlllIIIllIIllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIlllIIIllIlIIlI = new StringBuilder();
        final char[] lllllllllllllIIIIIlllIIIllIlIIIl = lllllllllllllIIIIIlllIIIllIIlllI.toCharArray();
        int lllllllllllllIIIIIlllIIIllIlIIII = CompositeIOException.lIllIIIIlllIll[0];
        final double lllllllllllllIIIIIlllIIIllIIlIlI = (Object)((String)lllllllllllllIIIIIlllIIIllIIllll).toCharArray();
        final short lllllllllllllIIIIIlllIIIllIIlIIl = (short)lllllllllllllIIIIIlllIIIllIIlIlI.length;
        Exception lllllllllllllIIIIIlllIIIllIIlIII = (Exception)CompositeIOException.lIllIIIIlllIll[0];
        while (llllIlllIlIllIl((int)lllllllllllllIIIIIlllIIIllIIlIII, lllllllllllllIIIIIlllIIIllIIlIIl)) {
            final char lllllllllllllIIIIIlllIIIllIlIlIl = lllllllllllllIIIIIlllIIIllIIlIlI[lllllllllllllIIIIIlllIIIllIIlIII];
            lllllllllllllIIIIIlllIIIllIlIIlI.append((char)(lllllllllllllIIIIIlllIIIllIlIlIl ^ lllllllllllllIIIIIlllIIIllIlIIIl[lllllllllllllIIIIIlllIIIllIlIIII % lllllllllllllIIIIIlllIIIllIlIIIl.length]));
            "".length();
            ++lllllllllllllIIIIIlllIIIllIlIIII;
            ++lllllllllllllIIIIIlllIIIllIIlIII;
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIlllIIIllIlIIlI);
    }
    
    static {
        llllIlllIlIllII();
        llllIllIIIlIIIl();
    }
    
    private static boolean llllIlllIlIllIl(final int lllllllllllllIIIIIlllIIIlIllIlll, final int lllllllllllllIIIIIlllIIIlIllIllI) {
        return lllllllllllllIIIIIlllIIIlIllIlll < lllllllllllllIIIIIlllIIIlIllIllI;
    }
    
    private static void llllIllIIIlIIIl() {
        (lIllIIIIIlIlII = new String[CompositeIOException.lIllIIIIlllIll[3]])[CompositeIOException.lIllIIIIlllIll[0]] = llllIllIIIIlllI("CgIEIxk6BB02VgwVCjYGPQQGPUxpZw==", "ImiSv");
        CompositeIOException.lIllIIIIIlIlII[CompositeIOException.lIllIIIIlllIll[1]] = llllIllIIIIlllI("fg==", "wAZPu");
        CompositeIOException.lIllIIIIIlIlII[CompositeIOException.lIllIIIIlllIll[2]] = llllIllIIIIllll("Mdvh4ZEvQko=", "QyTSv");
    }
    
    private static void llllIlllIlIllII() {
        (lIllIIIIlllIll = new int[4])[0] = ((0x1D ^ 0x56) & ~(0x38 ^ 0x73));
        CompositeIOException.lIllIIIIlllIll[1] = " ".length();
        CompositeIOException.lIllIIIIlllIll[2] = "  ".length();
        CompositeIOException.lIllIIIIlllIll[3] = "   ".length();
    }
    
    @Override
    public String getMessage() {
        String lllllllllllllIIIIIlllIIIlllIIIlI = CompositeIOException.lIllIIIIIlIlII[CompositeIOException.lIllIIIIlllIll[0]];
        int lllllllllllllIIIIIlllIIIlllIIlII = CompositeIOException.lIllIIIIlllIll[0];
        while (llllIlllIlIllIl(lllllllllllllIIIIIlllIIIlllIIlII, this.exceptions.size())) {
            lllllllllllllIIIIIlllIIIlllIIIlI = String.valueOf(new StringBuilder().append(lllllllllllllIIIIIlllIIIlllIIIlI).append(CompositeIOException.lIllIIIIIlIlII[CompositeIOException.lIllIIIIlllIll[1]]).append(this.exceptions.get(lllllllllllllIIIIIlllIIIlllIIlII).getMessage()).append(CompositeIOException.lIllIIIIIlIlII[CompositeIOException.lIllIIIIlllIll[2]]));
            ++lllllllllllllIIIIIlllIIIlllIIlII;
            "".length();
            if (((0xDE ^ 0xB7 ^ (0x33 ^ 0x67)) & (0x4A ^ 0x3E ^ (0xE7 ^ 0xAE) ^ -" ".length())) > 0) {
                return null;
            }
        }
        return lllllllllllllIIIIIlllIIIlllIIIlI;
    }
    
    private static String llllIllIIIIllll(final String lllllllllllllIIIIIlllIIIlIllllll, final String lllllllllllllIIIIIlllIIIlIllllII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIlllIIIllIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIlllIIIlIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIlllIIIllIIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIlllIIIllIIIIIl.init(CompositeIOException.lIllIIIIlllIll[2], lllllllllllllIIIIIlllIIIllIIIIlI);
            return new String(lllllllllllllIIIIIlllIIIllIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIlllIIIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIlllIIIllIIIIII) {
            lllllllllllllIIIIIlllIIIllIIIIII.printStackTrace();
            return null;
        }
    }
    
    public CompositeIOException() {
        this.exceptions = new ArrayList();
    }
}
