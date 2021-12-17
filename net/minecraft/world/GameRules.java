// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world;

import java.util.Iterator;
import java.util.Set;
import java.util.Arrays;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.TreeMap;

public class GameRules
{
    private static final /* synthetic */ int[] llIllIIlIIIIlI;
    private /* synthetic */ TreeMap<String, Value> theGameRules;
    private static final /* synthetic */ String[] llIllIIlIIIIII;
    
    private static String lIIlIllIlIlIllIl(final String llllllllllllIllIIlllllIllllIllll, final String llllllllllllIllIIlllllIllllIlllI) {
        try {
            final SecretKeySpec llllllllllllIllIIlllllIlllllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlllllIllllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlllllIlllllIIll = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlllllIlllllIIll.init(GameRules.llIllIIlIIIIlI[2], llllllllllllIllIIlllllIlllllIlII);
            return new String(llllllllllllIllIIlllllIlllllIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlllllIllllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlllllIlllllIIlI) {
            llllllllllllIllIIlllllIlllllIIlI.printStackTrace();
            return null;
        }
    }
    
    public boolean areSameType(final String llllllllllllIllIIllllllIIIlIIIII, final ValueType llllllllllllIllIIllllllIIIlIIIll) {
        final Value llllllllllllIllIIllllllIIIlIIIlI = this.theGameRules.get(llllllllllllIllIIllllllIIIlIIIII);
        if (lIIlIllIlIllIlll(llllllllllllIllIIllllllIIIlIIIlI) && (!lIIlIllIlIlllIll(llllllllllllIllIIllllllIIIlIIIlI.getType(), llllllllllllIllIIllllllIIIlIIIll) || lIIlIllIlIllllII(llllllllllllIllIIllllllIIIlIIIll, ValueType.ANY_VALUE))) {
            return GameRules.llIllIIlIIIIlI[1] != 0;
        }
        return GameRules.llIllIIlIIIIlI[0] != 0;
    }
    
    public NBTTagCompound writeToNBT() {
        final NBTTagCompound llllllllllllIllIIllllllIIlIIlIll = new NBTTagCompound();
        final boolean llllllllllllIllIIllllllIIlIIIlIl = (boolean)this.theGameRules.keySet().iterator();
        "".length();
        if ((0xBC ^ 0xB8) == 0x0) {
            return null;
        }
        while (!lIIlIllIlIlllIlI(((Iterator)llllllllllllIllIIllllllIIlIIIlIl).hasNext() ? 1 : 0)) {
            final String llllllllllllIllIIllllllIIlIIlIlI = ((Iterator<String>)llllllllllllIllIIllllllIIlIIIlIl).next();
            final Value llllllllllllIllIIllllllIIlIIlIIl = this.theGameRules.get(llllllllllllIllIIllllllIIlIIlIlI);
            llllllllllllIllIIllllllIIlIIlIll.setString(llllllllllllIllIIllllllIIlIIlIlI, llllllllllllIllIIllllllIIlIIlIIl.getString());
        }
        return llllllllllllIllIIllllllIIlIIlIll;
    }
    
    private static boolean lIIlIllIlIllllII(final Object llllllllllllIllIIlllllIlllIlllll, final Object llllllllllllIllIIlllllIlllIllllI) {
        return llllllllllllIllIIlllllIlllIlllll == llllllllllllIllIIlllllIlllIllllI;
    }
    
    public void setOrCreateGameRule(final String llllllllllllIllIIllllllIIllIllll, final String llllllllllllIllIIllllllIIllIlllI) {
        final Value llllllllllllIllIIllllllIIlllIIIl = this.theGameRules.get(llllllllllllIllIIllllllIIllIllll);
        if (lIIlIllIlIllIlll(llllllllllllIllIIllllllIIlllIIIl)) {
            llllllllllllIllIIllllllIIlllIIIl.setValue(llllllllllllIllIIllllllIIllIlllI);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.addGameRule(llllllllllllIllIIllllllIIllIllll, llllllllllllIllIIllllllIIllIlllI, ValueType.ANY_VALUE);
        }
    }
    
    public boolean hasRule(final String llllllllllllIllIIllllllIIIlIllII) {
        return this.theGameRules.containsKey(llllllllllllIllIIllllllIIIlIllII);
    }
    
    public void readFromNBT(final NBTTagCompound llllllllllllIllIIllllllIIIllllIl) {
        final long llllllllllllIllIIllllllIIIllIlll = (long)llllllllllllIllIIllllllIIIllllIl.getKeySet().iterator();
        "".length();
        if ((0x4F ^ 0x4B) < 0) {
            return;
        }
        while (!lIIlIllIlIlllIlI(((Iterator)llllllllllllIllIIllllllIIIllIlll).hasNext() ? 1 : 0)) {
            final String llllllllllllIllIIllllllIIIllllII = ((Iterator<String>)llllllllllllIllIIllllllIIIllIlll).next();
            final String llllllllllllIllIIllllllIIIlllIll = llllllllllllIllIIllllllIIIllllIl.getString(llllllllllllIllIIllllllIIIllllII);
            this.setOrCreateGameRule(llllllllllllIllIIllllllIIIllllII, llllllllllllIllIIllllllIIIlllIll);
        }
    }
    
    private static String lIIlIllIlIlIlIll(final String llllllllllllIllIIlllllIllllllllI, final String llllllllllllIllIIlllllIllllllIll) {
        try {
            final SecretKeySpec llllllllllllIllIIllllllIIIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlllllIllllllIll.getBytes(StandardCharsets.UTF_8)), GameRules.llIllIIlIIIIlI[8]), "DES");
            final Cipher llllllllllllIllIIllllllIIIIIIIII = Cipher.getInstance("DES");
            llllllllllllIllIIllllllIIIIIIIII.init(GameRules.llIllIIlIIIIlI[2], llllllllllllIllIIllllllIIIIIIIIl);
            return new String(llllllllllllIllIIllllllIIIIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlllllIllllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlllllIlllllllll) {
            llllllllllllIllIIlllllIlllllllll.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIlIllIlIllIlII();
        lIIlIllIlIlIllll();
    }
    
    public void addGameRule(final String llllllllllllIllIIllllllIIllllIll, final String llllllllllllIllIIllllllIIllllllI, final ValueType llllllllllllIllIIllllllIIllllIIl) {
        this.theGameRules.put(llllllllllllIllIIllllllIIllllIll, new Value(llllllllllllIllIIllllllIIllllllI, llllllllllllIllIIllllllIIllllIIl));
        "".length();
    }
    
    private static boolean lIIlIllIlIllllIl(final int llllllllllllIllIIlllllIllllIlIIl, final int llllllllllllIllIIlllllIllllIlIII) {
        return llllllllllllIllIIlllllIllllIlIIl < llllllllllllIllIIlllllIllllIlIII;
    }
    
    public boolean getBoolean(final String llllllllllllIllIIllllllIIlIlllll) {
        final Value llllllllllllIllIIllllllIIlIllllI = this.theGameRules.get(llllllllllllIllIIllllllIIlIlllll);
        int boolean1;
        if (lIIlIllIlIllIlll(llllllllllllIllIIllllllIIlIllllI)) {
            boolean1 = (llllllllllllIllIIllllllIIlIllllI.getBoolean() ? 1 : 0);
            "".length();
            if (-"  ".length() > 0) {
                return ((0x53 ^ 0x7C) & ~(0x73 ^ 0x5C)) != 0x0;
            }
        }
        else {
            boolean1 = GameRules.llIllIIlIIIIlI[0];
        }
        return boolean1 != 0;
    }
    
    private static boolean lIIlIllIlIlllIlI(final int llllllllllllIllIIlllllIlllIlllII) {
        return llllllllllllIllIIlllllIlllIlllII == 0;
    }
    
    private static void lIIlIllIlIlIllll() {
        (llIllIIlIIIIII = new String[GameRules.llIllIIlIIIIlI[31]])[GameRules.llIllIIlIIIIlI[0]] = lIIlIllIlIlIlIll("QKK31yfZKxfZOevven37+g==", "ecQHn");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[1]] = lIIlIllIlIlIlIll("NTk51Tsnv8s=", "fMegm");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[2]] = lIIlIllIlIlIllII("AgsoAzQGASwtKAg=", "odJDF");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[3]] = lIIlIllIlIlIllII("MCUwIQ==", "DWEDG");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[4]] = lIIlIllIlIlIllIl("xl+Fg/FDutSFhByVT46+iA==", "uAKdK");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[5]] = lIIlIllIlIlIllIl("GKONst/y9AY=", "effeq");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[6]] = lIIlIllIlIlIllII("MCUgAiQHOgwaKD0kCg==", "TJmmF");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[7]] = lIIlIllIlIlIllII("Ljo5Eg==", "ZHLwd");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[8]] = lIIlIllIlIlIlIll("na4sy9u1cIvRnsqIhH9pzA==", "xwmdm");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[9]] = lIIlIllIlIlIlIll("fuZWMnoGUQ8=", "eHLnj");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[10]] = lIIlIllIlIlIllII("PAYODjk9LSgIJSs=", "XiZgU");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[11]] = lIIlIllIlIlIllII("LicMJw==", "ZUyBP");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[12]] = lIIlIllIlIlIlIll("UfpIUN2QuGrFzj1Ca8RQ1Q==", "wCxYW");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[13]] = lIIlIllIlIlIllIl("K8kP8KnCp3A=", "fkZhG");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[14]] = lIIlIllIlIlIllII("Cx4APiwGFS8/IgsaIiY5GAQZ", "hqmSM");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[15]] = lIIlIllIlIlIlIll("20yI748TU10=", "xBMTD");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[16]] = lIIlIllIlIlIlIll("9rQsODPiYCNGUFVTXZU1y2Uisqqp3FPX", "FaQmI");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[17]] = lIIlIllIlIlIlIll("sbsgBEX7ADU=", "bqixm");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[18]] = lIIlIllIlIlIllII("JhwiFh8uGgEfEgEKBRsD", "Bsfwf");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[19]] = lIIlIllIlIlIllII("IionFA==", "VXRqW");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[20]] = lIIlIllIlIlIllII("BAkuBykFDycFIgULKCgpGw==", "hfIFM");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[21]] = lIIlIllIlIlIlIll("+x7O+Qn5W8M=", "urMUP");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[22]] = lIIlIllIlIlIllII("CwQeGCYdDQUHLx0fAg4FHR8=", "xlqob");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[23]] = lIIlIllIlIlIllII("Ij4ABA==", "VLuan");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[24]] = lIIlIllIlIlIllIl("QrNwoj0lkYPCy0AQDIDMGQ==", "lWvOr");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[25]] = lIIlIllIlIlIllIl("DOmwQJckEJo=", "uuXIT");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[26]] = lIIlIllIlIlIllII("NC8FFwYoJwYSKyMMDhYhJSsIGA==", "GJksE");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[27]] = lIIlIllIlIlIllIl("oedRsLtDW50=", "JHqZW");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[28]] = lIIlIllIlIlIllII("HAImHzELAwYPMBsACwQ0AQ==", "ngBjR");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[29]] = lIIlIllIlIlIllII("Ii4PJz0=", "DOcTX");
        GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[30]] = lIIlIllIlIlIllIl("iMnlao+BGlU=", "SQFAq");
    }
    
    private static void lIIlIllIlIllIlII() {
        (llIllIIlIIIIlI = new int[32])[0] = ((81 + 106 - 175 + 126 ^ 112 + 69 - 174 + 148) & (146 + 46 - 79 + 38 ^ 17 + 17 - 3 + 103 ^ -" ".length()));
        GameRules.llIllIIlIIIIlI[1] = " ".length();
        GameRules.llIllIIlIIIIlI[2] = "  ".length();
        GameRules.llIllIIlIIIIlI[3] = "   ".length();
        GameRules.llIllIIlIIIIlI[4] = (166 + 148 - 281 + 153 ^ 143 + 178 - 258 + 127);
        GameRules.llIllIIlIIIIlI[5] = (0xC3 ^ 0xC6);
        GameRules.llIllIIlIIIIlI[6] = (0x36 ^ 0x3D ^ (0x62 ^ 0x6F));
        GameRules.llIllIIlIIIIlI[7] = (0x66 ^ 0x61);
        GameRules.llIllIIlIIIIlI[8] = (0xBB ^ 0xB3);
        GameRules.llIllIIlIIIIlI[9] = (0x1A ^ 0x16 ^ (0x95 ^ 0x90));
        GameRules.llIllIIlIIIIlI[10] = (0xB0 ^ 0xBA);
        GameRules.llIllIIlIIIIlI[11] = (0x4C ^ 0x5 ^ (0xC5 ^ 0x87));
        GameRules.llIllIIlIIIIlI[12] = (0x61 ^ 0x6D);
        GameRules.llIllIIlIIIIlI[13] = (68 + 32 - 66 + 96 ^ 108 + 51 - 90 + 74);
        GameRules.llIllIIlIIIIlI[14] = (0x52 ^ 0x54 ^ (0x5B ^ 0x53));
        GameRules.llIllIIlIIIIlI[15] = (0x38 ^ 0x14 ^ (0x35 ^ 0x16));
        GameRules.llIllIIlIIIIlI[16] = (0xA9 ^ 0xB9);
        GameRules.llIllIIlIIIIlI[17] = (0x5E ^ 0x4F);
        GameRules.llIllIIlIIIIlI[18] = (27 + 126 - 42 + 58 ^ 157 + 134 - 165 + 61);
        GameRules.llIllIIlIIIIlI[19] = (0xE2 ^ 0xBB ^ (0x2B ^ 0x61));
        GameRules.llIllIIlIIIIlI[20] = (0x7A ^ 0x6E);
        GameRules.llIllIIlIIIIlI[21] = (0xFD ^ 0xB1 ^ (0xC1 ^ 0x98));
        GameRules.llIllIIlIIIIlI[22] = (0xD1 ^ 0xC7);
        GameRules.llIllIIlIIIIlI[23] = (0xB9 ^ 0xAE);
        GameRules.llIllIIlIIIIlI[24] = (0x12 ^ 0xA);
        GameRules.llIllIIlIIIIlI[25] = (28 + 135 - 22 + 8 ^ 53 + 5 - 28 + 110);
        GameRules.llIllIIlIIIIlI[26] = (0x84 ^ 0x9E);
        GameRules.llIllIIlIIIIlI[27] = (0xAD ^ 0xB6);
        GameRules.llIllIIlIIIIlI[28] = (0xB4 ^ 0xA8);
        GameRules.llIllIIlIIIIlI[29] = (0x2A ^ 0x37);
        GameRules.llIllIIlIIIIlI[30] = (0x9C ^ 0x82);
        GameRules.llIllIIlIIIIlI[31] = (0xAB ^ 0xB4);
    }
    
    public int getInt(final String llllllllllllIllIIllllllIIlIlIllI) {
        final Value llllllllllllIllIIllllllIIlIlIlIl = this.theGameRules.get(llllllllllllIllIIllllllIIlIlIllI);
        int int1;
        if (lIIlIllIlIllIlll(llllllllllllIllIIllllllIIlIlIlIl)) {
            int1 = llllllllllllIllIIllllllIIlIlIlIl.getInt();
            "".length();
            if ("  ".length() < 0) {
                return (82 + 26 + 17 + 55 ^ 103 + 63 - 146 + 130) & (0x5E ^ 0x4D ^ (0xA1 ^ 0x90) ^ -" ".length());
            }
        }
        else {
            int1 = GameRules.llIllIIlIIIIlI[0];
        }
        return int1;
    }
    
    public GameRules() {
        this.theGameRules = new TreeMap<String, Value>();
        this.addGameRule(GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[0]], GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[1]], ValueType.BOOLEAN_VALUE);
        this.addGameRule(GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[2]], GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[3]], ValueType.BOOLEAN_VALUE);
        this.addGameRule(GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[4]], GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[5]], ValueType.BOOLEAN_VALUE);
        this.addGameRule(GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[6]], GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[7]], ValueType.BOOLEAN_VALUE);
        this.addGameRule(GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[8]], GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[9]], ValueType.BOOLEAN_VALUE);
        this.addGameRule(GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[10]], GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[11]], ValueType.BOOLEAN_VALUE);
        this.addGameRule(GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[12]], GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[13]], ValueType.BOOLEAN_VALUE);
        this.addGameRule(GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[14]], GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[15]], ValueType.BOOLEAN_VALUE);
        this.addGameRule(GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[16]], GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[17]], ValueType.BOOLEAN_VALUE);
        this.addGameRule(GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[18]], GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[19]], ValueType.BOOLEAN_VALUE);
        this.addGameRule(GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[20]], GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[21]], ValueType.BOOLEAN_VALUE);
        this.addGameRule(GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[22]], GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[23]], ValueType.BOOLEAN_VALUE);
        this.addGameRule(GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[24]], GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[25]], ValueType.NUMERICAL_VALUE);
        this.addGameRule(GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[26]], GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[27]], ValueType.BOOLEAN_VALUE);
        this.addGameRule(GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[28]], GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[29]], ValueType.BOOLEAN_VALUE);
    }
    
    public String getString(final String llllllllllllIllIIllllllIIllIIlIl) {
        final Value llllllllllllIllIIllllllIIllIIlll = this.theGameRules.get(llllllllllllIllIIllllllIIllIIlIl);
        String string;
        if (lIIlIllIlIllIlll(llllllllllllIllIIllllllIIllIIlll)) {
            string = llllllllllllIllIIllllllIIllIIlll.getString();
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        else {
            string = GameRules.llIllIIlIIIIII[GameRules.llIllIIlIIIIlI[30]];
        }
        return string;
    }
    
    private static boolean lIIlIllIlIlllIll(final Object llllllllllllIllIIlllllIllllIIlIl, final Object llllllllllllIllIIlllllIllllIIlII) {
        return llllllllllllIllIIlllllIllllIIlIl != llllllllllllIllIIlllllIllllIIlII;
    }
    
    private static String lIIlIllIlIlIllII(String llllllllllllIllIIllllllIIIIIlllI, final String llllllllllllIllIIllllllIIIIlIIlI) {
        llllllllllllIllIIllllllIIIIIlllI = new String(Base64.getDecoder().decode(llllllllllllIllIIllllllIIIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIllllllIIIIlIIIl = new StringBuilder();
        final char[] llllllllllllIllIIllllllIIIIlIIII = llllllllllllIllIIllllllIIIIlIIlI.toCharArray();
        int llllllllllllIllIIllllllIIIIIllll = GameRules.llIllIIlIIIIlI[0];
        final int llllllllllllIllIIllllllIIIIIlIIl = (Object)llllllllllllIllIIllllllIIIIIlllI.toCharArray();
        final char llllllllllllIllIIllllllIIIIIlIII = (char)llllllllllllIllIIllllllIIIIIlIIl.length;
        short llllllllllllIllIIllllllIIIIIIlll = (short)GameRules.llIllIIlIIIIlI[0];
        while (lIIlIllIlIllllIl(llllllllllllIllIIllllllIIIIIIlll, llllllllllllIllIIllllllIIIIIlIII)) {
            final char llllllllllllIllIIllllllIIIIlIlII = llllllllllllIllIIllllllIIIIIlIIl[llllllllllllIllIIllllllIIIIIIlll];
            llllllllllllIllIIllllllIIIIlIIIl.append((char)(llllllllllllIllIIllllllIIIIlIlII ^ llllllllllllIllIIllllllIIIIlIIII[llllllllllllIllIIllllllIIIIIllll % llllllllllllIllIIllllllIIIIlIIII.length]));
            "".length();
            ++llllllllllllIllIIllllllIIIIIllll;
            ++llllllllllllIllIIllllllIIIIIIlll;
            "".length();
            if ("  ".length() > "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIllllllIIIIlIIIl);
    }
    
    private static boolean lIIlIllIlIllIlll(final Object llllllllllllIllIIlllllIllllIIIlI) {
        return llllllllllllIllIIlllllIllllIIIlI != null;
    }
    
    public String[] getRules() {
        final Set<String> llllllllllllIllIIllllllIIIllIIlI = this.theGameRules.keySet();
        return llllllllllllIllIIllllllIIIllIIlI.toArray(new String[llllllllllllIllIIllllllIIIllIIlI.size()]);
    }
    
    static class Value
    {
        private static final /* synthetic */ int[] lIIlllIIIllIIl;
        private /* synthetic */ boolean valueBoolean;
        private /* synthetic */ double valueDouble;
        private final /* synthetic */ ValueType type;
        private /* synthetic */ String valueString;
        private /* synthetic */ int valueInteger;
        
        public void setValue(final String lllllllllllllIIlIlIIIlIlllIlIllI) {
            this.valueString = lllllllllllllIIlIlIIIlIlllIlIllI;
            this.valueBoolean = Boolean.parseBoolean(lllllllllllllIIlIlIIIlIlllIlIllI);
            int valueInteger;
            if (llIllIlIllIIIlI(this.valueBoolean ? 1 : 0)) {
                valueInteger = Value.lIIlllIIIllIIl[0];
                "".length();
                if ((0x98 ^ 0x9C) != (0x91 ^ 0x95)) {
                    return;
                }
            }
            else {
                valueInteger = Value.lIIlllIIIllIIl[1];
            }
            this.valueInteger = valueInteger;
            try {
                this.valueInteger = Integer.parseInt(lllllllllllllIIlIlIIIlIlllIlIllI);
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
            }
            catch (NumberFormatException ex) {}
            try {
                this.valueDouble = Double.parseDouble(lllllllllllllIIlIlIIIlIlllIlIllI);
                "".length();
                if ((10 + 111 - 57 + 125 ^ 150 + 142 - 255 + 148) < 0) {
                    return;
                }
            }
            catch (NumberFormatException ex2) {}
        }
        
        public Value(final String lllllllllllllIIlIlIIIlIllllIlIll, final ValueType lllllllllllllIIlIlIIIlIllllIlIIl) {
            this.type = lllllllllllllIIlIlIIIlIllllIlIIl;
            this.setValue(lllllllllllllIIlIlIIIlIllllIlIll);
        }
        
        public int getInt() {
            return this.valueInteger;
        }
        
        public String getString() {
            return this.valueString;
        }
        
        static {
            llIllIlIllIIIIl();
        }
        
        public boolean getBoolean() {
            return this.valueBoolean;
        }
        
        private static boolean llIllIlIllIIIlI(final int lllllllllllllIIlIlIIIlIllIllIlII) {
            return lllllllllllllIIlIlIIIlIllIllIlII != 0;
        }
        
        private static void llIllIlIllIIIIl() {
            (lIIlllIIIllIIl = new int[2])[0] = " ".length();
            Value.lIIlllIIIllIIl[1] = ((0x4 ^ 0x30) & ~(0x17 ^ 0x23));
        }
        
        public ValueType getType() {
            return this.type;
        }
    }
    
    public enum ValueType
    {
        NUMERICAL_VALUE(ValueType.lIllIllIIIllIl[ValueType.lIllIllIIIlllI[2]], ValueType.lIllIllIIIlllI[2]);
        
        private static final /* synthetic */ String[] lIllIllIIIllIl;
        private static final /* synthetic */ int[] lIllIllIIIlllI;
        
        ANY_VALUE(ValueType.lIllIllIIIllIl[ValueType.lIllIllIIIlllI[0]], ValueType.lIllIllIIIlllI[0]), 
        BOOLEAN_VALUE(ValueType.lIllIllIIIllIl[ValueType.lIllIllIIIlllI[1]], ValueType.lIllIllIIIlllI[1]);
        
        private static String lllllllIlllIIll(final String llllllllllllIlllllllIIlIllllIIlI, final String llllllllllllIlllllllIIlIllllIIIl) {
            try {
                final SecretKeySpec llllllllllllIlllllllIIlIllllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllllIIlIllllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlllllllIIlIllllIlII = Cipher.getInstance("Blowfish");
                llllllllllllIlllllllIIlIllllIlII.init(ValueType.lIllIllIIIlllI[2], llllllllllllIlllllllIIlIllllIlIl);
                return new String(llllllllllllIlllllllIIlIllllIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlllllllIIlIllllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllllllIIlIllllIIll) {
                llllllllllllIlllllllIIlIllllIIll.printStackTrace();
                return null;
            }
        }
        
        private static void lllllllIlllIlIl() {
            (lIllIllIIIllIl = new String[ValueType.lIllIllIIIlllI[3]])[ValueType.lIllIllIIIlllI[0]] = lllllllIlllIIll("ccqZxrwF4U+93cOxQCzY8A==", "kSoyx");
            ValueType.lIllIllIIIllIl[ValueType.lIllIllIIIlllI[1]] = lllllllIlllIlII("BRs7ICQGGis6IAsBMQ==", "GTtla");
            ValueType.lIllIllIIIllIl[ValueType.lIllIllIIIlllI[2]] = lllllllIlllIlII("KDsuNT0vLSI8MDAvLyUq", "fncpo");
        }
        
        private static void lllllllIlllIllI() {
            (lIllIllIIIlllI = new int[4])[0] = ((0xB1 ^ 0x8F) & ~(0x6B ^ 0x55));
            ValueType.lIllIllIIIlllI[1] = " ".length();
            ValueType.lIllIllIIIlllI[2] = "  ".length();
            ValueType.lIllIllIIIlllI[3] = "   ".length();
        }
        
        private static boolean lllllllIlllIlll(final int llllllllllllIlllllllIIlIllIlIIlI, final int llllllllllllIlllllllIIlIllIlIIIl) {
            return llllllllllllIlllllllIIlIllIlIIlI < llllllllllllIlllllllIIlIllIlIIIl;
        }
        
        private static String lllllllIlllIlII(String llllllllllllIlllllllIIlIllIlllIl, final String llllllllllllIlllllllIIlIlllIIIIl) {
            llllllllllllIlllllllIIlIllIlllIl = new String(Base64.getDecoder().decode(llllllllllllIlllllllIIlIllIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlllllllIIlIlllIIIII = new StringBuilder();
            final char[] llllllllllllIlllllllIIlIllIlllll = llllllllllllIlllllllIIlIlllIIIIl.toCharArray();
            int llllllllllllIlllllllIIlIllIllllI = ValueType.lIllIllIIIlllI[0];
            final short llllllllllllIlllllllIIlIllIllIII = (Object)llllllllllllIlllllllIIlIllIlllIl.toCharArray();
            final Exception llllllllllllIlllllllIIlIllIlIlll = (Exception)llllllllllllIlllllllIIlIllIllIII.length;
            float llllllllllllIlllllllIIlIllIlIllI = ValueType.lIllIllIIIlllI[0];
            while (lllllllIlllIlll((int)llllllllllllIlllllllIIlIllIlIllI, (int)llllllllllllIlllllllIIlIllIlIlll)) {
                final char llllllllllllIlllllllIIlIlllIIIll = llllllllllllIlllllllIIlIllIllIII[llllllllllllIlllllllIIlIllIlIllI];
                llllllllllllIlllllllIIlIlllIIIII.append((char)(llllllllllllIlllllllIIlIlllIIIll ^ llllllllllllIlllllllIIlIllIlllll[llllllllllllIlllllllIIlIllIllllI % llllllllllllIlllllllIIlIllIlllll.length]));
                "".length();
                ++llllllllllllIlllllllIIlIllIllllI;
                ++llllllllllllIlllllllIIlIllIlIllI;
                "".length();
                if ("  ".length() <= ((47 + 151 - 149 + 129 ^ 109 + 94 - 86 + 11) & (0xA3 ^ 0xB9 ^ (0x98 ^ 0xB0) ^ -" ".length()))) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlllllllIIlIlllIIIII);
        }
        
        private ValueType(final String llllllllllllIlllllllIIllIIIIIIll, final int llllllllllllIlllllllIIllIIIIIIlI) {
        }
        
        static {
            lllllllIlllIllI();
            lllllllIlllIlIl();
            final ValueType[] enum$VALUES = new ValueType[ValueType.lIllIllIIIlllI[3]];
            enum$VALUES[ValueType.lIllIllIIIlllI[0]] = ValueType.ANY_VALUE;
            enum$VALUES[ValueType.lIllIllIIIlllI[1]] = ValueType.BOOLEAN_VALUE;
            enum$VALUES[ValueType.lIllIllIIIlllI[2]] = ValueType.NUMERICAL_VALUE;
            ENUM$VALUES = enum$VALUES;
        }
    }
}
