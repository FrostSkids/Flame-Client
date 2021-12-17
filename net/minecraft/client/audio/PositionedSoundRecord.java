// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.audio;

import net.minecraft.util.ResourceLocation;

public class PositionedSoundRecord extends PositionedSound
{
    private static final /* synthetic */ int[] lIllllIIlIlIIl;
    
    public static PositionedSoundRecord create(final ResourceLocation llllllllllllIllllIlIllIIIlllllII) {
        return new PositionedSoundRecord(llllllllllllIllllIlIllIIIlllllII, 1.0f, 1.0f, (boolean)(PositionedSoundRecord.lIllllIIlIlIIl[0] != 0), PositionedSoundRecord.lIllllIIlIlIIl[0], ISound.AttenuationType.NONE, 0.0f, 0.0f, 0.0f);
    }
    
    public PositionedSoundRecord(final ResourceLocation llllllllllllIllllIlIllIIIllIIIII, final float llllllllllllIllllIlIllIIIllIIllI, final float llllllllllllIllllIlIllIIIlIllllI, final float llllllllllllIllllIlIllIIIllIIlII, final float llllllllllllIllllIlIllIIIlIlllII, final float llllllllllllIllllIlIllIIIlIllIll) {
        this(llllllllllllIllllIlIllIIIllIIIII, llllllllllllIllllIlIllIIIllIIllI, llllllllllllIllllIlIllIIIlIllllI, (boolean)(PositionedSoundRecord.lIllllIIlIlIIl[0] != 0), PositionedSoundRecord.lIllllIIlIlIIl[0], ISound.AttenuationType.LINEAR, llllllllllllIllllIlIllIIIllIIlII, llllllllllllIllllIlIllIIIlIlllII, llllllllllllIllllIlIllIIIlIllIll);
    }
    
    static {
        lIIIIlIIIIIlIlIl();
    }
    
    private PositionedSoundRecord(final ResourceLocation llllllllllllIllllIlIllIIIlIIIlIl, final float llllllllllllIllllIlIllIIIlIIIlII, final float llllllllllllIllllIlIllIIIlIIIIll, final boolean llllllllllllIllllIlIllIIIlIIllII, final int llllllllllllIllllIlIllIIIlIIIIIl, final ISound.AttenuationType llllllllllllIllllIlIllIIIlIIlIlI, final float llllllllllllIllllIlIllIIIlIIlIIl, final float llllllllllllIllllIlIllIIIlIIlIII, final float llllllllllllIllllIlIllIIIIllllIl) {
        super(llllllllllllIllllIlIllIIIlIIIlIl);
        this.volume = llllllllllllIllllIlIllIIIlIIIlII;
        this.pitch = llllllllllllIllllIlIllIIIlIIIIll;
        this.xPosF = llllllllllllIllllIlIllIIIlIIlIIl;
        this.yPosF = llllllllllllIllllIlIllIIIlIIlIII;
        this.zPosF = llllllllllllIllllIlIllIIIIllllIl;
        this.repeat = llllllllllllIllllIlIllIIIlIIllII;
        this.repeatDelay = llllllllllllIllllIlIllIIIlIIIIIl;
        this.attenuationType = llllllllllllIllllIlIllIIIlIIlIlI;
    }
    
    public static PositionedSoundRecord create(final ResourceLocation llllllllllllIllllIlIllIIlIIIIIlI, final float llllllllllllIllllIlIllIIlIIIIIIl) {
        return new PositionedSoundRecord(llllllllllllIllllIlIllIIlIIIIIlI, 0.25f, llllllllllllIllllIlIllIIlIIIIIIl, (boolean)(PositionedSoundRecord.lIllllIIlIlIIl[0] != 0), PositionedSoundRecord.lIllllIIlIlIIl[0], ISound.AttenuationType.NONE, 0.0f, 0.0f, 0.0f);
    }
    
    private static void lIIIIlIIIIIlIlIl() {
        (lIllllIIlIlIIl = new int[1])[0] = ((0x62 ^ 0x2A ^ (0xFC ^ 0xA3)) & (153 + 72 - 205 + 169 ^ 98 + 33 - 98 + 137 ^ -" ".length()));
    }
    
    public static PositionedSoundRecord create(final ResourceLocation llllllllllllIllllIlIllIIIlllIIll, final float llllllllllllIllllIlIllIIIlllIllI, final float llllllllllllIllllIlIllIIIlllIIIl, final float llllllllllllIllllIlIllIIIlllIIII) {
        return new PositionedSoundRecord(llllllllllllIllllIlIllIIIlllIIll, 4.0f, 1.0f, (boolean)(PositionedSoundRecord.lIllllIIlIlIIl[0] != 0), PositionedSoundRecord.lIllllIIlIlIIl[0], ISound.AttenuationType.LINEAR, llllllllllllIllllIlIllIIIlllIllI, llllllllllllIllllIlIllIIIlllIIIl, llllllllllllIllllIlIllIIIlllIIII);
    }
}
