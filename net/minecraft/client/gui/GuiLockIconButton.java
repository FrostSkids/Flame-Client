// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.Minecraft;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class GuiLockIconButton extends GuiButton
{
    private static final /* synthetic */ String[] lIIlIlIIIIlllI;
    private /* synthetic */ boolean field_175231_o;
    private static final /* synthetic */ int[] lIIlIlIIIlIIII;
    
    public boolean func_175230_c() {
        return this.field_175231_o;
    }
    
    private static void llIIllllIllIIlI() {
        (lIIlIlIIIIlllI = new String[GuiLockIconButton.lIIlIlIIIlIIII[2]])[GuiLockIconButton.lIIlIlIIIlIIII[1]] = llIIllllIllIIIl("", "zzFLL");
    }
    
    public GuiLockIconButton(final int lllllllllllllIIllIlIIlllIllllIlI, final int lllllllllllllIIllIlIIlllIlllllIl, final int lllllllllllllIIllIlIIlllIlllllII) {
        super(lllllllllllllIIllIlIIlllIllllIlI, lllllllllllllIIllIlIIlllIlllllIl, lllllllllllllIIllIlIIlllIlllllII, GuiLockIconButton.lIIlIlIIIlIIII[0], GuiLockIconButton.lIIlIlIIIlIIII[0], GuiLockIconButton.lIIlIlIIIIlllI[GuiLockIconButton.lIIlIlIIIlIIII[1]]);
        this.field_175231_o = (GuiLockIconButton.lIIlIlIIIlIIII[1] != 0);
    }
    
    private static boolean llIIllllIllIllI(final int lllllllllllllIIllIlIIlllIIllIllI) {
        return lllllllllllllIIllIlIIlllIIllIllI != 0;
    }
    
    private static void llIIllllIllIlIl() {
        (lIIlIlIIIlIIII = new int[3])[0] = (0xAB ^ 0xBF);
        GuiLockIconButton.lIIlIlIIIlIIII[1] = ((0xCC ^ 0xC1) & ~(0x1F ^ 0x12));
        GuiLockIconButton.lIIlIlIIIlIIII[2] = " ".length();
    }
    
    static {
        llIIllllIllIlIl();
        llIIllllIllIIlI();
    }
    
    public void func_175229_b(final boolean lllllllllllllIIllIlIIlllIlllIIIl) {
        this.field_175231_o = lllllllllllllIIllIlIIlllIlllIIIl;
    }
    
    private static String llIIllllIllIIIl(String lllllllllllllIIllIlIIlllIlIIlIII, final String lllllllllllllIIllIlIIlllIlIIllII) {
        lllllllllllllIIllIlIIlllIlIIlIII = new String(Base64.getDecoder().decode(lllllllllllllIIllIlIIlllIlIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIlIIlllIlIIlIll = new StringBuilder();
        final char[] lllllllllllllIIllIlIIlllIlIIlIlI = lllllllllllllIIllIlIIlllIlIIllII.toCharArray();
        int lllllllllllllIIllIlIIlllIlIIlIIl = GuiLockIconButton.lIIlIlIIIlIIII[1];
        final double lllllllllllllIIllIlIIlllIlIIIIll = (Object)lllllllllllllIIllIlIIlllIlIIlIII.toCharArray();
        final boolean lllllllllllllIIllIlIIlllIlIIIIlI = lllllllllllllIIllIlIIlllIlIIIIll.length != 0;
        long lllllllllllllIIllIlIIlllIlIIIIIl = GuiLockIconButton.lIIlIlIIIlIIII[1];
        while (llIIllllIlllIII((int)lllllllllllllIIllIlIIlllIlIIIIIl, lllllllllllllIIllIlIIlllIlIIIIlI ? 1 : 0)) {
            final char lllllllllllllIIllIlIIlllIlIIlllI = lllllllllllllIIllIlIIlllIlIIIIll[lllllllllllllIIllIlIIlllIlIIIIIl];
            lllllllllllllIIllIlIIlllIlIIlIll.append((char)(lllllllllllllIIllIlIIlllIlIIlllI ^ lllllllllllllIIllIlIIlllIlIIlIlI[lllllllllllllIIllIlIIlllIlIIlIIl % lllllllllllllIIllIlIIlllIlIIlIlI.length]));
            "".length();
            ++lllllllllllllIIllIlIIlllIlIIlIIl;
            ++lllllllllllllIIllIlIIlllIlIIIIIl;
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIlIIlllIlIIlIll);
    }
    
    private static boolean llIIllllIllIlll(final int lllllllllllllIIllIlIIlllIIllllIl, final int lllllllllllllIIllIlIIlllIIllllII) {
        return lllllllllllllIIllIlIIlllIIllllIl >= lllllllllllllIIllIlIIlllIIllllII;
    }
    
    private static boolean llIIllllIlllIIl(final int lllllllllllllIIllIlIIlllIIllIlII) {
        return lllllllllllllIIllIlIIlllIIllIlII == 0;
    }
    
    private static boolean llIIllllIlllIII(final int lllllllllllllIIllIlIIlllIIlllIIl, final int lllllllllllllIIllIlIIlllIIlllIII) {
        return lllllllllllllIIllIlIIlllIIlllIIl < lllllllllllllIIllIlIIlllIIlllIII;
    }
    
    @Override
    public void drawButton(final Minecraft lllllllllllllIIllIlIIlllIllIIlll, final int lllllllllllllIIllIlIIlllIlIllIll, final int lllllllllllllIIllIlIIlllIllIIlIl) {
        if (llIIllllIllIllI(this.visible ? 1 : 0)) {
            lllllllllllllIIllIlIIlllIllIIlll.getTextureManager().bindTexture(GuiButton.buttonTextures);
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            int n;
            if (llIIllllIllIlll(lllllllllllllIIllIlIIlllIlIllIll, this.xPosition) && llIIllllIllIlll(lllllllllllllIIllIlIIlllIllIIlIl, this.yPosition) && llIIllllIlllIII(lllllllllllllIIllIlIIlllIlIllIll, this.xPosition + this.width) && llIIllllIlllIII(lllllllllllllIIllIlIIlllIllIIlIl, this.yPosition + this.height)) {
                n = GuiLockIconButton.lIIlIlIIIlIIII[2];
                "".length();
                if (" ".length() == "  ".length()) {
                    return;
                }
            }
            else {
                n = GuiLockIconButton.lIIlIlIIIlIIII[1];
            }
            final boolean lllllllllllllIIllIlIIlllIllIIlII = n != 0;
            Icon lllllllllllllIIllIlIIlllIlIllllI = null;
            if (llIIllllIllIllI(this.field_175231_o ? 1 : 0)) {
                if (llIIllllIlllIIl(this.enabled ? 1 : 0)) {
                    final Icon lllllllllllllIIllIlIIlllIllIIIll = Icon.LOCKED_DISABLED;
                    "".length();
                    if (((0x34 ^ 0x4C ^ (0xC4 ^ 0x95)) & (0xA8 ^ 0xA4 ^ (0xBC ^ 0x99) ^ -" ".length())) >= (0x30 ^ 0x25 ^ (0x7C ^ 0x6D))) {
                        return;
                    }
                }
                else if (llIIllllIllIllI(lllllllllllllIIllIlIIlllIllIIlII ? 1 : 0)) {
                    final Icon lllllllllllllIIllIlIIlllIllIIIlI = Icon.LOCKED_HOVER;
                    "".length();
                    if (((0x71 ^ 0x34 ^ (0x4E ^ 0x3F)) & (0x2F ^ 0x37 ^ (0x4D ^ 0x61) ^ -" ".length())) != 0x0) {
                        return;
                    }
                }
                else {
                    final Icon lllllllllllllIIllIlIIlllIllIIIIl = Icon.LOCKED;
                    "".length();
                    if ("  ".length() > "  ".length()) {
                        return;
                    }
                }
            }
            else if (llIIllllIlllIIl(this.enabled ? 1 : 0)) {
                final Icon lllllllllllllIIllIlIIlllIllIIIII = Icon.UNLOCKED_DISABLED;
                "".length();
                if (((0x55 ^ 0x1B) & ~(0x0 ^ 0x4E)) != 0x0) {
                    return;
                }
            }
            else if (llIIllllIllIllI(lllllllllllllIIllIlIIlllIllIIlII ? 1 : 0)) {
                final Icon lllllllllllllIIllIlIIlllIlIlllll = Icon.UNLOCKED_HOVER;
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
            }
            else {
                lllllllllllllIIllIlIIlllIlIllllI = Icon.UNLOCKED;
            }
            this.drawTexturedModalRect(this.xPosition, this.yPosition, lllllllllllllIIllIlIIlllIlIllllI.func_178910_a(), lllllllllllllIIllIlIIlllIlIllllI.func_178912_b(), this.width, this.height);
        }
    }
    
    enum Icon
    {
        LOCKED(Icon.lllIlllIlIIllI[Icon.lllIlllIlllIII[0]], Icon.lllIlllIlllIII[0], Icon.lllIlllIlllIII[0], Icon.lllIlllIlllIII[1]);
        
        private final /* synthetic */ int field_178920_h;
        private static final /* synthetic */ String[] lllIlllIlIIllI;
        
        UNLOCKED_DISABLED(Icon.lllIlllIlIIllI[Icon.lllIlllIlllIII[9]], Icon.lllIlllIlllIII[9], Icon.lllIlllIlllIII[7], Icon.lllIlllIlllIII[5]);
        
        private final /* synthetic */ int field_178914_g;
        
        LOCKED_HOVER(Icon.lllIlllIlIIllI[Icon.lllIlllIlllIII[2]], Icon.lllIlllIlllIII[2], Icon.lllIlllIlllIII[0], Icon.lllIlllIlllIII[3]);
        
        private static final /* synthetic */ int[] lllIlllIlllIII;
        
        UNLOCKED(Icon.lllIlllIlIIllI[Icon.lllIlllIlllIII[6]], Icon.lllIlllIlllIII[6], Icon.lllIlllIlllIII[7], Icon.lllIlllIlllIII[1]), 
        LOCKED_DISABLED(Icon.lllIlllIlIIllI[Icon.lllIlllIlllIII[4]], Icon.lllIlllIlllIII[4], Icon.lllIlllIlllIII[0], Icon.lllIlllIlllIII[5]), 
        UNLOCKED_HOVER(Icon.lllIlllIlIIllI[Icon.lllIlllIlllIII[8]], Icon.lllIlllIlllIII[8], Icon.lllIlllIlllIII[7], Icon.lllIlllIlllIII[3]);
        
        private static void lIlIIlIlllIlIIII() {
            (lllIlllIlllIII = new int[12])[0] = ((0x65 ^ 0x5F) & ~(0x58 ^ 0x62));
            Icon.lllIlllIlllIII[1] = (0xC7 ^ 0x8E) + (0xB5 ^ 0xC2) - (0x2 ^ 0x33) + "   ".length();
            Icon.lllIlllIlllIII[2] = " ".length();
            Icon.lllIlllIlllIII[3] = 145 + 114 - 198 + 101 + (0x95 ^ 0xBD) - (0xCF ^ 0xA2) + (0xE1 ^ 0xA8);
            Icon.lllIlllIlllIII[4] = "  ".length();
            Icon.lllIlllIlllIII[5] = 47 + 2 + 62 + 73 + (0x7D ^ 0x6D) - (102 + 8 - 20 + 44) + (0x2E ^ 0x56);
            Icon.lllIlllIlllIII[6] = "   ".length();
            Icon.lllIlllIlllIII[7] = (39 + 43 + 28 + 98 ^ 62 + 178 - 171 + 127);
            Icon.lllIlllIlllIII[8] = (0x34 ^ 0xB ^ (0x90 ^ 0xAB));
            Icon.lllIlllIlllIII[9] = (0x8 ^ 0x15 ^ (0x40 ^ 0x58));
            Icon.lllIlllIlllIII[10] = (0x43 ^ 0x14 ^ (0x5A ^ 0xB));
            Icon.lllIlllIlllIII[11] = (0x7F ^ 0x2E ^ (0x55 ^ 0xC));
        }
        
        private Icon(final String llllllllllllIlIllIIIIIlIlllIllll, final int llllllllllllIlIllIIIIIlIlllIlllI, final int llllllllllllIlIllIIIIIlIllllIIlI, final int llllllllllllIlIllIIIIIlIllllIIIl) {
            this.field_178914_g = llllllllllllIlIllIIIIIlIllllIIlI;
            this.field_178920_h = llllllllllllIlIllIIIIIlIllllIIIl;
        }
        
        private static void lIlIIlIllIllIllI() {
            (lllIlllIlIIllI = new String[Icon.lllIlllIlllIII[10]])[Icon.lllIlllIlllIII[0]] = lIlIIlIllIllIIlI("iCC6dQj5Wks=", "HxDIw");
            Icon.lllIlllIlIIllI[Icon.lllIlllIlllIII[2]] = lIlIIlIllIllIIlI("g8oL9JJ9dVnAIJQ0ytJlFQ==", "WVjfK");
            Icon.lllIlllIlIIllI[Icon.lllIlllIlllIII[4]] = lIlIIlIllIllIlII("kJUOMuEUphhKzarQXuHCmg==", "iVQvB");
            Icon.lllIlllIlIIllI[Icon.lllIlllIlllIII[6]] = lIlIIlIllIllIlIl("FwoGCiwJAQ4=", "BDJEo");
            Icon.lllIlllIlIIllI[Icon.lllIlllIlllIII[8]] = lIlIIlIllIllIlIl("PDg4Ii4iMzAyJSYgMT8=", "ivtmm");
            Icon.lllIlllIlIIllI[Icon.lllIlllIlllIII[9]] = lIlIIlIllIllIlIl("AwEVJSUdCh01Ih8cGCgqEws=", "VOYjf");
        }
        
        private static String lIlIIlIllIllIIlI(final String llllllllllllIlIllIIIIIlIllIlIllI, final String llllllllllllIlIllIIIIIlIllIlIIll) {
            try {
                final SecretKeySpec llllllllllllIlIllIIIIIlIllIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIIIlIllIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlIllIIIIIlIllIllIII = Cipher.getInstance("Blowfish");
                llllllllllllIlIllIIIIIlIllIllIII.init(Icon.lllIlllIlllIII[4], llllllllllllIlIllIIIIIlIllIllIIl);
                return new String(llllllllllllIlIllIIIIIlIllIllIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIIIlIllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIllIIIIIlIllIlIlll) {
                llllllllllllIlIllIIIIIlIllIlIlll.printStackTrace();
                return null;
            }
        }
        
        static {
            lIlIIlIlllIlIIII();
            lIlIIlIllIllIllI();
            final Icon[] enum$VALUES = new Icon[Icon.lllIlllIlllIII[10]];
            enum$VALUES[Icon.lllIlllIlllIII[0]] = Icon.LOCKED;
            enum$VALUES[Icon.lllIlllIlllIII[2]] = Icon.LOCKED_HOVER;
            enum$VALUES[Icon.lllIlllIlllIII[4]] = Icon.LOCKED_DISABLED;
            enum$VALUES[Icon.lllIlllIlllIII[6]] = Icon.UNLOCKED;
            enum$VALUES[Icon.lllIlllIlllIII[8]] = Icon.UNLOCKED_HOVER;
            enum$VALUES[Icon.lllIlllIlllIII[9]] = Icon.UNLOCKED_DISABLED;
            ENUM$VALUES = enum$VALUES;
        }
        
        public int func_178912_b() {
            return this.field_178920_h;
        }
        
        private static String lIlIIlIllIllIlII(final String llllllllllllIlIllIIIIIlIlIlIIllI, final String llllllllllllIlIllIIIIIlIlIlIIlII) {
            try {
                final SecretKeySpec llllllllllllIlIllIIIIIlIlIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIIIlIlIlIIlII.getBytes(StandardCharsets.UTF_8)), Icon.lllIlllIlllIII[11]), "DES");
                final Cipher llllllllllllIlIllIIIIIlIlIlIlIlI = Cipher.getInstance("DES");
                llllllllllllIlIllIIIIIlIlIlIlIlI.init(Icon.lllIlllIlllIII[4], llllllllllllIlIllIIIIIlIlIlIlIll);
                return new String(llllllllllllIlIllIIIIIlIlIlIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIIIlIlIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIllIIIIIlIlIlIlIIl) {
                llllllllllllIlIllIIIIIlIlIlIlIIl.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIlIIlIlllIlIllI(final int llllllllllllIlIllIIIIIlIlIIllIII, final int llllllllllllIlIllIIIIIlIlIIlIlll) {
            return llllllllllllIlIllIIIIIlIlIIllIII < llllllllllllIlIllIIIIIlIlIIlIlll;
        }
        
        private static String lIlIIlIllIllIlIl(String llllllllllllIlIllIIIIIlIllIIIIIl, final String llllllllllllIlIllIIIIIlIllIIIIII) {
            llllllllllllIlIllIIIIIlIllIIIIIl = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllIIIIIlIllIIIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlIllIIIIIlIllIIIlII = new StringBuilder();
            final char[] llllllllllllIlIllIIIIIlIllIIIIll = llllllllllllIlIllIIIIIlIllIIIIII.toCharArray();
            int llllllllllllIlIllIIIIIlIllIIIIlI = Icon.lllIlllIlllIII[0];
            final int llllllllllllIlIllIIIIIlIlIlllIlI = (Object)((String)llllllllllllIlIllIIIIIlIllIIIIIl).toCharArray();
            final long llllllllllllIlIllIIIIIlIlIlllIIl = llllllllllllIlIllIIIIIlIlIlllIlI.length;
            short llllllllllllIlIllIIIIIlIlIlllIII = (short)Icon.lllIlllIlllIII[0];
            while (lIlIIlIlllIlIllI(llllllllllllIlIllIIIIIlIlIlllIII, (int)llllllllllllIlIllIIIIIlIlIlllIIl)) {
                final char llllllllllllIlIllIIIIIlIllIIIlll = llllllllllllIlIllIIIIIlIlIlllIlI[llllllllllllIlIllIIIIIlIlIlllIII];
                llllllllllllIlIllIIIIIlIllIIIlII.append((char)(llllllllllllIlIllIIIIIlIllIIIlll ^ llllllllllllIlIllIIIIIlIllIIIIll[llllllllllllIlIllIIIIIlIllIIIIlI % llllllllllllIlIllIIIIIlIllIIIIll.length]));
                "".length();
                ++llllllllllllIlIllIIIIIlIllIIIIlI;
                ++llllllllllllIlIllIIIIIlIlIlllIII;
                "".length();
                if ((0x7E ^ 0x7A) == 0x0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlIllIIIIIlIllIIIlII);
        }
        
        public int func_178910_a() {
            return this.field_178914_g;
        }
    }
}
