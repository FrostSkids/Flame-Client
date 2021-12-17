// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.realms;

import java.net.Proxy;
import com.google.common.util.concurrent.ListenableFuture;
import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import net.minecraft.util.Session;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.world.WorldSettings;

public class Realms
{
    private static final /* synthetic */ int[] lIIIIIIllIIlIl;
    
    static {
        lIllIlIIlIllIII();
    }
    
    public static int creativeId() {
        return WorldSettings.GameType.CREATIVE.getID();
    }
    
    public static String getName() {
        return Minecraft.getMinecraft().getSession().getUsername();
    }
    
    public static int survivalId() {
        return WorldSettings.GameType.SURVIVAL.getID();
    }
    
    public static void clearResourcePack() {
        Minecraft.getMinecraft().getResourcePackRepository().func_148529_f();
    }
    
    public static void setScreen(final RealmsScreen lllllllllllllIlIlIIIIIlIIlIlIIII) {
        Minecraft.getMinecraft().displayGuiScreen(lllllllllllllIlIlIIIIIlIIlIlIIII.getProxy());
    }
    
    public static String getSessionId() {
        return Minecraft.getMinecraft().getSession().getSessionID();
    }
    
    public static String sessionId() {
        final Session lllllllllllllIlIlIIIIIlIIlIllIIl = Minecraft.getMinecraft().getSession();
        String sessionID;
        if (lIllIlIIlIllIIl(lllllllllllllIlIlIIIIIlIIlIllIIl)) {
            sessionID = null;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        else {
            sessionID = lllllllllllllIlIlIIIIIlIIlIllIIl.getSessionID();
        }
        return sessionID;
    }
    
    public static String uuidToName(final String lllllllllllllIlIlIIIIIlIIlIlIIll) {
        return Minecraft.getMinecraft().getSessionService().fillProfileProperties(new GameProfile(UUIDTypeAdapter.fromString(lllllllllllllIlIlIIIIIlIIlIlIIll), (String)null), (boolean)(Realms.lIIIIIIllIIlIl[0] != 0)).getName();
    }
    
    private static boolean lIllIlIIlIllIIl(final Object lllllllllllllIlIlIIIIIlIIlIIIIIl) {
        return lllllllllllllIlIlIIIIIlIIlIIIIIl == null;
    }
    
    public static boolean isTouchScreen() {
        return Minecraft.getMinecraft().gameSettings.touchscreen;
    }
    
    private static void lIllIlIIlIllIII() {
        (lIIIIIIllIIlIl = new int[1])[0] = ((0x19 ^ 0x4E) & ~(0x67 ^ 0x30));
    }
    
    public static int spectatorId() {
        return WorldSettings.GameType.SPECTATOR.getID();
    }
    
    public static String getGameDirectoryPath() {
        return Minecraft.getMinecraft().mcDataDir.getAbsolutePath();
    }
    
    public static ListenableFuture<Object> downloadResourcePack(final String lllllllllllllIlIlIIIIIlIIlIIIlIl, final String lllllllllllllIlIlIIIIIlIIlIIIlll) {
        final ListenableFuture<Object> lllllllllllllIlIlIIIIIlIIlIIIllI = Minecraft.getMinecraft().getResourcePackRepository().downloadResourcePack(lllllllllllllIlIlIIIIIlIIlIIIlIl, lllllllllllllIlIlIIIIIlIIlIIIlll);
        return lllllllllllllIlIlIIIIIlIIlIIIllI;
    }
    
    public static String userName() {
        final Session lllllllllllllIlIlIIIIIlIIlIlIllI = Minecraft.getMinecraft().getSession();
        String username;
        if (lIllIlIIlIllIIl(lllllllllllllIlIlIIIIIlIIlIlIllI)) {
            username = null;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            username = lllllllllllllIlIlIIIIIlIIlIlIllI.getUsername();
        }
        return username;
    }
    
    public static Proxy getProxy() {
        return Minecraft.getMinecraft().getProxy();
    }
    
    public static void setConnectedToRealms(final boolean lllllllllllllIlIlIIIIIlIIlIIllIl) {
        Minecraft.getMinecraft().func_181537_a(lllllllllllllIlIlIIIIIlIIlIIllIl);
    }
    
    public static String getUUID() {
        return Minecraft.getMinecraft().getSession().getPlayerID();
    }
    
    public static int adventureId() {
        return WorldSettings.GameType.ADVENTURE.getID();
    }
    
    public static long currentTimeMillis() {
        return Minecraft.getSystemTime();
    }
}
