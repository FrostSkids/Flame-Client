// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.multipart;

import java.io.IOException;

public interface Attribute extends HttpData
{
    Attribute duplicate();
    
    Attribute copy();
    
    void setValue(final String p0) throws IOException;
    
    Attribute retain(final int p0);
    
    String getValue() throws IOException;
    
    Attribute retain();
}
