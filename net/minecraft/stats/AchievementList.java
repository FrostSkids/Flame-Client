// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.stats;

import net.minecraft.util.IJsonSerializable;
import net.minecraft.util.JsonSerializableSet;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;

public class AchievementList
{
    public static /* synthetic */ Achievement killCow;
    public static /* synthetic */ Achievement theEnd2;
    public static /* synthetic */ Achievement buildPickaxe;
    public static /* synthetic */ Achievement cookFish;
    public static /* synthetic */ Achievement makeBread;
    public static /* synthetic */ Achievement overpowered;
    private static final /* synthetic */ String[] lIlllIlIIllIIl;
    public static /* synthetic */ Achievement buildHoe;
    public static /* synthetic */ Achievement snipeSkeleton;
    public static /* synthetic */ Achievement diamondsToYou;
    public static /* synthetic */ Achievement openInventory;
    public static /* synthetic */ Achievement theEnd;
    public static /* synthetic */ Achievement enchantments;
    public static /* synthetic */ Achievement fullBeacon;
    public static /* synthetic */ Achievement bakeCake;
    public static /* synthetic */ Achievement ghast;
    public static /* synthetic */ Achievement bookcase;
    public static /* synthetic */ List<Achievement> achievementList;
    public static /* synthetic */ Achievement buildFurnace;
    public static /* synthetic */ Achievement killWither;
    public static /* synthetic */ Achievement acquireIron;
    public static /* synthetic */ Achievement killEnemy;
    public static /* synthetic */ Achievement breedCow;
    public static /* synthetic */ Achievement potion;
    public static /* synthetic */ Achievement buildBetterPickaxe;
    public static /* synthetic */ Achievement onARail;
    private static final /* synthetic */ int[] lIlllIlIlIIIII;
    public static /* synthetic */ Achievement portal;
    public static /* synthetic */ Achievement spawnWither;
    public static /* synthetic */ Achievement mineWood;
    public static /* synthetic */ Achievement exploreAllBiomes;
    public static /* synthetic */ Achievement overkill;
    public static /* synthetic */ Achievement diamonds;
    public static /* synthetic */ Achievement buildSword;
    public static /* synthetic */ Achievement blazeRod;
    public static /* synthetic */ Achievement flyPig;
    public static /* synthetic */ Achievement buildWorkBench;
    
    private static void lIIIIIlIlIlllIlI() {
        (lIlllIlIIllIIl = new String[AchievementList.lIlllIlIlIIIII[72]])[AchievementList.lIlllIlIlIIIII[0]] = lIIIIIlIlIlIIIII("MTsBPComPQQwISR2BiUqPhEHIyo+LAYnNg==", "PXiUO");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[1]] = lIIIIIlIlIlIIIII("AxomCC8CHCYIEgMYOg==", "ljCff");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[2]] = lIIIIIlIlIlIIIIl("q609OFPTqIrDJw95yveMnys8+/6FreVY", "RStit");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[3]] = lIIIIIlIlIlIIIII("Oi07IBI4KzE=", "WDUEE");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[4]] = lIIIIIlIlIlIIIIl("T+qPRKsIFvJCjVIF9ySHhhyQ6qP8n+YBXu6E+rF5P9g=", "BvYSq");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[5]] = lIIIIIlIlIlIIIlI("Fcd1jHHhlUxA4gqmvMtulg==", "Nxoej");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[7]] = lIIIIIlIlIlIIIII("IAsPAAI3DQoMCTVGBRwOLQw3AAQqCR8M", "Ahgig");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[8]] = lIIIIIlIlIlIIIII("BiEMKgc0PQYtAhwx", "dTeFc");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[9]] = lIIIIIlIlIlIIIIl("YQc42OxDVJsGOtP4/hGgxSz6vaw6WixDmyaKK7Ns7mM=", "faSNb");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[10]] = lIIIIIlIlIlIIIIl("PfzzgAIPO38s/QzimOrPRQ==", "KLldo");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[11]] = lIIIIIlIlIlIIIII("DgkeJjMZDxsqOBtEFywnGgMEKh8dBRg=", "ojvOV");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[12]] = lIIIIIlIlIlIIIlI("jgMyrWdh5S0nZrxM4dbRJg==", "mxxaF");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[13]] = lIIIIIlIlIlIIIII("LCsCOTI7LQc1OTlmCCU+ISwiPzI=", "MHjPW");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[14]] = lIIIIIlIlIlIIIII("KiYEJC8APAg=", "HSmHK");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[16]] = lIIIIIlIlIlIIIII("JxElHSgwFyARIzJcIBUmIzA/ESwi", "FrMtM");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[17]] = lIIIIIlIlIlIIIII("LDYaKRozMhAo", "AWqLX");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[18]] = lIIIIIlIlIlIIIlI("/X9VY700s4MDOYXFjt+jmrLI3zIJFaYu", "nJBzi");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[19]] = lIIIIIlIlIlIIIIl("Kx2ffdWoQJ3I2Xw+czCQcg==", "bVwpI");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[21]] = lIIIIIlIlIlIIIIl("Q9YGPg42EQ6eydjPrZdbRmAoZD7hdf07eb9zQR/goYk=", "OUElG");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[22]] = lIIIIIlIlIlIIIIl("8pYEolhyi5dpe05iUwfkL0+Z6cWBBMFc", "FUIXr");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[23]] = lIIIIIlIlIlIIIII("FCUBPgcDIwQyDAFoCjgNHgAAJAo=", "uFiWb");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[24]] = lIIIIIlIlIlIIIlI("QcU2+S7TfjNWCtPJAJFDeA==", "AWNVr");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[25]] = lIIIIIlIlIlIIIlI("epqUz4UT4z9iHkRu7NZBKS+xYQfQtBL4", "mKMiu");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[26]] = lIIIIIlIlIlIIIII("GgMKFzMcAQ==", "umKER");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[27]] = lIIIIIlIlIlIIIlI("ky6urLmgRXyB1Fbd+I6XDA1ymJCpA517", "YILnv");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[28]] = lIIIIIlIlIlIIIIl("vwB2RqWZwqFJRscZaEluaA==", "dtekv");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[29]] = lIIIIIlIlIlIIIlI("WrWw/ntNq5XWZen0L4rnHpo1AbgIkts/", "zUtfJ");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[30]] = lIIIIIlIlIlIIIlI("HDEtEkzcxmaW2X69wc5U4w==", "iInnv");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[31]] = lIIIIIlIlIlIIIII("OyYGBA8sIAMIBC5rBQQGNgYBGg==", "ZEnmj");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[32]] = lIIIIIlIlIlIIIlI("f10/ogWuYKA=", "ctDwx");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[33]] = lIIIIIlIlIlIIIIl("lw0g9YJYAg4tN42GkJcuRnV1/BGBFRIA", "oEwyO");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[34]] = lIIIIIlIlIlIIIlI("HbhkX17XhRs=", "xBYin");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[35]] = lIIIIIlIlIlIIIlI("bLAZh7ecRAl2kNHdHnnShwxc7WkQFhmE/N1yzYigm9s=", "hdahP");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[36]] = lIIIIIlIlIlIIIII("Fx8QJC83Ghw4LxAeFw==", "dqyTJ");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[37]] = lIIIIIlIlIlIIIII("BSwQOz0SKhU3NhBhHDs5CSAWNis=", "dOxRX");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[38]] = lIIIIIlIlIlIIIlI("0fLyA0qaCgYJbv3cYgkryw==", "QiPil");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[39]] = lIIIIIlIlIlIIIII("ByweLiEQKhsiKhJhEi4lCyAYIzcyIC8oMQ==", "fOvGD");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[40]] = lIIIIIlIlIlIIIIl("/XcQmeJrgsQzXEyfqaoUbw==", "WgycI");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[41]] = lIIIIIlIlIlIIIIl("RRdti6MCj+GTH27Mly9C7gFqFH3Njz1j", "PLiek");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[42]] = lIIIIIlIlIlIIIII("KCo5Exg0", "XEKgy");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[43]] = lIIIIIlIlIlIIIIl("QE/o5m/MfxnBEeI6fc1gDMpIBKLIqPuc", "UzImB");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[44]] = lIIIIIlIlIlIIIII("LCMgIx4=", "KKAPj");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[46]] = lIIIIIlIlIlIIIII("BxoDLBUQHAYgHhJXCSkRHBw5KhQ=", "fykEp");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[47]] = lIIIIIlIlIlIIIIl("XfBBW+k1PPVgEXUT77IBpg==", "rDbcK");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[48]] = lIIIIIlIlIlIIIIl("dThs6fyShCECquM0YhfeLkHqbA36Iefr", "KjwTw");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[49]] = lIIIIIlIlIlIIIlI("irpxyv4dVMY=", "CpwNO");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[50]] = lIIIIIlIlIlIIIlI("ng2SvGpvsABVdZPpJIA+b3E0Vdeqlvdt", "sYaZS");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[51]] = lIIIIIlIlIlIIIlI("vCkoggvcs6c=", "yiEAV");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[52]] = lIIIIIlIlIlIIIII("AjsADTIVPQUBORd2HAwyJjYMVg==", "cXhdW");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[53]] = lIIIIIlIlIlIIIII("OBscDgsoQQ==", "LsyKe");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[54]] = lIIIIIlIlIlIIIII("KyUgAR88IyUNFD5oLQYZIicmHBcvKDwb", "JFHhz");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[55]] = lIIIIIlIlIlIIIIl("0/9BPQUp+V8K77CrIG15OQ==", "uQsKN");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[56]] = lIIIIIlIlIlIIIIl("Rjh0WYsnANtGntUa0FGNNtnD8KqgYZyw", "VlCWX");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[57]] = lIIIIIlIlIlIIIIl("r2WY31KjQ+iSAQyjznvVgg==", "TYEzq");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[58]] = lIIIIIlIlIlIIIII("ChEeDgkdFxsCAh9cFAgDABEXFAk=", "krvgl");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[59]] = lIIIIIlIlIlIIIIl("jFnKIZ9gsI9KU5X1gBUSZA==", "eCUOX");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[60]] = lIIIIIlIlIlIIIIl("nzsyHy3OinA25rx3PyJgkcyD2lFa+BYs", "VglSi");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[61]] = lIIIIIlIlIlIIIIl("vrOy0efIy2yBK/yH0+Rdrg==", "AyRMV");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[62]] = lIIIIIlIlIlIIIII("AA4EGjMXCAEWOBVDHwM3FgM7GiIJCB4=", "amlsV");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[63]] = lIIIIIlIlIlIIIII("ABkSFT4kAAcKNQE=", "sisbP");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[64]] = lIIIIIlIlIlIIIIl("WNiumeXm18PPzjelRPBNxXMjdoKoQBY1", "hMHzd");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[65]] = lIIIIIlIlIlIIIIl("2RZhYgZxaUpOjIFMieVtoA==", "jaQSm");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[66]] = lIIIIIlIlIlIIIII("MRUxADAmEzQMOyRYPxw5PDQ8CDY/GA==", "PvYiU");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[67]] = lIIIIIlIlIlIIIIl("WWjew1wBDhSR4+naAsuMdA==", "XbCxv");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[68]] = lIIIIIlIlIlIIIIl("0cAFa2h1hsFXK7vb3u+NfJ8ZsEMg4+fHH2g9EBL3jKY=", "ppoQU");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[69]] = lIIIIIlIlIlIIIIl("omxIgDNPuM/trWHUiLU5MHkTJmhBAeoq", "uOLWe");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[70]] = lIIIIIlIlIlIIIIl("N8R32nd/dFYX/VU+U/52ubckqDTKYTFB", "Ojjzs");
        AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[71]] = lIIIIIlIlIlIIIlI("3++0iMp9ZWT+9eit0FzRSg==", "pWxcp");
    }
    
    public static void init() {
    }
    
    private static String lIIIIIlIlIlIIIlI(final String llllllllllllIlllllIIIIIlIIIIllll, final String llllllllllllIlllllIIIIIlIIIIlllI) {
        try {
            final SecretKeySpec llllllllllllIlllllIIIIIlIIIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIIIIlIIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllIIIIIlIIIlIIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllllIIIIIlIIIlIIIl.init(AchievementList.lIlllIlIlIIIII[2], llllllllllllIlllllIIIIIlIIIlIIlI);
            return new String(llllllllllllIlllllIIIIIlIIIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIIIIlIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIIIIIlIIIlIIII) {
            llllllllllllIlllllIIIIIlIIIlIIII.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIIIlIlIlIIIIl(final String llllllllllllIlllllIIIIIlIIIIIIlI, final String llllllllllllIlllllIIIIIlIIIIIIIl) {
        try {
            final SecretKeySpec llllllllllllIlllllIIIIIlIIIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIIIIlIIIIIIIl.getBytes(StandardCharsets.UTF_8)), AchievementList.lIlllIlIlIIIII[9]), "DES");
            final Cipher llllllllllllIlllllIIIIIlIIIIIlII = Cipher.getInstance("DES");
            llllllllllllIlllllIIIIIlIIIIIlII.init(AchievementList.lIlllIlIlIIIII[2], llllllllllllIlllllIIIIIlIIIIIlIl);
            return new String(llllllllllllIlllllIIIIIlIIIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIIIIlIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIIIIIlIIIIIIll) {
            llllllllllllIlllllIIIIIlIIIIIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIIlIllIIIIII(final int llllllllllllIlllllIIIIIIlllllIlI, final int llllllllllllIlllllIIIIIIlllllIIl) {
        return llllllllllllIlllllIIIIIIlllllIlI < llllllllllllIlllllIIIIIIlllllIIl;
    }
    
    private static String lIIIIIlIlIlIIIII(String llllllllllllIlllllIIIIIlIIIlllll, final String llllllllllllIlllllIIIIIlIIlIIIll) {
        llllllllllllIlllllIIIIIlIIIlllll = new String(Base64.getDecoder().decode(llllllllllllIlllllIIIIIlIIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllIIIIIlIIlIIIlI = new StringBuilder();
        final char[] llllllllllllIlllllIIIIIlIIlIIIIl = llllllllllllIlllllIIIIIlIIlIIIll.toCharArray();
        int llllllllllllIlllllIIIIIlIIlIIIII = AchievementList.lIlllIlIlIIIII[0];
        final short llllllllllllIlllllIIIIIlIIIllIlI = (Object)llllllllllllIlllllIIIIIlIIIlllll.toCharArray();
        final byte llllllllllllIlllllIIIIIlIIIllIIl = (byte)llllllllllllIlllllIIIIIlIIIllIlI.length;
        long llllllllllllIlllllIIIIIlIIIllIII = AchievementList.lIlllIlIlIIIII[0];
        while (lIIIIIlIllIIIIII((int)llllllllllllIlllllIIIIIlIIIllIII, llllllllllllIlllllIIIIIlIIIllIIl)) {
            final char llllllllllllIlllllIIIIIlIIlIIlIl = llllllllllllIlllllIIIIIlIIIllIlI[llllllllllllIlllllIIIIIlIIIllIII];
            llllllllllllIlllllIIIIIlIIlIIIlI.append((char)(llllllllllllIlllllIIIIIlIIlIIlIl ^ llllllllllllIlllllIIIIIlIIlIIIIl[llllllllllllIlllllIIIIIlIIlIIIII % llllllllllllIlllllIIIIIlIIlIIIIl.length]));
            "".length();
            ++llllllllllllIlllllIIIIIlIIlIIIII;
            ++llllllllllllIlllllIIIIIlIIIllIII;
            "".length();
            if ("  ".length() > "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllIIIIIlIIlIIIlI);
    }
    
    private static void lIIIIIlIlIllllll() {
        (lIlllIlIlIIIII = new int[73])[0] = ((0x3D ^ 0x2E) & ~(0x26 ^ 0x35));
        AchievementList.lIlllIlIlIIIII[1] = " ".length();
        AchievementList.lIlllIlIlIIIII[2] = "  ".length();
        AchievementList.lIlllIlIlIIIII[3] = "   ".length();
        AchievementList.lIlllIlIlIIIII[4] = (166 + 58 - 43 + 5 ^ 44 + 146 - 105 + 105);
        AchievementList.lIlllIlIlIIIII[5] = (107 + 69 - 142 + 144 ^ 76 + 95 - 54 + 66);
        AchievementList.lIlllIlIlIIIII[6] = -" ".length();
        AchievementList.lIlllIlIlIIIII[7] = (0x10 ^ 0x34 ^ (0x26 ^ 0x4));
        AchievementList.lIlllIlIlIIIII[8] = (0x35 ^ 0x32);
        AchievementList.lIlllIlIlIIIII[9] = (16 + 134 - 30 + 38 ^ 109 + 120 - 162 + 83);
        AchievementList.lIlllIlIlIIIII[10] = (0x5B ^ 0x52);
        AchievementList.lIlllIlIlIIIII[11] = (203 + 142 - 143 + 5 ^ 55 + 50 + 79 + 13);
        AchievementList.lIlllIlIlIIIII[12] = (0x57 ^ 0x2E ^ (0xE7 ^ 0x95));
        AchievementList.lIlllIlIlIIIII[13] = (0x11 ^ 0x2D ^ (0xBC ^ 0x8C));
        AchievementList.lIlllIlIlIIIII[14] = (0x86 ^ 0xB9 ^ (0x14 ^ 0x26));
        AchievementList.lIlllIlIlIIIII[15] = -"   ".length();
        AchievementList.lIlllIlIlIIIII[16] = (157 + 79 - 166 + 120 ^ 133 + 48 - 29 + 24);
        AchievementList.lIlllIlIlIIIII[17] = (0x64 ^ 0x6B);
        AchievementList.lIlllIlIlIIIII[18] = (142 + 100 - 95 + 4 ^ 133 + 78 - 129 + 53);
        AchievementList.lIlllIlIlIIIII[19] = (0xD6 ^ 0xC7);
        AchievementList.lIlllIlIlIIIII[20] = -(0x96 ^ 0x89 ^ (0x3D ^ 0x27));
        AchievementList.lIlllIlIlIIIII[21] = (0x12 ^ 0x0);
        AchievementList.lIlllIlIlIIIII[22] = (0xF ^ 0x77 ^ (0x4B ^ 0x20));
        AchievementList.lIlllIlIlIIIII[23] = (0x28 ^ 0x3C);
        AchievementList.lIlllIlIlIIIII[24] = (0x8C ^ 0x99);
        AchievementList.lIlllIlIlIIIII[25] = (0xCE ^ 0xA6 ^ (0x59 ^ 0x27));
        AchievementList.lIlllIlIlIIIII[26] = (0x22 ^ 0x35);
        AchievementList.lIlllIlIlIIIII[27] = (0x56 ^ 0x4E);
        AchievementList.lIlllIlIlIIIII[28] = (0xB6 ^ 0xAB ^ (0x4 ^ 0x0));
        AchievementList.lIlllIlIlIIIII[29] = (0x58 ^ 0x1B ^ (0x77 ^ 0x2E));
        AchievementList.lIlllIlIlIIIII[30] = (0xE ^ 0x15);
        AchievementList.lIlllIlIlIIIII[31] = (0x29 ^ 0x6 ^ (0x3C ^ 0xF));
        AchievementList.lIlllIlIlIIIII[32] = (0x69 ^ 0x74);
        AchievementList.lIlllIlIlIIIII[33] = (0xDE ^ 0xC0);
        AchievementList.lIlllIlIlIIIII[34] = (50 + 14 + 74 + 17 ^ 100 + 57 - 125 + 100);
        AchievementList.lIlllIlIlIIIII[35] = (0x9F ^ 0x87 ^ (0xAA ^ 0x92));
        AchievementList.lIlllIlIlIIIII[36] = (47 + 190 - 118 + 110 ^ 105 + 169 - 174 + 96);
        AchievementList.lIlllIlIlIIIII[37] = (0xB6 ^ 0x94);
        AchievementList.lIlllIlIlIIIII[38] = (21 + 48 - 60 + 182 ^ 81 + 79 - 14 + 10);
        AchievementList.lIlllIlIlIIIII[39] = (156 + 159 - 245 + 118 ^ 105 + 119 - 190 + 118);
        AchievementList.lIlllIlIlIIIII[40] = (0x0 ^ 0x4B ^ (0xD5 ^ 0xBB));
        AchievementList.lIlllIlIlIIIII[41] = (0x45 ^ 0x63);
        AchievementList.lIlllIlIlIIIII[42] = (0x3D ^ 0x1A);
        AchievementList.lIlllIlIlIIIII[43] = (0x3C ^ 0x59 ^ (0x3 ^ 0x4E));
        AchievementList.lIlllIlIlIIIII[44] = (0x8F ^ 0xA5 ^ "   ".length());
        AchievementList.lIlllIlIlIIIII[45] = -(0x16 ^ 0x12);
        AchievementList.lIlllIlIlIIIII[46] = (79 + 20 - 13 + 75 ^ 56 + 38 - 30 + 75);
        AchievementList.lIlllIlIlIIIII[47] = (0x71 ^ 0x5F ^ (0xBD ^ 0xB8));
        AchievementList.lIlllIlIlIIIII[48] = (0x75 ^ 0x39 ^ (0x58 ^ 0x38));
        AchievementList.lIlllIlIlIIIII[49] = (0x83 ^ 0xAE);
        AchievementList.lIlllIlIlIIIII[50] = (0x9D ^ 0xB3);
        AchievementList.lIlllIlIlIIIII[51] = (3 + 22 - 24 + 167 ^ 74 + 37 - 76 + 100);
        AchievementList.lIlllIlIlIIIII[52] = (0x19 ^ 0x29);
        AchievementList.lIlllIlIlIIIII[53] = (0x79 ^ 0x48 ^ ((0x2 ^ 0x12) & ~(0xB4 ^ 0xA4)));
        AchievementList.lIlllIlIlIIIII[54] = (0xA2 ^ 0x90);
        AchievementList.lIlllIlIlIIIII[55] = (0x84 ^ 0xB7);
        AchievementList.lIlllIlIlIIIII[56] = (0xB5 ^ 0x81);
        AchievementList.lIlllIlIlIIIII[57] = (0x89 ^ 0xBC);
        AchievementList.lIlllIlIlIIIII[58] = (0x3A ^ 0xC);
        AchievementList.lIlllIlIlIIIII[59] = (0x64 ^ 0x44 ^ (0x7C ^ 0x6B));
        AchievementList.lIlllIlIlIIIII[60] = (0x7E ^ 0x8 ^ (0x8D ^ 0xC3));
        AchievementList.lIlllIlIlIIIII[61] = (0x35 ^ 0x4F ^ (0x74 ^ 0x37));
        AchievementList.lIlllIlIlIIIII[62] = (49 + 162 - 178 + 143 ^ 86 + 70 - 36 + 18);
        AchievementList.lIlllIlIlIIIII[63] = (130 + 14 - 14 + 11 ^ 141 + 87 - 53 + 7);
        AchievementList.lIlllIlIlIIIII[64] = (0x1A ^ 0x26);
        AchievementList.lIlllIlIlIIIII[65] = (0x23 ^ 0x18 ^ (0x40 ^ 0x46));
        AchievementList.lIlllIlIlIIIII[66] = (0x7C ^ 0xE ^ (0x3F ^ 0x73));
        AchievementList.lIlllIlIlIIIII[67] = (0xB6 ^ 0x89);
        AchievementList.lIlllIlIlIIIII[68] = (0xD7 ^ 0x97);
        AchievementList.lIlllIlIlIIIII[69] = (0x30 ^ 0x57 ^ (0xB1 ^ 0x97));
        AchievementList.lIlllIlIlIIIII[70] = (0xF ^ 0x26 ^ (0x30 ^ 0x5B));
        AchievementList.lIlllIlIlIIIII[71] = (0x2B ^ 0x68);
        AchievementList.lIlllIlIlIIIII[72] = (0xD9 ^ 0x9D);
    }
    
    static {
        lIIIIIlIlIllllll();
        lIIIIIlIlIlllIlI();
        AchievementList.achievementList = (List<Achievement>)Lists.newArrayList();
        AchievementList.openInventory = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[0]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[1]], AchievementList.lIlllIlIlIIIII[0], AchievementList.lIlllIlIlIIIII[0], Items.book, null).initIndependentStat().registerStat();
        AchievementList.mineWood = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[2]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[3]], AchievementList.lIlllIlIlIIIII[2], AchievementList.lIlllIlIlIIIII[1], Blocks.log, AchievementList.openInventory).registerStat();
        AchievementList.buildWorkBench = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[4]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[5]], AchievementList.lIlllIlIlIIIII[4], AchievementList.lIlllIlIlIIIII[6], Blocks.crafting_table, AchievementList.mineWood).registerStat();
        AchievementList.buildPickaxe = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[7]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[8]], AchievementList.lIlllIlIlIIIII[4], AchievementList.lIlllIlIlIIIII[2], Items.wooden_pickaxe, AchievementList.buildWorkBench).registerStat();
        AchievementList.buildFurnace = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[9]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[10]], AchievementList.lIlllIlIlIIIII[3], AchievementList.lIlllIlIlIIIII[4], Blocks.furnace, AchievementList.buildPickaxe).registerStat();
        AchievementList.acquireIron = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[11]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[12]], AchievementList.lIlllIlIlIIIII[1], AchievementList.lIlllIlIlIIIII[4], Items.iron_ingot, AchievementList.buildFurnace).registerStat();
        AchievementList.buildHoe = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[13]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[14]], AchievementList.lIlllIlIlIIIII[2], AchievementList.lIlllIlIlIIIII[15], Items.wooden_hoe, AchievementList.buildWorkBench).registerStat();
        AchievementList.makeBread = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[16]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[17]], AchievementList.lIlllIlIlIIIII[6], AchievementList.lIlllIlIlIIIII[15], Items.bread, AchievementList.buildHoe).registerStat();
        AchievementList.bakeCake = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[18]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[19]], AchievementList.lIlllIlIlIIIII[0], AchievementList.lIlllIlIlIIIII[20], Items.cake, AchievementList.buildHoe).registerStat();
        AchievementList.buildBetterPickaxe = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[21]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[22]], AchievementList.lIlllIlIlIIIII[7], AchievementList.lIlllIlIlIIIII[2], Items.stone_pickaxe, AchievementList.buildPickaxe).registerStat();
        AchievementList.cookFish = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[23]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[24]], AchievementList.lIlllIlIlIIIII[2], AchievementList.lIlllIlIlIIIII[7], Items.cooked_fish, AchievementList.buildFurnace).registerStat();
        AchievementList.onARail = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[25]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[26]], AchievementList.lIlllIlIlIIIII[2], AchievementList.lIlllIlIlIIIII[3], Blocks.rail, AchievementList.acquireIron).setSpecial().registerStat();
        AchievementList.buildSword = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[27]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[28]], AchievementList.lIlllIlIlIIIII[7], AchievementList.lIlllIlIlIIIII[6], Items.wooden_sword, AchievementList.buildWorkBench).registerStat();
        AchievementList.killEnemy = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[29]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[30]], AchievementList.lIlllIlIlIIIII[9], AchievementList.lIlllIlIlIIIII[6], Items.bone, AchievementList.buildSword).registerStat();
        AchievementList.killCow = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[31]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[32]], AchievementList.lIlllIlIlIIIII[8], AchievementList.lIlllIlIlIIIII[15], Items.leather, AchievementList.buildSword).registerStat();
        AchievementList.flyPig = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[33]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[34]], AchievementList.lIlllIlIlIIIII[10], AchievementList.lIlllIlIlIIIII[15], Items.saddle, AchievementList.killCow).setSpecial().registerStat();
        AchievementList.snipeSkeleton = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[35]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[36]], AchievementList.lIlllIlIlIIIII[8], AchievementList.lIlllIlIlIIIII[0], Items.bow, AchievementList.killEnemy).setSpecial().registerStat();
        AchievementList.diamonds = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[37]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[38]], AchievementList.lIlllIlIlIIIII[6], AchievementList.lIlllIlIlIIIII[5], Blocks.diamond_ore, AchievementList.acquireIron).registerStat();
        AchievementList.diamondsToYou = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[39]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[40]], AchievementList.lIlllIlIlIIIII[6], AchievementList.lIlllIlIlIIIII[2], Items.diamond, AchievementList.diamonds).registerStat();
        AchievementList.portal = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[41]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[42]], AchievementList.lIlllIlIlIIIII[6], AchievementList.lIlllIlIlIIIII[8], Blocks.obsidian, AchievementList.diamonds).registerStat();
        AchievementList.ghast = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[43]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[44]], AchievementList.lIlllIlIlIIIII[45], AchievementList.lIlllIlIlIIIII[9], Items.ghast_tear, AchievementList.portal).setSpecial().registerStat();
        AchievementList.blazeRod = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[46]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[47]], AchievementList.lIlllIlIlIIIII[0], AchievementList.lIlllIlIlIIIII[10], Items.blaze_rod, AchievementList.portal).registerStat();
        AchievementList.potion = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[48]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[49]], AchievementList.lIlllIlIlIIIII[2], AchievementList.lIlllIlIlIIIII[9], Items.potionitem, AchievementList.blazeRod).registerStat();
        AchievementList.theEnd = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[50]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[51]], AchievementList.lIlllIlIlIIIII[3], AchievementList.lIlllIlIlIIIII[11], Items.ender_eye, AchievementList.blazeRod).setSpecial().registerStat();
        AchievementList.theEnd2 = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[52]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[53]], AchievementList.lIlllIlIlIIIII[4], AchievementList.lIlllIlIlIIIII[14], Blocks.dragon_egg, AchievementList.theEnd).setSpecial().registerStat();
        AchievementList.enchantments = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[54]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[55]], AchievementList.lIlllIlIlIIIII[45], AchievementList.lIlllIlIlIIIII[4], Blocks.enchanting_table, AchievementList.diamonds).registerStat();
        AchievementList.overkill = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[56]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[57]], AchievementList.lIlllIlIlIIIII[45], AchievementList.lIlllIlIlIIIII[1], Items.diamond_sword, AchievementList.enchantments).setSpecial().registerStat();
        AchievementList.bookcase = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[58]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[59]], AchievementList.lIlllIlIlIIIII[15], AchievementList.lIlllIlIlIIIII[7], Blocks.bookshelf, AchievementList.enchantments).registerStat();
        AchievementList.breedCow = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[60]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[61]], AchievementList.lIlllIlIlIIIII[8], AchievementList.lIlllIlIlIIIII[20], Items.wheat, AchievementList.killCow).registerStat();
        AchievementList.spawnWither = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[62]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[63]], AchievementList.lIlllIlIlIIIII[8], AchievementList.lIlllIlIlIIIII[13], new ItemStack(Items.skull, AchievementList.lIlllIlIlIIIII[1], AchievementList.lIlllIlIlIIIII[1]), AchievementList.theEnd2).registerStat();
        AchievementList.killWither = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[64]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[65]], AchievementList.lIlllIlIlIIIII[8], AchievementList.lIlllIlIlIIIII[11], Items.nether_star, AchievementList.spawnWither).registerStat();
        AchievementList.fullBeacon = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[66]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[67]], AchievementList.lIlllIlIlIIIII[8], AchievementList.lIlllIlIlIIIII[9], Blocks.beacon, AchievementList.killWither).setSpecial().registerStat();
        AchievementList.exploreAllBiomes = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[68]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[69]], AchievementList.lIlllIlIlIIIII[4], AchievementList.lIlllIlIlIIIII[9], Items.diamond_boots, AchievementList.theEnd).func_150953_b(JsonSerializableSet.class).setSpecial().registerStat();
        AchievementList.overpowered = new Achievement(AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[70]], AchievementList.lIlllIlIIllIIl[AchievementList.lIlllIlIlIIIII[71]], AchievementList.lIlllIlIlIIIII[7], AchievementList.lIlllIlIlIIIII[4], new ItemStack(Items.golden_apple, AchievementList.lIlllIlIlIIIII[1], AchievementList.lIlllIlIlIIIII[1]), AchievementList.buildBetterPickaxe).setSpecial().registerStat();
    }
}
