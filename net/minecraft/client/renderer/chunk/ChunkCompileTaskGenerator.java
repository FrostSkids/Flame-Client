// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.chunk;

import java.util.Iterator;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.client.renderer.RegionRenderCacheBuilder;
import java.util.concurrent.locks.ReentrantLock;

public class ChunkCompileTaskGenerator
{
    private final /* synthetic */ ReentrantLock lock;
    private static final /* synthetic */ int[] lIllIIlllIIlll;
    private /* synthetic */ CompiledChunk compiledChunk;
    private /* synthetic */ RegionRenderCacheBuilder regionRenderCacheBuilder;
    private final /* synthetic */ Type type;
    private final /* synthetic */ List<Runnable> listFinishRunnables;
    private /* synthetic */ Status status;
    private final /* synthetic */ RenderChunk renderChunk;
    private /* synthetic */ boolean finished;
    
    public void addFinishRunnable(final Runnable lllllllllllllIIIIIIlIIlIlIIlIIII) {
        this.lock.lock();
        try {
            this.listFinishRunnables.add(lllllllllllllIIIIIIlIIlIlIIlIIII);
            "".length();
            if (lllllIllIIIllII(this.finished ? 1 : 0)) {
                lllllllllllllIIIIIIlIIlIlIIlIIII.run();
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
        }
        finally {
            this.lock.unlock();
        }
        this.lock.unlock();
    }
    
    public boolean isFinished() {
        return this.finished;
    }
    
    public RegionRenderCacheBuilder getRegionRenderCacheBuilder() {
        return this.regionRenderCacheBuilder;
    }
    
    private static boolean lllllIllIIIlIlI(final Object lllllllllllllIIIIIIlIIlIlIIIIIIl, final Object lllllllllllllIIIIIIlIIlIlIIIIIII) {
        return lllllllllllllIIIIIIlIIlIlIIIIIIl != lllllllllllllIIIIIIlIIlIlIIIIIII;
    }
    
    static {
        lllllIllIIIlIII();
    }
    
    public ChunkCompileTaskGenerator(final RenderChunk lllllllllllllIIIIIIlIIlIllIIIIII, final Type lllllllllllllIIIIIIlIIlIlIllllll) {
        this.lock = new ReentrantLock();
        this.listFinishRunnables = (List<Runnable>)Lists.newArrayList();
        this.status = Status.PENDING;
        this.renderChunk = lllllllllllllIIIIIIlIIlIllIIIIII;
        this.type = lllllllllllllIIIIIIlIIlIlIllllll;
    }
    
    private static boolean lllllIllIIIllII(final int lllllllllllllIIIIIIlIIlIIllllIlI) {
        return lllllllllllllIIIIIIlIIlIIllllIlI != 0;
    }
    
    public CompiledChunk getCompiledChunk() {
        return this.compiledChunk;
    }
    
    private static boolean lllllIllIIIlIll(final int lllllllllllllIIIIIIlIIlIIllllIII) {
        return lllllllllllllIIIIIIlIIlIIllllIII == 0;
    }
    
    private static boolean lllllIllIIIlIIl(final Object lllllllllllllIIIIIIlIIlIIlllllIl, final Object lllllllllllllIIIIIIlIIlIIlllllII) {
        return lllllllllllllIIIIIIlIIlIIlllllIl == lllllllllllllIIIIIIlIIlIIlllllII;
    }
    
    public Status getStatus() {
        return this.status;
    }
    
    public void setCompiledChunk(final CompiledChunk lllllllllllllIIIIIIlIIlIlIllIIlI) {
        this.compiledChunk = lllllllllllllIIIIIIlIIlIlIllIIlI;
    }
    
    public ReentrantLock getLock() {
        return this.lock;
    }
    
    public void setStatus(final Status lllllllllllllIIIIIIlIIlIlIlIIIlI) {
        this.lock.lock();
        try {
            this.status = lllllllllllllIIIIIIlIIlIlIlIIIlI;
            "".length();
            if (((0x7B ^ 0x34) & ~(0x70 ^ 0x3F)) != 0x0) {
                return;
            }
        }
        finally {
            this.lock.unlock();
        }
        this.lock.unlock();
    }
    
    public void finish() {
        this.lock.lock();
        try {
            if (lllllIllIIIlIIl(this.type, Type.REBUILD_CHUNK) && lllllIllIIIlIlI(this.status, Status.DONE)) {
                this.renderChunk.setNeedsUpdate((boolean)(ChunkCompileTaskGenerator.lIllIIlllIIlll[0] != 0));
            }
            this.finished = (ChunkCompileTaskGenerator.lIllIIlllIIlll[0] != 0);
            this.status = Status.DONE;
            final short lllllllllllllIIIIIIlIIlIlIIlIllI = (short)this.listFinishRunnables.iterator();
            "".length();
            if ("  ".length() == 0) {
                return;
            }
            while (!lllllIllIIIlIll(((Iterator)lllllllllllllIIIIIIlIIlIlIIlIllI).hasNext() ? 1 : 0)) {
                final Runnable lllllllllllllIIIIIIlIIlIlIIllIIl = ((Iterator<Runnable>)lllllllllllllIIIIIIlIIlIlIIlIllI).next();
                lllllllllllllIIIIIIlIIlIlIIllIIl.run();
            }
            "".length();
            if (((39 + 61 + 133 + 3 ^ 94 + 67 - 79 + 113) & (0x4F ^ 0x4A ^ (0x60 ^ 0x4A) ^ -" ".length())) < ((0x8E ^ 0xC2 ^ (0x29 ^ 0x6)) & (0xAE ^ 0xBB ^ (0x1B ^ 0x6D) ^ -" ".length()))) {
                return;
            }
        }
        finally {
            this.lock.unlock();
        }
        this.lock.unlock();
    }
    
    private static void lllllIllIIIlIII() {
        (lIllIIlllIIlll = new int[1])[0] = " ".length();
    }
    
    public RenderChunk getRenderChunk() {
        return this.renderChunk;
    }
    
    public Type getType() {
        return this.type;
    }
    
    public void setRegionRenderCacheBuilder(final RegionRenderCacheBuilder lllllllllllllIIIIIIlIIlIlIlIlIIl) {
        this.regionRenderCacheBuilder = lllllllllllllIIIIIIlIIlIlIlIlIIl;
    }
    
    public enum Type
    {
        private static final /* synthetic */ String[] llIlIlIIIlIIlI;
        
        RESORT_TRANSPARENCY(Type.llIlIlIIIlIIlI[Type.llIlIlIIIlIIll[1]], Type.llIlIlIIIlIIll[1]);
        
        private static final /* synthetic */ int[] llIlIlIIIlIIll;
        
        REBUILD_CHUNK(Type.llIlIlIIIlIIlI[Type.llIlIlIIIlIIll[0]], Type.llIlIlIIIlIIll[0]);
        
        private Type(final String llllllllllllIllIlIllIIIIIIlIllII, final int llllllllllllIllIlIllIIIIIIlIlIll) {
        }
        
        private static String lIIlIIlllIIlllll(final String llllllllllllIllIlIllIIIIIIIIIIIl, final String llllllllllllIllIlIllIIIIIIIIIIII) {
            try {
                final SecretKeySpec llllllllllllIllIlIllIIIIIIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIllIIIIIIIIIIII.getBytes(StandardCharsets.UTF_8)), Type.llIlIlIIIlIIll[3]), "DES");
                final Cipher llllllllllllIllIlIllIIIIIIIIIlIl = Cipher.getInstance("DES");
                llllllllllllIllIlIllIIIIIIIIIlIl.init(Type.llIlIlIIIlIIll[2], llllllllllllIllIlIllIIIIIIIIIllI);
                return new String(llllllllllllIllIlIllIIIIIIIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIllIIIIIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlIllIIIIIIIIIlII) {
                llllllllllllIllIlIllIIIIIIIIIlII.printStackTrace();
                return null;
            }
        }
        
        private static void lIIlIIlllIlIIIlI() {
            (llIlIlIIIlIIll = new int[4])[0] = ((0xD6 ^ 0xAE ^ (0x7B ^ 0x55)) & (173 + 92 - 107 + 42 ^ 36 + 134 - 104 + 92 ^ -" ".length()));
            Type.llIlIlIIIlIIll[1] = " ".length();
            Type.llIlIlIIIlIIll[2] = "  ".length();
            Type.llIlIlIIIlIIll[3] = (0x13 ^ 0x1B);
        }
        
        private static boolean lIIlIIlllIlIIIll(final int llllllllllllIllIlIlIlllllllllIll, final int llllllllllllIllIlIlIlllllllllIlI) {
            return llllllllllllIllIlIlIlllllllllIll < llllllllllllIllIlIlIlllllllllIlI;
        }
        
        private static String lIIlIIlllIlIIIII(String llllllllllllIllIlIllIIIIIIIlIIll, final String llllllllllllIllIlIllIIIIIIIlIlll) {
            llllllllllllIllIlIllIIIIIIIlIIll = (boolean)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIllIIIIIIIlIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIlIllIIIIIIIlIllI = new StringBuilder();
            final char[] llllllllllllIllIlIllIIIIIIIlIlIl = llllllllllllIllIlIllIIIIIIIlIlll.toCharArray();
            int llllllllllllIllIlIllIIIIIIIlIlII = Type.llIlIlIIIlIIll[0];
            final float llllllllllllIllIlIllIIIIIIIIlllI = (Object)((String)llllllllllllIllIlIllIIIIIIIlIIll).toCharArray();
            final long llllllllllllIllIlIllIIIIIIIIllIl = llllllllllllIllIlIllIIIIIIIIlllI.length;
            double llllllllllllIllIlIllIIIIIIIIllII = Type.llIlIlIIIlIIll[0];
            while (lIIlIIlllIlIIIll((int)llllllllllllIllIlIllIIIIIIIIllII, (int)llllllllllllIllIlIllIIIIIIIIllIl)) {
                final char llllllllllllIllIlIllIIIIIIIllIIl = llllllllllllIllIlIllIIIIIIIIlllI[llllllllllllIllIlIllIIIIIIIIllII];
                llllllllllllIllIlIllIIIIIIIlIllI.append((char)(llllllllllllIllIlIllIIIIIIIllIIl ^ llllllllllllIllIlIllIIIIIIIlIlIl[llllllllllllIllIlIllIIIIIIIlIlII % llllllllllllIllIlIllIIIIIIIlIlIl.length]));
                "".length();
                ++llllllllllllIllIlIllIIIIIIIlIlII;
                ++llllllllllllIllIlIllIIIIIIIIllII;
                "".length();
                if (-" ".length() >= "  ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIlIllIIIIIIIlIllI);
        }
        
        private static void lIIlIIlllIlIIIIl() {
            (llIlIlIIIlIIlI = new String[Type.llIlIlIIIlIIll[2]])[Type.llIlIlIIIlIIll[0]] = lIIlIIlllIIlllll("BCx4XjndxwYkNhFuzf/KNQ==", "ECxuF");
            Type.llIlIlIIIlIIlI[Type.llIlIlIIIlIIll[1]] = lIIlIIlllIlIIIII("HQ8rChwbFSwXDwEZKAQcCgQ7HA==", "OJxEN");
        }
        
        static {
            lIIlIIlllIlIIIlI();
            lIIlIIlllIlIIIIl();
            final Type[] enum$VALUES = new Type[Type.llIlIlIIIlIIll[2]];
            enum$VALUES[Type.llIlIlIIIlIIll[0]] = Type.REBUILD_CHUNK;
            enum$VALUES[Type.llIlIlIIIlIIll[1]] = Type.RESORT_TRANSPARENCY;
            ENUM$VALUES = enum$VALUES;
        }
    }
    
    public enum Status
    {
        private static final /* synthetic */ int[] lIlIlIIIIlIIlI;
        
        DONE(Status.lIlIlIIIIIIllI[Status.lIlIlIIIIlIIlI[3]], Status.lIlIlIIIIlIIlI[3]), 
        UPLOADING(Status.lIlIlIIIIIIllI[Status.lIlIlIIIIlIIlI[2]], Status.lIlIlIIIIlIIlI[2]), 
        COMPILING(Status.lIlIlIIIIIIllI[Status.lIlIlIIIIlIIlI[1]], Status.lIlIlIIIIlIIlI[1]), 
        PENDING(Status.lIlIlIIIIIIllI[Status.lIlIlIIIIlIIlI[0]], Status.lIlIlIIIIlIIlI[0]);
        
        private static final /* synthetic */ String[] lIlIlIIIIIIllI;
        
        private static void lllIlIlIlIIIllI() {
            (lIlIlIIIIIIllI = new String[Status.lIlIlIIIIlIIlI[4]])[Status.lIlIlIIIIlIIlI[0]] = lllIlIlIIlllIll("66p6ODTTjtU=", "ExWTV");
            Status.lIlIlIIIIIIllI[Status.lIlIlIIIIlIIlI[1]] = lllIlIlIIlllIll("LfC37Mle8gXuf44cg+3srQ==", "PozgS");
            Status.lIlIlIIIIIIllI[Status.lIlIlIIIIlIIlI[2]] = lllIlIlIIllllII("hv77GHkGba4UAOHFyfj4jw==", "IIiWM");
            Status.lIlIlIIIIIIllI[Status.lIlIlIIIIlIIlI[3]] = lllIlIlIIlllIll("lWhKze4rvO8=", "KDTJy");
        }
        
        private static String lllIlIlIIllllII(final String lllllllllllllIIIlIllIIlIlIIIIIIl, final String lllllllllllllIIIlIllIIlIlIIIIIII) {
            try {
                final SecretKeySpec lllllllllllllIIIlIllIIlIlIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIllIIlIlIIIIIII.getBytes(StandardCharsets.UTF_8)), Status.lIlIlIIIIlIIlI[5]), "DES");
                final Cipher lllllllllllllIIIlIllIIlIlIIIIlIl = Cipher.getInstance("DES");
                lllllllllllllIIIlIllIIlIlIIIIlIl.init(Status.lIlIlIIIIlIIlI[2], lllllllllllllIIIlIllIIlIlIIIIllI);
                return new String(lllllllllllllIIIlIllIIlIlIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIllIIlIlIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIlIllIIlIlIIIIlII) {
                lllllllllllllIIIlIllIIlIlIIIIlII.printStackTrace();
                return null;
            }
        }
        
        private static String lllIlIlIIlllIll(final String lllllllllllllIIIlIllIIlIlIIlIIII, final String lllllllllllllIIIlIllIIlIlIIIllIl) {
            try {
                final SecretKeySpec lllllllllllllIIIlIllIIlIlIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIllIIlIlIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIIlIllIIlIlIIlIIlI = Cipher.getInstance("Blowfish");
                lllllllllllllIIIlIllIIlIlIIlIIlI.init(Status.lIlIlIIIIlIIlI[2], lllllllllllllIIIlIllIIlIlIIlIIll);
                return new String(lllllllllllllIIIlIllIIlIlIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIllIIlIlIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIlIllIIlIlIIlIIIl) {
                lllllllllllllIIIlIllIIlIlIIlIIIl.printStackTrace();
                return null;
            }
        }
        
        private static void lllIlIlIllIIIIl() {
            (lIlIlIIIIlIIlI = new int[6])[0] = ((0x75 ^ 0x65 ^ (0x3B ^ 0x6E)) & (0x2B ^ 0x5A ^ (0x8D ^ 0xB9) ^ -" ".length()));
            Status.lIlIlIIIIlIIlI[1] = " ".length();
            Status.lIlIlIIIIlIIlI[2] = "  ".length();
            Status.lIlIlIIIIlIIlI[3] = "   ".length();
            Status.lIlIlIIIIlIIlI[4] = (0x6B ^ 0x3D ^ (0x4C ^ 0x1E));
            Status.lIlIlIIIIlIIlI[5] = (0xFA ^ 0xAE ^ (0x7D ^ 0x21));
        }
        
        private Status(final String lllllllllllllIIIlIllIIlIlIlIIIIl, final int lllllllllllllIIIlIllIIlIlIlIIIII) {
        }
        
        static {
            lllIlIlIllIIIIl();
            lllIlIlIlIIIllI();
            final Status[] enum$VALUES = new Status[Status.lIlIlIIIIlIIlI[4]];
            enum$VALUES[Status.lIlIlIIIIlIIlI[0]] = Status.PENDING;
            enum$VALUES[Status.lIlIlIIIIlIIlI[1]] = Status.COMPILING;
            enum$VALUES[Status.lIlIlIIIIlIIlI[2]] = Status.UPLOADING;
            enum$VALUES[Status.lIlIlIIIIlIIlI[3]] = Status.DONE;
            ENUM$VALUES = enum$VALUES;
        }
    }
}
