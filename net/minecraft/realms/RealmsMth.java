// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.realms;

import java.util.Random;
import org.apache.commons.lang3.StringUtils;
import net.minecraft.util.MathHelper;

public class RealmsMth
{
    public static double getDouble(final String llllllllllllIlllIllIlIlIlIllIlII, final double llllllllllllIlllIllIlIlIlIllIIIl) {
        return MathHelper.parseDoubleWithDefault(llllllllllllIlllIllIlIlIlIllIlII, llllllllllllIlllIllIlIlIlIllIIIl);
    }
    
    public static int floor(final double llllllllllllIlllIllIlIlIlllIlllI) {
        return MathHelper.floor_double(llllllllllllIlllIllIlIlIlllIlllI);
    }
    
    public static float sin(final float llllllllllllIlllIllIlIlIllllllII) {
        return MathHelper.sin(llllllllllllIlllIllIlIlIllllllII);
    }
    
    public static float sqrt(final double llllllllllllIlllIllIlIlIllIIIlll) {
        return MathHelper.sqrt_double(llllllllllllIlllIllIlIlIllIIIlll);
    }
    
    public static int getInt(final String llllllllllllIlllIllIlIlIlIlllIII, final int llllllllllllIlllIllIlIlIlIlllIIl) {
        return MathHelper.parseIntWithDefault(llllllllllllIlllIllIlIlIlIlllIII, llllllllllllIlllIllIlIlIlIlllIIl);
    }
    
    public static double clamp(final double llllllllllllIlllIllIlIlIlIllllll, final double llllllllllllIlllIllIlIlIlIlllllI, final double llllllllllllIlllIllIlIlIllIIIIII) {
        return MathHelper.clamp_double(llllllllllllIlllIllIlIlIlIllllll, llllllllllllIlllIllIlIlIlIlllllI, llllllllllllIlllIllIlIlIllIIIIII);
    }
    
    public static double average(final long[] llllllllllllIlllIllIlIlIIllIIllI) {
        return MathHelper.average(llllllllllllIlllIllIlIlIIllIIllI);
    }
    
    public static int ceil(final float llllllllllllIlllIllIlIlIllllIIIl) {
        return MathHelper.ceiling_float_int(llllllllllllIlllIllIlIlIllllIIIl);
    }
    
    public static float cos(final float llllllllllllIlllIllIlIlIlIlIIIlI) {
        return MathHelper.cos(llllllllllllIlllIllIlIlIlIlIIIlI);
    }
    
    public static double wrapDegrees(final double llllllllllllIlllIllIlIlIlIIIIlIl) {
        return MathHelper.wrapAngleTo180_double(llllllllllllIlllIllIlIlIlIIIIlIl);
    }
    
    public static boolean isEmpty(final String llllllllllllIlllIllIlIlIllIIllIl) {
        return StringUtils.isEmpty((CharSequence)llllllllllllIlllIllIlIlIllIIllIl);
    }
    
    public static double nextDouble(final Random llllllllllllIlllIllIlIlIlllllIII, final double llllllllllllIlllIllIlIlIllllIlII, final double llllllllllllIlllIllIlIlIllllIllI) {
        return MathHelper.getRandomDoubleInRange(llllllllllllIlllIllIlIlIlllllIII, llllllllllllIlllIllIlIlIllllIlII, llllllllllllIlllIllIlIlIllllIllI);
    }
    
    public static float abs(final float llllllllllllIlllIllIlIlIlllIIlIl) {
        return MathHelper.abs(llllllllllllIlllIllIlIlIlllIIlIl);
    }
    
    public static float wrapDegrees(final float llllllllllllIlllIllIlIlIlIIIIIlI) {
        return MathHelper.wrapAngleTo180_float(llllllllllllIlllIllIlIlIlIIIIIlI);
    }
    
    public static float clamp(final float llllllllllllIlllIllIlIlIIllllIlI, final float llllllllllllIlllIllIlIlIIlllllII, final float llllllllllllIlllIllIlIlIIllllIII) {
        return MathHelper.clamp_float(llllllllllllIlllIllIlIlIIllllIlI, llllllllllllIlllIllIlIlIIlllllII, llllllllllllIlllIllIlIlIIllllIII);
    }
    
    public static int fastFloor(final double llllllllllllIlllIllIlIlIlIIlIllI) {
        return MathHelper.truncateDoubleToInt(llllllllllllIlllIllIlIlIlIIlIllI);
    }
    
    public static int absFloor(final double llllllllllllIlllIllIlIlIlIlIlIll) {
        return MathHelper.func_154353_e(llllllllllllIlllIllIlIlIlIlIlIll);
    }
    
    public static int nextInt(final Random llllllllllllIlllIllIlIlIIlIlllII, final int llllllllllllIlllIllIlIlIIlIllIll, final int llllllllllllIlllIllIlIlIIlIllIlI) {
        return MathHelper.getRandomIntegerInRange(llllllllllllIlllIllIlIlIIlIlllII, llllllllllllIlllIllIlIlIIlIllIll, llllllllllllIlllIllIlIlIIlIllIlI);
    }
    
    public static int floor(final float llllllllllllIlllIllIlIlIIllIIIll) {
        return MathHelper.floor_float(llllllllllllIlllIllIlIlIIllIIIll);
    }
    
    public static int intFloorDiv(final int llllllllllllIlllIllIlIlIlllIlIlI, final int llllllllllllIlllIllIlIlIlllIlIIl) {
        return MathHelper.bucketInt(llllllllllllIlllIllIlIlIlllIlIlI, llllllllllllIlllIllIlIlIlllIlIIl);
    }
    
    public static int log2(final int llllllllllllIlllIllIlIlIlIlIllll) {
        return MathHelper.calculateLogBaseTwo(llllllllllllIlllIllIlIlIlIlIllll);
    }
    
    public static double getDouble(final String llllllllllllIlllIllIlIlIIlllIIIl, final double llllllllllllIlllIllIlIlIIlllIIII, final double llllllllllllIlllIllIlIlIIlllIIlI) {
        return MathHelper.parseDoubleWithDefaultAndMax(llllllllllllIlllIllIlIlIIlllIIIl, llllllllllllIlllIllIlIlIIlllIIII, llllllllllllIlllIllIlIlIIlllIIlI);
    }
    
    public static int clamp(final int llllllllllllIlllIllIlIlIllIlllIl, final int llllllllllllIlllIllIlIlIllIlllll, final int llllllllllllIlllIllIlIlIllIllllI) {
        return MathHelper.clamp_int(llllllllllllIlllIllIlIlIllIlllIl, llllllllllllIlllIllIlIlIllIlllll, llllllllllllIlllIllIlIlIllIllllI);
    }
    
    public static float nextFloat(final Random llllllllllllIlllIllIlIlIlIIIllII, final float llllllllllllIlllIllIlIlIlIIIlIll, final float llllllllllllIlllIllIlIlIlIIIlIlI) {
        return MathHelper.randomFloatClamp(llllllllllllIlllIllIlIlIlIIIllII, llllllllllllIlllIllIlIlIlIIIlIll, llllllllllllIlllIllIlIlIlIIIlIlI);
    }
    
    public static int smallestEncompassingPowerOfTwo(final int llllllllllllIlllIllIlIlIlIlIlIIl) {
        return MathHelper.roundUpToPowerOfTwo(llllllllllllIlllIllIlIlIlIlIlIIl);
    }
    
    public static long lfloor(final double llllllllllllIlllIllIlIlIllIIlIlI) {
        return MathHelper.floor_double_long(llllllllllllIlllIllIlIlIllIIlIlI);
    }
    
    public static int ceil(final double llllllllllllIlllIllIlIlIllIlIIII) {
        return MathHelper.ceiling_double_int(llllllllllllIlllIllIlIlIllIlIIII);
    }
    
    public static int roundUp(final int llllllllllllIlllIllIlIlIIllIllII, final int llllllllllllIlllIllIlIlIIllIlIll) {
        return MathHelper.func_154354_b(llllllllllllIlllIllIlIlIIllIllII, llllllllllllIlllIllIlIlIIllIlIll);
    }
    
    public static double clampedLerp(final double llllllllllllIlllIllIlIlIllIlIlll, final double llllllllllllIlllIllIlIlIllIlIllI, final double llllllllllllIlllIllIlIlIllIlIIlI) {
        return MathHelper.denormalizeClamp(llllllllllllIlllIllIlIlIllIlIlll, llllllllllllIlllIllIlIlIllIlIllI, llllllllllllIlllIllIlIlIllIlIIlI);
    }
    
    public static int abs(final int llllllllllllIlllIllIlIlIIllIIIIl) {
        return MathHelper.abs_int(llllllllllllIlllIllIlIlIIllIIIIl);
    }
    
    public static double absMax(final double llllllllllllIlllIllIlIlIlIIlIIIl, final double llllllllllllIlllIllIlIlIlIIlIIII) {
        return MathHelper.abs_max(llllllllllllIlllIllIlIlIlIIlIIIl, llllllllllllIlllIllIlIlIlIIlIIII);
    }
    
    public static float sqrt(final float llllllllllllIlllIllIlIlIlIlIIlIl) {
        return MathHelper.sqrt_float(llllllllllllIlllIllIlIlIlIlIIlIl);
    }
    
    public static int getInt(final String llllllllllllIlllIllIlIlIlIIllIll, final int llllllllllllIlllIllIlIlIlIIllIlI, final int llllllllllllIlllIllIlIlIlIIlllII) {
        return MathHelper.parseIntWithDefaultAndMax(llllllllllllIlllIllIlIlIlIIllIll, llllllllllllIlllIllIlIlIlIIllIlI, llllllllllllIlllIllIlIlIlIIlllII);
    }
}
