// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

public interface IProgressMeter
{
    default static {
        final String[] lanSearchStates2 = new String[74 + 142 - 95 + 49 ^ 51 + 138 - 94 + 78];
        lanSearchStates2[(152 + 6 - 120 + 116 ^ 91 + 41 - 32 + 39) & (0xA5 ^ 0xB1 ^ (0xC2 ^ 0xC7) ^ -" ".length())] = "oooooo";
        lanSearchStates2[" ".length()] = "Oooooo";
        lanSearchStates2["  ".length()] = "oOoooo";
        lanSearchStates2["   ".length()] = "ooOooo";
        lanSearchStates2[0x95 ^ 0x91] = "oooOoo";
        lanSearchStates2[0xD9 ^ 0xA5 ^ (0xE6 ^ 0x9F)] = "ooooOo";
        lanSearchStates2[0x5B ^ 0x5D] = "oooooO";
    }
    
    void doneLoading();
}
