// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.util.pathfinding;

import java.util.ArrayList;
import java.io.Serializable;

public class Path implements Serializable
{
    private static final /* synthetic */ int[] llIllIllllIIlI;
    private /* synthetic */ ArrayList steps;
    
    public void prependStep(final int llllllllllllIllIIlIlllIlllllIIIl, final int llllllllllllIllIIlIlllIlllllIIII) {
        this.steps.add(Path.llIllIllllIIlI[0], new Step(llllllllllllIllIIlIlllIlllllIIIl, llllllllllllIllIIlIlllIlllllIIII));
    }
    
    public Step getStep(final int llllllllllllIllIIlIllllIIIIIllIl) {
        return this.steps.get(llllllllllllIllIIlIllllIIIIIllIl);
    }
    
    public boolean contains(final int llllllllllllIllIIlIlllIllllIlIII, final int llllllllllllIllIIlIlllIllllIIlII) {
        return this.steps.contains(new Step(llllllllllllIllIIlIlllIllllIlIII, llllllllllllIllIIlIlllIllllIIlII));
    }
    
    public void appendStep(final int llllllllllllIllIIlIlllIlllllIlll, final int llllllllllllIllIIlIlllIlllllIllI) {
        this.steps.add(new Step(llllllllllllIllIIlIlllIlllllIlll, llllllllllllIllIIlIlllIlllllIllI));
        "".length();
    }
    
    public Path() {
        this.steps = new ArrayList();
    }
    
    public int getX(final int llllllllllllIllIIlIllllIIIIIIlIl) {
        return this.getStep(llllllllllllIllIIlIllllIIIIIIlIl).x;
    }
    
    public int getLength() {
        return this.steps.size();
    }
    
    private static void lIIllIIIlIIlllll() {
        (llIllIllllIIlI = new int[1])[0] = ((0xE2 ^ 0xAC) & ~(0x70 ^ 0x3E));
    }
    
    static {
        lIIllIIIlIIlllll();
    }
    
    public int getY(final int llllllllllllIllIIlIlllIlllllllll) {
        return this.getStep(llllllllllllIllIIlIlllIlllllllll).y;
    }
    
    public class Step implements Serializable
    {
        private static final /* synthetic */ int[] llIlllIlllllIl;
        private /* synthetic */ int x;
        private /* synthetic */ int y;
        
        private static boolean lIIllIlIIIlllIll(final int llllllllllllIllIIlIIIIIllIIIIIlI) {
            return llllllllllllIllIIlIIIIIllIIIIIlI != 0;
        }
        
        private static boolean lIIllIlIIIllllII(final int llllllllllllIllIIlIIIIIllIIIIlIl, final int llllllllllllIllIIlIIIIIllIIIIlII) {
            return llllllllllllIllIIlIIIIIllIIIIlIl == llllllllllllIllIIlIIIIIllIIIIlII;
        }
        
        static {
            lIIllIlIIIlllIlI();
        }
        
        private static void lIIllIlIIIlllIlI() {
            (llIlllIlllllIl = new int[2])[0] = " ".length();
            Step.llIlllIlllllIl[1] = ((0x1 ^ 0x5F) & ~(0xD8 ^ 0x86));
        }
        
        public int getX() {
            return this.x;
        }
        
        @Override
        public boolean equals(final Object llllllllllllIllIIlIIIIIllIIlIIIl) {
            if (lIIllIlIIIlllIll((llllllllllllIllIIlIIIIIllIIlIIIl instanceof Step) ? 1 : 0)) {
                final Step llllllllllllIllIIlIIIIIllIIlIIll = (Step)llllllllllllIllIIlIIIIIllIIlIIIl;
                int n;
                if (lIIllIlIIIllllII(llllllllllllIllIIlIIIIIllIIlIIll.x, this.x) && lIIllIlIIIllllII(llllllllllllIllIIlIIIIIllIIlIIll.y, this.y)) {
                    n = Step.llIlllIlllllIl[0];
                    "".length();
                    if ("  ".length() <= ((0x47 ^ 0x7E ^ (0x44 ^ 0x20)) & (0xE6 ^ 0x87 ^ (0x5B ^ 0x67) ^ -" ".length()))) {
                        return ((0x49 ^ 0x59 ^ (0x38 ^ 0x4A)) & (0x7F ^ 0x52 ^ (0x73 ^ 0x3C) ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    n = Step.llIlllIlllllIl[1];
                }
                return n != 0;
            }
            return Step.llIlllIlllllIl[1] != 0;
        }
        
        @Override
        public int hashCode() {
            return this.x * this.y;
        }
        
        public Step(final int llllllllllllIllIIlIIIIIllIlIIIIl, final int llllllllllllIllIIlIIIIIllIlIIlII) {
            this.x = llllllllllllIllIIlIIIIIllIlIIIIl;
            this.y = llllllllllllIllIIlIIIIIllIlIIlII;
        }
        
        public int getY() {
            return this.y;
        }
    }
}
