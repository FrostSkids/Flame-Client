// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

public class Matrix4f extends org.lwjgl.util.vector.Matrix4f
{
    private static final /* synthetic */ int[] lIIIIIlllIllll;
    
    public Matrix4f(final float[] lllllllllllllIlIIllIlIlllIIIlIII) {
        this.m00 = lllllllllllllIlIIllIlIlllIIIlIII[Matrix4f.lIIIIIlllIllll[0]];
        this.m01 = lllllllllllllIlIIllIlIlllIIIlIII[Matrix4f.lIIIIIlllIllll[1]];
        this.m02 = lllllllllllllIlIIllIlIlllIIIlIII[Matrix4f.lIIIIIlllIllll[2]];
        this.m03 = lllllllllllllIlIIllIlIlllIIIlIII[Matrix4f.lIIIIIlllIllll[3]];
        this.m10 = lllllllllllllIlIIllIlIlllIIIlIII[Matrix4f.lIIIIIlllIllll[4]];
        this.m11 = lllllllllllllIlIIllIlIlllIIIlIII[Matrix4f.lIIIIIlllIllll[5]];
        this.m12 = lllllllllllllIlIIllIlIlllIIIlIII[Matrix4f.lIIIIIlllIllll[6]];
        this.m13 = lllllllllllllIlIIllIlIlllIIIlIII[Matrix4f.lIIIIIlllIllll[7]];
        this.m20 = lllllllllllllIlIIllIlIlllIIIlIII[Matrix4f.lIIIIIlllIllll[8]];
        this.m21 = lllllllllllllIlIIllIlIlllIIIlIII[Matrix4f.lIIIIIlllIllll[9]];
        this.m22 = lllllllllllllIlIIllIlIlllIIIlIII[Matrix4f.lIIIIIlllIllll[10]];
        this.m23 = lllllllllllllIlIIllIlIlllIIIlIII[Matrix4f.lIIIIIlllIllll[11]];
        this.m30 = lllllllllllllIlIIllIlIlllIIIlIII[Matrix4f.lIIIIIlllIllll[12]];
        this.m31 = lllllllllllllIlIIllIlIlllIIIlIII[Matrix4f.lIIIIIlllIllll[13]];
        this.m32 = lllllllllllllIlIIllIlIlllIIIlIII[Matrix4f.lIIIIIlllIllll[14]];
        this.m33 = lllllllllllllIlIIllIlIlllIIIlIII[Matrix4f.lIIIIIlllIllll[15]];
    }
    
    static {
        lIllIllllIlIIll();
    }
    
    private static void lIllIllllIlIIll() {
        (lIIIIIlllIllll = new int[16])[0] = ((199 + 52 - 100 + 75 ^ 165 + 91 - 143 + 53) & (160 + 177 - 100 + 7 ^ 14 + 63 + 18 + 81 ^ -" ".length()));
        Matrix4f.lIIIIIlllIllll[1] = " ".length();
        Matrix4f.lIIIIIlllIllll[2] = "  ".length();
        Matrix4f.lIIIIIlllIllll[3] = "   ".length();
        Matrix4f.lIIIIIlllIllll[4] = (39 + 52 - 55 + 102 ^ 136 + 122 - 160 + 44);
        Matrix4f.lIIIIIlllIllll[5] = (0x71 ^ 0x46 ^ (0xBF ^ 0x8D));
        Matrix4f.lIIIIIlllIllll[6] = (0x38 ^ 0x3E);
        Matrix4f.lIIIIIlllIllll[7] = (0x98 ^ 0x9F);
        Matrix4f.lIIIIIlllIllll[8] = (0x39 ^ 0x3F ^ (0xD ^ 0x3));
        Matrix4f.lIIIIIlllIllll[9] = (0x17 ^ 0x1E);
        Matrix4f.lIIIIIlllIllll[10] = (0xDA ^ 0xBF ^ (0x71 ^ 0x1E));
        Matrix4f.lIIIIIlllIllll[11] = (22 + 49 + 91 + 8 ^ 107 + 137 - 90 + 7);
        Matrix4f.lIIIIIlllIllll[12] = (0x5 ^ 0x9);
        Matrix4f.lIIIIIlllIllll[13] = (0x68 ^ 0x56 ^ (0x37 ^ 0x4));
        Matrix4f.lIIIIIlllIllll[14] = (0x88 ^ 0x86);
        Matrix4f.lIIIIIlllIllll[15] = (0xAB ^ 0xA4);
    }
    
    public Matrix4f() {
        final float n = 0.0f;
        this.m33 = n;
        this.m32 = n;
        this.m31 = n;
        this.m30 = n;
        this.m23 = n;
        this.m22 = n;
        this.m21 = n;
        this.m20 = n;
        this.m13 = n;
        this.m12 = n;
        this.m11 = n;
        this.m10 = n;
        this.m03 = n;
        this.m02 = n;
        this.m01 = n;
        this.m00 = n;
    }
}
