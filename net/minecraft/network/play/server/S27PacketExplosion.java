// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import java.util.Iterator;
import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import com.google.common.collect.Lists;
import net.minecraft.util.Vec3;
import net.minecraft.util.BlockPos;
import java.util.List;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S27PacketExplosion implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ double posZ;
    private /* synthetic */ double posY;
    private /* synthetic */ double posX;
    private static final /* synthetic */ int[] llIllIllIllllI;
    private /* synthetic */ float field_149159_h;
    private /* synthetic */ float field_149152_f;
    private /* synthetic */ float field_149153_g;
    private /* synthetic */ List<BlockPos> affectedBlockPositions;
    private /* synthetic */ float strength;
    
    public float func_149144_d() {
        return this.field_149153_g;
    }
    
    private static boolean lIIllIIIIlIlIlIl(final int llllllllllllIllIIllIIIllIlIlllIl, final int llllllllllllIllIIllIIIllIlIlllII) {
        return llllllllllllIllIIllIIIllIlIlllIl >= llllllllllllIllIIllIIIllIlIlllII;
    }
    
    public S27PacketExplosion(final double llllllllllllIllIIllIIIllllIIlIIl, final double llllllllllllIllIIllIIIllllIIIIIl, final double llllllllllllIllIIllIIIllllIIIIII, final float llllllllllllIllIIllIIIllllIIIllI, final List<BlockPos> llllllllllllIllIIllIIIlllIlllllI, final Vec3 llllllllllllIllIIllIIIllllIIIlII) {
        this.posX = llllllllllllIllIIllIIIllllIIlIIl;
        this.posY = llllllllllllIllIIllIIIllllIIIIIl;
        this.posZ = llllllllllllIllIIllIIIllllIIIIII;
        this.strength = llllllllllllIllIIllIIIllllIIIllI;
        this.affectedBlockPositions = (List<BlockPos>)Lists.newArrayList((Iterable)llllllllllllIllIIllIIIlllIlllllI);
        if (lIIllIIIIlIlIlII(llllllllllllIllIIllIIIllllIIIlII)) {
            this.field_149152_f = (float)llllllllllllIllIIllIIIllllIIIlII.xCoord;
            this.field_149153_g = (float)llllllllllllIllIIllIIIllllIIIlII.yCoord;
            this.field_149159_h = (float)llllllllllllIllIIllIIIllllIIIlII.zCoord;
        }
    }
    
    public float func_149147_e() {
        return this.field_149159_h;
    }
    
    private static boolean lIIllIIIIlIlIllI(final int llllllllllllIllIIllIIIllIlIllIII) {
        return llllllllllllIllIIllIIIllIlIllIII == 0;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIllIIllIIIllIllllllI) {
        llllllllllllIllIIllIIIllIllllllI.handleExplosion(this);
    }
    
    static {
        lIIllIIIIlIlIIll();
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllIIllIIIlllIllIIIl) throws IOException {
        this.posX = llllllllllllIllIIllIIIlllIllIIIl.readFloat();
        this.posY = llllllllllllIllIIllIIIlllIllIIIl.readFloat();
        this.posZ = llllllllllllIllIIllIIIlllIllIIIl.readFloat();
        this.strength = llllllllllllIllIIllIIIlllIllIIIl.readFloat();
        final int llllllllllllIllIIllIIIlllIllIIII = llllllllllllIllIIllIIIlllIllIIIl.readInt();
        this.affectedBlockPositions = (List<BlockPos>)Lists.newArrayListWithCapacity(llllllllllllIllIIllIIIlllIllIIII);
        final int llllllllllllIllIIllIIIlllIlIllll = (int)this.posX;
        final int llllllllllllIllIIllIIIlllIlIlllI = (int)this.posY;
        final int llllllllllllIllIIllIIIlllIlIllIl = (int)this.posZ;
        int llllllllllllIllIIllIIIlllIlIllII = S27PacketExplosion.llIllIllIllllI[0];
        "".length();
        if ((185 + 44 - 180 + 140 ^ 160 + 116 - 148 + 57) == 0x0) {
            return;
        }
        while (!lIIllIIIIlIlIlIl(llllllllllllIllIIllIIIlllIlIllII, llllllllllllIllIIllIIIlllIllIIII)) {
            final int llllllllllllIllIIllIIIlllIlIlIll = llllllllllllIllIIllIIIlllIllIIIl.readByte() + llllllllllllIllIIllIIIlllIlIllll;
            final int llllllllllllIllIIllIIIlllIlIlIlI = llllllllllllIllIIllIIIlllIllIIIl.readByte() + llllllllllllIllIIllIIIlllIlIlllI;
            final int llllllllllllIllIIllIIIlllIlIlIIl = llllllllllllIllIIllIIIlllIllIIIl.readByte() + llllllllllllIllIIllIIIlllIlIllIl;
            this.affectedBlockPositions.add(new BlockPos(llllllllllllIllIIllIIIlllIlIlIll, llllllllllllIllIIllIIIlllIlIlIlI, llllllllllllIllIIllIIIlllIlIlIIl));
            "".length();
            ++llllllllllllIllIIllIIIlllIlIllII;
        }
        this.field_149152_f = llllllllllllIllIIllIIIlllIllIIIl.readFloat();
        this.field_149153_g = llllllllllllIllIIllIIIlllIllIIIl.readFloat();
        this.field_149159_h = llllllllllllIllIIllIIIlllIllIIIl.readFloat();
    }
    
    public double getY() {
        return this.posY;
    }
    
    private static boolean lIIllIIIIlIlIlII(final Object llllllllllllIllIIllIIIllIlIllIlI) {
        return llllllllllllIllIIllIIIllIlIllIlI != null;
    }
    
    public double getX() {
        return this.posX;
    }
    
    public List<BlockPos> getAffectedBlockPositions() {
        return this.affectedBlockPositions;
    }
    
    private static void lIIllIIIIlIlIIll() {
        (llIllIllIllllI = new int[1])[0] = ((0x82 ^ 0x8C ^ (0xBE ^ 0xA5)) & (68 + 39 - 16 + 119 ^ 127 + 35 - 133 + 170 ^ -" ".length()));
    }
    
    public float getStrength() {
        return this.strength;
    }
    
    public float func_149149_c() {
        return this.field_149152_f;
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllIIllIIIlllIIlIIll) throws IOException {
        llllllllllllIllIIllIIIlllIIlIIll.writeFloat((float)this.posX);
        "".length();
        llllllllllllIllIIllIIIlllIIlIIll.writeFloat((float)this.posY);
        "".length();
        llllllllllllIllIIllIIIlllIIlIIll.writeFloat((float)this.posZ);
        "".length();
        llllllllllllIllIIllIIIlllIIlIIll.writeFloat(this.strength);
        "".length();
        llllllllllllIllIIllIIIlllIIlIIll.writeInt(this.affectedBlockPositions.size());
        "".length();
        final int llllllllllllIllIIllIIIlllIIlIIlI = (int)this.posX;
        final int llllllllllllIllIIllIIIlllIIlIIIl = (int)this.posY;
        final int llllllllllllIllIIllIIIlllIIlIIII = (int)this.posZ;
        final boolean llllllllllllIllIIllIIIlllIIIIlIl = (boolean)this.affectedBlockPositions.iterator();
        "".length();
        if (((71 + 92 - 94 + 66 ^ 34 + 79 - 82 + 149) & (0x3F ^ 0x4A ^ (0x56 ^ 0x10) ^ -" ".length())) != 0x0) {
            return;
        }
        while (!lIIllIIIIlIlIllI(((Iterator)llllllllllllIllIIllIIIlllIIIIlIl).hasNext() ? 1 : 0)) {
            final BlockPos llllllllllllIllIIllIIIlllIIIllll = ((Iterator<BlockPos>)llllllllllllIllIIllIIIlllIIIIlIl).next();
            final int llllllllllllIllIIllIIIlllIIIlllI = llllllllllllIllIIllIIIlllIIIllll.getX() - llllllllllllIllIIllIIIlllIIlIIlI;
            final int llllllllllllIllIIllIIIlllIIIllIl = llllllllllllIllIIllIIIlllIIIllll.getY() - llllllllllllIllIIllIIIlllIIlIIIl;
            final int llllllllllllIllIIllIIIlllIIIllII = llllllllllllIllIIllIIIlllIIIllll.getZ() - llllllllllllIllIIllIIIlllIIlIIII;
            llllllllllllIllIIllIIIlllIIlIIll.writeByte(llllllllllllIllIIllIIIlllIIIlllI);
            "".length();
            llllllllllllIllIIllIIIlllIIlIIll.writeByte(llllllllllllIllIIllIIIlllIIIllIl);
            "".length();
            llllllllllllIllIIllIIIlllIIlIIll.writeByte(llllllllllllIllIIllIIIlllIIIllII);
            "".length();
        }
        llllllllllllIllIIllIIIlllIIlIIll.writeFloat(this.field_149152_f);
        "".length();
        llllllllllllIllIIllIIIlllIIlIIll.writeFloat(this.field_149153_g);
        "".length();
        llllllllllllIllIIllIIIlllIIlIIll.writeFloat(this.field_149159_h);
        "".length();
    }
    
    public S27PacketExplosion() {
    }
    
    public double getZ() {
        return this.posZ;
    }
}
