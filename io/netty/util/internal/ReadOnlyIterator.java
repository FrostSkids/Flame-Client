// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Iterator;

public final class ReadOnlyIterator<T> implements Iterator<T>
{
    private final /* synthetic */ Iterator<? extends T> iterator;
    private static final /* synthetic */ String[] lIlIllIIIlIIIl;
    private static final /* synthetic */ int[] lIlIllIIIlIIlI;
    
    static {
        llllIIIIIllIIlI();
        llllIIIIIllIIIl();
    }
    
    private static boolean llllIIIIIllIIll(final Object lllllllllllllIIIIlllIlIllIlllIIl) {
        return lllllllllllllIIIIlllIlIllIlllIIl == null;
    }
    
    @Override
    public boolean hasNext() {
        return this.iterator.hasNext();
    }
    
    public ReadOnlyIterator(final Iterator<? extends T> lllllllllllllIIIIlllIlIlllIlIIIl) {
        if (llllIIIIIllIIll(lllllllllllllIIIIlllIlIlllIlIIIl)) {
            throw new NullPointerException(ReadOnlyIterator.lIlIllIIIlIIIl[ReadOnlyIterator.lIlIllIIIlIIlI[0]]);
        }
        this.iterator = lllllllllllllIIIIlllIlIlllIlIIIl;
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException(ReadOnlyIterator.lIlIllIIIlIIIl[ReadOnlyIterator.lIlIllIIIlIIlI[1]]);
    }
    
    private static void llllIIIIIllIIIl() {
        (lIlIllIIIlIIIl = new String[ReadOnlyIterator.lIlIllIIIlIIlI[2]])[ReadOnlyIterator.lIlIllIIIlIIlI[0]] = llllIIIIIllIIII("UzkkUlVb+PLWJjcvXQCivQ==", "ZUkYw");
        ReadOnlyIterator.lIlIllIIIlIIIl[ReadOnlyIterator.lIlIllIIIlIIlI[1]] = llllIIIIIllIIII("SX8RrkPnudiFR6YC7wa5NA==", "VGTFK");
    }
    
    private static void llllIIIIIllIIlI() {
        (lIlIllIIIlIIlI = new int[3])[0] = ((123 + 28 - 25 + 28 ^ 57 + 17 - 37 + 91) & (0xEC ^ 0x8E ^ (0xE9 ^ 0x91) ^ -" ".length()));
        ReadOnlyIterator.lIlIllIIIlIIlI[1] = " ".length();
        ReadOnlyIterator.lIlIllIIIlIIlI[2] = "  ".length();
    }
    
    @Override
    public T next() {
        return (T)this.iterator.next();
    }
    
    private static String llllIIIIIllIIII(final String lllllllllllllIIIIlllIlIlllIIIIII, final String lllllllllllllIIIIlllIlIllIllllIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIlllIlIlllIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlllIlIllIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIlllIlIlllIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIlllIlIlllIIIIlI.init(ReadOnlyIterator.lIlIllIIIlIIlI[2], lllllllllllllIIIIlllIlIlllIIIIll);
            return new String(lllllllllllllIIIIlllIlIlllIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlllIlIlllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlllIlIlllIIIIIl) {
            lllllllllllllIIIIlllIlIlllIIIIIl.printStackTrace();
            return null;
        }
    }
}
