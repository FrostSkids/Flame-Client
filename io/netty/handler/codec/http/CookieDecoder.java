// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.util.internal.StringUtil;
import java.text.ParseException;
import java.util.TreeSet;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;

public final class CookieDecoder
{
    private static final /* synthetic */ String[] lIIIlIIllIIlIl;
    private static final /* synthetic */ int[] lIIIlIIllIllIl;
    
    private static boolean lIllllllIllllll(final int lllllllllllllIlIIIlIlIIIIllIIlII) {
        return lllllllllllllIlIIIlIlIIIIllIIlII != 0;
    }
    
    private static int lIllllllIlllllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static void extractKeyValuePairs(final String lllllllllllllIlIIIlIlIIIlIllllIl, final List<String> lllllllllllllIlIIIlIlIIIlIllllII, final List<String> lllllllllllllIlIIIlIlIIIlIlllIll) {
        final int lllllllllllllIlIIIlIlIIIlIlllIlI = lllllllllllllIlIIIlIlIIIlIllllIl.length();
        int lllllllllllllIlIIIlIlIIIlIlllllI = CookieDecoder.lIIIlIIllIllIl[1];
    Label_0012:
        while (true) {
            while (!lIlllllllIIIlIl(lllllllllllllIlIIIlIlIIIlIlllllI, lllllllllllllIlIIIlIlIIIlIlllIlI)) {
                switch (lllllllllllllIlIIIlIlIIIlIllllIl.charAt(lllllllllllllIlIIIlIlIIIlIlllllI)) {
                    case '\t':
                    case '\n':
                    case '\u000b':
                    case '\f':
                    case '\r':
                    case ' ':
                    case ',':
                    case ';': {
                        ++lllllllllllllIlIIIlIlIIIlIlllllI;
                        "".length();
                        if (-"  ".length() >= 0) {
                            return;
                        }
                        continue;
                    }
                    default: {
                        "".length();
                        if (" ".length() > "  ".length()) {
                            return;
                        }
                        while (!lIlllllllIIIlIl(lllllllllllllIlIIIlIlIIIlIlllllI, lllllllllllllIlIIIlIlIIIlIlllIlI)) {
                            if (lIlllllllIIIlIl(lllllllllllllIlIIIlIlIIIlIllllIl.charAt(lllllllllllllIlIIIlIlIIIlIlllllI), CookieDecoder.lIIIlIIllIllIl[14])) {
                                ++lllllllllllllIlIIIlIlIIIlIlllllI;
                                "".length();
                                if (((110 + 184 - 255 + 212 ^ 70 + 114 - 115 + 92) & (199 + 87 - 177 + 124 ^ 14 + 43 + 50 + 72 ^ -" ".length())) >= (16 + 122 - 17 + 24 ^ 39 + 44 + 39 + 27)) {
                                    return;
                                }
                                continue;
                            }
                            else {
                                String lllllllllllllIlIIIlIlIIIllIIIIII = null;
                                String lllllllllllllIlIIIlIlIIIlIllllll = null;
                                Label_1057: {
                                    if (lIlllllllIIIlIl(lllllllllllllIlIIIlIlIIIlIlllllI, lllllllllllllIlIIIlIlIIIlIlllIlI)) {
                                        final String lllllllllllllIlIIIlIlIIIllIIllIl = null;
                                        final String lllllllllllllIlIIIlIlIIIllIIllII = null;
                                        "".length();
                                        if ("   ".length() != "   ".length()) {
                                            return;
                                        }
                                    }
                                    else {
                                        final int lllllllllllllIlIIIlIlIIIllIIIIIl = lllllllllllllIlIIIlIlIIIlIlllllI;
                                        do {
                                            switch (lllllllllllllIlIIIlIlIIIlIllllIl.charAt(lllllllllllllIlIIIlIlIIIlIlllllI)) {
                                                case ';': {
                                                    lllllllllllllIlIIIlIlIIIllIIIIII = lllllllllllllIlIIIlIlIIIlIllllIl.substring(lllllllllllllIlIIIlIlIIIllIIIIIl, lllllllllllllIlIIIlIlIIIlIlllllI);
                                                    final String lllllllllllllIlIIIlIlIIIllIIlIll = null;
                                                    "".length();
                                                    if ((100 + 96 - 42 + 40 ^ 105 + 167 - 206 + 133) <= 0) {
                                                        return;
                                                    }
                                                    break Label_1057;
                                                }
                                                case '=': {
                                                    lllllllllllllIlIIIlIlIIIllIIIIII = lllllllllllllIlIIIlIlIIIlIllllIl.substring(lllllllllllllIlIIIlIlIIIllIIIIIl, lllllllllllllIlIIIlIlIIIlIlllllI);
                                                    if (lIlllllllIIIlIl(++lllllllllllllIlIIIlIlIIIlIlllllI, lllllllllllllIlIIIlIlIIIlIlllIlI)) {
                                                        final String lllllllllllllIlIIIlIlIIIllIIlIll = CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[15]];
                                                        "".length();
                                                        if ((0x5C ^ 0x58) > (0x68 ^ 0x6C)) {
                                                            return;
                                                        }
                                                        break Label_1057;
                                                    }
                                                    else {
                                                        final int lllllllllllllIlIIIlIlIIIllIIIIll = lllllllllllllIlIIIlIlIIIlIlllllI;
                                                        char lllllllllllllIlIIIlIlIIIllIIIIlI = lllllllllllllIlIIIlIlIIIlIllllIl.charAt(lllllllllllllIlIIIlIlIIIlIlllllI);
                                                        if (!lIlllllllIIIllI(lllllllllllllIlIIIlIlIIIllIIIIlI, CookieDecoder.lIIIlIIllIllIl[16]) || lIlllllllIIIlIl(lllllllllllllIlIIIlIlIIIllIIIIlI, CookieDecoder.lIIIlIIllIllIl[17])) {
                                                            final StringBuilder lllllllllllllIlIIIlIlIIIllIIlIII = new StringBuilder(lllllllllllllIlIIIlIlIIIlIllllIl.length() - lllllllllllllIlIIIlIlIIIlIlllllI);
                                                            final char lllllllllllllIlIIIlIlIIIllIIIlll = lllllllllllllIlIIIlIlIIIllIIIIlI;
                                                            boolean lllllllllllllIlIIIlIlIIIllIIIllI = CookieDecoder.lIIIlIIllIllIl[1] != 0;
                                                            ++lllllllllllllIlIIIlIlIIIlIlllllI;
                                                            while (!lIlllllllIIIlIl(lllllllllllllIlIIIlIlIIIlIlllllI, lllllllllllllIlIIIlIlIIIlIlllIlI)) {
                                                                if (lIllllllIllllll(lllllllllllllIlIIIlIlIIIllIIIllI ? 1 : 0)) {
                                                                    lllllllllllllIlIIIlIlIIIllIIIllI = (CookieDecoder.lIIIlIIllIllIl[1] != 0);
                                                                    lllllllllllllIlIIIlIlIIIllIIIIlI = lllllllllllllIlIIIlIlIIIlIllllIl.charAt(lllllllllllllIlIIIlIlIIIlIlllllI++);
                                                                    switch (lllllllllllllIlIIIlIlIIIllIIIIlI) {
                                                                        case '\"':
                                                                        case '\'':
                                                                        case '\\': {
                                                                            lllllllllllllIlIIIlIlIIIllIIlIII.setCharAt(lllllllllllllIlIIIlIlIIIllIIlIII.length() - CookieDecoder.lIIIlIIllIllIl[2], lllllllllllllIlIIIlIlIIIllIIIIlI);
                                                                            "".length();
                                                                            if ((0x38 ^ 0x3C) != (0xB8 ^ 0xBC)) {
                                                                                return;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        default: {
                                                                            lllllllllllllIlIIIlIlIIIllIIlIII.append(lllllllllllllIlIIIlIlIIIllIIIIlI);
                                                                            "".length();
                                                                            "".length();
                                                                            if (-" ".length() > " ".length()) {
                                                                                return;
                                                                            }
                                                                            continue;
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    lllllllllllllIlIIIlIlIIIllIIIIlI = lllllllllllllIlIIIlIlIIIlIllllIl.charAt(lllllllllllllIlIIIlIlIIIlIlllllI++);
                                                                    if (lIlllllllIIIlIl(lllllllllllllIlIIIlIlIIIllIIIIlI, lllllllllllllIlIIIlIlIIIllIIIlll)) {
                                                                        final String lllllllllllllIlIIIlIlIIIllIIlIIl = String.valueOf(lllllllllllllIlIIIlIlIIIllIIlIII);
                                                                        "".length();
                                                                        if ("   ".length() <= "  ".length()) {
                                                                            return;
                                                                        }
                                                                        break Label_1057;
                                                                    }
                                                                    else {
                                                                        lllllllllllllIlIIIlIlIIIllIIlIII.append(lllllllllllllIlIIIlIlIIIllIIIIlI);
                                                                        "".length();
                                                                        if (!lIlllllllIIIlIl(lllllllllllllIlIIIlIlIIIllIIIIlI, CookieDecoder.lIIIlIIllIllIl[18])) {
                                                                            continue;
                                                                        }
                                                                        lllllllllllllIlIIIlIlIIIllIIIllI = (CookieDecoder.lIIIlIIllIllIl[2] != 0);
                                                                        "".length();
                                                                        if (-"   ".length() >= 0) {
                                                                            return;
                                                                        }
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            final String lllllllllllllIlIIIlIlIIIllIIlIlI = String.valueOf(lllllllllllllIlIIIlIlIIIllIIlIII);
                                                            "".length();
                                                            if (-"  ".length() >= 0) {
                                                                return;
                                                            }
                                                            break Label_1057;
                                                        }
                                                        else {
                                                            final int lllllllllllllIlIIIlIlIIIllIIIlII = lllllllllllllIlIIIlIlIIIlIllllIl.indexOf(CookieDecoder.lIIIlIIllIllIl[19], lllllllllllllIlIIIlIlIIIlIlllllI);
                                                            if (lIlllllllIIIIll(lllllllllllllIlIIIlIlIIIllIIIlII)) {
                                                                final String lllllllllllllIlIIIlIlIIIllIIIlIl = lllllllllllllIlIIIlIlIIIlIllllIl.substring(lllllllllllllIlIIIlIlIIIllIIIIll, lllllllllllllIlIIIlIlIIIllIIIlII);
                                                                lllllllllllllIlIIIlIlIIIlIlllllI = lllllllllllllIlIIIlIlIIIllIIIlII;
                                                                "".length();
                                                                if (((49 + 7 - 3 + 83 ^ 62 + 72 - 85 + 135) & (0xC9 ^ 0xA1 ^ (0x50 ^ 0x8) ^ -" ".length())) < 0) {
                                                                    return;
                                                                }
                                                            }
                                                            else {
                                                                lllllllllllllIlIIIlIlIIIlIllllll = lllllllllllllIlIIIlIlIIIlIllllIl.substring(lllllllllllllIlIIIlIlIIIllIIIIll);
                                                                lllllllllllllIlIIIlIlIIIlIlllllI = lllllllllllllIlIIIlIlIIIlIlllIlI;
                                                            }
                                                            "".length();
                                                            if (" ".length() > "   ".length()) {
                                                                return;
                                                            }
                                                            break Label_1057;
                                                        }
                                                    }
                                                    break;
                                                }
                                                default: {
                                                    continue;
                                                }
                                            }
                                        } while (!lIlllllllIIIlIl(++lllllllllllllIlIIIlIlIIIlIlllllI, lllllllllllllIlIIIlIlIIIlIlllIlI));
                                        lllllllllllllIlIIIlIlIIIllIIIIII = lllllllllllllIlIIIlIlIIIlIllllIl.substring(lllllllllllllIlIIIlIlIIIllIIIIIl);
                                        lllllllllllllIlIIIlIlIIIlIllllll = null;
                                        "".length();
                                        if (((0x22 ^ 0x14 ^ (0x61 ^ 0x5E)) & (0x5F ^ 0x2 ^ (0xCB ^ 0x9F) ^ -" ".length())) < ((204 + 118 - 123 + 16 ^ 106 + 118 - 82 + 41) & (28 + 120 - 34 + 101 ^ 133 + 18 - 67 + 99 ^ -" ".length()))) {
                                            return;
                                        }
                                    }
                                }
                                lllllllllllllIlIIIlIlIIIlIllllII.add(lllllllllllllIlIIIlIlIIIllIIIIII);
                                "".length();
                                lllllllllllllIlIIIlIlIIIlIlllIll.add(lllllllllllllIlIIIlIlIIIlIllllll);
                                "".length();
                                "".length();
                                if (((0x56 ^ 0x75) & ~(0xA9 ^ 0x8A)) > (0xBE ^ 0xBA)) {
                                    return;
                                }
                                continue Label_0012;
                            }
                        }
                        "".length();
                        if ("  ".length() < "  ".length()) {
                            return;
                        }
                        return;
                    }
                }
            }
            break;
        }
        "".length();
        if ("  ".length() <= -" ".length()) {
            return;
        }
    }
    
    public static Set<Cookie> decode(final String lllllllllllllIlIIIlIlIIIllllIIll) {
        final List<String> lllllllllllllIlIIIlIlIIIlllllIII = new ArrayList<String>(CookieDecoder.lIIIlIIllIllIl[0]);
        final List<String> lllllllllllllIlIIIlIlIIIllllIlll = new ArrayList<String>(CookieDecoder.lIIIlIIllIllIl[0]);
        extractKeyValuePairs(lllllllllllllIlIIIlIlIIIllllIIll, lllllllllllllIlIIIlIlIIIlllllIII, lllllllllllllIlIIIlIlIIIllllIlll);
        if (lIllllllIllllll(lllllllllllllIlIIIlIlIIIlllllIII.isEmpty() ? 1 : 0)) {
            return Collections.emptySet();
        }
        int lllllllllllllIlIIIlIlIIIllllIlIl = CookieDecoder.lIIIlIIllIllIl[1];
        int lllllllllllllIlIIIlIlIIIllllIllI = 0;
        if (lIllllllIllllll(lllllllllllllIlIIIlIlIIIlllllIII.get(CookieDecoder.lIIIlIIllIllIl[1]).equalsIgnoreCase(CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[1]]) ? 1 : 0)) {
            try {
                lllllllllllllIlIIIlIlIIIllllIlIl = Integer.parseInt(lllllllllllllIlIIIlIlIIIllllIlll.get(CookieDecoder.lIIIlIIllIllIl[1]));
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (NumberFormatException ex) {}
            final int lllllllllllllIlIIIlIlIIlIIIIllll = CookieDecoder.lIIIlIIllIllIl[2];
            "".length();
            if ((0x3F ^ 0x8 ^ (0xBF ^ 0x8D)) <= 0) {
                return null;
            }
        }
        else {
            lllllllllllllIlIIIlIlIIIllllIllI = CookieDecoder.lIIIlIIllIllIl[1];
        }
        if (lIlllllllIIIIII(lllllllllllllIlIIIlIlIIIlllllIII.size(), lllllllllllllIlIIIlIlIIIllllIllI)) {
            return Collections.emptySet();
        }
        final Set<Cookie> lllllllllllllIlIIIlIlIIIllllIlII = new TreeSet<Cookie>();
        while (lIlllllllIIIIIl(lllllllllllllIlIIIlIlIIIllllIllI, lllllllllllllIlIIIlIlIIIlllllIII.size())) {
            String lllllllllllllIlIIIlIlIIlIIIIIlIl = lllllllllllllIlIIIlIlIIIlllllIII.get(lllllllllllllIlIIIlIlIIIllllIllI);
            String lllllllllllllIlIIIlIlIIlIIIIIlII = lllllllllllllIlIIIlIlIIIllllIlll.get(lllllllllllllIlIIIlIlIIIllllIllI);
            if (lIlllllllIIIIlI(lllllllllllllIlIIIlIlIIlIIIIIlII)) {
                lllllllllllllIlIIIlIlIIlIIIIIlII = CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[2]];
            }
            final Cookie lllllllllllllIlIIIlIlIIlIIIIIIll = new DefaultCookie(lllllllllllllIlIIIlIlIIlIIIIIlIl, lllllllllllllIlIIIlIlIIlIIIIIlII);
            boolean lllllllllllllIlIIIlIlIIlIIIIIIlI = CookieDecoder.lIIIlIIllIllIl[1] != 0;
            boolean lllllllllllllIlIIIlIlIIlIIIIIIIl = CookieDecoder.lIIIlIIllIllIl[1] != 0;
            boolean lllllllllllllIlIIIlIlIIlIIIIIIII = CookieDecoder.lIIIlIIllIllIl[1] != 0;
            String lllllllllllllIlIIIlIlIIIllllllll = null;
            String lllllllllllllIlIIIlIlIIIlllllllI = null;
            String lllllllllllllIlIIIlIlIIIllllllIl = null;
            String lllllllllllllIlIIIlIlIIIllllllII = null;
            long lllllllllllllIlIIIlIlIIIlllllIll = Long.MIN_VALUE;
            final List<Integer> lllllllllllllIlIIIlIlIIIlllllIlI = new ArrayList<Integer>(CookieDecoder.lIIIlIIllIllIl[3]);
            int lllllllllllllIlIIIlIlIIlIIIIIllI = lllllllllllllIlIIIlIlIIIllllIllI + CookieDecoder.lIIIlIIllIllIl[2];
            while (lIlllllllIIIIIl(lllllllllllllIlIIIlIlIIlIIIIIllI, lllllllllllllIlIIIlIlIIIlllllIII.size())) {
                lllllllllllllIlIIIlIlIIlIIIIIlIl = lllllllllllllIlIIIlIlIIIlllllIII.get(lllllllllllllIlIIIlIlIIlIIIIIllI);
                lllllllllllllIlIIIlIlIIlIIIIIlII = lllllllllllllIlIIIlIlIIIllllIlll.get(lllllllllllllIlIIIlIlIIlIIIIIllI);
                Label_1064: {
                    if (lIllllllIllllll(CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[3]].equalsIgnoreCase(lllllllllllllIlIIIlIlIIlIIIIIlIl) ? 1 : 0)) {
                        lllllllllllllIlIIIlIlIIlIIIIIIlI = (CookieDecoder.lIIIlIIllIllIl[2] != 0);
                        "".length();
                        if ("   ".length() <= 0) {
                            return null;
                        }
                    }
                    else if (lIllllllIllllll(CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[4]].equalsIgnoreCase(lllllllllllllIlIIIlIlIIlIIIIIlIl) ? 1 : 0)) {
                        lllllllllllllIlIIIlIlIIlIIIIIIIl = (CookieDecoder.lIIIlIIllIllIl[2] != 0);
                        "".length();
                        if (((0x3C ^ 0x6E) & ~(0x52 ^ 0x0)) != 0x0) {
                            return null;
                        }
                    }
                    else if (lIllllllIllllll(CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[5]].equalsIgnoreCase(lllllllllllllIlIIIlIlIIlIIIIIlIl) ? 1 : 0)) {
                        lllllllllllllIlIIIlIlIIlIIIIIIII = (CookieDecoder.lIIIlIIllIllIl[2] != 0);
                        "".length();
                        if ("  ".length() < " ".length()) {
                            return null;
                        }
                    }
                    else if (lIllllllIllllll(CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[6]].equalsIgnoreCase(lllllllllllllIlIIIlIlIIlIIIIIlIl) ? 1 : 0)) {
                        lllllllllllllIlIIIlIlIIIllllllll = lllllllllllllIlIIIlIlIIlIIIIIlII;
                        "".length();
                        if ("  ".length() < 0) {
                            return null;
                        }
                    }
                    else if (lIllllllIllllll(CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[7]].equalsIgnoreCase(lllllllllllllIlIIIlIlIIlIIIIIlIl) ? 1 : 0)) {
                        lllllllllllllIlIIIlIlIIIlllllllI = lllllllllllllIlIIIlIlIIlIIIIIlII;
                        "".length();
                        if (-(58 + 55 + 23 + 22 ^ 45 + 152 - 155 + 113) >= 0) {
                            return null;
                        }
                    }
                    else if (lIllllllIllllll(CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[8]].equalsIgnoreCase(lllllllllllllIlIIIlIlIIlIIIIIlIl) ? 1 : 0)) {
                        lllllllllllllIlIIIlIlIIIllllllIl = lllllllllllllIlIIIlIlIIlIIIIIlII;
                        "".length();
                        if (((0xC0 ^ 0x8D) & ~(0xF8 ^ 0xB5)) < 0) {
                            return null;
                        }
                    }
                    else if (lIllllllIllllll(CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[0]].equalsIgnoreCase(lllllllllllllIlIIIlIlIIlIIIIIlIl) ? 1 : 0)) {
                        lllllllllllllIlIIIlIlIIIllllllII = lllllllllllllIlIIIlIlIIlIIIIIlII;
                        "".length();
                        if (" ".length() <= 0) {
                            return null;
                        }
                    }
                    else {
                        if (lIllllllIllllll(CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[9]].equalsIgnoreCase(lllllllllllllIlIIIlIlIIlIIIIIlIl) ? 1 : 0)) {
                            try {
                                final long lllllllllllllIlIIIlIlIIlIIIIlllI = HttpHeaderDateFormat.get().parse(lllllllllllllIlIIIlIlIIlIIIIIlII).getTime() - System.currentTimeMillis();
                                final long n = lllllllllllllIlIIIlIlIIlIIIIlllI / 1000L;
                                int n2;
                                if (lIllllllIllllll(lIllllllIlllllI(lllllllllllllIlIIIlIlIIlIIIIlllI % 1000L, 0L))) {
                                    n2 = CookieDecoder.lIIIlIIllIllIl[2];
                                    "".length();
                                    if ("   ".length() != "   ".length()) {
                                        return null;
                                    }
                                }
                                else {
                                    n2 = CookieDecoder.lIIIlIIllIllIl[1];
                                }
                                lllllllllllllIlIIIlIlIIIlllllIll = n + n2;
                                "".length();
                                if (null != null) {
                                    return null;
                                }
                                break Label_1064;
                            }
                            catch (ParseException lllllllllllllIlIIIlIlIIlIIIIllIl) {
                                "".length();
                                if (-"  ".length() > 0) {
                                    return null;
                                }
                                break Label_1064;
                            }
                        }
                        if (lIllllllIllllll(CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[10]].equalsIgnoreCase(lllllllllllllIlIIIlIlIIlIIIIIlIl) ? 1 : 0)) {
                            lllllllllllllIlIIIlIlIIIlllllIll = Integer.parseInt(lllllllllllllIlIIIlIlIIlIIIIIlII);
                            "".length();
                            if (" ".length() < ((0xC6 ^ 0x9B) & ~(0x29 ^ 0x74))) {
                                return null;
                            }
                        }
                        else if (lIllllllIllllll(CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[11]].equalsIgnoreCase(lllllllllllllIlIIIlIlIIlIIIIIlIl) ? 1 : 0)) {
                            lllllllllllllIlIIIlIlIIIllllIlIl = Integer.parseInt(lllllllllllllIlIIIlIlIIlIIIIIlII);
                            "".length();
                            if ("   ".length() <= 0) {
                                return null;
                            }
                        }
                        else {
                            if (!lIllllllIllllll(CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[12]].equalsIgnoreCase(lllllllllllllIlIIIlIlIIlIIIIIlIl) ? 1 : 0)) {
                                break;
                            }
                            final String[] lllllllllllllIlIIIlIlIIlIIIIlIlI;
                            final String[] lllllllllllllIlIIIlIlIIlIIIIIlll = lllllllllllllIlIIIlIlIIlIIIIlIlI = StringUtil.split(lllllllllllllIlIIIlIlIIlIIIIIlII, (char)CookieDecoder.lIIIlIIllIllIl[13]);
                            final int lllllllllllllIlIIIlIlIIlIIIIlIIl = lllllllllllllIlIIIlIlIIlIIIIlIlI.length;
                            int lllllllllllllIlIIIlIlIIlIIIIlIII = CookieDecoder.lIIIlIIllIllIl[1];
                            while (lIlllllllIIIIIl(lllllllllllllIlIIIlIlIIlIIIIlIII, lllllllllllllIlIIIlIlIIlIIIIlIIl)) {
                                final String lllllllllllllIlIIIlIlIIlIIIIlIll = lllllllllllllIlIIIlIlIIlIIIIlIlI[lllllllllllllIlIIIlIlIIlIIIIlIII];
                                try {
                                    lllllllllllllIlIIIlIlIIIlllllIlI.add(Integer.valueOf(lllllllllllllIlIIIlIlIIlIIIIlIll));
                                    "".length();
                                    "".length();
                                    if ((0xAD ^ 0xC4 ^ (0x7F ^ 0x12)) < 0) {
                                        return null;
                                    }
                                }
                                catch (NumberFormatException ex2) {}
                                ++lllllllllllllIlIIIlIlIIlIIIIlIII;
                                "".length();
                                if (((0x4A ^ 0x16) & ~(0xD9 ^ 0x85)) == " ".length()) {
                                    return null;
                                }
                            }
                        }
                    }
                }
                ++lllllllllllllIlIIIlIlIIlIIIIIllI;
                ++lllllllllllllIlIIIlIlIIIllllIllI;
                "".length();
                if (-"   ".length() > 0) {
                    return null;
                }
            }
            lllllllllllllIlIIIlIlIIlIIIIIIll.setVersion(lllllllllllllIlIIIlIlIIIllllIlIl);
            lllllllllllllIlIIIlIlIIlIIIIIIll.setMaxAge(lllllllllllllIlIIIlIlIIIlllllIll);
            lllllllllllllIlIIIlIlIIlIIIIIIll.setPath(lllllllllllllIlIIIlIlIIIllllllII);
            lllllllllllllIlIIIlIlIIlIIIIIIll.setDomain(lllllllllllllIlIIIlIlIIIllllllIl);
            lllllllllllllIlIIIlIlIIlIIIIIIll.setSecure(lllllllllllllIlIIIlIlIIlIIIIIIIl);
            lllllllllllllIlIIIlIlIIlIIIIIIll.setHttpOnly(lllllllllllllIlIIIlIlIIlIIIIIIII);
            if (lIlllllllIIIIll(lllllllllllllIlIIIlIlIIIllllIlIl)) {
                lllllllllllllIlIIIlIlIIlIIIIIIll.setComment(lllllllllllllIlIIIlIlIIIllllllll);
            }
            if (lIlllllllIIIlII(lllllllllllllIlIIIlIlIIIllllIlIl, CookieDecoder.lIIIlIIllIllIl[2])) {
                lllllllllllllIlIIIlIlIIlIIIIIIll.setCommentUrl(lllllllllllllIlIIIlIlIIIlllllllI);
                lllllllllllllIlIIIlIlIIlIIIIIIll.setPorts(lllllllllllllIlIIIlIlIIIlllllIlI);
                lllllllllllllIlIIIlIlIIlIIIIIIll.setDiscard(lllllllllllllIlIIIlIlIIlIIIIIIlI);
            }
            lllllllllllllIlIIIlIlIIIllllIlII.add(lllllllllllllIlIIIlIlIIlIIIIIIll);
            "".length();
            ++lllllllllllllIlIIIlIlIIIllllIllI;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return lllllllllllllIlIIIlIlIIIllllIlII;
    }
    
    private static boolean lIlllllllIIIIIl(final int lllllllllllllIlIIIlIlIIIIlllIIIl, final int lllllllllllllIlIIIlIlIIIIlllIIII) {
        return lllllllllllllIlIIIlIlIIIIlllIIIl < lllllllllllllIlIIIlIlIIIIlllIIII;
    }
    
    private static boolean lIlllllllIIIIlI(final Object lllllllllllllIlIIIlIlIIIIllIIllI) {
        return lllllllllllllIlIIIlIlIIIIllIIllI == null;
    }
    
    private static String lIllllllIllIIII(String lllllllllllllIlIIIlIlIIIlIIIllIl, final String lllllllllllllIlIIIlIlIIIlIIIllII) {
        lllllllllllllIlIIIlIlIIIlIIIllIl = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIlIlIIIlIIIllIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIlIlIIIlIIlIIII = new StringBuilder();
        final char[] lllllllllllllIlIIIlIlIIIlIIIllll = lllllllllllllIlIIIlIlIIIlIIIllII.toCharArray();
        int lllllllllllllIlIIIlIlIIIlIIIlllI = CookieDecoder.lIIIlIIllIllIl[1];
        final boolean lllllllllllllIlIIIlIlIIIlIIIlIII = (Object)((String)lllllllllllllIlIIIlIlIIIlIIIllIl).toCharArray();
        final Exception lllllllllllllIlIIIlIlIIIlIIIIlll = (Exception)lllllllllllllIlIIIlIlIIIlIIIlIII.length;
        Exception lllllllllllllIlIIIlIlIIIlIIIIllI = (Exception)CookieDecoder.lIIIlIIllIllIl[1];
        while (lIlllllllIIIIIl((int)lllllllllllllIlIIIlIlIIIlIIIIllI, (int)lllllllllllllIlIIIlIlIIIlIIIIlll)) {
            final char lllllllllllllIlIIIlIlIIIlIIlIIll = lllllllllllllIlIIIlIlIIIlIIIlIII[lllllllllllllIlIIIlIlIIIlIIIIllI];
            lllllllllllllIlIIIlIlIIIlIIlIIII.append((char)(lllllllllllllIlIIIlIlIIIlIIlIIll ^ lllllllllllllIlIIIlIlIIIlIIIllll[lllllllllllllIlIIIlIlIIIlIIIlllI % lllllllllllllIlIIIlIlIIIlIIIllll.length]));
            "".length();
            ++lllllllllllllIlIIIlIlIIIlIIIlllI;
            ++lllllllllllllIlIIIlIlIIIlIIIIllI;
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIlIlIIIlIIlIIII);
    }
    
    private static boolean lIlllllllIIIIII(final int lllllllllllllIlIIIlIlIIIIllIllIl, final int lllllllllllllIlIIIlIlIIIIllIllII) {
        return lllllllllllllIlIIIlIlIIIIllIllIl <= lllllllllllllIlIIIlIlIIIIllIllII;
    }
    
    private static String lIllllllIllIIIl(final String lllllllllllllIlIIIlIlIIIIllllIll, final String lllllllllllllIlIIIlIlIIIIlllllII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlIlIIIlIIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlIlIIIIlllllII.getBytes(StandardCharsets.UTF_8)), CookieDecoder.lIIIlIIllIllIl[0]), "DES");
            final Cipher lllllllllllllIlIIIlIlIIIIlllllll = Cipher.getInstance("DES");
            lllllllllllllIlIIIlIlIIIIlllllll.init(CookieDecoder.lIIIlIIllIllIl[3], lllllllllllllIlIIIlIlIIIlIIIIIII);
            return new String(lllllllllllllIlIIIlIlIIIIlllllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlIlIIIIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlIlIIIIllllllI) {
            lllllllllllllIlIIIlIlIIIIllllllI.printStackTrace();
            return null;
        }
    }
    
    private CookieDecoder() {
    }
    
    private static boolean lIlllllllIIIlIl(final int lllllllllllllIlIIIlIlIIIIlllIlIl, final int lllllllllllllIlIIIlIlIIIIlllIlII) {
        return lllllllllllllIlIIIlIlIIIIlllIlIl == lllllllllllllIlIIIlIlIIIIlllIlII;
    }
    
    private static String lIllllllIllIIlI(final String lllllllllllllIlIIIlIlIIIlIlIIIlI, final String lllllllllllllIlIIIlIlIIIlIIlllll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlIlIIIlIlIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlIlIIIlIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIlIlIIIlIlIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIlIlIIIlIlIIlII.init(CookieDecoder.lIIIlIIllIllIl[3], lllllllllllllIlIIIlIlIIIlIlIIlIl);
            return new String(lllllllllllllIlIIIlIlIIIlIlIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlIlIIIlIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlIlIIIlIlIIIll) {
            lllllllllllllIlIIIlIlIIIlIlIIIll.printStackTrace();
            return null;
        }
    }
    
    private static void lIllllllIllllIl() {
        (lIIIlIIllIllIl = new int[21])[0] = (0x8A ^ 0x82);
        CookieDecoder.lIIIlIIllIllIl[1] = ((0x29 ^ 0x30) & ~(0xAB ^ 0xB2));
        CookieDecoder.lIIIlIIllIllIl[2] = " ".length();
        CookieDecoder.lIIIlIIllIllIl[3] = "  ".length();
        CookieDecoder.lIIIlIIllIllIl[4] = "   ".length();
        CookieDecoder.lIIIlIIllIllIl[5] = ("  ".length() ^ (0xC2 ^ 0xC4));
        CookieDecoder.lIIIlIIllIllIl[6] = (0xA1 ^ 0xA4);
        CookieDecoder.lIIIlIIllIllIl[7] = (0x82 ^ 0x84);
        CookieDecoder.lIIIlIIllIllIl[8] = (0xA4 ^ 0xA3);
        CookieDecoder.lIIIlIIllIllIl[9] = (76 + 135 - 144 + 120 ^ 143 + 78 - 168 + 125);
        CookieDecoder.lIIIlIIllIllIl[10] = (0x9 ^ 0x1E ^ (0x8B ^ 0x96));
        CookieDecoder.lIIIlIIllIllIl[11] = (0x9F ^ 0x90 ^ (0x55 ^ 0x51));
        CookieDecoder.lIIIlIIllIllIl[12] = (0xC5 ^ 0xB9 ^ (0x69 ^ 0x19));
        CookieDecoder.lIIIlIIllIllIl[13] = (0x8 ^ 0x24);
        CookieDecoder.lIIIlIIllIllIl[14] = (0x59 ^ 0x7D);
        CookieDecoder.lIIIlIIllIllIl[15] = (57 + 99 - 129 + 153 ^ 177 + 151 - 233 + 90);
        CookieDecoder.lIIIlIIllIllIl[16] = (82 + 38 - 30 + 40 ^ 85 + 43 - 88 + 120);
        CookieDecoder.lIIIlIIllIllIl[17] = (0xE1 ^ 0xC6);
        CookieDecoder.lIIIlIIllIllIl[18] = (0xD2 ^ 0x8E);
        CookieDecoder.lIIIlIIllIllIl[19] = (0xCC ^ 0xC6 ^ (0x67 ^ 0x56));
        CookieDecoder.lIIIlIIllIllIl[20] = (115 + 90 - 152 + 76 ^ 83 + 139 - 211 + 132);
    }
    
    private static boolean lIlllllllIIIIll(final int lllllllllllllIlIIIlIlIIIIllIIIlI) {
        return lllllllllllllIlIIIlIlIIIIllIIIlI > 0;
    }
    
    private static void lIllllllIlllIIl() {
        (lIIIlIIllIIlIl = new String[CookieDecoder.lIIIlIIllIllIl[20]])[CookieDecoder.lIIIlIIllIllIl[1]] = lIllllllIllIIII("AicFPg07LA==", "TBwMd");
        CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[2]] = lIllllllIllIIIl("NOcHRbHaF6o=", "wvajy");
        CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[3]] = lIllllllIllIIlI("E87yaj6tPhQ=", "Hdovl");
        CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[4]] = lIllllllIllIIlI("/PTEyFBY3SM=", "GlOAJ");
        CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[5]] = lIllllllIllIIIl("m8jLayAKFzKyxMrPel1tQA==", "eGNLF");
        CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[6]] = lIllllllIllIIlI("ZSAJ8K4qbic=", "xhljI");
        CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[7]] = lIllllllIllIIII("CQEkPgskGhwBIg==", "JnISn");
        CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[8]] = lIllllllIllIIlI("NoDHqEbupLs=", "MCwMx");
        CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[0]] = lIllllllIllIIIl("A84lXLXdpNE=", "HOSNQ");
        CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[9]] = lIllllllIllIIIl("4qLYObz9eL8=", "TXBim");
        CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[10]] = lIllllllIllIIIl("DySNgus5qd0=", "JFWgN");
        CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[11]] = lIllllllIllIIII("AwkICiA6Ag==", "UlzyI");
        CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[12]] = lIllllllIllIIlI("PvHNwIeJ1r4=", "DCHCa");
        CookieDecoder.lIIIlIIllIIlIl[CookieDecoder.lIIIlIIllIllIl[15]] = lIllllllIllIIII("", "OOxHO");
    }
    
    private static boolean lIlllllllIIIllI(final int lllllllllllllIlIIIlIlIIIIlIlllll, final int lllllllllllllIlIIIlIlIIIIlIllllI) {
        return lllllllllllllIlIIIlIlIIIIlIlllll != lllllllllllllIlIIIlIlIIIIlIllllI;
    }
    
    private static boolean lIlllllllIIIlII(final int lllllllllllllIlIIIlIlIIIIllIlIIl, final int lllllllllllllIlIIIlIlIIIIllIlIII) {
        return lllllllllllllIlIIIlIlIIIIllIlIIl > lllllllllllllIlIIIlIlIIIIllIlIII;
    }
    
    static {
        lIllllllIllllIl();
        lIllllllIlllIIl();
        COMMA = (char)CookieDecoder.lIIIlIIllIllIl[13];
    }
}
