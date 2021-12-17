// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.DataWatcher;
import java.util.List;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S0FPacketSpawnMob implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int velocityX;
    private /* synthetic */ int z;
    private /* synthetic */ List<DataWatcher.WatchableObject> watcher;
    private static final /* synthetic */ int[] lIIIIIIlllllll;
    private /* synthetic */ int velocityZ;
    private /* synthetic */ int entityId;
    private /* synthetic */ byte pitch;
    private /* synthetic */ byte yaw;
    private /* synthetic */ int y;
    private /* synthetic */ int x;
    private /* synthetic */ DataWatcher field_149043_l;
    private /* synthetic */ int velocityY;
    private /* synthetic */ byte headPitch;
    private /* synthetic */ int type;
    
    public S0FPacketSpawnMob(final EntityLivingBase lllllllllllllIlIIllllllIIlllllII) {
        this.entityId = lllllllllllllIlIIllllllIIlllllII.getEntityId();
        this.type = (byte)EntityList.getEntityID(lllllllllllllIlIIllllllIIlllllII);
        this.x = MathHelper.floor_double(lllllllllllllIlIIllllllIIlllllII.posX * 32.0);
        this.y = MathHelper.floor_double(lllllllllllllIlIIllllllIIlllllII.posY * 32.0);
        this.z = MathHelper.floor_double(lllllllllllllIlIIllllllIIlllllII.posZ * 32.0);
        this.yaw = (byte)(lllllllllllllIlIIllllllIIlllllII.rotationYaw * 256.0f / 360.0f);
        this.pitch = (byte)(lllllllllllllIlIIllllllIIlllllII.rotationPitch * 256.0f / 360.0f);
        this.headPitch = (byte)(lllllllllllllIlIIllllllIIlllllII.rotationYawHead * 256.0f / 360.0f);
        final double lllllllllllllIlIIllllllIIllllIll = 3.9;
        double lllllllllllllIlIIllllllIIllllIlI = lllllllllllllIlIIllllllIIlllllII.motionX;
        double lllllllllllllIlIIllllllIIllllIIl = lllllllllllllIlIIllllllIIlllllII.motionY;
        double lllllllllllllIlIIllllllIIllllIII = lllllllllllllIlIIllllllIIlllllII.motionZ;
        if (lIllIlIlIlIIlll(lIllIlIlIlIIlIl(lllllllllllllIlIIllllllIIllllIlI, -lllllllllllllIlIIllllllIIllllIll))) {
            lllllllllllllIlIIllllllIIllllIlI = -lllllllllllllIlIIllllllIIllllIll;
        }
        if (lIllIlIlIlIIlll(lIllIlIlIlIIlIl(lllllllllllllIlIIllllllIIllllIIl, -lllllllllllllIlIIllllllIIllllIll))) {
            lllllllllllllIlIIllllllIIllllIIl = -lllllllllllllIlIIllllllIIllllIll;
        }
        if (lIllIlIlIlIIlll(lIllIlIlIlIIlIl(lllllllllllllIlIIllllllIIllllIII, -lllllllllllllIlIIllllllIIllllIll))) {
            lllllllllllllIlIIllllllIIllllIII = -lllllllllllllIlIIllllllIIllllIll;
        }
        if (lIllIlIlIlIlIII(lIllIlIlIlIIllI(lllllllllllllIlIIllllllIIllllIlI, lllllllllllllIlIIllllllIIllllIll))) {
            lllllllllllllIlIIllllllIIllllIlI = lllllllllllllIlIIllllllIIllllIll;
        }
        if (lIllIlIlIlIlIII(lIllIlIlIlIIllI(lllllllllllllIlIIllllllIIllllIIl, lllllllllllllIlIIllllllIIllllIll))) {
            lllllllllllllIlIIllllllIIllllIIl = lllllllllllllIlIIllllllIIllllIll;
        }
        if (lIllIlIlIlIlIII(lIllIlIlIlIIllI(lllllllllllllIlIIllllllIIllllIII, lllllllllllllIlIIllllllIIllllIll))) {
            lllllllllllllIlIIllllllIIllllIII = lllllllllllllIlIIllllllIIllllIll;
        }
        this.velocityX = (int)(lllllllllllllIlIIllllllIIllllIlI * 8000.0);
        this.velocityY = (int)(lllllllllllllIlIIllllllIIllllIIl * 8000.0);
        this.velocityZ = (int)(lllllllllllllIlIIllllllIIllllIII * 8000.0);
        this.field_149043_l = lllllllllllllIlIIllllllIIlllllII.getDataWatcher();
    }
    
    private static boolean lIllIlIlIlIlIIl(final Object lllllllllllllIlIIllllllIIIllIllI) {
        return lllllllllllllIlIIllllllIIIllIllI == null;
    }
    
    public List<DataWatcher.WatchableObject> func_149027_c() {
        if (lIllIlIlIlIlIIl(this.watcher)) {
            this.watcher = this.field_149043_l.getAllWatched();
        }
        return this.watcher;
    }
    
    public byte getYaw() {
        return this.yaw;
    }
    
    private static boolean lIllIlIlIlIlIII(final int lllllllllllllIlIIllllllIIIllIIlI) {
        return lllllllllllllIlIIllllllIIIllIIlI > 0;
    }
    
    private static int lIllIlIlIlIIllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIlIIllllllIIllIIIII) {
        lllllllllllllIlIIllllllIIllIIIII.handleSpawnMob(this);
    }
    
    private static boolean lIllIlIlIlIIlll(final int lllllllllllllIlIIllllllIIIllIlII) {
        return lllllllllllllIlIIllllllIIIllIlII < 0;
    }
    
    public int getVelocityX() {
        return this.velocityX;
    }
    
    private static int lIllIlIlIlIIlIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public int getY() {
        return this.y;
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIlIIllllllIIllIlllI) throws IOException {
        this.entityId = lllllllllllllIlIIllllllIIllIlllI.readVarIntFromBuffer();
        this.type = (lllllllllllllIlIIllllllIIllIlllI.readByte() & S0FPacketSpawnMob.lIIIIIIlllllll[0]);
        this.x = lllllllllllllIlIIllllllIIllIlllI.readInt();
        this.y = lllllllllllllIlIIllllllIIllIlllI.readInt();
        this.z = lllllllllllllIlIIllllllIIllIlllI.readInt();
        this.yaw = lllllllllllllIlIIllllllIIllIlllI.readByte();
        this.pitch = lllllllllllllIlIIllllllIIllIlllI.readByte();
        this.headPitch = lllllllllllllIlIIllllllIIllIlllI.readByte();
        this.velocityX = lllllllllllllIlIIllllllIIllIlllI.readShort();
        this.velocityY = lllllllllllllIlIIllllllIIllIlllI.readShort();
        this.velocityZ = lllllllllllllIlIIllllllIIllIlllI.readShort();
        this.watcher = DataWatcher.readWatchedListFromPacketBuffer(lllllllllllllIlIIllllllIIllIlllI);
    }
    
    public int getVelocityZ() {
        return this.velocityZ;
    }
    
    static {
        lIllIlIlIlIIlII();
    }
    
    public int getEntityID() {
        return this.entityId;
    }
    
    public int getZ() {
        return this.z;
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIlIIllllllIIllIlIII) throws IOException {
        lllllllllllllIlIIllllllIIllIlIII.writeVarIntToBuffer(this.entityId);
        lllllllllllllIlIIllllllIIllIlIII.writeByte(this.type & S0FPacketSpawnMob.lIIIIIIlllllll[0]);
        "".length();
        lllllllllllllIlIIllllllIIllIlIII.writeInt(this.x);
        "".length();
        lllllllllllllIlIIllllllIIllIlIII.writeInt(this.y);
        "".length();
        lllllllllllllIlIIllllllIIllIlIII.writeInt(this.z);
        "".length();
        lllllllllllllIlIIllllllIIllIlIII.writeByte(this.yaw);
        "".length();
        lllllllllllllIlIIllllllIIllIlIII.writeByte(this.pitch);
        "".length();
        lllllllllllllIlIIllllllIIllIlIII.writeByte(this.headPitch);
        "".length();
        lllllllllllllIlIIllllllIIllIlIII.writeShort(this.velocityX);
        "".length();
        lllllllllllllIlIIllllllIIllIlIII.writeShort(this.velocityY);
        "".length();
        lllllllllllllIlIIllllllIIllIlIII.writeShort(this.velocityZ);
        "".length();
        this.field_149043_l.writeTo(lllllllllllllIlIIllllllIIllIlIII);
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getVelocityY() {
        return this.velocityY;
    }
    
    public int getEntityType() {
        return this.type;
    }
    
    private static void lIllIlIlIlIIlII() {
        (lIIIIIIlllllll = new int[1])[0] = 224 + 24 - 49 + 56;
    }
    
    public byte getPitch() {
        return this.pitch;
    }
    
    public S0FPacketSpawnMob() {
    }
    
    public byte getHeadPitch() {
        return this.headPitch;
    }
}
