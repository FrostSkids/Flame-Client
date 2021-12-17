// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import io.netty.util.ReferenceCounted;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.IllegalReferenceCountException;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public abstract class AbstractReferenceCountedByteBuf extends AbstractByteBuf
{
    private static final /* synthetic */ AtomicIntegerFieldUpdater<AbstractReferenceCountedByteBuf> refCntUpdater;
    private static final /* synthetic */ String[] lIllIIIIIlIIII;
    private static final /* synthetic */ int[] lIllIIIIIlIIIl;
    private volatile /* synthetic */ int refCnt;
    
    private static boolean llllIllIIIIIllI(final int lllllllllllllIIIIlIIIllllIllIIll, final int lllllllllllllIIIIlIIIllllIllIIlI) {
        return lllllllllllllIIIIlIIIllllIllIIll < lllllllllllllIIIIlIIIllllIllIIlI;
    }
    
    protected AbstractReferenceCountedByteBuf(final int lllllllllllllIIIIlIIlIIIIIIIlIIl) {
        super(lllllllllllllIIIIlIIlIIIIIIIlIIl);
        this.refCnt = AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[0];
    }
    
    private static boolean llllIllIIIIIlll(final Object lllllllllllllIIIIlIIIllllIlIllII) {
        return lllllllllllllIIIIlIIIllllIlIllII == null;
    }
    
    private static void llllIllIIIIIIII() {
        (lIllIIIIIlIIIl = new int[10])[0] = " ".length();
        AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[1] = ((0x7E ^ 0x31 ^ (0x36 ^ 0x32)) & (181 + 135 - 289 + 222 ^ 70 + 30 - 1 + 79 ^ -" ".length()));
        AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[2] = (-" ".length() & (-1 & Integer.MAX_VALUE));
        AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[3] = -" ".length();
        AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[4] = "  ".length();
        AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[5] = "   ".length();
        AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[6] = (0x6D ^ 0x5D ^ (0xBB ^ 0x8F));
        AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[7] = (0x19 ^ 0x1C);
        AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[8] = (0xC4 ^ 0xC2);
        AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[9] = (0xFA ^ 0x89 ^ (0x53 ^ 0x28));
    }
    
    private static String llllIlIllllllIl(final String lllllllllllllIIIIlIIIllllIllllIl, final String lllllllllllllIIIIlIIIllllIllllII) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIIIlllllIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIIIllllIllllII.getBytes(StandardCharsets.UTF_8)), AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[9]), "DES");
            final Cipher lllllllllllllIIIIlIIIlllllIIIIIl = Cipher.getInstance("DES");
            lllllllllllllIIIIlIIIlllllIIIIIl.init(AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[4], lllllllllllllIIIIlIIIlllllIIIIlI);
            return new String(lllllllllllllIIIIlIIIlllllIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIIIllllIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIIIlllllIIIIII) {
            lllllllllllllIIIIlIIIlllllIIIIII.printStackTrace();
            return null;
        }
    }
    
    protected abstract void deallocate();
    
    @Override
    public ByteBuf retain() {
        do {
            final int lllllllllllllIIIIlIIIllllllllIll = this.refCnt;
            if (llllIllIIIIIIIl(lllllllllllllIIIIlIIIllllllllIll)) {
                throw new IllegalReferenceCountException(AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[1], AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[0]);
            }
            if (llllIllIIIIIIlI(lllllllllllllIIIIlIIIllllllllIll, AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[2])) {
                throw new IllegalReferenceCountException(AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[2], AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[0]);
            }
            if (llllIllIIIIIIll(AbstractReferenceCountedByteBuf.refCntUpdater.compareAndSet(this, lllllllllllllIIIIlIIIllllllllIll, lllllllllllllIIIIlIIIllllllllIll + AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[0]) ? 1 : 0)) {
                "".length();
                if ((0xC2 ^ 0xC6) < "  ".length()) {
                    return null;
                }
                return this;
            }
            else {
                "".length();
            }
        } while (((0x30 ^ 0x7 ^ (0xC7 ^ 0xC1)) & (1 + 127 - 51 + 53 ^ 155 + 57 - 87 + 54 ^ -" ".length())) < "   ".length());
        return null;
    }
    
    private static boolean llllIllIIIIIIIl(final int lllllllllllllIIIIlIIIllllIlIlIII) {
        return lllllllllllllIIIIlIIIllllIlIlIII == 0;
    }
    
    @Override
    public final boolean release(final int lllllllllllllIIIIlIIIllllllIIIIl) {
        if (llllIllIIIIIlII(lllllllllllllIIIIlIIIllllllIIIIl)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(AbstractReferenceCountedByteBuf.lIllIIIIIlIIII[AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[4]]).append(lllllllllllllIIIIlIIIllllllIIIIl).append(AbstractReferenceCountedByteBuf.lIllIIIIIlIIII[AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[5]])));
        }
        do {
            final int lllllllllllllIIIIlIIIllllllIIlIl = this.refCnt;
            if (llllIllIIIIIllI(lllllllllllllIIIIlIIIllllllIIlIl, lllllllllllllIIIIlIIIllllllIIIIl)) {
                throw new IllegalReferenceCountException(lllllllllllllIIIIlIIIllllllIIlIl, -lllllllllllllIIIIlIIIllllllIIIIl);
            }
            if (llllIllIIIIIIll(AbstractReferenceCountedByteBuf.refCntUpdater.compareAndSet(this, lllllllllllllIIIIlIIIllllllIIlIl, lllllllllllllIIIIlIIIllllllIIlIl - lllllllllllllIIIIlIIIllllllIIIIl) ? 1 : 0)) {
                if (llllIllIIIIIIlI(lllllllllllllIIIIlIIIllllllIIlIl, lllllllllllllIIIIlIIIllllllIIIIl)) {
                    this.deallocate();
                    return AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[0] != 0;
                }
                return AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[1] != 0;
            }
            else {
                "".length();
            }
        } while (-(0xC1 ^ 0xC5) <= 0);
        return ((0x1D ^ 0x30) & ~(0x47 ^ 0x6A)) != 0x0;
    }
    
    @Override
    public final boolean release() {
        do {
            final int lllllllllllllIIIIlIIIllllllIllII = this.refCnt;
            if (llllIllIIIIIIIl(lllllllllllllIIIIlIIIllllllIllII)) {
                throw new IllegalReferenceCountException(AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[1], AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[3]);
            }
            if (llllIllIIIIIIll(AbstractReferenceCountedByteBuf.refCntUpdater.compareAndSet(this, lllllllllllllIIIIlIIIllllllIllII, lllllllllllllIIIIlIIIllllllIllII - AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[0]) ? 1 : 0)) {
                if (llllIllIIIIIIlI(lllllllllllllIIIIlIIIllllllIllII, AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[0])) {
                    this.deallocate();
                    return AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[0] != 0;
                }
                return AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[1] != 0;
            }
            else {
                "".length();
            }
        } while ((0xB4 ^ 0xB0) == (0x5C ^ 0x58));
        return ((0x6E ^ 0x70) & ~(0x65 ^ 0x7B)) != 0x0;
    }
    
    static {
        llllIllIIIIIIII();
        llllIlIllllllll();
        AtomicIntegerFieldUpdater<AbstractReferenceCountedByteBuf> lllllllllllllIIIIlIIIlllllIlIlIl = PlatformDependent.newAtomicIntegerFieldUpdater(AbstractReferenceCountedByteBuf.class, AbstractReferenceCountedByteBuf.lIllIIIIIlIIII[AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[6]]);
        if (llllIllIIIIIlll(lllllllllllllIIIIlIIIlllllIlIlIl)) {
            lllllllllllllIIIIlIIIlllllIlIlIl = AtomicIntegerFieldUpdater.newUpdater(AbstractReferenceCountedByteBuf.class, AbstractReferenceCountedByteBuf.lIllIIIIIlIIII[AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[7]]);
        }
        refCntUpdater = lllllllllllllIIIIlIIIlllllIlIlIl;
    }
    
    private static String llllIlIlllllllI(final String lllllllllllllIIIIlIIIlllllIIllII, final String lllllllllllllIIIIlIIIlllllIIlIll) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIIIlllllIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIIIlllllIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIlIIIlllllIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIlIIIlllllIIlllI.init(AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[4], lllllllllllllIIIIlIIIlllllIIllll);
            return new String(lllllllllllllIIIIlIIIlllllIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIIIlllllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIIIlllllIIllIl) {
            lllllllllllllIIIIlIIIlllllIIllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIllIIIIIIlI(final int lllllllllllllIIIIlIIIllllIllIlll, final int lllllllllllllIIIIlIIIllllIllIllI) {
        return lllllllllllllIIIIlIIIllllIllIlll == lllllllllllllIIIIlIIIllllIllIllI;
    }
    
    @Override
    public final int refCnt() {
        return this.refCnt;
    }
    
    private static void llllIlIllllllll() {
        (lIllIIIIIlIIII = new String[AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[8]])[AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[1]] = llllIlIllllllIl("IO2cACtop+YY0J6xSIhnjQ==", "hsLwP");
        AbstractReferenceCountedByteBuf.lIllIIIIIlIIII[AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[0]] = llllIlIlllllllI("wtPAop3znJLGEy/O6hAuCBEjGrFIN+tw", "cvWUI");
        AbstractReferenceCountedByteBuf.lIllIIIIIlIIII[AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[4]] = llllIlIllllllIl("9F8OKbEjed/L0cTRovvyAQ==", "BNlQY");
        AbstractReferenceCountedByteBuf.lIllIIIIIlIIII[AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[5]] = llllIlIllllllIl("NgA+V+SXVRG1/xOYzGGaB/DfjX2tUVEV", "skWPv");
        AbstractReferenceCountedByteBuf.lIllIIIIIlIIII[AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[6]] = llllIlIlllllllI("1MDa8Mw8s1w=", "bYOpH");
        AbstractReferenceCountedByteBuf.lIllIIIIIlIIII[AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[7]] = llllIlIllllllIl("riC6s2Vl9ls=", "MTQSB");
    }
    
    protected final void setRefCnt(final int lllllllllllllIIIIlIIIllllllllllI) {
        this.refCnt = lllllllllllllIIIIlIIIllllllllllI;
    }
    
    private static boolean llllIllIIIIIlIl(final int lllllllllllllIIIIlIIIllllIlIllll, final int lllllllllllllIIIIlIIIllllIlIlllI) {
        return lllllllllllllIIIIlIIIllllIlIllll > lllllllllllllIIIIlIIIllllIlIlllI;
    }
    
    private static boolean llllIllIIIIIlII(final int lllllllllllllIIIIlIIIllllIlIIllI) {
        return lllllllllllllIIIIlIIIllllIlIIllI <= 0;
    }
    
    @Override
    public ByteBuf retain(final int lllllllllllllIIIIlIIIlllllllIIlI) {
        if (llllIllIIIIIlII(lllllllllllllIIIIlIIIlllllllIIlI)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(AbstractReferenceCountedByteBuf.lIllIIIIIlIIII[AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[1]]).append(lllllllllllllIIIIlIIIlllllllIIlI).append(AbstractReferenceCountedByteBuf.lIllIIIIIlIIII[AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[0]])));
        }
        do {
            final int lllllllllllllIIIIlIIIlllllllIlII = this.refCnt;
            if (llllIllIIIIIIIl(lllllllllllllIIIIlIIIlllllllIlII)) {
                throw new IllegalReferenceCountException(AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[1], lllllllllllllIIIIlIIIlllllllIIlI);
            }
            if (llllIllIIIIIlIl(lllllllllllllIIIIlIIIlllllllIlII, AbstractReferenceCountedByteBuf.lIllIIIIIlIIIl[2] - lllllllllllllIIIIlIIIlllllllIIlI)) {
                throw new IllegalReferenceCountException(lllllllllllllIIIIlIIIlllllllIlII, lllllllllllllIIIIlIIIlllllllIIlI);
            }
            if (llllIllIIIIIIll(AbstractReferenceCountedByteBuf.refCntUpdater.compareAndSet(this, lllllllllllllIIIIlIIIlllllllIlII, lllllllllllllIIIIlIIIlllllllIlII + lllllllllllllIIIIlIIIlllllllIIlI) ? 1 : 0)) {
                "".length();
                if (" ".length() < 0) {
                    return null;
                }
                return this;
            }
            else {
                "".length();
            }
        } while (-" ".length() != ((153 + 189 - 251 + 99 ^ 18 + 35 + 17 + 108) & (98 + 51 - 41 + 33 ^ 116 + 116 - 158 + 55 ^ -" ".length()) & (((0xC ^ 0x3A ^ (0x2A ^ 0x37)) & (0xDC ^ 0xA5 ^ (0xC ^ 0x5E) ^ -" ".length())) ^ -" ".length())));
        return null;
    }
    
    private static boolean llllIllIIIIIIll(final int lllllllllllllIIIIlIIIllllIlIlIlI) {
        return lllllllllllllIIIIlIIIllllIlIlIlI != 0;
    }
}
