// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.io.Serializable;

abstract class MpscLinkedQueueHeadRef<E> extends MpscLinkedQueuePad0<E> implements Serializable
{
    private static final /* synthetic */ AtomicReferenceFieldUpdater<MpscLinkedQueueHeadRef, MpscLinkedQueueNode> UPDATER;
    private static final /* synthetic */ String[] llIllllIllIIll;
    private transient volatile /* synthetic */ MpscLinkedQueueNode<E> headRef;
    private static final /* synthetic */ int[] llIlllllIIlIIl;
    
    protected final void setHeadRef(final MpscLinkedQueueNode<E> llllllllllllIllIIIllIIIlIIlllIIl) {
        this.headRef = llllllllllllIllIIIllIIIlIIlllIIl;
    }
    
    protected final MpscLinkedQueueNode<E> headRef() {
        return this.headRef;
    }
    
    private static String lIIllIlIllIIIllI(String llllllllllllIllIIIllIIIlIIIlIIll, final String llllllllllllIllIIIllIIIlIIIlIlll) {
        llllllllllllIllIIIllIIIlIIIlIIll = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIllIIIlIIIlIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIllIIIlIIIlIllI = new StringBuilder();
        final char[] llllllllllllIllIIIllIIIlIIIlIlIl = llllllllllllIllIIIllIIIlIIIlIlll.toCharArray();
        int llllllllllllIllIIIllIIIlIIIlIlII = MpscLinkedQueueHeadRef.llIlllllIIlIIl[0];
        final int llllllllllllIllIIIllIIIlIIIIlllI = (Object)((String)llllllllllllIllIIIllIIIlIIIlIIll).toCharArray();
        final double llllllllllllIllIIIllIIIlIIIIllIl = llllllllllllIllIIIllIIIlIIIIlllI.length;
        float llllllllllllIllIIIllIIIlIIIIllII = MpscLinkedQueueHeadRef.llIlllllIIlIIl[0];
        while (lIIllIllIIIllIII((int)llllllllllllIllIIIllIIIlIIIIllII, (int)llllllllllllIllIIIllIIIlIIIIllIl)) {
            final char llllllllllllIllIIIllIIIlIIIllIIl = llllllllllllIllIIIllIIIlIIIIlllI[llllllllllllIllIIIllIIIlIIIIllII];
            llllllllllllIllIIIllIIIlIIIlIllI.append((char)(llllllllllllIllIIIllIIIlIIIllIIl ^ llllllllllllIllIIIllIIIlIIIlIlIl[llllllllllllIllIIIllIIIlIIIlIlII % llllllllllllIllIIIllIIIlIIIlIlIl.length]));
            "".length();
            ++llllllllllllIllIIIllIIIlIIIlIlII;
            ++llllllllllllIllIIIllIIIlIIIIllII;
            "".length();
            if ("   ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIllIIIlIIIlIllI);
    }
    
    private static void lIIllIllIIIlIllI() {
        (llIlllllIIlIIl = new int[3])[0] = (" ".length() & (" ".length() ^ -" ".length()));
        MpscLinkedQueueHeadRef.llIlllllIIlIIl[1] = " ".length();
        MpscLinkedQueueHeadRef.llIlllllIIlIIl[2] = "  ".length();
    }
    
    private static boolean lIIllIllIIIlIlll(final Object llllllllllllIllIIIllIIIlIIIIIlIl) {
        return llllllllllllIllIIIllIIIlIIIIIlIl == null;
    }
    
    protected final void lazySetHeadRef(final MpscLinkedQueueNode<E> llllllllllllIllIIIllIIIlIIllIlIl) {
        MpscLinkedQueueHeadRef.UPDATER.lazySet(this, llllllllllllIllIIIllIIIlIIllIlIl);
    }
    
    private static boolean lIIllIllIIIllIII(final int llllllllllllIllIIIllIIIlIIIIlIII, final int llllllllllllIllIIIllIIIlIIIIIlll) {
        return llllllllllllIllIIIllIIIlIIIIlIII < llllllllllllIllIIIllIIIlIIIIIlll;
    }
    
    private static String lIIllIlIllIIIlII(final String llllllllllllIllIIIllIIIlIIlIIllI, final String llllllllllllIllIIIllIIIlIIlIIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIllIIIlIIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllIIIlIIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIllIIIlIIlIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIllIIIlIIlIlIlI.init(MpscLinkedQueueHeadRef.llIlllllIIlIIl[2], llllllllllllIllIIIllIIIlIIlIlIll);
            return new String(llllllllllllIllIIIllIIIlIIlIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllIIIlIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIllIIIlIIlIlIIl) {
            llllllllllllIllIIIllIIIlIIlIlIIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIllIllIIIlIllI();
        lIIllIlIllIIIlll();
        AtomicReferenceFieldUpdater<MpscLinkedQueueHeadRef, MpscLinkedQueueNode> llllllllllllIllIIIllIIIlIIllIIIl = (AtomicReferenceFieldUpdater<MpscLinkedQueueHeadRef, MpscLinkedQueueNode>)PlatformDependent.newAtomicReferenceFieldUpdater(MpscLinkedQueueHeadRef.class, MpscLinkedQueueHeadRef.llIllllIllIIll[MpscLinkedQueueHeadRef.llIlllllIIlIIl[0]]);
        if (lIIllIllIIIlIlll(llllllllllllIllIIIllIIIlIIllIIIl)) {
            llllllllllllIllIIIllIIIlIIllIIIl = (AtomicReferenceFieldUpdater<MpscLinkedQueueHeadRef, MpscLinkedQueueNode>)AtomicReferenceFieldUpdater.newUpdater(MpscLinkedQueueHeadRef.class, MpscLinkedQueueNode.class, MpscLinkedQueueHeadRef.llIllllIllIIll[MpscLinkedQueueHeadRef.llIlllllIIlIIl[1]]);
        }
        UPDATER = llllllllllllIllIIIllIIIlIIllIIIl;
    }
    
    private static void lIIllIlIllIIIlll() {
        (llIllllIllIIll = new String[MpscLinkedQueueHeadRef.llIlllllIIlIIl[2]])[MpscLinkedQueueHeadRef.llIlllllIIlIIl[0]] = lIIllIlIllIIIlII("AEB6AVCPgeE=", "JnTuF");
        MpscLinkedQueueHeadRef.llIllllIllIIll[MpscLinkedQueueHeadRef.llIlllllIIlIIl[1]] = lIIllIlIllIIIllI("KwQlCgMmBw==", "CaDnQ");
    }
}
