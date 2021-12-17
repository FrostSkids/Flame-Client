// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui.inventory;

import java.util.Iterator;
import java.util.Arrays;
import net.minecraft.potion.Potion;
import net.minecraft.client.Minecraft;
import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C17PacketCustomPayload;
import net.minecraft.network.PacketBuffer;
import io.netty.buffer.Unpooled;
import net.minecraft.client.gui.GuiScreen;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.client.renderer.GlStateManager;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.tileentity.TileEntityBeacon;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerBeacon;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.Logger;

public class GuiBeacon extends GuiContainer
{
    private /* synthetic */ ConfirmButton beaconConfirmButton;
    private static final /* synthetic */ int[] llIllIlIllIllI;
    private static final /* synthetic */ ResourceLocation beaconGuiTextures;
    private /* synthetic */ IInventory tileBeacon;
    private /* synthetic */ boolean buttonsNotDrawn;
    private static final /* synthetic */ String[] llIllIIlllIlII;
    
    private static boolean lIIlIllllllllIlI(final int llllllllllllIllIIllIlIIllIlIIIIl, final int llllllllllllIllIIllIlIIllIlIIIII) {
        return llllllllllllIllIIllIlIIllIlIIIIl >= llllllllllllIllIIllIlIIllIlIIIII;
    }
    
    private static boolean lIIlIlllllllllll(final int llllllllllllIllIIllIlIIllIIlllIl, final int llllllllllllIllIIllIlIIllIIlllII) {
        return llllllllllllIllIIllIlIIllIIlllIl < llllllllllllIllIIllIlIIllIIlllII;
    }
    
    private static boolean lIIlIllllllllllI(final Object llllllllllllIllIIllIlIIllIIlIllI) {
        return llllllllllllIllIIllIlIIllIIlIllI != null;
    }
    
    private static boolean lIIlIlllllllllII(final int llllllllllllIllIIllIlIIllIIllIIl, final int llllllllllllIllIIllIlIIllIIllIII) {
        return llllllllllllIllIIllIlIIllIIllIIl > llllllllllllIllIIllIlIIllIIllIII;
    }
    
    public GuiBeacon(final InventoryPlayer llllllllllllIllIIllIlIlIIIlIllII, final IInventory llllllllllllIllIIllIlIlIIIlIlIII) {
        super(new ContainerBeacon(llllllllllllIllIIllIlIlIIIlIllII, llllllllllllIllIIllIlIlIIIlIlIII));
        this.tileBeacon = llllllllllllIllIIllIlIlIIIlIlIII;
        this.xSize = GuiBeacon.llIllIlIllIllI[1];
        this.ySize = GuiBeacon.llIllIlIllIllI[2];
    }
    
    private static boolean lIIlIllllllllIll(final int llllllllllllIllIIllIlIIllIlIIlIl, final int llllllllllllIllIIllIlIIllIlIIlII) {
        return llllllllllllIllIIllIlIIllIlIIlIl == llllllllllllIllIIllIlIIllIlIIlII;
    }
    
    private static boolean lIIlIllllllllIII(final int llllllllllllIllIIllIlIIllIIlIlII) {
        return llllllllllllIllIIllIlIIllIIlIlII != 0;
    }
    
    private static String lIIlIlllIIlllIlI(String llllllllllllIllIIllIlIIllIllIIII, final String llllllllllllIllIIllIlIIllIllIlII) {
        llllllllllllIllIIllIlIIllIllIIII = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIllIlIIllIllIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIllIlIIllIllIIll = new StringBuilder();
        final char[] llllllllllllIllIIllIlIIllIllIIlI = llllllllllllIllIIllIlIIllIllIlII.toCharArray();
        int llllllllllllIllIIllIlIIllIllIIIl = GuiBeacon.llIllIlIllIllI[0];
        final long llllllllllllIllIIllIlIIllIlIlIll = (Object)((String)llllllllllllIllIIllIlIIllIllIIII).toCharArray();
        final char llllllllllllIllIIllIlIIllIlIlIlI = (char)llllllllllllIllIIllIlIIllIlIlIll.length;
        String llllllllllllIllIIllIlIIllIlIlIIl = (String)GuiBeacon.llIllIlIllIllI[0];
        while (lIIlIlllllllllll((int)llllllllllllIllIIllIlIIllIlIlIIl, llllllllllllIllIIllIlIIllIlIlIlI)) {
            final char llllllllllllIllIIllIlIIllIllIllI = llllllllllllIllIIllIlIIllIlIlIll[llllllllllllIllIIllIlIIllIlIlIIl];
            llllllllllllIllIIllIlIIllIllIIll.append((char)(llllllllllllIllIIllIlIIllIllIllI ^ llllllllllllIllIIllIlIIllIllIIlI[llllllllllllIllIIllIlIIllIllIIIl % llllllllllllIllIIllIlIIllIllIIlI.length]));
            "".length();
            ++llllllllllllIllIIllIlIIllIllIIIl;
            ++llllllllllllIllIIllIlIIllIlIlIIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIllIlIIllIllIIll);
    }
    
    private static void lIIlIlllIIllllII() {
        (llIllIIlllIlII = new String[GuiBeacon.llIllIlIllIllI[27]])[GuiBeacon.llIllIlIllIllI[0]] = lIIlIlllIIlllIlI("AR0UDhYHHR9VBAARQxkMGwwNEw0QCkMYBhQbAxRNBRYL", "uxlzc");
        GuiBeacon.llIllIIlllIlII[GuiBeacon.llIllIlIllIllI[8]] = lIIlIlllIIlllIll("d/erGZPS+0tedDIDe1xHLw==", "sAhnq");
        GuiBeacon.llIllIIlllIlII[GuiBeacon.llIllIlIllIllI[9]] = lIIlIlllIIlllIll("9aw0CtZfnxzNzHFCoR+w+m3+ZRxTrNk5", "YnZOY");
        GuiBeacon.llIllIIlllIlII[GuiBeacon.llIllIlIllIllI[15]] = lIIlIlllIIlllIlI("PzofAEkpNhIGCCV9AAAEJD0XBBUy", "KSseg");
    }
    
    private static boolean lIIlIllllllllIIl(final int llllllllllllIllIIllIlIIllIIlIIII) {
        return llllllllllllIllIIllIlIIllIIlIIII >= 0;
    }
    
    @Override
    public void updateScreen() {
        super.updateScreen();
        final int llllllllllllIllIIllIlIlIIIIllIIl = this.tileBeacon.getField(GuiBeacon.llIllIlIllIllI[0]);
        final int llllllllllllIllIIllIlIlIIIIllIII = this.tileBeacon.getField(GuiBeacon.llIllIlIllIllI[8]);
        final int llllllllllllIllIIllIlIlIIIIlIlll = this.tileBeacon.getField(GuiBeacon.llIllIlIllIllI[9]);
        if (lIIlIllllllllIII(this.buttonsNotDrawn ? 1 : 0) && lIIlIllllllllIIl(llllllllllllIllIIllIlIlIIIIllIIl)) {
            this.buttonsNotDrawn = (GuiBeacon.llIllIlIllIllI[0] != 0);
            int llllllllllllIllIIllIlIlIIIIlIllI = GuiBeacon.llIllIlIllIllI[0];
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
            while (!lIIlIlllllllllII(llllllllllllIllIIllIlIlIIIIlIllI, GuiBeacon.llIllIlIllIllI[9])) {
                final int llllllllllllIllIIllIlIlIIIIlIlIl = TileEntityBeacon.effectsList[llllllllllllIllIIllIlIlIIIIlIllI].length;
                final int llllllllllllIllIIllIlIlIIIIlIlII = llllllllllllIllIIllIlIlIIIIlIlIl * GuiBeacon.llIllIlIllIllI[10] + (llllllllllllIllIIllIlIlIIIIlIlIl - GuiBeacon.llIllIlIllIllI[8]) * GuiBeacon.llIllIlIllIllI[9];
                int llllllllllllIllIIllIlIlIIIIlIIll = GuiBeacon.llIllIlIllIllI[0];
                "".length();
                if ((154 + 53 - 82 + 66 ^ 24 + 34 + 46 + 83) <= "   ".length()) {
                    return;
                }
                while (!lIIlIllllllllIlI(llllllllllllIllIIllIlIlIIIIlIIll, llllllllllllIllIIllIlIlIIIIlIlIl)) {
                    final int llllllllllllIllIIllIlIlIIIIlIIlI = TileEntityBeacon.effectsList[llllllllllllIllIIllIlIlIIIIlIllI][llllllllllllIllIIllIlIlIIIIlIIll].id;
                    final PowerButton llllllllllllIllIIllIlIlIIIIlIIIl = new PowerButton(llllllllllllIllIIllIlIlIIIIlIllI << GuiBeacon.llIllIlIllIllI[11] | llllllllllllIllIIllIlIlIIIIlIIlI, this.guiLeft + GuiBeacon.llIllIlIllIllI[12] + llllllllllllIllIIllIlIlIIIIlIIll * GuiBeacon.llIllIlIllIllI[13] - llllllllllllIllIIllIlIlIIIIlIlII / GuiBeacon.llIllIlIllIllI[9], this.guiTop + GuiBeacon.llIllIlIllIllI[10] + llllllllllllIllIIllIlIlIIIIlIllI * GuiBeacon.llIllIlIllIllI[14], llllllllllllIllIIllIlIlIIIIlIIlI, llllllllllllIllIIllIlIlIIIIlIllI);
                    this.buttonList.add(llllllllllllIllIIllIlIlIIIIlIIIl);
                    "".length();
                    if (lIIlIllllllllIlI(llllllllllllIllIIllIlIlIIIIlIllI, llllllllllllIllIIllIlIlIIIIllIIl)) {
                        llllllllllllIllIIllIlIlIIIIlIIIl.enabled = (GuiBeacon.llIllIlIllIllI[0] != 0);
                        "".length();
                        if (-(8 + 103 + 39 + 31 ^ 12 + 88 + 33 + 43) >= 0) {
                            return;
                        }
                    }
                    else if (lIIlIllllllllIll(llllllllllllIllIIllIlIlIIIIlIIlI, llllllllllllIllIIllIlIlIIIIllIII)) {
                        llllllllllllIllIIllIlIlIIIIlIIIl.func_146140_b((boolean)(GuiBeacon.llIllIlIllIllI[8] != 0));
                    }
                    ++llllllllllllIllIIllIlIlIIIIlIIll;
                }
                ++llllllllllllIllIIllIlIlIIIIlIllI;
            }
            final int llllllllllllIllIIllIlIlIIIIlIIII = GuiBeacon.llIllIlIllIllI[15];
            final int llllllllllllIllIIllIlIlIIIIIllll = TileEntityBeacon.effectsList[llllllllllllIllIIllIlIlIIIIlIIII].length + GuiBeacon.llIllIlIllIllI[8];
            final int llllllllllllIllIIllIlIlIIIIIlllI = llllllllllllIllIIllIlIlIIIIIllll * GuiBeacon.llIllIlIllIllI[10] + (llllllllllllIllIIllIlIlIIIIIllll - GuiBeacon.llIllIlIllIllI[8]) * GuiBeacon.llIllIlIllIllI[9];
            int llllllllllllIllIIllIlIlIIIIIllIl = GuiBeacon.llIllIlIllIllI[0];
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
            while (!lIIlIllllllllIlI(llllllllllllIllIIllIlIlIIIIIllIl, llllllllllllIllIIllIlIlIIIIIllll - GuiBeacon.llIllIlIllIllI[8])) {
                final int llllllllllllIllIIllIlIlIIIIIllII = TileEntityBeacon.effectsList[llllllllllllIllIIllIlIlIIIIlIIII][llllllllllllIllIIllIlIlIIIIIllIl].id;
                final PowerButton llllllllllllIllIIllIlIlIIIIIlIll = new PowerButton(llllllllllllIllIIllIlIlIIIIlIIII << GuiBeacon.llIllIlIllIllI[11] | llllllllllllIllIIllIlIlIIIIIllII, this.guiLeft + GuiBeacon.llIllIlIllIllI[16] + llllllllllllIllIIllIlIlIIIIIllIl * GuiBeacon.llIllIlIllIllI[13] - llllllllllllIllIIllIlIlIIIIIlllI / GuiBeacon.llIllIlIllIllI[9], this.guiTop + GuiBeacon.llIllIlIllIllI[17], llllllllllllIllIIllIlIlIIIIIllII, llllllllllllIllIIllIlIlIIIIlIIII);
                this.buttonList.add(llllllllllllIllIIllIlIlIIIIIlIll);
                "".length();
                if (lIIlIllllllllIlI(llllllllllllIllIIllIlIlIIIIlIIII, llllllllllllIllIIllIlIlIIIIllIIl)) {
                    llllllllllllIllIIllIlIlIIIIIlIll.enabled = (GuiBeacon.llIllIlIllIllI[0] != 0);
                    "".length();
                    if ((47 + 45 - 84 + 139 ^ 82 + 118 - 96 + 47) > (0x46 ^ 0x63 ^ (0x6F ^ 0x4E))) {
                        return;
                    }
                }
                else if (lIIlIllllllllIll(llllllllllllIllIIllIlIlIIIIIllII, llllllllllllIllIIllIlIlIIIIlIlll)) {
                    llllllllllllIllIIllIlIlIIIIIlIll.func_146140_b((boolean)(GuiBeacon.llIllIlIllIllI[8] != 0));
                }
                ++llllllllllllIllIIllIlIlIIIIIllIl;
            }
            if (lIIlIlllllllllIl(llllllllllllIllIIllIlIlIIIIllIII)) {
                final PowerButton llllllllllllIllIIllIlIlIIIIIlIlI = new PowerButton(llllllllllllIllIIllIlIlIIIIlIIII << GuiBeacon.llIllIlIllIllI[11] | llllllllllllIllIIllIlIlIIIIllIII, this.guiLeft + GuiBeacon.llIllIlIllIllI[16] + (llllllllllllIllIIllIlIlIIIIIllll - GuiBeacon.llIllIlIllIllI[8]) * GuiBeacon.llIllIlIllIllI[13] - llllllllllllIllIIllIlIlIIIIIlllI / GuiBeacon.llIllIlIllIllI[9], this.guiTop + GuiBeacon.llIllIlIllIllI[17], llllllllllllIllIIllIlIlIIIIllIII, llllllllllllIllIIllIlIlIIIIlIIII);
                this.buttonList.add(llllllllllllIllIIllIlIlIIIIIlIlI);
                "".length();
                if (lIIlIllllllllIlI(llllllllllllIllIIllIlIlIIIIlIIII, llllllllllllIllIIllIlIlIIIIllIIl)) {
                    llllllllllllIllIIllIlIlIIIIIlIlI.enabled = (GuiBeacon.llIllIlIllIllI[0] != 0);
                    "".length();
                    if ("  ".length() > "  ".length()) {
                        return;
                    }
                }
                else if (lIIlIllllllllIll(llllllllllllIllIIllIlIlIIIIllIII, llllllllllllIllIIllIlIlIIIIlIlll)) {
                    llllllllllllIllIIllIlIlIIIIIlIlI.func_146140_b((boolean)(GuiBeacon.llIllIlIllIllI[8] != 0));
                }
            }
        }
        final ConfirmButton beaconConfirmButton = this.beaconConfirmButton;
        int enabled;
        if (lIIlIllllllllllI(this.tileBeacon.getStackInSlot(GuiBeacon.llIllIlIllIllI[0])) && lIIlIlllllllllIl(llllllllllllIllIIllIlIlIIIIllIII)) {
            enabled = GuiBeacon.llIllIlIllIllI[8];
            "".length();
            if (" ".length() < 0) {
                return;
            }
        }
        else {
            enabled = GuiBeacon.llIllIlIllIllI[0];
        }
        beaconConfirmButton.enabled = (enabled != 0);
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(final int llllllllllllIllIIllIlIIllllIlIII, final int llllllllllllIllIIllIlIIllllIIIll) {
        RenderHelper.disableStandardItemLighting();
        this.drawCenteredString(this.fontRendererObj, I18n.format(GuiBeacon.llIllIIlllIlII[GuiBeacon.llIllIlIllIllI[9]], new Object[GuiBeacon.llIllIlIllIllI[0]]), GuiBeacon.llIllIlIllIllI[19], GuiBeacon.llIllIlIllIllI[20], GuiBeacon.llIllIlIllIllI[21]);
        this.drawCenteredString(this.fontRendererObj, I18n.format(GuiBeacon.llIllIIlllIlII[GuiBeacon.llIllIlIllIllI[15]], new Object[GuiBeacon.llIllIlIllIllI[0]]), GuiBeacon.llIllIlIllIllI[22], GuiBeacon.llIllIlIllIllI[20], GuiBeacon.llIllIlIllIllI[21]);
        final long llllllllllllIllIIllIlIIllllIIIIl = (long)this.buttonList.iterator();
        "".length();
        if ("  ".length() <= 0) {
            return;
        }
        while (!lIIllIIIIIIIIIII(((Iterator)llllllllllllIllIIllIlIIllllIIIIl).hasNext() ? 1 : 0)) {
            final GuiButton llllllllllllIllIIllIlIIllllIIllI = ((Iterator<GuiButton>)llllllllllllIllIIllIlIIllllIIIIl).next();
            if (lIIlIllllllllIII(llllllllllllIllIIllIlIIllllIIllI.isMouseOver() ? 1 : 0)) {
                llllllllllllIllIIllIlIIllllIIllI.drawButtonForegroundLayer(llllllllllllIllIIllIlIIllllIlIII - this.guiLeft, llllllllllllIllIIllIlIIllllIIIll - this.guiTop);
                "".length();
                if ((20 + 163 - 113 + 129 ^ 136 + 142 - 148 + 64) == 0x0) {
                    return;
                }
                break;
            }
        }
        RenderHelper.enableGUIStandardItemLighting();
    }
    
    static {
        lIIlIlllllllIlll();
        lIIlIlllIIllllII();
        logger = LogManager.getLogger();
        beaconGuiTextures = new ResourceLocation(GuiBeacon.llIllIIlllIlII[GuiBeacon.llIllIlIllIllI[0]]);
    }
    
    private static boolean lIIllIIIIIIIIIII(final int llllllllllllIllIIllIlIIllIIlIIlI) {
        return llllllllllllIllIIllIlIIllIIlIIlI == 0;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        final List<GuiButton> buttonList = this.buttonList;
        final ConfirmButton beaconConfirmButton = new ConfirmButton(GuiBeacon.llIllIlIllIllI[3], this.guiLeft + GuiBeacon.llIllIlIllIllI[4], this.guiTop + GuiBeacon.llIllIlIllIllI[5]);
        this.beaconConfirmButton = beaconConfirmButton;
        buttonList.add(beaconConfirmButton);
        "".length();
        this.buttonList.add(new CancelButton(GuiBeacon.llIllIlIllIllI[6], this.guiLeft + GuiBeacon.llIllIlIllIllI[7], this.guiTop + GuiBeacon.llIllIlIllIllI[5]));
        "".length();
        this.buttonsNotDrawn = (GuiBeacon.llIllIlIllIllI[8] != 0);
        this.beaconConfirmButton.enabled = (GuiBeacon.llIllIlIllIllI[0] != 0);
    }
    
    private static boolean lIIlIlllllllllIl(final int llllllllllllIllIIllIlIIllIIIlllI) {
        return llllllllllllIllIIllIlIIllIIIlllI > 0;
    }
    
    @Override
    protected void drawGuiContainerBackgroundLayer(final float llllllllllllIllIIllIlIIlllIlllII, final int llllllllllllIllIIllIlIIlllIllIll, final int llllllllllllIllIIllIlIIlllIllIlI) {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(GuiBeacon.beaconGuiTextures);
        final int llllllllllllIllIIllIlIIlllIllIIl = (this.width - this.xSize) / GuiBeacon.llIllIlIllIllI[9];
        final int llllllllllllIllIIllIlIIlllIllIII = (this.height - this.ySize) / GuiBeacon.llIllIlIllIllI[9];
        this.drawTexturedModalRect(llllllllllllIllIIllIlIIlllIllIIl, llllllllllllIllIIllIlIIlllIllIII, GuiBeacon.llIllIlIllIllI[0], GuiBeacon.llIllIlIllIllI[0], this.xSize, this.ySize);
        this.itemRender.zLevel = 100.0f;
        this.itemRender.renderItemAndEffectIntoGUI(new ItemStack(Items.emerald), llllllllllllIllIIllIlIIlllIllIIl + GuiBeacon.llIllIlIllIllI[23], llllllllllllIllIIllIlIIlllIllIII + GuiBeacon.llIllIlIllIllI[24]);
        this.itemRender.renderItemAndEffectIntoGUI(new ItemStack(Items.diamond), llllllllllllIllIIllIlIIlllIllIIl + GuiBeacon.llIllIlIllIllI[23] + GuiBeacon.llIllIlIllIllI[10], llllllllllllIllIIllIlIIlllIllIII + GuiBeacon.llIllIlIllIllI[24]);
        this.itemRender.renderItemAndEffectIntoGUI(new ItemStack(Items.gold_ingot), llllllllllllIllIIllIlIIlllIllIIl + GuiBeacon.llIllIlIllIllI[23] + GuiBeacon.llIllIlIllIllI[25], llllllllllllIllIIllIlIIlllIllIII + GuiBeacon.llIllIlIllIllI[24]);
        this.itemRender.renderItemAndEffectIntoGUI(new ItemStack(Items.iron_ingot), llllllllllllIllIIllIlIIlllIllIIl + GuiBeacon.llIllIlIllIllI[23] + GuiBeacon.llIllIlIllIllI[26], llllllllllllIllIIllIlIIlllIllIII + GuiBeacon.llIllIlIllIllI[24]);
        this.itemRender.zLevel = 0.0f;
    }
    
    private static void lIIlIlllllllIlll() {
        (llIllIlIllIllI = new int[28])[0] = ((0x3F ^ 0x39) & ~(0x77 ^ 0x71));
        GuiBeacon.llIllIlIllIllI[1] = 191 + 189 - 310 + 137 + (0x48 ^ 0x39) - (0xFFFFA799 & 0x597E) + (137 + 141 - 112 + 24);
        GuiBeacon.llIllIlIllIllI[2] = (0x70 ^ 0x5C) + (127 + 123 - 135 + 43) - (0xFE ^ 0xC6) + (0x31 ^ 0x78);
        GuiBeacon.llIllIlIllIllI[3] = -" ".length();
        GuiBeacon.llIllIlIllIllI[4] = 35 + 101 + 27 + 1;
        GuiBeacon.llIllIlIllIllI[5] = (0x22 ^ 0x49);
        GuiBeacon.llIllIlIllIllI[6] = -"  ".length();
        GuiBeacon.llIllIlIllIllI[7] = (0xAB ^ 0xBF) + (0x66 ^ 0x38) - (0x3A ^ 0x7B) + (135 + 54 - 161 + 113);
        GuiBeacon.llIllIlIllIllI[8] = " ".length();
        GuiBeacon.llIllIlIllIllI[9] = "  ".length();
        GuiBeacon.llIllIlIllIllI[10] = (0x5 ^ 0x13);
        GuiBeacon.llIllIlIllIllI[11] = (0x71 ^ 0x79);
        GuiBeacon.llIllIlIllIllI[12] = (0x30 ^ 0x7C);
        GuiBeacon.llIllIlIllIllI[13] = (0x17 ^ 0x23 ^ (0xB3 ^ 0x9F));
        GuiBeacon.llIllIlIllIllI[14] = (0xFA ^ 0xB5 ^ (0x3D ^ 0x6B));
        GuiBeacon.llIllIlIllIllI[15] = "   ".length();
        GuiBeacon.llIllIlIllIllI[16] = 96 + 17 + 21 + 33;
        GuiBeacon.llIllIlIllIllI[17] = (0x33 ^ 0x60 ^ (0x74 ^ 0x8));
        GuiBeacon.llIllIlIllIllI[18] = 48 + 230 - 63 + 40;
        GuiBeacon.llIllIlIllIllI[19] = (0x37 ^ 0x9);
        GuiBeacon.llIllIlIllIllI[20] = (6 + 0 + 125 + 55 ^ 14 + 168 - 6 + 0);
        GuiBeacon.llIllIlIllIllI[21] = (-(0xFFFFAFFF & 0x5D1F) & (0xFFFFEFFE & 0xE0FDFF));
        GuiBeacon.llIllIlIllIllI[22] = (0xF8 ^ 0xAD) + (0x17 ^ 0x3D) - (0x3B ^ 0x27) + (0x4A ^ 0xC);
        GuiBeacon.llIllIlIllIllI[23] = (0x6 ^ 0x2C);
        GuiBeacon.llIllIlIllIllI[24] = (0xE5 ^ 0x9B ^ (0xAD ^ 0xBE));
        GuiBeacon.llIllIlIllIllI[25] = (0x19 ^ 0x27 ^ (0x41 ^ 0x53));
        GuiBeacon.llIllIlIllIllI[26] = (0x31 ^ 0x73);
        GuiBeacon.llIllIlIllIllI[27] = (0x8F ^ 0x8B);
    }
    
    private static String lIIlIlllIIlllIll(final String llllllllllllIllIIllIlIIlllIIIIll, final String llllllllllllIllIIllIlIIlllIIIIlI) {
        try {
            final SecretKeySpec llllllllllllIllIIllIlIIlllIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllIlIIlllIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIllIlIIlllIIIlll = Cipher.getInstance("Blowfish");
            llllllllllllIllIIllIlIIlllIIIlll.init(GuiBeacon.llIllIlIllIllI[9], llllllllllllIllIIllIlIIlllIIlIII);
            return new String(llllllllllllIllIIllIlIIlllIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllIlIIlllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllIlIIlllIIIllI) {
            llllllllllllIllIIllIlIIlllIIIllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void actionPerformed(final GuiButton llllllllllllIllIIllIlIIlllllIIlI) throws IOException {
        if (lIIlIllllllllIll(llllllllllllIllIIllIlIIlllllIIlI.id, GuiBeacon.llIllIlIllIllI[6])) {
            this.mc.displayGuiScreen(null);
            "".length();
            if ((0xCF ^ 0x89 ^ (0xE2 ^ 0xA0)) == " ".length()) {
                return;
            }
        }
        else if (lIIlIllllllllIll(llllllllllllIllIIllIlIIlllllIIlI.id, GuiBeacon.llIllIlIllIllI[3])) {
            final String llllllllllllIllIIllIlIIllllllIII = GuiBeacon.llIllIIlllIlII[GuiBeacon.llIllIlIllIllI[8]];
            final PacketBuffer llllllllllllIllIIllIlIIlllllIlll = new PacketBuffer(Unpooled.buffer());
            llllllllllllIllIIllIlIIlllllIlll.writeInt(this.tileBeacon.getField(GuiBeacon.llIllIlIllIllI[8]));
            "".length();
            llllllllllllIllIIllIlIIlllllIlll.writeInt(this.tileBeacon.getField(GuiBeacon.llIllIlIllIllI[9]));
            "".length();
            this.mc.getNetHandler().addToSendQueue(new C17PacketCustomPayload(llllllllllllIllIIllIlIIllllllIII, llllllllllllIllIIllIlIIlllllIlll));
            this.mc.displayGuiScreen(null);
            "".length();
            if (-(0xAC ^ 0xA8) > 0) {
                return;
            }
        }
        else if (lIIlIllllllllIII((llllllllllllIllIIllIlIIlllllIIlI instanceof PowerButton) ? 1 : 0)) {
            if (lIIlIllllllllIII(((PowerButton)llllllllllllIllIIllIlIIlllllIIlI).func_146141_c() ? 1 : 0)) {
                return;
            }
            final int llllllllllllIllIIllIlIIlllllIllI = llllllllllllIllIIllIlIIlllllIIlI.id;
            final int llllllllllllIllIIllIlIIlllllIlIl = llllllllllllIllIIllIlIIlllllIllI & GuiBeacon.llIllIlIllIllI[18];
            final int llllllllllllIllIIllIlIIlllllIlII = llllllllllllIllIIllIlIIlllllIllI >> GuiBeacon.llIllIlIllIllI[11];
            if (lIIlIlllllllllll(llllllllllllIllIIllIlIIlllllIlII, GuiBeacon.llIllIlIllIllI[15])) {
                this.tileBeacon.setField(GuiBeacon.llIllIlIllIllI[8], llllllllllllIllIIllIlIIlllllIlIl);
                "".length();
                if ((0x68 ^ 0x30 ^ (0xE7 ^ 0xBB)) == 0x0) {
                    return;
                }
            }
            else {
                this.tileBeacon.setField(GuiBeacon.llIllIlIllIllI[9], llllllllllllIllIIllIlIIlllllIlIl);
            }
            this.buttonList.clear();
            this.initGui();
            this.updateScreen();
        }
    }
    
    static class Button extends GuiButton
    {
        private final /* synthetic */ ResourceLocation field_146145_o;
        private static final /* synthetic */ int[] lIIlIlIIllIlIl;
        private /* synthetic */ boolean field_146142_r;
        private final /* synthetic */ int field_146143_q;
        private static final /* synthetic */ String[] lIIlIlIIllIlII;
        private final /* synthetic */ int field_146144_p;
        
        private static boolean llIlIIIIIIIIIlI(final int lllllllllllllIIllIlIIIllIIIIIlIl) {
            return lllllllllllllIIllIlIIIllIIIIIlIl != 0;
        }
        
        public boolean func_146141_c() {
            return this.field_146142_r;
        }
        
        private static boolean llIlIIIIIIIIlIl(final int lllllllllllllIIllIlIIIllIIIIIIll) {
            return lllllllllllllIIllIlIIIllIIIIIIll == 0;
        }
        
        private static boolean llIlIIIIIIIIIll(final int lllllllllllllIIllIlIIIllIIIIllII, final int lllllllllllllIIllIlIIIllIIIIlIll) {
            return lllllllllllllIIllIlIIIllIIIIllII >= lllllllllllllIIllIlIIIllIIIIlIll;
        }
        
        private static boolean llIlIIIIIIIIlII(final int lllllllllllllIIllIlIIIllIIIIlIII, final int lllllllllllllIIllIlIIIllIIIIIlll) {
            return lllllllllllllIIllIlIIIllIIIIlIII < lllllllllllllIIllIlIIIllIIIIIlll;
        }
        
        private static void llIlIIIIIIIIIIl() {
            (lIIlIlIIllIlIl = new int[7])[0] = (0x9 ^ 0x10 ^ (0x2F ^ 0x20));
            Button.lIIlIlIIllIlIl[1] = ((139 + 44 - 175 + 211 ^ 74 + 73 - 71 + 68) & (0x65 ^ 0x3C ^ (0x77 ^ 0x65) ^ -" ".length()));
            Button.lIIlIlIIllIlIl[2] = " ".length();
            Button.lIIlIlIIllIlIl[3] = 102 + 84 - 147 + 110 + (0x41 ^ 0x1B) - (44 + 25 - 13 + 73) + (0x4 ^ 0x69);
            Button.lIIlIlIIllIlIl[4] = "  ".length();
            Button.lIIlIlIIllIlIl[5] = "   ".length();
            Button.lIIlIlIIllIlIl[6] = (78 + 34 - 26 + 66 ^ 35 + 116 - 136 + 123);
        }
        
        protected Button(final int lllllllllllllIIllIlIIIllIlIIIlll, final int lllllllllllllIIllIlIIIllIlIIIllI, final int lllllllllllllIIllIlIIIllIlIIllII, final ResourceLocation lllllllllllllIIllIlIIIllIlIIIlII, final int lllllllllllllIIllIlIIIllIlIIlIlI, final int lllllllllllllIIllIlIIIllIlIIIIlI) {
            super(lllllllllllllIIllIlIIIllIlIIIlll, lllllllllllllIIllIlIIIllIlIIIllI, lllllllllllllIIllIlIIIllIlIIllII, Button.lIIlIlIIllIlIl[0], Button.lIIlIlIIllIlIl[0], Button.lIIlIlIIllIlII[Button.lIIlIlIIllIlIl[1]]);
            this.field_146145_o = lllllllllllllIIllIlIIIllIlIIIlII;
            this.field_146144_p = lllllllllllllIIllIlIIIllIlIIlIlI;
            this.field_146143_q = lllllllllllllIIllIlIIIllIlIIIIlI;
        }
        
        private static String llIIlllllllllll(String lllllllllllllIIllIlIIIllIIIlIlll, final String lllllllllllllIIllIlIIIllIIIlIllI) {
            lllllllllllllIIllIlIIIllIIIlIlll = new String(Base64.getDecoder().decode(lllllllllllllIIllIlIIIllIIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIllIlIIIllIIIllIlI = new StringBuilder();
            final char[] lllllllllllllIIllIlIIIllIIIllIIl = lllllllllllllIIllIlIIIllIIIlIllI.toCharArray();
            int lllllllllllllIIllIlIIIllIIIllIII = Button.lIIlIlIIllIlIl[1];
            final long lllllllllllllIIllIlIIIllIIIlIIlI = (Object)lllllllllllllIIllIlIIIllIIIlIlll.toCharArray();
            final Exception lllllllllllllIIllIlIIIllIIIlIIIl = (Exception)lllllllllllllIIllIlIIIllIIIlIIlI.length;
            String lllllllllllllIIllIlIIIllIIIlIIII = (String)Button.lIIlIlIIllIlIl[1];
            while (llIlIIIIIIIIlII((int)lllllllllllllIIllIlIIIllIIIlIIII, (int)lllllllllllllIIllIlIIIllIIIlIIIl)) {
                final char lllllllllllllIIllIlIIIllIIIlllIl = lllllllllllllIIllIlIIIllIIIlIIlI[lllllllllllllIIllIlIIIllIIIlIIII];
                lllllllllllllIIllIlIIIllIIIllIlI.append((char)(lllllllllllllIIllIlIIIllIIIlllIl ^ lllllllllllllIIllIlIIIllIIIllIIl[lllllllllllllIIllIlIIIllIIIllIII % lllllllllllllIIllIlIIIllIIIllIIl.length]));
                "".length();
                ++lllllllllllllIIllIlIIIllIIIllIII;
                ++lllllllllllllIIllIlIIIllIIIlIIII;
                "".length();
                if (-" ".length() >= " ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIllIlIIIllIIIllIlI);
        }
        
        @Override
        public void drawButton(final Minecraft lllllllllllllIIllIlIIIllIIlllIlI, final int lllllllllllllIIllIlIIIllIIllIIll, final int lllllllllllllIIllIlIIIllIIllIIlI) {
            if (llIlIIIIIIIIIlI(this.visible ? 1 : 0)) {
                lllllllllllllIIllIlIIIllIIlllIlI.getTextureManager().bindTexture(GuiBeacon.beaconGuiTextures);
                GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
                int hovered;
                if (llIlIIIIIIIIIll(lllllllllllllIIllIlIIIllIIllIIll, this.xPosition) && llIlIIIIIIIIIll(lllllllllllllIIllIlIIIllIIllIIlI, this.yPosition) && llIlIIIIIIIIlII(lllllllllllllIIllIlIIIllIIllIIll, this.xPosition + this.width) && llIlIIIIIIIIlII(lllllllllllllIIllIlIIIllIIllIIlI, this.yPosition + this.height)) {
                    hovered = Button.lIIlIlIIllIlIl[2];
                    "".length();
                    if (((0x3D ^ 0x5A ^ (0x2A ^ 0x6A)) & (0x58 ^ 0x18 ^ (0xC0 ^ 0xA7) ^ -" ".length())) > 0) {
                        return;
                    }
                }
                else {
                    hovered = Button.lIIlIlIIllIlIl[1];
                }
                this.hovered = (hovered != 0);
                final int lllllllllllllIIllIlIIIllIIllIlll = Button.lIIlIlIIllIlIl[3];
                int lllllllllllllIIllIlIIIllIIllIllI = Button.lIIlIlIIllIlIl[1];
                if (llIlIIIIIIIIlIl(this.enabled ? 1 : 0)) {
                    lllllllllllllIIllIlIIIllIIllIllI += this.width * Button.lIIlIlIIllIlIl[4];
                    "".length();
                    if (((0x36 ^ 0x77) & ~(0xEB ^ 0xAA)) >= "  ".length()) {
                        return;
                    }
                }
                else if (llIlIIIIIIIIIlI(this.field_146142_r ? 1 : 0)) {
                    lllllllllllllIIllIlIIIllIIllIllI += this.width * Button.lIIlIlIIllIlIl[2];
                    "".length();
                    if (-" ".length() == ((0x35 ^ 0x6D) & ~(0x4D ^ 0x15))) {
                        return;
                    }
                }
                else if (llIlIIIIIIIIIlI(this.hovered ? 1 : 0)) {
                    lllllllllllllIIllIlIIIllIIllIllI += this.width * Button.lIIlIlIIllIlIl[5];
                }
                this.drawTexturedModalRect(this.xPosition, this.yPosition, lllllllllllllIIllIlIIIllIIllIllI, lllllllllllllIIllIlIIIllIIllIlll, this.width, this.height);
                if (llIlIIIIIIIIlIl(GuiBeacon.beaconGuiTextures.equals(this.field_146145_o) ? 1 : 0)) {
                    lllllllllllllIIllIlIIIllIIlllIlI.getTextureManager().bindTexture(this.field_146145_o);
                }
                this.drawTexturedModalRect(this.xPosition + Button.lIIlIlIIllIlIl[4], this.yPosition + Button.lIIlIlIIllIlIl[4], this.field_146144_p, this.field_146143_q, Button.lIIlIlIIllIlIl[6], Button.lIIlIlIIllIlIl[6]);
            }
        }
        
        static {
            llIlIIIIIIIIIIl();
            llIlIIIIIIIIIII();
        }
        
        public void func_146140_b(final boolean lllllllllllllIIllIlIIIllIIlIlIIl) {
            this.field_146142_r = lllllllllllllIIllIlIIIllIIlIlIIl;
        }
        
        private static void llIlIIIIIIIIIII() {
            (lIIlIlIIllIlII = new String[Button.lIIlIlIIllIlIl[2]])[Button.lIIlIlIIllIlIl[1]] = llIIlllllllllll("", "jODtZ");
        }
    }
    
    class PowerButton extends Button
    {
        private final /* synthetic */ int field_146149_p;
        private final /* synthetic */ int field_146148_q;
        private static final /* synthetic */ String[] lIIIIlIIIlIlIl;
        private static final /* synthetic */ int[] lIIIIlIIIlIlll;
        
        private static boolean lIlllIIIIIlIllI(final int lllllllllllllIlIIllIlIIIIIIIllIl, final int lllllllllllllIlIIllIlIIIIIIIllII) {
            return lllllllllllllIlIIllIlIIIIIIIllIl >= lllllllllllllIlIIllIlIIIIIIIllII;
        }
        
        private static boolean lIlllIIIIIlIlll(final int lllllllllllllIlIIllIlIIIIIIIlIIl, final int lllllllllllllIlIIllIlIIIIIIIlIII) {
            return lllllllllllllIlIIllIlIIIIIIIlIIl != lllllllllllllIlIIllIlIIIIIIIlIII;
        }
        
        @Override
        public void drawButtonForegroundLayer(final int lllllllllllllIlIIllIlIIIIIIlllll, final int lllllllllllllIlIIllIlIIIIIIllllI) {
            String lllllllllllllIlIIllIlIIIIIlIIIIl = I18n.format(Potion.potionTypes[this.field_146149_p].getName(), new Object[PowerButton.lIIIIlIIIlIlll[0]]);
            if (lIlllIIIIIlIllI(this.field_146148_q, PowerButton.lIIIIlIIIlIlll[4]) && lIlllIIIIIlIlll(this.field_146149_p, Potion.regeneration.id)) {
                lllllllllllllIlIIllIlIIIIIlIIIIl = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIIllIlIIIIIlIIIIl)).append(PowerButton.lIIIIlIIIlIlIl[PowerButton.lIIIIlIIIlIlll[0]]));
            }
            GuiScreen.this.drawCreativeTabHoveringText(lllllllllllllIlIIllIlIIIIIlIIIIl, lllllllllllllIlIIllIlIIIIIIlllll, lllllllllllllIlIIllIlIIIIIIllllI);
        }
        
        static {
            lIlllIIIIIlIlIl();
            lIlllIIIIIlIlII();
        }
        
        private static String lIlllIIIIIlIIIl(final String lllllllllllllIlIIllIlIIIIIIlIIll, final String lllllllllllllIlIIllIlIIIIIIlIlII) {
            try {
                final SecretKeySpec lllllllllllllIlIIllIlIIIIIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIlIIIIIIlIlII.getBytes(StandardCharsets.UTF_8)), PowerButton.lIIIIlIIIlIlll[1]), "DES");
                final Cipher lllllllllllllIlIIllIlIIIIIIlIlll = Cipher.getInstance("DES");
                lllllllllllllIlIIllIlIIIIIIlIlll.init(PowerButton.lIIIIlIIIlIlll[6], lllllllllllllIlIIllIlIIIIIIllIII);
                return new String(lllllllllllllIlIIllIlIIIIIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIlIIIIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIllIlIIIIIIlIllI) {
                lllllllllllllIlIIllIlIIIIIIlIllI.printStackTrace();
                return null;
            }
        }
        
        private static void lIlllIIIIIlIlIl() {
            (lIIIIlIIIlIlll = new int[7])[0] = ((113 + 59 - 44 + 51 ^ 132 + 118 - 112 + 25) & (0x1 ^ 0x59 ^ (0xFA ^ 0xB2) ^ -" ".length()));
            PowerButton.lIIIIlIIIlIlll[1] = (0x6 ^ 0xA ^ (0x97 ^ 0x93));
            PowerButton.lIIIIlIIIlIlll[2] = (0x4B ^ 0x59);
            PowerButton.lIIIIlIIIlIlll[3] = 142 + 15 - 91 + 90 + (63 + 1 + 35 + 66) - (88 + 90 + 57 + 2) + (0x3E ^ 0x4C);
            PowerButton.lIIIIlIIIlIlll[4] = "   ".length();
            PowerButton.lIIIIlIIIlIlll[5] = " ".length();
            PowerButton.lIIIIlIIIlIlll[6] = "  ".length();
        }
        
        public PowerButton(final int lllllllllllllIlIIllIlIIIIIllIlII, final int lllllllllllllIlIIllIlIIIIIlIllII, final int lllllllllllllIlIIllIlIIIIIlIlIll, final int lllllllllllllIlIIllIlIIIIIlIlIlI, final int lllllllllllllIlIIllIlIIIIIllIIII) {
            super(lllllllllllllIlIIllIlIIIIIllIlII, lllllllllllllIlIIllIlIIIIIlIllII, lllllllllllllIlIIllIlIIIIIlIlIll, GuiContainer.inventoryBackground, PowerButton.lIIIIlIIIlIlll[0] + Potion.potionTypes[lllllllllllllIlIIllIlIIIIIlIlIlI].getStatusIconIndex() % PowerButton.lIIIIlIIIlIlll[1] * PowerButton.lIIIIlIIIlIlll[2], PowerButton.lIIIIlIIIlIlll[3] + Potion.potionTypes[lllllllllllllIlIIllIlIIIIIlIlIlI].getStatusIconIndex() / PowerButton.lIIIIlIIIlIlll[1] * PowerButton.lIIIIlIIIlIlll[2]);
            this.field_146149_p = lllllllllllllIlIIllIlIIIIIlIlIlI;
            this.field_146148_q = lllllllllllllIlIIllIlIIIIIllIIII;
        }
        
        private static void lIlllIIIIIlIlII() {
            (lIIIIlIIIlIlIl = new String[PowerButton.lIIIIlIIIlIlll[5]])[PowerButton.lIIIIlIIIlIlll[0]] = lIlllIIIIIlIIIl("2G893c5qIWo=", "xJuUk");
        }
    }
    
    class CancelButton extends Button
    {
        private static final /* synthetic */ int[] llIIIIIlIIlIII;
        private static final /* synthetic */ String[] llIIIIIlIIIllI;
        
        static {
            lIIIIlllIIlIlllI();
            lIIIIlllIIlIlIll();
        }
        
        @Override
        public void drawButtonForegroundLayer(final int llllllllllllIlllIllllIlIIIIlllII, final int llllllllllllIlllIllllIlIIIIllllI) {
            GuiScreen.this.drawCreativeTabHoveringText(I18n.format(CancelButton.llIIIIIlIIIllI[CancelButton.llIIIIIlIIlIII[2]], new Object[CancelButton.llIIIIIlIIlIII[2]]), llllllllllllIlllIllllIlIIIIlllII, llllllllllllIlllIllllIlIIIIllllI);
        }
        
        private static boolean lIIIIlllIIlIllll(final int llllllllllllIlllIllllIlIIIIIIIII, final int llllllllllllIlllIllllIIlllllllll) {
            return llllllllllllIlllIllllIlIIIIIIIII < llllllllllllIlllIllllIIlllllllll;
        }
        
        private static String lIIIIlllIIlIlIlI(String llllllllllllIlllIllllIlIIIIIlIll, final String llllllllllllIlllIllllIlIIIIIlIlI) {
            llllllllllllIlllIllllIlIIIIIlIll = new String(Base64.getDecoder().decode(llllllllllllIlllIllllIlIIIIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlllIllllIlIIIIIlllI = new StringBuilder();
            final char[] llllllllllllIlllIllllIlIIIIIllIl = llllllllllllIlllIllllIlIIIIIlIlI.toCharArray();
            int llllllllllllIlllIllllIlIIIIIllII = CancelButton.llIIIIIlIIlIII[2];
            final int llllllllllllIlllIllllIlIIIIIIllI = (Object)llllllllllllIlllIllllIlIIIIIlIll.toCharArray();
            final float llllllllllllIlllIllllIlIIIIIIlIl = llllllllllllIlllIllllIlIIIIIIllI.length;
            int llllllllllllIlllIllllIlIIIIIIlII = CancelButton.llIIIIIlIIlIII[2];
            while (lIIIIlllIIlIllll(llllllllllllIlllIllllIlIIIIIIlII, (int)llllllllllllIlllIllllIlIIIIIIlIl)) {
                final char llllllllllllIlllIllllIlIIIIlIIIl = llllllllllllIlllIllllIlIIIIIIllI[llllllllllllIlllIllllIlIIIIIIlII];
                llllllllllllIlllIllllIlIIIIIlllI.append((char)(llllllllllllIlllIllllIlIIIIlIIIl ^ llllllllllllIlllIllllIlIIIIIllIl[llllllllllllIlllIllllIlIIIIIllII % llllllllllllIlllIllllIlIIIIIllIl.length]));
                "".length();
                ++llllllllllllIlllIllllIlIIIIIllII;
                ++llllllllllllIlllIllllIlIIIIIIlII;
                "".length();
                if ((0x11 ^ 0x65 ^ (0xE0 ^ 0x90)) == 0x0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlllIllllIlIIIIIlllI);
        }
        
        private static void lIIIIlllIIlIlIll() {
            (llIIIIIlIIIllI = new String[CancelButton.llIIIIIlIIlIII[3]])[CancelButton.llIIIIIlIIlIII[2]] = lIIIIlllIIlIlIlI("MiEbdxo0OhE8FQ==", "UTrYy");
        }
        
        private static void lIIIIlllIIlIlllI() {
            (llIIIIIlIIlIII = new int[4])[0] = (0x55 ^ 0x73 ^ (0xC6 ^ 0x90));
            CancelButton.llIIIIIlIIlIII[1] = (0x45 ^ 0x2C) + (0x4A ^ 0x14) - (90 + 57 - 139 + 173) + (114 + 156 - 69 + 1);
            CancelButton.llIIIIIlIIlIII[2] = ((107 + 71 - 145 + 125 ^ 59 + 164 - 160 + 120) & (144 + 68 - 48 + 16 ^ 9 + 80 - 10 + 78 ^ -" ".length()));
            CancelButton.llIIIIIlIIlIII[3] = " ".length();
        }
        
        public CancelButton(final int llllllllllllIlllIllllIlIIIlIlIll, final int llllllllllllIlllIllllIlIIIlIIlIl, final int llllllllllllIlllIllllIlIIIlIlIIl) {
            super(llllllllllllIlllIllllIlIIIlIlIll, llllllllllllIlllIllllIlIIIlIIlIl, llllllllllllIlllIllllIlIIIlIlIIl, GuiBeacon.beaconGuiTextures, CancelButton.llIIIIIlIIlIII[0], CancelButton.llIIIIIlIIlIII[1]);
        }
    }
    
    class ConfirmButton extends Button
    {
        private static final /* synthetic */ String[] lIlIlllIlIIllI;
        private static final /* synthetic */ int[] lIlIlllIlIIlll;
        
        public ConfirmButton(final int lllllllllllllIIIIlIllIIIlIllIIII, final int lllllllllllllIIIIlIllIIIlIlIllll, final int lllllllllllllIIIIlIllIIIlIlIlIIl) {
            super(lllllllllllllIIIIlIllIIIlIllIIII, lllllllllllllIIIIlIllIIIlIlIllll, lllllllllllllIIIIlIllIIIlIlIlIIl, GuiBeacon.beaconGuiTextures, ConfirmButton.lIlIlllIlIIlll[0], ConfirmButton.lIlIlllIlIIlll[1]);
        }
        
        private static void llllIIllllIIlII() {
            (lIlIlllIlIIllI = new String[ConfirmButton.lIlIlllIlIIlll[3]])[ConfirmButton.lIlIlllIlIIlll[2]] = llllIIllllIIIll("Z0HwJE3s0sBnkEd4eX3uGQ==", "dloHN");
        }
        
        static {
            llllIIllllIIllI();
            llllIIllllIIlII();
        }
        
        @Override
        public void drawButtonForegroundLayer(final int lllllllllllllIIIIlIllIIIlIlIIlII, final int lllllllllllllIIIIlIllIIIlIlIIIII) {
            GuiScreen.this.drawCreativeTabHoveringText(I18n.format(ConfirmButton.lIlIlllIlIIllI[ConfirmButton.lIlIlllIlIIlll[2]], new Object[ConfirmButton.lIlIlllIlIIlll[2]]), lllllllllllllIIIIlIllIIIlIlIIlII, lllllllllllllIIIIlIllIIIlIlIIIII);
        }
        
        private static void llllIIllllIIllI() {
            (lIlIlllIlIIlll = new int[6])[0] = (0xC6 ^ 0x9C);
            ConfirmButton.lIlIlllIlIIlll[1] = 124 + 81 - 94 + 97 + (0x21 ^ 0x4E) - (205 + 76 - 75 + 13) + (0x77 ^ 0xF);
            ConfirmButton.lIlIlllIlIIlll[2] = ((0xF7 ^ 0xC5) & ~(0x87 ^ 0xB5));
            ConfirmButton.lIlIlllIlIIlll[3] = " ".length();
            ConfirmButton.lIlIlllIlIIlll[4] = (0x9F ^ 0xA0 ^ (0x5B ^ 0x6C));
            ConfirmButton.lIlIlllIlIIlll[5] = "  ".length();
        }
        
        private static String llllIIllllIIIll(final String lllllllllllllIIIIlIllIIIlIIllIII, final String lllllllllllllIIIIlIllIIIlIIlIlIl) {
            try {
                final SecretKeySpec lllllllllllllIIIIlIllIIIlIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIllIIIlIIlIlIl.getBytes(StandardCharsets.UTF_8)), ConfirmButton.lIlIlllIlIIlll[4]), "DES");
                final Cipher lllllllllllllIIIIlIllIIIlIIllIlI = Cipher.getInstance("DES");
                lllllllllllllIIIIlIllIIIlIIllIlI.init(ConfirmButton.lIlIlllIlIIlll[5], lllllllllllllIIIIlIllIIIlIIllIll);
                return new String(lllllllllllllIIIIlIllIIIlIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIllIIIlIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIIlIllIIIlIIllIIl) {
                lllllllllllllIIIIlIllIIIlIIllIIl.printStackTrace();
                return null;
            }
        }
    }
}
