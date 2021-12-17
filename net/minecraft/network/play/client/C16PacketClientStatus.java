// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.client;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.network.play.INetHandlerPlayServer;
import net.minecraft.network.Packet;

public class C16PacketClientStatus implements Packet<INetHandlerPlayServer>
{
    private /* synthetic */ EnumState status;
    
    @Override
    public void processPacket(final INetHandlerPlayServer llllllllllllIlIllllIlIIlIIIIlIlI) {
        llllllllllllIlIllllIlIIlIIIIlIlI.processClientStatus(this);
    }
    
    public C16PacketClientStatus(final EnumState llllllllllllIlIllllIlIIlIIIlllII) {
        this.status = llllllllllllIlIllllIlIIlIIIlllII;
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlIllllIlIIlIIIlIlII) throws IOException {
        this.status = llllllllllllIlIllllIlIIlIIIlIlII.readEnumValue(EnumState.class);
    }
    
    public C16PacketClientStatus() {
    }
    
    public EnumState getStatus() {
        return this.status;
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlIllllIlIIlIIIIlllI) throws IOException {
        llllllllllllIlIllllIlIIlIIIIlllI.writeEnumValue(this.status);
    }
    
    public enum EnumState
    {
        PERFORM_RESPAWN(EnumState.llIIllIlllIlII[EnumState.llIIllIlllIlIl[0]], EnumState.llIIllIlllIlIl[0]);
        
        private static final /* synthetic */ int[] llIIllIlllIlIl;
        private static final /* synthetic */ String[] llIIllIlllIlII;
        
        REQUEST_STATS(EnumState.llIIllIlllIlII[EnumState.llIIllIlllIlIl[1]], EnumState.llIIllIlllIlIl[1]), 
        OPEN_INVENTORY_ACHIEVEMENT(EnumState.llIIllIlllIlII[EnumState.llIIllIlllIlIl[2]], EnumState.llIIllIlllIlIl[2]);
        
        static {
            lIIIllllIIlIlIlI();
            lIIIllllIIlIlIIl();
            final EnumState[] enum$VALUES = new EnumState[EnumState.llIIllIlllIlIl[3]];
            enum$VALUES[EnumState.llIIllIlllIlIl[0]] = EnumState.PERFORM_RESPAWN;
            enum$VALUES[EnumState.llIIllIlllIlIl[1]] = EnumState.REQUEST_STATS;
            enum$VALUES[EnumState.llIIllIlllIlIl[2]] = EnumState.OPEN_INVENTORY_ACHIEVEMENT;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static String lIIIllllIIlIlIII(final String llllllllllllIllIllllllIlIllIllll, final String llllllllllllIllIllllllIlIlllIIII) {
            try {
                final SecretKeySpec llllllllllllIllIllllllIlIlllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllllllIlIlllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIllllllIlIlllIIll = Cipher.getInstance("Blowfish");
                llllllllllllIllIllllllIlIlllIIll.init(EnumState.llIIllIlllIlIl[2], llllllllllllIllIllllllIlIlllIlII);
                return new String(llllllllllllIllIllllllIlIlllIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIllllllIlIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIllllllIlIlllIIlI) {
                llllllllllllIllIllllllIlIlllIIlI.printStackTrace();
                return null;
            }
        }
        
        private static void lIIIllllIIlIlIlI() {
            (llIIllIlllIlIl = new int[4])[0] = ((19 + 129 - 51 + 50 ^ 77 + 70 + 22 + 29) & (133 + 98 - 114 + 27 ^ 73 + 54 - 77 + 147 ^ -" ".length()));
            EnumState.llIIllIlllIlIl[1] = " ".length();
            EnumState.llIIllIlllIlIl[2] = "  ".length();
            EnumState.llIIllIlllIlIl[3] = "   ".length();
        }
        
        private static boolean lIIIllllIIlIlIll(final int llllllllllllIllIllllllIlIlIlIIIl, final int llllllllllllIllIllllllIlIlIlIIII) {
            return llllllllllllIllIllllllIlIlIlIIIl < llllllllllllIllIllllllIlIlIlIIII;
        }
        
        private EnumState(final String llllllllllllIllIllllllIllIIIIIlI, final int llllllllllllIllIllllllIllIIIIIIl) {
        }
        
        private static String lIIIllllIIlIIlll(String llllllllllllIllIllllllIlIlIlllII, final String llllllllllllIllIllllllIlIlIllIll) {
            llllllllllllIllIllllllIlIlIlllII = new String(Base64.getDecoder().decode(llllllllllllIllIllllllIlIlIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIllllllIlIlIlllll = new StringBuilder();
            final char[] llllllllllllIllIllllllIlIlIllllI = llllllllllllIllIllllllIlIlIllIll.toCharArray();
            int llllllllllllIllIllllllIlIlIlllIl = EnumState.llIIllIlllIlIl[0];
            final String llllllllllllIllIllllllIlIlIlIlll = (Object)llllllllllllIllIllllllIlIlIlllII.toCharArray();
            final short llllllllllllIllIllllllIlIlIlIllI = (short)llllllllllllIllIllllllIlIlIlIlll.length;
            String llllllllllllIllIllllllIlIlIlIlIl = (String)EnumState.llIIllIlllIlIl[0];
            while (lIIIllllIIlIlIll((int)llllllllllllIllIllllllIlIlIlIlIl, llllllllllllIllIllllllIlIlIlIllI)) {
                final char llllllllllllIllIllllllIlIllIIIlI = llllllllllllIllIllllllIlIlIlIlll[llllllllllllIllIllllllIlIlIlIlIl];
                llllllllllllIllIllllllIlIlIlllll.append((char)(llllllllllllIllIllllllIlIllIIIlI ^ llllllllllllIllIllllllIlIlIllllI[llllllllllllIllIllllllIlIlIlllIl % llllllllllllIllIllllllIlIlIllllI.length]));
                "".length();
                ++llllllllllllIllIllllllIlIlIlllIl;
                ++llllllllllllIllIllllllIlIlIlIlIl;
                "".length();
                if (((0xF3 ^ 0x92) & ~(0xE8 ^ 0x89)) != 0x0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIllllllIlIlIlllll);
        }
        
        private static void lIIIllllIIlIlIIl() {
            (llIIllIlllIlII = new String[EnumState.llIIllIlllIlIl[3]])[EnumState.llIIllIlllIlIl[0]] = lIIIllllIIlIIlll("OwIWHzo5ChsLMDgXBQ47", "kGDYu");
            EnumState.llIIllIlllIlII[EnumState.llIIllIlllIlIl[1]] = lIIIllllIIlIlIII("c1/EOGrJ/0wNAEVUb47Xxw==", "rOqCP");
            EnumState.llIIllIlllIlII[EnumState.llIIllIlllIlIl[2]] = lIIIllllIIlIlIII("ec/ZBCbXJ5cIM8LBNKh+fcnjI9yEzLp5oVCdTSExkdM=", "lZHIT");
        }
    }
}
