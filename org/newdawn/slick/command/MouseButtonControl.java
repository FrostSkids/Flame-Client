// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.command;

public class MouseButtonControl implements Control
{
    private static final /* synthetic */ int[] llIlIlIlIIIlII;
    private /* synthetic */ int button;
    
    public MouseButtonControl(final int llllllllllllIllIlIlIlIIIlIIllIIl) {
        this.button = llllllllllllIllIlIlIlIIIlIIllIIl;
    }
    
    @Override
    public int hashCode() {
        return this.button;
    }
    
    static {
        lIIlIlIIIIllIIlI();
    }
    
    private static void lIIlIlIIIIllIIlI() {
        (llIlIlIlIIIlII = new int[2])[0] = " ".length();
        MouseButtonControl.llIlIlIlIIIlII[1] = ((0xD7 ^ 0xC5 ^ (0x7F ^ 0x20)) & (64 + 0 + 39 + 92 ^ 5 + 5 + 97 + 35 ^ -" ".length()));
    }
    
    private static boolean lIIlIlIIIIllIIll(final int llllllllllllIllIlIlIlIIIlIIIlIlI) {
        return llllllllllllIllIlIlIlIIIlIIIlIlI != 0;
    }
    
    private static boolean lIIlIlIIIIllIlII(final int llllllllllllIllIlIlIlIIIlIIIllIl, final int llllllllllllIllIlIlIlIIIlIIIllII) {
        return llllllllllllIllIlIlIlIIIlIIIllIl == llllllllllllIllIlIlIlIIIlIIIllII;
    }
    
    @Override
    public boolean equals(final Object llllllllllllIllIlIlIlIIIlIIlIlIl) {
        if (lIIlIlIIIIllIIll((llllllllllllIllIlIlIlIIIlIIlIlIl instanceof MouseButtonControl) ? 1 : 0)) {
            int n;
            if (lIIlIlIIIIllIlII(((MouseButtonControl)llllllllllllIllIlIlIlIIIlIIlIlIl).button, this.button)) {
                n = MouseButtonControl.llIlIlIlIIIlII[0];
                "".length();
                if (((0x40 ^ 0x51 ^ (0x43 ^ 0x6C)) & (0xCC ^ 0x99 ^ (0x1C ^ 0x77) ^ -" ".length())) > 0) {
                    return ((0x53 ^ 0x14 ^ (0xA ^ 0x6C)) & (0x90 ^ 0x86 ^ (0x26 ^ 0x11) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = MouseButtonControl.llIlIlIlIIIlII[1];
            }
            return n != 0;
        }
        return MouseButtonControl.llIlIlIlIIIlII[1] != 0;
    }
}
