// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.block.model;

import java.util.Iterator;
import com.google.common.collect.Lists;
import com.google.gson.JsonParseException;
import org.apache.commons.lang3.StringUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.common.collect.Maps;
import net.minecraft.util.JsonUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializer;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collections;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.lang.reflect.Type;
import com.google.gson.GsonBuilder;
import org.apache.logging.log4j.LogManager;
import net.minecraft.util.ResourceLocation;
import java.util.List;
import com.google.gson.Gson;
import org.apache.logging.log4j.Logger;
import java.util.Map;

public class ModelBlock
{
    private final /* synthetic */ boolean gui3d;
    private /* synthetic */ ItemCameraTransforms cameraTransforms;
    private static final /* synthetic */ int[] llIllllllIIlII;
    protected final /* synthetic */ Map<String, String> textures;
    private final /* synthetic */ boolean ambientOcclusion;
    private static final /* synthetic */ String[] llIllllllIIIlI;
    private static final /* synthetic */ Logger LOGGER;
    static final /* synthetic */ Gson SERIALIZER;
    public /* synthetic */ String name;
    private final /* synthetic */ List<BlockPart> elements;
    protected /* synthetic */ ResourceLocation parentLocation;
    protected /* synthetic */ ModelBlock parent;
    
    public ItemCameraTransforms func_181682_g() {
        final ItemTransformVec3f llllllllllllIllIIIlIllIIIlIIIllI = this.func_181681_a(ItemCameraTransforms.TransformType.THIRD_PERSON);
        final ItemTransformVec3f llllllllllllIllIIIlIllIIIlIIIlIl = this.func_181681_a(ItemCameraTransforms.TransformType.FIRST_PERSON);
        final ItemTransformVec3f llllllllllllIllIIIlIllIIIlIIIlII = this.func_181681_a(ItemCameraTransforms.TransformType.HEAD);
        final ItemTransformVec3f llllllllllllIllIIIlIllIIIlIIIIll = this.func_181681_a(ItemCameraTransforms.TransformType.GUI);
        final ItemTransformVec3f llllllllllllIllIIIlIllIIIlIIIIlI = this.func_181681_a(ItemCameraTransforms.TransformType.GROUND);
        final ItemTransformVec3f llllllllllllIllIIIlIllIIIlIIIIIl = this.func_181681_a(ItemCameraTransforms.TransformType.FIXED);
        return new ItemCameraTransforms(llllllllllllIllIIIlIllIIIlIIIllI, llllllllllllIllIIIlIllIIIlIIIlIl, llllllllllllIllIIIlIllIIIlIIIlII, llllllllllllIllIIIlIllIIIlIIIIll, llllllllllllIllIIIlIllIIIlIIIIlI, llllllllllllIllIIIlIllIIIlIIIIIl);
    }
    
    public boolean isGui3d() {
        return this.gui3d;
    }
    
    public void getParentFromMap(final Map<ResourceLocation, ModelBlock> llllllllllllIllIIIlIllIIIlllIIIl) {
        if (lIIllIllIllIlIll(this.parentLocation)) {
            this.parent = llllllllllllIllIIIlIllIIIlllIIIl.get(this.parentLocation);
        }
    }
    
    public boolean isResolved() {
        if (lIIllIllIllIlIll(this.parentLocation) && (!lIIllIllIllIlIll(this.parent) || lIIllIllIllIllII(this.parent.isResolved() ? 1 : 0))) {
            return ModelBlock.llIllllllIIlII[0] != 0;
        }
        return ModelBlock.llIllllllIIlII[1] != 0;
    }
    
    protected ModelBlock(final List<BlockPart> llllllllllllIllIIIlIllIIlIllIIIl, final Map<String, String> llllllllllllIllIIIlIllIIlIllIIII, final boolean llllllllllllIllIIIlIllIIlIlIllll, final boolean llllllllllllIllIIIlIllIIlIlIlllI, final ItemCameraTransforms llllllllllllIllIIIlIllIIlIllIIll) {
        this(null, llllllllllllIllIIIlIllIIlIllIIIl, llllllllllllIllIIIlIllIIlIllIIII, llllllllllllIllIIIlIllIIlIlIllll, llllllllllllIllIIIlIllIIlIlIlllI, llllllllllllIllIIIlIllIIlIllIIll);
    }
    
    private static boolean lIIllIllIllIlIll(final Object llllllllllllIllIIIlIlIlllllIlIlI) {
        return llllllllllllIllIIIlIlIlllllIlIlI != null;
    }
    
    public ResourceLocation getParentLocation() {
        return this.parentLocation;
    }
    
    private ModelBlock(final ResourceLocation llllllllllllIllIIIlIllIIlIIlIIlI, final List<BlockPart> llllllllllllIllIIIlIllIIlIIlIIIl, final Map<String, String> llllllllllllIllIIIlIllIIlIIlIIII, final boolean llllllllllllIllIIIlIllIIlIIIllll, final boolean llllllllllllIllIIIlIllIIlIIIlllI, final ItemCameraTransforms llllllllllllIllIIIlIllIIlIIIllIl) {
        this.name = ModelBlock.llIllllllIIIlI[ModelBlock.llIllllllIIlII[0]];
        this.elements = llllllllllllIllIIIlIllIIlIIlIIIl;
        this.ambientOcclusion = llllllllllllIllIIIlIllIIlIIIllll;
        this.gui3d = llllllllllllIllIIIlIllIIlIIIlllI;
        this.textures = llllllllllllIllIIIlIllIIlIIlIIII;
        this.parentLocation = llllllllllllIllIIIlIllIIlIIlIIlI;
        this.cameraTransforms = llllllllllllIllIIIlIllIIlIIIllIl;
    }
    
    public static void checkModelHierarchy(final Map<ResourceLocation, ModelBlock> llllllllllllIllIIIlIllIIIIlIlIlI) {
        final long llllllllllllIllIIIlIllIIIIlIlIII = (long)llllllllllllIllIIIlIllIIIIlIlIlI.values().iterator();
        "".length();
        if ((76 + 86 - 114 + 86 ^ 53 + 7 + 62 + 9) <= 0) {
            return;
        }
        while (!lIIllIllIllIllII(((Iterator)llllllllllllIllIIIlIllIIIIlIlIII).hasNext() ? 1 : 0)) {
            final ModelBlock llllllllllllIllIIIlIllIIIIlIllIl = ((Iterator<ModelBlock>)llllllllllllIllIIIlIllIIIIlIlIII).next();
            try {
                ModelBlock llllllllllllIllIIIlIllIIIIlIllII = llllllllllllIllIIIlIllIIIIlIllIl.parent;
                ModelBlock llllllllllllIllIIIlIllIIIIlIlIll = llllllllllllIllIIIlIllIIIIlIllII.parent;
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
                while (!lIIllIllIllIllIl(llllllllllllIllIIIlIllIIIIlIllII, llllllllllllIllIIIlIllIIIIlIlIll)) {
                    llllllllllllIllIIIlIllIIIIlIllII = llllllllllllIllIIIlIllIIIIlIllII.parent;
                    llllllllllllIllIIIlIllIIIIlIlIll = llllllllllllIllIIIlIllIIIIlIlIll.parent.parent;
                }
                throw new LoopException();
            }
            catch (NullPointerException ex) {}
        }
    }
    
    public String resolveTextureName(String llllllllllllIllIIIlIllIIIllIIlIl) {
        if (lIIllIllIllIllII(this.startsWithHash((String)llllllllllllIllIIIlIllIIIllIIlIl) ? 1 : 0)) {
            llllllllllllIllIIIlIllIIIllIIlIl = String.valueOf(new StringBuilder(String.valueOf((char)ModelBlock.llIllllllIIlII[2])).append((String)llllllllllllIllIIIlIllIIIllIIlIl));
        }
        return this.resolveTextureName((String)llllllllllllIllIIIlIllIIIllIIlIl, new Bookkeep(this, null));
    }
    
    static {
        lIIllIllIllIlIIl();
        lIIllIllIllIIllI();
        LOGGER = LogManager.getLogger();
        SERIALIZER = new GsonBuilder().registerTypeAdapter((Type)ModelBlock.class, (Object)new Deserializer()).registerTypeAdapter((Type)BlockPart.class, (Object)new BlockPart.Deserializer()).registerTypeAdapter((Type)BlockPartFace.class, (Object)new BlockPartFace.Deserializer()).registerTypeAdapter((Type)BlockFaceUV.class, (Object)new BlockFaceUV.Deserializer()).registerTypeAdapter((Type)ItemTransformVec3f.class, (Object)new ItemTransformVec3f.Deserializer()).registerTypeAdapter((Type)ItemCameraTransforms.class, (Object)new ItemCameraTransforms.Deserializer()).create();
    }
    
    private static String lIIllIllIllIIIll(String llllllllllllIllIIIlIllIIIIIlIllI, final String llllllllllllIllIIIlIllIIIIIllIlI) {
        llllllllllllIllIIIlIllIIIIIlIllI = new String(Base64.getDecoder().decode(llllllllllllIllIIIlIllIIIIIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIlIllIIIIIllIIl = new StringBuilder();
        final char[] llllllllllllIllIIIlIllIIIIIllIII = llllllllllllIllIIIlIllIIIIIllIlI.toCharArray();
        int llllllllllllIllIIIlIllIIIIIlIlll = ModelBlock.llIllllllIIlII[0];
        final Exception llllllllllllIllIIIlIllIIIIIlIIIl = (Object)llllllllllllIllIIIlIllIIIIIlIllI.toCharArray();
        final boolean llllllllllllIllIIIlIllIIIIIlIIII = llllllllllllIllIIIlIllIIIIIlIIIl.length != 0;
        Exception llllllllllllIllIIIlIllIIIIIIllll = (Exception)ModelBlock.llIllllllIIlII[0];
        while (lIIllIllIlllIIII((int)llllllllllllIllIIIlIllIIIIIIllll, llllllllllllIllIIIlIllIIIIIlIIII ? 1 : 0)) {
            final char llllllllllllIllIIIlIllIIIIIlllII = llllllllllllIllIIIlIllIIIIIlIIIl[llllllllllllIllIIIlIllIIIIIIllll];
            llllllllllllIllIIIlIllIIIIIllIIl.append((char)(llllllllllllIllIIIlIllIIIIIlllII ^ llllllllllllIllIIIlIllIIIIIllIII[llllllllllllIllIIIlIllIIIIIlIlll % llllllllllllIllIIIlIllIIIIIllIII.length]));
            "".length();
            ++llllllllllllIllIIIlIllIIIIIlIlll;
            ++llllllllllllIllIIIlIllIIIIIIllll;
            "".length();
            if (((0x1E ^ 0x43) & ~(0x19 ^ 0x44)) != ((0x2E ^ 0x69) & ~(0x6B ^ 0x2C))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIlIllIIIIIllIIl);
    }
    
    private static String lIIllIllIllIIlIl(final String llllllllllllIllIIIlIlIlllllllIIl, final String llllllllllllIllIIIlIlIlllllllIII) {
        try {
            final SecretKeySpec llllllllllllIllIIIlIlIllllllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIlIlllllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIlIlIlllllllIll = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIlIlIlllllllIll.init(ModelBlock.llIllllllIIlII[3], llllllllllllIllIIIlIlIllllllllII);
            return new String(llllllllllllIllIIIlIlIlllllllIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIlIlllllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIlIlIlllllllIlI) {
            llllllllllllIllIIIlIlIlllllllIlI.printStackTrace();
            return null;
        }
    }
    
    private static String lIIllIllIllIIlII(final String llllllllllllIllIIIlIllIIIIIIIlII, final String llllllllllllIllIIIlIllIIIIIIIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIlIllIIIIIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIllIIIIIIIlIl.getBytes(StandardCharsets.UTF_8)), ModelBlock.llIllllllIIlII[8]), "DES");
            final Cipher llllllllllllIllIIIlIllIIIIIIlIII = Cipher.getInstance("DES");
            llllllllllllIllIIIlIllIIIIIIlIII.init(ModelBlock.llIllllllIIlII[3], llllllllllllIllIIIlIllIIIIIIlIIl);
            return new String(llllllllllllIllIIIlIllIIIIIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIllIIIIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIlIllIIIIIIIlll) {
            llllllllllllIllIIIlIllIIIIIIIlll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIllIllIllIlIIl() {
        (llIllllllIIlII = new int[9])[0] = ((0x3 ^ 0x32 ^ (0xA ^ 0x7C)) & (196 + 172 - 275 + 147 ^ 96 + 134 - 158 + 111 ^ -" ".length()));
        ModelBlock.llIllllllIIlII[1] = " ".length();
        ModelBlock.llIllllllIIlII[2] = (0xBA ^ 0x99);
        ModelBlock.llIllllllIIlII[3] = "  ".length();
        ModelBlock.llIllllllIIlII[4] = "   ".length();
        ModelBlock.llIllllllIIlII[5] = (0xA ^ 0xE);
        ModelBlock.llIllllllIIlII[6] = (0x80 ^ 0x85);
        ModelBlock.llIllllllIIlII[7] = (0x4E ^ 0x48);
        ModelBlock.llIllllllIIlII[8] = (0x42 ^ 0x4A);
    }
    
    public boolean isAmbientOcclusion() {
        boolean b;
        if (lIIllIllIllIlIlI(this.hasParent() ? 1 : 0)) {
            b = this.parent.isAmbientOcclusion();
            "".length();
            if (-" ".length() >= "   ".length()) {
                return ((0x3D ^ 0x25) & ~(0x6A ^ 0x72)) != 0x0;
            }
        }
        else {
            b = this.ambientOcclusion;
        }
        return b;
    }
    
    protected ModelBlock(final ResourceLocation llllllllllllIllIIIlIllIIlIlIIlIl, final Map<String, String> llllllllllllIllIIIlIllIIlIlIIlII, final boolean llllllllllllIllIIIlIllIIlIIlllIl, final boolean llllllllllllIllIIIlIllIIlIIlllII, final ItemCameraTransforms llllllllllllIllIIIlIllIIlIlIIIIl) {
        this(llllllllllllIllIIIlIllIIlIlIIlIl, Collections.emptyList(), llllllllllllIllIIIlIllIIlIlIIlII, llllllllllllIllIIIlIllIIlIIlllIl, llllllllllllIllIIIlIllIIlIIlllII, llllllllllllIllIIIlIllIIlIlIIIIl);
    }
    
    private static boolean lIIllIllIllIlllI(final Object llllllllllllIllIIIlIlIlllllIIlII) {
        return llllllllllllIllIIIlIlIlllllIIlII == null;
    }
    
    private boolean hasParent() {
        if (lIIllIllIllIlIll(this.parent)) {
            return ModelBlock.llIllllllIIlII[1] != 0;
        }
        return ModelBlock.llIllllllIIlII[0] != 0;
    }
    
    public List<BlockPart> getElements() {
        List<BlockPart> list;
        if (lIIllIllIllIlIlI(this.hasParent() ? 1 : 0)) {
            list = this.parent.getElements();
            "".length();
            if ((0x21 ^ 0x40 ^ (0xED ^ 0x88)) < 0) {
                return null;
            }
        }
        else {
            list = this.elements;
        }
        return list;
    }
    
    private ItemTransformVec3f func_181681_a(final ItemCameraTransforms.TransformType llllllllllllIllIIIlIllIIIIllIlII) {
        ItemTransformVec3f itemTransformVec3f;
        if (lIIllIllIllIlIll(this.parent) && lIIllIllIllIllII(this.cameraTransforms.func_181687_c(llllllllllllIllIIIlIllIIIIllIlII) ? 1 : 0)) {
            itemTransformVec3f = this.parent.func_181681_a(llllllllllllIllIIIlIllIIIIllIlII);
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        else {
            itemTransformVec3f = this.cameraTransforms.getTransform(llllllllllllIllIIIlIllIIIIllIlII);
        }
        return itemTransformVec3f;
    }
    
    private static boolean lIIllIllIllIllll(final int llllllllllllIllIIIlIlIllllllIIIl, final int llllllllllllIllIIIlIlIllllllIIII) {
        return llllllllllllIllIIIlIlIllllllIIIl == llllllllllllIllIIIlIlIllllllIIII;
    }
    
    public ModelBlock getRootModel() {
        ModelBlock rootModel;
        if (lIIllIllIllIlIlI(this.hasParent() ? 1 : 0)) {
            rootModel = this.parent.getRootModel();
            "".length();
            if (-" ".length() == " ".length()) {
                return null;
            }
        }
        else {
            rootModel = this;
        }
        return rootModel;
    }
    
    public static ModelBlock deserialize(final String llllllllllllIllIIIlIllIIlIllllll) {
        return deserialize(new StringReader(llllllllllllIllIIIlIllIIlIllllll));
    }
    
    private static boolean lIIllIllIllIllII(final int llllllllllllIllIIIlIlIlllllIIIII) {
        return llllllllllllIllIIIlIlIlllllIIIII == 0;
    }
    
    private static void lIIllIllIllIIllI() {
        (llIllllllIIIlI = new String[ModelBlock.llIllllllIIlII[7]])[ModelBlock.llIllllllIIlII[0]] = lIIllIllIllIIIll("", "wuWTC");
        ModelBlock.llIllllllIIIlI[ModelBlock.llIllllllIIlII[1]] = lIIllIllIllIIlII("l4mbuZkxlOnfAe1ZECWI2A==", "KANWU");
        ModelBlock.llIllllllIIIlI[ModelBlock.llIllllllIIlII[3]] = lIIllIllIllIIIll("LRgyNg0dVic7QQoTIDsNDhNzIAQAAiYmBFgSJjFBDBlzIREPFyEwQQoTNTETHRgwMVtY", "xvSTa");
        ModelBlock.llIllllllIIIlI[ModelBlock.llIllllllIIlII[4]] = lIIllIllIllIIlIl("BpiXchK1R88=", "LnGaH");
        ModelBlock.llIllllllIIIlI[ModelBlock.llIllllllIIlII[5]] = lIIllIllIllIIIll("AyY9JT0AKCA5", "nONVT");
        ModelBlock.llIllllllIIIlI[ModelBlock.llIllllllIIlII[6]] = lIIllIllIllIIIll("Pz8gPwQ8MT0j", "RVSLm");
    }
    
    private static boolean lIIllIllIllIllIl(final Object llllllllllllIllIIIlIlIlllllIIlll, final Object llllllllllllIllIIIlIlIlllllIIllI) {
        return llllllllllllIllIIIlIlIlllllIIlll == llllllllllllIllIIIlIlIlllllIIllI;
    }
    
    public static ModelBlock deserialize(final Reader llllllllllllIllIIIlIllIIllIIIIll) {
        return (ModelBlock)ModelBlock.SERIALIZER.fromJson(llllllllllllIllIIIlIllIIllIIIIll, (Class)ModelBlock.class);
    }
    
    private static boolean lIIllIllIlllIIII(final int llllllllllllIllIIIlIlIlllllIllIl, final int llllllllllllIllIIIlIlIlllllIllII) {
        return llllllllllllIllIIIlIlIlllllIllIl < llllllllllllIllIIIlIlIlllllIllII;
    }
    
    private static boolean lIIllIllIllIlIlI(final int llllllllllllIllIIIlIlIlllllIIIlI) {
        return llllllllllllIllIIIlIlIlllllIIIlI != 0;
    }
    
    private String resolveTextureName(final String llllllllllllIllIIIlIllIIIlIllIll, final Bookkeep llllllllllllIllIIIlIllIIIlIllllI) {
        if (!lIIllIllIllIlIlI(this.startsWithHash(llllllllllllIllIIIlIllIIIlIllIll) ? 1 : 0)) {
            return llllllllllllIllIIIlIllIIIlIllIll;
        }
        if (lIIllIllIllIllIl(this, llllllllllllIllIIIlIllIIIlIllllI.modelExt)) {
            ModelBlock.LOGGER.warn(String.valueOf(new StringBuilder(ModelBlock.llIllllllIIIlI[ModelBlock.llIllllllIIlII[3]]).append(llllllllllllIllIIIlIllIIIlIllIll).append(ModelBlock.llIllllllIIIlI[ModelBlock.llIllllllIIlII[4]]).append(this.name)));
            return ModelBlock.llIllllllIIIlI[ModelBlock.llIllllllIIlII[5]];
        }
        String llllllllllllIllIIIlIllIIIlIlllIl = this.textures.get(llllllllllllIllIIIlIllIIIlIllIll.substring(ModelBlock.llIllllllIIlII[1]));
        if (lIIllIllIllIlllI(llllllllllllIllIIIlIllIIIlIlllIl) && lIIllIllIllIlIlI(this.hasParent() ? 1 : 0)) {
            llllllllllllIllIIIlIllIIIlIlllIl = this.parent.resolveTextureName(llllllllllllIllIIIlIllIIIlIllIll, llllllllllllIllIIIlIllIIIlIllllI);
        }
        llllllllllllIllIIIlIllIIIlIllllI.modelExt = this;
        if (lIIllIllIllIlIll(llllllllllllIllIIIlIllIIIlIlllIl) && lIIllIllIllIlIlI(this.startsWithHash(llllllllllllIllIIIlIllIIIlIlllIl) ? 1 : 0)) {
            llllllllllllIllIIIlIllIIIlIlllIl = llllllllllllIllIIIlIllIIIlIllllI.model.resolveTextureName(llllllllllllIllIIIlIllIIIlIlllIl, llllllllllllIllIIIlIllIIIlIllllI);
        }
        String s;
        if (lIIllIllIllIlIll(llllllllllllIllIIIlIllIIIlIlllIl) && lIIllIllIllIllII(this.startsWithHash(llllllllllllIllIIIlIllIIIlIlllIl) ? 1 : 0)) {
            s = llllllllllllIllIIIlIllIIIlIlllIl;
            "".length();
            if (-" ".length() >= "  ".length()) {
                return null;
            }
        }
        else {
            s = ModelBlock.llIllllllIIIlI[ModelBlock.llIllllllIIlII[6]];
        }
        return s;
    }
    
    private boolean startsWithHash(final String llllllllllllIllIIIlIllIIIlIlIlIl) {
        if (lIIllIllIllIllll(llllllllllllIllIIIlIllIIIlIlIlIl.charAt(ModelBlock.llIllllllIIlII[0]), ModelBlock.llIllllllIIlII[2])) {
            return ModelBlock.llIllllllIIlII[1] != 0;
        }
        return ModelBlock.llIllllllIIlII[0] != 0;
    }
    
    public boolean isTexturePresent(final String llllllllllllIllIIIlIllIIIllIllIl) {
        int n;
        if (lIIllIllIllIlIlI(ModelBlock.llIllllllIIIlI[ModelBlock.llIllllllIIlII[1]].equals(this.resolveTextureName(llllllllllllIllIIIlIllIIIllIllIl)) ? 1 : 0)) {
            n = ModelBlock.llIllllllIIlII[0];
            "".length();
            if ("   ".length() < " ".length()) {
                return ((0x74 ^ 0x35 ^ (0xC ^ 0x8)) & (187 + 91 - 147 + 65 ^ 108 + 32 - 66 + 55 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = ModelBlock.llIllllllIIlII[1];
        }
        return n != 0;
    }
    
    public static class LoopException extends RuntimeException
    {
    }
    
    static final class Bookkeep
    {
        public final /* synthetic */ ModelBlock model;
        public /* synthetic */ ModelBlock modelExt;
        
        private Bookkeep() {
        }
    }
    
    public static class Deserializer implements JsonDeserializer<ModelBlock>
    {
        private static final /* synthetic */ String[] lIIllIlIlIllll;
        private static final /* synthetic */ int[] lIIllIlIllIIIl;
        
        private String getParent(final JsonObject lllllllllllllIIlIlIlIIlllIIIlIII) {
            return JsonUtils.getString(lllllllllllllIIlIlIlIIlllIIIlIII, Deserializer.lIIllIlIlIllll[Deserializer.lIIllIlIllIIIl[6]], Deserializer.lIIllIlIlIllll[Deserializer.lIIllIlIllIIIl[7]]);
        }
        
        private static boolean llIllIIlIIlIlll(final int lllllllllllllIIlIlIlIIlIllllIlll) {
            return lllllllllllllIIlIlIlIIlIllllIlll != 0;
        }
        
        private static boolean llIllIIlIIllIIl(final int lllllllllllllIIlIlIlIIlIlllllllI, final int lllllllllllllIIlIlIlIIlIllllllII) {
            return lllllllllllllIIlIlIlIIlIlllllllI < lllllllllllllIIlIlIlIIlIllllllII;
        }
        
        private static String llIllIIlIIIllIl(final String lllllllllllllIIlIlIlIIllIIIIlIll, final String lllllllllllllIIlIlIlIIllIIIIlIlI) {
            try {
                final SecretKeySpec lllllllllllllIIlIlIlIIllIIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIlIIllIIIIlIlI.getBytes(StandardCharsets.UTF_8)), Deserializer.lIIllIlIllIIIl[8]), "DES");
                final Cipher lllllllllllllIIlIlIlIIllIIIIllIl = Cipher.getInstance("DES");
                lllllllllllllIIlIlIlIIllIIIIllIl.init(Deserializer.lIIllIlIllIIIl[2], lllllllllllllIIlIlIlIIllIIIIlllI);
                return new String(lllllllllllllIIlIlIlIIllIIIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIlIIllIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIlIlIIllIIIIllII) {
                lllllllllllllIIlIlIlIIllIIIIllII.printStackTrace();
                return null;
            }
        }
        
        static {
            llIllIIlIIlIllI();
            llIllIIlIIIlllI();
        }
        
        private static String llIllIIlIIIllII(String lllllllllllllIIlIlIlIIllIIIlllIl, final String lllllllllllllIIlIlIlIIllIIIlllII) {
            lllllllllllllIIlIlIlIIllIIIlllIl = new String(Base64.getDecoder().decode(lllllllllllllIIlIlIlIIllIIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIlIlIlIIllIIlIIIlI = new StringBuilder();
            final char[] lllllllllllllIIlIlIlIIllIIlIIIIl = lllllllllllllIIlIlIlIIllIIIlllII.toCharArray();
            int lllllllllllllIIlIlIlIIllIIIlllll = Deserializer.lIIllIlIllIIIl[0];
            final long lllllllllllllIIlIlIlIIllIIIlIllI = (Object)lllllllllllllIIlIlIlIIllIIIlllIl.toCharArray();
            final byte lllllllllllllIIlIlIlIIllIIIlIlIl = (byte)lllllllllllllIIlIlIlIIllIIIlIllI.length;
            int lllllllllllllIIlIlIlIIllIIIlIlII = Deserializer.lIIllIlIllIIIl[0];
            while (llIllIIlIIllIIl(lllllllllllllIIlIlIlIIllIIIlIlII, lllllllllllllIIlIlIlIIllIIIlIlIl)) {
                final char lllllllllllllIIlIlIlIIllIIlIIlll = lllllllllllllIIlIlIlIIllIIIlIllI[lllllllllllllIIlIlIlIIllIIIlIlII];
                lllllllllllllIIlIlIlIIllIIlIIIlI.append((char)(lllllllllllllIIlIlIlIIllIIlIIlll ^ lllllllllllllIIlIlIlIIllIIlIIIIl[lllllllllllllIIlIlIlIIllIIIlllll % lllllllllllllIIlIlIlIIllIIlIIIIl.length]));
                "".length();
                ++lllllllllllllIIlIlIlIIllIIIlllll;
                ++lllllllllllllIIlIlIlIIllIIIlIlII;
                "".length();
                if ("   ".length() == (0xD4 ^ 0xC3 ^ (0xAA ^ 0xB9))) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIlIlIlIIllIIlIIIlI);
        }
        
        private static boolean llIllIIlIIllIII(final int lllllllllllllIIlIlIlIIlIllllIIlI) {
            return lllllllllllllIIlIlIlIIlIllllIIlI == 0;
        }
        
        private Map<String, String> getTextures(final JsonObject lllllllllllllIIlIlIlIIlllIIllllI) {
            final Map<String, String> lllllllllllllIIlIlIlIIlllIIlllII = (Map<String, String>)Maps.newHashMap();
            if (llIllIIlIIlIlll(lllllllllllllIIlIlIlIIlllIIllllI.has(Deserializer.lIIllIlIlIllll[Deserializer.lIIllIlIllIIIl[4]]) ? 1 : 0)) {
                final JsonObject lllllllllllllIIlIlIlIIlllIIllIlI = lllllllllllllIIlIlIlIIlllIIllllI.getAsJsonObject(Deserializer.lIIllIlIlIllll[Deserializer.lIIllIlIllIIIl[5]]);
                final String lllllllllllllIIlIlIlIIlllIIIllll = (String)lllllllllllllIIlIlIlIIlllIIllIlI.entrySet().iterator();
                "".length();
                if (null != null) {
                    return null;
                }
                while (!llIllIIlIIllIII(((Iterator)lllllllllllllIIlIlIlIIlllIIIllll).hasNext() ? 1 : 0)) {
                    final Map.Entry<String, JsonElement> lllllllllllllIIlIlIlIIlllIIllIII = ((Iterator<Map.Entry<String, JsonElement>>)lllllllllllllIIlIlIlIIlllIIIllll).next();
                    lllllllllllllIIlIlIlIIlllIIlllII.put(lllllllllllllIIlIlIlIIlllIIllIII.getKey(), lllllllllllllIIlIlIlIIlllIIllIII.getValue().getAsString());
                    "".length();
                }
            }
            return lllllllllllllIIlIlIlIIlllIIlllII;
        }
        
        public ModelBlock deserialize(final JsonElement lllllllllllllIIlIlIlIIlllIllIIll, final Type lllllllllllllIIlIlIlIIllllIIIllI, final JsonDeserializationContext lllllllllllllIIlIlIlIIlllIllIIlI) throws JsonParseException {
            final JsonObject lllllllllllllIIlIlIlIIllllIIIIIl = lllllllllllllIIlIlIlIIlllIllIIll.getAsJsonObject();
            final List<BlockPart> lllllllllllllIIlIlIlIIllllIIIIII = this.getModelElements(lllllllllllllIIlIlIlIIlllIllIIlI, lllllllllllllIIlIlIlIIllllIIIIIl);
            final String lllllllllllllIIlIlIlIIlllIlllllI = this.getParent(lllllllllllllIIlIlIlIIllllIIIIIl);
            final boolean lllllllllllllIIlIlIlIIlllIllllIl = StringUtils.isEmpty((CharSequence)lllllllllllllIIlIlIlIIlllIlllllI);
            final boolean lllllllllllllIIlIlIlIIlllIlllIll = lllllllllllllIIlIlIlIIllllIIIIII.isEmpty();
            if (llIllIIlIIlIlll(lllllllllllllIIlIlIlIIlllIlllIll ? 1 : 0) && llIllIIlIIlIlll(lllllllllllllIIlIlIlIIlllIllllIl ? 1 : 0)) {
                throw new JsonParseException(Deserializer.lIIllIlIlIllll[Deserializer.lIIllIlIllIIIl[0]]);
            }
            if (llIllIIlIIllIII(lllllllllllllIIlIlIlIIlllIllllIl ? 1 : 0) && llIllIIlIIllIII(lllllllllllllIIlIlIlIIlllIlllIll ? 1 : 0)) {
                throw new JsonParseException(Deserializer.lIIllIlIlIllll[Deserializer.lIIllIlIllIIIl[1]]);
            }
            final Map<String, String> lllllllllllllIIlIlIlIIlllIlllIlI = this.getTextures(lllllllllllllIIlIlIlIIllllIIIIIl);
            final boolean lllllllllllllIIlIlIlIIlllIlllIIl = this.getAmbientOcclusionEnabled(lllllllllllllIIlIlIlIIllllIIIIIl);
            ItemCameraTransforms lllllllllllllIIlIlIlIIlllIllIllI = ItemCameraTransforms.DEFAULT;
            if (llIllIIlIIlIlll(lllllllllllllIIlIlIlIIllllIIIIIl.has(Deserializer.lIIllIlIlIllll[Deserializer.lIIllIlIllIIIl[2]]) ? 1 : 0)) {
                final JsonObject lllllllllllllIIlIlIlIIlllIllIlIl = JsonUtils.getJsonObject(lllllllllllllIIlIlIlIIllllIIIIIl, Deserializer.lIIllIlIlIllll[Deserializer.lIIllIlIllIIIl[3]]);
                lllllllllllllIIlIlIlIIlllIllIllI = (ItemCameraTransforms)lllllllllllllIIlIlIlIIlllIllIIlI.deserialize((JsonElement)lllllllllllllIIlIlIlIIlllIllIlIl, (Type)ItemCameraTransforms.class);
            }
            ModelBlock modelBlock;
            if (llIllIIlIIlIlll(lllllllllllllIIlIlIlIIlllIlllIll ? 1 : 0)) {
                modelBlock = new ModelBlock(new ResourceLocation(lllllllllllllIIlIlIlIIlllIlllllI), lllllllllllllIIlIlIlIIlllIlllIlI, lllllllllllllIIlIlIlIIlllIlllIIl, (boolean)(Deserializer.lIIllIlIllIIIl[1] != 0), lllllllllllllIIlIlIlIIlllIllIllI);
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                modelBlock = new ModelBlock(lllllllllllllIIlIlIlIIllllIIIIII, lllllllllllllIIlIlIlIIlllIlllIlI, lllllllllllllIIlIlIlIIlllIlllIIl, (boolean)(Deserializer.lIIllIlIllIIIl[1] != 0), lllllllllllllIIlIlIlIIlllIllIllI);
            }
            return modelBlock;
        }
        
        private static void llIllIIlIIIlllI() {
            (lIIllIlIlIllll = new String[Deserializer.lIIllIlIllIIIl[11]])[Deserializer.lIIllIlIllIIIl[0]] = llIllIIlIIIlIll("KFtu7Kfp2QaDdSsH9JmT966AdvrrWLGan/7oZSCoDF7yLptmHs5mBuXpmItxHIwZkjRfmzLEfGUxHBHJWfq4Hg==", "XYdFd");
            Deserializer.lIIllIlIlIllll[Deserializer.lIIllIlIllIIIl[1]] = llIllIIlIIIllII("KgIdOgwlARY8C0gcFygSARwXKkcNBwYxAhpOFzUCBQscLRRIAQB5FwkcFzcTRE4UNhIGClI7CBwG", "hnrYg");
            Deserializer.lIIllIlIlIllll[Deserializer.lIIllIlIllIIIl[2]] = llIllIIlIIIlIll("V2Tha9cepTs=", "HUOUu");
            Deserializer.lIIllIlIlIllll[Deserializer.lIIllIlIllIIIl[3]] = llIllIIlIIIlIll("AdSZuu6cZZU=", "ocZKC");
            Deserializer.lIIllIlIlIllll[Deserializer.lIIllIlIllIIIl[4]] = llIllIIlIIIllII("Og4rHyM8DiA=", "NkSkV");
            Deserializer.lIIllIlIlIllll[Deserializer.lIIllIlIllIIIl[5]] = llIllIIlIIIllIl("qXVqUhGys++6RG9sjYucsw==", "qqFkb");
            Deserializer.lIIllIlIlIllll[Deserializer.lIIllIlIllIIIl[6]] = llIllIIlIIIllII("AwwcMBQH", "smnUz");
            Deserializer.lIIllIlIlIllll[Deserializer.lIIllIlIllIIIl[7]] = llIllIIlIIIllIl("YdkcdBJe744=", "hhotV");
            Deserializer.lIIllIlIlIllll[Deserializer.lIIllIlIllIIIl[8]] = llIllIIlIIIllII("OB43EAQ3BzoaAjUGJhAONw==", "YsUya");
            Deserializer.lIIllIlIlIllll[Deserializer.lIIllIlIllIIIl[9]] = llIllIIlIIIllII("BDswHwkPIyY=", "aWUrl");
            Deserializer.lIIllIlIlIllll[Deserializer.lIIllIlIllIIIl[10]] = llIllIIlIIIllII("NyENBhQ8ORs=", "RMhkq");
        }
        
        protected boolean getAmbientOcclusionEnabled(final JsonObject lllllllllllllIIlIlIlIIllIlllllll) {
            return JsonUtils.getBoolean(lllllllllllllIIlIlIlIIllIlllllll, Deserializer.lIIllIlIlIllll[Deserializer.lIIllIlIllIIIl[8]], (boolean)(Deserializer.lIIllIlIllIIIl[1] != 0));
        }
        
        protected List<BlockPart> getModelElements(final JsonDeserializationContext lllllllllllllIIlIlIlIIllIllIlllI, final JsonObject lllllllllllllIIlIlIlIIllIllIIllI) {
            final List<BlockPart> lllllllllllllIIlIlIlIIllIllIlIlI = (List<BlockPart>)Lists.newArrayList();
            if (llIllIIlIIlIlll(lllllllllllllIIlIlIlIIllIllIIllI.has(Deserializer.lIIllIlIlIllll[Deserializer.lIIllIlIllIIIl[9]]) ? 1 : 0)) {
                final byte lllllllllllllIIlIlIlIIllIllIIIIl = (byte)JsonUtils.getJsonArray(lllllllllllllIIlIlIlIIllIllIIllI, Deserializer.lIIllIlIlIllll[Deserializer.lIIllIlIllIIIl[10]]).iterator();
                "".length();
                if (null != null) {
                    return null;
                }
                while (!llIllIIlIIllIII(((Iterator)lllllllllllllIIlIlIlIIllIllIIIIl).hasNext() ? 1 : 0)) {
                    final JsonElement lllllllllllllIIlIlIlIIllIllIlIIl = ((Iterator<JsonElement>)lllllllllllllIIlIlIlIIllIllIIIIl).next();
                    lllllllllllllIIlIlIlIIllIllIlIlI.add((BlockPart)lllllllllllllIIlIlIlIIllIllIlllI.deserialize(lllllllllllllIIlIlIlIIllIllIlIIl, (Type)BlockPart.class));
                    "".length();
                }
            }
            return lllllllllllllIIlIlIlIIllIllIlIlI;
        }
        
        private static String llIllIIlIIIlIll(final String lllllllllllllIIlIlIlIIllIlIIIIlI, final String lllllllllllllIIlIlIlIIllIIlllllI) {
            try {
                final SecretKeySpec lllllllllllllIIlIlIlIIllIlIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIlIIllIIlllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlIlIlIIllIlIIIllI = Cipher.getInstance("Blowfish");
                lllllllllllllIIlIlIlIIllIlIIIllI.init(Deserializer.lIIllIlIllIIIl[2], lllllllllllllIIlIlIlIIllIlIIlIII);
                return new String(lllllllllllllIIlIlIlIIllIlIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIlIIllIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIlIlIIllIlIIIlII) {
                lllllllllllllIIlIlIlIIllIlIIIlII.printStackTrace();
                return null;
            }
        }
        
        private static void llIllIIlIIlIllI() {
            (lIIllIlIllIIIl = new int[12])[0] = ((0x35 ^ 0x3D) & ~(0x54 ^ 0x5C));
            Deserializer.lIIllIlIllIIIl[1] = " ".length();
            Deserializer.lIIllIlIllIIIl[2] = "  ".length();
            Deserializer.lIIllIlIllIIIl[3] = "   ".length();
            Deserializer.lIIllIlIllIIIl[4] = (163 + 82 - 81 + 19 ^ 36 + 37 + 97 + 9);
            Deserializer.lIIllIlIllIIIl[5] = (0xA0 ^ 0xA4 ^ " ".length());
            Deserializer.lIIllIlIllIIIl[6] = (0x83 ^ 0x85);
            Deserializer.lIIllIlIllIIIl[7] = (0xAA ^ 0xAD);
            Deserializer.lIIllIlIllIIIl[8] = (0xC9 ^ 0xC1);
            Deserializer.lIIllIlIllIIIl[9] = (0x45 ^ 0x4 ^ (0xD7 ^ 0x9F));
            Deserializer.lIIllIlIllIIIl[10] = (0x27 ^ 0x2D);
            Deserializer.lIIllIlIllIIIl[11] = (0x41 ^ 0x4A);
        }
    }
}
