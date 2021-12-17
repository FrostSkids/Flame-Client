// 
// Decompiled by Procyon v0.5.36
// 

package client;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import client.ui.clickgui.ClickGUI;
import net.minecraft.client.gui.GuiScreen;
import client.hud.HudConfigScreen;
import client.event.EventTarget;
import client.event.impl.ClientTick;
import client.ui.SplashProgress;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import client.event.EventManager;
import net.minecraft.client.Minecraft;
import client.mod.ModManager;
import client.hud.mod.HudManager;

public class ClientName
{
    private static /* synthetic */ boolean prevIsKeyDown;
    private static final /* synthetic */ int[] llIIIIIlIIIIll;
    private static /* synthetic */ int savedFOV;
    public static /* synthetic */ ClientName INSTANCE;
    public /* synthetic */ HudManager hudManager;
    public /* synthetic */ ModManager modManager;
    private static final /* synthetic */ String[] llIIIIIIllllIl;
    public /* synthetic */ Minecraft mc;
    public /* synthetic */ String NAMEVER;
    public /* synthetic */ String VERSION;
    public /* synthetic */ String NAME;
    public /* synthetic */ String AUTHOR;
    public /* synthetic */ EventManager eventManager;
    
    public void shutdown() {
        System.out.println(String.valueOf(new StringBuilder(ClientName.llIIIIIIllllIl[ClientName.llIIIIIlIIIIll[7]]).append(this.NAMEVER)));
        EventManager.unregister(this);
    }
    
    private static boolean lIIIIlllIIlIlIII(final int llllllllllllIlllIllllIlIIIlllIll, final int llllllllllllIlllIllllIlIIIlllIlI) {
        return llllllllllllIlllIllllIlIIIlllIll != llllllllllllIlllIllllIlIIIlllIlI;
    }
    
    public ClientName() {
        this.NAME = ClientName.llIIIIIIllllIl[ClientName.llIIIIIlIIIIll[0]];
        this.VERSION = ClientName.llIIIIIIllllIl[ClientName.llIIIIIlIIIIll[1]];
        this.AUTHOR = ClientName.llIIIIIIllllIl[ClientName.llIIIIIlIIIIll[2]];
        this.NAMEVER = String.valueOf(new StringBuilder(String.valueOf(this.NAME)).append(ClientName.llIIIIIIllllIl[ClientName.llIIIIIlIIIIll[3]]).append(this.VERSION));
        this.mc = Minecraft.getMinecraft();
    }
    
    private static boolean lIIIIlllIIlIlIIl(final int llllllllllllIlllIllllIlIIlIIIIIl, final int llllllllllllIlllIllllIlIIlIIIIII) {
        return llllllllllllIlllIllllIlIIlIIIIIl < llllllllllllIlllIllllIlIIlIIIIII;
    }
    
    private static void lIIIIlllIIIllIII() {
        (llIIIIIIllllIl = new String[ClientName.llIIIIIlIIIIll[8]])[ClientName.llIIIIIlIIIIll[0]] = lIIIIlllIIIlIlII("FT0AAzFzEg0HMT0l", "SQanT");
        ClientName.llIIIIIIllllIl[ClientName.llIIIIIlIIIIll[1]] = lIIIIlllIIIlIllI("dYSZUseh9E8=", "RyivN");
        ClientName.llIIIIIIllllIl[ClientName.llIIIIIlIIIIll[2]] = lIIIIlllIIIlIllI("IBlq19xk14rQ9pYqKzqJog==", "TmCZo");
        ClientName.llIIIIIIllllIl[ClientName.llIIIIIlIIIIll[3]] = lIIIIlllIIIlIllI("lGvpiJnZKvc=", "JSJsd");
        ClientName.llIIIIIIllllIl[ClientName.llIIIIIlIIIIll[4]] = lIIIIlllIIIlIlII("Eh83CgwoBTFY", "AkVxx");
        ClientName.llIIIIIIllllIl[ClientName.llIIIIIlIIIIll[5]] = lIIIIlllIIIlIllI("ll/KdCWkp3k=", "TNZdR");
        ClientName.llIIIIIIllllIl[ClientName.llIIIIIlIIIIll[6]] = lIIIIlllIIIlIlII("DQkzKwU6RXduIiAMLicKIgwgJwUpRQk6CjwRDx4=", "NeZNk");
        ClientName.llIIIIIIllllIl[ClientName.llIIIIIlIIIIll[7]] = lIIIIlllIIIlIllI("6dHBEOK/t3LXEbmZkcdP+w==", "snWTq");
    }
    
    private static boolean lIIIIlllIIlIIllI(final int llllllllllllIlllIllllIlIIIlllllI) {
        return llllllllllllIlllIllllIlIIIlllllI != 0;
    }
    
    static {
        lIIIIlllIIlIIlIl();
        lIIIIlllIIIllIII();
        ClientName.INSTANCE = new ClientName();
        ClientName.prevIsKeyDown = (ClientName.llIIIIIlIIIIll[0] != 0);
        ClientName.savedFOV = ClientName.llIIIIIlIIIIll[0];
    }
    
    private static String lIIIIlllIIIlIlII(String llllllllllllIlllIllllIlIIlIlllIl, final String llllllllllllIlllIllllIlIIllIIlIl) {
        llllllllllllIlllIllllIlIIlIlllIl = new String(Base64.getDecoder().decode(llllllllllllIlllIllllIlIIlIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIllllIlIIllIIIll = new StringBuilder();
        final char[] llllllllllllIlllIllllIlIIllIIIIl = llllllllllllIlllIllllIlIIllIIlIl.toCharArray();
        int llllllllllllIlllIllllIlIIlIlllll = ClientName.llIIIIIlIIIIll[0];
        final Exception llllllllllllIlllIllllIlIIlIlIllI = (Object)llllllllllllIlllIllllIlIIlIlllIl.toCharArray();
        final boolean llllllllllllIlllIllllIlIIlIlIlII = llllllllllllIlllIllllIlIIlIlIllI.length != 0;
        double llllllllllllIlllIllllIlIIlIlIIlI = ClientName.llIIIIIlIIIIll[0];
        while (lIIIIlllIIlIlIIl((int)llllllllllllIlllIllllIlIIlIlIIlI, llllllllllllIlllIllllIlIIlIlIlII ? 1 : 0)) {
            final char llllllllllllIlllIllllIlIIllIIlll = llllllllllllIlllIllllIlIIlIlIllI[llllllllllllIlllIllllIlIIlIlIIlI];
            llllllllllllIlllIllllIlIIllIIIll.append((char)(llllllllllllIlllIllllIlIIllIIlll ^ llllllllllllIlllIllllIlIIllIIIIl[llllllllllllIlllIllllIlIIlIlllll % llllllllllllIlllIllllIlIIllIIIIl.length]));
            "".length();
            ++llllllllllllIlllIllllIlIIlIlllll;
            ++llllllllllllIlllIllllIlIIlIlIIlI;
            "".length();
            if (((12 + 195 - 181 + 179 ^ 54 + 22 + 74 + 4) & (0xD2 ^ 0x88 ^ (0x77 ^ 0x7A) ^ -" ".length())) >= " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIllllIlIIllIIIll);
    }
    
    public void init() {
        SplashProgress.setProgresss(ClientName.llIIIIIlIIIIll[1], ClientName.llIIIIIIllllIl[ClientName.llIIIIIlIIIIll[6]]);
    }
    
    private static void lIIIIlllIIlIIlIl() {
        (llIIIIIlIIIIll = new int[9])[0] = ((0x5 ^ 0x5E) & ~(0x65 ^ 0x3E));
        ClientName.llIIIIIlIIIIll[1] = " ".length();
        ClientName.llIIIIIlIIIIll[2] = "  ".length();
        ClientName.llIIIIIlIIIIll[3] = "   ".length();
        ClientName.llIIIIIlIIIIll[4] = (48 + 74 - 26 + 43 ^ 89 + 114 - 73 + 13);
        ClientName.llIIIIIlIIIIll[5] = (0x37 ^ 0x4 ^ (0x4D ^ 0x7B));
        ClientName.llIIIIIlIIIIll[6] = (0x2B ^ 0x7 ^ (0x1D ^ 0x37));
        ClientName.llIIIIIlIIIIll[7] = (0x94 ^ 0x93);
        ClientName.llIIIIIlIIIIll[8] = (118 + 0 + 12 + 59 ^ 163 + 170 - 222 + 70);
    }
    
    @EventTarget
    private void onTick1(final ClientTick llllllllllllIlllIllllIlIlIIIIIll) {
        final boolean llllllllllllIlllIllllIlIlIIIIIlI = Minecraft.getMinecraft().gameSettings.ZOOM.isKeyDown();
        if (lIIIIlllIIlIlIII(ClientName.prevIsKeyDown ? 1 : 0, llllllllllllIlllIllllIlIlIIIIIlI ? 1 : 0)) {
            if (lIIIIlllIIlIIllI(llllllllllllIlllIllllIlIlIIIIIlI ? 1 : 0)) {
                ClientName.savedFOV = (int)Minecraft.getMinecraft().gameSettings.fovSetting;
                Minecraft.getMinecraft().gameSettings.fovSetting = 30.0f;
                Minecraft.getMinecraft().gameSettings.smoothCamera = (ClientName.llIIIIIlIIIIll[1] != 0);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                Minecraft.getMinecraft().gameSettings.fovSetting = (float)ClientName.savedFOV;
                Minecraft.getMinecraft().gameSettings.smoothCamera = (ClientName.llIIIIIlIIIIll[0] != 0);
            }
        }
        ClientName.prevIsKeyDown = llllllllllllIlllIllllIlIlIIIIIlI;
    }
    
    public void startup() {
        this.eventManager = new EventManager();
        this.modManager = new ModManager();
        this.hudManager = new HudManager();
        System.out.println(String.valueOf(new StringBuilder(ClientName.llIIIIIIllllIl[ClientName.llIIIIIlIIIIll[4]]).append(this.NAMEVER).append(ClientName.llIIIIIIllllIl[ClientName.llIIIIIlIIIIll[5]]).append(this.AUTHOR)));
        EventManager.register(this);
    }
    
    @EventTarget
    public void onTick(final ClientTick llllllllllllIlllIllllIlIlIIIIlll) {
        if (lIIIIlllIIlIIllI(this.mc.gameSettings.keyBindSprint.isPressed() ? 1 : 0)) {
            this.modManager.toggleSprint.toggle();
        }
        if (lIIIIlllIIlIIllI(this.mc.gameSettings.HUD_CONFIG.isPressed() ? 1 : 0)) {
            this.mc.displayGuiScreen(new HudConfigScreen());
        }
        if (lIIIIlllIIlIIllI(this.mc.gameSettings.CLICK_GUI.isPressed() ? 1 : 0)) {
            this.mc.displayGuiScreen(new ClickGUI());
        }
    }
    
    private static String lIIIIlllIIIlIllI(final String llllllllllllIlllIllllIlIIlIIIlll, final String llllllllllllIlllIllllIlIIlIIIllI) {
        try {
            final SecretKeySpec llllllllllllIlllIllllIlIIlIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllllIlIIlIIIllI.getBytes(StandardCharsets.UTF_8)), ClientName.llIIIIIlIIIIll[8]), "DES");
            final Cipher llllllllllllIlllIllllIlIIlIIlIll = Cipher.getInstance("DES");
            llllllllllllIlllIllllIlIIlIIlIll.init(ClientName.llIIIIIlIIIIll[2], llllllllllllIlllIllllIlIIlIIllII);
            return new String(llllllllllllIlllIllllIlIIlIIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllllIlIIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllllIlIIlIIlIlI) {
            llllllllllllIlllIllllIlIIlIIlIlI.printStackTrace();
            return null;
        }
    }
}
