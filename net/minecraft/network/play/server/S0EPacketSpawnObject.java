// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.util.MathHelper;
import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.entity.Entity;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S0EPacketSpawnObject implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int x;
    private /* synthetic */ int yaw;
    private /* synthetic */ int y;
    private /* synthetic */ int z;
    private /* synthetic */ int speedX;
    private /* synthetic */ int field_149020_k;
    private /* synthetic */ int speedY;
    private /* synthetic */ int type;
    private /* synthetic */ int pitch;
    private /* synthetic */ int speedZ;
    private /* synthetic */ int entityId;
    private static final /* synthetic */ int[] lIIlIIIlIlIIII;
    
    public int getType() {
        return this.type;
    }
    
    public int getZ() {
        return this.z;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIIlllIIllIlIlllIIII) {
        lllllllllllllIIlllIIllIlIlllIIII.handleSpawnObject(this);
    }
    
    public int getY() {
        return this.y;
    }
    
    private static void llIIlIlIllIIlll() {
        (lIIlIIIlIlIIII = new int[1])[0] = ((0xE ^ 0x55 ^ (0xC ^ 0x5C)) & (0x2F ^ 0x3A ^ (0xA1 ^ 0xBF) ^ -" ".length()));
    }
    
    private static boolean llIIlIlIllIlIlI(final int lllllllllllllIIlllIIllIlIIIlllIl) {
        return lllllllllllllIIlllIIllIlIIIlllIl > 0;
    }
    
    public int getSpeedY() {
        return this.speedY;
    }
    
    public int getYaw() {
        return this.yaw;
    }
    
    public S0EPacketSpawnObject(final Entity lllllllllllllIIlllIIllIllIIllIll, final int lllllllllllllIIlllIIllIllIIllIlI) {
        this(lllllllllllllIIlllIIllIllIIllIll, lllllllllllllIIlllIIllIllIIllIlI, S0EPacketSpawnObject.lIIlIIIlIlIIII[0]);
    }
    
    public int func_149009_m() {
        return this.field_149020_k;
    }
    
    public int getSpeedX() {
        return this.speedX;
    }
    
    private static int llIIlIlIllIlIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static int llIIlIlIllIlIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public S0EPacketSpawnObject() {
    }
    
    public void func_149002_g(final int lllllllllllllIIlllIIllIlIIlIIlll) {
        this.field_149020_k = lllllllllllllIIlllIIllIlIIlIIlll;
    }
    
    public int getPitch() {
        return this.pitch;
    }
    
    public int getEntityID() {
        return this.entityId;
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIlllIIllIlIlllllII) throws IOException {
        this.entityId = lllllllllllllIIlllIIllIlIlllllII.readVarIntFromBuffer();
        this.type = lllllllllllllIIlllIIllIlIlllllII.readByte();
        this.x = lllllllllllllIIlllIIllIlIlllllII.readInt();
        this.y = lllllllllllllIIlllIIllIlIlllllII.readInt();
        this.z = lllllllllllllIIlllIIllIlIlllllII.readInt();
        this.pitch = lllllllllllllIIlllIIllIlIlllllII.readByte();
        this.yaw = lllllllllllllIIlllIIllIlIlllllII.readByte();
        this.field_149020_k = lllllllllllllIIlllIIllIlIlllllII.readInt();
        if (llIIlIlIllIlIlI(this.field_149020_k)) {
            this.speedX = lllllllllllllIIlllIIllIlIlllllII.readShort();
            this.speedY = lllllllllllllIIlllIIllIlIlllllII.readShort();
            this.speedZ = lllllllllllllIIlllIIllIlIlllllII.readShort();
        }
    }
    
    public void setSpeedY(final int lllllllllllllIIlllIIllIlIIllIIll) {
        this.speedY = lllllllllllllIIlllIIllIlIIllIIll;
    }
    
    public void setZ(final int lllllllllllllIIlllIIllIlIIllllIl) {
        this.z = lllllllllllllIIlllIIllIlIIllllIl;
    }
    
    public void setX(final int lllllllllllllIIlllIIllIlIlIIlIIl) {
        this.x = lllllllllllllIIlllIIllIlIlIIlIIl;
    }
    
    public int getX() {
        return this.x;
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIlllIIllIlIllllIII) throws IOException {
        lllllllllllllIIlllIIllIlIllllIII.writeVarIntToBuffer(this.entityId);
        lllllllllllllIIlllIIllIlIllllIII.writeByte(this.type);
        "".length();
        lllllllllllllIIlllIIllIlIllllIII.writeInt(this.x);
        "".length();
        lllllllllllllIIlllIIllIlIllllIII.writeInt(this.y);
        "".length();
        lllllllllllllIIlllIIllIlIllllIII.writeInt(this.z);
        "".length();
        lllllllllllllIIlllIIllIlIllllIII.writeByte(this.pitch);
        "".length();
        lllllllllllllIIlllIIllIlIllllIII.writeByte(this.yaw);
        "".length();
        lllllllllllllIIlllIIllIlIllllIII.writeInt(this.field_149020_k);
        "".length();
        if (llIIlIlIllIlIlI(this.field_149020_k)) {
            lllllllllllllIIlllIIllIlIllllIII.writeShort(this.speedX);
            "".length();
            lllllllllllllIIlllIIllIlIllllIII.writeShort(this.speedY);
            "".length();
            lllllllllllllIIlllIIllIlIllllIII.writeShort(this.speedZ);
            "".length();
        }
    }
    
    private static boolean llIIlIlIllIlIll(final int lllllllllllllIIlllIIllIlIIIlllll) {
        return lllllllllllllIIlllIIllIlIIIlllll < 0;
    }
    
    public S0EPacketSpawnObject(final Entity lllllllllllllIIlllIIllIllIIIlIII, final int lllllllllllllIIlllIIllIllIIIIlll, final int lllllllllllllIIlllIIllIllIIIlllI) {
        this.entityId = lllllllllllllIIlllIIllIllIIIlIII.getEntityId();
        this.x = MathHelper.floor_double(lllllllllllllIIlllIIllIllIIIlIII.posX * 32.0);
        this.y = MathHelper.floor_double(lllllllllllllIIlllIIllIllIIIlIII.posY * 32.0);
        this.z = MathHelper.floor_double(lllllllllllllIIlllIIllIllIIIlIII.posZ * 32.0);
        this.pitch = MathHelper.floor_float(lllllllllllllIIlllIIllIllIIIlIII.rotationPitch * 256.0f / 360.0f);
        this.yaw = MathHelper.floor_float(lllllllllllllIIlllIIllIllIIIlIII.rotationYaw * 256.0f / 360.0f);
        this.type = lllllllllllllIIlllIIllIllIIIIlll;
        this.field_149020_k = lllllllllllllIIlllIIllIllIIIlllI;
        if (llIIlIlIllIlIlI(lllllllllllllIIlllIIllIllIIIlllI)) {
            double lllllllllllllIIlllIIllIllIIIllIl = lllllllllllllIIlllIIllIllIIIlIII.motionX;
            double lllllllllllllIIlllIIllIllIIIllII = lllllllllllllIIlllIIllIllIIIlIII.motionY;
            double lllllllllllllIIlllIIllIllIIIlIll = lllllllllllllIIlllIIllIllIIIlIII.motionZ;
            final double lllllllllllllIIlllIIllIllIIIlIlI = 3.9;
            if (llIIlIlIllIlIll(llIIlIlIllIlIII(lllllllllllllIIlllIIllIllIIIllIl, -lllllllllllllIIlllIIllIllIIIlIlI))) {
                lllllllllllllIIlllIIllIllIIIllIl = -lllllllllllllIIlllIIllIllIIIlIlI;
            }
            if (llIIlIlIllIlIll(llIIlIlIllIlIII(lllllllllllllIIlllIIllIllIIIllII, -lllllllllllllIIlllIIllIllIIIlIlI))) {
                lllllllllllllIIlllIIllIllIIIllII = -lllllllllllllIIlllIIllIllIIIlIlI;
            }
            if (llIIlIlIllIlIll(llIIlIlIllIlIII(lllllllllllllIIlllIIllIllIIIlIll, -lllllllllllllIIlllIIllIllIIIlIlI))) {
                lllllllllllllIIlllIIllIllIIIlIll = -lllllllllllllIIlllIIllIllIIIlIlI;
            }
            if (llIIlIlIllIlIlI(llIIlIlIllIlIIl(lllllllllllllIIlllIIllIllIIIllIl, lllllllllllllIIlllIIllIllIIIlIlI))) {
                lllllllllllllIIlllIIllIllIIIllIl = lllllllllllllIIlllIIllIllIIIlIlI;
            }
            if (llIIlIlIllIlIlI(llIIlIlIllIlIIl(lllllllllllllIIlllIIllIllIIIllII, lllllllllllllIIlllIIllIllIIIlIlI))) {
                lllllllllllllIIlllIIllIllIIIllII = lllllllllllllIIlllIIllIllIIIlIlI;
            }
            if (llIIlIlIllIlIlI(llIIlIlIllIlIIl(lllllllllllllIIlllIIllIllIIIlIll, lllllllllllllIIlllIIllIllIIIlIlI))) {
                lllllllllllllIIlllIIllIllIIIlIll = lllllllllllllIIlllIIllIllIIIlIlI;
            }
            this.speedX = (int)(lllllllllllllIIlllIIllIllIIIllIl * 8000.0);
            this.speedY = (int)(lllllllllllllIIlllIIllIllIIIllII * 8000.0);
            this.speedZ = (int)(lllllllllllllIIlllIIllIllIIIlIll * 8000.0);
        }
    }
    
    public void setSpeedX(final int lllllllllllllIIlllIIllIlIIlllIIl) {
        this.speedX = lllllllllllllIIlllIIllIlIIlllIIl;
    }
    
    static {
        llIIlIlIllIIlll();
    }
    
    public int getSpeedZ() {
        return this.speedZ;
    }
    
    public void setY(final int lllllllllllllIIlllIIllIlIlIIIIll) {
        this.y = lllllllllllllIIlllIIllIlIlIIIIll;
    }
    
    public void setSpeedZ(final int lllllllllllllIIlllIIllIlIIlIllIl) {
        this.speedZ = lllllllllllllIIlllIIllIlIIlIllIl;
    }
}
