// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity;

import net.minecraft.util.MathHelper;

public class EntityBodyHelper
{
    private /* synthetic */ int rotationTickCounter;
    private /* synthetic */ EntityLivingBase theLiving;
    private static final /* synthetic */ int[] lIlllIlIIIlllI;
    private /* synthetic */ float prevRenderYawHead;
    
    private static boolean lIIIIIlIlIIlIIII(final int llllllllllllIlllllIIIIllllIIIIIl) {
        return llllllllllllIlllllIIIIllllIIIIIl >= 0;
    }
    
    private float computeAngleWithBound(final float llllllllllllIlllllIIIIllllIIlIlI, final float llllllllllllIlllllIIIIllllIIllIl, final float llllllllllllIlllllIIIIllllIIlIII) {
        float llllllllllllIlllllIIIIllllIIlIll = MathHelper.wrapAngleTo180_float(llllllllllllIlllllIIIIllllIIlIlI - llllllllllllIlllllIIIIllllIIllIl);
        if (lIIIIIlIlIIIllll(lIIIIIlIlIIIllIl(llllllllllllIlllllIIIIllllIIlIll, -llllllllllllIlllllIIIIllllIIlIII))) {
            llllllllllllIlllllIIIIllllIIlIll = -llllllllllllIlllllIIIIllllIIlIII;
        }
        if (lIIIIIlIlIIlIIII(lIIIIIlIlIIIlllI(llllllllllllIlllllIIIIllllIIlIll, llllllllllllIlllllIIIIllllIIlIII))) {
            llllllllllllIlllllIIIIllllIIlIll = llllllllllllIlllllIIIIllllIIlIII;
        }
        return llllllllllllIlllllIIIIllllIIlIlI - llllllllllllIlllllIIIIllllIIlIll;
    }
    
    private static boolean lIIIIIlIlIIIlIll(final int llllllllllllIlllllIIIIlllIllllIl) {
        return llllllllllllIlllllIIIIlllIllllIl > 0;
    }
    
    public void updateRenderAngles() {
        final double llllllllllllIlllllIIIIllllIlllII = this.theLiving.posX - this.theLiving.prevPosX;
        final double llllllllllllIlllllIIIIllllIllIll = this.theLiving.posZ - this.theLiving.prevPosZ;
        if (lIIIIIlIlIIIlIll(lIIIIIlIlIIIlIIl(llllllllllllIlllllIIIIllllIlllII * llllllllllllIlllllIIIIllllIlllII + llllllllllllIlllllIIIIllllIllIll * llllllllllllIlllllIIIIllllIllIll, 2.500000277905201E-7))) {
            this.theLiving.renderYawOffset = this.theLiving.rotationYaw;
            this.theLiving.rotationYawHead = this.computeAngleWithBound(this.theLiving.renderYawOffset, this.theLiving.rotationYawHead, 75.0f);
            this.prevRenderYawHead = this.theLiving.rotationYawHead;
            this.rotationTickCounter = EntityBodyHelper.lIlllIlIIIlllI[0];
            "".length();
            if (" ".length() == "  ".length()) {
                return;
            }
        }
        else {
            float llllllllllllIlllllIIIIllllIllIlI = 75.0f;
            if (lIIIIIlIlIIIlIll(lIIIIIlIlIIIlIlI(Math.abs(this.theLiving.rotationYawHead - this.prevRenderYawHead), 15.0f))) {
                this.rotationTickCounter = EntityBodyHelper.lIlllIlIIIlllI[0];
                this.prevRenderYawHead = this.theLiving.rotationYawHead;
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            }
            else {
                this.rotationTickCounter += EntityBodyHelper.lIlllIlIIIlllI[1];
                final int llllllllllllIlllllIIIIllllIllIIl = EntityBodyHelper.lIlllIlIIIlllI[2];
                if (lIIIIIlIlIIIllII(this.rotationTickCounter, EntityBodyHelper.lIlllIlIIIlllI[2])) {
                    llllllllllllIlllllIIIIllllIllIlI = Math.max(1.0f - (this.rotationTickCounter - EntityBodyHelper.lIlllIlIIIlllI[2]) / 10.0f, 0.0f) * 75.0f;
                }
            }
            this.theLiving.renderYawOffset = this.computeAngleWithBound(this.theLiving.rotationYawHead, this.theLiving.renderYawOffset, llllllllllllIlllllIIIIllllIllIlI);
        }
    }
    
    private static void lIIIIIlIlIIIlIII() {
        (lIlllIlIIIlllI = new int[3])[0] = ((0xCA ^ 0x8F) & ~(0x26 ^ 0x63));
        EntityBodyHelper.lIlllIlIIIlllI[1] = " ".length();
        EntityBodyHelper.lIlllIlIIIlllI[2] = (0x72 ^ 0x78);
    }
    
    public EntityBodyHelper(final EntityLivingBase llllllllllllIlllllIIIIlllllIIIll) {
        this.theLiving = llllllllllllIlllllIIIIlllllIIIll;
    }
    
    private static boolean lIIIIIlIlIIIllII(final int llllllllllllIlllllIIIIllllIIIlII, final int llllllllllllIlllllIIIIllllIIIIll) {
        return llllllllllllIlllllIIIIllllIIIlII > llllllllllllIlllllIIIIllllIIIIll;
    }
    
    private static int lIIIIIlIlIIIlIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static int lIIIIIlIlIIIllIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIIIIIlIlIIIllll(final int llllllllllllIlllllIIIIlllIllllll) {
        return llllllllllllIlllllIIIIlllIllllll < 0;
    }
    
    private static int lIIIIIlIlIIIlllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    static {
        lIIIIIlIlIIIlIII();
    }
    
    private static int lIIIIIlIlIIIlIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
}
