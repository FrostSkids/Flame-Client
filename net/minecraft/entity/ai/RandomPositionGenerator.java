// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import java.util.Random;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.EntityCreature;
import net.minecraft.util.Vec3;

public class RandomPositionGenerator
{
    private static /* synthetic */ Vec3 staticVector;
    private static final /* synthetic */ int[] lIlllIIlIIIIlI;
    
    private static boolean lIIIIIIllIlIIIlI(final int llllllllllllIlllllIlIIlIllllllII, final int llllllllllllIlllllIlIIlIlllllIll) {
        return llllllllllllIlllllIlIIlIllllllII > llllllllllllIlllllIlIIlIlllllIll;
    }
    
    public static Vec3 findRandomTargetBlockTowards(final EntityCreature llllllllllllIlllllIlIIllIlIIllIl, final int llllllllllllIlllllIlIIllIlIIlIII, final int llllllllllllIlllllIlIIllIlIIlIll, final Vec3 llllllllllllIlllllIlIIllIlIIlIlI) {
        RandomPositionGenerator.staticVector = llllllllllllIlllllIlIIllIlIIlIlI.subtract(llllllllllllIlllllIlIIllIlIIllIl.posX, llllllllllllIlllllIlIIllIlIIllIl.posY, llllllllllllIlllllIlIIllIlIIllIl.posZ);
        return findRandomTargetBlock(llllllllllllIlllllIlIIllIlIIllIl, llllllllllllIlllllIlIIllIlIIlIII, llllllllllllIlllllIlIIllIlIIlIll, RandomPositionGenerator.staticVector);
    }
    
    private static int lIIIIIIllIIllIll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static Vec3 findRandomTargetBlock(final EntityCreature llllllllllllIlllllIlIIllIIIlIIll, final int llllllllllllIlllllIlIIllIIIlIIlI, final int llllllllllllIlllllIlIIllIIlIIllI, final Vec3 llllllllllllIlllllIlIIllIIIlIIII) {
        final Random llllllllllllIlllllIlIIllIIlIIlII = llllllllllllIlllllIlIIllIIIlIIll.getRNG();
        boolean llllllllllllIlllllIlIIllIIlIIIll = RandomPositionGenerator.lIlllIIlIIIIlI[0] != 0;
        int llllllllllllIlllllIlIIllIIlIIIlI = RandomPositionGenerator.lIlllIIlIIIIlI[0];
        int llllllllllllIlllllIlIIllIIlIIIIl = RandomPositionGenerator.lIlllIIlIIIIlI[0];
        int llllllllllllIlllllIlIIllIIlIIIII = RandomPositionGenerator.lIlllIIlIIIIlI[0];
        float llllllllllllIlllllIlIIllIIIlllll = -99999.0f;
        boolean llllllllllllIlllllIlIIllIIIlllIl;
        if (lIIIIIIllIIllllI(llllllllllllIlllllIlIIllIIIlIIll.hasHome() ? 1 : 0)) {
            final double llllllllllllIlllllIlIIllIIIlllII = llllllllllllIlllllIlIIllIIIlIIll.getHomePosition().distanceSq(MathHelper.floor_double(llllllllllllIlllllIlIIllIIIlIIll.posX), MathHelper.floor_double(llllllllllllIlllllIlIIllIIIlIIll.posY), MathHelper.floor_double(llllllllllllIlllllIlIIllIIIlIIll.posZ)) + 4.0;
            final double llllllllllllIlllllIlIIllIIIllIll = llllllllllllIlllllIlIIllIIIlIIll.getMaximumHomeDistance() + llllllllllllIlllllIlIIllIIIlIIlI;
            int n;
            if (lIIIIIIllIIlllll(lIIIIIIllIIllIll(llllllllllllIlllllIlIIllIIIlllII, llllllllllllIlllllIlIIllIIIllIll * llllllllllllIlllllIlIIllIIIllIll))) {
                n = RandomPositionGenerator.lIlllIIlIIIIlI[1];
                "".length();
                if (" ".length() <= 0) {
                    return null;
                }
            }
            else {
                n = RandomPositionGenerator.lIlllIIlIIIIlI[0];
            }
            final boolean llllllllllllIlllllIlIIllIIIllllI = n != 0;
            "".length();
            if ((0x26 ^ 0x22) <= -" ".length()) {
                return null;
            }
        }
        else {
            llllllllllllIlllllIlIIllIIIlllIl = (RandomPositionGenerator.lIlllIIlIIIIlI[0] != 0);
        }
        int llllllllllllIlllllIlIIllIIIllIlI = RandomPositionGenerator.lIlllIIlIIIIlI[0];
        "".length();
        if (" ".length() > "   ".length()) {
            return null;
        }
        while (!lIIIIIIllIlIIlII(llllllllllllIlllllIlIIllIIIllIlI, RandomPositionGenerator.lIlllIIlIIIIlI[3])) {
            int llllllllllllIlllllIlIIllIIIllIIl = llllllllllllIlllllIlIIllIIlIIlII.nextInt(RandomPositionGenerator.lIlllIIlIIIIlI[2] * llllllllllllIlllllIlIIllIIIlIIlI + RandomPositionGenerator.lIlllIIlIIIIlI[1]) - llllllllllllIlllllIlIIllIIIlIIlI;
            int llllllllllllIlllllIlIIllIIIllIII = llllllllllllIlllllIlIIllIIlIIlII.nextInt(RandomPositionGenerator.lIlllIIlIIIIlI[2] * llllllllllllIlllllIlIIllIIlIIllI + RandomPositionGenerator.lIlllIIlIIIIlI[1]) - llllllllllllIlllllIlIIllIIlIIllI;
            int llllllllllllIlllllIlIIllIIIlIlll = llllllllllllIlllllIlIIllIIlIIlII.nextInt(RandomPositionGenerator.lIlllIIlIIIIlI[2] * llllllllllllIlllllIlIIllIIIlIIlI + RandomPositionGenerator.lIlllIIlIIIIlI[1]) - llllllllllllIlllllIlIIllIIIlIIlI;
            if (!lIIIIIIllIlIIIII(llllllllllllIlllllIlIIllIIIlIIII) || lIIIIIIllIlIIIIl(lIIIIIIllIIlllII(llllllllllllIlllllIlIIllIIIllIIl * llllllllllllIlllllIlIIllIIIlIIII.xCoord + llllllllllllIlllllIlIIllIIIlIlll * llllllllllllIlllllIlIIllIIIlIIII.zCoord, 0.0))) {
                if (lIIIIIIllIIllllI(llllllllllllIlllllIlIIllIIIlIIll.hasHome() ? 1 : 0) && lIIIIIIllIlIIIlI(llllllllllllIlllllIlIIllIIIlIIlI, RandomPositionGenerator.lIlllIIlIIIIlI[1])) {
                    final BlockPos llllllllllllIlllllIlIIllIIIlIllI = llllllllllllIlllllIlIIllIIIlIIll.getHomePosition();
                    if (lIIIIIIllIlIIIll(lIIIIIIllIIlllII(llllllllllllIlllllIlIIllIIIlIIll.posX, llllllllllllIlllllIlIIllIIIlIllI.getX()))) {
                        llllllllllllIlllllIlIIllIIIllIIl -= llllllllllllIlllllIlIIllIIlIIlII.nextInt(llllllllllllIlllllIlIIllIIIlIIlI / RandomPositionGenerator.lIlllIIlIIIIlI[2]);
                        "".length();
                        if ((0x92 ^ 0xAA ^ (0x1C ^ 0x21)) == 0x0) {
                            return null;
                        }
                    }
                    else {
                        llllllllllllIlllllIlIIllIIIllIIl += llllllllllllIlllllIlIIllIIlIIlII.nextInt(llllllllllllIlllllIlIIllIIIlIIlI / RandomPositionGenerator.lIlllIIlIIIIlI[2]);
                    }
                    if (lIIIIIIllIlIIIll(lIIIIIIllIIlllII(llllllllllllIlllllIlIIllIIIlIIll.posZ, llllllllllllIlllllIlIIllIIIlIllI.getZ()))) {
                        llllllllllllIlllllIlIIllIIIlIlll -= llllllllllllIlllllIlIIllIIlIIlII.nextInt(llllllllllllIlllllIlIIllIIIlIIlI / RandomPositionGenerator.lIlllIIlIIIIlI[2]);
                        "".length();
                        if (-"   ".length() >= 0) {
                            return null;
                        }
                    }
                    else {
                        llllllllllllIlllllIlIIllIIIlIlll += llllllllllllIlllllIlIIllIIlIIlII.nextInt(llllllllllllIlllllIlIIllIIIlIIlI / RandomPositionGenerator.lIlllIIlIIIIlI[2]);
                    }
                }
                llllllllllllIlllllIlIIllIIIllIIl += MathHelper.floor_double(llllllllllllIlllllIlIIllIIIlIIll.posX);
                llllllllllllIlllllIlIIllIIIllIII += MathHelper.floor_double(llllllllllllIlllllIlIIllIIIlIIll.posY);
                llllllllllllIlllllIlIIllIIIlIlll += MathHelper.floor_double(llllllllllllIlllllIlIIllIIIlIIll.posZ);
                final BlockPos llllllllllllIlllllIlIIllIIIlIlIl = new BlockPos(llllllllllllIlllllIlIIllIIIllIIl, llllllllllllIlllllIlIIllIIIllIII, llllllllllllIlllllIlIIllIIIlIlll);
                if (!lIIIIIIllIIllllI(llllllllllllIlllllIlIIllIIIlllIl ? 1 : 0) || lIIIIIIllIIllllI(llllllllllllIlllllIlIIllIIIlIIll.isWithinHomeDistanceFromPosition(llllllllllllIlllllIlIIllIIIlIlIl) ? 1 : 0)) {
                    final float llllllllllllIlllllIlIIllIIIlIlII = llllllllllllIlllllIlIIllIIIlIIll.getBlockPathWeight(llllllllllllIlllllIlIIllIIIlIlIl);
                    if (lIIIIIIllIlIIIll(lIIIIIIllIIlllIl(llllllllllllIlllllIlIIllIIIlIlII, llllllllllllIlllllIlIIllIIIlllll))) {
                        llllllllllllIlllllIlIIllIIIlllll = llllllllllllIlllllIlIIllIIIlIlII;
                        llllllllllllIlllllIlIIllIIlIIIlI = llllllllllllIlllllIlIIllIIIllIIl;
                        llllllllllllIlllllIlIIllIIlIIIIl = llllllllllllIlllllIlIIllIIIllIII;
                        llllllllllllIlllllIlIIllIIlIIIII = llllllllllllIlllllIlIIllIIIlIlll;
                        llllllllllllIlllllIlIIllIIlIIIll = (RandomPositionGenerator.lIlllIIlIIIIlI[1] != 0);
                    }
                }
            }
            ++llllllllllllIlllllIlIIllIIIllIlI;
        }
        if (lIIIIIIllIIllllI(llllllllllllIlllllIlIIllIIlIIIll ? 1 : 0)) {
            return new Vec3(llllllllllllIlllllIlIIllIIlIIIlI, llllllllllllIlllllIlIIllIIlIIIIl, llllllllllllIlllllIlIIllIIlIIIII);
        }
        return null;
    }
    
    private static int lIIIIIIllIIlllIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    static {
        lIIIIIIllIIllIlI();
        RandomPositionGenerator.staticVector = new Vec3(0.0, 0.0, 0.0);
    }
    
    private static boolean lIIIIIIllIlIIIll(final int llllllllllllIlllllIlIIlIllllIIIl) {
        return llllllllllllIlllllIlIIlIllllIIIl > 0;
    }
    
    private static boolean lIIIIIIllIlIIlII(final int llllllllllllIlllllIlIIllIIIIIIII, final int llllllllllllIlllllIlIIlIllllllll) {
        return llllllllllllIlllllIlIIllIIIIIIII >= llllllllllllIlllllIlIIlIllllllll;
    }
    
    private static boolean lIIIIIIllIIlllll(final int llllllllllllIlllllIlIIlIllllIIll) {
        return llllllllllllIlllllIlIIlIllllIIll < 0;
    }
    
    private static void lIIIIIIllIIllIlI() {
        (lIlllIIlIIIIlI = new int[4])[0] = ((0xAE ^ 0xB9) & ~(0x8C ^ 0x9B));
        RandomPositionGenerator.lIlllIIlIIIIlI[1] = " ".length();
        RandomPositionGenerator.lIlllIIlIIIIlI[2] = "  ".length();
        RandomPositionGenerator.lIlllIIlIIIIlI[3] = (0xAB ^ 0xA1);
    }
    
    private static boolean lIIIIIIllIIllllI(final int llllllllllllIlllllIlIIlIllllIlll) {
        return llllllllllllIlllllIlIIlIllllIlll != 0;
    }
    
    private static int lIIIIIIllIIlllII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public static Vec3 findRandomTargetBlockAwayFrom(final EntityCreature llllllllllllIlllllIlIIllIIllllIl, final int llllllllllllIlllllIlIIllIIllllII, final int llllllllllllIlllllIlIIllIIllllll, final Vec3 llllllllllllIlllllIlIIllIIlllllI) {
        RandomPositionGenerator.staticVector = new Vec3(llllllllllllIlllllIlIIllIIllllIl.posX, llllllllllllIlllllIlIIllIIllllIl.posY, llllllllllllIlllllIlIIllIIllllIl.posZ).subtract(llllllllllllIlllllIlIIllIIlllllI);
        return findRandomTargetBlock(llllllllllllIlllllIlIIllIIllllIl, llllllllllllIlllllIlIIllIIllllII, llllllllllllIlllllIlIIllIIllllll, RandomPositionGenerator.staticVector);
    }
    
    public static Vec3 findRandomTarget(final EntityCreature llllllllllllIlllllIlIIllIlIlIlII, final int llllllllllllIlllllIlIIllIlIlIIll, final int llllllllllllIlllllIlIIllIlIlIIlI) {
        return findRandomTargetBlock(llllllllllllIlllllIlIIllIlIlIlII, llllllllllllIlllllIlIIllIlIlIIll, llllllllllllIlllllIlIIllIlIlIIlI, null);
    }
    
    private static boolean lIIIIIIllIlIIIIl(final int llllllllllllIlllllIlIIlIllllIlIl) {
        return llllllllllllIlllllIlIIlIllllIlIl >= 0;
    }
    
    private static boolean lIIIIIIllIlIIIII(final Object llllllllllllIlllllIlIIlIlllllIIl) {
        return llllllllllllIlllllIlIIlIlllllIIl != null;
    }
}
