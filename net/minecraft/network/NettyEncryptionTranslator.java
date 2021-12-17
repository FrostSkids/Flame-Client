// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network;

import io.netty.channel.ChannelHandlerContext;
import javax.crypto.ShortBufferException;
import io.netty.buffer.ByteBuf;
import javax.crypto.Cipher;

public class NettyEncryptionTranslator
{
    private final /* synthetic */ Cipher cipher;
    private static final /* synthetic */ int[] lIllIlllIlIIll;
    private /* synthetic */ byte[] field_150505_b;
    private /* synthetic */ byte[] field_150506_c;
    
    protected void cipher(final ByteBuf llllllllllllIllllllIIlllIllllllI, final ByteBuf llllllllllllIllllllIIlllIlllllIl) throws ShortBufferException {
        final int llllllllllllIllllllIIllllIIIIIlI = llllllllllllIllllllIIlllIllllllI.readableBytes();
        final byte[] llllllllllllIllllllIIllllIIIIIIl = this.func_150502_a(llllllllllllIllllllIIlllIllllllI);
        final int llllllllllllIllllllIIllllIIIIIII = this.cipher.getOutputSize(llllllllllllIllllllIIllllIIIIIlI);
        if (lIIIIIIIIIllIIlI(this.field_150506_c.length, llllllllllllIllllllIIllllIIIIIII)) {
            this.field_150506_c = new byte[llllllllllllIllllllIIllllIIIIIII];
        }
        llllllllllllIllllllIIlllIlllllIl.writeBytes(this.field_150506_c, NettyEncryptionTranslator.lIllIlllIlIIll[0], this.cipher.update(llllllllllllIllllllIIllllIIIIIIl, NettyEncryptionTranslator.lIllIlllIlIIll[0], llllllllllllIllllllIIllllIIIIIlI, this.field_150506_c));
        "".length();
    }
    
    protected NettyEncryptionTranslator(final Cipher llllllllllllIllllllIIllllIlIlIIl) {
        this.field_150505_b = new byte[NettyEncryptionTranslator.lIllIlllIlIIll[0]];
        this.field_150506_c = new byte[NettyEncryptionTranslator.lIllIlllIlIIll[0]];
        this.cipher = llllllllllllIllllllIIllllIlIlIIl;
    }
    
    static {
        lIIIIIIIIIllIIIl();
    }
    
    private static void lIIIIIIIIIllIIIl() {
        (lIllIlllIlIIll = new int[1])[0] = ((0x5B ^ 0x62 ^ (0x50 ^ 0x40)) & (0x75 ^ 0x36 ^ (0x49 ^ 0x23) ^ -" ".length()));
    }
    
    private byte[] func_150502_a(final ByteBuf llllllllllllIllllllIIllllIIlllll) {
        final int llllllllllllIllllllIIllllIlIIIIl = llllllllllllIllllllIIllllIIlllll.readableBytes();
        if (lIIIIIIIIIllIIlI(this.field_150505_b.length, llllllllllllIllllllIIllllIlIIIIl)) {
            this.field_150505_b = new byte[llllllllllllIllllllIIllllIlIIIIl];
        }
        llllllllllllIllllllIIllllIIlllll.readBytes(this.field_150505_b, NettyEncryptionTranslator.lIllIlllIlIIll[0], llllllllllllIllllllIIllllIlIIIIl);
        "".length();
        return this.field_150505_b;
    }
    
    protected ByteBuf decipher(final ChannelHandlerContext llllllllllllIllllllIIllllIIlIllI, final ByteBuf llllllllllllIllllllIIllllIIIllll) throws ShortBufferException {
        final int llllllllllllIllllllIIllllIIlIlII = llllllllllllIllllllIIllllIIIllll.readableBytes();
        final byte[] llllllllllllIllllllIIllllIIlIIll = this.func_150502_a(llllllllllllIllllllIIllllIIIllll);
        final ByteBuf llllllllllllIllllllIIllllIIlIIlI = llllllllllllIllllllIIllllIIlIllI.alloc().heapBuffer(this.cipher.getOutputSize(llllllllllllIllllllIIllllIIlIlII));
        llllllllllllIllllllIIllllIIlIIlI.writerIndex(this.cipher.update(llllllllllllIllllllIIllllIIlIIll, NettyEncryptionTranslator.lIllIlllIlIIll[0], llllllllllllIllllllIIllllIIlIlII, llllllllllllIllllllIIllllIIlIIlI.array(), llllllllllllIllllllIIllllIIlIIlI.arrayOffset()));
        "".length();
        return llllllllllllIllllllIIllllIIlIIlI;
    }
    
    private static boolean lIIIIIIIIIllIIlI(final int llllllllllllIllllllIIlllIlllIlll, final int llllllllllllIllllllIIlllIlllIllI) {
        return llllllllllllIllllllIIlllIlllIlll < llllllllllllIllllllIIlllIlllIllI;
    }
}
