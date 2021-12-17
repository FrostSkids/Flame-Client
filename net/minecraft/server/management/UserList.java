// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.server.management;

import java.util.Iterator;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonObject;
import com.google.gson.GsonBuilder;
import com.google.common.collect.Maps;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.lang.reflect.Type;
import org.apache.logging.log4j.LogManager;
import java.util.List;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Collection;
import java.io.Writer;
import org.apache.commons.io.IOUtils;
import com.google.common.io.Files;
import com.google.common.base.Charsets;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.apache.logging.log4j.Logger;
import java.util.Map;
import java.io.File;
import com.google.gson.Gson;
import java.lang.reflect.ParameterizedType;

public class UserList<K, V extends UserListEntry<K>>
{
    private /* synthetic */ boolean lanServer;
    protected final /* synthetic */ Gson gson;
    private final /* synthetic */ File saveFile;
    private static final /* synthetic */ int[] llIlIllllIlIIl;
    private static final /* synthetic */ String[] llIlIllllIIIIl;
    private final /* synthetic */ Map<String, V> values;
    protected static final /* synthetic */ Logger logger;
    
    protected Map<String, V> getValues() {
        return this.values;
    }
    
    private static String lIIlIlIlllllIlIl(String llllllllllllIllIlIIIlIlllIIIIlIl, final String llllllllllllIllIlIIIlIlllIIIlIIl) {
        llllllllllllIllIlIIIlIlllIIIIlIl = new String(Base64.getDecoder().decode(llllllllllllIllIlIIIlIlllIIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIIIlIlllIIIlIII = new StringBuilder();
        final char[] llllllllllllIllIlIIIlIlllIIIIlll = llllllllllllIllIlIIIlIlllIIIlIIl.toCharArray();
        int llllllllllllIllIlIIIlIlllIIIIllI = UserList.llIlIllllIlIIl[1];
        final Exception llllllllllllIllIlIIIlIlllIIIIIII = (Object)llllllllllllIllIlIIIlIlllIIIIlIl.toCharArray();
        final long llllllllllllIllIlIIIlIllIlllllll = llllllllllllIllIlIIIlIlllIIIIIII.length;
        float llllllllllllIllIlIIIlIllIllllllI = UserList.llIlIllllIlIIl[1];
        while (lIIlIllIIIIIIIlI((int)llllllllllllIllIlIIIlIllIllllllI, (int)llllllllllllIllIlIIIlIllIlllllll)) {
            final char llllllllllllIllIlIIIlIlllIIIlIll = llllllllllllIllIlIIIlIlllIIIIIII[llllllllllllIllIlIIIlIllIllllllI];
            llllllllllllIllIlIIIlIlllIIIlIII.append((char)(llllllllllllIllIlIIIlIlllIIIlIll ^ llllllllllllIllIlIIIlIlllIIIIlll[llllllllllllIllIlIIIlIlllIIIIllI % llllllllllllIllIlIIIlIlllIIIIlll.length]));
            "".length();
            ++llllllllllllIllIlIIIlIlllIIIIllI;
            ++llllllllllllIllIlIIIlIllIllllllI;
            "".length();
            if (" ".length() <= -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIIIlIlllIIIlIII);
    }
    
    public void writeChanges() throws IOException {
        final Collection<V> llllllllllllIllIlIIIlIlllIIlllII = this.values.values();
        final String llllllllllllIllIlIIIlIlllIIllIll = this.gson.toJson((Object)llllllllllllIllIlIIIlIlllIIlllII);
        BufferedWriter llllllllllllIllIlIIIlIlllIIllIlI = null;
        try {
            llllllllllllIllIlIIIlIlllIIllIlI = Files.newWriter(this.saveFile, Charsets.UTF_8);
            llllllllllllIllIlIIIlIlllIIllIlI.write(llllllllllllIllIlIIIlIlllIIllIll);
            "".length();
            if ("  ".length() < " ".length()) {
                return;
            }
        }
        finally {
            IOUtils.closeQuietly((Writer)llllllllllllIllIlIIIlIlllIIllIlI);
        }
        IOUtils.closeQuietly((Writer)llllllllllllIllIlIIIlIlllIIllIlI);
    }
    
    private void removeExpired() {
        final List<K> llllllllllllIllIlIIIlIlllIllIIII = (List<K>)Lists.newArrayList();
        boolean llllllllllllIllIlIIIlIlllIlIlIlI = (boolean)this.values.values().iterator();
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIlIllIIIIIIIIl(((Iterator)llllllllllllIllIlIIIlIlllIlIlIlI).hasNext() ? 1 : 0)) {
            final V llllllllllllIllIlIIIlIlllIlIllll = ((Iterator<V>)llllllllllllIllIlIIIlIlllIlIlIlI).next();
            if (lIIlIllIIIIIIIII(llllllllllllIllIlIIIlIlllIlIllll.hasBanExpired() ? 1 : 0)) {
                llllllllllllIllIlIIIlIlllIllIIII.add(llllllllllllIllIlIIIlIlllIlIllll.getValue());
                "".length();
            }
        }
        llllllllllllIllIlIIIlIlllIlIlIlI = (boolean)llllllllllllIllIlIIIlIlllIllIIII.iterator();
        "".length();
        if (" ".length() == ((76 + 128 - 156 + 110 ^ 123 + 73 - 145 + 126) & (0xF0 ^ 0x8C ^ (0x6B ^ 0x38) ^ -" ".length()))) {
            return;
        }
        while (!lIIlIllIIIIIIIIl(((Iterator)llllllllllllIllIlIIIlIlllIlIlIlI).hasNext() ? 1 : 0)) {
            final K llllllllllllIllIlIIIlIlllIlIlllI = ((Iterator<K>)llllllllllllIllIlIIIlIlllIlIlIlI).next();
            this.values.remove(llllllllllllIllIlIIIlIlllIlIlllI);
            "".length();
        }
    }
    
    static {
        lIIlIlIlllllllll();
        lIIlIlIlllllIlll();
        logger = LogManager.getLogger();
        saveFileFormat = new ParameterizedType() {
            private static final /* synthetic */ int[] lIIlIIllIlIlll;
            
            @Override
            public Type getOwnerType() {
                return null;
            }
            
            @Override
            public Type[] getActualTypeArguments() {
                final Type[] array = new Type[UserList$1.lIIlIIllIlIlll[0]];
                array[UserList$1.lIIlIIllIlIlll[1]] = UserListEntry.class;
                return array;
            }
            
            @Override
            public Type getRawType() {
                return List.class;
            }
            
            private static void llIIlllIIIIlIlI() {
                (lIIlIIllIlIlll = new int[2])[0] = " ".length();
                UserList$1.lIIlIIllIlIlll[1] = ((0xB0 ^ 0xAC) & ~(0x91 ^ 0x8D));
            }
            
            static {
                llIIlllIIIIlIlI();
            }
        };
    }
    
    private static boolean lIIlIllIIIIIIIlI(final int llllllllllllIllIlIIIlIllIllIllIl, final int llllllllllllIllIlIIIlIllIllIllII) {
        return llllllllllllIllIlIIIlIllIllIllIl < llllllllllllIllIlIIIlIllIllIllII;
    }
    
    private static boolean lIIlIllIIIIIIIII(final int llllllllllllIllIlIIIlIllIllIlIlI) {
        return llllllllllllIllIlIIIlIllIllIlIlI != 0;
    }
    
    public void removeEntry(final K llllllllllllIllIlIIIlIllllIIIlII) {
        this.values.remove(this.getObjectKey(llllllllllllIllIlIIIlIllllIIIlII));
        "".length();
        try {
            this.writeChanges();
            "".length();
            if (-" ".length() >= "  ".length()) {
                return;
            }
        }
        catch (IOException llllllllllllIllIlIIIlIllllIIIllI) {
            UserList.logger.warn(UserList.llIlIllllIIIIl[UserList.llIlIllllIlIIl[0]], (Throwable)llllllllllllIllIlIIIlIllllIIIllI);
        }
    }
    
    public V getEntry(final K llllllllllllIllIlIIIlIllllIlIIlI) {
        this.removeExpired();
        return this.values.get(this.getObjectKey(llllllllllllIllIlIIIlIllllIlIIlI));
    }
    
    private static boolean lIIlIllIIIIIIIIl(final int llllllllllllIllIlIIIlIllIllIlIII) {
        return llllllllllllIllIlIIIlIllIllIlIII == 0;
    }
    
    private static String lIIlIlIlllllIllI(final String llllllllllllIllIlIIIlIllIlllIlIl, final String llllllllllllIllIlIIIlIllIlllIlII) {
        try {
            final SecretKeySpec llllllllllllIllIlIIIlIllIllllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIIlIllIlllIlII.getBytes(StandardCharsets.UTF_8)), UserList.llIlIllllIlIIl[3]), "DES");
            final Cipher llllllllllllIllIlIIIlIllIlllIlll = Cipher.getInstance("DES");
            llllllllllllIllIlIIIlIllIlllIlll.init(UserList.llIlIllllIlIIl[2], llllllllllllIllIlIIIlIllIllllIII);
            return new String(llllllllllllIllIlIIIlIllIlllIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIIlIllIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIIlIllIlllIllI) {
            llllllllllllIllIlIIIlIllIlllIllI.printStackTrace();
            return null;
        }
    }
    
    public void addEntry(final V llllllllllllIllIlIIIlIlllllIIIll) {
        this.values.put(this.getObjectKey(llllllllllllIllIlIIIlIlllllIIIll.getValue()), llllllllllllIllIlIIIlIlllllIIIll);
        "".length();
        try {
            this.writeChanges();
            "".length();
            if (((0x87 ^ 0xA9 ^ (0x4A ^ 0x47)) & (0x2C ^ 0x43 ^ (0xC ^ 0x40) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        catch (IOException llllllllllllIllIlIIIlIlllllIIIIl) {
            UserList.logger.warn(UserList.llIlIllllIIIIl[UserList.llIlIllllIlIIl[1]], (Throwable)llllllllllllIllIlIIIlIlllllIIIIl);
        }
    }
    
    protected String getObjectKey(final K llllllllllllIllIlIIIlIlllIllllIl) {
        return llllllllllllIllIlIIIlIlllIllllIl.toString();
    }
    
    public UserList(final File llllllllllllIllIlIIIlIllllllIlIl) {
        this.values = (Map<String, V>)Maps.newHashMap();
        this.lanServer = (UserList.llIlIllllIlIIl[0] != 0);
        this.saveFile = llllllllllllIllIlIIIlIllllllIlIl;
        final GsonBuilder llllllllllllIllIlIIIlIllllllIlll = new GsonBuilder().setPrettyPrinting();
        llllllllllllIllIlIIIlIllllllIlll.registerTypeHierarchyAdapter((Class)UserListEntry.class, (Object)new Serializer((Serializer)null));
        "".length();
        this.gson = llllllllllllIllIlIIIlIllllllIlll.create();
    }
    
    public String[] getKeys() {
        return this.values.keySet().toArray(new String[this.values.size()]);
    }
    
    private static void lIIlIlIlllllIlll() {
        (llIlIllllIIIIl = new String[UserList.llIlIllllIlIIl[2]])[UserList.llIlIllllIlIIl[1]] = lIIlIlIlllllIlIl("Oz0RPQBYPAslRAszEjREDDoBcQgRIRBxBR4mASNEGTYAOAofcgVxEQs3Fn8=", "xRdQd");
        UserList.llIlIllllIIIIl[UserList.llIlIllllIlIIl[0]] = lIIlIlIlllllIllI("E5l6rIgFPcNqWziRhxvmQlA9WZ34G3L+bzHKq8DH8JePoQEEs/SbqGstnb56iEsP", "pEhFL");
    }
    
    protected boolean hasEntry(final K llllllllllllIllIlIIIlIlllIllIllI) {
        return this.values.containsKey(this.getObjectKey(llllllllllllIllIlIIIlIlllIllIllI));
    }
    
    public boolean isLanServer() {
        return this.lanServer;
    }
    
    protected UserListEntry<K> createEntry(final JsonObject llllllllllllIllIlIIIlIlllIlIIlll) {
        return new UserListEntry<K>(null, llllllllllllIllIlIIIlIlllIlIIlll);
    }
    
    private static void lIIlIlIlllllllll() {
        (llIlIllllIlIIl = new int[4])[0] = " ".length();
        UserList.llIlIllllIlIIl[1] = ((0x17 ^ 0x2C) & ~(0xF9 ^ 0xC2));
        UserList.llIlIllllIlIIl[2] = "  ".length();
        UserList.llIlIllllIlIIl[3] = (0xF3 ^ 0xAE ^ (0xF1 ^ 0xA4));
    }
    
    public void setLanServer(final boolean llllllllllllIllIlIIIlIlllllIlIlI) {
        this.lanServer = llllllllllllIllIlIIIlIlllllIlIlI;
    }
    
    class Serializer implements JsonDeserializer<UserListEntry<K>>, JsonSerializer<UserListEntry<K>>
    {
        public UserListEntry<K> deserialize(final JsonElement lllllllllllllIIIlIIlIIlIlllIlIIl, final Type lllllllllllllIIIlIIlIIlIlllIlllI, final JsonDeserializationContext lllllllllllllIIIlIIlIIlIlllIllIl) throws JsonParseException {
            if (lllIllIlIlIIIIl(lllllllllllllIIIlIIlIIlIlllIlIIl.isJsonObject() ? 1 : 0)) {
                final JsonObject lllllllllllllIIIlIIlIIlIlllIllII = lllllllllllllIIIlIIlIIlIlllIlIIl.getAsJsonObject();
                final UserListEntry<K> lllllllllllllIIIlIIlIIlIlllIlIll = UserList.this.createEntry(lllllllllllllIIIlIIlIIlIlllIllII);
                return lllllllllllllIIIlIIlIIlIlllIlIll;
            }
            return null;
        }
        
        private Serializer() {
        }
        
        private static boolean lllIllIlIlIIIIl(final int lllllllllllllIIIlIIlIIlIllIlIIIl) {
            return lllllllllllllIIIlIIlIIlIllIlIIIl != 0;
        }
        
        public JsonElement serialize(final UserListEntry<K> lllllllllllllIIIlIIlIIlIlllllIlI, final Type lllllllllllllIIIlIIlIIlIlllllIIl, final JsonSerializationContext lllllllllllllIIIlIIlIIlIlllllIII) {
            final JsonObject lllllllllllllIIIlIIlIIlIllllIlll = new JsonObject();
            lllllllllllllIIIlIIlIIlIlllllIlI.onSerialization(lllllllllllllIIIlIIlIIlIllllIlll);
            return (JsonElement)lllllllllllllIIIlIIlIIlIllllIlll;
        }
    }
}
