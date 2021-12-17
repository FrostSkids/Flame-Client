// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.chunk.storage;

import java.util.Iterator;
import java.util.List;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.NextTickListEntry;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.BlockPos;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.EntityList;
import net.minecraft.world.chunk.NibbleArray;
import org.apache.logging.log4j.LogManager;
import java.io.DataOutputStream;
import java.io.DataOutput;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.world.storage.ThreadedFileIOBase;
import java.io.DataInputStream;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.world.MinecraftException;
import net.minecraft.nbt.NBTBase;
import java.io.IOException;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.World;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.io.File;
import org.apache.logging.log4j.Logger;
import java.util.Set;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.ChunkCoordIntPair;
import java.util.Map;
import net.minecraft.world.storage.IThreadedFileIO;

public class AnvilChunkLoader implements IChunkLoader, IThreadedFileIO
{
    private /* synthetic */ Map<ChunkCoordIntPair, NBTTagCompound> chunksToRemove;
    private /* synthetic */ Set<ChunkCoordIntPair> pendingAnvilChunksCoordinates;
    private static final /* synthetic */ Logger logger;
    private final /* synthetic */ File chunkSaveLocation;
    private static final /* synthetic */ String[] llIIIlllIIlIlI;
    private /* synthetic */ boolean field_183014_e;
    private static final /* synthetic */ int[] llIIIlllIIllll;
    
    private static String lIIIlIlIllIIllII(String llllllllllllIlllIlIIIIIllIllIlIl, final String llllllllllllIlllIlIIIIIllIllIlII) {
        llllllllllllIlllIlIIIIIllIllIlIl = new String(Base64.getDecoder().decode(llllllllllllIlllIlIIIIIllIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlIIIIIllIlllIII = new StringBuilder();
        final char[] llllllllllllIlllIlIIIIIllIllIlll = llllllllllllIlllIlIIIIIllIllIlII.toCharArray();
        int llllllllllllIlllIlIIIIIllIllIllI = AnvilChunkLoader.llIIIlllIIllll[0];
        final Exception llllllllllllIlllIlIIIIIllIllIIII = (Object)llllllllllllIlllIlIIIIIllIllIlIl.toCharArray();
        final String llllllllllllIlllIlIIIIIllIlIllll = (String)llllllllllllIlllIlIIIIIllIllIIII.length;
        short llllllllllllIlllIlIIIIIllIlIlllI = (short)AnvilChunkLoader.llIIIlllIIllll[0];
        while (lIIIlIlIlllIIlIl(llllllllllllIlllIlIIIIIllIlIlllI, (int)llllllllllllIlllIlIIIIIllIlIllll)) {
            final char llllllllllllIlllIlIIIIIllIlllIll = llllllllllllIlllIlIIIIIllIllIIII[llllllllllllIlllIlIIIIIllIlIlllI];
            llllllllllllIlllIlIIIIIllIlllIII.append((char)(llllllllllllIlllIlIIIIIllIlllIll ^ llllllllllllIlllIlIIIIIllIllIlll[llllllllllllIlllIlIIIIIllIllIllI % llllllllllllIlllIlIIIIIllIllIlll.length]));
            "".length();
            ++llllllllllllIlllIlIIIIIllIllIllI;
            ++llllllllllllIlllIlIIIIIllIlIlllI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlIIIIIllIlllIII);
    }
    
    @Override
    public void saveExtraChunkData(final World llllllllllllIlllIlIIIIlIlIlIIlll, final Chunk llllllllllllIlllIlIIIIlIlIlIIllI) throws IOException {
    }
    
    @Override
    public void saveChunk(final World llllllllllllIlllIlIIIIlIllIlIIll, final Chunk llllllllllllIlllIlIIIIlIllIlIIlI) throws IOException, MinecraftException {
        llllllllllllIlllIlIIIIlIllIlIIll.checkSessionLock();
        try {
            final NBTTagCompound llllllllllllIlllIlIIIIlIllIlIlll = new NBTTagCompound();
            final NBTTagCompound llllllllllllIlllIlIIIIlIllIlIllI = new NBTTagCompound();
            llllllllllllIlllIlIIIIlIllIlIlll.setTag(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[18]], llllllllllllIlllIlIIIIlIllIlIllI);
            this.writeChunkToNBT(llllllllllllIlllIlIIIIlIllIlIIlI, llllllllllllIlllIlIIIIlIllIlIIll, llllllllllllIlllIlIIIIlIllIlIllI);
            this.addChunkToPending(llllllllllllIlllIlIIIIlIllIlIIlI.getChunkCoordIntPair(), llllllllllllIlllIlIIIIlIllIlIlll);
            "".length();
            if (" ".length() <= 0) {
                return;
            }
        }
        catch (Exception llllllllllllIlllIlIIIIlIllIlIlIl) {
            AnvilChunkLoader.logger.error(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[19]], (Throwable)llllllllllllIlllIlIIIIlIllIlIlIl);
        }
    }
    
    @Override
    public Chunk loadChunk(final World llllllllllllIlllIlIIIIllIIIIIIIl, final int llllllllllllIlllIlIIIIllIIIIIIII, final int llllllllllllIlllIlIIIIlIlllllIII) throws IOException {
        final ChunkCoordIntPair llllllllllllIlllIlIIIIlIlllllllI = new ChunkCoordIntPair(llllllllllllIlllIlIIIIllIIIIIIII, llllllllllllIlllIlIIIIlIlllllIII);
        NBTTagCompound llllllllllllIlllIlIIIIlIllllllIl = this.chunksToRemove.get(llllllllllllIlllIlIIIIlIlllllllI);
        if (lIIIlIlIlllIIIII(llllllllllllIlllIlIIIIlIllllllIl)) {
            final DataInputStream llllllllllllIlllIlIIIIlIllllllII = RegionFileCache.getChunkInputStream(this.chunkSaveLocation, llllllllllllIlllIlIIIIllIIIIIIII, llllllllllllIlllIlIIIIlIlllllIII);
            if (lIIIlIlIlllIIIII(llllllllllllIlllIlIIIIlIllllllII)) {
                return null;
            }
            llllllllllllIlllIlIIIIlIllllllIl = CompressedStreamTools.read(llllllllllllIlllIlIIIIlIllllllII);
        }
        return this.checkedReadChunkFromNBT(llllllllllllIlllIlIIIIllIIIIIIIl, llllllllllllIlllIlIIIIllIIIIIIII, llllllllllllIlllIlIIIIlIlllllIII, llllllllllllIlllIlIIIIlIllllllIl);
    }
    
    protected void addChunkToPending(final ChunkCoordIntPair llllllllllllIlllIlIIIIlIllIIlIII, final NBTTagCompound llllllllllllIlllIlIIIIlIllIIlIlI) {
        if (lIIIlIlIlllIIIIl(this.pendingAnvilChunksCoordinates.contains(llllllllllllIlllIlIIIIlIllIIlIII) ? 1 : 0)) {
            this.chunksToRemove.put(llllllllllllIlllIlIIIIlIllIIlIII, llllllllllllIlllIlIIIIlIllIIlIlI);
            "".length();
        }
        ThreadedFileIOBase.getThreadedIOInstance().queueIO(this);
    }
    
    private static boolean lIIIlIlIlllIIIll(final Object llllllllllllIlllIlIIIIIllIIIlIIl) {
        return llllllllllllIlllIlIIIIIllIIIlIIl != null;
    }
    
    private static boolean lIIIlIlIlllIIIII(final Object llllllllllllIlllIlIIIIIllIIIIlll) {
        return llllllllllllIlllIlIIIIIllIIIIlll == null;
    }
    
    public AnvilChunkLoader(final File llllllllllllIlllIlIIIIllIIIIlIlI) {
        this.chunksToRemove = new ConcurrentHashMap<ChunkCoordIntPair, NBTTagCompound>();
        this.pendingAnvilChunksCoordinates = Collections.newSetFromMap(new ConcurrentHashMap<ChunkCoordIntPair, Boolean>());
        this.field_183014_e = (AnvilChunkLoader.llIIIlllIIllll[0] != 0);
        this.chunkSaveLocation = llllllllllllIlllIlIIIIllIIIIlIlI;
    }
    
    @Override
    public boolean writeNextIO() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        net/minecraft/world/chunk/storage/AnvilChunkLoader.chunksToRemove:Ljava/util/Map;
        //     4: invokeinterface java/util/Map.isEmpty:()Z
        //     9: invokestatic    net/minecraft/world/chunk/storage/AnvilChunkLoader.lIIIlIlIlllIIIlI:(I)Z
        //    12: ifeq            71
        //    15: aload_0         /* llllllllllllIlllIlIIIIlIlIlllIlI */
        //    16: getfield        net/minecraft/world/chunk/storage/AnvilChunkLoader.field_183014_e:Z
        //    19: invokestatic    net/minecraft/world/chunk/storage/AnvilChunkLoader.lIIIlIlIlllIIIlI:(I)Z
        //    22: ifeq            65
        //    25: getstatic       net/minecraft/world/chunk/storage/AnvilChunkLoader.logger:Lorg/apache/logging/log4j/Logger;
        //    28: getstatic       net/minecraft/world/chunk/storage/AnvilChunkLoader.llIIIlllIIlIlI:[Ljava/lang/String;
        //    31: getstatic       net/minecraft/world/chunk/storage/AnvilChunkLoader.llIIIlllIIllll:[I
        //    34: bipush          20
        //    36: iaload         
        //    37: aaload         
        //    38: getstatic       net/minecraft/world/chunk/storage/AnvilChunkLoader.llIIIlllIIllll:[I
        //    41: iconst_2       
        //    42: iaload         
        //    43: anewarray       Ljava/lang/Object;
        //    46: dup            
        //    47: getstatic       net/minecraft/world/chunk/storage/AnvilChunkLoader.llIIIlllIIllll:[I
        //    50: iconst_0       
        //    51: iaload         
        //    52: aload_0         /* llllllllllllIlllIlIIIIlIlIlllIlI */
        //    53: getfield        net/minecraft/world/chunk/storage/AnvilChunkLoader.chunkSaveLocation:Ljava/io/File;
        //    56: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    59: aastore        
        //    60: invokeinterface org/apache/logging/log4j/Logger.info:(Ljava/lang/String;[Ljava/lang/Object;)V
        //    65: getstatic       net/minecraft/world/chunk/storage/AnvilChunkLoader.llIIIlllIIllll:[I
        //    68: iconst_0       
        //    69: iaload         
        //    70: ireturn        
        //    71: aload_0         /* llllllllllllIlllIlIIIIlIlIlllIlI */
        //    72: getfield        net/minecraft/world/chunk/storage/AnvilChunkLoader.chunksToRemove:Ljava/util/Map;
        //    75: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //    80: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    85: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    90: checkcast       Lnet/minecraft/world/ChunkCoordIntPair;
        //    93: astore_1        /* llllllllllllIlllIlIIIIlIlIllllll */
        //    94: aload_0         /* llllllllllllIlllIlIIIIlIlIlllIlI */
        //    95: getfield        net/minecraft/world/chunk/storage/AnvilChunkLoader.pendingAnvilChunksCoordinates:Ljava/util/Set;
        //    98: aload_1         /* llllllllllllIlllIlIIIIlIlIllllll */
        //    99: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   104: ldc             ""
        //   106: invokevirtual   java/lang/String.length:()I
        //   109: pop2           
        //   110: aload_0         /* llllllllllllIlllIlIIIIlIlIlllIlI */
        //   111: getfield        net/minecraft/world/chunk/storage/AnvilChunkLoader.chunksToRemove:Ljava/util/Map;
        //   114: aload_1         /* llllllllllllIlllIlIIIIlIlIllllll */
        //   115: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   120: checkcast       Lnet/minecraft/nbt/NBTTagCompound;
        //   123: astore_3        /* llllllllllllIlllIlIIIIlIlIllIlll */
        //   124: aload_3         /* llllllllllllIlllIlIIIIlIlIllllII */
        //   125: invokestatic    net/minecraft/world/chunk/storage/AnvilChunkLoader.lIIIlIlIlllIIIll:(Ljava/lang/Object;)Z
        //   128: ifeq            194
        //   131: aload_0         /* llllllllllllIlllIlIIIIlIlIlllIlI */
        //   132: aload_1         /* llllllllllllIlllIlIIIIlIlIllllll */
        //   133: aload_3         /* llllllllllllIlllIlIIIIlIlIllllII */
        //   134: invokespecial   net/minecraft/world/chunk/storage/AnvilChunkLoader.func_183013_b:(Lnet/minecraft/world/ChunkCoordIntPair;Lnet/minecraft/nbt/NBTTagCompound;)V
        //   137: ldc             ""
        //   139: invokevirtual   java/lang/String.length:()I
        //   142: pop            
        //   143: ldc_w           "  "
        //   146: invokevirtual   java/lang/String.length:()I
        //   149: ineg           
        //   150: iflt            194
        //   153: ldc             " "
        //   155: invokevirtual   java/lang/String.length:()I
        //   158: ldc             " "
        //   160: invokevirtual   java/lang/String.length:()I
        //   163: ldc             " "
        //   165: invokevirtual   java/lang/String.length:()I
        //   168: ineg           
        //   169: ixor           
        //   170: iand           
        //   171: ireturn        
        //   172: astore          llllllllllllIlllIlIIIIlIlIlllIll
        //   174: getstatic       net/minecraft/world/chunk/storage/AnvilChunkLoader.logger:Lorg/apache/logging/log4j/Logger;
        //   177: getstatic       net/minecraft/world/chunk/storage/AnvilChunkLoader.llIIIlllIIlIlI:[Ljava/lang/String;
        //   180: getstatic       net/minecraft/world/chunk/storage/AnvilChunkLoader.llIIIlllIIllll:[I
        //   183: bipush          21
        //   185: iaload         
        //   186: aaload         
        //   187: aload           llllllllllllIlllIlIIIIlIlIlllIll
        //   189: invokeinterface org/apache/logging/log4j/Logger.error:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   194: getstatic       net/minecraft/world/chunk/storage/AnvilChunkLoader.llIIIlllIIllll:[I
        //   197: iconst_2       
        //   198: iaload         
        //   199: istore_2        /* llllllllllllIlllIlIIIIlIlIlllllI */
        //   200: ldc             ""
        //   202: invokevirtual   java/lang/String.length:()I
        //   205: pop            
        //   206: aconst_null    
        //   207: ifnull          245
        //   210: bipush          100
        //   212: bipush          65
        //   214: ixor           
        //   215: bipush          86
        //   217: bipush          115
        //   219: ixor           
        //   220: iconst_m1      
        //   221: ixor           
        //   222: iand           
        //   223: ireturn        
        //   224: astore          llllllllllllIlllIlIIIIlIlIllIlIl
        //   226: aload_0         /* llllllllllllIlllIlIIIIlIlIlllIlI */
        //   227: getfield        net/minecraft/world/chunk/storage/AnvilChunkLoader.pendingAnvilChunksCoordinates:Ljava/util/Set;
        //   230: aload_1         /* llllllllllllIlllIlIIIIlIlIllllll */
        //   231: invokeinterface java/util/Set.remove:(Ljava/lang/Object;)Z
        //   236: ldc             ""
        //   238: invokevirtual   java/lang/String.length:()I
        //   241: pop2           
        //   242: aload           llllllllllllIlllIlIIIIlIlIllIlIl
        //   244: athrow         
        //   245: aload_0         /* llllllllllllIlllIlIIIIlIlIlllIlI */
        //   246: getfield        net/minecraft/world/chunk/storage/AnvilChunkLoader.pendingAnvilChunksCoordinates:Ljava/util/Set;
        //   249: aload_1         /* llllllllllllIlllIlIIIIlIlIllllll */
        //   250: invokeinterface java/util/Set.remove:(Ljava/lang/Object;)Z
        //   255: ldc             ""
        //   257: invokevirtual   java/lang/String.length:()I
        //   260: pop2           
        //   261: iload_2         /* llllllllllllIlllIlIIIIlIlIllllIl */
        //   262: ireturn        
        //    StackMapTable: 00 06 FB 00 41 05 FF 00 64 00 04 07 00 02 07 00 B2 00 07 00 81 00 01 07 00 7A 15 FF 00 1D 00 02 07 00 02 07 00 B2 00 01 07 01 47 FC 00 14 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  131    137    172    194    Ljava/lang/Exception;
        //  94     224    224    245    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public void chunkTick() {
    }
    
    private static String lIIIlIlIllIIlIll(final String llllllllllllIlllIlIIIIIllIIllIII, final String llllllllllllIlllIlIIIIIllIIlIlll) {
        try {
            final SecretKeySpec llllllllllllIlllIlIIIIIllIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIIIIllIIlIlll.getBytes(StandardCharsets.UTF_8)), AnvilChunkLoader.llIIIlllIIllll[10]), "DES");
            final Cipher llllllllllllIlllIlIIIIIllIIllIlI = Cipher.getInstance("DES");
            llllllllllllIlllIlIIIIIllIIllIlI.init(AnvilChunkLoader.llIIIlllIIllll[3], llllllllllllIlllIlIIIIIllIIllIll);
            return new String(llllllllllllIlllIlIIIIIllIIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIIIIllIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIIIIIllIIllIIl) {
            llllllllllllIlllIlIIIIIllIIllIIl.printStackTrace();
            return null;
        }
    }
    
    private void func_183013_b(final ChunkCoordIntPair llllllllllllIlllIlIIIIlIlIlIllll, final NBTTagCompound llllllllllllIlllIlIIIIlIlIlIlllI) throws IOException {
        final DataOutputStream llllllllllllIlllIlIIIIlIlIlIllIl = RegionFileCache.getChunkOutputStream(this.chunkSaveLocation, llllllllllllIlllIlIIIIlIlIlIllll.chunkXPos, llllllllllllIlllIlIIIIlIlIlIllll.chunkZPos);
        CompressedStreamTools.write(llllllllllllIlllIlIIIIlIlIlIlllI, llllllllllllIlllIlIIIIlIlIlIllIl);
        llllllllllllIlllIlIIIIlIlIlIllIl.close();
    }
    
    private static boolean lIIIlIlIlllIIlII(final int llllllllllllIlllIlIIIIIllIIlIIII, final int llllllllllllIlllIlIIIIIllIIIllll) {
        return llllllllllllIlllIlIIIIIllIIlIIII >= llllllllllllIlllIlIIIIIllIIIllll;
    }
    
    static {
        lIIIlIlIllIlllll();
        lIIIlIlIllIlllIl();
        logger = LogManager.getLogger();
    }
    
    private static void lIIIlIlIllIlllIl() {
        (llIIIlllIIlIlI = new String[AnvilChunkLoader.llIIIlllIIllll[81]])[AnvilChunkLoader.llIIIlllIIllll[0]] = lIIIlIlIllIIlIll("X+gv8T4uAcE=", "NzHcO");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[2]] = lIIIlIlIllIIllII("GREwJh56HywkEHoYMWg=", "ZyEHu");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[3]] = lIIIlIlIllIIlIll("ySf/Ims66jw=", "NkPqK");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[4]] = lIIIlIlIllIIllIl("eDHiHzc5YLTCInf5A+io8YhF+daWsoxAG2MSk6Qnn9y1BTsltReDhA==", "xHedx");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[5]] = lIIIlIlIllIIllII("AAEwIB8=", "LdFEs");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[6]] = lIIIlIlIllIIllIl("nyAIj95vPxOcEOAhARB2bA==", "XoNPh");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[8]] = lIIIlIlIllIIllIl("gkuZXH3MAUXnXRW8W8oDZg==", "StTsa");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[9]] = lIIIlIlIllIIllII("TQ==", "aXtht");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[10]] = lIIIlIlIllIIllIl("eTIlqATTmqmB9Q4Gg5ZYa36xzFaTZrD+q/zEOvb/FJRSCeV7lGVLAg==", "PGUGd");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[7]] = lIIIlIlIllIIlIll("ifyBMwXSFQRvpexBVQfoxg==", "KIOnX");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[1]] = lIIIlIlIllIIlIll("Pj0o/N6dC8g=", "BnRVk");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[11]] = lIIIlIlIllIIllIl("Mjqio5C7rYFcYUVz1qbdG++ib24JGat6gfUaxb2KcIegsERr1UkRfa/hMhL4rSneBHgkNZuzkPA=", "ERYDn");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[12]] = lIIIlIlIllIIllIl("BTe/ZOg+GmI=", "wKjAr");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[13]] = lIIIlIlIllIIllIl("zw1anJVfyeQ=", "HQZmy");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[14]] = lIIIlIlIllIIlIll("J3s0qOCaxOs=", "OcClT");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[15]] = lIIIlIlIllIIllII("QA==", "iBuho");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[16]] = lIIIlIlIllIIllII("Oj8kIg==", "BoKQd");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[17]] = lIIIlIlIllIIllIl("fzT4w/Eb2Wk=", "ZbzMd");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[18]] = lIIIlIlIllIIllIl("EEvzWsp5edw=", "bFUpt");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[19]] = lIIIlIlIllIIllII("IC09JgYCbCAlQxUtIi9DBSQhJAg=", "fLTJc");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[20]] = lIIIlIlIllIIllIl("ww0Uh5EGdEUdu80iopPo9eyOpAcnpxIIgRxsGhkzefrtRhisnaaY6IplGLgUOkzAEVbYGGO7RP8=", "iucsF");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[21]] = lIIIlIlIllIIllIl("XgoGY0Onhqp7/sSe/LLZ1dFE1D4/2IRF", "mlHfF");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[22]] = lIIIlIlIllIIllII("BA==", "RNDtc");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[23]] = lIIIlIlIllIIllIl("oTgyGGqmidQ=", "PFphh");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[24]] = lIIIlIlIllIIllII("GTslGQ==", "ckJjV");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[25]] = lIIIlIlIllIIllIl("7UvIpK7jsuG26oFpot6RKw==", "JLbgB");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[26]] = lIIIlIlIllIIllII("JBEbNywYORMg", "ltrPD");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[27]] = lIIIlIlIllIIllIl("BQZBI9gLNGIWlvEM6D4lVf0k5X9rPgCU", "NgikS");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[28]] = lIIIlIlIllIIlIll("GUY7Xoy++h2CqhCJSmeJTg==", "MWrca");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[29]] = lIIIlIlIllIIllIl("V80BsVPlE/BSmdm72DniPw==", "ZmpAV");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[30]] = lIIIlIlIllIIllIl("sxQQop3LJKc=", "bemip");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[32]] = lIIIlIlIllIIllII("CAEsMB05", "JmCSv");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[33]] = lIIIlIlIllIIllII("IC8kCA==", "dNPiZ");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[34]] = lIIIlIlIllIIllII("Jwct", "fcIqF");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[35]] = lIIIlIlIllIIllIl("NobpxscrIQupGgygJB/EYg==", "iLWDP");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[36]] = lIIIlIlIllIIllII("HD03Az4oPjo=", "OVNOW");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[37]] = lIIIlIlIllIIllIl("pYADEG1nrS2MXpCQSeXzOA==", "aVEfm");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[38]] = lIIIlIlIllIIlIll("t9pkef7HEQsVvIDGbLKmRQ==", "hfeHX");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[39]] = lIIIlIlIllIIllII("FDkiDAkl", "VPMal");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[40]] = lIIIlIlIllIIllIl("J4E/Ss+6/0Ye/lUxP5AnAw==", "YIlCo");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[41]] = lIIIlIlIllIIllIl("Dti1EumEfHOlL11hAsQ2dg==", "YaBCT");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[42]] = lIIIlIlIllIIllIl("zss+Tm3JTZM=", "HuuxE");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[43]] = lIIIlIlIllIIllII("", "uqXCV");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[44]] = lIIIlIlIllIIllII("IA==", "XTFvf");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[45]] = lIIIlIlIllIIllII("Fg==", "oqNrK");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[46]] = lIIIlIlIllIIlIll("wng+NWzUkRQ=", "wtCwM");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[47]] = lIIIlIlIllIIllII("GQ==", "mJWJj");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[48]] = lIIIlIlIllIIlIll("q6iSxfMdGxw=", "nVCHk");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[49]] = lIIIlIlIllIIlIll("2b9iMGtWCGgpPRp198kb8Q==", "GXUJI");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[50]] = lIIIlIlIllIIllIl("1cJlQl2UcSM=", "SBCOt");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[51]] = lIIIlIlIllIIllIl("DZqjF03TbS8=", "MAxSE");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[52]] = lIIIlIlIllIIllIl("VYTiUYf6wO+/oeRxQUVwQg==", "UaEEi");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[53]] = lIIIlIlIllIIllII("LBA6JhcRGxg7Bg0ZKSATHA==", "xuHTv");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[54]] = lIIIlIlIllIIllIl("egTNlidg/v3NwVT961GEUA==", "jpJGQ");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[55]] = lIIIlIlIllIIlIll("tQ3o7t9vfRI44/lx0i+6Sg==", "LojlS");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[56]] = lIIIlIlIllIIllII("PgcwBzACDCA=", "mbSsY");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[57]] = lIIIlIlIllIIllIl("Ola63nM/Adg=", "juYVf");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[58]] = lIIIlIlIllIIllIl("lXmlbdQTars=", "XaIea");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[59]] = lIIIlIlIllIIlIll("hf012+g5xsg=", "ZtFDx");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[60]] = lIIIlIlIllIIlIll("62C+6yODzJA=", "twRVa");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[61]] = lIIIlIlIllIIllII("Lz4t", "nZInE");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[62]] = lIIIlIlIllIIllIl("eR6zY25XmXC+nZPXTjDlcQ==", "EZUNn");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[63]] = lIIIlIlIllIIlIll("GvehERalCdPW4r4lkTqbKw==", "nzsVF");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[64]] = lIIIlIlIllIIlIll("BpGbF/MKppw=", "MHxnx");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[65]] = lIIIlIlIllIIllII("BDssPjw1", "FRCSY");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[66]] = lIIIlIlIllIIllII("NBQfKy0YHxg=", "qzkBY");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[67]] = lIIIlIlIllIIllIl("gHavMSCBU8A=", "xVgXi");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[68]] = lIIIlIlIllIIllIl("ogitgJ2DcQw=", "uDBTu");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[69]] = lIIIlIlIllIIllIl("ZU8W3Z4xvh4=", "cMEJT");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[70]] = lIIIlIlIllIIllIl("OKWIlsianiGa6MSg9Ri7uw==", "IzZVs");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[71]] = lIIIlIlIllIIllIl("QKVy19HEdeylzPwAxQ6EMg==", "zHLCj");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[72]] = lIIIlIlIllIIllII("HzsrKj8iMSw8", "KRGOk");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[73]] = lIIIlIlIllIIlIll("8jLewrjckZs=", "ffnHu");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[74]] = lIIIlIlIllIIllII("EQ==", "xEXxr");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[75]] = lIIIlIlIllIIllIl("vAD7RiFydVc=", "DKDRY");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[76]] = lIIIlIlIllIIllIl("qV29QMrQVi0=", "MLIwk");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[77]] = lIIIlIlIllIIlIll("NlnehelOxoA=", "VjZPE");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[78]] = lIIIlIlIllIIllIl("MqmEdpqH5/o=", "RrCzY");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[79]] = lIIIlIlIllIIllIl("06EBmpQxHtA=", "mOknK");
        AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[80]] = lIIIlIlIllIIlIll("pijj1bvmwOg=", "aTlqs");
    }
    
    private static String lIIIlIlIllIIllIl(final String llllllllllllIlllIlIIIIIllIlIIIll, final String llllllllllllIlllIlIIIIIllIlIIlII) {
        try {
            final SecretKeySpec llllllllllllIlllIlIIIIIllIlIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIIIIllIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlIIIIIllIlIIlll = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlIIIIIllIlIIlll.init(AnvilChunkLoader.llIIIlllIIllll[3], llllllllllllIlllIlIIIIIllIlIlIII);
            return new String(llllllllllllIlllIlIIIIIllIlIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIIIIllIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIIIIIllIlIIllI) {
            llllllllllllIlllIlIIIIIllIlIIllI.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIlIlIllIlllll() {
        (llIIIlllIIllll = new int[82])[0] = ((117 + 60 - 82 + 36 ^ 51 + 138 - 55 + 12) & (0x4C ^ 0x2A ^ (0x4 ^ 0x73) ^ -" ".length()));
        AnvilChunkLoader.llIIIlllIIllll[1] = (0xE0 ^ 0xA3 ^ (0xCB ^ 0x82));
        AnvilChunkLoader.llIIIlllIIllll[2] = " ".length();
        AnvilChunkLoader.llIIIlllIIllll[3] = "  ".length();
        AnvilChunkLoader.llIIIlllIIllll[4] = "   ".length();
        AnvilChunkLoader.llIIIlllIIllll[5] = (70 + 75 - 85 + 79 ^ 101 + 13 + 26 + 3);
        AnvilChunkLoader.llIIIlllIIllll[6] = (39 + 120 - 133 + 101 ^ (0xFC ^ 0x86));
        AnvilChunkLoader.llIIIlllIIllll[7] = (0x15 ^ 0x1C);
        AnvilChunkLoader.llIIIlllIIllll[8] = (6 + 67 - 31 + 132 ^ 147 + 34 - 118 + 105);
        AnvilChunkLoader.llIIIlllIIllll[9] = (0x7B ^ 0x4B ^ (0x87 ^ 0xB0));
        AnvilChunkLoader.llIIIlllIIllll[10] = (0x92 ^ 0x9A);
        AnvilChunkLoader.llIIIlllIIllll[11] = (65 + 89 - 10 + 12 ^ 40 + 49 - 14 + 76);
        AnvilChunkLoader.llIIIlllIIllll[12] = (0x7A ^ 0xC ^ (0x1D ^ 0x67));
        AnvilChunkLoader.llIIIlllIIllll[13] = (0x54 ^ 0x61 ^ (0xB4 ^ 0x8C));
        AnvilChunkLoader.llIIIlllIIllll[14] = (0xBF ^ 0xB1);
        AnvilChunkLoader.llIIIlllIIllll[15] = (0x9 ^ 0x6);
        AnvilChunkLoader.llIIIlllIIllll[16] = (0x1F ^ 0xF);
        AnvilChunkLoader.llIIIlllIIllll[17] = (0x38 ^ 0x29);
        AnvilChunkLoader.llIIIlllIIllll[18] = (0xDF ^ 0x8E ^ (0xE6 ^ 0xA5));
        AnvilChunkLoader.llIIIlllIIllll[19] = (0xD ^ 0x1E);
        AnvilChunkLoader.llIIIlllIIllll[20] = (0x43 ^ 0x5D ^ (0x91 ^ 0x9B));
        AnvilChunkLoader.llIIIlllIIllll[21] = (120 + 61 - 148 + 111 ^ 35 + 102 - 113 + 109);
        AnvilChunkLoader.llIIIlllIIllll[22] = (0xD1 ^ 0xC7);
        AnvilChunkLoader.llIIIlllIIllll[23] = (175 + 174 - 215 + 46 ^ 40 + 88 - 105 + 140);
        AnvilChunkLoader.llIIIlllIIllll[24] = (0x2E ^ 0x36);
        AnvilChunkLoader.llIIIlllIIllll[25] = (0xA5 ^ 0xBC);
        AnvilChunkLoader.llIIIlllIIllll[26] = (0x4C ^ 0x56);
        AnvilChunkLoader.llIIIlllIIllll[27] = (0x2A ^ 0x31);
        AnvilChunkLoader.llIIIlllIIllll[28] = (0x3C ^ 0x20);
        AnvilChunkLoader.llIIIlllIIllll[29] = (0xA2 ^ 0xBF);
        AnvilChunkLoader.llIIIlllIIllll[30] = (65 + 171 - 233 + 188 ^ 106 + 16 - 81 + 120);
        AnvilChunkLoader.llIIIlllIIllll[31] = 123 + 48 + 81 + 3;
        AnvilChunkLoader.llIIIlllIIllll[32] = (0x72 ^ 0x6D);
        AnvilChunkLoader.llIIIlllIIllll[33] = (0x49 ^ 0x69);
        AnvilChunkLoader.llIIIlllIIllll[34] = (0x2C ^ 0xD);
        AnvilChunkLoader.llIIIlllIIllll[35] = (23 + 169 - 106 + 104 ^ 96 + 124 - 145 + 81);
        AnvilChunkLoader.llIIIlllIIllll[36] = (0xE9 ^ 0xB4 ^ (0xC5 ^ 0xBB));
        AnvilChunkLoader.llIIIlllIIllll[37] = (85 + 145 - 116 + 33 ^ 21 + 133 - 142 + 171);
        AnvilChunkLoader.llIIIlllIIllll[38] = (0xA5 ^ 0x80);
        AnvilChunkLoader.llIIIlllIIllll[39] = (0x9A ^ 0xBC);
        AnvilChunkLoader.llIIIlllIIllll[40] = (0x6B ^ 0x66 ^ (0x38 ^ 0x12));
        AnvilChunkLoader.llIIIlllIIllll[41] = (43 + 15 + 14 + 87 ^ 40 + 136 - 25 + 32);
        AnvilChunkLoader.llIIIlllIIllll[42] = (((0x9 ^ 0x5) & ~(0x45 ^ 0x49)) ^ (0x29 ^ 0x0));
        AnvilChunkLoader.llIIIlllIIllll[43] = (0x40 ^ 0x61 ^ (0x2E ^ 0x25));
        AnvilChunkLoader.llIIIlllIIllll[44] = (0x2B ^ 0x0);
        AnvilChunkLoader.llIIIlllIIllll[45] = (0x4 ^ 0x28);
        AnvilChunkLoader.llIIIlllIIllll[46] = (0x4 ^ 0x29);
        AnvilChunkLoader.llIIIlllIIllll[47] = (0xBB ^ 0x95);
        AnvilChunkLoader.llIIIlllIIllll[48] = (0xBE ^ 0x91);
        AnvilChunkLoader.llIIIlllIIllll[49] = (0x85 ^ 0xB5);
        AnvilChunkLoader.llIIIlllIIllll[50] = (0x1F ^ 0x2E);
        AnvilChunkLoader.llIIIlllIIllll[51] = (0x80 ^ 0xBF ^ (0x42 ^ 0x4F));
        AnvilChunkLoader.llIIIlllIIllll[52] = (50 + 36 + 36 + 37 ^ 43 + 123 - 135 + 141);
        AnvilChunkLoader.llIIIlllIIllll[53] = (0x59 ^ 0x6D);
        AnvilChunkLoader.llIIIlllIIllll[54] = (0x6B ^ 0x2D ^ (0xFE ^ 0x8D));
        AnvilChunkLoader.llIIIlllIIllll[55] = (87 + 51 - 5 + 114 ^ 93 + 140 - 215 + 175);
        AnvilChunkLoader.llIIIlllIIllll[56] = (115 + 124 - 160 + 51 ^ 169 + 107 - 121 + 26);
        AnvilChunkLoader.llIIIlllIIllll[57] = (0xF8 ^ 0xC0);
        AnvilChunkLoader.llIIIlllIIllll[58] = (0x1 ^ 0x19 ^ (0xA6 ^ 0x87));
        AnvilChunkLoader.llIIIlllIIllll[59] = (0x78 ^ 0x42);
        AnvilChunkLoader.llIIIlllIIllll[60] = (0x2C ^ 0x3A ^ (0xA3 ^ 0x8E));
        AnvilChunkLoader.llIIIlllIIllll[61] = (0x16 ^ 0x43 ^ (0x2A ^ 0x43));
        AnvilChunkLoader.llIIIlllIIllll[62] = (7 + 148 - 37 + 43 ^ 53 + 114 - 103 + 92);
        AnvilChunkLoader.llIIIlllIIllll[63] = (0x2E ^ 0x7A ^ (0x53 ^ 0x39));
        AnvilChunkLoader.llIIIlllIIllll[64] = (0x5D ^ 0x62);
        AnvilChunkLoader.llIIIlllIIllll[65] = (10 + 127 + 32 + 25 ^ 25 + 22 - 13 + 96);
        AnvilChunkLoader.llIIIlllIIllll[66] = (0xE4 ^ 0x8F ^ (0x27 ^ 0xD));
        AnvilChunkLoader.llIIIlllIIllll[67] = (0x5B ^ 0x19);
        AnvilChunkLoader.llIIIlllIIllll[68] = (57 + 15 + 39 + 85 ^ 10 + 77 - 83 + 131);
        AnvilChunkLoader.llIIIlllIIllll[69] = (0x28 ^ 0x6C);
        AnvilChunkLoader.llIIIlllIIllll[70] = (0x4 ^ 0x7F ^ (0xB8 ^ 0x86));
        AnvilChunkLoader.llIIIlllIIllll[71] = (0xA5 ^ 0xB8 ^ (0x61 ^ 0x3A));
        AnvilChunkLoader.llIIIlllIIllll[72] = (0x66 ^ 0x21);
        AnvilChunkLoader.llIIIlllIIllll[73] = (0x29 ^ 0x38 ^ (0xE8 ^ 0xB1));
        AnvilChunkLoader.llIIIlllIIllll[74] = (0xFF ^ 0xB6);
        AnvilChunkLoader.llIIIlllIIllll[75] = (0xED ^ 0xA7);
        AnvilChunkLoader.llIIIlllIIllll[76] = (157 + 19 - 89 + 126 ^ 64 + 1 + 34 + 59);
        AnvilChunkLoader.llIIIlllIIllll[77] = (0xCA ^ 0x86);
        AnvilChunkLoader.llIIIlllIIllll[78] = (0x5D ^ 0x10);
        AnvilChunkLoader.llIIIlllIIllll[79] = (0xD7 ^ 0x99);
        AnvilChunkLoader.llIIIlllIIllll[80] = (106 + 99 - 101 + 39 ^ 124 + 30 + 29 + 9);
        AnvilChunkLoader.llIIIlllIIllll[81] = (12 + 102 - 52 + 137 ^ 81 + 27 - 22 + 65);
    }
    
    private static boolean lIIIlIlIlllIIIIl(final int llllllllllllIlllIlIIIIIllIIIIIll) {
        return llllllllllllIlllIlIIIIIllIIIIIll == 0;
    }
    
    protected Chunk checkedReadChunkFromNBT(final World llllllllllllIlllIlIIIIlIlllIllII, final int llllllllllllIlllIlIIIIlIlllIIlII, final int llllllllllllIlllIlIIIIlIlllIIIll, final NBTTagCompound llllllllllllIlllIlIIIIlIlllIIIlI) {
        if (lIIIlIlIlllIIIIl(llllllllllllIlllIlIIIIlIlllIIIlI.hasKey(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[0]], AnvilChunkLoader.llIIIlllIIllll[1]) ? 1 : 0)) {
            AnvilChunkLoader.logger.error(String.valueOf(new StringBuilder(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[2]]).append(llllllllllllIlllIlIIIIlIlllIIlII).append(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[3]]).append(llllllllllllIlllIlIIIIlIlllIIIll).append(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[4]])));
            return null;
        }
        final NBTTagCompound llllllllllllIlllIlIIIIlIlllIlIII = llllllllllllIlllIlIIIIlIlllIIIlI.getCompoundTag(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[5]]);
        if (lIIIlIlIlllIIIIl(llllllllllllIlllIlIIIIlIlllIlIII.hasKey(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[6]], AnvilChunkLoader.llIIIlllIIllll[7]) ? 1 : 0)) {
            AnvilChunkLoader.logger.error(String.valueOf(new StringBuilder(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[8]]).append(llllllllllllIlllIlIIIIlIlllIIlII).append(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[9]]).append(llllllllllllIlllIlIIIIlIlllIIIll).append(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[10]])));
            return null;
        }
        Chunk llllllllllllIlllIlIIIIlIlllIIlll = this.readChunkFromNBT(llllllllllllIlllIlIIIIlIlllIllII, llllllllllllIlllIlIIIIlIlllIlIII);
        if (lIIIlIlIlllIIIIl(llllllllllllIlllIlIIIIlIlllIIlll.isAtLocation(llllllllllllIlllIlIIIIlIlllIIlII, llllllllllllIlllIlIIIIlIlllIIIll) ? 1 : 0)) {
            AnvilChunkLoader.logger.error(String.valueOf(new StringBuilder(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[7]]).append(llllllllllllIlllIlIIIIlIlllIIlII).append(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[1]]).append(llllllllllllIlllIlIIIIlIlllIIIll).append(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[11]]).append(llllllllllllIlllIlIIIIlIlllIIlII).append(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[12]]).append(llllllllllllIlllIlIIIIlIlllIIIll).append(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[13]]).append(llllllllllllIlllIlIIIIlIlllIIlll.xPosition).append(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[14]]).append(llllllllllllIlllIlIIIIlIlllIIlll.zPosition).append(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[15]])));
            llllllllllllIlllIlIIIIlIlllIlIII.setInteger(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[16]], llllllllllllIlllIlIIIIlIlllIIlII);
            llllllllllllIlllIlIIIIlIlllIlIII.setInteger(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[17]], llllllllllllIlllIlIIIIlIlllIIIll);
            llllllllllllIlllIlIIIIlIlllIIlll = this.readChunkFromNBT(llllllllllllIlllIlIIIIlIlllIllII, llllllllllllIlllIlIIIIlIlllIlIII);
        }
        return llllllllllllIlllIlIIIIlIlllIIlll;
    }
    
    private static boolean lIIIlIlIlllIIIlI(final int llllllllllllIlllIlIIIIIllIIIIlIl) {
        return llllllllllllIlllIlIIIIIllIIIIlIl != 0;
    }
    
    private Chunk readChunkFromNBT(final World llllllllllllIlllIlIIIIlIIIIIIIlI, final NBTTagCompound llllllllllllIlllIlIIIIlIIIIIIIIl) {
        final int llllllllllllIlllIlIIIIlIIIlllIll = llllllllllllIlllIlIIIIlIIIIIIIIl.getInteger(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[50]]);
        final int llllllllllllIlllIlIIIIlIIIlllIIl = llllllllllllIlllIlIIIIlIIIIIIIIl.getInteger(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[51]]);
        final Chunk llllllllllllIlllIlIIIIlIIIllIlll = new Chunk(llllllllllllIlllIlIIIIlIIIIIIIlI, llllllllllllIlllIlIIIIlIIIlllIll, llllllllllllIlllIlIIIIlIIIlllIIl);
        llllllllllllIlllIlIIIIlIIIllIlll.setHeightMap(llllllllllllIlllIlIIIIlIIIIIIIIl.getIntArray(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[52]]));
        llllllllllllIlllIlIIIIlIIIllIlll.setTerrainPopulated(llllllllllllIlllIlIIIIlIIIIIIIIl.getBoolean(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[53]]));
        llllllllllllIlllIlIIIIlIIIllIlll.setLightPopulated(llllllllllllIlllIlIIIIlIIIIIIIIl.getBoolean(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[54]]));
        llllllllllllIlllIlIIIIlIIIllIlll.setInhabitedTime(llllllllllllIlllIlIIIIlIIIIIIIIl.getLong(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[55]]));
        final NBTTagList llllllllllllIlllIlIIIIlIIIllIlIl = llllllllllllIlllIlIIIIlIIIIIIIIl.getTagList(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[56]], AnvilChunkLoader.llIIIlllIIllll[1]);
        final int llllllllllllIlllIlIIIIlIIIllIlII = AnvilChunkLoader.llIIIlllIIllll[16];
        final ExtendedBlockStorage[] llllllllllllIlllIlIIIIlIIIllIIlI = new ExtendedBlockStorage[llllllllllllIlllIlIIIIlIIIllIlII];
        int n;
        if (lIIIlIlIlllIIIlI(llllllllllllIlllIlIIIIlIIIIIIIlI.provider.getHasNoSky() ? 1 : 0)) {
            n = AnvilChunkLoader.llIIIlllIIllll[0];
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        else {
            n = AnvilChunkLoader.llIIIlllIIllll[2];
        }
        final boolean llllllllllllIlllIlIIIIlIIIllIIII = n != 0;
        int llllllllllllIlllIlIIIIlIIIlIlllI = AnvilChunkLoader.llIIIlllIIllll[0];
        "".length();
        if (-" ".length() > ((0xAA ^ 0xA2) & ~(0x10 ^ 0x18))) {
            return null;
        }
        while (!lIIIlIlIlllIIlII(llllllllllllIlllIlIIIIlIIIlIlllI, llllllllllllIlllIlIIIIlIIIllIlIl.tagCount())) {
            final NBTTagCompound llllllllllllIlllIlIIIIlIIIlIllII = llllllllllllIlllIlIIIIlIIIllIlIl.getCompoundTagAt(llllllllllllIlllIlIIIIlIIIlIlllI);
            final int llllllllllllIlllIlIIIIlIIIlIlIlI = llllllllllllIlllIlIIIIlIIIlIllII.getByte(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[57]]);
            final ExtendedBlockStorage llllllllllllIlllIlIIIIlIIIlIlIII = new ExtendedBlockStorage(llllllllllllIlllIlIIIIlIIIlIlIlI << AnvilChunkLoader.llIIIlllIIllll[5], llllllllllllIlllIlIIIIlIIIllIIII);
            final byte[] llllllllllllIlllIlIIIIlIIIlIIlll = llllllllllllIlllIlIIIIlIIIlIllII.getByteArray(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[58]]);
            final NibbleArray llllllllllllIlllIlIIIIlIIIlIIlIl = new NibbleArray(llllllllllllIlllIlIIIIlIIIlIllII.getByteArray(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[59]]));
            NibbleArray nibbleArray;
            if (lIIIlIlIlllIIIlI(llllllllllllIlllIlIIIIlIIIlIllII.hasKey(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[60]], AnvilChunkLoader.llIIIlllIIllll[9]) ? 1 : 0)) {
                nibbleArray = new NibbleArray(llllllllllllIlllIlIIIIlIIIlIllII.getByteArray(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[61]]));
                "".length();
                if ("  ".length() == " ".length()) {
                    return null;
                }
            }
            else {
                nibbleArray = null;
            }
            final NibbleArray llllllllllllIlllIlIIIIlIIIlIIIll = nibbleArray;
            final char[] llllllllllllIlllIlIIIIlIIIlIIIlI = new char[llllllllllllIlllIlIIIIlIIIlIIlll.length];
            int llllllllllllIlllIlIIIIlIIIlIIIIl = AnvilChunkLoader.llIIIlllIIllll[0];
            "".length();
            if (null != null) {
                return null;
            }
            while (!lIIIlIlIlllIIlII(llllllllllllIlllIlIIIIlIIIlIIIIl, llllllllllllIlllIlIIIIlIIIlIIIlI.length)) {
                final int llllllllllllIlllIlIIIIlIIIlIIIII = llllllllllllIlllIlIIIIlIIIlIIIIl & AnvilChunkLoader.llIIIlllIIllll[15];
                final int llllllllllllIlllIlIIIIlIIIIlllll = llllllllllllIlllIlIIIIlIIIlIIIIl >> AnvilChunkLoader.llIIIlllIIllll[10] & AnvilChunkLoader.llIIIlllIIllll[15];
                final int llllllllllllIlllIlIIIIlIIIIllllI = llllllllllllIlllIlIIIIlIIIlIIIIl >> AnvilChunkLoader.llIIIlllIIllll[5] & AnvilChunkLoader.llIIIlllIIllll[15];
                int value;
                if (lIIIlIlIlllIIIll(llllllllllllIlllIlIIIIlIIIlIIIll)) {
                    value = llllllllllllIlllIlIIIIlIIIlIIIll.get(llllllllllllIlllIlIIIIlIIIlIIIII, llllllllllllIlllIlIIIIlIIIIlllll, llllllllllllIlllIlIIIIlIIIIllllI);
                    "".length();
                    if (-"   ".length() > 0) {
                        return null;
                    }
                }
                else {
                    value = AnvilChunkLoader.llIIIlllIIllll[0];
                }
                final int llllllllllllIlllIlIIIIlIIIIlllIl = value;
                llllllllllllIlllIlIIIIlIIIlIIIlI[llllllllllllIlllIlIIIIlIIIlIIIIl] = (char)(llllllllllllIlllIlIIIIlIIIIlllIl << AnvilChunkLoader.llIIIlllIIllll[12] | (llllllllllllIlllIlIIIIlIIIlIIlll[llllllllllllIlllIlIIIIlIIIlIIIIl] & AnvilChunkLoader.llIIIlllIIllll[31]) << AnvilChunkLoader.llIIIlllIIllll[5] | llllllllllllIlllIlIIIIlIIIlIIlIl.get(llllllllllllIlllIlIIIIlIIIlIIIII, llllllllllllIlllIlIIIIlIIIIlllll, llllllllllllIlllIlIIIIlIIIIllllI));
                ++llllllllllllIlllIlIIIIlIIIlIIIIl;
            }
            llllllllllllIlllIlIIIIlIIIlIlIII.setData(llllllllllllIlllIlIIIIlIIIlIIIlI);
            llllllllllllIlllIlIIIIlIIIlIlIII.setBlocklightArray(new NibbleArray(llllllllllllIlllIlIIIIlIIIlIllII.getByteArray(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[62]])));
            if (lIIIlIlIlllIIIlI(llllllllllllIlllIlIIIIlIIIllIIII ? 1 : 0)) {
                llllllllllllIlllIlIIIIlIIIlIlIII.setSkylightArray(new NibbleArray(llllllllllllIlllIlIIIIlIIIlIllII.getByteArray(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[63]])));
            }
            llllllllllllIlllIlIIIIlIIIlIlIII.removeInvalidBlocks();
            llllllllllllIlllIlIIIIlIIIllIIlI[llllllllllllIlllIlIIIIlIIIlIlIlI] = llllllllllllIlllIlIIIIlIIIlIlIII;
            ++llllllllllllIlllIlIIIIlIIIlIlllI;
        }
        llllllllllllIlllIlIIIIlIIIllIlll.setStorageArrays(llllllllllllIlllIlIIIIlIIIllIIlI);
        if (lIIIlIlIlllIIIlI(llllllllllllIlllIlIIIIlIIIIIIIIl.hasKey(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[64]], AnvilChunkLoader.llIIIlllIIllll[9]) ? 1 : 0)) {
            llllllllllllIlllIlIIIIlIIIllIlll.setBiomeArray(llllllllllllIlllIlIIIIlIIIIIIIIl.getByteArray(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[65]]));
        }
        final NBTTagList llllllllllllIlllIlIIIIlIIIIlllII = llllllllllllIlllIlIIIIlIIIIIIIIl.getTagList(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[66]], AnvilChunkLoader.llIIIlllIIllll[1]);
        if (lIIIlIlIlllIIIll(llllllllllllIlllIlIIIIlIIIIlllII)) {
            int llllllllllllIlllIlIIIIlIIIIllIlI = AnvilChunkLoader.llIIIlllIIllll[0];
            "".length();
            if (((0x4B ^ 0x78) & ~(0x2F ^ 0x1C)) != 0x0) {
                return null;
            }
            while (!lIIIlIlIlllIIlII(llllllllllllIlllIlIIIIlIIIIllIlI, llllllllllllIlllIlIIIIlIIIIlllII.tagCount())) {
                final NBTTagCompound llllllllllllIlllIlIIIIlIIIIllIIl = llllllllllllIlllIlIIIIlIIIIlllII.getCompoundTagAt(llllllllllllIlllIlIIIIlIIIIllIlI);
                final Entity llllllllllllIlllIlIIIIlIIIIlIlll = EntityList.createEntityFromNBT(llllllllllllIlllIlIIIIlIIIIllIIl, llllllllllllIlllIlIIIIlIIIIIIIlI);
                llllllllllllIlllIlIIIIlIIIllIlll.setHasEntities((boolean)(AnvilChunkLoader.llIIIlllIIllll[2] != 0));
                if (lIIIlIlIlllIIIll(llllllllllllIlllIlIIIIlIIIIlIlll)) {
                    llllllllllllIlllIlIIIIlIIIllIlll.addEntity(llllllllllllIlllIlIIIIlIIIIlIlll);
                    Entity llllllllllllIlllIlIIIIlIIIIlIllI = llllllllllllIlllIlIIIIlIIIIlIlll;
                    NBTTagCompound llllllllllllIlllIlIIIIlIIIIlIlIl = llllllllllllIlllIlIIIIlIIIIllIIl;
                    "".length();
                    if (((0x6F ^ 0x4B) & ~(0x92 ^ 0xB6)) != 0x0) {
                        return null;
                    }
                    while (!lIIIlIlIlllIIIIl(llllllllllllIlllIlIIIIlIIIIlIlIl.hasKey(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[69]], AnvilChunkLoader.llIIIlllIIllll[1]) ? 1 : 0)) {
                        final Entity llllllllllllIlllIlIIIIlIIIIlIIll = EntityList.createEntityFromNBT(llllllllllllIlllIlIIIIlIIIIlIlIl.getCompoundTag(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[67]]), llllllllllllIlllIlIIIIlIIIIIIIlI);
                        if (lIIIlIlIlllIIIll(llllllllllllIlllIlIIIIlIIIIlIIll)) {
                            llllllllllllIlllIlIIIIlIIIllIlll.addEntity(llllllllllllIlllIlIIIIlIIIIlIIll);
                            llllllllllllIlllIlIIIIlIIIIlIllI.mountEntity(llllllllllllIlllIlIIIIlIIIIlIIll);
                        }
                        llllllllllllIlllIlIIIIlIIIIlIllI = llllllllllllIlllIlIIIIlIIIIlIIll;
                        llllllllllllIlllIlIIIIlIIIIlIlIl = llllllllllllIlllIlIIIIlIIIIlIlIl.getCompoundTag(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[68]]);
                    }
                }
                ++llllllllllllIlllIlIIIIlIIIIllIlI;
            }
        }
        final NBTTagList llllllllllllIlllIlIIIIlIIIIlIIIl = llllllllllllIlllIlIIIIlIIIIIIIIl.getTagList(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[70]], AnvilChunkLoader.llIIIlllIIllll[1]);
        if (lIIIlIlIlllIIIll(llllllllllllIlllIlIIIIlIIIIlIIIl)) {
            int llllllllllllIlllIlIIIIlIIIIIllll = AnvilChunkLoader.llIIIlllIIllll[0];
            "".length();
            if (" ".length() < 0) {
                return null;
            }
            while (!lIIIlIlIlllIIlII(llllllllllllIlllIlIIIIlIIIIIllll, llllllllllllIlllIlIIIIlIIIIlIIIl.tagCount())) {
                final NBTTagCompound llllllllllllIlllIlIIIIlIIIIIllIl = llllllllllllIlllIlIIIIlIIIIlIIIl.getCompoundTagAt(llllllllllllIlllIlIIIIlIIIIIllll);
                final TileEntity llllllllllllIlllIlIIIIlIIIIIlIll = TileEntity.createAndLoadEntity(llllllllllllIlllIlIIIIlIIIIIllIl);
                if (lIIIlIlIlllIIIll(llllllllllllIlllIlIIIIlIIIIIlIll)) {
                    llllllllllllIlllIlIIIIlIIIllIlll.addTileEntity(llllllllllllIlllIlIIIIlIIIIIlIll);
                }
                ++llllllllllllIlllIlIIIIlIIIIIllll;
            }
        }
        if (lIIIlIlIlllIIIlI(llllllllllllIlllIlIIIIlIIIIIIIIl.hasKey(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[71]], AnvilChunkLoader.llIIIlllIIllll[7]) ? 1 : 0)) {
            final NBTTagList llllllllllllIlllIlIIIIlIIIIIlIIl = llllllllllllIlllIlIIIIlIIIIIIIIl.getTagList(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[72]], AnvilChunkLoader.llIIIlllIIllll[1]);
            if (lIIIlIlIlllIIIll(llllllllllllIlllIlIIIIlIIIIIlIIl)) {
                int llllllllllllIlllIlIIIIlIIIIIIlll = AnvilChunkLoader.llIIIlllIIllll[0];
                "".length();
                if (-(0x10 ^ 0x5F ^ (0x63 ^ 0x28)) > 0) {
                    return null;
                }
                while (!lIIIlIlIlllIIlII(llllllllllllIlllIlIIIIlIIIIIIlll, llllllllllllIlllIlIIIIlIIIIIlIIl.tagCount())) {
                    final NBTTagCompound llllllllllllIlllIlIIIIlIIIIIIlIl = llllllllllllIlllIlIIIIlIIIIIlIIl.getCompoundTagAt(llllllllllllIlllIlIIIIlIIIIIIlll);
                    Block llllllllllllIlllIlIIIIlIIIIIIIll = null;
                    if (lIIIlIlIlllIIIlI(llllllllllllIlllIlIIIIlIIIIIIlIl.hasKey(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[73]], AnvilChunkLoader.llIIIlllIIllll[10]) ? 1 : 0)) {
                        final Block llllllllllllIlllIlIIIIlIIIIIIlII = Block.getBlockFromName(llllllllllllIlllIlIIIIlIIIIIIlIl.getString(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[74]]));
                        "".length();
                        if (" ".length() < 0) {
                            return null;
                        }
                    }
                    else {
                        llllllllllllIlllIlIIIIlIIIIIIIll = Block.getBlockById(llllllllllllIlllIlIIIIlIIIIIIlIl.getInteger(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[75]]));
                    }
                    llllllllllllIlllIlIIIIlIIIIIIIlI.scheduleBlockUpdate(new BlockPos(llllllllllllIlllIlIIIIlIIIIIIlIl.getInteger(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[76]]), llllllllllllIlllIlIIIIlIIIIIIlIl.getInteger(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[77]]), llllllllllllIlllIlIIIIlIIIIIIlIl.getInteger(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[78]])), llllllllllllIlllIlIIIIlIIIIIIIll, llllllllllllIlllIlIIIIlIIIIIIlIl.getInteger(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[79]]), llllllllllllIlllIlIIIIlIIIIIIlIl.getInteger(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[80]]));
                    ++llllllllllllIlllIlIIIIlIIIIIIlll;
                }
            }
        }
        return llllllllllllIlllIlIIIIlIIIllIlll;
    }
    
    @Override
    public void saveExtraData() {
        try {
            this.field_183014_e = (AnvilChunkLoader.llIIIlllIIllll[2] != 0);
            while (true) {
                if (lIIIlIlIlllIIIlI(this.writeNextIO() ? 1 : 0)) {
                    "".length();
                    if (-" ".length() >= "  ".length()) {
                        break;
                    }
                    continue;
                }
            }
        }
        finally {
            this.field_183014_e = (AnvilChunkLoader.llIIIlllIIllll[0] != 0);
        }
    }
    
    private void writeChunkToNBT(final Chunk llllllllllllIlllIlIIIIlIlIIIlIll, final World llllllllllllIlllIlIIIIlIlIIIlIlI, final NBTTagCompound llllllllllllIlllIlIIIIlIIllIllII) {
        llllllllllllIlllIlIIIIlIIllIllII.setByte(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[22]], (byte)AnvilChunkLoader.llIIIlllIIllll[2]);
        llllllllllllIlllIlIIIIlIIllIllII.setInteger(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[23]], llllllllllllIlllIlIIIIlIlIIIlIll.xPosition);
        llllllllllllIlllIlIIIIlIIllIllII.setInteger(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[24]], llllllllllllIlllIlIIIIlIlIIIlIll.zPosition);
        llllllllllllIlllIlIIIIlIIllIllII.setLong(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[25]], llllllllllllIlllIlIIIIlIlIIIlIlI.getTotalWorldTime());
        llllllllllllIlllIlIIIIlIIllIllII.setIntArray(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[26]], llllllllllllIlllIlIIIIlIlIIIlIll.getHeightMap());
        llllllllllllIlllIlIIIIlIIllIllII.setBoolean(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[27]], llllllllllllIlllIlIIIIlIlIIIlIll.isTerrainPopulated());
        llllllllllllIlllIlIIIIlIIllIllII.setBoolean(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[28]], llllllllllllIlllIlIIIIlIlIIIlIll.isLightPopulated());
        llllllllllllIlllIlIIIIlIIllIllII.setLong(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[29]], llllllllllllIlllIlIIIIlIlIIIlIll.getInhabitedTime());
        final ExtendedBlockStorage[] llllllllllllIlllIlIIIIlIlIIIlIII = llllllllllllIlllIlIIIIlIlIIIlIll.getBlockStorageArray();
        final NBTTagList llllllllllllIlllIlIIIIlIlIIIIlll = new NBTTagList();
        int n;
        if (lIIIlIlIlllIIIlI(llllllllllllIlllIlIIIIlIlIIIlIlI.provider.getHasNoSky() ? 1 : 0)) {
            n = AnvilChunkLoader.llIIIlllIIllll[0];
            "".length();
            if ((0x6C ^ 0x19 ^ (0x20 ^ 0x51)) < ((0x30 ^ 0x50 ^ (0x94 ^ 0xBC)) & (0xBD ^ 0xA3 ^ (0x26 ^ 0x70) ^ -" ".length()))) {
                return;
            }
        }
        else {
            n = AnvilChunkLoader.llIIIlllIIllll[2];
        }
        final boolean llllllllllllIlllIlIIIIlIlIIIIllI = n != 0;
        Exception llllllllllllIlllIlIIIIlIIllIIlIl;
        final int length = (llllllllllllIlllIlIIIIlIIllIIlIl = (Exception)(Object)llllllllllllIlllIlIIIIlIlIIIlIII).length;
        char llllllllllllIlllIlIIIIlIIllIIlll = (char)AnvilChunkLoader.llIIIlllIIllll[0];
        "".length();
        if (" ".length() <= ((0x7A ^ 0x70) & ~(0x16 ^ 0x1C))) {
            return;
        }
        while (!lIIIlIlIlllIIlII(llllllllllllIlllIlIIIIlIIllIIlll, length)) {
            final ExtendedBlockStorage llllllllllllIlllIlIIIIlIlIIIIlIl = llllllllllllIlllIlIIIIlIIllIIlIl[llllllllllllIlllIlIIIIlIIllIIlll];
            if (lIIIlIlIlllIIIll(llllllllllllIlllIlIIIIlIlIIIIlIl)) {
                final NBTTagCompound llllllllllllIlllIlIIIIlIlIIIIlII = new NBTTagCompound();
                llllllllllllIlllIlIIIIlIlIIIIlII.setByte(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[30]], (byte)(llllllllllllIlllIlIIIIlIlIIIIlIl.getYLocation() >> AnvilChunkLoader.llIIIlllIIllll[5] & AnvilChunkLoader.llIIIlllIIllll[31]));
                final byte[] llllllllllllIlllIlIIIIlIlIIIIIll = new byte[llllllllllllIlllIlIIIIlIlIIIIlIl.getData().length];
                final NibbleArray llllllllllllIlllIlIIIIlIlIIIIIlI = new NibbleArray();
                NibbleArray llllllllllllIlllIlIIIIlIlIIIIIIl = null;
                int llllllllllllIlllIlIIIIlIlIIIIIII = AnvilChunkLoader.llIIIlllIIllll[0];
                "".length();
                if ((0x6F ^ 0x76 ^ (0xB5 ^ 0xA9)) == 0x0) {
                    return;
                }
                while (!lIIIlIlIlllIIlII(llllllllllllIlllIlIIIIlIlIIIIIII, llllllllllllIlllIlIIIIlIlIIIIlIl.getData().length)) {
                    final char llllllllllllIlllIlIIIIlIIlllllll = llllllllllllIlllIlIIIIlIlIIIIlIl.getData()[llllllllllllIlllIlIIIIlIlIIIIIII];
                    final int llllllllllllIlllIlIIIIlIIllllllI = llllllllllllIlllIlIIIIlIlIIIIIII & AnvilChunkLoader.llIIIlllIIllll[15];
                    final int llllllllllllIlllIlIIIIlIIlllllIl = llllllllllllIlllIlIIIIlIlIIIIIII >> AnvilChunkLoader.llIIIlllIIllll[10] & AnvilChunkLoader.llIIIlllIIllll[15];
                    final int llllllllllllIlllIlIIIIlIIlllllII = llllllllllllIlllIlIIIIlIlIIIIIII >> AnvilChunkLoader.llIIIlllIIllll[5] & AnvilChunkLoader.llIIIlllIIllll[15];
                    if (lIIIlIlIlllIIIlI(llllllllllllIlllIlIIIIlIIlllllll >> AnvilChunkLoader.llIIIlllIIllll[12])) {
                        if (lIIIlIlIlllIIIII(llllllllllllIlllIlIIIIlIlIIIIIIl)) {
                            llllllllllllIlllIlIIIIlIlIIIIIIl = new NibbleArray();
                        }
                        llllllllllllIlllIlIIIIlIlIIIIIIl.set(llllllllllllIlllIlIIIIlIIllllllI, llllllllllllIlllIlIIIIlIIlllllIl, llllllllllllIlllIlIIIIlIIlllllII, llllllllllllIlllIlIIIIlIIlllllll >> AnvilChunkLoader.llIIIlllIIllll[12]);
                    }
                    llllllllllllIlllIlIIIIlIlIIIIIll[llllllllllllIlllIlIIIIlIlIIIIIII] = (byte)(llllllllllllIlllIlIIIIlIIlllllll >> AnvilChunkLoader.llIIIlllIIllll[5] & AnvilChunkLoader.llIIIlllIIllll[31]);
                    llllllllllllIlllIlIIIIlIlIIIIIlI.set(llllllllllllIlllIlIIIIlIIllllllI, llllllllllllIlllIlIIIIlIIlllllIl, llllllllllllIlllIlIIIIlIIlllllII, llllllllllllIlllIlIIIIlIIlllllll & AnvilChunkLoader.llIIIlllIIllll[15]);
                    ++llllllllllllIlllIlIIIIlIlIIIIIII;
                }
                llllllllllllIlllIlIIIIlIlIIIIlII.setByteArray(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[32]], llllllllllllIlllIlIIIIlIlIIIIIll);
                llllllllllllIlllIlIIIIlIlIIIIlII.setByteArray(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[33]], llllllllllllIlllIlIIIIlIlIIIIIlI.getData());
                if (lIIIlIlIlllIIIll(llllllllllllIlllIlIIIIlIlIIIIIIl)) {
                    llllllllllllIlllIlIIIIlIlIIIIlII.setByteArray(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[34]], llllllllllllIlllIlIIIIlIlIIIIIIl.getData());
                }
                llllllllllllIlllIlIIIIlIlIIIIlII.setByteArray(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[35]], llllllllllllIlllIlIIIIlIlIIIIlIl.getBlocklightArray().getData());
                if (lIIIlIlIlllIIIlI(llllllllllllIlllIlIIIIlIlIIIIllI ? 1 : 0)) {
                    llllllllllllIlllIlIIIIlIlIIIIlII.setByteArray(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[36]], llllllllllllIlllIlIIIIlIlIIIIlIl.getSkylightArray().getData());
                    "".length();
                    if (-" ".length() >= 0) {
                        return;
                    }
                }
                else {
                    llllllllllllIlllIlIIIIlIlIIIIlII.setByteArray(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[37]], new byte[llllllllllllIlllIlIIIIlIlIIIIlIl.getBlocklightArray().getData().length]);
                }
                llllllllllllIlllIlIIIIlIlIIIIlll.appendTag(llllllllllllIlllIlIIIIlIlIIIIlII);
            }
            ++llllllllllllIlllIlIIIIlIIllIIlll;
        }
        llllllllllllIlllIlIIIIlIIllIllII.setTag(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[38]], llllllllllllIlllIlIIIIlIlIIIIlll);
        llllllllllllIlllIlIIIIlIIllIllII.setByteArray(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[39]], llllllllllllIlllIlIIIIlIlIIIlIll.getBiomeArray());
        llllllllllllIlllIlIIIIlIlIIIlIll.setHasEntities((boolean)(AnvilChunkLoader.llIIIlllIIllll[0] != 0));
        final NBTTagList llllllllllllIlllIlIIIIlIIllllIll = new NBTTagList();
        int llllllllllllIlllIlIIIIlIIllllIlI = AnvilChunkLoader.llIIIlllIIllll[0];
        "".length();
        if (" ".length() > "  ".length()) {
            return;
        }
        while (!lIIIlIlIlllIIlII(llllllllllllIlllIlIIIIlIIllllIlI, llllllllllllIlllIlIIIIlIlIIIlIll.getEntityLists().length)) {
            llllllllllllIlllIlIIIIlIIllIIlIl = (Exception)llllllllllllIlllIlIIIIlIlIIIlIll.getEntityLists()[llllllllllllIlllIlIIIIlIIllllIlI].iterator();
            "".length();
            if (" ".length() <= 0) {
                return;
            }
            while (!lIIIlIlIlllIIIIl(((Iterator)llllllllllllIlllIlIIIIlIIllIIlIl).hasNext() ? 1 : 0)) {
                final Entity llllllllllllIlllIlIIIIlIIllllIIl = ((Iterator<Entity>)llllllllllllIlllIlIIIIlIIllIIlIl).next();
                final NBTTagCompound llllllllllllIlllIlIIIIlIIllllIII = new NBTTagCompound();
                if (lIIIlIlIlllIIIlI(llllllllllllIlllIlIIIIlIIllllIIl.writeToNBTOptional(llllllllllllIlllIlIIIIlIIllllIII) ? 1 : 0)) {
                    llllllllllllIlllIlIIIIlIlIIIlIll.setHasEntities((boolean)(AnvilChunkLoader.llIIIlllIIllll[2] != 0));
                    llllllllllllIlllIlIIIIlIIllllIll.appendTag(llllllllllllIlllIlIIIIlIIllllIII);
                }
            }
            ++llllllllllllIlllIlIIIIlIIllllIlI;
        }
        llllllllllllIlllIlIIIIlIIllIllII.setTag(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[40]], llllllllllllIlllIlIIIIlIIllllIll);
        final NBTTagList llllllllllllIlllIlIIIIlIIlllIlll = new NBTTagList();
        llllllllllllIlllIlIIIIlIIllIIlIl = (Exception)llllllllllllIlllIlIIIIlIlIIIlIll.getTileEntityMap().values().iterator();
        "".length();
        if (((0xDF ^ 0xAA ^ (0x11 ^ 0x59)) & (51 + 127 - 37 + 22 ^ 78 + 52 - 57 + 85 ^ -" ".length())) > "  ".length()) {
            return;
        }
        while (!lIIIlIlIlllIIIIl(((Iterator)llllllllllllIlllIlIIIIlIIllIIlIl).hasNext() ? 1 : 0)) {
            final TileEntity llllllllllllIlllIlIIIIlIIlllIllI = ((Iterator<TileEntity>)llllllllllllIlllIlIIIIlIIllIIlIl).next();
            final NBTTagCompound llllllllllllIlllIlIIIIlIIlllIlIl = new NBTTagCompound();
            llllllllllllIlllIlIIIIlIIlllIllI.writeToNBT(llllllllllllIlllIlIIIIlIIlllIlIl);
            llllllllllllIlllIlIIIIlIIlllIlll.appendTag(llllllllllllIlllIlIIIIlIIlllIlIl);
        }
        llllllllllllIlllIlIIIIlIIllIllII.setTag(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[41]], llllllllllllIlllIlIIIIlIIlllIlll);
        final List<NextTickListEntry> llllllllllllIlllIlIIIIlIIlllIlII = llllllllllllIlllIlIIIIlIlIIIlIlI.getPendingBlockUpdates(llllllllllllIlllIlIIIIlIlIIIlIll, (boolean)(AnvilChunkLoader.llIIIlllIIllll[0] != 0));
        if (lIIIlIlIlllIIIll(llllllllllllIlllIlIIIIlIIlllIlII)) {
            final long llllllllllllIlllIlIIIIlIIlllIIll = llllllllllllIlllIlIIIIlIlIIIlIlI.getTotalWorldTime();
            final NBTTagList llllllllllllIlllIlIIIIlIIlllIIlI = new NBTTagList();
            final Iterator<NextTickListEntry> iterator = llllllllllllIlllIlIIIIlIIlllIlII.iterator();
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIIlIlIlllIIIIl(iterator.hasNext() ? 1 : 0)) {
                final NextTickListEntry llllllllllllIlllIlIIIIlIIlllIIIl = iterator.next();
                final NBTTagCompound llllllllllllIlllIlIIIIlIIlllIIII = new NBTTagCompound();
                final ResourceLocation llllllllllllIlllIlIIIIlIIllIllll = Block.blockRegistry.getNameForObject(llllllllllllIlllIlIIIIlIIlllIIIl.getBlock());
                final NBTTagCompound nbtTagCompound = llllllllllllIlllIlIIIIlIIlllIIII;
                final String lllllllllllllIIIIIlIIIlIIIIIIllI = AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[42]];
                String string;
                if (lIIIlIlIlllIIIII(llllllllllllIlllIlIIIIlIIllIllll)) {
                    string = AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[43]];
                    "".length();
                    if (-"   ".length() >= 0) {
                        return;
                    }
                }
                else {
                    string = llllllllllllIlllIlIIIIlIIllIllll.toString();
                }
                nbtTagCompound.setString(lllllllllllllIIIIIlIIIlIIIIIIllI, string);
                llllllllllllIlllIlIIIIlIIlllIIII.setInteger(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[44]], llllllllllllIlllIlIIIIlIIlllIIIl.position.getX());
                llllllllllllIlllIlIIIIlIIlllIIII.setInteger(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[45]], llllllllllllIlllIlIIIIlIIlllIIIl.position.getY());
                llllllllllllIlllIlIIIIlIIlllIIII.setInteger(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[46]], llllllllllllIlllIlIIIIlIIlllIIIl.position.getZ());
                llllllllllllIlllIlIIIIlIIlllIIII.setInteger(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[47]], (int)(llllllllllllIlllIlIIIIlIIlllIIIl.scheduledTime - llllllllllllIlllIlIIIIlIIlllIIll));
                llllllllllllIlllIlIIIIlIIlllIIII.setInteger(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[48]], llllllllllllIlllIlIIIIlIIlllIIIl.priority);
                llllllllllllIlllIlIIIIlIIlllIIlI.appendTag(llllllllllllIlllIlIIIIlIIlllIIII);
            }
            llllllllllllIlllIlIIIIlIIllIllII.setTag(AnvilChunkLoader.llIIIlllIIlIlI[AnvilChunkLoader.llIIIlllIIllll[49]], llllllllllllIlllIlIIIIlIIlllIIlI);
        }
    }
    
    private static boolean lIIIlIlIlllIIlIl(final int llllllllllllIlllIlIIIIIllIIIllII, final int llllllllllllIlllIlIIIIIllIIIlIll) {
        return llllllllllllIlllIlIIIIIllIIIllII < llllllllllllIlllIlIIIIIllIIIlIll;
    }
}
