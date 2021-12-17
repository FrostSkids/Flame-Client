// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import java.util.List;
import net.minecraft.client.renderer.GlStateManager;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.net.UnknownHostException;
import net.minecraft.util.EnumChatFormatting;
import java.util.concurrent.ThreadPoolExecutor;
import net.minecraft.client.multiplayer.ServerData;
import org.apache.logging.log4j.Logger;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

public class ServerListEntryNormal implements GuiListExtended.IGuiListEntry
{
    private final /* synthetic */ ResourceLocation field_148306_i;
    private static final /* synthetic */ String[] llIIlIIIlIIIIl;
    private final /* synthetic */ Minecraft mc;
    private /* synthetic */ DynamicTexture field_148305_h;
    private final /* synthetic */ GuiMultiplayer field_148303_c;
    private static final /* synthetic */ ResourceLocation SERVER_SELECTION_BUTTONS;
    private final /* synthetic */ ServerData field_148301_e;
    private static final /* synthetic */ ResourceLocation UNKNOWN_SERVER;
    private static final /* synthetic */ ThreadPoolExecutor field_148302_b;
    private /* synthetic */ long field_148298_f;
    private static final /* synthetic */ int[] llIIlIIIlIllII;
    private /* synthetic */ String field_148299_g;
    
    @Override
    public void mouseReleased(final int llllllllllllIlllIIllIIIIIIlllIIl, final int llllllllllllIlllIIllIIIIIIlllIII, final int llllllllllllIlllIIllIIIIIIllIlll, final int llllllllllllIlllIIllIIIIIIllIllI, final int llllllllllllIlllIIllIIIIIIllIlIl, final int llllllllllllIlllIIllIIIIIIllIlII) {
    }
    
    private static void lIIIlIlllllIIIll() {
        (llIIlIIIlIllII = new int[25])[0] = (0x1B ^ 0x1E);
        ServerListEntryNormal.llIIlIIIlIllII[1] = ((0x56 ^ 0x9) & ~(0x46 ^ 0x19));
        ServerListEntryNormal.llIIlIIIlIllII[2] = " ".length();
        ServerListEntryNormal.llIIlIIIlIllII[3] = "  ".length();
        ServerListEntryNormal.llIIlIIIlIllII[4] = "   ".length();
        ServerListEntryNormal.llIIlIIIlIllII[5] = (0xAB ^ 0xAF);
        ServerListEntryNormal.llIIlIIIlIllII[6] = (0xD5 ^ 0xBA ^ (0x5 ^ 0x6C));
        ServerListEntryNormal.llIIlIIIlIllII[7] = (0x53 ^ 0x7C);
        ServerListEntryNormal.llIIlIIIlIllII[8] = (0x51 ^ 0x64 ^ (0xAB ^ 0xBE));
        ServerListEntryNormal.llIIlIIIlIllII[9] = (-" ".length() & (-1 & 0xFFFFFF));
        ServerListEntryNormal.llIIlIIIlIllII[10] = (0x8 ^ 0x4);
        ServerListEntryNormal.llIIlIIIlIllII[11] = (-(0xFFFFAFEE & 0x5E7F) & (0xFFFF8EED & 0x80FFFF));
        ServerListEntryNormal.llIIlIIIlIllII[12] = (85 + 149 - 183 + 107 ^ 41 + 88 - 119 + 135);
        ServerListEntryNormal.llIIlIIIlIllII[13] = (0x56 ^ 0x51);
        ServerListEntryNormal.llIIlIIIlIllII[14] = (0xCA ^ 0xC2);
        ServerListEntryNormal.llIIlIIIlIllII[15] = (0x7C ^ 0x75);
        ServerListEntryNormal.llIIlIIIlIllII[16] = (141 + 6 - 49 + 51 ^ 1 + 33 + 57 + 68);
        ServerListEntryNormal.llIIlIIIlIllII[17] = (0x7 ^ 0xC);
        ServerListEntryNormal.llIIlIIIlIllII[18] = 97 + 89 - 155 + 145;
        ServerListEntryNormal.llIIlIIIlIllII[19] = -(-(0x61 ^ 0x65) & (0xFFFFEFFB & 0x5F6F7F77));
        ServerListEntryNormal.llIIlIIIlIllII[20] = (0x33 ^ 0x23);
        ServerListEntryNormal.llIIlIIIlIllII[21] = (0x66 ^ 0xB ^ (0x5 ^ 0x28));
        ServerListEntryNormal.llIIlIIIlIllII[22] = (0x57 ^ 0x5A);
        ServerListEntryNormal.llIIlIIIlIllII[23] = (0x1B ^ 0xD ^ (0x6 ^ 0x1E));
        ServerListEntryNormal.llIIlIIIlIllII[24] = (0x13 ^ 0x5F ^ (0x40 ^ 0x1D));
    }
    
    private static boolean lIIIlIlllllIIlll(final int llllllllllllIlllIIlIllllllllIIII, final int llllllllllllIlllIIlIlllllllIllll) {
        return llllllllllllIlllIIlIllllllllIIII < llllllllllllIlllIIlIlllllllIllll;
    }
    
    private static boolean lIIIlIlllllIlllI(final Object llllllllllllIlllIIlIlllllllIIIll) {
        return llllllllllllIlllIIlIlllllllIIIll == null;
    }
    
    private static void lIIIlIllllIlIlIl() {
        (llIIlIIIlIIIIl = new String[ServerListEntryNormal.llIIlIIIlIllII[24]])[ServerListEntryNormal.llIIlIIIlIllII[1]] = lIIIlIllllIIlIIl("sWz/sUVebRrLh7d3qOah7H/UeUh+usUe", "qIwqU");
        ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[2]] = lIIIlIllllIIlIlI("NhMcJQcwExd+HysFB34HLB0KPgUsKRc0ADQTFn8CLBE=", "BvdQr");
        ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[3]] = lIIIlIllllIIlIll("59BqySeRibAxL1AUPjYdRz5nRXW1PTTMZOs41Ds7nBc8FJ0cS/s5ag==", "LHqhP");
        ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[4]] = lIIIlIllllIIlIll("HG8du979Oa5tyeP0Ca++NQ==", "UXEll");
        ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[5]] = lIIIlIllllIIlIll("t6lI02OxFEc=", "wWUQU");
        ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[0]] = lIIIlIllllIIlIIl("xgWCtOrOeAI=", "wUJYg");
        ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[6]] = lIIIlIllllIIlIll("c3+1sXveXBo=", "EHHgI");
        ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[13]] = lIIIlIllllIIlIIl("IIDpZgbDXPpwIuw2gKx4Bf6xUv5zVF65", "cqsFl");
        ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[14]] = lIIIlIllllIIlIIl("oDk98bsqYxivMSM7whspGWJXp4k2IGKe", "CWCiZ");
        ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[15]] = lIIIlIllllIIlIIl("nrJnCrITCg0ZJCjLd9tkVA==", "JkvgL");
        ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[16]] = lIIIlIllllIIlIlI("PAA=", "QsuBK");
        ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[17]] = lIIIlIllllIIlIlI("MgMgEgMMDWBbRA==", "bjNuj");
        ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[10]] = lIIIlIllllIIlIIl("rPq/dP+hcwVvg8F+zXu2hPczsHLdzCpj", "IiaAC");
        ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[22]] = lIIIlIllllIIlIll("iXb2Ayo68dpBLC+NZgW69kTe6Xub/Jli", "NOumr");
        ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[23]] = lIIIlIllllIIlIlI("Lxg6MBsPEmw4FAkYbDcYFFY/NAUQEz5x", "fvLQw");
        ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[12]] = lIIIlIllllIIlIIl("lqT5y5E6wyA=", "WUGgW");
        ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[20]] = lIIIlIllllIIlIll("8R7Od1CY6Ok=", "FqGxZ");
    }
    
    @Override
    public void drawEntry(final int llllllllllllIlllIIllIIIIlIIIIIIl, final int llllllllllllIlllIIllIIIIlIlIIIlI, final int llllllllllllIlllIIllIIIIIlllllll, final int llllllllllllIlllIIllIIIIIllllllI, final int llllllllllllIlllIIllIIIIlIIlllll, final int llllllllllllIlllIIllIIIIlIIllllI, final int llllllllllllIlllIIllIIIIIlllllII, final boolean llllllllllllIlllIIllIIIIlIIlllII) {
        if (lIIIlIlllllIIlIl(this.field_148301_e.field_78841_f ? 1 : 0)) {
            this.field_148301_e.field_78841_f = (ServerListEntryNormal.llIIlIIIlIllII[2] != 0);
            this.field_148301_e.pingToServer = -2L;
            this.field_148301_e.serverMOTD = ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[0]];
            this.field_148301_e.populationInfo = ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[6]];
            ServerListEntryNormal.field_148302_b.submit(new Runnable() {
                private static final /* synthetic */ int[] lllIIIllllIlll;
                private static final /* synthetic */ String[] lllIIIllllIllI;
                
                private static void lIIllllIIllIIlIl() {
                    (lllIIIllllIlll = new int[4])[0] = ((17 + 63 - 39 + 150 ^ 78 + 110 - 44 + 6) & (151 + 167 - 297 + 157 ^ 93 + 82 - 81 + 61 ^ -" ".length()));
                    ServerListEntryNormal$1.lllIIIllllIlll[1] = " ".length();
                    ServerListEntryNormal$1.lllIIIllllIlll[2] = "  ".length();
                    ServerListEntryNormal$1.lllIIIllllIlll[3] = (" ".length() ^ (0x12 ^ 0x1B));
                }
                
                static {
                    lIIllllIIllIIlIl();
                    lIIllllIIllIIlII();
                }
                
                private static void lIIllllIIllIIlII() {
                    (lllIIIllllIllI = new String[ServerListEntryNormal$1.lllIIIllllIlll[2]])[ServerListEntryNormal$1.lllIIIllllIlll[0]] = lIIllllIIllIIIIl("hkMfKC6FUDQjUTAH7Y4Z0eyHz7+mEDvQ", "dnNvC");
                    ServerListEntryNormal$1.lllIIIllllIllI[ServerListEntryNormal$1.lllIIIllllIlll[1]] = lIIllllIIllIIIll("27Dk3NSgOJTGeWE4iD26MUhpP6XorEAKuJWMxl9YC8w=", "zbuhF");
                }
                
                @Override
                public void run() {
                    try {
                        ServerListEntryNormal.this.field_148303_c.getOldServerPinger().ping(ServerListEntryNormal.this.field_148301_e);
                        "".length();
                        if (" ".length() == "  ".length()) {
                            return;
                        }
                    }
                    catch (UnknownHostException llllllllllllIlIllllllIIllIlIIllI) {
                        ServerListEntryNormal.this.field_148301_e.pingToServer = -1L;
                        ServerListEntryNormal.this.field_148301_e.serverMOTD = String.valueOf(new StringBuilder().append(EnumChatFormatting.DARK_RED).append(ServerListEntryNormal$1.lllIIIllllIllI[ServerListEntryNormal$1.lllIIIllllIlll[0]]));
                        "".length();
                        if (((0x21 ^ 0x6) & ~(0xBF ^ 0x98)) >= "  ".length()) {
                            return;
                        }
                    }
                    catch (Exception llllllllllllIlIllllllIIllIlIIlIl) {
                        ServerListEntryNormal.this.field_148301_e.pingToServer = -1L;
                        ServerListEntryNormal.this.field_148301_e.serverMOTD = String.valueOf(new StringBuilder().append(EnumChatFormatting.DARK_RED).append(ServerListEntryNormal$1.lllIIIllllIllI[ServerListEntryNormal$1.lllIIIllllIlll[1]]));
                    }
                }
                
                private static String lIIllllIIllIIIIl(final String llllllllllllIlIllllllIIllIIIllII, final String llllllllllllIlIllllllIIllIIIllIl) {
                    try {
                        final SecretKeySpec llllllllllllIlIllllllIIllIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllllIIllIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                        final Cipher llllllllllllIlIllllllIIllIIlIIII = Cipher.getInstance("Blowfish");
                        llllllllllllIlIllllllIIllIIlIIII.init(ServerListEntryNormal$1.lllIIIllllIlll[2], llllllllllllIlIllllllIIllIIlIIIl);
                        return new String(llllllllllllIlIllllllIIllIIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllllIIllIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception llllllllllllIlIllllllIIllIIIllll) {
                        llllllllllllIlIllllllIIllIIIllll.printStackTrace();
                        return null;
                    }
                }
                
                private static String lIIllllIIllIIIll(final String llllllllllllIlIllllllIIllIIllIll, final String llllllllllllIlIllllllIIllIIllIII) {
                    try {
                        final SecretKeySpec llllllllllllIlIllllllIIllIIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllllIIllIIllIII.getBytes(StandardCharsets.UTF_8)), ServerListEntryNormal$1.lllIIIllllIlll[3]), "DES");
                        final Cipher llllllllllllIlIllllllIIllIIlllIl = Cipher.getInstance("DES");
                        llllllllllllIlIllllllIIllIIlllIl.init(ServerListEntryNormal$1.lllIIIllllIlll[2], llllllllllllIlIllllllIIllIIllllI);
                        return new String(llllllllllllIlIllllllIIllIIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllllIIllIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception llllllllllllIlIllllllIIllIIlllII) {
                        llllllllllllIlIllllllIIllIIlllII.printStackTrace();
                        return null;
                    }
                }
            });
            "".length();
        }
        int n;
        if (lIIIlIlllllIIllI(this.field_148301_e.version, ServerListEntryNormal.llIIlIIIlIllII[7])) {
            n = ServerListEntryNormal.llIIlIIIlIllII[2];
            "".length();
            if ((0x1F ^ 0x6E ^ (0x1A ^ 0x6F)) < 0) {
                return;
            }
        }
        else {
            n = ServerListEntryNormal.llIIlIIIlIllII[1];
        }
        final boolean llllllllllllIlllIIllIIIIlIIllIll = n != 0;
        int n2;
        if (lIIIlIlllllIIlll(this.field_148301_e.version, ServerListEntryNormal.llIIlIIIlIllII[7])) {
            n2 = ServerListEntryNormal.llIIlIIIlIllII[2];
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        else {
            n2 = ServerListEntryNormal.llIIlIIIlIllII[1];
        }
        final boolean llllllllllllIlllIIllIIIIlIIllIlI = n2 != 0;
        int n3;
        if (lIIIlIlllllIIlIl(llllllllllllIlllIIllIIIIlIIllIll ? 1 : 0) && lIIIlIlllllIIlIl(llllllllllllIlllIIllIIIIlIIllIlI ? 1 : 0)) {
            n3 = ServerListEntryNormal.llIIlIIIlIllII[1];
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        }
        else {
            n3 = ServerListEntryNormal.llIIlIIIlIllII[2];
        }
        final boolean llllllllllllIlllIIllIIIIlIIllIIl = n3 != 0;
        this.mc.fontRendererObj.drawString(this.field_148301_e.serverName, llllllllllllIlllIIllIIIIlIlIIIlI + ServerListEntryNormal.llIIlIIIlIllII[8] + ServerListEntryNormal.llIIlIIIlIllII[4], llllllllllllIlllIIllIIIIIlllllll + ServerListEntryNormal.llIIlIIIlIllII[2], ServerListEntryNormal.llIIlIIIlIllII[9]);
        "".length();
        final List<String> llllllllllllIlllIIllIIIIlIIllIII = this.mc.fontRendererObj.listFormattedStringToWidth(this.field_148301_e.serverMOTD, llllllllllllIlllIIllIIIIIllllllI - ServerListEntryNormal.llIIlIIIlIllII[8] - ServerListEntryNormal.llIIlIIIlIllII[3]);
        int llllllllllllIlllIIllIIIIlIIlIlll = ServerListEntryNormal.llIIlIIIlIllII[1];
        "".length();
        if (((0x3C ^ 0x12) & ~(0xB3 ^ 0x9D)) > 0) {
            return;
        }
        while (!lIIIlIlllllIlIII(llllllllllllIlllIIllIIIIlIIlIlll, Math.min(llllllllllllIlllIIllIIIIlIIllIII.size(), ServerListEntryNormal.llIIlIIIlIllII[3]))) {
            this.mc.fontRendererObj.drawString(llllllllllllIlllIIllIIIIlIIllIII.get(llllllllllllIlllIIllIIIIlIIlIlll), llllllllllllIlllIIllIIIIlIlIIIlI + ServerListEntryNormal.llIIlIIIlIllII[8] + ServerListEntryNormal.llIIlIIIlIllII[4], llllllllllllIlllIIllIIIIIlllllll + ServerListEntryNormal.llIIlIIIlIllII[10] + this.mc.fontRendererObj.FONT_HEIGHT * llllllllllllIlllIIllIIIIlIIlIlll, ServerListEntryNormal.llIIlIIIlIllII[11]);
            "".length();
            ++llllllllllllIlllIIllIIIIlIIlIlll;
        }
        String s;
        if (lIIIlIlllllIlIIl(llllllllllllIlllIIllIIIIlIIllIIl ? 1 : 0)) {
            s = String.valueOf(new StringBuilder().append(EnumChatFormatting.DARK_RED).append(this.field_148301_e.gameVersion));
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            s = this.field_148301_e.populationInfo;
        }
        final String llllllllllllIlllIIllIIIIlIIlIllI = s;
        final int llllllllllllIlllIIllIIIIlIIlIlIl = this.mc.fontRendererObj.getStringWidth(llllllllllllIlllIIllIIIIlIIlIllI);
        this.mc.fontRendererObj.drawString(llllllllllllIlllIIllIIIIlIIlIllI, llllllllllllIlllIIllIIIIlIlIIIlI + llllllllllllIlllIIllIIIIIllllllI - llllllllllllIlllIIllIIIIlIIlIlIl - ServerListEntryNormal.llIIlIIIlIllII[12] - ServerListEntryNormal.llIIlIIIlIllII[3], llllllllllllIlllIIllIIIIIlllllll + ServerListEntryNormal.llIIlIIIlIllII[2], ServerListEntryNormal.llIIlIIIlIllII[11]);
        "".length();
        int llllllllllllIlllIIllIIIIlIIlIlII = ServerListEntryNormal.llIIlIIIlIllII[1];
        String llllllllllllIlllIIllIIIIlIIlIIll = null;
        int llllllllllllIlllIIllIIIIlIIIlIll;
        String llllllllllllIlllIIllIIIIlIIIIlll;
        if (lIIIlIlllllIlIIl(llllllllllllIlllIIllIIIIlIIllIIl ? 1 : 0)) {
            final int llllllllllllIlllIIllIIIIlIIlIIlI = ServerListEntryNormal.llIIlIIIlIllII[0];
            String s2;
            if (lIIIlIlllllIlIIl(llllllllllllIlllIIllIIIIlIIllIll ? 1 : 0)) {
                s2 = ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[13]];
                "".length();
                if ((16 + 73 + 17 + 24 ^ 56 + 0 + 36 + 43) == 0x0) {
                    return;
                }
            }
            else {
                s2 = ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[14]];
            }
            final String llllllllllllIlllIIllIIIIlIIIlIlI = s2;
            llllllllllllIlllIIllIIIIlIIlIIll = this.field_148301_e.playerList;
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lIIIlIlllllIlIIl(this.field_148301_e.field_78841_f ? 1 : 0) && lIIIlIlllllIlIIl(lIIIlIlllllIIlII(this.field_148301_e.pingToServer, -2L))) {
            if (lIIIlIlllllIlIlI(lIIIlIlllllIIlII(this.field_148301_e.pingToServer, 0L))) {
                final int llllllllllllIlllIIllIIIIlIIlIIIl = ServerListEntryNormal.llIIlIIIlIllII[0];
                "".length();
                if (-" ".length() > "  ".length()) {
                    return;
                }
            }
            else if (lIIIlIlllllIlIlI(lIIIlIlllllIIlII(this.field_148301_e.pingToServer, 150L))) {
                final int llllllllllllIlllIIllIIIIlIIlIIII = ServerListEntryNormal.llIIlIIIlIllII[1];
                "".length();
                if (" ".length() >= "  ".length()) {
                    return;
                }
            }
            else if (lIIIlIlllllIlIlI(lIIIlIlllllIIlII(this.field_148301_e.pingToServer, 300L))) {
                final int llllllllllllIlllIIllIIIIlIIIllll = ServerListEntryNormal.llIIlIIIlIllII[2];
                "".length();
                if (-" ".length() >= (0xA1 ^ 0xA5)) {
                    return;
                }
            }
            else if (lIIIlIlllllIlIlI(lIIIlIlllllIIlII(this.field_148301_e.pingToServer, 600L))) {
                final int llllllllllllIlllIIllIIIIlIIIlllI = ServerListEntryNormal.llIIlIIIlIllII[3];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (lIIIlIlllllIlIlI(lIIIlIlllllIIlII(this.field_148301_e.pingToServer, 1000L))) {
                final int llllllllllllIlllIIllIIIIlIIIllIl = ServerListEntryNormal.llIIlIIIlIllII[4];
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
            }
            else {
                final int llllllllllllIlllIIllIIIIlIIIllII = ServerListEntryNormal.llIIlIIIlIllII[5];
            }
            if (lIIIlIlllllIlIlI(lIIIlIlllllIIlII(this.field_148301_e.pingToServer, 0L))) {
                final String llllllllllllIlllIIllIIIIlIIIlIIl = ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[15]];
                "".length();
                if ((((0xB6 ^ 0x8D) & ~(0x56 ^ 0x6D)) ^ (0xA ^ 0xE)) < 0) {
                    return;
                }
            }
            else {
                final String llllllllllllIlllIIllIIIIlIIIlIII = String.valueOf(new StringBuilder(String.valueOf(this.field_148301_e.pingToServer)).append(ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[16]]));
                llllllllllllIlllIIllIIIIlIIlIIll = this.field_148301_e.playerList;
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
            }
        }
        else {
            llllllllllllIlllIIllIIIIlIIlIlII = ServerListEntryNormal.llIIlIIIlIllII[2];
            llllllllllllIlllIIllIIIIlIIIlIll = (int)(Minecraft.getSystemTime() / 100L + llllllllllllIlllIIllIIIIlIIIIIIl * ServerListEntryNormal.llIIlIIIlIllII[3] & 0x7L);
            if (lIIIlIlllllIIllI(llllllllllllIlllIIllIIIIlIIIlIll, ServerListEntryNormal.llIIlIIIlIllII[5])) {
                llllllllllllIlllIIllIIIIlIIIlIll = ServerListEntryNormal.llIIlIIIlIllII[14] - llllllllllllIlllIIllIIIIlIIIlIll;
            }
            llllllllllllIlllIIllIIIIlIIIIlll = ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[17]];
        }
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(Gui.icons);
        Gui.drawModalRectWithCustomSizedTexture(llllllllllllIlllIIllIIIIlIlIIIlI + llllllllllllIlllIIllIIIIIllllllI - ServerListEntryNormal.llIIlIIIlIllII[12], llllllllllllIlllIIllIIIIIlllllll, (float)(llllllllllllIlllIIllIIIIlIIlIlII * ServerListEntryNormal.llIIlIIIlIllII[16]), (float)(ServerListEntryNormal.llIIlIIIlIllII[18] + llllllllllllIlllIIllIIIIlIIIlIll * ServerListEntryNormal.llIIlIIIlIllII[14]), ServerListEntryNormal.llIIlIIIlIllII[16], ServerListEntryNormal.llIIlIIIlIllII[14], 256.0f, 256.0f);
        if (lIIIlIlllllIlIll(this.field_148301_e.getBase64EncodedIconData()) && lIIIlIlllllIIlIl(this.field_148301_e.getBase64EncodedIconData().equals(this.field_148299_g) ? 1 : 0)) {
            this.field_148299_g = this.field_148301_e.getBase64EncodedIconData();
            this.prepareServerIcon();
            this.field_148303_c.getServerList().saveServerList();
        }
        if (lIIIlIlllllIlIll(this.field_148305_h)) {
            this.func_178012_a(llllllllllllIlllIIllIIIIlIlIIIlI, llllllllllllIlllIIllIIIIIlllllll, this.field_148306_i);
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        else {
            this.func_178012_a(llllllllllllIlllIIllIIIIlIlIIIlI, llllllllllllIlllIIllIIIIIlllllll, ServerListEntryNormal.UNKNOWN_SERVER);
        }
        final int llllllllllllIlllIIllIIIIlIIIIllI = llllllllllllIlllIIllIIIIlIIllllI - llllllllllllIlllIIllIIIIlIlIIIlI;
        final int llllllllllllIlllIIllIIIIlIIIIlIl = llllllllllllIlllIIllIIIIIlllllII - llllllllllllIlllIIllIIIIIlllllll;
        if (lIIIlIlllllIlIII(llllllllllllIlllIIllIIIIlIIIIllI, llllllllllllIlllIIllIIIIIllllllI - ServerListEntryNormal.llIIlIIIlIllII[12]) && lIIIlIlllllIllII(llllllllllllIlllIIllIIIIlIIIIllI, llllllllllllIlllIIllIIIIIllllllI - ServerListEntryNormal.llIIlIIIlIllII[0]) && lIIIlIlllllIllIl(llllllllllllIlllIIllIIIIlIIIIlIl) && lIIIlIlllllIllII(llllllllllllIlllIIllIIIIlIIIIlIl, ServerListEntryNormal.llIIlIIIlIllII[14])) {
            this.field_148303_c.setHoveringText(llllllllllllIlllIIllIIIIlIIIIlll);
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        }
        else if (lIIIlIlllllIlIII(llllllllllllIlllIIllIIIIlIIIIllI, llllllllllllIlllIIllIIIIIllllllI - llllllllllllIlllIIllIIIIlIIlIlIl - ServerListEntryNormal.llIIlIIIlIllII[12] - ServerListEntryNormal.llIIlIIIlIllII[3]) && lIIIlIlllllIllII(llllllllllllIlllIIllIIIIlIIIIllI, llllllllllllIlllIIllIIIIIllllllI - ServerListEntryNormal.llIIlIIIlIllII[12] - ServerListEntryNormal.llIIlIIIlIllII[3]) && lIIIlIlllllIllIl(llllllllllllIlllIIllIIIIlIIIIlIl) && lIIIlIlllllIllII(llllllllllllIlllIIllIIIIlIIIIlIl, ServerListEntryNormal.llIIlIIIlIllII[14])) {
            this.field_148303_c.setHoveringText(llllllllllllIlllIIllIIIIlIIlIIll);
        }
        if (!lIIIlIlllllIIlIl(this.mc.gameSettings.touchscreen ? 1 : 0) || lIIIlIlllllIlIIl(llllllllllllIlllIIllIIIIlIIlllII ? 1 : 0)) {
            this.mc.getTextureManager().bindTexture(ServerListEntryNormal.SERVER_SELECTION_BUTTONS);
            Gui.drawRect(llllllllllllIlllIIllIIIIlIlIIIlI, llllllllllllIlllIIllIIIIIlllllll, llllllllllllIlllIIllIIIIlIlIIIlI + ServerListEntryNormal.llIIlIIIlIllII[8], llllllllllllIlllIIllIIIIIlllllll + ServerListEntryNormal.llIIlIIIlIllII[8], ServerListEntryNormal.llIIlIIIlIllII[19]);
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            final int llllllllllllIlllIIllIIIIlIIIIlII = llllllllllllIlllIIllIIIIlIIllllI - llllllllllllIlllIIllIIIIlIlIIIlI;
            final int llllllllllllIlllIIllIIIIlIIIIIll = llllllllllllIlllIIllIIIIIlllllII - llllllllllllIlllIIllIIIIIlllllll;
            if (lIIIlIlllllIlIIl(this.func_178013_b() ? 1 : 0)) {
                if (lIIIlIlllllIIlll(llllllllllllIlllIIllIIIIlIIIIlII, ServerListEntryNormal.llIIlIIIlIllII[8]) && lIIIlIlllllIIllI(llllllllllllIlllIIllIIIIlIIIIlII, ServerListEntryNormal.llIIlIIIlIllII[20])) {
                    Gui.drawModalRectWithCustomSizedTexture(llllllllllllIlllIIllIIIIlIlIIIlI, llllllllllllIlllIIllIIIIIlllllll, 0.0f, 32.0f, ServerListEntryNormal.llIIlIIIlIllII[8], ServerListEntryNormal.llIIlIIIlIllII[8], 256.0f, 256.0f);
                    "".length();
                    if ("  ".length() <= " ".length()) {
                        return;
                    }
                }
                else {
                    Gui.drawModalRectWithCustomSizedTexture(llllllllllllIlllIIllIIIIlIlIIIlI, llllllllllllIlllIIllIIIIIlllllll, 0.0f, 0.0f, ServerListEntryNormal.llIIlIIIlIllII[8], ServerListEntryNormal.llIIlIIIlIllII[8], 256.0f, 256.0f);
                }
            }
            if (lIIIlIlllllIlIIl(this.field_148303_c.func_175392_a(this, llllllllllllIlllIIllIIIIlIIIIIIl) ? 1 : 0)) {
                if (lIIIlIlllllIIlll(llllllllllllIlllIIllIIIIlIIIIlII, ServerListEntryNormal.llIIlIIIlIllII[20]) && lIIIlIlllllIIlll(llllllllllllIlllIIllIIIIlIIIIIll, ServerListEntryNormal.llIIlIIIlIllII[20])) {
                    Gui.drawModalRectWithCustomSizedTexture(llllllllllllIlllIIllIIIIlIlIIIlI, llllllllllllIlllIIllIIIIIlllllll, 96.0f, 32.0f, ServerListEntryNormal.llIIlIIIlIllII[8], ServerListEntryNormal.llIIlIIIlIllII[8], 256.0f, 256.0f);
                    "".length();
                    if (((0x39 ^ 0x28 ^ (0x7D ^ 0x23)) & (110 + 57 - 158 + 233 ^ 111 + 112 - 131 + 97 ^ -" ".length())) != 0x0) {
                        return;
                    }
                }
                else {
                    Gui.drawModalRectWithCustomSizedTexture(llllllllllllIlllIIllIIIIlIlIIIlI, llllllllllllIlllIIllIIIIIlllllll, 96.0f, 0.0f, ServerListEntryNormal.llIIlIIIlIllII[8], ServerListEntryNormal.llIIlIIIlIllII[8], 256.0f, 256.0f);
                }
            }
            if (lIIIlIlllllIlIIl(this.field_148303_c.func_175394_b(this, llllllllllllIlllIIllIIIIlIIIIIIl) ? 1 : 0)) {
                if (lIIIlIlllllIIlll(llllllllllllIlllIIllIIIIlIIIIlII, ServerListEntryNormal.llIIlIIIlIllII[20]) && lIIIlIlllllIIllI(llllllllllllIlllIIllIIIIlIIIIIll, ServerListEntryNormal.llIIlIIIlIllII[20])) {
                    Gui.drawModalRectWithCustomSizedTexture(llllllllllllIlllIIllIIIIlIlIIIlI, llllllllllllIlllIIllIIIIIlllllll, 64.0f, 32.0f, ServerListEntryNormal.llIIlIIIlIllII[8], ServerListEntryNormal.llIIlIIIlIllII[8], 256.0f, 256.0f);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    Gui.drawModalRectWithCustomSizedTexture(llllllllllllIlllIIllIIIIlIlIIIlI, llllllllllllIlllIIllIIIIIlllllll, 64.0f, 0.0f, ServerListEntryNormal.llIIlIIIlIllII[8], ServerListEntryNormal.llIIlIIIlIllII[8], 256.0f, 256.0f);
                }
            }
        }
    }
    
    private static boolean lIIIlIlllllIllIl(final int llllllllllllIlllIIlIllllllIlllIl) {
        return llllllllllllIlllIIlIllllllIlllIl >= 0;
    }
    
    @Override
    public boolean mousePressed(final int llllllllllllIlllIIllIIIIIlIIIIIl, final int llllllllllllIlllIIllIIIIIlIIIlll, final int llllllllllllIlllIIllIIIIIlIIIllI, final int llllllllllllIlllIIllIIIIIlIIIlIl, final int llllllllllllIlllIIllIIIIIlIIIIII, final int llllllllllllIlllIIllIIIIIIllllll) {
        if (lIIIlIlllllIllII(llllllllllllIlllIIllIIIIIlIIIIII, ServerListEntryNormal.llIIlIIIlIllII[8])) {
            if (lIIIlIlllllIIlll(llllllllllllIlllIIllIIIIIlIIIIII, ServerListEntryNormal.llIIlIIIlIllII[8]) && lIIIlIlllllIIllI(llllllllllllIlllIIllIIIIIlIIIIII, ServerListEntryNormal.llIIlIIIlIllII[20]) && lIIIlIlllllIlIIl(this.func_178013_b() ? 1 : 0)) {
                this.field_148303_c.selectServer(llllllllllllIlllIIllIIIIIlIIIIIl);
                this.field_148303_c.connectToSelected();
                return ServerListEntryNormal.llIIlIIIlIllII[2] != 0;
            }
            if (lIIIlIlllllIIlll(llllllllllllIlllIIllIIIIIlIIIIII, ServerListEntryNormal.llIIlIIIlIllII[20]) && lIIIlIlllllIIlll(llllllllllllIlllIIllIIIIIIllllll, ServerListEntryNormal.llIIlIIIlIllII[20]) && lIIIlIlllllIlIIl(this.field_148303_c.func_175392_a(this, llllllllllllIlllIIllIIIIIlIIIIIl) ? 1 : 0)) {
                this.field_148303_c.func_175391_a(this, llllllllllllIlllIIllIIIIIlIIIIIl, GuiScreen.isShiftKeyDown());
                return ServerListEntryNormal.llIIlIIIlIllII[2] != 0;
            }
            if (lIIIlIlllllIIlll(llllllllllllIlllIIllIIIIIlIIIIII, ServerListEntryNormal.llIIlIIIlIllII[20]) && lIIIlIlllllIIllI(llllllllllllIlllIIllIIIIIIllllll, ServerListEntryNormal.llIIlIIIlIllII[20]) && lIIIlIlllllIlIIl(this.field_148303_c.func_175394_b(this, llllllllllllIlllIIllIIIIIlIIIIIl) ? 1 : 0)) {
                this.field_148303_c.func_175393_b(this, llllllllllllIlllIIllIIIIIlIIIIIl, GuiScreen.isShiftKeyDown());
                return ServerListEntryNormal.llIIlIIIlIllII[2] != 0;
            }
        }
        this.field_148303_c.selectServer(llllllllllllIlllIIllIIIIIlIIIIIl);
        if (lIIIlIlllllIlIlI(lIIIlIllllllIIII(Minecraft.getSystemTime() - this.field_148298_f, 250L))) {
            this.field_148303_c.connectToSelected();
        }
        this.field_148298_f = Minecraft.getSystemTime();
        return ServerListEntryNormal.llIIlIIIlIllII[1] != 0;
    }
    
    static {
        lIIIlIlllllIIIll();
        lIIIlIllllIlIlIl();
        logger = LogManager.getLogger();
        field_148302_b = new ScheduledThreadPoolExecutor(ServerListEntryNormal.llIIlIIIlIllII[0], new ThreadFactoryBuilder().setNameFormat(ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[1]]).setDaemon((boolean)(ServerListEntryNormal.llIIlIIIlIllII[2] != 0)).build());
        UNKNOWN_SERVER = new ResourceLocation(ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[2]]);
        SERVER_SELECTION_BUTTONS = new ResourceLocation(ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[3]]);
    }
    
    protected ServerListEntryNormal(final GuiMultiplayer llllllllllllIlllIIllIIIIlIllllII, final ServerData llllllllllllIlllIIllIIIIlIlllIll) {
        this.field_148303_c = llllllllllllIlllIIllIIIIlIllllII;
        this.field_148301_e = llllllllllllIlllIIllIIIIlIlllIll;
        this.mc = Minecraft.getMinecraft();
        this.field_148306_i = new ResourceLocation(String.valueOf(new StringBuilder(ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[4]]).append(llllllllllllIlllIIllIIIIlIlllIll.serverIP).append(ServerListEntryNormal.llIIlIIIlIIIIl[ServerListEntryNormal.llIIlIIIlIllII[5]])));
        this.field_148305_h = (DynamicTexture)this.mc.getTextureManager().getTexture(this.field_148306_i);
    }
    
    private static boolean lIIIlIlllllIlIll(final Object llllllllllllIlllIIlIlllllllIIlIl) {
        return llllllllllllIlllIIlIlllllllIIlIl != null;
    }
    
    private static int lIIIlIlllllIIlII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static int lIIIlIllllllIIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    protected void func_178012_a(final int llllllllllllIlllIIllIIIIIllIIlll, final int llllllllllllIlllIIllIIIIIllIIllI, final ResourceLocation llllllllllllIlllIIllIIIIIllIIIIl) {
        this.mc.getTextureManager().bindTexture(llllllllllllIlllIIllIIIIIllIIIIl);
        GlStateManager.enableBlend();
        Gui.drawModalRectWithCustomSizedTexture(llllllllllllIlllIIllIIIIIllIIlll, llllllllllllIlllIIllIIIIIllIIllI, 0.0f, 0.0f, ServerListEntryNormal.llIIlIIIlIllII[8], ServerListEntryNormal.llIIlIIIlIllII[8], 32.0f, 32.0f);
        GlStateManager.disableBlend();
    }
    
    private static boolean lIIIlIlllllIllll(final int llllllllllllIlllIIlIlllllllllIII, final int llllllllllllIlllIIlIllllllllIlll) {
        return llllllllllllIlllIIlIlllllllllIII == llllllllllllIlllIIlIllllllllIlll;
    }
    
    private static boolean lIIIlIlllllIllII(final int llllllllllllIlllIIlIlllllllIllII, final int llllllllllllIlllIIlIlllllllIlIll) {
        return llllllllllllIlllIIlIlllllllIllII <= llllllllllllIlllIIlIlllllllIlIll;
    }
    
    private static boolean lIIIlIlllllIIllI(final int llllllllllllIlllIIlIlllllllIlIII, final int llllllllllllIlllIIlIlllllllIIlll) {
        return llllllllllllIlllIIlIlllllllIlIII > llllllllllllIlllIIlIlllllllIIlll;
    }
    
    private void prepareServerIcon() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        net/minecraft/client/gui/ServerListEntryNormal.field_148301_e:Lnet/minecraft/client/multiplayer/ServerData;
        //     4: invokevirtual   net/minecraft/client/multiplayer/ServerData.getBase64EncodedIconData:()Ljava/lang/String;
        //     7: invokestatic    net/minecraft/client/gui/ServerListEntryNormal.lIIIlIlllllIlllI:(Ljava/lang/Object;)Z
        //    10: ifeq            52
        //    13: aload_0         /* llllllllllllIlllIIllIIIIIlIllIIl */
        //    14: getfield        net/minecraft/client/gui/ServerListEntryNormal.mc:Lnet/minecraft/client/Minecraft;
        //    17: invokevirtual   net/minecraft/client/Minecraft.getTextureManager:()Lnet/minecraft/client/renderer/texture/TextureManager;
        //    20: aload_0         /* llllllllllllIlllIIllIIIIIlIllIIl */
        //    21: getfield        net/minecraft/client/gui/ServerListEntryNormal.field_148306_i:Lnet/minecraft/util/ResourceLocation;
        //    24: invokevirtual   net/minecraft/client/renderer/texture/TextureManager.deleteTexture:(Lnet/minecraft/util/ResourceLocation;)V
        //    27: aload_0         /* llllllllllllIlllIIllIIIIIlIllIIl */
        //    28: aconst_null    
        //    29: putfield        net/minecraft/client/gui/ServerListEntryNormal.field_148305_h:Lnet/minecraft/client/renderer/texture/DynamicTexture;
        //    32: ldc             ""
        //    34: invokevirtual   java/lang/String.length:()I
        //    37: pop            
        //    38: ldc             "  "
        //    40: invokevirtual   java/lang/String.length:()I
        //    43: ldc             "  "
        //    45: invokevirtual   java/lang/String.length:()I
        //    48: if_icmpeq       521
        //    51: return         
        //    52: aload_0         /* llllllllllllIlllIIllIIIIIlIllIIl */
        //    53: getfield        net/minecraft/client/gui/ServerListEntryNormal.field_148301_e:Lnet/minecraft/client/multiplayer/ServerData;
        //    56: invokevirtual   net/minecraft/client/multiplayer/ServerData.getBase64EncodedIconData:()Ljava/lang/String;
        //    59: getstatic       com/google/common/base/Charsets.UTF_8:Ljava/nio/charset/Charset;
        //    62: invokestatic    io/netty/buffer/Unpooled.copiedBuffer:(Ljava/lang/CharSequence;Ljava/nio/charset/Charset;)Lio/netty/buffer/ByteBuf;
        //    65: astore_1        /* llllllllllllIlllIIllIIIIIlIllIII */
        //    66: aload_1         /* llllllllllllIlllIIllIIIIIlIllIII */
        //    67: invokestatic    io/netty/handler/codec/base64/Base64.decode:(Lio/netty/buffer/ByteBuf;)Lio/netty/buffer/ByteBuf;
        //    70: astore_2        /* llllllllllllIlllIIllIIIIIlIlIlll */
        //    71: new             Lio/netty/buffer/ByteBufInputStream;
        //    74: dup            
        //    75: aload_2         /* llllllllllllIlllIIllIIIIIlIlIlll */
        //    76: invokespecial   io/netty/buffer/ByteBufInputStream.<init>:(Lio/netty/buffer/ByteBuf;)V
        //    79: invokestatic    net/minecraft/client/renderer/texture/TextureUtil.readBufferedImage:(Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;
        //    82: astore_3        /* llllllllllllIlllIIllIIIIIlIlIllI */
        //    83: aload_3         /* llllllllllllIlllIIllIIIIIlIlIllI */
        //    84: invokevirtual   java/awt/image/BufferedImage.getWidth:()I
        //    87: getstatic       net/minecraft/client/gui/ServerListEntryNormal.llIIlIIIlIllII:[I
        //    90: bipush          21
        //    92: iaload         
        //    93: invokestatic    net/minecraft/client/gui/ServerListEntryNormal.lIIIlIlllllIllll:(II)Z
        //    96: ifeq            126
        //    99: getstatic       net/minecraft/client/gui/ServerListEntryNormal.llIIlIIIlIllII:[I
        //   102: iconst_2       
        //   103: iaload         
        //   104: ldc             ""
        //   106: invokevirtual   java/lang/String.length:()I
        //   109: pop            
        //   110: ldc             " "
        //   112: invokevirtual   java/lang/String.length:()I
        //   115: ineg           
        //   116: ldc             " "
        //   118: invokevirtual   java/lang/String.length:()I
        //   121: ineg           
        //   122: if_icmpge       131
        //   125: return         
        //   126: getstatic       net/minecraft/client/gui/ServerListEntryNormal.llIIlIIIlIllII:[I
        //   129: iconst_1       
        //   130: iaload         
        //   131: getstatic       net/minecraft/client/gui/ServerListEntryNormal.llIIlIIIlIIIIl:[Ljava/lang/String;
        //   134: getstatic       net/minecraft/client/gui/ServerListEntryNormal.llIIlIIIlIllII:[I
        //   137: bipush          10
        //   139: iaload         
        //   140: aaload         
        //   141: getstatic       net/minecraft/client/gui/ServerListEntryNormal.llIIlIIIlIllII:[I
        //   144: iconst_1       
        //   145: iaload         
        //   146: anewarray       Ljava/lang/Object;
        //   149: invokestatic    org/apache/commons/lang3/Validate.validState:(ZLjava/lang/String;[Ljava/lang/Object;)V
        //   152: aload_3         /* llllllllllllIlllIIllIIIIIlIlIllI */
        //   153: invokevirtual   java/awt/image/BufferedImage.getHeight:()I
        //   156: getstatic       net/minecraft/client/gui/ServerListEntryNormal.llIIlIIIlIllII:[I
        //   159: bipush          21
        //   161: iaload         
        //   162: invokestatic    net/minecraft/client/gui/ServerListEntryNormal.lIIIlIlllllIllll:(II)Z
        //   165: ifeq            194
        //   168: getstatic       net/minecraft/client/gui/ServerListEntryNormal.llIIlIIIlIllII:[I
        //   171: iconst_2       
        //   172: iaload         
        //   173: ldc             ""
        //   175: invokevirtual   java/lang/String.length:()I
        //   178: pop            
        //   179: ldc             " "
        //   181: invokevirtual   java/lang/String.length:()I
        //   184: ineg           
        //   185: ldc             "  "
        //   187: invokevirtual   java/lang/String.length:()I
        //   190: if_icmple       199
        //   193: return         
        //   194: getstatic       net/minecraft/client/gui/ServerListEntryNormal.llIIlIIIlIllII:[I
        //   197: iconst_1       
        //   198: iaload         
        //   199: getstatic       net/minecraft/client/gui/ServerListEntryNormal.llIIlIIIlIIIIl:[Ljava/lang/String;
        //   202: getstatic       net/minecraft/client/gui/ServerListEntryNormal.llIIlIIIlIllII:[I
        //   205: bipush          22
        //   207: iaload         
        //   208: aaload         
        //   209: getstatic       net/minecraft/client/gui/ServerListEntryNormal.llIIlIIIlIllII:[I
        //   212: iconst_1       
        //   213: iaload         
        //   214: anewarray       Ljava/lang/Object;
        //   217: invokestatic    org/apache/commons/lang3/Validate.validState:(ZLjava/lang/String;[Ljava/lang/Object;)V
        //   220: aload_1         /* llllllllllllIlllIIllIIIIIlIllIII */
        //   221: invokevirtual   io/netty/buffer/ByteBuf.release:()Z
        //   224: ldc             ""
        //   226: invokevirtual   java/lang/String.length:()I
        //   229: pop2           
        //   230: aload_2         /* llllllllllllIlllIIllIIIIIlIlIlll */
        //   231: invokevirtual   io/netty/buffer/ByteBuf.release:()Z
        //   234: ldc             ""
        //   236: invokevirtual   java/lang/String.length:()I
        //   239: pop2           
        //   240: ldc             ""
        //   242: invokevirtual   java/lang/String.length:()I
        //   245: pop            
        //   246: bipush          106
        //   248: bipush          55
        //   250: ixor           
        //   251: bipush          115
        //   253: bipush          46
        //   255: ixor           
        //   256: iconst_m1      
        //   257: ixor           
        //   258: iand           
        //   259: ifeq            417
        //   262: return         
        //   263: astore          llllllllllllIlllIIllIIIIIlIlIlII
        //   265: getstatic       net/minecraft/client/gui/ServerListEntryNormal.logger:Lorg/apache/logging/log4j/Logger;
        //   268: new             Ljava/lang/StringBuilder;
        //   271: dup            
        //   272: getstatic       net/minecraft/client/gui/ServerListEntryNormal.llIIlIIIlIIIIl:[Ljava/lang/String;
        //   275: getstatic       net/minecraft/client/gui/ServerListEntryNormal.llIIlIIIlIllII:[I
        //   278: bipush          23
        //   280: iaload         
        //   281: aaload         
        //   282: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   285: aload_0         /* llllllllllllIlllIIllIIIIIlIllIIl */
        //   286: getfield        net/minecraft/client/gui/ServerListEntryNormal.field_148301_e:Lnet/minecraft/client/multiplayer/ServerData;
        //   289: getfield        net/minecraft/client/multiplayer/ServerData.serverName:Ljava/lang/String;
        //   292: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   295: getstatic       net/minecraft/client/gui/ServerListEntryNormal.llIIlIIIlIIIIl:[Ljava/lang/String;
        //   298: getstatic       net/minecraft/client/gui/ServerListEntryNormal.llIIlIIIlIllII:[I
        //   301: bipush          12
        //   303: iaload         
        //   304: aaload         
        //   305: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   308: aload_0         /* llllllllllllIlllIIllIIIIIlIllIIl */
        //   309: getfield        net/minecraft/client/gui/ServerListEntryNormal.field_148301_e:Lnet/minecraft/client/multiplayer/ServerData;
        //   312: getfield        net/minecraft/client/multiplayer/ServerData.serverIP:Ljava/lang/String;
        //   315: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   318: getstatic       net/minecraft/client/gui/ServerListEntryNormal.llIIlIIIlIIIIl:[Ljava/lang/String;
        //   321: getstatic       net/minecraft/client/gui/ServerListEntryNormal.llIIlIIIlIllII:[I
        //   324: bipush          20
        //   326: iaload         
        //   327: aaload         
        //   328: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   331: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   334: aload           llllllllllllIlllIIllIIIIIlIlIlII
        //   336: invokeinterface org/apache/logging/log4j/Logger.error:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   341: aload_0         /* llllllllllllIlllIIllIIIIIlIllIIl */
        //   342: getfield        net/minecraft/client/gui/ServerListEntryNormal.field_148301_e:Lnet/minecraft/client/multiplayer/ServerData;
        //   345: aconst_null    
        //   346: invokevirtual   net/minecraft/client/multiplayer/ServerData.setBase64EncodedIconData:(Ljava/lang/String;)V
        //   349: aload_1         /* llllllllllllIlllIIllIIIIIlIllIII */
        //   350: invokevirtual   io/netty/buffer/ByteBuf.release:()Z
        //   353: ldc             ""
        //   355: invokevirtual   java/lang/String.length:()I
        //   358: pop2           
        //   359: aload_2         /* llllllllllllIlllIIllIIIIIlIlIlll */
        //   360: invokevirtual   io/netty/buffer/ByteBuf.release:()Z
        //   363: ldc             ""
        //   365: invokevirtual   java/lang/String.length:()I
        //   368: pop2           
        //   369: ldc             ""
        //   371: invokevirtual   java/lang/String.length:()I
        //   374: pop            
        //   375: bipush          23
        //   377: bipush          75
        //   379: ixor           
        //   380: iconst_0       
        //   381: bipush          92
        //   383: ixor           
        //   384: iconst_m1      
        //   385: ixor           
        //   386: iand           
        //   387: ifeq            416
        //   390: return         
        //   391: astore          llllllllllllIlllIIllIIIIIlIIlllI
        //   393: aload_1         /* llllllllllllIlllIIllIIIIIlIllIII */
        //   394: invokevirtual   io/netty/buffer/ByteBuf.release:()Z
        //   397: ldc             ""
        //   399: invokevirtual   java/lang/String.length:()I
        //   402: pop2           
        //   403: aload_2         /* llllllllllllIlllIIllIIIIIlIlIlll */
        //   404: invokevirtual   io/netty/buffer/ByteBuf.release:()Z
        //   407: ldc             ""
        //   409: invokevirtual   java/lang/String.length:()I
        //   412: pop2           
        //   413: aload           llllllllllllIlllIIllIIIIIlIIlllI
        //   415: athrow         
        //   416: return         
        //   417: aload_0         /* llllllllllllIlllIIllIIIIIlIllIIl */
        //   418: getfield        net/minecraft/client/gui/ServerListEntryNormal.field_148305_h:Lnet/minecraft/client/renderer/texture/DynamicTexture;
        //   421: invokestatic    net/minecraft/client/gui/ServerListEntryNormal.lIIIlIlllllIlllI:(Ljava/lang/Object;)Z
        //   424: ifeq            470
        //   427: aload_0         /* llllllllllllIlllIIllIIIIIlIllIIl */
        //   428: new             Lnet/minecraft/client/renderer/texture/DynamicTexture;
        //   431: dup            
        //   432: aload_3         /* llllllllllllIlllIIllIIIIIlIlIlIl */
        //   433: invokevirtual   java/awt/image/BufferedImage.getWidth:()I
        //   436: aload_3         /* llllllllllllIlllIIllIIIIIlIlIlIl */
        //   437: invokevirtual   java/awt/image/BufferedImage.getHeight:()I
        //   440: invokespecial   net/minecraft/client/renderer/texture/DynamicTexture.<init>:(II)V
        //   443: putfield        net/minecraft/client/gui/ServerListEntryNormal.field_148305_h:Lnet/minecraft/client/renderer/texture/DynamicTexture;
        //   446: aload_0         /* llllllllllllIlllIIllIIIIIlIllIIl */
        //   447: getfield        net/minecraft/client/gui/ServerListEntryNormal.mc:Lnet/minecraft/client/Minecraft;
        //   450: invokevirtual   net/minecraft/client/Minecraft.getTextureManager:()Lnet/minecraft/client/renderer/texture/TextureManager;
        //   453: aload_0         /* llllllllllllIlllIIllIIIIIlIllIIl */
        //   454: getfield        net/minecraft/client/gui/ServerListEntryNormal.field_148306_i:Lnet/minecraft/util/ResourceLocation;
        //   457: aload_0         /* llllllllllllIlllIIllIIIIIlIllIIl */
        //   458: getfield        net/minecraft/client/gui/ServerListEntryNormal.field_148305_h:Lnet/minecraft/client/renderer/texture/DynamicTexture;
        //   461: invokevirtual   net/minecraft/client/renderer/texture/TextureManager.loadTexture:(Lnet/minecraft/util/ResourceLocation;Lnet/minecraft/client/renderer/texture/ITextureObject;)Z
        //   464: ldc             ""
        //   466: invokevirtual   java/lang/String.length:()I
        //   469: pop2           
        //   470: aload_3         /* llllllllllllIlllIIllIIIIIlIlIlIl */
        //   471: getstatic       net/minecraft/client/gui/ServerListEntryNormal.llIIlIIIlIllII:[I
        //   474: iconst_1       
        //   475: iaload         
        //   476: getstatic       net/minecraft/client/gui/ServerListEntryNormal.llIIlIIIlIllII:[I
        //   479: iconst_1       
        //   480: iaload         
        //   481: aload_3         /* llllllllllllIlllIIllIIIIIlIlIlIl */
        //   482: invokevirtual   java/awt/image/BufferedImage.getWidth:()I
        //   485: aload_3         /* llllllllllllIlllIIllIIIIIlIlIlIl */
        //   486: invokevirtual   java/awt/image/BufferedImage.getHeight:()I
        //   489: aload_0         /* llllllllllllIlllIIllIIIIIlIllIIl */
        //   490: getfield        net/minecraft/client/gui/ServerListEntryNormal.field_148305_h:Lnet/minecraft/client/renderer/texture/DynamicTexture;
        //   493: invokevirtual   net/minecraft/client/renderer/texture/DynamicTexture.getTextureData:()[I
        //   496: getstatic       net/minecraft/client/gui/ServerListEntryNormal.llIIlIIIlIllII:[I
        //   499: iconst_1       
        //   500: iaload         
        //   501: aload_3         /* llllllllllllIlllIIllIIIIIlIlIlIl */
        //   502: invokevirtual   java/awt/image/BufferedImage.getWidth:()I
        //   505: invokevirtual   java/awt/image/BufferedImage.getRGB:(IIII[III)[I
        //   508: ldc             ""
        //   510: invokevirtual   java/lang/String.length:()I
        //   513: pop2           
        //   514: aload_0         /* llllllllllllIlllIIllIIIIIlIllIIl */
        //   515: getfield        net/minecraft/client/gui/ServerListEntryNormal.field_148305_h:Lnet/minecraft/client/renderer/texture/DynamicTexture;
        //   518: invokevirtual   net/minecraft/client/renderer/texture/DynamicTexture.updateDynamicTexture:()V
        //   521: return         
        //    StackMapTable: 00 0B 34 FE 00 49 07 02 84 07 02 84 07 02 74 44 01 3E 44 01 FF 00 3F 00 03 07 00 02 07 02 84 07 02 84 00 01 07 02 50 F7 00 7F 07 02 50 FD 00 18 00 07 02 50 FF 00 00 00 04 07 00 02 07 02 84 07 02 84 07 02 74 00 00 34 F8 00 32
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  71     220    263    391    Ljava/lang/Throwable;
        //  71     220    391    416    Any
        //  263    349    391    416    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static boolean lIIIlIlllllIlIII(final int llllllllllllIlllIIlIllllllllIlII, final int llllllllllllIlllIIlIllllllllIIll) {
        return llllllllllllIlllIIlIllllllllIlII >= llllllllllllIlllIIlIllllllllIIll;
    }
    
    private static String lIIIlIllllIIlIll(final String llllllllllllIlllIIlIlllllllllllI, final String llllllllllllIlllIIlIllllllllllll) {
        try {
            final SecretKeySpec llllllllllllIlllIIllIIIIIIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlIllllllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIllIIIIIIIIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIllIIIIIIIIIIlI.init(ServerListEntryNormal.llIIlIIIlIllII[3], llllllllllllIlllIIllIIIIIIIIIIll);
            return new String(llllllllllllIlllIIllIIIIIIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlIlllllllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIllIIIIIIIIIIIl) {
            llllllllllllIlllIIllIIIIIIIIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIlIlllllIlIlI(final int llllllllllllIlllIIlIllllllIllIll) {
        return llllllllllllIlllIIlIllllllIllIll < 0;
    }
    
    private static boolean lIIIlIlllllIlIIl(final int llllllllllllIlllIIlIlllllllIIIIl) {
        return llllllllllllIlllIIlIlllllllIIIIl != 0;
    }
    
    public ServerData getServerData() {
        return this.field_148301_e;
    }
    
    private static String lIIIlIllllIIlIIl(final String llllllllllllIlllIIllIIIIIIlIIIll, final String llllllllllllIlllIIllIIIIIIlIIIlI) {
        try {
            final SecretKeySpec llllllllllllIlllIIllIIIIIIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIllIIIIIIlIIIlI.getBytes(StandardCharsets.UTF_8)), ServerListEntryNormal.llIIlIIIlIllII[14]), "DES");
            final Cipher llllllllllllIlllIIllIIIIIIlIIlll = Cipher.getInstance("DES");
            llllllllllllIlllIIllIIIIIIlIIlll.init(ServerListEntryNormal.llIIlIIIlIllII[3], llllllllllllIlllIIllIIIIIIlIlIII);
            return new String(llllllllllllIlllIIllIIIIIIlIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIllIIIIIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIllIIIIIIlIIllI) {
            llllllllllllIlllIIllIIIIIIlIIllI.printStackTrace();
            return null;
        }
    }
    
    private boolean func_178013_b() {
        return ServerListEntryNormal.llIIlIIIlIllII[2] != 0;
    }
    
    private static boolean lIIIlIlllllIIlIl(final int llllllllllllIlllIIlIllllllIlllll) {
        return llllllllllllIlllIIlIllllllIlllll == 0;
    }
    
    private static String lIIIlIllllIIlIlI(String llllllllllllIlllIIllIIIIIIIlIIII, final String llllllllllllIlllIIllIIIIIIIlIlII) {
        llllllllllllIlllIIllIIIIIIIlIIII = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIIllIIIIIIIlIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIllIIIIIIIlIIll = new StringBuilder();
        final char[] llllllllllllIlllIIllIIIIIIIlIIlI = llllllllllllIlllIIllIIIIIIIlIlII.toCharArray();
        int llllllllllllIlllIIllIIIIIIIlIIIl = ServerListEntryNormal.llIIlIIIlIllII[1];
        final byte llllllllllllIlllIIllIIIIIIIIlIll = (Object)((String)llllllllllllIlllIIllIIIIIIIlIIII).toCharArray();
        final double llllllllllllIlllIIllIIIIIIIIlIlI = llllllllllllIlllIIllIIIIIIIIlIll.length;
        short llllllllllllIlllIIllIIIIIIIIlIIl = (short)ServerListEntryNormal.llIIlIIIlIllII[1];
        while (lIIIlIlllllIIlll(llllllllllllIlllIIllIIIIIIIIlIIl, (int)llllllllllllIlllIIllIIIIIIIIlIlI)) {
            final char llllllllllllIlllIIllIIIIIIIlIllI = llllllllllllIlllIIllIIIIIIIIlIll[llllllllllllIlllIIllIIIIIIIIlIIl];
            llllllllllllIlllIIllIIIIIIIlIIll.append((char)(llllllllllllIlllIIllIIIIIIIlIllI ^ llllllllllllIlllIIllIIIIIIIlIIlI[llllllllllllIlllIIllIIIIIIIlIIIl % llllllllllllIlllIIllIIIIIIIlIIlI.length]));
            "".length();
            ++llllllllllllIlllIIllIIIIIIIlIIIl;
            ++llllllllllllIlllIIllIIIIIIIIlIIl;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIllIIIIIIIlIIll);
    }
    
    @Override
    public void setSelected(final int llllllllllllIlllIIllIIIIIIllllIl, final int llllllllllllIlllIIllIIIIIIllllII, final int llllllllllllIlllIIllIIIIIIlllIll) {
    }
}
