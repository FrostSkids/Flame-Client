// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.player.EntityPlayer;
import java.util.List;
import java.util.UUID;
import net.minecraft.entity.DataWatcher;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S0CPacketSpawnPlayer implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ DataWatcher watcher;
    private /* synthetic */ UUID playerId;
    private /* synthetic */ byte pitch;
    private /* synthetic */ int z;
    private /* synthetic */ List<DataWatcher.WatchableObject> field_148958_j;
    private /* synthetic */ int entityId;
    private /* synthetic */ int x;
    private static final /* synthetic */ int[] llIIlIIIIIlllI;
    private /* synthetic */ int currentItem;
    private /* synthetic */ byte yaw;
    private /* synthetic */ int y;
    
    public S0CPacketSpawnPlayer() {
    }
    
    public UUID getPlayer() {
        return this.playerId;
    }
    
    public S0CPacketSpawnPlayer(final EntityPlayer llllllllllllIlllIIllIllllllllIlI) {
        this.entityId = llllllllllllIlllIIllIllllllllIlI.getEntityId();
        this.playerId = llllllllllllIlllIIllIllllllllIlI.getGameProfile().getId();
        this.x = MathHelper.floor_double(llllllllllllIlllIIllIllllllllIlI.posX * 32.0);
        this.y = MathHelper.floor_double(llllllllllllIlllIIllIllllllllIlI.posY * 32.0);
        this.z = MathHelper.floor_double(llllllllllllIlllIIllIllllllllIlI.posZ * 32.0);
        this.yaw = (byte)(llllllllllllIlllIIllIllllllllIlI.rotationYaw * 256.0f / 360.0f);
        this.pitch = (byte)(llllllllllllIlllIIllIllllllllIlI.rotationPitch * 256.0f / 360.0f);
        final ItemStack llllllllllllIlllIIllIlllllllllII = llllllllllllIlllIIllIllllllllIlI.inventory.getCurrentItem();
        int idFromItem;
        if (lIIIlIlllIIIlIll(llllllllllllIlllIIllIlllllllllII)) {
            idFromItem = S0CPacketSpawnPlayer.llIIlIIIIIlllI[0];
            "".length();
            if (-(106 + 156 - 185 + 89 ^ 13 + 44 + 98 + 8) >= 0) {
                throw null;
            }
        }
        else {
            idFromItem = Item.getIdFromItem(llllllllllllIlllIIllIlllllllllII.getItem());
        }
        this.currentItem = idFromItem;
        this.watcher = llllllllllllIlllIIllIllllllllIlI.getDataWatcher();
    }
    
    public int getY() {
        return this.y;
    }
    
    public int getCurrentItemID() {
        return this.currentItem;
    }
    
    public int getX() {
        return this.x;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIlllIIllIllllllIlIIl) {
        llllllllllllIlllIIllIllllllIlIIl.handleSpawnPlayer(this);
    }
    
    public int getZ() {
        return this.z;
    }
    
    private static boolean lIIIlIlllIIIlIll(final Object llllllllllllIlllIIllIlllllIIIllI) {
        return llllllllllllIlllIIllIlllllIIIllI == null;
    }
    
    public int getEntityID() {
        return this.entityId;
    }
    
    public byte getPitch() {
        return this.pitch;
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlllIIllIllllllIllll) throws IOException {
        llllllllllllIlllIIllIllllllIllll.writeVarIntToBuffer(this.entityId);
        llllllllllllIlllIIllIllllllIllll.writeUuid(this.playerId);
        llllllllllllIlllIIllIllllllIllll.writeInt(this.x);
        "".length();
        llllllllllllIlllIIllIllllllIllll.writeInt(this.y);
        "".length();
        llllllllllllIlllIIllIllllllIllll.writeInt(this.z);
        "".length();
        llllllllllllIlllIIllIllllllIllll.writeByte(this.yaw);
        "".length();
        llllllllllllIlllIIllIllllllIllll.writeByte(this.pitch);
        "".length();
        llllllllllllIlllIIllIllllllIllll.writeShort(this.currentItem);
        "".length();
        this.watcher.writeTo(llllllllllllIlllIIllIllllllIllll);
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlllIIllIlllllllIIll) throws IOException {
        this.entityId = llllllllllllIlllIIllIlllllllIIll.readVarIntFromBuffer();
        this.playerId = llllllllllllIlllIIllIlllllllIIll.readUuid();
        this.x = llllllllllllIlllIIllIlllllllIIll.readInt();
        this.y = llllllllllllIlllIIllIlllllllIIll.readInt();
        this.z = llllllllllllIlllIIllIlllllllIIll.readInt();
        this.yaw = llllllllllllIlllIIllIlllllllIIll.readByte();
        this.pitch = llllllllllllIlllIIllIlllllllIIll.readByte();
        this.currentItem = llllllllllllIlllIIllIlllllllIIll.readShort();
        this.field_148958_j = DataWatcher.readWatchedListFromPacketBuffer(llllllllllllIlllIIllIlllllllIIll);
    }
    
    public List<DataWatcher.WatchableObject> func_148944_c() {
        if (lIIIlIlllIIIlIll(this.field_148958_j)) {
            this.field_148958_j = this.watcher.getAllWatched();
        }
        return this.field_148958_j;
    }
    
    private static void lIIIlIlllIIIlIlI() {
        (llIIlIIIIIlllI = new int[1])[0] = ((0x2 ^ 0x43) & ~(0x7C ^ 0x3D));
    }
    
    static {
        lIIIlIlllIIIlIlI();
    }
    
    public byte getYaw() {
        return this.yaw;
    }
}
