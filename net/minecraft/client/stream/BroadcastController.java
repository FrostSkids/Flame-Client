// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.stream;

import tv.twitch.broadcast.StartFlags;
import org.apache.logging.log4j.Marker;
import tv.twitch.broadcast.StreamAPI;
import tv.twitch.broadcast.DesktopStreamAPI;
import tv.twitch.CoreAPI;
import tv.twitch.StandardCoreAPI;
import tv.twitch.broadcast.StatType;
import tv.twitch.broadcast.GameInfo;
import tv.twitch.broadcast.GameInfoList;
import com.google.common.collect.Lists;
import tv.twitch.broadcast.EncodingCpuUsage;
import tv.twitch.broadcast.PixelFormat;
import org.apache.logging.log4j.LogManager;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import net.minecraft.crash.CrashReport;
import tv.twitch.broadcast.AudioDeviceType;
import tv.twitch.MessageLevel;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import tv.twitch.broadcast.StreamInfoForSetting;
import net.minecraft.util.ThreadSafeBoundList;
import tv.twitch.broadcast.Stream;
import tv.twitch.broadcast.ChannelInfo;
import tv.twitch.AuthToken;
import tv.twitch.Core;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.VideoParams;
import tv.twitch.broadcast.IStatCallbacks;
import tv.twitch.broadcast.ArchivingState;
import tv.twitch.broadcast.UserInfo;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.AudioParams;
import tv.twitch.broadcast.StreamInfo;
import org.apache.logging.log4j.Logger;
import tv.twitch.broadcast.FrameBuffer;
import java.util.List;
import tv.twitch.broadcast.IngestList;

public class BroadcastController
{
    private static final /* synthetic */ int[] lllIIIIIIIIIlI;
    protected /* synthetic */ long field_152890_z;
    protected /* synthetic */ BroadcastState broadcastState;
    protected /* synthetic */ boolean field_152876_l;
    protected /* synthetic */ IngestList ingestList;
    protected /* synthetic */ List<FrameBuffer> field_152874_j;
    protected /* synthetic */ boolean field_152877_m;
    private static final /* synthetic */ Logger logger;
    protected /* synthetic */ StreamInfo streamInfo;
    protected /* synthetic */ String field_152880_p;
    protected /* synthetic */ AudioParams audioParamaters;
    protected /* synthetic */ IngestServer field_152884_t;
    protected /* synthetic */ BroadcastListener broadcastListener;
    private /* synthetic */ String field_152863_D;
    protected /* synthetic */ String field_152868_d;
    protected /* synthetic */ boolean field_152878_n;
    private /* synthetic */ ErrorCode errorCode;
    protected /* synthetic */ UserInfo userInfo;
    protected /* synthetic */ ArchivingState field_152889_y;
    protected /* synthetic */ IStatCallbacks field_177949_C;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$client$stream$BroadcastController$BroadcastState;
    protected /* synthetic */ boolean field_152871_g;
    protected /* synthetic */ VideoParams videoParamaters;
    protected /* synthetic */ IStreamCallbacks field_177948_B;
    private static final /* synthetic */ String[] llIlllllllllll;
    protected /* synthetic */ String field_152869_e;
    protected /* synthetic */ String field_152870_f;
    protected /* synthetic */ IngestServerTester field_152860_A;
    protected /* synthetic */ List<FrameBuffer> field_152875_k;
    protected /* synthetic */ Core field_152872_h;
    protected /* synthetic */ AuthToken authenticationToken;
    protected /* synthetic */ ChannelInfo channelInfo;
    protected /* synthetic */ Stream field_152873_i;
    private static final /* synthetic */ ThreadSafeBoundList<String> field_152862_C;
    
    public ErrorCode getErrorCode() {
        return this.errorCode;
    }
    
    public boolean isBroadcastPaused() {
        if (lIIllIllllIIllll(this.broadcastState, BroadcastState.Paused)) {
            return BroadcastController.lllIIIIIIIIIlI[2] != 0;
        }
        return BroadcastController.lllIIIIIIIIIlI[1] != 0;
    }
    
    public boolean func_152828_a(String llllllllllllIllIIIlIIlIlIIlllIIl, String llllllllllllIllIIIlIIlIlIIlllIII, String llllllllllllIllIIIlIIlIlIIllIlll) {
        if (lIIllIllllIlIIlI(this.field_152877_m ? 1 : 0)) {
            return BroadcastController.lllIIIIIIIIIlI[1] != 0;
        }
        if (!lIIllIllllIlIIll(llllllllllllIllIIIlIIlIlIIlllIIl) || lIIllIllllIlIIIl(llllllllllllIllIIIlIIlIlIIlllIIl.equals(BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[9]]) ? 1 : 0)) {
            llllllllllllIllIIIlIIlIlIIlllIIl = this.field_152880_p;
        }
        if (lIIllIllllIlIIII(llllllllllllIllIIIlIIlIlIIlllIII)) {
            llllllllllllIllIIIlIIlIlIIlllIII = BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[10]];
        }
        if (lIIllIllllIlIIII(llllllllllllIllIIIlIIlIlIIllIlll)) {
            llllllllllllIllIIIlIIlIlIIllIlll = BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[11]];
        }
        final StreamInfoForSetting llllllllllllIllIIIlIIlIlIIllllII = new StreamInfoForSetting();
        llllllllllllIllIIIlIIlIlIIllllII.streamTitle = llllllllllllIllIIIlIIlIlIIllIlll;
        llllllllllllIllIIIlIIlIlIIllllII.gameName = llllllllllllIllIIIlIIlIlIIlllIII;
        final ErrorCode llllllllllllIllIIIlIIlIlIIlllIll = this.field_152873_i.setStreamInfo(this.authenticationToken, llllllllllllIllIIIlIIlIlIIlllIIl, llllllllllllIllIIIlIIlIlIIllllII);
        this.func_152853_a(llllllllllllIllIIIlIIlIlIIlllIll);
        "".length();
        return ErrorCode.succeeded(llllllllllllIllIIIlIIlIlIIlllIll);
    }
    
    public boolean isIngestTesting() {
        if (lIIllIllllIIllll(this.broadcastState, BroadcastState.IngestTesting)) {
            return BroadcastController.lllIIIIIIIIIlI[2] != 0;
        }
        return BroadcastController.lllIIIIIIIIIlI[1] != 0;
    }
    
    public boolean func_152847_F() {
        if (lIIllIllllIlIIlI(this.isBroadcasting() ? 1 : 0)) {
            return BroadcastController.lllIIIIIIIIIlI[1] != 0;
        }
        final ErrorCode llllllllllllIllIIIlIIlIlIIIIIIII = this.field_152873_i.pauseVideo();
        if (lIIllIllllIlIIIl(ErrorCode.failed(llllllllllllIllIIIlIIlIlIIIIIIII) ? 1 : 0)) {
            this.stopBroadcasting();
            "".length();
            final String llllllllllllIllIIIlIIlIIllllllll = ErrorCode.getString(llllllllllllIllIIIlIIlIlIIIIIIII);
            final String format = BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[14]];
            final Object[] args = new Object[BroadcastController.lllIIIIIIIIIlI[2]];
            args[BroadcastController.lllIIIIIIIIIlI[1]] = llllllllllllIllIIIlIIlIIllllllll;
            this.func_152820_d(String.format(format, args));
            "".length();
            if (" ".length() > "   ".length()) {
                return ((65 + 102 - 161 + 150 ^ 56 + 86 - 90 + 82) & (0xB4 ^ 0x8D ^ (0x3B ^ 0x18) ^ -" ".length())) != 0x0;
            }
        }
        else {
            this.func_152827_a(BroadcastState.Paused);
        }
        return ErrorCode.succeeded(llllllllllllIllIIIlIIlIlIIIIIIII);
    }
    
    private static String lIIllIlllIllIlII(final String llllllllllllIllIIIlIIlIIIlIIIlII, final String llllllllllllIllIIIlIIlIIIlIIIIll) {
        try {
            final SecretKeySpec llllllllllllIllIIIlIIlIIIlIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIIlIIIlIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIlIIlIIIlIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIlIIlIIIlIIlIII.init(BroadcastController.lllIIIIIIIIIlI[5], llllllllllllIllIIIlIIlIIIlIIlIIl);
            return new String(llllllllllllIllIIIlIIlIIIlIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIIlIIIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIlIIlIIIlIIIlll) {
            llllllllllllIllIIIlIIlIIIlIIIlll.printStackTrace();
            return null;
        }
    }
    
    private static String lIIllIlllIllIllI(final String llllllllllllIllIIIlIIlIIIIlllIIl, final String llllllllllllIllIIIlIIlIIIIlllIII) {
        try {
            final SecretKeySpec llllllllllllIllIIIlIIlIIIIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIIlIIIIlllIII.getBytes(StandardCharsets.UTF_8)), BroadcastController.lllIIIIIIIIIlI[10]), "DES");
            final Cipher llllllllllllIllIIIlIIlIIIIlllIll = Cipher.getInstance("DES");
            llllllllllllIllIIIlIIlIIIIlllIll.init(BroadcastController.lllIIIIIIIIIlI[5], llllllllllllIllIIIlIIlIIIIllllII);
            return new String(llllllllllllIllIIIlIIlIIIIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIIlIIIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIlIIlIIIIlllIlI) {
            llllllllllllIllIIIlIIlIIIIlllIlI.printStackTrace();
            return null;
        }
    }
    
    public boolean func_152840_a(final String llllllllllllIllIIIlIIlIIllllIIII, final long llllllllllllIllIIIlIIlIIlllIlIII, final String llllllllllllIllIIIlIIlIIlllIlllI, final String llllllllllllIllIIIlIIlIIlllIIllI) {
        final ErrorCode llllllllllllIllIIIlIIlIIlllIllII = this.field_152873_i.sendActionMetaData(this.authenticationToken, llllllllllllIllIIIlIIlIIllllIIII, llllllllllllIllIIIlIIlIIlllIlIII, llllllllllllIllIIIlIIlIIlllIlllI, llllllllllllIllIIIlIIlIIlllIIllI);
        if (lIIllIllllIlIIIl(ErrorCode.failed(llllllllllllIllIIIlIIlIIlllIllII) ? 1 : 0)) {
            final String llllllllllllIllIIIlIIlIIlllIlIll = ErrorCode.getString(llllllllllllIllIIIlIIlIIlllIllII);
            final String format = BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[15]];
            final Object[] args = new Object[BroadcastController.lllIIIIIIIIIlI[2]];
            args[BroadcastController.lllIIIIIIIIIlI[1]] = llllllllllllIllIIIlIIlIIlllIlIll;
            this.func_152820_d(String.format(format, args));
            return BroadcastController.lllIIIIIIIIIlI[1] != 0;
        }
        return BroadcastController.lllIIIIIIIIIlI[2] != 0;
    }
    
    protected void func_152835_I() {
        final long llllllllllllIllIIIlIIlIIlIIllllI = System.nanoTime();
        final long llllllllllllIllIIIlIIlIIlIIlllIl = (llllllllllllIllIIIlIIlIIlIIllllI - this.field_152890_z) / 1000000000L;
        if (lIIllIllllIlIlll(lIIllIllllIlIllI(llllllllllllIllIIIlIIlIIlIIlllIl, 30L))) {
            this.field_152890_z = llllllllllllIllIIIlIIlIIlIIllllI;
            final ErrorCode llllllllllllIllIIIlIIlIIlIIlllII = this.field_152873_i.getStreamInfo(this.authenticationToken, this.field_152880_p);
            if (lIIllIllllIlIIIl(ErrorCode.failed(llllllllllllIllIIIlIIlIIlIIlllII) ? 1 : 0)) {
                final String llllllllllllIllIIIlIIlIIlIIllIll = ErrorCode.getString(llllllllllllIllIIIlIIlIIlIIlllII);
                final String format = BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[23]];
                final Object[] args = new Object[BroadcastController.lllIIIIIIIIIlI[2]];
                args[BroadcastController.lllIIIIIIIIIlI[1]] = llllllllllllIllIIIlIIlIIlIIllIll;
                this.func_152820_d(String.format(format, args));
            }
        }
    }
    
    private static String lIIllIlllIllIlIl(String llllllllllllIllIIIlIIlIIIIlIIlII, final String llllllllllllIllIIIlIIlIIIIlIlIII) {
        llllllllllllIllIIIlIIlIIIIlIIlII = new String(Base64.getDecoder().decode(llllllllllllIllIIIlIIlIIIIlIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIlIIlIIIIlIIlll = new StringBuilder();
        final char[] llllllllllllIllIIIlIIlIIIIlIIllI = llllllllllllIllIIIlIIlIIIIlIlIII.toCharArray();
        int llllllllllllIllIIIlIIlIIIIlIIlIl = BroadcastController.lllIIIIIIIIIlI[1];
        final short llllllllllllIllIIIlIIlIIIIIlllll = (Object)llllllllllllIllIIIlIIlIIIIlIIlII.toCharArray();
        final boolean llllllllllllIllIIIlIIlIIIIIllllI = llllllllllllIllIIIlIIlIIIIIlllll.length != 0;
        byte llllllllllllIllIIIlIIlIIIIIlllIl = (byte)BroadcastController.lllIIIIIIIIIlI[1];
        while (lIIllIllllIllIIl(llllllllllllIllIIIlIIlIIIIIlllIl, llllllllllllIllIIIlIIlIIIIIllllI ? 1 : 0)) {
            final char llllllllllllIllIIIlIIlIIIIlIlIlI = llllllllllllIllIIIlIIlIIIIIlllll[llllllllllllIllIIIlIIlIIIIIlllIl];
            llllllllllllIllIIIlIIlIIIIlIIlll.append((char)(llllllllllllIllIIIlIIlIIIIlIlIlI ^ llllllllllllIllIIIlIIlIIIIlIIllI[llllllllllllIllIIIlIIlIIIIlIIlIl % llllllllllllIllIIIlIIlIIIIlIIllI.length]));
            "".length();
            ++llllllllllllIllIIIlIIlIIIIlIIlIl;
            ++llllllllllllIllIIIlIIlIIIIIlllIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIlIIlIIIIlIIlll);
    }
    
    public IngestServerTester func_152838_J() {
        if (!lIIllIllllIlIIIl(this.isReadyToBroadcast() ? 1 : 0) || !lIIllIllllIlIIll(this.ingestList)) {
            return null;
        }
        if (lIIllIllllIlIIIl(this.isIngestTesting() ? 1 : 0)) {
            return null;
        }
        this.field_152860_A = new IngestServerTester(this.field_152873_i, this.ingestList);
        this.field_152860_A.func_176004_j();
        this.func_152827_a(BroadcastState.IngestTesting);
        return this.field_152860_A;
    }
    
    public boolean isReadyToBroadcast() {
        if (lIIllIllllIIllll(this.broadcastState, BroadcastState.ReadyToBroadcast)) {
            return BroadcastController.lllIIIIIIIIIlI[2] != 0;
        }
        return BroadcastController.lllIIIIIIIIIlI[1] != 0;
    }
    
    private static boolean lIIllIllllIlIIll(final Object llllllllllllIllIIIlIIlIIIIIIlIlI) {
        return llllllllllllIllIIIlIIlIIIIIIlIlI != null;
    }
    
    public void statCallback() {
        if (lIIllIllllIIlllI(this.broadcastState, BroadcastState.Uninitialized)) {
            if (lIIllIllllIlIIll(this.field_152860_A)) {
                this.field_152860_A.func_153039_l();
                "".length();
                if (-" ".length() >= ((0x75 ^ 0x73 ^ (0xF8 ^ 0xB0)) & (173 + 172 - 159 + 38 ^ 71 + 53 - 47 + 97 ^ -" ".length()))) {
                    return;
                }
            }
            while (!lIIllIllllIlIIII(this.field_152860_A)) {
                try {
                    Thread.sleep(200L);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                catch (Exception llllllllllllIllIIIlIIlIlIlIllIII) {
                    this.func_152820_d(llllllllllllIllIIIlIIlIlIlIllIII.toString());
                }
                this.func_152821_H();
            }
            this.func_152851_B();
            "".length();
        }
    }
    
    private static int lIIllIllllIlIlII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public boolean func_152849_q() {
        return this.field_152877_m;
    }
    
    public boolean func_152854_G() {
        if (lIIllIllllIlIIlI(this.isBroadcastPaused() ? 1 : 0)) {
            return BroadcastController.lllIIIIIIIIIlI[1] != 0;
        }
        this.func_152827_a(BroadcastState.Broadcasting);
        return BroadcastController.lllIIIIIIIIIlI[2] != 0;
    }
    
    public ErrorCode submitStreamFrame(final FrameBuffer llllllllllllIllIIIlIIlIIIllIIllI) {
        if (lIIllIllllIlIIIl(this.isBroadcastPaused() ? 1 : 0)) {
            this.func_152854_G();
            "".length();
            "".length();
            if (((0x6C ^ 0x7D) & ~(0x34 ^ 0x25)) > "   ".length()) {
                return null;
            }
        }
        else if (lIIllIllllIlIIlI(this.isBroadcasting() ? 1 : 0)) {
            return ErrorCode.TTV_EC_STREAM_NOT_STARTED;
        }
        final ErrorCode llllllllllllIllIIIlIIlIIIllIIlIl = this.field_152873_i.submitVideoFrame(llllllllllllIllIIIlIIlIIIllIIllI);
        if (lIIllIllllIIlllI(llllllllllllIllIIIlIIlIIIllIIlIl, ErrorCode.TTV_EC_SUCCESS)) {
            final String llllllllllllIllIIIlIIlIIIllIIlII = ErrorCode.getString(llllllllllllIllIIIlIIlIIIllIIlIl);
            if (lIIllIllllIlIIIl(ErrorCode.succeeded(llllllllllllIllIIIlIIlIIIllIIlIl) ? 1 : 0)) {
                final String format = BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[3]];
                final Object[] args = new Object[BroadcastController.lllIIIIIIIIIlI[2]];
                args[BroadcastController.lllIIIIIIIIIlI[1]] = llllllllllllIllIIIlIIlIIIllIIlII;
                this.func_152832_e(String.format(format, args));
                "".length();
                if (((0xA2 ^ 0x82) & ~(0x77 ^ 0x57)) != 0x0) {
                    return null;
                }
            }
            else {
                final String format2 = BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[32]];
                final Object[] args2 = new Object[BroadcastController.lllIIIIIIIIIlI[2]];
                args2[BroadcastController.lllIIIIIIIIIlI[1]] = llllllllllllIllIIIlIIlIIIllIIlII;
                this.func_152820_d(String.format(format2, args2));
                this.stopBroadcasting();
                "".length();
            }
            if (lIIllIllllIlIIll(this.broadcastListener)) {
                this.broadcastListener.func_152893_b(llllllllllllIllIIIlIIlIIIllIIlIl);
            }
        }
        return llllllllllllIllIIIlIIlIIIllIIlIl;
    }
    
    private static boolean lIIllIllllIIlllI(final Object llllllllllllIllIIIlIIlIIIIIlIIIl, final Object llllllllllllIllIIIlIIlIIIIIlIIII) {
        return llllllllllllIllIIIlIIlIIIIIlIIIl != llllllllllllIllIIIlIIlIIIIIlIIII;
    }
    
    public boolean func_152858_b() {
        return this.field_152876_l;
    }
    
    protected boolean func_152848_y() {
        return BroadcastController.lllIIIIIIIIIlI[2] != 0;
    }
    
    public IngestServer func_152833_s() {
        return this.field_152884_t;
    }
    
    public StreamInfo getStreamInfo() {
        return this.streamInfo;
    }
    
    protected void func_152831_M() {
        int llllllllllllIllIIIlIIlIIlIIIIlIl = BroadcastController.lllIIIIIIIIIlI[1];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIllIllllIllIII(llllllllllllIllIIIlIIlIIlIIIIlIl, this.field_152874_j.size())) {
            final FrameBuffer llllllllllllIllIIIlIIlIIlIIIIlII = this.field_152874_j.get(llllllllllllIllIIIlIIlIIlIIIIlIl);
            llllllllllllIllIIIlIIlIIlIIIIlII.free();
            ++llllllllllllIllIIIlIIlIIlIIIIlIl;
        }
        this.field_152875_k.clear();
        this.field_152874_j.clear();
    }
    
    public boolean func_152817_A() {
        if (lIIllIllllIlIIIl(this.field_152876_l ? 1 : 0)) {
            return BroadcastController.lllIIIIIIIIIlI[1] != 0;
        }
        this.field_152873_i.setStreamCallbacks(this.field_177948_B);
        ErrorCode llllllllllllIllIIIlIIlIlIllIIlII = this.field_152872_h.initialize(this.field_152868_d, System.getProperty(BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[4]]));
        if (lIIllIllllIlIIlI(this.func_152853_a(llllllllllllIllIIIlIIlIlIllIIlII) ? 1 : 0)) {
            this.field_152873_i.setStreamCallbacks((IStreamCallbacks)null);
            this.errorCode = llllllllllllIllIIIlIIlIlIllIIlII;
            return BroadcastController.lllIIIIIIIIIlI[1] != 0;
        }
        llllllllllllIllIIIlIIlIlIllIIlII = this.field_152872_h.setTraceLevel(MessageLevel.TTV_ML_ERROR);
        if (lIIllIllllIlIIlI(this.func_152853_a(llllllllllllIllIIIlIIlIlIllIIlII) ? 1 : 0)) {
            this.field_152873_i.setStreamCallbacks((IStreamCallbacks)null);
            this.field_152872_h.shutdown();
            "".length();
            this.errorCode = llllllllllllIllIIIlIIlIlIllIIlII;
            return BroadcastController.lllIIIIIIIIIlI[1] != 0;
        }
        if (lIIllIllllIlIIIl(ErrorCode.succeeded(llllllllllllIllIIIlIIlIlIllIIlII) ? 1 : 0)) {
            this.field_152876_l = (BroadcastController.lllIIIIIIIIIlI[2] != 0);
            this.func_152827_a(BroadcastState.Initialized);
            return BroadcastController.lllIIIIIIIIIlI[2] != 0;
        }
        this.errorCode = llllllllllllIllIIIlIIlIlIllIIlII;
        this.field_152872_h.shutdown();
        "".length();
        return BroadcastController.lllIIIIIIIIIlI[1] != 0;
    }
    
    protected boolean func_152823_L() {
        int llllllllllllIllIIIlIIlIIlIIIlllI = BroadcastController.lllIIIIIIIIIlI[1];
        "".length();
        if (-"  ".length() > 0) {
            return ((0x42 ^ 0x50) & ~(0xB4 ^ 0xA6)) != 0x0;
        }
        while (!lIIllIllllIllIII(llllllllllllIllIIIlIIlIIlIIIlllI, BroadcastController.lllIIIIIIIIIlI[4])) {
            final FrameBuffer llllllllllllIllIIIlIIlIIlIIIllIl = this.field_152873_i.allocateFrameBuffer(this.videoParamaters.outputWidth * this.videoParamaters.outputHeight * BroadcastController.lllIIIIIIIIIlI[6]);
            if (lIIllIllllIlIIlI(llllllllllllIllIIIlIIlIIlIIIllIl.getIsValid() ? 1 : 0)) {
                this.func_152820_d(String.format(BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[24]], new Object[BroadcastController.lllIIIIIIIIIlI[1]]));
                return BroadcastController.lllIIIIIIIIIlI[1] != 0;
            }
            this.field_152874_j.add(llllllllllllIllIIIlIIlIIlIIIllIl);
            "".length();
            this.field_152875_k.add(llllllllllllIllIIIlIIlIIlIIIllIl);
            "".length();
            ++llllllllllllIllIIIlIIlIIlIIIlllI;
        }
        return BroadcastController.lllIIIIIIIIIlI[2] != 0;
    }
    
    private static boolean lIIllIllllIllIII(final int llllllllllllIllIIIlIIlIIIIIllIIl, final int llllllllllllIllIIIlIIlIIIIIllIII) {
        return llllllllllllIllIIIlIIlIIIIIllIIl >= llllllllllllIllIIIlIIlIIIIIllIII;
    }
    
    public long func_152844_x() {
        return this.field_152873_i.getStreamTime();
    }
    
    public void func_152824_a(final IngestServer llllllllllllIllIIIlIIlIllIIIIlll) {
        this.field_152884_t = llllllllllllIllIIIlIIlIllIIIIlll;
    }
    
    public IngestServerTester isReady() {
        return this.field_152860_A;
    }
    
    public void setPlaybackDeviceVolume(final float llllllllllllIllIIIlIIlIlIllllIII) {
        this.field_152873_i.setVolume(AudioDeviceType.TTV_PLAYBACK_DEVICE, llllllllllllIllIIIlIIlIlIllllIII);
        "".length();
    }
    
    public void func_152841_a(final BroadcastListener llllllllllllIllIIIlIIlIllIlIllII) {
        this.broadcastListener = llllllllllllIllIIIlIIlIllIlIllII;
    }
    
    public void captureFramebuffer(final FrameBuffer llllllllllllIllIIIlIIlIIIlllIlII) {
        try {
            this.field_152873_i.captureFrameBuffer_ReadPixels(llllllllllllIllIIIlIIlIIIlllIlII);
            "".length();
            "".length();
            if (" ".length() < -" ".length()) {
                return;
            }
        }
        catch (Throwable llllllllllllIllIIIlIIlIIIlllIIll) {
            final CrashReport llllllllllllIllIIIlIIlIIIlllIIlI = CrashReport.makeCrashReport(llllllllllllIllIIIlIIlIIIlllIIll, BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[26]]);
            final CrashReportCategory llllllllllllIllIIIlIIlIIIlllIIIl = llllllllllllIllIIIlIIlIIIlllIIlI.makeCategory(BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[27]]);
            llllllllllllIllIIIlIIlIIIlllIIIl.addCrashSection(BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[28]], Arrays.toString(BroadcastController.field_152862_C.func_152756_c()));
            llllllllllllIllIIIlIIlIIIlllIIIl.addCrashSection(BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[29]], llllllllllllIllIIIlIIlIIIlllIlII);
            llllllllllllIllIIIlIIlIIIlllIIIl.addCrashSection(BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[30]], this.field_152875_k.size());
            llllllllllllIllIIIlIIlIIIlllIIIl.addCrashSection(BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[31]], this.field_152874_j.size());
            throw new ReportedException(llllllllllllIllIIIlIIlIIIlllIIlI);
        }
    }
    
    private static boolean lIIllIllllIlIlll(final int llllllllllllIllIIIlIIlIIIIIIIIlI) {
        return llllllllllllIllIIIlIIlIIIIIIIIlI >= 0;
    }
    
    static {
        lIIllIllllIIllIl();
        lIIllIlllIlllIlI();
        logger = LogManager.getLogger();
        field_152862_C = new ThreadSafeBoundList<String>(String.class, BroadcastController.lllIIIIIIIIIlI[0]);
    }
    
    public boolean func_177947_a(final String llllllllllllIllIIIlIIlIIllIIlIII, final long llllllllllllIllIIIlIIlIIllIIIlll, final long llllllllllllIllIIIlIIlIIlIlllllI, final String llllllllllllIllIIIlIIlIIlIllllIl, final String llllllllllllIllIIIlIIlIIlIllllII) {
        if (lIIllIllllIlIIlI(lIIllIllllIlIlIl(llllllllllllIllIIIlIIlIIlIlllllI, -1L))) {
            final String format = BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[17]];
            final Object[] args = new Object[BroadcastController.lllIIIIIIIIIlI[2]];
            args[BroadcastController.lllIIIIIIIIIlI[1]] = llllllllllllIllIIIlIIlIIlIlllllI;
            this.func_152820_d(String.format(format, args));
            return BroadcastController.lllIIIIIIIIIlI[1] != 0;
        }
        final ErrorCode llllllllllllIllIIIlIIlIIllIIIIll = this.field_152873_i.sendEndSpanMetaData(this.authenticationToken, llllllllllllIllIIIlIIlIIllIIlIII, llllllllllllIllIIIlIIlIIllIIIlll, llllllllllllIllIIIlIIlIIlIlllllI, llllllllllllIllIIIlIIlIIlIllllIl, llllllllllllIllIIIlIIlIIlIllllII);
        if (lIIllIllllIlIIIl(ErrorCode.failed(llllllllllllIllIIIlIIlIIllIIIIll) ? 1 : 0)) {
            final String llllllllllllIllIIIlIIlIIllIIIIlI = ErrorCode.getString(llllllllllllIllIIIlIIlIIllIIIIll);
            final String format2 = BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[18]];
            final Object[] args2 = new Object[BroadcastController.lllIIIIIIIIIlI[2]];
            args2[BroadcastController.lllIIIIIIIIIlI[1]] = llllllllllllIllIIIlIIlIIllIIIIlI;
            this.func_152820_d(String.format(format2, args2));
            return BroadcastController.lllIIIIIIIIIlI[1] != 0;
        }
        return BroadcastController.lllIIIIIIIIIlI[2] != 0;
    }
    
    public boolean requestCommercial() {
        if (lIIllIllllIlIIlI(this.isBroadcasting() ? 1 : 0)) {
            return BroadcastController.lllIIIIIIIIIlI[1] != 0;
        }
        final ErrorCode llllllllllllIllIIIlIIlIlIIllIIIl = this.field_152873_i.runCommercial(this.authenticationToken);
        this.func_152853_a(llllllllllllIllIIIlIIlIlIIllIIIl);
        "".length();
        return ErrorCode.succeeded(llllllllllllIllIIIlIIlIlIIllIIIl);
    }
    
    protected PixelFormat func_152826_z() {
        return PixelFormat.TTV_PF_RGBA;
    }
    
    public boolean func_152845_C() {
        if (lIIllIllllIlIIIl(this.isIngestTesting() ? 1 : 0)) {
            return BroadcastController.lllIIIIIIIIIlI[1] != 0;
        }
        if (lIIllIllllIlIIIl(this.isBroadcasting() ? 1 : 0)) {
            this.field_152873_i.stop((boolean)(BroadcastController.lllIIIIIIIIIlI[1] != 0));
            "".length();
        }
        this.field_152880_p = BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[8]];
        this.authenticationToken = new AuthToken();
        if (lIIllIllllIlIIlI(this.field_152877_m ? 1 : 0)) {
            return BroadcastController.lllIIIIIIIIIlI[1] != 0;
        }
        this.field_152877_m = (BroadcastController.lllIIIIIIIIIlI[1] != 0);
        if (lIIllIllllIlIIlI(this.field_152878_n ? 1 : 0)) {
            try {
                if (lIIllIllllIlIIll(this.broadcastListener)) {
                    this.broadcastListener.func_152895_a();
                    "".length();
                    if ((0x73 ^ 0x77) < ((0x7D ^ 0x5B) & ~(0x45 ^ 0x63))) {
                        return ((0x1F ^ 0x36) & ~(0x51 ^ 0x78)) != 0x0;
                    }
                }
            }
            catch (Exception llllllllllllIllIIIlIIlIlIlIIlIIl) {
                this.func_152820_d(llllllllllllIllIIIlIIlIlIlIIlIIl.toString());
            }
        }
        this.func_152827_a(BroadcastState.Initialized);
        return BroadcastController.lllIIIIIIIIIlI[2] != 0;
    }
    
    public boolean func_152818_a(final String llllllllllllIllIIIlIIlIlIlIlIIIl, final AuthToken llllllllllllIllIIIlIIlIlIlIIllIl) {
        if (lIIllIllllIlIIIl(this.isIngestTesting() ? 1 : 0)) {
            return BroadcastController.lllIIIIIIIIIlI[1] != 0;
        }
        this.func_152845_C();
        "".length();
        if (!lIIllIllllIlIIll(llllllllllllIllIIIlIIlIlIlIlIIIl) || !lIIllIllllIlIIlI(llllllllllllIllIIIlIIlIlIlIlIIIl.isEmpty() ? 1 : 0)) {
            this.func_152820_d(BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[7]]);
            return BroadcastController.lllIIIIIIIIIlI[1] != 0;
        }
        if (lIIllIllllIlIIll(llllllllllllIllIIIlIIlIlIlIIllIl) && lIIllIllllIlIIll(llllllllllllIllIIIlIIlIlIlIIllIl.data) && lIIllIllllIlIIlI(llllllllllllIllIIIlIIlIlIlIIllIl.data.isEmpty() ? 1 : 0)) {
            this.field_152880_p = llllllllllllIllIIIlIIlIlIlIlIIIl;
            this.authenticationToken = llllllllllllIllIIIlIIlIlIlIIllIl;
            if (lIIllIllllIlIIIl(this.func_152858_b() ? 1 : 0)) {
                this.func_152827_a(BroadcastState.Authenticated);
            }
            return BroadcastController.lllIIIIIIIIIlI[2] != 0;
        }
        this.func_152820_d(BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[6]]);
        return BroadcastController.lllIIIIIIIIIlI[1] != 0;
    }
    
    public boolean func_152851_B() {
        if (lIIllIllllIlIIlI(this.field_152876_l ? 1 : 0)) {
            return BroadcastController.lllIIIIIIIIIlI[2] != 0;
        }
        if (lIIllIllllIlIIIl(this.isIngestTesting() ? 1 : 0)) {
            return BroadcastController.lllIIIIIIIIIlI[1] != 0;
        }
        this.field_152878_n = (BroadcastController.lllIIIIIIIIIlI[2] != 0);
        this.func_152845_C();
        "".length();
        this.field_152873_i.setStreamCallbacks((IStreamCallbacks)null);
        this.field_152873_i.setStatCallbacks((IStatCallbacks)null);
        final ErrorCode llllllllllllIllIIIlIIlIlIlIllllI = this.field_152872_h.shutdown();
        this.func_152853_a(llllllllllllIllIIIlIIlIlIlIllllI);
        "".length();
        this.field_152876_l = (BroadcastController.lllIIIIIIIIIlI[1] != 0);
        this.field_152878_n = (BroadcastController.lllIIIIIIIIIlI[1] != 0);
        this.func_152827_a(BroadcastState.Uninitialized);
        return BroadcastController.lllIIIIIIIIIlI[2] != 0;
    }
    
    public void setRecordingDeviceVolume(final float llllllllllllIllIIIlIIlIlIlllllII) {
        this.field_152873_i.setVolume(AudioDeviceType.TTV_RECORDER_DEVICE, llllllllllllIllIIIlIIlIlIlllllII);
        "".length();
    }
    
    public void func_152842_a(final String llllllllllllIllIIIlIIlIllIlIIIll) {
        this.field_152868_d = llllllllllllIllIIIlIIlIllIlIIIll;
    }
    
    private static void lIIllIlllIlllIlI() {
        (llIlllllllllll = new String[BroadcastController.lllIIIIIIIIIlI[37]])[BroadcastController.lllIIIIIIIIIlI[1]] = lIIllIlllIllIlII("21eT2j+G+NQ=", "XoCRk");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[2]] = lIIllIlllIllIlIl("", "zzfUM");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[5]] = lIIllIlllIllIlIl("", "BdVYP");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[4]] = lIIllIlllIllIllI("KK0xWPoT8IGa2h2+9FgXv3UoSIrWSFCu", "CLTSP");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[6]] = lIIllIlllIllIlIl("CQUELmY8HxsjKGgdBTUyaBIVZjApHBki", "HppFF");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[7]] = lIIllIlllIllIlIl("EAc0PyAkGTRtIzAHJW0sIFQnLCIsEA==", "EtQMN");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[8]] = lIIllIlllIllIlIl("", "ivvWu");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[9]] = lIIllIlllIllIlII("hxHrZPeWxz8=", "mJbpV");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[10]] = lIIllIlllIllIlIl("", "SKcQS");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[11]] = lIIllIlllIllIlII("3llDc+/3TH0=", "Cadwf");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[12]] = lIIllIlllIllIlII("T4tvB4lFRzipIFBDkJjRseR5d7xWUWXPdLm8a0bRwQktD1kOTVEmnA==", "KcxAc");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[13]] = lIIllIlllIllIlII("QAneV1iUzBRWhX5qCs+H8kxAU+SNbPJtyBzoxEXJivghvf9s8Wdw8g==", "chYVf");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[14]] = lIIllIlllIllIlII("9KMfSRZty9NqKWHsM/MTchWGsFj/jXMzHI9LLr6Q7iQ=", "NVWcM");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[15]] = lIIllIlllIllIllI("sITu5xl3k0RuQrsQ9PjxNQ6474dqCBUdzU1mtIZE7/RjPtWxMrehvg==", "BxVPK");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[16]] = lIIllIlllIllIlIl("DRsdAAhoAAFPKS0HCzwOKRsbPAopByIKDiktDhsbQg==", "Hiooz");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[17]] = lIIllIlllIllIllI("KI6L5J3PAAopwoCqzLqDUJSt+64z9bOxBz5FpMNTjLw=", "xeOSz");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[18]] = lIIllIlllIllIlIl("IwoAHRpGERxSOwMWFiEcCQghAgkINRcGCSIZBhNSRl0BeA==", "fxrrh");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[19]] = lIIllIlllIllIlII("33BDwXYPvHrOU4zRE7flUzhg1PqFSV20", "DYkOw");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[20]] = lIIllIlllIllIlIl("HTYaDTt4LQZCHQwSNyUsLA0GBSwrMDsHOy4hGhFzeGEbaA==", "XDhbI");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[21]] = lIIllIlllIllIlIl("FDgFPBNxIxlzNQUcKBQEJR8ENhMYJBE8W3FvBFk=", "QJwSa");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[22]] = lIIllIlllIllIllI("1/AjQZHfy/62PIDXGftCi3aaTjALrw3shN6pcdEFz8YO1exrwlB4gg==", "OqIsb");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[23]] = lIIllIlllIllIllI("3TxLl8BANVQDCRT+uZ9w08DDgMMUeACauHtPH2VXnes=", "qAoLi");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[24]] = lIIllIlllIllIllI("B+esyPeDvAj1rDU8UB5xb/tkFrs76e8Up/G8SK+YEWgkDDZ26i+lHA==", "TWiMG");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[25]] = lIIllIlllIllIlIl("NhQYYwMfQQoxCRxBDjYKHwQeMEBZFQQqH1kSBCwZFQVMLQkPBB5jBBgRHCYC", "yalCl");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[26]] = lIIllIlllIllIlIl("PT8jHxoObS4ZVBo4OBsdHW07VhIbLDcTVB0ieiIDADk5Hg==", "iMZvt");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[27]] = lIIllIlllIllIlII("+eWPSLeQg4ga/Gs6AwFFbA==", "QGXoE");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[28]] = lIIllIlllIllIllI("epMN2EKRhSKiDcijuB2kx1lZzYVQmmVG", "nexNj");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[29]] = lIIllIlllIllIlIl("NToIAiIF", "wOndG");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[30]] = lIIllIlllIllIlIl("Khw3BFYOGzQHEx5OMQ4DAho=", "lnRav");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[31]] = lIIllIlllIllIlII("n44J4xMb8HU6W68gQHvV3rfRxTqUHBJe", "BMYoW");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[3]] = lIIllIlllIllIlII("AOKOK2m1rkA4rKEiYIvKwYjdeNlB0Sk03bkiv4d71HB7h4Yg7c3QUw==", "ppHHs");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[32]] = lIIllIlllIllIlIl("Ah8wCTpnBCxGGzIPLw88Ewg6Ej01CBIJISkZJxRyZ0gxbA==", "GmBfH");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[33]] = lIIllIlllIllIllI("gV4D13KBHQGrITMLbBv8aA==", "tSrQM");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[34]] = lIIllIlllIllIlIl("AzgxBxs8GSIbDngZLAYOKhUvBB8qJ2MTBw==", "XzChz");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[35]] = lIIllIlllIllIlII("93x+xoKBil83PfwEdpgz9g==", "fegre");
        BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[36]] = lIIllIlllIllIlII("VLxDQn5tmOmwtSwfIUXzyCsREt9GUiAz9ACi0I54OKI=", "BNYYD");
    }
    
    public VideoParams func_152834_a(final int llllllllllllIllIIIlIIlIlIIlIIllI, final int llllllllllllIllIIIlIIlIlIIIllllI, final float llllllllllllIllIIIlIIlIlIIIlllIl, final float llllllllllllIllIIIlIIlIlIIIlllII) {
        final int[] llllllllllllIllIIIlIIlIlIIlIIIlI = this.field_152873_i.getMaxResolution(llllllllllllIllIIIlIIlIlIIlIIllI, llllllllllllIllIIIlIIlIlIIIllllI, llllllllllllIllIIIlIIlIlIIIlllIl, llllllllllllIllIIIlIIlIlIIIlllII);
        final VideoParams llllllllllllIllIIIlIIlIlIIlIIIIl = new VideoParams();
        llllllllllllIllIIIlIIlIlIIlIIIIl.maxKbps = llllllllllllIllIIIlIIlIlIIlIIllI;
        llllllllllllIllIIIlIIlIlIIlIIIIl.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
        llllllllllllIllIIIlIIlIlIIlIIIIl.pixelFormat = this.func_152826_z();
        llllllllllllIllIIIlIIlIlIIlIIIIl.targetFps = llllllllllllIllIIIlIIlIlIIIllllI;
        llllllllllllIllIIIlIIlIlIIlIIIIl.outputWidth = llllllllllllIllIIIlIIlIlIIlIIIlI[BroadcastController.lllIIIIIIIIIlI[1]];
        llllllllllllIllIIIlIIlIlIIlIIIIl.outputHeight = llllllllllllIllIIIlIIlIlIIlIIIlI[BroadcastController.lllIIIIIIIIIlI[2]];
        llllllllllllIllIIIlIIlIlIIlIIIIl.disableAdaptiveBitrate = (BroadcastController.lllIIIIIIIIIlI[1] != 0);
        llllllllllllIllIIIlIIlIlIIlIIIIl.verticalFlip = (BroadcastController.lllIIIIIIIIIlI[1] != 0);
        return llllllllllllIllIIIlIIlIlIIlIIIIl;
    }
    
    public BroadcastController() {
        this.field_152863_D = null;
        this.broadcastListener = null;
        this.field_152868_d = BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[1]];
        this.field_152869_e = BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[2]];
        this.field_152870_f = BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[5]];
        this.field_152871_g = (BroadcastController.lllIIIIIIIIIlI[2] != 0);
        this.field_152872_h = null;
        this.field_152873_i = null;
        this.field_152874_j = (List<FrameBuffer>)Lists.newArrayList();
        this.field_152875_k = (List<FrameBuffer>)Lists.newArrayList();
        this.field_152876_l = (BroadcastController.lllIIIIIIIIIlI[1] != 0);
        this.field_152877_m = (BroadcastController.lllIIIIIIIIIlI[1] != 0);
        this.field_152878_n = (BroadcastController.lllIIIIIIIIIlI[1] != 0);
        this.broadcastState = BroadcastState.Uninitialized;
        this.field_152880_p = null;
        this.videoParamaters = null;
        this.audioParamaters = null;
        this.ingestList = new IngestList(new IngestServer[BroadcastController.lllIIIIIIIIIlI[1]]);
        this.field_152884_t = null;
        this.authenticationToken = new AuthToken();
        this.channelInfo = new ChannelInfo();
        this.userInfo = new UserInfo();
        this.streamInfo = new StreamInfo();
        this.field_152889_y = new ArchivingState();
        this.field_152890_z = 0L;
        this.field_152860_A = null;
        this.field_177948_B = (IStreamCallbacks)new IStreamCallbacks() {
            private static final /* synthetic */ String[] llIIIIIlllllII;
            private static final /* synthetic */ int[] llIIIIlIIIllII;
            
            public void runCommercialCallback(final ErrorCode llllllllllllIlllIlllIlIIIIIIIIIl) {
                if (lIIIIllllIIlIIII(ErrorCode.failed(llllllllllllIlllIlllIlIIIIIIIIIl) ? 1 : 0)) {
                    final String llllllllllllIlllIlllIlIIIIIIIIll = ErrorCode.getString(llllllllllllIlllIlllIlIIIIIIIIIl);
                    final BroadcastController this$0 = BroadcastController.this;
                    final String format = BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[6]];
                    final Object[] args = new Object[BroadcastController$1.llIIIIlIIIllII[1]];
                    args[BroadcastController$1.llIIIIlIIIllII[0]] = llllllllllllIlllIlllIlIIIIIIIIll;
                    this$0.func_152832_e(String.format(format, args));
                }
            }
            
            private static boolean lIIIIllllIIlIIII(final int llllllllllllIlllIlllIIllIlllIlIl) {
                return llllllllllllIlllIlllIIllIlllIlIl != 0;
            }
            
            public void getIngestServersCallback(final ErrorCode llllllllllllIlllIlllIlIIIIlIllIl, final IngestList llllllllllllIlllIlllIlIIIIlIllII) {
                if (lIIIIllllIIlIIII(ErrorCode.succeeded(llllllllllllIlllIlllIlIIIIlIllIl) ? 1 : 0)) {
                    BroadcastController.this.ingestList = llllllllllllIlllIlllIlIIIIlIllII;
                    BroadcastController.this.field_152884_t = BroadcastController.this.ingestList.getDefaultServer();
                    BroadcastController.this.func_152827_a(BroadcastState.ReceivedIngestServers);
                    try {
                        if (!lIIIIllllIIlIIIl(BroadcastController.this.broadcastListener)) {
                            return;
                        }
                        BroadcastController.this.broadcastListener.func_152896_a(llllllllllllIlllIlllIlIIIIlIllII);
                        "".length();
                        if (null != null) {
                            return;
                        }
                        return;
                    }
                    catch (Exception llllllllllllIlllIlllIlIIIIllIIII) {
                        BroadcastController.this.func_152820_d(llllllllllllIlllIlllIlIIIIllIIII.toString());
                        "".length();
                        if ("   ".length() == 0) {
                            return;
                        }
                        return;
                    }
                }
                final String llllllllllllIlllIlllIlIIIIlIllll = ErrorCode.getString(llllllllllllIlllIlllIlIIIIlIllIl);
                final BroadcastController this$0 = BroadcastController.this;
                final String format = BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[3]];
                final Object[] args = new Object[BroadcastController$1.llIIIIlIIIllII[1]];
                args[BroadcastController$1.llIIIIlIIIllII[0]] = llllllllllllIlllIlllIlIIIIlIllll;
                this$0.func_152820_d(String.format(format, args));
                BroadcastController.this.func_152827_a(BroadcastState.LoggingIn);
            }
            
            public void sendActionMetaDataCallback(final ErrorCode llllllllllllIlllIlllIIllllIIIlll) {
                if (lIIIIllllIIlIIII(ErrorCode.failed(llllllllllllIlllIlllIIllllIIIlll) ? 1 : 0)) {
                    final String llllllllllllIlllIlllIIllllIIIllI = ErrorCode.getString(llllllllllllIlllIlllIIllllIIIlll);
                    final BroadcastController this$0 = BroadcastController.this;
                    final String format = BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[11]];
                    final Object[] args = new Object[BroadcastController$1.llIIIIlIIIllII[1]];
                    args[BroadcastController$1.llIIIIlIIIllII[0]] = llllllllllllIlllIlllIIllllIIIllI;
                    this$0.func_152820_d(String.format(format, args));
                }
            }
            
            private static String lIIIIllllIIIIIll(final String llllllllllllIlllIlllIIlllIIIIIlI, final String llllllllllllIlllIlllIIlllIIIIIIl) {
                try {
                    final SecretKeySpec llllllllllllIlllIlllIIlllIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlllIIlllIIIIIIl.getBytes(StandardCharsets.UTF_8)), BroadcastController$1.llIIIIlIIIllII[8]), "DES");
                    final Cipher llllllllllllIlllIlllIIlllIIIIllI = Cipher.getInstance("DES");
                    llllllllllllIlllIlllIIlllIIIIllI.init(BroadcastController$1.llIIIIlIIIllII[2], llllllllllllIlllIlllIIlllIIIIlll);
                    return new String(llllllllllllIlllIlllIIlllIIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlllIIlllIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlllIlllIIlllIIIIlIl) {
                    llllllllllllIlllIlllIIlllIIIIlIl.printStackTrace();
                    return null;
                }
            }
            
            public void startCallback(final ErrorCode llllllllllllIlllIlllIIllllIlIlll) {
                if (lIIIIllllIIlIIII(ErrorCode.succeeded(llllllllllllIlllIlllIIllllIlIlll) ? 1 : 0)) {
                    try {
                        if (lIIIIllllIIlIIIl(BroadcastController.this.broadcastListener)) {
                            BroadcastController.this.broadcastListener.func_152899_b();
                            "".length();
                            if ("   ".length() <= 0) {
                                return;
                            }
                        }
                    }
                    catch (Exception llllllllllllIlllIlllIIllllIllIll) {
                        BroadcastController.this.func_152820_d(llllllllllllIlllIlllIIllllIllIll.toString());
                    }
                    BroadcastController.this.func_152827_a(BroadcastState.Broadcasting);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    BroadcastController.this.videoParamaters = null;
                    BroadcastController.this.audioParamaters = null;
                    BroadcastController.this.func_152827_a(BroadcastState.ReadyToBroadcast);
                    try {
                        if (lIIIIllllIIlIIIl(BroadcastController.this.broadcastListener)) {
                            BroadcastController.this.broadcastListener.func_152892_c(llllllllllllIlllIlllIIllllIlIlll);
                            "".length();
                            if ("  ".length() >= "   ".length()) {
                                return;
                            }
                        }
                    }
                    catch (Exception llllllllllllIlllIlllIIllllIllIlI) {
                        BroadcastController.this.func_152820_d(llllllllllllIlllIlllIIllllIllIlI.toString());
                    }
                    final String llllllllllllIlllIlllIIllllIllIIl = ErrorCode.getString(llllllllllllIlllIlllIIllllIlIlll);
                    final BroadcastController this$0 = BroadcastController.this;
                    final String format = BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[9]];
                    final Object[] args = new Object[BroadcastController$1.llIIIIlIIIllII[1]];
                    args[BroadcastController$1.llIIIIlIIIllII[0]] = llllllllllllIlllIlllIIllllIllIIl;
                    this$0.func_152820_d(String.format(format, args));
                }
            }
            
            public void stopCallback(final ErrorCode llllllllllllIlllIlllIIllllIlIIIl) {
                if (lIIIIllllIIlIIII(ErrorCode.succeeded(llllllllllllIlllIlllIIllllIlIIIl) ? 1 : 0)) {
                    BroadcastController.this.videoParamaters = null;
                    BroadcastController.this.audioParamaters = null;
                    BroadcastController.this.func_152831_M();
                    try {
                        if (lIIIIllllIIlIIIl(BroadcastController.this.broadcastListener)) {
                            BroadcastController.this.broadcastListener.func_152901_c();
                            "".length();
                            if ((0x14 ^ 0x10) < (0x4C ^ 0x48)) {
                                return;
                            }
                        }
                    }
                    catch (Exception llllllllllllIlllIlllIIllllIlIIII) {
                        BroadcastController.this.func_152820_d(llllllllllllIlllIlllIIllllIlIIII.toString());
                    }
                    if (lIIIIllllIIlIIII(BroadcastController.this.field_152877_m ? 1 : 0)) {
                        BroadcastController.this.func_152827_a(BroadcastState.ReadyToBroadcast);
                        "".length();
                        if ((0x1 ^ 0x5) < (0xA ^ 0xE)) {
                            return;
                        }
                    }
                    else {
                        BroadcastController.this.func_152827_a(BroadcastState.Initialized);
                        "".length();
                        if (-" ".length() > (0xC6 ^ 0x8D ^ (0x8 ^ 0x47))) {
                            return;
                        }
                    }
                }
                else {
                    BroadcastController.this.func_152827_a(BroadcastState.ReadyToBroadcast);
                    final String llllllllllllIlllIlllIIllllIIllll = ErrorCode.getString(llllllllllllIlllIlllIIllllIlIIIl);
                    final BroadcastController this$0 = BroadcastController.this;
                    final String format = BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[10]];
                    final Object[] args = new Object[BroadcastController$1.llIIIIlIIIllII[1]];
                    args[BroadcastController$1.llIIIIlIIIllII[0]] = llllllllllllIlllIlllIIllllIIllll;
                    this$0.func_152820_d(String.format(format, args));
                }
            }
            
            private static String lIIIIllllIIIIlII(final String llllllllllllIlllIlllIIlllIlIlIIl, final String llllllllllllIlllIlllIIlllIlIIllI) {
                try {
                    final SecretKeySpec llllllllllllIlllIlllIIlllIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlllIIlllIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher llllllllllllIlllIlllIIlllIlIlIll = Cipher.getInstance("Blowfish");
                    llllllllllllIlllIlllIIlllIlIlIll.init(BroadcastController$1.llIIIIlIIIllII[2], llllllllllllIlllIlllIIlllIlIllII);
                    return new String(llllllllllllIlllIlllIIlllIlIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlllIIlllIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlllIlllIIlllIlIlIlI) {
                    llllllllllllIlllIlllIIlllIlIlIlI.printStackTrace();
                    return null;
                }
            }
            
            public void requestAuthTokenCallback(final ErrorCode llllllllllllIlllIlllIlIIIlIIllII, final AuthToken llllllllllllIlllIlllIlIIIlIIlIll) {
                if (lIIIIllllIIlIIII(ErrorCode.succeeded(llllllllllllIlllIlllIlIIIlIIllII) ? 1 : 0)) {
                    BroadcastController.this.authenticationToken = llllllllllllIlllIlllIlIIIlIIlIll;
                    BroadcastController.this.func_152827_a(BroadcastState.Authenticated);
                    "".length();
                    if ((134 + 22 - 121 + 125 ^ 3 + 13 + 138 + 11) <= 0) {
                        return;
                    }
                }
                else {
                    BroadcastController.this.authenticationToken.data = BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[0]];
                    BroadcastController.this.func_152827_a(BroadcastState.Initialized);
                    final String llllllllllllIlllIlllIlIIIlIIlIlI = ErrorCode.getString(llllllllllllIlllIlllIlIIIlIIllII);
                    final BroadcastController this$0 = BroadcastController.this;
                    final String format = BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[1]];
                    final Object[] args = new Object[BroadcastController$1.llIIIIlIIIllII[1]];
                    args[BroadcastController$1.llIIIIlIIIllII[0]] = llllllllllllIlllIlllIlIIIlIIlIlI;
                    this$0.func_152820_d(String.format(format, args));
                }
                try {
                    if (lIIIIllllIIlIIIl(BroadcastController.this.broadcastListener)) {
                        BroadcastController.this.broadcastListener.func_152900_a(llllllllllllIlllIlllIlIIIlIIllII, llllllllllllIlllIlllIlIIIlIIlIll);
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                }
                catch (Exception llllllllllllIlllIlllIlIIIlIIlIIl) {
                    BroadcastController.this.func_152820_d(llllllllllllIlllIlllIlIIIlIIlIIl.toString());
                }
            }
            
            public void loginCallback(final ErrorCode llllllllllllIlllIlllIlIIIIllllll, final ChannelInfo llllllllllllIlllIlllIlIIIIlllllI) {
                if (lIIIIllllIIlIIII(ErrorCode.succeeded(llllllllllllIlllIlllIlIIIIllllll) ? 1 : 0)) {
                    BroadcastController.this.channelInfo = llllllllllllIlllIlllIlIIIIlllllI;
                    BroadcastController.this.func_152827_a(BroadcastState.LoggedIn);
                    BroadcastController.this.field_152877_m = (BroadcastController$1.llIIIIlIIIllII[1] != 0);
                    "".length();
                    if (((0x0 ^ 0x7C ^ (0x17 ^ 0x55)) & (7 + 83 - 0 + 43 ^ 0 + 118 + 52 + 17 ^ -" ".length())) != 0x0) {
                        return;
                    }
                }
                else {
                    BroadcastController.this.func_152827_a(BroadcastState.Initialized);
                    BroadcastController.this.field_152877_m = (BroadcastController$1.llIIIIlIIIllII[0] != 0);
                    final String llllllllllllIlllIlllIlIIIIllllIl = ErrorCode.getString(llllllllllllIlllIlllIlIIIIllllll);
                    final BroadcastController this$0 = BroadcastController.this;
                    final String format = BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[2]];
                    final Object[] args = new Object[BroadcastController$1.llIIIIlIIIllII[1]];
                    args[BroadcastController$1.llIIIIlIIIllII[0]] = llllllllllllIlllIlllIlIIIIllllIl;
                    this$0.func_152820_d(String.format(format, args));
                }
                try {
                    if (lIIIIllllIIlIIIl(BroadcastController.this.broadcastListener)) {
                        BroadcastController.this.broadcastListener.func_152897_a(llllllllllllIlllIlllIlIIIIllllll);
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                }
                catch (Exception llllllllllllIlllIlllIlIIIIllllII) {
                    BroadcastController.this.func_152820_d(llllllllllllIlllIlllIlIIIIllllII.toString());
                }
            }
            
            public void bufferUnlockCallback(final long llllllllllllIlllIlllIIlllllIIIlI) {
                final FrameBuffer llllllllllllIlllIlllIIlllllIIlII = FrameBuffer.lookupBuffer(llllllllllllIlllIlllIIlllllIIIlI);
                BroadcastController.this.field_152875_k.add(llllllllllllIlllIlllIIlllllIIlII);
                "".length();
            }
            
            private static boolean lIIIIllllIIlIIlI(final Object llllllllllllIlllIlllIIllIlllIlll) {
                return llllllllllllIlllIlllIIllIlllIlll == null;
            }
            
            private static void lIIIIllllIIIlIlI() {
                (llIIIIIlllllII = new String[BroadcastController$1.llIIIIlIIIllII[14]])[BroadcastController$1.llIIIIlIIIllII[0]] = lIIIIllllIIIIIll("Gf39OJep8K0=", "BKsos");
                BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[1]] = lIIIIllllIIIIlII("RIUlL3TQFgE9ruIKSY73vv/CGabAzYLNj1yVMwUPMr/iS62hS5Xi6L9n4dKXYVqs", "aQdgz");
                BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[2]] = lIIIIllllIIIlIII("His+PikRJTU7JTMnMncgPTB5MSY7KCwlImhkfCQ=", "RDYWG");
                BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[3]] = lIIIIllllIIIlIII("Dy0eNgcyDxAgAAUiFT8WJyAScxMpN1k1FS8vDCERfGNcIA==", "FCySt");
                BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[4]] = lIIIIllllIIIIIll("HWGt6MUiT5bOrXDXQGbAxTzSLojzNAq0Hg+VQ5GtSHxr+/zBiXkiIw==", "ZdCVC");
                BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[5]] = lIIIIllllIIIIIll("4/ztuSmnhUtNTqg+4YQwmu19jr4nBzYuepM2hLG4TaEN9kwcqHAgnw==", "bGmKQ");
                BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[6]] = lIIIIllllIIIIIll("GapOsm+FaTg9JHLv/RsZl6VhouoilwyeLtzelY8ICY0nxzkll75UKw==", "lTQQt");
                BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[7]] = lIIIIllllIIIIIll("0spHDv78q+Hv6KKtgbl44myxx3e3zn5zMlPGcwumdLUPI0zS1MP1Ig==", "sACEW");
                BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[8]] = lIIIIllllIIIlIII("DzYEFi8pOgw/CDsjKhINJDUIEApoMAYHQS42AB8UOjJTU0Q7", "HWisa");
                BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[9]] = lIIIIllllIIIIlII("4MMZMUb1TNflSQtdYO4I3+K1XZrrKHsLqKqD6exLYJw=", "oYFKt");
                BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[10]] = lIIIIllllIIIIlII("rc/Z7QrHzJou7jPnAfl2mS9UAs+y2cBpORa0OMzvHO4=", "HBapm");
                BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[11]] = lIIIIllllIIIIIll("dm0bmQ1Ac/DFnHTJcbfoDLgb7lzwF8Y6FKbyVJj0wWnY3ogZnhm/qJrdSCmBEizX", "nWIMr");
                BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[12]] = lIIIIllllIIIlIII("FRMDFyESFx8HIRYXAz4XEhcpEgYHNQwfHgQXDhhSARkZUxQHHwEGAANMTVYB", "fvmsr");
                BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[13]] = lIIIIllllIIIlIII("Gg0CBisHDD8SDwclCRYPLQkYAy0IBAAADwoDTAUBHUgKAwcFHR4HVElNHw==", "ihlbn");
            }
            
            public void sendEndSpanMetaDataCallback(final ErrorCode llllllllllllIlllIlllIIlllIllIIlI) {
                if (lIIIIllllIIlIIII(ErrorCode.failed(llllllllllllIlllIlllIIlllIllIIlI) ? 1 : 0)) {
                    final String llllllllllllIlllIlllIIlllIllIlII = ErrorCode.getString(llllllllllllIlllIlllIIlllIllIIlI);
                    final BroadcastController this$0 = BroadcastController.this;
                    final String format = BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[13]];
                    final Object[] args = new Object[BroadcastController$1.llIIIIlIIIllII[1]];
                    args[BroadcastController$1.llIIIIlIIIllII[0]] = llllllllllllIlllIlllIIlllIllIlII;
                    this$0.func_152820_d(String.format(format, args));
                }
            }
            
            private static boolean lIIIIllllIIlIIIl(final Object llllllllllllIlllIlllIIllIllllIIl) {
                return llllllllllllIlllIlllIIllIllllIIl != null;
            }
            
            private static boolean lIIIIllllIIlIlII(final int llllllllllllIlllIlllIIllIlllllII, final int llllllllllllIlllIlllIIllIllllIll) {
                return llllllllllllIlllIlllIIllIlllllII < llllllllllllIlllIlllIIllIllllIll;
            }
            
            public void getArchivingStateCallback(final ErrorCode llllllllllllIlllIlllIlIIIIIIlIlI, final ArchivingState llllllllllllIlllIlllIlIIIIIIlIIl) {
                BroadcastController.this.field_152889_y = llllllllllllIlllIlllIlIIIIIIlIIl;
                if (lIIIIllllIIlIIII(ErrorCode.failed(llllllllllllIlllIlllIlIIIIIIlIlI) ? 1 : 0)) {}
            }
            
            public void getGameNameListCallback(final ErrorCode llllllllllllIlllIlllIIllllllIIIl, final GameInfoList llllllllllllIlllIlllIIlllllIlIll) {
                if (lIIIIllllIIlIIII(ErrorCode.failed(llllllllllllIlllIlllIIllllllIIIl) ? 1 : 0)) {
                    final String llllllllllllIlllIlllIIlllllIllll = ErrorCode.getString(llllllllllllIlllIlllIIllllllIIIl);
                    final BroadcastController this$0 = BroadcastController.this;
                    final String format = BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[8]];
                    final Object[] args = new Object[BroadcastController$1.llIIIIlIIIllII[1]];
                    args[BroadcastController$1.llIIIIlIIIllII[0]] = llllllllllllIlllIlllIIlllllIllll;
                    this$0.func_152820_d(String.format(format, args));
                }
                try {
                    if (lIIIIllllIIlIIIl(BroadcastController.this.broadcastListener)) {
                        final BroadcastListener broadcastListener = BroadcastController.this.broadcastListener;
                        GameInfo[] list;
                        if (lIIIIllllIIlIIlI(llllllllllllIlllIlllIIlllllIlIll)) {
                            list = new GameInfo[BroadcastController$1.llIIIIlIIIllII[0]];
                            "".length();
                            if (-" ".length() == ((0x14 ^ 0x1C) & ~(0x5 ^ 0xD))) {
                                return;
                            }
                        }
                        else {
                            list = llllllllllllIlllIlllIIlllllIlIll.list;
                        }
                        broadcastListener.func_152898_a(llllllllllllIlllIlllIIllllllIIIl, list);
                        "".length();
                        if (((((0x73 ^ 0x22) & ~(0xF6 ^ 0xA7)) ^ (0xAF ^ 0xA1)) & (0x1F ^ 0x18 ^ (0x77 ^ 0x7E) ^ -" ".length())) >= " ".length()) {
                            return;
                        }
                    }
                }
                catch (Exception llllllllllllIlllIlllIIlllllIlllI) {
                    BroadcastController.this.func_152820_d(llllllllllllIlllIlllIIlllllIlllI.toString());
                }
            }
            
            public void getUserInfoCallback(final ErrorCode llllllllllllIlllIlllIlIIIIlIIIIl, final UserInfo llllllllllllIlllIlllIlIIIIlIIIII) {
                BroadcastController.this.userInfo = llllllllllllIlllIlllIlIIIIlIIIII;
                if (lIIIIllllIIlIIII(ErrorCode.failed(llllllllllllIlllIlllIlIIIIlIIIIl) ? 1 : 0)) {
                    final String llllllllllllIlllIlllIlIIIIlIIIll = ErrorCode.getString(llllllllllllIlllIlllIlIIIIlIIIIl);
                    final BroadcastController this$0 = BroadcastController.this;
                    final String format = BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[4]];
                    final Object[] args = new Object[BroadcastController$1.llIIIIlIIIllII[1]];
                    args[BroadcastController$1.llIIIIlIIIllII[0]] = llllllllllllIlllIlllIlIIIIlIIIll;
                    this$0.func_152820_d(String.format(format, args));
                }
            }
            
            private static String lIIIIllllIIIlIII(String llllllllllllIlllIlllIIlllIIlIlII, final String llllllllllllIlllIlllIIlllIIlIIll) {
                llllllllllllIlllIlllIIlllIIlIlII = (byte)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIlllIIlllIIlIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIlllIlllIIlllIIlIlll = new StringBuilder();
                final char[] llllllllllllIlllIlllIIlllIIlIllI = llllllllllllIlllIlllIIlllIIlIIll.toCharArray();
                int llllllllllllIlllIlllIIlllIIlIlIl = BroadcastController$1.llIIIIlIIIllII[0];
                final long llllllllllllIlllIlllIIlllIIIllll = (long)(Object)((String)llllllllllllIlllIlllIIlllIIlIlII).toCharArray();
                final boolean llllllllllllIlllIlllIIlllIIIlllI = llllllllllllIlllIlllIIlllIIIllll.length != 0;
                long llllllllllllIlllIlllIIlllIIIllIl = BroadcastController$1.llIIIIlIIIllII[0];
                while (lIIIIllllIIlIlII((int)llllllllllllIlllIlllIIlllIIIllIl, llllllllllllIlllIlllIIlllIIIlllI ? 1 : 0)) {
                    final char llllllllllllIlllIlllIIlllIIllIlI = llllllllllllIlllIlllIIlllIIIllll[llllllllllllIlllIlllIIlllIIIllIl];
                    llllllllllllIlllIlllIIlllIIlIlll.append((char)(llllllllllllIlllIlllIIlllIIllIlI ^ llllllllllllIlllIlllIIlllIIlIllI[llllllllllllIlllIlllIIlllIIlIlIl % llllllllllllIlllIlllIIlllIIlIllI.length]));
                    "".length();
                    ++llllllllllllIlllIlllIIlllIIlIlIl;
                    ++llllllllllllIlllIlllIIlllIIIllIl;
                    "".length();
                    if ((145 + 47 - 141 + 107 ^ 33 + 62 + 10 + 49) != (0xD3 ^ 0xB8 ^ (0xFE ^ 0x91))) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIlllIlllIIlllIIlIlll);
            }
            
            public void sendStartSpanMetaDataCallback(final ErrorCode llllllllllllIlllIlllIIlllIlllIll) {
                if (lIIIIllllIIlIIII(ErrorCode.failed(llllllllllllIlllIlllIIlllIlllIll) ? 1 : 0)) {
                    final String llllllllllllIlllIlllIIlllIllllIl = ErrorCode.getString(llllllllllllIlllIlllIIlllIlllIll);
                    final BroadcastController this$0 = BroadcastController.this;
                    final String format = BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[12]];
                    final Object[] args = new Object[BroadcastController$1.llIIIIlIIIllII[1]];
                    args[BroadcastController$1.llIIIIlIIIllII[0]] = llllllllllllIlllIlllIIlllIllllIl;
                    this$0.func_152820_d(String.format(format, args));
                }
            }
            
            static {
                lIIIIllllIIIllll();
                lIIIIllllIIIlIlI();
            }
            
            public void setStreamInfoCallback(final ErrorCode llllllllllllIlllIlllIIlllllllIII) {
                if (lIIIIllllIIlIIII(ErrorCode.failed(llllllllllllIlllIlllIIlllllllIII) ? 1 : 0)) {
                    final String llllllllllllIlllIlllIIlllllllIlI = ErrorCode.getString(llllllllllllIlllIlllIIlllllllIII);
                    final BroadcastController this$0 = BroadcastController.this;
                    final String format = BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[7]];
                    final Object[] args = new Object[BroadcastController$1.llIIIIlIIIllII[1]];
                    args[BroadcastController$1.llIIIIlIIIllII[0]] = llllllllllllIlllIlllIIlllllllIlI;
                    this$0.func_152832_e(String.format(format, args));
                }
            }
            
            public void getStreamInfoCallback(final ErrorCode llllllllllllIlllIlllIlIIIIIllIIl, final StreamInfo llllllllllllIlllIlllIlIIIIIllIII) {
                if (lIIIIllllIIlIIII(ErrorCode.succeeded(llllllllllllIlllIlllIlIIIIIllIIl) ? 1 : 0)) {
                    BroadcastController.this.streamInfo = llllllllllllIlllIlllIlIIIIIllIII;
                    try {
                        if (!lIIIIllllIIlIIIl(BroadcastController.this.broadcastListener)) {
                            return;
                        }
                        BroadcastController.this.broadcastListener.func_152894_a(llllllllllllIlllIlllIlIIIIIllIII);
                        "".length();
                        if (" ".length() != " ".length()) {
                            return;
                        }
                        return;
                    }
                    catch (Exception llllllllllllIlllIlllIlIIIIIlIlll) {
                        BroadcastController.this.func_152820_d(llllllllllllIlllIlllIlIIIIIlIlll.toString());
                        "".length();
                        if ((164 + 21 - 124 + 129 ^ 51 + 111 - 146 + 170) <= "   ".length()) {
                            return;
                        }
                        return;
                    }
                }
                final String llllllllllllIlllIlllIlIIIIIlIllI = ErrorCode.getString(llllllllllllIlllIlllIlIIIIIllIIl);
                final BroadcastController this$0 = BroadcastController.this;
                final String format = BroadcastController$1.llIIIIIlllllII[BroadcastController$1.llIIIIlIIIllII[5]];
                final Object[] args = new Object[BroadcastController$1.llIIIIlIIIllII[1]];
                args[BroadcastController$1.llIIIIlIIIllII[0]] = llllllllllllIlllIlllIlIIIIIlIllI;
                this$0.func_152832_e(String.format(format, args));
            }
            
            private static void lIIIIllllIIIllll() {
                (llIIIIlIIIllII = new int[15])[0] = ((162 + 22 - 109 + 96 ^ 83 + 3 + 44 + 16) & (0x55 ^ 0x1C ^ (0xDB ^ 0xAB) ^ -" ".length()));
                BroadcastController$1.llIIIIlIIIllII[1] = " ".length();
                BroadcastController$1.llIIIIlIIIllII[2] = "  ".length();
                BroadcastController$1.llIIIIlIIIllII[3] = "   ".length();
                BroadcastController$1.llIIIIlIIIllII[4] = (0xE ^ 0x31 ^ (0xAE ^ 0x95));
                BroadcastController$1.llIIIIlIIIllII[5] = (27 + 71 + 14 + 69 ^ 116 + 140 - 191 + 111);
                BroadcastController$1.llIIIIlIIIllII[6] = (0x6 ^ 0x0 ^ ((0x9D ^ 0x8D) & ~(0x19 ^ 0x9)));
                BroadcastController$1.llIIIIlIIIllII[7] = (0x4 ^ 0x3);
                BroadcastController$1.llIIIIlIIIllII[8] = (0x36 ^ 0x3E);
                BroadcastController$1.llIIIIlIIIllII[9] = (0x2E ^ 0x27);
                BroadcastController$1.llIIIIlIIIllII[10] = (74 + 109 - 42 + 24 ^ 12 + 81 + 23 + 59);
                BroadcastController$1.llIIIIlIIIllII[11] = (0x97 ^ 0xA2 ^ (0x1B ^ 0x25));
                BroadcastController$1.llIIIIlIIIllII[12] = (0x5D ^ 0x50 ^ " ".length());
                BroadcastController$1.llIIIIlIIIllII[13] = (0x6 ^ 0x1F ^ (0x84 ^ 0x90));
                BroadcastController$1.llIIIIlIIIllII[14] = (0xCA ^ 0xC4);
            }
        };
        this.field_177949_C = (IStatCallbacks)new IStatCallbacks() {
            public void statCallback(final StatType llllllllllllIlllIllllIlIIIllIIll, final long llllllllllllIlllIllllIlIIIllIIlI) {
            }
        };
        this.field_152872_h = Core.getInstance();
        if (lIIllIllllIlIIII(Core.getInstance())) {
            this.field_152872_h = new Core((CoreAPI)new StandardCoreAPI());
        }
        this.field_152873_i = new Stream((StreamAPI)new DesktopStreamAPI());
    }
    
    private static boolean lIIllIllllIlIIIl(final int llllllllllllIllIIIlIIlIIIIIIIllI) {
        return llllllllllllIllIIIlIIlIIIIIIIllI != 0;
    }
    
    private static boolean lIIllIllllIIllll(final Object llllllllllllIllIIIlIIlIIIIIIllIl, final Object llllllllllllIllIIIlIIlIIIIIIllII) {
        return llllllllllllIllIIIlIIlIIIIIIllIl == llllllllllllIllIIIlIIlIIIIIIllII;
    }
    
    protected void func_152820_d(final String llllllllllllIllIIIlIIlIIIlIlIlII) {
        this.field_152863_D = llllllllllllIllIIIlIIlIIIlIlIlII;
        BroadcastController.field_152862_C.func_152757_a(String.valueOf(new StringBuilder(BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[33]]).append(llllllllllllIllIIIlIIlIIIlIlIlII)));
        "".length();
        final Logger logger = BroadcastController.logger;
        final Marker stream_MARKER = TwitchStream.STREAM_MARKER;
        final String s = BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[34]];
        final Object[] array = new Object[BroadcastController.lllIIIIIIIIIlI[2]];
        array[BroadcastController.lllIIIIIIIIIlI[1]] = llllllllllllIllIIIlIIlIIIlIlIlII;
        logger.error(stream_MARKER, s, array);
    }
    
    private static void lIIllIllllIIllIl() {
        (lllIIIIIIIIIlI = new int[38])[0] = (0x4C ^ 0x6D ^ (0x4B ^ 0x58));
        BroadcastController.lllIIIIIIIIIlI[1] = ((0x18 ^ 0x50) & ~(0x27 ^ 0x6F));
        BroadcastController.lllIIIIIIIIIlI[2] = " ".length();
        BroadcastController.lllIIIIIIIIIlI[3] = (0x47 ^ 0x49 ^ (0xBA ^ 0xAA));
        BroadcastController.lllIIIIIIIIIlI[4] = "   ".length();
        BroadcastController.lllIIIIIIIIIlI[5] = "  ".length();
        BroadcastController.lllIIIIIIIIIlI[6] = (0x1F ^ 0x1B);
        BroadcastController.lllIIIIIIIIIlI[7] = (76 + 80 - 122 + 115 ^ 89 + 58 - 78 + 75);
        BroadcastController.lllIIIIIIIIIlI[8] = (0x77 ^ 0x28 ^ (0x61 ^ 0x38));
        BroadcastController.lllIIIIIIIIIlI[9] = (0x19 ^ 0x3E ^ (0x4A ^ 0x6A));
        BroadcastController.lllIIIIIIIIIlI[10] = (0xCC ^ 0xC4);
        BroadcastController.lllIIIIIIIIIlI[11] = (149 + 114 - 133 + 76 ^ 32 + 114 + 20 + 33);
        BroadcastController.lllIIIIIIIIIlI[12] = (0x89 ^ 0xA2 ^ (0x7F ^ 0x5E));
        BroadcastController.lllIIIIIIIIIlI[13] = (0x37 ^ 0x3C);
        BroadcastController.lllIIIIIIIIIlI[14] = (23 + 35 + 71 + 8 ^ 0 + 42 - 33 + 124);
        BroadcastController.lllIIIIIIIIIlI[15] = (0x88 ^ 0x85);
        BroadcastController.lllIIIIIIIIIlI[16] = (19 + 109 - 125 + 188 ^ 124 + 7 - 7 + 53);
        BroadcastController.lllIIIIIIIIIlI[17] = (0x42 ^ 0x7D ^ (0x8F ^ 0xBF));
        BroadcastController.lllIIIIIIIIIlI[18] = (0x4B ^ 0x5B);
        BroadcastController.lllIIIIIIIIIlI[19] = (0xAD ^ 0x83 ^ (0xFE ^ 0xC1));
        BroadcastController.lllIIIIIIIIIlI[20] = (0x47 ^ 0x55);
        BroadcastController.lllIIIIIIIIIlI[21] = (0x54 ^ 0x47);
        BroadcastController.lllIIIIIIIIIlI[22] = (0x8A ^ 0x9E);
        BroadcastController.lllIIIIIIIIIlI[23] = (0x39 ^ 0x4C ^ (0xA5 ^ 0xC5));
        BroadcastController.lllIIIIIIIIIlI[24] = (0x6A ^ 0x7C);
        BroadcastController.lllIIIIIIIIIlI[25] = (0x94 ^ 0x83);
        BroadcastController.lllIIIIIIIIIlI[26] = (0x7A ^ 0x57 ^ (0x67 ^ 0x52));
        BroadcastController.lllIIIIIIIIIlI[27] = (0x87 ^ 0x9E);
        BroadcastController.lllIIIIIIIIIlI[28] = (0x2F ^ 0x19 ^ (0xED ^ 0xC1));
        BroadcastController.lllIIIIIIIIIlI[29] = (0x80 ^ 0x89 ^ (0x29 ^ 0x3B));
        BroadcastController.lllIIIIIIIIIlI[30] = (0xD7 ^ 0xBF ^ (0x39 ^ 0x4D));
        BroadcastController.lllIIIIIIIIIlI[31] = (0xA8 ^ 0xB5);
        BroadcastController.lllIIIIIIIIIlI[32] = (0x88 ^ 0xAD ^ (0xB5 ^ 0x8F));
        BroadcastController.lllIIIIIIIIIlI[33] = (0xA8 ^ 0x88);
        BroadcastController.lllIIIIIIIIIlI[34] = (0x2B ^ 0xA);
        BroadcastController.lllIIIIIIIIIlI[35] = (0x27 ^ 0x5);
        BroadcastController.lllIIIIIIIIIlI[36] = (0xF ^ 0x2C);
        BroadcastController.lllIIIIIIIIIlI[37] = (0x3B ^ 0x2F ^ (0x46 ^ 0x76));
    }
    
    protected void func_152827_a(final BroadcastState llllllllllllIllIIIlIIlIIlIllIIlI) {
        if (lIIllIllllIIlllI(llllllllllllIllIIIlIIlIIlIllIIlI, this.broadcastState)) {
            this.broadcastState = llllllllllllIllIIIlIIlIIlIllIIlI;
            try {
                if (lIIllIllllIlIIll(this.broadcastListener)) {
                    this.broadcastListener.func_152891_a(llllllllllllIllIIIlIIlIIlIllIIlI);
                    "".length();
                    if ("  ".length() < 0) {
                        return;
                    }
                }
            }
            catch (Exception llllllllllllIllIIIlIIlIIlIllIlII) {
                this.func_152820_d(llllllllllllIllIIIlIIlIIlIllIlII.toString());
            }
        }
    }
    
    public IngestList func_152855_t() {
        return this.ingestList;
    }
    
    protected void func_152832_e(final String llllllllllllIllIIIlIIlIIIlIlIIII) {
        BroadcastController.field_152862_C.func_152757_a(String.valueOf(new StringBuilder(BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[35]]).append(llllllllllllIllIIIlIIlIIIlIlIIII)));
        "".length();
        final Logger logger = BroadcastController.logger;
        final Marker stream_MARKER = TwitchStream.STREAM_MARKER;
        final String s = BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[36]];
        final Object[] array = new Object[BroadcastController.lllIIIIIIIIIlI[2]];
        array[BroadcastController.lllIIIIIIIIIlI[1]] = llllllllllllIllIIIlIIlIIIlIlIIII;
        logger.warn(stream_MARKER, s, array);
    }
    
    private static boolean lIIllIllllIlIIlI(final int llllllllllllIllIIIlIIlIIIIIIIlII) {
        return llllllllllllIllIIIlIIlIIIIIIIlII == 0;
    }
    
    private static boolean lIIllIllllIllIIl(final int llllllllllllIllIIIlIIlIIIIIlIlIl, final int llllllllllllIllIIIlIIlIIIIIlIlII) {
        return llllllllllllIllIIIlIIlIIIIIlIlIl < llllllllllllIllIIIlIIlIIIIIlIlII;
    }
    
    public boolean isBroadcasting() {
        if (lIIllIllllIIlllI(this.broadcastState, BroadcastState.Broadcasting) && lIIllIllllIIlllI(this.broadcastState, BroadcastState.Paused)) {
            return BroadcastController.lllIIIIIIIIIlI[1] != 0;
        }
        return BroadcastController.lllIIIIIIIIIlI[2] != 0;
    }
    
    public FrameBuffer func_152822_N() {
        if (lIIllIllllIlIIlI(this.field_152875_k.size())) {
            this.func_152820_d(String.format(BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[25]], new Object[BroadcastController.lllIIIIIIIIIlI[1]]));
            return null;
        }
        final FrameBuffer llllllllllllIllIIIlIIlIIIlllllIl = this.field_152875_k.get(this.field_152875_k.size() - BroadcastController.lllIIIIIIIIIlI[2]);
        this.field_152875_k.remove(this.field_152875_k.size() - BroadcastController.lllIIIIIIIIIlI[2]);
        "".length();
        return llllllllllllIllIIIlIIlIIIlllllIl;
    }
    
    public void func_152821_H() {
        if (lIIllIllllIlIIll(this.field_152873_i) && lIIllIllllIlIIIl(this.field_152876_l ? 1 : 0)) {
            ErrorCode llllllllllllIllIIIlIIlIIlIlIllII = this.field_152873_i.pollTasks();
            this.func_152853_a(llllllllllllIllIIIlIIlIIlIlIllII);
            "".length();
            if (lIIllIllllIlIIIl(this.isIngestTesting() ? 1 : 0)) {
                this.field_152860_A.func_153041_j();
                if (lIIllIllllIlIIIl(this.field_152860_A.func_153032_e() ? 1 : 0)) {
                    this.field_152860_A = null;
                    this.func_152827_a(BroadcastState.ReadyToBroadcast);
                }
            }
            switch ($SWITCH_TABLE$net$minecraft$client$stream$BroadcastController$BroadcastState()[this.broadcastState.ordinal()]) {
                case 4: {
                    this.func_152827_a(BroadcastState.LoggingIn);
                    llllllllllllIllIIIlIIlIIlIlIllII = this.field_152873_i.login(this.authenticationToken);
                    if (!lIIllIllllIlIIIl(ErrorCode.failed(llllllllllllIllIIIlIIlIIlIlIllII) ? 1 : 0)) {
                        return;
                    }
                    final String llllllllllllIllIIIlIIlIIlIlIlIll = ErrorCode.getString(llllllllllllIllIIIlIIlIIlIlIllII);
                    final String format = BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[19]];
                    final Object[] args = new Object[BroadcastController.lllIIIIIIIIIlI[2]];
                    args[BroadcastController.lllIIIIIIIIIlI[1]] = llllllllllllIllIIIlIIlIIlIlIlIll;
                    this.func_152820_d(String.format(format, args));
                    "".length();
                    if ("  ".length() > "   ".length()) {
                        return;
                    }
                    return;
                }
                case 6: {
                    this.func_152827_a(BroadcastState.FindingIngestServer);
                    llllllllllllIllIIIlIIlIIlIlIllII = this.field_152873_i.getIngestServers(this.authenticationToken);
                    if (!lIIllIllllIlIIIl(ErrorCode.failed(llllllllllllIllIIIlIIlIIlIlIllII) ? 1 : 0)) {
                        return;
                    }
                    this.func_152827_a(BroadcastState.LoggedIn);
                    final String llllllllllllIllIIIlIIlIIlIlIlIlI = ErrorCode.getString(llllllllllllIllIIIlIIlIIlIlIllII);
                    final String format2 = BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[20]];
                    final Object[] args2 = new Object[BroadcastController.lllIIIIIIIIIlI[2]];
                    args2[BroadcastController.lllIIIIIIIIIlI[1]] = llllllllllllIllIIIlIIlIIlIlIlIlI;
                    this.func_152820_d(String.format(format2, args2));
                    "".length();
                    if (null != null) {
                        return;
                    }
                    return;
                }
                case 8: {
                    this.func_152827_a(BroadcastState.ReadyToBroadcast);
                    llllllllllllIllIIIlIIlIIlIlIllII = this.field_152873_i.getUserInfo(this.authenticationToken);
                    if (lIIllIllllIlIIIl(ErrorCode.failed(llllllllllllIllIIIlIIlIIlIlIllII) ? 1 : 0)) {
                        final String llllllllllllIllIIIlIIlIIlIlIlIIl = ErrorCode.getString(llllllllllllIllIIIlIIlIIlIlIllII);
                        final String format3 = BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[21]];
                        final Object[] args3 = new Object[BroadcastController.lllIIIIIIIIIlI[2]];
                        args3[BroadcastController.lllIIIIIIIIIlI[1]] = llllllllllllIllIIIlIIlIIlIlIlIIl;
                        this.func_152820_d(String.format(format3, args3));
                    }
                    this.func_152835_I();
                    llllllllllllIllIIIlIIlIIlIlIllII = this.field_152873_i.getArchivingState(this.authenticationToken);
                    if (lIIllIllllIlIIIl(ErrorCode.failed(llllllllllllIllIIIlIIlIIlIlIllII) ? 1 : 0)) {
                        final String llllllllllllIllIIIlIIlIIlIlIlIII = ErrorCode.getString(llllllllllllIllIIIlIIlIIlIlIllII);
                        final String format4 = BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[22]];
                        final Object[] args4 = new Object[BroadcastController.lllIIIIIIIIIlI[2]];
                        args4[BroadcastController.lllIIIIIIIIIlI[1]] = llllllllllllIllIIIlIIlIIlIlIlIII;
                        this.func_152820_d(String.format(format4, args4));
                        break;
                    }
                    return;
                }
                case 11:
                case 13: {
                    this.func_152835_I();
                    return;
                }
            }
            "".length();
            if (-" ".length() == ((0xFF ^ 0xC7) & ~(0x1F ^ 0x27))) {
                return;
            }
        }
    }
    
    public boolean stopBroadcasting() {
        if (lIIllIllllIlIIlI(this.isBroadcasting() ? 1 : 0)) {
            return BroadcastController.lllIIIIIIIIIlI[1] != 0;
        }
        final ErrorCode llllllllllllIllIIIlIIlIlIIIIlIIl = this.field_152873_i.stop((boolean)(BroadcastController.lllIIIIIIIIIlI[2] != 0));
        if (lIIllIllllIlIIIl(ErrorCode.failed(llllllllllllIllIIIlIIlIlIIIIlIIl) ? 1 : 0)) {
            final String llllllllllllIllIIIlIIlIlIIIIlIII = ErrorCode.getString(llllllllllllIllIIIlIIlIlIIIIlIIl);
            final String format = BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[13]];
            final Object[] args = new Object[BroadcastController.lllIIIIIIIIIlI[2]];
            args[BroadcastController.lllIIIIIIIIIlI[1]] = llllllllllllIllIIIlIIlIlIIIIlIII;
            this.func_152820_d(String.format(format, args));
            return BroadcastController.lllIIIIIIIIIlI[1] != 0;
        }
        this.func_152827_a(BroadcastState.Stopping);
        return ErrorCode.succeeded(llllllllllllIllIIIlIIlIlIIIIlIIl);
    }
    
    private static int lIIllIllllIlIlIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public long func_177946_b(final String llllllllllllIllIIIlIIlIIllIlIllI, final long llllllllllllIllIIIlIIlIIllIlIlIl, final String llllllllllllIllIIIlIIlIIllIlIlII, final String llllllllllllIllIIIlIIlIIllIllIIl) {
        final long llllllllllllIllIIIlIIlIIllIllIII = this.field_152873_i.sendStartSpanMetaData(this.authenticationToken, llllllllllllIllIIIlIIlIIllIlIllI, llllllllllllIllIIIlIIlIIllIlIlIl, llllllllllllIllIIIlIIlIIllIlIlII, llllllllllllIllIIIlIIlIIllIllIIl);
        if (lIIllIllllIlIIlI(lIIllIllllIlIlII(llllllllllllIllIIIlIIlIIllIllIII, -1L))) {
            this.func_152820_d(String.format(BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[16]], new Object[BroadcastController.lllIIIIIIIIIlI[1]]));
        }
        return llllllllllllIllIIIlIIlIIllIllIII;
    }
    
    public boolean func_152836_a(final VideoParams llllllllllllIllIIIlIIlIlIIIlIIII) {
        if (!lIIllIllllIlIIll(llllllllllllIllIIIlIIlIlIIIlIIII) || !lIIllIllllIlIIIl(this.isReadyToBroadcast() ? 1 : 0)) {
            return BroadcastController.lllIIIIIIIIIlI[1] != 0;
        }
        this.videoParamaters = llllllllllllIllIIIlIIlIlIIIlIIII.clone();
        this.audioParamaters = new AudioParams();
        final AudioParams audioParamaters = this.audioParamaters;
        int audioEnabled;
        if (lIIllIllllIlIIIl(this.field_152871_g ? 1 : 0) && lIIllIllllIlIIIl(this.func_152848_y() ? 1 : 0)) {
            audioEnabled = BroadcastController.lllIIIIIIIIIlI[2];
            "".length();
            if (-(0x24 ^ 0x20) > 0) {
                return ("   ".length() & ~"   ".length()) != 0x0;
            }
        }
        else {
            audioEnabled = BroadcastController.lllIIIIIIIIIlI[1];
        }
        audioParamaters.audioEnabled = (audioEnabled != 0);
        this.audioParamaters.enableMicCapture = this.audioParamaters.audioEnabled;
        this.audioParamaters.enablePlaybackCapture = this.audioParamaters.audioEnabled;
        this.audioParamaters.enablePassthroughAudio = (BroadcastController.lllIIIIIIIIIlI[1] != 0);
        if (lIIllIllllIlIIlI(this.func_152823_L() ? 1 : 0)) {
            this.videoParamaters = null;
            this.audioParamaters = null;
            return BroadcastController.lllIIIIIIIIIlI[1] != 0;
        }
        final ErrorCode llllllllllllIllIIIlIIlIlIIIlIIll = this.field_152873_i.start(llllllllllllIllIIIlIIlIlIIIlIIII, this.audioParamaters, this.field_152884_t, StartFlags.None, (boolean)(BroadcastController.lllIIIIIIIIIlI[2] != 0));
        if (lIIllIllllIlIIIl(ErrorCode.failed(llllllllllllIllIIIlIIlIlIIIlIIll) ? 1 : 0)) {
            this.func_152831_M();
            final String llllllllllllIllIIIlIIlIlIIIlIIlI = ErrorCode.getString(llllllllllllIllIIIlIIlIlIIIlIIll);
            final String format = BroadcastController.llIlllllllllll[BroadcastController.lllIIIIIIIIIlI[12]];
            final Object[] args = new Object[BroadcastController.lllIIIIIIIIIlI[2]];
            args[BroadcastController.lllIIIIIIIIIlI[1]] = llllllllllllIllIIIlIIlIlIIIlIIlI;
            this.func_152820_d(String.format(format, args));
            this.videoParamaters = null;
            this.audioParamaters = null;
            return BroadcastController.lllIIIIIIIIIlI[1] != 0;
        }
        this.func_152827_a(BroadcastState.Starting);
        return BroadcastController.lllIIIIIIIIIlI[2] != 0;
    }
    
    public ChannelInfo getChannelInfo() {
        return this.channelInfo;
    }
    
    private static int lIIllIllllIlIllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIIllIllllIlIIII(final Object llllllllllllIllIIIlIIlIIIIIIlIII) {
        return llllllllllllIllIIIlIIlIIIIIIlIII == null;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$client$stream$BroadcastController$BroadcastState() {
        final int[] $switch_TABLE$net$minecraft$client$stream$BroadcastController$BroadcastState = BroadcastController.$SWITCH_TABLE$net$minecraft$client$stream$BroadcastController$BroadcastState;
        if (lIIllIllllIlIIll($switch_TABLE$net$minecraft$client$stream$BroadcastController$BroadcastState)) {
            return $switch_TABLE$net$minecraft$client$stream$BroadcastController$BroadcastState;
        }
        "".length();
        final double llllllllllllIllIIIlIIlIIIlIIlllI = (Object)new int[BroadcastState.values().length];
        try {
            llllllllllllIllIIIlIIlIIIlIIlllI[BroadcastState.Authenticated.ordinal()] = BroadcastController.lllIIIIIIIIIlI[6];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIllIIIlIIlIIIlIIlllI[BroadcastState.Authenticating.ordinal()] = BroadcastController.lllIIIIIIIIIlI[4];
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIllIIIlIIlIIIlIIlllI[BroadcastState.Broadcasting.ordinal()] = BroadcastController.lllIIIIIIIIIlI[13];
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIllIIIlIIlIIIlIIlllI[BroadcastState.FindingIngestServer.ordinal()] = BroadcastController.lllIIIIIIIIIlI[9];
            "".length();
            if (-" ".length() >= "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            llllllllllllIllIIIlIIlIIIlIIlllI[BroadcastState.IngestTesting.ordinal()] = BroadcastController.lllIIIIIIIIIlI[16];
            "".length();
            if ("  ".length() == "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            llllllllllllIllIIIlIIlIIIlIIlllI[BroadcastState.Initialized.ordinal()] = BroadcastController.lllIIIIIIIIIlI[5];
            "".length();
            if ("  ".length() <= " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        try {
            llllllllllllIllIIIlIIlIIIlIIlllI[BroadcastState.LoggedIn.ordinal()] = BroadcastController.lllIIIIIIIIIlI[8];
            "".length();
            if (((56 + 25 + 95 + 35 ^ 71 + 34 + 20 + 54) & (127 + 73 - 111 + 75 ^ 161 + 159 - 187 + 63 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError7) {
            "".length();
        }
        try {
            llllllllllllIllIIIlIIlIIIlIIlllI[BroadcastState.LoggingIn.ordinal()] = BroadcastController.lllIIIIIIIIIlI[7];
            "".length();
            if ((0x9F ^ 0x9B) < " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError8) {
            "".length();
        }
        try {
            llllllllllllIllIIIlIIlIIIlIIlllI[BroadcastState.Paused.ordinal()] = BroadcastController.lllIIIIIIIIIlI[15];
            "".length();
            if (((101 + 162 - 194 + 105 ^ 146 + 123 - 176 + 89) & (0x1C ^ 0x7C ^ (0x28 ^ 0x50) ^ -" ".length())) > "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError9) {
            "".length();
        }
        try {
            llllllllllllIllIIIlIIlIIIlIIlllI[BroadcastState.ReadyToBroadcast.ordinal()] = BroadcastController.lllIIIIIIIIIlI[11];
            "".length();
            if (((0x59 ^ 0x54) & ~(0x42 ^ 0x4F)) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError10) {
            "".length();
        }
        try {
            llllllllllllIllIIIlIIlIIIlIIlllI[BroadcastState.ReceivedIngestServers.ordinal()] = BroadcastController.lllIIIIIIIIIlI[10];
            "".length();
            if ("  ".length() >= (0x3C ^ 0x38)) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError11) {
            "".length();
        }
        try {
            llllllllllllIllIIIlIIlIIIlIIlllI[BroadcastState.Starting.ordinal()] = BroadcastController.lllIIIIIIIIIlI[12];
            "".length();
            if ((0x58 ^ 0x5C) != (0x2C ^ 0x28)) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError12) {
            "".length();
        }
        try {
            llllllllllllIllIIIlIIlIIIlIIlllI[BroadcastState.Stopping.ordinal()] = BroadcastController.lllIIIIIIIIIlI[14];
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError13) {
            "".length();
        }
        try {
            llllllllllllIllIIIlIIlIIIlIIlllI[BroadcastState.Uninitialized.ordinal()] = BroadcastController.lllIIIIIIIIIlI[2];
            "".length();
            if ("  ".length() >= (0x10 ^ 0x5F ^ (0x21 ^ 0x6A))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError14) {
            "".length();
        }
        return BroadcastController.$SWITCH_TABLE$net$minecraft$client$stream$BroadcastController$BroadcastState = (int[])(Object)llllllllllllIllIIIlIIlIIIlIIlllI;
    }
    
    protected boolean func_152853_a(final ErrorCode llllllllllllIllIIIlIIlIIIlIlllII) {
        if (lIIllIllllIlIIIl(ErrorCode.failed(llllllllllllIllIIIlIIlIIIlIlllII) ? 1 : 0)) {
            this.func_152820_d(ErrorCode.getString(llllllllllllIllIIIlIIlIIIlIlllII));
            return BroadcastController.lllIIIIIIIIIlI[1] != 0;
        }
        return BroadcastController.lllIIIIIIIIIlI[2] != 0;
    }
    
    public enum BroadcastState
    {
        private static final /* synthetic */ int[] lIIIIIllIIIlII;
        
        IngestTesting(BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[13]], BroadcastState.lIIIIIllIIIlII[13]), 
        Starting(BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[9]], BroadcastState.lIIIIIllIIIlII[9]), 
        Paused(BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[12]], BroadcastState.lIIIIIllIIIlII[12]), 
        LoggingIn(BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[4]], BroadcastState.lIIIIIllIIIlII[4]), 
        Stopping(BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[11]], BroadcastState.lIIIIIllIIIlII[11]), 
        LoggedIn(BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[5]], BroadcastState.lIIIIIllIIIlII[5]), 
        FindingIngestServer(BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[6]], BroadcastState.lIIIIIllIIIlII[6]), 
        Authenticating(BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[2]], BroadcastState.lIIIIIllIIIlII[2]);
        
        private static final /* synthetic */ String[] lIIIIIllIIIIll;
        
        ReceivedIngestServers(BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[7]], BroadcastState.lIIIIIllIIIlII[7]), 
        Broadcasting(BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[10]], BroadcastState.lIIIIIllIIIlII[10]), 
        Initialized(BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[1]], BroadcastState.lIIIIIllIIIlII[1]), 
        Authenticated(BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[3]], BroadcastState.lIIIIIllIIIlII[3]), 
        Uninitialized(BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[0]], BroadcastState.lIIIIIllIIIlII[0]), 
        ReadyToBroadcast(BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[8]], BroadcastState.lIIIIIllIIIlII[8]);
        
        private static String lIllIllIlllIIlI(final String lllllllllllllIlIIlllIIIIIIIlIlll, final String lllllllllllllIlIIlllIIIIIIIlIlII) {
            try {
                final SecretKeySpec lllllllllllllIlIIlllIIIIIIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlllIIIIIIIlIlII.getBytes(StandardCharsets.UTF_8)), BroadcastState.lIIIIIllIIIlII[8]), "DES");
                final Cipher lllllllllllllIlIIlllIIIIIIIllIIl = Cipher.getInstance("DES");
                lllllllllllllIlIIlllIIIIIIIllIIl.init(BroadcastState.lIIIIIllIIIlII[2], lllllllllllllIlIIlllIIIIIIIllIlI);
                return new String(lllllllllllllIlIIlllIIIIIIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlllIIIIIIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIlllIIIIIIIllIII) {
                lllllllllllllIlIIlllIIIIIIIllIII.printStackTrace();
                return null;
            }
        }
        
        private static String lIllIllIlllIIIl(final String lllllllllllllIlIIlllIIIIIIlIIIlI, final String lllllllllllllIlIIlllIIIIIIlIIIll) {
            try {
                final SecretKeySpec lllllllllllllIlIIlllIIIIIIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlllIIIIIIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIIlllIIIIIIlIIllI = Cipher.getInstance("Blowfish");
                lllllllllllllIlIIlllIIIIIIlIIllI.init(BroadcastState.lIIIIIllIIIlII[2], lllllllllllllIlIIlllIIIIIIlIIlll);
                return new String(lllllllllllllIlIIlllIIIIIIlIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlllIIIIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIlllIIIIIIlIIlIl) {
                lllllllllllllIlIIlllIIIIIIlIIlIl.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIllIllIlllIlIl(final int lllllllllllllIlIIlllIIIIIIIIllll, final int lllllllllllllIlIIlllIIIIIIIIlllI) {
            return lllllllllllllIlIIlllIIIIIIIIllll < lllllllllllllIlIIlllIIIIIIIIlllI;
        }
        
        private static void lIllIllIlllIIll() {
            (lIIIIIllIIIIll = new String[BroadcastState.lIIIIIllIIIlII[14]])[BroadcastState.lIIIIIllIIIlII[0]] = lIllIllIlllIIII("Jx0uIyoGGiYhKggWIw==", "rsGMC");
            BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[1]] = lIllIllIlllIIIl("r/mBcjNYsz0q2rBbVCxRqg==", "noEGh");
            BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[2]] = lIllIllIlllIIII("GBAXAAE3EQoLBS0MDQ8=", "Yechd");
            BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[3]] = lIllIllIlllIIII("KC0+AjwHLCMJOB09Lg==", "iXJjY");
            BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[4]] = lIllIllIlllIIlI("Cc0J9zUnHSgXPjpFNLB+PQ==", "mrsmk");
            BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[5]] = lIllIllIlllIIlI("Xej7rDCrzckzCyXtFO3RtQ==", "xvKsF");
            BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[6]] = lIllIllIlllIIlI("kBqWLKJK+uBu1eS2yB8ZcGbqK54bURLt", "Zcamw");
            BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[7]] = lIllIllIlllIIII("AxErCTgnESwlPzYROxgCNAY+CSMi", "QtHlQ");
            BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[8]] = lIllIllIlllIIII("BxAFEhcBGiYEATQRBxcdIQ==", "Uudvn");
            BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[9]] = lIllIllIlllIIII("OjEEPz8AKwI=", "iEeMK");
            BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[10]] = lIllIllIlllIIIl("K4INLCtpEXKuIqYEU+itTg==", "LqOVR");
            BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[11]] = lIllIllIlllIIII("ASMOORE7OQY=", "RWaIa");
            BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[12]] = lIllIllIlllIIII("OCAUNDIM", "hAaGW");
            BroadcastState.lIIIIIllIIIIll[BroadcastState.lIIIIIllIIIlII[13]] = lIllIllIlllIIlI("ghW5CNUqZgHfInqFjduySQ==", "QbYWc");
        }
        
        private static String lIllIllIlllIIII(String lllllllllllllIlIIlllIIIIIIllIlII, final String lllllllllllllIlIIlllIIIIIIlllIII) {
            lllllllllllllIlIIlllIIIIIIllIlII = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIlllIIIIIIllIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIIlllIIIIIIllIlll = new StringBuilder();
            final char[] lllllllllllllIlIIlllIIIIIIllIllI = lllllllllllllIlIIlllIIIIIIlllIII.toCharArray();
            int lllllllllllllIlIIlllIIIIIIllIlIl = BroadcastState.lIIIIIllIIIlII[0];
            final long lllllllllllllIlIIlllIIIIIIlIllll = (Object)((String)lllllllllllllIlIIlllIIIIIIllIlII).toCharArray();
            final short lllllllllllllIlIIlllIIIIIIlIlllI = (short)lllllllllllllIlIIlllIIIIIIlIllll.length;
            String lllllllllllllIlIIlllIIIIIIlIllIl = (String)BroadcastState.lIIIIIllIIIlII[0];
            while (lIllIllIlllIlIl((int)lllllllllllllIlIIlllIIIIIIlIllIl, lllllllllllllIlIIlllIIIIIIlIlllI)) {
                final char lllllllllllllIlIIlllIIIIIIlllIlI = lllllllllllllIlIIlllIIIIIIlIllll[lllllllllllllIlIIlllIIIIIIlIllIl];
                lllllllllllllIlIIlllIIIIIIllIlll.append((char)(lllllllllllllIlIIlllIIIIIIlllIlI ^ lllllllllllllIlIIlllIIIIIIllIllI[lllllllllllllIlIIlllIIIIIIllIlIl % lllllllllllllIlIIlllIIIIIIllIllI.length]));
                "".length();
                ++lllllllllllllIlIIlllIIIIIIllIlIl;
                ++lllllllllllllIlIIlllIIIIIIlIllIl;
                "".length();
                if (((0xDF ^ 0xBF) & ~(0xA2 ^ 0xC2)) != 0x0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIIlllIIIIIIllIlll);
        }
        
        static {
            lIllIllIlllIlII();
            lIllIllIlllIIll();
            final BroadcastState[] enum$VALUES = new BroadcastState[BroadcastState.lIIIIIllIIIlII[14]];
            enum$VALUES[BroadcastState.lIIIIIllIIIlII[0]] = BroadcastState.Uninitialized;
            enum$VALUES[BroadcastState.lIIIIIllIIIlII[1]] = BroadcastState.Initialized;
            enum$VALUES[BroadcastState.lIIIIIllIIIlII[2]] = BroadcastState.Authenticating;
            enum$VALUES[BroadcastState.lIIIIIllIIIlII[3]] = BroadcastState.Authenticated;
            enum$VALUES[BroadcastState.lIIIIIllIIIlII[4]] = BroadcastState.LoggingIn;
            enum$VALUES[BroadcastState.lIIIIIllIIIlII[5]] = BroadcastState.LoggedIn;
            enum$VALUES[BroadcastState.lIIIIIllIIIlII[6]] = BroadcastState.FindingIngestServer;
            enum$VALUES[BroadcastState.lIIIIIllIIIlII[7]] = BroadcastState.ReceivedIngestServers;
            enum$VALUES[BroadcastState.lIIIIIllIIIlII[8]] = BroadcastState.ReadyToBroadcast;
            enum$VALUES[BroadcastState.lIIIIIllIIIlII[9]] = BroadcastState.Starting;
            enum$VALUES[BroadcastState.lIIIIIllIIIlII[10]] = BroadcastState.Broadcasting;
            enum$VALUES[BroadcastState.lIIIIIllIIIlII[11]] = BroadcastState.Stopping;
            enum$VALUES[BroadcastState.lIIIIIllIIIlII[12]] = BroadcastState.Paused;
            enum$VALUES[BroadcastState.lIIIIIllIIIlII[13]] = BroadcastState.IngestTesting;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static void lIllIllIlllIlII() {
            (lIIIIIllIIIlII = new int[15])[0] = ((0xB9 ^ 0x8F ^ (0x86 ^ 0x88)) & (0x25 ^ 0x21 ^ (0x9A ^ 0xA6) ^ -" ".length()));
            BroadcastState.lIIIIIllIIIlII[1] = " ".length();
            BroadcastState.lIIIIIllIIIlII[2] = "  ".length();
            BroadcastState.lIIIIIllIIIlII[3] = "   ".length();
            BroadcastState.lIIIIIllIIIlII[4] = (0x2D ^ 0x4A ^ (0x3A ^ 0x59));
            BroadcastState.lIIIIIllIIIlII[5] = (0x9C ^ 0x97 ^ (0x20 ^ 0x2E));
            BroadcastState.lIIIIIllIIIlII[6] = (0x4F ^ 0x49);
            BroadcastState.lIIIIIllIIIlII[7] = (0x1C ^ 0x1B);
            BroadcastState.lIIIIIllIIIlII[8] = (0xB0 ^ 0xB8);
            BroadcastState.lIIIIIllIIIlII[9] = (0x84 ^ 0x8D);
            BroadcastState.lIIIIIllIIIlII[10] = (0x12 ^ 0xF ^ (0x11 ^ 0x6));
            BroadcastState.lIIIIIllIIIlII[11] = (0x33 ^ 0x38);
            BroadcastState.lIIIIIllIIIlII[12] = (0x17 ^ 0x1B);
            BroadcastState.lIIIIIllIIIlII[13] = (0x69 ^ 0x64);
            BroadcastState.lIIIIIllIIIlII[14] = (0x24 ^ 0xC ^ (0x30 ^ 0x16));
        }
        
        private BroadcastState(final String lllllllllllllIlIIlllIIIIIlIIllIl, final int lllllllllllllIlIIlllIIIIIlIIllII) {
        }
    }
    
    public interface BroadcastListener
    {
        void func_152901_c();
        
        void func_152898_a(final ErrorCode p0, final GameInfo[] p1);
        
        void func_152895_a();
        
        void func_152899_b();
        
        void func_152892_c(final ErrorCode p0);
        
        void func_152896_a(final IngestList p0);
        
        void func_152894_a(final StreamInfo p0);
        
        void func_152897_a(final ErrorCode p0);
        
        void func_152893_b(final ErrorCode p0);
        
        void func_152900_a(final ErrorCode p0, final AuthToken p1);
        
        void func_152891_a(final BroadcastState p0);
    }
}
