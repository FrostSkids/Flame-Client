// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.inventory.Slot;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C17PacketCustomPayload;
import net.minecraft.network.PacketBuffer;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Arrays;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.world.World;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.renderer.GlStateManager;
import java.io.IOException;
import net.minecraft.inventory.Container;
import org.lwjgl.input.Keyboard;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.inventory.ContainerRepair;
import net.minecraft.inventory.ICrafting;
import net.minecraft.client.gui.inventory.GuiContainer;

public class GuiRepair extends GuiContainer implements ICrafting
{
    private /* synthetic */ ContainerRepair anvil;
    private static final /* synthetic */ int[] llllllIIIIlll;
    private /* synthetic */ GuiTextField nameField;
    private static final /* synthetic */ ResourceLocation anvilResource;
    private static final /* synthetic */ String[] llllllIIIIllI;
    private /* synthetic */ InventoryPlayer playerInventory;
    
    private static boolean lIlIlllllIllIlI(final int lllllllllllllIlIlIlIllIlIlllllII, final int lllllllllllllIlIlIlIllIlIllllIll) {
        return lllllllllllllIlIlIlIllIlIlllllII < lllllllllllllIlIlIlIllIlIllllIll;
    }
    
    private static String lIlIlllllIIllll(final String lllllllllllllIlIlIlIllIllIlIIIII, final String lllllllllllllIlIlIlIllIllIIlllIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlIllIllIlIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIllIllIIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIlIllIllIlIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIlIllIllIlIIIlI.init(GuiRepair.llllllIIIIlll[2], lllllllllllllIlIlIlIllIllIlIIIll);
            return new String(lllllllllllllIlIlIlIllIllIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIllIllIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlIllIllIlIIIIl) {
            lllllllllllllIlIlIlIllIllIlIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIlllllIlIllI(final int lllllllllllllIlIlIlIllIlIlllIIll) {
        return lllllllllllllIlIlIlIllIlIlllIIll == 0;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        Keyboard.enableRepeatEvents((boolean)(GuiRepair.llllllIIIIlll[1] != 0));
        final int lllllllllllllIlIlIlIlllIIIlIIIIl = (this.width - this.xSize) / GuiRepair.llllllIIIIlll[2];
        final int lllllllllllllIlIlIlIlllIIIlIIIII = (this.height - this.ySize) / GuiRepair.llllllIIIIlll[2];
        this.nameField = new GuiTextField(GuiRepair.llllllIIIIlll[0], this.fontRendererObj, lllllllllllllIlIlIlIlllIIIlIIIIl + GuiRepair.llllllIIIIlll[3], lllllllllllllIlIlIlIlllIIIlIIIII + GuiRepair.llllllIIIIlll[4], GuiRepair.llllllIIIIlll[5], GuiRepair.llllllIIIIlll[6]);
        this.nameField.setTextColor(GuiRepair.llllllIIIIlll[7]);
        this.nameField.setDisabledTextColour(GuiRepair.llllllIIIIlll[7]);
        this.nameField.setEnableBackgroundDrawing((boolean)(GuiRepair.llllllIIIIlll[0] != 0));
        this.nameField.setMaxStringLength(GuiRepair.llllllIIIIlll[8]);
        this.inventorySlots.removeCraftingFromCrafters(this);
        this.inventorySlots.onCraftGuiOpened(this);
    }
    
    @Override
    public void sendProgressBarUpdate(final Container lllllllllllllIlIlIlIllIllIlllIlI, final int lllllllllllllIlIlIlIllIllIlllIIl, final int lllllllllllllIlIlIlIllIllIlllIII) {
    }
    
    @Override
    protected void mouseClicked(final int lllllllllllllIlIlIlIllIllllIlIll, final int lllllllllllllIlIlIlIllIllllIIllI, final int lllllllllllllIlIlIlIllIllllIIlIl) throws IOException {
        super.mouseClicked(lllllllllllllIlIlIlIllIllllIlIll, lllllllllllllIlIlIlIllIllllIIllI, lllllllllllllIlIlIlIllIllllIIlIl);
        this.nameField.mouseClicked(lllllllllllllIlIlIlIllIllllIlIll, lllllllllllllIlIlIlIllIllllIIllI, lllllllllllllIlIlIlIllIllllIIlIl);
    }
    
    private static boolean lIlIlllllIllIIl(final Object lllllllllllllIlIlIlIllIlIlllIlll) {
        return lllllllllllllIlIlIlIllIlIlllIlll == null;
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(final int lllllllllllllIlIlIlIlllIIIIlIIIl, final int lllllllllllllIlIlIlIlllIIIIlIIII) {
        GlStateManager.disableLighting();
        GlStateManager.disableBlend();
        this.fontRendererObj.drawString(I18n.format(GuiRepair.llllllIIIIllI[GuiRepair.llllllIIIIlll[1]], new Object[GuiRepair.llllllIIIIlll[0]]), GuiRepair.llllllIIIIlll[9], GuiRepair.llllllIIIIlll[10], GuiRepair.llllllIIIIlll[11]);
        "".length();
        if (lIlIlllllIlIlII(this.anvil.maximumCost)) {
            int lllllllllllllIlIlIlIlllIIIIIllll = GuiRepair.llllllIIIIlll[12];
            boolean lllllllllllllIlIlIlIlllIIIIIlllI = GuiRepair.llllllIIIIlll[1] != 0;
            final String llllllllllllIlIllIlIIIIIllllIIll = GuiRepair.llllllIIIIllI[GuiRepair.llllllIIIIlll[2]];
            final Object[] llllllllllllIlIllIlIIIIIllllIIII = new Object[GuiRepair.llllllIIIIlll[1]];
            llllllllllllIlIllIlIIIIIllllIIII[GuiRepair.llllllIIIIlll[0]] = this.anvil.maximumCost;
            String lllllllllllllIlIlIlIlllIIIIIllIl = I18n.format(llllllllllllIlIllIlIIIIIllllIIll, llllllllllllIlIllIlIIIIIllllIIII);
            if (lIlIlllllIlIlIl(this.anvil.maximumCost, GuiRepair.llllllIIIIlll[13]) && lIlIlllllIlIllI(this.mc.thePlayer.capabilities.isCreativeMode ? 1 : 0)) {
                lllllllllllllIlIlIlIlllIIIIIllIl = I18n.format(GuiRepair.llllllIIIIllI[GuiRepair.llllllIIIIlll[14]], new Object[GuiRepair.llllllIIIIlll[0]]);
                lllllllllllllIlIlIlIlllIIIIIllll = GuiRepair.llllllIIIIlll[15];
                "".length();
                if ("  ".length() == (0xE0 ^ 0x81 ^ (0xA3 ^ 0xC6))) {
                    return;
                }
            }
            else if (lIlIlllllIlIllI(this.anvil.getSlot(GuiRepair.llllllIIIIlll[2]).getHasStack() ? 1 : 0)) {
                lllllllllllllIlIlIlIlllIIIIIlllI = (GuiRepair.llllllIIIIlll[0] != 0);
                "".length();
                if (((97 + 131 - 140 + 72 ^ 40 + 128 - 136 + 149) & (0x9C ^ 0x9A ^ (0x50 ^ 0x43) ^ -" ".length())) < 0) {
                    return;
                }
            }
            else if (lIlIlllllIlIllI(this.anvil.getSlot(GuiRepair.llllllIIIIlll[2]).canTakeStack(this.playerInventory.player) ? 1 : 0)) {
                lllllllllllllIlIlIlIlllIIIIIllll = GuiRepair.llllllIIIIlll[15];
            }
            if (lIlIlllllIlIlll(lllllllllllllIlIlIlIlllIIIIIlllI ? 1 : 0)) {
                final int lllllllllllllIlIlIlIlllIIIIIllII = GuiRepair.llllllIIIIlll[16] | (lllllllllllllIlIlIlIlllIIIIIllll & GuiRepair.llllllIIIIlll[17]) >> GuiRepair.llllllIIIIlll[2] | (lllllllllllllIlIlIlIlllIIIIIllll & GuiRepair.llllllIIIIlll[16]);
                final int lllllllllllllIlIlIlIlllIIIIIlIll = this.xSize - GuiRepair.llllllIIIIlll[18] - this.fontRendererObj.getStringWidth(lllllllllllllIlIlIlIlllIIIIIllIl);
                final int lllllllllllllIlIlIlIlllIIIIIlIlI = GuiRepair.llllllIIIIlll[19];
                if (lIlIlllllIlIlll(this.fontRendererObj.getUnicodeFlag() ? 1 : 0)) {
                    Gui.drawRect(lllllllllllllIlIlIlIlllIIIIIlIll - GuiRepair.llllllIIIIlll[14], lllllllllllllIlIlIlIlllIIIIIlIlI - GuiRepair.llllllIIIIlll[2], this.xSize - GuiRepair.llllllIIIIlll[20], lllllllllllllIlIlIlIlllIIIIIlIlI + GuiRepair.llllllIIIIlll[21], GuiRepair.llllllIIIIlll[16]);
                    Gui.drawRect(lllllllllllllIlIlIlIlllIIIIIlIll - GuiRepair.llllllIIIIlll[2], lllllllllllllIlIlIlIlllIIIIIlIlI - GuiRepair.llllllIIIIlll[1], this.xSize - GuiRepair.llllllIIIIlll[18], lllllllllllllIlIlIlIlllIIIIIlIlI + GuiRepair.llllllIIIIlll[22], GuiRepair.llllllIIIIlll[23]);
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return;
                    }
                }
                else {
                    this.fontRendererObj.drawString(lllllllllllllIlIlIlIlllIIIIIllIl, lllllllllllllIlIlIlIlllIIIIIlIll, lllllllllllllIlIlIlIlllIIIIIlIlI + GuiRepair.llllllIIIIlll[1], lllllllllllllIlIlIlIlllIIIIIllII);
                    "".length();
                    this.fontRendererObj.drawString(lllllllllllllIlIlIlIlllIIIIIllIl, lllllllllllllIlIlIlIlllIIIIIlIll + GuiRepair.llllllIIIIlll[1], lllllllllllllIlIlIlIlllIIIIIlIlI, lllllllllllllIlIlIlIlllIIIIIllII);
                    "".length();
                    this.fontRendererObj.drawString(lllllllllllllIlIlIlIlllIIIIIllIl, lllllllllllllIlIlIlIlllIIIIIlIll + GuiRepair.llllllIIIIlll[1], lllllllllllllIlIlIlIlllIIIIIlIlI + GuiRepair.llllllIIIIlll[1], lllllllllllllIlIlIlIlllIIIIIllII);
                    "".length();
                }
                this.fontRendererObj.drawString(lllllllllllllIlIlIlIlllIIIIIllIl, lllllllllllllIlIlIlIlllIIIIIlIll, lllllllllllllIlIlIlIlllIIIIIlIlI, lllllllllllllIlIlIlIlllIIIIIllll);
                "".length();
            }
        }
        GlStateManager.enableLighting();
    }
    
    @Override
    public void sendSlotContents(final Container lllllllllllllIlIlIlIllIlllIIIIIl, final int lllllllllllllIlIlIlIllIllIllllIl, final ItemStack lllllllllllllIlIlIlIllIllIllllII) {
        if (lIlIlllllIlIllI(lllllllllllllIlIlIlIllIllIllllIl)) {
            final GuiTextField nameField = this.nameField;
            String displayName;
            if (lIlIlllllIllIIl(lllllllllllllIlIlIlIllIllIllllII)) {
                displayName = GuiRepair.llllllIIIIllI[GuiRepair.llllllIIIIlll[10]];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                displayName = lllllllllllllIlIlIlIllIllIllllII.getDisplayName();
            }
            nameField.setText(displayName);
            final GuiTextField nameField2 = this.nameField;
            int enabled;
            if (lIlIlllllIllIII(lllllllllllllIlIlIlIllIllIllllII)) {
                enabled = GuiRepair.llllllIIIIlll[1];
                "".length();
                if (-(0xDA ^ 0xB6 ^ (0x4D ^ 0x25)) > 0) {
                    return;
                }
            }
            else {
                enabled = GuiRepair.llllllIIIIlll[0];
            }
            nameField2.setEnabled((boolean)(enabled != 0));
            if (lIlIlllllIllIII(lllllllllllllIlIlIlIllIllIllllII)) {
                this.renameItem();
            }
        }
    }
    
    private static boolean lIlIlllllIllIII(final Object lllllllllllllIlIlIlIllIlIllllIIl) {
        return lllllllllllllIlIlIlIllIlIllllIIl != null;
    }
    
    private static boolean lIlIlllllIlIlIl(final int lllllllllllllIlIlIlIllIllIIIIIII, final int lllllllllllllIlIlIlIllIlIlllllll) {
        return lllllllllllllIlIlIlIllIllIIIIIII >= lllllllllllllIlIlIlIllIlIlllllll;
    }
    
    @Override
    public void func_175173_a(final Container lllllllllllllIlIlIlIllIllIllIllI, final IInventory lllllllllllllIlIlIlIllIllIllIlIl) {
    }
    
    private static void lIlIlllllIlIIll() {
        (llllllIIIIlll = new int[34])[0] = ((0xB2 ^ 0x8F) & ~(0x61 ^ 0x5C));
        GuiRepair.llllllIIIIlll[1] = " ".length();
        GuiRepair.llllllIIIIlll[2] = "  ".length();
        GuiRepair.llllllIIIIlll[3] = (136 + 57 - 46 + 13 ^ 146 + 151 - 259 + 120);
        GuiRepair.llllllIIIIlll[4] = (11 + 83 + 7 + 42 ^ 56 + 45 - 18 + 68);
        GuiRepair.llllllIIIIlll[5] = (0xC ^ 0x6B);
        GuiRepair.llllllIIIIlll[6] = (0x68 ^ 0x64);
        GuiRepair.llllllIIIIlll[7] = -" ".length();
        GuiRepair.llllllIIIIlll[8] = (0x90 ^ 0xC4 ^ (0x53 ^ 0x19));
        GuiRepair.llllllIIIIlll[9] = (0x2 ^ 0x17 ^ (0x4E ^ 0x67));
        GuiRepair.llllllIIIIlll[10] = (0x47 ^ 0x41);
        GuiRepair.llllllIIIIlll[11] = (0xFFFFF649 & 0x4049F6);
        GuiRepair.llllllIIIIlll[12] = (0xFFFFFF67 & 0x80FFB8);
        GuiRepair.llllllIIIIlll[13] = (0xC ^ 0x24);
        GuiRepair.llllllIIIIlll[14] = "   ".length();
        GuiRepair.llllllIIIIlll[15] = (0xFFFFF7FA & 0xFF6865);
        GuiRepair.llllllIIIIlll[16] = -(-(0xFFFFDBDF & 0x7FFF) & (0xFFFFFBDE & 0x1005FFF));
        GuiRepair.llllllIIIIlll[17] = (0xFFFFFFFE & 0xFCFCFD);
        GuiRepair.llllllIIIIlll[18] = (0xA9 ^ 0xA1);
        GuiRepair.llllllIIIIlll[19] = (161 + 70 - 50 + 57 ^ 159 + 150 - 253 + 117);
        GuiRepair.llllllIIIIlll[20] = (0x72 ^ 0x75);
        GuiRepair.llllllIIIIlll[21] = (0x50 ^ 0x3 ^ (0xF1 ^ 0xA8));
        GuiRepair.llllllIIIIlll[22] = (0x66 ^ 0x6F);
        GuiRepair.llllllIIIIlll[23] = -(-(0xFFFFE9BF & 0x1F5B) & (0xFFFFEFFF & 0xC4DDDF));
        GuiRepair.llllllIIIIlll[24] = (0x2 ^ 0x6);
        GuiRepair.llllllIIIIlll[25] = (0x1F ^ 0x1A);
        GuiRepair.llllllIIIIlll[26] = (0x7E ^ 0x45);
        GuiRepair.llllllIIIIlll[27] = (0x7D ^ 0x2C ^ (0x7A ^ 0x3F));
        GuiRepair.llllllIIIIlll[28] = (0x5F ^ 0x4F);
        GuiRepair.llllllIIIIlll[29] = (0x33 ^ 0x40 ^ (0xD9 ^ 0xC4));
        GuiRepair.llllllIIIIlll[30] = (4 + 108 + 45 + 84 ^ 46 + 77 - 110 + 133);
        GuiRepair.llllllIIIIlll[31] = ("   ".length() ^ (0x2B ^ 0x5));
        GuiRepair.llllllIIIIlll[32] = (16 + 67 - 51 + 113 ^ 79 + 136 - 209 + 135);
        GuiRepair.llllllIIIIlll[33] = (0x88 ^ 0x9D);
    }
    
    static {
        lIlIlllllIlIIll();
        lIlIlllllIlIIIl();
        anvilResource = new ResourceLocation(GuiRepair.llllllIIIIllI[GuiRepair.llllllIIIIlll[0]]);
    }
    
    @Override
    protected void keyTyped(final char lllllllllllllIlIlIlIllIllllllllI, final int lllllllllllllIlIlIlIllIlllllllIl) throws IOException {
        if (lIlIlllllIlIlll(this.nameField.textboxKeyTyped(lllllllllllllIlIlIlIllIllllllllI, lllllllllllllIlIlIlIllIlllllllIl) ? 1 : 0)) {
            this.renameItem();
            "".length();
            if ((0x2D ^ 0x28) == 0x0) {
                return;
            }
        }
        else {
            super.keyTyped(lllllllllllllIlIlIlIllIllllllllI, lllllllllllllIlIlIlIllIlllllllIl);
        }
    }
    
    private static void lIlIlllllIlIIIl() {
        (llllllIIIIllI = new String[GuiRepair.llllllIIIIlll[20]])[GuiRepair.llllllIIIIlll[0]] = lIlIlllllIIlllI("pGqARTK80T49OFhOByoCGotjJEviyIj2JcdoMgceE+mTDlUY6kMz/g==", "puEiI");
        GuiRepair.llllllIIIIllI[GuiRepair.llllllIIIIlll[1]] = lIlIlllllIIllll("6SLH5ZSnFpy1WwC1REya+VN4jZcLGHjG", "Rlzdg");
        GuiRepair.llllllIIIIllI[GuiRepair.llllllIIIIlll[2]] = lIlIlllllIlIIII("Bik4JQcMKDMjSBcjJjAPF2g1PhUR", "eFVQf");
        GuiRepair.llllllIIIIllI[GuiRepair.llllllIIIIlll[14]] = lIlIlllllIIlllI("o3+xIjJ4XefFS0cHEUdf+/1a5VGScGlc9uNed4REYe4=", "nsvgi");
        GuiRepair.llllllIIIIllI[GuiRepair.llllllIIIIlll[24]] = lIlIlllllIIllll("GLgAo1TQfto=", "UJyYW");
        GuiRepair.llllllIIIIllI[GuiRepair.llllllIIIIlll[25]] = lIlIlllllIIllll("b03cR8gKfJZPsls1mZi+4Q==", "lqrTG");
        GuiRepair.llllllIIIIllI[GuiRepair.llllllIIIIlll[10]] = lIlIlllllIIllll("aEW4cqsAwfw=", "yTntL");
    }
    
    private static boolean lIlIlllllIlIlII(final int lllllllllllllIlIlIlIllIlIlllIIIl) {
        return lllllllllllllIlIlIlIllIlIlllIIIl > 0;
    }
    
    public GuiRepair(final InventoryPlayer lllllllllllllIlIlIlIlllIIIlIlIlI, final World lllllllllllllIlIlIlIlllIIIlIIllI) {
        super(new ContainerRepair(lllllllllllllIlIlIlIlllIIIlIlIlI, lllllllllllllIlIlIlIlllIIIlIIllI, Minecraft.getMinecraft().thePlayer));
        this.playerInventory = lllllllllllllIlIlIlIlllIIIlIlIlI;
        this.anvil = (ContainerRepair)this.inventorySlots;
    }
    
    private static String lIlIlllllIIlllI(final String lllllllllllllIlIlIlIllIllIlIlIll, final String lllllllllllllIlIlIlIllIllIlIllII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlIllIllIllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIllIllIlIllII.getBytes(StandardCharsets.UTF_8)), GuiRepair.llllllIIIIlll[18]), "DES");
            final Cipher lllllllllllllIlIlIlIllIllIlIllll = Cipher.getInstance("DES");
            lllllllllllllIlIlIlIllIllIlIllll.init(GuiRepair.llllllIIIIlll[2], lllllllllllllIlIlIlIllIllIllIIII);
            return new String(lllllllllllllIlIlIlIllIllIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIllIllIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlIllIllIlIlllI) {
            lllllllllllllIlIlIlIllIllIlIlllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void drawScreen(final int lllllllllllllIlIlIlIllIlllIlllll, final int lllllllllllllIlIlIlIllIlllIllIlI, final float lllllllllllllIlIlIlIllIlllIllIIl) {
        super.drawScreen(lllllllllllllIlIlIlIllIlllIlllll, lllllllllllllIlIlIlIllIlllIllIlI, lllllllllllllIlIlIlIllIlllIllIIl);
        GlStateManager.disableLighting();
        GlStateManager.disableBlend();
        this.nameField.drawTextBox();
    }
    
    @Override
    public void onGuiClosed() {
        super.onGuiClosed();
        Keyboard.enableRepeatEvents((boolean)(GuiRepair.llllllIIIIlll[0] != 0));
        this.inventorySlots.removeCraftingFromCrafters(this);
    }
    
    private static String lIlIlllllIlIIII(String lllllllllllllIlIlIlIllIllIIIlIll, final String lllllllllllllIlIlIlIllIllIIIlIlI) {
        lllllllllllllIlIlIlIllIllIIIlIll = (short)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIlIllIllIIIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIlIllIllIIIlllI = new StringBuilder();
        final char[] lllllllllllllIlIlIlIllIllIIIllIl = lllllllllllllIlIlIlIllIllIIIlIlI.toCharArray();
        int lllllllllllllIlIlIlIllIllIIIllII = GuiRepair.llllllIIIIlll[0];
        final Exception lllllllllllllIlIlIlIllIllIIIIllI = (Object)((String)lllllllllllllIlIlIlIllIllIIIlIll).toCharArray();
        final char lllllllllllllIlIlIlIllIllIIIIlIl = (char)lllllllllllllIlIlIlIllIllIIIIllI.length;
        short lllllllllllllIlIlIlIllIllIIIIlII = (short)GuiRepair.llllllIIIIlll[0];
        while (lIlIlllllIllIlI(lllllllllllllIlIlIlIllIllIIIIlII, lllllllllllllIlIlIlIllIllIIIIlIl)) {
            final char lllllllllllllIlIlIlIllIllIIlIIIl = lllllllllllllIlIlIlIllIllIIIIllI[lllllllllllllIlIlIlIllIllIIIIlII];
            lllllllllllllIlIlIlIllIllIIIlllI.append((char)(lllllllllllllIlIlIlIllIllIIlIIIl ^ lllllllllllllIlIlIlIllIllIIIllIl[lllllllllllllIlIlIlIllIllIIIllII % lllllllllllllIlIlIlIllIllIIIllIl.length]));
            "".length();
            ++lllllllllllllIlIlIlIllIllIIIllII;
            ++lllllllllllllIlIlIlIllIllIIIIlII;
            "".length();
            if ("  ".length() < -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIlIllIllIIIlllI);
    }
    
    private static boolean lIlIlllllIlIlll(final int lllllllllllllIlIlIlIllIlIlllIlIl) {
        return lllllllllllllIlIlIlIllIlIlllIlIl != 0;
    }
    
    @Override
    public void updateCraftingInventory(final Container lllllllllllllIlIlIlIllIlllIIlIIl, final List<ItemStack> lllllllllllllIlIlIlIllIlllIIlIII) {
        this.sendSlotContents(lllllllllllllIlIlIlIllIlllIIlIIl, GuiRepair.llllllIIIIlll[0], lllllllllllllIlIlIlIllIlllIIlIIl.getSlot(GuiRepair.llllllIIIIlll[0]).getStack());
    }
    
    @Override
    protected void drawGuiContainerBackgroundLayer(final float lllllllllllllIlIlIlIllIlllIlIlII, final int lllllllllllllIlIlIlIllIlllIlIIll, final int lllllllllllllIlIlIlIllIlllIlIIlI) {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(GuiRepair.anvilResource);
        final int lllllllllllllIlIlIlIllIlllIlIIIl = (this.width - this.xSize) / GuiRepair.llllllIIIIlll[2];
        final int lllllllllllllIlIlIlIllIlllIlIIII = (this.height - this.ySize) / GuiRepair.llllllIIIIlll[2];
        this.drawTexturedModalRect(lllllllllllllIlIlIlIllIlllIlIIIl, lllllllllllllIlIlIlIllIlllIlIIII, GuiRepair.llllllIIIIlll[0], GuiRepair.llllllIIIIlll[0], this.xSize, this.ySize);
        final int llllllllllllIlllIlIlllIIIlIIIllI = lllllllllllllIlIlIlIllIlllIlIIIl + GuiRepair.llllllIIIIlll[26];
        final int llllllllllllIlllIlIlllIIIlIIIlIl = lllllllllllllIlIlIlIllIlllIlIIII + GuiRepair.llllllIIIIlll[27];
        final int llllllllllllIlllIlIlllIIIIlllIIl = GuiRepair.llllllIIIIlll[0];
        final int ySize = this.ySize;
        int n;
        if (lIlIlllllIlIlll(this.anvil.getSlot(GuiRepair.llllllIIIIlll[0]).getHasStack() ? 1 : 0)) {
            n = GuiRepair.llllllIIIIlll[0];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            n = GuiRepair.llllllIIIIlll[28];
        }
        this.drawTexturedModalRect(llllllllllllIlllIlIlllIIIlIIIllI, llllllllllllIlllIlIlllIIIlIIIlIl, llllllllllllIlllIlIlllIIIIlllIIl, ySize + n, GuiRepair.llllllIIIIlll[29], GuiRepair.llllllIIIIlll[28]);
        if ((!lIlIlllllIlIllI(this.anvil.getSlot(GuiRepair.llllllIIIIlll[0]).getHasStack() ? 1 : 0) || lIlIlllllIlIlll(this.anvil.getSlot(GuiRepair.llllllIIIIlll[1]).getHasStack() ? 1 : 0)) && lIlIlllllIlIllI(this.anvil.getSlot(GuiRepair.llllllIIIIlll[2]).getHasStack() ? 1 : 0)) {
            this.drawTexturedModalRect(lllllllllllllIlIlIlIllIlllIlIIIl + GuiRepair.llllllIIIIlll[30], lllllllllllllIlIlIlIllIlllIlIIII + GuiRepair.llllllIIIIlll[31], this.xSize, GuiRepair.llllllIIIIlll[0], GuiRepair.llllllIIIIlll[32], GuiRepair.llllllIIIIlll[33]);
        }
    }
    
    private void renameItem() {
        String lllllllllllllIlIlIlIllIlllllIlIl = this.nameField.getText();
        final Slot lllllllllllllIlIlIlIllIlllllIlII = this.anvil.getSlot(GuiRepair.llllllIIIIlll[0]);
        if (lIlIlllllIllIII(lllllllllllllIlIlIlIllIlllllIlII) && lIlIlllllIlIlll(lllllllllllllIlIlIlIllIlllllIlII.getHasStack() ? 1 : 0) && lIlIlllllIlIllI(lllllllllllllIlIlIlIllIlllllIlII.getStack().hasDisplayName() ? 1 : 0) && lIlIlllllIlIlll(lllllllllllllIlIlIlIllIlllllIlIl.equals(lllllllllllllIlIlIlIllIlllllIlII.getStack().getDisplayName()) ? 1 : 0)) {
            lllllllllllllIlIlIlIllIlllllIlIl = GuiRepair.llllllIIIIllI[GuiRepair.llllllIIIIlll[24]];
        }
        this.anvil.updateItemName(lllllllllllllIlIlIlIllIlllllIlIl);
        this.mc.thePlayer.sendQueue.addToSendQueue(new C17PacketCustomPayload(GuiRepair.llllllIIIIllI[GuiRepair.llllllIIIIlll[25]], new PacketBuffer(Unpooled.buffer()).writeString(lllllllllllllIlIlIlIllIlllllIlIl)));
    }
}
