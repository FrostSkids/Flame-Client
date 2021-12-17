// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.multipart;

public interface FileUpload extends HttpData
{
    FileUpload retain(final int p0);
    
    void setContentTransferEncoding(final String p0);
    
    FileUpload copy();
    
    void setContentType(final String p0);
    
    String getFilename();
    
    String getContentType();
    
    void setFilename(final String p0);
    
    FileUpload retain();
    
    FileUpload duplicate();
    
    String getContentTransferEncoding();
}
