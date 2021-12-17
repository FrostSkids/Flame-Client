// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import net.minecraft.client.Minecraft;

public class Timer
{
    private /* synthetic */ double timeSyncAdjustment;
    private /* synthetic */ long lastSyncSysClock;
    private /* synthetic */ long lastSyncHRClock;
    public /* synthetic */ float timerSpeed;
    /* synthetic */ float ticksPerSecond;
    private /* synthetic */ double lastHRTime;
    public /* synthetic */ float renderPartialTicks;
    public /* synthetic */ int elapsedTicks;
    public /* synthetic */ float elapsedPartialTicks;
    private /* synthetic */ long field_74285_i;
    private static final /* synthetic */ int[] lIllllIIllIlIl;
    
    static {
        lIIIIlIIIIllIlIl();
    }
    
    public void updateTimer() {
        final long llllllllllllIllllIlIlIlIIlIIIllI = Minecraft.getSystemTime();
        final long llllllllllllIllllIlIlIlIIlIIIlIl = llllllllllllIllllIlIlIlIIlIIIllI - this.lastSyncSysClock;
        final long llllllllllllIllllIlIlIlIIlIIIlII = System.nanoTime() / 1000000L;
        final double llllllllllllIllllIlIlIlIIlIIIIll = llllllllllllIllllIlIlIlIIlIIIlII / 1000.0;
        if (lIIIIlIIIIllIlll(lIIIIlIIIIllIllI(llllllllllllIllllIlIlIlIIlIIIlIl, 1000L)) && lIIIIlIIIIlllIII(lIIIIlIIIIllIllI(llllllllllllIllllIlIlIlIIlIIIlIl, 0L))) {
            this.field_74285_i += llllllllllllIllllIlIlIlIIlIIIlIl;
            if (lIIIIlIIIIlllIIl(lIIIIlIIIIllIllI(this.field_74285_i, 1000L))) {
                final long llllllllllllIllllIlIlIlIIlIIIIlI = llllllllllllIllllIlIlIlIIlIIIlII - this.lastSyncHRClock;
                final double llllllllllllIllllIlIlIlIIlIIIIIl = this.field_74285_i / (double)llllllllllllIllllIlIlIlIIlIIIIlI;
                this.timeSyncAdjustment += (llllllllllllIllllIlIlIlIIlIIIIIl - this.timeSyncAdjustment) * 0.20000000298023224;
                this.lastSyncHRClock = llllllllllllIllllIlIlIlIIlIIIlII;
                this.field_74285_i = 0L;
            }
            if (lIIIIlIIIIlllIlI(lIIIIlIIIIllIllI(this.field_74285_i, 0L))) {
                this.lastSyncHRClock = llllllllllllIllllIlIlIlIIlIIIlII;
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            }
        }
        else {
            this.lastHRTime = llllllllllllIllllIlIlIlIIlIIIIll;
        }
        this.lastSyncSysClock = llllllllllllIllllIlIlIlIIlIIIllI;
        double llllllllllllIllllIlIlIlIIlIIIIII = (llllllllllllIllllIlIlIlIIlIIIIll - this.lastHRTime) * this.timeSyncAdjustment;
        this.lastHRTime = llllllllllllIllllIlIlIlIIlIIIIll;
        llllllllllllIllllIlIlIlIIlIIIIII = MathHelper.clamp_double(llllllllllllIllllIlIlIlIIlIIIIII, 0.0, 1.0);
        this.elapsedPartialTicks += (float)(llllllllllllIllllIlIlIlIIlIIIIII * this.timerSpeed * this.ticksPerSecond);
        this.elapsedTicks = (int)this.elapsedPartialTicks;
        this.elapsedPartialTicks -= this.elapsedTicks;
        if (lIIIIlIIIIlllIll(this.elapsedTicks, Timer.lIllllIIllIlIl[0])) {
            this.elapsedTicks = Timer.lIllllIIllIlIl[0];
        }
        this.renderPartialTicks = this.elapsedPartialTicks;
    }
    
    private static boolean lIIIIlIIIIlllIll(final int llllllllllllIllllIlIlIlIIIllIllI, final int llllllllllllIllllIlIlIlIIIllIlIl) {
        return llllllllllllIllllIlIlIlIIIllIllI > llllllllllllIllllIlIlIlIIIllIlIl;
    }
    
    private static boolean lIIIIlIIIIlllIIl(final int llllllllllllIllllIlIlIlIIIlIllIl) {
        return llllllllllllIllllIlIlIlIIIlIllIl > 0;
    }
    
    private static int lIIIIlIIIIllIllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static void lIIIIlIIIIllIlIl() {
        (lIllllIIllIlIl = new int[1])[0] = (0x52 ^ 0x58);
    }
    
    private static boolean lIIIIlIIIIlllIlI(final int llllllllllllIllllIlIlIlIIIllIIIl) {
        return llllllllllllIllllIlIlIlIIIllIIIl < 0;
    }
    
    private static boolean lIIIIlIIIIllIlll(final int llllllllllllIllllIlIlIlIIIlIllll) {
        return llllllllllllIllllIlIlIlIIIlIllll <= 0;
    }
    
    public Timer(final float llllllllllllIllllIlIlIlIIlIlIIIl) {
        this.timerSpeed = 1.0f;
        this.timeSyncAdjustment = 1.0;
        this.ticksPerSecond = llllllllllllIllllIlIlIlIIlIlIIIl;
        this.lastSyncSysClock = Minecraft.getSystemTime();
        this.lastSyncHRClock = System.nanoTime() / 1000000L;
    }
    
    private static boolean lIIIIlIIIIlllIII(final int llllllllllllIllllIlIlIlIIIllIIll) {
        return llllllllllllIllllIlIlIlIIIllIIll >= 0;
    }
}
