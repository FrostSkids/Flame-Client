// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.block.model;

import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.Arrays;
import net.minecraft.util.MathHelper;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;
import net.minecraft.util.JsonUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializer;
import net.minecraft.util.EnumFacing;
import java.util.Map;
import org.lwjgl.util.vector.Vector3f;

public class BlockPart
{
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing;
    public final /* synthetic */ boolean shade;
    private static final /* synthetic */ int[] lllIlIlIlIIlll;
    public final /* synthetic */ Vector3f positionTo;
    public final /* synthetic */ Vector3f positionFrom;
    public final /* synthetic */ Map<EnumFacing, BlockPartFace> mapFaces;
    public final /* synthetic */ BlockPartRotation partRotation;
    
    public BlockPart(final Vector3f llllllllllllIlIllIllIIllIIIIlIII, final Vector3f llllllllllllIlIllIllIIllIIIlIIll, final Map<EnumFacing, BlockPartFace> llllllllllllIlIllIllIIllIIIlIIIl, final BlockPartRotation llllllllllllIlIllIllIIllIIIIIlII, final boolean llllllllllllIlIllIllIIllIIIIIIll) {
        this.positionFrom = llllllllllllIlIllIllIIllIIIIlIII;
        this.positionTo = llllllllllllIlIllIllIIllIIIlIIll;
        this.mapFaces = llllllllllllIlIllIllIIllIIIlIIIl;
        this.partRotation = llllllllllllIlIllIllIIllIIIIIlII;
        this.shade = llllllllllllIlIllIllIIllIIIIIIll;
        this.setDefaultUvs();
    }
    
    private float[] getFaceUvs(final EnumFacing llllllllllllIlIllIllIIlIllIlIlIl) {
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[llllllllllllIlIllIllIIlIllIlIlIl.ordinal()]) {
            case 1:
            case 2: {
                final float[] array = new float[BlockPart.lllIlIlIlIIlll[0]];
                array[BlockPart.lllIlIlIlIIlll[1]] = this.positionFrom.x;
                array[BlockPart.lllIlIlIlIIlll[2]] = this.positionFrom.z;
                array[BlockPart.lllIlIlIlIIlll[3]] = this.positionTo.x;
                array[BlockPart.lllIlIlIlIIlll[4]] = this.positionTo.z;
                final float[] llllllllllllIlIllIllIIlIllIllIll = array;
                "".length();
                if ("  ".length() < 0) {
                    return null;
                }
                break;
            }
            case 3:
            case 4: {
                final float[] array2 = new float[BlockPart.lllIlIlIlIIlll[0]];
                array2[BlockPart.lllIlIlIlIIlll[1]] = this.positionFrom.x;
                array2[BlockPart.lllIlIlIlIIlll[2]] = 16.0f - this.positionTo.y;
                array2[BlockPart.lllIlIlIlIIlll[3]] = this.positionTo.x;
                array2[BlockPart.lllIlIlIlIIlll[4]] = 16.0f - this.positionFrom.y;
                final float[] llllllllllllIlIllIllIIlIllIllIIl = array2;
                "".length();
                if ("   ".length() < " ".length()) {
                    return null;
                }
                break;
            }
            case 5:
            case 6: {
                final float[] array3 = new float[BlockPart.lllIlIlIlIIlll[0]];
                array3[BlockPart.lllIlIlIlIIlll[1]] = this.positionFrom.z;
                array3[BlockPart.lllIlIlIlIIlll[2]] = 16.0f - this.positionTo.y;
                array3[BlockPart.lllIlIlIlIIlll[3]] = this.positionTo.z;
                array3[BlockPart.lllIlIlIlIIlll[4]] = 16.0f - this.positionFrom.y;
                final float[] llllllllllllIlIllIllIIlIllIllIII = array3;
                "".length();
                if ((" ".length() ^ (0x19 ^ 0x1D)) <= 0) {
                    return null;
                }
                break;
            }
            default: {
                throw new NullPointerException();
            }
        }
        final float[] llllllllllllIlIllIllIIlIllIlIlll;
        return llllllllllllIlIllIllIIlIllIlIlll;
    }
    
    private static boolean lIlIIIlIllllIlll(final int llllllllllllIlIllIllIIlIllIIlIlI) {
        return llllllllllllIlIllIllIIlIllIIlIlI == 0;
    }
    
    private static boolean lIlIIIlIlllllIII(final Object llllllllllllIlIllIllIIlIllIIllII) {
        return llllllllllllIlIllIllIIlIllIIllII != null;
    }
    
    static {
        lIlIIIlIllllIllI();
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing = BlockPart.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
        if (lIlIIIlIlllllIII($switch_TABLE$net$minecraft$util$EnumFacing)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing;
        }
        "".length();
        final double llllllllllllIlIllIllIIlIllIIlllI = (Object)new int[EnumFacing.values().length];
        try {
            llllllllllllIlIllIllIIlIllIIlllI[EnumFacing.DOWN.ordinal()] = BlockPart.lllIlIlIlIIlll[2];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIlIllIllIIlIllIIlllI[EnumFacing.EAST.ordinal()] = BlockPart.lllIlIlIlIIlll[5];
            "".length();
            if (" ".length() <= ((0x4B ^ 0x62) & ~(0x52 ^ 0x7B))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIlIllIllIIlIllIIlllI[EnumFacing.NORTH.ordinal()] = BlockPart.lllIlIlIlIIlll[4];
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIlIllIllIIlIllIIlllI[EnumFacing.SOUTH.ordinal()] = BlockPart.lllIlIlIlIIlll[0];
            "".length();
            if (((9 + 130 - 34 + 47 ^ 77 + 55 - 105 + 155) & (0xA5 ^ 0x93 ^ (0x4E ^ 0x56) ^ -" ".length())) <= -" ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            llllllllllllIlIllIllIIlIllIIlllI[EnumFacing.UP.ordinal()] = BlockPart.lllIlIlIlIIlll[3];
            "".length();
            if (-(0xB8 ^ 0x8F ^ (0x24 ^ 0x17)) >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            llllllllllllIlIllIllIIlIllIIlllI[EnumFacing.WEST.ordinal()] = BlockPart.lllIlIlIlIIlll[6];
            "".length();
            if (((0x4C ^ 0x75) & ~(0x8B ^ 0xB2)) >= "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return BlockPart.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)llllllllllllIlIllIllIIlIllIIlllI;
    }
    
    private void setDefaultUvs() {
        final boolean llllllllllllIlIllIllIIlIlllIllIl = (boolean)this.mapFaces.entrySet().iterator();
        "".length();
        if (((0x6E ^ 0x1C ^ (0x18 ^ 0x63)) & (28 + 157 - 91 + 82 ^ 114 + 74 - 89 + 86 ^ -" ".length())) >= " ".length()) {
            return;
        }
        while (!lIlIIIlIllllIlll(((Iterator)llllllllllllIlIllIllIIlIlllIllIl).hasNext() ? 1 : 0)) {
            final Map.Entry<EnumFacing, BlockPartFace> llllllllllllIlIllIllIIlIllllIlIl = ((Iterator<Map.Entry<EnumFacing, BlockPartFace>>)llllllllllllIlIllIllIIlIlllIllIl).next();
            final float[] llllllllllllIlIllIllIIlIllllIIll = this.getFaceUvs(llllllllllllIlIllIllIIlIllllIlIl.getKey());
            llllllllllllIlIllIllIIlIllllIlIl.getValue().blockFaceUV.setUvs(llllllllllllIlIllIllIIlIllllIIll);
        }
    }
    
    private static void lIlIIIlIllllIllI() {
        (lllIlIlIlIIlll = new int[7])[0] = (0x79 ^ 0x7D);
        BlockPart.lllIlIlIlIIlll[1] = ((0xDB ^ 0x8C) & ~(0x2D ^ 0x7A));
        BlockPart.lllIlIlIlIIlll[2] = " ".length();
        BlockPart.lllIlIlIlIIlll[3] = "  ".length();
        BlockPart.lllIlIlIlIIlll[4] = "   ".length();
        BlockPart.lllIlIlIlIIlll[5] = (0x69 ^ 0x5A ^ (0xD ^ 0x38));
        BlockPart.lllIlIlIlIIlll[6] = (146 + 166 - 172 + 40 ^ 53 + 148 - 76 + 52);
    }
    
    static class Deserializer implements JsonDeserializer<BlockPart>
    {
        private static final /* synthetic */ String[] llIIllllllllII;
        private static final /* synthetic */ int[] llIIllllllllIl;
        
        private static boolean lIIlIIIIllIIlllI(final int llllllllllllIllIlllIIIIllIIlIIIl) {
            return llllllllllllIllIlllIIIIllIIlIIIl == 0;
        }
        
        private Vector3f parsePosition(final JsonObject llllllllllllIllIlllIIIIlllIlllIl, final String llllllllllllIllIlllIIIIllllIIIIl) {
            final JsonArray llllllllllllIllIlllIIIIllllIIIII = JsonUtils.getJsonArray(llllllllllllIllIlllIIIIlllIlllIl, llllllllllllIllIlllIIIIllllIIIIl);
            if (lIIlIIIIllIlIlll(llllllllllllIllIlllIIIIllllIIIII.size(), Deserializer.llIIllllllllIl[3])) {
                throw new JsonParseException(String.valueOf(new StringBuilder(Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[20]]).append(llllllllllllIllIlllIIIIllllIIIIl).append(Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[21]]).append(llllllllllllIllIlllIIIIllllIIIII.size())));
            }
            final float[] llllllllllllIllIlllIIIIlllIlllll = new float[Deserializer.llIIllllllllIl[3]];
            int llllllllllllIllIlllIIIIlllIllllI = Deserializer.llIIllllllllIl[0];
            "".length();
            if ("  ".length() < " ".length()) {
                return null;
            }
            while (!lIIlIIIIllIllIII(llllllllllllIllIlllIIIIlllIllllI, llllllllllllIllIlllIIIIlllIlllll.length)) {
                llllllllllllIllIlllIIIIlllIlllll[llllllllllllIllIlllIIIIlllIllllI] = JsonUtils.getFloat(llllllllllllIllIlllIIIIllllIIIII.get(llllllllllllIllIlllIIIIlllIllllI), String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIlllIIIIllllIIIIl)).append(Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[22]]).append(llllllllllllIllIlllIIIIlllIllllI).append(Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[23]])));
                ++llllllllllllIllIlllIIIIlllIllllI;
            }
            return new Vector3f(llllllllllllIllIlllIIIIlllIlllll[Deserializer.llIIllllllllIl[0]], llllllllllllIllIlllIIIIlllIlllll[Deserializer.llIIllllllllIl[1]], llllllllllllIllIlllIIIIlllIlllll[Deserializer.llIIllllllllIl[2]]);
        }
        
        private BlockPartRotation parseRotation(final JsonObject llllllllllllIllIlllIIIlIIlIIIlII) {
            BlockPartRotation llllllllllllIllIlllIIIlIIlIIIIll = null;
            if (lIIlIIIIllIIllIl(llllllllllllIllIlllIIIlIIlIIIlII.has(Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[4]]) ? 1 : 0)) {
                final JsonObject llllllllllllIllIlllIIIlIIlIIIIlI = JsonUtils.getJsonObject(llllllllllllIllIlllIIIlIIlIIIlII, Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[5]]);
                final Vector3f llllllllllllIllIlllIIIlIIlIIIIIl = this.parsePosition(llllllllllllIllIlllIIIlIIlIIIIlI, Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[6]]);
                llllllllllllIllIlllIIIlIIlIIIIIl.scale(0.0625f);
                "".length();
                final EnumFacing.Axis llllllllllllIllIlllIIIlIIlIIIIII = this.parseAxis(llllllllllllIllIlllIIIlIIlIIIIlI);
                final float llllllllllllIllIlllIIIlIIIllllll = this.parseAngle(llllllllllllIllIlllIIIlIIlIIIIlI);
                final boolean llllllllllllIllIlllIIIlIIIlllllI = JsonUtils.getBoolean(llllllllllllIllIlllIIIlIIlIIIIlI, Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[7]], (boolean)(Deserializer.llIIllllllllIl[0] != 0));
                llllllllllllIllIlllIIIlIIlIIIIll = new BlockPartRotation(llllllllllllIllIlllIIIlIIlIIIIIl, llllllllllllIllIlllIIIlIIlIIIIII, llllllllllllIllIlllIIIlIIIllllll, llllllllllllIllIlllIIIlIIIlllllI);
            }
            return llllllllllllIllIlllIIIlIIlIIIIll;
        }
        
        private EnumFacing parseEnumFacing(final String llllllllllllIllIlllIIIIllllllllI) {
            final EnumFacing llllllllllllIllIlllIIIIlllllllIl = EnumFacing.byName(llllllllllllIllIlllIIIIllllllllI);
            if (lIIlIIIIllIlIIII(llllllllllllIllIlllIIIIlllllllIl)) {
                throw new JsonParseException(String.valueOf(new StringBuilder(Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[15]]).append(llllllllllllIllIlllIIIIllllllllI)));
            }
            return llllllllllllIllIlllIIIIlllllllIl;
        }
        
        private static void lIIlIIIIllIIllII() {
            (llIIllllllllIl = new int[25])[0] = ((0x61 ^ 0x38 ^ (0xC9 ^ 0x8B)) & (0x9B ^ 0xAD ^ (0x7F ^ 0x52) ^ -" ".length()));
            Deserializer.llIIllllllllIl[1] = " ".length();
            Deserializer.llIIllllllllIl[2] = "  ".length();
            Deserializer.llIIllllllllIl[3] = "   ".length();
            Deserializer.llIIllllllllIl[4] = (0x4E ^ 0x4A);
            Deserializer.llIIllllllllIl[5] = (0x1A ^ 0x5 ^ (0x37 ^ 0x2D));
            Deserializer.llIIllllllllIl[6] = (0x9F ^ 0x99);
            Deserializer.llIIllllllllIl[7] = (0x16 ^ 0x7D ^ (0xC6 ^ 0xAA));
            Deserializer.llIIllllllllIl[8] = (0x9 ^ 0x1);
            Deserializer.llIIllllllllIl[9] = (0xB ^ 0x2);
            Deserializer.llIIllllllllIl[10] = (0xA5 ^ 0xAF);
            Deserializer.llIIllllllllIl[11] = (0x48 ^ 0x43);
            Deserializer.llIIllllllllIl[12] = (0x1F ^ 0x19 ^ (0x6E ^ 0x64));
            Deserializer.llIIllllllllIl[13] = (0x7D ^ 0x70);
            Deserializer.llIIllllllllIl[14] = (0x72 ^ 0x61 ^ (0x36 ^ 0x2B));
            Deserializer.llIIllllllllIl[15] = (80 + 37 + 16 + 44 ^ 69 + 10 - 50 + 161);
            Deserializer.llIIllllllllIl[16] = (108 + 50 + 4 + 20 ^ 133 + 22 - 24 + 35);
            Deserializer.llIIllllllllIl[17] = (6 + 124 - 40 + 37 ^ (0x3B ^ 0x55));
            Deserializer.llIIllllllllIl[18] = (0x91 ^ 0x83);
            Deserializer.llIIllllllllIl[19] = (0x72 ^ 0x61);
            Deserializer.llIIllllllllIl[20] = (0x5F ^ 0x62 ^ (0xB6 ^ 0x9F));
            Deserializer.llIIllllllllIl[21] = (0x62 ^ 0x77);
            Deserializer.llIIllllllllIl[22] = (0x6A ^ 0x7C);
            Deserializer.llIIllllllllIl[23] = (0x6C ^ 0x7B);
            Deserializer.llIIllllllllIl[24] = (0x52 ^ 0x4A);
        }
        
        private static boolean lIIlIIIIllIlIlII(final int llllllllllllIllIlllIIIIllIIIllIl) {
            return llllllllllllIllIlllIIIIllIIIllIl <= 0;
        }
        
        private Vector3f parsePositionTo(final JsonObject llllllllllllIllIlllIIIIlllllIIll) {
            final Vector3f llllllllllllIllIlllIIIIlllllIlIl = this.parsePosition(llllllllllllIllIlllIIIIlllllIIll, Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[16]]);
            if (lIIlIIIIllIlIIll(lIIlIIIIllIlIIIl(llllllllllllIllIlllIIIIlllllIlIl.x, -16.0f)) && lIIlIIIIllIlIIll(lIIlIIIIllIlIIIl(llllllllllllIllIlllIIIIlllllIlIl.y, -16.0f)) && lIIlIIIIllIlIIll(lIIlIIIIllIlIIIl(llllllllllllIllIlllIIIIlllllIlIl.z, -16.0f)) && lIIlIIIIllIlIlII(lIIlIIIIllIlIIlI(llllllllllllIllIlllIIIIlllllIlIl.x, 32.0f)) && lIIlIIIIllIlIlII(lIIlIIIIllIlIIlI(llllllllllllIllIlllIIIIlllllIlIl.y, 32.0f)) && lIIlIIIIllIlIlII(lIIlIIIIllIlIIlI(llllllllllllIllIlllIIIIlllllIlIl.z, 32.0f))) {
                return llllllllllllIllIlllIIIIlllllIlIl;
            }
            throw new JsonParseException(String.valueOf(new StringBuilder(Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[17]]).append(llllllllllllIllIlllIIIIlllllIlIl)));
        }
        
        private static void lIIlIIIIllIIlIll() {
            (llIIllllllllII = new String[Deserializer.llIIllllllllIl[24]])[Deserializer.llIIllllllllIl[0]] = lIIlIIIIllIIlIII("CQY0DRY=", "znUis");
            Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[1]] = lIIlIIIIllIIlIIl("8i1wtzXfUkc=", "VtCxG");
            Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[2]] = lIIlIIIIllIIlIIl("PDRZFW4EUSo3jgpQZGEeMx9evVrvx7zqmDu78a8F/AU=", "GJEqo");
            Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[3]] = lIIlIIIIllIIlIIl("phiaaqAeMDA=", "ZOItk");
            Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[4]] = lIIlIIIIllIIlIlI("HTstaG97HiQbfSb1cBdTww==", "PsTmi");
            Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[5]] = lIIlIIIIllIIlIlI("sau8qc1a1Lg5pk0l/lmxTA==", "gNnni");
            Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[6]] = lIIlIIIIllIIlIIl("VrNlIOyCtA8=", "XnWrd");
            Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[7]] = lIIlIIIIllIIlIII("AQkUCy4fCQ==", "slghO");
            Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[8]] = lIIlIIIIllIIlIIl("c6E8AM/6FhQ=", "SKyrQ");
            Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[9]] = lIIlIIIIllIIlIIl("XrsMj6eMc15s+MtX6iel7fcxyT3987XL", "xAyEi");
            Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[10]] = lIIlIIIIllIIlIIl("4ktsxpOJ+z5aRrmd5fuQuGox7yGxgjDROsJq+kAeEjqE5Qsyt1l9nrx137BJsSQ5", "ZSZlx");
            Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[11]] = lIIlIIIIllIIlIIl("2MrtWyD71sw=", "vlqft");
            Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[12]] = lIIlIIIIllIIlIII("MDsgCAQQMXYbBw00IgAHF3U3EQEKb3Y=", "yUVih");
            Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[13]] = lIIlIIIIllIIlIII("KgI0NwwbHyByDQoOMzcKAVp1cg4BHmRkTxoULSMaCloiMwwKCWhyCAAOZGI=", "ozDRo");
            Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[14]] = lIIlIIIIllIIlIIl("33wJGJpTtRE=", "rvckQ");
            Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[15]] = lIIlIIIIllIIlIII("IB0FDSYCHU4FKBYaAARzVQ==", "usncI");
            Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[16]] = lIIlIIIIllIIlIIl("uikmnaTnTMw=", "RCsSb");
            Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[17]] = lIIlIIIIllIIlIlI("hHvujogUGyY5UUkmRYTXqdULZWnU9jRG3YWMjTtJLnPcXWb/o/KyU+W5gb6YLYcu", "ihAHc");
            Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[18]] = lIIlIIIIllIIlIIl("SUSJYMQeogk=", "terud");
            Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[19]] = lIIlIIIIllIIlIIl("Lsi4sGn4NCtOLv8IxNJKlAX0ynuF+uPWEIoB4aHa32KQjL0JbzM0+7F6UlWO+tnsZHTCgrIVaa0=", "hwiFp");
            Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[20]] = lIIlIIIIllIIlIIl("63GGnkWpfSH7y6v9m7skeg==", "TfUIE");
            Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[21]] = lIIlIIIIllIIlIII("RgA2GiUDBXtWNgkDORJqRg==", "fvWvP");
            Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[22]] = lIIlIIIIllIIlIII("Kw==", "pFAmK");
            Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[23]] = lIIlIIIIllIIlIlI("yiRJi8RK2VI=", "syyVr");
        }
        
        private static String lIIlIIIIllIIlIIl(final String llllllllllllIllIlllIIIIlllIIIlll, final String llllllllllllIllIlllIIIIlllIIlIII) {
            try {
                final SecretKeySpec llllllllllllIllIlllIIIIlllIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIIIIlllIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIlllIIIIlllIIlIll = Cipher.getInstance("Blowfish");
                llllllllllllIllIlllIIIIlllIIlIll.init(Deserializer.llIIllllllllIl[2], llllllllllllIllIlllIIIIlllIIllII);
                return new String(llllllllllllIllIlllIIIIlllIIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIIIIlllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlllIIIIlllIIlIlI) {
                llllllllllllIllIlllIIIIlllIIlIlI.printStackTrace();
                return null;
            }
        }
        
        private Map<EnumFacing, BlockPartFace> parseFacesCheck(final JsonDeserializationContext llllllllllllIllIlllIIIlIIIIllIll, final JsonObject llllllllllllIllIlllIIIlIIIIllIlI) {
            final Map<EnumFacing, BlockPartFace> llllllllllllIllIlllIIIlIIIIlllIl = this.parseFaces(llllllllllllIllIlllIIIlIIIIllIll, llllllllllllIllIlllIIIlIIIIllIlI);
            if (lIIlIIIIllIIllIl(llllllllllllIllIlllIIIlIIIIlllIl.isEmpty() ? 1 : 0)) {
                throw new JsonParseException(Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[13]]);
            }
            return llllllllllllIllIlllIIIlIIIIlllIl;
        }
        
        private static int lIIlIIIIllIlIlIl(final float n, final float n2) {
            return fcmpl(n, n2);
        }
        
        private static int lIIlIIIIllIIllll(final float n, final float n2) {
            return fcmpl(n, n2);
        }
        
        private static boolean lIIlIIIIllIlIIll(final int llllllllllllIllIlllIIIIllIIIllll) {
            return llllllllllllIllIlllIIIIllIIIllll >= 0;
        }
        
        static {
            lIIlIIIIllIIllII();
            lIIlIIIIllIIlIll();
        }
        
        private static boolean lIIlIIIIllIllIIl(final int llllllllllllIllIlllIIIIllIIllIII, final int llllllllllllIllIlllIIIIllIIlIlll) {
            return llllllllllllIllIlllIIIIllIIllIII < llllllllllllIllIlllIIIIllIIlIlll;
        }
        
        private static boolean lIIlIIIIllIIllIl(final int llllllllllllIllIlllIIIIllIIlIIll) {
            return llllllllllllIllIlllIIIIllIIlIIll != 0;
        }
        
        private static boolean lIIlIIIIllIlIlll(final int llllllllllllIllIlllIIIIllIIIlIlI, final int llllllllllllIllIlllIIIIllIIIlIIl) {
            return llllllllllllIllIlllIIIIllIIIlIlI != llllllllllllIllIlllIIIIllIIIlIIl;
        }
        
        private float parseAngle(final JsonObject llllllllllllIllIlllIIIlIIIllIIII) {
            final float llllllllllllIllIlllIIIlIIIllIIIl = JsonUtils.getFloat(llllllllllllIllIlllIIIlIIIllIIII, Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[8]]);
            if (lIIlIIIIllIIllIl(lIIlIIIIllIIllll(llllllllllllIllIlllIIIlIIIllIIIl, 0.0f)) && lIIlIIIIllIIllIl(lIIlIIIIllIIllll(MathHelper.abs(llllllllllllIllIlllIIIlIIIllIIIl), 22.5f)) && lIIlIIIIllIIllIl(lIIlIIIIllIIllll(MathHelper.abs(llllllllllllIllIlllIIIlIIIllIIIl), 45.0f))) {
                throw new JsonParseException(String.valueOf(new StringBuilder(Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[9]]).append(llllllllllllIllIlllIIIlIIIllIIIl).append(Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[10]])));
            }
            return llllllllllllIllIlllIIIlIIIllIIIl;
        }
        
        private Vector3f parsePositionFrom(final JsonObject llllllllllllIllIlllIIIIllllIlIlI) {
            final Vector3f llllllllllllIllIlllIIIIllllIllII = this.parsePosition(llllllllllllIllIlllIIIIllllIlIlI, Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[18]]);
            if (lIIlIIIIllIlIIll(lIIlIIIIllIlIlIl(llllllllllllIllIlllIIIIllllIllII.x, -16.0f)) && lIIlIIIIllIlIIll(lIIlIIIIllIlIlIl(llllllllllllIllIlllIIIIllllIllII.y, -16.0f)) && lIIlIIIIllIlIIll(lIIlIIIIllIlIlIl(llllllllllllIllIlllIIIIllllIllII.z, -16.0f)) && lIIlIIIIllIlIlII(lIIlIIIIllIlIllI(llllllllllllIllIlllIIIIllllIllII.x, 32.0f)) && lIIlIIIIllIlIlII(lIIlIIIIllIlIllI(llllllllllllIllIlllIIIIllllIllII.y, 32.0f)) && lIIlIIIIllIlIlII(lIIlIIIIllIlIllI(llllllllllllIllIlllIIIIllllIllII.z, 32.0f))) {
                return llllllllllllIllIlllIIIIllllIllII;
            }
            throw new JsonParseException(String.valueOf(new StringBuilder(Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[19]]).append(llllllllllllIllIlllIIIIllllIllII)));
        }
        
        private static String lIIlIIIIllIIlIlI(final String llllllllllllIllIlllIIIIllIlllIlI, final String llllllllllllIllIlllIIIIllIlllIIl) {
            try {
                final SecretKeySpec llllllllllllIllIlllIIIIllIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIIIIllIlllIIl.getBytes(StandardCharsets.UTF_8)), Deserializer.llIIllllllllIl[8]), "DES");
                final Cipher llllllllllllIllIlllIIIIllIlllllI = Cipher.getInstance("DES");
                llllllllllllIllIlllIIIIllIlllllI.init(Deserializer.llIIllllllllIl[2], llllllllllllIllIlllIIIIllIllllll);
                return new String(llllllllllllIllIlllIIIIllIlllllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIIIIllIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlllIIIIllIllllIl) {
                llllllllllllIllIlllIIIIllIllllIl.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIlIIIIllIllIII(final int llllllllllllIllIlllIIIIllIIlllII, final int llllllllllllIllIlllIIIIllIIllIll) {
            return llllllllllllIllIlllIIIIllIIlllII >= llllllllllllIllIlllIIIIllIIllIll;
        }
        
        private static int lIIlIIIIllIlIIlI(final float n, final float n2) {
            return fcmpg(n, n2);
        }
        
        private Map<EnumFacing, BlockPartFace> parseFaces(final JsonDeserializationContext llllllllllllIllIlllIIIlIIIIIlIII, final JsonObject llllllllllllIllIlllIIIlIIIIIIlll) {
            final Map<EnumFacing, BlockPartFace> llllllllllllIllIlllIIIlIIIIIllIl = (Map<EnumFacing, BlockPartFace>)Maps.newEnumMap((Class)EnumFacing.class);
            final JsonObject llllllllllllIllIlllIIIlIIIIIllII = JsonUtils.getJsonObject(llllllllllllIllIlllIIIlIIIIIIlll, Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[14]]);
            final char llllllllllllIllIlllIIIlIIIIIIIll = (char)llllllllllllIllIlllIIIlIIIIIllII.entrySet().iterator();
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
            while (!lIIlIIIIllIIlllI(((Iterator)llllllllllllIllIlllIIIlIIIIIIIll).hasNext() ? 1 : 0)) {
                final Map.Entry<String, JsonElement> llllllllllllIllIlllIIIlIIIIIlIll = ((Iterator<Map.Entry<String, JsonElement>>)llllllllllllIllIlllIIIlIIIIIIIll).next();
                final EnumFacing llllllllllllIllIlllIIIlIIIIIlIlI = this.parseEnumFacing(llllllllllllIllIlllIIIlIIIIIlIll.getKey());
                llllllllllllIllIlllIIIlIIIIIllIl.put(llllllllllllIllIlllIIIlIIIIIlIlI, (BlockPartFace)llllllllllllIllIlllIIIlIIIIIlIII.deserialize((JsonElement)llllllllllllIllIlllIIIlIIIIIlIll.getValue(), (Type)BlockPartFace.class));
                "".length();
            }
            return llllllllllllIllIlllIIIlIIIIIllIl;
        }
        
        private static String lIIlIIIIllIIlIII(String llllllllllllIllIlllIIIIllIlIIlll, final String llllllllllllIllIlllIIIIllIlIIllI) {
            llllllllllllIllIlllIIIIllIlIIlll = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlllIIIIllIlIIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIlllIIIIllIlIlIlI = new StringBuilder();
            final char[] llllllllllllIllIlllIIIIllIlIlIIl = llllllllllllIllIlllIIIIllIlIIllI.toCharArray();
            int llllllllllllIllIlllIIIIllIlIlIII = Deserializer.llIIllllllllIl[0];
            final double llllllllllllIllIlllIIIIllIlIIIlI = (Object)((String)llllllllllllIllIlllIIIIllIlIIlll).toCharArray();
            final int llllllllllllIllIlllIIIIllIlIIIIl = llllllllllllIllIlllIIIIllIlIIIlI.length;
            float llllllllllllIllIlllIIIIllIlIIIII = Deserializer.llIIllllllllIl[0];
            while (lIIlIIIIllIllIIl((int)llllllllllllIllIlllIIIIllIlIIIII, llllllllllllIllIlllIIIIllIlIIIIl)) {
                final char llllllllllllIllIlllIIIIllIlIllIl = llllllllllllIllIlllIIIIllIlIIIlI[llllllllllllIllIlllIIIIllIlIIIII];
                llllllllllllIllIlllIIIIllIlIlIlI.append((char)(llllllllllllIllIlllIIIIllIlIllIl ^ llllllllllllIllIlllIIIIllIlIlIIl[llllllllllllIllIlllIIIIllIlIlIII % llllllllllllIllIlllIIIIllIlIlIIl.length]));
                "".length();
                ++llllllllllllIllIlllIIIIllIlIlIII;
                ++llllllllllllIllIlllIIIIllIlIIIII;
                "".length();
                if (-(100 + 137 - 74 + 15 ^ 12 + 166 - 140 + 144) > 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIlllIIIIllIlIlIlI);
        }
        
        private EnumFacing.Axis parseAxis(final JsonObject llllllllllllIllIlllIIIlIIIlIlIlI) {
            final String llllllllllllIllIlllIIIlIIIlIlIIl = JsonUtils.getString(llllllllllllIllIlllIIIlIIIlIlIlI, Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[11]]);
            final EnumFacing.Axis llllllllllllIllIlllIIIlIIIlIlIII = EnumFacing.Axis.byName(llllllllllllIllIlllIIIlIIIlIlIIl.toLowerCase());
            if (lIIlIIIIllIlIIII(llllllllllllIllIlllIIIlIIIlIlIII)) {
                throw new JsonParseException(String.valueOf(new StringBuilder(Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[12]]).append(llllllllllllIllIlllIIIlIIIlIlIIl)));
            }
            return llllllllllllIllIlllIIIlIIIlIlIII;
        }
        
        private static int lIIlIIIIllIlIIIl(final float n, final float n2) {
            return fcmpl(n, n2);
        }
        
        public BlockPart deserialize(final JsonElement llllllllllllIllIlllIIIlIIlIlllll, final Type llllllllllllIllIlllIIIlIIlIllllI, final JsonDeserializationContext llllllllllllIllIlllIIIlIIlIlllIl) throws JsonParseException {
            final JsonObject llllllllllllIllIlllIIIlIIlIlllII = llllllllllllIllIlllIIIlIIlIlllll.getAsJsonObject();
            final Vector3f llllllllllllIllIlllIIIlIIlIllIll = this.parsePositionFrom(llllllllllllIllIlllIIIlIIlIlllII);
            final Vector3f llllllllllllIllIlllIIIlIIlIllIlI = this.parsePositionTo(llllllllllllIllIlllIIIlIIlIlllII);
            final BlockPartRotation llllllllllllIllIlllIIIlIIlIllIIl = this.parseRotation(llllllllllllIllIlllIIIlIIlIlllII);
            final Map<EnumFacing, BlockPartFace> llllllllllllIllIlllIIIlIIlIllIII = this.parseFacesCheck(llllllllllllIllIlllIIIlIIlIlllIl, llllllllllllIllIlllIIIlIIlIlllII);
            if (lIIlIIIIllIIllIl(llllllllllllIllIlllIIIlIIlIlllII.has(Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[0]]) ? 1 : 0) && lIIlIIIIllIIlllI(JsonUtils.isBoolean(llllllllllllIllIlllIIIlIIlIlllII, Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[1]]) ? 1 : 0)) {
                throw new JsonParseException(Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[2]]);
            }
            final boolean llllllllllllIllIlllIIIlIIlIlIlll = JsonUtils.getBoolean(llllllllllllIllIlllIIIlIIlIlllII, Deserializer.llIIllllllllII[Deserializer.llIIllllllllIl[3]], (boolean)(Deserializer.llIIllllllllIl[1] != 0));
            return new BlockPart(llllllllllllIllIlllIIIlIIlIllIll, llllllllllllIllIlllIIIlIIlIllIlI, llllllllllllIllIlllIIIlIIlIllIII, llllllllllllIllIlllIIIlIIlIllIIl, llllllllllllIllIlllIIIlIIlIlIlll);
        }
        
        private static int lIIlIIIIllIlIllI(final float n, final float n2) {
            return fcmpg(n, n2);
        }
        
        private static boolean lIIlIIIIllIlIIII(final Object llllllllllllIllIlllIIIIllIIlIlIl) {
            return llllllllllllIllIlllIIIIllIIlIlIl == null;
        }
    }
}
