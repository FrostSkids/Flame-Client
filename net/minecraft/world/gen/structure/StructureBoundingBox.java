// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.structure;

import net.minecraft.nbt.NBTTagIntArray;
import java.util.Arrays;
import com.google.common.base.Objects;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3i;
import net.minecraft.util.EnumFacing;

public class StructureBoundingBox
{
    private static final /* synthetic */ int[] lIlIllllIlIlll;
    public /* synthetic */ int maxX;
    private static final /* synthetic */ String[] lIlIllllIIllII;
    public /* synthetic */ int maxZ;
    public /* synthetic */ int minX;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing;
    public /* synthetic */ int minZ;
    public /* synthetic */ int maxY;
    public /* synthetic */ int minY;
    
    public static StructureBoundingBox getComponentToAddBoundingBox(final int lllllllllllllIIIIlIlIIIlIIIIlIll, final int lllllllllllllIIIIlIlIIIlIIIIIIII, final int lllllllllllllIIIIlIlIIIlIIIIlIIl, final int lllllllllllllIIIIlIlIIIlIIIIlIII, final int lllllllllllllIIIIlIlIIIlIIIIIlll, final int lllllllllllllIIIIlIlIIIIllllllII, final int lllllllllllllIIIIlIlIIIIlllllIll, final int lllllllllllllIIIIlIlIIIIlllllIlI, final int lllllllllllllIIIIlIlIIIIlllllIIl, final EnumFacing lllllllllllllIIIIlIlIIIIlllllIII) {
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[lllllllllllllIIIIlIlIIIIlllllIII.ordinal()]) {
            case 3: {
                return new StructureBoundingBox(lllllllllllllIIIIlIlIIIlIIIIlIll + lllllllllllllIIIIlIlIIIlIIIIlIII, lllllllllllllIIIIlIlIIIlIIIIIIII + lllllllllllllIIIIlIlIIIlIIIIIlll, lllllllllllllIIIIlIlIIIlIIIIlIIl - lllllllllllllIIIIlIlIIIIlllllIIl + StructureBoundingBox.lIlIllllIlIlll[2] + lllllllllllllIIIIlIlIIIIllllllII, lllllllllllllIIIIlIlIIIlIIIIlIll + lllllllllllllIIIIlIlIIIIlllllIll - StructureBoundingBox.lIlIllllIlIlll[2] + lllllllllllllIIIIlIlIIIlIIIIlIII, lllllllllllllIIIIlIlIIIlIIIIIIII + lllllllllllllIIIIlIlIIIIlllllIlI - StructureBoundingBox.lIlIllllIlIlll[2] + lllllllllllllIIIIlIlIIIlIIIIIlll, lllllllllllllIIIIlIlIIIlIIIIlIIl + lllllllllllllIIIIlIlIIIIllllllII);
            }
            case 4: {
                return new StructureBoundingBox(lllllllllllllIIIIlIlIIIlIIIIlIll + lllllllllllllIIIIlIlIIIlIIIIlIII, lllllllllllllIIIIlIlIIIlIIIIIIII + lllllllllllllIIIIlIlIIIlIIIIIlll, lllllllllllllIIIIlIlIIIlIIIIlIIl + lllllllllllllIIIIlIlIIIIllllllII, lllllllllllllIIIIlIlIIIlIIIIlIll + lllllllllllllIIIIlIlIIIIlllllIll - StructureBoundingBox.lIlIllllIlIlll[2] + lllllllllllllIIIIlIlIIIlIIIIlIII, lllllllllllllIIIIlIlIIIlIIIIIIII + lllllllllllllIIIIlIlIIIIlllllIlI - StructureBoundingBox.lIlIllllIlIlll[2] + lllllllllllllIIIIlIlIIIlIIIIIlll, lllllllllllllIIIIlIlIIIlIIIIlIIl + lllllllllllllIIIIlIlIIIIlllllIIl - StructureBoundingBox.lIlIllllIlIlll[2] + lllllllllllllIIIIlIlIIIIllllllII);
            }
            case 5: {
                return new StructureBoundingBox(lllllllllllllIIIIlIlIIIlIIIIlIll - lllllllllllllIIIIlIlIIIIlllllIIl + StructureBoundingBox.lIlIllllIlIlll[2] + lllllllllllllIIIIlIlIIIIllllllII, lllllllllllllIIIIlIlIIIlIIIIIIII + lllllllllllllIIIIlIlIIIlIIIIIlll, lllllllllllllIIIIlIlIIIlIIIIlIIl + lllllllllllllIIIIlIlIIIlIIIIlIII, lllllllllllllIIIIlIlIIIlIIIIlIll + lllllllllllllIIIIlIlIIIIllllllII, lllllllllllllIIIIlIlIIIlIIIIIIII + lllllllllllllIIIIlIlIIIIlllllIlI - StructureBoundingBox.lIlIllllIlIlll[2] + lllllllllllllIIIIlIlIIIlIIIIIlll, lllllllllllllIIIIlIlIIIlIIIIlIIl + lllllllllllllIIIIlIlIIIIlllllIll - StructureBoundingBox.lIlIllllIlIlll[2] + lllllllllllllIIIIlIlIIIlIIIIlIII);
            }
            case 6: {
                return new StructureBoundingBox(lllllllllllllIIIIlIlIIIlIIIIlIll + lllllllllllllIIIIlIlIIIIllllllII, lllllllllllllIIIIlIlIIIlIIIIIIII + lllllllllllllIIIIlIlIIIlIIIIIlll, lllllllllllllIIIIlIlIIIlIIIIlIIl + lllllllllllllIIIIlIlIIIlIIIIlIII, lllllllllllllIIIIlIlIIIlIIIIlIll + lllllllllllllIIIIlIlIIIIlllllIIl - StructureBoundingBox.lIlIllllIlIlll[2] + lllllllllllllIIIIlIlIIIIllllllII, lllllllllllllIIIIlIlIIIlIIIIIIII + lllllllllllllIIIIlIlIIIIlllllIlI - StructureBoundingBox.lIlIllllIlIlll[2] + lllllllllllllIIIIlIlIIIlIIIIIlll, lllllllllllllIIIIlIlIIIlIIIIlIIl + lllllllllllllIIIIlIlIIIIlllllIll - StructureBoundingBox.lIlIllllIlIlll[2] + lllllllllllllIIIIlIlIIIlIIIIlIII);
            }
            default: {
                return new StructureBoundingBox(lllllllllllllIIIIlIlIIIlIIIIlIll + lllllllllllllIIIIlIlIIIlIIIIlIII, lllllllllllllIIIIlIlIIIlIIIIIIII + lllllllllllllIIIIlIlIIIlIIIIIlll, lllllllllllllIIIIlIlIIIlIIIIlIIl + lllllllllllllIIIIlIlIIIIllllllII, lllllllllllllIIIIlIlIIIlIIIIlIll + lllllllllllllIIIIlIlIIIIlllllIll - StructureBoundingBox.lIlIllllIlIlll[2] + lllllllllllllIIIIlIlIIIlIIIIlIII, lllllllllllllIIIIlIlIIIlIIIIIIII + lllllllllllllIIIIlIlIIIIlllllIlI - StructureBoundingBox.lIlIllllIlIlll[2] + lllllllllllllIIIIlIlIIIlIIIIIlll, lllllllllllllIIIIlIlIIIlIIIIlIIl + lllllllllllllIIIIlIlIIIIlllllIIl - StructureBoundingBox.lIlIllllIlIlll[2] + lllllllllllllIIIIlIlIIIIllllllII);
            }
        }
    }
    
    private static void llllIlIIllIlIlI() {
        (lIlIllllIlIlll = new int[10])[0] = (0x12 ^ 0x14);
        StructureBoundingBox.lIlIllllIlIlll[1] = ((0x49 ^ 0x31 ^ (0x51 ^ 0x77)) & (0x1F ^ 0x40 ^ " ".length() ^ -" ".length()));
        StructureBoundingBox.lIlIllllIlIlll[2] = " ".length();
        StructureBoundingBox.lIlIllllIlIlll[3] = "  ".length();
        StructureBoundingBox.lIlIllllIlIlll[4] = "   ".length();
        StructureBoundingBox.lIlIllllIlIlll[5] = (0x25 ^ 0x21);
        StructureBoundingBox.lIlIllllIlIlll[6] = (73 + 61 - 61 + 88 ^ 8 + 27 + 20 + 109);
        StructureBoundingBox.lIlIllllIlIlll[7] = (-" ".length() & (-1 & Integer.MAX_VALUE));
        StructureBoundingBox.lIlIllllIlIlll[8] = (-(0xFFFFF2EF & 0x7D72) & (0xFFFFFAFB & 0x7765));
        StructureBoundingBox.lIlIllllIlIlll[9] = (0x20 ^ 0x28);
    }
    
    public static StructureBoundingBox func_175899_a(final int lllllllllllllIIIIlIlIIIIlllIlIll, final int lllllllllllllIIIIlIlIIIIlllIlIlI, final int lllllllllllllIIIIlIlIIIIlllIlIIl, final int lllllllllllllIIIIlIlIIIIlllIlllI, final int lllllllllllllIIIIlIlIIIIlllIllIl, final int lllllllllllllIIIIlIlIIIIlllIIllI) {
        return new StructureBoundingBox(Math.min(lllllllllllllIIIIlIlIIIIlllIlIll, lllllllllllllIIIIlIlIIIIlllIlllI), Math.min(lllllllllllllIIIIlIlIIIIlllIlIlI, lllllllllllllIIIIlIlIIIIlllIllIl), Math.min(lllllllllllllIIIIlIlIIIIlllIlIIl, lllllllllllllIIIIlIlIIIIlllIIllI), Math.max(lllllllllllllIIIIlIlIIIIlllIlIll, lllllllllllllIIIIlIlIIIIlllIlllI), Math.max(lllllllllllllIIIIlIlIIIIlllIlIlI, lllllllllllllIIIIlIlIIIIlllIllIl), Math.max(lllllllllllllIIIIlIlIIIIlllIlIIl, lllllllllllllIIIIlIlIIIIlllIIllI));
    }
    
    public StructureBoundingBox(final int lllllllllllllIIIIlIlIIIIllIlIlll, final int lllllllllllllIIIIlIlIIIIllIlIllI, final int lllllllllllllIIIIlIlIIIIllIlIlIl, final int lllllllllllllIIIIlIlIIIIllIlIlII, final int lllllllllllllIIIIlIlIIIIllIlIIll, final int lllllllllllllIIIIlIlIIIIllIlIIlI) {
        this.minX = lllllllllllllIIIIlIlIIIIllIlIlll;
        this.minY = lllllllllllllIIIIlIlIIIIllIlIllI;
        this.minZ = lllllllllllllIIIIlIlIIIIllIlIlIl;
        this.maxX = lllllllllllllIIIIlIlIIIIllIlIlII;
        this.maxY = lllllllllllllIIIIlIlIIIIllIlIIll;
        this.maxZ = lllllllllllllIIIIlIlIIIIllIlIIlI;
    }
    
    public void offset(final int lllllllllllllIIIIlIlIIIIlIIlIIlI, final int lllllllllllllIIIIlIlIIIIlIIlIIIl, final int lllllllllllllIIIIlIlIIIIlIIIllII) {
        this.minX += lllllllllllllIIIIlIlIIIIlIIlIIlI;
        this.minY += lllllllllllllIIIIlIlIIIIlIIlIIIl;
        this.minZ += lllllllllllllIIIIlIlIIIIlIIIllII;
        this.maxX += lllllllllllllIIIIlIlIIIIlIIlIIlI;
        this.maxY += lllllllllllllIIIIlIlIIIIlIIlIIIl;
        this.maxZ += lllllllllllllIIIIlIlIIIIlIIIllII;
    }
    
    public int getYSize() {
        return this.maxY - this.minY + StructureBoundingBox.lIlIllllIlIlll[2];
    }
    
    private static boolean llllIlIIlllIIII(final Object lllllllllllllIIIIlIlIIIIIIlIlIll) {
        return lllllllllllllIIIIlIlIIIIIIlIlIll != null;
    }
    
    public StructureBoundingBox(final StructureBoundingBox lllllllllllllIIIIlIlIIIIlllIIIII) {
        this.minX = lllllllllllllIIIIlIlIIIIlllIIIII.minX;
        this.minY = lllllllllllllIIIIlIlIIIIlllIIIII.minY;
        this.minZ = lllllllllllllIIIIlIlIIIIlllIIIII.minZ;
        this.maxX = lllllllllllllIIIIlIlIIIIlllIIIII.maxX;
        this.maxY = lllllllllllllIIIIlIlIIIIlllIIIII.maxY;
        this.maxZ = lllllllllllllIIIIlIlIIIIlllIIIII.maxZ;
    }
    
    private static boolean llllIlIIllIllIl(final int lllllllllllllIIIIlIlIIIIIIllIllI, final int lllllllllllllIIIIlIlIIIIIIllIlIl) {
        return lllllllllllllIIIIlIlIIIIIIllIllI >= lllllllllllllIIIIlIlIIIIIIllIlIl;
    }
    
    private static void llllIlIIllIIIlI() {
        (lIlIllllIIllII = new String[StructureBoundingBox.lIlIllllIlIlll[0]])[StructureBoundingBox.lIlIllllIlIlll[1]] = llllIlIIlIlllII("9lHJCMOYNHg=", "wldPs");
        StructureBoundingBox.lIlIllllIIllII[StructureBoundingBox.lIlIllllIlIlll[2]] = llllIlIIllIIIII("HUY=", "dvukq");
        StructureBoundingBox.lIlIllllIIllII[StructureBoundingBox.lIlIllllIlIlll[3]] = llllIlIIllIIIII("FVg=", "ohfVL");
        StructureBoundingBox.lIlIllllIIllII[StructureBoundingBox.lIlIllllIlIlll[4]] = llllIlIIllIIIII("Amg=", "zYolW");
        StructureBoundingBox.lIlIllllIIllII[StructureBoundingBox.lIlIllllIlIlll[5]] = llllIlIIlIlllII("nVPR/y8yEDM=", "irYpP");
        StructureBoundingBox.lIlIllllIIllII[StructureBoundingBox.lIlIllllIlIlll[6]] = llllIlIIllIIIIl("K/83lVOFmUE=", "mSvNS");
    }
    
    public Vec3i getCenter() {
        return new BlockPos(this.minX + (this.maxX - this.minX + StructureBoundingBox.lIlIllllIlIlll[2]) / StructureBoundingBox.lIlIllllIlIlll[3], this.minY + (this.maxY - this.minY + StructureBoundingBox.lIlIllllIlIlll[2]) / StructureBoundingBox.lIlIllllIlIlll[3], this.minZ + (this.maxZ - this.minZ + StructureBoundingBox.lIlIllllIlIlll[2]) / StructureBoundingBox.lIlIllllIlIlll[3]);
    }
    
    public boolean isVecInside(final Vec3i lllllllllllllIIIIlIlIIIIlIIIlIII) {
        if (llllIlIIllIllIl(lllllllllllllIIIIlIlIIIIlIIIlIII.getX(), this.minX) && llllIlIIllIllll(lllllllllllllIIIIlIlIIIIlIIIlIII.getX(), this.maxX) && llllIlIIllIllIl(lllllllllllllIIIIlIlIIIIlIIIlIII.getZ(), this.minZ) && llllIlIIllIllll(lllllllllllllIIIIlIlIIIIlIIIlIII.getZ(), this.maxZ) && llllIlIIllIllIl(lllllllllllllIIIIlIlIIIIlIIIlIII.getY(), this.minY) && llllIlIIllIllll(lllllllllllllIIIIlIlIIIIlIIIlIII.getY(), this.maxY)) {
            return StructureBoundingBox.lIlIllllIlIlll[2] != 0;
        }
        return StructureBoundingBox.lIlIllllIlIlll[1] != 0;
    }
    
    public Vec3i func_175896_b() {
        return new Vec3i(this.maxX - this.minX, this.maxY - this.minY, this.maxZ - this.minZ);
    }
    
    public boolean intersectsWith(final int lllllllllllllIIIIlIlIIIIlIlIIIIl, final int lllllllllllllIIIIlIlIIIIlIlIIlIl, final int lllllllllllllIIIIlIlIIIIlIIlllll, final int lllllllllllllIIIIlIlIIIIlIIllllI) {
        if (llllIlIIllIllIl(this.maxX, lllllllllllllIIIIlIlIIIIlIlIIIIl) && llllIlIIllIllll(this.minX, lllllllllllllIIIIlIlIIIIlIIlllll) && llllIlIIllIllIl(this.maxZ, lllllllllllllIIIIlIlIIIIlIlIIlIl) && llllIlIIllIllll(this.minZ, lllllllllllllIIIIlIlIIIIlIIllllI)) {
            return StructureBoundingBox.lIlIllllIlIlll[2] != 0;
        }
        return StructureBoundingBox.lIlIllllIlIlll[1] != 0;
    }
    
    private static String llllIlIIlIlllII(final String lllllllllllllIIIIlIlIIIIIlIIIIII, final String lllllllllllllIIIIlIlIIIIIlIIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIlIIIIIlIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIlIIIIIlIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIlIlIIIIIlIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIlIlIIIIIlIIIlII.init(StructureBoundingBox.lIlIllllIlIlll[3], lllllllllllllIIIIlIlIIIIIlIIIlIl);
            return new String(lllllllllllllIIIIlIlIIIIIlIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIlIIIIIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIlIIIIIlIIIIll) {
            lllllllllllllIIIIlIlIIIIIlIIIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIlIIllIllll(final int lllllllllllllIIIIlIlIIIIIIlIlllI, final int lllllllllllllIIIIlIlIIIIIIlIllIl) {
        return lllllllllllllIIIIlIlIIIIIIlIlllI <= lllllllllllllIIIIlIlIIIIIIlIllIl;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing = StructureBoundingBox.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
        if (llllIlIIlllIIII($switch_TABLE$net$minecraft$util$EnumFacing)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing;
        }
        "".length();
        final float lllllllllllllIIIIlIlIIIIIllIllll = (Object)new int[EnumFacing.values().length];
        try {
            lllllllllllllIIIIlIlIIIIIllIllll[EnumFacing.DOWN.ordinal()] = StructureBoundingBox.lIlIllllIlIlll[2];
            "".length();
            if ("   ".length() >= (168 + 110 - 148 + 45 ^ 75 + 5 - 12 + 103)) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIIIlIlIIIIIllIllll[EnumFacing.EAST.ordinal()] = StructureBoundingBox.lIlIllllIlIlll[0];
            "".length();
            if ((0x2D ^ 0x28) <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIIIlIlIIIIIllIllll[EnumFacing.NORTH.ordinal()] = StructureBoundingBox.lIlIllllIlIlll[4];
            "".length();
            if (((158 + 108 - 208 + 169 ^ 155 + 84 - 149 + 77) & (124 + 95 - 180 + 91 ^ 164 + 194 - 192 + 32 ^ -" ".length())) < ((0x58 ^ 0x50 ^ (0x42 ^ 0x60)) & (125 + 25 - 53 + 56 ^ 74 + 59 - 64 + 110 ^ -" ".length()))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIIIIlIlIIIIIllIllll[EnumFacing.SOUTH.ordinal()] = StructureBoundingBox.lIlIllllIlIlll[5];
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIIIIlIlIIIIIllIllll[EnumFacing.UP.ordinal()] = StructureBoundingBox.lIlIllllIlIlll[3];
            "".length();
            if ("  ".length() <= -" ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIIIIlIlIIIIIllIllll[EnumFacing.WEST.ordinal()] = StructureBoundingBox.lIlIllllIlIlll[6];
            "".length();
            if ((("  ".length() ^ (0x61 ^ 0x2)) & (0xAB ^ 0xB4 ^ (0x1E ^ 0x60) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return StructureBoundingBox.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)lllllllllllllIIIIlIlIIIIIllIllll;
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper((Object)this).add(StructureBoundingBox.lIlIllllIIllII[StructureBoundingBox.lIlIllllIlIlll[1]], this.minX).add(StructureBoundingBox.lIlIllllIIllII[StructureBoundingBox.lIlIllllIlIlll[2]], this.minY).add(StructureBoundingBox.lIlIllllIIllII[StructureBoundingBox.lIlIllllIlIlll[3]], this.minZ).add(StructureBoundingBox.lIlIllllIIllII[StructureBoundingBox.lIlIllllIlIlll[4]], this.maxX).add(StructureBoundingBox.lIlIllllIIllII[StructureBoundingBox.lIlIllllIlIlll[5]], this.maxY).add(StructureBoundingBox.lIlIllllIIllII[StructureBoundingBox.lIlIllllIlIlll[6]], this.maxZ).toString();
    }
    
    public void expandTo(final StructureBoundingBox lllllllllllllIIIIlIlIIIIlIIllIlI) {
        this.minX = Math.min(this.minX, lllllllllllllIIIIlIlIIIIlIIllIlI.minX);
        this.minY = Math.min(this.minY, lllllllllllllIIIIlIlIIIIlIIllIlI.minY);
        this.minZ = Math.min(this.minZ, lllllllllllllIIIIlIlIIIIlIIllIlI.minZ);
        this.maxX = Math.max(this.maxX, lllllllllllllIIIIlIlIIIIlIIllIlI.maxX);
        this.maxY = Math.max(this.maxY, lllllllllllllIIIIlIlIIIIlIIllIlI.maxY);
        this.maxZ = Math.max(this.maxZ, lllllllllllllIIIIlIlIIIIlIIllIlI.maxZ);
    }
    
    public StructureBoundingBox(final Vec3i lllllllllllllIIIIlIlIIIIllIIIllI, final Vec3i lllllllllllllIIIIlIlIIIIllIIIlIl) {
        this.minX = Math.min(lllllllllllllIIIIlIlIIIIllIIIllI.getX(), lllllllllllllIIIIlIlIIIIllIIIlIl.getX());
        this.minY = Math.min(lllllllllllllIIIIlIlIIIIllIIIllI.getY(), lllllllllllllIIIIlIlIIIIllIIIlIl.getY());
        this.minZ = Math.min(lllllllllllllIIIIlIlIIIIllIIIllI.getZ(), lllllllllllllIIIIlIlIIIIllIIIlIl.getZ());
        this.maxX = Math.max(lllllllllllllIIIIlIlIIIIllIIIllI.getX(), lllllllllllllIIIIlIlIIIIllIIIlIl.getX());
        this.maxY = Math.max(lllllllllllllIIIIlIlIIIIllIIIllI.getY(), lllllllllllllIIIIlIlIIIIllIIIlIl.getY());
        this.maxZ = Math.max(lllllllllllllIIIIlIlIIIIllIIIllI.getZ(), lllllllllllllIIIIlIlIIIIllIIIlIl.getZ());
    }
    
    public static StructureBoundingBox getNewBoundingBox() {
        return new StructureBoundingBox(StructureBoundingBox.lIlIllllIlIlll[7], StructureBoundingBox.lIlIllllIlIlll[7], StructureBoundingBox.lIlIllllIlIlll[7], Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
    
    public StructureBoundingBox() {
    }
    
    public int getZSize() {
        return this.maxZ - this.minZ + StructureBoundingBox.lIlIllllIlIlll[2];
    }
    
    private static String llllIlIIllIIIII(String lllllllllllllIIIIlIlIIIIIlIlIIlI, final String lllllllllllllIIIIlIlIIIIIlIlIllI) {
        lllllllllllllIIIIlIlIIIIIlIlIIlI = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIlIlIIIIIlIlIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlIlIIIIIlIlIlIl = new StringBuilder();
        final char[] lllllllllllllIIIIlIlIIIIIlIlIlII = lllllllllllllIIIIlIlIIIIIlIlIllI.toCharArray();
        int lllllllllllllIIIIlIlIIIIIlIlIIll = StructureBoundingBox.lIlIllllIlIlll[1];
        final double lllllllllllllIIIIlIlIIIIIlIIllIl = (Object)((String)lllllllllllllIIIIlIlIIIIIlIlIIlI).toCharArray();
        final int lllllllllllllIIIIlIlIIIIIlIIllII = lllllllllllllIIIIlIlIIIIIlIIllIl.length;
        char lllllllllllllIIIIlIlIIIIIlIIlIll = (char)StructureBoundingBox.lIlIllllIlIlll[1];
        while (llllIlIIlllIIIl(lllllllllllllIIIIlIlIIIIIlIIlIll, lllllllllllllIIIIlIlIIIIIlIIllII)) {
            final char lllllllllllllIIIIlIlIIIIIlIllIII = lllllllllllllIIIIlIlIIIIIlIIllIl[lllllllllllllIIIIlIlIIIIIlIIlIll];
            lllllllllllllIIIIlIlIIIIIlIlIlIl.append((char)(lllllllllllllIIIIlIlIIIIIlIllIII ^ lllllllllllllIIIIlIlIIIIIlIlIlII[lllllllllllllIIIIlIlIIIIIlIlIIll % lllllllllllllIIIIlIlIIIIIlIlIlII.length]));
            "".length();
            ++lllllllllllllIIIIlIlIIIIIlIlIIll;
            ++lllllllllllllIIIIlIlIIIIIlIIlIll;
            "".length();
            if (((0x2F ^ 0x28 ^ (0x87 ^ 0xAF)) & (14 + 21 + 3 + 100 ^ 145 + 137 - 239 + 122 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlIlIIIIIlIlIlIl);
    }
    
    private static boolean llllIlIIllIlIll(final int lllllllllllllIIIIlIlIIIIIIlllIlI, final int lllllllllllllIIIIlIlIIIIIIlllIIl) {
        return lllllllllllllIIIIlIlIIIIIIlllIlI == lllllllllllllIIIIlIlIIIIIIlllIIl;
    }
    
    public StructureBoundingBox(final int lllllllllllllIIIIlIlIIIIlIllIllI, final int lllllllllllllIIIIlIlIIIIlIlllIlI, final int lllllllllllllIIIIlIlIIIIlIlllIIl, final int lllllllllllllIIIIlIlIIIIlIlllIII) {
        this.minX = lllllllllllllIIIIlIlIIIIlIllIllI;
        this.minZ = lllllllllllllIIIIlIlIIIIlIlllIlI;
        this.maxX = lllllllllllllIIIIlIlIIIIlIlllIIl;
        this.maxZ = lllllllllllllIIIIlIlIIIIlIlllIII;
        this.minY = StructureBoundingBox.lIlIllllIlIlll[2];
        this.maxY = StructureBoundingBox.lIlIllllIlIlll[8];
    }
    
    public boolean intersectsWith(final StructureBoundingBox lllllllllllllIIIIlIlIIIIlIlIllIl) {
        if (llllIlIIllIllIl(this.maxX, lllllllllllllIIIIlIlIIIIlIlIllIl.minX) && llllIlIIllIllll(this.minX, lllllllllllllIIIIlIlIIIIlIlIllIl.maxX) && llllIlIIllIllIl(this.maxZ, lllllllllllllIIIIlIlIIIIlIlIllIl.minZ) && llllIlIIllIllll(this.minZ, lllllllllllllIIIIlIlIIIIlIlIllIl.maxZ) && llllIlIIllIllIl(this.maxY, lllllllllllllIIIIlIlIIIIlIlIllIl.minY) && llllIlIIllIllll(this.minY, lllllllllllllIIIIlIlIIIIlIlIllIl.maxY)) {
            return StructureBoundingBox.lIlIllllIlIlll[2] != 0;
        }
        return StructureBoundingBox.lIlIllllIlIlll[1] != 0;
    }
    
    static {
        llllIlIIllIlIlI();
        llllIlIIllIIIlI();
    }
    
    private static String llllIlIIllIIIIl(final String lllllllllllllIIIIlIlIIIIIllIIlll, final String lllllllllllllIIIIlIlIIIIIllIIlII) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIlIIIIIllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIlIIIIIllIIlII.getBytes(StandardCharsets.UTF_8)), StructureBoundingBox.lIlIllllIlIlll[9]), "DES");
            final Cipher lllllllllllllIIIIlIlIIIIIllIlIIl = Cipher.getInstance("DES");
            lllllllllllllIIIIlIlIIIIIllIlIIl.init(StructureBoundingBox.lIlIllllIlIlll[3], lllllllllllllIIIIlIlIIIIIllIlIlI);
            return new String(lllllllllllllIIIIlIlIIIIIllIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIlIIIIIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIlIIIIIllIlIII) {
            lllllllllllllIIIIlIlIIIIIllIlIII.printStackTrace();
            return null;
        }
    }
    
    public StructureBoundingBox(final int[] lllllllllllllIIIIlIlIIIlIIIlIllI) {
        if (llllIlIIllIlIll(lllllllllllllIIIIlIlIIIlIIIlIllI.length, StructureBoundingBox.lIlIllllIlIlll[0])) {
            this.minX = lllllllllllllIIIIlIlIIIlIIIlIllI[StructureBoundingBox.lIlIllllIlIlll[1]];
            this.minY = lllllllllllllIIIIlIlIIIlIIIlIllI[StructureBoundingBox.lIlIllllIlIlll[2]];
            this.minZ = lllllllllllllIIIIlIlIIIlIIIlIllI[StructureBoundingBox.lIlIllllIlIlll[3]];
            this.maxX = lllllllllllllIIIIlIlIIIlIIIlIllI[StructureBoundingBox.lIlIllllIlIlll[4]];
            this.maxY = lllllllllllllIIIIlIlIIIlIIIlIllI[StructureBoundingBox.lIlIllllIlIlll[5]];
            this.maxZ = lllllllllllllIIIIlIlIIIlIIIlIllI[StructureBoundingBox.lIlIllllIlIlll[6]];
        }
    }
    
    public int getXSize() {
        return this.maxX - this.minX + StructureBoundingBox.lIlIllllIlIlll[2];
    }
    
    private static boolean llllIlIIlllIIIl(final int lllllllllllllIIIIlIlIIIIIIllIIlI, final int lllllllllllllIIIIlIlIIIIIIllIIIl) {
        return lllllllllllllIIIIlIlIIIIIIllIIlI < lllllllllllllIIIIlIlIIIIIIllIIIl;
    }
    
    public NBTTagIntArray toNBTTagIntArray() {
        final int[] llllllllllllIlIllIIIllIllIlIlIlI = new int[StructureBoundingBox.lIlIllllIlIlll[0]];
        llllllllllllIlIllIIIllIllIlIlIlI[StructureBoundingBox.lIlIllllIlIlll[1]] = this.minX;
        llllllllllllIlIllIIIllIllIlIlIlI[StructureBoundingBox.lIlIllllIlIlll[2]] = this.minY;
        llllllllllllIlIllIIIllIllIlIlIlI[StructureBoundingBox.lIlIllllIlIlll[3]] = this.minZ;
        llllllllllllIlIllIIIllIllIlIlIlI[StructureBoundingBox.lIlIllllIlIlll[4]] = this.maxX;
        llllllllllllIlIllIIIllIllIlIlIlI[StructureBoundingBox.lIlIllllIlIlll[5]] = this.maxY;
        llllllllllllIlIllIIIllIllIlIlIlI[StructureBoundingBox.lIlIllllIlIlll[6]] = this.maxZ;
        return new NBTTagIntArray(llllllllllllIlIllIIIllIllIlIlIlI);
    }
}
