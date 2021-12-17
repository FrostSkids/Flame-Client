// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources.model;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.Deque;
import com.google.common.collect.Queues;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.util.EnumFacing;
import net.minecraft.client.renderer.block.model.BlockPartFace;
import net.minecraft.client.renderer.block.model.BlockPart;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.apache.logging.log4j.LogManager;
import net.minecraft.util.IRegistry;
import net.minecraft.client.renderer.texture.IIconCreator;
import java.io.StringReader;
import java.io.FileNotFoundException;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemBow;
import net.minecraft.init.Items;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import com.google.common.collect.Sets;
import com.google.common.collect.Maps;
import java.io.InputStream;
import java.io.IOException;
import org.apache.commons.io.IOUtils;
import java.io.Reader;
import java.io.InputStreamReader;
import com.google.common.base.Charsets;
import net.minecraft.client.resources.IResource;
import com.google.common.collect.Lists;
import org.apache.logging.log4j.Logger;
import net.minecraft.client.renderer.block.model.ItemModelGenerator;
import com.google.common.base.Joiner;
import java.util.List;
import net.minecraft.item.Item;
import java.util.Set;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.RegistrySimple;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.block.model.ModelBlockDefinition;
import net.minecraft.util.ResourceLocation;
import java.util.Map;
import net.minecraft.client.renderer.BlockModelShapes;
import net.minecraft.client.renderer.block.model.ModelBlock;
import net.minecraft.client.renderer.block.model.FaceBakery;

public class ModelBakery
{
    private final /* synthetic */ FaceBakery faceBakery;
    private static final /* synthetic */ ModelBlock MODEL_GENERATED;
    private final /* synthetic */ BlockModelShapes blockModelShapes;
    private final /* synthetic */ Map<ResourceLocation, ModelBlockDefinition> blockDefinitions;
    private final /* synthetic */ TextureMap textureMap;
    private /* synthetic */ RegistrySimple<ModelResourceLocation, IBakedModel> bakedRegistry;
    private static final /* synthetic */ int[] lIlIlIIIllIIII;
    private final /* synthetic */ Map<ResourceLocation, TextureAtlasSprite> sprites;
    private final /* synthetic */ IResourceManager resourceManager;
    private /* synthetic */ Map<String, ResourceLocation> itemLocations;
    private static final /* synthetic */ Set<ResourceLocation> LOCATIONS_BUILTIN_TEXTURES;
    private static final /* synthetic */ Map<String, String> BUILT_IN_MODELS;
    private /* synthetic */ Map<Item, List<String>> variantNames;
    private static final /* synthetic */ ModelBlock MODEL_CLOCK;
    private static final /* synthetic */ Joiner JOINER;
    private final /* synthetic */ ItemModelGenerator itemModelGenerator;
    private static final /* synthetic */ ModelBlock MODEL_COMPASS;
    protected static final /* synthetic */ ModelResourceLocation MODEL_MISSING;
    private static final /* synthetic */ Logger LOGGER;
    private static final /* synthetic */ ModelBlock MODEL_ENTITY;
    private final /* synthetic */ Map<ResourceLocation, ModelBlock> models;
    private final /* synthetic */ Map<ModelResourceLocation, ModelBlockDefinition.Variants> variants;
    private static final /* synthetic */ String[] lIlIIlIIllIlll;
    
    private ModelBlockDefinition getModelBlockDefinition(final ResourceLocation lllllllllllllIIIlIlIIllllIlIllIl) {
        final ResourceLocation lllllllllllllIIIlIlIIllllIlIllII = this.getBlockStateLocation(lllllllllllllIIIlIlIIllllIlIllIl);
        ModelBlockDefinition lllllllllllllIIIlIlIIllllIlIlIll = this.blockDefinitions.get(lllllllllllllIIIlIlIIllllIlIllII);
        if (lllIlIllllIIlII(lllllllllllllIIIlIlIIllllIlIlIll)) {
            final List<ModelBlockDefinition> lllllllllllllIIIlIlIIllllIlIlIlI = (List<ModelBlockDefinition>)Lists.newArrayList();
            try {
                final Exception lllllllllllllIIIlIlIIllllIIllllI = (Exception)this.resourceManager.getAllResources(lllllllllllllIIIlIlIIllllIlIllII).iterator();
                "".length();
                if (" ".length() == 0) {
                    return null;
                }
                while (!lllIlIllllIIIll(((Iterator)lllllllllllllIIIlIlIIllllIIllllI).hasNext() ? 1 : 0)) {
                    final IResource lllllllllllllIIIlIlIIllllIlIlIIl = ((Iterator<IResource>)lllllllllllllIIIlIlIIllllIIllllI).next();
                    InputStream lllllllllllllIIIlIlIIllllIlIlIII = null;
                    try {
                        lllllllllllllIIIlIlIIllllIlIlIII = lllllllllllllIIIlIlIIllllIlIlIIl.getInputStream();
                        final ModelBlockDefinition lllllllllllllIIIlIlIIllllIlIIlll = ModelBlockDefinition.parseFromReader(new InputStreamReader(lllllllllllllIIIlIlIIllllIlIlIII, Charsets.UTF_8));
                        lllllllllllllIIIlIlIIllllIlIlIlI.add(lllllllllllllIIIlIlIIllllIlIIlll);
                        "".length();
                        "".length();
                        if (-" ".length() != -" ".length()) {
                            return null;
                        }
                    }
                    catch (Exception lllllllllllllIIIlIlIIllllIlIIllI) {
                        throw new RuntimeException(String.valueOf(new StringBuilder(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[36]]).append(lllllllllllllIIIlIlIIllllIlIllIl).append(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[37]]).append(lllllllllllllIIIlIlIIllllIlIlIIl.getResourceLocation()).append(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[38]]).append(lllllllllllllIIIlIlIIllllIlIlIIl.getResourcePackName()).append(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[39]])), lllllllllllllIIIlIlIIllllIlIIllI);
                    }
                    finally {
                        IOUtils.closeQuietly(lllllllllllllIIIlIlIIllllIlIlIII);
                    }
                    IOUtils.closeQuietly(lllllllllllllIIIlIlIIllllIlIlIII);
                }
                "".length();
                if ((0x3C ^ 0x38) != (0x3A ^ 0x3E)) {
                    return null;
                }
            }
            catch (IOException lllllllllllllIIIlIlIIllllIlIIlIl) {
                throw new RuntimeException(String.valueOf(new StringBuilder(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[40]]).append(lllllllllllllIIIlIlIIllllIlIllII.toString())), lllllllllllllIIIlIlIIllllIlIIlIl);
            }
            lllllllllllllIIIlIlIIllllIlIlIll = new ModelBlockDefinition(lllllllllllllIIIlIlIIllllIlIlIlI);
            this.blockDefinitions.put(lllllllllllllIIIlIlIIllllIlIllII, lllllllllllllIIIlIlIIllllIlIlIll);
            "".length();
        }
        return lllllllllllllIIIlIlIIllllIlIlIll;
    }
    
    private static boolean lllIlIllllIlIII(final Object lllllllllllllIIIlIlIIlIllllIllll, final Object lllllllllllllIIIlIlIIlIllllIlllI) {
        return lllllllllllllIIIlIlIIlIllllIllll == lllllllllllllIIIlIlIIlIllllIlllI;
    }
    
    public ModelBakery(final IResourceManager lllllllllllllIIIlIlIIllllllIIllI, final TextureMap lllllllllllllIIIlIlIIllllllIIIIl, final BlockModelShapes lllllllllllllIIIlIlIIllllllIIlII) {
        this.sprites = (Map<ResourceLocation, TextureAtlasSprite>)Maps.newHashMap();
        this.models = (Map<ResourceLocation, ModelBlock>)Maps.newLinkedHashMap();
        this.variants = (Map<ModelResourceLocation, ModelBlockDefinition.Variants>)Maps.newLinkedHashMap();
        this.faceBakery = new FaceBakery();
        this.itemModelGenerator = new ItemModelGenerator();
        this.bakedRegistry = new RegistrySimple<ModelResourceLocation, IBakedModel>();
        this.itemLocations = (Map<String, ResourceLocation>)Maps.newLinkedHashMap();
        this.blockDefinitions = (Map<ResourceLocation, ModelBlockDefinition>)Maps.newHashMap();
        this.variantNames = (Map<Item, List<String>>)Maps.newIdentityHashMap();
        this.resourceManager = lllllllllllllIIIlIlIIllllllIIllI;
        this.textureMap = lllllllllllllIIIlIlIIllllllIIIIl;
        this.blockModelShapes = lllllllllllllIIIlIlIIllllllIIlII;
    }
    
    private Set<ResourceLocation> getVariantsTextureLocations() {
        final Set<ResourceLocation> lllllllllllllIIIlIlIIlllIIIIllIl = (Set<ResourceLocation>)Sets.newHashSet();
        final List<ModelResourceLocation> lllllllllllllIIIlIlIIlllIIIIllII = (List<ModelResourceLocation>)Lists.newArrayList((Iterable)this.variants.keySet());
        Collections.sort(lllllllllllllIIIlIlIIlllIIIIllII, new Comparator<ModelResourceLocation>() {
            @Override
            public int compare(final ModelResourceLocation lllllllllllllIIllllllIlIIIllIIlI, final ModelResourceLocation lllllllllllllIIllllllIlIIIlIllll) {
                return lllllllllllllIIllllllIlIIIllIIlI.toString().compareTo(lllllllllllllIIllllllIlIIIlIllll.toString());
            }
        });
        final byte lllllllllllllIIIlIlIIlllIIIIIIll = (byte)lllllllllllllIIIlIlIIlllIIIIllII.iterator();
        "".length();
        if (((0xA6 ^ 0x85) & ~(0x7E ^ 0x5D)) != ((0x9D ^ 0xBD) & ~(0x6A ^ 0x4A))) {
            return null;
        }
        while (!lllIlIllllIIIll(((Iterator)lllllllllllllIIIlIlIIlllIIIIIIll).hasNext() ? 1 : 0)) {
            final ModelResourceLocation lllllllllllllIIIlIlIIlllIIIIlIll = ((Iterator<ModelResourceLocation>)lllllllllllllIIIlIlIIlllIIIIIIll).next();
            final ModelBlockDefinition.Variants lllllllllllllIIIlIlIIlllIIIIlIlI = this.variants.get(lllllllllllllIIIlIlIIlllIIIIlIll);
            final int lllllllllllllIIIlIlIIlllIIIIIIII = (int)lllllllllllllIIIlIlIIlllIIIIlIlI.getVariants().iterator();
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
            while (!lllIlIllllIIIll(((Iterator)lllllllllllllIIIlIlIIlllIIIIIIII).hasNext() ? 1 : 0)) {
                final ModelBlockDefinition.Variant lllllllllllllIIIlIlIIlllIIIIlIIl = ((Iterator<ModelBlockDefinition.Variant>)lllllllllllllIIIlIlIIlllIIIIIIII).next();
                final ModelBlock lllllllllllllIIIlIlIIlllIIIIlIII = this.models.get(lllllllllllllIIIlIlIIlllIIIIlIIl.getModelLocation());
                if (lllIlIllllIIlII(lllllllllllllIIIlIlIIlllIIIIlIII)) {
                    ModelBakery.LOGGER.warn(String.valueOf(new StringBuilder(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[281]]).append(lllllllllllllIIIlIlIIlllIIIIlIll)));
                    "".length();
                    if ((0x63 ^ 0x2B ^ (0x69 ^ 0x25)) != (96 + 78 - 41 + 19 ^ 88 + 34 + 3 + 31)) {
                        return null;
                    }
                    continue;
                }
                else {
                    lllllllllllllIIIlIlIIlllIIIIllIl.addAll(this.getTextureLocations(lllllllllllllIIIlIlIIlllIIIIlIII));
                    "".length();
                }
            }
        }
        lllllllllllllIIIlIlIIlllIIIIllIl.addAll(ModelBakery.LOCATIONS_BUILTIN_TEXTURES);
        "".length();
        return lllllllllllllIIIlIlIIlllIIIIllIl;
    }
    
    private void registerVariantNames() {
        final Map<Item, List<String>> variantNames = this.variantNames;
        final Item itemFromBlock = Item.getItemFromBlock(Blocks.stone);
        final String[] array = new String[ModelBakery.lIlIlIIIllIIII[8]];
        array[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[57]];
        array[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[58]];
        array[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[59]];
        array[ModelBakery.lIlIlIIIllIIII[4]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[60]];
        array[ModelBakery.lIlIlIIIllIIII[5]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[61]];
        array[ModelBakery.lIlIlIIIllIIII[6]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[62]];
        array[ModelBakery.lIlIlIIIllIIII[7]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[63]];
        variantNames.put(itemFromBlock, Lists.newArrayList((Object[])array));
        "".length();
        final Map<Item, List<String>> variantNames2 = this.variantNames;
        final Item itemFromBlock2 = Item.getItemFromBlock(Blocks.dirt);
        final String[] array2 = new String[ModelBakery.lIlIlIIIllIIII[4]];
        array2[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[64]];
        array2[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[65]];
        array2[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[66]];
        variantNames2.put(itemFromBlock2, Lists.newArrayList((Object[])array2));
        "".length();
        final Map<Item, List<String>> variantNames3 = this.variantNames;
        final Item itemFromBlock3 = Item.getItemFromBlock(Blocks.planks);
        final String[] array3 = new String[ModelBakery.lIlIlIIIllIIII[7]];
        array3[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[67]];
        array3[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[68]];
        array3[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[69]];
        array3[ModelBakery.lIlIlIIIllIIII[4]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[70]];
        array3[ModelBakery.lIlIlIIIllIIII[5]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[71]];
        array3[ModelBakery.lIlIlIIIllIIII[6]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[72]];
        variantNames3.put(itemFromBlock3, Lists.newArrayList((Object[])array3));
        "".length();
        final Map<Item, List<String>> variantNames4 = this.variantNames;
        final Item itemFromBlock4 = Item.getItemFromBlock(Blocks.sapling);
        final String[] array4 = new String[ModelBakery.lIlIlIIIllIIII[7]];
        array4[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[73]];
        array4[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[74]];
        array4[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[75]];
        array4[ModelBakery.lIlIlIIIllIIII[4]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[76]];
        array4[ModelBakery.lIlIlIIIllIIII[5]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[77]];
        array4[ModelBakery.lIlIlIIIllIIII[6]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[78]];
        variantNames4.put(itemFromBlock4, Lists.newArrayList((Object[])array4));
        "".length();
        final Map<Item, List<String>> variantNames5 = this.variantNames;
        final Item itemFromBlock5 = Item.getItemFromBlock(Blocks.sand);
        final String[] array5 = new String[ModelBakery.lIlIlIIIllIIII[3]];
        array5[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[79]];
        array5[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[80]];
        variantNames5.put(itemFromBlock5, Lists.newArrayList((Object[])array5));
        "".length();
        final Map<Item, List<String>> variantNames6 = this.variantNames;
        final Item itemFromBlock6 = Item.getItemFromBlock(Blocks.log);
        final String[] array6 = new String[ModelBakery.lIlIlIIIllIIII[5]];
        array6[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[81]];
        array6[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[82]];
        array6[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[83]];
        array6[ModelBakery.lIlIlIIIllIIII[4]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[84]];
        variantNames6.put(itemFromBlock6, Lists.newArrayList((Object[])array6));
        "".length();
        final Map<Item, List<String>> variantNames7 = this.variantNames;
        final Item itemFromBlock7 = Item.getItemFromBlock(Blocks.leaves);
        final String[] array7 = new String[ModelBakery.lIlIlIIIllIIII[5]];
        array7[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[85]];
        array7[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[86]];
        array7[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[87]];
        array7[ModelBakery.lIlIlIIIllIIII[4]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[88]];
        variantNames7.put(itemFromBlock7, Lists.newArrayList((Object[])array7));
        "".length();
        final Map<Item, List<String>> variantNames8 = this.variantNames;
        final Item itemFromBlock8 = Item.getItemFromBlock(Blocks.sponge);
        final String[] array8 = new String[ModelBakery.lIlIlIIIllIIII[3]];
        array8[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[89]];
        array8[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[90]];
        variantNames8.put(itemFromBlock8, Lists.newArrayList((Object[])array8));
        "".length();
        final Map<Item, List<String>> variantNames9 = this.variantNames;
        final Item itemFromBlock9 = Item.getItemFromBlock(Blocks.sandstone);
        final String[] array9 = new String[ModelBakery.lIlIlIIIllIIII[4]];
        array9[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[91]];
        array9[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[92]];
        array9[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[93]];
        variantNames9.put(itemFromBlock9, Lists.newArrayList((Object[])array9));
        "".length();
        final Map<Item, List<String>> variantNames10 = this.variantNames;
        final Item itemFromBlock10 = Item.getItemFromBlock(Blocks.red_sandstone);
        final String[] array10 = new String[ModelBakery.lIlIlIIIllIIII[4]];
        array10[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[94]];
        array10[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[95]];
        array10[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[96]];
        variantNames10.put(itemFromBlock10, Lists.newArrayList((Object[])array10));
        "".length();
        final Map<Item, List<String>> variantNames11 = this.variantNames;
        final Item itemFromBlock11 = Item.getItemFromBlock(Blocks.tallgrass);
        final String[] array11 = new String[ModelBakery.lIlIlIIIllIIII[4]];
        array11[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[97]];
        array11[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[98]];
        array11[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[99]];
        variantNames11.put(itemFromBlock11, Lists.newArrayList((Object[])array11));
        "".length();
        final Map<Item, List<String>> variantNames12 = this.variantNames;
        final Item itemFromBlock12 = Item.getItemFromBlock(Blocks.deadbush);
        final String[] array12 = new String[ModelBakery.lIlIlIIIllIIII[2]];
        array12[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[100]];
        variantNames12.put(itemFromBlock12, Lists.newArrayList((Object[])array12));
        "".length();
        final Map<Item, List<String>> variantNames13 = this.variantNames;
        final Item itemFromBlock13 = Item.getItemFromBlock(Blocks.wool);
        final String[] array13 = new String[ModelBakery.lIlIlIIIllIIII[17]];
        array13[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[101]];
        array13[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[102]];
        array13[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[103]];
        array13[ModelBakery.lIlIlIIIllIIII[4]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[104]];
        array13[ModelBakery.lIlIlIIIllIIII[5]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[105]];
        array13[ModelBakery.lIlIlIIIllIIII[6]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[106]];
        array13[ModelBakery.lIlIlIIIllIIII[7]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[107]];
        array13[ModelBakery.lIlIlIIIllIIII[8]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[108]];
        array13[ModelBakery.lIlIlIIIllIIII[9]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[109]];
        array13[ModelBakery.lIlIlIIIllIIII[10]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[110]];
        array13[ModelBakery.lIlIlIIIllIIII[11]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[111]];
        array13[ModelBakery.lIlIlIIIllIIII[12]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[112]];
        array13[ModelBakery.lIlIlIIIllIIII[13]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[113]];
        array13[ModelBakery.lIlIlIIIllIIII[14]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[114]];
        array13[ModelBakery.lIlIlIIIllIIII[15]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[115]];
        array13[ModelBakery.lIlIlIIIllIIII[16]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[116]];
        variantNames13.put(itemFromBlock13, Lists.newArrayList((Object[])array13));
        "".length();
        final Map<Item, List<String>> variantNames14 = this.variantNames;
        final Item itemFromBlock14 = Item.getItemFromBlock(Blocks.yellow_flower);
        final String[] array14 = new String[ModelBakery.lIlIlIIIllIIII[2]];
        array14[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[117]];
        variantNames14.put(itemFromBlock14, Lists.newArrayList((Object[])array14));
        "".length();
        final Map<Item, List<String>> variantNames15 = this.variantNames;
        final Item itemFromBlock15 = Item.getItemFromBlock(Blocks.red_flower);
        final String[] array15 = new String[ModelBakery.lIlIlIIIllIIII[10]];
        array15[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[118]];
        array15[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[119]];
        array15[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[120]];
        array15[ModelBakery.lIlIlIIIllIIII[4]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[121]];
        array15[ModelBakery.lIlIlIIIllIIII[5]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[122]];
        array15[ModelBakery.lIlIlIIIllIIII[6]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[123]];
        array15[ModelBakery.lIlIlIIIllIIII[7]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[124]];
        array15[ModelBakery.lIlIlIIIllIIII[8]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[125]];
        array15[ModelBakery.lIlIlIIIllIIII[9]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[126]];
        variantNames15.put(itemFromBlock15, Lists.newArrayList((Object[])array15));
        "".length();
        final Map<Item, List<String>> variantNames16 = this.variantNames;
        final Item itemFromBlock16 = Item.getItemFromBlock(Blocks.stone_slab);
        final String[] array16 = new String[ModelBakery.lIlIlIIIllIIII[8]];
        array16[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[127]];
        array16[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[128]];
        array16[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[129]];
        array16[ModelBakery.lIlIlIIIllIIII[4]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[130]];
        array16[ModelBakery.lIlIlIIIllIIII[5]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[131]];
        array16[ModelBakery.lIlIlIIIllIIII[6]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[132]];
        array16[ModelBakery.lIlIlIIIllIIII[7]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[133]];
        variantNames16.put(itemFromBlock16, Lists.newArrayList((Object[])array16));
        "".length();
        final Map<Item, List<String>> variantNames17 = this.variantNames;
        final Item itemFromBlock17 = Item.getItemFromBlock(Blocks.stone_slab2);
        final String[] array17 = new String[ModelBakery.lIlIlIIIllIIII[2]];
        array17[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[134]];
        variantNames17.put(itemFromBlock17, Lists.newArrayList((Object[])array17));
        "".length();
        final Map<Item, List<String>> variantNames18 = this.variantNames;
        final Item itemFromBlock18 = Item.getItemFromBlock(Blocks.stained_glass);
        final String[] array18 = new String[ModelBakery.lIlIlIIIllIIII[17]];
        array18[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[135]];
        array18[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[136]];
        array18[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[137]];
        array18[ModelBakery.lIlIlIIIllIIII[4]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[138]];
        array18[ModelBakery.lIlIlIIIllIIII[5]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[139]];
        array18[ModelBakery.lIlIlIIIllIIII[6]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[140]];
        array18[ModelBakery.lIlIlIIIllIIII[7]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[141]];
        array18[ModelBakery.lIlIlIIIllIIII[8]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[142]];
        array18[ModelBakery.lIlIlIIIllIIII[9]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[143]];
        array18[ModelBakery.lIlIlIIIllIIII[10]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[144]];
        array18[ModelBakery.lIlIlIIIllIIII[11]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[145]];
        array18[ModelBakery.lIlIlIIIllIIII[12]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[146]];
        array18[ModelBakery.lIlIlIIIllIIII[13]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[147]];
        array18[ModelBakery.lIlIlIIIllIIII[14]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[148]];
        array18[ModelBakery.lIlIlIIIllIIII[15]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[149]];
        array18[ModelBakery.lIlIlIIIllIIII[16]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[150]];
        variantNames18.put(itemFromBlock18, Lists.newArrayList((Object[])array18));
        "".length();
        final Map<Item, List<String>> variantNames19 = this.variantNames;
        final Item itemFromBlock19 = Item.getItemFromBlock(Blocks.monster_egg);
        final String[] array19 = new String[ModelBakery.lIlIlIIIllIIII[7]];
        array19[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[151]];
        array19[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[152]];
        array19[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[153]];
        array19[ModelBakery.lIlIlIIIllIIII[4]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[154]];
        array19[ModelBakery.lIlIlIIIllIIII[5]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[155]];
        array19[ModelBakery.lIlIlIIIllIIII[6]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[156]];
        variantNames19.put(itemFromBlock19, Lists.newArrayList((Object[])array19));
        "".length();
        final Map<Item, List<String>> variantNames20 = this.variantNames;
        final Item itemFromBlock20 = Item.getItemFromBlock(Blocks.stonebrick);
        final String[] array20 = new String[ModelBakery.lIlIlIIIllIIII[5]];
        array20[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[157]];
        array20[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[158]];
        array20[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[159]];
        array20[ModelBakery.lIlIlIIIllIIII[4]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[160]];
        variantNames20.put(itemFromBlock20, Lists.newArrayList((Object[])array20));
        "".length();
        final Map<Item, List<String>> variantNames21 = this.variantNames;
        final Item itemFromBlock21 = Item.getItemFromBlock(Blocks.wooden_slab);
        final String[] array21 = new String[ModelBakery.lIlIlIIIllIIII[7]];
        array21[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[161]];
        array21[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[162]];
        array21[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[163]];
        array21[ModelBakery.lIlIlIIIllIIII[4]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[164]];
        array21[ModelBakery.lIlIlIIIllIIII[5]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[165]];
        array21[ModelBakery.lIlIlIIIllIIII[6]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[166]];
        variantNames21.put(itemFromBlock21, Lists.newArrayList((Object[])array21));
        "".length();
        final Map<Item, List<String>> variantNames22 = this.variantNames;
        final Item itemFromBlock22 = Item.getItemFromBlock(Blocks.cobblestone_wall);
        final String[] array22 = new String[ModelBakery.lIlIlIIIllIIII[3]];
        array22[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[167]];
        array22[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[168]];
        variantNames22.put(itemFromBlock22, Lists.newArrayList((Object[])array22));
        "".length();
        final Map<Item, List<String>> variantNames23 = this.variantNames;
        final Item itemFromBlock23 = Item.getItemFromBlock(Blocks.anvil);
        final String[] array23 = new String[ModelBakery.lIlIlIIIllIIII[4]];
        array23[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[169]];
        array23[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[170]];
        array23[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[171]];
        variantNames23.put(itemFromBlock23, Lists.newArrayList((Object[])array23));
        "".length();
        final Map<Item, List<String>> variantNames24 = this.variantNames;
        final Item itemFromBlock24 = Item.getItemFromBlock(Blocks.quartz_block);
        final String[] array24 = new String[ModelBakery.lIlIlIIIllIIII[4]];
        array24[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[172]];
        array24[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[173]];
        array24[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[174]];
        variantNames24.put(itemFromBlock24, Lists.newArrayList((Object[])array24));
        "".length();
        final Map<Item, List<String>> variantNames25 = this.variantNames;
        final Item itemFromBlock25 = Item.getItemFromBlock(Blocks.stained_hardened_clay);
        final String[] array25 = new String[ModelBakery.lIlIlIIIllIIII[17]];
        array25[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[175]];
        array25[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[176]];
        array25[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[177]];
        array25[ModelBakery.lIlIlIIIllIIII[4]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[178]];
        array25[ModelBakery.lIlIlIIIllIIII[5]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[179]];
        array25[ModelBakery.lIlIlIIIllIIII[6]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[180]];
        array25[ModelBakery.lIlIlIIIllIIII[7]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[181]];
        array25[ModelBakery.lIlIlIIIllIIII[8]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[182]];
        array25[ModelBakery.lIlIlIIIllIIII[9]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[183]];
        array25[ModelBakery.lIlIlIIIllIIII[10]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[184]];
        array25[ModelBakery.lIlIlIIIllIIII[11]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[185]];
        array25[ModelBakery.lIlIlIIIllIIII[12]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[186]];
        array25[ModelBakery.lIlIlIIIllIIII[13]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[187]];
        array25[ModelBakery.lIlIlIIIllIIII[14]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[188]];
        array25[ModelBakery.lIlIlIIIllIIII[15]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[189]];
        array25[ModelBakery.lIlIlIIIllIIII[16]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[190]];
        variantNames25.put(itemFromBlock25, Lists.newArrayList((Object[])array25));
        "".length();
        final Map<Item, List<String>> variantNames26 = this.variantNames;
        final Item itemFromBlock26 = Item.getItemFromBlock(Blocks.stained_glass_pane);
        final String[] array26 = new String[ModelBakery.lIlIlIIIllIIII[17]];
        array26[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[191]];
        array26[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[192]];
        array26[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[193]];
        array26[ModelBakery.lIlIlIIIllIIII[4]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[194]];
        array26[ModelBakery.lIlIlIIIllIIII[5]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[195]];
        array26[ModelBakery.lIlIlIIIllIIII[6]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[196]];
        array26[ModelBakery.lIlIlIIIllIIII[7]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[197]];
        array26[ModelBakery.lIlIlIIIllIIII[8]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[198]];
        array26[ModelBakery.lIlIlIIIllIIII[9]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[199]];
        array26[ModelBakery.lIlIlIIIllIIII[10]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[200]];
        array26[ModelBakery.lIlIlIIIllIIII[11]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[201]];
        array26[ModelBakery.lIlIlIIIllIIII[12]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[202]];
        array26[ModelBakery.lIlIlIIIllIIII[13]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[203]];
        array26[ModelBakery.lIlIlIIIllIIII[14]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[204]];
        array26[ModelBakery.lIlIlIIIllIIII[15]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[205]];
        array26[ModelBakery.lIlIlIIIllIIII[16]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[206]];
        variantNames26.put(itemFromBlock26, Lists.newArrayList((Object[])array26));
        "".length();
        final Map<Item, List<String>> variantNames27 = this.variantNames;
        final Item itemFromBlock27 = Item.getItemFromBlock(Blocks.leaves2);
        final String[] array27 = new String[ModelBakery.lIlIlIIIllIIII[3]];
        array27[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[207]];
        array27[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[208]];
        variantNames27.put(itemFromBlock27, Lists.newArrayList((Object[])array27));
        "".length();
        final Map<Item, List<String>> variantNames28 = this.variantNames;
        final Item itemFromBlock28 = Item.getItemFromBlock(Blocks.log2);
        final String[] array28 = new String[ModelBakery.lIlIlIIIllIIII[3]];
        array28[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[209]];
        array28[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[210]];
        variantNames28.put(itemFromBlock28, Lists.newArrayList((Object[])array28));
        "".length();
        final Map<Item, List<String>> variantNames29 = this.variantNames;
        final Item itemFromBlock29 = Item.getItemFromBlock(Blocks.prismarine);
        final String[] array29 = new String[ModelBakery.lIlIlIIIllIIII[4]];
        array29[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[211]];
        array29[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[212]];
        array29[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[213]];
        variantNames29.put(itemFromBlock29, Lists.newArrayList((Object[])array29));
        "".length();
        final Map<Item, List<String>> variantNames30 = this.variantNames;
        final Item itemFromBlock30 = Item.getItemFromBlock(Blocks.carpet);
        final String[] array30 = new String[ModelBakery.lIlIlIIIllIIII[17]];
        array30[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[214]];
        array30[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[215]];
        array30[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[216]];
        array30[ModelBakery.lIlIlIIIllIIII[4]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[217]];
        array30[ModelBakery.lIlIlIIIllIIII[5]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[218]];
        array30[ModelBakery.lIlIlIIIllIIII[6]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[219]];
        array30[ModelBakery.lIlIlIIIllIIII[7]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[220]];
        array30[ModelBakery.lIlIlIIIllIIII[8]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[221]];
        array30[ModelBakery.lIlIlIIIllIIII[9]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[222]];
        array30[ModelBakery.lIlIlIIIllIIII[10]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[223]];
        array30[ModelBakery.lIlIlIIIllIIII[11]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[224]];
        array30[ModelBakery.lIlIlIIIllIIII[12]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[225]];
        array30[ModelBakery.lIlIlIIIllIIII[13]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[226]];
        array30[ModelBakery.lIlIlIIIllIIII[14]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[227]];
        array30[ModelBakery.lIlIlIIIllIIII[15]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[228]];
        array30[ModelBakery.lIlIlIIIllIIII[16]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[229]];
        variantNames30.put(itemFromBlock30, Lists.newArrayList((Object[])array30));
        "".length();
        final Map<Item, List<String>> variantNames31 = this.variantNames;
        final Item itemFromBlock31 = Item.getItemFromBlock(Blocks.double_plant);
        final String[] array31 = new String[ModelBakery.lIlIlIIIllIIII[7]];
        array31[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[230]];
        array31[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[231]];
        array31[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[232]];
        array31[ModelBakery.lIlIlIIIllIIII[4]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[233]];
        array31[ModelBakery.lIlIlIIIllIIII[5]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[234]];
        array31[ModelBakery.lIlIlIIIllIIII[6]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[235]];
        variantNames31.put(itemFromBlock31, Lists.newArrayList((Object[])array31));
        "".length();
        final Map<Item, List<String>> variantNames32 = this.variantNames;
        final ItemBow bow = Items.bow;
        final String[] array32 = new String[ModelBakery.lIlIlIIIllIIII[5]];
        array32[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[236]];
        array32[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[237]];
        array32[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[238]];
        array32[ModelBakery.lIlIlIIIllIIII[4]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[239]];
        variantNames32.put(bow, Lists.newArrayList((Object[])array32));
        "".length();
        final Map<Item, List<String>> variantNames33 = this.variantNames;
        final Item coal = Items.coal;
        final String[] array33 = new String[ModelBakery.lIlIlIIIllIIII[3]];
        array33[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[240]];
        array33[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[241]];
        variantNames33.put(coal, Lists.newArrayList((Object[])array33));
        "".length();
        final Map<Item, List<String>> variantNames34 = this.variantNames;
        final ItemFishingRod fishing_rod = Items.fishing_rod;
        final String[] array34 = new String[ModelBakery.lIlIlIIIllIIII[3]];
        array34[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[242]];
        array34[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[243]];
        variantNames34.put(fishing_rod, Lists.newArrayList((Object[])array34));
        "".length();
        final Map<Item, List<String>> variantNames35 = this.variantNames;
        final Item fish = Items.fish;
        final String[] array35 = new String[ModelBakery.lIlIlIIIllIIII[5]];
        array35[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[244]];
        array35[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[245]];
        array35[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[246]];
        array35[ModelBakery.lIlIlIIIllIIII[4]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[247]];
        variantNames35.put(fish, Lists.newArrayList((Object[])array35));
        "".length();
        final Map<Item, List<String>> variantNames36 = this.variantNames;
        final Item cooked_fish = Items.cooked_fish;
        final String[] array36 = new String[ModelBakery.lIlIlIIIllIIII[3]];
        array36[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[248]];
        array36[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[249]];
        variantNames36.put(cooked_fish, Lists.newArrayList((Object[])array36));
        "".length();
        final Map<Item, List<String>> variantNames37 = this.variantNames;
        final Item dye = Items.dye;
        final String[] array37 = new String[ModelBakery.lIlIlIIIllIIII[17]];
        array37[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[250]];
        array37[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[251]];
        array37[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[252]];
        array37[ModelBakery.lIlIlIIIllIIII[4]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[253]];
        array37[ModelBakery.lIlIlIIIllIIII[5]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[254]];
        array37[ModelBakery.lIlIlIIIllIIII[6]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[255]];
        array37[ModelBakery.lIlIlIIIllIIII[7]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[256]];
        array37[ModelBakery.lIlIlIIIllIIII[8]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[257]];
        array37[ModelBakery.lIlIlIIIllIIII[9]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[258]];
        array37[ModelBakery.lIlIlIIIllIIII[10]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[259]];
        array37[ModelBakery.lIlIlIIIllIIII[11]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[260]];
        array37[ModelBakery.lIlIlIIIllIIII[12]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[261]];
        array37[ModelBakery.lIlIlIIIllIIII[13]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[262]];
        array37[ModelBakery.lIlIlIIIllIIII[14]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[263]];
        array37[ModelBakery.lIlIlIIIllIIII[15]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[264]];
        array37[ModelBakery.lIlIlIIIllIIII[16]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[265]];
        variantNames37.put(dye, Lists.newArrayList((Object[])array37));
        "".length();
        final Map<Item, List<String>> variantNames38 = this.variantNames;
        final ItemPotion potionitem = Items.potionitem;
        final String[] array38 = new String[ModelBakery.lIlIlIIIllIIII[3]];
        array38[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[266]];
        array38[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[267]];
        variantNames38.put(potionitem, Lists.newArrayList((Object[])array38));
        "".length();
        final Map<Item, List<String>> variantNames39 = this.variantNames;
        final Item skull = Items.skull;
        final String[] array39 = new String[ModelBakery.lIlIlIIIllIIII[6]];
        array39[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[268]];
        array39[ModelBakery.lIlIlIIIllIIII[2]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[269]];
        array39[ModelBakery.lIlIlIIIllIIII[3]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[270]];
        array39[ModelBakery.lIlIlIIIllIIII[4]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[271]];
        array39[ModelBakery.lIlIlIIIllIIII[5]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[272]];
        variantNames39.put(skull, Lists.newArrayList((Object[])array39));
        "".length();
        final Map<Item, List<String>> variantNames40 = this.variantNames;
        final Item itemFromBlock32 = Item.getItemFromBlock(Blocks.oak_fence_gate);
        final String[] array40 = new String[ModelBakery.lIlIlIIIllIIII[2]];
        array40[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[273]];
        variantNames40.put(itemFromBlock32, Lists.newArrayList((Object[])array40));
        "".length();
        final Map<Item, List<String>> variantNames41 = this.variantNames;
        final Item itemFromBlock33 = Item.getItemFromBlock(Blocks.oak_fence);
        final String[] array41 = new String[ModelBakery.lIlIlIIIllIIII[2]];
        array41[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[274]];
        variantNames41.put(itemFromBlock33, Lists.newArrayList((Object[])array41));
        "".length();
        final Map<Item, List<String>> variantNames42 = this.variantNames;
        final Item oak_door = Items.oak_door;
        final String[] array42 = new String[ModelBakery.lIlIlIIIllIIII[2]];
        array42[ModelBakery.lIlIlIIIllIIII[1]] = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[275]];
        variantNames42.put(oak_door, Lists.newArrayList((Object[])array42));
        "".length();
    }
    
    private ModelBlock loadModel(final ResourceLocation lllllllllllllIIIlIlIIlllIllIllll) throws IOException {
        final String lllllllllllllIIIlIlIIlllIllllIIl = lllllllllllllIIIlIlIIlllIllIllll.getResourcePath();
        if (lllIlIllllIIlIl(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[46]].equals(lllllllllllllIIIlIlIIlllIllllIIl) ? 1 : 0)) {
            return ModelBakery.MODEL_GENERATED;
        }
        if (lllIlIllllIIlIl(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[47]].equals(lllllllllllllIIIlIlIIlllIllllIIl) ? 1 : 0)) {
            return ModelBakery.MODEL_COMPASS;
        }
        if (lllIlIllllIIlIl(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[48]].equals(lllllllllllllIIIlIlIIlllIllllIIl) ? 1 : 0)) {
            return ModelBakery.MODEL_CLOCK;
        }
        if (lllIlIllllIIlIl(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[49]].equals(lllllllllllllIIIlIlIIlllIllllIIl) ? 1 : 0)) {
            return ModelBakery.MODEL_ENTITY;
        }
        Reader lllllllllllllIIIlIlIIlllIlllIlll;
        if (lllIlIllllIIlIl(lllllllllllllIIIlIlIIlllIllllIIl.startsWith(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[50]]) ? 1 : 0)) {
            final String lllllllllllllIIIlIlIIlllIlllIllI = lllllllllllllIIIlIlIIlllIllllIIl.substring(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[51]].length());
            final String lllllllllllllIIIlIlIIlllIlllIlIl = ModelBakery.BUILT_IN_MODELS.get(lllllllllllllIIIlIlIIlllIlllIllI);
            if (lllIlIllllIIlII(lllllllllllllIIIlIlIIlllIlllIlIl)) {
                throw new FileNotFoundException(lllllllllllllIIIlIlIIlllIllIllll.toString());
            }
            final Reader lllllllllllllIIIlIlIIlllIllllIII = new StringReader(lllllllllllllIIIlIlIIlllIlllIlIl);
            "".length();
            if (-" ".length() > (30 + 119 - 100 + 99 ^ 89 + 120 - 72 + 7)) {
                return null;
            }
        }
        else {
            final IResource lllllllllllllIIIlIlIIlllIlllIlII = this.resourceManager.getResource(this.getModelLocation(lllllllllllllIIIlIlIIlllIllIllll));
            lllllllllllllIIIlIlIIlllIlllIlll = new InputStreamReader(lllllllllllllIIIlIlIIlllIlllIlII.getInputStream(), Charsets.UTF_8);
        }
        try {
            final ModelBlock lllllllllllllIIIlIlIIlllIlllIIIl = ModelBlock.deserialize(lllllllllllllIIIlIlIIlllIlllIlll);
            lllllllllllllIIIlIlIIlllIlllIIIl.name = lllllllllllllIIIlIlIIlllIllIllll.toString();
            final ModelBlock lllllllllllllIIIlIlIIlllIlllIIll = lllllllllllllIIIlIlIIlllIlllIIIl;
            "".length();
            if (((0x0 ^ 0x26 ^ (0x6F ^ 0x7)) & (0x63 ^ 0x2A ^ (0xA5 ^ 0xA2) ^ -" ".length())) > 0) {
                return null;
            }
        }
        finally {
            lllllllllllllIIIlIlIIlllIlllIlll.close();
        }
        lllllllllllllIIIlIlIIlllIlllIlll.close();
        final ModelBlock lllllllllllllIIIlIlIIlllIlllIIlI;
        return lllllllllllllIIIlIlIIlllIlllIIlI;
    }
    
    private static void lllIlIllllIIIlI() {
        (lIlIlIIIllIIII = new int[290])[0] = (0x51 ^ 0x54 ^ (0x59 ^ 0x4E));
        ModelBakery.lIlIlIIIllIIII[1] = ((0x63 ^ 0x5A) & ~(0x8A ^ 0xB3));
        ModelBakery.lIlIlIIIllIIII[2] = " ".length();
        ModelBakery.lIlIlIIIllIIII[3] = "  ".length();
        ModelBakery.lIlIlIIIllIIII[4] = "   ".length();
        ModelBakery.lIlIlIIIllIIII[5] = (0x26 ^ 0x22);
        ModelBakery.lIlIlIIIllIIII[6] = (0x10 ^ 0x0 ^ (0x32 ^ 0x27));
        ModelBakery.lIlIlIIIllIIII[7] = (0xD0 ^ 0x8C ^ (0xCF ^ 0x95));
        ModelBakery.lIlIlIIIllIIII[8] = (0x33 ^ 0x34);
        ModelBakery.lIlIlIIIllIIII[9] = (0x99 ^ 0x91);
        ModelBakery.lIlIlIIIllIIII[10] = (0xCD ^ 0xC4);
        ModelBakery.lIlIlIIIllIIII[11] = (108 + 117 - 188 + 137 ^ 78 + 45 - 53 + 94);
        ModelBakery.lIlIlIIIllIIII[12] = (0xBE ^ 0xB5);
        ModelBakery.lIlIlIIIllIIII[13] = (0x19 ^ 0x15);
        ModelBakery.lIlIlIIIllIIII[14] = (0xB3 ^ 0xBE);
        ModelBakery.lIlIlIIIllIIII[15] = (0xC1 ^ 0xB8 ^ (0x14 ^ 0x63));
        ModelBakery.lIlIlIIIllIIII[16] = (0x7A ^ 0x75);
        ModelBakery.lIlIlIIIllIIII[17] = (0xBE ^ 0xAA ^ (0x8D ^ 0x89));
        ModelBakery.lIlIlIIIllIIII[18] = (0x21 ^ 0x30);
        ModelBakery.lIlIlIIIllIIII[19] = (0x62 ^ 0x7C ^ (0xC8 ^ 0xC5));
        ModelBakery.lIlIlIIIllIIII[20] = (" ".length() ^ (0xD7 ^ 0xC2));
        ModelBakery.lIlIlIIIllIIII[21] = (0xB ^ 0x1E);
        ModelBakery.lIlIlIIIllIIII[22] = (0xC2 ^ 0xA2 ^ (0x1A ^ 0x6C));
        ModelBakery.lIlIlIIIllIIII[23] = (0x54 ^ 0x43);
        ModelBakery.lIlIlIIIllIIII[24] = (0x59 ^ 0x41);
        ModelBakery.lIlIlIIIllIIII[25] = (0x6E ^ 0x77);
        ModelBakery.lIlIlIIIllIIII[26] = (0x30 ^ 0x3F ^ (0x45 ^ 0x50));
        ModelBakery.lIlIlIIIllIIII[27] = (0xBD ^ 0xA6);
        ModelBakery.lIlIlIIIllIIII[28] = (0x37 ^ 0x5F ^ (0xE8 ^ 0x9C));
        ModelBakery.lIlIlIIIllIIII[29] = (0x18 ^ 0x5);
        ModelBakery.lIlIlIIIllIIII[30] = (0x13 ^ 0x30 ^ (0xAA ^ 0x97));
        ModelBakery.lIlIlIIIllIIII[31] = (63 + 121 - 141 + 92 ^ 128 + 131 - 149 + 42);
        ModelBakery.lIlIlIIIllIIII[32] = (0x8F ^ 0xAF);
        ModelBakery.lIlIlIIIllIIII[33] = (0x81 ^ 0xA0);
        ModelBakery.lIlIlIIIllIIII[34] = (0x46 ^ 0x64);
        ModelBakery.lIlIlIIIllIIII[35] = (123 + 106 - 204 + 159 ^ 23 + 37 + 28 + 67);
        ModelBakery.lIlIlIIIllIIII[36] = (0x7C ^ 0x58);
        ModelBakery.lIlIlIIIllIIII[37] = (0x3B ^ 0x50 ^ (0xD5 ^ 0x9B));
        ModelBakery.lIlIlIIIllIIII[38] = (0x1F ^ 0x48 ^ (0xE3 ^ 0x92));
        ModelBakery.lIlIlIIIllIIII[39] = (56 + 3 - 54 + 124 ^ 3 + 119 - 49 + 93);
        ModelBakery.lIlIlIIIllIIII[40] = (0x53 ^ 0x7B);
        ModelBakery.lIlIlIIIllIIII[41] = (0x6C ^ 0x51 ^ (0x62 ^ 0x76));
        ModelBakery.lIlIlIIIllIIII[42] = (115 + 142 - 235 + 133 ^ 116 + 18 - 40 + 83);
        ModelBakery.lIlIlIIIllIIII[43] = (0x58 ^ 0x73);
        ModelBakery.lIlIlIIIllIIII[44] = (0x4F ^ 0x71 ^ (0xB8 ^ 0xAA));
        ModelBakery.lIlIlIIIllIIII[45] = (0x51 ^ 0x1A ^ (0xFE ^ 0x98));
        ModelBakery.lIlIlIIIllIIII[46] = (0x82 ^ 0xAC);
        ModelBakery.lIlIlIIIllIIII[47] = (0x18 ^ 0x3 ^ (0x74 ^ 0x40));
        ModelBakery.lIlIlIIIllIIII[48] = (0x9D ^ 0xAD);
        ModelBakery.lIlIlIIIllIIII[49] = (0xD5 ^ 0x89 ^ (0xE6 ^ 0x8B));
        ModelBakery.lIlIlIIIllIIII[50] = (0x49 ^ 0x5F ^ (0x51 ^ 0x75));
        ModelBakery.lIlIlIIIllIIII[51] = (39 + 91 - 104 + 141 ^ 138 + 84 - 74 + 0);
        ModelBakery.lIlIlIIIllIIII[52] = (0x1A ^ 0x3 ^ (0x9B ^ 0xB6));
        ModelBakery.lIlIlIIIllIIII[53] = (0xED ^ 0x91 ^ (0x3F ^ 0x76));
        ModelBakery.lIlIlIIIllIIII[54] = (53 + 88 - 81 + 85 ^ 157 + 136 - 134 + 8);
        ModelBakery.lIlIlIIIllIIII[55] = (41 + 41 - 3 + 65 ^ 45 + 8 - 11 + 125);
        ModelBakery.lIlIlIIIllIIII[56] = (0x1A ^ 0x4D ^ (0x17 ^ 0x78));
        ModelBakery.lIlIlIIIllIIII[57] = (0x65 ^ 0x5C);
        ModelBakery.lIlIlIIIllIIII[58] = (162 + 145 - 295 + 154 ^ 112 + 45 - 91 + 90);
        ModelBakery.lIlIlIIIllIIII[59] = (0x3 ^ 0x38);
        ModelBakery.lIlIlIIIllIIII[60] = (0x10 ^ 0x3C ^ (0x4A ^ 0x5A));
        ModelBakery.lIlIlIIIllIIII[61] = (0x5C ^ 0x61);
        ModelBakery.lIlIlIIIllIIII[62] = (0x84 ^ 0x98 ^ (0x4 ^ 0x26));
        ModelBakery.lIlIlIIIllIIII[63] = (0x9C ^ 0xA3);
        ModelBakery.lIlIlIIIllIIII[64] = (0xC2 ^ 0x82);
        ModelBakery.lIlIlIIIllIIII[65] = (0x84 ^ 0xA3 ^ (0xFB ^ 0x9D));
        ModelBakery.lIlIlIIIllIIII[66] = (0x2B ^ 0x69);
        ModelBakery.lIlIlIIIllIIII[67] = (0xCA ^ 0xA7 ^ (0x4D ^ 0x63));
        ModelBakery.lIlIlIIIllIIII[68] = (69 + 218 - 75 + 8 ^ 135 + 6 - 87 + 98);
        ModelBakery.lIlIlIIIllIIII[69] = (32 + 166 - 158 + 155 ^ 113 + 10 - 52 + 63);
        ModelBakery.lIlIlIIIllIIII[70] = (0xB1 ^ 0x81 ^ (0x1A ^ 0x6C));
        ModelBakery.lIlIlIIIllIIII[71] = (110 + 49 - 118 + 180 ^ 136 + 144 - 249 + 123);
        ModelBakery.lIlIlIIIllIIII[72] = (0x25 ^ 0x6D);
        ModelBakery.lIlIlIIIllIIII[73] = (31 + 89 - 118 + 199 ^ 44 + 117 - 136 + 103);
        ModelBakery.lIlIlIIIllIIII[74] = (0xD5 ^ 0x9F);
        ModelBakery.lIlIlIIIllIIII[75] = (0x15 ^ 0x5A ^ (0x34 ^ 0x30));
        ModelBakery.lIlIlIIIllIIII[76] = (0x28 ^ 0x64);
        ModelBakery.lIlIlIIIllIIII[77] = (0x16 ^ 0x49 ^ (0x1 ^ 0x13));
        ModelBakery.lIlIlIIIllIIII[78] = (0x26 ^ 0x68);
        ModelBakery.lIlIlIIIllIIII[79] = (0x52 ^ 0x1D);
        ModelBakery.lIlIlIIIllIIII[80] = (0xDD ^ 0x8D);
        ModelBakery.lIlIlIIIllIIII[81] = (209 + 6 - 20 + 33 ^ 127 + 8 - 43 + 89);
        ModelBakery.lIlIlIIIllIIII[82] = (0x25 ^ 0x77);
        ModelBakery.lIlIlIIIllIIII[83] = (0xF8 ^ 0xAB);
        ModelBakery.lIlIlIIIllIIII[84] = (0xF ^ 0x5B);
        ModelBakery.lIlIlIIIllIIII[85] = (0x33 ^ 0x72 ^ (0x32 ^ 0x26));
        ModelBakery.lIlIlIIIllIIII[86] = (0xE7 ^ 0xB1);
        ModelBakery.lIlIlIIIllIIII[87] = (0x5C ^ 0xB);
        ModelBakery.lIlIlIIIllIIII[88] = (0x3F ^ 0x5 ^ (0xE2 ^ 0x80));
        ModelBakery.lIlIlIIIllIIII[89] = (0xC2 ^ 0x9B);
        ModelBakery.lIlIlIIIllIIII[90] = (0xE2 ^ 0xB8);
        ModelBakery.lIlIlIIIllIIII[91] = (0x12 ^ 0x49);
        ModelBakery.lIlIlIIIllIIII[92] = (0x6C ^ 0x30);
        ModelBakery.lIlIlIIIllIIII[93] = (0xE ^ 0x53);
        ModelBakery.lIlIlIIIllIIII[94] = (0x66 ^ 0x21 ^ (0x86 ^ 0x9F));
        ModelBakery.lIlIlIIIllIIII[95] = (0x46 ^ 0x19);
        ModelBakery.lIlIlIIIllIIII[96] = (0x75 ^ 0x15);
        ModelBakery.lIlIlIIIllIIII[97] = (0x64 ^ 0x5);
        ModelBakery.lIlIlIIIllIIII[98] = (0xE6 ^ 0x84);
        ModelBakery.lIlIlIIIllIIII[99] = (176 + 7 + 29 + 8 ^ 143 + 152 - 283 + 179);
        ModelBakery.lIlIlIIIllIIII[100] = (114 + 140 - 144 + 113 ^ 158 + 130 - 279 + 178);
        ModelBakery.lIlIlIIIllIIII[101] = (0x65 ^ 0x1D ^ (0x21 ^ 0x3C));
        ModelBakery.lIlIlIIIllIIII[102] = (158 + 82 - 151 + 154 ^ 65 + 105 - 152 + 131);
        ModelBakery.lIlIlIIIllIIII[103] = (0xCA ^ 0xAD);
        ModelBakery.lIlIlIIIllIIII[104] = (0xFC ^ 0x94);
        ModelBakery.lIlIlIIIllIIII[105] = (0x64 ^ 0xD);
        ModelBakery.lIlIlIIIllIIII[106] = (0x42 ^ 0x28);
        ModelBakery.lIlIlIIIllIIII[107] = (0x53 ^ 0x38);
        ModelBakery.lIlIlIIIllIIII[108] = (0xD1 ^ 0xBF ^ "  ".length());
        ModelBakery.lIlIlIIIllIIII[109] = (0xA9 ^ 0x96 ^ (0x25 ^ 0x77));
        ModelBakery.lIlIlIIIllIIII[110] = (0x61 ^ 0x16 ^ (0x77 ^ 0x6E));
        ModelBakery.lIlIlIIIllIIII[111] = (0x0 ^ 0x6F);
        ModelBakery.lIlIlIIIllIIII[112] = (0x21 ^ 0x5 ^ (0xF3 ^ 0xA7));
        ModelBakery.lIlIlIIIllIIII[113] = (0x6A ^ 0x1B);
        ModelBakery.lIlIlIIIllIIII[114] = (0xEC ^ 0x9E);
        ModelBakery.lIlIlIIIllIIII[115] = (0x1C ^ 0x6F);
        ModelBakery.lIlIlIIIllIIII[116] = (0xC8 ^ 0xA0 ^ (0x5C ^ 0x40));
        ModelBakery.lIlIlIIIllIIII[117] = (0x39 ^ 0x4C);
        ModelBakery.lIlIlIIIllIIII[118] = (0x22 ^ 0x6E ^ (0x71 ^ 0x4B));
        ModelBakery.lIlIlIIIllIIII[119] = (0xF9 ^ 0x8E);
        ModelBakery.lIlIlIIIllIIII[120] = (0x1D ^ 0x65);
        ModelBakery.lIlIlIIIllIIII[121] = (0xE8 ^ 0x91);
        ModelBakery.lIlIlIIIllIIII[122] = (0x28 ^ 0x52);
        ModelBakery.lIlIlIIIllIIII[123] = (123 + 192 - 253 + 163 ^ 91 + 128 - 177 + 112);
        ModelBakery.lIlIlIIIllIIII[124] = (0x30 ^ 0x37 ^ (0x35 ^ 0x4E));
        ModelBakery.lIlIlIIIllIIII[125] = (0x53 ^ 0xC ^ (0x27 ^ 0x5));
        ModelBakery.lIlIlIIIllIIII[126] = (81 + 81 - 140 + 169 ^ 146 + 177 - 287 + 157);
        ModelBakery.lIlIlIIIllIIII[127] = 123 + 45 - 116 + 75;
        ModelBakery.lIlIlIIIllIIII[128] = (0x49 ^ 0x5A) + (0x6A ^ 0x1A) - (0x35 ^ 0x28) + (0xB7 ^ 0xAD);
        ModelBakery.lIlIlIIIllIIII[129] = 69 + 11 - 70 + 119;
        ModelBakery.lIlIlIIIllIIII[130] = (0x65 ^ 0x11) + (0x4D ^ 0x44) - (0xA3 ^ 0x93) + (0x7A ^ 0x4F);
        ModelBakery.lIlIlIIIllIIII[131] = (0xC0 ^ 0x8F) + (0x15 ^ 0x18) - -(0x7E ^ 0x5E) + (0x6C ^ 0x6B);
        ModelBakery.lIlIlIIIllIIII[132] = 65 + 27 - 80 + 120;
        ModelBakery.lIlIlIIIllIIII[133] = (0xD0 ^ 0xAA) + (0x2E ^ 0x3) - (0x4A ^ 0x2D) + (0x3E ^ 0x7B);
        ModelBakery.lIlIlIIIllIIII[134] = 43 + 1 + 84 + 6;
        ModelBakery.lIlIlIIIllIIII[135] = 112 + 86 - 184 + 121;
        ModelBakery.lIlIlIIIllIIII[136] = (0x3E ^ 0x71) + ((0x9E ^ 0xB2) & ~(0x6A ^ 0x46)) - (0x1E ^ 0x10) + (0x39 ^ 0x7E);
        ModelBakery.lIlIlIIIllIIII[137] = 129 + 46 - 51 + 7 + (0xE8 ^ 0xAF) - (67 + 113 - 102 + 79) + (0x15 ^ 0x49);
        ModelBakery.lIlIlIIIllIIII[138] = 137 + 2 - 7 + 6;
        ModelBakery.lIlIlIIIllIIII[139] = (0x42 ^ 0x18) + (0x61 ^ 0x23) - (0xE4 ^ 0x8A) + (0xC5 ^ 0x98);
        ModelBakery.lIlIlIIIllIIII[140] = (0x7C ^ 0x37) + "   ".length() - (0x28 ^ 0x23) + (0x9 ^ 0x40);
        ModelBakery.lIlIlIIIllIIII[141] = 117 + 58 - 110 + 76;
        ModelBakery.lIlIlIIIllIIII[142] = (0x3F ^ 0x51) + (0x19 ^ 0xB) - (0xCC ^ 0x93) + (0xF9 ^ 0x94);
        ModelBakery.lIlIlIIIllIIII[143] = 23 + 98 - 41 + 63;
        ModelBakery.lIlIlIIIllIIII[144] = 6 + 26 + 8 + 104;
        ModelBakery.lIlIlIIIllIIII[145] = 25 + 5 + 53 + 62;
        ModelBakery.lIlIlIIIllIIII[146] = (0xEC ^ 0xC1) + (0x84 ^ 0x80) - -"  ".length() + (0xDE ^ 0x81);
        ModelBakery.lIlIlIIIllIIII[147] = (0x5A ^ 0x70) + (52 + 78 - 10 + 15) - (58 + 78 + 13 + 12) + (78 + 3 - 37 + 87);
        ModelBakery.lIlIlIIIllIIII[148] = (0xC ^ 0x75) + (0xA7 ^ 0x8F) - (0xAD ^ 0xBC) + (0x58 ^ 0x5C);
        ModelBakery.lIlIlIIIllIIII[149] = (0x2 ^ 0x38) + (0xC6 ^ 0x8D) - ((0x6B ^ 0x34) & ~(0x56 ^ 0x9)) + (0xBC ^ 0xAC);
        ModelBakery.lIlIlIIIllIIII[150] = 65 + 14 + 26 + 33 + (0x9C ^ 0x8F) - (100 + 53 - 51 + 28) + (0xF1 ^ 0x8A);
        ModelBakery.lIlIlIIIllIIII[151] = (0x1E ^ 0x13) + (0x3D ^ 0x38) - -(0xB9 ^ 0x85) + (0xC1 ^ 0x88);
        ModelBakery.lIlIlIIIllIIII[152] = (0x71 ^ 0x40) + (0xA6 ^ 0x91) - -(0xBA ^ 0x8A) + ((0x6A ^ 0x78) & ~(0xAA ^ 0xB8));
        ModelBakery.lIlIlIIIllIIII[153] = 96 + 140 - 106 + 23;
        ModelBakery.lIlIlIIIllIIII[154] = 7 + 121 - 16 + 25 + (111 + 132 - 241 + 143) - (32 + 154 - 66 + 81) + (0x8C ^ 0xC5);
        ModelBakery.lIlIlIIIllIIII[155] = (0x89 ^ 0xBF) + (0xF9 ^ 0x8B) - (0x41 ^ 0x22) + (0x13 ^ 0x45);
        ModelBakery.lIlIlIIIllIIII[156] = (0x32 ^ 0x71) + "   ".length() - -(0x9E ^ 0xAC) + (0x16 ^ 0x32);
        ModelBakery.lIlIlIIIllIIII[157] = 90 + 128 - 121 + 60;
        ModelBakery.lIlIlIIIllIIII[158] = 69 + 6 + 73 + 10;
        ModelBakery.lIlIlIIIllIIII[159] = 38 + 82 + 3 + 36;
        ModelBakery.lIlIlIIIllIIII[160] = 68 + 60 - 112 + 144;
        ModelBakery.lIlIlIIIllIIII[161] = (0x65 ^ 0x4F) + (0xEA ^ 0x9F) - (34 + 126 - 143 + 120) + (94 + 85 - 118 + 78);
        ModelBakery.lIlIlIIIllIIII[162] = 24 + 142 - 22 + 18;
        ModelBakery.lIlIlIIIllIIII[163] = 23 + 162 - 138 + 116;
        ModelBakery.lIlIlIIIllIIII[164] = 155 + 90 - 161 + 80;
        ModelBakery.lIlIlIIIllIIII[165] = 127 + 116 - 228 + 133 + (0x47 ^ 0x22) - (92 + 155 - 138 + 49) + (0x4F ^ 0x5);
        ModelBakery.lIlIlIIIllIIII[166] = 120 + 17 + 3 + 26;
        ModelBakery.lIlIlIIIllIIII[167] = 61 + 139 - 150 + 117;
        ModelBakery.lIlIlIIIllIIII[168] = 134 + 134 - 151 + 51;
        ModelBakery.lIlIlIIIllIIII[169] = 6 + 111 - 33 + 85;
        ModelBakery.lIlIlIIIllIIII[170] = 81 + 56 - 87 + 120;
        ModelBakery.lIlIlIIIllIIII[171] = (0x37 ^ 0x51) + (67 + 40 + 3 + 32) - (0x7F ^ 0xC) + (0x94 ^ 0xBE);
        ModelBakery.lIlIlIIIllIIII[172] = 86 + 83 - 76 + 79;
        ModelBakery.lIlIlIIIllIIII[173] = (0xA ^ 0x54) + (27 + 137 - 54 + 54) - (85 + 43 - 46 + 116) + (0x48 ^ 0x39);
        ModelBakery.lIlIlIIIllIIII[174] = 130 + 23 - 76 + 97;
        ModelBakery.lIlIlIIIllIIII[175] = "  ".length() + (131 + 61 - 93 + 39) - (0xC7 ^ 0x80) + (0x12 ^ 0x78);
        ModelBakery.lIlIlIIIllIIII[176] = 56 + 55 - 107 + 159 + (136 + 133 - 236 + 116) - (10 + 215 - 44 + 53) + (0xDE ^ 0xBC);
        ModelBakery.lIlIlIIIllIIII[177] = (0x5 ^ 0x41) + (0x11 ^ 0x7C) - (0x5F ^ 0x6E) + (0xAC ^ 0x9D);
        ModelBakery.lIlIlIIIllIIII[178] = (0x5B ^ 0x53) + (0xE ^ 0x6A) - -(0x13 ^ 0x2) + (0x64 ^ 0x51);
        ModelBakery.lIlIlIIIllIIII[179] = 77 + 134 - 194 + 162;
        ModelBakery.lIlIlIIIllIIII[180] = 7 + 118 - 37 + 92;
        ModelBakery.lIlIlIIIllIIII[181] = 139 + 28 - 108 + 122;
        ModelBakery.lIlIlIIIllIIII[182] = 17 + 34 + 62 + 69;
        ModelBakery.lIlIlIIIllIIII[183] = 167 + 143 - 221 + 94;
        ModelBakery.lIlIlIIIllIIII[184] = 124 + 107 - 226 + 179;
        ModelBakery.lIlIlIIIllIIII[185] = (0x1B ^ 0x39) + (41 + 30 + 59 + 33) - (168 + 100 - 191 + 92) + (70 + 106 - 139 + 120);
        ModelBakery.lIlIlIIIllIIII[186] = 35 + 64 - 79 + 166;
        ModelBakery.lIlIlIIIllIIII[187] = (0x4A ^ 0x24) + (0x38 ^ 0x46) - (34 + 46 + 28 + 23) + (0xD1 ^ 0x83);
        ModelBakery.lIlIlIIIllIIII[188] = (0x6 ^ 0x5D) + (101 + 64 - 78 + 92) - (76 + 56 - 10 + 12) + (0x21 ^ 0x15);
        ModelBakery.lIlIlIIIllIIII[189] = (0x75 ^ 0xB) + (0x3F ^ 0x52) - (0xB6 ^ 0x8F) + (0x59 ^ 0x52);
        ModelBakery.lIlIlIIIllIIII[190] = 35 + 117 - 92 + 130;
        ModelBakery.lIlIlIIIllIIII[191] = 96 + 59 + 29 + 7;
        ModelBakery.lIlIlIIIllIIII[192] = 58 + 104 - 49 + 79;
        ModelBakery.lIlIlIIIllIIII[193] = 18 + 89 - 9 + 95;
        ModelBakery.lIlIlIIIllIIII[194] = 71 + 53 + 59 + 11;
        ModelBakery.lIlIlIIIllIIII[195] = 108 + 150 - 176 + 113;
        ModelBakery.lIlIlIIIllIIII[196] = 0 + 6 + 161 + 29;
        ModelBakery.lIlIlIIIllIIII[197] = 100 + 42 + 8 + 47;
        ModelBakery.lIlIlIIIllIIII[198] = 26 + 118 + 38 + 1 + (188 + 27 - 69 + 43) - (0xFFFFB7A9 & 0x497E) + (0x53 ^ 0x29);
        ModelBakery.lIlIlIIIllIIII[199] = " ".length() + (192 + 153 - 250 + 100) - (55 + 15 - 64 + 133) + (94 + 18 + 20 + 10);
        ModelBakery.lIlIlIIIllIIII[200] = 158 + 179 - 268 + 131;
        ModelBakery.lIlIlIIIllIIII[201] = (0xC3 ^ 0xBE) + (0x32 ^ 0x62) - (19 + 135 - 19 + 2) + (52 + 64 - 79 + 96);
        ModelBakery.lIlIlIIIllIIII[202] = 27 + 14 - 23 + 121 + (72 + 100 - 8 + 30) - (109 + 67 - 157 + 169) + (0x9A ^ 0xA3);
        ModelBakery.lIlIlIIIllIIII[203] = (0x6 ^ 0x55) + (0x86 ^ 0xA7) - (0x42 ^ 0x78) + (123 + 16 - 121 + 127);
        ModelBakery.lIlIlIIIllIIII[204] = 158 + 24 - 53 + 75;
        ModelBakery.lIlIlIIIllIIII[205] = 52 + 109 - 86 + 130;
        ModelBakery.lIlIlIIIllIIII[206] = 14 + 146 - 155 + 144 + (0x59 ^ 0x3B) - (16 + 27 + 110 + 11) + (0xE7 ^ 0x9C);
        ModelBakery.lIlIlIIIllIIII[207] = 75 + 164 - 198 + 166;
        ModelBakery.lIlIlIIIllIIII[208] = 54 + 139 - 55 + 48 + (0x37 ^ 0x58) - (0xFFFFFD36 & 0x3DD) + (172 + 164 - 193 + 44);
        ModelBakery.lIlIlIIIllIIII[209] = 16 + 125 + 64 + 4;
        ModelBakery.lIlIlIIIllIIII[210] = 197 + 81 - 77 + 9;
        ModelBakery.lIlIlIIIllIIII[211] = (0xA7 ^ 0x8E) + (0x69 ^ 0x15) - (0x54 ^ 0x33) + (105 + 141 - 140 + 43);
        ModelBakery.lIlIlIIIllIIII[212] = (0x5E ^ 0x14) + (0x6D ^ 0xC) - (41 + 36 - 68 + 153) + (199 + 169 - 226 + 61);
        ModelBakery.lIlIlIIIllIIII[213] = 111 + 67 - 120 + 90 + (114 + 31 - 14 + 71) - (118 + 100 - 116 + 117) + (0x38 ^ 0x6A);
        ModelBakery.lIlIlIIIllIIII[214] = 89 + 146 - 163 + 129 + (41 + 67 - 46 + 70) - (50 + 19 - 7 + 113) + (0x7 ^ 0x3F);
        ModelBakery.lIlIlIIIllIIII[215] = (0xB5 ^ 0xBD) + (0x9D ^ 0xAD) - -(0x81 ^ 0xC0) + (0x69 ^ 0x37);
        ModelBakery.lIlIlIIIllIIII[216] = (0x7B ^ 0x44) + (187 + 56 - 215 + 178) - (158 + 117 - 70 + 42) + (49 + 21 + 113 + 11);
        ModelBakery.lIlIlIIIllIIII[217] = 119 + 15 + 5 + 78;
        ModelBakery.lIlIlIIIllIIII[218] = 63 + 120 - 94 + 129;
        ModelBakery.lIlIlIIIllIIII[219] = 40 + 11 + 117 + 51;
        ModelBakery.lIlIlIIIllIIII[220] = 118 + 121 - 170 + 151;
        ModelBakery.lIlIlIIIllIIII[221] = 114 + 155 - 188 + 140;
        ModelBakery.lIlIlIIIllIIII[222] = 33 + 38 + 122 + 29;
        ModelBakery.lIlIlIIIllIIII[223] = 167 + 168 - 176 + 64;
        ModelBakery.lIlIlIIIllIIII[224] = (0xF9 ^ 0xAA) + (0x49 ^ 0x41) - (0xB5 ^ 0xA9) + (118 + 140 - 107 + 10);
        ModelBakery.lIlIlIIIllIIII[225] = (0xBA ^ 0xC6) + (0xA0 ^ 0xB4) - (0x6C ^ 0x17) + (4 + 87 - 77 + 190);
        ModelBakery.lIlIlIIIllIIII[226] = 6 + 15 + 114 + 91;
        ModelBakery.lIlIlIIIllIIII[227] = (0x71 ^ 0x9) + (91 + 78 - 27 + 0) - (123 + 115 - 171 + 83) + (0x71 ^ 0x2);
        ModelBakery.lIlIlIIIllIIII[228] = 136 + 19 + 36 + 37;
        ModelBakery.lIlIlIIIllIIII[229] = 157 + 47 + 25 + 0;
        ModelBakery.lIlIlIIIllIIII[230] = 123 + 220 - 303 + 190;
        ModelBakery.lIlIlIIIllIIII[231] = 40 + 119 - 76 + 53 + (113 + 64 - 46 + 59) - (179 + 107 - 212 + 133) + (0x77 ^ 0x7);
        ModelBakery.lIlIlIIIllIIII[232] = 72 + 82 - 101 + 179;
        ModelBakery.lIlIlIIIllIIII[233] = 161 + 205 - 142 + 9;
        ModelBakery.lIlIlIIIllIIII[234] = 4 + 109 + 34 + 87;
        ModelBakery.lIlIlIIIllIIII[235] = 122 + 102 - 98 + 44 + (0xC4 ^ 0xB2) - (0x78 ^ 0x2C) + (0x23 ^ 0x3C);
        ModelBakery.lIlIlIIIllIIII[236] = 43 + 13 + 6 + 174;
        ModelBakery.lIlIlIIIllIIII[237] = (0x47 ^ 0x5F) + (109 + 98 - 186 + 136) - (0x50 ^ 0x59) + (0x1B ^ 0x5A);
        ModelBakery.lIlIlIIIllIIII[238] = (0x37 ^ 0x67) + (0x11 ^ 0x54) - -(0xF6 ^ 0xA4) + (0xB9 ^ 0xBE);
        ModelBakery.lIlIlIIIllIIII[239] = 89 + 36 + 22 + 60 + (0x7C ^ 0x5) - (141 + 93 - 196 + 125) + (0x32 ^ 0x78);
        ModelBakery.lIlIlIIIllIIII[240] = 181 + 213 - 303 + 149;
        ModelBakery.lIlIlIIIllIIII[241] = 221 + 97 - 251 + 174;
        ModelBakery.lIlIlIIIllIIII[242] = 4 + 136 - 4 + 65 + (139 + 194 - 283 + 159) - (0xFFFFAFC9 & 0x517E) + (72 + 52 + 33 + 3);
        ModelBakery.lIlIlIIIllIIII[243] = 81 + 55 - 43 + 118 + (171 + 14 - 113 + 155) - (0xFFFF95F3 & 0x6B3D) + (0x2D ^ 0x43);
        ModelBakery.lIlIlIIIllIIII[244] = 32 + 110 - 13 + 107 + (0x21 ^ 0x78) - (69 + 123 - 72 + 52) + (0x55 ^ 0xE);
        ModelBakery.lIlIlIIIllIIII[245] = (0xD1 ^ 0xAC) + (6 + 92 - 22 + 117) - (0xFFFF89DD & 0x7726) + (120 + 40 - 93 + 120);
        ModelBakery.lIlIlIIIllIIII[246] = 213 + 151 - 264 + 116 + (0x64 ^ 0x75) - (43 + 67 + 58 + 16) + (25 + 106 - 66 + 132);
        ModelBakery.lIlIlIIIllIIII[247] = 80 + 13 + 21 + 133;
        ModelBakery.lIlIlIIIllIIII[248] = 37 + 134 - 168 + 148 + (56 + 48 + 37 + 28) - (125 + 175 - 117 + 9) + (0xF2 ^ 0x8A);
        ModelBakery.lIlIlIIIllIIII[249] = 13 + 11 + 151 + 74;
        ModelBakery.lIlIlIIIllIIII[250] = (0x70 ^ 0x3) + (0xAB ^ 0x9A) - -(0x74 ^ 0x61) + (0xD9 ^ 0x98);
        ModelBakery.lIlIlIIIllIIII[251] = 4 + 36 + 76 + 135;
        ModelBakery.lIlIlIIIllIIII[252] = 224 + 249 - 416 + 195;
        ModelBakery.lIlIlIIIllIIII[253] = (0x68 ^ 0x46) + (35 + 101 - 45 + 36) - (0xF4 ^ 0xB5) + (67 + 99 - 99 + 78);
        ModelBakery.lIlIlIIIllIIII[254] = 189 + 123 - 229 + 170 + (40 + 162 - 98 + 100) - (0xFFFF81BB & 0x7F77) + (0x73 ^ 0x1B);
        ModelBakery.lIlIlIIIllIIII[255] = 240 + 215 - 204 + 4;
        ModelBakery.lIlIlIIIllIIII[256] = (0xFFFFC5A1 & 0x3B5E);
        ModelBakery.lIlIlIIIllIIII[257] = (0xFFFFD751 & 0x29AF);
        ModelBakery.lIlIlIIIllIIII[258] = (-(0xFFFFFCBB & 0x27ED) & (0xFFFFBDEA & 0x67BF));
        ModelBakery.lIlIlIIIllIIII[259] = (0xFFFFFF33 & 0x1CF);
        ModelBakery.lIlIlIIIllIIII[260] = (0xFFFFDDDC & 0x2327);
        ModelBakery.lIlIlIIIllIIII[261] = (-(0xFFFFDBEB & 0x76BF) & (0xFFFFF3FF & 0x5FAF));
        ModelBakery.lIlIlIIIllIIII[262] = (0xFFFFD13E & 0x2FC7);
        ModelBakery.lIlIlIIIllIIII[263] = (-(0xFFFFEC39 & 0x73FF) & (0xFFFFF9BF & 0x677F));
        ModelBakery.lIlIlIIIllIIII[264] = (-(0xFFFFFFD3 & 0x66FF) & (0xFFFFE7DF & 0x7FFA));
        ModelBakery.lIlIlIIIllIIII[265] = (-(0xFFFFFEDB & 0x7D35) & (0xFFFFFDBD & 0x7F5B));
        ModelBakery.lIlIlIIIllIIII[266] = (-(0xFFFFFFF6 & 0x369F) & (0xFFFFF7DF & 0x3FBF));
        ModelBakery.lIlIlIIIllIIII[267] = (-(0xFFFFAF5D & 0x54E7) & (0xFFFFADFF & 0x574F));
        ModelBakery.lIlIlIIIllIIII[268] = (0xFFFF8BBD & 0x754E);
        ModelBakery.lIlIlIIIllIIII[269] = (-(0xFFFFFFFB & 0x5EF7) & (-1 & 0x5FFF));
        ModelBakery.lIlIlIIIllIIII[270] = (0xFFFFB90E & 0x47FF);
        ModelBakery.lIlIlIIIllIIII[271] = (-(0xFFFFF8BD & 0x7FF3) & (0xFFFFFDFF & 0x7BBF));
        ModelBakery.lIlIlIIIllIIII[272] = (-(0xFFFFFFBE & 0x1E65) & (0xFFFFBF37 & 0x5FFB));
        ModelBakery.lIlIlIIIllIIII[273] = (-(0xFFFFDEFD & 0x79C3) & (0xFFFFFFF3 & 0x59DD));
        ModelBakery.lIlIlIIIllIIII[274] = (-(0xFFFFF5E6 & 0x7EDF) & (0xFFFFF5DF & 0x7FF7));
        ModelBakery.lIlIlIIIllIIII[275] = (0xFFFF99F7 & 0x671B);
        ModelBakery.lIlIlIIIllIIII[276] = (-(0xFFFFDD2C & 0x7EFF) & (0xFFFFFDBF & 0x5F7F));
        ModelBakery.lIlIlIIIllIIII[277] = (-(0xFFFFFFDF & 0x7AE3) & (-1 & 0x7BD7));
        ModelBakery.lIlIlIIIllIIII[278] = (0xFFFFE3F7 & 0x1D1E);
        ModelBakery.lIlIlIIIllIIII[279] = (0xFFFF835F & 0x7DB7);
        ModelBakery.lIlIlIIIllIIII[280] = (-(0xFFFFFFDE & 0x2CE7) & (0xFFFFFFDD & 0x2DFF));
        ModelBakery.lIlIlIIIllIIII[281] = (-(0xFFFF9EF5 & 0x6B6B) & (0xFFFFEFFD & 0x1B7B));
        ModelBakery.lIlIlIIIllIIII[282] = (0xFFFFEF5B & 0x11BE);
        ModelBakery.lIlIlIIIllIIII[283] = (0xFFFFFBFB & 0x51F);
        ModelBakery.lIlIlIIIllIIII[284] = (0xFFFFD51E & 0x2BFD);
        ModelBakery.lIlIlIIIllIIII[285] = (0xFFFFE5FD & 0x1B1F);
        ModelBakery.lIlIlIIIllIIII[286] = (0xFFFFF17E & 0xF9F);
        ModelBakery.lIlIlIIIllIIII[287] = (0xFFFFC51F & 0x3BFF);
        ModelBakery.lIlIlIIIllIIII[288] = (-(0xFFFFCFC9 & 0x363F) & (0xFFFFCF6D & 0x37BA));
        ModelBakery.lIlIlIIIllIIII[289] = (-(0xFFFFFE59 & 0x7FFF) & (0xFFFFFFFB & 0x7F7D));
    }
    
    private void loadSprites() {
        final Set<ResourceLocation> lllllllllllllIIIlIlIIllIIllllIII = this.getVariantsTextureLocations();
        lllllllllllllIIIlIlIIllIIllllIII.addAll(this.getItemsTextureLocations());
        "".length();
        lllllllllllllIIIlIlIIllIIllllIII.remove(TextureMap.LOCATION_MISSING_TEXTURE);
        "".length();
        final IIconCreator lllllllllllllIIIlIlIIllIIlllIlll = new IIconCreator() {
            private static boolean llIIIIlIIIIlIIl(final int lllllllllllllIlIIIIlIIlllllllIII) {
                return lllllllllllllIlIIIIlIIlllllllIII == 0;
            }
            
            @Override
            public void registerSprites(final TextureMap lllllllllllllIlIIIIlIIllllllllll) {
                final String lllllllllllllIlIIIIlIIllllllllIl = (String)lllllllllllllIIIlIlIIllIIllllIII.iterator();
                "".length();
                if (" ".length() >= "  ".length()) {
                    return;
                }
                while (!llIIIIlIIIIlIIl(((Iterator)lllllllllllllIlIIIIlIIllllllllIl).hasNext() ? 1 : 0)) {
                    final ResourceLocation lllllllllllllIlIIIIlIlIIIIIIIlII = ((Iterator<ResourceLocation>)lllllllllllllIlIIIIlIIllllllllIl).next();
                    final TextureAtlasSprite lllllllllllllIlIIIIlIlIIIIIIIIll = lllllllllllllIlIIIIlIIllllllllll.registerSprite(lllllllllllllIlIIIIlIlIIIIIIIlII);
                    ModelBakery.this.sprites.put(lllllllllllllIlIIIIlIlIIIIIIIlII, lllllllllllllIlIIIIlIlIIIIIIIIll);
                    "".length();
                }
            }
        };
        this.textureMap.loadSprites(this.resourceManager, lllllllllllllIIIlIlIIllIIlllIlll);
        this.sprites.put(new ResourceLocation(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[287]]), this.textureMap.getMissingSprite());
        "".length();
    }
    
    public IRegistry<ModelResourceLocation, IBakedModel> setupModelRegistry() {
        this.loadVariantItemModels();
        this.loadModelsCheck();
        this.loadSprites();
        this.bakeItemModels();
        this.bakeBlockModels();
        return this.bakedRegistry;
    }
    
    private static boolean lllIlIllllIIIll(final int lllllllllllllIIIlIlIIlIllllIlIII) {
        return lllllllllllllIIIlIlIIlIllllIlIII == 0;
    }
    
    private ResourceLocation getParentLocation(final ResourceLocation lllllllllllllIIIlIlIIllIlIIlIlII) {
        final long lllllllllllllIIIlIlIIllIlIIlIIlI = (long)this.models.entrySet().iterator();
        "".length();
        if (-" ".length() > "   ".length()) {
            return null;
        }
        while (!lllIlIllllIIIll(((Iterator)lllllllllllllIIIlIlIIllIlIIlIIlI).hasNext() ? 1 : 0)) {
            final Map.Entry<ResourceLocation, ModelBlock> lllllllllllllIIIlIlIIllIlIIlIlll = ((Iterator<Map.Entry<ResourceLocation, ModelBlock>>)lllllllllllllIIIlIlIIllIlIIlIIlI).next();
            final ModelBlock lllllllllllllIIIlIlIIllIlIIlIllI = lllllllllllllIIIlIlIIllIlIIlIlll.getValue();
            if (lllIlIllllIIllI(lllllllllllllIIIlIlIIllIlIIlIllI) && lllIlIllllIIlIl(lllllllllllllIIIlIlIIllIlIIlIlII.equals(lllllllllllllIIIlIlIIllIlIIlIllI.getParentLocation()) ? 1 : 0)) {
                return lllllllllllllIIIlIlIIllIlIIlIlll.getKey();
            }
        }
        return null;
    }
    
    static {
        lllIlIllllIIIlI();
        lllIlIIlIllIIII();
        final ResourceLocation[] array = new ResourceLocation[ModelBakery.lIlIlIIIllIIII[0]];
        array[ModelBakery.lIlIlIIIllIIII[1]] = new ResourceLocation(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[1]]);
        array[ModelBakery.lIlIlIIIllIIII[2]] = new ResourceLocation(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[2]]);
        array[ModelBakery.lIlIlIIIllIIII[3]] = new ResourceLocation(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[3]]);
        array[ModelBakery.lIlIlIIIllIIII[4]] = new ResourceLocation(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[4]]);
        array[ModelBakery.lIlIlIIIllIIII[5]] = new ResourceLocation(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[5]]);
        array[ModelBakery.lIlIlIIIllIIII[6]] = new ResourceLocation(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[6]]);
        array[ModelBakery.lIlIlIIIllIIII[7]] = new ResourceLocation(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[7]]);
        array[ModelBakery.lIlIlIIIllIIII[8]] = new ResourceLocation(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[8]]);
        array[ModelBakery.lIlIlIIIllIIII[9]] = new ResourceLocation(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[9]]);
        array[ModelBakery.lIlIlIIIllIIII[10]] = new ResourceLocation(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[10]]);
        array[ModelBakery.lIlIlIIIllIIII[11]] = new ResourceLocation(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[11]]);
        array[ModelBakery.lIlIlIIIllIIII[12]] = new ResourceLocation(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[12]]);
        array[ModelBakery.lIlIlIIIllIIII[13]] = new ResourceLocation(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[13]]);
        array[ModelBakery.lIlIlIIIllIIII[14]] = new ResourceLocation(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[14]]);
        array[ModelBakery.lIlIlIIIllIIII[15]] = new ResourceLocation(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[15]]);
        array[ModelBakery.lIlIlIIIllIIII[16]] = new ResourceLocation(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[16]]);
        array[ModelBakery.lIlIlIIIllIIII[17]] = new ResourceLocation(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[17]]);
        array[ModelBakery.lIlIlIIIllIIII[18]] = new ResourceLocation(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[18]]);
        LOCATIONS_BUILTIN_TEXTURES = Sets.newHashSet((Object[])array);
        LOGGER = LogManager.getLogger();
        MODEL_MISSING = new ModelResourceLocation(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[0]], ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[19]]);
        BUILT_IN_MODELS = Maps.newHashMap();
        JOINER = Joiner.on(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[20]]);
        MODEL_GENERATED = ModelBlock.deserialize(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[21]]);
        MODEL_COMPASS = ModelBlock.deserialize(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[22]]);
        MODEL_CLOCK = ModelBlock.deserialize(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[23]]);
        MODEL_ENTITY = ModelBlock.deserialize(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[24]]);
        ModelBakery.BUILT_IN_MODELS.put(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[25]], "{ \"textures\": {   \"particle\": \"missingno\",   \"missingno\": \"missingno\"}, \"elements\": [ {     \"from\": [ 0, 0, 0 ],     \"to\": [ 16, 16, 16 ],     \"faces\": {         \"down\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"down\", \"texture\": \"#missingno\" },         \"up\":    { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"up\", \"texture\": \"#missingno\" },         \"north\": { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"north\", \"texture\": \"#missingno\" },         \"south\": { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"south\", \"texture\": \"#missingno\" },         \"west\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"west\", \"texture\": \"#missingno\" },         \"east\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"east\", \"texture\": \"#missingno\" }    }}]}");
        "".length();
        ModelBakery.MODEL_GENERATED.name = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[26]];
        ModelBakery.MODEL_COMPASS.name = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[27]];
        ModelBakery.MODEL_CLOCK.name = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[28]];
        ModelBakery.MODEL_ENTITY.name = ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[29]];
    }
    
    private static String lllIIlIllIlIlll(String lllllllllllllIIIlIlIIllIIIlIIIlI, final String lllllllllllllIIIlIlIIllIIIlIIllI) {
        lllllllllllllIIIlIlIIllIIIlIIIlI = new String(Base64.getDecoder().decode(lllllllllllllIIIlIlIIllIIIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIlIIllIIIlIIlIl = new StringBuilder();
        final char[] lllllllllllllIIIlIlIIllIIIlIIlII = lllllllllllllIIIlIlIIllIIIlIIllI.toCharArray();
        int lllllllllllllIIIlIlIIllIIIlIIIll = ModelBakery.lIlIlIIIllIIII[1];
        final short lllllllllllllIIIlIlIIllIIIIlllIl = (Object)lllllllllllllIIIlIlIIllIIIlIIIlI.toCharArray();
        final String lllllllllllllIIIlIlIIllIIIIlllII = (String)lllllllllllllIIIlIlIIllIIIIlllIl.length;
        short lllllllllllllIIIlIlIIllIIIIllIll = (short)ModelBakery.lIlIlIIIllIIII[1];
        while (lllIlIlllllIIIl(lllllllllllllIIIlIlIIllIIIIllIll, (int)lllllllllllllIIIlIlIIllIIIIlllII)) {
            final char lllllllllllllIIIlIlIIllIIIlIlIII = lllllllllllllIIIlIlIIllIIIIlllIl[lllllllllllllIIIlIlIIllIIIIllIll];
            lllllllllllllIIIlIlIIllIIIlIIlIl.append((char)(lllllllllllllIIIlIlIIllIIIlIlIII ^ lllllllllllllIIIlIlIIllIIIlIIlII[lllllllllllllIIIlIlIIllIIIlIIIll % lllllllllllllIIIlIlIIllIIIlIIlII.length]));
            "".length();
            ++lllllllllllllIIIlIlIIllIIIlIIIll;
            ++lllllllllllllIIIlIlIIllIIIIllIll;
            "".length();
            if ((0x2B ^ 0x2F) < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIlIIllIIIlIIlIl);
    }
    
    private boolean isCustomRenderer(final ModelBlock lllllllllllllIIIlIlIIllIIlIIlIlI) {
        if (lllIlIllllIIlII(lllllllllllllIIIlIlIIllIIlIIlIlI)) {
            return ModelBakery.lIlIlIIIllIIII[1] != 0;
        }
        final ModelBlock lllllllllllllIIIlIlIIllIIlIIlIll = lllllllllllllIIIlIlIIllIIlIIlIlI.getRootModel();
        if (lllIlIllllIlIII(lllllllllllllIIIlIlIIllIIlIIlIll, ModelBakery.MODEL_ENTITY)) {
            return ModelBakery.lIlIlIIIllIIII[2] != 0;
        }
        return ModelBakery.lIlIlIIIllIIII[1] != 0;
    }
    
    private List<String> getVariantNames(final Item lllllllllllllIIIlIlIIlllIIlllIlI) {
        List<String> lllllllllllllIIIlIlIIlllIIllllII = this.variantNames.get(lllllllllllllIIIlIlIIlllIIlllIlI);
        if (lllIlIllllIIlII(lllllllllllllIIIlIlIIlllIIllllII)) {
            lllllllllllllIIIlIlIIlllIIllllII = Collections.singletonList(Item.itemRegistry.getNameForObject(lllllllllllllIIIlIlIIlllIIlllIlI).toString());
        }
        return lllllllllllllIIIlIlIIlllIIllllII;
    }
    
    private BakedQuad makeBakedQuad(final BlockPart lllllllllllllIIIlIlIIllIllIlIlII, final BlockPartFace lllllllllllllIIIlIlIIllIllIIllII, final TextureAtlasSprite lllllllllllllIIIlIlIIllIllIIlIll, final EnumFacing lllllllllllllIIIlIlIIllIllIIlIlI, final ModelRotation lllllllllllllIIIlIlIIllIllIlIIII, final boolean lllllllllllllIIIlIlIIllIllIIllll) {
        return this.faceBakery.makeBakedQuad(lllllllllllllIIIlIlIIllIllIlIlII.positionFrom, lllllllllllllIIIlIlIIllIllIlIlII.positionTo, lllllllllllllIIIlIlIIllIllIIllII, lllllllllllllIIIlIlIIllIllIIlIll, lllllllllllllIIIlIlIIllIllIIlIlI, lllllllllllllIIIlIlIIllIllIlIIII, lllllllllllllIIIlIlIIllIllIlIlII.partRotation, lllllllllllllIIIlIlIIllIllIIllll, lllllllllllllIIIlIlIIllIllIlIlII.shade);
    }
    
    private List<ResourceLocation> getParentPath(final ResourceLocation lllllllllllllIIIlIlIIllIlIlIIlIl) {
        final ResourceLocation[] array = new ResourceLocation[ModelBakery.lIlIlIIIllIIII[2]];
        array[ModelBakery.lIlIlIIIllIIII[1]] = lllllllllllllIIIlIlIIllIlIlIIlIl;
        final List<ResourceLocation> lllllllllllllIIIlIlIIllIlIlIIlII = (List<ResourceLocation>)Lists.newArrayList((Object[])array);
        ResourceLocation lllllllllllllIIIlIlIIllIlIlIIIll = lllllllllllllIIIlIlIIllIlIlIIlIl;
        "".length();
        if (((0x4A ^ 0x6A ^ (0x24 ^ 0x1A)) & (0 + 143 - 18 + 48 ^ 44 + 59 - 6 + 82 ^ -" ".length())) != 0x0) {
            return null;
        }
        while (!lllIlIllllIIlII(lllllllllllllIIIlIlIIllIlIlIIIll = this.getParentLocation(lllllllllllllIIIlIlIIllIlIlIIIll))) {
            lllllllllllllIIIlIlIIllIlIlIIlII.add(ModelBakery.lIlIlIIIllIIII[1], lllllllllllllIIIlIlIIllIlIlIIIll);
        }
        return lllllllllllllIIIlIlIIllIlIlIIlII;
    }
    
    private static boolean lllIlIllllIIlll(final int lllllllllllllIIIlIlIIlIlllllllIl, final int lllllllllllllIIIlIlIIlIlllllllII) {
        return lllllllllllllIIIlIlIIlIlllllllIl == lllllllllllllIIIlIlIIlIlllllllII;
    }
    
    private IBakedModel bakeModel(final ModelBlock lllllllllllllIIIlIlIIllIllllIIIl, final ModelRotation lllllllllllllIIIlIlIIllIllllIIII, final boolean lllllllllllllIIIlIlIIllIlllIIlIl) {
        final TextureAtlasSprite lllllllllllllIIIlIlIIllIlllIlllI = this.sprites.get(new ResourceLocation(lllllllllllllIIIlIlIIllIllllIIIl.resolveTextureName(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[282]])));
        final SimpleBakedModel.Builder lllllllllllllIIIlIlIIllIlllIllIl = new SimpleBakedModel.Builder(lllllllllllllIIIlIlIIllIllllIIIl).setTexture(lllllllllllllIIIlIlIIllIlllIlllI);
        final String lllllllllllllIIIlIlIIllIlllIIIIl = (String)lllllllllllllIIIlIlIIllIllllIIIl.getElements().iterator();
        "".length();
        if (("  ".length() & ~"  ".length()) != ((0x7F ^ 0x25) & ~(0x28 ^ 0x72))) {
            return null;
        }
        while (!lllIlIllllIIIll(((Iterator)lllllllllllllIIIlIlIIllIlllIIIIl).hasNext() ? 1 : 0)) {
            final BlockPart lllllllllllllIIIlIlIIllIlllIllII = ((Iterator<BlockPart>)lllllllllllllIIIlIlIIllIlllIIIIl).next();
            final Exception lllllllllllllIIIlIlIIllIllIlllll = (Exception)lllllllllllllIIIlIlIIllIlllIllII.mapFaces.keySet().iterator();
            "".length();
            if ((0x1B ^ 0x10 ^ (0xE ^ 0x1)) <= -" ".length()) {
                return null;
            }
            while (!lllIlIllllIIIll(((Iterator)lllllllllllllIIIlIlIIllIllIlllll).hasNext() ? 1 : 0)) {
                final EnumFacing lllllllllllllIIIlIlIIllIlllIlIll = ((Iterator<EnumFacing>)lllllllllllllIIIlIlIIllIllIlllll).next();
                final BlockPartFace lllllllllllllIIIlIlIIllIlllIlIlI = lllllllllllllIIIlIlIIllIlllIllII.mapFaces.get(lllllllllllllIIIlIlIIllIlllIlIll);
                final TextureAtlasSprite lllllllllllllIIIlIlIIllIlllIlIIl = this.sprites.get(new ResourceLocation(lllllllllllllIIIlIlIIllIllllIIIl.resolveTextureName(lllllllllllllIIIlIlIIllIlllIlIlI.texture)));
                if (lllIlIllllIIlII(lllllllllllllIIIlIlIIllIlllIlIlI.cullFace)) {
                    lllllllllllllIIIlIlIIllIlllIllIl.addGeneralQuad(this.makeBakedQuad(lllllllllllllIIIlIlIIllIlllIllII, lllllllllllllIIIlIlIIllIlllIlIlI, lllllllllllllIIIlIlIIllIlllIlIIl, lllllllllllllIIIlIlIIllIlllIlIll, lllllllllllllIIIlIlIIllIllllIIII, lllllllllllllIIIlIlIIllIlllIIlIl));
                    "".length();
                    "".length();
                    if ((0x3B ^ 0x3F) != (0x11 ^ 0x15)) {
                        return null;
                    }
                    continue;
                }
                else {
                    lllllllllllllIIIlIlIIllIlllIllIl.addFaceQuad(lllllllllllllIIIlIlIIllIllllIIII.rotateFace(lllllllllllllIIIlIlIIllIlllIlIlI.cullFace), this.makeBakedQuad(lllllllllllllIIIlIlIIllIlllIllII, lllllllllllllIIIlIlIIllIlllIlIlI, lllllllllllllIIIlIlIIllIlllIlIIl, lllllllllllllIIIlIlIIllIlllIlIll, lllllllllllllIIIlIlIIllIllllIIII, lllllllllllllIIIlIlIIllIlllIIlIl));
                    "".length();
                }
            }
        }
        return lllllllllllllIIIlIlIIllIlllIllIl.makeBakedModel();
    }
    
    private static boolean lllIlIlllllIIIl(final int lllllllllllllIIIlIlIIlIllllllIIl, final int lllllllllllllIIIlIlIIlIllllllIII) {
        return lllllllllllllIIIlIlIIlIllllllIIl < lllllllllllllIIIlIlIIlIllllllIII;
    }
    
    private void bakeBlockModels() {
        short lllllllllllllIIIlIlIIlllIIIlllIl = (short)this.variants.keySet().iterator();
        "".length();
        if (" ".length() != " ".length()) {
            return;
        }
        while (!lllIlIllllIIIll(((Iterator)lllllllllllllIIIlIlIIlllIIIlllIl).hasNext() ? 1 : 0)) {
            final ModelResourceLocation lllllllllllllIIIlIlIIlllIIlIlIII = ((Iterator<ModelResourceLocation>)lllllllllllllIIIlIlIIlllIIIlllIl).next();
            final WeightedBakedModel.Builder lllllllllllllIIIlIlIIlllIIlIIlll = new WeightedBakedModel.Builder();
            int lllllllllllllIIIlIlIIlllIIlIIllI = ModelBakery.lIlIlIIIllIIII[1];
            final float lllllllllllllIIIlIlIIlllIIIllIIl = (float)this.variants.get(lllllllllllllIIIlIlIIlllIIlIlIII).getVariants().iterator();
            "".length();
            if (((23 + 171 - 59 + 56 ^ 105 + 136 - 227 + 156) & (0x3B ^ 0xE ^ (0x48 ^ 0x68) ^ -" ".length())) >= " ".length()) {
                return;
            }
            while (!lllIlIllllIIIll(((Iterator)lllllllllllllIIIlIlIIlllIIIllIIl).hasNext() ? 1 : 0)) {
                final ModelBlockDefinition.Variant lllllllllllllIIIlIlIIlllIIlIIlIl = ((Iterator<ModelBlockDefinition.Variant>)lllllllllllllIIIlIlIIlllIIIllIIl).next();
                final ModelBlock lllllllllllllIIIlIlIIlllIIlIIlII = this.models.get(lllllllllllllIIIlIlIIlllIIlIIlIl.getModelLocation());
                if (lllIlIllllIIllI(lllllllllllllIIIlIlIIlllIIlIIlII) && lllIlIllllIIlIl(lllllllllllllIIIlIlIIlllIIlIIlII.isResolved() ? 1 : 0)) {
                    ++lllllllllllllIIIlIlIIlllIIlIIllI;
                    lllllllllllllIIIlIlIIlllIIlIIlll.add(this.bakeModel(lllllllllllllIIIlIlIIlllIIlIIlII, lllllllllllllIIIlIlIIlllIIlIIlIl.getRotation(), lllllllllllllIIIlIlIIlllIIlIIlIl.isUvLocked()), lllllllllllllIIIlIlIIlllIIlIIlIl.getWeight());
                    "".length();
                    "".length();
                    if (-" ".length() != -" ".length()) {
                        return;
                    }
                    continue;
                }
                else {
                    ModelBakery.LOGGER.warn(String.valueOf(new StringBuilder(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[277]]).append(lllllllllllllIIIlIlIIlllIIlIlIII)));
                }
            }
            if (lllIlIllllIIIll(lllllllllllllIIIlIlIIlllIIlIIllI)) {
                ModelBakery.LOGGER.warn(String.valueOf(new StringBuilder(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[278]]).append(lllllllllllllIIIlIlIIlllIIlIlIII)));
                "".length();
                if (-"   ".length() >= 0) {
                    return;
                }
                continue;
            }
            else if (lllIlIllllIIlll(lllllllllllllIIIlIlIIlllIIlIIllI, ModelBakery.lIlIlIIIllIIII[2])) {
                this.bakedRegistry.putObject(lllllllllllllIIIlIlIIlllIIlIlIII, lllllllllllllIIIlIlIIlllIIlIIlll.first());
                "".length();
                if (null != null) {
                    return;
                }
                continue;
            }
            else {
                this.bakedRegistry.putObject(lllllllllllllIIIlIlIIlllIIlIlIII, lllllllllllllIIIlIlIIlllIIlIIlll.build());
            }
        }
        lllllllllllllIIIlIlIIlllIIIlllIl = (short)this.itemLocations.entrySet().iterator();
        "".length();
        if (" ".length() == 0) {
            return;
        }
        while (!lllIlIllllIIIll(((Iterator)lllllllllllllIIIlIlIIlllIIIlllIl).hasNext() ? 1 : 0)) {
            final Map.Entry<String, ResourceLocation> lllllllllllllIIIlIlIIlllIIlIIIll = ((Iterator<Map.Entry<String, ResourceLocation>>)lllllllllllllIIIlIlIIlllIIIlllIl).next();
            final ResourceLocation lllllllllllllIIIlIlIIlllIIlIIIlI = lllllllllllllIIIlIlIIlllIIlIIIll.getValue();
            final ModelResourceLocation lllllllllllllIIIlIlIIlllIIlIIIIl = new ModelResourceLocation(lllllllllllllIIIlIlIIlllIIlIIIll.getKey(), ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[279]]);
            final ModelBlock lllllllllllllIIIlIlIIlllIIlIIIII = this.models.get(lllllllllllllIIIlIlIIlllIIlIIIlI);
            if (lllIlIllllIIllI(lllllllllllllIIIlIlIIlllIIlIIIII) && lllIlIllllIIlIl(lllllllllllllIIIlIlIIlllIIlIIIII.isResolved() ? 1 : 0)) {
                if (lllIlIllllIIlIl(this.isCustomRenderer(lllllllllllllIIIlIlIIlllIIlIIIII) ? 1 : 0)) {
                    this.bakedRegistry.putObject(lllllllllllllIIIlIlIIlllIIlIIIIl, new BuiltInModel(lllllllllllllIIIlIlIIlllIIlIIIII.func_181682_g()));
                    "".length();
                    if ("  ".length() < 0) {
                        return;
                    }
                    continue;
                }
                else {
                    this.bakedRegistry.putObject(lllllllllllllIIIlIlIIlllIIlIIIIl, this.bakeModel(lllllllllllllIIIlIlIIlllIIlIIIII, ModelRotation.X0_Y0, (boolean)(ModelBakery.lIlIlIIIllIIII[1] != 0)));
                    "".length();
                    if (-" ".length() > "  ".length()) {
                        return;
                    }
                    continue;
                }
            }
            else {
                ModelBakery.LOGGER.warn(String.valueOf(new StringBuilder(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[280]]).append(lllllllllllllIIIlIlIIlllIIlIIIlI)));
            }
        }
    }
    
    private void loadModels() {
        final Deque<ResourceLocation> lllllllllllllIIIlIlIIllIlIlllIII = (Deque<ResourceLocation>)Queues.newArrayDeque();
        final Set<ResourceLocation> lllllllllllllIIIlIlIIllIlIllIlll = (Set<ResourceLocation>)Sets.newHashSet();
        final Iterator<ResourceLocation> iterator = this.models.keySet().iterator();
        "".length();
        if ("   ".length() == 0) {
            return;
        }
        while (!lllIlIllllIIIll(iterator.hasNext() ? 1 : 0)) {
            final ResourceLocation lllllllllllllIIIlIlIIllIlIllIllI = iterator.next();
            lllllllllllllIIIlIlIIllIlIllIlll.add(lllllllllllllIIIlIlIIllIlIllIllI);
            "".length();
            final ResourceLocation lllllllllllllIIIlIlIIllIlIllIlIl = this.models.get(lllllllllllllIIIlIlIIllIlIllIllI).getParentLocation();
            if (lllIlIllllIIllI(lllllllllllllIIIlIlIIllIlIllIlIl)) {
                lllllllllllllIIIlIlIIllIlIlllIII.add(lllllllllllllIIIlIlIIllIlIllIlIl);
                "".length();
            }
        }
        "".length();
        if ((124 + 182 - 236 + 115 ^ 123 + 91 - 88 + 62) <= 0) {
            return;
        }
        while (!lllIlIllllIIlIl(lllllllllllllIIIlIlIIllIlIlllIII.isEmpty() ? 1 : 0)) {
            final ResourceLocation lllllllllllllIIIlIlIIllIlIllIlII = lllllllllllllIIIlIlIIllIlIlllIII.pop();
            try {
                if (lllIlIllllIIllI(this.models.get(lllllllllllllIIIlIlIIllIlIllIlII))) {
                    "".length();
                    if (null != null) {
                        return;
                    }
                    continue;
                }
                else {
                    final ModelBlock lllllllllllllIIIlIlIIllIlIllIIll = this.loadModel(lllllllllllllIIIlIlIIllIlIllIlII);
                    this.models.put(lllllllllllllIIIlIlIIllIlIllIlII, lllllllllllllIIIlIlIIllIlIllIIll);
                    "".length();
                    final ResourceLocation lllllllllllllIIIlIlIIllIlIllIIlI = lllllllllllllIIIlIlIIllIlIllIIll.getParentLocation();
                    if (lllIlIllllIIllI(lllllllllllllIIIlIlIIllIlIllIIlI) && lllIlIllllIIIll(lllllllllllllIIIlIlIIllIlIllIlll.contains(lllllllllllllIIIlIlIIllIlIllIIlI) ? 1 : 0)) {
                        lllllllllllllIIIlIlIIllIlIlllIII.add(lllllllllllllIIIlIlIIllIlIllIIlI);
                        "".length();
                        "".length();
                        if (((0x94 ^ 0x8E) & ~(0xA ^ 0x10)) != 0x0) {
                            return;
                        }
                    }
                }
            }
            catch (Exception lllllllllllllIIIlIlIIllIlIllIIIl) {
                ModelBakery.LOGGER.warn(String.valueOf(new StringBuilder(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[283]]).append(ModelBakery.JOINER.join((Iterable)this.getParentPath(lllllllllllllIIIlIlIIllIlIllIlII))).append(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[284]]).append(lllllllllllllIIIlIlIIllIlIllIlII).append(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[285]])), (Throwable)lllllllllllllIIIlIlIIllIlIllIIIl);
            }
            lllllllllllllIIIlIlIIllIlIllIlll.add(lllllllllllllIIIlIlIIllIlIllIlII);
            "".length();
        }
    }
    
    private void loadVariantItemModels() {
        this.loadVariants(this.blockModelShapes.getBlockStateMapper().putAllStateModelLocations().values());
        final Map<ModelResourceLocation, ModelBlockDefinition.Variants> variants = this.variants;
        final ModelResourceLocation model_MISSING = ModelBakery.MODEL_MISSING;
        final String variant = ModelBakery.MODEL_MISSING.getVariant();
        final ModelBlockDefinition.Variant[] array = new ModelBlockDefinition.Variant[ModelBakery.lIlIlIIIllIIII[2]];
        array[ModelBakery.lIlIlIIIllIIII[1]] = new ModelBlockDefinition.Variant(new ResourceLocation(ModelBakery.MODEL_MISSING.getResourcePath()), ModelRotation.X0_Y0, (boolean)(ModelBakery.lIlIlIIIllIIII[1] != 0), ModelBakery.lIlIlIIIllIIII[2]);
        variants.put(model_MISSING, new ModelBlockDefinition.Variants(variant, Lists.newArrayList((Object[])array)));
        "".length();
        final ResourceLocation lllllllllllllIIIlIlIIlllllIllIII = new ResourceLocation(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[30]]);
        final ModelBlockDefinition lllllllllllllIIIlIlIIlllllIlIlll = this.getModelBlockDefinition(lllllllllllllIIIlIlIIlllllIllIII);
        this.registerVariant(lllllllllllllIIIlIlIIlllllIlIlll, new ModelResourceLocation(lllllllllllllIIIlIlIIlllllIllIII, ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[31]]));
        this.registerVariant(lllllllllllllIIIlIlIIlllllIlIlll, new ModelResourceLocation(lllllllllllllIIIlIlIIlllllIllIII, ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[32]]));
        this.loadVariantModels();
        this.loadItemModels();
    }
    
    private ResourceLocation getModelLocation(final ResourceLocation lllllllllllllIIIlIlIIlllIllIIllI) {
        return new ResourceLocation(lllllllllllllIIIlIlIIlllIllIIllI.getResourceDomain(), String.valueOf(new StringBuilder(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[52]]).append(lllllllllllllIIIlIlIIlllIllIIllI.getResourcePath()).append(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[53]])));
    }
    
    private static boolean lllIlIllllIlIIl(final Object lllllllllllllIIIlIlIIlIlllllIlIl, final Object lllllllllllllIIIlIlIIlIlllllIlII) {
        return lllllllllllllIIIlIlIIlIlllllIlIl != lllllllllllllIIIlIlIIlIlllllIlII;
    }
    
    private static String lllIIlIllIlIIll(final String lllllllllllllIIIlIlIIllIIIIIIlIl, final String lllllllllllllIIIlIlIIllIIIIIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlIIllIIIIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlIIllIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIlIIllIIIIIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIlIIllIIIIIIlll.init(ModelBakery.lIlIlIIIllIIII[3], lllllllllllllIIIlIlIIllIIIIIlIII);
            return new String(lllllllllllllIIIlIlIIllIIIIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlIIllIIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlIIllIIIIIIllI) {
            lllllllllllllIIIlIlIIllIIIIIIllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIlIllllIIllI(final Object lllllllllllllIIIlIlIIlIlllllIIlI) {
        return lllllllllllllIIIlIlIIlIlllllIIlI != null;
    }
    
    private ModelBlock makeItemModel(final ModelBlock lllllllllllllIIIlIlIIllIIIllIlII) {
        return this.itemModelGenerator.makeItemModel(this.textureMap, lllllllllllllIIIlIlIIllIIIllIlII);
    }
    
    private Set<ResourceLocation> getItemsTextureLocations() {
        final Set<ResourceLocation> lllllllllllllIIIlIlIIllIIllIlIII = (Set<ResourceLocation>)Sets.newHashSet();
        final Exception lllllllllllllIIIlIlIIllIIlIlllIl = (Exception)this.itemLocations.values().iterator();
        "".length();
        if (" ".length() > (0xC5 ^ 0xC1)) {
            return null;
        }
        while (!lllIlIllllIIIll(((Iterator)lllllllllllllIIIlIlIIllIIlIlllIl).hasNext() ? 1 : 0)) {
            final ResourceLocation lllllllllllllIIIlIlIIllIIllIIlll = ((Iterator<ResourceLocation>)lllllllllllllIIIlIlIIllIIlIlllIl).next();
            final ModelBlock lllllllllllllIIIlIlIIllIIllIIllI = this.models.get(lllllllllllllIIIlIlIIllIIllIIlll);
            if (lllIlIllllIIllI(lllllllllllllIIIlIlIIllIIllIIllI)) {
                lllllllllllllIIIlIlIIllIIllIlIII.add(new ResourceLocation(lllllllllllllIIIlIlIIllIIllIIllI.resolveTextureName(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[288]])));
                "".length();
                if (lllIlIllllIIlIl(this.hasItemModel(lllllllllllllIIIlIlIIllIIllIIllI) ? 1 : 0)) {
                    final String lllllllllllllIIIlIlIIllIIlIllIlI = (String)ItemModelGenerator.LAYERS.iterator();
                    "".length();
                    if (" ".length() < 0) {
                        return null;
                    }
                    while (!lllIlIllllIIIll(((Iterator)lllllllllllllIIIlIlIIllIIlIllIlI).hasNext() ? 1 : 0)) {
                        final String lllllllllllllIIIlIlIIllIIllIIlIl = ((Iterator<String>)lllllllllllllIIIlIlIIllIIlIllIlI).next();
                        final ResourceLocation lllllllllllllIIIlIlIIllIIllIIlII = new ResourceLocation(lllllllllllllIIIlIlIIllIIllIIllI.resolveTextureName(lllllllllllllIIIlIlIIllIIllIIlIl));
                        if (lllIlIllllIlIII(lllllllllllllIIIlIlIIllIIllIIllI.getRootModel(), ModelBakery.MODEL_COMPASS) && lllIlIllllIIIll(TextureMap.LOCATION_MISSING_TEXTURE.equals(lllllllllllllIIIlIlIIllIIllIIlII) ? 1 : 0)) {
                            TextureAtlasSprite.setLocationNameCompass(lllllllllllllIIIlIlIIllIIllIIlII.toString());
                            "".length();
                            if (-"  ".length() > 0) {
                                return null;
                            }
                        }
                        else if (lllIlIllllIlIII(lllllllllllllIIIlIlIIllIIllIIllI.getRootModel(), ModelBakery.MODEL_CLOCK) && lllIlIllllIIIll(TextureMap.LOCATION_MISSING_TEXTURE.equals(lllllllllllllIIIlIlIIllIIllIIlII) ? 1 : 0)) {
                            TextureAtlasSprite.setLocationNameClock(lllllllllllllIIIlIlIIllIIllIIlII.toString());
                        }
                        lllllllllllllIIIlIlIIllIIllIlIII.add(lllllllllllllIIIlIlIIllIIllIIlII);
                        "".length();
                    }
                    "".length();
                    if (" ".length() != " ".length()) {
                        return null;
                    }
                    continue;
                }
                else {
                    if (!lllIlIllllIIIll(this.isCustomRenderer(lllllllllllllIIIlIlIIllIIllIIllI) ? 1 : 0)) {
                        continue;
                    }
                    final String lllllllllllllIIIlIlIIllIIlIllIlI = (String)lllllllllllllIIIlIlIIllIIllIIllI.getElements().iterator();
                    "".length();
                    if (((0x1 ^ 0x38 ^ (0x6E ^ 0x1D)) & (0xAD ^ 0x82 ^ (0x37 ^ 0x52) ^ -" ".length())) >= " ".length()) {
                        return null;
                    }
                    while (!lllIlIllllIIIll(((Iterator)lllllllllllllIIIlIlIIllIIlIllIlI).hasNext() ? 1 : 0)) {
                        final BlockPart lllllllllllllIIIlIlIIllIIllIIIll = ((Iterator<BlockPart>)lllllllllllllIIIlIlIIllIIlIllIlI).next();
                        final short lllllllllllllIIIlIlIIllIIlIllIII = (short)lllllllllllllIIIlIlIIllIIllIIIll.mapFaces.values().iterator();
                        "".length();
                        if (-" ".length() >= 0) {
                            return null;
                        }
                        while (!lllIlIllllIIIll(((Iterator)lllllllllllllIIIlIlIIllIIlIllIII).hasNext() ? 1 : 0)) {
                            final BlockPartFace lllllllllllllIIIlIlIIllIIllIIIlI = ((Iterator<BlockPartFace>)lllllllllllllIIIlIlIIllIIlIllIII).next();
                            final ResourceLocation lllllllllllllIIIlIlIIllIIllIIIIl = new ResourceLocation(lllllllllllllIIIlIlIIllIIllIIllI.resolveTextureName(lllllllllllllIIIlIlIIllIIllIIIlI.texture));
                            lllllllllllllIIIlIlIIllIIllIlIII.add(lllllllllllllIIIlIlIIllIIllIIIIl);
                            "".length();
                        }
                    }
                }
            }
        }
        return lllllllllllllIIIlIlIIllIIllIlIII;
    }
    
    private Set<ResourceLocation> getTextureLocations(final ModelBlock lllllllllllllIIIlIlIIllIlIIIlIII) {
        final Set<ResourceLocation> lllllllllllllIIIlIlIIllIlIIIIlll = (Set<ResourceLocation>)Sets.newHashSet();
        final float lllllllllllllIIIlIlIIllIlIIIIIII = (float)lllllllllllllIIIlIlIIllIlIIIlIII.getElements().iterator();
        "".length();
        if (null != null) {
            return null;
        }
        while (!lllIlIllllIIIll(((Iterator)lllllllllllllIIIlIlIIllIlIIIIIII).hasNext() ? 1 : 0)) {
            final BlockPart lllllllllllllIIIlIlIIllIlIIIIllI = ((Iterator<BlockPart>)lllllllllllllIIIlIlIIllIlIIIIIII).next();
            final boolean lllllllllllllIIIlIlIIllIIllllllI = (boolean)lllllllllllllIIIlIlIIllIlIIIIllI.mapFaces.values().iterator();
            "".length();
            if (((0x52 ^ 0x15) & ~(0x7 ^ 0x40)) != 0x0) {
                return null;
            }
            while (!lllIlIllllIIIll(((Iterator)lllllllllllllIIIlIlIIllIIllllllI).hasNext() ? 1 : 0)) {
                final BlockPartFace lllllllllllllIIIlIlIIllIlIIIIlIl = ((Iterator<BlockPartFace>)lllllllllllllIIIlIlIIllIIllllllI).next();
                final ResourceLocation lllllllllllllIIIlIlIIllIlIIIIlII = new ResourceLocation(lllllllllllllIIIlIlIIllIlIIIlIII.resolveTextureName(lllllllllllllIIIlIlIIllIlIIIIlIl.texture));
                lllllllllllllIIIlIlIIllIlIIIIlll.add(lllllllllllllIIIlIlIIllIlIIIIlII);
                "".length();
            }
        }
        lllllllllllllIIIlIlIIllIlIIIIlll.add(new ResourceLocation(lllllllllllllIIIlIlIIllIlIIIlIII.resolveTextureName(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[286]])));
        "".length();
        return lllllllllllllIIIlIlIIllIlIIIIlll;
    }
    
    private ResourceLocation getBlockStateLocation(final ResourceLocation lllllllllllllIIIlIlIIllllIIlIlll) {
        return new ResourceLocation(lllllllllllllIIIlIlIIllllIIlIlll.getResourceDomain(), String.valueOf(new StringBuilder(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[41]]).append(lllllllllllllIIIlIlIIllllIIlIlll.getResourcePath()).append(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[42]])));
    }
    
    private void bakeItemModels() {
        float lllllllllllllIIIlIlIIllIIIllllII = (float)this.itemLocations.values().iterator();
        "".length();
        if ("  ".length() != "  ".length()) {
            return;
        }
        while (!lllIlIllllIIIll(((Iterator)lllllllllllllIIIlIlIIllIIIllllII).hasNext() ? 1 : 0)) {
            final ResourceLocation lllllllllllllIIIlIlIIllIIlIIIIlI = ((Iterator<ResourceLocation>)lllllllllllllIIIlIlIIllIIIllllII).next();
            final ModelBlock lllllllllllllIIIlIlIIllIIlIIIIIl = this.models.get(lllllllllllllIIIlIlIIllIIlIIIIlI);
            if (lllIlIllllIIlIl(this.hasItemModel(lllllllllllllIIIlIlIIllIIlIIIIIl) ? 1 : 0)) {
                final ModelBlock lllllllllllllIIIlIlIIllIIlIIIIII = this.makeItemModel(lllllllllllllIIIlIlIIllIIlIIIIIl);
                if (lllIlIllllIIllI(lllllllllllllIIIlIlIIllIIlIIIIII)) {
                    lllllllllllllIIIlIlIIllIIlIIIIII.name = lllllllllllllIIIlIlIIllIIlIIIIlI.toString();
                }
                this.models.put(lllllllllllllIIIlIlIIllIIlIIIIlI, lllllllllllllIIIlIlIIllIIlIIIIII);
                "".length();
                "".length();
                if (-" ".length() > (0xC3 ^ 0xC7)) {
                    return;
                }
                continue;
            }
            else {
                if (!lllIlIllllIIlIl(this.isCustomRenderer(lllllllllllllIIIlIlIIllIIlIIIIIl) ? 1 : 0)) {
                    continue;
                }
                this.models.put(lllllllllllllIIIlIlIIllIIlIIIIlI, lllllllllllllIIIlIlIIllIIlIIIIIl);
                "".length();
            }
        }
        lllllllllllllIIIlIlIIllIIIllllII = (float)this.sprites.values().iterator();
        "".length();
        if (" ".length() == (0x59 ^ 0x6E ^ (0x8F ^ 0xBC))) {
            return;
        }
        while (!lllIlIllllIIIll(((Iterator)lllllllllllllIIIlIlIIllIIIllllII).hasNext() ? 1 : 0)) {
            final TextureAtlasSprite lllllllllllllIIIlIlIIllIIIllllll = ((Iterator<TextureAtlasSprite>)lllllllllllllIIIlIlIIllIIIllllII).next();
            if (lllIlIllllIIIll(lllllllllllllIIIlIlIIllIIIllllll.hasAnimationMetadata() ? 1 : 0)) {
                lllllllllllllIIIlIlIIllIIIllllll.clearFramesTextureData();
            }
        }
    }
    
    private ResourceLocation getItemLocation(final String lllllllllllllIIIlIlIIlllIIllIIll) {
        final ResourceLocation lllllllllllllIIIlIlIIlllIIllIlII = new ResourceLocation(lllllllllllllIIIlIlIIlllIIllIIll);
        return new ResourceLocation(lllllllllllllIIIlIlIIlllIIllIlII.getResourceDomain(), String.valueOf(new StringBuilder(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[276]]).append(lllllllllllllIIIlIlIIlllIIllIlII.getResourcePath())));
    }
    
    private boolean hasItemModel(final ModelBlock lllllllllllllIIIlIlIIllIIlIlIIIl) {
        if (lllIlIllllIIlII(lllllllllllllIIIlIlIIllIIlIlIIIl)) {
            return ModelBakery.lIlIlIIIllIIII[1] != 0;
        }
        final ModelBlock lllllllllllllIIIlIlIIllIIlIlIIlI = lllllllllllllIIIlIlIIllIIlIlIIIl.getRootModel();
        if (lllIlIllllIlIIl(lllllllllllllIIIlIlIIllIIlIlIIlI, ModelBakery.MODEL_GENERATED) && lllIlIllllIlIIl(lllllllllllllIIIlIlIIllIIlIlIIlI, ModelBakery.MODEL_COMPASS) && lllIlIllllIlIIl(lllllllllllllIIIlIlIIllIIlIlIIlI, ModelBakery.MODEL_CLOCK)) {
            return ModelBakery.lIlIlIIIllIIII[1] != 0;
        }
        return ModelBakery.lIlIlIIIllIIII[2] != 0;
    }
    
    private static boolean lllIlIllllIIlII(final Object lllllllllllllIIIlIlIIlIllllIllII) {
        return lllllllllllllIIIlIlIIlIllllIllII == null;
    }
    
    private static void lllIlIIlIllIIII() {
        (lIlIIlIIllIlll = new String[ModelBakery.lIlIlIIIllIIII[289]])[ModelBakery.lIlIlIIIllIIII[1]] = lllIIlIllIlIIll("j/cyqXZXge+QBASLyiw3MNO7u5SGCKRZ", "mHtLG");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[2]] = lllIIlIllIlIIll("G6ywr4m5OtEeO/t51URlTo2QUFFil/Ww", "IYscc");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[3]] = lllIIlIllIlIlll("KxoELiw6WQcsMSgpDSEoPg==", "IvkMG");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[4]] = lllIIlIllIlIlll("LRs4Cjo8WDsIJy4oJB04Ixs=", "OwWiQ");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[5]] = lllIIlIllIlIlll("EgIVCx0DQR4NBQQcFREpAxobDxMvXg==", "pnzhv");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[6]] = lllIIlIllIlIlll("BSMiJxgUYCkhABM9Ij0sFDssIxY4fg==", "gOMDs");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[7]] = lllIIlIllIlIIll("SnGNgAwjF0bvSA0WgYd9VnidYves4kV2", "MNTno");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[8]] = lllIIlIllIlIIll("7hKxRK0rxQc2OfVCpRb8Z03dOLFVxOce", "ElFRC");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[9]] = lllIIlIllIlIlll("FhkWIgcHWh0kHwAHFjgzBwEYJgkrQQ==", "tuyAl");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[10]] = lllIIlIllIlIlll("JBgpEQk1WyIXETIGKQs9NQAnFQcZQQ==", "FtFrb");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[11]] = lllIIlIllIlIIll("2SKJtUpm8JOylTvUnbKygxv3B5BVKNf6", "uxuQr");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[12]] = lllIIlIllIlIlll("BRUhOToUVio/IhMLISMOFA0vPTQ4Tg==", "gyNZQ");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[13]] = lllIIlIllIlIlll("JS0aAQ80bhEHFzMzGhs7NDUUBQEYeQ==", "GAubd");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[14]] = lllIIlIllIlIlll("GhYLMTgLVQA3IAwICysMCw4FNTYnQw==", "xzdRS");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[15]] = lllIIlIllIlIlll("HDgxNTlaKTkoPgwTNSonGj4LKyYaOAswLxkhMSw=", "uLTXJ");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[16]] = lllIIlIllIlIlll("CAYKAjtOFwIfPBgtDh0lDgAwHCQOBjAMIAQBGx8kAAYK", "arooH");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[17]] = lllIIlIllIlIlll("BRsGLDRDCg4xMxUwAjMqAx08MisDGzwtIgsICi8gHw==", "locAG");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[18]] = lllIIlIllIlIlll("AA0xCQlGHDkUDhAmNRYXBgsLFxYGDQsGFQYNJw==", "iyTdz");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[0]] = lllIIlIllIlIIll("mds4GVoUKwOZIi52KB13ww==", "YidkA");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[19]] = lllIIlIllIlIIll("XFFK1C5iw54=", "bEZqj");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[20]] = lllIIlIllIllIII("AYN2CwMXjWc=", "abLXQ");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[21]] = lllIIlIllIlIIll("6TGhhdv4F2NS82tZihBjhoz1qiKimXMNpiHctiisizsT0HpA7hn8B0BEUmLQdUf1RDTu+n45EiGCCcNXdXt2RGEeMv8JF4G+6qOM9Q2EqTSiAY41CV4QGEZUlFwzeMOcfSxNsJ/fNePy/EiXDP1Z+f/TGMXDEauHhGixMRi+Hmc=", "XYVsF");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[22]] = lllIIlIllIlIlll("DmE/ISAYJjQ5Nld5ATZlVWE8PyoYYWBtHkVven1pVXMHYWVVY3g5Kld5ehZ0Q296fHNZY2t7GFljem1nEyI5KDZXeXo2ZVVjem1lVWE+IjIbYWBtPlc2LG9/VRhqYWVFb3p8c1lja3sYWWN4OSANNy8/IFd5eG84VWN6MDgoPg==", "uCZME");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[23]] = lllIIlIllIllIII("DimbHT7/LL79Xt+xUYJNYYJ7pnkVUeoE1ITzf+DNBhICcwiAsuEC/e9hsg68+h14MhXVYDMkFMos6tdthQw3kktKDhEwko2hU/7Bli6+OE/w5qBgP05yBQcmwIfA4NB/DNjQG+XxTxYAmXN39ssEU754t4Ps4NvbgJQji2Y+suk=", "MxvPA");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[24]] = lllIIlIllIlIIll("7z8l56fO5bPuQX6W8la0cxix0HwaleS59GQXtXabW5MpsGEQAyjF8TWMOgWeHv5Wwghhuq1CjvN0TLynCekRFAkcGKF5z4228JodGkecqWvPD7qQcQnoMoUj8+rBPOtUmNWoYH/A6M0acvjBpnXrODfA8xoL6L2ow/UaNiC5P7A=", "whBHd");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[25]] = lllIIlIllIllIII("ajWKuumSleE=", "axdXr");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[26]] = lllIIlIllIlIIll("BvZETwUUQHQ+m7y6nJSHX4nwGW9584fG", "EoQxR");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[27]] = lllIIlIllIllIII("SHno+3xy7IbwGAP6xFgPO012aqbHQ1Iyfu8MBgSp4lY=", "tRdsu");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[28]] = lllIIlIllIlIIll("79tonr2imuQTh3CrI/FQYOKSSuFU/5FW", "vTwMg");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[29]] = lllIIlIllIllIII("j7Ty0qEgDb03NL9oJiWz4FyQCDHV2M/9", "tivTD");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[30]] = lllIIlIllIlIlll("IiEiIxktJyYjIw==", "KUGNF");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[31]] = lllIIlIllIlIlll("GT4kHCQb", "wQVqE");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[32]] = lllIIlIllIlIIll("kc2PSyBUneQ=", "uDiVn");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[33]] = lllIIlIllIlIlll("EToNMB4hdBg9Uig7DTZSMjUeOxMqIFZy", "DTlRr");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[34]] = lllIIlIllIllIII("uhDzaXB3JHU=", "sIkKf");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[35]] = lllIIlIllIllIII("Yrf9Nm2Fh8cC4BQgp1+2FPGadlKoQyNyNoCzjUw2Smw=", "NptqB");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[36]] = lllIIlIllIlIIll("CoMCUG6VlmCvv4C1N04NQtcfUKpk3oPTRI7WbJy29uD0TcE4FDO759YO5hFCMUhIS9qOxoZ4GgdQufZRhoSkwQ==", "lIEKn");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[37]] = lllIIlIllIlIlll("YFYNMywqTEtm", "GvkAC");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[38]] = lllIIlIllIllIII("pn1M6D7zBKlRdQf7ICAIlPbNHEzFBdKo", "mpids");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[39]] = lllIIlIllIllIII("zbAcFwU2cI8=", "rQhNx");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[40]] = lllIIlIllIllIII("fFRTNo8qG5baZ/1OmEZd8EtcnUW9kHeGjkUVIntQM3NTeY6Y/SmgufVGskD14IzPnEAUpLmKen21Dwi8fbi+Jm4Ftbjhl7kP", "ZvuTL");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[41]] = lllIIlIllIllIII("/EEf4NvyGJwM75yexDXseA==", "nkeVy");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[42]] = lllIIlIllIlIIll("mFrlkyQ7Sno=", "TMJRA");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[43]] = lllIIlIllIlIlll("NgktMCQGRzg9aA8ILTZoAQsjMSNDCiM2LQ9dbHU=", "cgLRH");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[44]] = lllIIlIllIllIII("PGjkVqbgNCjM+D9RoUtjwvm83nQES2Qj", "rTdnP");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[45]] = lllIIlIllIllIII("wa58UUmzmp0=", "JehZM");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[46]] = lllIIlIllIlIIll("DR4bPkIsd9OFxPSjlz5BgkssznwmZO64", "cjgXE");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[47]] = lllIIlIllIlIIll("HPTkQuSjUhAfCcMJwYactw==", "TMNXf");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[48]] = lllIIlIllIlIlll("Jx4rID0sBW0vJSoIKQ==", "EkBLI");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[49]] = lllIIlIllIlIlll("BB0lKRoPBmMgABIBODw=", "fhLEn");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[50]] = lllIIlIllIlIlll("BCIzFicPOXU=", "fWZzS");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[51]] = lllIIlIllIlIIll("ltvHeIwUX9twxvj0/iWASQ==", "TdGWJ");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[52]] = lllIIlIllIlIIll("EGeafvPeYXQ=", "sZWAO");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[53]] = lllIIlIllIlIIll("GUa5QBsw424=", "uDehH");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[54]] = lllIIlIllIlIlll("NB4SKxwEUAcmUA0fEi1QCAQWJFAMHxcsHFtQVA==", "apsIp");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[55]] = lllIIlIllIlIIll("S1ENJ7ZKhYRatZ6zPSDfYg==", "vubIB");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[56]] = lllIIlIllIlIIll("KBXDHbWNEeY=", "KfvSQ");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[57]] = lllIIlIllIlIIll("W5C1fmb5a0g=", "Vlvkf");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[58]] = lllIIlIllIllIII("IlthCpHhGgQ=", "DpGKt");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[59]] = lllIIlIllIlIlll("ET0EBwwCKjoaCBkgEQE=", "vOeie");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[60]] = lllIIlIllIllIII("IVTEwvnwlLs=", "SFzYf");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[61]] = lllIIlIllIlIlll("BTsnGhgVNxcbHA49PAA=", "aRHhq");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[62]] = lllIIlIllIlIIll("5glq895K/26bojmSwrCUyA==", "AzEUv");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[63]] = lllIIlIllIllIII("Pp14WN6gxCf9IpFvWrD3Xw==", "jMBpC");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[64]] = lllIIlIllIlIlll("Fhs8MA==", "rrNDL");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[65]] = lllIIlIllIlIIll("ygMLoEENdu4xhkQQ+iuSQw==", "fjmHO");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[66]] = lllIIlIllIllIII("RbIlIDGf/Aw=", "sPVuS");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[67]] = lllIIlIllIlIIll("fPVrdqKWwgxUklPldSYYrw==", "ALMoR");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[68]] = lllIIlIllIlIIll("xGY1m4uUUZ6QXczQBPg59A==", "wOvni");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[69]] = lllIIlIllIlIIll("xUqf0nTpjMBT6gBXjQT8uQ==", "tfYCK");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[70]] = lllIIlIllIlIlll("ASA8PTYOCiI2OwU+IQ==", "kURZZ");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[71]] = lllIIlIllIlIIll("QoUdfZqNlEJqc2/deWoLLA==", "iunMI");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[72]] = lllIIlIllIllIII("LOCXbHwNQx2BzuxSuDZvFw==", "BRINF");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[73]] = lllIIlIllIllIII("CnUkCjzKizULsEsnUc8Vvg==", "MaLKX");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[74]] = lllIIlIllIllIII("xhV+v4EKdLawzXZL0J8rBw==", "cPeEs");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[75]] = lllIIlIllIlIIll("J5am673oO59N4CxZkw3pww==", "BpbDU");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[76]] = lllIIlIllIllIII("HjCnV2x4/2d+sPYKHjIFZQ==", "UkueC");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[77]] = lllIIlIllIlIIll("bV2ijp3ZDjq+HryMke/5BA==", "sYhXA");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[78]] = lllIIlIllIlIlll("FiQHHhcdJB4qOxM1GRwmFQ==", "rEuuH");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[79]] = lllIIlIllIlIIll("Ao4QoWO9enY=", "pqUbj");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[80]] = lllIIlIllIllIII("4FAMCyge0dOWDGRASIPfXw==", "NynmL");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[81]] = lllIIlIllIlIIll("tED+P+j9aIc=", "vAxDR");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[82]] = lllIIlIllIllIII("XmT2YV85HA9K/gS6oU9nRg==", "bePrn");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[83]] = lllIIlIllIlIIll("wX99k1rANAEgPA7B9NEW0w==", "OXsRz");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[84]] = lllIIlIllIllIII("kmhcxye9+43fBXYqCFoPEQ==", "VlIAw");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[85]] = lllIIlIllIlIIll("upZQf16EB/saLqky/sUL8A==", "ljjZh");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[86]] = lllIIlIllIlIlll("MTQLLCEnGxU8IzQhCg==", "BDyYB");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[87]] = lllIIlIllIlIlll("DTM5Ji4wNi4kMAop", "oZKEF");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[88]] = lllIIlIllIllIII("rT2NKL0WqO5j0OJ+O0or3g==", "aCDuF");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[89]] = lllIIlIllIlIIll("uosCYYqIiQU=", "sUzCT");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[90]] = lllIIlIllIlIIll("lBWSDWxEosRF/nRIi8BhNQ==", "lYavf");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[91]] = lllIIlIllIllIII("i3AvyyBCqWbJTne5AkQqRw==", "LqjWw");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[92]] = lllIIlIllIllIII("CDCswwaH+6xLDAjw2Hbp8kOYUHk7i9t2", "MEvDJ");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[93]] = lllIIlIllIlIIll("2NwS8SH1yfkbvDXSL57uHyN7GwFTwfmT", "fkNbh");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[94]] = lllIIlIllIllIII("XselfVOFbqJPa4Rk0j3D8g==", "FBYki");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[95]] = lllIIlIllIllIII("NekcMhxfR4rYebIln2fXAs95OdEOnxpr", "uxUoP");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[96]] = lllIIlIllIllIII("OW+RpjqxEaBIOUI6WLM8LWWCeDs+Ad9B", "yAVmZ");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[97]] = lllIIlIllIllIII("IY5N0lkIn5B9xu9O/SZ1zA==", "kceKa");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[98]] = lllIIlIllIlIIll("5bL3M4JnMo67MYaPH2n/eQ==", "PnBYb");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[99]] = lllIIlIllIlIIll("nPLNVbm1NMQ=", "gIQXR");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[100]] = lllIIlIllIlIIll("zJxFO/KXULjSP83Lng3V+A==", "zqiNi");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[101]] = lllIIlIllIlIIll("Sv18szFRoYLFzYcPffQ6gQ==", "bSCiJ");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[102]] = lllIIlIllIlIIll("uiZ2ij3eFGuq5FyeWF/VpQ==", "IIOZE");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[103]] = lllIIlIllIlIIll("91wCZWEeuW+Q5wqIXn+gMg==", "qjdLB");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[104]] = lllIIlIllIllIII("Qn8Pqc0+5sHBucIh8ThWtw==", "IPgSf");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[105]] = lllIIlIllIlIlll("EB8EEw8FHB4a", "rsqvP");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[106]] = lllIIlIllIlIlll("ATAFNT8UGgAqPB0=", "qEwES");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[107]] = lllIIlIllIlIIll("K5b+8Wx4RCMx4ROE+BVBRA==", "YVzjh");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[108]] = lllIIlIllIlIIll("Q/QnisJnAU1hVMaxWZoarg==", "BDJie");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[109]] = lllIIlIllIlIlll("AxoiHDATBywJ", "dhCeo");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[110]] = lllIIlIllIllIII("RdapNzBAqxnQqeTYI9HquQ==", "kqHvc");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[111]] = lllIIlIllIlIIll("3qqu8pKm77W/UnVxkVPyQg==", "Qpuyn");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[112]] = lllIIlIllIlIIll("B7QKCboMAewqqLsz99ShmQ==", "maJeh");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[113]] = lllIIlIllIlIlll("BT8GHTg2NA0AKTYhDhog", "iVauL");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[114]] = lllIIlIllIllIII("Do6+pLs3CENBIYCMrlLdvQ==", "MXbim");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[115]] = lllIIlIllIlIlll("PCYnACw2CzEBJD8=", "STFnK");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[116]] = lllIIlIllIllIII("Qx1IN9xa92SV346hho8ayg==", "vRtlG");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[117]] = lllIIlIllIlIlll("MQoqNC05Ais+", "UkDPH");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[118]] = lllIIlIllIllIII("KcFYqM4xC/E=", "aTiab");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[119]] = lllIIlIllIllIII("PB73r1yEfhzgZ8UQL2ngGw==", "NMjSr");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[120]] = lllIIlIllIlIlll("CiYpPBwG", "kJEUi");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[121]] = lllIIlIllIlIIll("rp5/4iau2jh6f8UmdNm6AA==", "TannF");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[122]] = lllIIlIllIllIII("ZhM43aqloVa6gYSn7poYhQ==", "dWUPX");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[123]] = lllIIlIllIllIII("qh7zrf7ezceSnu2OnrXHhA==", "Scxxf");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[124]] = lllIIlIllIlIlll("NQIeJj0dHgI+MTI=", "BjwRX");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[125]] = lllIIlIllIlIlll("Hi4hLjgaMiMsFw==", "nGOEg");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[126]] = lllIIlIllIlIlll("HxAkHTQvDCANIgk=", "phAdQ");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[127]] = lllIIlIllIllIII("4h7RtNM/hZJh05kziX5M0A==", "HkbWx");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[128]] = lllIIlIllIlIIll("sypF2kYIwPdj0bFx6tVPcQ==", "WEmxo");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[129]] = lllIIlIllIlIIll("lmtlsuYkS0JfyyLwKEUCdu3fcwY1QpXO", "DFSKS");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[130]] = lllIIlIllIlIIll("FJSXFKmKDjlslKAsBdF8sg==", "sGTKX");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[131]] = lllIIlIllIlIIll("aSZ4sQc6Y4puCCa6SPUV3AfBkLv4U6Od", "rZJnU");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[132]] = lllIIlIllIlIlll("AiggLAkeEjY2BQ8mCzcADS8=", "lMTDl");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[133]] = lllIIlIllIlIIll("AEV3Egj+0hGFYlaKpzvPjg==", "oKUkB");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[134]] = lllIIlIllIllIII("Kz6fVG5wCFn8hO3ZT7jMX6e6/dosZjEb", "BHkfY");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[135]] = lllIIlIllIlIlll("FCANIhEpPxggExgpCB4dGi0fMg==", "vLlAz");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[136]] = lllIIlIllIllIII("aGMv1+95f/aUsgWUFoBj2dbZHNo6wRx0", "IHHme");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[137]] = lllIIlIllIllIII("Yc3tjFprNppMHcHDpiO/F+TZCQV6tMgf", "HwkIs");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[138]] = lllIIlIllIlIlll("LTYNOgkQNxYsDiEhBhIAIyURPg==", "ODbMg");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[139]] = lllIIlIllIlIIll("0i798+xgHT8hQlWNT7je0ykaK0DRsOfq", "odZPQ");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[140]] = lllIIlIllIllIII("s9RS5SCkRg/gJY2+IvRSLpT06Q4RM8gu", "KLojI");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[141]] = lllIIlIllIlIlll("ED4sPTwAMyw6DRYjEjQPEjQ+", "sGMSc");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[142]] = lllIIlIllIlIlll("Ky4JARYqGBYDEjEpABMsPysEBAA=", "XGews");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[143]] = lllIIlIllIlIlll("LyATLjE7JhM+AC02LTACKSEB", "HRrWn");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[144]] = lllIIlIllIlIIll("FKu+FXqoi8s8c94Zuao06ddnDiwhLMDc", "XQsEr");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[145]] = lllIIlIllIlIlll("PRsdIjEiBhEuADQWLyACMAED", "QrpGn");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[146]] = lllIIlIllIlIIll("7lGf7K1k6GDtzx9EeWasNxtsKq5ntxSc", "IKHKm");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[147]] = lllIIlIllIlIlll("NCgiMT4HIyksLwcyMTgjNiQhBi00IDYq", "XAEYJ");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[148]] = lllIIlIllIlIIll("WrebI59THqrFWRFVjPWSjcMZRHXHqueZ", "odDeg");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[149]] = lllIIlIllIllIII("+HJwi4e9ZwNG0/7B1XkAAsxdxKrOUUK1", "hhkwC");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[150]] = lllIIlIllIllIII("KWmRRl5c7Zakm5tlDwxTJ7wBmUPetaU4", "xKvij");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[151]] = lllIIlIllIllIII("M9Hb2tz4bLbX8kmnkxb3wtjEHvN+Qk1c", "mUrdL");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[152]] = lllIIlIllIlIIll("p+N+FeWhkCiTNf8fI4qJ+Vcxww3j5blN", "BQnHK");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[153]] = lllIIlIllIlIIll("Ok4w9r5nd7uTsBf4KqeTSzQgrpZKOoh/", "ZMNes");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[154]] = lllIIlIllIllIII("RhoPbJFjuQfyfAJU6zlteeC65TJVZVbo", "KepcE");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[155]] = lllIIlIllIlIIll("ieg9Wvc1BooLCtgwIZn5NrdY5AkSr2Uo5Ut+692lYQs=", "FhfcB");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[156]] = lllIIlIllIlIlll("MiQtBTA9KSApNyMlJx0KPCMqBSE0PhsTMjY=", "QLDvU");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[157]] = lllIIlIllIlIIll("sYL7Vo53oxTaE7MQ1rWVJA==", "Noqqq");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[158]] = lllIIlIllIlIlll("PisHBzEMNwAbJjYmBh0rOA==", "SDttH");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[159]] = lllIIlIllIlIIll("YUrtrHfBw9EeBU2XLoHmnGWhJ8MHSv6w", "WfUil");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[160]] = lllIIlIllIlIIll("x7lpFNKPxmeHmBQT3ydVs2RrQ4rJ5E3v", "oZSKJ");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[161]] = lllIIlIllIlIIll("AalCgLHPpAIONWQtEMMKSQ==", "fHoTp");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[162]] = lllIIlIllIlIIll("R5n2Kspar0dKv9bJOxxcIg==", "vCZEn");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[163]] = lllIIlIllIlIlll("MQ0/LQ8MFyEvBQ==", "SdMNg");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[164]] = lllIIlIllIlIlll("OBYNNxU3PBA8GDA=", "RccPy");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[165]] = lllIIlIllIlIIll("dotm5Fbi3ErFFYTB/EpAiw==", "WWSVO");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[166]] = lllIIlIllIlIlll("Mi8cLDQ5LwUYGDovDA==", "VNnGk");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[167]] = lllIIlIllIlIIll("0n9fAxRrRARqRgNskPVVJDZOF2rSL2pc", "HrYxY");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[168]] = lllIIlIllIllIII("lXudJUmp7vas8E9F7Xn2o7gBTwQg1rNo", "BuvXl");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[169]] = lllIIlIllIllIII("tLOFSBUa9XQRbA/uCEZCpw==", "OQggH");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[170]] = lllIIlIllIlIlll("MwQiIgcNGTgiDDoeODI0Ngs5Kgw3Dg==", "RjTKk");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[171]] = lllIIlIllIllIII("Gfu7N7ksr+ZYSfv4MZcfmj47LidE5yKC", "eQMoC");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[172]] = lllIIlIllIlIIll("aPKiMexDJmk8IgCG+GB+NA==", "UlEJJ");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[173]] = lllIIlIllIllIII("O7vGR4paPDYDd5mgm+Gm0RAU7a6mxCY8", "YxDLh");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[174]] = lllIIlIllIlIlll("HywJCgQUBgsXHBs0Bg==", "nYhxp");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[175]] = lllIIlIllIllIII("fuJ7vPUf7PtLBcRvFf85xhs2pcfPgVfYZqrQia+xViE=", "xRjyu");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[176]] = lllIIlIllIllIII("HyJE5LOXI6uN+yRFY8q+aFx6HRkslgY7n2SjhyD3/AI=", "wCtSv");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[177]] = lllIIlIllIlIIll("Saa0LEpFTdjeY5idqvXxfXIMOtnXEpKyMz0souIDT7U=", "Dmuqm");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[178]] = lllIIlIllIllIII("MgBqbV5jTJV0o4I1xJKuHr6mMSF1wL1QFs6AbB7EKGQ=", "esXbI");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[179]] = lllIIlIllIlIlll("Kg8DMzE7Fxc/AC0HKT4POgcTOAssPBU6DzE=", "HcvVn");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[180]] = lllIIlIllIllIII("gtfY4dWQ3eOpgHACeR7hgr7xTAUi19ECFJdwxqQ1OHU=", "fCDLW");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[181]] = lllIIlIllIlIIll("tGTHR4CvnBsig3ssi9/OxuVXxYLZjWECAXm9wQhI+9Q=", "jobXA");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[182]] = lllIIlIllIlIIll("XzKEsJZDC484EJGLT2DZMCN9aO3cyEQT8UjnNxp2sZ8=", "rspUe");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[183]] = lllIIlIllIlIIll("y+bkvYjtL2bZEwa5mfyZJDyLPH+k6Yb9XXAW2ByPYPg=", "Eedps");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[184]] = lllIIlIllIlIIll("8xZak6+h4l4htWv25660yxpIbPcubRl0Nu4o4GSjb08=", "nhrlv");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[185]] = lllIIlIllIllIII("zV9XCXonVWtBtVwL6e2KsNhYHjJ3KUIqrvcBXPNHOLw=", "WCqEV");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[186]] = lllIIlIllIlIlll("CwsnOyUFMTgjKxsALjMVGg85My8cCy8IKR4PMg==", "rnKWJ");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[187]] = lllIIlIllIlIlll("HRoKHCQuEQEBNS4AGRU5HxYJKzgQAQkRPhQXMhc8EAo=", "qsmtP");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[188]] = lllIIlIllIlIlll("HjACAQcHMDoXHRI4CwENLDkEFg0WPwAANhA9BB0=", "sQedi");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[189]] = lllIIlIllIlIlll("DRM4LwYHPio1AAsPPCU+CgArJQQMBD0eAg4AIA==", "baYAa");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[190]] = lllIIlIllIlIIll("jw3OZQXoHElLg3ERuPAHU6EhljIBdI0awFcTwAu3YJM=", "uQMpt");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[191]] = lllIIlIllIlIlll("JiYVBhkbOQAEGyovEDoVKCsHFi00KxoA", "DJter");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[192]] = lllIIlIllIllIII("WyxKogzHZkElE5a1VPOzkkpqIamxLseK", "KOqbP");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[193]] = lllIIlIllIllIII("w+ab4rKMAhagkbI7cAWJ/DT8yv06fry/o6NeObeelO0=", "yFfgf");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[194]] = lllIIlIllIllIII("lA366mxLoxal8otuarLNlFwrI8mmTo74jFCjb3H1AvU=", "AVktW");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[195]] = lllIIlIllIlIlll("AwUfFAYSHQsYNwQNNRY1ABoZLikABw8=", "aijqY");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[196]] = lllIIlIllIllIII("7KhI5bLz01xKv8OQwg9htpG/hJwmtUSmaVCUQMt+IU8=", "SICgP");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[197]] = lllIIlIllIlIlll("JhUFAxk2GAUEKCAIOwoqJB8XMjYkAgE=", "EldmF");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[198]] = lllIIlIllIllIII("qiHgnl8HbFgYNJaJLH1UaYXIvdFuE8shiyx5gdYdP70=", "sFVXi");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[199]] = lllIIlIllIllIII("zroEFkNUbGqsiEcofTg6OGmKS8UUl/Tx", "KNtTh");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[200]] = lllIIlIllIlIlll("GBgcOSobBRM7Gw0VLTUZCQIBDQUJHxc=", "hqrRu");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[201]] = lllIIlIllIlIlll("KBADDgo3DQ8COyEdMQw5JQodNCUlFws=", "DynkU");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[202]] = lllIIlIllIllIII("+G245r4j/fMXMzUt1v+e14Eh/TUb2QnDCwMaCDvOsMg=", "Yywkm");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[203]] = lllIIlIllIlIIll("sMjH45p9WgXcQVmC26o8t2Ehz2n/vxxSUlRmyq8Ndss=", "CHreW");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[204]] = lllIIlIllIllIII("QJqlxDT8p004q2drV7CLCE5eB/L2eAOxtcct6bMDyJ8=", "tBWWg");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[205]] = lllIIlIllIlIlll("CQYoJiADKzo8Jg8aLCwYARgoOzQ5BCgmIg==", "ftIHG");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[206]] = lllIIlIllIlIlll("ETArPh85KzYrEwg9JhUdCjkxOSUWOSwv", "fXBJz");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[207]] = lllIIlIllIllIII("rIbPi1bM9U6UlfLq8YoKdg==", "rQaoV");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[208]] = lllIIlIllIlIIll("dE8nJD8rHYZjQuUJ25oSzA==", "WRvmn");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[209]] = lllIIlIllIllIII("s0l1sdy0ffaLccJxubF+Uw==", "EtOrD");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[210]] = lllIIlIllIlIlll("AAQcERgLBAUlKwsC", "denzG");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[211]] = lllIIlIllIllIII("GkFARQ0I7mp7lNrggq2F2A==", "ycLSz");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[212]] = lllIIlIllIlIIll("wwGysxq3rlHx9/RejIUhscU6BsdDCDKB", "paumf");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[213]] = lllIIlIllIllIII("xbtU/GfFmmz7gN0FzRBSmQ==", "oeaSp");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[214]] = lllIIlIllIlIlll("OCkUCBgFJhQZAz8x", "ZEuks");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[215]] = lllIIlIllIllIII("2AUmIGyo1fsr6ySJbuEU0Q==", "ojeQd");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[216]] = lllIIlIllIllIII("Bww6eoxoWw51Q8L3GpE3GQ==", "HJORH");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[217]] = lllIIlIllIllIII("dZEG22XRQZhH+4MmNzDhhA==", "gCyNB");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[218]] = lllIIlIllIllIII("LSekqSSymrF9Uw9OZy/Wjg==", "HhZmi");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[219]] = lllIIlIllIlIIll("UA4eMtsOAcZ8cBLeyNvhOA==", "KSmOO");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[220]] = lllIIlIllIllIII("59wrxaw9GrtPfYykLriQgg==", "JwJRd");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[221]] = lllIIlIllIlIIll("XvfxfEktPVAJdYrCVq4M4g==", "bifFE");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[222]] = lllIIlIllIllIII("+blTvI5lBvEXznunjaivbA==", "HODth");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[223]] = lllIIlIllIlIlll("KCcIPBQ7LxQnLiw=", "XNfWK");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[224]] = lllIIlIllIlIlll("IQQpExEuDDYGKzk=", "MmDvN");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[225]] = lllIIlIllIlIIll("gdWp1bqNd4LMHa61c7lthw==", "Rchkt");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[226]] = lllIIlIllIllIII("4iX1NmM9fcSorH2tnJIbTCinD5LStWV1", "WrwYE");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[227]] = lllIIlIllIlIlll("OBMrNzQhExMxOycCKSY=", "UrLRZ");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[228]] = lllIIlIllIllIII("8F6TvK3fQKQN8Go3Bi3vuQ==", "INdZD");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[229]] = lllIIlIllIllIII("G8f26vUqEHneSjS403+Hjg==", "bmgag");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[230]] = lllIIlIllIlIIll("xEMPfJYSSlQCmGopuLyTUg==", "AYSWK");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[231]] = lllIIlIllIllIII("O9uWZErgllY=", "CZwEW");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[232]] = lllIIlIllIlIIll("+ykGY4LU8BEVyJG4IxYfgQ==", "XDiNH");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[233]] = lllIIlIllIlIlll("PSU8Lx48FS8oADc=", "YJIMr");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[234]] = lllIIlIllIlIlll("JgsZEzQnOx4eKyc=", "BdlqX");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[235]] = lllIIlIllIlIIll("/jiY52ZvoJQ=", "nTWSE");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[236]] = lllIIlIllIllIII("FITPnz6N0Eg=", "RHJTu");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[237]] = lllIIlIllIllIII("2VYWsQOUn/KAYt5csb0piw==", "UIYwl");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[238]] = lllIIlIllIlIIll("3+DkB9FLI+UXSDwB11VY/Q==", "Jnkpq");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[239]] = lllIIlIllIlIlll("OzsuPCcsODUKOT4Law==", "YTYcW");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[240]] = lllIIlIllIllIII("gLO7UkRbKmI=", "gtqrj");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[241]] = lllIIlIllIllIII("UwGTelqnqOKodMovvjF6+w==", "Ztgmf");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[242]] = lllIIlIllIlIIll("Tlos+8haX3w+yKztgxSEtw==", "czPVI");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[243]] = lllIIlIllIlIIll("eeOyiKMdzJVdkv0UCEclMwLDzzL9Z9m0", "jZPbh");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[244]] = lllIIlIllIllIII("8oQwNhXQSW4=", "DbZKT");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[245]] = lllIIlIllIllIII("zQVcyaZbytE=", "uWTxD");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[246]] = lllIIlIllIllIII("FiI0fSnS2fdf5g80hDbJNg==", "RDCVR");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[247]] = lllIIlIllIlIlll("HT8BMQIfLA4kDw==", "mJgWg");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[248]] = lllIIlIllIllIII("cp0FuuDwSgwX++xsM5Ewrg==", "uJgSJ");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[249]] = lllIIlIllIlIIll("CS6lH0HKSvUzWPKhOQCSMg==", "MpgCU");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[250]] = lllIIlIllIllIII("+t/6nvbJYwtgZiqicu4oxA==", "CMpEG");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[251]] = lllIIlIllIlIIll("pxvdOOBFSZE=", "HRqDN");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[252]] = lllIIlIllIlIIll("5X7Xo/tvvzXqV+kJ5wYtog==", "GZHrD");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[253]] = lllIIlIllIlIlll("AxouMTgVDDwA", "gcKnZ");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[254]] = lllIIlIllIllIII("IRA1biEDPNLtYcZU6JaZEQ==", "ibxcx");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[255]] = lllIIlIllIlIlll("MD0VKhshNgAZDg==", "TDpuk");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[256]] = lllIIlIllIlIlll("LQkyERcwETk=", "IpWNt");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[257]] = lllIIlIllIlIlll("Jy8TJwMqOgAdAg==", "CVvxp");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[258]] = lllIIlIllIlIIll("eR1cLcZX87vddhJkGZK06w==", "upmOc");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[259]] = lllIIlIllIllIII("WRm832IrzZ7wsqV021uBiA==", "UcbWA");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[260]] = lllIIlIllIlIIll("0bsG8YjE0JCavAg788yBaA==", "upVTI");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[261]] = lllIIlIllIllIII("5MIyfwKkBTDIOAQHGlFRtw==", "kKsiP");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[262]] = lllIIlIllIlIIll("9FXGltgpAb9urkLOixlgKg==", "rSska");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[263]] = lllIIlIllIllIII("/9ao9XqX+Sf3i8dR2Cwdjg==", "nLmhf");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[264]] = lllIIlIllIlIIll("7R0a5lE/8FI3AyfVA3mFrg==", "goqId");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[265]] = lllIIlIllIlIlll("CBsjGgEECzIg", "lbFEv");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[266]] = lllIIlIllIlIIll("Sz+FLAyDJlRflhdnLk6C7Jqh2R4taSiQ", "Gqkxz");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[267]] = lllIIlIllIllIII("bOewUnhgVlg3Np3PEHqmFA==", "DJgfl");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[268]] = lllIIlIllIlIlll("CT8cPCAlJwI1IB8gBj4=", "zTiPL");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[269]] = lllIIlIllIlIlll("MA0ROSEcEQ0hJSYU", "CfdUM");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[270]] = lllIIlIllIlIlll("NiMTGyQaMgkaKiwt", "EHfwH");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[271]] = lllIIlIllIllIII("qgr+XJ3p0IHz7pbzEDtATA==", "rRKIr");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[272]] = lllIIlIllIllIII("5jxDeken5RBsO0/rTqN1rQ==", "XmgXO");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[273]] = lllIIlIllIlIIll("mHT0DFMSlzqP3YKdGLX4bw==", "rEYRq");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[274]] = lllIIlIllIlIIll("Hp8CWZGw5aLU2cztLYyKJQ==", "Rxlft");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[275]] = lllIIlIllIlIlll("FSgjFRYVJjo=", "zIHJr");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[276]] = lllIIlIllIlIIll("v7u2J5h9p2A=", "LNzTM");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[277]] = lllIIlIllIlIIll("i9dEM5Lip5pXo1fxCUoUDNdSTTB2aKmq", "GApEw");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[278]] = lllIIlIllIlIIll("JLAoR8fO7oBNxV3DfMJ1xUI89rGtIsiJngAsHm64Jac=", "Sciuw");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[279]] = lllIIlIllIllIII("65/oVF3cwziZZGagJTdfQg==", "JBZpt");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[280]] = lllIIlIllIlIIll("kuLZneLgkMwxhmudLrnF7KKeutNpikgF", "aQfIS");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[281]] = lllIIlIllIlIlll("BAQLNwcnClgpAS0IFGQIJh9CZA==", "ImxDn");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[282]] = lllIIlIllIllIII("5wHsZt2ZBagmhsX/VobMtg==", "AxFLu");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[283]] = lllIIlIllIllIII("YB2fUgkFIbiTz3hDvP14DdyzMWAMT/m8", "CXoSb");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[284]] = lllIIlIllIllIII("+aR5Hz48uBgSIE6Gsxk5pfk9OjdS0/UixKeWgps1DYc=", "nBVlt");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[285]] = lllIIlIllIlIlll("Uw==", "trEWp");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[286]] = lllIIlIllIlIlll("BwclLQwUCjI=", "wfWYe");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[287]] = lllIIlIllIllIII("dvAfeKiv/Mb/1WjLYJ3BIg==", "njoXD");
        ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[288]] = lllIIlIllIlIlll("BC01GRoXICI=", "tLGms");
    }
    
    private void registerVariant(final ModelBlockDefinition lllllllllllllIIIlIlIIllllIlllIlI, final ModelResourceLocation lllllllllllllIIIlIlIIllllIlllIIl) {
        this.variants.put(lllllllllllllIIIlIlIIllllIlllIIl, lllllllllllllIIIlIlIIllllIlllIlI.getVariants(lllllllllllllIIIlIlIIllllIlllIIl.getVariant()));
        "".length();
    }
    
    private static String lllIIlIllIllIII(final String lllllllllllllIIIlIlIIllIIIIlIIlI, final String lllllllllllllIIIlIlIIllIIIIlIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlIIllIIIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlIIllIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), ModelBakery.lIlIlIIIllIIII[9]), "DES");
            final Cipher lllllllllllllIIIlIlIIllIIIIlIlII = Cipher.getInstance("DES");
            lllllllllllllIIIlIlIIllIIIIlIlII.init(ModelBakery.lIlIlIIIllIIII[3], lllllllllllllIIIlIlIIllIIIIlIlIl);
            return new String(lllllllllllllIIIlIlIIllIIIIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlIIllIIIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlIIllIIIIlIIll) {
            lllllllllllllIIIlIlIIllIIIIlIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIlIllllIIlIl(final int lllllllllllllIIIlIlIIlIllllIlIlI) {
        return lllllllllllllIIIlIlIIlIllllIlIlI != 0;
    }
    
    private void loadVariants(final Collection<ModelResourceLocation> lllllllllllllIIIlIlIIlllllIIllII) {
        final boolean lllllllllllllIIIlIlIIlllllIIIlII = (boolean)lllllllllllllIIIlIlIIlllllIIllII.iterator();
        "".length();
        if ("   ".length() < "  ".length()) {
            return;
        }
        while (!lllIlIllllIIIll(((Iterator)lllllllllllllIIIlIlIIlllllIIIlII).hasNext() ? 1 : 0)) {
            final ModelResourceLocation lllllllllllllIIIlIlIIlllllIIlIll = ((Iterator<ModelResourceLocation>)lllllllllllllIIIlIlIIlllllIIIlII).next();
            try {
                final ModelBlockDefinition lllllllllllllIIIlIlIIlllllIIlIlI = this.getModelBlockDefinition(lllllllllllllIIIlIlIIlllllIIlIll);
                try {
                    this.registerVariant(lllllllllllllIIIlIlIIlllllIIlIlI, lllllllllllllIIIlIlIIlllllIIlIll);
                    "".length();
                    if (" ".length() > "  ".length()) {
                        return;
                    }
                    continue;
                }
                catch (Exception lllllllllllllIIIlIlIIlllllIIlIIl) {
                    ModelBakery.LOGGER.warn(String.valueOf(new StringBuilder(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[33]]).append(lllllllllllllIIIlIlIIlllllIIlIll.getVariant()).append(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[34]]).append(lllllllllllllIIIlIlIIlllllIIlIll)));
                    "".length();
                    if (-"  ".length() >= 0) {
                        return;
                    }
                    continue;
                }
            }
            catch (Exception lllllllllllllIIIlIlIIlllllIIlIII) {
                ModelBakery.LOGGER.warn(String.valueOf(new StringBuilder(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[35]]).append(lllllllllllllIIIlIlIIlllllIIlIll)), (Throwable)lllllllllllllIIIlIlIIlllllIIlIII);
            }
        }
    }
    
    private void loadVariantModels() {
        final float lllllllllllllIIIlIlIIllllIIIIlll = (float)this.variants.keySet().iterator();
        "".length();
        if (-"  ".length() > 0) {
            return;
        }
        while (!lllIlIllllIIIll(((Iterator)lllllllllllllIIIlIlIIllllIIIIlll).hasNext() ? 1 : 0)) {
            final ModelResourceLocation lllllllllllllIIIlIlIIllllIIIlllI = ((Iterator<ModelResourceLocation>)lllllllllllllIIIlIlIIllllIIIIlll).next();
            final short lllllllllllllIIIlIlIIllllIIIIlIl = (short)this.variants.get(lllllllllllllIIIlIlIIllllIIIlllI).getVariants().iterator();
            "".length();
            if ((0x47 ^ 0x26 ^ (0xD8 ^ 0xBD)) < -" ".length()) {
                return;
            }
            while (!lllIlIllllIIIll(((Iterator)lllllllllllllIIIlIlIIllllIIIIlIl).hasNext() ? 1 : 0)) {
                final ModelBlockDefinition.Variant lllllllllllllIIIlIlIIllllIIIllIl = ((Iterator<ModelBlockDefinition.Variant>)lllllllllllllIIIlIlIIllllIIIIlIl).next();
                final ResourceLocation lllllllllllllIIIlIlIIllllIIIllII = lllllllllllllIIIlIlIIllllIIIllIl.getModelLocation();
                if (lllIlIllllIIlII(this.models.get(lllllllllllllIIIlIlIIllllIIIllII))) {
                    try {
                        final ModelBlock lllllllllllllIIIlIlIIllllIIIlIll = this.loadModel(lllllllllllllIIIlIlIIllllIIIllII);
                        this.models.put(lllllllllllllIIIlIlIIllllIIIllII, lllllllllllllIIIlIlIIllllIIIlIll);
                        "".length();
                        "".length();
                        if (((102 + 150 - 135 + 41 ^ 76 + 58 - 132 + 179) & (0xE9 ^ 0xAD ^ (0x70 ^ 0x1F) ^ -" ".length())) != 0x0) {
                            return;
                        }
                        continue;
                    }
                    catch (Exception lllllllllllllIIIlIlIIllllIIIlIlI) {
                        ModelBakery.LOGGER.warn(String.valueOf(new StringBuilder(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[43]]).append(lllllllllllllIIIlIlIIllllIIIllII).append(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[44]]).append(lllllllllllllIIIlIlIIllllIIIlllI).append(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[45]])), (Throwable)lllllllllllllIIIlIlIIllllIIIlIlI);
                    }
                }
            }
        }
    }
    
    private void loadItemModels() {
        this.registerVariantNames();
        final long lllllllllllllIIIlIlIIlllIlIlIllI = (long)Item.itemRegistry.iterator();
        "".length();
        if ("   ".length() < 0) {
            return;
        }
        while (!lllIlIllllIIIll(((Iterator)lllllllllllllIIIlIlIIlllIlIlIllI).hasNext() ? 1 : 0)) {
            final Item lllllllllllllIIIlIlIIlllIlIlllIl = ((Iterator<Item>)lllllllllllllIIIlIlIIlllIlIlIllI).next();
            final short lllllllllllllIIIlIlIIlllIlIlIlII = (short)this.getVariantNames(lllllllllllllIIIlIlIIlllIlIlllIl).iterator();
            "".length();
            if (null != null) {
                return;
            }
            while (!lllIlIllllIIIll(((Iterator)lllllllllllllIIIlIlIIlllIlIlIlII).hasNext() ? 1 : 0)) {
                final String lllllllllllllIIIlIlIIlllIlIlllII = ((Iterator<String>)lllllllllllllIIIlIlIIlllIlIlIlII).next();
                final ResourceLocation lllllllllllllIIIlIlIIlllIlIllIll = this.getItemLocation(lllllllllllllIIIlIlIIlllIlIlllII);
                this.itemLocations.put(lllllllllllllIIIlIlIIlllIlIlllII, lllllllllllllIIIlIlIIlllIlIllIll);
                "".length();
                if (lllIlIllllIIlII(this.models.get(lllllllllllllIIIlIlIIlllIlIllIll))) {
                    try {
                        final ModelBlock lllllllllllllIIIlIlIIlllIlIllIlI = this.loadModel(lllllllllllllIIIlIlIIlllIlIllIll);
                        this.models.put(lllllllllllllIIIlIlIIlllIlIllIll, lllllllllllllIIIlIlIIlllIlIllIlI);
                        "".length();
                        "".length();
                        if ((0x17 ^ 0x12) == 0x0) {
                            return;
                        }
                        continue;
                    }
                    catch (Exception lllllllllllllIIIlIlIIlllIlIllIIl) {
                        ModelBakery.LOGGER.warn(String.valueOf(new StringBuilder(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[54]]).append(lllllllllllllIIIlIlIIlllIlIllIll).append(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[55]]).append(Item.itemRegistry.getNameForObject(lllllllllllllIIIlIlIIlllIlIlllIl)).append(ModelBakery.lIlIIlIIllIlll[ModelBakery.lIlIlIIIllIIII[56]])), (Throwable)lllllllllllllIIIlIlIIlllIlIllIIl);
                    }
                }
            }
        }
    }
    
    private void loadModelsCheck() {
        this.loadModels();
        final boolean lllllllllllllIIIlIlIIllIllIIIIII = (boolean)this.models.values().iterator();
        "".length();
        if ((0xD ^ 0x19 ^ (0xD7 ^ 0xC7)) != (0xE8 ^ 0x9F ^ (0x30 ^ 0x43))) {
            return;
        }
        while (!lllIlIllllIIIll(((Iterator)lllllllllllllIIIlIlIIllIllIIIIII).hasNext() ? 1 : 0)) {
            final ModelBlock lllllllllllllIIIlIlIIllIllIIIIll = ((Iterator<ModelBlock>)lllllllllllllIIIlIlIIllIllIIIIII).next();
            lllllllllllllIIIlIlIIllIllIIIIll.getParentFromMap(this.models);
        }
        ModelBlock.checkModelHierarchy(this.models);
    }
}
