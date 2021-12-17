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
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class MpscLinkedQueueNode<T>
{
    private static final /* synthetic */ String[] lIIlIIlIlllIII;
    private static final /* synthetic */ int[] lIIlIIlIlllIIl;
    private volatile /* synthetic */ MpscLinkedQueueNode<T> next;
    private static final /* synthetic */ AtomicReferenceFieldUpdater<MpscLinkedQueueNode, MpscLinkedQueueNode> nextUpdater;
    
    final MpscLinkedQueueNode<T> next() {
        return this.next;
    }
    
    private static String llIIllIlIllllII(final String lllllllllllllIIllIllIllllllllllI, final String lllllllllllllIIllIllIllllllllIll) {
        try {
            final SecretKeySpec lllllllllllllIIllIlllIIIIIIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIllIllllllllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIlllIIIIIIIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIlllIIIIIIIIIII.init(MpscLinkedQueueNode.lIIlIIlIlllIIl[2], lllllllllllllIIllIlllIIIIIIIIIIl);
            return new String(lllllllllllllIIllIlllIIIIIIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIllIllllllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIllIlllllllllll) {
            lllllllllllllIIllIllIlllllllllll.printStackTrace();
            return null;
        }
    }
    
    private static String llIIllIlIlllIll(String lllllllllllllIIllIllIllllllIlIIl, final String lllllllllllllIIllIllIllllllIlIII) {
        lllllllllllllIIllIllIllllllIlIIl = new String(Base64.getDecoder().decode(lllllllllllllIIllIllIllllllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIllIllllllIllII = new StringBuilder();
        final char[] lllllllllllllIIllIllIllllllIlIll = lllllllllllllIIllIllIllllllIlIII.toCharArray();
        int lllllllllllllIIllIllIllllllIlIlI = MpscLinkedQueueNode.lIIlIIlIlllIIl[0];
        final double lllllllllllllIIllIllIllllllIIlII = (Object)lllllllllllllIIllIllIllllllIlIIl.toCharArray();
        final float lllllllllllllIIllIllIllllllIIIll = lllllllllllllIIllIllIllllllIIlII.length;
        double lllllllllllllIIllIllIllllllIIIlI = MpscLinkedQueueNode.lIIlIIlIlllIIl[0];
        while (llIIllIllIIIIIl((int)lllllllllllllIIllIllIllllllIIIlI, (int)lllllllllllllIIllIllIllllllIIIll)) {
            final char lllllllllllllIIllIllIllllllIllll = lllllllllllllIIllIllIllllllIIlII[lllllllllllllIIllIllIllllllIIIlI];
            lllllllllllllIIllIllIllllllIllII.append((char)(lllllllllllllIIllIllIllllllIllll ^ lllllllllllllIIllIllIllllllIlIll[lllllllllllllIIllIllIllllllIlIlI % lllllllllllllIIllIllIllllllIlIll.length]));
            "".length();
            ++lllllllllllllIIllIllIllllllIlIlI;
            ++lllllllllllllIIllIllIllllllIIIlI;
            "".length();
            if (((0x69 ^ 0x3E) & ~(0x71 ^ 0x26)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIllIllllllIllII);
    }
    
    private static void llIIllIlIllllIl() {
        (lIIlIIlIlllIII = new String[MpscLinkedQueueNode.lIIlIIlIlllIIl[2]])[MpscLinkedQueueNode.lIIlIIlIlllIIl[0]] = llIIllIlIlllIll("Ji06Ag==", "HHBvy");
        MpscLinkedQueueNode.lIIlIIlIlllIII[MpscLinkedQueueNode.lIIlIIlIlllIIl[1]] = llIIllIlIllllII("YeZeB+Y2MOk=", "VRtNZ");
    }
    
    void unlink() {
        this.setNext(null);
    }
    
    final void setNext(final MpscLinkedQueueNode<T> lllllllllllllIIllIlllIIIIIIIllll) {
        MpscLinkedQueueNode.nextUpdater.lazySet(this, lllllllllllllIIllIlllIIIIIIIllll);
    }
    
    private static void llIIllIlIllllll() {
        (lIIlIIlIlllIIl = new int[3])[0] = ((0x26 ^ 0x22) & ~(0xC0 ^ 0xC4));
        MpscLinkedQueueNode.lIIlIIlIlllIIl[1] = " ".length();
        MpscLinkedQueueNode.lIIlIIlIlllIIl[2] = "  ".length();
    }
    
    protected T clearMaybe() {
        return this.value();
    }
    
    private static boolean llIIllIllIIIIIl(final int lllllllllllllIIllIllIlllllIllllI, final int lllllllllllllIIllIllIlllllIlllIl) {
        return lllllllllllllIIllIllIlllllIllllI < lllllllllllllIIllIllIlllllIlllIl;
    }
    
    public abstract T value();
    
    static {
        llIIllIlIllllll();
        llIIllIlIllllIl();
        AtomicReferenceFieldUpdater<MpscLinkedQueueNode, MpscLinkedQueueNode> lllllllllllllIIllIlllIIIIIIIIlll = (AtomicReferenceFieldUpdater<MpscLinkedQueueNode, MpscLinkedQueueNode>)PlatformDependent.newAtomicReferenceFieldUpdater(MpscLinkedQueueNode.class, MpscLinkedQueueNode.lIIlIIlIlllIII[MpscLinkedQueueNode.lIIlIIlIlllIIl[0]]);
        if (llIIllIllIIIIII(lllllllllllllIIllIlllIIIIIIIIlll)) {
            lllllllllllllIIllIlllIIIIIIIIlll = (AtomicReferenceFieldUpdater<MpscLinkedQueueNode, MpscLinkedQueueNode>)AtomicReferenceFieldUpdater.newUpdater(MpscLinkedQueueNode.class, MpscLinkedQueueNode.class, MpscLinkedQueueNode.lIIlIIlIlllIII[MpscLinkedQueueNode.lIIlIIlIlllIIl[1]]);
        }
        nextUpdater = lllllllllllllIIllIlllIIIIIIIIlll;
    }
    
    private static boolean llIIllIllIIIIII(final Object lllllllllllllIIllIllIlllllIllIll) {
        return lllllllllllllIIllIllIlllllIllIll == null;
    }
}
