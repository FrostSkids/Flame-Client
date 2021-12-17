// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.chunk;

import org.apache.logging.log4j.LogManager;
import java.util.ArrayList;
import net.minecraft.entity.Entity;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.crash.CrashReport;
import java.util.concurrent.CancellationException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.Futures;
import net.minecraft.util.EnumWorldBlockLayer;
import com.google.common.collect.Lists;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.Logger;
import net.minecraft.client.renderer.RegionRenderCacheBuilder;

public class ChunkRenderWorker implements Runnable
{
    private static final /* synthetic */ String[] llIIlllllIllII;
    private static final /* synthetic */ int[] llIIlllllIllIl;
    private final /* synthetic */ ChunkRenderDispatcher chunkRenderDispatcher;
    private final /* synthetic */ RegionRenderCacheBuilder regionRenderCacheBuilder;
    private static final /* synthetic */ Logger LOGGER;
    
    protected void processTask(final ChunkCompileTaskGenerator llllllllllllIllIlllIIIllllIlIlll) throws InterruptedException {
        llllllllllllIllIlllIIIllllIlIlll.getLock().lock();
        try {
            if (lIIlIIIIlIllIIII(llllllllllllIllIlllIIIllllIlIlll.getStatus(), ChunkCompileTaskGenerator.Status.PENDING)) {
                if (lIIlIIIIlIllIIIl(llllllllllllIllIlllIIIllllIlIlll.isFinished() ? 1 : 0)) {
                    ChunkRenderWorker.LOGGER.warn(String.valueOf(new StringBuilder(ChunkRenderWorker.llIIlllllIllII[ChunkRenderWorker.llIIlllllIllIl[2]]).append(llllllllllllIllIlllIIIllllIlIlll.getStatus()).append(ChunkRenderWorker.llIIlllllIllII[ChunkRenderWorker.llIIlllllIllIl[3]])));
                }
                return;
            }
            llllllllllllIllIlllIIIllllIlIlll.setStatus(ChunkCompileTaskGenerator.Status.COMPILING);
            "".length();
            if ((0x91 ^ 0x95) == " ".length()) {
                return;
            }
        }
        finally {
            llllllllllllIllIlllIIIllllIlIlll.getLock().unlock();
        }
        llllllllllllIllIlllIIIllllIlIlll.getLock().unlock();
        final Entity llllllllllllIllIlllIIIllllIlIllI = Minecraft.getMinecraft().getRenderViewEntity();
        if (lIIlIIIIlIllIIlI(llllllllllllIllIlllIIIllllIlIllI)) {
            llllllllllllIllIlllIIIllllIlIlll.finish();
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            llllllllllllIllIlllIIIllllIlIlll.setRegionRenderCacheBuilder(this.getRegionRenderCacheBuilder());
            final float llllllllllllIllIlllIIIllllIlIlIl = (float)llllllllllllIllIlllIIIllllIlIllI.posX;
            final float llllllllllllIllIlllIIIllllIlIlII = (float)llllllllllllIllIlllIIIllllIlIllI.posY + llllllllllllIllIlllIIIllllIlIllI.getEyeHeight();
            final float llllllllllllIllIlllIIIllllIlIIll = (float)llllllllllllIllIlllIIIllllIlIllI.posZ;
            final ChunkCompileTaskGenerator.Type llllllllllllIllIlllIIIllllIlIIlI = llllllllllllIllIlllIIIllllIlIlll.getType();
            if (lIIlIIIIlIllIIll(llllllllllllIllIlllIIIllllIlIIlI, ChunkCompileTaskGenerator.Type.REBUILD_CHUNK)) {
                llllllllllllIllIlllIIIllllIlIlll.getRenderChunk().rebuildChunk(llllllllllllIllIlllIIIllllIlIlIl, llllllllllllIllIlllIIIllllIlIlII, llllllllllllIllIlllIIIllllIlIIll, llllllllllllIllIlllIIIllllIlIlll);
                "".length();
                if (((127 + 54 - 56 + 52 ^ 20 + 71 - 63 + 141) & (0xB1 ^ 0x80 ^ (0xBE ^ 0x97) ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else if (lIIlIIIIlIllIIll(llllllllllllIllIlllIIIllllIlIIlI, ChunkCompileTaskGenerator.Type.RESORT_TRANSPARENCY)) {
                llllllllllllIllIlllIIIllllIlIlll.getRenderChunk().resortTransparency(llllllllllllIllIlllIIIllllIlIlIl, llllllllllllIllIlllIIIllllIlIlII, llllllllllllIllIlllIIIllllIlIIll, llllllllllllIllIlllIIIllllIlIlll);
            }
            llllllllllllIllIlllIIIllllIlIlll.getLock().lock();
            try {
                if (lIIlIIIIlIllIIII(llllllllllllIllIlllIIIllllIlIlll.getStatus(), ChunkCompileTaskGenerator.Status.COMPILING)) {
                    if (lIIlIIIIlIllIIIl(llllllllllllIllIlllIIIllllIlIlll.isFinished() ? 1 : 0)) {
                        ChunkRenderWorker.LOGGER.warn(String.valueOf(new StringBuilder(ChunkRenderWorker.llIIlllllIllII[ChunkRenderWorker.llIIlllllIllIl[4]]).append(llllllllllllIllIlllIIIllllIlIlll.getStatus()).append(ChunkRenderWorker.llIIlllllIllII[ChunkRenderWorker.llIIlllllIllIl[5]])));
                    }
                    this.freeRenderBuilder(llllllllllllIllIlllIIIllllIlIlll);
                    return;
                }
                llllllllllllIllIlllIIIllllIlIlll.setStatus(ChunkCompileTaskGenerator.Status.UPLOADING);
                "".length();
                if (-" ".length() > 0) {
                    return;
                }
            }
            finally {
                llllllllllllIllIlllIIIllllIlIlll.getLock().unlock();
            }
            llllllllllllIllIlllIIIllllIlIlll.getLock().unlock();
            final CompiledChunk llllllllllllIllIlllIIIllllIlIIIl = llllllllllllIllIlllIIIllllIlIlll.getCompiledChunk();
            final ArrayList llllllllllllIllIlllIIIllllIlIIII = Lists.newArrayList();
            if (lIIlIIIIlIllIIll(llllllllllllIllIlllIIIllllIlIIlI, ChunkCompileTaskGenerator.Type.REBUILD_CHUNK)) {
                final boolean llllllllllllIllIlllIIIllllIIIIIl;
                final char llllllllllllIllIlllIIIllllIIIIlI = (char)((EnumWorldBlockLayer[])(Object)(llllllllllllIllIlllIIIllllIIIIIl = (boolean)(Object)EnumWorldBlockLayer.values())).length;
                long llllllllllllIllIlllIIIllllIIIIll = ChunkRenderWorker.llIIlllllIllIl[0];
                "".length();
                if (-(0x78 ^ 0x4E ^ (0x68 ^ 0x5A)) >= 0) {
                    return;
                }
                while (!lIIlIIIIlIllIlIl((int)llllllllllllIllIlllIIIllllIIIIll, llllllllllllIllIlllIIIllllIIIIlI)) {
                    final EnumWorldBlockLayer llllllllllllIllIlllIIIllllIIllll = llllllllllllIllIlllIIIllllIIIIIl[llllllllllllIllIlllIIIllllIIIIll];
                    if (lIIlIIIIlIllIlII(llllllllllllIllIlllIIIllllIlIIIl.isLayerStarted(llllllllllllIllIlllIIIllllIIllll) ? 1 : 0)) {
                        llllllllllllIllIlllIIIllllIlIIII.add(this.chunkRenderDispatcher.uploadChunk(llllllllllllIllIlllIIIllllIIllll, llllllllllllIllIlllIIIllllIlIlll.getRegionRenderCacheBuilder().getWorldRendererByLayer(llllllllllllIllIlllIIIllllIIllll), llllllllllllIllIlllIIIllllIlIlll.getRenderChunk(), llllllllllllIllIlllIIIllllIlIIIl));
                        "".length();
                    }
                    ++llllllllllllIllIlllIIIllllIIIIll;
                }
                "".length();
                if ((0x1F ^ 0x69 ^ (0x16 ^ 0x64)) <= 0) {
                    return;
                }
            }
            else if (lIIlIIIIlIllIIll(llllllllllllIllIlllIIIllllIlIIlI, ChunkCompileTaskGenerator.Type.RESORT_TRANSPARENCY)) {
                llllllllllllIllIlllIIIllllIlIIII.add(this.chunkRenderDispatcher.uploadChunk(EnumWorldBlockLayer.TRANSLUCENT, llllllllllllIllIlllIIIllllIlIlll.getRegionRenderCacheBuilder().getWorldRendererByLayer(EnumWorldBlockLayer.TRANSLUCENT), llllllllllllIllIlllIIIllllIlIlll.getRenderChunk(), llllllllllllIllIlllIIIllllIlIIIl));
                "".length();
            }
            final ListenableFuture<List<Object>> llllllllllllIllIlllIIIllllIIlllI = (ListenableFuture<List<Object>>)Futures.allAsList((Iterable)llllllllllllIllIlllIIIllllIlIIII);
            llllllllllllIllIlllIIIllllIlIlll.addFinishRunnable(new Runnable() {
                private static final /* synthetic */ int[] lllIlIIlIIIIll;
                
                @Override
                public void run() {
                    llllllllllllIllIlllIIIllllIIlllI.cancel((boolean)(ChunkRenderWorker$1.lllIlIIlIIIIll[0] != 0));
                    "".length();
                }
                
                private static void lIlIIIlIIIIIIIII() {
                    (lllIlIIlIIIIll = new int[1])[0] = ((0xAE ^ 0xBA) & ~(0xB0 ^ 0xA4));
                }
                
                static {
                    lIlIIIlIIIIIIIII();
                }
            });
            Futures.addCallback((ListenableFuture)llllllllllllIllIlllIIIllllIIlllI, (FutureCallback)new FutureCallback<List<Object>>() {
                private static final /* synthetic */ int[] lIllIlllIIllIl;
                private static final /* synthetic */ String[] lIllIlllIIllII;
                
                private static String lIIIIIIIIIIllIII(String llllllllllllIllllllIlIIIllIIIIll, final String llllllllllllIllllllIlIIIllIIIlll) {
                    llllllllllllIllllllIlIIIllIIIIll = new String(Base64.getDecoder().decode(llllllllllllIllllllIlIIIllIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                    final StringBuilder llllllllllllIllllllIlIIIllIIIllI = new StringBuilder();
                    final char[] llllllllllllIllllllIlIIIllIIIlIl = llllllllllllIllllllIlIIIllIIIlll.toCharArray();
                    int llllllllllllIllllllIlIIIllIIIlII = ChunkRenderWorker$2.lIllIlllIIllIl[0];
                    final byte llllllllllllIllllllIlIIIlIlllllI = (Object)llllllllllllIllllllIlIIIllIIIIll.toCharArray();
                    final byte llllllllllllIllllllIlIIIlIllllIl = (byte)llllllllllllIllllllIlIIIlIlllllI.length;
                    byte llllllllllllIllllllIlIIIlIllllII = (byte)ChunkRenderWorker$2.lIllIlllIIllIl[0];
                    while (lIIIIIIIIIIlllIl(llllllllllllIllllllIlIIIlIllllII, llllllllllllIllllllIlIIIlIllllIl)) {
                        final char llllllllllllIllllllIlIIIllIIlIIl = llllllllllllIllllllIlIIIlIlllllI[llllllllllllIllllllIlIIIlIllllII];
                        llllllllllllIllllllIlIIIllIIIllI.append((char)(llllllllllllIllllllIlIIIllIIlIIl ^ llllllllllllIllllllIlIIIllIIIlIl[llllllllllllIllllllIlIIIllIIIlII % llllllllllllIllllllIlIIIllIIIlIl.length]));
                        "".length();
                        ++llllllllllllIllllllIlIIIllIIIlII;
                        ++llllllllllllIllllllIlIIIlIllllII;
                        "".length();
                        if (" ".length() <= 0) {
                            return null;
                        }
                    }
                    return String.valueOf(llllllllllllIllllllIlIIIllIIIllI);
                }
                
                private static void lIIIIIIIIIIllIIl() {
                    (lIllIlllIIllII = new String[ChunkRenderWorker$2.lIllIlllIIllIl[3]])[ChunkRenderWorker$2.lIllIlllIIllIl[0]] = lIIIIIIIIIIlIlll("xoAO5Q9J/GEA08yCy0PqDRdEsyxjYs54", "cZBHN");
                    ChunkRenderWorker$2.lIllIlllIIllII[ChunkRenderWorker$2.lIllIlllIIllIl[1]] = lIIIIIIIIIIlIlll("y4QnT8a+W7NGOQzVVoeODTHVhrS2eKgeTHVdD1UFjhwbfst3ZUWJiE6ObGOL0lgoz+izjl9PPug=", "lizbH");
                    ChunkRenderWorker$2.lIllIlllIIllII[ChunkRenderWorker$2.lIllIlllIIllIl[2]] = lIIIIIIIIIIllIII("OBwfAxUYEB8AUAkRBAkb", "jyqgp");
                }
                
                private static boolean lIIIIIIIIIIlllIl(final int llllllllllllIllllllIlIIIlIlllIII, final int llllllllllllIllllllIlIIIlIllIlll) {
                    return llllllllllllIllllllIlIIIlIlllIII < llllllllllllIllllllIlIIIlIllIlll;
                }
                
                private static boolean lIIIIIIIIIIllIll(final Object llllllllllllIllllllIlIIIlIllIlII, final Object llllllllllllIllllllIlIIIlIllIIll) {
                    return llllllllllllIllllllIlIIIlIllIlII == llllllllllllIllllllIlIIIlIllIIll;
                }
                
                public void onSuccess(final List<Object> llllllllllllIllllllIlIIIlllIllII) {
                    ChunkRenderWorker.this.freeRenderBuilder(llllllllllllIllIlllIIIllllIlIlll);
                    llllllllllllIllIlllIIIllllIlIlll.getLock().lock();
                    Label_0195: {
                        try {
                            if (lIIIIIIIIIIllIll(llllllllllllIllIlllIIIllllIlIlll.getStatus(), ChunkCompileTaskGenerator.Status.UPLOADING)) {
                                llllllllllllIllIlllIIIllllIlIlll.setStatus(ChunkCompileTaskGenerator.Status.DONE);
                                llllllllllllIllIlllIIIllllIlIlll.getLock().unlock();
                                "".length();
                                if (((0xA6 ^ 0x80) & ~(0x29 ^ 0xF)) == (0x4C ^ 0x48)) {
                                    return;
                                }
                                break Label_0195;
                            }
                            else if (lIIIIIIIIIIlllII(llllllllllllIllIlllIIIllllIlIlll.isFinished() ? 1 : 0)) {
                                ChunkRenderWorker.LOGGER.warn(String.valueOf(new StringBuilder(ChunkRenderWorker$2.lIllIlllIIllII[ChunkRenderWorker$2.lIllIlllIIllIl[0]]).append(llllllllllllIllIlllIIIllllIlIlll.getStatus()).append(ChunkRenderWorker$2.lIllIlllIIllII[ChunkRenderWorker$2.lIllIlllIIllIl[1]])));
                                "".length();
                                if (((0x34 ^ 0x2) & ~(0x29 ^ 0x1F)) != 0x0) {
                                    return;
                                }
                            }
                        }
                        finally {
                            llllllllllllIllIlllIIIllllIlIlll.getLock().unlock();
                        }
                        llllllllllllIllIlllIIIllllIlIlll.getLock().unlock();
                        return;
                    }
                    llllllllllllIllIlllIIIllllIlIlll.getRenderChunk().setCompiledChunk(llllllllllllIllIlllIIIllllIlIIIl);
                }
                
                static {
                    lIIIIIIIIIIllIlI();
                    lIIIIIIIIIIllIIl();
                }
                
                private static void lIIIIIIIIIIllIlI() {
                    (lIllIlllIIllIl = new int[5])[0] = ((0x3D ^ 0x3A) & ~(0xB5 ^ 0xB2));
                    ChunkRenderWorker$2.lIllIlllIIllIl[1] = " ".length();
                    ChunkRenderWorker$2.lIllIlllIIllIl[2] = "  ".length();
                    ChunkRenderWorker$2.lIllIlllIIllIl[3] = "   ".length();
                    ChunkRenderWorker$2.lIllIlllIIllIl[4] = (107 + 78 - 52 + 28 ^ 38 + 118 - 3 + 16);
                }
                
                public void onFailure(final Throwable llllllllllllIllllllIlIIIlllIIllI) {
                    ChunkRenderWorker.this.freeRenderBuilder(llllllllllllIllIlllIIIllllIlIlll);
                    if (lIIIIIIIIIIlllII((llllllllllllIllllllIlIIIlllIIllI instanceof CancellationException) ? 1 : 0) && lIIIIIIIIIIlllII((llllllllllllIllllllIlIIIlllIIllI instanceof InterruptedException) ? 1 : 0)) {
                        Minecraft.getMinecraft().crashed(CrashReport.makeCrashReport(llllllllllllIllllllIlIIIlllIIllI, ChunkRenderWorker$2.lIllIlllIIllII[ChunkRenderWorker$2.lIllIlllIIllIl[2]]));
                    }
                }
                
                private static boolean lIIIIIIIIIIlllII(final int llllllllllllIllllllIlIIIlIllIIIl) {
                    return llllllllllllIllllllIlIIIlIllIIIl == 0;
                }
                
                private static String lIIIIIIIIIIlIlll(final String llllllllllllIllllllIlIIIllIllIII, final String llllllllllllIllllllIlIIIllIlIlIl) {
                    try {
                        final SecretKeySpec llllllllllllIllllllIlIIIllIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIlIIIllIlIlIl.getBytes(StandardCharsets.UTF_8)), ChunkRenderWorker$2.lIllIlllIIllIl[4]), "DES");
                        final Cipher llllllllllllIllllllIlIIIllIllIlI = Cipher.getInstance("DES");
                        llllllllllllIllllllIlIIIllIllIlI.init(ChunkRenderWorker$2.lIllIlllIIllIl[2], llllllllllllIllllllIlIIIllIllIll);
                        return new String(llllllllllllIllllllIlIIIllIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIlIIIllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception llllllllllllIllllllIlIIIllIllIIl) {
                        llllllllllllIllllllIlIIIllIllIIl.printStackTrace();
                        return null;
                    }
                }
            });
        }
    }
    
    private static boolean lIIlIIIIlIllIlIl(final int llllllllllllIllIlllIIIllIlllllll, final int llllllllllllIllIlllIIIllIllllllI) {
        return llllllllllllIllIlllIIIllIlllllll >= llllllllllllIllIlllIIIllIllllllI;
    }
    
    private static String lIIlIIIIlIlIlIll(final String llllllllllllIllIlllIIIlllIIIIlIl, final String llllllllllllIllIlllIIIlllIIIIllI) {
        try {
            final SecretKeySpec llllllllllllIllIlllIIIlllIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIIIlllIIIIllI.getBytes(StandardCharsets.UTF_8)), ChunkRenderWorker.llIIlllllIllIl[7]), "DES");
            final Cipher llllllllllllIllIlllIIIlllIIIlIIl = Cipher.getInstance("DES");
            llllllllllllIllIlllIIIlllIIIlIIl.init(ChunkRenderWorker.llIIlllllIllIl[2], llllllllllllIllIlllIIIlllIIIlIlI);
            return new String(llllllllllllIllIlllIIIlllIIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIIIlllIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllIIIlllIIIlIII) {
            llllllllllllIllIlllIIIlllIIIlIII.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlIIIIlIlIllII(String llllllllllllIllIlllIIIlllIlIlIIl, final String llllllllllllIllIlllIIIlllIlIIIll) {
        llllllllllllIllIlllIIIlllIlIlIIl = new String(Base64.getDecoder().decode(llllllllllllIllIlllIIIlllIlIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlllIIIlllIlIIlll = new StringBuilder();
        final char[] llllllllllllIllIlllIIIlllIlIIllI = llllllllllllIllIlllIIIlllIlIIIll.toCharArray();
        int llllllllllllIllIlllIIIlllIlIIlIl = ChunkRenderWorker.llIIlllllIllIl[0];
        final char llllllllllllIllIlllIIIlllIIlllll = (Object)llllllllllllIllIlllIIIlllIlIlIIl.toCharArray();
        final int llllllllllllIllIlllIIIlllIIllllI = llllllllllllIllIlllIIIlllIIlllll.length;
        long llllllllllllIllIlllIIIlllIIlllIl = ChunkRenderWorker.llIIlllllIllIl[0];
        while (lIIlIIIIlIllIlll((int)llllllllllllIllIlllIIIlllIIlllIl, llllllllllllIllIlllIIIlllIIllllI)) {
            final char llllllllllllIllIlllIIIlllIlIlIlI = llllllllllllIllIlllIIIlllIIlllll[llllllllllllIllIlllIIIlllIIlllIl];
            llllllllllllIllIlllIIIlllIlIIlll.append((char)(llllllllllllIllIlllIIIlllIlIlIlI ^ llllllllllllIllIlllIIIlllIlIIllI[llllllllllllIllIlllIIIlllIlIIlIl % llllllllllllIllIlllIIIlllIlIIllI.length]));
            "".length();
            ++llllllllllllIllIlllIIIlllIlIIlIl;
            ++llllllllllllIllIlllIIIlllIIlllIl;
            "".length();
            if (-(0xAD ^ 0xA9) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlllIIIlllIlIIlll);
    }
    
    private static void lIIlIIIIlIlIlllI() {
        (llIIlllllIllII = new String[ChunkRenderWorker.llIIlllllIllIl[6]])[ChunkRenderWorker.llIIlllllIllIl[0]] = lIIlIIIIlIlIlIll("tnvyllT2CljgSKxUimVYvykZiZ/RYNf3FfbMFlMbTok=", "FZVPo");
        ChunkRenderWorker.llIIlllllIllII[ChunkRenderWorker.llIIlllllIllIl[1]] = lIIlIIIIlIlIllII("DhEgFwUlHjNUDiQFOh8e", "LpTtm");
        ChunkRenderWorker.llIIlllllIllII[ChunkRenderWorker.llIIlllllIllIl[2]] = lIIlIIIIlIlIllIl("xQ7cooWPLtmMtij638zKHin2c1gnYQB/", "gkApe");
        ChunkRenderWorker.llIIlllllIllII[ChunkRenderWorker.llIIlllllIllIl[3]] = lIIlIIIIlIlIlIll("JJi2QHrA3T7heSc+bqbccFoIx82CjRju4qwLoNsbAEYTPT+W+HzsIeLnBcLUn6TtOPwxO/neosA=", "lnWtJ");
        ChunkRenderWorker.llIIlllllIllII[ChunkRenderWorker.llIIlllllIllIl[4]] = lIIlIIIIlIlIllIl("/FxBsuMLJ8SwWdRvN1fGOscAdiCvQiJm", "hlIEY");
        ChunkRenderWorker.llIIlllllIllII[ChunkRenderWorker.llIIlllllIllIl[5]] = lIIlIIIIlIlIlIll("4rNHAMnvcJTBKdDjFP1PtJ61mJo3KJkOvdePKwCv1Z71Hbf5zJeGGsih8e4cvz+hLy/Yqd16F3Q=", "UItEt");
    }
    
    private static void lIIlIIIIlIlIllll() {
        (llIIlllllIllIl = new int[8])[0] = ((0xE5 ^ 0x83 ^ (0x6D ^ 0x6)) & (0x4 ^ 0x7E ^ (0xF3 ^ 0x84) ^ -" ".length()));
        ChunkRenderWorker.llIIlllllIllIl[1] = " ".length();
        ChunkRenderWorker.llIIlllllIllIl[2] = "  ".length();
        ChunkRenderWorker.llIIlllllIllIl[3] = "   ".length();
        ChunkRenderWorker.llIIlllllIllIl[4] = (0xC9 ^ 0xA2 ^ (0xC ^ 0x63));
        ChunkRenderWorker.llIIlllllIllIl[5] = (0x80 ^ 0x85);
        ChunkRenderWorker.llIIlllllIllIl[6] = (137 + 62 - 183 + 177 ^ 161 + 94 - 75 + 19);
        ChunkRenderWorker.llIIlllllIllIl[7] = (0x8 ^ 0x71 ^ (0x2 ^ 0x73));
    }
    
    private static boolean lIIlIIIIlIllIIII(final Object llllllllllllIllIlllIIIllIlllIlll, final Object llllllllllllIllIlllIIIllIlllIllI) {
        return llllllllllllIllIlllIIIllIlllIlll != llllllllllllIllIlllIIIllIlllIllI;
    }
    
    private static boolean lIIlIIIIlIllIllI(final Object llllllllllllIllIlllIIIllIlllIIII) {
        return llllllllllllIllIlllIIIllIlllIIII != null;
    }
    
    public ChunkRenderWorker(final ChunkRenderDispatcher llllllllllllIllIlllIIIlllllllIll) {
        this(llllllllllllIllIlllIIIlllllllIll, null);
    }
    
    private static String lIIlIIIIlIlIllIl(final String llllllllllllIllIlllIIIlllIIlIIlI, final String llllllllllllIllIlllIIIlllIIlIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIlllIIIlllIIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIIIlllIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlllIIIlllIIlIllI = Cipher.getInstance("Blowfish");
            llllllllllllIllIlllIIIlllIIlIllI.init(ChunkRenderWorker.llIIlllllIllIl[2], llllllllllllIllIlllIIIlllIIlIlll);
            return new String(llllllllllllIllIlllIIIlllIIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIIIlllIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllIIIlllIIlIlIl) {
            llllllllllllIllIlllIIIlllIIlIlIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIIIIlIllIlII(final int llllllllllllIllIlllIIIllIllIllII) {
        return llllllllllllIllIlllIIIllIllIllII != 0;
    }
    
    private RegionRenderCacheBuilder getRegionRenderCacheBuilder() throws InterruptedException {
        RegionRenderCacheBuilder regionRenderCacheBuilder;
        if (lIIlIIIIlIllIllI(this.regionRenderCacheBuilder)) {
            regionRenderCacheBuilder = this.regionRenderCacheBuilder;
            "".length();
            if (((" ".length() ^ (0xE1 ^ 0xAC)) & (0x7A ^ 0x67 ^ (0xC3 ^ 0x92) ^ -" ".length())) > 0) {
                return null;
            }
        }
        else {
            regionRenderCacheBuilder = this.chunkRenderDispatcher.allocateRenderBuilder();
        }
        return regionRenderCacheBuilder;
    }
    
    private static boolean lIIlIIIIlIllIIlI(final Object llllllllllllIllIlllIIIllIllIlllI) {
        return llllllllllllIllIlllIIIllIllIlllI == null;
    }
    
    private static boolean lIIlIIIIlIllIIIl(final int llllllllllllIllIlllIIIllIllIlIlI) {
        return llllllllllllIllIlllIIIllIllIlIlI == 0;
    }
    
    private static boolean lIIlIIIIlIllIIll(final Object llllllllllllIllIlllIIIllIlllIIll, final Object llllllllllllIllIlllIIIllIlllIIlI) {
        return llllllllllllIllIlllIIIllIlllIIll == llllllllllllIllIlllIIIllIlllIIlI;
    }
    
    private void freeRenderBuilder(final ChunkCompileTaskGenerator llllllllllllIllIlllIIIlllIlllIII) {
        if (lIIlIIIIlIllIIlI(this.regionRenderCacheBuilder)) {
            this.chunkRenderDispatcher.freeRenderBuilder(llllllllllllIllIlllIIIlllIlllIII.getRegionRenderCacheBuilder());
        }
    }
    
    private static boolean lIIlIIIIlIllIlll(final int llllllllllllIllIlllIIIllIllllIll, final int llllllllllllIllIlllIIIllIllllIlI) {
        return llllllllllllIllIlllIIIllIllllIll < llllllllllllIllIlllIIIllIllllIlI;
    }
    
    static {
        lIIlIIIIlIlIllll();
        lIIlIIIIlIlIlllI();
        LOGGER = LogManager.getLogger();
    }
    
    public ChunkRenderWorker(final ChunkRenderDispatcher llllllllllllIllIlllIIIllllllIIIl, final RegionRenderCacheBuilder llllllllllllIllIlllIIIllllllIIll) {
        this.chunkRenderDispatcher = llllllllllllIllIlllIIIllllllIIIl;
        this.regionRenderCacheBuilder = llllllllllllIllIlllIIIllllllIIll;
    }
    
    @Override
    public void run() {
        try {
            do {
                this.processTask(this.chunkRenderDispatcher.getNextChunkUpdate());
                "".length();
            } while (-" ".length() < 0);
        }
        catch (InterruptedException llllllllllllIllIlllIIIlllllIlIll) {
            ChunkRenderWorker.LOGGER.debug(ChunkRenderWorker.llIIlllllIllII[ChunkRenderWorker.llIIlllllIllIl[0]]);
        }
        catch (Throwable llllllllllllIllIlllIIIlllllIlIlI) {
            final CrashReport llllllllllllIllIlllIIIlllllIlIIl = CrashReport.makeCrashReport(llllllllllllIllIlllIIIlllllIlIlI, ChunkRenderWorker.llIIlllllIllII[ChunkRenderWorker.llIIlllllIllIl[1]]);
            Minecraft.getMinecraft().crashed(Minecraft.getMinecraft().addGraphicsAndWorldToCrashReport(llllllllllllIllIlllIIIlllllIlIIl));
        }
    }
}
