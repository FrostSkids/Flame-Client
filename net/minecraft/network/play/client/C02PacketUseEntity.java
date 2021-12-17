// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.client;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.world.World;
import net.minecraft.network.INetHandler;
import net.minecraft.entity.Entity;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.Vec3;
import net.minecraft.network.play.INetHandlerPlayServer;
import net.minecraft.network.Packet;

public class C02PacketUseEntity implements Packet<INetHandlerPlayServer>
{
    private /* synthetic */ Action action;
    private /* synthetic */ Vec3 hitVec;
    private /* synthetic */ int entityId;
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIlIIllIlllIIIIlIIlI) throws IOException {
        lllllllllllllIlIIllIlllIIIIlIIlI.writeVarIntToBuffer(this.entityId);
        lllllllllllllIlIIllIlllIIIIlIIlI.writeEnumValue(this.action);
        if (lIllIlllIlIIlIl(this.action, Action.INTERACT_AT)) {
            lllllllllllllIlIIllIlllIIIIlIIlI.writeFloat((float)this.hitVec.xCoord);
            "".length();
            lllllllllllllIlIIllIlllIIIIlIIlI.writeFloat((float)this.hitVec.yCoord);
            "".length();
            lllllllllllllIlIIllIlllIIIIlIIlI.writeFloat((float)this.hitVec.zCoord);
            "".length();
        }
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIlIIllIlllIIIIllIlI) throws IOException {
        this.entityId = lllllllllllllIlIIllIlllIIIIllIlI.readVarIntFromBuffer();
        this.action = lllllllllllllIlIIllIlllIIIIllIlI.readEnumValue(Action.class);
        if (lIllIlllIlIIlIl(this.action, Action.INTERACT_AT)) {
            this.hitVec = new Vec3(lllllllllllllIlIIllIlllIIIIllIlI.readFloat(), lllllllllllllIlIIllIlllIIIIllIlI.readFloat(), lllllllllllllIlIIllIlllIIIIllIlI.readFloat());
        }
    }
    
    public C02PacketUseEntity(final Entity lllllllllllllIlIIllIlllIIIIlllll, final Vec3 lllllllllllllIlIIllIlllIIIIllllI) {
        this(lllllllllllllIlIIllIlllIIIIlllll, Action.INTERACT_AT);
        this.hitVec = lllllllllllllIlIIllIlllIIIIllllI;
    }
    
    public C02PacketUseEntity(final Entity lllllllllllllIlIIllIlllIIIlIlIll, final Action lllllllllllllIlIIllIlllIIIlIIlll) {
        this.entityId = lllllllllllllIlIIllIlllIIIlIlIll.getEntityId();
        this.action = lllllllllllllIlIIllIlllIIIlIIlll;
    }
    
    public C02PacketUseEntity() {
    }
    
    public Vec3 getHitVec() {
        return this.hitVec;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayServer lllllllllllllIlIIllIlllIIIIIllII) {
        lllllllllllllIlIIllIlllIIIIIllII.processUseEntity(this);
    }
    
    private static boolean lIllIlllIlIIlIl(final Object lllllllllllllIlIIllIllIllllllIIl, final Object lllllllllllllIlIIllIllIllllllIII) {
        return lllllllllllllIlIIllIllIllllllIIl == lllllllllllllIlIIllIllIllllllIII;
    }
    
    public Entity getEntityFromWorld(final World lllllllllllllIlIIllIlllIIIIIlIII) {
        return lllllllllllllIlIIllIlllIIIIIlIII.getEntityByID(this.entityId);
    }
    
    public Action getAction() {
        return this.action;
    }
    
    public enum Action
    {
        private static final /* synthetic */ String[] lIllIllIlIlIll;
        
        INTERACT(Action.lIllIllIlIlIll[Action.lIllIllIlIllII[0]], Action.lIllIllIlIllII[0]), 
        INTERACT_AT(Action.lIllIllIlIlIll[Action.lIllIllIlIllII[2]], Action.lIllIllIlIllII[2]);
        
        private static final /* synthetic */ int[] lIllIllIlIllII;
        
        ATTACK(Action.lIllIllIlIlIll[Action.lIllIllIlIllII[1]], Action.lIllIllIlIllII[1]);
        
        private static void lllllllllIIIIII() {
            (lIllIllIlIllII = new int[4])[0] = ((0x3 ^ 0x31) & ~(0x7E ^ 0x4C));
            Action.lIllIllIlIllII[1] = " ".length();
            Action.lIllIllIlIllII[2] = "  ".length();
            Action.lIllIllIlIllII[3] = "   ".length();
        }
        
        private static boolean lllllllllIIIIIl(final int llllllllllllIllllllIllIlIIIIIlll, final int llllllllllllIllllllIllIlIIIIIllI) {
            return llllllllllllIllllllIllIlIIIIIlll < llllllllllllIllllllIllIlIIIIIllI;
        }
        
        private static String llllllllIlllllI(String llllllllllllIllllllIllIlIIIlIlll, final String llllllllllllIllllllIllIlIIIlIllI) {
            llllllllllllIllllllIllIlIIIlIlll = new String(Base64.getDecoder().decode(llllllllllllIllllllIllIlIIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllllllIllIlIIIlIlIl = new StringBuilder();
            final char[] llllllllllllIllllllIllIlIIIlIlII = llllllllllllIllllllIllIlIIIlIllI.toCharArray();
            int llllllllllllIllllllIllIlIIIlIIll = Action.lIllIllIlIllII[0];
            final long llllllllllllIllllllIllIlIIIIllIl = (Object)llllllllllllIllllllIllIlIIIlIlll.toCharArray();
            final char llllllllllllIllllllIllIlIIIIllII = (char)llllllllllllIllllllIllIlIIIIllIl.length;
            int llllllllllllIllllllIllIlIIIIlIll = Action.lIllIllIlIllII[0];
            while (lllllllllIIIIIl(llllllllllllIllllllIllIlIIIIlIll, llllllllllllIllllllIllIlIIIIllII)) {
                final char llllllllllllIllllllIllIlIIIllIII = llllllllllllIllllllIllIlIIIIllIl[llllllllllllIllllllIllIlIIIIlIll];
                llllllllllllIllllllIllIlIIIlIlIl.append((char)(llllllllllllIllllllIllIlIIIllIII ^ llllllllllllIllllllIllIlIIIlIlII[llllllllllllIllllllIllIlIIIlIIll % llllllllllllIllllllIllIlIIIlIlII.length]));
                "".length();
                ++llllllllllllIllllllIllIlIIIlIIll;
                ++llllllllllllIllllllIllIlIIIIlIll;
                "".length();
                if (-"  ".length() >= 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllllllIllIlIIIlIlIl);
        }
        
        private static String llllllllIllllIl(final String llllllllllllIllllllIllIlIIlIIlll, final String llllllllllllIllllllIllIlIIlIIlII) {
            try {
                final SecretKeySpec llllllllllllIllllllIllIlIIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIllIlIIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllllllIllIlIIlIlIIl = Cipher.getInstance("Blowfish");
                llllllllllllIllllllIllIlIIlIlIIl.init(Action.lIllIllIlIllII[2], llllllllllllIllllllIllIlIIlIlIlI);
                return new String(llllllllllllIllllllIllIlIIlIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIllIlIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllllIllIlIIlIlIII) {
                llllllllllllIllllllIllIlIIlIlIII.printStackTrace();
                return null;
            }
        }
        
        private static void llllllllIllllll() {
            (lIllIllIlIlIll = new String[Action.lIllIllIlIllII[3]])[Action.lIllIllIlIllII[0]] = llllllllIllllIl("+3IQA17fYBUsTQwDWU07ug==", "zAabP");
            Action.lIllIllIlIlIll[Action.lIllIllIlIllII[1]] = llllllllIlllllI("AiA8DxMI", "CthNP");
            Action.lIllIllIlIlIll[Action.lIllIllIlIllII[2]] = llllllllIlllllI("Pw0TLjQ3ABM0JyI=", "vCGkf");
        }
        
        static {
            lllllllllIIIIII();
            llllllllIllllll();
            final Action[] enum$VALUES = new Action[Action.lIllIllIlIllII[3]];
            enum$VALUES[Action.lIllIllIlIllII[0]] = Action.INTERACT;
            enum$VALUES[Action.lIllIllIlIllII[1]] = Action.ATTACK;
            enum$VALUES[Action.lIllIllIlIllII[2]] = Action.INTERACT_AT;
            ENUM$VALUES = enum$VALUES;
        }
        
        private Action(final String llllllllllllIllllllIllIlIIlllIII, final int llllllllllllIllllllIllIlIIllIlll) {
        }
    }
}
