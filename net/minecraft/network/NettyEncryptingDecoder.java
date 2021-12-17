// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network;

import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.MessageToMessageDecoder;

public class NettyEncryptingDecoder extends MessageToMessageDecoder<ByteBuf>
{
    private final /* synthetic */ NettyEncryptionTranslator decryptionCodec;
    
    @Override
    protected void decode(final ChannelHandlerContext llllllllllllIllIIIllIlllIIIlIIII, final ByteBuf llllllllllllIllIIIllIlllIIIIllll, final List<Object> llllllllllllIllIIIllIlllIIIIlllI) throws Exception, ShortBufferException {
        llllllllllllIllIIIllIlllIIIIlllI.add(this.decryptionCodec.decipher(llllllllllllIllIIIllIlllIIIlIIII, llllllllllllIllIIIllIlllIIIIllll));
        "".length();
    }
    
    public NettyEncryptingDecoder(final Cipher llllllllllllIllIIIllIlllIIIllIII) {
        this.decryptionCodec = new NettyEncryptionTranslator(llllllllllllIllIIIllIlllIIIllIII);
    }
}
