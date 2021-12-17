// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.client;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.network.play.INetHandlerPlayServer;
import net.minecraft.network.Packet;

public class C07PacketPlayerDigging implements Packet<INetHandlerPlayServer>
{
    private /* synthetic */ Action status;
    private /* synthetic */ BlockPos position;
    private /* synthetic */ EnumFacing facing;
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIlIIlIIIlIllIlIIIl) throws IOException {
        lllllllllllllIIlIIlIIIlIllIlIIIl.writeEnumValue(this.status);
        lllllllllllllIIlIIlIIIlIllIlIIIl.writeBlockPos(this.position);
        lllllllllllllIIlIIlIIIlIllIlIIIl.writeByte(this.facing.getIndex());
        "".length();
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIlIIlIIIlIllIlIlll) throws IOException {
        this.status = lllllllllllllIIlIIlIIIlIllIlIlll.readEnumValue(Action.class);
        this.position = lllllllllllllIIlIIlIIIlIllIlIlll.readBlockPos();
        this.facing = EnumFacing.getFront(lllllllllllllIIlIIlIIIlIllIlIlll.readUnsignedByte());
    }
    
    public Action getStatus() {
        return this.status;
    }
    
    public C07PacketPlayerDigging(final Action lllllllllllllIIlIIlIIIlIlllIIIIl, final BlockPos lllllllllllllIIlIIlIIIlIlllIIIII, final EnumFacing lllllllllllllIIlIIlIIIlIllIlllll) {
        this.status = lllllllllllllIIlIIlIIIlIlllIIIIl;
        this.position = lllllllllllllIIlIIlIIIlIlllIIIII;
        this.facing = lllllllllllllIIlIIlIIIlIllIlllll;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayServer lllllllllllllIIlIIlIIIlIllIIlIIl) {
        lllllllllllllIIlIIlIIIlIllIIlIIl.processPlayerDigging(this);
    }
    
    public EnumFacing getFacing() {
        return this.facing;
    }
    
    public BlockPos getPosition() {
        return this.position;
    }
    
    public C07PacketPlayerDigging() {
    }
    
    public enum Action
    {
        private static final /* synthetic */ int[] llIlIlIlIIIIII;
        
        ABORT_DESTROY_BLOCK(Action.llIlIlIIllllIl[Action.llIlIlIlIIIIII[1]], Action.llIlIlIlIIIIII[1]), 
        DROP_ALL_ITEMS(Action.llIlIlIIllllIl[Action.llIlIlIlIIIIII[3]], Action.llIlIlIlIIIIII[3]), 
        DROP_ITEM(Action.llIlIlIIllllIl[Action.llIlIlIlIIIIII[4]], Action.llIlIlIlIIIIII[4]), 
        STOP_DESTROY_BLOCK(Action.llIlIlIIllllIl[Action.llIlIlIlIIIIII[2]], Action.llIlIlIlIIIIII[2]), 
        RELEASE_USE_ITEM(Action.llIlIlIIllllIl[Action.llIlIlIlIIIIII[5]], Action.llIlIlIlIIIIII[5]), 
        START_DESTROY_BLOCK(Action.llIlIlIIllllIl[Action.llIlIlIlIIIIII[0]], Action.llIlIlIlIIIIII[0]);
        
        private static final /* synthetic */ String[] llIlIlIIllllIl;
        
        private static String lIIlIlIIIIIlllII(final String llllllllllllIllIlIlIlIIlIIlIIlll, final String llllllllllllIllIlIlIlIIlIIlIIlII) {
            try {
                final SecretKeySpec llllllllllllIllIlIlIlIIlIIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIlIIlIIlIIlII.getBytes(StandardCharsets.UTF_8)), Action.llIlIlIlIIIIII[7]), "DES");
                final Cipher llllllllllllIllIlIlIlIIlIIlIlIIl = Cipher.getInstance("DES");
                llllllllllllIllIlIlIlIIlIIlIlIIl.init(Action.llIlIlIlIIIIII[2], llllllllllllIllIlIlIlIIlIIlIlIlI);
                return new String(llllllllllllIllIlIlIlIIlIIlIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIlIIlIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlIlIlIIlIIlIlIII) {
                llllllllllllIllIlIlIlIIlIIlIlIII.printStackTrace();
                return null;
            }
        }
        
        private Action(final String llllllllllllIllIlIlIlIIlIlIlllIl, final int llllllllllllIllIlIlIlIIlIlIlllII) {
        }
        
        private static String lIIlIlIIIIIlllIl(final String llllllllllllIllIlIlIlIIlIIllIIlI, final String llllllllllllIllIlIlIlIIlIIllIIll) {
            try {
                final SecretKeySpec llllllllllllIllIlIlIlIIlIIllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIlIIlIIllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIlIlIlIIlIIllIllI = Cipher.getInstance("Blowfish");
                llllllllllllIllIlIlIlIIlIIllIllI.init(Action.llIlIlIlIIIIII[2], llllllllllllIllIlIlIlIIlIIllIlll);
                return new String(llllllllllllIllIlIlIlIIlIIllIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIlIIlIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlIlIlIIlIIllIlIl) {
                llllllllllllIllIlIlIlIIlIIllIlIl.printStackTrace();
                return null;
            }
        }
        
        private static String lIIlIlIIIIlIIIIl(String llllllllllllIllIlIlIlIIlIlIIIlII, final String llllllllllllIllIlIlIlIIlIlIIIIll) {
            llllllllllllIllIlIlIlIIlIlIIIlII = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIlIlIIlIlIIIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIlIlIlIIlIlIIIlll = new StringBuilder();
            final char[] llllllllllllIllIlIlIlIIlIlIIIllI = llllllllllllIllIlIlIlIIlIlIIIIll.toCharArray();
            int llllllllllllIllIlIlIlIIlIlIIIlIl = Action.llIlIlIlIIIIII[0];
            final short llllllllllllIllIlIlIlIIlIIllllll = (Object)((String)llllllllllllIllIlIlIlIIlIlIIIlII).toCharArray();
            final short llllllllllllIllIlIlIlIIlIIlllllI = (short)llllllllllllIllIlIlIlIIlIIllllll.length;
            long llllllllllllIllIlIlIlIIlIIllllIl = Action.llIlIlIlIIIIII[0];
            while (lIIlIlIIIIlIIlll((int)llllllllllllIllIlIlIlIIlIIllllIl, llllllllllllIllIlIlIlIIlIIlllllI)) {
                final char llllllllllllIllIlIlIlIIlIlIIlIlI = llllllllllllIllIlIlIlIIlIIllllll[llllllllllllIllIlIlIlIIlIIllllIl];
                llllllllllllIllIlIlIlIIlIlIIIlll.append((char)(llllllllllllIllIlIlIlIIlIlIIlIlI ^ llllllllllllIllIlIlIlIIlIlIIIllI[llllllllllllIllIlIlIlIIlIlIIIlIl % llllllllllllIllIlIlIlIIlIlIIIllI.length]));
                "".length();
                ++llllllllllllIllIlIlIlIIlIlIIIlIl;
                ++llllllllllllIllIlIlIlIIlIIllllIl;
                "".length();
                if ("   ".length() == ((26 + 107 + 16 + 38 ^ 69 + 65 - 33 + 81) & (107 + 3 - 94 + 122 ^ 6 + 32 - 2 + 99 ^ -" ".length()))) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIlIlIlIIlIlIIIlll);
        }
        
        private static void lIIlIlIIIIlIIllI() {
            (llIlIlIlIIIIII = new int[8])[0] = ((0x2 ^ 0x1D) & ~(0x7E ^ 0x61));
            Action.llIlIlIlIIIIII[1] = " ".length();
            Action.llIlIlIlIIIIII[2] = "  ".length();
            Action.llIlIlIlIIIIII[3] = "   ".length();
            Action.llIlIlIlIIIIII[4] = (0xBF ^ 0xBB);
            Action.llIlIlIlIIIIII[5] = (0x5 ^ 0x1C ^ (0x26 ^ 0x3A));
            Action.llIlIlIlIIIIII[6] = (0xA6 ^ 0xA0);
            Action.llIlIlIlIIIIII[7] = (0x4A ^ 0x2A ^ (0x1F ^ 0x77));
        }
        
        private static void lIIlIlIIIIlIIIlI() {
            (llIlIlIIllllIl = new String[Action.llIlIlIlIIIIII[6]])[Action.llIlIlIlIIIIII[0]] = lIIlIlIIIIIlllII("0GJnk5I1MZRyanQifv2uzrNA6uwfZrX8", "zulio");
            Action.llIlIlIIllllIl[Action.llIlIlIlIIIIII[1]] = lIIlIlIIIIIlllIl("yXM6E77AxpFNq8yK6pEY69nvFQyn1vEh", "gykZR");
            Action.llIlIlIIllllIl[Action.llIlIlIlIIIIII[2]] = lIIlIlIIIIIlllIl("JJAqk8SEiCBCuR1Plzz0H634Aeb6g1a3", "liQGM");
            Action.llIlIlIIllllIl[Action.llIlIlIlIIIIII[3]] = lIIlIlIIIIIlllII("69KseZUrbxxSsoSSIjFs+Q==", "ubczM");
            Action.llIlIlIIllllIl[Action.llIlIlIlIIIIII[4]] = lIIlIlIIIIlIIIIl("DBAkOQgBFi4k", "HBkiW");
            Action.llIlIlIIllllIl[Action.llIlIlIlIIIIII[5]] = lIIlIlIIIIlIIIIl("Gzc5DQQaNyodFgwtPBwABA==", "IruHE");
        }
        
        static {
            lIIlIlIIIIlIIllI();
            lIIlIlIIIIlIIIlI();
            final Action[] enum$VALUES = new Action[Action.llIlIlIlIIIIII[6]];
            enum$VALUES[Action.llIlIlIlIIIIII[0]] = Action.START_DESTROY_BLOCK;
            enum$VALUES[Action.llIlIlIlIIIIII[1]] = Action.ABORT_DESTROY_BLOCK;
            enum$VALUES[Action.llIlIlIlIIIIII[2]] = Action.STOP_DESTROY_BLOCK;
            enum$VALUES[Action.llIlIlIlIIIIII[3]] = Action.DROP_ALL_ITEMS;
            enum$VALUES[Action.llIlIlIlIIIIII[4]] = Action.DROP_ITEM;
            enum$VALUES[Action.llIlIlIlIIIIII[5]] = Action.RELEASE_USE_ITEM;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static boolean lIIlIlIIIIlIIlll(final int llllllllllllIllIlIlIlIIlIIIlllll, final int llllllllllllIllIlIlIlIIlIIIllllI) {
            return llllllllllllIllIlIlIlIIlIIIlllll < llllllllllllIllIlIlIlIIlIIIllllI;
        }
    }
}
