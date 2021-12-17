// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.chunk;

import net.minecraft.client.renderer.OpenGlHelper;
import com.google.common.collect.Maps;
import net.minecraft.client.renderer.GLAllocation;
import com.google.common.collect.Sets;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.client.renderer.vertex.VertexBuffer;
import net.minecraft.util.AxisAlignedBB;
import java.nio.FloatBuffer;
import net.minecraft.world.World;
import net.minecraft.tileentity.TileEntity;
import java.util.Set;
import net.minecraft.client.renderer.RenderGlobal;
import java.util.concurrent.locks.ReentrantLock;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import java.util.EnumMap;

public class RenderChunk
{
    public /* synthetic */ CompiledChunk compiledChunk;
    private /* synthetic */ EnumMap<EnumFacing, BlockPos> field_181702_p;
    private final /* synthetic */ ReentrantLock lockCompiledChunk;
    private /* synthetic */ int frameIndex;
    private final /* synthetic */ RenderGlobal renderGlobal;
    private final /* synthetic */ int index;
    private /* synthetic */ boolean needsUpdate;
    private static final /* synthetic */ int[] lIIlIlIlllIlll;
    private final /* synthetic */ Set<TileEntity> field_181056_j;
    private /* synthetic */ ChunkCompileTaskGenerator compileTask;
    private /* synthetic */ World world;
    private final /* synthetic */ ReentrantLock lockCompileTask;
    private /* synthetic */ BlockPos position;
    private final /* synthetic */ FloatBuffer modelviewMatrix;
    public /* synthetic */ AxisAlignedBB boundingBox;
    private final /* synthetic */ VertexBuffer[] vertexBuffers;
    
    public void setPosition(final BlockPos lllllllllllllIIllIIllIIllIlllIII) {
        this.stopCompileTask();
        this.position = lllllllllllllIIllIIllIIllIlllIII;
        this.boundingBox = new AxisAlignedBB(lllllllllllllIIllIIllIIllIlllIII, lllllllllllllIIllIIllIIllIlllIII.add(RenderChunk.lIIlIlIlllIlll[0], RenderChunk.lIIlIlIlllIlll[0], RenderChunk.lIIlIlIlllIlll[0]));
        final int lllllllllllllIIllIIllIIllIllIIIl;
        final double lllllllllllllIIllIIllIIllIllIIlI = ((EnumFacing[])(Object)(lllllllllllllIIllIIllIIllIllIIIl = (int)(Object)EnumFacing.values())).length;
        boolean lllllllllllllIIllIIllIIllIllIIll = RenderChunk.lIIlIlIlllIlll[3] != 0;
        "".length();
        if (((0x86 ^ 0x82 ^ (0x2D ^ 0x78)) & (0x77 ^ 0x6C ^ (0x20 ^ 0x6A) ^ -" ".length())) > ((191 + 153 - 254 + 141 ^ 104 + 55 - 22 + 33) & (0x31 ^ 0x74 ^ (0x55 ^ 0x5D) ^ -" ".length()))) {
            return;
        }
        while (!llIlIIIlIllIlll(lllllllllllllIIllIIllIIllIllIIll ? 1 : 0, (int)lllllllllllllIIllIIllIIllIllIIlI)) {
            final EnumFacing lllllllllllllIIllIIllIIllIllIlll = lllllllllllllIIllIIllIIllIllIIIl[lllllllllllllIIllIIllIIllIllIIll];
            this.field_181702_p.put(lllllllllllllIIllIIllIIllIllIlll, lllllllllllllIIllIIllIIllIlllIII.offset(lllllllllllllIIllIIllIIllIllIlll, RenderChunk.lIIlIlIlllIlll[0]));
            "".length();
            ++lllllllllllllIIllIIllIIllIllIIll;
        }
        this.initModelviewMatrix();
    }
    
    public void rebuildChunk(final float lllllllllllllIIllIIllIIlIllIlllI, final float lllllllllllllIIllIIllIIllIIIIlll, final float lllllllllllllIIllIIllIIlIllIllII, final ChunkCompileTaskGenerator lllllllllllllIIllIIllIIllIIIIlIl) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   net/minecraft/client/renderer/chunk/CompiledChunk.<init>:()V
        //     7: astore          lllllllllllllIIllIIllIIllIIIIlII
        //     9: getstatic       net/minecraft/client/renderer/chunk/RenderChunk.lIIlIlIlllIlll:[I
        //    12: iconst_2       
        //    13: iaload         
        //    14: istore          lllllllllllllIIllIIllIIllIIIIIll
        //    16: aload_0         /* lllllllllllllIIllIIllIIllIIIlIIl */
        //    17: getfield        net/minecraft/client/renderer/chunk/RenderChunk.position:Lnet/minecraft/util/BlockPos;
        //    20: astore          lllllllllllllIIllIIllIIllIIIIIlI
        //    22: aload           lllllllllllllIIllIIllIIllIIIIIlI
        //    24: getstatic       net/minecraft/client/renderer/chunk/RenderChunk.lIIlIlIlllIlll:[I
        //    27: iconst_4       
        //    28: iaload         
        //    29: getstatic       net/minecraft/client/renderer/chunk/RenderChunk.lIIlIlIlllIlll:[I
        //    32: iconst_4       
        //    33: iaload         
        //    34: getstatic       net/minecraft/client/renderer/chunk/RenderChunk.lIIlIlIlllIlll:[I
        //    37: iconst_4       
        //    38: iaload         
        //    39: invokevirtual   net/minecraft/util/BlockPos.add:(III)Lnet/minecraft/util/BlockPos;
        //    42: astore          lllllllllllllIIllIIllIIllIIIIIIl
        //    44: aload           lllllllllllllIIllIIllIIlIllIlIll
        //    46: invokevirtual   net/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator.getLock:()Ljava/util/concurrent/locks/ReentrantLock;
        //    49: invokevirtual   java/util/concurrent/locks/ReentrantLock.lock:()V
        //    52: aload           lllllllllllllIIllIIllIIlIllIlIll
        //    54: invokevirtual   net/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator.getStatus:()Lnet/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator$Status;
        //    57: getstatic       net/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator$Status.COMPILING:Lnet/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator$Status;
        //    60: invokestatic    net/minecraft/client/renderer/chunk/RenderChunk.llIlIIIlIlllIlI:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    63: ifeq            75
        //    66: aload           lllllllllllllIIllIIllIIlIllIlIll
        //    68: invokevirtual   net/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator.getLock:()Ljava/util/concurrent/locks/ReentrantLock;
        //    71: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //    74: return         
        //    75: new             Lnet/minecraft/client/renderer/RegionRenderCache;
        //    78: dup            
        //    79: aload_0         /* lllllllllllllIIllIIllIIllIIIlIIl */
        //    80: getfield        net/minecraft/client/renderer/chunk/RenderChunk.world:Lnet/minecraft/world/World;
        //    83: aload           lllllllllllllIIllIIllIIllIIIIIlI
        //    85: getstatic       net/minecraft/client/renderer/chunk/RenderChunk.lIIlIlIlllIlll:[I
        //    88: iconst_1       
        //    89: iaload         
        //    90: getstatic       net/minecraft/client/renderer/chunk/RenderChunk.lIIlIlIlllIlll:[I
        //    93: iconst_1       
        //    94: iaload         
        //    95: getstatic       net/minecraft/client/renderer/chunk/RenderChunk.lIIlIlIlllIlll:[I
        //    98: iconst_1       
        //    99: iaload         
        //   100: invokevirtual   net/minecraft/util/BlockPos.add:(III)Lnet/minecraft/util/BlockPos;
        //   103: aload           lllllllllllllIIllIIllIIllIIIIIIl
        //   105: getstatic       net/minecraft/client/renderer/chunk/RenderChunk.lIIlIlIlllIlll:[I
        //   108: iconst_2       
        //   109: iaload         
        //   110: getstatic       net/minecraft/client/renderer/chunk/RenderChunk.lIIlIlIlllIlll:[I
        //   113: iconst_2       
        //   114: iaload         
        //   115: getstatic       net/minecraft/client/renderer/chunk/RenderChunk.lIIlIlIlllIlll:[I
        //   118: iconst_2       
        //   119: iaload         
        //   120: invokevirtual   net/minecraft/util/BlockPos.add:(III)Lnet/minecraft/util/BlockPos;
        //   123: getstatic       net/minecraft/client/renderer/chunk/RenderChunk.lIIlIlIlllIlll:[I
        //   126: iconst_2       
        //   127: iaload         
        //   128: invokespecial   net/minecraft/client/renderer/RegionRenderCache.<init>:(Lnet/minecraft/world/World;Lnet/minecraft/util/BlockPos;Lnet/minecraft/util/BlockPos;I)V
        //   131: astore          lllllllllllllIIllIIllIIllIIIIIII
        //   133: aload           lllllllllllllIIllIIllIIlIllIlIll
        //   135: aload           lllllllllllllIIllIIllIIllIIIIlII
        //   137: invokevirtual   net/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator.setCompiledChunk:(Lnet/minecraft/client/renderer/chunk/CompiledChunk;)V
        //   140: ldc             ""
        //   142: invokevirtual   java/lang/String.length:()I
        //   145: pop            
        //   146: ldc             " "
        //   148: invokevirtual   java/lang/String.length:()I
        //   151: ldc             " "
        //   153: invokevirtual   java/lang/String.length:()I
        //   156: if_icmpge       173
        //   159: return         
        //   160: astore          10
        //   162: aload           lllllllllllllIIllIIllIIlIllIlIll
        //   164: invokevirtual   net/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator.getLock:()Ljava/util/concurrent/locks/ReentrantLock;
        //   167: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //   170: aload           10
        //   172: athrow         
        //   173: aload           lllllllllllllIIllIIllIIlIllIlIll
        //   175: invokevirtual   net/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator.getLock:()Ljava/util/concurrent/locks/ReentrantLock;
        //   178: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //   181: new             Lnet/minecraft/client/renderer/chunk/VisGraph;
        //   184: dup            
        //   185: invokespecial   net/minecraft/client/renderer/chunk/VisGraph.<init>:()V
        //   188: astore          lllllllllllllIIllIIllIIlIllllllI
        //   190: invokestatic    com/google/common/collect/Sets.newHashSet:()Ljava/util/HashSet;
        //   193: astore          lllllllllllllIIllIIllIIlIlllllIl
        //   195: aload           lllllllllllllIIllIIllIIlIlllllll
        //   197: invokeinterface net/minecraft/world/IBlockAccess.extendedLevelsInChunkCache:()Z
        //   202: invokestatic    net/minecraft/client/renderer/chunk/RenderChunk.llIlIIIlIllIlIl:(I)Z
        //   205: ifeq            613
        //   208: getstatic       net/minecraft/client/renderer/chunk/RenderChunk.renderChunksUpdated:I
        //   211: getstatic       net/minecraft/client/renderer/chunk/RenderChunk.lIIlIlIlllIlll:[I
        //   214: iconst_2       
        //   215: iaload         
        //   216: iadd           
        //   217: putstatic       net/minecraft/client/renderer/chunk/RenderChunk.renderChunksUpdated:I
        //   220: invokestatic    net/minecraft/util/EnumWorldBlockLayer.values:()[Lnet/minecraft/util/EnumWorldBlockLayer;
        //   223: arraylength    
        //   224: newarray        Z
        //   226: astore          lllllllllllllIIllIIllIIlIlllllII
        //   228: invokestatic    net/minecraft/client/Minecraft.getMinecraft:()Lnet/minecraft/client/Minecraft;
        //   231: invokevirtual   net/minecraft/client/Minecraft.getBlockRendererDispatcher:()Lnet/minecraft/client/renderer/BlockRendererDispatcher;
        //   234: astore          lllllllllllllIIllIIllIIlIllllIll
        //   236: aload           lllllllllllllIIllIIllIIllIIIIIlI
        //   238: aload           lllllllllllllIIllIIllIIllIIIIIIl
        //   240: invokestatic    net/minecraft/util/BlockPos.getAllInBoxMutable:(Lnet/minecraft/util/BlockPos;Lnet/minecraft/util/BlockPos;)Ljava/lang/Iterable;
        //   243: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   248: astore          lllllllllllllIIllIIllIIlIllIIIII
        //   250: ldc             ""
        //   252: invokevirtual   java/lang/String.length:()I
        //   255: pop            
        //   256: ldc             "   "
        //   258: invokevirtual   java/lang/String.length:()I
        //   261: ineg           
        //   262: iflt            493
        //   265: return         
        //   266: aload           lllllllllllllIIllIIllIIlIllIIIII
        //   268: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   273: checkcast       Lnet/minecraft/util/BlockPos$MutableBlockPos;
        //   276: astore          lllllllllllllIIllIIllIIlIllllIlI
        //   278: aload           lllllllllllllIIllIIllIIlIlllllll
        //   280: aload           lllllllllllllIIllIIllIIlIllllIlI
        //   282: invokeinterface net/minecraft/world/IBlockAccess.getBlockState:(Lnet/minecraft/util/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   287: astore          lllllllllllllIIllIIllIIlIllllIIl
        //   289: aload           lllllllllllllIIllIIllIIlIllllIIl
        //   291: invokeinterface net/minecraft/block/state/IBlockState.getBlock:()Lnet/minecraft/block/Block;
        //   296: astore          lllllllllllllIIllIIllIIlIllllIII
        //   298: aload           lllllllllllllIIllIIllIIlIllllIII
        //   300: invokevirtual   net/minecraft/block/Block.isOpaqueCube:()Z
        //   303: invokestatic    net/minecraft/client/renderer/chunk/RenderChunk.llIlIIIlIllIllI:(I)Z
        //   306: ifeq            316
        //   309: aload           lllllllllllllIIllIIllIIlIllllllI
        //   311: aload           lllllllllllllIIllIIllIIlIllllIlI
        //   313: invokevirtual   net/minecraft/client/renderer/chunk/VisGraph.func_178606_a:(Lnet/minecraft/util/BlockPos;)V
        //   316: aload           lllllllllllllIIllIIllIIlIllllIII
        //   318: invokevirtual   net/minecraft/block/Block.hasTileEntity:()Z
        //   321: invokestatic    net/minecraft/client/renderer/chunk/RenderChunk.llIlIIIlIllIllI:(I)Z
        //   324: ifeq            402
        //   327: aload           lllllllllllllIIllIIllIIlIlllllll
        //   329: new             Lnet/minecraft/util/BlockPos;
        //   332: dup            
        //   333: aload           lllllllllllllIIllIIllIIlIllllIlI
        //   335: invokespecial   net/minecraft/util/BlockPos.<init>:(Lnet/minecraft/util/Vec3i;)V
        //   338: invokeinterface net/minecraft/world/IBlockAccess.getTileEntity:(Lnet/minecraft/util/BlockPos;)Lnet/minecraft/tileentity/TileEntity;
        //   343: astore          lllllllllllllIIllIIllIIlIlllIlll
        //   345: getstatic       net/minecraft/client/renderer/tileentity/TileEntityRendererDispatcher.instance:Lnet/minecraft/client/renderer/tileentity/TileEntityRendererDispatcher;
        //   348: aload           lllllllllllllIIllIIllIIlIlllIlll
        //   350: invokevirtual   net/minecraft/client/renderer/tileentity/TileEntityRendererDispatcher.getSpecialRenderer:(Lnet/minecraft/tileentity/TileEntity;)Lnet/minecraft/client/renderer/tileentity/TileEntitySpecialRenderer;
        //   353: astore          lllllllllllllIIllIIllIIlIlllIllI
        //   355: aload           lllllllllllllIIllIIllIIlIlllIlll
        //   357: invokestatic    net/minecraft/client/renderer/chunk/RenderChunk.llIlIIIlIlllIIl:(Ljava/lang/Object;)Z
        //   360: ifeq            402
        //   363: aload           lllllllllllllIIllIIllIIlIlllIllI
        //   365: invokestatic    net/minecraft/client/renderer/chunk/RenderChunk.llIlIIIlIlllIIl:(Ljava/lang/Object;)Z
        //   368: ifeq            402
        //   371: aload           lllllllllllllIIllIIllIIllIIIIlII
        //   373: aload           lllllllllllllIIllIIllIIlIlllIlll
        //   375: invokevirtual   net/minecraft/client/renderer/chunk/CompiledChunk.addTileEntity:(Lnet/minecraft/tileentity/TileEntity;)V
        //   378: aload           lllllllllllllIIllIIllIIlIlllIllI
        //   380: invokevirtual   net/minecraft/client/renderer/tileentity/TileEntitySpecialRenderer.func_181055_a:()Z
        //   383: invokestatic    net/minecraft/client/renderer/chunk/RenderChunk.llIlIIIlIllIllI:(I)Z
        //   386: ifeq            402
        //   389: aload           lllllllllllllIIllIIllIIlIlllllIl
        //   391: aload           lllllllllllllIIllIIllIIlIlllIlll
        //   393: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   396: ldc             ""
        //   398: invokevirtual   java/lang/String.length:()I
        //   401: pop2           
        //   402: aload           lllllllllllllIIllIIllIIlIllllIII
        //   404: invokevirtual   net/minecraft/block/Block.getBlockLayer:()Lnet/minecraft/util/EnumWorldBlockLayer;
        //   407: astore          lllllllllllllIIllIIllIIlIlllIlIl
        //   409: aload           lllllllllllllIIllIIllIIlIlllIlIl
        //   411: invokevirtual   net/minecraft/util/EnumWorldBlockLayer.ordinal:()I
        //   414: istore          lllllllllllllIIllIIllIIlIlllIlII
        //   416: aload           lllllllllllllIIllIIllIIlIllllIII
        //   418: invokevirtual   net/minecraft/block/Block.getRenderType:()I
        //   421: getstatic       net/minecraft/client/renderer/chunk/RenderChunk.lIIlIlIlllIlll:[I
        //   424: iconst_1       
        //   425: iaload         
        //   426: invokestatic    net/minecraft/client/renderer/chunk/RenderChunk.llIlIIIlIlllIll:(II)Z
        //   429: ifeq            493
        //   432: aload           lllllllllllllIIllIIllIIlIllIlIll
        //   434: invokevirtual   net/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator.getRegionRenderCacheBuilder:()Lnet/minecraft/client/renderer/RegionRenderCacheBuilder;
        //   437: iload           lllllllllllllIIllIIllIIlIlllIlII
        //   439: invokevirtual   net/minecraft/client/renderer/RegionRenderCacheBuilder.getWorldRendererByLayerId:(I)Lnet/minecraft/client/renderer/WorldRenderer;
        //   442: astore          lllllllllllllIIllIIllIIlIlllIIll
        //   444: aload           lllllllllllllIIllIIllIIllIIIIlII
        //   446: aload           lllllllllllllIIllIIllIIlIlllIlIl
        //   448: invokevirtual   net/minecraft/client/renderer/chunk/CompiledChunk.isLayerStarted:(Lnet/minecraft/util/EnumWorldBlockLayer;)Z
        //   451: invokestatic    net/minecraft/client/renderer/chunk/RenderChunk.llIlIIIlIllIlIl:(I)Z
        //   454: ifeq            472
        //   457: aload           lllllllllllllIIllIIllIIllIIIIlII
        //   459: aload           lllllllllllllIIllIIllIIlIlllIlIl
        //   461: invokevirtual   net/minecraft/client/renderer/chunk/CompiledChunk.setLayerStarted:(Lnet/minecraft/util/EnumWorldBlockLayer;)V
        //   464: aload_0         /* lllllllllllllIIllIIllIIllIIIlIIl */
        //   465: aload           lllllllllllllIIllIIllIIlIlllIIll
        //   467: aload           lllllllllllllIIllIIllIIllIIIIIlI
        //   469: invokespecial   net/minecraft/client/renderer/chunk/RenderChunk.preRenderBlocks:(Lnet/minecraft/client/renderer/WorldRenderer;Lnet/minecraft/util/BlockPos;)V
        //   472: aload           lllllllllllllIIllIIllIIlIlllllII
        //   474: iload           lllllllllllllIIllIIllIIlIlllIlII
        //   476: dup2           
        //   477: baload         
        //   478: aload           lllllllllllllIIllIIllIIlIllllIll
        //   480: aload           lllllllllllllIIllIIllIIlIllllIIl
        //   482: aload           lllllllllllllIIllIIllIIlIllllIlI
        //   484: aload           lllllllllllllIIllIIllIIlIlllllll
        //   486: aload           lllllllllllllIIllIIllIIlIlllIIll
        //   488: invokevirtual   net/minecraft/client/renderer/BlockRendererDispatcher.renderBlock:(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/BlockPos;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/client/renderer/WorldRenderer;)Z
        //   491: ior            
        //   492: bastore        
        //   493: aload           lllllllllllllIIllIIllIIlIllIIIII
        //   495: invokeinterface java/util/Iterator.hasNext:()Z
        //   500: invokestatic    net/minecraft/client/renderer/chunk/RenderChunk.llIlIIIlIllIlIl:(I)Z
        //   503: ifeq            266
        //   506: invokestatic    net/minecraft/util/EnumWorldBlockLayer.values:()[Lnet/minecraft/util/EnumWorldBlockLayer;
        //   509: dup            
        //   510: astore          17
        //   512: arraylength    
        //   513: istore          lllllllllllllIIllIIllIIlIlIlllll
        //   515: getstatic       net/minecraft/client/renderer/chunk/RenderChunk.lIIlIlIlllIlll:[I
        //   518: iconst_3       
        //   519: iaload         
        //   520: istore          lllllllllllllIIllIIllIIlIllIIIII
        //   522: ldc             ""
        //   524: invokevirtual   java/lang/String.length:()I
        //   527: pop            
        //   528: ldc             "   "
        //   530: invokevirtual   java/lang/String.length:()I
        //   533: ineg           
        //   534: iflt            603
        //   537: return         
        //   538: aload           17
        //   540: iload           lllllllllllllIIllIIllIIlIllIIIII
        //   542: aaload         
        //   543: astore          lllllllllllllIIllIIllIIlIlllIIlI
        //   545: aload           lllllllllllllIIllIIllIIlIlllllII
        //   547: aload           lllllllllllllIIllIIllIIlIlllIIlI
        //   549: invokevirtual   net/minecraft/util/EnumWorldBlockLayer.ordinal:()I
        //   552: baload         
        //   553: invokestatic    net/minecraft/client/renderer/chunk/RenderChunk.llIlIIIlIllIllI:(I)Z
        //   556: ifeq            566
        //   559: aload           lllllllllllllIIllIIllIIllIIIIlII
        //   561: aload           lllllllllllllIIllIIllIIlIlllIIlI
        //   563: invokevirtual   net/minecraft/client/renderer/chunk/CompiledChunk.setLayerUsed:(Lnet/minecraft/util/EnumWorldBlockLayer;)V
        //   566: aload           lllllllllllllIIllIIllIIllIIIIlII
        //   568: aload           lllllllllllllIIllIIllIIlIlllIIlI
        //   570: invokevirtual   net/minecraft/client/renderer/chunk/CompiledChunk.isLayerStarted:(Lnet/minecraft/util/EnumWorldBlockLayer;)Z
        //   573: invokestatic    net/minecraft/client/renderer/chunk/RenderChunk.llIlIIIlIllIllI:(I)Z
        //   576: ifeq            600
        //   579: aload_0         /* lllllllllllllIIllIIllIIllIIIlIIl */
        //   580: aload           lllllllllllllIIllIIllIIlIlllIIlI
        //   582: fload_1         /* lllllllllllllIIllIIllIIllIIIlIII */
        //   583: fload_2         /* lllllllllllllIIllIIllIIlIllIllIl */
        //   584: fload_3         /* lllllllllllllIIllIIllIIllIIIIllI */
        //   585: aload           lllllllllllllIIllIIllIIlIllIlIll
        //   587: invokevirtual   net/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator.getRegionRenderCacheBuilder:()Lnet/minecraft/client/renderer/RegionRenderCacheBuilder;
        //   590: aload           lllllllllllllIIllIIllIIlIlllIIlI
        //   592: invokevirtual   net/minecraft/client/renderer/RegionRenderCacheBuilder.getWorldRendererByLayer:(Lnet/minecraft/util/EnumWorldBlockLayer;)Lnet/minecraft/client/renderer/WorldRenderer;
        //   595: aload           lllllllllllllIIllIIllIIllIIIIlII
        //   597: invokespecial   net/minecraft/client/renderer/chunk/RenderChunk.postRenderBlocks:(Lnet/minecraft/util/EnumWorldBlockLayer;FFFLnet/minecraft/client/renderer/WorldRenderer;Lnet/minecraft/client/renderer/chunk/CompiledChunk;)V
        //   600: iinc            lllllllllllllIIllIIllIIlIllIIIII, 1
        //   603: iload           lllllllllllllIIllIIllIIlIllIIIII
        //   605: iload           lllllllllllllIIllIIllIIlIlIlllll
        //   607: invokestatic    net/minecraft/client/renderer/chunk/RenderChunk.llIlIIIlIllIlll:(II)Z
        //   610: ifeq            538
        //   613: aload           lllllllllllllIIllIIllIIllIIIIlII
        //   615: aload           lllllllllllllIIllIIllIIlIllllllI
        //   617: invokevirtual   net/minecraft/client/renderer/chunk/VisGraph.computeVisibility:()Lnet/minecraft/client/renderer/chunk/SetVisibility;
        //   620: invokevirtual   net/minecraft/client/renderer/chunk/CompiledChunk.setVisibility:(Lnet/minecraft/client/renderer/chunk/SetVisibility;)V
        //   623: aload_0         /* lllllllllllllIIllIIllIIllIIIlIIl */
        //   624: getfield        net/minecraft/client/renderer/chunk/RenderChunk.lockCompileTask:Ljava/util/concurrent/locks/ReentrantLock;
        //   627: invokevirtual   java/util/concurrent/locks/ReentrantLock.lock:()V
        //   630: aload           lllllllllllllIIllIIllIIlIlllllIl
        //   632: invokestatic    com/google/common/collect/Sets.newHashSet:(Ljava/lang/Iterable;)Ljava/util/HashSet;
        //   635: astore          lllllllllllllIIllIIllIIlIlllIIIl
        //   637: aload_0         /* lllllllllllllIIllIIllIIllIIIlIIl */
        //   638: getfield        net/minecraft/client/renderer/chunk/RenderChunk.field_181056_j:Ljava/util/Set;
        //   641: invokestatic    com/google/common/collect/Sets.newHashSet:(Ljava/lang/Iterable;)Ljava/util/HashSet;
        //   644: astore          lllllllllllllIIllIIllIIlIlllIIII
        //   646: aload           lllllllllllllIIllIIllIIlIlllIIIl
        //   648: aload_0         /* lllllllllllllIIllIIllIIllIIIlIIl */
        //   649: getfield        net/minecraft/client/renderer/chunk/RenderChunk.field_181056_j:Ljava/util/Set;
        //   652: invokeinterface java/util/Set.removeAll:(Ljava/util/Collection;)Z
        //   657: ldc             ""
        //   659: invokevirtual   java/lang/String.length:()I
        //   662: pop2           
        //   663: aload           lllllllllllllIIllIIllIIlIlllIIII
        //   665: aload           lllllllllllllIIllIIllIIlIlllllIl
        //   667: invokeinterface java/util/Set.removeAll:(Ljava/util/Collection;)Z
        //   672: ldc             ""
        //   674: invokevirtual   java/lang/String.length:()I
        //   677: pop2           
        //   678: aload_0         /* lllllllllllllIIllIIllIIllIIIlIIl */
        //   679: getfield        net/minecraft/client/renderer/chunk/RenderChunk.field_181056_j:Ljava/util/Set;
        //   682: invokeinterface java/util/Set.clear:()V
        //   687: aload_0         /* lllllllllllllIIllIIllIIllIIIlIIl */
        //   688: getfield        net/minecraft/client/renderer/chunk/RenderChunk.field_181056_j:Ljava/util/Set;
        //   691: aload           lllllllllllllIIllIIllIIlIlllllIl
        //   693: invokeinterface java/util/Set.addAll:(Ljava/util/Collection;)Z
        //   698: ldc             ""
        //   700: invokevirtual   java/lang/String.length:()I
        //   703: pop2           
        //   704: aload_0         /* lllllllllllllIIllIIllIIllIIIlIIl */
        //   705: getfield        net/minecraft/client/renderer/chunk/RenderChunk.renderGlobal:Lnet/minecraft/client/renderer/RenderGlobal;
        //   708: aload           lllllllllllllIIllIIllIIlIlllIIII
        //   710: aload           lllllllllllllIIllIIllIIlIlllIIIl
        //   712: invokevirtual   net/minecraft/client/renderer/RenderGlobal.func_181023_a:(Ljava/util/Collection;Ljava/util/Collection;)V
        //   715: ldc             ""
        //   717: invokevirtual   java/lang/String.length:()I
        //   720: pop            
        //   721: ldc_w           "  "
        //   724: invokevirtual   java/lang/String.length:()I
        //   727: bipush          104
        //   729: bipush          121
        //   731: ixor           
        //   732: bipush          58
        //   734: bipush          43
        //   736: ixor           
        //   737: iconst_m1      
        //   738: ixor           
        //   739: iand           
        //   740: if_icmpge       756
        //   743: return         
        //   744: astore          lllllllllllllIIllIIllIIlIllIIIIl
        //   746: aload_0         /* lllllllllllllIIllIIllIIllIIIlIIl */
        //   747: getfield        net/minecraft/client/renderer/chunk/RenderChunk.lockCompileTask:Ljava/util/concurrent/locks/ReentrantLock;
        //   750: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //   753: aload           lllllllllllllIIllIIllIIlIllIIIIl
        //   755: athrow         
        //   756: aload_0         /* lllllllllllllIIllIIllIIllIIIlIIl */
        //   757: getfield        net/minecraft/client/renderer/chunk/RenderChunk.lockCompileTask:Ljava/util/concurrent/locks/ReentrantLock;
        //   760: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //   763: return         
        //    StackMapTable: 00 0F FF 00 4B 00 09 07 00 02 02 02 02 07 00 0D 07 00 82 01 07 00 12 07 00 12 00 00 F7 00 54 07 01 B7 FC 00 0C 07 00 9E FF 00 5C 00 10 07 00 02 02 02 02 07 00 0D 07 00 82 01 07 00 12 07 00 12 07 00 9E 07 00 A9 07 01 15 07 01 B8 07 01 3C 00 07 00 D9 00 00 FF 00 31 00 12 07 00 02 02 02 02 07 00 0D 07 00 82 01 07 00 12 07 00 12 07 00 9E 07 00 A9 07 01 15 07 01 B8 07 01 3C 07 00 10 07 00 D9 07 00 E3 07 00 E9 00 00 FB 00 55 FE 00 45 07 00 BE 01 07 00 08 FF 00 14 00 10 07 00 02 02 02 02 07 00 0D 07 00 82 01 07 00 12 07 00 12 07 00 9E 07 00 A9 07 01 15 07 01 B8 07 01 3C 00 07 00 D9 00 00 FF 00 2C 00 12 07 00 02 02 02 02 07 00 0D 07 00 82 01 07 00 12 07 00 12 07 00 9E 07 00 A9 07 01 15 07 01 B8 07 01 3C 00 01 01 07 01 BA 00 00 FF 00 1B 00 12 07 00 02 02 02 02 07 00 0D 07 00 82 01 07 00 12 07 00 12 07 00 9E 07 00 A9 07 01 15 07 01 B8 07 01 3C 07 00 BE 01 01 07 01 BA 00 00 21 FF 00 02 00 12 07 00 02 02 02 02 07 00 0D 07 00 82 01 07 00 12 07 00 12 07 00 9E 07 00 A9 07 01 15 07 01 B8 07 01 3C 00 01 01 07 01 BA 00 00 FF 00 09 00 0C 07 00 02 02 02 02 07 00 0D 07 00 82 01 07 00 12 07 00 12 07 00 9E 07 00 A9 07 01 15 00 00 F7 00 82 07 01 B7 FD 00 0B 07 01 15 07 01 15
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  52     66     160    173    Any
        //  75     160    160    173    Any
        //  630    744    744    756    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static boolean llIlIIIlIlllIIl(final Object lllllllllllllIIllIIllIIIlllIIlll) {
        return lllllllllllllIIllIIllIIIlllIIlll != null;
    }
    
    private static boolean llIlIIIlIllIlIl(final int lllllllllllllIIllIIllIIIllIlllll) {
        return lllllllllllllIIllIIllIIIllIlllll == 0;
    }
    
    public void deleteGlResources() {
        this.stopCompileTask();
        this.world = null;
        int lllllllllllllIIllIIllIIlIIIIlIIl = RenderChunk.lIIlIlIlllIlll[3];
        "".length();
        if (" ".length() == 0) {
            return;
        }
        while (!llIlIIIlIllIlll(lllllllllllllIIllIIllIIlIIIIlIIl, EnumWorldBlockLayer.values().length)) {
            if (llIlIIIlIlllIIl(this.vertexBuffers[lllllllllllllIIllIIllIIlIIIIlIIl])) {
                this.vertexBuffers[lllllllllllllIIllIIllIIlIIIIlIIl].deleteGlBuffers();
            }
            ++lllllllllllllIIllIIllIIlIIIIlIIl;
        }
    }
    
    public BlockPos func_181701_a(final EnumFacing lllllllllllllIIllIIllIIIllllIlll) {
        return this.field_181702_p.get(lllllllllllllIIllIIllIIIllllIlll);
    }
    
    public void multModelviewMatrix() {
        GlStateManager.multMatrix(this.modelviewMatrix);
    }
    
    private static boolean llIlIIIlIlllIII(final int lllllllllllllIIllIIllIIIllllIIlI, final int lllllllllllllIIllIIllIIIllllIIIl) {
        return lllllllllllllIIllIIllIIIllllIIlI == lllllllllllllIIllIIllIIIllllIIIl;
    }
    
    private static boolean llIlIIIlIlllIll(final int lllllllllllllIIllIIllIIIllIlllII, final int lllllllllllllIIllIIllIIIllIllIll) {
        return lllllllllllllIIllIIllIIIllIlllII != lllllllllllllIIllIIllIIIllIllIll;
    }
    
    public CompiledChunk getCompiledChunk() {
        return this.compiledChunk;
    }
    
    private void initModelviewMatrix() {
        GlStateManager.pushMatrix();
        GlStateManager.loadIdentity();
        final float lllllllllllllIIllIIllIIlIIlIIIII = 1.000001f;
        GlStateManager.translate(-8.0f, -8.0f, -8.0f);
        GlStateManager.scale(lllllllllllllIIllIIllIIlIIlIIIII, lllllllllllllIIllIIllIIlIIlIIIII, lllllllllllllIIllIIllIIlIIlIIIII);
        GlStateManager.translate(8.0f, 8.0f, 8.0f);
        GlStateManager.getFloat(RenderChunk.lIIlIlIlllIlll[6], this.modelviewMatrix);
        GlStateManager.popMatrix();
    }
    
    public BlockPos getPosition() {
        return this.position;
    }
    
    public boolean setFrameIndex(final int lllllllllllllIIllIIllIIlllIIIllI) {
        if (llIlIIIlIlllIII(this.frameIndex, lllllllllllllIIllIIllIIlllIIIllI)) {
            return RenderChunk.lIIlIlIlllIlll[3] != 0;
        }
        this.frameIndex = lllllllllllllIIllIIllIIlllIIIllI;
        return RenderChunk.lIIlIlIlllIlll[2] != 0;
    }
    
    protected void finishCompileTask() {
        this.lockCompileTask.lock();
        try {
            if (llIlIIIlIlllIIl(this.compileTask) && llIlIIIlIlllIlI(this.compileTask.getStatus(), ChunkCompileTaskGenerator.Status.DONE)) {
                this.compileTask.finish();
                this.compileTask = null;
                "".length();
                if (null != null) {
                    return;
                }
            }
        }
        finally {
            this.lockCompileTask.unlock();
        }
        this.lockCompileTask.unlock();
    }
    
    private static boolean llIlIIIlIllIlll(final int lllllllllllllIIllIIllIIIlllIlllI, final int lllllllllllllIIllIIllIIIlllIllIl) {
        return lllllllllllllIIllIIllIIIlllIlllI >= lllllllllllllIIllIIllIIIlllIllIl;
    }
    
    private static boolean llIlIIIlIlllIlI(final Object lllllllllllllIIllIIllIIIlllIlIlI, final Object lllllllllllllIIllIIllIIIlllIlIIl) {
        return lllllllllllllIIllIIllIIIlllIlIlI != lllllllllllllIIllIIllIIIlllIlIIl;
    }
    
    private void postRenderBlocks(final EnumWorldBlockLayer lllllllllllllIIllIIllIIlIIlIlIIl, final float lllllllllllllIIllIIllIIlIIlIlllI, final float lllllllllllllIIllIIllIIlIIlIIlll, final float lllllllllllllIIllIIllIIlIIlIllII, final WorldRenderer lllllllllllllIIllIIllIIlIIlIlIll, final CompiledChunk lllllllllllllIIllIIllIIlIIlIlIlI) {
        if (llIlIIIlIllllII(lllllllllllllIIllIIllIIlIIlIlIIl, EnumWorldBlockLayer.TRANSLUCENT) && llIlIIIlIllIlIl(lllllllllllllIIllIIllIIlIIlIlIlI.isLayerEmpty(lllllllllllllIIllIIllIIlIIlIlIIl) ? 1 : 0)) {
            lllllllllllllIIllIIllIIlIIlIlIll.func_181674_a(lllllllllllllIIllIIllIIlIIlIlllI, lllllllllllllIIllIIllIIlIIlIIlll, lllllllllllllIIllIIllIIlIIlIllII);
            lllllllllllllIIllIIllIIlIIlIlIlI.setState(lllllllllllllIIllIIllIIlIIlIlIll.func_181672_a());
        }
        lllllllllllllIIllIIllIIlIIlIlIll.finishDrawing();
    }
    
    private static void llIlIIIlIllIlII() {
        (lIIlIlIlllIlll = new int[7])[0] = (0x6E ^ 0x7E);
        RenderChunk.lIIlIlIlllIlll[1] = -" ".length();
        RenderChunk.lIIlIlIlllIlll[2] = " ".length();
        RenderChunk.lIIlIlIlllIlll[3] = ((0xC6 ^ 0x81) & ~(0xEC ^ 0xAB));
        RenderChunk.lIIlIlIlllIlll[4] = (0x7B ^ 0x3E ^ (0x7F ^ 0x35));
        RenderChunk.lIIlIlIlllIlll[5] = (0xA7 ^ 0xA0);
        RenderChunk.lIIlIlIlllIlll[6] = (-(0xFFFFED5E & 0x36FB) & (-1 & 0x2FFF));
    }
    
    public VertexBuffer getVertexBufferByLayer(final int lllllllllllllIIllIIllIIlllIIIIlI) {
        return this.vertexBuffers[lllllllllllllIIllIIllIIlllIIIIlI];
    }
    
    private void preRenderBlocks(final WorldRenderer lllllllllllllIIllIIllIIlIIlllIlI, final BlockPos lllllllllllllIIllIIllIIlIIlllIIl) {
        lllllllllllllIIllIIllIIlIIlllIlI.begin(RenderChunk.lIIlIlIlllIlll[5], DefaultVertexFormats.BLOCK);
        lllllllllllllIIllIIllIIlIIlllIlI.setTranslation(-lllllllllllllIIllIIllIIlIIlllIIl.getX(), -lllllllllllllIIllIIllIIlIIlllIIl.getY(), -lllllllllllllIIllIIllIIlIIlllIIl.getZ());
    }
    
    static {
        llIlIIIlIllIlII();
    }
    
    public boolean isNeedsUpdate() {
        return this.needsUpdate;
    }
    
    private static boolean llIlIIIlIllIllI(final int lllllllllllllIIllIIllIIIlllIIIIl) {
        return lllllllllllllIIllIIllIIIlllIIIIl != 0;
    }
    
    public ReentrantLock getLockCompileTask() {
        return this.lockCompileTask;
    }
    
    public void resortTransparency(final float lllllllllllllIIllIIllIIllIlIIIll, final float lllllllllllllIIllIIllIIllIlIIIlI, final float lllllllllllllIIllIIllIIllIlIIIIl, final ChunkCompileTaskGenerator lllllllllllllIIllIIllIIllIlIIllI) {
        final CompiledChunk lllllllllllllIIllIIllIIllIlIIlIl = lllllllllllllIIllIIllIIllIlIIllI.getCompiledChunk();
        if (llIlIIIlIlllIIl(lllllllllllllIIllIIllIIllIlIIlIl.getState()) && llIlIIIlIllIlIl(lllllllllllllIIllIIllIIllIlIIlIl.isLayerEmpty(EnumWorldBlockLayer.TRANSLUCENT) ? 1 : 0)) {
            this.preRenderBlocks(lllllllllllllIIllIIllIIllIlIIllI.getRegionRenderCacheBuilder().getWorldRendererByLayer(EnumWorldBlockLayer.TRANSLUCENT), this.position);
            lllllllllllllIIllIIllIIllIlIIllI.getRegionRenderCacheBuilder().getWorldRendererByLayer(EnumWorldBlockLayer.TRANSLUCENT).setVertexState(lllllllllllllIIllIIllIIllIlIIlIl.getState());
            this.postRenderBlocks(EnumWorldBlockLayer.TRANSLUCENT, lllllllllllllIIllIIllIIllIlIIIll, lllllllllllllIIllIIllIIllIlIIIlI, lllllllllllllIIllIIllIIllIlIIIIl, lllllllllllllIIllIIllIIllIlIIllI.getRegionRenderCacheBuilder().getWorldRendererByLayer(EnumWorldBlockLayer.TRANSLUCENT), lllllllllllllIIllIIllIIllIlIIlIl);
        }
    }
    
    public ChunkCompileTaskGenerator makeCompileTaskTransparency() {
        this.lockCompileTask.lock();
        try {
            if (!llIlIIIlIlllIIl(this.compileTask) || llIlIIIlIlllIlI(this.compileTask.getStatus(), ChunkCompileTaskGenerator.Status.PENDING)) {
                if (llIlIIIlIlllIIl(this.compileTask) && llIlIIIlIlllIlI(this.compileTask.getStatus(), ChunkCompileTaskGenerator.Status.DONE)) {
                    this.compileTask.finish();
                    this.compileTask = null;
                }
                this.compileTask = new ChunkCompileTaskGenerator(this, ChunkCompileTaskGenerator.Type.RESORT_TRANSPARENCY);
                this.compileTask.setCompiledChunk(this.compiledChunk);
                final long lllllllllllllIIllIIllIIlIIlllllI;
                final ChunkCompileTaskGenerator lllllllllllllIIllIIllIIlIlIIIlII = (ChunkCompileTaskGenerator)(lllllllllllllIIllIIllIIlIIlllllI = (long)this.compileTask);
                return (ChunkCompileTaskGenerator)lllllllllllllIIllIIllIIlIIlllllI;
            }
            final ChunkCompileTaskGenerator lllllllllllllIIllIIllIIlIlIIIIll = null;
            "".length();
            if ((((0xFA ^ 0xA4) & ~(0xDD ^ 0x83)) ^ (0x9F ^ 0x9B)) == 0x0) {
                return null;
            }
        }
        finally {
            this.lockCompileTask.unlock();
        }
        this.lockCompileTask.unlock();
        final ChunkCompileTaskGenerator lllllllllllllIIllIIllIIlIlIIIIlI;
        return lllllllllllllIIllIIllIIlIlIIIIlI;
    }
    
    public ChunkCompileTaskGenerator makeCompileTaskChunk() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        net/minecraft/client/renderer/chunk/RenderChunk.lockCompileTask:Ljava/util/concurrent/locks/ReentrantLock;
        //     4: invokevirtual   java/util/concurrent/locks/ReentrantLock.lock:()V
        //     7: aload_0         /* lllllllllllllIIllIIllIIlIlIIllII */
        //     8: invokevirtual   net/minecraft/client/renderer/chunk/RenderChunk.finishCompileTask:()V
        //    11: aload_0         /* lllllllllllllIIllIIllIIlIlIIllII */
        //    12: new             Lnet/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator;
        //    15: dup            
        //    16: aload_0         /* lllllllllllllIIllIIllIIlIlIIllII */
        //    17: getstatic       net/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator$Type.REBUILD_CHUNK:Lnet/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator$Type;
        //    20: invokespecial   net/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator.<init>:(Lnet/minecraft/client/renderer/chunk/RenderChunk;Lnet/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator$Type;)V
        //    23: putfield        net/minecraft/client/renderer/chunk/RenderChunk.compileTask:Lnet/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator;
        //    26: aload_0         /* lllllllllllllIIllIIllIIlIlIIllII */
        //    27: getfield        net/minecraft/client/renderer/chunk/RenderChunk.compileTask:Lnet/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator;
        //    30: astore_1        /* lllllllllllllIIllIIllIIlIlIIlIll */
        //    31: ldc             ""
        //    33: invokevirtual   java/lang/String.length:()I
        //    36: pop            
        //    37: ldc             "   "
        //    39: invokevirtual   java/lang/String.length:()I
        //    42: ineg           
        //    43: ifle            58
        //    46: aconst_null    
        //    47: areturn        
        //    48: astore_2        /* lllllllllllllIIllIIllIIlIlIIlIlI */
        //    49: aload_0         /* lllllllllllllIIllIIllIIlIlIIllII */
        //    50: getfield        net/minecraft/client/renderer/chunk/RenderChunk.lockCompileTask:Ljava/util/concurrent/locks/ReentrantLock;
        //    53: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //    56: aload_2         /* lllllllllllllIIllIIllIIlIlIIlIlI */
        //    57: athrow         
        //    58: aload_0         /* lllllllllllllIIllIIllIIlIlIIllII */
        //    59: getfield        net/minecraft/client/renderer/chunk/RenderChunk.lockCompileTask:Ljava/util/concurrent/locks/ReentrantLock;
        //    62: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //    65: aload_1         /* lllllllllllllIIllIIllIIlIlIIllIl */
        //    66: areturn        
        //    StackMapTable: 00 02 70 07 01 B7 FC 00 09 07 00 0D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  7      48     48     58     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void setCompiledChunk(final CompiledChunk lllllllllllllIIllIIllIIlIIIlIIIl) {
        this.lockCompiledChunk.lock();
        try {
            this.compiledChunk = lllllllllllllIIllIIllIIlIIIlIIIl;
            "".length();
            if (null != null) {
                return;
            }
        }
        finally {
            this.lockCompiledChunk.unlock();
        }
        this.lockCompiledChunk.unlock();
    }
    
    public void stopCompileTask() {
        this.finishCompileTask();
        this.compiledChunk = CompiledChunk.DUMMY;
    }
    
    public void setNeedsUpdate(final boolean lllllllllllllIIllIIllIIIlllllllI) {
        this.needsUpdate = lllllllllllllIIllIIllIIIlllllllI;
    }
    
    private static boolean llIlIIIlIllllII(final Object lllllllllllllIIllIIllIIIlllIIlII, final Object lllllllllllllIIllIIllIIIlllIIIll) {
        return lllllllllllllIIllIIllIIIlllIIlII == lllllllllllllIIllIIllIIIlllIIIll;
    }
    
    public RenderChunk(final World lllllllllllllIIllIIllIIlllIlIllI, final RenderGlobal lllllllllllllIIllIIllIIlllIIllll, final BlockPos lllllllllllllIIllIIllIIlllIlIlII, final int lllllllllllllIIllIIllIIlllIIllIl) {
        this.compiledChunk = CompiledChunk.DUMMY;
        this.lockCompileTask = new ReentrantLock();
        this.lockCompiledChunk = new ReentrantLock();
        this.compileTask = null;
        this.field_181056_j = (Set<TileEntity>)Sets.newHashSet();
        this.modelviewMatrix = GLAllocation.createDirectFloatBuffer(RenderChunk.lIIlIlIlllIlll[0]);
        this.vertexBuffers = new VertexBuffer[EnumWorldBlockLayer.values().length];
        this.frameIndex = RenderChunk.lIIlIlIlllIlll[1];
        this.needsUpdate = (RenderChunk.lIIlIlIlllIlll[2] != 0);
        this.field_181702_p = (EnumMap<EnumFacing, BlockPos>)Maps.newEnumMap((Class)EnumFacing.class);
        this.world = lllllllllllllIIllIIllIIlllIlIllI;
        this.renderGlobal = lllllllllllllIIllIIllIIlllIIllll;
        this.index = lllllllllllllIIllIIllIIlllIIllIl;
        if (llIlIIIlIllIlIl(lllllllllllllIIllIIllIIlllIlIlII.equals(this.getPosition()) ? 1 : 0)) {
            this.setPosition(lllllllllllllIIllIIllIIlllIlIlII);
        }
        if (llIlIIIlIllIllI(OpenGlHelper.useVbo() ? 1 : 0)) {
            int lllllllllllllIIllIIllIIlllIlIIlI = RenderChunk.lIIlIlIlllIlll[3];
            "".length();
            if ("  ".length() < 0) {
                throw null;
            }
            while (!llIlIIIlIllIlll(lllllllllllllIIllIIllIIlllIlIIlI, EnumWorldBlockLayer.values().length)) {
                this.vertexBuffers[lllllllllllllIIllIIllIIlllIlIIlI] = new VertexBuffer(DefaultVertexFormats.BLOCK);
                ++lllllllllllllIIllIIllIIlllIlIIlI;
            }
        }
    }
}
