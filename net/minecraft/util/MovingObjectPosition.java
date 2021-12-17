// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.entity.Entity;

public class MovingObjectPosition
{
    private /* synthetic */ BlockPos blockPos;
    public /* synthetic */ MovingObjectType typeOfHit;
    public /* synthetic */ Vec3 hitVec;
    public /* synthetic */ EnumFacing sideHit;
    private static final /* synthetic */ int[] lllIlIlIlIIlIl;
    private static final /* synthetic */ String[] lllIlIlIlIIIII;
    public /* synthetic */ Entity entityHit;
    
    public MovingObjectPosition(final Vec3 llllllllllllIlIllIllIIllIlIllllI, final EnumFacing llllllllllllIlIllIllIIllIlIlllIl, final BlockPos llllllllllllIlIllIllIIllIlIllIII) {
        this(MovingObjectType.BLOCK, llllllllllllIlIllIllIIllIlIllllI, llllllllllllIlIllIllIIllIlIlllIl, llllllllllllIlIllIllIIllIlIllIII);
    }
    
    private static boolean lIlIIIlIllllIlIl(final int llllllllllllIlIllIllIIlIllIlIIIl, final int llllllllllllIlIllIllIIlIllIlIIII) {
        return llllllllllllIlIllIllIIlIllIlIIIl < llllllllllllIlIllIllIIlIllIlIIII;
    }
    
    private static String lIlIIIlIllllIIIl(String llllllllllllIlIllIllIIllIIIlIIll, final String llllllllllllIlIllIllIIllIIIllIIl) {
        llllllllllllIlIllIllIIllIIIlIIll = new String(Base64.getDecoder().decode(llllllllllllIlIllIllIIllIIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIllIIllIIIlIlll = new StringBuilder();
        final char[] llllllllllllIlIllIllIIllIIIlIllI = llllllllllllIlIllIllIIllIIIllIIl.toCharArray();
        int llllllllllllIlIllIllIIllIIIlIlII = MovingObjectPosition.lllIlIlIlIIlIl[0];
        final boolean llllllllllllIlIllIllIIllIIIIlIll = (Object)llllllllllllIlIllIllIIllIIIlIIll.toCharArray();
        final long llllllllllllIlIllIllIIllIIIIlIIl = llllllllllllIlIllIllIIllIIIIlIll.length;
        int llllllllllllIlIllIllIIllIIIIIlll = MovingObjectPosition.lllIlIlIlIIlIl[0];
        while (lIlIIIlIllllIlIl(llllllllllllIlIllIllIIllIIIIIlll, (int)llllllllllllIlIllIllIIllIIIIlIIl)) {
            final char llllllllllllIlIllIllIIllIIIlllII = llllllllllllIlIllIllIIllIIIIlIll[llllllllllllIlIllIllIIllIIIIIlll];
            llllllllllllIlIllIllIIllIIIlIlll.append((char)(llllllllllllIlIllIllIIllIIIlllII ^ llllllllllllIlIllIllIIllIIIlIllI[llllllllllllIlIllIllIIllIIIlIlII % llllllllllllIlIllIllIIllIIIlIllI.length]));
            "".length();
            ++llllllllllllIlIllIllIIllIIIlIlII;
            ++llllllllllllIlIllIllIIllIIIIIlll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIllIIllIIIlIlll);
    }
    
    private static void lIlIIIlIllllIIll() {
        (lllIlIlIlIIIII = new String[MovingObjectPosition.lllIlIlIlIIlIl[6]])[MovingObjectPosition.lllIlIlIlIIlIl[0]] = lIlIIIlIllllIIII("X6L0VDvg1MtQSxMU0gaquA==", "wvcoF");
        MovingObjectPosition.lllIlIlIlIIIII[MovingObjectPosition.lllIlIlIlIIlIl[1]] = lIlIIIlIllllIIII("LHMiSvViqltJgpJCVM+ZCw==", "Vfwrs");
        MovingObjectPosition.lllIlIlIlIIIII[MovingObjectPosition.lllIlIlIlIIlIl[2]] = lIlIIIlIllllIIIl("blYIfA==", "BvnAs");
        MovingObjectPosition.lllIlIlIlIIIII[MovingObjectPosition.lllIlIlIlIIlIl[3]] = lIlIIIlIllllIIII("hOVvj/FKUQY=", "sQEdq");
        MovingObjectPosition.lllIlIlIlIIIII[MovingObjectPosition.lllIlIlIlIIlIl[4]] = lIlIIIlIllllIIlI("Uqg8N7HGmgW7YSNEZIJMVQ==", "yDfWk");
    }
    
    public BlockPos getBlockPos() {
        return this.blockPos;
    }
    
    public MovingObjectPosition(final Vec3 llllllllllllIlIllIllIIllIlIlIIII, final EnumFacing llllllllllllIlIllIllIIllIlIlIIlI) {
        this(MovingObjectType.BLOCK, llllllllllllIlIllIllIIllIlIlIIII, llllllllllllIlIllIllIIllIlIlIIlI, BlockPos.ORIGIN);
    }
    
    private static String lIlIIIlIllllIIlI(final String llllllllllllIlIllIllIIlIllllIlII, final String llllllllllllIlIllIllIIlIllllIllI) {
        try {
            final SecretKeySpec llllllllllllIlIllIllIIlIllllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIllIIlIllllIllI.getBytes(StandardCharsets.UTF_8)), MovingObjectPosition.lllIlIlIlIIlIl[7]), "DES");
            final Cipher llllllllllllIlIllIllIIlIlllllIll = Cipher.getInstance("DES");
            llllllllllllIlIllIllIIlIlllllIll.init(MovingObjectPosition.lllIlIlIlIIlIl[2], llllllllllllIlIllIllIIlIllllllIl);
            return new String(llllllllllllIlIllIllIIlIlllllIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIllIIlIllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIllIIlIlllllIIl) {
            llllllllllllIlIllIllIIlIlllllIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder(MovingObjectPosition.lllIlIlIlIIIII[MovingObjectPosition.lllIlIlIlIIlIl[0]]).append(this.typeOfHit).append(MovingObjectPosition.lllIlIlIlIIIII[MovingObjectPosition.lllIlIlIlIIlIl[1]]).append(this.blockPos).append(MovingObjectPosition.lllIlIlIlIIIII[MovingObjectPosition.lllIlIlIlIIlIl[2]]).append(this.sideHit).append(MovingObjectPosition.lllIlIlIlIIIII[MovingObjectPosition.lllIlIlIlIIlIl[3]]).append(this.hitVec).append(MovingObjectPosition.lllIlIlIlIIIII[MovingObjectPosition.lllIlIlIlIIlIl[4]]).append(this.entityHit).append((char)MovingObjectPosition.lllIlIlIlIIlIl[5]));
    }
    
    public MovingObjectPosition(final MovingObjectType llllllllllllIlIllIllIIllIIllllIl, final Vec3 llllllllllllIlIllIllIIllIIllllII, final EnumFacing llllllllllllIlIllIllIIllIIlllIll, final BlockPos llllllllllllIlIllIllIIllIIlllIlI) {
        this.typeOfHit = llllllllllllIlIllIllIIllIIllllIl;
        this.blockPos = llllllllllllIlIllIllIIllIIlllIlI;
        this.sideHit = llllllllllllIlIllIllIIllIIlllIll;
        this.hitVec = new Vec3(llllllllllllIlIllIllIIllIIllllII.xCoord, llllllllllllIlIllIllIIllIIllllII.yCoord, llllllllllllIlIllIllIIllIIllllII.zCoord);
    }
    
    private static void lIlIIIlIllllIlII() {
        (lllIlIlIlIIlIl = new int[8])[0] = ((0x3 ^ 0x1A) & ~(0x1C ^ 0x5));
        MovingObjectPosition.lllIlIlIlIIlIl[1] = " ".length();
        MovingObjectPosition.lllIlIlIlIIlIl[2] = "  ".length();
        MovingObjectPosition.lllIlIlIlIIlIl[3] = "   ".length();
        MovingObjectPosition.lllIlIlIlIIlIl[4] = (0x9A ^ 0xAB ^ (0x8D ^ 0xB8));
        MovingObjectPosition.lllIlIlIlIIlIl[5] = (0x61 ^ 0x1C);
        MovingObjectPosition.lllIlIlIlIIlIl[6] = (0xF5 ^ 0xB3 ^ (0xE3 ^ 0xA0));
        MovingObjectPosition.lllIlIlIlIIlIl[7] = (0x82 ^ 0x8A);
    }
    
    static {
        lIlIIIlIllllIlII();
        lIlIIIlIllllIIll();
    }
    
    public MovingObjectPosition(final Entity llllllllllllIlIllIllIIllIIllIIlI, final Vec3 llllllllllllIlIllIllIIllIIllIlII) {
        this.typeOfHit = MovingObjectType.ENTITY;
        this.entityHit = llllllllllllIlIllIllIIllIIllIIlI;
        this.hitVec = llllllllllllIlIllIllIIllIIllIlII;
    }
    
    public MovingObjectPosition(final Entity llllllllllllIlIllIllIIllIlIIlIll) {
        this(llllllllllllIlIllIllIIllIlIIlIll, new Vec3(llllllllllllIlIllIllIIllIlIIlIll.posX, llllllllllllIlIllIllIIllIlIIlIll.posY, llllllllllllIlIllIllIIllIlIIlIll.posZ));
    }
    
    private static String lIlIIIlIllllIIII(final String llllllllllllIlIllIllIIlIlllIIIII, final String llllllllllllIlIllIllIIlIllIllllI) {
        try {
            final SecretKeySpec llllllllllllIlIllIllIIlIlllIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIllIIlIllIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIllIIlIlllIIllI = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIllIIlIlllIIllI.init(MovingObjectPosition.lllIlIlIlIIlIl[2], llllllllllllIlIllIllIIlIlllIIlll);
            return new String(llllllllllllIlIllIllIIlIlllIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIllIIlIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIllIIlIlllIIlIl) {
            llllllllllllIlIllIllIIlIlllIIlIl.printStackTrace();
            return null;
        }
    }
    
    public enum MovingObjectType
    {
        BLOCK(MovingObjectType.lIIlllIlIlIlIl[MovingObjectType.lIIlllIlIlIllI[1]], MovingObjectType.lIIlllIlIlIllI[1]), 
        MISS(MovingObjectType.lIIlllIlIlIlIl[MovingObjectType.lIIlllIlIlIllI[0]], MovingObjectType.lIIlllIlIlIllI[0]), 
        ENTITY(MovingObjectType.lIIlllIlIlIlIl[MovingObjectType.lIIlllIlIlIllI[2]], MovingObjectType.lIIlllIlIlIllI[2]);
        
        private static final /* synthetic */ String[] lIIlllIlIlIlIl;
        private static final /* synthetic */ int[] lIIlllIlIlIllI;
        
        private static void llIllIlllllllll() {
            (lIIlllIlIlIllI = new int[5])[0] = ((0x55 ^ 0x62) & ~(0x72 ^ 0x45));
            MovingObjectType.lIIlllIlIlIllI[1] = " ".length();
            MovingObjectType.lIIlllIlIlIllI[2] = "  ".length();
            MovingObjectType.lIIlllIlIlIllI[3] = "   ".length();
            MovingObjectType.lIIlllIlIlIllI[4] = (67 + 150 - 74 + 22 ^ 45 + 98 - 34 + 64);
        }
        
        private static void llIllIllllllllI() {
            (lIIlllIlIlIlIl = new String[MovingObjectType.lIIlllIlIlIllI[3]])[MovingObjectType.lIIlllIlIlIllI[0]] = llIllIllllllIll("FwwjHQ==", "ZEpNQ");
            MovingObjectType.lIIlllIlIlIlIl[MovingObjectType.lIIlllIlIlIllI[1]] = llIllIlllllllII("KOeHhdA206w=", "cyftX");
            MovingObjectType.lIIlllIlIlIlIl[MovingObjectType.lIIlllIlIlIllI[2]] = llIllIlllllllIl("h2nOdKd0N7Y=", "OFIBp");
        }
        
        static {
            llIllIlllllllll();
            llIllIllllllllI();
            final MovingObjectType[] enum$VALUES = new MovingObjectType[MovingObjectType.lIIlllIlIlIllI[3]];
            enum$VALUES[MovingObjectType.lIIlllIlIlIllI[0]] = MovingObjectType.MISS;
            enum$VALUES[MovingObjectType.lIIlllIlIlIllI[1]] = MovingObjectType.BLOCK;
            enum$VALUES[MovingObjectType.lIIlllIlIlIllI[2]] = MovingObjectType.ENTITY;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static boolean llIlllIIIIIIIII(final int lllllllllllllIIlIIlllIlIIlIIlllI, final int lllllllllllllIIlIIlllIlIIlIIllIl) {
            return lllllllllllllIIlIIlllIlIIlIIlllI < lllllllllllllIIlIIlllIlIIlIIllIl;
        }
        
        private static String llIllIlllllllII(final String lllllllllllllIIlIIlllIlIIllIIIIl, final String lllllllllllllIIlIIlllIlIIllIIIlI) {
            try {
                final SecretKeySpec lllllllllllllIIlIIlllIlIIllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlllIlIIllIIIlI.getBytes(StandardCharsets.UTF_8)), MovingObjectType.lIIlllIlIlIllI[4]), "DES");
                final Cipher lllllllllllllIIlIIlllIlIIllIIlIl = Cipher.getInstance("DES");
                lllllllllllllIIlIIlllIlIIllIIlIl.init(MovingObjectType.lIIlllIlIlIllI[2], lllllllllllllIIlIIlllIlIIllIIllI);
                return new String(lllllllllllllIIlIIlllIlIIllIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlllIlIIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIIlllIlIIllIIlII) {
                lllllllllllllIIlIIlllIlIIllIIlII.printStackTrace();
                return null;
            }
        }
        
        private static String llIllIllllllIll(String lllllllllllllIIlIIlllIlIIlllIIll, final String lllllllllllllIIlIIlllIlIIlllIIlI) {
            lllllllllllllIIlIIlllIlIIlllIIll = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIlllIlIIlllIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIlIIlllIlIIlllIllI = new StringBuilder();
            final char[] lllllllllllllIIlIIlllIlIIlllIlIl = lllllllllllllIIlIIlllIlIIlllIIlI.toCharArray();
            int lllllllllllllIIlIIlllIlIIlllIlII = MovingObjectType.lIIlllIlIlIllI[0];
            final boolean lllllllllllllIIlIIlllIlIIllIlllI = (Object)((String)lllllllllllllIIlIIlllIlIIlllIIll).toCharArray();
            final Exception lllllllllllllIIlIIlllIlIIllIllIl = (Exception)lllllllllllllIIlIIlllIlIIllIlllI.length;
            int lllllllllllllIIlIIlllIlIIllIllII = MovingObjectType.lIIlllIlIlIllI[0];
            while (llIlllIIIIIIIII(lllllllllllllIIlIIlllIlIIllIllII, (int)lllllllllllllIIlIIlllIlIIllIllIl)) {
                final char lllllllllllllIIlIIlllIlIIllllIIl = lllllllllllllIIlIIlllIlIIllIlllI[lllllllllllllIIlIIlllIlIIllIllII];
                lllllllllllllIIlIIlllIlIIlllIllI.append((char)(lllllllllllllIIlIIlllIlIIllllIIl ^ lllllllllllllIIlIIlllIlIIlllIlIl[lllllllllllllIIlIIlllIlIIlllIlII % lllllllllllllIIlIIlllIlIIlllIlIl.length]));
                "".length();
                ++lllllllllllllIIlIIlllIlIIlllIlII;
                ++lllllllllllllIIlIIlllIlIIllIllII;
                "".length();
                if ("  ".length() <= 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIlIIlllIlIIlllIllI);
        }
        
        private MovingObjectType(final String lllllllllllllIIlIIlllIlIlIIIllII, final int lllllllllllllIIlIIlllIlIlIIIlIll) {
        }
        
        private static String llIllIlllllllIl(final String lllllllllllllIIlIIlllIlIIlIlIlII, final String lllllllllllllIIlIIlllIlIIlIlIlIl) {
            try {
                final SecretKeySpec lllllllllllllIIlIIlllIlIIlIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlllIlIIlIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlIIlllIlIIlIllIII = Cipher.getInstance("Blowfish");
                lllllllllllllIIlIIlllIlIIlIllIII.init(MovingObjectType.lIIlllIlIlIllI[2], lllllllllllllIIlIIlllIlIIlIllIIl);
                return new String(lllllllllllllIIlIIlllIlIIlIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlllIlIIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIIlllIlIIlIlIlll) {
                lllllllllllllIIlIIlllIlIIlIlIlll.printStackTrace();
                return null;
            }
        }
    }
}
