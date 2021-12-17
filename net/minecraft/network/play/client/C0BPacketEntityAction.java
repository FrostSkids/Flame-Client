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
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.play.INetHandlerPlayServer;
import net.minecraft.network.Packet;

public class C0BPacketEntityAction implements Packet<INetHandlerPlayServer>
{
    private /* synthetic */ int auxData;
    private /* synthetic */ Action action;
    private static final /* synthetic */ int[] llllIIlIIlIll;
    private /* synthetic */ int entityID;
    
    public C0BPacketEntityAction() {
    }
    
    public C0BPacketEntityAction(final Entity lllllllllllllIlIlllIlIIIlIllIlII, final Action lllllllllllllIlIlllIlIIIlIllIIll) {
        this(lllllllllllllIlIlllIlIIIlIllIlII, lllllllllllllIlIlllIlIIIlIllIIll, C0BPacketEntityAction.llllIIlIIlIll[0]);
    }
    
    private static void lIlIlIIIIlIlIIl() {
        (llllIIlIIlIll = new int[1])[0] = ((0xB3 ^ 0xA0) & ~(0xA5 ^ 0xB6));
    }
    
    public int getAuxData() {
        return this.auxData;
    }
    
    public C0BPacketEntityAction(final Entity lllllllllllllIlIlllIlIIIlIlIlIlI, final Action lllllllllllllIlIlllIlIIIlIlIIlIl, final int lllllllllllllIlIlllIlIIIlIlIIlII) {
        this.entityID = lllllllllllllIlIlllIlIIIlIlIlIlI.getEntityId();
        this.action = lllllllllllllIlIlllIlIIIlIlIIlIl;
        this.auxData = lllllllllllllIlIlllIlIIIlIlIIlII;
    }
    
    public Action getAction() {
        return this.action;
    }
    
    static {
        lIlIlIIIIlIlIIl();
    }
    
    @Override
    public void processPacket(final INetHandlerPlayServer lllllllllllllIlIlllIlIIIlIIlIlII) {
        lllllllllllllIlIlllIlIIIlIIlIlII.processEntityAction(this);
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIlIlllIlIIIlIIllIII) throws IOException {
        lllllllllllllIlIlllIlIIIlIIllIII.writeVarIntToBuffer(this.entityID);
        lllllllllllllIlIlllIlIIIlIIllIII.writeEnumValue(this.action);
        lllllllllllllIlIlllIlIIIlIIllIII.writeVarIntToBuffer(this.auxData);
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIlIlllIlIIIlIIllllI) throws IOException {
        this.entityID = lllllllllllllIlIlllIlIIIlIIllllI.readVarIntFromBuffer();
        this.action = lllllllllllllIlIlllIlIIIlIIllllI.readEnumValue(Action.class);
        this.auxData = lllllllllllllIlIlllIlIIIlIIllllI.readVarIntFromBuffer();
    }
    
    public enum Action
    {
        private static final /* synthetic */ int[] llIlllIlIlIlIl;
        
        STOP_SLEEPING(Action.llIlllIlIlIlII[Action.llIlllIlIlIlIl[2]], Action.llIlllIlIlIlIl[2]), 
        RIDING_JUMP(Action.llIlllIlIlIlII[Action.llIlllIlIlIlIl[5]], Action.llIlllIlIlIlIl[5]);
        
        private static final /* synthetic */ String[] llIlllIlIlIlII;
        
        STOP_SNEAKING(Action.llIlllIlIlIlII[Action.llIlllIlIlIlIl[1]], Action.llIlllIlIlIlIl[1]), 
        OPEN_INVENTORY(Action.llIlllIlIlIlII[Action.llIlllIlIlIlIl[6]], Action.llIlllIlIlIlIl[6]), 
        START_SNEAKING(Action.llIlllIlIlIlII[Action.llIlllIlIlIlIl[0]], Action.llIlllIlIlIlIl[0]), 
        STOP_SPRINTING(Action.llIlllIlIlIlII[Action.llIlllIlIlIlIl[4]], Action.llIlllIlIlIlIl[4]), 
        START_SPRINTING(Action.llIlllIlIlIlII[Action.llIlllIlIlIlIl[3]], Action.llIlllIlIlIlIl[3]);
        
        private static String lIIllIIlllIllIII(String llllllllllllIllIIlIIIlllIlIIIIII, final String llllllllllllIllIIlIIIlllIIllllll) {
            llllllllllllIllIIlIIIlllIlIIIIII = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIlIIIlllIlIIIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIIlIIIlllIlIIIIll = new StringBuilder();
            final char[] llllllllllllIllIIlIIIlllIlIIIIlI = llllllllllllIllIIlIIIlllIIllllll.toCharArray();
            int llllllllllllIllIIlIIIlllIlIIIIIl = Action.llIlllIlIlIlIl[0];
            final Exception llllllllllllIllIIlIIIlllIIlllIll = (Object)((String)llllllllllllIllIIlIIIlllIlIIIIII).toCharArray();
            final float llllllllllllIllIIlIIIlllIIlllIlI = llllllllllllIllIIlIIIlllIIlllIll.length;
            byte llllllllllllIllIIlIIIlllIIlllIIl = (byte)Action.llIlllIlIlIlIl[0];
            while (lIIllIIlllIlllIl(llllllllllllIllIIlIIIlllIIlllIIl, (int)llllllllllllIllIIlIIIlllIIlllIlI)) {
                final char llllllllllllIllIIlIIIlllIlIIIllI = llllllllllllIllIIlIIIlllIIlllIll[llllllllllllIllIIlIIIlllIIlllIIl];
                llllllllllllIllIIlIIIlllIlIIIIll.append((char)(llllllllllllIllIIlIIIlllIlIIIllI ^ llllllllllllIllIIlIIIlllIlIIIIlI[llllllllllllIllIIlIIIlllIlIIIIIl % llllllllllllIllIIlIIIlllIlIIIIlI.length]));
                "".length();
                ++llllllllllllIllIIlIIIlllIlIIIIIl;
                ++llllllllllllIllIIlIIIlllIIlllIIl;
                "".length();
                if ((0xF8 ^ 0xA7 ^ (0x3C ^ 0x67)) <= " ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIIlIIIlllIlIIIIll);
        }
        
        private static String lIIllIIlllIllIIl(final String llllllllllllIllIIlIIIlllIlIlIlIl, final String llllllllllllIllIIlIIIlllIlIlIIlI) {
            try {
                final SecretKeySpec llllllllllllIllIIlIIIlllIlIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIIlllIlIlIIlI.getBytes(StandardCharsets.UTF_8)), Action.llIlllIlIlIlIl[8]), "DES");
                final Cipher llllllllllllIllIIlIIIlllIlIlIlll = Cipher.getInstance("DES");
                llllllllllllIllIIlIIIlllIlIlIlll.init(Action.llIlllIlIlIlIl[2], llllllllllllIllIIlIIIlllIlIllIII);
                return new String(llllllllllllIllIIlIIIlllIlIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIIlllIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIlIIIlllIlIlIllI) {
                llllllllllllIllIIlIIIlllIlIlIllI.printStackTrace();
                return null;
            }
        }
        
        private static void lIIllIIlllIlllII() {
            (llIlllIlIlIlIl = new int[9])[0] = ("   ".length() & ("   ".length() ^ -" ".length()));
            Action.llIlllIlIlIlIl[1] = " ".length();
            Action.llIlllIlIlIlIl[2] = "  ".length();
            Action.llIlllIlIlIlIl[3] = "   ".length();
            Action.llIlllIlIlIlIl[4] = (0x58 ^ 0x5C);
            Action.llIlllIlIlIlIl[5] = (0x5E ^ 0x5B);
            Action.llIlllIlIlIlIl[6] = (0x2A ^ 0x58 ^ (0xC4 ^ 0xB0));
            Action.llIlllIlIlIlIl[7] = (0xC1 ^ 0xC6);
            Action.llIlllIlIlIlIl[8] = (0x80 ^ 0x88);
        }
        
        private static void lIIllIIlllIllIlI() {
            (llIlllIlIlIlII = new String[Action.llIlllIlIlIlIl[7]])[Action.llIlllIlIlIlIl[0]] = lIIllIIlllIlIlll("xt/0iIbUmC2nqlyxujucGw==", "nJtdB");
            Action.llIlllIlIlIlII[Action.llIlllIlIlIlIl[1]] = lIIllIIlllIlIlll("jvJ9jgH18ouV6nHxGNqCDA==", "xyfBS");
            Action.llIlllIlIlIlII[Action.llIlllIlIlIlIl[2]] = lIIllIIlllIlIlll("Ni2juYYCYprjFwk8cx5LJQ==", "JOqXC");
            Action.llIlllIlIlIlII[Action.llIlllIlIlIlIl[3]] = lIIllIIlllIllIII("JQ4OOQUpCR85GDgOBiUW", "vZOkQ");
            Action.llIlllIlIlIlII[Action.llIlllIlIlIlIl[4]] = lIIllIIlllIlIlll("i2wJ/s4P8Nr+txBpr5HinA==", "CvmJb");
            Action.llIlllIlIlIlII[Action.llIlllIlIlIlIl[5]] = lIIllIIlllIllIII("CwUAPhceEw4iFAk=", "YLDwY");
            Action.llIlllIlIlIlII[Action.llIlllIlIlIlIl[6]] = lIIllIIlllIllIIl("StzIxKmKyHeYCwGObpyvSg==", "cWwaz");
        }
        
        private static String lIIllIIlllIlIlll(final String llllllllllllIllIIlIIIlllIllIIIII, final String llllllllllllIllIIlIIIlllIllIIIIl) {
            try {
                final SecretKeySpec llllllllllllIllIIlIIIlllIllIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIIlllIllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIIlIIIlllIllIIlII = Cipher.getInstance("Blowfish");
                llllllllllllIllIIlIIIlllIllIIlII.init(Action.llIlllIlIlIlIl[2], llllllllllllIllIIlIIIlllIllIIlIl);
                return new String(llllllllllllIllIIlIIIlllIllIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIIlllIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIlIIIlllIllIIIll) {
                llllllllllllIllIIlIIIlllIllIIIll.printStackTrace();
                return null;
            }
        }
        
        private Action(final String llllllllllllIllIIlIIIlllIlllIIll, final int llllllllllllIllIIlIIIlllIlllIIlI) {
        }
        
        static {
            lIIllIIlllIlllII();
            lIIllIIlllIllIlI();
            final Action[] enum$VALUES = new Action[Action.llIlllIlIlIlIl[7]];
            enum$VALUES[Action.llIlllIlIlIlIl[0]] = Action.START_SNEAKING;
            enum$VALUES[Action.llIlllIlIlIlIl[1]] = Action.STOP_SNEAKING;
            enum$VALUES[Action.llIlllIlIlIlIl[2]] = Action.STOP_SLEEPING;
            enum$VALUES[Action.llIlllIlIlIlIl[3]] = Action.START_SPRINTING;
            enum$VALUES[Action.llIlllIlIlIlIl[4]] = Action.STOP_SPRINTING;
            enum$VALUES[Action.llIlllIlIlIlIl[5]] = Action.RIDING_JUMP;
            enum$VALUES[Action.llIlllIlIlIlIl[6]] = Action.OPEN_INVENTORY;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static boolean lIIllIIlllIlllIl(final int llllllllllllIllIIlIIIlllIIllIlIl, final int llllllllllllIllIIlIIIlllIIllIlII) {
            return llllllllllllIllIIlIIIlllIIllIlIl < llllllllllllIllIIlIIIlllIIllIlII;
        }
    }
}
