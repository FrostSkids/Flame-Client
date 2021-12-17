// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Collection;
import net.minecraft.world.storage.MapData;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.util.Vec4b;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S34PacketMaps implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int mapMaxY;
    private /* synthetic */ int mapMaxX;
    private /* synthetic */ int mapMinX;
    private /* synthetic */ byte mapScale;
    private /* synthetic */ int mapMinY;
    private static final /* synthetic */ int[] lIllllIIIIIlII;
    private /* synthetic */ Vec4b[] mapVisiblePlayersVec4b;
    private /* synthetic */ int mapId;
    private static final /* synthetic */ String[] lIllllIIIIIIll;
    private /* synthetic */ byte[] mapDataBytes;
    
    private static void lIIIIIlllIlIlIlI() {
        (lIllllIIIIIlII = new int[6])[0] = ((0x8E ^ 0xA3 ^ (0xBE ^ 0x99)) & (0xFD ^ 0xC0 ^ (0x9A ^ 0xAD) ^ -" ".length()));
        S34PacketMaps.lIllllIIIIIlII[1] = 100 + 120 - 176 + 84;
        S34PacketMaps.lIllllIIIIIlII[2] = (0xB5 ^ 0x9F ^ (0x87 ^ 0xA9));
        S34PacketMaps.lIllllIIIIIlII[3] = (0x2D ^ 0x22);
        S34PacketMaps.lIllllIIIIIlII[4] = " ".length();
        S34PacketMaps.lIllllIIIIIlII[5] = "  ".length();
    }
    
    static {
        lIIIIIlllIlIlIlI();
        lIIIIIlllIlIlIIl();
    }
    
    private static boolean lIIIIIlllIlIlIll(final int llllllllllllIllllIllIIllIIlIIIll, final int llllllllllllIllllIllIIllIIlIIIlI) {
        return llllllllllllIllllIllIIllIIlIIIll >= llllllllllllIllllIllIIllIIlIIIlI;
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllllIllIIllIlIlllll) throws IOException {
        this.mapId = llllllllllllIllllIllIIllIlIlllll.readVarIntFromBuffer();
        this.mapScale = llllllllllllIllllIllIIllIlIlllll.readByte();
        this.mapVisiblePlayersVec4b = new Vec4b[llllllllllllIllllIllIIllIlIlllll.readVarIntFromBuffer()];
        int llllllllllllIllllIllIIllIllIIIlI = S34PacketMaps.lIllllIIIIIlII[0];
        "".length();
        if (-" ".length() >= (0x17 ^ 0x13)) {
            return;
        }
        while (!lIIIIIlllIlIlIll(llllllllllllIllllIllIIllIllIIIlI, this.mapVisiblePlayersVec4b.length)) {
            final short llllllllllllIllllIllIIllIllIIIIl = llllllllllllIllllIllIIllIlIlllll.readByte();
            this.mapVisiblePlayersVec4b[llllllllllllIllllIllIIllIllIIIlI] = new Vec4b((byte)(llllllllllllIllllIllIIllIllIIIIl >> S34PacketMaps.lIllllIIIIIlII[2] & S34PacketMaps.lIllllIIIIIlII[3]), llllllllllllIllllIllIIllIlIlllll.readByte(), llllllllllllIllllIllIIllIlIlllll.readByte(), (byte)(llllllllllllIllllIllIIllIllIIIIl & S34PacketMaps.lIllllIIIIIlII[3]));
            ++llllllllllllIllllIllIIllIllIIIlI;
        }
        this.mapMaxX = llllllllllllIllllIllIIllIlIlllll.readUnsignedByte();
        if (lIIIIIlllIlIllII(this.mapMaxX)) {
            this.mapMaxY = llllllllllllIllllIllIIllIlIlllll.readUnsignedByte();
            this.mapMinX = llllllllllllIllllIllIIllIlIlllll.readUnsignedByte();
            this.mapMinY = llllllllllllIllllIllIIllIlIlllll.readUnsignedByte();
            this.mapDataBytes = llllllllllllIllllIllIIllIlIlllll.readByteArray();
        }
    }
    
    private static boolean lIIIIIlllIlIllII(final int llllllllllllIllllIllIIllIIlIIIII) {
        return llllllllllllIllllIllIIllIIlIIIII > 0;
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllllIllIIllIlIlIlIl) throws IOException {
        llllllllllllIllllIllIIllIlIlIlIl.writeVarIntToBuffer(this.mapId);
        llllllllllllIllllIllIIllIlIlIlIl.writeByte(this.mapScale);
        "".length();
        llllllllllllIllllIllIIllIlIlIlIl.writeVarIntToBuffer(this.mapVisiblePlayersVec4b.length);
        final char llllllllllllIllllIllIIllIlIIlllI;
        final char llllllllllllIllllIllIIllIlIIllll = (char)((Vec4b[])(Object)(llllllllllllIllllIllIIllIlIIlllI = (char)(Object)this.mapVisiblePlayersVec4b)).length;
        char llllllllllllIllllIllIIllIlIlIIII = (char)S34PacketMaps.lIllllIIIIIlII[0];
        "".length();
        if ("   ".length() == 0) {
            return;
        }
        while (!lIIIIIlllIlIlIll(llllllllllllIllllIllIIllIlIlIIII, llllllllllllIllllIllIIllIlIIllll)) {
            final Vec4b llllllllllllIllllIllIIllIlIlIlII = llllllllllllIllllIllIIllIlIIlllI[llllllllllllIllllIllIIllIlIlIIII];
            llllllllllllIllllIllIIllIlIlIlIl.writeByte((llllllllllllIllllIllIIllIlIlIlII.func_176110_a() & S34PacketMaps.lIllllIIIIIlII[3]) << S34PacketMaps.lIllllIIIIIlII[2] | (llllllllllllIllllIllIIllIlIlIlII.func_176111_d() & S34PacketMaps.lIllllIIIIIlII[3]));
            "".length();
            llllllllllllIllllIllIIllIlIlIlIl.writeByte(llllllllllllIllllIllIIllIlIlIlII.func_176112_b());
            "".length();
            llllllllllllIllllIllIIllIlIlIlIl.writeByte(llllllllllllIllllIllIIllIlIlIlII.func_176113_c());
            "".length();
            ++llllllllllllIllllIllIIllIlIlIIII;
        }
        llllllllllllIllllIllIIllIlIlIlIl.writeByte(this.mapMaxX);
        "".length();
        if (lIIIIIlllIlIllII(this.mapMaxX)) {
            llllllllllllIllllIllIIllIlIlIlIl.writeByte(this.mapMaxY);
            "".length();
            llllllllllllIllllIllIIllIlIlIlIl.writeByte(this.mapMinX);
            "".length();
            llllllllllllIllllIllIIllIlIlIlIl.writeByte(this.mapMinY);
            "".length();
            llllllllllllIllllIllIIllIlIlIlIl.writeByteArray(this.mapDataBytes);
        }
    }
    
    public S34PacketMaps() {
    }
    
    public void setMapdataTo(final MapData llllllllllllIllllIllIIllIIllllll) {
        llllllllllllIllllIllIIllIIllllll.scale = this.mapScale;
        llllllllllllIllllIllIIllIIllllll.mapDecorations.clear();
        int llllllllllllIllllIllIIllIIlllllI = S34PacketMaps.lIllllIIIIIlII[0];
        "".length();
        if (((0x9E ^ 0xC6 ^ (0xA6 ^ 0x9E)) & (0x97 ^ 0xB5 ^ (0x16 ^ 0x54) ^ -" ".length())) != ((((0x90 ^ 0x82) & ~(0x56 ^ 0x44)) ^ (0xE4 ^ 0xA5)) & (232 + 6 - 9 + 8 ^ 79 + 35 - 46 + 104 ^ -" ".length()))) {
            return;
        }
        while (!lIIIIIlllIlIlIll(llllllllllllIllllIllIIllIIlllllI, this.mapVisiblePlayersVec4b.length)) {
            final Vec4b llllllllllllIllllIllIIllIIllllIl = this.mapVisiblePlayersVec4b[llllllllllllIllllIllIIllIIlllllI];
            llllllllllllIllllIllIIllIIllllll.mapDecorations.put(String.valueOf(new StringBuilder(S34PacketMaps.lIllllIIIIIIll[S34PacketMaps.lIllllIIIIIlII[0]]).append(llllllllllllIllllIllIIllIIlllllI)), llllllllllllIllllIllIIllIIllllIl);
            "".length();
            ++llllllllllllIllllIllIIllIIlllllI;
        }
        int llllllllllllIllllIllIIllIIllllII = S34PacketMaps.lIllllIIIIIlII[0];
        "".length();
        if (-" ".length() == (0xAB ^ 0xAF)) {
            return;
        }
        while (!lIIIIIlllIlIlIll(llllllllllllIllllIllIIllIIllllII, this.mapMaxX)) {
            int llllllllllllIllllIllIIllIIlllIll = S34PacketMaps.lIllllIIIIIlII[0];
            "".length();
            if (((0x10 ^ 0x77 ^ (0x79 ^ 0x26)) & (43 + 86 - 95 + 127 ^ 28 + 89 - 52 + 88 ^ -" ".length())) != 0x0) {
                return;
            }
            while (!lIIIIIlllIlIlIll(llllllllllllIllllIllIIllIIlllIll, this.mapMaxY)) {
                llllllllllllIllllIllIIllIIllllll.colors[this.mapMinX + llllllllllllIllllIllIIllIIllllII + (this.mapMinY + llllllllllllIllllIllIIllIIlllIll) * S34PacketMaps.lIllllIIIIIlII[1]] = this.mapDataBytes[llllllllllllIllllIllIIllIIllllII + llllllllllllIllllIllIIllIIlllIll * this.mapMaxX];
                ++llllllllllllIllllIllIIllIIlllIll;
            }
            ++llllllllllllIllllIllIIllIIllllII;
        }
    }
    
    public int getMapId() {
        return this.mapId;
    }
    
    public S34PacketMaps(final int llllllllllllIllllIllIIllIlllllIl, final byte llllllllllllIllllIllIIllIlllIIIl, final Collection<Vec4b> llllllllllllIllllIllIIllIllllIll, final byte[] llllllllllllIllllIllIIllIllIllll, final int llllllllllllIllllIllIIllIllllIIl, final int llllllllllllIllllIllIIllIllIllIl, final int llllllllllllIllllIllIIllIlllIlll, final int llllllllllllIllllIllIIllIllIlIll) {
        this.mapId = llllllllllllIllllIllIIllIlllllIl;
        this.mapScale = llllllllllllIllllIllIIllIlllIIIl;
        this.mapVisiblePlayersVec4b = llllllllllllIllllIllIIllIllllIll.toArray(new Vec4b[llllllllllllIllllIllIIllIllllIll.size()]);
        this.mapMinX = llllllllllllIllllIllIIllIllllIIl;
        this.mapMinY = llllllllllllIllllIllIIllIllIllIl;
        this.mapMaxX = llllllllllllIllllIllIIllIlllIlll;
        this.mapMaxY = llllllllllllIllllIllIIllIllIlIll;
        this.mapDataBytes = new byte[llllllllllllIllllIllIIllIlllIlll * llllllllllllIllllIllIIllIllIlIll];
        int llllllllllllIllllIllIIllIlllIlIl = S34PacketMaps.lIllllIIIIIlII[0];
        "".length();
        if (((0x48 ^ 0x76) & ~(0xB5 ^ 0x8B)) < 0) {
            throw null;
        }
        while (!lIIIIIlllIlIlIll(llllllllllllIllllIllIIllIlllIlIl, llllllllllllIllllIllIIllIlllIlll)) {
            int llllllllllllIllllIllIIllIlllIlII = S34PacketMaps.lIllllIIIIIlII[0];
            "".length();
            if ("   ".length() != "   ".length()) {
                throw null;
            }
            while (!lIIIIIlllIlIlIll(llllllllllllIllllIllIIllIlllIlII, llllllllllllIllllIllIIllIllIlIll)) {
                this.mapDataBytes[llllllllllllIllllIllIIllIlllIlIl + llllllllllllIllllIllIIllIlllIlII * llllllllllllIllllIllIIllIlllIlll] = llllllllllllIllllIllIIllIllIllll[llllllllllllIllllIllIIllIllllIIl + llllllllllllIllllIllIIllIlllIlIl + (llllllllllllIllllIllIIllIllIllIl + llllllllllllIllllIllIIllIlllIlII) * S34PacketMaps.lIllllIIIIIlII[1]];
                ++llllllllllllIllllIllIIllIlllIlII;
            }
            ++llllllllllllIllllIllIIllIlllIlIl;
        }
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIllllIllIIllIlIIlIlI) {
        llllllllllllIllllIllIIllIlIIlIlI.handleMaps(this);
    }
    
    private static void lIIIIIlllIlIlIIl() {
        (lIllllIIIIIIll = new String[S34PacketMaps.lIllllIIIIIlII[4]])[S34PacketMaps.lIllllIIIIIlII[0]] = lIIIIIlllIlIIlll("B0xIO8bkCUs=", "vYHsI");
    }
    
    private static String lIIIIIlllIlIIlll(final String llllllllllllIllllIllIIllIIlIlIIl, final String llllllllllllIllllIllIIllIIlIlIII) {
        try {
            final SecretKeySpec llllllllllllIllllIllIIllIIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIllIIllIIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIllIIllIIlIllIl = Cipher.getInstance("Blowfish");
            llllllllllllIllllIllIIllIIlIllIl.init(S34PacketMaps.lIllllIIIIIlII[5], llllllllllllIllllIllIIllIIlIlllI);
            return new String(llllllllllllIllllIllIIllIIlIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIllIIllIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIllIIllIIlIllII) {
            llllllllllllIllllIllIIllIIlIllII.printStackTrace();
            return null;
        }
    }
}
