// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.demo;

import net.minecraft.profiler.Profiler;
import net.minecraft.world.storage.WorldInfo;
import net.minecraft.world.storage.ISaveHandler;
import net.minecraft.server.MinecraftServer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.world.WorldType;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.WorldServer;

public class DemoWorldServer extends WorldServer
{
    public static final /* synthetic */ WorldSettings demoWorldSettings;
    private static final /* synthetic */ int[] lIIIllIIlIllII;
    private static final /* synthetic */ String[] lIIIllIIIIlIlI;
    private static final /* synthetic */ long demoWorldSeed;
    
    private static void llIIIIlIlIlIllI() {
        (lIIIllIIIIlIlI = new String[DemoWorldServer.lIIIllIIlIllII[1]])[DemoWorldServer.lIIIllIIlIllII[0]] = llIIIIlIlIlIlIl("DwAZHQthLAobDC0GBQg=", "Aokic");
    }
    
    static {
        llIIIIllIlllIll();
        llIIIIlIlIlIllI();
        demoWorldSeed = DemoWorldServer.lIIIllIIIIlIlI[DemoWorldServer.lIIIllIIlIllII[0]].hashCode();
        demoWorldSettings = new WorldSettings(DemoWorldServer.demoWorldSeed, WorldSettings.GameType.SURVIVAL, (boolean)(DemoWorldServer.lIIIllIIlIllII[1] != 0), (boolean)(DemoWorldServer.lIIIllIIlIllII[0] != 0), WorldType.DEFAULT).enableBonusChest();
    }
    
    private static String llIIIIlIlIlIlIl(String lllllllllllllIlIIIIIlIIlllllIlIl, final String lllllllllllllIlIIIIIlIIllllllIIl) {
        lllllllllllllIlIIIIIlIIlllllIlIl = new String(Base64.getDecoder().decode(lllllllllllllIlIIIIIlIIlllllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIIlIIllllllIII = new StringBuilder();
        final char[] lllllllllllllIlIIIIIlIIlllllIlll = lllllllllllllIlIIIIIlIIllllllIIl.toCharArray();
        int lllllllllllllIlIIIIIlIIlllllIllI = DemoWorldServer.lIIIllIIlIllII[0];
        final boolean lllllllllllllIlIIIIIlIIlllllIIII = (Object)lllllllllllllIlIIIIIlIIlllllIlIl.toCharArray();
        final String lllllllllllllIlIIIIIlIIllllIllll = (String)lllllllllllllIlIIIIIlIIlllllIIII.length;
        char lllllllllllllIlIIIIIlIIllllIlllI = (char)DemoWorldServer.lIIIllIIlIllII[0];
        while (llIIIIllIllllII(lllllllllllllIlIIIIIlIIllllIlllI, (int)lllllllllllllIlIIIIIlIIllllIllll)) {
            final char lllllllllllllIlIIIIIlIIllllllIll = lllllllllllllIlIIIIIlIIlllllIIII[lllllllllllllIlIIIIIlIIllllIlllI];
            lllllllllllllIlIIIIIlIIllllllIII.append((char)(lllllllllllllIlIIIIIlIIllllllIll ^ lllllllllllllIlIIIIIlIIlllllIlll[lllllllllllllIlIIIIIlIIlllllIllI % lllllllllllllIlIIIIIlIIlllllIlll.length]));
            "".length();
            ++lllllllllllllIlIIIIIlIIlllllIllI;
            ++lllllllllllllIlIIIIIlIIllllIlllI;
            "".length();
            if ((0xF6 ^ 0xC2 ^ (0x1C ^ 0x2C)) < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIIlIIllllllIII);
    }
    
    public DemoWorldServer(final MinecraftServer lllllllllllllIlIIIIIlIlIIIIIllll, final ISaveHandler lllllllllllllIlIIIIIlIlIIIIIlIII, final WorldInfo lllllllllllllIlIIIIIlIlIIIIIIlll, final int lllllllllllllIlIIIIIlIlIIIIIllII, final Profiler lllllllllllllIlIIIIIlIlIIIIIIlIl) {
        super(lllllllllllllIlIIIIIlIlIIIIIllll, lllllllllllllIlIIIIIlIlIIIIIlIII, lllllllllllllIlIIIIIlIlIIIIIIlll, lllllllllllllIlIIIIIlIlIIIIIllII, lllllllllllllIlIIIIIlIlIIIIIIlIl);
        this.worldInfo.populateFromWorldSettings(DemoWorldServer.demoWorldSettings);
    }
    
    private static boolean llIIIIllIllllII(final int lllllllllllllIlIIIIIlIIllllIlIlI, final int lllllllllllllIlIIIIIlIIllllIlIIl) {
        return lllllllllllllIlIIIIIlIIllllIlIlI < lllllllllllllIlIIIIIlIIllllIlIIl;
    }
    
    private static void llIIIIllIlllIll() {
        (lIIIllIIlIllII = new int[2])[0] = ((88 + 25 - 101 + 134 ^ 23 + 152 - 122 + 142) & (0x65 ^ 0xF ^ (0x53 ^ 0x68) ^ -" ".length()));
        DemoWorldServer.lIIIllIIlIllII[1] = " ".length();
    }
}
