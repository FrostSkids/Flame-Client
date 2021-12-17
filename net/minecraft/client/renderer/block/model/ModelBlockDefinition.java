// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.block.model;

import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.Arrays;
import net.minecraft.util.JsonUtils;
import com.google.gson.JsonObject;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;
import net.minecraft.client.resources.model.ModelRotation;
import net.minecraft.util.ResourceLocation;
import java.lang.reflect.Type;
import com.google.gson.GsonBuilder;
import java.io.Reader;
import java.util.Collection;
import com.google.common.collect.Maps;
import java.util.List;
import com.google.gson.Gson;
import java.util.Map;

public class ModelBlockDefinition
{
    private final /* synthetic */ Map<String, Variants> mapVariants;
    static final /* synthetic */ Gson GSON;
    private static final /* synthetic */ int[] lIIlIlIIIlIlll;
    
    private static boolean llIIlllllIIIllI(final int lllllllllllllIIllIlIIllIIllIllll) {
        return lllllllllllllIIllIlIIllIIllIllll == 0;
    }
    
    public ModelBlockDefinition(final List<ModelBlockDefinition> lllllllllllllIIllIlIIllIlIIlIIll) {
        this.mapVariants = (Map<String, Variants>)Maps.newHashMap();
        final double lllllllllllllIIllIlIIllIlIIIlllI = (double)lllllllllllllIIllIlIIllIlIIlIIll.iterator();
        "".length();
        if (" ".length() < " ".length()) {
            throw null;
        }
        while (!llIIlllllIIIllI(((Iterator)lllllllllllllIIllIlIIllIlIIIlllI).hasNext() ? 1 : 0)) {
            final ModelBlockDefinition lllllllllllllIIllIlIIllIlIIlIIlI = ((Iterator<ModelBlockDefinition>)lllllllllllllIIllIlIIllIlIIIlllI).next();
            this.mapVariants.putAll(lllllllllllllIIllIlIIllIlIIlIIlI.mapVariants);
        }
    }
    
    public ModelBlockDefinition(final Collection<Variants> lllllllllllllIIllIlIIllIlIIllIll) {
        this.mapVariants = (Map<String, Variants>)Maps.newHashMap();
        final byte lllllllllllllIIllIlIIllIlIIllIIl = (byte)lllllllllllllIIllIlIIllIlIIllIll.iterator();
        "".length();
        if (((127 + 110 - 126 + 55 ^ 108 + 44 - 103 + 82) & (0x2B ^ 0x71 ^ 104 + 94 - 184 + 113 ^ -" ".length())) != 0x0) {
            throw null;
        }
        while (!llIIlllllIIIllI(((Iterator)lllllllllllllIIllIlIIllIlIIllIIl).hasNext() ? 1 : 0)) {
            final Variants lllllllllllllIIllIlIIllIlIIlllIl = ((Iterator<Variants>)lllllllllllllIIllIlIIllIlIIllIIl).next();
            this.mapVariants.put(lllllllllllllIIllIlIIllIlIIlllIl.name, lllllllllllllIIllIlIIllIlIIlllIl);
            "".length();
        }
    }
    
    @Override
    public int hashCode() {
        return this.mapVariants.hashCode();
    }
    
    public static ModelBlockDefinition parseFromReader(final Reader lllllllllllllIIllIlIIllIlIlIIlIl) {
        return (ModelBlockDefinition)ModelBlockDefinition.GSON.fromJson(lllllllllllllIIllIlIIllIlIlIIlIl, (Class)ModelBlockDefinition.class);
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIIllIlIIllIIlllllIl) {
        if (llIIlllllIIlIII(this, lllllllllllllIIllIlIIllIIlllllIl)) {
            return ModelBlockDefinition.lIIlIlIIIlIlll[0] != 0;
        }
        if (llIIlllllIIlIIl((lllllllllllllIIllIlIIllIIlllllIl instanceof ModelBlockDefinition) ? 1 : 0)) {
            final ModelBlockDefinition lllllllllllllIIllIlIIllIIlllllll = (ModelBlockDefinition)lllllllllllllIIllIlIIllIIlllllIl;
            return this.mapVariants.equals(lllllllllllllIIllIlIIllIIlllllll.mapVariants);
        }
        return ModelBlockDefinition.lIIlIlIIIlIlll[1] != 0;
    }
    
    private static boolean llIIlllllIIlIII(final Object lllllllllllllIIllIlIIllIIlllIllI, final Object lllllllllllllIIllIlIIllIIlllIlIl) {
        return lllllllllllllIIllIlIIllIIlllIllI == lllllllllllllIIllIlIIllIIlllIlIl;
    }
    
    private static boolean llIIlllllIIlIIl(final int lllllllllllllIIllIlIIllIIlllIIIl) {
        return lllllllllllllIIllIlIIllIIlllIIIl != 0;
    }
    
    private static void llIIlllllIIIlIl() {
        (lIIlIlIIIlIlll = new int[2])[0] = " ".length();
        ModelBlockDefinition.lIIlIlIIIlIlll[1] = ((0x9B ^ 0x90) & ~(0x9 ^ 0x2));
    }
    
    public Variants getVariants(final String lllllllllllllIIllIlIIllIlIIIlIIl) {
        final Variants lllllllllllllIIllIlIIllIlIIIlIII = this.mapVariants.get(lllllllllllllIIllIlIIllIlIIIlIIl);
        if (llIIlllllIIIlll(lllllllllllllIIllIlIIllIlIIIlIII)) {
            throw new MissingVariantException();
        }
        return lllllllllllllIIllIlIIllIlIIIlIII;
    }
    
    private static boolean llIIlllllIIIlll(final Object lllllllllllllIIllIlIIllIIlllIIll) {
        return lllllllllllllIIllIlIIllIIlllIIll == null;
    }
    
    static {
        llIIlllllIIIlIl();
        GSON = new GsonBuilder().registerTypeAdapter((Type)ModelBlockDefinition.class, (Object)new Deserializer()).registerTypeAdapter((Type)Variant.class, (Object)new Variant.Deserializer()).create();
    }
    
    public static class Variants
    {
        private final /* synthetic */ List<Variant> listVariants;
        private final /* synthetic */ String name;
        private static final /* synthetic */ int[] lIlIlllIllIlIl;
        
        static {
            llllIlIIIIIIlII();
        }
        
        @Override
        public boolean equals(final Object lllllllllllllIIIIlIlIllIlIlIIlll) {
            if (llllIlIIIIIIlIl(this, lllllllllllllIIIIlIlIllIlIlIIlll)) {
                return Variants.lIlIlllIllIlIl[0] != 0;
            }
            if (llllIlIIIIIIllI((lllllllllllllIIIIlIlIllIlIlIIlll instanceof Variants) ? 1 : 0)) {
                return Variants.lIlIlllIllIlIl[1] != 0;
            }
            final Variants lllllllllllllIIIIlIlIllIlIlIlIIl = (Variants)lllllllllllllIIIIlIlIllIlIlIIlll;
            int equals;
            if (llllIlIIIIIIllI(this.name.equals(lllllllllllllIIIIlIlIllIlIlIlIIl.name) ? 1 : 0)) {
                equals = Variants.lIlIlllIllIlIl[1];
                "".length();
                if (((0x4C ^ 0x58) & ~(0x14 ^ 0x0)) < 0) {
                    return ((0x2D ^ 0x1E) & ~(0x3 ^ 0x30)) != 0x0;
                }
            }
            else {
                equals = (this.listVariants.equals(lllllllllllllIIIIlIlIllIlIlIlIIl.listVariants) ? 1 : 0);
            }
            return equals != 0;
        }
        
        public List<Variant> getVariants() {
            return this.listVariants;
        }
        
        public Variants(final String lllllllllllllIIIIlIlIllIlIllIIll, final List<Variant> lllllllllllllIIIIlIlIllIlIllIlIl) {
            this.name = lllllllllllllIIIIlIlIllIlIllIIll;
            this.listVariants = lllllllllllllIIIIlIlIllIlIllIlIl;
        }
        
        private static void llllIlIIIIIIlII() {
            (lIlIlllIllIlIl = new int[3])[0] = " ".length();
            Variants.lIlIlllIllIlIl[1] = ((0xB ^ 0x53) & ~(0x57 ^ 0xF));
            Variants.lIlIlllIllIlIl[2] = (0x18 ^ 0x7);
        }
        
        private static boolean llllIlIIIIIIllI(final int lllllllllllllIIIIlIlIllIlIIllIII) {
            return lllllllllllllIIIIlIlIllIlIIllIII == 0;
        }
        
        @Override
        public int hashCode() {
            int lllllllllllllIIIIlIlIllIlIlIIIlI = this.name.hashCode();
            lllllllllllllIIIIlIlIllIlIlIIIlI = Variants.lIlIlllIllIlIl[2] * lllllllllllllIIIIlIlIllIlIlIIIlI + this.listVariants.hashCode();
            return lllllllllllllIIIIlIlIllIlIlIIIlI;
        }
        
        private static boolean llllIlIIIIIIlIl(final Object lllllllllllllIIIIlIlIllIlIIllIll, final Object lllllllllllllIIIIlIlIllIlIIllIlI) {
            return lllllllllllllIIIIlIlIllIlIIllIll == lllllllllllllIIIIlIlIllIlIIllIlI;
        }
    }
    
    public static class Variant
    {
        private final /* synthetic */ ResourceLocation modelLocation;
        private final /* synthetic */ boolean uvLock;
        private final /* synthetic */ ModelRotation modelRotation;
        private static final /* synthetic */ int[] llIIIllllllIII;
        private final /* synthetic */ int weight;
        
        private static void lIIIlIllIlIlIIlI() {
            (llIIIllllllIII = new int[3])[0] = " ".length();
            Variant.llIIIllllllIII[1] = ((144 + 11 - 70 + 133 ^ 61 + 25 - 65 + 125) & (0x29 ^ 0x3F ^ (0x30 ^ 0x6E) ^ -" ".length()));
            Variant.llIIIllllllIII[2] = (0xCC ^ 0x92 ^ (0x7A ^ 0x3B));
        }
        
        static {
            lIIIlIllIlIlIIlI();
        }
        
        public Variant(final ResourceLocation llllllllllllIlllIIllllIIIIlllIll, final ModelRotation llllllllllllIlllIIllllIIIIllllll, final boolean llllllllllllIlllIIllllIIIIlllllI, final int llllllllllllIlllIIllllIIIIllllIl) {
            this.modelLocation = llllllllllllIlllIIllllIIIIlllIll;
            this.modelRotation = llllllllllllIlllIIllllIIIIllllll;
            this.uvLock = llllllllllllIlllIIllllIIIIlllllI;
            this.weight = llllllllllllIlllIIllllIIIIllllIl;
        }
        
        @Override
        public int hashCode() {
            int llllllllllllIlllIIllllIIIIIlllll = this.modelLocation.hashCode();
            final int n = Variant.llIIIllllllIII[2] * llllllllllllIlllIIllllIIIIIlllll;
            int hashCode;
            if (lIIIlIllIlIlIlll(this.modelRotation)) {
                hashCode = this.modelRotation.hashCode();
                "".length();
                if (-" ".length() >= (0x4E ^ 0x1F ^ (0x2F ^ 0x7A))) {
                    return (9 + 60 + 28 + 93 ^ 65 + 98 - 62 + 53) & (106 + 83 - 146 + 123 ^ 125 + 77 - 191 + 119 ^ -" ".length());
                }
            }
            else {
                hashCode = Variant.llIIIllllllIII[1];
            }
            llllllllllllIlllIIllllIIIIIlllll = n + hashCode;
            final int n2 = Variant.llIIIllllllIII[2] * llllllllllllIlllIIllllIIIIIlllll;
            int n3;
            if (lIIIlIllIlIlIlIl(this.uvLock ? 1 : 0)) {
                n3 = Variant.llIIIllllllIII[0];
                "".length();
                if (((235 + 217 - 207 + 6 ^ 60 + 126 - 25 + 21) & (0x23 ^ 0x72 ^ (0x9C ^ 0x80) ^ -" ".length())) < -" ".length()) {
                    return (0xA2 ^ 0x8E ^ (0x8B ^ 0x9A)) & (0xD7 ^ 0xBA ^ (0x4B ^ 0x1B) ^ -" ".length());
                }
            }
            else {
                n3 = Variant.llIIIllllllIII[1];
            }
            llllllllllllIlllIIllllIIIIIlllll = n2 + n3;
            return llllllllllllIlllIIllllIIIIIlllll;
        }
        
        private static boolean lIIIlIllIlIlIlIl(final int llllllllllllIlllIIllllIIIIIlIIIl) {
            return llllllllllllIlllIIllllIIIIIlIIIl != 0;
        }
        
        private static boolean lIIIlIllIlIlIIll(final Object llllllllllllIlllIIllllIIIIIlIllI, final Object llllllllllllIlllIIllllIIIIIlIlIl) {
            return llllllllllllIlllIIllllIIIIIlIllI == llllllllllllIlllIIllllIIIIIlIlIl;
        }
        
        public ModelRotation getRotation() {
            return this.modelRotation;
        }
        
        @Override
        public boolean equals(final Object llllllllllllIlllIIllllIIIIlIIlll) {
            if (lIIIlIllIlIlIIll(this, llllllllllllIlllIIllllIIIIlIIlll)) {
                return Variant.llIIIllllllIII[0] != 0;
            }
            if (lIIIlIllIlIlIlII((llllllllllllIlllIIllllIIIIlIIlll instanceof Variant) ? 1 : 0)) {
                return Variant.llIIIllllllIII[1] != 0;
            }
            final Variant llllllllllllIlllIIllllIIIIlIIllI = (Variant)llllllllllllIlllIIllllIIIIlIIlll;
            if (lIIIlIllIlIlIlIl(this.modelLocation.equals(llllllllllllIlllIIllllIIIIlIIllI.modelLocation) ? 1 : 0) && lIIIlIllIlIlIIll(this.modelRotation, llllllllllllIlllIIllllIIIIlIIllI.modelRotation) && lIIIlIllIlIlIllI(this.uvLock ? 1 : 0, llllllllllllIlllIIllllIIIIlIIllI.uvLock ? 1 : 0)) {
                return Variant.llIIIllllllIII[0] != 0;
            }
            return Variant.llIIIllllllIII[1] != 0;
        }
        
        public ResourceLocation getModelLocation() {
            return this.modelLocation;
        }
        
        private static boolean lIIIlIllIlIlIlll(final Object llllllllllllIlllIIllllIIIIIlIIll) {
            return llllllllllllIlllIIllllIIIIIlIIll != null;
        }
        
        public boolean isUvLocked() {
            return this.uvLock;
        }
        
        private static boolean lIIIlIllIlIlIlII(final int llllllllllllIlllIIllllIIIIIIllll) {
            return llllllllllllIlllIIllllIIIIIIllll == 0;
        }
        
        private static boolean lIIIlIllIlIlIllI(final int llllllllllllIlllIIllllIIIIIllIlI, final int llllllllllllIlllIIllllIIIIIllIIl) {
            return llllllllllllIlllIIllllIIIIIllIlI == llllllllllllIlllIIllllIIIIIllIIl;
        }
        
        public int getWeight() {
            return this.weight;
        }
        
        public static class Deserializer implements JsonDeserializer<Variant>
        {
            private static final /* synthetic */ int[] lllIlIllIIIIIl;
            private static final /* synthetic */ String[] lllIlIllIIIIII;
            
            private static void lIlIIIllIIlIlIlI() {
                (lllIlIllIIIIII = new String[Deserializer.lllIlIllIIIIIl[8]])[Deserializer.lllIlIllIIIIIl[0]] = lIlIIIllIIlIlIII("izkXKwELFFw=", "aEBvN");
                Deserializer.lllIlIllIIIIII[Deserializer.lllIlIllIIIIIl[1]] = lIlIIIllIIlIlIII("chZ80ey6Lbk=", "UIiNC");
                Deserializer.lllIlIllIIIIII[Deserializer.lllIlIllIIIIIl[2]] = lIlIIIllIIlIlIIl("SiVAtSBS5/s=", "sHyEp");
                Deserializer.lllIlIllIIIIII[Deserializer.lllIlIllIIIIIl[3]] = lIlIIIllIIlIlIII("qR4b7LwY34s=", "wPqjS");
                Deserializer.lllIlIllIIIIII[Deserializer.lllIlIllIIIIIl[4]] = lIlIIIllIIlIlIII("NYNb4vy2TMS7opKWIEfAe6+bqeMYxqRNVWD0Su7OnvE=", "zGAaZ");
                Deserializer.lllIlIllIIIIII[Deserializer.lllIlIllIIIIIl[5]] = lIlIIIllIIlIlIII("UJmTnG1Z760=", "SWEBO");
                Deserializer.lllIlIllIIIIII[Deserializer.lllIlIllIIIIIl[6]] = lIlIIIllIIlIlIIl("m4ozH0Eqtb8=", "oeMoa");
                Deserializer.lllIlIllIIIIII[Deserializer.lllIlIllIIIIIl[7]] = lIlIIIllIIlIlIIl("VxEec1XRS6E=", "qOjJR");
            }
            
            private static String lIlIIIllIIlIlIII(final String llllllllllllIlIllIlIlllIlIlIIIlI, final String llllllllllllIlIllIlIlllIlIIlllll) {
                try {
                    final SecretKeySpec llllllllllllIlIllIlIlllIlIlIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlIlllIlIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher llllllllllllIlIllIlIlllIlIlIIlII = Cipher.getInstance("Blowfish");
                    llllllllllllIlIllIlIlllIlIlIIlII.init(Deserializer.lllIlIllIIIIIl[2], llllllllllllIlIllIlIlllIlIlIIlIl);
                    return new String(llllllllllllIlIllIlIlllIlIlIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlIlllIlIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlIllIlIlllIlIlIIIll) {
                    llllllllllllIlIllIlIlllIlIlIIIll.printStackTrace();
                    return null;
                }
            }
            
            protected String parseModel(final JsonObject llllllllllllIlIllIlIlllIllIIIIll) {
                return JsonUtils.getString(llllllllllllIlIllIlIlllIllIIIIll, Deserializer.lllIlIllIIIIII[Deserializer.lllIlIllIIIIIl[6]]);
            }
            
            private static String lIlIIIllIIlIlIIl(final String llllllllllllIlIllIlIlllIlIlIllll, final String llllllllllllIlIllIlIlllIlIlIlllI) {
                try {
                    final SecretKeySpec llllllllllllIlIllIlIlllIlIllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlIlllIlIlIlllI.getBytes(StandardCharsets.UTF_8)), Deserializer.lllIlIllIIIIIl[8]), "DES");
                    final Cipher llllllllllllIlIllIlIlllIlIllIIIl = Cipher.getInstance("DES");
                    llllllllllllIlIllIlIlllIlIllIIIl.init(Deserializer.lllIlIllIIIIIl[2], llllllllllllIlIllIlIlllIlIllIIlI);
                    return new String(llllllllllllIlIllIlIlllIlIllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlIlllIlIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlIllIlIlllIlIllIIII) {
                    llllllllllllIlIllIlIlllIlIllIIII.printStackTrace();
                    return null;
                }
            }
            
            private static void lIlIIIllIIlIlIll() {
                (lllIlIllIIIIIl = new int[9])[0] = ((0x71 ^ 0x3E) & ~(0x2A ^ 0x65));
                Deserializer.lllIlIllIIIIIl[1] = " ".length();
                Deserializer.lllIlIllIIIIIl[2] = "  ".length();
                Deserializer.lllIlIllIIIIIl[3] = "   ".length();
                Deserializer.lllIlIllIIIIIl[4] = (0x42 ^ 0x46);
                Deserializer.lllIlIllIIIIIl[5] = (0x32 ^ 0x37);
                Deserializer.lllIlIllIIIIIl[6] = (112 + 105 - 91 + 16 ^ 78 + 39 - 85 + 104);
                Deserializer.lllIlIllIIIIIl[7] = (0xC5 ^ 0xC2);
                Deserializer.lllIlIllIIIIIl[8] = (21 + 101 - 105 + 125 ^ 4 + 35 + 85 + 10);
            }
            
            private ResourceLocation makeModelLocation(final String llllllllllllIlIllIlIlllIllIllIll) {
                ResourceLocation llllllllllllIlIllIlIlllIllIllIlI = new ResourceLocation(llllllllllllIlIllIlIlllIllIllIll);
                llllllllllllIlIllIlIlllIllIllIlI = new ResourceLocation(llllllllllllIlIllIlIlllIllIllIlI.getResourceDomain(), String.valueOf(new StringBuilder(Deserializer.lllIlIllIIIIII[Deserializer.lllIlIllIIIIIl[0]]).append(llllllllllllIlIllIlIlllIllIllIlI.getResourcePath())));
                return llllllllllllIlIllIlIlllIllIllIlI;
            }
            
            private boolean parseUvLock(final JsonObject llllllllllllIlIllIlIlllIllIlIlIl) {
                return JsonUtils.getBoolean(llllllllllllIlIllIlIlllIllIlIlIl, Deserializer.lllIlIllIIIIII[Deserializer.lllIlIllIIIIIl[1]], (boolean)(Deserializer.lllIlIllIIIIIl[0] != 0));
            }
            
            public Variant deserialize(final JsonElement llllllllllllIlIllIlIlllIlllIIlII, final Type llllllllllllIlIllIlIlllIlllIllII, final JsonDeserializationContext llllllllllllIlIllIlIlllIlllIlIll) throws JsonParseException {
                final JsonObject llllllllllllIlIllIlIlllIlllIlIlI = llllllllllllIlIllIlIlllIlllIIlII.getAsJsonObject();
                final String llllllllllllIlIllIlIlllIlllIlIIl = this.parseModel(llllllllllllIlIllIlIlllIlllIlIlI);
                final ModelRotation llllllllllllIlIllIlIlllIlllIlIII = this.parseRotation(llllllllllllIlIllIlIlllIlllIlIlI);
                final boolean llllllllllllIlIllIlIlllIlllIIlll = this.parseUvLock(llllllllllllIlIllIlIlllIlllIlIlI);
                final int llllllllllllIlIllIlIlllIlllIIllI = this.parseWeight(llllllllllllIlIllIlIlllIlllIlIlI);
                return new Variant(this.makeModelLocation(llllllllllllIlIllIlIlllIlllIlIIl), llllllllllllIlIllIlIlllIlllIlIII, llllllllllllIlIllIlIlllIlllIIlll, llllllllllllIlIllIlIlllIlllIIllI);
            }
            
            protected int parseWeight(final JsonObject llllllllllllIlIllIlIlllIlIllllll) {
                return JsonUtils.getInt(llllllllllllIlIllIlIlllIlIllllll, Deserializer.lllIlIllIIIIII[Deserializer.lllIlIllIIIIIl[7]], Deserializer.lllIlIllIIIIIl[1]);
            }
            
            private static boolean lIlIIIllIIlIllII(final Object llllllllllllIlIllIlIlllIlIIllIll) {
                return llllllllllllIlIllIlIlllIlIIllIll == null;
            }
            
            static {
                lIlIIIllIIlIlIll();
                lIlIIIllIIlIlIlI();
            }
            
            protected ModelRotation parseRotation(final JsonObject llllllllllllIlIllIlIlllIllIIlIlI) {
                final int llllllllllllIlIllIlIlllIllIIllIl = JsonUtils.getInt(llllllllllllIlIllIlIlllIllIIlIlI, Deserializer.lllIlIllIIIIII[Deserializer.lllIlIllIIIIIl[2]], Deserializer.lllIlIllIIIIIl[0]);
                final int llllllllllllIlIllIlIlllIllIIllII = JsonUtils.getInt(llllllllllllIlIllIlIlllIllIIlIlI, Deserializer.lllIlIllIIIIII[Deserializer.lllIlIllIIIIIl[3]], Deserializer.lllIlIllIIIIIl[0]);
                final ModelRotation llllllllllllIlIllIlIlllIllIIlIll = ModelRotation.getModelRotation(llllllllllllIlIllIlIlllIllIIllIl, llllllllllllIlIllIlIlllIllIIllII);
                if (lIlIIIllIIlIllII(llllllllllllIlIllIlIlllIllIIlIll)) {
                    throw new JsonParseException(String.valueOf(new StringBuilder(Deserializer.lllIlIllIIIIII[Deserializer.lllIlIllIIIIIl[4]]).append(llllllllllllIlIllIlIlllIllIIllIl).append(Deserializer.lllIlIllIIIIII[Deserializer.lllIlIllIIIIIl[5]]).append(llllllllllllIlIllIlIlllIllIIllII)));
                }
                return llllllllllllIlIllIlIlllIllIIlIll;
            }
        }
    }
    
    public static class Deserializer implements JsonDeserializer<ModelBlockDefinition>
    {
        private static final /* synthetic */ int[] llllllllllIII;
        private static final /* synthetic */ String[] lllllllllIlll;
        
        protected List<Variants> parseVariantsList(final JsonDeserializationContext lllllllllllllIlIlIIlIllIIIIIlllI, final JsonObject lllllllllllllIlIlIIlIllIIIIIIlll) {
            final JsonObject lllllllllllllIlIlIIlIllIIIIIllII = JsonUtils.getJsonObject(lllllllllllllIlIlIIlIllIIIIIIlll, Deserializer.lllllllllIlll[Deserializer.llllllllllIII[0]]);
            final List<Variants> lllllllllllllIlIlIIlIllIIIIIlIll = (List<Variants>)Lists.newArrayList();
            final float lllllllllllllIlIlIIlIllIIIIIIIll = (float)lllllllllllllIlIlIIlIllIIIIIllII.entrySet().iterator();
            "".length();
            if (-" ".length() >= (0x86 ^ 0x96 ^ (0x13 ^ 0x7))) {
                return null;
            }
            while (!lIllIIlIIIlllIl(((Iterator)lllllllllllllIlIlIIlIllIIIIIIIll).hasNext() ? 1 : 0)) {
                final Map.Entry<String, JsonElement> lllllllllllllIlIlIIlIllIIIIIlIlI = ((Iterator<Map.Entry<String, JsonElement>>)lllllllllllllIlIlIIlIllIIIIIIIll).next();
                lllllllllllllIlIlIIlIllIIIIIlIll.add(this.parseVariants(lllllllllllllIlIlIIlIllIIIIIlllI, lllllllllllllIlIlIIlIllIIIIIlIlI));
                "".length();
            }
            return lllllllllllllIlIlIIlIllIIIIIlIll;
        }
        
        public ModelBlockDefinition deserialize(final JsonElement lllllllllllllIlIlIIlIllIIIIllIlI, final Type lllllllllllllIlIlIIlIllIIIIlllll, final JsonDeserializationContext lllllllllllllIlIlIIlIllIIIIllIIl) throws JsonParseException {
            final JsonObject lllllllllllllIlIlIIlIllIIIIlllIl = lllllllllllllIlIlIIlIllIIIIllIlI.getAsJsonObject();
            final List<Variants> lllllllllllllIlIlIIlIllIIIIlllII = this.parseVariantsList(lllllllllllllIlIlIIlIllIIIIllIIl, lllllllllllllIlIlIIlIllIIIIlllIl);
            return new ModelBlockDefinition(lllllllllllllIlIlIIlIllIIIIlllII);
        }
        
        private static boolean lIllIIlIIIlllIl(final int lllllllllllllIlIlIIlIlIlllIIIllI) {
            return lllllllllllllIlIlIIlIlIlllIIIllI == 0;
        }
        
        static {
            lIllIIlIIIlllII();
            lIllIIlIIIllIll();
        }
        
        protected Variants parseVariants(final JsonDeserializationContext lllllllllllllIlIlIIlIlIllllllIlI, final Map.Entry<String, JsonElement> lllllllllllllIlIlIIlIlIllllllIIl) {
            final String lllllllllllllIlIlIIlIlIllllllIII = lllllllllllllIlIlIIlIlIllllllIIl.getKey();
            final List<Variant> lllllllllllllIlIlIIlIlIlllllIlll = (List<Variant>)Lists.newArrayList();
            final JsonElement lllllllllllllIlIlIIlIlIlllllIllI = lllllllllllllIlIlIIlIlIllllllIIl.getValue();
            if (lIllIIlIIIllllI(lllllllllllllIlIlIIlIlIlllllIllI.isJsonArray() ? 1 : 0)) {
                final char lllllllllllllIlIlIIlIlIllllIlllI = (char)lllllllllllllIlIlIIlIlIlllllIllI.getAsJsonArray().iterator();
                "".length();
                if (-"   ".length() > 0) {
                    return null;
                }
                while (!lIllIIlIIIlllIl(((Iterator)lllllllllllllIlIlIIlIlIllllIlllI).hasNext() ? 1 : 0)) {
                    final JsonElement lllllllllllllIlIlIIlIlIlllllIlIl = ((Iterator<JsonElement>)lllllllllllllIlIlIIlIlIllllIlllI).next();
                    lllllllllllllIlIlIIlIlIlllllIlll.add((Variant)lllllllllllllIlIlIIlIlIllllllIlI.deserialize(lllllllllllllIlIlIIlIlIlllllIlIl, (Type)Variant.class));
                    "".length();
                }
                "".length();
                if (" ".length() <= 0) {
                    return null;
                }
            }
            else {
                lllllllllllllIlIlIIlIlIlllllIlll.add((Variant)lllllllllllllIlIlIIlIlIllllllIlI.deserialize(lllllllllllllIlIlIIlIlIlllllIllI, (Type)Variant.class));
                "".length();
            }
            return new Variants(lllllllllllllIlIlIIlIlIllllllIII, lllllllllllllIlIlIIlIlIlllllIlll);
        }
        
        private static boolean lIllIIlIIIllllI(final int lllllllllllllIlIlIIlIlIlllIIlIII) {
            return lllllllllllllIlIlIIlIlIlllIIlIII != 0;
        }
        
        private static void lIllIIlIIIllIll() {
            (lllllllllIlll = new String[Deserializer.llllllllllIII[1]])[Deserializer.llllllllllIII[0]] = lIllIIlIIIllIlI("FCUkABkMMCU=", "bDVix");
        }
        
        private static boolean lIllIIlIIIlllll(final int lllllllllllllIlIlIIlIlIlllIIlIll, final int lllllllllllllIlIlIIlIlIlllIIlIlI) {
            return lllllllllllllIlIlIIlIlIlllIIlIll < lllllllllllllIlIlIIlIlIlllIIlIlI;
        }
        
        private static String lIllIIlIIIllIlI(String lllllllllllllIlIlIIlIlIlllIlIllI, final String lllllllllllllIlIlIIlIlIlllIlIlIl) {
            lllllllllllllIlIlIIlIlIlllIlIllI = new String(Base64.getDecoder().decode(lllllllllllllIlIlIIlIlIlllIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIlIIlIlIlllIllIIl = new StringBuilder();
            final char[] lllllllllllllIlIlIIlIlIlllIllIII = lllllllllllllIlIlIIlIlIlllIlIlIl.toCharArray();
            int lllllllllllllIlIlIIlIlIlllIlIlll = Deserializer.llllllllllIII[0];
            final char lllllllllllllIlIlIIlIlIlllIlIIIl = (Object)lllllllllllllIlIlIIlIlIlllIlIllI.toCharArray();
            final byte lllllllllllllIlIlIIlIlIlllIlIIII = (byte)lllllllllllllIlIlIIlIlIlllIlIIIl.length;
            byte lllllllllllllIlIlIIlIlIlllIIllll = (byte)Deserializer.llllllllllIII[0];
            while (lIllIIlIIIlllll(lllllllllllllIlIlIIlIlIlllIIllll, lllllllllllllIlIlIIlIlIlllIlIIII)) {
                final char lllllllllllllIlIlIIlIlIlllIlllII = lllllllllllllIlIlIIlIlIlllIlIIIl[lllllllllllllIlIlIIlIlIlllIIllll];
                lllllllllllllIlIlIIlIlIlllIllIIl.append((char)(lllllllllllllIlIlIIlIlIlllIlllII ^ lllllllllllllIlIlIIlIlIlllIllIII[lllllllllllllIlIlIIlIlIlllIlIlll % lllllllllllllIlIlIIlIlIlllIllIII.length]));
                "".length();
                ++lllllllllllllIlIlIIlIlIlllIlIlll;
                ++lllllllllllllIlIlIIlIlIlllIIllll;
                "".length();
                if (-(0x24 ^ 0x48 ^ (0x78 ^ 0x10)) >= 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIlIIlIlIlllIllIIl);
        }
        
        private static void lIllIIlIIIlllII() {
            (llllllllllIII = new int[2])[0] = ((95 + 121 + 3 + 21 ^ 57 + 167 - 157 + 108) & (0x4A ^ 0x51 ^ (0xF3 ^ 0xB7) ^ -" ".length()));
            Deserializer.llllllllllIII[1] = " ".length();
        }
    }
    
    public class MissingVariantException extends RuntimeException
    {
    }
}
