// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.profiler;

import java.util.Iterator;
import java.util.Arrays;
import java.util.TimerTask;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.net.MalformedURLException;
import java.util.UUID;
import com.google.common.collect.Maps;
import java.util.List;
import java.lang.management.RuntimeMXBean;
import java.lang.management.ManagementFactory;
import java.util.Timer;
import java.util.Map;
import java.net.URL;

public class PlayerUsageSnooper
{
    private static final /* synthetic */ int[] lIIlIlllllllII;
    private /* synthetic */ boolean isRunning;
    private final /* synthetic */ URL serverUrl;
    private final /* synthetic */ IPlayerUsage playerStatsCollector;
    private final /* synthetic */ Map<String, Object> field_152774_b;
    private final /* synthetic */ Map<String, Object> field_152773_a;
    private final /* synthetic */ Timer threadTrigger;
    private final /* synthetic */ Object syncLock;
    private final /* synthetic */ String uniqueID;
    private final /* synthetic */ long minecraftStartTimeMilis;
    private static final /* synthetic */ String[] lIIlIlllllIlII;
    
    private void addJvmArgsToSnooper() {
        final RuntimeMXBean lllllllllllllIIlIlllllIllIIllllI = ManagementFactory.getRuntimeMXBean();
        final List<String> lllllllllllllIIlIlllllIllIIlllIl = lllllllllllllIIlIlllllIllIIllllI.getInputArguments();
        int lllllllllllllIIlIlllllIllIIlllII = PlayerUsageSnooper.lIIlIlllllllII[0];
        final char lllllllllllllIIlIlllllIllIIlIlIl = (char)lllllllllllllIIlIlllllIllIIlllIl.iterator();
        "".length();
        if ("   ".length() >= (0x51 ^ 0x55)) {
            return;
        }
        while (!llIlIlIIllIlIll(((Iterator)lllllllllllllIIlIlllllIllIIlIlIl).hasNext() ? 1 : 0)) {
            final String lllllllllllllIIlIlllllIllIIllIll = ((Iterator<String>)lllllllllllllIIlIlllllIllIIlIlIl).next();
            if (llIlIlIIllIllII(lllllllllllllIIlIlllllIllIIllIll.startsWith(PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[15]]) ? 1 : 0)) {
                this.addClientStat(String.valueOf(new StringBuilder(PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[16]]).append(lllllllllllllIIlIlllllIllIIlllII++).append(PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[17]])), lllllllllllllIIlIlllllIllIIllIll);
            }
        }
        this.addClientStat(PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[18]], lllllllllllllIIlIlllllIllIIlllII);
    }
    
    public PlayerUsageSnooper(final String lllllllllllllIIlIlllllIllIlIllll, final IPlayerUsage lllllllllllllIIlIlllllIllIlIlllI, final long lllllllllllllIIlIlllllIllIlIllIl) {
        this.field_152773_a = (Map<String, Object>)Maps.newHashMap();
        this.field_152774_b = (Map<String, Object>)Maps.newHashMap();
        this.uniqueID = UUID.randomUUID().toString();
        this.threadTrigger = new Timer(PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[0]], (boolean)(PlayerUsageSnooper.lIIlIlllllllII[1] != 0));
        this.syncLock = new Object();
        try {
            this.serverUrl = new URL(String.valueOf(new StringBuilder(PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[1]]).append(lllllllllllllIIlIlllllIllIlIllll).append(PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[2]]).append(PlayerUsageSnooper.lIIlIlllllllII[2])));
            "".length();
            if (-"   ".length() > 0) {
                throw null;
            }
        }
        catch (MalformedURLException lllllllllllllIIlIlllllIllIllIIIl) {
            throw new IllegalArgumentException();
        }
        this.playerStatsCollector = lllllllllllllIIlIlllllIllIlIlllI;
        this.minecraftStartTimeMilis = lllllllllllllIIlIlllllIllIlIllIl;
    }
    
    private static boolean llIlIlIIllIllII(final int lllllllllllllIIlIlllllIlIIIllIII) {
        return lllllllllllllIIlIlllllIlIIIllIII != 0;
    }
    
    static {
        llIlIlIIllIlIlI();
        llIlIlIIlIllIlI();
    }
    
    private static String llIlIlIIlIlIIlI(final String lllllllllllllIIlIlllllIlIIlIIIIl, final String lllllllllllllIIlIlllllIlIIlIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlIlllllIlIIlIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlllllIlIIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIlllllIlIIlIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIlllllIlIIlIIlIl.init(PlayerUsageSnooper.lIIlIlllllllII[2], lllllllllllllIIlIlllllIlIIlIIllI);
            return new String(lllllllllllllIIlIlllllIlIIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlllllIlIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlllllIlIIlIIlII) {
            lllllllllllllIIlIlllllIlIIlIIlII.printStackTrace();
            return null;
        }
    }
    
    public void stopSnooper() {
        this.threadTrigger.cancel();
    }
    
    private static String llIlIlIIlIIlllI(String lllllllllllllIIlIlllllIlIIlllIII, final String lllllllllllllIIlIlllllIlIIllIlll) {
        lllllllllllllIIlIlllllIlIIlllIII = new String(Base64.getDecoder().decode(lllllllllllllIIlIlllllIlIIlllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIlllllIlIIllIllI = new StringBuilder();
        final char[] lllllllllllllIIlIlllllIlIIllIlIl = lllllllllllllIIlIlllllIlIIllIlll.toCharArray();
        int lllllllllllllIIlIlllllIlIIllIlII = PlayerUsageSnooper.lIIlIlllllllII[0];
        final long lllllllllllllIIlIlllllIlIIlIlllI = (Object)lllllllllllllIIlIlllllIlIIlllIII.toCharArray();
        final short lllllllllllllIIlIlllllIlIIlIllIl = (short)lllllllllllllIIlIlllllIlIIlIlllI.length;
        byte lllllllllllllIIlIlllllIlIIlIllII = (byte)PlayerUsageSnooper.lIIlIlllllllII[0];
        while (llIlIlIIllIllIl(lllllllllllllIIlIlllllIlIIlIllII, lllllllllllllIIlIlllllIlIIlIllIl)) {
            final char lllllllllllllIIlIlllllIlIIlllIIl = lllllllllllllIIlIlllllIlIIlIlllI[lllllllllllllIIlIlllllIlIIlIllII];
            lllllllllllllIIlIlllllIlIIllIllI.append((char)(lllllllllllllIIlIlllllIlIIlllIIl ^ lllllllllllllIIlIlllllIlIIllIlIl[lllllllllllllIIlIlllllIlIIllIlII % lllllllllllllIIlIlllllIlIIllIlIl.length]));
            "".length();
            ++lllllllllllllIIlIlllllIlIIllIlII;
            ++lllllllllllllIIlIlllllIlIIlIllII;
            "".length();
            if (((0xD5 ^ 0xB8 ^ (0x1F ^ 0x46)) & (0xE1 ^ 0x92 ^ (0xC9 ^ 0x8E) ^ -" ".length())) > " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIlllllIlIIllIllI);
    }
    
    public long getMinecraftStartTimeMillis() {
        return this.minecraftStartTimeMilis;
    }
    
    public boolean isSnooperRunning() {
        return this.isRunning;
    }
    
    public void startSnooper() {
        if (llIlIlIIllIlIll(this.isRunning ? 1 : 0)) {
            this.isRunning = (PlayerUsageSnooper.lIIlIlllllllII[1] != 0);
            this.func_152766_h();
            this.threadTrigger.schedule(new TimerTask() {
                private static final /* synthetic */ String[] lIllIlllllllll;
                private static final /* synthetic */ int[] lIlllIIIIIIIII;
                
                private static void lIIIIIIIllIIIIll() {
                    (lIlllIIIIIIIII = new int[3])[0] = ((0x3F ^ 0x25 ^ (0x7E ^ 0x7)) & (0xA6 ^ 0xB0 ^ (0x31 ^ 0x44) ^ -" ".length()));
                    PlayerUsageSnooper$1.lIlllIIIIIIIII[1] = " ".length();
                    PlayerUsageSnooper$1.lIlllIIIIIIIII[2] = "  ".length();
                }
                
                private static boolean lIIIIIIIllIIIllI(final int llllllllllllIllllllIIIIIIlIIlIll, final int llllllllllllIllllllIIIIIIlIIlIlI) {
                    return llllllllllllIllllllIIIIIIlIIlIll < llllllllllllIllllllIIIIIIlIIlIlI;
                }
                
                private static String lIIIIIIIllIIIIIl(String llllllllllllIllllllIIIIIIlIlIllI, final String llllllllllllIllllllIIIIIIlIlIlIl) {
                    llllllllllllIllllllIIIIIIlIlIllI = new String(Base64.getDecoder().decode(llllllllllllIllllllIIIIIIlIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                    final StringBuilder llllllllllllIllllllIIIIIIlIllIIl = new StringBuilder();
                    final char[] llllllllllllIllllllIIIIIIlIllIII = llllllllllllIllllllIIIIIIlIlIlIl.toCharArray();
                    int llllllllllllIllllllIIIIIIlIlIlll = PlayerUsageSnooper$1.lIlllIIIIIIIII[0];
                    final int llllllllllllIllllllIIIIIIlIlIIIl = (Object)llllllllllllIllllllIIIIIIlIlIllI.toCharArray();
                    final String llllllllllllIllllllIIIIIIlIlIIII = (String)llllllllllllIllllllIIIIIIlIlIIIl.length;
                    byte llllllllllllIllllllIIIIIIlIIllll = (byte)PlayerUsageSnooper$1.lIlllIIIIIIIII[0];
                    while (lIIIIIIIllIIIllI(llllllllllllIllllllIIIIIIlIIllll, (int)llllllllllllIllllllIIIIIIlIlIIII)) {
                        final char llllllllllllIllllllIIIIIIlIlllII = llllllllllllIllllllIIIIIIlIlIIIl[llllllllllllIllllllIIIIIIlIIllll];
                        llllllllllllIllllllIIIIIIlIllIIl.append((char)(llllllllllllIllllllIIIIIIlIlllII ^ llllllllllllIllllllIIIIIIlIllIII[llllllllllllIllllllIIIIIIlIlIlll % llllllllllllIllllllIIIIIIlIllIII.length]));
                        "".length();
                        ++llllllllllllIllllllIIIIIIlIlIlll;
                        ++llllllllllllIllllllIIIIIIlIIllll;
                        "".length();
                        if ("  ".length() < 0) {
                            return null;
                        }
                    }
                    return String.valueOf(llllllllllllIllllllIIIIIIlIllIIl);
                }
                
                private static boolean lIIIIIIIllIIIlII(final int llllllllllllIllllllIIIIIIlIIlIII) {
                    return llllllllllllIllllllIIIIIIlIIlIII != 0;
                }
                
                private static void lIIIIIIIllIIIIlI() {
                    (lIllIlllllllll = new String[PlayerUsageSnooper$1.lIlllIIIIIIIII[2]])[PlayerUsageSnooper$1.lIlllIIIIIIIII[0]] = lIIIIIIIllIIIIIl("Nig4JyAgNAgrPzAoIw==", "EFWHP");
                    PlayerUsageSnooper$1.lIllIlllllllll[PlayerUsageSnooper$1.lIlllIIIIIIIII[1]] = lIIIIIIIllIIIIIl("HQYhDBkLGhEXBgUNIA==", "nhNci");
                }
                
                static {
                    lIIIIIIIllIIIIll();
                    lIIIIIIIllIIIIlI();
                }
                
                @Override
                public void run() {
                    // 
                    // This method could not be decompiled.
                    // 
                    // Original Bytecode:
                    // 
                    //     1: getfield        net/minecraft/profiler/PlayerUsageSnooper$1.this$0:Lnet/minecraft/profiler/PlayerUsageSnooper;
                    //     4: invokestatic    net/minecraft/profiler/PlayerUsageSnooper.access$0:(Lnet/minecraft/profiler/PlayerUsageSnooper;)Lnet/minecraft/profiler/IPlayerUsage;
                    //     7: invokeinterface net/minecraft/profiler/IPlayerUsage.isSnooperEnabled:()Z
                    //    12: invokestatic    net/minecraft/profiler/PlayerUsageSnooper$1.lIIIIIIIllIIIlII:(I)Z
                    //    15: ifeq            182
                    //    18: aload_0         /* llllllllllllIllllllIIIIIIllIlIII */
                    //    19: getfield        net/minecraft/profiler/PlayerUsageSnooper$1.this$0:Lnet/minecraft/profiler/PlayerUsageSnooper;
                    //    22: invokestatic    net/minecraft/profiler/PlayerUsageSnooper.access$1:(Lnet/minecraft/profiler/PlayerUsageSnooper;)Ljava/lang/Object;
                    //    25: dup            
                    //    26: astore_2        /* llllllllllllIllllllIIIIIIllIIllI */
                    //    27: monitorenter   
                    //    28: aload_0         /* llllllllllllIllllllIIIIIIllIlIII */
                    //    29: getfield        net/minecraft/profiler/PlayerUsageSnooper$1.this$0:Lnet/minecraft/profiler/PlayerUsageSnooper;
                    //    32: invokestatic    net/minecraft/profiler/PlayerUsageSnooper.access$2:(Lnet/minecraft/profiler/PlayerUsageSnooper;)Ljava/util/Map;
                    //    35: invokestatic    com/google/common/collect/Maps.newHashMap:(Ljava/util/Map;)Ljava/util/HashMap;
                    //    38: astore_1        /* llllllllllllIllllllIIIIIIllIlIlI */
                    //    39: aload_0         /* llllllllllllIllllllIIIIIIllIlIII */
                    //    40: getfield        net/minecraft/profiler/PlayerUsageSnooper$1.this$0:Lnet/minecraft/profiler/PlayerUsageSnooper;
                    //    43: invokestatic    net/minecraft/profiler/PlayerUsageSnooper.access$3:(Lnet/minecraft/profiler/PlayerUsageSnooper;)I
                    //    46: invokestatic    net/minecraft/profiler/PlayerUsageSnooper$1.lIIIIIIIllIIIlIl:(I)Z
                    //    49: ifeq            65
                    //    52: aload_1         /* llllllllllllIllllllIIIIIIllIlIlI */
                    //    53: aload_0         /* llllllllllllIllllllIIIIIIllIlIII */
                    //    54: getfield        net/minecraft/profiler/PlayerUsageSnooper$1.this$0:Lnet/minecraft/profiler/PlayerUsageSnooper;
                    //    57: invokestatic    net/minecraft/profiler/PlayerUsageSnooper.access$4:(Lnet/minecraft/profiler/PlayerUsageSnooper;)Ljava/util/Map;
                    //    60: invokeinterface java/util/Map.putAll:(Ljava/util/Map;)V
                    //    65: aload_1         /* llllllllllllIllllllIIIIIIllIlIlI */
                    //    66: getstatic       net/minecraft/profiler/PlayerUsageSnooper$1.lIllIlllllllll:[Ljava/lang/String;
                    //    69: getstatic       net/minecraft/profiler/PlayerUsageSnooper$1.lIlllIIIIIIIII:[I
                    //    72: iconst_0       
                    //    73: iaload         
                    //    74: aaload         
                    //    75: aload_0         /* llllllllllllIllllllIIIIIIllIlIII */
                    //    76: getfield        net/minecraft/profiler/PlayerUsageSnooper$1.this$0:Lnet/minecraft/profiler/PlayerUsageSnooper;
                    //    79: dup            
                    //    80: invokestatic    net/minecraft/profiler/PlayerUsageSnooper.access$3:(Lnet/minecraft/profiler/PlayerUsageSnooper;)I
                    //    83: dup_x1         
                    //    84: getstatic       net/minecraft/profiler/PlayerUsageSnooper$1.lIlllIIIIIIIII:[I
                    //    87: iconst_1       
                    //    88: iaload         
                    //    89: iadd           
                    //    90: invokestatic    net/minecraft/profiler/PlayerUsageSnooper.access$5:(Lnet/minecraft/profiler/PlayerUsageSnooper;I)V
                    //    93: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
                    //    96: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
                    //   101: ldc             ""
                    //   103: invokevirtual   java/lang/String.length:()I
                    //   106: pop2           
                    //   107: aload_1         /* llllllllllllIllllllIIIIIIllIlIlI */
                    //   108: getstatic       net/minecraft/profiler/PlayerUsageSnooper$1.lIllIlllllllll:[Ljava/lang/String;
                    //   111: getstatic       net/minecraft/profiler/PlayerUsageSnooper$1.lIlllIIIIIIIII:[I
                    //   114: iconst_1       
                    //   115: iaload         
                    //   116: aaload         
                    //   117: aload_0         /* llllllllllllIllllllIIIIIIllIlIII */
                    //   118: getfield        net/minecraft/profiler/PlayerUsageSnooper$1.this$0:Lnet/minecraft/profiler/PlayerUsageSnooper;
                    //   121: invokestatic    net/minecraft/profiler/PlayerUsageSnooper.access$6:(Lnet/minecraft/profiler/PlayerUsageSnooper;)Ljava/lang/String;
                    //   124: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
                    //   129: ldc             ""
                    //   131: invokevirtual   java/lang/String.length:()I
                    //   134: pop2           
                    //   135: aload_2         /* llllllllllllIllllllIIIIIIllIIllI */
                    //   136: monitorexit    
                    //   137: ldc             ""
                    //   139: invokevirtual   java/lang/String.length:()I
                    //   142: pop            
                    //   143: ldc             " "
                    //   145: invokevirtual   java/lang/String.length:()I
                    //   148: ldc             " "
                    //   150: invokevirtual   java/lang/String.length:()I
                    //   153: if_icmpeq       160
                    //   156: return         
                    //   157: aload_2         /* llllllllllllIllllllIIIIIIllIIllI */
                    //   158: monitorexit    
                    //   159: athrow         
                    //   160: aload_0         /* llllllllllllIllllllIIIIIIllIlIII */
                    //   161: getfield        net/minecraft/profiler/PlayerUsageSnooper$1.this$0:Lnet/minecraft/profiler/PlayerUsageSnooper;
                    //   164: invokestatic    net/minecraft/profiler/PlayerUsageSnooper.access$7:(Lnet/minecraft/profiler/PlayerUsageSnooper;)Ljava/net/URL;
                    //   167: aload_1         /* llllllllllllIllllllIIIIIIllIlIIl */
                    //   168: getstatic       net/minecraft/profiler/PlayerUsageSnooper$1.lIlllIIIIIIIII:[I
                    //   171: iconst_1       
                    //   172: iaload         
                    //   173: invokestatic    net/minecraft/util/HttpUtil.postMap:(Ljava/net/URL;Ljava/util/Map;Z)Ljava/lang/String;
                    //   176: ldc             ""
                    //   178: invokevirtual   java/lang/String.length:()I
                    //   181: pop2           
                    //   182: return         
                    //    StackMapTable: 00 04 FD 00 41 07 00 D7 07 00 D9 FF 00 5B 00 03 07 00 02 00 07 00 D9 00 01 07 00 DB FF 00 02 00 03 07 00 02 07 00 D7 07 00 D9 00 00 F9 00 15
                    //    Exceptions:
                    //  Try           Handler
                    //  Start  End    Start  End    Type
                    //  -----  -----  -----  -----  ----
                    //  28     137    157    160    Any
                    //  157    159    157    160    Any
                    // 
                    // The error that occurred was:
                    // 
                    // java.lang.NullPointerException
                    // 
                    throw new IllegalStateException("An error occurred while decompiling this method.");
                }
                
                private static boolean lIIIIIIIllIIIlIl(final int llllllllllllIllllllIIIIIIlIIIllI) {
                    return llllllllllllIllllllIIIIIIlIIIllI == 0;
                }
            }, 0L, 900000L);
        }
    }
    
    private static boolean llIlIlIIllIllIl(final int lllllllllllllIIlIlllllIlIIIllIll, final int lllllllllllllIIlIlllllIlIIIllIlI) {
        return lllllllllllllIIlIlllllIlIIIllIll < lllllllllllllIIlIlllllIlIIIllIlI;
    }
    
    public String getUniqueID() {
        return this.uniqueID;
    }
    
    private static String llIlIlIIlIIllll(final String lllllllllllllIIlIlllllIlIlIIlIII, final String lllllllllllllIIlIlllllIlIlIIIlll) {
        try {
            final SecretKeySpec lllllllllllllIIlIlllllIlIlIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlllllIlIlIIIlll.getBytes(StandardCharsets.UTF_8)), PlayerUsageSnooper.lIIlIlllllllII[8]), "DES");
            final Cipher lllllllllllllIIlIlllllIlIlIIlIlI = Cipher.getInstance("DES");
            lllllllllllllIIlIlllllIlIlIIlIlI.init(PlayerUsageSnooper.lIIlIlllllllII[2], lllllllllllllIIlIlllllIlIlIIlIll);
            return new String(lllllllllllllIIlIlllllIlIlIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlllllIlIlIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlllllIlIlIIlIIl) {
            lllllllllllllIIlIlllllIlIlIIlIIl.printStackTrace();
            return null;
        }
    }
    
    private static void llIlIlIIllIlIlI() {
        (lIIlIlllllllII = new int[24])[0] = ((0xD6 ^ 0x8D) & ~(0x35 ^ 0x6E));
        PlayerUsageSnooper.lIIlIlllllllII[1] = " ".length();
        PlayerUsageSnooper.lIIlIlllllllII[2] = "  ".length();
        PlayerUsageSnooper.lIIlIlllllllII[3] = "   ".length();
        PlayerUsageSnooper.lIIlIlllllllII[4] = (0x3B ^ 0x5B ^ (0x7B ^ 0x1F));
        PlayerUsageSnooper.lIIlIlllllllII[5] = (0x61 ^ 0x64);
        PlayerUsageSnooper.lIIlIlllllllII[6] = (0x9B ^ 0x9D);
        PlayerUsageSnooper.lIIlIlllllllII[7] = (27 + 4 + 98 + 40 ^ 96 + 74 - 98 + 102);
        PlayerUsageSnooper.lIIlIlllllllII[8] = (0x60 ^ 0x68);
        PlayerUsageSnooper.lIIlIlllllllII[9] = (0x7B ^ 0x72);
        PlayerUsageSnooper.lIIlIlllllllII[10] = (115 + 157 - 106 + 7 ^ 92 + 60 - 52 + 67);
        PlayerUsageSnooper.lIIlIlllllllII[11] = (0x3E ^ 0x78 ^ (0xF7 ^ 0xBA));
        PlayerUsageSnooper.lIIlIlllllllII[12] = (0x3F ^ 0x33);
        PlayerUsageSnooper.lIIlIlllllllII[13] = (0x9A ^ 0x97);
        PlayerUsageSnooper.lIIlIlllllllII[14] = (0x29 ^ 0x27);
        PlayerUsageSnooper.lIIlIlllllllII[15] = (0xBD ^ 0xB2);
        PlayerUsageSnooper.lIIlIlllllllII[16] = (0x64 ^ 0x74);
        PlayerUsageSnooper.lIIlIlllllllII[17] = (0xC ^ 0x1D);
        PlayerUsageSnooper.lIIlIlllllllII[18] = (0x3E ^ 0x2C);
        PlayerUsageSnooper.lIIlIlllllllII[19] = (0x4B ^ 0x12 ^ (0x5E ^ 0x14));
        PlayerUsageSnooper.lIIlIlllllllII[20] = (0xFD ^ 0x93 ^ (0xD6 ^ 0xAC));
        PlayerUsageSnooper.lIIlIlllllllII[21] = (0xB4 ^ 0xA1);
        PlayerUsageSnooper.lIIlIlllllllII[22] = (0x72 ^ 0xE ^ (0x7D ^ 0x17));
        PlayerUsageSnooper.lIIlIlllllllII[23] = (142 + 27 - 117 + 95 ^ 27 + 79 - 105 + 131);
    }
    
    public void addClientStat(final String lllllllllllllIIlIlllllIllIIIlIIl, final Object lllllllllllllIIlIlllllIllIIIlIll) {
        synchronized (this.syncLock) {
            this.field_152774_b.put(lllllllllllllIIlIlllllIllIIIlIIl, lllllllllllllIIlIlllllIllIIIlIll);
            "".length();
            // monitorexit(this.syncLock)
            "".length();
            if ("  ".length() < "  ".length()) {
                return;
            }
        }
    }
    
    private static void llIlIlIIlIllIlI() {
        (lIIlIlllllIlII = new String[PlayerUsageSnooper.lIIlIlllllllII[23]])[PlayerUsageSnooper.lIIlIlllllllII[0]] = llIlIlIIlIIlllI("Nwo2CT8BFnkyJgkBKw==", "ddYfO");
        PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[1]] = llIlIlIIlIIlllI("OT0iJlZ+ZiU4Az45eDsFPyw1JA03PXg4CSVm", "QIVVl");
        PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[2]] = llIlIlIIlIIlllI("RiMCHjEQOglR", "yUglB");
        PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[3]] = llIlIlIIlIIlllI("GTgMFzwPJDwMIwEzDQ==", "jVcxL");
        PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[4]] = llIlIlIIlIIlllI("FyUsFRgBORwOBw8uLQ==", "dKCzh");
        PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[5]] = llIlIlIIlIIllll("8zZiDjH5gMk=", "TrqKw");
        PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[6]] = llIlIlIIlIIlllI("LSdaAQkvMQ==", "BTtoh");
        PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[7]] = llIlIlIIlIlIIlI("TWvpwVLDKVuLTNYx6fpDMA==", "fWPZV");
        PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[8]] = llIlIlIIlIIlllI("FhZJED8LFg4JNA==", "yegfZ");
        PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[9]] = llIlIlIIlIIllll("v1o6QV5n6/MK0Kevy770cA==", "oFkSq");
        PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[10]] = llIlIlIIlIlIIlI("9yHN4qP7ED8=", "gMCjQ");
        PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[11]] = llIlIlIIlIlIIlI("78Y++//tKqkiC7gXMHcDrQ==", "hbGcf");
        PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[12]] = llIlIlIIlIlIIlI("Q3nveIVO7xz0mcJNhluk2w==", "FEXXc");
        PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[13]] = llIlIlIIlIIllll("B3pMiEAIdco=", "JAoJn");
        PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[14]] = llIlIlIIlIIlllI("Zn9oYlA=", "WQPLh");
        PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[15]] = llIlIlIIlIlIIlI("bc8OpD3hsEs=", "nOhUm");
        PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[16]] = llIlIlIIlIIlllI("IjssLRY6Kho=", "HMArw");
        PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[17]] = llIlIlIIlIIlllI("Kw==", "vHjgq");
        PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[18]] = llIlIlIIlIlIIlI("YLgKo/Ejh7Brdkg9AdCQtg==", "fACkN");
        PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[19]] = llIlIlIIlIIlllI("GBUZKRsMLwApHRQc", "uptFi");
        PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[20]] = llIlIlIIlIIllll("wR15qSvl/fBT+dWiwiyUEA==", "TcYfQ");
        PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[21]] = llIlIlIIlIIllll("2+MLqBM74j2HTI0Fd1aH7Q==", "USRsR");
        PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[22]] = llIlIlIIlIlIIlI("59m5dFXc1sr+xpMSFdLZtg==", "DjGGs");
    }
    
    public void addMemoryStatsToSnooper() {
        this.addStatToSnooper(PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[19]], Runtime.getRuntime().totalMemory());
        this.addStatToSnooper(PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[20]], Runtime.getRuntime().maxMemory());
        this.addStatToSnooper(PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[21]], Runtime.getRuntime().freeMemory());
        this.addStatToSnooper(PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[22]], Runtime.getRuntime().availableProcessors());
        this.playerStatsCollector.addServerStatsToSnooper(this);
    }
    
    public void addStatToSnooper(final String lllllllllllllIIlIlllllIllIIIIIIl, final Object lllllllllllllIIlIlllllIllIIIIIII) {
        synchronized (this.syncLock) {
            this.field_152773_a.put(lllllllllllllIIlIlllllIllIIIIIIl, lllllllllllllIIlIlllllIllIIIIIII);
            "".length();
            // monitorexit(this.syncLock)
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
    }
    
    public Map<String, String> getCurrentStats() {
        final Map<String, String> lllllllllllllIIlIlllllIlIlllIlIl = (Map<String, String>)Maps.newLinkedHashMap();
        synchronized (this.syncLock) {
            this.addMemoryStatsToSnooper();
            boolean lllllllllllllIIlIlllllIlIllIlllI = (boolean)this.field_152773_a.entrySet().iterator();
            "".length();
            if ("  ".length() == "   ".length()) {
                return null;
            }
            while (!llIlIlIIllIlIll(((Iterator)lllllllllllllIIlIlllllIlIllIlllI).hasNext() ? 1 : 0)) {
                final Map.Entry<String, Object> lllllllllllllIIlIlllllIlIlllIlII = ((Iterator<Map.Entry<String, Object>>)lllllllllllllIIlIlllllIlIllIlllI).next();
                lllllllllllllIIlIlllllIlIlllIlIl.put(lllllllllllllIIlIlllllIlIlllIlII.getKey(), lllllllllllllIIlIlllllIlIlllIlII.getValue().toString());
                "".length();
            }
            lllllllllllllIIlIlllllIlIllIlllI = (boolean)this.field_152774_b.entrySet().iterator();
            "".length();
            if ("  ".length() <= -" ".length()) {
                return null;
            }
            while (!llIlIlIIllIlIll(((Iterator)lllllllllllllIIlIlllllIlIllIlllI).hasNext() ? 1 : 0)) {
                final Map.Entry<String, Object> lllllllllllllIIlIlllllIlIlllIIll = ((Iterator<Map.Entry<String, Object>>)lllllllllllllIIlIlllllIlIllIlllI).next();
                lllllllllllllIIlIlllllIlIlllIlIl.put(lllllllllllllIIlIlllllIlIlllIIll.getKey(), lllllllllllllIIlIlllllIlIlllIIll.getValue().toString());
                "".length();
            }
            // monitorexit(this.syncLock)
            return lllllllllllllIIlIlllllIlIlllIlIl;
        }
    }
    
    private void func_152766_h() {
        this.addJvmArgsToSnooper();
        this.addClientStat(PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[3]], this.uniqueID);
        this.addStatToSnooper(PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[4]], this.uniqueID);
        this.addStatToSnooper(PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[5]], System.getProperty(PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[6]]));
        this.addStatToSnooper(PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[7]], System.getProperty(PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[8]]));
        this.addStatToSnooper(PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[9]], System.getProperty(PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[10]]));
        this.addStatToSnooper(PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[11]], System.getProperty(PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[12]]));
        this.addClientStat(PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[13]], PlayerUsageSnooper.lIIlIlllllIlII[PlayerUsageSnooper.lIIlIlllllllII[14]]);
        this.playerStatsCollector.addServerTypeToSnooper(this);
    }
    
    private static boolean llIlIlIIllIlIll(final int lllllllllllllIIlIlllllIlIIIlIllI) {
        return lllllllllllllIIlIlllllIlIIIlIllI == 0;
    }
}
