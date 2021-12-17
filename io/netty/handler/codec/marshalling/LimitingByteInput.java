// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.marshalling;

import java.io.IOException;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.jboss.marshalling.ByteInput;

class LimitingByteInput implements ByteInput
{
    private static final /* synthetic */ String[] lIIllIIIIIIlll;
    private static final /* synthetic */ TooBigObjectException EXCEPTION;
    private static final /* synthetic */ int[] lIIllIIIIIlIII;
    private /* synthetic */ long read;
    private final /* synthetic */ long limit;
    private final /* synthetic */ ByteInput input;
    
    private static String llIlIlIlIIIIIll(final String lllllllllllllIIlIllllIlllIIIlIIl, final String lllllllllllllIIlIllllIlllIIIlIII) {
        try {
            final SecretKeySpec lllllllllllllIIlIllllIlllIIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllllIlllIIIlIII.getBytes(StandardCharsets.UTF_8)), LimitingByteInput.lIIllIIIIIlIII[2]), "DES");
            final Cipher lllllllllllllIIlIllllIlllIIIlIll = Cipher.getInstance("DES");
            lllllllllllllIIlIllllIlllIIIlIll.init(LimitingByteInput.lIIllIIIIIlIII[3], lllllllllllllIIlIllllIlllIIIllII);
            return new String(lllllllllllllIIlIllllIlllIIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllllIlllIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllllIlllIIIlIlI) {
            lllllllllllllIIlIllllIlllIIIlIlI.printStackTrace();
            return null;
        }
    }
    
    LimitingByteInput(final ByteInput lllllllllllllIIlIllllIllllIIllII, final long lllllllllllllIIlIllllIllllIIlIII) {
        if (llIlIlIlIIIIlll(llIlIlIlIIIIllI(lllllllllllllIIlIllllIllllIIlIII, 0L))) {
            throw new IllegalArgumentException(LimitingByteInput.lIIllIIIIIIlll[LimitingByteInput.lIIllIIIIIlIII[0]]);
        }
        this.input = lllllllllllllIIlIllllIllllIIllII;
        this.limit = lllllllllllllIIlIllllIllllIIlIII;
    }
    
    public int available() throws IOException {
        return this.readable(this.input.available());
    }
    
    public long skip(final long lllllllllllllIIlIllllIlllIIllIIl) throws IOException {
        final int lllllllllllllIIlIllllIlllIIllIll = this.readable((int)lllllllllllllIIlIllllIlllIIllIIl);
        if (llIlIlIlIIIlIII(lllllllllllllIIlIllllIlllIIllIll)) {
            final long lllllllllllllIIlIllllIlllIIllllI = this.input.skip((long)lllllllllllllIIlIllllIlllIIllIll);
            this.read += lllllllllllllIIlIllllIlllIIllllI;
            return lllllllllllllIIlIllllIlllIIllllI;
        }
        throw LimitingByteInput.EXCEPTION;
    }
    
    public void close() throws IOException {
    }
    
    private static boolean llIlIlIlIIIlIII(final int lllllllllllllIIlIllllIlllIIIIIII) {
        return lllllllllllllIIlIllllIlllIIIIIII > 0;
    }
    
    private int readable(final int lllllllllllllIIlIllllIlllIIlIIIl) {
        return (int)Math.min(lllllllllllllIIlIllllIlllIIlIIIl, this.limit - this.read);
    }
    
    private static void llIlIlIlIIIIlII() {
        (lIIllIIIIIIlll = new String[LimitingByteInput.lIIllIIIIIlIII[1]])[LimitingByteInput.lIIllIIIIIlIII[0]] = llIlIlIlIIIIIll("Tym742qgi8teRAlPshzY66PDKDgcjD6x", "nFwpL");
    }
    
    private static int llIlIlIlIIIIllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean llIlIlIlIIIIlll(final int lllllllllllllIIlIllllIlllIIIIIlI) {
        return lllllllllllllIIlIllllIlllIIIIIlI <= 0;
    }
    
    public int read(final byte[] lllllllllllllIIlIllllIlllIllIlll) throws IOException {
        return this.read(lllllllllllllIIlIllllIlllIllIlll, LimitingByteInput.lIIllIIIIIlIII[0], lllllllllllllIIlIllllIlllIllIlll.length);
    }
    
    private static void llIlIlIlIIIIlIl() {
        (lIIllIIIIIlIII = new int[4])[0] = ((0x86 ^ 0x91) & ~(0x24 ^ 0x33));
        LimitingByteInput.lIIllIIIIIlIII[1] = " ".length();
        LimitingByteInput.lIIllIIIIIlIII[2] = (0x83 ^ 0x8B);
        LimitingByteInput.lIIllIIIIIlIII[3] = "  ".length();
    }
    
    static {
        llIlIlIlIIIIlIl();
        llIlIlIlIIIIlII();
        EXCEPTION = new TooBigObjectException();
    }
    
    public int read() throws IOException {
        final int lllllllllllllIIlIllllIlllIlllllI = this.readable(LimitingByteInput.lIIllIIIIIlIII[1]);
        if (llIlIlIlIIIlIII(lllllllllllllIIlIllllIlllIlllllI)) {
            final int lllllllllllllIIlIllllIllllIIIIII = this.input.read();
            ++this.read;
            return lllllllllllllIIlIllllIllllIIIIII;
        }
        throw LimitingByteInput.EXCEPTION;
    }
    
    public int read(final byte[] lllllllllllllIIlIllllIlllIlIIlll, final int lllllllllllllIIlIllllIlllIlIIllI, final int lllllllllllllIIlIllllIlllIlIIlIl) throws IOException {
        final int lllllllllllllIIlIllllIlllIlIlIIl = this.readable(lllllllllllllIIlIllllIlllIlIIlIl);
        if (llIlIlIlIIIlIII(lllllllllllllIIlIllllIlllIlIlIIl)) {
            final int lllllllllllllIIlIllllIlllIlIlllI = this.input.read(lllllllllllllIIlIllllIlllIlIIlll, lllllllllllllIIlIllllIlllIlIIllI, lllllllllllllIIlIllllIlllIlIlIIl);
            this.read += lllllllllllllIIlIllllIlllIlIlllI;
            return lllllllllllllIIlIllllIlllIlIlllI;
        }
        throw LimitingByteInput.EXCEPTION;
    }
    
    static final class TooBigObjectException extends IOException
    {
    }
}
