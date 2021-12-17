// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import io.netty.buffer.ByteBuf;

public interface SpdyFrameDecoderDelegate
{
    void readWindowUpdateFrame(final int p0, final int p1);
    
    void readHeaderBlock(final ByteBuf p0);
    
    void readPingFrame(final int p0);
    
    void readSettingsEnd();
    
    void readSetting(final int p0, final int p1, final boolean p2, final boolean p3);
    
    void readHeadersFrame(final int p0, final boolean p1);
    
    void readGoAwayFrame(final int p0, final int p1);
    
    void readSynReplyFrame(final int p0, final boolean p1);
    
    void readDataFrame(final int p0, final boolean p1, final ByteBuf p2);
    
    void readSettingsFrame(final boolean p0);
    
    void readFrameError(final String p0);
    
    void readSynStreamFrame(final int p0, final int p1, final byte p2, final boolean p3, final boolean p4);
    
    void readHeaderBlockEnd();
    
    void readRstStreamFrame(final int p0, final int p1);
}
