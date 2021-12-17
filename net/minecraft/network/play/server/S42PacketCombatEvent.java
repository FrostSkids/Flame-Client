// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.CombatTracker;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S42PacketCombatEvent implements Packet<INetHandlerPlayClient>
{
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$network$play$server$S42PacketCombatEvent$Event;
    public /* synthetic */ int field_179775_c;
    public /* synthetic */ int field_179774_b;
    private static final /* synthetic */ int[] llIlIIllIIIIII;
    public /* synthetic */ String deathMessage;
    public /* synthetic */ int field_179772_d;
    public /* synthetic */ Event eventType;
    
    public S42PacketCombatEvent(final CombatTracker llllllllllllIllIllIIIIIIllIIlIlI, final Event llllllllllllIllIllIIIIIIllIIlIIl) {
        this.eventType = llllllllllllIllIllIIIIIIllIIlIIl;
        final EntityLivingBase llllllllllllIllIllIIIIIIllIIlIII = llllllllllllIllIllIIIIIIllIIlIlI.func_94550_c();
        switch ($SWITCH_TABLE$net$minecraft$network$play$server$S42PacketCombatEvent$Event()[llllllllllllIllIllIIIIIIllIIlIIl.ordinal()]) {
            case 2: {
                this.field_179772_d = llllllllllllIllIllIIIIIIllIIlIlI.func_180134_f();
                int entityId;
                if (lIIlIIlIllIIIlll(llllllllllllIllIllIIIIIIllIIlIII)) {
                    entityId = S42PacketCombatEvent.llIlIIllIIIIII[0];
                    "".length();
                    if (null != null) {
                        throw null;
                    }
                }
                else {
                    entityId = llllllllllllIllIllIIIIIIllIIlIII.getEntityId();
                }
                this.field_179775_c = entityId;
                "".length();
                if (null != null) {
                    throw null;
                }
                break;
            }
            case 3: {
                this.field_179774_b = llllllllllllIllIllIIIIIIllIIlIlI.getFighter().getEntityId();
                int entityId2;
                if (lIIlIIlIllIIIlll(llllllllllllIllIllIIIIIIllIIlIII)) {
                    entityId2 = S42PacketCombatEvent.llIlIIllIIIIII[0];
                    "".length();
                    if ((0x4B ^ 0x4F) <= 0) {
                        throw null;
                    }
                }
                else {
                    entityId2 = llllllllllllIllIllIIIIIIllIIlIII.getEntityId();
                }
                this.field_179775_c = entityId2;
                this.deathMessage = llllllllllllIllIllIIIIIIllIIlIlI.getDeathMessage().getUnformattedText();
                break;
            }
        }
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$network$play$server$S42PacketCombatEvent$Event() {
        final int[] $switch_TABLE$net$minecraft$network$play$server$S42PacketCombatEvent$Event = S42PacketCombatEvent.$SWITCH_TABLE$net$minecraft$network$play$server$S42PacketCombatEvent$Event;
        if (lIIlIIlIllIIlIIl($switch_TABLE$net$minecraft$network$play$server$S42PacketCombatEvent$Event)) {
            return $switch_TABLE$net$minecraft$network$play$server$S42PacketCombatEvent$Event;
        }
        "".length();
        final double llllllllllllIllIllIIIIIIlIlIllII = (Object)new int[Event.values().length];
        try {
            llllllllllllIllIllIIIIIIlIlIllII[Event.END_COMBAT.ordinal()] = S42PacketCombatEvent.llIlIIllIIIIII[2];
            "".length();
            if (-" ".length() >= "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIllIllIIIIIIlIlIllII[Event.ENTER_COMBAT.ordinal()] = S42PacketCombatEvent.llIlIIllIIIIII[3];
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIllIllIIIIIIlIlIllII[Event.ENTITY_DIED.ordinal()] = S42PacketCombatEvent.llIlIIllIIIIII[4];
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        return S42PacketCombatEvent.$SWITCH_TABLE$net$minecraft$network$play$server$S42PacketCombatEvent$Event = (int[])(Object)llllllllllllIllIllIIIIIIlIlIllII;
    }
    
    private static boolean lIIlIIlIllIIlIIl(final Object llllllllllllIllIllIIIIIIlIlIIllI) {
        return llllllllllllIllIllIIIIIIlIlIIllI != null;
    }
    
    private static void lIIlIIlIllIIIllI() {
        (llIlIIllIIIIII = new int[5])[0] = -" ".length();
        S42PacketCombatEvent.llIlIIllIIIIII[1] = (-1 & 0x7FFF);
        S42PacketCombatEvent.llIlIIllIIIIII[2] = "  ".length();
        S42PacketCombatEvent.llIlIIllIIIIII[3] = " ".length();
        S42PacketCombatEvent.llIlIIllIIIIII[4] = "   ".length();
    }
    
    private static boolean lIIlIIlIllIIIlll(final Object llllllllllllIllIllIIIIIIlIlIIlII) {
        return llllllllllllIllIllIIIIIIlIlIIlII == null;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIllIllIIIIIIlIllIlII) {
        llllllllllllIllIllIIIIIIlIllIlII.handleCombatEvent(this);
    }
    
    private static boolean lIIlIIlIllIIlIII(final Object llllllllllllIllIllIIIIIIlIlIlIIl, final Object llllllllllllIllIllIIIIIIlIlIlIII) {
        return llllllllllllIllIllIIIIIIlIlIlIIl == llllllllllllIllIllIIIIIIlIlIlIII;
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllIllIIIIIIllIIIIII) throws IOException {
        this.eventType = llllllllllllIllIllIIIIIIllIIIIII.readEnumValue(Event.class);
        if (lIIlIIlIllIIlIII(this.eventType, Event.END_COMBAT)) {
            this.field_179772_d = llllllllllllIllIllIIIIIIllIIIIII.readVarIntFromBuffer();
            this.field_179775_c = llllllllllllIllIllIIIIIIllIIIIII.readInt();
            "".length();
            if ("   ".length() < " ".length()) {
                return;
            }
        }
        else if (lIIlIIlIllIIlIII(this.eventType, Event.ENTITY_DIED)) {
            this.field_179774_b = llllllllllllIllIllIIIIIIllIIIIII.readVarIntFromBuffer();
            this.field_179775_c = llllllllllllIllIllIIIIIIllIIIIII.readInt();
            this.deathMessage = llllllllllllIllIllIIIIIIllIIIIII.readStringFromBuffer(S42PacketCombatEvent.llIlIIllIIIIII[1]);
        }
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllIllIIIIIIlIlllIII) throws IOException {
        llllllllllllIllIllIIIIIIlIlllIII.writeEnumValue(this.eventType);
        if (lIIlIIlIllIIlIII(this.eventType, Event.END_COMBAT)) {
            llllllllllllIllIllIIIIIIlIlllIII.writeVarIntToBuffer(this.field_179772_d);
            llllllllllllIllIllIIIIIIlIlllIII.writeInt(this.field_179775_c);
            "".length();
            "".length();
            if ("   ".length() < ((0x99 ^ 0xA3) & ~(0x2C ^ 0x16))) {
                return;
            }
        }
        else if (lIIlIIlIllIIlIII(this.eventType, Event.ENTITY_DIED)) {
            llllllllllllIllIllIIIIIIlIlllIII.writeVarIntToBuffer(this.field_179774_b);
            llllllllllllIllIllIIIIIIlIlllIII.writeInt(this.field_179775_c);
            "".length();
            llllllllllllIllIllIIIIIIlIlllIII.writeString(this.deathMessage);
            "".length();
        }
    }
    
    public S42PacketCombatEvent() {
    }
    
    static {
        lIIlIIlIllIIIllI();
    }
    
    public enum Event
    {
        ENTER_COMBAT(Event.llIIllIIllIllI[Event.llIIllIIllIlll[0]], Event.llIIllIIllIlll[0]), 
        END_COMBAT(Event.llIIllIIllIllI[Event.llIIllIIllIlll[1]], Event.llIIllIIllIlll[1]), 
        ENTITY_DIED(Event.llIIllIIllIllI[Event.llIIllIIllIlll[2]], Event.llIIllIIllIlll[2]);
        
        private static final /* synthetic */ String[] llIIllIIllIllI;
        private static final /* synthetic */ int[] llIIllIIllIlll;
        
        private static String lIIIlllIlIlllIII(final String llllllllllllIlllIIIIIlIIIlIlIlIl, final String llllllllllllIlllIIIIIlIIIlIlIIlI) {
            try {
                final SecretKeySpec llllllllllllIlllIIIIIlIIIlIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIIIlIIIlIlIIlI.getBytes(StandardCharsets.UTF_8)), Event.llIIllIIllIlll[4]), "DES");
                final Cipher llllllllllllIlllIIIIIlIIIlIlIlll = Cipher.getInstance("DES");
                llllllllllllIlllIIIIIlIIIlIlIlll.init(Event.llIIllIIllIlll[2], llllllllllllIlllIIIIIlIIIlIllIII);
                return new String(llllllllllllIlllIIIIIlIIIlIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIIIlIIIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIIIIIlIIIlIlIllI) {
                llllllllllllIlllIIIIIlIIIlIlIllI.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIIlllIlIlllIll(final int llllllllllllIlllIIIIIlIIIlIIllIl, final int llllllllllllIlllIIIIIlIIIlIIllII) {
            return llllllllllllIlllIIIIIlIIIlIIllIl < llllllllllllIlllIIIIIlIIIlIIllII;
        }
        
        static {
            lIIIlllIlIlllIlI();
            lIIIlllIlIlllIIl();
            final Event[] enum$VALUES = new Event[Event.llIIllIIllIlll[3]];
            enum$VALUES[Event.llIIllIIllIlll[0]] = Event.ENTER_COMBAT;
            enum$VALUES[Event.llIIllIIllIlll[1]] = Event.END_COMBAT;
            enum$VALUES[Event.llIIllIIllIlll[2]] = Event.ENTITY_DIED;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static String lIIIlllIlIllIllI(final String llllllllllllIlllIIIIIlIIIllllIII, final String llllllllllllIlllIIIIIlIIIllllIIl) {
            try {
                final SecretKeySpec llllllllllllIlllIIIIIlIIIlllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIIIlIIIllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlllIIIIIlIIIlllllII = Cipher.getInstance("Blowfish");
                llllllllllllIlllIIIIIlIIIlllllII.init(Event.llIIllIIllIlll[2], llllllllllllIlllIIIIIlIIIlllllIl);
                return new String(llllllllllllIlllIIIIIlIIIlllllII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIIIlIIIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIIIIIlIIIllllIll) {
                llllllllllllIlllIIIIIlIIIllllIll.printStackTrace();
                return null;
            }
        }
        
        private static void lIIIlllIlIlllIlI() {
            (llIIllIIllIlll = new int[5])[0] = ((0x65 ^ 0x45) & ~(0x6E ^ 0x4E));
            Event.llIIllIIllIlll[1] = " ".length();
            Event.llIIllIIllIlll[2] = "  ".length();
            Event.llIIllIIllIlll[3] = "   ".length();
            Event.llIIllIIllIlll[4] = (0x37 ^ 0x3F);
        }
        
        private static String lIIIlllIlIllIlll(String llllllllllllIlllIIIIIlIIIllIIlIl, final String llllllllllllIlllIIIIIlIIIllIIlII) {
            llllllllllllIlllIIIIIlIIIllIIlIl = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIIIIIlIIIllIIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlllIIIIIlIIIllIlIII = new StringBuilder();
            final char[] llllllllllllIlllIIIIIlIIIllIIlll = llllllllllllIlllIIIIIlIIIllIIlII.toCharArray();
            int llllllllllllIlllIIIIIlIIIllIIllI = Event.llIIllIIllIlll[0];
            final double llllllllllllIlllIIIIIlIIIllIIIII = (Object)((String)llllllllllllIlllIIIIIlIIIllIIlIl).toCharArray();
            final char llllllllllllIlllIIIIIlIIIlIlllll = (char)llllllllllllIlllIIIIIlIIIllIIIII.length;
            byte llllllllllllIlllIIIIIlIIIlIllllI = (byte)Event.llIIllIIllIlll[0];
            while (lIIIlllIlIlllIll(llllllllllllIlllIIIIIlIIIlIllllI, llllllllllllIlllIIIIIlIIIlIlllll)) {
                final char llllllllllllIlllIIIIIlIIIllIlIll = llllllllllllIlllIIIIIlIIIllIIIII[llllllllllllIlllIIIIIlIIIlIllllI];
                llllllllllllIlllIIIIIlIIIllIlIII.append((char)(llllllllllllIlllIIIIIlIIIllIlIll ^ llllllllllllIlllIIIIIlIIIllIIlll[llllllllllllIlllIIIIIlIIIllIIllI % llllllllllllIlllIIIIIlIIIllIIlll.length]));
                "".length();
                ++llllllllllllIlllIIIIIlIIIllIIllI;
                ++llllllllllllIlllIIIIIlIIIlIllllI;
                "".length();
                if (((0xA1 ^ 0xAA) & ~(0x72 ^ 0x79)) > 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlllIIIIIlIIIllIlIII);
        }
        
        private static void lIIIlllIlIlllIIl() {
            (llIIllIIllIllI = new String[Event.llIIllIIllIlll[3]])[Event.llIIllIIllIlll[0]] = lIIIlllIlIllIllI("sjo7NNIr0QFVqhe2LRT6+Q==", "ZFGAr");
            Event.llIIllIIllIllI[Event.llIIllIIllIlll[1]] = lIIIlllIlIllIlll("IhkUNysoGhIpPA==", "gWPhh");
            Event.llIIllIIllIllI[Event.llIIllIIllIlll[2]] = lIIIlllIlIlllIII("FuLRGNLpQUmRgcppQOuegg==", "ytWQz");
        }
        
        private Event(final String llllllllllllIlllIIIIIlIIlIIIlIll, final int llllllllllllIlllIIIIIlIIlIIIlIlI) {
        }
    }
}
