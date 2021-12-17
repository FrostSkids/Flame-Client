// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.command;

public class ControllerDirectionControl extends ControllerControl
{
    private static final /* synthetic */ int[] llIIIlllIllIIl;
    
    private static void lIIIlIlIllllIIll() {
        (llIIIlllIllIIl = new int[5])[0] = ((0xC ^ 0x30) & ~(0x32 ^ 0xE));
        ControllerDirectionControl.llIIIlllIllIIl[1] = " ".length();
        ControllerDirectionControl.llIIIlllIllIIl[2] = "   ".length();
        ControllerDirectionControl.llIIIlllIllIIl[3] = (0x2C ^ 0x3 ^ (0x8D ^ 0xA6));
        ControllerDirectionControl.llIIIlllIllIIl[4] = "  ".length();
    }
    
    public ControllerDirectionControl(final int llllllllllllIlllIlIIIIIIlIlIlIIl, final Direction llllllllllllIlllIlIIIIIIlIlIIlIl) {
        super(llllllllllllIlllIlIIIIIIlIlIlIIl, llllllllllllIlllIlIIIIIIlIlIIlIl.event, ControllerDirectionControl.llIIIlllIllIIl[0]);
    }
    
    static {
        lIIIlIlIllllIIll();
        LEFT = new Direction(ControllerDirectionControl.llIIIlllIllIIl[1]);
        UP = new Direction(ControllerDirectionControl.llIIIlllIllIIl[2]);
        DOWN = new Direction(ControllerDirectionControl.llIIIlllIllIIl[3]);
        RIGHT = new Direction(ControllerDirectionControl.llIIIlllIllIIl[4]);
    }
    
    private static class Direction
    {
        private /* synthetic */ int event;
        
        public Direction(final int llllllllllllIllIlIIlllIIlIIlIIIl) {
            this.event = llllllllllllIllIlIIlllIIlIIlIIIl;
        }
    }
}
