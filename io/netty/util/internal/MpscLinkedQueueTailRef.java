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

abstract class MpscLinkedQueueTailRef<E> extends MpscLinkedQueuePad1<E>
{
    private static final /* synthetic */ int[] lIlIIllIllIllI;
    private static final /* synthetic */ String[] lIlIIllIllIlIl;
    private transient volatile /* synthetic */ MpscLinkedQueueNode<E> tailRef;
    private static final /* synthetic */ AtomicReferenceFieldUpdater<MpscLinkedQueueTailRef, MpscLinkedQueueNode> UPDATER;
    
    private static void lllIlIIIIlIllll() {
        (lIlIIllIllIlIl = new String[MpscLinkedQueueTailRef.lIlIIllIllIllI[2]])[MpscLinkedQueueTailRef.lIlIIllIllIllI[0]] = lllIlIIIIlIllIl("LTIHBD08NQ==", "YSnho");
        MpscLinkedQueueTailRef.lIlIIllIllIlIl[MpscLinkedQueueTailRef.lIlIIllIllIllI[1]] = lllIlIIIIlIlllI("Rg38uEZIah4=", "wDBlQ");
    }
    
    protected final MpscLinkedQueueNode<E> getAndSetTailRef(final MpscLinkedQueueNode<E> lllllllllllllIIIllIIlIIlIIlllIII) {
        return MpscLinkedQueueTailRef.UPDATER.getAndSet(this, lllllllllllllIIIllIIlIIlIIlllIII);
    }
    
    private static boolean lllIlIIIIllIIIl(final Object lllllllllllllIIIllIIlIIlIIIIlIII) {
        return lllllllllllllIIIllIIlIIlIIIIlIII == null;
    }
    
    static {
        lllIlIIIIllIIII();
        lllIlIIIIlIllll();
        AtomicReferenceFieldUpdater<MpscLinkedQueueTailRef, MpscLinkedQueueNode> lllllllllllllIIIllIIlIIlIIllIlII = (AtomicReferenceFieldUpdater<MpscLinkedQueueTailRef, MpscLinkedQueueNode>)PlatformDependent.newAtomicReferenceFieldUpdater(MpscLinkedQueueTailRef.class, MpscLinkedQueueTailRef.lIlIIllIllIlIl[MpscLinkedQueueTailRef.lIlIIllIllIllI[0]]);
        if (lllIlIIIIllIIIl(lllllllllllllIIIllIIlIIlIIllIlII)) {
            lllllllllllllIIIllIIlIIlIIllIlII = (AtomicReferenceFieldUpdater<MpscLinkedQueueTailRef, MpscLinkedQueueNode>)AtomicReferenceFieldUpdater.newUpdater(MpscLinkedQueueTailRef.class, MpscLinkedQueueNode.class, MpscLinkedQueueTailRef.lIlIIllIllIlIl[MpscLinkedQueueTailRef.lIlIIllIllIllI[1]]);
        }
        UPDATER = lllllllllllllIIIllIIlIIlIIllIlII;
    }
    
    protected final MpscLinkedQueueNode<E> tailRef() {
        return this.tailRef;
    }
    
    private static String lllIlIIIIlIlllI(final String lllllllllllllIIIllIIlIIlIIIlIIll, final String lllllllllllllIIIllIIlIIlIIIlIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIllIIlIIlIIIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIlIIlIIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllIIlIIlIIIlIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllIIlIIlIIIlIlIl.init(MpscLinkedQueueTailRef.lIlIIllIllIllI[2], lllllllllllllIIIllIIlIIlIIIlIllI);
            return new String(lllllllllllllIIIllIIlIIlIIIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIlIIlIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIIlIIlIIIlIlII) {
            lllllllllllllIIIllIIlIIlIIIlIlII.printStackTrace();
            return null;
        }
    }
    
    private static String lllIlIIIIlIllIl(String lllllllllllllIIIllIIlIIlIIlIIIll, final String lllllllllllllIIIllIIlIIlIIlIIlll) {
        lllllllllllllIIIllIIlIIlIIlIIIll = new String(Base64.getDecoder().decode(lllllllllllllIIIllIIlIIlIIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllIIlIIlIIlIIllI = new StringBuilder();
        final char[] lllllllllllllIIIllIIlIIlIIlIIlIl = lllllllllllllIIIllIIlIIlIIlIIlll.toCharArray();
        int lllllllllllllIIIllIIlIIlIIlIIlII = MpscLinkedQueueTailRef.lIlIIllIllIllI[0];
        final int lllllllllllllIIIllIIlIIlIIIllllI = (Object)lllllllllllllIIIllIIlIIlIIlIIIll.toCharArray();
        final boolean lllllllllllllIIIllIIlIIlIIIlllIl = lllllllllllllIIIllIIlIIlIIIllllI.length != 0;
        float lllllllllllllIIIllIIlIIlIIIlllII = MpscLinkedQueueTailRef.lIlIIllIllIllI[0];
        while (lllIlIIIIllIIlI((int)lllllllllllllIIIllIIlIIlIIIlllII, lllllllllllllIIIllIIlIIlIIIlllIl ? 1 : 0)) {
            final char lllllllllllllIIIllIIlIIlIIlIlIIl = lllllllllllllIIIllIIlIIlIIIllllI[lllllllllllllIIIllIIlIIlIIIlllII];
            lllllllllllllIIIllIIlIIlIIlIIllI.append((char)(lllllllllllllIIIllIIlIIlIIlIlIIl ^ lllllllllllllIIIllIIlIIlIIlIIlIl[lllllllllllllIIIllIIlIIlIIlIIlII % lllllllllllllIIIllIIlIIlIIlIIlIl.length]));
            "".length();
            ++lllllllllllllIIIllIIlIIlIIlIIlII;
            ++lllllllllllllIIIllIIlIIlIIIlllII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllIIlIIlIIlIIllI);
    }
    
    private static void lllIlIIIIllIIII() {
        (lIlIIllIllIllI = new int[3])[0] = ((0x4D ^ 0x7C ^ (0x6B ^ 0x52)) & (0xEE ^ 0xB8 ^ (0x6D ^ 0x33) ^ -" ".length()));
        MpscLinkedQueueTailRef.lIlIIllIllIllI[1] = " ".length();
        MpscLinkedQueueTailRef.lIlIIllIllIllI[2] = "  ".length();
    }
    
    private static boolean lllIlIIIIllIIlI(final int lllllllllllllIIIllIIlIIlIIIIlIll, final int lllllllllllllIIIllIIlIIlIIIIlIlI) {
        return lllllllllllllIIIllIIlIIlIIIIlIll < lllllllllllllIIIllIIlIIlIIIIlIlI;
    }
    
    protected final void setTailRef(final MpscLinkedQueueNode<E> lllllllllllllIIIllIIlIIlIIlllllI) {
        this.tailRef = lllllllllllllIIIllIIlIIlIIlllllI;
    }
}
