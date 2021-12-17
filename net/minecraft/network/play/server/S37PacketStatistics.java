// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import java.util.Iterator;
import java.io.IOException;
import net.minecraft.stats.StatList;
import com.google.common.collect.Maps;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.stats.StatBase;
import java.util.Map;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S37PacketStatistics implements Packet<INetHandlerPlayClient>
{
    private static final /* synthetic */ int[] lllIlIIIIllllI;
    private /* synthetic */ Map<StatBase, Integer> field_148976_a;
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlIlllIIllIIIllIIlIl) throws IOException {
        final int llllllllllllIlIlllIIllIIIllIIlII = llllllllllllIlIlllIIllIIIllIIlIl.readVarIntFromBuffer();
        this.field_148976_a = (Map<StatBase, Integer>)Maps.newHashMap();
        int llllllllllllIlIlllIIllIIIllIIIll = S37PacketStatistics.lllIlIIIIllllI[0];
        "".length();
        if ("  ".length() == 0) {
            return;
        }
        while (!lIlIIIIllIIIllIl(llllllllllllIlIlllIIllIIIllIIIll, llllllllllllIlIlllIIllIIIllIIlII)) {
            final StatBase llllllllllllIlIlllIIllIIIllIIIlI = StatList.getOneShotStat(llllllllllllIlIlllIIllIIIllIIlIl.readStringFromBuffer(S37PacketStatistics.lllIlIIIIllllI[1]));
            final int llllllllllllIlIlllIIllIIIllIIIIl = llllllllllllIlIlllIIllIIIllIIlIl.readVarIntFromBuffer();
            if (lIlIIIIllIIIllII(llllllllllllIlIlllIIllIIIllIIIlI)) {
                this.field_148976_a.put(llllllllllllIlIlllIIllIIIllIIIlI, llllllllllllIlIlllIIllIIIllIIIIl);
                "".length();
            }
            ++llllllllllllIlIlllIIllIIIllIIIll;
        }
    }
    
    public S37PacketStatistics() {
    }
    
    public Map<StatBase, Integer> func_148974_c() {
        return this.field_148976_a;
    }
    
    private static boolean lIlIIIIllIIIllIl(final int llllllllllllIlIlllIIllIIIlIIIllI, final int llllllllllllIlIlllIIllIIIlIIIlIl) {
        return llllllllllllIlIlllIIllIIIlIIIllI >= llllllllllllIlIlllIIllIIIlIIIlIl;
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlIlllIIllIIIlIlIIlI) throws IOException {
        llllllllllllIlIlllIIllIIIlIlIIlI.writeVarIntToBuffer(this.field_148976_a.size());
        final int llllllllllllIlIlllIIllIIIlIlIIII = (int)this.field_148976_a.entrySet().iterator();
        "".length();
        if (" ".length() == 0) {
            return;
        }
        while (!lIlIIIIllIIIlllI(((Iterator)llllllllllllIlIlllIIllIIIlIlIIII).hasNext() ? 1 : 0)) {
            final Map.Entry<StatBase, Integer> llllllllllllIlIlllIIllIIIlIlIlII = ((Iterator<Map.Entry<StatBase, Integer>>)llllllllllllIlIlllIIllIIIlIlIIII).next();
            llllllllllllIlIlllIIllIIIlIlIIlI.writeString(llllllllllllIlIlllIIllIIIlIlIlII.getKey().statId);
            "".length();
            llllllllllllIlIlllIIllIIIlIlIIlI.writeVarIntToBuffer(llllllllllllIlIlllIIllIIIlIlIlII.getValue());
        }
    }
    
    static {
        lIlIIIIllIIIlIll();
    }
    
    private static boolean lIlIIIIllIIIlllI(final int llllllllllllIlIlllIIllIIIlIIIIIl) {
        return llllllllllllIlIlllIIllIIIlIIIIIl == 0;
    }
    
    private static boolean lIlIIIIllIIIllII(final Object llllllllllllIlIlllIIllIIIlIIIIll) {
        return llllllllllllIlIlllIIllIIIlIIIIll != null;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIlIlllIIllIIIllIllIl) {
        llllllllllllIlIlllIIllIIIllIllIl.handleStatistics(this);
    }
    
    public S37PacketStatistics(final Map<StatBase, Integer> llllllllllllIlIlllIIllIIIlllIlIl) {
        this.field_148976_a = llllllllllllIlIlllIIllIIIlllIlIl;
    }
    
    private static void lIlIIIIllIIIlIll() {
        (lllIlIIIIllllI = new int[2])[0] = ((0x94 ^ 0x83) & ~(0x61 ^ 0x76));
        S37PacketStatistics.lllIlIIIIllllI[1] = (-1 & 0x7FFF);
    }
}
