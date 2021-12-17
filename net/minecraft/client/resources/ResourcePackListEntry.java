// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources;

import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.gui.GuiYesNo;
import java.util.List;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiYesNoCallback;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.GuiScreenResourcePacks;
import net.minecraft.util.IChatComponent;
import net.minecraft.client.gui.GuiListExtended;

public abstract class ResourcePackListEntry implements GuiListExtended.IGuiListEntry
{
    private static final /* synthetic */ IChatComponent field_183020_d;
    protected final /* synthetic */ GuiScreenResourcePacks resourcePacksGUI;
    private static final /* synthetic */ ResourceLocation RESOURCE_PACKS_TEXTURE;
    private static final /* synthetic */ IChatComponent field_183021_e;
    private static final /* synthetic */ IChatComponent field_183022_f;
    protected final /* synthetic */ Minecraft mc;
    private static final /* synthetic */ int[] lIlIIIllIlIIII;
    private static final /* synthetic */ String[] lIlIIIIlIIIlII;
    
    @Override
    public boolean mousePressed(final int lllllllllllllIIIllllIIlIlIIIIIII, final int lllllllllllllIIIllllIIlIIlllllll, final int lllllllllllllIIIllllIIlIIllllllI, final int lllllllllllllIIIllllIIlIIlllllIl, final int lllllllllllllIIIllllIIlIIlllIIlI, final int lllllllllllllIIIllllIIlIIllllIll) {
        if (lllIIIlllIlIIlI(this.func_148310_d() ? 1 : 0) && lllIIIlllIllIII(lllllllllllllIIIllllIIlIIlllIIlI, ResourcePackListEntry.lIlIIIllIlIIII[6])) {
            if (lllIIIlllIlIIlI(this.func_148309_e() ? 1 : 0)) {
                this.resourcePacksGUI.markChanged();
                final int lllllllllllllIIIllllIIlIIllllIlI = this.func_183019_a();
                if (lllIIIlllIlIIII(lllllllllllllIIIllllIIlIIllllIlI, ResourcePackListEntry.lIlIIIllIlIIII[1])) {
                    final String lllllllllllllIIIllllIIlIIllllIIl = I18n.format(ResourcePackListEntry.lIlIIIIlIIIlII[ResourcePackListEntry.lIlIIIllIlIIII[16]], new Object[ResourcePackListEntry.lIlIIIllIlIIII[0]]);
                    final StringBuilder sb = new StringBuilder(ResourcePackListEntry.lIlIIIIlIIIlII[ResourcePackListEntry.lIlIIIllIlIIII[17]]);
                    String str;
                    if (lllIIIlllIlIlII(lllllllllllllIIIllllIIlIIllllIlI, ResourcePackListEntry.lIlIIIllIlIIII[1])) {
                        str = ResourcePackListEntry.lIlIIIIlIIIlII[ResourcePackListEntry.lIlIIIllIlIIII[18]];
                        "".length();
                        if (((0xF2 ^ 0xA6 ^ (0x60 ^ 0x30)) & (0x44 ^ 0x64 ^ (0x1E ^ 0x3A) ^ -" ".length())) != 0x0) {
                            return ((0x53 ^ 0xE ^ (0x17 ^ 0x57)) & (0x3E ^ 0x7C ^ (0xC7 ^ 0x98) ^ -" ".length())) != 0x0;
                        }
                    }
                    else {
                        str = ResourcePackListEntry.lIlIIIIlIIIlII[ResourcePackListEntry.lIlIIIllIlIIII[4]];
                    }
                    final String lllllllllllllIIIllllIIlIIllllIII = I18n.format(String.valueOf(sb.append(str)), new Object[ResourcePackListEntry.lIlIIIllIlIIII[0]]);
                    this.mc.displayGuiScreen(new GuiYesNo(new GuiYesNoCallback() {
                        private static final /* synthetic */ int[] llIIIlllIlIlII;
                        
                        static {
                            lIIIlIlIlllIlIll();
                        }
                        
                        private static void lIIIlIlIlllIlIll() {
                            (llIIIlllIlIlII = new int[1])[0] = ((0x5A ^ 0x55) & ~(0xB0 ^ 0xBF));
                        }
                        
                        private static boolean lIIIlIlIlllIllII(final int llllllllllllIlllIlIIIIIlIIIllIII) {
                            return llllllllllllIlllIlIIIIIlIIIllIII != 0;
                        }
                        
                        @Override
                        public void confirmClicked(final boolean llllllllllllIlllIlIIIIIlIIIlllll, final int llllllllllllIlllIlIIIIIlIIIllllI) {
                            final List<ResourcePackListEntry> llllllllllllIlllIlIIIIIlIIIlllIl = ResourcePackListEntry.this.resourcePacksGUI.getListContaining(ResourcePackListEntry.this);
                            ResourcePackListEntry.this.mc.displayGuiScreen(ResourcePackListEntry.this.resourcePacksGUI);
                            if (lIIIlIlIlllIllII(llllllllllllIlllIlIIIIIlIIIlllll ? 1 : 0)) {
                                llllllllllllIlllIlIIIIIlIIIlllIl.remove(ResourcePackListEntry.this);
                                "".length();
                                ResourcePackListEntry.this.resourcePacksGUI.getSelectedResourcePacks().add(ResourcePackListEntry$1.llIIIlllIlIlII[0], ResourcePackListEntry.this);
                            }
                        }
                    }, lllllllllllllIIIllllIIlIIllllIIl, lllllllllllllIIIllllIIlIIllllIII, ResourcePackListEntry.lIlIIIllIlIIII[0]));
                    "".length();
                    if (-"  ".length() >= 0) {
                        return ((0x7C ^ 0x38) & ~(0x3E ^ 0x7A)) != 0x0;
                    }
                }
                else {
                    this.resourcePacksGUI.getListContaining(this).remove(this);
                    "".length();
                    this.resourcePacksGUI.getSelectedResourcePacks().add(ResourcePackListEntry.lIlIIIllIlIIII[0], this);
                }
                return ResourcePackListEntry.lIlIIIllIlIIII[1] != 0;
            }
            if (lllIIIlllIlIIll(lllllllllllllIIIllllIIlIIlllIIlI, ResourcePackListEntry.lIlIIIllIlIIII[8]) && lllIIIlllIlIIlI(this.func_148308_f() ? 1 : 0)) {
                this.resourcePacksGUI.getListContaining(this).remove(this);
                "".length();
                this.resourcePacksGUI.getAvailableResourcePacks().add(ResourcePackListEntry.lIlIIIllIlIIII[0], this);
                this.resourcePacksGUI.markChanged();
                return ResourcePackListEntry.lIlIIIllIlIIII[1] != 0;
            }
            if (lllIIIlllIlIlII(lllllllllllllIIIllllIIlIIlllIIlI, ResourcePackListEntry.lIlIIIllIlIIII[8]) && lllIIIlllIlIIll(lllllllllllllIIIllllIIlIIllllIll, ResourcePackListEntry.lIlIIIllIlIIII[8]) && lllIIIlllIlIIlI(this.func_148314_g() ? 1 : 0)) {
                final List<ResourcePackListEntry> lllllllllllllIIIllllIIlIIlllIlll = this.resourcePacksGUI.getListContaining(this);
                final int lllllllllllllIIIllllIIlIIlllIllI = lllllllllllllIIIllllIIlIIlllIlll.indexOf(this);
                lllllllllllllIIIllllIIlIIlllIlll.remove(this);
                "".length();
                lllllllllllllIIIllllIIlIIlllIlll.add(lllllllllllllIIIllllIIlIIlllIllI - ResourcePackListEntry.lIlIIIllIlIIII[1], this);
                this.resourcePacksGUI.markChanged();
                return ResourcePackListEntry.lIlIIIllIlIIII[1] != 0;
            }
            if (lllIIIlllIlIlII(lllllllllllllIIIllllIIlIIlllIIlI, ResourcePackListEntry.lIlIIIllIlIIII[8]) && lllIIIlllIlIlII(lllllllllllllIIIllllIIlIIllllIll, ResourcePackListEntry.lIlIIIllIlIIII[8]) && lllIIIlllIlIIlI(this.func_148307_h() ? 1 : 0)) {
                final List<ResourcePackListEntry> lllllllllllllIIIllllIIlIIlllIlIl = this.resourcePacksGUI.getListContaining(this);
                final int lllllllllllllIIIllllIIlIIlllIlII = lllllllllllllIIIllllIIlIIlllIlIl.indexOf(this);
                lllllllllllllIIIllllIIlIIlllIlIl.remove(this);
                "".length();
                lllllllllllllIIIllllIIlIIlllIlIl.add(lllllllllllllIIIllllIIlIIlllIlII + ResourcePackListEntry.lIlIIIllIlIIII[1], this);
                this.resourcePacksGUI.markChanged();
                return ResourcePackListEntry.lIlIIIllIlIIII[1] != 0;
            }
        }
        return ResourcePackListEntry.lIlIIIllIlIIII[0] != 0;
    }
    
    private static boolean lllIIIlllIlIIll(final int lllllllllllllIIIllllIIlIIIlIlIlI, final int lllllllllllllIIIllllIIlIIIlIlIIl) {
        return lllllllllllllIIIllllIIlIIIlIlIlI < lllllllllllllIIIllllIIlIIIlIlIIl;
    }
    
    protected abstract void func_148313_c();
    
    @Override
    public void mouseReleased(final int lllllllllllllIIIllllIIlIIllIlIII, final int lllllllllllllIIIllllIIlIIllIIlll, final int lllllllllllllIIIllllIIlIIllIIllI, final int lllllllllllllIIIllllIIlIIllIIlIl, final int lllllllllllllIIIllllIIlIIllIIlII, final int lllllllllllllIIIllllIIlIIllIIIll) {
    }
    
    protected abstract String func_148311_a();
    
    private static boolean lllIIIlllIlIllI(final int lllllllllllllIIIllllIIlIIIIllIIl) {
        return lllllllllllllIIIllllIIlIIIIllIIl > 0;
    }
    
    private static String lllIIIIlIIlIIII(final String lllllllllllllIIIllllIIlIIlIIlllI, final String lllllllllllllIIIllllIIlIIlIIlIll) {
        try {
            final SecretKeySpec lllllllllllllIIIllllIIlIIlIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllllIIlIIlIIlIll.getBytes(StandardCharsets.UTF_8)), ResourcePackListEntry.lIlIIIllIlIIII[18]), "DES");
            final Cipher lllllllllllllIIIllllIIlIIlIlIIII = Cipher.getInstance("DES");
            lllllllllllllIIIllllIIlIIlIlIIII.init(ResourcePackListEntry.lIlIIIllIlIIII[2], lllllllllllllIIIllllIIlIIlIlIIIl);
            return new String(lllllllllllllIIIllllIIlIIlIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllllIIlIIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllllIIlIIlIIllll) {
            lllllllllllllIIIllllIIlIIlIIllll.printStackTrace();
            return null;
        }
    }
    
    protected boolean func_148314_g() {
        final List<ResourcePackListEntry> lllllllllllllIIIllllIIlIlIIlIlIl = this.resourcePacksGUI.getListContaining(this);
        final int lllllllllllllIIIllllIIlIlIIlIlII = lllllllllllllIIIllllIIlIlIIlIlIl.indexOf(this);
        if (lllIIIlllIlIllI(lllllllllllllIIIllllIIlIlIIlIlII) && lllIIIlllIlIIlI(lllllllllllllIIIllllIIlIlIIlIlIl.get(lllllllllllllIIIllllIIlIlIIlIlII - ResourcePackListEntry.lIlIIIllIlIIII[1]).func_148310_d() ? 1 : 0)) {
            return ResourcePackListEntry.lIlIIIllIlIIII[1] != 0;
        }
        return ResourcePackListEntry.lIlIIIllIlIIII[0] != 0;
    }
    
    @Override
    public void drawEntry(final int lllllllllllllIIIllllIIlIlIlllllI, final int lllllllllllllIIIllllIIlIlIlIllIl, final int lllllllllllllIIIllllIIlIlIlIllII, final int lllllllllllllIIIllllIIlIlIlllIll, final int lllllllllllllIIIllllIIlIlIlIlIlI, final int lllllllllllllIIIllllIIlIlIlIlIIl, final int lllllllllllllIIIllllIIlIlIlIlIII, final boolean lllllllllllllIIIllllIIlIlIlIIlll) {
        final int lllllllllllllIIIllllIIlIlIllIllI = this.func_183019_a();
        if (lllIIIlllIlIIII(lllllllllllllIIIllllIIlIlIllIllI, ResourcePackListEntry.lIlIIIllIlIIII[1])) {
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            Gui.drawRect(lllllllllllllIIIllllIIlIlIlIllIl - ResourcePackListEntry.lIlIIIllIlIIII[1], lllllllllllllIIIllllIIlIlIlIllII - ResourcePackListEntry.lIlIIIllIlIIII[1], lllllllllllllIIIllllIIlIlIlIllIl + lllllllllllllIIIllllIIlIlIlllIll - ResourcePackListEntry.lIlIIIllIlIIII[4], lllllllllllllIIIllllIIlIlIlIllII + lllllllllllllIIIllllIIlIlIlIlIlI + ResourcePackListEntry.lIlIIIllIlIIII[1], ResourcePackListEntry.lIlIIIllIlIIII[5]);
        }
        this.func_148313_c();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        Gui.drawModalRectWithCustomSizedTexture(lllllllllllllIIIllllIIlIlIlIllIl, lllllllllllllIIIllllIIlIlIlIllII, 0.0f, 0.0f, ResourcePackListEntry.lIlIIIllIlIIII[6], ResourcePackListEntry.lIlIIIllIlIIII[6], 32.0f, 32.0f);
        String lllllllllllllIIIllllIIlIlIllIlIl = this.func_148312_b();
        String lllllllllllllIIIllllIIlIlIllIlII = this.func_148311_a();
        if ((!lllIIIlllIlIIIl(this.mc.gameSettings.touchscreen ? 1 : 0) || lllIIIlllIlIIlI(lllllllllllllIIIllllIIlIlIlIIlll ? 1 : 0)) && lllIIIlllIlIIlI(this.func_148310_d() ? 1 : 0)) {
            this.mc.getTextureManager().bindTexture(ResourcePackListEntry.RESOURCE_PACKS_TEXTURE);
            Gui.drawRect(lllllllllllllIIIllllIIlIlIlIllIl, lllllllllllllIIIllllIIlIlIlIllII, lllllllllllllIIIllllIIlIlIlIllIl + ResourcePackListEntry.lIlIIIllIlIIII[6], lllllllllllllIIIllllIIlIlIlIllII + ResourcePackListEntry.lIlIIIllIlIIII[6], ResourcePackListEntry.lIlIIIllIlIIII[7]);
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            final int lllllllllllllIIIllllIIlIlIllIIll = lllllllllllllIIIllllIIlIlIlIlIIl - lllllllllllllIIIllllIIlIlIlIllIl;
            final int lllllllllllllIIIllllIIlIlIllIIlI = lllllllllllllIIIllllIIlIlIlIlIII - lllllllllllllIIIllllIIlIlIlIllII;
            if (lllIIIlllIlIIll(lllllllllllllIIIllllIIlIlIllIllI, ResourcePackListEntry.lIlIIIllIlIIII[1])) {
                lllllllllllllIIIllllIIlIlIllIlIl = ResourcePackListEntry.field_183020_d.getFormattedText();
                lllllllllllllIIIllllIIlIlIllIlII = ResourcePackListEntry.field_183021_e.getFormattedText();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (lllIIIlllIlIlII(lllllllllllllIIIllllIIlIlIllIllI, ResourcePackListEntry.lIlIIIllIlIIII[1])) {
                lllllllllllllIIIllllIIlIlIllIlIl = ResourcePackListEntry.field_183020_d.getFormattedText();
                lllllllllllllIIIllllIIlIlIllIlII = ResourcePackListEntry.field_183022_f.getFormattedText();
            }
            if (lllIIIlllIlIIlI(this.func_148309_e() ? 1 : 0)) {
                if (lllIIIlllIlIIll(lllllllllllllIIIllllIIlIlIllIIll, ResourcePackListEntry.lIlIIIllIlIIII[6])) {
                    Gui.drawModalRectWithCustomSizedTexture(lllllllllllllIIIllllIIlIlIlIllIl, lllllllllllllIIIllllIIlIlIlIllII, 0.0f, 32.0f, ResourcePackListEntry.lIlIIIllIlIIII[6], ResourcePackListEntry.lIlIIIllIlIIII[6], 256.0f, 256.0f);
                    "".length();
                    if ("   ".length() < 0) {
                        return;
                    }
                }
                else {
                    Gui.drawModalRectWithCustomSizedTexture(lllllllllllllIIIllllIIlIlIlIllIl, lllllllllllllIIIllllIIlIlIlIllII, 0.0f, 0.0f, ResourcePackListEntry.lIlIIIllIlIIII[6], ResourcePackListEntry.lIlIIIllIlIIII[6], 256.0f, 256.0f);
                    "".length();
                    if ("  ".length() == ((0x40 ^ 0x68) & ~(0x9A ^ 0xB2))) {
                        return;
                    }
                }
            }
            else {
                if (lllIIIlllIlIIlI(this.func_148308_f() ? 1 : 0)) {
                    if (lllIIIlllIlIIll(lllllllllllllIIIllllIIlIlIllIIll, ResourcePackListEntry.lIlIIIllIlIIII[8])) {
                        Gui.drawModalRectWithCustomSizedTexture(lllllllllllllIIIllllIIlIlIlIllIl, lllllllllllllIIIllllIIlIlIlIllII, 32.0f, 32.0f, ResourcePackListEntry.lIlIIIllIlIIII[6], ResourcePackListEntry.lIlIIIllIlIIII[6], 256.0f, 256.0f);
                        "".length();
                        if ((107 + 102 - 168 + 107 ^ 69 + 109 - 109 + 75) <= ((60 + 102 - 4 + 49 ^ 128 + 0 - 11 + 16) & (102 + 56 - 111 + 80 ^ (0x0 ^ 0x35) ^ -" ".length()))) {
                            return;
                        }
                    }
                    else {
                        Gui.drawModalRectWithCustomSizedTexture(lllllllllllllIIIllllIIlIlIlIllIl, lllllllllllllIIIllllIIlIlIlIllII, 32.0f, 0.0f, ResourcePackListEntry.lIlIIIllIlIIII[6], ResourcePackListEntry.lIlIIIllIlIIII[6], 256.0f, 256.0f);
                    }
                }
                if (lllIIIlllIlIIlI(this.func_148314_g() ? 1 : 0)) {
                    if (lllIIIlllIlIIll(lllllllllllllIIIllllIIlIlIllIIll, ResourcePackListEntry.lIlIIIllIlIIII[6]) && lllIIIlllIlIlII(lllllllllllllIIIllllIIlIlIllIIll, ResourcePackListEntry.lIlIIIllIlIIII[8]) && lllIIIlllIlIIll(lllllllllllllIIIllllIIlIlIllIIlI, ResourcePackListEntry.lIlIIIllIlIIII[8])) {
                        Gui.drawModalRectWithCustomSizedTexture(lllllllllllllIIIllllIIlIlIlIllIl, lllllllllllllIIIllllIIlIlIlIllII, 96.0f, 32.0f, ResourcePackListEntry.lIlIIIllIlIIII[6], ResourcePackListEntry.lIlIIIllIlIIII[6], 256.0f, 256.0f);
                        "".length();
                        if (-(98 + 45 - 107 + 121 ^ 134 + 21 - 56 + 54) > 0) {
                            return;
                        }
                    }
                    else {
                        Gui.drawModalRectWithCustomSizedTexture(lllllllllllllIIIllllIIlIlIlIllIl, lllllllllllllIIIllllIIlIlIlIllII, 96.0f, 0.0f, ResourcePackListEntry.lIlIIIllIlIIII[6], ResourcePackListEntry.lIlIIIllIlIIII[6], 256.0f, 256.0f);
                    }
                }
                if (lllIIIlllIlIIlI(this.func_148307_h() ? 1 : 0)) {
                    if (lllIIIlllIlIIll(lllllllllllllIIIllllIIlIlIllIIll, ResourcePackListEntry.lIlIIIllIlIIII[6]) && lllIIIlllIlIlII(lllllllllllllIIIllllIIlIlIllIIll, ResourcePackListEntry.lIlIIIllIlIIII[8]) && lllIIIlllIlIlII(lllllllllllllIIIllllIIlIlIllIIlI, ResourcePackListEntry.lIlIIIllIlIIII[8])) {
                        Gui.drawModalRectWithCustomSizedTexture(lllllllllllllIIIllllIIlIlIlIllIl, lllllllllllllIIIllllIIlIlIlIllII, 64.0f, 32.0f, ResourcePackListEntry.lIlIIIllIlIIII[6], ResourcePackListEntry.lIlIIIllIlIIII[6], 256.0f, 256.0f);
                        "".length();
                        if (-" ".length() == "  ".length()) {
                            return;
                        }
                    }
                    else {
                        Gui.drawModalRectWithCustomSizedTexture(lllllllllllllIIIllllIIlIlIlIllIl, lllllllllllllIIIllllIIlIlIlIllII, 64.0f, 0.0f, ResourcePackListEntry.lIlIIIllIlIIII[6], ResourcePackListEntry.lIlIIIllIlIIII[6], 256.0f, 256.0f);
                    }
                }
            }
        }
        final int lllllllllllllIIIllllIIlIlIllIIIl = this.mc.fontRendererObj.getStringWidth(lllllllllllllIIIllllIIlIlIllIlIl);
        if (lllIIIlllIlIlII(lllllllllllllIIIllllIIlIlIllIIIl, ResourcePackListEntry.lIlIIIllIlIIII[9])) {
            lllllllllllllIIIllllIIlIlIllIlIl = String.valueOf(new StringBuilder(String.valueOf(this.mc.fontRendererObj.trimStringToWidth(lllllllllllllIIIllllIIlIlIllIlIl, ResourcePackListEntry.lIlIIIllIlIIII[9] - this.mc.fontRendererObj.getStringWidth(ResourcePackListEntry.lIlIIIIlIIIlII[ResourcePackListEntry.lIlIIIllIlIIII[10]])))).append(ResourcePackListEntry.lIlIIIIlIIIlII[ResourcePackListEntry.lIlIIIllIlIIII[11]]));
        }
        this.mc.fontRendererObj.drawStringWithShadow(lllllllllllllIIIllllIIlIlIllIlIl, (float)(lllllllllllllIIIllllIIlIlIlIllIl + ResourcePackListEntry.lIlIIIllIlIIII[6] + ResourcePackListEntry.lIlIIIllIlIIII[2]), (float)(lllllllllllllIIIllllIIlIlIlIllII + ResourcePackListEntry.lIlIIIllIlIIII[1]), ResourcePackListEntry.lIlIIIllIlIIII[12]);
        "".length();
        final List<String> lllllllllllllIIIllllIIlIlIllIIII = this.mc.fontRendererObj.listFormattedStringToWidth(lllllllllllllIIIllllIIlIlIllIlII, ResourcePackListEntry.lIlIIIllIlIIII[9]);
        int lllllllllllllIIIllllIIlIlIlIllll = ResourcePackListEntry.lIlIIIllIlIIII[0];
        "".length();
        if (" ".length() < ((0x4B ^ 0x45) & ~(0x9 ^ 0x7))) {
            return;
        }
        while (lllIIIlllIlIIll(lllllllllllllIIIllllIIlIlIlIllll, ResourcePackListEntry.lIlIIIllIlIIII[2]) && !lllIIIlllIlIlIl(lllllllllllllIIIllllIIlIlIlIllll, lllllllllllllIIIllllIIlIlIllIIII.size())) {
            this.mc.fontRendererObj.drawStringWithShadow(lllllllllllllIIIllllIIlIlIllIIII.get(lllllllllllllIIIllllIIlIlIlIllll), (float)(lllllllllllllIIIllllIIlIlIlIllIl + ResourcePackListEntry.lIlIIIllIlIIII[6] + ResourcePackListEntry.lIlIIIllIlIIII[2]), (float)(lllllllllllllIIIllllIIlIlIlIllII + ResourcePackListEntry.lIlIIIllIlIIII[13] + ResourcePackListEntry.lIlIIIllIlIIII[14] * lllllllllllllIIIllllIIlIlIlIllll), ResourcePackListEntry.lIlIIIllIlIIII[15]);
            "".length();
            ++lllllllllllllIIIllllIIlIlIlIllll;
        }
    }
    
    protected boolean func_148309_e() {
        int n;
        if (lllIIIlllIlIIlI(this.resourcePacksGUI.hasResourcePackEntry(this) ? 1 : 0)) {
            n = ResourcePackListEntry.lIlIIIllIlIIII[0];
            "".length();
            if ((0xCB ^ 0x85 ^ (0xED ^ 0xA7)) <= "  ".length()) {
                return ((0x30 ^ 0x6D ^ (0x64 ^ 0x7B)) & (0x5C ^ 0x2C ^ (0x84 ^ 0xB6) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = ResourcePackListEntry.lIlIIIllIlIIII[1];
        }
        return n != 0;
    }
    
    private static String lllIIIIlIIlIIIl(final String lllllllllllllIIIllllIIlIIlIllIll, final String lllllllllllllIIIllllIIlIIlIllIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIllllIIlIIlIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllllIIlIIlIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllllIIlIIlIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllllIIlIIlIlllIl.init(ResourcePackListEntry.lIlIIIllIlIIII[2], lllllllllllllIIIllllIIlIIlIllllI);
            return new String(lllllllllllllIIIllllIIlIIlIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllllIIlIIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllllIIlIIlIlllII) {
            lllllllllllllIIIllllIIlIIlIlllII.printStackTrace();
            return null;
        }
    }
    
    protected boolean func_148307_h() {
        final List<ResourcePackListEntry> lllllllllllllIIIllllIIlIlIIIllII = this.resourcePacksGUI.getListContaining(this);
        final int lllllllllllllIIIllllIIlIlIIIlIll = lllllllllllllIIIllllIIlIlIIIllII.indexOf(this);
        if (lllIIIlllIlIlll(lllllllllllllIIIllllIIlIlIIIlIll) && lllIIIlllIlIIll(lllllllllllllIIIllllIIlIlIIIlIll, lllllllllllllIIIllllIIlIlIIIllII.size() - ResourcePackListEntry.lIlIIIllIlIIII[1]) && lllIIIlllIlIIlI(lllllllllllllIIIllllIIlIlIIIllII.get(lllllllllllllIIIllllIIlIlIIIlIll + ResourcePackListEntry.lIlIIIllIlIIII[1]).func_148310_d() ? 1 : 0)) {
            return ResourcePackListEntry.lIlIIIllIlIIII[1] != 0;
        }
        return ResourcePackListEntry.lIlIIIllIlIIII[0] != 0;
    }
    
    private static boolean lllIIIlllIlIIIl(final int lllllllllllllIIIllllIIlIIIIlllIl) {
        return lllllllllllllIIIllllIIlIIIIlllIl == 0;
    }
    
    private static boolean lllIIIlllIlIIII(final int lllllllllllllIIIllllIIlIIIIlIllI, final int lllllllllllllIIIllllIIlIIIIlIlIl) {
        return lllllllllllllIIIllllIIlIIIIlIllI != lllllllllllllIIIllllIIlIIIIlIlIl;
    }
    
    @Override
    public void setSelected(final int lllllllllllllIIIllllIIlIIllIllII, final int lllllllllllllIIIllllIIlIIllIlIll, final int lllllllllllllIIIllllIIlIIllIlIlI) {
    }
    
    protected boolean func_148310_d() {
        return ResourcePackListEntry.lIlIIIllIlIIII[1] != 0;
    }
    
    protected abstract int func_183019_a();
    
    protected abstract String func_148312_b();
    
    public ResourcePackListEntry(final GuiScreenResourcePacks lllllllllllllIIIllllIIlIllIIlllI) {
        this.resourcePacksGUI = lllllllllllllIIIllllIIlIllIIlllI;
        this.mc = Minecraft.getMinecraft();
    }
    
    private static void lllIIIlllIIllll() {
        (lIlIIIllIlIIII = new int[19])[0] = ((0x3A ^ 0x6D) & ~(0x50 ^ 0x7));
        ResourcePackListEntry.lIlIIIllIlIIII[1] = " ".length();
        ResourcePackListEntry.lIlIIIllIlIIII[2] = "  ".length();
        ResourcePackListEntry.lIlIIIllIlIIII[3] = "   ".length();
        ResourcePackListEntry.lIlIIIllIlIIII[4] = (0x35 ^ 0x3C);
        ResourcePackListEntry.lIlIIIllIlIIII[5] = -(-(0xFFFFDF6A & 0x7DDF) & (0xFFFFDF5F & 0x897DE9));
        ResourcePackListEntry.lIlIIIllIlIIII[6] = (128 + 69 - 98 + 82 ^ 36 + 136 - 121 + 98);
        ResourcePackListEntry.lIlIIIllIlIIII[7] = -(-(0xAD ^ 0xAA) & (0xFFFFFF7F & 0x5F6F6FF6));
        ResourcePackListEntry.lIlIIIllIlIIII[8] = (0x13 ^ 0x7C ^ 113 + 29 - 75 + 60);
        ResourcePackListEntry.lIlIIIllIlIIII[9] = 71 + 152 - 138 + 72;
        ResourcePackListEntry.lIlIIIllIlIIII[10] = (0 + 147 - 139 + 148 ^ 126 + 122 - 204 + 108);
        ResourcePackListEntry.lIlIIIllIlIIII[11] = (0xB7 ^ 0xA6 ^ (0xA7 ^ 0xB3));
        ResourcePackListEntry.lIlIIIllIlIIII[12] = (-" ".length() & (-1 & 0xFFFFFF));
        ResourcePackListEntry.lIlIIIllIlIIII[13] = (0x1B ^ 0x38 ^ (0x47 ^ 0x68));
        ResourcePackListEntry.lIlIIIllIlIIII[14] = (0xA5 ^ 0xAF);
        ResourcePackListEntry.lIlIIIllIlIIII[15] = (0xFFFFBFFC & 0x80C083);
        ResourcePackListEntry.lIlIIIllIlIIII[16] = (0x29 ^ 0x7C ^ (0x4D ^ 0x1E));
        ResourcePackListEntry.lIlIIIllIlIIII[17] = (0x7D ^ 0x47 ^ (0x81 ^ 0xBC));
        ResourcePackListEntry.lIlIIIllIlIIII[18] = (0x14 ^ 0x1F ^ "   ".length());
    }
    
    protected boolean func_148308_f() {
        return this.resourcePacksGUI.hasResourcePackEntry(this);
    }
    
    private static boolean lllIIIlllIlIIlI(final int lllllllllllllIIIllllIIlIIIIlllll) {
        return lllllllllllllIIIllllIIlIIIIlllll != 0;
    }
    
    private static String lllIIIIlIIlIIlI(String lllllllllllllIIIllllIIlIIIlllIIl, final String lllllllllllllIIIllllIIlIIIlllIII) {
        lllllllllllllIIIllllIIlIIIlllIIl = new String(Base64.getDecoder().decode(lllllllllllllIIIllllIIlIIIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllllIIlIIIllllII = new StringBuilder();
        final char[] lllllllllllllIIIllllIIlIIIlllIll = lllllllllllllIIIllllIIlIIIlllIII.toCharArray();
        int lllllllllllllIIIllllIIlIIIlllIlI = ResourcePackListEntry.lIlIIIllIlIIII[0];
        final String lllllllllllllIIIllllIIlIIIllIlII = (Object)lllllllllllllIIIllllIIlIIIlllIIl.toCharArray();
        final char lllllllllllllIIIllllIIlIIIllIIll = (char)lllllllllllllIIIllllIIlIIIllIlII.length;
        byte lllllllllllllIIIllllIIlIIIllIIlI = (byte)ResourcePackListEntry.lIlIIIllIlIIII[0];
        while (lllIIIlllIlIIll(lllllllllllllIIIllllIIlIIIllIIlI, lllllllllllllIIIllllIIlIIIllIIll)) {
            final char lllllllllllllIIIllllIIlIIIllllll = lllllllllllllIIIllllIIlIIIllIlII[lllllllllllllIIIllllIIlIIIllIIlI];
            lllllllllllllIIIllllIIlIIIllllII.append((char)(lllllllllllllIIIllllIIlIIIllllll ^ lllllllllllllIIIllllIIlIIIlllIll[lllllllllllllIIIllllIIlIIIlllIlI % lllllllllllllIIIllllIIlIIIlllIll.length]));
            "".length();
            ++lllllllllllllIIIllllIIlIIIlllIlI;
            ++lllllllllllllIIIllllIIlIIIllIIlI;
            "".length();
            if (((0x73 ^ 0x60) & ~(0x42 ^ 0x51)) != ((0x35 ^ 0x1D) & ~(0xAC ^ 0x84))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllllIIlIIIllllII);
    }
    
    private static boolean lllIIIlllIllIII(final int lllllllllllllIIIllllIIlIIIlIIllI, final int lllllllllllllIIIllllIIlIIIlIIlIl) {
        return lllllllllllllIIIllllIIlIIIlIIllI <= lllllllllllllIIIllllIIlIIIlIIlIl;
    }
    
    private static void lllIIIIlIIlIIll() {
        (lIlIIIIlIIIlII = new String[ResourcePackListEntry.lIlIIIllIlIIII[14]])[ResourcePackListEntry.lIlIIIllIlIIII[0]] = lllIIIIlIIlIIII("8ERr3YfPFmhb/BPAqhQ94K+Di8qp121A4UVXA9gpaSE=", "UeUrD");
        ResourcePackListEntry.lIlIIIIlIIIlII[ResourcePackListEntry.lIlIIIllIlIIII[1]] = lllIIIIlIIlIIIl("AVpoGTqUvJ1B+o+WWL+ClM9i/+6t9jTgvLllhFMkS5o=", "ETWpK");
        ResourcePackListEntry.lIlIIIIlIIIlII[ResourcePackListEntry.lIlIIIllIlIIII[2]] = lllIIIIlIIlIIlI("PBAENzk8FhIILS0eWTEiLRoaKC06HBU0KWAaGzw=", "NuwXL");
        ResourcePackListEntry.lIlIIIIlIIIlII[ResourcePackListEntry.lIlIIIllIlIIII[3]] = lllIIIIlIIlIIIl("sKvHLa2C/P5wQqxeQz00G4/xL3HSriwUJjxgE5/6E4c=", "HLbjp");
        ResourcePackListEntry.lIlIIIIlIIIlII[ResourcePackListEntry.lIlIIIllIlIIII[10]] = lllIIIIlIIlIIlI("TGl9", "bGSNa");
        ResourcePackListEntry.lIlIIIIlIIIlII[ResourcePackListEntry.lIlIIIllIlIIII[11]] = lllIIIIlIIlIIlI("ekNp", "TmGly");
        ResourcePackListEntry.lIlIIIIlIIIlII[ResourcePackListEntry.lIlIIIllIlIIII[16]] = lllIIIIlIIlIIlI("JCM1AiMkJSM9NzUtaAQ4NSkrHTciLyQBM3glKQMwPzQrQyI/MioI", "VFFmV");
        ResourcePackListEntry.lIlIIIIlIIIlII[ResourcePackListEntry.lIlIIIllIlIIII[17]] = lllIIIIlIIlIIII("m4/ucVTLeYc9Q89wOXsgz0pjKCWj6mBfDJAljTJ5M3lJZly6Q1XqCA==", "zfTXr");
        ResourcePackListEntry.lIlIIIIlIIIlII[ResourcePackListEntry.lIlIIIllIlIIII[18]] = lllIIIIlIIlIIII("Bhxedo9F4MA=", "RUPlA");
        ResourcePackListEntry.lIlIIIIlIIIlII[ResourcePackListEntry.lIlIIIllIlIIII[4]] = lllIIIIlIIlIIII("RgsGaZN4OsQ=", "pdmVj");
    }
    
    private static boolean lllIIIlllIlIlII(final int lllllllllllllIIIllllIIlIIIlIIIlI, final int lllllllllllllIIIllllIIlIIIlIIIIl) {
        return lllllllllllllIIIllllIIlIIIlIIIlI > lllllllllllllIIIllllIIlIIIlIIIIl;
    }
    
    static {
        lllIIIlllIIllll();
        lllIIIIlIIlIIll();
        RESOURCE_PACKS_TEXTURE = new ResourceLocation(ResourcePackListEntry.lIlIIIIlIIIlII[ResourcePackListEntry.lIlIIIllIlIIII[0]]);
        field_183020_d = new ChatComponentTranslation(ResourcePackListEntry.lIlIIIIlIIIlII[ResourcePackListEntry.lIlIIIllIlIIII[1]], new Object[ResourcePackListEntry.lIlIIIllIlIIII[0]]);
        field_183021_e = new ChatComponentTranslation(ResourcePackListEntry.lIlIIIIlIIIlII[ResourcePackListEntry.lIlIIIllIlIIII[2]], new Object[ResourcePackListEntry.lIlIIIllIlIIII[0]]);
        field_183022_f = new ChatComponentTranslation(ResourcePackListEntry.lIlIIIIlIIIlII[ResourcePackListEntry.lIlIIIllIlIIII[3]], new Object[ResourcePackListEntry.lIlIIIllIlIIII[0]]);
    }
    
    private static boolean lllIIIlllIlIlll(final int lllllllllllllIIIllllIIlIIIIllIll) {
        return lllllllllllllIIIllllIIlIIIIllIll >= 0;
    }
    
    private static boolean lllIIIlllIlIlIl(final int lllllllllllllIIIllllIIlIIIlIlllI, final int lllllllllllllIIIllllIIlIIIlIllIl) {
        return lllllllllllllIIIllllIIlIIIlIlllI >= lllllllllllllIIIllllIIlIIIlIllIl;
    }
}
