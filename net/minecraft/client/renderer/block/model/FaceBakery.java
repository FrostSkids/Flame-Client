// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.block.model;

import net.minecraft.util.Vec3i;
import org.lwjgl.util.vector.ReadableVector3f;
import net.minecraft.client.resources.model.ModelRotation;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import org.lwjgl.util.vector.Vector4f;
import org.lwjgl.util.vector.Vector3f;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.EnumFaceDirection;
import org.lwjgl.util.vector.Matrix4f;
import net.minecraft.util.EnumFacing;

public class FaceBakery
{
    private static final /* synthetic */ int[] lllIlIIIlIllII;
    private static final /* synthetic */ float field_178417_b;
    private static final /* synthetic */ float field_178418_a;
    
    private static boolean lIlIIIIllIlIlIlI(final Object llllllllllllIlIlllIIlIIlIIlIIIlI) {
        return llllllllllllIlIlllIIlIIlIIlIIIlI == null;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing = FaceBakery.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
        if (lIlIIIIllIlIllIl($switch_TABLE$net$minecraft$util$EnumFacing)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing;
        }
        "".length();
        final float llllllllllllIlIlllIIlIIlIIlllIlI = (Object)new int[EnumFacing.values().length];
        try {
            llllllllllllIlIlllIIlIIlIIlllIlI[EnumFacing.DOWN.ordinal()] = FaceBakery.lllIlIIIlIllII[9];
            "".length();
            if ("  ".length() > (0x72 ^ 0x76)) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIlIlllIIlIIlIIlllIlI[EnumFacing.EAST.ordinal()] = FaceBakery.lllIlIIIlIllII[15];
            "".length();
            if ("  ".length() < " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIlIlllIIlIIlIIlllIlI[EnumFacing.NORTH.ordinal()] = FaceBakery.lllIlIIIlIllII[11];
            "".length();
            if (((19 + 20 - 26 + 137 ^ 98 + 111 - 132 + 81) & (0x8E ^ 0xA4 ^ (0xE ^ 0x2C) ^ -" ".length())) == "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIlIlllIIlIIlIIlllIlI[EnumFacing.SOUTH.ordinal()] = FaceBakery.lllIlIIIlIllII[2];
            "".length();
            if (-" ".length() == (0xA2 ^ 0xA6)) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            llllllllllllIlIlllIIlIIlIIlllIlI[EnumFacing.UP.ordinal()] = FaceBakery.lllIlIIIlIllII[10];
            "".length();
            if (" ".length() < -" ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            llllllllllllIlIlllIIlIIlIIlllIlI[EnumFacing.WEST.ordinal()] = FaceBakery.lllIlIIIlIllII[16];
            "".length();
            if (-" ".length() > " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return FaceBakery.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)llllllllllllIlIlllIIlIIlIIlllIlI;
    }
    
    static {
        lIlIIIIllIlIlIII();
        field_178418_a = 1.0f / (float)Math.cos(0.39269909262657166) - 1.0f;
        field_178417_b = 1.0f / (float)Math.cos(0.7853981633974483) - 1.0f;
    }
    
    private static boolean lIlIIIIllIlIllll(final Object llllllllllllIlIlllIIlIIlIIlIIlIl, final Object llllllllllllIlIlllIIlIIlIIlIIlII) {
        return llllllllllllIlIlllIIlIIlIIlIIlIl == llllllllllllIlIlllIIlIIlIIlIIlII;
    }
    
    private Matrix4f getMatrixIdentity() {
        final Matrix4f llllllllllllIlIlllIIlIlIIIIIlIlI = new Matrix4f();
        llllllllllllIlIlllIIlIlIIIIIlIlI.setIdentity();
        "".length();
        return llllllllllllIlIlllIIlIlIIIIIlIlI;
    }
    
    private float getFaceBrightness(final EnumFacing llllllllllllIlIlllIIlIlIlIIlIIII) {
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[llllllllllllIlIlllIIlIlIlIIlIIII.ordinal()]) {
            case 1: {
                return 0.5f;
            }
            case 2: {
                return 1.0f;
            }
            case 3:
            case 4: {
                return 0.8f;
            }
            case 5:
            case 6: {
                return 0.6f;
            }
            default: {
                return 1.0f;
            }
        }
    }
    
    private void func_178408_a(final int[] llllllllllllIlIlllIIlIIllIllIlIl, final EnumFacing llllllllllllIlIlllIIlIIllIllIlII) {
        final int[] llllllllllllIlIlllIIlIIllIllIIll = new int[llllllllllllIlIlllIIlIIllIllIlIl.length];
        System.arraycopy(llllllllllllIlIlllIIlIIllIllIlIl, FaceBakery.lllIlIIIlIllII[1], llllllllllllIlIlllIIlIIllIllIIll, FaceBakery.lllIlIIIlIllII[1], llllllllllllIlIlllIIlIIllIllIlIl.length);
        final float[] llllllllllllIlIlllIIlIIllIllIIlI = new float[EnumFacing.values().length];
        llllllllllllIlIlllIIlIIllIllIIlI[EnumFaceDirection.Constants.WEST_INDEX] = 999.0f;
        llllllllllllIlIlllIIlIIllIllIIlI[EnumFaceDirection.Constants.DOWN_INDEX] = 999.0f;
        llllllllllllIlIlllIIlIIllIllIIlI[EnumFaceDirection.Constants.NORTH_INDEX] = 999.0f;
        llllllllllllIlIlllIIlIIllIllIIlI[EnumFaceDirection.Constants.EAST_INDEX] = -999.0f;
        llllllllllllIlIlllIIlIIllIllIIlI[EnumFaceDirection.Constants.UP_INDEX] = -999.0f;
        llllllllllllIlIlllIIlIIllIllIIlI[EnumFaceDirection.Constants.SOUTH_INDEX] = -999.0f;
        int llllllllllllIlIlllIIlIIllIllIIIl = FaceBakery.lllIlIIIlIllII[1];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIlIIIIllIlIlIll(llllllllllllIlIlllIIlIIllIllIIIl, FaceBakery.lllIlIIIlIllII[2])) {
            final int llllllllllllIlIlllIIlIIllIllIIII = FaceBakery.lllIlIIIlIllII[8] * llllllllllllIlIlllIIlIIllIllIIIl;
            final float llllllllllllIlIlllIIlIIllIlIllll = Float.intBitsToFloat(llllllllllllIlIlllIIlIIllIllIIll[llllllllllllIlIlllIIlIIllIllIIII]);
            final float llllllllllllIlIlllIIlIIllIlIlllI = Float.intBitsToFloat(llllllllllllIlIlllIIlIIllIllIIll[llllllllllllIlIlllIIlIIllIllIIII + FaceBakery.lllIlIIIlIllII[9]]);
            final float llllllllllllIlIlllIIlIIllIlIllIl = Float.intBitsToFloat(llllllllllllIlIlllIIlIIllIllIIll[llllllllllllIlIlllIIlIIllIllIIII + FaceBakery.lllIlIIIlIllII[10]]);
            if (lIlIIIIllIllIlIl(lIlIIIIllIllIIll(llllllllllllIlIlllIIlIIllIlIllll, llllllllllllIlIlllIIlIIllIllIIlI[EnumFaceDirection.Constants.WEST_INDEX]))) {
                llllllllllllIlIlllIIlIIllIllIIlI[EnumFaceDirection.Constants.WEST_INDEX] = llllllllllllIlIlllIIlIIllIlIllll;
            }
            if (lIlIIIIllIllIlIl(lIlIIIIllIllIIll(llllllllllllIlIlllIIlIIllIlIlllI, llllllllllllIlIlllIIlIIllIllIIlI[EnumFaceDirection.Constants.DOWN_INDEX]))) {
                llllllllllllIlIlllIIlIIllIllIIlI[EnumFaceDirection.Constants.DOWN_INDEX] = llllllllllllIlIlllIIlIIllIlIlllI;
            }
            if (lIlIIIIllIllIlIl(lIlIIIIllIllIIll(llllllllllllIlIlllIIlIIllIlIllIl, llllllllllllIlIlllIIlIIllIllIIlI[EnumFaceDirection.Constants.NORTH_INDEX]))) {
                llllllllllllIlIlllIIlIIllIllIIlI[EnumFaceDirection.Constants.NORTH_INDEX] = llllllllllllIlIlllIIlIIllIlIllIl;
            }
            if (lIlIIIIllIllIIlI(lIlIIIIllIllIlII(llllllllllllIlIlllIIlIIllIlIllll, llllllllllllIlIlllIIlIIllIllIIlI[EnumFaceDirection.Constants.EAST_INDEX]))) {
                llllllllllllIlIlllIIlIIllIllIIlI[EnumFaceDirection.Constants.EAST_INDEX] = llllllllllllIlIlllIIlIIllIlIllll;
            }
            if (lIlIIIIllIllIIlI(lIlIIIIllIllIlII(llllllllllllIlIlllIIlIIllIlIlllI, llllllllllllIlIlllIIlIIllIllIIlI[EnumFaceDirection.Constants.UP_INDEX]))) {
                llllllllllllIlIlllIIlIIllIllIIlI[EnumFaceDirection.Constants.UP_INDEX] = llllllllllllIlIlllIIlIIllIlIlllI;
            }
            if (lIlIIIIllIllIIlI(lIlIIIIllIllIlII(llllllllllllIlIlllIIlIIllIlIllIl, llllllllllllIlIlllIIlIIllIllIIlI[EnumFaceDirection.Constants.SOUTH_INDEX]))) {
                llllllllllllIlIlllIIlIIllIllIIlI[EnumFaceDirection.Constants.SOUTH_INDEX] = llllllllllllIlIlllIIlIIllIlIllIl;
            }
            ++llllllllllllIlIlllIIlIIllIllIIIl;
        }
        final EnumFaceDirection llllllllllllIlIlllIIlIIllIlIllII = EnumFaceDirection.getFacing(llllllllllllIlIlllIIlIIllIllIlII);
        int llllllllllllIlIlllIIlIIllIlIlIll = FaceBakery.lllIlIIIlIllII[1];
        "".length();
        if (" ".length() < " ".length()) {
            return;
        }
        while (!lIlIIIIllIlIlIll(llllllllllllIlIlllIIlIIllIlIlIll, FaceBakery.lllIlIIIlIllII[2])) {
            final int llllllllllllIlIlllIIlIIllIlIlIlI = FaceBakery.lllIlIIIlIllII[8] * llllllllllllIlIlllIIlIIllIlIlIll;
            final EnumFaceDirection.VertexInformation llllllllllllIlIlllIIlIIllIlIlIIl = llllllllllllIlIlllIIlIIllIlIllII.func_179025_a(llllllllllllIlIlllIIlIIllIlIlIll);
            final float llllllllllllIlIlllIIlIIllIlIlIII = llllllllllllIlIlllIIlIIllIllIIlI[llllllllllllIlIlllIIlIIllIlIlIIl.field_179184_a];
            final float llllllllllllIlIlllIIlIIllIlIIlll = llllllllllllIlIlllIIlIIllIllIIlI[llllllllllllIlIlllIIlIIllIlIlIIl.field_179182_b];
            final float llllllllllllIlIlllIIlIIllIlIIllI = llllllllllllIlIlllIIlIIllIllIIlI[llllllllllllIlIlllIIlIIllIlIlIIl.field_179183_c];
            llllllllllllIlIlllIIlIIllIllIlIl[llllllllllllIlIlllIIlIIllIlIlIlI] = Float.floatToRawIntBits(llllllllllllIlIlllIIlIIllIlIlIII);
            llllllllllllIlIlllIIlIIllIllIlIl[llllllllllllIlIlllIIlIIllIlIlIlI + FaceBakery.lllIlIIIlIllII[9]] = Float.floatToRawIntBits(llllllllllllIlIlllIIlIIllIlIIlll);
            llllllllllllIlIlllIIlIIllIllIlIl[llllllllllllIlIlllIIlIIllIlIlIlI + FaceBakery.lllIlIIIlIllII[10]] = Float.floatToRawIntBits(llllllllllllIlIlllIIlIIllIlIIllI);
            int llllllllllllIlIlllIIlIIllIlIIlIl = FaceBakery.lllIlIIIlIllII[1];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIlIIIIllIlIlIll(llllllllllllIlIlllIIlIIllIlIIlIl, FaceBakery.lllIlIIIlIllII[2])) {
                final int llllllllllllIlIlllIIlIIllIlIIlII = FaceBakery.lllIlIIIlIllII[8] * llllllllllllIlIlllIIlIIllIlIIlIl;
                final float llllllllllllIlIlllIIlIIllIlIIIll = Float.intBitsToFloat(llllllllllllIlIlllIIlIIllIllIIll[llllllllllllIlIlllIIlIIllIlIIlII]);
                final float llllllllllllIlIlllIIlIIllIlIIIlI = Float.intBitsToFloat(llllllllllllIlIlllIIlIIllIllIIll[llllllllllllIlIlllIIlIIllIlIIlII + FaceBakery.lllIlIIIlIllII[9]]);
                final float llllllllllllIlIlllIIlIIllIlIIIIl = Float.intBitsToFloat(llllllllllllIlIlllIIlIIllIllIIll[llllllllllllIlIlllIIlIIllIlIIlII + FaceBakery.lllIlIIIlIllII[10]]);
                if (lIlIIIIllIlIlIIl(MathHelper.epsilonEquals(llllllllllllIlIlllIIlIIllIlIlIII, llllllllllllIlIlllIIlIIllIlIIIll) ? 1 : 0) && lIlIIIIllIlIlIIl(MathHelper.epsilonEquals(llllllllllllIlIlllIIlIIllIlIIlll, llllllllllllIlIlllIIlIIllIlIIIlI) ? 1 : 0) && lIlIIIIllIlIlIIl(MathHelper.epsilonEquals(llllllllllllIlIlllIIlIIllIlIIllI, llllllllllllIlIlllIIlIIllIlIIIIl) ? 1 : 0)) {
                    llllllllllllIlIlllIIlIIllIllIlIl[llllllllllllIlIlllIIlIIllIlIlIlI + FaceBakery.lllIlIIIlIllII[2]] = llllllllllllIlIlllIIlIIllIllIIll[llllllllllllIlIlllIIlIIllIlIIlII + FaceBakery.lllIlIIIlIllII[2]];
                    llllllllllllIlIlllIIlIIllIllIlIl[llllllllllllIlIlllIIlIIllIlIlIlI + FaceBakery.lllIlIIIlIllII[2] + FaceBakery.lllIlIIIlIllII[9]] = llllllllllllIlIlllIIlIIllIllIIll[llllllllllllIlIlllIIlIIllIlIIlII + FaceBakery.lllIlIIIlIllII[2] + FaceBakery.lllIlIIIlIllII[9]];
                }
                ++llllllllllllIlIlllIIlIIllIlIIlIl;
            }
            ++llllllllllllIlIlllIIlIIllIlIlIll;
        }
    }
    
    private int getFaceShadeColor(final EnumFacing llllllllllllIlIlllIIlIlIlIIllIIl) {
        final float llllllllllllIlIlllIIlIlIlIIllIII = this.getFaceBrightness(llllllllllllIlIlllIIlIlIlIIllIIl);
        final int llllllllllllIlIlllIIlIlIlIIlIlll = MathHelper.clamp_int((int)(llllllllllllIlIlllIIlIlIlIIllIII * 255.0f), FaceBakery.lllIlIIIlIllII[1], FaceBakery.lllIlIIIlIllII[3]);
        return FaceBakery.lllIlIIIlIllII[4] | llllllllllllIlIlllIIlIlIlIIlIlll << FaceBakery.lllIlIIIlIllII[5] | llllllllllllIlIlllIIlIlIlIIlIlll << FaceBakery.lllIlIIIlIllII[6] | llllllllllllIlIlllIIlIlIlIIlIlll;
    }
    
    private void rotateScale(final Vector3f llllllllllllIlIlllIIlIlIIIIlIIIl, final Vector3f llllllllllllIlIlllIIlIlIIIIlIlIl, final Matrix4f llllllllllllIlIlllIIlIlIIIIlIlII, final Vector3f llllllllllllIlIlllIIlIlIIIIlIIll) {
        final Vector4f llllllllllllIlIlllIIlIlIIIIlIIlI = new Vector4f(llllllllllllIlIlllIIlIlIIIIlIIIl.x - llllllllllllIlIlllIIlIlIIIIlIlIl.x, llllllllllllIlIlllIIlIlIIIIlIIIl.y - llllllllllllIlIlllIIlIlIIIIlIlIl.y, llllllllllllIlIlllIIlIlIIIIlIIIl.z - llllllllllllIlIlllIIlIlIIIIlIlIl.z, 1.0f);
        Matrix4f.transform(llllllllllllIlIlllIIlIlIIIIlIlII, llllllllllllIlIlllIIlIlIIIIlIIlI, llllllllllllIlIlllIIlIlIIIIlIIlI);
        "".length();
        final Vector4f vector4f = llllllllllllIlIlllIIlIlIIIIlIIlI;
        vector4f.x *= llllllllllllIlIlllIIlIlIIIIlIIll.x;
        final Vector4f vector4f2 = llllllllllllIlIlllIIlIlIIIIlIIlI;
        vector4f2.y *= llllllllllllIlIlllIIlIlIIIIlIIll.y;
        final Vector4f vector4f3 = llllllllllllIlIlllIIlIlIIIIlIIlI;
        vector4f3.z *= llllllllllllIlIlllIIlIlIIIIlIIll.z;
        llllllllllllIlIlllIIlIlIIIIlIIIl.set(llllllllllllIlIlllIIlIlIIIIlIIlI.x + llllllllllllIlIlllIIlIlIIIIlIlIl.x, llllllllllllIlIlllIIlIlIIIIlIIlI.y + llllllllllllIlIlllIIlIlIIIIlIlIl.y, llllllllllllIlIlllIIlIlIIIIlIIlI.z + llllllllllllIlIlllIIlIlIIIIlIlIl.z);
    }
    
    private static void lIlIIIIllIlIlIII() {
        (lllIlIIIlIllII = new int[17])[0] = (0x86 ^ 0x9A);
        FaceBakery.lllIlIIIlIllII[1] = ((0xAD ^ 0xB4) & ~(0x9A ^ 0x83));
        FaceBakery.lllIlIIIlIllII[2] = (0xBB ^ 0xBF);
        FaceBakery.lllIlIIIlIllII[3] = (0x2E ^ 0x8) + (48 + 117 - 9 + 0) - (0x49 ^ 0x51) + (0x14 ^ 0x41);
        FaceBakery.lllIlIIIlIllII[4] = -(-(0xFFFFBF3B & 0x4FCF) & (0xFFFFEF8F & 0x1001F7A));
        FaceBakery.lllIlIIIlIllII[5] = (0x26 ^ 0x36);
        FaceBakery.lllIlIIIlIllII[6] = (0xC1 ^ 0xB9 ^ (0xC9 ^ 0xB9));
        FaceBakery.lllIlIIIlIllII[7] = -" ".length();
        FaceBakery.lllIlIIIlIllII[8] = (0x84 ^ 0x83 ^ ((0x78 ^ 0x25) & ~(0x49 ^ 0x14)));
        FaceBakery.lllIlIIIlIllII[9] = " ".length();
        FaceBakery.lllIlIIIlIllII[10] = "  ".length();
        FaceBakery.lllIlIIIlIllII[11] = "   ".length();
        FaceBakery.lllIlIIIlIllII[12] = (0x6C ^ 0x65);
        FaceBakery.lllIlIIIlIllII[13] = (0x5 ^ 0xB);
        FaceBakery.lllIlIIIlIllII[14] = (70 + 76 - 31 + 36 ^ 20 + 107 - 125 + 150);
        FaceBakery.lllIlIIIlIllII[15] = (128 + 123 - 152 + 82 ^ 91 + 163 - 122 + 47);
        FaceBakery.lllIlIIIlIllII[16] = (67 + 81 - 123 + 155 ^ 175 + 90 - 135 + 47);
    }
    
    private void storeVertexData(final int[] llllllllllllIlIlllIIlIlIIlIIlIll, final int llllllllllllIlIlllIIlIlIIlIIIIlI, final int llllllllllllIlIlllIIlIlIIlIIIIIl, final Vector3f llllllllllllIlIlllIIlIlIIlIIlIII, final int llllllllllllIlIlllIIlIlIIIllllll, final TextureAtlasSprite llllllllllllIlIlllIIlIlIIlIIIllI, final BlockFaceUV llllllllllllIlIlllIIlIlIIlIIIlIl) {
        final int llllllllllllIlIlllIIlIlIIlIIIlII = llllllllllllIlIlllIIlIlIIlIIIIlI * FaceBakery.lllIlIIIlIllII[8];
        llllllllllllIlIlllIIlIlIIlIIlIll[llllllllllllIlIlllIIlIlIIlIIIlII] = Float.floatToRawIntBits(llllllllllllIlIlllIIlIlIIlIIlIII.x);
        llllllllllllIlIlllIIlIlIIlIIlIll[llllllllllllIlIlllIIlIlIIlIIIlII + FaceBakery.lllIlIIIlIllII[9]] = Float.floatToRawIntBits(llllllllllllIlIlllIIlIlIIlIIlIII.y);
        llllllllllllIlIlllIIlIlIIlIIlIll[llllllllllllIlIlllIIlIlIIlIIIlII + FaceBakery.lllIlIIIlIllII[10]] = Float.floatToRawIntBits(llllllllllllIlIlllIIlIlIIlIIlIII.z);
        llllllllllllIlIlllIIlIlIIlIIlIll[llllllllllllIlIlllIIlIlIIlIIIlII + FaceBakery.lllIlIIIlIllII[11]] = llllllllllllIlIlllIIlIlIIIllllll;
        llllllllllllIlIlllIIlIlIIlIIlIll[llllllllllllIlIlllIIlIlIIlIIIlII + FaceBakery.lllIlIIIlIllII[2]] = Float.floatToRawIntBits(llllllllllllIlIlllIIlIlIIlIIIllI.getInterpolatedU(llllllllllllIlIlllIIlIlIIlIIIlIl.func_178348_a(llllllllllllIlIlllIIlIlIIlIIIIIl)));
        llllllllllllIlIlllIIlIlIIlIIlIll[llllllllllllIlIlllIIlIlIIlIIIlII + FaceBakery.lllIlIIIlIllII[2] + FaceBakery.lllIlIIIlIllII[9]] = Float.floatToRawIntBits(llllllllllllIlIlllIIlIlIIlIIIllI.getInterpolatedV(llllllllllllIlIlllIIlIlIIlIIIlIl.func_178346_b(llllllllllllIlIlllIIlIlIIlIIIIIl)));
    }
    
    private static boolean lIlIIIIllIlIlllI(final int llllllllllllIlIlllIIlIIlIIIllllI) {
        return llllllllllllIlIlllIIlIIlIIIllllI == 0;
    }
    
    private static boolean lIlIIIIllIlIllIl(final Object llllllllllllIlIlllIIlIIlIIlIlIII) {
        return llllllllllllIlIlllIIlIIlIIlIlIII != null;
    }
    
    private static int lIlIIIIllIllIlll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing$Axis = FaceBakery.$SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis;
        if (lIlIIIIllIlIllIl($switch_TABLE$net$minecraft$util$EnumFacing$Axis)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing$Axis;
        }
        "".length();
        final long llllllllllllIlIlllIIlIIlIIllIIlI = (Object)new int[EnumFacing.Axis.values().length];
        try {
            llllllllllllIlIlllIIlIIlIIllIIlI[EnumFacing.Axis.X.ordinal()] = FaceBakery.lllIlIIIlIllII[9];
            "".length();
            if ((0x70 ^ 0x58 ^ (0xBD ^ 0x90)) == 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIlIlllIIlIIlIIllIIlI[EnumFacing.Axis.Y.ordinal()] = FaceBakery.lllIlIIIlIllII[10];
            "".length();
            if ((0x2A ^ 0xF ^ (0xA3 ^ 0x83)) <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIlIlllIIlIIlIIllIIlI[EnumFacing.Axis.Z.ordinal()] = FaceBakery.lllIlIIIlIllII[11];
            "".length();
            if (-(0x91 ^ 0x8E ^ (0x17 ^ 0xD)) >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        return FaceBakery.$SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis = (int[])(Object)llllllllllllIlIlllIIlIIlIIllIIlI;
    }
    
    private static boolean lIlIIIIllIlIlIll(final int llllllllllllIlIlllIIlIIlIIlIlIll, final int llllllllllllIlIlllIIlIIlIIlIlIlI) {
        return llllllllllllIlIlllIIlIIlIIlIlIll >= llllllllllllIlIlllIIlIIlIIlIlIlI;
    }
    
    public BakedQuad makeBakedQuad(final Vector3f llllllllllllIlIlllIIlIlIllIlIllI, final Vector3f llllllllllllIlIlllIIlIlIllIlIlIl, final BlockPartFace llllllllllllIlIlllIIlIlIllIIlIII, final TextureAtlasSprite llllllllllllIlIlllIIlIlIllIlIIll, final EnumFacing llllllllllllIlIlllIIlIlIllIlIIlI, final ModelRotation llllllllllllIlIlllIIlIlIllIlIIIl, final BlockPartRotation llllllllllllIlIlllIIlIlIllIIIlII, final boolean llllllllllllIlIlllIIlIlIllIIllll, final boolean llllllllllllIlIlllIIlIlIllIIlllI) {
        final int[] llllllllllllIlIlllIIlIlIllIIllIl = this.makeQuadVertexData(llllllllllllIlIlllIIlIlIllIIlIII, llllllllllllIlIlllIIlIlIllIlIIll, llllllllllllIlIlllIIlIlIllIlIIlI, this.getPositionsDiv16(llllllllllllIlIlllIIlIlIllIlIllI, llllllllllllIlIlllIIlIlIllIlIlIl), llllllllllllIlIlllIIlIlIllIlIIIl, llllllllllllIlIlllIIlIlIllIIIlII, llllllllllllIlIlllIIlIlIllIIllll, llllllllllllIlIlllIIlIlIllIIlllI);
        final EnumFacing llllllllllllIlIlllIIlIlIllIIllII = getFacingFromVertexData(llllllllllllIlIlllIIlIlIllIIllIl);
        if (lIlIIIIllIlIlIIl(llllllllllllIlIlllIIlIlIllIIllll ? 1 : 0)) {
            this.func_178409_a(llllllllllllIlIlllIIlIlIllIIllIl, llllllllllllIlIlllIIlIlIllIIllII, llllllllllllIlIlllIIlIlIllIIlIII.blockFaceUV, llllllllllllIlIlllIIlIlIllIlIIll);
        }
        if (lIlIIIIllIlIlIlI(llllllllllllIlIlllIIlIlIllIIIlII)) {
            this.func_178408_a(llllllllllllIlIlllIIlIlIllIIllIl, llllllllllllIlIlllIIlIlIllIIllII);
        }
        return new BakedQuad(llllllllllllIlIlllIIlIlIllIIllIl, llllllllllllIlIlllIIlIlIllIIlIII.tintIndex, llllllllllllIlIlllIIlIlIllIIllII);
    }
    
    private static boolean lIlIIIIllIllIIlI(final int llllllllllllIlIlllIIlIIlIIIllIII) {
        return llllllllllllIlIlllIIlIIlIIIllIII > 0;
    }
    
    private static int lIlIIIIllIlIllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public int rotateVertex(final Vector3f llllllllllllIlIlllIIlIlIIIlIIIII, final EnumFacing llllllllllllIlIlllIIlIlIIIlIIlIl, final int llllllllllllIlIlllIIlIlIIIIllllI, final ModelRotation llllllllllllIlIlllIIlIlIIIIlllIl, final boolean llllllllllllIlIlllIIlIlIIIlIIIlI) {
        if (lIlIIIIllIlIllll(llllllllllllIlIlllIIlIlIIIIlllIl, ModelRotation.X0_Y0)) {
            return llllllllllllIlIlllIIlIlIIIIllllI;
        }
        this.rotateScale(llllllllllllIlIlllIIlIlIIIlIIIII, new Vector3f(0.5f, 0.5f, 0.5f), llllllllllllIlIlllIIlIlIIIIlllIl.getMatrix4d(), new Vector3f(1.0f, 1.0f, 1.0f));
        return llllllllllllIlIlllIIlIlIIIIlllIl.rotateVertex(llllllllllllIlIlllIIlIlIIIlIIlIl, llllllllllllIlIlllIIlIlIIIIllllI);
    }
    
    private float[] getPositionsDiv16(final Vector3f llllllllllllIlIlllIIlIlIlIIIIlll, final Vector3f llllllllllllIlIlllIIlIlIlIIIlIIl) {
        final float[] llllllllllllIlIlllIIlIlIlIIIlIII = new float[EnumFacing.values().length];
        llllllllllllIlIlllIIlIlIlIIIlIII[EnumFaceDirection.Constants.WEST_INDEX] = llllllllllllIlIlllIIlIlIlIIIIlll.x / 16.0f;
        llllllllllllIlIlllIIlIlIlIIIlIII[EnumFaceDirection.Constants.DOWN_INDEX] = llllllllllllIlIlllIIlIlIlIIIIlll.y / 16.0f;
        llllllllllllIlIlllIIlIlIlIIIlIII[EnumFaceDirection.Constants.NORTH_INDEX] = llllllllllllIlIlllIIlIlIlIIIIlll.z / 16.0f;
        llllllllllllIlIlllIIlIlIlIIIlIII[EnumFaceDirection.Constants.EAST_INDEX] = llllllllllllIlIlllIIlIlIlIIIlIIl.x / 16.0f;
        llllllllllllIlIlllIIlIlIlIIIlIII[EnumFaceDirection.Constants.UP_INDEX] = llllllllllllIlIlllIIlIlIlIIIlIIl.y / 16.0f;
        llllllllllllIlIlllIIlIlIlIIIlIII[EnumFaceDirection.Constants.SOUTH_INDEX] = llllllllllllIlIlllIIlIlIlIIIlIIl.z / 16.0f;
        return llllllllllllIlIlllIIlIlIlIIIlIII;
    }
    
    private static boolean lIlIIIIllIlIlIIl(final int llllllllllllIlIlllIIlIIlIIlIIIII) {
        return llllllllllllIlIlllIIlIIlIIlIIIII != 0;
    }
    
    private static int lIlIIIIllIllIIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static int lIlIIIIllIllIIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIlIIIIllIllIlIl(final int llllllllllllIlIlllIIlIIlIIIllIlI) {
        return llllllllllllIlIlllIIlIIlIIIllIlI < 0;
    }
    
    private void func_178407_a(final Vector3f llllllllllllIlIlllIIlIlIIIllIlIl, final BlockPartRotation llllllllllllIlIlllIIlIlIIIlIllll) {
        if (lIlIIIIllIlIllIl(llllllllllllIlIlllIIlIlIIIlIllll)) {
            final Matrix4f llllllllllllIlIlllIIlIlIIIllIIll = this.getMatrixIdentity();
            final Vector3f llllllllllllIlIlllIIlIlIIIllIIlI = new Vector3f(0.0f, 0.0f, 0.0f);
            switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis()[llllllllllllIlIlllIIlIlIIIlIllll.axis.ordinal()]) {
                case 1: {
                    Matrix4f.rotate(llllllllllllIlIlllIIlIlIIIlIllll.angle * 0.017453292f, new Vector3f(1.0f, 0.0f, 0.0f), llllllllllllIlIlllIIlIlIIIllIIll, llllllllllllIlIlllIIlIlIIIllIIll);
                    "".length();
                    llllllllllllIlIlllIIlIlIIIllIIlI.set(0.0f, 1.0f, 1.0f);
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
                case 2: {
                    Matrix4f.rotate(llllllllllllIlIlllIIlIlIIIlIllll.angle * 0.017453292f, new Vector3f(0.0f, 1.0f, 0.0f), llllllllllllIlIlllIIlIlIIIllIIll, llllllllllllIlIlllIIlIlIIIllIIll);
                    "".length();
                    llllllllllllIlIlllIIlIlIIIllIIlI.set(1.0f, 0.0f, 1.0f);
                    "".length();
                    if ((0x9B ^ 0x9E) <= 0) {
                        return;
                    }
                    break;
                }
                case 3: {
                    Matrix4f.rotate(llllllllllllIlIlllIIlIlIIIlIllll.angle * 0.017453292f, new Vector3f(0.0f, 0.0f, 1.0f), llllllllllllIlIlllIIlIlIIIllIIll, llllllllllllIlIlllIIlIlIIIllIIll);
                    "".length();
                    llllllllllllIlIlllIIlIlIIIllIIlI.set(1.0f, 1.0f, 0.0f);
                    break;
                }
            }
            if (lIlIIIIllIlIlIIl(llllllllllllIlIlllIIlIlIIIlIllll.rescale ? 1 : 0)) {
                if (lIlIIIIllIlIlllI(lIlIIIIllIlIllII(Math.abs(llllllllllllIlIlllIIlIlIIIlIllll.angle), 22.5f))) {
                    llllllllllllIlIlllIIlIlIIIllIIlI.scale(FaceBakery.field_178418_a);
                    "".length();
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    llllllllllllIlIlllIIlIlIIIllIIlI.scale(FaceBakery.field_178417_b);
                    "".length();
                }
                Vector3f.add(llllllllllllIlIlllIIlIlIIIllIIlI, new Vector3f(1.0f, 1.0f, 1.0f), llllllllllllIlIlllIIlIlIIIllIIlI);
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                llllllllllllIlIlllIIlIlIIIllIIlI.set(1.0f, 1.0f, 1.0f);
            }
            this.rotateScale(llllllllllllIlIlllIIlIlIIIllIlIl, new Vector3f((ReadableVector3f)llllllllllllIlIlllIIlIlIIIlIllll.origin), llllllllllllIlIlllIIlIlIIIllIIll, llllllllllllIlIlllIIlIlIIIllIIlI);
        }
    }
    
    private static int lIlIIIIllIllIllI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private void fillVertexData(final int[] llllllllllllIlIlllIIlIlIIllIIIll, final int llllllllllllIlIlllIIlIlIIlllIIlI, final EnumFacing llllllllllllIlIlllIIlIlIIllIIIIl, final BlockPartFace llllllllllllIlIlllIIlIlIIllIIIII, final float[] llllllllllllIlIlllIIlIlIIlIlllll, final TextureAtlasSprite llllllllllllIlIlllIIlIlIIlIllllI, final ModelRotation llllllllllllIlIlllIIlIlIIlIlllIl, final BlockPartRotation llllllllllllIlIlllIIlIlIIlIlllII, final boolean llllllllllllIlIlllIIlIlIIllIlIll, final boolean llllllllllllIlIlllIIlIlIIlIllIlI) {
        final EnumFacing llllllllllllIlIlllIIlIlIIllIlIIl = llllllllllllIlIlllIIlIlIIlIlllIl.rotateFace(llllllllllllIlIlllIIlIlIIllIIIIl);
        int faceShadeColor;
        if (lIlIIIIllIlIlIIl(llllllllllllIlIlllIIlIlIIlIllIlI ? 1 : 0)) {
            faceShadeColor = this.getFaceShadeColor(llllllllllllIlIlllIIlIlIIllIlIIl);
            "".length();
            if ("  ".length() <= " ".length()) {
                return;
            }
        }
        else {
            faceShadeColor = FaceBakery.lllIlIIIlIllII[7];
        }
        final int llllllllllllIlIlllIIlIlIIllIlIII = faceShadeColor;
        final EnumFaceDirection.VertexInformation llllllllllllIlIlllIIlIlIIllIIlll = EnumFaceDirection.getFacing(llllllllllllIlIlllIIlIlIIllIIIIl).func_179025_a(llllllllllllIlIlllIIlIlIIlllIIlI);
        final Vector3f llllllllllllIlIlllIIlIlIIllIIllI = new Vector3f(llllllllllllIlIlllIIlIlIIlIlllll[llllllllllllIlIlllIIlIlIIllIIlll.field_179184_a], llllllllllllIlIlllIIlIlIIlIlllll[llllllllllllIlIlllIIlIlIIllIIlll.field_179182_b], llllllllllllIlIlllIIlIlIIlIlllll[llllllllllllIlIlllIIlIlIIllIIlll.field_179183_c]);
        this.func_178407_a(llllllllllllIlIlllIIlIlIIllIIllI, llllllllllllIlIlllIIlIlIIlIlllII);
        final int llllllllllllIlIlllIIlIlIIllIIlIl = this.rotateVertex(llllllllllllIlIlllIIlIlIIllIIllI, llllllllllllIlIlllIIlIlIIllIIIIl, llllllllllllIlIlllIIlIlIIlllIIlI, llllllllllllIlIlllIIlIlIIlIlllIl, llllllllllllIlIlllIIlIlIIllIlIll);
        this.storeVertexData(llllllllllllIlIlllIIlIlIIllIIIll, llllllllllllIlIlllIIlIlIIllIIlIl, llllllllllllIlIlllIIlIlIIlllIIlI, llllllllllllIlIlllIIlIlIIllIIllI, llllllllllllIlIlllIIlIlIIllIlIII, llllllllllllIlIlllIIlIlIIlIllllI, llllllllllllIlIlllIIlIlIIllIIIII.blockFaceUV);
    }
    
    private int[] makeQuadVertexData(final BlockPartFace llllllllllllIlIlllIIlIlIlIlIlIII, final TextureAtlasSprite llllllllllllIlIlllIIlIlIlIllIIlI, final EnumFacing llllllllllllIlIlllIIlIlIlIllIIIl, final float[] llllllllllllIlIlllIIlIlIlIlIIlIl, final ModelRotation llllllllllllIlIlllIIlIlIlIlIIlII, final BlockPartRotation llllllllllllIlIlllIIlIlIlIlIlllI, final boolean llllllllllllIlIlllIIlIlIlIlIllIl, final boolean llllllllllllIlIlllIIlIlIlIlIllII) {
        final int[] llllllllllllIlIlllIIlIlIlIlIlIll = new int[FaceBakery.lllIlIIIlIllII[0]];
        int llllllllllllIlIlllIIlIlIlIlIlIlI = FaceBakery.lllIlIIIlIllII[1];
        "".length();
        if (((0x2F ^ 0x61) & ~(0xDA ^ 0x94)) >= " ".length()) {
            return null;
        }
        while (!lIlIIIIllIlIlIll(llllllllllllIlIlllIIlIlIlIlIlIlI, FaceBakery.lllIlIIIlIllII[2])) {
            this.fillVertexData(llllllllllllIlIlllIIlIlIlIlIlIll, llllllllllllIlIlllIIlIlIlIlIlIlI, llllllllllllIlIlllIIlIlIlIllIIIl, llllllllllllIlIlllIIlIlIlIlIlIII, llllllllllllIlIlllIIlIlIlIlIIlIl, llllllllllllIlIlllIIlIlIlIllIIlI, llllllllllllIlIlllIIlIlIlIlIIlII, llllllllllllIlIlllIIlIlIlIlIlllI, llllllllllllIlIlllIIlIlIlIlIllIl, llllllllllllIlIlllIIlIlIlIlIllII);
            ++llllllllllllIlIlllIIlIlIlIlIlIlI;
        }
        return llllllllllllIlIlllIIlIlIlIlIlIll;
    }
    
    private void func_178401_a(final int llllllllllllIlIlllIIlIIlIllIlIII, final int[] llllllllllllIlIlllIIlIIlIlIlIlII, final EnumFacing llllllllllllIlIlllIIlIIlIlIlIIlI, final BlockFaceUV llllllllllllIlIlllIIlIIlIlIlIIIl, final TextureAtlasSprite llllllllllllIlIlllIIlIIlIllIIIlI) {
        final int llllllllllllIlIlllIIlIIlIllIIIIl = FaceBakery.lllIlIIIlIllII[8] * llllllllllllIlIlllIIlIIlIllIlIII;
        float llllllllllllIlIlllIIlIIlIlIlllll = Float.intBitsToFloat(llllllllllllIlIlllIIlIIlIlIlIlII[llllllllllllIlIlllIIlIIlIllIIIIl]);
        float llllllllllllIlIlllIIlIIlIlIllllI = Float.intBitsToFloat(llllllllllllIlIlllIIlIIlIlIlIlII[llllllllllllIlIlllIIlIIlIllIIIIl + FaceBakery.lllIlIIIlIllII[9]]);
        float llllllllllllIlIlllIIlIIlIlIlllII = Float.intBitsToFloat(llllllllllllIlIlllIIlIIlIlIlIlII[llllllllllllIlIlllIIlIIlIllIIIIl + FaceBakery.lllIlIIIlIllII[10]]);
        if (!lIlIIIIllIllIIIl(lIlIIIIllIllIllI(llllllllllllIlIlllIIlIIlIlIlllll, -0.1f)) || lIlIIIIllIllIIIl(lIlIIIIllIllIlll(llllllllllllIlIlllIIlIIlIlIlllll, 1.1f))) {
            llllllllllllIlIlllIIlIIlIlIlllll -= MathHelper.floor_float(llllllllllllIlIlllIIlIIlIlIlllll);
        }
        if (!lIlIIIIllIllIIIl(lIlIIIIllIllIllI(llllllllllllIlIlllIIlIIlIlIllllI, -0.1f)) || lIlIIIIllIllIIIl(lIlIIIIllIllIlll(llllllllllllIlIlllIIlIIlIlIllllI, 1.1f))) {
            llllllllllllIlIlllIIlIIlIlIllllI -= MathHelper.floor_float(llllllllllllIlIlllIIlIIlIlIllllI);
        }
        if (!lIlIIIIllIllIIIl(lIlIIIIllIllIllI(llllllllllllIlIlllIIlIIlIlIlllII, -0.1f)) || lIlIIIIllIllIIIl(lIlIIIIllIllIlll(llllllllllllIlIlllIIlIIlIlIlllII, 1.1f))) {
            llllllllllllIlIlllIIlIIlIlIlllII -= MathHelper.floor_float(llllllllllllIlIlllIIlIIlIlIlllII);
        }
        float llllllllllllIlIlllIIlIIlIlIllIlI = 0.0f;
        float llllllllllllIlIlllIIlIIlIlIllIIl = 0.0f;
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[llllllllllllIlIlllIIlIIlIlIlIIlI.ordinal()]) {
            case 1: {
                llllllllllllIlIlllIIlIIlIlIllIlI = llllllllllllIlIlllIIlIIlIlIlllll * 16.0f;
                llllllllllllIlIlllIIlIIlIlIllIIl = (1.0f - llllllllllllIlIlllIIlIIlIlIlllII) * 16.0f;
                "".length();
                if (" ".length() > "   ".length()) {
                    return;
                }
                break;
            }
            case 2: {
                llllllllllllIlIlllIIlIIlIlIllIlI = llllllllllllIlIlllIIlIIlIlIlllll * 16.0f;
                llllllllllllIlIlllIIlIIlIlIllIIl = llllllllllllIlIlllIIlIIlIlIlllII * 16.0f;
                "".length();
                if ("   ".length() == ((0x9C ^ 0xAC) & ~(0x6D ^ 0x5D))) {
                    return;
                }
                break;
            }
            case 3: {
                llllllllllllIlIlllIIlIIlIlIllIlI = (1.0f - llllllllllllIlIlllIIlIIlIlIlllll) * 16.0f;
                llllllllllllIlIlllIIlIIlIlIllIIl = (1.0f - llllllllllllIlIlllIIlIIlIlIllllI) * 16.0f;
                "".length();
                if (((0x29 ^ 0x36) & ~(0xAF ^ 0xB0)) >= "  ".length()) {
                    return;
                }
                break;
            }
            case 4: {
                llllllllllllIlIlllIIlIIlIlIllIlI = llllllllllllIlIlllIIlIIlIlIlllll * 16.0f;
                llllllllllllIlIlllIIlIIlIlIllIIl = (1.0f - llllllllllllIlIlllIIlIIlIlIllllI) * 16.0f;
                "".length();
                if ((37 + 65 + 74 + 3 ^ 76 + 92 - 35 + 50) != (0xF6 ^ 0x86 ^ (0xFC ^ 0x88))) {
                    return;
                }
                break;
            }
            case 5: {
                llllllllllllIlIlllIIlIIlIlIllIlI = llllllllllllIlIlllIIlIIlIlIlllII * 16.0f;
                llllllllllllIlIlllIIlIIlIlIllIIl = (1.0f - llllllllllllIlIlllIIlIIlIlIllllI) * 16.0f;
                "".length();
                if (-" ".length() >= " ".length()) {
                    return;
                }
                break;
            }
            case 6: {
                llllllllllllIlIlllIIlIIlIlIllIlI = (1.0f - llllllllllllIlIlllIIlIIlIlIlllII) * 16.0f;
                llllllllllllIlIlllIIlIIlIlIllIIl = (1.0f - llllllllllllIlIlllIIlIIlIlIllllI) * 16.0f;
                break;
            }
        }
        final int llllllllllllIlIlllIIlIIlIlIllIII = llllllllllllIlIlllIIlIIlIlIlIIIl.func_178345_c(llllllllllllIlIlllIIlIIlIllIlIII) * FaceBakery.lllIlIIIlIllII[8];
        llllllllllllIlIlllIIlIIlIlIlIlII[llllllllllllIlIlllIIlIIlIlIllIII + FaceBakery.lllIlIIIlIllII[2]] = Float.floatToRawIntBits(llllllllllllIlIlllIIlIIlIllIIIlI.getInterpolatedU(llllllllllllIlIlllIIlIIlIlIllIlI));
        llllllllllllIlIlllIIlIIlIlIlIlII[llllllllllllIlIlllIIlIIlIlIllIII + FaceBakery.lllIlIIIlIllII[2] + FaceBakery.lllIlIIIlIllII[9]] = Float.floatToRawIntBits(llllllllllllIlIlllIIlIIlIllIIIlI.getInterpolatedV(llllllllllllIlIlllIIlIIlIlIllIIl));
    }
    
    public static EnumFacing getFacingFromVertexData(final int[] llllllllllllIlIlllIIlIIllllIlIIl) {
        final Vector3f llllllllllllIlIlllIIlIIlllllIllI = new Vector3f(Float.intBitsToFloat(llllllllllllIlIlllIIlIIllllIlIIl[FaceBakery.lllIlIIIlIllII[1]]), Float.intBitsToFloat(llllllllllllIlIlllIIlIIllllIlIIl[FaceBakery.lllIlIIIlIllII[9]]), Float.intBitsToFloat(llllllllllllIlIlllIIlIIllllIlIIl[FaceBakery.lllIlIIIlIllII[10]]));
        final Vector3f llllllllllllIlIlllIIlIIlllllIlIl = new Vector3f(Float.intBitsToFloat(llllllllllllIlIlllIIlIIllllIlIIl[FaceBakery.lllIlIIIlIllII[8]]), Float.intBitsToFloat(llllllllllllIlIlllIIlIIllllIlIIl[FaceBakery.lllIlIIIlIllII[6]]), Float.intBitsToFloat(llllllllllllIlIlllIIlIIllllIlIIl[FaceBakery.lllIlIIIlIllII[12]]));
        final Vector3f llllllllllllIlIlllIIlIIlllllIlII = new Vector3f(Float.intBitsToFloat(llllllllllllIlIlllIIlIIllllIlIIl[FaceBakery.lllIlIIIlIllII[13]]), Float.intBitsToFloat(llllllllllllIlIlllIIlIIllllIlIIl[FaceBakery.lllIlIIIlIllII[14]]), Float.intBitsToFloat(llllllllllllIlIlllIIlIIllllIlIIl[FaceBakery.lllIlIIIlIllII[5]]));
        final Vector3f llllllllllllIlIlllIIlIIlllllIIll = new Vector3f();
        final Vector3f llllllllllllIlIlllIIlIIlllllIIlI = new Vector3f();
        final Vector3f llllllllllllIlIlllIIlIIlllllIIIl = new Vector3f();
        Vector3f.sub(llllllllllllIlIlllIIlIIlllllIllI, llllllllllllIlIlllIIlIIlllllIlIl, llllllllllllIlIlllIIlIIlllllIIll);
        "".length();
        Vector3f.sub(llllllllllllIlIlllIIlIIlllllIlII, llllllllllllIlIlllIIlIIlllllIlIl, llllllllllllIlIlllIIlIIlllllIIlI);
        "".length();
        Vector3f.cross(llllllllllllIlIlllIIlIIlllllIIlI, llllllllllllIlIlllIIlIIlllllIIll, llllllllllllIlIlllIIlIIlllllIIIl);
        "".length();
        final float llllllllllllIlIlllIIlIIlllllIIII = (float)Math.sqrt(llllllllllllIlIlllIIlIIlllllIIIl.x * llllllllllllIlIlllIIlIIlllllIIIl.x + llllllllllllIlIlllIIlIIlllllIIIl.y * llllllllllllIlIlllIIlIIlllllIIIl.y + llllllllllllIlIlllIIlIIlllllIIIl.z * llllllllllllIlIlllIIlIIlllllIIIl.z);
        final Vector3f vector3f = llllllllllllIlIlllIIlIIlllllIIIl;
        vector3f.x /= llllllllllllIlIlllIIlIIlllllIIII;
        final Vector3f vector3f2 = llllllllllllIlIlllIIlIIlllllIIIl;
        vector3f2.y /= llllllllllllIlIlllIIlIIlllllIIII;
        final Vector3f vector3f3 = llllllllllllIlIlllIIlIIlllllIIIl;
        vector3f3.z /= llllllllllllIlIlllIIlIIlllllIIII;
        EnumFacing llllllllllllIlIlllIIlIIllllIllll = null;
        float llllllllllllIlIlllIIlIIllllIlllI = 0.0f;
        final String llllllllllllIlIlllIIlIIlllIlllII;
        final char llllllllllllIlIlllIIlIIlllIlllIl = (char)((EnumFacing[])(Object)(llllllllllllIlIlllIIlIIlllIlllII = (String)(Object)EnumFacing.values())).length;
        int llllllllllllIlIlllIIlIIlllIllllI = FaceBakery.lllIlIIIlIllII[1];
        "".length();
        if ((0x31 ^ 0x35) != (0x8D ^ 0x89)) {
            return null;
        }
        while (!lIlIIIIllIlIlIll(llllllllllllIlIlllIIlIIlllIllllI, llllllllllllIlIlllIIlIIlllIlllIl)) {
            final EnumFacing llllllllllllIlIlllIIlIIllllIllIl = llllllllllllIlIlllIIlIIlllIlllII[llllllllllllIlIlllIIlIIlllIllllI];
            final Vec3i llllllllllllIlIlllIIlIIllllIllII = llllllllllllIlIlllIIlIIllllIllIl.getDirectionVec();
            final Vector3f llllllllllllIlIlllIIlIIllllIlIll = new Vector3f((float)llllllllllllIlIlllIIlIIllllIllII.getX(), (float)llllllllllllIlIlllIIlIIllllIllII.getY(), (float)llllllllllllIlIlllIIlIIllllIllII.getZ());
            final float llllllllllllIlIlllIIlIIllllIlIlI = Vector3f.dot(llllllllllllIlIlllIIlIIlllllIIIl, llllllllllllIlIlllIIlIIllllIlIll);
            if (lIlIIIIllIllIIIl(lIlIIIIllIllIIII(llllllllllllIlIlllIIlIIllllIlIlI, 0.0f)) && lIlIIIIllIllIIlI(lIlIIIIllIllIIII(llllllllllllIlIlllIIlIIllllIlIlI, llllllllllllIlIlllIIlIIllllIlllI))) {
                llllllllllllIlIlllIIlIIllllIlllI = llllllllllllIlIlllIIlIIllllIlIlI;
                llllllllllllIlIlllIIlIIllllIllll = llllllllllllIlIlllIIlIIllllIllIl;
            }
            ++llllllllllllIlIlllIIlIIlllIllllI;
        }
        if (lIlIIIIllIlIlIlI(llllllllllllIlIlllIIlIIllllIllll)) {
            return EnumFacing.UP;
        }
        return llllllllllllIlIlllIIlIIllllIllll;
    }
    
    private static int lIlIIIIllIllIlII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void func_178409_a(final int[] llllllllllllIlIlllIIlIIlllIIlIll, final EnumFacing llllllllllllIlIlllIIlIIlllIIlIlI, final BlockFaceUV llllllllllllIlIlllIIlIIlllIIlIIl, final TextureAtlasSprite llllllllllllIlIlllIIlIIlllIIlIII) {
        int llllllllllllIlIlllIIlIIlllIIllIl = FaceBakery.lllIlIIIlIllII[1];
        "".length();
        if (-"   ".length() >= 0) {
            return;
        }
        while (!lIlIIIIllIlIlIll(llllllllllllIlIlllIIlIIlllIIllIl, FaceBakery.lllIlIIIlIllII[2])) {
            this.func_178401_a(llllllllllllIlIlllIIlIIlllIIllIl, llllllllllllIlIlllIIlIIlllIIlIll, llllllllllllIlIlllIIlIIlllIIlIlI, llllllllllllIlIlllIIlIIlllIIlIIl, llllllllllllIlIlllIIlIIlllIIlIII);
            ++llllllllllllIlIlllIIlIIlllIIllIl;
        }
    }
    
    private static boolean lIlIIIIllIllIIIl(final int llllllllllllIlIlllIIlIIlIIIlllII) {
        return llllllllllllIlIlllIIlIIlIIIlllII >= 0;
    }
}
