// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.command;

public class KeyControl implements Control
{
    private static final /* synthetic */ int[] llIlIIIIllIlII;
    private /* synthetic */ int keycode;
    
    private static boolean lIIlIIIlIlllIllI(final int llllllllllllIllIllIlIllIIlIllIIl) {
        return llllllllllllIllIllIlIllIIlIllIIl != 0;
    }
    
    static {
        lIIlIIIlIlllIlIl();
    }
    
    private static boolean lIIlIIIlIlllIlll(final int llllllllllllIllIllIlIllIIlIlllII, final int llllllllllllIllIllIlIllIIlIllIll) {
        return llllllllllllIllIllIlIllIIlIlllII == llllllllllllIllIllIlIllIIlIllIll;
    }
    
    @Override
    public int hashCode() {
        return this.keycode;
    }
    
    @Override
    public boolean equals(final Object llllllllllllIllIllIlIllIIllIIIlI) {
        if (lIIlIIIlIlllIllI((llllllllllllIllIllIlIllIIllIIIlI instanceof KeyControl) ? 1 : 0)) {
            int n;
            if (lIIlIIIlIlllIlll(((KeyControl)llllllllllllIllIllIlIllIIllIIIlI).keycode, this.keycode)) {
                n = KeyControl.llIlIIIIllIlII[0];
                "".length();
                if ((18 + 112 - 7 + 7 ^ 19 + 28 + 67 + 20) != (0x77 ^ 0x5 ^ (0x3 ^ 0x75))) {
                    return ((36 + 41 + 70 + 13 ^ 10 + 79 - 55 + 156) & (0x5A ^ 0x7B ^ (0x4 ^ 0x3B) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = KeyControl.llIlIIIIllIlII[1];
            }
            return n != 0;
        }
        return KeyControl.llIlIIIIllIlII[1] != 0;
    }
    
    private static void lIIlIIIlIlllIlIl() {
        (llIlIIIIllIlII = new int[2])[0] = " ".length();
        KeyControl.llIlIIIIllIlII[1] = ((0xED ^ 0xA8 ^ (0xF4 ^ 0xA6)) & (0xD ^ 0x60 ^ (0x7E ^ 0x4) ^ -" ".length()));
    }
    
    public KeyControl(final int llllllllllllIllIllIlIllIIllIlIlI) {
        this.keycode = llllllllllllIllIllIlIllIIllIlIlI;
    }
}
