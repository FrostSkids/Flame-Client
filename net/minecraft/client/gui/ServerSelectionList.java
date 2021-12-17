// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Iterator;
import net.minecraft.client.multiplayer.ServerList;
import com.google.common.collect.Lists;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.LanServerDetector;
import java.util.List;

public class ServerSelectionList extends GuiListExtended
{
    private static final /* synthetic */ int[] lllIllIIlIlIlI;
    private final /* synthetic */ IGuiListEntry lanScanEntry;
    private final /* synthetic */ GuiMultiplayer owner;
    private /* synthetic */ int selectedSlotIndex;
    private final /* synthetic */ List<ServerListEntryLanDetected> field_148199_m;
    private final /* synthetic */ List<ServerListEntryNormal> field_148198_l;
    
    public void func_148194_a(final List<LanServerDetector.LanServer> llllllllllllIlIllIIllIIIllllllII) {
        this.field_148199_m.clear();
        final int llllllllllllIlIllIIllIIIlllllIlI = (int)llllllllllllIlIllIIllIIIllllllII.iterator();
        "".length();
        if ((0x66 ^ 0x63) == 0x0) {
            return;
        }
        while (!lIlIIlIIIllIlIIl(((Iterator)llllllllllllIlIllIIllIIIlllllIlI).hasNext() ? 1 : 0)) {
            final LanServerDetector.LanServer llllllllllllIlIllIIllIIIlllllllI = ((Iterator<LanServerDetector.LanServer>)llllllllllllIlIllIIllIIIlllllIlI).next();
            this.field_148199_m.add(new ServerListEntryLanDetected(this.owner, llllllllllllIlIllIIllIIIlllllllI));
            "".length();
        }
    }
    
    public ServerSelectionList(final GuiMultiplayer llllllllllllIlIllIIllIIlIIllIlII, final Minecraft llllllllllllIlIllIIllIIlIIllIIll, final int llllllllllllIlIllIIllIIlIIlIlIlI, final int llllllllllllIlIllIIllIIlIIllIIIl, final int llllllllllllIlIllIIllIIlIIlIlIII, final int llllllllllllIlIllIIllIIlIIlIIlll, final int llllllllllllIlIllIIllIIlIIlIlllI) {
        super(llllllllllllIlIllIIllIIlIIllIIll, llllllllllllIlIllIIllIIlIIlIlIlI, llllllllllllIlIllIIllIIlIIllIIIl, llllllllllllIlIllIIllIIlIIlIlIII, llllllllllllIlIllIIllIIlIIlIIlll, llllllllllllIlIllIIllIIlIIlIlllI);
        this.field_148198_l = (List<ServerListEntryNormal>)Lists.newArrayList();
        this.field_148199_m = (List<ServerListEntryLanDetected>)Lists.newArrayList();
        this.lanScanEntry = new ServerListEntryLanScan();
        this.selectedSlotIndex = ServerSelectionList.lllIllIIlIlIlI[0];
        this.owner = llllllllllllIlIllIIllIIlIIllIlII;
    }
    
    public int func_148193_k() {
        return this.selectedSlotIndex;
    }
    
    @Override
    protected boolean isSelected(final int llllllllllllIlIllIIllIIlIIIlIIIl) {
        if (lIlIIlIIIllIlIlI(llllllllllllIlIllIIllIIlIIIlIIIl, this.selectedSlotIndex)) {
            return ServerSelectionList.lllIllIIlIlIlI[1] != 0;
        }
        return ServerSelectionList.lllIllIIlIlIlI[2] != 0;
    }
    
    private static boolean lIlIIlIIIllIlIll(final int llllllllllllIlIllIIllIIIlllIllIl, final int llllllllllllIlIllIIllIIIlllIllII) {
        return llllllllllllIlIllIIllIIIlllIllIl >= llllllllllllIlIllIIllIIIlllIllII;
    }
    
    public void setSelectedSlotIndex(final int llllllllllllIlIllIIllIIlIIIllIIl) {
        this.selectedSlotIndex = llllllllllllIlIllIIllIIlIIIllIIl;
    }
    
    public void func_148195_a(final ServerList llllllllllllIlIllIIllIIlIIIIIllI) {
        this.field_148198_l.clear();
        int llllllllllllIlIllIIllIIlIIIIlIII = ServerSelectionList.lllIllIIlIlIlI[2];
        "".length();
        if (-" ".length() >= " ".length()) {
            return;
        }
        while (!lIlIIlIIIllIlIll(llllllllllllIlIllIIllIIlIIIIlIII, llllllllllllIlIllIIllIIlIIIIIllI.countServers())) {
            this.field_148198_l.add(new ServerListEntryNormal(this.owner, llllllllllllIlIllIIllIIlIIIIIllI.getServerData(llllllllllllIlIllIIllIIlIIIIlIII)));
            "".length();
            ++llllllllllllIlIllIIllIIlIIIIlIII;
        }
    }
    
    private static boolean lIlIIlIIIllIlIIl(final int llllllllllllIlIllIIllIIIlllIIllI) {
        return llllllllllllIlIllIIllIIIlllIIllI == 0;
    }
    
    @Override
    protected int getScrollBarX() {
        return super.getScrollBarX() + ServerSelectionList.lllIllIIlIlIlI[3];
    }
    
    static {
        lIlIIlIIIllIIlll();
    }
    
    private static void lIlIIlIIIllIIlll() {
        (lllIllIIlIlIlI = new int[5])[0] = -" ".length();
        ServerSelectionList.lllIllIIlIlIlI[1] = " ".length();
        ServerSelectionList.lllIllIIlIlIlI[2] = ((0x96 ^ 0x92) & ~(0x18 ^ 0x1C));
        ServerSelectionList.lllIllIIlIlIlI[3] = (0x84 ^ 0x9A);
        ServerSelectionList.lllIllIIlIlIlI[4] = (0xA0 ^ 0x96 ^ (0x21 ^ 0x42));
    }
    
    @Override
    public IGuiListEntry getListEntry(int llllllllllllIlIllIIllIIlIIlIIIlI) {
        if (lIlIIlIIIllIlIII(llllllllllllIlIllIIllIIlIIlIIIlI, this.field_148198_l.size())) {
            return this.field_148198_l.get(llllllllllllIlIllIIllIIlIIlIIIlI);
        }
        llllllllllllIlIllIIllIIlIIlIIIlI -= this.field_148198_l.size();
        if (lIlIIlIIIllIlIIl(llllllllllllIlIllIIllIIlIIlIIIlI)) {
            return this.lanScanEntry;
        }
        --llllllllllllIlIllIIllIIlIIlIIIlI;
        return this.field_148199_m.get(llllllllllllIlIllIIllIIlIIlIIIlI);
    }
    
    private static boolean lIlIIlIIIllIlIII(final int llllllllllllIlIllIIllIIIlllIlIIl, final int llllllllllllIlIllIIllIIIlllIlIII) {
        return llllllllllllIlIllIIllIIIlllIlIIl < llllllllllllIlIllIIllIIIlllIlIII;
    }
    
    private static boolean lIlIIlIIIllIlIlI(final int llllllllllllIlIllIIllIIIllllIIIl, final int llllllllllllIlIllIIllIIIllllIIII) {
        return llllllllllllIlIllIIllIIIllllIIIl == llllllllllllIlIllIIllIIIllllIIII;
    }
    
    @Override
    protected int getSize() {
        return this.field_148198_l.size() + ServerSelectionList.lllIllIIlIlIlI[1] + this.field_148199_m.size();
    }
    
    @Override
    public int getListWidth() {
        return super.getListWidth() + ServerSelectionList.lllIllIIlIlIlI[4];
    }
}
