// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.multiplayer;

import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.nbt.NBTTagCompound;

public class ServerData
{
    public /* synthetic */ String serverIP;
    public /* synthetic */ String serverName;
    private /* synthetic */ ServerResourceMode resourceMode;
    private /* synthetic */ String serverIcon;
    private /* synthetic */ boolean field_181042_l;
    public /* synthetic */ String gameVersion;
    private static final /* synthetic */ String[] lIIlIIlIlIllIl;
    public /* synthetic */ int version;
    private static final /* synthetic */ int[] lIIlIIlIlIllll;
    
    private static boolean llIIllIlIIlllII(final Object lllllllllllllIIllIlllIIlIIIlllII, final Object lllllllllllllIIllIlllIIlIIIllIll) {
        return lllllllllllllIIllIlllIIlIIIlllII == lllllllllllllIIllIlllIIlIIIllIll;
    }
    
    public String getBase64EncodedIconData() {
        return this.serverIcon;
    }
    
    public ServerData(final String lllllllllllllIIllIlllIIllIIIIIII, final String lllllllllllllIIllIlllIIlIlllllll, final boolean lllllllllllllIIllIlllIIlIllllllI) {
        this.version = ServerData.lIIlIIlIlIllll[0];
        this.gameVersion = ServerData.lIIlIIlIlIllIl[ServerData.lIIlIIlIlIllll[1]];
        this.resourceMode = ServerResourceMode.PROMPT;
        this.serverName = lllllllllllllIIllIlllIIllIIIIIII;
        this.serverIP = lllllllllllllIIllIlllIIlIlllllll;
        this.field_181042_l = lllllllllllllIIllIlllIIlIllllllI;
    }
    
    private static void llIIllIlIIllIlI() {
        (lIIlIIlIlIllll = new int[14])[0] = (0x7A ^ 0x55);
        ServerData.lIIlIIlIlIllll[1] = ((0xCA ^ 0xB1 ^ (0x15 ^ 0x57)) & (0x0 ^ 0x7B ^ (0x84 ^ 0xC6) ^ -" ".length()));
        ServerData.lIIlIIlIlIllll[2] = " ".length();
        ServerData.lIIlIIlIlIllll[3] = "  ".length();
        ServerData.lIIlIIlIlIllll[4] = "   ".length();
        ServerData.lIIlIIlIlIllll[5] = (0x6A ^ 0x6E);
        ServerData.lIIlIIlIlIllll[6] = (0x6C ^ 0x69);
        ServerData.lIIlIIlIlIllll[7] = (0x7B ^ 0x31 ^ (0xE4 ^ 0xA8));
        ServerData.lIIlIIlIlIllll[8] = (0x7D ^ 0x75 ^ (0x4A ^ 0x45));
        ServerData.lIIlIIlIlIllll[9] = (0x47 ^ 0x4F);
        ServerData.lIIlIIlIlIllll[10] = (0x56 ^ 0x22 ^ (0xEF ^ 0x92));
        ServerData.lIIlIIlIlIllll[11] = (167 + 40 - 111 + 92 ^ 17 + 52 - 1 + 114);
        ServerData.lIIlIIlIlIllll[12] = (0x76 ^ 0x7D);
        ServerData.lIIlIIlIlIllll[13] = (0x45 ^ 0x7 ^ (0x3A ^ 0x74));
    }
    
    public void setResourceMode(final ServerResourceMode lllllllllllllIIllIlllIIlIlllIIIl) {
        this.resourceMode = lllllllllllllIIllIlllIIlIlllIIIl;
    }
    
    public ServerResourceMode getResourceMode() {
        return this.resourceMode;
    }
    
    public NBTTagCompound getNBTCompound() {
        final NBTTagCompound lllllllllllllIIllIlllIIlIllllIlI = new NBTTagCompound();
        lllllllllllllIIllIlllIIlIllllIlI.setString(ServerData.lIIlIIlIlIllIl[ServerData.lIIlIIlIlIllll[2]], this.serverName);
        lllllllllllllIIllIlllIIlIllllIlI.setString(ServerData.lIIlIIlIlIllIl[ServerData.lIIlIIlIlIllll[3]], this.serverIP);
        if (llIIllIlIIllIll(this.serverIcon)) {
            lllllllllllllIIllIlllIIlIllllIlI.setString(ServerData.lIIlIIlIlIllIl[ServerData.lIIlIIlIlIllll[4]], this.serverIcon);
        }
        if (llIIllIlIIlllII(this.resourceMode, ServerResourceMode.ENABLED)) {
            lllllllllllllIIllIlllIIlIllllIlI.setBoolean(ServerData.lIIlIIlIlIllIl[ServerData.lIIlIIlIlIllll[5]], (boolean)(ServerData.lIIlIIlIlIllll[2] != 0));
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (llIIllIlIIlllII(this.resourceMode, ServerResourceMode.DISABLED)) {
            lllllllllllllIIllIlllIIlIllllIlI.setBoolean(ServerData.lIIlIIlIlIllIl[ServerData.lIIlIIlIlIllll[6]], (boolean)(ServerData.lIIlIIlIlIllll[1] != 0));
        }
        return lllllllllllllIIllIlllIIlIllllIlI;
    }
    
    public boolean func_181041_d() {
        return this.field_181042_l;
    }
    
    private static void llIIllIlIIlIIII() {
        (lIIlIIlIlIllIl = new String[ServerData.lIIlIIlIlIllll[13]])[ServerData.lIIlIIlIlIllll[1]] = llIIllIlIIIllIl("SUR/a04=", "xjGEv");
        ServerData.lIIlIIlIlIllIl[ServerData.lIIlIIlIlIllll[2]] = llIIllIlIIIlllI("oxzB5Du4d8U=", "NNvOQ");
        ServerData.lIIlIIlIlIllIl[ServerData.lIIlIIlIlIllll[3]] = llIIllIlIIIllll("vtyNtLZ0jA8=", "qBxqH");
        ServerData.lIIlIIlIlIllIl[ServerData.lIIlIIlIlIllll[4]] = llIIllIlIIIllll("A5bfQkP2f/M=", "vQZcV");
        ServerData.lIIlIIlIlIllIl[ServerData.lIIlIIlIlIllll[5]] = llIIllIlIIIlllI("u5FSoFNZL1kEnln4LQJbUA==", "cSQBn");
        ServerData.lIIlIIlIlIllIl[ServerData.lIIlIIlIlIllll[6]] = llIIllIlIIIllIl("KwAMKSM+Nwo0Jz8RCj8=", "JcoLS");
        ServerData.lIIlIIlIlIllIl[ServerData.lIIlIIlIlIllll[7]] = llIIllIlIIIlllI("3ghoWm0uKlc=", "kbhec");
        ServerData.lIIlIIlIlIllIl[ServerData.lIIlIIlIlIllll[8]] = llIIllIlIIIllIl("Ohw=", "SlJJA");
        ServerData.lIIlIIlIlIllIl[ServerData.lIIlIIlIlIllll[9]] = llIIllIlIIIllll("GPXLa3yPjjQ=", "vYcao");
        ServerData.lIIlIIlIlIllIl[ServerData.lIIlIIlIlIllll[10]] = llIIllIlIIIllll("9MHR1j6x9M4=", "JiCJq");
        ServerData.lIIlIIlIlIllIl[ServerData.lIIlIIlIlIllll[11]] = llIIllIlIIIllIl("EggwLRoHPzYwHgYZNjs=", "skSHj");
        ServerData.lIIlIIlIlIllIl[ServerData.lIIlIIlIlIllll[12]] = llIIllIlIIIlllI("YW00P7pmZ/9UHYHV/l9JDg==", "YvYQb");
    }
    
    public void copyFrom(final ServerData lllllllllllllIIllIlllIIlIlIlIlll) {
        this.serverIP = lllllllllllllIIllIlllIIlIlIlIlll.serverIP;
        this.serverName = lllllllllllllIIllIlllIIlIlIlIlll.serverName;
        this.setResourceMode(lllllllllllllIIllIlllIIlIlIlIlll.getResourceMode());
        this.serverIcon = lllllllllllllIIllIlllIIlIlIlIlll.serverIcon;
        this.field_181042_l = lllllllllllllIIllIlllIIlIlIlIlll.field_181042_l;
    }
    
    private static boolean llIIllIlIIlllIl(final int lllllllllllllIIllIlllIIlIIIllIIl) {
        return lllllllllllllIIllIlllIIlIIIllIIl != 0;
    }
    
    private static String llIIllIlIIIlllI(final String lllllllllllllIIllIlllIIlIlIIIIII, final String lllllllllllllIIllIlllIIlIlIIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIllIlllIIlIlIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlllIIlIlIIIIIl.getBytes(StandardCharsets.UTF_8)), ServerData.lIIlIIlIlIllll[9]), "DES");
            final Cipher lllllllllllllIIllIlllIIlIlIIIlII = Cipher.getInstance("DES");
            lllllllllllllIIllIlllIIlIlIIIlII.init(ServerData.lIIlIIlIlIllll[3], lllllllllllllIIllIlllIIlIlIIIlIl);
            return new String(lllllllllllllIIllIlllIIlIlIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlllIIlIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIlllIIlIlIIIIll) {
            lllllllllllllIIllIlllIIlIlIIIIll.printStackTrace();
            return null;
        }
    }
    
    private static String llIIllIlIIIllll(final String lllllllllllllIIllIlllIIlIlIIllIl, final String lllllllllllllIIllIlllIIlIlIIlllI) {
        try {
            final SecretKeySpec lllllllllllllIIllIlllIIlIlIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlllIIlIlIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIlllIIlIlIlIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIlllIIlIlIlIIIl.init(ServerData.lIIlIIlIlIllll[3], lllllllllllllIIllIlllIIlIlIlIIlI);
            return new String(lllllllllllllIIllIlllIIlIlIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlllIIlIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIlllIIlIlIlIIII) {
            lllllllllllllIIllIlllIIlIlIlIIII.printStackTrace();
            return null;
        }
    }
    
    private static String llIIllIlIIIllIl(String lllllllllllllIIllIlllIIlIIlIllIl, final String lllllllllllllIIllIlllIIlIIllIIIl) {
        lllllllllllllIIllIlllIIlIIlIllIl = new String(Base64.getDecoder().decode(lllllllllllllIIllIlllIIlIIlIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIlllIIlIIllIIII = new StringBuilder();
        final char[] lllllllllllllIIllIlllIIlIIlIllll = lllllllllllllIIllIlllIIlIIllIIIl.toCharArray();
        int lllllllllllllIIllIlllIIlIIlIlllI = ServerData.lIIlIIlIlIllll[1];
        final Exception lllllllllllllIIllIlllIIlIIlIlIII = (Object)lllllllllllllIIllIlllIIlIIlIllIl.toCharArray();
        final long lllllllllllllIIllIlllIIlIIlIIlll = lllllllllllllIIllIlllIIlIIlIlIII.length;
        double lllllllllllllIIllIlllIIlIIlIIllI = ServerData.lIIlIIlIlIllll[1];
        while (llIIllIlIIllllI((int)lllllllllllllIIllIlllIIlIIlIIllI, (int)lllllllllllllIIllIlllIIlIIlIIlll)) {
            final char lllllllllllllIIllIlllIIlIIllIIll = lllllllllllllIIllIlllIIlIIlIlIII[lllllllllllllIIllIlllIIlIIlIIllI];
            lllllllllllllIIllIlllIIlIIllIIII.append((char)(lllllllllllllIIllIlllIIlIIllIIll ^ lllllllllllllIIllIlllIIlIIlIllll[lllllllllllllIIllIlllIIlIIlIlllI % lllllllllllllIIllIlllIIlIIlIllll.length]));
            "".length();
            ++lllllllllllllIIllIlllIIlIIlIlllI;
            ++lllllllllllllIIllIlllIIlIIlIIllI;
            "".length();
            if (-" ".length() >= " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIlllIIlIIllIIII);
    }
    
    private static boolean llIIllIlIIllllI(final int lllllllllllllIIllIlllIIlIIlIIIlI, final int lllllllllllllIIllIlllIIlIIlIIIIl) {
        return lllllllllllllIIllIlllIIlIIlIIIlI < lllllllllllllIIllIlllIIlIIlIIIIl;
    }
    
    static {
        llIIllIlIIllIlI();
        llIIllIlIIlIIII();
    }
    
    private static boolean llIIllIlIIllIll(final Object lllllllllllllIIllIlllIIlIIIlllll) {
        return lllllllllllllIIllIlllIIlIIIlllll != null;
    }
    
    public static ServerData getServerDataFromNBTCompound(final NBTTagCompound lllllllllllllIIllIlllIIlIllIlIlI) {
        final ServerData lllllllllllllIIllIlllIIlIllIlIll = new ServerData(lllllllllllllIIllIlllIIlIllIlIlI.getString(ServerData.lIIlIIlIlIllIl[ServerData.lIIlIIlIlIllll[7]]), lllllllllllllIIllIlllIIlIllIlIlI.getString(ServerData.lIIlIIlIlIllIl[ServerData.lIIlIIlIlIllll[8]]), (boolean)(ServerData.lIIlIIlIlIllll[1] != 0));
        if (llIIllIlIIlllIl(lllllllllllllIIllIlllIIlIllIlIlI.hasKey(ServerData.lIIlIIlIlIllIl[ServerData.lIIlIIlIlIllll[9]], ServerData.lIIlIIlIlIllll[9]) ? 1 : 0)) {
            lllllllllllllIIllIlllIIlIllIlIll.setBase64EncodedIconData(lllllllllllllIIllIlllIIlIllIlIlI.getString(ServerData.lIIlIIlIlIllIl[ServerData.lIIlIIlIlIllll[10]]));
        }
        if (llIIllIlIIlllIl(lllllllllllllIIllIlllIIlIllIlIlI.hasKey(ServerData.lIIlIIlIlIllIl[ServerData.lIIlIIlIlIllll[11]], ServerData.lIIlIIlIlIllll[2]) ? 1 : 0)) {
            if (llIIllIlIIlllIl(lllllllllllllIIllIlllIIlIllIlIlI.getBoolean(ServerData.lIIlIIlIlIllIl[ServerData.lIIlIIlIlIllll[12]]) ? 1 : 0)) {
                lllllllllllllIIllIlllIIlIllIlIll.setResourceMode(ServerResourceMode.ENABLED);
                "".length();
                if ("   ".length() < 0) {
                    return null;
                }
            }
            else {
                lllllllllllllIIllIlllIIlIllIlIll.setResourceMode(ServerResourceMode.DISABLED);
                "".length();
                if ((0x48 ^ 0x4C) < " ".length()) {
                    return null;
                }
            }
        }
        else {
            lllllllllllllIIllIlllIIlIllIlIll.setResourceMode(ServerResourceMode.PROMPT);
        }
        return lllllllllllllIIllIlllIIlIllIlIll;
    }
    
    public void setBase64EncodedIconData(final String lllllllllllllIIllIlllIIlIllIIIII) {
        this.serverIcon = lllllllllllllIIllIlllIIlIllIIIII;
    }
    
    public enum ServerResourceMode
    {
        private static final /* synthetic */ int[] lIllllllllIIII;
        
        ENABLED(ServerResourceMode.lIlllllllIllll[ServerResourceMode.lIllllllllIIII[0]], ServerResourceMode.lIllllllllIIII[0], ServerResourceMode.lIlllllllIllll[ServerResourceMode.lIllllllllIIII[1]]);
        
        private final /* synthetic */ IChatComponent motd;
        
        PROMPT(ServerResourceMode.lIlllllllIllll[ServerResourceMode.lIllllllllIIII[4]], ServerResourceMode.lIllllllllIIII[2], ServerResourceMode.lIlllllllIllll[ServerResourceMode.lIllllllllIIII[5]]), 
        DISABLED(ServerResourceMode.lIlllllllIllll[ServerResourceMode.lIllllllllIIII[2]], ServerResourceMode.lIllllllllIIII[1], ServerResourceMode.lIlllllllIllll[ServerResourceMode.lIllllllllIIII[3]]);
        
        private static final /* synthetic */ String[] lIlllllllIllll;
        
        static {
            lIIIIllIIlIIlIIl();
            lIIIIllIIlIIlIII();
            final ServerResourceMode[] enum$VALUES = new ServerResourceMode[ServerResourceMode.lIllllllllIIII[3]];
            enum$VALUES[ServerResourceMode.lIllllllllIIII[0]] = ServerResourceMode.ENABLED;
            enum$VALUES[ServerResourceMode.lIllllllllIIII[1]] = ServerResourceMode.DISABLED;
            enum$VALUES[ServerResourceMode.lIllllllllIIII[2]] = ServerResourceMode.PROMPT;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static boolean lIIIIllIIlIIlIlI(final int llllllllllllIllllIIIllIIlIIlIlIl, final int llllllllllllIllllIIIllIIlIIlIlII) {
            return llllllllllllIllllIIIllIIlIIlIlIl < llllllllllllIllllIIIllIIlIIlIlII;
        }
        
        private static void lIIIIllIIlIIlIII() {
            (lIlllllllIllll = new String[ServerResourceMode.lIllllllllIIII[7]])[ServerResourceMode.lIllllllllIIII[0]] = lIIIIllIIlIIIlIl("HhnMjANH3XQ=", "lISAa");
            ServerResourceMode.lIlllllllIllll[ServerResourceMode.lIllllllllIIII[1]] = lIIIIllIIlIIIlIl("ht8U45nlRF0=", "IIeeF");
            ServerResourceMode.lIlllllllIllll[ServerResourceMode.lIllllllllIIII[2]] = lIIIIllIIlIIIlIl("w5SVq1tYu7V4QtERHw+QzA==", "rWYPX");
            ServerResourceMode.lIlllllllIllll[ServerResourceMode.lIllllllllIIII[3]] = lIIIIllIIlIIIllI("PIZBItP1VF2wCRqL7My2ow==", "UgwTj");
            ServerResourceMode.lIlllllllIllll[ServerResourceMode.lIllllllllIIII[4]] = lIIIIllIIlIIIlIl("BV7RvtQA+sk=", "bPyUw");
            ServerResourceMode.lIlllllllIllll[ServerResourceMode.lIllllllllIIII[5]] = lIIIIllIIlIIIlll("HjYeABYa", "nDqmf");
            ServerResourceMode.lIlllllllIllll[ServerResourceMode.lIllllllllIIII[6]] = lIIIIllIIlIIIlll("CxIqID8YACsBdBgTPRwvGBUrIzsJHWA=", "jvNsZ");
        }
        
        private static String lIIIIllIIlIIIlll(String llllllllllllIllllIIIllIIlIlllIlI, final String llllllllllllIllllIIIllIIlIlllIIl) {
            llllllllllllIllllIIIllIIlIlllIlI = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIIIllIIlIlllIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllllIIIllIIlIllllIl = new StringBuilder();
            final char[] llllllllllllIllllIIIllIIlIllllII = llllllllllllIllllIIIllIIlIlllIIl.toCharArray();
            int llllllllllllIllllIIIllIIlIlllIll = ServerResourceMode.lIllllllllIIII[0];
            final double llllllllllllIllllIIIllIIlIllIlIl = (Object)((String)llllllllllllIllllIIIllIIlIlllIlI).toCharArray();
            final boolean llllllllllllIllllIIIllIIlIllIlII = llllllllllllIllllIIIllIIlIllIlIl.length != 0;
            Exception llllllllllllIllllIIIllIIlIllIIll = (Exception)ServerResourceMode.lIllllllllIIII[0];
            while (lIIIIllIIlIIlIlI((int)llllllllllllIllllIIIllIIlIllIIll, llllllllllllIllllIIIllIIlIllIlII ? 1 : 0)) {
                final char llllllllllllIllllIIIllIIllIIIIII = llllllllllllIllllIIIllIIlIllIlIl[llllllllllllIllllIIIllIIlIllIIll];
                llllllllllllIllllIIIllIIlIllllIl.append((char)(llllllllllllIllllIIIllIIllIIIIII ^ llllllllllllIllllIIIllIIlIllllII[llllllllllllIllllIIIllIIlIlllIll % llllllllllllIllllIIIllIIlIllllII.length]));
                "".length();
                ++llllllllllllIllllIIIllIIlIlllIll;
                ++llllllllllllIllllIIIllIIlIllIIll;
                "".length();
                if ((0x4B ^ 0x2B ^ (0x24 ^ 0x40)) != (53 + 55 - 53 + 127 ^ 172 + 156 - 278 + 128)) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllllIIIllIIlIllllIl);
        }
        
        private static String lIIIIllIIlIIIllI(final String llllllllllllIllllIIIllIIlIIlllIl, final String llllllllllllIllllIIIllIIlIIlllII) {
            try {
                final SecretKeySpec llllllllllllIllllIIIllIIlIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIllIIlIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllllIIIllIIlIIlllll = Cipher.getInstance("Blowfish");
                llllllllllllIllllIIIllIIlIIlllll.init(ServerResourceMode.lIllllllllIIII[2], llllllllllllIllllIIIllIIlIlIIIII);
                return new String(llllllllllllIllllIIIllIIlIIlllll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIllIIlIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllIIIllIIlIIllllI) {
                llllllllllllIllllIIIllIIlIIllllI.printStackTrace();
                return null;
            }
        }
        
        private ServerResourceMode(final String llllllllllllIllllIIIllIIllIlIlll, final int llllllllllllIllllIIIllIIllIlIllI, final String llllllllllllIllllIIIllIIllIllIIl) {
            this.motd = new ChatComponentTranslation(String.valueOf(new StringBuilder(ServerResourceMode.lIlllllllIllll[ServerResourceMode.lIllllllllIIII[6]]).append(llllllllllllIllllIIIllIIllIllIIl)), new Object[ServerResourceMode.lIllllllllIIII[0]]);
        }
        
        private static void lIIIIllIIlIIlIIl() {
            (lIllllllllIIII = new int[9])[0] = ((0xAC ^ 0x86) & ~(0xA7 ^ 0x8D));
            ServerResourceMode.lIllllllllIIII[1] = " ".length();
            ServerResourceMode.lIllllllllIIII[2] = "  ".length();
            ServerResourceMode.lIllllllllIIII[3] = "   ".length();
            ServerResourceMode.lIllllllllIIII[4] = (0x8E ^ 0x96 ^ (0x26 ^ 0x3A));
            ServerResourceMode.lIllllllllIIII[5] = (0x93 ^ 0x96);
            ServerResourceMode.lIllllllllIIII[6] = (0x25 ^ 0x23);
            ServerResourceMode.lIllllllllIIII[7] = (0xB6 ^ 0xB1);
            ServerResourceMode.lIllllllllIIII[8] = (0xCB ^ 0xC3);
        }
        
        private static String lIIIIllIIlIIIlIl(final String llllllllllllIllllIIIllIIlIlIlIII, final String llllllllllllIllllIIIllIIlIlIlIIl) {
            try {
                final SecretKeySpec llllllllllllIllllIIIllIIlIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIllIIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), ServerResourceMode.lIllllllllIIII[8]), "DES");
                final Cipher llllllllllllIllllIIIllIIlIlIllII = Cipher.getInstance("DES");
                llllllllllllIllllIIIllIIlIlIllII.init(ServerResourceMode.lIllllllllIIII[2], llllllllllllIllllIIIllIIlIlIllIl);
                return new String(llllllllllllIllllIIIllIIlIlIllII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIllIIlIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllIIIllIIlIlIlIll) {
                llllllllllllIllllIIIllIIlIlIlIll.printStackTrace();
                return null;
            }
        }
        
        public IChatComponent getMotd() {
            return this.motd;
        }
    }
}
