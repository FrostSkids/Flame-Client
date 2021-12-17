// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.openal;

public class NullAudio implements Audio
{
    private static final /* synthetic */ int[] lllIIllIIllIll;
    
    private static void lIlIIIIIIlIIlIII() {
        (lllIIllIIllIll = new int[1])[0] = ((0x85 ^ 0xAA) & ~(0x2A ^ 0x5));
    }
    
    public float getPosition() {
        return 0.0f;
    }
    
    public int getBufferID() {
        return NullAudio.lllIIllIIllIll[0];
    }
    
    public boolean isPlaying() {
        return NullAudio.lllIIllIIllIll[0] != 0;
    }
    
    public void stop() {
    }
    
    public int playAsMusic(final float llllllllllllIlIllllIIIIIllIIIIll, final float llllllllllllIlIllllIIIIIllIIIIlI, final boolean llllllllllllIlIllllIIIIIllIIIIIl) {
        return NullAudio.lllIIllIIllIll[0];
    }
    
    public int playAsSoundEffect(final float llllllllllllIlIllllIIIIIlIllllll, final float llllllllllllIlIllllIIIIIlIlllllI, final boolean llllllllllllIlIllllIIIIIlIllllIl) {
        return NullAudio.lllIIllIIllIll[0];
    }
    
    static {
        lIlIIIIIIlIIlIII();
    }
    
    public int playAsSoundEffect(final float llllllllllllIlIllllIIIIIlIlllIll, final float llllllllllllIlIllllIIIIIlIlllIlI, final boolean llllllllllllIlIllllIIIIIlIlllIIl, final float llllllllllllIlIllllIIIIIlIllIlll, final float llllllllllllIlIllllIIIIIlIllIllI, final float llllllllllllIlIllllIIIIIlIllIlIl) {
        return NullAudio.lllIIllIIllIll[0];
    }
    
    public boolean setPosition(final float llllllllllllIlIllllIIIIIlIllIIlI) {
        return NullAudio.lllIIllIIllIll[0] != 0;
    }
}
