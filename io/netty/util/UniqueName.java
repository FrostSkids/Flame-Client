// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util;

import java.util.concurrent.ConcurrentMap;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
public class UniqueName implements Comparable<UniqueName>
{
    private static final /* synthetic */ int[] llIIllllllllll;
    private final /* synthetic */ int id;
    private final /* synthetic */ String name;
    private static final /* synthetic */ AtomicInteger nextId;
    private static final /* synthetic */ String[] llIIlllllllllI;
    
    protected void validateArgs(final Object... llllllllllllIllIlllIIIIlIllllIll) {
    }
    
    private static String lIIlIIIIllIllIlI(final String llllllllllllIllIlllIIIIlIlIlIIlI, final String llllllllllllIllIlllIIIIlIlIlIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIlllIIIIlIlIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIIIIlIlIlIIIl.getBytes(StandardCharsets.UTF_8)), UniqueName.llIIllllllllll[4]), "DES");
            final Cipher llllllllllllIllIlllIIIIlIlIlIlII = Cipher.getInstance("DES");
            llllllllllllIllIlllIIIIlIlIlIlII.init(UniqueName.llIIllllllllll[2], llllllllllllIllIlllIIIIlIlIlIlIl);
            return new String(llllllllllllIllIlllIIIIlIlIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIIIIlIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllIIIIlIlIlIIll) {
            llllllllllllIllIlllIIIIlIlIlIIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public final int hashCode() {
        return super.hashCode();
    }
    
    private static boolean lIIlIIIIlllIIIlI(final int llllllllllllIllIlllIIIIlIIllIllI) {
        return llllllllllllIllIlllIIIIlIIllIllI != 0;
    }
    
    private static void lIIlIIIIllIlllII() {
        (llIIlllllllllI = new String[UniqueName.llIIllllllllll[3]])[UniqueName.llIIllllllllll[0]] = lIIlIIIIllIllIlI("Ft1YRe3IxZw=", "BePHW");
        UniqueName.llIIlllllllllI[UniqueName.llIIllllllllll[1]] = lIIlIIIIllIllIlI("Ni9ivQrMN4Q=", "ZGMUJ");
        UniqueName.llIIlllllllllI[UniqueName.llIIllllllllll[2]] = lIIlIIIIllIllIll("rw4epCsQRpLuc0YkH1zq55+UDQDkrMLo", "jwISt");
    }
    
    private static boolean lIIlIIIIlllIIIIl(final Object llllllllllllIllIlllIIIIlIIlllIll, final Object llllllllllllIllIlllIIIIlIIlllIlI) {
        return llllllllllllIllIlllIIIIlIIlllIll == llllllllllllIllIlllIIIIlIIlllIlI;
    }
    
    public final int id() {
        return this.id;
    }
    
    @Override
    public final boolean equals(final Object llllllllllllIllIlllIIIIlIllIlllI) {
        return super.equals(llllllllllllIllIlllIIIIlIllIlllI);
    }
    
    private static void lIIlIIIIllIlllIl() {
        (llIIllllllllll = new int[5])[0] = ((0x5C ^ 0x6F) & ~(0xA3 ^ 0x90));
        UniqueName.llIIllllllllll[1] = " ".length();
        UniqueName.llIIllllllllll[2] = "  ".length();
        UniqueName.llIIllllllllll[3] = "   ".length();
        UniqueName.llIIllllllllll[4] = (0x1F ^ 0x17);
    }
    
    private static boolean lIIlIIIIllIlllll(final Object llllllllllllIllIlllIIIIlIIlllllI) {
        return llllllllllllIllIlllIIIIlIIlllllI != null;
    }
    
    static {
        lIIlIIIIllIlllIl();
        lIIlIIIIllIlllII();
        nextId = new AtomicInteger();
    }
    
    private static boolean lIIlIIIIlllIIIII(final int llllllllllllIllIlllIIIIlIIllIlII) {
        return llllllllllllIllIlllIIIIlIIllIlII > 0;
    }
    
    @Override
    public String toString() {
        return this.name();
    }
    
    private static boolean lIIlIIIIllIllllI(final Object llllllllllllIllIlllIIIIlIIlllIII) {
        return llllllllllllIllIlllIIIIlIIlllIII == null;
    }
    
    private static String lIIlIIIIllIllIll(final String llllllllllllIllIlllIIIIlIlIIIlIl, final String llllllllllllIllIlllIIIIlIlIIIlII) {
        try {
            final SecretKeySpec llllllllllllIllIlllIIIIlIlIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIIIIlIlIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlllIIIIlIlIIIlll = Cipher.getInstance("Blowfish");
            llllllllllllIllIlllIIIIlIlIIIlll.init(UniqueName.llIIllllllllll[2], llllllllllllIllIlllIIIIlIlIIlIII);
            return new String(llllllllllllIllIlllIIIIlIlIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIIIIlIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllIIIIlIlIIIllI) {
            llllllllllllIllIlllIIIIlIlIIIllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int compareTo(final UniqueName llllllllllllIllIlllIIIIlIllIIlII) {
        if (lIIlIIIIlllIIIIl(this, llllllllllllIllIlllIIIIlIllIIlII)) {
            return UniqueName.llIIllllllllll[0];
        }
        final int llllllllllllIllIlllIIIIlIllIIllI = this.name.compareTo(llllllllllllIllIlllIIIIlIllIIlII.name);
        if (lIIlIIIIlllIIIlI(llllllllllllIllIlllIIIIlIllIIllI)) {
            return llllllllllllIllIlllIIIIlIllIIllI;
        }
        return Integer.valueOf(this.id).compareTo(llllllllllllIllIlllIIIIlIllIIlII.id);
    }
    
    public UniqueName(final ConcurrentMap<String, Boolean> llllllllllllIllIlllIIIIlIlllllll, final String llllllllllllIllIlllIIIIlIllllllI, final Object... llllllllllllIllIlllIIIIllIIIIIIl) {
        if (lIIlIIIIllIllllI(llllllllllllIllIlllIIIIlIlllllll)) {
            throw new NullPointerException(UniqueName.llIIlllllllllI[UniqueName.llIIllllllllll[0]]);
        }
        if (lIIlIIIIllIllllI(llllllllllllIllIlllIIIIlIllllllI)) {
            throw new NullPointerException(UniqueName.llIIlllllllllI[UniqueName.llIIllllllllll[1]]);
        }
        if (lIIlIIIIllIlllll(llllllllllllIllIlllIIIIllIIIIIIl) && lIIlIIIIlllIIIII(llllllllllllIllIlllIIIIllIIIIIIl.length)) {
            this.validateArgs(llllllllllllIllIlllIIIIllIIIIIIl);
        }
        if (lIIlIIIIllIlllll(llllllllllllIllIlllIIIIlIlllllll.putIfAbsent(llllllllllllIllIlllIIIIlIllllllI, Boolean.TRUE))) {
            final String format = UniqueName.llIIlllllllllI[UniqueName.llIIllllllllll[2]];
            final Object[] args = new Object[UniqueName.llIIllllllllll[1]];
            args[UniqueName.llIIllllllllll[0]] = llllllllllllIllIlllIIIIlIllllllI;
            throw new IllegalArgumentException(String.format(format, args));
        }
        this.id = UniqueName.nextId.incrementAndGet();
        this.name = llllllllllllIllIlllIIIIlIllllllI;
    }
    
    public final String name() {
        return this.name;
    }
}
