// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.network.play.INetHandlerPlayServer;
import net.minecraft.network.Packet;

public class C08PacketPlayerBlockPlacement implements Packet<INetHandlerPlayServer>
{
    private static final /* synthetic */ int[] llllIIlllllIl;
    private /* synthetic */ int placedBlockDirection;
    private /* synthetic */ float facingY;
    private /* synthetic */ BlockPos position;
    private /* synthetic */ float facingZ;
    private /* synthetic */ ItemStack stack;
    private /* synthetic */ float facingX;
    private static final /* synthetic */ BlockPos field_179726_a;
    
    public BlockPos getPosition() {
        return this.position;
    }
    
    private static boolean lIlIlIIlIllIIll(final Object lllllllllllllIlIlllIIIIllIIIlllI) {
        return lllllllllllllIlIlllIIIIllIIIlllI != null;
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIlIlllIIIIllIlIllII) throws IOException {
        lllllllllllllIlIlllIIIIllIlIllII.writeBlockPos(this.position);
        lllllllllllllIlIlllIIIIllIlIllII.writeByte(this.placedBlockDirection);
        "".length();
        lllllllllllllIlIlllIIIIllIlIllII.writeItemStackToBuffer(this.stack);
        lllllllllllllIlIlllIIIIllIlIllII.writeByte((int)(this.facingX * 16.0f));
        "".length();
        lllllllllllllIlIlllIIIIllIlIllII.writeByte((int)(this.facingY * 16.0f));
        "".length();
        lllllllllllllIlIlllIIIIllIlIllII.writeByte((int)(this.facingZ * 16.0f));
        "".length();
    }
    
    public float getPlacedBlockOffsetZ() {
        return this.facingZ;
    }
    
    public int getPlacedBlockDirection() {
        return this.placedBlockDirection;
    }
    
    static {
        lIlIlIIlIllIIlI();
        field_179726_a = new BlockPos(C08PacketPlayerBlockPlacement.llllIIlllllIl[0], C08PacketPlayerBlockPlacement.llllIIlllllIl[0], C08PacketPlayerBlockPlacement.llllIIlllllIl[0]);
    }
    
    public C08PacketPlayerBlockPlacement(final ItemStack lllllllllllllIlIlllIIIIlllIIllll) {
        this(C08PacketPlayerBlockPlacement.field_179726_a, C08PacketPlayerBlockPlacement.llllIIlllllIl[1], lllllllllllllIlIlllIIIIlllIIllll, 0.0f, 0.0f, 0.0f);
    }
    
    public ItemStack getStack() {
        return this.stack;
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIlIlllIIIIllIllIIlI) throws IOException {
        this.position = lllllllllllllIlIlllIIIIllIllIIlI.readBlockPos();
        this.placedBlockDirection = lllllllllllllIlIlllIIIIllIllIIlI.readUnsignedByte();
        this.stack = lllllllllllllIlIlllIIIIllIllIIlI.readItemStackFromBuffer();
        this.facingX = lllllllllllllIlIlllIIIIllIllIIlI.readUnsignedByte() / 16.0f;
        this.facingY = lllllllllllllIlIlllIIIIllIllIIlI.readUnsignedByte() / 16.0f;
        this.facingZ = lllllllllllllIlIlllIIIIllIllIIlI.readUnsignedByte() / 16.0f;
    }
    
    private static void lIlIlIIlIllIIlI() {
        (llllIIlllllIl = new int[2])[0] = -" ".length();
        C08PacketPlayerBlockPlacement.llllIIlllllIl[1] = 30 + 19 - 47 + 165 + (0x6C ^ 0x15) - (0x24 ^ 0x5F) + (0xC1 ^ 0x9B);
    }
    
    @Override
    public void processPacket(final INetHandlerPlayServer lllllllllllllIlIlllIIIIllIlIlIII) {
        lllllllllllllIlIlllIIIIllIlIlIII.processPlayerBlockPlacement(this);
    }
    
    public C08PacketPlayerBlockPlacement() {
    }
    
    public C08PacketPlayerBlockPlacement(final BlockPos lllllllllllllIlIlllIIIIllIllllIl, final int lllllllllllllIlIlllIIIIllIllllII, final ItemStack lllllllllllllIlIlllIIIIllIlllIll, final float lllllllllllllIlIlllIIIIllIlllIlI, final float lllllllllllllIlIlllIIIIllIlllIIl, final float lllllllllllllIlIlllIIIIllIllllll) {
        this.position = lllllllllllllIlIlllIIIIllIllllIl;
        this.placedBlockDirection = lllllllllllllIlIlllIIIIllIllllII;
        ItemStack copy;
        if (lIlIlIIlIllIIll(lllllllllllllIlIlllIIIIllIlllIll)) {
            copy = lllllllllllllIlIlllIIIIllIlllIll.copy();
            "".length();
            if (null != null) {
                throw null;
            }
        }
        else {
            copy = null;
        }
        this.stack = copy;
        this.facingX = lllllllllllllIlIlllIIIIllIlllIlI;
        this.facingY = lllllllllllllIlIlllIIIIllIlllIIl;
        this.facingZ = lllllllllllllIlIlllIIIIllIllllll;
    }
    
    public float getPlacedBlockOffsetX() {
        return this.facingX;
    }
    
    public float getPlacedBlockOffsetY() {
        return this.facingY;
    }
}
