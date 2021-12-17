// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.audio;

public class SoundEventAccessor implements ISoundEventAccessor<SoundPoolEntry>
{
    private final /* synthetic */ SoundPoolEntry entry;
    private final /* synthetic */ int weight;
    
    @Override
    public int getWeight() {
        return this.weight;
    }
    
    @Override
    public SoundPoolEntry cloneEntry() {
        return new SoundPoolEntry(this.entry);
    }
    
    SoundEventAccessor(final SoundPoolEntry llllllllllllIlIllIIIIIIlIlIlllIl, final int llllllllllllIlIllIIIIIIlIlIlllII) {
        this.entry = llllllllllllIlIllIIIIIIlIlIlllIl;
        this.weight = llllllllllllIlIllIIIIIIlIlIlllII;
    }
}
