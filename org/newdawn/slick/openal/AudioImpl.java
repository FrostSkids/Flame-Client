// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.openal;

import org.lwjgl.openal.AL10;

public class AudioImpl implements Audio
{
    private /* synthetic */ SoundStore store;
    private static final /* synthetic */ int[] llIIllIlIIIlll;
    private /* synthetic */ int index;
    private /* synthetic */ float length;
    private /* synthetic */ int buffer;
    
    public static void restartMusic() {
        SoundStore.get().restartLoop();
    }
    
    public boolean setPosition(float llllllllllllIlllIIIIIIllIIllIIll) {
        llllllllllllIlllIIIIIIllIIllIIll %= this.length;
        AL10.alSourcef(this.store.getSource(this.index), AudioImpl.llIIllIlIIIlll[7], llllllllllllIlllIIIIIIllIIllIIll);
        if (lIIIlllIllIIlIll(AL10.alGetError())) {
            return AudioImpl.llIIllIlIIIlll[6] != 0;
        }
        return AudioImpl.llIIllIlIIIlll[8] != 0;
    }
    
    private static boolean lIIIlllIllIIlIll(final int llllllllllllIlllIIIIIIllIIlIllII) {
        return llllllllllllIlllIIIIIIllIIlIllII != 0;
    }
    
    public int playAsMusic(final float llllllllllllIlllIIIIIIllIIllllIl, final float llllllllllllIlllIIIIIIllIIllllII, final boolean llllllllllllIlllIIIIIIllIIlllIll) {
        this.store.playAsMusic(this.buffer, llllllllllllIlllIIIIIIllIIllllIl, llllllllllllIlllIIIIIIllIIllllII, llllllllllllIlllIIIIIIllIIlllIll);
        this.index = AudioImpl.llIIllIlIIIlll[6];
        return this.store.getSource(AudioImpl.llIIllIlIIIlll[6]);
    }
    
    private static void lIIIlllIllIIlIIl() {
        (llIIllIlIIIlll = new int[9])[0] = -" ".length();
        AudioImpl.llIIllIlIIIlll[1] = (-(0xFFFFDF9B & 0x6EEF) & (0xFFFFFFFE & 0x6E8F));
        AudioImpl.llIIllIlIIIlll[2] = (-(0xFFFFFFBB & 0xDC5) & (0xFFFFBFCB & 0x6DB6));
        AudioImpl.llIIllIlIIIlll[3] = (-(0xFFFFDFF7 & 0x39D9) & (0xFFFFFDDF & 0x3BF3));
        AudioImpl.llIIllIlIIIlll[4] = (0xFFFFF825 & 0x27DB);
        AudioImpl.llIIllIlIIIlll[5] = (0xAE ^ 0xA6);
        AudioImpl.llIIllIlIIIlll[6] = ((94 + 45 - 62 + 78 ^ 107 + 6 - 104 + 153) & (0xD0 ^ 0xC6 ^ (0x11 ^ 0x3E) ^ -" ".length()));
        AudioImpl.llIIllIlIIIlll[7] = (-(0xFFFFE91B & 0x7FF7) & (0xFFFFFBBE & 0x7D77));
        AudioImpl.llIIllIlIIIlll[8] = " ".length();
    }
    
    public int playAsSoundEffect(final float llllllllllllIlllIIIIIIllIlIllllI, final float llllllllllllIlllIIIIIIllIlIlllIl, final boolean llllllllllllIlllIIIIIIllIlIlllII) {
        this.index = this.store.playAsSound(this.buffer, llllllllllllIlllIIIIIIllIlIllllI, llllllllllllIlllIIIIIIllIlIlllIl, llllllllllllIlllIIIIIIllIlIlllII);
        return this.store.getSource(this.index);
    }
    
    public int playAsSoundEffect(final float llllllllllllIlllIIIIIIllIlIIllll, final float llllllllllllIlllIIIIIIllIlIIlllI, final boolean llllllllllllIlllIIIIIIllIlIIIllI, final float llllllllllllIlllIIIIIIllIlIIllII, final float llllllllllllIlllIIIIIIllIlIIIlII, final float llllllllllllIlllIIIIIIllIlIIlIlI) {
        this.index = this.store.playAsSoundAt(this.buffer, llllllllllllIlllIIIIIIllIlIIllll, llllllllllllIlllIIIIIIllIlIIlllI, llllllllllllIlllIIIIIIllIlIIIllI, llllllllllllIlllIIIIIIllIlIIllII, llllllllllllIlllIIIIIIllIlIIIlII, llllllllllllIlllIIIIIIllIlIIlIlI);
        return this.store.getSource(this.index);
    }
    
    public int getBufferID() {
        return this.buffer;
    }
    
    protected AudioImpl() {
        this.index = AudioImpl.llIIllIlIIIlll[0];
    }
    
    public boolean isPlaying() {
        if (lIIIlllIllIIlIlI(this.index, AudioImpl.llIIllIlIIIlll[0])) {
            return this.store.isPlaying(this.index);
        }
        return AudioImpl.llIIllIlIIIlll[6] != 0;
    }
    
    static {
        lIIIlllIllIIlIIl();
    }
    
    AudioImpl(final SoundStore llllllllllllIlllIIIIIIllIllllllI, final int llllllllllllIlllIIIIIIllIlllIlIl) {
        this.index = AudioImpl.llIIllIlIIIlll[0];
        this.store = llllllllllllIlllIIIIIIllIllllllI;
        this.buffer = llllllllllllIlllIIIIIIllIlllIlIl;
        final int llllllllllllIlllIIIIIIllIlllllII = AL10.alGetBufferi(llllllllllllIlllIIIIIIllIlllIlIl, AudioImpl.llIIllIlIIIlll[1]);
        final int llllllllllllIlllIIIIIIllIllllIll = AL10.alGetBufferi(llllllllllllIlllIIIIIIllIlllIlIl, AudioImpl.llIIllIlIIIlll[2]);
        final int llllllllllllIlllIIIIIIllIllllIlI = AL10.alGetBufferi(llllllllllllIlllIIIIIIllIlllIlIl, AudioImpl.llIIllIlIIIlll[3]);
        final int llllllllllllIlllIIIIIIllIllllIIl = AL10.alGetBufferi(llllllllllllIlllIIIIIIllIlllIlIl, AudioImpl.llIIllIlIIIlll[4]);
        final int llllllllllllIlllIIIIIIllIllllIII = llllllllllllIlllIIIIIIllIlllllII / (llllllllllllIlllIIIIIIllIllllIll / AudioImpl.llIIllIlIIIlll[5]);
        this.length = llllllllllllIlllIIIIIIllIllllIII / (float)llllllllllllIlllIIIIIIllIllllIIl / llllllllllllIlllIIIIIIllIllllIlI;
    }
    
    private static boolean lIIIlllIllIIlIlI(final int llllllllllllIlllIIIIIIllIIlIlIIl, final int llllllllllllIlllIIIIIIllIIlIlIII) {
        return llllllllllllIlllIIIIIIllIIlIlIIl != llllllllllllIlllIIIIIIllIIlIlIII;
    }
    
    public static void pauseMusic() {
        SoundStore.get().pauseLoop();
    }
    
    public float getPosition() {
        return AL10.alGetSourcef(this.store.getSource(this.index), AudioImpl.llIIllIlIIIlll[7]);
    }
    
    public void stop() {
        if (lIIIlllIllIIlIlI(this.index, AudioImpl.llIIllIlIIIlll[0])) {
            this.store.stopSource(this.index);
            this.index = AudioImpl.llIIllIlIIIlll[0];
        }
    }
}
