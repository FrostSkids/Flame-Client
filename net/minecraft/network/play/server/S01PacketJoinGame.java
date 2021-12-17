// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.WorldType;
import net.minecraft.world.WorldSettings;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S01PacketJoinGame implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int maxPlayers;
    private /* synthetic */ int dimension;
    private static final /* synthetic */ int[] lIIIIIIIIIIIII;
    private /* synthetic */ WorldSettings.GameType gameType;
    private /* synthetic */ int entityId;
    private /* synthetic */ boolean reducedDebugInfo;
    private /* synthetic */ WorldType worldType;
    private /* synthetic */ EnumDifficulty difficulty;
    private /* synthetic */ boolean hardcoreMode;
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIlIlIIlIlIIlIllIIIl) throws IOException {
        this.entityId = lllllllllllllIlIlIIlIlIIlIllIIIl.readInt();
        int lllllllllllllIlIlIIlIlIIlIllIIll = lllllllllllllIlIlIIlIlIIlIllIIIl.readUnsignedByte();
        int hardcoreMode;
        if (lIllIIlIIllIllI(lllllllllllllIlIlIIlIlIIlIllIIll & S01PacketJoinGame.lIIIIIIIIIIIII[0], S01PacketJoinGame.lIIIIIIIIIIIII[0])) {
            hardcoreMode = S01PacketJoinGame.lIIIIIIIIIIIII[1];
            "".length();
            if ((0x14 ^ 0x10) != (0x6D ^ 0x69)) {
                return;
            }
        }
        else {
            hardcoreMode = S01PacketJoinGame.lIIIIIIIIIIIII[2];
        }
        this.hardcoreMode = (hardcoreMode != 0);
        lllllllllllllIlIlIIlIlIIlIllIIll &= S01PacketJoinGame.lIIIIIIIIIIIII[3];
        this.gameType = WorldSettings.GameType.getByID(lllllllllllllIlIlIIlIlIIlIllIIll);
        this.dimension = lllllllllllllIlIlIIlIlIIlIllIIIl.readByte();
        this.difficulty = EnumDifficulty.getDifficultyEnum(lllllllllllllIlIlIIlIlIIlIllIIIl.readUnsignedByte());
        this.maxPlayers = lllllllllllllIlIlIIlIlIIlIllIIIl.readUnsignedByte();
        this.worldType = WorldType.parseWorldType(lllllllllllllIlIlIIlIlIIlIllIIIl.readStringFromBuffer(S01PacketJoinGame.lIIIIIIIIIIIII[4]));
        if (lIllIIlIIllIlll(this.worldType)) {
            this.worldType = WorldType.DEFAULT;
        }
        this.reducedDebugInfo = lllllllllllllIlIlIIlIlIIlIllIIIl.readBoolean();
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIlIlIIlIlIIlIlIlIll) throws IOException {
        lllllllllllllIlIlIIlIlIIlIlIlIll.writeInt(this.entityId);
        "".length();
        int lllllllllllllIlIlIIlIlIIlIlIlIlI = this.gameType.getID();
        if (lIllIIlIIlllIII(this.hardcoreMode ? 1 : 0)) {
            lllllllllllllIlIlIIlIlIIlIlIlIlI |= S01PacketJoinGame.lIIIIIIIIIIIII[0];
        }
        lllllllllllllIlIlIIlIlIIlIlIlIll.writeByte(lllllllllllllIlIlIIlIlIIlIlIlIlI);
        "".length();
        lllllllllllllIlIlIIlIlIIlIlIlIll.writeByte(this.dimension);
        "".length();
        lllllllllllllIlIlIIlIlIIlIlIlIll.writeByte(this.difficulty.getDifficultyId());
        "".length();
        lllllllllllllIlIlIIlIlIIlIlIlIll.writeByte(this.maxPlayers);
        "".length();
        lllllllllllllIlIlIIlIlIIlIlIlIll.writeString(this.worldType.getWorldTypeName());
        "".length();
        lllllllllllllIlIlIIlIlIIlIlIlIll.writeBoolean(this.reducedDebugInfo);
        "".length();
    }
    
    public EnumDifficulty getDifficulty() {
        return this.difficulty;
    }
    
    public WorldSettings.GameType getGameType() {
        return this.gameType;
    }
    
    static {
        lIllIIlIIllIlIl();
    }
    
    private static void lIllIIlIIllIlIl() {
        (lIIIIIIIIIIIII = new int[5])[0] = (0xED ^ 0x86 ^ (0x6E ^ 0xD));
        S01PacketJoinGame.lIIIIIIIIIIIII[1] = " ".length();
        S01PacketJoinGame.lIIIIIIIIIIIII[2] = ((0x8E ^ 0xA5 ^ (0xE9 ^ 0x9D)) & (0x12 ^ 0x60 ^ (0x2 ^ 0x2F) ^ -" ".length()));
        S01PacketJoinGame.lIIIIIIIIIIIII[3] = -(27 + 52 - 39 + 99 ^ 64 + 26 - 67 + 107);
        S01PacketJoinGame.lIIIIIIIIIIIII[4] = (0x71 ^ 0x61);
    }
    
    private static boolean lIllIIlIIllIllI(final int lllllllllllllIlIlIIlIlIIlIIIIIlI, final int lllllllllllllIlIlIIlIlIIlIIIIIIl) {
        return lllllllllllllIlIlIIlIlIIlIIIIIlI == lllllllllllllIlIlIIlIlIIlIIIIIIl;
    }
    
    public int getEntityId() {
        return this.entityId;
    }
    
    public int getMaxPlayers() {
        return this.maxPlayers;
    }
    
    public S01PacketJoinGame() {
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIlIlIIlIlIIlIlIIIll) {
        lllllllllllllIlIlIIlIlIIlIlIIIll.handleJoinGame(this);
    }
    
    public S01PacketJoinGame(final int lllllllllllllIlIlIIlIlIIllIIIIII, final WorldSettings.GameType lllllllllllllIlIlIIlIlIIllIIlIII, final boolean lllllllllllllIlIlIIlIlIIlIlllllI, final int lllllllllllllIlIlIIlIlIIllIIIllI, final EnumDifficulty lllllllllllllIlIlIIlIlIIlIllllII, final int lllllllllllllIlIlIIlIlIIllIIIlII, final WorldType lllllllllllllIlIlIIlIlIIllIIIIll, final boolean lllllllllllllIlIlIIlIlIIlIlllIIl) {
        this.entityId = lllllllllllllIlIlIIlIlIIllIIIIII;
        this.dimension = lllllllllllllIlIlIIlIlIIllIIIllI;
        this.difficulty = lllllllllllllIlIlIIlIlIIlIllllII;
        this.gameType = lllllllllllllIlIlIIlIlIIllIIlIII;
        this.maxPlayers = lllllllllllllIlIlIIlIlIIllIIIlII;
        this.hardcoreMode = lllllllllllllIlIlIIlIlIIlIlllllI;
        this.worldType = lllllllllllllIlIlIIlIlIIllIIIIll;
        this.reducedDebugInfo = lllllllllllllIlIlIIlIlIIlIlllIIl;
    }
    
    public boolean isReducedDebugInfo() {
        return this.reducedDebugInfo;
    }
    
    private static boolean lIllIIlIIlllIII(final int lllllllllllllIlIlIIlIlIIIlllllIl) {
        return lllllllllllllIlIlIIlIlIIIlllllIl != 0;
    }
    
    public boolean isHardcoreMode() {
        return this.hardcoreMode;
    }
    
    private static boolean lIllIIlIIllIlll(final Object lllllllllllllIlIlIIlIlIIIlllllll) {
        return lllllllllllllIlIlIIlIlIIIlllllll == null;
    }
    
    public int getDimension() {
        return this.dimension;
    }
    
    public WorldType getWorldType() {
        return this.worldType;
    }
}
