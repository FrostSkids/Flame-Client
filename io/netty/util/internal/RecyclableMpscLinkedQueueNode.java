// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.Recycler;

public abstract class RecyclableMpscLinkedQueueNode<T> extends MpscLinkedQueueNode<T>
{
    private static final /* synthetic */ int[] lllIlllIllllII;
    private final /* synthetic */ Recycler.Handle handle;
    private static final /* synthetic */ String[] lllIlllIlllIIl;
    
    protected RecyclableMpscLinkedQueueNode(final Recycler.Handle llllllllllllIlIllIIIIIIllIllllIl) {
        if (lIlIIlIlllIlllIl(llllllllllllIlIllIIIIIIllIllllIl)) {
            throw new NullPointerException(RecyclableMpscLinkedQueueNode.lllIlllIlllIIl[RecyclableMpscLinkedQueueNode.lllIlllIllllII[0]]);
        }
        this.handle = llllllllllllIlIllIIIIIIllIllllIl;
    }
    
    private static boolean lIlIIlIlllIlllIl(final Object llllllllllllIlIllIIIIIIllIlIlIll) {
        return llllllllllllIlIllIIIIIIllIlIlIll == null;
    }
    
    static {
        lIlIIlIlllIlllII();
        lIlIIlIlllIllIll();
    }
    
    protected abstract void recycle(final Recycler.Handle p0);
    
    private static void lIlIIlIlllIllIll() {
        (lllIlllIlllIIl = new String[RecyclableMpscLinkedQueueNode.lllIlllIllllII[1]])[RecyclableMpscLinkedQueueNode.lllIlllIllllII[0]] = lIlIIlIlllIllIlI("N/UpyJbgTOs=", "rUnzZ");
    }
    
    private static String lIlIIlIlllIllIlI(final String llllllllllllIlIllIIIIIIllIllIIII, final String llllllllllllIlIllIIIIIIllIlIllll) {
        try {
            final SecretKeySpec llllllllllllIlIllIIIIIIllIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIIIIllIlIllll.getBytes(StandardCharsets.UTF_8)), RecyclableMpscLinkedQueueNode.lllIlllIllllII[2]), "DES");
            final Cipher llllllllllllIlIllIIIIIIllIllIlII = Cipher.getInstance("DES");
            llllllllllllIlIllIIIIIIllIllIlII.init(RecyclableMpscLinkedQueueNode.lllIlllIllllII[3], llllllllllllIlIllIIIIIIllIllIlIl);
            return new String(llllllllllllIlIllIIIIIIllIllIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIIIIllIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIIIIIllIllIIll) {
            llllllllllllIlIllIIIIIIllIllIIll.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIIlIlllIlllII() {
        (lllIlllIllllII = new int[4])[0] = ((0xFF ^ 0xBC) & ~(0x3B ^ 0x78));
        RecyclableMpscLinkedQueueNode.lllIlllIllllII[1] = " ".length();
        RecyclableMpscLinkedQueueNode.lllIlllIllllII[2] = (0xD6 ^ 0x87 ^ (0x78 ^ 0x21));
        RecyclableMpscLinkedQueueNode.lllIlllIllllII[3] = "  ".length();
    }
    
    @Override
    final void unlink() {
        super.unlink();
        this.recycle(this.handle);
    }
}
