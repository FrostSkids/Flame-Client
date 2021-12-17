// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world;

import net.minecraft.util.BlockPos;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class ChunkCoordIntPair
{
    public final /* synthetic */ int chunkXPos;
    private static final /* synthetic */ int[] lIlllIllIlIlII;
    public final /* synthetic */ int chunkZPos;
    private static final /* synthetic */ String[] lIlllIllIlIIll;
    
    public int getZEnd() {
        return (this.chunkZPos << ChunkCoordIntPair.lIlllIllIlIlII[6]) + ChunkCoordIntPair.lIlllIllIlIlII[8];
    }
    
    public int getXStart() {
        return this.chunkXPos << ChunkCoordIntPair.lIlllIllIlIlII[6];
    }
    
    private static String lIIIIIllIlIIIlIl(final String llllllllllllIllllIlllIIIIIlIllll, final String llllllllllllIllllIlllIIIIIlIllII) {
        try {
            final SecretKeySpec llllllllllllIllllIlllIIIIIllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlllIIIIIlIllII.getBytes(StandardCharsets.UTF_8)), ChunkCoordIntPair.lIlllIllIlIlII[7]), "DES");
            final Cipher llllllllllllIllllIlllIIIIIllIIIl = Cipher.getInstance("DES");
            llllllllllllIllllIlllIIIIIllIIIl.init(ChunkCoordIntPair.lIlllIllIlIlII[9], llllllllllllIllllIlllIIIIIllIIlI);
            return new String(llllllllllllIllllIlllIIIIIllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlllIIIIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlllIIIIIllIIII) {
            llllllllllllIllllIlllIIIIIllIIII.printStackTrace();
            return null;
        }
    }
    
    public int getZStart() {
        return this.chunkZPos << ChunkCoordIntPair.lIlllIllIlIlII[6];
    }
    
    @Override
    public boolean equals(final Object llllllllllllIllllIlllIIIlIIlIIIl) {
        if (lIIIIIllIlIIlIII(this, llllllllllllIllllIlllIIIlIIlIIIl)) {
            return ChunkCoordIntPair.lIlllIllIlIlII[4] != 0;
        }
        if (lIIIIIllIlIIlIIl((llllllllllllIllllIlllIIIlIIlIIIl instanceof ChunkCoordIntPair) ? 1 : 0)) {
            return ChunkCoordIntPair.lIlllIllIlIlII[5] != 0;
        }
        final ChunkCoordIntPair llllllllllllIllllIlllIIIlIIlIIll = (ChunkCoordIntPair)llllllllllllIllllIlllIIIlIIlIIIl;
        if (lIIIIIllIlIIlIlI(this.chunkXPos, llllllllllllIllllIlllIIIlIIlIIll.chunkXPos) && lIIIIIllIlIIlIlI(this.chunkZPos, llllllllllllIllllIlllIIIlIIlIIll.chunkZPos)) {
            return ChunkCoordIntPair.lIlllIllIlIlII[4] != 0;
        }
        return ChunkCoordIntPair.lIlllIllIlIlII[5] != 0;
    }
    
    private static void lIIIIIllIlIIIlll() {
        (lIlllIllIlIlII = new int[11])[0] = (0xD1 ^ 0xBF ^ (0xC4 ^ 0x8A));
        ChunkCoordIntPair.lIlllIllIlIlII[1] = (-(0xFFFFBC39 & 0x5BE7) & (0xFFFFFFED & 0x197E3F));
        ChunkCoordIntPair.lIlllIllIlIlII[2] = (-(0xFFFFE483 & 0x1F7D) & (0xFFFFF7DF & 0x3C6EFF7F));
        ChunkCoordIntPair.lIlllIllIlIlII[3] = -(0xFFFFCFFB & 0x21527115);
        ChunkCoordIntPair.lIlllIllIlIlII[4] = " ".length();
        ChunkCoordIntPair.lIlllIllIlIlII[5] = ((0xC9 ^ 0xAA ^ (0x14 ^ 0x3A)) & (0x6A ^ 0x48 ^ (0xEE ^ 0x81) ^ -" ".length()));
        ChunkCoordIntPair.lIlllIllIlIlII[6] = (0x71 ^ 0x75);
        ChunkCoordIntPair.lIlllIllIlIlII[7] = (0x5A ^ 0xC ^ (0x74 ^ 0x2A));
        ChunkCoordIntPair.lIlllIllIlIlII[8] = (0x37 ^ 0x2E ^ (0x6E ^ 0x78));
        ChunkCoordIntPair.lIlllIllIlIlII[9] = "  ".length();
        ChunkCoordIntPair.lIlllIllIlIlII[10] = "   ".length();
    }
    
    @Override
    public int hashCode() {
        final int llllllllllllIllllIlllIIIlIIlllIl = ChunkCoordIntPair.lIlllIllIlIlII[1] * this.chunkXPos + ChunkCoordIntPair.lIlllIllIlIlII[2];
        final int llllllllllllIllllIlllIIIlIIlllII = ChunkCoordIntPair.lIlllIllIlIlII[1] * (this.chunkZPos ^ ChunkCoordIntPair.lIlllIllIlIlII[3]) + ChunkCoordIntPair.lIlllIllIlIlII[2];
        return llllllllllllIllllIlllIIIlIIlllIl ^ llllllllllllIllllIlllIIIlIIlllII;
    }
    
    public static long chunkXZ2Int(final int llllllllllllIllllIlllIIIlIlIIIll, final int llllllllllllIllllIlllIIIlIlIIIlI) {
        return ((long)llllllllllllIllllIlllIIIlIlIIIll & 0xFFFFFFFFL) | ((long)llllllllllllIllllIlllIIIlIlIIIlI & 0xFFFFFFFFL) << ChunkCoordIntPair.lIlllIllIlIlII[0];
    }
    
    public ChunkCoordIntPair(final int llllllllllllIllllIlllIIIlIlIllII, final int llllllllllllIllllIlllIIIlIlIlIII) {
        this.chunkXPos = llllllllllllIllllIlllIIIlIlIllII;
        this.chunkZPos = llllllllllllIllllIlllIIIlIlIlIII;
    }
    
    public int getCenterXPos() {
        return (this.chunkXPos << ChunkCoordIntPair.lIlllIllIlIlII[6]) + ChunkCoordIntPair.lIlllIllIlIlII[7];
    }
    
    public int getCenterZPosition() {
        return (this.chunkZPos << ChunkCoordIntPair.lIlllIllIlIlII[6]) + ChunkCoordIntPair.lIlllIllIlIlII[7];
    }
    
    private static boolean lIIIIIllIlIIlIll(final int llllllllllllIllllIlllIIIIIlIIIll, final int llllllllllllIllllIlllIIIIIlIIIlI) {
        return llllllllllllIllllIlllIIIIIlIIIll < llllllllllllIllllIlllIIIIIlIIIlI;
    }
    
    public BlockPos getCenterBlock(final int llllllllllllIllllIlllIIIIllIlllI) {
        return new BlockPos(this.getCenterXPos(), llllllllllllIllllIlllIIIIllIlllI, this.getCenterZPosition());
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder(ChunkCoordIntPair.lIlllIllIlIIll[ChunkCoordIntPair.lIlllIllIlIlII[5]]).append(this.chunkXPos).append(ChunkCoordIntPair.lIlllIllIlIIll[ChunkCoordIntPair.lIlllIllIlIlII[4]]).append(this.chunkZPos).append(ChunkCoordIntPair.lIlllIllIlIIll[ChunkCoordIntPair.lIlllIllIlIlII[9]]));
    }
    
    public BlockPos getBlock(final int llllllllllllIllllIlllIIIIllllIII, final int llllllllllllIllllIlllIIIIlllIIll, final int llllllllllllIllllIlllIIIIlllIllI) {
        return new BlockPos((this.chunkXPos << ChunkCoordIntPair.lIlllIllIlIlII[6]) + llllllllllllIllllIlllIIIIllllIII, llllllllllllIllllIlllIIIIlllIIll, (this.chunkZPos << ChunkCoordIntPair.lIlllIllIlIlII[6]) + llllllllllllIllllIlllIIIIlllIllI);
    }
    
    private static boolean lIIIIIllIlIIlIII(final Object llllllllllllIllllIlllIIIIIIlllll, final Object llllllllllllIllllIlllIIIIIIllllI) {
        return llllllllllllIllllIlllIIIIIIlllll == llllllllllllIllllIlllIIIIIIllllI;
    }
    
    private static String lIIIIIllIlIIIIll(String llllllllllllIllllIlllIIIIIllllll, final String llllllllllllIllllIlllIIIIlIIIIll) {
        llllllllllllIllllIlllIIIIIllllll = new String(Base64.getDecoder().decode(llllllllllllIllllIlllIIIIIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIlllIIIIlIIIIlI = new StringBuilder();
        final char[] llllllllllllIllllIlllIIIIlIIIIIl = llllllllllllIllllIlllIIIIlIIIIll.toCharArray();
        int llllllllllllIllllIlllIIIIlIIIIII = ChunkCoordIntPair.lIlllIllIlIlII[5];
        final double llllllllllllIllllIlllIIIIIlllIlI = (Object)llllllllllllIllllIlllIIIIIllllll.toCharArray();
        final Exception llllllllllllIllllIlllIIIIIlllIIl = (Exception)llllllllllllIllllIlllIIIIIlllIlI.length;
        String llllllllllllIllllIlllIIIIIlllIII = (String)ChunkCoordIntPair.lIlllIllIlIlII[5];
        while (lIIIIIllIlIIlIll((int)llllllllllllIllllIlllIIIIIlllIII, (int)llllllllllllIllllIlllIIIIIlllIIl)) {
            final char llllllllllllIllllIlllIIIIlIIIlIl = llllllllllllIllllIlllIIIIIlllIlI[llllllllllllIllllIlllIIIIIlllIII];
            llllllllllllIllllIlllIIIIlIIIIlI.append((char)(llllllllllllIllllIlllIIIIlIIIlIl ^ llllllllllllIllllIlllIIIIlIIIIIl[llllllllllllIllllIlllIIIIlIIIIII % llllllllllllIllllIlllIIIIlIIIIIl.length]));
            "".length();
            ++llllllllllllIllllIlllIIIIlIIIIII;
            ++llllllllllllIllllIlllIIIIIlllIII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIlllIIIIlIIIIlI);
    }
    
    private static boolean lIIIIIllIlIIlIIl(final int llllllllllllIllllIlllIIIIIIlllII) {
        return llllllllllllIllllIlllIIIIIIlllII == 0;
    }
    
    private static String lIIIIIllIlIIIlII(final String llllllllllllIllllIlllIIIIlIlIlll, final String llllllllllllIllllIlllIIIIlIlIlIl) {
        try {
            final SecretKeySpec llllllllllllIllllIlllIIIIlIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlllIIIIlIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIlllIIIIlIlllIl = Cipher.getInstance("Blowfish");
            llllllllllllIllllIlllIIIIlIlllIl.init(ChunkCoordIntPair.lIlllIllIlIlII[9], llllllllllllIllllIlllIIIIlIllllI);
            return new String(llllllllllllIllllIlllIIIIlIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlllIIIIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlllIIIIlIllIll) {
            llllllllllllIllllIlllIIIIlIllIll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIIllIlIIIllI() {
        (lIlllIllIlIIll = new String[ChunkCoordIntPair.lIlllIllIlIlII[10]])[ChunkCoordIntPair.lIlllIllIlIlII[5]] = lIIIIIllIlIIIIll("Kg==", "qrbry");
        ChunkCoordIntPair.lIlllIllIlIIll[ChunkCoordIntPair.lIlllIllIlIlII[4]] = lIIIIIllIlIIIlII("yuVC2x25fig=", "cxhRF");
        ChunkCoordIntPair.lIlllIllIlIIll[ChunkCoordIntPair.lIlllIllIlIlII[9]] = lIIIIIllIlIIIlIl("9IPfLlzsx+g=", "oYHOh");
    }
    
    static {
        lIIIIIllIlIIIlll();
        lIIIIIllIlIIIllI();
    }
    
    private static boolean lIIIIIllIlIIlIlI(final int llllllllllllIllllIlllIIIIIlIIlll, final int llllllllllllIllllIlllIIIIIlIIllI) {
        return llllllllllllIllllIlllIIIIIlIIlll == llllllllllllIllllIlllIIIIIlIIllI;
    }
    
    public int getXEnd() {
        return (this.chunkXPos << ChunkCoordIntPair.lIlllIllIlIlII[6]) + ChunkCoordIntPair.lIlllIllIlIlII[8];
    }
}
