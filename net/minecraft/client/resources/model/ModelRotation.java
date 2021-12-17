// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources.model;

import net.minecraft.util.EnumFacing;
import com.google.common.collect.Maps;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.util.MathHelper;
import org.lwjgl.util.vector.Vector3f;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.lwjgl.util.vector.Matrix4f;
import java.util.Map;

public enum ModelRotation
{
    X90_Y270(ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[10]], ModelRotation.lllIIIlIlIlIll[10], ModelRotation.lllIIIlIlIlIll[2], ModelRotation.lllIIIlIlIlIll[6]);
    
    private static final /* synthetic */ int[] lllIIIlIlIlIll;
    
    X270_Y270(ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[18]], ModelRotation.lllIIIlIlIlIll[18], ModelRotation.lllIIIlIlIlIll[6], ModelRotation.lllIIIlIlIlIll[6]), 
    X0_Y270(ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[5]], ModelRotation.lllIIIlIlIlIll[5], ModelRotation.lllIIIlIlIlIll[0], ModelRotation.lllIIIlIlIlIll[6]), 
    X180_Y270(ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[14]], ModelRotation.lllIIIlIlIlIll[14], ModelRotation.lllIIIlIlIlIll[4], ModelRotation.lllIIIlIlIlIll[6]);
    
    private static final /* synthetic */ Map<Integer, ModelRotation> mapRotations;
    
    X0_Y0(ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[0]], ModelRotation.lllIIIlIlIlIll[0], ModelRotation.lllIIIlIlIlIll[0], ModelRotation.lllIIIlIlIlIll[0]), 
    X90_Y180(ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[9]], ModelRotation.lllIIIlIlIlIll[9], ModelRotation.lllIIIlIlIlIll[2], ModelRotation.lllIIIlIlIlIll[4]);
    
    private final /* synthetic */ Matrix4f matrix4d;
    
    X180_Y0(ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[11]], ModelRotation.lllIIIlIlIlIll[11], ModelRotation.lllIIIlIlIlIll[4], ModelRotation.lllIIIlIlIlIll[0]), 
    X270_Y180(ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[17]], ModelRotation.lllIIIlIlIlIll[17], ModelRotation.lllIIIlIlIlIll[6], ModelRotation.lllIIIlIlIlIll[4]), 
    X180_Y90(ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[12]], ModelRotation.lllIIIlIlIlIll[12], ModelRotation.lllIIIlIlIlIll[4], ModelRotation.lllIIIlIlIlIll[2]), 
    X180_Y180(ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[13]], ModelRotation.lllIIIlIlIlIll[13], ModelRotation.lllIIIlIlIlIll[4], ModelRotation.lllIIIlIlIlIll[4]), 
    X270_Y0(ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[15]], ModelRotation.lllIIIlIlIlIll[15], ModelRotation.lllIIIlIlIlIll[6], ModelRotation.lllIIIlIlIlIll[0]), 
    X90_Y0(ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[7]], ModelRotation.lllIIIlIlIlIll[7], ModelRotation.lllIIIlIlIlIll[2], ModelRotation.lllIIIlIlIlIll[0]), 
    X270_Y90(ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[16]], ModelRotation.lllIIIlIlIlIll[16], ModelRotation.lllIIIlIlIlIll[6], ModelRotation.lllIIIlIlIlIll[2]);
    
    private final /* synthetic */ int combinedXY;
    private final /* synthetic */ int quartersX;
    
    X0_Y180(ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[3]], ModelRotation.lllIIIlIlIlIll[3], ModelRotation.lllIIIlIlIlIll[0], ModelRotation.lllIIIlIlIlIll[4]);
    
    private final /* synthetic */ int quartersY;
    
    X0_Y90(ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[1]], ModelRotation.lllIIIlIlIlIll[1], ModelRotation.lllIIIlIlIlIll[0], ModelRotation.lllIIIlIlIlIll[2]), 
    X90_Y90(ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[8]], ModelRotation.lllIIIlIlIlIll[8], ModelRotation.lllIIIlIlIlIll[2], ModelRotation.lllIIIlIlIlIll[2]);
    
    private static final /* synthetic */ String[] lllIIIlIlIlIlI;
    
    private static int combineXY(final int llllllllllllIllIIIIIIlllIlIIllII, final int llllllllllllIllIIIIIIlllIlIIlIll) {
        return llllllllllllIllIIIIIIlllIlIIllII * ModelRotation.lllIIIlIlIlIll[20] + llllllllllllIllIIIIIIlllIlIIlIll;
    }
    
    private static boolean lIIlllIlIllllllI(final Object llllllllllllIllIIIIIIllIllIIlIIl, final Object llllllllllllIllIIIIIIllIllIIlIII) {
        return llllllllllllIllIIIIIIllIllIIlIIl != llllllllllllIllIIIIIIllIllIIlIII;
    }
    
    private static String lIIlllIlIllllIII(String llllllllllllIllIIIIIIllIllllIllI, final String llllllllllllIllIIIIIIllIllllIlIl) {
        llllllllllllIllIIIIIIllIllllIllI = new String(Base64.getDecoder().decode(llllllllllllIllIIIIIIllIllllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIIIllIlllllIIl = new StringBuilder();
        final char[] llllllllllllIllIIIIIIllIlllllIII = llllllllllllIllIIIIIIllIllllIlIl.toCharArray();
        int llllllllllllIllIIIIIIllIllllIlll = ModelRotation.lllIIIlIlIlIll[0];
        final boolean llllllllllllIllIIIIIIllIllllIIIl = (Object)llllllllllllIllIIIIIIllIllllIllI.toCharArray();
        final int llllllllllllIllIIIIIIllIllllIIII = llllllllllllIllIIIIIIllIllllIIIl.length;
        String llllllllllllIllIIIIIIllIlllIllll = (String)ModelRotation.lllIIIlIlIlIll[0];
        while (lIIlllIllIIIIIII((int)llllllllllllIllIIIIIIllIlllIllll, llllllllllllIllIIIIIIllIllllIIII)) {
            final char llllllllllllIllIIIIIIllIllllllII = llllllllllllIllIIIIIIllIllllIIIl[llllllllllllIllIIIIIIllIlllIllll];
            llllllllllllIllIIIIIIllIlllllIIl.append((char)(llllllllllllIllIIIIIIllIllllllII ^ llllllllllllIllIIIIIIllIlllllIII[llllllllllllIllIIIIIIllIllllIlll % llllllllllllIllIIIIIIllIlllllIII.length]));
            "".length();
            ++llllllllllllIllIIIIIIllIllllIlll;
            ++llllllllllllIllIIIIIIllIlllIllll;
            "".length();
            if (" ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIIIllIlllllIIl);
    }
    
    private static void lIIlllIlIlllllII() {
        (lllIIIlIlIlIll = new int[21])[0] = ((0x48 ^ 0x28 ^ (0x3A ^ 0xF)) & (45 + 123 - 36 + 15 ^ 106 + 163 - 219 + 148 ^ -" ".length()));
        ModelRotation.lllIIIlIlIlIll[1] = " ".length();
        ModelRotation.lllIIIlIlIlIll[2] = (10 + 118 - 101 + 192 ^ 103 + 71 - 130 + 85);
        ModelRotation.lllIIIlIlIlIll[3] = "  ".length();
        ModelRotation.lllIIIlIlIlIll[4] = 39 + 18 + 59 + 64;
        ModelRotation.lllIIIlIlIlIll[5] = "   ".length();
        ModelRotation.lllIIIlIlIlIll[6] = (-(0xFFFFF7D3 & 0x2E7E) & (0xFFFFF7DF & 0x2F7F));
        ModelRotation.lllIIIlIlIlIll[7] = (0xA5 ^ 0xA1);
        ModelRotation.lllIIIlIlIlIll[8] = (0x7F ^ 0x45 ^ (0x7B ^ 0x44));
        ModelRotation.lllIIIlIlIlIll[9] = (0x95 ^ 0xA1 ^ (0x63 ^ 0x51));
        ModelRotation.lllIIIlIlIlIll[10] = (0x4A ^ 0x30 ^ (0xEB ^ 0x96));
        ModelRotation.lllIIIlIlIlIll[11] = (0x5D ^ 0x48 ^ (0x5F ^ 0x42));
        ModelRotation.lllIIIlIlIlIll[12] = (112 + 99 - 79 + 13 ^ 38 + 141 - 116 + 89);
        ModelRotation.lllIIIlIlIlIll[13] = (0x6B ^ 0x40 ^ (0xA8 ^ 0x89));
        ModelRotation.lllIIIlIlIlIll[14] = (0xB0 ^ 0xBB);
        ModelRotation.lllIIIlIlIlIll[15] = (46 + 99 - 107 + 106 ^ 84 + 48 - 19 + 43);
        ModelRotation.lllIIIlIlIlIll[16] = (0x9B ^ 0x94 ^ "  ".length());
        ModelRotation.lllIIIlIlIlIll[17] = (0x1D ^ 0x13);
        ModelRotation.lllIIIlIlIlIll[18] = (77 + 82 - 28 + 11 ^ 71 + 76 - 28 + 10);
        ModelRotation.lllIIIlIlIlIll[19] = (0x37 ^ 0x27);
        ModelRotation.lllIIIlIlIlIll[20] = (-(0xFFFFFE8D & 0x35F7) & (0xFFFFBDFC & 0x77EF));
    }
    
    private ModelRotation(final String llllllllllllIllIIIIIIlllIIlllIll, final int llllllllllllIllIIIIIIlllIIlllIlI, final int llllllllllllIllIIIIIIlllIIlllIIl, final int llllllllllllIllIIIIIIlllIIllllll) {
        this.combinedXY = combineXY(llllllllllllIllIIIIIIlllIIlllIIl, llllllllllllIllIIIIIIlllIIllllll);
        this.matrix4d = new Matrix4f();
        final Matrix4f llllllllllllIllIIIIIIlllIIlllllI = new Matrix4f();
        llllllllllllIllIIIIIIlllIIlllllI.setIdentity();
        "".length();
        Matrix4f.rotate(-llllllllllllIllIIIIIIlllIIlllIIl * 0.017453292f, new Vector3f(1.0f, 0.0f, 0.0f), llllllllllllIllIIIIIIlllIIlllllI, llllllllllllIllIIIIIIlllIIlllllI);
        "".length();
        this.quartersX = MathHelper.abs_int(llllllllllllIllIIIIIIlllIIlllIIl / ModelRotation.lllIIIlIlIlIll[2]);
        final Matrix4f llllllllllllIllIIIIIIlllIIllllIl = new Matrix4f();
        llllllllllllIllIIIIIIlllIIllllIl.setIdentity();
        "".length();
        Matrix4f.rotate(-llllllllllllIllIIIIIIlllIIllllll * 0.017453292f, new Vector3f(0.0f, 1.0f, 0.0f), llllllllllllIllIIIIIIlllIIllllIl, llllllllllllIllIIIIIIlllIIllllIl);
        "".length();
        this.quartersY = MathHelper.abs_int(llllllllllllIllIIIIIIlllIIllllll / ModelRotation.lllIIIlIlIlIll[2]);
        Matrix4f.mul(llllllllllllIllIIIIIIlllIIllllIl, llllllllllllIllIIIIIIlllIIlllllI, this.matrix4d);
        "".length();
    }
    
    private static String lIIlllIlIllllIIl(final String llllllllllllIllIIIIIIllIllIllIIl, final String llllllllllllIllIIIIIIllIllIllIII) {
        try {
            final SecretKeySpec llllllllllllIllIIIIIIllIllIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIIllIllIllIII.getBytes(StandardCharsets.UTF_8)), ModelRotation.lllIIIlIlIlIll[11]), "DES");
            final Cipher llllllllllllIllIIIIIIllIllIllIll = Cipher.getInstance("DES");
            llllllllllllIllIIIIIIllIllIllIll.init(ModelRotation.lllIIIlIlIlIll[3], llllllllllllIllIIIIIIllIllIlllII);
            return new String(llllllllllllIllIIIIIIllIllIllIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIIllIllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIIIllIllIllIlI) {
            llllllllllllIllIIIIIIllIllIllIlI.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlllIlIllllIlI(final String llllllllllllIllIIIIIIllIlllIIllI, final String llllllllllllIllIIIIIIllIlllIIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIIIIllIlllIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIIllIlllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIIIIllIlllIlIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIIIIllIlllIlIII.init(ModelRotation.lllIIIlIlIlIll[3], llllllllllllIllIIIIIIllIlllIlIIl);
            return new String(llllllllllllIllIIIIIIllIlllIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIIllIlllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIIIllIlllIIlll) {
            llllllllllllIllIIIIIIllIlllIIlll.printStackTrace();
            return null;
        }
    }
    
    public Matrix4f getMatrix4d() {
        return this.matrix4d;
    }
    
    private static void lIIlllIlIllllIll() {
        (lllIIIlIlIlIlI = new String[ModelRotation.lllIIIlIlIlIll[19]])[ModelRotation.lllIIIlIlIlIll[0]] = lIIlllIlIllllIII("HlE2I0c=", "Faizw");
        ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[1]] = lIIlllIlIllllIIl("Ru170Pc3jB4=", "YbZnF");
        ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[3]] = lIIlllIlIllllIIl("dZWvI8zAZwo=", "XRnuj");
        ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[5]] = lIIlllIlIllllIII("NVUbEndaVQ==", "meDKE");
        ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[7]] = lIIlllIlIllllIlI("eaTy3o4zpH0=", "sAKDC");
        ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[8]] = lIIlllIlIllllIII("KGlWLxdJYA==", "pPfpN");
        ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[9]] = lIIlllIlIllllIII("IFpAJhJJW0A=", "xcpyK");
        ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[10]] = lIIlllIlIllllIII("O2p2DRpRZHY=", "cSFRC");
        ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[11]] = lIIlllIlIllllIIl("De5SXUe+viY=", "JnVWh");
        ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[12]] = lIIlllIlIllllIIl("yFpHxfRGuQYEpPKZIDJlMg==", "SHvcl");
        ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[13]] = lIIlllIlIllllIII("AUZxRx0ARnFH", "YwIwB");
        ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[14]] = lIIlllIlIllllIII("DVNXeSgMUFh5", "UboIw");
        ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[15]] = lIIlllIlIllllIlI("eBg9WznaGKQ=", "CVqsj");
        ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[16]] = lIIlllIlIllllIII("O1tzZy06UHQ=", "ciDWr");
        ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[17]] = lIIlllIlIllllIII("MHZSehgxdV16", "hDeJG");
        ModelRotation.lllIIIlIlIlIlI[ModelRotation.lllIIIlIlIlIll[18]] = lIIlllIlIllllIlI("Y3Rmu+rAEGNeWnps8sDxDw==", "JhAaF");
    }
    
    private static boolean lIIlllIllIIIIIII(final int llllllllllllIllIIIIIIllIllIIllIl, final int llllllllllllIllIIIIIIllIllIIllII) {
        return llllllllllllIllIIIIIIllIllIIllIl < llllllllllllIllIIIIIIllIllIIllII;
    }
    
    static {
        lIIlllIlIlllllII();
        lIIlllIlIllllIll();
        final ModelRotation[] enum$VALUES = new ModelRotation[ModelRotation.lllIIIlIlIlIll[19]];
        enum$VALUES[ModelRotation.lllIIIlIlIlIll[0]] = ModelRotation.X0_Y0;
        enum$VALUES[ModelRotation.lllIIIlIlIlIll[1]] = ModelRotation.X0_Y90;
        enum$VALUES[ModelRotation.lllIIIlIlIlIll[3]] = ModelRotation.X0_Y180;
        enum$VALUES[ModelRotation.lllIIIlIlIlIll[5]] = ModelRotation.X0_Y270;
        enum$VALUES[ModelRotation.lllIIIlIlIlIll[7]] = ModelRotation.X90_Y0;
        enum$VALUES[ModelRotation.lllIIIlIlIlIll[8]] = ModelRotation.X90_Y90;
        enum$VALUES[ModelRotation.lllIIIlIlIlIll[9]] = ModelRotation.X90_Y180;
        enum$VALUES[ModelRotation.lllIIIlIlIlIll[10]] = ModelRotation.X90_Y270;
        enum$VALUES[ModelRotation.lllIIIlIlIlIll[11]] = ModelRotation.X180_Y0;
        enum$VALUES[ModelRotation.lllIIIlIlIlIll[12]] = ModelRotation.X180_Y90;
        enum$VALUES[ModelRotation.lllIIIlIlIlIll[13]] = ModelRotation.X180_Y180;
        enum$VALUES[ModelRotation.lllIIIlIlIlIll[14]] = ModelRotation.X180_Y270;
        enum$VALUES[ModelRotation.lllIIIlIlIlIll[15]] = ModelRotation.X270_Y0;
        enum$VALUES[ModelRotation.lllIIIlIlIlIll[16]] = ModelRotation.X270_Y90;
        enum$VALUES[ModelRotation.lllIIIlIlIlIll[17]] = ModelRotation.X270_Y180;
        enum$VALUES[ModelRotation.lllIIIlIlIlIll[18]] = ModelRotation.X270_Y270;
        ENUM$VALUES = enum$VALUES;
        mapRotations = Maps.newHashMap();
        final byte llllllllllllIllIIIIIIlllIlIIllll;
        final String llllllllllllIllIIIIIIlllIlIlIIII = (String)((ModelRotation[])(Object)(llllllllllllIllIIIIIIlllIlIIllll = (byte)(Object)values())).length;
        double llllllllllllIllIIIIIIlllIlIlIIIl = ModelRotation.lllIIIlIlIlIll[0];
        "".length();
        if ("   ".length() == -" ".length()) {
            return;
        }
        while (!lIIlllIlIlllllIl((int)llllllllllllIllIIIIIIlllIlIlIIIl, (int)llllllllllllIllIIIIIIlllIlIlIIII)) {
            final ModelRotation llllllllllllIllIIIIIIlllIlIlIIll = llllllllllllIllIIIIIIlllIlIIllll[llllllllllllIllIIIIIIlllIlIlIIIl];
            ModelRotation.mapRotations.put(llllllllllllIllIIIIIIlllIlIlIIll.combinedXY, llllllllllllIllIIIIIIlllIlIlIIll);
            "".length();
            ++llllllllllllIllIIIIIIlllIlIlIIIl;
        }
    }
    
    public EnumFacing rotateFace(final EnumFacing llllllllllllIllIIIIIIlllIIlIlIII) {
        EnumFacing llllllllllllIllIIIIIIlllIIlIllII = llllllllllllIllIIIIIIlllIIlIlIII;
        int llllllllllllIllIIIIIIlllIIlIlIll = ModelRotation.lllIIIlIlIlIll[0];
        "".length();
        if ((0xDC ^ 0xB4 ^ (0x19 ^ 0x75)) < 0) {
            return null;
        }
        while (!lIIlllIlIlllllIl(llllllllllllIllIIIIIIlllIIlIlIll, this.quartersX)) {
            llllllllllllIllIIIIIIlllIIlIllII = llllllllllllIllIIIIIIlllIIlIllII.rotateAround(EnumFacing.Axis.X);
            ++llllllllllllIllIIIIIIlllIIlIlIll;
        }
        if (lIIlllIlIllllllI(llllllllllllIllIIIIIIlllIIlIllII.getAxis(), EnumFacing.Axis.Y)) {
            int llllllllllllIllIIIIIIlllIIlIlIlI = ModelRotation.lllIIIlIlIlIll[0];
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
            while (!lIIlllIlIlllllIl(llllllllllllIllIIIIIIlllIIlIlIlI, this.quartersY)) {
                llllllllllllIllIIIIIIlllIIlIllII = llllllllllllIllIIIIIIlllIIlIllII.rotateAround(EnumFacing.Axis.Y);
                ++llllllllllllIllIIIIIIlllIIlIlIlI;
            }
        }
        return llllllllllllIllIIIIIIlllIIlIllII;
    }
    
    public static ModelRotation getModelRotation(final int llllllllllllIllIIIIIIlllIIIIllll, final int llllllllllllIllIIIIIIlllIIIlIIII) {
        return ModelRotation.mapRotations.get(combineXY(MathHelper.normalizeAngle(llllllllllllIllIIIIIIlllIIIIllll, ModelRotation.lllIIIlIlIlIll[20]), MathHelper.normalizeAngle(llllllllllllIllIIIIIIlllIIIlIIII, ModelRotation.lllIIIlIlIlIll[20])));
    }
    
    public int rotateVertex(final EnumFacing llllllllllllIllIIIIIIlllIIIllIII, final int llllllllllllIllIIIIIIlllIIIlllIl) {
        int llllllllllllIllIIIIIIlllIIIlllII = llllllllllllIllIIIIIIlllIIIlllIl;
        if (lIIlllIlIlllllll(llllllllllllIllIIIIIIlllIIIllIII.getAxis(), EnumFacing.Axis.X)) {
            llllllllllllIllIIIIIIlllIIIlllII = (llllllllllllIllIIIIIIlllIIIlllIl + this.quartersX) % ModelRotation.lllIIIlIlIlIll[7];
        }
        EnumFacing llllllllllllIllIIIIIIlllIIIllIll = llllllllllllIllIIIIIIlllIIIllIII;
        int llllllllllllIllIIIIIIlllIIIllIlI = ModelRotation.lllIIIlIlIlIll[0];
        "".length();
        if ("  ".length() != "  ".length()) {
            return (0x3D ^ 0x3B) & ~(0x3 ^ 0x5);
        }
        while (!lIIlllIlIlllllIl(llllllllllllIllIIIIIIlllIIIllIlI, this.quartersX)) {
            llllllllllllIllIIIIIIlllIIIllIll = llllllllllllIllIIIIIIlllIIIllIll.rotateAround(EnumFacing.Axis.X);
            ++llllllllllllIllIIIIIIlllIIIllIlI;
        }
        if (lIIlllIlIlllllll(llllllllllllIllIIIIIIlllIIIllIll.getAxis(), EnumFacing.Axis.Y)) {
            llllllllllllIllIIIIIIlllIIIlllII = (llllllllllllIllIIIIIIlllIIIlllII + this.quartersY) % ModelRotation.lllIIIlIlIlIll[7];
        }
        return llllllllllllIllIIIIIIlllIIIlllII;
    }
    
    private static boolean lIIlllIlIlllllIl(final int llllllllllllIllIIIIIIllIllIlIIIl, final int llllllllllllIllIIIIIIllIllIlIIII) {
        return llllllllllllIllIIIIIIllIllIlIIIl >= llllllllllllIllIIIIIIllIllIlIIII;
    }
    
    private static boolean lIIlllIlIlllllll(final Object llllllllllllIllIIIIIIllIllIIIlIl, final Object llllllllllllIllIIIIIIllIllIIIlII) {
        return llllllllllllIllIIIIIIllIllIIIlIl == llllllllllllIllIIIIIIllIllIIIlII;
    }
}
