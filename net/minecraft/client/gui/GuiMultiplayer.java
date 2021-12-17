// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.client.multiplayer.GuiConnecting;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import com.google.common.collect.Lists;
import com.google.common.base.Splitter;
import org.lwjgl.input.Keyboard;
import org.apache.logging.log4j.LogManager;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.io.IOException;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.ServerList;
import net.minecraft.client.network.LanServerDetector;
import org.apache.logging.log4j.Logger;
import net.minecraft.client.network.OldServerPinger;

public class GuiMultiplayer extends GuiScreen implements GuiYesNoCallback
{
    private final /* synthetic */ OldServerPinger oldServerPinger;
    private static final /* synthetic */ Logger logger;
    private /* synthetic */ boolean directConnect;
    private /* synthetic */ LanServerDetector.LanServerList lanServerList;
    private /* synthetic */ GuiButton btnSelectServer;
    private /* synthetic */ boolean deletingServer;
    private /* synthetic */ GuiScreen parentScreen;
    private static final /* synthetic */ String[] lllIIlIIllIIlI;
    private /* synthetic */ GuiButton btnEditServer;
    private /* synthetic */ ServerSelectionList serverListSelector;
    private /* synthetic */ LanServerDetector.ThreadLanServerFind lanServerDetector;
    private /* synthetic */ boolean addingServer;
    private /* synthetic */ boolean initialized;
    private /* synthetic */ ServerList savedServerList;
    private /* synthetic */ GuiButton btnDeleteServer;
    private /* synthetic */ String hoveringText;
    private /* synthetic */ ServerData selectedServer;
    private /* synthetic */ boolean editingServer;
    private static final /* synthetic */ int[] lllIIlIIllIlIl;
    
    private static boolean lIIlllllIlIlIllI(final Object llllllllllllIlIllllIllIIIIIlIIll) {
        return llllllllllllIlIllllIllIIIIIlIIll != null;
    }
    
    private static boolean lIIlllllIlIlIlll(final int llllllllllllIlIllllIllIIIIIIlIll) {
        return llllllllllllIlIllllIllIIIIIIlIll < 0;
    }
    
    @Override
    protected void actionPerformed(final GuiButton llllllllllllIlIllllIllIIlllIIIll) throws IOException {
        if (lIIlllllIlIlIlIl(llllllllllllIlIllllIllIIlllIIIll.enabled ? 1 : 0)) {
            GuiListExtended.IGuiListEntry listEntry;
            if (lIIlllllIlIlIlll(this.serverListSelector.func_148193_k())) {
                listEntry = null;
                "".length();
                if ("  ".length() < -" ".length()) {
                    return;
                }
            }
            else {
                listEntry = this.serverListSelector.getListEntry(this.serverListSelector.func_148193_k());
            }
            final GuiListExtended.IGuiListEntry llllllllllllIlIllllIllIIlllIllII = listEntry;
            if (lIIlllllIlIllIII(llllllllllllIlIllllIllIIlllIIIll.id, GuiMultiplayer.lllIIlIIllIlIl[6]) && lIIlllllIlIlIlIl((llllllllllllIlIllllIllIIlllIllII instanceof ServerListEntryNormal) ? 1 : 0)) {
                final String llllllllllllIlIllllIllIIlllIlIll = ((ServerListEntryNormal)llllllllllllIlIllllIllIIlllIllII).getServerData().serverName;
                if (lIIlllllIlIlIllI(llllllllllllIlIllllIllIIlllIlIll)) {
                    this.deletingServer = (GuiMultiplayer.lllIIlIIllIlIl[0] != 0);
                    final String llllllllllllIlIllllIllIIlllIlIlI = I18n.format(GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[18]], new Object[GuiMultiplayer.lllIIlIIllIlIl[1]]);
                    final String llllllllllllIlIllllIllIIlllIlIIl = String.valueOf(new StringBuilder(GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[22]]).append(llllllllllllIlIllllIllIIlllIlIll).append(GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[23]]).append(I18n.format(GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[24]], new Object[GuiMultiplayer.lllIIlIIllIlIl[1]])));
                    final String llllllllllllIlIllllIllIIlllIlIII = I18n.format(GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[25]], new Object[GuiMultiplayer.lllIIlIIllIlIl[1]]);
                    final String llllllllllllIlIllllIllIIlllIIlll = I18n.format(GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[26]], new Object[GuiMultiplayer.lllIIlIIllIlIl[1]]);
                    final GuiYesNo llllllllllllIlIllllIllIIlllIIllI = new GuiYesNo(this, llllllllllllIlIllllIllIIlllIlIlI, llllllllllllIlIllllIllIIlllIlIIl, llllllllllllIlIllllIllIIlllIlIII, llllllllllllIlIllllIllIIlllIIlll, this.serverListSelector.func_148193_k());
                    this.mc.displayGuiScreen(llllllllllllIlIllllIllIIlllIIllI);
                    "".length();
                    if ((0xAB ^ 0xA0 ^ (0x22 ^ 0x2D)) == 0x0) {
                        return;
                    }
                }
            }
            else if (lIIlllllIlIllIII(llllllllllllIlIllllIllIIlllIIIll.id, GuiMultiplayer.lllIIlIIllIlIl[0])) {
                this.connectToSelected();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (lIIlllllIlIllIII(llllllllllllIlIllllIllIIlllIIIll.id, GuiMultiplayer.lllIIlIIllIlIl[15])) {
                this.directConnect = (GuiMultiplayer.lllIIlIIllIlIl[0] != 0);
                final Minecraft mc = this.mc;
                final ServerData serverData = new ServerData(I18n.format(GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[27]], new Object[GuiMultiplayer.lllIIlIIllIlIl[1]]), GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[28]], (boolean)(GuiMultiplayer.lllIIlIIllIlIl[1] != 0));
                this.selectedServer = serverData;
                mc.displayGuiScreen(new GuiScreenServerList(this, serverData));
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
            else if (lIIlllllIlIllIII(llllllllllllIlIllllIllIIlllIIIll.id, GuiMultiplayer.lllIIlIIllIlIl[14])) {
                this.addingServer = (GuiMultiplayer.lllIIlIIllIlIl[0] != 0);
                final Minecraft mc2 = this.mc;
                final ServerData serverData2 = new ServerData(I18n.format(GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[29]], new Object[GuiMultiplayer.lllIIlIIllIlIl[1]]), GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[30]], (boolean)(GuiMultiplayer.lllIIlIIllIlIl[1] != 0));
                this.selectedServer = serverData2;
                mc2.displayGuiScreen(new GuiScreenAddServer(this, serverData2));
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
            }
            else if (lIIlllllIlIllIII(llllllllllllIlIllllIllIIlllIIIll.id, GuiMultiplayer.lllIIlIIllIlIl[5]) && lIIlllllIlIlIlIl((llllllllllllIlIllllIllIIlllIllII instanceof ServerListEntryNormal) ? 1 : 0)) {
                this.editingServer = (GuiMultiplayer.lllIIlIIllIlIl[0] != 0);
                final ServerData llllllllllllIlIllllIllIIlllIIlIl = ((ServerListEntryNormal)llllllllllllIlIllllIllIIlllIllII).getServerData();
                this.selectedServer = new ServerData(llllllllllllIlIllllIllIIlllIIlIl.serverName, llllllllllllIlIllllIllIIlllIIlIl.serverIP, (boolean)(GuiMultiplayer.lllIIlIIllIlIl[1] != 0));
                this.selectedServer.copyFrom(llllllllllllIlIllllIllIIlllIIlIl);
                this.mc.displayGuiScreen(new GuiScreenAddServer(this, this.selectedServer));
                "".length();
                if ("  ".length() < "  ".length()) {
                    return;
                }
            }
            else if (lIIlllllIlIlIlII(llllllllllllIlIllllIllIIlllIIIll.id)) {
                this.mc.displayGuiScreen(this.parentScreen);
                "".length();
                if ("  ".length() == ((0x5B ^ 0x6E) & ~(0x73 ^ 0x46))) {
                    return;
                }
            }
            else if (lIIlllllIlIllIII(llllllllllllIlIllllIllIIlllIIIll.id, GuiMultiplayer.lllIIlIIllIlIl[18])) {
                this.refreshServerList();
            }
        }
    }
    
    @Override
    public void updateScreen() {
        super.updateScreen();
        if (lIIlllllIlIlIlIl(this.lanServerList.getWasUpdated() ? 1 : 0)) {
            final List<LanServerDetector.LanServer> llllllllllllIlIllllIllIIllllllIl = this.lanServerList.getLanServers();
            this.lanServerList.setWasNotUpdated();
            this.serverListSelector.func_148194_a(llllllllllllIlIllllIllIIllllllIl);
        }
        this.oldServerPinger.pingPendingNetworks();
    }
    
    private static String lIIlllllIlIIIIlI(String llllllllllllIlIllllIllIIIIllIIlI, final String llllllllllllIlIllllIllIIIIllIllI) {
        llllllllllllIlIllllIllIIIIllIIlI = (boolean)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllllIllIIIIllIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllllIllIIIIllIlIl = new StringBuilder();
        final char[] llllllllllllIlIllllIllIIIIllIlII = llllllllllllIlIllllIllIIIIllIllI.toCharArray();
        int llllllllllllIlIllllIllIIIIllIIll = GuiMultiplayer.lllIIlIIllIlIl[1];
        final short llllllllllllIlIllllIllIIIIlIllIl = (Object)((String)llllllllllllIlIllllIllIIIIllIIlI).toCharArray();
        final String llllllllllllIlIllllIllIIIIlIllII = (String)llllllllllllIlIllllIllIIIIlIllIl.length;
        short llllllllllllIlIllllIllIIIIlIlIll = (short)GuiMultiplayer.lllIIlIIllIlIl[1];
        while (lIIlllllIlIlllII(llllllllllllIlIllllIllIIIIlIlIll, (int)llllllllllllIlIllllIllIIIIlIllII)) {
            final char llllllllllllIlIllllIllIIIIlllIII = llllllllllllIlIllllIllIIIIlIllIl[llllllllllllIlIllllIllIIIIlIlIll];
            llllllllllllIlIllllIllIIIIllIlIl.append((char)(llllllllllllIlIllllIllIIIIlllIII ^ llllllllllllIlIllllIllIIIIllIlII[llllllllllllIlIllllIllIIIIllIIll % llllllllllllIlIllllIllIIIIllIlII.length]));
            "".length();
            ++llllllllllllIlIllllIllIIIIllIIll;
            ++llllllllllllIlIllllIllIIIIlIlIll;
            "".length();
            if ((88 + 87 - 109 + 91 ^ 39 + 6 + 24 + 84) < "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllllIllIIIIllIlIl);
    }
    
    public void connectToSelected() {
        GuiListExtended.IGuiListEntry listEntry;
        if (lIIlllllIlIlIlll(this.serverListSelector.func_148193_k())) {
            listEntry = null;
            "".length();
            if (" ".length() <= 0) {
                return;
            }
        }
        else {
            listEntry = this.serverListSelector.getListEntry(this.serverListSelector.func_148193_k());
        }
        final GuiListExtended.IGuiListEntry llllllllllllIlIllllIllIIlIlIllII = listEntry;
        if (lIIlllllIlIlIlIl((llllllllllllIlIllllIllIIlIlIllII instanceof ServerListEntryNormal) ? 1 : 0)) {
            this.connectToServer(((ServerListEntryNormal)llllllllllllIlIllllIllIIlIlIllII).getServerData());
            "".length();
            if ((122 + 115 - 125 + 79 ^ 44 + 32 - 66 + 176) == 0x0) {
                return;
            }
        }
        else if (lIIlllllIlIlIlIl((llllllllllllIlIllllIllIIlIlIllII instanceof ServerListEntryLanDetected) ? 1 : 0)) {
            final LanServerDetector.LanServer llllllllllllIlIllllIllIIlIlIlIll = ((ServerListEntryLanDetected)llllllllllllIlIllllIllIIlIlIllII).getLanServer();
            this.connectToServer(new ServerData(llllllllllllIlIllllIllIIlIlIlIll.getServerMotd(), llllllllllllIlIllllIllIIlIlIlIll.getServerIpPort(), (boolean)(GuiMultiplayer.lllIIlIIllIlIl[0] != 0)));
        }
    }
    
    static {
        lIIlllllIlIlIIll();
        lIIlllllIlIIllll();
        logger = LogManager.getLogger();
    }
    
    public ServerList getServerList() {
        return this.savedServerList;
    }
    
    private static boolean lIIlllllIlIllIll(final int llllllllllllIlIllllIllIIIIIIlIIl) {
        return llllllllllllIlIllllIllIIIIIIlIIl > 0;
    }
    
    public void setHoveringText(final String llllllllllllIlIllllIllIIlIIlIIII) {
        this.hoveringText = llllllllllllIlIllllIllIIlIIlIIII;
    }
    
    public OldServerPinger getOldServerPinger() {
        return this.oldServerPinger;
    }
    
    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)(GuiMultiplayer.lllIIlIIllIlIl[1] != 0));
        if (lIIlllllIlIlIllI(this.lanServerDetector)) {
            this.lanServerDetector.interrupt();
            this.lanServerDetector = null;
        }
        this.oldServerPinger.clearPendingNetworks();
    }
    
    public void selectServer(final int llllllllllllIlIllllIllIIlIIlllIl) {
        this.serverListSelector.setSelectedSlotIndex(llllllllllllIlIllllIllIIlIIlllIl);
        GuiListExtended.IGuiListEntry listEntry;
        if (lIIlllllIlIlIlll(llllllllllllIlIllllIllIIlIIlllIl)) {
            listEntry = null;
            "".length();
            if ((0xC4 ^ 0x83 ^ (0x49 ^ 0xA)) <= 0) {
                return;
            }
        }
        else {
            listEntry = this.serverListSelector.getListEntry(llllllllllllIlIllllIllIIlIIlllIl);
        }
        final GuiListExtended.IGuiListEntry llllllllllllIlIllllIllIIlIIlllII = listEntry;
        this.btnSelectServer.enabled = (GuiMultiplayer.lllIIlIIllIlIl[1] != 0);
        this.btnEditServer.enabled = (GuiMultiplayer.lllIIlIIllIlIl[1] != 0);
        this.btnDeleteServer.enabled = (GuiMultiplayer.lllIIlIIllIlIl[1] != 0);
        if (lIIlllllIlIlIllI(llllllllllllIlIllllIllIIlIIlllII) && lIIlllllIlIlIlII((llllllllllllIlIllllIllIIlIIlllII instanceof ServerListEntryLanScan) ? 1 : 0)) {
            this.btnSelectServer.enabled = (GuiMultiplayer.lllIIlIIllIlIl[0] != 0);
            if (lIIlllllIlIlIlIl((llllllllllllIlIllllIllIIlIIlllII instanceof ServerListEntryNormal) ? 1 : 0)) {
                this.btnEditServer.enabled = (GuiMultiplayer.lllIIlIIllIlIl[0] != 0);
                this.btnDeleteServer.enabled = (GuiMultiplayer.lllIIlIIllIlIl[0] != 0);
            }
        }
    }
    
    @Override
    public void confirmClicked(final boolean llllllllllllIlIllllIllIIllIlIIll, final int llllllllllllIlIllllIllIIllIlIIlI) {
        GuiListExtended.IGuiListEntry listEntry;
        if (lIIlllllIlIlIlll(this.serverListSelector.func_148193_k())) {
            listEntry = null;
            "".length();
            if (-(0x2B ^ 0x2F) > 0) {
                return;
            }
        }
        else {
            listEntry = this.serverListSelector.getListEntry(this.serverListSelector.func_148193_k());
        }
        final GuiListExtended.IGuiListEntry llllllllllllIlIllllIllIIllIlIIIl = listEntry;
        if (lIIlllllIlIlIlIl(this.deletingServer ? 1 : 0)) {
            this.deletingServer = (GuiMultiplayer.lllIIlIIllIlIl[1] != 0);
            if (lIIlllllIlIlIlIl(llllllllllllIlIllllIllIIllIlIIll ? 1 : 0) && lIIlllllIlIlIlIl((llllllllllllIlIllllIllIIllIlIIIl instanceof ServerListEntryNormal) ? 1 : 0)) {
                this.savedServerList.removeServerData(this.serverListSelector.func_148193_k());
                this.savedServerList.saveServerList();
                this.serverListSelector.setSelectedSlotIndex(GuiMultiplayer.lllIIlIIllIlIl[31]);
                this.serverListSelector.func_148195_a(this.savedServerList);
            }
            this.mc.displayGuiScreen(this);
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lIIlllllIlIlIlIl(this.directConnect ? 1 : 0)) {
            this.directConnect = (GuiMultiplayer.lllIIlIIllIlIl[1] != 0);
            if (lIIlllllIlIlIlIl(llllllllllllIlIllllIllIIllIlIIll ? 1 : 0)) {
                this.connectToServer(this.selectedServer);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.mc.displayGuiScreen(this);
                "".length();
                if ((9 + 3 + 117 + 12 ^ 55 + 1 + 42 + 39) < "  ".length()) {
                    return;
                }
            }
        }
        else if (lIIlllllIlIlIlIl(this.addingServer ? 1 : 0)) {
            this.addingServer = (GuiMultiplayer.lllIIlIIllIlIl[1] != 0);
            if (lIIlllllIlIlIlIl(llllllllllllIlIllllIllIIllIlIIll ? 1 : 0)) {
                this.savedServerList.addServerData(this.selectedServer);
                this.savedServerList.saveServerList();
                this.serverListSelector.setSelectedSlotIndex(GuiMultiplayer.lllIIlIIllIlIl[31]);
                this.serverListSelector.func_148195_a(this.savedServerList);
            }
            this.mc.displayGuiScreen(this);
            "".length();
            if ("  ".length() < "  ".length()) {
                return;
            }
        }
        else if (lIIlllllIlIlIlIl(this.editingServer ? 1 : 0)) {
            this.editingServer = (GuiMultiplayer.lllIIlIIllIlIl[1] != 0);
            if (lIIlllllIlIlIlIl(llllllllllllIlIllllIllIIllIlIIll ? 1 : 0) && lIIlllllIlIlIlIl((llllllllllllIlIllllIllIIllIlIIIl instanceof ServerListEntryNormal) ? 1 : 0)) {
                final ServerData llllllllllllIlIllllIllIIllIlIIII = ((ServerListEntryNormal)llllllllllllIlIllllIllIIllIlIIIl).getServerData();
                llllllllllllIlIllllIllIIllIlIIII.serverName = this.selectedServer.serverName;
                llllllllllllIlIllllIllIIllIlIIII.serverIP = this.selectedServer.serverIP;
                llllllllllllIlIllllIllIIllIlIIII.copyFrom(this.selectedServer);
                this.savedServerList.saveServerList();
                this.serverListSelector.func_148195_a(this.savedServerList);
            }
            this.mc.displayGuiScreen(this);
        }
    }
    
    private static boolean lIIlllllIlIlllIl(final int llllllllllllIlIllllIllIIIIIIIllI, final int llllllllllllIlIllllIllIIIIIIIlIl) {
        return llllllllllllIlIllllIllIIIIIIIllI != llllllllllllIlIllllIllIIIIIIIlIl;
    }
    
    @Override
    public void drawScreen(final int llllllllllllIlIllllIllIIlIllIlll, final int llllllllllllIlIllllIllIIlIllIllI, final float llllllllllllIlIllllIllIIlIllIlIl) {
        this.hoveringText = null;
        this.drawDefaultBackground();
        this.serverListSelector.drawScreen(llllllllllllIlIllllIllIIlIllIlll, llllllllllllIlIllllIllIIlIllIllI, llllllllllllIlIllllIllIIlIllIlIl);
        this.drawCenteredString(this.fontRendererObj, I18n.format(GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[36]], new Object[GuiMultiplayer.lllIIlIIllIlIl[1]]), this.width / GuiMultiplayer.lllIIlIIllIlIl[6], GuiMultiplayer.lllIIlIIllIlIl[10], GuiMultiplayer.lllIIlIIllIlIl[37]);
        super.drawScreen(llllllllllllIlIllllIllIIlIllIlll, llllllllllllIlIllllIllIIlIllIllI, llllllllllllIlIllllIllIIlIllIlIl);
        if (lIIlllllIlIlIllI(this.hoveringText)) {
            this.drawHoveringText(Lists.newArrayList(Splitter.on(GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[38]]).split((CharSequence)this.hoveringText)), llllllllllllIlIllllIllIIlIllIlll, llllllllllllIlIllllIllIIlIllIllI);
        }
    }
    
    private static boolean lIIlllllIlIlIlII(final int llllllllllllIlIllllIllIIIIIIllll) {
        return llllllllllllIlIllllIllIIIIIIllll == 0;
    }
    
    public GuiMultiplayer(final GuiScreen llllllllllllIlIllllIllIlIIIIllIl) {
        this.oldServerPinger = new OldServerPinger();
        this.parentScreen = llllllllllllIlIllllIllIlIIIIllIl;
    }
    
    @Override
    protected void keyTyped(final char llllllllllllIlIllllIllIIllIIIIII, final int llllllllllllIlIllllIllIIllIIIlII) throws IOException {
        final int llllllllllllIlIllllIllIIllIIIIll = this.serverListSelector.func_148193_k();
        GuiListExtended.IGuiListEntry listEntry;
        if (lIIlllllIlIlIlll(llllllllllllIlIllllIllIIllIIIIll)) {
            listEntry = null;
            "".length();
            if (((0xD6 ^ 0xB8 ^ (0x26 ^ 0x46)) & (32 + 2 + 116 + 5 ^ 70 + 108 - 51 + 22 ^ -" ".length())) < 0) {
                return;
            }
        }
        else {
            listEntry = this.serverListSelector.getListEntry(llllllllllllIlIllllIllIIllIIIIll);
        }
        final GuiListExtended.IGuiListEntry llllllllllllIlIllllIllIIllIIIIlI = listEntry;
        if (lIIlllllIlIllIII(llllllllllllIlIllllIllIIllIIIlII, GuiMultiplayer.lllIIlIIllIlIl[32])) {
            this.refreshServerList();
            "".length();
            if (" ".length() != " ".length()) {
                return;
            }
        }
        else if (lIIlllllIlIllIlI(llllllllllllIlIllllIllIIllIIIIll)) {
            if (lIIlllllIlIllIII(llllllllllllIlIllllIllIIllIIIlII, GuiMultiplayer.lllIIlIIllIlIl[33])) {
                if (lIIlllllIlIlIlIl(GuiScreen.isShiftKeyDown() ? 1 : 0)) {
                    if (lIIlllllIlIllIll(llllllllllllIlIllllIllIIllIIIIll) && lIIlllllIlIlIlIl((llllllllllllIlIllllIllIIllIIIIlI instanceof ServerListEntryNormal) ? 1 : 0)) {
                        this.savedServerList.swapServers(llllllllllllIlIllllIllIIllIIIIll, llllllllllllIlIllllIllIIllIIIIll - GuiMultiplayer.lllIIlIIllIlIl[0]);
                        this.selectServer(this.serverListSelector.func_148193_k() - GuiMultiplayer.lllIIlIIllIlIl[0]);
                        this.serverListSelector.scrollBy(-this.serverListSelector.getSlotHeight());
                        this.serverListSelector.func_148195_a(this.savedServerList);
                        "".length();
                        if (" ".length() >= (0x2D ^ 0x6D ^ (0x20 ^ 0x64))) {
                            return;
                        }
                    }
                }
                else if (lIIlllllIlIllIll(llllllllllllIlIllllIllIIllIIIIll)) {
                    this.selectServer(this.serverListSelector.func_148193_k() - GuiMultiplayer.lllIIlIIllIlIl[0]);
                    this.serverListSelector.scrollBy(-this.serverListSelector.getSlotHeight());
                    if (lIIlllllIlIlIlIl((this.serverListSelector.getListEntry(this.serverListSelector.func_148193_k()) instanceof ServerListEntryLanScan) ? 1 : 0)) {
                        if (lIIlllllIlIllIll(this.serverListSelector.func_148193_k())) {
                            this.selectServer(this.serverListSelector.getSize() - GuiMultiplayer.lllIIlIIllIlIl[0]);
                            this.serverListSelector.scrollBy(-this.serverListSelector.getSlotHeight());
                            "".length();
                            if (((0x78 ^ 0x26) & ~(0x34 ^ 0x6A)) == " ".length()) {
                                return;
                            }
                        }
                        else {
                            this.selectServer(GuiMultiplayer.lllIIlIIllIlIl[31]);
                            "".length();
                            if ("   ".length() > "   ".length()) {
                                return;
                            }
                        }
                    }
                }
                else {
                    this.selectServer(GuiMultiplayer.lllIIlIIllIlIl[31]);
                    "".length();
                    if (((0xC ^ 0x54 ^ (0xF6 ^ 0x8B)) & (112 + 158 - 134 + 38 ^ 134 + 117 - 200 + 88 ^ -" ".length()) & (((117 + 195 - 184 + 87 ^ 67 + 11 + 65 + 54) & (0xF6 ^ 0xB3 ^ (0xB ^ 0x5C) ^ -" ".length())) ^ -" ".length())) != 0x0) {
                        return;
                    }
                }
            }
            else if (lIIlllllIlIllIII(llllllllllllIlIllllIllIIllIIIlII, GuiMultiplayer.lllIIlIIllIlIl[34])) {
                if (lIIlllllIlIlIlIl(GuiScreen.isShiftKeyDown() ? 1 : 0)) {
                    if (lIIlllllIlIlllII(llllllllllllIlIllllIllIIllIIIIll, this.savedServerList.countServers() - GuiMultiplayer.lllIIlIIllIlIl[0])) {
                        this.savedServerList.swapServers(llllllllllllIlIllllIllIIllIIIIll, llllllllllllIlIllllIllIIllIIIIll + GuiMultiplayer.lllIIlIIllIlIl[0]);
                        this.selectServer(llllllllllllIlIllllIllIIllIIIIll + GuiMultiplayer.lllIIlIIllIlIl[0]);
                        this.serverListSelector.scrollBy(this.serverListSelector.getSlotHeight());
                        this.serverListSelector.func_148195_a(this.savedServerList);
                        "".length();
                        if ("  ".length() <= -" ".length()) {
                            return;
                        }
                    }
                }
                else if (lIIlllllIlIlllII(llllllllllllIlIllllIllIIllIIIIll, this.serverListSelector.getSize())) {
                    this.selectServer(this.serverListSelector.func_148193_k() + GuiMultiplayer.lllIIlIIllIlIl[0]);
                    this.serverListSelector.scrollBy(this.serverListSelector.getSlotHeight());
                    if (lIIlllllIlIlIlIl((this.serverListSelector.getListEntry(this.serverListSelector.func_148193_k()) instanceof ServerListEntryLanScan) ? 1 : 0)) {
                        if (lIIlllllIlIlllII(this.serverListSelector.func_148193_k(), this.serverListSelector.getSize() - GuiMultiplayer.lllIIlIIllIlIl[0])) {
                            this.selectServer(this.serverListSelector.getSize() + GuiMultiplayer.lllIIlIIllIlIl[0]);
                            this.serverListSelector.scrollBy(this.serverListSelector.getSlotHeight());
                            "".length();
                            if ("   ".length() <= "  ".length()) {
                                return;
                            }
                        }
                        else {
                            this.selectServer(GuiMultiplayer.lllIIlIIllIlIl[31]);
                            "".length();
                            if ("  ".length() <= ((0x22 ^ 0x31 ^ (0x96 ^ 0x9C)) & (85 + 50 - 25 + 41 ^ 12 + 111 - 72 + 91 ^ -" ".length()))) {
                                return;
                            }
                        }
                    }
                }
                else {
                    this.selectServer(GuiMultiplayer.lllIIlIIllIlIl[31]);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
            }
            else if (lIIlllllIlIlllIl(llllllllllllIlIllllIllIIllIIIlII, GuiMultiplayer.lllIIlIIllIlIl[8]) && lIIlllllIlIlllIl(llllllllllllIlIllllIllIIllIIIlII, GuiMultiplayer.lllIIlIIllIlIl[35])) {
                super.keyTyped(llllllllllllIlIllllIllIIllIIIIII, llllllllllllIlIllllIllIIllIIIlII);
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            }
            else {
                this.actionPerformed(this.buttonList.get(GuiMultiplayer.lllIIlIIllIlIl[6]));
                "".length();
                if (-" ".length() > -" ".length()) {
                    return;
                }
            }
        }
        else {
            super.keyTyped(llllllllllllIlIllllIllIIllIIIIII, llllllllllllIlIllllIllIIllIIIlII);
        }
    }
    
    private static boolean lIIlllllIlIllIlI(final int llllllllllllIlIllllIllIIIIIIllIl) {
        return llllllllllllIlIllllIllIIIIIIllIl >= 0;
    }
    
    @Override
    public void handleMouseInput() throws IOException {
        super.handleMouseInput();
        this.serverListSelector.handleMouseInput();
    }
    
    private static void lIIlllllIlIlIIll() {
        (lllIIlIIllIlIl = new int[39])[0] = " ".length();
        GuiMultiplayer.lllIIlIIllIlIl[1] = ((0xF9 ^ 0x9E ^ (0x5C ^ 0x3E)) & (0x56 ^ 0x4B ^ (0xD ^ 0x15) ^ -" ".length()));
        GuiMultiplayer.lllIIlIIllIlIl[2] = (0x50 ^ 0xD ^ (0xE9 ^ 0x94));
        GuiMultiplayer.lllIIlIIllIlIl[3] = (0xBB ^ 0x81 ^ (0xDE ^ 0xA4));
        GuiMultiplayer.lllIIlIIllIlIl[4] = (0xB3 ^ 0x97);
        GuiMultiplayer.lllIIlIIllIlIl[5] = (186 + 0 - 175 + 184 ^ 104 + 155 - 248 + 185);
        GuiMultiplayer.lllIIlIIllIlIl[6] = "  ".length();
        GuiMultiplayer.lllIIlIIllIlIl[7] = (0x66 ^ 0x2E) + (0x8D ^ 0x9F) - -(0x65 ^ 0x4E) + (0x73 ^ 0x66);
        GuiMultiplayer.lllIIlIIllIlIl[8] = (0x3 ^ 0x1F);
        GuiMultiplayer.lllIIlIIllIlIl[9] = (0xEE ^ 0xA8);
        GuiMultiplayer.lllIIlIIllIlIl[10] = (0x6E ^ 0x7A);
        GuiMultiplayer.lllIIlIIllIlIl[11] = (65 + 136 + 9 + 6 ^ 33 + 17 + 41 + 55);
        GuiMultiplayer.lllIIlIIllIlIl[12] = (0xF ^ 0x75 ^ (0x39 ^ 0x77));
        GuiMultiplayer.lllIIlIIllIlIl[13] = (0xA4 ^ 0xC0);
        GuiMultiplayer.lllIIlIIllIlIl[14] = "   ".length();
        GuiMultiplayer.lllIIlIIllIlIl[15] = (0xBD ^ 0xB9);
        GuiMultiplayer.lllIIlIIllIlIl[16] = (0x47 ^ 0x75);
        GuiMultiplayer.lllIIlIIllIlIl[17] = (0xFF ^ 0xA7 ^ (0x6A ^ 0x37));
        GuiMultiplayer.lllIIlIIllIlIl[18] = (0x20 ^ 0x28);
        GuiMultiplayer.lllIIlIIllIlIl[19] = (0xFF ^ 0xA7 ^ (0xCF ^ 0x91));
        GuiMultiplayer.lllIIlIIllIlIl[20] = (0x19 ^ 0x55);
        GuiMultiplayer.lllIIlIIllIlIl[21] = (77 + 104 - 179 + 135 ^ 158 + 39 - 122 + 119);
        GuiMultiplayer.lllIIlIIllIlIl[22] = (0x2E ^ 0x27);
        GuiMultiplayer.lllIIlIIllIlIl[23] = (0xF0 ^ 0xB4 ^ (0xCE ^ 0x80));
        GuiMultiplayer.lllIIlIIllIlIl[24] = ("  ".length() ^ (0x89 ^ 0x80));
        GuiMultiplayer.lllIIlIIllIlIl[25] = (0x10 ^ 0x72 ^ (0x4D ^ 0x23));
        GuiMultiplayer.lllIIlIIllIlIl[26] = (0x42 ^ 0x4F);
        GuiMultiplayer.lllIIlIIllIlIl[27] = (0x1B ^ 0x6 ^ (0xAF ^ 0xBC));
        GuiMultiplayer.lllIIlIIllIlIl[28] = (0xD8 ^ 0xAC ^ (0x2E ^ 0x55));
        GuiMultiplayer.lllIIlIIllIlIl[29] = (125 + 51 - 174 + 172 ^ 117 + 10 + 24 + 39);
        GuiMultiplayer.lllIIlIIllIlIl[30] = (0x6C ^ 0x26 ^ (0x64 ^ 0x3F));
        GuiMultiplayer.lllIIlIIllIlIl[31] = -" ".length();
        GuiMultiplayer.lllIIlIIllIlIl[32] = (121 + 80 - 156 + 210 ^ 74 + 52 - 102 + 168);
        GuiMultiplayer.lllIIlIIllIlIl[33] = 133 + 115 - 230 + 118 + (0xBD ^ 0x8D) - (133 + 126 - 205 + 94) + (11 + 9 + 26 + 118);
        GuiMultiplayer.lllIIlIIllIlIl[34] = (0x69 ^ 0x63) + (28 + 139 + 8 + 18) - (65 + 158 - 57 + 36) + (126 + 109 - 203 + 175);
        GuiMultiplayer.lllIIlIIllIlIl[35] = 143 + 130 - 244 + 127;
        GuiMultiplayer.lllIIlIIllIlIl[36] = (0x56 ^ 0x37 ^ (0x53 ^ 0x20));
        GuiMultiplayer.lllIIlIIllIlIl[37] = (-" ".length() & (-1 & 0xFFFFFF));
        GuiMultiplayer.lllIIlIIllIlIl[38] = (0x58 ^ 0x4B);
    }
    
    private static void lIIlllllIlIIllll() {
        (lllIIlIIllIIlI = new String[GuiMultiplayer.lllIIlIIllIlIl[10]])[GuiMultiplayer.lllIIlIIllIlIl[1]] = lIIlllllIlIIIIlI("AiwsDikyYjkDZSQ2LB4xdw4MImUkJz8aICViKQkxMiE5BSo5eG0=", "WBMlE");
        GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[0]] = lIIlllllIlIIIIlI("AD0hHTYHCygKIxYqYx0xGiw=", "sXMxU");
        GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[6]] = lIIlllllIlIIIIll("hUPx9iHYUl8RgTW0a6cIdfl0Zy1ikT3T", "MyTzi");
        GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[14]] = lIIlllllIlIIIlII("XcgRB0P0fm0naJ6AMVP+LHiMbGbgmfzn", "Tfsqj");
        GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[15]] = lIIlllllIlIIIlII("1HrgfwdDiMa40qd7kyk+S2q9ned6xPte", "ziViL");
        GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[17]] = lIIlllllIlIIIIll("RvluLtMBcn14vd+0VW3R0RSvTgmAIKMs", "VdcLt");
        GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[19]] = lIIlllllIlIIIlII("JgH62+onbEmp9+fwM5H81jtrOlZyDS/1", "TJIfQ");
        GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[5]] = lIIlllllIlIIIlII("8cUinJBCrQcG23hIzAC9Gg==", "zJnpY");
        GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[18]] = lIIlllllIlIIIIll("ZvI7CWQuTkJRT+Lw+tm3EaA3HH9gCpnzMZM0E2Z7RCE=", "pMyEc");
        GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[22]] = lIIlllllIlIIIIlI("SA==", "osMqM");
        GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[23]] = lIIlllllIlIIIIll("z0q/zm5dt1E=", "wQzck");
        GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[24]] = lIIlllllIlIIIIlI("KikoFzUtHyEAIDw+ahYzNSkwFwE4PiobOD4=", "YLDrV");
        GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[25]] = lIIlllllIlIIIIll("hIoI7oa+sxUvUfrtNELS0OAs2m7l65VsCTIitLCN7Sg=", "tVAYq");
        GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[26]] = lIIlllllIlIIIIlI("NDEsbA0yKiYnAg==", "SDEBn");
        GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[27]] = lIIlllllIlIIIIlI("JBUkNwsjIy0gHjICZjYNMRE9PhwZESU3", "WpHRh");
        GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[28]] = lIIlllllIlIIIlII("MgEBMeUBDI4=", "lrLxi");
        GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[29]] = lIIlllllIlIIIlII("Im74lGGuS130fyIP0IPvvT5B0O0nKIOZvnb8Gny5Ehw=", "qmqDm");
        GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[30]] = lIIlllllIlIIIlII("u7CWxMgvHj4=", "TPgqA");
        GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[36]] = lIIlllllIlIIIIll("Es8XEdokoQ3my3qYcj4XECXtw1uEFl9i", "PVcIO");
        GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[38]] = lIIlllllIlIIIlII("rhKuZ1IZmkU=", "GSUKV");
    }
    
    @Override
    protected void mouseClicked(final int llllllllllllIlIllllIllIIlIIIlIlI, final int llllllllllllIlIllllIllIIlIIIlIIl, final int llllllllllllIlIllllIllIIlIIIlIII) throws IOException {
        super.mouseClicked(llllllllllllIlIllllIllIIlIIIlIlI, llllllllllllIlIllllIllIIlIIIlIIl, llllllllllllIlIllllIllIIlIIIlIII);
        this.serverListSelector.mouseClicked(llllllllllllIlIllllIllIIlIIIlIlI, llllllllllllIlIllllIllIIlIIIlIIl, llllllllllllIlIllllIllIIlIIIlIII);
        "".length();
    }
    
    private static String lIIlllllIlIIIlII(final String llllllllllllIlIllllIllIIIIlIIIII, final String llllllllllllIlIllllIllIIIIIlllll) {
        try {
            final SecretKeySpec llllllllllllIlIllllIllIIIIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIllIIIIIlllll.getBytes(StandardCharsets.UTF_8)), GuiMultiplayer.lllIIlIIllIlIl[18]), "DES");
            final Cipher llllllllllllIlIllllIllIIIIlIIlII = Cipher.getInstance("DES");
            llllllllllllIlIllllIllIIIIlIIlII.init(GuiMultiplayer.lllIIlIIllIlIl[6], llllllllllllIlIllllIllIIIIlIIlIl);
            return new String(llllllllllllIlIllllIllIIIIlIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIllIIIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIllIIIIlIIIll) {
            llllllllllllIlIllllIllIIIIlIIIll.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlllllIlIIIIll(final String llllllllllllIlIllllIllIIIlIIIlll, final String llllllllllllIlIllllIllIIIlIIIllI) {
        try {
            final SecretKeySpec llllllllllllIlIllllIllIIIlIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIllIIIlIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllllIllIIIlIIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIllllIllIIIlIIlIIl.init(GuiMultiplayer.lllIIlIIllIlIl[6], llllllllllllIlIllllIllIIIlIIlIlI);
            return new String(llllllllllllIlIllllIllIIIlIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIllIIIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIllIIIlIIlIII) {
            llllllllllllIlIllllIllIIIlIIlIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlllllIlIllIII(final int llllllllllllIlIllllIllIIIIIllIlI, final int llllllllllllIlIllllIllIIIIIllIIl) {
        return llllllllllllIlIllllIllIIIIIllIlI == llllllllllllIlIllllIllIIIIIllIIl;
    }
    
    private void refreshServerList() {
        this.mc.displayGuiScreen(new GuiMultiplayer(this.parentScreen));
    }
    
    public boolean func_175394_b(final ServerListEntryNormal llllllllllllIlIllllIllIIIllIllII, final int llllllllllllIlIllllIllIIIllIlIll) {
        if (lIIlllllIlIlllII(llllllllllllIlIllllIllIIIllIlIll, this.savedServerList.countServers() - GuiMultiplayer.lllIIlIIllIlIl[0])) {
            return GuiMultiplayer.lllIIlIIllIlIl[0] != 0;
        }
        return GuiMultiplayer.lllIIlIIllIlIl[1] != 0;
    }
    
    private void connectToServer(final ServerData llllllllllllIlIllllIllIIlIlIIIlI) {
        this.mc.displayGuiScreen(new GuiConnecting(this, this.mc, llllllllllllIlIllllIllIIlIlIIIlI));
    }
    
    public void createButtons() {
        final List<GuiButton> buttonList = this.buttonList;
        final GuiButton btnEditServer = new GuiButton(GuiMultiplayer.lllIIlIIllIlIl[5], this.width / GuiMultiplayer.lllIIlIIllIlIl[6] - GuiMultiplayer.lllIIlIIllIlIl[7], this.height - GuiMultiplayer.lllIIlIIllIlIl[8], GuiMultiplayer.lllIIlIIllIlIl[9], GuiMultiplayer.lllIIlIIllIlIl[10], I18n.format(GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[0]], new Object[GuiMultiplayer.lllIIlIIllIlIl[1]]));
        this.btnEditServer = btnEditServer;
        buttonList.add(btnEditServer);
        "".length();
        final List<GuiButton> buttonList2 = this.buttonList;
        final GuiButton btnDeleteServer = new GuiButton(GuiMultiplayer.lllIIlIIllIlIl[6], this.width / GuiMultiplayer.lllIIlIIllIlIl[6] - GuiMultiplayer.lllIIlIIllIlIl[11], this.height - GuiMultiplayer.lllIIlIIllIlIl[8], GuiMultiplayer.lllIIlIIllIlIl[9], GuiMultiplayer.lllIIlIIllIlIl[10], I18n.format(GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[6]], new Object[GuiMultiplayer.lllIIlIIllIlIl[1]]));
        this.btnDeleteServer = btnDeleteServer;
        buttonList2.add(btnDeleteServer);
        "".length();
        final List<GuiButton> buttonList3 = this.buttonList;
        final GuiButton btnSelectServer = new GuiButton(GuiMultiplayer.lllIIlIIllIlIl[0], this.width / GuiMultiplayer.lllIIlIIllIlIl[6] - GuiMultiplayer.lllIIlIIllIlIl[7], this.height - GuiMultiplayer.lllIIlIIllIlIl[12], GuiMultiplayer.lllIIlIIllIlIl[13], GuiMultiplayer.lllIIlIIllIlIl[10], I18n.format(GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[14]], new Object[GuiMultiplayer.lllIIlIIllIlIl[1]]));
        this.btnSelectServer = btnSelectServer;
        buttonList3.add(btnSelectServer);
        "".length();
        this.buttonList.add(new GuiButton(GuiMultiplayer.lllIIlIIllIlIl[15], this.width / GuiMultiplayer.lllIIlIIllIlIl[6] - GuiMultiplayer.lllIIlIIllIlIl[16], this.height - GuiMultiplayer.lllIIlIIllIlIl[12], GuiMultiplayer.lllIIlIIllIlIl[13], GuiMultiplayer.lllIIlIIllIlIl[10], I18n.format(GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[15]], new Object[GuiMultiplayer.lllIIlIIllIlIl[1]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiMultiplayer.lllIIlIIllIlIl[14], this.width / GuiMultiplayer.lllIIlIIllIlIl[6] + GuiMultiplayer.lllIIlIIllIlIl[15] + GuiMultiplayer.lllIIlIIllIlIl[16], this.height - GuiMultiplayer.lllIIlIIllIlIl[12], GuiMultiplayer.lllIIlIIllIlIl[13], GuiMultiplayer.lllIIlIIllIlIl[10], I18n.format(GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[17]], new Object[GuiMultiplayer.lllIIlIIllIlIl[1]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiMultiplayer.lllIIlIIllIlIl[18], this.width / GuiMultiplayer.lllIIlIIllIlIl[6] + GuiMultiplayer.lllIIlIIllIlIl[15], this.height - GuiMultiplayer.lllIIlIIllIlIl[8], GuiMultiplayer.lllIIlIIllIlIl[9], GuiMultiplayer.lllIIlIIllIlIl[10], I18n.format(GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[19]], new Object[GuiMultiplayer.lllIIlIIllIlIl[1]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiMultiplayer.lllIIlIIllIlIl[1], this.width / GuiMultiplayer.lllIIlIIllIlIl[6] + GuiMultiplayer.lllIIlIIllIlIl[15] + GuiMultiplayer.lllIIlIIllIlIl[20], this.height - GuiMultiplayer.lllIIlIIllIlIl[8], GuiMultiplayer.lllIIlIIllIlIl[21], GuiMultiplayer.lllIIlIIllIlIl[10], I18n.format(GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[5]], new Object[GuiMultiplayer.lllIIlIIllIlIl[1]])));
        "".length();
        this.selectServer(this.serverListSelector.func_148193_k());
    }
    
    public void func_175391_a(final ServerListEntryNormal llllllllllllIlIllllIllIIIllIIIll, final int llllllllllllIlIllllIllIIIlIllllI, final boolean llllllllllllIlIllllIllIIIllIIIIl) {
        int n;
        if (lIIlllllIlIlIlIl(llllllllllllIlIllllIllIIIllIIIIl ? 1 : 0)) {
            n = GuiMultiplayer.lllIIlIIllIlIl[1];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            n = llllllllllllIlIllllIllIIIlIllllI - GuiMultiplayer.lllIIlIIllIlIl[0];
        }
        final int llllllllllllIlIllllIllIIIllIIIII = n;
        this.savedServerList.swapServers(llllllllllllIlIllllIllIIIlIllllI, llllllllllllIlIllllIllIIIllIIIII);
        if (lIIlllllIlIllIII(this.serverListSelector.func_148193_k(), llllllllllllIlIllllIllIIIlIllllI)) {
            this.selectServer(llllllllllllIlIllllIllIIIllIIIII);
        }
        this.serverListSelector.func_148195_a(this.savedServerList);
    }
    
    public boolean func_175392_a(final ServerListEntryNormal llllllllllllIlIllllIllIIIlllIIlI, final int llllllllllllIlIllllIllIIIlllIIIl) {
        if (lIIlllllIlIllIll(llllllllllllIlIllllIllIIIlllIIIl)) {
            return GuiMultiplayer.lllIIlIIllIlIl[0] != 0;
        }
        return GuiMultiplayer.lllIIlIIllIlIl[1] != 0;
    }
    
    public void func_175393_b(final ServerListEntryNormal llllllllllllIlIllllIllIIIlIlIllI, final int llllllllllllIlIllllIllIIIlIlIIIl, final boolean llllllllllllIlIllllIllIIIlIlIlII) {
        int n;
        if (lIIlllllIlIlIlIl(llllllllllllIlIllllIllIIIlIlIlII ? 1 : 0)) {
            n = this.savedServerList.countServers() - GuiMultiplayer.lllIIlIIllIlIl[0];
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        else {
            n = llllllllllllIlIllllIllIIIlIlIIIl + GuiMultiplayer.lllIIlIIllIlIl[0];
        }
        final int llllllllllllIlIllllIllIIIlIlIIll = n;
        this.savedServerList.swapServers(llllllllllllIlIllllIllIIIlIlIIIl, llllllllllllIlIllllIllIIIlIlIIll);
        if (lIIlllllIlIllIII(this.serverListSelector.func_148193_k(), llllllllllllIlIllllIllIIIlIlIIIl)) {
            this.selectServer(llllllllllllIlIllllIllIIIlIlIIll);
        }
        this.serverListSelector.func_148195_a(this.savedServerList);
    }
    
    @Override
    public void initGui() {
        Keyboard.enableRepeatEvents((boolean)(GuiMultiplayer.lllIIlIIllIlIl[0] != 0));
        this.buttonList.clear();
        if (lIIlllllIlIlIlII(this.initialized ? 1 : 0)) {
            this.initialized = (GuiMultiplayer.lllIIlIIllIlIl[0] != 0);
            this.savedServerList = new ServerList(this.mc);
            this.savedServerList.loadServerList();
            this.lanServerList = new LanServerDetector.LanServerList();
            try {
                this.lanServerDetector = new LanServerDetector.ThreadLanServerFind(this.lanServerList);
                this.lanServerDetector.start();
                "".length();
                if (((0x3E ^ 0x48 ^ (0x66 ^ 0x2A)) & (0x30 ^ 0x13 ^ (0x7A ^ 0x63) ^ -" ".length())) >= "   ".length()) {
                    return;
                }
            }
            catch (Exception llllllllllllIlIllllIllIlIIIIlIIl) {
                GuiMultiplayer.logger.warn(String.valueOf(new StringBuilder(GuiMultiplayer.lllIIlIIllIIlI[GuiMultiplayer.lllIIlIIllIlIl[1]]).append(llllllllllllIlIllllIllIlIIIIlIIl.getMessage())));
            }
            this.serverListSelector = new ServerSelectionList(this, this.mc, this.width, this.height, GuiMultiplayer.lllIIlIIllIlIl[2], this.height - GuiMultiplayer.lllIIlIIllIlIl[3], GuiMultiplayer.lllIIlIIllIlIl[4]);
            this.serverListSelector.func_148195_a(this.savedServerList);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.serverListSelector.setDimensions(this.width, this.height, GuiMultiplayer.lllIIlIIllIlIl[2], this.height - GuiMultiplayer.lllIIlIIllIlIl[3]);
        }
        this.createButtons();
    }
    
    @Override
    protected void mouseReleased(final int llllllllllllIlIllllIllIIIllllllI, final int llllllllllllIlIllllIllIIIllllIIl, final int llllllllllllIlIllllIllIIIllllIII) {
        super.mouseReleased(llllllllllllIlIllllIllIIIllllllI, llllllllllllIlIllllIllIIIllllIIl, llllllllllllIlIllllIllIIIllllIII);
        this.serverListSelector.mouseReleased(llllllllllllIlIllllIllIIIllllllI, llllllllllllIlIllllIllIIIllllIIl, llllllllllllIlIllllIllIIIllllIII);
        "".length();
    }
    
    private static boolean lIIlllllIlIlIlIl(final int llllllllllllIlIllllIllIIIIIlIIIl) {
        return llllllllllllIlIllllIllIIIIIlIIIl != 0;
    }
    
    private static boolean lIIlllllIlIlllII(final int llllllllllllIlIllllIllIIIIIlIllI, final int llllllllllllIlIllllIllIIIIIlIlIl) {
        return llllllllllllIlIllllIllIIIIIlIllI < llllllllllllIlIllllIllIIIIIlIlIl;
    }
}
