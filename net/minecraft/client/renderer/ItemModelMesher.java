// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import java.util.Iterator;
import com.google.common.collect.Maps;
import net.minecraft.item.ItemStack;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import java.util.Map;

public class ItemModelMesher
{
    private final /* synthetic */ Map<Item, ItemMeshDefinition> shapers;
    private static final /* synthetic */ int[] lIIlIIlIlllIll;
    private final /* synthetic */ Map<Integer, ModelResourceLocation> simpleShapes;
    private final /* synthetic */ ModelManager modelManager;
    private final /* synthetic */ Map<Integer, IBakedModel> simpleShapesCache;
    
    private static boolean llIIllIllIIIlIl(final int lllllllllllllIIllIllIlllIlllllIl) {
        return lllllllllllllIIllIllIlllIlllllIl != 0;
    }
    
    protected IBakedModel getItemModel(final Item lllllllllllllIIllIllIllllIlIlIll, final int lllllllllllllIIllIllIllllIlIlIlI) {
        return this.simpleShapesCache.get(this.getIndex(lllllllllllllIIllIllIllllIlIlIll, lllllllllllllIIllIllIllllIlIlIlI));
    }
    
    private static boolean llIIllIllIIIlII(final Object lllllllllllllIIllIllIllllIIIIIIl) {
        return lllllllllllllIIllIllIllllIIIIIIl != null;
    }
    
    public void register(final Item lllllllllllllIIllIllIllllIIlllIl, final int lllllllllllllIIllIllIllllIIlllII, final ModelResourceLocation lllllllllllllIIllIllIllllIIlIlll) {
        this.simpleShapes.put(this.getIndex(lllllllllllllIIllIllIllllIIlllIl, lllllllllllllIIllIllIllllIIlllII), lllllllllllllIIllIllIllllIIlIlll);
        "".length();
        this.simpleShapesCache.put(this.getIndex(lllllllllllllIIllIllIllllIIlllIl, lllllllllllllIIllIllIllllIIlllII), this.modelManager.getModel(lllllllllllllIIllIllIllllIIlIlll));
        "".length();
    }
    
    static {
        llIIllIllIIIIlI();
    }
    
    private static void llIIllIllIIIIlI() {
        (lIIlIIlIlllIll = new int[3])[0] = ((0x3E ^ 0x6E) & ~(0xF8 ^ 0xA8));
        ItemModelMesher.lIIlIIlIlllIll[1] = " ".length();
        ItemModelMesher.lIIlIIlIlllIll[2] = (0x71 ^ 0x61);
    }
    
    public TextureAtlasSprite getParticleIcon(final Item lllllllllllllIIllIllIlllllIIllll) {
        return this.getParticleIcon(lllllllllllllIIllIllIlllllIIllll, ItemModelMesher.lIIlIIlIlllIll[0]);
    }
    
    protected int getMetadata(final ItemStack lllllllllllllIIllIllIllllIllIIll) {
        int metadata;
        if (llIIllIllIIIlIl(lllllllllllllIIllIllIllllIllIIll.isItemStackDamageable() ? 1 : 0)) {
            metadata = ItemModelMesher.lIIlIIlIlllIll[0];
            "".length();
            if (" ".length() < 0) {
                return (0x30 ^ 0x69) & ~(0xDF ^ 0x86);
            }
        }
        else {
            metadata = lllllllllllllIIllIllIllllIllIIll.getMetadata();
        }
        return metadata;
    }
    
    private static boolean llIIllIllIIIllI(final int lllllllllllllIIllIllIlllIllllIll) {
        return lllllllllllllIIllIllIlllIllllIll == 0;
    }
    
    public IBakedModel getItemModel(final ItemStack lllllllllllllIIllIllIllllIllllll) {
        final Item lllllllllllllIIllIllIllllIlllllI = lllllllllllllIIllIllIllllIllllll.getItem();
        IBakedModel lllllllllllllIIllIllIllllIllllIl = this.getItemModel(lllllllllllllIIllIllIllllIlllllI, this.getMetadata(lllllllllllllIIllIllIllllIllllll));
        if (llIIllIllIIIIll(lllllllllllllIIllIllIllllIllllIl)) {
            final ItemMeshDefinition lllllllllllllIIllIllIllllIllllII = this.shapers.get(lllllllllllllIIllIllIllllIlllllI);
            if (llIIllIllIIIlII(lllllllllllllIIllIllIllllIllllII)) {
                lllllllllllllIIllIllIllllIllllIl = this.modelManager.getModel(lllllllllllllIIllIllIllllIllllII.getModelLocation(lllllllllllllIIllIllIllllIllllll));
            }
        }
        if (llIIllIllIIIIll(lllllllllllllIIllIllIllllIllllIl)) {
            lllllllllllllIIllIllIllllIllllIl = this.modelManager.getMissingModel();
        }
        return lllllllllllllIIllIllIllllIllllIl;
    }
    
    public ModelManager getModelManager() {
        return this.modelManager;
    }
    
    public void register(final Item lllllllllllllIIllIllIllllIIIllll, final ItemMeshDefinition lllllllllllllIIllIllIllllIIlIIIl) {
        this.shapers.put(lllllllllllllIIllIllIllllIIIllll, lllllllllllllIIllIllIllllIIlIIIl);
        "".length();
    }
    
    public ItemModelMesher(final ModelManager lllllllllllllIIllIllIlllllIlIlIl) {
        this.simpleShapes = (Map<Integer, ModelResourceLocation>)Maps.newHashMap();
        this.simpleShapesCache = (Map<Integer, IBakedModel>)Maps.newHashMap();
        this.shapers = (Map<Item, ItemMeshDefinition>)Maps.newHashMap();
        this.modelManager = lllllllllllllIIllIllIlllllIlIlIl;
    }
    
    public void rebuildCache() {
        this.simpleShapesCache.clear();
        final long lllllllllllllIIllIllIllllIIIIIll = (long)this.simpleShapes.entrySet().iterator();
        "".length();
        if (-" ".length() != -" ".length()) {
            return;
        }
        while (!llIIllIllIIIllI(((Iterator)lllllllllllllIIllIllIllllIIIIIll).hasNext() ? 1 : 0)) {
            final Map.Entry<Integer, ModelResourceLocation> lllllllllllllIIllIllIllllIIIIllI = ((Iterator<Map.Entry<Integer, ModelResourceLocation>>)lllllllllllllIIllIllIllllIIIIIll).next();
            this.simpleShapesCache.put(lllllllllllllIIllIllIllllIIIIllI.getKey(), this.modelManager.getModel(lllllllllllllIIllIllIllllIIIIllI.getValue()));
            "".length();
        }
    }
    
    public TextureAtlasSprite getParticleIcon(final Item lllllllllllllIIllIllIlllllIIlIlI, final int lllllllllllllIIllIllIlllllIIIllI) {
        return this.getItemModel(new ItemStack(lllllllllllllIIllIllIlllllIIlIlI, ItemModelMesher.lIIlIIlIlllIll[1], lllllllllllllIIllIllIlllllIIIllI)).getParticleTexture();
    }
    
    private int getIndex(final Item lllllllllllllIIllIllIllllIlIIlII, final int lllllllllllllIIllIllIllllIlIIlIl) {
        return Item.getIdFromItem(lllllllllllllIIllIllIllllIlIIlII) << ItemModelMesher.lIIlIIlIlllIll[2] | lllllllllllllIIllIllIllllIlIIlIl;
    }
    
    private static boolean llIIllIllIIIIll(final Object lllllllllllllIIllIllIlllIlllllll) {
        return lllllllllllllIIllIllIlllIlllllll == null;
    }
}
