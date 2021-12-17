// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.event;

import java.util.Arrays;
import com.google.common.collect.Maps;
import java.util.Map;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ClickEvent
{
    private final /* synthetic */ String value;
    private static final /* synthetic */ String[] llIllIIllIlIIl;
    private final /* synthetic */ Action action;
    private static final /* synthetic */ int[] llIllIIlllIlIl;
    
    @Override
    public int hashCode() {
        int llllllllllllIllIIlllIllIllIlIlIl = this.action.hashCode();
        final int n = ClickEvent.llIllIIlllIlIl[4] * llllllllllllIllIIlllIllIllIlIlIl;
        int hashCode;
        if (lIIlIlllIIllllll(this.value)) {
            hashCode = this.value.hashCode();
            "".length();
            if (" ".length() < 0) {
                return (0x74 ^ 0x50) & ~(0xBF ^ 0x9B);
            }
        }
        else {
            hashCode = ClickEvent.llIllIIlllIlIl[1];
        }
        llllllllllllIllIIlllIllIllIlIlIl = n + hashCode;
        return llllllllllllIllIIlllIllIllIlIlIl;
    }
    
    private static boolean lIIlIlllIIlllllI(final Object llllllllllllIllIIlllIllIlIlIIIll, final Object llllllllllllIllIIlllIllIlIlIIIlI) {
        return llllllllllllIllIIlllIllIlIlIIIll == llllllllllllIllIIlllIllIlIlIIIlI;
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder(ClickEvent.llIllIIllIlIIl[ClickEvent.llIllIIlllIlIl[1]]).append(this.action).append(ClickEvent.llIllIIllIlIIl[ClickEvent.llIllIIlllIlIl[0]]).append(this.value).append((char)ClickEvent.llIllIIlllIlIl[2]).append((char)ClickEvent.llIllIIlllIlIl[3]));
    }
    
    public ClickEvent(final Action llllllllllllIllIIlllIllIlllIllll, final String llllllllllllIllIIlllIllIlllIlllI) {
        this.action = llllllllllllIllIIlllIllIlllIllll;
        this.value = llllllllllllIllIIlllIllIlllIlllI;
    }
    
    private static boolean lIIlIlllIlIIIIIl(final int llllllllllllIllIIlllIllIlIIllllI) {
        return llllllllllllIllIIlllIllIlIIllllI == 0;
    }
    
    private static boolean lIIlIlllIlIIIIII(final Object llllllllllllIllIIlllIllIlIlIIlll, final Object llllllllllllIllIIlllIllIlIlIIllI) {
        return llllllllllllIllIIlllIllIlIlIIlll != llllllllllllIllIIlllIllIlIlIIllI;
    }
    
    @Override
    public boolean equals(final Object llllllllllllIllIIlllIllIlllIIIII) {
        if (lIIlIlllIIlllllI(this, llllllllllllIllIIlllIllIlllIIIII)) {
            return ClickEvent.llIllIIlllIlIl[0] != 0;
        }
        if (!lIIlIlllIIllllll(llllllllllllIllIIlllIllIlllIIIII) || !lIIlIlllIIlllllI(this.getClass(), llllllllllllIllIIlllIllIlllIIIII.getClass())) {
            return ClickEvent.llIllIIlllIlIl[1] != 0;
        }
        final ClickEvent llllllllllllIllIIlllIllIllIlllll = (ClickEvent)llllllllllllIllIIlllIllIlllIIIII;
        if (lIIlIlllIlIIIIII(this.action, llllllllllllIllIIlllIllIllIlllll.action)) {
            return ClickEvent.llIllIIlllIlIl[1] != 0;
        }
        if (lIIlIlllIIllllll(this.value)) {
            if (lIIlIlllIlIIIIIl(this.value.equals(llllllllllllIllIIlllIllIllIlllll.value) ? 1 : 0)) {
                return ClickEvent.llIllIIlllIlIl[1] != 0;
            }
        }
        else if (lIIlIlllIIllllll(llllllllllllIllIIlllIllIllIlllll.value)) {
            return ClickEvent.llIllIIlllIlIl[1] != 0;
        }
        return ClickEvent.llIllIIlllIlIl[0] != 0;
    }
    
    private static boolean lIIlIlllIIllllll(final Object llllllllllllIllIIlllIllIlIlIIIII) {
        return llllllllllllIllIIlllIllIlIlIIIII != null;
    }
    
    private static void lIIlIlllIIllllIl() {
        (llIllIIlllIlIl = new int[6])[0] = " ".length();
        ClickEvent.llIllIIlllIlIl[1] = ((0x1 ^ 0xB) & ~(0xA7 ^ 0xAD));
        ClickEvent.llIllIIlllIlIl[2] = (0x80 ^ 0xA7);
        ClickEvent.llIllIIlllIlIl[3] = (0x60 ^ 0x1D);
        ClickEvent.llIllIIlllIlIl[4] = (0x5D ^ 0x43 ^ " ".length());
        ClickEvent.llIllIIlllIlIl[5] = "  ".length();
    }
    
    private static String lIIlIlllIIlIllIl(String llllllllllllIllIIlllIllIllIIIIll, final String llllllllllllIllIIlllIllIllIIIlll) {
        llllllllllllIllIIlllIllIllIIIIll = new String(Base64.getDecoder().decode(llllllllllllIllIIlllIllIllIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIlllIllIllIIIllI = new StringBuilder();
        final char[] llllllllllllIllIIlllIllIllIIIlIl = llllllllllllIllIIlllIllIllIIIlll.toCharArray();
        int llllllllllllIllIIlllIllIllIIIlII = ClickEvent.llIllIIlllIlIl[1];
        final char llllllllllllIllIIlllIllIlIlllllI = (Object)llllllllllllIllIIlllIllIllIIIIll.toCharArray();
        final String llllllllllllIllIIlllIllIlIllllIl = (String)llllllllllllIllIIlllIllIlIlllllI.length;
        float llllllllllllIllIIlllIllIlIllllII = ClickEvent.llIllIIlllIlIl[1];
        while (lIIlIlllIlIIIIlI((int)llllllllllllIllIIlllIllIlIllllII, (int)llllllllllllIllIIlllIllIlIllllIl)) {
            final char llllllllllllIllIIlllIllIllIIlIIl = llllllllllllIllIIlllIllIlIlllllI[llllllllllllIllIIlllIllIlIllllII];
            llllllllllllIllIIlllIllIllIIIllI.append((char)(llllllllllllIllIIlllIllIllIIlIIl ^ llllllllllllIllIIlllIllIllIIIlIl[llllllllllllIllIIlllIllIllIIIlII % llllllllllllIllIIlllIllIllIIIlIl.length]));
            "".length();
            ++llllllllllllIllIIlllIllIllIIIlII;
            ++llllllllllllIllIIlllIllIlIllllII;
            "".length();
            if ((0xA ^ 0xE) <= ((0x90 ^ 0xAB) & ~(0x43 ^ 0x78))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIlllIllIllIIIllI);
    }
    
    static {
        lIIlIlllIIllllIl();
        lIIlIlllIIlIllll();
    }
    
    public String getValue() {
        return this.value;
    }
    
    private static boolean lIIlIlllIlIIIIlI(final int llllllllllllIllIIlllIllIlIlIlIll, final int llllllllllllIllIIlllIllIlIlIlIlI) {
        return llllllllllllIllIIlllIllIlIlIlIll < llllllllllllIllIIlllIllIlIlIlIlI;
    }
    
    private static void lIIlIlllIIlIllll() {
        (llIllIIllIlIIl = new String[ClickEvent.llIllIIlllIlIl[5]])[ClickEvent.llIllIIlllIlIl[1]] = lIIlIlllIIlIllIl("NhYqEgowDCYfFQ4bIAUIGhR+", "uzCqa");
        ClickEvent.llIllIIllIlIIl[ClickEvent.llIllIIlllIlIl[0]] = lIIlIlllIIlIlllI("JiZJaDD5PPhJ9UQ8mUsyPg==", "BgoWi");
    }
    
    public Action getAction() {
        return this.action;
    }
    
    private static String lIIlIlllIIlIlllI(final String llllllllllllIllIIlllIllIlIllIIIl, final String llllllllllllIllIIlllIllIlIllIIlI) {
        try {
            final SecretKeySpec llllllllllllIllIIlllIllIlIllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlllIllIlIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlllIllIlIllIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlllIllIlIllIlIl.init(ClickEvent.llIllIIlllIlIl[5], llllllllllllIllIIlllIllIlIllIllI);
            return new String(llllllllllllIllIIlllIllIlIllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlllIllIlIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlllIllIlIllIlII) {
            llllllllllllIllIIlllIllIlIllIlII.printStackTrace();
            return null;
        }
    }
    
    public enum Action
    {
        private static final /* synthetic */ String[] lIIlIlIllIIIII;
        
        TWITCH_USER_INFO(Action.lIIlIlIllIIIII[Action.lIIlIlIllIIIIl[6]], Action.lIIlIlIllIIIIl[3], Action.lIIlIlIllIIIII[Action.lIIlIlIllIIIIl[7]], (boolean)(Action.lIIlIlIllIIIIl[0] != 0)), 
        RUN_COMMAND(Action.lIIlIlIllIIIII[Action.lIIlIlIllIIIIl[4]], Action.lIIlIlIllIIIIl[2], Action.lIIlIlIllIIIII[Action.lIIlIlIllIIIIl[5]], (boolean)(Action.lIIlIlIllIIIIl[1] != 0)), 
        OPEN_URL(Action.lIIlIlIllIIIII[Action.lIIlIlIllIIIIl[0]], Action.lIIlIlIllIIIIl[0], Action.lIIlIlIllIIIII[Action.lIIlIlIllIIIIl[1]], (boolean)(Action.lIIlIlIllIIIIl[1] != 0));
        
        private static final /* synthetic */ Map<String, Action> nameMapping;
        
        CHANGE_PAGE(Action.lIIlIlIllIIIII[Action.lIIlIlIllIIIIl[10]], Action.lIIlIlIllIIIIl[5], Action.lIIlIlIllIIIII[Action.lIIlIlIllIIIIl[11]], (boolean)(Action.lIIlIlIllIIIIl[1] != 0));
        
        private final /* synthetic */ String canonicalName;
        
        OPEN_FILE(Action.lIIlIlIllIIIII[Action.lIIlIlIllIIIIl[2]], Action.lIIlIlIllIIIIl[1], Action.lIIlIlIllIIIII[Action.lIIlIlIllIIIIl[3]], (boolean)(Action.lIIlIlIllIIIIl[0] != 0));
        
        private final /* synthetic */ boolean allowedInChat;
        private static final /* synthetic */ int[] lIIlIlIllIIIIl;
        
        SUGGEST_COMMAND(Action.lIIlIlIllIIIII[Action.lIIlIlIllIIIIl[8]], Action.lIIlIlIllIIIIl[4], Action.lIIlIlIllIIIII[Action.lIIlIlIllIIIIl[9]], (boolean)(Action.lIIlIlIllIIIIl[1] != 0));
        
        public static Action getValueByCanonicalName(final String lllllllllllllIIllIIlllIllIIlIIlI) {
            return Action.nameMapping.get(lllllllllllllIIllIIlllIllIIlIIlI);
        }
        
        static {
            llIlIIIIllllIlI();
            llIlIIIIllllIII();
            final Action[] enum$VALUES = new Action[Action.lIIlIlIllIIIIl[6]];
            enum$VALUES[Action.lIIlIlIllIIIIl[0]] = Action.OPEN_URL;
            enum$VALUES[Action.lIIlIlIllIIIIl[1]] = Action.OPEN_FILE;
            enum$VALUES[Action.lIIlIlIllIIIIl[2]] = Action.RUN_COMMAND;
            enum$VALUES[Action.lIIlIlIllIIIIl[3]] = Action.TWITCH_USER_INFO;
            enum$VALUES[Action.lIIlIlIllIIIIl[4]] = Action.SUGGEST_COMMAND;
            enum$VALUES[Action.lIIlIlIllIIIIl[5]] = Action.CHANGE_PAGE;
            ENUM$VALUES = enum$VALUES;
            nameMapping = Maps.newHashMap();
            final boolean lllllllllllllIIllIIlllIllIlIIlll;
            final short lllllllllllllIIllIIlllIllIlIlIII = (short)((Action[])(Object)(lllllllllllllIIllIIlllIllIlIIlll = (boolean)(Object)values())).length;
            float lllllllllllllIIllIIlllIllIlIlIIl = Action.lIIlIlIllIIIIl[0];
            "".length();
            if (" ".length() >= "   ".length()) {
                return;
            }
            while (!llIlIIIIllllIll((int)lllllllllllllIIllIIlllIllIlIlIIl, lllllllllllllIIllIIlllIllIlIlIII)) {
                final Action lllllllllllllIIllIIlllIllIlIlIll = lllllllllllllIIllIIlllIllIlIIlll[lllllllllllllIIllIIlllIllIlIlIIl];
                Action.nameMapping.put(lllllllllllllIIllIIlllIllIlIlIll.getCanonicalName(), lllllllllllllIIllIIlllIllIlIlIll);
                "".length();
                ++lllllllllllllIIllIIlllIllIlIlIIl;
            }
        }
        
        private static void llIlIIIIllllIlI() {
            (lIIlIlIllIIIIl = new int[13])[0] = ((0xD4 ^ 0x82) & ~(0xDA ^ 0x8C));
            Action.lIIlIlIllIIIIl[1] = " ".length();
            Action.lIIlIlIllIIIIl[2] = "  ".length();
            Action.lIIlIlIllIIIIl[3] = "   ".length();
            Action.lIIlIlIllIIIIl[4] = (0x78 ^ 0x7C);
            Action.lIIlIlIllIIIIl[5] = (0x55 ^ 0x50);
            Action.lIIlIlIllIIIIl[6] = (133 + 129 - 159 + 39 ^ 82 + 122 - 113 + 45);
            Action.lIIlIlIllIIIIl[7] = (0x3 ^ 0x4);
            Action.lIIlIlIllIIIIl[8] = (0xD ^ 0x5);
            Action.lIIlIlIllIIIIl[9] = (0x4D ^ 0x44);
            Action.lIIlIlIllIIIIl[10] = (0x47 ^ 0x4D);
            Action.lIIlIlIllIIIIl[11] = (0xB6 ^ 0xBD);
            Action.lIIlIlIllIIIIl[12] = (0x9 ^ 0x5);
        }
        
        private static String llIlIIIIlllIllI(final String lllllllllllllIIllIIlllIlIllIIlll, final String lllllllllllllIIllIIlllIlIllIlIII) {
            try {
                final SecretKeySpec lllllllllllllIIllIIlllIlIllIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIlllIlIllIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIllIIlllIlIllIlIll = Cipher.getInstance("Blowfish");
                lllllllllllllIIllIIlllIlIllIlIll.init(Action.lIIlIlIllIIIIl[2], lllllllllllllIIllIIlllIlIllIllII);
                return new String(lllllllllllllIIllIIlllIlIllIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIlllIlIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIllIIlllIlIllIlIlI) {
                lllllllllllllIIllIIlllIlIllIlIlI.printStackTrace();
                return null;
            }
        }
        
        private static void llIlIIIIllllIII() {
            (lIIlIlIllIIIII = new String[Action.lIIlIlIllIIIIl[12]])[Action.lIIlIlIllIIIIl[0]] = llIlIIIIlllIlIl("LCAcCxI2IhU=", "cpYEM");
            Action.lIIlIlIllIIIII[Action.lIIlIlIllIIIIl[1]] = llIlIIIIlllIlIl("BBIoDCYeECE=", "kbMby");
            Action.lIIlIlIllIIIII[Action.lIIlIlIllIIIIl[2]] = llIlIIIIlllIllI("arhDjqEBatyyFNBXsdqRCg==", "uBNyf");
            Action.lIIlIlIllIIIII[Action.lIIlIlIllIIIIl[3]] = llIlIIIIlllIllI("dAc+CYpbzuIiNDHXwSZhXw==", "VBcxL");
            Action.lIIlIlIllIIIII[Action.lIIlIlIllIIIIl[4]] = llIlIIIIlllIllI("KVwE0lEFORLugL/ga5Pzng==", "ZXtnf");
            Action.lIIlIlIllIIIII[Action.lIIlIlIllIIIIl[5]] = llIlIIIIlllIlIl("GiEFCAUHOQY2CAw=", "hTkWf");
            Action.lIIlIlIllIIIII[Action.lIIlIlIllIIIIl[6]] = llIlIIIIlllIllI("2Vjs/wICUx/vOFDDnzrBd2l0bo8zVOG7", "GxYoa");
            Action.lIIlIlIllIIIII[Action.lIIlIlIllIIIIl[7]] = llIlIIIIlllIllI("xZbgcODQnNIzJ683GnV0sPjIzBd332Oc", "WTeCB");
            Action.lIIlIlIllIIIII[Action.lIIlIlIllIIIIl[8]] = llIlIIIIlllIlll("6X4ZSr8wPWFzxW+xg/RxwA==", "ktaCf");
            Action.lIIlIlIllIIIII[Action.lIIlIlIllIIIIl[9]] = llIlIIIIlllIlll("hmFhndRemTCf5g2bgY54uQ==", "LujWm");
            Action.lIIlIlIllIIIII[Action.lIIlIlIllIIIIl[10]] = llIlIIIIlllIllI("jHYSki5w+rOUpjIFDqnU1A==", "afuRR");
            Action.lIIlIlIllIIIII[Action.lIIlIlIllIIIIl[11]] = llIlIIIIlllIllI("DeHAI4F1lt+MNJ0UQ48OYw==", "FefXO");
        }
        
        private static String llIlIIIIlllIlIl(String lllllllllllllIIllIIlllIlIllllllI, final String lllllllllllllIIllIIlllIlIllllIII) {
            lllllllllllllIIllIIlllIlIllllllI = new String(Base64.getDecoder().decode(lllllllllllllIIllIIlllIlIllllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIllIIlllIlIlllllII = new StringBuilder();
            final char[] lllllllllllllIIllIIlllIlIllllIll = lllllllllllllIIllIIlllIlIllllIII.toCharArray();
            int lllllllllllllIIllIIlllIlIllllIlI = Action.lIIlIlIllIIIIl[0];
            final short lllllllllllllIIllIIlllIlIlllIlII = (Object)lllllllllllllIIllIIlllIlIllllllI.toCharArray();
            final double lllllllllllllIIllIIlllIlIlllIIll = lllllllllllllIIllIIlllIlIlllIlII.length;
            short lllllllllllllIIllIIlllIlIlllIIlI = (short)Action.lIIlIlIllIIIIl[0];
            while (llIlIIIIlllllII(lllllllllllllIIllIIlllIlIlllIIlI, (int)lllllllllllllIIllIIlllIlIlllIIll)) {
                final char lllllllllllllIIllIIlllIlIlllllll = lllllllllllllIIllIIlllIlIlllIlII[lllllllllllllIIllIIlllIlIlllIIlI];
                lllllllllllllIIllIIlllIlIlllllII.append((char)(lllllllllllllIIllIIlllIlIlllllll ^ lllllllllllllIIllIIlllIlIllllIll[lllllllllllllIIllIIlllIlIllllIlI % lllllllllllllIIllIIlllIlIllllIll.length]));
                "".length();
                ++lllllllllllllIIllIIlllIlIllllIlI;
                ++lllllllllllllIIllIIlllIlIlllIIlI;
                "".length();
                if (-" ".length() > (0x3B ^ 0x3F)) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIllIIlllIlIlllllII);
        }
        
        public String getCanonicalName() {
            return this.canonicalName;
        }
        
        private Action(final String lllllllllllllIIllIIlllIllIIlllIl, final int lllllllllllllIIllIIlllIllIIlllII, final String lllllllllllllIIllIIlllIllIIllIll, final boolean lllllllllllllIIllIIlllIllIIllIlI) {
            this.canonicalName = lllllllllllllIIllIIlllIllIIllIll;
            this.allowedInChat = lllllllllllllIIllIIlllIllIIllIlI;
        }
        
        private static boolean llIlIIIIllllIll(final int lllllllllllllIIllIIlllIlIlIlIlII, final int lllllllllllllIIllIIlllIlIlIlIIll) {
            return lllllllllllllIIllIIlllIlIlIlIlII >= lllllllllllllIIllIIlllIlIlIlIIll;
        }
        
        public boolean shouldAllowInChat() {
            return this.allowedInChat;
        }
        
        private static String llIlIIIIlllIlll(final String lllllllllllllIIllIIlllIlIlIllIlI, final String lllllllllllllIIllIIlllIlIlIllIll) {
            try {
                final SecretKeySpec lllllllllllllIIllIIlllIlIlIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIlllIlIlIllIll.getBytes(StandardCharsets.UTF_8)), Action.lIIlIlIllIIIIl[8]), "DES");
                final Cipher lllllllllllllIIllIIlllIlIlIllllI = Cipher.getInstance("DES");
                lllllllllllllIIllIIlllIlIlIllllI.init(Action.lIIlIlIllIIIIl[2], lllllllllllllIIllIIlllIlIlIlllll);
                return new String(lllllllllllllIIllIIlllIlIlIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIlllIlIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIllIIlllIlIlIlllIl) {
                lllllllllllllIIllIIlllIlIlIlllIl.printStackTrace();
                return null;
            }
        }
        
        private static boolean llIlIIIIlllllII(final int lllllllllllllIIllIIlllIlIlIlIIII, final int lllllllllllllIIllIIlllIlIlIIllll) {
            return lllllllllllllIIllIIlllIlIlIlIIII < lllllllllllllIIllIIlllIlIlIIllll;
        }
    }
}
