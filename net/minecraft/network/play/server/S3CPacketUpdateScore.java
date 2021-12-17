// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import net.minecraft.scoreboard.ScoreObjective;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.scoreboard.Score;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S3CPacketUpdateScore implements Packet<INetHandlerPlayClient>
{
    private static final /* synthetic */ int[] lIIllllIlIlIlI;
    private /* synthetic */ String objective;
    private /* synthetic */ Action action;
    private /* synthetic */ String name;
    private static final /* synthetic */ String[] lIIllllIlIlIIl;
    private /* synthetic */ int value;
    
    private static String llIllllIIIIIIII(final String lllllllllllllIIlIIlIlIIlIIIllIll, final String lllllllllllllIIlIIlIlIIlIIIlllII) {
        try {
            final SecretKeySpec lllllllllllllIIlIIlIlIIlIIlIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIlIIlIIIlllII.getBytes(StandardCharsets.UTF_8)), S3CPacketUpdateScore.lIIllllIlIlIlI[8]), "DES");
            final Cipher lllllllllllllIIlIIlIlIIlIIIlllll = Cipher.getInstance("DES");
            lllllllllllllIIlIIlIlIIlIIIlllll.init(S3CPacketUpdateScore.lIIllllIlIlIlI[2], lllllllllllllIIlIIlIlIIlIIlIIIII);
            return new String(lllllllllllllIIlIIlIlIIlIIIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIlIIlIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIlIlIIlIIIllllI) {
            lllllllllllllIIlIIlIlIIlIIIllllI.printStackTrace();
            return null;
        }
    }
    
    public S3CPacketUpdateScore(final Score lllllllllllllIIlIIlIlIIlIlllllIl) {
        this.name = S3CPacketUpdateScore.lIIllllIlIlIIl[S3CPacketUpdateScore.lIIllllIlIlIlI[2]];
        this.objective = S3CPacketUpdateScore.lIIllllIlIlIIl[S3CPacketUpdateScore.lIIllllIlIlIlI[3]];
        this.name = lllllllllllllIIlIIlIlIIlIlllllIl.getPlayerName();
        this.objective = lllllllllllllIIlIIlIlIIlIlllllIl.getObjective().getName();
        this.value = lllllllllllllIIlIIlIlIIlIlllllIl.getScorePoints();
        this.action = Action.CHANGE;
    }
    
    private static String llIlllIllllllll(String lllllllllllllIIlIIlIlIIlIIllIIlI, final String lllllllllllllIIlIIlIlIIlIIlIllII) {
        lllllllllllllIIlIIlIlIIlIIllIIlI = new String(Base64.getDecoder().decode(lllllllllllllIIlIIlIlIIlIIllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIlIlIIlIIllIIII = new StringBuilder();
        final char[] lllllllllllllIIlIIlIlIIlIIlIllll = lllllllllllllIIlIIlIlIIlIIlIllII.toCharArray();
        int lllllllllllllIIlIIlIlIIlIIlIlllI = S3CPacketUpdateScore.lIIllllIlIlIlI[0];
        final long lllllllllllllIIlIIlIlIIlIIlIlIII = (Object)lllllllllllllIIlIIlIlIIlIIllIIlI.toCharArray();
        final long lllllllllllllIIlIIlIlIIlIIlIIlll = lllllllllllllIIlIIlIlIIlIIlIlIII.length;
        float lllllllllllllIIlIIlIlIIlIIlIIllI = S3CPacketUpdateScore.lIIllllIlIlIlI[0];
        while (llIllllIIIIlIII((int)lllllllllllllIIlIIlIlIIlIIlIIllI, (int)lllllllllllllIIlIIlIlIIlIIlIIlll)) {
            final char lllllllllllllIIlIIlIlIIlIIllIIll = lllllllllllllIIlIIlIlIIlIIlIlIII[lllllllllllllIIlIIlIlIIlIIlIIllI];
            lllllllllllllIIlIIlIlIIlIIllIIII.append((char)(lllllllllllllIIlIIlIlIIlIIllIIll ^ lllllllllllllIIlIIlIlIIlIIlIllll[lllllllllllllIIlIIlIlIIlIIlIlllI % lllllllllllllIIlIIlIlIIlIIlIllll.length]));
            "".length();
            ++lllllllllllllIIlIIlIlIIlIIlIlllI;
            ++lllllllllllllIIlIIlIlIIlIIlIIllI;
            "".length();
            if (((0x5E ^ 0x1D) & ~(0xEA ^ 0xA9)) <= -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIlIlIIlIIllIIII);
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIlIIlIlIIlIllIIllI) throws IOException {
        this.name = lllllllllllllIIlIIlIlIIlIllIIllI.readStringFromBuffer(S3CPacketUpdateScore.lIIllllIlIlIlI[9]);
        this.action = lllllllllllllIIlIIlIlIIlIllIIllI.readEnumValue(Action.class);
        this.objective = lllllllllllllIIlIIlIlIIlIllIIllI.readStringFromBuffer(S3CPacketUpdateScore.lIIllllIlIlIlI[10]);
        if (llIllllIIIIIlll(this.action, Action.REMOVE)) {
            this.value = lllllllllllllIIlIIlIlIIlIllIIllI.readVarIntFromBuffer();
        }
    }
    
    public S3CPacketUpdateScore(final String lllllllllllllIIlIIlIlIIlIlllIIII, final ScoreObjective lllllllllllllIIlIIlIlIIlIllIllll) {
        this.name = S3CPacketUpdateScore.lIIllllIlIlIIl[S3CPacketUpdateScore.lIIllllIlIlIlI[7]];
        this.objective = S3CPacketUpdateScore.lIIllllIlIlIIl[S3CPacketUpdateScore.lIIllllIlIlIlI[8]];
        this.name = lllllllllllllIIlIIlIlIIlIlllIIII;
        this.objective = lllllllllllllIIlIIlIlIIlIllIllll.getName();
        this.value = S3CPacketUpdateScore.lIIllllIlIlIlI[0];
        this.action = Action.REMOVE;
    }
    
    public S3CPacketUpdateScore(final String lllllllllllllIIlIIlIlIIlIlllIlll) {
        this.name = S3CPacketUpdateScore.lIIllllIlIlIIl[S3CPacketUpdateScore.lIIllllIlIlIlI[4]];
        this.objective = S3CPacketUpdateScore.lIIllllIlIlIIl[S3CPacketUpdateScore.lIIllllIlIlIlI[5]];
        this.name = lllllllllllllIIlIIlIlIIlIlllIlll;
        this.objective = S3CPacketUpdateScore.lIIllllIlIlIIl[S3CPacketUpdateScore.lIIllllIlIlIlI[6]];
        this.value = S3CPacketUpdateScore.lIIllllIlIlIlI[0];
        this.action = Action.REMOVE;
    }
    
    private static String llIllllIIIIIIlI(final String lllllllllllllIIlIIlIlIIlIlIIIIII, final String lllllllllllllIIlIIlIlIIlIIllllll) {
        try {
            final SecretKeySpec lllllllllllllIIlIIlIlIIlIlIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIlIIlIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIlIlIIlIlIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIlIlIIlIlIIIlII.init(S3CPacketUpdateScore.lIIllllIlIlIlI[2], lllllllllllllIIlIIlIlIIlIlIIIlIl);
            return new String(lllllllllllllIIlIIlIlIIlIlIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIlIIlIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIlIlIIlIlIIIIll) {
            lllllllllllllIIlIIlIlIIlIlIIIIll.printStackTrace();
            return null;
        }
    }
    
    public Action getScoreAction() {
        return this.action;
    }
    
    private static boolean llIllllIIIIIlll(final Object lllllllllllllIIlIIlIlIIlIIIlIIIl, final Object lllllllllllllIIlIIlIlIIlIIIlIIII) {
        return lllllllllllllIIlIIlIlIIlIIIlIIIl != lllllllllllllIIlIIlIlIIlIIIlIIII;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIIlIIlIlIIlIlIllIlI) {
        lllllllllllllIIlIIlIlIIlIlIllIlI.handleUpdateScore(this);
    }
    
    private static void llIllllIIIIIlII() {
        (lIIllllIlIlIIl = new String[S3CPacketUpdateScore.lIIllllIlIlIlI[11]])[S3CPacketUpdateScore.lIIllllIlIlIlI[0]] = llIlllIllllllll("", "ATtUG");
        S3CPacketUpdateScore.lIIllllIlIlIIl[S3CPacketUpdateScore.lIIllllIlIlIlI[1]] = llIlllIllllllll("", "ClHRk");
        S3CPacketUpdateScore.lIIllllIlIlIIl[S3CPacketUpdateScore.lIIllllIlIlIlI[2]] = llIlllIllllllll("", "tenfb");
        S3CPacketUpdateScore.lIIllllIlIlIIl[S3CPacketUpdateScore.lIIllllIlIlIlI[3]] = llIlllIllllllll("", "KAqaD");
        S3CPacketUpdateScore.lIIllllIlIlIIl[S3CPacketUpdateScore.lIIllllIlIlIlI[4]] = llIlllIllllllll("", "NDJdk");
        S3CPacketUpdateScore.lIIllllIlIlIIl[S3CPacketUpdateScore.lIIllllIlIlIlI[5]] = llIllllIIIIIIII("oKT/VlrMhvY=", "dWUGd");
        S3CPacketUpdateScore.lIIllllIlIlIIl[S3CPacketUpdateScore.lIIllllIlIlIlI[6]] = llIlllIllllllll("", "iSSQx");
        S3CPacketUpdateScore.lIIllllIlIlIIl[S3CPacketUpdateScore.lIIllllIlIlIlI[7]] = llIllllIIIIIIlI("4NmBzisHEOU=", "xjpnk");
        S3CPacketUpdateScore.lIIllllIlIlIIl[S3CPacketUpdateScore.lIIllllIlIlIlI[8]] = llIllllIIIIIIlI("g9lmTbUHKpU=", "qkPmx");
    }
    
    public String getPlayerName() {
        return this.name;
    }
    
    public S3CPacketUpdateScore() {
        this.name = S3CPacketUpdateScore.lIIllllIlIlIIl[S3CPacketUpdateScore.lIIllllIlIlIlI[0]];
        this.objective = S3CPacketUpdateScore.lIIllllIlIlIIl[S3CPacketUpdateScore.lIIllllIlIlIlI[1]];
    }
    
    private static boolean llIllllIIIIlIII(final int lllllllllllllIIlIIlIlIIlIIIlIlIl, final int lllllllllllllIIlIIlIlIIlIIIlIlII) {
        return lllllllllllllIIlIIlIlIIlIIIlIlIl < lllllllllllllIIlIIlIlIIlIIIlIlII;
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIlIIlIlIIlIllIIIII) throws IOException {
        lllllllllllllIIlIIlIlIIlIllIIIII.writeString(this.name);
        "".length();
        lllllllllllllIIlIIlIlIIlIllIIIII.writeEnumValue(this.action);
        lllllllllllllIIlIIlIlIIlIllIIIII.writeString(this.objective);
        "".length();
        if (llIllllIIIIIlll(this.action, Action.REMOVE)) {
            lllllllllllllIIlIIlIlIIlIllIIIII.writeVarIntToBuffer(this.value);
        }
    }
    
    public String getObjectiveName() {
        return this.objective;
    }
    
    private static void llIllllIIIIIllI() {
        (lIIllllIlIlIlI = new int[12])[0] = ((2 + 5 + 84 + 131 ^ 69 + 100 - 71 + 33) & (226 + 209 - 193 + 9 ^ 77 + 38 + 43 + 8 ^ -" ".length()));
        S3CPacketUpdateScore.lIIllllIlIlIlI[1] = " ".length();
        S3CPacketUpdateScore.lIIllllIlIlIlI[2] = "  ".length();
        S3CPacketUpdateScore.lIIllllIlIlIlI[3] = "   ".length();
        S3CPacketUpdateScore.lIIllllIlIlIlI[4] = (0x3B ^ 0x2A ^ (0xBA ^ 0xAF));
        S3CPacketUpdateScore.lIIllllIlIlIlI[5] = (0x47 ^ 0xE ^ (0xE4 ^ 0xA8));
        S3CPacketUpdateScore.lIIllllIlIlIlI[6] = (0x19 ^ 0x1F);
        S3CPacketUpdateScore.lIIllllIlIlIlI[7] = (0x2 ^ 0x39 ^ (0x2F ^ 0x13));
        S3CPacketUpdateScore.lIIllllIlIlIlI[8] = (0x6C ^ 0x2B ^ (0x35 ^ 0x7A));
        S3CPacketUpdateScore.lIIllllIlIlIlI[9] = (126 + 95 - 183 + 96 ^ 21 + 170 - 185 + 168);
        S3CPacketUpdateScore.lIIllllIlIlIlI[10] = (0x50 ^ 0x40);
        S3CPacketUpdateScore.lIIllllIlIlIlI[11] = (0x68 ^ 0x51 ^ (0x95 ^ 0xA5));
    }
    
    static {
        llIllllIIIIIllI();
        llIllllIIIIIlII();
    }
    
    public int getScoreValue() {
        return this.value;
    }
    
    public enum Action
    {
        REMOVE(Action.llIlllllIIlIll[Action.llIlllllIIllIl[1]], Action.llIlllllIIllIl[1]);
        
        private static final /* synthetic */ String[] llIlllllIIlIll;
        private static final /* synthetic */ int[] llIlllllIIllIl;
        
        CHANGE(Action.llIlllllIIlIll[Action.llIlllllIIllIl[0]], Action.llIlllllIIllIl[0]);
        
        private static String lIIllIllIIIllllI(final String llllllllllllIllIIIllIIIIlIIlIIll, final String llllllllllllIllIIIllIIIIlIIlIIlI) {
            try {
                final SecretKeySpec llllllllllllIllIIIllIIIIlIIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllIIIIlIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIIIllIIIIlIIlIlll = Cipher.getInstance("Blowfish");
                llllllllllllIllIIIllIIIIlIIlIlll.init(Action.llIlllllIIllIl[2], llllllllllllIllIIIllIIIIlIIllIII);
                return new String(llllllllllllIllIIIllIIIIlIIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllIIIIlIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIIllIIIIlIIlIllI) {
                llllllllllllIllIIIllIIIIlIIlIllI.printStackTrace();
                return null;
            }
        }
        
        static {
            lIIllIllIIlIIIll();
            lIIllIllIIlIIIII();
            final Action[] enum$VALUES = new Action[Action.llIlllllIIllIl[2]];
            enum$VALUES[Action.llIlllllIIllIl[0]] = Action.CHANGE;
            enum$VALUES[Action.llIlllllIIllIl[1]] = Action.REMOVE;
            ENUM$VALUES = enum$VALUES;
        }
        
        private Action(final String llllllllllllIllIIIllIIIIlIlIIllI, final int llllllllllllIllIIIllIIIIlIlIIlIl) {
        }
        
        private static String lIIllIllIIIlllIl(final String llllllllllllIllIIIllIIIIlIIIIllI, final String llllllllllllIllIIIllIIIIlIIIIlIl) {
            try {
                final SecretKeySpec llllllllllllIllIIIllIIIIlIIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllIIIIlIIIIlIl.getBytes(StandardCharsets.UTF_8)), Action.llIlllllIIllIl[3]), "DES");
                final Cipher llllllllllllIllIIIllIIIIlIIIlIlI = Cipher.getInstance("DES");
                llllllllllllIllIIIllIIIIlIIIlIlI.init(Action.llIlllllIIllIl[2], llllllllllllIllIIIllIIIIlIIIlIll);
                return new String(llllllllllllIllIIIllIIIIlIIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllIIIIlIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIIllIIIIlIIIlIIl) {
                llllllllllllIllIIIllIIIIlIIIlIIl.printStackTrace();
                return null;
            }
        }
        
        private static void lIIllIllIIlIIIll() {
            (llIlllllIIllIl = new int[4])[0] = ((83 + 130 - 142 + 95 ^ 0 + 90 + 16 + 78) & (6 + 67 + 69 + 30 ^ 82 + 62 - 25 + 59 ^ -" ".length()));
            Action.llIlllllIIllIl[1] = " ".length();
            Action.llIlllllIIllIl[2] = "  ".length();
            Action.llIlllllIIllIl[3] = (0xB0 ^ 0x97 ^ (0x8C ^ 0xA3));
        }
        
        private static void lIIllIllIIlIIIII() {
            (llIlllllIIlIll = new String[Action.llIlllllIIllIl[2]])[Action.llIlllllIIllIl[0]] = lIIllIllIIIlllIl("9P2GDRFWYqE=", "ScOzT");
            Action.llIlllllIIlIll[Action.llIlllllIIllIl[1]] = lIIllIllIIIllllI("/BTBLxz5hlE=", "IDVio");
        }
    }
}
