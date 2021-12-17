// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S2BPacketChangeGameState implements Packet<INetHandlerPlayClient>
{
    private static final /* synthetic */ int[] llIIIlIIIllllI;
    private /* synthetic */ float field_149141_c;
    private static final /* synthetic */ String[] llIIIlIIIIlIIl;
    private /* synthetic */ int state;
    
    private static String lIIIlIIIlIlIllIl(String llllllllllllIlllIllIIIIIlllIlIII, final String llllllllllllIlllIllIIIIIlllIIlll) {
        llllllllllllIlllIllIIIIIlllIlIII = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIllIIIIIlllIlIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIllIIIIIlllIlIll = new StringBuilder();
        final char[] llllllllllllIlllIllIIIIIlllIlIlI = llllllllllllIlllIllIIIIIlllIIlll.toCharArray();
        int llllllllllllIlllIllIIIIIlllIlIIl = S2BPacketChangeGameState.llIIIlIIIllllI[1];
        final char llllllllllllIlllIllIIIIIlllIIIll = (Object)((String)llllllllllllIlllIllIIIIIlllIlIII).toCharArray();
        final long llllllllllllIlllIllIIIIIlllIIIlI = llllllllllllIlllIllIIIIIlllIIIll.length;
        double llllllllllllIlllIllIIIIIlllIIIIl = S2BPacketChangeGameState.llIIIlIIIllllI[1];
        while (lIIIlIIIllllIlIl((int)llllllllllllIlllIllIIIIIlllIIIIl, (int)llllllllllllIlllIllIIIIIlllIIIlI)) {
            final char llllllllllllIlllIllIIIIIlllIlllI = llllllllllllIlllIllIIIIIlllIIIll[llllllllllllIlllIllIIIIIlllIIIIl];
            llllllllllllIlllIllIIIIIlllIlIll.append((char)(llllllllllllIlllIllIIIIIlllIlllI ^ llllllllllllIlllIllIIIIIlllIlIlI[llllllllllllIlllIllIIIIIlllIlIIl % llllllllllllIlllIllIIIIIlllIlIlI.length]));
            "".length();
            ++llllllllllllIlllIllIIIIIlllIlIIl;
            ++llllllllllllIlllIllIIIIIlllIIIIl;
            "".length();
            if (((0x4F ^ 0x78) & ~(0x28 ^ 0x1F)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIllIIIIIlllIlIll);
    }
    
    public int getGameState() {
        return this.state;
    }
    
    static {
        lIIIlIIIllllIlII();
        lIIIlIIIlIlIlllI();
        final String[] message_NAMES = new String[S2BPacketChangeGameState.llIIIlIIIllllI[0]];
        message_NAMES[S2BPacketChangeGameState.llIIIlIIIllllI[1]] = S2BPacketChangeGameState.llIIIlIIIIlIIl[S2BPacketChangeGameState.llIIIlIIIllllI[1]];
        MESSAGE_NAMES = message_NAMES;
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlllIllIIIIlIIIIlIlI) throws IOException {
        llllllllllllIlllIllIIIIlIIIIlIlI.writeByte(this.state);
        "".length();
        llllllllllllIlllIllIIIIlIIIIlIlI.writeFloat(this.field_149141_c);
        "".length();
    }
    
    private static boolean lIIIlIIIllllIlIl(final int llllllllllllIlllIllIIIIIllIlllIl, final int llllllllllllIlllIllIIIIIllIlllII) {
        return llllllllllllIlllIllIIIIIllIlllIl < llllllllllllIlllIllIIIIIllIlllII;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIlllIllIIIIlIIIIIIlI) {
        llllllllllllIlllIllIIIIlIIIIIIlI.handleChangeGameState(this);
    }
    
    public float func_149137_d() {
        return this.field_149141_c;
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlllIllIIIIlIIIlIIII) throws IOException {
        this.state = llllllllllllIlllIllIIIIlIIIlIIII.readUnsignedByte();
        this.field_149141_c = llllllllllllIlllIllIIIIlIIIlIIII.readFloat();
    }
    
    public S2BPacketChangeGameState() {
    }
    
    private static void lIIIlIIIlIlIlllI() {
        (llIIIlIIIIlIIl = new String[S2BPacketChangeGameState.llIIIlIIIllllI[0]])[S2BPacketChangeGameState.llIIIlIIIllllI[1]] = lIIIlIIIlIlIllIl("MjgHJmckNA9tJyklPSIlLzU=", "FQkCI");
    }
    
    public S2BPacketChangeGameState(final int llllllllllllIlllIllIIIIlIIIlIlIl, final float llllllllllllIlllIllIIIIlIIIlIlII) {
        this.state = llllllllllllIlllIllIIIIlIIIlIlIl;
        this.field_149141_c = llllllllllllIlllIllIIIIlIIIlIlII;
    }
    
    private static void lIIIlIIIllllIlII() {
        (llIIIlIIIllllI = new int[2])[0] = " ".length();
        S2BPacketChangeGameState.llIIIlIIIllllI[1] = ((0xA3 ^ 0xB9) & ~(0xDB ^ 0xC1));
    }
}
