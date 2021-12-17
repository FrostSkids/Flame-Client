// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.world.World;
import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.block.Block;
import net.minecraft.network.PacketBuffer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S23PacketBlockChange implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ BlockPos blockPosition;
    private /* synthetic */ IBlockState blockState;
    
    public IBlockState getBlockState() {
        return this.blockState;
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIlIlIIlIIIIIlIlIll) throws IOException {
        this.blockPosition = lllllllllllllIIlIlIIlIIIIIlIlIll.readBlockPos();
        this.blockState = Block.BLOCK_STATE_IDS.getByValue(lllllllllllllIIlIlIIlIIIIIlIlIll.readVarIntFromBuffer());
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIlIlIIlIIIIIlIIIll) throws IOException {
        lllllllllllllIIlIlIIlIIIIIlIIIll.writeBlockPos(this.blockPosition);
        lllllllllllllIIlIlIIlIIIIIlIIIll.writeVarIntToBuffer(Block.BLOCK_STATE_IDS.get(this.blockState));
    }
    
    public S23PacketBlockChange(final World lllllllllllllIIlIlIIlIIIIIllIIII, final BlockPos lllllllllllllIIlIlIIlIIIIIllIIlI) {
        this.blockPosition = lllllllllllllIIlIlIIlIIIIIllIIlI;
        this.blockState = lllllllllllllIIlIlIIlIIIIIllIIII.getBlockState(lllllllllllllIIlIlIIlIIIIIllIIlI);
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIIlIlIIlIIIIIIlllIl) {
        lllllllllllllIIlIlIIlIIIIIIlllIl.handleBlockChange(this);
    }
    
    public S23PacketBlockChange() {
    }
    
    public BlockPos getBlockPosition() {
        return this.blockPosition;
    }
}
