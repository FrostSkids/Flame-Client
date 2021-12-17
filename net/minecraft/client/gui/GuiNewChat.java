// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Arrays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import org.apache.logging.log4j.LogManager;
import com.google.common.collect.Lists;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import java.util.Iterator;
import net.minecraft.util.MathHelper;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.Logger;
import java.util.List;

public class GuiNewChat extends Gui
{
    private final /* synthetic */ List<ChatLine> field_146253_i;
    private static final /* synthetic */ String[] lllIIlIIIIlIlI;
    private final /* synthetic */ List<String> sentMessages;
    private final /* synthetic */ List<ChatLine> chatLines;
    private /* synthetic */ int scrollPos;
    private static final /* synthetic */ Logger logger;
    private static final /* synthetic */ int[] lllIIlIIIIlIll;
    private final /* synthetic */ Minecraft mc;
    private /* synthetic */ boolean isScrolled;
    
    public void clearChatMessages() {
        this.field_146253_i.clear();
        this.chatLines.clear();
        this.sentMessages.clear();
    }
    
    public void scroll(final int llllllllllllIlIlllllIlIlIIllIIlI) {
        this.scrollPos += llllllllllllIlIlllllIlIlIIllIIlI;
        final int llllllllllllIlIlllllIlIlIIllIlII = this.field_146253_i.size();
        if (lIIllllIlIlllllI(this.scrollPos, llllllllllllIlIlllllIlIlIIllIlII - this.getLineCount())) {
            this.scrollPos = llllllllllllIlIlllllIlIlIIllIlII - this.getLineCount();
        }
        if (lIIllllIllIIIlII(this.scrollPos)) {
            this.scrollPos = GuiNewChat.lllIIlIIIIlIll[0];
            this.isScrolled = (GuiNewChat.lllIIlIIIIlIll[0] != 0);
        }
    }
    
    private static boolean lIIllllIllIIIIll(final int llllllllllllIlIlllllIlIIlIIIIllI) {
        return llllllllllllIlIlllllIlIIlIIIIllI < 0;
    }
    
    private static boolean lIIllllIlIllllIl(final int llllllllllllIlIlllllIlIIlIlIIIIl, final int llllllllllllIlIlllllIlIIlIlIIIII) {
        return llllllllllllIlIlllllIlIIlIlIIIIl >= llllllllllllIlIlllllIlIIlIlIIIII;
    }
    
    public int getChatWidth() {
        return calculateChatboxWidth(this.mc.gameSettings.chatWidth);
    }
    
    public float getChatScale() {
        return this.mc.gameSettings.chatScale;
    }
    
    private static boolean lIIllllIlIlllIll(final int llllllllllllIlIlllllIlIIlIIIllII) {
        return llllllllllllIlIlllllIlIIlIIIllII != 0;
    }
    
    private static void lIIllllIlIlllIII() {
        (lllIIlIIIIlIll = new int[25])[0] = ((0x5F ^ 0x77 ^ (0x31 ^ 0x8)) & (0xAD ^ 0xA5 ^ (0x5D ^ 0x44) ^ -" ".length()));
        GuiNewChat.lllIIlIIIIlIll[1] = " ".length();
        GuiNewChat.lllIIlIIIIlIll[2] = 152 + 85 - 175 + 138;
        GuiNewChat.lllIIlIIIIlIll[3] = 180 + 233 - 294 + 136;
        GuiNewChat.lllIIlIIIIlIll[4] = "   ".length();
        GuiNewChat.lllIIlIIIIlIll[5] = (0x44 ^ 0x1D ^ (0xE0 ^ 0xB0));
        GuiNewChat.lllIIlIIIIlIll[6] = (0x73 ^ 0x7B);
        GuiNewChat.lllIIlIIIIlIll[7] = (-" ".length() & (-1 & 0xFFFFFF));
        GuiNewChat.lllIIlIIIIlIll[8] = (0x61 ^ 0x79);
        GuiNewChat.lllIIlIIIIlIll[9] = (0x88 ^ 0x9E) + (79 + 79 - 69 + 44) - (0xEE ^ 0x94) + (27 + 22 + 38 + 50);
        GuiNewChat.lllIIlIIIIlIll[10] = (0xA5 ^ 0xC5);
        GuiNewChat.lllIIlIIIIlIll[11] = (-(0xFFFFDB9F & 0x6CED) & (0xFFFFFBFF & 0xCC7FBF));
        GuiNewChat.lllIIlIIIIlIll[12] = (-(0xFFFFE4F6 & 0x5F5F) & (0xFFFFF7FF & 0x337FFF));
        GuiNewChat.lllIIlIIIIlIll[13] = "  ".length();
        GuiNewChat.lllIIlIIIIlIll[14] = (0xFFFFECFD & 0xCCDFCE);
        GuiNewChat.lllIIlIIIIlIll[15] = (93 + 151 - 85 + 12 ^ 48 + 76 + 28 + 23);
        GuiNewChat.lllIIlIIIIlIll[16] = (0x8E ^ 0x8B);
        GuiNewChat.lllIIlIIIIlIll[17] = (0x6A ^ 0x47 ^ (0xC ^ 0x27));
        GuiNewChat.lllIIlIIIIlIll[18] = (87 + 195 - 105 + 70 ^ 23 + 85 - 44 + 83);
        GuiNewChat.lllIIlIIIIlIll[19] = (105 + 52 - 28 + 52 ^ 29 + 38 + 84 + 23);
        GuiNewChat.lllIIlIIIIlIll[20] = (0xFFFF9F60 & 0x61DF);
        GuiNewChat.lllIIlIIIIlIll[21] = (0x78 ^ 0x50);
        GuiNewChat.lllIIlIIIIlIll[22] = 86 + 146 - 79 + 27;
        GuiNewChat.lllIIlIIIIlIll[23] = (0x40 ^ 0x54);
        GuiNewChat.lllIIlIIIIlIll[24] = (0x91 ^ 0x96);
    }
    
    private static boolean lIIllllIlIllllll(final int llllllllllllIlIlllllIlIIlIIlllIl, final int llllllllllllIlIlllllIlIIlIIlllII) {
        return llllllllllllIlIlllllIlIIlIIlllIl < llllllllllllIlIlllllIlIIlIIlllII;
    }
    
    public static int calculateChatboxHeight(final float llllllllllllIlIlllllIlIIlllIIIlI) {
        final int llllllllllllIlIlllllIlIIlllIIIIl = GuiNewChat.lllIIlIIIIlIll[22];
        final int llllllllllllIlIlllllIlIIlllIIIII = GuiNewChat.lllIIlIIIIlIll[23];
        return MathHelper.floor_float(llllllllllllIlIlllllIlIIlllIIIlI * (llllllllllllIlIlllllIlIIlllIIIIl - llllllllllllIlIlllllIlIIlllIIIII) + llllllllllllIlIlllllIlIIlllIIIII);
    }
    
    public void deleteChatLine(final int llllllllllllIlIlllllIlIIllllllll) {
        Iterator<ChatLine> llllllllllllIlIlllllIlIIlllllllI = this.field_146253_i.iterator();
        "".length();
        if (" ".length() > " ".length()) {
            return;
        }
        while (!lIIllllIllIIIIIl(llllllllllllIlIlllllIlIIlllllllI.hasNext() ? 1 : 0)) {
            final ChatLine llllllllllllIlIlllllIlIIllllllIl = llllllllllllIlIlllllIlIIlllllllI.next();
            if (lIIllllIllIIIllI(llllllllllllIlIlllllIlIIllllllIl.getChatLineID(), llllllllllllIlIlllllIlIIllllllll)) {
                llllllllllllIlIlllllIlIIlllllllI.remove();
            }
        }
        llllllllllllIlIlllllIlIIlllllllI = this.chatLines.iterator();
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIllllIllIIIIIl(llllllllllllIlIlllllIlIIlllllllI.hasNext() ? 1 : 0)) {
            final ChatLine llllllllllllIlIlllllIlIIllllllII = llllllllllllIlIlllllIlIIlllllllI.next();
            if (lIIllllIllIIIllI(llllllllllllIlIlllllIlIIllllllII.getChatLineID(), llllllllllllIlIlllllIlIIllllllll)) {
                llllllllllllIlIlllllIlIIlllllllI.remove();
                "".length();
                if ("  ".length() != "  ".length()) {
                    return;
                }
                break;
            }
        }
    }
    
    public static int calculateChatboxWidth(final float llllllllllllIlIlllllIlIIlllIlIll) {
        final int llllllllllllIlIlllllIlIIlllIlIlI = GuiNewChat.lllIIlIIIIlIll[20];
        final int llllllllllllIlIlllllIlIIlllIlIIl = GuiNewChat.lllIIlIIIIlIll[21];
        return MathHelper.floor_float(llllllllllllIlIlllllIlIIlllIlIll * (llllllllllllIlIlllllIlIIlllIlIlI - llllllllllllIlIlllllIlIIlllIlIIl) + llllllllllllIlIlllllIlIIlllIlIIl);
    }
    
    public IChatComponent getChatComponent(final int llllllllllllIlIlllllIlIlIIIlIlII, final int llllllllllllIlIlllllIlIlIIlIIIII) {
        if (lIIllllIllIIIIIl(this.getChatOpen() ? 1 : 0)) {
            return null;
        }
        final ScaledResolution llllllllllllIlIlllllIlIlIIIlllll = new ScaledResolution(this.mc);
        final int llllllllllllIlIlllllIlIlIIIllllI = llllllllllllIlIlllllIlIlIIIlllll.getScaleFactor();
        final float llllllllllllIlIlllllIlIlIIIlllIl = this.getChatScale();
        int llllllllllllIlIlllllIlIlIIIlllII = llllllllllllIlIlllllIlIlIIIlIlII / llllllllllllIlIlllllIlIlIIIllllI - GuiNewChat.lllIIlIIIIlIll[4];
        int llllllllllllIlIlllllIlIlIIIllIll = llllllllllllIlIlllllIlIlIIlIIIII / llllllllllllIlIlllllIlIlIIIllllI - GuiNewChat.lllIIlIIIIlIll[19];
        llllllllllllIlIlllllIlIlIIIlllII = MathHelper.floor_float(llllllllllllIlIlllllIlIlIIIlllII / llllllllllllIlIlllllIlIlIIIlllIl);
        llllllllllllIlIlllllIlIlIIIllIll = MathHelper.floor_float(llllllllllllIlIlllllIlIlIIIllIll / llllllllllllIlIlllllIlIlIIIlllIl);
        if (!lIIllllIllIIIlIl(llllllllllllIlIlllllIlIlIIIlllII) || !lIIllllIllIIIlIl(llllllllllllIlIlllllIlIlIIIllIll)) {
            return null;
        }
        final int llllllllllllIlIlllllIlIlIIIllIlI = Math.min(this.getLineCount(), this.field_146253_i.size());
        if (lIIllllIllIIIIlI(llllllllllllIlIlllllIlIlIIIlllII, MathHelper.floor_float(this.getChatWidth() / this.getChatScale())) && lIIllllIlIllllll(llllllllllllIlIlllllIlIlIIIllIll, this.mc.fontRendererObj.FONT_HEIGHT * llllllllllllIlIlllllIlIlIIIllIlI + llllllllllllIlIlllllIlIlIIIllIlI)) {
            final int llllllllllllIlIlllllIlIlIIIllIIl = llllllllllllIlIlllllIlIlIIIllIll / this.mc.fontRendererObj.FONT_HEIGHT + this.scrollPos;
            if (lIIllllIllIIIlIl(llllllllllllIlIlllllIlIlIIIllIIl) && lIIllllIlIllllll(llllllllllllIlIlllllIlIlIIIllIIl, this.field_146253_i.size())) {
                final ChatLine llllllllllllIlIlllllIlIlIIIllIII = this.field_146253_i.get(llllllllllllIlIlllllIlIlIIIllIIl);
                int llllllllllllIlIlllllIlIlIIIlIlll = GuiNewChat.lllIIlIIIIlIll[0];
                final long llllllllllllIlIlllllIlIlIIIIlIII = (long)llllllllllllIlIlllllIlIlIIIllIII.getChatComponent().iterator();
                "".length();
                if ((58 + 115 - 122 + 97 ^ 58 + 91 - 71 + 66) > (88 + 14 + 35 + 8 ^ 131 + 86 - 105 + 37)) {
                    return null;
                }
                while (!lIIllllIllIIIIIl(((Iterator)llllllllllllIlIlllllIlIlIIIIlIII).hasNext() ? 1 : 0)) {
                    final IChatComponent llllllllllllIlIlllllIlIlIIIlIllI = ((Iterator<IChatComponent>)llllllllllllIlIlllllIlIlIIIIlIII).next();
                    if (lIIllllIlIlllIll((llllllllllllIlIlllllIlIlIIIlIllI instanceof ChatComponentText) ? 1 : 0)) {
                        llllllllllllIlIlllllIlIlIIIlIlll += this.mc.fontRendererObj.getStringWidth(GuiUtilRenderComponents.func_178909_a(((ChatComponentText)llllllllllllIlIlllllIlIlIIIlIllI).getChatComponentText_TextValue(), (boolean)(GuiNewChat.lllIIlIIIIlIll[0] != 0)));
                        if (lIIllllIlIlllllI(llllllllllllIlIlllllIlIlIIIlIlll, llllllllllllIlIlllllIlIlIIIlllII)) {
                            return llllllllllllIlIlllllIlIlIIIlIllI;
                        }
                        continue;
                    }
                }
            }
            return null;
        }
        return null;
    }
    
    private static boolean lIIllllIllIIIlIl(final int llllllllllllIlIlllllIlIIlIIIlIII) {
        return llllllllllllIlIlllllIlIIlIIIlIII >= 0;
    }
    
    public void refreshChat() {
        this.field_146253_i.clear();
        this.resetScroll();
        int llllllllllllIlIlllllIlIlIlIIlIlI = this.chatLines.size() - GuiNewChat.lllIIlIIIIlIll[1];
        "".length();
        if (((0xCF ^ 0x9F ^ (0x39 ^ 0x5F)) & (58 + 129 - 139 + 90 ^ 155 + 34 - 158 + 157 ^ -" ".length())) != 0x0) {
            return;
        }
        while (!lIIllllIllIIIIll(llllllllllllIlIlllllIlIlIlIIlIlI)) {
            final ChatLine llllllllllllIlIlllllIlIlIlIIlIIl = this.chatLines.get(llllllllllllIlIlllllIlIlIlIIlIlI);
            this.setChatLine(llllllllllllIlIlllllIlIlIlIIlIIl.getChatComponent(), llllllllllllIlIlllllIlIlIlIIlIIl.getChatLineID(), llllllllllllIlIlllllIlIlIlIIlIIl.getUpdatedCounter(), (boolean)(GuiNewChat.lllIIlIIIIlIll[1] != 0));
            --llllllllllllIlIlllllIlIlIlIIlIlI;
        }
    }
    
    private static boolean lIIllllIllIIIIlI(final int llllllllllllIlIlllllIlIIlIIllIIl, final int llllllllllllIlIlllllIlIIlIIllIII) {
        return llllllllllllIlIlllllIlIIlIIllIIl <= llllllllllllIlIlllllIlIIlIIllIII;
    }
    
    private static String lIIllllIlIllIlII(String llllllllllllIlIlllllIlIIlIllllIl, final String llllllllllllIlIlllllIlIIlIllllII) {
        llllllllllllIlIlllllIlIIlIllllIl = new String(Base64.getDecoder().decode(llllllllllllIlIlllllIlIIlIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllllIlIIllIIIIII = new StringBuilder();
        final char[] llllllllllllIlIlllllIlIIlIllllll = llllllllllllIlIlllllIlIIlIllllII.toCharArray();
        int llllllllllllIlIlllllIlIIlIlllllI = GuiNewChat.lllIIlIIIIlIll[0];
        final byte llllllllllllIlIlllllIlIIlIlllIII = (Object)llllllllllllIlIlllllIlIIlIllllIl.toCharArray();
        final short llllllllllllIlIlllllIlIIlIllIlll = (short)llllllllllllIlIlllllIlIIlIlllIII.length;
        Exception llllllllllllIlIlllllIlIIlIllIllI = (Exception)GuiNewChat.lllIIlIIIIlIll[0];
        while (lIIllllIlIllllll((int)llllllllllllIlIlllllIlIIlIllIllI, llllllllllllIlIlllllIlIIlIllIlll)) {
            final char llllllllllllIlIlllllIlIIllIIIIll = llllllllllllIlIlllllIlIIlIlllIII[llllllllllllIlIlllllIlIIlIllIllI];
            llllllllllllIlIlllllIlIIllIIIIII.append((char)(llllllllllllIlIlllllIlIIllIIIIll ^ llllllllllllIlIlllllIlIIlIllllll[llllllllllllIlIlllllIlIIlIlllllI % llllllllllllIlIlllllIlIIlIllllll.length]));
            "".length();
            ++llllllllllllIlIlllllIlIIlIlllllI;
            ++llllllllllllIlIlllllIlIIlIllIllI;
            "".length();
            if ((0xC0 ^ 0xC5) <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllllIlIIllIIIIII);
    }
    
    private static String lIIllllIlIllIllI(final String llllllllllllIlIlllllIlIIlIlIlIll, final String llllllllllllIlIlllllIlIIlIlIllII) {
        try {
            final SecretKeySpec llllllllllllIlIlllllIlIIlIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllllIlIIlIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllllIlIIlIlIllll = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllllIlIIlIlIllll.init(GuiNewChat.lllIIlIIIIlIll[13], llllllllllllIlIlllllIlIIlIllIIII);
            return new String(llllllllllllIlIlllllIlIIlIlIllll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllllIlIIlIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllllIlIIlIlIlllI) {
            llllllllllllIlIlllllIlIIlIlIlllI.printStackTrace();
            return null;
        }
    }
    
    public int getLineCount() {
        return this.getChatHeight() / GuiNewChat.lllIIlIIIIlIll[5];
    }
    
    private static void lIIllllIlIllIlll() {
        (lllIIlIIIIlIlI = new String[GuiNewChat.lllIIlIIIIlIll[24]])[GuiNewChat.lllIIlIIIIlIll[0]] = lIIllllIlIllIlII("BAooJxMJHw==", "lsXNk");
        GuiNewChat.lllIIlIIIIlIlI[GuiNewChat.lllIIlIIIIlIll[1]] = lIIllllIlIllIlIl("leD64ztfgZw=", "UfMOs");
        GuiNewChat.lllIIlIIIIlIlI[GuiNewChat.lllIIlIIIIlIll[13]] = lIIllllIlIllIllI("YmynQBB6/tCQW/TLnAE6bA==", "uMIzP");
        GuiNewChat.lllIIlIIIIlIlI[GuiNewChat.lllIIlIIIIlIll[4]] = lIIllllIlIllIlII("IyY2YjYCOzArExg7NQ==", "wIFBe");
        GuiNewChat.lllIIlIIIIlIlI[GuiNewChat.lllIIlIIIIlIll[15]] = lIIllllIlIllIlII("FSY+HSIT", "TSJre");
        GuiNewChat.lllIIlIIIIlIlI[GuiNewChat.lllIIlIIIIlIll[16]] = lIIllllIlIllIlII("ZAIiJRU/QyYq", "KcAMt");
        GuiNewChat.lllIIlIIIIlIlI[GuiNewChat.lllIIlIIIIlIll[17]] = lIIllllIlIllIlIl("23i9wYh+81I=", "RRFzF");
    }
    
    private static boolean lIIllllIlIlllIlI(final int llllllllllllIlIlllllIlIIlIIIIIlI) {
        return llllllllllllIlIlllllIlIIlIIIIIlI > 0;
    }
    
    private static boolean lIIllllIlIlllIIl(final Object llllllllllllIlIlllllIlIIlIIlIIIl, final Object llllllllllllIlIlllllIlIIlIIlIIII) {
        return llllllllllllIlIlllllIlIIlIIlIIIl != llllllllllllIlIlllllIlIIlIIlIIII;
    }
    
    public void printChatMessage(final IChatComponent llllllllllllIlIlllllIlIlIlllIlll) {
        this.printChatMessageWithOptionalDeletion(llllllllllllIlIlllllIlIlIlllIlll, GuiNewChat.lllIIlIIIIlIll[0]);
    }
    
    private static boolean lIIllllIlIlllllI(final int llllllllllllIlIlllllIlIIlIIlIlIl, final int llllllllllllIlIlllllIlIIlIIlIlII) {
        return llllllllllllIlIlllllIlIIlIIlIlIl > llllllllllllIlIlllllIlIIlIIlIlII;
    }
    
    public List<String> getSentMessages() {
        return this.sentMessages;
    }
    
    public GuiNewChat(final Minecraft llllllllllllIlIlllllIlIllIlllIlI) {
        this.sentMessages = (List<String>)Lists.newArrayList();
        this.chatLines = (List<ChatLine>)Lists.newArrayList();
        this.field_146253_i = (List<ChatLine>)Lists.newArrayList();
        this.mc = llllllllllllIlIlllllIlIllIlllIlI;
    }
    
    public int getChatHeight() {
        float llllllllllllIlIlllllIlIIlllIIIlI;
        if (lIIllllIlIlllIll(this.getChatOpen() ? 1 : 0)) {
            llllllllllllIlIlllllIlIIlllIIIlI = this.mc.gameSettings.chatHeightFocused;
            "".length();
            if (((0x85 ^ 0x99) & ~(0xB7 ^ 0xAB)) >= " ".length()) {
                return "  ".length() & ~"  ".length();
            }
        }
        else {
            llllllllllllIlIlllllIlIIlllIIIlI = this.mc.gameSettings.chatHeightUnfocused;
        }
        return calculateChatboxHeight(llllllllllllIlIlllllIlIIlllIIIlI);
    }
    
    private static boolean lIIllllIllIIIIII(final int llllllllllllIlIlllllIlIIIlllllll, final int llllllllllllIlIlllllIlIIIllllllI) {
        return llllllllllllIlIlllllIlIIIlllllll != llllllllllllIlIlllllIlIIIllllllI;
    }
    
    static {
        lIIllllIlIlllIII();
        lIIllllIlIllIlll();
        logger = LogManager.getLogger();
    }
    
    public void resetScroll() {
        this.scrollPos = GuiNewChat.lllIIlIIIIlIll[0];
        this.isScrolled = (GuiNewChat.lllIIlIIIIlIll[0] != 0);
    }
    
    private static boolean lIIllllIllIIIIIl(final int llllllllllllIlIlllllIlIIlIIIlIlI) {
        return llllllllllllIlIlllllIlIIlIIIlIlI == 0;
    }
    
    public boolean getChatOpen() {
        return this.mc.currentScreen instanceof GuiChat;
    }
    
    public void drawChat(final int llllllllllllIlIlllllIlIllIIIlllI) {
        if (lIIllllIlIlllIIl(this.mc.gameSettings.chatVisibility, EntityPlayer.EnumChatVisibility.HIDDEN)) {
            final int llllllllllllIlIlllllIlIllIlIIlIl = this.getLineCount();
            boolean llllllllllllIlIlllllIlIllIlIIlII = GuiNewChat.lllIIlIIIIlIll[0] != 0;
            int llllllllllllIlIlllllIlIllIlIIIll = GuiNewChat.lllIIlIIIIlIll[0];
            final int llllllllllllIlIlllllIlIllIlIIIlI = this.field_146253_i.size();
            final float llllllllllllIlIlllllIlIllIlIIIIl = this.mc.gameSettings.chatOpacity * 0.9f + 0.1f;
            if (lIIllllIlIlllIlI(llllllllllllIlIlllllIlIllIlIIIlI)) {
                if (lIIllllIlIlllIll(this.getChatOpen() ? 1 : 0)) {
                    llllllllllllIlIlllllIlIllIlIIlII = (GuiNewChat.lllIIlIIIIlIll[1] != 0);
                }
                final float llllllllllllIlIlllllIlIllIlIIIII = this.getChatScale();
                final int llllllllllllIlIlllllIlIllIIlllll = MathHelper.ceiling_float_int(this.getChatWidth() / llllllllllllIlIlllllIlIllIlIIIII);
                GlStateManager.pushMatrix();
                GlStateManager.translate(2.0f, 20.0f, 0.0f);
                GlStateManager.scale(llllllllllllIlIlllllIlIllIlIIIII, llllllllllllIlIlllllIlIllIlIIIII, 1.0f);
                int llllllllllllIlIlllllIlIllIIllllI = GuiNewChat.lllIIlIIIIlIll[0];
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
                while (lIIllllIlIllllll(llllllllllllIlIlllllIlIllIIllllI + this.scrollPos, this.field_146253_i.size()) && !lIIllllIlIllllIl(llllllllllllIlIlllllIlIllIIllllI, llllllllllllIlIlllllIlIllIlIIlIl)) {
                    final ChatLine llllllllllllIlIlllllIlIllIIlllIl = this.field_146253_i.get(llllllllllllIlIlllllIlIllIIllllI + this.scrollPos);
                    if (lIIllllIlIllllII(llllllllllllIlIlllllIlIllIIlllIl)) {
                        final int llllllllllllIlIlllllIlIllIIlllII = llllllllllllIlIlllllIlIllIIIlllI - llllllllllllIlIlllllIlIllIIlllIl.getUpdatedCounter();
                        if (!lIIllllIlIllllIl(llllllllllllIlIlllllIlIllIIlllII, GuiNewChat.lllIIlIIIIlIll[2]) || lIIllllIlIlllIll(llllllllllllIlIlllllIlIllIlIIlII ? 1 : 0)) {
                            double llllllllllllIlIlllllIlIllIIllIll = llllllllllllIlIlllllIlIllIIlllII / 200.0;
                            llllllllllllIlIlllllIlIllIIllIll = 1.0 - llllllllllllIlIlllllIlIllIIllIll;
                            llllllllllllIlIlllllIlIllIIllIll *= 10.0;
                            llllllllllllIlIlllllIlIllIIllIll = MathHelper.clamp_double(llllllllllllIlIlllllIlIllIIllIll, 0.0, 1.0);
                            llllllllllllIlIlllllIlIllIIllIll *= llllllllllllIlIlllllIlIllIIllIll;
                            int llllllllllllIlIlllllIlIllIIllIlI = (int)(255.0 * llllllllllllIlIlllllIlIllIIllIll);
                            if (lIIllllIlIlllIll(llllllllllllIlIlllllIlIllIlIIlII ? 1 : 0)) {
                                llllllllllllIlIlllllIlIllIIllIlI = GuiNewChat.lllIIlIIIIlIll[3];
                            }
                            llllllllllllIlIlllllIlIllIIllIlI *= (int)llllllllllllIlIlllllIlIllIlIIIIl;
                            ++llllllllllllIlIlllllIlIllIlIIIll;
                            if (lIIllllIlIlllllI(llllllllllllIlIlllllIlIllIIllIlI, GuiNewChat.lllIIlIIIIlIll[4])) {
                                final int llllllllllllIlIlllllIlIllIIllIIl = GuiNewChat.lllIIlIIIIlIll[0];
                                final int llllllllllllIlIlllllIlIllIIllIII = -llllllllllllIlIlllllIlIllIIllllI * GuiNewChat.lllIIlIIIIlIll[5];
                                final String llllllllllllIlIlllllIlIllIIlIlll = llllllllllllIlIlllllIlIllIIlllIl.getChatComponent().getFormattedText();
                                GlStateManager.enableBlend();
                                this.mc.fontRendererObj.drawStringWithShadow(llllllllllllIlIlllllIlIllIIlIlll, (float)llllllllllllIlIlllllIlIllIIllIIl, (float)(llllllllllllIlIlllllIlIllIIllIII - GuiNewChat.lllIIlIIIIlIll[6]), GuiNewChat.lllIIlIIIIlIll[7] + (llllllllllllIlIlllllIlIllIIllIlI << GuiNewChat.lllIIlIIIIlIll[8]));
                                "".length();
                                GlStateManager.disableAlpha();
                                GlStateManager.disableBlend();
                            }
                        }
                    }
                    ++llllllllllllIlIlllllIlIllIIllllI;
                }
                if (lIIllllIlIlllIll(llllllllllllIlIlllllIlIllIlIIlII ? 1 : 0)) {
                    final int llllllllllllIlIlllllIlIllIIlIllI = this.mc.fontRendererObj.FONT_HEIGHT;
                    GlStateManager.translate(-3.0f, 0.0f, 0.0f);
                    final int llllllllllllIlIlllllIlIllIIlIlIl = llllllllllllIlIlllllIlIllIlIIIlI * llllllllllllIlIlllllIlIllIIlIllI + llllllllllllIlIlllllIlIllIlIIIlI;
                    final int llllllllllllIlIlllllIlIllIIlIlII = llllllllllllIlIlllllIlIllIlIIIll * llllllllllllIlIlllllIlIllIIlIllI + llllllllllllIlIlllllIlIllIlIIIll;
                    final int llllllllllllIlIlllllIlIllIIlIIll = this.scrollPos * llllllllllllIlIlllllIlIllIIlIlII / llllllllllllIlIlllllIlIllIlIIIlI;
                    final int llllllllllllIlIlllllIlIllIIlIIlI = llllllllllllIlIlllllIlIllIIlIlII * llllllllllllIlIlllllIlIllIIlIlII / llllllllllllIlIlllllIlIllIIlIlIl;
                    if (lIIllllIllIIIIII(llllllllllllIlIlllllIlIllIIlIlIl, llllllllllllIlIlllllIlIllIIlIlII)) {
                        int n;
                        if (lIIllllIlIlllIlI(llllllllllllIlIlllllIlIllIIlIIll)) {
                            n = GuiNewChat.lllIIlIIIIlIll[9];
                            "".length();
                            if ((0x1B ^ 0x1E) <= 0) {
                                return;
                            }
                        }
                        else {
                            n = GuiNewChat.lllIIlIIIIlIll[10];
                        }
                        final int llllllllllllIlIlllllIlIllIIlIIIl = n;
                        int n2;
                        if (lIIllllIlIlllIll(this.isScrolled ? 1 : 0)) {
                            n2 = GuiNewChat.lllIIlIIIIlIll[11];
                            "".length();
                            if (((0x36 ^ 0x7E) & ~(0x70 ^ 0x38)) != ((0xFE ^ 0xA0) & ~(0xCA ^ 0x94))) {
                                return;
                            }
                        }
                        else {
                            n2 = GuiNewChat.lllIIlIIIIlIll[12];
                        }
                        final int llllllllllllIlIlllllIlIllIIlIIII = n2;
                        Gui.drawRect(GuiNewChat.lllIIlIIIIlIll[0], -llllllllllllIlIlllllIlIllIIlIIll, GuiNewChat.lllIIlIIIIlIll[13], -llllllllllllIlIlllllIlIllIIlIIll - llllllllllllIlIlllllIlIllIIlIIlI, llllllllllllIlIlllllIlIllIIlIIII + (llllllllllllIlIlllllIlIllIIlIIIl << GuiNewChat.lllIIlIIIIlIll[8]));
                        Gui.drawRect(GuiNewChat.lllIIlIIIIlIll[13], -llllllllllllIlIlllllIlIllIIlIIll, GuiNewChat.lllIIlIIIIlIll[1], -llllllllllllIlIlllllIlIllIIlIIll - llllllllllllIlIlllllIlIllIIlIIlI, GuiNewChat.lllIIlIIIIlIll[14] + (llllllllllllIlIlllllIlIllIIlIIIl << GuiNewChat.lllIIlIIIIlIll[8]));
                    }
                }
                GlStateManager.popMatrix();
            }
        }
    }
    
    private static boolean lIIllllIllIIIlII(final int llllllllllllIlIlllllIlIIlIIIIlII) {
        return llllllllllllIlIlllllIlIIlIIIIlII <= 0;
    }
    
    private void setChatLine(final IChatComponent llllllllllllIlIlllllIlIlIlIlIlll, final int llllllllllllIlIlllllIlIlIlIlllll, final int llllllllllllIlIlllllIlIlIlIllllI, final boolean llllllllllllIlIlllllIlIlIlIlllIl) {
        if (lIIllllIlIlllIll(llllllllllllIlIlllllIlIlIlIlllll)) {
            this.deleteChatLine(llllllllllllIlIlllllIlIlIlIlllll);
        }
        final int llllllllllllIlIlllllIlIlIlIlllII = MathHelper.floor_float(this.getChatWidth() / this.getChatScale());
        final List<IChatComponent> llllllllllllIlIlllllIlIlIlIllIll = GuiUtilRenderComponents.func_178908_a(llllllllllllIlIlllllIlIlIlIlIlll, llllllllllllIlIlllllIlIlIlIlllII, this.mc.fontRendererObj, (boolean)(GuiNewChat.lllIIlIIIIlIll[0] != 0), (boolean)(GuiNewChat.lllIIlIIIIlIll[0] != 0));
        final boolean llllllllllllIlIlllllIlIlIlIllIlI = this.getChatOpen();
        final double llllllllllllIlIlllllIlIlIlIIllll = (double)llllllllllllIlIlllllIlIlIlIllIll.iterator();
        "".length();
        if (((134 + 59 - 164 + 165 ^ 8 + 105 + 27 + 3) & (9 + 123 - 113 + 202 ^ 75 + 32 - 61 + 98 ^ -" ".length())) != 0x0) {
            return;
        }
        while (!lIIllllIllIIIIIl(((Iterator)llllllllllllIlIlllllIlIlIlIIllll).hasNext() ? 1 : 0)) {
            final IChatComponent llllllllllllIlIlllllIlIlIlIllIIl = ((Iterator<IChatComponent>)llllllllllllIlIlllllIlIlIlIIllll).next();
            if (lIIllllIlIlllIll(llllllllllllIlIlllllIlIlIlIllIlI ? 1 : 0) && lIIllllIlIlllIlI(this.scrollPos)) {
                this.isScrolled = (GuiNewChat.lllIIlIIIIlIll[1] != 0);
                this.scroll(GuiNewChat.lllIIlIIIIlIll[1]);
            }
            this.field_146253_i.add(GuiNewChat.lllIIlIIIIlIll[0], new ChatLine(llllllllllllIlIlllllIlIlIlIllllI, llllllllllllIlIlllllIlIlIlIllIIl, llllllllllllIlIlllllIlIlIlIlllll));
        }
        "".length();
        if (" ".length() >= (0x85 ^ 0x81)) {
            return;
        }
        while (!lIIllllIllIIIIlI(this.field_146253_i.size(), GuiNewChat.lllIIlIIIIlIll[18])) {
            this.field_146253_i.remove(this.field_146253_i.size() - GuiNewChat.lllIIlIIIIlIll[1]);
            "".length();
        }
        if (lIIllllIllIIIIIl(llllllllllllIlIlllllIlIlIlIlllIl ? 1 : 0)) {
            this.chatLines.add(GuiNewChat.lllIIlIIIIlIll[0], new ChatLine(llllllllllllIlIlllllIlIlIlIllllI, llllllllllllIlIlllllIlIlIlIlIlll, llllllllllllIlIlllllIlIlIlIlllll));
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIllllIllIIIIlI(this.chatLines.size(), GuiNewChat.lllIIlIIIIlIll[18])) {
                this.chatLines.remove(this.chatLines.size() - GuiNewChat.lllIIlIIIIlIll[1]);
                "".length();
            }
        }
    }
    
    private static String lIIllllIlIllIlIl(final String llllllllllllIlIlllllIlIIllIlIIII, final String llllllllllllIlIlllllIlIIllIlIIIl) {
        try {
            final SecretKeySpec llllllllllllIlIlllllIlIIllIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllllIlIIllIlIIIl.getBytes(StandardCharsets.UTF_8)), GuiNewChat.lllIIlIIIIlIll[6]), "DES");
            final Cipher llllllllllllIlIlllllIlIIllIlIlII = Cipher.getInstance("DES");
            llllllllllllIlIlllllIlIIllIlIlII.init(GuiNewChat.lllIIlIIIIlIll[13], llllllllllllIlIlllllIlIIllIlIlIl);
            return new String(llllllllllllIlIlllllIlIIllIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllllIlIIllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllllIlIIllIlIIll) {
            llllllllllllIlIlllllIlIIllIlIIll.printStackTrace();
            return null;
        }
    }
    
    public void addToSentMessages(final String llllllllllllIlIlllllIlIlIIllllll) {
        if (!lIIllllIllIIIIIl(this.sentMessages.isEmpty() ? 1 : 0) || lIIllllIllIIIIIl(this.sentMessages.get(this.sentMessages.size() - GuiNewChat.lllIIlIIIIlIll[1]).equals(llllllllllllIlIlllllIlIlIIllllll) ? 1 : 0)) {
            this.sentMessages.add(llllllllllllIlIlllllIlIlIIllllll);
            "".length();
        }
    }
    
    private static boolean lIIllllIllIIIllI(final int llllllllllllIlIlllllIlIIlIlIIlIl, final int llllllllllllIlIlllllIlIIlIlIIlII) {
        return llllllllllllIlIlllllIlIIlIlIIlIl == llllllllllllIlIlllllIlIIlIlIIlII;
    }
    
    private static boolean lIIllllIlIllllII(final Object llllllllllllIlIlllllIlIIlIIIlllI) {
        return llllllllllllIlIlllllIlIIlIIIlllI != null;
    }
    
    public void printChatMessageWithOptionalDeletion(final IChatComponent llllllllllllIlIlllllIlIlIlllIIII, final int llllllllllllIlIlllllIlIlIllIllll) {
        this.setChatLine(llllllllllllIlIlllllIlIlIlllIIII, llllllllllllIlIlllllIlIlIllIllll, this.mc.ingameGUI.getUpdateCounter(), (boolean)(GuiNewChat.lllIIlIIIIlIll[0] != 0));
        if (lIIllllIlIllllII(Minecraft.getMinecraft().getCurrentServerData()) && lIIllllIlIlllIll(Minecraft.getMinecraft().getCurrentServerData().serverIP.contains(GuiNewChat.lllIIlIIIIlIlI[GuiNewChat.lllIIlIIIIlIll[0]]) ? 1 : 0) && (!lIIllllIllIIIIIl(llllllllllllIlIlllllIlIlIlllIIII.getUnformattedText().contains(GuiNewChat.lllIIlIIIIlIlI[GuiNewChat.lllIIlIIIIlIll[1]]) ? 1 : 0) || !lIIllllIllIIIIIl(llllllllllllIlIlllllIlIlIlllIIII.getUnformattedText().contains(GuiNewChat.lllIIlIIIIlIlI[GuiNewChat.lllIIlIIIIlIll[13]]) ? 1 : 0) || lIIllllIlIlllIll(llllllllllllIlIlllllIlIlIlllIIII.getUnformattedText().contains(GuiNewChat.lllIIlIIIIlIlI[GuiNewChat.lllIIlIIIIlIll[4]]) ? 1 : 0))) {
            System.out.println(GuiNewChat.lllIIlIIIIlIlI[GuiNewChat.lllIIlIIIIlIll[15]]);
            Minecraft.getMinecraft().thePlayer.sendChatMessage(GuiNewChat.lllIIlIIIIlIlI[GuiNewChat.lllIIlIIIIlIll[16]]);
        }
        GuiNewChat.logger.info(String.valueOf(new StringBuilder(GuiNewChat.lllIIlIIIIlIlI[GuiNewChat.lllIIlIIIIlIll[17]]).append(llllllllllllIlIlllllIlIlIlllIIII.getUnformattedText())));
    }
}
