// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.WorldType;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S07PacketRespawn implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ WorldType worldType;
    private static final /* synthetic */ int[] llIIIIIlllIlll;
    private /* synthetic */ WorldSettings.GameType gameType;
    private /* synthetic */ int dimensionID;
    private /* synthetic */ EnumDifficulty difficulty;
    
    public int getDimensionID() {
        return this.dimensionID;
    }
    
    public WorldSettings.GameType getGameType() {
        return this.gameType;
    }
    
    public EnumDifficulty getDifficulty() {
        return this.difficulty;
    }
    
    private static boolean lIIIIllllIIIIIII(final Object llllllllllllIlllIlllIlIlIIllllll) {
        return llllllllllllIlllIlllIlIlIIllllll == null;
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlllIlllIlIlIlIlIIll) throws IOException {
        llllllllllllIlllIlllIlIlIlIlIIll.writeInt(this.dimensionID);
        "".length();
        llllllllllllIlllIlllIlIlIlIlIIll.writeByte(this.difficulty.getDifficultyId());
        "".length();
        llllllllllllIlllIlllIlIlIlIlIIll.writeByte(this.gameType.getID());
        "".length();
        llllllllllllIlllIlllIlIlIlIlIIll.writeString(this.worldType.getWorldTypeName());
        "".length();
    }
    
    public S07PacketRespawn() {
    }
    
    public S07PacketRespawn(final int llllllllllllIlllIlllIlIlIllIlIll, final EnumDifficulty llllllllllllIlllIlllIlIlIllIIlIl, final WorldType llllllllllllIlllIlllIlIlIllIIlII, final WorldSettings.GameType llllllllllllIlllIlllIlIlIllIIIll) {
        this.dimensionID = llllllllllllIlllIlllIlIlIllIlIll;
        this.difficulty = llllllllllllIlllIlllIlIlIllIIlIl;
        this.gameType = llllllllllllIlllIlllIlIlIllIIIll;
        this.worldType = llllllllllllIlllIlllIlIlIllIIlII;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIlllIlllIlIlIlIlllll) {
        llllllllllllIlllIlllIlIlIlIlllll.handleRespawn(this);
    }
    
    static {
        lIIIIlllIllllllI();
    }
    
    private static void lIIIIlllIllllllI() {
        (llIIIIIlllIlll = new int[1])[0] = (0x28 ^ 0x38);
    }
    
    public WorldType getWorldType() {
        return this.worldType;
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlllIlllIlIlIlIllIIl) throws IOException {
        this.dimensionID = llllllllllllIlllIlllIlIlIlIllIIl.readInt();
        this.difficulty = EnumDifficulty.getDifficultyEnum(llllllllllllIlllIlllIlIlIlIllIIl.readUnsignedByte());
        this.gameType = WorldSettings.GameType.getByID(llllllllllllIlllIlllIlIlIlIllIIl.readUnsignedByte());
        this.worldType = WorldType.parseWorldType(llllllllllllIlllIlllIlIlIlIllIIl.readStringFromBuffer(S07PacketRespawn.llIIIIIlllIlll[0]));
        if (lIIIIllllIIIIIII(this.worldType)) {
            this.worldType = WorldType.DEFAULT;
        }
    }
}
