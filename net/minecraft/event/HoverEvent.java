// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.event;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.IChatComponent;

public class HoverEvent
{
    private static final /* synthetic */ String[] lIIllllllIIIll;
    private static final /* synthetic */ int[] lIIllllllIIlII;
    private final /* synthetic */ Action action;
    private final /* synthetic */ IChatComponent value;
    
    private static boolean llIllllIllllIIl(final Object lllllllllllllIIlIIlIIIIlIIllIIIl) {
        return lllllllllllllIIlIIlIIIIlIIllIIIl != null;
    }
    
    private static boolean llIllllIllllIll(final int lllllllllllllIIlIIlIIIIlIIlIllll) {
        return lllllllllllllIIlIIlIIIIlIIlIllll == 0;
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIIlIIlIIIIlIlIlIlIl) {
        if (llIllllIllllIII(this, lllllllllllllIIlIIlIIIIlIlIlIlIl)) {
            return HoverEvent.lIIllllllIIlII[0] != 0;
        }
        if (!llIllllIllllIIl(lllllllllllllIIlIIlIIIIlIlIlIlIl) || !llIllllIllllIII(this.getClass(), lllllllllllllIIlIIlIIIIlIlIlIlIl.getClass())) {
            return HoverEvent.lIIllllllIIlII[1] != 0;
        }
        final HoverEvent lllllllllllllIIlIIlIIIIlIlIlIlII = (HoverEvent)lllllllllllllIIlIIlIIIIlIlIlIlIl;
        if (llIllllIllllIlI(this.action, lllllllllllllIIlIIlIIIIlIlIlIlII.action)) {
            return HoverEvent.lIIllllllIIlII[1] != 0;
        }
        if (llIllllIllllIIl(this.value)) {
            if (llIllllIllllIll(this.value.equals(lllllllllllllIIlIIlIIIIlIlIlIlII.value) ? 1 : 0)) {
                return HoverEvent.lIIllllllIIlII[1] != 0;
            }
        }
        else if (llIllllIllllIIl(lllllllllllllIIlIIlIIIIlIlIlIlII.value)) {
            return HoverEvent.lIIllllllIIlII[1] != 0;
        }
        return HoverEvent.lIIllllllIIlII[0] != 0;
    }
    
    @Override
    public int hashCode() {
        int lllllllllllllIIlIIlIIIIlIlIIlIlI = this.action.hashCode();
        final int n = HoverEvent.lIIllllllIIlII[4] * lllllllllllllIIlIIlIIIIlIlIIlIlI;
        int hashCode;
        if (llIllllIllllIIl(this.value)) {
            hashCode = this.value.hashCode();
            "".length();
            if (((0xB8 ^ 0xA5 ^ (0x20 ^ 0x1A)) & (72 + 60 - 81 + 110 ^ 84 + 103 - 166 + 113 ^ -" ".length())) > 0) {
                return (141 + 137 - 133 + 86 ^ 126 + 62 - 159 + 105) & (0x36 ^ 0x23 ^ (0x21 ^ 0x55) ^ -" ".length());
            }
        }
        else {
            hashCode = HoverEvent.lIIllllllIIlII[1];
        }
        lllllllllllllIIlIIlIIIIlIlIIlIlI = n + hashCode;
        return lllllllllllllIIlIIlIIIIlIlIIlIlI;
    }
    
    private static void llIllllIlllIllI() {
        (lIIllllllIIIll = new String[HoverEvent.lIIllllllIIlII[5]])[HoverEvent.lIIllllllIIlII[1]] = llIllllIlllIlIl("c1ACT2V9orNC17YS8W+tIwtDC7NGnt0Y", "tNAZC");
        HoverEvent.lIIllllllIIIll[HoverEvent.lIIllllllIIlII[0]] = llIllllIlllIlIl("OrJq+lJk1/SICAMoejcLWg==", "cDRaV");
    }
    
    public Action getAction() {
        return this.action;
    }
    
    private static String llIllllIlllIlIl(final String lllllllllllllIIlIIlIIIIlIlIIIIII, final String lllllllllllllIIlIIlIIIIlIIllllIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIIlIIIIlIlIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIIIIlIIllllIl.getBytes(StandardCharsets.UTF_8)), HoverEvent.lIIllllllIIlII[6]), "DES");
            final Cipher lllllllllllllIIlIIlIIIIlIlIIIIlI = Cipher.getInstance("DES");
            lllllllllllllIIlIIlIIIIlIlIIIIlI.init(HoverEvent.lIIllllllIIlII[5], lllllllllllllIIlIIlIIIIlIlIIIIll);
            return new String(lllllllllllllIIlIIlIIIIlIlIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIIIIlIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIlIIIIlIlIIIIIl) {
            lllllllllllllIIlIIlIIIIlIlIIIIIl.printStackTrace();
            return null;
        }
    }
    
    public HoverEvent(final Action lllllllllllllIIlIIlIIIIlIllIIIIl, final IChatComponent lllllllllllllIIlIIlIIIIlIllIIIII) {
        this.action = lllllllllllllIIlIIlIIIIlIllIIIIl;
        this.value = lllllllllllllIIlIIlIIIIlIllIIIII;
    }
    
    static {
        llIllllIlllIlll();
        llIllllIlllIllI();
    }
    
    private static void llIllllIlllIlll() {
        (lIIllllllIIlII = new int[7])[0] = " ".length();
        HoverEvent.lIIllllllIIlII[1] = ((0xA6 ^ 0xBB ^ (0x5E ^ 0x7E)) & (0x85 ^ 0xBF ^ (0xB3 ^ 0xB4) ^ -" ".length()));
        HoverEvent.lIIllllllIIlII[2] = (0x4E ^ 0x48 ^ (0x7D ^ 0x5C));
        HoverEvent.lIIllllllIIlII[3] = (0xC1 ^ 0xBC);
        HoverEvent.lIIllllllIIlII[4] = (0xFA ^ 0xB8 ^ (0x39 ^ 0x64));
        HoverEvent.lIIllllllIIlII[5] = "  ".length();
        HoverEvent.lIIllllllIIlII[6] = (0x3D ^ 0x19 ^ (0x84 ^ 0xA8));
    }
    
    public IChatComponent getValue() {
        return this.value;
    }
    
    private static boolean llIllllIllllIlI(final Object lllllllllllllIIlIIlIIIIlIIlllIII, final Object lllllllllllllIIlIIlIIIIlIIllIlll) {
        return lllllllllllllIIlIIlIIIIlIIlllIII != lllllllllllllIIlIIlIIIIlIIllIlll;
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder(HoverEvent.lIIllllllIIIll[HoverEvent.lIIllllllIIlII[1]]).append(this.action).append(HoverEvent.lIIllllllIIIll[HoverEvent.lIIllllllIIlII[0]]).append(this.value).append((char)HoverEvent.lIIllllllIIlII[2]).append((char)HoverEvent.lIIllllllIIlII[3]));
    }
    
    private static boolean llIllllIllllIII(final Object lllllllllllllIIlIIlIIIIlIIllIlII, final Object lllllllllllllIIlIIlIIIIlIIllIIll) {
        return lllllllllllllIIlIIlIIIIlIIllIlII == lllllllllllllIIlIIlIIIIlIIllIIll;
    }
    
    public enum Action
    {
        SHOW_ACHIEVEMENT(Action.llllIIIIIIIII[Action.llllIIIIIIlII[2]], Action.llllIIIIIIlII[1], Action.llllIIIIIIIII[Action.llllIIIIIIlII[3]], (boolean)(Action.llllIIIIIIlII[1] != 0)), 
        SHOW_TEXT(Action.llllIIIIIIIII[Action.llllIIIIIIlII[0]], Action.llllIIIIIIlII[0], Action.llllIIIIIIIII[Action.llllIIIIIIlII[1]], (boolean)(Action.llllIIIIIIlII[1] != 0));
        
        private static final /* synthetic */ int[] llllIIIIIIlII;
        private static final /* synthetic */ Map<String, Action> nameMapping;
        private static final /* synthetic */ String[] llllIIIIIIIII;
        private final /* synthetic */ boolean allowedInChat;
        
        SHOW_ENTITY(Action.llllIIIIIIIII[Action.llllIIIIIIlII[6]], Action.llllIIIIIIlII[3], Action.llllIIIIIIIII[Action.llllIIIIIIlII[7]], (boolean)(Action.llllIIIIIIlII[1] != 0)), 
        SHOW_ITEM(Action.llllIIIIIIIII[Action.llllIIIIIIlII[4]], Action.llllIIIIIIlII[2], Action.llllIIIIIIIII[Action.llllIIIIIIlII[5]], (boolean)(Action.llllIIIIIIlII[1] != 0));
        
        private final /* synthetic */ String canonicalName;
        
        private static void lIlIIllIlIIlIlI() {
            (llllIIIIIIlII = new int[9])[0] = ((0x87 ^ 0xC3) & ~(0xC6 ^ 0x82));
            Action.llllIIIIIIlII[1] = " ".length();
            Action.llllIIIIIIlII[2] = "  ".length();
            Action.llllIIIIIIlII[3] = "   ".length();
            Action.llllIIIIIIlII[4] = (0x3C ^ 0x38);
            Action.llllIIIIIIlII[5] = (0x6 ^ 0x48 ^ (0x6C ^ 0x27));
            Action.llllIIIIIIlII[6] = (0x4D ^ 0x4B);
            Action.llllIIIIIIlII[7] = (0xC6 ^ 0xBB ^ (0x5B ^ 0x21));
            Action.llllIIIIIIlII[8] = (0x28 ^ 0x39 ^ (0x91 ^ 0x88));
        }
        
        public static Action getValueByCanonicalName(final String lllllllllllllIlIlllllIlIllIIIIII) {
            return Action.nameMapping.get(lllllllllllllIlIlllllIlIllIIIIII);
        }
        
        private static String lIlIIllIlIIIIll(final String lllllllllllllIlIlllllIlIlIlIlllI, final String lllllllllllllIlIlllllIlIlIlIllIl) {
            try {
                final SecretKeySpec lllllllllllllIlIlllllIlIlIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllllIlIlIlIllIl.getBytes(StandardCharsets.UTF_8)), Action.llllIIIIIIlII[8]), "DES");
                final Cipher lllllllllllllIlIlllllIlIlIllIIlI = Cipher.getInstance("DES");
                lllllllllllllIlIlllllIlIlIllIIlI.init(Action.llllIIIIIIlII[2], lllllllllllllIlIlllllIlIlIllIIll);
                return new String(lllllllllllllIlIlllllIlIlIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllllIlIlIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlllllIlIlIllIIIl) {
                lllllllllllllIlIlllllIlIlIllIIIl.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIlIIllIlIIllIl(final int lllllllllllllIlIlllllIlIIlllllll, final int lllllllllllllIlIlllllIlIIllllllI) {
            return lllllllllllllIlIlllllIlIIlllllll < lllllllllllllIlIlllllIlIIllllllI;
        }
        
        private static boolean lIlIIllIlIIllII(final int lllllllllllllIlIlllllIlIlIIIIIll, final int lllllllllllllIlIlllllIlIlIIIIIlI) {
            return lllllllllllllIlIlllllIlIlIIIIIll >= lllllllllllllIlIlllllIlIlIIIIIlI;
        }
        
        private static void lIlIIllIlIIIlII() {
            (llllIIIIIIIII = new String[Action.llllIIIIIIlII[8]])[Action.llllIIIIIIlII[0]] = lIlIIllIIllllll("MA4tAgg3AzoB", "cFbUW");
            Action.llllIIIIIIIII[Action.llllIIIIIIlII[1]] = lIlIIllIIllllll("MSEOATk2LBkC", "BIavf");
            Action.llllIIIIIIIII[Action.llllIIIIIIlII[2]] = lIlIIllIlIIIIII("bl7e13iWOX2RtWFtltu19tbSAdrV2bxJ", "Uljke");
            Action.llllIIIIIIIII[Action.llllIIIIIIlII[3]] = lIlIIllIIllllll("JCsaOzw2IB0lBiEmGCkNIw==", "WCuLc");
            Action.llllIIIIIIIII[Action.llllIIIIIIlII[4]] = lIlIIllIIllllll("PgomEwUkFiwJ", "mBiDZ");
            Action.llllIIIIIIIII[Action.llllIIIIIIlII[5]] = lIlIIllIlIIIIII("rRUc20GdEFDhQYtHbDp34w==", "SyLbt");
            Action.llllIIIIIIIII[Action.llllIIIIIIlII[6]] = lIlIIllIlIIIIII("GSn2EET+p5POrp/R0cWs3Q==", "GPcvD");
            Action.llllIIIIIIIII[Action.llllIIIIIIlII[7]] = lIlIIllIlIIIIll("YPWeqEfR0ArCdO4KmJn36A==", "ypCfq");
        }
        
        public boolean shouldAllowInChat() {
            return this.allowedInChat;
        }
        
        private Action(final String lllllllllllllIlIlllllIlIllIIllII, final int lllllllllllllIlIlllllIlIllIIlIll, final String lllllllllllllIlIlllllIlIllIIlIlI, final boolean lllllllllllllIlIlllllIlIllIIlIIl) {
            this.canonicalName = lllllllllllllIlIlllllIlIllIIlIlI;
            this.allowedInChat = lllllllllllllIlIlllllIlIllIIlIIl;
        }
        
        static {
            lIlIIllIlIIlIlI();
            lIlIIllIlIIIlII();
            final Action[] enum$VALUES = new Action[Action.llllIIIIIIlII[4]];
            enum$VALUES[Action.llllIIIIIIlII[0]] = Action.SHOW_TEXT;
            enum$VALUES[Action.llllIIIIIIlII[1]] = Action.SHOW_ACHIEVEMENT;
            enum$VALUES[Action.llllIIIIIIlII[2]] = Action.SHOW_ITEM;
            enum$VALUES[Action.llllIIIIIIlII[3]] = Action.SHOW_ENTITY;
            ENUM$VALUES = enum$VALUES;
            nameMapping = Maps.newHashMap();
            final Exception lllllllllllllIlIlllllIlIllIlIllI;
            final double lllllllllllllIlIlllllIlIllIlIlll = ((Action[])(Object)(lllllllllllllIlIlllllIlIllIlIllI = (Exception)(Object)values())).length;
            float lllllllllllllIlIlllllIlIllIllIII = Action.llllIIIIIIlII[0];
            "".length();
            if (" ".length() == -" ".length()) {
                return;
            }
            while (!lIlIIllIlIIllII((int)lllllllllllllIlIlllllIlIllIllIII, (int)lllllllllllllIlIlllllIlIllIlIlll)) {
                final Action lllllllllllllIlIlllllIlIllIllIlI = lllllllllllllIlIlllllIlIllIlIllI[lllllllllllllIlIlllllIlIllIllIII];
                Action.nameMapping.put(lllllllllllllIlIlllllIlIllIllIlI.getCanonicalName(), lllllllllllllIlIlllllIlIllIllIlI);
                "".length();
                ++lllllllllllllIlIlllllIlIllIllIII;
            }
        }
        
        private static String lIlIIllIlIIIIII(final String lllllllllllllIlIlllllIlIlIlIIIll, final String lllllllllllllIlIlllllIlIlIlIIIlI) {
            try {
                final SecretKeySpec lllllllllllllIlIlllllIlIlIlIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllllIlIlIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIlllllIlIlIlIIlIl = Cipher.getInstance("Blowfish");
                lllllllllllllIlIlllllIlIlIlIIlIl.init(Action.llllIIIIIIlII[2], lllllllllllllIlIlllllIlIlIlIIllI);
                return new String(lllllllllllllIlIlllllIlIlIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllllIlIlIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlllllIlIlIlIIlII) {
                lllllllllllllIlIlllllIlIlIlIIlII.printStackTrace();
                return null;
            }
        }
        
        public String getCanonicalName() {
            return this.canonicalName;
        }
        
        private static String lIlIIllIIllllll(String lllllllllllllIlIlllllIlIlIIIlllI, final String lllllllllllllIlIlllllIlIlIIIllIl) {
            lllllllllllllIlIlllllIlIlIIIlllI = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlllllIlIlIIIlllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIlllllIlIlIIlIIIl = new StringBuilder();
            final char[] lllllllllllllIlIlllllIlIlIIlIIII = lllllllllllllIlIlllllIlIlIIIllIl.toCharArray();
            int lllllllllllllIlIlllllIlIlIIIllll = Action.llllIIIIIIlII[0];
            final float lllllllllllllIlIlllllIlIlIIIlIIl = (Object)((String)lllllllllllllIlIlllllIlIlIIIlllI).toCharArray();
            final short lllllllllllllIlIlllllIlIlIIIlIII = (short)lllllllllllllIlIlllllIlIlIIIlIIl.length;
            Exception lllllllllllllIlIlllllIlIlIIIIlll = (Exception)Action.llllIIIIIIlII[0];
            while (lIlIIllIlIIllIl((int)lllllllllllllIlIlllllIlIlIIIIlll, lllllllllllllIlIlllllIlIlIIIlIII)) {
                final char lllllllllllllIlIlllllIlIlIIlIlII = lllllllllllllIlIlllllIlIlIIIlIIl[lllllllllllllIlIlllllIlIlIIIIlll];
                lllllllllllllIlIlllllIlIlIIlIIIl.append((char)(lllllllllllllIlIlllllIlIlIIlIlII ^ lllllllllllllIlIlllllIlIlIIlIIII[lllllllllllllIlIlllllIlIlIIIllll % lllllllllllllIlIlllllIlIlIIlIIII.length]));
                "".length();
                ++lllllllllllllIlIlllllIlIlIIIllll;
                ++lllllllllllllIlIlllllIlIlIIIIlll;
                "".length();
                if ("   ".length() < "   ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIlllllIlIlIIlIIIl);
        }
    }
}
