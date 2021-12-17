// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import io.netty.util.CharsetUtil;
import io.netty.buffer.ByteBuf;

final class HttpHeaderEntity implements CharSequence
{
    private final /* synthetic */ byte[] bytes;
    private final /* synthetic */ int hash;
    private final /* synthetic */ String name;
    private final /* synthetic */ int separatorLen;
    private static final /* synthetic */ int[] lIIlIIIllIIIll;
    
    private static boolean llIIlIllIlIIIlI(final int lllllllllllllIIlllIIlIIlllIlIlIl, final int lllllllllllllIIlllIIlIIlllIlIlII) {
        return lllllllllllllIIlllIIlIIlllIlIlIl <= lllllllllllllIIlllIIlIIlllIlIlII;
    }
    
    boolean encode(final ByteBuf lllllllllllllIIlllIIlIIlllIllIII) {
        lllllllllllllIIlllIIlIIlllIllIII.writeBytes(this.bytes);
        "".length();
        int n;
        if (llIIlIllIlIIIll(this.separatorLen)) {
            n = HttpHeaderEntity.lIIlIIIllIIIll[1];
            "".length();
            if (null != null) {
                return ((0xA9 ^ 0xBC ^ (0x50 ^ 0x24)) & (0x1B ^ 0x5F ^ (0x21 ^ 0x4) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = HttpHeaderEntity.lIIlIIIllIIIll[0];
        }
        return n != 0;
    }
    
    @Override
    public CharSequence subSequence(final int lllllllllllllIIlllIIlIIllllIIIlI, final int lllllllllllllIIlllIIlIIllllIIIIl) {
        return new HttpHeaderEntity(this.name.substring(lllllllllllllIIlllIIlIIllllIIIlI, lllllllllllllIIlllIIlIIllllIIIIl));
    }
    
    int hash() {
        return this.hash;
    }
    
    private static void llIIlIllIlIIIII() {
        (lIIlIIIllIIIll = new int[2])[0] = ((0xE5 ^ 0xA8) & ~(0x62 ^ 0x2F));
        HttpHeaderEntity.lIIlIIIllIIIll[1] = " ".length();
    }
    
    @Override
    public char charAt(final int lllllllllllllIIlllIIlIIllllIllII) {
        if (llIIlIllIlIIIlI(this.bytes.length - this.separatorLen, lllllllllllllIIlllIIlIIllllIllII)) {
            throw new IndexOutOfBoundsException();
        }
        return (char)this.bytes[lllllllllllllIIlllIIlIIllllIllII];
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
    @Override
    public int length() {
        return this.bytes.length - this.separatorLen;
    }
    
    public HttpHeaderEntity(final String lllllllllllllIIlllIIlIIlllllllII, final byte[] lllllllllllllIIlllIIlIIlllllIlll) {
        this.name = lllllllllllllIIlllIIlIIlllllllII;
        this.hash = HttpHeaders.hash(lllllllllllllIIlllIIlIIlllllllII);
        final byte[] lllllllllllllIIlllIIlIIllllllIlI = lllllllllllllIIlllIIlIIlllllllII.getBytes(CharsetUtil.US_ASCII);
        if (llIIlIllIlIIIIl(lllllllllllllIIlllIIlIIlllllIlll)) {
            this.bytes = lllllllllllllIIlllIIlIIllllllIlI;
            this.separatorLen = HttpHeaderEntity.lIIlIIIllIIIll[0];
            "".length();
            if (null != null) {
                throw null;
            }
        }
        else {
            this.separatorLen = lllllllllllllIIlllIIlIIlllllIlll.length;
            this.bytes = new byte[lllllllllllllIIlllIIlIIllllllIlI.length + lllllllllllllIIlllIIlIIlllllIlll.length];
            System.arraycopy(lllllllllllllIIlllIIlIIllllllIlI, HttpHeaderEntity.lIIlIIIllIIIll[0], this.bytes, HttpHeaderEntity.lIIlIIIllIIIll[0], lllllllllllllIIlllIIlIIllllllIlI.length);
            System.arraycopy(lllllllllllllIIlllIIlIIlllllIlll, HttpHeaderEntity.lIIlIIIllIIIll[0], this.bytes, lllllllllllllIIlllIIlIIllllllIlI.length, lllllllllllllIIlllIIlIIlllllIlll.length);
        }
    }
    
    public HttpHeaderEntity(final String lllllllllllllIIlllIIlIlIIIIIIIlI) {
        this(lllllllllllllIIlllIIlIlIIIIIIIlI, null);
    }
    
    private static boolean llIIlIllIlIIIll(final int lllllllllllllIIlllIIlIIlllIlIIII) {
        return lllllllllllllIIlllIIlIIlllIlIIII > 0;
    }
    
    static {
        llIIlIllIlIIIII();
    }
    
    private static boolean llIIlIllIlIIIIl(final Object lllllllllllllIIlllIIlIIlllIlIIlI) {
        return lllllllllllllIIlllIIlIIlllIlIIlI == null;
    }
}
