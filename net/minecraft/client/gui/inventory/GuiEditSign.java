// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui.inventory;

import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C12PacketUpdateSign;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import org.lwjgl.input.Keyboard;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.init.Blocks;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import java.io.IOException;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatAllowedCharacters;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public class GuiEditSign extends GuiScreen
{
    private /* synthetic */ GuiButton doneBtn;
    private /* synthetic */ int updateCounter;
    private static final /* synthetic */ String[] lllIIIIlIIIIll;
    private static final /* synthetic */ int[] lllIIIIlIIIlII;
    private /* synthetic */ int editLine;
    private /* synthetic */ TileEntitySign tileSign;
    
    private static void lIIlllIIIlllIIIl() {
        (lllIIIIlIIIIll = new String[GuiEditSign.lllIIIIlIIIlII[2]])[GuiEditSign.lllIIIIlIIIlII[1]] = lIIlllIIIllIllll("phwIDzsHYAYczwKtUcrbTQ==", "pihak");
        GuiEditSign.lllIIIIlIIIIll[GuiEditSign.lllIIIIlIIIlII[0]] = lIIlllIIIlllIIII("8LLp/sHaa99oci1hxN+B4g==", "PxWEO");
    }
    
    private static boolean lIIlllIIIllllIII(final int llllllllllllIllIIIIllIIIIIIllllI) {
        return llllllllllllIllIIIIllIIIIIIllllI > 0;
    }
    
    private static boolean lIIlllIIIlllIlll(final int llllllllllllIllIIIIllIIIIIIllIll, final int llllllllllllIllIIIIllIIIIIIllIlI) {
        return llllllllllllIllIIIIllIIIIIIllIll != llllllllllllIllIIIIllIIIIIIllIlI;
    }
    
    static {
        lIIlllIIIlllIIlI();
        lIIlllIIIlllIIIl();
    }
    
    private static boolean lIIlllIIIlllIlIl(final int llllllllllllIllIIIIllIIIIIlIIIII) {
        return llllllllllllIllIIIIllIIIIIlIIIII == 0;
    }
    
    private static boolean lIIlllIIIlllIIll(final Object llllllllllllIllIIIIllIIIIIlIlIII) {
        return llllllllllllIllIIIIllIIIIIlIlIII != null;
    }
    
    @Override
    protected void keyTyped(final char llllllllllllIllIIIIllIIIIllIlIll, final int llllllllllllIllIIIIllIIIIllIIllI) throws IOException {
        if (lIIlllIIIlllIllI(llllllllllllIllIIIIllIIIIllIIllI, GuiEditSign.lllIIIIlIIIlII[6])) {
            this.editLine = (this.editLine - GuiEditSign.lllIIIIlIIIlII[0] & GuiEditSign.lllIIIIlIIIlII[7]);
        }
        if (!lIIlllIIIlllIlll(llllllllllllIllIIIIllIIIIllIIllI, GuiEditSign.lllIIIIlIIIlII[8]) || !lIIlllIIIlllIlll(llllllllllllIllIIIIllIIIIllIIllI, GuiEditSign.lllIIIIlIIIlII[9]) || lIIlllIIIlllIllI(llllllllllllIllIIIIllIIIIllIIllI, GuiEditSign.lllIIIIlIIIlII[10])) {
            this.editLine = (this.editLine + GuiEditSign.lllIIIIlIIIlII[0] & GuiEditSign.lllIIIIlIIIlII[7]);
        }
        String llllllllllllIllIIIIllIIIIllIlIIl = this.tileSign.signText[this.editLine].getUnformattedText();
        if (lIIlllIIIlllIllI(llllllllllllIllIIIIllIIIIllIIllI, GuiEditSign.lllIIIIlIIIlII[11]) && lIIlllIIIllllIII(llllllllllllIllIIIIllIIIIllIlIIl.length())) {
            llllllllllllIllIIIIllIIIIllIlIIl = llllllllllllIllIIIIllIIIIllIlIIl.substring(GuiEditSign.lllIIIIlIIIlII[1], llllllllllllIllIIIIllIIIIllIlIIl.length() - GuiEditSign.lllIIIIlIIIlII[0]);
        }
        if (lIIlllIIIlllIlII(ChatAllowedCharacters.isAllowedCharacter(llllllllllllIllIIIIllIIIIllIlIll) ? 1 : 0) && lIIlllIIIllllIIl(this.fontRendererObj.getStringWidth(String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIIIIllIIIIllIlIIl)).append(llllllllllllIllIIIIllIIIIllIlIll))), GuiEditSign.lllIIIIlIIIlII[12])) {
            llllllllllllIllIIIIllIIIIllIlIIl = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIIIIllIIIIllIlIIl)).append(llllllllllllIllIIIIllIIIIllIlIll));
        }
        this.tileSign.signText[this.editLine] = new ChatComponentText(llllllllllllIllIIIIllIIIIllIlIIl);
        if (lIIlllIIIlllIllI(llllllllllllIllIIIIllIIIIllIIllI, GuiEditSign.lllIIIIlIIIlII[0])) {
            this.actionPerformed(this.doneBtn);
        }
    }
    
    @Override
    public void drawScreen(final int llllllllllllIllIIIIllIIIIlIllIll, final int llllllllllllIllIIIIllIIIIlIllIlI, final float llllllllllllIllIIIIllIIIIlIlIIII) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, I18n.format(GuiEditSign.lllIIIIlIIIIll[GuiEditSign.lllIIIIlIIIlII[0]], new Object[GuiEditSign.lllIIIIlIIIlII[1]]), this.width / GuiEditSign.lllIIIIlIIIlII[2], GuiEditSign.lllIIIIlIIIlII[13], GuiEditSign.lllIIIIlIIIlII[14]);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)(this.width / GuiEditSign.lllIIIIlIIIlII[2]), 0.0f, 50.0f);
        final float llllllllllllIllIIIIllIIIIlIllIII = 93.75f;
        GlStateManager.scale(-llllllllllllIllIIIIllIIIIlIllIII, -llllllllllllIllIIIIllIIIIlIllIII, -llllllllllllIllIIIIllIIIIlIllIII);
        GlStateManager.rotate(180.0f, 0.0f, 1.0f, 0.0f);
        final Block llllllllllllIllIIIIllIIIIlIlIlll = this.tileSign.getBlockType();
        if (lIIlllIIIllllIlI(llllllllllllIllIIIIllIIIIlIlIlll, Blocks.standing_sign)) {
            final float llllllllllllIllIIIIllIIIIlIlIllI = this.tileSign.getBlockMetadata() * GuiEditSign.lllIIIIlIIIlII[15] / 16.0f;
            GlStateManager.rotate(llllllllllllIllIIIIllIIIIlIlIllI, 0.0f, 1.0f, 0.0f);
            GlStateManager.translate(0.0f, -1.0625f, 0.0f);
            "".length();
            if (((0x4 ^ 0x2A) & ~(0x8B ^ 0xA5)) != 0x0) {
                return;
            }
        }
        else {
            final int llllllllllllIllIIIIllIIIIlIlIlIl = this.tileSign.getBlockMetadata();
            float llllllllllllIllIIIIllIIIIlIlIlII = 0.0f;
            if (lIIlllIIIlllIllI(llllllllllllIllIIIIllIIIIlIlIlIl, GuiEditSign.lllIIIIlIIIlII[2])) {
                llllllllllllIllIIIIllIIIIlIlIlII = 180.0f;
            }
            if (lIIlllIIIlllIllI(llllllllllllIllIIIIllIIIIlIlIlIl, GuiEditSign.lllIIIIlIIIlII[4])) {
                llllllllllllIllIIIIllIIIIlIlIlII = 90.0f;
            }
            if (lIIlllIIIlllIllI(llllllllllllIllIIIIllIIIIlIlIlIl, GuiEditSign.lllIIIIlIIIlII[16])) {
                llllllllllllIllIIIIllIIIIlIlIlII = -90.0f;
            }
            GlStateManager.rotate(llllllllllllIllIIIIllIIIIlIlIlII, 0.0f, 1.0f, 0.0f);
            GlStateManager.translate(0.0f, -1.0625f, 0.0f);
        }
        if (lIIlllIIIlllIlIl(this.updateCounter / GuiEditSign.lllIIIIlIIIlII[17] % GuiEditSign.lllIIIIlIIIlII[2])) {
            this.tileSign.lineBeingEdited = this.editLine;
        }
        TileEntityRendererDispatcher.instance.renderTileEntityAt(this.tileSign, -0.5, -0.75, -0.5, 0.0f);
        this.tileSign.lineBeingEdited = GuiEditSign.lllIIIIlIIIlII[18];
        GlStateManager.popMatrix();
        super.drawScreen(llllllllllllIllIIIIllIIIIlIllIll, llllllllllllIllIIIIllIIIIlIllIlI, llllllllllllIllIIIIllIIIIlIlIIII);
    }
    
    @Override
    public void initGui() {
        this.buttonList.clear();
        Keyboard.enableRepeatEvents((boolean)(GuiEditSign.lllIIIIlIIIlII[0] != 0));
        final List<GuiButton> buttonList = this.buttonList;
        final GuiButton doneBtn = new GuiButton(GuiEditSign.lllIIIIlIIIlII[1], this.width / GuiEditSign.lllIIIIlIIIlII[2] - GuiEditSign.lllIIIIlIIIlII[3], this.height / GuiEditSign.lllIIIIlIIIlII[4] + GuiEditSign.lllIIIIlIIIlII[5], I18n.format(GuiEditSign.lllIIIIlIIIIll[GuiEditSign.lllIIIIlIIIlII[1]], new Object[GuiEditSign.lllIIIIlIIIlII[1]]));
        this.doneBtn = doneBtn;
        buttonList.add(doneBtn);
        "".length();
        this.tileSign.setEditable((boolean)(GuiEditSign.lllIIIIlIIIlII[1] != 0));
    }
    
    private static boolean lIIlllIIIllllIlI(final Object llllllllllllIllIIIIllIIIIIlIIlIl, final Object llllllllllllIllIIIIllIIIIIlIIlII) {
        return llllllllllllIllIIIIllIIIIIlIIlIl == llllllllllllIllIIIIllIIIIIlIIlII;
    }
    
    private static String lIIlllIIIllIllll(final String llllllllllllIllIIIIllIIIIlIIIlII, final String llllllllllllIllIIIIllIIIIlIIIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIIllIIIIlIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIllIIIIlIIIIIl.getBytes(StandardCharsets.UTF_8)), GuiEditSign.lllIIIIlIIIlII[19]), "DES");
            final Cipher llllllllllllIllIIIIllIIIIlIIIllI = Cipher.getInstance("DES");
            llllllllllllIllIIIIllIIIIlIIIllI.init(GuiEditSign.lllIIIIlIIIlII[2], llllllllllllIllIIIIllIIIIlIIIlll);
            return new String(llllllllllllIllIIIIllIIIIlIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIllIIIIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIllIIIIlIIIlIl) {
            llllllllllllIllIIIIllIIIIlIIIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void actionPerformed(final GuiButton llllllllllllIllIIIIllIIIIlllIIll) throws IOException {
        if (lIIlllIIIlllIlII(llllllllllllIllIIIIllIIIIlllIIll.enabled ? 1 : 0) && lIIlllIIIlllIlIl(llllllllllllIllIIIIllIIIIlllIIll.id)) {
            this.tileSign.markDirty();
            this.mc.displayGuiScreen(null);
        }
    }
    
    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)(GuiEditSign.lllIIIIlIIIlII[1] != 0));
        final NetHandlerPlayClient llllllllllllIllIIIIllIIIIlllllII = this.mc.getNetHandler();
        if (lIIlllIIIlllIIll(llllllllllllIllIIIIllIIIIlllllII)) {
            llllllllllllIllIIIIllIIIIlllllII.addToSendQueue(new C12PacketUpdateSign(this.tileSign.getPos(), this.tileSign.signText));
        }
        this.tileSign.setEditable((boolean)(GuiEditSign.lllIIIIlIIIlII[0] != 0));
    }
    
    private static boolean lIIlllIIIlllIllI(final int llllllllllllIllIIIIllIIIIIlIllll, final int llllllllllllIllIIIIllIIIIIlIlllI) {
        return llllllllllllIllIIIIllIIIIIlIllll == llllllllllllIllIIIIllIIIIIlIlllI;
    }
    
    private static boolean lIIlllIIIlllIlII(final int llllllllllllIllIIIIllIIIIIlIIIlI) {
        return llllllllllllIllIIIIllIIIIIlIIIlI != 0;
    }
    
    private static void lIIlllIIIlllIIlI() {
        (lllIIIIlIIIlII = new int[20])[0] = " ".length();
        GuiEditSign.lllIIIIlIIIlII[1] = ((0xEB ^ 0xB8) & ~(0x31 ^ 0x62));
        GuiEditSign.lllIIIIlIIIlII[2] = "  ".length();
        GuiEditSign.lllIIIIlIIIlII[3] = (0xCF ^ 0x9E ^ (0x63 ^ 0x56));
        GuiEditSign.lllIIIIlIIIlII[4] = (0x1B ^ 0x1F);
        GuiEditSign.lllIIIIlIIIlII[5] = (0x23 ^ 0x5B);
        GuiEditSign.lllIIIIlIIIlII[6] = 24 + 30 - 26 + 146 + (0xD3 ^ 0x95) - (0x5D ^ 0x6F) + (0x9F ^ 0x99);
        GuiEditSign.lllIIIIlIIIlII[7] = "   ".length();
        GuiEditSign.lllIIIIlIIIlII[8] = 13 + 127 - 105 + 173;
        GuiEditSign.lllIIIIlIIIlII[9] = (0x6 ^ 0x1A);
        GuiEditSign.lllIIIIlIIIlII[10] = 72 + 18 + 15 + 50 + (0x30 ^ 0x67) - (86 + 79 + 28 + 46) + (51 + 8 + 6 + 88);
        GuiEditSign.lllIIIIlIIIlII[11] = (0x78 ^ 0x76);
        GuiEditSign.lllIIIIlIIIlII[12] = (0xFB ^ 0xA1);
        GuiEditSign.lllIIIIlIIIlII[13] = (0xB4 ^ 0x9C);
        GuiEditSign.lllIIIIlIIIlII[14] = (-1 & 0xFFFFFF);
        GuiEditSign.lllIIIIlIIIlII[15] = (-(0xFFFFFEF6 & 0x5B9F) & (0xFFFFDBFF & 0x7FFD));
        GuiEditSign.lllIIIIlIIIlII[16] = (103 + 20 - 31 + 48 ^ 119 + 10 - 59 + 67);
        GuiEditSign.lllIIIIlIIIlII[17] = (96 + 62 - 129 + 154 ^ 85 + 32 + 35 + 25);
        GuiEditSign.lllIIIIlIIIlII[18] = -" ".length();
        GuiEditSign.lllIIIIlIIIlII[19] = (0x64 ^ 0x6C);
    }
    
    private static String lIIlllIIIlllIIII(final String llllllllllllIllIIIIllIIIIIllIlll, final String llllllllllllIllIIIIllIIIIIllIlII) {
        try {
            final SecretKeySpec llllllllllllIllIIIIllIIIIIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIllIIIIIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIIllIIIIIlllIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIIllIIIIIlllIIl.init(GuiEditSign.lllIIIIlIIIlII[2], llllllllllllIllIIIIllIIIIIlllIlI);
            return new String(llllllllllllIllIIIIllIIIIIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIllIIIIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIllIIIIIlllIII) {
            llllllllllllIllIIIIllIIIIIlllIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlllIIIllllIIl(final int llllllllllllIllIIIIllIIIIIlIlIll, final int llllllllllllIllIIIIllIIIIIlIlIlI) {
        return llllllllllllIllIIIIllIIIIIlIlIll <= llllllllllllIllIIIIllIIIIIlIlIlI;
    }
    
    public GuiEditSign(final TileEntitySign llllllllllllIllIIIIllIIIlIIIIlIl) {
        this.tileSign = llllllllllllIllIIIIllIIIlIIIIlIl;
    }
    
    @Override
    public void updateScreen() {
        this.updateCounter += GuiEditSign.lllIIIIlIIIlII[0];
    }
}
