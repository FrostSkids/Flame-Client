// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import com.google.common.collect.Iterators;
import java.util.Iterator;
import com.google.common.base.Predicate;
import java.util.Arrays;
import com.google.common.collect.Maps;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Random;
import java.util.Map;

public enum EnumFacing implements IStringSerializable
{
    DOWN(EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[0]], EnumFacing.lllIllIIIlIlll[0], EnumFacing.lllIllIIIlIlll[0], EnumFacing.lllIllIIIlIlll[1], EnumFacing.lllIllIIIlIlll[2], EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[1]], AxisDirection.NEGATIVE, Axis.Y, new Vec3i(EnumFacing.lllIllIIIlIlll[0], EnumFacing.lllIllIIIlIlll[2], EnumFacing.lllIllIIIlIlll[0]));
    
    private final /* synthetic */ int index;
    private static final /* synthetic */ int[] lllIllIIIlIlll;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis;
    private final /* synthetic */ Vec3i directionVec;
    
    SOUTH(EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[7]], EnumFacing.lllIllIIIlIlll[4], EnumFacing.lllIllIIIlIlll[4], EnumFacing.lllIllIIIlIlll[3], EnumFacing.lllIllIIIlIlll[0], EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[8]], AxisDirection.POSITIVE, Axis.Z, new Vec3i(EnumFacing.lllIllIIIlIlll[0], EnumFacing.lllIllIIIlIlll[0], EnumFacing.lllIllIIIlIlll[1]));
    
    private final /* synthetic */ AxisDirection axisDirection;
    
    EAST(EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[11]], EnumFacing.lllIllIIIlIlll[6], EnumFacing.lllIllIIIlIlll[6], EnumFacing.lllIllIIIlIlll[5], EnumFacing.lllIllIIIlIlll[4], EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[12]], AxisDirection.POSITIVE, Axis.X, new Vec3i(EnumFacing.lllIllIIIlIlll[1], EnumFacing.lllIllIIIlIlll[0], EnumFacing.lllIllIIIlIlll[0]));
    
    private final /* synthetic */ int opposite;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing;
    private final /* synthetic */ int horizontalIndex;
    private static final /* synthetic */ String[] lllIllIIIIIIII;
    
    NORTH(EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[5]], EnumFacing.lllIllIIIlIlll[3], EnumFacing.lllIllIIIlIlll[3], EnumFacing.lllIllIIIlIlll[4], EnumFacing.lllIllIIIlIlll[3], EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[6]], AxisDirection.NEGATIVE, Axis.Z, new Vec3i(EnumFacing.lllIllIIIlIlll[0], EnumFacing.lllIllIIIlIlll[0], EnumFacing.lllIllIIIlIlll[2]));
    
    private static final /* synthetic */ EnumFacing[] VALUES;
    private final /* synthetic */ String name;
    private static final /* synthetic */ Map<String, EnumFacing> NAME_LOOKUP;
    
    UP(EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[3]], EnumFacing.lllIllIIIlIlll[1], EnumFacing.lllIllIIIlIlll[1], EnumFacing.lllIllIIIlIlll[0], EnumFacing.lllIllIIIlIlll[2], EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[4]], AxisDirection.POSITIVE, Axis.Y, new Vec3i(EnumFacing.lllIllIIIlIlll[0], EnumFacing.lllIllIIIlIlll[1], EnumFacing.lllIllIIIlIlll[0]));
    
    private static final /* synthetic */ EnumFacing[] HORIZONTALS;
    
    WEST(EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[9]], EnumFacing.lllIllIIIlIlll[5], EnumFacing.lllIllIIIlIlll[5], EnumFacing.lllIllIIIlIlll[6], EnumFacing.lllIllIIIlIlll[1], EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[10]], AxisDirection.NEGATIVE, Axis.X, new Vec3i(EnumFacing.lllIllIIIlIlll[2], EnumFacing.lllIllIIIlIlll[0], EnumFacing.lllIllIIIlIlll[0]));
    
    private final /* synthetic */ Axis axis;
    
    private EnumFacing rotateZ() {
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[this.ordinal()]) {
            case 6: {
                return EnumFacing.DOWN;
            }
            default: {
                throw new IllegalStateException(String.valueOf(new StringBuilder(EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[16]]).append(this)));
            }
            case 5: {
                return EnumFacing.UP;
            }
            case 2: {
                return EnumFacing.EAST;
            }
            case 1: {
                return EnumFacing.WEST;
            }
        }
    }
    
    public AxisDirection getAxisDirection() {
        return this.axisDirection;
    }
    
    public static EnumFacing getHorizontal(final int llllllllllllIlIllIIlllIllllIlIll) {
        return EnumFacing.HORIZONTALS[MathHelper.abs_int(llllllllllllIlIllIIlllIllllIlIll % EnumFacing.HORIZONTALS.length)];
    }
    
    public static EnumFacing func_181076_a(final AxisDirection llllllllllllIlIllIIlllIllIIlIllI, final Axis llllllllllllIlIllIIlllIllIIIlllI) {
        final boolean llllllllllllIlIllIIlllIllIIIlIII;
        final boolean llllllllllllIlIllIIlllIllIIIlIIl = ((EnumFacing[])(Object)(llllllllllllIlIllIIlllIllIIIlIII = (boolean)(Object)values())).length != 0;
        byte llllllllllllIlIllIIlllIllIIIlIlI = (byte)EnumFacing.lllIllIIIlIlll[0];
        "".length();
        if ("   ".length() == (112 + 128 - 106 + 32 ^ 141 + 24 - 79 + 76)) {
            return null;
        }
        while (!lIlIIlIIIIIllIIl(llllllllllllIlIllIIlllIllIIIlIlI, llllllllllllIlIllIIlllIllIIIlIIl ? 1 : 0)) {
            final EnumFacing llllllllllllIlIllIIlllIllIIlIIlI = llllllllllllIlIllIIlllIllIIIlIII[llllllllllllIlIllIIlllIllIIIlIlI];
            if (lIlIIlIIIIIlllII(llllllllllllIlIllIIlllIllIIlIIlI.getAxisDirection(), llllllllllllIlIllIIlllIllIIlIllI) && lIlIIlIIIIIlllII(llllllllllllIlIllIIlllIllIIlIIlI.getAxis(), llllllllllllIlIllIIlllIllIIIlllI)) {
                return llllllllllllIlIllIIlllIllIIlIIlI;
            }
            ++llllllllllllIlIllIIlllIllIIIlIlI;
        }
        throw new IllegalArgumentException(String.valueOf(new StringBuilder(EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[18]]).append(llllllllllllIlIllIIlllIllIIlIllI).append(EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[19]]).append(llllllllllllIlIllIIlllIllIIIlllI)));
    }
    
    public static EnumFacing getFront(final int llllllllllllIlIllIIlllIlllllIIIl) {
        return EnumFacing.VALUES[MathHelper.abs_int(llllllllllllIlIllIIlllIlllllIIIl % EnumFacing.VALUES.length)];
    }
    
    private static boolean lIlIIlIIIIIllIlI(final Object llllllllllllIlIllIIlllIIllllIIIl, final Object llllllllllllIlIllIIlllIIllllIIII) {
        return llllllllllllIlIllIIlllIIllllIIIl != llllllllllllIlIllIIlllIIllllIIII;
    }
    
    public Vec3i getDirectionVec() {
        return this.directionVec;
    }
    
    public int getFrontOffsetZ() {
        int offset;
        if (lIlIIlIIIIIlllII(this.axis, Axis.Z)) {
            offset = this.axisDirection.getOffset();
            "".length();
            if (-" ".length() > (0x4 ^ 0x13 ^ (0xB3 ^ 0xA0))) {
                return (158 + 23 - 135 + 167 ^ 147 + 48 - 105 + 102) & (0x22 ^ 0x3 ^ (0x4E ^ 0x7A) ^ -" ".length());
            }
        }
        else {
            offset = EnumFacing.lllIllIIIlIlll[0];
        }
        return offset;
    }
    
    public static EnumFacing random(final Random llllllllllllIlIllIIlllIllllIIIIl) {
        return values()[llllllllllllIlIllIIlllIllllIIIIl.nextInt(values().length)];
    }
    
    public Axis getAxis() {
        return this.axis;
    }
    
    public int getIndex() {
        return this.index;
    }
    
    private static boolean lIlIIlIIIIlIIIII(final Object llllllllllllIlIllIIlllIIlllIlIII) {
        return llllllllllllIlIllIIlllIIlllIlIII == null;
    }
    
    private static boolean lIlIIlIIIIIllIII(final int llllllllllllIlIllIIlllIIlllIIllI) {
        return llllllllllllIlIllIIlllIIlllIIllI != 0;
    }
    
    private EnumFacing rotateX() {
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[this.ordinal()]) {
            case 3: {
                return EnumFacing.DOWN;
            }
            default: {
                throw new IllegalStateException(String.valueOf(new StringBuilder(EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[15]]).append(this)));
            }
            case 4: {
                return EnumFacing.UP;
            }
            case 2: {
                return EnumFacing.NORTH;
            }
            case 1: {
                return EnumFacing.SOUTH;
            }
        }
    }
    
    private static boolean lIlIIlIIIIIlllII(final Object llllllllllllIlIllIIlllIIlllIllIl, final Object llllllllllllIlIllIIlllIIlllIllII) {
        return llllllllllllIlIllIIlllIIlllIllIl == llllllllllllIlIllIIlllIIlllIllII;
    }
    
    private static void lIlIIlIIIIIlIlll() {
        (lllIllIIIlIlll = new int[21])[0] = ((12 + 139 - 60 + 73 ^ 42 + 103 - 81 + 82) & (100 + 28 - 28 + 88 ^ 94 + 11 - 56 + 89 ^ -" ".length()));
        EnumFacing.lllIllIIIlIlll[1] = " ".length();
        EnumFacing.lllIllIIIlIlll[2] = -" ".length();
        EnumFacing.lllIllIIIlIlll[3] = "  ".length();
        EnumFacing.lllIllIIIlIlll[4] = "   ".length();
        EnumFacing.lllIllIIIlIlll[5] = (0x9B ^ 0xAC ^ (0x8B ^ 0xB8));
        EnumFacing.lllIllIIIlIlll[6] = (87 + 111 - 90 + 82 ^ 59 + 40 - 80 + 168);
        EnumFacing.lllIllIIIlIlll[7] = (15 + 85 + 86 + 2 ^ 50 + 56 - 6 + 86);
        EnumFacing.lllIllIIIlIlll[8] = (0x35 ^ 0x32);
        EnumFacing.lllIllIIIlIlll[9] = (0xE9 ^ 0xA0 ^ (0x4E ^ 0xF));
        EnumFacing.lllIllIIIlIlll[10] = ("  ".length() ^ (0x3D ^ 0x36));
        EnumFacing.lllIllIIIlIlll[11] = (0x4A ^ 0x1D ^ (0x9 ^ 0x54));
        EnumFacing.lllIllIIIlIlll[12] = (0x5A ^ 0x51);
        EnumFacing.lllIllIIIlIlll[13] = (0xAF ^ 0xA3);
        EnumFacing.lllIllIIIlIlll[14] = (69 + 46 - 16 + 29 ^ 83 + 53 - 131 + 136);
        EnumFacing.lllIllIIIlIlll[15] = (0x1A ^ 0x14);
        EnumFacing.lllIllIIIlIlll[16] = (0x2B ^ 0x41 ^ (0xFE ^ 0x9B));
        EnumFacing.lllIllIIIlIlll[17] = (80 + 6 + 44 + 20 ^ 53 + 122 - 41 + 0);
        EnumFacing.lllIllIIIlIlll[18] = (0x2C ^ 0x3D);
        EnumFacing.lllIllIIIlIlll[19] = (0x21 ^ 0x70 ^ (0x26 ^ 0x65));
        EnumFacing.lllIllIIIlIlll[20] = (0x3F ^ 0x78 ^ (0x27 ^ 0x73));
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing = EnumFacing.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
        if (lIlIIlIIIIlIlIIl($switch_TABLE$net$minecraft$util$EnumFacing)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing;
        }
        "".length();
        final Exception llllllllllllIlIllIIlllIlIllIlIIl = (Object)new int[values().length];
        try {
            llllllllllllIlIllIIlllIlIllIlIIl[EnumFacing.DOWN.ordinal()] = EnumFacing.lllIllIIIlIlll[1];
            "".length();
            if (" ".length() < -" ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIlIllIIlllIlIllIlIIl[EnumFacing.EAST.ordinal()] = EnumFacing.lllIllIIIlIlll[7];
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIlIllIIlllIlIllIlIIl[EnumFacing.NORTH.ordinal()] = EnumFacing.lllIllIIIlIlll[4];
            "".length();
            if (-" ".length() > "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIlIllIIlllIlIllIlIIl[EnumFacing.SOUTH.ordinal()] = EnumFacing.lllIllIIIlIlll[5];
            "".length();
            if (((0xE1 ^ 0xB5) & ~(0xE8 ^ 0xBC)) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            llllllllllllIlIllIIlllIlIllIlIIl[EnumFacing.UP.ordinal()] = EnumFacing.lllIllIIIlIlll[3];
            "".length();
            if (((0x84 ^ 0xC3) & ~(0x7C ^ 0x3B)) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            llllllllllllIlIllIIlllIlIllIlIIl[EnumFacing.WEST.ordinal()] = EnumFacing.lllIllIIIlIlll[6];
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return EnumFacing.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)llllllllllllIlIllIIlllIlIllIlIIl;
    }
    
    private static String lIlIIIllllIlIIIl(final String llllllllllllIlIllIIlllIlIIlIIlIl, final String llllllllllllIlIllIIlllIlIIlIIlII) {
        try {
            final SecretKeySpec llllllllllllIlIllIIlllIlIIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIlllIlIIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIIlllIlIIlIllII = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIIlllIlIIlIllII.init(EnumFacing.lllIllIIIlIlll[3], llllllllllllIlIllIIlllIlIIlIlllI);
            return new String(llllllllllllIlIllIIlllIlIIlIllII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIlllIlIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIlllIlIIlIlIlI) {
            llllllllllllIlIllIIlllIlIIlIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIlIIIIIllIIl(final int llllllllllllIlIllIIlllIlIIIIIIII, final int llllllllllllIlIllIIlllIIlllllllI) {
        return llllllllllllIlIllIIlllIlIIIIIIII >= llllllllllllIlIllIIlllIIlllllllI;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    public String getName2() {
        return this.name;
    }
    
    public EnumFacing getOpposite() {
        return getFront(this.opposite);
    }
    
    public static EnumFacing byName(final String llllllllllllIlIllIIlllIlllllIlll) {
        EnumFacing enumFacing;
        if (lIlIIlIIIIlIIIII(llllllllllllIlIllIIlllIlllllIlll)) {
            enumFacing = null;
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        else {
            enumFacing = EnumFacing.NAME_LOOKUP.get(llllllllllllIlIllIIlllIlllllIlll.toLowerCase());
        }
        return enumFacing;
    }
    
    public EnumFacing rotateAround(final Axis llllllllllllIlIllIIllllIIIIllIlI) {
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis()[llllllllllllIlIllIIllllIIIIllIlI.ordinal()]) {
            case 1: {
                if (lIlIIlIIIIIllIlI(this, EnumFacing.WEST) && lIlIIlIIIIIllIlI(this, EnumFacing.EAST)) {
                    return this.rotateX();
                }
                return this;
            }
            case 2: {
                if (lIlIIlIIIIIllIlI(this, EnumFacing.UP) && lIlIIlIIIIIllIlI(this, EnumFacing.DOWN)) {
                    return this.rotateY();
                }
                return this;
            }
            case 3: {
                if (lIlIIlIIIIIllIlI(this, EnumFacing.NORTH) && lIlIIlIIIIIllIlI(this, EnumFacing.SOUTH)) {
                    return this.rotateZ();
                }
                return this;
            }
            default: {
                throw new IllegalStateException(String.valueOf(new StringBuilder(EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[13]]).append(llllllllllllIlIllIIllllIIIIllIlI)));
            }
        }
    }
    
    private EnumFacing(final String llllllllllllIlIllIIllllIIIllIIlI, final int llllllllllllIlIllIIllllIIIllIIIl, final int llllllllllllIlIllIIllllIIIlllIlI, final int llllllllllllIlIllIIllllIIIlIllll, final int llllllllllllIlIllIIllllIIIlIlllI, final String llllllllllllIlIllIIllllIIIlIllIl, final AxisDirection llllllllllllIlIllIIllllIIIllIllI, final Axis llllllllllllIlIllIIllllIIIlIlIll, final Vec3i llllllllllllIlIllIIllllIIIllIlII) {
        this.index = llllllllllllIlIllIIllllIIIlllIlI;
        this.horizontalIndex = llllllllllllIlIllIIllllIIIlIlllI;
        this.opposite = llllllllllllIlIllIIllllIIIlIllll;
        this.name = llllllllllllIlIllIIllllIIIlIllIl;
        this.axis = llllllllllllIlIllIIllllIIIlIlIll;
        this.axisDirection = llllllllllllIlIllIIllllIIIllIllI;
        this.directionVec = llllllllllllIlIllIIllllIIIllIlII;
    }
    
    private static void lIlIIlIIIIIlIlIl() {
        (lllIllIIIIIIII = new String[EnumFacing.lllIllIIIlIlll[20]])[EnumFacing.lllIllIIIlIlll[0]] = lIlIIIllllIlIIII("u0cG5INVzMY=", "gFfJK");
        EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[1]] = lIlIIIllllIlIIIl("AMku5PYQ+oo=", "sabCF");
        EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[3]] = lIlIIIllllIlIIII("KpzoKhxTOxU=", "uaELS");
        EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[4]] = lIlIIlIIIIIlIIIl("Nzs=", "BKrEz");
        EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[5]] = lIlIIIllllIlIIII("67i4j+HOTJ8=", "nbnfO");
        EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[6]] = lIlIIIllllIlIIIl("bYbfxbV16OE=", "WxrFd");
        EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[7]] = lIlIIlIIIIIlIIIl("PQEbAxk=", "nNNWQ");
        EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[8]] = lIlIIIllllIlIIIl("aFNXWKplWiU=", "dnRLl");
        EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[9]] = lIlIIIllllIlIIII("2xEHVaOO5H4=", "mPlap");
        EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[10]] = lIlIIIllllIlIIIl("dlkSZEI8bfg=", "cmdYb");
        EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[11]] = lIlIIlIIIIIlIIIl("ETkfAw==", "TxLWP");
        EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[12]] = lIlIIlIIIIIlIIIl("DSU6AQ==", "hDIuz");
        EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[13]] = lIlIIIllllIlIIIl("U9ig5a1S541rjMAwjMMSt60uMJVUaD0HTg20OwfOPOYi9MA0/6Qowg==", "uGMqm");
        EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[14]] = lIlIIIllllIlIIII("YnQY+desI2nHG7FVqIHQJdgM0++90VhKkLuov+oDIV+CJoMONfAf/A==", "QfbnV");
        EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[15]] = lIlIIIllllIlIIII("aH3XbqEz8gdFpHymRf6EvWNyIgriTjGQjHDQc0s1KlyOPKGMkhm5tA==", "FCOjh");
        EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[16]] = lIlIIlIIIIIlIIIl("IhgHOwASVhI2TBATEnk2WgQJLQ0DEwJ5ChYVDzcLVxkAeQ==", "wvfYl");
        EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[17]] = lIlIIIllllIlIIII("onSADZnttz69wJpKlskpeQdeaeWK+jN7n+lcxFoQzCE=", "pPhjO");
        EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[18]] = lIlIIIllllIlIIII("bPLArbfEwWY0MoLndzswNWsaaTCTfDpL", "pfEwe");
        EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[19]] = lIlIIIllllIlIIII("pfbwAhQI0os=", "xPpyx");
    }
    
    static {
        lIlIIlIIIIIlIlll();
        lIlIIlIIIIIlIlIl();
        final EnumFacing[] enum$VALUES = new EnumFacing[EnumFacing.lllIllIIIlIlll[7]];
        enum$VALUES[EnumFacing.lllIllIIIlIlll[0]] = EnumFacing.DOWN;
        enum$VALUES[EnumFacing.lllIllIIIlIlll[1]] = EnumFacing.UP;
        enum$VALUES[EnumFacing.lllIllIIIlIlll[3]] = EnumFacing.NORTH;
        enum$VALUES[EnumFacing.lllIllIIIlIlll[4]] = EnumFacing.SOUTH;
        enum$VALUES[EnumFacing.lllIllIIIlIlll[5]] = EnumFacing.WEST;
        enum$VALUES[EnumFacing.lllIllIIIlIlll[6]] = EnumFacing.EAST;
        ENUM$VALUES = enum$VALUES;
        VALUES = new EnumFacing[EnumFacing.lllIllIIIlIlll[7]];
        HORIZONTALS = new EnumFacing[EnumFacing.lllIllIIIlIlll[5]];
        NAME_LOOKUP = Maps.newHashMap();
        final long llllllllllllIlIllIIllllIIlIIIllI;
        final double llllllllllllIlIllIIllllIIlIIIlll = ((EnumFacing[])(Object)(llllllllllllIlIllIIllllIIlIIIllI = (long)(Object)values())).length;
        byte llllllllllllIlIllIIllllIIlIIlIII = (byte)EnumFacing.lllIllIIIlIlll[0];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIlIIlIIIIIllIIl(llllllllllllIlIllIIllllIIlIIlIII, (int)llllllllllllIlIllIIllllIIlIIIlll)) {
            final EnumFacing llllllllllllIlIllIIllllIIlIIlIlI = llllllllllllIlIllIIllllIIlIIIllI[llllllllllllIlIllIIllllIIlIIlIII];
            EnumFacing.VALUES[llllllllllllIlIllIIllllIIlIIlIlI.index] = llllllllllllIlIllIIllllIIlIIlIlI;
            if (lIlIIlIIIIIllIII(llllllllllllIlIllIIllllIIlIIlIlI.getAxis().isHorizontal() ? 1 : 0)) {
                EnumFacing.HORIZONTALS[llllllllllllIlIllIIllllIIlIIlIlI.horizontalIndex] = llllllllllllIlIllIIllllIIlIIlIlI;
            }
            EnumFacing.NAME_LOOKUP.put(llllllllllllIlIllIIllllIIlIIlIlI.getName2().toLowerCase(), llllllllllllIlIllIIllllIIlIIlIlI);
            "".length();
            ++llllllllllllIlIllIIllllIIlIIlIII;
        }
    }
    
    public int getFrontOffsetX() {
        int offset;
        if (lIlIIlIIIIIlllII(this.axis, Axis.X)) {
            offset = this.axisDirection.getOffset();
            "".length();
            if (null != null) {
                return (0x48 ^ 0x65) & ~(0x41 ^ 0x6C);
            }
        }
        else {
            offset = EnumFacing.lllIllIIIlIlll[0];
        }
        return offset;
    }
    
    private static boolean lIlIIlIIIIlIIlIl(final int llllllllllllIlIllIIlllIIlllIIlII) {
        return llllllllllllIlIllIIlllIIlllIIlII > 0;
    }
    
    public static EnumFacing getFacingFromVector(final float llllllllllllIlIllIIlllIlllIIlIII, final float llllllllllllIlIllIIlllIllIlllIlI, final float llllllllllllIlIllIIlllIlllIIIlIl) {
        EnumFacing llllllllllllIlIllIIlllIlllIIIIll = EnumFacing.NORTH;
        float llllllllllllIlIllIIlllIlllIIIIlI = Float.MIN_VALUE;
        final int llllllllllllIlIllIIlllIllIllIIlI;
        final int llllllllllllIlIllIIlllIllIllIIll = ((EnumFacing[])(Object)(llllllllllllIlIllIIlllIllIllIIlI = (int)(Object)values())).length;
        double llllllllllllIlIllIIlllIllIllIlII = EnumFacing.lllIllIIIlIlll[0];
        "".length();
        if ("  ".length() == 0) {
            return null;
        }
        while (!lIlIIlIIIIIllIIl((int)llllllllllllIlIllIIlllIllIllIlII, llllllllllllIlIllIIlllIllIllIIll)) {
            final EnumFacing llllllllllllIlIllIIlllIlllIIIIII = llllllllllllIlIllIIlllIllIllIIlI[llllllllllllIlIllIIlllIllIllIlII];
            final float llllllllllllIlIllIIlllIllIlllllI = llllllllllllIlIllIIlllIlllIIlIII * llllllllllllIlIllIIlllIlllIIIIII.directionVec.getX() + llllllllllllIlIllIIlllIllIlllIlI * llllllllllllIlIllIIlllIlllIIIIII.directionVec.getY() + llllllllllllIlIllIIlllIlllIIIlIl * llllllllllllIlIllIIlllIlllIIIIII.directionVec.getZ();
            if (lIlIIlIIIIlIIlIl(lIlIIlIIIIlIIIll(llllllllllllIlIllIIlllIllIlllllI, llllllllllllIlIllIIlllIlllIIIIlI))) {
                llllllllllllIlIllIIlllIlllIIIIlI = llllllllllllIlIllIIlllIllIlllllI;
                llllllllllllIlIllIIlllIlllIIIIll = llllllllllllIlIllIIlllIlllIIIIII;
            }
            ++llllllllllllIlIllIIlllIllIllIlII;
        }
        return llllllllllllIlIllIIlllIlllIIIIll;
    }
    
    public EnumFacing rotateYCCW() {
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[this.ordinal()]) {
            case 3: {
                return EnumFacing.WEST;
            }
            case 6: {
                return EnumFacing.NORTH;
            }
            case 4: {
                return EnumFacing.EAST;
            }
            case 5: {
                return EnumFacing.SOUTH;
            }
            default: {
                throw new IllegalStateException(String.valueOf(new StringBuilder(EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[17]]).append(this)));
            }
        }
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing$Axis = EnumFacing.$SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis;
        if (lIlIIlIIIIlIlIIl($switch_TABLE$net$minecraft$util$EnumFacing$Axis)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing$Axis;
        }
        "".length();
        final int llllllllllllIlIllIIlllIlIllIllll = (Object)new int[Axis.values().length];
        try {
            llllllllllllIlIllIIlllIlIllIllll[Axis.X.ordinal()] = EnumFacing.lllIllIIIlIlll[1];
            "".length();
            if (-" ".length() > "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIlIllIIlllIlIllIllll[Axis.Y.ordinal()] = EnumFacing.lllIllIIIlIlll[3];
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIlIllIIlllIlIllIllll[Axis.Z.ordinal()] = EnumFacing.lllIllIIIlIlll[4];
            "".length();
            if (-" ".length() >= (0xA7 ^ 0xA3)) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        return EnumFacing.$SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis = (int[])(Object)llllllllllllIlIllIIlllIlIllIllll;
    }
    
    private static boolean lIlIIlIIIIlIllIl(final int llllllllllllIlIllIIlllIIlllllIII, final int llllllllllllIlIllIIlllIIllllIllI) {
        return llllllllllllIlIllIIlllIIlllllIII < llllllllllllIlIllIIlllIIllllIllI;
    }
    
    public int getFrontOffsetY() {
        int offset;
        if (lIlIIlIIIIIlllII(this.axis, Axis.Y)) {
            offset = this.axisDirection.getOffset();
            "".length();
            if (((0x94 ^ 0x84) & ~(0x2D ^ 0x3D)) < -" ".length()) {
                return (0x19 ^ 0x27) & ~(0xFE ^ 0xC0);
            }
        }
        else {
            offset = EnumFacing.lllIllIIIlIlll[0];
        }
        return offset;
    }
    
    private static String lIlIIIllllIlIIII(final String llllllllllllIlIllIIlllIlIIIlIIIl, final String llllllllllllIlIllIIlllIlIIIlIIII) {
        try {
            final SecretKeySpec llllllllllllIlIllIIlllIlIIIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIlllIlIIIlIIII.getBytes(StandardCharsets.UTF_8)), EnumFacing.lllIllIIIlIlll[9]), "DES");
            final Cipher llllllllllllIlIllIIlllIlIIIlIlll = Cipher.getInstance("DES");
            llllllllllllIlIllIIlllIlIIIlIlll.init(EnumFacing.lllIllIIIlIlll[3], llllllllllllIlIllIIlllIlIIIllIIl);
            return new String(llllllllllllIlIllIIlllIlIIIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIlllIlIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIlllIlIIIlIlIl) {
            llllllllllllIlIllIIlllIlIIIlIlIl.printStackTrace();
            return null;
        }
    }
    
    private static int lIlIIlIIIIlIIIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static String lIlIIlIIIIIlIIIl(String llllllllllllIlIllIIlllIlIlIIIIll, final String llllllllllllIlIllIIlllIlIlIIlIlI) {
        llllllllllllIlIllIIlllIlIlIIIIll = new String(Base64.getDecoder().decode(llllllllllllIlIllIIlllIlIlIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIIlllIlIlIIlIII = new StringBuilder();
        final char[] llllllllllllIlIllIIlllIlIlIIIllI = llllllllllllIlIllIIlllIlIlIIlIlI.toCharArray();
        int llllllllllllIlIllIIlllIlIlIIIlII = EnumFacing.lllIllIIIlIlll[0];
        final boolean llllllllllllIlIllIIlllIlIIlllIll = (Object)llllllllllllIlIllIIlllIlIlIIIIll.toCharArray();
        final char llllllllllllIlIllIIlllIlIIlllIlI = (char)llllllllllllIlIllIIlllIlIIlllIll.length;
        int llllllllllllIlIllIIlllIlIIlllIIl = EnumFacing.lllIllIIIlIlll[0];
        while (lIlIIlIIIIlIllIl(llllllllllllIlIllIIlllIlIIlllIIl, llllllllllllIlIllIIlllIlIIlllIlI)) {
            final char llllllllllllIlIllIIlllIlIlIIlllI = llllllllllllIlIllIIlllIlIIlllIll[llllllllllllIlIllIIlllIlIIlllIIl];
            llllllllllllIlIllIIlllIlIlIIlIII.append((char)(llllllllllllIlIllIIlllIlIlIIlllI ^ llllllllllllIlIllIIlllIlIlIIIllI[llllllllllllIlIllIIlllIlIlIIIlII % llllllllllllIlIllIIlllIlIlIIIllI.length]));
            "".length();
            ++llllllllllllIlIllIIlllIlIlIIIlII;
            ++llllllllllllIlIllIIlllIlIIlllIIl;
            "".length();
            if (" ".length() < " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIIlllIlIlIIlIII);
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
    public EnumFacing rotateY() {
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[this.ordinal()]) {
            case 3: {
                return EnumFacing.EAST;
            }
            case 6: {
                return EnumFacing.SOUTH;
            }
            case 4: {
                return EnumFacing.WEST;
            }
            case 5: {
                return EnumFacing.NORTH;
            }
            default: {
                throw new IllegalStateException(String.valueOf(new StringBuilder(EnumFacing.lllIllIIIIIIII[EnumFacing.lllIllIIIlIlll[14]]).append(this)));
            }
        }
    }
    
    private static boolean lIlIIlIIIIlIlIIl(final Object llllllllllllIlIllIIlllIIlllIlIlI) {
        return llllllllllllIlIllIIlllIIlllIlIlI != null;
    }
    
    public int getHorizontalIndex() {
        return this.horizontalIndex;
    }
    
    public static EnumFacing fromAngle(final double llllllllllllIlIllIIlllIllllIIIll) {
        return getHorizontal(MathHelper.floor_double(llllllllllllIlIllIIlllIllllIIIll / 90.0 + 0.5) & EnumFacing.lllIllIIIlIlll[4]);
    }
    
    public enum Axis implements Predicate<EnumFacing>, IStringSerializable
    {
        Y(Axis.llIIIlllIlIlll[Axis.llIIIlllIlllIl[2]], Axis.llIIIlllIlllIl[1], Axis.llIIIlllIlIlll[Axis.llIIIlllIlllIl[3]], Plane.VERTICAL);
        
        private final /* synthetic */ String name;
        private static final /* synthetic */ int[] llIIIlllIlllIl;
        private static final /* synthetic */ Map<String, Axis> NAME_LOOKUP;
        
        X(Axis.llIIIlllIlIlll[Axis.llIIIlllIlllIl[0]], Axis.llIIIlllIlllIl[0], Axis.llIIIlllIlIlll[Axis.llIIIlllIlllIl[1]], Plane.HORIZONTAL), 
        Z(Axis.llIIIlllIlIlll[Axis.llIIIlllIlllIl[4]], Axis.llIIIlllIlllIl[2], Axis.llIIIlllIlIlll[Axis.llIIIlllIlllIl[5]], Plane.HORIZONTAL);
        
        private final /* synthetic */ Plane plane;
        private static final /* synthetic */ String[] llIIIlllIlIlll;
        
        private static boolean lIIIlIllIIIIIIlI(final int llllllllllllIlllIIlllllllIllllll, final int llllllllllllIlllIIlllllllIlllllI) {
            return llllllllllllIlllIIlllllllIllllll >= llllllllllllIlllIIlllllllIlllllI;
        }
        
        public Plane getPlane() {
            return this.plane;
        }
        
        public String getName() {
            return this.name;
        }
        
        public boolean isHorizontal() {
            if (lIIIlIllIIIIIlII(this.plane, Plane.HORIZONTAL)) {
                return Axis.llIIIlllIlllIl[1] != 0;
            }
            return Axis.llIIIlllIlllIl[0] != 0;
        }
        
        @Override
        public String toString() {
            return this.name;
        }
        
        public String getName2() {
            return this.name;
        }
        
        public boolean isVertical() {
            if (lIIIlIllIIIIIlII(this.plane, Plane.VERTICAL)) {
                return Axis.llIIIlllIlllIl[1] != 0;
            }
            return Axis.llIIIlllIlllIl[0] != 0;
        }
        
        private static boolean lIIIlIllIIIIIlII(final Object llllllllllllIlllIIlllllllIllIlll, final Object llllllllllllIlllIIlllllllIllIllI) {
            return llllllllllllIlllIIlllllllIllIlll == llllllllllllIlllIIlllllllIllIllI;
        }
        
        private static String lIIIlIlIllllIIII(String llllllllllllIlllIIlllllllllIIlII, final String llllllllllllIlllIIlllllllllIlIII) {
            llllllllllllIlllIIlllllllllIIlII = new String(Base64.getDecoder().decode(llllllllllllIlllIIlllllllllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlllIIlllllllllIIlll = new StringBuilder();
            final char[] llllllllllllIlllIIlllllllllIIllI = llllllllllllIlllIIlllllllllIlIII.toCharArray();
            int llllllllllllIlllIIlllllllllIIlIl = Axis.llIIIlllIlllIl[0];
            final short llllllllllllIlllIIllllllllIlllll = (Object)llllllllllllIlllIIlllllllllIIlII.toCharArray();
            final short llllllllllllIlllIIllllllllIllllI = (short)llllllllllllIlllIIllllllllIlllll.length;
            String llllllllllllIlllIIllllllllIlllIl = (String)Axis.llIIIlllIlllIl[0];
            while (lIIIlIllIIIIIllI((int)llllllllllllIlllIIllllllllIlllIl, llllllllllllIlllIIllllllllIllllI)) {
                final char llllllllllllIlllIIlllllllllIlIlI = llllllllllllIlllIIllllllllIlllll[llllllllllllIlllIIllllllllIlllIl];
                llllllllllllIlllIIlllllllllIIlll.append((char)(llllllllllllIlllIIlllllllllIlIlI ^ llllllllllllIlllIIlllllllllIIllI[llllllllllllIlllIIlllllllllIIlIl % llllllllllllIlllIIlllllllllIIllI.length]));
                "".length();
                ++llllllllllllIlllIIlllllllllIIlIl;
                ++llllllllllllIlllIIllllllllIlllIl;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlllIIlllllllllIIlll);
        }
        
        private static boolean lIIIlIllIIIIIllI(final int llllllllllllIlllIIlllllllIlllIll, final int llllllllllllIlllIIlllllllIlllIlI) {
            return llllllllllllIlllIIlllllllIlllIll < llllllllllllIlllIIlllllllIlllIlI;
        }
        
        private static void lIIIlIllIIIIIIIl() {
            (llIIIlllIlllIl = new int[8])[0] = ((0x5A ^ 0x2A ^ (0x8E ^ 0xB5)) & (0x48 ^ 0x8 ^ (0x21 ^ 0x2A) ^ -" ".length()));
            Axis.llIIIlllIlllIl[1] = " ".length();
            Axis.llIIIlllIlllIl[2] = "  ".length();
            Axis.llIIIlllIlllIl[3] = "   ".length();
            Axis.llIIIlllIlllIl[4] = (0xC9 ^ 0xB0 ^ (0xB8 ^ 0xC5));
            Axis.llIIIlllIlllIl[5] = (0x19 ^ 0x1C);
            Axis.llIIIlllIlllIl[6] = (0xC4 ^ 0xC2);
            Axis.llIIIlllIlllIl[7] = (154 + 170 - 205 + 61 ^ 6 + 10 + 114 + 58);
        }
        
        private Axis(final String llllllllllllIlllIlIIIIIIIIIllllI, final int llllllllllllIlllIlIIIIIIIIIlllIl, final String llllllllllllIlllIlIIIIIIIIlIIIIl, final Plane llllllllllllIlllIlIIIIIIIIlIIIII) {
            this.name = llllllllllllIlllIlIIIIIIIIlIIIIl;
            this.plane = llllllllllllIlllIlIIIIIIIIlIIIII;
        }
        
        public boolean apply(final EnumFacing llllllllllllIlllIlIIIIIIIIIIlIII) {
            if (lIIIlIllIIIIIlIl(llllllllllllIlllIlIIIIIIIIIIlIII) && lIIIlIllIIIIIlII(llllllllllllIlllIlIIIIIIIIIIlIII.getAxis(), this)) {
                return Axis.llIIIlllIlllIl[1] != 0;
            }
            return Axis.llIIIlllIlllIl[0] != 0;
        }
        
        private static String lIIIlIlIllllIIIl(final String llllllllllllIlllIIllllllllIlIlII, final String llllllllllllIlllIIllllllllIlIIll) {
            try {
                final SecretKeySpec llllllllllllIlllIIllllllllIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIllllllllIlIIll.getBytes(StandardCharsets.UTF_8)), Axis.llIIIlllIlllIl[7]), "DES");
                final Cipher llllllllllllIlllIIllllllllIlIllI = Cipher.getInstance("DES");
                llllllllllllIlllIIllllllllIlIllI.init(Axis.llIIIlllIlllIl[2], llllllllllllIlllIIllllllllIlIlll);
                return new String(llllllllllllIlllIIllllllllIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIllllllllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIIllllllllIlIlIl) {
                llllllllllllIlllIIllllllllIlIlIl.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIIlIllIIIIIlIl(final Object llllllllllllIlllIIlllllllIllIlII) {
            return llllllllllllIlllIIlllllllIllIlII != null;
        }
        
        public static Axis byName(final String llllllllllllIlllIlIIIIIIIIIllIIl) {
            Axis axis;
            if (lIIIlIllIIIIIIll(llllllllllllIlllIlIIIIIIIIIllIIl)) {
                axis = null;
                "".length();
                if (" ".length() < 0) {
                    return null;
                }
            }
            else {
                axis = Axis.NAME_LOOKUP.get(llllllllllllIlllIlIIIIIIIIIllIIl.toLowerCase());
            }
            return axis;
        }
        
        static {
            lIIIlIllIIIIIIIl();
            lIIIlIlIllllIlII();
            final Axis[] enum$VALUES = new Axis[Axis.llIIIlllIlllIl[3]];
            enum$VALUES[Axis.llIIIlllIlllIl[0]] = Axis.X;
            enum$VALUES[Axis.llIIIlllIlllIl[1]] = Axis.Y;
            enum$VALUES[Axis.llIIIlllIlllIl[2]] = Axis.Z;
            ENUM$VALUES = enum$VALUES;
            NAME_LOOKUP = Maps.newHashMap();
            final char llllllllllllIlllIlIIIIIIIIlIlIII;
            final byte llllllllllllIlllIlIIIIIIIIlIlIIl = (byte)((Axis[])(Object)(llllllllllllIlllIlIIIIIIIIlIlIII = (char)(Object)values())).length;
            String llllllllllllIlllIlIIIIIIIIlIlIlI = (String)Axis.llIIIlllIlllIl[0];
            "".length();
            if (((0xD0 ^ 0xC4 ^ (0x29 ^ 0x2C)) & (0x49 ^ 0x5C ^ (0x42 ^ 0x46) ^ -" ".length())) != 0x0) {
                return;
            }
            while (!lIIIlIllIIIIIIlI((int)llllllllllllIlllIlIIIIIIIIlIlIlI, llllllllllllIlllIlIIIIIIIIlIlIIl)) {
                final Axis llllllllllllIlllIlIIIIIIIIlIllII = llllllllllllIlllIlIIIIIIIIlIlIII[llllllllllllIlllIlIIIIIIIIlIlIlI];
                Axis.NAME_LOOKUP.put(llllllllllllIlllIlIIIIIIIIlIllII.getName2().toLowerCase(), llllllllllllIlllIlIIIIIIIIlIllII);
                "".length();
                ++llllllllllllIlllIlIIIIIIIIlIlIlI;
            }
        }
        
        private static void lIIIlIlIllllIlII() {
            (llIIIlllIlIlll = new String[Axis.llIIIlllIlllIl[6]])[Axis.llIIIlllIlllIl[0]] = lIIIlIlIllllIIII("Nw==", "oiRtu");
            Axis.llIIIlllIlIlll[Axis.llIIIlllIlllIl[1]] = lIIIlIlIllllIIII("FA==", "lFZtt");
            Axis.llIIIlllIlIlll[Axis.llIIIlllIlllIl[2]] = lIIIlIlIllllIIIl("VV3yfntRajY=", "jnoGz");
            Axis.llIIIlllIlIlll[Axis.llIIIlllIlllIl[3]] = lIIIlIlIllllIIII("Gg==", "crFXa");
            Axis.llIIIlllIlIlll[Axis.llIIIlllIlllIl[4]] = lIIIlIlIllllIIIl("zRxl5iIdWOA=", "BNsjd");
            Axis.llIIIlllIlIlll[Axis.llIIIlllIlllIl[5]] = lIIIlIlIllllIIlI("Hd45cdfVPjs=", "EafTY");
        }
        
        private static boolean lIIIlIllIIIIIIll(final Object llllllllllllIlllIIlllllllIllIIlI) {
            return llllllllllllIlllIIlllllllIllIIlI == null;
        }
        
        private static String lIIIlIlIllllIIlI(final String llllllllllllIlllIIllllllllIIIlll, final String llllllllllllIlllIIllllllllIIIllI) {
            try {
                final SecretKeySpec llllllllllllIlllIIllllllllIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIllllllllIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlllIIllllllllIIlIIl = Cipher.getInstance("Blowfish");
                llllllllllllIlllIIllllllllIIlIIl.init(Axis.llIIIlllIlllIl[2], llllllllllllIlllIIllllllllIIlIlI);
                return new String(llllllllllllIlllIIllllllllIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIllllllllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIIllllllllIIlIII) {
                llllllllllllIlllIIllllllllIIlIII.printStackTrace();
                return null;
            }
        }
    }
    
    public enum Plane implements Predicate<EnumFacing>, Iterable<EnumFacing>
    {
        VERTICAL(Plane.llIIIlIIIlllll[Plane.llIIIlIIlIIIII[1]], Plane.llIIIlIIlIIIII[1]);
        
        private static final /* synthetic */ int[] llIIIlIIlIIIII;
        
        HORIZONTAL(Plane.llIIIlIIIlllll[Plane.llIIIlIIlIIIII[0]], Plane.llIIIlIIlIIIII[0]);
        
        private static final /* synthetic */ String[] llIIIlIIIlllll;
        
        public Iterator<EnumFacing> iterator() {
            return (Iterator<EnumFacing>)Iterators.forArray((Object[])this.facings());
        }
        
        public EnumFacing random(final Random llllllllllllIlllIllIIIIIllIIlIlI) {
            final EnumFacing[] llllllllllllIlllIllIIIIIllIIllII = this.facings();
            return llllllllllllIlllIllIIIIIllIIllII[llllllllllllIlllIllIIIIIllIIlIlI.nextInt(llllllllllllIlllIllIIIIIllIIllII.length)];
        }
        
        private static boolean lIIIlIIIllllllII(final int llllllllllllIlllIllIIIIIlIIIlIIl, final int llllllllllllIlllIllIIIIIlIIIlIII) {
            return llllllllllllIlllIllIIIIIlIIIlIIl < llllllllllllIlllIllIIIIIlIIIlIII;
        }
        
        static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing$Plane() {
            final int[] $switch_TABLE$net$minecraft$util$EnumFacing$Plane = Plane.$SWITCH_TABLE$net$minecraft$util$EnumFacing$Plane;
            if (lIIIlIIIlllllIlI($switch_TABLE$net$minecraft$util$EnumFacing$Plane)) {
                return $switch_TABLE$net$minecraft$util$EnumFacing$Plane;
            }
            "".length();
            final Exception llllllllllllIlllIllIIIIIlIllIIlI = (Object)new int[values().length];
            try {
                llllllllllllIlllIllIIIIIlIllIIlI[Plane.HORIZONTAL.ordinal()] = Plane.llIIIlIIlIIIII[1];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError) {
                "".length();
            }
            try {
                llllllllllllIlllIllIIIIIlIllIIlI[Plane.VERTICAL.ordinal()] = Plane.llIIIlIIlIIIII[2];
                "".length();
                if ("   ".length() < 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                "".length();
            }
            return Plane.$SWITCH_TABLE$net$minecraft$util$EnumFacing$Plane = (int[])(Object)llllllllllllIlllIllIIIIIlIllIIlI;
        }
        
        private static boolean lIIIlIIIlllllIlI(final Object llllllllllllIlllIllIIIIIlIIIIlIl) {
            return llllllllllllIlllIllIIIIIlIIIIlIl != null;
        }
        
        private static String lIIIlIIIllllIlll(final String llllllllllllIlllIllIIIIIlIlIlIlI, final String llllllllllllIlllIllIIIIIlIlIlIIl) {
            try {
                final SecretKeySpec llllllllllllIlllIllIIIIIlIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIIIIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), Plane.llIIIlIIlIIIII[5]), "DES");
                final Cipher llllllllllllIlllIllIIIIIlIlIllII = Cipher.getInstance("DES");
                llllllllllllIlllIllIIIIIlIlIllII.init(Plane.llIIIlIIlIIIII[2], llllllllllllIlllIllIIIIIlIlIllIl);
                return new String(llllllllllllIlllIllIIIIIlIlIllII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIIIIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIllIIIIIlIlIlIll) {
                llllllllllllIlllIllIIIIIlIlIlIll.printStackTrace();
                return null;
            }
        }
        
        private Plane(final String llllllllllllIlllIllIIIIIllIlIllI, final int llllllllllllIlllIllIIIIIllIlIlIl) {
        }
        
        private static void lIIIlIIIlllllIIl() {
            (llIIIlIIlIIIII = new int[6])[0] = ((0xD2 ^ 0x82) & ~(0xEE ^ 0xBE));
            Plane.llIIIlIIlIIIII[1] = " ".length();
            Plane.llIIIlIIlIIIII[2] = "  ".length();
            Plane.llIIIlIIlIIIII[3] = (0xAC ^ 0xA8);
            Plane.llIIIlIIlIIIII[4] = "   ".length();
            Plane.llIIIlIIlIIIII[5] = (0x1B ^ 0x13);
        }
        
        private static String lIIIlIIIllllIllI(String llllllllllllIlllIllIIIIIlIIlIlIl, final String llllllllllllIlllIllIIIIIlIIllIIl) {
            llllllllllllIlllIllIIIIIlIIlIlIl = new String(Base64.getDecoder().decode(llllllllllllIlllIllIIIIIlIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlllIllIIIIIlIIllIII = new StringBuilder();
            final char[] llllllllllllIlllIllIIIIIlIIlIlll = llllllllllllIlllIllIIIIIlIIllIIl.toCharArray();
            int llllllllllllIlllIllIIIIIlIIlIllI = Plane.llIIIlIIlIIIII[0];
            final long llllllllllllIlllIllIIIIIlIIlIIII = (Object)llllllllllllIlllIllIIIIIlIIlIlIl.toCharArray();
            final double llllllllllllIlllIllIIIIIlIIIllll = llllllllllllIlllIllIIIIIlIIlIIII.length;
            Exception llllllllllllIlllIllIIIIIlIIIlllI = (Exception)Plane.llIIIlIIlIIIII[0];
            while (lIIIlIIIllllllII((int)llllllllllllIlllIllIIIIIlIIIlllI, (int)llllllllllllIlllIllIIIIIlIIIllll)) {
                final char llllllllllllIlllIllIIIIIlIIllIll = llllllllllllIlllIllIIIIIlIIlIIII[llllllllllllIlllIllIIIIIlIIIlllI];
                llllllllllllIlllIllIIIIIlIIllIII.append((char)(llllllllllllIlllIllIIIIIlIIllIll ^ llllllllllllIlllIllIIIIIlIIlIlll[llllllllllllIlllIllIIIIIlIIlIllI % llllllllllllIlllIllIIIIIlIIlIlll.length]));
                "".length();
                ++llllllllllllIlllIllIIIIIlIIlIllI;
                ++llllllllllllIlllIllIIIIIlIIIlllI;
                "".length();
                if ((184 + 84 - 132 + 58 ^ 192 + 45 - 97 + 58) == ((103 + 51 - 125 + 140 ^ 74 + 148 - 115 + 57) & (0xD5 ^ 0x83 ^ (0x27 ^ 0x7C) ^ -" ".length()))) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlllIllIIIIIlIIllIII);
        }
        
        static {
            lIIIlIIIlllllIIl();
            lIIIlIIIlllllIII();
            final Plane[] enum$VALUES = new Plane[Plane.llIIIlIIlIIIII[2]];
            enum$VALUES[Plane.llIIIlIIlIIIII[0]] = Plane.HORIZONTAL;
            enum$VALUES[Plane.llIIIlIIlIIIII[1]] = Plane.VERTICAL;
            ENUM$VALUES = enum$VALUES;
        }
        
        public EnumFacing[] facings() {
            switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing$Plane()[this.ordinal()]) {
                case 1: {
                    final EnumFacing[] array = new EnumFacing[Plane.llIIIlIIlIIIII[3]];
                    array[Plane.llIIIlIIlIIIII[0]] = EnumFacing.NORTH;
                    array[Plane.llIIIlIIlIIIII[1]] = EnumFacing.EAST;
                    array[Plane.llIIIlIIlIIIII[2]] = EnumFacing.SOUTH;
                    array[Plane.llIIIlIIlIIIII[4]] = EnumFacing.WEST;
                    return array;
                }
                case 2: {
                    final EnumFacing[] array2 = new EnumFacing[Plane.llIIIlIIlIIIII[2]];
                    array2[Plane.llIIIlIIlIIIII[0]] = EnumFacing.UP;
                    array2[Plane.llIIIlIIlIIIII[1]] = EnumFacing.DOWN;
                    return array2;
                }
                default: {
                    throw new Error(Plane.llIIIlIIIlllll[Plane.llIIIlIIlIIIII[2]]);
                }
            }
        }
        
        private static void lIIIlIIIlllllIII() {
            (llIIIlIIIlllll = new String[Plane.llIIIlIIlIIIII[4]])[Plane.llIIIlIIlIIIII[0]] = lIIIlIIIllllIllI("PAkYAwk7CB4LHw==", "tFJJS");
            Plane.llIIIlIIIlllll[Plane.llIIIlIIlIIIII[1]] = lIIIlIIIllllIlll("a9E3cwH8zqaYn9leMGXj8w==", "YPsPh");
            Plane.llIIIlIIIlllll[Plane.llIIIlIIlIIIII[2]] = lIIIlIIIllllIlll("AVIbb44qs3Ab79JNefOy9s+2gtYDtn+5S5s4c+qXwJr1nviZpk7kQr4urXMOT2LI", "YOAqh");
        }
        
        public boolean apply(final EnumFacing llllllllllllIlllIllIIIIIllIIIlIl) {
            if (lIIIlIIIlllllIlI(llllllllllllIlllIllIIIIIllIIIlIl) && lIIIlIIIlllllIll(llllllllllllIlllIllIIIIIllIIIlIl.getAxis().getPlane(), this)) {
                return Plane.llIIIlIIlIIIII[1] != 0;
            }
            return Plane.llIIIlIIlIIIII[0] != 0;
        }
        
        private static boolean lIIIlIIIlllllIll(final Object llllllllllllIlllIllIIIIIlIIIIIIl, final Object llllllllllllIlllIllIIIIIIlllllll) {
            return llllllllllllIlllIllIIIIIlIIIIIIl == llllllllllllIlllIllIIIIIIlllllll;
        }
    }
    
    public enum AxisDirection
    {
        NEGATIVE(AxisDirection.llIIlIIllIllll[AxisDirection.llIIlIIlllIIII[2]], AxisDirection.llIIlIIlllIIII[1], AxisDirection.llIIlIIlllIIII[3], AxisDirection.llIIlIIllIllll[AxisDirection.llIIlIIlllIIII[4]]);
        
        private static final /* synthetic */ int[] llIIlIIlllIIII;
        private static final /* synthetic */ String[] llIIlIIllIllll;
        private final /* synthetic */ int offset;
        private final /* synthetic */ String description;
        
        POSITIVE(AxisDirection.llIIlIIllIllll[AxisDirection.llIIlIIlllIIII[0]], AxisDirection.llIIlIIlllIIII[0], AxisDirection.llIIlIIlllIIII[1], AxisDirection.llIIlIIllIllll[AxisDirection.llIIlIIlllIIII[1]]);
        
        @Override
        public String toString() {
            return this.description;
        }
        
        private static void lIIIllIIlIlIIIIl() {
            (llIIlIIlllIIII = new int[7])[0] = ((0xB2 ^ 0xBF) & ~(0x65 ^ 0x68));
            AxisDirection.llIIlIIlllIIII[1] = " ".length();
            AxisDirection.llIIlIIlllIIII[2] = "  ".length();
            AxisDirection.llIIlIIlllIIII[3] = -" ".length();
            AxisDirection.llIIlIIlllIIII[4] = "   ".length();
            AxisDirection.llIIlIIlllIIII[5] = (92 + 131 - 187 + 163 ^ 0 + 131 - 66 + 130);
            AxisDirection.llIIlIIlllIIII[6] = (0x77 ^ 0x7F);
        }
        
        private static void lIIIllIIlIlIIIII() {
            (llIIlIIllIllll = new String[AxisDirection.llIIlIIlllIIII[5]])[AxisDirection.llIIlIIlllIIII[0]] = lIIIllIIlIIllllI("7GbVvzmBEJC3ytr8MebJ9w==", "ATuQI");
            AxisDirection.llIIlIIllIllll[AxisDirection.llIIlIIlllIIII[1]] = lIIIllIIlIIlllll("AWGNofRbpwmCHMS7qSAN/0MqVNEHwps4", "oxcoU");
            AxisDirection.llIIlIIllIllll[AxisDirection.llIIlIIlllIIII[2]] = lIIIllIIlIIllllI("puOUx+FdvzDyi+9M8cs/WQ==", "FIoqM");
            AxisDirection.llIIlIIllIllll[AxisDirection.llIIlIIlllIIII[4]] = lIIIllIIlIIllllI("bQH55hwiIDu/NX9+BDpomLvLC6yKOwKz", "ssuVr");
        }
        
        static {
            lIIIllIIlIlIIIIl();
            lIIIllIIlIlIIIII();
            final AxisDirection[] enum$VALUES = new AxisDirection[AxisDirection.llIIlIIlllIIII[2]];
            enum$VALUES[AxisDirection.llIIlIIlllIIII[0]] = AxisDirection.POSITIVE;
            enum$VALUES[AxisDirection.llIIlIIlllIIII[1]] = AxisDirection.NEGATIVE;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static String lIIIllIIlIIlllll(final String llllllllllllIlllIIlIIlIlIIIlIIll, final String llllllllllllIlllIIlIIlIlIIIlIIII) {
            try {
                final SecretKeySpec llllllllllllIlllIIlIIlIlIIIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlIIlIlIIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlllIIlIIlIlIIIlIlIl = Cipher.getInstance("Blowfish");
                llllllllllllIlllIIlIIlIlIIIlIlIl.init(AxisDirection.llIIlIIlllIIII[2], llllllllllllIlllIIlIIlIlIIIlIllI);
                return new String(llllllllllllIlllIIlIIlIlIIIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlIIlIlIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIIlIIlIlIIIlIlII) {
                llllllllllllIlllIIlIIlIlIIIlIlII.printStackTrace();
                return null;
            }
        }
        
        public int getOffset() {
            return this.offset;
        }
        
        private AxisDirection(final String llllllllllllIlllIIlIIlIlIIlIllII, final int llllllllllllIlllIIlIIlIlIIlIlIll, final int llllllllllllIlllIIlIIlIlIIlIlIlI, final String llllllllllllIlllIIlIIlIlIIlIlIIl) {
            this.offset = llllllllllllIlllIIlIIlIlIIlIlIlI;
            this.description = llllllllllllIlllIIlIIlIlIIlIlIIl;
        }
        
        private static String lIIIllIIlIIllllI(final String llllllllllllIlllIIlIIlIlIIIIIllI, final String llllllllllllIlllIIlIIlIlIIIIIlIl) {
            try {
                final SecretKeySpec llllllllllllIlllIIlIIlIlIIIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlIIlIlIIIIIlIl.getBytes(StandardCharsets.UTF_8)), AxisDirection.llIIlIIlllIIII[6]), "DES");
                final Cipher llllllllllllIlllIIlIIlIlIIIIlIII = Cipher.getInstance("DES");
                llllllllllllIlllIIlIIlIlIIIIlIII.init(AxisDirection.llIIlIIlllIIII[2], llllllllllllIlllIIlIIlIlIIIIlIIl);
                return new String(llllllllllllIlllIIlIIlIlIIIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlIIlIlIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIIlIIlIlIIIIIlll) {
                llllllllllllIlllIIlIIlIlIIIIIlll.printStackTrace();
                return null;
            }
        }
    }
}
