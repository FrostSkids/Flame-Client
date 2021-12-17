// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.group;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.NoSuchElementException;
import java.util.Iterator;

final class CombinedIterator<E> implements Iterator<E>
{
    private final /* synthetic */ Iterator<E> i1;
    private static final /* synthetic */ String[] lIllIlIIIIIIll;
    private static final /* synthetic */ int[] lIllIlIIIIIlII;
    private final /* synthetic */ Iterator<E> i2;
    private /* synthetic */ Iterator<E> currentIterator;
    
    @Override
    public void remove() {
        this.currentIterator.remove();
    }
    
    static {
        lllllIllllIlIIl();
        lllllIllllIlIII();
    }
    
    @Override
    public boolean hasNext() {
        while (!lllllIllllIlIll(this.currentIterator.hasNext() ? 1 : 0)) {
            if (!lllllIllllIllII(this.currentIterator, this.i1)) {
                return CombinedIterator.lIllIlIIIIIlII[0] != 0;
            }
            this.currentIterator = this.i2;
            "".length();
            if (-" ".length() >= ((0x5 ^ 0x11) & ~(0x79 ^ 0x6D) & ~((0x8 ^ 0x58) & ~(0x91 ^ 0xC1)))) {
                return ((0x6 ^ 0x30) & ~(0x38 ^ 0xE)) != 0x0;
            }
        }
        return CombinedIterator.lIllIlIIIIIlII[1] != 0;
    }
    
    private static boolean lllllIllllIlIll(final int lllllllllllllIIIIIIIlIlIIIllllll) {
        return lllllllllllllIIIIIIIlIlIIIllllll != 0;
    }
    
    private static boolean lllllIllllIlIlI(final Object lllllllllllllIIIIIIIlIlIIlIIIIIl) {
        return lllllllllllllIIIIIIIlIlIIlIIIIIl == null;
    }
    
    private static boolean lllllIllllIllIl(final int lllllllllllllIIIIIIIlIlIIlIIlIII, final int lllllllllllllIIIIIIIlIlIIlIIIlll) {
        return lllllllllllllIIIIIIIlIlIIlIIlIII < lllllllllllllIIIIIIIlIlIIlIIIlll;
    }
    
    private static boolean lllllIllllIllII(final Object lllllllllllllIIIIIIIlIlIIlIIIlII, final Object lllllllllllllIIIIIIIlIlIIlIIIIll) {
        return lllllllllllllIIIIIIIlIlIIlIIIlII == lllllllllllllIIIIIIIlIlIIlIIIIll;
    }
    
    private static void lllllIllllIlIIl() {
        (lIllIlIIIIIlII = new int[3])[0] = ((0x3F ^ 0x27) & ~(0xDD ^ 0xC5));
        CombinedIterator.lIllIlIIIIIlII[1] = " ".length();
        CombinedIterator.lIllIlIIIIIlII[2] = "  ".length();
    }
    
    @Override
    public E next() {
        try {
            return this.currentIterator.next();
        }
        catch (NoSuchElementException lllllllllllllIIIIIIIlIlIIlllIllI) {
            if (!lllllIllllIllII(this.currentIterator, this.i1)) {
                throw lllllllllllllIIIIIIIlIlIIlllIllI;
            }
            this.currentIterator = this.i2;
            "".length();
            if (((144 + 95 - 119 + 41 ^ 160 + 38 - 7 + 2) & (0x44 ^ 0x6E ^ (0x65 ^ 0x2F) ^ -" ".length())) < ((0x21 ^ 0x48 ^ (0x42 ^ 0x36)) & (0x3 ^ 0x4F ^ (0xE9 ^ 0xB8) ^ -" ".length()))) {
                return null;
            }
            "".length();
            if (-" ".length() >= ((0x7B ^ 0x4E) & ~(0x80 ^ 0xB5))) {
                return null;
            }
            return this.currentIterator.next();
        }
    }
    
    private static String lllllIllllIIIlI(final String lllllllllllllIIIIIIIlIlIIllIlIII, final String lllllllllllllIIIIIIIlIlIIllIIlll) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIIlIlIIllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIlIlIIllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIIIlIlIIllIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIIIlIlIIllIlIlI.init(CombinedIterator.lIllIlIIIIIlII[2], lllllllllllllIIIIIIIlIlIIllIlIll);
            return new String(lllllllllllllIIIIIIIlIlIIllIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIlIlIIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIIlIlIIllIlIIl) {
            lllllllllllllIIIIIIIlIlIIllIlIIl.printStackTrace();
            return null;
        }
    }
    
    private static String lllllIllllIIIII(String lllllllllllllIIIIIIIlIlIIlIlIIll, final String lllllllllllllIIIIIIIlIlIIlIlIIlI) {
        lllllllllllllIIIIIIIlIlIIlIlIIll = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIIIIlIlIIlIlIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIIIlIlIIlIlIllI = new StringBuilder();
        final char[] lllllllllllllIIIIIIIlIlIIlIlIlIl = lllllllllllllIIIIIIIlIlIIlIlIIlI.toCharArray();
        int lllllllllllllIIIIIIIlIlIIlIlIlII = CombinedIterator.lIllIlIIIIIlII[0];
        final boolean lllllllllllllIIIIIIIlIlIIlIIlllI = (Object)((String)lllllllllllllIIIIIIIlIlIIlIlIIll).toCharArray();
        final Exception lllllllllllllIIIIIIIlIlIIlIIllIl = (Exception)lllllllllllllIIIIIIIlIlIIlIIlllI.length;
        short lllllllllllllIIIIIIIlIlIIlIIllII = (short)CombinedIterator.lIllIlIIIIIlII[0];
        while (lllllIllllIllIl(lllllllllllllIIIIIIIlIlIIlIIllII, (int)lllllllllllllIIIIIIIlIlIIlIIllIl)) {
            final char lllllllllllllIIIIIIIlIlIIlIllIIl = lllllllllllllIIIIIIIlIlIIlIIlllI[lllllllllllllIIIIIIIlIlIIlIIllII];
            lllllllllllllIIIIIIIlIlIIlIlIllI.append((char)(lllllllllllllIIIIIIIlIlIIlIllIIl ^ lllllllllllllIIIIIIIlIlIIlIlIlIl[lllllllllllllIIIIIIIlIlIIlIlIlII % lllllllllllllIIIIIIIlIlIIlIlIlIl.length]));
            "".length();
            ++lllllllllllllIIIIIIIlIlIIlIlIlII;
            ++lllllllllllllIIIIIIIlIlIIlIIllII;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIIIlIlIIlIlIllI);
    }
    
    private static void lllllIllllIlIII() {
        (lIllIlIIIIIIll = new String[CombinedIterator.lIllIlIIIIIlII[2]])[CombinedIterator.lIllIlIIIIIlII[0]] = lllllIllllIIIII("E1M=", "zbFXW");
        CombinedIterator.lIllIlIIIIIIll[CombinedIterator.lIllIlIIIIIlII[1]] = lllllIllllIIIlI("J97KMDlRHcA=", "OMKys");
    }
    
    CombinedIterator(final Iterator<E> lllllllllllllIIIIIIIlIlIlIIIIIII, final Iterator<E> lllllllllllllIIIIIIIlIlIIlllllll) {
        if (lllllIllllIlIlI(lllllllllllllIIIIIIIlIlIlIIIIIII)) {
            throw new NullPointerException(CombinedIterator.lIllIlIIIIIIll[CombinedIterator.lIllIlIIIIIlII[0]]);
        }
        if (lllllIllllIlIlI(lllllllllllllIIIIIIIlIlIIlllllll)) {
            throw new NullPointerException(CombinedIterator.lIllIlIIIIIIll[CombinedIterator.lIllIlIIIIIlII[1]]);
        }
        this.i1 = lllllllllllllIIIIIIIlIlIlIIIIIII;
        this.i2 = lllllllllllllIIIIIIIlIlIIlllllll;
        this.currentIterator = lllllllllllllIIIIIIIlIlIlIIIIIII;
    }
}
