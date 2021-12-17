// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.net.ServerSocket;
import java.util.Iterator;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import org.apache.commons.io.FileUtils;
import java.net.HttpURLConnection;
import com.google.common.util.concurrent.ListenableFuture;
import java.net.Proxy;
import java.io.File;
import org.apache.logging.log4j.LogManager;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executors;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.atomic.AtomicInteger;
import com.google.common.util.concurrent.ListeningExecutorService;
import org.apache.logging.log4j.Logger;

public class HttpUtil
{
    private static final /* synthetic */ String[] llIIlllIIlIIIl;
    private static final /* synthetic */ int[] llIIlllIIlIIlI;
    private static final /* synthetic */ Logger logger;
    public static final /* synthetic */ ListeningExecutorService field_180193_a;
    
    private static String lIIIllllIllIlllI(String llllllllllllIllIlllllIIlIIIllIll, final String llllllllllllIllIlllllIIlIIIllIlI) {
        llllllllllllIllIlllllIIlIIIllIll = new String(Base64.getDecoder().decode(llllllllllllIllIlllllIIlIIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlllllIIlIIIllllI = new StringBuilder();
        final char[] llllllllllllIllIlllllIIlIIIlllIl = llllllllllllIllIlllllIIlIIIllIlI.toCharArray();
        int llllllllllllIllIlllllIIlIIIlllII = HttpUtil.llIIlllIIlIIlI[1];
        final Exception llllllllllllIllIlllllIIlIIIlIllI = (Object)llllllllllllIllIlllllIIlIIIllIll.toCharArray();
        final char llllllllllllIllIlllllIIlIIIlIlIl = (char)llllllllllllIllIlllllIIlIIIlIllI.length;
        String llllllllllllIllIlllllIIlIIIlIlII = (String)HttpUtil.llIIlllIIlIIlI[1];
        while (lIIIllllIlllIllI((int)llllllllllllIllIlllllIIlIIIlIlII, llllllllllllIllIlllllIIlIIIlIlIl)) {
            final char llllllllllllIllIlllllIIlIIlIIIIl = llllllllllllIllIlllllIIlIIIlIllI[llllllllllllIllIlllllIIlIIIlIlII];
            llllllllllllIllIlllllIIlIIIllllI.append((char)(llllllllllllIllIlllllIIlIIlIIIIl ^ llllllllllllIllIlllllIIlIIIlllIl[llllllllllllIllIlllllIIlIIIlllII % llllllllllllIllIlllllIIlIIIlllIl.length]));
            "".length();
            ++llllllllllllIllIlllllIIlIIIlllII;
            ++llllllllllllIllIlllllIIlIIIlIlII;
            "".length();
            if (((0x4D ^ 0x1B) & ~(0x96 ^ 0xC0)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlllllIIlIIIllllI);
    }
    
    private static String post(final URL llllllllllllIllIlllllIIlIllllIlI, final String llllllllllllIllIlllllIIlIllllIIl, final boolean llllllllllllIllIlllllIIlIllIllIl) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    net/minecraft/util/HttpUtil.lIIIllllIlllIlIl:(Ljava/lang/Object;)Z
        //     6: ifeq            32
        //     9: aconst_null    
        //    10: ldc             ""
        //    12: invokevirtual   java/lang/String.length:()I
        //    15: pop            
        //    16: ldc             " "
        //    18: invokevirtual   java/lang/String.length:()I
        //    21: ineg           
        //    22: ldc             "   "
        //    24: invokevirtual   java/lang/String.length:()I
        //    27: if_icmple       38
        //    30: aconst_null    
        //    31: areturn        
        //    32: invokestatic    net/minecraft/server/MinecraftServer.getServer:()Lnet/minecraft/server/MinecraftServer;
        //    35: invokevirtual   net/minecraft/server/MinecraftServer.getServerProxy:()Ljava/net/Proxy;
        //    38: astore_3        /* llllllllllllIllIlllllIIlIlllIlll */
        //    39: aload_3         /* llllllllllllIllIlllllIIlIlllIlll */
        //    40: invokestatic    net/minecraft/util/HttpUtil.lIIIllllIlllIlIl:(Ljava/lang/Object;)Z
        //    43: ifeq            50
        //    46: getstatic       java/net/Proxy.NO_PROXY:Ljava/net/Proxy;
        //    49: astore_3        /* llllllllllllIllIlllllIIlIlllIlll */
        //    50: aload_0         /* llllllllllllIllIlllllIIlIllIllll */
        //    51: aload_3         /* llllllllllllIllIlllllIIlIlllIlll */
        //    52: invokevirtual   java/net/URL.openConnection:(Ljava/net/Proxy;)Ljava/net/URLConnection;
        //    55: checkcast       Ljava/net/HttpURLConnection;
        //    58: astore          llllllllllllIllIlllllIIlIlllIllI
        //    60: aload           llllllllllllIllIlllllIIlIlllIllI
        //    62: getstatic       net/minecraft/util/HttpUtil.llIIlllIIlIIIl:[Ljava/lang/String;
        //    65: getstatic       net/minecraft/util/HttpUtil.llIIlllIIlIIlI:[I
        //    68: iconst_5       
        //    69: iaload         
        //    70: aaload         
        //    71: invokevirtual   java/net/HttpURLConnection.setRequestMethod:(Ljava/lang/String;)V
        //    74: aload           llllllllllllIllIlllllIIlIlllIllI
        //    76: getstatic       net/minecraft/util/HttpUtil.llIIlllIIlIIIl:[Ljava/lang/String;
        //    79: getstatic       net/minecraft/util/HttpUtil.llIIlllIIlIIlI:[I
        //    82: bipush          6
        //    84: iaload         
        //    85: aaload         
        //    86: getstatic       net/minecraft/util/HttpUtil.llIIlllIIlIIIl:[Ljava/lang/String;
        //    89: getstatic       net/minecraft/util/HttpUtil.llIIlllIIlIIlI:[I
        //    92: bipush          7
        //    94: iaload         
        //    95: aaload         
        //    96: invokevirtual   java/net/HttpURLConnection.setRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //    99: aload           llllllllllllIllIlllllIIlIlllIllI
        //   101: getstatic       net/minecraft/util/HttpUtil.llIIlllIIlIIIl:[Ljava/lang/String;
        //   104: getstatic       net/minecraft/util/HttpUtil.llIIlllIIlIIlI:[I
        //   107: bipush          8
        //   109: iaload         
        //   110: aaload         
        //   111: new             Ljava/lang/StringBuilder;
        //   114: dup            
        //   115: invokespecial   java/lang/StringBuilder.<init>:()V
        //   118: aload_1         /* llllllllllllIllIlllllIIlIllIlllI */
        //   119: invokevirtual   java/lang/String.getBytes:()[B
        //   122: arraylength    
        //   123: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   126: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   129: invokevirtual   java/net/HttpURLConnection.setRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   132: aload           llllllllllllIllIlllllIIlIlllIllI
        //   134: getstatic       net/minecraft/util/HttpUtil.llIIlllIIlIIIl:[Ljava/lang/String;
        //   137: getstatic       net/minecraft/util/HttpUtil.llIIlllIIlIIlI:[I
        //   140: bipush          9
        //   142: iaload         
        //   143: aaload         
        //   144: getstatic       net/minecraft/util/HttpUtil.llIIlllIIlIIIl:[Ljava/lang/String;
        //   147: getstatic       net/minecraft/util/HttpUtil.llIIlllIIlIIlI:[I
        //   150: bipush          10
        //   152: iaload         
        //   153: aaload         
        //   154: invokevirtual   java/net/HttpURLConnection.setRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   157: aload           llllllllllllIllIlllllIIlIlllIllI
        //   159: getstatic       net/minecraft/util/HttpUtil.llIIlllIIlIIlI:[I
        //   162: iconst_1       
        //   163: iaload         
        //   164: invokevirtual   java/net/HttpURLConnection.setUseCaches:(Z)V
        //   167: aload           llllllllllllIllIlllllIIlIlllIllI
        //   169: getstatic       net/minecraft/util/HttpUtil.llIIlllIIlIIlI:[I
        //   172: iconst_0       
        //   173: iaload         
        //   174: invokevirtual   java/net/HttpURLConnection.setDoInput:(Z)V
        //   177: aload           llllllllllllIllIlllllIIlIlllIllI
        //   179: getstatic       net/minecraft/util/HttpUtil.llIIlllIIlIIlI:[I
        //   182: iconst_0       
        //   183: iaload         
        //   184: invokevirtual   java/net/HttpURLConnection.setDoOutput:(Z)V
        //   187: new             Ljava/io/DataOutputStream;
        //   190: dup            
        //   191: aload           llllllllllllIllIlllllIIlIlllIllI
        //   193: invokevirtual   java/net/HttpURLConnection.getOutputStream:()Ljava/io/OutputStream;
        //   196: invokespecial   java/io/DataOutputStream.<init>:(Ljava/io/OutputStream;)V
        //   199: astore          llllllllllllIllIlllllIIlIlllIlIl
        //   201: aload           llllllllllllIllIlllllIIlIlllIlIl
        //   203: aload_1         /* llllllllllllIllIlllllIIlIllIlllI */
        //   204: invokevirtual   java/io/DataOutputStream.writeBytes:(Ljava/lang/String;)V
        //   207: aload           llllllllllllIllIlllllIIlIlllIlIl
        //   209: invokevirtual   java/io/DataOutputStream.flush:()V
        //   212: aload           llllllllllllIllIlllllIIlIlllIlIl
        //   214: invokevirtual   java/io/DataOutputStream.close:()V
        //   217: new             Ljava/io/BufferedReader;
        //   220: dup            
        //   221: new             Ljava/io/InputStreamReader;
        //   224: dup            
        //   225: aload           llllllllllllIllIlllllIIlIlllIllI
        //   227: invokevirtual   java/net/HttpURLConnection.getInputStream:()Ljava/io/InputStream;
        //   230: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //   233: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //   236: astore          llllllllllllIllIlllllIIlIlllIlII
        //   238: new             Ljava/lang/StringBuffer;
        //   241: dup            
        //   242: invokespecial   java/lang/StringBuffer.<init>:()V
        //   245: astore          llllllllllllIllIlllllIIlIlllIIll
        //   247: ldc             ""
        //   249: invokevirtual   java/lang/String.length:()I
        //   252: pop            
        //   253: sipush          253
        //   256: sipush          178
        //   259: ixor           
        //   260: sipush          220
        //   263: sipush          147
        //   266: ixor           
        //   267: iconst_m1      
        //   268: ixor           
        //   269: iand           
        //   270: ifle            305
        //   273: aconst_null    
        //   274: areturn        
        //   275: aload           llllllllllllIllIlllllIIlIlllIIll
        //   277: aload           llllllllllllIllIlllllIIlIlllIIlI
        //   279: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   282: ldc             ""
        //   284: invokevirtual   java/lang/String.length:()I
        //   287: pop2           
        //   288: aload           llllllllllllIllIlllllIIlIlllIIll
        //   290: getstatic       net/minecraft/util/HttpUtil.llIIlllIIlIIlI:[I
        //   293: bipush          11
        //   295: iaload         
        //   296: invokevirtual   java/lang/StringBuffer.append:(C)Ljava/lang/StringBuffer;
        //   299: ldc             ""
        //   301: invokevirtual   java/lang/String.length:()I
        //   304: pop2           
        //   305: aload           llllllllllllIllIlllllIIlIlllIlII
        //   307: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //   310: dup            
        //   311: astore          llllllllllllIllIlllllIIlIlllIIIl
        //   313: invokestatic    net/minecraft/util/HttpUtil.lIIIllllIlllIlIl:(Ljava/lang/Object;)Z
        //   316: ifeq            275
        //   319: aload           llllllllllllIllIlllllIIlIlllIlII
        //   321: invokevirtual   java/io/BufferedReader.close:()V
        //   324: aload           llllllllllllIllIlllllIIlIlllIIll
        //   326: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   329: areturn        
        //   330: astore_3        /* llllllllllllIllIlllllIIlIlllIlll */
        //   331: iload_2         /* llllllllllllIllIlllllIIlIllllIII */
        //   332: invokestatic    net/minecraft/util/HttpUtil.lIIIllllIlllIlII:(I)Z
        //   335: ifeq            371
        //   338: getstatic       net/minecraft/util/HttpUtil.logger:Lorg/apache/logging/log4j/Logger;
        //   341: new             Ljava/lang/StringBuilder;
        //   344: dup            
        //   345: getstatic       net/minecraft/util/HttpUtil.llIIlllIIlIIIl:[Ljava/lang/String;
        //   348: getstatic       net/minecraft/util/HttpUtil.llIIlllIIlIIlI:[I
        //   351: bipush          12
        //   353: iaload         
        //   354: aaload         
        //   355: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   358: aload_0         /* llllllllllllIllIlllllIIlIllIllll */
        //   359: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   362: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   365: aload_3         /* llllllllllllIllIlllllIIlIlllIIII */
        //   366: invokeinterface org/apache/logging/log4j/Logger.error:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   371: getstatic       net/minecraft/util/HttpUtil.llIIlllIIlIIIl:[Ljava/lang/String;
        //   374: getstatic       net/minecraft/util/HttpUtil.llIIlllIIlIIlI:[I
        //   377: bipush          13
        //   379: iaload         
        //   380: aaload         
        //   381: areturn        
        //    StackMapTable: 00 07 20 45 07 00 82 FC 00 0B 07 00 82 FF 00 E0 00 09 07 00 88 07 00 19 01 07 00 82 07 00 8E 07 00 AA 07 00 BC 07 00 CA 07 00 19 00 00 FA 00 1D FF 00 18 00 03 07 00 88 07 00 19 01 00 01 07 00 6E FC 00 28 07 00 6E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      329    330    382    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static boolean lIIIllllIlllIllI(final int llllllllllllIllIlllllIIlIIIIIIll, final int llllllllllllIllIlllllIIlIIIIIIlI) {
        return llllllllllllIllIlllllIIlIIIIIIll < llllllllllllIllIlllllIIlIIIIIIlI;
    }
    
    private static boolean lIIIllllIlllIlII(final int llllllllllllIllIlllllIIIllllllII) {
        return llllllllllllIllIlllllIIIllllllII == 0;
    }
    
    private static void lIIIllllIlllIIII() {
        (llIIlllIIlIIIl = new String[HttpUtil.llIIlllIIlIIlI[16]])[HttpUtil.llIIlllIIlIIlI[1]] = lIIIllllIllIllIl("oBlsfaIicVx3S5yKw2DlJw==", "oWeYV");
        HttpUtil.llIIlllIIlIIIl[HttpUtil.llIIlllIIlIIlI[0]] = lIIIllllIllIllIl("7B5foK7R484=", "MDXWl");
        HttpUtil.llIIlllIIlIIIl[HttpUtil.llIIlllIIlIIlI[4]] = lIIIllllIllIlllI("MyIzaFU=", "fvuEm");
        HttpUtil.llIIlllIIlIIIl[HttpUtil.llIIlllIIlIIlI[5]] = lIIIllllIllIlllI("JR43BQ==", "uQdQk");
        HttpUtil.llIIlllIIlIIIl[HttpUtil.llIIlllIIlIIlI[6]] = lIIIllllIllIllll("EDObhOdcpU0HBzsQzL4WAg==", "DnWKb");
        HttpUtil.llIIlllIIlIIIl[HttpUtil.llIIlllIIlIIlI[7]] = lIIIllllIllIllIl("CCIeAv69VUKzaKUA0YOyVs2ew46WVx6tF5WRuCeN26aB1m4930lx/g==", "ecyHr");
        HttpUtil.llIIlllIIlIIIl[HttpUtil.llIIlllIIlIIlI[8]] = lIIIllllIllIllIl("8iXk2IDKSxowlQ7jC0JgcQ==", "dwieF");
        HttpUtil.llIIlllIIlIIIl[HttpUtil.llIIlllIIlIIlI[9]] = lIIIllllIllIlllI("ATYqNTEsLWkNNSw+MSAzJw==", "BYDAT");
        HttpUtil.llIIlllIIlIIIl[HttpUtil.llIIlllIIlIIlI[10]] = lIIIllllIllIllll("opkIL1+dCKA=", "KlLda");
        HttpUtil.llIIlllIIlIIIl[HttpUtil.llIIlllIIlIIlI[12]] = lIIIllllIllIlllI("LjcGIh5NNhw6Wh03ADpaGTdT", "mXsNz");
        HttpUtil.llIIlllIIlIIIl[HttpUtil.llIIlllIIlIIlI[13]] = lIIIllllIllIlllI("", "gniQd");
        HttpUtil.llIIlllIIlIIIl[HttpUtil.llIIlllIIlIIlI[15]] = lIIIllllIllIllll("AYq6l2pTAaQ=", "tQzrQ");
    }
    
    private static boolean lIIIllllIlllIIlI(final int llllllllllllIllIlllllIIIlllllIlI) {
        return llllllllllllIllIlllllIIIlllllIlI > 0;
    }
    
    private static String lIIIllllIllIllll(final String llllllllllllIllIlllllIIlIIIIlIll, final String llllllllllllIllIlllllIIlIIIIlIlI) {
        try {
            final SecretKeySpec llllllllllllIllIlllllIIlIIIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllllIIlIIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlllllIIlIIIIllIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIlllllIIlIIIIllIl.init(HttpUtil.llIIlllIIlIIlI[4], llllllllllllIllIlllllIIlIIIIlllI);
            return new String(llllllllllllIllIlllllIIlIIIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllllIIlIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllllIIlIIIIllII) {
            llllllllllllIllIlllllIIlIIIIllII.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIllllIllIllIl(final String llllllllllllIllIlllllIIlIIlIlllI, final String llllllllllllIllIlllllIIlIIlIllll) {
        try {
            final SecretKeySpec llllllllllllIllIlllllIIlIIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllllIIlIIlIllll.getBytes(StandardCharsets.UTF_8)), HttpUtil.llIIlllIIlIIlI[10]), "DES");
            final Cipher llllllllllllIllIlllllIIlIIllIIlI = Cipher.getInstance("DES");
            llllllllllllIllIlllllIIlIIllIIlI.init(HttpUtil.llIIlllIIlIIlI[4], llllllllllllIllIlllllIIlIIllIIll);
            return new String(llllllllllllIllIlllllIIlIIllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllllIIlIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllllIIlIIllIIIl) {
            llllllllllllIllIlllllIIlIIllIIIl.printStackTrace();
            return null;
        }
    }
    
    public static String buildPostString(final Map<String, Object> llllllllllllIllIlllllIIllIIlIllI) {
        final StringBuilder llllllllllllIllIlllllIIllIIlIlIl = new StringBuilder();
        final char llllllllllllIllIlllllIIllIIIlllI = (char)llllllllllllIllIlllllIIllIIlIllI.entrySet().iterator();
        "".length();
        if ("  ".length() <= 0) {
            return null;
        }
        while (!lIIIllllIlllIlII(((Iterator)llllllllllllIllIlllllIIllIIIlllI).hasNext() ? 1 : 0)) {
            final Map.Entry<String, Object> llllllllllllIllIlllllIIllIIlIlII = ((Iterator<Map.Entry<String, Object>>)llllllllllllIllIlllllIIllIIIlllI).next();
            if (lIIIllllIlllIIlI(llllllllllllIllIlllllIIllIIlIlIl.length())) {
                llllllllllllIllIlllllIIllIIlIlIl.append((char)HttpUtil.llIIlllIIlIIlI[2]);
                "".length();
            }
            try {
                llllllllllllIllIlllllIIllIIlIlIl.append(URLEncoder.encode(llllllllllllIllIlllllIIllIIlIlII.getKey(), HttpUtil.llIIlllIIlIIIl[HttpUtil.llIIlllIIlIIlI[0]]));
                "".length();
                "".length();
                if (((83 + 25 - 83 + 222 ^ 77 + 141 - 164 + 97) & (99 + 34 - 94 + 197 ^ 46 + 74 - 117 + 137 ^ -" ".length())) == " ".length()) {
                    return null;
                }
            }
            catch (UnsupportedEncodingException llllllllllllIllIlllllIIllIIlIIll) {
                llllllllllllIllIlllllIIllIIlIIll.printStackTrace();
            }
            if (lIIIllllIlllIIll(llllllllllllIllIlllllIIllIIlIlII.getValue())) {
                llllllllllllIllIlllllIIllIIlIlIl.append((char)HttpUtil.llIIlllIIlIIlI[3]);
                "".length();
                try {
                    llllllllllllIllIlllllIIllIIlIlIl.append(URLEncoder.encode(llllllllllllIllIlllllIIllIIlIlII.getValue().toString(), HttpUtil.llIIlllIIlIIIl[HttpUtil.llIIlllIIlIIlI[4]]));
                    "".length();
                    "".length();
                    if (((59 + 153 - 97 + 42 ^ 1 + 24 + 54 + 63) & (149 + 105 - 210 + 120 ^ 175 + 24 - 143 + 127 ^ -" ".length())) == (190 + 160 - 227 + 68 ^ 177 + 86 - 222 + 146)) {
                        return null;
                    }
                    continue;
                }
                catch (UnsupportedEncodingException llllllllllllIllIlllllIIllIIlIIlI) {
                    llllllllllllIllIlllllIIllIIlIIlI.printStackTrace();
                }
            }
        }
        return String.valueOf(llllllllllllIllIlllllIIllIIlIlIl);
    }
    
    public static String postMap(final URL llllllllllllIllIlllllIIllIIIIllI, final Map<String, Object> llllllllllllIllIlllllIIllIIIIlIl, final boolean llllllllllllIllIlllllIIllIIIIlll) {
        return post(llllllllllllIllIlllllIIllIIIIllI, buildPostString(llllllllllllIllIlllllIIllIIIIlIl), llllllllllllIllIlllllIIllIIIIlll);
    }
    
    static {
        lIIIllllIlllIIIl();
        lIIIllllIlllIIII();
        field_180193_a = MoreExecutors.listeningDecorator(Executors.newCachedThreadPool(new ThreadFactoryBuilder().setDaemon((boolean)(HttpUtil.llIIlllIIlIIlI[0] != 0)).setNameFormat(HttpUtil.llIIlllIIlIIIl[HttpUtil.llIIlllIIlIIlI[1]]).build()));
        downloadThreadsStarted = new AtomicInteger(HttpUtil.llIIlllIIlIIlI[1]);
        logger = LogManager.getLogger();
    }
    
    public static ListenableFuture<Object> downloadResourcePack(final File llllllllllllIllIlllllIIlIlIllIII, final String llllllllllllIllIlllllIIlIlIllllI, final Map<String, String> llllllllllllIllIlllllIIlIlIlllIl, final int llllllllllllIllIlllllIIlIlIlIlIl, final IProgressUpdate llllllllllllIllIlllllIIlIlIllIll, final Proxy llllllllllllIllIlllllIIlIlIlIIll) {
        final ListenableFuture<?> llllllllllllIllIlllllIIlIlIllIIl = (ListenableFuture<?>)HttpUtil.field_180193_a.submit((Runnable)new Runnable() {
            private static final /* synthetic */ int[] lIIIIIIIIllIlI;
            private static final /* synthetic */ String[] lIIIIIIIIllIIl;
            
            private static void lIllIIlIlllIIIl() {
                (lIIIIIIIIllIlI = new int[16])[0] = ((0x70 ^ 0x43) & ~(0x3F ^ 0xC));
                HttpUtil$1.lIIIIIIIIllIlI[1] = " ".length();
                HttpUtil$1.lIIIIIIIIllIlI[2] = (0xFFFF917B & 0x7E84);
                HttpUtil$1.lIIIIIIIIllIlI[3] = "  ".length();
                HttpUtil$1.lIIIIIIIIllIlI[4] = "   ".length();
                HttpUtil$1.lIIIIIIIIllIlI[5] = (0x2C ^ 0xC ^ (0xB1 ^ 0x95));
                HttpUtil$1.lIIIIIIIIllIlI[6] = (0x70 ^ 0x75);
                HttpUtil$1.lIIIIIIIIllIlI[7] = (0x0 ^ 0x67 ^ (0xD5 ^ 0xB4));
                HttpUtil$1.lIIIIIIIIllIlI[8] = (6 + 137 + 1 + 5 ^ 105 + 63 - 69 + 47);
                HttpUtil$1.lIIIIIIIIllIlI[9] = (92 + 73 - 148 + 120 ^ 53 + 66 - 17 + 27);
                HttpUtil$1.lIIIIIIIIllIlI[10] = (0x84 ^ 0xAA ^ (0xA5 ^ 0x82));
                HttpUtil$1.lIIIIIIIIllIlI[11] = (0x76 ^ 0x7B ^ (0x16 ^ 0x11));
                HttpUtil$1.lIIIIIIIIllIlI[12] = (0x53 ^ 0x58);
                HttpUtil$1.lIIIIIIIIllIlI[13] = (0xBA ^ 0xB6);
                HttpUtil$1.lIIIIIIIIllIlI[14] = (0x2C ^ 0x6B ^ (0x8D ^ 0xC7));
                HttpUtil$1.lIIIIIIIIllIlI[15] = (0xB9 ^ 0xA4 ^ (0x87 ^ 0x94));
            }
            
            private static String lIllIIlIllIllIl(final String lllllllllllllIlIlIIlIIIllllllIIl, final String lllllllllllllIlIlIIlIIIllllllIII) {
                try {
                    final SecretKeySpec lllllllllllllIlIlIIlIIIllllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIlIIIllllllIII.getBytes(StandardCharsets.UTF_8)), HttpUtil$1.lIIIIIIIIllIlI[9]), "DES");
                    final Cipher lllllllllllllIlIlIIlIIIlllllllIl = Cipher.getInstance("DES");
                    lllllllllllllIlIlIIlIIIlllllllIl.init(HttpUtil$1.lIIIIIIIIllIlI[3], lllllllllllllIlIlIIlIIIllllllllI);
                    return new String(lllllllllllllIlIlIIlIIIlllllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIlIIIllllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIlIlIIlIIIlllllllII) {
                    lllllllllllllIlIlIIlIIIlllllllII.printStackTrace();
                    return null;
                }
            }
            
            private static String lIllIIlIllIllll(String lllllllllllllIlIlIIlIIlIIIIIlIll, final String lllllllllllllIlIlIIlIIlIIIIIllll) {
                lllllllllllllIlIlIIlIIlIIIIIlIll = new String(Base64.getDecoder().decode(lllllllllllllIlIlIIlIIlIIIIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder lllllllllllllIlIlIIlIIlIIIIIlllI = new StringBuilder();
                final char[] lllllllllllllIlIlIIlIIlIIIIIllIl = lllllllllllllIlIlIIlIIlIIIIIllll.toCharArray();
                int lllllllllllllIlIlIIlIIlIIIIIllII = HttpUtil$1.lIIIIIIIIllIlI[0];
                final boolean lllllllllllllIlIlIIlIIlIIIIIIllI = (boolean)(Object)lllllllllllllIlIlIIlIIlIIIIIlIll.toCharArray();
                final long lllllllllllllIlIlIIlIIlIIIIIIlIl = lllllllllllllIlIlIIlIIlIIIIIIllI.length;
                byte lllllllllllllIlIlIIlIIlIIIIIIlII = (byte)HttpUtil$1.lIIIIIIIIllIlI[0];
                while (lIllIIlIllllIIl(lllllllllllllIlIlIIlIIlIIIIIIlII, (int)lllllllllllllIlIlIIlIIlIIIIIIlIl)) {
                    final char lllllllllllllIlIlIIlIIlIIIIlIIIl = lllllllllllllIlIlIIlIIlIIIIIIllI[lllllllllllllIlIlIIlIIlIIIIIIlII];
                    lllllllllllllIlIlIIlIIlIIIIIlllI.append((char)(lllllllllllllIlIlIIlIIlIIIIlIIIl ^ lllllllllllllIlIlIIlIIlIIIIIllIl[lllllllllllllIlIlIIlIIlIIIIIllII % lllllllllllllIlIlIIlIIlIIIIIllIl.length]));
                    "".length();
                    ++lllllllllllllIlIlIIlIIlIIIIIllII;
                    ++lllllllllllllIlIlIIlIIlIIIIIIlII;
                    "".length();
                    if (-" ".length() >= " ".length()) {
                        return null;
                    }
                }
                return String.valueOf(lllllllllllllIlIlIIlIIlIIIIIlllI);
            }
            
            private static void lIllIIlIlllIIII() {
                (lIIIIIIIIllIIl = new String[HttpUtil$1.lIIIIIIIIllIlI[15]])[HttpUtil$1.lIIIIIIIIllIlI[0]] = lIllIIlIllIllIl("NUVKojkwboeKKTJVx9++rFdyV7Ug9PUlyySzF/MFu6I=", "gxKgS");
                HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[1]] = lIllIIlIllIlllI("JCaLX3RetxayfjOq2uBr3oK1FDlF+Zvu", "wNSFT");
                HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[3]] = lIllIIlIllIlllI("QozLdovMB0KmIT8qPbHYksD7qvkgVDOvLu9AYdhFQoo=", "oLbet");
                HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[4]] = lIllIIlIllIlllI("tutJocQdk+y5FeQJxxE7UQ==", "JLqEK");
                HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[5]] = lIllIIlIllIlllI("OPGiPq01yvVvueu59mCiF3/iHkmGlnmzgz+WX/q4bn5dLqB9w2NUbTopF3bUtkI/", "OaDft");
                HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[6]] = lIllIIlIllIllll("cBo8aSAlHm8=", "PlOIO");
                HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[7]] = lIllIIlIllIlllI("NwCe6Jx1l6g=", "gQNPK");
                HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[8]] = lIllIIlIllIlllI("8Y1tABjAD2HsVPTxxcpUEmiEyIXdF/ys48Y0ewaak64QnWykRe4qgW/LW3PyUrVBDz553htLn3c=", "cBsSU");
                HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[9]] = lIllIIlIllIlllI("tsUbxuoz3YD5pg+8SaCjrg==", "JgVMe");
                HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[10]] = lIllIIlIllIlllI("aj055LHKOWU=", "eavBU");
                HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[11]] = lIllIIlIllIllll("IhgiNBQNCytxEAUCbjMOAxYrI0cQGS8/RwkQNjgKERxuMAsIHjk0A0RZKT4TRE9zcQ==", "dqNQg");
                HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[12]] = lIllIIlIllIllIl("k+FJCYfY8Aj1il50X5H0/w==", "JuYPe");
                HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[13]] = lIllIIlIllIlllI("deRnjmClVhw=", "GLArQ");
                HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[14]] = lIllIIlIllIllll("CwseAwcQEBoSEAY=", "BEJFU");
            }
            
            @Override
            public void run() {
                HttpURLConnection lllllllllllllIlIlIIlIIlIIIllIIll = null;
                InputStream lllllllllllllIlIlIIlIIlIIIllIIlI = null;
                OutputStream lllllllllllllIlIlIIlIIlIIIllIIIl = null;
                if (lIllIIlIlllIlII(llllllllllllIllIlllllIIlIlIllIll)) {
                    llllllllllllIllIlllllIIlIlIllIll.resetProgressAndMessage(HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[0]]);
                    llllllllllllIllIlllllIIlIlIllIll.displayLoadingString(HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[1]]);
                }
                try {
                    final byte[] lllllllllllllIlIlIIlIIlIIIllIIII = new byte[HttpUtil$1.lIIIIIIIIllIlI[2]];
                    final URL lllllllllllllIlIlIIlIIlIIIlIllll = new URL(llllllllllllIllIlllllIIlIlIllllI);
                    lllllllllllllIlIlIIlIIlIIIllIIll = (HttpURLConnection)lllllllllllllIlIlIIlIIlIIIlIllll.openConnection(llllllllllllIllIlllllIIlIlIlIIll);
                    float lllllllllllllIlIlIIlIIlIIIlIlllI = 0.0f;
                    float lllllllllllllIlIlIIlIIlIIIlIllIl = (float)llllllllllllIllIlllllIIlIlIlllIl.entrySet().size();
                    final Iterator<Map.Entry<String, String>> iterator = llllllllllllIllIlllllIIlIlIlllIl.entrySet().iterator();
                    "".length();
                    if ("  ".length() > "  ".length()) {
                        return;
                    }
                    while (!lIllIIlIlllIlIl(iterator.hasNext() ? 1 : 0)) {
                        final Map.Entry<String, String> lllllllllllllIlIlIIlIIlIIIlIllII = iterator.next();
                        lllllllllllllIlIlIIlIIlIIIllIIll.setRequestProperty(lllllllllllllIlIlIIlIIlIIIlIllII.getKey(), lllllllllllllIlIlIIlIIlIIIlIllII.getValue());
                        if (lIllIIlIlllIlII(llllllllllllIllIlllllIIlIlIllIll)) {
                            llllllllllllIllIlllllIIlIlIllIll.setLoadingProgress((int)(++lllllllllllllIlIlIIlIIlIIIlIlllI / lllllllllllllIlIlIIlIIlIIIlIllIl * 100.0f));
                        }
                    }
                    lllllllllllllIlIlIIlIIlIIIllIIlI = lllllllllllllIlIlIIlIIlIIIllIIll.getInputStream();
                    lllllllllllllIlIlIIlIIlIIIlIllIl = (float)lllllllllllllIlIlIIlIIlIIIllIIll.getContentLength();
                    final int lllllllllllllIlIlIIlIIlIIIlIlIll = lllllllllllllIlIlIIlIIlIIIllIIll.getContentLength();
                    if (lIllIIlIlllIlII(llllllllllllIllIlllllIIlIlIllIll)) {
                        final IProgressUpdate val$p_180192_4_ = llllllllllllIllIlllllIIlIlIllIll;
                        final String format = HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[3]];
                        final Object[] args = new Object[HttpUtil$1.lIIIIIIIIllIlI[1]];
                        args[HttpUtil$1.lIIIIIIIIllIlI[0]] = lllllllllllllIlIlIIlIIlIIIlIllIl / 1000.0f / 1000.0f;
                        val$p_180192_4_.displayLoadingString(String.format(format, args));
                    }
                    if (lIllIIlIlllIllI(llllllllllllIllIlllllIIlIlIllIII.exists() ? 1 : 0)) {
                        final long lllllllllllllIlIlIIlIIlIIIlIlIlI = llllllllllllIllIlllllIIlIlIllIII.length();
                        if (lIllIIlIlllIlIl(lIllIIlIlllIIlI(lllllllllllllIlIlIIlIIlIIIlIlIlI, lllllllllllllIlIlIIlIIlIIIlIlIll))) {
                            if (lIllIIlIlllIlII(llllllllllllIllIlllllIIlIlIllIll)) {
                                llllllllllllIllIlllllIIlIlIllIll.setDoneWorking();
                            }
                            return;
                        }
                        HttpUtil.logger.warn(String.valueOf(new StringBuilder(HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[4]]).append(llllllllllllIllIlllllIIlIlIllIII).append(HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[5]]).append(lllllllllllllIlIlIIlIIlIIIlIlIll).append(HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[6]]).append(lllllllllllllIlIlIIlIIlIIIlIlIlI).append(HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[7]])));
                        FileUtils.deleteQuietly(llllllllllllIllIlllllIIlIlIllIII);
                        "".length();
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    else if (lIllIIlIlllIlII(llllllllllllIllIlllllIIlIlIllIII.getParentFile())) {
                        llllllllllllIllIlllllIIlIlIllIII.getParentFile().mkdirs();
                        "".length();
                    }
                    lllllllllllllIlIlIIlIIlIIIllIIIl = new DataOutputStream(new FileOutputStream(llllllllllllIllIlllllIIlIlIllIII));
                    if (lIllIIlIlllIlll(llllllllllllIllIlllllIIlIlIlIlIl) && lIllIIlIlllIlll(lIllIIlIlllIIll(lllllllllllllIlIlIIlIIlIIIlIllIl, (float)llllllllllllIllIlllllIIlIlIlIlIl))) {
                        if (lIllIIlIlllIlII(llllllllllllIllIlllllIIlIlIllIll)) {
                            llllllllllllIllIlllllIIlIlIllIll.setDoneWorking();
                        }
                        throw new IOException(String.valueOf(new StringBuilder(HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[8]]).append(lllllllllllllIlIlIIlIIlIIIlIlllI).append(HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[9]]).append(llllllllllllIllIlllllIIlIlIlIlIl).append(HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[10]])));
                    }
                    int lllllllllllllIlIlIIlIIlIIIlIlIIl = HttpUtil$1.lIIIIIIIIllIlI[0];
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                    while (!lIllIIlIllllIII(lllllllllllllIlIlIIlIIlIIIlIlIIl = lllllllllllllIlIlIIlIIlIIIllIIlI.read(lllllllllllllIlIlIIlIIlIIIllIIII))) {
                        lllllllllllllIlIlIIlIIlIIIlIlllI += lllllllllllllIlIlIIlIIlIIIlIlIIl;
                        if (lIllIIlIlllIlII(llllllllllllIllIlllllIIlIlIllIll)) {
                            llllllllllllIllIlllllIIlIlIllIll.setLoadingProgress((int)(lllllllllllllIlIlIIlIIlIIIlIlllI / lllllllllllllIlIlIIlIIlIIIlIllIl * 100.0f));
                        }
                        if (lIllIIlIlllIlll(llllllllllllIllIlllllIIlIlIlIlIl) && lIllIIlIlllIlll(lIllIIlIlllIIll(lllllllllllllIlIlIIlIIlIIIlIlllI, (float)llllllllllllIllIlllllIIlIlIlIlIl))) {
                            if (lIllIIlIlllIlII(llllllllllllIllIlllllIIlIlIllIll)) {
                                llllllllllllIllIlllllIIlIlIllIll.setDoneWorking();
                            }
                            throw new IOException(String.valueOf(new StringBuilder(HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[11]]).append(lllllllllllllIlIlIIlIIlIIIlIlllI).append(HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[12]]).append(llllllllllllIllIlllllIIlIlIlIlIl).append(HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[13]])));
                        }
                        if (lIllIIlIlllIllI(Thread.interrupted() ? 1 : 0)) {
                            HttpUtil.logger.error(HttpUtil$1.lIIIIIIIIllIIl[HttpUtil$1.lIIIIIIIIllIlI[14]]);
                            if (lIllIIlIlllIlII(llllllllllllIllIlllllIIlIlIllIll)) {
                                llllllllllllIllIlllllIIlIlIllIll.setDoneWorking();
                            }
                            return;
                        }
                        lllllllllllllIlIlIIlIIlIIIllIIIl.write(lllllllllllllIlIlIIlIIlIIIllIIII, HttpUtil$1.lIIIIIIIIllIlI[0], lllllllllllllIlIlIIlIIlIIIlIlIIl);
                    }
                    if (lIllIIlIlllIlII(llllllllllllIllIlllllIIlIlIllIll)) {
                        llllllllllllIllIlllllIIlIlIllIll.setDoneWorking();
                        return;
                    }
                }
                catch (Throwable lllllllllllllIlIlIIlIIlIIIlIlIII) {
                    lllllllllllllIlIlIIlIIlIIIlIlIII.printStackTrace();
                    if (lIllIIlIlllIlII(lllllllllllllIlIlIIlIIlIIIllIIll)) {
                        final InputStream lllllllllllllIlIlIIlIIlIIIlIIlll = lllllllllllllIlIlIIlIIlIIIllIIll.getErrorStream();
                        try {
                            HttpUtil.logger.error(IOUtils.toString(lllllllllllllIlIlIIlIIlIIIlIIlll));
                            "".length();
                            if ("  ".length() < " ".length()) {
                                return;
                            }
                        }
                        catch (IOException lllllllllllllIlIlIIlIIlIIIlIIllI) {
                            lllllllllllllIlIlIIlIIlIIIlIIllI.printStackTrace();
                        }
                    }
                    if (lIllIIlIlllIlII(llllllllllllIllIlllllIIlIlIllIll)) {
                        llllllllllllIllIlllllIIlIlIllIll.setDoneWorking();
                        return;
                    }
                }
                finally {
                    IOUtils.closeQuietly(lllllllllllllIlIlIIlIIlIIIllIIlI);
                    IOUtils.closeQuietly(lllllllllllllIlIlIIlIIlIIIllIIIl);
                }
                IOUtils.closeQuietly(lllllllllllllIlIlIIlIIlIIIllIIlI);
                IOUtils.closeQuietly(lllllllllllllIlIlIIlIIlIIIllIIIl);
            }
            
            private static int lIllIIlIlllIIll(final float n, final float n2) {
                return fcmpl(n, n2);
            }
            
            private static boolean lIllIIlIllllIII(final int lllllllllllllIlIlIIlIIIlllIlllIl) {
                return lllllllllllllIlIlIIlIIIlllIlllIl < 0;
            }
            
            private static boolean lIllIIlIlllIlll(final int lllllllllllllIlIlIIlIIIlllIllIll) {
                return lllllllllllllIlIlIIlIIIlllIllIll > 0;
            }
            
            private static int lIllIIlIlllIIlI(final long n, final long n2) {
                return lcmp(n, n2);
            }
            
            private static boolean lIllIIlIllllIIl(final int lllllllllllllIlIlIIlIIIllllIIllI, final int lllllllllllllIlIlIIlIIIllllIIlIl) {
                return lllllllllllllIlIlIIlIIIllllIIllI < lllllllllllllIlIlIIlIIIllllIIlIl;
            }
            
            private static boolean lIllIIlIlllIllI(final int lllllllllllllIlIlIIlIIIllllIIIIl) {
                return lllllllllllllIlIlIIlIIIllllIIIIl != 0;
            }
            
            private static String lIllIIlIllIlllI(final String lllllllllllllIlIlIIlIIIllllIlllI, final String lllllllllllllIlIlIIlIIIllllIlIll) {
                try {
                    final SecretKeySpec lllllllllllllIlIlIIlIIIlllllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIlIIIllllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher lllllllllllllIlIlIIlIIIlllllIIII = Cipher.getInstance("Blowfish");
                    lllllllllllllIlIlIIlIIIlllllIIII.init(HttpUtil$1.lIIIIIIIIllIlI[3], lllllllllllllIlIlIIlIIIlllllIIIl);
                    return new String(lllllllllllllIlIlIIlIIIlllllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIlIIIllllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIlIlIIlIIIllllIllll) {
                    lllllllllllllIlIlIIlIIIllllIllll.printStackTrace();
                    return null;
                }
            }
            
            static {
                lIllIIlIlllIIIl();
                lIllIIlIlllIIII();
            }
            
            private static boolean lIllIIlIlllIlII(final Object lllllllllllllIlIlIIlIIIllllIIIll) {
                return lllllllllllllIlIlIIlIIIllllIIIll != null;
            }
            
            private static boolean lIllIIlIlllIlIl(final int lllllllllllllIlIlIIlIIIlllIlllll) {
                return lllllllllllllIlIlIIlIIIlllIlllll == 0;
            }
        });
        return (ListenableFuture<Object>)llllllllllllIllIlllllIIlIlIllIIl;
    }
    
    public static int getSuitableLanPort() throws IOException {
        ServerSocket llllllllllllIllIlllllIIlIlIIllIl = null;
        int llllllllllllIllIlllllIIlIlIIllII = HttpUtil.llIIlllIIlIIlI[14];
        try {
            llllllllllllIllIlllllIIlIlIIllIl = new ServerSocket(HttpUtil.llIIlllIIlIIlI[1]);
            llllllllllllIllIlllllIIlIlIIllII = llllllllllllIllIlllllIIlIlIIllIl.getLocalPort();
            "".length();
            if (null != null) {
                return (0x1B ^ 0x79) & ~(0xD2 ^ 0xB0);
            }
        }
        finally {
            try {
                if (lIIIllllIlllIIll(llllllllllllIllIlllllIIlIlIIllIl)) {
                    llllllllllllIllIlllllIIlIlIIllIl.close();
                    "".length();
                    if ("   ".length() < "  ".length()) {
                        return (0x78 ^ 0x1A ^ (0x7A ^ 0x43)) & (113 + 210 - 295 + 205 ^ 86 + 52 - 96 + 136 ^ -" ".length());
                    }
                }
            }
            catch (IOException ex) {}
        }
        try {
            if (lIIIllllIlllIIll(llllllllllllIllIlllllIIlIlIIllIl)) {
                llllllllllllIllIlllllIIlIlIIllIl.close();
                "".length();
                if ((0x83 ^ 0x87) <= "   ".length()) {
                    return (0x4D ^ 0x76) & ~(0xBB ^ 0x80);
                }
            }
        }
        catch (IOException ex2) {}
        return llllllllllllIllIlllllIIlIlIIllII;
    }
    
    public static String get(final URL llllllllllllIllIlllllIIlIlIIIIlI) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/net/URL.openConnection:()Ljava/net/URLConnection;
        //     4: checkcast       Ljava/net/HttpURLConnection;
        //     7: astore_1        /* llllllllllllIllIlllllIIlIIlllIll */
        //     8: aload_1         /* llllllllllllIllIlllllIIlIlIIIIIl */
        //     9: getstatic       net/minecraft/util/HttpUtil.llIIlllIIlIIIl:[Ljava/lang/String;
        //    12: getstatic       net/minecraft/util/HttpUtil.llIIlllIIlIIlI:[I
        //    15: bipush          15
        //    17: iaload         
        //    18: aaload         
        //    19: invokevirtual   java/net/HttpURLConnection.setRequestMethod:(Ljava/lang/String;)V
        //    22: new             Ljava/io/BufferedReader;
        //    25: dup            
        //    26: new             Ljava/io/InputStreamReader;
        //    29: dup            
        //    30: aload_1         /* llllllllllllIllIlllllIIlIlIIIIIl */
        //    31: invokevirtual   java/net/HttpURLConnection.getInputStream:()Ljava/io/InputStream;
        //    34: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //    37: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    40: astore_2        /* llllllllllllIllIlllllIIlIIlllIlI */
        //    41: new             Ljava/lang/StringBuilder;
        //    44: dup            
        //    45: invokespecial   java/lang/StringBuilder.<init>:()V
        //    48: astore_3        /* llllllllllllIllIlllllIIlIIllllll */
        //    49: ldc             ""
        //    51: invokevirtual   java/lang/String.length:()I
        //    54: pop            
        //    55: sipush          250
        //    58: iconst_1       
        //    59: iadd           
        //    60: bipush          72
        //    62: isub           
        //    63: bipush          74
        //    65: iadd           
        //    66: bipush          34
        //    68: bipush          11
        //    70: iadd           
        //    71: bipush          39
        //    73: isub           
        //    74: sipush          150
        //    77: iadd           
        //    78: ixor           
        //    79: sipush          230
        //    82: sipush          180
        //    85: ixor           
        //    86: sipush          183
        //    89: sipush          132
        //    92: ixor           
        //    93: ixor           
        //    94: ldc             " "
        //    96: invokevirtual   java/lang/String.length:()I
        //    99: ineg           
        //   100: ixor           
        //   101: iand           
        //   102: bipush          48
        //   104: bipush          86
        //   106: ixor           
        //   107: sipush          196
        //   110: sipush          146
        //   113: ixor           
        //   114: ixor           
        //   115: bipush          49
        //   117: bipush          19
        //   119: ixor           
        //   120: bipush          49
        //   122: bipush          35
        //   124: ixor           
        //   125: ixor           
        //   126: ldc             " "
        //   128: invokevirtual   java/lang/String.length:()I
        //   131: ineg           
        //   132: ixor           
        //   133: iand           
        //   134: if_icmpeq       167
        //   137: aconst_null    
        //   138: areturn        
        //   139: aload_3         /* llllllllllllIllIlllllIIlIIllllll */
        //   140: aload           llllllllllllIllIlllllIIlIIlllllI
        //   142: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   145: ldc             ""
        //   147: invokevirtual   java/lang/String.length:()I
        //   150: pop2           
        //   151: aload_3         /* llllllllllllIllIlllllIIlIIllllll */
        //   152: getstatic       net/minecraft/util/HttpUtil.llIIlllIIlIIlI:[I
        //   155: bipush          11
        //   157: iaload         
        //   158: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   161: ldc             ""
        //   163: invokevirtual   java/lang/String.length:()I
        //   166: pop2           
        //   167: aload_2         /* llllllllllllIllIlllllIIlIlIIIIII */
        //   168: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //   171: dup            
        //   172: astore          llllllllllllIllIlllllIIlIIllllIl
        //   174: invokestatic    net/minecraft/util/HttpUtil.lIIIllllIlllIlIl:(Ljava/lang/Object;)Z
        //   177: ifeq            139
        //   180: aload_2         /* llllllllllllIllIlllllIIlIlIIIIII */
        //   181: invokevirtual   java/io/BufferedReader.close:()V
        //   184: aload_3         /* llllllllllllIllIlllllIIlIIllllll */
        //   185: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   188: areturn        
        //    Exceptions:
        //  throws java.io.IOException
        //    StackMapTable: 00 02 FF 00 8B 00 05 07 00 88 07 00 8E 07 00 BC 07 00 35 07 00 19 00 00 FA 00 1B
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static boolean lIIIllllIlllIlIl(final Object llllllllllllIllIlllllIIIlllllllI) {
        return llllllllllllIllIlllllIIIlllllllI == null;
    }
    
    private static boolean lIIIllllIlllIIll(final Object llllllllllllIllIlllllIIlIIIIIIII) {
        return llllllllllllIllIlllllIIlIIIIIIII != null;
    }
    
    private static void lIIIllllIlllIIIl() {
        (llIIlllIIlIIlI = new int[17])[0] = " ".length();
        HttpUtil.llIIlllIIlIIlI[1] = ((0x78 ^ 0x49) & ~(0x76 ^ 0x47));
        HttpUtil.llIIlllIIlIIlI[2] = (0x52 ^ 0x74);
        HttpUtil.llIIlllIIlIIlI[3] = (0x4B ^ 0x53 ^ (0x12 ^ 0x37));
        HttpUtil.llIIlllIIlIIlI[4] = "  ".length();
        HttpUtil.llIIlllIIlIIlI[5] = "   ".length();
        HttpUtil.llIIlllIIlIIlI[6] = (0x56 ^ 0x52);
        HttpUtil.llIIlllIIlIIlI[7] = (0xF3 ^ 0x92 ^ (0x2B ^ 0x4F));
        HttpUtil.llIIlllIIlIIlI[8] = (0x17 ^ 0x11);
        HttpUtil.llIIlllIIlIIlI[9] = (0x60 ^ 0x67);
        HttpUtil.llIIlllIIlIIlI[10] = ("  ".length() ^ (0x69 ^ 0x63));
        HttpUtil.llIIlllIIlIIlI[11] = (0x1E ^ 0x78 ^ (0xD0 ^ 0xBB));
        HttpUtil.llIIlllIIlIIlI[12] = (0x71 ^ 0x78);
        HttpUtil.llIIlllIIlIIlI[13] = (0x51 ^ 0x72 ^ (0x1C ^ 0x35));
        HttpUtil.llIIlllIIlIIlI[14] = -" ".length();
        HttpUtil.llIIlllIIlIIlI[15] = (0x95 ^ 0xA0 ^ (0xA ^ 0x34));
        HttpUtil.llIIlllIIlIIlI[16] = (0xF3 ^ 0x9C ^ (0x2E ^ 0x4D));
    }
}
