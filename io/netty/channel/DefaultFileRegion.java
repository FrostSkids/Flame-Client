// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import io.netty.util.internal.logging.InternalLoggerFactory;
import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.nio.channels.FileChannel;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.AbstractReferenceCounted;

public class DefaultFileRegion extends AbstractReferenceCounted implements FileRegion
{
    private final /* synthetic */ long count;
    private /* synthetic */ long transfered;
    private final /* synthetic */ long position;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ String[] llIIIlIlIIllIl;
    private static final /* synthetic */ int[] llIIIlIlIlIIll;
    private final /* synthetic */ FileChannel file;
    
    public DefaultFileRegion(final FileChannel llllllllllllIlllIlIllIllIIIlIIII, final long llllllllllllIlllIlIllIllIIIIllll, final long llllllllllllIlllIlIllIllIIIlIIlI) {
        if (lIIIlIIlIlIlIlII(llllllllllllIlllIlIllIllIIIlIIII)) {
            throw new NullPointerException(DefaultFileRegion.llIIIlIlIIllIl[DefaultFileRegion.llIIIlIlIlIIll[0]]);
        }
        if (lIIIlIIlIlIlIlIl(lIIIlIIlIlIlIIll(llllllllllllIlllIlIllIllIIIIllll, 0L))) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(DefaultFileRegion.llIIIlIlIIllIl[DefaultFileRegion.llIIIlIlIlIIll[1]]).append(llllllllllllIlllIlIllIllIIIIllll)));
        }
        if (lIIIlIIlIlIlIlIl(lIIIlIIlIlIlIIll(llllllllllllIlllIlIllIllIIIlIIlI, 0L))) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(DefaultFileRegion.llIIIlIlIIllIl[DefaultFileRegion.llIIIlIlIlIIll[2]]).append(llllllllllllIlllIlIllIllIIIlIIlI)));
        }
        this.file = llllllllllllIlllIlIllIllIIIlIIII;
        this.position = llllllllllllIlllIlIllIllIIIIllll;
        this.count = llllllllllllIlllIlIllIllIIIlIIlI;
    }
    
    private static void lIIIlIIlIlIlIIlI() {
        (llIIIlIlIlIIll = new int[9])[0] = ((0xD5 ^ 0x84 ^ ((0xC2 ^ 0x8A) & ~(0x3E ^ 0x76))) & (75 + 72 - 110 + 90 ^ (0x80 ^ 0xAE) ^ -" ".length()));
        DefaultFileRegion.llIIIlIlIlIIll[1] = " ".length();
        DefaultFileRegion.llIIIlIlIlIIll[2] = "  ".length();
        DefaultFileRegion.llIIIlIlIlIIll[3] = "   ".length();
        DefaultFileRegion.llIIIlIlIlIIll[4] = (0x4C ^ 0x48);
        DefaultFileRegion.llIIIlIlIlIIll[5] = (0xB5 ^ 0x9C);
        DefaultFileRegion.llIIIlIlIlIIll[6] = (0x22 ^ 0x2A ^ (0x3A ^ 0x37));
        DefaultFileRegion.llIIIlIlIlIIll[7] = (0xFF ^ 0x8D ^ (0x1A ^ 0x6E));
        DefaultFileRegion.llIIIlIlIlIIll[8] = (0x7D ^ 0x53 ^ (0x73 ^ 0x55));
    }
    
    private static String lIIIlIIlIlIIlIII(final String llllllllllllIlllIlIllIlIllIIIIll, final String llllllllllllIlllIlIllIlIllIIIIII) {
        try {
            final SecretKeySpec llllllllllllIlllIlIllIlIllIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIllIlIllIIIIII.getBytes(StandardCharsets.UTF_8)), DefaultFileRegion.llIIIlIlIlIIll[8]), "DES");
            final Cipher llllllllllllIlllIlIllIlIllIIIlIl = Cipher.getInstance("DES");
            llllllllllllIlllIlIllIlIllIIIlIl.init(DefaultFileRegion.llIIIlIlIlIIll[2], llllllllllllIlllIlIllIlIllIIIllI);
            return new String(llllllllllllIlllIlIllIlIllIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIllIlIllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIllIlIllIIIlII) {
            llllllllllllIlllIlIllIlIllIIIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIlIIlIlIlIlII(final Object llllllllllllIlllIlIllIlIlIlllIII) {
        return llllllllllllIlllIlIllIlIlIlllIII == null;
    }
    
    @Override
    public long transferTo(final WritableByteChannel llllllllllllIlllIlIllIlIlllllIIl, final long llllllllllllIlllIlIllIlIlllllIII) throws IOException {
        final long llllllllllllIlllIlIllIlIllllllII = this.count - llllllllllllIlllIlIllIlIlllllIII;
        if (!lIIIlIIlIlIlIlll(lIIIlIIlIlIlIllI(llllllllllllIlllIlIllIlIllllllII, 0L)) || lIIIlIIlIlIlIlIl(lIIIlIIlIlIlIllI(llllllllllllIlllIlIllIlIlllllIII, 0L))) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(DefaultFileRegion.llIIIlIlIIllIl[DefaultFileRegion.llIIIlIlIlIIll[3]]).append(llllllllllllIlllIlIllIlIlllllIII).append(DefaultFileRegion.llIIIlIlIIllIl[DefaultFileRegion.llIIIlIlIlIIll[4]]).append(this.count - 1L).append((char)DefaultFileRegion.llIIIlIlIlIIll[5])));
        }
        if (lIIIlIIlIlIllIII(lIIIlIIlIlIlIllI(llllllllllllIlllIlIllIlIllllllII, 0L))) {
            return 0L;
        }
        final long llllllllllllIlllIlIllIlIlllllIll = this.file.transferTo(this.position + llllllllllllIlllIlIllIlIlllllIII, llllllllllllIlllIlIllIlIllllllII, llllllllllllIlllIlIllIlIlllllIIl);
        if (lIIIlIIlIlIllIIl(lIIIlIIlIlIlIllI(llllllllllllIlllIlIllIlIlllllIll, 0L))) {
            this.transfered += llllllllllllIlllIlIllIlIlllllIll;
        }
        return llllllllllllIlllIlIllIlIlllllIll;
    }
    
    private static int lIIIlIIlIlIlIllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIIIlIIlIlIllIlI(final int llllllllllllIlllIlIllIlIlIllIllI) {
        return llllllllllllIlllIlIllIlIlIllIllI != 0;
    }
    
    private static String lIIIlIIlIlIIIlll(final String llllllllllllIlllIlIllIlIllIIlllI, final String llllllllllllIlllIlIllIlIllIIllll) {
        try {
            final SecretKeySpec llllllllllllIlllIlIllIlIllIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIllIlIllIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlIllIlIllIlIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlIllIlIllIlIIlI.init(DefaultFileRegion.llIIIlIlIlIIll[2], llllllllllllIlllIlIllIlIllIlIIll);
            return new String(llllllllllllIlllIlIllIlIllIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIllIlIllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIllIlIllIlIIIl) {
            llllllllllllIlllIlIllIlIllIlIIIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIlIIlIlIIIllI(String llllllllllllIlllIlIllIlIlllIIIII, final String llllllllllllIlllIlIllIlIllIlllll) {
        llllllllllllIlllIlIllIlIlllIIIII = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIlIllIlIlllIIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlIllIlIlllIIIll = new StringBuilder();
        final char[] llllllllllllIlllIlIllIlIlllIIIlI = llllllllllllIlllIlIllIlIllIlllll.toCharArray();
        int llllllllllllIlllIlIllIlIlllIIIIl = DefaultFileRegion.llIIIlIlIlIIll[0];
        final long llllllllllllIlllIlIllIlIllIllIll = (Object)((String)llllllllllllIlllIlIllIlIlllIIIII).toCharArray();
        final byte llllllllllllIlllIlIllIlIllIllIlI = (byte)llllllllllllIlllIlIllIlIllIllIll.length;
        boolean llllllllllllIlllIlIllIlIllIllIIl = DefaultFileRegion.llIIIlIlIlIIll[0] != 0;
        while (lIIIlIIlIlIllIll(llllllllllllIlllIlIllIlIllIllIIl ? 1 : 0, llllllllllllIlllIlIllIlIllIllIlI)) {
            final char llllllllllllIlllIlIllIlIlllIIllI = llllllllllllIlllIlIllIlIllIllIll[llllllllllllIlllIlIllIlIllIllIIl];
            llllllllllllIlllIlIllIlIlllIIIll.append((char)(llllllllllllIlllIlIllIlIlllIIllI ^ llllllllllllIlllIlIllIlIlllIIIlI[llllllllllllIlllIlIllIlIlllIIIIl % llllllllllllIlllIlIllIlIlllIIIlI.length]));
            "".length();
            ++llllllllllllIlllIlIllIlIlllIIIIl;
            ++llllllllllllIlllIlIllIlIllIllIIl;
            "".length();
            if (-" ".length() > " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlIllIlIlllIIIll);
    }
    
    private static boolean lIIIlIIlIlIlIlIl(final int llllllllllllIlllIlIllIlIlIllIIII) {
        return llllllllllllIlllIlIllIlIlIllIIII < 0;
    }
    
    private static boolean lIIIlIIlIlIlIlll(final int llllllllllllIlllIlIllIlIlIllIIlI) {
        return llllllllllllIlllIlIllIlIlIllIIlI >= 0;
    }
    
    @Override
    protected void deallocate() {
        try {
            this.file.close();
            "".length();
            if (((0x5B ^ 0x19) & ~(0x66 ^ 0x24)) >= " ".length()) {
                return;
            }
        }
        catch (IOException llllllllllllIlllIlIllIlIllllIIll) {
            if (lIIIlIIlIlIllIlI(DefaultFileRegion.logger.isWarnEnabled() ? 1 : 0)) {
                DefaultFileRegion.logger.warn(DefaultFileRegion.llIIIlIlIIllIl[DefaultFileRegion.llIIIlIlIlIIll[6]], llllllllllllIlllIlIllIlIllllIIll);
            }
        }
    }
    
    private static void lIIIlIIlIlIIlIIl() {
        (llIIIlIlIIllIl = new String[DefaultFileRegion.llIIIlIlIlIIll[7]])[DefaultFileRegion.llIIIlIlIlIIll[0]] = lIIIlIIlIlIIIllI("MC8AHQ==", "VFlxh");
        DefaultFileRegion.llIIIlIlIIllIl[DefaultFileRegion.llIIIlIlIlIIll[1]] = lIIIlIIlIlIIIlll("5g9LyrzhaUJ1but3JfWI3haIZniHphWHWIFPrOmrjMg=", "XRnRN");
        DefaultFileRegion.llIIIlIlIIllIl[DefaultFileRegion.llIIIlIlIlIIll[2]] = lIIIlIIlIlIIlIII("fixhKbPHsTL32QFoGDenn/nwHABka2pSFYxCkJWDfd4=", "fbcGa");
        DefaultFileRegion.llIIIlIlIIllIl[DefaultFileRegion.llIIIlIlIlIIll[3]] = lIIIlIIlIlIIIllI("OTseHTAgOwNUKzwgTRsiaSYMGiMsbk0=", "ITmtD");
        DefaultFileRegion.llIIIlIlIIllIl[DefaultFileRegion.llIIIlIlIlIIll[4]] = lIIIlIIlIlIIIllI("bWsXMzIoIAYuJndjQmtvbQ==", "MCrKB");
        DefaultFileRegion.llIIIlIlIIllIl[DefaultFileRegion.llIIIlIlIlIIll[6]] = lIIIlIIlIlIIIlll("8R9bC4Stwiy97m0tgWJ6MePq8+RvE4YL", "jbHlE");
    }
    
    private static boolean lIIIlIIlIlIllIIl(final int llllllllllllIlllIlIllIlIlIlIlllI) {
        return llllllllllllIlllIlIllIlIlIlIlllI > 0;
    }
    
    @Override
    public long count() {
        return this.count;
    }
    
    private static boolean lIIIlIIlIlIllIll(final int llllllllllllIlllIlIllIlIlIlllIll, final int llllllllllllIlllIlIllIlIlIlllIlI) {
        return llllllllllllIlllIlIllIlIlIlllIll < llllllllllllIlllIlIllIlIlIlllIlI;
    }
    
    static {
        lIIIlIIlIlIlIIlI();
        lIIIlIIlIlIIlIIl();
        logger = InternalLoggerFactory.getInstance(DefaultFileRegion.class);
    }
    
    @Override
    public long transfered() {
        return this.transfered;
    }
    
    private static int lIIIlIIlIlIlIIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIIIlIIlIlIllIII(final int llllllllllllIlllIlIllIlIlIllIlII) {
        return llllllllllllIlllIlIllIlIlIllIlII == 0;
    }
    
    @Override
    public long position() {
        return this.position;
    }
}
