// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.command;

abstract class ControllerControl implements Control
{
    private /* synthetic */ int controllerNumber;
    private /* synthetic */ int button;
    private /* synthetic */ int event;
    private static final /* synthetic */ int[] lIIlIIllIIIlII;
    
    static {
        llIIllIlllIIllI();
        DOWN_EVENT = ControllerControl.lIIlIIllIIIlII[2];
        RIGHT_EVENT = ControllerControl.lIIlIIllIIIlII[3];
        LEFT_EVENT = ControllerControl.lIIlIIllIIIlII[1];
        UP_EVENT = ControllerControl.lIIlIIllIIIlII[4];
        BUTTON_EVENT = ControllerControl.lIIlIIllIIIlII[0];
    }
    
    private static boolean llIIllIlllIlIII(final int lllllllllllllIIllIllIlIllllIllll) {
        return lllllllllllllIIllIllIlIllllIllll == 0;
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIIllIllIlIllllllIll) {
        if (llIIllIlllIIlll(lllllllllllllIIllIllIlIllllllIll)) {
            return ControllerControl.lIIlIIllIIIlII[0] != 0;
        }
        if (llIIllIlllIlIII((lllllllllllllIIllIllIlIllllllIll instanceof ControllerControl) ? 1 : 0)) {
            return ControllerControl.lIIlIIllIIIlII[0] != 0;
        }
        final ControllerControl lllllllllllllIIllIllIlIlllllllIl = (ControllerControl)lllllllllllllIIllIllIlIllllllIll;
        int n;
        if (llIIllIlllIlIIl(lllllllllllllIIllIllIlIlllllllIl.controllerNumber, this.controllerNumber) && llIIllIlllIlIIl(lllllllllllllIIllIllIlIlllllllIl.event, this.event) && llIIllIlllIlIIl(lllllllllllllIIllIllIlIlllllllIl.button, this.button)) {
            n = ControllerControl.lIIlIIllIIIlII[1];
            "".length();
            if (null != null) {
                return ((0x8E ^ 0xC6) & ~(0xCF ^ 0x87)) != 0x0;
            }
        }
        else {
            n = ControllerControl.lIIlIIllIIIlII[0];
        }
        return n != 0;
    }
    
    private static boolean llIIllIlllIlIIl(final int lllllllllllllIIllIllIlIlllllIlII, final int lllllllllllllIIllIllIlIlllllIIll) {
        return lllllllllllllIIllIllIlIlllllIlII == lllllllllllllIIllIllIlIlllllIIll;
    }
    
    private static boolean llIIllIlllIIlll(final Object lllllllllllllIIllIllIlIlllllIIIl) {
        return lllllllllllllIIllIllIlIlllllIIIl == null;
    }
    
    @Override
    public int hashCode() {
        return this.event + this.button + this.controllerNumber;
    }
    
    private static void llIIllIlllIIllI() {
        (lIIlIIllIIIlII = new int[5])[0] = ((0x33 ^ 0x36) & ~(0x2C ^ 0x29));
        ControllerControl.lIIlIIllIIIlII[1] = " ".length();
        ControllerControl.lIIlIIllIIIlII[2] = (0x6E ^ 0x6A);
        ControllerControl.lIIlIIllIIIlII[3] = "  ".length();
        ControllerControl.lIIlIIllIIIlII[4] = "   ".length();
    }
    
    protected ControllerControl(final int lllllllllllllIIllIllIllIIIIIIlIl, final int lllllllllllllIIllIllIllIIIIIlIII, final int lllllllllllllIIllIllIllIIIIIIIll) {
        this.event = lllllllllllllIIllIllIllIIIIIlIII;
        this.button = lllllllllllllIIllIllIllIIIIIIIll;
        this.controllerNumber = lllllllllllllIIllIllIllIIIIIIlIl;
    }
}
