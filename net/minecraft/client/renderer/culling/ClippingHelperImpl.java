// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.culling;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.GLAllocation;
import java.nio.FloatBuffer;

public class ClippingHelperImpl extends ClippingHelper
{
    private /* synthetic */ FloatBuffer projectionMatrixBuffer;
    private /* synthetic */ FloatBuffer field_78564_h;
    private /* synthetic */ FloatBuffer modelviewMatrixBuffer;
    private static final /* synthetic */ int[] lIIllllIIIIIIl;
    private static /* synthetic */ ClippingHelperImpl instance;
    
    public ClippingHelperImpl() {
        this.projectionMatrixBuffer = GLAllocation.createDirectFloatBuffer(ClippingHelperImpl.lIIllllIIIIIIl[0]);
        this.modelviewMatrixBuffer = GLAllocation.createDirectFloatBuffer(ClippingHelperImpl.lIIllllIIIIIIl[0]);
        this.field_78564_h = GLAllocation.createDirectFloatBuffer(ClippingHelperImpl.lIIllllIIIIIIl[0]);
    }
    
    static {
        llIlllIIllIIllI();
        ClippingHelperImpl.instance = new ClippingHelperImpl();
    }
    
    private void normalize(final float[] lllllllllllllIIlIIllIIllIIIIIIlI) {
        final float lllllllllllllIIlIIllIIllIIIIIIll = MathHelper.sqrt_float(lllllllllllllIIlIIllIIllIIIIIIlI[ClippingHelperImpl.lIIllllIIIIIIl[1]] * lllllllllllllIIlIIllIIllIIIIIIlI[ClippingHelperImpl.lIIllllIIIIIIl[1]] + lllllllllllllIIlIIllIIllIIIIIIlI[ClippingHelperImpl.lIIllllIIIIIIl[2]] * lllllllllllllIIlIIllIIllIIIIIIlI[ClippingHelperImpl.lIIllllIIIIIIl[2]] + lllllllllllllIIlIIllIIllIIIIIIlI[ClippingHelperImpl.lIIllllIIIIIIl[3]] * lllllllllllllIIlIIllIIllIIIIIIlI[ClippingHelperImpl.lIIllllIIIIIIl[3]]);
        final int n = ClippingHelperImpl.lIIllllIIIIIIl[1];
        lllllllllllllIIlIIllIIllIIIIIIlI[n] /= lllllllllllllIIlIIllIIllIIIIIIll;
        final int n2 = ClippingHelperImpl.lIIllllIIIIIIl[2];
        lllllllllllllIIlIIllIIllIIIIIIlI[n2] /= lllllllllllllIIlIIllIIllIIIIIIll;
        final int n3 = ClippingHelperImpl.lIIllllIIIIIIl[3];
        lllllllllllllIIlIIllIIllIIIIIIlI[n3] /= lllllllllllllIIlIIllIIllIIIIIIll;
        final int n4 = ClippingHelperImpl.lIIllllIIIIIIl[4];
        lllllllllllllIIlIIllIIllIIIIIIlI[n4] /= lllllllllllllIIlIIllIIllIIIIIIll;
    }
    
    private static void llIlllIIllIIllI() {
        (lIIllllIIIIIIl = new int[19])[0] = (0x77 ^ 0x67);
        ClippingHelperImpl.lIIllllIIIIIIl[1] = ((0x78 ^ 0x36 ^ (0xCD ^ 0xB8)) & (0x31 ^ 0x4 ^ (0x4 ^ 0xA) ^ -" ".length()) & (((0xB3 ^ 0x85 ^ (0x20 ^ 0x5)) & (101 + 32 - 103 + 151 ^ 110 + 116 - 61 + 1 ^ -" ".length())) ^ -" ".length()));
        ClippingHelperImpl.lIIllllIIIIIIl[2] = " ".length();
        ClippingHelperImpl.lIIllllIIIIIIl[3] = "  ".length();
        ClippingHelperImpl.lIIllllIIIIIIl[4] = "   ".length();
        ClippingHelperImpl.lIIllllIIIIIIl[5] = (0xFFFF8BA7 & 0x7FFF);
        ClippingHelperImpl.lIIllllIIIIIIl[6] = (-(0xFFFFBBF7 & 0x745A) & (0xFFFFBFFF & 0x7BF7));
        ClippingHelperImpl.lIIllllIIIIIIl[7] = (0x7C ^ 0x78);
        ClippingHelperImpl.lIIllllIIIIIIl[8] = (0x16 ^ 0xB ^ (0x18 ^ 0xD));
        ClippingHelperImpl.lIIllllIIIIIIl[9] = (33 + 83 - 8 + 52 ^ 56 + 34 - 37 + 119);
        ClippingHelperImpl.lIIllllIIIIIIl[10] = (111 + 92 - 199 + 195 ^ 49 + 127 - 89 + 107);
        ClippingHelperImpl.lIIllllIIIIIIl[11] = (0x4A ^ 0x1C ^ (0x47 ^ 0x18));
        ClippingHelperImpl.lIIllllIIIIIIl[12] = (0x4D ^ 0x40);
        ClippingHelperImpl.lIIllllIIIIIIl[13] = (0x69 ^ 0x6F);
        ClippingHelperImpl.lIIllllIIIIIIl[14] = (0x8F ^ 0x91 ^ (0xA6 ^ 0xB2));
        ClippingHelperImpl.lIIllllIIIIIIl[15] = (0x12 ^ 0x1C);
        ClippingHelperImpl.lIIllllIIIIIIl[16] = (0x92 ^ 0x95);
        ClippingHelperImpl.lIIllllIIIIIIl[17] = (0x5A ^ 0x51);
        ClippingHelperImpl.lIIllllIIIIIIl[18] = (0xB6 ^ 0xB9);
    }
    
    public static ClippingHelper getInstance() {
        ClippingHelperImpl.instance.init();
        return ClippingHelperImpl.instance;
    }
    
    public void init() {
        this.projectionMatrixBuffer.clear();
        "".length();
        this.modelviewMatrixBuffer.clear();
        "".length();
        this.field_78564_h.clear();
        "".length();
        GlStateManager.getFloat(ClippingHelperImpl.lIIllllIIIIIIl[5], this.projectionMatrixBuffer);
        GlStateManager.getFloat(ClippingHelperImpl.lIIllllIIIIIIl[6], this.modelviewMatrixBuffer);
        final float[] lllllllllllllIIlIIllIIlIllllIllI = this.projectionMatrix;
        final float[] lllllllllllllIIlIIllIIlIllllIlIl = this.modelviewMatrix;
        this.projectionMatrixBuffer.flip().limit(ClippingHelperImpl.lIIllllIIIIIIl[0]);
        "".length();
        this.projectionMatrixBuffer.get(lllllllllllllIIlIIllIIlIllllIllI);
        "".length();
        this.modelviewMatrixBuffer.flip().limit(ClippingHelperImpl.lIIllllIIIIIIl[0]);
        "".length();
        this.modelviewMatrixBuffer.get(lllllllllllllIIlIIllIIlIllllIlIl);
        "".length();
        this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[1]] = lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[1]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[1]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[2]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[7]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[3]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[8]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[4]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[9]];
        this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[2]] = lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[1]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[2]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[2]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[10]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[3]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[11]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[4]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[12]];
        this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[3]] = lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[1]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[3]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[2]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[13]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[3]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[14]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[4]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[15]];
        this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[4]] = lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[1]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[4]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[2]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[16]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[3]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[17]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[4]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[18]];
        this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[7]] = lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[7]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[1]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[10]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[7]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[13]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[8]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[16]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[9]];
        this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[10]] = lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[7]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[2]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[10]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[10]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[13]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[11]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[16]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[12]];
        this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[13]] = lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[7]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[3]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[10]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[13]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[13]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[14]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[16]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[15]];
        this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[16]] = lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[7]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[4]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[10]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[16]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[13]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[17]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[16]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[18]];
        this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[8]] = lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[8]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[1]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[11]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[7]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[14]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[8]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[17]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[9]];
        this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[11]] = lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[8]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[2]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[11]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[10]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[14]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[11]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[17]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[12]];
        this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[14]] = lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[8]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[3]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[11]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[13]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[14]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[14]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[17]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[15]];
        this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[17]] = lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[8]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[4]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[11]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[16]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[14]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[17]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[17]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[18]];
        this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[9]] = lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[9]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[1]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[12]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[7]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[15]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[8]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[18]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[9]];
        this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[12]] = lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[9]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[2]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[12]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[10]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[15]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[11]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[18]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[12]];
        this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[15]] = lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[9]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[3]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[12]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[13]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[15]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[14]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[18]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[15]];
        this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[18]] = lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[9]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[4]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[12]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[16]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[15]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[17]] + lllllllllllllIIlIIllIIlIllllIlIl[ClippingHelperImpl.lIIllllIIIIIIl[18]] * lllllllllllllIIlIIllIIlIllllIllI[ClippingHelperImpl.lIIllllIIIIIIl[18]];
        final float[] lllllllllllllIIlIIllIIlIllllIlII = this.frustum[ClippingHelperImpl.lIIllllIIIIIIl[1]];
        lllllllllllllIIlIIllIIlIllllIlII[ClippingHelperImpl.lIIllllIIIIIIl[1]] = this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[4]] - this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[1]];
        lllllllllllllIIlIIllIIlIllllIlII[ClippingHelperImpl.lIIllllIIIIIIl[2]] = this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[16]] - this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[7]];
        lllllllllllllIIlIIllIIlIllllIlII[ClippingHelperImpl.lIIllllIIIIIIl[3]] = this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[17]] - this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[8]];
        lllllllllllllIIlIIllIIlIllllIlII[ClippingHelperImpl.lIIllllIIIIIIl[4]] = this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[18]] - this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[9]];
        this.normalize(lllllllllllllIIlIIllIIlIllllIlII);
        final float[] lllllllllllllIIlIIllIIlIllllIIll = this.frustum[ClippingHelperImpl.lIIllllIIIIIIl[2]];
        lllllllllllllIIlIIllIIlIllllIIll[ClippingHelperImpl.lIIllllIIIIIIl[1]] = this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[4]] + this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[1]];
        lllllllllllllIIlIIllIIlIllllIIll[ClippingHelperImpl.lIIllllIIIIIIl[2]] = this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[16]] + this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[7]];
        lllllllllllllIIlIIllIIlIllllIIll[ClippingHelperImpl.lIIllllIIIIIIl[3]] = this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[17]] + this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[8]];
        lllllllllllllIIlIIllIIlIllllIIll[ClippingHelperImpl.lIIllllIIIIIIl[4]] = this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[18]] + this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[9]];
        this.normalize(lllllllllllllIIlIIllIIlIllllIIll);
        final float[] lllllllllllllIIlIIllIIlIllllIIlI = this.frustum[ClippingHelperImpl.lIIllllIIIIIIl[3]];
        lllllllllllllIIlIIllIIlIllllIIlI[ClippingHelperImpl.lIIllllIIIIIIl[1]] = this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[4]] + this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[2]];
        lllllllllllllIIlIIllIIlIllllIIlI[ClippingHelperImpl.lIIllllIIIIIIl[2]] = this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[16]] + this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[10]];
        lllllllllllllIIlIIllIIlIllllIIlI[ClippingHelperImpl.lIIllllIIIIIIl[3]] = this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[17]] + this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[11]];
        lllllllllllllIIlIIllIIlIllllIIlI[ClippingHelperImpl.lIIllllIIIIIIl[4]] = this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[18]] + this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[12]];
        this.normalize(lllllllllllllIIlIIllIIlIllllIIlI);
        final float[] lllllllllllllIIlIIllIIlIllllIIIl = this.frustum[ClippingHelperImpl.lIIllllIIIIIIl[4]];
        lllllllllllllIIlIIllIIlIllllIIIl[ClippingHelperImpl.lIIllllIIIIIIl[1]] = this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[4]] - this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[2]];
        lllllllllllllIIlIIllIIlIllllIIIl[ClippingHelperImpl.lIIllllIIIIIIl[2]] = this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[16]] - this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[10]];
        lllllllllllllIIlIIllIIlIllllIIIl[ClippingHelperImpl.lIIllllIIIIIIl[3]] = this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[17]] - this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[11]];
        lllllllllllllIIlIIllIIlIllllIIIl[ClippingHelperImpl.lIIllllIIIIIIl[4]] = this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[18]] - this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[12]];
        this.normalize(lllllllllllllIIlIIllIIlIllllIIIl);
        final float[] lllllllllllllIIlIIllIIlIllllIIII = this.frustum[ClippingHelperImpl.lIIllllIIIIIIl[7]];
        lllllllllllllIIlIIllIIlIllllIIII[ClippingHelperImpl.lIIllllIIIIIIl[1]] = this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[4]] - this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[3]];
        lllllllllllllIIlIIllIIlIllllIIII[ClippingHelperImpl.lIIllllIIIIIIl[2]] = this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[16]] - this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[13]];
        lllllllllllllIIlIIllIIlIllllIIII[ClippingHelperImpl.lIIllllIIIIIIl[3]] = this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[17]] - this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[14]];
        lllllllllllllIIlIIllIIlIllllIIII[ClippingHelperImpl.lIIllllIIIIIIl[4]] = this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[18]] - this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[15]];
        this.normalize(lllllllllllllIIlIIllIIlIllllIIII);
        final float[] lllllllllllllIIlIIllIIlIlllIllll = this.frustum[ClippingHelperImpl.lIIllllIIIIIIl[10]];
        lllllllllllllIIlIIllIIlIlllIllll[ClippingHelperImpl.lIIllllIIIIIIl[1]] = this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[4]] + this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[3]];
        lllllllllllllIIlIIllIIlIlllIllll[ClippingHelperImpl.lIIllllIIIIIIl[2]] = this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[16]] + this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[13]];
        lllllllllllllIIlIIllIIlIlllIllll[ClippingHelperImpl.lIIllllIIIIIIl[3]] = this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[17]] + this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[14]];
        lllllllllllllIIlIIllIIlIlllIllll[ClippingHelperImpl.lIIllllIIIIIIl[4]] = this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[18]] + this.clippingMatrix[ClippingHelperImpl.lIIllllIIIIIIl[15]];
        this.normalize(lllllllllllllIIlIIllIIlIlllIllll);
    }
}
