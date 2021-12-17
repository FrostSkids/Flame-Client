// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai.attributes;

import java.util.UUID;
import java.util.Collection;

public interface IAttributeInstance
{
    boolean hasModifier(final AttributeModifier p0);
    
    void setBaseValue(final double p0);
    
    Collection<AttributeModifier> func_111122_c();
    
    void removeAllModifiers();
    
    AttributeModifier getModifier(final UUID p0);
    
    double getBaseValue();
    
    Collection<AttributeModifier> getModifiersByOperation(final int p0);
    
    void applyModifier(final AttributeModifier p0);
    
    double getAttributeValue();
    
    IAttribute getAttribute();
    
    void removeModifier(final AttributeModifier p0);
}
