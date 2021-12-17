// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import net.minecraft.client.resources.model.SimpleBakedModel;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.Vec3i;
import net.minecraft.util.MathHelper;
import net.minecraft.client.resources.model.WeightedBakedModel;
import net.minecraft.world.WorldType;
import net.minecraft.client.resources.IResourceManager;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.util.ReportedException;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.crash.CrashReport;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.BlockPos;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.Block;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.resources.IResourceManagerReloadListener;

public class BlockRendererDispatcher implements IResourceManagerReloadListener
{
    private static final /* synthetic */ String[] llllIllIlllll;
    private final /* synthetic */ GameSettings gameSettings;
    private final /* synthetic */ BlockModelRenderer blockModelRenderer;
    private final /* synthetic */ BlockFluidRenderer fluidRenderer;
    private /* synthetic */ BlockModelShapes blockModelShapes;
    private final /* synthetic */ ChestRenderer chestRenderer;
    private static final /* synthetic */ int[] llllIlllIIIII;
    
    public boolean isRenderTypeChest(final Block lllllllllllllIlIllIIlIIllIIIlllI, final int lllllllllllllIlIllIIlIIllIIlIIII) {
        if (lIlIllIIIIIIIll(lllllllllllllIlIllIIlIIllIIIlllI)) {
            return BlockRendererDispatcher.llllIlllIIIII[2] != 0;
        }
        final int lllllllllllllIlIllIIlIIllIIIllll = lllllllllllllIlIllIIlIIllIIIlllI.getRenderType();
        int n;
        if (lIlIlIllllllllI(lllllllllllllIlIllIIlIIllIIIllll, BlockRendererDispatcher.llllIlllIIIII[0])) {
            n = BlockRendererDispatcher.llllIlllIIIII[2];
            "".length();
            if (-(0x44 ^ 0x41) >= 0) {
                return ((0x41 ^ 0x5C) & ~(0x2 ^ 0x1F)) != 0x0;
            }
        }
        else if (lIlIlIllllllllI(lllllllllllllIlIllIIlIIllIIIllll, BlockRendererDispatcher.llllIlllIIIII[4])) {
            n = BlockRendererDispatcher.llllIlllIIIII[3];
            "".length();
            if ("   ".length() == "  ".length()) {
                return ((0xC ^ 0x54 ^ (0x2F ^ 0x45)) & (0xC1 ^ 0xBD ^ (0xC3 ^ 0x8D) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = BlockRendererDispatcher.llllIlllIIIII[2];
        }
        return n != 0;
    }
    
    private static boolean lIlIlIlllllllll(final Object lllllllllllllIlIllIIlIIlIlIlIllI) {
        return lllllllllllllIlIllIIlIIlIlIlIllI != null;
    }
    
    public boolean renderBlock(final IBlockState lllllllllllllIlIllIIlIIlllIllIlI, final BlockPos lllllllllllllIlIllIIlIIlllIllIIl, final IBlockAccess lllllllllllllIlIllIIlIIllllIIIlI, final WorldRenderer lllllllllllllIlIllIIlIIllllIIIIl) {
        try {
            final int lllllllllllllIlIllIIlIIllllIIIII = lllllllllllllIlIllIIlIIlllIllIlI.getBlock().getRenderType();
            if (lIlIlIllllllllI(lllllllllllllIlIllIIlIIllllIIIII, BlockRendererDispatcher.llllIlllIIIII[1])) {
                return BlockRendererDispatcher.llllIlllIIIII[2] != 0;
            }
            switch (lllllllllllllIlIllIIlIIllllIIIII) {
                case 1: {
                    return this.fluidRenderer.renderFluid(lllllllllllllIlIllIIlIIllllIIIlI, lllllllllllllIlIllIIlIIlllIllIlI, lllllllllllllIlIllIIlIIlllIllIIl, lllllllllllllIlIllIIlIIllllIIIIl);
                }
                case 2: {
                    return BlockRendererDispatcher.llllIlllIIIII[2] != 0;
                }
                case 3: {
                    final IBakedModel lllllllllllllIlIllIIlIIlllIlllll = this.getModelFromBlockState(lllllllllllllIlIllIIlIIlllIllIlI, lllllllllllllIlIllIIlIIllllIIIlI, lllllllllllllIlIllIIlIIlllIllIIl);
                    return this.blockModelRenderer.renderModel(lllllllllllllIlIllIIlIIllllIIIlI, lllllllllllllIlIllIIlIIlllIlllll, lllllllllllllIlIllIIlIIlllIllIlI, lllllllllllllIlIllIIlIIlllIllIIl, lllllllllllllIlIllIIlIIllllIIIIl);
                }
                default: {
                    return BlockRendererDispatcher.llllIlllIIIII[2] != 0;
                }
            }
        }
        catch (Throwable lllllllllllllIlIllIIlIIlllIllllI) {
            final CrashReport lllllllllllllIlIllIIlIIlllIlllIl = CrashReport.makeCrashReport(lllllllllllllIlIllIIlIIlllIllllI, BlockRendererDispatcher.llllIllIlllll[BlockRendererDispatcher.llllIlllIIIII[2]]);
            final CrashReportCategory lllllllllllllIlIllIIlIIlllIlllII = lllllllllllllIlIllIIlIIlllIlllIl.makeCategory(BlockRendererDispatcher.llllIllIlllll[BlockRendererDispatcher.llllIlllIIIII[3]]);
            CrashReportCategory.addBlockInfo(lllllllllllllIlIllIIlIIlllIlllII, lllllllllllllIlIllIIlIIlllIllIIl, lllllllllllllIlIllIIlIIlllIllIlI.getBlock(), lllllllllllllIlIllIIlIIlllIllIlI.getBlock().getMetaFromState(lllllllllllllIlIllIIlIIlllIllIlI));
            throw new ReportedException(lllllllllllllIlIllIIlIIlllIlllIl);
        }
    }
    
    private static String lIlIlIllllllIll(final String lllllllllllllIlIllIIlIIlIllIIlll, final String lllllllllllllIlIllIIlIIlIllIlIII) {
        try {
            final SecretKeySpec lllllllllllllIlIllIIlIIlIllIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIlIIlIllIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllIIlIIlIllIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllIIlIIlIllIlIll.init(BlockRendererDispatcher.llllIlllIIIII[4], lllllllllllllIlIllIIlIIlIllIllII);
            return new String(lllllllllllllIlIllIIlIIlIllIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIlIIlIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIIlIIlIllIlIlI) {
            lllllllllllllIlIllIIlIIlIllIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIlIlllllllIl() {
        (llllIlllIIIII = new int[5])[0] = "   ".length();
        BlockRendererDispatcher.llllIlllIIIII[1] = -" ".length();
        BlockRendererDispatcher.llllIlllIIIII[2] = ((0x6 ^ 0x65) & ~(0x3B ^ 0x58));
        BlockRendererDispatcher.llllIlllIIIII[3] = " ".length();
        BlockRendererDispatcher.llllIlllIIIII[4] = "  ".length();
    }
    
    @Override
    public void onResourceManagerReload(final IResourceManager lllllllllllllIlIllIIlIIllIIIlIlI) {
        this.fluidRenderer.initAtlasSprites();
    }
    
    private static boolean lIlIllIIIIIIIlI(final int lllllllllllllIlIllIIlIIlIlIIllll, final int lllllllllllllIlIllIIlIIlIlIIlllI) {
        return lllllllllllllIlIllIIlIIlIlIIllll != lllllllllllllIlIllIIlIIlIlIIlllI;
    }
    
    static {
        lIlIlIlllllllIl();
        lIlIlIlllllllII();
    }
    
    public void renderBlockBrightness(final IBlockState lllllllllllllIlIllIIlIIllIIllIII, final float lllllllllllllIlIllIIlIIllIIlIlll) {
        final int lllllllllllllIlIllIIlIIllIIllIll = lllllllllllllIlIllIIlIIllIIllIII.getBlock().getRenderType();
        if (lIlIllIIIIIIIlI(lllllllllllllIlIllIIlIIllIIllIll, BlockRendererDispatcher.llllIlllIIIII[1])) {
            switch (lllllllllllllIlIllIIlIIllIIllIll) {
                default: {
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
                case 2: {
                    this.chestRenderer.renderChestBrightness(lllllllllllllIlIllIIlIIllIIllIII.getBlock(), lllllllllllllIlIllIIlIIllIIlIlll);
                    "".length();
                    if (" ".length() == "  ".length()) {
                        return;
                    }
                    break;
                }
                case 3: {
                    final IBakedModel lllllllllllllIlIllIIlIIllIIllIlI = this.getBakedModel(lllllllllllllIlIllIIlIIllIIllIII, null);
                    this.blockModelRenderer.renderModelBrightness(lllllllllllllIlIllIIlIIllIIllIlI, lllllllllllllIlIllIIlIIllIIllIII, lllllllllllllIlIllIIlIIllIIlIlll, (boolean)(BlockRendererDispatcher.llllIlllIIIII[3] != 0));
                    break;
                }
            }
        }
    }
    
    private static String lIlIlIllllllIlI(String lllllllllllllIlIllIIlIIlIllllIIl, final String lllllllllllllIlIllIIlIIlIlllllIl) {
        lllllllllllllIlIllIIlIIlIllllIIl = (short)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIllIIlIIlIllllIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIIlIIlIlllllII = new StringBuilder();
        final char[] lllllllllllllIlIllIIlIIlIllllIll = lllllllllllllIlIllIIlIIlIlllllIl.toCharArray();
        int lllllllllllllIlIllIIlIIlIllllIlI = BlockRendererDispatcher.llllIlllIIIII[2];
        final boolean lllllllllllllIlIllIIlIIlIlllIlII = (Object)((String)lllllllllllllIlIllIIlIIlIllllIIl).toCharArray();
        final byte lllllllllllllIlIllIIlIIlIlllIIll = (byte)lllllllllllllIlIllIIlIIlIlllIlII.length;
        float lllllllllllllIlIllIIlIIlIlllIIlI = BlockRendererDispatcher.llllIlllIIIII[2];
        while (lIlIllIIIIIIlII((int)lllllllllllllIlIllIIlIIlIlllIIlI, lllllllllllllIlIllIIlIIlIlllIIll)) {
            final char lllllllllllllIlIllIIlIIlIlllllll = lllllllllllllIlIllIIlIIlIlllIlII[lllllllllllllIlIllIIlIIlIlllIIlI];
            lllllllllllllIlIllIIlIIlIlllllII.append((char)(lllllllllllllIlIllIIlIIlIlllllll ^ lllllllllllllIlIllIIlIIlIllllIll[lllllllllllllIlIllIIlIIlIllllIlI % lllllllllllllIlIllIIlIIlIllllIll.length]));
            "".length();
            ++lllllllllllllIlIllIIlIIlIllllIlI;
            ++lllllllllllllIlIllIIlIIlIlllIIlI;
            "".length();
            if (-" ".length() > ((0x39 ^ 0x16 ^ (0x99 ^ 0x95)) & (5 + 110 - 12 + 31 ^ 6 + 5 + 100 + 54 ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIIlIIlIlllllII);
    }
    
    public IBakedModel getModelFromBlockState(IBlockState lllllllllllllIlIllIIlIIllIllIIII, final IBlockAccess lllllllllllllIlIllIIlIIllIlIlllI, final BlockPos lllllllllllllIlIllIIlIIllIllIlIl) {
        final Block lllllllllllllIlIllIIlIIllIllIIll = lllllllllllllIlIllIIlIIllIllIIII.getBlock();
        if (lIlIllIIIIIIIIl(lllllllllllllIlIllIIlIIllIlIlllI.getWorldType(), WorldType.DEBUG_WORLD)) {
            try {
                lllllllllllllIlIllIIlIIllIllIIII = lllllllllllllIlIllIIlIIllIllIIll.getActualState(lllllllllllllIlIllIIlIIllIllIIII, lllllllllllllIlIllIIlIIllIlIlllI, lllllllllllllIlIllIIlIIllIllIlIl);
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (Exception ex) {}
        }
        IBakedModel lllllllllllllIlIllIIlIIllIllIIlI = this.blockModelShapes.getModelForState(lllllllllllllIlIllIIlIIllIllIIII);
        if (lIlIlIlllllllll(lllllllllllllIlIllIIlIIllIllIlIl) && lIlIllIIIIIIIII(this.gameSettings.allowBlockAlternatives ? 1 : 0) && lIlIllIIIIIIIII((lllllllllllllIlIllIIlIIllIllIIlI instanceof WeightedBakedModel) ? 1 : 0)) {
            lllllllllllllIlIllIIlIIllIllIIlI = ((WeightedBakedModel)lllllllllllllIlIllIIlIIllIllIIlI).getAlternativeModel(MathHelper.getPositionRandom(lllllllllllllIlIllIIlIIllIllIlIl));
        }
        return lllllllllllllIlIllIIlIIllIllIIlI;
    }
    
    public BlockRendererDispatcher(final BlockModelShapes lllllllllllllIlIllIIlIlIIIIlIIII, final GameSettings lllllllllllllIlIllIIlIlIIIIIllII) {
        this.blockModelRenderer = new BlockModelRenderer();
        this.chestRenderer = new ChestRenderer();
        this.fluidRenderer = new BlockFluidRenderer();
        this.blockModelShapes = lllllllllllllIlIllIIlIlIIIIlIIII;
        this.gameSettings = lllllllllllllIlIllIIlIlIIIIIllII;
    }
    
    private static boolean lIlIllIIIIIIIIl(final Object lllllllllllllIlIllIIlIIlIlIllIIl, final Object lllllllllllllIlIllIIlIIlIlIllIII) {
        return lllllllllllllIlIllIIlIIlIlIllIIl != lllllllllllllIlIllIIlIIlIlIllIII;
    }
    
    private IBakedModel getBakedModel(final IBlockState lllllllllllllIlIllIIlIIlllIIIlll, final BlockPos lllllllllllllIlIllIIlIIlllIIIllI) {
        IBakedModel lllllllllllllIlIllIIlIIlllIIlIIl = this.blockModelShapes.getModelForState(lllllllllllllIlIllIIlIIlllIIIlll);
        if (lIlIlIlllllllll(lllllllllllllIlIllIIlIIlllIIIllI) && lIlIllIIIIIIIII(this.gameSettings.allowBlockAlternatives ? 1 : 0) && lIlIllIIIIIIIII((lllllllllllllIlIllIIlIIlllIIlIIl instanceof WeightedBakedModel) ? 1 : 0)) {
            lllllllllllllIlIllIIlIIlllIIlIIl = ((WeightedBakedModel)lllllllllllllIlIllIIlIIlllIIlIIl).getAlternativeModel(MathHelper.getPositionRandom(lllllllllllllIlIllIIlIIlllIIIllI));
        }
        return lllllllllllllIlIllIIlIIlllIIlIIl;
    }
    
    public void renderBlockDamage(IBlockState lllllllllllllIlIllIIlIIllllllllI, final BlockPos lllllllllllllIlIllIIlIIlllllIlII, final TextureAtlasSprite lllllllllllllIlIllIIlIIlllllIIll, final IBlockAccess lllllllllllllIlIllIIlIIllllllIll) {
        final Block lllllllllllllIlIllIIlIIllllllIlI = lllllllllllllIlIllIIlIIllllllllI.getBlock();
        final int lllllllllllllIlIllIIlIIllllllIIl = lllllllllllllIlIllIIlIIllllllIlI.getRenderType();
        if (lIlIlIllllllllI(lllllllllllllIlIllIIlIIllllllIIl, BlockRendererDispatcher.llllIlllIIIII[0])) {
            lllllllllllllIlIllIIlIIllllllllI = lllllllllllllIlIllIIlIIllllllIlI.getActualState(lllllllllllllIlIllIIlIIllllllllI, lllllllllllllIlIllIIlIIllllllIll, lllllllllllllIlIllIIlIIlllllIlII);
            final IBakedModel lllllllllllllIlIllIIlIIllllllIII = this.blockModelShapes.getModelForState(lllllllllllllIlIllIIlIIllllllllI);
            final IBakedModel lllllllllllllIlIllIIlIIlllllIlll = new SimpleBakedModel.Builder(lllllllllllllIlIllIIlIIllllllIII, lllllllllllllIlIllIIlIIlllllIIll).makeBakedModel();
            this.blockModelRenderer.renderModel(lllllllllllllIlIllIIlIIllllllIll, lllllllllllllIlIllIIlIIlllllIlll, lllllllllllllIlIllIIlIIllllllllI, lllllllllllllIlIllIIlIIlllllIlII, Tessellator.getInstance().getWorldRenderer());
            "".length();
        }
    }
    
    public BlockModelRenderer getBlockModelRenderer() {
        return this.blockModelRenderer;
    }
    
    public BlockModelShapes getBlockModelShapes() {
        return this.blockModelShapes;
    }
    
    private static boolean lIlIllIIIIIIIll(final Object lllllllllllllIlIllIIlIIlIlIlIlII) {
        return lllllllllllllIlIllIIlIIlIlIlIlII == null;
    }
    
    private static boolean lIlIlIllllllllI(final int lllllllllllllIlIllIIlIIlIllIIIIl, final int lllllllllllllIlIllIIlIIlIllIIIII) {
        return lllllllllllllIlIllIIlIIlIllIIIIl == lllllllllllllIlIllIIlIIlIllIIIII;
    }
    
    private static boolean lIlIllIIIIIIIII(final int lllllllllllllIlIllIIlIIlIlIlIIlI) {
        return lllllllllllllIlIllIIlIIlIlIlIIlI != 0;
    }
    
    private static void lIlIlIlllllllII() {
        (llllIllIlllll = new String[BlockRendererDispatcher.llllIlllIIIII[4]])[BlockRendererDispatcher.llllIlllIIIII[2]] = lIlIlIllllllIlI("JBQnPBQcECAmHxdRNiMeExp0Jh9QBjs9HRQ=", "pqTOq");
        BlockRendererDispatcher.llllIllIlllll[BlockRendererDispatcher.llllIlllIIIII[3]] = lIlIlIllllllIll("ZMPa6OtfmWVyzUArAGhPPOQNgYWDs2xq", "LtqQn");
    }
    
    private static boolean lIlIllIIIIIIlII(final int lllllllllllllIlIllIIlIIlIlIlllIl, final int lllllllllllllIlIllIIlIIlIlIlllII) {
        return lllllllllllllIlIllIIlIIlIlIlllIl < lllllllllllllIlIllIIlIIlIlIlllII;
    }
}
