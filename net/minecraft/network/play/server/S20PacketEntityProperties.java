// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import java.util.Iterator;
import java.util.UUID;
import java.io.IOException;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.network.PacketBuffer;
import com.google.common.collect.Lists;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import java.util.Collection;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.network.INetHandler;
import java.util.List;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S20PacketEntityProperties implements Packet<INetHandlerPlayClient>
{
    private static final /* synthetic */ String[] llIllIIIIIIIll;
    private /* synthetic */ int entityId;
    private final /* synthetic */ List<Snapshot> field_149444_b;
    private static final /* synthetic */ int[] llIllIIIIIIlII;
    
    private static boolean lIIlIllIIIllIIlI(final int llllllllllllIllIlIIIIlllIIllIllI) {
        return llllllllllllIllIlIIIIlllIIllIllI == 0;
    }
    
    static {
        lIIlIllIIIllIIIl();
        lIIlIllIIIlIIlll();
    }
    
    private static String lIIlIllIIIlIIllI(String llllllllllllIllIlIIIIlllIlIlllIl, final String llllllllllllIllIlIIIIlllIlIlllII) {
        llllllllllllIllIlIIIIlllIlIlllIl = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIIIIlllIlIlllIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIIIIlllIllIIIII = new StringBuilder();
        final char[] llllllllllllIllIlIIIIlllIlIlllll = llllllllllllIllIlIIIIlllIlIlllII.toCharArray();
        int llllllllllllIllIlIIIIlllIlIllllI = S20PacketEntityProperties.llIllIIIIIIlII[0];
        final Exception llllllllllllIllIlIIIIlllIlIlIlIl = (Object)((String)llllllllllllIllIlIIIIlllIlIlllIl).toCharArray();
        final int llllllllllllIllIlIIIIlllIlIlIIll = llllllllllllIllIlIIIIlllIlIlIlIl.length;
        String llllllllllllIllIlIIIIlllIlIlIIIl = (String)S20PacketEntityProperties.llIllIIIIIIlII[0];
        while (lIIlIllIIIllIlII((int)llllllllllllIllIlIIIIlllIlIlIIIl, llllllllllllIllIlIIIIlllIlIlIIll)) {
            final char llllllllllllIllIlIIIIlllIllIIlll = llllllllllllIllIlIIIIlllIlIlIlIl[llllllllllllIllIlIIIIlllIlIlIIIl];
            llllllllllllIllIlIIIIlllIllIIIII.append((char)(llllllllllllIllIlIIIIlllIllIIlll ^ llllllllllllIllIlIIIIlllIlIlllll[llllllllllllIllIlIIIIlllIlIllllI % llllllllllllIllIlIIIIlllIlIlllll.length]));
            "".length();
            ++llllllllllllIllIlIIIIlllIlIllllI;
            ++llllllllllllIllIlIIIIlllIlIlIIIl;
            "".length();
            if (("   ".length() & ~"   ".length()) >= (0x43 ^ 0x47)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIIIIlllIllIIIII);
    }
    
    public S20PacketEntityProperties(final int llllllllllllIllIlIIIlIIIIIIIllIl, final Collection<IAttributeInstance> llllllllllllIllIlIIIlIIIIIIIIlIl) {
        this.field_149444_b = (List<Snapshot>)Lists.newArrayList();
        this.entityId = llllllllllllIllIlIIIlIIIIIIIllIl;
        final long llllllllllllIllIlIIIlIIIIIIIIIII = (long)llllllllllllIllIlIIIlIIIIIIIIlIl.iterator();
        "".length();
        if (((0x44 ^ 0x6D) & ~(0x3A ^ 0x13)) != 0x0) {
            throw null;
        }
        while (!lIIlIllIIIllIIlI(((Iterator)llllllllllllIllIlIIIlIIIIIIIIIII).hasNext() ? 1 : 0)) {
            final IAttributeInstance llllllllllllIllIlIIIlIIIIIIIlIIl = ((Iterator<IAttributeInstance>)llllllllllllIllIlIIIlIIIIIIIIIII).next();
            this.field_149444_b.add(new Snapshot(llllllllllllIllIlIIIlIIIIIIIlIIl.getAttribute().getAttributeUnlocalizedName(), llllllllllllIllIlIIIlIIIIIIIlIIl.getBaseValue(), llllllllllllIllIlIIIlIIIIIIIlIIl.func_111122_c()));
            "".length();
        }
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIllIlIIIIllllIIlIlIl) {
        llllllllllllIllIlIIIIllllIIlIlIl.handleEntityProperties(this);
    }
    
    public List<Snapshot> func_149441_d() {
        return this.field_149444_b;
    }
    
    private static boolean lIIlIllIIIllIlII(final int llllllllllllIllIlIIIIlllIIllllll, final int llllllllllllIllIlIIIIlllIIllllII) {
        return llllllllllllIllIlIIIIlllIIllllll < llllllllllllIllIlIIIIlllIIllllII;
    }
    
    public S20PacketEntityProperties() {
        this.field_149444_b = (List<Snapshot>)Lists.newArrayList();
    }
    
    private static void lIIlIllIIIlIIlll() {
        (llIllIIIIIIIll = new String[S20PacketEntityProperties.llIllIIIIIIlII[2]])[S20PacketEntityProperties.llIllIIIIIIlII[0]] = lIIlIllIIIlIIllI("PjolCCUcOm4VMwU3KwJqCiA6FCMJIToDagY7Kg8sAjE8", "kTNfJ");
    }
    
    public int getEntityId() {
        return this.entityId;
    }
    
    private static boolean lIIlIllIIIllIIll(final int llllllllllllIllIlIIIIlllIlIIlIIl, final int llllllllllllIllIlIIIIlllIlIIIlll) {
        return llllllllllllIllIlIIIIlllIlIIlIIl >= llllllllllllIllIlIIIIlllIlIIIlll;
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllIlIIIIllllIlIIlIl) throws IOException {
        llllllllllllIllIlIIIIllllIlIIlIl.writeVarIntToBuffer(this.entityId);
        llllllllllllIllIlIIIIllllIlIIlIl.writeInt(this.field_149444_b.size());
        "".length();
        final int llllllllllllIllIlIIIIllllIlIIIIl = (int)this.field_149444_b.iterator();
        "".length();
        if (-(0x81 ^ 0x84) >= 0) {
            return;
        }
        while (!lIIlIllIIIllIIlI(((Iterator)llllllllllllIllIlIIIIllllIlIIIIl).hasNext() ? 1 : 0)) {
            final Snapshot llllllllllllIllIlIIIIllllIlIlIll = ((Iterator<Snapshot>)llllllllllllIllIlIIIIllllIlIIIIl).next();
            llllllllllllIllIlIIIIllllIlIIlIl.writeString(llllllllllllIllIlIIIIllllIlIlIll.func_151409_a());
            "".length();
            llllllllllllIllIlIIIIllllIlIIlIl.writeDouble(llllllllllllIllIlIIIIllllIlIlIll.func_151410_b());
            "".length();
            llllllllllllIllIlIIIIllllIlIIlIl.writeVarIntToBuffer(llllllllllllIllIlIIIIllllIlIlIll.func_151408_c().size());
            final char llllllllllllIllIlIIIIllllIIlllIl = (char)llllllllllllIllIlIIIIllllIlIlIll.func_151408_c().iterator();
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
            while (!lIIlIllIIIllIIlI(((Iterator)llllllllllllIllIlIIIIllllIIlllIl).hasNext() ? 1 : 0)) {
                final AttributeModifier llllllllllllIllIlIIIIllllIlIlIIl = ((Iterator<AttributeModifier>)llllllllllllIllIlIIIIllllIIlllIl).next();
                llllllllllllIllIlIIIIllllIlIIlIl.writeUuid(llllllllllllIllIlIIIIllllIlIlIIl.getID());
                llllllllllllIllIlIIIIllllIlIIlIl.writeDouble(llllllllllllIllIlIIIIllllIlIlIIl.getAmount());
                "".length();
                llllllllllllIllIlIIIIllllIlIIlIl.writeByte(llllllllllllIllIlIIIIllllIlIlIIl.getOperation());
                "".length();
            }
        }
    }
    
    private static void lIIlIllIIIllIIIl() {
        (llIllIIIIIIlII = new int[3])[0] = ((0x16 ^ 0x60 ^ (0x26 ^ 0x15)) & (71 + 52 + 11 + 75 ^ 126 + 54 - 51 + 19 ^ -" ".length()));
        S20PacketEntityProperties.llIllIIIIIIlII[1] = (85 + 134 - 84 + 86 ^ 150 + 123 - 125 + 9);
        S20PacketEntityProperties.llIllIIIIIIlII[2] = " ".length();
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllIlIIIIllllllIIIll) throws IOException {
        this.entityId = llllllllllllIllIlIIIIllllllIIIll.readVarIntFromBuffer();
        final int llllllllllllIllIlIIIIllllllIIIlI = llllllllllllIllIlIIIIllllllIIIll.readInt();
        int llllllllllllIllIlIIIIllllllIIIIl = S20PacketEntityProperties.llIllIIIIIIlII[0];
        "".length();
        if (-" ".length() > "  ".length()) {
            return;
        }
        while (!lIIlIllIIIllIIll(llllllllllllIllIlIIIIllllllIIIIl, llllllllllllIllIlIIIIllllllIIIlI)) {
            final String llllllllllllIllIlIIIIllllllIIIII = llllllllllllIllIlIIIIllllllIIIll.readStringFromBuffer(S20PacketEntityProperties.llIllIIIIIIlII[1]);
            final double llllllllllllIllIlIIIIlllllIlllll = llllllllllllIllIlIIIIllllllIIIll.readDouble();
            final List<AttributeModifier> llllllllllllIllIlIIIIlllllIllllI = (List<AttributeModifier>)Lists.newArrayList();
            final int llllllllllllIllIlIIIIlllllIlllIl = llllllllllllIllIlIIIIllllllIIIll.readVarIntFromBuffer();
            int llllllllllllIllIlIIIIlllllIlllII = S20PacketEntityProperties.llIllIIIIIIlII[0];
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
            while (!lIIlIllIIIllIIll(llllllllllllIllIlIIIIlllllIlllII, llllllllllllIllIlIIIIlllllIlllIl)) {
                final UUID llllllllllllIllIlIIIIlllllIllIll = llllllllllllIllIlIIIIllllllIIIll.readUuid();
                llllllllllllIllIlIIIIlllllIllllI.add(new AttributeModifier(llllllllllllIllIlIIIIlllllIllIll, S20PacketEntityProperties.llIllIIIIIIIll[S20PacketEntityProperties.llIllIIIIIIlII[0]], llllllllllllIllIlIIIIllllllIIIll.readDouble(), llllllllllllIllIlIIIIllllllIIIll.readByte()));
                "".length();
                ++llllllllllllIllIlIIIIlllllIlllII;
            }
            this.field_149444_b.add(new Snapshot(llllllllllllIllIlIIIIllllllIIIII, llllllllllllIllIlIIIIlllllIlllll, llllllllllllIllIlIIIIlllllIllllI));
            "".length();
            ++llllllllllllIllIlIIIIllllllIIIIl;
        }
    }
    
    public class Snapshot
    {
        private final /* synthetic */ String field_151412_b;
        private final /* synthetic */ double field_151413_c;
        private final /* synthetic */ Collection<AttributeModifier> field_151411_d;
        
        public double func_151410_b() {
            return this.field_151413_c;
        }
        
        public Collection<AttributeModifier> func_151408_c() {
            return this.field_151411_d;
        }
        
        public String func_151409_a() {
            return this.field_151412_b;
        }
        
        public Snapshot(final String lllllllllllllIIIllllIlllIIlllIlI, final double lllllllllllllIIIllllIlllIIlllIIl, final Collection<AttributeModifier> lllllllllllllIIIllllIlllIIlllIII) {
            this.field_151412_b = lllllllllllllIIIllllIlllIIlllIlI;
            this.field_151413_c = lllllllllllllIIIllllIlllIIlllIIl;
            this.field_151411_d = lllllllllllllIIIllllIlllIIlllIII;
        }
    }
}
