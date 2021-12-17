// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import io.netty.util.ReferenceCounted;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.nio.ByteOrder;

final class UnreleasableByteBuf extends WrappedByteBuf
{
    private static final /* synthetic */ int[] lIIllIlllllIlI;
    private static final /* synthetic */ String[] lIIllIlllllIII;
    private /* synthetic */ SwappedByteBuf swappedBuf;
    
    private static boolean llIllIlIIllIlll(final int lllllllllllllIIlIlIIlIIIlIlllIIl, final int lllllllllllllIIlIlIIlIIIlIlllIII) {
        return lllllllllllllIIlIlIIlIIIlIlllIIl < lllllllllllllIIlIlIIlIIIlIlllIII;
    }
    
    @Override
    public ByteBuf slice(final int lllllllllllllIIlIlIIlIIIlllIlIll, final int lllllllllllllIIlIlIIlIIIlllIlIlI) {
        return new UnreleasableByteBuf(this.buf.slice(lllllllllllllIIlIlIIlIIIlllIlIll, lllllllllllllIIlIlIIlIIIlllIlIlI));
    }
    
    @Override
    public ByteBuf order(final ByteOrder lllllllllllllIIlIlIIlIIlIIIIIIII) {
        if (llIllIlIIllIlIl(lllllllllllllIIlIlIIlIIlIIIIIIII)) {
            throw new NullPointerException(UnreleasableByteBuf.lIIllIlllllIII[UnreleasableByteBuf.lIIllIlllllIlI[0]]);
        }
        if (llIllIlIIllIllI(lllllllllllllIIlIlIIlIIlIIIIIIII, this.order())) {
            return this;
        }
        SwappedByteBuf lllllllllllllIIlIlIIlIIIllllllll = this.swappedBuf;
        if (llIllIlIIllIlIl(lllllllllllllIIlIlIIlIIIllllllll)) {
            lllllllllllllIIlIlIIlIIIllllllll = (this.swappedBuf = new SwappedByteBuf(this));
        }
        return lllllllllllllIIlIlIIlIIIllllllll;
    }
    
    @Override
    public ByteBuf slice() {
        return new UnreleasableByteBuf(this.buf.slice());
    }
    
    private static void llIllIlIIllIlII() {
        (lIIllIlllllIlI = new int[2])[0] = ((0xF ^ 0x42) & ~(0x0 ^ 0x4D));
        UnreleasableByteBuf.lIIllIlllllIlI[1] = " ".length();
    }
    
    private static String llIllIlIIlIlllI(String lllllllllllllIIlIlIIlIIIllIIIlII, final String lllllllllllllIIlIlIIlIIIllIIlIII) {
        lllllllllllllIIlIlIIlIIIllIIIlII = new String(Base64.getDecoder().decode(lllllllllllllIIlIlIIlIIIllIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIlIIlIIIllIIIlll = new StringBuilder();
        final char[] lllllllllllllIIlIlIIlIIIllIIIllI = lllllllllllllIIlIlIIlIIIllIIlIII.toCharArray();
        int lllllllllllllIIlIlIIlIIIllIIIlIl = UnreleasableByteBuf.lIIllIlllllIlI[0];
        final short lllllllllllllIIlIlIIlIIIlIllllll = (Object)lllllllllllllIIlIlIIlIIIllIIIlII.toCharArray();
        final boolean lllllllllllllIIlIlIIlIIIlIlllllI = lllllllllllllIIlIlIIlIIIlIllllll.length != 0;
        int lllllllllllllIIlIlIIlIIIlIllllIl = UnreleasableByteBuf.lIIllIlllllIlI[0];
        while (llIllIlIIllIlll(lllllllllllllIIlIlIIlIIIlIllllIl, lllllllllllllIIlIlIIlIIIlIlllllI ? 1 : 0)) {
            final char lllllllllllllIIlIlIIlIIIllIIlIlI = lllllllllllllIIlIlIIlIIIlIllllll[lllllllllllllIIlIlIIlIIIlIllllIl];
            lllllllllllllIIlIlIIlIIIllIIIlll.append((char)(lllllllllllllIIlIlIIlIIIllIIlIlI ^ lllllllllllllIIlIlIIlIIIllIIIllI[lllllllllllllIIlIlIIlIIIllIIIlIl % lllllllllllllIIlIlIIlIIIllIIIllI.length]));
            "".length();
            ++lllllllllllllIIlIlIIlIIIllIIIlIl;
            ++lllllllllllllIIlIlIIlIIIlIllllIl;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIlIIlIIIllIIIlll);
    }
    
    private static boolean llIllIlIIllIlIl(final Object lllllllllllllIIlIlIIlIIIlIllIIlI) {
        return lllllllllllllIIlIlIIlIIIlIllIIlI == null;
    }
    
    private static void llIllIlIIlIllll() {
        (lIIllIlllllIII = new String[UnreleasableByteBuf.lIIllIlllllIlI[1]])[UnreleasableByteBuf.lIIllIlllllIlI[0]] = llIllIlIIlIlllI("DRwtLiMGHCw0MQ==", "hrIGB");
    }
    
    @Override
    public ByteBuf duplicate() {
        return new UnreleasableByteBuf(this.buf.duplicate());
    }
    
    UnreleasableByteBuf(final ByteBuf lllllllllllllIIlIlIIlIIlIIIIIlIl) {
        super(lllllllllllllIIlIlIIlIIlIIIIIlIl);
    }
    
    @Override
    public ByteBuf readSlice(final int lllllllllllllIIlIlIIlIIIlllllIII) {
        return new UnreleasableByteBuf(this.buf.readSlice(lllllllllllllIIlIlIIlIIIlllllIII));
    }
    
    @Override
    public boolean release(final int lllllllllllllIIlIlIIlIIIllIlllIl) {
        return UnreleasableByteBuf.lIIllIlllllIlI[0] != 0;
    }
    
    private static boolean llIllIlIIllIllI(final Object lllllllllllllIIlIlIIlIIIlIllIlIl, final Object lllllllllllllIIlIlIIlIIIlIllIlII) {
        return lllllllllllllIIlIlIIlIIIlIllIlIl == lllllllllllllIIlIlIIlIIIlIllIlII;
    }
    
    static {
        llIllIlIIllIlII();
        llIllIlIIlIllll();
    }
    
    @Override
    public ByteBuf retain() {
        return this;
    }
    
    @Override
    public boolean release() {
        return UnreleasableByteBuf.lIIllIlllllIlI[0] != 0;
    }
    
    @Override
    public ByteBuf retain(final int lllllllllllllIIlIlIIlIIIlllIIlII) {
        return this;
    }
}
