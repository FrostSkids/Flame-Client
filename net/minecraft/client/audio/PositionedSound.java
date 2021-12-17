// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.audio;

import net.minecraft.util.ResourceLocation;

public abstract class PositionedSound implements ISound
{
    protected /* synthetic */ float xPosF;
    protected /* synthetic */ int repeatDelay;
    protected /* synthetic */ float volume;
    protected /* synthetic */ AttenuationType attenuationType;
    protected /* synthetic */ float pitch;
    protected /* synthetic */ float zPosF;
    protected /* synthetic */ boolean repeat;
    protected /* synthetic */ float yPosF;
    private static final /* synthetic */ int[] lIIlIIllIllllI;
    protected final /* synthetic */ ResourceLocation positionedSoundLocation;
    
    @Override
    public float getPitch() {
        return this.pitch;
    }
    
    @Override
    public float getYPosF() {
        return this.yPosF;
    }
    
    static {
        llIIlllIIlIIIII();
    }
    
    @Override
    public float getVolume() {
        return this.volume;
    }
    
    @Override
    public AttenuationType getAttenuationType() {
        return this.attenuationType;
    }
    
    @Override
    public float getXPosF() {
        return this.xPosF;
    }
    
    @Override
    public boolean canRepeat() {
        return this.repeat;
    }
    
    private static void llIIlllIIlIIIII() {
        (lIIlIIllIllllI = new int[1])[0] = ((0xD3 ^ 0x9C) & ~(0x11 ^ 0x5E));
    }
    
    protected PositionedSound(final ResourceLocation lllllllllllllIIllIllIIlIllllIlll) {
        this.volume = 1.0f;
        this.pitch = 1.0f;
        this.repeat = (PositionedSound.lIIlIIllIllllI[0] != 0);
        this.repeatDelay = PositionedSound.lIIlIIllIllllI[0];
        this.attenuationType = AttenuationType.LINEAR;
        this.positionedSoundLocation = lllllllllllllIIllIllIIlIllllIlll;
    }
    
    @Override
    public float getZPosF() {
        return this.zPosF;
    }
    
    @Override
    public int getRepeatDelay() {
        return this.repeatDelay;
    }
    
    @Override
    public ResourceLocation getSoundLocation() {
        return this.positionedSoundLocation;
    }
}
