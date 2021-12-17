// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import com.google.common.collect.Lists;
import net.minecraft.util.ChatComponentText;
import java.util.List;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.client.Minecraft;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class GuiUtilRenderComponents
{
    private static final /* synthetic */ int[] lllIllIlIIllII;
    private static final /* synthetic */ String[] lllIllIlIIlIll;
    
    private static String lIlIIlIIllIIllII(final String llllllllllllIlIllIIlIIIllIIllIIl, final String llllllllllllIlIllIIlIIIllIIllIII) {
        try {
            final SecretKeySpec llllllllllllIlIllIIlIIIllIIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIlIIIllIIllIII.getBytes(StandardCharsets.UTF_8)), GuiUtilRenderComponents.lllIllIlIIllII[9]), "DES");
            final Cipher llllllllllllIlIllIIlIIIllIIlllIl = Cipher.getInstance("DES");
            llllllllllllIlIllIIlIIIllIIlllIl.init(GuiUtilRenderComponents.lllIllIlIIllII[3], llllllllllllIlIllIIlIIIllIIllllI);
            return new String(llllllllllllIlIllIIlIIIllIIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIlIIIllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIlIIIllIIlllII) {
            llllllllllllIlIllIIlIIIllIIlllII.printStackTrace();
            return null;
        }
    }
    
    public static String func_178909_a(final String llllllllllllIlIllIIlIIlIIIIIllIl, final boolean llllllllllllIlIllIIlIIlIIIIIllII) {
        String textWithoutFormattingCodes;
        if (lIlIIlIIllIlIIIl(llllllllllllIlIllIIlIIlIIIIIllII ? 1 : 0) && lIlIIlIIllIlIIIl(Minecraft.getMinecraft().gameSettings.chatColours ? 1 : 0)) {
            textWithoutFormattingCodes = EnumChatFormatting.getTextWithoutFormattingCodes(llllllllllllIlIllIIlIIlIIIIIllIl);
            "".length();
            if (-" ".length() >= ((0x65 ^ 0x20) & ~(0xD ^ 0x48))) {
                return null;
            }
        }
        else {
            textWithoutFormattingCodes = llllllllllllIlIllIIlIIlIIIIIllIl;
        }
        return textWithoutFormattingCodes;
    }
    
    private static void lIlIIlIIllIIllll() {
        (lllIllIlIIlIll = new String[GuiUtilRenderComponents.lllIllIlIIllII[8]])[GuiUtilRenderComponents.lllIllIlIIllII[0]] = lIlIIlIIllIIllII("DI2EqVst9Oo=", "UoTDx");
        GuiUtilRenderComponents.lllIllIlIIlIll[GuiUtilRenderComponents.lllIllIlIIllII[1]] = lIlIIlIIllIIllIl("Sw==", "AreVu");
        GuiUtilRenderComponents.lllIllIlIIlIll[GuiUtilRenderComponents.lllIllIlIIllII[3]] = lIlIIlIIllIIllIl("QA==", "JDlBJ");
        GuiUtilRenderComponents.lllIllIlIIlIll[GuiUtilRenderComponents.lllIllIlIIllII[4]] = lIlIIlIIllIIlllI("6eTYytPGspE=", "kYIUK");
        GuiUtilRenderComponents.lllIllIlIIlIll[GuiUtilRenderComponents.lllIllIlIIllII[5]] = lIlIIlIIllIIllII("kp4f/ATnQP0=", "kBLvY");
        GuiUtilRenderComponents.lllIllIlIIlIll[GuiUtilRenderComponents.lllIllIlIIllII[6]] = lIlIIlIIllIIllIl("", "NxDhA");
        GuiUtilRenderComponents.lllIllIlIIlIll[GuiUtilRenderComponents.lllIllIlIIllII[7]] = lIlIIlIIllIIllII("MdctptZDEmo=", "exAuH");
    }
    
    private static boolean lIlIIlIIllIllIIl(final int llllllllllllIlIllIIlIIIllIIlIIll, final int llllllllllllIlIllIIlIIIllIIlIIlI) {
        return llllllllllllIlIllIIlIIIllIIlIIll >= llllllllllllIlIllIIlIIIllIIlIIlI;
    }
    
    private static boolean lIlIIlIIllIllIII(final int llllllllllllIlIllIIlIIIllIIIlIll, final int llllllllllllIlIllIIlIIIllIIIlIlI) {
        return llllllllllllIlIllIIlIIIllIIIlIll <= llllllllllllIlIllIIlIIIllIIIlIlI;
    }
    
    private static boolean lIlIIlIIllIlIllI(final int llllllllllllIlIllIIlIIIlIlllllII) {
        return llllllllllllIlIllIIlIIIlIlllllII > 0;
    }
    
    private static boolean lIlIIlIIllIlIlIl(final Object llllllllllllIlIllIIlIIIllIIIIlII) {
        return llllllllllllIlIllIIlIIIllIIIIlII != null;
    }
    
    static {
        lIlIIlIIllIlIIII();
        lIlIIlIIllIIllll();
    }
    
    private static void lIlIIlIIllIlIIII() {
        (lllIllIlIIllII = new int[10])[0] = ((0x7C ^ 0x61) & ~(0x71 ^ 0x6C));
        GuiUtilRenderComponents.lllIllIlIIllII[1] = " ".length();
        GuiUtilRenderComponents.lllIllIlIIllII[2] = (0x2F ^ 0x25);
        GuiUtilRenderComponents.lllIllIlIIllII[3] = "  ".length();
        GuiUtilRenderComponents.lllIllIlIIllII[4] = "   ".length();
        GuiUtilRenderComponents.lllIllIlIIllII[5] = (0x73 ^ 0x77);
        GuiUtilRenderComponents.lllIllIlIIllII[6] = (0x0 ^ 0x5);
        GuiUtilRenderComponents.lllIllIlIIllII[7] = (0x4E ^ 0x48);
        GuiUtilRenderComponents.lllIllIlIIllII[8] = (0x7E ^ 0x79);
        GuiUtilRenderComponents.lllIllIlIIllII[9] = (0xB3 ^ 0x9B ^ (0x54 ^ 0x74));
    }
    
    private static String lIlIIlIIllIIllIl(String llllllllllllIlIllIIlIIIllIlIlIll, final String llllllllllllIlIllIIlIIIllIlIlIlI) {
        llllllllllllIlIllIIlIIIllIlIlIll = new String(Base64.getDecoder().decode(llllllllllllIlIllIIlIIIllIlIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIIlIIIllIlIlllI = new StringBuilder();
        final char[] llllllllllllIlIllIIlIIIllIlIllIl = llllllllllllIlIllIIlIIIllIlIlIlI.toCharArray();
        int llllllllllllIlIllIIlIIIllIlIllII = GuiUtilRenderComponents.lllIllIlIIllII[0];
        final char llllllllllllIlIllIIlIIIllIlIIllI = (Object)llllllllllllIlIllIIlIIIllIlIlIll.toCharArray();
        final Exception llllllllllllIlIllIIlIIIllIlIIlIl = (Exception)llllllllllllIlIllIIlIIIllIlIIllI.length;
        Exception llllllllllllIlIllIIlIIIllIlIIlII = (Exception)GuiUtilRenderComponents.lllIllIlIIllII[0];
        while (lIlIIlIIllIlIlII((int)llllllllllllIlIllIIlIIIllIlIIlII, (int)llllllllllllIlIllIIlIIIllIlIIlIl)) {
            final char llllllllllllIlIllIIlIIIllIllIIIl = llllllllllllIlIllIIlIIIllIlIIllI[llllllllllllIlIllIIlIIIllIlIIlII];
            llllllllllllIlIllIIlIIIllIlIlllI.append((char)(llllllllllllIlIllIIlIIIllIllIIIl ^ llllllllllllIlIllIIlIIIllIlIllIl[llllllllllllIlIllIIlIIIllIlIllII % llllllllllllIlIllIIlIIIllIlIllIl.length]));
            "".length();
            ++llllllllllllIlIllIIlIIIllIlIllII;
            ++llllllllllllIlIllIIlIIIllIlIIlII;
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIIlIIIllIlIlllI);
    }
    
    private static boolean lIlIIlIIllIlIlII(final int llllllllllllIlIllIIlIIIllIIIllll, final int llllllllllllIlIllIIlIIIllIIIlllI) {
        return llllllllllllIlIllIIlIIIllIIIllll < llllllllllllIlIllIIlIIIllIIIlllI;
    }
    
    private static boolean lIlIIlIIllIlIIlI(final int llllllllllllIlIllIIlIIIllIIIIIlI) {
        return llllllllllllIlIllIIlIIIllIIIIIlI != 0;
    }
    
    private static boolean lIlIIlIIllIlIlll(final int llllllllllllIlIllIIlIIIlIllllllI) {
        return llllllllllllIlIllIIlIIIlIllllllI >= 0;
    }
    
    private static String lIlIIlIIllIIlllI(final String llllllllllllIlIllIIlIIIlllIIIIII, final String llllllllllllIlIllIIlIIIllIllllIl) {
        try {
            final SecretKeySpec llllllllllllIlIllIIlIIIlllIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIlIIIllIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIIlIIIlllIIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIIlIIIlllIIIIlI.init(GuiUtilRenderComponents.lllIllIlIIllII[3], llllllllllllIlIllIIlIIIlllIIIIll);
            return new String(llllllllllllIlIllIIlIIIlllIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIlIIIlllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIlIIIlllIIIIIl) {
            llllllllllllIlIllIIlIIIlllIIIIIl.printStackTrace();
            return null;
        }
    }
    
    public static List<IChatComponent> func_178908_a(final IChatComponent llllllllllllIlIllIIlIIIlllllIlII, final int llllllllllllIlIllIIlIIIlllllIIll, final FontRenderer llllllllllllIlIllIIlIIIlllllIIlI, final boolean llllllllllllIlIllIIlIIIlllIllIIl, final boolean llllllllllllIlIllIIlIIIlllllIIII) {
        int llllllllllllIlIllIIlIIIllllIllll = GuiUtilRenderComponents.lllIllIlIIllII[0];
        IChatComponent llllllllllllIlIllIIlIIIllllIlllI = new ChatComponentText(GuiUtilRenderComponents.lllIllIlIIlIll[GuiUtilRenderComponents.lllIllIlIIllII[0]]);
        final List<IChatComponent> llllllllllllIlIllIIlIIIllllIllIl = (List<IChatComponent>)Lists.newArrayList();
        final List<IChatComponent> llllllllllllIlIllIIlIIIllllIllII = (List<IChatComponent>)Lists.newArrayList((Iterable)llllllllllllIlIllIIlIIIlllllIlII);
        int llllllllllllIlIllIIlIIIllllIlIll = GuiUtilRenderComponents.lllIllIlIIllII[0];
        "".length();
        if ("  ".length() < ((0x7 ^ 0x29) & ~(0xBD ^ 0x93))) {
            return null;
        }
        while (!lIlIIlIIllIllIIl(llllllllllllIlIllIIlIIIllllIlIll, llllllllllllIlIllIIlIIIllllIllII.size())) {
            final IChatComponent llllllllllllIlIllIIlIIIllllIlIlI = llllllllllllIlIllIIlIIIllllIllII.get(llllllllllllIlIllIIlIIIllllIlIll);
            String llllllllllllIlIllIIlIIIllllIlIIl = llllllllllllIlIllIIlIIIllllIlIlI.getUnformattedTextForChat();
            boolean llllllllllllIlIllIIlIIIllllIlIII = GuiUtilRenderComponents.lllIllIlIIllII[0] != 0;
            if (lIlIIlIIllIlIIlI(llllllllllllIlIllIIlIIIllllIlIIl.contains(GuiUtilRenderComponents.lllIllIlIIlIll[GuiUtilRenderComponents.lllIllIlIIllII[1]]) ? 1 : 0)) {
                final int llllllllllllIlIllIIlIIIllllIIlll = llllllllllllIlIllIIlIIIllllIlIIl.indexOf(GuiUtilRenderComponents.lllIllIlIIllII[2]);
                final String llllllllllllIlIllIIlIIIllllIIllI = llllllllllllIlIllIIlIIIllllIlIIl.substring(llllllllllllIlIllIIlIIIllllIIlll + GuiUtilRenderComponents.lllIllIlIIllII[1]);
                llllllllllllIlIllIIlIIIllllIlIIl = llllllllllllIlIllIIlIIIllllIlIIl.substring(GuiUtilRenderComponents.lllIllIlIIllII[0], llllllllllllIlIllIIlIIIllllIIlll + GuiUtilRenderComponents.lllIllIlIIllII[1]);
                final ChatComponentText llllllllllllIlIllIIlIIIllllIIlIl = new ChatComponentText(llllllllllllIlIllIIlIIIllllIIllI);
                llllllllllllIlIllIIlIIIllllIIlIl.setChatStyle(llllllllllllIlIllIIlIIIllllIlIlI.getChatStyle().createShallowCopy());
                "".length();
                llllllllllllIlIllIIlIIIllllIllII.add(llllllllllllIlIllIIlIIIllllIlIll + GuiUtilRenderComponents.lllIllIlIIllII[1], llllllllllllIlIllIIlIIIllllIIlIl);
                llllllllllllIlIllIIlIIIllllIlIII = (GuiUtilRenderComponents.lllIllIlIIllII[1] != 0);
            }
            final String llllllllllllIlIllIIlIIIllllIIlII = func_178909_a(String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlIllIIlIIIllllIlIlI.getChatStyle().getFormattingCode())).append(llllllllllllIlIllIIlIIIllllIlIIl)), llllllllllllIlIllIIlIIIlllllIIII);
            String substring;
            if (lIlIIlIIllIlIIlI(llllllllllllIlIllIIlIIIllllIIlII.endsWith(GuiUtilRenderComponents.lllIllIlIIlIll[GuiUtilRenderComponents.lllIllIlIIllII[3]]) ? 1 : 0)) {
                substring = llllllllllllIlIllIIlIIIllllIIlII.substring(GuiUtilRenderComponents.lllIllIlIIllII[0], llllllllllllIlIllIIlIIIllllIIlII.length() - GuiUtilRenderComponents.lllIllIlIIllII[1]);
                "".length();
                if (" ".length() >= (87 + 17 - 14 + 80 ^ 23 + 25 + 7 + 119)) {
                    return null;
                }
            }
            else {
                substring = llllllllllllIlIllIIlIIIllllIIlII;
            }
            final String llllllllllllIlIllIIlIIIllllIIIll = substring;
            int llllllllllllIlIllIIlIIIllllIIIlI = llllllllllllIlIllIIlIIIlllllIIlI.getStringWidth(llllllllllllIlIllIIlIIIllllIIIll);
            ChatComponentText llllllllllllIlIllIIlIIIllllIIIIl = new ChatComponentText(llllllllllllIlIllIIlIIIllllIIIll);
            llllllllllllIlIllIIlIIIllllIIIIl.setChatStyle(llllllllllllIlIllIIlIIIllllIlIlI.getChatStyle().createShallowCopy());
            "".length();
            if (lIlIIlIIllIlIIll(llllllllllllIlIllIIlIIIllllIllll + llllllllllllIlIllIIlIIIllllIIIlI, llllllllllllIlIllIIlIIIlllllIIll)) {
                String llllllllllllIlIllIIlIIIllllIIIII = llllllllllllIlIllIIlIIIlllllIIlI.trimStringToWidth(llllllllllllIlIllIIlIIIllllIIlII, llllllllllllIlIllIIlIIIlllllIIll - llllllllllllIlIllIIlIIIllllIllll, (boolean)(GuiUtilRenderComponents.lllIllIlIIllII[0] != 0));
                String substring2;
                if (lIlIIlIIllIlIlII(llllllllllllIlIllIIlIIIllllIIIII.length(), llllllllllllIlIllIIlIIIllllIIlII.length())) {
                    substring2 = llllllllllllIlIllIIlIIIllllIIlII.substring(llllllllllllIlIllIIlIIIllllIIIII.length());
                    "".length();
                    if ("   ".length() <= -" ".length()) {
                        return null;
                    }
                }
                else {
                    substring2 = null;
                }
                String llllllllllllIlIllIIlIIIlllIlllll = substring2;
                if (lIlIIlIIllIlIlIl(llllllllllllIlIllIIlIIIlllIlllll) && lIlIIlIIllIlIllI(llllllllllllIlIllIIlIIIlllIlllll.length())) {
                    int llllllllllllIlIllIIlIIIlllIllllI = llllllllllllIlIllIIlIIIllllIIIII.lastIndexOf(GuiUtilRenderComponents.lllIllIlIIlIll[GuiUtilRenderComponents.lllIllIlIIllII[4]]);
                    if (lIlIIlIIllIlIlll(llllllllllllIlIllIIlIIIlllIllllI) && lIlIIlIIllIlIllI(llllllllllllIlIllIIlIIIlllllIIlI.getStringWidth(llllllllllllIlIllIIlIIIllllIIlII.substring(GuiUtilRenderComponents.lllIllIlIIllII[0], llllllllllllIlIllIIlIIIlllIllllI)))) {
                        llllllllllllIlIllIIlIIIllllIIIII = llllllllllllIlIllIIlIIIllllIIlII.substring(GuiUtilRenderComponents.lllIllIlIIllII[0], llllllllllllIlIllIIlIIIlllIllllI);
                        if (lIlIIlIIllIlIIlI(llllllllllllIlIllIIlIIIlllIllIIl ? 1 : 0)) {
                            ++llllllllllllIlIllIIlIIIlllIllllI;
                        }
                        llllllllllllIlIllIIlIIIlllIlllll = llllllllllllIlIllIIlIIIllllIIlII.substring(llllllllllllIlIllIIlIIIlllIllllI);
                        "".length();
                        if ("  ".length() < 0) {
                            return null;
                        }
                    }
                    else if (lIlIIlIIllIlIllI(llllllllllllIlIllIIlIIIllllIllll) && lIlIIlIIllIlIIIl(llllllllllllIlIllIIlIIIllllIIlII.contains(GuiUtilRenderComponents.lllIllIlIIlIll[GuiUtilRenderComponents.lllIllIlIIllII[5]]) ? 1 : 0)) {
                        llllllllllllIlIllIIlIIIllllIIIII = GuiUtilRenderComponents.lllIllIlIIlIll[GuiUtilRenderComponents.lllIllIlIIllII[6]];
                        llllllllllllIlIllIIlIIIlllIlllll = llllllllllllIlIllIIlIIIllllIIlII;
                    }
                    final ChatComponentText llllllllllllIlIllIIlIIIlllIlllIl = new ChatComponentText(llllllllllllIlIllIIlIIIlllIlllll);
                    llllllllllllIlIllIIlIIIlllIlllIl.setChatStyle(llllllllllllIlIllIIlIIIllllIlIlI.getChatStyle().createShallowCopy());
                    "".length();
                    llllllllllllIlIllIIlIIIllllIllII.add(llllllllllllIlIllIIlIIIllllIlIll + GuiUtilRenderComponents.lllIllIlIIllII[1], llllllllllllIlIllIIlIIIlllIlllIl);
                }
                llllllllllllIlIllIIlIIIllllIIIlI = llllllllllllIlIllIIlIIIlllllIIlI.getStringWidth(llllllllllllIlIllIIlIIIllllIIIII);
                llllllllllllIlIllIIlIIIllllIIIIl = new ChatComponentText(llllllllllllIlIllIIlIIIllllIIIII);
                llllllllllllIlIllIIlIIIllllIIIIl.setChatStyle(llllllllllllIlIllIIlIIIllllIlIlI.getChatStyle().createShallowCopy());
                "".length();
                llllllllllllIlIllIIlIIIllllIlIII = (GuiUtilRenderComponents.lllIllIlIIllII[1] != 0);
            }
            if (lIlIIlIIllIllIII(llllllllllllIlIllIIlIIIllllIllll + llllllllllllIlIllIIlIIIllllIIIlI, llllllllllllIlIllIIlIIIlllllIIll)) {
                llllllllllllIlIllIIlIIIllllIllll += llllllllllllIlIllIIlIIIllllIIIlI;
                llllllllllllIlIllIIlIIIllllIlllI.appendSibling(llllllllllllIlIllIIlIIIllllIIIIl);
                "".length();
                "".length();
                if (-" ".length() == "  ".length()) {
                    return null;
                }
            }
            else {
                llllllllllllIlIllIIlIIIllllIlIII = (GuiUtilRenderComponents.lllIllIlIIllII[1] != 0);
            }
            if (lIlIIlIIllIlIIlI(llllllllllllIlIllIIlIIIllllIlIII ? 1 : 0)) {
                llllllllllllIlIllIIlIIIllllIllIl.add(llllllllllllIlIllIIlIIIllllIlllI);
                "".length();
                llllllllllllIlIllIIlIIIllllIllll = GuiUtilRenderComponents.lllIllIlIIllII[0];
                llllllllllllIlIllIIlIIIllllIlllI = new ChatComponentText(GuiUtilRenderComponents.lllIllIlIIlIll[GuiUtilRenderComponents.lllIllIlIIllII[7]]);
            }
            ++llllllllllllIlIllIIlIIIllllIlIll;
        }
        llllllllllllIlIllIIlIIIllllIllIl.add(llllllllllllIlIllIIlIIIllllIlllI);
        "".length();
        return llllllllllllIlIllIIlIIIllllIllIl;
    }
    
    private static boolean lIlIIlIIllIlIIIl(final int llllllllllllIlIllIIlIIIllIIIIIII) {
        return llllllllllllIlIllIIlIIIllIIIIIII == 0;
    }
    
    private static boolean lIlIIlIIllIlIIll(final int llllllllllllIlIllIIlIIIllIIIIlll, final int llllllllllllIlIllIIlIIIllIIIIllI) {
        return llllllllllllIlIllIIlIIIllIIIIlll > llllllllllllIlIllIIlIIIllIIIIllI;
    }
}
