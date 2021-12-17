// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import io.netty.util.ReferenceCounted;
import io.netty.util.internal.StringUtil;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.util.IllegalReferenceCountException;

public class DefaultByteBufHolder implements ByteBufHolder
{
    private static final /* synthetic */ String[] lIIlIIIIIIllIl;
    private final /* synthetic */ ByteBuf data;
    private static final /* synthetic */ int[] lIIlIIIIIIlllI;
    
    @Override
    public ByteBufHolder retain() {
        this.data.retain();
        "".length();
        return this;
    }
    
    @Override
    public boolean release(final int lllllllllllllIIlllIllllIIllIllll) {
        return this.data.release(lllllllllllllIIlllIllllIIllIllll);
    }
    
    @Override
    public ByteBuf content() {
        if (llIIlIIlIIIlIII(this.data.refCnt())) {
            throw new IllegalReferenceCountException(this.data.refCnt());
        }
        return this.data;
    }
    
    private static void llIIlIIlIIIIllI() {
        (lIIlIIIIIIlllI = new int[4])[0] = ((0x11 ^ 0x1C) & ~(0xB3 ^ 0xBE));
        DefaultByteBufHolder.lIIlIIIIIIlllI[1] = (0xA ^ 0x3C ^ (0x9E ^ 0x80));
        DefaultByteBufHolder.lIIlIIIIIIlllI[2] = (0x13 ^ 0x3A);
        DefaultByteBufHolder.lIIlIIIIIIlllI[3] = " ".length();
    }
    
    private static void llIIlIIlIIIIlIl() {
        (lIIlIIIIIIllIl = new String[DefaultByteBufHolder.lIIlIIIIIIlllI[3]])[DefaultByteBufHolder.lIIlIIIIIIlllI[0]] = llIIlIIlIIIIlII("IA4TAA==", "Dogav");
    }
    
    @Override
    public ByteBufHolder copy() {
        return new DefaultByteBufHolder(this.data.copy());
    }
    
    @Override
    public boolean release() {
        return this.data.release();
    }
    
    private static String llIIlIIlIIIIlII(String lllllllllllllIIlllIllllIIlIlIIll, final String lllllllllllllIIlllIllllIIlIlIIlI) {
        lllllllllllllIIlllIllllIIlIlIIll = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlllIllllIIlIlIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllIllllIIlIlIllI = new StringBuilder();
        final char[] lllllllllllllIIlllIllllIIlIlIlIl = lllllllllllllIIlllIllllIIlIlIIlI.toCharArray();
        int lllllllllllllIIlllIllllIIlIlIlII = DefaultByteBufHolder.lIIlIIIIIIlllI[0];
        final boolean lllllllllllllIIlllIllllIIlIIlllI = (Object)((String)lllllllllllllIIlllIllllIIlIlIIll).toCharArray();
        final boolean lllllllllllllIIlllIllllIIlIIllIl = lllllllllllllIIlllIllllIIlIIlllI.length != 0;
        short lllllllllllllIIlllIllllIIlIIllII = (short)DefaultByteBufHolder.lIIlIIIIIIlllI[0];
        while (llIIlIIlIIIlIIl(lllllllllllllIIlllIllllIIlIIllII, lllllllllllllIIlllIllllIIlIIllIl ? 1 : 0)) {
            final char lllllllllllllIIlllIllllIIlIllIIl = lllllllllllllIIlllIllllIIlIIlllI[lllllllllllllIIlllIllllIIlIIllII];
            lllllllllllllIIlllIllllIIlIlIllI.append((char)(lllllllllllllIIlllIllllIIlIllIIl ^ lllllllllllllIIlllIllllIIlIlIlIl[lllllllllllllIIlllIllllIIlIlIlII % lllllllllllllIIlllIllllIIlIlIlIl.length]));
            "".length();
            ++lllllllllllllIIlllIllllIIlIlIlII;
            ++lllllllllllllIIlllIllllIIlIIllII;
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllIllllIIlIlIllI);
    }
    
    private static boolean llIIlIIlIIIlIII(final int lllllllllllllIIlllIllllIIlIIIIll) {
        return lllllllllllllIIlllIllllIIlIIIIll <= 0;
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(StringUtil.simpleClassName(this)).append((char)DefaultByteBufHolder.lIIlIIIIIIlllI[1]).append(this.content().toString()).append((char)DefaultByteBufHolder.lIIlIIIIIIlllI[2]));
    }
    
    private static boolean llIIlIIlIIIlIIl(final int lllllllllllllIIlllIllllIIlIIlIII, final int lllllllllllllIIlllIllllIIlIIIlll) {
        return lllllllllllllIIlllIllllIIlIIlIII < lllllllllllllIIlllIllllIIlIIIlll;
    }
    
    static {
        llIIlIIlIIIIllI();
        llIIlIIlIIIIlIl();
    }
    
    @Override
    public ByteBufHolder duplicate() {
        return new DefaultByteBufHolder(this.data.duplicate());
    }
    
    private static boolean llIIlIIlIIIIlll(final Object lllllllllllllIIlllIllllIIlIIIlIl) {
        return lllllllllllllIIlllIllllIIlIIIlIl == null;
    }
    
    public DefaultByteBufHolder(final ByteBuf lllllllllllllIIlllIllllIlIIIllIl) {
        if (llIIlIIlIIIIlll(lllllllllllllIIlllIllllIlIIIllIl)) {
            throw new NullPointerException(DefaultByteBufHolder.lIIlIIIIIIllIl[DefaultByteBufHolder.lIIlIIIIIIlllI[0]]);
        }
        this.data = lllllllllllllIIlllIllllIlIIIllIl;
    }
    
    @Override
    public int refCnt() {
        return this.data.refCnt();
    }
    
    @Override
    public ByteBufHolder retain(final int lllllllllllllIIlllIllllIIllllIII) {
        this.data.retain(lllllllllllllIIlllIllllIIllllIII);
        "".length();
        return this;
    }
}
