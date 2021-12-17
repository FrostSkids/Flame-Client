// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import java.util.Set;

public interface Cookie extends Comparable<Cookie>
{
    int getVersion();
    
    void setPath(final String p0);
    
    String getValue();
    
    Set<Integer> getPorts();
    
    String getCommentUrl();
    
    void setPorts(final Iterable<Integer> p0);
    
    void setComment(final String p0);
    
    void setSecure(final boolean p0);
    
    void setHttpOnly(final boolean p0);
    
    void setValue(final String p0);
    
    boolean isSecure();
    
    String getComment();
    
    String getPath();
    
    void setMaxAge(final long p0);
    
    void setDiscard(final boolean p0);
    
    boolean isHttpOnly();
    
    boolean isDiscard();
    
    void setCommentUrl(final String p0);
    
    long getMaxAge();
    
    String getDomain();
    
    void setDomain(final String p0);
    
    String getName();
    
    void setVersion(final int p0);
    
    void setPorts(final int... p0);
}
