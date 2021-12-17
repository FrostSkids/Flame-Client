// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.IChatComponent;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S2DPacketOpenWindow implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int entityId;
    private /* synthetic */ int slotCount;
    private static final /* synthetic */ int[] lIlIlIIIlIIlIl;
    private static final /* synthetic */ String[] lIlIlIIIlIIlII;
    private /* synthetic */ int windowId;
    private /* synthetic */ IChatComponent windowTitle;
    private /* synthetic */ String inventoryType;
    
    public S2DPacketOpenWindow(final int lllllllllllllIIIlIlIlIllllIllIlI, final String lllllllllllllIIIlIlIlIllllIllIIl, final IChatComponent lllllllllllllIIIlIlIlIllllIllIII, final int lllllllllllllIIIlIlIlIllllIlIIIl, final int lllllllllllllIIIlIlIlIllllIlIllI) {
        this(lllllllllllllIIIlIlIlIllllIllIlI, lllllllllllllIIIlIlIlIllllIllIIl, lllllllllllllIIIlIlIlIllllIllIII, lllllllllllllIIIlIlIlIllllIlIIIl);
        this.entityId = lllllllllllllIIIlIlIlIllllIlIllI;
    }
    
    private static boolean lllIlIllIllIIII(final int lllllllllllllIIIlIlIlIllIllllIll) {
        return lllllllllllllIIIlIlIlIllIllllIll > 0;
    }
    
    public S2DPacketOpenWindow() {
    }
    
    private static void lllIlIllIlIllIl() {
        (lIlIlIIIlIIlII = new String[S2DPacketOpenWindow.lIlIlIIIlIIlIl[3]])[S2DPacketOpenWindow.lIlIlIIIlIIlIl[0]] = lllIlIllIlIlIll("XfDQtT2xz+49mW/xM3DpFg==", "BvAvN");
        S2DPacketOpenWindow.lIlIlIIIlIIlII[S2DPacketOpenWindow.lIlIlIIIlIIlIl[2]] = lllIlIllIlIllII("MDoxPBkMHConHhA=", "uTEUm");
    }
    
    private static String lllIlIllIlIlIll(final String lllllllllllllIIIlIlIlIlllIIllllI, final String lllllllllllllIIIlIlIlIlllIIlllIl) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlIlIlllIlIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlIlIlllIIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIlIlIlllIlIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIlIlIlllIlIIIlI.init(S2DPacketOpenWindow.lIlIlIIIlIIlIl[3], lllllllllllllIIIlIlIlIlllIlIIIll);
            return new String(lllllllllllllIIIlIlIlIlllIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlIlIlllIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlIlIlllIlIIIIl) {
            lllllllllllllIIIlIlIlIlllIlIIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIIlIlIlIlllIlllllI) throws IOException {
        lllllllllllllIIIlIlIlIlllIlllllI.writeByte(this.windowId);
        "".length();
        lllllllllllllIIIlIlIlIlllIlllllI.writeString(this.inventoryType);
        "".length();
        lllllllllllllIIIlIlIlIlllIlllllI.writeChatComponent(this.windowTitle);
        lllllllllllllIIIlIlIlIlllIlllllI.writeByte(this.slotCount);
        "".length();
        if (lllIlIllIlIllll(this.inventoryType.equals(S2DPacketOpenWindow.lIlIlIIIlIIlII[S2DPacketOpenWindow.lIlIlIIIlIIlIl[2]]) ? 1 : 0)) {
            lllllllllllllIIIlIlIlIlllIlllllI.writeInt(this.entityId);
            "".length();
        }
    }
    
    private static boolean lllIlIllIlIllll(final int lllllllllllllIIIlIlIlIllIlllllIl) {
        return lllllllllllllIIIlIlIlIllIlllllIl != 0;
    }
    
    public String getGuiId() {
        return this.inventoryType;
    }
    
    public S2DPacketOpenWindow(final int lllllllllllllIIIlIlIlIlllllIlIlI, final String lllllllllllllIIIlIlIlIlllllIIlII, final IChatComponent lllllllllllllIIIlIlIlIlllllIIIll, final int lllllllllllllIIIlIlIlIlllllIIIlI) {
        this.windowId = lllllllllllllIIIlIlIlIlllllIlIlI;
        this.inventoryType = lllllllllllllIIIlIlIlIlllllIIlII;
        this.windowTitle = lllllllllllllIIIlIlIlIlllllIIIll;
        this.slotCount = lllllllllllllIIIlIlIlIlllllIIIlI;
    }
    
    public IChatComponent getWindowTitle() {
        return this.windowTitle;
    }
    
    private static boolean lllIlIllIllIIIl(final int lllllllllllllIIIlIlIlIlllIIIIIII, final int lllllllllllllIIIlIlIlIllIlllllll) {
        return lllllllllllllIIIlIlIlIlllIIIIIII < lllllllllllllIIIlIlIlIllIlllllll;
    }
    
    static {
        lllIlIllIlIlllI();
        lllIlIllIlIllIl();
    }
    
    public boolean hasSlots() {
        if (lllIlIllIllIIII(this.slotCount)) {
            return S2DPacketOpenWindow.lIlIlIIIlIIlIl[2] != 0;
        }
        return S2DPacketOpenWindow.lIlIlIIIlIIlIl[0] != 0;
    }
    
    public S2DPacketOpenWindow(final int lllllllllllllIIIlIlIlIllllllIIll, final String lllllllllllllIIIlIlIlIllllllIllI, final IChatComponent lllllllllllllIIIlIlIlIllllllIIIl) {
        this(lllllllllllllIIIlIlIlIllllllIIll, lllllllllllllIIIlIlIlIllllllIllI, lllllllllllllIIIlIlIlIllllllIIIl, S2DPacketOpenWindow.lIlIlIIIlIIlIl[0]);
    }
    
    public int getWindowId() {
        return this.windowId;
    }
    
    public int getEntityId() {
        return this.entityId;
    }
    
    public int getSlotCount() {
        return this.slotCount;
    }
    
    private static void lllIlIllIlIlllI() {
        (lIlIlIIIlIIlIl = new int[4])[0] = ((0x75 ^ 0x53) & ~(0xE1 ^ 0xC7));
        S2DPacketOpenWindow.lIlIlIIIlIIlIl[1] = (140 + 24 - 134 + 155 ^ 43 + 6 + 44 + 60);
        S2DPacketOpenWindow.lIlIlIIIlIIlIl[2] = " ".length();
        S2DPacketOpenWindow.lIlIlIIIlIIlIl[3] = "  ".length();
    }
    
    private static String lllIlIllIlIllII(String lllllllllllllIIIlIlIlIlllIIIlIll, final String lllllllllllllIIIlIlIlIlllIIIllll) {
        lllllllllllllIIIlIlIlIlllIIIlIll = new String(Base64.getDecoder().decode(lllllllllllllIIIlIlIlIlllIIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIlIlIlllIIIlllI = new StringBuilder();
        final char[] lllllllllllllIIIlIlIlIlllIIIllIl = lllllllllllllIIIlIlIlIlllIIIllll.toCharArray();
        int lllllllllllllIIIlIlIlIlllIIIllII = S2DPacketOpenWindow.lIlIlIIIlIIlIl[0];
        final char lllllllllllllIIIlIlIlIlllIIIIllI = (Object)lllllllllllllIIIlIlIlIlllIIIlIll.toCharArray();
        final boolean lllllllllllllIIIlIlIlIlllIIIIlIl = lllllllllllllIIIlIlIlIlllIIIIllI.length != 0;
        Exception lllllllllllllIIIlIlIlIlllIIIIlII = (Exception)S2DPacketOpenWindow.lIlIlIIIlIIlIl[0];
        while (lllIlIllIllIIIl((int)lllllllllllllIIIlIlIlIlllIIIIlII, lllllllllllllIIIlIlIlIlllIIIIlIl ? 1 : 0)) {
            final char lllllllllllllIIIlIlIlIlllIIlIIIl = lllllllllllllIIIlIlIlIlllIIIIllI[lllllllllllllIIIlIlIlIlllIIIIlII];
            lllllllllllllIIIlIlIlIlllIIIlllI.append((char)(lllllllllllllIIIlIlIlIlllIIlIIIl ^ lllllllllllllIIIlIlIlIlllIIIllIl[lllllllllllllIIIlIlIlIlllIIIllII % lllllllllllllIIIlIlIlIlllIIIllIl.length]));
            "".length();
            ++lllllllllllllIIIlIlIlIlllIIIllII;
            ++lllllllllllllIIIlIlIlIlllIIIIlII;
            "".length();
            if (-(0x57 ^ 0x46 ^ (0x6F ^ 0x7A)) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIlIlIlllIIIlllI);
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIIIlIlIlIllllIIlIlI) {
        lllllllllllllIIIlIlIlIllllIIlIlI.handleOpenWindow(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIIlIlIlIllllIIIllI) throws IOException {
        this.windowId = lllllllllllllIIIlIlIlIllllIIIllI.readUnsignedByte();
        this.inventoryType = lllllllllllllIIIlIlIlIllllIIIllI.readStringFromBuffer(S2DPacketOpenWindow.lIlIlIIIlIIlIl[1]);
        this.windowTitle = lllllllllllllIIIlIlIlIllllIIIllI.readChatComponent();
        this.slotCount = lllllllllllllIIIlIlIlIllllIIIllI.readUnsignedByte();
        if (lllIlIllIlIllll(this.inventoryType.equals(S2DPacketOpenWindow.lIlIlIIIlIIlII[S2DPacketOpenWindow.lIlIlIIIlIIlIl[0]]) ? 1 : 0)) {
            this.entityId = lllllllllllllIIIlIlIlIllllIIIllI.readInt();
        }
    }
}
