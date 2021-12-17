// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.stream;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import tv.twitch.broadcast.StartFlags;
import tv.twitch.broadcast.StatType;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import tv.twitch.broadcast.ChannelInfo;
import tv.twitch.AuthToken;
import tv.twitch.broadcast.ArchivingState;
import tv.twitch.broadcast.UserInfo;
import tv.twitch.broadcast.GameInfoList;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.ErrorCode;
import com.google.common.collect.Lists;
import tv.twitch.broadcast.EncodingCpuUsage;
import tv.twitch.broadcast.PixelFormat;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.IStatCallbacks;
import tv.twitch.broadcast.VideoParams;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.FrameBuffer;
import java.util.List;
import tv.twitch.broadcast.RTMPState;
import tv.twitch.broadcast.AudioParams;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.Stream;

public class IngestServerTester
{
    protected /* synthetic */ int field_153062_t;
    protected /* synthetic */ Stream field_153045_c;
    private static final /* synthetic */ String[] lIIlIIlllIllII;
    protected /* synthetic */ boolean field_153056_n;
    protected /* synthetic */ IngestList field_153046_d;
    protected /* synthetic */ boolean field_153060_r;
    protected /* synthetic */ AudioParams audioParameters;
    protected /* synthetic */ float field_153066_x;
    protected /* synthetic */ IngestTestListener field_153044_b;
    protected /* synthetic */ IngestTestState field_153047_e;
    protected /* synthetic */ int field_153063_u;
    protected /* synthetic */ RTMPState field_153051_i;
    protected /* synthetic */ List<FrameBuffer> field_153055_m;
    protected /* synthetic */ boolean field_176007_z;
    protected /* synthetic */ IStreamCallbacks field_176005_A;
    protected /* synthetic */ long field_153048_f;
    protected /* synthetic */ boolean field_153061_s;
    protected /* synthetic */ VideoParams field_153052_j;
    protected /* synthetic */ boolean field_176008_y;
    protected /* synthetic */ long field_153064_v;
    protected /* synthetic */ IStreamCallbacks field_153057_o;
    private static final /* synthetic */ int[] lIIlIIlllIllIl;
    protected /* synthetic */ long field_153054_l;
    protected /* synthetic */ float field_153065_w;
    protected /* synthetic */ long field_153049_g;
    protected /* synthetic */ IStatCallbacks field_153058_p;
    protected /* synthetic */ boolean field_176009_x;
    protected /* synthetic */ IStatCallbacks field_176006_B;
    protected /* synthetic */ IngestServer field_153059_q;
    protected /* synthetic */ long field_153050_h;
    
    public int func_153028_p() {
        return this.field_153062_t;
    }
    
    public void func_176004_j() {
        if (llIIlllIlIIllIl(this.field_153047_e, IngestTestState.Uninitalized)) {
            this.field_153062_t = IngestServerTester.lIIlIIlllIllIl[0];
            this.field_153060_r = (IngestServerTester.lIIlIIlllIllIl[0] != 0);
            this.field_153061_s = (IngestServerTester.lIIlIIlllIllIl[0] != 0);
            this.field_176009_x = (IngestServerTester.lIIlIIlllIllIl[0] != 0);
            this.field_176008_y = (IngestServerTester.lIIlIIlllIllIl[0] != 0);
            this.field_176007_z = (IngestServerTester.lIIlIIlllIllIl[0] != 0);
            this.field_153058_p = this.field_153045_c.getStatCallbacks();
            this.field_153045_c.setStatCallbacks(this.field_176006_B);
            this.field_153057_o = this.field_153045_c.getStreamCallbacks();
            this.field_153045_c.setStreamCallbacks(this.field_176005_A);
            this.field_153052_j = new VideoParams();
            this.field_153052_j.targetFps = IngestServerTester.lIIlIIlllIllIl[3];
            this.field_153052_j.maxKbps = IngestServerTester.lIIlIIlllIllIl[4];
            this.field_153052_j.outputWidth = IngestServerTester.lIIlIIlllIllIl[5];
            this.field_153052_j.outputHeight = IngestServerTester.lIIlIIlllIllIl[6];
            this.field_153052_j.pixelFormat = PixelFormat.TTV_PF_BGRA;
            this.field_153052_j.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
            this.field_153052_j.disableAdaptiveBitrate = (IngestServerTester.lIIlIIlllIllIl[1] != 0);
            this.field_153052_j.verticalFlip = (IngestServerTester.lIIlIIlllIllIl[0] != 0);
            this.field_153045_c.getDefaultParams(this.field_153052_j);
            "".length();
            this.audioParameters = new AudioParams();
            this.audioParameters.audioEnabled = (IngestServerTester.lIIlIIlllIllIl[0] != 0);
            this.audioParameters.enableMicCapture = (IngestServerTester.lIIlIIlllIllIl[0] != 0);
            this.audioParameters.enablePlaybackCapture = (IngestServerTester.lIIlIIlllIllIl[0] != 0);
            this.audioParameters.enablePassthroughAudio = (IngestServerTester.lIIlIIlllIllIl[0] != 0);
            this.field_153055_m = (List<FrameBuffer>)Lists.newArrayList();
            final int lllllllllllllIIllIlIllllllIlllII = IngestServerTester.lIIlIIlllIllIl[7];
            int lllllllllllllIIllIlIllllllIllIll = IngestServerTester.lIIlIIlllIllIl[0];
            "".length();
            if ("  ".length() <= -" ".length()) {
                return;
            }
            while (!llIIlllIlIIllll(lllllllllllllIIllIlIllllllIllIll, lllllllllllllIIllIlIllllllIlllII)) {
                final FrameBuffer lllllllllllllIIllIlIllllllIllIlI = this.field_153045_c.allocateFrameBuffer(this.field_153052_j.outputWidth * this.field_153052_j.outputHeight * IngestServerTester.lIIlIIlllIllIl[8]);
                if (llIIlllIlIIlllI(lllllllllllllIIllIlIllllllIllIlI.getIsValid() ? 1 : 0)) {
                    this.func_153031_o();
                    this.func_153034_a(IngestTestState.Failed);
                    return;
                }
                this.field_153055_m.add(lllllllllllllIIllIlIllllllIllIlI);
                "".length();
                this.field_153045_c.randomizeFrameBuffer(lllllllllllllIIllIlIllllllIllIlI);
                "".length();
                ++lllllllllllllIIllIlIllllllIllIll;
            }
            this.func_153034_a(IngestTestState.Starting);
            this.field_153054_l = System.currentTimeMillis();
        }
    }
    
    static {
        llIIlllIlIIlIll();
        llIIlllIlIIlIlI();
    }
    
    protected void func_153034_a(final IngestTestState lllllllllllllIIllIlIlllllIIlllll) {
        if (llIIlllIlIIllII(lllllllllllllIIllIlIlllllIIlllll, this.field_153047_e)) {
            this.field_153047_e = lllllllllllllIIllIlIlllllIIlllll;
            if (llIIlllIlIlIIII(this.field_153044_b)) {
                this.field_153044_b.func_152907_a(this, lllllllllllllIIllIlIlllllIIlllll);
            }
        }
    }
    
    private static boolean llIIlllIlIlIlIl(final int lllllllllllllIIllIlIllllIllIlIll) {
        return lllllllllllllIIllIlIllllIllIlIll > 0;
    }
    
    private static void llIIlllIlIIlIll() {
        (lIIlIIlllIllIl = new int[15])[0] = ((0x50 ^ 0x55) & ~(0x85 ^ 0x80));
        IngestServerTester.lIIlIIlllIllIl[1] = " ".length();
        IngestServerTester.lIIlIIlllIllIl[2] = -" ".length();
        IngestServerTester.lIIlIIlllIllIl[3] = (0x90 ^ 0xAC);
        IngestServerTester.lIIlIIlllIllIl[4] = (-(0xFFFFB667 & 0x799B) & (0xFFFFBFBF & 0x7DEE));
        IngestServerTester.lIIlIIlllIllIl[5] = (0xFFFF8D77 & 0x7788);
        IngestServerTester.lIIlIIlllIllIl[6] = (0xFFFFBAFA & 0x47D5);
        IngestServerTester.lIIlIIlllIllIl[7] = "   ".length();
        IngestServerTester.lIIlIIlllIllIl[8] = (0x8 ^ 0x16 ^ (0x2F ^ 0x35));
        IngestServerTester.lIIlIIlllIllIl[9] = (0xC2 ^ 0xA6 ^ (0xCD ^ 0xA1));
        IngestServerTester.lIIlIIlllIllIl[10] = (0xD2 ^ 0xB6 ^ (0xDE ^ 0xBD));
        IngestServerTester.lIIlIIlllIllIl[11] = (49 + 24 + 36 + 50 ^ 101 + 96 - 97 + 54);
        IngestServerTester.lIIlIIlllIllIl[12] = (0x63 ^ 0x37 ^ (0xE ^ 0x53));
        IngestServerTester.lIIlIIlllIllIl[13] = (0x4 ^ 0x2);
        IngestServerTester.lIIlIIlllIllIl[14] = "  ".length();
    }
    
    public IngestServerTester(final Stream lllllllllllllIIllIlIlllllllIIIll, final IngestList lllllllllllllIIllIlIlllllllIIlIl) {
        this.field_153044_b = null;
        this.field_153045_c = null;
        this.field_153046_d = null;
        this.field_153047_e = IngestTestState.Uninitalized;
        this.field_153048_f = 8000L;
        this.field_153049_g = 2000L;
        this.field_153050_h = 0L;
        this.field_153051_i = RTMPState.Invalid;
        this.field_153052_j = null;
        this.audioParameters = null;
        this.field_153054_l = 0L;
        this.field_153055_m = null;
        this.field_153056_n = (IngestServerTester.lIIlIIlllIllIl[0] != 0);
        this.field_153057_o = null;
        this.field_153058_p = null;
        this.field_153059_q = null;
        this.field_153060_r = (IngestServerTester.lIIlIIlllIllIl[0] != 0);
        this.field_153061_s = (IngestServerTester.lIIlIIlllIllIl[0] != 0);
        this.field_153062_t = IngestServerTester.lIIlIIlllIllIl[2];
        this.field_153063_u = IngestServerTester.lIIlIIlllIllIl[0];
        this.field_153064_v = 0L;
        this.field_153065_w = 0.0f;
        this.field_153066_x = 0.0f;
        this.field_176009_x = (IngestServerTester.lIIlIIlllIllIl[0] != 0);
        this.field_176008_y = (IngestServerTester.lIIlIIlllIllIl[0] != 0);
        this.field_176007_z = (IngestServerTester.lIIlIIlllIllIl[0] != 0);
        this.field_176005_A = (IStreamCallbacks)new IStreamCallbacks() {
            private static final /* synthetic */ int[] lIlIlllllIIIll;
            private static final /* synthetic */ String[] lIlIlllllIIIlI;
            
            public void getStreamInfoCallback(final ErrorCode lllllllllllllIIIIlIIlllllIlIIlll, final StreamInfo lllllllllllllIIIIlIIlllllIlIIllI) {
            }
            
            public void getGameNameListCallback(final ErrorCode lllllllllllllIIIIlIIlllllIIlllIl, final GameInfoList lllllllllllllIIIIlIIlllllIIlllII) {
            }
            
            public void sendEndSpanMetaDataCallback(final ErrorCode lllllllllllllIIIIlIIlllllIIIlIII) {
            }
            
            public void setStreamInfoCallback(final ErrorCode lllllllllllllIIIIlIIlllllIIlllll) {
            }
            
            public void getUserInfoCallback(final ErrorCode lllllllllllllIIIIlIIlllllIlIlIlI, final UserInfo lllllllllllllIIIIlIIlllllIlIlIIl) {
            }
            
            private static void llllIlIIlllllll() {
                (lIlIlllllIIIll = new int[3])[0] = ((0x62 ^ 0x58) & ~(0x2D ^ 0x17));
                IngestServerTester$1.lIlIlllllIIIll[1] = " ".length();
                IngestServerTester$1.lIlIlllllIIIll[2] = "  ".length();
            }
            
            public void getArchivingStateCallback(final ErrorCode lllllllllllllIIIIlIIlllllIlIIlII, final ArchivingState lllllllllllllIIIIlIIlllllIlIIIll) {
            }
            
            public void runCommercialCallback(final ErrorCode lllllllllllllIIIIlIIlllllIlIIIIl) {
            }
            
            public void requestAuthTokenCallback(final ErrorCode lllllllllllllIIIIlIIlllllIllIIll, final AuthToken lllllllllllllIIIIlIIlllllIllIIlI) {
            }
            
            public void stopCallback(final ErrorCode lllllllllllllIIIIlIIlllllIIIlllI) {
                if (llllIlIlIIIIIII(ErrorCode.failed(lllllllllllllIIIIlIIlllllIIIlllI) ? 1 : 0)) {
                    System.out.println(String.valueOf(new StringBuilder(IngestServerTester$1.lIlIlllllIIIlI[IngestServerTester$1.lIlIlllllIIIll[0]]).append(IngestServerTester.this.field_153059_q.serverName).append(IngestServerTester$1.lIlIlllllIIIlI[IngestServerTester$1.lIlIlllllIIIll[1]]).append(lllllllllllllIIIIlIIlllllIIIlllI.toString())));
                }
                IngestServerTester.this.field_176007_z = (IngestServerTester$1.lIlIlllllIIIll[0] != 0);
                IngestServerTester.this.field_176009_x = (IngestServerTester$1.lIlIlllllIIIll[0] != 0);
                IngestServerTester.this.func_153034_a(IngestTestState.DoneTestingServer);
                IngestServerTester.this.field_153059_q = null;
                if (llllIlIlIIIIIII(IngestServerTester.this.field_153060_r ? 1 : 0)) {
                    IngestServerTester.this.func_153034_a(IngestTestState.Cancelling);
                }
            }
            
            static {
                llllIlIIlllllll();
                llllIlIIllllllI();
            }
            
            public void loginCallback(final ErrorCode lllllllllllllIIIIlIIlllllIllIIII, final ChannelInfo lllllllllllllIIIIlIIlllllIlIllll) {
            }
            
            private static boolean llllIlIlIIIIIIl(final int lllllllllllllIIIIlIIllllIllIllIl, final int lllllllllllllIIIIlIIllllIllIllII) {
                return lllllllllllllIIIIlIIllllIllIllIl < lllllllllllllIIIIlIIllllIllIllII;
            }
            
            private static boolean llllIlIlIIIIIII(final int lllllllllllllIIIIlIIllllIllIlIlI) {
                return lllllllllllllIIIIlIIllllIllIlIlI != 0;
            }
            
            public void sendActionMetaDataCallback(final ErrorCode lllllllllllllIIIIlIIlllllIIIllII) {
            }
            
            private static void llllIlIIllllllI() {
                (lIlIlllllIIIlI = new String[IngestServerTester$1.lIlIlllllIIIll[2]])[IngestServerTester$1.lIlIlllllIIIll[0]] = llllIlIIlllllIl("Oh0xBgEHJzMQBhYBeBAGHAMVAh4fETcAGVMVNwoeFhd2Fx1TACIMAlNedg==", "ssVcr");
                IngestServerTester$1.lIlIlllllIIIlI[IngestServerTester$1.lIlIlllllIIIll[1]] = llllIlIIlllllIl("U1Y=", "ivjXZ");
            }
            
            public void bufferUnlockCallback(final long lllllllllllllIIIIlIIlllllIIllIlI) {
            }
            
            public void startCallback(final ErrorCode lllllllllllllIIIIlIIlllllIIlIlII) {
                IngestServerTester.this.field_176008_y = (IngestServerTester$1.lIlIlllllIIIll[0] != 0);
                if (llllIlIlIIIIIII(ErrorCode.succeeded(lllllllllllllIIIIlIIlllllIIlIlII) ? 1 : 0)) {
                    IngestServerTester.this.field_176009_x = (IngestServerTester$1.lIlIlllllIIIll[1] != 0);
                    IngestServerTester.this.field_153054_l = System.currentTimeMillis();
                    IngestServerTester.this.func_153034_a(IngestTestState.ConnectingToServer);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    IngestServerTester.this.field_153056_n = (IngestServerTester$1.lIlIlllllIIIll[0] != 0);
                    IngestServerTester.this.func_153034_a(IngestTestState.DoneTestingServer);
                }
            }
            
            public void sendStartSpanMetaDataCallback(final ErrorCode lllllllllllllIIIIlIIlllllIIIlIlI) {
            }
            
            private static String llllIlIIlllllIl(String lllllllllllllIIIIlIIllllIllllIII, final String lllllllllllllIIIIlIIllllIlllllII) {
                lllllllllllllIIIIlIIllllIllllIII = (short)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIlIIllllIllllIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder lllllllllllllIIIIlIIllllIllllIll = new StringBuilder();
                final char[] lllllllllllllIIIIlIIllllIllllIlI = lllllllllllllIIIIlIIllllIlllllII.toCharArray();
                int lllllllllllllIIIIlIIllllIllllIIl = IngestServerTester$1.lIlIlllllIIIll[0];
                final boolean lllllllllllllIIIIlIIllllIlllIIll = (boolean)(Object)((String)lllllllllllllIIIIlIIllllIllllIII).toCharArray();
                final float lllllllllllllIIIIlIIllllIlllIIlI = lllllllllllllIIIIlIIllllIlllIIll.length;
                short lllllllllllllIIIIlIIllllIlllIIIl = (short)IngestServerTester$1.lIlIlllllIIIll[0];
                while (llllIlIlIIIIIIl(lllllllllllllIIIIlIIllllIlllIIIl, (int)lllllllllllllIIIIlIIllllIlllIIlI)) {
                    final char lllllllllllllIIIIlIIllllIllllllI = lllllllllllllIIIIlIIllllIlllIIll[lllllllllllllIIIIlIIllllIlllIIIl];
                    lllllllllllllIIIIlIIllllIllllIll.append((char)(lllllllllllllIIIIlIIllllIllllllI ^ lllllllllllllIIIIlIIllllIllllIlI[lllllllllllllIIIIlIIllllIllllIIl % lllllllllllllIIIIlIIllllIllllIlI.length]));
                    "".length();
                    ++lllllllllllllIIIIlIIllllIllllIIl;
                    ++lllllllllllllIIIIlIIllllIlllIIIl;
                    "".length();
                    if ((("   ".length() ^ (0x35 ^ 0x7)) & (0x48 ^ 0x5D ^ (0x5 ^ 0x21) ^ -" ".length())) != ((0x32 ^ 0x5D ^ (0x2B ^ 0x42)) & (0x3F ^ 0x53 ^ (0x46 ^ 0x2C) ^ -" ".length()))) {
                        return null;
                    }
                }
                return String.valueOf(lllllllllllllIIIIlIIllllIllllIll);
            }
            
            public void getIngestServersCallback(final ErrorCode lllllllllllllIIIIlIIlllllIlIllIl, final IngestList lllllllllllllIIIIlIIlllllIlIllII) {
            }
        };
        this.field_176006_B = (IStatCallbacks)new IStatCallbacks() {
            private static final /* synthetic */ int[] lllIllIIIlIIll;
            
            private static boolean lIlIIlIIIIIIlIII(final Object llllllllllllIlIllIIllllIlIlIIIlI) {
                return llllllllllllIlIllIIllllIlIlIIIlI != null;
            }
            
            static {
                lIlIIlIIIIIIIlll();
            }
            
            static /* synthetic */ int[] $SWITCH_TABLE$tv$twitch$broadcast$StatType() {
                final int[] $switch_TABLE$tv$twitch$broadcast$StatType = IngestServerTester$2.$SWITCH_TABLE$tv$twitch$broadcast$StatType;
                if (lIlIIlIIIIIIlIII($switch_TABLE$tv$twitch$broadcast$StatType)) {
                    return $switch_TABLE$tv$twitch$broadcast$StatType;
                }
                "".length();
                final int llllllllllllIlIllIIllllIlIlIIlII = (int)(Object)new int[StatType.values().length];
                try {
                    llllllllllllIlIllIIllllIlIlIIlII[StatType.TTV_ST_RTMPDATASENT.ordinal()] = IngestServerTester$2.lllIllIIIlIIll[0];
                    "".length();
                    if (-"  ".length() > 0) {
                        return null;
                    }
                }
                catch (NoSuchFieldError noSuchFieldError) {
                    "".length();
                }
                try {
                    llllllllllllIlIllIIllllIlIlIIlII[StatType.TTV_ST_RTMPSTATE.ordinal()] = IngestServerTester$2.lllIllIIIlIIll[1];
                    "".length();
                    if (((0xA9 ^ 0x8B) & ~(0x94 ^ 0xB6)) > 0) {
                        return null;
                    }
                }
                catch (NoSuchFieldError noSuchFieldError2) {
                    "".length();
                }
                return IngestServerTester$2.$SWITCH_TABLE$tv$twitch$broadcast$StatType = (int[])(Object)llllllllllllIlIllIIllllIlIlIIlII;
            }
            
            public void statCallback(final StatType llllllllllllIlIllIIllllIlIlIlIlI, final long llllllllllllIlIllIIllllIlIlIlIIl) {
                switch ($SWITCH_TABLE$tv$twitch$broadcast$StatType()[llllllllllllIlIllIIllllIlIlIlIlI.ordinal()]) {
                    case 1: {
                        IngestServerTester.this.field_153051_i = RTMPState.lookupValue((int)llllllllllllIlIllIIllllIlIlIlIIl);
                        "".length();
                        if ("   ".length() < 0) {
                            return;
                        }
                        break;
                    }
                    case 2: {
                        IngestServerTester.this.field_153050_h = llllllllllllIlIllIIllllIlIlIlIIl;
                        break;
                    }
                }
            }
            
            private static void lIlIIlIIIIIIIlll() {
                (lllIllIIIlIIll = new int[2])[0] = "  ".length();
                IngestServerTester$2.lllIllIIIlIIll[1] = " ".length();
            }
        };
        this.field_153045_c = lllllllllllllIIllIlIlllllllIIIll;
        this.field_153046_d = lllllllllllllIIllIlIlllllllIIlIl;
    }
    
    private static boolean llIIlllIlIlIIII(final Object lllllllllllllIIllIlIllllIlllIIll) {
        return lllllllllllllIIllIlIllllIlllIIll != null;
    }
    
    public boolean func_153032_e() {
        if (llIIlllIlIIllII(this.field_153047_e, IngestTestState.Finished) && llIIlllIlIIllII(this.field_153047_e, IngestTestState.Cancelled) && llIIlllIlIIllII(this.field_153047_e, IngestTestState.Failed)) {
            return IngestServerTester.lIIlIIlllIllIl[0] != 0;
        }
        return IngestServerTester.lIIlIIlllIllIl[1] != 0;
    }
    
    public void func_153042_a(final IngestTestListener lllllllllllllIIllIlIlllllllllIIl) {
        this.field_153044_b = lllllllllllllIIllIlIlllllllllIIl;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$client$stream$IngestServerTester$IngestTestState() {
        final int[] $switch_TABLE$net$minecraft$client$stream$IngestServerTester$IngestTestState = IngestServerTester.$SWITCH_TABLE$net$minecraft$client$stream$IngestServerTester$IngestTestState;
        if (llIIlllIlIlIIII($switch_TABLE$net$minecraft$client$stream$IngestServerTester$IngestTestState)) {
            return $switch_TABLE$net$minecraft$client$stream$IngestServerTester$IngestTestState;
        }
        "".length();
        final byte lllllllllllllIIllIlIlllllIIlllIl = (Object)new int[IngestTestState.values().length];
        try {
            lllllllllllllIIllIlIlllllIIlllIl[IngestTestState.Cancelled.ordinal()] = IngestServerTester.lIIlIIlllIllIl[9];
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIllIlIlllllIIlllIl[IngestTestState.Cancelling.ordinal()] = IngestServerTester.lIIlIIlllIllIl[10];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIllIlIlllllIIlllIl[IngestTestState.ConnectingToServer.ordinal()] = IngestServerTester.lIIlIIlllIllIl[7];
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIIllIlIlllllIIlllIl[IngestTestState.DoneTestingServer.ordinal()] = IngestServerTester.lIIlIIlllIllIl[11];
            "".length();
            if (((0x5B ^ 0x53) & ~(0x55 ^ 0x5D)) >= (0x53 ^ 0x57)) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIIllIlIlllllIIlllIl[IngestTestState.Failed.ordinal()] = IngestServerTester.lIIlIIlllIllIl[12];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIIllIlIlllllIIlllIl[IngestTestState.Finished.ordinal()] = IngestServerTester.lIIlIIlllIllIl[13];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        try {
            lllllllllllllIIllIlIlllllIIlllIl[IngestTestState.Starting.ordinal()] = IngestServerTester.lIIlIIlllIllIl[14];
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError7) {
            "".length();
        }
        try {
            lllllllllllllIIllIlIlllllIIlllIl[IngestTestState.TestingServer.ordinal()] = IngestServerTester.lIIlIIlllIllIl[8];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError8) {
            "".length();
        }
        try {
            lllllllllllllIIllIlIlllllIIlllIl[IngestTestState.Uninitalized.ordinal()] = IngestServerTester.lIIlIIlllIllIl[1];
            "".length();
            if ((0x35 ^ 0x1B ^ (0x5E ^ 0x74)) != (0xBE ^ 0x9D ^ (0x88 ^ 0xAF))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError9) {
            "".length();
        }
        return IngestServerTester.$SWITCH_TABLE$net$minecraft$client$stream$IngestServerTester$IngestTestState = (int[])(Object)lllllllllllllIIllIlIlllllIIlllIl;
    }
    
    private static boolean llIIlllIlIIllll(final int lllllllllllllIIllIlIlllllIIIIIlI, final int lllllllllllllIIllIlIlllllIIIIIIl) {
        return lllllllllllllIIllIlIlllllIIIIIlI >= lllllllllllllIIllIlIlllllIIIIIIl;
    }
    
    public float func_153030_h() {
        return this.field_153066_x;
    }
    
    protected void func_153038_n() {
        final float lllllllllllllIIllIlIlllllIlllIIl = (float)this.func_153037_m();
        switch ($SWITCH_TABLE$net$minecraft$client$stream$IngestServerTester$IngestTestState()[this.field_153047_e.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 6:
            case 8:
            case 9: {
                this.field_153066_x = 0.0f;
                "".length();
                if (((0x33 ^ 0x76) & ~(0x4E ^ 0xB)) != ((0x63 ^ 0x7A) & ~(0xB0 ^ 0xA9))) {
                    return;
                }
                break;
            }
            case 5: {
                this.field_153066_x = 1.0f;
                "".length();
                if (-"   ".length() >= 0) {
                    return;
                }
                break;
            }
            default: {
                this.field_153066_x = lllllllllllllIIllIlIlllllIlllIIl / this.field_153048_f;
                break;
            }
        }
        switch ($SWITCH_TABLE$net$minecraft$client$stream$IngestServerTester$IngestTestState()[this.field_153047_e.ordinal()]) {
            case 6:
            case 8:
            case 9: {
                this.field_153065_w = 1.0f;
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
                break;
            }
            default: {
                this.field_153065_w = this.field_153062_t / (float)this.field_153046_d.getServers().length;
                this.field_153065_w += this.field_153066_x / this.field_153046_d.getServers().length;
                break;
            }
        }
    }
    
    protected long func_153037_m() {
        return System.currentTimeMillis() - this.field_153054_l;
    }
    
    private static String llIIlllIlIIlIIl(String lllllllllllllIIllIlIlllllIIIllIl, final String lllllllllllllIIllIlIlllllIIIllII) {
        lllllllllllllIIllIlIlllllIIIllIl = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllIlIlllllIIIllIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIlIlllllIIlIIII = new StringBuilder();
        final char[] lllllllllllllIIllIlIlllllIIIllll = lllllllllllllIIllIlIlllllIIIllII.toCharArray();
        int lllllllllllllIIllIlIlllllIIIlllI = IngestServerTester.lIIlIIlllIllIl[0];
        final long lllllllllllllIIllIlIlllllIIIlIII = (Object)((String)lllllllllllllIIllIlIlllllIIIllIl).toCharArray();
        final float lllllllllllllIIllIlIlllllIIIIlll = lllllllllllllIIllIlIlllllIIIlIII.length;
        boolean lllllllllllllIIllIlIlllllIIIIllI = IngestServerTester.lIIlIIlllIllIl[0] != 0;
        while (llIIlllIlIlIIIl(lllllllllllllIIllIlIlllllIIIIllI ? 1 : 0, (int)lllllllllllllIIllIlIlllllIIIIlll)) {
            final char lllllllllllllIIllIlIlllllIIlIIll = lllllllllllllIIllIlIlllllIIIlIII[lllllllllllllIIllIlIlllllIIIIllI];
            lllllllllllllIIllIlIlllllIIlIIII.append((char)(lllllllllllllIIllIlIlllllIIlIIll ^ lllllllllllllIIllIlIlllllIIIllll[lllllllllllllIIllIlIlllllIIIlllI % lllllllllllllIIllIlIlllllIIIllll.length]));
            "".length();
            ++lllllllllllllIIllIlIlllllIIIlllI;
            ++lllllllllllllIIllIlIlllllIIIIllI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIlIlllllIIlIIII);
    }
    
    private static boolean llIIlllIlIlIlII(final int lllllllllllllIIllIlIllllIllIllIl) {
        return lllllllllllllIIllIlIllllIllIllIl < 0;
    }
    
    public void func_153039_l() {
        if (llIIlllIlIIlllI(this.func_153032_e() ? 1 : 0) && llIIlllIlIIlllI(this.field_153060_r ? 1 : 0)) {
            this.field_153060_r = (IngestServerTester.lIIlIIlllIllIl[1] != 0);
            if (llIIlllIlIlIIII(this.field_153059_q)) {
                this.field_153059_q.bitrateKbps = 0.0f;
            }
        }
    }
    
    protected boolean func_153036_a(final IngestServer lllllllllllllIIllIlIllllllIIlIll) {
        this.field_153056_n = (IngestServerTester.lIIlIIlllIllIl[1] != 0);
        this.field_153050_h = 0L;
        this.field_153051_i = RTMPState.Idle;
        this.field_153059_q = lllllllllllllIIllIlIllllllIIlIll;
        this.field_176008_y = (IngestServerTester.lIIlIIlllIllIl[1] != 0);
        this.func_153034_a(IngestTestState.ConnectingToServer);
        final ErrorCode lllllllllllllIIllIlIllllllIIlIlI = this.field_153045_c.start(this.field_153052_j, this.audioParameters, lllllllllllllIIllIlIllllllIIlIll, StartFlags.TTV_Start_BandwidthTest, (boolean)(IngestServerTester.lIIlIIlllIllIl[1] != 0));
        if (llIIlllIlIlIIlI(ErrorCode.failed(lllllllllllllIIllIlIllllllIIlIlI) ? 1 : 0)) {
            this.field_176008_y = (IngestServerTester.lIIlIIlllIllIl[0] != 0);
            this.field_153056_n = (IngestServerTester.lIIlIIlllIllIl[0] != 0);
            this.func_153034_a(IngestTestState.DoneTestingServer);
            return IngestServerTester.lIIlIIlllIllIl[0] != 0;
        }
        this.field_153064_v = this.field_153050_h;
        lllllllllllllIIllIlIllllllIIlIll.bitrateKbps = 0.0f;
        this.field_153063_u = IngestServerTester.lIIlIIlllIllIl[0];
        return IngestServerTester.lIIlIIlllIllIl[1] != 0;
    }
    
    protected void func_153031_o() {
        this.field_153059_q = null;
        if (llIIlllIlIlIIII(this.field_153055_m)) {
            int lllllllllllllIIllIlIlllllIlIIlll = IngestServerTester.lIIlIIlllIllIl[0];
            "".length();
            if (((0x4A ^ 0x69 ^ " ".length()) & (134 + 74 - 91 + 73 ^ 118 + 87 - 75 + 26 ^ -" ".length())) != 0x0) {
                return;
            }
            while (!llIIlllIlIIllll(lllllllllllllIIllIlIlllllIlIIlll, this.field_153055_m.size())) {
                this.field_153055_m.get(lllllllllllllIIllIlIlllllIlIIlll).free();
                ++lllllllllllllIIllIlIlllllIlIIlll;
            }
            this.field_153055_m = null;
        }
        if (llIIlllIlIIllIl(this.field_153045_c.getStatCallbacks(), this.field_176006_B)) {
            this.field_153045_c.setStatCallbacks(this.field_153058_p);
            this.field_153058_p = null;
        }
        if (llIIlllIlIIllIl(this.field_153045_c.getStreamCallbacks(), this.field_176005_A)) {
            this.field_153045_c.setStreamCallbacks(this.field_153057_o);
            this.field_153057_o = null;
        }
    }
    
    private static boolean llIIlllIlIIlllI(final int lllllllllllllIIllIlIllllIllIllll) {
        return lllllllllllllIIllIlIllllIllIllll == 0;
    }
    
    private static void llIIlllIlIIlIlI() {
        (lIIlIIlllIllII = new String[IngestServerTester.lIIlIIlllIllIl[1]])[IngestServerTester.lIIlIIlllIllIl[0]] = llIIlllIlIIlIIl("Oi4jEm8POyUOKg1gbA==", "iZLbO");
    }
    
    protected boolean func_153029_c(final IngestServer lllllllllllllIIllIlIlllllIllIIIl) {
        if (!llIIlllIlIIlllI(this.field_153061_s ? 1 : 0) || !llIIlllIlIIlllI(this.field_153060_r ? 1 : 0) || !llIIlllIlIlIlII(llIIlllIlIlIIll(this.func_153037_m(), this.field_153048_f))) {
            this.func_153034_a(IngestTestState.DoneTestingServer);
            return IngestServerTester.lIIlIIlllIllIl[1] != 0;
        }
        if (!llIIlllIlIIlllI(this.field_176008_y ? 1 : 0) || !llIIlllIlIIlllI(this.field_176007_z ? 1 : 0)) {
            return IngestServerTester.lIIlIIlllIllIl[1] != 0;
        }
        final ErrorCode lllllllllllllIIllIlIlllllIllIIII = this.field_153045_c.submitVideoFrame((FrameBuffer)this.field_153055_m.get(this.field_153063_u));
        if (llIIlllIlIlIIlI(ErrorCode.failed(lllllllllllllIIllIlIlllllIllIIII) ? 1 : 0)) {
            this.field_153056_n = (IngestServerTester.lIIlIIlllIllIl[0] != 0);
            this.func_153034_a(IngestTestState.DoneTestingServer);
            return IngestServerTester.lIIlIIlllIllIl[0] != 0;
        }
        this.field_153063_u = (this.field_153063_u + IngestServerTester.lIIlIIlllIllIl[1]) % this.field_153055_m.size();
        this.field_153045_c.pollStats();
        "".length();
        if (llIIlllIlIIllIl(this.field_153051_i, RTMPState.SendVideo)) {
            this.func_153034_a(IngestTestState.TestingServer);
            final long lllllllllllllIIllIlIlllllIlIllll = this.func_153037_m();
            if (llIIlllIlIlIlIl(llIIlllIlIlIIll(lllllllllllllIIllIlIlllllIlIllll, 0L)) && llIIlllIlIlIlIl(llIIlllIlIlIIll(this.field_153050_h, this.field_153064_v))) {
                lllllllllllllIIllIlIlllllIllIIIl.bitrateKbps = this.field_153050_h * 8L / (float)this.func_153037_m();
                this.field_153064_v = this.field_153050_h;
            }
        }
        return IngestServerTester.lIIlIIlllIllIl[1] != 0;
    }
    
    private static int llIIlllIlIlIIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public IngestServer func_153040_c() {
        return this.field_153059_q;
    }
    
    private static boolean llIIlllIlIIllIl(final Object lllllllllllllIIllIlIllllIlllIllI, final Object lllllllllllllIIllIlIllllIlllIlIl) {
        return lllllllllllllIIllIlIllllIlllIllI == lllllllllllllIIllIlIllllIlllIlIl;
    }
    
    private static boolean llIIlllIlIlIIlI(final int lllllllllllllIIllIlIllllIlllIIIl) {
        return lllllllllllllIIllIlIllllIlllIIIl != 0;
    }
    
    public void func_153041_j() {
        if (llIIlllIlIIlllI(this.func_153032_e() ? 1 : 0) && llIIlllIlIIllII(this.field_153047_e, IngestTestState.Uninitalized) && llIIlllIlIIlllI(this.field_176008_y ? 1 : 0) && llIIlllIlIIlllI(this.field_176007_z ? 1 : 0)) {
            switch ($SWITCH_TABLE$net$minecraft$client$stream$IngestServerTester$IngestTestState()[this.field_153047_e.ordinal()]) {
                case 2:
                case 5: {
                    if (llIIlllIlIlIIII(this.field_153059_q)) {
                        if (!llIIlllIlIIlllI(this.field_153061_s ? 1 : 0) || llIIlllIlIIlllI(this.field_153056_n ? 1 : 0)) {
                            this.field_153059_q.bitrateKbps = 0.0f;
                        }
                        this.func_153035_b(this.field_153059_q);
                        "".length();
                        if ((0x93 ^ 0x97) < ((0x27 ^ 0x14) & ~(0xA0 ^ 0x93))) {
                            return;
                        }
                        break;
                    }
                    else {
                        this.field_153054_l = 0L;
                        this.field_153061_s = (IngestServerTester.lIIlIIlllIllIl[0] != 0);
                        this.field_153056_n = (IngestServerTester.lIIlIIlllIllIl[1] != 0);
                        if (llIIlllIlIIllII(this.field_153047_e, IngestTestState.Starting)) {
                            this.field_153062_t += IngestServerTester.lIIlIIlllIllIl[1];
                        }
                        if (llIIlllIlIlIIIl(this.field_153062_t, this.field_153046_d.getServers().length)) {
                            this.field_153059_q = this.field_153046_d.getServers()[this.field_153062_t];
                            this.func_153036_a(this.field_153059_q);
                            "".length();
                            "".length();
                            if (null != null) {
                                return;
                            }
                            break;
                        }
                        else {
                            this.func_153034_a(IngestTestState.Finished);
                            "".length();
                            if (((43 + 141 - 133 + 99 ^ 115 + 21 - 118 + 123) & (0x4C ^ 0x34 ^ (0xC3 ^ 0xA0) ^ -" ".length()) & (((0xE4 ^ 0x9E ^ (0x58 ^ 0x0)) & (0x10 ^ 0x4 ^ (0x7F ^ 0x49) ^ -" ".length())) ^ -" ".length())) != 0x0) {
                                return;
                            }
                            break;
                        }
                    }
                    break;
                }
                case 3:
                case 4: {
                    this.func_153029_c(this.field_153059_q);
                    "".length();
                    "".length();
                    if (-"   ".length() >= 0) {
                        return;
                    }
                    break;
                }
                case 7: {
                    this.func_153034_a(IngestTestState.Cancelled);
                    break;
                }
            }
            this.func_153038_n();
            if (!llIIlllIlIIllII(this.field_153047_e, IngestTestState.Cancelled) || llIIlllIlIIllIl(this.field_153047_e, IngestTestState.Finished)) {
                this.func_153031_o();
            }
        }
    }
    
    protected void func_153035_b(final IngestServer lllllllllllllIIllIlIllllllIIIIll) {
        if (llIIlllIlIlIIlI(this.field_176008_y ? 1 : 0)) {
            this.field_153061_s = (IngestServerTester.lIIlIIlllIllIl[1] != 0);
            "".length();
            if (((0xF6 ^ 0x96) & ~(0x77 ^ 0x17)) > 0) {
                return;
            }
        }
        else if (llIIlllIlIlIIlI(this.field_176009_x ? 1 : 0)) {
            this.field_176007_z = (IngestServerTester.lIIlIIlllIllIl[1] != 0);
            final ErrorCode lllllllllllllIIllIlIllllllIIIIlI = this.field_153045_c.stop((boolean)(IngestServerTester.lIIlIIlllIllIl[1] != 0));
            if (llIIlllIlIlIIlI(ErrorCode.failed(lllllllllllllIIllIlIllllllIIIIlI) ? 1 : 0)) {
                this.field_176005_A.stopCallback(ErrorCode.TTV_EC_SUCCESS);
                System.out.println(String.valueOf(new StringBuilder(IngestServerTester.lIIlIIlllIllII[IngestServerTester.lIIlIIlllIllIl[0]]).append(lllllllllllllIIllIlIllllllIIIIlI.toString())));
            }
            this.field_153045_c.pollStats();
            "".length();
            "".length();
            if (((172 + 80 - 160 + 106 ^ 137 + 88 - 151 + 121) & (0x82 ^ 0x93 ^ (0x2F ^ 0x3B) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            this.field_176005_A.stopCallback(ErrorCode.TTV_EC_SUCCESS);
        }
    }
    
    private static boolean llIIlllIlIlIIIl(final int lllllllllllllIIllIlIllllIllllllI, final int lllllllllllllIIllIlIllllIlllllIl) {
        return lllllllllllllIIllIlIllllIllllllI < lllllllllllllIIllIlIllllIlllllIl;
    }
    
    private static boolean llIIlllIlIIllII(final Object lllllllllllllIIllIlIllllIllllIlI, final Object lllllllllllllIIllIlIllllIllllIIl) {
        return lllllllllllllIIllIlIllllIllllIlI != lllllllllllllIIllIlIllllIllllIIl;
    }
    
    public interface IngestTestListener
    {
        void func_152907_a(final IngestServerTester p0, final IngestTestState p1);
    }
    
    public enum IngestTestState
    {
        ConnectingToServer(IngestTestState.llIlllllIIllII[IngestTestState.llIlllllIlIIll[2]], IngestTestState.llIlllllIlIIll[2]), 
        TestingServer(IngestTestState.llIlllllIIllII[IngestTestState.llIlllllIlIIll[3]], IngestTestState.llIlllllIlIIll[3]), 
        Uninitalized(IngestTestState.llIlllllIIllII[IngestTestState.llIlllllIlIIll[0]], IngestTestState.llIlllllIlIIll[0]), 
        Finished(IngestTestState.llIlllllIIllII[IngestTestState.llIlllllIlIIll[5]], IngestTestState.llIlllllIlIIll[5]);
        
        private static final /* synthetic */ int[] llIlllllIlIIll;
        
        Cancelling(IngestTestState.llIlllllIIllII[IngestTestState.llIlllllIlIIll[6]], IngestTestState.llIlllllIlIIll[6]), 
        Cancelled(IngestTestState.llIlllllIIllII[IngestTestState.llIlllllIlIIll[7]], IngestTestState.llIlllllIlIIll[7]), 
        Failed(IngestTestState.llIlllllIIllII[IngestTestState.llIlllllIlIIll[8]], IngestTestState.llIlllllIlIIll[8]), 
        DoneTestingServer(IngestTestState.llIlllllIIllII[IngestTestState.llIlllllIlIIll[4]], IngestTestState.llIlllllIlIIll[4]);
        
        private static final /* synthetic */ String[] llIlllllIIllII;
        
        Starting(IngestTestState.llIlllllIIllII[IngestTestState.llIlllllIlIIll[1]], IngestTestState.llIlllllIlIIll[1]);
        
        private static String lIIllIllIIlIIIlI(final String llllllllllllIllIIIllIIIIIIlIIIII, final String llllllllllllIllIIIllIIIIIIIlllll) {
            try {
                final SecretKeySpec llllllllllllIllIIIllIIIIIIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllIIIIIIIlllll.getBytes(StandardCharsets.UTF_8)), IngestTestState.llIlllllIlIIll[8]), "DES");
                final Cipher llllllllllllIllIIIllIIIIIIlIIIlI = Cipher.getInstance("DES");
                llllllllllllIllIIIllIIIIIIlIIIlI.init(IngestTestState.llIlllllIlIIll[2], llllllllllllIllIIIllIIIIIIlIIIll);
                return new String(llllllllllllIllIIIllIIIIIIlIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllIIIIIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIIllIIIIIIlIIIIl) {
                llllllllllllIllIIIllIIIIIIlIIIIl.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIllIllIIllIIIl(final int llllllllllllIllIIIlIllllllllIIll, final int llllllllllllIllIIIlIllllllllIIlI) {
            return llllllllllllIllIIIlIllllllllIIll < llllllllllllIllIIIlIllllllllIIlI;
        }
        
        private IngestTestState(final String llllllllllllIllIIIllIIIIIIllIIIl, final int llllllllllllIllIIIllIIIIIIllIIII) {
        }
        
        private static String lIIllIllIIlIIIIl(final String llllllllllllIllIIIllIIIIIIIlIIll, final String llllllllllllIllIIIllIIIIIIIlIIII) {
            try {
                final SecretKeySpec llllllllllllIllIIIllIIIIIIIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllIIIIIIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIIIllIIIIIIIlIlIl = Cipher.getInstance("Blowfish");
                llllllllllllIllIIIllIIIIIIIlIlIl.init(IngestTestState.llIlllllIlIIll[2], llllllllllllIllIIIllIIIIIIIlIllI);
                return new String(llllllllllllIllIIIllIIIIIIIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllIIIIIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIIllIIIIIIIlIlII) {
                llllllllllllIllIIIllIIIIIIIlIlII.printStackTrace();
                return null;
            }
        }
        
        private static String lIIllIllIIIlllll(String llllllllllllIllIIIlIlllllllllllI, final String llllllllllllIllIIIllIIIIIIIIIIlI) {
            llllllllllllIllIIIlIlllllllllllI = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIlIlllllllllllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIIIllIIIIIIIIIIIl = new StringBuilder();
            final char[] llllllllllllIllIIIllIIIIIIIIIIII = llllllllllllIllIIIllIIIIIIIIIIlI.toCharArray();
            int llllllllllllIllIIIlIllllllllllll = IngestTestState.llIlllllIlIIll[0];
            final String llllllllllllIllIIIlIlllllllllIIl = (Object)((String)llllllllllllIllIIIlIlllllllllllI).toCharArray();
            final int llllllllllllIllIIIlIlllllllllIII = llllllllllllIllIIIlIlllllllllIIl.length;
            double llllllllllllIllIIIlIllllllllIlll = IngestTestState.llIlllllIlIIll[0];
            while (lIIllIllIIllIIIl((int)llllllllllllIllIIIlIllllllllIlll, llllllllllllIllIIIlIlllllllllIII)) {
                final char llllllllllllIllIIIllIIIIIIIIIlII = llllllllllllIllIIIlIlllllllllIIl[llllllllllllIllIIIlIllllllllIlll];
                llllllllllllIllIIIllIIIIIIIIIIIl.append((char)(llllllllllllIllIIIllIIIIIIIIIlII ^ llllllllllllIllIIIllIIIIIIIIIIII[llllllllllllIllIIIlIllllllllllll % llllllllllllIllIIIllIIIIIIIIIIII.length]));
                "".length();
                ++llllllllllllIllIIIlIllllllllllll;
                ++llllllllllllIllIIIlIllllllllIlll;
                "".length();
                if (-"   ".length() >= 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIIIllIIIIIIIIIIIl);
        }
        
        private static void lIIllIllIIlIIlII() {
            (llIlllllIIllII = new String[IngestTestState.llIlllllIlIIll[9]])[IngestTestState.llIlllllIlIIll[0]] = lIIllIllIIIlllll("JQYdCSEECRgOMhUM", "phtgH");
            IngestTestState.llIlllllIIllII[IngestTestState.llIlllllIlIIll[1]] = lIIllIllIIlIIIIl("kAC1Jm4hK1c/c6svOP9CBQ==", "PHQtD");
            IngestTestState.llIlllllIIllII[IngestTestState.llIlllllIlIIll[2]] = lIIllIllIIlIIIlI("h7SDbXpMImdTV5rSftXJ4Emcmys1F06T", "VmHoh");
            IngestTestState.llIlllllIIllII[IngestTestState.llIlllllIlIIll[3]] = lIIllIllIIlIIIIl("ELm1MbMfQPla1yvzeg11kg==", "cdaDM");
            IngestTestState.llIlllllIIllII[IngestTestState.llIlllllIlIIll[4]] = lIIllIllIIIlllll("BicrLBwnOzEgJiUbIDs+Jzo=", "BHEIH");
            IngestTestState.llIlllllIIllII[IngestTestState.llIlllllIlIIll[5]] = lIIllIllIIlIIIIl("mCvOkNTrqMA3a2tuO94JMw==", "FBBHU");
            IngestTestState.llIlllllIIllII[IngestTestState.llIlllllIlIIll[6]] = lIIllIllIIIlllll("EAIXLwY/DxAiBA==", "ScyLc");
            IngestTestState.llIlllllIIllII[IngestTestState.llIlllllIlIIll[7]] = lIIllIllIIlIIIlI("K1CMhjP0sA2CuV1C+CjjHw==", "dbVYI");
            IngestTestState.llIlllllIIllII[IngestTestState.llIlllllIlIIll[8]] = lIIllIllIIlIIIIl("BSnXaScmAA0=", "ZuCev");
        }
        
        static {
            lIIllIllIIllIIII();
            lIIllIllIIlIIlII();
            final IngestTestState[] enum$VALUES = new IngestTestState[IngestTestState.llIlllllIlIIll[9]];
            enum$VALUES[IngestTestState.llIlllllIlIIll[0]] = IngestTestState.Uninitalized;
            enum$VALUES[IngestTestState.llIlllllIlIIll[1]] = IngestTestState.Starting;
            enum$VALUES[IngestTestState.llIlllllIlIIll[2]] = IngestTestState.ConnectingToServer;
            enum$VALUES[IngestTestState.llIlllllIlIIll[3]] = IngestTestState.TestingServer;
            enum$VALUES[IngestTestState.llIlllllIlIIll[4]] = IngestTestState.DoneTestingServer;
            enum$VALUES[IngestTestState.llIlllllIlIIll[5]] = IngestTestState.Finished;
            enum$VALUES[IngestTestState.llIlllllIlIIll[6]] = IngestTestState.Cancelling;
            enum$VALUES[IngestTestState.llIlllllIlIIll[7]] = IngestTestState.Cancelled;
            enum$VALUES[IngestTestState.llIlllllIlIIll[8]] = IngestTestState.Failed;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static void lIIllIllIIllIIII() {
            (llIlllllIlIIll = new int[10])[0] = ((0xB6 ^ 0x94) & ~(0x79 ^ 0x5B));
            IngestTestState.llIlllllIlIIll[1] = " ".length();
            IngestTestState.llIlllllIlIIll[2] = "  ".length();
            IngestTestState.llIlllllIlIIll[3] = "   ".length();
            IngestTestState.llIlllllIlIIll[4] = (0xC1 ^ 0xC5);
            IngestTestState.llIlllllIlIIll[5] = (65 + 78 - 102 + 87 ^ 91 + 24 - 62 + 80);
            IngestTestState.llIlllllIlIIll[6] = (0x77 ^ 0x71);
            IngestTestState.llIlllllIlIIll[7] = (110 + 110 - 78 + 20 ^ 162 + 150 - 219 + 72);
            IngestTestState.llIlllllIlIIll[8] = (0x58 ^ 0x31 ^ (0x4E ^ 0x2F));
            IngestTestState.llIlllllIlIIll[9] = (0xA9 ^ 0xA0);
        }
    }
}
