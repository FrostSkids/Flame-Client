// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.state.transition;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.util.MaskUtil;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.opengl.renderer.Renderer;
import java.util.ArrayList;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.Color;
import org.newdawn.slick.opengl.renderer.SGL;

public class BlobbyTransition implements Transition
{
    protected static /* synthetic */ SGL GL;
    private /* synthetic */ int blobCount;
    private /* synthetic */ Color background;
    private static final /* synthetic */ int[] llIIlIIlIlIlll;
    private /* synthetic */ int timer;
    private /* synthetic */ boolean finish;
    private /* synthetic */ GameState prev;
    private /* synthetic */ ArrayList blobs;
    
    private static boolean lIIIllIIIllIlIIl(final int llllllllllllIlllIIlIlIIlIlIlIlIl, final int llllllllllllIlllIIlIlIIlIlIlIlII) {
        return llllllllllllIlllIIlIlIIlIlIlIlIl < llllllllllllIlllIIlIlIIlIlIlIlII;
    }
    
    public boolean isComplete() {
        return this.finish;
    }
    
    private static boolean lIIIllIIIllIlIlI(final Object llllllllllllIlllIIlIlIIlIlIlIIlI) {
        return llllllllllllIlllIIlIlIIlIlIlIIlI != null;
    }
    
    static {
        lIIIllIIIllIlIII();
        BlobbyTransition.GL = Renderer.get();
    }
    
    public BlobbyTransition() {
        this.blobs = new ArrayList();
        this.timer = BlobbyTransition.llIIlIIlIlIlll[0];
        this.blobCount = BlobbyTransition.llIIlIIlIlIlll[1];
    }
    
    public void postRender(final StateBasedGame llllllllllllIlllIIlIlIIlIllllIII, final GameContainer llllllllllllIlllIIlIlIIlIlllIlll, final Graphics llllllllllllIlllIIlIlIIlIlllIllI) throws SlickException {
        MaskUtil.resetMask();
    }
    
    public void init(final GameState llllllllllllIlllIIlIlIIllIIIIIII, final GameState llllllllllllIlllIIlIlIIlIlllllll) {
        this.prev = llllllllllllIlllIIlIlIIlIlllllll;
    }
    
    private static void lIIIllIIIllIlIII() {
        (llIIlIIlIlIlll = new int[4])[0] = (0xFFFFA3FA & 0x5FED);
        BlobbyTransition.llIIlIIlIlIlll[1] = (0xBF ^ 0xB5);
        BlobbyTransition.llIIlIIlIlIlll[2] = ((0xB9 ^ 0x82 ^ (0xDA ^ 0xC7)) & (0x69 ^ 0x1E ^ (0x68 ^ 0x39) ^ -" ".length()));
        BlobbyTransition.llIIlIIlIlIlll[3] = " ".length();
    }
    
    public void preRender(final StateBasedGame llllllllllllIlllIIlIlIIlIllIlIIl, final GameContainer llllllllllllIlllIIlIlIIlIllIllII, final Graphics llllllllllllIlllIIlIlIIlIllIIlll) throws SlickException {
        this.prev.render(llllllllllllIlllIIlIlIIlIllIllII, llllllllllllIlllIIlIlIIlIllIlIIl, llllllllllllIlllIIlIlIIlIllIIlll);
        MaskUtil.defineMask();
        int llllllllllllIlllIIlIlIIlIlllIIII = BlobbyTransition.llIIlIIlIlIlll[2];
        while (lIIIllIIIllIlIIl(llllllllllllIlllIIlIlIIlIlllIIII, this.blobs.size())) {
            this.blobs.get(llllllllllllIlllIIlIlIIlIlllIIII).render(llllllllllllIlllIIlIlIIlIllIIlll);
            ++llllllllllllIlllIIlIlIIlIlllIIII;
            "".length();
            if (-(0x42 ^ 0x47) >= 0) {
                return;
            }
        }
        MaskUtil.finishDefineMask();
        MaskUtil.drawOnMask();
        if (lIIIllIIIllIlIlI(this.background)) {
            final Color llllllllllllIlllIIlIlIIlIllIllll = llllllllllllIlllIIlIlIIlIllIIlll.getColor();
            llllllllllllIlllIIlIlIIlIllIIlll.setColor(this.background);
            llllllllllllIlllIIlIlIIlIllIIlll.fillRect(0.0f, 0.0f, (float)llllllllllllIlllIIlIlIIlIllIllII.getWidth(), (float)llllllllllllIlllIIlIlIIlIllIllII.getHeight());
            llllllllllllIlllIIlIlIIlIllIIlll.setColor(llllllllllllIlllIIlIlIIlIllIllll);
        }
    }
    
    private static boolean lIIIllIIIllIlIll(final int llllllllllllIlllIIlIlIIlIlIlIIII) {
        return llllllllllllIlllIIlIlIIlIlIlIIII == 0;
    }
    
    private static boolean lIIIllIIIllIllII(final int llllllllllllIlllIIlIlIIlIlIIlllI) {
        return llllllllllllIlllIIlIlIIlIlIIlllI < 0;
    }
    
    public BlobbyTransition(final Color llllllllllllIlllIIlIlIIllIIIIllI) {
        this.blobs = new ArrayList();
        this.timer = BlobbyTransition.llIIlIIlIlIlll[0];
        this.blobCount = BlobbyTransition.llIIlIIlIlIlll[1];
        this.background = llllllllllllIlllIIlIlIIllIIIIllI;
    }
    
    public void update(final StateBasedGame llllllllllllIlllIIlIlIIlIlIllllI, final GameContainer llllllllllllIlllIIlIlIIlIlIllIlI, final int llllllllllllIlllIIlIlIIlIlIlllII) throws SlickException {
        if (lIIIllIIIllIlIll(this.blobs.size())) {
            int llllllllllllIlllIIlIlIIlIllIIIIl = BlobbyTransition.llIIlIIlIlIlll[2];
            while (lIIIllIIIllIlIIl(llllllllllllIlllIIlIlIIlIllIIIIl, this.blobCount)) {
                this.blobs.add(new Blob(llllllllllllIlllIIlIlIIlIlIllIlI));
                "".length();
                ++llllllllllllIlllIIlIlIIlIllIIIIl;
                "".length();
                if (-"  ".length() > 0) {
                    return;
                }
            }
        }
        int llllllllllllIlllIIlIlIIlIllIIIII = BlobbyTransition.llIIlIIlIlIlll[2];
        while (lIIIllIIIllIlIIl(llllllllllllIlllIIlIlIIlIllIIIII, this.blobs.size())) {
            this.blobs.get(llllllllllllIlllIIlIlIIlIllIIIII).update(llllllllllllIlllIIlIlIIlIlIlllII);
            ++llllllllllllIlllIIlIlIIlIllIIIII;
            "".length();
            if (((0x63 ^ 0x47 ^ (0x5A ^ 0x31)) & (183 + 128 - 231 + 135 ^ 66 + 21 + 55 + 10 ^ -" ".length())) != 0x0) {
                return;
            }
        }
        this.timer -= llllllllllllIlllIIlIlIIlIlIlllII;
        if (lIIIllIIIllIllII(this.timer)) {
            this.finish = (BlobbyTransition.llIIlIIlIlIlll[3] != 0);
        }
    }
    
    private class Blob
    {
        private /* synthetic */ float growSpeed;
        private /* synthetic */ float x;
        private /* synthetic */ float y;
        private /* synthetic */ float rad;
        
        public void render(final Graphics lllllllllllllIIlIIIlIlIllIlllIII) {
            lllllllllllllIIlIIIlIlIllIlllIII.fillOval(this.x - this.rad, this.y - this.rad, this.rad * 2.0f, this.rad * 2.0f);
        }
        
        public Blob(final GameContainer lllllllllllllIIlIIIlIlIlllIIIIlI) {
            this.x = (float)(Math.random() * lllllllllllllIIlIIIlIlIlllIIIIlI.getWidth());
            this.y = (float)(Math.random() * lllllllllllllIIlIIIlIlIlllIIIIlI.getWidth());
            this.growSpeed = (float)(1.0 + Math.random() * 1.0);
        }
        
        public void update(final int lllllllllllllIIlIIIlIlIllIlllllI) {
            this.rad += this.growSpeed * lllllllllllllIIlIIIlIlIllIlllllI * 0.4f;
        }
    }
}
