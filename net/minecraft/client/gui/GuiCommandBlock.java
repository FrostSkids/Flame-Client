// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.util.List;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.lwjgl.input.Keyboard;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.IChatComponent;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C17PacketCustomPayload;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.PacketBuffer;
import io.netty.buffer.Unpooled;
import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import org.apache.logging.log4j.Logger;
import net.minecraft.command.server.CommandBlockLogic;

public class GuiCommandBlock extends GuiScreen
{
    private final /* synthetic */ CommandBlockLogic localCommandBlock;
    private /* synthetic */ GuiButton doneBtn;
    private static final /* synthetic */ int[] llIIIllIllIIII;
    private /* synthetic */ GuiButton cancelBtn;
    private /* synthetic */ boolean field_175389_t;
    private /* synthetic */ GuiTextField previousOutputTextField;
    private static final /* synthetic */ String[] llIIIllIlIllIl;
    private /* synthetic */ GuiButton field_175390_s;
    private /* synthetic */ GuiTextField commandTextField;
    
    public GuiCommandBlock(final CommandBlockLogic llllllllllllIlllIlIIlIIlIIIllIII) {
        this.localCommandBlock = llllllllllllIlllIlIIlIIlIIIllIII;
    }
    
    @Override
    protected void mouseClicked(final int llllllllllllIlllIlIIlIIIlllllIIl, final int llllllllllllIlllIlIIlIIIllllIlII, final int llllllllllllIlllIlIIlIIIllllIIll) throws IOException {
        super.mouseClicked(llllllllllllIlllIlIIlIIIlllllIIl, llllllllllllIlllIlIIlIIIllllIlII, llllllllllllIlllIlIIlIIIllllIIll);
        this.commandTextField.mouseClicked(llllllllllllIlllIlIIlIIIlllllIIl, llllllllllllIlllIlIIlIIIllllIlII, llllllllllllIlllIlIIlIIIllllIIll);
        this.previousOutputTextField.mouseClicked(llllllllllllIlllIlIIlIIIlllllIIl, llllllllllllIlllIlIIlIIIllllIlII, llllllllllllIlllIlIIlIIIllllIIll);
    }
    
    private static boolean lIIIlIlIlIIIlIII(final int llllllllllllIlllIlIIlIIIlIIllIIl, final int llllllllllllIlllIlIIlIIIlIIllIII) {
        return llllllllllllIlllIlIIlIIIlIIllIIl != llllllllllllIlllIlIIlIIIlIIllIII;
    }
    
    private static boolean lIIIlIlIlIIIlIlI(final int llllllllllllIlllIlIIlIIIlIlIIlIl, final int llllllllllllIlllIlIIlIIIlIlIIlII) {
        return llllllllllllIlllIlIIlIIIlIlIIlIl < llllllllllllIlllIlIIlIIIlIlIIlII;
    }
    
    private static void lIIIlIlIlIIIIIll() {
        (llIIIllIllIIII = new int[30])[0] = " ".length();
        GuiCommandBlock.llIIIllIllIIII[1] = ((0x23 ^ 0x7B) & ~(0x1E ^ 0x46));
        GuiCommandBlock.llIIIllIllIIII[2] = "  ".length();
        GuiCommandBlock.llIIIllIllIIII[3] = (0x61 ^ 0x78 ^ (0x26 ^ 0x3B));
        GuiCommandBlock.llIIIllIllIIII[4] = (0x17 ^ 0x5C) + (0xD8 ^ 0xB2) - (0x6D ^ 0x39) + (0x57 ^ 0x62);
        GuiCommandBlock.llIIIllIllIIII[5] = (0x7F ^ 0x4D ^ (0x21 ^ 0x6B));
        GuiCommandBlock.llIIIllIllIIII[6] = (0xA3 ^ 0xAF);
        GuiCommandBlock.llIIIllIllIIII[7] = (136 + 7 - 8 + 26 ^ 158 + 123 - 136 + 36);
        GuiCommandBlock.llIIIllIllIIII[8] = (0xA ^ 0x38);
        GuiCommandBlock.llIIIllIllIIII[9] = (-(0xFFFFDE8F & 0x75F3) & (0xFFFFD7BE & 0x7DEF));
        GuiCommandBlock.llIIIllIllIIII[10] = (-" ".length() & (-1 & 0x7FFF));
        GuiCommandBlock.llIIIllIllIIII[11] = "   ".length();
        GuiCommandBlock.llIIIllIllIIII[12] = (0xFFFFE53C & 0x1BD7);
        GuiCommandBlock.llIIIllIllIIII[13] = (0x36 ^ 0x3F ^ (0x31 ^ 0x24));
        GuiCommandBlock.llIIIllIllIIII[14] = 154 + 43 - 133 + 92;
        GuiCommandBlock.llIIIllIllIIII[15] = (0xF8 ^ 0xC4 ^ (0x10 ^ 0x29));
        GuiCommandBlock.llIIIllIllIIII[16] = (-" ".length() & (-1 & 0xFFFFFF));
        GuiCommandBlock.llIIIllIllIIII[17] = (0xA4 ^ 0xA2);
        GuiCommandBlock.llIIIllIllIIII[18] = (0x86 ^ 0x89 ^ (0xB3 ^ 0x99));
        GuiCommandBlock.llIIIllIllIIII[19] = (0xFFFFF0F4 & 0xA0AFAB);
        GuiCommandBlock.llIIIllIllIIII[20] = (0x64 ^ 0x2F);
        GuiCommandBlock.llIIIllIllIIII[21] = (0x2E ^ 0x29);
        GuiCommandBlock.llIIIllIllIIII[22] = (142 + 193 - 299 + 169 ^ 19 + 5 + 133 + 40);
        GuiCommandBlock.llIIIllIllIIII[23] = (0x54 ^ 0x5D);
        GuiCommandBlock.llIIIllIllIIII[24] = (0xBE ^ 0xB4);
        GuiCommandBlock.llIIIllIllIIII[25] = (0xCB ^ 0xC0);
        GuiCommandBlock.llIIIllIllIIII[26] = (0xB8 ^ 0xA8);
        GuiCommandBlock.llIIIllIllIIII[27] = (0x57 ^ 0x5A);
        GuiCommandBlock.llIIIllIllIIII[28] = (30 + 98 - 31 + 81 ^ 111 + 30 + 20 + 27);
        GuiCommandBlock.llIIIllIllIIII[29] = (0x25 ^ 0x1C ^ (0x12 ^ 0x24));
    }
    
    static {
        lIIIlIlIlIIIIIll();
        lIIIlIlIIllllllI();
        field_146488_a = LogManager.getLogger();
    }
    
    @Override
    protected void actionPerformed(final GuiButton llllllllllllIlllIlIIlIIlIIIIllII) throws IOException {
        if (lIIIlIlIlIIIIlIl(llllllllllllIlllIlIIlIIlIIIIllII.enabled ? 1 : 0)) {
            if (lIIIlIlIlIIIIllI(llllllllllllIlllIlIIlIIlIIIIllII.id, GuiCommandBlock.llIIIllIllIIII[0])) {
                this.localCommandBlock.setTrackOutput(this.field_175389_t);
                this.mc.displayGuiScreen(null);
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
            }
            else if (lIIIlIlIlIIIIlll(llllllllllllIlllIlIIlIIlIIIIllII.id)) {
                final PacketBuffer llllllllllllIlllIlIIlIIlIIIIlIll = new PacketBuffer(Unpooled.buffer());
                llllllllllllIlllIlIIlIIlIIIIlIll.writeByte(this.localCommandBlock.func_145751_f());
                "".length();
                this.localCommandBlock.func_145757_a(llllllllllllIlllIlIIlIIlIIIIlIll);
                llllllllllllIlllIlIIlIIlIIIIlIll.writeString(this.commandTextField.getText());
                "".length();
                llllllllllllIlllIlIIlIIlIIIIlIll.writeBoolean(this.localCommandBlock.shouldTrackOutput());
                "".length();
                this.mc.getNetHandler().addToSendQueue(new C17PacketCustomPayload(GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[3]], llllllllllllIlllIlIIlIIlIIIIlIll));
                if (lIIIlIlIlIIIIlll(this.localCommandBlock.shouldTrackOutput() ? 1 : 0)) {
                    this.localCommandBlock.setLastOutput(null);
                }
                this.mc.displayGuiScreen(null);
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
            }
            else if (lIIIlIlIlIIIIllI(llllllllllllIlllIlIIlIIlIIIIllII.id, GuiCommandBlock.llIIIllIllIIII[3])) {
                final CommandBlockLogic localCommandBlock = this.localCommandBlock;
                int trackOutput;
                if (lIIIlIlIlIIIIlIl(this.localCommandBlock.shouldTrackOutput() ? 1 : 0)) {
                    trackOutput = GuiCommandBlock.llIIIllIllIIII[1];
                    "".length();
                    if (((0xD1 ^ 0xC3) & ~(0x86 ^ 0x94)) != 0x0) {
                        return;
                    }
                }
                else {
                    trackOutput = GuiCommandBlock.llIIIllIllIIII[0];
                }
                localCommandBlock.setTrackOutput((boolean)(trackOutput != 0));
                this.func_175388_a();
            }
        }
    }
    
    @Override
    public void drawScreen(final int llllllllllllIlllIlIIlIIIlllIIlIl, final int llllllllllllIlllIlIIlIIIlllIlIlI, final float llllllllllllIlllIlIIlIIIlllIlIIl) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, I18n.format(GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[15]], new Object[GuiCommandBlock.llIIIllIllIIII[1]]), this.width / GuiCommandBlock.llIIIllIllIIII[2], GuiCommandBlock.llIIIllIllIIII[7], GuiCommandBlock.llIIIllIllIIII[16]);
        this.drawString(this.fontRendererObj, I18n.format(GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[17]], new Object[GuiCommandBlock.llIIIllIllIIII[1]]), this.width / GuiCommandBlock.llIIIllIllIIII[2] - GuiCommandBlock.llIIIllIllIIII[4], GuiCommandBlock.llIIIllIllIIII[18], GuiCommandBlock.llIIIllIllIIII[19]);
        this.commandTextField.drawTextBox();
        int llllllllllllIlllIlIIlIIIlllIlIII = GuiCommandBlock.llIIIllIllIIII[20];
        int llllllllllllIlllIlIIlIIIlllIIlll = GuiCommandBlock.llIIIllIllIIII[1];
        this.drawString(this.fontRendererObj, I18n.format(GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[21]], new Object[GuiCommandBlock.llIIIllIllIIII[1]]), this.width / GuiCommandBlock.llIIIllIllIIII[2] - GuiCommandBlock.llIIIllIllIIII[4], llllllllllllIlllIlIIlIIIlllIlIII + llllllllllllIlllIlIIlIIIlllIIlll++ * this.fontRendererObj.FONT_HEIGHT, GuiCommandBlock.llIIIllIllIIII[19]);
        this.drawString(this.fontRendererObj, I18n.format(GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[22]], new Object[GuiCommandBlock.llIIIllIllIIII[1]]), this.width / GuiCommandBlock.llIIIllIllIIII[2] - GuiCommandBlock.llIIIllIllIIII[4], llllllllllllIlllIlIIlIIIlllIlIII + llllllllllllIlllIlIIlIIIlllIIlll++ * this.fontRendererObj.FONT_HEIGHT, GuiCommandBlock.llIIIllIllIIII[19]);
        this.drawString(this.fontRendererObj, I18n.format(GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[23]], new Object[GuiCommandBlock.llIIIllIllIIII[1]]), this.width / GuiCommandBlock.llIIIllIllIIII[2] - GuiCommandBlock.llIIIllIllIIII[4], llllllllllllIlllIlIIlIIIlllIlIII + llllllllllllIlllIlIIlIIIlllIIlll++ * this.fontRendererObj.FONT_HEIGHT, GuiCommandBlock.llIIIllIllIIII[19]);
        this.drawString(this.fontRendererObj, I18n.format(GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[24]], new Object[GuiCommandBlock.llIIIllIllIIII[1]]), this.width / GuiCommandBlock.llIIIllIllIIII[2] - GuiCommandBlock.llIIIllIllIIII[4], llllllllllllIlllIlIIlIIIlllIlIII + llllllllllllIlllIlIIlIIIlllIIlll++ * this.fontRendererObj.FONT_HEIGHT, GuiCommandBlock.llIIIllIllIIII[19]);
        this.drawString(this.fontRendererObj, GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[25]], this.width / GuiCommandBlock.llIIIllIllIIII[2] - GuiCommandBlock.llIIIllIllIIII[4], llllllllllllIlllIlIIlIIIlllIlIII + llllllllllllIlllIlIIlIIIlllIIlll++ * this.fontRendererObj.FONT_HEIGHT, GuiCommandBlock.llIIIllIllIIII[19]);
        if (lIIIlIlIlIIIIlII(this.previousOutputTextField.getText().length())) {
            llllllllllllIlllIlIIlIIIlllIlIII = llllllllllllIlllIlIIlIIIlllIlIII + llllllllllllIlllIlIIlIIIlllIIlll * this.fontRendererObj.FONT_HEIGHT + GuiCommandBlock.llIIIllIllIIII[26];
            this.drawString(this.fontRendererObj, I18n.format(GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[6]], new Object[GuiCommandBlock.llIIIllIllIIII[1]]), this.width / GuiCommandBlock.llIIIllIllIIII[2] - GuiCommandBlock.llIIIllIllIIII[4], llllllllllllIlllIlIIlIIIlllIlIII, GuiCommandBlock.llIIIllIllIIII[19]);
            this.previousOutputTextField.drawTextBox();
        }
        super.drawScreen(llllllllllllIlllIlIIlIIIlllIIlIl, llllllllllllIlllIlIIlIIIlllIlIlI, llllllllllllIlllIlIIlIIIlllIlIIl);
    }
    
    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)(GuiCommandBlock.llIIIllIllIIII[1] != 0));
    }
    
    private static String lIIIlIlIIllllIIl(String llllllllllllIlllIlIIlIIIllIIIIIl, final String llllllllllllIlllIlIIlIIIllIIIIII) {
        llllllllllllIlllIlIIlIIIllIIIIIl = new String(Base64.getDecoder().decode(llllllllllllIlllIlIIlIIIllIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlIIlIIIllIIIlII = new StringBuilder();
        final char[] llllllllllllIlllIlIIlIIIllIIIIll = llllllllllllIlllIlIIlIIIllIIIIII.toCharArray();
        int llllllllllllIlllIlIIlIIIllIIIIlI = GuiCommandBlock.llIIIllIllIIII[1];
        final boolean llllllllllllIlllIlIIlIIIlIllllII = (Object)llllllllllllIlllIlIIlIIIllIIIIIl.toCharArray();
        final char llllllllllllIlllIlIIlIIIlIlllIll = (char)llllllllllllIlllIlIIlIIIlIllllII.length;
        long llllllllllllIlllIlIIlIIIlIlllIlI = GuiCommandBlock.llIIIllIllIIII[1];
        while (lIIIlIlIlIIIlIlI((int)llllllllllllIlllIlIIlIIIlIlllIlI, llllllllllllIlllIlIIlIIIlIlllIll)) {
            final char llllllllllllIlllIlIIlIIIllIIIlll = llllllllllllIlllIlIIlIIIlIllllII[llllllllllllIlllIlIIlIIIlIlllIlI];
            llllllllllllIlllIlIIlIIIllIIIlII.append((char)(llllllllllllIlllIlIIlIIIllIIIlll ^ llllllllllllIlllIlIIlIIIllIIIIll[llllllllllllIlllIlIIlIIIllIIIIlI % llllllllllllIlllIlIIlIIIllIIIIll.length]));
            "".length();
            ++llllllllllllIlllIlIIlIIIllIIIIlI;
            ++llllllllllllIlllIlIIlIIIlIlllIlI;
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlIIlIIIllIIIlII);
    }
    
    @Override
    protected void keyTyped(final char llllllllllllIlllIlIIlIIlIIIIIIII, final int llllllllllllIlllIlIIlIIlIIIIIIlI) throws IOException {
        this.commandTextField.textboxKeyTyped(llllllllllllIlllIlIIlIIlIIIIIIII, llllllllllllIlllIlIIlIIlIIIIIIlI);
        "".length();
        this.previousOutputTextField.textboxKeyTyped(llllllllllllIlllIlIIlIIlIIIIIIII, llllllllllllIlllIlIIlIIlIIIIIIlI);
        "".length();
        final GuiButton doneBtn = this.doneBtn;
        int enabled;
        if (lIIIlIlIlIIIIlII(this.commandTextField.getText().trim().length())) {
            enabled = GuiCommandBlock.llIIIllIllIIII[0];
            "".length();
            if (" ".length() > " ".length()) {
                return;
            }
        }
        else {
            enabled = GuiCommandBlock.llIIIllIllIIII[1];
        }
        doneBtn.enabled = (enabled != 0);
        if (lIIIlIlIlIIIlIII(llllllllllllIlllIlIIlIIlIIIIIIlI, GuiCommandBlock.llIIIllIllIIII[13]) && lIIIlIlIlIIIlIII(llllllllllllIlllIlIIlIIlIIIIIIlI, GuiCommandBlock.llIIIllIllIIII[14])) {
            if (lIIIlIlIlIIIIllI(llllllllllllIlllIlIIlIIlIIIIIIlI, GuiCommandBlock.llIIIllIllIIII[0])) {
                this.actionPerformed(this.cancelBtn);
                "".length();
                if (null != null) {
                    return;
                }
            }
        }
        else {
            this.actionPerformed(this.doneBtn);
        }
    }
    
    private static boolean lIIIlIlIlIIIIlII(final int llllllllllllIlllIlIIlIIIlIIlllII) {
        return llllllllllllIlllIlIIlIIIlIIlllII > 0;
    }
    
    @Override
    public void initGui() {
        Keyboard.enableRepeatEvents((boolean)(GuiCommandBlock.llIIIllIllIIII[0] != 0));
        this.buttonList.clear();
        final List<GuiButton> buttonList = this.buttonList;
        final GuiButton doneBtn = new GuiButton(GuiCommandBlock.llIIIllIllIIII[1], this.width / GuiCommandBlock.llIIIllIllIIII[2] - GuiCommandBlock.llIIIllIllIIII[3] - GuiCommandBlock.llIIIllIllIIII[4], this.height / GuiCommandBlock.llIIIllIllIIII[3] + GuiCommandBlock.llIIIllIllIIII[5] + GuiCommandBlock.llIIIllIllIIII[6], GuiCommandBlock.llIIIllIllIIII[4], GuiCommandBlock.llIIIllIllIIII[7], I18n.format(GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[1]], new Object[GuiCommandBlock.llIIIllIllIIII[1]]));
        this.doneBtn = doneBtn;
        buttonList.add(doneBtn);
        "".length();
        final List<GuiButton> buttonList2 = this.buttonList;
        final GuiButton cancelBtn = new GuiButton(GuiCommandBlock.llIIIllIllIIII[0], this.width / GuiCommandBlock.llIIIllIllIIII[2] + GuiCommandBlock.llIIIllIllIIII[3], this.height / GuiCommandBlock.llIIIllIllIIII[3] + GuiCommandBlock.llIIIllIllIIII[5] + GuiCommandBlock.llIIIllIllIIII[6], GuiCommandBlock.llIIIllIllIIII[4], GuiCommandBlock.llIIIllIllIIII[7], I18n.format(GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[0]], new Object[GuiCommandBlock.llIIIllIllIIII[1]]));
        this.cancelBtn = cancelBtn;
        buttonList2.add(cancelBtn);
        "".length();
        final List<GuiButton> buttonList3 = this.buttonList;
        final GuiButton field_175390_s = new GuiButton(GuiCommandBlock.llIIIllIllIIII[3], this.width / GuiCommandBlock.llIIIllIllIIII[2] + GuiCommandBlock.llIIIllIllIIII[4] - GuiCommandBlock.llIIIllIllIIII[7], GuiCommandBlock.llIIIllIllIIII[4], GuiCommandBlock.llIIIllIllIIII[7], GuiCommandBlock.llIIIllIllIIII[7], GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[2]]);
        this.field_175390_s = field_175390_s;
        buttonList3.add(field_175390_s);
        "".length();
        this.commandTextField = new GuiTextField(GuiCommandBlock.llIIIllIllIIII[2], this.fontRendererObj, this.width / GuiCommandBlock.llIIIllIllIIII[2] - GuiCommandBlock.llIIIllIllIIII[4], GuiCommandBlock.llIIIllIllIIII[8], GuiCommandBlock.llIIIllIllIIII[9], GuiCommandBlock.llIIIllIllIIII[7]);
        this.commandTextField.setMaxStringLength(GuiCommandBlock.llIIIllIllIIII[10]);
        this.commandTextField.setFocused((boolean)(GuiCommandBlock.llIIIllIllIIII[0] != 0));
        this.commandTextField.setText(this.localCommandBlock.getCommand());
        this.previousOutputTextField = new GuiTextField(GuiCommandBlock.llIIIllIllIIII[11], this.fontRendererObj, this.width / GuiCommandBlock.llIIIllIllIIII[2] - GuiCommandBlock.llIIIllIllIIII[4], GuiCommandBlock.llIIIllIllIIII[4], GuiCommandBlock.llIIIllIllIIII[12], GuiCommandBlock.llIIIllIllIIII[7]);
        this.previousOutputTextField.setMaxStringLength(GuiCommandBlock.llIIIllIllIIII[10]);
        this.previousOutputTextField.setEnabled((boolean)(GuiCommandBlock.llIIIllIllIIII[1] != 0));
        this.previousOutputTextField.setText(GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[11]]);
        this.field_175389_t = this.localCommandBlock.shouldTrackOutput();
        this.func_175388_a();
        final GuiButton doneBtn2 = this.doneBtn;
        int enabled;
        if (lIIIlIlIlIIIIlII(this.commandTextField.getText().trim().length())) {
            enabled = GuiCommandBlock.llIIIllIllIIII[0];
            "".length();
            if (((0x66 ^ 0x38) & ~(0x18 ^ 0x46)) != 0x0) {
                return;
            }
        }
        else {
            enabled = GuiCommandBlock.llIIIllIllIIII[1];
        }
        doneBtn2.enabled = (enabled != 0);
    }
    
    private static void lIIIlIlIIllllllI() {
        (llIIIllIlIllIl = new String[GuiCommandBlock.llIIIllIllIIII[26]])[GuiCommandBlock.llIIIllIllIIII[1]] = lIIIlIlIIllllIIl("AgMFTCsKGAk=", "evlbO");
        GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[0]] = lIIIlIlIIllllIIl("Ejk8VhUUIjYdGg==", "uLUxv");
        GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[2]] = lIIIlIlIIllllIlI("MNWK8zfs7Hc=", "ppZEL");
        GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[11]] = lIIIlIlIIllllIIl("eA==", "UGaPp");
        GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[3]] = lIIIlIlIIllllIIl("Ags5JR45CyEJ", "OHEdz");
        GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[15]] = lIIIlIlIIllllIll("yvk2/NOeN5jl8BEgjaLQeaALRv72/85p", "mIirw");
        GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[17]] = lIIIlIlIIllllIIl("MhU4Dho3FGAgGj4cLy0R", "SqNCu");
        GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[21]] = lIIIlIlIIllllIll("mQW+VLB3bKaa+O4mXqS5xDkKjIC3f+lI", "CdwPk");
        GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[22]] = lIIIlIlIIllllIll("TqIjF+0itAooAKGsKWCe77W5PI1NZqO0", "KJshN");
        GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[23]] = lIIIlIlIIllllIll("XSA8+9CgextuygWlXk+6ldshFUIa6Eau", "oMdAX");
        GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[24]] = lIIIlIlIIllllIIl("By0jBgsCLHsqCAoMOz8NEiAwOA==", "fIUKd");
        GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[25]] = lIIIlIlIIllllIlI("JxLxSWg5d6k=", "rbMpM");
        GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[6]] = lIIIlIlIIllllIll("LQU+0R0v58Ti2DI8Nhf96XP1XNXM95ut", "OjooS");
        GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[27]] = lIIIlIlIIllllIlI("w7m7iZkAyms=", "GCHUI");
        GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[28]] = lIIIlIlIIllllIIl("IQ==", "yNrbF");
        GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[29]] = lIIIlIlIIllllIll("J/WCKCpPZ6o=", "TtXwg");
    }
    
    private static String lIIIlIlIIllllIll(final String llllllllllllIlllIlIIlIIIllIlIlII, final String llllllllllllIlllIlIIlIIIllIlIIll) {
        try {
            final SecretKeySpec llllllllllllIlllIlIIlIIIllIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIlIIIllIlIIll.getBytes(StandardCharsets.UTF_8)), GuiCommandBlock.llIIIllIllIIII[22]), "DES");
            final Cipher llllllllllllIlllIlIIlIIIllIllIII = Cipher.getInstance("DES");
            llllllllllllIlllIlIIlIIIllIllIII.init(GuiCommandBlock.llIIIllIllIIII[2], llllllllllllIlllIlIIlIIIllIllIIl);
            return new String(llllllllllllIlllIlIIlIIIllIllIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIlIIIllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIIlIIIllIlIlll) {
            llllllllllllIlllIlIIlIIIllIlIlll.printStackTrace();
            return null;
        }
    }
    
    private void func_175388_a() {
        if (lIIIlIlIlIIIIlIl(this.localCommandBlock.shouldTrackOutput() ? 1 : 0)) {
            this.field_175390_s.displayString = GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[27]];
            if (lIIIlIlIlIIIlIIl(this.localCommandBlock.getLastOutput())) {
                this.previousOutputTextField.setText(this.localCommandBlock.getLastOutput().getUnformattedText());
                "".length();
                if (((0xDE ^ 0x87) & ~(0x7B ^ 0x22)) != 0x0) {
                    return;
                }
            }
        }
        else {
            this.field_175390_s.displayString = GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[28]];
            this.previousOutputTextField.setText(GuiCommandBlock.llIIIllIlIllIl[GuiCommandBlock.llIIIllIllIIII[29]]);
        }
    }
    
    @Override
    public void updateScreen() {
        this.commandTextField.updateCursorCounter();
    }
    
    private static boolean lIIIlIlIlIIIIlll(final int llllllllllllIlllIlIIlIIIlIIllllI) {
        return llllllllllllIlllIlIIlIIIlIIllllI == 0;
    }
    
    private static boolean lIIIlIlIlIIIIllI(final int llllllllllllIlllIlIIlIIIlIlIlIIl, final int llllllllllllIlllIlIIlIIIlIlIlIII) {
        return llllllllllllIlllIlIIlIIIlIlIlIIl == llllllllllllIlllIlIIlIIIlIlIlIII;
    }
    
    private static boolean lIIIlIlIlIIIIlIl(final int llllllllllllIlllIlIIlIIIlIlIIIII) {
        return llllllllllllIlllIlIIlIIIlIlIIIII != 0;
    }
    
    private static boolean lIIIlIlIlIIIlIIl(final Object llllllllllllIlllIlIIlIIIlIlIIIlI) {
        return llllllllllllIlllIlIIlIIIlIlIIIlI != null;
    }
    
    private static String lIIIlIlIIllllIlI(final String llllllllllllIlllIlIIlIIIlIlIllll, final String llllllllllllIlllIlIIlIIIlIllIIII) {
        try {
            final SecretKeySpec llllllllllllIlllIlIIlIIIlIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIlIIIlIllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlIIlIIIlIllIIll = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlIIlIIIlIllIIll.init(GuiCommandBlock.llIIIllIllIIII[2], llllllllllllIlllIlIIlIIIlIllIlII);
            return new String(llllllllllllIlllIlIIlIIIlIllIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIlIIIlIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIIlIIIlIllIIlI) {
            llllllllllllIlllIlIIlIIIlIllIIlI.printStackTrace();
            return null;
        }
    }
}
