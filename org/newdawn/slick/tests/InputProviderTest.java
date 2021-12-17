// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.command.BasicCommand;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.command.ControllerButtonControl;
import org.newdawn.slick.command.MouseButtonControl;
import org.newdawn.slick.command.ControllerDirectionControl;
import org.newdawn.slick.command.Control;
import org.newdawn.slick.command.KeyControl;
import org.newdawn.slick.GameContainer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.command.InputProvider;
import org.newdawn.slick.command.Command;
import org.newdawn.slick.command.InputProviderListener;
import org.newdawn.slick.BasicGame;

public class InputProviderTest extends BasicGame implements InputProviderListener
{
    private /* synthetic */ Command run;
    private /* synthetic */ Command jump;
    private /* synthetic */ String message;
    private static final /* synthetic */ String[] lIlllIIIIIIIIl;
    private /* synthetic */ Command attack;
    private static final /* synthetic */ int[] lIlllIIIIIllII;
    private /* synthetic */ InputProvider provider;
    
    private static String lIIIIIIIllIlIlII(final String llllllllllllIlllllIlllllIllllIIl, final String llllllllllllIlllllIlllllIlllIllI) {
        try {
            final SecretKeySpec llllllllllllIlllllIlllllIlllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIlllllIlllIllI.getBytes(StandardCharsets.UTF_8)), InputProviderTest.lIlllIIIIIllII[15]), "DES");
            final Cipher llllllllllllIlllllIlllllIllllIll = Cipher.getInstance("DES");
            llllllllllllIlllllIlllllIllllIll.init(InputProviderTest.lIlllIIIIIllII[2], llllllllllllIlllllIlllllIlllllIl);
            return new String(llllllllllllIlllllIlllllIllllIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIlllllIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIlllllIllllIlI) {
            llllllllllllIlllllIlllllIllllIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIIIIllIlllII(final int llllllllllllIlllllIlllllIIlIIlIl, final int llllllllllllIlllllIlllllIIlIIIll) {
        return llllllllllllIlllllIlllllIIlIIlIl < llllllllllllIlllllIlllllIIlIIIll;
    }
    
    private static void lIIIIIIIllIlIlIl() {
        (lIlllIIIIIIIIl = new String[InputProviderTest.lIlllIIIIIllII[15]])[InputProviderTest.lIlllIIIIIllII[0]] = lIIIIIIIllIIIlll("GxcTIjcCCwwhKjYcEXcXNwoX", "RycWC");
        InputProviderTest.lIlllIIIIIIIIl[InputProviderTest.lIlllIIIIIllII[1]] = lIIIIIIIllIIlIII("+cqTkrzoH8c=", "oiMQa");
        InputProviderTest.lIlllIIIIIIIIl[InputProviderTest.lIlllIIIIIllII[2]] = lIIIIIIIllIIlIII("7VVAjsJYDpw=", "iKtYq");
        InputProviderTest.lIlllIIIIIIIIl[InputProviderTest.lIlllIIIIIllII[3]] = lIIIIIIIllIIlIII("zMkzQWZb3xc=", "wDhWy");
        InputProviderTest.lIlllIIIIIIIIl[InputProviderTest.lIlllIIIIIllII[4]] = lIIIIIIIllIIlIII("OuW1HrI8V0o=", "VmcQk");
        InputProviderTest.lIlllIIIIIIIIl[InputProviderTest.lIlllIIIIIllII[10]] = lIIIIIIIllIIIlll("MhYiHB5CJWtPOk5ECwoLFkhnOh1ORDQfDAEBa08ADRE0Ck0AETMbAgxEdkMMDABnCAwPATcOCUIHKAEZEAsrHA==", "bdGom");
        InputProviderTest.lIlllIIIIIIIIl[InputProviderTest.lIlllIIIIIllII[11]] = lIIIIIIIllIIIlll("GAoxPyAtHG5s", "HxTLS");
        InputProviderTest.lIlllIIIIIIIIl[InputProviderTest.lIlllIIIIIllII[12]] = lIIIIIIIllIlIlII("cEyEzRETqD2k6CrlqU+J3g==", "IPuFe");
    }
    
    @Override
    public void update(final GameContainer llllllllllllIlllllIllllllIlIllIl, final int llllllllllllIlllllIllllllIlIllII) {
    }
    
    @Override
    public void init(final GameContainer llllllllllllIlllllIlllllllIIIIII) throws SlickException {
        this.provider = new InputProvider(llllllllllllIlllllIlllllllIIIIII.getInput());
        this.provider.addListener(this);
        this.provider.bindCommand(new KeyControl(InputProviderTest.lIlllIIIIIllII[5]), this.run);
        this.provider.bindCommand(new KeyControl(InputProviderTest.lIlllIIIIIllII[6]), this.run);
        this.provider.bindCommand(new ControllerDirectionControl(InputProviderTest.lIlllIIIIIllII[0], ControllerDirectionControl.LEFT), this.run);
        this.provider.bindCommand(new KeyControl(InputProviderTest.lIlllIIIIIllII[7]), this.jump);
        this.provider.bindCommand(new KeyControl(InputProviderTest.lIlllIIIIIllII[8]), this.jump);
        this.provider.bindCommand(new ControllerDirectionControl(InputProviderTest.lIlllIIIIIllII[0], ControllerDirectionControl.UP), this.jump);
        this.provider.bindCommand(new KeyControl(InputProviderTest.lIlllIIIIIllII[9]), this.attack);
        this.provider.bindCommand(new MouseButtonControl(InputProviderTest.lIlllIIIIIllII[0]), this.attack);
        this.provider.bindCommand(new ControllerButtonControl(InputProviderTest.lIlllIIIIIllII[0], InputProviderTest.lIlllIIIIIllII[1]), this.attack);
    }
    
    static {
        lIIIIIIIllIllIIl();
        lIIIIIIIllIlIlIl();
    }
    
    public void controlPressed(final Command llllllllllllIlllllIllllllIlIIIIl) {
        this.message = String.valueOf(new StringBuilder().append(InputProviderTest.lIlllIIIIIIIIl[InputProviderTest.lIlllIIIIIllII[11]]).append(llllllllllllIlllllIllllllIlIIIIl));
    }
    
    public InputProviderTest() {
        super(InputProviderTest.lIlllIIIIIIIIl[InputProviderTest.lIlllIIIIIllII[0]]);
        this.attack = new BasicCommand(InputProviderTest.lIlllIIIIIIIIl[InputProviderTest.lIlllIIIIIllII[1]]);
        this.jump = new BasicCommand(InputProviderTest.lIlllIIIIIIIIl[InputProviderTest.lIlllIIIIIllII[2]]);
        this.run = new BasicCommand(InputProviderTest.lIlllIIIIIIIIl[InputProviderTest.lIlllIIIIIllII[3]]);
        this.message = InputProviderTest.lIlllIIIIIIIIl[InputProviderTest.lIlllIIIIIllII[4]];
    }
    
    public void render(final GameContainer llllllllllllIlllllIllllllIllIlIl, final Graphics llllllllllllIlllllIllllllIllIIIl) {
        llllllllllllIlllllIllllllIllIIIl.drawString(InputProviderTest.lIlllIIIIIIIIl[InputProviderTest.lIlllIIIIIllII[10]], 10.0f, 50.0f);
        llllllllllllIlllllIllllllIllIIIl.drawString(this.message, 100.0f, 150.0f);
    }
    
    private static String lIIIIIIIllIIIlll(String llllllllllllIlllllIlllllIlIlIllI, final String llllllllllllIlllllIlllllIlIllllI) {
        llllllllllllIlllllIlllllIlIlIllI = (byte)new String(Base64.getDecoder().decode(((String)llllllllllllIlllllIlllllIlIlIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllIlllllIlIlllII = new StringBuilder();
        final char[] llllllllllllIlllllIlllllIlIllIlI = llllllllllllIlllllIlllllIlIllllI.toCharArray();
        int llllllllllllIlllllIlllllIlIllIII = InputProviderTest.lIlllIIIIIllII[0];
        final int llllllllllllIlllllIlllllIlIIlIll = (Object)((String)llllllllllllIlllllIlllllIlIlIllI).toCharArray();
        final byte llllllllllllIlllllIlllllIlIIlIIl = (byte)llllllllllllIlllllIlllllIlIIlIll.length;
        boolean llllllllllllIlllllIlllllIlIIIlll = InputProviderTest.lIlllIIIIIllII[0] != 0;
        while (lIIIIIIIllIlllII(llllllllllllIlllllIlllllIlIIIlll ? 1 : 0, llllllllllllIlllllIlllllIlIIlIIl)) {
            final char llllllllllllIlllllIlllllIllIIIlI = llllllllllllIlllllIlllllIlIIlIll[llllllllllllIlllllIlllllIlIIIlll];
            llllllllllllIlllllIlllllIlIlllII.append((char)(llllllllllllIlllllIlllllIllIIIlI ^ llllllllllllIlllllIlllllIlIllIlI[llllllllllllIlllllIlllllIlIllIII % llllllllllllIlllllIlllllIlIllIlI.length]));
            "".length();
            ++llllllllllllIlllllIlllllIlIllIII;
            ++llllllllllllIlllllIlllllIlIIIlll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllIlllllIlIlllII);
    }
    
    public static void main(final String[] llllllllllllIlllllIllllllIIIlllI) {
        try {
            final AppGameContainer llllllllllllIlllllIllllllIIlIIII = new AppGameContainer(new InputProviderTest());
            llllllllllllIlllllIllllllIIlIIII.setDisplayMode(InputProviderTest.lIlllIIIIIllII[13], InputProviderTest.lIlllIIIIIllII[14], (boolean)(InputProviderTest.lIlllIIIIIllII[0] != 0));
            llllllllllllIlllllIllllllIIlIIII.start();
            "".length();
            if ((0x0 ^ 0x4) < "  ".length()) {
                return;
            }
        }
        catch (SlickException llllllllllllIlllllIllllllIIIllll) {
            llllllllllllIlllllIllllllIIIllll.printStackTrace();
        }
    }
    
    private static String lIIIIIIIllIIlIII(final String llllllllllllIlllllIlllllIIllIIll, final String llllllllllllIlllllIlllllIIllIllI) {
        try {
            final SecretKeySpec llllllllllllIlllllIlllllIIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIlllllIIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllIlllllIIlllIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllllIlllllIIlllIIl.init(InputProviderTest.lIlllIIIIIllII[2], llllllllllllIlllllIlllllIIlllIll);
            return new String(llllllllllllIlllllIlllllIIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIlllllIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIlllllIIlllIII) {
            llllllllllllIlllllIlllllIIlllIII.printStackTrace();
            return null;
        }
    }
    
    public void controlReleased(final Command llllllllllllIlllllIllllllIIlIlIl) {
        this.message = String.valueOf(new StringBuilder().append(InputProviderTest.lIlllIIIIIIIIl[InputProviderTest.lIlllIIIIIllII[12]]).append(llllllllllllIlllllIllllllIIlIlIl));
    }
    
    private static void lIIIIIIIllIllIIl() {
        (lIlllIIIIIllII = new int[16])[0] = ((0x4E ^ 0xF) & ~(0xE0 ^ 0xA1));
        InputProviderTest.lIlllIIIIIllII[1] = " ".length();
        InputProviderTest.lIlllIIIIIllII[2] = "  ".length();
        InputProviderTest.lIlllIIIIIllII[3] = "   ".length();
        InputProviderTest.lIlllIIIIIllII[4] = (46 + 45 + 24 + 18 ^ 124 + 53 - 155 + 107);
        InputProviderTest.lIlllIIIIIllII[5] = 101 + 56 - 124 + 138 + (107 + 22 - 92 + 98) - (123 + 104 - 93 + 35) + (0x3B ^ 0x79);
        InputProviderTest.lIlllIIIIIllII[6] = (0x57 ^ 0x61 ^ (0x95 ^ 0xBD));
        InputProviderTest.lIlllIIIIIllII[7] = 11 + 151 - 18 + 56;
        InputProviderTest.lIlllIIIIIllII[8] = (0x55 ^ 0x44);
        InputProviderTest.lIlllIIIIIllII[9] = (0x4A ^ 0x3C ^ (0x1E ^ 0x51));
        InputProviderTest.lIlllIIIIIllII[10] = (0x40 ^ 0x45);
        InputProviderTest.lIlllIIIIIllII[11] = (0x9E ^ 0xA4 ^ (0x6B ^ 0x57));
        InputProviderTest.lIlllIIIIIllII[12] = (0xFC ^ 0x96 ^ (0xCB ^ 0xA6));
        InputProviderTest.lIlllIIIIIllII[13] = (-(0xFFFFD5D8 & 0x3EF7) & (0xFFFFDFFF & 0x37EF));
        InputProviderTest.lIlllIIIIIllII[14] = (-(0xFFFFFFA6 & 0x797F) & (0xFFFFFB7D & 0x7FFF));
        InputProviderTest.lIlllIIIIIllII[15] = (0x7D ^ 0x9 ^ (0x7 ^ 0x7B));
    }
}
