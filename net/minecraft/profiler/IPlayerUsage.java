// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.profiler;

public interface IPlayerUsage
{
    boolean isSnooperEnabled();
    
    void addServerStatsToSnooper(final PlayerUsageSnooper p0);
    
    void addServerTypeToSnooper(final PlayerUsageSnooper p0);
}
