// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import java.util.Iterator;
import net.minecraft.block.BlockDirt;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.BlockStem;
import net.minecraft.block.BlockQuartz;
import java.util.Arrays;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.block.BlockFlowerPot;
import net.minecraft.block.BlockHopper;
import net.minecraft.block.BlockSand;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.BlockNewLog;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockDropper;
import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.BlockSilverfish;
import net.minecraft.block.BlockStoneSlabNew;
import net.minecraft.block.BlockStoneSlab;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.BlockRedSandstone;
import net.minecraft.block.BlockSandStone;
import net.minecraft.block.BlockColored;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.block.BlockFire;
import net.minecraft.block.BlockTNT;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockTripWire;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockWall;
import net.minecraft.block.BlockCommandBlock;
import net.minecraft.block.BlockJukebox;
import net.minecraft.block.BlockReed;
import net.minecraft.block.BlockCactus;
import net.minecraft.block.BlockNewLeaf;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockPrismarine;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockStone;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.init.Blocks;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.ModelResourceLocation;
import com.google.common.collect.Maps;
import net.minecraft.client.renderer.block.statemap.IStateMapper;
import net.minecraft.block.Block;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.renderer.block.statemap.BlockStateMapper;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.block.state.IBlockState;
import java.util.Map;
import net.minecraft.client.resources.model.ModelManager;

public class BlockModelShapes
{
    private final /* synthetic */ ModelManager modelManager;
    private static final /* synthetic */ String[] lIlllllIIllIll;
    private final /* synthetic */ Map<IBlockState, IBakedModel> bakedModelStore;
    private final /* synthetic */ BlockStateMapper blockStateMapper;
    private static final /* synthetic */ int[] lIlllllIIllllI;
    
    private static void lIIIIlIlIlIlIIlI() {
        (lIlllllIIllIll = new String[BlockModelShapes.lIlllllIIllllI[23]])[BlockModelShapes.lIlllllIIllllI[0]] = lIIIIlIlIlIIIlIl("pt1u6M4GvFdl7ZFC8q9Fqj4RFQt9nUpaFzR0O1HdUuA=", "rtGbd");
        BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[1]] = lIIIIlIlIlIIlIII("dMrvE3XSlg/4U2CgN7GDLfz1zvyI1hdhUA2u8KVTfSI=", "llbqa");
        BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[2]] = lIIIIlIlIlIIIlIl("QpcPWe/2gnjajxmBfL0O5Ql6B979Okn70n7AXbyjGU0=", "YAiEI");
        BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[3]] = lIIIIlIlIlIlIIIl("IBAPKRU/GAc4TC8VDi8dPlYWLQIoCz4/AiQVDQ==", "MyaLv");
        BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[4]] = lIIIIlIlIlIIIlIl("Hanhv7qJHv5UAkffvVDgB6oMnPmIzhFfST0HJ7YZ8KE=", "xlgYK");
        BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[5]] = lIIIIlIlIlIlIIIl("JhsNLws5EwU+UiIGBicbZBACOBoiFxE=", "KrcJh");
        BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[7]] = lIIIIlIlIlIIIlIl("PyjPMpKijm4=", "VRGlZ");
        BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[8]] = lIIIIlIlIlIIIlIl("lPo0g5hxeLI=", "MZoZI");
        BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[9]] = lIIIIlIlIlIIIlIl("NaX6CN57Sww=", "JLkis");
        BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[10]] = lIIIIlIlIlIIIlIl("JDXhuwlyV99PoXRoR1U9vQ==", "eyqFy");
        BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[11]] = lIIIIlIlIlIIIlIl("wP94+iTViJg=", "Dsxhk");
        BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[12]] = lIIIIlIlIlIlIIIl("HiQcHSg=", "ASsrD");
        BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[13]] = lIIIIlIlIlIIIlIl("awY2HwoHJXU=", "CYuaw");
        BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[14]] = lIIIIlIlIlIIIlIl("oZEt0PQZlIi0T1Xgg+/vp4vOCeanDhpy", "efaeM");
        BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[15]] = lIIIIlIlIlIIlIII("17uwg0gJNtFGvY8AmJD5Z9rV+EE6JpwE", "XXgGV");
        BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[16]] = lIIIIlIlIlIIIlIl("pXIjUi3Fk7jRxYyPVsg+xg==", "LoDaO");
        BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[6]] = lIIIIlIlIlIIIlIl("05ch9KKMuCc=", "kGEfM");
        BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[17]] = lIIIIlIlIlIIIlIl("qCmjJPTJRfU=", "ccypi");
        BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[18]] = lIIIIlIlIlIlIIIl("Ny4rDRkcJjY8Dw8k", "hCDcj");
        BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[19]] = lIIIIlIlIlIIlIII("ad6k2I2AX4k=", "DlhwQ");
        BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[20]] = lIIIIlIlIlIlIIIl("CQICIw==", "VnmDa");
        BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[21]] = lIIIIlIlIlIlIIIl("OBUuBzoMFg==", "geBfT");
        BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[22]] = lIIIIlIlIlIlIIIl("BRcPKR0zCgk=", "ZdnYq");
    }
    
    public IBakedModel getModelForState(final IBlockState llllllllllllIllllIIllIlIllIlIIII) {
        IBakedModel llllllllllllIllllIIllIlIllIlIIlI = this.bakedModelStore.get(llllllllllllIllllIIllIlIllIlIIII);
        if (lIIIIlIlIlIlllII(llllllllllllIllllIIllIlIllIlIIlI)) {
            llllllllllllIllllIIllIlIllIlIIlI = this.modelManager.getMissingModel();
        }
        return llllllllllllIllllIIllIlIllIlIIlI;
    }
    
    private static void lIIIIlIlIlIllIII() {
        (lIlllllIIllllI = new int[24])[0] = ((0xB9 ^ 0x81) & ~(0x6C ^ 0x54) & ~((0xB6 ^ 0xB8) & ~(0x7 ^ 0x9)));
        BlockModelShapes.lIlllllIIllllI[1] = " ".length();
        BlockModelShapes.lIlllllIIllllI[2] = "  ".length();
        BlockModelShapes.lIlllllIIllllI[3] = "   ".length();
        BlockModelShapes.lIlllllIIllllI[4] = (0x19 ^ 0x38 ^ (0x9D ^ 0xB8));
        BlockModelShapes.lIlllllIIllllI[5] = (0x1B ^ 0x4D ^ (0xE5 ^ 0xB6));
        BlockModelShapes.lIlllllIIllllI[6] = (0x56 ^ 0x1A ^ (0x19 ^ 0x45));
        BlockModelShapes.lIlllllIIllllI[7] = (0x11 ^ 0x1A ^ (0x40 ^ 0x4D));
        BlockModelShapes.lIlllllIIllllI[8] = (0x2 ^ 0x5);
        BlockModelShapes.lIlllllIIllllI[9] = (0x53 ^ 0x5B);
        BlockModelShapes.lIlllllIIllllI[10] = (0xA7 ^ 0xAE);
        BlockModelShapes.lIlllllIIllllI[11] = (0xCB ^ 0xC1);
        BlockModelShapes.lIlllllIIllllI[12] = (0x6A ^ 0x3B ^ (0x1B ^ 0x41));
        BlockModelShapes.lIlllllIIllllI[13] = (0x32 ^ 0x77 ^ (0xDB ^ 0x92));
        BlockModelShapes.lIlllllIIllllI[14] = (0x8 ^ 0x5C ^ (0x6C ^ 0x35));
        BlockModelShapes.lIlllllIIllllI[15] = (0x2B ^ 0x62 ^ (0x25 ^ 0x62));
        BlockModelShapes.lIlllllIIllllI[16] = (0x3D ^ 0x53 ^ (0x3A ^ 0x5B));
        BlockModelShapes.lIlllllIIllllI[17] = (0x49 ^ 0x76 ^ (0x8C ^ 0xA2));
        BlockModelShapes.lIlllllIIllllI[18] = (0x96 ^ 0x81 ^ (0x9B ^ 0x9E));
        BlockModelShapes.lIlllllIIllllI[19] = (0x31 ^ 0x22);
        BlockModelShapes.lIlllllIIllllI[20] = (0x55 ^ 0x41);
        BlockModelShapes.lIlllllIIllllI[21] = (0x16 ^ 0x64 ^ (0x12 ^ 0x75));
        BlockModelShapes.lIlllllIIllllI[22] = (0x78 ^ 0x21 ^ (0x53 ^ 0x1C));
        BlockModelShapes.lIlllllIIllllI[23] = (71 + 117 - 121 + 103 ^ 181 + 109 - 286 + 185);
    }
    
    private static String lIIIIlIlIlIIIlIl(final String llllllllllllIllllIIllIlIlIIIIIll, final String llllllllllllIllllIIllIlIlIIIIIlI) {
        try {
            final SecretKeySpec llllllllllllIllllIIllIlIlIIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIllIlIlIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIllIlIlIIIIlll = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIllIlIlIIIIlll.init(BlockModelShapes.lIlllllIIllllI[2], llllllllllllIllllIIllIlIlIIIlIII);
            return new String(llllllllllllIllllIIllIlIlIIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIllIlIlIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIllIlIlIIIIllI) {
            llllllllllllIllllIIllIlIlIIIIllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIlIlIlIlllII(final Object llllllllllllIllllIIllIlIIlllIIII) {
        return llllllllllllIllllIIllIlIIlllIIII == null;
    }
    
    static {
        lIIIIlIlIlIllIII();
        lIIIIlIlIlIlIIlI();
    }
    
    public BlockStateMapper getBlockStateMapper() {
        return this.blockStateMapper;
    }
    
    public ModelManager getModelManager() {
        return this.modelManager;
    }
    
    public void registerBlockWithStateMapper(final Block llllllllllllIllllIIllIlIlIllllll, final IStateMapper llllllllllllIllllIIllIlIlIlllIll) {
        this.blockStateMapper.registerBlockStateMapper(llllllllllllIllllIIllIlIlIllllll, llllllllllllIllllIIllIlIlIlllIll);
    }
    
    private static boolean lIIIIlIlIlIllIIl(final Object llllllllllllIllllIIllIlIIlllIllI) {
        return llllllllllllIllllIIllIlIIlllIllI != null;
    }
    
    public void registerBuiltInBlocks(final Block... llllllllllllIllllIIllIlIlIllIlll) {
        this.blockStateMapper.registerBuiltInBlocks(llllllllllllIllllIIllIlIlIllIlll);
    }
    
    private static boolean lIIIIlIlIlIllIlI(final Object llllllllllllIllllIIllIlIIlllIIll, final Object llllllllllllIllllIIllIlIIlllIIlI) {
        return llllllllllllIllllIIllIlIIlllIIll == llllllllllllIllllIIllIlIIlllIIlI;
    }
    
    public BlockModelShapes(final ModelManager llllllllllllIllllIIllIlIlllIlIIl) {
        this.bakedModelStore = (Map<IBlockState, IBakedModel>)Maps.newIdentityHashMap();
        this.blockStateMapper = new BlockStateMapper();
        this.modelManager = llllllllllllIllllIIllIlIlllIlIIl;
        this.registerAllBlocks();
    }
    
    public void reloadModels() {
        this.bakedModelStore.clear();
        final long llllllllllllIllllIIllIlIllIIIlII = (long)this.blockStateMapper.putAllStateModelLocations().entrySet().iterator();
        "".length();
        if (((0x98 ^ 0x90) & ~(0x49 ^ 0x41)) != ((0x4D ^ 0x7F) & ~(0x63 ^ 0x51))) {
            return;
        }
        while (!lIIIIlIlIlIlllIl(((Iterator)llllllllllllIllllIIllIlIllIIIlII).hasNext() ? 1 : 0)) {
            final Map.Entry<IBlockState, ModelResourceLocation> llllllllllllIllllIIllIlIllIIIlll = ((Iterator<Map.Entry<IBlockState, ModelResourceLocation>>)llllllllllllIllllIIllIlIllIIIlII).next();
            this.bakedModelStore.put(llllllllllllIllllIIllIlIllIIIlll.getKey(), this.modelManager.getModel(llllllllllllIllllIIllIlIllIIIlll.getValue()));
            "".length();
        }
    }
    
    public TextureAtlasSprite getTexture(final IBlockState llllllllllllIllllIIllIlIllIllIlI) {
        final Block llllllllllllIllllIIllIlIllIlllIl = llllllllllllIllllIIllIlIllIllIlI.getBlock();
        IBakedModel llllllllllllIllllIIllIlIllIlllII = this.getModelForState(llllllllllllIllllIIllIlIllIllIlI);
        if (!lIIIIlIlIlIllIIl(llllllllllllIllllIIllIlIllIlllII) || lIIIIlIlIlIllIlI(llllllllllllIllllIIllIlIllIlllII, this.modelManager.getMissingModel())) {
            if (!lIIIIlIlIlIllIll(llllllllllllIllllIIllIlIllIlllIl, Blocks.wall_sign) || !lIIIIlIlIlIllIll(llllllllllllIllllIIllIlIllIlllIl, Blocks.standing_sign) || !lIIIIlIlIlIllIll(llllllllllllIllllIIllIlIllIlllIl, Blocks.chest) || !lIIIIlIlIlIllIll(llllllllllllIllllIIllIlIllIlllIl, Blocks.trapped_chest) || !lIIIIlIlIlIllIll(llllllllllllIllllIIllIlIllIlllIl, Blocks.standing_banner) || lIIIIlIlIlIllIlI(llllllllllllIllllIIllIlIllIlllIl, Blocks.wall_banner)) {
                return this.modelManager.getTextureMap().getAtlasSprite(BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[0]]);
            }
            if (lIIIIlIlIlIllIlI(llllllllllllIllllIIllIlIllIlllIl, Blocks.ender_chest)) {
                return this.modelManager.getTextureMap().getAtlasSprite(BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[1]]);
            }
            if (!lIIIIlIlIlIllIll(llllllllllllIllllIIllIlIllIlllIl, Blocks.flowing_lava) || lIIIIlIlIlIllIlI(llllllllllllIllllIIllIlIllIlllIl, Blocks.lava)) {
                return this.modelManager.getTextureMap().getAtlasSprite(BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[2]]);
            }
            if (!lIIIIlIlIlIllIll(llllllllllllIllllIIllIlIllIlllIl, Blocks.flowing_water) || lIIIIlIlIlIllIlI(llllllllllllIllllIIllIlIllIlllIl, Blocks.water)) {
                return this.modelManager.getTextureMap().getAtlasSprite(BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[3]]);
            }
            if (lIIIIlIlIlIllIlI(llllllllllllIllllIIllIlIllIlllIl, Blocks.skull)) {
                return this.modelManager.getTextureMap().getAtlasSprite(BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[4]]);
            }
            if (lIIIIlIlIlIllIlI(llllllllllllIllllIIllIlIllIlllIl, Blocks.barrier)) {
                return this.modelManager.getTextureMap().getAtlasSprite(BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[5]]);
            }
        }
        if (lIIIIlIlIlIlllII(llllllllllllIllllIIllIlIllIlllII)) {
            llllllllllllIllllIIllIlIllIlllII = this.modelManager.getMissingModel();
        }
        return llllllllllllIllllIIllIlIllIlllII.getParticleTexture();
    }
    
    private static boolean lIIIIlIlIlIllIll(final Object llllllllllllIllllIIllIlIIllllIIl, final Object llllllllllllIllllIIllIlIIllllIII) {
        return llllllllllllIllllIIllIlIIllllIIl != llllllllllllIllllIIllIlIIllllIII;
    }
    
    private void registerAllBlocks() {
        final Block[] llllllllllllIllllIIllIlIlIllIlll = new Block[BlockModelShapes.lIlllllIIllllI[6]];
        llllllllllllIllllIIllIlIlIllIlll[BlockModelShapes.lIlllllIIllllI[0]] = Blocks.air;
        llllllllllllIllllIIllIlIlIllIlll[BlockModelShapes.lIlllllIIllllI[1]] = Blocks.flowing_water;
        llllllllllllIllllIIllIlIlIllIlll[BlockModelShapes.lIlllllIIllllI[2]] = Blocks.water;
        llllllllllllIllllIIllIlIlIllIlll[BlockModelShapes.lIlllllIIllllI[3]] = Blocks.flowing_lava;
        llllllllllllIllllIIllIlIlIllIlll[BlockModelShapes.lIlllllIIllllI[4]] = Blocks.lava;
        llllllllllllIllllIIllIlIlIllIlll[BlockModelShapes.lIlllllIIllllI[5]] = Blocks.piston_extension;
        llllllllllllIllllIIllIlIlIllIlll[BlockModelShapes.lIlllllIIllllI[7]] = Blocks.chest;
        llllllllllllIllllIIllIlIlIllIlll[BlockModelShapes.lIlllllIIllllI[8]] = Blocks.ender_chest;
        llllllllllllIllllIIllIlIlIllIlll[BlockModelShapes.lIlllllIIllllI[9]] = Blocks.trapped_chest;
        llllllllllllIllllIIllIlIlIllIlll[BlockModelShapes.lIlllllIIllllI[10]] = Blocks.standing_sign;
        llllllllllllIllllIIllIlIlIllIlll[BlockModelShapes.lIlllllIIllllI[11]] = Blocks.skull;
        llllllllllllIllllIIllIlIlIllIlll[BlockModelShapes.lIlllllIIllllI[12]] = Blocks.end_portal;
        llllllllllllIllllIIllIlIlIllIlll[BlockModelShapes.lIlllllIIllllI[13]] = Blocks.barrier;
        llllllllllllIllllIIllIlIlIllIlll[BlockModelShapes.lIlllllIIllllI[14]] = Blocks.wall_sign;
        llllllllllllIllllIIllIlIlIllIlll[BlockModelShapes.lIlllllIIllllI[15]] = Blocks.wall_banner;
        llllllllllllIllllIIllIlIlIllIlll[BlockModelShapes.lIlllllIIllllI[16]] = Blocks.standing_banner;
        this.registerBuiltInBlocks(llllllllllllIllllIIllIlIlIllIlll);
        this.registerBlockWithStateMapper(Blocks.stone, new StateMap.Builder().withName(BlockStone.VARIANT).build());
        this.registerBlockWithStateMapper(Blocks.prismarine, new StateMap.Builder().withName(BlockPrismarine.VARIANT).build());
        final BlockLeaves leaves = Blocks.leaves;
        final StateMap.Builder withSuffix = new StateMap.Builder().withName(BlockOldLeaf.VARIANT).withSuffix(BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[7]]);
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII = new IProperty[BlockModelShapes.lIlllllIIllllI[2]];
        llllllllllllIlllIIIIIllIIlllIIII[BlockModelShapes.lIlllllIIllllI[0]] = BlockLeaves.CHECK_DECAY;
        llllllllllllIlllIIIIIllIIlllIIII[BlockModelShapes.lIlllllIIllllI[1]] = BlockLeaves.DECAYABLE;
        this.registerBlockWithStateMapper(leaves, withSuffix.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII).build());
        final BlockLeaves leaves2 = Blocks.leaves2;
        final StateMap.Builder withSuffix2 = new StateMap.Builder().withName(BlockNewLeaf.VARIANT).withSuffix(BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[8]]);
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII2 = new IProperty[BlockModelShapes.lIlllllIIllllI[2]];
        llllllllllllIlllIIIIIllIIlllIIII2[BlockModelShapes.lIlllllIIllllI[0]] = BlockLeaves.CHECK_DECAY;
        llllllllllllIlllIIIIIllIIlllIIII2[BlockModelShapes.lIlllllIIllllI[1]] = BlockLeaves.DECAYABLE;
        this.registerBlockWithStateMapper(leaves2, withSuffix2.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII2).build());
        final BlockCactus cactus = Blocks.cactus;
        final StateMap.Builder builder = new StateMap.Builder();
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII3 = new IProperty[BlockModelShapes.lIlllllIIllllI[1]];
        llllllllllllIlllIIIIIllIIlllIIII3[BlockModelShapes.lIlllllIIllllI[0]] = BlockCactus.AGE;
        this.registerBlockWithStateMapper(cactus, builder.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII3).build());
        final BlockReed reeds = Blocks.reeds;
        final StateMap.Builder builder2 = new StateMap.Builder();
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII4 = new IProperty[BlockModelShapes.lIlllllIIllllI[1]];
        llllllllllllIlllIIIIIllIIlllIIII4[BlockModelShapes.lIlllllIIllllI[0]] = BlockReed.AGE;
        this.registerBlockWithStateMapper(reeds, builder2.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII4).build());
        final Block jukebox = Blocks.jukebox;
        final StateMap.Builder builder3 = new StateMap.Builder();
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII5 = new IProperty[BlockModelShapes.lIlllllIIllllI[1]];
        llllllllllllIlllIIIIIllIIlllIIII5[BlockModelShapes.lIlllllIIllllI[0]] = BlockJukebox.HAS_RECORD;
        this.registerBlockWithStateMapper(jukebox, builder3.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII5).build());
        final Block command_block = Blocks.command_block;
        final StateMap.Builder builder4 = new StateMap.Builder();
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII6 = new IProperty[BlockModelShapes.lIlllllIIllllI[1]];
        llllllllllllIlllIIIIIllIIlllIIII6[BlockModelShapes.lIlllllIIllllI[0]] = BlockCommandBlock.TRIGGERED;
        this.registerBlockWithStateMapper(command_block, builder4.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII6).build());
        this.registerBlockWithStateMapper(Blocks.cobblestone_wall, new StateMap.Builder().withName(BlockWall.VARIANT).withSuffix(BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[9]]).build());
        final BlockDoublePlant double_plant = Blocks.double_plant;
        final StateMap.Builder withName = new StateMap.Builder().withName(BlockDoublePlant.VARIANT);
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII7 = new IProperty[BlockModelShapes.lIlllllIIllllI[1]];
        llllllllllllIlllIIIIIllIIlllIIII7[BlockModelShapes.lIlllllIIllllI[0]] = BlockDoublePlant.field_181084_N;
        this.registerBlockWithStateMapper(double_plant, withName.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII7).build());
        final Block oak_fence_gate = Blocks.oak_fence_gate;
        final StateMap.Builder builder5 = new StateMap.Builder();
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII8 = new IProperty[BlockModelShapes.lIlllllIIllllI[1]];
        llllllllllllIlllIIIIIllIIlllIIII8[BlockModelShapes.lIlllllIIllllI[0]] = BlockFenceGate.POWERED;
        this.registerBlockWithStateMapper(oak_fence_gate, builder5.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII8).build());
        final Block spruce_fence_gate = Blocks.spruce_fence_gate;
        final StateMap.Builder builder6 = new StateMap.Builder();
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII9 = new IProperty[BlockModelShapes.lIlllllIIllllI[1]];
        llllllllllllIlllIIIIIllIIlllIIII9[BlockModelShapes.lIlllllIIllllI[0]] = BlockFenceGate.POWERED;
        this.registerBlockWithStateMapper(spruce_fence_gate, builder6.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII9).build());
        final Block birch_fence_gate = Blocks.birch_fence_gate;
        final StateMap.Builder builder7 = new StateMap.Builder();
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII10 = new IProperty[BlockModelShapes.lIlllllIIllllI[1]];
        llllllllllllIlllIIIIIllIIlllIIII10[BlockModelShapes.lIlllllIIllllI[0]] = BlockFenceGate.POWERED;
        this.registerBlockWithStateMapper(birch_fence_gate, builder7.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII10).build());
        final Block jungle_fence_gate = Blocks.jungle_fence_gate;
        final StateMap.Builder builder8 = new StateMap.Builder();
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII11 = new IProperty[BlockModelShapes.lIlllllIIllllI[1]];
        llllllllllllIlllIIIIIllIIlllIIII11[BlockModelShapes.lIlllllIIllllI[0]] = BlockFenceGate.POWERED;
        this.registerBlockWithStateMapper(jungle_fence_gate, builder8.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII11).build());
        final Block dark_oak_fence_gate = Blocks.dark_oak_fence_gate;
        final StateMap.Builder builder9 = new StateMap.Builder();
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII12 = new IProperty[BlockModelShapes.lIlllllIIllllI[1]];
        llllllllllllIlllIIIIIllIIlllIIII12[BlockModelShapes.lIlllllIIllllI[0]] = BlockFenceGate.POWERED;
        this.registerBlockWithStateMapper(dark_oak_fence_gate, builder9.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII12).build());
        final Block acacia_fence_gate = Blocks.acacia_fence_gate;
        final StateMap.Builder builder10 = new StateMap.Builder();
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII13 = new IProperty[BlockModelShapes.lIlllllIIllllI[1]];
        llllllllllllIlllIIIIIllIIlllIIII13[BlockModelShapes.lIlllllIIllllI[0]] = BlockFenceGate.POWERED;
        this.registerBlockWithStateMapper(acacia_fence_gate, builder10.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII13).build());
        final Block tripwire = Blocks.tripwire;
        final StateMap.Builder builder11 = new StateMap.Builder();
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII14 = new IProperty[BlockModelShapes.lIlllllIIllllI[2]];
        llllllllllllIlllIIIIIllIIlllIIII14[BlockModelShapes.lIlllllIIllllI[0]] = BlockTripWire.DISARMED;
        llllllllllllIlllIIIIIllIIlllIIII14[BlockModelShapes.lIlllllIIllllI[1]] = BlockTripWire.POWERED;
        this.registerBlockWithStateMapper(tripwire, builder11.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII14).build());
        this.registerBlockWithStateMapper(Blocks.double_wooden_slab, new StateMap.Builder().withName(BlockPlanks.VARIANT).withSuffix(BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[10]]).build());
        this.registerBlockWithStateMapper(Blocks.wooden_slab, new StateMap.Builder().withName(BlockPlanks.VARIANT).withSuffix(BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[11]]).build());
        final Block tnt = Blocks.tnt;
        final StateMap.Builder builder12 = new StateMap.Builder();
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII15 = new IProperty[BlockModelShapes.lIlllllIIllllI[1]];
        llllllllllllIlllIIIIIllIIlllIIII15[BlockModelShapes.lIlllllIIllllI[0]] = BlockTNT.EXPLODE;
        this.registerBlockWithStateMapper(tnt, builder12.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII15).build());
        final BlockFire fire = Blocks.fire;
        final StateMap.Builder builder13 = new StateMap.Builder();
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII16 = new IProperty[BlockModelShapes.lIlllllIIllllI[1]];
        llllllllllllIlllIIIIIllIIlllIIII16[BlockModelShapes.lIlllllIIllllI[0]] = BlockFire.AGE;
        this.registerBlockWithStateMapper(fire, builder13.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII16).build());
        final BlockRedstoneWire redstone_wire = Blocks.redstone_wire;
        final StateMap.Builder builder14 = new StateMap.Builder();
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII17 = new IProperty[BlockModelShapes.lIlllllIIllllI[1]];
        llllllllllllIlllIIIIIllIIlllIIII17[BlockModelShapes.lIlllllIIllllI[0]] = BlockRedstoneWire.POWER;
        this.registerBlockWithStateMapper(redstone_wire, builder14.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII17).build());
        final Block oak_door = Blocks.oak_door;
        final StateMap.Builder builder15 = new StateMap.Builder();
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII18 = new IProperty[BlockModelShapes.lIlllllIIllllI[1]];
        llllllllllllIlllIIIIIllIIlllIIII18[BlockModelShapes.lIlllllIIllllI[0]] = BlockDoor.POWERED;
        this.registerBlockWithStateMapper(oak_door, builder15.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII18).build());
        final Block spruce_door = Blocks.spruce_door;
        final StateMap.Builder builder16 = new StateMap.Builder();
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII19 = new IProperty[BlockModelShapes.lIlllllIIllllI[1]];
        llllllllllllIlllIIIIIllIIlllIIII19[BlockModelShapes.lIlllllIIllllI[0]] = BlockDoor.POWERED;
        this.registerBlockWithStateMapper(spruce_door, builder16.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII19).build());
        final Block birch_door = Blocks.birch_door;
        final StateMap.Builder builder17 = new StateMap.Builder();
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII20 = new IProperty[BlockModelShapes.lIlllllIIllllI[1]];
        llllllllllllIlllIIIIIllIIlllIIII20[BlockModelShapes.lIlllllIIllllI[0]] = BlockDoor.POWERED;
        this.registerBlockWithStateMapper(birch_door, builder17.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII20).build());
        final Block jungle_door = Blocks.jungle_door;
        final StateMap.Builder builder18 = new StateMap.Builder();
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII21 = new IProperty[BlockModelShapes.lIlllllIIllllI[1]];
        llllllllllllIlllIIIIIllIIlllIIII21[BlockModelShapes.lIlllllIIllllI[0]] = BlockDoor.POWERED;
        this.registerBlockWithStateMapper(jungle_door, builder18.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII21).build());
        final Block acacia_door = Blocks.acacia_door;
        final StateMap.Builder builder19 = new StateMap.Builder();
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII22 = new IProperty[BlockModelShapes.lIlllllIIllllI[1]];
        llllllllllllIlllIIIIIllIIlllIIII22[BlockModelShapes.lIlllllIIllllI[0]] = BlockDoor.POWERED;
        this.registerBlockWithStateMapper(acacia_door, builder19.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII22).build());
        final Block dark_oak_door = Blocks.dark_oak_door;
        final StateMap.Builder builder20 = new StateMap.Builder();
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII23 = new IProperty[BlockModelShapes.lIlllllIIllllI[1]];
        llllllllllllIlllIIIIIllIIlllIIII23[BlockModelShapes.lIlllllIIllllI[0]] = BlockDoor.POWERED;
        this.registerBlockWithStateMapper(dark_oak_door, builder20.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII23).build());
        final Block iron_door = Blocks.iron_door;
        final StateMap.Builder builder21 = new StateMap.Builder();
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII24 = new IProperty[BlockModelShapes.lIlllllIIllllI[1]];
        llllllllllllIlllIIIIIllIIlllIIII24[BlockModelShapes.lIlllllIIllllI[0]] = BlockDoor.POWERED;
        this.registerBlockWithStateMapper(iron_door, builder21.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII24).build());
        this.registerBlockWithStateMapper(Blocks.wool, new StateMap.Builder().withName(BlockColored.COLOR).withSuffix(BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[12]]).build());
        this.registerBlockWithStateMapper(Blocks.carpet, new StateMap.Builder().withName(BlockColored.COLOR).withSuffix(BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[13]]).build());
        this.registerBlockWithStateMapper(Blocks.stained_hardened_clay, new StateMap.Builder().withName(BlockColored.COLOR).withSuffix(BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[14]]).build());
        this.registerBlockWithStateMapper(Blocks.stained_glass_pane, new StateMap.Builder().withName(BlockColored.COLOR).withSuffix(BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[15]]).build());
        this.registerBlockWithStateMapper(Blocks.stained_glass, new StateMap.Builder().withName(BlockColored.COLOR).withSuffix(BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[16]]).build());
        this.registerBlockWithStateMapper(Blocks.sandstone, new StateMap.Builder().withName(BlockSandStone.TYPE).build());
        this.registerBlockWithStateMapper(Blocks.red_sandstone, new StateMap.Builder().withName(BlockRedSandstone.TYPE).build());
        this.registerBlockWithStateMapper(Blocks.tallgrass, new StateMap.Builder().withName(BlockTallGrass.TYPE).build());
        final Block bed = Blocks.bed;
        final StateMap.Builder builder22 = new StateMap.Builder();
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII25 = new IProperty[BlockModelShapes.lIlllllIIllllI[1]];
        llllllllllllIlllIIIIIllIIlllIIII25[BlockModelShapes.lIlllllIIllllI[0]] = BlockBed.OCCUPIED;
        this.registerBlockWithStateMapper(bed, builder22.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII25).build());
        this.registerBlockWithStateMapper(Blocks.yellow_flower, new StateMap.Builder().withName(Blocks.yellow_flower.getTypeProperty()).build());
        this.registerBlockWithStateMapper(Blocks.red_flower, new StateMap.Builder().withName(Blocks.red_flower.getTypeProperty()).build());
        this.registerBlockWithStateMapper(Blocks.stone_slab, new StateMap.Builder().withName(BlockStoneSlab.VARIANT).withSuffix(BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[6]]).build());
        this.registerBlockWithStateMapper(Blocks.stone_slab2, new StateMap.Builder().withName(BlockStoneSlabNew.VARIANT).withSuffix(BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[17]]).build());
        this.registerBlockWithStateMapper(Blocks.monster_egg, new StateMap.Builder().withName(BlockSilverfish.VARIANT).withSuffix(BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[18]]).build());
        this.registerBlockWithStateMapper(Blocks.stonebrick, new StateMap.Builder().withName(BlockStoneBrick.VARIANT).build());
        final Block dispenser = Blocks.dispenser;
        final StateMap.Builder builder23 = new StateMap.Builder();
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII26 = new IProperty[BlockModelShapes.lIlllllIIllllI[1]];
        llllllllllllIlllIIIIIllIIlllIIII26[BlockModelShapes.lIlllllIIllllI[0]] = BlockDispenser.TRIGGERED;
        this.registerBlockWithStateMapper(dispenser, builder23.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII26).build());
        final Block dropper = Blocks.dropper;
        final StateMap.Builder builder24 = new StateMap.Builder();
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII27 = new IProperty[BlockModelShapes.lIlllllIIllllI[1]];
        llllllllllllIlllIIIIIllIIlllIIII27[BlockModelShapes.lIlllllIIllllI[0]] = BlockDropper.TRIGGERED;
        this.registerBlockWithStateMapper(dropper, builder24.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII27).build());
        this.registerBlockWithStateMapper(Blocks.log, new StateMap.Builder().withName(BlockOldLog.VARIANT).withSuffix(BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[19]]).build());
        this.registerBlockWithStateMapper(Blocks.log2, new StateMap.Builder().withName(BlockNewLog.VARIANT).withSuffix(BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[20]]).build());
        this.registerBlockWithStateMapper(Blocks.planks, new StateMap.Builder().withName(BlockPlanks.VARIANT).withSuffix(BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[21]]).build());
        this.registerBlockWithStateMapper(Blocks.sapling, new StateMap.Builder().withName(BlockSapling.TYPE).withSuffix(BlockModelShapes.lIlllllIIllIll[BlockModelShapes.lIlllllIIllllI[22]]).build());
        this.registerBlockWithStateMapper(Blocks.sand, new StateMap.Builder().withName(BlockSand.VARIANT).build());
        final BlockHopper hopper = Blocks.hopper;
        final StateMap.Builder builder25 = new StateMap.Builder();
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII28 = new IProperty[BlockModelShapes.lIlllllIIllllI[1]];
        llllllllllllIlllIIIIIllIIlllIIII28[BlockModelShapes.lIlllllIIllllI[0]] = BlockHopper.ENABLED;
        this.registerBlockWithStateMapper(hopper, builder25.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII28).build());
        final Block flower_pot = Blocks.flower_pot;
        final StateMap.Builder builder26 = new StateMap.Builder();
        final IProperty[] llllllllllllIlllIIIIIllIIlllIIII29 = new IProperty[BlockModelShapes.lIlllllIIllllI[1]];
        llllllllllllIlllIIIIIllIIlllIIII29[BlockModelShapes.lIlllllIIllllI[0]] = BlockFlowerPot.LEGACY_DATA;
        this.registerBlockWithStateMapper(flower_pot, builder26.ignore((IProperty<?>[])llllllllllllIlllIIIIIllIIlllIIII29).build());
        this.registerBlockWithStateMapper(Blocks.quartz_block, new StateMapperBase() {
            private static final /* synthetic */ String[] lIlllIlIIIIlII;
            private static final /* synthetic */ int[] lIlllIlIIIIllI;
            
            static {
                lIIIIIlIlIIIIIII();
                lIIIIIlIIllllIIl();
            }
            
            private static boolean lIIIIIlIlIIIIIlI(final int llllllllllllIlllllIIIlIIllIIlIlI, final int llllllllllllIlllllIIIlIIllIIlIIl) {
                return llllllllllllIlllllIIIlIIllIIlIlI < llllllllllllIlllllIIIlIIllIIlIIl;
            }
            
            private static String lIIIIIlIIlllIlll(final String llllllllllllIlllllIIIlIIllllIlIl, final String llllllllllllIlllllIIIlIIllllIllI) {
                try {
                    final SecretKeySpec llllllllllllIlllllIIIlIIlllllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIIlIIllllIllI.getBytes(StandardCharsets.UTF_8)), BlockModelShapes$1.lIlllIlIIIIllI[8]), "DES");
                    final Cipher llllllllllllIlllllIIIlIIlllllIIl = Cipher.getInstance("DES");
                    llllllllllllIlllllIIIlIIlllllIIl.init(BlockModelShapes$1.lIlllIlIIIIllI[2], llllllllllllIlllllIIIlIIlllllIlI);
                    return new String(llllllllllllIlllllIIIlIIlllllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIIlIIllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlllllIIIlIIlllllIII) {
                    llllllllllllIlllllIIIlIIlllllIII.printStackTrace();
                    return null;
                }
            }
            
            private static boolean lIIIIIlIlIIIIIIl(final Object llllllllllllIlllllIIIlIIllIIIlll) {
                return llllllllllllIlllllIIIlIIllIIIlll != null;
            }
            
            private static void lIIIIIlIIllllIIl() {
                (lIlllIlIIIIlII = new String[BlockModelShapes$1.lIlllIlIIIIllI[10]])[BlockModelShapes$1.lIlllIlIIIIllI[0]] = lIIIIIlIIlllIllI("9xzNeyl9qceV0Rt/EHqVZg==", "kfUtL");
                BlockModelShapes$1.lIlllIlIIIIlII[BlockModelShapes$1.lIlllIlIIIIllI[1]] = lIIIIIlIIlllIllI("pd8jgtbw2oY=", "uPNzB");
                BlockModelShapes$1.lIlllIlIIIIlII[BlockModelShapes$1.lIlllIlIIIIllI[2]] = lIIIIIlIIlllIlll("RifaH0zW/CJBrE9gGgmeJ7ZuC/Jqkb2C", "FuzfO");
                BlockModelShapes$1.lIlllIlIIIIlII[BlockModelShapes$1.lIlllIlIIIIllI[3]] = lIIIIIlIIlllIlll("SgH1lVwMd3U=", "OlycB");
                BlockModelShapes$1.lIlllIlIIIIlII[BlockModelShapes$1.lIlllIlIIIIllI[4]] = lIIIIIlIIlllIlll("NBGfn2tJf3e4IxHWfnhGZg==", "XZrvP");
                BlockModelShapes$1.lIlllIlIIIIlII[BlockModelShapes$1.lIlllIlIIIIllI[5]] = lIIIIIlIIllllIII("MiA/EFcq", "SXVcj");
                BlockModelShapes$1.lIlllIlIIIIlII[BlockModelShapes$1.lIlllIlIIIIllI[6]] = lIIIIIlIIllllIII("GSYOMx8SDAwuBx0+AQ==", "hSoAk");
                BlockModelShapes$1.lIlllIlIIIIlII[BlockModelShapes$1.lIlllIlIIIIllI[7]] = lIIIIIlIIlllIlll("2hUyJhaYJcU=", "naKLX");
                BlockModelShapes$1.lIlllIlIIIIlII[BlockModelShapes$1.lIlllIlIIIIllI[8]] = lIIIIIlIIllllIII("BRQOGjUOPgwHLQEMAQ==", "taohA");
                BlockModelShapes$1.lIlllIlIIIIlII[BlockModelShapes$1.lIlllIlIIIIllI[9]] = lIIIIIlIIlllIllI("BM0xpateDPs=", "YICGX");
            }
            
            private static void lIIIIIlIlIIIIIII() {
                (lIlllIlIIIIllI = new int[11])[0] = ((0x20 ^ 0x1B) & ~(0x1F ^ 0x24));
                BlockModelShapes$1.lIlllIlIIIIllI[1] = " ".length();
                BlockModelShapes$1.lIlllIlIIIIllI[2] = "  ".length();
                BlockModelShapes$1.lIlllIlIIIIllI[3] = "   ".length();
                BlockModelShapes$1.lIlllIlIIIIllI[4] = (0x5A ^ 0x5E);
                BlockModelShapes$1.lIlllIlIIIIllI[5] = (0x7E ^ 0x7B);
                BlockModelShapes$1.lIlllIlIIIIllI[6] = (0x25 ^ 0x23);
                BlockModelShapes$1.lIlllIlIIIIllI[7] = (0x40 ^ 0x47);
                BlockModelShapes$1.lIlllIlIIIIllI[8] = (61 + 21 + 23 + 79 ^ 100 + 23 - 1 + 54);
                BlockModelShapes$1.lIlllIlIIIIllI[9] = (0xA ^ 0xF ^ (0x33 ^ 0x3F));
                BlockModelShapes$1.lIlllIlIIIIllI[10] = (0x45 ^ 0x4F);
            }
            
            static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$block$BlockQuartz$EnumType() {
                final int[] $switch_TABLE$net$minecraft$block$BlockQuartz$EnumType = BlockModelShapes$1.$SWITCH_TABLE$net$minecraft$block$BlockQuartz$EnumType;
                if (lIIIIIlIlIIIIIIl($switch_TABLE$net$minecraft$block$BlockQuartz$EnumType)) {
                    return $switch_TABLE$net$minecraft$block$BlockQuartz$EnumType;
                }
                "".length();
                final String llllllllllllIlllllIIIlIIllllllll = (Object)new int[BlockQuartz.EnumType.values().length];
                try {
                    llllllllllllIlllllIIIlIIllllllll[BlockQuartz.EnumType.CHISELED.ordinal()] = BlockModelShapes$1.lIlllIlIIIIllI[2];
                    "".length();
                    if (" ".length() > (0x60 ^ 0x64)) {
                        return null;
                    }
                }
                catch (NoSuchFieldError noSuchFieldError) {
                    "".length();
                }
                try {
                    llllllllllllIlllllIIIlIIllllllll[BlockQuartz.EnumType.DEFAULT.ordinal()] = BlockModelShapes$1.lIlllIlIIIIllI[1];
                    "".length();
                    if (-"   ".length() > 0) {
                        return null;
                    }
                }
                catch (NoSuchFieldError noSuchFieldError2) {
                    "".length();
                }
                try {
                    llllllllllllIlllllIIIlIIllllllll[BlockQuartz.EnumType.LINES_X.ordinal()] = BlockModelShapes$1.lIlllIlIIIIllI[4];
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                catch (NoSuchFieldError noSuchFieldError3) {
                    "".length();
                }
                try {
                    llllllllllllIlllllIIIlIIllllllll[BlockQuartz.EnumType.LINES_Y.ordinal()] = BlockModelShapes$1.lIlllIlIIIIllI[3];
                    "".length();
                    if (((83 + 25 - 71 + 110 ^ 81 + 55 - 106 + 143) & (0x50 ^ 0x68 ^ (0x2B ^ 0x2D) ^ -" ".length())) < 0) {
                        return null;
                    }
                }
                catch (NoSuchFieldError noSuchFieldError4) {
                    "".length();
                }
                try {
                    llllllllllllIlllllIIIlIIllllllll[BlockQuartz.EnumType.LINES_Z.ordinal()] = BlockModelShapes$1.lIlllIlIIIIllI[5];
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                catch (NoSuchFieldError noSuchFieldError5) {
                    "".length();
                }
                return BlockModelShapes$1.$SWITCH_TABLE$net$minecraft$block$BlockQuartz$EnumType = (int[])(Object)llllllllllllIlllllIIIlIIllllllll;
            }
            
            @Override
            protected ModelResourceLocation getModelResourceLocation(final IBlockState llllllllllllIlllllIIIlIlIIIIIIlI) {
                final BlockQuartz.EnumType llllllllllllIlllllIIIlIlIIIIIIll = llllllllllllIlllllIIIlIlIIIIIIlI.getValue(BlockQuartz.VARIANT);
                switch ($SWITCH_TABLE$net$minecraft$block$BlockQuartz$EnumType()[llllllllllllIlllllIIIlIlIIIIIIll.ordinal()]) {
                    default: {
                        return new ModelResourceLocation(BlockModelShapes$1.lIlllIlIIIIlII[BlockModelShapes$1.lIlllIlIIIIllI[0]], BlockModelShapes$1.lIlllIlIIIIlII[BlockModelShapes$1.lIlllIlIIIIllI[1]]);
                    }
                    case 2: {
                        return new ModelResourceLocation(BlockModelShapes$1.lIlllIlIIIIlII[BlockModelShapes$1.lIlllIlIIIIllI[2]], BlockModelShapes$1.lIlllIlIIIIlII[BlockModelShapes$1.lIlllIlIIIIllI[3]]);
                    }
                    case 3: {
                        return new ModelResourceLocation(BlockModelShapes$1.lIlllIlIIIIlII[BlockModelShapes$1.lIlllIlIIIIllI[4]], BlockModelShapes$1.lIlllIlIIIIlII[BlockModelShapes$1.lIlllIlIIIIllI[5]]);
                    }
                    case 4: {
                        return new ModelResourceLocation(BlockModelShapes$1.lIlllIlIIIIlII[BlockModelShapes$1.lIlllIlIIIIllI[6]], BlockModelShapes$1.lIlllIlIIIIlII[BlockModelShapes$1.lIlllIlIIIIllI[7]]);
                    }
                    case 5: {
                        return new ModelResourceLocation(BlockModelShapes$1.lIlllIlIIIIlII[BlockModelShapes$1.lIlllIlIIIIllI[8]], BlockModelShapes$1.lIlllIlIIIIlII[BlockModelShapes$1.lIlllIlIIIIllI[9]]);
                    }
                }
            }
            
            private static String lIIIIIlIIllllIII(String llllllllllllIlllllIIIlIIllIlIlIl, final String llllllllllllIlllllIIIlIIllIlIlII) {
                llllllllllllIlllllIIIlIIllIlIlIl = (boolean)new String(Base64.getDecoder().decode(((String)llllllllllllIlllllIIIlIIllIlIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIlllllIIIlIIllIllIII = new StringBuilder();
                final char[] llllllllllllIlllllIIIlIIllIlIlll = llllllllllllIlllllIIIlIIllIlIlII.toCharArray();
                int llllllllllllIlllllIIIlIIllIlIllI = BlockModelShapes$1.lIlllIlIIIIllI[0];
                final long llllllllllllIlllllIIIlIIllIlIIII = (Object)((String)llllllllllllIlllllIIIlIIllIlIlIl).toCharArray();
                final short llllllllllllIlllllIIIlIIllIIllll = (short)llllllllllllIlllllIIIlIIllIlIIII.length;
                char llllllllllllIlllllIIIlIIllIIlllI = (char)BlockModelShapes$1.lIlllIlIIIIllI[0];
                while (lIIIIIlIlIIIIIlI(llllllllllllIlllllIIIlIIllIIlllI, llllllllllllIlllllIIIlIIllIIllll)) {
                    final char llllllllllllIlllllIIIlIIllIllIll = llllllllllllIlllllIIIlIIllIlIIII[llllllllllllIlllllIIIlIIllIIlllI];
                    llllllllllllIlllllIIIlIIllIllIII.append((char)(llllllllllllIlllllIIIlIIllIllIll ^ llllllllllllIlllllIIIlIIllIlIlll[llllllllllllIlllllIIIlIIllIlIllI % llllllllllllIlllllIIIlIIllIlIlll.length]));
                    "".length();
                    ++llllllllllllIlllllIIIlIIllIlIllI;
                    ++llllllllllllIlllllIIIlIIllIIlllI;
                    "".length();
                    if ((0x8A ^ 0x8E) < 0) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIlllllIIIlIIllIllIII);
            }
            
            private static String lIIIIIlIIlllIllI(final String llllllllllllIlllllIIIlIIlllIlIlI, final String llllllllllllIlllllIIIlIIlllIIlll) {
                try {
                    final SecretKeySpec llllllllllllIlllllIIIlIIlllIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIIlIIlllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher llllllllllllIlllllIIIlIIlllIllII = Cipher.getInstance("Blowfish");
                    llllllllllllIlllllIIIlIIlllIllII.init(BlockModelShapes$1.lIlllIlIIIIllI[2], llllllllllllIlllllIIIlIIlllIllIl);
                    return new String(llllllllllllIlllllIIIlIIlllIllII.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIIlIIlllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlllllIIIlIIlllIlIll) {
                    llllllllllllIlllllIIIlIIlllIlIll.printStackTrace();
                    return null;
                }
            }
        });
        this.registerBlockWithStateMapper(Blocks.deadbush, new StateMapperBase() {
            private static final /* synthetic */ String[] lIlIlIlllllIlI;
            private static final /* synthetic */ int[] lIlIlIlllllIll;
            
            private static String lllIlllllllIlll(final String lllllllllllllIIIIllllIIlIlIllIll, final String lllllllllllllIIIIllllIIlIlIllIlI) {
                try {
                    final SecretKeySpec lllllllllllllIIIIllllIIlIllIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllllIIlIlIllIlI.getBytes(StandardCharsets.UTF_8)), BlockModelShapes$2.lIlIlIlllllIll[3]), "DES");
                    final Cipher lllllllllllllIIIIllllIIlIlIlllll = Cipher.getInstance("DES");
                    lllllllllllllIIIIllllIIlIlIlllll.init(BlockModelShapes$2.lIlIlIlllllIll[2], lllllllllllllIIIIllllIIlIllIIIII);
                    return new String(lllllllllllllIIIIllllIIlIlIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllllIIlIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIIIllllIIlIlIllllI) {
                    lllllllllllllIIIIllllIIlIlIllllI.printStackTrace();
                    return null;
                }
            }
            
            private static void lllIllllllllIII() {
                (lIlIlIlllllIlI = new String[BlockModelShapes$2.lIlIlIlllllIll[2]])[BlockModelShapes$2.lIlIlIlllllIll[0]] = lllIlllllllIlll("xiTxDzJc0/wx0kuB2vEnlg==", "NcTFE");
                BlockModelShapes$2.lIlIlIlllllIlI[BlockModelShapes$2.lIlIlIlllllIll[1]] = lllIlllllllIlll("TqPyxJQx0/c=", "VPzEB");
            }
            
            private static void lllIllllllllIIl() {
                (lIlIlIlllllIll = new int[4])[0] = ((0xEA ^ 0xB0) & ~(0x48 ^ 0x12));
                BlockModelShapes$2.lIlIlIlllllIll[1] = " ".length();
                BlockModelShapes$2.lIlIlIlllllIll[2] = "  ".length();
                BlockModelShapes$2.lIlIlIlllllIll[3] = (0x18 ^ 0x10);
            }
            
            @Override
            protected ModelResourceLocation getModelResourceLocation(final IBlockState lllllllllllllIIIIllllIIlIllIIlIl) {
                return new ModelResourceLocation(BlockModelShapes$2.lIlIlIlllllIlI[BlockModelShapes$2.lIlIlIlllllIll[0]], BlockModelShapes$2.lIlIlIlllllIlI[BlockModelShapes$2.lIlIlIlllllIll[1]]);
            }
            
            static {
                lllIllllllllIIl();
                lllIllllllllIII();
            }
        });
        this.registerBlockWithStateMapper(Blocks.pumpkin_stem, new StateMapperBase() {
            private static boolean lIlIIIIllIIllllI(final Object llllllllllllIlIlllIIlIllIlIIIlIl, final Object llllllllllllIlIlllIIlIllIlIIIlII) {
                return llllllllllllIlIlllIIlIllIlIIIlIl != llllllllllllIlIlllIIlIllIlIIIlII;
            }
            
            @Override
            protected ModelResourceLocation getModelResourceLocation(final IBlockState llllllllllllIlIlllIIlIllIlIIlIIl) {
                final Map<IProperty, Comparable> llllllllllllIlIlllIIlIllIlIIlIll = (Map<IProperty, Comparable>)Maps.newLinkedHashMap((Map)llllllllllllIlIlllIIlIllIlIIlIIl.getProperties());
                if (lIlIIIIllIIllllI(llllllllllllIlIlllIIlIllIlIIlIIl.getValue((IProperty<Object>)BlockStem.FACING), EnumFacing.UP)) {
                    llllllllllllIlIlllIIlIllIlIIlIll.remove(BlockStem.AGE);
                    "".length();
                }
                return new ModelResourceLocation(Block.blockRegistry.getNameForObject(llllllllllllIlIlllIIlIllIlIIlIIl.getBlock()), this.getPropertyString(llllllllllllIlIlllIIlIllIlIIlIll));
            }
        });
        this.registerBlockWithStateMapper(Blocks.melon_stem, new StateMapperBase() {
            private static boolean lIlIlllllllllII(final Object lllllllllllllIlIlIlIlIIlllIIllIl, final Object lllllllllllllIlIlIlIlIIlllIIllII) {
                return lllllllllllllIlIlIlIlIIlllIIllIl != lllllllllllllIlIlIlIlIIlllIIllII;
            }
            
            @Override
            protected ModelResourceLocation getModelResourceLocation(final IBlockState lllllllllllllIlIlIlIlIIlllIlIIIl) {
                final Map<IProperty, Comparable> lllllllllllllIlIlIlIlIIlllIlIIll = (Map<IProperty, Comparable>)Maps.newLinkedHashMap((Map)lllllllllllllIlIlIlIlIIlllIlIIIl.getProperties());
                if (lIlIlllllllllII(lllllllllllllIlIlIlIlIIlllIlIIIl.getValue((IProperty<Object>)BlockStem.FACING), EnumFacing.UP)) {
                    lllllllllllllIlIlIlIlIIlllIlIIll.remove(BlockStem.AGE);
                    "".length();
                }
                return new ModelResourceLocation(Block.blockRegistry.getNameForObject(lllllllllllllIlIlIlIlIIlllIlIIIl.getBlock()), this.getPropertyString(lllllllllllllIlIlIlIlIIlllIlIIll));
            }
        });
        this.registerBlockWithStateMapper(Blocks.dirt, new StateMapperBase() {
            private static boolean lIIlIIllIIlIlIIl(final Object llllllllllllIllIlIlllIIlIlIIIlll, final Object llllllllllllIllIlIlllIIlIlIIIllI) {
                return llllllllllllIllIlIlllIIlIlIIIlll != llllllllllllIllIlIlllIIlIlIIIllI;
            }
            
            @Override
            protected ModelResourceLocation getModelResourceLocation(final IBlockState llllllllllllIllIlIlllIIlIlIlIIII) {
                final Map<IProperty, Comparable> llllllllllllIllIlIlllIIlIlIIllll = (Map<IProperty, Comparable>)Maps.newLinkedHashMap((Map)llllllllllllIllIlIlllIIlIlIlIIII.getProperties());
                final String llllllllllllIllIlIlllIIlIlIIlllI = BlockDirt.VARIANT.getName(llllllllllllIllIlIlllIIlIlIIllll.remove(BlockDirt.VARIANT));
                if (lIIlIIllIIlIlIIl(BlockDirt.DirtType.PODZOL, llllllllllllIllIlIlllIIlIlIlIIII.getValue(BlockDirt.VARIANT))) {
                    llllllllllllIllIlIlllIIlIlIIllll.remove(BlockDirt.SNOWY);
                    "".length();
                }
                return new ModelResourceLocation(llllllllllllIllIlIlllIIlIlIIlllI, this.getPropertyString(llllllllllllIllIlIlllIIlIlIIllll));
            }
        });
        this.registerBlockWithStateMapper(Blocks.double_stone_slab, new StateMapperBase() {
            private static final /* synthetic */ String[] lIllllIlIIllII;
            private static final /* synthetic */ int[] lIlllllIIllIlI;
            
            private static String lIIIIlIIIlllIIlI(final String llllllllllllIllllIIlllIIIlIllIll, final String llllllllllllIllllIIlllIIIlIllIlI) {
                try {
                    final SecretKeySpec llllllllllllIllllIIlllIIIlIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlllIIIlIllIlI.getBytes(StandardCharsets.UTF_8)), BlockModelShapes$6.lIlllllIIllIlI[4]), "DES");
                    final Cipher llllllllllllIllllIIlllIIIlIlllIl = Cipher.getInstance("DES");
                    llllllllllllIllllIIlllIIIlIlllIl.init(BlockModelShapes$6.lIlllllIIllIlI[2], llllllllllllIllllIIlllIIIlIllllI);
                    return new String(llllllllllllIllllIIlllIIIlIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlllIIIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIllllIIlllIIIlIlllII) {
                    llllllllllllIllllIIlllIIIlIlllII.printStackTrace();
                    return null;
                }
            }
            
            private static boolean lIIIIlIlIlIIIlII(final int llllllllllllIllllIIlllIIIIlIlllI, final int llllllllllllIllllIIlllIIIIlIllIl) {
                return llllllllllllIllllIIlllIIIIlIlllI < llllllllllllIllllIIlllIIIIlIllIl;
            }
            
            private static String lIIIIlIIIlllIIIl(final String llllllllllllIllllIIlllIIIlIIllII, final String llllllllllllIllllIIlllIIIlIIlIll) {
                try {
                    final SecretKeySpec llllllllllllIllllIIlllIIIlIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlllIIIlIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher llllllllllllIllllIIlllIIIlIlIIII = Cipher.getInstance("Blowfish");
                    llllllllllllIllllIIlllIIIlIlIIII.init(BlockModelShapes$6.lIlllllIIllIlI[2], llllllllllllIllllIIlllIIIlIlIIIl);
                    return new String(llllllllllllIllllIIlllIIIlIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlllIIIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIllllIIlllIIIlIIllll) {
                    llllllllllllIllllIIlllIIIlIIllll.printStackTrace();
                    return null;
                }
            }
            
            static {
                lIIIIlIlIlIIIIlI();
                lIIIIlIIIlllIIll();
            }
            
            private static boolean lIIIIlIlIlIIIIll(final int llllllllllllIllllIIlllIIIIlIlIll) {
                return llllllllllllIllllIIlllIIIIlIlIll != 0;
            }
            
            private static String lIIIIlIIIlllIIII(String llllllllllllIllllIIlllIIIIlllIIl, final String llllllllllllIllllIIlllIIIIlllIII) {
                llllllllllllIllllIIlllIIIIlllIIl = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIIlllIIIIlllIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIllllIIlllIIIIllllII = new StringBuilder();
                final char[] llllllllllllIllllIIlllIIIIlllIll = llllllllllllIllllIIlllIIIIlllIII.toCharArray();
                int llllllllllllIllllIIlllIIIIlllIlI = BlockModelShapes$6.lIlllllIIllIlI[0];
                final int llllllllllllIllllIIlllIIIIllIlII = (Object)((String)llllllllllllIllllIIlllIIIIlllIIl).toCharArray();
                final boolean llllllllllllIllllIIlllIIIIllIIll = llllllllllllIllllIIlllIIIIllIlII.length != 0;
                byte llllllllllllIllllIIlllIIIIllIIlI = (byte)BlockModelShapes$6.lIlllllIIllIlI[0];
                while (lIIIIlIlIlIIIlII(llllllllllllIllllIIlllIIIIllIIlI, llllllllllllIllllIIlllIIIIllIIll ? 1 : 0)) {
                    final char llllllllllllIllllIIlllIIIIllllll = llllllllllllIllllIIlllIIIIllIlII[llllllllllllIllllIIlllIIIIllIIlI];
                    llllllllllllIllllIIlllIIIIllllII.append((char)(llllllllllllIllllIIlllIIIIllllll ^ llllllllllllIllllIIlllIIIIlllIll[llllllllllllIllllIIlllIIIIlllIlI % llllllllllllIllllIIlllIIIIlllIll.length]));
                    "".length();
                    ++llllllllllllIllllIIlllIIIIlllIlI;
                    ++llllllllllllIllllIIlllIIIIllIIlI;
                    "".length();
                    if (((0xED ^ 0xC2 ^ (0xBC ^ 0xA6)) & (153 + 143 - 159 + 22 ^ 110 + 58 - 99 + 101 ^ -" ".length())) != 0x0) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIllllIIlllIIIIllllII);
            }
            
            private static void lIIIIlIlIlIIIIlI() {
                (lIlllllIIllIlI = new int[5])[0] = ((0x9D ^ 0xB1) & ~(0x47 ^ 0x6B));
                BlockModelShapes$6.lIlllllIIllIlI[1] = " ".length();
                BlockModelShapes$6.lIlllllIIllIlI[2] = "  ".length();
                BlockModelShapes$6.lIlllllIIllIlI[3] = "   ".length();
                BlockModelShapes$6.lIlllllIIllIlI[4] = (" ".length() ^ (0xA8 ^ 0xA1));
            }
            
            @Override
            protected ModelResourceLocation getModelResourceLocation(final IBlockState llllllllllllIllllIIlllIIIllIIllI) {
                final Map<IProperty, Comparable> llllllllllllIllllIIlllIIIllIlIIl = (Map<IProperty, Comparable>)Maps.newLinkedHashMap((Map)llllllllllllIllllIIlllIIIllIIllI.getProperties());
                final String llllllllllllIllllIIlllIIIllIlIII = BlockStoneSlab.VARIANT.getName(llllllllllllIllllIIlllIIIllIlIIl.remove(BlockStoneSlab.VARIANT));
                llllllllllllIllllIIlllIIIllIlIIl.remove(BlockStoneSlab.SEAMLESS);
                "".length();
                String s;
                if (lIIIIlIlIlIIIIll(((boolean)llllllllllllIllllIIlllIIIllIIllI.getValue((IProperty<Boolean>)BlockStoneSlab.SEAMLESS)) ? 1 : 0)) {
                    s = BlockModelShapes$6.lIllllIlIIllII[BlockModelShapes$6.lIlllllIIllIlI[0]];
                    "".length();
                    if (" ".length() < ((0x13 ^ 0x45) & ~(0x1B ^ 0x4D))) {
                        return null;
                    }
                }
                else {
                    s = BlockModelShapes$6.lIllllIlIIllII[BlockModelShapes$6.lIlllllIIllIlI[1]];
                }
                final String llllllllllllIllllIIlllIIIllIIlll = s;
                return new ModelResourceLocation(String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllllIIlllIIIllIlIII)).append(BlockModelShapes$6.lIllllIlIIllII[BlockModelShapes$6.lIlllllIIllIlI[2]])), llllllllllllIllllIIlllIIIllIIlll);
            }
            
            private static void lIIIIlIIIlllIIll() {
                (lIllllIlIIllII = new String[BlockModelShapes$6.lIlllllIIllIlI[3]])[BlockModelShapes$6.lIlllllIIllIlI[0]] = lIIIIlIIIlllIIII("Jwk7", "FeWDP");
                BlockModelShapes$6.lIllllIlIIllII[BlockModelShapes$6.lIlllllIIllIlI[1]] = lIIIIlIIIlllIIIl("bvOCW2NS+R0=", "KvPxG");
                BlockModelShapes$6.lIllllIlIIllII[BlockModelShapes$6.lIlllllIIllIlI[2]] = lIIIIlIIIlllIIlI("nvBLn1DtoTc7ZaznAK41JQ==", "BVORy");
            }
        });
        this.registerBlockWithStateMapper(Blocks.double_stone_slab2, new StateMapperBase() {
            private static final /* synthetic */ String[] lllIIlllIlIIlI;
            private static final /* synthetic */ int[] lllIIlllIlIIll;
            
            private static void lIlIIIIIlIlllllI() {
                (lllIIlllIlIIlI = new String[BlockModelShapes$7.lllIIlllIlIIll[3]])[BlockModelShapes$7.lllIIlllIlIIll[0]] = lIlIIIIIlIllllII("KBUp", "IyEKD");
                BlockModelShapes$7.lllIIlllIlIIlI[BlockModelShapes$7.lllIIlllIlIIll[1]] = lIlIIIIIlIllllIl("r8MFsyw/Z0c=", "TvDDv");
                BlockModelShapes$7.lllIIlllIlIIlI[BlockModelShapes$7.lllIIlllIlIIll[2]] = lIlIIIIIlIllllII("FTw2IicmPQYkKSs6", "JXYWE");
            }
            
            private static String lIlIIIIIlIllllIl(final String llllllllllllIlIlllIllIlIlIIIlIll, final String llllllllllllIlIlllIllIlIlIIIlIlI) {
                try {
                    final SecretKeySpec llllllllllllIlIlllIllIlIlIIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIllIlIlIIIlIlI.getBytes(StandardCharsets.UTF_8)), BlockModelShapes$7.lllIIlllIlIIll[4]), "DES");
                    final Cipher llllllllllllIlIlllIllIlIlIIIllll = Cipher.getInstance("DES");
                    llllllllllllIlIlllIllIlIlIIIllll.init(BlockModelShapes$7.lllIIlllIlIIll[2], llllllllllllIlIlllIllIlIlIIlIIII);
                    return new String(llllllllllllIlIlllIllIlIlIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIllIlIlIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlIlllIllIlIlIIIlllI) {
                    llllllllllllIlIlllIllIlIlIIIlllI.printStackTrace();
                    return null;
                }
            }
            
            private static void lIlIIIIIlIllllll() {
                (lllIIlllIlIIll = new int[5])[0] = ((0x7C ^ 0x66) & ~(0x5C ^ 0x46));
                BlockModelShapes$7.lllIIlllIlIIll[1] = " ".length();
                BlockModelShapes$7.lllIIlllIlIIll[2] = "  ".length();
                BlockModelShapes$7.lllIIlllIlIIll[3] = "   ".length();
                BlockModelShapes$7.lllIIlllIlIIll[4] = (0x7C ^ 0x74);
            }
            
            private static boolean lIlIIIIIllIIIIII(final int llllllllllllIlIlllIllIlIlIIIIIlI) {
                return llllllllllllIlIlllIllIlIlIIIIIlI != 0;
            }
            
            static {
                lIlIIIIIlIllllll();
                lIlIIIIIlIlllllI();
            }
            
            private static String lIlIIIIIlIllllII(String llllllllllllIlIlllIllIlIlIIlllIl, final String llllllllllllIlIlllIllIlIlIIlllII) {
                llllllllllllIlIlllIllIlIlIIlllIl = new String(Base64.getDecoder().decode(llllllllllllIlIlllIllIlIlIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIlIlllIllIlIlIlIIIII = new StringBuilder();
                final char[] llllllllllllIlIlllIllIlIlIIlllll = llllllllllllIlIlllIllIlIlIIlllII.toCharArray();
                int llllllllllllIlIlllIllIlIlIIllllI = BlockModelShapes$7.lllIIlllIlIIll[0];
                final long llllllllllllIlIlllIllIlIlIIllIII = (Object)llllllllllllIlIlllIllIlIlIIlllIl.toCharArray();
                final String llllllllllllIlIlllIllIlIlIIlIlll = (String)llllllllllllIlIlllIllIlIlIIllIII.length;
                double llllllllllllIlIlllIllIlIlIIlIllI = BlockModelShapes$7.lllIIlllIlIIll[0];
                while (lIlIIIIIllIIIIIl((int)llllllllllllIlIlllIllIlIlIIlIllI, (int)llllllllllllIlIlllIllIlIlIIlIlll)) {
                    final char llllllllllllIlIlllIllIlIlIlIIIll = llllllllllllIlIlllIllIlIlIIllIII[llllllllllllIlIlllIllIlIlIIlIllI];
                    llllllllllllIlIlllIllIlIlIlIIIII.append((char)(llllllllllllIlIlllIllIlIlIlIIIll ^ llllllllllllIlIlllIllIlIlIIlllll[llllllllllllIlIlllIllIlIlIIllllI % llllllllllllIlIlllIllIlIlIIlllll.length]));
                    "".length();
                    ++llllllllllllIlIlllIllIlIlIIllllI;
                    ++llllllllllllIlIlllIllIlIlIIlIllI;
                    "".length();
                    if ("  ".length() == 0) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIlIlllIllIlIlIlIIIII);
            }
            
            @Override
            protected ModelResourceLocation getModelResourceLocation(final IBlockState llllllllllllIlIlllIllIlIlIllIlII) {
                final Map<IProperty, Comparable> llllllllllllIlIlllIllIlIlIllIIll = (Map<IProperty, Comparable>)Maps.newLinkedHashMap((Map)llllllllllllIlIlllIllIlIlIllIlII.getProperties());
                final String llllllllllllIlIlllIllIlIlIllIIlI = BlockStoneSlabNew.VARIANT.getName(llllllllllllIlIlllIllIlIlIllIIll.remove(BlockStoneSlabNew.VARIANT));
                llllllllllllIlIlllIllIlIlIllIIll.remove(BlockStoneSlab.SEAMLESS);
                "".length();
                String s;
                if (lIlIIIIIllIIIIII(((boolean)llllllllllllIlIlllIllIlIlIllIlII.getValue((IProperty<Boolean>)BlockStoneSlabNew.SEAMLESS)) ? 1 : 0)) {
                    s = BlockModelShapes$7.lllIIlllIlIIlI[BlockModelShapes$7.lllIIlllIlIIll[0]];
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                else {
                    s = BlockModelShapes$7.lllIIlllIlIIlI[BlockModelShapes$7.lllIIlllIlIIll[1]];
                }
                final String llllllllllllIlIlllIllIlIlIllIIIl = s;
                return new ModelResourceLocation(String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlIlllIllIlIlIllIIlI)).append(BlockModelShapes$7.lllIIlllIlIIlI[BlockModelShapes$7.lllIIlllIlIIll[2]])), llllllllllllIlIlllIllIlIlIllIIIl);
            }
            
            private static boolean lIlIIIIIllIIIIIl(final int llllllllllllIlIlllIllIlIlIIIIlIl, final int llllllllllllIlIlllIllIlIlIIIIlII) {
                return llllllllllllIlIlllIllIlIlIIIIlIl < llllllllllllIlIlllIllIlIlIIIIlII;
            }
        });
    }
    
    private static boolean lIIIIlIlIlIlllIl(final int llllllllllllIllllIIllIlIIllIlllI) {
        return llllllllllllIllllIIllIlIIllIlllI == 0;
    }
    
    private static String lIIIIlIlIlIlIIIl(String llllllllllllIllllIIllIlIlIIlIlIl, final String llllllllllllIllllIIllIlIlIIllIIl) {
        llllllllllllIllllIIllIlIlIIlIlIl = (short)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIIllIlIlIIlIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIIllIlIlIIllIII = new StringBuilder();
        final char[] llllllllllllIllllIIllIlIlIIlIlll = llllllllllllIllllIIllIlIlIIllIIl.toCharArray();
        int llllllllllllIllllIIllIlIlIIlIllI = BlockModelShapes.lIlllllIIllllI[0];
        final Exception llllllllllllIllllIIllIlIlIIlIIII = (Object)((String)llllllllllllIllllIIllIlIlIIlIlIl).toCharArray();
        final char llllllllllllIllllIIllIlIlIIIllll = (char)llllllllllllIllllIIllIlIlIIlIIII.length;
        Exception llllllllllllIllllIIllIlIlIIIlllI = (Exception)BlockModelShapes.lIlllllIIllllI[0];
        while (lIIIIlIlIlIllllI((int)llllllllllllIllllIIllIlIlIIIlllI, llllllllllllIllllIIllIlIlIIIllll)) {
            final char llllllllllllIllllIIllIlIlIIllIll = llllllllllllIllllIIllIlIlIIlIIII[llllllllllllIllllIIllIlIlIIIlllI];
            llllllllllllIllllIIllIlIlIIllIII.append((char)(llllllllllllIllllIIllIlIlIIllIll ^ llllllllllllIllllIIllIlIlIIlIlll[llllllllllllIllllIIllIlIlIIlIllI % llllllllllllIllllIIllIlIlIIlIlll.length]));
            "".length();
            ++llllllllllllIllllIIllIlIlIIlIllI;
            ++llllllllllllIllllIIllIlIlIIIlllI;
            "".length();
            if ((0x48 ^ 0x71 ^ (0x5 ^ 0x38)) < "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIIllIlIlIIllIII);
    }
    
    private static String lIIIIlIlIlIIlIII(final String llllllllllllIllllIIllIlIlIlIlIlI, final String llllllllllllIllllIIllIlIlIlIIlll) {
        try {
            final SecretKeySpec llllllllllllIllllIIllIlIlIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIllIlIlIlIIlll.getBytes(StandardCharsets.UTF_8)), BlockModelShapes.lIlllllIIllllI[9]), "DES");
            final Cipher llllllllllllIllllIIllIlIlIlIllII = Cipher.getInstance("DES");
            llllllllllllIllllIIllIlIlIlIllII.init(BlockModelShapes.lIlllllIIllllI[2], llllllllllllIllllIIllIlIlIlIllIl);
            return new String(llllllllllllIllllIIllIlIlIlIllII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIllIlIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIllIlIlIlIlIll) {
            llllllllllllIllllIIllIlIlIlIlIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIlIlIlIllllI(final int llllllllllllIllllIIllIlIIlllllIl, final int llllllllllllIllllIIllIlIIlllllII) {
        return llllllllllllIllllIIllIlIIlllllIl < llllllllllllIllllIIllIlIIlllllII;
    }
}
