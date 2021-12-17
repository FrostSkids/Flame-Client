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
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S14PacketEntity implements Packet<INetHandlerPlayClient>
{
    protected /* synthetic */ boolean onGround;
    protected /* synthetic */ boolean field_149069_g;
    protected /* synthetic */ byte posY;
    private static final /* synthetic */ int[] lllIIIlIlllIlI;
    protected /* synthetic */ byte pitch;
    protected /* synthetic */ int entityId;
    private static final /* synthetic */ String[] lllIIIlIlIIlll;
    protected /* synthetic */ byte yaw;
    protected /* synthetic */ byte posX;
    protected /* synthetic */ byte posZ;
    
    static {
        lIIlllIllIlIlIll();
        lIIlllIlIllIllII();
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllIIIIIIlIIlIlIIIII) throws IOException {
        this.entityId = llllllllllllIllIIIIIIlIIlIlIIIII.readVarIntFromBuffer();
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIllIIIIIIlIIlIIlIIlI) {
        llllllllllllIllIIIIIIlIIlIIlIIlI.handleEntityMovement(this);
    }
    
    public byte func_149061_d() {
        return this.posY;
    }
    
    public byte func_149064_e() {
        return this.posZ;
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder(S14PacketEntity.lllIIIlIlIIlll[S14PacketEntity.lllIIIlIlllIlI[0]]).append(super.toString()));
    }
    
    private static void lIIlllIllIlIlIll() {
        (lllIIIlIlllIlI = new int[3])[0] = ((121 + 132 - 211 + 129 ^ 48 + 18 + 55 + 44) & (112 + 96 - 140 + 67 ^ 0 + 3 + 123 + 11 ^ -" ".length()));
        S14PacketEntity.lllIIIlIlllIlI[1] = " ".length();
        S14PacketEntity.lllIIIlIlllIlI[2] = "  ".length();
    }
    
    public byte func_149062_c() {
        return this.posX;
    }
    
    public Entity getEntity(final World llllllllllllIllIIIIIIlIIlIIIlIll) {
        return llllllllllllIllIIIIIIlIIlIIIlIll.getEntityByID(this.entityId);
    }
    
    private static String lIIlllIlIllIlIll(final String llllllllllllIllIIIIIIlIIIllIlIII, final String llllllllllllIllIIIIIIlIIIllIIlll) {
        try {
            final SecretKeySpec llllllllllllIllIIIIIIlIIIllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIIlIIIllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIIIIlIIIllIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIIIIlIIIllIlIlI.init(S14PacketEntity.lllIIIlIlllIlI[2], llllllllllllIllIIIIIIlIIIllIlIll);
            return new String(llllllllllllIllIIIIIIlIIIllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIIlIIIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIIIlIIIllIlIIl) {
            llllllllllllIllIIIIIIlIIIllIlIIl.printStackTrace();
            return null;
        }
    }
    
    public S14PacketEntity(final int llllllllllllIllIIIIIIlIIlIlIIllI) {
        this.entityId = llllllllllllIllIIIIIIlIIlIlIIllI;
    }
    
    public byte func_149066_f() {
        return this.yaw;
    }
    
    public S14PacketEntity() {
    }
    
    private static void lIIlllIlIllIllII() {
        (lllIIIlIlIIlll = new String[S14PacketEntity.lllIIIlIlllIlI[1]])[S14PacketEntity.lllIIIlIlllIlI[0]] = lIIlllIlIllIlIll("gM7QbQ1ubYI=", "shhZP");
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllIIIIIIlIIlIIllIlI) throws IOException {
        llllllllllllIllIIIIIIlIIlIIllIlI.writeVarIntToBuffer(this.entityId);
    }
    
    public boolean getOnGround() {
        return this.onGround;
    }
    
    public boolean func_149060_h() {
        return this.field_149069_g;
    }
    
    public byte func_149063_g() {
        return this.pitch;
    }
    
    public static class S17PacketEntityLookMove extends S14PacketEntity
    {
        private static final /* synthetic */ int[] llIIIllIIlllIl;
        
        static {
            lIIIlIlIIlIlIlll();
        }
        
        public S17PacketEntityLookMove() {
            this.field_149069_g = (S17PacketEntityLookMove.llIIIllIIlllIl[0] != 0);
        }
        
        @Override
        public void writePacketData(final PacketBuffer llllllllllllIlllIlIIlIlIllIIlIIl) throws IOException {
            super.writePacketData(llllllllllllIlllIlIIlIlIllIIlIIl);
            llllllllllllIlllIlIIlIlIllIIlIIl.writeByte(this.posX);
            "".length();
            llllllllllllIlllIlIIlIlIllIIlIIl.writeByte(this.posY);
            "".length();
            llllllllllllIlllIlIIlIlIllIIlIIl.writeByte(this.posZ);
            "".length();
            llllllllllllIlllIlIIlIlIllIIlIIl.writeByte(this.yaw);
            "".length();
            llllllllllllIlllIlIIlIlIllIIlIIl.writeByte(this.pitch);
            "".length();
            llllllllllllIlllIlIIlIlIllIIlIIl.writeBoolean(this.onGround);
            "".length();
        }
        
        private static void lIIIlIlIIlIlIlll() {
            (llIIIllIIlllIl = new int[1])[0] = " ".length();
        }
        
        public S17PacketEntityLookMove(final int llllllllllllIlllIlIIlIlIlllIIIll, final byte llllllllllllIlllIlIIlIlIlllIIIlI, final byte llllllllllllIlllIlIIlIlIlllIIIIl, final byte llllllllllllIlllIlIIlIlIlllIIIII, final byte llllllllllllIlllIlIIlIlIllIlllll, final byte llllllllllllIlllIlIIlIlIllIllllI, final boolean llllllllllllIlllIlIIlIlIllIlllIl) {
            super(llllllllllllIlllIlIIlIlIlllIIIll);
            this.posX = llllllllllllIlllIlIIlIlIlllIIIlI;
            this.posY = llllllllllllIlllIlIIlIlIlllIIIIl;
            this.posZ = llllllllllllIlllIlIIlIlIlllIIIII;
            this.yaw = llllllllllllIlllIlIIlIlIllIlllll;
            this.pitch = llllllllllllIlllIlIIlIlIllIllllI;
            this.onGround = llllllllllllIlllIlIIlIlIllIlllIl;
            this.field_149069_g = (S17PacketEntityLookMove.llIIIllIIlllIl[0] != 0);
        }
        
        @Override
        public void readPacketData(final PacketBuffer llllllllllllIlllIlIIlIlIllIlIIIl) throws IOException {
            super.readPacketData(llllllllllllIlllIlIIlIlIllIlIIIl);
            this.posX = llllllllllllIlllIlIIlIlIllIlIIIl.readByte();
            this.posY = llllllllllllIlllIlIIlIlIllIlIIIl.readByte();
            this.posZ = llllllllllllIlllIlIIlIlIllIlIIIl.readByte();
            this.yaw = llllllllllllIlllIlIIlIlIllIlIIIl.readByte();
            this.pitch = llllllllllllIlllIlIIlIlIllIlIIIl.readByte();
            this.onGround = llllllllllllIlllIlIIlIlIllIlIIIl.readBoolean();
        }
    }
    
    public static class S15PacketEntityRelMove extends S14PacketEntity
    {
        public S15PacketEntityRelMove() {
        }
        
        public S15PacketEntityRelMove(final int llllllllllllIlIllIlIlllIlIIlIIII, final byte llllllllllllIlIllIlIlllIlIIIlIIl, final byte llllllllllllIlIllIlIlllIlIIIlIII, final byte llllllllllllIlIllIlIlllIlIIIllIl, final boolean llllllllllllIlIllIlIlllIlIIIIllI) {
            super(llllllllllllIlIllIlIlllIlIIlIIII);
            this.posX = llllllllllllIlIllIlIlllIlIIIlIIl;
            this.posY = llllllllllllIlIllIlIlllIlIIIlIII;
            this.posZ = llllllllllllIlIllIlIlllIlIIIllIl;
            this.onGround = llllllllllllIlIllIlIlllIlIIIIllI;
        }
        
        @Override
        public void readPacketData(final PacketBuffer llllllllllllIlIllIlIlllIlIIIIIII) throws IOException {
            super.readPacketData(llllllllllllIlIllIlIlllIlIIIIIII);
            this.posX = llllllllllllIlIllIlIlllIlIIIIIII.readByte();
            this.posY = llllllllllllIlIllIlIlllIlIIIIIII.readByte();
            this.posZ = llllllllllllIlIllIlIlllIlIIIIIII.readByte();
            this.onGround = llllllllllllIlIllIlIlllIlIIIIIII.readBoolean();
        }
        
        @Override
        public void writePacketData(final PacketBuffer llllllllllllIlIllIlIlllIIlllllII) throws IOException {
            super.writePacketData(llllllllllllIlIllIlIlllIIlllllII);
            llllllllllllIlIllIlIlllIIlllllII.writeByte(this.posX);
            "".length();
            llllllllllllIlIllIlIlllIIlllllII.writeByte(this.posY);
            "".length();
            llllllllllllIlIllIlIlllIIlllllII.writeByte(this.posZ);
            "".length();
            llllllllllllIlIllIlIlllIIlllllII.writeBoolean(this.onGround);
            "".length();
        }
    }
    
    public static class S16PacketEntityLook extends S14PacketEntity
    {
        private static final /* synthetic */ int[] lIIIllllllIIIl;
        
        private static void llIIlIIIlIIIlll() {
            (lIIIllllllIIIl = new int[1])[0] = " ".length();
        }
        
        static {
            llIIlIIIlIIIlll();
        }
        
        public S16PacketEntityLook() {
            this.field_149069_g = (S16PacketEntityLook.lIIIllllllIIIl[0] != 0);
        }
        
        @Override
        public void readPacketData(final PacketBuffer lllllllllllllIIllllIIIlIIlIIlIII) throws IOException {
            super.readPacketData(lllllllllllllIIllllIIIlIIlIIlIII);
            this.yaw = lllllllllllllIIllllIIIlIIlIIlIII.readByte();
            this.pitch = lllllllllllllIIllllIIIlIIlIIlIII.readByte();
            this.onGround = lllllllllllllIIllllIIIlIIlIIlIII.readBoolean();
        }
        
        public S16PacketEntityLook(final int lllllllllllllIIllllIIIlIIlIlIIIl, final byte lllllllllllllIIllllIIIlIIlIlIIII, final byte lllllllllllllIIllllIIIlIIlIlIlII, final boolean lllllllllllllIIllllIIIlIIlIIlllI) {
            super(lllllllllllllIIllllIIIlIIlIlIIIl);
            this.yaw = lllllllllllllIIllllIIIlIIlIlIIII;
            this.pitch = lllllllllllllIIllllIIIlIIlIlIlII;
            this.field_149069_g = (S16PacketEntityLook.lIIIllllllIIIl[0] != 0);
            this.onGround = lllllllllllllIIllllIIIlIIlIIlllI;
        }
        
        @Override
        public void writePacketData(final PacketBuffer lllllllllllllIIllllIIIlIIlIIIIlI) throws IOException {
            super.writePacketData(lllllllllllllIIllllIIIlIIlIIIIlI);
            lllllllllllllIIllllIIIlIIlIIIIlI.writeByte(this.yaw);
            "".length();
            lllllllllllllIIllllIIIlIIlIIIIlI.writeByte(this.pitch);
            "".length();
            lllllllllllllIIllllIIIlIIlIIIIlI.writeBoolean(this.onGround);
            "".length();
        }
    }
}
