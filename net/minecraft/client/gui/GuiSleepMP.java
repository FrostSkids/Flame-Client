// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.Packet;
import net.minecraft.entity.Entity;
import net.minecraft.network.play.client.C0BPacketEntityAction;
import net.minecraft.client.resources.I18n;
import java.io.IOException;

public class GuiSleepMP extends GuiChat
{
    private static final /* synthetic */ String[] lIIIlIllIlIlII;
    private static final /* synthetic */ int[] lIIIlIllIlIlIl;
    
    private static boolean llIIIIIllllIIlI(final int lllllllllllllIlIIIIlIlIllIIIIIll) {
        return lllllllllllllIlIIIIlIlIllIIIIIll == 0;
    }
    
    private static boolean llIIIIIllllIIIl(final int lllllllllllllIlIIIIlIlIllIIIIIII, final int lllllllllllllIlIIIIlIlIlIlllllll) {
        return lllllllllllllIlIIIIlIlIllIIIIIII != lllllllllllllIlIIIIlIlIlIlllllll;
    }
    
    static {
        llIIIIIlllIllll();
        llIIIIIlllIlllI();
    }
    
    @Override
    protected void actionPerformed(final GuiButton lllllllllllllIlIIIIlIlIllIIlllII) throws IOException {
        if (llIIIIIllllIIII(lllllllllllllIlIIIIlIlIllIIlllII.id, GuiSleepMP.lIIIlIllIlIlIl[0])) {
            this.wakeFromSleep();
            "".length();
            if (-(48 + 118 - 157 + 137 ^ 88 + 133 - 186 + 115) >= 0) {
                return;
            }
        }
        else {
            super.actionPerformed(lllllllllllllIlIIIIlIlIllIIlllII);
        }
    }
    
    private static void llIIIIIlllIlllI() {
        (lIIIlIllIlIlII = new String[GuiSleepMP.lIIIlIllIlIlIl[1]])[GuiSleepMP.lIIIlIllIlIlIl[4]] = llIIIIIlllIllIl("kOevelDCgXXjgjDDYnsd182uvkC72QZGgWqODqnuPHM=", "RIXcg");
        GuiSleepMP.lIIIlIllIlIlII[GuiSleepMP.lIIIlIllIlIlIl[0]] = llIIIIIlllIllIl("levtVhnygLI=", "BFBDO");
    }
    
    @Override
    protected void keyTyped(final char lllllllllllllIlIIIIlIlIllIlIIlII, final int lllllllllllllIlIIIIlIlIllIlIIIll) throws IOException {
        if (llIIIIIllllIIII(lllllllllllllIlIIIIlIlIllIlIIIll, GuiSleepMP.lIIIlIllIlIlIl[0])) {
            this.wakeFromSleep();
            "".length();
            if ("  ".length() < -" ".length()) {
                return;
            }
        }
        else if (llIIIIIllllIIIl(lllllllllllllIlIIIIlIlIllIlIIIll, GuiSleepMP.lIIIlIllIlIlIl[5]) && llIIIIIllllIIIl(lllllllllllllIlIIIIlIlIllIlIIIll, GuiSleepMP.lIIIlIllIlIlIl[6])) {
            super.keyTyped(lllllllllllllIlIIIIlIlIllIlIIlII, lllllllllllllIlIIIIlIlIllIlIIIll);
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
        else {
            final String lllllllllllllIlIIIIlIlIllIlIIllI = this.inputField.getText().trim();
            if (llIIIIIllllIIlI(lllllllllllllIlIIIIlIlIllIlIIllI.isEmpty() ? 1 : 0)) {
                this.mc.thePlayer.sendChatMessage(lllllllllllllIlIIIIlIlIllIlIIllI);
            }
            this.inputField.setText(GuiSleepMP.lIIIlIllIlIlII[GuiSleepMP.lIIIlIllIlIlIl[0]]);
            this.mc.ingameGUI.getChatGUI().resetScroll();
        }
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.buttonList.add(new GuiButton(GuiSleepMP.lIIIlIllIlIlIl[0], this.width / GuiSleepMP.lIIIlIllIlIlIl[1] - GuiSleepMP.lIIIlIllIlIlIl[2], this.height - GuiSleepMP.lIIIlIllIlIlIl[3], I18n.format(GuiSleepMP.lIIIlIllIlIlII[GuiSleepMP.lIIIlIllIlIlIl[4]], new Object[GuiSleepMP.lIIIlIllIlIlIl[4]])));
        "".length();
    }
    
    private void wakeFromSleep() {
        final NetHandlerPlayClient lllllllllllllIlIIIIlIlIllIIllIII = this.mc.thePlayer.sendQueue;
        lllllllllllllIlIIIIlIlIllIIllIII.addToSendQueue(new C0BPacketEntityAction(this.mc.thePlayer, C0BPacketEntityAction.Action.STOP_SLEEPING));
    }
    
    private static void llIIIIIlllIllll() {
        (lIIIlIllIlIlIl = new int[8])[0] = " ".length();
        GuiSleepMP.lIIIlIllIlIlIl[1] = "  ".length();
        GuiSleepMP.lIIIlIllIlIlIl[2] = (13 + 171 - 127 + 161 ^ 61 + 126 - 70 + 73);
        GuiSleepMP.lIIIlIllIlIlIl[3] = (0x25 ^ 0x22 ^ (0x13 ^ 0x3C));
        GuiSleepMP.lIIIlIllIlIlIl[4] = ((0x1F ^ 0x58) & ~(0x85 ^ 0xC2));
        GuiSleepMP.lIIIlIllIlIlIl[5] = (48 + 88 - 126 + 119 ^ 0 + 52 - 50 + 155);
        GuiSleepMP.lIIIlIllIlIlIl[6] = 65 + 106 - 106 + 91;
        GuiSleepMP.lIIIlIllIlIlIl[7] = (0x87 ^ 0x8F);
    }
    
    private static boolean llIIIIIllllIIII(final int lllllllllllllIlIIIIlIlIllIIIIllI, final int lllllllllllllIlIIIIlIlIllIIIIlIl) {
        return lllllllllllllIlIIIIlIlIllIIIIllI == lllllllllllllIlIIIIlIlIllIIIIlIl;
    }
    
    private static String llIIIIIlllIllIl(final String lllllllllllllIlIIIIlIlIllIIIllII, final String lllllllllllllIlIIIIlIlIllIIIlIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIlIlIllIIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIlIlIllIIIlIll.getBytes(StandardCharsets.UTF_8)), GuiSleepMP.lIIIlIllIlIlIl[7]), "DES");
            final Cipher lllllllllllllIlIIIIlIlIllIIlIIII = Cipher.getInstance("DES");
            lllllllllllllIlIIIIlIlIllIIlIIII.init(GuiSleepMP.lIIIlIllIlIlIl[1], lllllllllllllIlIIIIlIlIllIIlIIIl);
            return new String(lllllllllllllIlIIIIlIlIllIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIlIlIllIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIlIlIllIIIllll) {
            lllllllllllllIlIIIIlIlIllIIIllll.printStackTrace();
            return null;
        }
    }
}
