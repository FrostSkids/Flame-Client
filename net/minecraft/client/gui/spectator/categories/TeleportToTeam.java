// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui.spectator.categories;

import java.util.Iterator;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.MathHelper;
import net.minecraft.client.gui.FontRenderer;
import java.util.Collection;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.client.entity.AbstractClientPlayer;
import java.util.Random;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.util.ResourceLocation;
import net.minecraft.scoreboard.ScorePlayerTeam;
import com.google.common.collect.Lists;
import net.minecraft.client.gui.spectator.SpectatorMenu;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiSpectator;
import net.minecraft.client.Minecraft;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import java.util.List;
import net.minecraft.client.gui.spectator.ISpectatorMenuView;
import net.minecraft.client.gui.spectator.ISpectatorMenuObject;

public class TeleportToTeam implements ISpectatorMenuObject, ISpectatorMenuView
{
    private static final /* synthetic */ String[] lllIIllIlllllI;
    private static final /* synthetic */ int[] lllIIlllIIIIIl;
    private final /* synthetic */ List<ISpectatorMenuObject> field_178672_a;
    
    @Override
    public IChatComponent getSpectatorName() {
        return new ChatComponentText(TeleportToTeam.lllIIllIlllllI[TeleportToTeam.lllIIlllIIIIIl[1]]);
    }
    
    @Override
    public IChatComponent func_178670_b() {
        return new ChatComponentText(TeleportToTeam.lllIIllIlllllI[TeleportToTeam.lllIIlllIIIIIl[0]]);
    }
    
    private static boolean lIlIIIIIlIIlllll(final int llllllllllllIlIlllIlllIIIlllIlIl, final int llllllllllllIlIlllIlllIIIlllIlII) {
        return llllllllllllIlIlllIlllIIIlllIlIl < llllllllllllIlIlllIlllIIIlllIlII;
    }
    
    private static void lIlIIIIIlIIlllII() {
        (lllIIlllIIIIIl = new int[5])[0] = ((0x31 ^ 0x79) & ~(0x5A ^ 0x12));
        TeleportToTeam.lllIIlllIIIIIl[1] = " ".length();
        TeleportToTeam.lllIIlllIIIIIl[2] = (23 + 108 + 1 + 30 ^ 102 + 90 - 97 + 83);
        TeleportToTeam.lllIIlllIIIIIl[3] = "  ".length();
        TeleportToTeam.lllIIlllIIIIIl[4] = (0x6E ^ 0x0 ^ (0x37 ^ 0x51));
    }
    
    @Override
    public List<ISpectatorMenuObject> func_178669_a() {
        return this.field_178672_a;
    }
    
    static {
        lIlIIIIIlIIlllII();
        lIlIIIIIlIIlIIll();
    }
    
    private static boolean lIlIIIIIlIIllllI(final int llllllllllllIlIlllIlllIIIlllIIlI) {
        return llllllllllllIlIlllIlllIIIlllIIlI != 0;
    }
    
    private static boolean lIlIIIIIlIIlllIl(final int llllllllllllIlIlllIlllIIIlllIIII) {
        return llllllllllllIlIlllIlllIIIlllIIII == 0;
    }
    
    private static String lIlIIIIIlIIlIIlI(String llllllllllllIlIlllIlllIIlIIIIIII, final String llllllllllllIlIlllIlllIIlIIIIlII) {
        llllllllllllIlIlllIlllIIlIIIIIII = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIlIlllIlllIIlIIIIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllIlllIIlIIIIIll = new StringBuilder();
        final char[] llllllllllllIlIlllIlllIIlIIIIIlI = llllllllllllIlIlllIlllIIlIIIIlII.toCharArray();
        int llllllllllllIlIlllIlllIIlIIIIIIl = TeleportToTeam.lllIIlllIIIIIl[0];
        final String llllllllllllIlIlllIlllIIIllllIll = (Object)((String)llllllllllllIlIlllIlllIIlIIIIIII).toCharArray();
        final double llllllllllllIlIlllIlllIIIllllIlI = llllllllllllIlIlllIlllIIIllllIll.length;
        char llllllllllllIlIlllIlllIIIllllIIl = (char)TeleportToTeam.lllIIlllIIIIIl[0];
        while (lIlIIIIIlIIlllll(llllllllllllIlIlllIlllIIIllllIIl, (int)llllllllllllIlIlllIlllIIIllllIlI)) {
            final char llllllllllllIlIlllIlllIIlIIIIllI = llllllllllllIlIlllIlllIIIllllIll[llllllllllllIlIlllIlllIIIllllIIl];
            llllllllllllIlIlllIlllIIlIIIIIll.append((char)(llllllllllllIlIlllIlllIIlIIIIllI ^ llllllllllllIlIlllIlllIIlIIIIIlI[llllllllllllIlIlllIlllIIlIIIIIIl % llllllllllllIlIlllIlllIIlIIIIIlI.length]));
            "".length();
            ++llllllllllllIlIlllIlllIIlIIIIIIl;
            ++llllllllllllIlIlllIlllIIIllllIIl;
            "".length();
            if (" ".length() >= (105 + 27 - 49 + 110 ^ 132 + 26 - 114 + 153)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllIlllIIlIIIIIll);
    }
    
    private static String lIlIIIIIlIIlIIIl(final String llllllllllllIlIlllIlllIIlIIlIlIl, final String llllllllllllIlIlllIlllIIlIIlIlII) {
        try {
            final SecretKeySpec llllllllllllIlIlllIlllIIlIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIlllIIlIIlIlII.getBytes(StandardCharsets.UTF_8)), TeleportToTeam.lllIIlllIIIIIl[4]), "DES");
            final Cipher llllllllllllIlIlllIlllIIlIIlIlll = Cipher.getInstance("DES");
            llllllllllllIlIlllIlllIIlIIlIlll.init(TeleportToTeam.lllIIlllIIIIIl[3], llllllllllllIlIlllIlllIIlIIllIII);
            return new String(llllllllllllIlIlllIlllIIlIIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIlllIIlIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIlllIIlIIlIllI) {
            llllllllllllIlIlllIlllIIlIIlIllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean func_178662_A_() {
        final int llllllllllllIlIlllIlllIIlIIlllIl = (int)this.field_178672_a.iterator();
        "".length();
        if (((0x20 ^ 0x3D ^ (0xE0 ^ 0xAA)) & (185 + 22 - 17 + 34 ^ 117 + 13 - 94 + 147 ^ -" ".length())) > ((106 + 108 - 150 + 85 ^ 153 + 190 - 206 + 60) & ("   ".length() ^ (0xE6 ^ 0xB5) ^ -" ".length()))) {
            return ((0xF1 ^ 0x9D ^ (0x4F ^ 0x62)) & (115 + 49 - 53 + 99 ^ 135 + 142 - 237 + 107 ^ -" ".length())) != 0x0;
        }
        while (!lIlIIIIIlIIlllIl(((Iterator)llllllllllllIlIlllIlllIIlIIlllIl).hasNext() ? 1 : 0)) {
            final ISpectatorMenuObject llllllllllllIlIlllIlllIIlIlIIIII = ((Iterator<ISpectatorMenuObject>)llllllllllllIlIlllIlllIIlIIlllIl).next();
            if (lIlIIIIIlIIllllI(llllllllllllIlIlllIlllIIlIlIIIII.func_178662_A_() ? 1 : 0)) {
                return TeleportToTeam.lllIIlllIIIIIl[1] != 0;
            }
        }
        return TeleportToTeam.lllIIlllIIIIIl[0] != 0;
    }
    
    private static void lIlIIIIIlIIlIIll() {
        (lllIIllIlllllI = new String[TeleportToTeam.lllIIlllIIIIIl[3]])[TeleportToTeam.lllIIlllIIIIIl[0]] = lIlIIIIIlIIlIIIl("6dQbC5KXk3pv/n7VmcijG7/2zeQqKj036l18aNZO9EQ=", "IyuRP");
        TeleportToTeam.lllIIllIlllllI[TeleportToTeam.lllIIlllIIIIIl[1]] = lIlIIIIIlIIlIIlI("Hw0kHD4kGjxZOiRIPBwvJkglHCMpDTo=", "KhHyN");
    }
    
    @Override
    public void func_178663_a(final float llllllllllllIlIlllIlllIIlIlIIllI, final int llllllllllllIlIlllIlllIIlIlIIlIl) {
        Minecraft.getMinecraft().getTextureManager().bindTexture(GuiSpectator.field_175269_a);
        Gui.drawModalRectWithCustomSizedTexture(TeleportToTeam.lllIIlllIIIIIl[0], TeleportToTeam.lllIIlllIIIIIl[0], 16.0f, 0.0f, TeleportToTeam.lllIIlllIIIIIl[2], TeleportToTeam.lllIIlllIIIIIl[2], 256.0f, 256.0f);
    }
    
    @Override
    public void func_178661_a(final SpectatorMenu llllllllllllIlIlllIlllIIlIlIlIIl) {
        llllllllllllIlIlllIlllIIlIlIlIIl.func_178647_a(this);
    }
    
    public TeleportToTeam() {
        this.field_178672_a = (List<ISpectatorMenuObject>)Lists.newArrayList();
        final Minecraft llllllllllllIlIlllIlllIIlIlllIII = Minecraft.getMinecraft();
        final long llllllllllllIlIlllIlllIIlIllIIll = (long)llllllllllllIlIlllIlllIIlIlllIII.theWorld.getScoreboard().getTeams().iterator();
        "".length();
        if ("   ".length() != "   ".length()) {
            throw null;
        }
        while (!lIlIIIIIlIIlllIl(((Iterator)llllllllllllIlIlllIlllIIlIllIIll).hasNext() ? 1 : 0)) {
            final ScorePlayerTeam llllllllllllIlIlllIlllIIlIllIlll = ((Iterator<ScorePlayerTeam>)llllllllllllIlIlllIlllIIlIllIIll).next();
            this.field_178672_a.add(new TeamSelectionObject(llllllllllllIlIlllIlllIIlIllIlll));
            "".length();
        }
    }
    
    class TeamSelectionObject implements ISpectatorMenuObject
    {
        private final /* synthetic */ ResourceLocation field_178677_c;
        private final /* synthetic */ ScorePlayerTeam field_178676_b;
        private final /* synthetic */ List<NetworkPlayerInfo> field_178675_d;
        private static final /* synthetic */ int[] lIlIlllIlIlIIl;
        
        private static void llllIIllllIIlll() {
            (lIlIlllIlIlIIl = new int[10])[0] = -" ".length();
            TeamSelectionObject.lIlIlllIlIlIIl[1] = "  ".length();
            TeamSelectionObject.lIlIlllIlIlIIl[2] = " ".length();
            TeamSelectionObject.lIlIlllIlIlIIl[3] = (0xA0 ^ 0xB0);
            TeamSelectionObject.lIlIlllIlIlIIl[4] = (0x49 ^ 0x2E) + (0x47 ^ 0x75) - (121 + 25 - 13 + 18) + (235 + 34 - 30 + 14);
            TeamSelectionObject.lIlIlllIlIlIIl[5] = (0x9D ^ 0x95);
            TeamSelectionObject.lIlIlllIlIlIIl[6] = (0xBA ^ 0xB5);
            TeamSelectionObject.lIlIlllIlIlIIl[7] = (0x29 ^ 0x31);
            TeamSelectionObject.lIlIlllIlIlIIl[8] = (54 + 89 - 63 + 54 ^ 48 + 23 - 48 + 115);
            TeamSelectionObject.lIlIlllIlIlIIl[9] = ((44 + 120 - 80 + 162 ^ 75 + 96 - 78 + 72) & (25 + 37 + 115 + 37 ^ 47 + 58 - 91 + 119 ^ -" ".length()));
        }
        
        public TeamSelectionObject(final ScorePlayerTeam lllllllllllllIIIIlIllIIIlIIIlIll) {
            this.field_178676_b = lllllllllllllIIIIlIllIIIlIIIlIll;
            this.field_178675_d = (List<NetworkPlayerInfo>)Lists.newArrayList();
            final float lllllllllllllIIIIlIllIIIlIIIIIll = (float)lllllllllllllIIIIlIllIIIlIIIlIll.getMembershipCollection().iterator();
            "".length();
            if ("  ".length() < 0) {
                throw null;
            }
            while (!llllIIllllIlIIl(((Iterator)lllllllllllllIIIIlIllIIIlIIIIIll).hasNext() ? 1 : 0)) {
                final String lllllllllllllIIIIlIllIIIlIIIlIlI = ((Iterator<String>)lllllllllllllIIIIlIllIIIlIIIIIll).next();
                final NetworkPlayerInfo lllllllllllllIIIIlIllIIIlIIIlIIl = Minecraft.getMinecraft().getNetHandler().getPlayerInfo(lllllllllllllIIIIlIllIIIlIIIlIlI);
                if (llllIIllllIlIII(lllllllllllllIIIIlIllIIIlIIIlIIl)) {
                    this.field_178675_d.add(lllllllllllllIIIIlIllIIIlIIIlIIl);
                    "".length();
                }
            }
            if (llllIIllllIlIIl(this.field_178675_d.isEmpty() ? 1 : 0)) {
                final String lllllllllllllIIIIlIllIIIlIIIlIII = this.field_178675_d.get(new Random().nextInt(this.field_178675_d.size())).getGameProfile().getName();
                this.field_178677_c = AbstractClientPlayer.getLocationSkin(lllllllllllllIIIIlIllIIIlIIIlIII);
                AbstractClientPlayer.getDownloadImageSkin(this.field_178677_c, lllllllllllllIIIIlIllIIIlIIIlIII);
                "".length();
                "".length();
                if (((0xE8 ^ 0xA6 ^ (0x44 ^ 0x21)) & (0xF7 ^ 0x86 ^ (0x3A ^ 0x60) ^ -" ".length())) < 0) {
                    throw null;
                }
            }
            else {
                this.field_178677_c = DefaultPlayerSkin.getDefaultSkinLegacy();
            }
        }
        
        @Override
        public IChatComponent getSpectatorName() {
            return new ChatComponentText(this.field_178676_b.getTeamName());
        }
        
        static {
            llllIIllllIIlll();
        }
        
        private static boolean llllIIllllIllII(final int lllllllllllllIIIIlIllIIIIlIlIllI) {
            return lllllllllllllIIIIlIllIIIIlIlIllI != 0;
        }
        
        @Override
        public void func_178661_a(final SpectatorMenu lllllllllllllIIIIlIllIIIIlllllII) {
            lllllllllllllIIIIlIllIIIIlllllII.func_178647_a(new TeleportToPlayer(this.field_178675_d));
        }
        
        @Override
        public boolean func_178662_A_() {
            int n;
            if (llllIIllllIllII(this.field_178675_d.isEmpty() ? 1 : 0)) {
                n = TeamSelectionObject.lIlIlllIlIlIIl[9];
                "".length();
                if (-(73 + 43 + 11 + 16 ^ 7 + 114 - 7 + 24) >= 0) {
                    return ((0x21 ^ 0x60 ^ (0x23 ^ 0x6E)) & (0x34 ^ 0x1C ^ (0x1A ^ 0x3E) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = TeamSelectionObject.lIlIlllIlIlIIl[2];
            }
            return n != 0;
        }
        
        private static boolean llllIIllllIlIII(final Object lllllllllllllIIIIlIllIIIIlIllIII) {
            return lllllllllllllIIIIlIllIIIIlIllIII != null;
        }
        
        private static boolean llllIIllllIlIll(final int lllllllllllllIIIIlIllIIIIlIlIIlI) {
            return lllllllllllllIIIIlIllIIIIlIlIIlI >= 0;
        }
        
        private static boolean llllIIllllIlIIl(final int lllllllllllllIIIIlIllIIIIlIlIlII) {
            return lllllllllllllIIIIlIllIIIIlIlIlII == 0;
        }
        
        private static boolean llllIIllllIlIlI(final int lllllllllllllIIIIlIllIIIIlIllIll, final int lllllllllllllIIIIlIllIIIIlIllIlI) {
            return lllllllllllllIIIIlIllIIIIlIllIll >= lllllllllllllIIIIlIllIIIIlIllIlI;
        }
        
        @Override
        public void func_178663_a(final float lllllllllllllIIIIlIllIIIIllIllll, final int lllllllllllllIIIIlIllIIIIllIlllI) {
            int lllllllllllllIIIIlIllIIIIllIllIl = TeamSelectionObject.lIlIlllIlIlIIl[0];
            final String lllllllllllllIIIIlIllIIIIllIllII = FontRenderer.getFormatFromString(this.field_178676_b.getColorPrefix());
            if (llllIIllllIlIlI(lllllllllllllIIIIlIllIIIIllIllII.length(), TeamSelectionObject.lIlIlllIlIlIIl[1])) {
                lllllllllllllIIIIlIllIIIIllIllIl = Minecraft.getMinecraft().fontRendererObj.getColorCode(lllllllllllllIIIIlIllIIIIllIllII.charAt(TeamSelectionObject.lIlIlllIlIlIIl[2]));
            }
            if (llllIIllllIlIll(lllllllllllllIIIIlIllIIIIllIllIl)) {
                final float lllllllllllllIIIIlIllIIIIllIlIll = (lllllllllllllIIIIlIllIIIIllIllIl >> TeamSelectionObject.lIlIlllIlIlIIl[3] & TeamSelectionObject.lIlIlllIlIlIIl[4]) / 255.0f;
                final float lllllllllllllIIIIlIllIIIIllIlIlI = (lllllllllllllIIIIlIllIIIIllIllIl >> TeamSelectionObject.lIlIlllIlIlIIl[5] & TeamSelectionObject.lIlIlllIlIlIIl[4]) / 255.0f;
                final float lllllllllllllIIIIlIllIIIIllIlIIl = (lllllllllllllIIIIlIllIIIIllIllIl & TeamSelectionObject.lIlIlllIlIlIIl[4]) / 255.0f;
                Gui.drawRect(TeamSelectionObject.lIlIlllIlIlIIl[2], TeamSelectionObject.lIlIlllIlIlIIl[2], TeamSelectionObject.lIlIlllIlIlIIl[6], TeamSelectionObject.lIlIlllIlIlIIl[6], MathHelper.func_180183_b(lllllllllllllIIIIlIllIIIIllIlIll * lllllllllllllIIIIlIllIIIIllIllll, lllllllllllllIIIIlIllIIIIllIlIlI * lllllllllllllIIIIlIllIIIIllIllll, lllllllllllllIIIIlIllIIIIllIlIIl * lllllllllllllIIIIlIllIIIIllIllll) | lllllllllllllIIIIlIllIIIIllIlllI << TeamSelectionObject.lIlIlllIlIlIIl[7]);
            }
            Minecraft.getMinecraft().getTextureManager().bindTexture(this.field_178677_c);
            GlStateManager.color(lllllllllllllIIIIlIllIIIIllIllll, lllllllllllllIIIIlIllIIIIllIllll, lllllllllllllIIIIlIllIIIIllIllll, lllllllllllllIIIIlIllIIIIllIlllI / 255.0f);
            Gui.drawScaledCustomSizeModalRect(TeamSelectionObject.lIlIlllIlIlIIl[1], TeamSelectionObject.lIlIlllIlIlIIl[1], 8.0f, 8.0f, TeamSelectionObject.lIlIlllIlIlIIl[5], TeamSelectionObject.lIlIlllIlIlIIl[5], TeamSelectionObject.lIlIlllIlIlIIl[8], TeamSelectionObject.lIlIlllIlIlIIl[8], 64.0f, 64.0f);
            Gui.drawScaledCustomSizeModalRect(TeamSelectionObject.lIlIlllIlIlIIl[1], TeamSelectionObject.lIlIlllIlIlIIl[1], 40.0f, 8.0f, TeamSelectionObject.lIlIlllIlIlIIl[5], TeamSelectionObject.lIlIlllIlIlIIl[5], TeamSelectionObject.lIlIlllIlIlIIl[8], TeamSelectionObject.lIlIlllIlIlIIl[8], 64.0f, 64.0f);
        }
    }
}
