// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import org.apache.logging.log4j.LogManager;
import net.minecraft.util.MathHelper;
import java.util.Iterator;
import net.minecraft.util.ChatComponentText;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.BlockPos;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C14PacketTabComplete;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.IChatComponent;
import org.lwjgl.input.Mouse;
import org.apache.commons.lang3.StringUtils;
import com.google.common.collect.Lists;
import org.lwjgl.input.Keyboard;
import java.io.IOException;
import org.apache.logging.log4j.Logger;
import java.util.List;

public class GuiChat extends GuiScreen
{
    private static final /* synthetic */ String[] lllIlllIlIllll;
    private /* synthetic */ int autocompleteIndex;
    private static final /* synthetic */ int[] lllIlllIllIlll;
    private /* synthetic */ String defaultInputFieldText;
    private /* synthetic */ int sentHistoryCursor;
    private /* synthetic */ List<String> foundPlayerNames;
    private /* synthetic */ String historyBuffer;
    protected /* synthetic */ GuiTextField inputField;
    private /* synthetic */ boolean playerNamesFound;
    private /* synthetic */ boolean waitingOnAutocomplete;
    
    private static boolean lIlIIlIlllIlIlII(final int llllllllllllIlIllIIIIIlIIIIIIIll, final int llllllllllllIlIllIIIIIlIIIIIIIlI) {
        return llllllllllllIlIllIIIIIlIIIIIIIll < llllllllllllIlIllIIIIIlIIIIIIIlI;
    }
    
    private static boolean lIlIIlIlllIlIlIl(final int llllllllllllIlIllIIIIIIlllllIlII) {
        return llllllllllllIlIllIIIIIIlllllIlII == 0;
    }
    
    @Override
    protected void keyTyped(final char llllllllllllIlIllIIIIIlIlIIlIIIl, final int llllllllllllIlIllIIIIIlIlIIlIIII) throws IOException {
        this.waitingOnAutocomplete = (GuiChat.lllIlllIllIlll[0] != 0);
        if (lIlIIlIlllIIlllI(llllllllllllIlIllIIIIIlIlIIlIIII, GuiChat.lllIlllIllIlll[8])) {
            this.autocompletePlayerNames();
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        }
        else {
            this.playerNamesFound = (GuiChat.lllIlllIllIlll[0] != 0);
        }
        if (lIlIIlIlllIIlllI(llllllllllllIlIllIIIIIlIlIIlIIII, GuiChat.lllIlllIllIlll[2])) {
            this.mc.displayGuiScreen(null);
            "".length();
            if ("   ".length() == 0) {
                return;
            }
        }
        else if (lIlIIlIlllIIllll(llllllllllllIlIllIIIIIlIlIIlIIII, GuiChat.lllIlllIllIlll[9]) && lIlIIlIlllIIllll(llllllllllllIlIllIIIIIlIlIIlIIII, GuiChat.lllIlllIllIlll[10])) {
            if (lIlIIlIlllIIlllI(llllllllllllIlIllIIIIIlIlIIlIIII, GuiChat.lllIlllIllIlll[11])) {
                this.getSentHistory(GuiChat.lllIlllIllIlll[1]);
                "".length();
                if (" ".length() < " ".length()) {
                    return;
                }
            }
            else if (lIlIIlIlllIIlllI(llllllllllllIlIllIIIIIlIlIIlIIII, GuiChat.lllIlllIllIlll[12])) {
                this.getSentHistory(GuiChat.lllIlllIllIlll[2]);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (lIlIIlIlllIIlllI(llllllllllllIlIllIIIIIlIlIIlIIII, GuiChat.lllIlllIllIlll[13])) {
                this.mc.ingameGUI.getChatGUI().scroll(this.mc.ingameGUI.getChatGUI().getLineCount() - GuiChat.lllIlllIllIlll[2]);
                "".length();
                if (((0xC ^ 0x2A) & ~(0xD ^ 0x2B)) > 0) {
                    return;
                }
            }
            else if (lIlIIlIlllIIlllI(llllllllllllIlIllIIIIIlIlIIlIIII, GuiChat.lllIlllIllIlll[14])) {
                this.mc.ingameGUI.getChatGUI().scroll(-this.mc.ingameGUI.getChatGUI().getLineCount() + GuiChat.lllIlllIllIlll[2]);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.inputField.textboxKeyTyped(llllllllllllIlIllIIIIIlIlIIlIIIl, llllllllllllIlIllIIIIIlIlIIlIIII);
                "".length();
                "".length();
                if (" ".length() >= (0x23 ^ 0xB ^ (0x69 ^ 0x45))) {
                    return;
                }
            }
        }
        else {
            final String llllllllllllIlIllIIIIIlIlIIIllll = this.inputField.getText().trim();
            if (lIlIIlIlllIlIIIl(llllllllllllIlIllIIIIIlIlIIIllll.length())) {
                this.sendChatMessage(llllllllllllIlIllIIIIIlIlIIIllll);
            }
            this.mc.displayGuiScreen(null);
        }
    }
    
    @Override
    protected void setText(final String llllllllllllIlIllIIIIIlIIlllIIIl, final boolean llllllllllllIlIllIIIIIlIIlllIIII) {
        if (lIlIIlIlllIlIIlI(llllllllllllIlIllIIIIIlIIlllIIII ? 1 : 0)) {
            this.inputField.setText(llllllllllllIlIllIIIIIlIIlllIIIl);
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
        else {
            this.inputField.writeText(llllllllllllIlIllIIIIIlIIlllIIIl);
        }
    }
    
    private static boolean lIlIIlIlllIlIIlI(final int llllllllllllIlIllIIIIIIlllllIllI) {
        return llllllllllllIlIllIIIIIIlllllIllI != 0;
    }
    
    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)(GuiChat.lllIlllIllIlll[0] != 0));
        this.mc.ingameGUI.getChatGUI().resetScroll();
    }
    
    private static boolean lIlIIlIlllIlIIIl(final int llllllllllllIlIllIIIIIIlllllIIlI) {
        return llllllllllllIlIllIIIIIIlllllIIlI > 0;
    }
    
    private static boolean lIlIIlIlllIlIlll(final int llllllllllllIlIllIIIIIlIIIIIIlll, final int llllllllllllIlIllIIIIIlIIIIIIllI) {
        return llllllllllllIlIllIIIIIlIIIIIIlll >= llllllllllllIlIllIIIIIlIIIIIIllI;
    }
    
    public GuiChat() {
        this.historyBuffer = GuiChat.lllIlllIlIllll[GuiChat.lllIlllIllIlll[0]];
        this.sentHistoryCursor = GuiChat.lllIlllIllIlll[1];
        this.foundPlayerNames = (List<String>)Lists.newArrayList();
        this.defaultInputFieldText = GuiChat.lllIlllIlIllll[GuiChat.lllIlllIllIlll[2]];
    }
    
    public void onAutocompleteResponse(final String[] llllllllllllIlIllIIIIIlIIIllIIlI) {
        if (lIlIIlIlllIlIIlI(this.waitingOnAutocomplete ? 1 : 0)) {
            this.playerNamesFound = (GuiChat.lllIlllIllIlll[0] != 0);
            this.foundPlayerNames.clear();
            final String llllllllllllIlIllIIIIIlIIIlIlIIl = (Object)llllllllllllIlIllIIIIIlIIIllIIlI;
            final Exception llllllllllllIlIllIIIIIlIIIlIlIlI = (Exception)llllllllllllIlIllIIIIIlIIIllIIlI.length;
            int llllllllllllIlIllIIIIIlIIIIIIlll = GuiChat.lllIlllIllIlll[0];
            "".length();
            if ("   ".length() < 0) {
                return;
            }
            while (!lIlIIlIlllIlIlll(llllllllllllIlIllIIIIIlIIIIIIlll, (int)llllllllllllIlIllIIIIIlIIIlIlIlI)) {
                final String llllllllllllIlIllIIIIIlIIIllIIIl = llllllllllllIlIllIIIIIlIIIlIlIIl[llllllllllllIlIllIIIIIlIIIIIIlll];
                if (lIlIIlIlllIlIIIl(llllllllllllIlIllIIIIIlIIIllIIIl.length())) {
                    this.foundPlayerNames.add(llllllllllllIlIllIIIIIlIIIllIIIl);
                    "".length();
                }
                ++llllllllllllIlIllIIIIIlIIIIIIlll;
            }
            final String llllllllllllIlIllIIIIIlIIIllIIII = this.inputField.getText().substring(this.inputField.func_146197_a(GuiChat.lllIlllIllIlll[1], this.inputField.getCursorPosition(), (boolean)(GuiChat.lllIlllIllIlll[0] != 0)));
            final String llllllllllllIlIllIIIIIlIIIlIllll = StringUtils.getCommonPrefix(llllllllllllIlIllIIIIIlIIIllIIlI);
            if (lIlIIlIlllIlIIIl(llllllllllllIlIllIIIIIlIIIlIllll.length()) && lIlIIlIlllIlIlIl(llllllllllllIlIllIIIIIlIIIllIIII.equalsIgnoreCase(llllllllllllIlIllIIIIIlIIIlIllll) ? 1 : 0)) {
                this.inputField.deleteFromCursor(this.inputField.func_146197_a(GuiChat.lllIlllIllIlll[1], this.inputField.getCursorPosition(), (boolean)(GuiChat.lllIlllIllIlll[0] != 0)) - this.inputField.getCursorPosition());
                this.inputField.writeText(llllllllllllIlIllIIIIIlIIIlIllll);
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
            }
            else if (lIlIIlIlllIlIIIl(this.foundPlayerNames.size())) {
                this.playerNamesFound = (GuiChat.lllIlllIllIlll[2] != 0);
                this.autocompletePlayerNames();
            }
        }
    }
    
    public GuiChat(final String llllllllllllIlIllIIIIIlIlIlIllII) {
        this.historyBuffer = GuiChat.lllIlllIlIllll[GuiChat.lllIlllIllIlll[3]];
        this.sentHistoryCursor = GuiChat.lllIlllIllIlll[1];
        this.foundPlayerNames = (List<String>)Lists.newArrayList();
        this.defaultInputFieldText = GuiChat.lllIlllIlIllll[GuiChat.lllIlllIllIlll[4]];
        this.defaultInputFieldText = llllllllllllIlIllIIIIIlIlIlIllII;
    }
    
    @Override
    protected void mouseClicked(final int llllllllllllIlIllIIIIIlIIllllllI, final int llllllllllllIlIllIIIIIlIIllllIII, final int llllllllllllIlIllIIIIIlIIlllllII) throws IOException {
        if (lIlIIlIlllIlIlIl(llllllllllllIlIllIIIIIlIIlllllII)) {
            final IChatComponent llllllllllllIlIllIIIIIlIIllllIll = this.mc.ingameGUI.getChatGUI().getChatComponent(Mouse.getX(), Mouse.getY());
            if (lIlIIlIlllIlIIlI(this.handleComponentClick(llllllllllllIlIllIIIIIlIIllllIll) ? 1 : 0)) {
                return;
            }
        }
        this.inputField.mouseClicked(llllllllllllIlIllIIIIIlIIllllllI, llllllllllllIlIllIIIIIlIIllllIII, llllllllllllIlIllIIIIIlIIlllllII);
        super.mouseClicked(llllllllllllIlIllIIIIIlIIllllllI, llllllllllllIlIllIIIIIlIIllllIII, llllllllllllIlIllIIIIIlIIlllllII);
    }
    
    private static boolean lIlIIlIlllIIllll(final int llllllllllllIlIllIIIIIIllllIllll, final int llllllllllllIlIllIIIIIIllllIlllI) {
        return llllllllllllIlIllIIIIIIllllIllll != llllllllllllIlIllIIIIIIllllIlllI;
    }
    
    @Override
    public void drawScreen(final int llllllllllllIlIllIIIIIlIIIllllIl, final int llllllllllllIlIllIIIIIlIIlIIIIIl, final float llllllllllllIlIllIIIIIlIIlIIIIII) {
        Gui.drawRect(GuiChat.lllIlllIllIlll[3], this.height - GuiChat.lllIlllIllIlll[16], this.width - GuiChat.lllIlllIllIlll[3], this.height - GuiChat.lllIlllIllIlll[3], Integer.MIN_VALUE);
        this.inputField.drawTextBox();
        final IChatComponent llllllllllllIlIllIIIIIlIIIllllll = this.mc.ingameGUI.getChatGUI().getChatComponent(Mouse.getX(), Mouse.getY());
        if (lIlIIlIlllIllIII(llllllllllllIlIllIIIIIlIIIllllll) && lIlIIlIlllIllIII(llllllllllllIlIllIIIIIlIIIllllll.getChatStyle().getChatHoverEvent())) {
            this.handleComponentHover(llllllllllllIlIllIIIIIlIIIllllll, llllllllllllIlIllIIIIIlIIIllllIl, llllllllllllIlIllIIIIIlIIlIIIIIl);
        }
        super.drawScreen(llllllllllllIlIllIIIIIlIIIllllIl, llllllllllllIlIllIIIIIlIIlIIIIIl, llllllllllllIlIllIIIIIlIIlIIIIII);
    }
    
    private void sendAutocompleteRequest(final String llllllllllllIlIllIIIIIlIIlIlIllI, final String llllllllllllIlIllIIIIIlIIlIllIIl) {
        if (lIlIIlIlllIlIlll(llllllllllllIlIllIIIIIlIIlIlIllI.length(), GuiChat.lllIlllIllIlll[2])) {
            BlockPos llllllllllllIlIllIIIIIlIIlIllIII = null;
            if (lIlIIlIlllIllIII(this.mc.objectMouseOver) && lIlIIlIlllIllIIl(this.mc.objectMouseOver.typeOfHit, MovingObjectPosition.MovingObjectType.BLOCK)) {
                llllllllllllIlIllIIIIIlIIlIllIII = this.mc.objectMouseOver.getBlockPos();
            }
            this.mc.thePlayer.sendQueue.addToSendQueue(new C14PacketTabComplete(llllllllllllIlIllIIIIIlIIlIlIllI, llllllllllllIlIllIIIIIlIIlIllIII));
            this.waitingOnAutocomplete = (GuiChat.lllIlllIllIlll[2] != 0);
        }
    }
    
    private static String lIlIIlIlllIIIIIl(final String llllllllllllIlIllIIIIIlIIIlIIIII, final String llllllllllllIlIllIIIIIlIIIIlllIl) {
        try {
            final SecretKeySpec llllllllllllIlIllIIIIIlIIIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIIIlIIIIlllIl.getBytes(StandardCharsets.UTF_8)), GuiChat.lllIlllIllIlll[18]), "DES");
            final Cipher llllllllllllIlIllIIIIIlIIIlIIIlI = Cipher.getInstance("DES");
            llllllllllllIlIllIIIIIlIIIlIIIlI.init(GuiChat.lllIlllIllIlll[3], llllllllllllIlIllIIIIIlIIIlIIIll);
            return new String(llllllllllllIlIllIIIIIlIIIlIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIIIlIIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIIIIlIIIlIIIIl) {
            llllllllllllIlIllIIIIIlIIIlIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIIlIllIllllll(final String llllllllllllIlIllIIIIIlIIIIlIIIl, final String llllllllllllIlIllIIIIIlIIIIlIIII) {
        try {
            final SecretKeySpec llllllllllllIlIllIIIIIlIIIIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIIIlIIIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIIIIIlIIIIlIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIIIIIlIIIIlIlIl.init(GuiChat.lllIlllIllIlll[3], llllllllllllIlIllIIIIIlIIIIlIllI);
            return new String(llllllllllllIlIllIIIIIlIIIIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIIIlIIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIIIIlIIIIlIlII) {
            llllllllllllIlIllIIIIIlIIIIlIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIlIlllIIlllI(final int llllllllllllIlIllIIIIIlIIIIIlIll, final int llllllllllllIlIllIIIIIlIIIIIlIlI) {
        return llllllllllllIlIllIIIIIlIIIIIlIll == llllllllllllIlIllIIIIIlIIIIIlIlI;
    }
    
    private static boolean lIlIIlIlllIllIII(final Object llllllllllllIlIllIIIIIIlllllllII) {
        return llllllllllllIlIllIIIIIIlllllllII != null;
    }
    
    @Override
    public void updateScreen() {
        this.inputField.updateCursorCounter();
    }
    
    @Override
    public void handleMouseInput() throws IOException {
        super.handleMouseInput();
        int llllllllllllIlIllIIIIIlIlIIIIlll = Mouse.getEventDWheel();
        if (lIlIIlIlllIlIIlI(llllllllllllIlIllIIIIIlIlIIIIlll)) {
            if (lIlIIlIlllIlIIll(llllllllllllIlIllIIIIIlIlIIIIlll, GuiChat.lllIlllIllIlll[2])) {
                llllllllllllIlIllIIIIIlIlIIIIlll = GuiChat.lllIlllIllIlll[2];
            }
            if (lIlIIlIlllIlIlII(llllllllllllIlIllIIIIIlIlIIIIlll, GuiChat.lllIlllIllIlll[1])) {
                llllllllllllIlIllIIIIIlIlIIIIlll = GuiChat.lllIlllIllIlll[1];
            }
            if (lIlIIlIlllIlIlIl(GuiScreen.isShiftKeyDown() ? 1 : 0)) {
                llllllllllllIlIllIIIIIlIlIIIIlll *= GuiChat.lllIlllIllIlll[15];
            }
            this.mc.ingameGUI.getChatGUI().scroll(llllllllllllIlIllIIIIIlIlIIIIlll);
        }
    }
    
    private static boolean lIlIIlIlllIllIIl(final Object llllllllllllIlIllIIIIIIllllllIIl, final Object llllllllllllIlIllIIIIIIllllllIII) {
        return llllllllllllIlIllIIIIIIllllllIIl == llllllllllllIlIllIIIIIIllllllIII;
    }
    
    public void autocompletePlayerNames() {
        if (lIlIIlIlllIlIIlI(this.playerNamesFound ? 1 : 0)) {
            this.inputField.deleteFromCursor(this.inputField.func_146197_a(GuiChat.lllIlllIllIlll[1], this.inputField.getCursorPosition(), (boolean)(GuiChat.lllIlllIllIlll[0] != 0)) - this.inputField.getCursorPosition());
            if (lIlIIlIlllIlIlll(this.autocompleteIndex, this.foundPlayerNames.size())) {
                this.autocompleteIndex = GuiChat.lllIlllIllIlll[0];
                "".length();
                if ((0x2C ^ 0x6E ^ (0xD1 ^ 0x97)) < " ".length()) {
                    return;
                }
            }
        }
        else {
            final int llllllllllllIlIllIIIIIlIIllIIlll = this.inputField.func_146197_a(GuiChat.lllIlllIllIlll[1], this.inputField.getCursorPosition(), (boolean)(GuiChat.lllIlllIllIlll[0] != 0));
            this.foundPlayerNames.clear();
            this.autocompleteIndex = GuiChat.lllIlllIllIlll[0];
            final String llllllllllllIlIllIIIIIlIIllIIllI = this.inputField.getText().substring(llllllllllllIlIllIIIIIlIIllIIlll).toLowerCase();
            final String llllllllllllIlIllIIIIIlIIllIIlIl = this.inputField.getText().substring(GuiChat.lllIlllIllIlll[0], this.inputField.getCursorPosition());
            this.sendAutocompleteRequest(llllllllllllIlIllIIIIIlIIllIIlIl, llllllllllllIlIllIIIIIlIIllIIllI);
            if (lIlIIlIlllIlIIlI(this.foundPlayerNames.isEmpty() ? 1 : 0)) {
                return;
            }
            this.playerNamesFound = (GuiChat.lllIlllIllIlll[2] != 0);
            this.inputField.deleteFromCursor(llllllllllllIlIllIIIIIlIIllIIlll - this.inputField.getCursorPosition());
        }
        if (lIlIIlIlllIlIIll(this.foundPlayerNames.size(), GuiChat.lllIlllIllIlll[2])) {
            final StringBuilder llllllllllllIlIllIIIIIlIIllIIlII = new StringBuilder();
            final Iterator<String> iterator = this.foundPlayerNames.iterator();
            "".length();
            if ("   ".length() <= "  ".length()) {
                return;
            }
            while (!lIlIIlIlllIlIlIl(iterator.hasNext() ? 1 : 0)) {
                final String llllllllllllIlIllIIIIIlIIllIIIll = iterator.next();
                if (lIlIIlIlllIlIIIl(llllllllllllIlIllIIIIIlIIllIIlII.length())) {
                    llllllllllllIlIllIIIIIlIIllIIlII.append(GuiChat.lllIlllIlIllll[GuiChat.lllIlllIllIlll[5]]);
                    "".length();
                }
                llllllllllllIlIllIIIIIlIIllIIlII.append(llllllllllllIlIllIIIIIlIIllIIIll);
                "".length();
            }
            this.mc.ingameGUI.getChatGUI().printChatMessageWithOptionalDeletion(new ChatComponentText(String.valueOf(llllllllllllIlIllIIIIIlIIllIIlII)), GuiChat.lllIlllIllIlll[2]);
        }
        final GuiTextField inputField = this.inputField;
        final List<String> foundPlayerNames = this.foundPlayerNames;
        final int autocompleteIndex = this.autocompleteIndex;
        this.autocompleteIndex = autocompleteIndex + GuiChat.lllIlllIllIlll[2];
        inputField.writeText(foundPlayerNames.get(autocompleteIndex));
    }
    
    @Override
    public void initGui() {
        Keyboard.enableRepeatEvents((boolean)(GuiChat.lllIlllIllIlll[2] != 0));
        this.sentHistoryCursor = this.mc.ingameGUI.getChatGUI().getSentMessages().size();
        this.inputField = new GuiTextField(GuiChat.lllIlllIllIlll[0], this.fontRendererObj, GuiChat.lllIlllIllIlll[5], this.height - GuiChat.lllIlllIllIlll[6], this.width - GuiChat.lllIlllIllIlll[5], GuiChat.lllIlllIllIlll[6]);
        this.inputField.setMaxStringLength(GuiChat.lllIlllIllIlll[7]);
        this.inputField.setEnableBackgroundDrawing((boolean)(GuiChat.lllIlllIllIlll[0] != 0));
        this.inputField.setFocused((boolean)(GuiChat.lllIlllIllIlll[2] != 0));
        this.inputField.setText(this.defaultInputFieldText);
        this.inputField.setCanLoseFocus((boolean)(GuiChat.lllIlllIllIlll[0] != 0));
    }
    
    public void getSentHistory(final int llllllllllllIlIllIIIIIlIIlIIllll) {
        int llllllllllllIlIllIIIIIlIIlIIlllI = this.sentHistoryCursor + llllllllllllIlIllIIIIIlIIlIIllll;
        final int llllllllllllIlIllIIIIIlIIlIIllIl = this.mc.ingameGUI.getChatGUI().getSentMessages().size();
        llllllllllllIlIllIIIIIlIIlIIlllI = MathHelper.clamp_int(llllllllllllIlIllIIIIIlIIlIIlllI, GuiChat.lllIlllIllIlll[0], llllllllllllIlIllIIIIIlIIlIIllIl);
        if (lIlIIlIlllIIllll(llllllllllllIlIllIIIIIlIIlIIlllI, this.sentHistoryCursor)) {
            if (lIlIIlIlllIIlllI(llllllllllllIlIllIIIIIlIIlIIlllI, llllllllllllIlIllIIIIIlIIlIIllIl)) {
                this.sentHistoryCursor = llllllllllllIlIllIIIIIlIIlIIllIl;
                this.inputField.setText(this.historyBuffer);
                "".length();
                if ("   ".length() <= "  ".length()) {
                    return;
                }
            }
            else {
                if (lIlIIlIlllIIlllI(this.sentHistoryCursor, llllllllllllIlIllIIIIIlIIlIIllIl)) {
                    this.historyBuffer = this.inputField.getText();
                }
                this.inputField.setText(this.mc.ingameGUI.getChatGUI().getSentMessages().get(llllllllllllIlIllIIIIIlIIlIIlllI));
                this.sentHistoryCursor = llllllllllllIlIllIIIIIlIIlIIlllI;
            }
        }
    }
    
    static {
        lIlIIlIlllIIllIl();
        lIlIIlIlllIIIlIl();
        logger = LogManager.getLogger();
    }
    
    private static boolean lIlIIlIlllIlIIll(final int llllllllllllIlIllIIIIIIlllllllll, final int llllllllllllIlIllIIIIIIllllllllI) {
        return llllllllllllIlIllIIIIIIlllllllll > llllllllllllIlIllIIIIIIllllllllI;
    }
    
    private static void lIlIIlIlllIIllIl() {
        (lllIlllIllIlll = new int[19])[0] = ((0xEF ^ 0xB7) & ~(0xCB ^ 0x93));
        GuiChat.lllIlllIllIlll[1] = -" ".length();
        GuiChat.lllIlllIllIlll[2] = " ".length();
        GuiChat.lllIlllIllIlll[3] = "  ".length();
        GuiChat.lllIlllIllIlll[4] = "   ".length();
        GuiChat.lllIlllIllIlll[5] = (0x1E ^ 0x72 ^ (0xF ^ 0x67));
        GuiChat.lllIlllIllIlll[6] = (0x40 ^ 0x4C);
        GuiChat.lllIlllIllIlll[7] = (0xC0 ^ 0xA5 ^ " ".length());
        GuiChat.lllIlllIllIlll[8] = (0x20 ^ 0x2F);
        GuiChat.lllIlllIllIlll[9] = (117 + 42 - 80 + 90 ^ 40 + 163 - 46 + 24);
        GuiChat.lllIlllIllIlll[10] = 69 + 57 - 49 + 79;
        GuiChat.lllIlllIllIlll[11] = 26 + 76 - 72 + 170;
        GuiChat.lllIlllIllIlll[12] = (0xD6 ^ 0xA1) + (0x40 ^ 0x62) - -(0x98 ^ 0x8B) + (0xBC ^ 0x98);
        GuiChat.lllIlllIllIlll[13] = 35 + 144 + 14 + 8;
        GuiChat.lllIlllIllIlll[14] = 154 + 30 + 10 + 15;
        GuiChat.lllIlllIllIlll[15] = (0x20 ^ 0x27);
        GuiChat.lllIlllIllIlll[16] = (0xB5 ^ 0xBB);
        GuiChat.lllIlllIllIlll[17] = (0x51 ^ 0x54);
        GuiChat.lllIlllIllIlll[18] = (0xB ^ 0x3);
    }
    
    @Override
    public boolean doesGuiPauseGame() {
        return GuiChat.lllIlllIllIlll[0] != 0;
    }
    
    private static void lIlIIlIlllIIIlIl() {
        (lllIlllIlIllll = new String[GuiChat.lllIlllIllIlll[17]])[GuiChat.lllIlllIllIlll[0]] = lIlIIlIllIllllll("Lo74Kq+1wFM=", "dFENl");
        GuiChat.lllIlllIlIllll[GuiChat.lllIlllIllIlll[2]] = lIlIIlIllIllllll("pcnJVNa2mb8=", "NrQvY");
        GuiChat.lllIlllIlIllll[GuiChat.lllIlllIllIlll[3]] = lIlIIlIlllIIIIIl("P4k6R+b1k8Y=", "AgaMI");
        GuiChat.lllIlllIlIllll[GuiChat.lllIlllIllIlll[4]] = lIlIIlIlllIIIIIl("+7dApnxyFX8=", "SmFPj");
        GuiChat.lllIlllIlIllll[GuiChat.lllIlllIllIlll[5]] = lIlIIlIllIllllll("OUkYgzxDsVk=", "QGpRE");
    }
}
