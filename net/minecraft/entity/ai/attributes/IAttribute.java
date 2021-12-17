// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai.attributes;

public interface IAttribute
{
    double clampValue(final double p0);
    
    boolean getShouldWatch();
    
    double getDefaultValue();
    
    String getAttributeUnlocalizedName();
    
    IAttribute func_180372_d();
}
