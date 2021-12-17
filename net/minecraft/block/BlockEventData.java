// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.BlockPos;

public class BlockEventData
{
    private static final /* synthetic */ int[] llIlIIIIIIllll;
    private /* synthetic */ int eventParameter;
    private /* synthetic */ int eventID;
    private /* synthetic */ Block blockType;
    private /* synthetic */ BlockPos position;
    private static final /* synthetic */ String[] llIlIIIIIIlllI;
    
    private static boolean lIIlIIIlIIlIIIIl(final int llllllllllllIllIllIlllIlIIllIlll) {
        return llllllllllllIllIllIlllIlIIllIlll != 0;
    }
    
    private static void lIIlIIIlIIIlllll() {
        (llIlIIIIIIllll = new int[6])[0] = ((0xFC ^ 0x85 ^ (0x5 ^ 0x6C)) & ("   ".length() ^ (0x8C ^ 0x9F) ^ -" ".length()));
        BlockEventData.llIlIIIIIIllll[1] = " ".length();
        BlockEventData.llIlIIIIIIllll[2] = "  ".length();
        BlockEventData.llIlIIIIIIllll[3] = "   ".length();
        BlockEventData.llIlIIIIIIllll[4] = (0x99 ^ 0x9D);
        BlockEventData.llIlIIIIIIllll[5] = (0xC8 ^ 0xAC ^ (0x34 ^ 0x58));
    }
    
    private static boolean lIIlIIIlIIlIIIII(final int llllllllllllIllIllIlllIlIIllIlIl) {
        return llllllllllllIllIllIlllIlIIllIlIl == 0;
    }
    
    private static void lIIlIIIlIIIllllI() {
        (llIlIIIIIIlllI = new String[BlockEventData.llIlIIIIIIllll[4]])[BlockEventData.llIlIIIIIIllll[0]] = lIIlIIIlIIIlllII("1PEae8/ebKM=", "GJdDP");
        BlockEventData.llIlIIIIIIlllI[BlockEventData.llIlIIIIIIllll[1]] = lIIlIIIlIIIlllIl("sS2zPgnspEw=", "BUgmv");
        BlockEventData.llIlIIIIIIlllI[BlockEventData.llIlIIIIIIllll[2]] = lIIlIIIlIIIlllIl("yRDfU97WaTM=", "HLggq");
        BlockEventData.llIlIIIIIIlllI[BlockEventData.llIlIIIIIIllll[3]] = lIIlIIIlIIIlllII("bfCl05UI6UI=", "PpoBw");
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder(BlockEventData.llIlIIIIIIlllI[BlockEventData.llIlIIIIIIllll[0]]).append(this.position).append(BlockEventData.llIlIIIIIIlllI[BlockEventData.llIlIIIIIIllll[1]]).append(this.eventID).append(BlockEventData.llIlIIIIIIlllI[BlockEventData.llIlIIIIIIllll[2]]).append(this.eventParameter).append(BlockEventData.llIlIIIIIIlllI[BlockEventData.llIlIIIIIIllll[3]]).append(this.blockType));
    }
    
    public int getEventID() {
        return this.eventID;
    }
    
    public BlockPos getPosition() {
        return this.position;
    }
    
    public Block getBlock() {
        return this.blockType;
    }
    
    static {
        lIIlIIIlIIIlllll();
        lIIlIIIlIIIllllI();
    }
    
    public int getEventParameter() {
        return this.eventParameter;
    }
    
    public BlockEventData(final BlockPos llllllllllllIllIllIlllIlIllllIll, final Block llllllllllllIllIllIlllIlIlllIlIl, final int llllllllllllIllIllIlllIlIlllIlII, final int llllllllllllIllIllIlllIlIllllIII) {
        this.position = llllllllllllIllIllIlllIlIllllIll;
        this.eventID = llllllllllllIllIllIlllIlIlllIlII;
        this.eventParameter = llllllllllllIllIllIlllIlIllllIII;
        this.blockType = llllllllllllIllIllIlllIlIlllIlIl;
    }
    
    private static boolean lIIlIIIlIIlIIIlI(final int llllllllllllIllIllIlllIlIIlllllI, final int llllllllllllIllIllIlllIlIIllllIl) {
        return llllllllllllIllIllIlllIlIIlllllI == llllllllllllIllIllIlllIlIIllllIl;
    }
    
    private static String lIIlIIIlIIIlllII(final String llllllllllllIllIllIlllIlIlIlIIll, final String llllllllllllIllIllIlllIlIlIlIIII) {
        try {
            final SecretKeySpec llllllllllllIllIllIlllIlIlIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIlllIlIlIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllIlllIlIlIlIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIllIlllIlIlIlIlIl.init(BlockEventData.llIlIIIIIIllll[2], llllllllllllIllIllIlllIlIlIlIllI);
            return new String(llllllllllllIllIllIlllIlIlIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIlllIlIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIlllIlIlIlIlII) {
            llllllllllllIllIllIlllIlIlIlIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIIIlIIlIIIll(final Object llllllllllllIllIllIlllIlIIlllIlI, final Object llllllllllllIllIllIlllIlIIlllIIl) {
        return llllllllllllIllIllIlllIlIIlllIlI == llllllllllllIllIllIlllIlIIlllIIl;
    }
    
    private static String lIIlIIIlIIIlllIl(final String llllllllllllIllIllIlllIlIlIIIlII, final String llllllllllllIllIllIlllIlIlIIIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIllIlllIlIlIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIlllIlIlIIIlIl.getBytes(StandardCharsets.UTF_8)), BlockEventData.llIlIIIIIIllll[5]), "DES");
            final Cipher llllllllllllIllIllIlllIlIlIIlIII = Cipher.getInstance("DES");
            llllllllllllIllIllIlllIlIlIIlIII.init(BlockEventData.llIlIIIIIIllll[2], llllllllllllIllIllIlllIlIlIIlIIl);
            return new String(llllllllllllIllIllIlllIlIlIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIlllIlIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIlllIlIlIIIlll) {
            llllllllllllIllIllIlllIlIlIIIlll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean equals(final Object llllllllllllIllIllIlllIlIllIIIlI) {
        if (lIIlIIIlIIlIIIII((llllllllllllIllIllIlllIlIllIIIlI instanceof BlockEventData) ? 1 : 0)) {
            return BlockEventData.llIlIIIIIIllll[0] != 0;
        }
        final BlockEventData llllllllllllIllIllIlllIlIllIIIIl = (BlockEventData)llllllllllllIllIllIlllIlIllIIIlI;
        if (lIIlIIIlIIlIIIIl(this.position.equals(llllllllllllIllIllIlllIlIllIIIIl.position) ? 1 : 0) && lIIlIIIlIIlIIIlI(this.eventID, llllllllllllIllIllIlllIlIllIIIIl.eventID) && lIIlIIIlIIlIIIlI(this.eventParameter, llllllllllllIllIllIlllIlIllIIIIl.eventParameter) && lIIlIIIlIIlIIIll(this.blockType, llllllllllllIllIllIlllIlIllIIIIl.blockType)) {
            return BlockEventData.llIlIIIIIIllll[1] != 0;
        }
        return BlockEventData.llIlIIIIIIllll[0] != 0;
    }
}
