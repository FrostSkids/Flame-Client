// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.client;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayServer;
import net.minecraft.network.Packet;

public class C19PacketResourcePackStatus implements Packet<INetHandlerPlayServer>
{
    private /* synthetic */ String hash;
    private /* synthetic */ Action status;
    private static final /* synthetic */ int[] llIlllIIllllll;
    
    @Override
    public void processPacket(final INetHandlerPlayServer llllllllllllIllIIlIIlIllIIlIlIll) {
        llllllllllllIllIIlIIlIllIIlIlIll.handleResourcePackStatus(this);
    }
    
    public C19PacketResourcePackStatus() {
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllIIlIIlIllIIllIIIl) throws IOException {
        llllllllllllIllIIlIIlIllIIllIIIl.writeString(this.hash);
        "".length();
        llllllllllllIllIIlIIlIllIIllIIIl.writeEnumValue(this.status);
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllIIlIIlIllIIllIlIl) throws IOException {
        this.hash = llllllllllllIllIIlIIlIllIIllIlIl.readStringFromBuffer(C19PacketResourcePackStatus.llIlllIIllllll[0]);
        this.status = llllllllllllIllIIlIIlIllIIllIlIl.readEnumValue(Action.class);
    }
    
    private static boolean lIIllIIllIIllIII(final int llllllllllllIllIIlIIlIllIIlIIIlI, final int llllllllllllIllIIlIIlIllIIlIIIIl) {
        return llllllllllllIllIIlIIlIllIIlIIIlI > llllllllllllIllIIlIIlIllIIlIIIIl;
    }
    
    static {
        lIIllIIllIIlIlll();
    }
    
    public C19PacketResourcePackStatus(String llllllllllllIllIIlIIlIllIIllllII, final Action llllllllllllIllIIlIIlIllIIlllIll) {
        if (lIIllIIllIIllIII(llllllllllllIllIIlIIlIllIIllllII.length(), C19PacketResourcePackStatus.llIlllIIllllll[0])) {
            llllllllllllIllIIlIIlIllIIllllII = llllllllllllIllIIlIIlIllIIllllII.substring(C19PacketResourcePackStatus.llIlllIIllllll[1], C19PacketResourcePackStatus.llIlllIIllllll[0]);
        }
        this.hash = llllllllllllIllIIlIIlIllIIllllII;
        this.status = llllllllllllIllIIlIIlIllIIlllIll;
    }
    
    private static void lIIllIIllIIlIlll() {
        (llIlllIIllllll = new int[2])[0] = (0x90 ^ 0xB8);
        C19PacketResourcePackStatus.llIlllIIllllll[1] = ((0x67 ^ 0x35 ^ (0xE7 ^ 0x9E)) & (0x21 ^ 0x52 ^ (0x34 ^ 0x6C) ^ -" ".length()));
    }
    
    public enum Action
    {
        private static final /* synthetic */ String[] lIllIIlIllllII;
        
        DECLINED(Action.lIllIIlIllllII[Action.lIllIIlIlllllI[1]], Action.lIllIIlIlllllI[1]), 
        ACCEPTED(Action.lIllIIlIllllII[Action.lIllIIlIlllllI[3]], Action.lIllIIlIlllllI[3]), 
        FAILED_DOWNLOAD(Action.lIllIIlIllllII[Action.lIllIIlIlllllI[2]], Action.lIllIIlIlllllI[2]);
        
        private static final /* synthetic */ int[] lIllIIlIlllllI;
        
        SUCCESSFULLY_LOADED(Action.lIllIIlIllllII[Action.lIllIIlIlllllI[0]], Action.lIllIIlIlllllI[0]);
        
        private static String lllllIlIIlIlIll(String lllllllllllllIIIIIIllIllIIlllIll, final String lllllllllllllIIIIIIllIllIIllllll) {
            lllllllllllllIIIIIIllIllIIlllIll = new String(Base64.getDecoder().decode(lllllllllllllIIIIIIllIllIIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIIIIIllIllIIlllllI = new StringBuilder();
            final char[] lllllllllllllIIIIIIllIllIIllllIl = lllllllllllllIIIIIIllIllIIllllll.toCharArray();
            int lllllllllllllIIIIIIllIllIIllllII = Action.lIllIIlIlllllI[0];
            final byte lllllllllllllIIIIIIllIllIIllIllI = (Object)lllllllllllllIIIIIIllIllIIlllIll.toCharArray();
            final byte lllllllllllllIIIIIIllIllIIllIlIl = (byte)lllllllllllllIIIIIIllIllIIllIllI.length;
            String lllllllllllllIIIIIIllIllIIllIlII = (String)Action.lIllIIlIlllllI[0];
            while (lllllIlIIllIlIl((int)lllllllllllllIIIIIIllIllIIllIlII, lllllllllllllIIIIIIllIllIIllIlIl)) {
                final char lllllllllllllIIIIIIllIllIlIIIIIl = lllllllllllllIIIIIIllIllIIllIllI[lllllllllllllIIIIIIllIllIIllIlII];
                lllllllllllllIIIIIIllIllIIlllllI.append((char)(lllllllllllllIIIIIIllIllIlIIIIIl ^ lllllllllllllIIIIIIllIllIIllllIl[lllllllllllllIIIIIIllIllIIllllII % lllllllllllllIIIIIIllIllIIllllIl.length]));
                "".length();
                ++lllllllllllllIIIIIIllIllIIllllII;
                ++lllllllllllllIIIIIIllIllIIllIlII;
                "".length();
                if (" ".length() >= "   ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIIIIIllIllIIlllllI);
        }
        
        private static void lllllIlIIlIllIl() {
            (lIllIIlIllllII = new String[Action.lIllIIlIlllllI[4]])[Action.lIllIIlIlllllI[0]] = lllllIlIIlIlIIl("1Abg27nrHQAOsKCrikyulNQVynWCFmRc", "rmWRr");
            Action.lIllIIlIllllII[Action.lIllIIlIlllllI[1]] = lllllIlIIlIlIll("IAwrDwIqDCw=", "dIhCK");
            Action.lIllIIlIllllII[Action.lIllIIlIlllllI[2]] = lllllIlIIlIllII("GahSJs80w4yVLI9dfFK7HA==", "SKKOW");
            Action.lIllIIlIllllII[Action.lIllIIlIlllllI[3]] = lllllIlIIlIlIll("IgEANCY3Bwc=", "cBCqv");
        }
        
        static {
            lllllIlIIllIlII();
            lllllIlIIlIllIl();
            final Action[] enum$VALUES = new Action[Action.lIllIIlIlllllI[4]];
            enum$VALUES[Action.lIllIIlIlllllI[0]] = Action.SUCCESSFULLY_LOADED;
            enum$VALUES[Action.lIllIIlIlllllI[1]] = Action.DECLINED;
            enum$VALUES[Action.lIllIIlIlllllI[2]] = Action.FAILED_DOWNLOAD;
            enum$VALUES[Action.lIllIIlIlllllI[3]] = Action.ACCEPTED;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static String lllllIlIIlIlIIl(final String lllllllllllllIIIIIIllIllIlIlllIl, final String lllllllllllllIIIIIIllIllIlIllIlI) {
            try {
                final SecretKeySpec lllllllllllllIIIIIIllIllIllIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIllIllIlIllIlI.getBytes(StandardCharsets.UTF_8)), Action.lIllIIlIlllllI[5]), "DES");
                final Cipher lllllllllllllIIIIIIllIllIlIlllll = Cipher.getInstance("DES");
                lllllllllllllIIIIIIllIllIlIlllll.init(Action.lIllIIlIlllllI[2], lllllllllllllIIIIIIllIllIllIIIII);
                return new String(lllllllllllllIIIIIIllIllIlIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIllIllIlIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIIIIllIllIlIllllI) {
                lllllllllllllIIIIIIllIllIlIllllI.printStackTrace();
                return null;
            }
        }
        
        private static String lllllIlIIlIllII(final String lllllllllllllIIIIIIllIllIlIIlllI, final String lllllllllllllIIIIIIllIllIlIIllll) {
            try {
                final SecretKeySpec lllllllllllllIIIIIIllIllIlIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIllIllIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIIIIIllIllIlIlIIlI = Cipher.getInstance("Blowfish");
                lllllllllllllIIIIIIllIllIlIlIIlI.init(Action.lIllIIlIlllllI[2], lllllllllllllIIIIIIllIllIlIlIIll);
                return new String(lllllllllllllIIIIIIllIllIlIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIllIllIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIIIIllIllIlIlIIIl) {
                lllllllllllllIIIIIIllIllIlIlIIIl.printStackTrace();
                return null;
            }
        }
        
        private Action(final String lllllllllllllIIIIIIllIllIllIlllI, final int lllllllllllllIIIIIIllIllIllIllIl) {
        }
        
        private static void lllllIlIIllIlII() {
            (lIllIIlIlllllI = new int[6])[0] = ((0xB3 ^ 0xBD) & ~(0x42 ^ 0x4C));
            Action.lIllIIlIlllllI[1] = " ".length();
            Action.lIllIIlIlllllI[2] = "  ".length();
            Action.lIllIIlIlllllI[3] = "   ".length();
            Action.lIllIIlIlllllI[4] = (0x1 ^ 0x6F ^ (0xD1 ^ 0xBB));
            Action.lIllIIlIlllllI[5] = (0x7E ^ 0x76);
        }
        
        private static boolean lllllIlIIllIlIl(final int lllllllllllllIIIIIIllIllIIllIIII, final int lllllllllllllIIIIIIllIllIIlIllll) {
            return lllllllllllllIIIIIIllIllIIllIIII < lllllllllllllIIIIIIllIllIIlIllll;
        }
    }
}
