// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.stream;

import java.util.Iterator;
import tv.twitch.chat.ChatTokenizedMessage;
import tv.twitch.broadcast.VideoParams;
import net.minecraft.client.settings.GameSettings;
import tv.twitch.broadcast.EncodingCpuUsage;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.StreamInfo;
import java.util.Arrays;
import com.google.gson.JsonObject;
import java.io.IOException;
import net.minecraft.util.JsonUtils;
import com.google.gson.JsonParser;
import net.minecraft.util.HttpUtil;
import java.net.URL;
import java.net.URLEncoder;
import net.minecraft.client.renderer.OpenGlHelper;
import com.google.common.base.Strings;
import com.google.common.collect.Maps;
import com.mojang.authlib.properties.Property;
import net.minecraft.util.Util;
import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.LogManager;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import tv.twitch.AuthToken;
import net.minecraft.util.MathHelper;
import tv.twitch.broadcast.GameInfo;
import net.minecraft.event.ClickEvent;
import net.minecraft.event.HoverEvent;
import net.minecraft.client.gui.stream.GuiTwitchUserMode;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ChatComponentText;
import tv.twitch.chat.ChatUserSubscription;
import tv.twitch.chat.ChatUserMode;
import java.util.Set;
import tv.twitch.chat.ChatRawMessage;
import tv.twitch.broadcast.IngestList;
import tv.twitch.ErrorCode;
import net.minecraft.client.renderer.WorldRenderer;
import tv.twitch.broadcast.FrameBuffer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.GlStateManager;
import tv.twitch.chat.ChatUserInfo;
import java.util.Map;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.Logger;
import net.minecraft.util.IChatComponent;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.Minecraft;

public class TwitchStream implements IStream, BroadcastController.BroadcastListener, IngestServerTester.IngestTestListener, ChatController.ChatListener
{
    private final /* synthetic */ ChatController chatController;
    private final /* synthetic */ Minecraft mc;
    private /* synthetic */ boolean field_152957_i;
    private /* synthetic */ boolean loggedIn;
    private /* synthetic */ AuthFailureReason authFailureReason;
    private /* synthetic */ long field_152959_k;
    private static final /* synthetic */ String[] lIllIlIIlIIIII;
    private /* synthetic */ boolean field_152962_n;
    private /* synthetic */ boolean field_152963_o;
    private /* synthetic */ Framebuffer framebuffer;
    private final /* synthetic */ IChatComponent twitchComponent;
    private /* synthetic */ String field_176029_e;
    private final /* synthetic */ BroadcastController broadcastController;
    private /* synthetic */ int targetFPS;
    private static final /* synthetic */ Logger LOGGER;
    private static /* synthetic */ boolean field_152965_q;
    public static final /* synthetic */ Marker STREAM_MARKER;
    private final /* synthetic */ Map<String, ChatUserInfo> field_152955_g;
    private /* synthetic */ boolean field_152960_l;
    private static final /* synthetic */ int[] lIllIlIIlIlIll;
    
    @Override
    public void func_176024_e() {
    }
    
    public static float formatStreamBps(final float lllllllllllllIIIIIIIIlIIIllllIll) {
        return 0.1f + lllllllllllllIIIIIIIIlIIIllllIll * 0.1f;
    }
    
    @Override
    public void func_152901_c() {
        TwitchStream.LOGGER.info(TwitchStream.STREAM_MARKER, TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[46]]);
    }
    
    @Override
    public void func_152911_a(final Metadata lllllllllllllIIIIIIIIlIIlllllllI, final long lllllllllllllIIIIIIIIlIlIIIIIIIl) {
        if (llllllIIlIIlIll(this.isBroadcasting() ? 1 : 0) && llllllIIlIIlIll(this.field_152957_i ? 1 : 0)) {
            final long lllllllllllllIIIIIIIIlIlIIIIIIII = this.broadcastController.func_152844_x();
            if (llllllIIlIIllIl(this.broadcastController.func_152840_a(lllllllllllllIIIIIIIIlIIlllllllI.func_152810_c(), lllllllllllllIIIIIIIIlIlIIIIIIII + lllllllllllllIIIIIIIIlIlIIIIIIIl, lllllllllllllIIIIIIIIlIIlllllllI.func_152809_a(), lllllllllllllIIIIIIIIlIIlllllllI.func_152806_b()) ? 1 : 0)) {
                final Logger logger = TwitchStream.LOGGER;
                final Marker stream_MARKER = TwitchStream.STREAM_MARKER;
                final String s = TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[26]];
                final Object[] array = new Object[TwitchStream.lIllIlIIlIlIll[2]];
                array[TwitchStream.lIllIlIIlIlIll[0]] = lllllllllllllIIIIIIIIlIlIIIIIIII + lllllllllllllIIIIIIIIlIlIIIIIIIl;
                array[TwitchStream.lIllIlIIlIlIll[1]] = lllllllllllllIIIIIIIIlIIlllllllI;
                logger.warn(stream_MARKER, s, array);
                "".length();
                if (((0x5E ^ 0x56) & ~(0x65 ^ 0x6D) & ~((0x49 ^ 0x16) & ~(0xB ^ 0x54))) == " ".length()) {
                    return;
                }
            }
            else {
                final Logger logger2 = TwitchStream.LOGGER;
                final Marker stream_MARKER2 = TwitchStream.STREAM_MARKER;
                final String s2 = TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[27]];
                final Object[] array2 = new Object[TwitchStream.lIllIlIIlIlIll[2]];
                array2[TwitchStream.lIllIlIIlIlIll[0]] = lllllllllllllIIIIIIIIlIlIIIIIIII + lllllllllllllIIIIIIIIlIlIIIIIIIl;
                array2[TwitchStream.lIllIlIIlIlIll[1]] = lllllllllllllIIIIIIIIlIIlllllllI;
                logger2.debug(stream_MARKER2, s2, array2);
            }
        }
    }
    
    @Override
    public boolean func_152929_G() {
        int n;
        if (llllllIIlIIlllI(this.mc.gameSettings.streamMicToggleBehavior, TwitchStream.lIllIlIIlIlIll[1])) {
            n = TwitchStream.lIllIlIIlIlIll[1];
            "".length();
            if (" ".length() < 0) {
                return ((9 + 39 - 12 + 140 ^ 108 + 108 - 110 + 46) & (37 + 115 - 40 + 50 ^ 74 + 11 + 46 + 7 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = TwitchStream.lIllIlIIlIlIll[0];
        }
        final boolean lllllllllllllIIIIIIIIIllllIllIll = n != 0;
        if (llllllIIlIIllIl(this.field_152962_n ? 1 : 0) && llllllIIlIllllI(llllllIIllIIIIl(this.mc.gameSettings.streamMicVolume, 0.0f)) && llllllIIlIIlllI(lllllllllllllIIIIIIIIIllllIllIll ? 1 : 0, this.field_152963_o ? 1 : 0)) {
            return TwitchStream.lIllIlIIlIlIll[0] != 0;
        }
        return TwitchStream.lIllIlIIlIlIll[1] != 0;
    }
    
    @Override
    public IngestServerTester func_152932_y() {
        return this.broadcastController.isReady();
    }
    
    private static void llllllIIlIIIlIl() {
        (lIllIlIIlIIIII = new String[TwitchStream.lIllIlIIlIlIll[62]])[TwitchStream.lIllIlIIlIlIll[0]] = llllllIIIlIllII("aViLIAr4WaI=", "JhwIl");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[1]] = llllllIIIlIllIl("BW/4GyqJnJgtNdALQmmLtg==", "DwjEc");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[2]] = llllllIIIlIllII("963nxjB7yR6fAGV1SqmZ2Zy29vPv76Y3", "ypKOk");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[3]] = llllllIIIlIlllI("Cj0sCh1VOC8KCEsgOhE=", "fTNgm");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[4]] = llllllIIIlIlllI("IxheDCcvAw==", "LkpmU");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[5]] = llllllIIIlIllIl("ZY62xSatiNo=", "iKTbx");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[6]] = llllllIIIlIllIl("ZJkv+5vV6L4foRKBg3962Q==", "vnhYo");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[7]] = llllllIIIlIlllI("GR0kNDANBzFqZA==", "utFYV");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[8]] = llllllIIIlIllII("M+le4FQgKH4=", "kGnSN");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[10]] = llllllIIIlIllIl("ACk/fzWRv70SY7ptDKnxSM6dXt1vD1Ek5p8dZ8iCLo8=", "ZECXg");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[11]] = llllllIIIlIllII("BR9r4L4t/rmqHWLOssjPhYBF9z4BuZK6JJUj3Jm+4gY=", "rdAXf");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[12]] = llllllIIIlIlllI("NQENJRkJVgUkDgkTCiUTAhcQPgg=", "avdQz");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[13]] = llllllIIIlIllIl("oIQKK6m6RtQ2CoMMubUDy/dX+KRgP4no", "KRzUr");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[14]] = llllllIIIlIlllI("IwcbNTkJAA01Ig4AD3YwFQEFdiIQBxw1PkcNADciRx4NJHYSHQ0kdggeHD85CR0=", "gnhVV");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[15]] = llllllIIIlIllII("y5mnQfjm7kNN/L9sh3SfvJ2pk8C+t7Te8s3hggwYfMtguXr/nigY/eWUYtVVfMi0", "QXIeT");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[16]] = llllllIIIlIllIl("QstDut0mJTEgYzQ3LXujYvCvFyFL/svrktjxOlsDah2BEilcVNTyltfwa22JClrbOVWbayVdpDlYYXjV/9HwGw==", "bNTCq");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[17]] = llllllIIIlIlllI("MSwXIBYRNxAgFFI3Fm4HBSoNLRtSIBEvB1IiCm4GASYLbhoBYwo6ARciFCcdFQ==", "rCyNs");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[18]] = llllllIIIlIllII("QU8L27dg/yZ1YmcnLfSpS7qyZH5WCaWiaFNMMYkIr1s=", "gLccz");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[19]] = llllllIIIlIllII("ICu2mS9q13vnCJGtCYtQ9eWB+tD6byT51YTmhNUtHC4=", "DCRhP");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[26]] = llllllIIIlIllII("XypOlNJnKW3iS7CdkZ+fBJ8m2Y7+xeZEwx983yWdZ7zz6xp27HNXckzvzJgnjiTj", "oudjE");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[27]] = llllllIIIlIllIl("o+/pdem2bb1qjixEq2hNLnYQyDznVlogxkaZb5yJALs+AYuJ3TPq+A==", "aVZaG");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[28]] = llllllIIIlIllII("vCI5HmNhXYbBTRa5T5RTRrTyAuTR187Xg6YC7rA7hY2VWDiRIgoU6Lmy7gSZ7IA01F7uM021uxcpIqy2o7Sm6w==", "rCNvO");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[29]] = llllllIIIlIllIl("JPOIJAB2zfWs8nfxk1d+KGmraiRYR6I/pftArkuK++0PvtQ55opnoFXRNTyvmAbs", "FjjaN");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[30]] = llllllIIIlIlllI("AyYALW84IgI/YjgzHi4jJmcBLjYqIw0/I2s0CTo3LikPLmItNQMmYjA6TD8tazwRcWIwOg==", "KGlKB");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[31]] = llllllIIIlIllII("afV5M53aG/JxRkLcRlG9Q0JIskOcPyhryIYAZs8/TILasyYHEHpBoA==", "AgXcq");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[32]] = llllllIIIlIllII("QNzZRST6yOVzGq/B4CqGJXwsb/Yw4eEr5+fE14BiEE5IrjhaEJc16Ti+8de75cvq", "xDcTO");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[33]] = llllllIIIlIllII("/YFilkzQbbTvd66c/s5TcQC1/msfOnhspuj+HnlcGBHXfb6C1e4vjw==", "OGOnH");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[34]] = llllllIIIlIllII("Mo8jqUb5XKn6T71ir07GRw==", "lWSok");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[35]] = llllllIIIlIllIl("zcdNlv7mvObG9RhYClNJA1dn1Dg1yX9O+zcE2Bn5WvA=", "pceCa");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[36]] = llllllIIIlIllIl("6F2HYNYKu/8+wUXKzOUuf+WPS3hlOmAKWENCrtrSBL3r7Xk6WMtRtQ==", "hThKi");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[9]] = llllllIIIlIllIl("R+Vs4RU+tLTC4jusmdhN+eMLdmaQiHX+c4zAXPhLd1s=", "mAOQP");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[37]] = llllllIIIlIlllI("KQMQDQdFDQMQDAgcA0QcCx8CBwoAHwQCHAlWVx8URUQSFhsKHlcHBgEJVx8UTA==", "elwdi");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[38]] = llllllIIIlIllIl("M50+KaUWlkPbxOHpf/7tZ4LQrZfR95XYlxpdu9+FvHI=", "BEpHs");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[39]] = llllllIIIlIllIl("gAghsOYIFFhhEiLick5fXR+yF5Epg2RM", "CJSWT");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[40]] = llllllIIIlIllIl("0VbAMABipuRhNoIS0KGSeC7GRSH9kRYO+Eymq6hzzKLMgKDGSEld0oq/W0lQ4I8/", "EXDMs");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[41]] = llllllIIIlIllII("DWnaZ8bwN2EpyZ8C0bUTXTBn9W0547X4EGvGT9KTGbXU0S55IjS6531zMDw/0E2V", "myYix");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[42]] = llllllIIIlIllII("1fgvgt9OWKQDTA3m5QOFGeRQVc34rDjN", "AlmWQ");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[43]] = llllllIIIlIllIl("Ou18bsoh2DM=", "Gvpjw");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[44]] = llllllIIIlIlllI("Ww==", "rEdwG");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[45]] = llllllIIIlIllII("sPOD78VAixRON5B6jKZ5+T3/TRw/A5iZmm0xYdTH4Rw=", "xcnAm");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[46]] = llllllIIIlIllIl("MVH6FWfzAsPsbImspc8KC4gKWNkQJ0Xm3HO+kI29EJE=", "ZbQJQ");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[47]] = llllllIIIlIllIl("emMdfklSmz863vSKCPBKjclj6ZoX2C1U5TvxFMDvuhW/0AZjTAVoON9N23p88dV5", "zGGQL");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[48]] = llllllIIIlIllIl("1sXwRyJA63UW8V6DtHNF/wkiHyP1y/s3kRa68krXk854FjqIVRWHxPMZgAex3092q40rn/7ouOaJjVwPrOOAIzvDAmGC4z/bDs5fsekkgKdGFR46jk1R4mtnaJR7k05Li+nOo+33k9Ju60LCZmc3yEYVTEAvdc44", "phCCM");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[49]] = llllllIIIlIllII("ykEEM/ZH/oO4gsWs4K54OThj5frP+aDp9H37BqH+/LIHXvM8rasgaQ==", "JEFZm");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[50]] = llllllIIIlIllII("d//n56qc4l3sOg+hax5IB9gwb2vbHyqneE8PQ5e3mEw=", "qlTkO");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[51]] = llllllIIIlIllII("PeEVbIV4dgQeSmuKTUGr2m0jsSS92vippHyD7cFKdnw=", "GxtGG");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[52]] = llllllIIIlIllIl("+1yXydTuSoFbCoKIZwqjGUvfmDz+k0AukC4/FTfYYWE=", "oUvxL");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[53]] = llllllIIIlIlllI("KQM0BWoMCjwdLw5LIR5qGQMgBS4FHDs=", "jkUqJ");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[54]] = llllllIIIlIllIl("qYpZfEfEo6vuFUQCuiaAzQ==", "FIdAD");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[55]] = llllllIIIlIlllI("FR0BLAw=", "ppnXi");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[56]] = llllllIIIlIlllI("Hic5Iw==", "jBAWC");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[57]] = llllllIIIlIllIl("xD72m9Jk93E=", "anGcM");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[58]] = llllllIIIlIllIl("DB1leVR8782OocorWVr4YW4MYoVvoxrwVoguls4zDkI=", "WlUoN");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[59]] = llllllIIIlIllIl("TG6q/1ErSrE=", "dvrlD");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[60]] = llllllIIIlIlllI("IhkILGkCHgc2LAIFDDw=", "aqiXI");
        TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[61]] = llllllIIIlIllIl("eZ1SdM8Gf4gbfuocjFkW+zGaPVM6COoQ", "MZrlO");
    }
    
    private static int llllllIIlIllIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static int llllllIIlIlIIlI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public void func_152909_x() {
        final IngestServerTester lllllllllllllIIIIIIIIlIIIlllIIll = this.broadcastController.func_152838_J();
        if (llllllIIlIIllII(lllllllllllllIIIIIIIIlIIIlllIIll)) {
            lllllllllllllIIIIIIIIlIIIlllIIll.func_153042_a(this);
        }
    }
    
    @Override
    public void func_152922_k() {
        if (llllllIIlIIlIll(this.broadcastController.isBroadcasting() ? 1 : 0) && llllllIIlIIllIl(this.broadcastController.isBroadcastPaused() ? 1 : 0)) {
            final long lllllllllllllIIIIIIIIlIlIIlIlIIl = System.nanoTime();
            final long lllllllllllllIIIIIIIIlIlIIlIlIII = TwitchStream.lIllIlIIlIlIll[20] / this.targetFPS;
            final long lllllllllllllIIIIIIIIlIlIIlIIlll = lllllllllllllIIIIIIIIlIlIIlIlIIl - this.field_152959_k;
            int n;
            if (llllllIIlIlIlll(llllllIIlIlIIlI(lllllllllllllIIIIIIIIlIlIIlIIlll, lllllllllllllIIIIIIIIlIlIIlIlIII))) {
                n = TwitchStream.lIllIlIIlIlIll[1];
                "".length();
                if (((0xEB ^ 0xC1 ^ (0xD ^ 0x60)) & (0x9D ^ 0xC0 ^ (0x43 ^ 0x59) ^ -" ".length())) >= " ".length()) {
                    return;
                }
            }
            else {
                n = TwitchStream.lIllIlIIlIlIll[0];
            }
            final boolean lllllllllllllIIIIIIIIlIlIIlIIllI = n != 0;
            if (llllllIIlIIlIll(lllllllllllllIIIIIIIIlIlIIlIIllI ? 1 : 0)) {
                final FrameBuffer lllllllllllllIIIIIIIIlIlIIlIIlIl = this.broadcastController.func_152822_N();
                final Framebuffer lllllllllllllIIIIIIIIlIlIIlIIlII = this.mc.getFramebuffer();
                this.framebuffer.bindFramebuffer((boolean)(TwitchStream.lIllIlIIlIlIll[1] != 0));
                GlStateManager.matrixMode(TwitchStream.lIllIlIIlIlIll[21]);
                GlStateManager.pushMatrix();
                GlStateManager.loadIdentity();
                GlStateManager.ortho(0.0, this.framebuffer.framebufferWidth, this.framebuffer.framebufferHeight, 0.0, 1000.0, 3000.0);
                GlStateManager.matrixMode(TwitchStream.lIllIlIIlIlIll[22]);
                GlStateManager.pushMatrix();
                GlStateManager.loadIdentity();
                GlStateManager.translate(0.0f, 0.0f, -2000.0f);
                GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
                GlStateManager.viewport(TwitchStream.lIllIlIIlIlIll[0], TwitchStream.lIllIlIIlIlIll[0], this.framebuffer.framebufferWidth, this.framebuffer.framebufferHeight);
                GlStateManager.enableTexture2D();
                GlStateManager.disableAlpha();
                GlStateManager.disableBlend();
                final float lllllllllllllIIIIIIIIlIlIIlIIIll = (float)this.framebuffer.framebufferWidth;
                final float lllllllllllllIIIIIIIIlIlIIlIIIlI = (float)this.framebuffer.framebufferHeight;
                final float lllllllllllllIIIIIIIIlIlIIlIIIIl = lllllllllllllIIIIIIIIlIlIIlIIlII.framebufferWidth / (float)lllllllllllllIIIIIIIIlIlIIlIIlII.framebufferTextureWidth;
                final float lllllllllllllIIIIIIIIlIlIIlIIIII = lllllllllllllIIIIIIIIlIlIIlIIlII.framebufferHeight / (float)lllllllllllllIIIIIIIIlIlIIlIIlII.framebufferTextureHeight;
                lllllllllllllIIIIIIIIlIlIIlIIlII.bindFramebufferTexture();
                GL11.glTexParameterf(TwitchStream.lIllIlIIlIlIll[23], TwitchStream.lIllIlIIlIlIll[24], 9729.0f);
                GL11.glTexParameterf(TwitchStream.lIllIlIIlIlIll[23], TwitchStream.lIllIlIIlIlIll[25], 9729.0f);
                final Tessellator lllllllllllllIIIIIIIIlIlIIIlllll = Tessellator.getInstance();
                final WorldRenderer lllllllllllllIIIIIIIIlIlIIIllllI = lllllllllllllIIIIIIIIlIlIIIlllll.getWorldRenderer();
                lllllllllllllIIIIIIIIlIlIIIllllI.begin(TwitchStream.lIllIlIIlIlIll[7], DefaultVertexFormats.POSITION_TEX);
                lllllllllllllIIIIIIIIlIlIIIllllI.pos(0.0, lllllllllllllIIIIIIIIlIlIIlIIIlI, 0.0).tex(0.0, lllllllllllllIIIIIIIIlIlIIlIIIII).endVertex();
                lllllllllllllIIIIIIIIlIlIIIllllI.pos(lllllllllllllIIIIIIIIlIlIIlIIIll, lllllllllllllIIIIIIIIlIlIIlIIIlI, 0.0).tex(lllllllllllllIIIIIIIIlIlIIlIIIIl, lllllllllllllIIIIIIIIlIlIIlIIIII).endVertex();
                lllllllllllllIIIIIIIIlIlIIIllllI.pos(lllllllllllllIIIIIIIIlIlIIlIIIll, 0.0, 0.0).tex(lllllllllllllIIIIIIIIlIlIIlIIIIl, 0.0).endVertex();
                lllllllllllllIIIIIIIIlIlIIIllllI.pos(0.0, 0.0, 0.0).tex(0.0, 0.0).endVertex();
                lllllllllllllIIIIIIIIlIlIIIlllll.draw();
                lllllllllllllIIIIIIIIlIlIIlIIlII.unbindFramebufferTexture();
                GlStateManager.popMatrix();
                GlStateManager.matrixMode(TwitchStream.lIllIlIIlIlIll[21]);
                GlStateManager.popMatrix();
                GlStateManager.matrixMode(TwitchStream.lIllIlIIlIlIll[22]);
                this.broadcastController.captureFramebuffer(lllllllllllllIIIIIIIIlIlIIlIIlIl);
                this.framebuffer.unbindFramebuffer();
                this.broadcastController.submitStreamFrame(lllllllllllllIIIIIIIIlIlIIlIIlIl);
                "".length();
                this.field_152959_k = lllllllllllllIIIIIIIIlIlIIlIlIIl;
            }
        }
    }
    
    @Override
    public ErrorCode func_152912_E() {
        ErrorCode errorCode;
        if (llllllIIlIIllIl(TwitchStream.field_152965_q ? 1 : 0)) {
            errorCode = ErrorCode.TTV_EC_OS_TOO_OLD;
            "".length();
            if (-" ".length() >= "  ".length()) {
                return null;
            }
        }
        else {
            errorCode = this.broadcastController.getErrorCode();
        }
        return errorCode;
    }
    
    @Override
    public void func_176020_d(final String lllllllllllllIIIIIIIIlIIIIIIIIII) {
    }
    
    @Override
    public void func_152896_a(final IngestList lllllllllllllIIIIIIIIlIIlIlIIIIl) {
    }
    
    private static int llllllIIlIlllIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public ChatUserInfo func_152926_a(final String lllllllllllllIIIIIIIIIllllllIllI) {
        return this.field_152955_g.get(lllllllllllllIIIIIIIIIllllllIllI);
    }
    
    @Override
    public void func_180605_a(final String lllllllllllllIIIIIIIIlIIIlIlIIIl, final ChatRawMessage[] lllllllllllllIIIIIIIIlIIIlIIlIIl) {
        final byte lllllllllllllIIIIIIIIlIIIlIIIlIl = (Object)lllllllllllllIIIIIIIIlIIIlIIlIIl;
        final boolean lllllllllllllIIIIIIIIlIIIlIIIllI = lllllllllllllIIIIIIIIlIIIlIIlIIl.length != 0;
        int lllllllllllllIIIIIIIIlIIIlIIIlll = TwitchStream.lIllIlIIlIlIll[0];
        "".length();
        if ((0xB5 ^ 0xB1) == 0x0) {
            return;
        }
        while (!llllllIIllIIIII(lllllllllllllIIIIIIIIlIIIlIIIlll, lllllllllllllIIIIIIIIlIIIlIIIllI ? 1 : 0)) {
            final ChatRawMessage lllllllllllllIIIIIIIIlIIIlIIllll = lllllllllllllIIIIIIIIlIIIlIIIlIl[lllllllllllllIIIIIIIIlIIIlIIIlll];
            this.func_176027_a(lllllllllllllIIIIIIIIlIIIlIIllll.userName, lllllllllllllIIIIIIIIlIIIlIIllll);
            if (llllllIIlIIlIll(this.func_176028_a(lllllllllllllIIIIIIIIlIIIlIIllll.modes, lllllllllllllIIIIIIIIlIIIlIIllll.subscriptions, this.mc.gameSettings.streamChatUserFilter) ? 1 : 0)) {
                final IChatComponent lllllllllllllIIIIIIIIlIIIlIIlllI = new ChatComponentText(lllllllllllllIIIIIIIIlIIIlIIllll.userName);
                final StringBuilder sb = new StringBuilder(TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[54]]);
                String str;
                if (llllllIIlIIlIll(lllllllllllllIIIIIIIIlIIIlIIllll.action ? 1 : 0)) {
                    str = TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[55]];
                    "".length();
                    if ((0x84 ^ 0x80) <= ((0x46 ^ 0x6A) & ~(0x4A ^ 0x66))) {
                        return;
                    }
                }
                else {
                    str = TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[56]];
                }
                final String value = String.valueOf(sb.append(str));
                final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[TwitchStream.lIllIlIIlIlIll[3]];
                lllllllllllllIlIIlIlllIIlIIIIIIl[TwitchStream.lIllIlIIlIlIll[0]] = this.twitchComponent;
                lllllllllllllIlIIlIlllIIlIIIIIIl[TwitchStream.lIllIlIIlIlIll[1]] = lllllllllllllIIIIIIIIlIIIlIIlllI;
                lllllllllllllIlIIlIlllIIlIIIIIIl[TwitchStream.lIllIlIIlIlIll[2]] = EnumChatFormatting.getTextWithoutFormattingCodes(lllllllllllllIIIIIIIIlIIIlIIllll.message);
                final IChatComponent lllllllllllllIIIIIIIIlIIIlIIllIl = new ChatComponentTranslation(value, lllllllllllllIlIIlIlllIIlIIIIIIl);
                if (llllllIIlIIlIll(lllllllllllllIIIIIIIIlIIIlIIllll.action ? 1 : 0)) {
                    lllllllllllllIIIIIIIIlIIIlIIllIl.getChatStyle().setItalic((boolean)(TwitchStream.lIllIlIIlIlIll[1] != 0));
                    "".length();
                }
                final IChatComponent lllllllllllllIIIIIIIIlIIIlIIllII = new ChatComponentText(TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[57]]);
                lllllllllllllIIIIIIIIlIIIlIIllII.appendSibling(new ChatComponentTranslation(TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[58]], new Object[TwitchStream.lIllIlIIlIlIll[0]]));
                "".length();
                final int lllllllllllllIIIIIIIIlIIIlIIIIII = (int)GuiTwitchUserMode.func_152328_a(lllllllllllllIIIIIIIIlIIIlIIllll.modes, lllllllllllllIIIIIIIIlIIIlIIllll.subscriptions, null).iterator();
                "".length();
                if (-(0x82 ^ 0x86) >= 0) {
                    return;
                }
                while (!llllllIIlIIllIl(((Iterator)lllllllllllllIIIIIIIIlIIIlIIIIII).hasNext() ? 1 : 0)) {
                    final IChatComponent lllllllllllllIIIIIIIIlIIIlIIlIll = ((Iterator<IChatComponent>)lllllllllllllIIIIIIIIlIIIlIIIIII).next();
                    lllllllllllllIIIIIIIIlIIIlIIllII.appendText(TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[59]]);
                    "".length();
                    lllllllllllllIIIIIIIIlIIIlIIllII.appendSibling(lllllllllllllIIIIIIIIlIIIlIIlIll);
                    "".length();
                }
                lllllllllllllIIIIIIIIlIIIlIIlllI.getChatStyle().setChatHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, lllllllllllllIIIIIIIIlIIIlIIllII));
                "".length();
                lllllllllllllIIIIIIIIlIIIlIIlllI.getChatStyle().setChatClickEvent(new ClickEvent(ClickEvent.Action.TWITCH_USER_INFO, lllllllllllllIIIIIIIIlIIIlIIllll.userName));
                "".length();
                this.mc.ingameGUI.getChatGUI().printChatMessage(lllllllllllllIIIIIIIIlIIIlIIllIl);
            }
            ++lllllllllllllIIIIIIIIlIIIlIIIlll;
        }
    }
    
    @Override
    public boolean isReadyToBroadcast() {
        return this.broadcastController.isReadyToBroadcast();
    }
    
    @Override
    public void func_152917_b(final String lllllllllllllIIIIIIIIIlllllIlllI) {
        this.chatController.func_175986_a(this.field_176029_e, lllllllllllllIIIIIIIIIlllllIlllI);
        "".length();
    }
    
    private static boolean llllllIIlIIlIlI(final Object lllllllllllllIIIIIIIIIlllIIIlIIl, final Object lllllllllllllIIIIIIIIIlllIIIlIII) {
        return lllllllllllllIIIIIIIIIlllIIIlIIl == lllllllllllllIIIIIIIIIlllIIIlIII;
    }
    
    private static boolean llllllIIllIIIII(final int lllllllllllllIIIIIIIIIlllIIlIlIl, final int lllllllllllllIIIIIIIIIlllIIlIlII) {
        return lllllllllllllIIIIIIIIIlllIIlIlIl >= lllllllllllllIIIIIIIIIlllIIlIlII;
    }
    
    @Override
    public void stopBroadcasting() {
        if (llllllIIlIIlIll(this.broadcastController.stopBroadcasting() ? 1 : 0)) {
            TwitchStream.LOGGER.info(TwitchStream.STREAM_MARKER, TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[35]]);
            "".length();
            if (-" ".length() >= (0xD2 ^ 0x9B ^ (0x68 ^ 0x25))) {
                return;
            }
        }
        else {
            TwitchStream.LOGGER.warn(TwitchStream.STREAM_MARKER, TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[36]]);
        }
    }
    
    private static boolean llllllIIlIlIIII(final Object lllllllllllllIIIIIIIIIlllIIIllIl, final Object lllllllllllllIIIIIIIIIlllIIIllII) {
        return lllllllllllllIIIIIIIIIlllIIIllIl != lllllllllllllIIIIIIIIIlllIIIllII;
    }
    
    @Override
    public void func_176026_a(final Metadata lllllllllllllIIIIIIIIlIIlllIlIlI, final long lllllllllllllIIIIIIIIlIIllllIIIl, final long lllllllllllllIIIIIIIIlIIllllIIII) {
        if (llllllIIlIIlIll(this.isBroadcasting() ? 1 : 0) && llllllIIlIIlIll(this.field_152957_i ? 1 : 0)) {
            final long lllllllllllllIIIIIIIIlIIlllIllll = this.broadcastController.func_152844_x();
            final String lllllllllllllIIIIIIIIlIIlllIlllI = lllllllllllllIIIIIIIIlIIlllIlIlI.func_152809_a();
            final String lllllllllllllIIIIIIIIlIIlllIllIl = lllllllllllllIIIIIIIIlIIlllIlIlI.func_152806_b();
            final long lllllllllllllIIIIIIIIlIIlllIllII = this.broadcastController.func_177946_b(lllllllllllllIIIIIIIIlIIlllIlIlI.func_152810_c(), lllllllllllllIIIIIIIIlIIlllIllll + lllllllllllllIIIIIIIIlIIllllIIIl, lllllllllllllIIIIIIIIlIIlllIlllI, lllllllllllllIIIIIIIIlIIlllIllIl);
            if (llllllIIlIlllII(llllllIIlIllIll(lllllllllllllIIIIIIIIlIIlllIllII, 0L))) {
                final Logger logger = TwitchStream.LOGGER;
                final Marker stream_MARKER = TwitchStream.STREAM_MARKER;
                final String s = TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[28]];
                final Object[] array = new Object[TwitchStream.lIllIlIIlIlIll[3]];
                array[TwitchStream.lIllIlIIlIlIll[0]] = lllllllllllllIIIIIIIIlIIlllIllll + lllllllllllllIIIIIIIIlIIllllIIIl;
                array[TwitchStream.lIllIlIIlIlIll[1]] = lllllllllllllIIIIIIIIlIIlllIllll + lllllllllllllIIIIIIIIlIIllllIIII;
                array[TwitchStream.lIllIlIIlIlIll[2]] = lllllllllllllIIIIIIIIlIIlllIlIlI;
                logger.warn(stream_MARKER, s, array);
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
            else if (llllllIIlIIlIll(this.broadcastController.func_177947_a(lllllllllllllIIIIIIIIlIIlllIlIlI.func_152810_c(), lllllllllllllIIIIIIIIlIIlllIllll + lllllllllllllIIIIIIIIlIIllllIIII, lllllllllllllIIIIIIIIlIIlllIllII, lllllllllllllIIIIIIIIlIIlllIlllI, lllllllllllllIIIIIIIIlIIlllIllIl) ? 1 : 0)) {
                final Logger logger2 = TwitchStream.LOGGER;
                final Marker stream_MARKER2 = TwitchStream.STREAM_MARKER;
                final String s2 = TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[29]];
                final Object[] array2 = new Object[TwitchStream.lIllIlIIlIlIll[3]];
                array2[TwitchStream.lIllIlIIlIlIll[0]] = lllllllllllllIIIIIIIIlIIlllIllll + lllllllllllllIIIIIIIIlIIllllIIIl;
                array2[TwitchStream.lIllIlIIlIlIll[1]] = lllllllllllllIIIIIIIIlIIlllIllll + lllllllllllllIIIIIIIIlIIllllIIII;
                array2[TwitchStream.lIllIlIIlIlIll[2]] = lllllllllllllIIIIIIIIlIIlllIlIlI;
                logger2.debug(stream_MARKER2, s2, array2);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                final Logger logger3 = TwitchStream.LOGGER;
                final Marker stream_MARKER3 = TwitchStream.STREAM_MARKER;
                final String s3 = TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[30]];
                final Object[] array3 = new Object[TwitchStream.lIllIlIIlIlIll[3]];
                array3[TwitchStream.lIllIlIIlIlIll[0]] = lllllllllllllIIIIIIIIlIIlllIllll + lllllllllllllIIIIIIIIlIIllllIIIl;
                array3[TwitchStream.lIllIlIIlIlIll[1]] = lllllllllllllIIIIIIIIlIIlllIllll + lllllllllllllIIIIIIIIlIIllllIIII;
                array3[TwitchStream.lIllIlIIlIlIll[2]] = lllllllllllllIIIIIIIIlIIlllIlIlI;
                logger3.warn(stream_MARKER3, s3, array3);
            }
        }
    }
    
    @Override
    public void requestCommercial() {
        if (llllllIIlIIlIll(this.broadcastController.requestCommercial() ? 1 : 0)) {
            TwitchStream.LOGGER.debug(TwitchStream.STREAM_MARKER, TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[31]]);
            "".length();
            if (((0x53 ^ 0x5F ^ (0x25 ^ 0x32)) & (117 + 58 - 145 + 126 ^ 130 + 76 - 199 + 128 ^ -" ".length())) != ((0x3F ^ 0x5 ^ (0x89 ^ 0x98)) & (29 + 119 - 84 + 83 ^ 94 + 63 - 23 + 50 ^ -" ".length()))) {
                return;
            }
        }
        else {
            TwitchStream.LOGGER.warn(TwitchStream.STREAM_MARKER, TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[32]]);
        }
    }
    
    @Override
    public void func_176019_a(final String lllllllllllllIIIIIIIIlIIIIIIIlll, final String lllllllllllllIIIIIIIIlIIIIIIIllI) {
    }
    
    @Override
    public boolean func_152936_l() {
        return this.broadcastController.func_152849_q();
    }
    
    @Override
    public boolean func_152908_z() {
        return this.broadcastController.isIngestTesting();
    }
    
    @Override
    public void func_176017_a(final ChatController.ChatState lllllllllllllIIIIIIIIlIIIlIllllI) {
    }
    
    @Override
    public void func_180606_a(final String lllllllllllllIIIIIIIIlIIIIIIllIl) {
        TwitchStream.LOGGER.debug(TwitchStream.STREAM_MARKER, TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[60]]);
    }
    
    @Override
    public void func_152898_a(final ErrorCode lllllllllllllIIIIIIIIlIIlIlIllll, final GameInfo[] lllllllllllllIIIIIIIIlIIlIlIlllI) {
    }
    
    private static boolean llllllIIlIllllI(final int lllllllllllllIIIIIIIIIllIllllIlI) {
        return lllllllllllllIIIIIIIIIllIllllIlI > 0;
    }
    
    private static boolean llllllIIlIIllII(final Object lllllllllllllIIIIIIIIIlllIIIIllI) {
        return lllllllllllllIIIIIIIIIlllIIIIllI != null;
    }
    
    private static boolean llllllIIlIlllII(final int lllllllllllllIIIIIIIIIllIlllllII) {
        return lllllllllllllIIIIIIIIIllIlllllII < 0;
    }
    
    public static int formatStreamKbps(final float lllllllllllllIIIIIIIIlIIIllllllI) {
        return MathHelper.floor_float(230.0f + lllllllllllllIIIIIIIIlIIIllllllI * 3270.0f);
    }
    
    private void func_176027_a(final String lllllllllllllIIIIIIIIlIIIIllIIll, final ChatRawMessage lllllllllllllIIIIIIIIlIIIIllIIlI) {
        ChatUserInfo lllllllllllllIIIIIIIIlIIIIllIlIl = this.field_152955_g.get(lllllllllllllIIIIIIIIlIIIIllIIll);
        if (llllllIIlIlllll(lllllllllllllIIIIIIIIlIIIIllIlIl)) {
            lllllllllllllIIIIIIIIlIIIIllIlIl = new ChatUserInfo();
            lllllllllllllIIIIIIIIlIIIIllIlIl.displayName = lllllllllllllIIIIIIIIlIIIIllIIll;
            this.field_152955_g.put(lllllllllllllIIIIIIIIlIIIIllIIll, lllllllllllllIIIIIIIIlIIIIllIlIl);
            "".length();
        }
        lllllllllllllIIIIIIIIlIIIIllIlIl.subscriptions = lllllllllllllIIIIIIIIlIIIIllIIlI.subscriptions;
        lllllllllllllIIIIIIIIlIIIIllIlIl.modes = lllllllllllllIIIIIIIIlIIIIllIIlI.modes;
        lllllllllllllIIIIIIIIlIIIIllIlIl.nameColorARGB = lllllllllllllIIIIIIIIlIIIIllIIlI.nameColorARGB;
    }
    
    @Override
    public void updateStreamVolume() {
        if (llllllIIlIIlIll(this.isBroadcasting() ? 1 : 0)) {
            final float lllllllllllllIIIIIIIIlIIllIlIIll = this.mc.gameSettings.streamGameVolume;
            int n;
            if (llllllIIlIIllIl(this.field_152962_n ? 1 : 0) && llllllIIlIllllI(llllllIIlIlllIl(lllllllllllllIIIIIIIIlIIllIlIIll, 0.0f))) {
                n = TwitchStream.lIllIlIIlIlIll[0];
                "".length();
                if (((0xDA ^ 0x90) & ~(0xD3 ^ 0x99)) >= "  ".length()) {
                    return;
                }
            }
            else {
                n = TwitchStream.lIllIlIIlIlIll[1];
            }
            final boolean lllllllllllllIIIIIIIIlIIllIlIIlI = n != 0;
            final BroadcastController broadcastController = this.broadcastController;
            float playbackDeviceVolume;
            if (llllllIIlIIlIll(lllllllllllllIIIIIIIIlIIllIlIIlI ? 1 : 0)) {
                playbackDeviceVolume = 0.0f;
                "".length();
                if ("   ".length() <= -" ".length()) {
                    return;
                }
            }
            else {
                playbackDeviceVolume = lllllllllllllIIIIIIIIlIIllIlIIll;
            }
            broadcastController.setPlaybackDeviceVolume(playbackDeviceVolume);
            final BroadcastController broadcastController2 = this.broadcastController;
            float streamMicVolume;
            if (llllllIIlIIlIll(this.func_152929_G() ? 1 : 0)) {
                streamMicVolume = 0.0f;
                "".length();
                if ("  ".length() != "  ".length()) {
                    return;
                }
            }
            else {
                streamMicVolume = this.mc.gameSettings.streamMicVolume;
            }
            broadcastController2.setRecordingDeviceVolume(streamMicVolume);
        }
    }
    
    private static boolean llllllIIlIIlIll(final int lllllllllllllIIIIIIIIIlllIIIIIlI) {
        return lllllllllllllIIIIIIIIIlllIIIIIlI != 0;
    }
    
    @Override
    public void func_152900_a(final ErrorCode lllllllllllllIIIIIIIIlIIlIlllIII, final AuthToken lllllllllllllIIIIIIIIlIIlIllIlll) {
    }
    
    @Override
    public boolean isPaused() {
        return this.broadcastController.isBroadcastPaused();
    }
    
    @Override
    public void func_152899_b() {
        this.updateStreamVolume();
        TwitchStream.LOGGER.info(TwitchStream.STREAM_MARKER, TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[45]]);
    }
    
    @Override
    public void func_176018_a(final String lllllllllllllIIIIIIIIlIIIIIlllIl, final ChatUserInfo[] lllllllllllllIIIIIIIIlIIIIIlllII, final ChatUserInfo[] lllllllllllllIIIIIIIIlIIIIIllIll, final ChatUserInfo[] lllllllllllllIIIIIIIIlIIIIIllIlI) {
        short lllllllllllllIIIIIIIIlIIIIIIllll = (Object)lllllllllllllIIIIIIIIlIIIIIllIll;
        byte lllllllllllllIIIIIIIIlIIIIIlIIII = (byte)lllllllllllllIIIIIIIIlIIIIIllIll.length;
        byte lllllllllllllIIIIIIIIlIIIIIlIIIl = (byte)TwitchStream.lIllIlIIlIlIll[0];
        "".length();
        if (null != null) {
            return;
        }
        while (!llllllIIllIIIII(lllllllllllllIIIIIIIIlIIIIIlIIIl, lllllllllllllIIIIIIIIlIIIIIlIIII)) {
            final ChatUserInfo lllllllllllllIIIIIIIIlIIIIIllIIl = lllllllllllllIIIIIIIIlIIIIIIllll[lllllllllllllIIIIIIIIlIIIIIlIIIl];
            this.field_152955_g.remove(lllllllllllllIIIIIIIIlIIIIIllIIl.displayName);
            "".length();
            ++lllllllllllllIIIIIIIIlIIIIIlIIIl;
        }
        lllllllllllllIIIIIIIIlIIIIIIllll = (short)(Object)lllllllllllllIIIIIIIIlIIIIIllIlI;
        lllllllllllllIIIIIIIIlIIIIIlIIII = (byte)lllllllllllllIIIIIIIIlIIIIIllIlI.length;
        lllllllllllllIIIIIIIIlIIIIIlIIIl = (byte)TwitchStream.lIllIlIIlIlIll[0];
        "".length();
        if (null != null) {
            return;
        }
        while (!llllllIIllIIIII(lllllllllllllIIIIIIIIlIIIIIlIIIl, lllllllllllllIIIIIIIIlIIIIIlIIII)) {
            final ChatUserInfo lllllllllllllIIIIIIIIlIIIIIllIII = lllllllllllllIIIIIIIIlIIIIIIllll[lllllllllllllIIIIIIIIlIIIIIlIIIl];
            this.field_152955_g.put(lllllllllllllIIIIIIIIlIIIIIllIII.displayName, lllllllllllllIIIIIIIIlIIIIIllIII);
            "".length();
            ++lllllllllllllIIIIIIIIlIIIIIlIIIl;
        }
        lllllllllllllIIIIIIIIlIIIIIIllll = (short)(Object)lllllllllllllIIIIIIIIlIIIIIlllII;
        lllllllllllllIIIIIIIIlIIIIIlIIII = (byte)lllllllllllllIIIIIIIIlIIIIIlllII.length;
        lllllllllllllIIIIIIIIlIIIIIlIIIl = (byte)TwitchStream.lIllIlIIlIlIll[0];
        "".length();
        if (null != null) {
            return;
        }
        while (!llllllIIllIIIII(lllllllllllllIIIIIIIIlIIIIIlIIIl, lllllllllllllIIIIIIIIlIIIIIlIIII)) {
            final ChatUserInfo lllllllllllllIIIIIIIIlIIIIIlIlll = lllllllllllllIIIIIIIIlIIIIIIllll[lllllllllllllIIIIIIIIlIIIIIlIIIl];
            this.field_152955_g.put(lllllllllllllIIIIIIIIlIIIIIlIlll.displayName, lllllllllllllIIIIIIIIlIIIIIlIlll);
            "".length();
            ++lllllllllllllIIIIIIIIlIIIIIlIIIl;
        }
    }
    
    private static String llllllIIIlIllIl(final String lllllllllllllIIIIIIIIIlllIlIlllI, final String lllllllllllllIIIIIIIIIlllIlIlIll) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIIIIlllIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIIIlllIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIIIIIlllIllIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIIIIIlllIllIIII.init(TwitchStream.lIllIlIIlIlIll[2], lllllllllllllIIIIIIIIIlllIllIIIl);
            return new String(lllllllllllllIIIIIIIIIlllIllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIIIlllIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIIIIlllIlIllll) {
            lllllllllllllIIIIIIIIIlllIlIllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void func_152893_b(final ErrorCode lllllllllllllIIIIIIIIlIIlIIlllIl) {
        final Logger logger = TwitchStream.LOGGER;
        final Marker stream_MARKER = TwitchStream.STREAM_MARKER;
        final String s = TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[41]];
        final Object[] array = new Object[TwitchStream.lIllIlIIlIlIll[2]];
        array[TwitchStream.lIllIlIIlIlIll[0]] = ErrorCode.getString(lllllllllllllIIIIIIIIlIIlIIlllIl);
        array[TwitchStream.lIllIlIIlIlIll[1]] = lllllllllllllIIIIIIIIlIIlIIlllIl.getValue();
        logger.warn(stream_MARKER, s, array);
        this.mc.ingameGUI.getChatGUI().printChatMessageWithOptionalDeletion(new ChatComponentText(String.valueOf(new StringBuilder(TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[42]]).append(lllllllllllllIIIIIIIIlIIlIIlllIl).append(TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[43]]).append(ErrorCode.getString(lllllllllllllIIIIIIIIlIIlIIlllIl)).append(TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[44]]))), TwitchStream.lIllIlIIlIlIll[2]);
    }
    
    static {
        llllllIIlIIlIIl();
        llllllIIlIIIlIl();
        LOGGER = LogManager.getLogger();
        STREAM_MARKER = MarkerManager.getMarker(TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[0]]);
        try {
            if (llllllIIlIIlIlI(Util.getOSType(), Util.EnumOS.WINDOWS)) {
                System.loadLibrary(TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[1]]);
                System.loadLibrary(TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[2]]);
                System.loadLibrary(TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[3]]);
                if (llllllIIlIIlIll(System.getProperty(TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[4]]).contains(TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[5]]) ? 1 : 0)) {
                    System.loadLibrary(TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[6]]);
                    "".length();
                    if (-(0xD0 ^ 0xC5 ^ (0x3F ^ 0x2E)) > 0) {
                        return;
                    }
                }
                else {
                    System.loadLibrary(TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[7]]);
                }
            }
            TwitchStream.field_152965_q = (TwitchStream.lIllIlIIlIlIll[1] != 0);
            "".length();
            if ((0x88 ^ 0x8C) <= 0) {
                return;
            }
        }
        catch (Throwable lllllllllllllIIIIIIIIlIlIlIlllIl) {
            TwitchStream.field_152965_q = (TwitchStream.lIllIlIIlIlIll[0] != 0);
        }
    }
    
    protected void func_152942_I() {
        final ChatController.ChatState lllllllllllllIIIIIIIIlIlIIllllII = this.chatController.func_153000_j();
        final String lllllllllllllIIIIIIIIlIlIIlllIll = this.broadcastController.getChannelInfo().name;
        this.field_176029_e = lllllllllllllIIIIIIIIlIlIIlllIll;
        if (llllllIIlIlIIII(lllllllllllllIIIIIIIIlIlIIllllII, ChatController.ChatState.Initialized)) {
            final Logger logger = TwitchStream.LOGGER;
            final String s = TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[18]];
            final Object[] array = new Object[TwitchStream.lIllIlIIlIlIll[1]];
            array[TwitchStream.lIllIlIIlIlIll[0]] = lllllllllllllIIIIIIIIlIlIIllllII;
            logger.warn(s, array);
            "".length();
            if ((0x82 ^ 0x86) != (0x13 ^ 0x17)) {
                return;
            }
        }
        else if (llllllIIlIIlIlI(this.chatController.func_175989_e(this.field_176029_e), ChatController.EnumChannelState.Disconnected)) {
            this.chatController.func_152986_d(lllllllllllllIIIIIIIIlIlIIlllIll);
            "".length();
            "".length();
            if ((0x1A ^ 0x68 ^ (0xF4 ^ 0x82)) == 0x0) {
                return;
            }
        }
        else {
            final Logger logger2 = TwitchStream.LOGGER;
            final String s2 = TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[19]];
            final Object[] array2 = new Object[TwitchStream.lIllIlIIlIlIll[1]];
            array2[TwitchStream.lIllIlIIlIlIll[0]] = lllllllllllllIIIIIIIIlIlIIllllII;
            logger2.warn(s2, array2);
        }
    }
    
    private static boolean llllllIIllIIIlI(final int lllllllllllllIIIIIIIIIlllIIlIIIl, final int lllllllllllllIIIIIIIIIlllIIlIIII) {
        return lllllllllllllIIIIIIIIIlllIIlIIIl < lllllllllllllIIIIIIIIIlllIIlIIII;
    }
    
    @Override
    public void func_152907_a(final IngestServerTester lllllllllllllIIIIIIIIlIIlIIIIllI, final IngestServerTester.IngestTestState lllllllllllllIIIIIIIIlIIlIIIIlIl) {
        final Logger logger = TwitchStream.LOGGER;
        final Marker stream_MARKER = TwitchStream.STREAM_MARKER;
        final String s = TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[51]];
        final Object[] array = new Object[TwitchStream.lIllIlIIlIlIll[1]];
        array[TwitchStream.lIllIlIIlIlIll[0]] = lllllllllllllIIIIIIIIlIIlIIIIlIl;
        logger.debug(stream_MARKER, s, array);
        if (llllllIIlIIlIlI(lllllllllllllIIIIIIIIlIIlIIIIlIl, IngestServerTester.IngestTestState.Finished)) {
            this.field_152960_l = (TwitchStream.lIllIlIIlIlIll[1] != 0);
        }
    }
    
    public TwitchStream(final Minecraft lllllllllllllIIIIIIIIlIlIlIlIllI, final Property lllllllllllllIIIIIIIIlIlIlIlIlIl) {
        this.twitchComponent = new ChatComponentText(TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[8]]);
        this.field_152955_g = (Map<String, ChatUserInfo>)Maps.newHashMap();
        this.targetFPS = TwitchStream.lIllIlIIlIlIll[9];
        this.field_152959_k = 0L;
        this.field_152960_l = (TwitchStream.lIllIlIIlIlIll[0] != 0);
        this.authFailureReason = AuthFailureReason.ERROR;
        this.mc = lllllllllllllIIIIIIIIlIlIlIlIllI;
        this.broadcastController = new BroadcastController();
        this.chatController = new ChatController();
        this.broadcastController.func_152841_a(this);
        this.chatController.func_152990_a(this);
        this.broadcastController.func_152842_a(TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[10]]);
        this.chatController.func_152984_a(TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[11]]);
        this.twitchComponent.getChatStyle().setColor(EnumChatFormatting.DARK_PURPLE);
        "".length();
        if (llllllIIlIIllII(lllllllllllllIIIIIIIIlIlIlIlIlIl) && llllllIIlIIllIl(Strings.isNullOrEmpty(lllllllllllllIIIIIIIIlIlIlIlIlIl.getValue()) ? 1 : 0) && llllllIIlIIlIll(OpenGlHelper.framebufferSupported ? 1 : 0)) {
            final Thread lllllllllllllIIIIIIIIlIlIlIlIlII = new Thread(TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[12]]) {
                private static final /* synthetic */ String[] lllIlllIlIIIIl;
                private static final /* synthetic */ int[] lllIlllIlIlIll;
                
                private static boolean lIlIIlIllIlllIlI(final int llllllllllllIlIllIIIIIllllIlIlll) {
                    return llllllllllllIlIllIIIIIllllIlIlll != 0;
                }
                
                private static void lIlIIlIllIllIIll() {
                    (lllIlllIlIIIIl = new String[TwitchStream$1.lllIlllIlIlIll[10]])[TwitchStream$1.lllIlllIlIlIll[0]] = lIlIIlIllIlIIIll("EabuRAjNRj2hdc3bKjF+YfI6mBiVtQA6XGydH3PckC8hD7Eo+Kjbwuy8kC6kny6L", "xPNAx");
                    TwitchStream$1.lllIlllIlIIIIl[TwitchStream$1.lllIlllIlIlIll[1]] = lIlIIlIllIlIIIll("gdjEAG7dqrM=", "rwUyr");
                    TwitchStream$1.lllIlllIlIIIIl[TwitchStream$1.lllIlllIlIlIll[2]] = lIlIIlIllIlIllIl("Ih8FAjgeCRM=", "pzvrW");
                    TwitchStream$1.lllIlllIlIIIIl[TwitchStream$1.lllIlllIlIlIll[3]] = lIlIIlIllIlIllIl("JyY7Ejg=", "SIPwV");
                    TwitchStream$1.lllIlllIlIIIIl[TwitchStream$1.lllIlllIlIlIll[4]] = lIlIIlIllIlIIIll("CEJc1wIH6mI=", "syLyc");
                    TwitchStream$1.lllIlllIlIIIIl[TwitchStream$1.lllIlllIlIlIll[5]] = lIlIIlIllIlIllIl("JxcHGT08BQ8O", "Rdbkb");
                    TwitchStream$1.lllIlllIlIIIIl[TwitchStream$1.lllIlllIlIlIll[6]] = lIlIIlIllIlIIIll("6ikoRVcQJ6ei8WxuSD1+/jP7o6hUnhpVN5eRQTh6OQn5sKe90waOePO3VCcp26w6", "zPfHQ");
                    TwitchStream$1.lllIlllIlIIIIl[TwitchStream$1.lllIlllIlIlIll[7]] = lIlIIlIllIlIIIll("aZaUZtSVVpr5r6Hjn/w/3sQ9Hi53Va8q", "qelFE");
                    TwitchStream$1.lllIlllIlIIIIl[TwitchStream$1.lllIlllIlIlIll[8]] = lIlIIlIllIlIIIll("6RCJ5Y6y5/HEYYQ4vPuWzrx4oCoq0c2Wg/3FksgNrXWHJuWOgnh6hw==", "cKCnr");
                    TwitchStream$1.lllIlllIlIIIIl[TwitchStream$1.lllIlllIlIlIll[9]] = lIlIIlIllIlIIIll("uxUlnaIUOTELoJ8fj8zc0k7OnA5Ie7ZJysmPu446xfsKxfuFMGZqjg==", "ANzuv");
                }
                
                @Override
                public void run() {
                    try {
                        final URL llllllllllllIlIllIIIIlIIIIIlIIIl = new URL(String.valueOf(new StringBuilder(TwitchStream$1.lllIlllIlIIIIl[TwitchStream$1.lllIlllIlIlIll[0]]).append(URLEncoder.encode(lllllllllllllIIIIIIIIlIlIlIlIlIl.getValue(), TwitchStream$1.lllIlllIlIIIIl[TwitchStream$1.lllIlllIlIlIll[1]]))));
                        final String llllllllllllIlIllIIIIlIIIIIlIIII = HttpUtil.get(llllllllllllIlIllIIIIlIIIIIlIIIl);
                        final JsonObject llllllllllllIlIllIIIIlIIIIIIllll = JsonUtils.getJsonObject(new JsonParser().parse(llllllllllllIlIllIIIIlIIIIIlIIII), TwitchStream$1.lllIlllIlIIIIl[TwitchStream$1.lllIlllIlIlIll[2]]);
                        final JsonObject llllllllllllIlIllIIIIlIIIIIIlllI = JsonUtils.getJsonObject(llllllllllllIlIllIIIIlIIIIIIllll, TwitchStream$1.lllIlllIlIIIIl[TwitchStream$1.lllIlllIlIlIll[3]]);
                        if (lIlIIlIllIlllIlI(JsonUtils.getBoolean(llllllllllllIlIllIIIIlIIIIIIlllI, TwitchStream$1.lllIlllIlIIIIl[TwitchStream$1.lllIlllIlIlIll[4]]) ? 1 : 0)) {
                            final String llllllllllllIlIllIIIIlIIIIIIllIl = JsonUtils.getString(llllllllllllIlIllIIIIlIIIIIIlllI, TwitchStream$1.lllIlllIlIIIIl[TwitchStream$1.lllIlllIlIlIll[5]]);
                            final Logger access$0 = TwitchStream.LOGGER;
                            final Marker stream_MARKER = TwitchStream.STREAM_MARKER;
                            final String s = TwitchStream$1.lllIlllIlIIIIl[TwitchStream$1.lllIlllIlIlIll[6]];
                            final Object[] array = new Object[TwitchStream$1.lllIlllIlIlIll[1]];
                            array[TwitchStream$1.lllIlllIlIlIll[0]] = llllllllllllIlIllIIIIlIIIIIIllIl;
                            access$0.debug(stream_MARKER, s, array);
                            final AuthToken llllllllllllIlIllIIIIlIIIIIIllII = new AuthToken();
                            llllllllllllIlIllIIIIlIIIIIIllII.data = lllllllllllllIIIIIIIIlIlIlIlIlIl.getValue();
                            TwitchStream.this.broadcastController.func_152818_a(llllllllllllIlIllIIIIlIIIIIIllIl, llllllllllllIlIllIIIIlIIIIIIllII);
                            "".length();
                            TwitchStream.this.chatController.func_152998_c(llllllllllllIlIllIIIIlIIIIIIllIl);
                            TwitchStream.this.chatController.func_152994_a(llllllllllllIlIllIIIIlIIIIIIllII);
                            Runtime.getRuntime().addShutdownHook(new Thread(TwitchStream$1.lllIlllIlIIIIl[TwitchStream$1.lllIlllIlIlIll[7]]) {
                                @Override
                                public void run() {
                                    TwitchStream.this.shutdownStream();
                                }
                            });
                            TwitchStream.this.broadcastController.func_152817_A();
                            "".length();
                            TwitchStream.this.chatController.func_175984_n();
                            "".length();
                            "".length();
                            if ("   ".length() == 0) {
                                return;
                            }
                        }
                        else {
                            TwitchStream.access$3(TwitchStream.this, AuthFailureReason.INVALID_TOKEN);
                            TwitchStream.LOGGER.error(TwitchStream.STREAM_MARKER, TwitchStream$1.lllIlllIlIIIIl[TwitchStream$1.lllIlllIlIlIll[8]]);
                            "".length();
                            if (((0x7B ^ 0x4C) & ~(0xB8 ^ 0x8F)) != 0x0) {
                                return;
                            }
                        }
                    }
                    catch (IOException llllllllllllIlIllIIIIlIIIIIIlIll) {
                        TwitchStream.access$3(TwitchStream.this, AuthFailureReason.ERROR);
                        TwitchStream.LOGGER.error(TwitchStream.STREAM_MARKER, TwitchStream$1.lllIlllIlIIIIl[TwitchStream$1.lllIlllIlIlIll[9]], (Throwable)llllllllllllIlIllIIIIlIIIIIIlIll);
                    }
                }
                
                private static String lIlIIlIllIlIllIl(String llllllllllllIlIllIIIIIlllllIIlIl, final String llllllllllllIlIllIIIIIlllllIIlII) {
                    llllllllllllIlIllIIIIIlllllIIlIl = new String(Base64.getDecoder().decode(llllllllllllIlIllIIIIIlllllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                    final StringBuilder llllllllllllIlIllIIIIIlllllIlIII = new StringBuilder();
                    final char[] llllllllllllIlIllIIIIIlllllIIlll = llllllllllllIlIllIIIIIlllllIIlII.toCharArray();
                    int llllllllllllIlIllIIIIIlllllIIllI = TwitchStream$1.lllIlllIlIlIll[0];
                    final char llllllllllllIlIllIIIIIlllllIIIII = (Object)llllllllllllIlIllIIIIIlllllIIlIl.toCharArray();
                    final int llllllllllllIlIllIIIIIllllIlllll = llllllllllllIlIllIIIIIlllllIIIII.length;
                    long llllllllllllIlIllIIIIIllllIllllI = TwitchStream$1.lllIlllIlIlIll[0];
                    while (lIlIIlIllIlllIll((int)llllllllllllIlIllIIIIIllllIllllI, llllllllllllIlIllIIIIIllllIlllll)) {
                        final char llllllllllllIlIllIIIIIlllllIlIll = llllllllllllIlIllIIIIIlllllIIIII[llllllllllllIlIllIIIIIllllIllllI];
                        llllllllllllIlIllIIIIIlllllIlIII.append((char)(llllllllllllIlIllIIIIIlllllIlIll ^ llllllllllllIlIllIIIIIlllllIIlll[llllllllllllIlIllIIIIIlllllIIllI % llllllllllllIlIllIIIIIlllllIIlll.length]));
                        "".length();
                        ++llllllllllllIlIllIIIIIlllllIIllI;
                        ++llllllllllllIlIllIIIIIllllIllllI;
                        "".length();
                        if ((0xD2 ^ 0xAC ^ (0x41 ^ 0x3A)) == 0x0) {
                            return null;
                        }
                    }
                    return String.valueOf(llllllllllllIlIllIIIIIlllllIlIII);
                }
                
                private static void lIlIIlIllIlllIIl() {
                    (lllIlllIlIlIll = new int[11])[0] = ((0x44 ^ 0x6C ^ (0x84 ^ 0xB7)) & (0x31 ^ 0x18 ^ (0x7A ^ 0x48) ^ -" ".length()));
                    TwitchStream$1.lllIlllIlIlIll[1] = " ".length();
                    TwitchStream$1.lllIlllIlIlIll[2] = "  ".length();
                    TwitchStream$1.lllIlllIlIlIll[3] = "   ".length();
                    TwitchStream$1.lllIlllIlIlIll[4] = (0x29 ^ 0x2D);
                    TwitchStream$1.lllIlllIlIlIll[5] = (0x4 ^ 0x10 ^ (0x7E ^ 0x6F));
                    TwitchStream$1.lllIlllIlIlIll[6] = (0x9B ^ 0x9D);
                    TwitchStream$1.lllIlllIlIlIll[7] = (0xBD ^ 0xBA);
                    TwitchStream$1.lllIlllIlIlIll[8] = (0x3D ^ 0x24 ^ (0x28 ^ 0x39));
                    TwitchStream$1.lllIlllIlIlIll[9] = (0x67 ^ 0x2E ^ (0x7B ^ 0x3B));
                    TwitchStream$1.lllIlllIlIlIll[10] = (0x57 ^ 0x5D);
                }
                
                static {
                    lIlIIlIllIlllIIl();
                    lIlIIlIllIllIIll();
                }
                
                private static boolean lIlIIlIllIlllIll(final int llllllllllllIlIllIIIIIllllIllIlI, final int llllllllllllIlIllIIIIIllllIllIIl) {
                    return llllllllllllIlIllIIIIIllllIllIlI < llllllllllllIlIllIIIIIllllIllIIl;
                }
                
                private static String lIlIIlIllIlIIIll(final String llllllllllllIlIllIIIIIlllllllIII, final String llllllllllllIlIllIIIIIlllllllIIl) {
                    try {
                        final SecretKeySpec llllllllllllIlIllIIIIIllllllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIIIlllllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                        final Cipher llllllllllllIlIllIIIIIllllllllII = Cipher.getInstance("Blowfish");
                        llllllllllllIlIllIIIIIllllllllII.init(TwitchStream$1.lllIlllIlIlIll[2], llllllllllllIlIllIIIIIllllllllIl);
                        return new String(llllllllllllIlIllIIIIIllllllllII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIIIlllllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception llllllllllllIlIllIIIIIlllllllIll) {
                        llllllllllllIlIllIIIIIlllllllIll.printStackTrace();
                        return null;
                    }
                }
            };
            lllllllllllllIIIIIIIIlIlIlIlIlII.setDaemon((boolean)(TwitchStream.lIllIlIIlIlIll[1] != 0));
            lllllllllllllIIIIIIIIlIlIlIlIlII.start();
        }
    }
    
    private static boolean llllllIIlIIlllI(final int lllllllllllllIIIIIIIIIlllIIllIIl, final int lllllllllllllIIIIIIIIIlllIIllIII) {
        return lllllllllllllIIIIIIIIIlllIIllIIl == lllllllllllllIIIIIIIIIlllIIllIII;
    }
    
    @Override
    public void func_152897_a(final ErrorCode lllllllllllllIIIIIIIIlIIlIllIIll) {
        if (llllllIIlIIlIll(ErrorCode.succeeded(lllllllllllllIIIIIIIIlIIlIllIIll) ? 1 : 0)) {
            TwitchStream.LOGGER.debug(TwitchStream.STREAM_MARKER, TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[9]]);
            this.loggedIn = (TwitchStream.lIllIlIIlIlIll[1] != 0);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            final Logger logger = TwitchStream.LOGGER;
            final Marker stream_MARKER = TwitchStream.STREAM_MARKER;
            final String s = TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[37]];
            final Object[] array = new Object[TwitchStream.lIllIlIIlIlIll[2]];
            array[TwitchStream.lIllIlIIlIlIll[0]] = ErrorCode.getString(lllllllllllllIIIIIIIIlIIlIllIIll);
            array[TwitchStream.lIllIlIIlIlIll[1]] = lllllllllllllIIIIIIIIlIIlIllIIll.getValue();
            logger.warn(stream_MARKER, s, array);
            this.loggedIn = (TwitchStream.lIllIlIIlIlIll[0] != 0);
        }
    }
    
    private static void llllllIIlIIlIIl() {
        (lIllIlIIlIlIll = new int[63])[0] = ((0x49 ^ 0x5A) & ~(0x54 ^ 0x47));
        TwitchStream.lIllIlIIlIlIll[1] = " ".length();
        TwitchStream.lIllIlIIlIlIll[2] = "  ".length();
        TwitchStream.lIllIlIIlIlIll[3] = "   ".length();
        TwitchStream.lIllIlIIlIlIll[4] = (0xED ^ 0x82 ^ (0x73 ^ 0x18));
        TwitchStream.lIllIlIIlIlIll[5] = (0x74 ^ 0xA ^ (0x8 ^ 0x73));
        TwitchStream.lIllIlIIlIlIll[6] = (0x57 ^ 0x51);
        TwitchStream.lIllIlIIlIlIll[7] = (0xA7 ^ 0xA0);
        TwitchStream.lIllIlIIlIlIll[8] = (0xBB ^ 0xB3);
        TwitchStream.lIllIlIIlIlIll[9] = (0x4 ^ 0x1A);
        TwitchStream.lIllIlIIlIlIll[10] = (147 + 8 - 120 + 152 ^ 143 + 71 - 88 + 52);
        TwitchStream.lIllIlIIlIlIll[11] = (0x2D ^ 0x27);
        TwitchStream.lIllIlIIlIlIll[12] = (0xB2 ^ 0xB9);
        TwitchStream.lIllIlIIlIlIll[13] = (0xA3 ^ 0x9D ^ (0x4D ^ 0x7F));
        TwitchStream.lIllIlIIlIlIll[14] = (0x31 ^ 0x3C);
        TwitchStream.lIllIlIIlIlIll[15] = (0x23 ^ 0x2D);
        TwitchStream.lIllIlIIlIlIll[16] = (58 + 27 - 46 + 110 ^ 40 + 66 - 95 + 143);
        TwitchStream.lIllIlIIlIlIll[17] = (0x0 ^ 0x3E ^ (0xA6 ^ 0x88));
        TwitchStream.lIllIlIIlIlIll[18] = (32 + 155 - 160 + 129 ^ 12 + 125 - 27 + 31);
        TwitchStream.lIllIlIIlIlIll[19] = (0xF8 ^ 0x89 ^ (0xF0 ^ 0x93));
        TwitchStream.lIllIlIIlIlIll[20] = (0xFFFFCE9E & 0x3B9AFB61);
        TwitchStream.lIllIlIIlIlIll[21] = (0xFFFF9FE9 & 0x7717);
        TwitchStream.lIllIlIIlIlIll[22] = (0xFFFFDF92 & 0x376D);
        TwitchStream.lIllIlIIlIlIll[23] = (-(0xFFFFFAFF & 0x771D) & (-1 & 0x7FFD));
        TwitchStream.lIllIlIIlIlIll[24] = (-(0xFFFFA17B & 0x5FD7) & (0xFFFFA977 & 0x7FDB));
        TwitchStream.lIllIlIIlIlIll[25] = (-(0xFFFFDFDF & 0x62B7) & (0xFFFFEA96 & 0x7FFF));
        TwitchStream.lIllIlIIlIlIll[26] = (0xD6 ^ 0xC5);
        TwitchStream.lIllIlIIlIlIll[27] = (0x91 ^ 0x86 ^ "   ".length());
        TwitchStream.lIllIlIIlIlIll[28] = (85 + 114 - 183 + 126 ^ 10 + 81 + 44 + 20);
        TwitchStream.lIllIlIIlIlIll[29] = (0xBB ^ 0xAD);
        TwitchStream.lIllIlIIlIlIll[30] = (116 + 167 - 195 + 122 ^ 164 + 131 - 162 + 64);
        TwitchStream.lIllIlIIlIlIll[31] = (7 + 12 + 30 + 135 ^ 103 + 24 + 15 + 18);
        TwitchStream.lIllIlIIlIlIll[32] = (7 + 105 - 86 + 147 ^ 46 + 175 - 125 + 84);
        TwitchStream.lIllIlIIlIlIll[33] = (0xF8 ^ 0x9A ^ (0x2D ^ 0x55));
        TwitchStream.lIllIlIIlIlIll[34] = (0x82 ^ 0x8C ^ (0x63 ^ 0x76));
        TwitchStream.lIllIlIIlIlIll[35] = (0x1F ^ 0x3);
        TwitchStream.lIllIlIIlIlIll[36] = (0x18 ^ 0x5);
        TwitchStream.lIllIlIIlIlIll[37] = (0x53 ^ 0x79 ^ (0x40 ^ 0x75));
        TwitchStream.lIllIlIIlIlIll[38] = (76 + 119 - 187 + 133 ^ 122 + 73 - 50 + 28);
        TwitchStream.lIllIlIIlIlIll[39] = (0xBA ^ 0x9B);
        TwitchStream.lIllIlIIlIlIll[40] = (0xE9 ^ 0x9C ^ (0x4 ^ 0x53));
        TwitchStream.lIllIlIIlIlIll[41] = (0x9F ^ 0xB2 ^ (0x4C ^ 0x42));
        TwitchStream.lIllIlIIlIlIll[42] = (0x76 ^ 0x52);
        TwitchStream.lIllIlIIlIlIll[43] = (0xA5 ^ 0xAD ^ (0x4E ^ 0x63));
        TwitchStream.lIllIlIIlIlIll[44] = (0x5B ^ 0x5C ^ (0x4C ^ 0x6D));
        TwitchStream.lIllIlIIlIlIll[45] = (0xAF ^ 0x88);
        TwitchStream.lIllIlIIlIlIll[46] = (27 + 89 - 12 + 53 ^ 42 + 85 - 31 + 85);
        TwitchStream.lIllIlIIlIlIll[47] = (0x73 ^ 0x5A);
        TwitchStream.lIllIlIIlIlIll[48] = (68 + 146 - 158 + 108 ^ 98 + 12 - 35 + 67);
        TwitchStream.lIllIlIIlIlIll[49] = (0xF2 ^ 0x9D ^ (0x9 ^ 0x4D));
        TwitchStream.lIllIlIIlIlIll[50] = (0x3F ^ 0x13);
        TwitchStream.lIllIlIIlIlIll[51] = (20 + 20 + 84 + 24 ^ 74 + 140 - 188 + 159);
        TwitchStream.lIllIlIIlIlIll[52] = (0x9 ^ 0x6B ^ (0xF2 ^ 0xBE));
        TwitchStream.lIllIlIIlIlIll[53] = (0x47 ^ 0x68);
        TwitchStream.lIllIlIIlIlIll[54] = (0x3F ^ 0xF);
        TwitchStream.lIllIlIIlIlIll[55] = (0x99 ^ 0xA8);
        TwitchStream.lIllIlIIlIlIll[56] = (0x8D ^ 0xBF);
        TwitchStream.lIllIlIIlIlIll[57] = (0xC ^ 0x16 ^ (0x17 ^ 0x3E));
        TwitchStream.lIllIlIIlIlIll[58] = (0x2B ^ 0x1F);
        TwitchStream.lIllIlIIlIlIll[59] = (0xD4 ^ 0xBB ^ (0x38 ^ 0x62));
        TwitchStream.lIllIlIIlIlIll[60] = (0x85 ^ 0xB3);
        TwitchStream.lIllIlIIlIlIll[61] = (0xF6 ^ 0xC5 ^ (0x1C ^ 0x18));
        TwitchStream.lIllIlIIlIlIll[62] = (0x4A ^ 0x72);
    }
    
    private static String llllllIIIlIlllI(String lllllllllllllIIIIIIIIIlllIlllllI, final String lllllllllllllIIIIIIIIIllllIIIIlI) {
        lllllllllllllIIIIIIIIIlllIlllllI = (short)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIIIIIIlllIlllllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIIIIIllllIIIIIl = new StringBuilder();
        final char[] lllllllllllllIIIIIIIIIllllIIIIII = lllllllllllllIIIIIIIIIllllIIIIlI.toCharArray();
        int lllllllllllllIIIIIIIIIlllIllllll = TwitchStream.lIllIlIIlIlIll[0];
        final boolean lllllllllllllIIIIIIIIIlllIlllIIl = (Object)((String)lllllllllllllIIIIIIIIIlllIlllllI).toCharArray();
        final boolean lllllllllllllIIIIIIIIIlllIlllIII = lllllllllllllIIIIIIIIIlllIlllIIl.length != 0;
        String lllllllllllllIIIIIIIIIlllIllIlll = (String)TwitchStream.lIllIlIIlIlIll[0];
        while (llllllIIllIIIlI((int)lllllllllllllIIIIIIIIIlllIllIlll, lllllllllllllIIIIIIIIIlllIlllIII ? 1 : 0)) {
            final char lllllllllllllIIIIIIIIIllllIIIlII = lllllllllllllIIIIIIIIIlllIlllIIl[lllllllllllllIIIIIIIIIlllIllIlll];
            lllllllllllllIIIIIIIIIllllIIIIIl.append((char)(lllllllllllllIIIIIIIIIllllIIIlII ^ lllllllllllllIIIIIIIIIllllIIIIII[lllllllllllllIIIIIIIIIlllIllllll % lllllllllllllIIIIIIIIIllllIIIIII.length]));
            "".length();
            ++lllllllllllllIIIIIIIIIlllIllllll;
            ++lllllllllllllIIIIIIIIIlllIllIlll;
            "".length();
            if (((0x44 ^ 0x70) & ~(0x4D ^ 0x79)) != ("  ".length() & ~"  ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIIIIIllllIIIIIl);
    }
    
    @Override
    public void shutdownStream() {
        TwitchStream.LOGGER.debug(TwitchStream.STREAM_MARKER, TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[13]]);
        this.broadcastController.statCallback();
        this.chatController.func_175988_p();
    }
    
    private static int llllllIIllIIIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public void muteMicrophone(final boolean lllllllllllllIIIIIIIIIlllllIIIIl) {
        this.field_152963_o = lllllllllllllIIIIIIIIIlllllIIIIl;
        this.updateStreamVolume();
    }
    
    @Override
    public void func_176022_e(final ErrorCode lllllllllllllIIIIIIIIlIIIllIIIIl) {
        if (llllllIIlIIlIll(ErrorCode.failed(lllllllllllllIIIIIIIIlIIIllIIIIl) ? 1 : 0)) {
            TwitchStream.LOGGER.error(TwitchStream.STREAM_MARKER, TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[53]]);
        }
    }
    
    @Override
    public void func_176021_d() {
    }
    
    public static int formatStreamFps(final float lllllllllllllIIIIIIIIlIIlIIIIIIl) {
        return MathHelper.floor_float(10.0f + lllllllllllllIIIIIIIIlIIlIIIIIIl * 50.0f);
    }
    
    @Override
    public void pause() {
        this.broadcastController.func_152847_F();
        "".length();
        this.field_152962_n = (TwitchStream.lIllIlIIlIlIll[1] != 0);
        this.updateStreamVolume();
    }
    
    @Override
    public void func_152935_j() {
        final int lllllllllllllIIIIIIIIlIlIlIIIlll = this.mc.gameSettings.streamChatEnabled;
        int n;
        if (llllllIIlIIllII(this.field_176029_e) && llllllIIlIIlIll(this.chatController.func_175990_d(this.field_176029_e) ? 1 : 0)) {
            n = TwitchStream.lIllIlIIlIlIll[1];
            "".length();
            if (" ".length() == (0x65 ^ 0x61)) {
                return;
            }
        }
        else {
            n = TwitchStream.lIllIlIIlIlIll[0];
        }
        final boolean lllllllllllllIIIIIIIIlIlIlIIIllI = n != 0;
        int n2;
        if (llllllIIlIIlIlI(this.chatController.func_153000_j(), ChatController.ChatState.Initialized) && (!llllllIIlIIllII(this.field_176029_e) || llllllIIlIIlIlI(this.chatController.func_175989_e(this.field_176029_e), ChatController.EnumChannelState.Disconnected))) {
            n2 = TwitchStream.lIllIlIIlIlIll[1];
            "".length();
            if (" ".length() > "  ".length()) {
                return;
            }
        }
        else {
            n2 = TwitchStream.lIllIlIIlIlIll[0];
        }
        final boolean lllllllllllllIIIIIIIIlIlIlIIIlIl = n2 != 0;
        if (llllllIIlIIlllI(lllllllllllllIIIIIIIIlIlIlIIIlll, TwitchStream.lIllIlIIlIlIll[2])) {
            if (llllllIIlIIlIll(lllllllllllllIIIIIIIIlIlIlIIIllI ? 1 : 0)) {
                TwitchStream.LOGGER.debug(TwitchStream.STREAM_MARKER, TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[14]]);
                this.chatController.func_175991_l(this.field_176029_e);
                "".length();
                "".length();
                if ((0x93 ^ 0x96) <= 0) {
                    return;
                }
            }
        }
        else if (llllllIIlIIlllI(lllllllllllllIIIIIIIIlIlIlIIIlll, TwitchStream.lIllIlIIlIlIll[1])) {
            if (llllllIIlIIlIll(lllllllllllllIIIIIIIIlIlIlIIIlIl ? 1 : 0) && llllllIIlIIlIll(this.broadcastController.func_152849_q() ? 1 : 0)) {
                TwitchStream.LOGGER.debug(TwitchStream.STREAM_MARKER, TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[15]]);
                this.func_152942_I();
                "".length();
                if (-" ".length() > " ".length()) {
                    return;
                }
            }
        }
        else if (llllllIIlIIllIl(lllllllllllllIIIIIIIIlIlIlIIIlll)) {
            if (llllllIIlIIlIll(lllllllllllllIIIIIIIIlIlIlIIIllI ? 1 : 0) && llllllIIlIIllIl(this.isBroadcasting() ? 1 : 0)) {
                TwitchStream.LOGGER.debug(TwitchStream.STREAM_MARKER, TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[16]]);
                this.chatController.func_175991_l(this.field_176029_e);
                "".length();
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
            }
            else if (llllllIIlIIlIll(lllllllllllllIIIIIIIIlIlIlIIIlIl ? 1 : 0) && llllllIIlIIlIll(this.isBroadcasting() ? 1 : 0)) {
                TwitchStream.LOGGER.debug(TwitchStream.STREAM_MARKER, TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[17]]);
                this.func_152942_I();
            }
        }
        this.broadcastController.func_152821_H();
        this.chatController.func_152997_n();
    }
    
    @Override
    public void func_152892_c(final ErrorCode lllllllllllllIIIIIIIIlIIlIIIllII) {
        if (llllllIIlIIlIlI(lllllllllllllIIIIIIIIlIIlIIIllII, ErrorCode.TTV_EC_SOUNDFLOWER_NOT_INSTALLED)) {
            final IChatComponent lllllllllllllIIIIIIIIlIIlIIlIIII = new ChatComponentTranslation(TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[47]], new Object[TwitchStream.lIllIlIIlIlIll[0]]);
            lllllllllllllIIIIIIIIlIIlIIlIIII.getChatStyle().setChatClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[48]]));
            "".length();
            lllllllllllllIIIIIIIIlIIlIIlIIII.getChatStyle().setUnderlined((boolean)(TwitchStream.lIllIlIIlIlIll[1] != 0));
            "".length();
            final String lllllllllllllIlIIlIlllIIlIIIIIlI = TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[49]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[TwitchStream.lIllIlIIlIlIll[1]];
            lllllllllllllIlIIlIlllIIlIIIIIIl[TwitchStream.lIllIlIIlIlIll[0]] = lllllllllllllIIIIIIIIlIIlIIlIIII;
            final IChatComponent lllllllllllllIIIIIIIIlIIlIIIllll = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl);
            lllllllllllllIIIIIIIIlIIlIIIllll.getChatStyle().setColor(EnumChatFormatting.DARK_RED);
            "".length();
            this.mc.ingameGUI.getChatGUI().printChatMessage(lllllllllllllIIIIIIIIlIIlIIIllll);
            "".length();
            if (-" ".length() >= "  ".length()) {
                return;
            }
        }
        else {
            final String lllllllllllllIlIIlIlllIIlIIIIIlI2 = TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[50]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl2 = new Object[TwitchStream.lIllIlIIlIlIll[1]];
            lllllllllllllIlIIlIlllIIlIIIIIIl2[TwitchStream.lIllIlIIlIlIll[0]] = ErrorCode.getString(lllllllllllllIIIIIIIIlIIlIIIllII);
            final IChatComponent lllllllllllllIIIIIIIIlIIlIIIlllI = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI2, lllllllllllllIlIIlIlllIIlIIIIIIl2);
            lllllllllllllIIIIIIIIlIIlIIIlllI.getChatStyle().setColor(EnumChatFormatting.DARK_RED);
            "".length();
            this.mc.ingameGUI.getChatGUI().printChatMessage(lllllllllllllIIIIIIIIlIIlIIIlllI);
        }
    }
    
    @Override
    public boolean isBroadcasting() {
        return this.broadcastController.isBroadcasting();
    }
    
    private static String llllllIIIlIllII(final String lllllllllllllIIIIIIIIIlllIlIIIIl, final String lllllllllllllIIIIIIIIIlllIlIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIIIIlllIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIIIlllIlIIIII.getBytes(StandardCharsets.UTF_8)), TwitchStream.lIllIlIIlIlIll[8]), "DES");
            final Cipher lllllllllllllIIIIIIIIIlllIlIIIll = Cipher.getInstance("DES");
            lllllllllllllIIIIIIIIIlllIlIIIll.init(TwitchStream.lIllIlIIlIlIll[2], lllllllllllllIIIIIIIIIlllIlIIlII);
            return new String(lllllllllllllIIIIIIIIIlllIlIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIIIlllIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIIIIlllIlIIIlI) {
            lllllllllllllIIIIIIIIIlllIlIIIlI.printStackTrace();
            return null;
        }
    }
    
    private boolean func_176028_a(final Set<ChatUserMode> lllllllllllllIIIIIIIIlIIIIlIllII, final Set<ChatUserSubscription> lllllllllllllIIIIIIIIlIIIIlIlIII, final int lllllllllllllIIIIIIIIlIIIIlIlIlI) {
        int contains;
        if (llllllIIlIIlIll(lllllllllllllIIIIIIIIlIIIIlIllII.contains(ChatUserMode.TTV_CHAT_USERMODE_BANNED) ? 1 : 0)) {
            contains = TwitchStream.lIllIlIIlIlIll[0];
            "".length();
            if (-" ".length() != -" ".length()) {
                return ((0x3C ^ 0xA) & ~(0x13 ^ 0x25)) != 0x0;
            }
        }
        else if (llllllIIlIIlIll(lllllllllllllIIIIIIIIlIIIIlIllII.contains(ChatUserMode.TTV_CHAT_USERMODE_ADMINSTRATOR) ? 1 : 0)) {
            contains = TwitchStream.lIllIlIIlIlIll[1];
            "".length();
            if (null != null) {
                return ((0xCC ^ 0x97) & ~(0x7C ^ 0x27)) != 0x0;
            }
        }
        else if (llllllIIlIIlIll(lllllllllllllIIIIIIIIlIIIIlIllII.contains(ChatUserMode.TTV_CHAT_USERMODE_MODERATOR) ? 1 : 0)) {
            contains = TwitchStream.lIllIlIIlIlIll[1];
            "".length();
            if (-(0x64 ^ 0x60) > 0) {
                return ((0x17 ^ 0x4D) & ~(0x5D ^ 0x7)) != 0x0;
            }
        }
        else if (llllllIIlIIlIll(lllllllllllllIIIIIIIIlIIIIlIllII.contains(ChatUserMode.TTV_CHAT_USERMODE_STAFF) ? 1 : 0)) {
            contains = TwitchStream.lIllIlIIlIlIll[1];
            "".length();
            if (null != null) {
                return ((0x72 ^ 0x4D) & ~(0x21 ^ 0x1E)) != 0x0;
            }
        }
        else if (llllllIIlIIllIl(lllllllllllllIIIIIIIIlIIIIlIlIlI)) {
            contains = TwitchStream.lIllIlIIlIlIll[1];
            "".length();
            if ((0x60 ^ 0x64) == 0x0) {
                return ((0xB1 ^ 0x9F) & ~(0x30 ^ 0x1E)) != 0x0;
            }
        }
        else if (llllllIIlIIlllI(lllllllllllllIIIIIIIIlIIIIlIlIlI, TwitchStream.lIllIlIIlIlIll[1])) {
            contains = (lllllllllllllIIIIIIIIlIIIIlIlIII.contains(ChatUserSubscription.TTV_CHAT_USERSUB_SUBSCRIBER) ? 1 : 0);
            "".length();
            if (-" ".length() > 0) {
                return ((0x1D ^ 0x18 ^ (0x28 ^ 0x60)) & (0xCE ^ 0x9D ^ (0x98 ^ 0x86) ^ -" ".length())) != 0x0;
            }
        }
        else {
            contains = TwitchStream.lIllIlIIlIlIll[0];
        }
        return contains != 0;
    }
    
    @Override
    public void func_176023_d(final ErrorCode lllllllllllllIIIIIIIIlIIIllIIlIl) {
        if (llllllIIlIIlIll(ErrorCode.failed(lllllllllllllIIIIIIIIlIIIllIIlIl) ? 1 : 0)) {
            TwitchStream.LOGGER.error(TwitchStream.STREAM_MARKER, TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[52]]);
        }
    }
    
    @Override
    public void func_152894_a(final StreamInfo lllllllllllllIIIIIIIIlIIlIlIIlII) {
        final Logger logger = TwitchStream.LOGGER;
        final Marker stream_MARKER = TwitchStream.STREAM_MARKER;
        final String s = TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[40]];
        final Object[] array = new Object[TwitchStream.lIllIlIIlIlIll[2]];
        array[TwitchStream.lIllIlIIlIlIll[0]] = lllllllllllllIIIIIIIIlIIlIlIIlII.viewers;
        array[TwitchStream.lIllIlIIlIlIll[1]] = lllllllllllllIIIIIIIIlIIlIlIIlII.streamId;
        logger.debug(stream_MARKER, s, array);
    }
    
    private static boolean llllllIIlIlllll(final Object lllllllllllllIIIIIIIIIlllIIIIlII) {
        return lllllllllllllIIIIIIIIIlllIIIIlII == null;
    }
    
    static /* synthetic */ void access$3(final TwitchStream lllllllllllllIIIIIIIIIllllIIllll, final AuthFailureReason lllllllllllllIIIIIIIIIllllIIlllI) {
        lllllllllllllIIIIIIIIIllllIIllll.authFailureReason = lllllllllllllIIIIIIIIIllllIIlllI;
    }
    
    @Override
    public boolean func_152927_B() {
        if (llllllIIlIIllII(this.field_176029_e) && llllllIIlIIlIll(this.field_176029_e.equals(this.broadcastController.getChannelInfo().name) ? 1 : 0)) {
            return TwitchStream.lIllIlIIlIlIll[1] != 0;
        }
        return TwitchStream.lIllIlIIlIlIll[0] != 0;
    }
    
    @Override
    public AuthFailureReason func_152918_H() {
        return this.authFailureReason;
    }
    
    @Override
    public boolean func_152928_D() {
        if (llllllIIlIIlIll(TwitchStream.field_152965_q ? 1 : 0) && llllllIIlIIlIll(this.broadcastController.func_152858_b() ? 1 : 0)) {
            return TwitchStream.lIllIlIIlIlIll[1] != 0;
        }
        return TwitchStream.lIllIlIIlIlIll[0] != 0;
    }
    
    @Override
    public String func_152921_C() {
        return this.field_176029_e;
    }
    
    @Override
    public int func_152920_A() {
        int viewers;
        if (llllllIIlIIlIll(this.isBroadcasting() ? 1 : 0)) {
            viewers = this.broadcastController.getStreamInfo().viewers;
            "".length();
            if ("   ".length() < "   ".length()) {
                return (65 + 115 - 19 + 7 ^ 65 + 40 - 82 + 123) & (47 + 87 - 84 + 91 ^ 97 + 87 - 164 + 163 ^ -" ".length());
            }
        }
        else {
            viewers = TwitchStream.lIllIlIIlIlIll[0];
        }
        return viewers;
    }
    
    private static boolean llllllIIlIlIlll(final int lllllllllllllIIIIIIIIIllIllllllI) {
        return lllllllllllllIIIIIIIIIllIllllllI >= 0;
    }
    
    @Override
    public IngestServer[] func_152925_v() {
        return this.broadcastController.func_152855_t().getServers();
    }
    
    @Override
    public void func_152891_a(final BroadcastController.BroadcastState lllllllllllllIIIIIIIIlIIlIlIlIII) {
        final Logger logger = TwitchStream.LOGGER;
        final Marker stream_MARKER = TwitchStream.STREAM_MARKER;
        final String s = TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[38]];
        final Object[] array = new Object[TwitchStream.lIllIlIIlIlIll[1]];
        array[TwitchStream.lIllIlIIlIlIll[0]] = lllllllllllllIIIIIIIIlIIlIlIlIII;
        logger.debug(stream_MARKER, s, array);
        if (llllllIIlIIlIlI(lllllllllllllIIIIIIIIlIIlIlIlIII, BroadcastController.BroadcastState.Initialized)) {
            this.broadcastController.func_152827_a(BroadcastController.BroadcastState.Authenticated);
        }
    }
    
    @Override
    public void func_152930_t() {
        final GameSettings lllllllllllllIIIIIIIIlIIllIIIllI = this.mc.gameSettings;
        final VideoParams lllllllllllllIIIIIIIIlIIllIIIlIl = this.broadcastController.func_152834_a(formatStreamKbps(lllllllllllllIIIIIIIIlIIllIIIllI.streamKbps), formatStreamFps(lllllllllllllIIIIIIIIlIIllIIIllI.streamFps), formatStreamBps(lllllllllllllIIIIIIIIlIIllIIIllI.streamBytesPerPixel), this.mc.displayWidth / (float)this.mc.displayHeight);
        switch (lllllllllllllIIIIIIIIlIIllIIIllI.streamCompression) {
            case 0: {
                lllllllllllllIIIIIIIIlIIllIIIlIl.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_LOW;
                "".length();
                if ("  ".length() >= (0x42 ^ 0x72 ^ (0xB7 ^ 0x83))) {
                    return;
                }
                break;
            }
            case 1: {
                lllllllllllllIIIIIIIIlIIllIIIlIl.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_MEDIUM;
                "".length();
                if ((74 + 76 - 56 + 49 ^ 61 + 49 - 87 + 116) == 0x0) {
                    return;
                }
                break;
            }
            case 2: {
                lllllllllllllIIIIIIIIlIIllIIIlIl.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
                break;
            }
        }
        if (llllllIIlIlllll(this.framebuffer)) {
            this.framebuffer = new Framebuffer(lllllllllllllIIIIIIIIlIIllIIIlIl.outputWidth, lllllllllllllIIIIIIIIlIIllIIIlIl.outputHeight, (boolean)(TwitchStream.lIllIlIIlIlIll[0] != 0));
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.framebuffer.createBindFramebuffer(lllllllllllllIIIIIIIIlIIllIIIlIl.outputWidth, lllllllllllllIIIIIIIIlIIllIIIlIl.outputHeight);
        }
        if (llllllIIlIIllII(lllllllllllllIIIIIIIIlIIllIIIllI.streamPreferredServer) && llllllIIlIllllI(lllllllllllllIIIIIIIIlIIllIIIllI.streamPreferredServer.length())) {
            final float lllllllllllllIIIIIIIIlIIlIllllIl;
            final float lllllllllllllIIIIIIIIlIIlIlllllI = ((IngestServer[])(Object)(lllllllllllllIIIIIIIIlIIlIllllIl = (float)(Object)this.func_152925_v())).length;
            short lllllllllllllIIIIIIIIlIIlIllllll = (short)TwitchStream.lIllIlIIlIlIll[0];
            "".length();
            if (null != null) {
                return;
            }
            while (!llllllIIllIIIII(lllllllllllllIIIIIIIIlIIlIllllll, (int)lllllllllllllIIIIIIIIlIIlIlllllI)) {
                final IngestServer lllllllllllllIIIIIIIIlIIllIIIlII = lllllllllllllIIIIIIIIlIIlIllllIl[lllllllllllllIIIIIIIIlIIlIllllll];
                if (llllllIIlIIlIll(lllllllllllllIIIIIIIIlIIllIIIlII.serverUrl.equals(lllllllllllllIIIIIIIIlIIllIIIllI.streamPreferredServer) ? 1 : 0)) {
                    this.broadcastController.func_152824_a(lllllllllllllIIIIIIIIlIIllIIIlII);
                    "".length();
                    if ("   ".length() <= " ".length()) {
                        return;
                    }
                    break;
                }
                else {
                    ++lllllllllllllIIIIIIIIlIIlIllllll;
                }
            }
        }
        this.targetFPS = lllllllllllllIIIIIIIIlIIllIIIlIl.targetFps;
        this.field_152957_i = lllllllllllllIIIIIIIIlIIllIIIllI.streamSendMetadata;
        this.broadcastController.func_152836_a(lllllllllllllIIIIIIIIlIIllIIIlIl);
        "".length();
        final Logger logger = TwitchStream.LOGGER;
        final Marker stream_MARKER = TwitchStream.STREAM_MARKER;
        final String s = TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[33]];
        final Object[] array = new Object[TwitchStream.lIllIlIIlIlIll[4]];
        array[TwitchStream.lIllIlIIlIlIll[0]] = lllllllllllllIIIIIIIIlIIllIIIlIl.outputWidth;
        array[TwitchStream.lIllIlIIlIlIll[1]] = lllllllllllllIIIIIIIIlIIllIIIlIl.outputHeight;
        array[TwitchStream.lIllIlIIlIlIll[2]] = lllllllllllllIIIIIIIIlIIllIIIlIl.maxKbps;
        array[TwitchStream.lIllIlIIlIlIll[3]] = this.broadcastController.func_152833_s().serverUrl;
        logger.info(stream_MARKER, s, array);
        this.broadcastController.func_152828_a(null, TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[34]], null);
        "".length();
    }
    
    @Override
    public void func_180607_b(final String lllllllllllllIIIIIIIIlIIIIIIlIlI) {
        TwitchStream.LOGGER.debug(TwitchStream.STREAM_MARKER, TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[61]]);
        this.field_152955_g.clear();
    }
    
    @Override
    public void unpause() {
        this.broadcastController.func_152854_G();
        "".length();
        this.field_152962_n = (TwitchStream.lIllIlIIlIlIll[0] != 0);
        this.updateStreamVolume();
    }
    
    private static boolean llllllIIlIIllIl(final int lllllllllllllIIIIIIIIIlllIIIIIII) {
        return lllllllllllllIIIIIIIIIlllIIIIIII == 0;
    }
    
    @Override
    public void func_152895_a() {
        TwitchStream.LOGGER.info(TwitchStream.STREAM_MARKER, TwitchStream.lIllIlIIlIIIII[TwitchStream.lIllIlIIlIlIll[39]]);
    }
    
    @Override
    public boolean func_152913_F() {
        return this.loggedIn;
    }
    
    @Override
    public void func_176025_a(final String lllllllllllllIIIIIIIIlIIIIlllllI, final ChatTokenizedMessage[] lllllllllllllIIIIIIIIlIIIIllllIl) {
    }
    
    @Override
    public void func_176016_c(final String lllllllllllllIIIIIIIIlIIIIIIIIlI) {
    }
}
