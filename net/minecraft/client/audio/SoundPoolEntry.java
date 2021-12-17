// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.audio;

import net.minecraft.util.ResourceLocation;

public class SoundPoolEntry
{
    private /* synthetic */ double pitch;
    private /* synthetic */ double volume;
    private final /* synthetic */ ResourceLocation location;
    private final /* synthetic */ boolean streamingSound;
    
    public double getPitch() {
        return this.pitch;
    }
    
    public SoundPoolEntry(final ResourceLocation llllllllllllIllllllIlIllllllIlIl, final double llllllllllllIllllllIlIlllllllIIl, final double llllllllllllIllllllIlIllllllIIll, final boolean llllllllllllIllllllIlIllllllIIlI) {
        this.location = llllllllllllIllllllIlIllllllIlIl;
        this.pitch = llllllllllllIllllllIlIlllllllIIl;
        this.volume = llllllllllllIllllllIlIllllllIIll;
        this.streamingSound = llllllllllllIllllllIlIllllllIIlI;
    }
    
    public double getVolume() {
        return this.volume;
    }
    
    public void setVolume(final double llllllllllllIllllllIlIllllIllIIl) {
        this.volume = llllllllllllIllllllIlIllllIllIIl;
    }
    
    public boolean isStreamingSound() {
        return this.streamingSound;
    }
    
    public SoundPoolEntry(final SoundPoolEntry llllllllllllIllllllIlIlllllIllII) {
        this.location = llllllllllllIllllllIlIlllllIllII.location;
        this.pitch = llllllllllllIllllllIlIlllllIllII.pitch;
        this.volume = llllllllllllIllllllIlIlllllIllII.volume;
        this.streamingSound = llllllllllllIllllllIlIlllllIllII.streamingSound;
    }
    
    public ResourceLocation getSoundPoolEntryLocation() {
        return this.location;
    }
    
    public void setPitch(final double llllllllllllIllllllIlIlllllIIIII) {
        this.pitch = llllllllllllIllllllIlIlllllIIIII;
    }
}
