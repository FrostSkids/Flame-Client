// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import net.minecraft.util.MathHelper;
import org.apache.logging.log4j.LogManager;
import java.util.BitSet;
import java.util.Arrays;
import com.google.common.primitives.Floats;
import java.util.Comparator;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ByteBuffer;
import net.minecraft.client.renderer.vertex.VertexFormat;
import java.nio.ShortBuffer;
import java.nio.IntBuffer;
import net.minecraft.client.renderer.vertex.VertexFormatElement;

public class WorldRenderer
{
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumType;
    private /* synthetic */ double yOffset;
    private /* synthetic */ double xOffset;
    private /* synthetic */ VertexFormatElement field_181677_f;
    private /* synthetic */ IntBuffer rawIntBuffer;
    private /* synthetic */ ShortBuffer field_181676_c;
    private /* synthetic */ int field_181678_g;
    private static final /* synthetic */ String[] lIIIllIlIlIlll;
    private /* synthetic */ int drawMode;
    private /* synthetic */ boolean needsUpdate;
    private /* synthetic */ double zOffset;
    private /* synthetic */ int vertexCount;
    private static final /* synthetic */ int[] lIIIllIlIllIlI;
    private /* synthetic */ VertexFormat vertexFormat;
    private /* synthetic */ ByteBuffer byteBuffer;
    private /* synthetic */ FloatBuffer rawFloatBuffer;
    private /* synthetic */ boolean isDrawing;
    
    private static void llIIIlIIlIllIIl() {
        (lIIIllIlIllIlI = new int[19])[0] = (0xA7 ^ 0xC1 ^ (0x5A ^ 0x38));
        WorldRenderer.lIIIllIlIllIlI[1] = (0xFFFF8CC0 & 0x20733F);
        WorldRenderer.lIIIllIlIllIlI[2] = " ".length();
        WorldRenderer.lIIIllIlIllIlI[3] = ((0xCA ^ 0x8C) & ~(0x68 ^ 0x2E));
        WorldRenderer.lIIIllIlIllIlI[4] = "  ".length();
        WorldRenderer.lIIIllIlIllIlI[5] = "   ".length();
        WorldRenderer.lIIIllIlIllIlI[6] = -" ".length();
        WorldRenderer.lIIIllIlIllIlI[7] = 164 + 181 - 200 + 110;
        WorldRenderer.lIIIllIlIllIlI[8] = (0x34 ^ 0x3C);
        WorldRenderer.lIIIllIlIllIlI[9] = (0xF7 ^ 0x93 ^ (0x2F ^ 0x5B));
        WorldRenderer.lIIIllIlIllIlI[10] = -(-(0xFFFFBFDF & 0x6E64) & (0xFFFFAE47 & 0x1007FFB));
        WorldRenderer.lIIIllIlIllIlI[11] = (0x5D ^ 0x45);
        WorldRenderer.lIIIllIlIllIlI[12] = (0x4 ^ 0x8);
        WorldRenderer.lIIIllIlIllIlI[13] = (0x36 ^ 0x65 ^ (0xE ^ 0x5B));
        WorldRenderer.lIIIllIlIllIlI[14] = (-" ".length() & (-1 & 0x7FFF));
        WorldRenderer.lIIIllIlIllIlI[15] = (-1 & 0xFFFF);
        WorldRenderer.lIIIllIlIllIlI[16] = (0x7E ^ 0x57) + (0x36 ^ 0x4A) - (0x3C ^ 0x53) + (0x1B ^ 0x52);
        WorldRenderer.lIIIllIlIllIlI[17] = (42 + 39 - 35 + 97 ^ 27 + 16 + 44 + 49);
        WorldRenderer.lIIIllIlIllIlI[18] = (134 + 47 - 173 + 136 ^ 96 + 107 - 72 + 18);
    }
    
    private int getColorIndex(final int lllllllllllllIlIIIIIIIIIIIlIllII) {
        return ((this.vertexCount - lllllllllllllIlIIIIIIIIIIIlIllII) * this.vertexFormat.getNextOffset() + this.vertexFormat.getColorOffset()) / WorldRenderer.lIIIllIlIllIlI[0];
    }
    
    public State func_181672_a() {
        this.rawIntBuffer.rewind();
        "".length();
        final int lllllllllllllIlIIIIIIIIIllIlIlIl = this.func_181664_j();
        this.rawIntBuffer.limit(lllllllllllllIlIIIIIIIIIllIlIlIl);
        "".length();
        final int[] lllllllllllllIlIIIIIIIIIllIlIlII = new int[lllllllllllllIlIIIIIIIIIllIlIlIl];
        this.rawIntBuffer.get(lllllllllllllIlIIIIIIIIIllIlIlII);
        "".length();
        this.rawIntBuffer.limit(this.rawIntBuffer.capacity());
        "".length();
        this.rawIntBuffer.position(lllllllllllllIlIIIIIIIIIllIlIlIl);
        "".length();
        return new State(lllllllllllllIlIIIIIIIIIllIlIlII, new VertexFormat(this.vertexFormat));
    }
    
    public void putColorRGB_F4(final float lllllllllllllIIlllllllllIIlIllll, final float lllllllllllllIIlllllllllIIlIlIIl, final float lllllllllllllIIlllllllllIIlIlIII) {
        int lllllllllllllIIlllllllllIIlIllII = WorldRenderer.lIIIllIlIllIlI[3];
        "".length();
        if (((0xB ^ 0x27) & ~(0xC ^ 0x20)) > 0) {
            return;
        }
        while (!llIIIlIIlIllIll(lllllllllllllIIlllllllllIIlIllII, WorldRenderer.lIIIllIlIllIlI[0])) {
            this.putColorRGB_F(lllllllllllllIIlllllllllIIlIllll, lllllllllllllIIlllllllllIIlIlIIl, lllllllllllllIIlllllllllIIlIlIII, lllllllllllllIIlllllllllIIlIllII + WorldRenderer.lIIIllIlIllIlI[2]);
            ++lllllllllllllIIlllllllllIIlIllII;
        }
    }
    
    public WorldRenderer pos(final double lllllllllllllIIllllllllllIIIllIl, final double lllllllllllllIIllllllllllIIlIIIl, final double lllllllllllllIIllllllllllIIIlIll) {
        final int lllllllllllllIIllllllllllIIIllll = this.vertexCount * this.vertexFormat.getNextOffset() + this.vertexFormat.func_181720_d(this.field_181678_g);
        switch ($SWITCH_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumType()[this.field_181677_f.getType().ordinal()]) {
            case 1: {
                this.byteBuffer.putFloat(lllllllllllllIIllllllllllIIIllll, (float)(lllllllllllllIIllllllllllIIIllIl + this.xOffset));
                "".length();
                this.byteBuffer.putFloat(lllllllllllllIIllllllllllIIIllll + WorldRenderer.lIIIllIlIllIlI[0], (float)(lllllllllllllIIllllllllllIIlIIIl + this.yOffset));
                "".length();
                this.byteBuffer.putFloat(lllllllllllllIIllllllllllIIIllll + WorldRenderer.lIIIllIlIllIlI[8], (float)(lllllllllllllIIllllllllllIIIlIll + this.zOffset));
                "".length();
                "".length();
                if (" ".length() <= -" ".length()) {
                    return null;
                }
                break;
            }
            case 6:
            case 7: {
                this.byteBuffer.putInt(lllllllllllllIIllllllllllIIIllll, Float.floatToRawIntBits((float)(lllllllllllllIIllllllllllIIIllIl + this.xOffset)));
                "".length();
                this.byteBuffer.putInt(lllllllllllllIIllllllllllIIIllll + WorldRenderer.lIIIllIlIllIlI[0], Float.floatToRawIntBits((float)(lllllllllllllIIllllllllllIIlIIIl + this.yOffset)));
                "".length();
                this.byteBuffer.putInt(lllllllllllllIIllllllllllIIIllll + WorldRenderer.lIIIllIlIllIlI[8], Float.floatToRawIntBits((float)(lllllllllllllIIllllllllllIIIlIll + this.zOffset)));
                "".length();
                "".length();
                if (-"   ".length() >= 0) {
                    return null;
                }
                break;
            }
            case 4:
            case 5: {
                this.byteBuffer.putShort(lllllllllllllIIllllllllllIIIllll, (short)(lllllllllllllIIllllllllllIIIllIl + this.xOffset));
                "".length();
                this.byteBuffer.putShort(lllllllllllllIIllllllllllIIIllll + WorldRenderer.lIIIllIlIllIlI[4], (short)(lllllllllllllIIllllllllllIIlIIIl + this.yOffset));
                "".length();
                this.byteBuffer.putShort(lllllllllllllIIllllllllllIIIllll + WorldRenderer.lIIIllIlIllIlI[0], (short)(lllllllllllllIIllllllllllIIIlIll + this.zOffset));
                "".length();
                "".length();
                if ((0x53 ^ 0x1 ^ (0x55 ^ 0x3)) <= 0) {
                    return null;
                }
                break;
            }
            case 2:
            case 3: {
                this.byteBuffer.put(lllllllllllllIIllllllllllIIIllll, (byte)(lllllllllllllIIllllllllllIIIllIl + this.xOffset));
                "".length();
                this.byteBuffer.put(lllllllllllllIIllllllllllIIIllll + WorldRenderer.lIIIllIlIllIlI[2], (byte)(lllllllllllllIIllllllllllIIlIIIl + this.yOffset));
                "".length();
                this.byteBuffer.put(lllllllllllllIIllllllllllIIIllll + WorldRenderer.lIIIllIlIllIlI[4], (byte)(lllllllllllllIIllllllllllIIIlIll + this.zOffset));
                "".length();
                break;
            }
        }
        this.func_181667_k();
        return this;
    }
    
    private static boolean llIIIlIIlIlllIl(final int lllllllllllllIIllllllllIllllIIII, final int lllllllllllllIIllllllllIlllIllll) {
        return lllllllllllllIIllllllllIllllIIII == lllllllllllllIIllllllllIlllIllll;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumType() {
        final int[] $switch_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumType = WorldRenderer.$SWITCH_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumType;
        if (llIIIlIIllIIIlI($switch_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumType)) {
            return $switch_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumType;
        }
        "".length();
        final long lllllllllllllIIlllllllllIIlIIlIl = (Object)new int[VertexFormatElement.EnumType.values().length];
        try {
            lllllllllllllIIlllllllllIIlIIlIl[VertexFormatElement.EnumType.BYTE.ordinal()] = WorldRenderer.lIIIllIlIllIlI[5];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIlllllllllIIlIIlIl[VertexFormatElement.EnumType.FLOAT.ordinal()] = WorldRenderer.lIIIllIlIllIlI[2];
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIlllllllllIIlIIlIl[VertexFormatElement.EnumType.INT.ordinal()] = WorldRenderer.lIIIllIlIllIlI[17];
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIIlllllllllIIlIIlIl[VertexFormatElement.EnumType.SHORT.ordinal()] = WorldRenderer.lIIIllIlIllIlI[18];
            "".length();
            if (((0xAE ^ 0xBD) & ~(0x6 ^ 0x15)) > ((0x88 ^ 0xA5) & ~(0x22 ^ 0xF))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIIlllllllllIIlIIlIl[VertexFormatElement.EnumType.UBYTE.ordinal()] = WorldRenderer.lIIIllIlIllIlI[4];
            "".length();
            if ((" ".length() & (" ".length() ^ -" ".length())) < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIIlllllllllIIlIIlIl[VertexFormatElement.EnumType.UINT.ordinal()] = WorldRenderer.lIIIllIlIllIlI[13];
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        try {
            lllllllllllllIIlllllllllIIlIIlIl[VertexFormatElement.EnumType.USHORT.ordinal()] = WorldRenderer.lIIIllIlIllIlI[0];
            "".length();
            if ("   ".length() > (0x9D ^ 0x99)) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError7) {
            "".length();
        }
        return WorldRenderer.$SWITCH_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumType = (int[])(Object)lllllllllllllIIlllllllllIIlIIlIl;
    }
    
    private static boolean llIIIlIIlIllllI(final int lllllllllllllIIllllllllIllIllIll) {
        return lllllllllllllIIllllllllIllIllIll != 0;
    }
    
    public WorldRenderer normal(final float lllllllllllllIIlllllllllIlIlllIl, final float lllllllllllllIIlllllllllIllIIIIl, final float lllllllllllllIIlllllllllIlIllIll) {
        final int lllllllllllllIIlllllllllIlIlllll = this.vertexCount * this.vertexFormat.getNextOffset() + this.vertexFormat.func_181720_d(this.field_181678_g);
        switch ($SWITCH_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumType()[this.field_181677_f.getType().ordinal()]) {
            case 1: {
                this.byteBuffer.putFloat(lllllllllllllIIlllllllllIlIlllll, lllllllllllllIIlllllllllIlIlllIl);
                "".length();
                this.byteBuffer.putFloat(lllllllllllllIIlllllllllIlIlllll + WorldRenderer.lIIIllIlIllIlI[0], lllllllllllllIIlllllllllIllIIIIl);
                "".length();
                this.byteBuffer.putFloat(lllllllllllllIIlllllllllIlIlllll + WorldRenderer.lIIIllIlIllIlI[8], lllllllllllllIIlllllllllIlIllIll);
                "".length();
                "".length();
                if ("   ".length() == 0) {
                    return null;
                }
                break;
            }
            case 6:
            case 7: {
                this.byteBuffer.putInt(lllllllllllllIIlllllllllIlIlllll, (int)lllllllllllllIIlllllllllIlIlllIl);
                "".length();
                this.byteBuffer.putInt(lllllllllllllIIlllllllllIlIlllll + WorldRenderer.lIIIllIlIllIlI[0], (int)lllllllllllllIIlllllllllIllIIIIl);
                "".length();
                this.byteBuffer.putInt(lllllllllllllIIlllllllllIlIlllll + WorldRenderer.lIIIllIlIllIlI[8], (int)lllllllllllllIIlllllllllIlIllIll);
                "".length();
                "".length();
                if (" ".length() == 0) {
                    return null;
                }
                break;
            }
            case 4:
            case 5: {
                this.byteBuffer.putShort(lllllllllllllIIlllllllllIlIlllll, (short)((int)lllllllllllllIIlllllllllIlIlllIl * WorldRenderer.lIIIllIlIllIlI[14] & WorldRenderer.lIIIllIlIllIlI[15]));
                "".length();
                this.byteBuffer.putShort(lllllllllllllIIlllllllllIlIlllll + WorldRenderer.lIIIllIlIllIlI[4], (short)((int)lllllllllllllIIlllllllllIllIIIIl * WorldRenderer.lIIIllIlIllIlI[14] & WorldRenderer.lIIIllIlIllIlI[15]));
                "".length();
                this.byteBuffer.putShort(lllllllllllllIIlllllllllIlIlllll + WorldRenderer.lIIIllIlIllIlI[0], (short)((int)lllllllllllllIIlllllllllIlIllIll * WorldRenderer.lIIIllIlIllIlI[14] & WorldRenderer.lIIIllIlIllIlI[15]));
                "".length();
                "".length();
                if ("  ".length() == 0) {
                    return null;
                }
                break;
            }
            case 2:
            case 3: {
                this.byteBuffer.put(lllllllllllllIIlllllllllIlIlllll, (byte)((int)lllllllllllllIIlllllllllIlIlllIl * WorldRenderer.lIIIllIlIllIlI[16] & WorldRenderer.lIIIllIlIllIlI[7]));
                "".length();
                this.byteBuffer.put(lllllllllllllIIlllllllllIlIlllll + WorldRenderer.lIIIllIlIllIlI[2], (byte)((int)lllllllllllllIIlllllllllIllIIIIl * WorldRenderer.lIIIllIlIllIlI[16] & WorldRenderer.lIIIllIlIllIlI[7]));
                "".length();
                this.byteBuffer.put(lllllllllllllIIlllllllllIlIlllll + WorldRenderer.lIIIllIlIllIlI[4], (byte)((int)lllllllllllllIIlllllllllIlIllIll * WorldRenderer.lIIIllIlIllIlI[16] & WorldRenderer.lIIIllIlIllIlI[7]));
                "".length();
                break;
            }
        }
        this.func_181667_k();
        return this;
    }
    
    public WorldRenderer(final int lllllllllllllIlIIIIIIIIlIIIllllI) {
        this.byteBuffer = GLAllocation.createDirectByteBuffer(lllllllllllllIlIIIIIIIIlIIIllllI * WorldRenderer.lIIIllIlIllIlI[0]);
        this.rawIntBuffer = this.byteBuffer.asIntBuffer();
        this.field_181676_c = this.byteBuffer.asShortBuffer();
        this.rawFloatBuffer = this.byteBuffer.asFloatBuffer();
    }
    
    private static boolean llIIIlIIlIllIll(final int lllllllllllllIIllllllllIlllIllII, final int lllllllllllllIIllllllllIlllIlIll) {
        return lllllllllllllIIllllllllIlllIllII >= lllllllllllllIIllllllllIlllIlIll;
    }
    
    static {
        llIIIlIIlIllIIl();
        llIIIlIIlIlIlII();
    }
    
    private static boolean llIIIlIIlIllIlI(final int lllllllllllllIIllllllllIlllIIlII, final int lllllllllllllIIllllllllIlllIIIll) {
        return lllllllllllllIIllllllllIlllIIlII > lllllllllllllIIllllllllIlllIIIll;
    }
    
    public WorldRenderer tex(final double lllllllllllllIlIIIIIIIIIIlllIIll, final double lllllllllllllIlIIIIIIIIIIlllIllI) {
        final int lllllllllllllIlIIIIIIIIIIlllIlIl = this.vertexCount * this.vertexFormat.getNextOffset() + this.vertexFormat.func_181720_d(this.field_181678_g);
        switch ($SWITCH_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumType()[this.field_181677_f.getType().ordinal()]) {
            case 1: {
                this.byteBuffer.putFloat(lllllllllllllIlIIIIIIIIIIlllIlIl, (float)lllllllllllllIlIIIIIIIIIIlllIIll);
                "".length();
                this.byteBuffer.putFloat(lllllllllllllIlIIIIIIIIIIlllIlIl + WorldRenderer.lIIIllIlIllIlI[0], (float)lllllllllllllIlIIIIIIIIIIlllIllI);
                "".length();
                "".length();
                if ("  ".length() > "  ".length()) {
                    return null;
                }
                break;
            }
            case 6:
            case 7: {
                this.byteBuffer.putInt(lllllllllllllIlIIIIIIIIIIlllIlIl, (int)lllllllllllllIlIIIIIIIIIIlllIIll);
                "".length();
                this.byteBuffer.putInt(lllllllllllllIlIIIIIIIIIIlllIlIl + WorldRenderer.lIIIllIlIllIlI[0], (int)lllllllllllllIlIIIIIIIIIIlllIllI);
                "".length();
                "".length();
                if (((2 + 101 - 12 + 46 ^ 114 + 111 - 202 + 146) & (0x7F ^ 0x6 ^ (0x10 ^ 0x49) ^ -" ".length())) < 0) {
                    return null;
                }
                break;
            }
            case 4:
            case 5: {
                this.byteBuffer.putShort(lllllllllllllIlIIIIIIIIIIlllIlIl, (short)lllllllllllllIlIIIIIIIIIIlllIllI);
                "".length();
                this.byteBuffer.putShort(lllllllllllllIlIIIIIIIIIIlllIlIl + WorldRenderer.lIIIllIlIllIlI[4], (short)lllllllllllllIlIIIIIIIIIIlllIIll);
                "".length();
                "".length();
                if (((0xAD ^ 0x92 ^ (0x24 ^ 0x11)) & (101 + 94 - 169 + 148 ^ 58 + 62 - 63 + 107 ^ -" ".length())) < 0) {
                    return null;
                }
                break;
            }
            case 2:
            case 3: {
                this.byteBuffer.put(lllllllllllllIlIIIIIIIIIIlllIlIl, (byte)lllllllllllllIlIIIIIIIIIIlllIllI);
                "".length();
                this.byteBuffer.put(lllllllllllllIlIIIIIIIIIIlllIlIl + WorldRenderer.lIIIllIlIllIlI[2], (byte)lllllllllllllIlIIIIIIIIIIlllIIll);
                "".length();
                break;
            }
        }
        this.func_181667_k();
        return this;
    }
    
    public void addVertexData(final int[] lllllllllllllIIllllllllllIIllllI) {
        this.func_181670_b(lllllllllllllIIllllllllllIIllllI.length);
        this.rawIntBuffer.position(this.func_181664_j());
        "".length();
        this.rawIntBuffer.put(lllllllllllllIIllllllllllIIllllI);
        "".length();
        this.vertexCount += lllllllllllllIIllllllllllIIllllI.length / this.vertexFormat.func_181719_f();
    }
    
    public void putBrightness4(final int lllllllllllllIlIIIIIIIIIIlIlIlIl, final int lllllllllllllIlIIIIIIIIIIlIlIlII, final int lllllllllllllIlIIIIIIIIIIlIlIIll, final int lllllllllllllIlIIIIIIIIIIlIlIIlI) {
        final int lllllllllllllIlIIIIIIIIIIlIllIII = (this.vertexCount - WorldRenderer.lIIIllIlIllIlI[0]) * this.vertexFormat.func_181719_f() + this.vertexFormat.getUvOffsetById(WorldRenderer.lIIIllIlIllIlI[2]) / WorldRenderer.lIIIllIlIllIlI[0];
        final int lllllllllllllIlIIIIIIIIIIlIlIlll = this.vertexFormat.getNextOffset() >> WorldRenderer.lIIIllIlIllIlI[4];
        this.rawIntBuffer.put(lllllllllllllIlIIIIIIIIIIlIllIII, lllllllllllllIlIIIIIIIIIIlIlIlIl);
        "".length();
        this.rawIntBuffer.put(lllllllllllllIlIIIIIIIIIIlIllIII + lllllllllllllIlIIIIIIIIIIlIlIlll, lllllllllllllIlIIIIIIIIIIlIlIlII);
        "".length();
        this.rawIntBuffer.put(lllllllllllllIlIIIIIIIIIIlIllIII + lllllllllllllIlIIIIIIIIIIlIlIlll * WorldRenderer.lIIIllIlIllIlI[4], lllllllllllllIlIIIIIIIIIIlIlIIll);
        "".length();
        this.rawIntBuffer.put(lllllllllllllIlIIIIIIIIIIlIllIII + lllllllllllllIlIIIIIIIIIIlIlIlll * WorldRenderer.lIIIllIlIllIlI[5], lllllllllllllIlIIIIIIIIIIlIlIIlI);
        "".length();
    }
    
    public ByteBuffer getByteBuffer() {
        return this.byteBuffer;
    }
    
    public void reset() {
        this.vertexCount = WorldRenderer.lIIIllIlIllIlI[3];
        this.field_181677_f = null;
        this.field_181678_g = WorldRenderer.lIIIllIlIllIlI[3];
    }
    
    public WorldRenderer color(final float lllllllllllllIIllllllllllIllllII, final float lllllllllllllIIllllllllllIlllIll, final float lllllllllllllIIllllllllllIllIlIl, final float lllllllllllllIIllllllllllIlllIIl) {
        return this.color((int)(lllllllllllllIIllllllllllIllllII * 255.0f), (int)(lllllllllllllIIllllllllllIlllIll * 255.0f), (int)(lllllllllllllIIllllllllllIllIlIl * 255.0f), (int)(lllllllllllllIIllllllllllIlllIIl * 255.0f));
    }
    
    public void finishDrawing() {
        if (llIIIlIIlIlllll(this.isDrawing ? 1 : 0)) {
            throw new IllegalStateException(WorldRenderer.lIIIllIlIlIlll[WorldRenderer.lIIIllIlIllIlI[0]]);
        }
        this.isDrawing = (WorldRenderer.lIIIllIlIllIlI[3] != 0);
        this.byteBuffer.position(WorldRenderer.lIIIllIlIllIlI[3]);
        "".length();
        this.byteBuffer.limit(this.func_181664_j() * WorldRenderer.lIIIllIlIllIlI[0]);
        "".length();
    }
    
    private static float func_181665_a(final FloatBuffer lllllllllllllIlIIIIIIIIIlIlllIII, final float lllllllllllllIlIIIIIIIIIlIllIlll, final float lllllllllllllIlIIIIIIIIIlIlIIIIl, final float lllllllllllllIlIIIIIIIIIlIllIlIl, final int lllllllllllllIlIIIIIIIIIlIIlllll, final int lllllllllllllIlIIIIIIIIIlIIllllI) {
        final float lllllllllllllIlIIIIIIIIIlIllIIlI = lllllllllllllIlIIIIIIIIIlIlllIII.get(lllllllllllllIlIIIIIIIIIlIIllllI + lllllllllllllIlIIIIIIIIIlIIlllll * WorldRenderer.lIIIllIlIllIlI[3] + WorldRenderer.lIIIllIlIllIlI[3]);
        final float lllllllllllllIlIIIIIIIIIlIllIIIl = lllllllllllllIlIIIIIIIIIlIlllIII.get(lllllllllllllIlIIIIIIIIIlIIllllI + lllllllllllllIlIIIIIIIIIlIIlllll * WorldRenderer.lIIIllIlIllIlI[3] + WorldRenderer.lIIIllIlIllIlI[2]);
        final float lllllllllllllIlIIIIIIIIIlIllIIII = lllllllllllllIlIIIIIIIIIlIlllIII.get(lllllllllllllIlIIIIIIIIIlIIllllI + lllllllllllllIlIIIIIIIIIlIIlllll * WorldRenderer.lIIIllIlIllIlI[3] + WorldRenderer.lIIIllIlIllIlI[4]);
        final float lllllllllllllIlIIIIIIIIIlIlIllll = lllllllllllllIlIIIIIIIIIlIlllIII.get(lllllllllllllIlIIIIIIIIIlIIllllI + lllllllllllllIlIIIIIIIIIlIIlllll * WorldRenderer.lIIIllIlIllIlI[2] + WorldRenderer.lIIIllIlIllIlI[3]);
        final float lllllllllllllIlIIIIIIIIIlIlIlllI = lllllllllllllIlIIIIIIIIIlIlllIII.get(lllllllllllllIlIIIIIIIIIlIIllllI + lllllllllllllIlIIIIIIIIIlIIlllll * WorldRenderer.lIIIllIlIllIlI[2] + WorldRenderer.lIIIllIlIllIlI[2]);
        final float lllllllllllllIlIIIIIIIIIlIlIllIl = lllllllllllllIlIIIIIIIIIlIlllIII.get(lllllllllllllIlIIIIIIIIIlIIllllI + lllllllllllllIlIIIIIIIIIlIIlllll * WorldRenderer.lIIIllIlIllIlI[2] + WorldRenderer.lIIIllIlIllIlI[4]);
        final float lllllllllllllIlIIIIIIIIIlIlIllII = lllllllllllllIlIIIIIIIIIlIlllIII.get(lllllllllllllIlIIIIIIIIIlIIllllI + lllllllllllllIlIIIIIIIIIlIIlllll * WorldRenderer.lIIIllIlIllIlI[4] + WorldRenderer.lIIIllIlIllIlI[3]);
        final float lllllllllllllIlIIIIIIIIIlIlIlIll = lllllllllllllIlIIIIIIIIIlIlllIII.get(lllllllllllllIlIIIIIIIIIlIIllllI + lllllllllllllIlIIIIIIIIIlIIlllll * WorldRenderer.lIIIllIlIllIlI[4] + WorldRenderer.lIIIllIlIllIlI[2]);
        final float lllllllllllllIlIIIIIIIIIlIlIlIlI = lllllllllllllIlIIIIIIIIIlIlllIII.get(lllllllllllllIlIIIIIIIIIlIIllllI + lllllllllllllIlIIIIIIIIIlIIlllll * WorldRenderer.lIIIllIlIllIlI[4] + WorldRenderer.lIIIllIlIllIlI[4]);
        final float lllllllllllllIlIIIIIIIIIlIlIlIIl = lllllllllllllIlIIIIIIIIIlIlllIII.get(lllllllllllllIlIIIIIIIIIlIIllllI + lllllllllllllIlIIIIIIIIIlIIlllll * WorldRenderer.lIIIllIlIllIlI[5] + WorldRenderer.lIIIllIlIllIlI[3]);
        final float lllllllllllllIlIIIIIIIIIlIlIlIII = lllllllllllllIlIIIIIIIIIlIlllIII.get(lllllllllllllIlIIIIIIIIIlIIllllI + lllllllllllllIlIIIIIIIIIlIIlllll * WorldRenderer.lIIIllIlIllIlI[5] + WorldRenderer.lIIIllIlIllIlI[2]);
        final float lllllllllllllIlIIIIIIIIIlIlIIlll = lllllllllllllIlIIIIIIIIIlIlllIII.get(lllllllllllllIlIIIIIIIIIlIIllllI + lllllllllllllIlIIIIIIIIIlIIlllll * WorldRenderer.lIIIllIlIllIlI[5] + WorldRenderer.lIIIllIlIllIlI[4]);
        final float lllllllllllllIlIIIIIIIIIlIlIIllI = (lllllllllllllIlIIIIIIIIIlIllIIlI + lllllllllllllIlIIIIIIIIIlIlIllll + lllllllllllllIlIIIIIIIIIlIlIllII + lllllllllllllIlIIIIIIIIIlIlIlIIl) * 0.25f - lllllllllllllIlIIIIIIIIIlIllIlll;
        final float lllllllllllllIlIIIIIIIIIlIlIIlIl = (lllllllllllllIlIIIIIIIIIlIllIIIl + lllllllllllllIlIIIIIIIIIlIlIlllI + lllllllllllllIlIIIIIIIIIlIlIlIll + lllllllllllllIlIIIIIIIIIlIlIlIII) * 0.25f - lllllllllllllIlIIIIIIIIIlIlIIIIl;
        final float lllllllllllllIlIIIIIIIIIlIlIIlII = (lllllllllllllIlIIIIIIIIIlIllIIII + lllllllllllllIlIIIIIIIIIlIlIllIl + lllllllllllllIlIIIIIIIIIlIlIlIlI + lllllllllllllIlIIIIIIIIIlIlIIlll) * 0.25f - lllllllllllllIlIIIIIIIIIlIllIlIl;
        return lllllllllllllIlIIIIIIIIIlIlIIllI * lllllllllllllIlIIIIIIIIIlIlIIllI + lllllllllllllIlIIIIIIIIIlIlIIlIl * lllllllllllllIlIIIIIIIIIlIlIIlIl + lllllllllllllIlIIIIIIIIIlIlIIlII * lllllllllllllIlIIIIIIIIIlIlIIlII;
    }
    
    public WorldRenderer lightmap(final int lllllllllllllIlIIIIIIIIIIllIlIll, final int lllllllllllllIlIIIIIIIIIIllIlIlI) {
        final int lllllllllllllIlIIIIIIIIIIllIlIIl = this.vertexCount * this.vertexFormat.getNextOffset() + this.vertexFormat.func_181720_d(this.field_181678_g);
        switch ($SWITCH_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumType()[this.field_181677_f.getType().ordinal()]) {
            case 1: {
                this.byteBuffer.putFloat(lllllllllllllIlIIIIIIIIIIllIlIIl, (float)lllllllllllllIlIIIIIIIIIIllIlIll);
                "".length();
                this.byteBuffer.putFloat(lllllllllllllIlIIIIIIIIIIllIlIIl + WorldRenderer.lIIIllIlIllIlI[0], (float)lllllllllllllIlIIIIIIIIIIllIlIlI);
                "".length();
                "".length();
                if (-" ".length() != -" ".length()) {
                    return null;
                }
                break;
            }
            case 6:
            case 7: {
                this.byteBuffer.putInt(lllllllllllllIlIIIIIIIIIIllIlIIl, lllllllllllllIlIIIIIIIIIIllIlIll);
                "".length();
                this.byteBuffer.putInt(lllllllllllllIlIIIIIIIIIIllIlIIl + WorldRenderer.lIIIllIlIllIlI[0], lllllllllllllIlIIIIIIIIIIllIlIlI);
                "".length();
                "".length();
                if (null != null) {
                    return null;
                }
                break;
            }
            case 4:
            case 5: {
                this.byteBuffer.putShort(lllllllllllllIlIIIIIIIIIIllIlIIl, (short)lllllllllllllIlIIIIIIIIIIllIlIlI);
                "".length();
                this.byteBuffer.putShort(lllllllllllllIlIIIIIIIIIIllIlIIl + WorldRenderer.lIIIllIlIllIlI[4], (short)lllllllllllllIlIIIIIIIIIIllIlIll);
                "".length();
                "".length();
                if (null != null) {
                    return null;
                }
                break;
            }
            case 2:
            case 3: {
                this.byteBuffer.put(lllllllllllllIlIIIIIIIIIIllIlIIl, (byte)lllllllllllllIlIIIIIIIIIIllIlIlI);
                "".length();
                this.byteBuffer.put(lllllllllllllIlIIIIIIIIIIllIlIIl + WorldRenderer.lIIIllIlIllIlI[2], (byte)lllllllllllllIlIIIIIIIIIIllIlIll);
                "".length();
                break;
            }
        }
        this.func_181667_k();
        return this;
    }
    
    private void putColor(final int lllllllllllllIIllllllllllllllIIl, final int lllllllllllllIlIIIIIIIIIIIIIIIII) {
        final int lllllllllllllIIlllllllllllllllll = this.getColorIndex(lllllllllllllIlIIIIIIIIIIIIIIIII);
        final int lllllllllllllIIllllllllllllllllI = lllllllllllllIIllllllllllllllIIl >> WorldRenderer.lIIIllIlIllIlI[9] & WorldRenderer.lIIIllIlIllIlI[7];
        final int lllllllllllllIIlllllllllllllllIl = lllllllllllllIIllllllllllllllIIl >> WorldRenderer.lIIIllIlIllIlI[8] & WorldRenderer.lIIIllIlIllIlI[7];
        final int lllllllllllllIIlllllllllllllllII = lllllllllllllIIllllllllllllllIIl & WorldRenderer.lIIIllIlIllIlI[7];
        final int lllllllllllllIIllllllllllllllIll = lllllllllllllIIllllllllllllllIIl >> WorldRenderer.lIIIllIlIllIlI[11] & WorldRenderer.lIIIllIlIllIlI[7];
        this.putColorRGBA(lllllllllllllIIlllllllllllllllll, lllllllllllllIIllllllllllllllllI, lllllllllllllIIlllllllllllllllIl, lllllllllllllIIlllllllllllllllII, lllllllllllllIIllllllllllllllIll);
    }
    
    public void putColorMultiplier(final float lllllllllllllIlIIIIIIIIIIIIlIIll, final float lllllllllllllIlIIIIIIIIIIIIlIIlI, final float lllllllllllllIlIIIIIIIIIIIIllllI, final int lllllllllllllIlIIIIIIIIIIIIlIIII) {
        final int lllllllllllllIlIIIIIIIIIIIIlllII = this.getColorIndex(lllllllllllllIlIIIIIIIIIIIIlIIII);
        int lllllllllllllIlIIIIIIIIIIIIllIll = WorldRenderer.lIIIllIlIllIlI[6];
        if (llIIIlIIlIlllll(this.needsUpdate ? 1 : 0)) {
            lllllllllllllIlIIIIIIIIIIIIllIll = this.rawIntBuffer.get(lllllllllllllIlIIIIIIIIIIIIlllII);
            if (llIIIlIIllIIIII(ByteOrder.nativeOrder(), ByteOrder.LITTLE_ENDIAN)) {
                final int lllllllllllllIlIIIIIIIIIIIIllIlI = (int)((lllllllllllllIlIIIIIIIIIIIIllIll & WorldRenderer.lIIIllIlIllIlI[7]) * lllllllllllllIlIIIIIIIIIIIIlIIll);
                final int lllllllllllllIlIIIIIIIIIIIIllIIl = (int)((lllllllllllllIlIIIIIIIIIIIIllIll >> WorldRenderer.lIIIllIlIllIlI[8] & WorldRenderer.lIIIllIlIllIlI[7]) * lllllllllllllIlIIIIIIIIIIIIlIIlI);
                final int lllllllllllllIlIIIIIIIIIIIIllIII = (int)((lllllllllllllIlIIIIIIIIIIIIllIll >> WorldRenderer.lIIIllIlIllIlI[9] & WorldRenderer.lIIIllIlIllIlI[7]) * lllllllllllllIlIIIIIIIIIIIIllllI);
                lllllllllllllIlIIIIIIIIIIIIllIll &= WorldRenderer.lIIIllIlIllIlI[10];
                lllllllllllllIlIIIIIIIIIIIIllIll = (lllllllllllllIlIIIIIIIIIIIIllIll | lllllllllllllIlIIIIIIIIIIIIllIII << WorldRenderer.lIIIllIlIllIlI[9] | lllllllllllllIlIIIIIIIIIIIIllIIl << WorldRenderer.lIIIllIlIllIlI[8] | lllllllllllllIlIIIIIIIIIIIIllIlI);
                "".length();
                if (-(111 + 148 - 240 + 153 ^ 36 + 51 + 67 + 14) >= 0) {
                    return;
                }
            }
            else {
                final int lllllllllllllIlIIIIIIIIIIIIlIlll = (int)((lllllllllllllIlIIIIIIIIIIIIllIll >> WorldRenderer.lIIIllIlIllIlI[11] & WorldRenderer.lIIIllIlIllIlI[7]) * lllllllllllllIlIIIIIIIIIIIIlIIll);
                final int lllllllllllllIlIIIIIIIIIIIIlIllI = (int)((lllllllllllllIlIIIIIIIIIIIIllIll >> WorldRenderer.lIIIllIlIllIlI[9] & WorldRenderer.lIIIllIlIllIlI[7]) * lllllllllllllIlIIIIIIIIIIIIlIIlI);
                final int lllllllllllllIlIIIIIIIIIIIIlIlIl = (int)((lllllllllllllIlIIIIIIIIIIIIllIll >> WorldRenderer.lIIIllIlIllIlI[8] & WorldRenderer.lIIIllIlIllIlI[7]) * lllllllllllllIlIIIIIIIIIIIIllllI);
                lllllllllllllIlIIIIIIIIIIIIllIll &= WorldRenderer.lIIIllIlIllIlI[7];
                lllllllllllllIlIIIIIIIIIIIIllIll = (lllllllllllllIlIIIIIIIIIIIIllIll | lllllllllllllIlIIIIIIIIIIIIlIlll << WorldRenderer.lIIIllIlIllIlI[11] | lllllllllllllIlIIIIIIIIIIIIlIllI << WorldRenderer.lIIIllIlIllIlI[9] | lllllllllllllIlIIIIIIIIIIIIlIlIl << WorldRenderer.lIIIllIlIllIlI[8]);
            }
        }
        this.rawIntBuffer.put(lllllllllllllIlIIIIIIIIIIIIlllII, lllllllllllllIlIIIIIIIIIIIIllIll);
        "".length();
    }
    
    private static String llIIIlIIlIIllll(final String lllllllllllllIIlllllllllIIIIIIll, final String lllllllllllllIIlllllllllIIIIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlllllllllIIIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllllllllIIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllllllllIIIIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllllllllIIIIIlll.init(WorldRenderer.lIIIllIlIllIlI[4], lllllllllllllIIlllllllllIIIIlIII);
            return new String(lllllllllllllIIlllllllllIIIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllllllllIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllllllllIIIIIllI) {
            lllllllllllllIIlllllllllIIIIIllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIIlIIlIlllll(final int lllllllllllllIIllllllllIllIllIIl) {
        return lllllllllllllIIllllllllIllIllIIl == 0;
    }
    
    private static String llIIIlIIlIlIIll(String lllllllllllllIIlllllllllIIIlIlIl, final String lllllllllllllIIlllllllllIIIllIIl) {
        lllllllllllllIIlllllllllIIIlIlIl = new String(Base64.getDecoder().decode(lllllllllllllIIlllllllllIIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllllllllIIIllIII = new StringBuilder();
        final char[] lllllllllllllIIlllllllllIIIlIlll = lllllllllllllIIlllllllllIIIllIIl.toCharArray();
        int lllllllllllllIIlllllllllIIIlIllI = WorldRenderer.lIIIllIlIllIlI[3];
        final char lllllllllllllIIlllllllllIIIlIIII = (Object)lllllllllllllIIlllllllllIIIlIlIl.toCharArray();
        final boolean lllllllllllllIIlllllllllIIIIllll = lllllllllllllIIlllllllllIIIlIIII.length != 0;
        char lllllllllllllIIlllllllllIIIIlllI = (char)WorldRenderer.lIIIllIlIllIlI[3];
        while (llIIIlIIllIIIll(lllllllllllllIIlllllllllIIIIlllI, lllllllllllllIIlllllllllIIIIllll ? 1 : 0)) {
            final char lllllllllllllIIlllllllllIIIllIll = lllllllllllllIIlllllllllIIIlIIII[lllllllllllllIIlllllllllIIIIlllI];
            lllllllllllllIIlllllllllIIIllIII.append((char)(lllllllllllllIIlllllllllIIIllIll ^ lllllllllllllIIlllllllllIIIlIlll[lllllllllllllIIlllllllllIIIlIllI % lllllllllllllIIlllllllllIIIlIlll.length]));
            "".length();
            ++lllllllllllllIIlllllllllIIIlIllI;
            ++lllllllllllllIIlllllllllIIIIlllI;
            "".length();
            if (-" ".length() == (0x1D ^ 0x19)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllllllllIIIllIII);
    }
    
    public void putPosition(final double lllllllllllllIlIIIIIIIIIIIlllIlI, final double lllllllllllllIlIIIIIIIIIIIlllIIl, final double lllllllllllllIlIIIIIIIIIIlIIIIlI) {
        final int lllllllllllllIlIIIIIIIIIIlIIIIIl = this.vertexFormat.func_181719_f();
        final int lllllllllllllIlIIIIIIIIIIlIIIIII = (this.vertexCount - WorldRenderer.lIIIllIlIllIlI[0]) * lllllllllllllIlIIIIIIIIIIlIIIIIl;
        int lllllllllllllIlIIIIIIIIIIIllllll = WorldRenderer.lIIIllIlIllIlI[3];
        "".length();
        if (((0x3C ^ 0x1F ^ (0xC7 ^ 0xA5)) & (125 + 176 - 231 + 147 ^ 74 + 66 - 122 + 134 ^ -" ".length())) != 0x0) {
            return;
        }
        while (!llIIIlIIlIllIll(lllllllllllllIlIIIIIIIIIIIllllll, WorldRenderer.lIIIllIlIllIlI[0])) {
            final int lllllllllllllIlIIIIIIIIIIIlllllI = lllllllllllllIlIIIIIIIIIIlIIIIII + lllllllllllllIlIIIIIIIIIIIllllll * lllllllllllllIlIIIIIIIIIIlIIIIIl;
            final int lllllllllllllIlIIIIIIIIIIIllllIl = lllllllllllllIlIIIIIIIIIIIlllllI + WorldRenderer.lIIIllIlIllIlI[2];
            final int lllllllllllllIlIIIIIIIIIIIllllII = lllllllllllllIlIIIIIIIIIIIllllIl + WorldRenderer.lIIIllIlIllIlI[2];
            this.rawIntBuffer.put(lllllllllllllIlIIIIIIIIIIIlllllI, Float.floatToRawIntBits((float)(lllllllllllllIlIIIIIIIIIIIlllIlI + this.xOffset) + Float.intBitsToFloat(this.rawIntBuffer.get(lllllllllllllIlIIIIIIIIIIIlllllI))));
            "".length();
            this.rawIntBuffer.put(lllllllllllllIlIIIIIIIIIIIllllIl, Float.floatToRawIntBits((float)(lllllllllllllIlIIIIIIIIIIIlllIIl + this.yOffset) + Float.intBitsToFloat(this.rawIntBuffer.get(lllllllllllllIlIIIIIIIIIIIllllIl))));
            "".length();
            this.rawIntBuffer.put(lllllllllllllIlIIIIIIIIIIIllllII, Float.floatToRawIntBits((float)(lllllllllllllIlIIIIIIIIIIlIIIIlI + this.zOffset) + Float.intBitsToFloat(this.rawIntBuffer.get(lllllllllllllIlIIIIIIIIIIIllllII))));
            "".length();
            ++lllllllllllllIlIIIIIIIIIIIllllll;
        }
    }
    
    public void setTranslation(final double lllllllllllllIIlllllllllIlIlIIII, final double lllllllllllllIIlllllllllIlIlIIll, final double lllllllllllllIIlllllllllIlIIlllI) {
        this.xOffset = lllllllllllllIIlllllllllIlIlIIII;
        this.yOffset = lllllllllllllIIlllllllllIlIlIIll;
        this.zOffset = lllllllllllllIIlllllllllIlIIlllI;
    }
    
    public void func_181674_a(final float lllllllllllllIlIIIIIIIIIlllllIII, final float lllllllllllllIlIIIIIIIIIlllIIllI, final float lllllllllllllIlIIIIIIIIIlllIIlIl) {
        final int lllllllllllllIlIIIIIIIIIllllIlIl = this.vertexCount / WorldRenderer.lIIIllIlIllIlI[0];
        final float[] lllllllllllllIlIIIIIIIIIllllIlII = new float[lllllllllllllIlIIIIIIIIIllllIlIl];
        int lllllllllllllIlIIIIIIIIIllllIIll = WorldRenderer.lIIIllIlIllIlI[3];
        "".length();
        if (((0xC8 ^ 0xC1 ^ (0xD ^ 0x54)) & (0xF ^ 0x52 ^ (0x72 ^ 0x7F) ^ -" ".length())) != ((0x1B ^ 0x49 ^ (0x31 ^ 0x26)) & (0xA3 ^ 0xAD ^ (0x54 ^ 0x1F) ^ -" ".length()))) {
            return;
        }
        while (!llIIIlIIlIllIll(lllllllllllllIlIIIIIIIIIllllIIll, lllllllllllllIlIIIIIIIIIllllIlIl)) {
            lllllllllllllIlIIIIIIIIIllllIlII[lllllllllllllIlIIIIIIIIIllllIIll] = func_181665_a(this.rawFloatBuffer, (float)(lllllllllllllIlIIIIIIIIIlllllIII + this.xOffset), (float)(lllllllllllllIlIIIIIIIIIlllIIllI + this.yOffset), (float)(lllllllllllllIlIIIIIIIIIlllIIlIl + this.zOffset), this.vertexFormat.func_181719_f(), lllllllllllllIlIIIIIIIIIllllIIll * this.vertexFormat.getNextOffset());
            ++lllllllllllllIlIIIIIIIIIllllIIll;
        }
        final Integer[] lllllllllllllIlIIIIIIIIIllllIIlI = new Integer[lllllllllllllIlIIIIIIIIIllllIlIl];
        int lllllllllllllIlIIIIIIIIIllllIIIl = WorldRenderer.lIIIllIlIllIlI[3];
        "".length();
        if (((0x7F ^ 0x69) & ~(0xA1 ^ 0xB7)) == (0x8E ^ 0x8A)) {
            return;
        }
        while (!llIIIlIIlIllIll(lllllllllllllIlIIIIIIIIIllllIIIl, lllllllllllllIlIIIIIIIIIllllIIlI.length)) {
            lllllllllllllIlIIIIIIIIIllllIIlI[lllllllllllllIlIIIIIIIIIllllIIIl] = lllllllllllllIlIIIIIIIIIllllIIIl;
            ++lllllllllllllIlIIIIIIIIIllllIIIl;
        }
        Arrays.sort(lllllllllllllIlIIIIIIIIIllllIIlI, new Comparator<Integer>() {
            @Override
            public int compare(final Integer lllllllllllllIIlIIlllIlIIIlIIIlI, final Integer lllllllllllllIIlIIlllIlIIIlIIIIl) {
                return Floats.compare(lllllllllllllIlIIIIIIIIIllllIlII[lllllllllllllIIlIIlllIlIIIlIIIIl], lllllllllllllIlIIIIIIIIIllllIlII[lllllllllllllIIlIIlllIlIIIlIIIlI]);
            }
        });
        final BitSet lllllllllllllIlIIIIIIIIIllllIIII = new BitSet();
        final int lllllllllllllIlIIIIIIIIIlllIllll = this.vertexFormat.getNextOffset();
        final int[] lllllllllllllIlIIIIIIIIIlllIlllI = new int[lllllllllllllIlIIIIIIIIIlllIllll];
        int lllllllllllllIlIIIIIIIIIlllIllIl = WorldRenderer.lIIIllIlIllIlI[3];
        "".length();
        if ((0x70 ^ 0x74) <= "   ".length()) {
            return;
        }
        while (!llIIIlIIlIllIll(lllllllllllllIlIIIIIIIIIlllIllIl = lllllllllllllIlIIIIIIIIIllllIIII.nextClearBit(lllllllllllllIlIIIIIIIIIlllIllIl), lllllllllllllIlIIIIIIIIIllllIIlI.length)) {
            final int lllllllllllllIlIIIIIIIIIlllIllII = lllllllllllllIlIIIIIIIIIllllIIlI[lllllllllllllIlIIIIIIIIIlllIllIl];
            if (llIIIlIIlIlllII(lllllllllllllIlIIIIIIIIIlllIllII, lllllllllllllIlIIIIIIIIIlllIllIl)) {
                this.rawIntBuffer.limit(lllllllllllllIlIIIIIIIIIlllIllII * lllllllllllllIlIIIIIIIIIlllIllll + lllllllllllllIlIIIIIIIIIlllIllll);
                "".length();
                this.rawIntBuffer.position(lllllllllllllIlIIIIIIIIIlllIllII * lllllllllllllIlIIIIIIIIIlllIllll);
                "".length();
                this.rawIntBuffer.get(lllllllllllllIlIIIIIIIIIlllIlllI);
                "".length();
                int lllllllllllllIlIIIIIIIIIlllIlIll = lllllllllllllIlIIIIIIIIIlllIllII;
                int lllllllllllllIlIIIIIIIIIlllIlIlI = lllllllllllllIlIIIIIIIIIllllIIlI[lllllllllllllIlIIIIIIIIIlllIllII];
                "".length();
                if ("   ".length() == "  ".length()) {
                    return;
                }
                while (!llIIIlIIlIlllIl(lllllllllllllIlIIIIIIIIIlllIlIll, lllllllllllllIlIIIIIIIIIlllIllIl)) {
                    this.rawIntBuffer.limit(lllllllllllllIlIIIIIIIIIlllIlIlI * lllllllllllllIlIIIIIIIIIlllIllll + lllllllllllllIlIIIIIIIIIlllIllll);
                    "".length();
                    this.rawIntBuffer.position(lllllllllllllIlIIIIIIIIIlllIlIlI * lllllllllllllIlIIIIIIIIIlllIllll);
                    "".length();
                    final IntBuffer lllllllllllllIlIIIIIIIIIlllIlIIl = this.rawIntBuffer.slice();
                    this.rawIntBuffer.limit(lllllllllllllIlIIIIIIIIIlllIlIll * lllllllllllllIlIIIIIIIIIlllIllll + lllllllllllllIlIIIIIIIIIlllIllll);
                    "".length();
                    this.rawIntBuffer.position(lllllllllllllIlIIIIIIIIIlllIlIll * lllllllllllllIlIIIIIIIIIlllIllll);
                    "".length();
                    this.rawIntBuffer.put(lllllllllllllIlIIIIIIIIIlllIlIIl);
                    "".length();
                    lllllllllllllIlIIIIIIIIIllllIIII.set(lllllllllllllIlIIIIIIIIIlllIlIll);
                    lllllllllllllIlIIIIIIIIIlllIlIll = lllllllllllllIlIIIIIIIIIlllIlIlI;
                    lllllllllllllIlIIIIIIIIIlllIlIlI = lllllllllllllIlIIIIIIIIIllllIIlI[lllllllllllllIlIIIIIIIIIlllIlIlI];
                }
                this.rawIntBuffer.limit(lllllllllllllIlIIIIIIIIIlllIllIl * lllllllllllllIlIIIIIIIIIlllIllll + lllllllllllllIlIIIIIIIIIlllIllll);
                "".length();
                this.rawIntBuffer.position(lllllllllllllIlIIIIIIIIIlllIllIl * lllllllllllllIlIIIIIIIIIlllIllll);
                "".length();
                this.rawIntBuffer.put(lllllllllllllIlIIIIIIIIIlllIlllI);
                "".length();
            }
            lllllllllllllIlIIIIIIIIIllllIIII.set(lllllllllllllIlIIIIIIIIIlllIllIl);
            ++lllllllllllllIlIIIIIIIIIlllIllIl;
        }
    }
    
    private static boolean llIIIlIIllIIIII(final Object lllllllllllllIIllllllllIlllIIIII, final Object lllllllllllllIIllllllllIllIlllll) {
        return lllllllllllllIIllllllllIlllIIIII == lllllllllllllIIllllllllIllIlllll;
    }
    
    public VertexFormat getVertexFormat() {
        return this.vertexFormat;
    }
    
    public void begin(final int lllllllllllllIlIIIIIIIIIlIIIIIIl, final VertexFormat lllllllllllllIlIIIIIIIIIlIIIIIII) {
        if (llIIIlIIlIllllI(this.isDrawing ? 1 : 0)) {
            throw new IllegalStateException(WorldRenderer.lIIIllIlIlIlll[WorldRenderer.lIIIllIlIllIlI[5]]);
        }
        this.isDrawing = (WorldRenderer.lIIIllIlIllIlI[2] != 0);
        this.reset();
        this.drawMode = lllllllllllllIlIIIIIIIIIlIIIIIIl;
        this.vertexFormat = lllllllllllllIlIIIIIIIIIlIIIIIII;
        this.field_181677_f = lllllllllllllIlIIIIIIIIIlIIIIIII.getElement(this.field_181678_g);
        this.needsUpdate = (WorldRenderer.lIIIllIlIllIlI[3] != 0);
        this.byteBuffer.limit(this.byteBuffer.capacity());
        "".length();
    }
    
    public WorldRenderer color(final int lllllllllllllIIllllllllllIlIIllI, final int lllllllllllllIIllllllllllIlIlIll, final int lllllllllllllIIllllllllllIlIlIlI, final int lllllllllllllIIllllllllllIlIlIIl) {
        if (llIIIlIIlIllllI(this.needsUpdate ? 1 : 0)) {
            return this;
        }
        final int lllllllllllllIIllllllllllIlIlIII = this.vertexCount * this.vertexFormat.getNextOffset() + this.vertexFormat.func_181720_d(this.field_181678_g);
        switch ($SWITCH_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumType()[this.field_181677_f.getType().ordinal()]) {
            case 1: {
                this.byteBuffer.putFloat(lllllllllllllIIllllllllllIlIlIII, lllllllllllllIIllllllllllIlIIllI / 255.0f);
                "".length();
                this.byteBuffer.putFloat(lllllllllllllIIllllllllllIlIlIII + WorldRenderer.lIIIllIlIllIlI[0], lllllllllllllIIllllllllllIlIlIll / 255.0f);
                "".length();
                this.byteBuffer.putFloat(lllllllllllllIIllllllllllIlIlIII + WorldRenderer.lIIIllIlIllIlI[8], lllllllllllllIIllllllllllIlIlIlI / 255.0f);
                "".length();
                this.byteBuffer.putFloat(lllllllllllllIIllllllllllIlIlIII + WorldRenderer.lIIIllIlIllIlI[12], lllllllllllllIIllllllllllIlIlIIl / 255.0f);
                "".length();
                "".length();
                if (((0x9E ^ 0xAA) & ~(0x39 ^ 0xD)) == (0x24 ^ 0x20)) {
                    return null;
                }
                break;
            }
            case 6:
            case 7: {
                this.byteBuffer.putFloat(lllllllllllllIIllllllllllIlIlIII, (float)lllllllllllllIIllllllllllIlIIllI);
                "".length();
                this.byteBuffer.putFloat(lllllllllllllIIllllllllllIlIlIII + WorldRenderer.lIIIllIlIllIlI[0], (float)lllllllllllllIIllllllllllIlIlIll);
                "".length();
                this.byteBuffer.putFloat(lllllllllllllIIllllllllllIlIlIII + WorldRenderer.lIIIllIlIllIlI[8], (float)lllllllllllllIIllllllllllIlIlIlI);
                "".length();
                this.byteBuffer.putFloat(lllllllllllllIIllllllllllIlIlIII + WorldRenderer.lIIIllIlIllIlI[12], (float)lllllllllllllIIllllllllllIlIlIIl);
                "".length();
                "".length();
                if ("   ".length() == 0) {
                    return null;
                }
                break;
            }
            case 4:
            case 5: {
                this.byteBuffer.putShort(lllllllllllllIIllllllllllIlIlIII, (short)lllllllllllllIIllllllllllIlIIllI);
                "".length();
                this.byteBuffer.putShort(lllllllllllllIIllllllllllIlIlIII + WorldRenderer.lIIIllIlIllIlI[4], (short)lllllllllllllIIllllllllllIlIlIll);
                "".length();
                this.byteBuffer.putShort(lllllllllllllIIllllllllllIlIlIII + WorldRenderer.lIIIllIlIllIlI[0], (short)lllllllllllllIIllllllllllIlIlIlI);
                "".length();
                this.byteBuffer.putShort(lllllllllllllIIllllllllllIlIlIII + WorldRenderer.lIIIllIlIllIlI[13], (short)lllllllllllllIIllllllllllIlIlIIl);
                "".length();
                "".length();
                if (-"   ".length() >= 0) {
                    return null;
                }
                break;
            }
            case 2:
            case 3: {
                if (!llIIIlIIllIIIII(ByteOrder.nativeOrder(), ByteOrder.LITTLE_ENDIAN)) {
                    this.byteBuffer.put(lllllllllllllIIllllllllllIlIlIII, (byte)lllllllllllllIIllllllllllIlIlIIl);
                    "".length();
                    this.byteBuffer.put(lllllllllllllIIllllllllllIlIlIII + WorldRenderer.lIIIllIlIllIlI[2], (byte)lllllllllllllIIllllllllllIlIlIlI);
                    "".length();
                    this.byteBuffer.put(lllllllllllllIIllllllllllIlIlIII + WorldRenderer.lIIIllIlIllIlI[4], (byte)lllllllllllllIIllllllllllIlIlIll);
                    "".length();
                    this.byteBuffer.put(lllllllllllllIIllllllllllIlIlIII + WorldRenderer.lIIIllIlIllIlI[5], (byte)lllllllllllllIIllllllllllIlIIllI);
                    "".length();
                    break;
                }
                this.byteBuffer.put(lllllllllllllIIllllllllllIlIlIII, (byte)lllllllllllllIIllllllllllIlIIllI);
                "".length();
                this.byteBuffer.put(lllllllllllllIIllllllllllIlIlIII + WorldRenderer.lIIIllIlIllIlI[2], (byte)lllllllllllllIIllllllllllIlIlIll);
                "".length();
                this.byteBuffer.put(lllllllllllllIIllllllllllIlIlIII + WorldRenderer.lIIIllIlIllIlI[4], (byte)lllllllllllllIIllllllllllIlIlIlI);
                "".length();
                this.byteBuffer.put(lllllllllllllIIllllllllllIlIlIII + WorldRenderer.lIIIllIlIllIlI[5], (byte)lllllllllllllIIllllllllllIlIlIIl);
                "".length();
                "".length();
                if (-" ".length() > " ".length()) {
                    return null;
                }
                break;
            }
        }
        this.func_181667_k();
        return this;
    }
    
    public int getDrawMode() {
        return this.drawMode;
    }
    
    private void putColorRGBA(final int lllllllllllllIIlllllllllllIIlIlI, final int lllllllllllllIIlllllllllllIIlIIl, final int lllllllllllllIIlllllllllllIIlllI, final int lllllllllllllIIlllllllllllIIIlll, final int lllllllllllllIIlllllllllllIIllII) {
        if (llIIIlIIllIIIII(ByteOrder.nativeOrder(), ByteOrder.LITTLE_ENDIAN)) {
            this.rawIntBuffer.put(lllllllllllllIIlllllllllllIIlIlI, lllllllllllllIIlllllllllllIIllII << WorldRenderer.lIIIllIlIllIlI[11] | lllllllllllllIIlllllllllllIIIlll << WorldRenderer.lIIIllIlIllIlI[9] | lllllllllllllIIlllllllllllIIlllI << WorldRenderer.lIIIllIlIllIlI[8] | lllllllllllllIIlllllllllllIIlIIl);
            "".length();
            "".length();
            if (" ".length() == "  ".length()) {
                return;
            }
        }
        else {
            this.rawIntBuffer.put(lllllllllllllIIlllllllllllIIlIlI, lllllllllllllIIlllllllllllIIlIIl << WorldRenderer.lIIIllIlIllIlI[11] | lllllllllllllIIlllllllllllIIlllI << WorldRenderer.lIIIllIlIllIlI[9] | lllllllllllllIIlllllllllllIIIlll << WorldRenderer.lIIIllIlIllIlI[8] | lllllllllllllIIlllllllllllIIllII);
            "".length();
        }
    }
    
    private void func_181667_k() {
        this.field_181678_g += WorldRenderer.lIIIllIlIllIlI[2];
        this.field_181678_g %= this.vertexFormat.getElementCount();
        this.field_181677_f = this.vertexFormat.getElement(this.field_181678_g);
        if (llIIIlIIllIIIII(this.field_181677_f.getUsage(), VertexFormatElement.EnumUsage.PADDING)) {
            this.func_181667_k();
        }
    }
    
    private void func_181670_b(final int lllllllllllllIlIIIIIIIIlIIIIlllI) {
        if (llIIIlIIlIllIlI(lllllllllllllIlIIIIIIIIlIIIIlllI, this.rawIntBuffer.remaining())) {
            final int lllllllllllllIlIIIIIIIIlIIIlIlII = this.byteBuffer.capacity();
            final int lllllllllllllIlIIIIIIIIlIIIlIIll = lllllllllllllIlIIIIIIIIlIIIlIlII % WorldRenderer.lIIIllIlIllIlI[1];
            final int lllllllllllllIlIIIIIIIIlIIIlIIlI = lllllllllllllIlIIIIIIIIlIIIlIIll + (((this.rawIntBuffer.position() + lllllllllllllIlIIIIIIIIlIIIIlllI) * WorldRenderer.lIIIllIlIllIlI[0] - lllllllllllllIlIIIIIIIIlIIIlIIll) / WorldRenderer.lIIIllIlIllIlI[1] + WorldRenderer.lIIIllIlIllIlI[2]) * WorldRenderer.lIIIllIlIllIlI[1];
            LogManager.getLogger().warn(String.valueOf(new StringBuilder(WorldRenderer.lIIIllIlIlIlll[WorldRenderer.lIIIllIlIllIlI[3]]).append(lllllllllllllIlIIIIIIIIlIIIlIlII).append(WorldRenderer.lIIIllIlIlIlll[WorldRenderer.lIIIllIlIllIlI[2]]).append(lllllllllllllIlIIIIIIIIlIIIlIIlI).append(WorldRenderer.lIIIllIlIlIlll[WorldRenderer.lIIIllIlIllIlI[4]])));
            final int lllllllllllllIlIIIIIIIIlIIIlIIIl = this.rawIntBuffer.position();
            final ByteBuffer lllllllllllllIlIIIIIIIIlIIIlIIII = GLAllocation.createDirectByteBuffer(lllllllllllllIlIIIIIIIIlIIIlIIlI);
            this.byteBuffer.position(WorldRenderer.lIIIllIlIllIlI[3]);
            "".length();
            lllllllllllllIlIIIIIIIIlIIIlIIII.put(this.byteBuffer);
            "".length();
            lllllllllllllIlIIIIIIIIlIIIlIIII.rewind();
            "".length();
            this.byteBuffer = lllllllllllllIlIIIIIIIIlIIIlIIII;
            this.rawFloatBuffer = this.byteBuffer.asFloatBuffer().asReadOnlyBuffer();
            this.rawIntBuffer = this.byteBuffer.asIntBuffer();
            this.rawIntBuffer.position(lllllllllllllIlIIIIIIIIlIIIlIIIl);
            "".length();
            this.field_181676_c = this.byteBuffer.asShortBuffer();
            this.field_181676_c.position(lllllllllllllIlIIIIIIIIlIIIlIIIl << WorldRenderer.lIIIllIlIllIlI[2]);
            "".length();
        }
    }
    
    private static void llIIIlIIlIlIlII() {
        (lIIIllIlIlIlll = new String[WorldRenderer.lIIIllIlIllIlI[18]])[WorldRenderer.lIIIllIlIllIlI[3]] = llIIIlIIlIIllll("Vv1JhtQ+UOb4hBWTsm361u+9gfnTfevh75/wHy4mFgMQQ/ilPoCljEMKncRyKUBz", "SmxsF");
        WorldRenderer.lIIIllIlIlIlll[WorldRenderer.lIIIllIlIllIlI[2]] = llIIIlIIlIIllll("6ZJ+PjnbRZeuXsS06EDkFpm/S992dSc2", "nqUUh");
        WorldRenderer.lIIIllIlIlIlll[WorldRenderer.lIIIllIlIllIlI[4]] = llIIIlIIlIlIIIl("T/tngCFzUk0=", "xrUUc");
        WorldRenderer.lIIIllIlIlIlll[WorldRenderer.lIIIllIlIllIlI[5]] = llIIIlIIlIlIIIl("pGb833sB0NYrkvx2gI6eAbhuG87EyMDM", "KtiaM");
        WorldRenderer.lIIIllIlIlIlll[WorldRenderer.lIIIllIlIllIlI[0]] = llIIIlIIlIlIIll("Jy0nayocKz8vIQclcg==", "iBSKH");
    }
    
    private static String llIIIlIIlIlIIIl(final String lllllllllllllIIllllllllIllllIllI, final String lllllllllllllIIllllllllIllllIlll) {
        try {
            final SecretKeySpec lllllllllllllIIllllllllIlllllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllllllIllllIlll.getBytes(StandardCharsets.UTF_8)), WorldRenderer.lIIIllIlIllIlI[8]), "DES");
            final Cipher lllllllllllllIIllllllllIlllllIlI = Cipher.getInstance("DES");
            lllllllllllllIIllllllllIlllllIlI.init(WorldRenderer.lIIIllIlIllIlI[4], lllllllllllllIIllllllllIlllllIll);
            return new String(lllllllllllllIIllllllllIlllllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllllllIllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllllllIlllllIIl) {
            lllllllllllllIIllllllllIlllllIIl.printStackTrace();
            return null;
        }
    }
    
    public void putColor4(final int lllllllllllllIIlllllllllIIllIlll) {
        int lllllllllllllIIlllllllllIIlllIIl = WorldRenderer.lIIIllIlIllIlI[3];
        "".length();
        if (" ".length() == 0) {
            return;
        }
        while (!llIIIlIIlIllIll(lllllllllllllIIlllllllllIIlllIIl, WorldRenderer.lIIIllIlIllIlI[0])) {
            this.putColor(lllllllllllllIIlllllllllIIllIlll, lllllllllllllIIlllllllllIIlllIIl + WorldRenderer.lIIIllIlIllIlI[2]);
            ++lllllllllllllIIlllllllllIIlllIIl;
        }
    }
    
    private static boolean llIIIlIIllIIIll(final int lllllllllllllIIllllllllIlllIlIII, final int lllllllllllllIIllllllllIlllIIlll) {
        return lllllllllllllIIllllllllIlllIlIII < lllllllllllllIIllllllllIlllIIlll;
    }
    
    public void endVertex() {
        this.vertexCount += WorldRenderer.lIIIllIlIllIlI[2];
        this.func_181670_b(this.vertexFormat.func_181719_f());
    }
    
    public void setVertexState(final State lllllllllllllIlIIIIIIIIIlIIIlIIl) {
        this.rawIntBuffer.clear();
        "".length();
        this.func_181670_b(lllllllllllllIlIIIIIIIIIlIIIlIIl.getRawBuffer().length);
        this.rawIntBuffer.put(lllllllllllllIlIIIIIIIIIlIIIlIIl.getRawBuffer());
        "".length();
        this.vertexCount = lllllllllllllIlIIIIIIIIIlIIIlIIl.getVertexCount();
        this.vertexFormat = new VertexFormat(lllllllllllllIlIIIIIIIIIlIIIlIIl.getVertexFormat());
    }
    
    public void putNormal(final float lllllllllllllIIlllllllllIllllllI, final float lllllllllllllIIlllllllllIlllIIll, final float lllllllllllllIIlllllllllIlllIIlI) {
        final int lllllllllllllIIlllllllllIllllIll = (byte)(lllllllllllllIIlllllllllIllllllI * 127.0f) & WorldRenderer.lIIIllIlIllIlI[7];
        final int lllllllllllllIIlllllllllIllllIlI = (byte)(lllllllllllllIIlllllllllIlllIIll * 127.0f) & WorldRenderer.lIIIllIlIllIlI[7];
        final int lllllllllllllIIlllllllllIllllIIl = (byte)(lllllllllllllIIlllllllllIlllIIlI * 127.0f) & WorldRenderer.lIIIllIlIllIlI[7];
        final int lllllllllllllIIlllllllllIllllIII = lllllllllllllIIlllllllllIllllIll | lllllllllllllIIlllllllllIllllIlI << WorldRenderer.lIIIllIlIllIlI[8] | lllllllllllllIIlllllllllIllllIIl << WorldRenderer.lIIIllIlIllIlI[9];
        final int lllllllllllllIIlllllllllIlllIlll = this.vertexFormat.getNextOffset() >> WorldRenderer.lIIIllIlIllIlI[4];
        final int lllllllllllllIIlllllllllIlllIllI = (this.vertexCount - WorldRenderer.lIIIllIlIllIlI[0]) * lllllllllllllIIlllllllllIlllIlll + this.vertexFormat.getNormalOffset() / WorldRenderer.lIIIllIlIllIlI[0];
        this.rawIntBuffer.put(lllllllllllllIIlllllllllIlllIllI, lllllllllllllIIlllllllllIllllIII);
        "".length();
        this.rawIntBuffer.put(lllllllllllllIIlllllllllIlllIllI + lllllllllllllIIlllllllllIlllIlll, lllllllllllllIIlllllllllIllllIII);
        "".length();
        this.rawIntBuffer.put(lllllllllllllIIlllllllllIlllIllI + lllllllllllllIIlllllllllIlllIlll * WorldRenderer.lIIIllIlIllIlI[4], lllllllllllllIIlllllllllIllllIII);
        "".length();
        this.rawIntBuffer.put(lllllllllllllIIlllllllllIlllIllI + lllllllllllllIIlllllllllIlllIlll * WorldRenderer.lIIIllIlIllIlI[5], lllllllllllllIIlllllllllIllllIII);
        "".length();
    }
    
    public void putColorRGB_F(final float lllllllllllllIIlllllllllllIlllll, final float lllllllllllllIIllllllllllllIIlll, final float lllllllllllllIIllllllllllllIIllI, final int lllllllllllllIIllllllllllllIIlIl) {
        final int lllllllllllllIIllllllllllllIIlII = this.getColorIndex(lllllllllllllIIllllllllllllIIlIl);
        final int lllllllllllllIIllllllllllllIIIll = MathHelper.clamp_int((int)(lllllllllllllIIlllllllllllIlllll * 255.0f), WorldRenderer.lIIIllIlIllIlI[3], WorldRenderer.lIIIllIlIllIlI[7]);
        final int lllllllllllllIIllllllllllllIIIlI = MathHelper.clamp_int((int)(lllllllllllllIIllllllllllllIIlll * 255.0f), WorldRenderer.lIIIllIlIllIlI[3], WorldRenderer.lIIIllIlIllIlI[7]);
        final int lllllllllllllIIllllllllllllIIIIl = MathHelper.clamp_int((int)(lllllllllllllIIllllllllllllIIllI * 255.0f), WorldRenderer.lIIIllIlIllIlI[3], WorldRenderer.lIIIllIlIllIlI[7]);
        this.putColorRGBA(lllllllllllllIIllllllllllllIIlII, lllllllllllllIIllllllllllllIIIll, lllllllllllllIIllllllllllllIIIlI, lllllllllllllIIllllllllllllIIIIl, WorldRenderer.lIIIllIlIllIlI[7]);
    }
    
    private static boolean llIIIlIIllIIIlI(final Object lllllllllllllIIllllllllIllIlllIl) {
        return lllllllllllllIIllllllllIllIlllIl != null;
    }
    
    public void markDirty() {
        this.needsUpdate = (WorldRenderer.lIIIllIlIllIlI[2] != 0);
    }
    
    private static boolean llIIIlIIlIlllII(final int lllllllllllllIIllllllllIllIlIllI, final int lllllllllllllIIllllllllIllIlIlIl) {
        return lllllllllllllIIllllllllIllIlIllI != lllllllllllllIIllllllllIllIlIlIl;
    }
    
    private int func_181664_j() {
        return this.vertexCount * this.vertexFormat.func_181719_f();
    }
    
    public int getVertexCount() {
        return this.vertexCount;
    }
    
    public class State
    {
        private final /* synthetic */ int[] stateRawBuffer;
        private final /* synthetic */ VertexFormat stateVertexFormat;
        
        public State(final int[] lllllllllllllIIIIIIIIIlIlllIlIlI, final VertexFormat lllllllllllllIIIIIIIIIlIlllIlIIl) {
            this.stateRawBuffer = lllllllllllllIIIIIIIIIlIlllIlIlI;
            this.stateVertexFormat = lllllllllllllIIIIIIIIIlIlllIlIIl;
        }
        
        public int[] getRawBuffer() {
            return this.stateRawBuffer;
        }
        
        public int getVertexCount() {
            return this.stateRawBuffer.length / this.stateVertexFormat.func_181719_f();
        }
        
        public VertexFormat getVertexFormat() {
            return this.stateVertexFormat;
        }
    }
}
