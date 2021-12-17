// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util;

public interface Attribute<T>
{
    T get();
    
    T getAndSet(final T p0);
    
    void remove();
    
    AttributeKey<T> key();
    
    boolean compareAndSet(final T p0, final T p1);
    
    T setIfAbsent(final T p0);
    
    void set(final T p0);
    
    T getAndRemove();
}
