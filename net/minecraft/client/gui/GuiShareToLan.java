// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.io.IOException;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.WorldSettings;
import java.util.List;
import net.minecraft.client.resources.I18n;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class GuiShareToLan extends GuiScreen
{
    private /* synthetic */ GuiButton field_146597_g;
    private /* synthetic */ boolean field_146600_i;
    private /* synthetic */ GuiButton field_146596_f;
    private final /* synthetic */ GuiScreen field_146598_a;
    private static final /* synthetic */ int[] llIIIlIIIlllIl;
    private /* synthetic */ String field_146599_h;
    private static final /* synthetic */ String[] llIIIlIIIllIlI;
    
    private static void lIIIlIIIlllIlIlI() {
        (llIIIlIIIllIlI = new String[GuiShareToLan.llIIIlIIIlllIl[34]])[GuiShareToLan.llIIIlIIIlllIl[0]] = lIIIlIIIlllIIIIl("bKCx8RBL6B8//YfSNXiKyQ==", "UCrKE");
        GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[7]] = lIIIlIIIlllIIIlI("jLIvB0W+8eK4Dmmng1CC7w==", "CKBdo");
        GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[2]] = lIIIlIIIlllIIIll("Ez0fYykVJhUoJg==", "tHvMJ");
        GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[12]] = lIIIlIIIlllIIIll("ITIbCAEmABgfDjZ5EAwPNxoYCQc=", "RWwmb");
        GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[14]] = lIIIlIIIlllIIIlI("l2TGtb6e9TLqlSRMTvUixUxzkbeep6e7mWewVPmhBKY=", "jBjlW");
        GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[9]] = lIIIlIIIlllIIIlI("sD5J5FQsbROa1p2RzbyrwdrFhgC5jCWZ", "gLnKG");
        GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[15]] = lIIIlIIIlllIIIIl("EdgkkCJSsv4=", "Ejuwr");
        GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[16]] = lIIIlIIIlllIIIIl("KTNZFVVwP1Fm28A2GfOUIaxPj+IfWdxc", "DPoGB");
        GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[17]] = lIIIlIIIlllIIIIl("fQ/txu7XSqfzfyEeoKqow36Z/wPv8+vfpAqEg9IKYmc=", "zFqwo");
        GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[18]] = lIIIlIIIlllIIIll("dg==", "VWyHa");
        GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[19]] = lIIIlIIIlllIIIIl("X4TKTi4lj6mmS81O4JoMEw==", "NPdlp");
        GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[20]] = lIIIlIIIlllIIIIl("Hr64tWcs1gjPbOOprnDM5w==", "KzQwt");
        GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[21]] = lIIIlIIIlllIIIlI("lCVIaA7L9X0M3U2ekouU9w==", "PYPHv");
        GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[22]] = lIIIlIIIlllIIIll("AQMEFSILBwQ=", "bqatV");
        GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[23]] = lIIIlIIIlllIIIll("BicvNBIMIy8=", "eUJUf");
        GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[24]] = lIIIlIIIlllIIIlI("DXiH9eSPmsZFR3VlgCikeQ==", "ESKju");
        GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[25]] = lIIIlIIIlllIIIlI("V/XAE4oejdEDpxNzb/xrlA==", "FGFPh");
        GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[26]] = lIIIlIIIlllIIIlI("rwNpZ6DyZwg4jof4z+I8NQ==", "EbCcf");
        GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[27]] = lIIIlIIIlllIIIll("CjI1KSAYNj84", "yBPJT");
        GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[28]] = lIIIlIIIlllIIIIl("aV34p0JXGVAXsmsbfnmMBRy7SXUtAD6ZiSPWKk0brCc=", "IryoN");
        GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[6]] = lIIIlIIIlllIIIll("CCknJCgFIjlnOR4kJiA6A2gsKCAHIy4=", "kFJII");
        GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[29]] = lIIIlIIIlllIIIlI("EgUnaRRUulgh9rj7J+lVnw==", "JoNtf");
        GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[32]] = lIIIlIIIlllIIIIl("BGx6ajHnuFj8Hbk55PGH/BqmqZOBtnqI", "kMVKC");
    }
    
    private static boolean lIIIlIIIllllIIII(final int llllllllllllIlllIllIIIIlIIlIIIII) {
        return llllllllllllIlllIllIIIIlIIlIIIII != 0;
    }
    
    private static boolean lIIIlIIIllllIIll(final int llllllllllllIlllIllIIIIlIIlIIlIl, final int llllllllllllIlllIllIIIIlIIlIIlII) {
        return llllllllllllIlllIllIIIIlIIlIIlIl < llllllllllllIlllIllIIIIlIIlIIlII;
    }
    
    private static String lIIIlIIIlllIIIIl(final String llllllllllllIlllIllIIIIlIIllllII, final String llllllllllllIlllIllIIIIlIIllllIl) {
        try {
            final SecretKeySpec llllllllllllIlllIllIIIIlIlIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIIIlIIllllIl.getBytes(StandardCharsets.UTF_8)), GuiShareToLan.llIIIlIIIlllIl[17]), "DES");
            final Cipher llllllllllllIlllIllIIIIlIlIIIIII = Cipher.getInstance("DES");
            llllllllllllIlllIllIIIIlIlIIIIII.init(GuiShareToLan.llIIIlIIIlllIl[2], llllllllllllIlllIllIIIIlIlIIIIIl);
            return new String(llllllllllllIlllIllIIIIlIlIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIIIlIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIIIIlIIllllll) {
            llllllllllllIlllIllIIIIlIIllllll.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIIlIIIlllIllll();
        lIIIlIIIlllIlIlI();
    }
    
    private static boolean lIIIlIIIllllIIIl(final int llllllllllllIlllIllIIIIlIIlIlIIl, final int llllllllllllIlllIllIIIIlIIlIlIII) {
        return llllllllllllIlllIllIIIIlIIlIlIIl == llllllllllllIlllIllIIIIlIIlIlIII;
    }
    
    @Override
    public void drawScreen(final int llllllllllllIlllIllIIIIlIllIIlII, final int llllllllllllIlllIllIIIIlIlIlllll, final float llllllllllllIlllIllIIIIlIlIllllI) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, I18n.format(GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[29]], new Object[GuiShareToLan.llIIIlIIIlllIl[0]]), this.width / GuiShareToLan.llIIIlIIIlllIl[2], GuiShareToLan.llIIIlIIIlllIl[30], GuiShareToLan.llIIIlIIIlllIl[31]);
        this.drawCenteredString(this.fontRendererObj, I18n.format(GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[32]], new Object[GuiShareToLan.llIIIlIIIlllIl[0]]), this.width / GuiShareToLan.llIIIlIIIlllIl[2], GuiShareToLan.llIIIlIIIlllIl[33], GuiShareToLan.llIIIlIIIlllIl[31]);
        super.drawScreen(llllllllllllIlllIllIIIIlIllIIlII, llllllllllllIlllIllIIIIlIlIlllll, llllllllllllIlllIllIIIIlIlIllllI);
    }
    
    private static String lIIIlIIIlllIIIll(String llllllllllllIlllIllIIIIlIlIIlllI, final String llllllllllllIlllIllIIIIlIlIIllIl) {
        llllllllllllIlllIllIIIIlIlIIlllI = (byte)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIllIIIIlIlIIlllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIllIIIIlIlIlIIIl = new StringBuilder();
        final char[] llllllllllllIlllIllIIIIlIlIlIIII = llllllllllllIlllIllIIIIlIlIIllIl.toCharArray();
        int llllllllllllIlllIllIIIIlIlIIllll = GuiShareToLan.llIIIlIIIlllIl[0];
        final byte llllllllllllIlllIllIIIIlIlIIlIIl = (Object)((String)llllllllllllIlllIllIIIIlIlIIlllI).toCharArray();
        final long llllllllllllIlllIllIIIIlIlIIlIII = llllllllllllIlllIllIIIIlIlIIlIIl.length;
        int llllllllllllIlllIllIIIIlIlIIIlll = GuiShareToLan.llIIIlIIIlllIl[0];
        while (lIIIlIIIllllIIll(llllllllllllIlllIllIIIIlIlIIIlll, (int)llllllllllllIlllIllIIIIlIlIIlIII)) {
            final char llllllllllllIlllIllIIIIlIlIlIlII = llllllllllllIlllIllIIIIlIlIIlIIl[llllllllllllIlllIllIIIIlIlIIIlll];
            llllllllllllIlllIllIIIIlIlIlIIIl.append((char)(llllllllllllIlllIllIIIIlIlIlIlII ^ llllllllllllIlllIllIIIIlIlIlIIII[llllllllllllIlllIllIIIIlIlIIllll % llllllllllllIlllIllIIIIlIlIlIIII.length]));
            "".length();
            ++llllllllllllIlllIllIIIIlIlIIllll;
            ++llllllllllllIlllIllIIIIlIlIIIlll;
            "".length();
            if (((0xD7 ^ 0x9B ^ " ".length()) & (0xDC ^ 0x8D ^ (0x61 ^ 0x7D) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIllIIIIlIlIlIIIl);
    }
    
    private static String lIIIlIIIlllIIIlI(final String llllllllllllIlllIllIIIIlIIllIIIl, final String llllllllllllIlllIllIIIIlIIlIlllI) {
        try {
            final SecretKeySpec llllllllllllIlllIllIIIIlIIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIIIlIIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIllIIIIlIIllIIll = Cipher.getInstance("Blowfish");
            llllllllllllIlllIllIIIIlIIllIIll.init(GuiShareToLan.llIIIlIIIlllIl[2], llllllllllllIlllIllIIIIlIIllIlII);
            return new String(llllllllllllIlllIllIIIIlIIllIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIIIlIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIIIIlIIllIIlI) {
            llllllllllllIlllIllIIIIlIIllIIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void initGui() {
        this.buttonList.clear();
        this.buttonList.add(new GuiButton(GuiShareToLan.llIIIlIIIlllIl[1], this.width / GuiShareToLan.llIIIlIIIlllIl[2] - GuiShareToLan.llIIIlIIIlllIl[3], this.height - GuiShareToLan.llIIIlIIIlllIl[4], GuiShareToLan.llIIIlIIIlllIl[5], GuiShareToLan.llIIIlIIIlllIl[6], I18n.format(GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[7]], new Object[GuiShareToLan.llIIIlIIIlllIl[0]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiShareToLan.llIIIlIIIlllIl[8], this.width / GuiShareToLan.llIIIlIIIlllIl[2] + GuiShareToLan.llIIIlIIIlllIl[9], this.height - GuiShareToLan.llIIIlIIIlllIl[4], GuiShareToLan.llIIIlIIIlllIl[5], GuiShareToLan.llIIIlIIIlllIl[6], I18n.format(GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[2]], new Object[GuiShareToLan.llIIIlIIIlllIl[0]])));
        "".length();
        final List<GuiButton> buttonList = this.buttonList;
        final GuiButton field_146597_g = new GuiButton(GuiShareToLan.llIIIlIIIlllIl[10], this.width / GuiShareToLan.llIIIlIIIlllIl[2] - GuiShareToLan.llIIIlIIIlllIl[3], GuiShareToLan.llIIIlIIIlllIl[11], GuiShareToLan.llIIIlIIIlllIl[5], GuiShareToLan.llIIIlIIIlllIl[6], I18n.format(GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[12]], new Object[GuiShareToLan.llIIIlIIIlllIl[0]]));
        this.field_146597_g = field_146597_g;
        buttonList.add(field_146597_g);
        "".length();
        final List<GuiButton> buttonList2 = this.buttonList;
        final GuiButton field_146596_f = new GuiButton(GuiShareToLan.llIIIlIIIlllIl[13], this.width / GuiShareToLan.llIIIlIIIlllIl[2] + GuiShareToLan.llIIIlIIIlllIl[9], GuiShareToLan.llIIIlIIIlllIl[11], GuiShareToLan.llIIIlIIIlllIl[5], GuiShareToLan.llIIIlIIIlllIl[6], I18n.format(GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[14]], new Object[GuiShareToLan.llIIIlIIIlllIl[0]]));
        this.field_146596_f = field_146596_f;
        buttonList2.add(field_146596_f);
        "".length();
        this.func_146595_g();
    }
    
    private static void lIIIlIIIlllIllll() {
        (llIIIlIIIlllIl = new int[35])[0] = ((0xE ^ 0x14 ^ (0x27 ^ 0x79)) & (0x0 ^ 0x61 ^ (0xA0 ^ 0x85) ^ -" ".length()));
        GuiShareToLan.llIIIlIIIlllIl[1] = (0xE6 ^ 0xBD ^ (0x69 ^ 0x57));
        GuiShareToLan.llIIIlIIIlllIl[2] = "  ".length();
        GuiShareToLan.llIIIlIIIlllIl[3] = 82 + 13 - 9 + 69;
        GuiShareToLan.llIIIlIIIlllIl[4] = (0x67 ^ 0x7B);
        GuiShareToLan.llIIIlIIIlllIl[5] = 101 + 76 - 124 + 97;
        GuiShareToLan.llIIIlIIIlllIl[6] = (0x5A ^ 0x3E ^ (0x3D ^ 0x4D));
        GuiShareToLan.llIIIlIIIlllIl[7] = " ".length();
        GuiShareToLan.llIIIlIIIlllIl[8] = (0x26 ^ 0x4C ^ (0x2B ^ 0x27));
        GuiShareToLan.llIIIlIIIlllIl[9] = (0xB ^ 0x1 ^ (0x6E ^ 0x61));
        GuiShareToLan.llIIIlIIIlllIl[10] = (0x5A ^ 0x32);
        GuiShareToLan.llIIIlIIIlllIl[11] = (219 + 234 - 260 + 55 ^ 38 + 7 + 3 + 108);
        GuiShareToLan.llIIIlIIIlllIl[12] = "   ".length();
        GuiShareToLan.llIIIlIIIlllIl[13] = (0x1C ^ 0x7B);
        GuiShareToLan.llIIIlIIIlllIl[14] = (0x5D ^ 0x59);
        GuiShareToLan.llIIIlIIIlllIl[15] = (0x17 ^ 0x40 ^ (0x25 ^ 0x74));
        GuiShareToLan.llIIIlIIIlllIl[16] = (0xAD ^ 0xAA);
        GuiShareToLan.llIIIlIIIlllIl[17] = (0x3 ^ 0x61 ^ (0x1A ^ 0x70));
        GuiShareToLan.llIIIlIIIlllIl[18] = (0x91 ^ 0x98);
        GuiShareToLan.llIIIlIIIlllIl[19] = (0x2B ^ 0x7C ^ (0xF6 ^ 0xAB));
        GuiShareToLan.llIIIlIIIlllIl[20] = (47 + 71 - 54 + 114 ^ 14 + 183 - 86 + 74);
        GuiShareToLan.llIIIlIIIlllIl[21] = (0x96 ^ 0x9A);
        GuiShareToLan.llIIIlIIIlllIl[22] = (0xA9 ^ 0x90 ^ (0x32 ^ 0x6));
        GuiShareToLan.llIIIlIIIlllIl[23] = (0x3 ^ 0x5A ^ (0xA ^ 0x5D));
        GuiShareToLan.llIIIlIIIlllIl[24] = (0x67 ^ 0x68);
        GuiShareToLan.llIIIlIIIlllIl[25] = (0x8C ^ 0x9C);
        GuiShareToLan.llIIIlIIIlllIl[26] = (12 + 116 - 3 + 14 ^ 14 + 61 - 45 + 124);
        GuiShareToLan.llIIIlIIIlllIl[27] = (0x70 ^ 0x2 ^ (0x4A ^ 0x2A));
        GuiShareToLan.llIIIlIIIlllIl[28] = (7 + 80 - 26 + 110 ^ 119 + 89 - 71 + 47);
        GuiShareToLan.llIIIlIIIlllIl[29] = (0x3E ^ 0x2B);
        GuiShareToLan.llIIIlIIIlllIl[30] = (0x10 ^ 0x22);
        GuiShareToLan.llIIIlIIIlllIl[31] = (-1 & 0xFFFFFF);
        GuiShareToLan.llIIIlIIIlllIl[32] = (0x2D ^ 0x7F ^ (0xC3 ^ 0x87));
        GuiShareToLan.llIIIlIIIlllIl[33] = (0xF3 ^ 0xA1);
        GuiShareToLan.llIIIlIIIlllIl[34] = (0x5E ^ 0x49);
    }
    
    @Override
    protected void actionPerformed(final GuiButton llllllllllllIlllIllIIIIlIlllIIIl) throws IOException {
        if (lIIIlIIIllllIIIl(llllllllllllIlllIllIIIIlIlllIIIl.id, GuiShareToLan.llIIIlIIIlllIl[8])) {
            this.mc.displayGuiScreen(this.field_146598_a);
            "".length();
            if (((0x31 ^ 0x1F ^ (0x7D ^ 0x1F)) & (0x32 ^ 0x70 ^ (0x10 ^ 0x1E) ^ -" ".length())) >= "  ".length()) {
                return;
            }
        }
        else if (lIIIlIIIllllIIIl(llllllllllllIlllIllIIIIlIlllIIIl.id, GuiShareToLan.llIIIlIIIlllIl[10])) {
            if (lIIIlIIIllllIIII(this.field_146599_h.equals(GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[21]]) ? 1 : 0)) {
                this.field_146599_h = GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[22]];
                "".length();
                if (((0x86 ^ 0xB5 ^ (0x94 ^ 0xB3)) & (0x8F ^ 0x84 ^ (0x4D ^ 0x52) ^ -" ".length())) > (19 + 49 - 47 + 128 ^ 132 + 26 - 135 + 122)) {
                    return;
                }
            }
            else if (lIIIlIIIllllIIII(this.field_146599_h.equals(GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[23]]) ? 1 : 0)) {
                this.field_146599_h = GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[24]];
                "".length();
                if (-(0x80 ^ 0x99 ^ (0xDC ^ 0xC1)) > 0) {
                    return;
                }
            }
            else if (lIIIlIIIllllIIII(this.field_146599_h.equals(GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[25]]) ? 1 : 0)) {
                this.field_146599_h = GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[26]];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.field_146599_h = GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[27]];
            }
            this.func_146595_g();
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else if (lIIIlIIIllllIIIl(llllllllllllIlllIllIIIIlIlllIIIl.id, GuiShareToLan.llIIIlIIIlllIl[13])) {
            int field_146600_i;
            if (lIIIlIIIllllIIII(this.field_146600_i ? 1 : 0)) {
                field_146600_i = GuiShareToLan.llIIIlIIIlllIl[0];
                "".length();
                if ("   ".length() != "   ".length()) {
                    return;
                }
            }
            else {
                field_146600_i = GuiShareToLan.llIIIlIIIlllIl[7];
            }
            this.field_146600_i = (field_146600_i != 0);
            this.func_146595_g();
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else if (lIIIlIIIllllIIIl(llllllllllllIlllIllIIIIlIlllIIIl.id, GuiShareToLan.llIIIlIIIlllIl[1])) {
            this.mc.displayGuiScreen(null);
            final String llllllllllllIlllIllIIIIlIlllIIII = this.mc.getIntegratedServer().shareToLAN(WorldSettings.GameType.getByName(this.field_146599_h), this.field_146600_i);
            IChatComponent llllllllllllIlllIllIIIIlIllIlllI = null;
            if (lIIIlIIIllllIIlI(llllllllllllIlllIllIIIIlIlllIIII)) {
                final String lllllllllllllIlIIlIlllIIlIIIIIlI = GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[28]];
                final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[GuiShareToLan.llIIIlIIIlllIl[7]];
                lllllllllllllIlIIlIlllIIlIIIIIIl[GuiShareToLan.llIIIlIIIlllIl[0]] = llllllllllllIlllIllIIIIlIlllIIII;
                final IChatComponent llllllllllllIlllIllIIIIlIllIllll = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl);
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
            }
            else {
                llllllllllllIlllIllIIIIlIllIlllI = new ChatComponentText(GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[6]]);
            }
            this.mc.ingameGUI.getChatGUI().printChatMessage(llllllllllllIlllIllIIIIlIllIlllI);
        }
    }
    
    private static boolean lIIIlIIIllllIIlI(final Object llllllllllllIlllIllIIIIlIIlIIIlI) {
        return llllllllllllIlllIllIIIIlIIlIIIlI != null;
    }
    
    private void func_146595_g() {
        this.field_146597_g.displayString = String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[9]], new Object[GuiShareToLan.llIIIlIIIlllIl[0]]))).append(GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[15]]).append(I18n.format(String.valueOf(new StringBuilder(GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[16]]).append(this.field_146599_h)), new Object[GuiShareToLan.llIIIlIIIlllIl[0]])));
        this.field_146596_f.displayString = String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[17]], new Object[GuiShareToLan.llIIIlIIIlllIl[0]]))).append(GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[18]]));
        if (lIIIlIIIllllIIII(this.field_146600_i ? 1 : 0)) {
            this.field_146596_f.displayString = String.valueOf(new StringBuilder(String.valueOf(this.field_146596_f.displayString)).append(I18n.format(GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[19]], new Object[GuiShareToLan.llIIIlIIIlllIl[0]])));
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else {
            this.field_146596_f.displayString = String.valueOf(new StringBuilder(String.valueOf(this.field_146596_f.displayString)).append(I18n.format(GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[20]], new Object[GuiShareToLan.llIIIlIIIlllIl[0]])));
        }
    }
    
    public GuiShareToLan(final GuiScreen llllllllllllIlllIllIIIIlIlllllIl) {
        this.field_146599_h = GuiShareToLan.llIIIlIIIllIlI[GuiShareToLan.llIIIlIIIlllIl[0]];
        this.field_146598_a = llllllllllllIlllIllIIIIlIlllllIl;
    }
}
