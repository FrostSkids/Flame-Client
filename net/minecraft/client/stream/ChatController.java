// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.stream;

import com.google.common.collect.Lists;
import tv.twitch.chat.ChatChannelInfo;
import tv.twitch.chat.ChatEvent;
import java.util.ListIterator;
import java.util.List;
import java.util.LinkedList;
import tv.twitch.chat.ChatBadgeData;
import tv.twitch.chat.IChatChannelListener;
import tv.twitch.chat.ChatTokenizedMessage;
import tv.twitch.chat.ChatRawMessage;
import tv.twitch.chat.ChatUserInfo;
import tv.twitch.chat.ChatTokenizationOption;
import java.util.HashSet;
import tv.twitch.chat.ChatAPI;
import tv.twitch.chat.StandardChatAPI;
import tv.twitch.CoreAPI;
import tv.twitch.StandardCoreAPI;
import org.apache.logging.log4j.LogManager;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import tv.twitch.ErrorCode;
import org.apache.logging.log4j.Marker;
import tv.twitch.chat.Chat;
import tv.twitch.AuthToken;
import java.util.HashMap;
import tv.twitch.chat.ChatEmoticonData;
import tv.twitch.chat.IChatAPIListener;
import org.apache.logging.log4j.Logger;
import tv.twitch.Core;

public class ChatController
{
    private static final /* synthetic */ String[] lIllllIIlIllII;
    protected /* synthetic */ String field_153007_e;
    protected /* synthetic */ EnumEmoticonMode field_175995_l;
    protected /* synthetic */ Core field_175992_e;
    protected /* synthetic */ EnumEmoticonMode field_175997_k;
    private static final /* synthetic */ Logger LOGGER;
    protected /* synthetic */ ChatState field_153011_i;
    protected /* synthetic */ int field_175993_n;
    protected /* synthetic */ int field_175994_o;
    protected /* synthetic */ IChatAPIListener field_175999_p;
    protected /* synthetic */ ChatListener field_153003_a;
    protected /* synthetic */ String field_153004_b;
    protected /* synthetic */ int field_153015_m;
    protected /* synthetic */ ChatEmoticonData field_175996_m;
    protected /* synthetic */ HashMap<String, ChatChannelListener> field_175998_i;
    protected /* synthetic */ String field_153006_d;
    private static final /* synthetic */ int[] lIllllIIlIllll;
    protected /* synthetic */ AuthToken field_153012_j;
    protected /* synthetic */ Chat field_153008_f;
    
    private static boolean lIIIIlIIIIlIlIll(final Object llllllllllllIllllIlIlIlIlIIlIIll) {
        return llllllllllllIllllIlIlIlIlIIlIIll != null;
    }
    
    public void func_152990_a(final ChatListener llllllllllllIllllIlIlIlllIlIlIlI) {
        this.field_153003_a = llllllllllllIllllIlIlIlllIlIlIlI;
    }
    
    protected void func_152995_h(final String llllllllllllIllllIlIlIllIIIIlIII) {
        final Logger logger = ChatController.LOGGER;
        final Marker stream_MARKER = TwitchStream.STREAM_MARKER;
        final String s = ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[17]];
        final Object[] array = new Object[ChatController.lIllllIIlIllll[1]];
        array[ChatController.lIllllIIlIllll[0]] = llllllllllllIllllIlIlIllIIIIlIII;
        logger.error(stream_MARKER, s, array);
    }
    
    public EnumChannelState func_175989_e(final String llllllllllllIllllIlIlIlllIIIIIlI) {
        if (lIIIIlIIIIlIIllI(this.field_175998_i.containsKey(llllllllllllIllllIlIlIlllIIIIIlI) ? 1 : 0)) {
            return EnumChannelState.Disconnected;
        }
        final ChatChannelListener llllllllllllIllllIlIlIlllIIIIlII = this.field_175998_i.get(llllllllllllIllllIlIlIlllIIIIIlI);
        return llllllllllllIllllIlIlIlllIIIIlII.func_176040_a();
    }
    
    private static boolean lIIIIlIIIIlIIllI(final int llllllllllllIllllIlIlIlIlIIIlIII) {
        return llllllllllllIllllIlIlIlIlIIIlIII == 0;
    }
    
    public void func_152998_c(final String llllllllllllIllllIlIlIlllIIllIII) {
        this.field_153004_b = llllllllllllIllllIlIlIlllIIllIII;
    }
    
    private static boolean lIIIIlIIIIlIIlll(final Object llllllllllllIllllIlIlIlIlIIllIll, final Object llllllllllllIllllIlIlIlIlIIllIII) {
        return llllllllllllIllllIlIlIlIlIIllIll == llllllllllllIllllIlIlIlIlIIllIII;
    }
    
    private static void lIIIIlIIIIlIIIIl() {
        (lIllllIIlIllII = new String[ChatController.lIllllIIlIllll[18]])[ChatController.lIllllIIlIllll[0]] = lIIIIlIIIIIllIlI("", "aBplv");
        ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[1]] = lIIIIlIIIIIllIlI("", "Gbpmu");
        ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[2]] = lIIIIlIIIIIllIll("YTPkBhWcTkc=", "OwFKb");
        ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[6]] = lIIIIlIIIIIllIlI("FiE4LCNzOiQqJToyJiorOj0tYwUkOj4gOXMgLihrc3Y5", "SSJCQ");
        ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[7]] = lIIIIlIIIIIlllII("9yrKMCVNziGdkBE1180lM6+SOMtDrq3gkIYHuz0uetVme29gjasVsQ==", "Krsss");
        ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[8]] = lIIIIlIIIIIllIlI("FggoEiozHXoeJXcHMhYlOQE2TWs=", "WdZwK");
        ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[9]] = lIIIIlIIIIIllIll("nPUxEOHjQRE=", "TNroB");
        ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[10]] = lIIIIlIIIIIllIlI("Awk5Qh0jRi4KFSMIKA5ObQ==", "MfMbt");
        ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[11]] = lIIIIlIIIIIllIll("bRh3l+y1U3EXkFxOgrBThkTvriddt4rFA7PZLHuYHoM=", "hTggO");
        ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[12]] = lIIIIlIIIIIllIlI("EB0hGjZ1CT8ANz0GPRJkNgcyAWQwGTYbMCZVc1A3", "UoSuD");
        ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[13]] = lIIIIlIIIIIllIlI("Cg4jeSMqQTQxKyoPMjVwZA==", "DaWYJ");
        ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[14]] = lIIIIlIIIIIllIll("AijKmXoWOp+IbFPBD3oRA/+jFvFvYbOpr/ilk0TSIoiGk+eZkVO23t+veEY5LTw3", "hibLE");
        ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[15]] = lIIIIlIIIIIllIlI("EBURFTt1FxEfOTQVChQudQIOFT08BAwUaTEGFxtzdQ==", "UgczI");
        ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[16]] = lIIIIlIIIIIllIll("wcIRzEdjchZvPkN4+rJUgmdf002LyzW7l841cUI9hHY=", "KERVl");
        ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[17]] = lIIIIlIIIIIlllII("gx2xteLe2Jh5bc4khpXkJMA18kZzTbCO", "qAFoa");
    }
    
    protected boolean func_175987_a(final String llllllllllllIllllIlIlIllIlIlllll, final boolean llllllllllllIllllIlIlIllIlIllllI) {
        if (lIIIIlIIIIlIlIIl(this.field_153011_i, ChatState.Initialized)) {
            return ChatController.lIllllIIlIllll[0] != 0;
        }
        if (lIIIIlIIIIlIlIlI(this.field_175998_i.containsKey(llllllllllllIllllIlIlIllIlIlllll) ? 1 : 0)) {
            this.func_152995_h(String.valueOf(new StringBuilder(ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[8]]).append(llllllllllllIllllIlIlIllIlIlllll)));
            return ChatController.lIllllIIlIllll[0] != 0;
        }
        if (lIIIIlIIIIlIlIll(llllllllllllIllllIlIlIllIlIlllll) && lIIIIlIIIIlIIllI(llllllllllllIllllIlIlIllIlIlllll.equals(ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[9]]) ? 1 : 0)) {
            final ChatChannelListener llllllllllllIllllIlIlIllIllIIIlI = new ChatChannelListener(llllllllllllIllllIlIlIllIlIlllll);
            this.field_175998_i.put(llllllllllllIllllIlIlIllIlIlllll, llllllllllllIllllIlIlIllIllIIIlI);
            "".length();
            final boolean llllllllllllIllllIlIlIllIllIIIIl = llllllllllllIllllIlIlIllIllIIIlI.func_176038_a(llllllllllllIllllIlIlIllIlIllllI);
            if (lIIIIlIIIIlIIllI(llllllllllllIllllIlIlIllIllIIIIl ? 1 : 0)) {
                this.field_175998_i.remove(llllllllllllIllllIlIlIllIlIlllll);
                "".length();
            }
            return llllllllllllIllllIlIlIllIllIIIIl;
        }
        return ChatController.lIllllIIlIllll[0] != 0;
    }
    
    public boolean func_175991_l(final String llllllllllllIllllIlIlIllIlIlIlll) {
        if (lIIIIlIIIIlIlIIl(this.field_153011_i, ChatState.Initialized)) {
            return ChatController.lIllllIIlIllll[0] != 0;
        }
        if (lIIIIlIIIIlIIllI(this.field_175998_i.containsKey(llllllllllllIllllIlIlIllIlIlIlll) ? 1 : 0)) {
            this.func_152995_h(String.valueOf(new StringBuilder(ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[10]]).append(llllllllllllIllllIlIlIllIlIlIlll)));
            return ChatController.lIllllIIlIllll[0] != 0;
        }
        final ChatChannelListener llllllllllllIllllIlIlIllIlIlIllI = this.field_175998_i.get(llllllllllllIllllIlIlIllIlIlIlll);
        return llllllllllllIllllIlIlIllIlIlIllI.func_176034_g();
    }
    
    private static boolean lIIIIlIIIIlIlIIl(final Object llllllllllllIllllIlIlIlIlIlIIIlI, final Object llllllllllllIllllIlIlIlIlIlIIIIl) {
        return llllllllllllIllllIlIlIlIlIlIIIlI != llllllllllllIllllIlIlIlIlIlIIIIl;
    }
    
    public boolean func_175990_d(final String llllllllllllIllllIlIlIlllIIIlIll) {
        if (lIIIIlIIIIlIIllI(this.field_175998_i.containsKey(llllllllllllIllllIlIlIlllIIIlIll) ? 1 : 0)) {
            return ChatController.lIllllIIlIllll[0] != 0;
        }
        final ChatChannelListener llllllllllllIllllIlIlIlllIIIllIl = this.field_175998_i.get(llllllllllllIllllIlIlIlllIIIlIll);
        if (lIIIIlIIIIlIIlll(llllllllllllIllllIlIlIlllIIIllIl.func_176040_a(), EnumChannelState.Connected)) {
            return ChatController.lIllllIIlIllll[1] != 0;
        }
        return ChatController.lIllllIIlIllll[0] != 0;
    }
    
    protected void func_175985_a(final ChatState llllllllllllIllllIlIlIllIIlIlIll) {
        if (lIIIIlIIIIlIlIIl(llllllllllllIllllIlIlIllIIlIlIll, this.field_153011_i)) {
            this.field_153011_i = llllllllllllIllllIlIlIllIIlIlIll;
            try {
                if (lIIIIlIIIIlIlIll(this.field_153003_a)) {
                    this.field_153003_a.func_176017_a(llllllllllllIllllIlIlIllIIlIlIll);
                    "".length();
                    if (-" ".length() >= " ".length()) {
                        return;
                    }
                }
            }
            catch (Exception llllllllllllIllllIlIlIllIIlIlIlI) {
                this.func_152995_h(llllllllllllIllllIlIlIllIIlIlIlI.toString());
            }
        }
    }
    
    public boolean func_152986_d(final String llllllllllllIllllIlIlIllIllIlIll) {
        return this.func_175987_a(llllllllllllIllllIlIlIllIllIlIll, (boolean)(ChatController.lIllllIIlIllll[0] != 0));
    }
    
    public boolean func_152993_m() {
        if (lIIIIlIIIIlIlIIl(this.field_153011_i, ChatState.Initialized)) {
            return ChatController.lIllllIIlIllll[0] != 0;
        }
        final ErrorCode llllllllllllIllllIlIlIllIlIIlllI = this.field_153008_f.shutdown();
        if (lIIIIlIIIIlIlIlI(ErrorCode.failed(llllllllllllIllllIlIlIllIlIIlllI) ? 1 : 0)) {
            final String llllllllllllIllllIlIlIllIlIIllIl = ErrorCode.getString(llllllllllllIllllIlIlIllIlIIlllI);
            final String format = ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[11]];
            final Object[] args = new Object[ChatController.lIllllIIlIllll[1]];
            args[ChatController.lIllllIIlIllll[0]] = llllllllllllIllllIlIlIllIlIIllIl;
            this.func_152995_h(String.format(format, args));
            return ChatController.lIllllIIlIllll[0] != 0;
        }
        this.func_152996_t();
        this.func_175985_a(ChatState.ShuttingDown);
        return ChatController.lIllllIIlIllll[1] != 0;
    }
    
    private static String lIIIIlIIIIIlllII(final String llllllllllllIllllIlIlIlIlllIIIIl, final String llllllllllllIllllIlIlIlIlllIIIII) {
        try {
            final SecretKeySpec llllllllllllIllllIlIlIlIlllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIlIlIlllIIIII.getBytes(StandardCharsets.UTF_8)), ChatController.lIllllIIlIllll[11]), "DES");
            final Cipher llllllllllllIllllIlIlIlIlllIlIII = Cipher.getInstance("DES");
            llllllllllllIllllIlIlIlIlllIlIII.init(ChatController.lIllllIIlIllll[2], llllllllllllIllllIlIlIlIlllIlIlI);
            return new String(llllllllllllIllllIlIlIlIlllIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIlIlIlllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlIlIlIlllIIllI) {
            llllllllllllIllllIlIlIlIlllIIllI.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIIIlIIIIlIIlIl();
        lIIIIlIIIIlIIIIl();
        LOGGER = LogManager.getLogger();
    }
    
    protected void func_153001_r() {
        if (lIIIIlIIIIlIlIIl(this.field_175995_l, EnumEmoticonMode.None) && lIIIIlIIIIlIlIII(this.field_175996_m)) {
            final ErrorCode llllllllllllIllllIlIlIllIIlIIIlI = this.field_153008_f.downloadEmoticonData();
            if (lIIIIlIIIIlIlIlI(ErrorCode.failed(llllllllllllIllllIlIlIllIIlIIIlI) ? 1 : 0)) {
                final String llllllllllllIllllIlIlIllIIlIIIIl = ErrorCode.getString(llllllllllllIllllIlIlIllIIlIIIlI);
                final String format = ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[14]];
                final Object[] args = new Object[ChatController.lIllllIIlIllll[1]];
                args[ChatController.lIllllIIlIllll[0]] = llllllllllllIllllIlIlIllIIlIIIIl;
                this.func_152995_h(String.format(format, args));
            }
        }
    }
    
    protected void func_152996_t() {
        if (lIIIIlIIIIlIlIll(this.field_175996_m)) {
            final ErrorCode llllllllllllIllllIlIlIllIIIlIIII = this.field_153008_f.clearEmoticonData();
            if (lIIIIlIIIIlIlIlI(ErrorCode.succeeded(llllllllllllIllllIlIlIllIIIlIIII) ? 1 : 0)) {
                this.field_175996_m = null;
                try {
                    if (!lIIIIlIIIIlIlIll(this.field_153003_a)) {
                        return;
                    }
                    this.field_153003_a.func_176024_e();
                    "".length();
                    if (((0x75 ^ 0x2E) & ~(0xF0 ^ 0xAB)) == -" ".length()) {
                        return;
                    }
                    return;
                }
                catch (Exception llllllllllllIllllIlIlIllIIIIllll) {
                    this.func_152995_h(llllllllllllIllllIlIlIllIIIIllll.toString());
                    "".length();
                    if ((0xB ^ 0xF) == 0x0) {
                        return;
                    }
                    return;
                }
            }
            this.func_152995_h(String.valueOf(new StringBuilder(ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[16]]).append(ErrorCode.getString(llllllllllllIllllIlIlIllIIIlIIII))));
        }
    }
    
    private static void lIIIIlIIIIlIIlIl() {
        (lIllllIIlIllll = new int[19])[0] = ((107 + 66 - 162 + 123 ^ 29 + 108 - 28 + 49) & (0xA9 ^ 0x95 ^ (0x29 ^ 0xD) ^ -" ".length()));
        ChatController.lIllllIIlIllll[1] = " ".length();
        ChatController.lIllllIIlIllll[2] = "  ".length();
        ChatController.lIllllIIlIllll[3] = (0x81 ^ 0xB2) + (0x35 ^ 0x33) - (0x55 ^ 0x65) + (0xE4 ^ 0x93);
        ChatController.lIllllIIlIllll[4] = (0xFFFF85FE & 0x7BF5);
        ChatController.lIllllIIlIllll[5] = (0xFFFFEFD7 & 0x17F8);
        ChatController.lIllllIIlIllll[6] = "   ".length();
        ChatController.lIllllIIlIllll[7] = (0xA3 ^ 0xA7);
        ChatController.lIllllIIlIllll[8] = (0xA ^ 0xF);
        ChatController.lIllllIIlIllll[9] = (0x52 ^ 0x54);
        ChatController.lIllllIIlIllll[10] = (0x47 ^ 0xB ^ (0x43 ^ 0x8));
        ChatController.lIllllIIlIllll[11] = (0x46 ^ 0x4E);
        ChatController.lIllllIIlIllll[12] = (0x6A ^ 0x63);
        ChatController.lIllllIIlIllll[13] = (61 + 137 - 104 + 49 ^ 38 + 94 - 37 + 38);
        ChatController.lIllllIIlIllll[14] = (0xD0 ^ 0xB7 ^ (0x59 ^ 0x35));
        ChatController.lIllllIIlIllll[15] = (0x73 ^ 0x7F);
        ChatController.lIllllIIlIllll[16] = (0x72 ^ 0x37 ^ (0x28 ^ 0x60));
        ChatController.lIllllIIlIllll[17] = (0x62 ^ 0x6C);
        ChatController.lIllllIIlIllll[18] = (0x36 ^ 0x39);
    }
    
    private static String lIIIIlIIIIIllIlI(String llllllllllllIllllIlIlIlIlIllllll, final String llllllllllllIllllIlIlIlIllIIIlII) {
        llllllllllllIllllIlIlIlIlIllllll = new String(Base64.getDecoder().decode(llllllllllllIllllIlIlIlIlIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIlIlIlIllIIIIll = new StringBuilder();
        final char[] llllllllllllIllllIlIlIlIllIIIIlI = llllllllllllIllllIlIlIlIllIIIlII.toCharArray();
        int llllllllllllIllllIlIlIlIllIIIIIl = ChatController.lIllllIIlIllll[0];
        final double llllllllllllIllllIlIlIlIlIllIlll = (Object)llllllllllllIllllIlIlIlIlIllllll.toCharArray();
        final float llllllllllllIllllIlIlIlIlIllIlIl = llllllllllllIllllIlIlIlIlIllIlll.length;
        long llllllllllllIllllIlIlIlIlIllIIll = ChatController.lIllllIIlIllll[0];
        while (lIIIIlIIIIlIllII((int)llllllllllllIllllIlIlIlIlIllIIll, (int)llllllllllllIllllIlIlIlIlIllIlIl)) {
            final char llllllllllllIllllIlIlIlIllIIIllI = llllllllllllIllllIlIlIlIlIllIlll[llllllllllllIllllIlIlIlIlIllIIll];
            llllllllllllIllllIlIlIlIllIIIIll.append((char)(llllllllllllIllllIlIlIlIllIIIllI ^ llllllllllllIllllIlIlIlIllIIIIlI[llllllllllllIllllIlIlIlIllIIIIIl % llllllllllllIllllIlIlIlIllIIIIlI.length]));
            "".length();
            ++llllllllllllIllllIlIlIlIllIIIIIl;
            ++llllllllllllIllllIlIlIlIlIllIIll;
            "".length();
            if (((" ".length() ^ (0x6 ^ 0x4A)) & (0xD ^ 0x77 ^ (0x83 ^ 0xB4) ^ -" ".length())) < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIlIlIlIllIIIIll);
    }
    
    public boolean func_175986_a(final String llllllllllllIllllIlIlIllIIllIIlI, final String llllllllllllIllllIlIlIllIIllIIIl) {
        if (lIIIIlIIIIlIlIIl(this.field_153011_i, ChatState.Initialized)) {
            return ChatController.lIllllIIlIllll[0] != 0;
        }
        if (lIIIIlIIIIlIIllI(this.field_175998_i.containsKey(llllllllllllIllllIlIlIllIIllIIlI) ? 1 : 0)) {
            this.func_152995_h(String.valueOf(new StringBuilder(ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[13]]).append(llllllllllllIllllIlIlIllIIllIIlI)));
            return ChatController.lIllllIIlIllll[0] != 0;
        }
        final ChatChannelListener llllllllllllIllllIlIlIllIIllIlII = this.field_175998_i.get(llllllllllllIllllIlIlIllIIllIIlI);
        return llllllllllllIllllIlIlIllIIllIlII.func_176037_b(llllllllllllIllllIlIlIllIIllIIIl);
    }
    
    public void func_152997_n() {
        if (lIIIIlIIIIlIlIIl(this.field_153011_i, ChatState.Uninitialized)) {
            final ErrorCode llllllllllllIllllIlIlIllIlIIIIII = this.field_153008_f.flushEvents();
            if (lIIIIlIIIIlIlIlI(ErrorCode.failed(llllllllllllIllllIlIlIllIlIIIIII) ? 1 : 0)) {
                final String llllllllllllIllllIlIlIllIIllllll = ErrorCode.getString(llllllllllllIllllIlIlIllIlIIIIII);
                final String format = ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[12]];
                final Object[] args = new Object[ChatController.lIllllIIlIllll[1]];
                args[ChatController.lIllllIIlIllll[0]] = llllllllllllIllllIlIlIllIIllllll;
                this.func_152995_h(String.format(format, args));
            }
        }
    }
    
    public ChatState func_153000_j() {
        return this.field_153011_i;
    }
    
    public ChatController() {
        this.field_153003_a = null;
        this.field_153004_b = ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[0]];
        this.field_153006_d = ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[1]];
        this.field_153007_e = ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[2]];
        this.field_175992_e = null;
        this.field_153008_f = null;
        this.field_153011_i = ChatState.Uninitialized;
        this.field_153012_j = new AuthToken();
        this.field_175998_i = new HashMap<String, ChatChannelListener>();
        this.field_153015_m = ChatController.lIllllIIlIllll[3];
        this.field_175997_k = EnumEmoticonMode.None;
        this.field_175995_l = EnumEmoticonMode.None;
        this.field_175996_m = null;
        this.field_175993_n = ChatController.lIllllIIlIllll[4];
        this.field_175994_o = ChatController.lIllllIIlIllll[5];
        this.field_175999_p = (IChatAPIListener)new IChatAPIListener() {
            private static final /* synthetic */ String[] lllIIIlllllIII;
            private static final /* synthetic */ int[] lllIIlIIIllIII;
            
            private static String lIIllllIIllIIlll(String llllllllllllIlIlllllIIIlllIlIIIl, final String llllllllllllIlIlllllIIIlllIlIlIl) {
                llllllllllllIlIlllllIIIlllIlIIIl = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIlIlllllIIIlllIlIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIlIlllllIIIlllIlIlII = new StringBuilder();
                final char[] llllllllllllIlIlllllIIIlllIlIIll = llllllllllllIlIlllllIIIlllIlIlIl.toCharArray();
                int llllllllllllIlIlllllIIIlllIlIIlI = ChatController$1.lllIIlIIIllIII[0];
                final short llllllllllllIlIlllllIIIlllIIllII = (short)(Object)((String)llllllllllllIlIlllllIIIlllIlIIIl).toCharArray();
                final double llllllllllllIlIlllllIIIlllIIlIll = llllllllllllIlIlllllIIIlllIIllII.length;
                short llllllllllllIlIlllllIIIlllIIlIlI = (short)ChatController$1.lllIIlIIIllIII[0];
                while (lIIllllIllllIlII(llllllllllllIlIlllllIIIlllIIlIlI, (int)llllllllllllIlIlllllIIIlllIIlIll)) {
                    final char llllllllllllIlIlllllIIIlllIlIlll = llllllllllllIlIlllllIIIlllIIllII[llllllllllllIlIlllllIIIlllIIlIlI];
                    llllllllllllIlIlllllIIIlllIlIlII.append((char)(llllllllllllIlIlllllIIIlllIlIlll ^ llllllllllllIlIlllllIIIlllIlIIll[llllllllllllIlIlllllIIIlllIlIIlI % llllllllllllIlIlllllIIIlllIlIIll.length]));
                    "".length();
                    ++llllllllllllIlIlllllIIIlllIlIIlI;
                    ++llllllllllllIlIlllllIIIlllIIlIlI;
                    "".length();
                    if (-(0xC4 ^ 0xB0 ^ (0xC4 ^ 0xB4)) > 0) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIlIlllllIIIlllIlIlII);
            }
            
            private static boolean lIIllllIllllIlII(final int llllllllllllIlIlllllIIIllIlllIIl, final int llllllllllllIlIlllllIIIllIlllIII) {
                return llllllllllllIlIlllllIIIllIlllIIl < llllllllllllIlIlllllIIIllIlllIII;
            }
            
            public void chatEmoticonDataDownloadCallback(final ErrorCode llllllllllllIlIlllllIIIllllIIIIl) {
                if (lIIllllIllllIIlI(ErrorCode.succeeded(llllllllllllIlIlllllIIIllllIIIIl) ? 1 : 0)) {
                    ChatController.this.func_152988_s();
                }
            }
            
            public void chatShutdownCallback(final ErrorCode llllllllllllIlIlllllIIIllllIlllI) {
                if (lIIllllIllllIIlI(ErrorCode.succeeded(llllllllllllIlIlllllIIIllllIlllI) ? 1 : 0)) {
                    final ErrorCode llllllllllllIlIlllllIIIllllIllIl = ChatController.this.field_175992_e.shutdown();
                    if (lIIllllIllllIIlI(ErrorCode.failed(llllllllllllIlIlllllIIIllllIllIl) ? 1 : 0)) {
                        final String llllllllllllIlIlllllIIIllllIllII = ErrorCode.getString(llllllllllllIlIlllllIIIllllIllIl);
                        final ChatController this$0 = ChatController.this;
                        final String format = ChatController$1.lllIIIlllllIII[ChatController$1.lllIIlIIIllIII[0]];
                        final Object[] args = new Object[ChatController$1.lllIIlIIIllIII[1]];
                        args[ChatController$1.lllIIlIIIllIII[0]] = llllllllllllIlIlllllIIIllllIllII;
                        this$0.func_152995_h(String.format(format, args));
                    }
                    ChatController.this.func_175985_a(ChatState.Uninitialized);
                    "".length();
                    if ("  ".length() < 0) {
                        return;
                    }
                }
                else {
                    ChatController.this.func_175985_a(ChatState.Initialized);
                    final ChatController this$2 = ChatController.this;
                    final String format2 = ChatController$1.lllIIIlllllIII[ChatController$1.lllIIlIIIllIII[1]];
                    final Object[] args2 = new Object[ChatController$1.lllIIlIIIllIII[1]];
                    args2[ChatController$1.lllIIlIIIllIII[0]] = llllllllllllIlIlllllIIIllllIlllI;
                    this$2.func_152995_h(String.format(format2, args2));
                }
                try {
                    if (lIIllllIllllIIll(ChatController.this.field_153003_a)) {
                        ChatController.this.field_153003_a.func_176022_e(llllllllllllIlIlllllIIIllllIlllI);
                        "".length();
                        if (-" ".length() == "   ".length()) {
                            return;
                        }
                    }
                }
                catch (Exception llllllllllllIlIlllllIIIllllIlIll) {
                    ChatController.this.func_152995_h(llllllllllllIlIlllllIIIllllIlIll.toString());
                }
            }
            
            static {
                lIIllllIllllIIIl();
                lIIllllIIllIlIII();
            }
            
            private static String lIIllllIIllIIllI(final String llllllllllllIlIlllllIIIlllIIIIIl, final String llllllllllllIlIlllllIIIllIlllllI) {
                try {
                    final SecretKeySpec llllllllllllIlIlllllIIIlllIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllllIIIllIlllllI.getBytes(StandardCharsets.UTF_8)), ChatController$1.lllIIlIIIllIII[3]), "DES");
                    final Cipher llllllllllllIlIlllllIIIlllIIIIll = Cipher.getInstance("DES");
                    llllllllllllIlIlllllIIIlllIIIIll.init(ChatController$1.lllIIlIIIllIII[2], llllllllllllIlIlllllIIIlllIIIlII);
                    return new String(llllllllllllIlIlllllIIIlllIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllllIIIlllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlIlllllIIIlllIIIIlI) {
                    llllllllllllIlIlllllIIIlllIIIIlI.printStackTrace();
                    return null;
                }
            }
            
            private static void lIIllllIIllIlIII() {
                (lllIIIlllllIII = new String[ChatController$1.lllIIlIIIllIII[2]])[ChatController$1.lllIIlIIIllIII[0]] = lIIllllIIllIIllI("sdQF6g4PcZK7Bs4dS8iFO1W2T91t/Xi1EQvGerQCEodi9hQy0/NYLg==", "IScPi");
                ChatController$1.lllIIIlllllIII[ChatController$1.lllIIlIIIllIII[1]] = lIIllllIIllIIlll("FD8bKyVxPgExIyUkByN3NSIeKncFOgAwP3EuASUja21MNw==", "QMiDW");
            }
            
            private static boolean lIIllllIllllIIll(final Object llllllllllllIlIlllllIIIllIllIllI) {
                return llllllllllllIlIlllllIIIllIllIllI != null;
            }
            
            private static void lIIllllIllllIIIl() {
                (lllIIlIIIllIII = new int[4])[0] = ((0x21 ^ 0x49 ^ (0x6B ^ 0xA)) & (0x5E ^ 0x2D ^ (0x6C ^ 0x16) ^ -" ".length()));
                ChatController$1.lllIIlIIIllIII[1] = " ".length();
                ChatController$1.lllIIlIIIllIII[2] = "  ".length();
                ChatController$1.lllIIlIIIllIII[3] = (0xBC ^ 0x91 ^ (0xA1 ^ 0x84));
            }
            
            private static boolean lIIllllIllllIIlI(final int llllllllllllIlIlllllIIIllIllIlII) {
                return llllllllllllIlIlllllIIIllIllIlII != 0;
            }
            
            public void chatInitializationCallback(final ErrorCode llllllllllllIlIlllllIIIllllllIII) {
                if (lIIllllIllllIIlI(ErrorCode.succeeded(llllllllllllIlIlllllIIIllllllIII) ? 1 : 0)) {
                    ChatController.this.field_153008_f.setMessageFlushInterval(ChatController.this.field_175993_n);
                    "".length();
                    ChatController.this.field_153008_f.setUserChangeEventInterval(ChatController.this.field_175994_o);
                    "".length();
                    ChatController.this.func_153001_r();
                    ChatController.this.func_175985_a(ChatState.Initialized);
                    "".length();
                    if (((0x62 ^ 0x7A) & ~(0x1B ^ 0x3)) > 0) {
                        return;
                    }
                }
                else {
                    ChatController.this.func_175985_a(ChatState.Uninitialized);
                }
                try {
                    if (lIIllllIllllIIll(ChatController.this.field_153003_a)) {
                        ChatController.this.field_153003_a.func_176023_d(llllllllllllIlIlllllIIIllllllIII);
                        "".length();
                        if (" ".length() >= (0x29 ^ 0x2D)) {
                            return;
                        }
                    }
                }
                catch (Exception llllllllllllIlIlllllIIIlllllIlll) {
                    ChatController.this.func_152995_h(llllllllllllIlIlllllIIIlllllIlll.toString());
                }
            }
        };
        this.field_175992_e = Core.getInstance();
        if (lIIIIlIIIIlIlIII(this.field_175992_e)) {
            this.field_175992_e = new Core((CoreAPI)new StandardCoreAPI());
        }
        this.field_153008_f = new Chat((ChatAPI)new StandardChatAPI());
    }
    
    public void func_152984_a(final String llllllllllllIllllIlIlIlllIIllllI) {
        this.field_153006_d = llllllllllllIllllIlIlIlllIIllllI;
    }
    
    private static String lIIIIlIIIIIllIll(final String llllllllllllIllllIlIlIlIllllllII, final String llllllllllllIllllIlIlIlIlllllIll) {
        try {
            final SecretKeySpec llllllllllllIllllIlIlIllIIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIlIlIlllllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIlIlIlIllllllll = Cipher.getInstance("Blowfish");
            llllllllllllIllllIlIlIlIllllllll.init(ChatController.lIllllIIlIllll[2], llllllllllllIllllIlIlIllIIIIIIII);
            return new String(llllllllllllIllllIlIlIlIllllllll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIlIlIllllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlIlIlIlllllllI) {
            llllllllllllIllllIlIlIlIlllllllI.printStackTrace();
            return null;
        }
    }
    
    protected void func_152988_s() {
        if (lIIIIlIIIIlIlIII(this.field_175996_m)) {
            this.field_175996_m = new ChatEmoticonData();
            final ErrorCode llllllllllllIllllIlIlIllIIIllIIl = this.field_153008_f.getEmoticonData(this.field_175996_m);
            if (lIIIIlIIIIlIlIlI(ErrorCode.succeeded(llllllllllllIllllIlIlIllIIIllIIl) ? 1 : 0)) {
                try {
                    if (!lIIIIlIIIIlIlIll(this.field_153003_a)) {
                        return;
                    }
                    this.field_153003_a.func_176021_d();
                    "".length();
                    if ((0x4C ^ 0x73 ^ (0xB5 ^ 0x8E)) == 0x0) {
                        return;
                    }
                    return;
                }
                catch (Exception llllllllllllIllllIlIlIllIIIllIII) {
                    this.func_152995_h(llllllllllllIllllIlIlIllIIIllIII.toString());
                    "".length();
                    if ((0x41 ^ 0x45) < 0) {
                        return;
                    }
                    return;
                }
            }
            this.func_152995_h(String.valueOf(new StringBuilder(ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[15]]).append(ErrorCode.getString(llllllllllllIllllIlIlIllIIIllIIl))));
        }
    }
    
    private static boolean lIIIIlIIIIlIllII(final int llllllllllllIllllIlIlIlIlIlIlIIl, final int llllllllllllIllllIlIlIlIlIlIlIII) {
        return llllllllllllIllllIlIlIlIlIlIlIIl < llllllllllllIllllIlIlIlIlIlIlIII;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$client$stream$ChatController$EnumEmoticonMode() {
        final int[] $switch_TABLE$net$minecraft$client$stream$ChatController$EnumEmoticonMode = ChatController.$SWITCH_TABLE$net$minecraft$client$stream$ChatController$EnumEmoticonMode;
        if (lIIIIlIIIIlIlIll($switch_TABLE$net$minecraft$client$stream$ChatController$EnumEmoticonMode)) {
            return $switch_TABLE$net$minecraft$client$stream$ChatController$EnumEmoticonMode;
        }
        "".length();
        final double llllllllllllIllllIlIlIllIIIIIllI = (Object)new int[EnumEmoticonMode.values().length];
        try {
            llllllllllllIllllIlIlIllIIIIIllI[EnumEmoticonMode.None.ordinal()] = ChatController.lIllllIIlIllll[1];
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIllllIlIlIllIIIIIllI[EnumEmoticonMode.TextureAtlas.ordinal()] = ChatController.lIllllIIlIllll[6];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIllllIlIlIllIIIIIllI[EnumEmoticonMode.Url.ordinal()] = ChatController.lIllllIIlIllll[2];
            "".length();
            if ("   ".length() == "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        return ChatController.$SWITCH_TABLE$net$minecraft$client$stream$ChatController$EnumEmoticonMode = (int[])(Object)llllllllllllIllllIlIlIllIIIIIllI;
    }
    
    public void func_152994_a(final AuthToken llllllllllllIllllIlIlIlllIlIIIlI) {
        this.field_153012_j = llllllllllllIllllIlIlIlllIlIIIlI;
    }
    
    private static boolean lIIIIlIIIIlIlIlI(final int llllllllllllIllllIlIlIlIlIIIllIl) {
        return llllllllllllIllllIlIlIlIlIIIllIl != 0;
    }
    
    public boolean func_175984_n() {
        if (lIIIIlIIIIlIlIIl(this.field_153011_i, ChatState.Uninitialized)) {
            return ChatController.lIllllIIlIllll[0] != 0;
        }
        this.func_175985_a(ChatState.Initializing);
        ErrorCode llllllllllllIllllIlIlIllIllllIII = this.field_175992_e.initialize(this.field_153006_d, (String)null);
        if (lIIIIlIIIIlIlIlI(ErrorCode.failed(llllllllllllIllllIlIlIllIllllIII) ? 1 : 0)) {
            this.func_175985_a(ChatState.Uninitialized);
            final String llllllllllllIllllIlIlIllIlllIlll = ErrorCode.getString(llllllllllllIllllIlIlIllIllllIII);
            final String format = ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[6]];
            final Object[] args = new Object[ChatController.lIllllIIlIllll[1]];
            args[ChatController.lIllllIIlIllll[0]] = llllllllllllIllllIlIlIllIlllIlll;
            this.func_152995_h(String.format(format, args));
            return ChatController.lIllllIIlIllll[0] != 0;
        }
        this.field_175995_l = this.field_175997_k;
        final HashSet<ChatTokenizationOption> llllllllllllIllllIlIlIllIlllIllI = new HashSet<ChatTokenizationOption>();
        switch ($SWITCH_TABLE$net$minecraft$client$stream$ChatController$EnumEmoticonMode()[this.field_175997_k.ordinal()]) {
            case 1: {
                llllllllllllIllllIlIlIllIlllIllI.add(ChatTokenizationOption.TTV_CHAT_TOKENIZATION_OPTION_NONE);
                "".length();
                "".length();
                if (-" ".length() > (0x17 ^ 0x5A ^ (0xB ^ 0x42))) {
                    return ((0x80 ^ 0x87 ^ (0xDE ^ 0xB9)) & (134 + 39 - 27 + 17 ^ 115 + 42 - 1 + 39 ^ -" ".length())) != 0x0;
                }
                break;
            }
            case 2: {
                llllllllllllIllllIlIlIllIlllIllI.add(ChatTokenizationOption.TTV_CHAT_TOKENIZATION_OPTION_EMOTICON_URLS);
                "".length();
                "".length();
                if (-"   ".length() > 0) {
                    return ((0x8A ^ 0xB4) & ~(0x46 ^ 0x78)) != 0x0;
                }
                break;
            }
            case 3: {
                llllllllllllIllllIlIlIllIlllIllI.add(ChatTokenizationOption.TTV_CHAT_TOKENIZATION_OPTION_EMOTICON_TEXTURES);
                "".length();
                break;
            }
        }
        llllllllllllIllllIlIlIllIllllIII = this.field_153008_f.initialize((HashSet)llllllllllllIllllIlIlIllIlllIllI, this.field_175999_p);
        if (lIIIIlIIIIlIlIlI(ErrorCode.failed(llllllllllllIllllIlIlIllIllllIII) ? 1 : 0)) {
            this.field_175992_e.shutdown();
            "".length();
            this.func_175985_a(ChatState.Uninitialized);
            final String llllllllllllIllllIlIlIllIlllIlIl = ErrorCode.getString(llllllllllllIllllIlIlIllIllllIII);
            final String format2 = ChatController.lIllllIIlIllII[ChatController.lIllllIIlIllll[7]];
            final Object[] args2 = new Object[ChatController.lIllllIIlIllll[1]];
            args2[ChatController.lIllllIIlIllll[0]] = llllllllllllIllllIlIlIllIlllIlIl;
            this.func_152995_h(String.format(format2, args2));
            return ChatController.lIllllIIlIllll[0] != 0;
        }
        this.func_175985_a(ChatState.Initialized);
        return ChatController.lIllllIIlIllll[1] != 0;
    }
    
    private static boolean lIIIIlIIIIlIlIII(final Object llllllllllllIllllIlIlIlIlIIlIIII) {
        return llllllllllllIllllIlIlIlIlIIlIIII == null;
    }
    
    public void func_175988_p() {
        if (lIIIIlIIIIlIlIIl(this.func_153000_j(), ChatState.Uninitialized)) {
            this.func_152993_m();
            "".length();
            if (lIIIIlIIIIlIIlll(this.func_153000_j(), ChatState.ShuttingDown)) {
                "".length();
                if (((0x48 ^ 0x5A ^ (0x1C ^ 0x51)) & (0x79 ^ 0x12 ^ (0x47 ^ 0x73) ^ -" ".length())) >= (55 + 13 - 16 + 78 ^ 124 + 103 - 188 + 95)) {
                    return;
                }
                while (!lIIIIlIIIIlIIlll(this.func_153000_j(), ChatState.Uninitialized)) {
                    try {
                        Thread.sleep(200L);
                        this.func_152997_n();
                        "".length();
                        if ("  ".length() < 0) {
                            return;
                        }
                        continue;
                    }
                    catch (InterruptedException ex) {}
                }
            }
        }
    }
    
    public enum EnumEmoticonMode
    {
        Url(EnumEmoticonMode.lllIlIIIlIllll[EnumEmoticonMode.lllIlIIIllIIII[1]], EnumEmoticonMode.lllIlIIIllIIII[1]);
        
        private static final /* synthetic */ String[] lllIlIIIlIllll;
        private static final /* synthetic */ int[] lllIlIIIllIIII;
        
        None(EnumEmoticonMode.lllIlIIIlIllll[EnumEmoticonMode.lllIlIIIllIIII[0]], EnumEmoticonMode.lllIlIIIllIIII[0]), 
        TextureAtlas(EnumEmoticonMode.lllIlIIIlIllll[EnumEmoticonMode.lllIlIIIllIIII[2]], EnumEmoticonMode.lllIlIIIllIIII[2]);
        
        private static String lIlIIIIllIllllII(final String llllllllllllIlIlllIIlIIIllllllll, final String llllllllllllIlIlllIIlIIlIIIIIIII) {
            try {
                final SecretKeySpec llllllllllllIlIlllIIlIIlIIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIIlIIlIIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlIlllIIlIIlIIIIIIll = Cipher.getInstance("Blowfish");
                llllllllllllIlIlllIIlIIlIIIIIIll.init(EnumEmoticonMode.lllIlIIIllIIII[2], llllllllllllIlIlllIIlIIlIIIIIlII);
                return new String(llllllllllllIlIlllIIlIIlIIIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIIlIIIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIlllIIlIIlIIIIIIlI) {
                llllllllllllIlIlllIIlIIlIIIIIIlI.printStackTrace();
                return null;
            }
        }
        
        private static void lIlIIIIllIllllll() {
            (lllIlIIIlIllll = new String[EnumEmoticonMode.lllIlIIIllIIII[3]])[EnumEmoticonMode.lllIlIIIllIIII[0]] = lIlIIIIllIllllII("NZys7G8EmHI=", "VprLe");
            EnumEmoticonMode.lllIlIIIlIllll[EnumEmoticonMode.lllIlIIIllIIII[1]] = lIlIIIIllIllllII("npv2/ag/6xs=", "XkiYs");
            EnumEmoticonMode.lllIlIIIlIllll[EnumEmoticonMode.lllIlIIIllIIII[2]] = lIlIIIIllIlllllI("ABYMJRMmFjUlCjUA", "TstQf");
        }
        
        static {
            lIlIIIIlllIIIIII();
            lIlIIIIllIllllll();
            final EnumEmoticonMode[] enum$VALUES = new EnumEmoticonMode[EnumEmoticonMode.lllIlIIIllIIII[3]];
            enum$VALUES[EnumEmoticonMode.lllIlIIIllIIII[0]] = EnumEmoticonMode.None;
            enum$VALUES[EnumEmoticonMode.lllIlIIIllIIII[1]] = EnumEmoticonMode.Url;
            enum$VALUES[EnumEmoticonMode.lllIlIIIllIIII[2]] = EnumEmoticonMode.TextureAtlas;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static boolean lIlIIIIlllIIIIIl(final int llllllllllllIlIlllIIlIIIlllIIIIl, final int llllllllllllIlIlllIIlIIIlllIIIII) {
            return llllllllllllIlIlllIIlIIIlllIIIIl < llllllllllllIlIlllIIlIIIlllIIIII;
        }
        
        private EnumEmoticonMode(final String llllllllllllIlIlllIIlIIlIIIlIIlI, final int llllllllllllIlIlllIIlIIlIIIlIIIl) {
        }
        
        private static String lIlIIIIllIlllllI(String llllllllllllIlIlllIIlIIIlllIllII, final String llllllllllllIlIlllIIlIIIllllIIII) {
            llllllllllllIlIlllIIlIIIlllIllII = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIlIlllIIlIIIlllIllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlIlllIIlIIIlllIllll = new StringBuilder();
            final char[] llllllllllllIlIlllIIlIIIlllIlllI = llllllllllllIlIlllIIlIIIllllIIII.toCharArray();
            int llllllllllllIlIlllIIlIIIlllIllIl = EnumEmoticonMode.lllIlIIIllIIII[0];
            final String llllllllllllIlIlllIIlIIIlllIIlll = (Object)((String)llllllllllllIlIlllIIlIIIlllIllII).toCharArray();
            final int llllllllllllIlIlllIIlIIIlllIIllI = llllllllllllIlIlllIIlIIIlllIIlll.length;
            boolean llllllllllllIlIlllIIlIIIlllIIlIl = EnumEmoticonMode.lllIlIIIllIIII[0] != 0;
            while (lIlIIIIlllIIIIIl(llllllllllllIlIlllIIlIIIlllIIlIl ? 1 : 0, llllllllllllIlIlllIIlIIIlllIIllI)) {
                final char llllllllllllIlIlllIIlIIIllllIIlI = llllllllllllIlIlllIIlIIIlllIIlll[llllllllllllIlIlllIIlIIIlllIIlIl];
                llllllllllllIlIlllIIlIIIlllIllll.append((char)(llllllllllllIlIlllIIlIIIllllIIlI ^ llllllllllllIlIlllIIlIIIlllIlllI[llllllllllllIlIlllIIlIIIlllIllIl % llllllllllllIlIlllIIlIIIlllIlllI.length]));
                "".length();
                ++llllllllllllIlIlllIIlIIIlllIllIl;
                ++llllllllllllIlIlllIIlIIIlllIIlIl;
                "".length();
                if (-" ".length() > (0x51 ^ 0x55)) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlIlllIIlIIIlllIllll);
        }
        
        private static void lIlIIIIlllIIIIII() {
            (lllIlIIIllIIII = new int[4])[0] = ((0xEB ^ 0xB8) & ~(0xF6 ^ 0xA5));
            EnumEmoticonMode.lllIlIIIllIIII[1] = " ".length();
            EnumEmoticonMode.lllIlIIIllIIII[2] = "  ".length();
            EnumEmoticonMode.lllIlIIIllIIII[3] = "   ".length();
        }
    }
    
    public interface ChatListener
    {
        void func_176018_a(final String p0, final ChatUserInfo[] p1, final ChatUserInfo[] p2, final ChatUserInfo[] p3);
        
        void func_180605_a(final String p0, final ChatRawMessage[] p1);
        
        void func_176019_a(final String p0, final String p1);
        
        void func_176017_a(final ChatState p0);
        
        void func_176022_e(final ErrorCode p0);
        
        void func_180606_a(final String p0);
        
        void func_176021_d();
        
        void func_176024_e();
        
        void func_176016_c(final String p0);
        
        void func_176023_d(final ErrorCode p0);
        
        void func_176020_d(final String p0);
        
        void func_180607_b(final String p0);
        
        void func_176025_a(final String p0, final ChatTokenizedMessage[] p1);
    }
    
    public enum ChatState
    {
        Initialized(ChatState.llIlIllIllIIlI[ChatState.llIlIllIllIlII[2]], ChatState.llIlIllIllIlII[2]);
        
        private static final /* synthetic */ String[] llIlIllIllIIlI;
        private static final /* synthetic */ int[] llIlIllIllIlII;
        
        ShuttingDown(ChatState.llIlIllIllIIlI[ChatState.llIlIllIllIlII[3]], ChatState.llIlIllIllIlII[3]), 
        Uninitialized(ChatState.llIlIllIllIIlI[ChatState.llIlIllIllIlII[0]], ChatState.llIlIllIllIlII[0]), 
        Initializing(ChatState.llIlIllIllIIlI[ChatState.llIlIllIllIlII[1]], ChatState.llIlIllIllIlII[1]);
        
        private static boolean lIIlIlIlIllIllII(final int llllllllllllIllIlIIlIlIlIIlIlIII, final int llllllllllllIllIlIIlIlIlIIlIIlll) {
            return llllllllllllIllIlIIlIlIlIIlIlIII < llllllllllllIllIlIIlIlIlIIlIIlll;
        }
        
        private ChatState(final String llllllllllllIllIlIIlIlIlIlIllIIl, final int llllllllllllIllIlIIlIlIlIlIllIII) {
        }
        
        private static String lIIlIlIlIllIIlIl(String llllllllllllIllIlIIlIlIlIlIIIIII, final String llllllllllllIllIlIIlIlIlIlIIIlII) {
            llllllllllllIllIlIIlIlIlIlIIIIII = new String(Base64.getDecoder().decode(llllllllllllIllIlIIlIlIlIlIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIlIIlIlIlIlIIIIll = new StringBuilder();
            final char[] llllllllllllIllIlIIlIlIlIlIIIIlI = llllllllllllIllIlIIlIlIlIlIIIlII.toCharArray();
            int llllllllllllIllIlIIlIlIlIlIIIIIl = ChatState.llIlIllIllIlII[0];
            final int llllllllllllIllIlIIlIlIlIIlllIll = (Object)llllllllllllIllIlIIlIlIlIlIIIIII.toCharArray();
            final long llllllllllllIllIlIIlIlIlIIlllIlI = llllllllllllIllIlIIlIlIlIIlllIll.length;
            boolean llllllllllllIllIlIIlIlIlIIlllIIl = ChatState.llIlIllIllIlII[0] != 0;
            while (lIIlIlIlIllIllII(llllllllllllIllIlIIlIlIlIIlllIIl ? 1 : 0, (int)llllllllllllIllIlIIlIlIlIIlllIlI)) {
                final char llllllllllllIllIlIIlIlIlIlIIIllI = llllllllllllIllIlIIlIlIlIIlllIll[llllllllllllIllIlIIlIlIlIIlllIIl];
                llllllllllllIllIlIIlIlIlIlIIIIll.append((char)(llllllllllllIllIlIIlIlIlIlIIIllI ^ llllllllllllIllIlIIlIlIlIlIIIIlI[llllllllllllIllIlIIlIlIlIlIIIIIl % llllllllllllIllIlIIlIlIlIlIIIIlI.length]));
                "".length();
                ++llllllllllllIllIlIIlIlIlIlIIIIIl;
                ++llllllllllllIllIlIIlIlIlIIlllIIl;
                "".length();
                if (-" ".length() >= (20 + 22 + 60 + 73 ^ 114 + 154 - 230 + 133)) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIlIIlIlIlIlIIIIll);
        }
        
        private static void lIIlIlIlIllIIlll() {
            (llIlIllIllIIlI = new String[ChatState.llIlIllIllIlII[4]])[ChatState.llIlIllIllIlII[0]] = lIIlIlIlIllIIlIl("OQkOFBwYDgYWHBYCAw==", "lggzu");
            ChatState.llIlIllIllIIlI[ChatState.llIlIllIllIlII[1]] = lIIlIlIlIllIIllI("YOrregTXBB7zWLA+Vh69rw==", "DPord");
            ChatState.llIlIllIllIIlI[ChatState.llIlIllIllIlII[2]] = lIIlIlIlIllIIllI("ZwQHDHS9i2FmooGTI9/qxg==", "PYFdb");
            ChatState.llIlIllIllIIlI[ChatState.llIlIllIllIlII[3]] = lIIlIlIlIllIIlIl("JD4cHDUeOA4sLgA4", "wVihA");
        }
        
        static {
            lIIlIlIlIllIlIll();
            lIIlIlIlIllIIlll();
            final ChatState[] enum$VALUES = new ChatState[ChatState.llIlIllIllIlII[4]];
            enum$VALUES[ChatState.llIlIllIllIlII[0]] = ChatState.Uninitialized;
            enum$VALUES[ChatState.llIlIllIllIlII[1]] = ChatState.Initializing;
            enum$VALUES[ChatState.llIlIllIllIlII[2]] = ChatState.Initialized;
            enum$VALUES[ChatState.llIlIllIllIlII[3]] = ChatState.ShuttingDown;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static String lIIlIlIlIllIIllI(final String llllllllllllIllIlIIlIlIlIIlIlllI, final String llllllllllllIllIlIIlIlIlIIlIllIl) {
            try {
                final SecretKeySpec llllllllllllIllIlIIlIlIlIIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIlIlIlIIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIlIIlIlIlIIllIIlI = Cipher.getInstance("Blowfish");
                llllllllllllIllIlIIlIlIlIIllIIlI.init(ChatState.llIlIllIllIlII[2], llllllllllllIllIlIIlIlIlIIllIIll);
                return new String(llllllllllllIllIlIIlIlIlIIllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIlIlIlIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlIIlIlIlIIllIIIl) {
                llllllllllllIllIlIIlIlIlIIllIIIl.printStackTrace();
                return null;
            }
        }
        
        private static void lIIlIlIlIllIlIll() {
            (llIlIllIllIlII = new int[5])[0] = ((0xD9 ^ 0x9A) & ~(0x6D ^ 0x2E));
            ChatState.llIlIllIllIlII[1] = " ".length();
            ChatState.llIlIllIllIlII[2] = "  ".length();
            ChatState.llIlIllIllIlII[3] = "   ".length();
            ChatState.llIlIllIllIlII[4] = (0xC3 ^ 0x81 ^ (0x1A ^ 0x5C));
        }
    }
    
    public class ChatChannelListener implements IChatChannelListener
    {
        protected /* synthetic */ ChatBadgeData field_176043_g;
        private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$client$stream$ChatController$EnumChannelState;
        protected /* synthetic */ String field_176048_a;
        protected /* synthetic */ LinkedList<ChatTokenizedMessage> field_176042_f;
        private static final /* synthetic */ String[] lIllIllIlIIlIl;
        protected /* synthetic */ List<ChatUserInfo> field_176044_d;
        protected /* synthetic */ LinkedList<ChatRawMessage> field_176045_e;
        private static volatile /* synthetic */ int[] $SWITCH_TABLE$tv$twitch$chat$ChatEvent;
        protected /* synthetic */ EnumChannelState field_176047_c;
        protected /* synthetic */ boolean field_176046_b;
        private static final /* synthetic */ int[] lIllIllIlIIlll;
        
        private static boolean llllllllIlIlIII(final Object llllllllllllIllllllIllllIlIlIlIl) {
            return llllllllllllIllllllIllllIlIlIlIl != null;
        }
        
        private static boolean llllllllIlIlIlI(final int llllllllllllIllllllIllllIlIIllIl) {
            return llllllllllllIllllllIllllIlIIllIl >= 0;
        }
        
        private static boolean llllllllIlIIlll(final int llllllllllllIllllllIllllIlIIllll) {
            return llllllllllllIllllllIllllIlIIllll == 0;
        }
        
        public boolean func_176037_b(final String llllllllllllIlllllllIIIIIIlIIIIl) {
            if (llllllllIlIIlII(this.field_176047_c, EnumChannelState.Connected)) {
                return ChatChannelListener.lIllIllIlIIlll[0] != 0;
            }
            final ErrorCode llllllllllllIlllllllIIIIIIlIIlII = ChatController.this.field_153008_f.sendMessage(this.field_176048_a, llllllllllllIlllllllIIIIIIlIIIIl);
            if (llllllllIlIIIll(ErrorCode.failed(llllllllllllIlllllllIIIIIIlIIlII) ? 1 : 0)) {
                final String llllllllllllIlllllllIIIIIIlIIIll = ErrorCode.getString(llllllllllllIlllllllIIIIIIlIIlII);
                final ChatController this$0 = ChatController.this;
                final String format = ChatChannelListener.lIllIllIlIIlIl[ChatChannelListener.lIllIllIlIIlll[2]];
                final Object[] args = new Object[ChatChannelListener.lIllIllIlIIlll[1]];
                args[ChatChannelListener.lIllIllIlIIlll[0]] = llllllllllllIlllllllIIIIIIlIIIll;
                this$0.func_152995_h(String.format(format, args));
                return ChatChannelListener.lIllIllIlIIlll[0] != 0;
            }
            return ChatChannelListener.lIllIllIlIIlll[1] != 0;
        }
        
        protected void func_176039_i() {
            if (llllllllIlIlIIl(this.field_176043_g)) {
                this.field_176043_g = new ChatBadgeData();
                final ErrorCode llllllllllllIlllllllIIIIIIIlIIIl = ChatController.this.field_153008_f.getBadgeData(this.field_176048_a, this.field_176043_g);
                if (llllllllIlIIIll(ErrorCode.succeeded(llllllllllllIlllllllIIIIIIIlIIIl) ? 1 : 0)) {
                    try {
                        if (!llllllllIlIlIII(ChatController.this.field_153003_a)) {
                            return;
                        }
                        ChatController.this.field_153003_a.func_176016_c(this.field_176048_a);
                        "".length();
                        if ((0x3 ^ 0x37 ^ (0x3E ^ 0xE)) <= "   ".length()) {
                            return;
                        }
                        return;
                    }
                    catch (Exception llllllllllllIlllllllIIIIIIIlIIII) {
                        ChatController.this.func_152995_h(llllllllllllIlllllllIIIIIIIlIIII.toString());
                        "".length();
                        if ("  ".length() == 0) {
                            return;
                        }
                        return;
                    }
                }
                ChatController.this.func_152995_h(String.valueOf(new StringBuilder(ChatChannelListener.lIllIllIlIIlIl[ChatChannelListener.lIllIllIlIIlll[4]]).append(ErrorCode.getString(llllllllllllIlllllllIIIIIIIlIIIl))));
            }
        }
        
        private static boolean llllllllIlIlIIl(final Object llllllllllllIllllllIllllIlIlIIll) {
            return llllllllllllIllllllIllllIlIlIIll == null;
        }
        
        private static void llllllllIIllllI() {
            (lIllIllIlIIlIl = new String[ChatChannelListener.lIllIllIlIIlll[6]])[ChatChannelListener.lIllIllIlIIlll[0]] = llllllllIIllIlI("Ez08PTt2LCE8JzMsOjsnMXVudzo=", "VONRI");
            ChatChannelListener.lIllIllIlIIlIl[ChatChannelListener.lIllIllIlIIlll[1]] = llllllllIIllIlI("Kh0GBApPCx0YGwABGg4bGwYaDEJPSgc=", "ootkx");
            ChatChannelListener.lIllIllIlIIlIl[ChatChannelListener.lIllIllIlIIlll[2]] = llllllllIIllIlI("FRY+JChwFyklPjkKK2s5OAU4azc1Fz8qPTVebG4p", "PdLKZ");
            ChatChannelListener.lIllIllIlIIlIl[ChatChannelListener.lIllIllIlIIlll[3]] = llllllllIIllIll("aGQBHY0HytYhlDLkh/fgvtLWIwQF3H8+9kbPxEXm70wexZtplFFG/g==", "KSOtc");
            ChatChannelListener.lIllIllIlIIlIl[ChatChannelListener.lIllIllIlIIlll[4]] = llllllllIIlllIl("/VmuYcI02AV/ue5Btj590uM0pOx9Lp6NQ1ZCZC+e/x4=", "FKvKS");
            ChatChannelListener.lIllIllIlIIlIl[ChatChannelListener.lIllIllIlIIlll[5]] = llllllllIIllIlI("KTcxLQBMNyYuFw02KiwVTCciJhUJZScjBg1/Yw==", "lECBr");
        }
        
        protected void func_176031_c(final String llllllllllllIllllllIllllllllllII) {
            try {
                if (llllllllIlIlIII(ChatController.this.field_153003_a)) {
                    ChatController.this.field_153003_a.func_180606_a(llllllllllllIllllllIllllllllllII);
                    "".length();
                    if ("  ".length() > "  ".length()) {
                        return;
                    }
                }
            }
            catch (Exception llllllllllllIllllllIlllllllllllI) {
                ChatController.this.func_152995_h(llllllllllllIllllllIlllllllllllI.toString());
            }
        }
        
        public void chatChannelTokenizedMessageCallback(final String llllllllllllIllllllIlllllIllIlIl, final ChatTokenizedMessage[] llllllllllllIllllllIlllllIllIlII) {
            int llllllllllllIllllllIlllllIllIIll = ChatChannelListener.lIllIllIlIIlll[0];
            "".length();
            if (((0x58 ^ 0x7) & ~(0x28 ^ 0x77)) != 0x0) {
                return;
            }
            while (!llllllllIlIlIll(llllllllllllIllllllIlllllIllIIll, llllllllllllIllllllIlllllIllIlII.length)) {
                this.field_176042_f.addLast(llllllllllllIllllllIlllllIllIlII[llllllllllllIllllllIlllllIllIIll]);
                ++llllllllllllIllllllIlllllIllIIll;
            }
            while (true) {
                Label_0188: {
                    try {
                        if (!llllllllIlIlIII(ChatController.this.field_153003_a)) {
                            break Label_0188;
                        }
                        ChatController.this.field_153003_a.func_176025_a(this.field_176048_a, llllllllllllIllllllIlllllIllIlII);
                        "".length();
                        if (-" ".length() >= ((0xA ^ 0x35 ^ (0x7C ^ 0x23)) & (199 + 68 - 244 + 181 ^ 28 + 135 - 50 + 59 ^ -" ".length()))) {
                            return;
                        }
                        break Label_0188;
                    }
                    catch (Exception llllllllllllIllllllIlllllIllIIlI) {
                        ChatController.this.func_152995_h(llllllllllllIllllllIlllllIllIIlI.toString());
                        "".length();
                        if ("   ".length() != "   ".length()) {
                            return;
                        }
                        break Label_0188;
                    }
                    this.field_176042_f.removeFirst();
                    "".length();
                }
                if (llllllllIlIllII(this.field_176042_f.size(), ChatController.this.field_153015_m)) {
                    return;
                }
                continue;
            }
        }
        
        private static String llllllllIIllIll(final String llllllllllllIllllllIllllIlllIIII, final String llllllllllllIllllllIllllIllIllll) {
            try {
                final SecretKeySpec llllllllllllIllllllIllllIlllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIllllIllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllllllIllllIlllIIlI = Cipher.getInstance("Blowfish");
                llllllllllllIllllllIllllIlllIIlI.init(ChatChannelListener.lIllIllIlIIlll[2], llllllllllllIllllllIllllIlllIIll);
                return new String(llllllllllllIllllllIllllIlllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIllllIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllllIllllIlllIIIl) {
                llllllllllllIllllllIllllIlllIIIl.printStackTrace();
                return null;
            }
        }
        
        protected void func_176035_a(final EnumChannelState llllllllllllIlllllllIIIIIIlllIlI) {
            if (llllllllIlIIlII(llllllllllllIlllllllIIIIIIlllIlI, this.field_176047_c)) {
                this.field_176047_c = llllllllllllIlllllllIIIIIIlllIlI;
            }
        }
        
        private static String llllllllIIlllIl(final String llllllllllllIllllllIllllIllllIll, final String llllllllllllIllllllIllllIlllllII) {
            try {
                final SecretKeySpec llllllllllllIllllllIlllllIIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIllllIlllllII.getBytes(StandardCharsets.UTF_8)), ChatChannelListener.lIllIllIlIIlll[7]), "DES");
                final Cipher llllllllllllIllllllIllllIlllllll = Cipher.getInstance("DES");
                llllllllllllIllllllIllllIlllllll.init(ChatChannelListener.lIllIllIlIIlll[2], llllllllllllIllllllIlllllIIIIIII);
                return new String(llllllllllllIllllllIllllIlllllll.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIllllIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllllIllllIllllllI) {
                llllllllllllIllllllIllllIllllllI.printStackTrace();
                return null;
            }
        }
        
        protected void func_176033_j() {
            if (llllllllIlIlIII(this.field_176043_g)) {
                final ErrorCode llllllllllllIlllllllIIIIIIIIlIII = ChatController.this.field_153008_f.clearBadgeData(this.field_176048_a);
                if (llllllllIlIIIll(ErrorCode.succeeded(llllllllllllIlllllllIIIIIIIIlIII) ? 1 : 0)) {
                    this.field_176043_g = null;
                    try {
                        if (!llllllllIlIlIII(ChatController.this.field_153003_a)) {
                            return;
                        }
                        ChatController.this.field_153003_a.func_176020_d(this.field_176048_a);
                        "".length();
                        if (-" ".length() >= 0) {
                            return;
                        }
                        return;
                    }
                    catch (Exception llllllllllllIlllllllIIIIIIIIIlll) {
                        ChatController.this.func_152995_h(llllllllllllIlllllllIIIIIIIIIlll.toString());
                        "".length();
                        if ("   ".length() < -" ".length()) {
                            return;
                        }
                        return;
                    }
                }
                ChatController.this.func_152995_h(String.valueOf(new StringBuilder(ChatChannelListener.lIllIllIlIIlIl[ChatChannelListener.lIllIllIlIIlll[5]]).append(ErrorCode.getString(llllllllllllIlllllllIIIIIIIIlIII))));
            }
        }
        
        public void func_176032_a(final String llllllllllllIlllllllIIIIIIllIlII) {
            if (llllllllIlIIlIl(ChatController.this.field_175995_l, EnumEmoticonMode.None)) {
                this.field_176045_e.clear();
                this.field_176042_f.clear();
                "".length();
                if ("   ".length() < "  ".length()) {
                    return;
                }
            }
            else {
                if (llllllllIlIIllI(this.field_176045_e.size())) {
                    final ListIterator<ChatRawMessage> llllllllllllIlllllllIIIIIIllIIll = this.field_176045_e.listIterator();
                    "".length();
                    if (null != null) {
                        return;
                    }
                    while (!llllllllIlIIlll(llllllllllllIlllllllIIIIIIllIIll.hasNext() ? 1 : 0)) {
                        final ChatRawMessage llllllllllllIlllllllIIIIIIllIIlI = llllllllllllIlllllllIIIIIIllIIll.next();
                        if (llllllllIlIIIll(llllllllllllIlllllllIIIIIIllIIlI.userName.equals(llllllllllllIlllllllIIIIIIllIlII) ? 1 : 0)) {
                            llllllllllllIlllllllIIIIIIllIIll.remove();
                        }
                    }
                }
                if (llllllllIlIIllI(this.field_176042_f.size())) {
                    final ListIterator<ChatTokenizedMessage> llllllllllllIlllllllIIIIIIllIIIl = this.field_176042_f.listIterator();
                    "".length();
                    if (" ".length() <= 0) {
                        return;
                    }
                    while (!llllllllIlIIlll(llllllllllllIlllllllIIIIIIllIIIl.hasNext() ? 1 : 0)) {
                        final ChatTokenizedMessage llllllllllllIlllllllIIIIIIllIIII = llllllllllllIlllllllIIIIIIllIIIl.next();
                        if (llllllllIlIIIll(llllllllllllIlllllllIIIIIIllIIII.displayName.equals(llllllllllllIlllllllIIIIIIllIlII) ? 1 : 0)) {
                            llllllllllllIlllllllIIIIIIllIIIl.remove();
                        }
                    }
                }
            }
            try {
                if (llllllllIlIlIII(ChatController.this.field_153003_a)) {
                    ChatController.this.field_153003_a.func_176019_a(this.field_176048_a, llllllllllllIlllllllIIIIIIllIlII);
                    "".length();
                    if (((0xE2 ^ 0x88 ^ (0x21 ^ 0x7E)) & (97 + 69 - 20 + 43 ^ 0 + 100 + 17 + 19 ^ -" ".length())) < ((218 + 76 - 82 + 27 ^ 59 + 129 - 119 + 125) & (50 + 99 - 58 + 75 ^ 113 + 92 - 114 + 48 ^ -" ".length()))) {
                        return;
                    }
                }
            }
            catch (Exception llllllllllllIlllllllIIIIIIlIllll) {
                ChatController.this.func_152995_h(llllllllllllIlllllllIIIIIIlIllll.toString());
            }
        }
        
        private static boolean llllllllIlIlIll(final int llllllllllllIllllllIllllIllIlIII, final int llllllllllllIllllllIllllIllIIlll) {
            return llllllllllllIllllllIllllIllIlIII >= llllllllllllIllllllIllllIllIIlll;
        }
        
        private static boolean llllllllIlIIllI(final int llllllllllllIllllllIllllIlIIlIll) {
            return llllllllllllIllllllIllllIlIIlIll > 0;
        }
        
        protected void func_176036_d(final String llllllllllllIllllllIllllllllIIll) {
            try {
                if (llllllllIlIlIII(ChatController.this.field_153003_a)) {
                    ChatController.this.field_153003_a.func_180607_b(llllllllllllIllllllIllllllllIIll);
                    "".length();
                    if (((0x7C ^ 0x3D ^ (0x18 ^ 0x79)) & (0x9E ^ 0x8D ^ (0xB0 ^ 0x83) ^ -" ".length())) >= " ".length()) {
                        return;
                    }
                }
            }
            catch (Exception llllllllllllIllllllIllllllllIlIl) {
                ChatController.this.func_152995_h(llllllllllllIllllllIllllllllIlIl.toString());
            }
        }
        
        public void chatBadgeDataDownloadCallback(final String llllllllllllIllllllIlllllIlIIlII, final ErrorCode llllllllllllIllllllIlllllIlIIIll) {
            if (llllllllIlIIIll(ErrorCode.succeeded(llllllllllllIllllllIlllllIlIIIll) ? 1 : 0)) {
                this.func_176039_i();
            }
        }
        
        public void chatChannelMembershipCallback(final String llllllllllllIllllllIllllllIlllIl, final ChatEvent llllllllllllIllllllIllllllIlllII, final ChatChannelInfo llllllllllllIllllllIllllllIlllll) {
            switch ($SWITCH_TABLE$tv$twitch$chat$ChatEvent()[llllllllllllIllllllIllllllIlllII.ordinal()]) {
                case 1: {
                    this.func_176035_a(EnumChannelState.Connected);
                    this.func_176031_c(llllllllllllIllllllIllllllIlllIl);
                    "".length();
                    if ("   ".length() < " ".length()) {
                        return;
                    }
                    break;
                }
                case 2: {
                    this.func_176030_k();
                    break;
                }
            }
        }
        
        static {
            llllllllIlIIIlI();
            llllllllIIllllI();
        }
        
        private static boolean llllllllIlIIlIl(final Object llllllllllllIllllllIllllIlIllIII, final Object llllllllllllIllllllIllllIlIlIlll) {
            return llllllllllllIllllllIllllIlIllIII == llllllllllllIllllllIllllIlIlIlll;
        }
        
        private static boolean llllllllIlIIIll(final int llllllllllllIllllllIllllIlIlIIIl) {
            return llllllllllllIllllllIllllIlIlIIIl != 0;
        }
        
        private static void llllllllIlIIIlI() {
            (lIllIllIlIIlll = new int[8])[0] = ((0x25 ^ 0x1A) & ~(0xBF ^ 0x80));
            ChatChannelListener.lIllIllIlIIlll[1] = " ".length();
            ChatChannelListener.lIllIllIlIIlll[2] = "  ".length();
            ChatChannelListener.lIllIllIlIIlll[3] = "   ".length();
            ChatChannelListener.lIllIllIlIIlll[4] = (134 + 35 - 34 + 11 ^ 82 + 52 - 24 + 40);
            ChatChannelListener.lIllIllIlIIlll[5] = (0xBF ^ 0xBA);
            ChatChannelListener.lIllIllIlIIlll[6] = (0x1B ^ 0x1D);
            ChatChannelListener.lIllIllIlIIlll[7] = (0xE4 ^ 0xB3 ^ (0x9A ^ 0xC5));
        }
        
        private static boolean llllllllIlIllII(final int llllllllllllIllllllIllllIllIIIII, final int llllllllllllIllllllIllllIlIlllll) {
            return llllllllllllIllllllIllllIllIIIII <= llllllllllllIllllllIllllIlIlllll;
        }
        
        private static boolean llllllllIlIllIl(final int llllllllllllIllllllIllllIllIIlII, final int llllllllllllIllllllIllllIllIIIll) {
            return llllllllllllIllllllIllllIllIIlII < llllllllllllIllllllIllllIllIIIll;
        }
        
        private static String llllllllIIllIlI(String llllllllllllIllllllIlllllIIlIIlI, final String llllllllllllIllllllIlllllIIIllII) {
            llllllllllllIllllllIlllllIIlIIlI = new String(Base64.getDecoder().decode(llllllllllllIllllllIlllllIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllllllIlllllIIlIIII = new StringBuilder();
            final char[] llllllllllllIllllllIlllllIIIllll = llllllllllllIllllllIlllllIIIllII.toCharArray();
            int llllllllllllIllllllIlllllIIIlllI = ChatChannelListener.lIllIllIlIIlll[0];
            final String llllllllllllIllllllIlllllIIIlIII = (Object)llllllllllllIllllllIlllllIIlIIlI.toCharArray();
            final int llllllllllllIllllllIlllllIIIIlll = llllllllllllIllllllIlllllIIIlIII.length;
            byte llllllllllllIllllllIlllllIIIIllI = (byte)ChatChannelListener.lIllIllIlIIlll[0];
            while (llllllllIlIllIl(llllllllllllIllllllIlllllIIIIllI, llllllllllllIllllllIlllllIIIIlll)) {
                final char llllllllllllIllllllIlllllIIlIIll = llllllllllllIllllllIlllllIIIlIII[llllllllllllIllllllIlllllIIIIllI];
                llllllllllllIllllllIlllllIIlIIII.append((char)(llllllllllllIllllllIlllllIIlIIll ^ llllllllllllIllllllIlllllIIIllll[llllllllllllIllllllIlllllIIIlllI % llllllllllllIllllllIlllllIIIllll.length]));
                "".length();
                ++llllllllllllIllllllIlllllIIIlllI;
                ++llllllllllllIllllllIlllllIIIIllI;
                "".length();
                if ("   ".length() == ((0xF7 ^ 0x9E ^ (0x66 ^ 0x3A)) & (0x4A ^ 0x43 ^ (0x8F ^ 0xB3) ^ -" ".length()))) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllllllIlllllIIlIIII);
        }
        
        public boolean func_176034_g() {
            switch ($SWITCH_TABLE$net$minecraft$client$stream$ChatController$EnumChannelState()[this.field_176047_c.ordinal()]) {
                case 2:
                case 3: {
                    final ErrorCode llllllllllllIlllllllIIIIIlIIIlII = ChatController.this.field_153008_f.disconnect(this.field_176048_a);
                    if (llllllllIlIIIll(ErrorCode.failed(llllllllllllIlllllllIIIIIlIIIlII) ? 1 : 0)) {
                        final String llllllllllllIlllllllIIIIIlIIIIll = ErrorCode.getString(llllllllllllIlllllllIIIIIlIIIlII);
                        final ChatController this$0 = ChatController.this;
                        final String format = ChatChannelListener.lIllIllIlIIlIl[ChatChannelListener.lIllIllIlIIlll[1]];
                        final Object[] args = new Object[ChatChannelListener.lIllIllIlIIlll[1]];
                        args[ChatChannelListener.lIllIllIlIIlll[0]] = llllllllllllIlllllllIIIIIlIIIIll;
                        this$0.func_152995_h(String.format(format, args));
                        return ChatChannelListener.lIllIllIlIIlll[0] != 0;
                    }
                    this.func_176035_a(EnumChannelState.Disconnecting);
                    return ChatChannelListener.lIllIllIlIIlll[1] != 0;
                }
                default: {
                    return ChatChannelListener.lIllIllIlIIlll[0] != 0;
                }
            }
        }
        
        public EnumChannelState func_176040_a() {
            return this.field_176047_c;
        }
        
        public void chatChannelUserChangeCallback(final String llllllllllllIllllllIllllllIlIlII, final ChatUserInfo[] llllllllllllIllllllIllllllIIlIIl, final ChatUserInfo[] llllllllllllIllllllIllllllIIlIII, final ChatUserInfo[] llllllllllllIllllllIllllllIIIlll) {
            int llllllllllllIllllllIllllllIlIIII = ChatChannelListener.lIllIllIlIIlll[0];
            "".length();
            if (" ".length() < 0) {
                return;
            }
            while (!llllllllIlIlIll(llllllllllllIllllllIllllllIlIIII, llllllllllllIllllllIllllllIIlIII.length)) {
                final int llllllllllllIllllllIllllllIIllll = this.field_176044_d.indexOf(llllllllllllIllllllIllllllIIlIII[llllllllllllIllllllIllllllIlIIII]);
                if (llllllllIlIlIlI(llllllllllllIllllllIllllllIIllll)) {
                    this.field_176044_d.remove(llllllllllllIllllllIllllllIIllll);
                    "".length();
                }
                ++llllllllllllIllllllIllllllIlIIII;
            }
            int llllllllllllIllllllIllllllIIlllI = ChatChannelListener.lIllIllIlIIlll[0];
            "".length();
            if (((85 + 127 - 168 + 128 ^ 62 + 46 - 94 + 150) & (0xEB ^ 0xC2 ^ (0xAD ^ 0x8C) ^ -" ".length())) < 0) {
                return;
            }
            while (!llllllllIlIlIll(llllllllllllIllllllIllllllIIlllI, llllllllllllIllllllIllllllIIIlll.length)) {
                final int llllllllllllIllllllIllllllIIllIl = this.field_176044_d.indexOf(llllllllllllIllllllIllllllIIIlll[llllllllllllIllllllIllllllIIlllI]);
                if (llllllllIlIlIlI(llllllllllllIllllllIllllllIIllIl)) {
                    this.field_176044_d.remove(llllllllllllIllllllIllllllIIllIl);
                    "".length();
                }
                this.field_176044_d.add(llllllllllllIllllllIllllllIIIlll[llllllllllllIllllllIllllllIIlllI]);
                "".length();
                ++llllllllllllIllllllIllllllIIlllI;
            }
            int llllllllllllIllllllIllllllIIllII = ChatChannelListener.lIllIllIlIIlll[0];
            "".length();
            if (null != null) {
                return;
            }
            while (!llllllllIlIlIll(llllllllllllIllllllIllllllIIllII, llllllllllllIllllllIllllllIIlIIl.length)) {
                this.field_176044_d.add(llllllllllllIllllllIllllllIIlIIl[llllllllllllIllllllIllllllIIllII]);
                "".length();
                ++llllllllllllIllllllIllllllIIllII;
            }
            try {
                if (llllllllIlIlIII(ChatController.this.field_153003_a)) {
                    ChatController.this.field_153003_a.func_176018_a(this.field_176048_a, llllllllllllIllllllIllllllIIlIIl, llllllllllllIllllllIllllllIIlIII, llllllllllllIllllllIllllllIIIlll);
                    "".length();
                    if ((("  ".length() ^ (0x91 ^ 0x8F)) & (0x0 ^ 0x4 ^ (0x62 ^ 0x7A) ^ -" ".length())) > 0) {
                        return;
                    }
                }
            }
            catch (Exception llllllllllllIllllllIllllllIIlIll) {
                ChatController.this.func_152995_h(llllllllllllIllllllIllllllIIlIll.toString());
            }
        }
        
        public void chatChannelRawMessageCallback(final String llllllllllllIllllllIllllllIIIIII, final ChatRawMessage[] llllllllllllIllllllIlllllIllllll) {
            int llllllllllllIllllllIlllllIlllllI = ChatChannelListener.lIllIllIlIIlll[0];
            "".length();
            if (((0xA2 ^ 0xC2) & ~(0xFD ^ 0x9D)) != 0x0) {
                return;
            }
            while (!llllllllIlIlIll(llllllllllllIllllllIlllllIlllllI, llllllllllllIllllllIlllllIllllll.length)) {
                this.field_176045_e.addLast(llllllllllllIllllllIlllllIllllll[llllllllllllIllllllIlllllIlllllI]);
                ++llllllllllllIllllllIlllllIlllllI;
            }
            while (true) {
                Label_0174: {
                    try {
                        if (!llllllllIlIlIII(ChatController.this.field_153003_a)) {
                            break Label_0174;
                        }
                        ChatController.this.field_153003_a.func_180605_a(this.field_176048_a, llllllllllllIllllllIlllllIllllll);
                        "".length();
                        if (((0x34 ^ 0x3A ^ (0x27 ^ 0x1B)) & (0xA5 ^ 0x88 ^ (0xBF ^ 0xA0) ^ -" ".length())) > 0) {
                            return;
                        }
                        break Label_0174;
                    }
                    catch (Exception llllllllllllIllllllIlllllIllllIl) {
                        ChatController.this.func_152995_h(llllllllllllIllllllIlllllIllllIl.toString());
                        "".length();
                        if ("  ".length() > "   ".length()) {
                            return;
                        }
                        break Label_0174;
                    }
                    this.field_176045_e.removeFirst();
                    "".length();
                }
                if (llllllllIlIllII(this.field_176045_e.size(), ChatController.this.field_153015_m)) {
                    return;
                }
                continue;
            }
        }
        
        public boolean func_176038_a(final boolean llllllllllllIlllllllIIIIIlIIllll) {
            this.field_176046_b = llllllllllllIlllllllIIIIIlIIllll;
            ErrorCode llllllllllllIlllllllIIIIIlIIlllI = ErrorCode.TTV_EC_SUCCESS;
            if (llllllllIlIIIll(llllllllllllIlllllllIIIIIlIIllll ? 1 : 0)) {
                llllllllllllIlllllllIIIIIlIIlllI = ChatController.this.field_153008_f.connectAnonymous(this.field_176048_a, (IChatChannelListener)this);
                "".length();
                if (-" ".length() > 0) {
                    return ((0xF7 ^ 0xBE ^ (0x50 ^ 0x2D)) & (0x6E ^ 0x6A ^ (0x75 ^ 0x45) ^ -" ".length())) != 0x0;
                }
            }
            else {
                llllllllllllIlllllllIIIIIlIIlllI = ChatController.this.field_153008_f.connect(this.field_176048_a, ChatController.this.field_153004_b, ChatController.this.field_153012_j.data, (IChatChannelListener)this);
            }
            if (llllllllIlIIIll(ErrorCode.failed(llllllllllllIlllllllIIIIIlIIlllI) ? 1 : 0)) {
                final String llllllllllllIlllllllIIIIIlIIllIl = ErrorCode.getString(llllllllllllIlllllllIIIIIlIIlllI);
                final ChatController this$0 = ChatController.this;
                final String format = ChatChannelListener.lIllIllIlIIlIl[ChatChannelListener.lIllIllIlIIlll[0]];
                final Object[] args = new Object[ChatChannelListener.lIllIllIlIIlll[1]];
                args[ChatChannelListener.lIllIllIlIIlll[0]] = llllllllllllIlllllllIIIIIlIIllIl;
                this$0.func_152995_h(String.format(format, args));
                this.func_176036_d(this.field_176048_a);
                return ChatChannelListener.lIllIllIlIIlll[0] != 0;
            }
            this.func_176035_a(EnumChannelState.Connecting);
            this.func_176041_h();
            return ChatChannelListener.lIllIllIlIIlll[1] != 0;
        }
        
        public void chatStatusCallback(final String llllllllllllIllllllIlllllllIlIlI, final ErrorCode llllllllllllIllllllIlllllllIlIIl) {
            if (llllllllIlIIlll(ErrorCode.succeeded(llllllllllllIllllllIlllllllIlIIl) ? 1 : 0)) {
                ChatController.this.field_175998_i.remove(llllllllllllIllllllIlllllllIlIlI);
                "".length();
                this.func_176030_k();
            }
        }
        
        public void chatClearCallback(final String llllllllllllIllllllIlllllIlIlIll, final String llllllllllllIllllllIlllllIlIlIlI) {
            this.func_176032_a(llllllllllllIllllllIlllllIlIlIlI);
        }
        
        static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$client$stream$ChatController$EnumChannelState() {
            final int[] $switch_TABLE$net$minecraft$client$stream$ChatController$EnumChannelState = ChatChannelListener.$SWITCH_TABLE$net$minecraft$client$stream$ChatController$EnumChannelState;
            if (llllllllIlIlIII($switch_TABLE$net$minecraft$client$stream$ChatController$EnumChannelState)) {
                return $switch_TABLE$net$minecraft$client$stream$ChatController$EnumChannelState;
            }
            "".length();
            final double llllllllllllIllllllIlllllIIlllll = (Object)new int[EnumChannelState.values().length];
            try {
                llllllllllllIllllllIlllllIIlllll[EnumChannelState.Connected.ordinal()] = ChatChannelListener.lIllIllIlIIlll[3];
                "".length();
                if ("   ".length() > "   ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError) {
                "".length();
            }
            try {
                llllllllllllIllllllIlllllIIlllll[EnumChannelState.Connecting.ordinal()] = ChatChannelListener.lIllIllIlIIlll[2];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                "".length();
            }
            try {
                llllllllllllIllllllIlllllIIlllll[EnumChannelState.Created.ordinal()] = ChatChannelListener.lIllIllIlIIlll[1];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError3) {
                "".length();
            }
            try {
                llllllllllllIllllllIlllllIIlllll[EnumChannelState.Disconnected.ordinal()] = ChatChannelListener.lIllIllIlIIlll[5];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError4) {
                "".length();
            }
            try {
                llllllllllllIllllllIlllllIIlllll[EnumChannelState.Disconnecting.ordinal()] = ChatChannelListener.lIllIllIlIIlll[4];
                "".length();
                if ((0xBB ^ 0xBF) < -" ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError5) {
                "".length();
            }
            return ChatChannelListener.$SWITCH_TABLE$net$minecraft$client$stream$ChatController$EnumChannelState = (int[])(Object)llllllllllllIllllllIlllllIIlllll;
        }
        
        protected void func_176041_h() {
            if (llllllllIlIIlII(ChatController.this.field_175995_l, EnumEmoticonMode.None) && llllllllIlIlIIl(this.field_176043_g)) {
                final ErrorCode llllllllllllIlllllllIIIIIIIllIlI = ChatController.this.field_153008_f.downloadBadgeData(this.field_176048_a);
                if (llllllllIlIIIll(ErrorCode.failed(llllllllllllIlllllllIIIIIIIllIlI) ? 1 : 0)) {
                    final String llllllllllllIlllllllIIIIIIIllIIl = ErrorCode.getString(llllllllllllIlllllllIIIIIIIllIlI);
                    final ChatController this$0 = ChatController.this;
                    final String format = ChatChannelListener.lIllIllIlIIlIl[ChatChannelListener.lIllIllIlIIlll[3]];
                    final Object[] args = new Object[ChatChannelListener.lIllIllIlIIlll[1]];
                    args[ChatChannelListener.lIllIllIlIIlll[0]] = llllllllllllIlllllllIIIIIIIllIIl;
                    this$0.func_152995_h(String.format(format, args));
                }
            }
        }
        
        private static boolean llllllllIlIIlII(final Object llllllllllllIllllllIllllIlIlllII, final Object llllllllllllIllllllIllllIlIllIll) {
            return llllllllllllIllllllIllllIlIlllII != llllllllllllIllllllIllllIlIllIll;
        }
        
        public ChatChannelListener(final String llllllllllllIlllllllIIIIIlIllIII) {
            this.field_176048_a = null;
            this.field_176046_b = (ChatChannelListener.lIllIllIlIIlll[0] != 0);
            this.field_176047_c = EnumChannelState.Created;
            this.field_176044_d = (List<ChatUserInfo>)Lists.newArrayList();
            this.field_176045_e = new LinkedList<ChatRawMessage>();
            this.field_176042_f = new LinkedList<ChatTokenizedMessage>();
            this.field_176043_g = null;
            this.field_176048_a = llllllllllllIlllllllIIIIIlIllIII;
        }
        
        private void func_176030_k() {
            if (llllllllIlIIlII(this.field_176047_c, EnumChannelState.Disconnected)) {
                this.func_176035_a(EnumChannelState.Disconnected);
                this.func_176036_d(this.field_176048_a);
                this.func_176033_j();
            }
        }
        
        static /* synthetic */ int[] $SWITCH_TABLE$tv$twitch$chat$ChatEvent() {
            final int[] $switch_TABLE$tv$twitch$chat$ChatEvent = ChatChannelListener.$SWITCH_TABLE$tv$twitch$chat$ChatEvent;
            if (llllllllIlIlIII($switch_TABLE$tv$twitch$chat$ChatEvent)) {
                return $switch_TABLE$tv$twitch$chat$ChatEvent;
            }
            "".length();
            final short llllllllllllIllllllIlllllIIlllIl = (Object)new int[ChatEvent.values().length];
            try {
                llllllllllllIllllllIlllllIIlllIl[ChatEvent.TTV_CHAT_JOINED_CHANNEL.ordinal()] = ChatChannelListener.lIllIllIlIIlll[1];
                "".length();
                if ("  ".length() <= ((0x95 ^ 0xB7 ^ (0xEE ^ 0xC1)) & (179 + 130 - 247 + 139 ^ 166 + 121 - 115 + 24 ^ -" ".length()))) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError) {
                "".length();
            }
            try {
                llllllllllllIllllllIlllllIIlllIl[ChatEvent.TTV_CHAT_LEFT_CHANNEL.ordinal()] = ChatChannelListener.lIllIllIlIIlll[2];
                "".length();
                if ((0x27 ^ 0x5E ^ (0xD1 ^ 0xAC)) <= 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                "".length();
            }
            return ChatChannelListener.$SWITCH_TABLE$tv$twitch$chat$ChatEvent = (int[])(Object)llllllllllllIllllllIlllllIIlllIl;
        }
    }
    
    public enum EnumChannelState
    {
        Created(EnumChannelState.lIlIIIIIIIllll[EnumChannelState.lIlIIIIIIlIlIl[0]], EnumChannelState.lIlIIIIIIlIlIl[0]), 
        Connecting(EnumChannelState.lIlIIIIIIIllll[EnumChannelState.lIlIIIIIIlIlIl[1]], EnumChannelState.lIlIIIIIIlIlIl[1]), 
        Disconnected(EnumChannelState.lIlIIIIIIIllll[EnumChannelState.lIlIIIIIIlIlIl[4]], EnumChannelState.lIlIIIIIIlIlIl[4]);
        
        private static final /* synthetic */ int[] lIlIIIIIIlIlIl;
        private static final /* synthetic */ String[] lIlIIIIIIIllll;
        
        Connected(EnumChannelState.lIlIIIIIIIllll[EnumChannelState.lIlIIIIIIlIlIl[2]], EnumChannelState.lIlIIIIIIlIlIl[2]), 
        Disconnecting(EnumChannelState.lIlIIIIIIIllll[EnumChannelState.lIlIIIIIIlIlIl[3]], EnumChannelState.lIlIIIIIIlIlIl[3]);
        
        private static void lllIIIIIIIIlIIl() {
            (lIlIIIIIIlIlIl = new int[7])[0] = ((0xF8 ^ 0xC4) & ~(0x62 ^ 0x5E));
            EnumChannelState.lIlIIIIIIlIlIl[1] = " ".length();
            EnumChannelState.lIlIIIIIIlIlIl[2] = "  ".length();
            EnumChannelState.lIlIIIIIIlIlIl[3] = "   ".length();
            EnumChannelState.lIlIIIIIIlIlIl[4] = (0x69 ^ 0x19 ^ (0xD1 ^ 0xA5));
            EnumChannelState.lIlIIIIIIlIlIl[5] = (0x63 ^ 0x6C ^ (0x89 ^ 0x83));
            EnumChannelState.lIlIIIIIIlIlIl[6] = (0x19 ^ 0x11);
        }
        
        private static void lllIIIIIIIIlIII() {
            (lIlIIIIIIIllll = new String[EnumChannelState.lIlIIIIIIlIlIl[5]])[EnumChannelState.lIlIIIIIIlIlIl[0]] = lllIIIIIIIIIIIl("oG+OG+jvRAQ=", "vdMnj");
            EnumChannelState.lIlIIIIIIIllll[EnumChannelState.lIlIIIIIIlIlIl[1]] = lllIIIIIIIIIIIl("/xUd5IEZU+XdTRgd8QMZ+A==", "vKaNq");
            EnumChannelState.lIlIIIIIIIllll[EnumChannelState.lIlIIIIIIlIlIl[2]] = lllIIIIIIIIIlII("bub2TkTsxCVYYpwy6UAsww==", "llrzN");
            EnumChannelState.lIlIIIIIIIllll[EnumChannelState.lIlIIIIIIlIlIl[3]] = lllIIIIIIIIIIIl("xTRS+m7OYjPw/WAelXo8kQ==", "AfJnB");
            EnumChannelState.lIlIIIIIIIllll[EnumChannelState.lIlIIIIIIlIlIl[4]] = lllIIIIIIIIIIIl("9uAKV8job/matv+7cpqbCg==", "iPSxN");
        }
        
        static {
            lllIIIIIIIIlIIl();
            lllIIIIIIIIlIII();
            final EnumChannelState[] enum$VALUES = new EnumChannelState[EnumChannelState.lIlIIIIIIlIlIl[5]];
            enum$VALUES[EnumChannelState.lIlIIIIIIlIlIl[0]] = EnumChannelState.Created;
            enum$VALUES[EnumChannelState.lIlIIIIIIlIlIl[1]] = EnumChannelState.Connecting;
            enum$VALUES[EnumChannelState.lIlIIIIIIlIlIl[2]] = EnumChannelState.Connected;
            enum$VALUES[EnumChannelState.lIlIIIIIIlIlIl[3]] = EnumChannelState.Disconnecting;
            enum$VALUES[EnumChannelState.lIlIIIIIIlIlIl[4]] = EnumChannelState.Disconnected;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static String lllIIIIIIIIIlII(final String lllllllllllllIIlIIIlIIlllIIllIlI, final String lllllllllllllIIlIIIlIIlllIIllIIl) {
            try {
                final SecretKeySpec lllllllllllllIIlIIIlIIlllIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIlIIlllIIllIIl.getBytes(StandardCharsets.UTF_8)), EnumChannelState.lIlIIIIIIlIlIl[6]), "DES");
                final Cipher lllllllllllllIIlIIIlIIlllIIlllII = Cipher.getInstance("DES");
                lllllllllllllIIlIIIlIIlllIIlllII.init(EnumChannelState.lIlIIIIIIlIlIl[2], lllllllllllllIIlIIIlIIlllIIlllIl);
                return new String(lllllllllllllIIlIIIlIIlllIIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIlIIlllIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIIIlIIlllIIllIll) {
                lllllllllllllIIlIIIlIIlllIIllIll.printStackTrace();
                return null;
            }
        }
        
        private static String lllIIIIIIIIIIIl(final String lllllllllllllIIlIIIlIIlllIIIlIll, final String lllllllllllllIIlIIIlIIlllIIIlIlI) {
            try {
                final SecretKeySpec lllllllllllllIIlIIIlIIlllIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIlIIlllIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlIIIlIIlllIIIllll = Cipher.getInstance("Blowfish");
                lllllllllllllIIlIIIlIIlllIIIllll.init(EnumChannelState.lIlIIIIIIlIlIl[2], lllllllllllllIIlIIIlIIlllIIlIIII);
                return new String(lllllllllllllIIlIIIlIIlllIIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIlIIlllIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIIIlIIlllIIIlllI) {
                lllllllllllllIIlIIIlIIlllIIIlllI.printStackTrace();
                return null;
            }
        }
        
        private EnumChannelState(final String lllllllllllllIIlIIIlIIlllIlIlIll, final int lllllllllllllIIlIIIlIIlllIlIlIlI) {
        }
    }
}
