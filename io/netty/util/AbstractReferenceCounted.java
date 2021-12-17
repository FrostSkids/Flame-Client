// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util;

import io.netty.util.internal.PlatformDependent;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public abstract class AbstractReferenceCounted implements ReferenceCounted
{
    private static final /* synthetic */ AtomicIntegerFieldUpdater<AbstractReferenceCounted> refCntUpdater;
    private static final /* synthetic */ int[] lIllIllllIlIlI;
    private static final /* synthetic */ String[] lIllIllllIlIII;
    private volatile /* synthetic */ int refCnt;
    
    protected final void setRefCnt(final int llllllllllllIllllllIIIllIlllIlll) {
        this.refCnt = llllllllllllIllllllIIIllIlllIlll;
    }
    
    private static boolean lIIIIIIIlIIIIIII(final Object llllllllllllIllllllIIIllIIIlIlII) {
        return llllllllllllIllllllIIIllIIIlIlII == null;
    }
    
    private static void lIIIIIIIIllllIIl() {
        (lIllIllllIlIlI = new int[10])[0] = " ".length();
        AbstractReferenceCounted.lIllIllllIlIlI[1] = ((0x7C ^ 0x66 ^ (0x42 ^ 0x3)) & (0xA0 ^ 0x80 ^ (0x2D ^ 0x56) ^ -" ".length()));
        AbstractReferenceCounted.lIllIllllIlIlI[2] = (-1 & Integer.MAX_VALUE);
        AbstractReferenceCounted.lIllIllllIlIlI[3] = -" ".length();
        AbstractReferenceCounted.lIllIllllIlIlI[4] = "  ".length();
        AbstractReferenceCounted.lIllIllllIlIlI[5] = "   ".length();
        AbstractReferenceCounted.lIllIllllIlIlI[6] = (0x6E ^ 0x6A);
        AbstractReferenceCounted.lIllIllllIlIlI[7] = (0x72 ^ 0x77);
        AbstractReferenceCounted.lIllIllllIlIlI[8] = (0x22 ^ 0x24);
        AbstractReferenceCounted.lIllIllllIlIlI[9] = (0xA7 ^ 0xAF);
    }
    
    private static boolean lIIIIIIIIlllllll(final int llllllllllllIllllllIIIllIIIllIll, final int llllllllllllIllllllIIIllIIIllIlI) {
        return llllllllllllIllllllIIIllIIIllIll < llllllllllllIllllllIIIllIIIllIlI;
    }
    
    private static boolean lIIIIIIIIllllIll(final int llllllllllllIllllllIIIllIIIlllll, final int llllllllllllIllllllIIIllIIIllllI) {
        return llllllllllllIllllllIIIllIIIlllll == llllllllllllIllllllIIIllIIIllllI;
    }
    
    public AbstractReferenceCounted() {
        this.refCnt = AbstractReferenceCounted.lIllIllllIlIlI[0];
    }
    
    private static String lIIIIIIIIllIllll(final String llllllllllllIllllllIIIllIIlIIlIl, final String llllllllllllIllllllIIIllIIlIIllI) {
        try {
            final SecretKeySpec llllllllllllIllllllIIIllIIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIIIllIIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllllIIIllIIlIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllllllIIIllIIlIlIIl.init(AbstractReferenceCounted.lIllIllllIlIlI[4], llllllllllllIllllllIIIllIIlIlIlI);
            return new String(llllllllllllIllllllIIIllIIlIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIIIllIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllIIIllIIlIlIII) {
            llllllllllllIllllllIIIllIIlIlIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public final int refCnt() {
        return this.refCnt;
    }
    
    private static boolean lIIIIIIIIlllllII(final int llllllllllllIllllllIIIllIIIlIIlI) {
        return llllllllllllIllllllIIIllIIIlIIlI != 0;
    }
    
    private static boolean lIIIIIIIIllllIlI(final int llllllllllllIllllllIIIllIIIlIIII) {
        return llllllllllllIllllllIIIllIIIlIIII == 0;
    }
    
    private static String lIIIIIIIIlllIIII(final String llllllllllllIllllllIIIllIIllIlII, final String llllllllllllIllllllIIIllIIllIIll) {
        try {
            final SecretKeySpec llllllllllllIllllllIIIllIIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIIIllIIllIIll.getBytes(StandardCharsets.UTF_8)), AbstractReferenceCounted.lIllIllllIlIlI[9]), "DES");
            final Cipher llllllllllllIllllllIIIllIIllIllI = Cipher.getInstance("DES");
            llllllllllllIllllllIIIllIIllIllI.init(AbstractReferenceCounted.lIllIllllIlIlI[4], llllllllllllIllllllIIIllIIllIlll);
            return new String(llllllllllllIllllllIIIllIIllIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIIIllIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllIIIllIIllIlIl) {
            llllllllllllIllllllIIIllIIllIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public final boolean release() {
        do {
            final int llllllllllllIllllllIIIllIllIIIll = this.refCnt;
            if (lIIIIIIIIllllIlI(llllllllllllIllllllIIIllIllIIIll)) {
                throw new IllegalReferenceCountException(AbstractReferenceCounted.lIllIllllIlIlI[1], AbstractReferenceCounted.lIllIllllIlIlI[3]);
            }
            if (lIIIIIIIIlllllII(AbstractReferenceCounted.refCntUpdater.compareAndSet(this, llllllllllllIllllllIIIllIllIIIll, llllllllllllIllllllIIIllIllIIIll - AbstractReferenceCounted.lIllIllllIlIlI[0]) ? 1 : 0)) {
                if (lIIIIIIIIllllIll(llllllllllllIllllllIIIllIllIIIll, AbstractReferenceCounted.lIllIllllIlIlI[0])) {
                    this.deallocate();
                    return AbstractReferenceCounted.lIllIllllIlIlI[0] != 0;
                }
                return AbstractReferenceCounted.lIllIllllIlIlI[1] != 0;
            }
            else {
                "".length();
            }
        } while ((118 + 144 - 161 + 90 ^ 131 + 164 - 287 + 179) > "  ".length());
        return ((0xD4 ^ 0x99 ^ (0x35 ^ 0x44)) & (21 + 14 + 12 + 107 ^ 146 + 2 - 141 + 159 ^ -" ".length())) != 0x0;
    }
    
    private static boolean lIIIIIIIIllllllI(final int llllllllllllIllllllIIIllIIIlIlll, final int llllllllllllIllllllIIIllIIIlIllI) {
        return llllllllllllIllllllIIIllIIIlIlll > llllllllllllIllllllIIIllIIIlIllI;
    }
    
    protected abstract void deallocate();
    
    private static String lIIIIIIIIllIlllI(String llllllllllllIllllllIIIllIlIIIlII, final String llllllllllllIllllllIIIllIlIIIIll) {
        llllllllllllIllllllIIIllIlIIIlII = new String(Base64.getDecoder().decode(llllllllllllIllllllIIIllIlIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllllIIIllIlIIIlll = new StringBuilder();
        final char[] llllllllllllIllllllIIIllIlIIIllI = llllllllllllIllllllIIIllIlIIIIll.toCharArray();
        int llllllllllllIllllllIIIllIlIIIlIl = AbstractReferenceCounted.lIllIllllIlIlI[1];
        final short llllllllllllIllllllIIIllIIllllll = (Object)llllllllllllIllllllIIIllIlIIIlII.toCharArray();
        final byte llllllllllllIllllllIIIllIIlllllI = (byte)llllllllllllIllllllIIIllIIllllll.length;
        float llllllllllllIllllllIIIllIIllllIl = AbstractReferenceCounted.lIllIllllIlIlI[1];
        while (lIIIIIIIIlllllll((int)llllllllllllIllllllIIIllIIllllIl, llllllllllllIllllllIIIllIIlllllI)) {
            final char llllllllllllIllllllIIIllIlIIlIlI = llllllllllllIllllllIIIllIIllllll[llllllllllllIllllllIIIllIIllllIl];
            llllllllllllIllllllIIIllIlIIIlll.append((char)(llllllllllllIllllllIIIllIlIIlIlI ^ llllllllllllIllllllIIIllIlIIIllI[llllllllllllIllllllIIIllIlIIIlIl % llllllllllllIllllllIIIllIlIIIllI.length]));
            "".length();
            ++llllllllllllIllllllIIIllIlIIIlIl;
            ++llllllllllllIllllllIIIllIIllllIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllllIIIllIlIIIlll);
    }
    
    private static void lIIIIIIIIlllIIIl() {
        (lIllIllllIlIII = new String[AbstractReferenceCounted.lIllIllllIlIlI[8]])[AbstractReferenceCounted.lIllIllllIlIlI[1]] = lIIIIIIIIllIlllI("PjkHHQ86MgobUHc=", "WWdoj");
        AbstractReferenceCounted.lIllIllllIlIII[AbstractReferenceCounted.lIllIllllIlIlI[0]] = lIIIIIIIIllIlllI("VH42DRURNScQAU52bVVVXQ==", "tVSue");
        AbstractReferenceCounted.lIllIllllIlIII[AbstractReferenceCounted.lIllIllllIlIlI[4]] = lIIIIIIIIllIllll("Gng/fezrH2Be8fpkJxbYGw==", "mERIf");
        AbstractReferenceCounted.lIllIllllIlIII[AbstractReferenceCounted.lIllIllllIlIlI[5]] = lIIIIIIIIllIllll("TZ4382qIVyA04OUSMbunGrsZI48V2Ktf", "qPfgq");
        AbstractReferenceCounted.lIllIllllIlIII[AbstractReferenceCounted.lIllIllllIlIlI[6]] = lIIIIIIIIlllIIII("SgHWvra9Ips=", "EJCAT");
        AbstractReferenceCounted.lIllIllllIlIII[AbstractReferenceCounted.lIllIllllIlIlI[7]] = lIIIIIIIIllIlllI("JS4hKRgj", "WKGjv");
    }
    
    private static boolean lIIIIIIIIlllllIl(final int llllllllllllIllllllIIIllIIIIlllI) {
        return llllllllllllIllllllIIIllIIIIlllI <= 0;
    }
    
    @Override
    public ReferenceCounted retain() {
        do {
            final int llllllllllllIllllllIIIllIlllIIlI = this.refCnt;
            if (lIIIIIIIIllllIlI(llllllllllllIllllllIIIllIlllIIlI)) {
                throw new IllegalReferenceCountException(AbstractReferenceCounted.lIllIllllIlIlI[1], AbstractReferenceCounted.lIllIllllIlIlI[0]);
            }
            if (lIIIIIIIIllllIll(llllllllllllIllllllIIIllIlllIIlI, AbstractReferenceCounted.lIllIllllIlIlI[2])) {
                throw new IllegalReferenceCountException(AbstractReferenceCounted.lIllIllllIlIlI[2], AbstractReferenceCounted.lIllIllllIlIlI[0]);
            }
            if (lIIIIIIIIlllllII(AbstractReferenceCounted.refCntUpdater.compareAndSet(this, llllllllllllIllllllIIIllIlllIIlI, llllllllllllIllllllIIIllIlllIIlI + AbstractReferenceCounted.lIllIllllIlIlI[0]) ? 1 : 0)) {
                "".length();
                if (-" ".length() >= "   ".length()) {
                    return null;
                }
                return this;
            }
            else {
                "".length();
            }
        } while (-(0x30 ^ 0x35) < 0);
        return null;
    }
    
    static {
        lIIIIIIIIllllIIl();
        lIIIIIIIIlllIIIl();
        AtomicIntegerFieldUpdater<AbstractReferenceCounted> llllllllllllIllllllIIIllIlIlIlIl = PlatformDependent.newAtomicIntegerFieldUpdater(AbstractReferenceCounted.class, AbstractReferenceCounted.lIllIllllIlIII[AbstractReferenceCounted.lIllIllllIlIlI[6]]);
        if (lIIIIIIIlIIIIIII(llllllllllllIllllllIIIllIlIlIlIl)) {
            llllllllllllIllllllIIIllIlIlIlIl = AtomicIntegerFieldUpdater.newUpdater(AbstractReferenceCounted.class, AbstractReferenceCounted.lIllIllllIlIII[AbstractReferenceCounted.lIllIllllIlIlI[7]]);
        }
        refCntUpdater = llllllllllllIllllllIIIllIlIlIlIl;
    }
    
    @Override
    public final boolean release(final int llllllllllllIllllllIIIllIlIllIII) {
        if (lIIIIIIIIlllllIl(llllllllllllIllllllIIIllIlIllIII)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(AbstractReferenceCounted.lIllIllllIlIII[AbstractReferenceCounted.lIllIllllIlIlI[4]]).append(llllllllllllIllllllIIIllIlIllIII).append(AbstractReferenceCounted.lIllIllllIlIII[AbstractReferenceCounted.lIllIllllIlIlI[5]])));
        }
        do {
            final int llllllllllllIllllllIIIllIlIlllII = this.refCnt;
            if (lIIIIIIIIlllllll(llllllllllllIllllllIIIllIlIlllII, llllllllllllIllllllIIIllIlIllIII)) {
                throw new IllegalReferenceCountException(llllllllllllIllllllIIIllIlIlllII, -llllllllllllIllllllIIIllIlIllIII);
            }
            if (lIIIIIIIIlllllII(AbstractReferenceCounted.refCntUpdater.compareAndSet(this, llllllllllllIllllllIIIllIlIlllII, llllllllllllIllllllIIIllIlIlllII - llllllllllllIllllllIIIllIlIllIII) ? 1 : 0)) {
                if (lIIIIIIIIllllIll(llllllllllllIllllllIIIllIlIlllII, llllllllllllIllllllIIIllIlIllIII)) {
                    this.deallocate();
                    return AbstractReferenceCounted.lIllIllllIlIlI[0] != 0;
                }
                return AbstractReferenceCounted.lIllIllllIlIlI[1] != 0;
            }
            else {
                "".length();
            }
        } while ("   ".length() > ((0x28 ^ 0x75) & ~(0xF7 ^ 0xAA)));
        return ((0x3 ^ 0x50) & ~(0x91 ^ 0xC2)) != 0x0;
    }
    
    @Override
    public ReferenceCounted retain(final int llllllllllllIllllllIIIllIllIlIIl) {
        if (lIIIIIIIIlllllIl(llllllllllllIllllllIIIllIllIlIIl)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(AbstractReferenceCounted.lIllIllllIlIII[AbstractReferenceCounted.lIllIllllIlIlI[1]]).append(llllllllllllIllllllIIIllIllIlIIl).append(AbstractReferenceCounted.lIllIllllIlIII[AbstractReferenceCounted.lIllIllllIlIlI[0]])));
        }
        do {
            final int llllllllllllIllllllIIIllIllIlIll = this.refCnt;
            if (lIIIIIIIIllllIlI(llllllllllllIllllllIIIllIllIlIll)) {
                throw new IllegalReferenceCountException(AbstractReferenceCounted.lIllIllllIlIlI[1], AbstractReferenceCounted.lIllIllllIlIlI[0]);
            }
            if (lIIIIIIIIllllllI(llllllllllllIllllllIIIllIllIlIll, AbstractReferenceCounted.lIllIllllIlIlI[2] - llllllllllllIllllllIIIllIllIlIIl)) {
                throw new IllegalReferenceCountException(llllllllllllIllllllIIIllIllIlIll, llllllllllllIllllllIIIllIllIlIIl);
            }
            if (lIIIIIIIIlllllII(AbstractReferenceCounted.refCntUpdater.compareAndSet(this, llllllllllllIllllllIIIllIllIlIll, llllllllllllIllllllIIIllIllIlIll + llllllllllllIllllllIIIllIllIlIIl) ? 1 : 0)) {
                "".length();
                if ((0x16 ^ 0x56 ^ (0xDD ^ 0x98)) == 0x0) {
                    return null;
                }
                return this;
            }
            else {
                "".length();
            }
        } while (-"   ".length() <= 0);
        return null;
    }
}
