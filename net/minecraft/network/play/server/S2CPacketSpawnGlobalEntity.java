// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S2CPacketSpawnGlobalEntity implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int type;
    private /* synthetic */ int entityId;
    private /* synthetic */ int y;
    private /* synthetic */ int z;
    private static final /* synthetic */ int[] llIlIlIIIIIIll;
    private /* synthetic */ int x;
    
    public int func_149049_f() {
        return this.z;
    }
    
    private static boolean lIIlIIllIllIllll(final int llllllllllllIllIlIllIIlllIlIlIlI) {
        return llllllllllllIllIlIllIIlllIlIlIlI != 0;
    }
    
    static {
        lIIlIIllIllIlllI();
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllIlIllIIllllIIIlIl) throws IOException {
        llllllllllllIllIlIllIIllllIIIlIl.writeVarIntToBuffer(this.entityId);
        llllllllllllIllIlIllIIllllIIIlIl.writeByte(this.type);
        "".length();
        llllllllllllIllIlIllIIllllIIIlIl.writeInt(this.x);
        "".length();
        llllllllllllIllIlIllIIllllIIIlIl.writeInt(this.y);
        "".length();
        llllllllllllIllIlIllIIllllIIIlIl.writeInt(this.z);
        "".length();
    }
    
    public S2CPacketSpawnGlobalEntity() {
    }
    
    private static void lIIlIIllIllIlllI() {
        (llIlIlIIIIIIll = new int[1])[0] = " ".length();
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllIlIllIIllllIIlIll) throws IOException {
        this.entityId = llllllllllllIllIlIllIIllllIIlIll.readVarIntFromBuffer();
        this.type = llllllllllllIllIlIllIIllllIIlIll.readByte();
        this.x = llllllllllllIllIlIllIIllllIIlIll.readInt();
        this.y = llllllllllllIllIlIllIIllllIIlIll.readInt();
        this.z = llllllllllllIllIlIllIIllllIIlIll.readInt();
    }
    
    public int func_149051_d() {
        return this.x;
    }
    
    public S2CPacketSpawnGlobalEntity(final Entity llllllllllllIllIlIllIIllllIlIIIl) {
        this.entityId = llllllllllllIllIlIllIIllllIlIIIl.getEntityId();
        this.x = MathHelper.floor_double(llllllllllllIllIlIllIIllllIlIIIl.posX * 32.0);
        this.y = MathHelper.floor_double(llllllllllllIllIlIllIIllllIlIIIl.posY * 32.0);
        this.z = MathHelper.floor_double(llllllllllllIllIlIllIIllllIlIIIl.posZ * 32.0);
        if (lIIlIIllIllIllll((llllllllllllIllIlIllIIllllIlIIIl instanceof EntityLightningBolt) ? 1 : 0)) {
            this.type = S2CPacketSpawnGlobalEntity.llIlIlIIIIIIll[0];
        }
    }
    
    public int func_149053_g() {
        return this.type;
    }
    
    public int func_149052_c() {
        return this.entityId;
    }
    
    public int func_149050_e() {
        return this.y;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIllIlIllIIlllIllllll) {
        llllllllllllIllIlIllIIlllIllllll.handleSpawnGlobalEntity(this);
    }
}
