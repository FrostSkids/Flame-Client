// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.multiplayer;

import java.util.Iterator;
import com.google.common.collect.Lists;
import org.apache.logging.log4j.LogManager;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.CompressedStreamTools;
import java.io.File;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.Logger;

public class ServerList
{
    private static final /* synthetic */ Logger logger;
    private static final /* synthetic */ int[] lIllllIIIIlllI;
    private final /* synthetic */ Minecraft mc;
    private final /* synthetic */ List<ServerData> servers;
    private static final /* synthetic */ String[] lIllllIIIIllIl;
    
    private static boolean lIIIIIlllllIlIll(final int llllllllllllIllllIlIlllIllIIlIll, final int llllllllllllIllllIlIlllIllIIlIlI) {
        return llllllllllllIllllIlIlllIllIIlIll < llllllllllllIllllIlIlllIllIIlIlI;
    }
    
    public void loadServerList() {
        try {
            this.servers.clear();
            final NBTTagCompound llllllllllllIllllIlIllllIlIIIIIl = CompressedStreamTools.read(new File(this.mc.mcDataDir, ServerList.lIllllIIIIllIl[ServerList.lIllllIIIIlllI[0]]));
            if (lIIIIIlllllIIlll(llllllllllllIllllIlIllllIlIIIIIl)) {
                return;
            }
            final NBTTagList llllllllllllIllllIlIllllIlIIIIII = llllllllllllIllllIlIllllIlIIIIIl.getTagList(ServerList.lIllllIIIIllIl[ServerList.lIllllIIIIlllI[1]], ServerList.lIllllIIIIlllI[2]);
            int llllllllllllIllllIlIllllIIllllll = ServerList.lIllllIIIIlllI[0];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIIIIlllllIlIII(llllllllllllIllllIlIllllIIllllll, llllllllllllIllllIlIllllIlIIIIII.tagCount())) {
                this.servers.add(ServerData.getServerDataFromNBTCompound(llllllllllllIllllIlIllllIlIIIIII.getCompoundTagAt(llllllllllllIllllIlIllllIIllllll)));
                "".length();
                ++llllllllllllIllllIlIllllIIllllll;
            }
            "".length();
            if ("  ".length() < 0) {
                return;
            }
        }
        catch (Exception llllllllllllIllllIlIllllIIlllllI) {
            ServerList.logger.error(ServerList.lIllllIIIIllIl[ServerList.lIllllIIIIlllI[3]], (Throwable)llllllllllllIllllIlIllllIIlllllI);
        }
    }
    
    private static void lIIIIIlllllIIllI() {
        (lIllllIIIIlllI = new int[8])[0] = ((0x54 ^ 0x58 ^ (0x2C ^ 0x31)) & (0x7D ^ 0x58 ^ (0x56 ^ 0x62) ^ -" ".length()));
        ServerList.lIllllIIIIlllI[1] = " ".length();
        ServerList.lIllllIIIIlllI[2] = (" ".length() ^ (0x19 ^ 0x12));
        ServerList.lIllllIIIIlllI[3] = "  ".length();
        ServerList.lIllllIIIIlllI[4] = "   ".length();
        ServerList.lIllllIIIIlllI[5] = (0xF7 ^ 0xA2 ^ (0xF6 ^ 0xA7));
        ServerList.lIllllIIIIlllI[6] = (0x94 ^ 0x91);
        ServerList.lIllllIIIIlllI[7] = (14 + 128 - 49 + 94 ^ 142 + 66 - 47 + 28);
    }
    
    public void removeServerData(final int llllllllllllIllllIlIllllIIlIIIll) {
        this.servers.remove(llllllllllllIllllIlIllllIIlIIIll);
        "".length();
    }
    
    private static boolean lIIIIIlllllIlIIl(final int llllllllllllIllllIlIlllIllIIIlII) {
        return llllllllllllIllllIlIlllIllIIIlII == 0;
    }
    
    private static boolean lIIIIIlllllIlIII(final int llllllllllllIllllIlIlllIllIIllll, final int llllllllllllIllllIlIlllIllIIlllI) {
        return llllllllllllIllllIlIlllIllIIllll >= llllllllllllIllllIlIlllIllIIlllI;
    }
    
    public static void func_147414_b(final ServerData llllllllllllIllllIlIlllIlllllllI) {
        final ServerList llllllllllllIllllIlIlllIllllllIl = new ServerList(Minecraft.getMinecraft());
        llllllllllllIllllIlIlllIllllllIl.loadServerList();
        int llllllllllllIllllIlIlllIllllllII = ServerList.lIllllIIIIlllI[0];
        "".length();
        if ((0x9C ^ 0xAA ^ (0xA8 ^ 0x9A)) == 0x0) {
            return;
        }
        while (!lIIIIIlllllIlIII(llllllllllllIllllIlIlllIllllllII, llllllllllllIllllIlIlllIllllllIl.countServers())) {
            final ServerData llllllllllllIllllIlIlllIlllllIll = llllllllllllIllllIlIlllIllllllIl.getServerData(llllllllllllIllllIlIlllIllllllII);
            if (lIIIIIlllllIlIlI(llllllllllllIllllIlIlllIlllllIll.serverName.equals(llllllllllllIllllIlIlllIlllllllI.serverName) ? 1 : 0) && lIIIIIlllllIlIlI(llllllllllllIllllIlIlllIlllllIll.serverIP.equals(llllllllllllIllllIlIlllIlllllllI.serverIP) ? 1 : 0)) {
                llllllllllllIllllIlIlllIllllllIl.func_147413_a(llllllllllllIllllIlIlllIllllllII, llllllllllllIllllIlIlllIlllllllI);
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
                break;
            }
            else {
                ++llllllllllllIllllIlIlllIllllllII;
            }
        }
        llllllllllllIllllIlIlllIllllllIl.saveServerList();
    }
    
    public void saveServerList() {
        try {
            final NBTTagList llllllllllllIllllIlIllllIIllIlII = new NBTTagList();
            final float llllllllllllIllllIlIllllIIlIllIl = (float)this.servers.iterator();
            "".length();
            if (((121 + 55 - 25 + 0 ^ 120 + 23 - 19 + 72) & (0x47 ^ 0x61 ^ (0x49 ^ 0x3C) ^ -" ".length())) < 0) {
                return;
            }
            while (!lIIIIIlllllIlIIl(((Iterator)llllllllllllIllllIlIllllIIlIllIl).hasNext() ? 1 : 0)) {
                final ServerData llllllllllllIllllIlIllllIIllIIll = ((Iterator<ServerData>)llllllllllllIllllIlIllllIIlIllIl).next();
                llllllllllllIllllIlIllllIIllIlII.appendTag(llllllllllllIllllIlIllllIIllIIll.getNBTCompound());
            }
            final NBTTagCompound llllllllllllIllllIlIllllIIllIIlI = new NBTTagCompound();
            llllllllllllIllllIlIllllIIllIIlI.setTag(ServerList.lIllllIIIIllIl[ServerList.lIllllIIIIlllI[4]], llllllllllllIllllIlIllllIIllIlII);
            CompressedStreamTools.safeWrite(llllllllllllIllllIlIllllIIllIIlI, new File(this.mc.mcDataDir, ServerList.lIllllIIIIllIl[ServerList.lIllllIIIIlllI[5]]));
            "".length();
            if ((102 + 98 - 109 + 59 ^ 118 + 135 - 209 + 102) < " ".length()) {
                return;
            }
        }
        catch (Exception llllllllllllIllllIlIllllIIllIIIl) {
            ServerList.logger.error(ServerList.lIllllIIIIllIl[ServerList.lIllllIIIIlllI[6]], (Throwable)llllllllllllIllllIlIllllIIllIIIl);
        }
    }
    
    public int countServers() {
        return this.servers.size();
    }
    
    public ServerData getServerData(final int llllllllllllIllllIlIllllIIlIlIIl) {
        return this.servers.get(llllllllllllIllllIlIllllIIlIlIIl);
    }
    
    private static boolean lIIIIIlllllIlIlI(final int llllllllllllIllllIlIlllIllIIIllI) {
        return llllllllllllIllllIlIlllIllIIIllI != 0;
    }
    
    private static String lIIIIIlllllIIlII(final String llllllllllllIllllIlIlllIlllIllIl, final String llllllllllllIllllIlIlllIlllIllII) {
        try {
            final SecretKeySpec llllllllllllIllllIlIlllIllllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIlllIlllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIlIlllIllllIIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllllIlIlllIllllIIIl.init(ServerList.lIllllIIIIlllI[3], llllllllllllIllllIlIlllIllllIIlI);
            return new String(llllllllllllIllllIlIlllIllllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIlllIlllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlIlllIllllIIII) {
            llllllllllllIllllIlIlllIllllIIII.printStackTrace();
            return null;
        }
    }
    
    public void func_147413_a(final int llllllllllllIllllIlIllllIIIIIlII, final ServerData llllllllllllIllllIlIllllIIIIIllI) {
        this.servers.set(llllllllllllIllllIlIllllIIIIIlII, llllllllllllIllllIlIllllIIIIIllI);
        "".length();
    }
    
    private static void lIIIIIlllllIIlIl() {
        (lIllllIIIIllIl = new String[ServerList.lIllllIIIIlllI[7]])[ServerList.lIllllIIIIlllI[0]] = lIIIIIlllllIIIll("ESACFQ4QNl4HChY=", "bEpck");
        ServerList.lIllllIIIIllIl[ServerList.lIllllIIIIlllI[1]] = lIIIIIlllllIIlII("6g3Yt91OPGE=", "waDxr");
        ServerList.lIllllIIIIllIl[ServerList.lIllllIIIIlllI[3]] = lIIIIIlllllIIIll("JAseGQ8JQx9VBwgFD1UYAhYdEBlHCAIGHw==", "gdkuk");
        ServerList.lIllllIIIIllIl[ServerList.lIllllIIIIlllI[4]] = lIIIIIlllllIIIll("HzYmHCoeIA==", "lSTjO");
        ServerList.lIllllIIIIllIl[ServerList.lIllllIIIIlllI[5]] = lIIIIIlllllIIIll("Jg47AjUnGGcQMSE=", "UkItP");
        ServerList.lIllllIIIIllIl[ServerList.lIllllIIIIlllI[6]] = lIIIIIlllllIIlII("kklS9BM07o8ClHqMawdCBLaWw+mNxzwOmQJguVG0iTk=", "IEQny");
    }
    
    private static boolean lIIIIIlllllIIlll(final Object llllllllllllIllllIlIlllIllIIlIII) {
        return llllllllllllIllllIlIlllIllIIlIII == null;
    }
    
    public void addServerData(final ServerData llllllllllllIllllIlIllllIIIllIll) {
        this.servers.add(llllllllllllIllllIlIllllIIIllIll);
        "".length();
    }
    
    private static String lIIIIIlllllIIIll(String llllllllllllIllllIlIlllIllIllIlI, final String llllllllllllIllllIlIlllIllIllllI) {
        llllllllllllIllllIlIlllIllIllIlI = (byte)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIlIlllIllIllIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIlIlllIllIlllIl = new StringBuilder();
        final char[] llllllllllllIllllIlIlllIllIlllII = llllllllllllIllllIlIlllIllIllllI.toCharArray();
        int llllllllllllIllllIlIlllIllIllIll = ServerList.lIllllIIIIlllI[0];
        final short llllllllllllIllllIlIlllIllIlIlIl = (Object)((String)llllllllllllIllllIlIlllIllIllIlI).toCharArray();
        final float llllllllllllIllllIlIlllIllIlIlII = llllllllllllIllllIlIlllIllIlIlIl.length;
        long llllllllllllIllllIlIlllIllIlIIll = ServerList.lIllllIIIIlllI[0];
        while (lIIIIIlllllIlIll((int)llllllllllllIllllIlIlllIllIlIIll, (int)llllllllllllIllllIlIlllIllIlIlII)) {
            final char llllllllllllIllllIlIlllIlllIIIII = llllllllllllIllllIlIlllIllIlIlIl[llllllllllllIllllIlIlllIllIlIIll];
            llllllllllllIllllIlIlllIllIlllIl.append((char)(llllllllllllIllllIlIlllIlllIIIII ^ llllllllllllIllllIlIlllIllIlllII[llllllllllllIllllIlIlllIllIllIll % llllllllllllIllllIlIlllIllIlllII.length]));
            "".length();
            ++llllllllllllIllllIlIlllIllIllIll;
            ++llllllllllllIllllIlIlllIllIlIIll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIlIlllIllIlllIl);
    }
    
    public void swapServers(final int llllllllllllIllllIlIllllIIIlIIlI, final int llllllllllllIllllIlIllllIIIlIIIl) {
        final ServerData llllllllllllIllllIlIllllIIIlIIII = this.getServerData(llllllllllllIllllIlIllllIIIlIIlI);
        this.servers.set(llllllllllllIllllIlIllllIIIlIIlI, this.getServerData(llllllllllllIllllIlIllllIIIlIIIl));
        "".length();
        this.servers.set(llllllllllllIllllIlIllllIIIlIIIl, llllllllllllIllllIlIllllIIIlIIII);
        "".length();
        this.saveServerList();
    }
    
    static {
        lIIIIIlllllIIllI();
        lIIIIIlllllIIlIl();
        logger = LogManager.getLogger();
    }
    
    public ServerList(final Minecraft llllllllllllIllllIlIllllIlIIlIIl) {
        this.servers = (List<ServerData>)Lists.newArrayList();
        this.mc = llllllllllllIllllIlIllllIlIIlIIl;
        this.loadServerList();
    }
}
