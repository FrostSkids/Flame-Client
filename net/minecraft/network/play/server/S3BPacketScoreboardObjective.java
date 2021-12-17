// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import net.minecraft.scoreboard.ScoreObjective;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.scoreboard.IScoreObjectiveCriteria;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S3BPacketScoreboardObjective implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ String objectiveName;
    private /* synthetic */ IScoreObjectiveCriteria.EnumRenderType type;
    private /* synthetic */ int field_149342_c;
    private /* synthetic */ String objectiveValue;
    private static final /* synthetic */ int[] lIIIIllIlllIlI;
    
    public int func_149338_e() {
        return this.field_149342_c;
    }
    
    public S3BPacketScoreboardObjective() {
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIlIIlIIIllIlIlIIIII) {
        lllllllllllllIlIIlIIIllIlIlIIIII.handleScoreboardObjective(this);
    }
    
    public IScoreObjectiveCriteria.EnumRenderType func_179817_d() {
        return this.type;
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIlIIlIIIllIlIlIIlII) throws IOException {
        lllllllllllllIlIIlIIIllIlIlIIlII.writeString(this.objectiveName);
        "".length();
        lllllllllllllIlIIlIIIllIlIlIIlII.writeByte(this.field_149342_c);
        "".length();
        if (!lIllllIIIIIlIll(this.field_149342_c) || lIllllIIIIIllII(this.field_149342_c, S3BPacketScoreboardObjective.lIIIIllIlllIlI[1])) {
            lllllllllllllIlIIlIIIllIlIlIIlII.writeString(this.objectiveValue);
            "".length();
            lllllllllllllIlIIlIIIllIlIlIIlII.writeString(this.type.func_178796_a());
            "".length();
        }
    }
    
    private static boolean lIllllIIIIIlIll(final int lllllllllllllIlIIlIIIllIlIIIlIII) {
        return lllllllllllllIlIIlIIIllIlIIIlIII != 0;
    }
    
    private static boolean lIllllIIIIIllII(final int lllllllllllllIlIIlIIIllIlIIIlIll, final int lllllllllllllIlIIlIIIllIlIIIlIlI) {
        return lllllllllllllIlIIlIIIllIlIIIlIll == lllllllllllllIlIIlIIIllIlIIIlIlI;
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIlIIlIIIllIlIlIllII) throws IOException {
        this.objectiveName = lllllllllllllIlIIlIIIllIlIlIllII.readStringFromBuffer(S3BPacketScoreboardObjective.lIIIIllIlllIlI[0]);
        this.field_149342_c = lllllllllllllIlIIlIIIllIlIlIllII.readByte();
        if (!lIllllIIIIIlIll(this.field_149342_c) || lIllllIIIIIllII(this.field_149342_c, S3BPacketScoreboardObjective.lIIIIllIlllIlI[1])) {
            this.objectiveValue = lllllllllllllIlIIlIIIllIlIlIllII.readStringFromBuffer(S3BPacketScoreboardObjective.lIIIIllIlllIlI[2]);
            this.type = IScoreObjectiveCriteria.EnumRenderType.func_178795_a(lllllllllllllIlIIlIIIllIlIlIllII.readStringFromBuffer(S3BPacketScoreboardObjective.lIIIIllIlllIlI[0]));
        }
    }
    
    public String func_149337_d() {
        return this.objectiveValue;
    }
    
    public S3BPacketScoreboardObjective(final ScoreObjective lllllllllllllIlIIlIIIllIlIllIlII, final int lllllllllllllIlIIlIIIllIlIllIIll) {
        this.objectiveName = lllllllllllllIlIIlIIIllIlIllIlII.getName();
        this.objectiveValue = lllllllllllllIlIIlIIIllIlIllIlII.getDisplayName();
        this.type = lllllllllllllIlIIlIIIllIlIllIlII.getCriteria().getRenderType();
        this.field_149342_c = lllllllllllllIlIIlIIIllIlIllIIll;
    }
    
    public String func_149339_c() {
        return this.objectiveName;
    }
    
    private static void lIllllIIIIIlIlI() {
        (lIIIIllIlllIlI = new int[3])[0] = (0x10 ^ 0x0);
        S3BPacketScoreboardObjective.lIIIIllIlllIlI[1] = "  ".length();
        S3BPacketScoreboardObjective.lIIIIllIlllIlI[2] = (0x7D ^ 0x2F ^ (0x5A ^ 0x28));
    }
    
    static {
        lIllllIIIIIlIlI();
    }
}
