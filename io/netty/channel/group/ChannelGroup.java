// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.group;

import io.netty.channel.Channel;
import java.util.Set;

public interface ChannelGroup extends Set<Channel>, Comparable<ChannelGroup>
{
    @Deprecated
    ChannelGroupFuture flushAndWrite(final Object p0);
    
    ChannelGroupFuture writeAndFlush(final Object p0);
    
    ChannelGroup flush();
    
    ChannelGroupFuture write(final Object p0, final ChannelMatcher p1);
    
    ChannelGroupFuture disconnect();
    
    ChannelGroupFuture disconnect(final ChannelMatcher p0);
    
    ChannelGroupFuture close(final ChannelMatcher p0);
    
    String name();
    
    ChannelGroupFuture write(final Object p0);
    
    @Deprecated
    ChannelGroupFuture deregister();
    
    @Deprecated
    ChannelGroupFuture deregister(final ChannelMatcher p0);
    
    @Deprecated
    ChannelGroupFuture flushAndWrite(final Object p0, final ChannelMatcher p1);
    
    ChannelGroupFuture close();
    
    ChannelGroupFuture writeAndFlush(final Object p0, final ChannelMatcher p1);
    
    ChannelGroup flush(final ChannelMatcher p0);
}
