// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.server.management;

import com.google.gson.JsonDeserializationContext;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonDeserializer;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.BufferedReader;
import com.google.gson.JsonParseException;
import java.io.FileNotFoundException;
import org.apache.commons.io.IOUtils;
import java.io.Reader;
import com.google.common.io.Files;
import com.google.common.base.Charsets;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import com.google.common.collect.Iterators;
import java.util.List;
import com.google.gson.GsonBuilder;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Calendar;
import java.util.Date;
import com.mojang.authlib.GameProfileRepository;
import net.minecraft.entity.player.EntityPlayer;
import com.mojang.authlib.Agent;
import com.mojang.authlib.ProfileLookupCallback;
import net.minecraft.server.MinecraftServer;
import java.text.SimpleDateFormat;
import com.mojang.authlib.GameProfile;
import java.util.LinkedList;
import java.lang.reflect.ParameterizedType;
import java.io.File;
import java.util.UUID;
import com.google.gson.Gson;
import java.util.Map;

public class PlayerProfileCache
{
    private final /* synthetic */ Map<String, ProfileEntry> usernameToProfileEntryMap;
    protected final /* synthetic */ Gson gson;
    private static final /* synthetic */ String[] lIIlIIIIlIIlll;
    private final /* synthetic */ Map<UUID, ProfileEntry> uuidToProfileEntryMap;
    private final /* synthetic */ File usercacheFile;
    private static final /* synthetic */ int[] lIIlIIIIlIlIII;
    private static final /* synthetic */ ParameterizedType TYPE;
    private final /* synthetic */ LinkedList<GameProfile> gameProfiles;
    public static final /* synthetic */ SimpleDateFormat dateFormat;
    private final /* synthetic */ MinecraftServer mcServer;
    
    private static GameProfile getGameProfile(final MinecraftServer lllllllllllllIIlllIllIlllIIllIII, final String lllllllllllllIIlllIllIlllIIlIlll) {
        final GameProfile[] lllllllllllllIIlllIllIlllIIlllII = new GameProfile[PlayerProfileCache.lIIlIIIIlIlIII[1]];
        final ProfileLookupCallback lllllllllllllIIlllIllIlllIIllIll = (ProfileLookupCallback)new ProfileLookupCallback() {
            private static final /* synthetic */ int[] llIIllIIIIIIIl;
            
            public void onProfileLookupFailed(final GameProfile llllllllllllIlllIIIIllIIllIIllII, final Exception llllllllllllIlllIIIIllIIllIIlIll) {
                lllllllllllllIIlllIllIlllIIlllII[PlayerProfileCache$2.llIIllIIIIIIIl[0]] = null;
            }
            
            static {
                lIIIlllIIIllIlII();
            }
            
            public void onProfileLookupSucceeded(final GameProfile llllllllllllIlllIIIIllIIllIlIIIl) {
                lllllllllllllIIlllIllIlllIIlllII[PlayerProfileCache$2.llIIllIIIIIIIl[0]] = llllllllllllIlllIIIIllIIllIlIIIl;
            }
            
            private static void lIIIlllIIIllIlII() {
                (llIIllIIIIIIIl = new int[1])[0] = ((0x86 ^ 0xA1) & ~(0x8E ^ 0xA9));
            }
        };
        final GameProfileRepository gameProfileRepository = lllllllllllllIIlllIllIlllIIllIII.getGameProfileRepository();
        final String[] array = new String[PlayerProfileCache.lIIlIIIIlIlIII[1]];
        array[PlayerProfileCache.lIIlIIIIlIlIII[0]] = lllllllllllllIIlllIllIlllIIlIlll;
        gameProfileRepository.findProfilesByNames(array, Agent.MINECRAFT, lllllllllllllIIlllIllIlllIIllIll);
        if (llIIlIIllIIIllI(lllllllllllllIIlllIllIlllIIllIII.isServerInOnlineMode() ? 1 : 0) && llIIlIIllIIIlll(lllllllllllllIIlllIllIlllIIlllII[PlayerProfileCache.lIIlIIIIlIlIII[0]])) {
            final UUID lllllllllllllIIlllIllIlllIIllIlI = EntityPlayer.getUUID(new GameProfile((UUID)null, lllllllllllllIIlllIllIlllIIlIlll));
            final GameProfile lllllllllllllIIlllIllIlllIIllIIl = new GameProfile(lllllllllllllIIlllIllIlllIIllIlI, lllllllllllllIIlllIllIlllIIlIlll);
            lllllllllllllIIlllIllIlllIIllIll.onProfileLookupSucceeded(lllllllllllllIIlllIllIlllIIllIIl);
        }
        return lllllllllllllIIlllIllIlllIIlllII[PlayerProfileCache.lIIlIIIIlIlIII[0]];
    }
    
    private ProfileEntry getByUUID(final UUID lllllllllllllIIlllIllIllIlIIlllI) {
        final ProfileEntry lllllllllllllIIlllIllIllIlIlIIIl = this.uuidToProfileEntryMap.get(lllllllllllllIIlllIllIllIlIIlllI);
        if (llIIlIIllIIlIlI(lllllllllllllIIlllIllIllIlIlIIIl)) {
            final GameProfile lllllllllllllIIlllIllIllIlIlIIII = lllllllllllllIIlllIllIllIlIlIIIl.getGameProfile();
            this.gameProfiles.remove(lllllllllllllIIlllIllIllIlIlIIII);
            "".length();
            this.gameProfiles.addFirst(lllllllllllllIIlllIllIllIlIlIIII);
        }
        return lllllllllllllIIlllIllIllIlIlIIIl;
    }
    
    private static boolean llIIlIIllIIIlll(final Object lllllllllllllIIlllIllIlIllllllIl) {
        return lllllllllllllIIlllIllIlIllllllIl == null;
    }
    
    private void addEntry(final GameProfile lllllllllllllIIlllIllIllIlllllII, Date lllllllllllllIIlllIllIllIllllIll) {
        final UUID lllllllllllllIIlllIllIlllIIIIIlI = lllllllllllllIIlllIllIllIlllllII.getId();
        if (llIIlIIllIIIlll(lllllllllllllIIlllIllIllIllllIll)) {
            final Calendar lllllllllllllIIlllIllIlllIIIIIIl = Calendar.getInstance();
            lllllllllllllIIlllIllIlllIIIIIIl.setTime(new Date());
            lllllllllllllIIlllIllIlllIIIIIIl.add(PlayerProfileCache.lIIlIIIIlIlIII[2], PlayerProfileCache.lIIlIIIIlIlIII[1]);
            lllllllllllllIIlllIllIllIllllIll = lllllllllllllIIlllIllIlllIIIIIIl.getTime();
        }
        final String lllllllllllllIIlllIllIlllIIIIIII = lllllllllllllIIlllIllIllIlllllII.getName().toLowerCase(Locale.ROOT);
        final ProfileEntry lllllllllllllIIlllIllIllIlllllll = new ProfileEntry(lllllllllllllIIlllIllIllIlllllII, lllllllllllllIIlllIllIllIllllIll, (ProfileEntry)null);
        if (llIIlIIllIIlIII(this.uuidToProfileEntryMap.containsKey(lllllllllllllIIlllIllIlllIIIIIlI) ? 1 : 0)) {
            final ProfileEntry lllllllllllllIIlllIllIllIllllllI = this.uuidToProfileEntryMap.get(lllllllllllllIIlllIllIlllIIIIIlI);
            this.usernameToProfileEntryMap.remove(lllllllllllllIIlllIllIllIllllllI.getGameProfile().getName().toLowerCase(Locale.ROOT));
            "".length();
            this.gameProfiles.remove(lllllllllllllIIlllIllIllIlllllII);
            "".length();
        }
        this.usernameToProfileEntryMap.put(lllllllllllllIIlllIllIllIlllllII.getName().toLowerCase(Locale.ROOT), lllllllllllllIIlllIllIllIlllllll);
        "".length();
        this.uuidToProfileEntryMap.put(lllllllllllllIIlllIllIlllIIIIIlI, lllllllllllllIIlllIllIllIlllllll);
        "".length();
        this.gameProfiles.addFirst(lllllllllllllIIlllIllIllIlllllII);
        this.save();
    }
    
    public GameProfile getProfileByUUID(final UUID lllllllllllllIIlllIllIllIlIlllII) {
        final ProfileEntry lllllllllllllIIlllIllIllIlIllIll = this.uuidToProfileEntryMap.get(lllllllllllllIIlllIllIllIlIlllII);
        GameProfile gameProfile;
        if (llIIlIIllIIIlll(lllllllllllllIIlllIllIllIlIllIll)) {
            gameProfile = null;
            "".length();
            if ("  ".length() >= (0x84 ^ 0x80)) {
                return null;
            }
        }
        else {
            gameProfile = lllllllllllllIIlllIllIllIlIllIll.getGameProfile();
        }
        return gameProfile;
    }
    
    private static boolean llIIlIIllIIllII(final int lllllllllllllIIlllIllIllIIIIIIlI, final int lllllllllllllIIlllIllIllIIIIIIIl) {
        return lllllllllllllIIlllIllIllIIIIIIlI < lllllllllllllIIlllIllIllIIIIIIIl;
    }
    
    private static void llIIlIIllIIIlIl() {
        (lIIlIIIIlIlIII = new int[4])[0] = ((0xA8 ^ 0x98) & ~(0xB4 ^ 0x84));
        PlayerProfileCache.lIIlIIIIlIlIII[1] = " ".length();
        PlayerProfileCache.lIIlIIIIlIlIII[2] = "  ".length();
        PlayerProfileCache.lIIlIIIIlIlIII[3] = (0xFFFFCBEE & 0x37F9);
    }
    
    public PlayerProfileCache(final MinecraftServer lllllllllllllIIlllIllIlllIlIIlll, final File lllllllllllllIIlllIllIlllIlIIllI) {
        this.usernameToProfileEntryMap = (Map<String, ProfileEntry>)Maps.newHashMap();
        this.uuidToProfileEntryMap = (Map<UUID, ProfileEntry>)Maps.newHashMap();
        this.gameProfiles = (LinkedList<GameProfile>)Lists.newLinkedList();
        this.mcServer = lllllllllllllIIlllIllIlllIlIIlll;
        this.usercacheFile = lllllllllllllIIlllIllIlllIlIIllI;
        final GsonBuilder lllllllllllllIIlllIllIlllIlIlIIl = new GsonBuilder();
        lllllllllllllIIlllIllIlllIlIlIIl.registerTypeHierarchyAdapter((Class)ProfileEntry.class, (Object)new Serializer((Serializer)null));
        "".length();
        this.gson = lllllllllllllIIlllIllIlllIlIlIIl.create();
        this.load();
    }
    
    private static boolean llIIlIIllIIlIlI(final Object lllllllllllllIIlllIllIlIllllllll) {
        return lllllllllllllIIlllIllIlIllllllll != null;
    }
    
    private List<ProfileEntry> getEntriesWithLimit(final int lllllllllllllIIlllIllIllIIlIIllI) {
        final ArrayList<ProfileEntry> lllllllllllllIIlllIllIllIIlIIlIl = (ArrayList<ProfileEntry>)Lists.newArrayList();
        final String lllllllllllllIIlllIllIllIIIllllI = (String)Lists.newArrayList(Iterators.limit((Iterator)this.gameProfiles.iterator(), lllllllllllllIIlllIllIllIIlIIllI)).iterator();
        "".length();
        if (-"  ".length() >= 0) {
            return null;
        }
        while (!llIIlIIllIIIllI(((Iterator)lllllllllllllIIlllIllIllIIIllllI).hasNext() ? 1 : 0)) {
            final GameProfile lllllllllllllIIlllIllIllIIlIIlII = ((Iterator<GameProfile>)lllllllllllllIIlllIllIllIIIllllI).next();
            final ProfileEntry lllllllllllllIIlllIllIllIIlIIIll = this.getByUUID(lllllllllllllIIlllIllIllIIlIIlII.getId());
            if (llIIlIIllIIlIlI(lllllllllllllIIlllIllIllIIlIIIll)) {
                lllllllllllllIIlllIllIllIIlIIlIl.add(lllllllllllllIIlllIllIllIIlIIIll);
                "".length();
            }
        }
        return lllllllllllllIIlllIllIllIIlIIlIl;
    }
    
    private static String llIIlIIllIIIIll(String lllllllllllllIIlllIllIllIIIIllIl, final String lllllllllllllIIlllIllIllIIIIllII) {
        lllllllllllllIIlllIllIllIIIIllIl = new String(Base64.getDecoder().decode(lllllllllllllIIlllIllIllIIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllIllIllIIIlIIII = new StringBuilder();
        final char[] lllllllllllllIIlllIllIllIIIIllll = lllllllllllllIIlllIllIllIIIIllII.toCharArray();
        int lllllllllllllIIlllIllIllIIIIlllI = PlayerProfileCache.lIIlIIIIlIlIII[0];
        final double lllllllllllllIIlllIllIllIIIIlIII = (Object)lllllllllllllIIlllIllIllIIIIllIl.toCharArray();
        final boolean lllllllllllllIIlllIllIllIIIIIlll = lllllllllllllIIlllIllIllIIIIlIII.length != 0;
        char lllllllllllllIIlllIllIllIIIIIllI = (char)PlayerProfileCache.lIIlIIIIlIlIII[0];
        while (llIIlIIllIIllII(lllllllllllllIIlllIllIllIIIIIllI, lllllllllllllIIlllIllIllIIIIIlll ? 1 : 0)) {
            final char lllllllllllllIIlllIllIllIIIlIIll = lllllllllllllIIlllIllIllIIIIlIII[lllllllllllllIIlllIllIllIIIIIllI];
            lllllllllllllIIlllIllIllIIIlIIII.append((char)(lllllllllllllIIlllIllIllIIIlIIll ^ lllllllllllllIIlllIllIllIIIIllll[lllllllllllllIIlllIllIllIIIIlllI % lllllllllllllIIlllIllIllIIIIllll.length]));
            "".length();
            ++lllllllllllllIIlllIllIllIIIIlllI;
            ++lllllllllllllIIlllIllIllIIIIIllI;
            "".length();
            if ("  ".length() <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllIllIllIIIlIIII);
    }
    
    private static boolean llIIlIIllIIIllI(final int lllllllllllllIIlllIllIlIlllllIIl) {
        return lllllllllllllIIlllIllIlIlllllIIl == 0;
    }
    
    private static void llIIlIIllIIIlII() {
        (lIIlIIIIlIIlll = new String[PlayerProfileCache.lIIlIIIIlIlIII[1]])[PlayerProfileCache.lIIlIIIIlIlIII[0]] = llIIlIIllIIIIll("DA8tOn84O3knNlU+HHk/GEwnMHIv", "uvTCR");
    }
    
    public String[] getUsernames() {
        final List<String> lllllllllllllIIlllIllIllIllIIIll = (List<String>)Lists.newArrayList((Iterable)this.usernameToProfileEntryMap.keySet());
        return lllllllllllllIIlllIllIllIllIIIll.toArray(new String[lllllllllllllIIlllIllIllIllIIIll.size()]);
    }
    
    public void addEntry(final GameProfile lllllllllllllIIlllIllIlllIIIllll) {
        this.addEntry(lllllllllllllIIlllIllIlllIIIllll, null);
    }
    
    public GameProfile getGameProfileForUsername(final String lllllllllllllIIlllIllIllIlllIIII) {
        final String lllllllllllllIIlllIllIllIllIllll = lllllllllllllIIlllIllIllIlllIIII.toLowerCase(Locale.ROOT);
        ProfileEntry lllllllllllllIIlllIllIllIllIlllI = this.usernameToProfileEntryMap.get(lllllllllllllIIlllIllIllIllIllll);
        if (llIIlIIllIIlIlI(lllllllllllllIIlllIllIllIllIlllI) && llIIlIIllIIlIll(llIIlIIllIIlIIl(new Date().getTime(), lllllllllllllIIlllIllIllIllIlllI.expirationDate.getTime()))) {
            this.uuidToProfileEntryMap.remove(lllllllllllllIIlllIllIllIllIlllI.getGameProfile().getId());
            "".length();
            this.usernameToProfileEntryMap.remove(lllllllllllllIIlllIllIllIllIlllI.getGameProfile().getName().toLowerCase(Locale.ROOT));
            "".length();
            this.gameProfiles.remove(lllllllllllllIIlllIllIllIllIlllI.getGameProfile());
            "".length();
            lllllllllllllIIlllIllIllIllIlllI = null;
        }
        if (llIIlIIllIIlIlI(lllllllllllllIIlllIllIllIllIlllI)) {
            final GameProfile lllllllllllllIIlllIllIllIllIllIl = lllllllllllllIIlllIllIllIllIlllI.getGameProfile();
            this.gameProfiles.remove(lllllllllllllIIlllIllIllIllIllIl);
            "".length();
            this.gameProfiles.addFirst(lllllllllllllIIlllIllIllIllIllIl);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            final GameProfile lllllllllllllIIlllIllIllIllIllII = getGameProfile(this.mcServer, lllllllllllllIIlllIllIllIllIllll);
            if (llIIlIIllIIlIlI(lllllllllllllIIlllIllIllIllIllII)) {
                this.addEntry(lllllllllllllIIlllIllIllIllIllII);
                lllllllllllllIIlllIllIllIllIlllI = this.usernameToProfileEntryMap.get(lllllllllllllIIlllIllIllIllIllll);
            }
        }
        this.save();
        GameProfile gameProfile;
        if (llIIlIIllIIIlll(lllllllllllllIIlllIllIllIllIlllI)) {
            gameProfile = null;
            "".length();
            if (-" ".length() >= ((0xF ^ 0x26) & ~(0x77 ^ 0x5E))) {
                return null;
            }
        }
        else {
            gameProfile = lllllllllllllIIlllIllIllIllIlllI.getGameProfile();
        }
        return gameProfile;
    }
    
    private static boolean llIIlIIllIIlIII(final int lllllllllllllIIlllIllIlIlllllIll) {
        return lllllllllllllIIlllIllIlIlllllIll != 0;
    }
    
    static {
        llIIlIIllIIIlIl();
        llIIlIIllIIIlII();
        dateFormat = new SimpleDateFormat(PlayerProfileCache.lIIlIIIIlIIlll[PlayerProfileCache.lIIlIIIIlIlIII[0]]);
        TYPE = new ParameterizedType() {
            private static final /* synthetic */ int[] lIIIlIIlIlllII;
            
            static {
                lIllllllIlIlIlI();
            }
            
            @Override
            public Type getRawType() {
                return List.class;
            }
            
            private static void lIllllllIlIlIlI() {
                (lIIIlIIlIlllII = new int[2])[0] = " ".length();
                PlayerProfileCache$1.lIIIlIIlIlllII[1] = ((67 + 130 - 117 + 69 ^ 145 + 97 - 223 + 152) & (216 + 110 - 94 + 18 ^ 151 + 6 - 27 + 66 ^ -" ".length()));
            }
            
            @Override
            public Type getOwnerType() {
                return null;
            }
            
            @Override
            public Type[] getActualTypeArguments() {
                final Type[] array = new Type[PlayerProfileCache$1.lIIIlIIlIlllII[0]];
                array[PlayerProfileCache$1.lIIIlIIlIlllII[1]] = ProfileEntry.class;
                return array;
            }
        };
    }
    
    public void load() {
        BufferedReader lllllllllllllIIlllIllIllIlIIIlII = null;
        try {
            lllllllllllllIIlllIllIllIlIIIlII = Files.newReader(this.usercacheFile, Charsets.UTF_8);
            final List<ProfileEntry> lllllllllllllIIlllIllIllIlIIIIll = (List<ProfileEntry>)this.gson.fromJson((Reader)lllllllllllllIIlllIllIllIlIIIlII, (Type)PlayerProfileCache.TYPE);
            this.usernameToProfileEntryMap.clear();
            this.uuidToProfileEntryMap.clear();
            this.gameProfiles.clear();
            final short lllllllllllllIIlllIllIllIIllllIl = (short)Lists.reverse((List)lllllllllllllIIlllIllIllIlIIIIll).iterator();
            "".length();
            if ("   ".length() <= ((0x76 ^ 0x72) & ~(0x44 ^ 0x40))) {
                return;
            }
            while (!llIIlIIllIIIllI(((Iterator)lllllllllllllIIlllIllIllIIllllIl).hasNext() ? 1 : 0)) {
                final ProfileEntry lllllllllllllIIlllIllIllIlIIIIlI = ((Iterator<ProfileEntry>)lllllllllllllIIlllIllIllIIllllIl).next();
                if (llIIlIIllIIlIlI(lllllllllllllIIlllIllIllIlIIIIlI)) {
                    this.addEntry(lllllllllllllIIlllIllIllIlIIIIlI.getGameProfile(), lllllllllllllIIlllIllIllIlIIIIlI.getExpirationDate());
                }
            }
            "".length();
            if ("   ".length() == 0) {
                return;
            }
        }
        catch (FileNotFoundException lllllllllllllIIlllIllIllIIllllll) {
            IOUtils.closeQuietly((Reader)lllllllllllllIIlllIllIllIlIIIlII);
            "".length();
            if (((0x38 ^ 0x50 ^ (0x9A ^ 0xB7)) & (0x5 ^ 0x79 ^ (0x3B ^ 0x2) ^ -" ".length())) > 0) {
                return;
            }
            return;
        }
        catch (JsonParseException lllllllllllllIIlllIllIllIIllllll) {
            IOUtils.closeQuietly((Reader)lllllllllllllIIlllIllIllIlIIIlII);
            "".length();
            if (-(0xCE ^ 0xC1 ^ (0x72 ^ 0x79)) >= 0) {
                return;
            }
            return;
        }
        finally {
            IOUtils.closeQuietly((Reader)lllllllllllllIIlllIllIllIlIIIlII);
        }
        IOUtils.closeQuietly((Reader)lllllllllllllIIlllIllIllIlIIIlII);
    }
    
    private static int llIIlIIllIIlIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public void save() {
        final String lllllllllllllIIlllIllIllIIllIlIl = this.gson.toJson((Object)this.getEntriesWithLimit(PlayerProfileCache.lIIlIIIIlIlIII[3]));
        BufferedWriter lllllllllllllIIlllIllIllIIllIlII = null;
        try {
            lllllllllllllIIlllIllIllIIllIlII = Files.newWriter(this.usercacheFile, Charsets.UTF_8);
            lllllllllllllIIlllIllIllIIllIlII.write(lllllllllllllIIlllIllIllIIllIlIl);
        }
        catch (FileNotFoundException lllllllllllllIIlllIllIllIIlIllll) {
            IOUtils.closeQuietly((Writer)lllllllllllllIIlllIllIllIIllIlII);
            "".length();
            if (" ".length() < " ".length()) {
                return;
            }
        }
        catch (IOException lllllllllllllIIlllIllIllIIllIIll) {}
        finally {
            IOUtils.closeQuietly((Writer)lllllllllllllIIlllIllIllIIllIlII);
        }
    }
    
    private static boolean llIIlIIllIIlIll(final int lllllllllllllIIlllIllIlIllllIlll) {
        return lllllllllllllIIlllIllIlIllllIlll >= 0;
    }
    
    class Serializer implements JsonDeserializer<ProfileEntry>, JsonSerializer<ProfileEntry>
    {
        private static final /* synthetic */ int[] lIlIllIIlIIllI;
        private static final /* synthetic */ String[] lIlIllIIlIIlIl;
        
        private static String llllIIIIllIlIII(String lllllllllllllIIIIlllIIIIllllIlll, final String lllllllllllllIIIIlllIIIIlllllIll) {
            lllllllllllllIIIIlllIIIIllllIlll = new String(Base64.getDecoder().decode(lllllllllllllIIIIlllIIIIllllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIIIlllIIIIlllllIlI = new StringBuilder();
            final char[] lllllllllllllIIIIlllIIIIlllllIIl = lllllllllllllIIIIlllIIIIlllllIll.toCharArray();
            int lllllllllllllIIIIlllIIIIlllllIII = Serializer.lIlIllIIlIIllI[0];
            final char lllllllllllllIIIIlllIIIIllllIIlI = (Object)lllllllllllllIIIIlllIIIIllllIlll.toCharArray();
            final long lllllllllllllIIIIlllIIIIllllIIIl = lllllllllllllIIIIlllIIIIllllIIlI.length;
            short lllllllllllllIIIIlllIIIIllllIIII = (short)Serializer.lIlIllIIlIIllI[0];
            while (llllIIIIlllIIII(lllllllllllllIIIIlllIIIIllllIIII, (int)lllllllllllllIIIIlllIIIIllllIIIl)) {
                final char lllllllllllllIIIIlllIIIIllllllIl = lllllllllllllIIIIlllIIIIllllIIlI[lllllllllllllIIIIlllIIIIllllIIII];
                lllllllllllllIIIIlllIIIIlllllIlI.append((char)(lllllllllllllIIIIlllIIIIllllllIl ^ lllllllllllllIIIIlllIIIIlllllIIl[lllllllllllllIIIIlllIIIIlllllIII % lllllllllllllIIIIlllIIIIlllllIIl.length]));
                "".length();
                ++lllllllllllllIIIIlllIIIIlllllIII;
                ++lllllllllllllIIIIlllIIIIllllIIII;
                "".length();
                if (" ".length() < 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIIIlllIIIIlllllIlI);
        }
        
        public JsonElement serialize(final ProfileEntry lllllllllllllIIIIlllIIIlIlIIlIII, final Type lllllllllllllIIIIlllIIIlIlIIIlll, final JsonSerializationContext lllllllllllllIIIIlllIIIlIlIIIllI) {
            final JsonObject lllllllllllllIIIIlllIIIlIlIIIlIl = new JsonObject();
            lllllllllllllIIIIlllIIIlIlIIIlIl.addProperty(Serializer.lIlIllIIlIIlIl[Serializer.lIlIllIIlIIllI[0]], lllllllllllllIIIIlllIIIlIlIIlIII.getGameProfile().getName());
            final UUID lllllllllllllIIIIlllIIIlIlIIIlII = lllllllllllllIIIIlllIIIlIlIIlIII.getGameProfile().getId();
            final JsonObject jsonObject = lllllllllllllIIIIlllIIIlIlIIIlIl;
            final String s = Serializer.lIlIllIIlIIlIl[Serializer.lIlIllIIlIIllI[1]];
            String string;
            if (llllIIIIllIllIl(lllllllllllllIIIIlllIIIlIlIIIlII)) {
                string = Serializer.lIlIllIIlIIlIl[Serializer.lIlIllIIlIIllI[2]];
                "".length();
                if (((0x6 ^ 0x17) & ~(0x5F ^ 0x4E)) != 0x0) {
                    return null;
                }
            }
            else {
                string = lllllllllllllIIIIlllIIIlIlIIIlII.toString();
            }
            jsonObject.addProperty(s, string);
            lllllllllllllIIIIlllIIIlIlIIIlIl.addProperty(Serializer.lIlIllIIlIIlIl[Serializer.lIlIllIIlIIllI[3]], PlayerProfileCache.dateFormat.format(lllllllllllllIIIIlllIIIlIlIIlIII.getExpirationDate()));
            return (JsonElement)lllllllllllllIIIIlllIIIlIlIIIlIl;
        }
        
        private static String llllIIIIllIlIIl(final String lllllllllllllIIIIlllIIIIlllIIlIl, final String lllllllllllllIIIIlllIIIIlllIIllI) {
            try {
                final SecretKeySpec lllllllllllllIIIIlllIIIIlllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlllIIIIlllIIllI.getBytes(StandardCharsets.UTF_8)), Serializer.lIlIllIIlIIllI[8]), "DES");
                final Cipher lllllllllllllIIIIlllIIIIlllIlIIl = Cipher.getInstance("DES");
                lllllllllllllIIIIlllIIIIlllIlIIl.init(Serializer.lIlIllIIlIIllI[2], lllllllllllllIIIIlllIIIIlllIlIlI);
                return new String(lllllllllllllIIIIlllIIIIlllIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlllIIIIlllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIIlllIIIIlllIlIII) {
                lllllllllllllIIIIlllIIIIlllIlIII.printStackTrace();
                return null;
            }
        }
        
        public ProfileEntry deserialize(final JsonElement lllllllllllllIIIIlllIIIlIIlIIlII, final Type lllllllllllllIIIIlllIIIlIIllIIll, final JsonDeserializationContext lllllllllllllIIIIlllIIIlIIllIIlI) throws JsonParseException {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokevirtual   com/google/gson/JsonElement.isJsonObject:()Z
            //     4: invokestatic    net/minecraft/server/management/PlayerProfileCache$Serializer.llllIIIIllIlllI:(I)Z
            //     7: ifeq            223
            //    10: aload_1         /* lllllllllllllIIIIlllIIIlIIllIlII */
            //    11: invokevirtual   com/google/gson/JsonElement.getAsJsonObject:()Lcom/google/gson/JsonObject;
            //    14: astore          lllllllllllllIIIIlllIIIlIIllIIIl
            //    16: aload           lllllllllllllIIIIlllIIIlIIllIIIl
            //    18: getstatic       net/minecraft/server/management/PlayerProfileCache$Serializer.lIlIllIIlIIlIl:[Ljava/lang/String;
            //    21: getstatic       net/minecraft/server/management/PlayerProfileCache$Serializer.lIlIllIIlIIllI:[I
            //    24: iconst_4       
            //    25: iaload         
            //    26: aaload         
            //    27: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
            //    30: astore          lllllllllllllIIIIlllIIIlIIllIIII
            //    32: aload           lllllllllllllIIIIlllIIIlIIllIIIl
            //    34: getstatic       net/minecraft/server/management/PlayerProfileCache$Serializer.lIlIllIIlIIlIl:[Ljava/lang/String;
            //    37: getstatic       net/minecraft/server/management/PlayerProfileCache$Serializer.lIlIllIIlIIllI:[I
            //    40: iconst_5       
            //    41: iaload         
            //    42: aaload         
            //    43: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
            //    46: astore          lllllllllllllIIIIlllIIIlIIlIllll
            //    48: aload           lllllllllllllIIIIlllIIIlIIllIIIl
            //    50: getstatic       net/minecraft/server/management/PlayerProfileCache$Serializer.lIlIllIIlIIlIl:[Ljava/lang/String;
            //    53: getstatic       net/minecraft/server/management/PlayerProfileCache$Serializer.lIlIllIIlIIllI:[I
            //    56: bipush          6
            //    58: iaload         
            //    59: aaload         
            //    60: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
            //    63: astore          lllllllllllllIIIIlllIIIlIIlIlllI
            //    65: aload           lllllllllllllIIIIlllIIIlIIllIIII
            //    67: invokestatic    net/minecraft/server/management/PlayerProfileCache$Serializer.llllIIIIllIllll:(Ljava/lang/Object;)Z
            //    70: ifeq            221
            //    73: aload           lllllllllllllIIIIlllIIIlIIlIllll
            //    75: invokestatic    net/minecraft/server/management/PlayerProfileCache$Serializer.llllIIIIllIllll:(Ljava/lang/Object;)Z
            //    78: ifeq            221
            //    81: aload           lllllllllllllIIIIlllIIIlIIlIllll
            //    83: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
            //    86: astore          lllllllllllllIIIIlllIIIlIIlIllIl
            //    88: aload           lllllllllllllIIIIlllIIIlIIllIIII
            //    90: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
            //    93: astore          lllllllllllllIIIIlllIIIlIIlIllII
            //    95: aconst_null    
            //    96: astore          lllllllllllllIIIIlllIIIlIIlIlIll
            //    98: aload           lllllllllllllIIIIlllIIIlIIlIlllI
            //   100: invokestatic    net/minecraft/server/management/PlayerProfileCache$Serializer.llllIIIIllIllll:(Ljava/lang/Object;)Z
            //   103: ifeq            136
            //   106: getstatic       net/minecraft/server/management/PlayerProfileCache.dateFormat:Ljava/text/SimpleDateFormat;
            //   109: aload           lllllllllllllIIIIlllIIIlIIlIlllI
            //   111: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
            //   114: invokevirtual   java/text/SimpleDateFormat.parse:(Ljava/lang/String;)Ljava/util/Date;
            //   117: astore          lllllllllllllIIIIlllIIIlIIlIlIll
            //   119: ldc             ""
            //   121: invokevirtual   java/lang/String.length:()I
            //   124: pop            
            //   125: aconst_null    
            //   126: ifnull          136
            //   129: aconst_null    
            //   130: areturn        
            //   131: astore          lllllllllllllIIIIlllIIIlIIlIlIlI
            //   133: aconst_null    
            //   134: astore          lllllllllllllIIIIlllIIIlIIlIlIll
            //   136: aload           lllllllllllllIIIIlllIIIlIIlIllII
            //   138: invokestatic    net/minecraft/server/management/PlayerProfileCache$Serializer.llllIIIIllIllll:(Ljava/lang/Object;)Z
            //   141: ifeq            219
            //   144: aload           lllllllllllllIIIIlllIIIlIIlIllIl
            //   146: invokestatic    net/minecraft/server/management/PlayerProfileCache$Serializer.llllIIIIllIllll:(Ljava/lang/Object;)Z
            //   149: ifeq            219
            //   152: aload           lllllllllllllIIIIlllIIIlIIlIllIl
            //   154: invokestatic    java/util/UUID.fromString:(Ljava/lang/String;)Ljava/util/UUID;
            //   157: astore          lllllllllllllIIIIlllIIIlIIlIlIIl
            //   159: ldc             ""
            //   161: invokevirtual   java/lang/String.length:()I
            //   164: pop            
            //   165: bipush          46
            //   167: bipush          42
            //   169: ixor           
            //   170: ifne            179
            //   173: aconst_null    
            //   174: areturn        
            //   175: astore          lllllllllllllIIIIlllIIIlIIlIIlll
            //   177: aconst_null    
            //   178: areturn        
            //   179: new             Lnet/minecraft/server/management/PlayerProfileCache$ProfileEntry;
            //   182: dup            
            //   183: aload_0         /* lllllllllllllIIIIlllIIIlIIlIIlIl */
            //   184: getfield        net/minecraft/server/management/PlayerProfileCache$Serializer.this$0:Lnet/minecraft/server/management/PlayerProfileCache;
            //   187: dup            
            //   188: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
            //   191: ldc             ""
            //   193: invokevirtual   java/lang/String.length:()I
            //   196: pop2           
            //   197: new             Lcom/mojang/authlib/GameProfile;
            //   200: dup            
            //   201: aload           lllllllllllllIIIIlllIIIlIIlIlIII
            //   203: aload           lllllllllllllIIIIlllIIIlIIlIllII
            //   205: invokespecial   com/mojang/authlib/GameProfile.<init>:(Ljava/util/UUID;Ljava/lang/String;)V
            //   208: aload           lllllllllllllIIIIlllIIIlIIlIlIll
            //   210: aconst_null    
            //   211: invokespecial   net/minecraft/server/management/PlayerProfileCache$ProfileEntry.<init>:(Lnet/minecraft/server/management/PlayerProfileCache;Lcom/mojang/authlib/GameProfile;Ljava/util/Date;Lnet/minecraft/server/management/PlayerProfileCache$ProfileEntry;)V
            //   214: astore          lllllllllllllIIIIlllIIIlIIlIIllI
            //   216: aload           lllllllllllllIIIIlllIIIlIIlIIllI
            //   218: areturn        
            //   219: aconst_null    
            //   220: areturn        
            //   221: aconst_null    
            //   222: areturn        
            //   223: aconst_null    
            //   224: areturn        
            //    Exceptions:
            //  throws com.google.gson.JsonParseException
            //    StackMapTable: 00 07 FF 00 83 00 0B 07 00 02 07 00 EF 07 00 AD 07 01 3C 07 00 70 07 00 EF 07 00 EF 07 00 EF 07 00 19 07 00 19 07 01 3E 00 01 07 00 EB 04 66 07 00 ED FC 00 03 07 00 8B FA 00 27 F8 00 01 FF 00 01 00 04 07 00 02 07 00 EF 07 00 AD 07 01 3C 00 00
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                      
            //  -----  -----  -----  -----  --------------------------
            //  106    119    131    136    Ljava/text/ParseException;
            //  152    159    175    179    Ljava/lang/Throwable;
            // 
            // The error that occurred was:
            // 
            // java.lang.NullPointerException
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        private static boolean llllIIIIlllIIII(final int lllllllllllllIIIIlllIIIIllIlIIlI, final int lllllllllllllIIIIlllIIIIllIlIIIl) {
            return lllllllllllllIIIIlllIIIIllIlIIlI < lllllllllllllIIIIlllIIIIllIlIIIl;
        }
        
        private static boolean llllIIIIllIlllI(final int lllllllllllllIIIIlllIIIIllIIlIll) {
            return lllllllllllllIIIIlllIIIIllIIlIll != 0;
        }
        
        private static void llllIIIIllIlIll() {
            (lIlIllIIlIIlIl = new String[Serializer.lIlIllIIlIIllI[7]])[Serializer.lIlIllIIlIIllI[0]] = llllIIIIllIlIII("Ny8aIQ==", "YNwDM");
            Serializer.lIlIllIIlIIlIl[Serializer.lIlIllIIlIIllI[1]] = llllIIIIllIlIIl("PxxMeDk+Pms=", "doZri");
            Serializer.lIlIllIIlIIlIl[Serializer.lIlIllIIlIIllI[2]] = llllIIIIllIlIlI("Un4RCMcS9sU=", "ZObrN");
            Serializer.lIlIllIIlIIlIl[Serializer.lIlIllIIlIIllI[3]] = llllIIIIllIlIIl("WxBV4VejiZP89M9YTyQw1g==", "JEbXl");
            Serializer.lIlIllIIlIIlIl[Serializer.lIlIllIIlIIllI[4]] = llllIIIIllIlIlI("lZAUN2MmchQ=", "YFuyC");
            Serializer.lIlIllIIlIIlIl[Serializer.lIlIllIIlIIllI[5]] = llllIIIIllIlIIl("YwXLHwG5gwE=", "YcwOy");
            Serializer.lIlIllIIlIIlIl[Serializer.lIlIllIIlIIllI[6]] = llllIIIIllIlIlI("2aGvBLXhHPreJWEI3CYf8g==", "QdxAZ");
        }
        
        private static boolean llllIIIIllIllll(final Object lllllllllllllIIIIlllIIIIllIIllll) {
            return lllllllllllllIIIIlllIIIIllIIllll != null;
        }
        
        private static boolean llllIIIIllIllIl(final Object lllllllllllllIIIIlllIIIIllIIllIl) {
            return lllllllllllllIIIIlllIIIIllIIllIl == null;
        }
        
        private static String llllIIIIllIlIlI(final String lllllllllllllIIIIlllIIIIllIllIII, final String lllllllllllllIIIIlllIIIIllIlIlll) {
            try {
                final SecretKeySpec lllllllllllllIIIIlllIIIIllIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlllIIIIllIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIIIlllIIIIllIlllII = Cipher.getInstance("Blowfish");
                lllllllllllllIIIIlllIIIIllIlllII.init(Serializer.lIlIllIIlIIllI[2], lllllllllllllIIIIlllIIIIllIlllIl);
                return new String(lllllllllllllIIIIlllIIIIllIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlllIIIIllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIIlllIIIIllIllIll) {
                lllllllllllllIIIIlllIIIIllIllIll.printStackTrace();
                return null;
            }
        }
        
        private static void llllIIIIllIllII() {
            (lIlIllIIlIIllI = new int[9])[0] = ("  ".length() & ~"  ".length());
            Serializer.lIlIllIIlIIllI[1] = " ".length();
            Serializer.lIlIllIIlIIllI[2] = "  ".length();
            Serializer.lIlIllIIlIIllI[3] = "   ".length();
            Serializer.lIlIllIIlIIllI[4] = (0xAD ^ 0xA9);
            Serializer.lIlIllIIlIIllI[5] = (0x4 ^ 0x45 ^ (0xF5 ^ 0xB1));
            Serializer.lIlIllIIlIIllI[6] = (0x4C ^ 0x4A);
            Serializer.lIlIllIIlIIllI[7] = (0x8C ^ 0x97 ^ (0x6B ^ 0x77));
            Serializer.lIlIllIIlIIllI[8] = (0x66 ^ 0x6E);
        }
        
        static {
            llllIIIIllIllII();
            llllIIIIllIlIll();
        }
        
        private Serializer() {
        }
    }
    
    class ProfileEntry
    {
        private final /* synthetic */ Date expirationDate;
        private final /* synthetic */ GameProfile gameProfile;
        
        private ProfileEntry(final GameProfile llllllllllllIlllIllIIIlllIIllIlI, final Date llllllllllllIlllIllIIIlllIIlIlIl) {
            this.gameProfile = llllllllllllIlllIllIIIlllIIllIlI;
            this.expirationDate = llllllllllllIlllIllIIIlllIIlIlIl;
        }
        
        public Date getExpirationDate() {
            return this.expirationDate;
        }
        
        public GameProfile getGameProfile() {
            return this.gameProfile;
        }
    }
}
