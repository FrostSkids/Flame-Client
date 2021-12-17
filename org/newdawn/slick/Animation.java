// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick;

import org.newdawn.slick.util.Log;
import java.util.Arrays;
import org.lwjgl.Sys;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;

public class Animation implements Renderable
{
    private /* synthetic */ float speed;
    private /* synthetic */ int currentFrame;
    private static final /* synthetic */ String[] llIllIlIlllIII;
    private /* synthetic */ ArrayList frames;
    private static final /* synthetic */ int[] llIllIlIlllIll;
    private /* synthetic */ int direction;
    private /* synthetic */ long nextChange;
    private /* synthetic */ long timeLeft;
    private /* synthetic */ boolean firstUpdate;
    private /* synthetic */ boolean pingPong;
    private /* synthetic */ long lastUpdate;
    private /* synthetic */ boolean autoUpdate;
    private /* synthetic */ SpriteSheet spriteSheet;
    private /* synthetic */ int stopAt;
    private /* synthetic */ boolean stopped;
    private /* synthetic */ boolean loop;
    
    private static String lIIllIIIIIIIlIll(final String llllllllllllIllIIllIIlllIIIIIIIl, final String llllllllllllIllIIllIIlllIIIIIIII) {
        try {
            final SecretKeySpec llllllllllllIllIIllIIlllIIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllIIlllIIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIllIIlllIIIIIIll = Cipher.getInstance("Blowfish");
            llllllllllllIllIIllIIlllIIIIIIll.init(Animation.llIllIlIlllIll[4], llllllllllllIllIIllIIlllIIIIIlII);
            return new String(llllllllllllIllIIllIIlllIIIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllIIlllIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllIIlllIIIIIIlI) {
            llllllllllllIllIIllIIlllIIIIIIlI.printStackTrace();
            return null;
        }
    }
    
    private static int lIIllIIIIIIllIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public Animation(final Image[] llllllllllllIllIIllIlIIIIllIlllI, final int[] llllllllllllIllIIllIlIIIIlllIIIl, final boolean llllllllllllIllIIllIlIIIIlllIIII) {
        this.frames = new ArrayList();
        this.currentFrame = Animation.llIllIlIlllIll[1];
        this.nextChange = 0L;
        this.stopped = (Animation.llIllIlIlllIll[2] != 0);
        this.speed = 1.0f;
        this.stopAt = Animation.llIllIlIlllIll[3];
        this.firstUpdate = (Animation.llIllIlIlllIll[0] != 0);
        this.autoUpdate = (Animation.llIllIlIlllIll[0] != 0);
        this.direction = Animation.llIllIlIlllIll[0];
        this.loop = (Animation.llIllIlIlllIll[0] != 0);
        this.spriteSheet = null;
        this.autoUpdate = llllllllllllIllIIllIlIIIIlllIIII;
        if (lIIllIIIIIIlIlIl(llllllllllllIllIIllIlIIIIllIlllI.length, llllllllllllIllIIllIlIIIIlllIIIl.length)) {
            throw new RuntimeException(Animation.llIllIlIlllIII[Animation.llIllIlIlllIll[2]]);
        }
        int llllllllllllIllIIllIlIIIIlllIlII = Animation.llIllIlIlllIll[2];
        while (lIIllIIIIIIlIlII(llllllllllllIllIIllIlIIIIlllIlII, llllllllllllIllIIllIlIIIIllIlllI.length)) {
            this.addFrame(llllllllllllIllIIllIlIIIIllIlllI[llllllllllllIllIIllIlIIIIlllIlII], llllllllllllIllIIllIlIIIIlllIIIl[llllllllllllIllIIllIlIIIIlllIlII]);
            ++llllllllllllIllIIllIlIIIIlllIlII;
            "".length();
            if (-" ".length() != -" ".length()) {
                throw null;
            }
        }
        this.currentFrame = Animation.llIllIlIlllIll[2];
    }
    
    public void draw(final float llllllllllllIllIIllIIllllIlllIlI, final float llllllllllllIllIIllIIllllIlllIIl, final float llllllllllllIllIIllIIllllIllllll, final float llllllllllllIllIIllIIllllIllIlll, final Color llllllllllllIllIIllIIllllIllIllI) {
        if (lIIllIIIIIIlIllI(this.frames.size())) {
            return;
        }
        if (lIIllIIIIIIllIII(this.autoUpdate ? 1 : 0)) {
            final long llllllllllllIllIIllIIlllllIIIlII = this.getTime();
            long llllllllllllIllIIllIIlllllIIIIll = llllllllllllIllIIllIIlllllIIIlII - this.lastUpdate;
            if (lIIllIIIIIIllIII(this.firstUpdate ? 1 : 0)) {
                llllllllllllIllIIllIIlllllIIIIll = 0L;
                this.firstUpdate = (Animation.llIllIlIlllIll[2] != 0);
            }
            this.lastUpdate = llllllllllllIllIIllIIlllllIIIlII;
            this.nextFrame(llllllllllllIllIIllIIlllllIIIIll);
        }
        final Frame llllllllllllIllIIllIIllllIllllII = this.frames.get(this.currentFrame);
        llllllllllllIllIIllIIllllIllllII.image.draw(llllllllllllIllIIllIIllllIlllIlI, llllllllllllIllIIllIIllllIlllIIl, llllllllllllIllIIllIIllllIllllll, llllllllllllIllIIllIIllllIllIlll, llllllllllllIllIIllIIllllIllIllI);
    }
    
    @Deprecated
    public void updateNoDraw() {
        if (lIIllIIIIIIllIII(this.autoUpdate ? 1 : 0)) {
            final long llllllllllllIllIIllIIlllIlllIIlI = this.getTime();
            long llllllllllllIllIIllIIlllIlllIIIl = llllllllllllIllIIllIIlllIlllIIlI - this.lastUpdate;
            if (lIIllIIIIIIllIII(this.firstUpdate ? 1 : 0)) {
                llllllllllllIllIIllIIlllIlllIIIl = 0L;
                this.firstUpdate = (Animation.llIllIlIlllIll[2] != 0);
            }
            this.lastUpdate = llllllllllllIllIIllIIlllIlllIIlI;
            this.nextFrame(llllllllllllIllIIllIIlllIlllIIIl);
        }
    }
    
    private long getTime() {
        return Sys.getTime() * 1000L / Sys.getTimerResolution();
    }
    
    private static void lIIllIIIIIIIlllI() {
        (llIllIlIlllIII = new String[Animation.llIllIlIlllIll[11]])[Animation.llIllIlIlllIll[2]] = lIIllIIIIIIIlIll("Ko7/sxRjcj+eA24DLabVMeNmbws55D+m2yVzyhirx16t9pk94qZWjg==", "FXgUW");
        Animation.llIllIlIlllIII[Animation.llIllIlIlllIll[0]] = lIIllIIIIIIIllII("LT8ZKyMNNU8uOhYwGyMgCmtP", "dQoJO");
        Animation.llIllIlIlllIII[Animation.llIllIlIlllIll[4]] = lIIllIIIIIIIllIl("lx/yLQTKG5/BhASpbMfybdI4aNpturTO", "QtOLt");
        Animation.llIllIlIlllIII[Animation.llIllIlIlllIll[5]] = lIIllIIIIIIIllII("PB8DJD4cFVUhJwcQASw9G0tV", "uquER");
        Animation.llIllIlIlllIII[Animation.llIllIlIlllIll[6]] = lIIllIIIIIIIllIl("nt5R5VCK+S7bvut6ia0NBdF/EoRK41wz", "GAkny");
        Animation.llIllIlIlllIII[Animation.llIllIlIlllIll[7]] = lIIllIIIIIIIlIll("NxNCIpPSDbu0FKrMl0PDSQ==", "IcFJg");
        Animation.llIllIlIlllIII[Animation.llIllIlIlllIll[8]] = lIIllIIIIIIIlIll("88Flln2fWHY=", "VIXkl");
        Animation.llIllIlIlllIII[Animation.llIllIlIlllIll[9]] = lIIllIIIIIIIllIl("FuNzJZGia7s=", "JPbWu");
        Animation.llIllIlIlllIII[Animation.llIllIlIlllIll[10]] = lIIllIIIIIIIllIl("g5BC/1wUsnU=", "Woeds");
    }
    
    private static boolean lIIllIIIIIIlIlII(final int llllllllllllIllIIllIIllIllIIllII, final int llllllllllllIllIIllIIllIllIIlIll) {
        return llllllllllllIllIIllIIllIllIIllII < llllllllllllIllIIllIIllIllIIlIll;
    }
    
    private static boolean lIIllIIIIIIllllI(final int llllllllllllIllIIllIIllIlIllllll) {
        return llllllllllllIllIIllIIllIlIllllll <= 0;
    }
    
    public void setSpeed(final float llllllllllllIllIIllIlIIIIIIIlIIl) {
        if (lIIllIIIIIIllIlI(lIIllIIIIIIllIIl(llllllllllllIllIIllIlIIIIIIIlIIl, 0.0f))) {
            this.nextChange = (long)(this.nextChange * this.speed / llllllllllllIllIIllIlIIIIIIIlIIl);
            this.speed = llllllllllllIllIIllIlIIIIIIIlIIl;
        }
    }
    
    public float getSpeed() {
        return this.speed;
    }
    
    private static boolean lIIllIIIIIIlIlIl(final int llllllllllllIllIIllIIllIlIlllIlI, final int llllllllllllIllIIllIIllIlIlllIIl) {
        return llllllllllllIllIIllIIllIlIlllIlI != llllllllllllIllIIllIIllIlIlllIIl;
    }
    
    public int getFrame() {
        return this.currentFrame;
    }
    
    public Image getCurrentFrame() {
        final Frame llllllllllllIllIIllIIlllIlIIlllI = this.frames.get(this.currentFrame);
        return llllllllllllIllIIllIIlllIlIIlllI.image;
    }
    
    public int getWidth() {
        return this.frames.get(this.currentFrame).image.getWidth();
    }
    
    public void setAutoUpdate(final boolean llllllllllllIllIIllIlIIIIIIllIlI) {
        this.autoUpdate = llllllllllllIllIIllIlIIIIIIllIlI;
    }
    
    private static void lIIllIIIIIIlIIll() {
        (llIllIlIlllIll = new int[12])[0] = " ".length();
        Animation.llIllIlIlllIll[1] = -" ".length();
        Animation.llIllIlIlllIll[2] = ((92 + 23 + 54 + 2 ^ 38 + 10 + 7 + 96) & (0x69 ^ 0xC ^ (0x29 ^ 0x70) ^ -" ".length()));
        Animation.llIllIlIlllIll[3] = -"  ".length();
        Animation.llIllIlIlllIll[4] = "  ".length();
        Animation.llIllIlIlllIll[5] = "   ".length();
        Animation.llIllIlIlllIll[6] = (0xB9 ^ 0x8E ^ (0xB0 ^ 0x83));
        Animation.llIllIlIlllIll[7] = (0x15 ^ 0x10);
        Animation.llIllIlIlllIll[8] = (72 + 10 - 41 + 98 ^ 22 + 55 + 5 + 59);
        Animation.llIllIlIlllIll[9] = (0x6F ^ 0x68);
        Animation.llIllIlIlllIll[10] = (110 + 124 - 71 + 9 ^ 72 + 137 - 60 + 15);
        Animation.llIllIlIlllIll[11] = (0x73 ^ 0x7A);
    }
    
    private static String lIIllIIIIIIIllIl(final String llllllllllllIllIIllIIllIllIlllII, final String llllllllllllIllIIllIIllIllIllIIl) {
        try {
            final SecretKeySpec llllllllllllIllIIllIIllIllIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllIIllIllIllIIl.getBytes(StandardCharsets.UTF_8)), Animation.llIllIlIlllIll[10]), "DES");
            final Cipher llllllllllllIllIIllIIllIllIllllI = Cipher.getInstance("DES");
            llllllllllllIllIIllIIllIllIllllI.init(Animation.llIllIlIlllIll[4], llllllllllllIllIIllIIllIllIlllll);
            return new String(llllllllllllIllIIllIIllIllIllllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllIIllIllIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllIIllIllIlllIl) {
            llllllllllllIllIIllIIllIllIlllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllIIIIIIlllll(final int llllllllllllIllIIllIIllIllIlIIII, final int llllllllllllIllIIllIIllIllIIllll) {
        return llllllllllllIllIIllIIllIllIlIIII >= llllllllllllIllIIllIIllIllIIllll;
    }
    
    public void renderInUse(final int llllllllllllIllIIllIIllllIlIIlll, final int llllllllllllIllIIllIIllllIlIlIlI) {
        if (lIIllIIIIIIlIllI(this.frames.size())) {
            return;
        }
        if (lIIllIIIIIIllIII(this.autoUpdate ? 1 : 0)) {
            final long llllllllllllIllIIllIIllllIlIlllI = this.getTime();
            long llllllllllllIllIIllIIllllIlIllIl = llllllllllllIllIIllIIllllIlIlllI - this.lastUpdate;
            if (lIIllIIIIIIllIII(this.firstUpdate ? 1 : 0)) {
                llllllllllllIllIIllIIllllIlIllIl = 0L;
                this.firstUpdate = (Animation.llIllIlIlllIll[2] != 0);
            }
            this.lastUpdate = llllllllllllIllIIllIIllllIlIlllI;
            this.nextFrame(llllllllllllIllIIllIIllllIlIllIl);
        }
        final Frame llllllllllllIllIIllIIllllIlIlIIl = this.frames.get(this.currentFrame);
        this.spriteSheet.renderInUse(llllllllllllIllIIllIIllllIlIIlll, llllllllllllIllIIllIIllllIlIlIlI, llllllllllllIllIIllIIllllIlIlIIl.x, llllllllllllIllIIllIIllllIlIlIIl.y);
    }
    
    public void addFrame(final Image llllllllllllIllIIllIIllllllllIII, final int llllllllllllIllIIllIIlllllllIlII) {
        if (lIIllIIIIIIlIllI(llllllllllllIllIIllIIlllllllIlII)) {
            Log.error(String.valueOf(new StringBuilder().append(Animation.llIllIlIlllIII[Animation.llIllIlIlllIll[5]]).append(llllllllllllIllIIllIIlllllllIlII)));
            throw new RuntimeException(String.valueOf(new StringBuilder().append(Animation.llIllIlIlllIII[Animation.llIllIlIlllIll[6]]).append(llllllllllllIllIIllIIlllllllIlII)));
        }
        if (lIIllIIIIIIllIII(this.frames.isEmpty() ? 1 : 0)) {
            this.nextChange = (int)(llllllllllllIllIIllIIlllllllIlII / this.speed);
        }
        this.frames.add(new Frame(llllllllllllIllIIllIIllllllllIII, llllllllllllIllIIllIIlllllllIlII));
        "".length();
        this.currentFrame = Animation.llIllIlIlllIll[2];
    }
    
    private static boolean lIIllIIIIIIlIllI(final int llllllllllllIllIIllIIllIllIIIIll) {
        return llllllllllllIllIIllIIllIllIIIIll == 0;
    }
    
    public Animation(final SpriteSheet llllllllllllIllIIllIlIIIIlIIlIII, final int llllllllllllIllIIllIlIIIIlIIIlll, final int llllllllllllIllIIllIlIIIIlIIIllI, final int llllllllllllIllIIllIlIIIIlIIIlIl, final int llllllllllllIllIIllIlIIIIlIIIlII, final boolean llllllllllllIllIIllIlIIIIlIIIIll, final int llllllllllllIllIIllIlIIIIlIIlIll, final boolean llllllllllllIllIIllIlIIIIlIIlIlI) {
        this.frames = new ArrayList();
        this.currentFrame = Animation.llIllIlIlllIll[1];
        this.nextChange = 0L;
        this.stopped = (Animation.llIllIlIlllIll[2] != 0);
        this.speed = 1.0f;
        this.stopAt = Animation.llIllIlIlllIll[3];
        this.firstUpdate = (Animation.llIllIlIlllIll[0] != 0);
        this.autoUpdate = (Animation.llIllIlIlllIll[0] != 0);
        this.direction = Animation.llIllIlIlllIll[0];
        this.loop = (Animation.llIllIlIlllIll[0] != 0);
        this.spriteSheet = null;
        this.autoUpdate = llllllllllllIllIIllIlIIIIlIIlIlI;
        if (lIIllIIIIIIlIllI(llllllllllllIllIIllIlIIIIlIIIIll ? 1 : 0)) {
            int llllllllllllIllIIllIlIIIIlIlIlIl = llllllllllllIllIIllIlIIIIlIIIlll;
            while (lIIllIIIIIIlIlll(llllllllllllIllIIllIlIIIIlIlIlIl, llllllllllllIllIIllIlIIIIlIIIlIl)) {
                int llllllllllllIllIIllIlIIIIlIlIllI = llllllllllllIllIIllIlIIIIlIIIllI;
                while (lIIllIIIIIIlIlll(llllllllllllIllIIllIlIIIIlIlIllI, llllllllllllIllIIllIlIIIIlIIIlII)) {
                    this.addFrame(llllllllllllIllIIllIlIIIIlIIlIII.getSprite(llllllllllllIllIIllIlIIIIlIlIlIl, llllllllllllIllIIllIlIIIIlIlIllI), llllllllllllIllIIllIlIIIIlIIlIll);
                    ++llllllllllllIllIIllIlIIIIlIlIllI;
                    "".length();
                    if (-"  ".length() > 0) {
                        throw null;
                    }
                }
                ++llllllllllllIllIIllIlIIIIlIlIlIl;
                "".length();
                if (-" ".length() != -" ".length()) {
                    throw null;
                }
            }
            "".length();
            if ("  ".length() == 0) {
                throw null;
            }
        }
        else {
            int llllllllllllIllIIllIlIIIIlIlIIll = llllllllllllIllIIllIlIIIIlIIIllI;
            while (lIIllIIIIIIlIlll(llllllllllllIllIIllIlIIIIlIlIIll, llllllllllllIllIIllIlIIIIlIIIlII)) {
                int llllllllllllIllIIllIlIIIIlIlIlII = llllllllllllIllIIllIlIIIIlIIIlll;
                while (lIIllIIIIIIlIlll(llllllllllllIllIIllIlIIIIlIlIlII, llllllllllllIllIIllIlIIIIlIIIlIl)) {
                    this.addFrame(llllllllllllIllIIllIlIIIIlIIlIII.getSprite(llllllllllllIllIIllIlIIIIlIlIlII, llllllllllllIllIIllIlIIIIlIlIIll), llllllllllllIllIIllIlIIIIlIIlIll);
                    ++llllllllllllIllIIllIlIIIIlIlIlII;
                    "".length();
                    if ("  ".length() < ((0x78 ^ 0x4A) & ~(0x99 ^ 0xAB))) {
                        throw null;
                    }
                }
                ++llllllllllllIllIIllIlIIIIlIlIIll;
                "".length();
                if (((0x66 ^ 0x2B) & ~(0xF2 ^ 0xBF)) > "  ".length()) {
                    throw null;
                }
            }
        }
    }
    
    public int[] getDurations() {
        final int[] llllllllllllIllIIllIIlllIIlIIIIl = new int[this.frames.size()];
        int llllllllllllIllIIllIIlllIIlIIIll = Animation.llIllIlIlllIll[2];
        while (lIIllIIIIIIlIlII(llllllllllllIllIIllIIlllIIlIIIll, this.frames.size())) {
            llllllllllllIllIIllIIlllIIlIIIIl[llllllllllllIllIIllIIlllIIlIIIll] = this.getDuration(llllllllllllIllIIllIIlllIIlIIIll);
            ++llllllllllllIllIIllIIlllIIlIIIll;
            "".length();
            if ((0x23 ^ 0x3E ^ (0x82 ^ 0x9A)) == 0x0) {
                return null;
            }
        }
        return llllllllllllIllIIllIIlllIIlIIIIl;
    }
    
    public Animation copy() {
        final Animation llllllllllllIllIIllIIlllIIIIlllI = new Animation();
        llllllllllllIllIIllIIlllIIIIlllI.spriteSheet = this.spriteSheet;
        llllllllllllIllIIllIIlllIIIIlllI.frames = this.frames;
        llllllllllllIllIIllIIlllIIIIlllI.autoUpdate = this.autoUpdate;
        llllllllllllIllIIllIIlllIIIIlllI.direction = this.direction;
        llllllllllllIllIIllIIlllIIIIlllI.loop = this.loop;
        llllllllllllIllIIllIIlllIIIIlllI.pingPong = this.pingPong;
        llllllllllllIllIIllIIlllIIIIlllI.speed = this.speed;
        return llllllllllllIllIIllIIlllIIIIlllI;
    }
    
    public Animation(final SpriteSheet llllllllllllIllIIllIlIIIIIlIllll, final int[] llllllllllllIllIIllIlIIIIIlIlllI, final int[] llllllllllllIllIIllIlIIIIIllIIll) {
        this.frames = new ArrayList();
        this.currentFrame = Animation.llIllIlIlllIll[1];
        this.nextChange = 0L;
        this.stopped = (Animation.llIllIlIlllIll[2] != 0);
        this.speed = 1.0f;
        this.stopAt = Animation.llIllIlIlllIll[3];
        this.firstUpdate = (Animation.llIllIlIlllIll[0] != 0);
        this.autoUpdate = (Animation.llIllIlIlllIll[0] != 0);
        this.direction = Animation.llIllIlIlllIll[0];
        this.loop = (Animation.llIllIlIlllIll[0] != 0);
        this.spriteSheet = null;
        this.spriteSheet = llllllllllllIllIIllIlIIIIIlIllll;
        int llllllllllllIllIIllIlIIIIIllIIlI = Animation.llIllIlIlllIll[1];
        int llllllllllllIllIIllIlIIIIIllIIIl = Animation.llIllIlIlllIll[1];
        int llllllllllllIllIIllIlIIIIIllIlll = Animation.llIllIlIlllIll[2];
        while (lIIllIIIIIIlIlII(llllllllllllIllIIllIlIIIIIllIlll, llllllllllllIllIIllIlIIIIIlIlllI.length / Animation.llIllIlIlllIll[4])) {
            llllllllllllIllIIllIlIIIIIllIIlI = llllllllllllIllIIllIlIIIIIlIlllI[llllllllllllIllIIllIlIIIIIllIlll * Animation.llIllIlIlllIll[4]];
            llllllllllllIllIIllIlIIIIIllIIIl = llllllllllllIllIIllIlIIIIIlIlllI[llllllllllllIllIIllIlIIIIIllIlll * Animation.llIllIlIlllIll[4] + Animation.llIllIlIlllIll[0]];
            this.addFrame(llllllllllllIllIIllIlIIIIIllIIll[llllllllllllIllIIllIlIIIIIllIlll], llllllllllllIllIIllIlIIIIIllIIlI, llllllllllllIllIIllIlIIIIIllIIIl);
            ++llllllllllllIllIIllIlIIIIIllIlll;
            "".length();
            if ((0x87 ^ 0x83) < "   ".length()) {
                throw null;
            }
        }
    }
    
    public void restart() {
        if (lIIllIIIIIIlIllI(this.frames.size())) {
            return;
        }
        this.stopped = (Animation.llIllIlIlllIll[2] != 0);
        this.currentFrame = Animation.llIllIlIlllIll[2];
        this.nextChange = (int)(this.frames.get(Animation.llIllIlIlllIll[2]).duration / this.speed);
        this.firstUpdate = (Animation.llIllIlIlllIll[0] != 0);
        this.lastUpdate = 0L;
    }
    
    private void nextFrame(final long llllllllllllIllIIllIIlllIlIIIlII) {
        if (lIIllIIIIIIllIII(this.stopped ? 1 : 0)) {
            return;
        }
        if (lIIllIIIIIIlIllI(this.frames.size())) {
            return;
        }
        this.nextChange -= llllllllllllIllIIllIIlllIlIIIlII;
        while (lIIllIIIIIIlllII(lIIllIIIIIIllIll(this.nextChange, 0L)) && lIIllIIIIIIlIllI(this.stopped ? 1 : 0)) {
            if (lIIllIIIIIIlllIl(this.currentFrame, this.stopAt)) {
                this.stopped = (Animation.llIllIlIlllIll[0] != 0);
                "".length();
                if (((0x10 ^ 0x4F ^ (0xE8 ^ 0xB3)) & (0x85 ^ 0x91 ^ (0x3A ^ 0x2A) ^ -" ".length())) != 0x0) {
                    return;
                }
                break;
            }
            else if (lIIllIIIIIIlllIl(this.currentFrame, this.frames.size() - Animation.llIllIlIlllIll[0]) && lIIllIIIIIIlIllI(this.loop ? 1 : 0) && lIIllIIIIIIlIllI(this.pingPong ? 1 : 0)) {
                this.stopped = (Animation.llIllIlIlllIll[0] != 0);
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            else {
                this.currentFrame = (this.currentFrame + this.direction) % this.frames.size();
                if (lIIllIIIIIIllIII(this.pingPong ? 1 : 0)) {
                    if (lIIllIIIIIIllllI(this.currentFrame)) {
                        this.currentFrame = Animation.llIllIlIlllIll[2];
                        this.direction = Animation.llIllIlIlllIll[0];
                        if (lIIllIIIIIIlIllI(this.loop ? 1 : 0)) {
                            this.stopped = (Animation.llIllIlIlllIll[0] != 0);
                            "".length();
                            if ("  ".length() < " ".length()) {
                                return;
                            }
                            break;
                        }
                    }
                    else if (lIIllIIIIIIlllll(this.currentFrame, this.frames.size() - Animation.llIllIlIlllIll[0])) {
                        this.currentFrame = this.frames.size() - Animation.llIllIlIlllIll[0];
                        this.direction = Animation.llIllIlIlllIll[1];
                    }
                }
                final int llllllllllllIllIIllIIlllIlIIlIII = (int)(this.frames.get(this.currentFrame).duration / this.speed);
                this.nextChange += llllllllllllIllIIllIIlllIlIIlIII;
                "".length();
                if (" ".length() == -" ".length()) {
                    return;
                }
                continue;
            }
        }
    }
    
    public Animation(final Image[] llllllllllllIllIIllIlIIIIlllllIl, final int llllllllllllIllIIllIlIIIIlllllII, final boolean llllllllllllIllIIllIlIIIIlllllll) {
        this.frames = new ArrayList();
        this.currentFrame = Animation.llIllIlIlllIll[1];
        this.nextChange = 0L;
        this.stopped = (Animation.llIllIlIlllIll[2] != 0);
        this.speed = 1.0f;
        this.stopAt = Animation.llIllIlIlllIll[3];
        this.firstUpdate = (Animation.llIllIlIlllIll[0] != 0);
        this.autoUpdate = (Animation.llIllIlIlllIll[0] != 0);
        this.direction = Animation.llIllIlIlllIll[0];
        this.loop = (Animation.llIllIlIlllIll[0] != 0);
        this.spriteSheet = null;
        int llllllllllllIllIIllIlIIIlIIIIIll = Animation.llIllIlIlllIll[2];
        while (lIIllIIIIIIlIlII(llllllllllllIllIIllIlIIIlIIIIIll, llllllllllllIllIIllIlIIIIlllllIl.length)) {
            this.addFrame(llllllllllllIllIIllIlIIIIlllllIl[llllllllllllIllIIllIlIIIlIIIIIll], llllllllllllIllIIllIlIIIIlllllII);
            ++llllllllllllIllIIllIlIIIlIIIIIll;
            "".length();
            if ((39 + 111 - 9 + 13 ^ 123 + 41 - 94 + 89) <= 0) {
                throw null;
            }
        }
        this.currentFrame = Animation.llIllIlIlllIll[2];
        this.autoUpdate = llllllllllllIllIIllIlIIIIlllllll;
    }
    
    public Animation(final Image[] llllllllllllIllIIllIlIIIlIIllIIl, final int llllllllllllIllIIllIlIIIlIIllIII) {
        this(llllllllllllIllIIllIlIIIlIIllIIl, llllllllllllIllIIllIlIIIlIIllIII, (boolean)(Animation.llIllIlIlllIll[0] != 0));
    }
    
    public int getDuration(final int llllllllllllIllIIllIIlllIIllIIII) {
        return this.frames.get(llllllllllllIllIIllIIlllIIllIIII).duration;
    }
    
    public void drawFlash(final float llllllllllllIllIIllIIllllIIlIIlI, final float llllllllllllIllIIllIIllllIIlIIIl, final float llllllllllllIllIIllIIllllIIlIlIl, final float llllllllllllIllIIllIIllllIIIllll) {
        this.drawFlash(llllllllllllIllIIllIIllllIIlIIlI, llllllllllllIllIIllIIllllIIlIIIl, llllllllllllIllIIllIIllllIIlIlIl, llllllllllllIllIIllIIllllIIIllll, Color.white);
    }
    
    public void stop() {
        if (lIIllIIIIIIlIllI(this.frames.size())) {
            return;
        }
        this.timeLeft = this.nextChange;
        this.stopped = (Animation.llIllIlIlllIll[0] != 0);
    }
    
    public Animation(final Image[] llllllllllllIllIIllIlIIIlIIlIIll, final int[] llllllllllllIllIIllIlIIIlIIlIIlI) {
        this(llllllllllllIllIIllIlIIIlIIlIIll, llllllllllllIllIIllIlIIIlIIlIIlI, (boolean)(Animation.llIllIlIlllIll[0] != 0));
    }
    
    private static String lIIllIIIIIIIllII(String llllllllllllIllIIllIIllIlllIllII, final String llllllllllllIllIIllIIllIllllIIII) {
        llllllllllllIllIIllIIllIlllIllII = new String(Base64.getDecoder().decode(llllllllllllIllIIllIIllIlllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIllIIllIlllIllll = new StringBuilder();
        final char[] llllllllllllIllIIllIIllIlllIlllI = llllllllllllIllIIllIIllIllllIIII.toCharArray();
        int llllllllllllIllIIllIIllIlllIllIl = Animation.llIllIlIlllIll[2];
        final boolean llllllllllllIllIIllIIllIlllIIlll = (Object)llllllllllllIllIIllIIllIlllIllII.toCharArray();
        final char llllllllllllIllIIllIIllIlllIIllI = (char)llllllllllllIllIIllIIllIlllIIlll.length;
        float llllllllllllIllIIllIIllIlllIIlIl = Animation.llIllIlIlllIll[2];
        while (lIIllIIIIIIlIlII((int)llllllllllllIllIIllIIllIlllIIlIl, llllllllllllIllIIllIIllIlllIIllI)) {
            final char llllllllllllIllIIllIIllIllllIIlI = llllllllllllIllIIllIIllIlllIIlll[llllllllllllIllIIllIIllIlllIIlIl];
            llllllllllllIllIIllIIllIlllIllll.append((char)(llllllllllllIllIIllIIllIllllIIlI ^ llllllllllllIllIIllIIllIlllIlllI[llllllllllllIllIIllIIllIlllIllIl % llllllllllllIllIIllIIllIlllIlllI.length]));
            "".length();
            ++llllllllllllIllIIllIIllIlllIllIl;
            ++llllllllllllIllIIllIIllIlllIIlIl;
            "".length();
            if (((0x7B ^ 0x72) & ~(0x9D ^ 0x94)) >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIllIIllIlllIllll);
    }
    
    public void stopAt(final int llllllllllllIllIIllIIlllIIlllIII) {
        this.stopAt = llllllllllllIllIIllIIlllIIlllIII;
    }
    
    private static boolean lIIllIIIIIIllIII(final int llllllllllllIllIIllIIllIllIIIlIl) {
        return llllllllllllIllIIllIIllIllIIIlIl != 0;
    }
    
    static {
        lIIllIIIIIIlIIll();
        lIIllIIIIIIIlllI();
    }
    
    public void draw(final float llllllllllllIllIIllIIllllllIllII, final float llllllllllllIllIIllIIllllllIlIll) {
        this.draw(llllllllllllIllIIllIIllllllIllII, llllllllllllIllIIllIIllllllIlIll, (float)this.getWidth(), (float)this.getHeight());
    }
    
    public Image getImage(final int llllllllllllIllIIllIIlllIlIllIIl) {
        final Frame llllllllllllIllIIllIIlllIlIllIII = this.frames.get(llllllllllllIllIIllIIlllIlIllIIl);
        return llllllllllllIllIIllIIlllIlIllIII.image;
    }
    
    public void setPingPong(final boolean llllllllllllIllIIllIlIIIIIIlIlII) {
        this.pingPong = llllllllllllIllIIllIlIIIIIIlIlII;
    }
    
    public void update(final long llllllllllllIllIIllIIlllIllIlIIl) {
        this.nextFrame(llllllllllllIllIIllIIlllIllIlIIl);
    }
    
    public void drawFlash(final float llllllllllllIllIIllIIllllIIIIIll, final float llllllllllllIllIIllIIllllIIIIIlI, final float llllllllllllIllIIllIIlllIllllIlI, final float llllllllllllIllIIllIIllllIIIIIII, final Color llllllllllllIllIIllIIlllIllllIII) {
        if (lIIllIIIIIIlIllI(this.frames.size())) {
            return;
        }
        if (lIIllIIIIIIllIII(this.autoUpdate ? 1 : 0)) {
            final long llllllllllllIllIIllIIllllIIIIllI = this.getTime();
            long llllllllllllIllIIllIIllllIIIIlIl = llllllllllllIllIIllIIllllIIIIllI - this.lastUpdate;
            if (lIIllIIIIIIllIII(this.firstUpdate ? 1 : 0)) {
                llllllllllllIllIIllIIllllIIIIlIl = 0L;
                this.firstUpdate = (Animation.llIllIlIlllIll[2] != 0);
            }
            this.lastUpdate = llllllllllllIllIIllIIllllIIIIllI;
            this.nextFrame(llllllllllllIllIIllIIllllIIIIlIl);
        }
        final Frame llllllllllllIllIIllIIlllIllllllI = this.frames.get(this.currentFrame);
        llllllllllllIllIIllIIlllIllllllI.image.drawFlash(llllllllllllIllIIllIIllllIIIIIll, llllllllllllIllIIllIIllllIIIIIlI, llllllllllllIllIIllIIlllIllllIlI, llllllllllllIllIIllIIllllIIIIIII, llllllllllllIllIIllIIlllIllllIII);
    }
    
    public void setDuration(final int llllllllllllIllIIllIIlllIIlIlIll, final int llllllllllllIllIIllIIlllIIlIIlll) {
        this.frames.get(llllllllllllIllIIllIIlllIIlIlIll).duration = llllllllllllIllIIllIIlllIIlIIlll;
    }
    
    public void addFrame(final int llllllllllllIllIIllIlIIIIIlIIlII, final int llllllllllllIllIIllIlIIIIIlIIIll, final int llllllllllllIllIIllIlIIIIIIllllI) {
        if (lIIllIIIIIIlIllI(llllllllllllIllIIllIlIIIIIlIIlII)) {
            Log.error(String.valueOf(new StringBuilder().append(Animation.llIllIlIlllIII[Animation.llIllIlIlllIll[0]]).append(llllllllllllIllIIllIlIIIIIlIIlII)));
            throw new RuntimeException(String.valueOf(new StringBuilder().append(Animation.llIllIlIlllIII[Animation.llIllIlIlllIll[4]]).append(llllllllllllIllIIllIlIIIIIlIIlII)));
        }
        if (lIIllIIIIIIllIII(this.frames.isEmpty() ? 1 : 0)) {
            this.nextChange = (int)(llllllllllllIllIIllIlIIIIIlIIlII / this.speed);
        }
        this.frames.add(new Frame(llllllllllllIllIIllIlIIIIIlIIlII, llllllllllllIllIIllIlIIIIIlIIIll, llllllllllllIllIIllIlIIIIIIllllI));
        "".length();
        this.currentFrame = Animation.llIllIlIlllIll[2];
    }
    
    private static boolean lIIllIIIIIIlllIl(final int llllllllllllIllIIllIIllIllIlIlII, final int llllllllllllIllIIllIIllIllIlIIll) {
        return llllllllllllIllIIllIIllIllIlIlII == llllllllllllIllIIllIIllIllIlIIll;
    }
    
    public Animation(final boolean llllllllllllIllIIllIlIIIlIIIlIIl) {
        this.frames = new ArrayList();
        this.currentFrame = Animation.llIllIlIlllIll[1];
        this.nextChange = 0L;
        this.stopped = (Animation.llIllIlIlllIll[2] != 0);
        this.speed = 1.0f;
        this.stopAt = Animation.llIllIlIlllIll[3];
        this.firstUpdate = (Animation.llIllIlIlllIll[0] != 0);
        this.autoUpdate = (Animation.llIllIlIlllIll[0] != 0);
        this.direction = Animation.llIllIlIlllIll[0];
        this.loop = (Animation.llIllIlIlllIll[0] != 0);
        this.spriteSheet = null;
        this.currentFrame = Animation.llIllIlIlllIll[2];
        this.autoUpdate = llllllllllllIllIIllIlIIIlIIIlIIl;
    }
    
    private static int lIIllIIIIIIllIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public boolean isStopped() {
        return this.stopped;
    }
    
    @Override
    public String toString() {
        String llllllllllllIllIIllIIlllIIIlIllI = String.valueOf(new StringBuilder().append(Animation.llIllIlIlllIII[Animation.llIllIlIlllIll[7]]).append(this.frames.size()).append(Animation.llIllIlIlllIII[Animation.llIllIlIlllIll[8]]));
        int llllllllllllIllIIllIIlllIIIllIII = Animation.llIllIlIlllIll[2];
        while (lIIllIIIIIIlIlII(llllllllllllIllIIllIIlllIIIllIII, this.frames.size())) {
            final Frame llllllllllllIllIIllIIlllIIIllIIl = this.frames.get(llllllllllllIllIIllIIlllIIIllIII);
            llllllllllllIllIIllIIlllIIIlIllI = String.valueOf(new StringBuilder().append(llllllllllllIllIIllIIlllIIIlIllI).append(llllllllllllIllIIllIIlllIIIllIIl.duration).append(Animation.llIllIlIlllIII[Animation.llIllIlIlllIll[9]]));
            ++llllllllllllIllIIllIIlllIIIllIII;
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        llllllllllllIllIIllIIlllIIIlIllI = String.valueOf(new StringBuilder().append(llllllllllllIllIIllIIlllIIIlIllI).append(Animation.llIllIlIlllIII[Animation.llIllIlIlllIll[10]]));
        return llllllllllllIllIIllIIlllIIIlIllI;
    }
    
    public void start() {
        if (lIIllIIIIIIlIllI(this.stopped ? 1 : 0)) {
            return;
        }
        if (lIIllIIIIIIlIllI(this.frames.size())) {
            return;
        }
        this.stopped = (Animation.llIllIlIlllIll[2] != 0);
        this.nextChange = this.timeLeft;
    }
    
    public int getHeight() {
        return this.frames.get(this.currentFrame).image.getHeight();
    }
    
    private static boolean lIIllIIIIIIllIlI(final int llllllllllllIllIIllIIllIlIllllIl) {
        return llllllllllllIllIIllIIllIlIllllIl > 0;
    }
    
    public int getFrameCount() {
        return this.frames.size();
    }
    
    public void draw(final float llllllllllllIllIIllIIlllllIlIlIl, final float llllllllllllIllIIllIIlllllIlIlII, final float llllllllllllIllIIllIIlllllIlIIll, final float llllllllllllIllIIllIIlllllIIllIl) {
        this.draw(llllllllllllIllIIllIIlllllIlIlIl, llllllllllllIllIIllIIlllllIlIlII, llllllllllllIllIIllIIlllllIlIIll, llllllllllllIllIIllIIlllllIIllIl, Color.white);
    }
    
    private static boolean lIIllIIIIIIlIlll(final int llllllllllllIllIIllIIllIllIIlIII, final int llllllllllllIllIIllIIllIllIIIlll) {
        return llllllllllllIllIIllIIllIllIIlIII <= llllllllllllIllIIllIIllIllIIIlll;
    }
    
    private static boolean lIIllIIIIIIlllII(final int llllllllllllIllIIllIIllIllIIIIIl) {
        return llllllllllllIllIIllIIllIllIIIIIl < 0;
    }
    
    public void setCurrentFrame(final int llllllllllllIllIIllIIlllIlIllllI) {
        this.currentFrame = llllllllllllIllIIllIIlllIlIllllI;
    }
    
    public void draw(final float llllllllllllIllIIllIIlllllIllllI, final float llllllllllllIllIIllIIlllllIlllIl, final Color llllllllllllIllIIllIIlllllIlllII) {
        this.draw(llllllllllllIllIIllIIlllllIllllI, llllllllllllIllIIllIIlllllIlllIl, (float)this.getWidth(), (float)this.getHeight(), llllllllllllIllIIllIIlllllIlllII);
    }
    
    public void draw() {
        this.draw(0.0f, 0.0f);
    }
    
    public void setLooping(final boolean llllllllllllIllIIllIIlllIIllllIl) {
        this.loop = llllllllllllIllIIllIIlllIIllllIl;
    }
    
    public Animation(final SpriteSheet llllllllllllIllIIllIlIIIIllIIIll, final int llllllllllllIllIIllIlIIIIllIIIlI) {
        this(llllllllllllIllIIllIlIIIIllIIIll, Animation.llIllIlIlllIll[2], Animation.llIllIlIlllIll[2], llllllllllllIllIIllIlIIIIllIIIll.getHorizontalCount() - Animation.llIllIlIlllIll[0], llllllllllllIllIIllIlIIIIllIIIll.getVerticalCount() - Animation.llIllIlIlllIll[0], (boolean)(Animation.llIllIlIlllIll[0] != 0), llllllllllllIllIIllIlIIIIllIIIlI, (boolean)(Animation.llIllIlIlllIll[0] != 0));
    }
    
    public Animation() {
        this((boolean)(Animation.llIllIlIlllIll[0] != 0));
    }
    
    private class Frame
    {
        public /* synthetic */ int x;
        public /* synthetic */ Image image;
        public /* synthetic */ int duration;
        private static final /* synthetic */ int[] lIIIlIllIllIIl;
        public /* synthetic */ int y;
        
        private static void llIIIIIllllIlIl() {
            (lIIIlIllIllIIl = new int[1])[0] = -" ".length();
        }
        
        static {
            llIIIIIllllIlIl();
        }
        
        public Frame(final int lllllllllllllIlIIIIlIlIlIIlIIIll, final int lllllllllllllIlIIIIlIlIlIIlIIlll, final int lllllllllllllIlIIIIlIlIlIIlIIllI) {
            this.x = Frame.lIIIlIllIllIIl[0];
            this.y = Frame.lIIIlIllIllIIl[0];
            this.image = Animation.this.spriteSheet.getSubImage(lllllllllllllIlIIIIlIlIlIIlIIlll, lllllllllllllIlIIIIlIlIlIIlIIllI);
            this.duration = lllllllllllllIlIIIIlIlIlIIlIIIll;
            this.x = lllllllllllllIlIIIIlIlIlIIlIIlll;
            this.y = lllllllllllllIlIIIIlIlIlIIlIIllI;
        }
        
        public Frame(final Image lllllllllllllIlIIIIlIlIlIIllIIII, final int lllllllllllllIlIIIIlIlIlIIlIllll) {
            this.x = Frame.lIIIlIllIllIIl[0];
            this.y = Frame.lIIIlIllIllIIl[0];
            this.image = lllllllllllllIlIIIIlIlIlIIllIIII;
            this.duration = lllllllllllllIlIIIIlIlIlIIlIllll;
        }
    }
}
