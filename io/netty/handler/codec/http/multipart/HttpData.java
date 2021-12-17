// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.multipart;

import java.nio.charset.Charset;
import io.netty.buffer.ByteBuf;
import java.io.InputStream;
import java.io.IOException;
import java.io.File;
import io.netty.buffer.ByteBufHolder;

public interface HttpData extends InterfaceHttpData, ByteBufHolder
{
    void setContent(final File p0) throws IOException;
    
    HttpData retain(final int p0);
    
    byte[] get() throws IOException;
    
    boolean isCompleted();
    
    HttpData copy();
    
    String getString() throws IOException;
    
    void setContent(final InputStream p0) throws IOException;
    
    HttpData retain();
    
    long length();
    
    void addContent(final ByteBuf p0, final boolean p1) throws IOException;
    
    Charset getCharset();
    
    ByteBuf getByteBuf() throws IOException;
    
    void delete();
    
    HttpData duplicate();
    
    boolean renameTo(final File p0) throws IOException;
    
    File getFile() throws IOException;
    
    ByteBuf getChunk(final int p0) throws IOException;
    
    void setCharset(final Charset p0);
    
    boolean isInMemory();
    
    String getString(final Charset p0) throws IOException;
    
    void setContent(final ByteBuf p0) throws IOException;
}
