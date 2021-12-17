// 
// Decompiled by Procyon v0.5.36
// 

package client.util;

import net.minecraft.util.Session;
import com.mojang.util.UUIDTypeAdapter;
import com.mojang.authlib.AuthenticationService;
import com.mojang.authlib.Agent;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import net.minecraft.client.Minecraft;
import java.util.UUID;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.mojang.authlib.UserAuthentication;

public class SessionChanger
{
    private static /* synthetic */ SessionChanger instance;
    private static final /* synthetic */ int[] lIlIlIIIlIlllI;
    private static final /* synthetic */ String[] lIlIlIIIlIllIl;
    private final /* synthetic */ UserAuthentication auth;
    
    private static String lllIlIlllIlIIll(final String lllllllllllllIIIlIlIlIIIlIIIllII, final String lllllllllllllIIIlIlIlIIIlIIIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlIlIIIlIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlIlIIIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIlIlIIIlIIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIlIlIIIlIIIlllI.init(SessionChanger.lIlIlIIIlIlllI[2], lllllllllllllIIIlIlIlIIIlIIIllll);
            return new String(lllllllllllllIIIlIlIlIIIlIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlIlIIIlIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlIlIIIlIIIllIl) {
            lllllllllllllIIIlIlIlIIIlIIIllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIlIlllIllIII(final int lllllllllllllIIIlIlIlIIIIllIIlll) {
        return lllllllllllllIIIlIlIlIIIIllIIlll != 0;
    }
    
    private SessionChanger() {
        final UUID lllllllllllllIIIlIlIlIIIlIllIIlI = UUID.randomUUID();
        final AuthenticationService lllllllllllllIIIlIlIlIIIlIllIIIl = (AuthenticationService)new YggdrasilAuthenticationService(Minecraft.getMinecraft().getProxy(), lllllllllllllIIIlIlIlIIIlIllIIlI.toString());
        this.auth = lllllllllllllIIIlIlIlIIIlIllIIIl.createUserAuthentication(Agent.MINECRAFT);
        lllllllllllllIIIlIlIlIIIlIllIIIl.createMinecraftSessionService();
        "".length();
    }
    
    public void setUser(final String lllllllllllllIIIlIlIlIIIlIlIIIll, final String lllllllllllllIIIlIlIlIIIlIlIIlll) {
        if (!lllIlIlllIllIII(Minecraft.getMinecraft().getSession().getUsername().equals(lllllllllllllIIIlIlIlIIIlIlIIIll) ? 1 : 0) || lllIlIlllIllIII(Minecraft.getMinecraft().getSession().getToken().equals(SessionChanger.lIlIlIIIlIllIl[SessionChanger.lIlIlIIIlIlllI[0]]) ? 1 : 0)) {
            this.auth.logOut();
            this.auth.setUsername(lllllllllllllIIIlIlIlIIIlIlIIIll);
            this.auth.setPassword(lllllllllllllIIIlIlIlIIIlIlIIlll);
            try {
                this.auth.logIn();
                final Session lllllllllllllIIIlIlIlIIIlIlIIllI = new Session(this.auth.getSelectedProfile().getName(), UUIDTypeAdapter.fromUUID(this.auth.getSelectedProfile().getId()), this.auth.getAuthenticatedToken(), this.auth.getUserType().getName());
                this.setSession(lllllllllllllIIIlIlIlIIIlIlIIllI);
                "".length();
                if (" ".length() < ("   ".length() & ("   ".length() ^ -" ".length()))) {
                    return;
                }
            }
            catch (Exception lllllllllllllIIIlIlIlIIIlIlIIlIl) {
                lllllllllllllIIIlIlIlIIIlIlIIlIl.printStackTrace();
            }
        }
    }
    
    private static boolean lllIlIlllIllIIl(final int lllllllllllllIIIlIlIlIIIIllIllII, final int lllllllllllllIIIlIlIlIIIIllIlIll) {
        return lllllllllllllIIIlIlIlIIIIllIllII < lllllllllllllIIIlIlIlIIIIllIlIll;
    }
    
    public static SessionChanger getInstance() {
        if (lllIlIlllIlIlll(SessionChanger.instance)) {
            SessionChanger.instance = new SessionChanger();
        }
        return SessionChanger.instance;
    }
    
    private static boolean lllIlIlllIlIlll(final Object lllllllllllllIIIlIlIlIIIIllIlIIl) {
        return lllllllllllllIIIlIlIlIIIIllIlIIl == null;
    }
    
    private static void lllIlIlllIlIlIl() {
        (lIlIlIIIlIllIl = new String[SessionChanger.lIlIlIIIlIlllI[3]])[SessionChanger.lIlIlIIIlIlllI[0]] = lllIlIlllIlIIll("6+hDWRQ+4N0=", "xBjsm");
        SessionChanger.lIlIlIIIlIllIl[SessionChanger.lIlIlIIIlIlllI[1]] = lllIlIlllIlIlII("cQ==", "AtHAC");
        SessionChanger.lIlIlIIIlIllIl[SessionChanger.lIlIlIIIlIlllI[2]] = lllIlIlllIlIlII("GwEfGy8O", "wdxzL");
    }
    
    private static void lllIlIlllIlIllI() {
        (lIlIlIIIlIlllI = new int[4])[0] = ((0xE3 ^ 0xA3 ^ (0x89 ^ 0x95)) & (95 + 31 - 2 + 85 ^ 66 + 62 - 127 + 140 ^ -" ".length()));
        SessionChanger.lIlIlIIIlIlllI[1] = " ".length();
        SessionChanger.lIlIlIIIlIlllI[2] = "  ".length();
        SessionChanger.lIlIlIIIlIlllI[3] = "   ".length();
    }
    
    static {
        lllIlIlllIlIllI();
        lllIlIlllIlIlIl();
    }
    
    private void setSession(final Session lllllllllllllIIIlIlIlIIIlIIlllIl) {
        Minecraft.getMinecraft().session = lllllllllllllIIIlIlIlIIIlIIlllIl;
    }
    
    private static String lllIlIlllIlIlII(String lllllllllllllIIIlIlIlIIIIlllIlll, final String lllllllllllllIIIlIlIlIIIIllllIll) {
        lllllllllllllIIIlIlIlIIIIlllIlll = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlIlIlIIIIlllIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIlIlIIIIllllIlI = new StringBuilder();
        final char[] lllllllllllllIIIlIlIlIIIIllllIIl = lllllllllllllIIIlIlIlIIIIllllIll.toCharArray();
        int lllllllllllllIIIlIlIlIIIIllllIII = SessionChanger.lIlIlIIIlIlllI[0];
        final boolean lllllllllllllIIIlIlIlIIIIlllIIlI = (Object)((String)lllllllllllllIIIlIlIlIIIIlllIlll).toCharArray();
        final char lllllllllllllIIIlIlIlIIIIlllIIIl = (char)lllllllllllllIIIlIlIlIIIIlllIIlI.length;
        String lllllllllllllIIIlIlIlIIIIlllIIII = (String)SessionChanger.lIlIlIIIlIlllI[0];
        while (lllIlIlllIllIIl((int)lllllllllllllIIIlIlIlIIIIlllIIII, lllllllllllllIIIlIlIlIIIIlllIIIl)) {
            final char lllllllllllllIIIlIlIlIIIIlllllIl = lllllllllllllIIIlIlIlIIIIlllIIlI[lllllllllllllIIIlIlIlIIIIlllIIII];
            lllllllllllllIIIlIlIlIIIIllllIlI.append((char)(lllllllllllllIIIlIlIlIIIIlllllIl ^ lllllllllllllIIIlIlIlIIIIllllIIl[lllllllllllllIIIlIlIlIIIIllllIII % lllllllllllllIIIlIlIlIIIIllllIIl.length]));
            "".length();
            ++lllllllllllllIIIlIlIlIIIIllllIII;
            ++lllllllllllllIIIlIlIlIIIIlllIIII;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIlIlIIIIllllIlI);
    }
    
    public void setUserOffline(final String lllllllllllllIIIlIlIlIIIlIIlIlIl) {
        this.auth.logOut();
        final Session lllllllllllllIIIlIlIlIIIlIIlIlll = new Session(lllllllllllllIIIlIlIlIIIlIIlIlIl, lllllllllllllIIIlIlIlIIIlIIlIlIl, SessionChanger.lIlIlIIIlIllIl[SessionChanger.lIlIlIIIlIlllI[1]], SessionChanger.lIlIlIIIlIllIl[SessionChanger.lIlIlIIIlIlllI[2]]);
        this.setSession(lllllllllllllIIIlIlIlIIIlIIlIlll);
    }
}
