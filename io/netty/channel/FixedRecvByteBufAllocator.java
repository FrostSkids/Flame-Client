// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class FixedRecvByteBufAllocator implements RecvByteBufAllocator
{
    private final /* synthetic */ Handle handle;
    private static final /* synthetic */ int[] lIIIIIIIIIllII;
    private static final /* synthetic */ String[] lIIIIIIIIIlIIl;
    
    @Override
    public Handle newHandle() {
        return this.handle;
    }
    
    private static void lIllIIlIlIIlllI() {
        (lIIIIIIIIIlIIl = new String[FixedRecvByteBufAllocator.lIIIIIIIIIllII[1]])[FixedRecvByteBufAllocator.lIIIIIIIIIllII[0]] = lIllIIlIlIIllIl("By0wCz0XCz8XPUU1Ix4sRT8kCDkRPSRNLA05OE1oX3g=", "eXVmX");
    }
    
    private static boolean lIllIIlIlIlIIlI(final int lllllllllllllIlIlIIlIIllIllIIIII, final int lllllllllllllIlIlIIlIIllIlIlllll) {
        return lllllllllllllIlIlIIlIIllIllIIIII < lllllllllllllIlIlIIlIIllIlIlllll;
    }
    
    private static boolean lIllIIlIlIlIIIl(final int lllllllllllllIlIlIIlIIllIlIlllIl) {
        return lllllllllllllIlIlIIlIIllIlIlllIl <= 0;
    }
    
    static {
        lIllIIlIlIlIIII();
        lIllIIlIlIIlllI();
    }
    
    private static void lIllIIlIlIlIIII() {
        (lIIIIIIIIIllII = new int[2])[0] = ((0x8F ^ 0xA9) & ~(0xB3 ^ 0x95));
        FixedRecvByteBufAllocator.lIIIIIIIIIllII[1] = " ".length();
    }
    
    private static String lIllIIlIlIIllIl(String lllllllllllllIlIlIIlIIllIllIlIll, final String lllllllllllllIlIlIIlIIllIllIllll) {
        lllllllllllllIlIlIIlIIllIllIlIll = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIIlIIllIllIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIIlIIllIllIlllI = new StringBuilder();
        final char[] lllllllllllllIlIlIIlIIllIllIllIl = lllllllllllllIlIlIIlIIllIllIllll.toCharArray();
        int lllllllllllllIlIlIIlIIllIllIllII = FixedRecvByteBufAllocator.lIIIIIIIIIllII[0];
        final long lllllllllllllIlIlIIlIIllIllIIllI = (Object)((String)lllllllllllllIlIlIIlIIllIllIlIll).toCharArray();
        final byte lllllllllllllIlIlIIlIIllIllIIlIl = (byte)lllllllllllllIlIlIIlIIllIllIIllI.length;
        Exception lllllllllllllIlIlIIlIIllIllIIlII = (Exception)FixedRecvByteBufAllocator.lIIIIIIIIIllII[0];
        while (lIllIIlIlIlIIlI((int)lllllllllllllIlIlIIlIIllIllIIlII, lllllllllllllIlIlIIlIIllIllIIlIl)) {
            final char lllllllllllllIlIlIIlIIllIlllIIIl = lllllllllllllIlIlIIlIIllIllIIllI[lllllllllllllIlIlIIlIIllIllIIlII];
            lllllllllllllIlIlIIlIIllIllIlllI.append((char)(lllllllllllllIlIlIIlIIllIlllIIIl ^ lllllllllllllIlIlIIlIIllIllIllIl[lllllllllllllIlIlIIlIIllIllIllII % lllllllllllllIlIlIIlIIllIllIllIl.length]));
            "".length();
            ++lllllllllllllIlIlIIlIIllIllIllII;
            ++lllllllllllllIlIlIIlIIllIllIIlII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIIlIIllIllIlllI);
    }
    
    public FixedRecvByteBufAllocator(final int lllllllllllllIlIlIIlIIlllIIIIIII) {
        if (lIllIIlIlIlIIIl(lllllllllllllIlIlIIlIIlllIIIIIII)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(FixedRecvByteBufAllocator.lIIIIIIIIIlIIl[FixedRecvByteBufAllocator.lIIIIIIIIIllII[0]]).append(lllllllllllllIlIlIIlIIlllIIIIIII)));
        }
        this.handle = new HandleImpl(lllllllllllllIlIlIIlIIlllIIIIIII);
    }
    
    private static final class HandleImpl implements Handle
    {
        private final /* synthetic */ int bufferSize;
        
        @Override
        public ByteBuf allocate(final ByteBufAllocator lllllllllllllIlIIIIIIIlllllllIII) {
            return lllllllllllllIlIIIIIIIlllllllIII.ioBuffer(this.bufferSize);
        }
        
        @Override
        public void record(final int lllllllllllllIlIIIIIIIllllllIIIl) {
        }
        
        HandleImpl(final int lllllllllllllIlIIIIIIIllllllllII) {
            this.bufferSize = lllllllllllllIlIIIIIIIllllllllII;
        }
        
        @Override
        public int guess() {
            return this.bufferSize;
        }
    }
}
