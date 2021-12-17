// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.chunk;

import com.google.common.collect.Queues;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.renderer.vertex.VertexBuffer;
import java.util.Collection;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import com.google.common.util.concurrent.Futures;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.Minecraft;
import com.google.common.util.concurrent.ListenableFuture;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.util.EnumWorldBlockLayer;
import com.google.common.util.concurrent.ListenableFutureTask;
import java.util.Queue;
import java.util.concurrent.ThreadFactory;
import net.minecraft.client.renderer.VertexBufferUploader;
import net.minecraft.client.renderer.WorldVertexBufferUploader;
import java.util.List;
import net.minecraft.client.renderer.RegionRenderCacheBuilder;
import java.util.concurrent.BlockingQueue;
import org.apache.logging.log4j.Logger;

public class ChunkRenderDispatcher
{
    private final /* synthetic */ BlockingQueue<RegionRenderCacheBuilder> queueFreeRenderBuilders;
    private final /* synthetic */ List<ChunkRenderWorker> listThreadedWorkers;
    private final /* synthetic */ ChunkRenderWorker renderWorker;
    private static final /* synthetic */ String[] lllIIIllIlllll;
    private static final /* synthetic */ int[] lllIIlIIIlIllI;
    private final /* synthetic */ WorldVertexBufferUploader worldVertexUploader;
    private final /* synthetic */ BlockingQueue<ChunkCompileTaskGenerator> queueChunkUpdates;
    private final /* synthetic */ VertexBufferUploader vertexUploader;
    private static final /* synthetic */ ThreadFactory threadFactory;
    private final /* synthetic */ Queue<ListenableFutureTask<?>> queueChunkUploads;
    
    private static boolean lIIllllIlllIIlll(final int llllllllllllIlIlllllIIlIIIIIIlII) {
        return llllllllllllIlIlllllIIlIIIIIIlII == 0;
    }
    
    private static int lIIllllIlllIIllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public ListenableFuture<Object> uploadChunk(final EnumWorldBlockLayer llllllllllllIlIlllllIIlIIlIlllll, final WorldRenderer llllllllllllIlIlllllIIlIIllIIlII, final RenderChunk llllllllllllIlIlllllIIlIIllIIIll, final CompiledChunk llllllllllllIlIlllllIIlIIllIIIlI) {
        if (lIIllllIlllIlIII(Minecraft.getMinecraft().isCallingFromMinecraftThread() ? 1 : 0)) {
            if (lIIllllIlllIlIII(OpenGlHelper.useVbo() ? 1 : 0)) {
                this.uploadVertexBuffer(llllllllllllIlIlllllIIlIIllIIlII, llllllllllllIlIlllllIIlIIllIIIll.getVertexBufferByLayer(llllllllllllIlIlllllIIlIIlIlllll.ordinal()));
                "".length();
                if (((0x6F ^ 0x4D) & ~(0x84 ^ 0xA6)) != 0x0) {
                    return null;
                }
            }
            else {
                this.uploadDisplayList(llllllllllllIlIlllllIIlIIllIIlII, ((ListedRenderChunk)llllllllllllIlIlllllIIlIIllIIIll).getDisplayList(llllllllllllIlIlllllIIlIIlIlllll, llllllllllllIlIlllllIIlIIllIIIlI), llllllllllllIlIlllllIIlIIllIIIll);
            }
            llllllllllllIlIlllllIIlIIllIIlII.setTranslation(0.0, 0.0, 0.0);
            return (ListenableFuture<Object>)Futures.immediateFuture((Object)null);
        }
        final ListenableFutureTask<Object> llllllllllllIlIlllllIIlIIllIIIIl = (ListenableFutureTask<Object>)ListenableFutureTask.create((Runnable)new Runnable() {
            @Override
            public void run() {
                ChunkRenderDispatcher.this.uploadChunk(llllllllllllIlIlllllIIlIIlIlllll, llllllllllllIlIlllllIIlIIllIIlII, llllllllllllIlIlllllIIlIIllIIIll, llllllllllllIlIlllllIIlIIllIIIlI);
                "".length();
            }
        }, (Object)null);
        synchronized (this.queueChunkUploads) {
            this.queueChunkUploads.add(llllllllllllIlIlllllIIlIIllIIIIl);
            "".length();
            final ListenableFutureTask<Object> listenableFutureTask = llllllllllllIlIlllllIIlIIllIIIIl;
            // monitorexit(this.queueChunkUploads)
            return (ListenableFuture<Object>)listenableFutureTask;
        }
    }
    
    public boolean runChunkUploads(final long llllllllllllIlIlllllIIlIlIllllll) {
        boolean llllllllllllIlIlllllIIlIlIlllllI = ChunkRenderDispatcher.lllIIlIIIlIllI[0] != 0;
        long llllllllllllIlIlllllIIlIlIllllII;
        do {
            boolean llllllllllllIlIlllllIIlIlIllllIl = ChunkRenderDispatcher.lllIIlIIIlIllI[0] != 0;
            synchronized (this.queueChunkUploads) {
                if (lIIllllIlllIIlll(this.queueChunkUploads.isEmpty() ? 1 : 0)) {
                    this.queueChunkUploads.poll().run();
                    llllllllllllIlIlllllIIlIlIllllIl = (ChunkRenderDispatcher.lllIIlIIIlIllI[1] != 0);
                    llllllllllllIlIlllllIIlIlIlllllI = (ChunkRenderDispatcher.lllIIlIIIlIllI[1] != 0);
                }
                // monitorexit(this.queueChunkUploads)
                "".length();
                if ("  ".length() > (0x71 ^ 0x75)) {
                    return ((0x57 ^ 0x7D) & ~(0x90 ^ 0xBA)) != 0x0;
                }
            }
            if (!lIIllllIlllIlIII(lIIllllIlllIIllI(llllllllllllIlIlllllIIlIlIllllll, 0L))) {
                break;
            }
            if (lIIllllIlllIIlll(llllllllllllIlIlllllIIlIlIllllIl ? 1 : 0)) {
                "".length();
                if ((119 + 109 - 147 + 52 ^ 77 + 35 - 13 + 29) <= 0) {
                    return ((0xE2 ^ 0xA3 ^ (0xA7 ^ 0xB2)) & (114 + 155 - 60 + 37 ^ 51 + 30 + 44 + 37 ^ -" ".length())) != 0x0;
                }
                break;
            }
            else {
                llllllllllllIlIlllllIIlIlIllllII = llllllllllllIlIlllllIIlIlIllllll - System.nanoTime();
            }
        } while (!lIIllllIlllIlIIl(lIIllllIlllIIllI(llllllllllllIlIlllllIIlIlIllllII, 0L)));
        return llllllllllllIlIlllllIIlIlIlllllI;
    }
    
    private static boolean lIIllllIlllIlIll(final Object llllllllllllIlIlllllIIlIIIIIlIII) {
        return llllllllllllIlIlllllIIlIIIIIlIII == null;
    }
    
    private static boolean lIIllllIlllIllII(final Object llllllllllllIlIlllllIIlIIIIIlIlI) {
        return llllllllllllIlIlllllIIlIIIIIlIlI != null;
    }
    
    static {
        lIIllllIlllIIlII();
        lIIllllIIIlIllII();
        logger = LogManager.getLogger();
        threadFactory = new ThreadFactoryBuilder().setNameFormat(ChunkRenderDispatcher.lllIIIllIlllll[ChunkRenderDispatcher.lllIIlIIIlIllI[0]]).setDaemon((boolean)(ChunkRenderDispatcher.lllIIlIIIlIllI[1] != 0)).build();
    }
    
    private static boolean lIIllllIlllIlIlI(final int llllllllllllIlIlllllIIlIIIIlIlIl, final int llllllllllllIlIlllllIIlIIIIlIlII) {
        return llllllllllllIlIlllllIIlIIIIlIlIl == llllllllllllIlIlllllIIlIIIIlIlII;
    }
    
    public boolean updateChunkLater(final RenderChunk llllllllllllIlIlllllIIlIlIlIllll) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   net/minecraft/client/renderer/chunk/RenderChunk.getLockCompileTask:()Ljava/util/concurrent/locks/ReentrantLock;
        //     4: invokevirtual   java/util/concurrent/locks/ReentrantLock.lock:()V
        //     7: aload_1         /* llllllllllllIlIlllllIIlIlIlIlIIl */
        //     8: invokevirtual   net/minecraft/client/renderer/chunk/RenderChunk.makeCompileTaskChunk:()Lnet/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator;
        //    11: astore_3        /* llllllllllllIlIlllllIIlIlIlIllII */
        //    12: aload_3         /* llllllllllllIlIlllllIIlIlIlIllII */
        //    13: new             Lnet/minecraft/client/renderer/chunk/ChunkRenderDispatcher$1;
        //    16: dup            
        //    17: aload_0         /* llllllllllllIlIlllllIIlIlIlIlIlI */
        //    18: aload_3         /* llllllllllllIlIlllllIIlIlIlIllII */
        //    19: invokespecial   net/minecraft/client/renderer/chunk/ChunkRenderDispatcher$1.<init>:(Lnet/minecraft/client/renderer/chunk/ChunkRenderDispatcher;Lnet/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator;)V
        //    22: invokevirtual   net/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator.addFinishRunnable:(Ljava/lang/Runnable;)V
        //    25: aload_0         /* llllllllllllIlIlllllIIlIlIlIlIlI */
        //    26: getfield        net/minecraft/client/renderer/chunk/ChunkRenderDispatcher.queueChunkUpdates:Ljava/util/concurrent/BlockingQueue;
        //    29: aload_3         /* llllllllllllIlIlllllIIlIlIlIllII */
        //    30: invokeinterface java/util/concurrent/BlockingQueue.offer:(Ljava/lang/Object;)Z
        //    35: istore          llllllllllllIlIlllllIIlIlIlIlIll
        //    37: iload           llllllllllllIlIlllllIIlIlIlIlIll
        //    39: invokestatic    net/minecraft/client/renderer/chunk/ChunkRenderDispatcher.lIIllllIlllIIlll:(I)Z
        //    42: ifeq            49
        //    45: aload_3         /* llllllllllllIlIlllllIIlIlIlIllII */
        //    46: invokevirtual   net/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator.finish:()V
        //    49: iload           llllllllllllIlIlllllIIlIlIlIlIll
        //    51: istore_2        /* llllllllllllIlIlllllIIlIlIlIlllI */
        //    52: ldc             ""
        //    54: invokevirtual   java/lang/String.length:()I
        //    57: pop            
        //    58: aconst_null    
        //    59: ifnull          90
        //    62: bipush          60
        //    64: bipush          42
        //    66: ixor           
        //    67: sipush          208
        //    70: sipush          198
        //    73: ixor           
        //    74: iconst_m1      
        //    75: ixor           
        //    76: iand           
        //    77: ireturn        
        //    78: astore          llllllllllllIlIlllllIIlIlIlIIlIl
        //    80: aload_1         /* llllllllllllIlIlllllIIlIlIlIlIIl */
        //    81: invokevirtual   net/minecraft/client/renderer/chunk/RenderChunk.getLockCompileTask:()Ljava/util/concurrent/locks/ReentrantLock;
        //    84: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //    87: aload           llllllllllllIlIlllllIIlIlIlIIlIl
        //    89: athrow         
        //    90: aload_1         /* llllllllllllIlIlllllIIlIlIlIlIIl */
        //    91: invokevirtual   net/minecraft/client/renderer/chunk/RenderChunk.getLockCompileTask:()Ljava/util/concurrent/locks/ReentrantLock;
        //    94: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //    97: iload_2         /* llllllllllllIlIlllllIIlIlIlIllIl */
        //    98: ireturn        
        //    StackMapTable: 00 03 FE 00 31 00 07 01 0C 01 FF 00 1C 00 02 07 00 02 07 00 4C 00 01 07 00 9F FE 00 0B 01 07 01 0C 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  7      78     78     90     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static boolean lIIllllIlllIllIl(final int llllllllllllIlIlllllIIlIIIIIllIl, final int llllllllllllIlIlllllIIlIIIIIllII) {
        return llllllllllllIlIlllllIIlIIIIIllIl < llllllllllllIlIlllllIIlIIIIIllII;
    }
    
    public String getDebugInfo() {
        final String format = ChunkRenderDispatcher.lllIIIllIlllll[ChunkRenderDispatcher.lllIIlIIIlIllI[1]];
        final Object[] args = new Object[ChunkRenderDispatcher.lllIIlIIIlIllI[5]];
        args[ChunkRenderDispatcher.lllIIlIIIlIllI[0]] = this.queueChunkUpdates.size();
        args[ChunkRenderDispatcher.lllIIlIIIlIllI[1]] = this.queueChunkUploads.size();
        args[ChunkRenderDispatcher.lllIIlIIIlIllI[4]] = this.queueFreeRenderBuilders.size();
        return String.format(format, args);
    }
    
    private static boolean lIIllllIlllIlIII(final int llllllllllllIlIlllllIIlIIIIIIllI) {
        return llllllllllllIlIlllllIIlIIIIIIllI != 0;
    }
    
    private static void lIIllllIlllIIlII() {
        (lllIIlIIIlIllI = new int[7])[0] = ((0x42 ^ 0x36 ^ (0x6E ^ 0x4C)) & ("  ".length() ^ (0xCE ^ 0x9A) ^ -" ".length()));
        ChunkRenderDispatcher.lllIIlIIIlIllI[1] = " ".length();
        ChunkRenderDispatcher.lllIIlIIIlIllI[2] = (0x41 ^ 0x25);
        ChunkRenderDispatcher.lllIIlIIIlIllI[3] = (0x9F ^ 0x9A);
        ChunkRenderDispatcher.lllIIlIIIlIllI[4] = "  ".length();
        ChunkRenderDispatcher.lllIIlIIIlIllI[5] = "   ".length();
        ChunkRenderDispatcher.lllIIlIIIlIllI[6] = (-(0xFFFFDBCF & 0x6CF9) & (0xFFFFFFCB & 0x5BFC));
    }
    
    private static void lIIllllIIIlIllII() {
        (lllIIIllIlllll = new String[ChunkRenderDispatcher.lllIIlIIIlIllI[4]])[ChunkRenderDispatcher.lllIIlIIIlIllI[0]] = lIIllllIIIlIlIlI("NxwvDQ9UNjsXBxwRKENBEA==", "ttZcd");
        ChunkRenderDispatcher.lllIIIllIlllll[ChunkRenderDispatcher.lllIIlIIIlIllI[1]] = lIIllllIIIlIlIll("Kp3SE7ZmmipEPeuXIIGZYhlUrEFRjvbHHxXD0ZM/ZMQ=", "ImMhN");
    }
    
    private static boolean lIIllllIlllIlIIl(final int llllllllllllIlIlllllIIlIIIIIIIlI) {
        return llllllllllllIlIlllllIIlIIIIIIIlI < 0;
    }
    
    private static boolean lIIllllIlllIIlIl(final int llllllllllllIlIlllllIIlIIIIlIIIl, final int llllllllllllIlIlllllIIlIIIIlIIII) {
        return llllllllllllIlIlllllIIlIIIIlIIIl >= llllllllllllIlIlllllIIlIIIIlIIII;
    }
    
    public void stopChunkUpdates() {
        this.clearChunkUpdates();
        while (!lIIllllIlllIIlll(this.runChunkUploads(0L) ? 1 : 0)) {}
        final List<RegionRenderCacheBuilder> llllllllllllIlIlllllIIlIlIIIllll = (List<RegionRenderCacheBuilder>)Lists.newArrayList();
        "".length();
        if ("  ".length() == ((9 + 141 - 145 + 158 ^ 22 + 141 - 142 + 129) & (11 + 145 - 145 + 179 ^ 92 + 69 - 72 + 50 ^ -" ".length()))) {
            return;
        }
        while (!lIIllllIlllIlIlI(llllllllllllIlIlllllIIlIlIIIllll.size(), ChunkRenderDispatcher.lllIIlIIIlIllI[3])) {
            try {
                llllllllllllIlIlllllIIlIlIIIllll.add(this.allocateRenderBuilder());
                "".length();
                "".length();
                if ("  ".length() <= ((0x6C ^ 0x5E) & ~(0xB6 ^ 0x84))) {
                    return;
                }
                continue;
            }
            catch (InterruptedException ex) {}
        }
        this.queueFreeRenderBuilders.addAll((Collection<?>)llllllllllllIlIlllllIIlIlIIIllll);
        "".length();
    }
    
    private void uploadVertexBuffer(final WorldRenderer llllllllllllIlIlllllIIlIIlIIIllI, final VertexBuffer llllllllllllIlIlllllIIlIIlIIIlIl) {
        this.vertexUploader.setVertexBuffer(llllllllllllIlIlllllIIlIIlIIIlIl);
        this.vertexUploader.func_181679_a(llllllllllllIlIlllllIIlIIlIIIllI);
    }
    
    public void clearChunkUpdates() {
        "".length();
        if (" ".length() <= 0) {
            return;
        }
        while (!lIIllllIlllIlIII(this.queueChunkUpdates.isEmpty() ? 1 : 0)) {
            final ChunkCompileTaskGenerator llllllllllllIlIlllllIIlIIlIIIIIl = this.queueChunkUpdates.poll();
            if (lIIllllIlllIllII(llllllllllllIlIlllllIIlIIlIIIIIl)) {
                llllllllllllIlIlllllIIlIIlIIIIIl.finish();
            }
        }
    }
    
    private static String lIIllllIIIlIlIll(final String llllllllllllIlIlllllIIlIIIIlllIl, final String llllllllllllIlIlllllIIlIIIIlllII) {
        try {
            final SecretKeySpec llllllllllllIlIlllllIIlIIIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllllIIlIIIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllllIIlIIIIlllll = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllllIIlIIIIlllll.init(ChunkRenderDispatcher.lllIIlIIIlIllI[4], llllllllllllIlIlllllIIlIIIlIIIII);
            return new String(llllllllllllIlIlllllIIlIIIIlllll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllllIIlIIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllllIIlIIIIllllI) {
            llllllllllllIlIlllllIIlIIIIllllI.printStackTrace();
            return null;
        }
    }
    
    public ChunkCompileTaskGenerator getNextChunkUpdate() throws InterruptedException {
        return this.queueChunkUpdates.take();
    }
    
    public RegionRenderCacheBuilder allocateRenderBuilder() throws InterruptedException {
        return this.queueFreeRenderBuilders.take();
    }
    
    public boolean updateTransparencyLater(final RenderChunk llllllllllllIlIlllllIIlIIllllIII) {
        llllllllllllIlIlllllIIlIIllllIII.getLockCompileTask().lock();
        try {
            final ChunkCompileTaskGenerator llllllllllllIlIlllllIIlIIlllIlII = llllllllllllIlIlllllIIlIIllllIII.makeCompileTaskTransparency();
            if (lIIllllIlllIlIll(llllllllllllIlIlllllIIlIIlllIlII)) {
                final double llllllllllllIlIlllllIIlIIllIlllI;
                final boolean llllllllllllIlIlllllIIlIIlllIlll = (llllllllllllIlIlllllIIlIIllIlllI = ChunkRenderDispatcher.lllIIlIIIlIllI[1]) != 0.0;
                return llllllllllllIlIlllllIIlIIllIlllI != 0.0;
            }
            llllllllllllIlIlllllIIlIIlllIlII.addFinishRunnable(new Runnable() {
                @Override
                public void run() {
                    ChunkRenderDispatcher.this.queueChunkUpdates.remove(llllllllllllIlIlllllIIlIIlllIlII);
                    "".length();
                }
            });
            final boolean llllllllllllIlIlllllIIlIIlllIllI = this.queueChunkUpdates.offer(llllllllllllIlIlllllIIlIIlllIlII);
            "".length();
            if ("  ".length() <= 0) {
                return ((31 + 75 - 22 + 76 ^ 120 + 51 - 138 + 106) & (0x2B ^ 0x70 ^ (0x39 ^ 0x49) ^ -" ".length())) != 0x0;
            }
        }
        finally {
            llllllllllllIlIlllllIIlIIllllIII.getLockCompileTask().unlock();
        }
        llllllllllllIlIlllllIIlIIllllIII.getLockCompileTask().unlock();
        final boolean llllllllllllIlIlllllIIlIIlllIlIl;
        return llllllllllllIlIlllllIIlIIlllIlIl;
    }
    
    private static String lIIllllIIIlIlIlI(String llllllllllllIlIlllllIIlIIIlIllIl, final String llllllllllllIlIlllllIIlIIIlIllII) {
        llllllllllllIlIlllllIIlIIIlIllIl = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIlIlllllIIlIIIlIllIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllllIIlIIIllIIII = new StringBuilder();
        final char[] llllllllllllIlIlllllIIlIIIlIllll = llllllllllllIlIlllllIIlIIIlIllII.toCharArray();
        int llllllllllllIlIlllllIIlIIIlIlllI = ChunkRenderDispatcher.lllIIlIIIlIllI[0];
        final String llllllllllllIlIlllllIIlIIIlIlIII = (Object)((String)llllllllllllIlIlllllIIlIIIlIllIl).toCharArray();
        final int llllllllllllIlIlllllIIlIIIlIIlll = llllllllllllIlIlllllIIlIIIlIlIII.length;
        char llllllllllllIlIlllllIIlIIIlIIllI = (char)ChunkRenderDispatcher.lllIIlIIIlIllI[0];
        while (lIIllllIlllIllIl(llllllllllllIlIlllllIIlIIIlIIllI, llllllllllllIlIlllllIIlIIIlIIlll)) {
            final char llllllllllllIlIlllllIIlIIIllIIll = llllllllllllIlIlllllIIlIIIlIlIII[llllllllllllIlIlllllIIlIIIlIIllI];
            llllllllllllIlIlllllIIlIIIllIIII.append((char)(llllllllllllIlIlllllIIlIIIllIIll ^ llllllllllllIlIlllllIIlIIIlIllll[llllllllllllIlIlllllIIlIIIlIlllI % llllllllllllIlIlllllIIlIIIlIllll.length]));
            "".length();
            ++llllllllllllIlIlllllIIlIIIlIlllI;
            ++llllllllllllIlIlllllIIlIIIlIIllI;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllllIIlIIIllIIII);
    }
    
    public void freeRenderBuilder(final RegionRenderCacheBuilder llllllllllllIlIlllllIIlIlIIIlIII) {
        this.queueFreeRenderBuilders.add(llllllllllllIlIlllllIIlIlIIIlIII);
        "".length();
    }
    
    private void uploadDisplayList(final WorldRenderer llllllllllllIlIlllllIIlIIlIlIIII, final int llllllllllllIlIlllllIIlIIlIlIIll, final RenderChunk llllllllllllIlIlllllIIlIIlIlIIlI) {
        GL11.glNewList(llllllllllllIlIlllllIIlIIlIlIIll, ChunkRenderDispatcher.lllIIlIIIlIllI[6]);
        GlStateManager.pushMatrix();
        llllllllllllIlIlllllIIlIIlIlIIlI.multModelviewMatrix();
        this.worldVertexUploader.func_181679_a(llllllllllllIlIlllllIIlIIlIlIIII);
        GlStateManager.popMatrix();
        GL11.glEndList();
    }
    
    public ChunkRenderDispatcher() {
        this.listThreadedWorkers = (List<ChunkRenderWorker>)Lists.newArrayList();
        this.queueChunkUpdates = (BlockingQueue<ChunkCompileTaskGenerator>)Queues.newArrayBlockingQueue(ChunkRenderDispatcher.lllIIlIIIlIllI[2]);
        this.queueFreeRenderBuilders = (BlockingQueue<RegionRenderCacheBuilder>)Queues.newArrayBlockingQueue(ChunkRenderDispatcher.lllIIlIIIlIllI[3]);
        this.worldVertexUploader = new WorldVertexBufferUploader();
        this.vertexUploader = new VertexBufferUploader();
        this.queueChunkUploads = (Queue<ListenableFutureTask<?>>)Queues.newArrayDeque();
        int llllllllllllIlIlllllIIlIllIlIIII = ChunkRenderDispatcher.lllIIlIIIlIllI[0];
        "".length();
        if ((0xC ^ 0x9) == 0x0) {
            throw null;
        }
        while (!lIIllllIlllIIlIl(llllllllllllIlIlllllIIlIllIlIIII, ChunkRenderDispatcher.lllIIlIIIlIllI[4])) {
            final ChunkRenderWorker llllllllllllIlIlllllIIlIllIIllll = new ChunkRenderWorker(this);
            final Thread llllllllllllIlIlllllIIlIllIIlllI = ChunkRenderDispatcher.threadFactory.newThread(llllllllllllIlIlllllIIlIllIIllll);
            llllllllllllIlIlllllIIlIllIIlllI.start();
            this.listThreadedWorkers.add(llllllllllllIlIlllllIIlIllIIllll);
            "".length();
            ++llllllllllllIlIlllllIIlIllIlIIII;
        }
        int llllllllllllIlIlllllIIlIllIIllIl = ChunkRenderDispatcher.lllIIlIIIlIllI[0];
        "".length();
        if ((0x8F ^ 0x8B) <= 0) {
            throw null;
        }
        while (!lIIllllIlllIIlIl(llllllllllllIlIlllllIIlIllIIllIl, ChunkRenderDispatcher.lllIIlIIIlIllI[3])) {
            this.queueFreeRenderBuilders.add(new RegionRenderCacheBuilder());
            "".length();
            ++llllllllllllIlIlllllIIlIllIIllIl;
        }
        this.renderWorker = new ChunkRenderWorker(this, new RegionRenderCacheBuilder());
    }
    
    public boolean updateChunkNow(final RenderChunk llllllllllllIlIlllllIIlIlIIlllIl) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   net/minecraft/client/renderer/chunk/RenderChunk.getLockCompileTask:()Ljava/util/concurrent/locks/ReentrantLock;
        //     4: invokevirtual   java/util/concurrent/locks/ReentrantLock.lock:()V
        //     7: aload_1         /* llllllllllllIlIlllllIIlIlIIllIII */
        //     8: invokevirtual   net/minecraft/client/renderer/chunk/RenderChunk.makeCompileTaskChunk:()Lnet/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator;
        //    11: astore_3        /* llllllllllllIlIlllllIIlIlIIlIllI */
        //    12: aload_0         /* llllllllllllIlIlllllIIlIlIIllllI */
        //    13: getfield        net/minecraft/client/renderer/chunk/ChunkRenderDispatcher.renderWorker:Lnet/minecraft/client/renderer/chunk/ChunkRenderWorker;
        //    16: aload_3         /* llllllllllllIlIlllllIIlIlIIllIlI */
        //    17: invokevirtual   net/minecraft/client/renderer/chunk/ChunkRenderWorker.processTask:(Lnet/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator;)V
        //    20: ldc             ""
        //    22: invokevirtual   java/lang/String.length:()I
        //    25: pop            
        //    26: ldc_w           "   "
        //    29: invokevirtual   java/lang/String.length:()I
        //    32: ifge            85
        //    35: bipush          56
        //    37: bipush          115
        //    39: ixor           
        //    40: bipush          26
        //    42: bipush          85
        //    44: ixor           
        //    45: ixor           
        //    46: sipush          137
        //    49: bipush          118
        //    51: iadd           
        //    52: sipush          216
        //    55: isub           
        //    56: sipush          135
        //    59: iadd           
        //    60: sipush          143
        //    63: bipush          111
        //    65: iadd           
        //    66: sipush          141
        //    69: isub           
        //    70: bipush          57
        //    72: iadd           
        //    73: ixor           
        //    74: ldc             " "
        //    76: invokevirtual   java/lang/String.length:()I
        //    79: ineg           
        //    80: ixor           
        //    81: iand           
        //    82: ireturn        
        //    83: astore          llllllllllllIlIlllllIIlIlIIlIlIl
        //    85: getstatic       net/minecraft/client/renderer/chunk/ChunkRenderDispatcher.lllIIlIIIlIllI:[I
        //    88: iconst_1       
        //    89: iaload         
        //    90: istore_2        /* llllllllllllIlIlllllIIlIlIIlllII */
        //    91: ldc             ""
        //    93: invokevirtual   java/lang/String.length:()I
        //    96: pop            
        //    97: ldc             "  "
        //    99: invokevirtual   java/lang/String.length:()I
        //   102: ldc             "  "
        //   104: invokevirtual   java/lang/String.length:()I
        //   107: if_icmpge       138
        //   110: sipush          213
        //   113: sipush          157
        //   116: ixor           
        //   117: bipush          126
        //   119: bipush          54
        //   121: ixor           
        //   122: iconst_m1      
        //   123: ixor           
        //   124: iand           
        //   125: ireturn        
        //   126: astore          llllllllllllIlIlllllIIlIlIIlIlII
        //   128: aload_1         /* llllllllllllIlIlllllIIlIlIIllIII */
        //   129: invokevirtual   net/minecraft/client/renderer/chunk/RenderChunk.getLockCompileTask:()Ljava/util/concurrent/locks/ReentrantLock;
        //   132: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //   135: aload           llllllllllllIlIlllllIIlIlIIlIlII
        //   137: athrow         
        //   138: aload_1         /* llllllllllllIlIlllllIIlIlIIllIII */
        //   139: invokevirtual   net/minecraft/client/renderer/chunk/RenderChunk.getLockCompileTask:()Ljava/util/concurrent/locks/ReentrantLock;
        //   142: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //   145: iload_2         /* llllllllllllIlIlllllIIlIlIIllIll */
        //   146: ireturn        
        //    StackMapTable: 00 04 FF 00 53 00 04 07 00 02 07 00 4C 00 07 01 0C 00 01 07 01 58 01 FF 00 28 00 02 07 00 02 07 00 4C 00 01 07 00 9F FD 00 0B 01 07 01 0C
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  12     20     83     85     Ljava/lang/InterruptedException;
        //  7      126    126    138    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
