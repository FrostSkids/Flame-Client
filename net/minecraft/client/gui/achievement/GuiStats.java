// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui.achievement;

import java.util.Iterator;
import net.minecraft.entity.EntityList;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.util.ResourceLocation;
import java.util.Collections;
import org.lwjgl.input.Mouse;
import java.util.List;
import java.util.Comparator;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatCrafting;
import net.minecraft.stats.StatList;
import com.google.common.collect.Lists;
import net.minecraft.item.ItemStack;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.item.Item;
import net.minecraft.client.gui.GuiButton;
import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C16PacketClientStatus;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.gui.GuiSlot;
import net.minecraft.stats.StatFileWriter;
import net.minecraft.client.gui.IProgressMeter;
import net.minecraft.client.gui.GuiScreen;

public class GuiStats extends GuiScreen implements IProgressMeter
{
    private static final /* synthetic */ String[] lllIIIlIIIllll;
    protected /* synthetic */ String screenTitle;
    private /* synthetic */ boolean doesGuiPauseGame;
    private static final /* synthetic */ int[] lllIIIlIIlllII;
    private /* synthetic */ StatFileWriter field_146546_t;
    protected /* synthetic */ GuiScreen parentScreen;
    private /* synthetic */ StatsMobsList mobStats;
    private /* synthetic */ StatsItem itemStats;
    private /* synthetic */ StatsGeneral generalStats;
    private /* synthetic */ StatsBlock blockStats;
    private /* synthetic */ GuiSlot displaySlot;
    
    private static void lIIlllIlIlIIIlll() {
        (lllIIIlIIlllII = new int[17])[0] = ((0x62 ^ 0x40 ^ (0x13 ^ 0x61)) & (0x41 ^ 0x18 ^ (0x7A ^ 0x73) ^ -" ".length()));
        GuiStats.lllIIIlIIlllII[1] = " ".length();
        GuiStats.lllIIIlIIlllII[2] = "  ".length();
        GuiStats.lllIIIlIIlllII[3] = (97 + 108 - 126 + 97 ^ 5 + 135 - 17 + 57);
        GuiStats.lllIIIlIIlllII[4] = (0x74 ^ 0x68);
        GuiStats.lllIIIlIIlllII[5] = (0x5C ^ 0x4B) + (0x89 ^ 0xC3) - (0xF5 ^ 0xBF) + (7 + 124 - 49 + 45);
        GuiStats.lllIIIlIIlllII[6] = (18 + 3 + 9 + 103 ^ 85 + 50 - 62 + 72);
        GuiStats.lllIIIlIIlllII[7] = 99 + 23 + 35 + 3;
        GuiStats.lllIIIlIIlllII[8] = (0x35 ^ 0x6C ^ (0xD0 ^ 0xBD));
        GuiStats.lllIIIlIIlllII[9] = (0x34 ^ 0x6 ^ (0xCA ^ 0xA8));
        GuiStats.lllIIIlIIlllII[10] = "   ".length();
        GuiStats.lllIIIlIIlllII[11] = (136 + 135 - 242 + 129 ^ 67 + 45 - 28 + 71);
        GuiStats.lllIIIlIIlllII[12] = (0xF ^ 0x9);
        GuiStats.lllIIIlIIlllII[13] = (163 + 56 - 126 + 71 ^ 129 + 39 - 48 + 43);
        GuiStats.lllIIIlIIlllII[14] = (-1 & 0xFFFFFF);
        GuiStats.lllIIIlIIlllII[15] = (0x1C ^ 0xE);
        GuiStats.lllIIIlIIlllII[16] = (99 + 32 - 47 + 80 ^ 113 + 95 - 149 + 113);
    }
    
    @Override
    public boolean doesGuiPauseGame() {
        int n;
        if (lIIlllIlIlIIlIlI(this.doesGuiPauseGame ? 1 : 0)) {
            n = GuiStats.lllIIIlIIlllII[0];
            "".length();
            if (null != null) {
                return ((141 + 87 - 148 + 66 ^ 18 + 14 + 48 + 84) & (83 + 28 - 69 + 98 ^ 132 + 19 + 31 + 4 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = GuiStats.lllIIIlIIlllII[1];
        }
        return n != 0;
    }
    
    private static String lIIlllIlIIllIIll(final String llllllllllllIllIIIIIlIllIIllIIIl, final String llllllllllllIllIIIIIlIllIIllIIlI) {
        try {
            final SecretKeySpec llllllllllllIllIIIIIlIllIIllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIlIllIIllIIlI.getBytes(StandardCharsets.UTF_8)), GuiStats.lllIIIlIIlllII[16]), "DES");
            final Cipher llllllllllllIllIIIIIlIllIIllIlIl = Cipher.getInstance("DES");
            llllllllllllIllIIIIIlIllIIllIlIl.init(GuiStats.lllIIIlIIlllII[2], llllllllllllIllIIIIIlIllIIllIllI);
            return new String(llllllllllllIllIIIIIlIllIIllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIlIllIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIIlIllIIllIlII) {
            llllllllllllIllIIIIIlIllIIllIlII.printStackTrace();
            return null;
        }
    }
    
    private void drawSprite(final int llllllllllllIllIIIIIlIlllIIllIII, final int llllllllllllIllIIIIIlIlllIIIllII, final int llllllllllllIllIIIIIlIlllIIlIllI, final int llllllllllllIllIIIIIlIlllIIlIlIl) {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(GuiStats.statIcons);
        final float llllllllllllIllIIIIIlIlllIIlIlII = 0.0078125f;
        final float llllllllllllIllIIIIIlIlllIIlIIll = 0.0078125f;
        final int llllllllllllIllIIIIIlIlllIIlIIlI = GuiStats.lllIIIlIIlllII[15];
        final int llllllllllllIllIIIIIlIlllIIlIIIl = GuiStats.lllIIIlIIlllII[15];
        final Tessellator llllllllllllIllIIIIIlIlllIIlIIII = Tessellator.getInstance();
        final WorldRenderer llllllllllllIllIIIIIlIlllIIIllll = llllllllllllIllIIIIIlIlllIIlIIII.getWorldRenderer();
        llllllllllllIllIIIIIlIlllIIIllll.begin(GuiStats.lllIIIlIIlllII[13], DefaultVertexFormats.POSITION_TEX);
        llllllllllllIllIIIIIlIlllIIIllll.pos(llllllllllllIllIIIIIlIlllIIllIII + GuiStats.lllIIIlIIlllII[0], llllllllllllIllIIIIIlIlllIIIllII + GuiStats.lllIIIlIIlllII[15], this.zLevel).tex((llllllllllllIllIIIIIlIlllIIlIllI + GuiStats.lllIIIlIIlllII[0]) * 0.0078125f, (llllllllllllIllIIIIIlIlllIIlIlIl + GuiStats.lllIIIlIIlllII[15]) * 0.0078125f).endVertex();
        llllllllllllIllIIIIIlIlllIIIllll.pos(llllllllllllIllIIIIIlIlllIIllIII + GuiStats.lllIIIlIIlllII[15], llllllllllllIllIIIIIlIlllIIIllII + GuiStats.lllIIIlIIlllII[15], this.zLevel).tex((llllllllllllIllIIIIIlIlllIIlIllI + GuiStats.lllIIIlIIlllII[15]) * 0.0078125f, (llllllllllllIllIIIIIlIlllIIlIlIl + GuiStats.lllIIIlIIlllII[15]) * 0.0078125f).endVertex();
        llllllllllllIllIIIIIlIlllIIIllll.pos(llllllllllllIllIIIIIlIlllIIllIII + GuiStats.lllIIIlIIlllII[15], llllllllllllIllIIIIIlIlllIIIllII + GuiStats.lllIIIlIIlllII[0], this.zLevel).tex((llllllllllllIllIIIIIlIlllIIlIllI + GuiStats.lllIIIlIIlllII[15]) * 0.0078125f, (llllllllllllIllIIIIIlIlllIIlIlIl + GuiStats.lllIIIlIIlllII[0]) * 0.0078125f).endVertex();
        llllllllllllIllIIIIIlIlllIIIllll.pos(llllllllllllIllIIIIIlIlllIIllIII + GuiStats.lllIIIlIIlllII[0], llllllllllllIllIIIIIlIlllIIIllII + GuiStats.lllIIIlIIlllII[0], this.zLevel).tex((llllllllllllIllIIIIIlIlllIIlIllI + GuiStats.lllIIIlIIlllII[0]) * 0.0078125f, (llllllllllllIllIIIIIlIlllIIlIlIl + GuiStats.lllIIIlIIlllII[0]) * 0.0078125f).endVertex();
        llllllllllllIllIIIIIlIlllIIlIIII.draw();
    }
    
    private static String lIIlllIlIIllIlII(final String llllllllllllIllIIIIIlIllIIlllllI, final String llllllllllllIllIIIIIlIllIIllllll) {
        try {
            final SecretKeySpec llllllllllllIllIIIIIlIllIlIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIlIllIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIIIlIllIlIIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIIIlIllIlIIIIlI.init(GuiStats.lllIIIlIIlllII[2], llllllllllllIllIIIIIlIllIlIIIIll);
            return new String(llllllllllllIllIIIIIlIllIlIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIlIllIIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIIlIllIlIIIIIl) {
            llllllllllllIllIIIIIlIllIlIIIIIl.printStackTrace();
            return null;
        }
    }
    
    public GuiStats(final GuiScreen llllllllllllIllIIIIIlIlllllIlIII, final StatFileWriter llllllllllllIllIIIIIlIlllllIlIlI) {
        this.screenTitle = GuiStats.lllIIIlIIIllll[GuiStats.lllIIIlIIlllII[0]];
        this.doesGuiPauseGame = (GuiStats.lllIIIlIIlllII[1] != 0);
        this.parentScreen = llllllllllllIllIIIIIlIlllllIlIII;
        this.field_146546_t = llllllllllllIllIIIIIlIlllllIlIlI;
    }
    
    public void func_175366_f() {
        this.generalStats = new StatsGeneral(this.mc);
        this.generalStats.registerScrollButtons(GuiStats.lllIIIlIIlllII[1], GuiStats.lllIIIlIIlllII[1]);
        this.itemStats = new StatsItem(this.mc);
        this.itemStats.registerScrollButtons(GuiStats.lllIIIlIIlllII[1], GuiStats.lllIIIlIIlllII[1]);
        this.blockStats = new StatsBlock(this.mc);
        this.blockStats.registerScrollButtons(GuiStats.lllIIIlIIlllII[1], GuiStats.lllIIIlIIlllII[1]);
        this.mobStats = new StatsMobsList(this.mc);
        this.mobStats.registerScrollButtons(GuiStats.lllIIIlIIlllII[1], GuiStats.lllIIIlIIlllII[1]);
    }
    
    private static boolean lIIlllIlIlIIlIll(final int llllllllllllIllIIIIIlIllIIlIlIll, final int llllllllllllIllIIIIIlIllIIlIlIlI) {
        return llllllllllllIllIIIIIlIllIIlIlIll == llllllllllllIllIIIIIlIllIIlIlIlI;
    }
    
    private static void lIIlllIlIlIIIlII() {
        (lllIIIlIIIllll = new String[GuiStats.lllIIIlIIlllII[16]])[GuiStats.lllIIIlIIlllII[0]] = lIIlllIlIIllIIll("7viIZTwibJsgNmrDZUmZKg==", "AThWN");
        GuiStats.lllIIIlIIIllll[GuiStats.lllIIIlIIlllII[1]] = lIIlllIlIIllIlII("t2843V5UIgq3D+w5dbVLNA==", "TwXrd");
        GuiStats.lllIIIlIIIllll[GuiStats.lllIIIlIIlllII[2]] = lIIlllIlIIllIIll("uHLYyeyS05s67jQnW0Hawg==", "KVrnk");
        GuiStats.lllIIIlIIIllll[GuiStats.lllIIIlIIlllII[10]] = lIIlllIlIIlllIlI("GTUbMGMNJBQhPwstODE5Hi4U", "jAzDM");
        GuiStats.lllIIIlIIIllll[GuiStats.lllIIIlIIlllII[3]] = lIIlllIlIIllIlII("vlwlaJ1lRi19E8zsokfHLgqOjP7mISFE", "tWDoW");
        GuiStats.lllIIIlIIIllll[GuiStats.lllIIIlIIlllII[11]] = lIIlllIlIIllIIll("UFXAv3jDpwJTv5h6M98Nn+IgZXgtr+cw", "nOICb");
        GuiStats.lllIIIlIIIllll[GuiStats.lllIIIlIIlllII[12]] = lIIlllIlIIllIIll("8akA5Fb4ahm9ly6tXkhx9w==", "MqrMY");
        GuiStats.lllIIIlIIIllll[GuiStats.lllIIIlIIlllII[13]] = lIIlllIlIIllIIll("9gKDd/OLbQqxSxDiS4sdlv29mGhHg+99KsEAkwcHvOM=", "RDxmb");
    }
    
    @Override
    public void drawScreen(final int llllllllllllIllIIIIIlIllllIIIIlI, final int llllllllllllIllIIIIIlIllllIIIIIl, final float llllllllllllIllIIIIIlIllllIIIIII) {
        if (lIIlllIlIlIIlIlI(this.doesGuiPauseGame ? 1 : 0)) {
            this.drawDefaultBackground();
            this.drawCenteredString(this.fontRendererObj, I18n.format(GuiStats.lllIIIlIIIllll[GuiStats.lllIIIlIIlllII[13]], new Object[GuiStats.lllIIIlIIlllII[0]]), this.width / GuiStats.lllIIIlIIlllII[2], this.height / GuiStats.lllIIIlIIlllII[2], GuiStats.lllIIIlIIlllII[14]);
            this.drawCenteredString(this.fontRendererObj, GuiStats.lanSearchStates[(int)(Minecraft.getSystemTime() / 150L % GuiStats.lanSearchStates.length)], this.width / GuiStats.lllIIIlIIlllII[2], this.height / GuiStats.lllIIIlIIlllII[2] + this.fontRendererObj.FONT_HEIGHT * GuiStats.lllIIIlIIlllII[2], GuiStats.lllIIIlIIlllII[14]);
            "".length();
            if (((0x4E ^ 0x6C) & ~(0x69 ^ 0x4B)) > ((0x54 ^ 0x11) & ~(0x4A ^ 0xF))) {
                return;
            }
        }
        else {
            this.displaySlot.drawScreen(llllllllllllIllIIIIIlIllllIIIIlI, llllllllllllIllIIIIIlIllllIIIIIl, llllllllllllIllIIIIIlIllllIIIIII);
            this.drawCenteredString(this.fontRendererObj, this.screenTitle, this.width / GuiStats.lllIIIlIIlllII[2], GuiStats.lllIIIlIIlllII[6], GuiStats.lllIIIlIIlllII[14]);
            super.drawScreen(llllllllllllIllIIIIIlIllllIIIIlI, llllllllllllIllIIIIIlIllllIIIIIl, llllllllllllIllIIIIIlIllllIIIIII);
        }
    }
    
    @Override
    public void initGui() {
        this.screenTitle = I18n.format(GuiStats.lllIIIlIIIllll[GuiStats.lllIIIlIIlllII[1]], new Object[GuiStats.lllIIIlIIlllII[0]]);
        this.doesGuiPauseGame = (GuiStats.lllIIIlIIlllII[1] != 0);
        this.mc.getNetHandler().addToSendQueue(new C16PacketClientStatus(C16PacketClientStatus.EnumState.REQUEST_STATS));
    }
    
    private static boolean lIIlllIlIlIIllII(final int llllllllllllIllIIIIIlIllIIlIIlll, final int llllllllllllIllIIIIIlIllIIlIIllI) {
        return llllllllllllIllIIIIIlIllIIlIIlll < llllllllllllIllIIIIIlIllIIlIIllI;
    }
    
    @Override
    public void handleMouseInput() throws IOException {
        super.handleMouseInput();
        if (lIIlllIlIlIIlIII(this.displaySlot)) {
            this.displaySlot.handleMouseInput();
        }
    }
    
    @Override
    protected void actionPerformed(final GuiButton llllllllllllIllIIIIIlIllllIIllII) throws IOException {
        if (lIIlllIlIlIIlIlI(llllllllllllIllIIIIIlIllllIIllII.enabled ? 1 : 0)) {
            if (lIIlllIlIlIIlIIl(llllllllllllIllIIIIIlIllllIIllII.id)) {
                this.mc.displayGuiScreen(this.parentScreen);
                "".length();
                if ((119 + 63 - 50 + 18 ^ 25 + 47 - 47 + 121) <= "  ".length()) {
                    return;
                }
            }
            else if (lIIlllIlIlIIlIll(llllllllllllIllIIIIIlIllllIIllII.id, GuiStats.lllIIIlIIlllII[1])) {
                this.displaySlot = this.generalStats;
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (lIIlllIlIlIIlIll(llllllllllllIllIIIIIlIllllIIllII.id, GuiStats.lllIIIlIIlllII[10])) {
                this.displaySlot = this.itemStats;
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
            }
            else if (lIIlllIlIlIIlIll(llllllllllllIllIIIIIlIllllIIllII.id, GuiStats.lllIIIlIIlllII[2])) {
                this.displaySlot = this.blockStats;
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (lIIlllIlIlIIlIll(llllllllllllIllIIIIIlIllllIIllII.id, GuiStats.lllIIIlIIlllII[3])) {
                this.displaySlot = this.mobStats;
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.displaySlot.actionPerformed(llllllllllllIllIIIIIlIllllIIllII);
            }
        }
    }
    
    private void drawStatsScreen(final int llllllllllllIllIIIIIlIlllIllIIII, final int llllllllllllIllIIIIIlIlllIlIllll, final Item llllllllllllIllIIIIIlIlllIlIlllI) {
        this.drawButtonBackground(llllllllllllIllIIIIIlIlllIllIIII + GuiStats.lllIIIlIIlllII[1], llllllllllllIllIIIIIlIlllIlIllll + GuiStats.lllIIIlIIlllII[1]);
        GlStateManager.enableRescaleNormal();
        RenderHelper.enableGUIStandardItemLighting();
        this.itemRender.renderItemIntoGUI(new ItemStack(llllllllllllIllIIIIIlIlllIlIlllI, GuiStats.lllIIIlIIlllII[1], GuiStats.lllIIIlIIlllII[0]), llllllllllllIllIIIIIlIlllIllIIII + GuiStats.lllIIIlIIlllII[2], llllllllllllIllIIIIIlIlllIlIllll + GuiStats.lllIIIlIIlllII[2]);
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableRescaleNormal();
    }
    
    static {
        lIIlllIlIlIIIlll();
        lIIlllIlIlIIIlII();
    }
    
    private static boolean lIIlllIlIlIIlIII(final Object llllllllllllIllIIIIIlIllIIlIIlII) {
        return llllllllllllIllIIIIIlIllIIlIIlII != null;
    }
    
    public void createButtons() {
        this.buttonList.add(new GuiButton(GuiStats.lllIIIlIIlllII[0], this.width / GuiStats.lllIIIlIIlllII[2] + GuiStats.lllIIIlIIlllII[3], this.height - GuiStats.lllIIIlIIlllII[4], GuiStats.lllIIIlIIlllII[5], GuiStats.lllIIIlIIlllII[6], I18n.format(GuiStats.lllIIIlIIIllll[GuiStats.lllIIIlIIlllII[2]], new Object[GuiStats.lllIIIlIIlllII[0]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiStats.lllIIIlIIlllII[1], this.width / GuiStats.lllIIIlIIlllII[2] - GuiStats.lllIIIlIIlllII[7], this.height - GuiStats.lllIIIlIIlllII[8], GuiStats.lllIIIlIIlllII[9], GuiStats.lllIIIlIIlllII[6], I18n.format(GuiStats.lllIIIlIIIllll[GuiStats.lllIIIlIIlllII[10]], new Object[GuiStats.lllIIIlIIlllII[0]])));
        "".length();
        final GuiButton llllllllllllIllIIIIIlIllllIllIII;
        this.buttonList.add(llllllllllllIllIIIIIlIllllIllIII = new GuiButton(GuiStats.lllIIIlIIlllII[2], this.width / GuiStats.lllIIIlIIlllII[2] - GuiStats.lllIIIlIIlllII[9], this.height - GuiStats.lllIIIlIIlllII[8], GuiStats.lllIIIlIIlllII[9], GuiStats.lllIIIlIIlllII[6], I18n.format(GuiStats.lllIIIlIIIllll[GuiStats.lllIIIlIIlllII[3]], new Object[GuiStats.lllIIIlIIlllII[0]])));
        "".length();
        final GuiButton llllllllllllIllIIIIIlIllllIlIlll;
        this.buttonList.add(llllllllllllIllIIIIIlIllllIlIlll = new GuiButton(GuiStats.lllIIIlIIlllII[10], this.width / GuiStats.lllIIIlIIlllII[2], this.height - GuiStats.lllIIIlIIlllII[8], GuiStats.lllIIIlIIlllII[9], GuiStats.lllIIIlIIlllII[6], I18n.format(GuiStats.lllIIIlIIIllll[GuiStats.lllIIIlIIlllII[11]], new Object[GuiStats.lllIIIlIIlllII[0]])));
        "".length();
        final GuiButton llllllllllllIllIIIIIlIllllIlIllI;
        this.buttonList.add(llllllllllllIllIIIIIlIllllIlIllI = new GuiButton(GuiStats.lllIIIlIIlllII[3], this.width / GuiStats.lllIIIlIIlllII[2] + GuiStats.lllIIIlIIlllII[9], this.height - GuiStats.lllIIIlIIlllII[8], GuiStats.lllIIIlIIlllII[9], GuiStats.lllIIIlIIlllII[6], I18n.format(GuiStats.lllIIIlIIIllll[GuiStats.lllIIIlIIlllII[12]], new Object[GuiStats.lllIIIlIIlllII[0]])));
        "".length();
        if (lIIlllIlIlIIlIIl(this.blockStats.getSize())) {
            llllllllllllIllIIIIIlIllllIllIII.enabled = (GuiStats.lllIIIlIIlllII[0] != 0);
        }
        if (lIIlllIlIlIIlIIl(this.itemStats.getSize())) {
            llllllllllllIllIIIIIlIllllIlIlll.enabled = (GuiStats.lllIIIlIIlllII[0] != 0);
        }
        if (lIIlllIlIlIIlIIl(this.mobStats.getSize())) {
            llllllllllllIllIIIIIlIllllIlIllI.enabled = (GuiStats.lllIIIlIIlllII[0] != 0);
        }
    }
    
    private static boolean lIIlllIlIlIIlIlI(final int llllllllllllIllIIIIIlIllIIlIIIlI) {
        return llllllllllllIllIIIIIlIllIIlIIIlI != 0;
    }
    
    @Override
    public void doneLoading() {
        if (lIIlllIlIlIIlIlI(this.doesGuiPauseGame ? 1 : 0)) {
            this.func_175366_f();
            this.createButtons();
            this.displaySlot = this.generalStats;
            this.doesGuiPauseGame = (GuiStats.lllIIIlIIlllII[0] != 0);
        }
    }
    
    private void drawButtonBackground(final int llllllllllllIllIIIIIlIlllIlIIllI, final int llllllllllllIllIIIIIlIlllIlIIlIl) {
        this.drawSprite(llllllllllllIllIIIIIlIlllIlIIllI, llllllllllllIllIIIIIlIlllIlIIlIl, GuiStats.lllIIIlIIlllII[0], GuiStats.lllIIIlIIlllII[0]);
    }
    
    private static boolean lIIlllIlIlIIlIIl(final int llllllllllllIllIIIIIlIllIIlIIIII) {
        return llllllllllllIllIIIIIlIllIIlIIIII == 0;
    }
    
    private static String lIIlllIlIIlllIlI(String llllllllllllIllIIIIIlIllIlIlIIII, final String llllllllllllIllIIIIIlIllIlIIllll) {
        llllllllllllIllIIIIIlIllIlIlIIII = new String(Base64.getDecoder().decode(llllllllllllIllIIIIIlIllIlIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIIlIllIlIlIIll = new StringBuilder();
        final char[] llllllllllllIllIIIIIlIllIlIlIIlI = llllllllllllIllIIIIIlIllIlIIllll.toCharArray();
        int llllllllllllIllIIIIIlIllIlIlIIIl = GuiStats.lllIIIlIIlllII[0];
        final String llllllllllllIllIIIIIlIllIlIIlIll = (Object)llllllllllllIllIIIIIlIllIlIlIIII.toCharArray();
        final Exception llllllllllllIllIIIIIlIllIlIIlIlI = (Exception)llllllllllllIllIIIIIlIllIlIIlIll.length;
        short llllllllllllIllIIIIIlIllIlIIlIIl = (short)GuiStats.lllIIIlIIlllII[0];
        while (lIIlllIlIlIIllII(llllllllllllIllIIIIIlIllIlIIlIIl, (int)llllllllllllIllIIIIIlIllIlIIlIlI)) {
            final char llllllllllllIllIIIIIlIllIlIlIllI = llllllllllllIllIIIIIlIllIlIIlIll[llllllllllllIllIIIIIlIllIlIIlIIl];
            llllllllllllIllIIIIIlIllIlIlIIll.append((char)(llllllllllllIllIIIIIlIllIlIlIllI ^ llllllllllllIllIIIIIlIllIlIlIIlI[llllllllllllIllIIIIIlIllIlIlIIIl % llllllllllllIllIIIIIlIllIlIlIIlI.length]));
            "".length();
            ++llllllllllllIllIIIIIlIllIlIlIIIl;
            ++llllllllllllIllIIIIIlIllIlIIlIIl;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIIlIllIlIlIIll);
    }
    
    class StatsBlock extends Stats
    {
        private static final /* synthetic */ String[] lllIIIIIlIlIlI;
        private static final /* synthetic */ int[] lllIIIIIlIllIl;
        
        private static boolean lIIlllIIIIlIlIll(final int llllllllllllIllIIIIlllIlllllIIll) {
            return llllllllllllIllIIIIlllIlllllIIll == 0;
        }
        
        private static boolean lIIlllIIIIlIlIlI(final int llllllllllllIllIIIIlllIlllllIlIl) {
            return llllllllllllIllIIIIlllIlllllIlIl != 0;
        }
        
        private static String lIIlllIIIIlIIIII(final String llllllllllllIllIIIIllllIIIIIIIII, final String llllllllllllIllIIIIlllIlllllllll) {
            try {
                final SecretKeySpec llllllllllllIllIIIIllllIIIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIlllIlllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIIIIllllIIIIIIlII = Cipher.getInstance("Blowfish");
                llllllllllllIllIIIIllllIIIIIIlII.init(StatsBlock.lllIIIIIlIllIl[6], llllllllllllIllIIIIllllIIIIIIlIl);
                return new String(llllllllllllIllIIIIllllIIIIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIllllIIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIIIllllIIIIIIIll) {
                llllllllllllIllIIIIllllIIIIIIIll.printStackTrace();
                return null;
            }
        }
        
        @Override
        protected String func_148210_b(final int llllllllllllIllIIIIllllIIIIIllIl) {
            String s;
            if (lIIlllIIIIlIlIll(llllllllllllIllIIIIllllIIIIIllIl)) {
                s = StatsBlock.lllIIIIIlIlIlI[StatsBlock.lllIIIIIlIllIl[0]];
                "".length();
                if ((0x3 ^ 0x6) == 0x0) {
                    return null;
                }
            }
            else if (lIIlllIIIIlIllII(llllllllllllIllIIIIllllIIIIIllIl, StatsBlock.lllIIIIIlIllIl[1])) {
                s = StatsBlock.lllIIIIIlIlIlI[StatsBlock.lllIIIIIlIllIl[1]];
                "".length();
                if (" ".length() < 0) {
                    return null;
                }
            }
            else {
                s = StatsBlock.lllIIIIIlIlIlI[StatsBlock.lllIIIIIlIllIl[6]];
            }
            return s;
        }
        
        private static void lIIlllIIIIlIIlll() {
            (lllIIIIIlIllIl = new int[11])[0] = ((0x1D ^ 0x8) & ~(0x21 ^ 0x34));
            StatsBlock.lllIIIIIlIllIl[1] = " ".length();
            StatsBlock.lllIIIIIlIllIl[2] = (0x6E ^ 0x20 ^ (0x4B ^ 0x76));
            StatsBlock.lllIIIIIlIllIl[3] = (0x77 ^ 0x65);
            StatsBlock.lllIIIIIlIllIl[4] = (0xD7 ^ 0x85) + (0xD6 ^ 0x84) - (0x7B ^ 0x18) + (0x43 ^ 0x27);
            StatsBlock.lllIIIIIlIllIl[5] = (0x7E ^ 0x5A);
            StatsBlock.lllIIIIIlIllIl[6] = "  ".length();
            StatsBlock.lllIIIIIlIllIl[7] = 77 + 177 - 209 + 170;
            StatsBlock.lllIIIIIlIllIl[8] = (0x8 ^ 0x7E ^ (0x2E ^ 0x6E));
            StatsBlock.lllIIIIIlIllIl[9] = (0x49 ^ 0x74 ^ (0x5 ^ 0x10));
            StatsBlock.lllIIIIIlIllIl[10] = "   ".length();
        }
        
        private static boolean lIIlllIIIIlIlIII(final int llllllllllllIllIIIIlllIlllllIIIl) {
            return llllllllllllIllIIIIlllIlllllIIIl > 0;
        }
        
        private static void lIIlllIIIIlIIIIl() {
            (lllIIIIIlIlIlI = new String[StatsBlock.lllIIIIIlIllIl[10]])[StatsBlock.lllIIIIIlIllIl[0]] = lIIlllIIIIlIIIII("RlCt0HQBouzC3jWd5U6KCg==", "zhEvF");
            StatsBlock.lllIIIIIlIlIlI[StatsBlock.lllIIIIIlIllIl[1]] = lIIlllIIIIlIIIII("DfbEdVWhdDuk6HB0FWJnYw==", "XAtSR");
            StatsBlock.lllIIIIIlIlIlI[StatsBlock.lllIIIIIlIllIl[6]] = lIIlllIIIIlIIIII("X8sACHWbaDQcb5woIq+a0Q==", "WVaRQ");
        }
        
        @Override
        protected void drawListHeader(final int llllllllllllIllIIIIllllIIIlIlIlI, final int llllllllllllIllIIIIllllIIIlIlIIl, final Tessellator llllllllllllIllIIIIllllIIIlIllII) {
            super.drawListHeader(llllllllllllIllIIIIllllIIIlIlIlI, llllllllllllIllIIIIllllIIIlIlIIl, llllllllllllIllIIIIllllIIIlIllII);
            if (lIIlllIIIIlIlIll(this.field_148218_l)) {
                GuiStats.this.drawSprite(llllllllllllIllIIIIllllIIIlIlIlI + StatsBlock.lllIIIIIlIllIl[2] - StatsBlock.lllIIIIIlIllIl[3] + StatsBlock.lllIIIIIlIllIl[1], llllllllllllIllIIIIllllIIIlIlIIl + StatsBlock.lllIIIIIlIllIl[1] + StatsBlock.lllIIIIIlIllIl[1], StatsBlock.lllIIIIIlIllIl[3], StatsBlock.lllIIIIIlIllIl[3]);
                "".length();
                if ("   ".length() < ((0x27 ^ 0x4A ^ (0x4F ^ 0x25)) & (0x1B ^ 0x3B ^ (0xD ^ 0x2A) ^ -" ".length()))) {
                    return;
                }
            }
            else {
                GuiStats.this.drawSprite(llllllllllllIllIIIIllllIIIlIlIlI + StatsBlock.lllIIIIIlIllIl[2] - StatsBlock.lllIIIIIlIllIl[3], llllllllllllIllIIIIllllIIIlIlIIl + StatsBlock.lllIIIIIlIllIl[1], StatsBlock.lllIIIIIlIllIl[3], StatsBlock.lllIIIIIlIllIl[3]);
            }
            if (lIIlllIIIIlIllII(this.field_148218_l, StatsBlock.lllIIIIIlIllIl[1])) {
                GuiStats.this.drawSprite(llllllllllllIllIIIIllllIIIlIlIlI + StatsBlock.lllIIIIIlIllIl[4] - StatsBlock.lllIIIIIlIllIl[3] + StatsBlock.lllIIIIIlIllIl[1], llllllllllllIllIIIIllllIIIlIlIIl + StatsBlock.lllIIIIIlIllIl[1] + StatsBlock.lllIIIIIlIllIl[1], StatsBlock.lllIIIIIlIllIl[5], StatsBlock.lllIIIIIlIllIl[3]);
                "".length();
                if (((0xBE ^ 0xB6 ^ (0x59 ^ 0x61)) & (111 + 134 - 227 + 125 ^ 168 + 157 - 207 + 73 ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else {
                GuiStats.this.drawSprite(llllllllllllIllIIIIllllIIIlIlIlI + StatsBlock.lllIIIIIlIllIl[4] - StatsBlock.lllIIIIIlIllIl[3], llllllllllllIllIIIIllllIIIlIlIIl + StatsBlock.lllIIIIIlIllIl[1], StatsBlock.lllIIIIIlIllIl[5], StatsBlock.lllIIIIIlIllIl[3]);
            }
            if (lIIlllIIIIlIllII(this.field_148218_l, StatsBlock.lllIIIIIlIllIl[6])) {
                GuiStats.this.drawSprite(llllllllllllIllIIIIllllIIIlIlIlI + StatsBlock.lllIIIIIlIllIl[7] - StatsBlock.lllIIIIIlIllIl[3] + StatsBlock.lllIIIIIlIllIl[1], llllllllllllIllIIIIllllIIIlIlIIl + StatsBlock.lllIIIIIlIllIl[1] + StatsBlock.lllIIIIIlIllIl[1], StatsBlock.lllIIIIIlIllIl[8], StatsBlock.lllIIIIIlIllIl[3]);
                "".length();
                if (-" ".length() < -" ".length()) {
                    return;
                }
            }
            else {
                GuiStats.this.drawSprite(llllllllllllIllIIIIllllIIIlIlIlI + StatsBlock.lllIIIIIlIllIl[7] - StatsBlock.lllIIIIIlIllIl[3], llllllllllllIllIIIIllllIIIlIlIIl + StatsBlock.lllIIIIIlIllIl[1], StatsBlock.lllIIIIIlIllIl[8], StatsBlock.lllIIIIIlIllIl[3]);
            }
        }
        
        public StatsBlock(final Minecraft llllllllllllIllIIIIllllIIIlllllI) {
            super(llllllllllllIllIIIIllllIIIlllllI);
            this.statsHolder = (List<StatCrafting>)Lists.newArrayList();
            final int llllllllllllIllIIIIllllIIIllIllI = (int)StatList.objectMineStats.iterator();
            "".length();
            if (-" ".length() > "   ".length()) {
                throw null;
            }
            while (!lIIlllIIIIlIlIll(((Iterator)llllllllllllIllIIIIllllIIIllIllI).hasNext() ? 1 : 0)) {
                final StatCrafting llllllllllllIllIIIIllllIIIllllIl = ((Iterator<StatCrafting>)llllllllllllIllIIIIllllIIIllIllI).next();
                boolean llllllllllllIllIIIIllllIIIllllII = StatsBlock.lllIIIIIlIllIl[0] != 0;
                final int llllllllllllIllIIIIllllIIIlllIll = Item.getIdFromItem(llllllllllllIllIIIIllllIIIllllIl.func_150959_a());
                if (lIIlllIIIIlIlIII(GuiStats.this.field_146546_t.readStat(llllllllllllIllIIIIllllIIIllllIl))) {
                    llllllllllllIllIIIIllllIIIllllII = (StatsBlock.lllIIIIIlIllIl[1] != 0);
                    "".length();
                    if (-(0 + 87 - 80 + 126 ^ 8 + 66 - 30 + 85) > 0) {
                        throw null;
                    }
                }
                else if (lIIlllIIIIlIlIIl(StatList.objectUseStats[llllllllllllIllIIIIllllIIIlllIll]) && lIIlllIIIIlIlIII(GuiStats.this.field_146546_t.readStat(StatList.objectUseStats[llllllllllllIllIIIIllllIIIlllIll]))) {
                    llllllllllllIllIIIIllllIIIllllII = (StatsBlock.lllIIIIIlIllIl[1] != 0);
                    "".length();
                    if (((0xAF ^ 0x92) & ~(0x0 ^ 0x3D)) > 0) {
                        throw null;
                    }
                }
                else if (lIIlllIIIIlIlIIl(StatList.objectCraftStats[llllllllllllIllIIIIllllIIIlllIll]) && lIIlllIIIIlIlIII(GuiStats.this.field_146546_t.readStat(StatList.objectCraftStats[llllllllllllIllIIIIllllIIIlllIll]))) {
                    llllllllllllIllIIIIllllIIIllllII = (StatsBlock.lllIIIIIlIllIl[1] != 0);
                }
                if (lIIlllIIIIlIlIlI(llllllllllllIllIIIIllllIIIllllII ? 1 : 0)) {
                    this.statsHolder.add(llllllllllllIllIIIIllllIIIllllIl);
                    "".length();
                }
            }
            this.statSorter = new Comparator<StatCrafting>() {
                private static final /* synthetic */ int[] lllIlllllIIlIl;
                
                private static boolean lIlIIllIIIlIlIII(final Object llllllllllllIlIlIlllllIlIllIIIlI) {
                    return llllllllllllIlIlIlllllIlIllIIIlI != null;
                }
                
                private static boolean lIlIIllIIIlIIlIl(final int llllllllllllIlIlIlllllIlIllIIlIl, final int llllllllllllIlIlIlllllIlIllIIlII) {
                    return llllllllllllIlIlIlllllIlIllIIlIl == llllllllllllIlIlIlllllIlIllIIlII;
                }
                
                static {
                    lIlIIllIIIlIIIll();
                }
                
                private static void lIlIIllIIIlIIIll() {
                    (lllIlllllIIlIl = new int[3])[0] = "  ".length();
                    GuiStats$StatsBlock$1.lllIlllllIIlIl[1] = " ".length();
                    GuiStats$StatsBlock$1.lllIlllllIIlIl[2] = -" ".length();
                }
                
                private static boolean lIlIIllIIIlIIlll(final Object llllllllllllIlIlIlllllIlIllIIIII) {
                    return llllllllllllIlIlIlllllIlIllIIIII == null;
                }
                
                private static boolean lIlIIllIIIlIlIIl(final int llllllllllllIlIlIlllllIlIlIllIll, final int llllllllllllIlIlIlllllIlIlIllIlI) {
                    return llllllllllllIlIlIlllllIlIlIllIll != llllllllllllIlIlIlllllIlIlIllIlI;
                }
                
                private static boolean lIlIIllIIIlIIllI(final int llllllllllllIlIlIlllllIlIlIllllI) {
                    return llllllllllllIlIlIlllllIlIlIllllI == 0;
                }
                
                @Override
                public int compare(final StatCrafting llllllllllllIlIlIlllllIlIllllllI, final StatCrafting llllllllllllIlIlIlllllIlIlllIlII) {
                    final int llllllllllllIlIlIlllllIlIlllllII = Item.getIdFromItem(llllllllllllIlIlIlllllIlIllllllI.func_150959_a());
                    final int llllllllllllIlIlIlllllIlIllllIll = Item.getIdFromItem(llllllllllllIlIlIlllllIlIlllIlII.func_150959_a());
                    StatBase llllllllllllIlIlIlllllIlIllllIlI = null;
                    StatBase llllllllllllIlIlIlllllIlIllllIIl = null;
                    if (lIlIIllIIIlIIlIl(StatsBlock.this.field_148217_o, GuiStats$StatsBlock$1.lllIlllllIIlIl[0])) {
                        llllllllllllIlIlIlllllIlIllllIlI = StatList.mineBlockStatArray[llllllllllllIlIlIlllllIlIlllllII];
                        llllllllllllIlIlIlllllIlIllllIIl = StatList.mineBlockStatArray[llllllllllllIlIlIlllllIlIllllIll];
                        "".length();
                        if (((0x15 ^ 0x7F ^ (0x6C ^ 0x41)) & (0xF6 ^ 0xBC ^ (0x74 ^ 0x79) ^ -" ".length())) < 0) {
                            return (0xBA ^ 0xB0 ^ (0x23 ^ 0x38)) & (120 + 17 - 118 + 131 ^ 16 + 84 - 98 + 133 ^ -" ".length());
                        }
                    }
                    else if (lIlIIllIIIlIIllI(StatsBlock.this.field_148217_o)) {
                        llllllllllllIlIlIlllllIlIllllIlI = StatList.objectCraftStats[llllllllllllIlIlIlllllIlIlllllII];
                        llllllllllllIlIlIlllllIlIllllIIl = StatList.objectCraftStats[llllllllllllIlIlIlllllIlIllllIll];
                        "".length();
                        if ("  ".length() < ((0x61 ^ 0x73) & ~(0xC ^ 0x1E))) {
                            return (0x85 ^ 0xC5) & ~(0x5F ^ 0x1F);
                        }
                    }
                    else if (lIlIIllIIIlIIlIl(StatsBlock.this.field_148217_o, GuiStats$StatsBlock$1.lllIlllllIIlIl[1])) {
                        llllllllllllIlIlIlllllIlIllllIlI = StatList.objectUseStats[llllllllllllIlIlIlllllIlIlllllII];
                        llllllllllllIlIlIlllllIlIllllIIl = StatList.objectUseStats[llllllllllllIlIlIlllllIlIllllIll];
                    }
                    if (!lIlIIllIIIlIIlll(llllllllllllIlIlIlllllIlIllllIlI) || lIlIIllIIIlIlIII(llllllllllllIlIlIlllllIlIllllIIl)) {
                        if (lIlIIllIIIlIIlll(llllllllllllIlIlIlllllIlIllllIlI)) {
                            return GuiStats$StatsBlock$1.lllIlllllIIlIl[1];
                        }
                        if (lIlIIllIIIlIIlll(llllllllllllIlIlIlllllIlIllllIIl)) {
                            return GuiStats$StatsBlock$1.lllIlllllIIlIl[2];
                        }
                        final int llllllllllllIlIlIlllllIlIllllIII = GuiStats.this.field_146546_t.readStat(llllllllllllIlIlIlllllIlIllllIlI);
                        final int llllllllllllIlIlIlllllIlIlllIlll = GuiStats.this.field_146546_t.readStat(llllllllllllIlIlIlllllIlIllllIIl);
                        if (lIlIIllIIIlIlIIl(llllllllllllIlIlIlllllIlIllllIII, llllllllllllIlIlIlllllIlIlllIlll)) {
                            return (llllllllllllIlIlIlllllIlIllllIII - llllllllllllIlIlIlllllIlIlllIlll) * StatsBlock.this.field_148215_p;
                        }
                    }
                    return llllllllllllIlIlIlllllIlIlllllII - llllllllllllIlIlIlllllIlIllllIll;
                }
            };
        }
        
        @Override
        protected void drawSlot(final int llllllllllllIllIIIIllllIIIIlllll, final int llllllllllllIllIIIIllllIIIIllllI, final int llllllllllllIllIIIIllllIIIIlllIl, final int llllllllllllIllIIIIllllIIIIlllII, final int llllllllllllIllIIIIllllIIIIllIll, final int llllllllllllIllIIIIllllIIIIllIlI) {
            final StatCrafting llllllllllllIllIIIIllllIIIIllIIl = this.func_148211_c(llllllllllllIllIIIIllllIIIIlllll);
            final Item llllllllllllIllIIIIllllIIIIllIII = llllllllllllIllIIIIllllIIIIllIIl.func_150959_a();
            GuiStats.this.drawStatsScreen(llllllllllllIllIIIIllllIIIIllllI + StatsBlock.lllIIIIIlIllIl[9], llllllllllllIllIIIIllllIIIIlllIl, llllllllllllIllIIIIllllIIIIllIII);
            final int llllllllllllIllIIIIllllIIIIlIlll = Item.getIdFromItem(llllllllllllIllIIIIllllIIIIllIII);
            final StatBase lllllllllllllIlIlIIIIIlIlllIllII = StatList.objectCraftStats[llllllllllllIllIIIIllllIIIIlIlll];
            final int lllllllllllllIlIlIIIIIlIlllIlIll = llllllllllllIllIIIIllllIIIIllllI + StatsBlock.lllIIIIIlIllIl[2];
            int lllllllllllllIlIlIIIIIlIllllIIII;
            if (lIIlllIIIIlIlIll(llllllllllllIllIIIIllllIIIIlllll % StatsBlock.lllIIIIIlIllIl[6])) {
                lllllllllllllIlIlIIIIIlIllllIIII = StatsBlock.lllIIIIIlIllIl[1];
                "".length();
                if (-(0xF6 ^ 0x8F ^ (0x1D ^ 0x60)) > 0) {
                    return;
                }
            }
            else {
                lllllllllllllIlIlIIIIIlIllllIIII = StatsBlock.lllIIIIIlIllIl[0];
            }
            this.func_148209_a(lllllllllllllIlIlIIIIIlIlllIllII, lllllllllllllIlIlIIIIIlIlllIlIll, llllllllllllIllIIIIllllIIIIlllIl, (boolean)(lllllllllllllIlIlIIIIIlIllllIIII != 0));
            final StatBase lllllllllllllIlIlIIIIIlIlllIllII2 = StatList.objectUseStats[llllllllllllIllIIIIllllIIIIlIlll];
            final int lllllllllllllIlIlIIIIIlIlllIlIll2 = llllllllllllIllIIIIllllIIIIllllI + StatsBlock.lllIIIIIlIllIl[4];
            int lllllllllllllIlIlIIIIIlIllllIIII2;
            if (lIIlllIIIIlIlIll(llllllllllllIllIIIIllllIIIIlllll % StatsBlock.lllIIIIIlIllIl[6])) {
                lllllllllllllIlIlIIIIIlIllllIIII2 = StatsBlock.lllIIIIIlIllIl[1];
                "".length();
                if ((0x94 ^ 0x90) == ((0x70 ^ 0x43) & ~(0x63 ^ 0x50))) {
                    return;
                }
            }
            else {
                lllllllllllllIlIlIIIIIlIllllIIII2 = StatsBlock.lllIIIIIlIllIl[0];
            }
            this.func_148209_a(lllllllllllllIlIlIIIIIlIlllIllII2, lllllllllllllIlIlIIIIIlIlllIlIll2, llllllllllllIllIIIIllllIIIIlllIl, (boolean)(lllllllllllllIlIlIIIIIlIllllIIII2 != 0));
            final StatCrafting lllllllllllllIlIlIIIIIlIlllIllII3 = llllllllllllIllIIIIllllIIIIllIIl;
            final int lllllllllllllIlIlIIIIIlIlllIlIll3 = llllllllllllIllIIIIllllIIIIllllI + StatsBlock.lllIIIIIlIllIl[7];
            int lllllllllllllIlIlIIIIIlIllllIIII3;
            if (lIIlllIIIIlIlIll(llllllllllllIllIIIIllllIIIIlllll % StatsBlock.lllIIIIIlIllIl[6])) {
                lllllllllllllIlIlIIIIIlIllllIIII3 = StatsBlock.lllIIIIIlIllIl[1];
                "".length();
                if (((0x94 ^ 0xA0 ^ (0xBA ^ 0x8A)) & (0x72 ^ 0x6A ^ (0x77 ^ 0x6B) ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else {
                lllllllllllllIlIlIIIIIlIllllIIII3 = StatsBlock.lllIIIIIlIllIl[0];
            }
            this.func_148209_a(lllllllllllllIlIlIIIIIlIlllIllII3, lllllllllllllIlIlIIIIIlIlllIlIll3, llllllllllllIllIIIIllllIIIIlllIl, (boolean)(lllllllllllllIlIlIIIIIlIllllIIII3 != 0));
        }
        
        private static boolean lIIlllIIIIlIllII(final int llllllllllllIllIIIIlllIllllllIlI, final int llllllllllllIllIIIIlllIllllllIIl) {
            return llllllllllllIllIIIIlllIllllllIlI == llllllllllllIllIIIIlllIllllllIIl;
        }
        
        static {
            lIIlllIIIIlIIlll();
            lIIlllIIIIlIIIIl();
        }
        
        private static boolean lIIlllIIIIlIlIIl(final Object llllllllllllIllIIIIlllIlllllIlll) {
            return llllllllllllIllIIIIlllIlllllIlll != null;
        }
    }
    
    abstract class Stats extends GuiSlot
    {
        private static final /* synthetic */ String[] lIIIIIIlIllIll;
        private static final /* synthetic */ int[] lIIIIIIllIIIll;
        protected /* synthetic */ Comparator<StatCrafting> statSorter;
        protected /* synthetic */ int field_148217_o;
        protected /* synthetic */ int field_148215_p;
        protected /* synthetic */ List<StatCrafting> statsHolder;
        protected /* synthetic */ int field_148218_l;
        
        private static boolean lIllIlIIlIIllII(final int lllllllllllllIlIlIIIIIlIIllIIllI) {
            return lllllllllllllIlIlIIIIIlIIllIIllI == 0;
        }
        
        protected final StatCrafting func_148211_c(final int lllllllllllllIlIlIIIIIlIlllllIll) {
            return this.statsHolder.get(lllllllllllllIlIlIIIIIlIlllllIll);
        }
        
        @Override
        protected void drawBackground() {
            GuiStats.this.drawDefaultBackground();
        }
        
        @Override
        protected void func_148142_b(final int lllllllllllllIlIlIIIIIlIllIlIIll, final int lllllllllllllIlIlIIIIIlIllIlIIlI) {
            if (lIllIlIIlIIllll(lllllllllllllIlIlIIIIIlIllIlIIlI, this.top) && lIllIlIIlIlIlII(lllllllllllllIlIlIIIIIlIllIlIIlI, this.bottom)) {
                final int lllllllllllllIlIlIIIIIlIllIllIll = this.getSlotIndexFromScreenCoords(lllllllllllllIlIlIIIIIlIllIlIIll, lllllllllllllIlIlIIIIIlIllIlIIlI);
                final int lllllllllllllIlIlIIIIIlIllIllIlI = this.width / Stats.lIIIIIIllIIIll[9] - Stats.lIIIIIIllIIIll[18] - Stats.lIIIIIIllIIIll[19];
                if (lIllIlIIlIlIIIl(lllllllllllllIlIlIIIIIlIllIllIll)) {
                    if (!lIllIlIIlIIllll(lllllllllllllIlIlIIIIIlIllIlIIll, lllllllllllllIlIlIIIIIlIllIllIlI + Stats.lIIIIIIllIIIll[20]) || lIllIlIIlIlIlIl(lllllllllllllIlIlIIIIIlIllIlIIll, lllllllllllllIlIlIIIIIlIllIllIlI + Stats.lIIIIIIllIIIll[20] + Stats.lIIIIIIllIIIll[2])) {
                        return;
                    }
                    final StatCrafting lllllllllllllIlIlIIIIIlIllIllIIl = this.func_148211_c(lllllllllllllIlIlIIIIIlIllIllIll);
                    this.func_148213_a(lllllllllllllIlIlIIIIIlIllIllIIl, lllllllllllllIlIlIIIIIlIllIlIIll, lllllllllllllIlIlIIIIIlIllIlIIlI);
                    "".length();
                    if ((0x8D ^ 0x89) <= 0) {
                        return;
                    }
                }
                else {
                    String lllllllllllllIlIlIIIIIlIllIllIII = Stats.lIIIIIIlIllIll[Stats.lIIIIIIllIIIll[9]];
                    if (lIllIlIIlIIllll(lllllllllllllIlIlIIIIIlIllIlIIll, lllllllllllllIlIlIIIIIlIllIllIlI + Stats.lIIIIIIllIIIll[6] - Stats.lIIIIIIllIIIll[7]) && lIllIlIIlIlIlII(lllllllllllllIlIlIIIIIlIllIlIIll, lllllllllllllIlIlIIIIIlIllIllIlI + Stats.lIIIIIIllIIIll[6])) {
                        lllllllllllllIlIlIIIIIlIllIllIII = this.func_148210_b(Stats.lIIIIIIllIIIll[4]);
                        "".length();
                        if (-" ".length() > 0) {
                            return;
                        }
                    }
                    else if (lIllIlIIlIIllll(lllllllllllllIlIlIIIIIlIllIlIIll, lllllllllllllIlIlIIIIIlIllIllIlI + Stats.lIIIIIIllIIIll[8] - Stats.lIIIIIIllIIIll[7]) && lIllIlIIlIlIlII(lllllllllllllIlIlIIIIIlIllIlIIll, lllllllllllllIlIlIIIIIlIllIllIlI + Stats.lIIIIIIllIIIll[8])) {
                        lllllllllllllIlIlIIIIIlIllIllIII = this.func_148210_b(Stats.lIIIIIIllIIIll[5]);
                        "".length();
                        if (" ".length() != " ".length()) {
                            return;
                        }
                    }
                    else {
                        if (!lIllIlIIlIIllll(lllllllllllllIlIlIIIIIlIllIlIIll, lllllllllllllIlIlIIIIIlIllIllIlI + Stats.lIIIIIIllIIIll[10] - Stats.lIIIIIIllIIIll[7]) || lIllIlIIlIlIlIl(lllllllllllllIlIlIIIIIlIllIlIIll, lllllllllllllIlIlIIIIIlIllIllIlI + Stats.lIIIIIIllIIIll[10])) {
                            return;
                        }
                        lllllllllllllIlIlIIIIIlIllIllIII = this.func_148210_b(Stats.lIIIIIIllIIIll[9]);
                    }
                    lllllllllllllIlIlIIIIIlIllIllIII = String.valueOf(new StringBuilder().append(I18n.format(lllllllllllllIlIlIIIIIlIllIllIII, new Object[Stats.lIIIIIIllIIIll[4]]))).trim();
                    if (lIllIlIIlIlIllI(lllllllllllllIlIlIIIIIlIllIllIII.length())) {
                        final int lllllllllllllIlIlIIIIIlIllIlIlll = lllllllllllllIlIlIIIIIlIllIlIIll + Stats.lIIIIIIllIIIll[21];
                        final int lllllllllllllIlIlIIIIIlIllIlIllI = lllllllllllllIlIlIIIIIlIllIlIIlI - Stats.lIIIIIIllIIIll[21];
                        final int lllllllllllllIlIlIIIIIlIllIlIlIl = GuiStats.this.fontRendererObj.getStringWidth(lllllllllllllIlIlIIIIIlIllIllIII);
                        Gui.this.drawGradientRect(lllllllllllllIlIlIIIIIlIllIlIlll - Stats.lIIIIIIllIIIll[22], lllllllllllllIlIlIIIIIlIllIlIllI - Stats.lIIIIIIllIIIll[22], lllllllllllllIlIlIIIIIlIllIlIlll + lllllllllllllIlIlIIIIIlIllIlIlIl + Stats.lIIIIIIllIIIll[22], lllllllllllllIlIlIIIIIlIllIlIllI + Stats.lIIIIIIllIIIll[23] + Stats.lIIIIIIllIIIll[22], Stats.lIIIIIIllIIIll[24], Stats.lIIIIIIllIIIll[24]);
                        GuiStats.this.fontRendererObj.drawStringWithShadow(lllllllllllllIlIlIIIIIlIllIllIII, (float)lllllllllllllIlIlIIIIIlIllIlIlll, (float)lllllllllllllIlIlIIIIIlIllIlIllI, Stats.lIIIIIIllIIIll[3]);
                        "".length();
                    }
                }
            }
        }
        
        protected abstract String func_148210_b(final int p0);
        
        @Override
        protected void drawListHeader(final int lllllllllllllIlIlIIIIIllIIIIlllI, final int lllllllllllllIlIlIIIIIllIIIlIIll, final Tessellator lllllllllllllIlIlIIIIIllIIIlIIlI) {
            if (lIllIlIIlIIllII(Mouse.isButtonDown(Stats.lIIIIIIllIIIll[4]) ? 1 : 0)) {
                this.field_148218_l = Stats.lIIIIIIllIIIll[3];
            }
            if (lIllIlIIlIIllII(this.field_148218_l)) {
                GuiStats.this.drawSprite(lllllllllllllIlIlIIIIIllIIIIlllI + Stats.lIIIIIIllIIIll[6] - Stats.lIIIIIIllIIIll[7], lllllllllllllIlIlIIIIIllIIIlIIll + Stats.lIIIIIIllIIIll[5], Stats.lIIIIIIllIIIll[4], Stats.lIIIIIIllIIIll[4]);
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
            }
            else {
                GuiStats.this.drawSprite(lllllllllllllIlIlIIIIIllIIIIlllI + Stats.lIIIIIIllIIIll[6] - Stats.lIIIIIIllIIIll[7], lllllllllllllIlIlIIIIIllIIIlIIll + Stats.lIIIIIIllIIIll[5], Stats.lIIIIIIllIIIll[4], Stats.lIIIIIIllIIIll[7]);
            }
            if (lIllIlIIlIIllIl(this.field_148218_l, Stats.lIIIIIIllIIIll[5])) {
                GuiStats.this.drawSprite(lllllllllllllIlIlIIIIIllIIIIlllI + Stats.lIIIIIIllIIIll[8] - Stats.lIIIIIIllIIIll[7], lllllllllllllIlIlIIIIIllIIIlIIll + Stats.lIIIIIIllIIIll[5], Stats.lIIIIIIllIIIll[4], Stats.lIIIIIIllIIIll[4]);
                "".length();
                if (-" ".length() > 0) {
                    return;
                }
            }
            else {
                GuiStats.this.drawSprite(lllllllllllllIlIlIIIIIllIIIIlllI + Stats.lIIIIIIllIIIll[8] - Stats.lIIIIIIllIIIll[7], lllllllllllllIlIlIIIIIllIIIlIIll + Stats.lIIIIIIllIIIll[5], Stats.lIIIIIIllIIIll[4], Stats.lIIIIIIllIIIll[7]);
            }
            if (lIllIlIIlIIllIl(this.field_148218_l, Stats.lIIIIIIllIIIll[9])) {
                GuiStats.this.drawSprite(lllllllllllllIlIlIIIIIllIIIIlllI + Stats.lIIIIIIllIIIll[10] - Stats.lIIIIIIllIIIll[7], lllllllllllllIlIlIIIIIllIIIlIIll + Stats.lIIIIIIllIIIll[5], Stats.lIIIIIIllIIIll[4], Stats.lIIIIIIllIIIll[4]);
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            }
            else {
                GuiStats.this.drawSprite(lllllllllllllIlIlIIIIIllIIIIlllI + Stats.lIIIIIIllIIIll[10] - Stats.lIIIIIIllIIIll[7], lllllllllllllIlIlIIIIIllIIIlIIll + Stats.lIIIIIIllIIIll[5], Stats.lIIIIIIllIIIll[4], Stats.lIIIIIIllIIIll[7]);
            }
            if (lIllIlIIlIIlllI(this.field_148217_o, Stats.lIIIIIIllIIIll[3])) {
                int lllllllllllllIlIlIIIIIllIIIlIIIl = Stats.lIIIIIIllIIIll[11];
                int lllllllllllllIlIlIIIIIllIIIlIIII = Stats.lIIIIIIllIIIll[7];
                if (lIllIlIIlIIllIl(this.field_148217_o, Stats.lIIIIIIllIIIll[5])) {
                    lllllllllllllIlIlIIIIIllIIIlIIIl = Stats.lIIIIIIllIIIll[12];
                    "".length();
                    if (((0xE ^ 0x18) & ~(0xAD ^ 0xBB)) > 0) {
                        return;
                    }
                }
                else if (lIllIlIIlIIllIl(this.field_148217_o, Stats.lIIIIIIllIIIll[9])) {
                    lllllllllllllIlIlIIIIIllIIIlIIIl = Stats.lIIIIIIllIIIll[13];
                }
                if (lIllIlIIlIIllIl(this.field_148215_p, Stats.lIIIIIIllIIIll[5])) {
                    lllllllllllllIlIlIIIIIllIIIlIIII = Stats.lIIIIIIllIIIll[14];
                }
                GuiStats.this.drawSprite(lllllllllllllIlIlIIIIIllIIIIlllI + lllllllllllllIlIlIIIIIllIIIlIIIl, lllllllllllllIlIlIIIIIllIIIlIIll + Stats.lIIIIIIllIIIll[5], lllllllllllllIlIlIIIIIllIIIlIIII, Stats.lIIIIIIllIIIll[4]);
            }
        }
        
        protected void func_148213_a(final StatCrafting lllllllllllllIlIlIIIIIlIlIllllll, final int lllllllllllllIlIlIIIIIlIlIllIIll, final int lllllllllllllIlIlIIIIIlIlIllllIl) {
            if (lIllIlIIlIlIIlI(lllllllllllllIlIlIIIIIlIlIllllll)) {
                final Item lllllllllllllIlIlIIIIIlIlIllllII = lllllllllllllIlIlIIIIIlIlIllllll.func_150959_a();
                final ItemStack lllllllllllllIlIlIIIIIlIlIlllIll = new ItemStack(lllllllllllllIlIlIIIIIlIlIllllII);
                final String lllllllllllllIlIlIIIIIlIlIlllIlI = lllllllllllllIlIlIIIIIlIlIlllIll.getUnlocalizedName();
                final String lllllllllllllIlIlIIIIIlIlIlllIIl = String.valueOf(new StringBuilder().append(I18n.format(String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIlIIIIIlIlIlllIlI)).append(Stats.lIIIIIIlIllIll[Stats.lIIIIIIllIIIll[22]])), new Object[Stats.lIIIIIIllIIIll[4]]))).trim();
                if (lIllIlIIlIlIllI(lllllllllllllIlIlIIIIIlIlIlllIIl.length())) {
                    final int lllllllllllllIlIlIIIIIlIlIlllIII = lllllllllllllIlIlIIIIIlIlIllIIll + Stats.lIIIIIIllIIIll[21];
                    final int lllllllllllllIlIlIIIIIlIlIllIlll = lllllllllllllIlIlIIIIIlIlIllllIl - Stats.lIIIIIIllIIIll[21];
                    final int lllllllllllllIlIlIIIIIlIlIllIllI = GuiStats.this.fontRendererObj.getStringWidth(lllllllllllllIlIlIIIIIlIlIlllIIl);
                    Gui.this.drawGradientRect(lllllllllllllIlIlIIIIIlIlIlllIII - Stats.lIIIIIIllIIIll[22], lllllllllllllIlIlIIIIIlIlIllIlll - Stats.lIIIIIIllIIIll[22], lllllllllllllIlIlIIIIIlIlIlllIII + lllllllllllllIlIlIIIIIlIlIllIllI + Stats.lIIIIIIllIIIll[22], lllllllllllllIlIlIIIIIlIlIllIlll + Stats.lIIIIIIllIIIll[23] + Stats.lIIIIIIllIIIll[22], Stats.lIIIIIIllIIIll[24], Stats.lIIIIIIllIIIll[24]);
                    GuiStats.this.fontRendererObj.drawStringWithShadow(lllllllllllllIlIlIIIIIlIlIlllIIl, (float)lllllllllllllIlIlIIIIIlIlIlllIII, (float)lllllllllllllIlIlIIIIIlIlIllIlll, Stats.lIIIIIIllIIIll[3]);
                    "".length();
                }
            }
        }
        
        private static String lIllIlIIIlIIIIl(String lllllllllllllIlIlIIIIIlIlIIIlIII, final String lllllllllllllIlIlIIIIIlIlIIIllII) {
            lllllllllllllIlIlIIIIIlIlIIIlIII = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIIIIIlIlIIIlIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIlIIIIIlIlIIIlIll = new StringBuilder();
            final char[] lllllllllllllIlIlIIIIIlIlIIIlIlI = lllllllllllllIlIlIIIIIlIlIIIllII.toCharArray();
            int lllllllllllllIlIlIIIIIlIlIIIlIIl = Stats.lIIIIIIllIIIll[4];
            final char lllllllllllllIlIlIIIIIlIlIIIIIll = (Object)((String)lllllllllllllIlIlIIIIIlIlIIIlIII).toCharArray();
            final int lllllllllllllIlIlIIIIIlIlIIIIIlI = lllllllllllllIlIlIIIIIlIlIIIIIll.length;
            float lllllllllllllIlIlIIIIIlIlIIIIIIl = Stats.lIIIIIIllIIIll[4];
            while (lIllIlIIlIlIIII((int)lllllllllllllIlIlIIIIIlIlIIIIIIl, lllllllllllllIlIlIIIIIlIlIIIIIlI)) {
                final char lllllllllllllIlIlIIIIIlIlIIIlllI = lllllllllllllIlIlIIIIIlIlIIIIIll[lllllllllllllIlIlIIIIIlIlIIIIIIl];
                lllllllllllllIlIlIIIIIlIlIIIlIll.append((char)(lllllllllllllIlIlIIIIIlIlIIIlllI ^ lllllllllllllIlIlIIIIIlIlIIIlIlI[lllllllllllllIlIlIIIIIlIlIIIlIIl % lllllllllllllIlIlIIIIIlIlIIIlIlI.length]));
                "".length();
                ++lllllllllllllIlIlIIIIIlIlIIIlIIl;
                ++lllllllllllllIlIlIIIIIlIlIIIIIIl;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIlIIIIIlIlIIIlIll);
        }
        
        protected void func_148212_h(final int lllllllllllllIlIlIIIIIlIlIlIIlIl) {
            if (lIllIlIIlIIlllI(lllllllllllllIlIlIIIIIlIlIlIIlIl, this.field_148217_o)) {
                this.field_148217_o = lllllllllllllIlIlIIIIIlIlIlIIlIl;
                this.field_148215_p = Stats.lIIIIIIllIIIll[3];
                "".length();
                if (-(0xC3 ^ 0xC7) >= 0) {
                    return;
                }
            }
            else if (lIllIlIIlIIllIl(this.field_148215_p, Stats.lIIIIIIllIIIll[3])) {
                this.field_148215_p = Stats.lIIIIIIllIIIll[5];
                "".length();
                if ((0x9F ^ 0x9A) == 0x0) {
                    return;
                }
            }
            else {
                this.field_148217_o = Stats.lIIIIIIllIIIll[3];
                this.field_148215_p = Stats.lIIIIIIllIIIll[4];
            }
            Collections.sort(this.statsHolder, this.statSorter);
        }
        
        protected Stats(final Minecraft lllllllllllllIlIlIIIIIllIIlIIlIl) {
            super(lllllllllllllIlIlIIIIIllIIlIIlIl, GuiStats.this.width, GuiStats.this.height, Stats.lIIIIIIllIIIll[0], GuiStats.this.height - Stats.lIIIIIIllIIIll[1], Stats.lIIIIIIllIIIll[2]);
            this.field_148218_l = Stats.lIIIIIIllIIIll[3];
            this.field_148217_o = Stats.lIIIIIIllIIIll[3];
            this.setShowSelectionBox((boolean)(Stats.lIIIIIIllIIIll[4] != 0));
            this.setHasListHeader((boolean)(Stats.lIIIIIIllIIIll[5] != 0), Stats.lIIIIIIllIIIll[2]);
        }
        
        private static boolean lIllIlIIlIlIIlI(final Object lllllllllllllIlIlIIIIIlIIllIlIlI) {
            return lllllllllllllIlIlIIIIIlIIllIlIlI != null;
        }
        
        static {
            lIllIlIIlIIlIll();
            lIllIlIIIlIIIlI();
        }
        
        private static String lIllIlIIIlIIIII(final String lllllllllllllIlIlIIIIIlIlIIlllIl, final String lllllllllllllIlIlIIIIIlIlIIllIlI) {
            try {
                final SecretKeySpec lllllllllllllIlIlIIIIIlIlIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIIIIlIlIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIlIIIIIlIlIIlllll = Cipher.getInstance("Blowfish");
                lllllllllllllIlIlIIIIIlIlIIlllll.init(Stats.lIIIIIIllIIIll[9], lllllllllllllIlIlIIIIIlIlIlIIIII);
                return new String(lllllllllllllIlIlIIIIIlIlIIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIIIIlIlIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlIIIIIlIlIIllllI) {
                lllllllllllllIlIlIIIIIlIlIIllllI.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIllIlIIlIlIlIl(final int lllllllllllllIlIlIIIIIlIIllIllIl, final int lllllllllllllIlIlIIIIIlIIllIllII) {
            return lllllllllllllIlIlIIIIIlIIllIllIl > lllllllllllllIlIlIIIIIlIIllIllII;
        }
        
        private static boolean lIllIlIIlIlIllI(final int lllllllllllllIlIlIIIIIlIIllIIIlI) {
            return lllllllllllllIlIlIIIIIlIIllIIIlI > 0;
        }
        
        @Override
        protected void elementClicked(final int lllllllllllllIlIlIIIIIllIIlIIIll, final boolean lllllllllllllIlIlIIIIIllIIlIIIlI, final int lllllllllllllIlIlIIIIIllIIlIIIIl, final int lllllllllllllIlIlIIIIIllIIlIIIII) {
        }
        
        private static boolean lIllIlIIlIlIIII(final int lllllllllllllIlIlIIIIIlIIlllIlIl, final int lllllllllllllIlIlIIIIIlIIlllIlII) {
            return lllllllllllllIlIlIIIIIlIIlllIlIl < lllllllllllllIlIlIIIIIlIIlllIlII;
        }
        
        private static boolean lIllIlIIlIIllll(final int lllllllllllllIlIlIIIIIlIIllllIIl, final int lllllllllllllIlIlIIIIIlIIllllIII) {
            return lllllllllllllIlIlIIIIIlIIllllIIl >= lllllllllllllIlIlIIIIIlIIllllIII;
        }
        
        @Override
        protected void func_148132_a(final int lllllllllllllIlIlIIIIIllIIIIIlII, final int lllllllllllllIlIlIIIIIllIIIIIllI) {
            this.field_148218_l = Stats.lIIIIIIllIIIll[3];
            if (lIllIlIIlIIllll(lllllllllllllIlIlIIIIIllIIIIIlII, Stats.lIIIIIIllIIIll[11]) && lIllIlIIlIlIIII(lllllllllllllIlIlIIIIIllIIIIIlII, Stats.lIIIIIIllIIIll[6])) {
                this.field_148218_l = Stats.lIIIIIIllIIIll[4];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (lIllIlIIlIIllll(lllllllllllllIlIlIIIIIllIIIIIlII, Stats.lIIIIIIllIIIll[12]) && lIllIlIIlIlIIII(lllllllllllllIlIlIIIIIllIIIIIlII, Stats.lIIIIIIllIIIll[8])) {
                this.field_148218_l = Stats.lIIIIIIllIIIll[5];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (lIllIlIIlIIllll(lllllllllllllIlIlIIIIIllIIIIIlII, Stats.lIIIIIIllIIIll[13]) && lIllIlIIlIlIIII(lllllllllllllIlIlIIIIIllIIIIIlII, Stats.lIIIIIIllIIIll[10])) {
                this.field_148218_l = Stats.lIIIIIIllIIIll[9];
            }
            if (lIllIlIIlIlIIIl(this.field_148218_l)) {
                this.func_148212_h(this.field_148218_l);
                this.mc.getSoundHandler().playSound(PositionedSoundRecord.create(new ResourceLocation(Stats.lIIIIIIlIllIll[Stats.lIIIIIIllIIIll[4]]), 1.0f));
            }
        }
        
        private static boolean lIllIlIIlIlIIll(final int lllllllllllllIlIlIIIIIlIIllIlIII) {
            return lllllllllllllIlIlIIIIIlIIllIlIII != 0;
        }
        
        protected void func_148209_a(final StatBase lllllllllllllIlIlIIIIIlIlllIllII, final int lllllllllllllIlIlIIIIIlIlllIlIll, final int lllllllllllllIlIlIIIIIlIlllIlIlI, final boolean lllllllllllllIlIlIIIIIlIllllIIII) {
            if (lIllIlIIlIlIIlI(lllllllllllllIlIlIIIIIlIlllIllII)) {
                final String lllllllllllllIlIlIIIIIlIlllIllll = lllllllllllllIlIlIIIIIlIlllIllII.format(GuiStats.this.field_146546_t.readStat(lllllllllllllIlIlIIIIIlIlllIllII));
                final GuiStats this$0 = GuiStats.this;
                final FontRenderer access$2 = GuiStats.this.fontRendererObj;
                final String llllllllllllIlllIlIlllIIIlIllIll = lllllllllllllIlIlIIIIIlIlllIllll;
                final int llllllllllllIlllIlIlllIIIlIllIlI = lllllllllllllIlIlIIIIIlIlllIlIll - GuiStats.this.fontRendererObj.getStringWidth(lllllllllllllIlIlIIIIIlIlllIllll);
                final int llllllllllllIlllIlIlllIIIlIlIlII = lllllllllllllIlIlIIIIIlIlllIlIlI + Stats.lIIIIIIllIIIll[15];
                int llllllllllllIlllIlIlllIIIlIlIIll;
                if (lIllIlIIlIlIIll(lllllllllllllIlIlIIIIIlIllllIIII ? 1 : 0)) {
                    llllllllllllIlllIlIlllIIIlIlIIll = Stats.lIIIIIIllIIIll[16];
                    "".length();
                    if ((0x27 ^ 0x23) <= 0) {
                        return;
                    }
                }
                else {
                    llllllllllllIlllIlIlllIIIlIlIIll = Stats.lIIIIIIllIIIll[17];
                }
                this$0.drawString(access$2, llllllllllllIlllIlIlllIIIlIllIll, llllllllllllIlllIlIlllIIIlIllIlI, llllllllllllIlllIlIlllIIIlIlIlII, llllllllllllIlllIlIlllIIIlIlIIll);
                "".length();
                if ((0x61 ^ 0x64) == 0x0) {
                    return;
                }
            }
            else {
                final String lllllllllllllIlIlIIIIIlIlllIlllI = Stats.lIIIIIIlIllIll[Stats.lIIIIIIllIIIll[5]];
                final GuiStats this$2 = GuiStats.this;
                final FontRenderer access$3 = GuiStats.this.fontRendererObj;
                final String llllllllllllIlllIlIlllIIIlIllIll2 = lllllllllllllIlIlIIIIIlIlllIlllI;
                final int llllllllllllIlllIlIlllIIIlIllIlI2 = lllllllllllllIlIlIIIIIlIlllIlIll - GuiStats.this.fontRendererObj.getStringWidth(lllllllllllllIlIlIIIIIlIlllIlllI);
                final int llllllllllllIlllIlIlllIIIlIlIlII2 = lllllllllllllIlIlIIIIIlIlllIlIlI + Stats.lIIIIIIllIIIll[15];
                int llllllllllllIlllIlIlllIIIlIlIIll2;
                if (lIllIlIIlIlIIll(lllllllllllllIlIlIIIIIlIllllIIII ? 1 : 0)) {
                    llllllllllllIlllIlIlllIIIlIlIIll2 = Stats.lIIIIIIllIIIll[16];
                    "".length();
                    if ((0x14 ^ 0x21 ^ (0x1 ^ 0x30)) == 0x0) {
                        return;
                    }
                }
                else {
                    llllllllllllIlllIlIlllIIIlIlIIll2 = Stats.lIIIIIIllIIIll[17];
                }
                this$2.drawString(access$3, llllllllllllIlllIlIlllIIIlIllIll2, llllllllllllIlllIlIlllIIIlIllIlI2, llllllllllllIlllIlIlllIIIlIlIlII2, llllllllllllIlllIlIlllIIIlIlIIll2);
            }
        }
        
        @Override
        protected boolean isSelected(final int lllllllllllllIlIlIIIIIllIIIllllI) {
            return Stats.lIIIIIIllIIIll[4] != 0;
        }
        
        private static boolean lIllIlIIlIIlllI(final int lllllllllllllIlIlIIIIIlIIlIlllll, final int lllllllllllllIlIlIIIIIlIIlIllllI) {
            return lllllllllllllIlIlIIIIIlIIlIlllll != lllllllllllllIlIlIIIIIlIIlIllllI;
        }
        
        @Override
        protected final int getSize() {
            return this.statsHolder.size();
        }
        
        private static boolean lIllIlIIlIIllIl(final int lllllllllllllIlIlIIIIIlIIlllllIl, final int lllllllllllllIlIlIIIIIlIIlllllII) {
            return lllllllllllllIlIlIIIIIlIIlllllIl == lllllllllllllIlIlIIIIIlIIlllllII;
        }
        
        private static void lIllIlIIlIIlIll() {
            (lIIIIIIllIIIll = new int[26])[0] = (0x92 ^ 0xB2);
            Stats.lIIIIIIllIIIll[1] = (0x59 ^ 0x19);
            Stats.lIIIIIIllIIIll[2] = (47 + 17 + 69 + 54 ^ 76 + 9 + 24 + 66);
            Stats.lIIIIIIllIIIll[3] = -" ".length();
            Stats.lIIIIIIllIIIll[4] = ((0xE4 ^ 0xC7) & ~(0x2B ^ 0x8));
            Stats.lIIIIIIllIIIll[5] = " ".length();
            Stats.lIIIIIIllIIIll[6] = (0x7B ^ 0x8);
            Stats.lIIIIIIllIIIll[7] = (35 + 126 - 87 + 110 ^ 41 + 34 + 6 + 89);
            Stats.lIIIIIIllIIIll[8] = 32 + 68 - 38 + 93 + (56 + 125 - 98 + 67) - (14 + 125 - 62 + 126) + (0xBB ^ 0x84);
            Stats.lIIIIIIllIIIll[9] = "  ".length();
            Stats.lIIIIIIllIIIll[10] = 64 + 86 - 117 + 105 + (0x40 ^ 0x7E) - (0x61 ^ 0x19) + (83 + 134 - 145 + 63);
            Stats.lIIIIIIllIIIll[11] = (0x36 ^ 0x79);
            Stats.lIIIIIIllIIIll[12] = (0xC4 ^ 0x9D) + (0xE2 ^ 0xAC) - (0x1B ^ 0x24) + (0x90 ^ 0x89);
            Stats.lIIIIIIllIIIll[13] = (0xC0 ^ 0x9C) + (0xA ^ 0x61) - (0x9E ^ 0xA0) + (0x4D ^ 0x67);
            Stats.lIIIIIIllIIIll[14] = (0xA4 ^ 0x80);
            Stats.lIIIIIIllIIIll[15] = (0x77 ^ 0x72);
            Stats.lIIIIIIllIIIll[16] = (-" ".length() & (-1 & 0xFFFFFF));
            Stats.lIIIIIIllIIIll[17] = (-(0xFFFFFF7D & 0x49CF) & (0xFFFFFFFD & 0x90D9DE));
            Stats.lIIIIIIllIIIll[18] = (0x3E ^ 0x1B ^ (0x5 ^ 0x7C));
            Stats.lIIIIIIllIIIll[19] = (0xD1 ^ 0x91 ^ (0x4B ^ 0x1B));
            Stats.lIIIIIIllIIIll[20] = (0x70 ^ 0x20 ^ (0x2E ^ 0x56));
            Stats.lIIIIIIllIIIll[21] = (0x69 ^ 0x65);
            Stats.lIIIIIIllIIIll[22] = "   ".length();
            Stats.lIIIIIIllIIIll[23] = (0x43 ^ 0x4B);
            Stats.lIIIIIIllIIIll[24] = -(-(0xFFFFBD7F & 0x7EAF) & (-1 & 0x40003C2E));
            Stats.lIIIIIIllIIIll[25] = (130 + 154 - 231 + 121 ^ 147 + 96 - 98 + 25);
        }
        
        private static boolean lIllIlIIlIlIlII(final int lllllllllllllIlIlIIIIIlIIlllIIIl, final int lllllllllllllIlIlIIIIIlIIlllIIII) {
            return lllllllllllllIlIlIIIIIlIIlllIIIl <= lllllllllllllIlIlIIIIIlIIlllIIII;
        }
        
        private static boolean lIllIlIIlIlIIIl(final int lllllllllllllIlIlIIIIIlIIllIIlII) {
            return lllllllllllllIlIlIIIIIlIIllIIlII >= 0;
        }
        
        private static void lIllIlIIIlIIIlI() {
            (lIIIIIIlIllIll = new String[Stats.lIIIIIIllIIIll[25]])[Stats.lIIIIIIllIIIll[4]] = lIllIlIIIlIIIII("7vgR18WsYm+wWnt/eK1r3nADxd/JLhOV", "txLOX");
            Stats.lIIIIIIlIllIll[Stats.lIIIIIIllIIIll[5]] = lIllIlIIIlIIIII("lEryFjfUrQA=", "Nehql");
            Stats.lIIIIIIlIllIll[Stats.lIIIIIIllIIIll[9]] = lIllIlIIIlIIIIl("", "RHHTK");
            Stats.lIIIIIIlIllIll[Stats.lIIIIIIllIIIll[22]] = lIllIlIIIlIIIIl("ZhkULyI=", "HwuBG");
        }
    }
    
    class StatsGeneral extends GuiSlot
    {
        private static final /* synthetic */ int[] llllllIllIIll;
        
        @Override
        protected boolean isSelected(final int lllllllllllllIlIlIlIIlllIllIllIl) {
            return StatsGeneral.llllllIllIIll[3] != 0;
        }
        
        @Override
        protected int getSize() {
            return StatList.generalStats.size();
        }
        
        static {
            lIllIIIIIlIllII();
        }
        
        private static boolean lIllIIIIIlIllIl(final int lllllllllllllIlIlIlIIlllIlIlIIII) {
            return lllllllllllllIlIlIlIIlllIlIlIIII == 0;
        }
        
        public StatsGeneral(final Minecraft lllllllllllllIlIlIlIIlllIllllIII) {
            super(lllllllllllllIlIlIlIIlllIllllIII, GuiStats.this.width, GuiStats.this.height, StatsGeneral.llllllIllIIll[0], GuiStats.this.height - StatsGeneral.llllllIllIIll[1], StatsGeneral.llllllIllIIll[2]);
            this.setShowSelectionBox((boolean)(StatsGeneral.llllllIllIIll[3] != 0));
        }
        
        @Override
        protected void drawSlot(final int lllllllllllllIlIlIlIIlllIlIlllll, final int lllllllllllllIlIlIlIIlllIlIlIlIl, final int lllllllllllllIlIlIlIIlllIlIlllIl, final int lllllllllllllIlIlIlIIlllIlIlllII, final int lllllllllllllIlIlIlIIlllIlIllIll, final int lllllllllllllIlIlIlIIlllIlIllIlI) {
            final StatBase lllllllllllllIlIlIlIIlllIlIllIIl = StatList.generalStats.get(lllllllllllllIlIlIlIIlllIlIlllll);
            final GuiStats this$0 = GuiStats.this;
            final FontRenderer access$2 = GuiStats.this.fontRendererObj;
            final String unformattedText = lllllllllllllIlIlIlIIlllIlIllIIl.getStatName().getUnformattedText();
            final int llllllllllllIlllIlIlllIIIlIllIlI = lllllllllllllIlIlIlIIlllIlIlIlIl + StatsGeneral.llllllIllIIll[4];
            final int llllllllllllIlllIlIlllIIIlIlIlII = lllllllllllllIlIlIlIIlllIlIlllIl + StatsGeneral.llllllIllIIll[5];
            int llllllllllllIlllIlIlllIIIlIlIIll;
            if (lIllIIIIIlIllIl(lllllllllllllIlIlIlIIlllIlIlllll % StatsGeneral.llllllIllIIll[4])) {
                llllllllllllIlllIlIlllIIIlIlIIll = StatsGeneral.llllllIllIIll[6];
                "".length();
                if ("   ".length() == " ".length()) {
                    return;
                }
            }
            else {
                llllllllllllIlllIlIlllIIIlIlIIll = StatsGeneral.llllllIllIIll[7];
            }
            this$0.drawString(access$2, unformattedText, llllllllllllIlllIlIlllIIIlIllIlI, llllllllllllIlllIlIlllIIIlIlIlII, llllllllllllIlllIlIlllIIIlIlIIll);
            final String lllllllllllllIlIlIlIIlllIlIllIII = lllllllllllllIlIlIlIIlllIlIllIIl.format(GuiStats.this.field_146546_t.readStat(lllllllllllllIlIlIlIIlllIlIllIIl));
            final GuiStats this$2 = GuiStats.this;
            final FontRenderer access$3 = GuiStats.this.fontRendererObj;
            final String llllllllllllIlllIlIlllIIIlIllIll = lllllllllllllIlIlIlIIlllIlIllIII;
            final int llllllllllllIlllIlIlllIIIlIllIlI2 = lllllllllllllIlIlIlIIlllIlIlIlIl + StatsGeneral.llllllIllIIll[4] + StatsGeneral.llllllIllIIll[8] - GuiStats.this.fontRendererObj.getStringWidth(lllllllllllllIlIlIlIIlllIlIllIII);
            final int llllllllllllIlllIlIlllIIIlIlIlII2 = lllllllllllllIlIlIlIIlllIlIlllIl + StatsGeneral.llllllIllIIll[5];
            int llllllllllllIlllIlIlllIIIlIlIIll2;
            if (lIllIIIIIlIllIl(lllllllllllllIlIlIlIIlllIlIlllll % StatsGeneral.llllllIllIIll[4])) {
                llllllllllllIlllIlIlllIIIlIlIIll2 = StatsGeneral.llllllIllIIll[6];
                "".length();
                if ("  ".length() < -" ".length()) {
                    return;
                }
            }
            else {
                llllllllllllIlllIlIlllIIIlIlIIll2 = StatsGeneral.llllllIllIIll[7];
            }
            this$2.drawString(access$3, llllllllllllIlllIlIlllIIIlIllIll, llllllllllllIlllIlIlllIIIlIllIlI2, llllllllllllIlllIlIlllIIIlIlIlII2, llllllllllllIlllIlIlllIIIlIlIIll2);
        }
        
        @Override
        protected int getContentHeight() {
            return this.getSize() * StatsGeneral.llllllIllIIll[2];
        }
        
        @Override
        protected void drawBackground() {
            GuiStats.this.drawDefaultBackground();
        }
        
        private static void lIllIIIIIlIllII() {
            (llllllIllIIll = new int[9])[0] = (0xA0 ^ 0x80);
            StatsGeneral.llllllIllIIll[1] = (0xC0 ^ 0x80);
            StatsGeneral.llllllIllIIll[2] = (0x18 ^ 0x12);
            StatsGeneral.llllllIllIIll[3] = ((0x9D ^ 0x8A ^ (0xFB ^ 0xC4)) & (0x5C ^ 0x3E ^ (0x47 ^ 0xD) ^ -" ".length()));
            StatsGeneral.llllllIllIIll[4] = "  ".length();
            StatsGeneral.llllllIllIIll[5] = " ".length();
            StatsGeneral.llllllIllIIll[6] = (-" ".length() & (-1 & 0xFFFFFF));
            StatsGeneral.llllllIllIIll[7] = (-(0xFFFFE76B & 0x3FD7) & (0xFFFFFFF3 & 0x90B7DE));
            StatsGeneral.llllllIllIIll[8] = (0x42 ^ 0x22) + (82 + 186 - 213 + 143) - (26 + 77 + 80 + 48) + (83 + 84 - 95 + 78);
        }
        
        @Override
        protected void elementClicked(final int lllllllllllllIlIlIlIIlllIlllIIlI, final boolean lllllllllllllIlIlIlIIlllIlllIIIl, final int lllllllllllllIlIlIlIIlllIlllIIII, final int lllllllllllllIlIlIlIIlllIllIllll) {
        }
    }
    
    class StatsMobsList extends GuiSlot
    {
        private final /* synthetic */ List<EntityList.EntityEggInfo> field_148222_l;
        private static final /* synthetic */ String[] lllIIllIIIIIll;
        private static final /* synthetic */ int[] lllIIllIIIIllI;
        
        @Override
        protected void elementClicked(final int llllllllllllIlIllllIIIllIlIIllll, final boolean llllllllllllIlIllllIIIllIlIIlllI, final int llllllllllllIlIllllIIIllIlIIllIl, final int llllllllllllIlIllllIIIllIlIIllII) {
        }
        
        private static String lIlIIIIIIIIIlIll(final String llllllllllllIlIllllIIIllIIIllIll, final String llllllllllllIlIllllIIIllIIIllIII) {
            try {
                final SecretKeySpec llllllllllllIlIllllIIIllIIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIIIllIIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlIllllIIIllIIIlllIl = Cipher.getInstance("Blowfish");
                llllllllllllIlIllllIIIllIIIlllIl.init(StatsMobsList.lllIIllIIIIllI[5], llllllllllllIlIllllIIIllIIIllllI);
                return new String(llllllllllllIlIllllIIIllIIIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIIIllIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIllllIIIllIIIlllII) {
                llllllllllllIlIllllIIIllIIIlllII.printStackTrace();
                return null;
            }
        }
        
        static {
            lIlIIIIIIIIlIIIl();
            lIlIIIIIIIIIllIl();
        }
        
        private static boolean lIlIIIIIIIIlIlII(final int llllllllllllIlIllllIIIlIlllIlIll) {
            return llllllllllllIlIllllIIIlIlllIlIll == 0;
        }
        
        @Override
        protected int getContentHeight() {
            return this.getSize() * GuiStats.this.fontRendererObj.FONT_HEIGHT * StatsMobsList.lllIIllIIIIllI[2];
        }
        
        @Override
        protected void drawSlot(final int llllllllllllIlIllllIIIllIIlIlIll, final int llllllllllllIlIllllIIIllIIlIlIlI, final int llllllllllllIlIllllIIIllIIlIlIIl, final int llllllllllllIlIllllIIIllIIllIlIl, final int llllllllllllIlIllllIIIllIIllIlII, final int llllllllllllIlIllllIIIllIIllIIll) {
            final EntityList.EntityEggInfo llllllllllllIlIllllIIIllIIllIIlI = this.field_148222_l.get(llllllllllllIlIllllIIIllIIlIlIll);
            final String llllllllllllIlIllllIIIllIIllIIIl = I18n.format(String.valueOf(new StringBuilder(StatsMobsList.lllIIllIIIIIll[StatsMobsList.lllIIllIIIIllI[3]]).append(EntityList.getStringFromID(llllllllllllIlIllllIIIllIIllIIlI.spawnedID)).append(StatsMobsList.lllIIllIIIIIll[StatsMobsList.lllIIllIIIIllI[4]])), new Object[StatsMobsList.lllIIllIIIIllI[3]]);
            final int llllllllllllIlIllllIIIllIIllIIII = GuiStats.this.field_146546_t.readStat(llllllllllllIlIllllIIIllIIllIIlI.field_151512_d);
            final int llllllllllllIlIllllIIIllIIlIllll = GuiStats.this.field_146546_t.readStat(llllllllllllIlIllllIIIllIIllIIlI.field_151513_e);
            final String llllllllllllIlIllIlIIIIIllllIIll = StatsMobsList.lllIIllIIIIIll[StatsMobsList.lllIIllIIIIllI[5]];
            final Object[] llllllllllllIlIllIlIIIIIllllIIII = new Object[StatsMobsList.lllIIllIIIIllI[5]];
            llllllllllllIlIllIlIIIIIllllIIII[StatsMobsList.lllIIllIIIIllI[3]] = llllllllllllIlIllllIIIllIIllIIII;
            llllllllllllIlIllIlIIIIIllllIIII[StatsMobsList.lllIIllIIIIllI[4]] = llllllllllllIlIllllIIIllIIllIIIl;
            String llllllllllllIlIllllIIIllIIlIlllI = I18n.format(llllllllllllIlIllIlIIIIIllllIIll, llllllllllllIlIllIlIIIIIllllIIII);
            final String llllllllllllIlIllIlIIIIIllllIIll2 = StatsMobsList.lllIIllIIIIIll[StatsMobsList.lllIIllIIIIllI[6]];
            final Object[] llllllllllllIlIllIlIIIIIllllIIII2 = new Object[StatsMobsList.lllIIllIIIIllI[5]];
            llllllllllllIlIllIlIIIIIllllIIII2[StatsMobsList.lllIIllIIIIllI[3]] = llllllllllllIlIllllIIIllIIllIIIl;
            llllllllllllIlIllIlIIIIIllllIIII2[StatsMobsList.lllIIllIIIIllI[4]] = llllllllllllIlIllllIIIllIIlIllll;
            String llllllllllllIlIllllIIIllIIlIllIl = I18n.format(llllllllllllIlIllIlIIIIIllllIIll2, llllllllllllIlIllIlIIIIIllllIIII2);
            if (lIlIIIIIIIIlIlII(llllllllllllIlIllllIIIllIIllIIII)) {
                final String llllllllllllIlIllIlIIIIIllllIIll3 = StatsMobsList.lllIIllIIIIIll[StatsMobsList.lllIIllIIIIllI[2]];
                final Object[] llllllllllllIlIllIlIIIIIllllIIII3 = new Object[StatsMobsList.lllIIllIIIIllI[4]];
                llllllllllllIlIllIlIIIIIllllIIII3[StatsMobsList.lllIIllIIIIllI[3]] = llllllllllllIlIllllIIIllIIllIIIl;
                llllllllllllIlIllllIIIllIIlIlllI = I18n.format(llllllllllllIlIllIlIIIIIllllIIll3, llllllllllllIlIllIlIIIIIllllIIII3);
            }
            if (lIlIIIIIIIIlIlII(llllllllllllIlIllllIIIllIIlIllll)) {
                final String llllllllllllIlIllIlIIIIIllllIIll4 = StatsMobsList.lllIIllIIIIIll[StatsMobsList.lllIIllIIIIllI[7]];
                final Object[] llllllllllllIlIllIlIIIIIllllIIII4 = new Object[StatsMobsList.lllIIllIIIIllI[4]];
                llllllllllllIlIllIlIIIIIllllIIII4[StatsMobsList.lllIIllIIIIllI[3]] = llllllllllllIlIllllIIIllIIllIIIl;
                llllllllllllIlIllllIIIllIIlIllIl = I18n.format(llllllllllllIlIllIlIIIIIllllIIll4, llllllllllllIlIllIlIIIIIllllIIII4);
            }
            GuiStats.this.drawString(GuiStats.this.fontRendererObj, llllllllllllIlIllllIIIllIIllIIIl, llllllllllllIlIllllIIIllIIlIlIlI + StatsMobsList.lllIIllIIIIllI[5] - StatsMobsList.lllIIllIIIIllI[8], llllllllllllIlIllllIIIllIIlIlIIl + StatsMobsList.lllIIllIIIIllI[4], StatsMobsList.lllIIllIIIIllI[9]);
            final GuiStats this$0 = GuiStats.this;
            final FontRenderer access$2 = GuiStats.this.fontRendererObj;
            final String llllllllllllIlllIlIlllIIIlIllIll = llllllllllllIlIllllIIIllIIlIlllI;
            final int llllllllllllIlllIlIlllIIIlIllIlI = llllllllllllIlIllllIIIllIIlIlIlI + StatsMobsList.lllIIllIIIIllI[5];
            final int llllllllllllIlllIlIlllIIIlIlIlII = llllllllllllIlIllllIIIllIIlIlIIl + StatsMobsList.lllIIllIIIIllI[4] + GuiStats.this.fontRendererObj.FONT_HEIGHT;
            int llllllllllllIlllIlIlllIIIlIlIIll;
            if (lIlIIIIIIIIlIlII(llllllllllllIlIllllIIIllIIllIIII)) {
                llllllllllllIlllIlIlllIIIlIlIIll = StatsMobsList.lllIIllIIIIllI[10];
                "".length();
                if (-" ".length() < -" ".length()) {
                    return;
                }
            }
            else {
                llllllllllllIlllIlIlllIIIlIlIIll = StatsMobsList.lllIIllIIIIllI[11];
            }
            this$0.drawString(access$2, llllllllllllIlllIlIlllIIIlIllIll, llllllllllllIlllIlIlllIIIlIllIlI, llllllllllllIlllIlIlllIIIlIlIlII, llllllllllllIlllIlIlllIIIlIlIIll);
            final GuiStats this$2 = GuiStats.this;
            final FontRenderer access$3 = GuiStats.this.fontRendererObj;
            final String llllllllllllIlllIlIlllIIIlIllIll2 = llllllllllllIlIllllIIIllIIlIllIl;
            final int llllllllllllIlllIlIlllIIIlIllIlI2 = llllllllllllIlIllllIIIllIIlIlIlI + StatsMobsList.lllIIllIIIIllI[5];
            final int llllllllllllIlllIlIlllIIIlIlIlII2 = llllllllllllIlIllllIIIllIIlIlIIl + StatsMobsList.lllIIllIIIIllI[4] + GuiStats.this.fontRendererObj.FONT_HEIGHT * StatsMobsList.lllIIllIIIIllI[5];
            int llllllllllllIlllIlIlllIIIlIlIIll2;
            if (lIlIIIIIIIIlIlII(llllllllllllIlIllllIIIllIIlIllll)) {
                llllllllllllIlllIlIlllIIIlIlIIll2 = StatsMobsList.lllIIllIIIIllI[10];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                llllllllllllIlllIlIlllIIIlIlIIll2 = StatsMobsList.lllIIllIIIIllI[11];
            }
            this$2.drawString(access$3, llllllllllllIlllIlIlllIIIlIllIll2, llllllllllllIlllIlIlllIIIlIllIlI2, llllllllllllIlllIlIlllIIIlIlIlII2, llllllllllllIlllIlIlllIIIlIlIIll2);
        }
        
        private static void lIlIIIIIIIIlIIIl() {
            (lllIIllIIIIllI = new int[14])[0] = (0x41 ^ 0x61);
            StatsMobsList.lllIIllIIIIllI[1] = (0x76 ^ 0x36);
            StatsMobsList.lllIIllIIIIllI[2] = (0xCE ^ 0x88 ^ (0xB ^ 0x49));
            StatsMobsList.lllIIllIIIIllI[3] = ((0xB ^ 0x14) & ~(0x62 ^ 0x7D));
            StatsMobsList.lllIIllIIIIllI[4] = " ".length();
            StatsMobsList.lllIIllIIIIllI[5] = "  ".length();
            StatsMobsList.lllIIllIIIIllI[6] = "   ".length();
            StatsMobsList.lllIIllIIIIllI[7] = (0x8D ^ 0x97 ^ (0xB0 ^ 0xAF));
            StatsMobsList.lllIIllIIIIllI[8] = (0xA1 ^ 0xAB);
            StatsMobsList.lllIIllIIIIllI[9] = (-1 & 0xFFFFFF);
            StatsMobsList.lllIIllIIIIllI[10] = (-(0xFFFFE8EB & 0x1F96) & (0xFFFFE8FB & 0x607FE5));
            StatsMobsList.lllIIllIIIIllI[11] = (-(0xFFFFF6FF & 0xF6A) & (0xFFFF9EF9 & 0x90F7FF));
            StatsMobsList.lllIIllIIIIllI[12] = (0x2F ^ 0x29);
            StatsMobsList.lllIIllIIIIllI[13] = (0x20 ^ 0x28);
        }
        
        public StatsMobsList(final Minecraft llllllllllllIlIllllIIIllIlIllIlI) {
            super(llllllllllllIlIllllIIIllIlIllIlI, GuiStats.this.width, GuiStats.this.height, StatsMobsList.lllIIllIIIIllI[0], GuiStats.this.height - StatsMobsList.lllIIllIIIIllI[1], GuiStats.this.fontRendererObj.FONT_HEIGHT * StatsMobsList.lllIIllIIIIllI[2]);
            this.field_148222_l = (List<EntityList.EntityEggInfo>)Lists.newArrayList();
            this.setShowSelectionBox((boolean)(StatsMobsList.lllIIllIIIIllI[3] != 0));
            final short llllllllllllIlIllllIIIllIlIlIlII = (short)EntityList.entityEggs.values().iterator();
            "".length();
            if ("   ".length() < 0) {
                throw null;
            }
            while (!lIlIIIIIIIIlIlII(((Iterator)llllllllllllIlIllllIIIllIlIlIlII).hasNext() ? 1 : 0)) {
                final EntityList.EntityEggInfo llllllllllllIlIllllIIIllIlIllIIl = ((Iterator<EntityList.EntityEggInfo>)llllllllllllIlIllllIIIllIlIlIlII).next();
                if (!lIlIIIIIIIIlIIlI(GuiStats.this.field_146546_t.readStat(llllllllllllIlIllllIIIllIlIllIIl.field_151512_d)) || lIlIIIIIIIIlIIll(GuiStats.this.field_146546_t.readStat(llllllllllllIlIllllIIIllIlIllIIl.field_151513_e))) {
                    this.field_148222_l.add(llllllllllllIlIllllIIIllIlIllIIl);
                    "".length();
                }
            }
        }
        
        private static void lIlIIIIIIIIIllIl() {
            (lllIIllIIIIIll = new String[StatsMobsList.lllIIllIIIIllI[12]])[StatsMobsList.lllIIllIIIIllI[3]] = lIlIIIIIIIIIlIlI("AyU8PQ0fZQ==", "fKHTy");
            StatsMobsList.lllIIllIIIIIll[StatsMobsList.lllIIllIIIIllI[4]] = lIlIIIIIIIIIlIll("GsSpt321vSg=", "AnDtm");
            StatsMobsList.lllIIllIIIIIll[StatsMobsList.lllIIllIIIIllI[5]] = lIlIIIIIIIIIlIlI("OTUmDl8vLzMTBTMKLhYdOQ==", "JAGzq");
            StatsMobsList.lllIIllIIIIIll[StatsMobsList.lllIIllIIIIllI[6]] = lIlIIIIIIIIIllII("EcwYRFDJu8T3sEVVbkqX/QWdBlQg9L1D", "qWVai");
            StatsMobsList.lllIIllIIIIIll[StatsMobsList.lllIIllIIIIllI[2]] = lIlIIIIIIIIIlIll("Vg8i/sz8PScQNDeXtMBy89sdEp6HRFfP", "jaIiW");
            StatsMobsList.lllIIllIIIIIll[StatsMobsList.lllIIllIIIIllI[7]] = lIlIIIIIIIIIlIlI("GAErP2EOGz4iOxI+IycjDhEIMmEFGiQu", "kuJKO");
        }
        
        @Override
        protected void drawBackground() {
            GuiStats.this.drawDefaultBackground();
        }
        
        private static boolean lIlIIIIIIIIlIIll(final int llllllllllllIlIllllIIIlIlllIIlll) {
            return llllllllllllIlIllllIIIlIlllIIlll > 0;
        }
        
        @Override
        protected int getSize() {
            return this.field_148222_l.size();
        }
        
        private static String lIlIIIIIIIIIllII(final String llllllllllllIlIllllIIIllIIIIlllI, final String llllllllllllIlIllllIIIllIIIIlIll) {
            try {
                final SecretKeySpec llllllllllllIlIllllIIIllIIIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIIIllIIIIlIll.getBytes(StandardCharsets.UTF_8)), StatsMobsList.lllIIllIIIIllI[13]), "DES");
                final Cipher llllllllllllIlIllllIIIllIIIlIIII = Cipher.getInstance("DES");
                llllllllllllIlIllllIIIllIIIlIIII.init(StatsMobsList.lllIIllIIIIllI[5], llllllllllllIlIllllIIIllIIIlIIIl);
                return new String(llllllllllllIlIllllIIIllIIIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIIIllIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIllllIIIllIIIIllll) {
                llllllllllllIlIllllIIIllIIIIllll.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIlIIIIIIIIlIlIl(final int llllllllllllIlIllllIIIlIlllIlllI, final int llllllllllllIlIllllIIIlIlllIllIl) {
            return llllllllllllIlIllllIIIlIlllIlllI < llllllllllllIlIllllIIIlIlllIllIl;
        }
        
        private static String lIlIIIIIIIIIlIlI(String llllllllllllIlIllllIIIlIlllllIIl, final String llllllllllllIlIllllIIIlIllllllIl) {
            llllllllllllIlIllllIIIlIlllllIIl = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllllIIIlIlllllIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlIllllIIIlIllllllII = new StringBuilder();
            final char[] llllllllllllIlIllllIIIlIlllllIll = llllllllllllIlIllllIIIlIllllllIl.toCharArray();
            int llllllllllllIlIllllIIIlIlllllIlI = StatsMobsList.lllIIllIIIIllI[3];
            final Exception llllllllllllIlIllllIIIlIllllIlII = (Object)((String)llllllllllllIlIllllIIIlIlllllIIl).toCharArray();
            final boolean llllllllllllIlIllllIIIlIllllIIll = llllllllllllIlIllllIIIlIllllIlII.length != 0;
            short llllllllllllIlIllllIIIlIllllIIlI = (short)StatsMobsList.lllIIllIIIIllI[3];
            while (lIlIIIIIIIIlIlIl(llllllllllllIlIllllIIIlIllllIIlI, llllllllllllIlIllllIIIlIllllIIll ? 1 : 0)) {
                final char llllllllllllIlIllllIIIlIllllllll = llllllllllllIlIllllIIIlIllllIlII[llllllllllllIlIllllIIIlIllllIIlI];
                llllllllllllIlIllllIIIlIllllllII.append((char)(llllllllllllIlIllllIIIlIllllllll ^ llllllllllllIlIllllIIIlIlllllIll[llllllllllllIlIllllIIIlIlllllIlI % llllllllllllIlIllllIIIlIlllllIll.length]));
                "".length();
                ++llllllllllllIlIllllIIIlIlllllIlI;
                ++llllllllllllIlIllllIIIlIllllIIlI;
                "".length();
                if ((0x6A ^ 0x6E) <= " ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlIllllIIIlIllllllII);
        }
        
        private static boolean lIlIIIIIIIIlIIlI(final int llllllllllllIlIllllIIIlIlllIlIIl) {
            return llllllllllllIlIllllIIIlIlllIlIIl <= 0;
        }
        
        @Override
        protected boolean isSelected(final int llllllllllllIlIllllIIIllIlIIlIlI) {
            return StatsMobsList.lllIIllIIIIllI[3] != 0;
        }
    }
    
    class StatsItem extends Stats
    {
        private static final /* synthetic */ int[] lllIllIIIllIlI;
        private static final /* synthetic */ String[] lllIllIIIllIIl;
        
        public StatsItem(final Minecraft llllllllllllIlIllIIlllIIIIlIIlIl) {
            super(llllllllllllIlIllIIlllIIIIlIIlIl);
            this.statsHolder = (List<StatCrafting>)Lists.newArrayList();
            final boolean llllllllllllIlIllIIlllIIIIlIIIll = (boolean)StatList.itemStats.iterator();
            "".length();
            if ((0x37 ^ 0x33) < -" ".length()) {
                throw null;
            }
            while (!lIlIIlIIIIlllIlI(((Iterator)llllllllllllIlIllIIlllIIIIlIIIll).hasNext() ? 1 : 0)) {
                final StatCrafting llllllllllllIlIllIIlllIIIIlIlIlI = ((Iterator<StatCrafting>)llllllllllllIlIllIIlllIIIIlIIIll).next();
                boolean llllllllllllIlIllIIlllIIIIlIlIIl = StatsItem.lllIllIIIllIlI[0] != 0;
                final int llllllllllllIlIllIIlllIIIIlIlIII = Item.getIdFromItem(llllllllllllIlIllIIlllIIIIlIlIlI.func_150959_a());
                if (lIlIIlIIIIllIlll(GuiStats.this.field_146546_t.readStat(llllllllllllIlIllIIlllIIIIlIlIlI))) {
                    llllllllllllIlIllIIlllIIIIlIlIIl = (StatsItem.lllIllIIIllIlI[1] != 0);
                    "".length();
                    if (-(0x79 ^ 0x7C) >= 0) {
                        throw null;
                    }
                }
                else if (lIlIIlIIIIlllIII(StatList.objectBreakStats[llllllllllllIlIllIIlllIIIIlIlIII]) && lIlIIlIIIIllIlll(GuiStats.this.field_146546_t.readStat(StatList.objectBreakStats[llllllllllllIlIllIIlllIIIIlIlIII]))) {
                    llllllllllllIlIllIIlllIIIIlIlIIl = (StatsItem.lllIllIIIllIlI[1] != 0);
                    "".length();
                    if (null != null) {
                        throw null;
                    }
                }
                else if (lIlIIlIIIIlllIII(StatList.objectCraftStats[llllllllllllIlIllIIlllIIIIlIlIII]) && lIlIIlIIIIllIlll(GuiStats.this.field_146546_t.readStat(StatList.objectCraftStats[llllllllllllIlIllIIlllIIIIlIlIII]))) {
                    llllllllllllIlIllIIlllIIIIlIlIIl = (StatsItem.lllIllIIIllIlI[1] != 0);
                }
                if (lIlIIlIIIIlllIIl(llllllllllllIlIllIIlllIIIIlIlIIl ? 1 : 0)) {
                    this.statsHolder.add(llllllllllllIlIllIIlllIIIIlIlIlI);
                    "".length();
                }
            }
            this.statSorter = new Comparator<StatCrafting>() {
                private static final /* synthetic */ int[] llIIlIllllllIl;
                
                @Override
                public int compare(final StatCrafting llllllllllllIlllIIIIlllIIIIIIlII, final StatCrafting llllllllllllIlllIIIIlllIIIIIllII) {
                    final int llllllllllllIlllIIIIlllIIIIIlIll = Item.getIdFromItem(llllllllllllIlllIIIIlllIIIIIIlII.func_150959_a());
                    final int llllllllllllIlllIIIIlllIIIIIlIlI = Item.getIdFromItem(llllllllllllIlllIIIIlllIIIIIllII.func_150959_a());
                    StatBase llllllllllllIlllIIIIlllIIIIIlIIl = null;
                    StatBase llllllllllllIlllIIIIlllIIIIIlIII = null;
                    if (lIIIlllIIIlIIIIl(StatsItem.this.field_148217_o)) {
                        llllllllllllIlllIIIIlllIIIIIlIIl = StatList.objectBreakStats[llllllllllllIlllIIIIlllIIIIIlIll];
                        llllllllllllIlllIIIIlllIIIIIlIII = StatList.objectBreakStats[llllllllllllIlllIIIIlllIIIIIlIlI];
                        "".length();
                        if (((0x53 ^ 0x73 ^ (0x4A ^ 0x3A)) & (50 + 80 - 26 + 150 ^ 58 + 150 - 69 + 35 ^ -" ".length())) < ((14 + 72 + 32 + 12 ^ 19 + 151 - 169 + 196) & (0x8 ^ 0x4 ^ (0x2F ^ 0x64) ^ -" ".length()))) {
                            return (0x4B ^ 0x64 ^ (0x8F ^ 0xC0)) & (0xD2 ^ 0xC4 ^ (0xEE ^ 0x98) ^ -" ".length());
                        }
                    }
                    else if (lIIIlllIIIlIIIlI(StatsItem.this.field_148217_o, GuiStats$StatsItem$1.llIIlIllllllIl[0])) {
                        llllllllllllIlllIIIIlllIIIIIlIIl = StatList.objectCraftStats[llllllllllllIlllIIIIlllIIIIIlIll];
                        llllllllllllIlllIIIIlllIIIIIlIII = StatList.objectCraftStats[llllllllllllIlllIIIIlllIIIIIlIlI];
                        "".length();
                        if ("  ".length() > (0x51 ^ 0x62 ^ (0xA6 ^ 0x91))) {
                            return (0x29 ^ 0x57 ^ (0x43 ^ 0x6)) & (0x60 ^ 0x64 ^ (0x67 ^ 0x58) ^ -" ".length());
                        }
                    }
                    else if (lIIIlllIIIlIIIlI(StatsItem.this.field_148217_o, GuiStats$StatsItem$1.llIIlIllllllIl[1])) {
                        llllllllllllIlllIIIIlllIIIIIlIIl = StatList.objectUseStats[llllllllllllIlllIIIIlllIIIIIlIll];
                        llllllllllllIlllIIIIlllIIIIIlIII = StatList.objectUseStats[llllllllllllIlllIIIIlllIIIIIlIlI];
                    }
                    if (!lIIIlllIIIlIIIll(llllllllllllIlllIIIIlllIIIIIlIIl) || lIIIlllIIIlIIlII(llllllllllllIlllIIIIlllIIIIIlIII)) {
                        if (lIIIlllIIIlIIIll(llllllllllllIlllIIIIlllIIIIIlIIl)) {
                            return GuiStats$StatsItem$1.llIIlIllllllIl[0];
                        }
                        if (lIIIlllIIIlIIIll(llllllllllllIlllIIIIlllIIIIIlIII)) {
                            return GuiStats$StatsItem$1.llIIlIllllllIl[2];
                        }
                        final int llllllllllllIlllIIIIlllIIIIIIlll = GuiStats.this.field_146546_t.readStat(llllllllllllIlllIIIIlllIIIIIlIIl);
                        final int llllllllllllIlllIIIIlllIIIIIIllI = GuiStats.this.field_146546_t.readStat(llllllllllllIlllIIIIlllIIIIIlIII);
                        if (lIIIlllIIIlIIlIl(llllllllllllIlllIIIIlllIIIIIIlll, llllllllllllIlllIIIIlllIIIIIIllI)) {
                            return (llllllllllllIlllIIIIlllIIIIIIlll - llllllllllllIlllIIIIlllIIIIIIllI) * StatsItem.this.field_148215_p;
                        }
                    }
                    return llllllllllllIlllIIIIlllIIIIIlIll - llllllllllllIlllIIIIlllIIIIIlIlI;
                }
                
                private static void lIIIlllIIIlIIIII() {
                    (llIIlIllllllIl = new int[3])[0] = " ".length();
                    GuiStats$StatsItem$1.llIIlIllllllIl[1] = "  ".length();
                    GuiStats$StatsItem$1.llIIlIllllllIl[2] = -" ".length();
                }
                
                private static boolean lIIIlllIIIlIIlIl(final int llllllllllllIlllIIIIllIllllIlIlI, final int llllllllllllIlllIIIIllIllllIlIIl) {
                    return llllllllllllIlllIIIIllIllllIlIlI != llllllllllllIlllIIIIllIllllIlIIl;
                }
                
                static {
                    lIIIlllIIIlIIIII();
                }
                
                private static boolean lIIIlllIIIlIIlII(final Object llllllllllllIlllIIIIllIlllllIIIl) {
                    return llllllllllllIlllIIIIllIlllllIIIl != null;
                }
                
                private static boolean lIIIlllIIIlIIIIl(final int llllllllllllIlllIIIIllIllllIllIl) {
                    return llllllllllllIlllIIIIllIllllIllIl == 0;
                }
                
                private static boolean lIIIlllIIIlIIIll(final Object llllllllllllIlllIIIIllIllllIllll) {
                    return llllllllllllIlllIIIIllIllllIllll == null;
                }
                
                private static boolean lIIIlllIIIlIIIlI(final int llllllllllllIlllIIIIllIlllllIlII, final int llllllllllllIlllIIIIllIlllllIIll) {
                    return llllllllllllIlllIIIIllIlllllIlII == llllllllllllIlllIIIIllIlllllIIll;
                }
            };
        }
        
        private static boolean lIlIIlIIIIlllIII(final Object llllllllllllIlIllIIllIllllIlIlll) {
            return llllllllllllIlIllIIllIllllIlIlll != null;
        }
        
        private static String lIlIIlIIIIllIIll(final String llllllllllllIlIllIIllIlllllIIIlI, final String llllllllllllIlIllIIllIllllIlllll) {
            try {
                final SecretKeySpec llllllllllllIlIllIIllIlllllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIllIllllIlllll.getBytes(StandardCharsets.UTF_8)), StatsItem.lllIllIIIllIlI[11]), "DES");
                final Cipher llllllllllllIlIllIIllIlllllIIlII = Cipher.getInstance("DES");
                llllllllllllIlIllIIllIlllllIIlII.init(StatsItem.lllIllIIIllIlI[6], llllllllllllIlIllIIllIlllllIIlIl);
                return new String(llllllllllllIlIllIIllIlllllIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIllIlllllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIllIIllIlllllIIIll) {
                llllllllllllIlIllIIllIlllllIIIll.printStackTrace();
                return null;
            }
        }
        
        private static String lIlIIlIIIIllIlII(final String llllllllllllIlIllIIllIlllllIllIl, final String llllllllllllIlIllIIllIlllllIllII) {
            try {
                final SecretKeySpec llllllllllllIlIllIIllIllllllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIllIlllllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlIllIIllIllllllIIIl = Cipher.getInstance("Blowfish");
                llllllllllllIlIllIIllIllllllIIIl.init(StatsItem.lllIllIIIllIlI[6], llllllllllllIlIllIIllIllllllIIlI);
                return new String(llllllllllllIlIllIIllIllllllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIllIlllllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIllIIllIllllllIIII) {
                llllllllllllIlIllIIllIllllllIIII.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIlIIlIIIIlllIll(final int llllllllllllIlIllIIllIllllIllIlI, final int llllllllllllIlIllIIllIllllIllIIl) {
            return llllllllllllIlIllIIllIllllIllIlI == llllllllllllIlIllIIllIllllIllIIl;
        }
        
        @Override
        protected String func_148210_b(final int llllllllllllIlIllIIllIlllllllIIl) {
            String s;
            if (lIlIIlIIIIlllIll(llllllllllllIlIllIIllIlllllllIIl, StatsItem.lllIllIIIllIlI[1])) {
                s = StatsItem.lllIllIIIllIIl[StatsItem.lllIllIIIllIlI[0]];
                "".length();
                if (-(0x7F ^ 0xD ^ (0xD8 ^ 0xAE)) > 0) {
                    return null;
                }
            }
            else if (lIlIIlIIIIlllIll(llllllllllllIlIllIIllIlllllllIIl, StatsItem.lllIllIIIllIlI[6])) {
                s = StatsItem.lllIllIIIllIIl[StatsItem.lllIllIIIllIlI[1]];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                s = StatsItem.lllIllIIIllIIl[StatsItem.lllIllIIIllIlI[6]];
            }
            return s;
        }
        
        @Override
        protected void drawListHeader(final int llllllllllllIlIllIIlllIIIIIllIll, final int llllllllllllIlIllIIlllIIIIIlIllI, final Tessellator llllllllllllIlIllIIlllIIIIIllIIl) {
            super.drawListHeader(llllllllllllIlIllIIlllIIIIIllIll, llllllllllllIlIllIIlllIIIIIlIllI, llllllllllllIlIllIIlllIIIIIllIIl);
            if (lIlIIlIIIIlllIlI(this.field_148218_l)) {
                GuiStats.this.drawSprite(llllllllllllIlIllIIlllIIIIIllIll + StatsItem.lllIllIIIllIlI[2] - StatsItem.lllIllIIIllIlI[3] + StatsItem.lllIllIIIllIlI[1], llllllllllllIlIllIIlllIIIIIlIllI + StatsItem.lllIllIIIllIlI[1] + StatsItem.lllIllIIIllIlI[1], StatsItem.lllIllIIIllIlI[4], StatsItem.lllIllIIIllIlI[3]);
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
            }
            else {
                GuiStats.this.drawSprite(llllllllllllIlIllIIlllIIIIIllIll + StatsItem.lllIllIIIllIlI[2] - StatsItem.lllIllIIIllIlI[3], llllllllllllIlIllIIlllIIIIIlIllI + StatsItem.lllIllIIIllIlI[1], StatsItem.lllIllIIIllIlI[4], StatsItem.lllIllIIIllIlI[3]);
            }
            if (lIlIIlIIIIlllIll(this.field_148218_l, StatsItem.lllIllIIIllIlI[1])) {
                GuiStats.this.drawSprite(llllllllllllIlIllIIlllIIIIIllIll + StatsItem.lllIllIIIllIlI[5] - StatsItem.lllIllIIIllIlI[3] + StatsItem.lllIllIIIllIlI[1], llllllllllllIlIllIIlllIIIIIlIllI + StatsItem.lllIllIIIllIlI[1] + StatsItem.lllIllIIIllIlI[1], StatsItem.lllIllIIIllIlI[3], StatsItem.lllIllIIIllIlI[3]);
                "".length();
                if ((0x7E ^ 0x7A) == -" ".length()) {
                    return;
                }
            }
            else {
                GuiStats.this.drawSprite(llllllllllllIlIllIIlllIIIIIllIll + StatsItem.lllIllIIIllIlI[5] - StatsItem.lllIllIIIllIlI[3], llllllllllllIlIllIIlllIIIIIlIllI + StatsItem.lllIllIIIllIlI[1], StatsItem.lllIllIIIllIlI[3], StatsItem.lllIllIIIllIlI[3]);
            }
            if (lIlIIlIIIIlllIll(this.field_148218_l, StatsItem.lllIllIIIllIlI[6])) {
                GuiStats.this.drawSprite(llllllllllllIlIllIIlllIIIIIllIll + StatsItem.lllIllIIIllIlI[7] - StatsItem.lllIllIIIllIlI[3] + StatsItem.lllIllIIIllIlI[1], llllllllllllIlIllIIlllIIIIIlIllI + StatsItem.lllIllIIIllIlI[1] + StatsItem.lllIllIIIllIlI[1], StatsItem.lllIllIIIllIlI[8], StatsItem.lllIllIIIllIlI[3]);
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
            }
            else {
                GuiStats.this.drawSprite(llllllllllllIlIllIIlllIIIIIllIll + StatsItem.lllIllIIIllIlI[7] - StatsItem.lllIllIIIllIlI[3], llllllllllllIlIllIIlllIIIIIlIllI + StatsItem.lllIllIIIllIlI[1], StatsItem.lllIllIIIllIlI[8], StatsItem.lllIllIIIllIlI[3]);
            }
        }
        
        private static boolean lIlIIlIIIIlllIlI(final int llllllllllllIlIllIIllIllllIlIIll) {
            return llllllllllllIlIllIIllIllllIlIIll == 0;
        }
        
        private static void lIlIIlIIIIllIlIl() {
            (lllIllIIIllIIl = new String[StatsItem.lllIllIIIllIlI[10]])[StatsItem.lllIllIIIllIlI[0]] = lIlIIlIIIIllIIll("Itfeg73jXbUD931PKDgySA==", "wPrxP");
            StatsItem.lllIllIIIllIIl[StatsItem.lllIllIIIllIlI[1]] = lIlIIlIIIIllIlII("pgcfsgHk1A8IpXypmOWoWg==", "GMRJx");
            StatsItem.lllIllIIIllIIl[StatsItem.lllIllIIIllIlI[6]] = lIlIIlIIIIllIlII("xEQFhJSsRZ2GeUT02oYOTw==", "XgaRm");
        }
        
        static {
            lIlIIlIIIIllIllI();
            lIlIIlIIIIllIlIl();
        }
        
        private static boolean lIlIIlIIIIllIlll(final int llllllllllllIlIllIIllIllllIlIIIl) {
            return llllllllllllIlIllIIllIllllIlIIIl > 0;
        }
        
        private static boolean lIlIIlIIIIlllIIl(final int llllllllllllIlIllIIllIllllIlIlIl) {
            return llllllllllllIlIllIIllIllllIlIlIl != 0;
        }
        
        @Override
        protected void drawSlot(final int llllllllllllIlIllIIlllIIIIIIllII, final int llllllllllllIlIllIIlllIIIIIIlIll, final int llllllllllllIlIllIIlllIIIIIIlIlI, final int llllllllllllIlIllIIlllIIIIIIlIIl, final int llllllllllllIlIllIIlllIIIIIIlIII, final int llllllllllllIlIllIIlllIIIIIIIlll) {
            final StatCrafting llllllllllllIlIllIIlllIIIIIIIllI = this.func_148211_c(llllllllllllIlIllIIlllIIIIIIllII);
            final Item llllllllllllIlIllIIlllIIIIIIIlIl = llllllllllllIlIllIIlllIIIIIIIllI.func_150959_a();
            GuiStats.this.drawStatsScreen(llllllllllllIlIllIIlllIIIIIIlIll + StatsItem.lllIllIIIllIlI[9], llllllllllllIlIllIIlllIIIIIIlIlI, llllllllllllIlIllIIlllIIIIIIIlIl);
            final int llllllllllllIlIllIIlllIIIIIIIlII = Item.getIdFromItem(llllllllllllIlIllIIlllIIIIIIIlIl);
            final StatBase lllllllllllllIlIlIIIIIlIlllIllII = StatList.objectBreakStats[llllllllllllIlIllIIlllIIIIIIIlII];
            final int lllllllllllllIlIlIIIIIlIlllIlIll = llllllllllllIlIllIIlllIIIIIIlIll + StatsItem.lllIllIIIllIlI[2];
            int lllllllllllllIlIlIIIIIlIllllIIII;
            if (lIlIIlIIIIlllIlI(llllllllllllIlIllIIlllIIIIIIllII % StatsItem.lllIllIIIllIlI[6])) {
                lllllllllllllIlIlIIIIIlIllllIIII = StatsItem.lllIllIIIllIlI[1];
                "".length();
                if (((0xA1 ^ 0x86) & ~(0xB8 ^ 0x9F)) == -" ".length()) {
                    return;
                }
            }
            else {
                lllllllllllllIlIlIIIIIlIllllIIII = StatsItem.lllIllIIIllIlI[0];
            }
            this.func_148209_a(lllllllllllllIlIlIIIIIlIlllIllII, lllllllllllllIlIlIIIIIlIlllIlIll, llllllllllllIlIllIIlllIIIIIIlIlI, (boolean)(lllllllllllllIlIlIIIIIlIllllIIII != 0));
            final StatBase lllllllllllllIlIlIIIIIlIlllIllII2 = StatList.objectCraftStats[llllllllllllIlIllIIlllIIIIIIIlII];
            final int lllllllllllllIlIlIIIIIlIlllIlIll2 = llllllllllllIlIllIIlllIIIIIIlIll + StatsItem.lllIllIIIllIlI[5];
            int lllllllllllllIlIlIIIIIlIllllIIII2;
            if (lIlIIlIIIIlllIlI(llllllllllllIlIllIIlllIIIIIIllII % StatsItem.lllIllIIIllIlI[6])) {
                lllllllllllllIlIlIIIIIlIllllIIII2 = StatsItem.lllIllIIIllIlI[1];
                "".length();
                if (-" ".length() < -" ".length()) {
                    return;
                }
            }
            else {
                lllllllllllllIlIlIIIIIlIllllIIII2 = StatsItem.lllIllIIIllIlI[0];
            }
            this.func_148209_a(lllllllllllllIlIlIIIIIlIlllIllII2, lllllllllllllIlIlIIIIIlIlllIlIll2, llllllllllllIlIllIIlllIIIIIIlIlI, (boolean)(lllllllllllllIlIlIIIIIlIllllIIII2 != 0));
            final StatCrafting lllllllllllllIlIlIIIIIlIlllIllII3 = llllllllllllIlIllIIlllIIIIIIIllI;
            final int lllllllllllllIlIlIIIIIlIlllIlIll3 = llllllllllllIlIllIIlllIIIIIIlIll + StatsItem.lllIllIIIllIlI[7];
            int lllllllllllllIlIlIIIIIlIllllIIII3;
            if (lIlIIlIIIIlllIlI(llllllllllllIlIllIIlllIIIIIIllII % StatsItem.lllIllIIIllIlI[6])) {
                lllllllllllllIlIlIIIIIlIllllIIII3 = StatsItem.lllIllIIIllIlI[1];
                "".length();
                if ("   ".length() != "   ".length()) {
                    return;
                }
            }
            else {
                lllllllllllllIlIlIIIIIlIllllIIII3 = StatsItem.lllIllIIIllIlI[0];
            }
            this.func_148209_a(lllllllllllllIlIlIIIIIlIlllIllII3, lllllllllllllIlIlIIIIIlIlllIlIll3, llllllllllllIlIllIIlllIIIIIIlIlI, (boolean)(lllllllllllllIlIlIIIIIlIllllIIII3 != 0));
        }
        
        private static void lIlIIlIIIIllIllI() {
            (lllIllIIIllIlI = new int[12])[0] = ((0x1C ^ 0x2C) & ~(0x91 ^ 0xA1));
            StatsItem.lllIllIIIllIlI[1] = " ".length();
            StatsItem.lllIllIIIllIlI[2] = (0x5D ^ 0x62 ^ (0xD0 ^ 0x9C));
            StatsItem.lllIllIIIllIlI[3] = (0x58 ^ 0xB ^ (0xF7 ^ 0xB6));
            StatsItem.lllIllIIIllIlI[4] = (0x78 ^ 0x30);
            StatsItem.lllIllIIIllIlI[5] = (0x9 ^ 0x3D) + (0xDB ^ 0xC7) - (0x5B ^ 0x75) + (104 + 81 - 134 + 80);
            StatsItem.lllIllIIIllIlI[6] = "  ".length();
            StatsItem.lllIllIIIllIlI[7] = 52 + 139 - 76 + 100;
            StatsItem.lllIllIIIllIlI[8] = (0x3 ^ 0x27);
            StatsItem.lllIllIIIllIlI[9] = (0xC ^ 0x42 ^ (0xFC ^ 0x9A));
            StatsItem.lllIllIIIllIlI[10] = "   ".length();
            StatsItem.lllIllIIIllIlI[11] = (0x9A ^ 0x92);
        }
    }
}
