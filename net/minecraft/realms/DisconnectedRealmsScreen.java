// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.realms;

import java.util.Iterator;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.IChatComponent;
import java.util.List;

public class DisconnectedRealmsScreen extends RealmsScreen
{
    private final /* synthetic */ RealmsScreen parent;
    private /* synthetic */ List<String> lines;
    private /* synthetic */ IChatComponent reason;
    private static final /* synthetic */ int[] llIIIlIlllIIlI;
    private static final /* synthetic */ String[] llIIIlIlllIIIl;
    private /* synthetic */ int textHeight;
    private /* synthetic */ String title;
    
    private static void lIIIlIIllIllIlll() {
        (llIIIlIlllIIlI = new int[8])[0] = ((0x5B ^ 0x15) & ~(0x5F ^ 0x11));
        DisconnectedRealmsScreen.llIIIlIlllIIlI[1] = ("  ".length() ^ (0x2C ^ 0x1C));
        DisconnectedRealmsScreen.llIIIlIlllIIlI[2] = "  ".length();
        DisconnectedRealmsScreen.llIIIlIlllIIlI[3] = (0x27 ^ 0x4E ^ (0x3D ^ 0x30));
        DisconnectedRealmsScreen.llIIIlIlllIIlI[4] = " ".length();
        DisconnectedRealmsScreen.llIIIlIlllIIlI[5] = (-(0xFFFFE119 & 0x5EE7) & (0xFFFFFEBF & 0xAAEBEA));
        DisconnectedRealmsScreen.llIIIlIlllIIlI[6] = (-" ".length() & (-1 & 0xFFFFFF));
        DisconnectedRealmsScreen.llIIIlIlllIIlI[7] = (0x29 ^ 0x21);
    }
    
    private static String lIIIlIIllIllIIll(final String llllllllllllIlllIlIlIlIIlIlIlIIl, final String llllllllllllIlllIlIlIlIIlIlIIllI) {
        try {
            final SecretKeySpec llllllllllllIlllIlIlIlIIlIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIlIlIIlIlIIllI.getBytes(StandardCharsets.UTF_8)), DisconnectedRealmsScreen.llIIIlIlllIIlI[7]), "DES");
            final Cipher llllllllllllIlllIlIlIlIIlIlIlIll = Cipher.getInstance("DES");
            llllllllllllIlllIlIlIlIIlIlIlIll.init(DisconnectedRealmsScreen.llIIIlIlllIIlI[2], llllllllllllIlllIlIlIlIIlIlIllII);
            return new String(llllllllllllIlllIlIlIlIIlIlIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIlIlIIlIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIlIlIIlIlIlIlI) {
            llllllllllllIlllIlIlIlIIlIlIlIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void render(final int llllllllllllIlllIlIlIlIIlIllllII, final int llllllllllllIlllIlIlIlIIlIllIlIl, final float llllllllllllIlllIlIlIlIIlIlllIlI) {
        this.renderBackground();
        this.drawCenteredString(this.title, this.width() / DisconnectedRealmsScreen.llIIIlIlllIIlI[2], this.height() / DisconnectedRealmsScreen.llIIIlIlllIIlI[2] - this.textHeight / DisconnectedRealmsScreen.llIIIlIlllIIlI[2] - this.fontLineHeight() * DisconnectedRealmsScreen.llIIIlIlllIIlI[2], DisconnectedRealmsScreen.llIIIlIlllIIlI[5]);
        int llllllllllllIlllIlIlIlIIlIlllIIl = this.height() / DisconnectedRealmsScreen.llIIIlIlllIIlI[2] - this.textHeight / DisconnectedRealmsScreen.llIIIlIlllIIlI[2];
        if (lIIIlIIllIlllIlI(this.lines)) {
            final short llllllllllllIlllIlIlIlIIlIllIIIl = (short)this.lines.iterator();
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
            while (!lIIIlIIllIlllIIl(((Iterator)llllllllllllIlllIlIlIlIIlIllIIIl).hasNext() ? 1 : 0)) {
                final String llllllllllllIlllIlIlIlIIlIlllIII = ((Iterator<String>)llllllllllllIlllIlIlIlIIlIllIIIl).next();
                this.drawCenteredString(llllllllllllIlllIlIlIlIIlIlllIII, this.width() / DisconnectedRealmsScreen.llIIIlIlllIIlI[2], llllllllllllIlllIlIlIlIIlIlllIIl, DisconnectedRealmsScreen.llIIIlIlllIIlI[6]);
                llllllllllllIlllIlIlIlIIlIlllIIl += this.fontLineHeight();
            }
        }
        super.render(llllllllllllIlllIlIlIlIIlIllllII, llllllllllllIlllIlIlIlIIlIllIlIl, llllllllllllIlllIlIlIlIIlIlllIlI);
    }
    
    private static boolean lIIIlIIllIlllIlI(final Object llllllllllllIlllIlIlIlIIlIIllllI) {
        return llllllllllllIlllIlIlIlIIlIIllllI != null;
    }
    
    private static void lIIIlIIllIllIlIl() {
        (llIIIlIlllIIIl = new String[DisconnectedRealmsScreen.llIIIlIlllIIlI[4]])[DisconnectedRealmsScreen.llIIIlIlllIIlI[0]] = lIIIlIIllIllIIll("cOMiUvnjs6zCbH26ptfu7w==", "OuBHV");
    }
    
    private static boolean lIIIlIIllIlllIII(final int llllllllllllIlllIlIlIlIIlIlIIIIl, final int llllllllllllIlllIlIlIlIIlIlIIIII) {
        return llllllllllllIlllIlIlIlIIlIlIIIIl == llllllllllllIlllIlIlIlIIlIlIIIII;
    }
    
    @Override
    public void buttonClicked(final RealmsButton llllllllllllIlllIlIlIlIIllIIIlIl) {
        if (lIIIlIIllIlllIIl(llllllllllllIlllIlIlIlIIllIIIlIl.id())) {
            Realms.setScreen(this.parent);
        }
    }
    
    static {
        lIIIlIIllIllIlll();
        lIIIlIIllIllIlIl();
    }
    
    public DisconnectedRealmsScreen(final RealmsScreen llllllllllllIlllIlIlIlIIllIlIlll, final String llllllllllllIlllIlIlIlIIllIllIlI, final IChatComponent llllllllllllIlllIlIlIlIIllIllIIl) {
        this.parent = llllllllllllIlllIlIlIlIIllIlIlll;
        this.title = RealmsScreen.getLocalizedString(llllllllllllIlllIlIlIlIIllIllIlI);
        this.reason = llllllllllllIlllIlIlIlIIllIllIIl;
    }
    
    private static boolean lIIIlIIllIlllIIl(final int llllllllllllIlllIlIlIlIIlIIlllII) {
        return llllllllllllIlllIlIlIlIIlIIlllII == 0;
    }
    
    @Override
    public void init() {
        Realms.setConnectedToRealms((boolean)(DisconnectedRealmsScreen.llIIIlIlllIIlI[0] != 0));
        this.buttonsClear();
        this.lines = this.fontSplit(this.reason.getFormattedText(), this.width() - DisconnectedRealmsScreen.llIIIlIlllIIlI[1]);
        this.textHeight = this.lines.size() * this.fontLineHeight();
        this.buttonsAdd(RealmsScreen.newButton(DisconnectedRealmsScreen.llIIIlIlllIIlI[0], this.width() / DisconnectedRealmsScreen.llIIIlIlllIIlI[2] - DisconnectedRealmsScreen.llIIIlIlllIIlI[3], this.height() / DisconnectedRealmsScreen.llIIIlIlllIIlI[2] + this.textHeight / DisconnectedRealmsScreen.llIIIlIlllIIlI[2] + this.fontLineHeight(), RealmsScreen.getLocalizedString(DisconnectedRealmsScreen.llIIIlIlllIIIl[DisconnectedRealmsScreen.llIIIlIlllIIlI[0]])));
    }
    
    @Override
    public void keyPressed(final char llllllllllllIlllIlIlIlIIllIIlllI, final int llllllllllllIlllIlIlIlIIllIIllIl) {
        if (lIIIlIIllIlllIII(llllllllllllIlllIlIlIlIIllIIllIl, DisconnectedRealmsScreen.llIIIlIlllIIlI[4])) {
            Realms.setScreen(this.parent);
        }
    }
}
