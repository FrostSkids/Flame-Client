// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block.properties;

import java.util.Collection;

public interface IProperty<T extends Comparable<T>>
{
    Class<T> getValueClass();
    
    Collection<T> getAllowedValues();
    
    String getName();
    
    String getName(final T p0);
}
