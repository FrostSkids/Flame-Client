// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.realms;

import java.lang.reflect.Constructor;
import net.minecraft.client.Minecraft;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraft.client.gui.GuiScreen;

public class RealmsBridge extends RealmsScreen
{
    private /* synthetic */ GuiScreen previousScreen;
    private static final /* synthetic */ String[] lllIIlIIIIlllI;
    private static final /* synthetic */ int[] lllIIlIIIIllll;
    private static final /* synthetic */ Logger LOGGER;
    
    private static boolean lIIllllIllIlIIll(final int llllllllllllIlIlllllIIlllIlllllI, final int llllllllllllIlIlllllIIlllIllllIl) {
        return llllllllllllIlIlllllIIlllIlllllI < llllllllllllIlIlllllIIlllIllllIl;
    }
    
    static {
        lIIllllIllIlIIlI();
        lIIllllIllIlIIIl();
        LOGGER = LogManager.getLogger();
    }
    
    private static void lIIllllIllIlIIlI() {
        (lllIIlIIIIllll = new int[3])[0] = ((108 + 167 - 170 + 81 ^ 80 + 144 - 104 + 60) & (0x63 ^ 0xB ^ (0xE9 ^ 0x8F) ^ -" ".length()));
        RealmsBridge.lllIIlIIIIllll[1] = " ".length();
        RealmsBridge.lllIIlIIIIllll[2] = "  ".length();
    }
    
    private static String lIIllllIllIlIIII(final String llllllllllllIlIlllllIIllllIlllII, final String llllllllllllIlIlllllIIllllIlllIl) {
        try {
            final SecretKeySpec llllllllllllIlIlllllIIlllllIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllllIIllllIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllllIIlllllIIIII = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllllIIlllllIIIII.init(RealmsBridge.lllIIlIIIIllll[2], llllllllllllIlIlllllIIlllllIIIIl);
            return new String(llllllllllllIlIlllllIIlllllIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllllIIllllIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllllIIllllIlllll) {
            llllllllllllIlIlllllIIllllIlllll.printStackTrace();
            return null;
        }
    }
    
    public void switchToRealms(final GuiScreen llllllllllllIlIlllllIIllllllIIlI) {
        this.previousScreen = llllllllllllIlIlllllIIllllllIIlI;
        try {
            final Class<?> forName;
            final Class<?> llllllllllllIlIlllllIIllllllIIIl = forName = Class.forName(RealmsBridge.lllIIlIIIIlllI[RealmsBridge.lllIIlIIIIllll[0]]);
            final Class[] parameterTypes = new Class[RealmsBridge.lllIIlIIIIllll[1]];
            parameterTypes[RealmsBridge.lllIIlIIIIllll[0]] = RealmsScreen.class;
            final Constructor<?> llllllllllllIlIlllllIIllllllIIII = forName.getDeclaredConstructor((Class<?>[])parameterTypes);
            llllllllllllIlIlllllIIllllllIIII.setAccessible((boolean)(RealmsBridge.lllIIlIIIIllll[1] != 0));
            final Constructor<?> constructor = llllllllllllIlIlllllIIllllllIIII;
            final Object[] initargs = new Object[RealmsBridge.lllIIlIIIIllll[1]];
            initargs[RealmsBridge.lllIIlIIIIllll[0]] = this;
            final Object llllllllllllIlIlllllIIlllllIllll = constructor.newInstance(initargs);
            Minecraft.getMinecraft().displayGuiScreen(((RealmsScreen)llllllllllllIlIlllllIIlllllIllll).getProxy());
            "".length();
            if (-(82 + 60 + 10 + 26 ^ 67 + 134 - 72 + 53) >= 0) {
                return;
            }
        }
        catch (Exception llllllllllllIlIlllllIIlllllIlllI) {
            RealmsBridge.LOGGER.error(RealmsBridge.lllIIlIIIIlllI[RealmsBridge.lllIIlIIIIllll[1]], (Throwable)llllllllllllIlIlllllIIlllllIlllI);
        }
    }
    
    private static String lIIllllIllIIllll(String llllllllllllIlIlllllIIllllIIlIIl, final String llllllllllllIlIlllllIIllllIIllIl) {
        llllllllllllIlIlllllIIllllIIlIIl = new String(Base64.getDecoder().decode(llllllllllllIlIlllllIIllllIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllllIIllllIIllII = new StringBuilder();
        final char[] llllllllllllIlIlllllIIllllIIlIll = llllllllllllIlIlllllIIllllIIllIl.toCharArray();
        int llllllllllllIlIlllllIIllllIIlIlI = RealmsBridge.lllIIlIIIIllll[0];
        final String llllllllllllIlIlllllIIllllIIIlII = (Object)llllllllllllIlIlllllIIllllIIlIIl.toCharArray();
        final double llllllllllllIlIlllllIIllllIIIIll = llllllllllllIlIlllllIIllllIIIlII.length;
        float llllllllllllIlIlllllIIllllIIIIlI = RealmsBridge.lllIIlIIIIllll[0];
        while (lIIllllIllIlIIll((int)llllllllllllIlIlllllIIllllIIIIlI, (int)llllllllllllIlIlllllIIllllIIIIll)) {
            final char llllllllllllIlIlllllIIllllIIllll = llllllllllllIlIlllllIIllllIIIlII[llllllllllllIlIlllllIIllllIIIIlI];
            llllllllllllIlIlllllIIllllIIllII.append((char)(llllllllllllIlIlllllIIllllIIllll ^ llllllllllllIlIlllllIIllllIIlIll[llllllllllllIlIlllllIIllllIIlIlI % llllllllllllIlIlllllIIllllIIlIll.length]));
            "".length();
            ++llllllllllllIlIlllllIIllllIIlIlI;
            ++llllllllllllIlIlllllIIllllIIIIlI;
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllllIIllllIIllII);
    }
    
    private static void lIIllllIllIlIIIl() {
        (lllIIlIIIIlllI = new String[RealmsBridge.lllIIlIIIIllll[2]])[RealmsBridge.lllIIlIIIIllll[0]] = lIIllllIllIIllll("JSMrQyYpJicDLGg+IwwnKz8lASIjIjJDGSMtKgA4Cy0vAxglPiMIJQ==", "FLFmK");
        RealmsBridge.lllIIlIIIIlllI[RealmsBridge.lllIIlIIIIllll[1]] = lIIllllIllIlIIII("pReXGWsvnb6pNXYxK1SeJXqsx30Ako9X", "agGow");
    }
    
    @Override
    public void init() {
        Minecraft.getMinecraft().displayGuiScreen(this.previousScreen);
    }
}
