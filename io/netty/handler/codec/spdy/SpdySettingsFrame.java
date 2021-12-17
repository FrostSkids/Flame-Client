// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import java.util.Set;

public interface SpdySettingsFrame extends SpdyFrame
{
    boolean isPersistValue(final int p0);
    
    Set<Integer> ids();
    
    SpdySettingsFrame setValue(final int p0, final int p1);
    
    SpdySettingsFrame setValue(final int p0, final int p1, final boolean p2, final boolean p3);
    
    boolean isSet(final int p0);
    
    SpdySettingsFrame setPersistValue(final int p0, final boolean p1);
    
    SpdySettingsFrame removeValue(final int p0);
    
    SpdySettingsFrame setClearPreviouslyPersistedSettings(final boolean p0);
    
    boolean isPersisted(final int p0);
    
    boolean clearPreviouslyPersistedSettings();
    
    int getValue(final int p0);
    
    SpdySettingsFrame setPersisted(final int p0, final boolean p1);
}
