// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.main;

import java.util.Arrays;
import com.google.gson.Gson;
import java.util.List;
import joptsimple.OptionSet;
import net.minecraft.util.Session;
import java.lang.reflect.Type;
import com.mojang.authlib.properties.PropertyMap;
import com.google.gson.GsonBuilder;
import java.net.PasswordAuthentication;
import java.net.Authenticator;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import joptsimple.OptionSpec;
import net.minecraft.client.Minecraft;
import java.io.File;
import joptsimple.OptionParser;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class Main
{
    private static final /* synthetic */ int[] lIlllllIlllllI;
    private static final /* synthetic */ String[] lIlllllIlllIII;
    
    private static String lIIIIlIllIIlIlII(final String llllllllllllIllllIIlIlIlIIIllIIl, final String llllllllllllIllllIIlIlIlIIIllIlI) {
        try {
            final SecretKeySpec llllllllllllIllllIIlIlIlIIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlIlIlIIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIlIlIlIIIlllIl = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIlIlIlIIIlllIl.init(Main.lIlllllIlllllI[2], llllllllllllIllllIIlIlIlIIIllllI);
            return new String(llllllllllllIllllIIlIlIlIIIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlIlIlIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIlIlIlIIIlllII) {
            llllllllllllIllllIIlIlIlIIIlllII.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIlIllIlIIIll() {
        (lIlllllIlllIII = new String[Main.lIlllllIlllllI[41]])[Main.lIlllllIlllllI[0]] = lIIIIlIllIIlIlII("LtEZyXe1CJpzUBYCQZX7I3rm5oiKONuFXiv8u68aou4=", "ZAnNy");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[1]] = lIIIIlIllIIlIlII("00Rwh2avwuE=", "CxEhq");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[2]] = lIIIIlIllIIlllII("CxM/KA==", "ovRGh");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[3]] = lIIIIlIllIIlIlII("WOF2nZQ7GbxB6xAEg2TmOA==", "VSddW");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[4]] = lIIIIlIllIIlIlII("3UME5mBa4DQ6XYBjac4MtQ==", "ufSTP");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[5]] = lIIIIlIllIIlllIl("Dy4/KMJNaU4=", "FjmUB");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[6]] = lIIIIlIllIIlIlII("H06Z54KgXaw=", "OZHrn");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[8]] = lIIIIlIllIIlIlII("yxFKrHb68ZI=", "CobDs");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[9]] = lIIIIlIllIIlllII("RQ==", "kuaZt");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[10]] = lIIIIlIllIIlllIl("iQnGJAKBvFUDqPNUBZ4diA==", "ELPPx");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[11]] = lIIIIlIllIIlIlII("AK17LFofGwqoGackKValpQ==", "nKMNu");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[12]] = lIIIIlIllIIlllII("Ozw2PRYDISox", "KNYEo");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[13]] = lIIIIlIllIIlllII("MiAHAhcSPRoO", "BRhzn");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[14]] = lIIIIlIllIIlIlII("JSYV2UqTStQ=", "GWvKw");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[15]] = lIIIIlIllIIlllII("IR8OGSAEHgQT", "QmaaY");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[16]] = lIIIIlIllIIlllIl("6T5o6wAO0yJ1LMFmcxjL/Q==", "EIAym");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[17]] = lIIIIlIllIIlllIl("9/I5g0KeHFojY8DqEtuw9w==", "tKVBX");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[18]] = lIIIIlIllIIlllIl("mLuPZ6tPeTI=", "vKxbh");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[19]] = lIIIIlIllIIlllIl("Tr29B06bwZs=", "vVzzC");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[20]] = lIIIIlIllIIlllII("GTQ1AjkLAzkMLxY=", "xWVgJ");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[21]] = lIIIIlIllIIlIlII("gt174t0flsM=", "OoteO");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[22]] = lIIIIlIllIIlllII("LjEoMx0=", "YXLGu");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[24]] = lIIIIlIllIIlllII("ChMbDiAW", "bvriH");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[26]] = lIIIIlIllIIlIlII("5A8cxP87+TEa/wV98iM1kQ==", "YGRfG");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[27]] = lIIIIlIllIIlllIl("4u797f2k4Cc=", "TYUjk");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[28]] = lIIIIlIllIIlllII("IhEhAg8+Bh4WCSIGPBAPNxA=", "RcNdf");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[29]] = lIIIIlIllIIlIlII("+MriibULXp4=", "oDVzv");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[30]] = lIIIIlIllIIlllIl("g0XnvCeUJ/vbCz1cH16TNQ==", "MbCgX");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[31]] = lIIIIlIllIIlllII("PzQiFwIzNyI=", "JGGeV");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[32]] = lIIIIlIllIIlllIl("+jXyhxdx05E=", "xIPhr");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[33]] = lIIIIlIllIIlIlII("B/x46uocApP5oEnaPCkv8a3jvX8meCcLkVuP2lb38rE=", "iPhgH");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[34]] = lIIIIlIllIIlllII("ADIPKzUFNQYiKA==", "fGcGF");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[35]] = lIIIIlIllIIlllII("MywOLDoXKC49Iz82GA==", "PDkOQ");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[36]] = lIIIIlIllIIlIlII("bnBT7uSpdfM=", "ojNkP");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[37]] = lIIIIlIllIIlIlII("iltVQDY06QU=", "uqAUx");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[38]] = lIIIIlIllIIlllII("AyspORMDLT8mBxIlKXk=", "qNZVf");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[39]] = lIIIIlIllIIlllII("ICocHRwXZiYQBxciGg8cQxIdChcCIg==", "cFuxr");
        Main.lIlllllIlllIII[Main.lIlllllIlllllI[40]] = lIIIIlIllIIlllIl("ViPTrzEWRuMIlOBZELwcXA==", "sCjVq");
    }
    
    private static boolean lIIIIlIllIlIllIl(final int llllllllllllIllllIIlIlIIllllllll) {
        return llllllllllllIllllIIlIlIIllllllll == 0;
    }
    
    private static void lIIIIlIllIlIllII() {
        (lIlllllIlllllI = new int[42])[0] = ((0x31 ^ 0x3A ^ (0x72 ^ 0x6D)) & (118 + 86 - 163 + 94 ^ 52 + 43 - 94 + 146 ^ -" ".length()));
        Main.lIlllllIlllllI[1] = " ".length();
        Main.lIlllllIlllllI[2] = "  ".length();
        Main.lIlllllIlllllI[3] = "   ".length();
        Main.lIlllllIlllllI[4] = (0x1 ^ 0x6D ^ (0xDD ^ 0xB5));
        Main.lIlllllIlllllI[5] = (0x7B ^ 0x7E);
        Main.lIlllllIlllllI[6] = (0xAE ^ 0xA8);
        Main.lIlllllIlllllI[7] = (0xFFFFEFFF & 0x73DD);
        Main.lIlllllIlllllI[8] = (0xA3 ^ 0xBE ^ (0x28 ^ 0x32));
        Main.lIlllllIlllllI[9] = (0x7C ^ 0x74);
        Main.lIlllllIlllllI[10] = (0x41 ^ 0x48);
        Main.lIlllllIlllllI[11] = (0x75 ^ 0x7F);
        Main.lIlllllIlllllI[12] = (120 + 54 - 108 + 105 ^ 112 + 148 - 207 + 107);
        Main.lIlllllIlllllI[13] = (0x63 ^ 0x2B ^ (0x1 ^ 0x45));
        Main.lIlllllIlllllI[14] = (0x7C ^ 0x71);
        Main.lIlllllIlllllI[15] = (0xB1 ^ 0xBF);
        Main.lIlllllIlllllI[16] = (0x5B ^ 0x6C ^ (0xD ^ 0x35));
        Main.lIlllllIlllllI[17] = (0x1D ^ 0x15 ^ (0x20 ^ 0x38));
        Main.lIlllllIlllllI[18] = (0x5E ^ 0x33 ^ (0xE5 ^ 0x99));
        Main.lIlllllIlllllI[19] = (0x49 ^ 0x5B);
        Main.lIlllllIlllllI[20] = (0x66 ^ 0x41 ^ (0x5B ^ 0x6F));
        Main.lIlllllIlllllI[21] = (0x25 ^ 0x2E ^ (0xDA ^ 0xC5));
        Main.lIlllllIlllllI[22] = (0xB5 ^ 0xA0);
        Main.lIlllllIlllllI[23] = (-(0xFFFFA453 & 0x7BAE) & (0xFFFFFF57 & 0x23FF));
        Main.lIlllllIlllllI[24] = (0x1E ^ 0x10 ^ (0x90 ^ 0x88));
        Main.lIlllllIlllllI[25] = (-(0xFFFFF61E & 0xDFB) & (0xFFFF9FFD & 0x65FB));
        Main.lIlllllIlllllI[26] = (105 + 1 + 5 + 72 ^ 89 + 20 - 61 + 112);
        Main.lIlllllIlllllI[27] = (0x6 ^ 0x1E);
        Main.lIlllllIlllllI[28] = (51 + 105 + 7 + 5 ^ 122 + 77 - 56 + 34);
        Main.lIlllllIlllllI[29] = (0x48 ^ 0xA ^ (0x5F ^ 0x7));
        Main.lIlllllIlllllI[30] = (0x29 ^ 0x32);
        Main.lIlllllIlllllI[31] = (0x14 ^ 0x8);
        Main.lIlllllIlllllI[32] = (19 + 21 + 48 + 57 ^ 38 + 38 + 12 + 52);
        Main.lIlllllIlllllI[33] = (0x7F ^ 0x61);
        Main.lIlllllIlllllI[34] = (0xA ^ 0x15);
        Main.lIlllllIlllllI[35] = (0xA2 ^ 0x82);
        Main.lIlllllIlllllI[36] = (0x79 ^ 0x65 ^ (0x81 ^ 0xBC));
        Main.lIlllllIlllllI[37] = (0xE6 ^ 0xC4);
        Main.lIlllllIlllllI[38] = (0x3B ^ 0x18);
        Main.lIlllllIlllllI[39] = (0x21 ^ 0x5);
        Main.lIlllllIlllllI[40] = (0xFC ^ 0xC7 ^ (0x63 ^ 0x7D));
        Main.lIlllllIlllllI[41] = (0x43 ^ 0x65);
    }
    
    private static boolean isNullOrEmpty(final String llllllllllllIllllIIlIlIlIIlllIll) {
        if (lIIIIlIllIlIlllI(llllllllllllIllllIIlIlIlIIlllIll) && lIIIIlIllIlIllIl(llllllllllllIllllIIlIlIlIIlllIll.isEmpty() ? 1 : 0)) {
            return Main.lIlllllIlllllI[1] != 0;
        }
        return Main.lIlllllIlllllI[0] != 0;
    }
    
    static {
        lIIIIlIllIlIllII();
        lIIIIlIllIlIIIll();
    }
    
    private static String lIIIIlIllIIlllII(String llllllllllllIllllIIlIlIlIIlIlIll, final String llllllllllllIllllIIlIlIlIIlIlIlI) {
        llllllllllllIllllIIlIlIlIIlIlIll = (boolean)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIIlIlIlIIlIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIIlIlIlIIlIlllI = new StringBuilder();
        final char[] llllllllllllIllllIIlIlIlIIlIllIl = llllllllllllIllllIIlIlIlIIlIlIlI.toCharArray();
        int llllllllllllIllllIIlIlIlIIlIllII = Main.lIlllllIlllllI[0];
        final int llllllllllllIllllIIlIlIlIIlIIllI = (Object)((String)llllllllllllIllllIIlIlIlIIlIlIll).toCharArray();
        final String llllllllllllIllllIIlIlIlIIlIIlIl = (String)llllllllllllIllllIIlIlIlIIlIIllI.length;
        double llllllllllllIllllIIlIlIlIIlIIlII = Main.lIlllllIlllllI[0];
        while (lIIIIlIllIllIIII((int)llllllllllllIllllIIlIlIlIIlIIlII, (int)llllllllllllIllllIIlIlIlIIlIIlIl)) {
            final char llllllllllllIllllIIlIlIlIIllIIIl = llllllllllllIllllIIlIlIlIIlIIllI[llllllllllllIllllIIlIlIlIIlIIlII];
            llllllllllllIllllIIlIlIlIIlIlllI.append((char)(llllllllllllIllllIIlIlIlIIllIIIl ^ llllllllllllIllllIIlIlIlIIlIllIl[llllllllllllIllllIIlIlIlIIlIllII % llllllllllllIllllIIlIlIlIIlIllIl.length]));
            "".length();
            ++llllllllllllIllllIIlIlIlIIlIllII;
            ++llllllllllllIllllIIlIlIlIIlIIlII;
            "".length();
            if (((0x7F ^ 0x5E ^ (0xDC ^ 0xA2)) & (31 + 138 - 15 + 90 ^ 65 + 46 - 32 + 92 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIIlIlIlIIlIlllI);
    }
    
    public static void main(final String[] llllllllllllIllllIIlIlIlllIIIlll) {
        System.setProperty(Main.lIlllllIlllIII[Main.lIlllllIlllllI[0]], Main.lIlllllIlllIII[Main.lIlllllIlllllI[1]]);
        "".length();
        final OptionParser llllllllllllIllllIIlIlIlllIIIlIl = new OptionParser();
        llllllllllllIllllIIlIlIlllIIIlIl.allowsUnrecognizedOptions();
        llllllllllllIllllIIlIlIlllIIIlIl.accepts(Main.lIlllllIlllIII[Main.lIlllllIlllllI[2]]);
        "".length();
        llllllllllllIllllIIlIlIlllIIIlIl.accepts(Main.lIlllllIlllIII[Main.lIlllllIlllllI[3]]);
        "".length();
        llllllllllllIllllIIlIlIlllIIIlIl.accepts(Main.lIlllllIlllIII[Main.lIlllllIlllllI[4]]);
        "".length();
        final OptionSpec<String> llllllllllllIllllIIlIlIlllIIIIll = (OptionSpec<String>)llllllllllllIllllIIlIlIlllIIIlIl.accepts(Main.lIlllllIlllIII[Main.lIlllllIlllllI[5]]).withRequiredArg();
        final OptionSpec<Integer> llllllllllllIllllIIlIlIlllIIIIIl = (OptionSpec<Integer>)llllllllllllIllllIIlIlIlllIIIlIl.accepts(Main.lIlllllIlllIII[Main.lIlllllIlllllI[6]]).withRequiredArg().ofType((Class)Integer.class).defaultsTo((Object)Main.lIlllllIlllllI[7], (Object[])new Integer[Main.lIlllllIlllllI[0]]);
        final OptionSpec<File> llllllllllllIllllIIlIlIllIllllll = (OptionSpec<File>)llllllllllllIllllIIlIlIlllIIIlIl.accepts(Main.lIlllllIlllIII[Main.lIlllllIlllllI[8]]).withRequiredArg().ofType((Class)File.class).defaultsTo((Object)new File(Main.lIlllllIlllIII[Main.lIlllllIlllllI[9]]), (Object[])new File[Main.lIlllllIlllllI[0]]);
        final OptionSpec<File> llllllllllllIllllIIlIlIllIllllIl = (OptionSpec<File>)llllllllllllIllllIIlIlIlllIIIlIl.accepts(Main.lIlllllIlllIII[Main.lIlllllIlllllI[10]]).withRequiredArg().ofType((Class)File.class);
        final OptionSpec<File> llllllllllllIllllIIlIlIllIlllIll = (OptionSpec<File>)llllllllllllIllllIIlIlIlllIIIlIl.accepts(Main.lIlllllIlllIII[Main.lIlllllIlllllI[11]]).withRequiredArg().ofType((Class)File.class);
        final OptionSpec<String> llllllllllllIllllIIlIlIllIlllIIl = (OptionSpec<String>)llllllllllllIllllIIlIlIlllIIIlIl.accepts(Main.lIlllllIlllIII[Main.lIlllllIlllllI[12]]).withRequiredArg();
        final OptionSpec<Integer> llllllllllllIllllIIlIlIllIllIlll = (OptionSpec<Integer>)llllllllllllIllllIIlIlIlllIIIlIl.accepts(Main.lIlllllIlllIII[Main.lIlllllIlllllI[13]]).withRequiredArg().defaultsTo((Object)Main.lIlllllIlllIII[Main.lIlllllIlllllI[14]], (Object[])new String[Main.lIlllllIlllllI[0]]).ofType((Class)Integer.class);
        final OptionSpec<String> llllllllllllIllllIIlIlIllIllIlIl = (OptionSpec<String>)llllllllllllIllllIIlIlIlllIIIlIl.accepts(Main.lIlllllIlllIII[Main.lIlllllIlllllI[15]]).withRequiredArg();
        final OptionSpec<String> llllllllllllIllllIIlIlIllIllIIll = (OptionSpec<String>)llllllllllllIllllIIlIlIlllIIIlIl.accepts(Main.lIlllllIlllIII[Main.lIlllllIlllllI[16]]).withRequiredArg();
        final OptionSpec<String> llllllllllllIllllIIlIlIllIllIIIl = (OptionSpec<String>)llllllllllllIllllIIlIlIlllIIIlIl.accepts(Main.lIlllllIlllIII[Main.lIlllllIlllllI[17]]).withRequiredArg().defaultsTo((Object)String.valueOf(new StringBuilder(Main.lIlllllIlllIII[Main.lIlllllIlllllI[18]]).append(Minecraft.getSystemTime() % 1000L)), (Object[])new String[Main.lIlllllIlllllI[0]]);
        final OptionSpec<String> llllllllllllIllllIIlIlIllIlIllll = (OptionSpec<String>)llllllllllllIllllIIlIlIlllIIIlIl.accepts(Main.lIlllllIlllIII[Main.lIlllllIlllllI[19]]).withRequiredArg();
        final OptionSpec<String> llllllllllllIllllIIlIlIllIlIllIl = (OptionSpec<String>)llllllllllllIllllIIlIlIlllIIIlIl.accepts(Main.lIlllllIlllIII[Main.lIlllllIlllllI[20]]).withRequiredArg().required();
        final OptionSpec<String> llllllllllllIllllIIlIlIllIlIlIll = (OptionSpec<String>)llllllllllllIllllIIlIlIlllIIIlIl.accepts(Main.lIlllllIlllIII[Main.lIlllllIlllllI[21]]).withRequiredArg().required();
        final OptionSpec<Integer> llllllllllllIllllIIlIlIllIlIlIIl = (OptionSpec<Integer>)llllllllllllIllllIIlIlIlllIIIlIl.accepts(Main.lIlllllIlllIII[Main.lIlllllIlllllI[22]]).withRequiredArg().ofType((Class)Integer.class).defaultsTo((Object)Main.lIlllllIlllllI[23], (Object[])new Integer[Main.lIlllllIlllllI[0]]);
        final OptionSpec<Integer> llllllllllllIllllIIlIlIllIlIlIII = (OptionSpec<Integer>)llllllllllllIllllIIlIlIlllIIIlIl.accepts(Main.lIlllllIlllIII[Main.lIlllllIlllllI[24]]).withRequiredArg().ofType((Class)Integer.class).defaultsTo((Object)Main.lIlllllIlllllI[25], (Object[])new Integer[Main.lIlllllIlllllI[0]]);
        final OptionSpec<String> llllllllllllIllllIIlIlIllIlIIlll = (OptionSpec<String>)llllllllllllIllllIIlIlIlllIIIlIl.accepts(Main.lIlllllIlllIII[Main.lIlllllIlllllI[26]]).withRequiredArg().defaultsTo((Object)Main.lIlllllIlllIII[Main.lIlllllIlllllI[27]], (Object[])new String[Main.lIlllllIlllllI[0]]);
        final OptionSpec<String> llllllllllllIllllIIlIlIllIlIIllI = (OptionSpec<String>)llllllllllllIllllIIlIlIlllIIIlIl.accepts(Main.lIlllllIlllIII[Main.lIlllllIlllllI[28]]).withRequiredArg().defaultsTo((Object)Main.lIlllllIlllIII[Main.lIlllllIlllllI[29]], (Object[])new String[Main.lIlllllIlllllI[0]]);
        final OptionSpec<String> llllllllllllIllllIIlIlIllIlIIlIl = (OptionSpec<String>)llllllllllllIllllIIlIlIlllIIIlIl.accepts(Main.lIlllllIlllIII[Main.lIlllllIlllllI[30]]).withRequiredArg();
        final OptionSpec<String> llllllllllllIllllIIlIlIllIlIIlII = (OptionSpec<String>)llllllllllllIllllIIlIlIlllIIIlIl.accepts(Main.lIlllllIlllIII[Main.lIlllllIlllllI[31]]).withRequiredArg().defaultsTo((Object)Main.lIlllllIlllIII[Main.lIlllllIlllllI[32]], (Object[])new String[Main.lIlllllIlllllI[0]]);
        final OptionSpec<String> llllllllllllIllllIIlIlIllIlIIIIl = (OptionSpec<String>)llllllllllllIllllIIlIlIlllIIIlIl.nonOptions();
        final OptionSet llllllllllllIllllIIlIlIllIlIIIII = llllllllllllIllllIIlIlIlllIIIlIl.parse(llllllllllllIllllIIlIlIlllIIIlll);
        final List<String> llllllllllllIllllIIlIlIllIIllllI = (List<String>)llllllllllllIllllIIlIlIllIlIIIII.valuesOf((OptionSpec)llllllllllllIllllIIlIlIllIlIIIIl);
        if (lIIIIlIllIlIllIl(llllllllllllIllllIIlIlIllIIllllI.isEmpty() ? 1 : 0)) {
            System.out.println(String.valueOf(new StringBuilder(Main.lIlllllIlllIII[Main.lIlllllIlllllI[33]]).append(llllllllllllIllllIIlIlIllIIllllI)));
        }
        final String llllllllllllIllllIIlIlIllIIlllII = (String)llllllllllllIllllIIlIlIllIlIIIII.valueOf((OptionSpec)llllllllllllIllllIIlIlIllIlllIIl);
        Proxy llllllllllllIllllIIlIlIllIIllIlI = Proxy.NO_PROXY;
        if (lIIIIlIllIlIlllI(llllllllllllIllllIIlIlIllIIlllII)) {
            try {
                llllllllllllIllllIIlIlIllIIllIlI = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(llllllllllllIllllIIlIlIllIIlllII, (int)llllllllllllIllllIIlIlIllIlIIIII.valueOf((OptionSpec)llllllllllllIllllIIlIlIllIllIlll)));
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            catch (Exception ex) {}
        }
        final String llllllllllllIllllIIlIlIllIIllIII = (String)llllllllllllIllllIIlIlIllIlIIIII.valueOf((OptionSpec)llllllllllllIllllIIlIlIllIllIlIl);
        final String llllllllllllIllllIIlIlIllIIlIllI = (String)llllllllllllIllllIIlIlIllIlIIIII.valueOf((OptionSpec)llllllllllllIllllIIlIlIllIllIIll);
        if (lIIIIlIllIlIllIl(llllllllllllIllllIIlIlIllIIllIlI.equals(Proxy.NO_PROXY) ? 1 : 0) && lIIIIlIllIlIllll(isNullOrEmpty(llllllllllllIllllIIlIlIllIIllIII) ? 1 : 0) && lIIIIlIllIlIllll(isNullOrEmpty(llllllllllllIllllIIlIlIllIIlIllI) ? 1 : 0)) {
            Authenticator.setDefault(new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(llllllllllllIllllIIlIlIllIIllIII, llllllllllllIllllIIlIlIllIIlIllI.toCharArray());
                }
            });
        }
        final int llllllllllllIllllIIlIlIllIIlIlII = (int)llllllllllllIllllIIlIlIllIlIIIII.valueOf((OptionSpec)llllllllllllIllllIIlIlIllIlIlIIl);
        final int llllllllllllIllllIIlIlIllIIlIIlI = (int)llllllllllllIllllIIlIlIllIlIIIII.valueOf((OptionSpec)llllllllllllIllllIIlIlIllIlIlIII);
        final boolean llllllllllllIllllIIlIlIllIIlIIII = llllllllllllIllllIIlIlIllIlIIIII.has(Main.lIlllllIlllIII[Main.lIlllllIlllllI[34]]);
        final boolean llllllllllllIllllIIlIlIllIIIllll = llllllllllllIllllIIlIlIllIlIIIII.has(Main.lIlllllIlllIII[Main.lIlllllIlllllI[35]]);
        final boolean llllllllllllIllllIIlIlIllIIIlllI = llllllllllllIllllIIlIlIllIlIIIII.has(Main.lIlllllIlllIII[Main.lIlllllIlllllI[36]]);
        final String llllllllllllIllllIIlIlIllIIIllIl = (String)llllllllllllIllllIIlIlIllIlIIIII.valueOf((OptionSpec)llllllllllllIllllIIlIlIllIlIlIll);
        final Gson llllllllllllIllllIIlIlIllIIIllII = new GsonBuilder().registerTypeAdapter((Type)PropertyMap.class, (Object)new PropertyMap.Serializer()).create();
        final PropertyMap llllllllllllIllllIIlIlIllIIIlIll = (PropertyMap)llllllllllllIllllIIlIlIllIIIllII.fromJson((String)llllllllllllIllllIIlIlIllIlIIIII.valueOf((OptionSpec)llllllllllllIllllIIlIlIllIlIIlll), (Class)PropertyMap.class);
        final PropertyMap llllllllllllIllllIIlIlIllIIIlIlI = (PropertyMap)llllllllllllIllllIIlIlIllIIIllII.fromJson((String)llllllllllllIllllIIlIlIllIlIIIII.valueOf((OptionSpec)llllllllllllIllllIIlIlIllIlIIllI), (Class)PropertyMap.class);
        final File llllllllllllIllllIIlIlIllIIIlIIl = (File)llllllllllllIllllIIlIlIllIlIIIII.valueOf((OptionSpec)llllllllllllIllllIIlIlIllIllllll);
        File file;
        if (lIIIIlIllIlIllll(llllllllllllIllllIIlIlIllIlIIIII.has((OptionSpec)llllllllllllIllllIIlIlIllIllllIl) ? 1 : 0)) {
            file = (File)llllllllllllIllllIIlIlIllIlIIIII.valueOf((OptionSpec)llllllllllllIllllIIlIlIllIllllIl);
            "".length();
            if (-" ".length() == "   ".length()) {
                return;
            }
        }
        else {
            file = new File(llllllllllllIllllIIlIlIllIIIlIIl, Main.lIlllllIlllIII[Main.lIlllllIlllllI[37]]);
        }
        final File llllllllllllIllllIIlIlIllIIIIlll = file;
        File file2;
        if (lIIIIlIllIlIllll(llllllllllllIllllIIlIlIllIlIIIII.has((OptionSpec)llllllllllllIllllIIlIlIllIlllIll) ? 1 : 0)) {
            file2 = (File)llllllllllllIllllIIlIlIllIlIIIII.valueOf((OptionSpec)llllllllllllIllllIIlIlIllIlllIll);
            "".length();
            if (" ".length() > " ".length()) {
                return;
            }
        }
        else {
            file2 = new File(llllllllllllIllllIIlIlIllIIIlIIl, Main.lIlllllIlllIII[Main.lIlllllIlllllI[38]]);
        }
        final File llllllllllllIllllIIlIlIllIIIIlIl = file2;
        String s;
        if (lIIIIlIllIlIllll(llllllllllllIllllIIlIlIllIlIIIII.has((OptionSpec)llllllllllllIllllIIlIlIllIlIllll) ? 1 : 0)) {
            s = (String)llllllllllllIllllIIlIlIllIlIllll.value(llllllllllllIllllIIlIlIllIlIIIII);
            "".length();
            if ("   ".length() == "  ".length()) {
                return;
            }
        }
        else {
            s = (String)llllllllllllIllllIIlIlIllIllIIIl.value(llllllllllllIllllIIlIlIllIlIIIII);
        }
        final String llllllllllllIllllIIlIlIllIIIIlII = s;
        String s2;
        if (lIIIIlIllIlIllll(llllllllllllIllllIIlIlIllIlIIIII.has((OptionSpec)llllllllllllIllllIIlIlIllIlIIlIl) ? 1 : 0)) {
            s2 = (String)llllllllllllIllllIIlIlIllIlIIlIl.value(llllllllllllIllllIIlIlIllIlIIIII);
            "".length();
            if (((0x5F ^ 0x4E) & ~(0x8D ^ 0x9C)) != 0x0) {
                return;
            }
        }
        else {
            s2 = null;
        }
        final String llllllllllllIllllIIlIlIllIIIIIlI = s2;
        final String llllllllllllIllllIIlIlIllIIIIIII = (String)llllllllllllIllllIIlIlIllIlIIIII.valueOf((OptionSpec)llllllllllllIllllIIlIlIlllIIIIll);
        final Integer llllllllllllIllllIIlIlIlIlllllll = (Integer)llllllllllllIllllIIlIlIllIlIIIII.valueOf((OptionSpec)llllllllllllIllllIIlIlIlllIIIIIl);
        final Session llllllllllllIllllIIlIlIlIlllllIl = new Session((String)llllllllllllIllllIIlIlIllIllIIIl.value(llllllllllllIllllIIlIlIllIlIIIII), llllllllllllIllllIIlIlIllIIIIlII, (String)llllllllllllIllllIIlIlIllIlIllIl.value(llllllllllllIllllIIlIlIllIlIIIII), (String)llllllllllllIllllIIlIlIllIlIIlII.value(llllllllllllIllllIIlIlIllIlIIIII));
        final GameConfiguration llllllllllllIllllIIlIlIlIllllIll = new GameConfiguration(new GameConfiguration.UserInformation(llllllllllllIllllIIlIlIlIlllllIl, llllllllllllIllllIIlIlIllIIIlIll, llllllllllllIllllIIlIlIllIIIlIlI, llllllllllllIllllIIlIlIllIIllIlI), new GameConfiguration.DisplayInformation(llllllllllllIllllIIlIlIllIIlIlII, llllllllllllIllllIIlIlIllIIlIIlI, llllllllllllIllllIIlIlIllIIlIIII, llllllllllllIllllIIlIlIllIIIllll), new GameConfiguration.FolderInformation(llllllllllllIllllIIlIlIllIIIlIIl, llllllllllllIllllIIlIlIllIIIIlIl, llllllllllllIllllIIlIlIllIIIIlll, llllllllllllIllllIIlIlIllIIIIIlI), new GameConfiguration.GameInformation(llllllllllllIllllIIlIlIllIIIlllI, llllllllllllIllllIIlIlIllIIIllIl), new GameConfiguration.ServerInformation(llllllllllllIllllIIlIlIllIIIIIII, llllllllllllIllllIIlIlIlIlllllll));
        Runtime.getRuntime().addShutdownHook(new Thread(Main.lIlllllIlllIII[Main.lIlllllIlllllI[39]]) {
            @Override
            public void run() {
                Minecraft.stopIntegratedServer();
            }
        });
        Thread.currentThread().setName(Main.lIlllllIlllIII[Main.lIlllllIlllllI[40]]);
        new Minecraft(llllllllllllIllllIIlIlIlIllllIll).run();
    }
    
    private static boolean lIIIIlIllIlIllll(final int llllllllllllIllllIIlIlIlIIIIIIIl) {
        return llllllllllllIllllIIlIlIlIIIIIIIl != 0;
    }
    
    private static String lIIIIlIllIIlllIl(final String llllllllllllIllllIIlIlIlIIIIllII, final String llllllllllllIllllIIlIlIlIIIIllIl) {
        try {
            final SecretKeySpec llllllllllllIllllIIlIlIlIIIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlIlIlIIIIllIl.getBytes(StandardCharsets.UTF_8)), Main.lIlllllIlllllI[9]), "DES");
            final Cipher llllllllllllIllllIIlIlIlIIIlIIII = Cipher.getInstance("DES");
            llllllllllllIllllIIlIlIlIIIlIIII.init(Main.lIlllllIlllllI[2], llllllllllllIllllIIlIlIlIIIlIIIl);
            return new String(llllllllllllIllllIIlIlIlIIIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlIlIlIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIlIlIlIIIIllll) {
            llllllllllllIllllIIlIlIlIIIIllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIlIllIlIlllI(final Object llllllllllllIllllIIlIlIlIIIIIIll) {
        return llllllllllllIllllIIlIlIlIIIIIIll != null;
    }
    
    private static boolean lIIIIlIllIllIIII(final int llllllllllllIllllIIlIlIlIIIIIllI, final int llllllllllllIllllIIlIlIlIIIIIlIl) {
        return llllllllllllIllllIIlIlIlIIIIIllI < llllllllllllIllllIIlIlIlIIIIIlIl;
    }
}
