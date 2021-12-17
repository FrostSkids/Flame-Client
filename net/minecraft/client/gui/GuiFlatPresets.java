// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Iterator;
import net.minecraft.item.ItemStack;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.init.Items;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import com.google.common.collect.Lists;
import org.lwjgl.input.Keyboard;
import java.io.IOException;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;
import com.google.common.collect.Maps;
import net.minecraft.world.gen.FlatGeneratorInfo;
import net.minecraft.world.gen.FlatLayerInfo;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.item.Item;
import java.util.List;

public class GuiFlatPresets extends GuiScreen
{
    private /* synthetic */ GuiTextField field_146433_u;
    private /* synthetic */ String field_146436_r;
    private static final /* synthetic */ List<LayerItem> FLAT_WORLD_PRESETS;
    private static final /* synthetic */ String[] llllIIllIllll;
    private /* synthetic */ String presetsShare;
    private /* synthetic */ ListSlot field_146435_s;
    private /* synthetic */ String presetsTitle;
    private /* synthetic */ GuiButton field_146434_t;
    private final /* synthetic */ GuiCreateFlatWorld parentScreen;
    private static final /* synthetic */ int[] llllIIlllIlIl;
    
    private static void func_175354_a(final String lllllllllllllIlIlllIIIlIlIIIIlll, final Item lllllllllllllIlIlllIIIlIlIIIIllI, final int lllllllllllllIlIlllIIIlIIlllllII, final BiomeGenBase lllllllllllllIlIlllIIIlIIllllIll, final List<String> lllllllllllllIlIlllIIIlIlIIIIIll, final FlatLayerInfo... lllllllllllllIlIlllIIIlIlIIIIIlI) {
        final FlatGeneratorInfo lllllllllllllIlIlllIIIlIlIIIIIIl = new FlatGeneratorInfo();
        int lllllllllllllIlIlllIIIlIlIIIIIII = lllllllllllllIlIlllIIIlIlIIIIIlI.length - GuiFlatPresets.llllIIlllIlIl[1];
        "".length();
        if ((0x41 ^ 0x58 ^ (0xA4 ^ 0xB9)) != (0x19 ^ 0x43 ^ (0xF2 ^ 0xAC))) {
            return;
        }
        while (!lIlIlIIlIlIIlII(lllllllllllllIlIlllIIIlIlIIIIIII)) {
            lllllllllllllIlIlllIIIlIlIIIIIIl.getFlatLayers().add(lllllllllllllIlIlllIIIlIlIIIIIlI[lllllllllllllIlIlllIIIlIlIIIIIII]);
            "".length();
            --lllllllllllllIlIlllIIIlIlIIIIIII;
        }
        lllllllllllllIlIlllIIIlIlIIIIIIl.setBiome(lllllllllllllIlIlllIIIlIIllllIll.biomeID);
        lllllllllllllIlIlllIIIlIlIIIIIIl.func_82645_d();
        if (lIlIlIIlIlIIlIl(lllllllllllllIlIlllIIIlIlIIIIIll)) {
            final float lllllllllllllIlIlllIIIlIIlllIllI = (float)lllllllllllllIlIlllIIIlIlIIIIIll.iterator();
            "".length();
            if ((0x33 ^ 0x37) != (0x82 ^ 0x86)) {
                return;
            }
            while (!lIlIlIIlIIllllI(((Iterator)lllllllllllllIlIlllIIIlIIlllIllI).hasNext() ? 1 : 0)) {
                final String lllllllllllllIlIlllIIIlIIlllllll = ((Iterator<String>)lllllllllllllIlIlllIIIlIIlllIllI).next();
                lllllllllllllIlIlllIIIlIlIIIIIIl.getWorldFeatures().put(lllllllllllllIlIlllIIIlIIlllllll, Maps.newHashMap());
                "".length();
            }
        }
        GuiFlatPresets.FLAT_WORLD_PRESETS.add(new LayerItem(lllllllllllllIlIlllIIIlIlIIIIllI, lllllllllllllIlIlllIIIlIIlllllII, lllllllllllllIlIlllIIIlIlIIIIlll, lllllllllllllIlIlllIIIlIlIIIIIIl.toString()));
        "".length();
    }
    
    private static String lIlIlIIlIIIllII(String lllllllllllllIlIlllIIIlIIlIIlIII, final String lllllllllllllIlIlllIIIlIIlIIIlll) {
        lllllllllllllIlIlllIIIlIIlIIlIII = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlllIIIlIIlIIlIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlllIIIlIIlIIlIll = new StringBuilder();
        final char[] lllllllllllllIlIlllIIIlIIlIIlIlI = lllllllllllllIlIlllIIIlIIlIIIlll.toCharArray();
        int lllllllllllllIlIlllIIIlIIlIIlIIl = GuiFlatPresets.llllIIlllIlIl[0];
        final Exception lllllllllllllIlIlllIIIlIIlIIIIll = (Object)((String)lllllllllllllIlIlllIIIlIIlIIlIII).toCharArray();
        final String lllllllllllllIlIlllIIIlIIlIIIIlI = (String)lllllllllllllIlIlllIIIlIIlIIIIll.length;
        boolean lllllllllllllIlIlllIIIlIIlIIIIIl = GuiFlatPresets.llllIIlllIlIl[0] != 0;
        while (lIlIlIIlIlIIllI(lllllllllllllIlIlllIIIlIIlIIIIIl ? 1 : 0, (int)lllllllllllllIlIlllIIIlIIlIIIIlI)) {
            final char lllllllllllllIlIlllIIIlIIlIIlllI = lllllllllllllIlIlllIIIlIIlIIIIll[lllllllllllllIlIlllIIIlIIlIIIIIl];
            lllllllllllllIlIlllIIIlIIlIIlIll.append((char)(lllllllllllllIlIlllIIIlIIlIIlllI ^ lllllllllllllIlIlllIIIlIIlIIlIlI[lllllllllllllIlIlllIIIlIIlIIlIIl % lllllllllllllIlIlllIIIlIIlIIlIlI.length]));
            "".length();
            ++lllllllllllllIlIlllIIIlIIlIIlIIl;
            ++lllllllllllllIlIlllIIIlIIlIIIIIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlllIIIlIIlIIlIll);
    }
    
    private boolean func_146430_p() {
        if ((!lIlIlIIlIlIIIIl(this.field_146435_s.field_148175_k, GuiFlatPresets.llllIIlllIlIl[52]) || lIlIlIIlIlIIIlI(this.field_146435_s.field_148175_k, GuiFlatPresets.FLAT_WORLD_PRESETS.size())) && lIlIlIIlIlIIIll(this.field_146433_u.getText().length(), GuiFlatPresets.llllIIlllIlIl[1])) {
            return GuiFlatPresets.llllIIlllIlIl[0] != 0;
        }
        return GuiFlatPresets.llllIIlllIlIl[1] != 0;
    }
    
    private static String lIlIlIIlIIIlIll(final String lllllllllllllIlIlllIIIlIIlIlllIl, final String lllllllllllllIlIlllIIIlIIlIllIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIlllIIIlIIllIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIIIlIIlIllIlI.getBytes(StandardCharsets.UTF_8)), GuiFlatPresets.llllIIlllIlIl[9]), "DES");
            final Cipher lllllllllllllIlIlllIIIlIIlIlllll = Cipher.getInstance("DES");
            lllllllllllllIlIlllIIIlIIlIlllll.init(GuiFlatPresets.llllIIlllIlIl[3], lllllllllllllIlIlllIIIlIIllIIIII);
            return new String(lllllllllllllIlIlllIIIlIIlIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIIIlIIlIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlllIIIlIIlIllllI) {
            lllllllllllllIlIlllIIIlIIlIllllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void drawScreen(final int lllllllllllllIlIlllIIIlIlIlllIlI, final int lllllllllllllIlIlllIIIlIlIllllIl, final float lllllllllllllIlIlllIIIlIlIllllII) {
        this.drawDefaultBackground();
        this.field_146435_s.drawScreen(lllllllllllllIlIlllIIIlIlIlllIlI, lllllllllllllIlIlllIIIlIlIllllIl, lllllllllllllIlIlllIIIlIlIllllII);
        this.drawCenteredString(this.fontRendererObj, this.presetsTitle, this.width / GuiFlatPresets.llllIIlllIlIl[3], GuiFlatPresets.llllIIlllIlIl[9], GuiFlatPresets.llllIIlllIlIl[49]);
        this.drawString(this.fontRendererObj, this.presetsShare, GuiFlatPresets.llllIIlllIlIl[41], GuiFlatPresets.llllIIlllIlIl[33], GuiFlatPresets.llllIIlllIlIl[50]);
        this.drawString(this.fontRendererObj, this.field_146436_r, GuiFlatPresets.llllIIlllIlIl[41], GuiFlatPresets.llllIIlllIlIl[51], GuiFlatPresets.llllIIlllIlIl[50]);
        this.field_146433_u.drawTextBox();
        super.drawScreen(lllllllllllllIlIlllIIIlIlIlllIlI, lllllllllllllIlIlllIIIlIlIllllIl, lllllllllllllIlIlllIIIlIlIllllII);
    }
    
    public GuiFlatPresets(final GuiCreateFlatWorld lllllllllllllIlIlllIIIlIlllIIllI) {
        this.parentScreen = lllllllllllllIlIlllIIIlIlllIIllI;
    }
    
    private static void lIlIlIIlIIlllIl() {
        (llllIIlllIlIl = new int[54])[0] = ((0x4 ^ 0x3F) & ~(0x8C ^ 0xB7));
        GuiFlatPresets.llllIIlllIlIl[1] = " ".length();
        GuiFlatPresets.llllIIlllIlIl[2] = "   ".length();
        GuiFlatPresets.llllIIlllIlIl[3] = "  ".length();
        GuiFlatPresets.llllIIlllIlIl[4] = (3 + 19 + 122 + 54 ^ 2 + 80 - 1 + 114);
        GuiFlatPresets.llllIIlllIlIl[5] = (0x5C ^ 0x30 ^ (0x34 ^ 0x5C));
        GuiFlatPresets.llllIIlllIlIl[6] = (0x21 ^ 0x2E ^ (0x9 ^ 0x0));
        GuiFlatPresets.llllIIlllIlIl[7] = (0x4C ^ 0x4B);
        GuiFlatPresets.llllIIlllIlIl[8] = 168 + 144 - 281 + 199;
        GuiFlatPresets.llllIIlllIlIl[9] = (0x75 ^ 0x7D);
        GuiFlatPresets.llllIIlllIlIl[10] = (121 + 79 - 46 + 7 ^ 22 + 121 - 26 + 51);
        GuiFlatPresets.llllIIlllIlIl[11] = (0x6B ^ 0x4E ^ (0x62 ^ 0x4D));
        GuiFlatPresets.llllIIlllIlIl[12] = (0x66 ^ 0x7B ^ (0x71 ^ 0x36));
        GuiFlatPresets.llllIIlllIlIl[13] = (100 + 39 + 12 + 3 ^ 102 + 109 - 187 + 121);
        GuiFlatPresets.llllIIlllIlIl[14] = (0x8A ^ 0xA4 ^ (0x3 ^ 0x21));
        GuiFlatPresets.llllIIlllIlIl[15] = (21 + 166 - 32 + 26 ^ 117 + 45 - 136 + 158);
        GuiFlatPresets.llllIIlllIlIl[16] = (36 + 33 + 57 + 54 ^ 167 + 13 - 117 + 123);
        GuiFlatPresets.llllIIlllIlIl[17] = ("   ".length() ^ (0x9B ^ 0x97));
        GuiFlatPresets.llllIIlllIlIl[18] = (0xFD ^ 0x84 ^ (0xE3 ^ 0x8A));
        GuiFlatPresets.llllIIlllIlIl[19] = (0xD9 ^ 0x99 ^ (0x78 ^ 0x29));
        GuiFlatPresets.llllIIlllIlIl[20] = (0x58 ^ 0x4A);
        GuiFlatPresets.llllIIlllIlIl[21] = (0x1A ^ 0x1E ^ (0x76 ^ 0x61));
        GuiFlatPresets.llllIIlllIlIl[22] = (0x41 ^ 0x7A);
        GuiFlatPresets.llllIIlllIlIl[23] = (0x6F ^ 0x7B);
        GuiFlatPresets.llllIIlllIlIl[24] = (0x9A ^ 0x8F);
        GuiFlatPresets.llllIIlllIlIl[25] = (0x37 ^ 0x25 ^ (0x2C ^ 0x28));
        GuiFlatPresets.llllIIlllIlIl[26] = (0x52 ^ 0x62 ^ (0x96 ^ 0xB1));
        GuiFlatPresets.llllIIlllIlIl[27] = (0x25 ^ 0x72 ^ (0x74 ^ 0x3B));
        GuiFlatPresets.llllIIlllIlIl[28] = (0x82 ^ 0xB3 ^ (0x42 ^ 0x6A));
        GuiFlatPresets.llllIIlllIlIl[29] = (90 + 152 - 200 + 135 ^ 45 + 140 - 18 + 4);
        GuiFlatPresets.llllIIlllIlIl[30] = (0xCC ^ 0x84 ^ (0xD3 ^ 0x80));
        GuiFlatPresets.llllIIlllIlIl[31] = (0x5F ^ 0x43);
        GuiFlatPresets.llllIIlllIlIl[32] = (0xD9 ^ 0xC4);
        GuiFlatPresets.llllIIlllIlIl[33] = (0x47 ^ 0x7B ^ (0xA1 ^ 0x83));
        GuiFlatPresets.llllIIlllIlIl[34] = (64 + 87 - 139 + 157 ^ 121 + 180 - 276 + 157);
        GuiFlatPresets.llllIIlllIlIl[35] = (0xE5 ^ 0x8A ^ (0x6F ^ 0x20));
        GuiFlatPresets.llllIIlllIlIl[36] = (0x2E ^ 0x1A);
        GuiFlatPresets.llllIIlllIlIl[37] = (142 + 187 - 264 + 162 ^ 82 + 0 + 36 + 76);
        GuiFlatPresets.llllIIlllIlIl[38] = (40 + 99 - 129 + 119 ^ 83 + 123 - 167 + 124);
        GuiFlatPresets.llllIIlllIlIl[39] = (0xA4 ^ 0x87);
        GuiFlatPresets.llllIIlllIlIl[40] = (0xAE ^ 0x8A);
        GuiFlatPresets.llllIIlllIlIl[41] = (89 + 69 - 116 + 93 ^ 142 + 14 - 26 + 51);
        GuiFlatPresets.llllIIlllIlIl[42] = (0x17 ^ 0x3F);
        GuiFlatPresets.llllIIlllIlIl[43] = (0x6D ^ 0x1A ^ (0x1C ^ 0xF));
        GuiFlatPresets.llllIIlllIlIl[44] = (0xFFFFD4DE & 0x2FEF);
        GuiFlatPresets.llllIIlllIlIl[45] = (0xC1 ^ 0xA9) + (0x30 ^ 0x16) - (0x21 ^ 0x2B) + (0x94 ^ 0x83);
        GuiFlatPresets.llllIIlllIlIl[46] = 31 + 98 - 89 + 110;
        GuiFlatPresets.llllIIlllIlIl[47] = (0xF9 ^ 0xC5 ^ (0xA8 ^ 0xB1));
        GuiFlatPresets.llllIIlllIlIl[48] = (0xA6 ^ 0xB5 ^ (0xBD ^ 0x88));
        GuiFlatPresets.llllIIlllIlIl[49] = (-" ".length() & (-1 & 0xFFFFFF));
        GuiFlatPresets.llllIIlllIlIl[50] = (0xFFFFAAF1 & 0xA0F5AE);
        GuiFlatPresets.llllIIlllIlIl[51] = (0x18 ^ 0x5E);
        GuiFlatPresets.llllIIlllIlIl[52] = -" ".length();
        GuiFlatPresets.llllIIlllIlIl[53] = (0xB4 ^ 0x93);
    }
    
    private static String lIlIlIIlIIIlIlI(final String lllllllllllllIlIlllIIIlIIllIlIlI, final String lllllllllllllIlIlllIIIlIIllIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlllIIIlIIllIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIIIlIIllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlllIIIlIIllIllII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlllIIIlIIllIllII.init(GuiFlatPresets.llllIIlllIlIl[3], lllllllllllllIlIlllIIIlIIllIllIl);
            return new String(lllllllllllllIlIlllIIIlIIllIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIIIlIIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlllIIIlIIllIlIll) {
            lllllllllllllIlIlllIIIlIIllIlIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void handleMouseInput() throws IOException {
        super.handleMouseInput();
        this.field_146435_s.handleMouseInput();
    }
    
    private static boolean lIlIlIIlIIllllI(final int lllllllllllllIlIlllIIIlIIIlIIllI) {
        return lllllllllllllIlIlllIIIlIIIlIIllI == 0;
    }
    
    @Override
    protected void actionPerformed(final GuiButton lllllllllllllIlIlllIIIlIllIIIllI) throws IOException {
        if (lIlIlIIlIIllllI(lllllllllllllIlIlllIIIlIllIIIllI.id) && lIlIlIIlIIlllll(this.func_146430_p() ? 1 : 0)) {
            this.parentScreen.func_146383_a(this.field_146433_u.getText());
            this.mc.displayGuiScreen(this.parentScreen);
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lIlIlIIlIlIIIII(lllllllllllllIlIlllIIIlIllIIIllI.id, GuiFlatPresets.llllIIlllIlIl[1])) {
            this.mc.displayGuiScreen(this.parentScreen);
        }
    }
    
    @Override
    public void updateScreen() {
        this.field_146433_u.updateCursorCounter();
        super.updateScreen();
    }
    
    public void func_146426_g() {
        final boolean lllllllllllllIlIlllIIIlIlIllIIIl = this.func_146430_p();
        this.field_146434_t.enabled = lllllllllllllIlIlllIIIlIlIllIIIl;
    }
    
    private static boolean lIlIlIIlIIlllll(final int lllllllllllllIlIlllIIIlIIIlIlIII) {
        return lllllllllllllIlIlllIIIlIIIlIlIII != 0;
    }
    
    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)(GuiFlatPresets.llllIIlllIlIl[0] != 0));
    }
    
    private static void lIlIlIIlIIllIIl() {
        (llllIIllIllll = new String[GuiFlatPresets.llllIIlllIlIl[53]])[GuiFlatPresets.llllIIlllIlIl[0]] = lIlIlIIlIIIlIlI("jVeXv8FABShYBzmtL3GgTg==", "nERFy");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[1]] = lIlIlIIlIIIlIlI("H5coSFAV5nk=", "tewVU");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[3]] = lIlIlIIlIIIlIll("ZKauMup2eJHmGR+R1MA5NTgSze8UoSrR", "PTleo");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[2]] = lIlIlIIlIIIllII("CCYcBSM1fg==", "jOshF");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[5]] = lIlIlIIlIIIlIlI("sUKlRLZrr+8=", "tTxNt");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[4]] = lIlIlIIlIIIlIlI("BeU+bZmwtXUgpOySfnl91g==", "pwgQw");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[6]] = lIlIlIIlIIIllII("MBAjJCAkDD4nKg==", "CdQKN");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[7]] = lIlIlIIlIIIllII("BBMhDzIBGyke", "izOjA");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[9]] = lIlIlIIlIIIlIll("0vm2YjCuhbnof6m49dn3yg==", "uphnK");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[10]] = lIlIlIIlIIIllII("CSAgFQI0eA==", "kIOxg");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[11]] = lIlIlIIlIIIllII("PDEgMww+PSsnDzY8MQ==", "SRERb");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[13]] = lIlIlIIlIIIlIlI("gUcIUEP5bpHLYwb8pw+D8Q==", "IFsBD");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[14]] = lIlIlIIlIIIlIlI("2oWxMDwIz+s=", "YqjpH");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[15]] = lIlIlIIlIIIlIll("BqXC5Gz/HFg=", "cLcRG");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[16]] = lIlIlIIlIIIlIlI("/4nv2Hy3f1I+HgfADfn1RQ==", "KArTu");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[17]] = lIlIlIIlIIIllII("ERURKgAFCQwpCg==", "bacEn");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[18]] = lIlIlIIlIIIlIlI("yZ6pxr3SFtX6P7bxy12QLg==", "IkJAY");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[19]] = lIlIlIIlIIIlIlI("jJQM3vPc/dI=", "aXSsq");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[20]] = lIlIlIIlIIIllII("JzQgFg==", "KUKsM");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[21]] = lIlIlIIlIIIllII("JAUFETkkBRgV", "Hdspf");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[23]] = lIlIlIIlIIIlIlI("lmID43FjOqNQDFUn37nkbA==", "QUOpd");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[24]] = lIlIlIIlIIIlIlI("OBY/9uxtYgs=", "WXNtF");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[25]] = lIlIlIIlIIIllII("GhA8HTMnSA==", "xySpV");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[26]] = lIlIlIIlIIIllII("MA0OGDgfDh8fJFIyExg=", "rbzlW");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[27]] = lIlIlIIlIIIlIll("23BtBL5gM7c=", "teYlh");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[28]] = lIlIlIIlIIIlIll("GxFJr8KE7gw=", "vvtRS");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[29]] = lIlIlIIlIIIlIll("5VaCMud0rQQ=", "RyHhU");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[30]] = lIlIlIIlIIIllII("OR4ZADEoEg==", "OwulP");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[31]] = lIlIlIIlIIIlIlI("8yMu+OLYc1U=", "IurTM");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[32]] = lIlIlIIlIIIlIll("Y2bLjOMKMbOHLi8G8JhDxA==", "LECwS");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[33]] = lIlIlIIlIIIllII("EAEkJy8EHTkkJQ==", "cuVHA");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[34]] = lIlIlIIlIIIllII("PD0XPDI5NR8t", "QTyYA");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[35]] = lIlIlIIlIIIllII("MgULLQs5Hg==", "VpeJn");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[37]] = lIlIlIIlIIIlIll("iCWwFXr11M0ehiqp/4/1dw==", "MkCXc");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[38]] = lIlIlIIlIIIlIlI("7dHPuxqS66E/m4o7CmWUxHq//AR69ctMojcUKIVmawB1VI9elOrE/g==", "enUwx");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[39]] = lIlIlIIlIIIlIlI("olVuvlZwdJhOzyfNFSeWEOjuRaaLqlPPUsw5/5TGjDjFtzK+HuhEGg==", "RSAEV");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[40]] = lIlIlIIlIIIlIlI("W58Di3eHEf1FiZGxQ2rvCeOqgTUuPXLpA7vPPfZrAbs5R3/WveLS/A==", "tNkFp");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[47]] = lIlIlIIlIIIlIll("Gl3zQn8VR9yURGAa/wZu53arDCNuykWR7CmchsVVTk+4eoqMyslfbA==", "GtMIa");
        GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[48]] = lIlIlIIlIIIlIlI("luGZtpea+Srb3T6i+AwI0Q==", "uIhme");
    }
    
    static {
        lIlIlIIlIIlllIl();
        lIlIlIIlIIllIIl();
        FLAT_WORLD_PRESETS = Lists.newArrayList();
        final String lllllllllllllIlIlllIIIlIlIIllIlI = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[0]];
        final Item itemFromBlock = Item.getItemFromBlock(Blocks.grass);
        final BiomeGenBase plains = BiomeGenBase.plains;
        final String[] a = new String[GuiFlatPresets.llllIIlllIlIl[1]];
        a[GuiFlatPresets.llllIIlllIlIl[0]] = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[1]];
        final List<String> list = Arrays.asList(a);
        final FlatLayerInfo[] lllllllllllllIlIlllIIIlIlIIlIllI = new FlatLayerInfo[GuiFlatPresets.llllIIlllIlIl[2]];
        lllllllllllllIlIlllIIIlIlIIlIllI[GuiFlatPresets.llllIIlllIlIl[0]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[1], Blocks.grass);
        lllllllllllllIlIlllIIIlIlIIlIllI[GuiFlatPresets.llllIIlllIlIl[1]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[3], Blocks.dirt);
        lllllllllllllIlIlllIIIlIlIIlIllI[GuiFlatPresets.llllIIlllIlIl[3]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[1], Blocks.bedrock);
        func_146421_a(lllllllllllllIlIlllIIIlIlIIllIlI, itemFromBlock, plains, list, lllllllllllllIlIlllIIIlIlIIlIllI);
        final String lllllllllllllIlIlllIIIlIlIIllIlI2 = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[3]];
        final Item itemFromBlock2 = Item.getItemFromBlock(Blocks.stone);
        final BiomeGenBase extremeHills = BiomeGenBase.extremeHills;
        final String[] a2 = new String[GuiFlatPresets.llllIIlllIlIl[4]];
        a2[GuiFlatPresets.llllIIlllIlIl[0]] = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[2]];
        a2[GuiFlatPresets.llllIIlllIlIl[1]] = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[5]];
        a2[GuiFlatPresets.llllIIlllIlIl[3]] = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[4]];
        a2[GuiFlatPresets.llllIIlllIlIl[2]] = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[6]];
        a2[GuiFlatPresets.llllIIlllIlIl[5]] = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[7]];
        final List<String> list2 = Arrays.asList(a2);
        final FlatLayerInfo[] lllllllllllllIlIlllIIIlIlIIlIllI2 = new FlatLayerInfo[GuiFlatPresets.llllIIlllIlIl[5]];
        lllllllllllllIlIlllIIIlIlIIlIllI2[GuiFlatPresets.llllIIlllIlIl[0]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[1], Blocks.grass);
        lllllllllllllIlIlllIIIlIlIIlIllI2[GuiFlatPresets.llllIIlllIlIl[1]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[4], Blocks.dirt);
        lllllllllllllIlIlllIIIlIlIIlIllI2[GuiFlatPresets.llllIIlllIlIl[3]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[8], Blocks.stone);
        lllllllllllllIlIlllIIIlIlIIlIllI2[GuiFlatPresets.llllIIlllIlIl[2]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[1], Blocks.bedrock);
        func_146421_a(lllllllllllllIlIlllIIIlIlIIllIlI2, itemFromBlock2, extremeHills, list2, lllllllllllllIlIlllIIIlIlIIlIllI2);
        final String lllllllllllllIlIlllIIIlIlIIllIlI3 = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[9]];
        final Item water_bucket = Items.water_bucket;
        final BiomeGenBase deepOcean = BiomeGenBase.deepOcean;
        final String[] a3 = new String[GuiFlatPresets.llllIIlllIlIl[3]];
        a3[GuiFlatPresets.llllIIlllIlIl[0]] = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[10]];
        a3[GuiFlatPresets.llllIIlllIlIl[1]] = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[11]];
        final List<String> list3 = Arrays.asList(a3);
        final FlatLayerInfo[] lllllllllllllIlIlllIIIlIlIIlIllI3 = new FlatLayerInfo[GuiFlatPresets.llllIIlllIlIl[4]];
        lllllllllllllIlIlllIIIlIlIIlIllI3[GuiFlatPresets.llllIIlllIlIl[0]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[12], Blocks.water);
        lllllllllllllIlIlllIIIlIlIIlIllI3[GuiFlatPresets.llllIIlllIlIl[1]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[4], Blocks.sand);
        lllllllllllllIlIlllIIIlIlIIlIllI3[GuiFlatPresets.llllIIlllIlIl[3]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[4], Blocks.dirt);
        lllllllllllllIlIlllIIIlIlIIlIllI3[GuiFlatPresets.llllIIlllIlIl[2]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[4], Blocks.stone);
        lllllllllllllIlIlllIIIlIlIIlIllI3[GuiFlatPresets.llllIIlllIlIl[5]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[1], Blocks.bedrock);
        func_146421_a(lllllllllllllIlIlllIIIlIlIIllIlI3, water_bucket, deepOcean, list3, lllllllllllllIlIlllIIIlIlIIlIllI3);
        final String lllllllllllllIlIlllIIIlIlIIIIlll = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[13]];
        final Item itemFromBlock3 = Item.getItemFromBlock(Blocks.tallgrass);
        final int meta = BlockTallGrass.EnumType.GRASS.getMeta();
        final BiomeGenBase plains2 = BiomeGenBase.plains;
        final String[] a4 = new String[GuiFlatPresets.llllIIlllIlIl[9]];
        a4[GuiFlatPresets.llllIIlllIlIl[0]] = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[14]];
        a4[GuiFlatPresets.llllIIlllIlIl[1]] = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[15]];
        a4[GuiFlatPresets.llllIIlllIlIl[3]] = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[16]];
        a4[GuiFlatPresets.llllIIlllIlIl[2]] = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[17]];
        a4[GuiFlatPresets.llllIIlllIlIl[5]] = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[18]];
        a4[GuiFlatPresets.llllIIlllIlIl[4]] = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[19]];
        a4[GuiFlatPresets.llllIIlllIlIl[6]] = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[20]];
        a4[GuiFlatPresets.llllIIlllIlIl[7]] = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[21]];
        final List<String> list4 = Arrays.asList(a4);
        final FlatLayerInfo[] lllllllllllllIlIlllIIIlIlIIIIIlI = new FlatLayerInfo[GuiFlatPresets.llllIIlllIlIl[5]];
        lllllllllllllIlIlllIIIlIlIIIIIlI[GuiFlatPresets.llllIIlllIlIl[0]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[1], Blocks.grass);
        lllllllllllllIlIlllIIIlIlIIIIIlI[GuiFlatPresets.llllIIlllIlIl[1]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[2], Blocks.dirt);
        lllllllllllllIlIlllIIIlIlIIIIIlI[GuiFlatPresets.llllIIlllIlIl[3]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[22], Blocks.stone);
        lllllllllllllIlIlllIIIlIlIIIIIlI[GuiFlatPresets.llllIIlllIlIl[2]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[1], Blocks.bedrock);
        func_175354_a(lllllllllllllIlIlllIIIlIlIIIIlll, itemFromBlock3, meta, plains2, list4, lllllllllllllIlIlllIIIlIlIIIIIlI);
        final String lllllllllllllIlIlllIIIlIlIIllIlI4 = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[23]];
        final Item itemFromBlock4 = Item.getItemFromBlock(Blocks.snow_layer);
        final BiomeGenBase icePlains = BiomeGenBase.icePlains;
        final String[] a5 = new String[GuiFlatPresets.llllIIlllIlIl[3]];
        a5[GuiFlatPresets.llllIIlllIlIl[0]] = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[24]];
        a5[GuiFlatPresets.llllIIlllIlIl[1]] = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[25]];
        final List<String> list5 = Arrays.asList(a5);
        final FlatLayerInfo[] lllllllllllllIlIlllIIIlIlIIlIllI4 = new FlatLayerInfo[GuiFlatPresets.llllIIlllIlIl[4]];
        lllllllllllllIlIlllIIIlIlIIlIllI4[GuiFlatPresets.llllIIlllIlIl[0]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[1], Blocks.snow_layer);
        lllllllllllllIlIlllIIIlIlIIlIllI4[GuiFlatPresets.llllIIlllIlIl[1]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[1], Blocks.grass);
        lllllllllllllIlIlllIIIlIlIIlIllI4[GuiFlatPresets.llllIIlllIlIl[3]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[2], Blocks.dirt);
        lllllllllllllIlIlllIIIlIlIIlIllI4[GuiFlatPresets.llllIIlllIlIl[2]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[22], Blocks.stone);
        lllllllllllllIlIlllIIIlIlIIlIllI4[GuiFlatPresets.llllIIlllIlIl[5]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[1], Blocks.bedrock);
        func_146421_a(lllllllllllllIlIlllIIIlIlIIllIlI4, itemFromBlock4, icePlains, list5, lllllllllllllIlIlllIIIlIlIIlIllI4);
        final String lllllllllllllIlIlllIIIlIlIIllIlI5 = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[26]];
        final Item feather = Items.feather;
        final BiomeGenBase plains3 = BiomeGenBase.plains;
        final String[] a6 = new String[GuiFlatPresets.llllIIlllIlIl[3]];
        a6[GuiFlatPresets.llllIIlllIlIl[0]] = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[27]];
        a6[GuiFlatPresets.llllIIlllIlIl[1]] = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[28]];
        final List<String> list6 = Arrays.asList(a6);
        final FlatLayerInfo[] lllllllllllllIlIlllIIIlIlIIlIllI5 = new FlatLayerInfo[GuiFlatPresets.llllIIlllIlIl[2]];
        lllllllllllllIlIlllIIIlIlIIlIllI5[GuiFlatPresets.llllIIlllIlIl[0]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[1], Blocks.grass);
        lllllllllllllIlIlllIIIlIlIIlIllI5[GuiFlatPresets.llllIIlllIlIl[1]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[2], Blocks.dirt);
        lllllllllllllIlIlllIIIlIlIIlIllI5[GuiFlatPresets.llllIIlllIlIl[3]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[3], Blocks.cobblestone);
        func_146421_a(lllllllllllllIlIlllIIIlIlIIllIlI5, feather, plains3, list6, lllllllllllllIlIlllIIIlIlIIlIllI5);
        final String lllllllllllllIlIlllIIIlIlIIllIlI6 = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[29]];
        final Item itemFromBlock5 = Item.getItemFromBlock(Blocks.sand);
        final BiomeGenBase desert = BiomeGenBase.desert;
        final String[] a7 = new String[GuiFlatPresets.llllIIlllIlIl[6]];
        a7[GuiFlatPresets.llllIIlllIlIl[0]] = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[30]];
        a7[GuiFlatPresets.llllIIlllIlIl[1]] = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[31]];
        a7[GuiFlatPresets.llllIIlllIlIl[3]] = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[32]];
        a7[GuiFlatPresets.llllIIlllIlIl[2]] = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[33]];
        a7[GuiFlatPresets.llllIIlllIlIl[5]] = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[34]];
        a7[GuiFlatPresets.llllIIlllIlIl[4]] = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[35]];
        final List<String> list7 = Arrays.asList(a7);
        final FlatLayerInfo[] lllllllllllllIlIlllIIIlIlIIlIllI6 = new FlatLayerInfo[GuiFlatPresets.llllIIlllIlIl[5]];
        lllllllllllllIlIlllIIIlIlIIlIllI6[GuiFlatPresets.llllIIlllIlIl[0]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[9], Blocks.sand);
        lllllllllllllIlIlllIIIlIlIIlIllI6[GuiFlatPresets.llllIIlllIlIl[1]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[36], Blocks.sandstone);
        lllllllllllllIlIlllIIIlIlIIlIllI6[GuiFlatPresets.llllIIlllIlIl[3]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[2], Blocks.stone);
        lllllllllllllIlIlllIIIlIlIIlIllI6[GuiFlatPresets.llllIIlllIlIl[2]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[1], Blocks.bedrock);
        func_146421_a(lllllllllllllIlIlllIIIlIlIIllIlI6, itemFromBlock5, desert, list7, lllllllllllllIlIlllIIIlIlIIlIllI6);
        final String lllllllllllllIlIlllIIIlIlIlIIlll = GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[37]];
        final Item redstone = Items.redstone;
        final BiomeGenBase desert2 = BiomeGenBase.desert;
        final FlatLayerInfo[] lllllllllllllIlIlllIIIlIlIlIIIII = new FlatLayerInfo[GuiFlatPresets.llllIIlllIlIl[2]];
        lllllllllllllIlIlllIIIlIlIlIIIII[GuiFlatPresets.llllIIlllIlIl[0]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[36], Blocks.sandstone);
        lllllllllllllIlIlllIIIlIlIlIIIII[GuiFlatPresets.llllIIlllIlIl[1]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[2], Blocks.stone);
        lllllllllllllIlIlllIIIlIlIlIIIII[GuiFlatPresets.llllIIlllIlIl[3]] = new FlatLayerInfo(GuiFlatPresets.llllIIlllIlIl[1], Blocks.bedrock);
        func_146425_a(lllllllllllllIlIlllIIIlIlIlIIlll, redstone, desert2, lllllllllllllIlIlllIIIlIlIlIIIII);
    }
    
    private static boolean lIlIlIIlIlIIIll(final int lllllllllllllIlIlllIIIlIIIllIIIl, final int lllllllllllllIlIlllIIIlIIIllIIII) {
        return lllllllllllllIlIlllIIIlIIIllIIIl <= lllllllllllllIlIlllIIIlIIIllIIII;
    }
    
    private static boolean lIlIlIIlIlIIIlI(final int lllllllllllllIlIlllIIIlIIIlllIIl, final int lllllllllllllIlIlllIIIlIIIlllIII) {
        return lllllllllllllIlIlllIIIlIIIlllIIl >= lllllllllllllIlIlllIIIlIIIlllIII;
    }
    
    private static void func_146421_a(final String lllllllllllllIlIlllIIIlIlIIllIlI, final Item lllllllllllllIlIlllIIIlIlIIllIIl, final BiomeGenBase lllllllllllllIlIlllIIIlIlIIllIII, final List<String> lllllllllllllIlIlllIIIlIlIIlIlll, final FlatLayerInfo... lllllllllllllIlIlllIIIlIlIIlIllI) {
        func_175354_a(lllllllllllllIlIlllIIIlIlIIllIlI, lllllllllllllIlIlllIIIlIlIIllIIl, GuiFlatPresets.llllIIlllIlIl[0], lllllllllllllIlIlllIIIlIlIIllIII, lllllllllllllIlIlllIIIlIlIIlIlll, lllllllllllllIlIlllIIIlIlIIlIllI);
    }
    
    @Override
    protected void mouseClicked(final int lllllllllllllIlIlllIIIlIllIlIlIl, final int lllllllllllllIlIlllIIIlIllIllIII, final int lllllllllllllIlIlllIIIlIllIlIlll) throws IOException {
        this.field_146433_u.mouseClicked(lllllllllllllIlIlllIIIlIllIlIlIl, lllllllllllllIlIlllIIIlIllIllIII, lllllllllllllIlIlllIIIlIllIlIlll);
        super.mouseClicked(lllllllllllllIlIlllIIIlIllIlIlIl, lllllllllllllIlIlllIIIlIllIllIII, lllllllllllllIlIlllIIIlIllIlIlll);
    }
    
    private static boolean lIlIlIIlIlIIlIl(final Object lllllllllllllIlIlllIIIlIIIlIlIlI) {
        return lllllllllllllIlIlllIIIlIIIlIlIlI != null;
    }
    
    private static boolean lIlIlIIlIlIIIIl(final int lllllllllllllIlIlllIIIlIIIlIllIl, final int lllllllllllllIlIlllIIIlIIIlIllII) {
        return lllllllllllllIlIlllIIIlIIIlIllIl > lllllllllllllIlIlllIIIlIIIlIllII;
    }
    
    @Override
    public void initGui() {
        this.buttonList.clear();
        Keyboard.enableRepeatEvents((boolean)(GuiFlatPresets.llllIIlllIlIl[1] != 0));
        this.presetsTitle = I18n.format(GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[38]], new Object[GuiFlatPresets.llllIIlllIlIl[0]]);
        this.presetsShare = I18n.format(GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[39]], new Object[GuiFlatPresets.llllIIlllIlIl[0]]);
        this.field_146436_r = I18n.format(GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[40]], new Object[GuiFlatPresets.llllIIlllIlIl[0]]);
        this.field_146433_u = new GuiTextField(GuiFlatPresets.llllIIlllIlIl[3], this.fontRendererObj, GuiFlatPresets.llllIIlllIlIl[41], GuiFlatPresets.llllIIlllIlIl[42], this.width - GuiFlatPresets.llllIIlllIlIl[43], GuiFlatPresets.llllIIlllIlIl[23]);
        this.field_146435_s = new ListSlot();
        this.field_146433_u.setMaxStringLength(GuiFlatPresets.llllIIlllIlIl[44]);
        this.field_146433_u.setText(this.parentScreen.func_146384_e());
        final List<GuiButton> buttonList = this.buttonList;
        final GuiButton field_146434_t = new GuiButton(GuiFlatPresets.llllIIlllIlIl[0], this.width / GuiFlatPresets.llllIIlllIlIl[3] - GuiFlatPresets.llllIIlllIlIl[45], this.height - GuiFlatPresets.llllIIlllIlIl[31], GuiFlatPresets.llllIIlllIlIl[46], GuiFlatPresets.llllIIlllIlIl[23], I18n.format(GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[47]], new Object[GuiFlatPresets.llllIIlllIlIl[0]]));
        this.field_146434_t = field_146434_t;
        buttonList.add(field_146434_t);
        "".length();
        this.buttonList.add(new GuiButton(GuiFlatPresets.llllIIlllIlIl[1], this.width / GuiFlatPresets.llllIIlllIlIl[3] + GuiFlatPresets.llllIIlllIlIl[4], this.height - GuiFlatPresets.llllIIlllIlIl[31], GuiFlatPresets.llllIIlllIlIl[46], GuiFlatPresets.llllIIlllIlIl[23], I18n.format(GuiFlatPresets.llllIIllIllll[GuiFlatPresets.llllIIlllIlIl[48]], new Object[GuiFlatPresets.llllIIlllIlIl[0]])));
        "".length();
        this.func_146426_g();
    }
    
    private static boolean lIlIlIIlIlIIIII(final int lllllllllllllIlIlllIIIlIIIllllIl, final int lllllllllllllIlIlllIIIlIIIllllII) {
        return lllllllllllllIlIlllIIIlIIIllllIl == lllllllllllllIlIlllIIIlIIIllllII;
    }
    
    private static boolean lIlIlIIlIlIIllI(final int lllllllllllllIlIlllIIIlIIIllIlIl, final int lllllllllllllIlIlllIIIlIIIllIlII) {
        return lllllllllllllIlIlllIIIlIIIllIlIl < lllllllllllllIlIlllIIIlIIIllIlII;
    }
    
    @Override
    protected void keyTyped(final char lllllllllllllIlIlllIIIlIllIIlllI, final int lllllllllllllIlIlllIIIlIllIIllIl) throws IOException {
        if (lIlIlIIlIIllllI(this.field_146433_u.textboxKeyTyped(lllllllllllllIlIlllIIIlIllIIlllI, lllllllllllllIlIlllIIIlIllIIllIl) ? 1 : 0)) {
            super.keyTyped(lllllllllllllIlIlllIIIlIllIIlllI, lllllllllllllIlIlllIIIlIllIIllIl);
        }
    }
    
    private static boolean lIlIlIIlIlIIlII(final int lllllllllllllIlIlllIIIlIIIlIIlII) {
        return lllllllllllllIlIlllIIIlIIIlIIlII < 0;
    }
    
    private static void func_146425_a(final String lllllllllllllIlIlllIIIlIlIlIIlll, final Item lllllllllllllIlIlllIIIlIlIlIIllI, final BiomeGenBase lllllllllllllIlIlllIIIlIlIlIIIIl, final FlatLayerInfo... lllllllllllllIlIlllIIIlIlIlIIIII) {
        func_175354_a(lllllllllllllIlIlllIIIlIlIlIIlll, lllllllllllllIlIlllIIIlIlIlIIllI, GuiFlatPresets.llllIIlllIlIl[0], lllllllllllllIlIlllIIIlIlIlIIIIl, null, lllllllllllllIlIlllIIIlIlIlIIIII);
    }
    
    static class LayerItem
    {
        public /* synthetic */ String field_148233_c;
        public /* synthetic */ String field_148232_b;
        public /* synthetic */ int field_179037_b;
        public /* synthetic */ Item field_148234_a;
        
        public LayerItem(final Item lllllllllllllIlIIIIlllIlIlIlIIIl, final int lllllllllllllIlIIIIlllIlIlIIlIll, final String lllllllllllllIlIIIIlllIlIlIIlIlI, final String lllllllllllllIlIIIIlllIlIlIIlIIl) {
            this.field_148234_a = lllllllllllllIlIIIIlllIlIlIlIIIl;
            this.field_179037_b = lllllllllllllIlIIIIlllIlIlIIlIll;
            this.field_148232_b = lllllllllllllIlIIIIlllIlIlIIlIlI;
            this.field_148233_c = lllllllllllllIlIIIIlllIlIlIIlIIl;
        }
    }
    
    class ListSlot extends GuiSlot
    {
        private static final /* synthetic */ int[] lIllllIIlllllI;
        public /* synthetic */ int field_148175_k;
        
        private static void lIIIIlIIIlIllIII() {
            (lIllllIIlllllI = new int[12])[0] = (0x5 ^ 0x3A ^ (0x9 ^ 0x66));
            ListSlot.lIllllIIlllllI[1] = (0x36 ^ 0x13);
            ListSlot.lIllllIIlllllI[2] = (0xF ^ 0x19 ^ (0x73 ^ 0x7D));
            ListSlot.lIllllIIlllllI[3] = -" ".length();
            ListSlot.lIllllIIlllllI[4] = " ".length();
            ListSlot.lIllllIIlllllI[5] = "  ".length();
            ListSlot.lIllllIIlllllI[6] = ((0x29 ^ 0x39 ^ (0xDF ^ 0x8D)) & (3 + 12 + 42 + 76 ^ 113 + 5 - 51 + 132 ^ -" ".length()));
            ListSlot.lIllllIIlllllI[7] = (0x32 ^ 0x20);
            ListSlot.lIllllIIlllllI[8] = (0xC ^ 0xB);
            ListSlot.lIllllIIlllllI[9] = (0x54 ^ 0x4A ^ (0xB0 ^ 0xAB));
            ListSlot.lIllllIIlllllI[10] = (0x7F ^ 0x79);
            ListSlot.lIllllIIlllllI[11] = (-" ".length() & (-1 & 0xFFFFFF));
        }
        
        static {
            lIIIIlIIIlIllIII();
        }
        
        @Override
        protected void elementClicked(final int llllllllllllIllllIlIIlllIIlllIll, final boolean llllllllllllIllllIlIIlllIIlllIlI, final int llllllllllllIllllIlIIlllIIlllIIl, final int llllllllllllIllllIlIIlllIIlllIII) {
            this.field_148175_k = llllllllllllIllllIlIIlllIIlllIll;
            GuiFlatPresets.this.func_146426_g();
            GuiFlatPresets.this.field_146433_u.setText(GuiFlatPresets.FLAT_WORLD_PRESETS.get(GuiFlatPresets.this.field_146435_s.field_148175_k).field_148233_c);
        }
        
        @Override
        protected void drawBackground() {
        }
        
        private void func_148171_c(final int llllllllllllIllllIlIIlllIlIlIlII, final int llllllllllllIllllIlIIlllIlIIlIII, final int llllllllllllIllllIlIIlllIlIlIIlI, final int llllllllllllIllllIlIIlllIlIlIIIl) {
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            this.mc.getTextureManager().bindTexture(Gui.statIcons);
            final float llllllllllllIllllIlIIlllIlIlIIII = 0.0078125f;
            final float llllllllllllIllllIlIIlllIlIIllll = 0.0078125f;
            final int llllllllllllIllllIlIIlllIlIIlllI = ListSlot.lIllllIIlllllI[7];
            final int llllllllllllIllllIlIIlllIlIIllIl = ListSlot.lIllllIIlllllI[7];
            final Tessellator llllllllllllIllllIlIIlllIlIIllII = Tessellator.getInstance();
            final WorldRenderer llllllllllllIllllIlIIlllIlIIlIll = llllllllllllIllllIlIIlllIlIIllII.getWorldRenderer();
            llllllllllllIllllIlIIlllIlIIlIll.begin(ListSlot.lIllllIIlllllI[8], DefaultVertexFormats.POSITION_TEX);
            llllllllllllIllllIlIIlllIlIIlIll.pos(llllllllllllIllllIlIIlllIlIlIlII + ListSlot.lIllllIIlllllI[6], llllllllllllIllllIlIIlllIlIIlIII + ListSlot.lIllllIIlllllI[7], GuiFlatPresets.this.zLevel).tex((llllllllllllIllllIlIIlllIlIlIIlI + ListSlot.lIllllIIlllllI[6]) * 0.0078125f, (llllllllllllIllllIlIIlllIlIlIIIl + ListSlot.lIllllIIlllllI[7]) * 0.0078125f).endVertex();
            llllllllllllIllllIlIIlllIlIIlIll.pos(llllllllllllIllllIlIIlllIlIlIlII + ListSlot.lIllllIIlllllI[7], llllllllllllIllllIlIIlllIlIIlIII + ListSlot.lIllllIIlllllI[7], GuiFlatPresets.this.zLevel).tex((llllllllllllIllllIlIIlllIlIlIIlI + ListSlot.lIllllIIlllllI[7]) * 0.0078125f, (llllllllllllIllllIlIIlllIlIlIIIl + ListSlot.lIllllIIlllllI[7]) * 0.0078125f).endVertex();
            llllllllllllIllllIlIIlllIlIIlIll.pos(llllllllllllIllllIlIIlllIlIlIlII + ListSlot.lIllllIIlllllI[7], llllllllllllIllllIlIIlllIlIIlIII + ListSlot.lIllllIIlllllI[6], GuiFlatPresets.this.zLevel).tex((llllllllllllIllllIlIIlllIlIlIIlI + ListSlot.lIllllIIlllllI[7]) * 0.0078125f, (llllllllllllIllllIlIIlllIlIlIIIl + ListSlot.lIllllIIlllllI[6]) * 0.0078125f).endVertex();
            llllllllllllIllllIlIIlllIlIIlIll.pos(llllllllllllIllllIlIIlllIlIlIlII + ListSlot.lIllllIIlllllI[6], llllllllllllIllllIlIIlllIlIIlIII + ListSlot.lIllllIIlllllI[6], GuiFlatPresets.this.zLevel).tex((llllllllllllIllllIlIIlllIlIlIIlI + ListSlot.lIllllIIlllllI[6]) * 0.0078125f, (llllllllllllIllllIlIIlllIlIlIIIl + ListSlot.lIllllIIlllllI[6]) * 0.0078125f).endVertex();
            llllllllllllIllllIlIIlllIlIIllII.draw();
        }
        
        private void func_178054_a(final int llllllllllllIllllIlIIlllIllIllIl, final int llllllllllllIllllIlIIlllIllIllII, final Item llllllllllllIllllIlIIlllIlllIIII, final int llllllllllllIllllIlIIlllIllIlIlI) {
            this.func_148173_e(llllllllllllIllllIlIIlllIllIllIl + ListSlot.lIllllIIlllllI[4], llllllllllllIllllIlIIlllIllIllII + ListSlot.lIllllIIlllllI[4]);
            GlStateManager.enableRescaleNormal();
            RenderHelper.enableGUIStandardItemLighting();
            GuiFlatPresets.this.itemRender.renderItemIntoGUI(new ItemStack(llllllllllllIllllIlIIlllIlllIIII, ListSlot.lIllllIIlllllI[4], llllllllllllIllllIlIIlllIllIlIlI), llllllllllllIllllIlIIlllIllIllIl + ListSlot.lIllllIIlllllI[5], llllllllllllIllllIlIIlllIllIllII + ListSlot.lIllllIIlllllI[5]);
            RenderHelper.disableStandardItemLighting();
            GlStateManager.disableRescaleNormal();
        }
        
        private void func_148173_e(final int llllllllllllIllllIlIIlllIllIIlIl, final int llllllllllllIllllIlIIlllIllIIlII) {
            this.func_148171_c(llllllllllllIllllIlIIlllIllIIlIl, llllllllllllIllllIlIIlllIllIIlII, ListSlot.lIllllIIlllllI[6], ListSlot.lIllllIIlllllI[6]);
        }
        
        @Override
        protected int getSize() {
            return GuiFlatPresets.FLAT_WORLD_PRESETS.size();
        }
        
        public ListSlot() {
            super(GuiFlatPresets.this.mc, GuiFlatPresets.this.width, GuiFlatPresets.this.height, ListSlot.lIllllIIlllllI[0], GuiFlatPresets.this.height - ListSlot.lIllllIIlllllI[1], ListSlot.lIllllIIlllllI[2]);
            this.field_148175_k = ListSlot.lIllllIIlllllI[3];
        }
        
        @Override
        protected boolean isSelected(final int llllllllllllIllllIlIIlllIIllIIII) {
            if (lIIIIlIIIlIllIIl(llllllllllllIllllIlIIlllIIllIIII, this.field_148175_k)) {
                return ListSlot.lIllllIIlllllI[4] != 0;
            }
            return ListSlot.lIllllIIlllllI[6] != 0;
        }
        
        private static boolean lIIIIlIIIlIllIIl(final int llllllllllllIllllIlIIlllIIIllIlI, final int llllllllllllIllllIlIIlllIIIllIIl) {
            return llllllllllllIllllIlIIlllIIIllIlI == llllllllllllIllllIlIIlllIIIllIIl;
        }
        
        @Override
        protected void drawSlot(final int llllllllllllIllllIlIIlllIIlIlIII, final int llllllllllllIllllIlIIlllIIIlllll, final int llllllllllllIllllIlIIlllIIlIIllI, final int llllllllllllIllllIlIIlllIIlIIlIl, final int llllllllllllIllllIlIIlllIIlIIlII, final int llllllllllllIllllIlIIlllIIlIIIll) {
            final LayerItem llllllllllllIllllIlIIlllIIlIIIlI = GuiFlatPresets.FLAT_WORLD_PRESETS.get(llllllllllllIllllIlIIlllIIlIlIII);
            this.func_178054_a(llllllllllllIllllIlIIlllIIIlllll, llllllllllllIllllIlIIlllIIlIIllI, llllllllllllIllllIlIIlllIIlIIIlI.field_148234_a, llllllllllllIllllIlIIlllIIlIIIlI.field_179037_b);
            GuiFlatPresets.this.fontRendererObj.drawString(llllllllllllIllllIlIIlllIIlIIIlI.field_148232_b, llllllllllllIllllIlIIlllIIIlllll + ListSlot.lIllllIIlllllI[7] + ListSlot.lIllllIIlllllI[9], llllllllllllIllllIlIIlllIIlIIllI + ListSlot.lIllllIIlllllI[10], ListSlot.lIllllIIlllllI[11]);
            "".length();
        }
    }
}
