// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources.data;

import java.lang.reflect.Type;
import com.google.gson.TypeAdapterFactory;
import net.minecraft.util.EnumTypeAdapterFactory;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.RegistrySimple;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.util.IRegistry;

public class IMetadataSerializer
{
    private final /* synthetic */ IRegistry<String, Registration<? extends IMetadataSection>> metadataSectionSerializerRegistry;
    private static final /* synthetic */ String[] lIllllIIIllIIl;
    private final /* synthetic */ GsonBuilder gsonBuilder;
    private /* synthetic */ Gson gson;
    private static final /* synthetic */ int[] lIllllIIIlllll;
    
    private static String lIIIIIllllllllIl(final String llllllllllllIllllIlIllIlIllIIIII, final String llllllllllllIllllIlIllIlIlIlllIl) {
        try {
            final SecretKeySpec llllllllllllIllllIlIllIlIllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIllIlIlIlllIl.getBytes(StandardCharsets.UTF_8)), IMetadataSerializer.lIllllIIIlllll[6]), "DES");
            final Cipher llllllllllllIllllIlIllIlIllIIIlI = Cipher.getInstance("DES");
            llllllllllllIllllIlIllIlIllIIIlI.init(IMetadataSerializer.lIllllIIIlllll[2], llllllllllllIllllIlIllIlIllIIIll);
            return new String(llllllllllllIllllIlIllIlIllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIllIlIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlIllIlIllIIIIl) {
            llllllllllllIllllIlIllIlIllIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIIIllllllllII(final String llllllllllllIllllIlIllIlIllIllIl, final String llllllllllllIllllIlIllIlIllIllII) {
        try {
            final SecretKeySpec llllllllllllIllllIlIllIlIlllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIllIlIllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIlIllIlIllIllll = Cipher.getInstance("Blowfish");
            llllllllllllIllllIlIllIlIllIllll.init(IMetadataSerializer.lIllllIIIlllll[2], llllllllllllIllllIlIllIlIlllIIII);
            return new String(llllllllllllIllllIlIllIlIllIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIllIlIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlIllIlIllIlllI) {
            llllllllllllIllllIlIllIlIllIlllI.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIIIlIIIIIIIIll();
        lIIIIIlllllllllI();
    }
    
    private static boolean lIIIIlIIIIIIIlII(final Object llllllllllllIllllIlIllIlIIllllIl) {
        return llllllllllllIllllIlIllIlIIllllIl == null;
    }
    
    private static String lIIIIIlllllllIll(String llllllllllllIllllIlIllIlIlIIlIll, final String llllllllllllIllllIlIllIlIlIIllll) {
        llllllllllllIllllIlIllIlIlIIlIll = new String(Base64.getDecoder().decode(llllllllllllIllllIlIllIlIlIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIlIllIlIlIIlllI = new StringBuilder();
        final char[] llllllllllllIllllIlIllIlIlIIllIl = llllllllllllIllllIlIllIlIlIIllll.toCharArray();
        int llllllllllllIllllIlIllIlIlIIllII = IMetadataSerializer.lIllllIIIlllll[0];
        final int llllllllllllIllllIlIllIlIlIIIllI = (Object)llllllllllllIllllIlIllIlIlIIlIll.toCharArray();
        final float llllllllllllIllllIlIllIlIlIIIlIl = llllllllllllIllllIlIllIlIlIIIllI.length;
        double llllllllllllIllllIlIllIlIlIIIlII = IMetadataSerializer.lIllllIIIlllll[0];
        while (lIIIIlIIIIIIIllI((int)llllllllllllIllllIlIllIlIlIIIlII, (int)llllllllllllIllllIlIllIlIlIIIlIl)) {
            final char llllllllllllIllllIlIllIlIlIlIIIl = llllllllllllIllllIlIllIlIlIIIllI[llllllllllllIllllIlIllIlIlIIIlII];
            llllllllllllIllllIlIllIlIlIIlllI.append((char)(llllllllllllIllllIlIllIlIlIlIIIl ^ llllllllllllIllllIlIllIlIlIIllIl[llllllllllllIllllIlIllIlIlIIllII % llllllllllllIllllIlIllIlIlIIllIl.length]));
            "".length();
            ++llllllllllllIllllIlIllIlIlIIllII;
            ++llllllllllllIllllIlIllIlIlIIIlII;
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIlIllIlIlIIlllI);
    }
    
    public <T extends IMetadataSection> T parseMetadataSection(final String llllllllllllIllllIlIllIlIllllIlI, final JsonObject llllllllllllIllllIlIllIlIllllIIl) {
        if (lIIIIlIIIIIIIlII(llllllllllllIllllIlIllIlIllllIlI)) {
            throw new IllegalArgumentException(IMetadataSerializer.lIllllIIIllIIl[IMetadataSerializer.lIllllIIIlllll[0]]);
        }
        if (lIIIIlIIIIIIIlIl(llllllllllllIllllIlIllIlIllllIIl.has(llllllllllllIllllIlIllIlIllllIlI) ? 1 : 0)) {
            return null;
        }
        if (lIIIIlIIIIIIIlIl(llllllllllllIllllIlIllIlIllllIIl.get(llllllllllllIllllIlIllIlIllllIlI).isJsonObject() ? 1 : 0)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder(IMetadataSerializer.lIllllIIIllIIl[IMetadataSerializer.lIllllIIIlllll[1]]).append(llllllllllllIllllIlIllIlIllllIlI).append(IMetadataSerializer.lIllllIIIllIIl[IMetadataSerializer.lIllllIIIlllll[2]]).append(llllllllllllIllllIlIllIlIllllIIl.get(llllllllllllIllllIlIllIlIllllIlI))));
        }
        final Registration<?> llllllllllllIllllIlIllIlIlllllII = this.metadataSectionSerializerRegistry.getObject(llllllllllllIllllIlIllIlIllllIlI);
        if (lIIIIlIIIIIIIlII(llllllllllllIllllIlIllIlIlllllII)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder(IMetadataSerializer.lIllllIIIllIIl[IMetadataSerializer.lIllllIIIlllll[3]]).append(llllllllllllIllllIlIllIlIllllIlI).append(IMetadataSerializer.lIllllIIIllIIl[IMetadataSerializer.lIllllIIIlllll[4]])));
        }
        return (T)this.getGson().fromJson((JsonElement)llllllllllllIllllIlIllIlIllllIIl.getAsJsonObject(llllllllllllIllllIlIllIlIllllIlI), (Class)llllllllllllIllllIlIllIlIlllllII.field_110500_b);
    }
    
    private static void lIIIIlIIIIIIIIll() {
        (lIllllIIIlllll = new int[7])[0] = ((0x38 ^ 0x67) & ~(0x7 ^ 0x58));
        IMetadataSerializer.lIllllIIIlllll[1] = " ".length();
        IMetadataSerializer.lIllllIIIlllll[2] = "  ".length();
        IMetadataSerializer.lIllllIIIlllll[3] = "   ".length();
        IMetadataSerializer.lIllllIIIlllll[4] = (0x58 ^ 0x5C);
        IMetadataSerializer.lIllllIIIlllll[5] = (0x88 ^ 0x8D);
        IMetadataSerializer.lIllllIIIlllll[6] = (96 + 91 - 153 + 106 ^ 6 + 61 - 49 + 114);
    }
    
    private static boolean lIIIIlIIIIIIIllI(final int llllllllllllIllllIlIllIlIlIIIIII, final int llllllllllllIllllIlIllIlIIllllll) {
        return llllllllllllIllllIlIllIlIlIIIIII < llllllllllllIllllIlIllIlIIllllll;
    }
    
    private static void lIIIIIlllllllllI() {
        (lIllllIIIllIIl = new String[IMetadataSerializer.lIllllIIIlllll[5]])[IMetadataSerializer.lIllllIIIlllll[0]] = lIIIIIlllllllIll("HQIeMSAxEwtwNzUEHjkrPkcEMSk1RwkxKj4IHnAmNUcEJSg8", "PgjPD");
        IMetadataSerializer.lIllllIIIllIIl[IMetadataSerializer.lIllllIIIlllll[1]] = lIIIIIlllllllIll("GSsnGzg5IXEXMSQkNRsgMWU3FSZwYg==", "PEQzT");
        IMetadataSerializer.lIllllIIIllIIl[IMetadataSerializer.lIllllIIIlllll[2]] = lIIIIIllllllllII("i/5RU87vet8pUUDoecmVsr7TkghZbg2ZbU8qwFczRFE=", "oVHWj");
        IMetadataSerializer.lIllllIIIllIIl[IMetadataSerializer.lIllllIIIlllll[3]] = lIIIIIllllllllIl("7f9XR0IE29wpwet6oD1EniIVbcNTTyUsWVieCpB5FiWpwZigl6652JZ7Pugx7GPc", "jIIpn");
        IMetadataSerializer.lIllllIIIllIIl[IMetadataSerializer.lIllllIIIlllll[4]] = lIIIIIlllllllIll("Zg==", "AwfFN");
    }
    
    private static boolean lIIIIlIIIIIIIlIl(final int llllllllllllIllllIlIllIlIIlllIll) {
        return llllllllllllIllllIlIllIlIIlllIll == 0;
    }
    
    public IMetadataSerializer() {
        this.metadataSectionSerializerRegistry = new RegistrySimple<String, Registration<? extends IMetadataSection>>();
        this.gsonBuilder = new GsonBuilder();
        this.gsonBuilder.registerTypeHierarchyAdapter((Class)IChatComponent.class, (Object)new IChatComponent.Serializer());
        "".length();
        this.gsonBuilder.registerTypeHierarchyAdapter((Class)ChatStyle.class, (Object)new ChatStyle.Serializer());
        "".length();
        this.gsonBuilder.registerTypeAdapterFactory((TypeAdapterFactory)new EnumTypeAdapterFactory());
        "".length();
    }
    
    public <T extends IMetadataSection> void registerMetadataSectionType(final IMetadataSectionSerializer<T> llllllllllllIllllIlIllIllIIIIlIl, final Class<T> llllllllllllIllllIlIllIllIIIIlII) {
        this.metadataSectionSerializerRegistry.putObject(llllllllllllIllllIlIllIllIIIIlIl.getSectionName(), new Registration<IMetadataSection>((IMetadataSectionSerializer)llllllllllllIllllIlIllIllIIIIlIl, (Class)llllllllllllIllllIlIllIllIIIIlII, (Registration<IMetadataSection>)null));
        this.gsonBuilder.registerTypeAdapter((Type)llllllllllllIllllIlIllIllIIIIlII, (Object)llllllllllllIllllIlIllIllIIIIlIl);
        "".length();
        this.gson = null;
    }
    
    private Gson getGson() {
        if (lIIIIlIIIIIIIlII(this.gson)) {
            this.gson = this.gsonBuilder.create();
        }
        return this.gson;
    }
    
    class Registration<T extends IMetadataSection>
    {
        final /* synthetic */ Class<T> field_110500_b;
        final /* synthetic */ IMetadataSectionSerializer<T> field_110502_a;
        
        private Registration(final IMetadataSectionSerializer<T> llllllllllllIllllIlIllIIlllIllII, final Class<T> llllllllllllIllllIlIllIIlllIlIll) {
            this.field_110502_a = llllllllllllIllllIlIllIIlllIllII;
            this.field_110500_b = llllllllllllIllllIlIllIIlllIlIll;
        }
    }
}
