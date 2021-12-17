// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.ssl.util;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.internal.ThreadLocalRandom;
import java.util.Random;
import java.security.SecureRandom;

final class ThreadLocalInsecureRandom extends SecureRandom
{
    private static final /* synthetic */ SecureRandom INSTANCE;
    private static final /* synthetic */ String[] lllllIllIIlIl;
    private static final /* synthetic */ int[] lllllIllIIllI;
    
    static SecureRandom current() {
        return ThreadLocalInsecureRandom.INSTANCE;
    }
    
    private static Random random() {
        return ThreadLocalRandom.current();
    }
    
    @Override
    public int nextInt(final int lllllllllllllIlIlIllIIllIllllIlI) {
        return random().nextInt(lllllllllllllIlIlIllIIllIllllIlI);
    }
    
    @Override
    public float nextFloat() {
        return random().nextFloat();
    }
    
    private static String lIlIlllIllllIlI(final String lllllllllllllIlIlIllIIllIllIlIlI, final String lllllllllllllIlIlIllIIllIllIlIll) {
        try {
            final SecretKeySpec lllllllllllllIlIlIllIIllIllIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIllIIllIllIlIll.getBytes(StandardCharsets.UTF_8)), ThreadLocalInsecureRandom.lllllIllIIllI[2]), "DES");
            final Cipher lllllllllllllIlIlIllIIllIllIlllI = Cipher.getInstance("DES");
            lllllllllllllIlIlIllIIllIllIlllI.init(ThreadLocalInsecureRandom.lllllIllIIllI[3], lllllllllllllIlIlIllIIllIllIllll);
            return new String(lllllllllllllIlIlIllIIllIllIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIllIIllIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIllIIllIllIllIl) {
            lllllllllllllIlIlIllIIllIllIllIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean nextBoolean() {
        return random().nextBoolean();
    }
    
    @Override
    public double nextGaussian() {
        return random().nextGaussian();
    }
    
    private static void lIlIlllIllllIll() {
        (lllllIllIIlIl = new String[ThreadLocalInsecureRandom.lllllIllIIllI[1]])[ThreadLocalInsecureRandom.lllllIllIIllI[0]] = lIlIlllIllllIlI("5HQbtIXSk0naLxcuA00MCA==", "QhTis");
    }
    
    @Override
    public int nextInt() {
        return random().nextInt();
    }
    
    @Override
    public byte[] generateSeed(final int lllllllllllllIlIlIllIIlllIIIIIIl) {
        final byte[] lllllllllllllIlIlIllIIlllIIIIIII = new byte[lllllllllllllIlIlIllIIlllIIIIIIl];
        random().nextBytes(lllllllllllllIlIlIllIIlllIIIIIII);
        return lllllllllllllIlIlIllIIlllIIIIIII;
    }
    
    static {
        lIlIlllIlllllII();
        lIlIlllIllllIll();
        INSTANCE = new ThreadLocalInsecureRandom();
    }
    
    @Override
    public String getAlgorithm() {
        return ThreadLocalInsecureRandom.lllllIllIIlIl[ThreadLocalInsecureRandom.lllllIllIIllI[0]];
    }
    
    private ThreadLocalInsecureRandom() {
    }
    
    @Override
    public long nextLong() {
        return random().nextLong();
    }
    
    private static void lIlIlllIlllllII() {
        (lllllIllIIllI = new int[4])[0] = ((0x67 ^ 0x5 ^ (0x3A ^ 0x51)) & (0x7E ^ 0x61 ^ (0x9D ^ 0x8B) ^ -" ".length()));
        ThreadLocalInsecureRandom.lllllIllIIllI[1] = " ".length();
        ThreadLocalInsecureRandom.lllllIllIIllI[2] = (0x9E ^ 0x97 ^ " ".length());
        ThreadLocalInsecureRandom.lllllIllIIllI[3] = "  ".length();
    }
    
    @Override
    public void nextBytes(final byte[] lllllllllllllIlIlIllIIlllIIIIllI) {
        random().nextBytes(lllllllllllllIlIlIllIIlllIIIIllI);
    }
    
    @Override
    public void setSeed(final byte[] lllllllllllllIlIlIllIIlllIIIlIll) {
    }
    
    @Override
    public void setSeed(final long lllllllllllllIlIlIllIIlllIIIlIIl) {
    }
    
    @Override
    public double nextDouble() {
        return random().nextDouble();
    }
}
