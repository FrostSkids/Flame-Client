// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network;

import javax.crypto.ShortBufferException;
import javax.crypto.Cipher;
import io.netty.channel.ChannelHandlerContext;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.MessageToByteEncoder;

public class NettyEncryptingEncoder extends MessageToByteEncoder<ByteBuf>
{
    private final /* synthetic */ NettyEncryptionTranslator encryptionCodec;
    
    public NettyEncryptingEncoder(final Cipher lllllllllllllIIIIllIlIIlIlllIllI) {
        this.encryptionCodec = new NettyEncryptionTranslator(lllllllllllllIIIIllIlIIlIlllIllI);
    }
    
    @Override
    protected void encode(final ChannelHandlerContext lllllllllllllIIIIllIlIIlIlllIIIl, final ByteBuf lllllllllllllIIIIllIlIIlIllIllIl, final ByteBuf lllllllllllllIIIIllIlIIlIllIllll) throws Exception, ShortBufferException {
        this.encryptionCodec.cipher(lllllllllllllIIIIllIlIIlIllIllIl, lllllllllllllIIIIllIlIIlIllIllll);
    }
}
