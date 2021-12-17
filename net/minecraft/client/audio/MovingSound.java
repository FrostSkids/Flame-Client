// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.audio;

import net.minecraft.util.ResourceLocation;

public abstract class MovingSound extends PositionedSound implements ITickableSound
{
    protected /* synthetic */ boolean donePlaying;
    private static final /* synthetic */ int[] lIIIIIIIIIlIll;
    
    static {
        lIllIIlIlIIllll();
    }
    
    protected MovingSound(final ResourceLocation lllllllllllllIlIlIIlIIlllIIIlIIl) {
        super(lllllllllllllIlIlIIlIIlllIIIlIIl);
        this.donePlaying = (MovingSound.lIIIIIIIIIlIll[0] != 0);
    }
    
    @Override
    public boolean isDonePlaying() {
        return this.donePlaying;
    }
    
    private static void lIllIIlIlIIllll() {
        (lIIIIIIIIIlIll = new int[1])[0] = ((0x62 ^ 0x65) & ~(0x62 ^ 0x65));
    }
}
