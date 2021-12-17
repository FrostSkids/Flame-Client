// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources.data;

public class AnimationFrame
{
    private final /* synthetic */ int frameTime;
    private static final /* synthetic */ int[] lIlllIllIlllll;
    private final /* synthetic */ int frameIndex;
    
    private static boolean lIIIIIllIlIlllIl(final int llllllllllllIllllIllIlllllIIIlIl, final int llllllllllllIllllIllIlllllIIIlII) {
        return llllllllllllIllllIllIlllllIIIlIl == llllllllllllIllllIllIlllllIIIlII;
    }
    
    public int getFrameIndex() {
        return this.frameIndex;
    }
    
    static {
        lIIIIIllIlIlllII();
    }
    
    public AnimationFrame(final int llllllllllllIllllIllIlllllIlIIlI, final int llllllllllllIllllIllIlllllIlIIIl) {
        this.frameIndex = llllllllllllIllllIllIlllllIlIIlI;
        this.frameTime = llllllllllllIllllIllIlllllIlIIIl;
    }
    
    private static void lIIIIIllIlIlllII() {
        (lIlllIllIlllll = new int[3])[0] = -" ".length();
        AnimationFrame.lIlllIllIlllll[1] = " ".length();
        AnimationFrame.lIlllIllIlllll[2] = ((0xD2 ^ 0x95 ^ (0x53 ^ 0x35)) & (0x67 ^ 0x68 ^ (0xB4 ^ 0x9A) ^ -" ".length()));
    }
    
    public boolean hasNoTime() {
        if (lIIIIIllIlIlllIl(this.frameTime, AnimationFrame.lIlllIllIlllll[0])) {
            return AnimationFrame.lIlllIllIlllll[1] != 0;
        }
        return AnimationFrame.lIlllIllIlllll[2] != 0;
    }
    
    public int getFrameTime() {
        return this.frameTime;
    }
    
    public AnimationFrame(final int llllllllllllIllllIllIlllllIllIlI) {
        this(llllllllllllIllllIllIlllllIllIlI, AnimationFrame.lIlllIllIlllll[0]);
    }
}
