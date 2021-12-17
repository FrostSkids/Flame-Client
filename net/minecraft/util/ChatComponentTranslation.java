// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import com.google.common.collect.Iterators;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.regex.Matcher;
import java.util.IllegalFormatException;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.regex.Pattern;

public class ChatComponentTranslation extends ChatComponentStyle
{
    private final /* synthetic */ String key;
    private final /* synthetic */ Object syncLock;
    public static final /* synthetic */ Pattern stringVariablePattern;
    /* synthetic */ List<IChatComponent> children;
    private /* synthetic */ long lastTranslationUpdateTimeInMilliseconds;
    private static final /* synthetic */ String[] lIIIIlIlIIIIlI;
    private static final /* synthetic */ int[] lIIIIlIlIIIllI;
    private final /* synthetic */ Object[] formatArgs;
    
    private IChatComponent getFormatArgumentAsComponent(final int lllllllllllllIlIIlIlllIIIIllllII) {
        if (lIlllIIlIllIlll(lllllllllllllIlIIlIlllIIIIllllII, this.formatArgs.length)) {
            throw new ChatComponentTranslationFormatException(this, lllllllllllllIlIIlIlllIIIIllllII);
        }
        final Object lllllllllllllIlIIlIlllIIIlIIIIII = this.formatArgs[lllllllllllllIlIIlIlllIIIIllllII];
        IChatComponent lllllllllllllIlIIlIlllIIIIlllllI = null;
        if (lIlllIIlIllIllI((lllllllllllllIlIIlIlllIIIlIIIIII instanceof IChatComponent) ? 1 : 0)) {
            final IChatComponent lllllllllllllIlIIlIlllIIIIllllll = (IChatComponent)lllllllllllllIlIIlIlllIIIlIIIIII;
            "".length();
            if ("  ".length() > (0x92 ^ 0x96)) {
                return null;
            }
        }
        else {
            String string;
            if (lIlllIIlIlllllI(lllllllllllllIlIIlIlllIIIlIIIIII)) {
                string = ChatComponentTranslation.lIIIIlIlIIIIlI[ChatComponentTranslation.lIIIIlIlIIIllI[7]];
                "".length();
                if (" ".length() >= "   ".length()) {
                    return null;
                }
            }
            else {
                string = lllllllllllllIlIIlIlllIIIlIIIIII.toString();
            }
            lllllllllllllIlIIlIlllIIIIlllllI = new ChatComponentText(string);
            lllllllllllllIlIIlIlllIIIIlllllI.getChatStyle().setParentStyle(this.getChatStyle());
            "".length();
        }
        return lllllllllllllIlIIlIlllIIIIlllllI;
    }
    
    private static boolean lIlllIIlIlllIIl(final int lllllllllllllIlIIlIllIllIllllllI) {
        return lllllllllllllIlIIlIllIllIllllllI == 0;
    }
    
    public String getKey() {
        return this.key;
    }
    
    synchronized void ensureInitialized() {
        synchronized (this.syncLock) {
            final long lllllllllllllIlIIlIlllIIIlllIlII = StatCollector.getLastTranslationUpdateTimeInMilliseconds();
            if (lIlllIIlIlllIIl(lIlllIIlIlllIII(lllllllllllllIlIIlIlllIIIlllIlII, this.lastTranslationUpdateTimeInMilliseconds))) {
                // monitorexit(this.syncLock)
                return;
            }
            this.lastTranslationUpdateTimeInMilliseconds = lllllllllllllIlIIlIlllIIIlllIlII;
            this.children.clear();
            // monitorexit(this.syncLock)
            "".length();
            if (null != null) {
                return;
            }
        }
        try {
            this.initializeFromFormat(StatCollector.translateToLocal(this.key));
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        catch (ChatComponentTranslationFormatException lllllllllllllIlIIlIlllIIIlllIIll) {
            this.children.clear();
            try {
                this.initializeFromFormat(StatCollector.translateToFallback(this.key));
                "".length();
                if ((0x87 ^ 0xBA ^ (0x9A ^ 0xA2)) == 0x0) {
                    return;
                }
            }
            catch (ChatComponentTranslationFormatException lllllllllllllIlIIlIlllIIIlllIIlI) {
                throw lllllllllllllIlIIlIlllIIIlllIIll;
            }
        }
    }
    
    private static String lIlllIIlIIllllI(String lllllllllllllIlIIlIllIllllIlIIlI, final String lllllllllllllIlIIlIllIllllIllIII) {
        lllllllllllllIlIIlIllIllllIlIIlI = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIlIllIllllIlIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIllIllllIlIlll = new StringBuilder();
        final char[] lllllllllllllIlIIlIllIllllIlIllI = lllllllllllllIlIIlIllIllllIllIII.toCharArray();
        int lllllllllllllIlIIlIllIllllIlIlII = ChatComponentTranslation.lIIIIlIlIIIllI[0];
        final short lllllllllllllIlIIlIllIllllIIlIll = (Object)((String)lllllllllllllIlIIlIllIllllIlIIlI).toCharArray();
        final boolean lllllllllllllIlIIlIllIllllIIlIIl = lllllllllllllIlIIlIllIllllIIlIll.length != 0;
        byte lllllllllllllIlIIlIllIllllIIIlll = (byte)ChatComponentTranslation.lIIIIlIlIIIllI[0];
        while (lIlllIIlIllllII(lllllllllllllIlIIlIllIllllIIIlll, lllllllllllllIlIIlIllIllllIIlIIl ? 1 : 0)) {
            final char lllllllllllllIlIIlIllIllllIllIll = lllllllllllllIlIIlIllIllllIIlIll[lllllllllllllIlIIlIllIllllIIIlll];
            lllllllllllllIlIIlIllIllllIlIlll.append((char)(lllllllllllllIlIIlIllIllllIllIll ^ lllllllllllllIlIIlIllIllllIlIllI[lllllllllllllIlIIlIllIllllIlIlII % lllllllllllllIlIIlIllIllllIlIllI.length]));
            "".length();
            ++lllllllllllllIlIIlIllIllllIlIlII;
            ++lllllllllllllIlIIlIllIllllIIIlll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIllIllllIlIlll);
    }
    
    private static String lIlllIIlIIllIII(final String lllllllllllllIlIIlIllIlllIllIlll, final String lllllllllllllIlIIlIllIlllIllIlIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIllIlllIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIllIlllIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIllIlllIlllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIllIlllIlllIlI.init(ChatComponentTranslation.lIIIIlIlIIIllI[1], lllllllllllllIlIIlIllIlllIlllIll);
            return new String(lllllllllllllIlIIlIllIlllIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIllIlllIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIllIlllIlllIIl) {
            lllllllllllllIlIIlIllIlllIlllIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder(ChatComponentTranslation.lIIIIlIlIIIIlI[ChatComponentTranslation.lIIIIlIlIIIllI[9]]).append(this.key).append((char)ChatComponentTranslation.lIIIIlIlIIIllI[10]).append(ChatComponentTranslation.lIIIIlIlIIIIlI[ChatComponentTranslation.lIIIIlIlIIIllI[11]]).append(Arrays.toString(this.formatArgs)).append(ChatComponentTranslation.lIIIIlIlIIIIlI[ChatComponentTranslation.lIIIIlIlIIIllI[12]]).append(this.siblings).append(ChatComponentTranslation.lIIIIlIlIIIIlI[ChatComponentTranslation.lIIIIlIlIIIllI[13]]).append(this.getChatStyle()).append((char)ChatComponentTranslation.lIIIIlIlIIIllI[14]));
    }
    
    private static void lIlllIIlIlIlllI() {
        (lIIIIlIlIIIIlI = new String[ChatComponentTranslation.lIIIIlIlIIIllI[15]])[ChatComponentTranslation.lIIIIlIlIIIllI[0]] = lIlllIIlIIlIlll("+3zZks7MEOQxWOAWaLaH6xijaHL1AmG8RYg9aq/vfrw=", "Btpqa");
        ChatComponentTranslation.lIIIIlIlIIIIlI[ChatComponentTranslation.lIIIIlIlIIIllI[2]] = lIlllIIlIIllIII("D7ZtnybWDgo=", "HtNMa");
        ChatComponentTranslation.lIIIIlIlIIIIlI[ChatComponentTranslation.lIIIIlIlIIIllI[1]] = lIlllIIlIIllIII("ow1AXpxJeBY=", "bLkHh");
        ChatComponentTranslation.lIIIIlIlIIIIlI[ChatComponentTranslation.lIIIIlIlIIIllI[3]] = lIlllIIlIIllIII("IKw+5EKugK0=", "Iomiz");
        ChatComponentTranslation.lIIIIlIlIIIIlI[ChatComponentTranslation.lIIIIlIlIIIllI[4]] = lIlllIIlIIllIII("NvZYTnhF6kM=", "Hsbqv");
        ChatComponentTranslation.lIIIIlIlIIIIlI[ChatComponentTranslation.lIIIIlIlIIIllI[5]] = lIlllIIlIIllllI("JQ0dJAYADBwlExRDCD4EHQIaa1ZX", "pcnQv");
        ChatComponentTranslation.lIIIIlIlIIIIlI[ChatComponentTranslation.lIIIIlIlIIIllI[6]] = lIlllIIlIIlIlll("hNWxmp/77zI=", "mkHcg");
        ChatComponentTranslation.lIIIIlIlIIIIlI[ChatComponentTranslation.lIIIIlIlIIIllI[7]] = lIlllIIlIIllllI("JhgENQ==", "HmhYo");
        ChatComponentTranslation.lIIIIlIlIIIIlI[ChatComponentTranslation.lIIIIlIlIIIllI[9]] = lIlllIIlIIlIlll("tIra/lltvkYyQGumlg3Jgy00cCXtH7/10jIXashbfbo=", "kCSGQ");
        ChatComponentTranslation.lIIIIlIlIIIIlI[ChatComponentTranslation.lIIIIlIlIIIllI[11]] = lIlllIIlIIllIII("57jk2D+Hc2w=", "lsCPR");
        ChatComponentTranslation.lIIIIlIlIIIIlI[ChatComponentTranslation.lIIIIlIlIIIllI[12]] = lIlllIIlIIlIlll("WIl3iETuzoPMdXFWTdfF4g==", "lTIfI");
        ChatComponentTranslation.lIIIIlIlIIIIlI[ChatComponentTranslation.lIIIIlIlIIIllI[13]] = lIlllIIlIIllllI("REM7JREEBnU=", "hcHQh");
    }
    
    private static boolean lIlllIIlIlllIlI(final int lllllllllllllIlIIlIllIlllIIllIIl, final int lllllllllllllIlIIlIllIlllIIlIlll) {
        return lllllllllllllIlIIlIllIlllIIllIIl > lllllllllllllIlIIlIllIlllIIlIlll;
    }
    
    private static int lIlllIIlIllllll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIlllIIlIllIlll(final int lllllllllllllIlIIlIllIlllIlIIIIl, final int lllllllllllllIlIIlIllIlllIlIIIII) {
        return lllllllllllllIlIIlIllIlllIlIIIIl >= lllllllllllllIlIIlIllIlllIlIIIII;
    }
    
    @Override
    public ChatComponentTranslation createCopy() {
        final Object[] lllllllllllllIlIIlIlllIIIIIlIlIl = new Object[this.formatArgs.length];
        int lllllllllllllIlIIlIlllIIIIIlIlII = ChatComponentTranslation.lIIIIlIlIIIllI[0];
        "".length();
        if (((0xD7 ^ 0xC1) & ~(0x64 ^ 0x72)) != 0x0) {
            return null;
        }
        while (!lIlllIIlIllIlll(lllllllllllllIlIIlIlllIIIIIlIlII, this.formatArgs.length)) {
            if (lIlllIIlIllIllI((this.formatArgs[lllllllllllllIlIIlIlllIIIIIlIlII] instanceof IChatComponent) ? 1 : 0)) {
                lllllllllllllIlIIlIlllIIIIIlIlIl[lllllllllllllIlIIlIlllIIIIIlIlII] = ((IChatComponent)this.formatArgs[lllllllllllllIlIIlIlllIIIIIlIlII]).createCopy();
                "".length();
                if (((36 + 129 - 34 + 20 ^ 135 + 72 - 56 + 32) & (0x1E ^ 0x3A ^ (0xC0 ^ 0xC4) ^ -" ".length())) != ((4 + 30 + 120 + 20 ^ 136 + 118 - 160 + 53) & (110 + 47 - 121 + 105 ^ 69 + 38 - 83 + 152 ^ -" ".length()))) {
                    return null;
                }
            }
            else {
                lllllllllllllIlIIlIlllIIIIIlIlIl[lllllllllllllIlIIlIlllIIIIIlIlII] = this.formatArgs[lllllllllllllIlIIlIlllIIIIIlIlII];
            }
            ++lllllllllllllIlIIlIlllIIIIIlIlII;
        }
        final ChatComponentTranslation lllllllllllllIlIIlIlllIIIIIlIIll = new ChatComponentTranslation(this.key, lllllllllllllIlIIlIlllIIIIIlIlIl);
        lllllllllllllIlIIlIlllIIIIIlIIll.setChatStyle(this.getChatStyle().createShallowCopy());
        "".length();
        final boolean lllllllllllllIlIIlIlllIIIIIIllIl = (boolean)this.getSiblings().iterator();
        "".length();
        if ((0x51 ^ 0x54) <= 0) {
            return null;
        }
        while (!lIlllIIlIlllIIl(((Iterator)lllllllllllllIlIIlIlllIIIIIIllIl).hasNext() ? 1 : 0)) {
            final IChatComponent lllllllllllllIlIIlIlllIIIIIlIIlI = ((Iterator<IChatComponent>)lllllllllllllIlIIlIlllIIIIIIllIl).next();
            lllllllllllllIlIIlIlllIIIIIlIIll.appendSibling(lllllllllllllIlIIlIlllIIIIIlIIlI.createCopy());
            "".length();
        }
        return lllllllllllllIlIIlIlllIIIIIlIIll;
    }
    
    private static boolean lIlllIIlIllllII(final int lllllllllllllIlIIlIllIlllIIlllIl, final int lllllllllllllIlIIlIllIlllIIlllII) {
        return lllllllllllllIlIIlIllIlllIIlllIl < lllllllllllllIlIIlIllIlllIIlllII;
    }
    
    private static boolean lIlllIIlIlllllI(final Object lllllllllllllIlIIlIllIlllIIIIllI) {
        return lllllllllllllIlIIlIllIlllIIIIllI == null;
    }
    
    private static void lIlllIIlIllIlIl() {
        (lIIIIlIlIIIllI = new int[16])[0] = ((0x2E ^ 0x79) & ~(0x4D ^ 0x1A));
        ChatComponentTranslation.lIIIIlIlIIIllI[1] = "  ".length();
        ChatComponentTranslation.lIIIIlIlIIIllI[2] = " ".length();
        ChatComponentTranslation.lIIIIlIlIIIllI[3] = "   ".length();
        ChatComponentTranslation.lIIIIlIlIIIllI[4] = (116 + 6 - 43 + 94 ^ 120 + 161 - 227 + 115);
        ChatComponentTranslation.lIIIIlIlIIIllI[5] = (0x8 ^ 0xD);
        ChatComponentTranslation.lIIIIlIlIIIllI[6] = (0x7C ^ 0x39 ^ (0xDC ^ 0x9F));
        ChatComponentTranslation.lIIIIlIlIIIllI[7] = (114 + 83 - 156 + 106 ^ 33 + 101 - 62 + 76);
        ChatComponentTranslation.lIIIIlIlIIIllI[8] = (0xD7 ^ 0xB6 ^ (0x33 ^ 0x4D));
        ChatComponentTranslation.lIIIIlIlIIIllI[9] = (163 + 55 - 175 + 147 ^ 105 + 106 - 73 + 44);
        ChatComponentTranslation.lIIIIlIlIIIllI[10] = (177 + 55 - 203 + 198 ^ 79 + 20 + 97 + 0);
        ChatComponentTranslation.lIIIIlIlIIIllI[11] = (0x11 ^ 0x18);
        ChatComponentTranslation.lIIIIlIlIIIllI[12] = (0x4D ^ 0x6D ^ (0x15 ^ 0x3F));
        ChatComponentTranslation.lIIIIlIlIIIllI[13] = (136 + 82 - 196 + 160 ^ 139 + 4 - 106 + 152);
        ChatComponentTranslation.lIIIIlIlIIIllI[14] = (0xD8 ^ 0xA5);
        ChatComponentTranslation.lIIIIlIlIIIllI[15] = (119 + 163 - 135 + 34 ^ 14 + 93 - 60 + 138);
    }
    
    protected void initializeFromFormat(final String lllllllllllllIlIIlIlllIIIllIIIIl) {
        final boolean lllllllllllllIlIIlIlllIIIllIIIII = ChatComponentTranslation.lIIIIlIlIIIllI[0] != 0;
        final Matcher lllllllllllllIlIIlIlllIIIlIlllll = ChatComponentTranslation.stringVariablePattern.matcher(lllllllllllllIlIIlIlllIIIllIIIIl);
        int lllllllllllllIlIIlIlllIIIlIllllI = ChatComponentTranslation.lIIIIlIlIIIllI[0];
        int lllllllllllllIlIIlIlllIIIlIlllIl = ChatComponentTranslation.lIIIIlIlIIIllI[0];
        try {
            "".length();
            if (" ".length() > "   ".length()) {
                return;
            }
            while (!lIlllIIlIlllIIl(lllllllllllllIlIIlIlllIIIlIlllll.find(lllllllllllllIlIIlIlllIIIlIlllIl) ? 1 : 0)) {
                final int lllllllllllllIlIIlIlllIIIlIllIll = lllllllllllllIlIIlIlllIIIlIlllll.start();
                final int lllllllllllllIlIIlIlllIIIlIlllII = lllllllllllllIlIIlIlllIIIlIlllll.end();
                if (lIlllIIlIlllIlI(lllllllllllllIlIIlIlllIIIlIllIll, lllllllllllllIlIIlIlllIIIlIlllIl)) {
                    final ChatComponentText lllllllllllllIlIIlIlllIIIlIllIlI = new ChatComponentText(String.format(lllllllllllllIlIIlIlllIIIllIIIIl.substring(lllllllllllllIlIIlIlllIIIlIlllIl, lllllllllllllIlIIlIlllIIIlIllIll), new Object[ChatComponentTranslation.lIIIIlIlIIIllI[0]]));
                    lllllllllllllIlIIlIlllIIIlIllIlI.getChatStyle().setParentStyle(this.getChatStyle());
                    "".length();
                    this.children.add(lllllllllllllIlIIlIlllIIIlIllIlI);
                    "".length();
                }
                final String lllllllllllllIlIIlIlllIIIlIllIIl = lllllllllllllIlIIlIlllIIIlIlllll.group(ChatComponentTranslation.lIIIIlIlIIIllI[1]);
                final String lllllllllllllIlIIlIlllIIIlIllIII = lllllllllllllIlIIlIlllIIIllIIIIl.substring(lllllllllllllIlIIlIlllIIIlIllIll, lllllllllllllIlIIlIlllIIIlIlllII);
                if (lIlllIIlIllIllI(ChatComponentTranslation.lIIIIlIlIIIIlI[ChatComponentTranslation.lIIIIlIlIIIllI[2]].equals(lllllllllllllIlIIlIlllIIIlIllIIl) ? 1 : 0) && lIlllIIlIllIllI(ChatComponentTranslation.lIIIIlIlIIIIlI[ChatComponentTranslation.lIIIIlIlIIIllI[1]].equals(lllllllllllllIlIIlIlllIIIlIllIII) ? 1 : 0)) {
                    final ChatComponentText lllllllllllllIlIIlIlllIIIlIlIlll = new ChatComponentText(ChatComponentTranslation.lIIIIlIlIIIIlI[ChatComponentTranslation.lIIIIlIlIIIllI[3]]);
                    lllllllllllllIlIIlIlllIIIlIlIlll.getChatStyle().setParentStyle(this.getChatStyle());
                    "".length();
                    this.children.add(lllllllllllllIlIIlIlllIIIlIlIlll);
                    "".length();
                    "".length();
                    if (-" ".length() > "  ".length()) {
                        return;
                    }
                }
                else {
                    if (lIlllIIlIlllIIl(ChatComponentTranslation.lIIIIlIlIIIIlI[ChatComponentTranslation.lIIIIlIlIIIllI[4]].equals(lllllllllllllIlIIlIlllIIIlIllIIl) ? 1 : 0)) {
                        throw new ChatComponentTranslationFormatException(this, String.valueOf(new StringBuilder(ChatComponentTranslation.lIIIIlIlIIIIlI[ChatComponentTranslation.lIIIIlIlIIIllI[5]]).append(lllllllllllllIlIIlIlllIIIlIllIII).append(ChatComponentTranslation.lIIIIlIlIIIIlI[ChatComponentTranslation.lIIIIlIlIIIllI[6]])));
                    }
                    final String lllllllllllllIlIIlIlllIIIlIlIllI = lllllllllllllIlIIlIlllIIIlIlllll.group(ChatComponentTranslation.lIIIIlIlIIIllI[2]);
                    int n;
                    if (lIlllIIlIlllIll(lllllllllllllIlIIlIlllIIIlIlIllI)) {
                        n = Integer.parseInt(lllllllllllllIlIIlIlllIIIlIlIllI) - ChatComponentTranslation.lIIIIlIlIIIllI[2];
                        "".length();
                        if (-"   ".length() >= 0) {
                            return;
                        }
                    }
                    else {
                        n = lllllllllllllIlIIlIlllIIIlIllllI++;
                    }
                    final int lllllllllllllIlIIlIlllIIIlIlIlIl = n;
                    if (lIlllIIlIllllII(lllllllllllllIlIIlIlllIIIlIlIlIl, this.formatArgs.length)) {
                        this.children.add(this.getFormatArgumentAsComponent(lllllllllllllIlIIlIlllIIIlIlIlIl));
                        "".length();
                    }
                }
                lllllllllllllIlIIlIlllIIIlIlllIl = lllllllllllllIlIIlIlllIIIlIlllII;
            }
            if (lIlllIIlIllllII(lllllllllllllIlIIlIlllIIIlIlllIl, lllllllllllllIlIIlIlllIIIllIIIIl.length())) {
                final ChatComponentText lllllllllllllIlIIlIlllIIIlIlIlII = new ChatComponentText(String.format(lllllllllllllIlIIlIlllIIIllIIIIl.substring(lllllllllllllIlIIlIlllIIIlIlllIl), new Object[ChatComponentTranslation.lIIIIlIlIIIllI[0]]));
                lllllllllllllIlIIlIlllIIIlIlIlII.getChatStyle().setParentStyle(this.getChatStyle());
                "".length();
                this.children.add(lllllllllllllIlIIlIlllIIIlIlIlII);
                "".length();
                "".length();
                if ((0x3E ^ 0x12 ^ (0xEE ^ 0xC6)) != (129 + 31 - 106 + 108 ^ 84 + 98 - 46 + 30)) {
                    return;
                }
            }
        }
        catch (IllegalFormatException lllllllllllllIlIIlIlllIIIlIlIIll) {
            throw new ChatComponentTranslationFormatException(this, lllllllllllllIlIIlIlllIIIlIlIIll);
        }
    }
    
    private static boolean lIlllIIlIllIllI(final int lllllllllllllIlIIlIllIlllIIIIIIl) {
        return lllllllllllllIlIIlIllIlllIIIIIIl != 0;
    }
    
    static {
        lIlllIIlIllIlIl();
        lIlllIIlIlIlllI();
        stringVariablePattern = Pattern.compile(ChatComponentTranslation.lIIIIlIlIIIIlI[ChatComponentTranslation.lIIIIlIlIIIllI[0]]);
    }
    
    private static boolean lIlllIIlIlllIll(final Object lllllllllllllIlIIlIllIlllIIlIIll) {
        return lllllllllllllIlIIlIllIlllIIlIIll != null;
    }
    
    private static boolean lIlllIIllIIIIII(final int lllllllllllllIlIIlIllIllIllllIIl) {
        return lllllllllllllIlIIlIllIllIllllIIl > 0;
    }
    
    @Override
    public String getUnformattedTextForChat() {
        this.ensureInitialized();
        final StringBuilder lllllllllllllIlIIlIlllIIIIlIIIIl = new StringBuilder();
        final String lllllllllllllIlIIlIlllIIIIIlllII = (String)this.children.iterator();
        "".length();
        if (-" ".length() > -" ".length()) {
            return null;
        }
        while (!lIlllIIlIlllIIl(((Iterator)lllllllllllllIlIIlIlllIIIIIlllII).hasNext() ? 1 : 0)) {
            final IChatComponent lllllllllllllIlIIlIlllIIIIlIIIII = ((Iterator<IChatComponent>)lllllllllllllIlIIlIlllIIIIIlllII).next();
            lllllllllllllIlIIlIlllIIIIlIIIIl.append(lllllllllllllIlIIlIlllIIIIlIIIII.getUnformattedTextForChat());
            "".length();
        }
        return String.valueOf(lllllllllllllIlIIlIlllIIIIlIIIIl);
    }
    
    private static int lIlllIIlIlllIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public int hashCode() {
        int lllllllllllllIlIIlIlllIIIIIIIIII = super.hashCode();
        lllllllllllllIlIIlIlllIIIIIIIIII = ChatComponentTranslation.lIIIIlIlIIIllI[8] * lllllllllllllIlIIlIlllIIIIIIIIII + this.key.hashCode();
        lllllllllllllIlIIlIlllIIIIIIIIII = ChatComponentTranslation.lIIIIlIlIIIllI[8] * lllllllllllllIlIIlIlllIIIIIIIIII + Arrays.hashCode(this.formatArgs);
        return lllllllllllllIlIIlIlllIIIIIIIIII;
    }
    
    private static String lIlllIIlIIlIlll(final String lllllllllllllIlIIlIllIlllllIlIll, final String lllllllllllllIlIIlIllIlllllIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIllIlllllIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIllIlllllIlIlI.getBytes(StandardCharsets.UTF_8)), ChatComponentTranslation.lIIIIlIlIIIllI[9]), "DES");
            final Cipher lllllllllllllIlIIlIllIlllllIllIl = Cipher.getInstance("DES");
            lllllllllllllIlIIlIllIlllllIllIl.init(ChatComponentTranslation.lIIIIlIlIIIllI[1], lllllllllllllIlIIlIllIlllllIlllI);
            return new String(lllllllllllllIlIIlIllIlllllIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIllIlllllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIllIlllllIllII) {
            lllllllllllllIlIIlIllIlllllIllII.printStackTrace();
            return null;
        }
    }
    
    public ChatComponentTranslation(final String lllllllllllllIlIIlIlllIIlIIIIIlI, final Object... lllllllllllllIlIIlIlllIIlIIIIIIl) {
        this.syncLock = new Object();
        this.lastTranslationUpdateTimeInMilliseconds = -1L;
        this.children = (List<IChatComponent>)Lists.newArrayList();
        this.key = lllllllllllllIlIIlIlllIIlIIIIIlI;
        this.formatArgs = lllllllllllllIlIIlIlllIIlIIIIIIl;
        final Exception lllllllllllllIlIIlIlllIIIllllIIl = (Exception)lllllllllllllIlIIlIlllIIlIIIIIIl;
        final boolean lllllllllllllIlIIlIlllIIIllllIlI = lllllllllllllIlIIlIlllIIlIIIIIIl.length != 0;
        float lllllllllllllIlIIlIlllIIIllllIll = ChatComponentTranslation.lIIIIlIlIIIllI[0];
        "".length();
        if (-" ".length() == "  ".length()) {
            throw null;
        }
        while (!lIlllIIlIllIlll((int)lllllllllllllIlIIlIlllIIIllllIll, lllllllllllllIlIIlIlllIIIllllIlI ? 1 : 0)) {
            final Object lllllllllllllIlIIlIlllIIlIIIIIII = lllllllllllllIlIIlIlllIIIllllIIl[lllllllllllllIlIIlIlllIIIllllIll];
            if (lIlllIIlIllIllI((lllllllllllllIlIIlIlllIIlIIIIIII instanceof IChatComponent) ? 1 : 0)) {
                ((IChatComponent)lllllllllllllIlIIlIlllIIlIIIIIII).getChatStyle().setParentStyle(this.getChatStyle());
                "".length();
            }
            ++lllllllllllllIlIIlIlllIIIllllIll;
        }
    }
    
    @Override
    public IChatComponent setChatStyle(final ChatStyle lllllllllllllIlIIlIlllIIIIlIlllI) {
        super.setChatStyle(lllllllllllllIlIIlIlllIIIIlIlllI);
        "".length();
        final byte lllllllllllllIlIIlIlllIIIIlIlIlI;
        final boolean lllllllllllllIlIIlIlllIIIIlIlIll = ((Object[])(Object)(lllllllllllllIlIIlIlllIIIIlIlIlI = (byte)this.formatArgs)).length != 0;
        int lllllllllllllIlIIlIlllIIIIlIllII = ChatComponentTranslation.lIIIIlIlIIIllI[0];
        "".length();
        if ((((0x67 ^ 0x6D) & ~(0x10 ^ 0x1A)) ^ (0x1D ^ 0x19)) <= 0) {
            return null;
        }
        while (!lIlllIIlIllIlll(lllllllllllllIlIIlIlllIIIIlIllII, lllllllllllllIlIIlIlllIIIIlIlIll ? 1 : 0)) {
            final Object lllllllllllllIlIIlIlllIIIIllIIIl = lllllllllllllIlIIlIlllIIIIlIlIlI[lllllllllllllIlIIlIlllIIIIlIllII];
            if (lIlllIIlIllIllI((lllllllllllllIlIIlIlllIIIIllIIIl instanceof IChatComponent) ? 1 : 0)) {
                ((IChatComponent)lllllllllllllIlIIlIlllIIIIllIIIl).getChatStyle().setParentStyle(this.getChatStyle());
                "".length();
            }
            ++lllllllllllllIlIIlIlllIIIIlIllII;
        }
        if (lIlllIIllIIIIII(lIlllIIlIllllll(this.lastTranslationUpdateTimeInMilliseconds, -1L))) {
            lllllllllllllIlIIlIlllIIIIlIllII = (int)this.children.iterator();
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
            while (!lIlllIIlIlllIIl(((Iterator)lllllllllllllIlIIlIlllIIIIlIllII).hasNext() ? 1 : 0)) {
                final IChatComponent lllllllllllllIlIIlIlllIIIIllIIII = ((Iterator<IChatComponent>)lllllllllllllIlIIlIlllIIIIlIllII).next();
                lllllllllllllIlIIlIlllIIIIllIIII.getChatStyle().setParentStyle(lllllllllllllIlIIlIlllIIIIlIlllI);
                "".length();
            }
        }
        return this;
    }
    
    @Override
    public Iterator<IChatComponent> iterator() {
        this.ensureInitialized();
        return (Iterator<IChatComponent>)Iterators.concat((Iterator)ChatComponentStyle.createDeepCopyIterator(this.children), (Iterator)ChatComponentStyle.createDeepCopyIterator(this.siblings));
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIlIIlIlllIIIIIIlIII) {
        if (lIlllIIllIIIIIl(this, lllllllllllllIlIIlIlllIIIIIIlIII)) {
            return ChatComponentTranslation.lIIIIlIlIIIllI[2] != 0;
        }
        if (lIlllIIlIlllIIl((lllllllllllllIlIIlIlllIIIIIIlIII instanceof ChatComponentTranslation) ? 1 : 0)) {
            return ChatComponentTranslation.lIIIIlIlIIIllI[0] != 0;
        }
        final ChatComponentTranslation lllllllllllllIlIIlIlllIIIIIIIlll = (ChatComponentTranslation)lllllllllllllIlIIlIlllIIIIIIlIII;
        if (lIlllIIlIllIllI(Arrays.equals(this.formatArgs, lllllllllllllIlIIlIlllIIIIIIIlll.formatArgs) ? 1 : 0) && lIlllIIlIllIllI(this.key.equals(lllllllllllllIlIIlIlllIIIIIIIlll.key) ? 1 : 0) && lIlllIIlIllIllI(super.equals(lllllllllllllIlIIlIlllIIIIIIlIII) ? 1 : 0)) {
            return ChatComponentTranslation.lIIIIlIlIIIllI[2] != 0;
        }
        return ChatComponentTranslation.lIIIIlIlIIIllI[0] != 0;
    }
    
    private static boolean lIlllIIllIIIIIl(final Object lllllllllllllIlIIlIllIlllIIIllIl, final Object lllllllllllllIlIIlIllIlllIIIlIlI) {
        return lllllllllllllIlIIlIllIlllIIIllIl == lllllllllllllIlIIlIllIlllIIIlIlI;
    }
    
    public Object[] getFormatArgs() {
        return this.formatArgs;
    }
}
