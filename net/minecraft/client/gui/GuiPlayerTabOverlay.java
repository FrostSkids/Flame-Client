// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import com.google.common.collect.ComparisonChain;
import net.minecraft.scoreboard.Team;
import net.minecraft.scoreboard.ScorePlayerTeam;
import java.util.Arrays;
import net.minecraft.entity.player.EntityPlayer;
import com.mojang.authlib.GameProfile;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.world.WorldSettings;
import net.minecraft.entity.player.EnumPlayerModelParts;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.scoreboard.IScoreObjectiveCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import java.util.Comparator;
import net.minecraft.client.renderer.GlStateManager;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.network.NetworkPlayerInfo;
import com.google.common.collect.Ordering;
import net.minecraft.client.Minecraft;
import net.minecraft.util.IChatComponent;

public class GuiPlayerTabOverlay extends Gui
{
    private static final /* synthetic */ int[] lllIlIlIlIllll;
    private /* synthetic */ IChatComponent footer;
    private final /* synthetic */ GuiIngame guiIngame;
    private final /* synthetic */ Minecraft mc;
    private static final /* synthetic */ String[] lllIlIlIlIlIII;
    private static final /* synthetic */ Ordering<NetworkPlayerInfo> field_175252_a;
    private /* synthetic */ long lastTimeOpened;
    private /* synthetic */ boolean isBeingRendered;
    private /* synthetic */ IChatComponent header;
    
    private static boolean lIlIIIllIIIlllIl(final int llllllllllllIlIllIllIIIIlllIlIIl) {
        return llllllllllllIlIllIllIIIIlllIlIIl <= 0;
    }
    
    private static String lIlIIIlIlllllIIl(final String llllllllllllIlIllIllIIIlIIIlIlII, final String llllllllllllIlIllIllIIIlIIIlIIll) {
        try {
            final SecretKeySpec llllllllllllIlIllIllIIIlIIIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIllIIIlIIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIllIIIlIIIlIllI = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIllIIIlIIIlIllI.init(GuiPlayerTabOverlay.lllIlIlIlIllll[8], llllllllllllIlIllIllIIIlIIIlIlll);
            return new String(llllllllllllIlIllIllIIIlIIIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIllIIIlIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIllIIIlIIIlIlIl) {
            llllllllllllIlIllIllIIIlIIIlIlIl.printStackTrace();
            return null;
        }
    }
    
    private static int lIlIIIllIIIllIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    protected void drawPing(final int llllllllllllIlIllIllIIIlIlllIlII, final int llllllllllllIlIllIllIIIlIlllIIll, final int llllllllllllIlIllIllIIIlIllIlIll, final NetworkPlayerInfo llllllllllllIlIllIllIIIlIlllIIIl) {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(GuiPlayerTabOverlay.icons);
        final int llllllllllllIlIllIllIIIlIlllIIII = GuiPlayerTabOverlay.lllIlIlIlIllll[0];
        int llllllllllllIlIllIllIIIlIllIllll = GuiPlayerTabOverlay.lllIlIlIlIllll[0];
        if (lIlIIIllIIIllIlI(llllllllllllIlIllIllIIIlIlllIIIl.getResponseTime())) {
            llllllllllllIlIllIllIIIlIllIllll = GuiPlayerTabOverlay.lllIlIlIlIllll[9];
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
        else if (lIlIIIllIIIlIlll(llllllllllllIlIllIllIIIlIlllIIIl.getResponseTime(), GuiPlayerTabOverlay.lllIlIlIlIllll[17])) {
            llllllllllllIlIllIllIIIlIllIllll = GuiPlayerTabOverlay.lllIlIlIlIllll[0];
            "".length();
            if (-"  ".length() > 0) {
                return;
            }
        }
        else if (lIlIIIllIIIlIlll(llllllllllllIlIllIllIIIlIlllIIIl.getResponseTime(), GuiPlayerTabOverlay.lllIlIlIlIllll[18])) {
            llllllllllllIlIllIllIIIlIllIllll = GuiPlayerTabOverlay.lllIlIlIlIllll[2];
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        else if (lIlIIIllIIIlIlll(llllllllllllIlIllIllIIIlIlllIIIl.getResponseTime(), GuiPlayerTabOverlay.lllIlIlIlIllll[19])) {
            llllllllllllIlIllIllIIIlIllIllll = GuiPlayerTabOverlay.lllIlIlIlIllll[8];
            "".length();
            if (((0xC2 ^ 0xA2) & ~(0xDE ^ 0xBE)) <= -" ".length()) {
                return;
            }
        }
        else if (lIlIIIllIIIlIlll(llllllllllllIlIllIllIIIlIlllIIIl.getResponseTime(), GuiPlayerTabOverlay.lllIlIlIlIllll[20])) {
            llllllllllllIlIllIllIIIlIllIllll = GuiPlayerTabOverlay.lllIlIlIlIllll[21];
            "".length();
            if ("   ".length() <= "  ".length()) {
                return;
            }
        }
        else {
            llllllllllllIlIllIllIIIlIllIllll = GuiPlayerTabOverlay.lllIlIlIlIllll[22];
        }
        this.zLevel += 100.0f;
        this.drawTexturedModalRect(llllllllllllIlIllIllIIIlIlllIIll + llllllllllllIlIllIllIIIlIlllIlII - GuiPlayerTabOverlay.lllIlIlIlIllll[23], llllllllllllIlIllIllIIIlIllIlIll, GuiPlayerTabOverlay.lllIlIlIlIllll[0] + llllllllllllIlIllIllIIIlIlllIIII * GuiPlayerTabOverlay.lllIlIlIlIllll[10], GuiPlayerTabOverlay.lllIlIlIlIllll[24] + llllllllllllIlIllIllIIIlIllIllll * GuiPlayerTabOverlay.lllIlIlIlIllll[12], GuiPlayerTabOverlay.lllIlIlIlIllll[10], GuiPlayerTabOverlay.lllIlIlIlIllll[12]);
        this.zLevel -= 100.0f;
    }
    
    private static void lIlIIIllIIIlIIII() {
        (lllIlIlIlIllll = new int[34])[0] = ((0xF ^ 0x7F ^ (0xC7 ^ 0xBF)) & (0x7 ^ 0x5C ^ (0x4A ^ 0x19) ^ -" ".length()));
        GuiPlayerTabOverlay.lllIlIlIlIllll[1] = (0x45 ^ 0x0 ^ (0x26 ^ 0x33));
        GuiPlayerTabOverlay.lllIlIlIlIllll[2] = " ".length();
        GuiPlayerTabOverlay.lllIlIlIlIllll[3] = (0xEE ^ 0x8C ^ (0x3B ^ 0x4D));
        GuiPlayerTabOverlay.lllIlIlIlIllll[4] = (190 + 173 - 199 + 81 ^ 13 + 101 - 29 + 90);
        GuiPlayerTabOverlay.lllIlIlIlIllll[5] = (0x5C ^ 0x55);
        GuiPlayerTabOverlay.lllIlIlIlIllll[6] = (0x77 ^ 0x7A);
        GuiPlayerTabOverlay.lllIlIlIlIllll[7] = (0x4A ^ 0x78);
        GuiPlayerTabOverlay.lllIlIlIlIllll[8] = "  ".length();
        GuiPlayerTabOverlay.lllIlIlIlIllll[9] = (0xAA ^ 0xAF);
        GuiPlayerTabOverlay.lllIlIlIlIllll[10] = (0x5B ^ 0x51);
        GuiPlayerTabOverlay.lllIlIlIlIllll[11] = -" ".length();
        GuiPlayerTabOverlay.lllIlIlIlIllll[12] = (0xEB ^ 0xA8 ^ (0xF3 ^ 0xB8));
        GuiPlayerTabOverlay.lllIlIlIlIllll[13] = (-1 & 0x20FFFFFF);
        GuiPlayerTabOverlay.lllIlIlIlIllll[14] = (-(0xFFFFFDFF & 0x761E) & (0xFFFFFF7F & 0x779F));
        GuiPlayerTabOverlay.lllIlIlIlIllll[15] = (-(0xF2 ^ 0x97) & (0xFFFFB7F7 & 0x4B6F));
        GuiPlayerTabOverlay.lllIlIlIlIllll[16] = -(0xFFFFAAD9 & 0x6F005527);
        GuiPlayerTabOverlay.lllIlIlIlIllll[17] = (0xCA ^ 0xB4) + (0 + 52 + 27 + 50) - (12 + 99 + 27 + 55) + (0xCF ^ 0x97);
        GuiPlayerTabOverlay.lllIlIlIlIllll[18] = (0xFFFF8B6E & 0x75BD);
        GuiPlayerTabOverlay.lllIlIlIlIllll[19] = (0xFFFF867C & 0x7BDB);
        GuiPlayerTabOverlay.lllIlIlIlIllll[20] = (0xFFFFDFFC & 0x23EB);
        GuiPlayerTabOverlay.lllIlIlIlIllll[21] = "   ".length();
        GuiPlayerTabOverlay.lllIlIlIlIllll[22] = (0xC1 ^ 0x85 ^ (0x3B ^ 0x7B));
        GuiPlayerTabOverlay.lllIlIlIlIllll[23] = (0x7B ^ 0x70);
        GuiPlayerTabOverlay.lllIlIlIlIllll[24] = (0x36 ^ 0x6E) + (0x16 ^ 0x55) - (5 + 35 + 40 + 47) + (15 + 49 + 73 + 11);
        GuiPlayerTabOverlay.lllIlIlIlIllll[25] = (0xA0 ^ 0xB9);
        GuiPlayerTabOverlay.lllIlIlIlIllll[26] = (0x66 ^ 0x76);
        GuiPlayerTabOverlay.lllIlIlIlIllll[27] = (0x5 ^ 0x1D ^ (0xF ^ 0x51));
        GuiPlayerTabOverlay.lllIlIlIlIllll[28] = (218 + 237 - 252 + 40 ^ 84 + 15 - 25 + 114);
        GuiPlayerTabOverlay.lllIlIlIlIllll[29] = 54 + 138 - 176 + 144;
        GuiPlayerTabOverlay.lllIlIlIlIllll[30] = (114 + 150 - 117 + 11 ^ 85 + 48 - 112 + 149);
        GuiPlayerTabOverlay.lllIlIlIlIllll[31] = 112 + 160 - 270 + 167;
        GuiPlayerTabOverlay.lllIlIlIlIllll[32] = (0xFD ^ 0xC0);
        GuiPlayerTabOverlay.lllIlIlIlIllll[33] = (-1 & 0xFFFFFF);
    }
    
    private static boolean lIlIIIllIIIlIIlI(final int llllllllllllIlIllIllIIIIlllIllll) {
        return llllllllllllIlIllIllIIIIlllIllll != 0;
    }
    
    private static boolean lIlIIIllIIIllIlI(final int llllllllllllIlIllIllIIIIlllIlIll) {
        return llllllllllllIlIllIllIIIIlllIlIll < 0;
    }
    
    private static boolean lIlIIIllIIIllllI(final int llllllllllllIlIllIllIIIIlllIIlll) {
        return llllllllllllIlIllIllIIIIlllIIlll > 0;
    }
    
    static {
        lIlIIIllIIIlIIII();
        lIlIIIlIllllllll();
        field_175252_a = Ordering.from((Comparator)new PlayerComparator(null));
    }
    
    private static boolean lIlIIIllIIIlIlll(final int llllllllllllIlIllIllIIIlIIIIIlII, final int llllllllllllIlIllIllIIIlIIIIIIll) {
        return llllllllllllIlIllIllIIIlIIIIIlII < llllllllllllIlIllIllIIIlIIIIIIll;
    }
    
    private static boolean lIlIIIllIIIllIIl(final int llllllllllllIlIllIllIIIlIIIIlIII, final int llllllllllllIlIllIllIIIlIIIIIlll) {
        return llllllllllllIlIllIllIIIlIIIIlIII >= llllllllllllIlIllIllIIIlIIIIIlll;
    }
    
    public void setHeader(final IChatComponent llllllllllllIlIllIllIIIlIIlIllII) {
        this.header = llllllllllllIlIllIllIIIlIIlIllII;
    }
    
    private void drawScoreboardValues(final ScoreObjective llllllllllllIlIllIllIIIlIlIIIlIl, final int llllllllllllIlIllIllIIIlIlIIIlII, final String llllllllllllIlIllIllIIIlIlIIIIll, final int llllllllllllIlIllIllIIIlIlIIIIlI, final int llllllllllllIlIllIllIIIlIlIIIIIl, final NetworkPlayerInfo llllllllllllIlIllIllIIIlIlIIIIII) {
        final int llllllllllllIlIllIllIIIlIlIlIIIl = llllllllllllIlIllIllIIIlIlIIIlIl.getScoreboard().getValueFromObjective(llllllllllllIlIllIllIIIlIlIIIIll, llllllllllllIlIllIllIIIlIlIIIlIl).getScorePoints();
        if (lIlIIIllIIIlIllI(llllllllllllIlIllIllIIIlIlIIIlIl.getRenderType(), IScoreObjectiveCriteria.EnumRenderType.HEARTS)) {
            this.mc.getTextureManager().bindTexture(GuiPlayerTabOverlay.icons);
            if (lIlIIIllIIIlIIll(lIlIIIllIIIllIll(this.lastTimeOpened, llllllllllllIlIllIllIIIlIlIIIIII.func_178855_p()))) {
                if (lIlIIIllIIIlIlll(llllllllllllIlIllIllIIIlIlIlIIIl, llllllllllllIlIllIllIIIlIlIIIIII.func_178835_l())) {
                    llllllllllllIlIllIllIIIlIlIIIIII.func_178846_a(Minecraft.getSystemTime());
                    llllllllllllIlIllIllIIIlIlIIIIII.func_178844_b(this.guiIngame.getUpdateCounter() + GuiPlayerTabOverlay.lllIlIlIlIllll[3]);
                    "".length();
                    if (-" ".length() != -" ".length()) {
                        return;
                    }
                }
                else if (lIlIIIllIIIllIII(llllllllllllIlIllIllIIIlIlIlIIIl, llllllllllllIlIllIllIIIlIlIIIIII.func_178835_l())) {
                    llllllllllllIlIllIllIIIlIlIIIIII.func_178846_a(Minecraft.getSystemTime());
                    llllllllllllIlIllIllIIIlIlIIIIII.func_178844_b(this.guiIngame.getUpdateCounter() + GuiPlayerTabOverlay.lllIlIlIlIllll[10]);
                }
            }
            if (!lIlIIIllIIIlllIl(lIlIIIllIIIllIll(Minecraft.getSystemTime() - llllllllllllIlIllIllIIIlIlIIIIII.func_178847_n(), 1000L)) || lIlIIIllIIIlIIlI(lIlIIIllIIIllIll(this.lastTimeOpened, llllllllllllIlIllIllIIIlIlIIIIII.func_178855_p()))) {
                llllllllllllIlIllIllIIIlIlIIIIII.func_178836_b(llllllllllllIlIllIllIIIlIlIlIIIl);
                llllllllllllIlIllIllIIIlIlIIIIII.func_178857_c(llllllllllllIlIllIllIIIlIlIlIIIl);
                llllllllllllIlIllIllIIIlIlIIIIII.func_178846_a(Minecraft.getSystemTime());
            }
            llllllllllllIlIllIllIIIlIlIIIIII.func_178843_c(this.lastTimeOpened);
            llllllllllllIlIllIllIIIlIlIIIIII.func_178836_b(llllllllllllIlIllIllIIIlIlIlIIIl);
            final int llllllllllllIlIllIllIIIlIlIlIIII = MathHelper.ceiling_float_int(Math.max(llllllllllllIlIllIllIIIlIlIlIIIl, llllllllllllIlIllIllIIIlIlIIIIII.func_178860_m()) / 2.0f);
            final int llllllllllllIlIllIllIIIlIlIIllll = Math.max(MathHelper.ceiling_float_int((float)(llllllllllllIlIllIllIIIlIlIlIIIl / GuiPlayerTabOverlay.lllIlIlIlIllll[8])), Math.max(MathHelper.ceiling_float_int((float)(llllllllllllIlIllIllIIIlIlIIIIII.func_178860_m() / GuiPlayerTabOverlay.lllIlIlIlIllll[8])), GuiPlayerTabOverlay.lllIlIlIlIllll[10]));
            int n;
            if (lIlIIIllIIIllllI(lIlIIIllIIIllIll(llllllllllllIlIllIllIIIlIlIIIIII.func_178858_o(), this.guiIngame.getUpdateCounter())) && lIlIIIllIIIlIIll(lIlIIIllIIIllIll((llllllllllllIlIllIllIIIlIlIIIIII.func_178858_o() - this.guiIngame.getUpdateCounter()) / 3L % 2L, 1L))) {
                n = GuiPlayerTabOverlay.lllIlIlIlIllll[2];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                n = GuiPlayerTabOverlay.lllIlIlIlIllll[0];
            }
            final boolean llllllllllllIlIllIllIIIlIlIIlllI = n != 0;
            if (lIlIIIllIIIllllI(llllllllllllIlIllIllIIIlIlIlIIII)) {
                final float llllllllllllIlIllIllIIIlIlIIllIl = Math.min((llllllllllllIlIllIllIIIlIlIIIIIl - llllllllllllIlIllIllIIIlIlIIIIlI - GuiPlayerTabOverlay.lllIlIlIlIllll[22]) / (float)llllllllllllIlIllIllIIIlIlIIllll, 9.0f);
                if (lIlIIIllIIIllllI(lIlIIIllIIIlllII(llllllllllllIlIllIllIIIlIlIIllIl, 3.0f))) {
                    int llllllllllllIlIllIllIIIlIlIIllII = llllllllllllIlIllIllIIIlIlIlIIII;
                    "".length();
                    if (" ".length() == "   ".length()) {
                        return;
                    }
                    while (!lIlIIIllIIIllIIl(llllllllllllIlIllIllIIIlIlIIllII, llllllllllllIlIllIllIIIlIlIIllll)) {
                        final float llllllllllllIlllIlIlllIIIIIllIlI = llllllllllllIlIllIllIIIlIlIIIIlI + llllllllllllIlIllIllIIIlIlIIllII * llllllllllllIlIllIllIIIlIlIIllIl;
                        final float llllllllllllIlllIlIlllIIIIIllIIl = (float)llllllllllllIlIllIllIIIlIlIIIlII;
                        int llllllllllllIlllIlIlllIIIIlIIIll;
                        if (lIlIIIllIIIlIIlI(llllllllllllIlIllIllIIIlIlIIlllI ? 1 : 0)) {
                            llllllllllllIlllIlIlllIIIIlIIIll = GuiPlayerTabOverlay.lllIlIlIlIllll[25];
                            "".length();
                            if ("  ".length() <= 0) {
                                return;
                            }
                        }
                        else {
                            llllllllllllIlllIlIlllIIIIlIIIll = GuiPlayerTabOverlay.lllIlIlIlIllll[26];
                        }
                        this.drawTexturedModalRect(llllllllllllIlllIlIlllIIIIIllIlI, llllllllllllIlllIlIlllIIIIIllIIl, llllllllllllIlllIlIlllIIIIlIIIll, GuiPlayerTabOverlay.lllIlIlIlIllll[0], GuiPlayerTabOverlay.lllIlIlIlIllll[5], GuiPlayerTabOverlay.lllIlIlIlIllll[5]);
                        ++llllllllllllIlIllIllIIIlIlIIllII;
                    }
                    int llllllllllllIlIllIllIIIlIlIIlIll = GuiPlayerTabOverlay.lllIlIlIlIllll[0];
                    "".length();
                    if ("   ".length() <= -" ".length()) {
                        return;
                    }
                    while (!lIlIIIllIIIllIIl(llllllllllllIlIllIllIIIlIlIIlIll, llllllllllllIlIllIllIIIlIlIlIIII)) {
                        final float llllllllllllIlllIlIlllIIIIIllIlI2 = llllllllllllIlIllIllIIIlIlIIIIlI + llllllllllllIlIllIllIIIlIlIIlIll * llllllllllllIlIllIllIIIlIlIIllIl;
                        final float llllllllllllIlllIlIlllIIIIIllIIl2 = (float)llllllllllllIlIllIllIIIlIlIIIlII;
                        int llllllllllllIlllIlIlllIIIIlIIIll2;
                        if (lIlIIIllIIIlIIlI(llllllllllllIlIllIllIIIlIlIIlllI ? 1 : 0)) {
                            llllllllllllIlllIlIlllIIIIlIIIll2 = GuiPlayerTabOverlay.lllIlIlIlIllll[25];
                            "".length();
                            if ("   ".length() != "   ".length()) {
                                return;
                            }
                        }
                        else {
                            llllllllllllIlllIlIlllIIIIlIIIll2 = GuiPlayerTabOverlay.lllIlIlIlIllll[26];
                        }
                        this.drawTexturedModalRect(llllllllllllIlllIlIlllIIIIIllIlI2, llllllllllllIlllIlIlllIIIIIllIIl2, llllllllllllIlllIlIlllIIIIlIIIll2, GuiPlayerTabOverlay.lllIlIlIlIllll[0], GuiPlayerTabOverlay.lllIlIlIlIllll[5], GuiPlayerTabOverlay.lllIlIlIlIllll[5]);
                        if (lIlIIIllIIIlIIlI(llllllllllllIlIllIllIIIlIlIIlllI ? 1 : 0)) {
                            if (lIlIIIllIIIlIlll(llllllllllllIlIllIllIIIlIlIIlIll * GuiPlayerTabOverlay.lllIlIlIlIllll[8] + GuiPlayerTabOverlay.lllIlIlIlIllll[2], llllllllllllIlIllIllIIIlIlIIIIII.func_178860_m())) {
                                this.drawTexturedModalRect(llllllllllllIlIllIllIIIlIlIIIIlI + llllllllllllIlIllIllIIIlIlIIlIll * llllllllllllIlIllIllIIIlIlIIllIl, (float)llllllllllllIlIllIllIIIlIlIIIlII, GuiPlayerTabOverlay.lllIlIlIlIllll[27], GuiPlayerTabOverlay.lllIlIlIlIllll[0], GuiPlayerTabOverlay.lllIlIlIlIllll[5], GuiPlayerTabOverlay.lllIlIlIlIllll[5]);
                            }
                            if (lIlIIIllIIIlllll(llllllllllllIlIllIllIIIlIlIIlIll * GuiPlayerTabOverlay.lllIlIlIlIllll[8] + GuiPlayerTabOverlay.lllIlIlIlIllll[2], llllllllllllIlIllIllIIIlIlIIIIII.func_178860_m())) {
                                this.drawTexturedModalRect(llllllllllllIlIllIllIIIlIlIIIIlI + llllllllllllIlIllIllIIIlIlIIlIll * llllllllllllIlIllIllIIIlIlIIllIl, (float)llllllllllllIlIllIllIIIlIlIIIlII, GuiPlayerTabOverlay.lllIlIlIlIllll[28], GuiPlayerTabOverlay.lllIlIlIlIllll[0], GuiPlayerTabOverlay.lllIlIlIlIllll[5], GuiPlayerTabOverlay.lllIlIlIlIllll[5]);
                            }
                        }
                        if (lIlIIIllIIIlIlll(llllllllllllIlIllIllIIIlIlIIlIll * GuiPlayerTabOverlay.lllIlIlIlIllll[8] + GuiPlayerTabOverlay.lllIlIlIlIllll[2], llllllllllllIlIllIllIIIlIlIlIIIl)) {
                            final float llllllllllllIlllIlIlllIIIIIllIlI3 = llllllllllllIlIllIllIIIlIlIIIIlI + llllllllllllIlIllIllIIIlIlIIlIll * llllllllllllIlIllIllIIIlIlIIllIl;
                            final float llllllllllllIlllIlIlllIIIIIllIIl3 = (float)llllllllllllIlIllIllIIIlIlIIIlII;
                            int llllllllllllIlllIlIlllIIIIlIIIll3;
                            if (lIlIIIllIIIllIIl(llllllllllllIlIllIllIIIlIlIIlIll, GuiPlayerTabOverlay.lllIlIlIlIllll[10])) {
                                llllllllllllIlllIlIlllIIIIlIIIll3 = GuiPlayerTabOverlay.lllIlIlIlIllll[29];
                                "".length();
                                if ("  ".length() > (0x64 ^ 0x60)) {
                                    return;
                                }
                            }
                            else {
                                llllllllllllIlllIlIlllIIIIlIIIll3 = GuiPlayerTabOverlay.lllIlIlIlIllll[30];
                            }
                            this.drawTexturedModalRect(llllllllllllIlllIlIlllIIIIIllIlI3, llllllllllllIlllIlIlllIIIIIllIIl3, llllllllllllIlllIlIlllIIIIlIIIll3, GuiPlayerTabOverlay.lllIlIlIlIllll[0], GuiPlayerTabOverlay.lllIlIlIlIllll[5], GuiPlayerTabOverlay.lllIlIlIlIllll[5]);
                        }
                        if (lIlIIIllIIIlllll(llllllllllllIlIllIllIIIlIlIIlIll * GuiPlayerTabOverlay.lllIlIlIlIllll[8] + GuiPlayerTabOverlay.lllIlIlIlIllll[2], llllllllllllIlIllIllIIIlIlIlIIIl)) {
                            final float llllllllllllIlllIlIlllIIIIIllIlI4 = llllllllllllIlIllIllIIIlIlIIIIlI + llllllllllllIlIllIllIIIlIlIIlIll * llllllllllllIlIllIllIIIlIlIIllIl;
                            final float llllllllllllIlllIlIlllIIIIIllIIl4 = (float)llllllllllllIlIllIllIIIlIlIIIlII;
                            int llllllllllllIlllIlIlllIIIIlIIIll4;
                            if (lIlIIIllIIIllIIl(llllllllllllIlIllIllIIIlIlIIlIll, GuiPlayerTabOverlay.lllIlIlIlIllll[10])) {
                                llllllllllllIlllIlIlllIIIIlIIIll4 = GuiPlayerTabOverlay.lllIlIlIlIllll[31];
                                "".length();
                                if (-" ".length() >= (146 + 94 - 134 + 59 ^ 31 + 60 - 65 + 135)) {
                                    return;
                                }
                            }
                            else {
                                llllllllllllIlllIlIlllIIIIlIIIll4 = GuiPlayerTabOverlay.lllIlIlIlIllll[32];
                            }
                            this.drawTexturedModalRect(llllllllllllIlllIlIlllIIIIIllIlI4, llllllllllllIlllIlIlllIIIIIllIIl4, llllllllllllIlllIlIlllIIIIlIIIll4, GuiPlayerTabOverlay.lllIlIlIlIllll[0], GuiPlayerTabOverlay.lllIlIlIlIllll[5], GuiPlayerTabOverlay.lllIlIlIlIllll[5]);
                        }
                        ++llllllllllllIlIllIllIIIlIlIIlIll;
                    }
                    "".length();
                    if ("  ".length() < " ".length()) {
                        return;
                    }
                }
                else {
                    final float llllllllllllIlIllIllIIIlIlIIlIlI = MathHelper.clamp_float(llllllllllllIlIllIllIIIlIlIlIIIl / 20.0f, 0.0f, 1.0f);
                    final int llllllllllllIlIllIllIIIlIlIIlIIl = (int)((1.0f - llllllllllllIlIllIllIIIlIlIIlIlI) * 255.0f) << GuiPlayerTabOverlay.lllIlIlIlIllll[26] | (int)(llllllllllllIlIllIllIIIlIlIIlIlI * 255.0f) << GuiPlayerTabOverlay.lllIlIlIlIllll[12];
                    String llllllllllllIlIllIllIIIlIlIIlIII = String.valueOf(new StringBuilder().append(llllllllllllIlIllIllIIIlIlIlIIIl / 2.0f));
                    if (lIlIIIllIIIllIIl(llllllllllllIlIllIllIIIlIlIIIIIl - this.mc.fontRendererObj.getStringWidth(String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlIllIllIIIlIlIIlIII)).append(GuiPlayerTabOverlay.lllIlIlIlIlIII[GuiPlayerTabOverlay.lllIlIlIlIllll[21]]))), llllllllllllIlIllIllIIIlIlIIIIlI)) {
                        llllllllllllIlIllIllIIIlIlIIlIII = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlIllIllIIIlIlIIlIII)).append(GuiPlayerTabOverlay.lllIlIlIlIlIII[GuiPlayerTabOverlay.lllIlIlIlIllll[22]]));
                    }
                    this.mc.fontRendererObj.drawStringWithShadow(llllllllllllIlIllIllIIIlIlIIlIII, (float)((llllllllllllIlIllIllIIIlIlIIIIIl + llllllllllllIlIllIllIIIlIlIIIIlI) / GuiPlayerTabOverlay.lllIlIlIlIllll[8] - this.mc.fontRendererObj.getStringWidth(llllllllllllIlIllIllIIIlIlIIlIII) / GuiPlayerTabOverlay.lllIlIlIlIllll[8]), (float)llllllllllllIlIllIllIIIlIlIIIlII, llllllllllllIlIllIllIIIlIlIIlIIl);
                    "".length();
                    "".length();
                    if (((0xA6 ^ 0xB1) & ~(0x8E ^ 0x99)) > 0) {
                        return;
                    }
                }
            }
        }
        else {
            final String llllllllllllIlIllIllIIIlIlIIIlll = String.valueOf(new StringBuilder().append(EnumChatFormatting.YELLOW).append(llllllllllllIlIllIllIIIlIlIlIIIl));
            this.mc.fontRendererObj.drawStringWithShadow(llllllllllllIlIllIllIIIlIlIIIlll, (float)(llllllllllllIlIllIllIIIlIlIIIIIl - this.mc.fontRendererObj.getStringWidth(llllllllllllIlIllIllIIIlIlIIIlll)), (float)llllllllllllIlIllIllIIIlIlIIIlII, GuiPlayerTabOverlay.lllIlIlIlIllll[33]);
            "".length();
        }
    }
    
    private static boolean lIlIIIllIIIlllll(final int llllllllllllIlIllIllIIIlIIIIllII, final int llllllllllllIlIllIllIIIlIIIIlIll) {
        return llllllllllllIlIllIllIIIlIIIIllII == llllllllllllIlIllIllIIIlIIIIlIll;
    }
    
    public void renderPlayerlist(final int llllllllllllIlIllIllIIIllIIlllII, final Scoreboard llllllllllllIlIllIllIIIllIIllIll, final ScoreObjective llllllllllllIlIllIllIIIlllIIIlll) {
        final NetHandlerPlayClient llllllllllllIlIllIllIIIlllIIIllI = this.mc.thePlayer.sendQueue;
        List<NetworkPlayerInfo> llllllllllllIlIllIllIIIlllIIIlIl = (List<NetworkPlayerInfo>)GuiPlayerTabOverlay.field_175252_a.sortedCopy((Iterable)llllllllllllIlIllIllIIIlllIIIllI.getPlayerInfoMap());
        int llllllllllllIlIllIllIIIlllIIIlII = GuiPlayerTabOverlay.lllIlIlIlIllll[0];
        int llllllllllllIlIllIllIIIlllIIIIll = GuiPlayerTabOverlay.lllIlIlIlIllll[0];
        final Iterator<NetworkPlayerInfo> iterator = llllllllllllIlIllIllIIIlllIIIlIl.iterator();
        "".length();
        if ("   ".length() < "   ".length()) {
            return;
        }
        while (!lIlIIIllIIIlIIll(iterator.hasNext() ? 1 : 0)) {
            final NetworkPlayerInfo llllllllllllIlIllIllIIIlllIIIIlI = iterator.next();
            int llllllllllllIlIllIllIIIlllIIIIIl = this.mc.fontRendererObj.getStringWidth(this.getPlayerName(llllllllllllIlIllIllIIIlllIIIIlI));
            llllllllllllIlIllIllIIIlllIIIlII = Math.max(llllllllllllIlIllIllIIIlllIIIlII, llllllllllllIlIllIllIIIlllIIIIIl);
            if (lIlIIIllIIIlIIIl(llllllllllllIlIllIllIIIlllIIIlll) && lIlIIIllIIIlIlII(llllllllllllIlIllIllIIIlllIIIlll.getRenderType(), IScoreObjectiveCriteria.EnumRenderType.HEARTS)) {
                llllllllllllIlIllIllIIIlllIIIIIl = this.mc.fontRendererObj.getStringWidth(String.valueOf(new StringBuilder(GuiPlayerTabOverlay.lllIlIlIlIlIII[GuiPlayerTabOverlay.lllIlIlIlIllll[0]]).append(llllllllllllIlIllIllIIIllIIllIll.getValueFromObjective(llllllllllllIlIllIllIIIlllIIIIlI.getGameProfile().getName(), llllllllllllIlIllIllIIIlllIIIlll).getScorePoints())));
                llllllllllllIlIllIllIIIlllIIIIll = Math.max(llllllllllllIlIllIllIIIlllIIIIll, llllllllllllIlIllIllIIIlllIIIIIl);
            }
        }
        llllllllllllIlIllIllIIIlllIIIlIl = llllllllllllIlIllIllIIIlllIIIlIl.subList(GuiPlayerTabOverlay.lllIlIlIlIllll[0], Math.min(llllllllllllIlIllIllIIIlllIIIlIl.size(), GuiPlayerTabOverlay.lllIlIlIlIllll[1]));
        int llllllllllllIlIllIllIIIllIllllll;
        final int llllllllllllIlIllIllIIIlllIIIIII = llllllllllllIlIllIllIIIllIllllll = llllllllllllIlIllIllIIIlllIIIlIl.size();
        int llllllllllllIlIllIllIIIllIlllllI = GuiPlayerTabOverlay.lllIlIlIlIllll[2];
        "".length();
        if (((0x26 ^ 0x38) & ~(0x3B ^ 0x25)) <= -" ".length()) {
            return;
        }
        while (!lIlIIIllIIIlIlIl(llllllllllllIlIllIllIIIllIllllll, GuiPlayerTabOverlay.lllIlIlIlIllll[3])) {
            ++llllllllllllIlIllIllIIIllIlllllI;
            llllllllllllIlIllIllIIIllIllllll = (llllllllllllIlIllIllIIIlllIIIIII + llllllllllllIlIllIllIIIllIlllllI - GuiPlayerTabOverlay.lllIlIlIlIllll[2]) / llllllllllllIlIllIllIIIllIlllllI;
        }
        int n;
        if (lIlIIIllIIIlIIll(this.mc.isIntegratedServerRunning() ? 1 : 0) && lIlIIIllIIIlIIll(this.mc.getNetHandler().getNetworkManager().getIsencrypted() ? 1 : 0)) {
            n = GuiPlayerTabOverlay.lllIlIlIlIllll[0];
            "".length();
            if (((0x53 ^ 0x7C) & ~(0x7E ^ 0x51)) <= -" ".length()) {
                return;
            }
        }
        else {
            n = GuiPlayerTabOverlay.lllIlIlIlIllll[2];
        }
        final boolean llllllllllllIlIllIllIIIllIllllIl = n != 0;
        int llllllllllllIlIllIllIIIllIlllIlI;
        if (lIlIIIllIIIlIIIl(llllllllllllIlIllIllIIIlllIIIlll)) {
            if (lIlIIIllIIIlIllI(llllllllllllIlIllIllIIIlllIIIlll.getRenderType(), IScoreObjectiveCriteria.EnumRenderType.HEARTS)) {
                final int llllllllllllIlIllIllIIIllIllllII = GuiPlayerTabOverlay.lllIlIlIlIllll[4];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                final int llllllllllllIlIllIllIIIllIlllIll = llllllllllllIlIllIllIIIlllIIIIll;
                "".length();
                if ((0x4E ^ 0x2B ^ (0xC3 ^ 0xA2)) <= 0) {
                    return;
                }
            }
        }
        else {
            llllllllllllIlIllIllIIIllIlllIlI = GuiPlayerTabOverlay.lllIlIlIlIllll[0];
        }
        final int n2 = llllllllllllIlIllIllIIIllIlllllI;
        int n3;
        if (lIlIIIllIIIlIIlI(llllllllllllIlIllIllIIIllIllllIl ? 1 : 0)) {
            n3 = GuiPlayerTabOverlay.lllIlIlIlIllll[5];
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else {
            n3 = GuiPlayerTabOverlay.lllIlIlIlIllll[0];
        }
        final int llllllllllllIlIllIllIIIllIlllIIl = Math.min(n2 * (n3 + llllllllllllIlIllIllIIIlllIIIlII + llllllllllllIlIllIllIIIllIlllIlI + GuiPlayerTabOverlay.lllIlIlIlIllll[6]), llllllllllllIlIllIllIIIllIIlllII - GuiPlayerTabOverlay.lllIlIlIlIllll[7]) / llllllllllllIlIllIllIIIllIlllllI;
        final int llllllllllllIlIllIllIIIllIlllIII = llllllllllllIlIllIllIIIllIIlllII / GuiPlayerTabOverlay.lllIlIlIlIllll[8] - (llllllllllllIlIllIllIIIllIlllIIl * llllllllllllIlIllIllIIIllIlllllI + (llllllllllllIlIllIllIIIllIlllllI - GuiPlayerTabOverlay.lllIlIlIlIllll[2]) * GuiPlayerTabOverlay.lllIlIlIlIllll[9]) / GuiPlayerTabOverlay.lllIlIlIlIllll[8];
        int llllllllllllIlIllIllIIIllIllIlll = GuiPlayerTabOverlay.lllIlIlIlIllll[10];
        int llllllllllllIlIllIllIIIllIllIllI = llllllllllllIlIllIllIIIllIlllIIl * llllllllllllIlIllIllIIIllIlllllI + (llllllllllllIlIllIllIIIllIlllllI - GuiPlayerTabOverlay.lllIlIlIlIllll[2]) * GuiPlayerTabOverlay.lllIlIlIlIllll[9];
        List<String> llllllllllllIlIllIllIIIllIllIlIl = null;
        List<String> llllllllllllIlIllIllIIIllIllIlII = null;
        if (lIlIIIllIIIlIIIl(this.header)) {
            llllllllllllIlIllIllIIIllIllIlIl = this.mc.fontRendererObj.listFormattedStringToWidth(this.header.getFormattedText(), llllllllllllIlIllIllIIIllIIlllII - GuiPlayerTabOverlay.lllIlIlIlIllll[7]);
            final Iterator<String> iterator2 = llllllllllllIlIllIllIIIllIllIlIl.iterator();
            "".length();
            if (null != null) {
                return;
            }
            while (!lIlIIIllIIIlIIll(iterator2.hasNext() ? 1 : 0)) {
                final String llllllllllllIlIllIllIIIllIllIIll = iterator2.next();
                llllllllllllIlIllIllIIIllIllIllI = Math.max(llllllllllllIlIllIllIIIllIllIllI, this.mc.fontRendererObj.getStringWidth(llllllllllllIlIllIllIIIllIllIIll));
            }
        }
        if (lIlIIIllIIIlIIIl(this.footer)) {
            llllllllllllIlIllIllIIIllIllIlII = this.mc.fontRendererObj.listFormattedStringToWidth(this.footer.getFormattedText(), llllllllllllIlIllIllIIIllIIlllII - GuiPlayerTabOverlay.lllIlIlIlIllll[7]);
            final Iterator<String> iterator3 = llllllllllllIlIllIllIIIllIllIlII.iterator();
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
            while (!lIlIIIllIIIlIIll(iterator3.hasNext() ? 1 : 0)) {
                final String llllllllllllIlIllIllIIIllIllIIlI = iterator3.next();
                llllllllllllIlIllIllIIIllIllIllI = Math.max(llllllllllllIlIllIllIIIllIllIllI, this.mc.fontRendererObj.getStringWidth(llllllllllllIlIllIllIIIllIllIIlI));
            }
        }
        if (lIlIIIllIIIlIIIl(llllllllllllIlIllIllIIIllIllIlIl)) {
            Gui.drawRect(llllllllllllIlIllIllIIIllIIlllII / GuiPlayerTabOverlay.lllIlIlIlIllll[8] - llllllllllllIlIllIllIIIllIllIllI / GuiPlayerTabOverlay.lllIlIlIlIllll[8] - GuiPlayerTabOverlay.lllIlIlIlIllll[2], llllllllllllIlIllIllIIIllIllIlll - GuiPlayerTabOverlay.lllIlIlIlIllll[2], llllllllllllIlIllIllIIIllIIlllII / GuiPlayerTabOverlay.lllIlIlIlIllll[8] + llllllllllllIlIllIllIIIllIllIllI / GuiPlayerTabOverlay.lllIlIlIlIllll[8] + GuiPlayerTabOverlay.lllIlIlIlIllll[2], llllllllllllIlIllIllIIIllIllIlll + llllllllllllIlIllIllIIIllIllIlIl.size() * this.mc.fontRendererObj.FONT_HEIGHT, Integer.MIN_VALUE);
            final Iterator<String> iterator4 = llllllllllllIlIllIllIIIllIllIlIl.iterator();
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
            while (!lIlIIIllIIIlIIll(iterator4.hasNext() ? 1 : 0)) {
                final String llllllllllllIlIllIllIIIllIllIIIl = iterator4.next();
                final int llllllllllllIlIllIllIIIllIllIIII = this.mc.fontRendererObj.getStringWidth(llllllllllllIlIllIllIIIllIllIIIl);
                this.mc.fontRendererObj.drawStringWithShadow(llllllllllllIlIllIllIIIllIllIIIl, (float)(llllllllllllIlIllIllIIIllIIlllII / GuiPlayerTabOverlay.lllIlIlIlIllll[8] - llllllllllllIlIllIllIIIllIllIIII / GuiPlayerTabOverlay.lllIlIlIlIllll[8]), (float)llllllllllllIlIllIllIIIllIllIlll, GuiPlayerTabOverlay.lllIlIlIlIllll[11]);
                "".length();
                llllllllllllIlIllIllIIIllIllIlll += this.mc.fontRendererObj.FONT_HEIGHT;
            }
            ++llllllllllllIlIllIllIIIllIllIlll;
        }
        Gui.drawRect(llllllllllllIlIllIllIIIllIIlllII / GuiPlayerTabOverlay.lllIlIlIlIllll[8] - llllllllllllIlIllIllIIIllIllIllI / GuiPlayerTabOverlay.lllIlIlIlIllll[8] - GuiPlayerTabOverlay.lllIlIlIlIllll[2], llllllllllllIlIllIllIIIllIllIlll - GuiPlayerTabOverlay.lllIlIlIlIllll[2], llllllllllllIlIllIllIIIllIIlllII / GuiPlayerTabOverlay.lllIlIlIlIllll[8] + llllllllllllIlIllIllIIIllIllIllI / GuiPlayerTabOverlay.lllIlIlIlIllll[8] + GuiPlayerTabOverlay.lllIlIlIlIllll[2], llllllllllllIlIllIllIIIllIllIlll + llllllllllllIlIllIllIIIllIllllll * GuiPlayerTabOverlay.lllIlIlIlIllll[5], Integer.MIN_VALUE);
        int llllllllllllIlIllIllIIIllIlIllll = GuiPlayerTabOverlay.lllIlIlIlIllll[0];
        "".length();
        if (" ".length() > " ".length()) {
            return;
        }
        while (!lIlIIIllIIIllIIl(llllllllllllIlIllIllIIIllIlIllll, llllllllllllIlIllIllIIIlllIIIIII)) {
            final int llllllllllllIlIllIllIIIllIlIlllI = llllllllllllIlIllIllIIIllIlIllll / llllllllllllIlIllIllIIIllIllllll;
            final int llllllllllllIlIllIllIIIllIlIllIl = llllllllllllIlIllIllIIIllIlIllll % llllllllllllIlIllIllIIIllIllllll;
            int llllllllllllIlIllIllIIIllIlIllII = llllllllllllIlIllIllIIIllIlllIII + llllllllllllIlIllIllIIIllIlIlllI * llllllllllllIlIllIllIIIllIlllIIl + llllllllllllIlIllIllIIIllIlIlllI * GuiPlayerTabOverlay.lllIlIlIlIllll[9];
            final int llllllllllllIlIllIllIIIllIlIlIll = llllllllllllIlIllIllIIIllIllIlll + llllllllllllIlIllIllIIIllIlIllIl * GuiPlayerTabOverlay.lllIlIlIlIllll[5];
            Gui.drawRect(llllllllllllIlIllIllIIIllIlIllII, llllllllllllIlIllIllIIIllIlIlIll, llllllllllllIlIllIllIIIllIlIllII + llllllllllllIlIllIllIIIllIlllIIl, llllllllllllIlIllIllIIIllIlIlIll + GuiPlayerTabOverlay.lllIlIlIlIllll[12], GuiPlayerTabOverlay.lllIlIlIlIllll[13]);
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.enableAlpha();
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(GuiPlayerTabOverlay.lllIlIlIlIllll[14], GuiPlayerTabOverlay.lllIlIlIlIllll[15], GuiPlayerTabOverlay.lllIlIlIlIllll[2], GuiPlayerTabOverlay.lllIlIlIlIllll[0]);
            if (lIlIIIllIIIlIlll(llllllllllllIlIllIllIIIllIlIllll, llllllllllllIlIllIllIIIlllIIIlIl.size())) {
                final NetworkPlayerInfo llllllllllllIlIllIllIIIllIlIlIlI = llllllllllllIlIllIllIIIlllIIIlIl.get(llllllllllllIlIllIllIIIllIlIllll);
                String llllllllllllIlIllIllIIIllIlIlIIl = this.getPlayerName(llllllllllllIlIllIllIIIllIlIlIlI);
                final GameProfile llllllllllllIlIllIllIIIllIlIlIII = llllllllllllIlIllIllIIIllIlIlIlI.getGameProfile();
                if (lIlIIIllIIIlIIlI(llllllllllllIlIllIllIIIllIllllIl ? 1 : 0)) {
                    final EntityPlayer llllllllllllIlIllIllIIIllIlIIlll = this.mc.theWorld.getPlayerEntityByUUID(llllllllllllIlIllIllIIIllIlIlIII.getId());
                    int n4;
                    if (lIlIIIllIIIlIIIl(llllllllllllIlIllIllIIIllIlIIlll) && lIlIIIllIIIlIIlI(llllllllllllIlIllIllIIIllIlIIlll.isWearing(EnumPlayerModelParts.CAPE) ? 1 : 0) && (!lIlIIIllIIIlIIll(llllllllllllIlIllIllIIIllIlIlIII.getName().equals(GuiPlayerTabOverlay.lllIlIlIlIlIII[GuiPlayerTabOverlay.lllIlIlIlIllll[2]]) ? 1 : 0) || lIlIIIllIIIlIIlI(llllllllllllIlIllIllIIIllIlIlIII.getName().equals(GuiPlayerTabOverlay.lllIlIlIlIlIII[GuiPlayerTabOverlay.lllIlIlIlIllll[8]]) ? 1 : 0))) {
                        n4 = GuiPlayerTabOverlay.lllIlIlIlIllll[2];
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    else {
                        n4 = GuiPlayerTabOverlay.lllIlIlIlIllll[0];
                    }
                    final boolean llllllllllllIlIllIllIIIllIlIIllI = n4 != 0;
                    this.mc.getTextureManager().bindTexture(llllllllllllIlIllIllIIIllIlIlIlI.getLocationSkin());
                    final int n5 = GuiPlayerTabOverlay.lllIlIlIlIllll[12];
                    int n6;
                    if (lIlIIIllIIIlIIlI(llllllllllllIlIllIllIIIllIlIIllI ? 1 : 0)) {
                        n6 = GuiPlayerTabOverlay.lllIlIlIlIllll[12];
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    else {
                        n6 = GuiPlayerTabOverlay.lllIlIlIlIllll[0];
                    }
                    final int llllllllllllIlIllIllIIIllIlIIlIl = n5 + n6;
                    final int n7 = GuiPlayerTabOverlay.lllIlIlIlIllll[12];
                    int n8;
                    if (lIlIIIllIIIlIIlI(llllllllllllIlIllIllIIIllIlIIllI ? 1 : 0)) {
                        n8 = GuiPlayerTabOverlay.lllIlIlIlIllll[11];
                        "".length();
                        if (-(0x8D ^ 0x88) >= 0) {
                            return;
                        }
                    }
                    else {
                        n8 = GuiPlayerTabOverlay.lllIlIlIlIllll[2];
                    }
                    final int llllllllllllIlIllIllIIIllIlIIlII = n7 * n8;
                    Gui.drawScaledCustomSizeModalRect(llllllllllllIlIllIllIIIllIlIllII, llllllllllllIlIllIllIIIllIlIlIll, 8.0f, (float)llllllllllllIlIllIllIIIllIlIIlIl, GuiPlayerTabOverlay.lllIlIlIlIllll[12], llllllllllllIlIllIllIIIllIlIIlII, GuiPlayerTabOverlay.lllIlIlIlIllll[12], GuiPlayerTabOverlay.lllIlIlIlIllll[12], 64.0f, 64.0f);
                    if (lIlIIIllIIIlIIIl(llllllllllllIlIllIllIIIllIlIIlll) && lIlIIIllIIIlIIlI(llllllllllllIlIllIllIIIllIlIIlll.isWearing(EnumPlayerModelParts.HAT) ? 1 : 0)) {
                        final int n9 = GuiPlayerTabOverlay.lllIlIlIlIllll[12];
                        int n10;
                        if (lIlIIIllIIIlIIlI(llllllllllllIlIllIllIIIllIlIIllI ? 1 : 0)) {
                            n10 = GuiPlayerTabOverlay.lllIlIlIlIllll[12];
                            "".length();
                            if ((0x6B ^ 0x6F) < 0) {
                                return;
                            }
                        }
                        else {
                            n10 = GuiPlayerTabOverlay.lllIlIlIlIllll[0];
                        }
                        final int llllllllllllIlIllIllIIIllIlIIIll = n9 + n10;
                        final int n11 = GuiPlayerTabOverlay.lllIlIlIlIllll[12];
                        int n12;
                        if (lIlIIIllIIIlIIlI(llllllllllllIlIllIllIIIllIlIIllI ? 1 : 0)) {
                            n12 = GuiPlayerTabOverlay.lllIlIlIlIllll[11];
                            "".length();
                            if (" ".length() == 0) {
                                return;
                            }
                        }
                        else {
                            n12 = GuiPlayerTabOverlay.lllIlIlIlIllll[2];
                        }
                        final int llllllllllllIlIllIllIIIllIlIIIlI = n11 * n12;
                        Gui.drawScaledCustomSizeModalRect(llllllllllllIlIllIllIIIllIlIllII, llllllllllllIlIllIllIIIllIlIlIll, 40.0f, (float)llllllllllllIlIllIllIIIllIlIIIll, GuiPlayerTabOverlay.lllIlIlIlIllll[12], llllllllllllIlIllIllIIIllIlIIIlI, GuiPlayerTabOverlay.lllIlIlIlIllll[12], GuiPlayerTabOverlay.lllIlIlIlIllll[12], 64.0f, 64.0f);
                    }
                    llllllllllllIlIllIllIIIllIlIllII += 9;
                }
                if (lIlIIIllIIIlIllI(llllllllllllIlIllIllIIIllIlIlIlI.getGameType(), WorldSettings.GameType.SPECTATOR)) {
                    llllllllllllIlIllIllIIIllIlIlIIl = String.valueOf(new StringBuilder().append(EnumChatFormatting.ITALIC).append(llllllllllllIlIllIllIIIllIlIlIIl));
                    this.mc.fontRendererObj.drawStringWithShadow(llllllllllllIlIllIllIIIllIlIlIIl, (float)llllllllllllIlIllIllIIIllIlIllII, (float)llllllllllllIlIllIllIIIllIlIlIll, GuiPlayerTabOverlay.lllIlIlIlIllll[16]);
                    "".length();
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    this.mc.fontRendererObj.drawStringWithShadow(llllllllllllIlIllIllIIIllIlIlIIl, (float)llllllllllllIlIllIllIIIllIlIllII, (float)llllllllllllIlIllIllIIIllIlIlIll, GuiPlayerTabOverlay.lllIlIlIlIllll[11]);
                    "".length();
                }
                if (lIlIIIllIIIlIIIl(llllllllllllIlIllIllIIIlllIIIlll) && lIlIIIllIIIlIlII(llllllllllllIlIllIllIIIllIlIlIlI.getGameType(), WorldSettings.GameType.SPECTATOR)) {
                    final int llllllllllllIlIllIllIIIllIlIIIIl = llllllllllllIlIllIllIIIllIlIllII + llllllllllllIlIllIllIIIlllIIIlII + GuiPlayerTabOverlay.lllIlIlIlIllll[2];
                    final int llllllllllllIlIllIllIIIllIlIIIII = llllllllllllIlIllIllIIIllIlIIIIl + llllllllllllIlIllIllIIIllIlllIlI;
                    if (lIlIIIllIIIllIII(llllllllllllIlIllIllIIIllIlIIIII - llllllllllllIlIllIllIIIllIlIIIIl, GuiPlayerTabOverlay.lllIlIlIlIllll[9])) {
                        this.drawScoreboardValues(llllllllllllIlIllIllIIIlllIIIlll, llllllllllllIlIllIllIIIllIlIlIll, llllllllllllIlIllIllIIIllIlIlIII.getName(), llllllllllllIlIllIllIIIllIlIIIIl, llllllllllllIlIllIllIIIllIlIIIII, llllllllllllIlIllIllIIIllIlIlIlI);
                    }
                }
                final int llllllllllllIlIllIllIIIlIlllIlII = llllllllllllIlIllIllIIIllIlllIIl;
                final int n13 = llllllllllllIlIllIllIIIllIlIllII;
                int n14;
                if (lIlIIIllIIIlIIlI(llllllllllllIlIllIllIIIllIllllIl ? 1 : 0)) {
                    n14 = GuiPlayerTabOverlay.lllIlIlIlIllll[5];
                    "".length();
                    if ((67 + 63 - 56 + 71 ^ 76 + 107 - 146 + 112) <= 0) {
                        return;
                    }
                }
                else {
                    n14 = GuiPlayerTabOverlay.lllIlIlIlIllll[0];
                }
                this.drawPing(llllllllllllIlIllIllIIIlIlllIlII, n13 - n14, llllllllllllIlIllIllIIIllIlIlIll, llllllllllllIlIllIllIIIllIlIlIlI);
            }
            ++llllllllllllIlIllIllIIIllIlIllll;
        }
        if (lIlIIIllIIIlIIIl(llllllllllllIlIllIllIIIllIllIlII)) {
            llllllllllllIlIllIllIIIllIllIlll = llllllllllllIlIllIllIIIllIllIlll + llllllllllllIlIllIllIIIllIllllll * GuiPlayerTabOverlay.lllIlIlIlIllll[5] + GuiPlayerTabOverlay.lllIlIlIlIllll[2];
            Gui.drawRect(llllllllllllIlIllIllIIIllIIlllII / GuiPlayerTabOverlay.lllIlIlIlIllll[8] - llllllllllllIlIllIllIIIllIllIllI / GuiPlayerTabOverlay.lllIlIlIlIllll[8] - GuiPlayerTabOverlay.lllIlIlIlIllll[2], llllllllllllIlIllIllIIIllIllIlll - GuiPlayerTabOverlay.lllIlIlIlIllll[2], llllllllllllIlIllIllIIIllIIlllII / GuiPlayerTabOverlay.lllIlIlIlIllll[8] + llllllllllllIlIllIllIIIllIllIllI / GuiPlayerTabOverlay.lllIlIlIlIllll[8] + GuiPlayerTabOverlay.lllIlIlIlIllll[2], llllllllllllIlIllIllIIIllIllIlll + llllllllllllIlIllIllIIIllIllIlII.size() * this.mc.fontRendererObj.FONT_HEIGHT, Integer.MIN_VALUE);
            final Iterator<String> iterator5 = llllllllllllIlIllIllIIIllIllIlII.iterator();
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
            while (!lIlIIIllIIIlIIll(iterator5.hasNext() ? 1 : 0)) {
                final String llllllllllllIlIllIllIIIllIIlllll = iterator5.next();
                final int llllllllllllIlIllIllIIIllIIllllI = this.mc.fontRendererObj.getStringWidth(llllllllllllIlIllIllIIIllIIlllll);
                this.mc.fontRendererObj.drawStringWithShadow(llllllllllllIlIllIllIIIllIIlllll, (float)(llllllllllllIlIllIllIIIllIIlllII / GuiPlayerTabOverlay.lllIlIlIlIllll[8] - llllllllllllIlIllIllIIIllIIllllI / GuiPlayerTabOverlay.lllIlIlIlIllll[8]), (float)llllllllllllIlIllIllIIIllIllIlll, GuiPlayerTabOverlay.lllIlIlIlIllll[11]);
                "".length();
                llllllllllllIlIllIllIIIllIllIlll += this.mc.fontRendererObj.FONT_HEIGHT;
            }
        }
    }
    
    private static String lIlIIIlIllllllII(final String llllllllllllIlIllIllIIIlIIlIIIIl, final String llllllllllllIlIllIllIIIlIIlIIIII) {
        try {
            final SecretKeySpec llllllllllllIlIllIllIIIlIIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIllIIIlIIlIIIII.getBytes(StandardCharsets.UTF_8)), GuiPlayerTabOverlay.lllIlIlIlIllll[12]), "DES");
            final Cipher llllllllllllIlIllIllIIIlIIlIIIll = Cipher.getInstance("DES");
            llllllllllllIlIllIllIIIlIIlIIIll.init(GuiPlayerTabOverlay.lllIlIlIlIllll[8], llllllllllllIlIllIllIIIlIIlIIlII);
            return new String(llllllllllllIlIllIllIIIlIIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIllIIIlIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIllIIIlIIlIIIlI) {
            llllllllllllIlIllIllIIIlIIlIIIlI.printStackTrace();
            return null;
        }
    }
    
    public GuiPlayerTabOverlay(final Minecraft llllllllllllIlIllIllIIIllllllIlI, final GuiIngame llllllllllllIlIllIllIIIllllllIIl) {
        this.mc = llllllllllllIlIllIllIIIllllllIlI;
        this.guiIngame = llllllllllllIlIllIllIIIllllllIIl;
    }
    
    public void setFooter(final IChatComponent llllllllllllIlIllIllIIIlIIllIlII) {
        this.footer = llllllllllllIlIllIllIIIlIIllIlII;
    }
    
    private static boolean lIlIIIllIIIlIIIl(final Object llllllllllllIlIllIllIIIIllllIlIl) {
        return llllllllllllIlIllIllIIIIllllIlIl != null;
    }
    
    public void func_181030_a() {
        this.header = null;
        this.footer = null;
    }
    
    public void updatePlayerList(final boolean llllllllllllIlIllIllIIIllllIlllI) {
        if (lIlIIIllIIIlIIlI(llllllllllllIlIllIllIIIllllIlllI ? 1 : 0) && lIlIIIllIIIlIIll(this.isBeingRendered ? 1 : 0)) {
            this.lastTimeOpened = Minecraft.getSystemTime();
        }
        this.isBeingRendered = llllllllllllIlIllIllIIIllllIlllI;
    }
    
    private static boolean lIlIIIllIIIlIllI(final Object llllllllllllIlIllIllIIIIllllIIlI, final Object llllllllllllIlIllIllIIIIllllIIIl) {
        return llllllllllllIlIllIllIIIIllllIIlI == llllllllllllIlIllIllIIIIllllIIIl;
    }
    
    private static boolean lIlIIIllIIIlIlIl(final int llllllllllllIlIllIllIIIlIIIIIIII, final int llllllllllllIlIllIllIIIIllllllll) {
        return llllllllllllIlIllIllIIIlIIIIIIII <= llllllllllllIlIllIllIIIIllllllll;
    }
    
    private static boolean lIlIIIllIIIlIIll(final int llllllllllllIlIllIllIIIIlllIllIl) {
        return llllllllllllIlIllIllIIIIlllIllIl == 0;
    }
    
    public String getPlayerName(final NetworkPlayerInfo llllllllllllIlIllIllIIIlllllIIll) {
        String s;
        if (lIlIIIllIIIlIIIl(llllllllllllIlIllIllIIIlllllIIll.getDisplayName())) {
            s = llllllllllllIlIllIllIIIlllllIIll.getDisplayName().getFormattedText();
            "".length();
            if (" ".length() >= "  ".length()) {
                return null;
            }
        }
        else {
            s = ScorePlayerTeam.formatPlayerName(llllllllllllIlIllIllIIIlllllIIll.getPlayerTeam(), llllllllllllIlIllIllIIIlllllIIll.getGameProfile().getName());
        }
        return s;
    }
    
    private static boolean lIlIIIllIIIllIII(final int llllllllllllIlIllIllIIIIllllllII, final int llllllllllllIlIllIllIIIIlllllIll) {
        return llllllllllllIlIllIllIIIIllllllII > llllllllllllIlIllIllIIIIlllllIll;
    }
    
    private static void lIlIIIlIllllllll() {
        (lllIlIlIlIlIII = new String[GuiPlayerTabOverlay.lllIlIlIlIllll[9]])[GuiPlayerTabOverlay.lllIlIlIlIllll[0]] = lIlIIIlIlllllIIl("zrO+6E81S94=", "UblHY");
        GuiPlayerTabOverlay.lllIlIlIlIlIII[GuiPlayerTabOverlay.lllIlIlIlIllll[2]] = lIlIIIlIllllllII("Uy2WqSbmT6APwMWGzm8cAg==", "YdJVJ");
        GuiPlayerTabOverlay.lllIlIlIlIlIII[GuiPlayerTabOverlay.lllIlIlIlIllll[8]] = lIlIIIlIlllllIIl("+JNILIBTEQ8=", "SFDSX");
        GuiPlayerTabOverlay.lllIlIlIlIlIII[GuiPlayerTabOverlay.lllIlIlIlIllll[21]] = lIlIIIlIllllllII("6RRz6uMHlA0=", "MeCaM");
        GuiPlayerTabOverlay.lllIlIlIlIlIII[GuiPlayerTabOverlay.lllIlIlIlIllll[22]] = lIlIIIlIlllllIIl("mLn3uFhaVdQ=", "deHvN");
    }
    
    private static boolean lIlIIIllIIIlIlII(final Object llllllllllllIlIllIllIIIIlllllIII, final Object llllllllllllIlIllIllIIIIllllIlll) {
        return llllllllllllIlIllIllIIIIlllllIII != llllllllllllIlIllIllIIIIllllIlll;
    }
    
    private static int lIlIIIllIIIlllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    static class PlayerComparator implements Comparator<NetworkPlayerInfo>
    {
        private static final /* synthetic */ int[] lIlIIIIIllIlIl;
        private static final /* synthetic */ String[] lIlIIIIIllIlII;
        
        private static String lllIIIIIllIlIII(String lllllllllllllIIlIIIIlllIIlIllIIl, final String lllllllllllllIIlIIIIlllIIlIlllIl) {
            lllllllllllllIIlIIIIlllIIlIllIIl = new String(Base64.getDecoder().decode(lllllllllllllIIlIIIIlllIIlIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIlIIIIlllIIlIlllII = new StringBuilder();
            final char[] lllllllllllllIIlIIIIlllIIlIllIll = lllllllllllllIIlIIIIlllIIlIlllIl.toCharArray();
            int lllllllllllllIIlIIIIlllIIlIllIlI = PlayerComparator.lIlIIIIIllIlIl[1];
            final boolean lllllllllllllIIlIIIIlllIIlIlIlII = (Object)lllllllllllllIIlIIIIlllIIlIllIIl.toCharArray();
            final float lllllllllllllIIlIIIIlllIIlIlIIll = lllllllllllllIIlIIIIlllIIlIlIlII.length;
            String lllllllllllllIIlIIIIlllIIlIlIIlI = (String)PlayerComparator.lIlIIIIIllIlIl[1];
            while (lllIIIIIllIllll((int)lllllllllllllIIlIIIIlllIIlIlIIlI, (int)lllllllllllllIIlIIIIlllIIlIlIIll)) {
                final char lllllllllllllIIlIIIIlllIIlIlllll = lllllllllllllIIlIIIIlllIIlIlIlII[lllllllllllllIIlIIIIlllIIlIlIIlI];
                lllllllllllllIIlIIIIlllIIlIlllII.append((char)(lllllllllllllIIlIIIIlllIIlIlllll ^ lllllllllllllIIlIIIIlllIIlIllIll[lllllllllllllIIlIIIIlllIIlIllIlI % lllllllllllllIIlIIIIlllIIlIllIll.length]));
                "".length();
                ++lllllllllllllIIlIIIIlllIIlIllIlI;
                ++lllllllllllllIIlIIIIlllIIlIlIIlI;
                "".length();
                if (((0x67 ^ 0x58) & ~(0x64 ^ 0x5B)) == -" ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIlIIIIlllIIlIlllII);
        }
        
        private static boolean lllIIIIIllIllll(final int lllllllllllllIIlIIIIlllIIlIIlllI, final int lllllllllllllIIlIIIIlllIIlIIllIl) {
            return lllllllllllllIIlIIIIlllIIlIIlllI < lllllllllllllIIlIIIIlllIIlIIllIl;
        }
        
        private static String lllIIIIIllIlIIl(final String lllllllllllllIIlIIIIlllIIllIlllI, final String lllllllllllllIIlIIIIlllIIllIlIll) {
            try {
                final SecretKeySpec lllllllllllllIIlIIIIlllIIlllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIlllIIllIlIll.getBytes(StandardCharsets.UTF_8)), PlayerComparator.lIlIIIIIllIlIl[3]), "DES");
                final Cipher lllllllllllllIIlIIIIlllIIlllIIII = Cipher.getInstance("DES");
                lllllllllllllIIlIIIIlllIIlllIIII.init(PlayerComparator.lIlIIIIIllIlIl[2], lllllllllllllIIlIIIIlllIIlllIIIl);
                return new String(lllllllllllllIIlIIIIlllIIlllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIlllIIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIIIIlllIIllIllll) {
                lllllllllllllIIlIIIIlllIIllIllll.printStackTrace();
                return null;
            }
        }
        
        private PlayerComparator() {
        }
        
        static {
            lllIIIIIllIllII();
            lllIIIIIllIlIlI();
        }
        
        private static void lllIIIIIllIlIlI() {
            (lIlIIIIIllIlII = new String[PlayerComparator.lIlIIIIIllIlIl[2]])[PlayerComparator.lIlIIIIIllIlIl[1]] = lllIIIIIllIlIII("", "UISoR");
            PlayerComparator.lIlIIIIIllIlII[PlayerComparator.lIlIIIIIllIlIl[0]] = lllIIIIIllIlIIl("xXPhmhfymRg=", "woMjp");
        }
        
        private static boolean lllIIIIIllIllIl(final Object lllllllllllllIIlIIIIlllIIlIIlIlI, final Object lllllllllllllIIlIIIIlllIIlIIlIIl) {
            return lllllllllllllIIlIIIIlllIIlIIlIlI != lllllllllllllIIlIIIIlllIIlIIlIIl;
        }
        
        private static void lllIIIIIllIllII() {
            (lIlIIIIIllIlIl = new int[4])[0] = " ".length();
            PlayerComparator.lIlIIIIIllIlIl[1] = ((0x47 ^ 0x17) & ~(0x3A ^ 0x6A));
            PlayerComparator.lIlIIIIIllIlIl[2] = "  ".length();
            PlayerComparator.lIlIIIIIllIlIl[3] = (0x5A ^ 0x34 ^ (0x7C ^ 0x1A));
        }
        
        private static boolean lllIIIIIllIlllI(final Object lllllllllllllIIlIIIIlllIIlIIIlll) {
            return lllllllllllllIIlIIIIlllIIlIIIlll != null;
        }
        
        @Override
        public int compare(final NetworkPlayerInfo lllllllllllllIIlIIIIlllIlIIIIIIl, final NetworkPlayerInfo lllllllllllllIIlIIIIlllIlIIIIIII) {
            final ScorePlayerTeam lllllllllllllIIlIIIIlllIlIIIIIll = lllllllllllllIIlIIIIlllIlIIIIIIl.getPlayerTeam();
            final ScorePlayerTeam lllllllllllllIIlIIIIlllIlIIIIIlI = lllllllllllllIIlIIIIlllIlIIIIIII.getPlayerTeam();
            final ComparisonChain start = ComparisonChain.start();
            int n;
            if (lllIIIIIllIllIl(lllllllllllllIIlIIIIlllIlIIIIIIl.getGameType(), WorldSettings.GameType.SPECTATOR)) {
                n = PlayerComparator.lIlIIIIIllIlIl[0];
                "".length();
                if (-(101 + 21 - 96 + 153 ^ 143 + 43 - 157 + 153) >= 0) {
                    return (0x95 ^ 0xC1 ^ (0x6C ^ 0x5B)) & (0xB1 ^ 0x83 ^ (0xFE ^ 0xAF) ^ -" ".length());
                }
            }
            else {
                n = PlayerComparator.lIlIIIIIllIlIl[1];
            }
            int n2;
            if (lllIIIIIllIllIl(lllllllllllllIIlIIIIlllIlIIIIIII.getGameType(), WorldSettings.GameType.SPECTATOR)) {
                n2 = PlayerComparator.lIlIIIIIllIlIl[0];
                "".length();
                if (-"   ".length() >= 0) {
                    return (0xD7 ^ 0x99) & ~(0x28 ^ 0x66);
                }
            }
            else {
                n2 = PlayerComparator.lIlIIIIIllIlIl[1];
            }
            final ComparisonChain compareTrueFirst = start.compareTrueFirst((boolean)(n != 0), (boolean)(n2 != 0));
            String registeredName;
            if (lllIIIIIllIlllI(lllllllllllllIIlIIIIlllIlIIIIIll)) {
                registeredName = lllllllllllllIIlIIIIlllIlIIIIIll.getRegisteredName();
                "".length();
                if (-" ".length() >= " ".length()) {
                    return (0x12 ^ 0x56 ^ (0xD7 ^ 0x8A)) & (0x9B ^ 0x91 ^ (0xB3 ^ 0xA0) ^ -" ".length());
                }
            }
            else {
                registeredName = PlayerComparator.lIlIIIIIllIlII[PlayerComparator.lIlIIIIIllIlIl[1]];
            }
            String registeredName2;
            if (lllIIIIIllIlllI(lllllllllllllIIlIIIIlllIlIIIIIlI)) {
                registeredName2 = lllllllllllllIIlIIIIlllIlIIIIIlI.getRegisteredName();
                "".length();
                if (((0x51 ^ 0x73) & ~(0x70 ^ 0x52)) != 0x0) {
                    return (0x7F ^ 0x30) & ~(0xF1 ^ 0xBE);
                }
            }
            else {
                registeredName2 = PlayerComparator.lIlIIIIIllIlII[PlayerComparator.lIlIIIIIllIlIl[0]];
            }
            return compareTrueFirst.compare((Comparable)registeredName, (Comparable)registeredName2).compare((Comparable)lllllllllllllIIlIIIIlllIlIIIIIIl.getGameProfile().getName(), (Comparable)lllllllllllllIIlIIIIlllIlIIIIIII.getGameProfile().getName()).result();
        }
    }
}
