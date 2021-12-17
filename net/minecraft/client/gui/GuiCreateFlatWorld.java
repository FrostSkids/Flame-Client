// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.gen.FlatLayerInfo;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.ItemStack;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.List;
import net.minecraft.client.resources.I18n;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.io.IOException;
import net.minecraft.world.gen.FlatGeneratorInfo;

public class GuiCreateFlatWorld extends GuiScreen
{
    private /* synthetic */ GuiButton field_146389_t;
    private /* synthetic */ String field_146391_r;
    private /* synthetic */ GuiButton field_146386_v;
    private /* synthetic */ Details createFlatWorldListSlotGui;
    private static final /* synthetic */ int[] lIIIIllIIIllll;
    private /* synthetic */ String flatWorldTitle;
    private /* synthetic */ FlatGeneratorInfo theFlatGeneratorInfo;
    private /* synthetic */ String field_146394_i;
    private final /* synthetic */ GuiCreateWorld createWorldGui;
    private /* synthetic */ GuiButton field_146388_u;
    private static final /* synthetic */ String[] lIIIIllIIIIIIl;
    
    private static void lIlllIllIIIIlIl() {
        (lIIIIllIIIllll = new int[26])[0] = ((0x18 ^ 0x57) & ~(0x37 ^ 0x78));
        GuiCreateFlatWorld.lIIIIllIIIllll[1] = " ".length();
        GuiCreateFlatWorld.lIIIIllIIIllll[2] = "  ".length();
        GuiCreateFlatWorld.lIIIIllIIIllll[3] = 98 + 139 - 122 + 39;
        GuiCreateFlatWorld.lIIIIllIIIllll[4] = (0x1A ^ 0x2E);
        GuiCreateFlatWorld.lIIIIllIIIllll[5] = (0x53 ^ 0x37);
        GuiCreateFlatWorld.lIIIIllIIIllll[6] = (0x85 ^ 0xC4 ^ (0x48 ^ 0x1D));
        GuiCreateFlatWorld.lIIIIllIIIllll[7] = "   ".length();
        GuiCreateFlatWorld.lIIIIllIIIllll[8] = (0xA3 ^ 0xA7);
        GuiCreateFlatWorld.lIIIIllIIIllll[9] = (0xA2 ^ 0x90);
        GuiCreateFlatWorld.lIIIIllIIIllll[10] = (0x49 ^ 0x4C);
        GuiCreateFlatWorld.lIIIIllIIIllll[11] = (0x67 ^ 0x61);
        GuiCreateFlatWorld.lIIIIllIIIllll[12] = 110 + 62 - 139 + 122;
        GuiCreateFlatWorld.lIIIIllIIIllll[13] = (0x8D ^ 0xC4) + (0x8A ^ 0xC1) - (0xC5 ^ 0xB7) + (0xCB ^ 0xBF);
        GuiCreateFlatWorld.lIIIIllIIIllll[14] = (0x22 ^ 0x19 ^ (0x44 ^ 0x78));
        GuiCreateFlatWorld.lIIIIllIIIllll[15] = (137 + 88 - 115 + 31 ^ 112 + 81 - 69 + 21);
        GuiCreateFlatWorld.lIIIIllIIIllll[16] = (0x56 ^ 0x5E);
        GuiCreateFlatWorld.lIIIIllIIIllll[17] = (0x87 ^ 0x8E);
        GuiCreateFlatWorld.lIIIIllIIIllll[18] = (0x4 ^ 0x15 ^ (0x9B ^ 0x80));
        GuiCreateFlatWorld.lIIIIllIIIllll[19] = -" ".length();
        GuiCreateFlatWorld.lIIIIllIIIllll[20] = (-" ".length() & (-1 & 0xFFFFFF));
        GuiCreateFlatWorld.lIIIIllIIIllll[21] = (0x4D ^ 0x11);
        GuiCreateFlatWorld.lIIIIllIIIllll[22] = (0x5F ^ 0x4F);
        GuiCreateFlatWorld.lIIIIllIIIllll[23] = (98 + 86 - 177 + 136 ^ 18 + 78 + 46 + 33);
        GuiCreateFlatWorld.lIIIIllIIIllll[24] = 138 + 164 - 228 + 139;
        GuiCreateFlatWorld.lIIIIllIIIllll[25] = (0x97 ^ 0x84 ^ (0x6C ^ 0x74));
    }
    
    public void func_146383_a(final String lllllllllllllIlIIlIIllllIllllIIl) {
        this.theFlatGeneratorInfo = FlatGeneratorInfo.createFlatGeneratorFromString(lllllllllllllIlIIlIIllllIllllIIl);
    }
    
    private static boolean lIlllIllIIIIllI(final int lllllllllllllIlIIlIIllllIIIllIll, final int lllllllllllllIlIIlIIllllIIIllIlI) {
        return lllllllllllllIlIIlIIllllIIIllIll == lllllllllllllIlIIlIIllllIIIllIlI;
    }
    
    private boolean func_146382_i() {
        if (lIlllIllIIIlIIl(this.createFlatWorldListSlotGui.field_148228_k, GuiCreateFlatWorld.lIIIIllIIIllll[19]) && lIlllIllIIIlIlI(this.createFlatWorldListSlotGui.field_148228_k, this.theFlatGeneratorInfo.getFlatLayers().size())) {
            return GuiCreateFlatWorld.lIIIIllIIIllll[1] != 0;
        }
        return GuiCreateFlatWorld.lIIIIllIIIllll[0] != 0;
    }
    
    private static boolean lIlllIllIIIIlll(final int lllllllllllllIlIIlIIllllIIIIlllI) {
        return lllllllllllllIlIIlIIllllIIIIlllI == 0;
    }
    
    @Override
    public void handleMouseInput() throws IOException {
        super.handleMouseInput();
        this.createFlatWorldListSlotGui.handleMouseInput();
    }
    
    private static String lIlllIlIllllIII(String lllllllllllllIlIIlIIllllIIllIIll, final String lllllllllllllIlIIlIIllllIIllIIlI) {
        lllllllllllllIlIIlIIllllIIllIIll = new String(Base64.getDecoder().decode(lllllllllllllIlIIlIIllllIIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIIllllIIllIllI = new StringBuilder();
        final char[] lllllllllllllIlIIlIIllllIIllIlIl = lllllllllllllIlIIlIIllllIIllIIlI.toCharArray();
        int lllllllllllllIlIIlIIllllIIllIlII = GuiCreateFlatWorld.lIIIIllIIIllll[0];
        final byte lllllllllllllIlIIlIIllllIIlIlllI = (Object)lllllllllllllIlIIlIIllllIIllIIll.toCharArray();
        final boolean lllllllllllllIlIIlIIllllIIlIllIl = lllllllllllllIlIIlIIllllIIlIlllI.length != 0;
        byte lllllllllllllIlIIlIIllllIIlIllII = (byte)GuiCreateFlatWorld.lIIIIllIIIllll[0];
        while (lIlllIllIIIlIlI(lllllllllllllIlIIlIIllllIIlIllII, lllllllllllllIlIIlIIllllIIlIllIl ? 1 : 0)) {
            final char lllllllllllllIlIIlIIllllIIlllIIl = lllllllllllllIlIIlIIllllIIlIlllI[lllllllllllllIlIIlIIllllIIlIllII];
            lllllllllllllIlIIlIIllllIIllIllI.append((char)(lllllllllllllIlIIlIIllllIIlllIIl ^ lllllllllllllIlIIlIIllllIIllIlIl[lllllllllllllIlIIlIIllllIIllIlII % lllllllllllllIlIIlIIllllIIllIlIl.length]));
            "".length();
            ++lllllllllllllIlIIlIIllllIIllIlII;
            ++lllllllllllllIlIIlIIllllIIlIllII;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIIllllIIllIllI);
    }
    
    public String func_146384_e() {
        return this.theFlatGeneratorInfo.toString();
    }
    
    public void func_146375_g() {
        final boolean lllllllllllllIlIIlIIllllIllIIllI = this.func_146382_i();
        this.field_146386_v.enabled = lllllllllllllIlIIlIIllllIllIIllI;
        this.field_146388_u.enabled = lllllllllllllIlIIlIIllllIllIIllI;
        this.field_146388_u.enabled = (GuiCreateFlatWorld.lIIIIllIIIllll[0] != 0);
        this.field_146389_t.enabled = (GuiCreateFlatWorld.lIIIIllIIIllll[0] != 0);
    }
    
    @Override
    public void initGui() {
        this.buttonList.clear();
        this.flatWorldTitle = I18n.format(GuiCreateFlatWorld.lIIIIllIIIIIIl[GuiCreateFlatWorld.lIIIIllIIIllll[0]], new Object[GuiCreateFlatWorld.lIIIIllIIIllll[0]]);
        this.field_146394_i = I18n.format(GuiCreateFlatWorld.lIIIIllIIIIIIl[GuiCreateFlatWorld.lIIIIllIIIllll[1]], new Object[GuiCreateFlatWorld.lIIIIllIIIllll[0]]);
        this.field_146391_r = I18n.format(GuiCreateFlatWorld.lIIIIllIIIIIIl[GuiCreateFlatWorld.lIIIIllIIIllll[2]], new Object[GuiCreateFlatWorld.lIIIIllIIIllll[0]]);
        this.createFlatWorldListSlotGui = new Details();
        final List<GuiButton> buttonList = this.buttonList;
        final GuiButton field_146389_t = new GuiButton(GuiCreateFlatWorld.lIIIIllIIIllll[2], this.width / GuiCreateFlatWorld.lIIIIllIIIllll[2] - GuiCreateFlatWorld.lIIIIllIIIllll[3], this.height - GuiCreateFlatWorld.lIIIIllIIIllll[4], GuiCreateFlatWorld.lIIIIllIIIllll[5], GuiCreateFlatWorld.lIIIIllIIIllll[6], String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiCreateFlatWorld.lIIIIllIIIIIIl[GuiCreateFlatWorld.lIIIIllIIIllll[7]], new Object[GuiCreateFlatWorld.lIIIIllIIIllll[0]]))).append(GuiCreateFlatWorld.lIIIIllIIIIIIl[GuiCreateFlatWorld.lIIIIllIIIllll[8]])));
        this.field_146389_t = field_146389_t;
        buttonList.add(field_146389_t);
        "".length();
        final List<GuiButton> buttonList2 = this.buttonList;
        final GuiButton field_146388_u = new GuiButton(GuiCreateFlatWorld.lIIIIllIIIllll[7], this.width / GuiCreateFlatWorld.lIIIIllIIIllll[2] - GuiCreateFlatWorld.lIIIIllIIIllll[9], this.height - GuiCreateFlatWorld.lIIIIllIIIllll[4], GuiCreateFlatWorld.lIIIIllIIIllll[5], GuiCreateFlatWorld.lIIIIllIIIllll[6], String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiCreateFlatWorld.lIIIIllIIIIIIl[GuiCreateFlatWorld.lIIIIllIIIllll[10]], new Object[GuiCreateFlatWorld.lIIIIllIIIllll[0]]))).append(GuiCreateFlatWorld.lIIIIllIIIIIIl[GuiCreateFlatWorld.lIIIIllIIIllll[11]])));
        this.field_146388_u = field_146388_u;
        buttonList2.add(field_146388_u);
        "".length();
        final List<GuiButton> buttonList3 = this.buttonList;
        final GuiButton field_146386_v = new GuiButton(GuiCreateFlatWorld.lIIIIllIIIllll[8], this.width / GuiCreateFlatWorld.lIIIIllIIIllll[2] - GuiCreateFlatWorld.lIIIIllIIIllll[12], this.height - GuiCreateFlatWorld.lIIIIllIIIllll[4], GuiCreateFlatWorld.lIIIIllIIIllll[13], GuiCreateFlatWorld.lIIIIllIIIllll[6], I18n.format(GuiCreateFlatWorld.lIIIIllIIIIIIl[GuiCreateFlatWorld.lIIIIllIIIllll[14]], new Object[GuiCreateFlatWorld.lIIIIllIIIllll[0]]));
        this.field_146386_v = field_146386_v;
        buttonList3.add(field_146386_v);
        "".length();
        this.buttonList.add(new GuiButton(GuiCreateFlatWorld.lIIIIllIIIllll[0], this.width / GuiCreateFlatWorld.lIIIIllIIIllll[2] - GuiCreateFlatWorld.lIIIIllIIIllll[12], this.height - GuiCreateFlatWorld.lIIIIllIIIllll[15], GuiCreateFlatWorld.lIIIIllIIIllll[13], GuiCreateFlatWorld.lIIIIllIIIllll[6], I18n.format(GuiCreateFlatWorld.lIIIIllIIIIIIl[GuiCreateFlatWorld.lIIIIllIIIllll[16]], new Object[GuiCreateFlatWorld.lIIIIllIIIllll[0]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiCreateFlatWorld.lIIIIllIIIllll[10], this.width / GuiCreateFlatWorld.lIIIIllIIIllll[2] + GuiCreateFlatWorld.lIIIIllIIIllll[10], this.height - GuiCreateFlatWorld.lIIIIllIIIllll[4], GuiCreateFlatWorld.lIIIIllIIIllll[13], GuiCreateFlatWorld.lIIIIllIIIllll[6], I18n.format(GuiCreateFlatWorld.lIIIIllIIIIIIl[GuiCreateFlatWorld.lIIIIllIIIllll[17]], new Object[GuiCreateFlatWorld.lIIIIllIIIllll[0]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiCreateFlatWorld.lIIIIllIIIllll[1], this.width / GuiCreateFlatWorld.lIIIIllIIIllll[2] + GuiCreateFlatWorld.lIIIIllIIIllll[10], this.height - GuiCreateFlatWorld.lIIIIllIIIllll[15], GuiCreateFlatWorld.lIIIIllIIIllll[13], GuiCreateFlatWorld.lIIIIllIIIllll[6], I18n.format(GuiCreateFlatWorld.lIIIIllIIIIIIl[GuiCreateFlatWorld.lIIIIllIIIllll[18]], new Object[GuiCreateFlatWorld.lIIIIllIIIllll[0]])));
        "".length();
        final GuiButton field_146389_t2 = this.field_146389_t;
        final GuiButton field_146388_u2 = this.field_146388_u;
        final int n = GuiCreateFlatWorld.lIIIIllIIIllll[0];
        field_146388_u2.visible = (n != 0);
        field_146389_t2.visible = (n != 0);
        this.theFlatGeneratorInfo.func_82645_d();
        this.func_146375_g();
    }
    
    private static boolean lIlllIllIIIlIIl(final int lllllllllllllIlIIlIIllllIIIlIIll, final int lllllllllllllIlIIlIIllllIIIlIIlI) {
        return lllllllllllllIlIIlIIllllIIIlIIll > lllllllllllllIlIIlIIllllIIIlIIlI;
    }
    
    static {
        lIlllIllIIIIlIl();
        lIlllIlIllllIll();
    }
    
    private static String lIlllIlIlllIIlI(final String lllllllllllllIlIIlIIllllIIlIIIll, final String lllllllllllllIlIIlIIllllIIlIIIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIllllIIlIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIllllIIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIIllllIIlIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIIllllIIlIIlIl.init(GuiCreateFlatWorld.lIIIIllIIIllll[2], lllllllllllllIlIIlIIllllIIlIIllI);
            return new String(lllllllllllllIlIIlIIllllIIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIllllIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIllllIIlIIlII) {
            lllllllllllllIlIIlIIllllIIlIIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlllIllIIIlIII(final int lllllllllllllIlIIlIIllllIIIlIIII) {
        return lllllllllllllIlIIlIIllllIIIlIIII != 0;
    }
    
    private static String lIlllIlIllIllIl(final String lllllllllllllIlIIlIIllllIlIIlIII, final String lllllllllllllIlIIlIIllllIlIIIlll) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIllllIlIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIllllIlIIIlll.getBytes(StandardCharsets.UTF_8)), GuiCreateFlatWorld.lIIIIllIIIllll[16]), "DES");
            final Cipher lllllllllllllIlIIlIIllllIlIIlIlI = Cipher.getInstance("DES");
            lllllllllllllIlIIlIIllllIlIIlIlI.init(GuiCreateFlatWorld.lIIIIllIIIllll[2], lllllllllllllIlIIlIIllllIlIIlIll);
            return new String(lllllllllllllIlIIlIIllllIlIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIllllIlIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIllllIlIIlIIl) {
            lllllllllllllIlIIlIIllllIlIIlIIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIlllIlIllllIll() {
        (lIIIIllIIIIIIl = new String[GuiCreateFlatWorld.lIIIIllIIIllll[25]])[GuiCreateFlatWorld.lIIIIllIIIllll[0]] = lIlllIlIllIllIl("FVQUN+nVgwGJT46v3Z5HTPpm3aIiJAwht6Oq2snXHvZfGocPm0rtDA==", "CsQUc");
        GuiCreateFlatWorld.lIIIIllIIIIIIl[GuiCreateFlatWorld.lIIIIllIIIllll[1]] = lIlllIlIlllIIlI("5fVTJKudTHuO3xZyhWCNp+DTQWiI+9UX8D9iIZUNr7U=", "bCQiR");
        GuiCreateFlatWorld.lIIIIllIIIIIIl[GuiCreateFlatWorld.lIIIIllIIIllll[2]] = lIlllIlIllIllIl("P0D5oSKXYxvbzc4Lz4Minj1F5aeGS3WDQ8HQKGyCPwRHXVRwmSRWqQ==", "vcjTR");
        GuiCreateFlatWorld.lIIIIllIIIIIIl[GuiCreateFlatWorld.lIIIIllIIIllll[7]] = lIlllIlIlllIIlI("b0AakmnGu5S5JOGHSlgQch4YFMEY5fn/oPYpBQNSbyigRDsLho/KvQ==", "LhbWr");
        GuiCreateFlatWorld.lIIIIllIIIIIIl[GuiCreateFlatWorld.lIIIIllIIIllll[8]] = lIlllIlIllllIII("VkonFQVf", "vbiLL");
        GuiCreateFlatWorld.lIIIIllIIIIIIl[GuiCreateFlatWorld.lIIIIllIIIllll[10]] = lIlllIlIlllIIlI("cce6arN0ZzLmQeaLlu5mA7xzoSOp6ZpDNkiwb9rd5o/lfQGy+MypBg==", "AfGRW");
        GuiCreateFlatWorld.lIIIIllIIIIIIl[GuiCreateFlatWorld.lIIIIllIIIllll[11]] = lIlllIlIlllIIlI("bnReO759J3U=", "UtzzW");
        GuiCreateFlatWorld.lIIIIllIIIIIIl[GuiCreateFlatWorld.lIIIIllIIIllll[14]] = lIlllIlIllllIII("BiYmJhUAAyw1DQF6IDISETsuLhsAeiUrABF6MSIMCiImCwAcMTE=", "eTCGa");
        GuiCreateFlatWorld.lIIIIllIIIIIIl[GuiCreateFlatWorld.lIIIIllIIIllll[16]] = lIlllIlIlllIIlI("EAZpO+v3BdUXQquowpNoOA==", "zwQka");
        GuiCreateFlatWorld.lIIIIllIIIIIIl[GuiCreateFlatWorld.lIIIIllIIIllll[17]] = lIlllIlIllllIII("DTYCDz4LEwgcJgpqBBs5GisKBzALahccLx0hEx0=", "nDgnJ");
        GuiCreateFlatWorld.lIIIIllIIIIIIl[GuiCreateFlatWorld.lIIIIllIIIllll[18]] = lIlllIlIllllIII("DjodTxAIIRcEHw==", "iOtas");
    }
    
    public GuiCreateFlatWorld(final GuiCreateWorld lllllllllllllIlIIlIIlllllIIIIIll, final String lllllllllllllIlIIlIIlllllIIIIIlI) {
        this.theFlatGeneratorInfo = FlatGeneratorInfo.getDefaultFlatGenerator();
        this.createWorldGui = lllllllllllllIlIIlIIlllllIIIIIll;
        this.func_146383_a(lllllllllllllIlIIlIIlllllIIIIIlI);
    }
    
    private static boolean lIlllIllIIIlIlI(final int lllllllllllllIlIIlIIllllIIIlIlll, final int lllllllllllllIlIIlIIllllIIIlIllI) {
        return lllllllllllllIlIIlIIllllIIIlIlll < lllllllllllllIlIIlIIllllIIIlIllI;
    }
    
    @Override
    public void drawScreen(final int lllllllllllllIlIIlIIllllIlIlIlIl, final int lllllllllllllIlIIlIIllllIlIllIIl, final float lllllllllllllIlIIlIIllllIlIllIII) {
        this.drawDefaultBackground();
        this.createFlatWorldListSlotGui.drawScreen(lllllllllllllIlIIlIIllllIlIlIlIl, lllllllllllllIlIIlIIllllIlIllIIl, lllllllllllllIlIIlIIllllIlIllIII);
        this.drawCenteredString(this.fontRendererObj, this.flatWorldTitle, this.width / GuiCreateFlatWorld.lIIIIllIIIllll[2], GuiCreateFlatWorld.lIIIIllIIIllll[16], GuiCreateFlatWorld.lIIIIllIIIllll[20]);
        final int lllllllllllllIlIIlIIllllIlIlIlll = this.width / GuiCreateFlatWorld.lIIIIllIIIllll[2] - GuiCreateFlatWorld.lIIIIllIIIllll[21] - GuiCreateFlatWorld.lIIIIllIIIllll[22];
        this.drawString(this.fontRendererObj, this.field_146394_i, lllllllllllllIlIIlIIllllIlIlIlll, GuiCreateFlatWorld.lIIIIllIIIllll[23], GuiCreateFlatWorld.lIIIIllIIIllll[20]);
        this.drawString(this.fontRendererObj, this.field_146391_r, lllllllllllllIlIIlIIllllIlIlIlll + GuiCreateFlatWorld.lIIIIllIIIllll[2] + GuiCreateFlatWorld.lIIIIllIIIllll[24] - this.fontRendererObj.getStringWidth(this.field_146391_r), GuiCreateFlatWorld.lIIIIllIIIllll[23], GuiCreateFlatWorld.lIIIIllIIIllll[20]);
        super.drawScreen(lllllllllllllIlIIlIIllllIlIlIlIl, lllllllllllllIlIIlIIllllIlIllIIl, lllllllllllllIlIIlIIllllIlIllIII);
    }
    
    @Override
    protected void actionPerformed(final GuiButton lllllllllllllIlIIlIIllllIllIlllI) throws IOException {
        final int lllllllllllllIlIIlIIllllIllIllIl = this.theFlatGeneratorInfo.getFlatLayers().size() - this.createFlatWorldListSlotGui.field_148228_k - GuiCreateFlatWorld.lIIIIllIIIllll[1];
        if (lIlllIllIIIIllI(lllllllllllllIlIIlIIllllIllIlllI.id, GuiCreateFlatWorld.lIIIIllIIIllll[1])) {
            this.mc.displayGuiScreen(this.createWorldGui);
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lIlllIllIIIIlll(lllllllllllllIlIIlIIllllIllIlllI.id)) {
            this.createWorldGui.chunkProviderSettingsJson = this.func_146384_e();
            this.mc.displayGuiScreen(this.createWorldGui);
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        }
        else if (lIlllIllIIIIllI(lllllllllllllIlIIlIIllllIllIlllI.id, GuiCreateFlatWorld.lIIIIllIIIllll[10])) {
            this.mc.displayGuiScreen(new GuiFlatPresets(this));
            "".length();
            if ((13 + 120 - 41 + 80 ^ 131 + 103 - 228 + 163) == 0x0) {
                return;
            }
        }
        else if (lIlllIllIIIIllI(lllllllllllllIlIIlIIllllIllIlllI.id, GuiCreateFlatWorld.lIIIIllIIIllll[8]) && lIlllIllIIIlIII(this.func_146382_i() ? 1 : 0)) {
            this.theFlatGeneratorInfo.getFlatLayers().remove(lllllllllllllIlIIlIIllllIllIllIl);
            "".length();
            this.createFlatWorldListSlotGui.field_148228_k = Math.min(this.createFlatWorldListSlotGui.field_148228_k, this.theFlatGeneratorInfo.getFlatLayers().size() - GuiCreateFlatWorld.lIIIIllIIIllll[1]);
        }
        this.theFlatGeneratorInfo.func_82645_d();
        this.func_146375_g();
    }
    
    class Details extends GuiSlot
    {
        private static final /* synthetic */ int[] lIIIlIIIlIIIIl;
        public /* synthetic */ int field_148228_k;
        private static final /* synthetic */ String[] lIIIlIIIIlIIIl;
        
        private static boolean lIlllllIIllIIII(final int lllllllllllllIlIIIllIIIllllllIII) {
            return lllllllllllllIlIIIllIIIllllllIII == 0;
        }
        
        private static boolean lIlllllIIlIllIl(final Object lllllllllllllIlIIIllIIlIIIIIIIll, final Object lllllllllllllIlIIIllIIlIIIIIIIlI) {
            return lllllllllllllIlIIIllIIlIIIIIIIll != lllllllllllllIlIIIllIIlIIIIIIIlI;
        }
        
        @Override
        protected void drawBackground() {
        }
        
        private void func_148225_a(final int lllllllllllllIlIIIllIIlIlIlIllII, final int lllllllllllllIlIIIllIIlIlIlIlIll, final ItemStack lllllllllllllIlIIIllIIlIlIlIlIlI) {
            this.func_148226_e(lllllllllllllIlIIIllIIlIlIlIllII + Details.lIIIlIIIlIIIIl[4], lllllllllllllIlIIIllIIlIlIlIlIll + Details.lIIIlIIIlIIIIl[4]);
            GlStateManager.enableRescaleNormal();
            if (lIlllllIIlIlIll(lllllllllllllIlIIIllIIlIlIlIlIlI) && lIlllllIIlIlIll(lllllllllllllIlIIIllIIlIlIlIlIlI.getItem())) {
                RenderHelper.enableGUIStandardItemLighting();
                GuiCreateFlatWorld.this.itemRender.renderItemIntoGUI(lllllllllllllIlIIIllIIlIlIlIlIlI, lllllllllllllIlIIIllIIlIlIlIllII + Details.lIIIlIIIlIIIIl[5], lllllllllllllIlIIIllIIlIlIlIlIll + Details.lIIIlIIIlIIIIl[5]);
                RenderHelper.disableStandardItemLighting();
            }
            GlStateManager.disableRescaleNormal();
        }
        
        private static boolean lIlllllIIllIIIl(final int lllllllllllllIlIIIllIIlIIIIIIlll, final int lllllllllllllIlIIIllIIlIIIIIIllI) {
            return lllllllllllllIlIIIllIIlIIIIIIlll < lllllllllllllIlIIIllIIlIIIIIIllI;
        }
        
        @Override
        protected int getSize() {
            return GuiCreateFlatWorld.this.theFlatGeneratorInfo.getFlatLayers().size();
        }
        
        private static boolean lIlllllIIlIllII(final int lllllllllllllIlIIIllIIlIIIIIlIll, final int lllllllllllllIlIIIllIIlIIIIIlIlI) {
            return lllllllllllllIlIIIllIIlIIIIIlIll == lllllllllllllIlIIIllIIlIIIIIlIlI;
        }
        
        private void func_148224_c(final int lllllllllllllIlIIIllIIlIlIIIIlIl, final int lllllllllllllIlIIIllIIlIlIIIIlII, final int lllllllllllllIlIIIllIIlIlIIIIIll, final int lllllllllllllIlIIIllIIlIlIIIllIl) {
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            this.mc.getTextureManager().bindTexture(Gui.statIcons);
            final float lllllllllllllIlIIIllIIlIlIIIllII = 0.0078125f;
            final float lllllllllllllIlIIIllIIlIlIIIlIll = 0.0078125f;
            final int lllllllllllllIlIIIllIIlIlIIIlIlI = Details.lIIIlIIIlIIIIl[7];
            final int lllllllllllllIlIIIllIIlIlIIIlIIl = Details.lIIIlIIIlIIIIl[7];
            final Tessellator lllllllllllllIlIIIllIIlIlIIIlIII = Tessellator.getInstance();
            final WorldRenderer lllllllllllllIlIIIllIIlIlIIIIlll = lllllllllllllIlIIIllIIlIlIIIlIII.getWorldRenderer();
            lllllllllllllIlIIIllIIlIlIIIIlll.begin(Details.lIIIlIIIlIIIIl[8], DefaultVertexFormats.POSITION_TEX);
            lllllllllllllIlIIIllIIlIlIIIIlll.pos(lllllllllllllIlIIIllIIlIlIIIIlIl + Details.lIIIlIIIlIIIIl[6], lllllllllllllIlIIIllIIlIlIIIIlII + Details.lIIIlIIIlIIIIl[7], GuiCreateFlatWorld.this.zLevel).tex((lllllllllllllIlIIIllIIlIlIIIIIll + Details.lIIIlIIIlIIIIl[6]) * 0.0078125f, (lllllllllllllIlIIIllIIlIlIIIllIl + Details.lIIIlIIIlIIIIl[7]) * 0.0078125f).endVertex();
            lllllllllllllIlIIIllIIlIlIIIIlll.pos(lllllllllllllIlIIIllIIlIlIIIIlIl + Details.lIIIlIIIlIIIIl[7], lllllllllllllIlIIIllIIlIlIIIIlII + Details.lIIIlIIIlIIIIl[7], GuiCreateFlatWorld.this.zLevel).tex((lllllllllllllIlIIIllIIlIlIIIIIll + Details.lIIIlIIIlIIIIl[7]) * 0.0078125f, (lllllllllllllIlIIIllIIlIlIIIllIl + Details.lIIIlIIIlIIIIl[7]) * 0.0078125f).endVertex();
            lllllllllllllIlIIIllIIlIlIIIIlll.pos(lllllllllllllIlIIIllIIlIlIIIIlIl + Details.lIIIlIIIlIIIIl[7], lllllllllllllIlIIIllIIlIlIIIIlII + Details.lIIIlIIIlIIIIl[6], GuiCreateFlatWorld.this.zLevel).tex((lllllllllllllIlIIIllIIlIlIIIIIll + Details.lIIIlIIIlIIIIl[7]) * 0.0078125f, (lllllllllllllIlIIIllIIlIlIIIllIl + Details.lIIIlIIIlIIIIl[6]) * 0.0078125f).endVertex();
            lllllllllllllIlIIIllIIlIlIIIIlll.pos(lllllllllllllIlIIIllIIlIlIIIIlIl + Details.lIIIlIIIlIIIIl[6], lllllllllllllIlIIIllIIlIlIIIIlII + Details.lIIIlIIIlIIIIl[6], GuiCreateFlatWorld.this.zLevel).tex((lllllllllllllIlIIIllIIlIlIIIIIll + Details.lIIIlIIIlIIIIl[6]) * 0.0078125f, (lllllllllllllIlIIIllIIlIlIIIllIl + Details.lIIIlIIIlIIIIl[6]) * 0.0078125f).endVertex();
            lllllllllllllIlIIIllIIlIlIIIlIII.draw();
        }
        
        private static boolean lIlllllIIlIllll(final Object lllllllllllllIlIIIllIIIlllllllIl, final Object lllllllllllllIlIIIllIIIlllllllII) {
            return lllllllllllllIlIIIllIIIlllllllIl == lllllllllllllIlIIIllIIIlllllllII;
        }
        
        private static String lIllllIllllllll(final String lllllllllllllIlIIIllIIlIIIlllIII, final String lllllllllllllIlIIIllIIlIIIllIlIl) {
            try {
                final SecretKeySpec lllllllllllllIlIIIllIIlIIIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIllIIlIIIllIlIl.getBytes(StandardCharsets.UTF_8)), Details.lIIIlIIIlIIIIl[15]), "DES");
                final Cipher lllllllllllllIlIIIllIIlIIIlllIlI = Cipher.getInstance("DES");
                lllllllllllllIlIIIllIIlIIIlllIlI.init(Details.lIIIlIIIlIIIIl[5], lllllllllllllIlIIIllIIlIIIlllIll);
                return new String(lllllllllllllIlIIIllIIlIIIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIllIIlIIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIIllIIlIIIlllIIl) {
                lllllllllllllIlIIIllIIlIIIlllIIl.printStackTrace();
                return null;
            }
        }
        
        @Override
        protected void drawSlot(final int lllllllllllllIlIIIllIIlIIlIlllII, final int lllllllllllllIlIIIllIIlIIlIIlIll, final int lllllllllllllIlIIIllIIlIIlIllIlI, final int lllllllllllllIlIIIllIIlIIlIllIIl, final int lllllllllllllIlIIIllIIlIIlIllIII, final int lllllllllllllIlIIIllIIlIIlIlIlll) {
            final FlatLayerInfo lllllllllllllIlIIIllIIlIIlIlIllI = GuiCreateFlatWorld.this.theFlatGeneratorInfo.getFlatLayers().get(GuiCreateFlatWorld.this.theFlatGeneratorInfo.getFlatLayers().size() - lllllllllllllIlIIIllIIlIIlIlllII - Details.lIIIlIIIlIIIIl[4]);
            final IBlockState lllllllllllllIlIIIllIIlIIlIlIlIl = lllllllllllllIlIIIllIIlIIlIlIllI.func_175900_c();
            final Block lllllllllllllIlIIIllIIlIIlIlIlII = lllllllllllllIlIIIllIIlIIlIlIlIl.getBlock();
            Item lllllllllllllIlIIIllIIlIIlIlIIll = Item.getItemFromBlock(lllllllllllllIlIIIllIIlIIlIlIlII);
            ItemStack itemStack;
            if (lIlllllIIlIllIl(lllllllllllllIlIIIllIIlIIlIlIlII, Blocks.air) && lIlllllIIlIlIll(lllllllllllllIlIIIllIIlIIlIlIIll)) {
                itemStack = new ItemStack(lllllllllllllIlIIIllIIlIIlIlIIll, Details.lIIIlIIIlIIIIl[4], lllllllllllllIlIIIllIIlIIlIlIlII.getMetaFromState(lllllllllllllIlIIIllIIlIIlIlIlIl));
                "".length();
                if ((0x3A ^ 0x3F) == 0x0) {
                    return;
                }
            }
            else {
                itemStack = null;
            }
            ItemStack lllllllllllllIlIIIllIIlIIlIlIIlI = itemStack;
            String itemStackDisplayName;
            if (lIlllllIIlIlllI(lllllllllllllIlIIIllIIlIIlIlIIlI)) {
                itemStackDisplayName = Details.lIIIlIIIIlIIIl[Details.lIIIlIIIlIIIIl[6]];
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
            }
            else {
                itemStackDisplayName = lllllllllllllIlIIIllIIlIIlIlIIll.getItemStackDisplayName(lllllllllllllIlIIIllIIlIIlIlIIlI);
            }
            String lllllllllllllIlIIIllIIlIIlIlIIIl = itemStackDisplayName;
            if (lIlllllIIlIlllI(lllllllllllllIlIIIllIIlIIlIlIIll)) {
                if (lIlllllIIlIllIl(lllllllllllllIlIIIllIIlIIlIlIlII, Blocks.water) && lIlllllIIlIllIl(lllllllllllllIlIIIllIIlIIlIlIlII, Blocks.flowing_water)) {
                    if (!lIlllllIIlIllIl(lllllllllllllIlIIIllIIlIIlIlIlII, Blocks.lava) || lIlllllIIlIllll(lllllllllllllIlIIIllIIlIIlIlIlII, Blocks.flowing_lava)) {
                        lllllllllllllIlIIIllIIlIIlIlIIll = Items.lava_bucket;
                        "".length();
                        if (((0x1B ^ 0x2C ^ (0x58 ^ 0x7A)) & (105 + 27 - 50 + 48 ^ 125 + 89 - 200 + 137 ^ -" ".length())) != 0x0) {
                            return;
                        }
                    }
                }
                else {
                    lllllllllllllIlIIIllIIlIIlIlIIll = Items.water_bucket;
                }
                if (lIlllllIIlIlIll(lllllllllllllIlIIIllIIlIIlIlIIll)) {
                    lllllllllllllIlIIIllIIlIIlIlIIlI = new ItemStack(lllllllllllllIlIIIllIIlIIlIlIIll, Details.lIIIlIIIlIIIIl[4], lllllllllllllIlIIIllIIlIIlIlIlII.getMetaFromState(lllllllllllllIlIIIllIIlIIlIlIlIl));
                    lllllllllllllIlIIIllIIlIIlIlIIIl = lllllllllllllIlIIIllIIlIIlIlIlII.getLocalizedName();
                }
            }
            this.func_148225_a(lllllllllllllIlIIIllIIlIIlIIlIll, lllllllllllllIlIIIllIIlIIlIllIlI, lllllllllllllIlIIIllIIlIIlIlIIlI);
            GuiCreateFlatWorld.this.fontRendererObj.drawString(lllllllllllllIlIIIllIIlIIlIlIIIl, lllllllllllllIlIIIllIIlIIlIIlIll + Details.lIIIlIIIlIIIIl[7] + Details.lIIIlIIIlIIIIl[9], lllllllllllllIlIIIllIIlIIlIllIlI + Details.lIIIlIIIlIIIIl[10], Details.lIIIlIIIlIIIIl[11]);
            "".length();
            String lllllllllllllIlIIIllIIlIIlIIlllI = null;
            if (lIlllllIIllIIII(lllllllllllllIlIIIllIIlIIlIlllII)) {
                final String llllllllllllIlIllIlIIIIIllllIIll = Details.lIIIlIIIIlIIIl[Details.lIIIlIIIlIIIIl[4]];
                final Object[] llllllllllllIlIllIlIIIIIllllIIII = new Object[Details.lIIIlIIIlIIIIl[4]];
                llllllllllllIlIllIlIIIIIllllIIII[Details.lIIIlIIIlIIIIl[6]] = lllllllllllllIlIIIllIIlIIlIlIllI.getLayerCount();
                final String lllllllllllllIlIIIllIIlIIlIlIIII = I18n.format(llllllllllllIlIllIlIIIIIllllIIll, llllllllllllIlIllIlIIIIIllllIIII);
                "".length();
                if (((0xA6 ^ 0xB1) & ~(0x75 ^ 0x62)) != 0x0) {
                    return;
                }
            }
            else if (lIlllllIIlIllII(lllllllllllllIlIIIllIIlIIlIlllII, GuiCreateFlatWorld.this.theFlatGeneratorInfo.getFlatLayers().size() - Details.lIIIlIIIlIIIIl[4])) {
                final String llllllllllllIlIllIlIIIIIllllIIll2 = Details.lIIIlIIIIlIIIl[Details.lIIIlIIIlIIIIl[5]];
                final Object[] llllllllllllIlIllIlIIIIIllllIIII2 = new Object[Details.lIIIlIIIlIIIIl[4]];
                llllllllllllIlIllIlIIIIIllllIIII2[Details.lIIIlIIIlIIIIl[6]] = lllllllllllllIlIIIllIIlIIlIlIllI.getLayerCount();
                final String lllllllllllllIlIIIllIIlIIlIIllll = I18n.format(llllllllllllIlIllIlIIIIIllllIIll2, llllllllllllIlIllIlIIIIIllllIIII2);
                "".length();
                if ("  ".length() >= "   ".length()) {
                    return;
                }
            }
            else {
                final String llllllllllllIlIllIlIIIIIllllIIll3 = Details.lIIIlIIIIlIIIl[Details.lIIIlIIIlIIIIl[10]];
                final Object[] llllllllllllIlIllIlIIIIIllllIIII3 = new Object[Details.lIIIlIIIlIIIIl[4]];
                llllllllllllIlIllIlIIIIIllllIIII3[Details.lIIIlIIIlIIIIl[6]] = lllllllllllllIlIIIllIIlIIlIlIllI.getLayerCount();
                lllllllllllllIlIIIllIIlIIlIIlllI = I18n.format(llllllllllllIlIllIlIIIIIllllIIll3, llllllllllllIlIllIlIIIIIllllIIII3);
            }
            GuiCreateFlatWorld.this.fontRendererObj.drawString(lllllllllllllIlIIIllIIlIIlIIlllI, lllllllllllllIlIIIllIIlIIlIIlIll + Details.lIIIlIIIlIIIIl[5] + Details.lIIIlIIIlIIIIl[12] - GuiCreateFlatWorld.this.fontRendererObj.getStringWidth(lllllllllllllIlIIIllIIlIIlIIlllI), lllllllllllllIlIIIllIIlIIlIllIlI + Details.lIIIlIIIlIIIIl[10], Details.lIIIlIIIlIIIIl[11]);
            "".length();
        }
        
        private static void lIlllllIIlIlIlI() {
            (lIIIlIIIlIIIIl = new int[16])[0] = (0x6B ^ 0x40);
            Details.lIIIlIIIlIIIIl[1] = (0x19 ^ 0x29 ^ (0x41 ^ 0x4D));
            Details.lIIIlIIIlIIIIl[2] = (0x69 ^ 0x71);
            Details.lIIIlIIIlIIIIl[3] = -" ".length();
            Details.lIIIlIIIlIIIIl[4] = " ".length();
            Details.lIIIlIIIlIIIIl[5] = "  ".length();
            Details.lIIIlIIIlIIIIl[6] = ((0x18 ^ 0x50) & ~(0xCA ^ 0x82));
            Details.lIIIlIIIlIIIIl[7] = (0x36 ^ 0x12 ^ (0x4B ^ 0x7D));
            Details.lIIIlIIIlIIIIl[8] = (0xC4 ^ 0xA9 ^ (0xC ^ 0x66));
            Details.lIIIlIIIlIIIIl[9] = (0xAF ^ 0xAA);
            Details.lIIIlIIIlIIIIl[10] = "   ".length();
            Details.lIIIlIIIlIIIIl[11] = (-1 & 0xFFFFFF);
            Details.lIIIlIIIlIIIIl[12] = 212 + 20 - 206 + 187;
            Details.lIIIlIIIlIIIIl[13] = (0xC0 ^ 0x86);
            Details.lIIIlIIIlIIIIl[14] = (0x76 ^ 0x72);
            Details.lIIIlIIIlIIIIl[15] = (72 + 57 - 71 + 101 ^ 112 + 96 - 115 + 58);
        }
        
        @Override
        protected int getScrollBarX() {
            return this.width - Details.lIIIlIIIlIIIIl[13];
        }
        
        private static String lIlllllIIIIIIlI(String lllllllllllllIlIIIllIIlIIIlIIIll, final String lllllllllllllIlIIIllIIlIIIlIIIlI) {
            lllllllllllllIlIIIllIIlIIIlIIIll = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIllIIlIIIlIIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIIIllIIlIIIlIIllI = new StringBuilder();
            final char[] lllllllllllllIlIIIllIIlIIIlIIlIl = lllllllllllllIlIIIllIIlIIIlIIIlI.toCharArray();
            int lllllllllllllIlIIIllIIlIIIlIIlII = Details.lIIIlIIIlIIIIl[6];
            final float lllllllllllllIlIIIllIIlIIIIllllI = (Object)((String)lllllllllllllIlIIIllIIlIIIlIIIll).toCharArray();
            final Exception lllllllllllllIlIIIllIIlIIIIlllIl = (Exception)lllllllllllllIlIIIllIIlIIIIllllI.length;
            float lllllllllllllIlIIIllIIlIIIIlllII = Details.lIIIlIIIlIIIIl[6];
            while (lIlllllIIllIIIl((int)lllllllllllllIlIIIllIIlIIIIlllII, (int)lllllllllllllIlIIIllIIlIIIIlllIl)) {
                final char lllllllllllllIlIIIllIIlIIIlIlIIl = lllllllllllllIlIIIllIIlIIIIllllI[lllllllllllllIlIIIllIIlIIIIlllII];
                lllllllllllllIlIIIllIIlIIIlIIllI.append((char)(lllllllllllllIlIIIllIIlIIIlIlIIl ^ lllllllllllllIlIIIllIIlIIIlIIlIl[lllllllllllllIlIIIllIIlIIIlIIlII % lllllllllllllIlIIIllIIlIIIlIIlIl.length]));
                "".length();
                ++lllllllllllllIlIIIllIIlIIIlIIlII;
                ++lllllllllllllIlIIIllIIlIIIIlllII;
                "".length();
                if ((0x46 ^ 0x6C ^ (0x31 ^ 0x1F)) < "   ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIIIllIIlIIIlIIllI);
        }
        
        private void func_148226_e(final int lllllllllllllIlIIIllIIlIlIIllllI, final int lllllllllllllIlIIIllIIlIlIlIIIII) {
            this.func_148224_c(lllllllllllllIlIIIllIIlIlIIllllI, lllllllllllllIlIIIllIIlIlIlIIIII, Details.lIIIlIIIlIIIIl[6], Details.lIIIlIIIlIIIIl[6]);
        }
        
        @Override
        protected boolean isSelected(final int lllllllllllllIlIIIllIIlIIllIllII) {
            if (lIlllllIIlIllII(lllllllllllllIlIIIllIIlIIllIllII, this.field_148228_k)) {
                return Details.lIIIlIIIlIIIIl[4] != 0;
            }
            return Details.lIIIlIIIlIIIIl[6] != 0;
        }
        
        public Details() {
            super(GuiCreateFlatWorld.this.mc, GuiCreateFlatWorld.this.width, GuiCreateFlatWorld.this.height, Details.lIIIlIIIlIIIIl[0], GuiCreateFlatWorld.this.height - Details.lIIIlIIIlIIIIl[1], Details.lIIIlIIIlIIIIl[2]);
            this.field_148228_k = Details.lIIIlIIIlIIIIl[3];
        }
        
        private static boolean lIlllllIIlIlllI(final Object lllllllllllllIlIIIllIIIllllllIlI) {
            return lllllllllllllIlIIIllIIIllllllIlI == null;
        }
        
        @Override
        protected void elementClicked(final int lllllllllllllIlIIIllIIlIIlllIIII, final boolean lllllllllllllIlIIIllIIlIIlllIlII, final int lllllllllllllIlIIIllIIlIIlllIIll, final int lllllllllllllIlIIIllIIlIIlllIIlI) {
            this.field_148228_k = lllllllllllllIlIIIllIIlIIlllIIII;
            GuiCreateFlatWorld.this.func_146375_g();
        }
        
        private static boolean lIlllllIIlIlIll(final Object lllllllllllllIlIIIllIIlIIIIIIIII) {
            return lllllllllllllIlIIIllIIlIIIIIIIII != null;
        }
        
        static {
            lIlllllIIlIlIlI();
            lIlllllIIIIIIll();
        }
        
        private static void lIlllllIIIIIIll() {
            (lIIIlIIIIlIIIl = new String[Details.lIIIlIIIlIIIIl[14]])[Details.lIIIlIIIlIIIIl[6]] = lIllllIllllllll("Gy7FQmCxYcA=", "Omsws");
            Details.lIIIlIIIIlIIIl[Details.lIIIlIIIlIIIIl[4]] = lIlllllIIIIIIII("0ZuM2pU1V5K2NnF+azxLtwAE0whzV6yVAhyWetC9jI3GlzZAiZ3xdw==", "sTobw");
            Details.lIIIlIIIIlIIIl[Details.lIIIlIIIlIIIIl[5]] = lIlllllIIIIIIlI("JCEpBjEiBCMVKSN9LxI2MzwhDj8ifSoLJDN9IAY8IiFiBSozJyMK", "GSLgE");
            Details.lIIIlIIIIlIIIl[Details.lIIIlIIIlIIIIl[10]] = lIlllllIIIIIIII("IqqtK7YNs5Wlqkb68smrUu9kqrEcyuQOEPHZw2NYS+d8Klenb0ewCg==", "kTYno");
        }
        
        private static String lIlllllIIIIIIII(final String lllllllllllllIlIIIllIIlIIIIlIIIl, final String lllllllllllllIlIIIllIIlIIIIlIIII) {
            try {
                final SecretKeySpec lllllllllllllIlIIIllIIlIIIIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIllIIlIIIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIIIllIIlIIIIlIlIl = Cipher.getInstance("Blowfish");
                lllllllllllllIlIIIllIIlIIIIlIlIl.init(Details.lIIIlIIIlIIIIl[5], lllllllllllllIlIIIllIIlIIIIlIllI);
                return new String(lllllllllllllIlIIIllIIlIIIIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIllIIlIIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIIllIIlIIIIlIlII) {
                lllllllllllllIlIIIllIIlIIIIlIlII.printStackTrace();
                return null;
            }
        }
    }
}
