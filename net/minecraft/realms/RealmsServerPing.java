// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.realms;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class RealmsServerPing
{
    public volatile /* synthetic */ String nrOfPlayers;
    private static final /* synthetic */ String[] lIllllIIlIlllI;
    private static final /* synthetic */ int[] lIllllIlIIIlII;
    public volatile /* synthetic */ long lastPingSnapshot;
    public volatile /* synthetic */ String playerList;
    
    private static void lIIIIlIIIllIIIIl() {
        (lIllllIlIIIlII = new int[4])[0] = ((0xBF ^ 0x89) & ~(0x6B ^ 0x5D));
        RealmsServerPing.lIllllIlIIIlII[1] = " ".length();
        RealmsServerPing.lIllllIlIIIlII[2] = "  ".length();
        RealmsServerPing.lIllllIlIIIlII[3] = (0x31 ^ 0x39);
    }
    
    static {
        lIIIIlIIIllIIIIl();
        lIIIIlIIIIlIIlII();
    }
    
    public RealmsServerPing() {
        this.nrOfPlayers = RealmsServerPing.lIllllIIlIlllI[RealmsServerPing.lIllllIlIIIlII[0]];
        this.lastPingSnapshot = 0L;
        this.playerList = RealmsServerPing.lIllllIIlIlllI[RealmsServerPing.lIllllIlIIIlII[1]];
    }
    
    private static String lIIIIlIIIIlIIIll(final String llllllllllllIllllIlIIlllIIIIIlIl, final String llllllllllllIllllIlIIlllIIIIIlII) {
        try {
            final SecretKeySpec llllllllllllIllllIlIIlllIIIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIIlllIIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIlIIlllIIIIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllllIlIIlllIIIIlIIl.init(RealmsServerPing.lIllllIlIIIlII[2], llllllllllllIllllIlIIlllIIIIlIlI);
            return new String(llllllllllllIllllIlIIlllIIIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIIlllIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlIIlllIIIIlIII) {
            llllllllllllIllllIlIIlllIIIIlIII.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIlIIIIlIIlII() {
        (lIllllIIlIlllI = new String[RealmsServerPing.lIllllIlIIIlII[2]])[RealmsServerPing.lIllllIlIIIlII[0]] = lIIIIlIIIIlIIIlI("d7dDi3/aA8Q=", "mtLGe");
        RealmsServerPing.lIllllIIlIlllI[RealmsServerPing.lIllllIlIIIlII[1]] = lIIIIlIIIIlIIIll("TzMh6IYVTcs=", "wWyXf");
    }
    
    private static String lIIIIlIIIIlIIIlI(final String llllllllllllIllllIlIIllIlllllIlI, final String llllllllllllIllllIlIIllIllllIlll) {
        try {
            final SecretKeySpec llllllllllllIllllIlIIllIllllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIIllIllllIlll.getBytes(StandardCharsets.UTF_8)), RealmsServerPing.lIllllIlIIIlII[3]), "DES");
            final Cipher llllllllllllIllllIlIIllIllllllII = Cipher.getInstance("DES");
            llllllllllllIllllIlIIllIllllllII.init(RealmsServerPing.lIllllIlIIIlII[2], llllllllllllIllllIlIIllIllllllIl);
            return new String(llllllllllllIllllIlIIllIllllllII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIIllIlllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlIIllIlllllIll) {
            llllllllllllIllllIlIIllIlllllIll.printStackTrace();
            return null;
        }
    }
}
