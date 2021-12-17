// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S41PacketServerDifficulty implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ EnumDifficulty difficulty;
    private /* synthetic */ boolean difficultyLocked;
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlllIIIIIllIlllllIII) throws IOException {
        this.difficulty = EnumDifficulty.getDifficultyEnum(llllllllllllIlllIIIIIllIlllllIII.readUnsignedByte());
    }
    
    public S41PacketServerDifficulty() {
    }
    
    public boolean isDifficultyLocked() {
        return this.difficultyLocked;
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlllIIIIIllIllllIlII) throws IOException {
        llllllllllllIlllIIIIIllIllllIlII.writeByte(this.difficulty.getDifficultyId());
        "".length();
    }
    
    public S41PacketServerDifficulty(final EnumDifficulty llllllllllllIlllIIIIIlllIIIIlIII, final boolean llllllllllllIlllIIIIIlllIIIIIlll) {
        this.difficulty = llllllllllllIlllIIIIIlllIIIIlIII;
        this.difficultyLocked = llllllllllllIlllIIIIIlllIIIIIlll;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIlllIIIIIlllIIIIIIII) {
        llllllllllllIlllIIIIIlllIIIIIIII.handleServerDifficulty(this);
    }
    
    public EnumDifficulty getDifficulty() {
        return this.difficulty;
    }
}
