// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources.data;

import net.minecraft.util.IChatComponent;

public class PackMetadataSection implements IMetadataSection
{
    private final /* synthetic */ IChatComponent packDescription;
    private final /* synthetic */ int packFormat;
    
    public IChatComponent getPackDescription() {
        return this.packDescription;
    }
    
    public PackMetadataSection(final IChatComponent llllllllllllIlIllIlllIIllIIIllIl, final int llllllllllllIlIllIlllIIllIIIlIIl) {
        this.packDescription = llllllllllllIlIllIlllIIllIIIllIl;
        this.packFormat = llllllllllllIlIllIlllIIllIIIlIIl;
    }
    
    public int getPackFormat() {
        return this.packFormat;
    }
}
