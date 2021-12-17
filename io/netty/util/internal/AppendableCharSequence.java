// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.IOException;

public final class AppendableCharSequence implements Appendable, CharSequence
{
    private static final /* synthetic */ String[] lllllllllIIlI;
    private static final /* synthetic */ int[] lllllllllIIll;
    private /* synthetic */ int pos;
    private /* synthetic */ char[] chars;
    
    @Override
    public AppendableCharSequence append(final CharSequence lllllllllllllIlIlIIlIllIlllllllI, final int lllllllllllllIlIlIIlIllIllllllIl, final int lllllllllllllIlIlIIlIllIllllIlll) {
        if (lIllIIlIIIIIlll(lllllllllllllIlIlIIlIllIlllllllI.length(), lllllllllllllIlIlIIlIllIllllIlll)) {
            throw new IndexOutOfBoundsException();
        }
        final int lllllllllllllIlIlIIlIllIlllllIll = lllllllllllllIlIlIIlIllIllllIlll - lllllllllllllIlIlIIlIllIllllllIl;
        if (lIllIIlIIIIlIII(lllllllllllllIlIlIIlIllIlllllIll, this.chars.length - this.pos)) {
            this.chars = expand(this.chars, this.pos + lllllllllllllIlIlIIlIllIlllllIll, this.pos);
        }
        if (lIllIIlIIIIlIll((lllllllllllllIlIlIIlIllIlllllllI instanceof AppendableCharSequence) ? 1 : 0)) {
            final AppendableCharSequence lllllllllllllIlIlIIlIlllIIIIIIlI = (AppendableCharSequence)lllllllllllllIlIlIIlIllIlllllllI;
            final char[] lllllllllllllIlIlIIlIlllIIIIIIIl = lllllllllllllIlIlIIlIlllIIIIIIlI.chars;
            System.arraycopy(lllllllllllllIlIlIIlIlllIIIIIIIl, lllllllllllllIlIlIIlIllIllllllIl, this.chars, this.pos, lllllllllllllIlIlIIlIllIlllllIll);
            this.pos += lllllllllllllIlIlIIlIllIlllllIll;
            return this;
        }
        int lllllllllllllIlIlIIlIlllIIIIIIII = lllllllllllllIlIlIIlIllIllllllIl;
        while (lIllIIlIIIIIlll(lllllllllllllIlIlIIlIlllIIIIIIII, lllllllllllllIlIlIIlIllIllllIlll)) {
            final char[] chars = this.chars;
            final int pos = this.pos;
            this.pos = pos + AppendableCharSequence.lllllllllIIll[0];
            chars[pos] = lllllllllllllIlIlIIlIllIlllllllI.charAt(lllllllllllllIlIlIIlIlllIIIIIIII);
            ++lllllllllllllIlIlIIlIlllIIIIIIII;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return this;
    }
    
    private static char[] expand(final char[] lllllllllllllIlIlIIlIllIllIlIlll, final int lllllllllllllIlIlIIlIllIllIllIll, final int lllllllllllllIlIlIIlIllIllIllIlI) {
        int lllllllllllllIlIlIIlIllIllIllIIl = lllllllllllllIlIlIIlIllIllIlIlll.length;
        do {
            lllllllllllllIlIlIIlIllIllIllIIl <<= AppendableCharSequence.lllllllllIIll[0];
            if (lIllIIlIIIIlIlI(lllllllllllllIlIlIIlIllIllIllIIl)) {
                throw new IllegalStateException();
            }
        } while (!lIllIIlIIIIllII(lllllllllllllIlIlIIlIllIllIllIll, lllllllllllllIlIlIIlIllIllIllIIl));
        final char[] lllllllllllllIlIlIIlIllIllIllIII = new char[lllllllllllllIlIlIIlIllIllIllIIl];
        System.arraycopy(lllllllllllllIlIlIIlIllIllIlIlll, AppendableCharSequence.lllllllllIIll[1], lllllllllllllIlIlIIlIllIllIllIII, AppendableCharSequence.lllllllllIIll[1], lllllllllllllIlIlIIlIllIllIllIlI);
        return lllllllllllllIlIlIIlIllIllIllIII;
    }
    
    @Override
    public char charAt(final int lllllllllllllIlIlIIlIlllIIlIIlll) {
        if (lIllIIlIIIIlIII(lllllllllllllIlIlIIlIlllIIlIIlll, this.pos)) {
            throw new IndexOutOfBoundsException();
        }
        return this.chars[lllllllllllllIlIlIIlIlllIIlIIlll];
    }
    
    @Override
    public int length() {
        return this.pos;
    }
    
    private static boolean lIllIIlIIIIIlll(final int lllllllllllllIlIlIIlIllIlIIlIIIl, final int lllllllllllllIlIlIIlIllIlIIlIIII) {
        return lllllllllllllIlIlIIlIllIlIIlIIIl < lllllllllllllIlIlIIlIllIlIIlIIII;
    }
    
    private static boolean lIllIIlIIIIlIII(final int lllllllllllllIlIlIIlIllIlIIIlIIl, final int lllllllllllllIlIlIIlIllIlIIIlIII) {
        return lllllllllllllIlIlIIlIllIlIIIlIIl > lllllllllllllIlIlIIlIllIlIIIlIII;
    }
    
    public void reset() {
        this.pos = AppendableCharSequence.lllllllllIIll[1];
    }
    
    private static boolean lIllIIlIIIIlIIl(final int lllllllllllllIlIlIIlIllIlIIlIlIl, final int lllllllllllllIlIlIIlIllIlIIlIlII) {
        return lllllllllllllIlIlIIlIllIlIIlIlIl == lllllllllllllIlIlIIlIllIlIIlIlII;
    }
    
    public String substring(final int lllllllllllllIlIlIIlIllIlllIIlII, final int lllllllllllllIlIlIIlIllIlllIIIll) {
        final int lllllllllllllIlIlIIlIllIlllIIllI = lllllllllllllIlIlIIlIllIlllIIIll - lllllllllllllIlIlIIlIllIlllIIlII;
        if (!lIllIIlIIIIllII(lllllllllllllIlIlIIlIllIlllIIlII, this.pos) || lIllIIlIIIIlIII(lllllllllllllIlIlIIlIllIlllIIllI, this.pos)) {
            throw new IndexOutOfBoundsException();
        }
        return new String(this.chars, lllllllllllllIlIlIIlIllIlllIIlII, lllllllllllllIlIlIIlIllIlllIIllI);
    }
    
    public AppendableCharSequence(final int lllllllllllllIlIlIIlIlllIIllIlII) {
        if (lIllIIlIIIIIlll(lllllllllllllIlIlIIlIlllIIllIlII, AppendableCharSequence.lllllllllIIll[0])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(AppendableCharSequence.lllllllllIIlI[AppendableCharSequence.lllllllllIIll[1]]).append(lllllllllllllIlIlIIlIlllIIllIlII).append(AppendableCharSequence.lllllllllIIlI[AppendableCharSequence.lllllllllIIll[0]])));
        }
        this.chars = new char[lllllllllllllIlIlIIlIlllIIllIlII];
    }
    
    private static String lIllIIlIIIIIIll(final String lllllllllllllIlIlIIlIllIlIlIlIlI, final String lllllllllllllIlIlIIlIllIlIlIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIlIllIlIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIlIllIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), AppendableCharSequence.lllllllllIIll[3]), "DES");
            final Cipher lllllllllllllIlIlIIlIllIlIlIllII = Cipher.getInstance("DES");
            lllllllllllllIlIlIIlIllIlIlIllII.init(AppendableCharSequence.lllllllllIIll[2], lllllllllllllIlIlIIlIllIlIlIllIl);
            return new String(lllllllllllllIlIlIIlIllIlIlIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIlIllIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIlIllIlIlIlIll) {
            lllllllllllllIlIlIIlIllIlIlIlIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public AppendableCharSequence append(final CharSequence lllllllllllllIlIlIIlIlllIIIIllII) {
        return this.append(lllllllllllllIlIlIIlIlllIIIIllII, AppendableCharSequence.lllllllllIIll[1], lllllllllllllIlIlIIlIlllIIIIllII.length());
    }
    
    private static String lIllIIlIIIIIlII(final String lllllllllllllIlIlIIlIllIlIIlllIl, final String lllllllllllllIlIlIIlIllIlIIlllII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIlIllIlIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIlIllIlIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIIlIllIlIIlllll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIIlIllIlIIlllll.init(AppendableCharSequence.lllllllllIIll[2], lllllllllllllIlIlIIlIllIlIlIIIII);
            return new String(lllllllllllllIlIlIIlIllIlIIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIlIllIlIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIlIllIlIIllllI) {
            lllllllllllllIlIlIIlIllIlIIllllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public AppendableCharSequence subSequence(final int lllllllllllllIlIlIIlIlllIIlIIIII, final int lllllllllllllIlIlIIlIlllIIIlllll) {
        return new AppendableCharSequence(Arrays.copyOfRange(this.chars, lllllllllllllIlIlIIlIlllIIlIIIII, lllllllllllllIlIlIIlIlllIIIlllll));
    }
    
    private AppendableCharSequence(final char[] lllllllllllllIlIlIIlIlllIIlIlllI) {
        this.chars = lllllllllllllIlIlIIlIlllIIlIlllI;
        this.pos = lllllllllllllIlIlIIlIlllIIlIlllI.length;
    }
    
    private static void lIllIIlIIIIIllI() {
        (lllllllllIIll = new int[4])[0] = " ".length();
        AppendableCharSequence.lllllllllIIll[1] = ((0xE5 ^ 0xBA) & ~(0x56 ^ 0x9));
        AppendableCharSequence.lllllllllIIll[2] = "  ".length();
        AppendableCharSequence.lllllllllIIll[3] = (0x24 ^ 0x40 ^ (0xF6 ^ 0x9A));
    }
    
    private static boolean lIllIIlIIIIlIlI(final int lllllllllllllIlIlIIlIllIlIIIIlII) {
        return lllllllllllllIlIlIIlIllIlIIIIlII < 0;
    }
    
    private static void lIllIIlIIIIIlIl() {
        (lllllllllIIlI = new String[AppendableCharSequence.lllllllllIIll[2]])[AppendableCharSequence.lllllllllIIll[1]] = lIllIIlIIIIIIll("6/D58RxneHGn7rAnPidVNQ==", "HUqFd");
        AppendableCharSequence.lllllllllIIlI[AppendableCharSequence.lllllllllIIll[0]] = lIllIIlIIIIIlII("UTQPdpGzpoSQj5FR7BjH/g==", "BtPAO");
    }
    
    @Override
    public String toString() {
        return new String(this.chars, AppendableCharSequence.lllllllllIIll[1], this.pos);
    }
    
    private static boolean lIllIIlIIIIlIll(final int lllllllllllllIlIlIIlIllIlIIIIllI) {
        return lllllllllllllIlIlIIlIllIlIIIIllI != 0;
    }
    
    static {
        lIllIIlIIIIIllI();
        lIllIIlIIIIIlIl();
    }
    
    private static boolean lIllIIlIIIIllII(final int lllllllllllllIlIlIIlIllIlIIIllIl, final int lllllllllllllIlIlIIlIllIlIIIllII) {
        return lllllllllllllIlIlIIlIllIlIIIllIl <= lllllllllllllIlIlIIlIllIlIIIllII;
    }
    
    @Override
    public AppendableCharSequence append(final char lllllllllllllIlIlIIlIlllIIIlIlII) {
        if (lIllIIlIIIIlIIl(this.pos, this.chars.length)) {
            final char[] lllllllllllllIlIlIIlIlllIIIlIlll = this.chars;
            final int lllllllllllllIlIlIIlIlllIIIlIllI = lllllllllllllIlIlIIlIlllIIIlIlll.length << AppendableCharSequence.lllllllllIIll[0];
            if (lIllIIlIIIIlIlI(lllllllllllllIlIlIIlIlllIIIlIllI)) {
                throw new IllegalStateException();
            }
            this.chars = new char[lllllllllllllIlIlIIlIlllIIIlIllI];
            System.arraycopy(lllllllllllllIlIlIIlIlllIIIlIlll, AppendableCharSequence.lllllllllIIll[1], this.chars, AppendableCharSequence.lllllllllIIll[1], lllllllllllllIlIlIIlIlllIIIlIlll.length);
        }
        final char[] chars = this.chars;
        final int pos = this.pos;
        this.pos = pos + AppendableCharSequence.lllllllllIIll[0];
        chars[pos] = lllllllllllllIlIlIIlIlllIIIlIlII;
        return this;
    }
}
