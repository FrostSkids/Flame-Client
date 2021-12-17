// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import org.apache.logging.log4j.LogManager;
import net.minecraft.client.renderer.GlStateManager;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.resources.I18n;
import org.apache.logging.log4j.Logger;
import net.minecraft.util.ResourceLocation;

public class GuiScreenDemo extends GuiScreen
{
    private static final /* synthetic */ String[] lllIlllIIlIIll;
    private static final /* synthetic */ int[] lllIlllIlIllII;
    private static final /* synthetic */ ResourceLocation field_146348_f;
    private static final /* synthetic */ Logger logger;
    
    @Override
    public void drawScreen(final int llllllllllllIlIllIIIIIlllIIllIII, final int llllllllllllIlIllIIIIIlllIIlIlll, final float llllllllllllIlIllIIIIIlllIIlIllI) {
        this.drawDefaultBackground();
        final int llllllllllllIlIllIIIIIlllIIlllII = (this.width - GuiScreenDemo.lllIlllIlIllII[13]) / GuiScreenDemo.lllIlllIlIllII[3] + GuiScreenDemo.lllIlllIlIllII[15];
        int llllllllllllIlIllIIIIIlllIIllIll = (this.height - GuiScreenDemo.lllIlllIlIllII[14]) / GuiScreenDemo.lllIlllIlIllII[3] + GuiScreenDemo.lllIlllIlIllII[16];
        this.fontRendererObj.drawString(I18n.format(GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[16]], new Object[GuiScreenDemo.lllIlllIlIllII[0]]), llllllllllllIlIllIIIIIlllIIlllII, llllllllllllIlIllIIIIIlllIIllIll, GuiScreenDemo.lllIlllIlIllII[17]);
        "".length();
        llllllllllllIlIllIIIIIlllIIllIll += 12;
        final GameSettings llllllllllllIlIllIIIIIlllIIllIlI = this.mc.gameSettings;
        final FontRenderer fontRendererObj = this.fontRendererObj;
        final String llllllllllllIlIllIlIIIIIllllIIll = GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[18]];
        final Object[] llllllllllllIlIllIlIIIIIllllIIII = new Object[GuiScreenDemo.lllIlllIlIllII[9]];
        llllllllllllIlIllIlIIIIIllllIIII[GuiScreenDemo.lllIlllIlIllII[0]] = GameSettings.getKeyDisplayString(llllllllllllIlIllIIIIIlllIIllIlI.keyBindForward.getKeyCode());
        llllllllllllIlIllIlIIIIIllllIIII[GuiScreenDemo.lllIlllIlIllII[2]] = GameSettings.getKeyDisplayString(llllllllllllIlIllIIIIIlllIIllIlI.keyBindLeft.getKeyCode());
        llllllllllllIlIllIlIIIIIllllIIII[GuiScreenDemo.lllIlllIlIllII[3]] = GameSettings.getKeyDisplayString(llllllllllllIlIllIIIIIlllIIllIlI.keyBindBack.getKeyCode());
        llllllllllllIlIllIlIIIIIllllIIII[GuiScreenDemo.lllIlllIlIllII[8]] = GameSettings.getKeyDisplayString(llllllllllllIlIllIIIIIlllIIllIlI.keyBindRight.getKeyCode());
        fontRendererObj.drawString(I18n.format(llllllllllllIlIllIlIIIIIllllIIll, llllllllllllIlIllIlIIIIIllllIIII), llllllllllllIlIllIIIIIlllIIlllII, llllllllllllIlIllIIIIIlllIIllIll, GuiScreenDemo.lllIlllIlIllII[19]);
        "".length();
        this.fontRendererObj.drawString(I18n.format(GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[15]], new Object[GuiScreenDemo.lllIlllIlIllII[0]]), llllllllllllIlIllIIIIIlllIIlllII, llllllllllllIlIllIIIIIlllIIllIll + GuiScreenDemo.lllIlllIlIllII[20], GuiScreenDemo.lllIlllIlIllII[19]);
        "".length();
        final FontRenderer fontRendererObj2 = this.fontRendererObj;
        final String llllllllllllIlIllIlIIIIIllllIIll2 = GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[21]];
        final Object[] llllllllllllIlIllIlIIIIIllllIIII2 = new Object[GuiScreenDemo.lllIlllIlIllII[2]];
        llllllllllllIlIllIlIIIIIllllIIII2[GuiScreenDemo.lllIlllIlIllII[0]] = GameSettings.getKeyDisplayString(llllllllllllIlIllIIIIIlllIIllIlI.keyBindJump.getKeyCode());
        fontRendererObj2.drawString(I18n.format(llllllllllllIlIllIlIIIIIllllIIll2, llllllllllllIlIllIlIIIIIllllIIII2), llllllllllllIlIllIIIIIlllIIlllII, llllllllllllIlIllIIIIIlllIIllIll + GuiScreenDemo.lllIlllIlIllII[22], GuiScreenDemo.lllIlllIlIllII[19]);
        "".length();
        final FontRenderer fontRendererObj3 = this.fontRendererObj;
        final String llllllllllllIlIllIlIIIIIllllIIll3 = GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[20]];
        final Object[] llllllllllllIlIllIlIIIIIllllIIII3 = new Object[GuiScreenDemo.lllIlllIlIllII[2]];
        llllllllllllIlIllIlIIIIIllllIIII3[GuiScreenDemo.lllIlllIlIllII[0]] = GameSettings.getKeyDisplayString(llllllllllllIlIllIIIIIlllIIllIlI.keyBindInventory.getKeyCode());
        fontRendererObj3.drawString(I18n.format(llllllllllllIlIllIlIIIIIllllIIll3, llllllllllllIlIllIlIIIIIllllIIII3), llllllllllllIlIllIIIIIlllIIlllII, llllllllllllIlIllIIIIIlllIIllIll + GuiScreenDemo.lllIlllIlIllII[23], GuiScreenDemo.lllIlllIlIllII[19]);
        "".length();
        this.fontRendererObj.drawSplitString(I18n.format(GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[24]], new Object[GuiScreenDemo.lllIlllIlIllII[0]]), llllllllllllIlIllIIIIIlllIIlllII, llllllllllllIlIllIIIIIlllIIllIll + GuiScreenDemo.lllIlllIlIllII[25], GuiScreenDemo.lllIlllIlIllII[26], GuiScreenDemo.lllIlllIlIllII[17]);
        super.drawScreen(llllllllllllIlIllIIIIIlllIIllIII, llllllllllllIlIllIIIIIlllIIlIlll, llllllllllllIlIllIIIIIlllIIlIllI);
    }
    
    private static String lIlIIlIllIIlIlII(final String llllllllllllIlIllIIIIIlllIIIlIll, final String llllllllllllIlIllIIIIIlllIIIlIII) {
        try {
            final SecretKeySpec llllllllllllIlIllIIIIIlllIIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIIIlllIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIIIIIlllIIIllIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIIIIIlllIIIllIl.init(GuiScreenDemo.lllIlllIlIllII[3], llllllllllllIlIllIIIIIlllIIIlllI);
            return new String(llllllllllllIlIllIIIIIlllIIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIIIlllIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIIIIlllIIIllII) {
            llllllllllllIlIllIIIIIlllIIIllII.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIIlIllIIlIIlI(final String llllllllllllIlIllIIIIIllIllllllI, final String llllllllllllIlIllIIIIIllIlllllIl) {
        try {
            final SecretKeySpec llllllllllllIlIllIIIIIlllIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIIIllIlllllIl.getBytes(StandardCharsets.UTF_8)), GuiScreenDemo.lllIlllIlIllII[16]), "DES");
            final Cipher llllllllllllIlIllIIIIIlllIIIIIII = Cipher.getInstance("DES");
            llllllllllllIlIllIIIIIlllIIIIIII.init(GuiScreenDemo.lllIlllIlIllII[3], llllllllllllIlIllIIIIIlllIIIIIIl);
            return new String(llllllllllllIlIllIIIIIlllIIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIIIllIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIIIIllIlllllll) {
            llllllllllllIlIllIIIIIllIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIlIllIllllIl(final int llllllllllllIlIllIIIIIllIlIllllI, final int llllllllllllIlIllIIIIIllIlIlllIl) {
        return llllllllllllIlIllIIIIIllIlIllllI < llllllllllllIlIllIIIIIllIlIlllIl;
    }
    
    private static void lIlIIlIllIllllII() {
        (lllIlllIlIllII = new int[28])[0] = ((0x78 ^ 0x3D) & ~(0xE3 ^ 0xA6));
        GuiScreenDemo.lllIlllIlIllII[1] = -(0x5D ^ 0x36 ^ (0xBE ^ 0xC5));
        GuiScreenDemo.lllIlllIlIllII[2] = " ".length();
        GuiScreenDemo.lllIlllIlIllII[3] = "  ".length();
        GuiScreenDemo.lllIlllIlIllII[4] = (0xB7 ^ 0xC3);
        GuiScreenDemo.lllIlllIlIllII[5] = (0x40 ^ 0x7E);
        GuiScreenDemo.lllIlllIlIllII[6] = (24 + 73 - 57 + 177 ^ 139 + 151 - 140 + 21);
        GuiScreenDemo.lllIlllIlIllII[7] = (0xD9 ^ 0xBE ^ (0xFB ^ 0x88));
        GuiScreenDemo.lllIlllIlIllII[8] = "   ".length();
        GuiScreenDemo.lllIlllIlIllII[9] = (0x7E ^ 0x7A);
        GuiScreenDemo.lllIlllIlIllII[10] = (0x6F ^ 0x6A ^ ((0xB2 ^ 0xA7) & ~(0x17 ^ 0x2)));
        GuiScreenDemo.lllIlllIlIllII[11] = (47 + 47 + 83 + 19 ^ 172 + 182 - 314 + 154);
        GuiScreenDemo.lllIlllIlIllII[12] = (0x6B ^ 0x6C);
        GuiScreenDemo.lllIlllIlIllII[13] = 121 + 142 - 25 + 3 + (82 + 146 - 77 + 15) - (0xFFFFBFFF & 0x417D) + (52 + 123 - 18 + 65);
        GuiScreenDemo.lllIlllIlIllII[14] = 25 + 39 + 41 + 28 + (0x3A ^ 0x59) - (84 + 90 - 69 + 91) + (100 + 74 - 151 + 107);
        GuiScreenDemo.lllIlllIlIllII[15] = (83 + 96 - 154 + 113 ^ 94 + 57 - 74 + 51);
        GuiScreenDemo.lllIlllIlIllII[16] = (0x92 ^ 0x86 ^ (0x43 ^ 0x5F));
        GuiScreenDemo.lllIlllIlIllII[17] = (0xFFFF9F7F & 0x1F7F9F);
        GuiScreenDemo.lllIlllIlIllII[18] = (143 + 25 - 52 + 29 ^ 36 + 144 - 74 + 46);
        GuiScreenDemo.lllIlllIlIllII[19] = (0xFFFFCF6F & 0x4F7FDF);
        GuiScreenDemo.lllIlllIlIllII[20] = (0xCA ^ 0xB1 ^ (0x25 ^ 0x52));
        GuiScreenDemo.lllIlllIlIllII[21] = (0x5B ^ 0x2F ^ 40 + 97 - 36 + 26);
        GuiScreenDemo.lllIlllIlIllII[22] = (0x3E ^ 0x26);
        GuiScreenDemo.lllIlllIlIllII[23] = (44 + 164 - 129 + 87 ^ 3 + 37 - 29 + 119);
        GuiScreenDemo.lllIlllIlIllII[24] = (14 + 7 + 94 + 33 ^ 136 + 41 - 26 + 2);
        GuiScreenDemo.lllIlllIlIllII[25] = (0xE1 ^ 0xAC ^ (0x8 ^ 0x1));
        GuiScreenDemo.lllIlllIlIllII[26] = 130 + 150 - 158 + 46 + (0xEE ^ 0x8A) - (0x93 ^ 0xA7) + "  ".length();
        GuiScreenDemo.lllIlllIlIllII[27] = (0xA ^ 0x4);
    }
    
    @Override
    protected void actionPerformed(final GuiButton llllllllllllIlIllIIIIIlllIlllIll) throws IOException {
        switch (llllllllllllIlIllIIIIIlllIlllIll.id) {
            case 1: {
                llllllllllllIlIllIIIIIlllIlllIll.enabled = (GuiScreenDemo.lllIlllIlIllII[0] != 0);
                try {
                    final Class<?> llllllllllllIlIllIIIIIlllIlllIlI = Class.forName(GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[8]]);
                    final Object llllllllllllIlIllIIIIIlllIlllIIl = llllllllllllIlIllIIIIIlllIlllIlI.getMethod(GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[9]], (Class<?>[])new Class[GuiScreenDemo.lllIlllIlIllII[0]]).invoke(null, new Object[GuiScreenDemo.lllIlllIlIllII[0]]);
                    final Class<?> clazz = llllllllllllIlIllIIIIIlllIlllIlI;
                    final String name = GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[10]];
                    final Class[] parameterTypes = new Class[GuiScreenDemo.lllIlllIlIllII[2]];
                    parameterTypes[GuiScreenDemo.lllIlllIlIllII[0]] = URI.class;
                    final Method method = clazz.getMethod(name, (Class[])parameterTypes);
                    final Object obj = llllllllllllIlIllIIIIIlllIlllIIl;
                    final Object[] args = new Object[GuiScreenDemo.lllIlllIlIllII[2]];
                    args[GuiScreenDemo.lllIlllIlIllII[0]] = new URI(GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[11]]);
                    method.invoke(obj, args);
                    "".length();
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                    break;
                }
                catch (Throwable llllllllllllIlIllIIIIIlllIlllIII) {
                    GuiScreenDemo.logger.error(GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[12]], llllllllllllIlIllIIIIIlllIlllIII);
                    "".length();
                    if (-" ".length() == ((0x5A ^ 0x73) & ~(0xBB ^ 0x92))) {
                        return;
                    }
                    break;
                }
            }
            case 2: {
                this.mc.displayGuiScreen(null);
                this.mc.setIngameFocus();
                break;
            }
        }
    }
    
    @Override
    public void drawDefaultBackground() {
        super.drawDefaultBackground();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(GuiScreenDemo.field_146348_f);
        final int llllllllllllIlIllIIIIIlllIlIllII = (this.width - GuiScreenDemo.lllIlllIlIllII[13]) / GuiScreenDemo.lllIlllIlIllII[3];
        final int llllllllllllIlIllIIIIIlllIlIlIll = (this.height - GuiScreenDemo.lllIlllIlIllII[14]) / GuiScreenDemo.lllIlllIlIllII[3];
        this.drawTexturedModalRect(llllllllllllIlIllIIIIIlllIlIllII, llllllllllllIlIllIIIIIlllIlIlIll, GuiScreenDemo.lllIlllIlIllII[0], GuiScreenDemo.lllIlllIlIllII[0], GuiScreenDemo.lllIlllIlIllII[13], GuiScreenDemo.lllIlllIlIllII[14]);
    }
    
    private static String lIlIIlIllIIlIIll(String llllllllllllIlIllIIIIIllIllIlIIl, final String llllllllllllIlIllIIIIIllIllIllIl) {
        llllllllllllIlIllIIIIIllIllIlIIl = (short)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllIIIIIllIllIlIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIIIIIllIllIllII = new StringBuilder();
        final char[] llllllllllllIlIllIIIIIllIllIlIll = llllllllllllIlIllIIIIIllIllIllIl.toCharArray();
        int llllllllllllIlIllIIIIIllIllIlIlI = GuiScreenDemo.lllIlllIlIllII[0];
        final double llllllllllllIlIllIIIIIllIllIIlII = (Object)((String)llllllllllllIlIllIIIIIllIllIlIIl).toCharArray();
        final long llllllllllllIlIllIIIIIllIllIIIll = llllllllllllIlIllIIIIIllIllIIlII.length;
        Exception llllllllllllIlIllIIIIIllIllIIIlI = (Exception)GuiScreenDemo.lllIlllIlIllII[0];
        while (lIlIIlIllIllllIl((int)llllllllllllIlIllIIIIIllIllIIIlI, (int)llllllllllllIlIllIIIIIllIllIIIll)) {
            final char llllllllllllIlIllIIIIIllIllIllll = llllllllllllIlIllIIIIIllIllIIlII[llllllllllllIlIllIIIIIllIllIIIlI];
            llllllllllllIlIllIIIIIllIllIllII.append((char)(llllllllllllIlIllIIIIIllIllIllll ^ llllllllllllIlIllIIIIIllIllIlIll[llllllllllllIlIllIIIIIllIllIlIlI % llllllllllllIlIllIIIIIllIllIlIll.length]));
            "".length();
            ++llllllllllllIlIllIIIIIllIllIlIlI;
            ++llllllllllllIlIllIIIIIllIllIIIlI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIIIIIllIllIllII);
    }
    
    static {
        lIlIIlIllIllllII();
        lIlIIlIllIIllIII();
        logger = LogManager.getLogger();
        field_146348_f = new ResourceLocation(GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[0]]);
    }
    
    private static void lIlIIlIllIIllIII() {
        (lllIlllIIlIIll = new String[GuiScreenDemo.lllIlllIlIllII[27]])[GuiScreenDemo.lllIlllIlIllII[0]] = lIlIIlIllIIlIIlI("s97wUue/BR5TjlmDr91d1YJhEB9MAm3b/XjuRkZMQJSu9LfqIEN/7A==", "rgUmG");
        GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[2]] = lIlIIlIllIIlIIll("LywYJV4jLBk6Xik8DA==", "KIuJp");
        GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[3]] = lIlIIlIllIIlIIll("Fy0ELVsbLQUyWx8pHScH", "sHiBu");
        GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[8]] = lIlIIlIllIIlIIll("HDIhDl4XJCNBNBMgPBsfBg==", "vSWop");
        GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[9]] = lIlIIlIllIIlIlII("0xYFEd+dkYFNNDvwfPuXHA==", "zUNML");
        GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[10]] = lIlIIlIllIIlIIlI("tBIIdcrlbI8=", "smnUO");
        GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[11]] = lIlIIlIllIIlIlII("2Gw7jPTgZSi2R0xBO8Vj4yFP8gJQUzfQswbBD+lryRmly5cRRKlj3DiUXznh7hOB", "NOWgE");
        GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[12]] = lIlIIlIllIIlIIll("CyszHyUmYzJTLjghKFMtISot", "HDFsA");
        GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[16]] = lIlIIlIllIIlIlII("XppDmQDPGVNbm9ST7LH0gQ==", "rnPQv");
        GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[18]] = lIlIIlIllIIlIIll("ETEgFl0dMSEJXRg7OxweEDo5KhsaJjk=", "uTMys");
        GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[15]] = lIlIIlIllIIlIlII("991yqTNEQ6v0hf+R7BLqJNeOUEBVPI39", "vwqOo");
        GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[21]] = lIlIIlIllIIlIIll("Aio4OlQOKjklVAw6OCU=", "fOUUz");
        GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[20]] = lIlIIlIllIIlIIlI("R0cXQJyHj2dxdEOl3F5DFiVy/WTJCwBE", "Ekanw");
        GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[24]] = lIlIIlIllIIlIIll("NDckPmk4NyUhaTYnJT0QIjM5ISI0", "PRIQG");
    }
    
    @Override
    public void updateScreen() {
        super.updateScreen();
    }
    
    @Override
    public void initGui() {
        this.buttonList.clear();
        final int llllllllllllIlIllIIIIIllllIIIIll = GuiScreenDemo.lllIlllIlIllII[1];
        this.buttonList.add(new GuiButton(GuiScreenDemo.lllIlllIlIllII[2], this.width / GuiScreenDemo.lllIlllIlIllII[3] - GuiScreenDemo.lllIlllIlIllII[4], this.height / GuiScreenDemo.lllIlllIlIllII[3] + GuiScreenDemo.lllIlllIlIllII[5] + llllllllllllIlIllIIIIIllllIIIIll, GuiScreenDemo.lllIlllIlIllII[6], GuiScreenDemo.lllIlllIlIllII[7], I18n.format(GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[2]], new Object[GuiScreenDemo.lllIlllIlIllII[0]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiScreenDemo.lllIlllIlIllII[3], this.width / GuiScreenDemo.lllIlllIlIllII[3] + GuiScreenDemo.lllIlllIlIllII[3], this.height / GuiScreenDemo.lllIlllIlIllII[3] + GuiScreenDemo.lllIlllIlIllII[5] + llllllllllllIlIllIIIIIllllIIIIll, GuiScreenDemo.lllIlllIlIllII[6], GuiScreenDemo.lllIlllIlIllII[7], I18n.format(GuiScreenDemo.lllIlllIIlIIll[GuiScreenDemo.lllIlllIlIllII[3]], new Object[GuiScreenDemo.lllIlllIlIllII[0]])));
        "".length();
    }
}
