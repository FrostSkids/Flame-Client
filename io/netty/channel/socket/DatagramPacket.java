// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.socket;

import io.netty.util.ReferenceCounted;
import io.netty.channel.AddressedEnvelope;
import io.netty.buffer.ByteBufHolder;
import java.net.InetSocketAddress;
import io.netty.buffer.ByteBuf;
import io.netty.channel.DefaultAddressedEnvelope;

public final class DatagramPacket extends DefaultAddressedEnvelope<ByteBuf, InetSocketAddress> implements ByteBufHolder
{
    public DatagramPacket(final ByteBuf llllllllllllIllIIlIIlllllIIlIIIl, final InetSocketAddress llllllllllllIllIIlIIlllllIIlIIII, final InetSocketAddress llllllllllllIllIIlIIlllllIIlIIll) {
        super(llllllllllllIllIIlIIlllllIIlIIIl, llllllllllllIllIIlIIlllllIIlIIII, llllllllllllIllIIlIIlllllIIlIIll);
    }
    
    @Override
    public DatagramPacket retain() {
        super.retain();
        "".length();
        return this;
    }
    
    @Override
    public DatagramPacket duplicate() {
        return new DatagramPacket(((DefaultAddressedEnvelope<ByteBuf, A>)this).content().duplicate(), ((DefaultAddressedEnvelope<M, InetSocketAddress>)this).recipient(), ((DefaultAddressedEnvelope<M, InetSocketAddress>)this).sender());
    }
    
    public DatagramPacket(final ByteBuf llllllllllllIllIIlIIlllllIIlllII, final InetSocketAddress llllllllllllIllIIlIIlllllIIllIll) {
        super(llllllllllllIllIIlIIlllllIIlllII, llllllllllllIllIIlIIlllllIIllIll);
    }
    
    @Override
    public DatagramPacket copy() {
        return new DatagramPacket(((DefaultAddressedEnvelope<ByteBuf, A>)this).content().copy(), ((DefaultAddressedEnvelope<M, InetSocketAddress>)this).recipient(), ((DefaultAddressedEnvelope<M, InetSocketAddress>)this).sender());
    }
    
    @Override
    public DatagramPacket retain(final int llllllllllllIllIIlIIlllllIIIIIlI) {
        super.retain(llllllllllllIllIIlIIlllllIIIIIlI);
        "".length();
        return this;
    }
}
