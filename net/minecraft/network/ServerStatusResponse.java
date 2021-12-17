// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network;

import java.util.UUID;
import com.google.gson.JsonArray;
import com.mojang.authlib.GameProfile;
import java.util.Arrays;
import net.minecraft.util.JsonUtils;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonDeserializer;
import net.minecraft.util.IChatComponent;

public class ServerStatusResponse
{
    private /* synthetic */ PlayerCountData playerCount;
    private /* synthetic */ MinecraftProtocolVersionIdentifier protocolVersion;
    private /* synthetic */ String favicon;
    private /* synthetic */ IChatComponent serverMotd;
    
    public MinecraftProtocolVersionIdentifier getProtocolVersionInfo() {
        return this.protocolVersion;
    }
    
    public void setServerDescription(final IChatComponent lllllllllllllIIIlIIlIIIlIIIllIIl) {
        this.serverMotd = lllllllllllllIIIlIIlIIIlIIIllIIl;
    }
    
    public String getFavicon() {
        return this.favicon;
    }
    
    public IChatComponent getServerDescription() {
        return this.serverMotd;
    }
    
    public void setPlayerCountData(final PlayerCountData lllllllllllllIIIlIIlIIIlIIIlIIII) {
        this.playerCount = lllllllllllllIIIlIIlIIIlIIIlIIII;
    }
    
    public void setFavicon(final String lllllllllllllIIIlIIlIIIlIIIIIIIl) {
        this.favicon = lllllllllllllIIIlIIlIIIlIIIIIIIl;
    }
    
    public PlayerCountData getPlayerCountData() {
        return this.playerCount;
    }
    
    public void setProtocolVersionInfo(final MinecraftProtocolVersionIdentifier lllllllllllllIIIlIIlIIIlIIIIIlll) {
        this.protocolVersion = lllllllllllllIIIlIIlIIIlIIIIIlll;
    }
    
    public static class Serializer implements JsonDeserializer<ServerStatusResponse>, JsonSerializer<ServerStatusResponse>
    {
        private static final /* synthetic */ String[] lIIIlIIIIlIIll;
        private static final /* synthetic */ int[] lIIIlIIIIlllIl;
        
        private static void lIlllllIIIlIIll() {
            (lIIIlIIIIlIIll = new String[Serializer.lIIIlIIIIlllIl[13]])[Serializer.lIIIlIIIIlllIl[0]] = lIlllllIIIIIlII("d6U0mFhgoDM=", "VkdUL");
            Serializer.lIIIlIIIIlIIll[Serializer.lIIIlIIIIlllIl[1]] = lIlllllIIIIIlIl("t73jqN7XlaYdhfqGHbmmbA==", "oWMtO");
            Serializer.lIIIlIIIIlIIll[Serializer.lIIIlIIIIlllIl[2]] = lIlllllIIIIIlIl("aIElykqQMpRt3DXJcxiigw==", "HmbEH");
            Serializer.lIIIlIIIIlIIll[Serializer.lIIIlIIIIlllIl[3]] = lIlllllIIIIIlIl("Xlc87Z1AbOY=", "HAJau");
            Serializer.lIIIlIIIIlIIll[Serializer.lIIIlIIIIlllIl[4]] = lIlllllIIIIIlII("kUVWi0b6OnA=", "MibMC");
            Serializer.lIIIlIIIIlIIll[Serializer.lIIIlIIIIlllIl[5]] = lIlllllIIIlIIlI("Mj04OzkrNg==", "DXJHP");
            Serializer.lIIIlIIIIlIIll[Serializer.lIIIlIIIIlllIl[6]] = lIlllllIIIlIIlI("EDM8Pg4JOA==", "fVNMg");
            Serializer.lIIIlIIIIlIIll[Serializer.lIIIlIIIIlllIl[7]] = lIlllllIIIlIIlI("Cy0kGTICIg==", "mLRpQ");
            Serializer.lIIIlIIIIlIIll[Serializer.lIIIlIIIIlllIl[8]] = lIlllllIIIlIIlI("ExI+HggaHQ==", "usHwk");
            Serializer.lIIIlIIIIlIIll[Serializer.lIIIlIIIIlllIl[9]] = lIlllllIIIlIIlI("LTwQBR0gKRcPACc=", "IYcfo");
            Serializer.lIIIlIIIIlIIll[Serializer.lIIIlIIIIlllIl[10]] = lIlllllIIIIIlII("DpXWTw8NLis=", "MOOln");
            Serializer.lIIIlIIIIlIIll[Serializer.lIIIlIIIIlllIl[11]] = lIlllllIIIIIlII("JJ9JA1qhLug=", "OpMCT");
            Serializer.lIIIlIIIIlIIll[Serializer.lIIIlIIIIlllIl[12]] = lIlllllIIIlIIlI("DwMSBCEGDA==", "ibdmB");
        }
        
        public JsonElement serialize(final ServerStatusResponse lllllllllllllIlIIIllIIllIIlIIIII, final Type lllllllllllllIlIIIllIIllIIIlllll, final JsonSerializationContext lllllllllllllIlIIIllIIllIIIllIll) {
            final JsonObject lllllllllllllIlIIIllIIllIIIlllIl = new JsonObject();
            if (lIlllllIIlIIIll(lllllllllllllIlIIIllIIllIIlIIIII.getServerDescription())) {
                lllllllllllllIlIIIllIIllIIIlllIl.add(Serializer.lIIIlIIIIlIIll[Serializer.lIIIlIIIIlllIl[9]], lllllllllllllIlIIIllIIllIIIllIll.serialize((Object)lllllllllllllIlIIIllIIllIIlIIIII.getServerDescription()));
            }
            if (lIlllllIIlIIIll(lllllllllllllIlIIIllIIllIIlIIIII.getPlayerCountData())) {
                lllllllllllllIlIIIllIIllIIIlllIl.add(Serializer.lIIIlIIIIlIIll[Serializer.lIIIlIIIIlllIl[10]], lllllllllllllIlIIIllIIllIIIllIll.serialize((Object)lllllllllllllIlIIIllIIllIIlIIIII.getPlayerCountData()));
            }
            if (lIlllllIIlIIIll(lllllllllllllIlIIIllIIllIIlIIIII.getProtocolVersionInfo())) {
                lllllllllllllIlIIIllIIllIIIlllIl.add(Serializer.lIIIlIIIIlIIll[Serializer.lIIIlIIIIlllIl[11]], lllllllllllllIlIIIllIIllIIIllIll.serialize((Object)lllllllllllllIlIIIllIIllIIlIIIII.getProtocolVersionInfo()));
            }
            if (lIlllllIIlIIIll(lllllllllllllIlIIIllIIllIIlIIIII.getFavicon())) {
                lllllllllllllIlIIIllIIllIIIlllIl.addProperty(Serializer.lIIIlIIIIlIIll[Serializer.lIIIlIIIIlllIl[12]], lllllllllllllIlIIIllIIllIIlIIIII.getFavicon());
            }
            return (JsonElement)lllllllllllllIlIIIllIIllIIIlllIl;
        }
        
        private static String lIlllllIIIIIlIl(final String lllllllllllllIlIIIllIIlIllIllIll, final String lllllllllllllIlIIIllIIlIllIllIlI) {
            try {
                final SecretKeySpec lllllllllllllIlIIIllIIlIlllIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIllIIlIllIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIIIllIIlIllIlllll = Cipher.getInstance("Blowfish");
                lllllllllllllIlIIIllIIlIllIlllll.init(Serializer.lIIIlIIIIlllIl[2], lllllllllllllIlIIIllIIlIlllIIIII);
                return new String(lllllllllllllIlIIIllIIlIllIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIllIIlIllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIIllIIlIllIllllI) {
                lllllllllllllIlIIIllIIlIllIllllI.printStackTrace();
                return null;
            }
        }
        
        static {
            lIlllllIIlIIIIl();
            lIlllllIIIlIIll();
        }
        
        public ServerStatusResponse deserialize(final JsonElement lllllllllllllIlIIIllIIllIIlIlIII, final Type lllllllllllllIlIIIllIIllIIlIllII, final JsonDeserializationContext lllllllllllllIlIIIllIIllIIlIlIll) throws JsonParseException {
            final JsonObject lllllllllllllIlIIIllIIllIIlIlIlI = JsonUtils.getJsonObject(lllllllllllllIlIIIllIIllIIlIlIII, Serializer.lIIIlIIIIlIIll[Serializer.lIIIlIIIIlllIl[0]]);
            final ServerStatusResponse lllllllllllllIlIIIllIIllIIlIlIIl = new ServerStatusResponse();
            if (lIlllllIIlIIIlI(lllllllllllllIlIIIllIIllIIlIlIlI.has(Serializer.lIIIlIIIIlIIll[Serializer.lIIIlIIIIlllIl[1]]) ? 1 : 0)) {
                lllllllllllllIlIIIllIIllIIlIlIIl.setServerDescription((IChatComponent)lllllllllllllIlIIIllIIllIIlIlIll.deserialize(lllllllllllllIlIIIllIIllIIlIlIlI.get(Serializer.lIIIlIIIIlIIll[Serializer.lIIIlIIIIlllIl[2]]), (Type)IChatComponent.class));
            }
            if (lIlllllIIlIIIlI(lllllllllllllIlIIIllIIllIIlIlIlI.has(Serializer.lIIIlIIIIlIIll[Serializer.lIIIlIIIIlllIl[3]]) ? 1 : 0)) {
                lllllllllllllIlIIIllIIllIIlIlIIl.setPlayerCountData((PlayerCountData)lllllllllllllIlIIIllIIllIIlIlIll.deserialize(lllllllllllllIlIIIllIIllIIlIlIlI.get(Serializer.lIIIlIIIIlIIll[Serializer.lIIIlIIIIlllIl[4]]), (Type)PlayerCountData.class));
            }
            if (lIlllllIIlIIIlI(lllllllllllllIlIIIllIIllIIlIlIlI.has(Serializer.lIIIlIIIIlIIll[Serializer.lIIIlIIIIlllIl[5]]) ? 1 : 0)) {
                lllllllllllllIlIIIllIIllIIlIlIIl.setProtocolVersionInfo((MinecraftProtocolVersionIdentifier)lllllllllllllIlIIIllIIllIIlIlIll.deserialize(lllllllllllllIlIIIllIIllIIlIlIlI.get(Serializer.lIIIlIIIIlIIll[Serializer.lIIIlIIIIlllIl[6]]), (Type)MinecraftProtocolVersionIdentifier.class));
            }
            if (lIlllllIIlIIIlI(lllllllllllllIlIIIllIIllIIlIlIlI.has(Serializer.lIIIlIIIIlIIll[Serializer.lIIIlIIIIlllIl[7]]) ? 1 : 0)) {
                lllllllllllllIlIIIllIIllIIlIlIIl.setFavicon(JsonUtils.getString(lllllllllllllIlIIIllIIllIIlIlIlI, Serializer.lIIIlIIIIlIIll[Serializer.lIIIlIIIIlllIl[8]]));
            }
            return lllllllllllllIlIIIllIIllIIlIlIIl;
        }
        
        private static String lIlllllIIIlIIlI(String lllllllllllllIlIIIllIIlIllllIIlI, final String lllllllllllllIlIIIllIIlIllllIIIl) {
            lllllllllllllIlIIIllIIlIllllIIlI = new String(Base64.getDecoder().decode(lllllllllllllIlIIIllIIlIllllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIIIllIIlIllllIIII = new StringBuilder();
            final char[] lllllllllllllIlIIIllIIlIlllIllll = lllllllllllllIlIIIllIIlIllllIIIl.toCharArray();
            int lllllllllllllIlIIIllIIlIlllIlllI = Serializer.lIIIlIIIIlllIl[0];
            final String lllllllllllllIlIIIllIIlIlllIlIII = (Object)lllllllllllllIlIIIllIIlIllllIIlI.toCharArray();
            final double lllllllllllllIlIIIllIIlIlllIIlll = lllllllllllllIlIIIllIIlIlllIlIII.length;
            double lllllllllllllIlIIIllIIlIlllIIllI = Serializer.lIIIlIIIIlllIl[0];
            while (lIlllllIIlIIlII((int)lllllllllllllIlIIIllIIlIlllIIllI, (int)lllllllllllllIlIIIllIIlIlllIIlll)) {
                final char lllllllllllllIlIIIllIIlIllllIIll = lllllllllllllIlIIIllIIlIlllIlIII[lllllllllllllIlIIIllIIlIlllIIllI];
                lllllllllllllIlIIIllIIlIllllIIII.append((char)(lllllllllllllIlIIIllIIlIllllIIll ^ lllllllllllllIlIIIllIIlIlllIllll[lllllllllllllIlIIIllIIlIlllIlllI % lllllllllllllIlIIIllIIlIlllIllll.length]));
                "".length();
                ++lllllllllllllIlIIIllIIlIlllIlllI;
                ++lllllllllllllIlIIIllIIlIlllIIllI;
                "".length();
                if ("  ".length() == 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIIIllIIlIllllIIII);
        }
        
        private static boolean lIlllllIIlIIIll(final Object lllllllllllllIlIIIllIIlIllIlIIlI) {
            return lllllllllllllIlIIIllIIlIllIlIIlI != null;
        }
        
        private static boolean lIlllllIIlIIlII(final int lllllllllllllIlIIIllIIlIllIlIlIl, final int lllllllllllllIlIIIllIIlIllIlIlII) {
            return lllllllllllllIlIIIllIIlIllIlIlIl < lllllllllllllIlIIIllIIlIllIlIlII;
        }
        
        private static String lIlllllIIIIIlII(final String lllllllllllllIlIIIllIIllIIIIIIlI, final String lllllllllllllIlIIIllIIllIIIIIIIl) {
            try {
                final SecretKeySpec lllllllllllllIlIIIllIIllIIIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIllIIllIIIIIIIl.getBytes(StandardCharsets.UTF_8)), Serializer.lIIIlIIIIlllIl[8]), "DES");
                final Cipher lllllllllllllIlIIIllIIllIIIIIlII = Cipher.getInstance("DES");
                lllllllllllllIlIIIllIIllIIIIIlII.init(Serializer.lIIIlIIIIlllIl[2], lllllllllllllIlIIIllIIllIIIIIlIl);
                return new String(lllllllllllllIlIIIllIIllIIIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIllIIllIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIIllIIllIIIIIIll) {
                lllllllllllllIlIIIllIIllIIIIIIll.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIlllllIIlIIIlI(final int lllllllllllllIlIIIllIIlIllIlIIII) {
            return lllllllllllllIlIIIllIIlIllIlIIII != 0;
        }
        
        private static void lIlllllIIlIIIIl() {
            (lIIIlIIIIlllIl = new int[14])[0] = ((70 + 36 - 16 + 43 ^ 29 + 100 - 103 + 103) & (0xF2 ^ 0xC3 ^ (0x86 ^ 0xB3) ^ -" ".length()));
            Serializer.lIIIlIIIIlllIl[1] = " ".length();
            Serializer.lIIIlIIIIlllIl[2] = "  ".length();
            Serializer.lIIIlIIIIlllIl[3] = "   ".length();
            Serializer.lIIIlIIIIlllIl[4] = (0x8B ^ 0x8F);
            Serializer.lIIIlIIIIlllIl[5] = (0x77 ^ 0x72);
            Serializer.lIIIlIIIIlllIl[6] = (109 + 97 - 169 + 126 ^ 90 + 82 - 57 + 50);
            Serializer.lIIIlIIIIlllIl[7] = (0x4 ^ 0x41 ^ (0x34 ^ 0x76));
            Serializer.lIIIlIIIIlllIl[8] = (0x26 ^ 0x45 ^ (0xDD ^ 0xB6));
            Serializer.lIIIlIIIIlllIl[9] = (0x5C ^ 0x55);
            Serializer.lIIIlIIIIlllIl[10] = (0x90 ^ 0x9A);
            Serializer.lIIIlIIIIlllIl[11] = (0x80 ^ 0x8B);
            Serializer.lIIIlIIIIlllIl[12] = (0x98 ^ 0x95 ^ " ".length());
            Serializer.lIIIlIIIIlllIl[13] = (6 + 54 - 17 + 101 ^ 1 + 4 - 2 + 154);
        }
    }
    
    public static class PlayerCountData
    {
        private final /* synthetic */ int maxPlayers;
        private final /* synthetic */ int onlinePlayerCount;
        private /* synthetic */ GameProfile[] players;
        
        public GameProfile[] getPlayers() {
            return this.players;
        }
        
        public int getMaxPlayers() {
            return this.maxPlayers;
        }
        
        public void setPlayers(final GameProfile[] llllllllllllIllIIllIlIlIIIllIIll) {
            this.players = llllllllllllIllIIllIlIlIIIllIIll;
        }
        
        public PlayerCountData(final int llllllllllllIllIIllIlIlIIlIIIIIl, final int llllllllllllIllIIllIlIlIIlIIIIII) {
            this.maxPlayers = llllllllllllIllIIllIlIlIIlIIIIIl;
            this.onlinePlayerCount = llllllllllllIllIIllIlIlIIlIIIIII;
        }
        
        public int getOnlinePlayerCount() {
            return this.onlinePlayerCount;
        }
        
        public static class Serializer implements JsonDeserializer<PlayerCountData>, JsonSerializer<PlayerCountData>
        {
            private static final /* synthetic */ int[] lllllIIllllIl;
            private static final /* synthetic */ String[] lllllIIIlIlll;
            
            private static boolean lIlIlllIIIlIIII(final int lllllllllllllIlIlIlllIlIIIIIllII, final int lllllllllllllIlIlIlllIlIIIIIlIll) {
                return lllllllllllllIlIlIlllIlIIIIIllII >= lllllllllllllIlIlIlllIlIIIIIlIll;
            }
            
            static {
                lIlIlllIIIIllIl();
                lIlIllIlIlIIIIl();
            }
            
            private static String lIlIllIlIIlIlIl(final String lllllllllllllIlIlIlllIlIIIllIlll, final String lllllllllllllIlIlIlllIlIIIllIllI) {
                try {
                    final SecretKeySpec lllllllllllllIlIlIlllIlIIIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlllIlIIIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher lllllllllllllIlIlIlllIlIIIlllIll = Cipher.getInstance("Blowfish");
                    lllllllllllllIlIlIlllIlIIIlllIll.init(Serializer.lllllIIllllIl[2], lllllllllllllIlIlIlllIlIIIllllII);
                    return new String(lllllllllllllIlIlIlllIlIIIlllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlllIlIIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIlIlIlllIlIIIlllIlI) {
                    lllllllllllllIlIlIlllIlIIIlllIlI.printStackTrace();
                    return null;
                }
            }
            
            private static boolean lIlIlllIIIIlllI(final int lllllllllllllIlIlIlllIlIIIIIIIIl) {
                return lllllllllllllIlIlIlllIlIIIIIIIIl != 0;
            }
            
            private static boolean lIlIlllIIIlIIIl(final Object lllllllllllllIlIlIlllIlIIIIIIlIl) {
                return lllllllllllllIlIlIlllIlIIIIIIlIl != null;
            }
            
            public JsonElement serialize(final PlayerCountData lllllllllllllIlIlIlllIlIIlIllllI, final Type lllllllllllllIlIlIlllIlIIlIlllIl, final JsonSerializationContext lllllllllllllIlIlIlllIlIIlIlllII) {
                final JsonObject lllllllllllllIlIlIlllIlIIlIllIll = new JsonObject();
                lllllllllllllIlIlIlllIlIIlIllIll.addProperty(Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[9]], (Number)lllllllllllllIlIlIlllIlIIlIllllI.getMaxPlayers());
                lllllllllllllIlIlIlllIlIIlIllIll.addProperty(Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[10]], (Number)lllllllllllllIlIlIlllIlIIlIllllI.getOnlinePlayerCount());
                if (lIlIlllIIIlIIIl(lllllllllllllIlIlIlllIlIIlIllllI.getPlayers()) && lIlIlllIIIIllll(lllllllllllllIlIlIlllIlIIlIllllI.getPlayers().length)) {
                    final JsonArray lllllllllllllIlIlIlllIlIIlIllIlI = new JsonArray();
                    int lllllllllllllIlIlIlllIlIIlIllIIl = Serializer.lllllIIllllIl[0];
                    "".length();
                    if (((0x74 ^ 0x55 ^ (0xD2 ^ 0xA6)) & (0x19 ^ 0x6 ^ (0x6F ^ 0x25) ^ -" ".length())) < 0) {
                        return null;
                    }
                    while (!lIlIlllIIIlIIII(lllllllllllllIlIlIlllIlIIlIllIIl, lllllllllllllIlIlIlllIlIIlIllllI.getPlayers().length)) {
                        final JsonObject lllllllllllllIlIlIlllIlIIlIllIII = new JsonObject();
                        final UUID lllllllllllllIlIlIlllIlIIlIlIlll = lllllllllllllIlIlIlllIlIIlIllllI.getPlayers()[lllllllllllllIlIlIlllIlIIlIllIIl].getId();
                        final JsonObject jsonObject = lllllllllllllIlIlIlllIlIIlIllIII;
                        final String s = Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[11]];
                        String string;
                        if (lIlIlllIIIlIIlI(lllllllllllllIlIlIlllIlIIlIlIlll)) {
                            string = Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[12]];
                            "".length();
                            if ("   ".length() < ("  ".length() & ~"  ".length())) {
                                return null;
                            }
                        }
                        else {
                            string = lllllllllllllIlIlIlllIlIIlIlIlll.toString();
                        }
                        jsonObject.addProperty(s, string);
                        lllllllllllllIlIlIlllIlIIlIllIII.addProperty(Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[13]], lllllllllllllIlIlIlllIlIIlIllllI.getPlayers()[lllllllllllllIlIlIlllIlIIlIllIIl].getName());
                        lllllllllllllIlIlIlllIlIIlIllIlI.add((JsonElement)lllllllllllllIlIlIlllIlIIlIllIII);
                        ++lllllllllllllIlIlIlllIlIIlIllIIl;
                    }
                    lllllllllllllIlIlIlllIlIIlIllIll.add(Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[14]], (JsonElement)lllllllllllllIlIlIlllIlIIlIllIlI);
                }
                return (JsonElement)lllllllllllllIlIlIlllIlIIlIllIll;
            }
            
            private static boolean lIlIlllIIIlIIlI(final Object lllllllllllllIlIlIlllIlIIIIIIIll) {
                return lllllllllllllIlIlIlllIlIIIIIIIll == null;
            }
            
            private static boolean lIlIlllIIIlIIll(final int lllllllllllllIlIlIlllIlIIIIIlIII, final int lllllllllllllIlIlIlllIlIIIIIIlll) {
                return lllllllllllllIlIlIlllIlIIIIIlIII < lllllllllllllIlIlIlllIlIIIIIIlll;
            }
            
            private static boolean lIlIlllIIIIllll(final int lllllllllllllIlIlIlllIIlllllllll) {
                return lllllllllllllIlIlIlllIIlllllllll > 0;
            }
            
            public PlayerCountData deserialize(final JsonElement lllllllllllllIlIlIlllIlIIllIllIl, final Type lllllllllllllIlIlIlllIlIIlllIllI, final JsonDeserializationContext lllllllllllllIlIlIlllIlIIlllIlIl) throws JsonParseException {
                final JsonObject lllllllllllllIlIlIlllIlIIlllIlII = JsonUtils.getJsonObject(lllllllllllllIlIlIlllIlIIllIllIl, Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[0]]);
                final PlayerCountData lllllllllllllIlIlIlllIlIIlllIIll = new PlayerCountData(JsonUtils.getInt(lllllllllllllIlIlIlllIlIIlllIlII, Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[1]]), JsonUtils.getInt(lllllllllllllIlIlIlllIlIIlllIlII, Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[2]]));
                if (lIlIlllIIIIlllI(JsonUtils.isJsonArray(lllllllllllllIlIlIlllIlIIlllIlII, Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[3]]) ? 1 : 0)) {
                    final JsonArray lllllllllllllIlIlIlllIlIIlllIIlI = JsonUtils.getJsonArray(lllllllllllllIlIlIlllIlIIlllIlII, Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[4]]);
                    if (lIlIlllIIIIllll(lllllllllllllIlIlIlllIlIIlllIIlI.size())) {
                        final GameProfile[] lllllllllllllIlIlIlllIlIIlllIIIl = new GameProfile[lllllllllllllIlIlIlllIlIIlllIIlI.size()];
                        int lllllllllllllIlIlIlllIlIIlllIIII = Serializer.lllllIIllllIl[0];
                        "".length();
                        if (" ".length() <= 0) {
                            return null;
                        }
                        while (!lIlIlllIIIlIIII(lllllllllllllIlIlIlllIlIIlllIIII, lllllllllllllIlIlIlllIlIIlllIIIl.length)) {
                            final JsonObject lllllllllllllIlIlIlllIlIIllIllll = JsonUtils.getJsonObject(lllllllllllllIlIlIlllIlIIlllIIlI.get(lllllllllllllIlIlIlllIlIIlllIIII), String.valueOf(new StringBuilder(Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[5]]).append(lllllllllllllIlIlIlllIlIIlllIIII).append(Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[6]])));
                            final String lllllllllllllIlIlIlllIlIIllIlllI = JsonUtils.getString(lllllllllllllIlIlIlllIlIIllIllll, Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[7]]);
                            lllllllllllllIlIlIlllIlIIlllIIIl[lllllllllllllIlIlIlllIlIIlllIIII] = new GameProfile(UUID.fromString(lllllllllllllIlIlIlllIlIIllIlllI), JsonUtils.getString(lllllllllllllIlIlIlllIlIIllIllll, Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[8]]));
                            ++lllllllllllllIlIlIlllIlIIlllIIII;
                        }
                        lllllllllllllIlIlIlllIlIIlllIIll.setPlayers(lllllllllllllIlIlIlllIlIIlllIIIl);
                    }
                }
                return lllllllllllllIlIlIlllIlIIlllIIll;
            }
            
            private static void lIlIlllIIIIllIl() {
                (lllllIIllllIl = new int[16])[0] = ((0x9C ^ 0x80) & ~(0x43 ^ 0x5F));
                Serializer.lllllIIllllIl[1] = " ".length();
                Serializer.lllllIIllllIl[2] = "  ".length();
                Serializer.lllllIIllllIl[3] = "   ".length();
                Serializer.lllllIIllllIl[4] = (0x3C ^ 0x38);
                Serializer.lllllIIllllIl[5] = (0xA ^ 0x10 ^ (0x8E ^ 0x91));
                Serializer.lllllIIllllIl[6] = (0x2E ^ 0x0 ^ (0x44 ^ 0x6C));
                Serializer.lllllIIllllIl[7] = (0x9E ^ 0x86 ^ (0x86 ^ 0x99));
                Serializer.lllllIIllllIl[8] = (0xCC ^ 0xC4);
                Serializer.lllllIIllllIl[9] = (0x9C ^ 0x95);
                Serializer.lllllIIllllIl[10] = (0x51 ^ 0x5B);
                Serializer.lllllIIllllIl[11] = (0x9 ^ 0x2);
                Serializer.lllllIIllllIl[12] = (0x29 ^ 0x15 ^ (0x75 ^ 0x45));
                Serializer.lllllIIllllIl[13] = (0x2 ^ 0xF);
                Serializer.lllllIIllllIl[14] = (0x24 ^ 0x5A ^ (0xF0 ^ 0x80));
                Serializer.lllllIIllllIl[15] = (0x93 ^ 0x9C);
            }
            
            private static String lIlIllIlIIlIlII(String lllllllllllllIlIlIlllIlIIIlIIlII, final String lllllllllllllIlIlIlllIlIIIlIIIll) {
                lllllllllllllIlIlIlllIlIIIlIIlII = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIlllIlIIIlIIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder lllllllllllllIlIlIlllIlIIIlIIlll = new StringBuilder();
                final char[] lllllllllllllIlIlIlllIlIIIlIIllI = lllllllllllllIlIlIlllIlIIIlIIIll.toCharArray();
                int lllllllllllllIlIlIlllIlIIIlIIlIl = Serializer.lllllIIllllIl[0];
                final char lllllllllllllIlIlIlllIlIIIIlllll = (Object)((String)lllllllllllllIlIlIlllIlIIIlIIlII).toCharArray();
                final double lllllllllllllIlIlIlllIlIIIIllllI = lllllllllllllIlIlIlllIlIIIIlllll.length;
                short lllllllllllllIlIlIlllIlIIIIlllIl = (short)Serializer.lllllIIllllIl[0];
                while (lIlIlllIIIlIIll(lllllllllllllIlIlIlllIlIIIIlllIl, (int)lllllllllllllIlIlIlllIlIIIIllllI)) {
                    final char lllllllllllllIlIlIlllIlIIIlIlIlI = lllllllllllllIlIlIlllIlIIIIlllll[lllllllllllllIlIlIlllIlIIIIlllIl];
                    lllllllllllllIlIlIlllIlIIIlIIlll.append((char)(lllllllllllllIlIlIlllIlIIIlIlIlI ^ lllllllllllllIlIlIlllIlIIIlIIllI[lllllllllllllIlIlIlllIlIIIlIIlIl % lllllllllllllIlIlIlllIlIIIlIIllI.length]));
                    "".length();
                    ++lllllllllllllIlIlIlllIlIIIlIIlIl;
                    ++lllllllllllllIlIlIlllIlIIIIlllIl;
                    "".length();
                    if ("   ".length() <= 0) {
                        return null;
                    }
                }
                return String.valueOf(lllllllllllllIlIlIlllIlIIIlIIlll);
            }
            
            private static String lIlIllIlIIlIllI(final String lllllllllllllIlIlIlllIlIIIIlIIlI, final String lllllllllllllIlIlIlllIlIIIIlIIIl) {
                try {
                    final SecretKeySpec lllllllllllllIlIlIlllIlIIIIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlllIlIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), Serializer.lllllIIllllIl[8]), "DES");
                    final Cipher lllllllllllllIlIlIlllIlIIIIlIllI = Cipher.getInstance("DES");
                    lllllllllllllIlIlIlllIlIIIIlIllI.init(Serializer.lllllIIllllIl[2], lllllllllllllIlIlIlllIlIIIIlIlll);
                    return new String(lllllllllllllIlIlIlllIlIIIIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlllIlIIIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIlIlIlllIlIIIIlIlIl) {
                    lllllllllllllIlIlIlllIlIIIIlIlIl.printStackTrace();
                    return null;
                }
            }
            
            private static void lIlIllIlIlIIIIl() {
                (lllllIIIlIlll = new String[Serializer.lllllIIllllIl[15]])[Serializer.lllllIIllllIl[0]] = lIlIllIlIIlIlII("EhsRKgYQBA==", "bwpSc");
                Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[1]] = lIlIllIlIIlIlIl("+XiQdcx4jGQ=", "XUUCN");
                Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[2]] = lIlIllIlIIlIlII("GA0ZERkS", "wcuxw");
                Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[3]] = lIlIllIlIIlIlIl("uimaURriYHo=", "HmldV");
                Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[4]] = lIlIllIlIIlIlIl("7WB0FjozSxo=", "ArzGX");
                Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[5]] = lIlIllIlIIlIlII("BAApCz8GNw==", "tlHrZ");
                Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[6]] = lIlIllIlIIlIllI("vPjd8lWGgq4=", "tMtsk");
                Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[7]] = lIlIllIlIIlIllI("y14+jWLaK48=", "mVcVM");
                Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[8]] = lIlIllIlIIlIlII("Cg88Bw==", "dnQbH");
                Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[9]] = lIlIllIlIIlIlII("Bgs8", "kjDWC");
                Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[10]] = lIlIllIlIIlIlII("IQMNLQUr", "NmaDk");
                Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[11]] = lIlIllIlIIlIllI("PndE8TffsUs=", "MqpVl");
                Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[12]] = lIlIllIlIIlIllI("4K5gaKN5XfQ=", "XndGE");
                Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[13]] = lIlIllIlIIlIllI("Big+S29bXJQ=", "scKht");
                Serializer.lllllIIIlIlll[Serializer.lllllIIllllIl[14]] = lIlIllIlIIlIlII("IRcGHA43", "Rvklb");
            }
        }
    }
    
    public static class MinecraftProtocolVersionIdentifier
    {
        private final /* synthetic */ String name;
        private final /* synthetic */ int protocol;
        
        public int getProtocol() {
            return this.protocol;
        }
        
        public MinecraftProtocolVersionIdentifier(final String lllllllllllllIIIllIIIllIllllIlIl, final int lllllllllllllIIIllIIIllIllllIlII) {
            this.name = lllllllllllllIIIllIIIllIllllIlIl;
            this.protocol = lllllllllllllIIIllIIIllIllllIlII;
        }
        
        public String getName() {
            return this.name;
        }
        
        public static class Serializer implements JsonDeserializer<MinecraftProtocolVersionIdentifier>, JsonSerializer<MinecraftProtocolVersionIdentifier>
        {
            private static final /* synthetic */ String[] llIIIIIlIIIlll;
            private static final /* synthetic */ int[] llIIIIIlIIllIl;
            
            private static String lIIIIlllIIlIllII(final String llllllllllllIlllIllllIIlIlllIlIl, final String llllllllllllIlllIllllIIlIlllIIlI) {
                try {
                    final SecretKeySpec llllllllllllIlllIllllIIlIllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllllIIlIlllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher llllllllllllIlllIllllIIlIlllIlll = Cipher.getInstance("Blowfish");
                    llllllllllllIlllIllllIIlIlllIlll.init(Serializer.llIIIIIlIIllIl[2], llllllllllllIlllIllllIIlIllllIII);
                    return new String(llllllllllllIlllIllllIIlIlllIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllllIIlIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlllIllllIIlIlllIllI) {
                    llllllllllllIlllIllllIIlIlllIllI.printStackTrace();
                    return null;
                }
            }
            
            public JsonElement serialize(final MinecraftProtocolVersionIdentifier llllllllllllIlllIllllIIllIlIIllI, final Type llllllllllllIlllIllllIIllIlIlIIl, final JsonSerializationContext llllllllllllIlllIllllIIllIlIlIII) {
                final JsonObject llllllllllllIlllIllllIIllIlIIlll = new JsonObject();
                llllllllllllIlllIllllIIllIlIIlll.addProperty(Serializer.llIIIIIlIIIlll[Serializer.llIIIIIlIIllIl[3]], llllllllllllIlllIllllIIllIlIIllI.getName());
                llllllllllllIlllIllllIIllIlIIlll.addProperty(Serializer.llIIIIIlIIIlll[Serializer.llIIIIIlIIllIl[4]], (Number)llllllllllllIlllIllllIIllIlIIllI.getProtocol());
                return (JsonElement)llllllllllllIlllIllllIIllIlIIlll;
            }
            
            private static void lIIIIlllIIllIIII() {
                (llIIIIIlIIIlll = new String[Serializer.llIIIIIlIIllIl[5]])[Serializer.llIIIIIlIIllIl[0]] = lIIIIlllIIlIllII("bonpHweX2L4=", "KPdcs");
                Serializer.llIIIIIlIIIlll[Serializer.llIIIIIlIIllIl[1]] = lIIIIlllIIlIllIl("OysgLA==", "UJMIn");
                Serializer.llIIIIIlIIIlll[Serializer.llIIIIIlIIllIl[2]] = lIIIIlllIIlIllII("AUo/MMIOk1vJiEjl+UuztQ==", "qYBKK");
                Serializer.llIIIIIlIIIlll[Serializer.llIIIIIlIIllIl[3]] = lIIIIlllIIlIllIl("OwQXIQ==", "UezDv");
                Serializer.llIIIIIlIIIlll[Serializer.llIIIIIlIIllIl[4]] = lIIIIlllIIlIllII("jdgpkUUC6a4uawOanambCg==", "HSzUq");
            }
            
            private static String lIIIIlllIIlIllIl(String llllllllllllIlllIllllIIllIIIIlIl, final String llllllllllllIlllIllllIIllIIIlIIl) {
                llllllllllllIlllIllllIIllIIIIlIl = new String(Base64.getDecoder().decode(llllllllllllIlllIllllIIllIIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIlllIllllIIllIIIlIII = new StringBuilder();
                final char[] llllllllllllIlllIllllIIllIIIIlll = llllllllllllIlllIllllIIllIIIlIIl.toCharArray();
                int llllllllllllIlllIllllIIllIIIIllI = Serializer.llIIIIIlIIllIl[0];
                final int llllllllllllIlllIllllIIllIIIIIII = (Object)llllllllllllIlllIllllIIllIIIIlIl.toCharArray();
                final double llllllllllllIlllIllllIIlIlllllll = llllllllllllIlllIllllIIllIIIIIII.length;
                Exception llllllllllllIlllIllllIIlIllllllI = (Exception)Serializer.llIIIIIlIIllIl[0];
                while (lIIIIlllIIllIlll((int)llllllllllllIlllIllllIIlIllllllI, (int)llllllllllllIlllIllllIIlIlllllll)) {
                    final char llllllllllllIlllIllllIIllIIIlIll = llllllllllllIlllIllllIIllIIIIIII[llllllllllllIlllIllllIIlIllllllI];
                    llllllllllllIlllIllllIIllIIIlIII.append((char)(llllllllllllIlllIllllIIllIIIlIll ^ llllllllllllIlllIllllIIllIIIIlll[llllllllllllIlllIllllIIllIIIIllI % llllllllllllIlllIllllIIllIIIIlll.length]));
                    "".length();
                    ++llllllllllllIlllIllllIIllIIIIllI;
                    ++llllllllllllIlllIllllIIlIllllllI;
                    "".length();
                    if ((0xBE ^ 0xBA) == "   ".length()) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIlllIllllIIllIIIlIII);
            }
            
            private static void lIIIIlllIIllIllI() {
                (llIIIIIlIIllIl = new int[6])[0] = ((150 + 91 - 193 + 110 ^ 62 + 41 + 2 + 59) & (0xDF ^ 0xA8 ^ (0x66 ^ 0x2B) ^ -" ".length()));
                Serializer.llIIIIIlIIllIl[1] = " ".length();
                Serializer.llIIIIIlIIllIl[2] = "  ".length();
                Serializer.llIIIIIlIIllIl[3] = "   ".length();
                Serializer.llIIIIIlIIllIl[4] = (139 + 45 - 151 + 148 ^ 127 + 48 - 21 + 23);
                Serializer.llIIIIIlIIllIl[5] = (0x51 ^ 0x54);
            }
            
            private static boolean lIIIIlllIIllIlll(final int llllllllllllIlllIllllIIlIllIllIl, final int llllllllllllIlllIllllIIlIllIllII) {
                return llllllllllllIlllIllllIIlIllIllIl < llllllllllllIlllIllllIIlIllIllII;
            }
            
            public MinecraftProtocolVersionIdentifier deserialize(final JsonElement llllllllllllIlllIllllIIllIlIllll, final Type llllllllllllIlllIllllIIllIllIIlI, final JsonDeserializationContext llllllllllllIlllIllllIIllIllIIIl) throws JsonParseException {
                final JsonObject llllllllllllIlllIllllIIllIllIIII = JsonUtils.getJsonObject(llllllllllllIlllIllllIIllIlIllll, Serializer.llIIIIIlIIIlll[Serializer.llIIIIIlIIllIl[0]]);
                return new MinecraftProtocolVersionIdentifier(JsonUtils.getString(llllllllllllIlllIllllIIllIllIIII, Serializer.llIIIIIlIIIlll[Serializer.llIIIIIlIIllIl[1]]), JsonUtils.getInt(llllllllllllIlllIllllIIllIllIIII, Serializer.llIIIIIlIIIlll[Serializer.llIIIIIlIIllIl[2]]));
            }
            
            static {
                lIIIIlllIIllIllI();
                lIIIIlllIIllIIII();
            }
        }
    }
}
