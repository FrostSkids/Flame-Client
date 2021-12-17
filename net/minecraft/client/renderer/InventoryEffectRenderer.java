// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import java.util.Iterator;
import net.minecraft.inventory.Container;
import java.util.Collection;
import net.minecraft.client.resources.I18n;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.gui.inventory.GuiContainer;

public abstract class InventoryEffectRenderer extends GuiContainer
{
    private static final /* synthetic */ String[] llIlllllllIIIl;
    private /* synthetic */ boolean hasActivePotionEffects;
    private static final /* synthetic */ int[] llIlllllllIlII;
    
    private static String lIIllIlllIIlIIlI(final String llllllllllllIllIIIlIlIIlIlllllII, final String llllllllllllIllIIIlIlIIlIllllIIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIlIlIIlIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIlIIlIllllIIl.getBytes(StandardCharsets.UTF_8)), InventoryEffectRenderer.llIlllllllIlII[14]), "DES");
            final Cipher llllllllllllIllIIIlIlIIlIllllllI = Cipher.getInstance("DES");
            llllllllllllIllIIIlIlIIlIllllllI.init(InventoryEffectRenderer.llIlllllllIlII[2], llllllllllllIllIIIlIlIIlIlllllll);
            return new String(llllllllllllIllIIIlIlIIlIllllllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIlIIlIlllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIlIlIIlIlllllIl) {
            llllllllllllIllIIIlIlIIlIlllllIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIIllIlllIIlIlIl() {
        (llIlllllllIlII = new int[22])[0] = 142 + 28 - 12 + 2;
        InventoryEffectRenderer.llIlllllllIlII[1] = 165 + 142 - 247 + 140;
        InventoryEffectRenderer.llIlllllllIlII[2] = "  ".length();
        InventoryEffectRenderer.llIlllllllIlII[3] = " ".length();
        InventoryEffectRenderer.llIlllllllIlII[4] = ((0xF6 ^ 0x85 ^ (0xE0 ^ 0x82)) & (0x5C ^ 0x67 ^ (0x71 ^ 0x5B) ^ -" ".length()));
        InventoryEffectRenderer.llIlllllllIlII[5] = (89 + 0 - 27 + 163 ^ 113 + 56 - 93 + 81);
        InventoryEffectRenderer.llIlllllllIlII[6] = 4 + 139 - 5 + 28;
        InventoryEffectRenderer.llIlllllllIlII[7] = (0x3C ^ 0x1D);
        InventoryEffectRenderer.llIlllllllIlII[8] = (0x6A ^ 0x6F);
        InventoryEffectRenderer.llIlllllllIlII[9] = 33 + 107 - 136 + 128;
        InventoryEffectRenderer.llIlllllllIlII[10] = 3 + 70 + 30 + 37;
        InventoryEffectRenderer.llIlllllllIlII[11] = (0x7E ^ 0x5E);
        InventoryEffectRenderer.llIlllllllIlII[12] = (0x72 ^ 0x3B ^ (0x50 ^ 0x1F));
        InventoryEffectRenderer.llIlllllllIlII[13] = (0x33 ^ 0x34);
        InventoryEffectRenderer.llIlllllllIlII[14] = (0x27 ^ 0x2F);
        InventoryEffectRenderer.llIlllllllIlII[15] = (32 + 3 + 40 + 69 ^ 113 + 45 - 154 + 126);
        InventoryEffectRenderer.llIlllllllIlII[16] = 154 + 167 - 180 + 57;
        InventoryEffectRenderer.llIlllllllIlII[17] = "   ".length();
        InventoryEffectRenderer.llIlllllllIlII[18] = (0xE ^ 0x62 ^ (0x4B ^ 0x23));
        InventoryEffectRenderer.llIlllllllIlII[19] = (0x77 ^ 0x7D);
        InventoryEffectRenderer.llIlllllllIlII[20] = (-" ".length() & (-1 & 0xFFFFFF));
        InventoryEffectRenderer.llIlllllllIlII[21] = (-(110 + 122 - 145 + 42) & (-1 & 0x7F7FFF));
    }
    
    private static boolean lIIllIlllIIlIlll(final int llllllllllllIllIIIlIlIIlIlIIIlII) {
        return llllllllllllIllIIIlIlIIlIlIIIlII != 0;
    }
    
    private void drawActivePotionEffects() {
        final int llllllllllllIllIIIlIlIIllIIllIII = this.guiLeft - InventoryEffectRenderer.llIlllllllIlII[5];
        int llllllllllllIllIIIlIlIIllIIlIlll = this.guiTop;
        final int llllllllllllIllIIIlIlIIllIIlIllI = InventoryEffectRenderer.llIlllllllIlII[6];
        final Collection<PotionEffect> llllllllllllIllIIIlIlIIllIIlIlIl = this.mc.thePlayer.getActivePotionEffects();
        if (lIIllIlllIIlIllI(llllllllllllIllIIIlIlIIllIIlIlIl.isEmpty() ? 1 : 0)) {
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.disableLighting();
            int llllllllllllIllIIIlIlIIllIIlIlII = InventoryEffectRenderer.llIlllllllIlII[7];
            if (lIIllIlllIIllIII(llllllllllllIllIIIlIlIIllIIlIlIl.size(), InventoryEffectRenderer.llIlllllllIlII[8])) {
                llllllllllllIllIIIlIlIIllIIlIlII = InventoryEffectRenderer.llIlllllllIlII[9] / (llllllllllllIllIIIlIlIIllIIlIlIl.size() - InventoryEffectRenderer.llIlllllllIlII[3]);
            }
            final float llllllllllllIllIIIlIlIIllIIIIlll = (float)this.mc.thePlayer.getActivePotionEffects().iterator();
            "".length();
            if ("   ".length() < ((0xFC ^ 0xBB) & ~(0xF2 ^ 0xB5))) {
                return;
            }
            while (!lIIllIlllIIlIllI(((Iterator)llllllllllllIllIIIlIlIIllIIIIlll).hasNext() ? 1 : 0)) {
                final PotionEffect llllllllllllIllIIIlIlIIllIIlIIll = ((Iterator<PotionEffect>)llllllllllllIllIIIlIlIIllIIIIlll).next();
                final Potion llllllllllllIllIIIlIlIIllIIlIIlI = Potion.potionTypes[llllllllllllIllIIIlIlIIllIIlIIll.getPotionID()];
                GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
                this.mc.getTextureManager().bindTexture(InventoryEffectRenderer.inventoryBackground);
                this.drawTexturedModalRect(llllllllllllIllIIIlIlIIllIIllIII, llllllllllllIllIIIlIlIIllIIlIlll, InventoryEffectRenderer.llIlllllllIlII[4], InventoryEffectRenderer.llIlllllllIlII[6], InventoryEffectRenderer.llIlllllllIlII[10], InventoryEffectRenderer.llIlllllllIlII[11]);
                if (lIIllIlllIIlIlll(llllllllllllIllIIIlIlIIllIIlIIlI.hasStatusIcon() ? 1 : 0)) {
                    final int llllllllllllIllIIIlIlIIllIIlIIIl = llllllllllllIllIIIlIlIIllIIlIIlI.getStatusIconIndex();
                    this.drawTexturedModalRect(llllllllllllIllIIIlIlIIllIIllIII + InventoryEffectRenderer.llIlllllllIlII[12], llllllllllllIllIIIlIlIIllIIlIlll + InventoryEffectRenderer.llIlllllllIlII[13], InventoryEffectRenderer.llIlllllllIlII[4] + llllllllllllIllIIIlIlIIllIIlIIIl % InventoryEffectRenderer.llIlllllllIlII[14] * InventoryEffectRenderer.llIlllllllIlII[15], InventoryEffectRenderer.llIlllllllIlII[16] + llllllllllllIllIIIlIlIIllIIlIIIl / InventoryEffectRenderer.llIlllllllIlII[14] * InventoryEffectRenderer.llIlllllllIlII[15], InventoryEffectRenderer.llIlllllllIlII[15], InventoryEffectRenderer.llIlllllllIlII[15]);
                }
                String llllllllllllIllIIIlIlIIllIIlIIII = I18n.format(llllllllllllIllIIIlIlIIllIIlIIlI.getName(), new Object[InventoryEffectRenderer.llIlllllllIlII[4]]);
                if (lIIllIlllIIllIIl(llllllllllllIllIIIlIlIIllIIlIIll.getAmplifier(), InventoryEffectRenderer.llIlllllllIlII[3])) {
                    llllllllllllIllIIIlIlIIllIIlIIII = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIIIlIlIIllIIlIIII)).append(InventoryEffectRenderer.llIlllllllIIIl[InventoryEffectRenderer.llIlllllllIlII[4]]).append(I18n.format(InventoryEffectRenderer.llIlllllllIIIl[InventoryEffectRenderer.llIlllllllIlII[3]], new Object[InventoryEffectRenderer.llIlllllllIlII[4]])));
                    "".length();
                    if (((0xEB ^ 0xB3) & ~(0x6B ^ 0x33)) >= "  ".length()) {
                        return;
                    }
                }
                else if (lIIllIlllIIllIIl(llllllllllllIllIIIlIlIIllIIlIIll.getAmplifier(), InventoryEffectRenderer.llIlllllllIlII[2])) {
                    llllllllllllIllIIIlIlIIllIIlIIII = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIIIlIlIIllIIlIIII)).append(InventoryEffectRenderer.llIlllllllIIIl[InventoryEffectRenderer.llIlllllllIlII[2]]).append(I18n.format(InventoryEffectRenderer.llIlllllllIIIl[InventoryEffectRenderer.llIlllllllIlII[17]], new Object[InventoryEffectRenderer.llIlllllllIlII[4]])));
                    "".length();
                    if ((0x6C ^ 0x68) > (0x1C ^ 0x18)) {
                        return;
                    }
                }
                else if (lIIllIlllIIllIIl(llllllllllllIllIIIlIlIIllIIlIIll.getAmplifier(), InventoryEffectRenderer.llIlllllllIlII[17])) {
                    llllllllllllIllIIIlIlIIllIIlIIII = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIIIlIlIIllIIlIIII)).append(InventoryEffectRenderer.llIlllllllIIIl[InventoryEffectRenderer.llIlllllllIlII[18]]).append(I18n.format(InventoryEffectRenderer.llIlllllllIIIl[InventoryEffectRenderer.llIlllllllIlII[8]], new Object[InventoryEffectRenderer.llIlllllllIlII[4]])));
                }
                this.fontRendererObj.drawStringWithShadow(llllllllllllIllIIIlIlIIllIIlIIII, (float)(llllllllllllIllIIIlIlIIllIIllIII + InventoryEffectRenderer.llIlllllllIlII[19] + InventoryEffectRenderer.llIlllllllIlII[15]), (float)(llllllllllllIllIIIlIlIIllIIlIlll + InventoryEffectRenderer.llIlllllllIlII[12]), InventoryEffectRenderer.llIlllllllIlII[20]);
                "".length();
                final String llllllllllllIllIIIlIlIIllIIIllll = Potion.getDurationString(llllllllllllIllIIIlIlIIllIIlIIll);
                this.fontRendererObj.drawStringWithShadow(llllllllllllIllIIIlIlIIllIIIllll, (float)(llllllllllllIllIIIlIlIIllIIllIII + InventoryEffectRenderer.llIlllllllIlII[19] + InventoryEffectRenderer.llIlllllllIlII[15]), (float)(llllllllllllIllIIIlIlIIllIIlIlll + InventoryEffectRenderer.llIlllllllIlII[12] + InventoryEffectRenderer.llIlllllllIlII[19]), InventoryEffectRenderer.llIlllllllIlII[21]);
                "".length();
                llllllllllllIllIIIlIlIIllIIlIlll += llllllllllllIllIIIlIlIIllIIlIlII;
            }
        }
    }
    
    @Override
    public void drawScreen(final int llllllllllllIllIIIlIlIIllIlIIlll, final int llllllllllllIllIIIlIlIIllIlIIllI, final float llllllllllllIllIIIlIlIIllIlIIlIl) {
        super.drawScreen(llllllllllllIllIIIlIlIIllIlIIlll, llllllllllllIllIIIlIlIIllIlIIllI, llllllllllllIllIIIlIlIIllIlIIlIl);
        if (lIIllIlllIIlIlll(this.hasActivePotionEffects ? 1 : 0)) {
            this.drawActivePotionEffects();
        }
    }
    
    private static boolean lIIllIlllIIllIIl(final int llllllllllllIllIIIlIlIIlIlIIllll, final int llllllllllllIllIIIlIlIIlIlIIlllI) {
        return llllllllllllIllIIIlIlIIlIlIIllll == llllllllllllIllIIIlIlIIlIlIIlllI;
    }
    
    private static boolean lIIllIlllIIllIII(final int llllllllllllIllIIIlIlIIlIlIIIlll, final int llllllllllllIllIIIlIlIIlIlIIIllI) {
        return llllllllllllIllIIIlIlIIlIlIIIlll > llllllllllllIllIIIlIlIIlIlIIIllI;
    }
    
    protected void updateActivePotionEffects() {
        if (lIIllIlllIIlIllI(this.mc.thePlayer.getActivePotionEffects().isEmpty() ? 1 : 0)) {
            this.guiLeft = InventoryEffectRenderer.llIlllllllIlII[0] + (this.width - this.xSize - InventoryEffectRenderer.llIlllllllIlII[1]) / InventoryEffectRenderer.llIlllllllIlII[2];
            this.hasActivePotionEffects = (InventoryEffectRenderer.llIlllllllIlII[3] != 0);
            "".length();
            if (" ".length() >= "  ".length()) {
                return;
            }
        }
        else {
            this.guiLeft = (this.width - this.xSize) / InventoryEffectRenderer.llIlllllllIlII[2];
            this.hasActivePotionEffects = (InventoryEffectRenderer.llIlllllllIlII[4] != 0);
        }
    }
    
    private static String lIIllIlllIIlIIIl(String llllllllllllIllIIIlIlIIlIllIIlll, final String llllllllllllIllIIIlIlIIlIllIlIll) {
        llllllllllllIllIIIlIlIIlIllIIlll = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIlIlIIlIllIIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIlIlIIlIllIlIlI = new StringBuilder();
        final char[] llllllllllllIllIIIlIlIIlIllIlIIl = llllllllllllIllIIIlIlIIlIllIlIll.toCharArray();
        int llllllllllllIllIIIlIlIIlIllIlIII = InventoryEffectRenderer.llIlllllllIlII[4];
        final Exception llllllllllllIllIIIlIlIIlIllIIIlI = (Object)((String)llllllllllllIllIIIlIlIIlIllIIlll).toCharArray();
        final long llllllllllllIllIIIlIlIIlIllIIIIl = llllllllllllIllIIIlIlIIlIllIIIlI.length;
        float llllllllllllIllIIIlIlIIlIllIIIII = InventoryEffectRenderer.llIlllllllIlII[4];
        while (lIIllIlllIIllIlI((int)llllllllllllIllIIIlIlIIlIllIIIII, (int)llllllllllllIllIIIlIlIIlIllIIIIl)) {
            final char llllllllllllIllIIIlIlIIlIllIllIl = llllllllllllIllIIIlIlIIlIllIIIlI[llllllllllllIllIIIlIlIIlIllIIIII];
            llllllllllllIllIIIlIlIIlIllIlIlI.append((char)(llllllllllllIllIIIlIlIIlIllIllIl ^ llllllllllllIllIIIlIlIIlIllIlIIl[llllllllllllIllIIIlIlIIlIllIlIII % llllllllllllIllIIIlIlIIlIllIlIIl.length]));
            "".length();
            ++llllllllllllIllIIIlIlIIlIllIlIII;
            ++llllllllllllIllIIIlIlIIlIllIIIII;
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIlIlIIlIllIlIlI);
    }
    
    private static void lIIllIlllIIlIIll() {
        (llIlllllllIIIl = new String[InventoryEffectRenderer.llIlllllllIlII[12]])[InventoryEffectRenderer.llIlllllllIlII[4]] = lIIllIlllIIIlllI("ltrOhST9jwQ=", "PcuaZ");
        InventoryEffectRenderer.llIlllllllIIIl[InventoryEffectRenderer.llIlllllllIlII[3]] = lIIllIlllIIIlllI("oUq512Fv3v1ngqPasInF5/WdSD2FaEV+", "IKjcE");
        InventoryEffectRenderer.llIlllllllIIIl[InventoryEffectRenderer.llIlllllllIlII[2]] = lIIllIlllIIlIIIl("dw==", "WHbRz");
        InventoryEffectRenderer.llIlllllllIIIl[InventoryEffectRenderer.llIlllllllIlII[17]] = lIIllIlllIIlIIIl("AA8TMSQLFR08KxFPHDwzAA1eag==", "eapYE");
        InventoryEffectRenderer.llIlllllllIIIl[InventoryEffectRenderer.llIlllllllIlII[18]] = lIIllIlllIIlIIlI("IEilPvY0SOo=", "XqSHp");
        InventoryEffectRenderer.llIlllllllIIIl[InventoryEffectRenderer.llIlllllllIlII[8]] = lIIllIlllIIlIIlI("jTTdC/DFD+vnclcQJvAO13e1pJsF/TzS", "mjgCF");
    }
    
    private static boolean lIIllIlllIIlIllI(final int llllllllllllIllIIIlIlIIlIlIIIIlI) {
        return llllllllllllIllIIIlIlIIlIlIIIIlI == 0;
    }
    
    private static String lIIllIlllIIIlllI(final String llllllllllllIllIIIlIlIIlIlIlIlll, final String llllllllllllIllIIIlIlIIlIlIlIlII) {
        try {
            final SecretKeySpec llllllllllllIllIIIlIlIIlIlIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIlIIlIlIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIlIlIIlIlIllIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIlIlIIlIlIllIIl.init(InventoryEffectRenderer.llIlllllllIlII[2], llllllllllllIllIIIlIlIIlIlIllIlI);
            return new String(llllllllllllIllIIIlIlIIlIlIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIlIIlIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIlIlIIlIlIllIII) {
            llllllllllllIllIIIlIlIIlIlIllIII.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIllIlllIIlIlIl();
        lIIllIlllIIlIIll();
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.updateActivePotionEffects();
    }
    
    private static boolean lIIllIlllIIllIlI(final int llllllllllllIllIIIlIlIIlIlIIlIll, final int llllllllllllIllIIIlIlIIlIlIIlIlI) {
        return llllllllllllIllIIIlIlIIlIlIIlIll < llllllllllllIllIIIlIlIIlIlIIlIlI;
    }
    
    public InventoryEffectRenderer(final Container llllllllllllIllIIIlIlIIllIllIlll) {
        super(llllllllllllIllIIIlIlIIllIllIlll);
    }
}
