// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.block.model;

import net.minecraft.util.EnumFacing;
import java.util.Arrays;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;

public class BreakingFour extends BakedQuad
{
    private final /* synthetic */ TextureAtlasSprite texture;
    private static final /* synthetic */ int[] lIlIlIlIIlIIlI;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing;
    
    private void func_178216_a(final int lllllllllllllIIIlIIIlIIIIlIlllll) {
        final int lllllllllllllIIIlIIIlIIIIllIIllI = BreakingFour.lIlIlIlIIlIIlI[2] * lllllllllllllIIIlIIIlIIIIlIlllll;
        final float lllllllllllllIIIlIIIlIIIIllIIlIl = Float.intBitsToFloat(this.vertexData[lllllllllllllIIIlIIIlIIIIllIIllI]);
        final float lllllllllllllIIIlIIIlIIIIllIIlII = Float.intBitsToFloat(this.vertexData[lllllllllllllIIIlIIIlIIIIllIIllI + BreakingFour.lIlIlIlIIlIIlI[3]]);
        final float lllllllllllllIIIlIIIlIIIIllIIIll = Float.intBitsToFloat(this.vertexData[lllllllllllllIIIlIIIlIIIIllIIllI + BreakingFour.lIlIlIlIIlIIlI[4]]);
        float lllllllllllllIIIlIIIlIIIIllIIIlI = 0.0f;
        float lllllllllllllIIIlIIIlIIIIllIIIIl = 0.0f;
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[this.face.ordinal()]) {
            case 1: {
                lllllllllllllIIIlIIIlIIIIllIIIlI = lllllllllllllIIIlIIIlIIIIllIIlIl * 16.0f;
                lllllllllllllIIIlIIIlIIIIllIIIIl = (1.0f - lllllllllllllIIIlIIIlIIIIllIIIll) * 16.0f;
                "".length();
                if ("   ".length() < ((0x72 ^ 0x2E ^ (0x34 ^ 0x3D)) & (0xFE ^ 0xB6 ^ (0x9 ^ 0x14) ^ -" ".length()))) {
                    return;
                }
                break;
            }
            case 2: {
                lllllllllllllIIIlIIIlIIIIllIIIlI = lllllllllllllIIIlIIIlIIIIllIIlIl * 16.0f;
                lllllllllllllIIIlIIIlIIIIllIIIIl = lllllllllllllIIIlIIIlIIIIllIIIll * 16.0f;
                "".length();
                if (" ".length() == 0) {
                    return;
                }
                break;
            }
            case 3: {
                lllllllllllllIIIlIIIlIIIIllIIIlI = (1.0f - lllllllllllllIIIlIIIlIIIIllIIlIl) * 16.0f;
                lllllllllllllIIIlIIIlIIIIllIIIIl = (1.0f - lllllllllllllIIIlIIIlIIIIllIIlII) * 16.0f;
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
                break;
            }
            case 4: {
                lllllllllllllIIIlIIIlIIIIllIIIlI = lllllllllllllIIIlIIIlIIIIllIIlIl * 16.0f;
                lllllllllllllIIIlIIIlIIIIllIIIIl = (1.0f - lllllllllllllIIIlIIIlIIIIllIIlII) * 16.0f;
                "".length();
                if ("  ".length() < -" ".length()) {
                    return;
                }
                break;
            }
            case 5: {
                lllllllllllllIIIlIIIlIIIIllIIIlI = lllllllllllllIIIlIIIlIIIIllIIIll * 16.0f;
                lllllllllllllIIIlIIIlIIIIllIIIIl = (1.0f - lllllllllllllIIIlIIIlIIIIllIIlII) * 16.0f;
                "".length();
                if (" ".length() > "  ".length()) {
                    return;
                }
                break;
            }
            case 6: {
                lllllllllllllIIIlIIIlIIIIllIIIlI = (1.0f - lllllllllllllIIIlIIIlIIIIllIIIll) * 16.0f;
                lllllllllllllIIIlIIIlIIIIllIIIIl = (1.0f - lllllllllllllIIIlIIIlIIIIllIIlII) * 16.0f;
                break;
            }
        }
        this.vertexData[lllllllllllllIIIlIIIlIIIIllIIllI + BreakingFour.lIlIlIlIIlIIlI[1]] = Float.floatToRawIntBits(this.texture.getInterpolatedU(lllllllllllllIIIlIIIlIIIIllIIIlI));
        this.vertexData[lllllllllllllIIIlIIIlIIIIllIIllI + BreakingFour.lIlIlIlIIlIIlI[1] + BreakingFour.lIlIlIlIIlIIlI[3]] = Float.floatToRawIntBits(this.texture.getInterpolatedV(lllllllllllllIIIlIIIlIIIIllIIIIl));
    }
    
    static {
        lllIllIlllIllII();
    }
    
    private static boolean lllIllIlllIlllI(final Object lllllllllllllIIIlIIIlIIIIlIlIIIl) {
        return lllllllllllllIIIlIIIlIIIIlIlIIIl != null;
    }
    
    private static void lllIllIlllIllII() {
        (lIlIlIlIIlIIlI = new int[8])[0] = ((0xA2 ^ 0x8E) & ~(0x36 ^ 0x1A));
        BreakingFour.lIlIlIlIIlIIlI[1] = (0x21 ^ 0x25);
        BreakingFour.lIlIlIlIIlIIlI[2] = (0x7B ^ 0x66 ^ (0x87 ^ 0x9D));
        BreakingFour.lIlIlIlIIlIIlI[3] = " ".length();
        BreakingFour.lIlIlIlIIlIIlI[4] = "  ".length();
        BreakingFour.lIlIlIlIIlIIlI[5] = (0x97 ^ 0x91);
        BreakingFour.lIlIlIlIIlIIlI[6] = "   ".length();
        BreakingFour.lIlIlIlIIlIIlI[7] = (16 + 50 - 1 + 70 ^ 31 + 109 - 82 + 72);
    }
    
    private void func_178217_e() {
        int lllllllllllllIIIlIIIlIIIIlllIIll = BreakingFour.lIlIlIlIIlIIlI[0];
        "".length();
        if ((0xF5 ^ 0x9A ^ (0x73 ^ 0x18)) <= " ".length()) {
            return;
        }
        while (!lllIllIlllIllIl(lllllllllllllIIIlIIIlIIIIlllIIll, BreakingFour.lIlIlIlIIlIIlI[1])) {
            this.func_178216_a(lllllllllllllIIIlIIIlIIIIlllIIll);
            ++lllllllllllllIIIlIIIlIIIIlllIIll;
        }
    }
    
    private static boolean lllIllIlllIllIl(final int lllllllllllllIIIlIIIlIIIIlIlIlII, final int lllllllllllllIIIlIIIlIIIIlIlIIll) {
        return lllllllllllllIIIlIIIlIIIIlIlIlII >= lllllllllllllIIIlIIIlIIIIlIlIIll;
    }
    
    public BreakingFour(final BakedQuad lllllllllllllIIIlIIIlIIIIllllIll, final TextureAtlasSprite lllllllllllllIIIlIIIlIIIIllllIlI) {
        super(Arrays.copyOf(lllllllllllllIIIlIIIlIIIIllllIll.getVertexData(), lllllllllllllIIIlIIIlIIIIllllIll.getVertexData().length), lllllllllllllIIIlIIIlIIIIllllIll.tintIndex, FaceBakery.getFacingFromVertexData(lllllllllllllIIIlIIIlIIIIllllIll.getVertexData()));
        this.texture = lllllllllllllIIIlIIIlIIIIllllIlI;
        this.func_178217_e();
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing = BreakingFour.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
        if (lllIllIlllIlllI($switch_TABLE$net$minecraft$util$EnumFacing)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing;
        }
        "".length();
        final byte lllllllllllllIIIlIIIlIIIIlIlIlll = (Object)new int[EnumFacing.values().length];
        try {
            lllllllllllllIIIlIIIlIIIIlIlIlll[EnumFacing.DOWN.ordinal()] = BreakingFour.lIlIlIlIIlIIlI[3];
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIIlIIIlIIIIlIlIlll[EnumFacing.EAST.ordinal()] = BreakingFour.lIlIlIlIIlIIlI[5];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIIlIIIlIIIIlIlIlll[EnumFacing.NORTH.ordinal()] = BreakingFour.lIlIlIlIIlIIlI[6];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIIIlIIIlIIIIlIlIlll[EnumFacing.SOUTH.ordinal()] = BreakingFour.lIlIlIlIIlIIlI[1];
            "".length();
            if ((31 + 33 + 31 + 42 ^ 86 + 16 - 16 + 54) == 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIIIlIIIlIIIIlIlIlll[EnumFacing.UP.ordinal()] = BreakingFour.lIlIlIlIIlIIlI[4];
            "".length();
            if ((57 + 138 - 139 + 127 ^ 78 + 111 - 79 + 69) > (0x28 ^ 0x51 ^ (0xE6 ^ 0x9B))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIIIlIIIlIIIIlIlIlll[EnumFacing.WEST.ordinal()] = BreakingFour.lIlIlIlIIlIIlI[7];
            "".length();
            if ("   ".length() == " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return BreakingFour.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)lllllllllllllIIIlIIIlIIIIlIlIlll;
    }
}
