// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.server.management;

import java.text.ParseException;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.gson.JsonObject;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class BanEntry<T> extends UserListEntry<T>
{
    private static final /* synthetic */ String[] llIlllIIIlIlll;
    protected final /* synthetic */ String bannedBy;
    protected final /* synthetic */ Date banEndDate;
    protected final /* synthetic */ Date banStartDate;
    public static final /* synthetic */ SimpleDateFormat dateFormat;
    private static final /* synthetic */ int[] llIlllIIlllIII;
    protected final /* synthetic */ String reason;
    
    @Override
    protected void onSerialization(final JsonObject llllllllllllIllIIlIIlIlllllIlIIl) {
        llllllllllllIllIIlIIlIlllllIlIIl.addProperty(BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[13]], BanEntry.dateFormat.format(this.banStartDate));
        llllllllllllIllIIlIIlIlllllIlIIl.addProperty(BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[14]], this.bannedBy);
        final String s = BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[15]];
        String format;
        if (lIIllIIllIIIlllI(this.banEndDate)) {
            format = BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[16]];
            "".length();
            if (" ".length() >= "   ".length()) {
                return;
            }
        }
        else {
            format = BanEntry.dateFormat.format(this.banEndDate);
        }
        llllllllllllIllIIlIIlIlllllIlIIl.addProperty(s, format);
        llllllllllllIllIIlIIlIlllllIlIIl.addProperty(BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[17]], this.reason);
    }
    
    private static String lIIllIIlIIlllIIl(final String llllllllllllIllIIlIIlIlllIllllII, final String llllllllllllIllIIlIIlIlllIlllIll) {
        try {
            final SecretKeySpec llllllllllllIllIIlIIlIlllIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIlIlllIlllIll.getBytes(StandardCharsets.UTF_8)), BanEntry.llIlllIIlllIII[8]), "DES");
            final Cipher llllllllllllIllIIlIIlIlllIlllllI = Cipher.getInstance("DES");
            llllllllllllIllIIlIIlIlllIlllllI.init(BanEntry.llIlllIIlllIII[2], llllllllllllIllIIlIIlIlllIllllll);
            return new String(llllllllllllIllIIlIIlIlllIlllllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIlIlllIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIIlIlllIllllIl) {
            llllllllllllIllIIlIIlIlllIllllIl.printStackTrace();
            return null;
        }
    }
    
    public Date getBanEndDate() {
        return this.banEndDate;
    }
    
    private static boolean lIIllIIllIIIlllI(final Object llllllllllllIllIIlIIlIlllIllIIIl) {
        return llllllllllllIllIIlIIlIlllIllIIIl == null;
    }
    
    private static String lIIllIIlIlIIIlIl(String llllllllllllIllIIlIIlIllllIllIIl, final String llllllllllllIllIIlIIlIllllIlllIl) {
        llllllllllllIllIIlIIlIllllIllIIl = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIlIIlIllllIllIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIlIIlIllllIlllII = new StringBuilder();
        final char[] llllllllllllIllIIlIIlIllllIllIll = llllllllllllIllIIlIIlIllllIlllIl.toCharArray();
        int llllllllllllIllIIlIIlIllllIllIlI = BanEntry.llIlllIIlllIII[0];
        final char llllllllllllIllIIlIIlIllllIlIlII = (Object)((String)llllllllllllIllIIlIIlIllllIllIIl).toCharArray();
        final String llllllllllllIllIIlIIlIllllIlIIll = (String)llllllllllllIllIIlIIlIllllIlIlII.length;
        Exception llllllllllllIllIIlIIlIllllIlIIlI = (Exception)BanEntry.llIlllIIlllIII[0];
        while (lIIllIIllIIlIIII((int)llllllllllllIllIIlIIlIllllIlIIlI, (int)llllllllllllIllIIlIIlIllllIlIIll)) {
            final char llllllllllllIllIIlIIlIllllIlllll = llllllllllllIllIIlIIlIllllIlIlII[llllllllllllIllIIlIIlIllllIlIIlI];
            llllllllllllIllIIlIIlIllllIlllII.append((char)(llllllllllllIllIIlIIlIllllIlllll ^ llllllllllllIllIIlIIlIllllIllIll[llllllllllllIllIIlIIlIllllIllIlI % llllllllllllIllIIlIIlIllllIllIll.length]));
            "".length();
            ++llllllllllllIllIIlIIlIllllIllIlI;
            ++llllllllllllIllIIlIIlIllllIlIIlI;
            "".length();
            if (((0x43 ^ 0x4 ^ (0xC4 ^ 0xA9)) & (0xD7 ^ 0x83 ^ (0xF7 ^ 0x89) ^ -" ".length())) >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIlIIlIllllIlllII);
    }
    
    private static String lIIllIIlIlIIIlII(final String llllllllllllIllIIlIIlIllllIIlIIl, final String llllllllllllIllIIlIIlIllllIIIllI) {
        try {
            final SecretKeySpec llllllllllllIllIIlIIlIllllIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIlIllllIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlIIlIllllIIlIll = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlIIlIllllIIlIll.init(BanEntry.llIlllIIlllIII[2], llllllllllllIllIIlIIlIllllIIllII);
            return new String(llllllllllllIllIIlIIlIllllIIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIlIllllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIIlIllllIIlIlI) {
            llllllllllllIllIIlIIlIllllIIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static void lIIllIIllIIIllIl() {
        (llIlllIIlllIII = new int[19])[0] = ((0x4C ^ 0x6F) & ~(0x38 ^ 0x1B));
        BanEntry.llIlllIIlllIII[1] = " ".length();
        BanEntry.llIlllIIlllIII[2] = "  ".length();
        BanEntry.llIlllIIlllIII[3] = "   ".length();
        BanEntry.llIlllIIlllIII[4] = (152 + 78 - 110 + 64 ^ 92 + 99 - 71 + 68);
        BanEntry.llIlllIIlllIII[5] = (99 + 44 - 8 + 36 ^ 173 + 0 - 58 + 59);
        BanEntry.llIlllIIlllIII[6] = (0xA5 ^ 0xA3);
        BanEntry.llIlllIIlllIII[7] = (0x16 ^ 0x23 ^ (0x32 ^ 0x0));
        BanEntry.llIlllIIlllIII[8] = (0x15 ^ 0x1D);
        BanEntry.llIlllIIlllIII[9] = (74 + 38 - 96 + 117 ^ 64 + 46 - 101 + 131);
        BanEntry.llIlllIIlllIII[10] = (0x2D ^ 0x27);
        BanEntry.llIlllIIlllIII[11] = (0x91 ^ 0x9A);
        BanEntry.llIlllIIlllIII[12] = (0x6 ^ 0xA);
        BanEntry.llIlllIIlllIII[13] = (0x44 ^ 0x49);
        BanEntry.llIlllIIlllIII[14] = (0xB3 ^ 0xAD ^ (0x65 ^ 0x75));
        BanEntry.llIlllIIlllIII[15] = (116 + 4 - 63 + 133 ^ 57 + 91 - 11 + 40);
        BanEntry.llIlllIIlllIII[16] = (0x2A ^ 0x3A);
        BanEntry.llIlllIIlllIII[17] = (0x95 ^ 0x9B ^ (0xB9 ^ 0xA6));
        BanEntry.llIlllIIlllIII[18] = (0xD2 ^ 0xC0);
    }
    
    public BanEntry(final T llllllllllllIllIIlIIllIIIIIlIlll, final Date llllllllllllIllIIlIIllIIIIIlIllI, final String llllllllllllIllIIlIIllIIIIIlIlIl, final Date llllllllllllIllIIlIIllIIIIIlIlII, final String llllllllllllIllIIlIIllIIIIIIllIl) {
        super(llllllllllllIllIIlIIllIIIIIlIlll);
        Date banStartDate;
        if (lIIllIIllIIIlllI(llllllllllllIllIIlIIllIIIIIlIllI)) {
            banStartDate = new Date();
            "".length();
            if ("  ".length() == 0) {
                throw null;
            }
        }
        else {
            banStartDate = llllllllllllIllIIlIIllIIIIIlIllI;
        }
        this.banStartDate = banStartDate;
        String bannedBy;
        if (lIIllIIllIIIlllI(llllllllllllIllIIlIIllIIIIIlIlIl)) {
            bannedBy = BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[1]];
            "".length();
            if ("  ".length() == 0) {
                throw null;
            }
        }
        else {
            bannedBy = llllllllllllIllIIlIIllIIIIIlIlIl;
        }
        this.bannedBy = bannedBy;
        this.banEndDate = llllllllllllIllIIlIIllIIIIIlIlII;
        String reason;
        if (lIIllIIllIIIlllI(llllllllllllIllIIlIIllIIIIIIllIl)) {
            reason = BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[2]];
            "".length();
            if (-" ".length() >= 0) {
                throw null;
            }
        }
        else {
            reason = llllllllllllIllIIlIIllIIIIIIllIl;
        }
        this.reason = reason;
    }
    
    private static boolean lIIllIIllIIIllll(final int llllllllllllIllIIlIIlIlllIlIllll) {
        return llllllllllllIllIIlIIlIlllIlIllll != 0;
    }
    
    private static boolean lIIllIIllIIlIIII(final int llllllllllllIllIIlIIlIlllIllIlII, final int llllllllllllIllIIlIIlIlllIllIIll) {
        return llllllllllllIllIIlIIlIlllIllIlII < llllllllllllIllIIlIIlIlllIllIIll;
    }
    
    @Override
    boolean hasBanExpired() {
        int before;
        if (lIIllIIllIIIlllI(this.banEndDate)) {
            before = BanEntry.llIlllIIlllIII[0];
            "".length();
            if (" ".length() >= (49 + 127 - 14 + 4 ^ 135 + 89 - 106 + 44)) {
                return ((0xBC ^ 0x96 ^ (0x94 ^ 0x8B)) & (0x1C ^ 0xF ^ (0xBE ^ 0x98) ^ -" ".length())) != 0x0;
            }
        }
        else {
            before = (this.banEndDate.before(new Date()) ? 1 : 0);
        }
        return before != 0;
    }
    
    static {
        lIIllIIllIIIllIl();
        lIIllIIlIlIIlllI();
        dateFormat = new SimpleDateFormat(BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[0]]);
    }
    
    private static void lIIllIIlIlIIlllI() {
        (llIlllIIIlIlll = new String[BanEntry.llIlllIIlllIII[18]])[BanEntry.llIlllIIlllIII[0]] = lIIllIIlIIlllIIl("Iw783uNkCRJaGEBpmGaQsOFlPTodwrOC", "AHfiC");
        BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[1]] = lIIllIIlIIlllIIl("G5Cfc89cHSNrxjA60Up26g==", "YGPAC");
        BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[2]] = lIIllIIlIlIIIlII("zDyM3EnGVQuo0/Mypw9Xw5W4AgSYzfzw", "VgLME");
        BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[3]] = lIIllIIlIlIIIlIl("BCEtJTwCNw==", "gSHDH");
        BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[4]] = lIIllIIlIlIIIlII("ccJJlmWgEYk=", "WNPda");
        BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[5]] = lIIllIIlIIlllIIl("nhK+deoET0g=", "pVBEK");
        BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[6]] = lIIllIIlIIlllIIl("WYFb+v7gxoo=", "wfRjk");
        BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[7]] = lIIllIIlIIlllIIl("j/yao8RLVU3zS+kLFYksCw==", "maxqY");
        BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[8]] = lIIllIIlIlIIIlII("e9iHKqRK2P8=", "gkSgf");
        BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[9]] = lIIllIIlIlIIIlII("FZ3tQflZ/D8=", "gbzDu");
        BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[10]] = lIIllIIlIlIIIlIl("KhEwMCs2", "XtQCD");
        BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[11]] = lIIllIIlIlIIIlIl("FxI0GxgL", "ewUhw");
        BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[12]] = lIIllIIlIlIIIlII("JN8AVXVKxbGH08te1muZW7ehT+Tk1/UF", "HEVHv");
        BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[13]] = lIIllIIlIIlllIIl("92wZAHMPWOU=", "EJHWt");
        BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[14]] = lIIllIIlIlIIIlII("uZVJFfS4k3g=", "rDeRt");
        BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[15]] = lIIllIIlIlIIIlIl("Hx40DxYfFQ==", "zfDfd");
        BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[16]] = lIIllIIlIlIIIlII("dGDkd9UFbIw=", "ACOij");
        BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[17]] = lIIllIIlIIlllIIl("S55xqpBvpdA=", "UQPnQ");
    }
    
    public String getBanReason() {
        return this.reason;
    }
    
    protected BanEntry(final T llllllllllllIllIIlIIlIllllllllII, final JsonObject llllllllllllIllIIlIIlIlllllllIll) {
        super(llllllllllllIllIIlIIlIllllllllII, llllllllllllIllIIlIIlIlllllllIll);
        Date llllllllllllIllIIlIIllIIIIIIIIlI = null;
        try {
            Date parse;
            if (lIIllIIllIIIllll(llllllllllllIllIIlIIlIlllllllIll.has(BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[3]]) ? 1 : 0)) {
                parse = BanEntry.dateFormat.parse(llllllllllllIllIIlIIlIlllllllIll.get(BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[4]]).getAsString());
                "".length();
                if ("  ".length() <= 0) {
                    throw null;
                }
            }
            else {
                parse = new Date();
            }
            final Date llllllllllllIllIIlIIllIIIIIIIIll = parse;
            "".length();
            if ("   ".length() > (0xB8 ^ 0xBC)) {
                throw null;
            }
        }
        catch (ParseException llllllllllllIllIIlIIllIIIIIIIIIl) {
            llllllllllllIllIIlIIllIIIIIIIIlI = new Date();
        }
        this.banStartDate = llllllllllllIllIIlIIllIIIIIIIIlI;
        String asString;
        if (lIIllIIllIIIllll(llllllllllllIllIIlIIlIlllllllIll.has(BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[5]]) ? 1 : 0)) {
            asString = llllllllllllIllIIlIIlIlllllllIll.get(BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[6]]).getAsString();
            "".length();
            if ((0xA8 ^ 0xAC) == ((0x7E ^ 0x2C) & ~(0x67 ^ 0x35))) {
                throw null;
            }
        }
        else {
            asString = BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[7]];
        }
        this.bannedBy = asString;
        Date llllllllllllIllIIlIIlIllllllllll = null;
        try {
            Date parse2;
            if (lIIllIIllIIIllll(llllllllllllIllIIlIIlIlllllllIll.has(BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[8]]) ? 1 : 0)) {
                parse2 = BanEntry.dateFormat.parse(llllllllllllIllIIlIIlIlllllllIll.get(BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[9]]).getAsString());
                "".length();
                if ("  ".length() == 0) {
                    throw null;
                }
            }
            else {
                parse2 = null;
            }
            final Date llllllllllllIllIIlIIllIIIIIIIIII = parse2;
            "".length();
            if (null != null) {
                throw null;
            }
        }
        catch (ParseException llllllllllllIllIIlIIlIlllllllllI) {
            llllllllllllIllIIlIIlIllllllllll = null;
        }
        this.banEndDate = llllllllllllIllIIlIIlIllllllllll;
        String asString2;
        if (lIIllIIllIIIllll(llllllllllllIllIIlIIlIlllllllIll.has(BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[10]]) ? 1 : 0)) {
            asString2 = llllllllllllIllIIlIIlIlllllllIll.get(BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[11]]).getAsString();
            "".length();
            if (null != null) {
                throw null;
            }
        }
        else {
            asString2 = BanEntry.llIlllIIIlIlll[BanEntry.llIlllIIlllIII[12]];
        }
        this.reason = asString2;
    }
}
