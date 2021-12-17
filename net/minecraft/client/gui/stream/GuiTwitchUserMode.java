// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui.stream;

import java.util.Iterator;
import net.minecraft.util.ChatComponentTranslation;
import java.util.Collection;
import java.util.Arrays;
import net.minecraft.util.ChatComponentText;
import com.google.common.collect.Lists;
import tv.twitch.chat.ChatUserSubscription;
import tv.twitch.chat.ChatUserMode;
import java.util.Set;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.IOException;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.stream.IStream;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import java.util.List;
import tv.twitch.chat.ChatUserInfo;
import net.minecraft.client.gui.GuiScreen;

public class GuiTwitchUserMode extends GuiScreen
{
    private final /* synthetic */ ChatUserInfo field_152337_h;
    private final /* synthetic */ List<IChatComponent> field_152332_r;
    private static final /* synthetic */ int[] lIlIIlIIlllIll;
    private static final /* synthetic */ EnumChatFormatting field_152336_g;
    private static final /* synthetic */ EnumChatFormatting field_152331_a;
    private /* synthetic */ int field_152334_t;
    private static final /* synthetic */ String[] lIlIIlIIlIlIll;
    private final /* synthetic */ IChatComponent field_152338_i;
    private final /* synthetic */ IStream stream;
    private static final /* synthetic */ EnumChatFormatting field_152335_f;
    
    @Override
    public void drawScreen(final int lllllllllllllIIIlllIIIIIIllIllll, final int lllllllllllllIIIlllIIIIIIllIlllI, final float lllllllllllllIIIlllIIIIIIlllIIll) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, this.field_152338_i.getUnformattedText(), this.width / GuiTwitchUserMode.lIlIIlIIlllIll[2], GuiTwitchUserMode.lIlIIlIIlllIll[18], GuiTwitchUserMode.lIlIIlIIlllIll[31]);
        int lllllllllllllIIIlllIIIIIIlllIIlI = GuiTwitchUserMode.lIlIIlIIlllIll[32];
        final int lllllllllllllIIIlllIIIIIIllIlIlI = (int)this.field_152332_r.iterator();
        "".length();
        if (((0x80 ^ 0x96 ^ (0x1F ^ 0xD)) & (0x79 ^ 0x1D ^ (0xCE ^ 0xAE) ^ -" ".length())) == " ".length()) {
            return;
        }
        while (!lllIIlIlllIIIII(((Iterator)lllllllllllllIIIlllIIIIIIllIlIlI).hasNext() ? 1 : 0)) {
            final IChatComponent lllllllllllllIIIlllIIIIIIlllIIIl = ((Iterator<IChatComponent>)lllllllllllllIIIlllIIIIIIllIlIlI).next();
            this.drawString(this.fontRendererObj, lllllllllllllIIIlllIIIIIIlllIIIl.getFormattedText(), this.field_152334_t, lllllllllllllIIIlllIIIIIIlllIIlI, GuiTwitchUserMode.lIlIIlIIlllIll[31]);
            lllllllllllllIIIlllIIIIIIlllIIlI += this.fontRendererObj.FONT_HEIGHT;
        }
        super.drawScreen(lllllllllllllIIIlllIIIIIIllIllll, lllllllllllllIIIlllIIIIIIllIlllI, lllllllllllllIIIlllIIIIIIlllIIll);
    }
    
    @Override
    public void initGui() {
        final int lllllllllllllIIIlllIIIIIlIIIllIl = this.width / GuiTwitchUserMode.lIlIIlIIlllIll[3];
        final int lllllllllllllIIIlllIIIIIlIIIllII = lllllllllllllIIIlllIIIIIlIIIllIl - GuiTwitchUserMode.lIlIIlIIlllIll[17];
        this.buttonList.add(new GuiButton(GuiTwitchUserMode.lIlIIlIIlllIll[0], lllllllllllllIIIlllIIIIIlIIIllIl * GuiTwitchUserMode.lIlIIlIIlllIll[1] + lllllllllllllIIIlllIIIIIlIIIllII / GuiTwitchUserMode.lIlIIlIIlllIll[2], this.height - GuiTwitchUserMode.lIlIIlIIlllIll[18], GuiTwitchUserMode.lIlIIlIIlllIll[17], GuiTwitchUserMode.lIlIIlIIlllIll[19], I18n.format(GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[20]], new Object[GuiTwitchUserMode.lIlIIlIIlllIll[1]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiTwitchUserMode.lIlIIlIIlllIll[1], lllllllllllllIIIlllIIIIIlIIIllIl * GuiTwitchUserMode.lIlIIlIIlllIll[0] + lllllllllllllIIIlllIIIIIlIIIllII / GuiTwitchUserMode.lIlIIlIIlllIll[2], this.height - GuiTwitchUserMode.lIlIIlIIlllIll[18], GuiTwitchUserMode.lIlIIlIIlllIll[17], GuiTwitchUserMode.lIlIIlIIlllIll[19], I18n.format(GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[21]], new Object[GuiTwitchUserMode.lIlIIlIIlllIll[1]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiTwitchUserMode.lIlIIlIIlllIll[2], lllllllllllllIIIlllIIIIIlIIIllIl * GuiTwitchUserMode.lIlIIlIIlllIll[2] + lllllllllllllIIIlllIIIIIlIIIllII / GuiTwitchUserMode.lIlIIlIIlllIll[2], this.height - GuiTwitchUserMode.lIlIIlIIlllIll[18], GuiTwitchUserMode.lIlIIlIIlllIll[17], GuiTwitchUserMode.lIlIIlIIlllIll[19], I18n.format(GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[22]], new Object[GuiTwitchUserMode.lIlIIlIIlllIll[1]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiTwitchUserMode.lIlIIlIIlllIll[5], lllllllllllllIIIlllIIIIIlIIIllIl * GuiTwitchUserMode.lIlIIlIIlllIll[1] + lllllllllllllIIIlllIIIIIlIIIllII / GuiTwitchUserMode.lIlIIlIIlllIll[2], this.height - GuiTwitchUserMode.lIlIIlIIlllIll[23], GuiTwitchUserMode.lIlIIlIIlllIll[17], GuiTwitchUserMode.lIlIIlIIlllIll[19], I18n.format(GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[19]], new Object[GuiTwitchUserMode.lIlIIlIIlllIll[1]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiTwitchUserMode.lIlIIlIIlllIll[3], lllllllllllllIIIlllIIIIIlIIIllIl * GuiTwitchUserMode.lIlIIlIIlllIll[0] + lllllllllllllIIIlllIIIIIlIIIllII / GuiTwitchUserMode.lIlIIlIIlllIll[2], this.height - GuiTwitchUserMode.lIlIIlIIlllIll[23], GuiTwitchUserMode.lIlIIlIIlllIll[17], GuiTwitchUserMode.lIlIIlIIlllIll[19], I18n.format(GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[24]], new Object[GuiTwitchUserMode.lIlIIlIIlllIll[1]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiTwitchUserMode.lIlIIlIIlllIll[4], lllllllllllllIIIlllIIIIIlIIIllIl * GuiTwitchUserMode.lIlIIlIIlllIll[2] + lllllllllllllIIIlllIIIIIlIIIllII / GuiTwitchUserMode.lIlIIlIIlllIll[2], this.height - GuiTwitchUserMode.lIlIIlIIlllIll[23], GuiTwitchUserMode.lIlIIlIIlllIll[17], GuiTwitchUserMode.lIlIIlIIlllIll[19], I18n.format(GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[25]], new Object[GuiTwitchUserMode.lIlIIlIIlllIll[1]])));
        "".length();
        int lllllllllllllIIIlllIIIIIlIIIlIll = GuiTwitchUserMode.lIlIIlIIlllIll[1];
        final long lllllllllllllIIIlllIIIIIlIIIIlII = (long)this.field_152332_r.iterator();
        "".length();
        if ("  ".length() == (0xF7 ^ 0x97 ^ (0x34 ^ 0x50))) {
            return;
        }
        while (!lllIIlIlllIIIII(((Iterator)lllllllllllllIIIlllIIIIIlIIIIlII).hasNext() ? 1 : 0)) {
            final IChatComponent lllllllllllllIIIlllIIIIIlIIIlIlI = ((Iterator<IChatComponent>)lllllllllllllIIIlllIIIIIlIIIIlII).next();
            lllllllllllllIIIlllIIIIIlIIIlIll = Math.max(lllllllllllllIIIlllIIIIIlIIIlIll, this.fontRendererObj.getStringWidth(lllllllllllllIIIlllIIIIIlIIIlIlI.getFormattedText()));
        }
        this.field_152334_t = this.width / GuiTwitchUserMode.lIlIIlIIlllIll[2] - lllllllllllllIIIlllIIIIIlIIIlIll / GuiTwitchUserMode.lIlIIlIIlllIll[2];
    }
    
    @Override
    protected void actionPerformed(final GuiButton lllllllllllllIIIlllIIIIIlIIIIIII) throws IOException {
        if (lllIIlIllIlllll(lllllllllllllIIIlllIIIIIlIIIIIII.enabled ? 1 : 0)) {
            if (lllIIlIlllIIIII(lllllllllllllIIIlllIIIIIlIIIIIII.id)) {
                this.stream.func_152917_b(String.valueOf(new StringBuilder(GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[26]]).append(this.field_152337_h.displayName)));
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            else if (lllIIlIlllIIIlI(lllllllllllllIIIlllIIIIIlIIIIIII.id, GuiTwitchUserMode.lIlIIlIIlllIll[3])) {
                this.stream.func_152917_b(String.valueOf(new StringBuilder(GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[27]]).append(this.field_152337_h.displayName)));
                "".length();
                if ("   ".length() == ((0x8 ^ 0x26) & ~(0x82 ^ 0xAC))) {
                    return;
                }
            }
            else if (lllIIlIlllIIIlI(lllllllllllllIIIlllIIIIIlIIIIIII.id, GuiTwitchUserMode.lIlIIlIIlllIll[2])) {
                this.stream.func_152917_b(String.valueOf(new StringBuilder(GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[28]]).append(this.field_152337_h.displayName)));
                "".length();
                if (("  ".length() & ~"  ".length()) != 0x0) {
                    return;
                }
            }
            else if (lllIIlIlllIIIlI(lllllllllllllIIIlllIIIIIlIIIIIII.id, GuiTwitchUserMode.lIlIIlIIlllIll[4])) {
                this.stream.func_152917_b(String.valueOf(new StringBuilder(GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[29]]).append(this.field_152337_h.displayName)));
                "".length();
                if (-" ".length() > -" ".length()) {
                    return;
                }
            }
            else if (lllIIlIlllIIIlI(lllllllllllllIIIlllIIIIIlIIIIIII.id, GuiTwitchUserMode.lIlIIlIIlllIll[0])) {
                this.stream.func_152917_b(String.valueOf(new StringBuilder(GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[30]]).append(this.field_152337_h.displayName)));
            }
            this.mc.displayGuiScreen(null);
        }
    }
    
    private static boolean lllIIlIlllIIIIl(final Object lllllllllllllIIIlllIIIIIIIlIlIll, final Object lllllllllllllIIIlllIIIIIIIlIlIlI) {
        return lllllllllllllIIIlllIIIIIIIlIlIll == lllllllllllllIIIlllIIIIIIIlIlIlI;
    }
    
    private static boolean lllIIlIlllIIIlI(final int lllllllllllllIIIlllIIIIIIIllIlIl, final int lllllllllllllIIIlllIIIIIIIllIlII) {
        return lllllllllllllIIIlllIIIIIIIllIlIl == lllllllllllllIIIlllIIIIIIIllIlII;
    }
    
    private static String lllIIlIllIIlIIl(final String lllllllllllllIIIlllIIIIIIlIlIlIl, final String lllllllllllllIIIlllIIIIIIlIlIlII) {
        try {
            final SecretKeySpec lllllllllllllIIIlllIIIIIIlIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIIIIIIlIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlllIIIIIIlIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlllIIIIIIlIlIlll.init(GuiTwitchUserMode.lIlIIlIIlllIll[2], lllllllllllllIIIlllIIIIIIlIllIII);
            return new String(lllllllllllllIIIlllIIIIIIlIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIIIIIIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllIIIIIIlIlIllI) {
            lllllllllllllIIIlllIIIIIIlIlIllI.printStackTrace();
            return null;
        }
    }
    
    static {
        lllIIlIllIlllII();
        lllIIlIllIlIIlI();
        field_152331_a = EnumChatFormatting.DARK_GREEN;
        field_152335_f = EnumChatFormatting.RED;
        field_152336_g = EnumChatFormatting.DARK_PURPLE;
    }
    
    private static boolean lllIIlIlllIIIII(final int lllllllllllllIIIlllIIIIIIIlIIlII) {
        return lllllllllllllIIIlllIIIIIIIlIIlII == 0;
    }
    
    private static boolean lllIIlIllIllllI(final Object lllllllllllllIIIlllIIIIIIIlIlllI) {
        return lllllllllllllIIIlllIIIIIIIlIlllI != null;
    }
    
    public static List<IChatComponent> func_152328_a(final Set<ChatUserMode> lllllllllllllIIIlllIIIIIlIllIllI, final Set<ChatUserSubscription> lllllllllllllIIIlllIIIIIlIllIlIl, final IStream lllllllllllllIIIlllIIIIIllIIIIII) {
        String func_152921_C;
        if (lllIIlIllIlllIl(lllllllllllllIIIlllIIIIIllIIIIII)) {
            func_152921_C = null;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            func_152921_C = lllllllllllllIIIlllIIIIIllIIIIII.func_152921_C();
        }
        final String lllllllllllllIIIlllIIIIIlIllllll = func_152921_C;
        int n;
        if (lllIIlIllIllllI(lllllllllllllIIIlllIIIIIllIIIIII) && lllIIlIllIlllll(lllllllllllllIIIlllIIIIIllIIIIII.func_152927_B() ? 1 : 0)) {
            n = GuiTwitchUserMode.lIlIIlIIlllIll[0];
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        else {
            n = GuiTwitchUserMode.lIlIIlIIlllIll[1];
        }
        final boolean lllllllllllllIIIlllIIIIIlIlllllI = n != 0;
        final List<IChatComponent> lllllllllllllIIIlllIIIIIlIllllIl = (List<IChatComponent>)Lists.newArrayList();
        double lllllllllllllIIIlllIIIIIlIlIllll = (double)lllllllllllllIIIlllIIIIIlIllIllI.iterator();
        "".length();
        if (((132 + 81 - 177 + 177 ^ 112 + 111 - 105 + 23) & (38 + 95 - 83 + 197 ^ 36 + 111 - 6 + 34 ^ -" ".length())) != 0x0) {
            return null;
        }
        while (!lllIIlIlllIIIII(((Iterator)lllllllllllllIIIlllIIIIIlIlIllll).hasNext() ? 1 : 0)) {
            final ChatUserMode lllllllllllllIIIlllIIIIIlIllllII = ((Iterator<ChatUserMode>)lllllllllllllIIIlllIIIIIlIlIllll).next();
            final IChatComponent lllllllllllllIIIlllIIIIIlIlllIll = func_152329_a(lllllllllllllIIIlllIIIIIlIllllII, lllllllllllllIIIlllIIIIIlIllllll, lllllllllllllIIIlllIIIIIlIlllllI);
            if (lllIIlIllIllllI(lllllllllllllIIIlllIIIIIlIlllIll)) {
                final IChatComponent lllllllllllllIIIlllIIIIIlIlllIlI = new ChatComponentText(GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[1]]);
                lllllllllllllIIIlllIIIIIlIlllIlI.appendSibling(lllllllllllllIIIlllIIIIIlIlllIll);
                "".length();
                lllllllllllllIIIlllIIIIIlIllllIl.add(lllllllllllllIIIlllIIIIIlIlllIlI);
                "".length();
            }
        }
        lllllllllllllIIIlllIIIIIlIlIllll = (double)lllllllllllllIIIlllIIIIIlIllIlIl.iterator();
        "".length();
        if (-"  ".length() > 0) {
            return null;
        }
        while (!lllIIlIlllIIIII(((Iterator)lllllllllllllIIIlllIIIIIlIlIllll).hasNext() ? 1 : 0)) {
            final ChatUserSubscription lllllllllllllIIIlllIIIIIlIlllIIl = ((Iterator<ChatUserSubscription>)lllllllllllllIIIlllIIIIIlIlIllll).next();
            final IChatComponent lllllllllllllIIIlllIIIIIlIlllIII = func_152330_a(lllllllllllllIIIlllIIIIIlIlllIIl, lllllllllllllIIIlllIIIIIlIllllll, lllllllllllllIIIlllIIIIIlIlllllI);
            if (lllIIlIllIllllI(lllllllllllllIIIlllIIIIIlIlllIII)) {
                final IChatComponent lllllllllllllIIIlllIIIIIlIllIlll = new ChatComponentText(GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[0]]);
                lllllllllllllIIIlllIIIIIlIllIlll.appendSibling(lllllllllllllIIIlllIIIIIlIlllIII);
                "".length();
                lllllllllllllIIIlllIIIIIlIllllIl.add(lllllllllllllIIIlllIIIIIlIllIlll);
                "".length();
            }
        }
        return lllllllllllllIIIlllIIIIIlIllllIl;
    }
    
    private static String lllIIlIllIIlIII(String lllllllllllllIIIlllIIIIIIlIIIIII, final String lllllllllllllIIIlllIIIIIIlIIIlII) {
        lllllllllllllIIIlllIIIIIIlIIIIII = new String(Base64.getDecoder().decode(lllllllllllllIIIlllIIIIIIlIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlllIIIIIIlIIIIll = new StringBuilder();
        final char[] lllllllllllllIIIlllIIIIIIlIIIIlI = lllllllllllllIIIlllIIIIIIlIIIlII.toCharArray();
        int lllllllllllllIIIlllIIIIIIlIIIIIl = GuiTwitchUserMode.lIlIIlIIlllIll[1];
        final Exception lllllllllllllIIIlllIIIIIIIlllIll = (Object)lllllllllllllIIIlllIIIIIIlIIIIII.toCharArray();
        final String lllllllllllllIIIlllIIIIIIIlllIlI = (String)lllllllllllllIIIlllIIIIIIIlllIll.length;
        short lllllllllllllIIIlllIIIIIIIlllIIl = (short)GuiTwitchUserMode.lIlIIlIIlllIll[1];
        while (lllIIlIlllIIIll(lllllllllllllIIIlllIIIIIIIlllIIl, (int)lllllllllllllIIIlllIIIIIIIlllIlI)) {
            final char lllllllllllllIIIlllIIIIIIlIIIllI = lllllllllllllIIIlllIIIIIIIlllIll[lllllllllllllIIIlllIIIIIIIlllIIl];
            lllllllllllllIIIlllIIIIIIlIIIIll.append((char)(lllllllllllllIIIlllIIIIIIlIIIllI ^ lllllllllllllIIIlllIIIIIIlIIIIlI[lllllllllllllIIIlllIIIIIIlIIIIIl % lllllllllllllIIIlllIIIIIIlIIIIlI.length]));
            "".length();
            ++lllllllllllllIIIlllIIIIIIlIIIIIl;
            ++lllllllllllllIIIlllIIIIIIIlllIIl;
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlllIIIIIIlIIIIll);
    }
    
    private static void lllIIlIllIlllII() {
        (lIlIIlIIlllIll = new int[34])[0] = " ".length();
        GuiTwitchUserMode.lIlIIlIIlllIll[1] = ((0xF ^ 0x28) & ~(0x32 ^ 0x15));
        GuiTwitchUserMode.lIlIIlIIlllIll[2] = "  ".length();
        GuiTwitchUserMode.lIlIIlIIlllIll[3] = "   ".length();
        GuiTwitchUserMode.lIlIIlIIlllIll[4] = (0x70 ^ 0x74);
        GuiTwitchUserMode.lIlIIlIIlllIll[5] = (0x7B ^ 0x7E);
        GuiTwitchUserMode.lIlIIlIIlllIll[6] = (135 + 122 - 178 + 118 ^ 21 + 1 + 97 + 76);
        GuiTwitchUserMode.lIlIIlIIlllIll[7] = (152 + 66 - 114 + 83 ^ 99 + 18 - 52 + 123);
        GuiTwitchUserMode.lIlIIlIIlllIll[8] = (0xC9 ^ 0x96 ^ (0xEE ^ 0xB9));
        GuiTwitchUserMode.lIlIIlIIlllIll[9] = (0xB4 ^ 0xBD);
        GuiTwitchUserMode.lIlIIlIIlllIll[10] = (0x8C ^ 0xB0 ^ (0x6D ^ 0x5B));
        GuiTwitchUserMode.lIlIIlIIlllIll[11] = (0x3A ^ 0x31);
        GuiTwitchUserMode.lIlIIlIIlllIll[12] = (28 + 75 - 85 + 114 ^ 74 + 62 - 88 + 88);
        GuiTwitchUserMode.lIlIIlIIlllIll[13] = (0xA7 ^ 0xAA);
        GuiTwitchUserMode.lIlIIlIIlllIll[14] = (134 + 127 - 258 + 186 ^ 123 + 11 - 5 + 50);
        GuiTwitchUserMode.lIlIIlIIlllIll[15] = (0xBD ^ 0xB2);
        GuiTwitchUserMode.lIlIIlIIlllIll[16] = (0xFB ^ 0xA5 ^ (0x2B ^ 0x65));
        GuiTwitchUserMode.lIlIIlIIlllIll[17] = 19 + 128 - 122 + 105;
        GuiTwitchUserMode.lIlIIlIIlllIll[18] = (152 + 56 - 152 + 150 ^ 113 + 65 - 135 + 93);
        GuiTwitchUserMode.lIlIIlIIlllIll[19] = (0xF ^ 0x69 ^ (0x39 ^ 0x4B));
        GuiTwitchUserMode.lIlIIlIIlllIll[20] = (17 + 104 - 111 + 132 ^ 121 + 93 - 141 + 86);
        GuiTwitchUserMode.lIlIIlIIlllIll[21] = (0x1C ^ 0x24 ^ (0x63 ^ 0x49));
        GuiTwitchUserMode.lIlIIlIIlllIll[22] = (0 + 171 - 132 + 140 ^ 48 + 61 + 5 + 46);
        GuiTwitchUserMode.lIlIIlIIlllIll[23] = (0x3F ^ 0x12);
        GuiTwitchUserMode.lIlIIlIIlllIll[24] = (0x69 ^ 0x7C);
        GuiTwitchUserMode.lIlIIlIIlllIll[25] = (0x15 ^ 0x3);
        GuiTwitchUserMode.lIlIIlIIlllIll[26] = (0x5D ^ 0x4A);
        GuiTwitchUserMode.lIlIIlIIlllIll[27] = (0x7B ^ 0x3B ^ (0x79 ^ 0x21));
        GuiTwitchUserMode.lIlIIlIIlllIll[28] = (0x1F ^ 0x6);
        GuiTwitchUserMode.lIlIIlIIlllIll[29] = (157 + 121 - 145 + 50 ^ 26 + 153 - 141 + 135);
        GuiTwitchUserMode.lIlIIlIIlllIll[30] = (0x37 ^ 0x2C);
        GuiTwitchUserMode.lIlIIlIIlllIll[31] = (-" ".length() & (-1 & 0xFFFFFF));
        GuiTwitchUserMode.lIlIIlIIlllIll[32] = (0x94 ^ 0xA1 ^ (0xD4 ^ 0xB1));
        GuiTwitchUserMode.lIlIIlIIlllIll[33] = (32 + 110 - 54 + 101 ^ 46 + 145 - 48 + 18);
    }
    
    private static boolean lllIIlIlllIIIll(final int lllllllllllllIIIlllIIIIIIIllIIIl, final int lllllllllllllIIIlllIIIIIIIllIIII) {
        return lllllllllllllIIIlllIIIIIIIllIIIl < lllllllllllllIIIlllIIIIIIIllIIII;
    }
    
    private static boolean lllIIlIllIlllIl(final Object lllllllllllllIIIlllIIIIIIIlIlIII) {
        return lllllllllllllIIIlllIIIIIIIlIlIII == null;
    }
    
    private static String lllIIlIllIIllIl(final String lllllllllllllIIIlllIIIIIIllIIIII, final String lllllllllllllIIIlllIIIIIIlIlllll) {
        try {
            final SecretKeySpec lllllllllllllIIIlllIIIIIIllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIIIIIIlIlllll.getBytes(StandardCharsets.UTF_8)), GuiTwitchUserMode.lIlIIlIIlllIll[8]), "DES");
            final Cipher lllllllllllllIIIlllIIIIIIllIIlII = Cipher.getInstance("DES");
            lllllllllllllIIIlllIIIIIIllIIlII.init(GuiTwitchUserMode.lIlIIlIIlllIll[2], lllllllllllllIIIlllIIIIIIllIIlIl);
            return new String(lllllllllllllIIIlllIIIIIIllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIIIIIIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllIIIIIIllIIIll) {
            lllllllllllllIIIlllIIIIIIllIIIll.printStackTrace();
            return null;
        }
    }
    
    public GuiTwitchUserMode(final IStream lllllllllllllIIIlllIIIIIllIlIIIl, final ChatUserInfo lllllllllllllIIIlllIIIIIllIIllIl) {
        this.field_152332_r = (List<IChatComponent>)Lists.newArrayList();
        this.stream = lllllllllllllIIIlllIIIIIllIlIIIl;
        this.field_152337_h = lllllllllllllIIIlllIIIIIllIIllIl;
        this.field_152338_i = new ChatComponentText(lllllllllllllIIIlllIIIIIllIIllIl.displayName);
        this.field_152332_r.addAll(func_152328_a(lllllllllllllIIIlllIIIIIllIIllIl.modes, lllllllllllllIIIlllIIIIIllIIllIl.subscriptions, lllllllllllllIIIlllIIIIIllIlIIIl));
        "".length();
    }
    
    private static boolean lllIIlIllIlllll(final int lllllllllllllIIIlllIIIIIIIlIIllI) {
        return lllllllllllllIIIlllIIIIIIIlIIllI != 0;
    }
    
    public static IChatComponent func_152329_a(final ChatUserMode lllllllllllllIIIlllIIIIIlIIlllII, final String lllllllllllllIIIlllIIIIIlIIllIll, final boolean lllllllllllllIIIlllIIIIIlIIlIllI) {
        IChatComponent lllllllllllllIIIlllIIIIIlIIllIIl = null;
        if (lllIIlIlllIIIIl(lllllllllllllIIIlllIIIIIlIIlllII, ChatUserMode.TTV_CHAT_USERMODE_ADMINSTRATOR)) {
            lllllllllllllIIIlllIIIIIlIIllIIl = new ChatComponentTranslation(GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[6]], new Object[GuiTwitchUserMode.lIlIIlIIlllIll[1]]);
            lllllllllllllIIIlllIIIIIlIIllIIl.getChatStyle().setColor(GuiTwitchUserMode.field_152336_g);
            "".length();
            "".length();
            if (((0x4A ^ 0x77 ^ (0xB5 ^ 0x92)) & (68 + 145 - 53 + 18 ^ 29 + 75 - 3 + 67 ^ -" ".length())) > "   ".length()) {
                return null;
            }
        }
        else if (lllIIlIlllIIIIl(lllllllllllllIIIlllIIIIIlIIlllII, ChatUserMode.TTV_CHAT_USERMODE_BANNED)) {
            if (lllIIlIllIlllIl(lllllllllllllIIIlllIIIIIlIIllIll)) {
                lllllllllllllIIIlllIIIIIlIIllIIl = new ChatComponentTranslation(GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[7]], new Object[GuiTwitchUserMode.lIlIIlIIlllIll[1]]);
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else if (lllIIlIllIlllll(lllllllllllllIIIlllIIIIIlIIlIllI ? 1 : 0)) {
                lllllllllllllIIIlllIIIIIlIIllIIl = new ChatComponentTranslation(GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[8]], new Object[GuiTwitchUserMode.lIlIIlIIlllIll[1]]);
                "".length();
                if ("   ".length() < ((0xF0 ^ 0x8B ^ (0x2D ^ 0x41)) & (43 + 15 + 32 + 41 ^ 3 + 67 + 42 + 36 ^ -" ".length()))) {
                    return null;
                }
            }
            else {
                final String lllllllllllllIlIIlIlllIIlIIIIIlI = GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[9]];
                final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[GuiTwitchUserMode.lIlIIlIIlllIll[0]];
                lllllllllllllIlIIlIlllIIlIIIIIIl[GuiTwitchUserMode.lIlIIlIIlllIll[1]] = lllllllllllllIIIlllIIIIIlIIllIll;
                lllllllllllllIIIlllIIIIIlIIllIIl = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl);
            }
            lllllllllllllIIIlllIIIIIlIIllIIl.getChatStyle().setColor(GuiTwitchUserMode.field_152335_f);
            "".length();
            "".length();
            if (-(0x5F ^ 0x18 ^ (0xD2 ^ 0x91)) > 0) {
                return null;
            }
        }
        else if (lllIIlIlllIIIIl(lllllllllllllIIIlllIIIIIlIIlllII, ChatUserMode.TTV_CHAT_USERMODE_BROADCASTER)) {
            if (lllIIlIllIlllIl(lllllllllllllIIIlllIIIIIlIIllIll)) {
                lllllllllllllIIIlllIIIIIlIIllIIl = new ChatComponentTranslation(GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[10]], new Object[GuiTwitchUserMode.lIlIIlIIlllIll[1]]);
                "".length();
                if (" ".length() < 0) {
                    return null;
                }
            }
            else if (lllIIlIllIlllll(lllllllllllllIIIlllIIIIIlIIlIllI ? 1 : 0)) {
                lllllllllllllIIIlllIIIIIlIIllIIl = new ChatComponentTranslation(GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[11]], new Object[GuiTwitchUserMode.lIlIIlIIlllIll[1]]);
                "".length();
                if ((0x30 ^ 0x34) < "  ".length()) {
                    return null;
                }
            }
            else {
                lllllllllllllIIIlllIIIIIlIIllIIl = new ChatComponentTranslation(GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[12]], new Object[GuiTwitchUserMode.lIlIIlIIlllIll[1]]);
            }
            lllllllllllllIIIlllIIIIIlIIllIIl.getChatStyle().setColor(GuiTwitchUserMode.field_152331_a);
            "".length();
            "".length();
            if (" ".length() >= (0x4C ^ 0x4 ^ (0x77 ^ 0x3B))) {
                return null;
            }
        }
        else if (lllIIlIlllIIIIl(lllllllllllllIIIlllIIIIIlIIlllII, ChatUserMode.TTV_CHAT_USERMODE_MODERATOR)) {
            if (lllIIlIllIlllIl(lllllllllllllIIIlllIIIIIlIIllIll)) {
                lllllllllllllIIIlllIIIIIlIIllIIl = new ChatComponentTranslation(GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[13]], new Object[GuiTwitchUserMode.lIlIIlIIlllIll[1]]);
                "".length();
                if ((0x6D ^ 0x76 ^ (0xA ^ 0x15)) == " ".length()) {
                    return null;
                }
            }
            else if (lllIIlIllIlllll(lllllllllllllIIIlllIIIIIlIIlIllI ? 1 : 0)) {
                lllllllllllllIIIlllIIIIIlIIllIIl = new ChatComponentTranslation(GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[14]], new Object[GuiTwitchUserMode.lIlIIlIIlllIll[1]]);
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                final String lllllllllllllIlIIlIlllIIlIIIIIlI2 = GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[15]];
                final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl2 = new Object[GuiTwitchUserMode.lIlIIlIIlllIll[0]];
                lllllllllllllIlIIlIlllIIlIIIIIIl2[GuiTwitchUserMode.lIlIIlIIlllIll[1]] = lllllllllllllIIIlllIIIIIlIIllIll;
                lllllllllllllIIIlllIIIIIlIIllIIl = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI2, lllllllllllllIlIIlIlllIIlIIIIIIl2);
            }
            lllllllllllllIIIlllIIIIIlIIllIIl.getChatStyle().setColor(GuiTwitchUserMode.field_152331_a);
            "".length();
            "".length();
            if ((0x36 ^ 0x3E ^ (0xBC ^ 0xB0)) == 0x0) {
                return null;
            }
        }
        else if (lllIIlIlllIIIIl(lllllllllllllIIIlllIIIIIlIIlllII, ChatUserMode.TTV_CHAT_USERMODE_STAFF)) {
            lllllllllllllIIIlllIIIIIlIIllIIl = new ChatComponentTranslation(GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[16]], new Object[GuiTwitchUserMode.lIlIIlIIlllIll[1]]);
            lllllllllllllIIIlllIIIIIlIIllIIl.getChatStyle().setColor(GuiTwitchUserMode.field_152336_g);
            "".length();
        }
        return lllllllllllllIIIlllIIIIIlIIllIIl;
    }
    
    private static void lllIIlIllIlIIlI() {
        (lIlIIlIIlIlIll = new String[GuiTwitchUserMode.lIlIIlIIlllIll[33]])[GuiTwitchUserMode.lIlIIlIIlllIll[1]] = lllIIlIllIIlIII("eGI=", "UBEdR");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[0]] = lllIIlIllIIlIIl("EBjyQAgKgXc=", "mheuB");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[2]] = lllIIlIllIIlIII("KTwXIw83ZhA1CyhmFjMMKSsXLx4uIQooQCk9BzUNKCEHIxw=", "ZHeFn");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[3]] = lllIIlIllIIlIIl("6OfOdPdVNTIZnMzNXTIcvehmUNk6xo2obkJg90txtCgQMnoFgIbMkb5ZeojKApPE", "XojLl");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[4]] = lllIIlIllIIllIl("wcq4ndwfs+izIp89I7ZCVUfVDMbw345Bgi3shvkIV7A4Iyp+7Jcm+TVMa5LqrUsT", "slIif");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[5]] = lllIIlIllIIlIIl("nZJyrjLE9ya6SE+i6iOGhRguIxCHuZJHJaUm1RNF0F4=", "kfoRP");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[6]] = lllIIlIllIIllIl("nEdD7Cwnc0ZOHnYN0TFi1zJ4DMcqlA99pde9Idjbo8s=", "vFbBP");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[7]] = lllIIlIllIIllIl("rbBnbcbJIunWi3tahakcIGyzzNkfADk+", "gIuxG");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[8]] = lllIIlIllIIllIl("tuMEa6YC5HynCfUyIuKHg44RfJoZhygGqZR1XA3P4X8=", "ELykZ");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[9]] = lllIIlIllIIlIIl("NTxnftmRll5EdkxKSlomtgVPrvBwGNbmmhrs6vLUAIw=", "qnZyi");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[10]] = lllIIlIllIIlIII("HhoALAcAQAc6Ax9AHyYCCEAQOwkMChEoFRkLAA==", "mnrIf");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[11]] = lllIIlIllIIllIl("WrOmIagNrK8XRDkvyFu//YpsyS18iIoFxx9zvYDaMhHR0V5EkjHxGg==", "ILewT");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[12]] = lllIIlIllIIlIII("BzYUDgwZbBMYCAZsCwQJEWwEGQIVJgUKHgAnFEUCACoDGQ==", "tBfkm");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[13]] = lllIIlIllIIlIII("NDoHNjcqYAAgMzVgGDwyImAYPDIiPBQnOTU=", "GNuSV");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[14]] = lllIIlIllIIlIII("FQAYJwALWh8xBBRaBy0FA1oHLQUDBgs2DhRaGScNAA==", "ftjBa");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[15]] = lllIIlIllIIlIII("MBcREyQuTRYFIDFNDhkhJk0OGSEmEQICKjFNDAItJhE=", "CccvE");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[16]] = lllIIlIllIIllIl("Ez0ApG22dqwmATAyBJfsqaVncKIhCINm", "EEJcX");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[20]] = lllIIlIllIIlIII("HR0CFhIDRwUAFhwAHhUcQB0ZHhYBHAQ=", "nipss");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[21]] = lllIIlIllIIlIIl("HQWgAFO0BHR4B2CaDj51GWiTROyA0V3b", "qtPKv");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[22]] = lllIIlIllIIlIIl("n8f5lQHReOZec9m24TOnCN+USfPEJrCF", "lroKb");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[19]] = lllIIlIllIIllIl("QRgkeTr8i4fdETkibj4qlA==", "pRUza");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[24]] = lllIIlIllIIlIIl("JhY6IeIQB6rfqa8roL9KGQLlxFC6X/5U", "JcIkY");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[25]] = lllIIlIllIIlIII("JD0fHRU6ZxgLESUgAx4beTwDFRsz", "WImxt");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[26]] = lllIIlIllIIlIIl("zdm0kuDejz8=", "ChLrw");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[27]] = lllIIlIllIIlIIl("Gd2lpJa9P1o=", "NPNHY");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[28]] = lllIIlIllIIllIl("l+w50VcH1po=", "ZLSbO");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[29]] = lllIIlIllIIlIIl("+XTLuWlm6qg=", "ImDEB");
        GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[30]] = lllIIlIllIIlIIl("BAZwHHzZtPRe/h8svgsnXQ==", "EvMEl");
    }
    
    public static IChatComponent func_152330_a(final ChatUserSubscription lllllllllllllIIIlllIIIIIlIlIIlII, final String lllllllllllllIIIlllIIIIIlIlIIIll, final boolean lllllllllllllIIIlllIIIIIlIlIIllI) {
        IChatComponent lllllllllllllIIIlllIIIIIlIlIIlIl = null;
        if (lllIIlIlllIIIIl(lllllllllllllIIIlllIIIIIlIlIIlII, ChatUserSubscription.TTV_CHAT_USERSUB_SUBSCRIBER)) {
            if (lllIIlIllIlllIl(lllllllllllllIIIlllIIIIIlIlIIIll)) {
                lllllllllllllIIIlllIIIIIlIlIIlIl = new ChatComponentTranslation(GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[2]], new Object[GuiTwitchUserMode.lIlIIlIIlllIll[1]]);
                "".length();
                if ("  ".length() < -" ".length()) {
                    return null;
                }
            }
            else if (lllIIlIllIlllll(lllllllllllllIIIlllIIIIIlIlIIllI ? 1 : 0)) {
                lllllllllllllIIIlllIIIIIlIlIIlIl = new ChatComponentTranslation(GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[3]], new Object[GuiTwitchUserMode.lIlIIlIIlllIll[1]]);
                "".length();
                if ("  ".length() <= -" ".length()) {
                    return null;
                }
            }
            else {
                final String lllllllllllllIlIIlIlllIIlIIIIIlI = GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[4]];
                final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[GuiTwitchUserMode.lIlIIlIIlllIll[0]];
                lllllllllllllIlIIlIlllIIlIIIIIIl[GuiTwitchUserMode.lIlIIlIIlllIll[1]] = lllllllllllllIIIlllIIIIIlIlIIIll;
                lllllllllllllIIIlllIIIIIlIlIIlIl = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl);
            }
            lllllllllllllIIIlllIIIIIlIlIIlIl.getChatStyle().setColor(GuiTwitchUserMode.field_152331_a);
            "".length();
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        else if (lllIIlIlllIIIIl(lllllllllllllIIIlllIIIIIlIlIIlII, ChatUserSubscription.TTV_CHAT_USERSUB_TURBO)) {
            lllllllllllllIIIlllIIIIIlIlIIlIl = new ChatComponentTranslation(GuiTwitchUserMode.lIlIIlIIlIlIll[GuiTwitchUserMode.lIlIIlIIlllIll[5]], new Object[GuiTwitchUserMode.lIlIIlIIlllIll[1]]);
            lllllllllllllIIIlllIIIIIlIlIIlIl.getChatStyle().setColor(GuiTwitchUserMode.field_152336_g);
            "".length();
        }
        return lllllllllllllIIIlllIIIIIlIlIIlIl;
    }
}
