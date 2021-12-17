// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

public interface ByteBufAllocator
{
    CompositeByteBuf compositeBuffer();
    
    ByteBuf buffer();
    
    CompositeByteBuf compositeBuffer(final int p0);
    
    ByteBuf ioBuffer();
    
    ByteBuf buffer(final int p0);
    
    ByteBuf heapBuffer(final int p0);
    
    boolean isDirectBufferPooled();
    
    ByteBuf directBuffer();
    
    CompositeByteBuf compositeDirectBuffer(final int p0);
    
    CompositeByteBuf compositeDirectBuffer();
    
    ByteBuf heapBuffer(final int p0, final int p1);
    
    ByteBuf directBuffer(final int p0);
    
    CompositeByteBuf compositeHeapBuffer(final int p0);
    
    ByteBuf buffer(final int p0, final int p1);
    
    CompositeByteBuf compositeHeapBuffer();
    
    ByteBuf directBuffer(final int p0, final int p1);
    
    ByteBuf heapBuffer();
    
    ByteBuf ioBuffer(final int p0);
    
    ByteBuf ioBuffer(final int p0, final int p1);
}
