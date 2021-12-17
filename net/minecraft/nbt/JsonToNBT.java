// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.nbt;

import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;
import com.google.common.collect.Iterables;
import com.google.common.base.Splitter;
import org.apache.logging.log4j.LogManager;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Stack;
import java.util.regex.Pattern;
import org.apache.logging.log4j.Logger;

public class JsonToNBT
{
    private static final /* synthetic */ String[] llIIlllIlIllIl;
    private static final /* synthetic */ int[] llIIlllIlIllll;
    private static final /* synthetic */ Pattern field_179273_b;
    
    private static Any func_179270_a(final String llllllllllllIllIllllIIllIIlllIII, final boolean llllllllllllIllIllllIIllIIllIlll) throws NBTException {
        final String llllllllllllIllIllllIIllIIllIllI = func_150313_b(llllllllllllIllIllllIIllIIlllIII, llllllllllllIllIllllIIllIIllIlll);
        final String llllllllllllIllIllllIIllIIllIlIl = func_150311_c(llllllllllllIllIllllIIllIIlllIII, llllllllllllIllIllllIIllIIllIlll);
        final String[] llllllllllllIllIllllIIllIlIlIIlI = new String[JsonToNBT.llIIlllIlIllll[2]];
        llllllllllllIllIllllIIllIlIlIIlI[JsonToNBT.llIIlllIlIllll[0]] = llllllllllllIllIllllIIllIIllIllI;
        llllllllllllIllIllllIIllIlIlIIlI[JsonToNBT.llIIlllIlIllll[1]] = llllllllllllIllIllllIIllIIllIlIl;
        return func_179272_a(llllllllllllIllIllllIIllIlIlIIlI);
    }
    
    private static String func_150311_c(String llllllllllllIllIllllIIlIlllllIlI, final boolean llllllllllllIllIllllIIlIlllllIIl) throws NBTException {
        if (lIIIlllllIllllII(llllllllllllIllIllllIIlIlllllIIl ? 1 : 0)) {
            llllllllllllIllIllllIIlIlllllIlI = llllllllllllIllIllllIIlIlllllIlI.trim();
            if (!lIIIlllllIlllIIl(llllllllllllIllIllllIIlIlllllIlI.startsWith(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[34]]) ? 1 : 0) || lIIIlllllIllllII(llllllllllllIllIllllIIlIlllllIlI.startsWith(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[35]]) ? 1 : 0)) {
                return llllllllllllIllIllllIIlIlllllIlI;
            }
        }
        final int llllllllllllIllIllllIIlIlllllIll = func_150312_a(llllllllllllIllIllllIIlIlllllIlI, (char)JsonToNBT.llIIlllIlIllll[22]);
        if (!lIIIlllllIlllIll(llllllllllllIllIllllIIlIlllllIll, JsonToNBT.llIIlllIlIllll[23])) {
            return llllllllllllIllIllllIIlIlllllIlI.substring(llllllllllllIllIllllIIlIlllllIll + JsonToNBT.llIIlllIlIllll[1]).trim();
        }
        if (lIIIlllllIllllII(llllllllllllIllIllllIIlIlllllIIl ? 1 : 0)) {
            return llllllllllllIllIllllIIlIlllllIlI;
        }
        throw new NBTException(String.valueOf(new StringBuilder(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[36]]).append(llllllllllllIllIllllIIlIlllllIlI)));
    }
    
    private static String func_179269_a(final String llllllllllllIllIllllIIllIIIlIIlI, final int llllllllllllIllIllllIIllIIIllIlI) throws NBTException {
        final Stack<Character> llllllllllllIllIllllIIllIIIllIIl = new Stack<Character>();
        int llllllllllllIllIllllIIllIIIllIII = llllllllllllIllIllllIIllIIIllIlI + JsonToNBT.llIIlllIlIllll[1];
        boolean llllllllllllIllIllllIIllIIIlIlll = JsonToNBT.llIIlllIlIllll[0] != 0;
        boolean llllllllllllIllIllllIIllIIIlIllI = JsonToNBT.llIIlllIlIllll[0] != 0;
        boolean llllllllllllIllIllllIIllIIIlIlIl = JsonToNBT.llIIlllIlIllll[0] != 0;
        int llllllllllllIllIllllIIllIIIlIlII = JsonToNBT.llIIlllIlIllll[0];
        "".length();
        if ((0x5B ^ 0x20 ^ 39 + 6 - 12 + 94) < "   ".length()) {
            return null;
        }
        while (!lIIIlllllIllllIl(llllllllllllIllIllllIIllIIIllIII, llllllllllllIllIllllIIllIIIlIIlI.length())) {
            final char llllllllllllIllIllllIIllIIIlIIll = llllllllllllIllIllllIIllIIIlIIlI.charAt(llllllllllllIllIllllIIllIIIllIII);
            if (lIIIlllllIlllIll(llllllllllllIllIllllIIllIIIlIIll, JsonToNBT.llIIlllIlIllll[5])) {
                if (lIIIlllllIllllII(func_179271_b(llllllllllllIllIllllIIllIIIlIIlI, llllllllllllIllIllllIIllIIIllIII) ? 1 : 0)) {
                    if (lIIIlllllIlllIIl(llllllllllllIllIllllIIllIIIlIlll ? 1 : 0)) {
                        throw new NBTException(String.valueOf(new StringBuilder(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[26]]).append(llllllllllllIllIllllIIllIIIlIIlI)));
                    }
                }
                else {
                    int n;
                    if (lIIIlllllIllllII(llllllllllllIllIllllIIllIIIlIlll ? 1 : 0)) {
                        n = JsonToNBT.llIIlllIlIllll[0];
                        "".length();
                        if ((0xA1 ^ 0xA5) < 0) {
                            return null;
                        }
                    }
                    else {
                        n = JsonToNBT.llIIlllIlIllll[1];
                    }
                    llllllllllllIllIllllIIllIIIlIlll = (n != 0);
                    if (lIIIlllllIllllII(llllllllllllIllIllllIIllIIIlIlll ? 1 : 0) && lIIIlllllIlllIIl(llllllllllllIllIllllIIllIIIlIlIl ? 1 : 0)) {
                        llllllllllllIllIllllIIllIIIlIllI = (JsonToNBT.llIIlllIlIllll[1] != 0);
                    }
                    if (lIIIlllllIlllIIl(llllllllllllIllIllllIIllIIIlIlll ? 1 : 0)) {
                        llllllllllllIllIllllIIllIIIlIlII = llllllllllllIllIllllIIllIIIllIII;
                        "".length();
                        if (" ".length() <= 0) {
                            return null;
                        }
                    }
                }
            }
            else if (lIIIlllllIlllIIl(llllllllllllIllIllllIIllIIIlIlll ? 1 : 0)) {
                if (lIIIlllllIlllIlI(llllllllllllIllIllllIIllIIIlIIll, JsonToNBT.llIIlllIlIllll[7]) && lIIIlllllIlllIlI(llllllllllllIllIllllIIllIIIlIIll, JsonToNBT.llIIlllIlIllll[8])) {
                    if (lIIIlllllIlllIll(llllllllllllIllIllllIIllIIIlIIll, JsonToNBT.llIIlllIlIllll[9]) && (!lIIIlllllIlllIIl(llllllllllllIllIllllIIllIIIllIIl.isEmpty() ? 1 : 0) || lIIIlllllIlllIlI(llllllllllllIllIllllIIllIIIllIIl.pop(), JsonToNBT.llIIlllIlIllll[7]))) {
                        throw new NBTException(String.valueOf(new StringBuilder(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[27]]).append(llllllllllllIllIllllIIllIIIlIIlI)));
                    }
                    if (lIIIlllllIlllIll(llllllllllllIllIllllIIllIIIlIIll, JsonToNBT.llIIlllIlIllll[11]) && (!lIIIlllllIlllIIl(llllllllllllIllIllllIIllIIIllIIl.isEmpty() ? 1 : 0) || lIIIlllllIlllIlI(llllllllllllIllIllllIIllIIIllIIl.pop(), JsonToNBT.llIIlllIlIllll[8]))) {
                        throw new NBTException(String.valueOf(new StringBuilder(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[28]]).append(llllllllllllIllIllllIIllIIIlIIlI)));
                    }
                    if (lIIIlllllIlllIll(llllllllllllIllIllllIIllIIIlIIll, JsonToNBT.llIIlllIlIllll[16]) && lIIIlllllIllllII(llllllllllllIllIllllIIllIIIllIIl.isEmpty() ? 1 : 0)) {
                        return llllllllllllIllIllllIIllIIIlIIlI.substring(JsonToNBT.llIIlllIlIllll[0], llllllllllllIllIllllIIllIIIllIII);
                    }
                }
                else {
                    llllllllllllIllIllllIIllIIIllIIl.push(llllllllllllIllIllllIIllIIIlIIll);
                    "".length();
                }
            }
            if (lIIIlllllIlllIIl(Character.isWhitespace(llllllllllllIllIllllIIllIIIlIIll) ? 1 : 0)) {
                if (lIIIlllllIlllIIl(llllllllllllIllIllllIIllIIIlIlll ? 1 : 0) && lIIIlllllIllllII(llllllllllllIllIllllIIllIIIlIllI ? 1 : 0) && lIIIlllllIlllIlI(llllllllllllIllIllllIIllIIIlIlII, llllllllllllIllIllllIIllIIIllIII)) {
                    return llllllllllllIllIllllIIllIIIlIIlI.substring(JsonToNBT.llIIlllIlIllll[0], llllllllllllIllIllllIIllIIIlIlII + JsonToNBT.llIIlllIlIllll[1]);
                }
                llllllllllllIllIllllIIllIIIlIlIl = (JsonToNBT.llIIlllIlIllll[1] != 0);
            }
            ++llllllllllllIllIllllIIllIIIllIII;
        }
        return llllllllllllIllIllllIIllIIIlIIlI.substring(JsonToNBT.llIIlllIlIllll[0], llllllllllllIllIllllIIllIIIllIII);
    }
    
    private static boolean lIIIllllllIIIIII(final int llllllllllllIllIllllIIlIlIIllIll) {
        return llllllllllllIllIllllIIlIlIIllIll <= 0;
    }
    
    private static String lIIIlllllIlIlIll(String llllllllllllIllIllllIIlIllIIlIll, final String llllllllllllIllIllllIIlIllIIlIlI) {
        llllllllllllIllIllllIIlIllIIlIll = new String(Base64.getDecoder().decode(llllllllllllIllIllllIIlIllIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIllllIIlIllIIlIIl = new StringBuilder();
        final char[] llllllllllllIllIllllIIlIllIIlIII = llllllllllllIllIllllIIlIllIIlIlI.toCharArray();
        int llllllllllllIllIllllIIlIllIIIlll = JsonToNBT.llIIlllIlIllll[0];
        final double llllllllllllIllIllllIIlIllIIIIIl = (Object)llllllllllllIllIllllIIlIllIIlIll.toCharArray();
        final int llllllllllllIllIllllIIlIllIIIIII = llllllllllllIllIllllIIlIllIIIIIl.length;
        byte llllllllllllIllIllllIIlIlIllllll = (byte)JsonToNBT.llIIlllIlIllll[0];
        while (lIIIlllllIllllll(llllllllllllIllIllllIIlIlIllllll, llllllllllllIllIllllIIlIllIIIIII)) {
            final char llllllllllllIllIllllIIlIllIIllII = llllllllllllIllIllllIIlIllIIIIIl[llllllllllllIllIllllIIlIlIllllll];
            llllllllllllIllIllllIIlIllIIlIIl.append((char)(llllllllllllIllIllllIIlIllIIllII ^ llllllllllllIllIllllIIlIllIIlIII[llllllllllllIllIllllIIlIllIIIlll % llllllllllllIllIllllIIlIllIIlIII.length]));
            "".length();
            ++llllllllllllIllIllllIIlIllIIIlll;
            ++llllllllllllIllIllllIIlIlIllllll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIllllIIlIllIIlIIl);
    }
    
    private static boolean lIIIlllllIllllIl(final int llllllllllllIllIllllIIlIlIlIlIlI, final int llllllllllllIllIllllIIlIlIlIlIIl) {
        return llllllllllllIllIllllIIlIlIlIlIlI >= llllllllllllIllIllllIIlIlIlIlIIl;
    }
    
    private static boolean lIIIlllllIlllIIl(final int llllllllllllIllIllllIIlIlIIlllIl) {
        return llllllllllllIllIllllIIlIlIIlllIl == 0;
    }
    
    private static int func_150312_a(final String llllllllllllIllIllllIIlIllllIIlI, final char llllllllllllIllIllllIIlIllllIIIl) {
        int llllllllllllIllIllllIIlIllllIIII = JsonToNBT.llIIlllIlIllll[0];
        boolean llllllllllllIllIllllIIlIlllIllll = JsonToNBT.llIIlllIlIllll[1] != 0;
        "".length();
        if (" ".length() <= ((0x62 ^ 0x7 ^ (0xFC ^ 0xC7)) & (0x3E ^ 0x7F ^ (0xAB ^ 0xB4) ^ -" ".length()))) {
            return (126 + 64 - 121 + 99 ^ 134 + 1 - 41 + 65) & (0x3B ^ 0x62 ^ (0xC9 ^ 0xA7) ^ -" ".length());
        }
        while (!lIIIlllllIllllIl(llllllllllllIllIllllIIlIllllIIII, llllllllllllIllIllllIIlIllllIIlI.length())) {
            final char llllllllllllIllIllllIIlIlllIlllI = llllllllllllIllIllllIIlIllllIIlI.charAt(llllllllllllIllIllllIIlIllllIIII);
            if (lIIIlllllIlllIll(llllllllllllIllIllllIIlIlllIlllI, JsonToNBT.llIIlllIlIllll[5])) {
                if (lIIIlllllIlllIIl(func_179271_b(llllllllllllIllIllllIIlIllllIIlI, llllllllllllIllIllllIIlIllllIIII) ? 1 : 0)) {
                    int n;
                    if (lIIIlllllIllllII(llllllllllllIllIllllIIlIlllIllll ? 1 : 0)) {
                        n = JsonToNBT.llIIlllIlIllll[0];
                        "".length();
                        if (-(0x15 ^ 0x10) >= 0) {
                            return (0xE6 ^ 0xC3) & ~(0x38 ^ 0x1D);
                        }
                    }
                    else {
                        n = JsonToNBT.llIIlllIlIllll[1];
                    }
                    llllllllllllIllIllllIIlIlllIllll = (n != 0);
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return (0x2E ^ 0x58 ^ (0x69 ^ 0x2A)) & (0x29 ^ 0x4B ^ (0x3B ^ 0x6C) ^ -" ".length());
                    }
                }
            }
            else if (lIIIlllllIllllII(llllllllllllIllIllllIIlIlllIllll ? 1 : 0)) {
                if (lIIIlllllIlllIll(llllllllllllIllIllllIIlIlllIlllI, llllllllllllIllIllllIIlIllllIIIl)) {
                    return llllllllllllIllIllllIIlIllllIIII;
                }
                if (!lIIIlllllIlllIlI(llllllllllllIllIllllIIlIlllIlllI, JsonToNBT.llIIlllIlIllll[7]) || lIIIlllllIlllIll(llllllllllllIllIllllIIlIlllIlllI, JsonToNBT.llIIlllIlIllll[8])) {
                    return JsonToNBT.llIIlllIlIllll[23];
                }
            }
            ++llllllllllllIllIllllIIlIllllIIII;
        }
        return JsonToNBT.llIIlllIlIllll[23];
    }
    
    private static String lIIIlllllIlIlIlI(final String llllllllllllIllIllllIIlIllIllIll, final String llllllllllllIllIllllIIlIllIllIlI) {
        try {
            final SecretKeySpec llllllllllllIllIllllIIlIllIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllllIIlIllIllIlI.getBytes(StandardCharsets.UTF_8)), JsonToNBT.llIIlllIlIllll[13]), "DES");
            final Cipher llllllllllllIllIllllIIlIllIlllIl = Cipher.getInstance("DES");
            llllllllllllIllIllllIIlIllIlllIl.init(JsonToNBT.llIIlllIlIllll[2], llllllllllllIllIllllIIlIllIllllI);
            return new String(llllllllllllIllIllllIIlIllIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIllllIIlIllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllllIIlIllIlllII) {
            llllllllllllIllIllllIIlIllIlllII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIllllllIIIIIl(final int llllllllllllIllIllllIIlIlIlIIIlI, final int llllllllllllIllIllllIIlIlIlIIIIl) {
        return llllllllllllIllIllllIIlIlIlIIIlI > llllllllllllIllIllllIIlIlIlIIIIl;
    }
    
    private static boolean lIIIlllllIlllIlI(final int llllllllllllIllIllllIIlIlIIlIllI, final int llllllllllllIllIllllIIlIlIIlIlIl) {
        return llllllllllllIllIllllIIlIlIIlIllI != llllllllllllIllIllllIIlIlIIlIlIl;
    }
    
    private static boolean lIIIlllllIlllllI(final int llllllllllllIllIllllIIlIlIIllIIl) {
        return llllllllllllIllIllllIIlIlIIllIIl > 0;
    }
    
    static {
        lIIIlllllIlllIII();
        lIIIlllllIllIlll();
        logger = LogManager.getLogger();
        field_179273_b = Pattern.compile(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[0]]);
    }
    
    private static String func_150313_b(String llllllllllllIllIllllIIllIIIIIIll, final boolean llllllllllllIllIllllIIllIIIIIlIl) throws NBTException {
        if (lIIIlllllIllllII(llllllllllllIllIllllIIllIIIIIlIl ? 1 : 0)) {
            llllllllllllIllIllllIIllIIIIIIll = ((String)llllllllllllIllIllllIIllIIIIIIll).trim();
            if (!lIIIlllllIlllIIl(((String)llllllllllllIllIllllIIllIIIIIIll).startsWith(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[29]]) ? 1 : 0) || lIIIlllllIllllII(((String)llllllllllllIllIllllIIllIIIIIIll).startsWith(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[30]]) ? 1 : 0)) {
                return JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[31]];
            }
        }
        final int llllllllllllIllIllllIIllIIIIIlII = func_150312_a((String)llllllllllllIllIllllIIllIIIIIIll, (char)JsonToNBT.llIIlllIlIllll[22]);
        if (!lIIIlllllIlllIll(llllllllllllIllIllllIIllIIIIIlII, JsonToNBT.llIIlllIlIllll[23])) {
            return ((String)llllllllllllIllIllllIIllIIIIIIll).substring(JsonToNBT.llIIlllIlIllll[0], llllllllllllIllIllllIIllIIIIIlII).trim();
        }
        if (lIIIlllllIllllII(llllllllllllIllIllllIIllIIIIIlIl ? 1 : 0)) {
            return JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[32]];
        }
        throw new NBTException(String.valueOf(new StringBuilder(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[33]]).append((String)llllllllllllIllIllllIIllIIIIIIll)));
    }
    
    public static NBTTagCompound getTagFromJson(String llllllllllllIllIllllIIllIllIIllI) throws NBTException {
        llllllllllllIllIllllIIllIllIIllI = (short)((String)llllllllllllIllIllllIIllIllIIllI).trim();
        if (lIIIlllllIlllIIl(((String)llllllllllllIllIllllIIllIllIIllI).startsWith(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[1]]) ? 1 : 0)) {
            throw new NBTException(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[2]]);
        }
        if (lIIIlllllIlllIlI(func_150310_b((String)llllllllllllIllIllllIIllIllIIllI), JsonToNBT.llIIlllIlIllll[1])) {
            throw new NBTException(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[3]]);
        }
        return (NBTTagCompound)func_150316_a(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[4]], (String)llllllllllllIllIllllIIllIllIIllI).parse();
    }
    
    private static String lIIIlllllIlIllII(final String llllllllllllIllIllllIIlIlIllIllI, final String llllllllllllIllIllllIIlIlIllIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIllllIIlIlIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllllIIlIlIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllllIIlIlIlllIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIllllIIlIlIlllIII.init(JsonToNBT.llIIlllIlIllll[2], llllllllllllIllIllllIIlIlIlllIIl);
            return new String(llllllllllllIllIllllIIlIlIlllIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIllllIIlIlIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllllIIlIlIllIlll) {
            llllllllllllIllIllllIIlIlIllIlll.printStackTrace();
            return null;
        }
    }
    
    private static String func_150314_a(final String llllllllllllIllIllllIIllIIlIllII, final boolean llllllllllllIllIllllIIllIIlIlIll) throws NBTException {
        int llllllllllllIllIllllIIllIIlIlIlI = func_150312_a(llllllllllllIllIllllIIllIIlIllII, (char)JsonToNBT.llIIlllIlIllll[22]);
        final int llllllllllllIllIllllIIllIIlIlIIl = func_150312_a(llllllllllllIllIllllIIllIIlIllII, (char)JsonToNBT.llIIlllIlIllll[16]);
        if (lIIIlllllIllllII(llllllllllllIllIllllIIllIIlIlIll ? 1 : 0)) {
            if (lIIIlllllIlllIll(llllllllllllIllIllllIIllIIlIlIlI, JsonToNBT.llIIlllIlIllll[23])) {
                throw new NBTException(String.valueOf(new StringBuilder(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[24]]).append(llllllllllllIllIllllIIllIIlIllII)));
            }
            if (lIIIlllllIlllIlI(llllllllllllIllIllllIIllIIlIlIIl, JsonToNBT.llIIlllIlIllll[23]) && lIIIlllllIllllll(llllllllllllIllIllllIIllIIlIlIIl, llllllllllllIllIllllIIllIIlIlIlI)) {
                throw new NBTException(String.valueOf(new StringBuilder(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[25]]).append(llllllllllllIllIllllIIllIIlIllII)));
            }
        }
        else if (!lIIIlllllIlllIlI(llllllllllllIllIllllIIllIIlIlIlI, JsonToNBT.llIIlllIlIllll[23]) || lIIIllllllIIIIIl(llllllllllllIllIllllIIllIIlIlIlI, llllllllllllIllIllllIIllIIlIlIIl)) {
            llllllllllllIllIllllIIllIIlIlIlI = JsonToNBT.llIIlllIlIllll[23];
        }
        return func_179269_a(llllllllllllIllIllllIIllIIlIllII, llllllllllllIllIllllIIllIIlIlIlI);
    }
    
    private static void lIIIlllllIllIlll() {
        (llIIlllIlIllIl = new String[JsonToNBT.llIIlllIlIllll[38]])[JsonToNBT.llIIlllIlIllll[0]] = lIIIlllllIlIlIlI("ub0bkPvoqxNL19tllX4fyQ==", "lhOQw");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[1]] = lIIIlllllIlIlIll("EQ==", "jihBp");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[2]] = lIIIlllllIlIlIlI("+yc1KJG/mxKE3k5CiKLf6Ke81sXXMGgzdnXRGVTbzDagP0G6P0MDOEokov60WSo0FjxOBJRkEaM=", "cgIxS");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[3]] = lIIIlllllIlIlIll("BAULOw0vHw0mHSVLBSEUNQIYOB1hHwckWDUKDydUYQQGOAFhBAYxWCQTGDEbNQ4M", "AkhTx");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[4]] = lIIIlllllIlIllII("471b7uJWmwY=", "phiei");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[6]] = lIIIlllllIlIllII("K5r6kRrm6Mjctf5bB8wv4LmC2XQYulGC", "NlTMx");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[10]] = lIIIlllllIlIlIlI("cTIWg13o2s8adX07iJvhjgLmm1jvsG/NmAE8H+1cddk=", "luZIN");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[12]] = lIIIlllllIlIllII("D6lWdXCGKGGtxscPB8Tg9wOmGcE66qTbT4qRg6juDHM=", "pAkrE");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[13]] = lIIIlllllIlIllII("oOTO5By6PPW4EiNkwDnFRT2sWUJdzXg6", "OsbtQ");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[14]] = lIIIlllllIlIllII("dg7Bf+LqWPq3GksadsIq7iloHSSHIVkh", "qEysI");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[15]] = lIIIlllllIlIllII("nWLO2Q0MJ6s=", "UUoJA");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[17]] = lIIIlllllIlIllII("wW0Tq0XVTjefcOmd7wfRYZ7Bhx9LzDo7", "ORpBF");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[18]] = lIIIlllllIlIlIll("YFgrIndn", "GxJVM");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[19]] = lIIIlllllIlIllII("hE5zeSjmwMQ=", "xqayA");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[20]] = lIIIlllllIlIlIll("LB8WLzIcEgcyJlkFHDwnF1FU", "yqsWB");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[21]] = lIIIlllllIlIlIlI("NEZKORtk+cQ=", "WEmrR");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[24]] = lIIIlllllIlIlIll("DyYyCQk/aCcERTYnMAoRP2g9Cgg/ZyUKCS8tcxgAKikhChE1OnMNCihoIB8XMyY0UUU=", "ZHSke");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[25]] = lIIIlllllIlIllII("k5Bmi0sXIXjrWfBVju1PfQ==", "pcYzx");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[26]] = lIIIlllllIlIlIlI("mQMuHzBXcPuKQ3dHLY7U36JwCpbGpRSb", "FKBuF");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[27]] = lIIIlllllIlIlIlI("mybcb3sXwYGO8yyYX+mNH2BUbNP0NG45VCibR1yoGNk=", "kEHRy");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[28]] = lIIIlllllIlIlIll("BQ8OEj8xDw8WN3ASHQYyIgRMESExAgcWJyNBNy5pcA==", "PalsS");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[29]] = lIIIlllllIlIlIlI("3CNbq7KZD60=", "yBgzJ");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[30]] = lIIIlllllIlIlIlI("T05vXX6ydvI=", "REIqX");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[31]] = lIIIlllllIlIllII("c1xWDwb/5mY=", "duqrz");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[32]] = lIIIlllllIlIllII("ENxhCJ/TbI4=", "EaTou");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[33]] = lIIIlllllIlIlIll("AB4vNjgwUDo7dDkfLTUgMFAgNTkwXzg1OCAVbicxJRE8NSA6Am4yOydQPSAmPB4pbnQ=", "UpNTT");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[34]] = lIIIlllllIlIllII("gJ9TNAtG/E0=", "TxueN");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[35]] = lIIIlllllIlIlIll("Nw==", "luqJF");
        JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[36]] = lIIIlllllIlIllII("fpLEWhSaSRxwJJzle1bTuKwzONKOzOiGpRnYauUNvEOC9p9pM9/3aNQ8EB64tJ4HuKdgpPTuFFk=", "ePQPJ");
    }
    
    private static boolean lIIIlllllIlllIll(final int llllllllllllIllIllllIIlIlIlIlllI, final int llllllllllllIllIllllIIlIlIlIllIl) {
        return llllllllllllIllIllllIIlIlIlIlllI == llllllllllllIllIllllIIlIlIlIllIl;
    }
    
    static Any func_150316_a(final String llllllllllllIllIllllIIllIlIIIIIl, String llllllllllllIllIllllIIllIlIIIIII) throws NBTException {
        llllllllllllIllIllllIIllIlIIIIII = (float)((String)llllllllllllIllIllllIIllIlIIIIII).trim();
        if (lIIIlllllIllllII(((String)llllllllllllIllIllllIIllIlIIIIII).startsWith(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[15]]) ? 1 : 0)) {
            llllllllllllIllIllllIIllIlIIIIII = (float)((String)llllllllllllIllIllllIIllIlIIIIII).substring(JsonToNBT.llIIlllIlIllll[1], ((String)llllllllllllIllIllllIIllIlIIIIII).length() - JsonToNBT.llIIlllIlIllll[1]);
            final Compound llllllllllllIllIllllIIllIlIIlIIl = new Compound(llllllllllllIllIllllIIllIlIIIIIl);
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
            while (!lIIIllllllIIIIII(((String)llllllllllllIllIllllIIllIlIIIIII).length())) {
                final String llllllllllllIllIllllIIllIlIIlIII = func_150314_a((String)llllllllllllIllIllllIIllIlIIIIII, (boolean)(JsonToNBT.llIIlllIlIllll[1] != 0));
                if (lIIIlllllIlllllI(llllllllllllIllIllllIIllIlIIlIII.length())) {
                    final boolean llllllllllllIllIllllIIllIlIIIlll = JsonToNBT.llIIlllIlIllll[0] != 0;
                    llllllllllllIllIllllIIllIlIIlIIl.field_150491_b.add(func_179270_a(llllllllllllIllIllllIIllIlIIlIII, llllllllllllIllIllllIIllIlIIIlll));
                    "".length();
                }
                if (lIIIlllllIllllll(((String)llllllllllllIllIllllIIllIlIIIIII).length(), llllllllllllIllIllllIIllIlIIlIII.length() + JsonToNBT.llIIlllIlIllll[1])) {
                    "".length();
                    if (((0x7D ^ 0x63 ^ (0x2A ^ 0x1)) & (227 + 87 - 299 + 226 ^ 177 + 39 - 121 + 101 ^ -" ".length())) > 0) {
                        return null;
                    }
                    break;
                }
                else {
                    final char llllllllllllIllIllllIIllIlIIIllI = ((String)llllllllllllIllIllllIIllIlIIIIII).charAt(llllllllllllIllIllllIIllIlIIlIII.length());
                    if (lIIIlllllIlllIlI(llllllllllllIllIllllIIllIlIIIllI, JsonToNBT.llIIlllIlIllll[16]) && lIIIlllllIlllIlI(llllllllllllIllIllllIIllIlIIIllI, JsonToNBT.llIIlllIlIllll[7]) && lIIIlllllIlllIlI(llllllllllllIllIllllIIllIlIIIllI, JsonToNBT.llIIlllIlIllll[9]) && lIIIlllllIlllIlI(llllllllllllIllIllllIIllIlIIIllI, JsonToNBT.llIIlllIlIllll[8]) && lIIIlllllIlllIlI(llllllllllllIllIllllIIllIlIIIllI, JsonToNBT.llIIlllIlIllll[11])) {
                        throw new NBTException(String.valueOf(new StringBuilder(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[17]]).append(llllllllllllIllIllllIIllIlIIIllI).append(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[18]]).append(((String)llllllllllllIllIllllIIllIlIIIIII).substring(llllllllllllIllIllllIIllIlIIlIII.length()))));
                    }
                    llllllllllllIllIllllIIllIlIIIIII = (float)((String)llllllllllllIllIllllIIllIlIIIIII).substring(llllllllllllIllIllllIIllIlIIlIII.length() + JsonToNBT.llIIlllIlIllll[1]);
                }
            }
            return llllllllllllIllIllllIIllIlIIlIIl;
        }
        else {
            if (!lIIIlllllIllllII(((String)llllllllllllIllIllllIIllIlIIIIII).startsWith(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[19]]) ? 1 : 0) || !lIIIlllllIlllIIl(JsonToNBT.field_179273_b.matcher((CharSequence)llllllllllllIllIllllIIllIlIIIIII).matches() ? 1 : 0)) {
                return new Primitive(llllllllllllIllIllllIIllIlIIIIIl, (String)llllllllllllIllIllllIIllIlIIIIII);
            }
            llllllllllllIllIllllIIllIlIIIIII = (float)((String)llllllllllllIllIllllIIllIlIIIIII).substring(JsonToNBT.llIIlllIlIllll[1], ((String)llllllllllllIllIllllIIllIlIIIIII).length() - JsonToNBT.llIIlllIlIllll[1]);
            final List llllllllllllIllIllllIIllIlIIIlIl = new List(llllllllllllIllIllllIIllIlIIIIIl);
            "".length();
            if ((0x48 ^ 0x57 ^ (0xB6 ^ 0xAD)) <= -" ".length()) {
                return null;
            }
            while (!lIIIllllllIIIIII(((String)llllllllllllIllIllllIIllIlIIIIII).length())) {
                final String llllllllllllIllIllllIIllIlIIIlII = func_150314_a((String)llllllllllllIllIllllIIllIlIIIIII, (boolean)(JsonToNBT.llIIlllIlIllll[0] != 0));
                if (lIIIlllllIlllllI(llllllllllllIllIllllIIllIlIIIlII.length())) {
                    final boolean llllllllllllIllIllllIIllIlIIIIll = JsonToNBT.llIIlllIlIllll[1] != 0;
                    llllllllllllIllIllllIIllIlIIIlIl.field_150492_b.add(func_179270_a(llllllllllllIllIllllIIllIlIIIlII, llllllllllllIllIllllIIllIlIIIIll));
                    "".length();
                }
                if (lIIIlllllIllllll(((String)llllllllllllIllIllllIIllIlIIIIII).length(), llllllllllllIllIllllIIllIlIIIlII.length() + JsonToNBT.llIIlllIlIllll[1])) {
                    "".length();
                    if (((0x69 ^ 0x32) & ~(0xE8 ^ 0xB3)) != 0x0) {
                        return null;
                    }
                    break;
                }
                else {
                    final char llllllllllllIllIllllIIllIlIIIIlI = ((String)llllllllllllIllIllllIIllIlIIIIII).charAt(llllllllllllIllIllllIIllIlIIIlII.length());
                    if (lIIIlllllIlllIlI(llllllllllllIllIllllIIllIlIIIIlI, JsonToNBT.llIIlllIlIllll[16]) && lIIIlllllIlllIlI(llllllllllllIllIllllIIllIlIIIIlI, JsonToNBT.llIIlllIlIllll[7]) && lIIIlllllIlllIlI(llllllllllllIllIllllIIllIlIIIIlI, JsonToNBT.llIIlllIlIllll[9]) && lIIIlllllIlllIlI(llllllllllllIllIllllIIllIlIIIIlI, JsonToNBT.llIIlllIlIllll[8]) && lIIIlllllIlllIlI(llllllllllllIllIllllIIllIlIIIIlI, JsonToNBT.llIIlllIlIllll[11])) {
                        throw new NBTException(String.valueOf(new StringBuilder(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[20]]).append(llllllllllllIllIllllIIllIlIIIIlI).append(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[21]]).append(((String)llllllllllllIllIllllIIllIlIIIIII).substring(llllllllllllIllIllllIIllIlIIIlII.length()))));
                    }
                    llllllllllllIllIllllIIllIlIIIIII = (float)((String)llllllllllllIllIllllIIllIlIIIIII).substring(llllllllllllIllIllllIIllIlIIIlII.length() + JsonToNBT.llIIlllIlIllll[1]);
                }
            }
            return llllllllllllIllIllllIIllIlIIIlIl;
        }
    }
    
    private static boolean lIIIlllllIllllll(final int llllllllllllIllIllllIIlIlIlIIllI, final int llllllllllllIllIllllIIlIlIlIIlIl) {
        return llllllllllllIllIllllIIlIlIlIIllI < llllllllllllIllIllllIIlIlIlIIlIl;
    }
    
    private static boolean func_179271_b(final String llllllllllllIllIllllIIlIlllIIllI, final int llllllllllllIllIllllIIlIlllIIIll) {
        if (lIIIlllllIlllllI(llllllllllllIllIllllIIlIlllIIIll) && lIIIlllllIlllIll(llllllllllllIllIllllIIlIlllIIllI.charAt(llllllllllllIllIllllIIlIlllIIIll - JsonToNBT.llIIlllIlIllll[1]), JsonToNBT.llIIlllIlIllll[37]) && lIIIlllllIlllIIl(func_179271_b(llllllllllllIllIllllIIlIlllIIllI, llllllllllllIllIllllIIlIlllIIIll - JsonToNBT.llIIlllIlIllll[1]) ? 1 : 0)) {
            return JsonToNBT.llIIlllIlIllll[1] != 0;
        }
        return JsonToNBT.llIIlllIlIllll[0] != 0;
    }
    
    private static boolean lIIIlllllIllllII(final int llllllllllllIllIllllIIlIlIIlllll) {
        return llllllllllllIllIllllIIlIlIIlllll != 0;
    }
    
    static int func_150310_b(final String llllllllllllIllIllllIIllIlIllIIl) throws NBTException {
        int llllllllllllIllIllllIIllIlIllllI = JsonToNBT.llIIlllIlIllll[0];
        boolean llllllllllllIllIllllIIllIlIlllIl = JsonToNBT.llIIlllIlIllll[0] != 0;
        final Stack<Character> llllllllllllIllIllllIIllIlIlllII = new Stack<Character>();
        int llllllllllllIllIllllIIllIlIllIll = JsonToNBT.llIIlllIlIllll[0];
        "".length();
        if (((0xE0 ^ 0x82) & ~(0x2D ^ 0x4F)) != 0x0) {
            return (0xD4 ^ 0x92) & ~(0x6B ^ 0x2D);
        }
        while (!lIIIlllllIllllIl(llllllllllllIllIllllIIllIlIllIll, llllllllllllIllIllllIIllIlIllIIl.length())) {
            final char llllllllllllIllIllllIIllIlIllIlI = llllllllllllIllIllllIIllIlIllIIl.charAt(llllllllllllIllIllllIIllIlIllIll);
            if (lIIIlllllIlllIll(llllllllllllIllIllllIIllIlIllIlI, JsonToNBT.llIIlllIlIllll[5])) {
                if (lIIIlllllIllllII(func_179271_b(llllllllllllIllIllllIIllIlIllIIl, llllllllllllIllIllllIIllIlIllIll) ? 1 : 0)) {
                    if (lIIIlllllIlllIIl(llllllllllllIllIllllIIllIlIlllIl ? 1 : 0)) {
                        throw new NBTException(String.valueOf(new StringBuilder(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[6]]).append(llllllllllllIllIllllIIllIlIllIIl)));
                    }
                }
                else {
                    int n;
                    if (lIIIlllllIllllII(llllllllllllIllIllllIIllIlIlllIl ? 1 : 0)) {
                        n = JsonToNBT.llIIlllIlIllll[0];
                        "".length();
                        if ((0x6E ^ 0x6A) == 0x0) {
                            return (0x44 ^ 0x5A) & ~(0x27 ^ 0x39);
                        }
                    }
                    else {
                        n = JsonToNBT.llIIlllIlIllll[1];
                    }
                    llllllllllllIllIllllIIllIlIlllIl = (n != 0);
                    "".length();
                    if ("  ".length() == 0) {
                        return (86 + 34 - 87 + 100 ^ 47 + 2 + 50 + 60) & (0xC5 ^ 0x81 ^ (0x4B ^ 0x15) ^ -" ".length());
                    }
                }
            }
            else if (lIIIlllllIlllIIl(llllllllllllIllIllllIIllIlIlllIl ? 1 : 0)) {
                if (lIIIlllllIlllIlI(llllllllllllIllIllllIIllIlIllIlI, JsonToNBT.llIIlllIlIllll[7]) && lIIIlllllIlllIlI(llllllllllllIllIllllIIllIlIllIlI, JsonToNBT.llIIlllIlIllll[8])) {
                    if (lIIIlllllIlllIll(llllllllllllIllIllllIIllIlIllIlI, JsonToNBT.llIIlllIlIllll[9]) && (!lIIIlllllIlllIIl(llllllllllllIllIllllIIllIlIlllII.isEmpty() ? 1 : 0) || lIIIlllllIlllIlI(llllllllllllIllIllllIIllIlIlllII.pop(), JsonToNBT.llIIlllIlIllll[7]))) {
                        throw new NBTException(String.valueOf(new StringBuilder(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[10]]).append(llllllllllllIllIllllIIllIlIllIIl)));
                    }
                    if (lIIIlllllIlllIll(llllllllllllIllIllllIIllIlIllIlI, JsonToNBT.llIIlllIlIllll[11]) && (!lIIIlllllIlllIIl(llllllllllllIllIllllIIllIlIlllII.isEmpty() ? 1 : 0) || lIIIlllllIlllIlI(llllllllllllIllIllllIIllIlIlllII.pop(), JsonToNBT.llIIlllIlIllll[8]))) {
                        throw new NBTException(String.valueOf(new StringBuilder(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[12]]).append(llllllllllllIllIllllIIllIlIllIIl)));
                    }
                }
                else {
                    if (lIIIlllllIllllII(llllllllllllIllIllllIIllIlIlllII.isEmpty() ? 1 : 0)) {
                        ++llllllllllllIllIllllIIllIlIllllI;
                    }
                    llllllllllllIllIllllIIllIlIlllII.push(llllllllllllIllIllllIIllIlIllIlI);
                    "".length();
                }
            }
            ++llllllllllllIllIllllIIllIlIllIll;
        }
        if (lIIIlllllIllllII(llllllllllllIllIllllIIllIlIlllIl ? 1 : 0)) {
            throw new NBTException(String.valueOf(new StringBuilder(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[13]]).append(llllllllllllIllIllllIIllIlIllIIl)));
        }
        if (lIIIlllllIlllIIl(llllllllllllIllIllllIIllIlIlllII.isEmpty() ? 1 : 0)) {
            throw new NBTException(String.valueOf(new StringBuilder(JsonToNBT.llIIlllIlIllIl[JsonToNBT.llIIlllIlIllll[14]]).append(llllllllllllIllIllllIIllIlIllIIl)));
        }
        if (lIIIlllllIlllIIl(llllllllllllIllIllllIIllIlIllllI) && lIIIlllllIlllIIl(llllllllllllIllIllllIIllIlIllIIl.isEmpty() ? 1 : 0)) {
            llllllllllllIllIllllIIllIlIllllI = JsonToNBT.llIIlllIlIllll[1];
        }
        return llllllllllllIllIllllIIllIlIllllI;
    }
    
    static Any func_179272_a(final String... llllllllllllIllIllllIIllIlIlIIlI) throws NBTException {
        return func_150316_a(llllllllllllIllIllllIIllIlIlIIlI[JsonToNBT.llIIlllIlIllll[0]], llllllllllllIllIllllIIllIlIlIIlI[JsonToNBT.llIIlllIlIllll[1]]);
    }
    
    private static void lIIIlllllIlllIII() {
        (llIIlllIlIllll = new int[39])[0] = ((78 + 123 - 173 + 161 ^ 14 + 89 - 80 + 125) & (123 + 64 - 162 + 119 ^ 177 + 92 - 117 + 33 ^ -" ".length()));
        JsonToNBT.llIIlllIlIllll[1] = " ".length();
        JsonToNBT.llIIlllIlIllll[2] = "  ".length();
        JsonToNBT.llIIlllIlIllll[3] = "   ".length();
        JsonToNBT.llIIlllIlIllll[4] = (0x4F ^ 0x54 ^ (0x82 ^ 0x9D));
        JsonToNBT.llIIlllIlIllll[5] = (151 + 44 - 53 + 29 ^ 110 + 79 - 115 + 63);
        JsonToNBT.llIIlllIlIllll[6] = (0xB4 ^ 0x8D ^ (0xE ^ 0x32));
        JsonToNBT.llIIlllIlIllll[7] = (0x79 ^ 0x6A ^ (0xDC ^ 0xB4));
        JsonToNBT.llIIlllIlIllll[8] = (0x5 ^ 0xA ^ (0x45 ^ 0x11));
        JsonToNBT.llIIlllIlIllll[9] = (0xEC ^ 0x91);
        JsonToNBT.llIIlllIlIllll[10] = (0x8A ^ 0x8C);
        JsonToNBT.llIIlllIlIllll[11] = (0x64 ^ 0x34 ^ (0x95 ^ 0x98));
        JsonToNBT.llIIlllIlIllll[12] = (0xD0 ^ 0xB6 ^ (0x73 ^ 0x12));
        JsonToNBT.llIIlllIlIllll[13] = (0xD0 ^ 0xA9 ^ (0x52 ^ 0x23));
        JsonToNBT.llIIlllIlIllll[14] = (0x79 ^ 0x70);
        JsonToNBT.llIIlllIlIllll[15] = (0x4 ^ 0x68 ^ (0xDE ^ 0xB8));
        JsonToNBT.llIIlllIlIllll[16] = (0x8F ^ 0xA3);
        JsonToNBT.llIIlllIlIllll[17] = (0xA0 ^ 0xAB);
        JsonToNBT.llIIlllIlIllll[18] = (0x2D ^ 0x4C ^ (0x67 ^ 0xA));
        JsonToNBT.llIIlllIlIllll[19] = (0xBB ^ 0xB6);
        JsonToNBT.llIIlllIlIllll[20] = (0x51 ^ 0x5F);
        JsonToNBT.llIIlllIlIllll[21] = (0xCA ^ 0xC5);
        JsonToNBT.llIIlllIlIllll[22] = (0x9A ^ 0xA0);
        JsonToNBT.llIIlllIlIllll[23] = -" ".length();
        JsonToNBT.llIIlllIlIllll[24] = (0xEC ^ 0x83 ^ 114 + 34 - 120 + 99);
        JsonToNBT.llIIlllIlIllll[25] = (0xE9 ^ 0xA8 ^ (0xD3 ^ 0x83));
        JsonToNBT.llIIlllIlIllll[26] = (175 + 65 - 88 + 36 ^ 7 + 130 - 68 + 105);
        JsonToNBT.llIIlllIlIllll[27] = (0x1D ^ 0xE);
        JsonToNBT.llIIlllIlIllll[28] = (0xD7 ^ 0x90 ^ (0x53 ^ 0x0));
        JsonToNBT.llIIlllIlIllll[29] = (0x9B ^ 0x8E);
        JsonToNBT.llIIlllIlIllll[30] = (0x7A ^ 0x14 ^ (0x21 ^ 0x59));
        JsonToNBT.llIIlllIlIllll[31] = (0x28 ^ 0x3F);
        JsonToNBT.llIIlllIlIllll[32] = (18 + 124 - 73 + 92 ^ 173 + 49 - 151 + 114);
        JsonToNBT.llIIlllIlIllll[33] = (0x10 ^ 0x59 ^ (0x6 ^ 0x56));
        JsonToNBT.llIIlllIlIllll[34] = (" ".length() ^ (0xDA ^ 0xC1));
        JsonToNBT.llIIlllIlIllll[35] = (0xDA ^ 0xB5 ^ (0xD3 ^ 0xA7));
        JsonToNBT.llIIlllIlIllll[36] = (0x71 ^ 0x15 ^ (0xC ^ 0x74));
        JsonToNBT.llIIlllIlIllll[37] = (0x7C ^ 0x20);
        JsonToNBT.llIIlllIlIllll[38] = (85 + 39 - 25 + 39 ^ 123 + 110 - 127 + 45);
    }
    
    abstract static class Any
    {
        protected /* synthetic */ String json;
        
        public abstract NBTBase parse() throws NBTException;
    }
    
    static class Primitive extends Any
    {
        protected /* synthetic */ String jsonValue;
        private static final /* synthetic */ Pattern SHORT;
        private static final /* synthetic */ Pattern DOUBLE_UNTYPED;
        private static final /* synthetic */ Pattern FLOAT;
        private static final /* synthetic */ Pattern BYTE;
        private static final /* synthetic */ Splitter SPLITTER;
        private static final /* synthetic */ Pattern LONG;
        private static final /* synthetic */ String[] lIllIlllIIIIII;
        private static final /* synthetic */ int[] lIllIlllIIIlII;
        private static final /* synthetic */ Pattern INTEGER;
        private static final /* synthetic */ Pattern DOUBLE;
        
        private static boolean lIIIIIIIIIIIIlII(final int llllllllllllIllllllIlIlIIIIllIlI, final int llllllllllllIllllllIlIlIIIIllIIl) {
            return llllllllllllIllllllIlIlIIIIllIlI == llllllllllllIllllllIlIlIIIIllIIl;
        }
        
        private static String lllllllllllIlIl(final String llllllllllllIllllllIlIlIIlIIIlll, final String llllllllllllIllllllIlIlIIlIIIllI) {
            try {
                final SecretKeySpec llllllllllllIllllllIlIlIIlIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIlIlIIlIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllllllIlIlIIlIIlIIl = Cipher.getInstance("Blowfish");
                llllllllllllIllllllIlIlIIlIIlIIl.init(Primitive.lIllIlllIIIlII[2], llllllllllllIllllllIlIlIIlIIlIlI);
                return new String(llllllllllllIllllllIlIlIIlIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIlIlIIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllllIlIlIIlIIlIII) {
                llllllllllllIllllllIlIlIIlIIlIII.printStackTrace();
                return null;
            }
        }
        
        @Override
        public NBTBase parse() throws NBTException {
            try {
                if (lIIIIIIIIIIIIIII(Primitive.DOUBLE.matcher(this.jsonValue).matches() ? 1 : 0)) {
                    return new NBTTagDouble(Double.parseDouble(this.jsonValue.substring(Primitive.lIllIlllIIIlII[0], this.jsonValue.length() - Primitive.lIllIlllIIIlII[1])));
                }
                if (lIIIIIIIIIIIIIII(Primitive.FLOAT.matcher(this.jsonValue).matches() ? 1 : 0)) {
                    return new NBTTagFloat(Float.parseFloat(this.jsonValue.substring(Primitive.lIllIlllIIIlII[0], this.jsonValue.length() - Primitive.lIllIlllIIIlII[1])));
                }
                if (lIIIIIIIIIIIIIII(Primitive.BYTE.matcher(this.jsonValue).matches() ? 1 : 0)) {
                    return new NBTTagByte(Byte.parseByte(this.jsonValue.substring(Primitive.lIllIlllIIIlII[0], this.jsonValue.length() - Primitive.lIllIlllIIIlII[1])));
                }
                if (lIIIIIIIIIIIIIII(Primitive.LONG.matcher(this.jsonValue).matches() ? 1 : 0)) {
                    return new NBTTagLong(Long.parseLong(this.jsonValue.substring(Primitive.lIllIlllIIIlII[0], this.jsonValue.length() - Primitive.lIllIlllIIIlII[1])));
                }
                if (lIIIIIIIIIIIIIII(Primitive.SHORT.matcher(this.jsonValue).matches() ? 1 : 0)) {
                    return new NBTTagShort(Short.parseShort(this.jsonValue.substring(Primitive.lIllIlllIIIlII[0], this.jsonValue.length() - Primitive.lIllIlllIIIlII[1])));
                }
                if (lIIIIIIIIIIIIIII(Primitive.INTEGER.matcher(this.jsonValue).matches() ? 1 : 0)) {
                    return new NBTTagInt(Integer.parseInt(this.jsonValue));
                }
                if (lIIIIIIIIIIIIIII(Primitive.DOUBLE_UNTYPED.matcher(this.jsonValue).matches() ? 1 : 0)) {
                    return new NBTTagDouble(Double.parseDouble(this.jsonValue));
                }
                if (!lIIIIIIIIIIIIIIl(this.jsonValue.equalsIgnoreCase(Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[8]]) ? 1 : 0) || lIIIIIIIIIIIIIII(this.jsonValue.equalsIgnoreCase(Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[9]]) ? 1 : 0)) {
                    int n;
                    if (lIIIIIIIIIIIIIII(Boolean.parseBoolean(this.jsonValue) ? 1 : 0)) {
                        n = Primitive.lIllIlllIIIlII[1];
                        "".length();
                        if ("   ".length() < 0) {
                            return null;
                        }
                    }
                    else {
                        n = Primitive.lIllIlllIIIlII[0];
                    }
                    return new NBTTagByte((byte)n);
                }
            }
            catch (NumberFormatException llllllllllllIllllllIlIlIIlIllIll) {
                this.jsonValue = this.jsonValue.replaceAll(Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[10]], Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[11]]);
                return new NBTTagString(this.jsonValue);
            }
            if (lIIIIIIIIIIIIIII(this.jsonValue.startsWith(Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[12]]) ? 1 : 0) && lIIIIIIIIIIIIIII(this.jsonValue.endsWith(Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[13]]) ? 1 : 0)) {
                final String llllllllllllIllllllIlIlIIlIllIlI = this.jsonValue.substring(Primitive.lIllIlllIIIlII[1], this.jsonValue.length() - Primitive.lIllIlllIIIlII[1]);
                final String[] llllllllllllIllllllIlIlIIlIllIIl = (String[])Iterables.toArray(Primitive.SPLITTER.split((CharSequence)llllllllllllIllllllIlIlIIlIllIlI), (Class)String.class);
                try {
                    final int[] llllllllllllIllllllIlIlIIlIllIII = new int[llllllllllllIllllllIlIlIIlIllIIl.length];
                    int llllllllllllIllllllIlIlIIlIlIlll = Primitive.lIllIlllIIIlII[0];
                    "".length();
                    if ("  ".length() == ((0xA ^ 0x54) & ~(0x2C ^ 0x72))) {
                        return null;
                    }
                    while (!lIIIIIIIIIIIIIlI(llllllllllllIllllllIlIlIIlIlIlll, llllllllllllIllllllIlIlIIlIllIIl.length)) {
                        llllllllllllIllllllIlIlIIlIllIII[llllllllllllIllllllIlIlIIlIlIlll] = Integer.parseInt(llllllllllllIllllllIlIlIIlIllIIl[llllllllllllIllllllIlIlIIlIlIlll].trim());
                        ++llllllllllllIllllllIlIlIIlIlIlll;
                    }
                    return new NBTTagIntArray(llllllllllllIllllllIlIlIIlIllIII);
                }
                catch (NumberFormatException llllllllllllIllllllIlIlIIlIlIllI) {
                    return new NBTTagString(this.jsonValue);
                }
            }
            if (lIIIIIIIIIIIIIII(this.jsonValue.startsWith(Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[14]]) ? 1 : 0) && lIIIIIIIIIIIIIII(this.jsonValue.endsWith(Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[15]]) ? 1 : 0)) {
                this.jsonValue = this.jsonValue.substring(Primitive.lIllIlllIIIlII[1], this.jsonValue.length() - Primitive.lIllIlllIIIlII[1]);
            }
            this.jsonValue = this.jsonValue.replaceAll(Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[16]], Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[17]]);
            final StringBuilder llllllllllllIllllllIlIlIIlIlIlIl = new StringBuilder();
            int llllllllllllIllllllIlIlIIlIlIlII = Primitive.lIllIlllIIIlII[0];
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
            while (!lIIIIIIIIIIIIIlI(llllllllllllIllllllIlIlIIlIlIlII, this.jsonValue.length())) {
                if (lIIIIIIIIIIIIIll(llllllllllllIllllllIlIlIIlIlIlII, this.jsonValue.length() - Primitive.lIllIlllIIIlII[1]) && lIIIIIIIIIIIIlII(this.jsonValue.charAt(llllllllllllIllllllIlIlIIlIlIlII), Primitive.lIllIlllIIIlII[18]) && lIIIIIIIIIIIIlII(this.jsonValue.charAt(llllllllllllIllllllIlIlIIlIlIlII + Primitive.lIllIlllIIIlII[1]), Primitive.lIllIlllIIIlII[18])) {
                    llllllllllllIllllllIlIlIIlIlIlIl.append((char)Primitive.lIllIlllIIIlII[18]);
                    "".length();
                    ++llllllllllllIllllllIlIlIIlIlIlII;
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                else {
                    llllllllllllIllllllIlIlIIlIlIlIl.append(this.jsonValue.charAt(llllllllllllIllllllIlIlIIlIlIlII));
                    "".length();
                }
                ++llllllllllllIllllllIlIlIIlIlIlII;
            }
            return new NBTTagString(String.valueOf(llllllllllllIllllllIlIlIIlIlIlIl));
        }
        
        public Primitive(final String llllllllllllIllllllIlIlIIllIIIll, final String llllllllllllIllllllIlIlIIllIIIlI) {
            this.json = llllllllllllIllllllIlIlIIllIIIll;
            this.jsonValue = llllllllllllIllllllIlIlIIllIIIlI;
        }
        
        private static void llllllllllllIlI() {
            (lIllIlllIIIIII = new String[Primitive.lIllIlllIIIlII[19]])[Primitive.lIllIlllIIIlII[0]] = lllllllllllIIll("OGpBLXM4d0dJEUkbRE8XU2pTLWc4IxY0EQ==", "cGjpL");
            Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[1]] = lllllllllllIlII("bSkkOJE2p/jJ1Ek0l4dBIfIfV1SIvUlXL4e9ZZ0DH2k=", "LsKsB");
            Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[2]] = lllllllllllIlII("hOqpWyKE3rUGI/Vp+6ljfeHtE6lBPewQ", "OlqLM");
            Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[3]] = lllllllllllIlIl("BQfyyOEYpNOciWmDJT515x3PV2bRKD2S", "rJFzv");
            Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[4]] = lllllllllllIlII("4/Cdy/7u8h76dC0nIh81bL89ZkXVUeic", "xdfWA");
            Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[5]] = lllllllllllIlIl("HuA2SFqjTqOXNDqacvJ2rg==", "hJeyT");
            Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[6]] = lllllllllllIIll("PX5SFnw9Y1RyHkwPV3QYVn5AFmg=", "fSyKC");
            Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[8]] = lllllllllllIlII("ZMyiXE+HTvA=", "OyzEy");
            Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[9]] = lllllllllllIlIl("rNpjx7w4VJ0=", "upOKU");
            Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[10]] = lllllllllllIlIl("w+w+R/+xqWM=", "FJeKt");
            Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[11]] = lllllllllllIlIl("ro5jsxnkL5c=", "KntTk");
            Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[12]] = lllllllllllIIll("EQ==", "JNtui");
            Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[13]] = lllllllllllIIll("Lg==", "sISCS");
            Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[14]] = lllllllllllIIll("Ww==", "ymHkP");
            Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[15]] = lllllllllllIlII("owpLebLFlu8=", "JEpZO");
            Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[16]] = lllllllllllIlII("Sw/O5IUmZUI=", "ptDSm");
            Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[17]] = lllllllllllIIll("bw==", "MgoaM");
        }
        
        private static String lllllllllllIIll(String llllllllllllIllllllIlIlIIIlIIlIl, final String llllllllllllIllllllIlIlIIIlIlIIl) {
            llllllllllllIllllllIlIlIIIlIIlIl = new String(Base64.getDecoder().decode(llllllllllllIllllllIlIlIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllllllIlIlIIIlIlIII = new StringBuilder();
            final char[] llllllllllllIllllllIlIlIIIlIIlll = llllllllllllIllllllIlIlIIIlIlIIl.toCharArray();
            int llllllllllllIllllllIlIlIIIlIIllI = Primitive.lIllIlllIIIlII[0];
            final Exception llllllllllllIllllllIlIlIIIlIIIII = (Object)llllllllllllIllllllIlIlIIIlIIlIl.toCharArray();
            final int llllllllllllIllllllIlIlIIIIlllll = llllllllllllIllllllIlIlIIIlIIIII.length;
            boolean llllllllllllIllllllIlIlIIIIllllI = Primitive.lIllIlllIIIlII[0] != 0;
            while (lIIIIIIIIIIIIIll(llllllllllllIllllllIlIlIIIIllllI ? 1 : 0, llllllllllllIllllllIlIlIIIIlllll)) {
                final char llllllllllllIllllllIlIlIIIlIlIll = llllllllllllIllllllIlIlIIIlIIIII[llllllllllllIllllllIlIlIIIIllllI];
                llllllllllllIllllllIlIlIIIlIlIII.append((char)(llllllllllllIllllllIlIlIIIlIlIll ^ llllllllllllIllllllIlIlIIIlIIlll[llllllllllllIllllllIlIlIIIlIIllI % llllllllllllIllllllIlIlIIIlIIlll.length]));
                "".length();
                ++llllllllllllIllllllIlIlIIIlIIllI;
                ++llllllllllllIllllllIlIlIIIIllllI;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllllllIlIlIIIlIlIII);
        }
        
        private static boolean lIIIIIIIIIIIIIll(final int llllllllllllIllllllIlIlIIIIlIIlI, final int llllllllllllIllllllIlIlIIIIlIIIl) {
            return llllllllllllIllllllIlIlIIIIlIIlI < llllllllllllIllllllIlIlIIIIlIIIl;
        }
        
        private static boolean lIIIIIIIIIIIIIIl(final int llllllllllllIllllllIlIlIIIIIllIl) {
            return llllllllllllIllllllIlIlIIIIIllIl == 0;
        }
        
        private static void lllllllllllllll() {
            (lIllIlllIIIlII = new int[20])[0] = ((141 + 2 - 112 + 115 ^ 78 + 15 + 71 + 16) & (0x0 ^ 0x2C ^ (0xAE ^ 0xA4) ^ -" ".length()));
            Primitive.lIllIlllIIIlII[1] = " ".length();
            Primitive.lIllIlllIIIlII[2] = "  ".length();
            Primitive.lIllIlllIIIlII[3] = "   ".length();
            Primitive.lIllIlllIIIlII[4] = (0xA6 ^ 0xA2);
            Primitive.lIllIlllIIIlII[5] = (0x48 ^ 0x57 ^ (0x5E ^ 0x44));
            Primitive.lIllIlllIIIlII[6] = (190 + 85 - 134 + 56 ^ 8 + 33 + 13 + 141);
            Primitive.lIllIlllIIIlII[7] = (0xE5 ^ 0x9D ^ (0x1A ^ 0x4E));
            Primitive.lIllIlllIIIlII[8] = (0xBE ^ 0xB9);
            Primitive.lIllIlllIIIlII[9] = (0x55 ^ 0x5D);
            Primitive.lIllIlllIIIlII[10] = (0xB3 ^ 0xBA);
            Primitive.lIllIlllIIIlII[11] = (0x16 ^ 0x1C);
            Primitive.lIllIlllIIIlII[12] = (0x66 ^ 0x6D);
            Primitive.lIllIlllIIIlII[13] = (0x74 ^ 0x5D ^ (0x39 ^ 0x1C));
            Primitive.lIllIlllIIIlII[14] = (0xBF ^ 0x92 ^ (0x1A ^ 0x3A));
            Primitive.lIllIlllIIIlII[15] = (0xBA ^ 0xC4 ^ (0x3A ^ 0x4A));
            Primitive.lIllIlllIIIlII[16] = (146 + 27 - 77 + 76 ^ 157 + 86 - 216 + 136);
            Primitive.lIllIlllIIIlII[17] = (0x86 ^ 0x96);
            Primitive.lIllIlllIIIlII[18] = (0xD1 ^ 0x8D);
            Primitive.lIllIlllIIIlII[19] = (65 + 10 + 7 + 68 ^ 94 + 18 - 82 + 105);
        }
        
        private static String lllllllllllIlII(final String llllllllllllIllllllIlIlIIIlllIII, final String llllllllllllIllllllIlIlIIIlllIIl) {
            try {
                final SecretKeySpec llllllllllllIllllllIlIlIIIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIlIlIIIlllIIl.getBytes(StandardCharsets.UTF_8)), Primitive.lIllIlllIIIlII[9]), "DES");
                final Cipher llllllllllllIllllllIlIlIIIllllII = Cipher.getInstance("DES");
                llllllllllllIllllllIlIlIIIllllII.init(Primitive.lIllIlllIIIlII[2], llllllllllllIllllllIlIlIIIllllIl);
                return new String(llllllllllllIllllllIlIlIIIllllII.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIlIlIIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllllIlIlIIIlllIll) {
                llllllllllllIllllllIlIlIIIlllIll.printStackTrace();
                return null;
            }
        }
        
        static {
            lllllllllllllll();
            llllllllllllIlI();
            DOUBLE = Pattern.compile(Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[0]]);
            FLOAT = Pattern.compile(Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[1]]);
            BYTE = Pattern.compile(Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[2]]);
            LONG = Pattern.compile(Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[3]]);
            SHORT = Pattern.compile(Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[4]]);
            INTEGER = Pattern.compile(Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[5]]);
            DOUBLE_UNTYPED = Pattern.compile(Primitive.lIllIlllIIIIII[Primitive.lIllIlllIIIlII[6]]);
            SPLITTER = Splitter.on((char)Primitive.lIllIlllIIIlII[7]).omitEmptyStrings();
        }
        
        private static boolean lIIIIIIIIIIIIIlI(final int llllllllllllIllllllIlIlIIIIlIllI, final int llllllllllllIllllllIlIlIIIIlIlIl) {
            return llllllllllllIllllllIlIlIIIIlIllI >= llllllllllllIllllllIlIlIIIIlIlIl;
        }
        
        private static boolean lIIIIIIIIIIIIIII(final int llllllllllllIllllllIlIlIIIIIllll) {
            return llllllllllllIllllllIlIlIIIIIllll != 0;
        }
    }
    
    static class List extends Any
    {
        protected /* synthetic */ java.util.List<Any> field_150492_b;
        
        public List(final String lllllllllllllIIIllIllIlIllIIIIIl) {
            this.field_150492_b = (java.util.List<Any>)Lists.newArrayList();
            this.json = lllllllllllllIIIllIllIlIllIIIIIl;
        }
        
        @Override
        public NBTBase parse() throws NBTException {
            final NBTTagList lllllllllllllIIIllIllIlIlIllIlIl = new NBTTagList();
            final boolean lllllllllllllIIIllIllIlIlIllIIII = (boolean)this.field_150492_b.iterator();
            "".length();
            if (null != null) {
                return null;
            }
            while (!lllIIllIIIllIII(((Iterator)lllllllllllllIIIllIllIlIlIllIIII).hasNext() ? 1 : 0)) {
                final Any lllllllllllllIIIllIllIlIlIllIlII = ((Iterator<Any>)lllllllllllllIIIllIllIlIlIllIIII).next();
                lllllllllllllIIIllIllIlIlIllIlIl.appendTag(lllllllllllllIIIllIllIlIlIllIlII.parse());
            }
            return lllllllllllllIIIllIllIlIlIllIlIl;
        }
        
        private static boolean lllIIllIIIllIII(final int lllllllllllllIIIllIllIlIlIlIlllI) {
            return lllllllllllllIIIllIllIlIlIlIlllI == 0;
        }
    }
    
    static class Compound extends Any
    {
        protected /* synthetic */ java.util.List<Any> field_150491_b;
        
        private static boolean lIIllIIIIIlIllIl(final int llllllllllllIllIIllIIllIIIlIIlIl) {
            return llllllllllllIllIIllIIllIIIlIIlIl == 0;
        }
        
        @Override
        public NBTBase parse() throws NBTException {
            final NBTTagCompound llllllllllllIllIIllIIllIIIlIllII = new NBTTagCompound();
            final int llllllllllllIllIIllIIllIIIlIIlll = (int)this.field_150491_b.iterator();
            "".length();
            if (" ".length() >= (0x4 ^ 0x0)) {
                return null;
            }
            while (!lIIllIIIIIlIllIl(((Iterator)llllllllllllIllIIllIIllIIIlIIlll).hasNext() ? 1 : 0)) {
                final Any llllllllllllIllIIllIIllIIIlIlIll = ((Iterator<Any>)llllllllllllIllIIllIIllIIIlIIlll).next();
                llllllllllllIllIIllIIllIIIlIllII.setTag(llllllllllllIllIIllIIllIIIlIlIll.json, llllllllllllIllIIllIIllIIIlIlIll.parse());
            }
            return llllllllllllIllIIllIIllIIIlIllII;
        }
        
        public Compound(final String llllllllllllIllIIllIIllIIIllIIlI) {
            this.field_150491_b = (java.util.List<Any>)Lists.newArrayList();
            this.json = llllllllllllIllIIllIIllIIIllIIlI;
        }
    }
}
