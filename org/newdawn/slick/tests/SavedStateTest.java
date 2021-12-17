// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.gui.AbstractComponent;
import java.util.Arrays;
import org.newdawn.slick.Game;
import org.newdawn.slick.SlickException;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import org.newdawn.slick.gui.GUIContext;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SavedState;
import org.newdawn.slick.gui.TextField;
import org.newdawn.slick.gui.ComponentListener;
import org.newdawn.slick.BasicGame;

public class SavedStateTest extends BasicGame implements ComponentListener
{
    private /* synthetic */ TextField name;
    private /* synthetic */ SavedState state;
    private static /* synthetic */ AppGameContainer container;
    private static final /* synthetic */ int[] lllIIIllIllIlI;
    private static final /* synthetic */ String[] lllIIIllIllIII;
    private /* synthetic */ TextField age;
    private /* synthetic */ String nameValue;
    private /* synthetic */ String message;
    private /* synthetic */ int ageValue;
    
    @Override
    public void keyPressed(final int llllllllllllIlIlllllllIlIllIlIIl, final char llllllllllllIlIlllllllIlIllIlIII) {
        if (lIIllllIIIlIIIlI(llllllllllllIlIlllllllIlIllIlIIl, SavedStateTest.lllIIIllIllIlI[1])) {
            System.exit(SavedStateTest.lllIIIllIllIlI[0]);
        }
    }
    
    private static String lIIllllIIIIllIlI(String llllllllllllIlIlllllllIlIIIIIIIl, final String llllllllllllIlIlllllllIIllllllll) {
        llllllllllllIlIlllllllIlIIIIIIIl = new String(Base64.getDecoder().decode(llllllllllllIlIlllllllIlIIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllllllIIllllllIl = new StringBuilder();
        final char[] llllllllllllIlIlllllllIIlllllIll = llllllllllllIlIlllllllIIllllllll.toCharArray();
        int llllllllllllIlIlllllllIIlllllIlI = SavedStateTest.lllIIIllIllIlI[0];
        final Exception llllllllllllIlIlllllllIIllllIIlI = (Object)llllllllllllIlIlllllllIlIIIIIIIl.toCharArray();
        final short llllllllllllIlIlllllllIIllllIIIl = (short)llllllllllllIlIlllllllIIllllIIlI.length;
        byte llllllllllllIlIlllllllIIlllIllll = (byte)SavedStateTest.lllIIIllIllIlI[0];
        while (lIIllllIIIlIIlIl(llllllllllllIlIlllllllIIlllIllll, llllllllllllIlIlllllllIIllllIIIl)) {
            final char llllllllllllIlIlllllllIlIIIIIIll = llllllllllllIlIlllllllIIllllIIlI[llllllllllllIlIlllllllIIlllIllll];
            llllllllllllIlIlllllllIIllllllIl.append((char)(llllllllllllIlIlllllllIlIIIIIIll ^ llllllllllllIlIlllllllIIlllllIll[llllllllllllIlIlllllllIIlllllIlI % llllllllllllIlIlllllllIIlllllIll.length]));
            "".length();
            ++llllllllllllIlIlllllllIIlllllIlI;
            ++llllllllllllIlIlllllllIIlllIllll;
            "".length();
            if (-" ".length() == " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllllllIIllllllIl);
    }
    
    private static boolean lIIllllIIIlIIIll(final Object llllllllllllIlIlllllllIIllIlIlll, final Object llllllllllllIlIlllllllIIllIlIlIl) {
        return llllllllllllIlIlllllllIIllIlIlll == llllllllllllIlIlllllllIIllIlIlIl;
    }
    
    private static void lIIllllIIIIlllll() {
        (lllIIIllIllIII = new String[SavedStateTest.lllIIIllIllIlI[19]])[SavedStateTest.lllIIIllIllIlI[0]] = lIIllllIIIIllIlI("GhcnLRJpJSUpAixWBS0FPQ==", "IvQHv");
        SavedStateTest.lllIIIllIllIII[SavedStateTest.lllIIIllIllIlI[1]] = lIIllllIIIIllIlI("Ax0jCA==", "mrMmD");
        SavedStateTest.lllIIIllIllIII[SavedStateTest.lllIIIllIllIlI[2]] = lIIllllIIIIllIll("Lv4Z3WiX3Pd4sftkeA22EnfcVWVGL4hATJ0ORwaFHmQ=", "umSeK");
        SavedStateTest.lllIIIllIllIII[SavedStateTest.lllIIIllIllIlI[3]] = lIIllllIIIIllIlI("DiMhNiEbMjM=", "zFRBE");
        SavedStateTest.lllIIIllIllIII[SavedStateTest.lllIIIllIllIlI[4]] = lIIllllIIIIlllII("C4e7FzAdIjk=", "DJNuo");
        SavedStateTest.lllIIIllIllIII[SavedStateTest.lllIIIllIllIlI[5]] = lIIllllIIIIllIlI("LQsiAh8FGgoCBww=", "inDcj");
        SavedStateTest.lllIIIllIllIII[SavedStateTest.lllIIIllIllIlI[6]] = lIIllllIIIIllIll("m0ONKl5DNDY=", "CqGQQ");
        SavedStateTest.lllIIIllIllIII[SavedStateTest.lllIIIllIllIlI[12]] = lIIllllIIIIllIll("wVQgZuACnVoz7sCcRgxXYw==", "uXDBt");
        SavedStateTest.lllIIIllIllIII[SavedStateTest.lllIIIllIllIlI[13]] = lIIllllIIIIllIll("fvrTkAZYBjRE6guO12PZOg==", "jFrGW");
        SavedStateTest.lllIIIllIllIII[SavedStateTest.lllIIIllIllIlI[16]] = lIIllllIIIIllIll("JssGgW/w3uI=", "izMcb");
        SavedStateTest.lllIIIllIllIII[SavedStateTest.lllIIIllIllIlI[17]] = lIIllllIIIIlllII("rvIvmOFt5Sg=", "ZWYcQ");
        SavedStateTest.lllIIIllIllIII[SavedStateTest.lllIIIllIllIlI[18]] = lIIllllIIIIllIlI("TG5wLi8FODUMbhg7cBsvGjFwGzoNIDU=", "lTPhN");
    }
    
    public void render(final GameContainer llllllllllllIlIlllllllIlIlllIIII, final Graphics llllllllllllIlIlllllllIlIllIllll) {
        this.name.render(llllllllllllIlIlllllllIlIlllIIII, llllllllllllIlIlllllllIlIllIllll);
        this.age.render(llllllllllllIlIlllllllIlIlllIIII, llllllllllllIlIlllllllIlIllIllll);
        llllllllllllIlIlllllllIlIlllIIII.getDefaultFont().drawString(100.0f, 300.0f, String.valueOf(new StringBuilder().append(SavedStateTest.lllIIIllIllIII[SavedStateTest.lllIIIllIllIlI[12]]).append(this.nameValue)));
        llllllllllllIlIlllllllIlIlllIIII.getDefaultFont().drawString(100.0f, 350.0f, String.valueOf(new StringBuilder().append(SavedStateTest.lllIIIllIllIII[SavedStateTest.lllIIIllIllIlI[13]]).append(this.ageValue)));
        llllllllllllIlIlllllllIlIlllIIII.getDefaultFont().drawString(200.0f, 500.0f, this.message);
    }
    
    private static String lIIllllIIIIllIll(final String llllllllllllIlIlllllllIlIIllllII, final String llllllllllllIlIlllllllIlIIlllIll) {
        try {
            final SecretKeySpec llllllllllllIlIlllllllIlIlIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllllllIlIIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllllllIlIIllllll = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllllllIlIIllllll.init(SavedStateTest.lllIIIllIllIlI[2], llllllllllllIlIlllllllIlIlIIIIIl);
            return new String(llllllllllllIlIlllllllIlIIllllll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllllllIlIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllllllIlIIllllIl) {
            llllllllllllIlIlllllllIlIIllllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllllIIIlIIIlI(final int llllllllllllIlIlllllllIIlllIIlIl, final int llllllllllllIlIlllllllIIlllIIlII) {
        return llllllllllllIlIlllllllIIlllIIlIl == llllllllllllIlIlllllllIIlllIIlII;
    }
    
    @Override
    public void update(final GameContainer llllllllllllIlIlllllllIlIllIllIl, final int llllllllllllIlIlllllllIlIllIllII) throws SlickException {
    }
    
    public static void main(final String[] llllllllllllIlIlllllllIlIllIIlII) {
        try {
            (SavedStateTest.container = new AppGameContainer(new SavedStateTest())).setDisplayMode(SavedStateTest.lllIIIllIllIlI[14], SavedStateTest.lllIIIllIllIlI[15], (boolean)(SavedStateTest.lllIIIllIllIlI[0] != 0));
            SavedStateTest.container.start();
            "".length();
            if ((0x85 ^ 0x81) < (" ".length() & ~" ".length())) {
                return;
            }
        }
        catch (SlickException llllllllllllIlIlllllllIlIllIIlIl) {
            llllllllllllIlIlllllllIlIllIIlIl.printStackTrace();
        }
    }
    
    private static String lIIllllIIIIlllII(final String llllllllllllIlIlllllllIlIIlIIIll, final String llllllllllllIlIlllllllIlIIlIIIII) {
        try {
            final SecretKeySpec llllllllllllIlIlllllllIlIIlIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllllllIlIIlIIIII.getBytes(StandardCharsets.UTF_8)), SavedStateTest.lllIIIllIllIlI[13]), "DES");
            final Cipher llllllllllllIlIlllllllIlIIlIIlIl = Cipher.getInstance("DES");
            llllllllllllIlIlllllllIlIIlIIlIl.init(SavedStateTest.lllIIIllIllIlI[2], llllllllllllIlIlllllllIlIIlIIllI);
            return new String(llllllllllllIlIlllllllIlIIlIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllllllIlIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllllllIlIIlIIlII) {
            llllllllllllIlIlllllllIlIIlIIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllllIIIlIIlIl(final int llllllllllllIlIlllllllIIllIllllI, final int llllllllllllIlIlllllllIIllIlllIl) {
        return llllllllllllIlIlllllllIIllIllllI < llllllllllllIlIlllllllIIllIlllIl;
    }
    
    private static void lIIllllIIIlIIIIl() {
        (lllIIIllIllIlI = new int[20])[0] = ((0xB6 ^ 0x9D) & ~(0x3E ^ 0x15));
        SavedStateTest.lllIIIllIllIlI[1] = " ".length();
        SavedStateTest.lllIIIllIllIlI[2] = "  ".length();
        SavedStateTest.lllIIIllIllIlI[3] = "   ".length();
        SavedStateTest.lllIIIllIllIlI[4] = (18 + 70 + 65 + 34 ^ 72 + 80 - 148 + 187);
        SavedStateTest.lllIIIllIllIlI[5] = (0xF ^ 0xA);
        SavedStateTest.lllIIIllIllIlI[6] = (0xA8 ^ 0xAE);
        SavedStateTest.lllIIIllIllIlI[7] = (0x1A ^ 0x22 ^ (0x5F ^ 0x3));
        SavedStateTest.lllIIIllIllIlI[8] = (0xFFFFE5FD & 0x1B2E);
        SavedStateTest.lllIIIllIllIlI[9] = (122 + 35 - 101 + 80 ^ 94 + 41 + 7 + 14);
        SavedStateTest.lllIIIllIllIlI[10] = 45 + 79 - 21 + 47;
        SavedStateTest.lllIIIllIllIlI[11] = 27 + 191 - 19 + 2;
        SavedStateTest.lllIIIllIllIlI[12] = (0x9D ^ 0x9A);
        SavedStateTest.lllIIIllIllIlI[13] = (0x7D ^ 0x3E ^ (0xC0 ^ 0x8B));
        SavedStateTest.lllIIIllIllIlI[14] = (0xFFFFE32E & 0x1FF1);
        SavedStateTest.lllIIIllIllIlI[15] = (0xFFFFEEDD & 0x137A);
        SavedStateTest.lllIIIllIllIlI[16] = (62 + 10 - 34 + 138 ^ 91 + 180 - 226 + 140);
        SavedStateTest.lllIIIllIllIlI[17] = (0xAD ^ 0xA7);
        SavedStateTest.lllIIIllIllIlI[18] = (0x1D ^ 0x3E ^ (0xEE ^ 0xC6));
        SavedStateTest.lllIIIllIllIlI[19] = (15 + 25 - 24 + 117 ^ 68 + 99 - 119 + 89);
    }
    
    @Override
    public void init(final GameContainer llllllllllllIlIlllllllIlIllllIlI) throws SlickException {
        this.state = new SavedState(SavedStateTest.lllIIIllIllIII[SavedStateTest.lllIIIllIllIlI[3]]);
        this.nameValue = this.state.getString(SavedStateTest.lllIIIllIllIII[SavedStateTest.lllIIIllIllIlI[4]], SavedStateTest.lllIIIllIllIII[SavedStateTest.lllIIIllIllIlI[5]]);
        this.ageValue = (int)this.state.getNumber(SavedStateTest.lllIIIllIllIII[SavedStateTest.lllIIIllIllIlI[6]], 64.0);
        this.name = new TextField(llllllllllllIlIlllllllIlIllllIlI, llllllllllllIlIlllllllIlIllllIlI.getDefaultFont(), SavedStateTest.lllIIIllIllIlI[7], SavedStateTest.lllIIIllIllIlI[7], SavedStateTest.lllIIIllIllIlI[8], SavedStateTest.lllIIIllIllIlI[9], this);
        this.age = new TextField(llllllllllllIlIlllllllIlIllllIlI, llllllllllllIlIlllllllIlIllllIlI.getDefaultFont(), SavedStateTest.lllIIIllIllIlI[7], SavedStateTest.lllIIIllIllIlI[10], SavedStateTest.lllIIIllIllIlI[11], SavedStateTest.lllIIIllIllIlI[9], this);
    }
    
    static {
        lIIllllIIIlIIIIl();
        lIIllllIIIIlllll();
    }
    
    public void componentActivated(final AbstractComponent llllllllllllIlIlllllllIlIlIlIlII) {
        if (lIIllllIIIlIIIll(llllllllllllIlIlllllllIlIlIlIlII, this.name)) {
            this.nameValue = this.name.getText();
            this.state.setString(SavedStateTest.lllIIIllIllIII[SavedStateTest.lllIIIllIllIlI[16]], this.nameValue);
        }
        if (lIIllllIIIlIIIll(llllllllllllIlIlllllllIlIlIlIlII, this.age)) {
            try {
                this.ageValue = Integer.parseInt(this.age.getText());
                this.state.setNumber(SavedStateTest.lllIIIllIllIII[SavedStateTest.lllIIIllIllIlI[17]], this.ageValue);
                "".length();
                if (-" ".length() >= " ".length()) {
                    return;
                }
            }
            catch (NumberFormatException ex) {}
        }
        try {
            this.state.save();
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (Exception llllllllllllIlIlllllllIlIlIllIll) {
            this.message = String.valueOf(new StringBuilder().append(System.currentTimeMillis()).append(SavedStateTest.lllIIIllIllIII[SavedStateTest.lllIIIllIllIlI[18]]));
        }
    }
    
    public SavedStateTest() {
        super(SavedStateTest.lllIIIllIllIII[SavedStateTest.lllIIIllIllIlI[0]]);
        this.nameValue = SavedStateTest.lllIIIllIllIII[SavedStateTest.lllIIIllIllIlI[1]];
        this.ageValue = SavedStateTest.lllIIIllIllIlI[0];
        this.message = SavedStateTest.lllIIIllIllIII[SavedStateTest.lllIIIllIllIlI[2]];
    }
}
