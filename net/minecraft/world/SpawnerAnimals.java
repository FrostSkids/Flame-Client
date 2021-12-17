// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world;

import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.entity.EntityLiving;
import net.minecraft.world.biome.BiomeGenBase;
import java.util.Random;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.util.MathHelper;
import net.minecraft.util.BlockPos;
import java.util.Set;

public final class SpawnerAnimals
{
    private final /* synthetic */ Set<ChunkCoordIntPair> eligibleChunksForSpawning;
    private static final /* synthetic */ int[] llIllllIIlIIlI;
    
    private static boolean lIIllIlIlIIIIIIl(final int llllllllllllIllIIIllllIllllIIlll, final int llllllllllllIllIIIllllIllllIIllI) {
        return llllllllllllIllIIIllllIllllIIlll < llllllllllllIllIIIllllIllllIIllI;
    }
    
    private static int lIIllIlIlIIIIIII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIIllIlIIllllIIl(final int llllllllllllIllIIIllllIllllIIIll, final int llllllllllllIllIIIllllIllllIIIlI) {
        return llllllllllllIllIIIllllIllllIIIll <= llllllllllllIllIIIllllIllllIIIlI;
    }
    
    private static boolean lIIllIlIIllllIll(final Object llllllllllllIllIIIllllIlllIlIlII) {
        return llllllllllllIllIIIllllIlllIlIlII == null;
    }
    
    private static boolean lIIllIlIIlllIlll(final int llllllllllllIllIIIllllIlllIlIIlI) {
        return llllllllllllIllIIIllllIlllIlIIlI != 0;
    }
    
    protected static BlockPos getRandomChunkPosition(final World llllllllllllIllIIIlllllIIlIIlIlI, final int llllllllllllIllIIIlllllIIlIIlIIl, final int llllllllllllIllIIIlllllIIlIIlIII) {
        final Chunk llllllllllllIllIIIlllllIIlIIllll = llllllllllllIllIIIlllllIIlIIlIlI.getChunkFromChunkCoords(llllllllllllIllIIIlllllIIlIIlIIl, llllllllllllIllIIIlllllIIlIIlIII);
        final int llllllllllllIllIIIlllllIIlIIlllI = llllllllllllIllIIIlllllIIlIIlIIl * SpawnerAnimals.llIllllIIlIIlI[6] + llllllllllllIllIIIlllllIIlIIlIlI.rand.nextInt(SpawnerAnimals.llIllllIIlIIlI[6]);
        final int llllllllllllIllIIIlllllIIlIIllIl = llllllllllllIllIIIlllllIIlIIlIII * SpawnerAnimals.llIllllIIlIIlI[6] + llllllllllllIllIIIlllllIIlIIlIlI.rand.nextInt(SpawnerAnimals.llIllllIIlIIlI[6]);
        final int llllllllllllIllIIIlllllIIlIIllII = MathHelper.func_154354_b(llllllllllllIllIIIlllllIIlIIllll.getHeight(new BlockPos(llllllllllllIllIIIlllllIIlIIlllI, SpawnerAnimals.llIllllIIlIIlI[0], llllllllllllIllIIIlllllIIlIIllIl)) + SpawnerAnimals.llIllllIIlIIlI[2], SpawnerAnimals.llIllllIIlIIlI[6]);
        final Random rand = llllllllllllIllIIIlllllIIlIIlIlI.rand;
        int bound;
        if (lIIllIlIIlllllIl(llllllllllllIllIIIlllllIIlIIllII)) {
            bound = llllllllllllIllIIIlllllIIlIIllII;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        else {
            bound = llllllllllllIllIIIlllllIIlIIllll.getTopFilledSegment() + SpawnerAnimals.llIllllIIlIIlI[6] - SpawnerAnimals.llIllllIIlIIlI[2];
        }
        final int llllllllllllIllIIIlllllIIlIIlIll = rand.nextInt(bound);
        return new BlockPos(llllllllllllIllIIIlllllIIlIIlllI, llllllllllllIllIIIlllllIIlIIlIll, llllllllllllIllIIIlllllIIlIIllIl);
    }
    
    static {
        lIIllIlIIlllIIll();
        MOB_COUNT_DIV = (int)Math.pow(17.0, 2.0);
    }
    
    private static boolean lIIllIlIIlllllIl(final int llllllllllllIllIIIllllIlllIIllII) {
        return llllllllllllIllIIIllllIlllIIllII > 0;
    }
    
    private static int lIIllIlIIlllIlII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public static void performWorldGenSpawning(final World llllllllllllIllIIIlllllIIIIIIIlI, final BiomeGenBase llllllllllllIllIIIlllllIIIIlIlll, final int llllllllllllIllIIIlllllIIIIIIIII, final int llllllllllllIllIIIllllIlllllllll, final int llllllllllllIllIIIllllIllllllllI, final int llllllllllllIllIIIllllIlllllllIl, final Random llllllllllllIllIIIllllIlllllllII) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       net/minecraft/entity/EnumCreatureType.CREATURE:Lnet/minecraft/entity/EnumCreatureType;
        //     4: invokevirtual   net/minecraft/world/biome/BiomeGenBase.getSpawnableList:(Lnet/minecraft/entity/EnumCreatureType;)Ljava/util/List;
        //     7: astore          llllllllllllIllIIIlllllIIIIlIIIl
        //     9: aload           llllllllllllIllIIIlllllIIIIlIIIl
        //    11: invokeinterface java/util/List.isEmpty:()Z
        //    16: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIlIl:(I)Z
        //    19: ifeq            708
        //    22: ldc             ""
        //    24: invokevirtual   java/lang/String.length:()I
        //    27: pop            
        //    28: sipush          178
        //    31: sipush          182
        //    34: ixor           
        //    35: bipush          86
        //    37: bipush          66
        //    39: ixor           
        //    40: bipush          25
        //    42: bipush          13
        //    44: ixor           
        //    45: iconst_m1      
        //    46: ixor           
        //    47: iand           
        //    48: if_icmpne       690
        //    51: return         
        //    52: aload_0         /* llllllllllllIllIIIlllllIIIIllIII */
        //    53: getfield        net/minecraft/world/World.rand:Ljava/util/Random;
        //    56: aload           llllllllllllIllIIIlllllIIIIlIIIl
        //    58: invokestatic    net/minecraft/util/WeightedRandom.getRandomItem:(Ljava/util/Random;Ljava/util/Collection;)Lnet/minecraft/util/WeightedRandom$Item;
        //    61: checkcast       Lnet/minecraft/world/biome/BiomeGenBase$SpawnListEntry;
        //    64: astore          llllllllllllIllIIIlllllIIIIlIIII
        //    66: aload           llllllllllllIllIIIlllllIIIIlIIII
        //    68: getfield        net/minecraft/world/biome/BiomeGenBase$SpawnListEntry.minGroupCount:I
        //    71: aload           llllllllllllIllIIIlllllIIIIlIIlI
        //    73: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //    76: iconst_2       
        //    77: iaload         
        //    78: aload           llllllllllllIllIIIlllllIIIIlIIII
        //    80: getfield        net/minecraft/world/biome/BiomeGenBase$SpawnListEntry.maxGroupCount:I
        //    83: iadd           
        //    84: aload           llllllllllllIllIIIlllllIIIIlIIII
        //    86: getfield        net/minecraft/world/biome/BiomeGenBase$SpawnListEntry.minGroupCount:I
        //    89: isub           
        //    90: invokevirtual   java/util/Random.nextInt:(I)I
        //    93: iadd           
        //    94: istore          llllllllllllIllIIIlllllIIIIIllll
        //    96: aconst_null    
        //    97: astore          llllllllllllIllIIIlllllIIIIIlllI
        //    99: iload_2         /* llllllllllllIllIIIlllllIIIIlIllI */
        //   100: aload           llllllllllllIllIIIlllllIIIIlIIlI
        //   102: iload           llllllllllllIllIIIlllllIIIIlIlII
        //   104: invokevirtual   java/util/Random.nextInt:(I)I
        //   107: iadd           
        //   108: istore          llllllllllllIllIIIlllllIIIIIllIl
        //   110: iload_3         /* llllllllllllIllIIIlllllIIIIlIlIl */
        //   111: aload           llllllllllllIllIIIlllllIIIIlIIlI
        //   113: iload           llllllllllllIllIIIlllllIIIIlIIll
        //   115: invokevirtual   java/util/Random.nextInt:(I)I
        //   118: iadd           
        //   119: istore          llllllllllllIllIIIlllllIIIIIllII
        //   121: iload           llllllllllllIllIIIlllllIIIIIllIl
        //   123: istore          llllllllllllIllIIIlllllIIIIIlIll
        //   125: iload           llllllllllllIllIIIlllllIIIIIllII
        //   127: istore          llllllllllllIllIIIlllllIIIIIlIlI
        //   129: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   132: iconst_0       
        //   133: iaload         
        //   134: istore          llllllllllllIllIIIlllllIIIIIlIIl
        //   136: ldc             ""
        //   138: invokevirtual   java/lang/String.length:()I
        //   141: pop            
        //   142: bipush          84
        //   144: bipush          22
        //   146: ixor           
        //   147: bipush          92
        //   149: bipush          30
        //   151: ixor           
        //   152: iconst_m1      
        //   153: ixor           
        //   154: iand           
        //   155: ldc             " "
        //   157: invokevirtual   java/lang/String.length:()I
        //   160: if_icmplt       680
        //   163: return         
        //   164: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   167: iconst_0       
        //   168: iaload         
        //   169: istore          llllllllllllIllIIIlllllIIIIIlIII
        //   171: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   174: iconst_0       
        //   175: iaload         
        //   176: istore          llllllllllllIllIIIlllllIIIIIIlll
        //   178: ldc             ""
        //   180: invokevirtual   java/lang/String.length:()I
        //   183: pop            
        //   184: bipush          83
        //   186: bipush          15
        //   188: iadd           
        //   189: bipush          90
        //   191: isub           
        //   192: sipush          195
        //   195: iadd           
        //   196: sipush          129
        //   199: bipush          60
        //   201: iadd           
        //   202: bipush          57
        //   204: isub           
        //   205: bipush          64
        //   207: iadd           
        //   208: ixor           
        //   209: bipush          119
        //   211: bipush          17
        //   213: iadd           
        //   214: bipush          -37
        //   216: isub           
        //   217: bipush          16
        //   219: iadd           
        //   220: bipush          38
        //   222: bipush          102
        //   224: iadd           
        //   225: bipush          64
        //   227: isub           
        //   228: bipush          102
        //   230: iadd           
        //   231: ixor           
        //   232: ldc             " "
        //   234: invokevirtual   java/lang/String.length:()I
        //   237: ineg           
        //   238: ixor           
        //   239: iand           
        //   240: bipush          34
        //   242: bipush          57
        //   244: ixor           
        //   245: sipush          149
        //   248: sipush          173
        //   251: ixor           
        //   252: ixor           
        //   253: bipush          63
        //   255: bipush          113
        //   257: ixor           
        //   258: bipush          15
        //   260: bipush          98
        //   262: ixor           
        //   263: ixor           
        //   264: ldc             " "
        //   266: invokevirtual   java/lang/String.length:()I
        //   269: ineg           
        //   270: ixor           
        //   271: iand           
        //   272: ldc             " "
        //   274: invokevirtual   java/lang/String.length:()I
        //   277: ineg           
        //   278: ixor           
        //   279: iand           
        //   280: ldc             "  "
        //   282: invokevirtual   java/lang/String.length:()I
        //   285: if_icmple       656
        //   288: return         
        //   289: aload_0         /* llllllllllllIllIIIlllllIIIIllIII */
        //   290: new             Lnet/minecraft/util/BlockPos;
        //   293: dup            
        //   294: iload           llllllllllllIllIIIlllllIIIIIllIl
        //   296: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   299: iconst_0       
        //   300: iaload         
        //   301: iload           llllllllllllIllIIIlllllIIIIIllII
        //   303: invokespecial   net/minecraft/util/BlockPos.<init>:(III)V
        //   306: invokevirtual   net/minecraft/world/World.getTopSolidOrLiquidBlock:(Lnet/minecraft/util/BlockPos;)Lnet/minecraft/util/BlockPos;
        //   309: astore          llllllllllllIllIIIlllllIIIIIIllI
        //   311: getstatic       net/minecraft/entity/EntityLiving$SpawnPlacementType.ON_GROUND:Lnet/minecraft/entity/EntityLiving$SpawnPlacementType;
        //   314: aload_0         /* llllllllllllIllIIIlllllIIIIllIII */
        //   315: aload           llllllllllllIllIIIlllllIIIIIIllI
        //   317: invokestatic    net/minecraft/world/SpawnerAnimals.canCreatureTypeSpawnAtLocation:(Lnet/minecraft/entity/EntityLiving$SpawnPlacementType;Lnet/minecraft/world/World;Lnet/minecraft/util/BlockPos;)Z
        //   320: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIlll:(I)Z
        //   323: ifeq            479
        //   326: aload           llllllllllllIllIIIlllllIIIIlIIII
        //   328: getfield        net/minecraft/world/biome/BiomeGenBase$SpawnListEntry.entityClass:Ljava/lang/Class;
        //   331: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   334: iconst_2       
        //   335: iaload         
        //   336: anewarray       Ljava/lang/Class;
        //   339: dup            
        //   340: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   343: iconst_0       
        //   344: iaload         
        //   345: ldc             Lnet/minecraft/world/World;.class
        //   347: aastore        
        //   348: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //   351: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   354: iconst_2       
        //   355: iaload         
        //   356: anewarray       Ljava/lang/Object;
        //   359: dup            
        //   360: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   363: iconst_0       
        //   364: iaload         
        //   365: aload_0         /* llllllllllllIllIIIlllllIIIIllIII */
        //   366: aastore        
        //   367: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //   370: checkcast       Lnet/minecraft/entity/EntityLiving;
        //   373: astore          llllllllllllIllIIIlllllIIIIIIlIl
        //   375: ldc             ""
        //   377: invokevirtual   java/lang/String.length:()I
        //   380: pop            
        //   381: aconst_null    
        //   382: ifnull          404
        //   385: return         
        //   386: astore          llllllllllllIllIIIlllllIIIIIIIll
        //   388: aload           llllllllllllIllIIIlllllIIIIIIIll
        //   390: invokevirtual   java/lang/Exception.printStackTrace:()V
        //   393: ldc             ""
        //   395: invokevirtual   java/lang/String.length:()I
        //   398: pop            
        //   399: aconst_null    
        //   400: ifnull          653
        //   403: return         
        //   404: aload           llllllllllllIllIIIlllllIIIIIIlII
        //   406: iload           llllllllllllIllIIIlllllIIIIIllIl
        //   408: i2f            
        //   409: ldc             0.5
        //   411: fadd           
        //   412: f2d            
        //   413: aload           llllllllllllIllIIIlllllIIIIIIllI
        //   415: invokevirtual   net/minecraft/util/BlockPos.getY:()I
        //   418: i2d            
        //   419: iload           llllllllllllIllIIIlllllIIIIIllII
        //   421: i2f            
        //   422: ldc             0.5
        //   424: fadd           
        //   425: f2d            
        //   426: aload           llllllllllllIllIIIlllllIIIIlIIlI
        //   428: invokevirtual   java/util/Random.nextFloat:()F
        //   431: ldc             360.0
        //   433: fmul           
        //   434: fconst_0       
        //   435: invokevirtual   net/minecraft/entity/EntityLiving.setLocationAndAngles:(DDDFF)V
        //   438: aload_0         /* llllllllllllIllIIIlllllIIIIllIII */
        //   439: aload           llllllllllllIllIIIlllllIIIIIIlII
        //   441: invokevirtual   net/minecraft/world/World.spawnEntityInWorld:(Lnet/minecraft/entity/Entity;)Z
        //   444: ldc             ""
        //   446: invokevirtual   java/lang/String.length:()I
        //   449: pop2           
        //   450: aload           llllllllllllIllIIIlllllIIIIIIlII
        //   452: aload_0         /* llllllllllllIllIIIlllllIIIIllIII */
        //   453: new             Lnet/minecraft/util/BlockPos;
        //   456: dup            
        //   457: aload           llllllllllllIllIIIlllllIIIIIIlII
        //   459: invokespecial   net/minecraft/util/BlockPos.<init>:(Lnet/minecraft/entity/Entity;)V
        //   462: invokevirtual   net/minecraft/world/World.getDifficultyForLocation:(Lnet/minecraft/util/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
        //   465: aload           llllllllllllIllIIIlllllIIIIIlllI
        //   467: invokevirtual   net/minecraft/entity/EntityLiving.onInitialSpawn:(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;
        //   470: astore          llllllllllllIllIIIlllllIIIIIlllI
        //   472: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   475: iconst_2       
        //   476: iaload         
        //   477: istore          llllllllllllIllIIIlllllIIIIIlIII
        //   479: iload           llllllllllllIllIIIlllllIIIIIllIl
        //   481: aload           llllllllllllIllIIIlllllIIIIlIIlI
        //   483: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   486: bipush          7
        //   488: iaload         
        //   489: invokevirtual   java/util/Random.nextInt:(I)I
        //   492: aload           llllllllllllIllIIIlllllIIIIlIIlI
        //   494: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   497: bipush          7
        //   499: iaload         
        //   500: invokevirtual   java/util/Random.nextInt:(I)I
        //   503: isub           
        //   504: iadd           
        //   505: istore          llllllllllllIllIIIlllllIIIIIllIl
        //   507: iload           llllllllllllIllIIIlllllIIIIIllII
        //   509: aload           llllllllllllIllIIIlllllIIIIlIIlI
        //   511: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   514: bipush          7
        //   516: iaload         
        //   517: invokevirtual   java/util/Random.nextInt:(I)I
        //   520: aload           llllllllllllIllIIIlllllIIIIlIIlI
        //   522: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   525: bipush          7
        //   527: iaload         
        //   528: invokevirtual   java/util/Random.nextInt:(I)I
        //   531: isub           
        //   532: iadd           
        //   533: istore          llllllllllllIllIIIlllllIIIIIllII
        //   535: ldc             ""
        //   537: invokevirtual   java/lang/String.length:()I
        //   540: pop            
        //   541: ldc             "   "
        //   543: invokevirtual   java/lang/String.length:()I
        //   546: ldc             " "
        //   548: invokevirtual   java/lang/String.length:()I
        //   551: if_icmpgt       611
        //   554: return         
        //   555: iload           llllllllllllIllIIIlllllIIIIIlIll
        //   557: aload           llllllllllllIllIIIlllllIIIIlIIlI
        //   559: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   562: bipush          7
        //   564: iaload         
        //   565: invokevirtual   java/util/Random.nextInt:(I)I
        //   568: iadd           
        //   569: aload           llllllllllllIllIIIlllllIIIIlIIlI
        //   571: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   574: bipush          7
        //   576: iaload         
        //   577: invokevirtual   java/util/Random.nextInt:(I)I
        //   580: isub           
        //   581: istore          llllllllllllIllIIIlllllIIIIIllIl
        //   583: iload           llllllllllllIllIIIlllllIIIIIlIlI
        //   585: aload           llllllllllllIllIIIlllllIIIIlIIlI
        //   587: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   590: bipush          7
        //   592: iaload         
        //   593: invokevirtual   java/util/Random.nextInt:(I)I
        //   596: iadd           
        //   597: aload           llllllllllllIllIIIlllllIIIIlIIlI
        //   599: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   602: bipush          7
        //   604: iaload         
        //   605: invokevirtual   java/util/Random.nextInt:(I)I
        //   608: isub           
        //   609: istore          llllllllllllIllIIIlllllIIIIIllII
        //   611: iload           llllllllllllIllIIIlllllIIIIIllIl
        //   613: iload_2         /* llllllllllllIllIIIlllllIIIIlIllI */
        //   614: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllllII:(II)Z
        //   617: ifeq            555
        //   620: iload           llllllllllllIllIIIlllllIIIIIllIl
        //   622: iload_2         /* llllllllllllIllIIIlllllIIIIlIllI */
        //   623: iload           llllllllllllIllIIIlllllIIIIlIlII
        //   625: iadd           
        //   626: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIlIIIIIIl:(II)Z
        //   629: ifeq            555
        //   632: iload           llllllllllllIllIIIlllllIIIIIllII
        //   634: iload_3         /* llllllllllllIllIIIlllllIIIIlIlIl */
        //   635: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllllII:(II)Z
        //   638: ifeq            555
        //   641: iload           llllllllllllIllIIIlllllIIIIIllII
        //   643: iload_3         /* llllllllllllIllIIIlllllIIIIlIlIl */
        //   644: iload           llllllllllllIllIIIlllllIIIIlIlII
        //   646: iadd           
        //   647: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIlIIIIIIl:(II)Z
        //   650: ifeq            555
        //   653: iinc            llllllllllllIllIIIlllllIIIIIIlll, 1
        //   656: iload           llllllllllllIllIIIlllllIIIIIlIII
        //   658: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIlIl:(I)Z
        //   661: ifeq            677
        //   664: iload           llllllllllllIllIIIlllllIIIIIIlll
        //   666: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   669: iconst_4       
        //   670: iaload         
        //   671: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllllII:(II)Z
        //   674: ifeq            289
        //   677: iinc            llllllllllllIllIIIlllllIIIIIlIIl, 1
        //   680: iload           llllllllllllIllIIIlllllIIIIIlIIl
        //   682: iload           llllllllllllIllIIIlllllIIIIIllll
        //   684: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllllII:(II)Z
        //   687: ifeq            164
        //   690: aload           llllllllllllIllIIIlllllIIIIlIIlI
        //   692: invokevirtual   java/util/Random.nextFloat:()F
        //   695: aload_1         /* llllllllllllIllIIIlllllIIIIIIIIl */
        //   696: invokevirtual   net/minecraft/world/biome/BiomeGenBase.getSpawningChance:()F
        //   699: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIlIIIIIII:(FF)I
        //   702: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIllllIlI:(I)Z
        //   705: ifeq            52
        //   708: return         
        //    StackMapTable: 00 0E FC 00 34 07 00 9C FF 00 6F 00 10 07 00 32 07 00 08 01 01 01 01 07 00 3E 07 00 9C 07 00 06 01 07 01 31 01 01 01 01 01 00 00 FD 00 7C 01 01 FF 00 60 00 13 07 00 32 07 00 08 01 01 01 01 07 00 3E 07 00 9C 07 00 06 01 07 01 31 01 01 01 01 01 01 01 07 00 44 00 01 07 00 90 FC 00 11 07 00 12 FA 00 4A FB 00 4B 37 29 FA 00 02 14 F9 00 02 FF 00 09 00 08 07 00 32 07 00 08 01 01 01 01 07 00 3E 07 00 9C 00 00 11
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  326    375    386    404    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static boolean lIIllIlIIlllIllI(final int llllllllllllIllIIIllllIlllIIlIIl, final int llllllllllllIllIIIllllIlllIIlIII) {
        return llllllllllllIllIIIllllIlllIIlIIl != llllllllllllIllIIIllllIlllIIlIII;
    }
    
    private static boolean lIIllIlIIllllIlI(final int llllllllllllIllIIIllllIlllIIlllI) {
        return llllllllllllIllIIIllllIlllIIlllI >= 0;
    }
    
    private static boolean lIIllIlIIlllllll(final Object llllllllllllIllIIIllllIlllIllIll, final Object llllllllllllIllIIIllllIlllIllIlI) {
        return llllllllllllIllIIIllllIlllIllIll != llllllllllllIllIIIllllIlllIllIlI;
    }
    
    public static boolean canCreatureTypeSpawnAtLocation(final EntityLiving.SpawnPlacementType llllllllllllIllIIIlllllIIIlllIll, final World llllllllllllIllIIIlllllIIIlllIlI, final BlockPos llllllllllllIllIIIlllllIIIlllIIl) {
        if (lIIllIlIIlllIlIl(llllllllllllIllIIIlllllIIIlllIlI.getWorldBorder().contains(llllllllllllIllIIIlllllIIIlllIIl) ? 1 : 0)) {
            return SpawnerAnimals.llIllllIIlIIlI[0] != 0;
        }
        final Block llllllllllllIllIIIlllllIIIlllIII = llllllllllllIllIIIlllllIIIlllIlI.getBlockState(llllllllllllIllIIIlllllIIIlllIIl).getBlock();
        if (lIIllIlIIllllllI(llllllllllllIllIIIlllllIIIlllIll, EntityLiving.SpawnPlacementType.IN_WATER)) {
            if (lIIllIlIIlllIlll(llllllllllllIllIIIlllllIIIlllIII.getMaterial().isLiquid() ? 1 : 0) && lIIllIlIIlllIlll(llllllllllllIllIIIlllllIIIlllIlI.getBlockState(llllllllllllIllIIIlllllIIIlllIIl.down()).getBlock().getMaterial().isLiquid() ? 1 : 0) && lIIllIlIIlllIlIl(llllllllllllIllIIIlllllIIIlllIlI.getBlockState(llllllllllllIllIIIlllllIIIlllIIl.up()).getBlock().isNormalCube() ? 1 : 0)) {
                return SpawnerAnimals.llIllllIIlIIlI[2] != 0;
            }
            return SpawnerAnimals.llIllllIIlIIlI[0] != 0;
        }
        else {
            final BlockPos llllllllllllIllIIIlllllIIIllIlll = llllllllllllIllIIIlllllIIIlllIIl.down();
            if (lIIllIlIIlllIlIl(World.doesBlockHaveSolidTopSurface(llllllllllllIllIIIlllllIIIlllIlI, llllllllllllIllIIIlllllIIIllIlll) ? 1 : 0)) {
                return SpawnerAnimals.llIllllIIlIIlI[0] != 0;
            }
            final Block llllllllllllIllIIIlllllIIIllIllI = llllllllllllIllIIIlllllIIIlllIlI.getBlockState(llllllllllllIllIIIlllllIIIllIlll).getBlock();
            int n;
            if (lIIllIlIIlllllll(llllllllllllIllIIIlllllIIIllIllI, Blocks.bedrock) && lIIllIlIIlllllll(llllllllllllIllIIIlllllIIIllIllI, Blocks.barrier)) {
                n = SpawnerAnimals.llIllllIIlIIlI[2];
                "".length();
                if ((57 + 24 + 80 + 16 ^ 136 + 158 - 282 + 169) < 0) {
                    return ((5 + 131 - 91 + 153 ^ 48 + 142 - 36 + 41) & (10 + 124 - 77 + 100 ^ 135 + 35 - 160 + 142 ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = SpawnerAnimals.llIllllIIlIIlI[0];
            }
            final boolean llllllllllllIllIIIlllllIIIllIlIl = n != 0;
            if (lIIllIlIIlllIlll(llllllllllllIllIIIlllllIIIllIlIl ? 1 : 0) && lIIllIlIIlllIlIl(llllllllllllIllIIIlllllIIIlllIII.isNormalCube() ? 1 : 0) && lIIllIlIIlllIlIl(llllllllllllIllIIIlllllIIIlllIII.getMaterial().isLiquid() ? 1 : 0) && lIIllIlIIlllIlIl(llllllllllllIllIIIlllllIIIlllIlI.getBlockState(llllllllllllIllIIIlllllIIIlllIIl.up()).getBlock().isNormalCube() ? 1 : 0)) {
                return SpawnerAnimals.llIllllIIlIIlI[2] != 0;
            }
            return SpawnerAnimals.llIllllIIlIIlI[0] != 0;
        }
    }
    
    private static boolean lIIllIlIIlllllII(final int llllllllllllIllIIIllllIllllIlIll, final int llllllllllllIllIIIllllIllllIlIlI) {
        return llllllllllllIllIIIllllIllllIlIll >= llllllllllllIllIIIllllIllllIlIlI;
    }
    
    private static boolean lIIllIlIIllllllI(final Object llllllllllllIllIIIllllIlllIlIlll, final Object llllllllllllIllIIIllllIlllIlIllI) {
        return llllllllllllIllIIIllllIlllIlIlll == llllllllllllIllIIIllllIlllIlIllI;
    }
    
    public int findChunksForSpawning(final WorldServer llllllllllllIllIIIlllllIIlllllII, final boolean llllllllllllIllIIIlllllIlIlIIIll, final boolean llllllllllllIllIIIlllllIlIlIIIlI, final boolean llllllllllllIllIIIlllllIIllllIIl) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIlIl:(I)Z
        //     4: ifeq            20
        //     7: iload_3         /* llllllllllllIllIIIlllllIIllllIlI */
        //     8: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIlIl:(I)Z
        //    11: ifeq            20
        //    14: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //    17: iconst_0       
        //    18: iaload         
        //    19: ireturn        
        //    20: aload_0         /* llllllllllllIllIIIlllllIlIlIIlIl */
        //    21: getfield        net/minecraft/world/SpawnerAnimals.eligibleChunksForSpawning:Ljava/util/Set;
        //    24: invokeinterface java/util/Set.clear:()V
        //    29: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //    32: iconst_0       
        //    33: iaload         
        //    34: istore          llllllllllllIllIIIlllllIlIlIIIII
        //    36: aload_1         /* llllllllllllIllIIIlllllIlIlIIlII */
        //    37: getfield        net/minecraft/world/WorldServer.playerEntities:Ljava/util/List;
        //    40: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    45: astore          7
        //    47: ldc             ""
        //    49: invokevirtual   java/lang/String.length:()I
        //    52: pop            
        //    53: sipush          154
        //    56: sipush          158
        //    59: ixor           
        //    60: sipush          180
        //    63: sipush          188
        //    66: ixor           
        //    67: sipush          165
        //    70: sipush          173
        //    73: ixor           
        //    74: iconst_m1      
        //    75: ixor           
        //    76: iand           
        //    77: if_icmpgt       483
        //    80: sipush          146
        //    83: sipush          167
        //    86: ixor           
        //    87: iconst_0       
        //    88: bipush          53
        //    90: ixor           
        //    91: iconst_m1      
        //    92: ixor           
        //    93: iand           
        //    94: ireturn        
        //    95: aload           7
        //    97: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   102: checkcast       Lnet/minecraft/entity/player/EntityPlayer;
        //   105: astore          llllllllllllIllIIIlllllIlIIlllll
        //   107: aload           llllllllllllIllIIIlllllIlIIlllll
        //   109: invokevirtual   net/minecraft/entity/player/EntityPlayer.isSpectator:()Z
        //   112: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIlIl:(I)Z
        //   115: ifeq            483
        //   118: aload           llllllllllllIllIIIlllllIlIIlllll
        //   120: getfield        net/minecraft/entity/player/EntityPlayer.posX:D
        //   123: ldc2_w          16.0
        //   126: ddiv           
        //   127: invokestatic    net/minecraft/util/MathHelper.floor_double:(D)I
        //   130: istore          llllllllllllIllIIIlllllIlIIllllI
        //   132: aload           llllllllllllIllIIIlllllIlIIlllll
        //   134: getfield        net/minecraft/entity/player/EntityPlayer.posZ:D
        //   137: ldc2_w          16.0
        //   140: ddiv           
        //   141: invokestatic    net/minecraft/util/MathHelper.floor_double:(D)I
        //   144: istore          llllllllllllIllIIIlllllIlIIlllIl
        //   146: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   149: iconst_1       
        //   150: iaload         
        //   151: istore          llllllllllllIllIIIlllllIlIIlllII
        //   153: iload           llllllllllllIllIIIlllllIlIIlllII
        //   155: ineg           
        //   156: istore          llllllllllllIllIIIlllllIlIIllIll
        //   158: ldc             ""
        //   160: invokevirtual   java/lang/String.length:()I
        //   163: pop            
        //   164: ldc             " "
        //   166: invokevirtual   java/lang/String.length:()I
        //   169: ldc             " "
        //   171: invokevirtual   java/lang/String.length:()I
        //   174: ineg           
        //   175: if_icmpne       473
        //   178: ldc             " "
        //   180: invokevirtual   java/lang/String.length:()I
        //   183: ldc             " "
        //   185: invokevirtual   java/lang/String.length:()I
        //   188: ldc             " "
        //   190: invokevirtual   java/lang/String.length:()I
        //   193: ineg           
        //   194: ixor           
        //   195: iand           
        //   196: ireturn        
        //   197: iload           llllllllllllIllIIIlllllIlIIlllII
        //   199: ineg           
        //   200: istore          llllllllllllIllIIIlllllIlIIllIlI
        //   202: ldc             ""
        //   204: invokevirtual   java/lang/String.length:()I
        //   207: pop            
        //   208: ldc             "   "
        //   210: invokevirtual   java/lang/String.length:()I
        //   213: ldc             "   "
        //   215: invokevirtual   java/lang/String.length:()I
        //   218: if_icmpeq       460
        //   221: sipush          255
        //   224: sipush          156
        //   227: ixor           
        //   228: bipush          51
        //   230: bipush          13
        //   232: ixor           
        //   233: ixor           
        //   234: bipush          39
        //   236: bipush          26
        //   238: ixor           
        //   239: bipush          84
        //   241: bipush          52
        //   243: ixor           
        //   244: ixor           
        //   245: ldc             " "
        //   247: invokevirtual   java/lang/String.length:()I
        //   250: ineg           
        //   251: ixor           
        //   252: iand           
        //   253: ireturn        
        //   254: iload           llllllllllllIllIIIlllllIlIIllIll
        //   256: iload           llllllllllllIllIIIlllllIlIIlllII
        //   258: ineg           
        //   259: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIllI:(II)Z
        //   262: ifeq            371
        //   265: iload           llllllllllllIllIIIlllllIlIIllIll
        //   267: iload           llllllllllllIllIIIlllllIlIIlllII
        //   269: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIllI:(II)Z
        //   272: ifeq            371
        //   275: iload           llllllllllllIllIIIlllllIlIIllIlI
        //   277: iload           llllllllllllIllIIIlllllIlIIlllII
        //   279: ineg           
        //   280: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIllI:(II)Z
        //   283: ifeq            371
        //   286: iload           llllllllllllIllIIIlllllIlIIllIlI
        //   288: iload           llllllllllllIllIIIlllllIlIIlllII
        //   290: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIllI:(II)Z
        //   293: ifeq            371
        //   296: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   299: iconst_0       
        //   300: iaload         
        //   301: ldc             ""
        //   303: invokevirtual   java/lang/String.length:()I
        //   306: pop            
        //   307: bipush          21
        //   309: bipush          92
        //   311: ixor           
        //   312: sipush          196
        //   315: sipush          137
        //   318: ixor           
        //   319: ixor           
        //   320: bipush          43
        //   322: bipush          17
        //   324: ixor           
        //   325: sipush          255
        //   328: sipush          193
        //   331: ixor           
        //   332: ixor           
        //   333: if_icmple       376
        //   336: bipush          73
        //   338: bipush          14
        //   340: ixor           
        //   341: sipush          244
        //   344: sipush          146
        //   347: ixor           
        //   348: ixor           
        //   349: bipush          85
        //   351: bipush          73
        //   353: ixor           
        //   354: sipush          128
        //   357: sipush          189
        //   360: ixor           
        //   361: ixor           
        //   362: ldc             " "
        //   364: invokevirtual   java/lang/String.length:()I
        //   367: ineg           
        //   368: ixor           
        //   369: iand           
        //   370: ireturn        
        //   371: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   374: iconst_2       
        //   375: iaload         
        //   376: istore          llllllllllllIllIIIlllllIlIIllIIl
        //   378: new             Lnet/minecraft/world/ChunkCoordIntPair;
        //   381: dup            
        //   382: iload           llllllllllllIllIIIlllllIlIIllIll
        //   384: iload           llllllllllllIllIIIlllllIlIIllllI
        //   386: iadd           
        //   387: iload           llllllllllllIllIIIlllllIlIIllIlI
        //   389: iload           llllllllllllIllIIIlllllIlIIlllIl
        //   391: iadd           
        //   392: invokespecial   net/minecraft/world/ChunkCoordIntPair.<init>:(II)V
        //   395: astore          llllllllllllIllIIIlllllIlIIllIII
        //   397: aload_0         /* llllllllllllIllIIIlllllIlIlIIlIl */
        //   398: getfield        net/minecraft/world/SpawnerAnimals.eligibleChunksForSpawning:Ljava/util/Set;
        //   401: aload           llllllllllllIllIIIlllllIlIIllIII
        //   403: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   408: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIlIl:(I)Z
        //   411: ifeq            457
        //   414: iinc            llllllllllllIllIIIlllllIlIlIIIII, 1
        //   417: iload           llllllllllllIllIIIlllllIlIIllIIl
        //   419: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIlIl:(I)Z
        //   422: ifeq            457
        //   425: aload_1         /* llllllllllllIllIIIlllllIlIlIIlII */
        //   426: invokevirtual   net/minecraft/world/WorldServer.getWorldBorder:()Lnet/minecraft/world/border/WorldBorder;
        //   429: aload           llllllllllllIllIIIlllllIlIIllIII
        //   431: invokevirtual   net/minecraft/world/border/WorldBorder.contains:(Lnet/minecraft/world/ChunkCoordIntPair;)Z
        //   434: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIlll:(I)Z
        //   437: ifeq            457
        //   440: aload_0         /* llllllllllllIllIIIlllllIlIlIIlIl */
        //   441: getfield        net/minecraft/world/SpawnerAnimals.eligibleChunksForSpawning:Ljava/util/Set;
        //   444: aload           llllllllllllIllIIIlllllIlIIllIII
        //   446: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   451: ldc             ""
        //   453: invokevirtual   java/lang/String.length:()I
        //   456: pop2           
        //   457: iinc            llllllllllllIllIIIlllllIlIIllIlI, 1
        //   460: iload           llllllllllllIllIIIlllllIlIIllIlI
        //   462: iload           llllllllllllIllIIIlllllIlIIlllII
        //   464: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIllllIII:(II)Z
        //   467: ifeq            254
        //   470: iinc            llllllllllllIllIIIlllllIlIIllIll, 1
        //   473: iload           llllllllllllIllIIIlllllIlIIllIll
        //   475: iload           llllllllllllIllIIIlllllIlIIlllII
        //   477: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIllllIII:(II)Z
        //   480: ifeq            197
        //   483: aload           7
        //   485: invokeinterface java/util/Iterator.hasNext:()Z
        //   490: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIlIl:(I)Z
        //   493: ifeq            95
        //   496: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   499: iconst_0       
        //   500: iaload         
        //   501: istore          llllllllllllIllIIIlllllIlIIlIlll
        //   503: aload_1         /* llllllllllllIllIIIlllllIlIlIIlII */
        //   504: invokevirtual   net/minecraft/world/WorldServer.getSpawnPoint:()Lnet/minecraft/util/BlockPos;
        //   507: astore          llllllllllllIllIIIlllllIlIIlIllI
        //   509: invokestatic    net/minecraft/entity/EnumCreatureType.values:()[Lnet/minecraft/entity/EnumCreatureType;
        //   512: dup            
        //   513: astore          11
        //   515: arraylength    
        //   516: istore          10
        //   518: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   521: iconst_0       
        //   522: iaload         
        //   523: istore          9
        //   525: ldc             ""
        //   527: invokevirtual   java/lang/String.length:()I
        //   530: pop            
        //   531: ldc             " "
        //   533: invokevirtual   java/lang/String.length:()I
        //   536: ldc             " "
        //   538: invokevirtual   java/lang/String.length:()I
        //   541: if_icmpeq       1597
        //   544: bipush          108
        //   546: bipush          127
        //   548: ixor           
        //   549: sipush          211
        //   552: sipush          192
        //   555: ixor           
        //   556: iconst_m1      
        //   557: ixor           
        //   558: iand           
        //   559: ireturn        
        //   560: aload           11
        //   562: iload           9
        //   564: aaload         
        //   565: astore          llllllllllllIllIIIlllllIlIIlIlIl
        //   567: aload           llllllllllllIllIIIlllllIlIIlIlIl
        //   569: invokevirtual   net/minecraft/entity/EnumCreatureType.getPeacefulCreature:()Z
        //   572: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIlll:(I)Z
        //   575: ifeq            585
        //   578: iload_3         /* llllllllllllIllIIIlllllIIllllIlI */
        //   579: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIlll:(I)Z
        //   582: ifeq            1594
        //   585: aload           llllllllllllIllIIIlllllIlIIlIlIl
        //   587: invokevirtual   net/minecraft/entity/EnumCreatureType.getPeacefulCreature:()Z
        //   590: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIlIl:(I)Z
        //   593: ifeq            603
        //   596: iload_2         /* llllllllllllIllIIIlllllIIllllIll */
        //   597: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIlll:(I)Z
        //   600: ifeq            1594
        //   603: aload           llllllllllllIllIIIlllllIlIIlIlIl
        //   605: invokevirtual   net/minecraft/entity/EnumCreatureType.getAnimal:()Z
        //   608: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIlll:(I)Z
        //   611: ifeq            622
        //   614: iload           llllllllllllIllIIIlllllIlIlIIIIl
        //   616: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIlll:(I)Z
        //   619: ifeq            1594
        //   622: aload_1         /* llllllllllllIllIIIlllllIlIlIIlII */
        //   623: aload           llllllllllllIllIIIlllllIlIIlIlIl
        //   625: invokevirtual   net/minecraft/entity/EnumCreatureType.getCreatureClass:()Ljava/lang/Class;
        //   628: invokevirtual   net/minecraft/world/WorldServer.countEntities:(Ljava/lang/Class;)I
        //   631: istore          llllllllllllIllIIIlllllIlIIlIlII
        //   633: aload           llllllllllllIllIIIlllllIlIIlIlIl
        //   635: invokevirtual   net/minecraft/entity/EnumCreatureType.getMaxNumberOfCreature:()I
        //   638: iload           llllllllllllIllIIIlllllIlIlIIIII
        //   640: imul           
        //   641: getstatic       net/minecraft/world/SpawnerAnimals.MOB_COUNT_DIV:I
        //   644: idiv           
        //   645: istore          llllllllllllIllIIIlllllIlIIlIIll
        //   647: iload           llllllllllllIllIIIlllllIlIIlIlII
        //   649: iload           llllllllllllIllIIIlllllIlIIlIIll
        //   651: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIllllIIl:(II)Z
        //   654: ifeq            1594
        //   657: aload_0         /* llllllllllllIllIIIlllllIlIlIIlIl */
        //   658: getfield        net/minecraft/world/SpawnerAnimals.eligibleChunksForSpawning:Ljava/util/Set;
        //   661: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   666: astore          llllllllllllIllIIIlllllIIllIlllI
        //   668: ldc             ""
        //   670: invokevirtual   java/lang/String.length:()I
        //   673: pop            
        //   674: bipush          122
        //   676: bipush          42
        //   678: ixor           
        //   679: sipush          230
        //   682: sipush          189
        //   685: ixor           
        //   686: ixor           
        //   687: bipush          18
        //   689: bipush          88
        //   691: ixor           
        //   692: sipush          206
        //   695: sipush          143
        //   698: ixor           
        //   699: ixor           
        //   700: ldc             " "
        //   702: invokevirtual   java/lang/String.length:()I
        //   705: ineg           
        //   706: ixor           
        //   707: iand           
        //   708: sipush          205
        //   711: sipush          191
        //   714: ixor           
        //   715: bipush          126
        //   717: bipush          32
        //   719: ixor           
        //   720: ixor           
        //   721: sipush          153
        //   724: sipush          173
        //   727: ixor           
        //   728: bipush          48
        //   730: bipush          40
        //   732: ixor           
        //   733: ixor           
        //   734: ldc             " "
        //   736: invokevirtual   java/lang/String.length:()I
        //   739: ineg           
        //   740: ixor           
        //   741: iand           
        //   742: if_icmpeq       1581
        //   745: bipush          13
        //   747: iconst_1       
        //   748: ixor           
        //   749: bipush          19
        //   751: bipush          76
        //   753: ixor           
        //   754: ixor           
        //   755: bipush          28
        //   757: bipush          58
        //   759: ixor           
        //   760: sipush          219
        //   763: sipush          174
        //   766: ixor           
        //   767: ixor           
        //   768: ldc             " "
        //   770: invokevirtual   java/lang/String.length:()I
        //   773: ineg           
        //   774: ixor           
        //   775: iand           
        //   776: ireturn        
        //   777: aload           llllllllllllIllIIIlllllIIllIlllI
        //   779: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   784: checkcast       Lnet/minecraft/world/ChunkCoordIntPair;
        //   787: astore          llllllllllllIllIIIlllllIlIIlIIlI
        //   789: aload_1         /* llllllllllllIllIIIlllllIlIlIIlII */
        //   790: aload           llllllllllllIllIIIlllllIlIIlIIlI
        //   792: getfield        net/minecraft/world/ChunkCoordIntPair.chunkXPos:I
        //   795: aload           llllllllllllIllIIIlllllIlIIlIIlI
        //   797: getfield        net/minecraft/world/ChunkCoordIntPair.chunkZPos:I
        //   800: invokestatic    net/minecraft/world/SpawnerAnimals.getRandomChunkPosition:(Lnet/minecraft/world/World;II)Lnet/minecraft/util/BlockPos;
        //   803: astore          llllllllllllIllIIIlllllIlIIlIIIl
        //   805: aload           llllllllllllIllIIIlllllIlIIlIIIl
        //   807: invokevirtual   net/minecraft/util/BlockPos.getX:()I
        //   810: istore          llllllllllllIllIIIlllllIlIIlIIII
        //   812: aload           llllllllllllIllIIIlllllIlIIlIIIl
        //   814: invokevirtual   net/minecraft/util/BlockPos.getY:()I
        //   817: istore          llllllllllllIllIIIlllllIlIIIllll
        //   819: aload           llllllllllllIllIIIlllllIlIIlIIIl
        //   821: invokevirtual   net/minecraft/util/BlockPos.getZ:()I
        //   824: istore          llllllllllllIllIIIlllllIlIIIlllI
        //   826: aload_1         /* llllllllllllIllIIIlllllIlIlIIlII */
        //   827: aload           llllllllllllIllIIIlllllIlIIlIIIl
        //   829: invokevirtual   net/minecraft/world/WorldServer.getBlockState:(Lnet/minecraft/util/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   832: invokeinterface net/minecraft/block/state/IBlockState.getBlock:()Lnet/minecraft/block/Block;
        //   837: astore          llllllllllllIllIIIlllllIlIIIllIl
        //   839: aload           llllllllllllIllIIIlllllIlIIIllIl
        //   841: invokevirtual   net/minecraft/block/Block.isNormalCube:()Z
        //   844: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIlIl:(I)Z
        //   847: ifeq            1581
        //   850: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   853: iconst_0       
        //   854: iaload         
        //   855: istore          llllllllllllIllIIIlllllIlIIIllII
        //   857: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   860: iconst_0       
        //   861: iaload         
        //   862: istore          llllllllllllIllIIIlllllIlIIIlIll
        //   864: ldc             ""
        //   866: invokevirtual   java/lang/String.length:()I
        //   869: pop            
        //   870: ldc             " "
        //   872: invokevirtual   java/lang/String.length:()I
        //   875: ldc             " "
        //   877: invokevirtual   java/lang/String.length:()I
        //   880: if_icmpeq       1568
        //   883: bipush          108
        //   885: bipush          35
        //   887: ixor           
        //   888: bipush          27
        //   890: bipush          65
        //   892: ixor           
        //   893: ixor           
        //   894: bipush          14
        //   896: bipush          51
        //   898: iadd           
        //   899: bipush          48
        //   901: isub           
        //   902: sipush          138
        //   905: iadd           
        //   906: bipush          104
        //   908: bipush          106
        //   910: iadd           
        //   911: sipush          140
        //   914: isub           
        //   915: bipush          72
        //   917: iadd           
        //   918: ixor           
        //   919: ldc             " "
        //   921: invokevirtual   java/lang/String.length:()I
        //   924: ineg           
        //   925: ixor           
        //   926: iand           
        //   927: ireturn        
        //   928: iload           llllllllllllIllIIIlllllIlIIlIIII
        //   930: istore          llllllllllllIllIIIlllllIlIIIlIlI
        //   932: iload           llllllllllllIllIIIlllllIlIIIllll
        //   934: istore          llllllllllllIllIIIlllllIlIIIlIIl
        //   936: iload           llllllllllllIllIIIlllllIlIIIlllI
        //   938: istore          llllllllllllIllIIIlllllIlIIIlIII
        //   940: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   943: iconst_3       
        //   944: iaload         
        //   945: istore          llllllllllllIllIIIlllllIlIIIIlll
        //   947: aconst_null    
        //   948: astore          llllllllllllIllIIIlllllIlIIIIllI
        //   950: aconst_null    
        //   951: astore          llllllllllllIllIIIlllllIlIIIIlIl
        //   953: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //   956: iconst_0       
        //   957: iaload         
        //   958: istore          llllllllllllIllIIIlllllIlIIIIlII
        //   960: ldc             ""
        //   962: invokevirtual   java/lang/String.length:()I
        //   965: pop            
        //   966: bipush          59
        //   968: bipush          28
        //   970: ixor           
        //   971: sipush          169
        //   974: sipush          142
        //   977: ixor           
        //   978: iconst_m1      
        //   979: ixor           
        //   980: iand           
        //   981: sipush          231
        //   984: sipush          133
        //   987: ixor           
        //   988: bipush          6
        //   990: bipush          100
        //   992: ixor           
        //   993: iconst_m1      
        //   994: ixor           
        //   995: iand           
        //   996: if_icmpeq       1552
        //   999: bipush          113
        //  1001: bipush          111
        //  1003: ixor           
        //  1004: bipush          92
        //  1006: bipush          66
        //  1008: ixor           
        //  1009: iconst_m1      
        //  1010: ixor           
        //  1011: iand           
        //  1012: ireturn        
        //  1013: iload           llllllllllllIllIIIlllllIlIIIlIlI
        //  1015: aload_1         /* llllllllllllIllIIIlllllIlIlIIlII */
        //  1016: getfield        net/minecraft/world/WorldServer.rand:Ljava/util/Random;
        //  1019: iload           llllllllllllIllIIIlllllIlIIIIlll
        //  1021: invokevirtual   java/util/Random.nextInt:(I)I
        //  1024: aload_1         /* llllllllllllIllIIIlllllIlIlIIlII */
        //  1025: getfield        net/minecraft/world/WorldServer.rand:Ljava/util/Random;
        //  1028: iload           llllllllllllIllIIIlllllIlIIIIlll
        //  1030: invokevirtual   java/util/Random.nextInt:(I)I
        //  1033: isub           
        //  1034: iadd           
        //  1035: istore          llllllllllllIllIIIlllllIlIIIlIlI
        //  1037: iload           llllllllllllIllIIIlllllIlIIIlIIl
        //  1039: aload_1         /* llllllllllllIllIIIlllllIlIlIIlII */
        //  1040: getfield        net/minecraft/world/WorldServer.rand:Ljava/util/Random;
        //  1043: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //  1046: iconst_2       
        //  1047: iaload         
        //  1048: invokevirtual   java/util/Random.nextInt:(I)I
        //  1051: aload_1         /* llllllllllllIllIIIlllllIlIlIIlII */
        //  1052: getfield        net/minecraft/world/WorldServer.rand:Ljava/util/Random;
        //  1055: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //  1058: iconst_2       
        //  1059: iaload         
        //  1060: invokevirtual   java/util/Random.nextInt:(I)I
        //  1063: isub           
        //  1064: iadd           
        //  1065: istore          llllllllllllIllIIIlllllIlIIIlIIl
        //  1067: iload           llllllllllllIllIIIlllllIlIIIlIII
        //  1069: aload_1         /* llllllllllllIllIIIlllllIlIlIIlII */
        //  1070: getfield        net/minecraft/world/WorldServer.rand:Ljava/util/Random;
        //  1073: iload           llllllllllllIllIIIlllllIlIIIIlll
        //  1075: invokevirtual   java/util/Random.nextInt:(I)I
        //  1078: aload_1         /* llllllllllllIllIIIlllllIlIlIIlII */
        //  1079: getfield        net/minecraft/world/WorldServer.rand:Ljava/util/Random;
        //  1082: iload           llllllllllllIllIIIlllllIlIIIIlll
        //  1084: invokevirtual   java/util/Random.nextInt:(I)I
        //  1087: isub           
        //  1088: iadd           
        //  1089: istore          llllllllllllIllIIIlllllIlIIIlIII
        //  1091: new             Lnet/minecraft/util/BlockPos;
        //  1094: dup            
        //  1095: iload           llllllllllllIllIIIlllllIlIIIlIlI
        //  1097: iload           llllllllllllIllIIIlllllIlIIIlIIl
        //  1099: iload           llllllllllllIllIIIlllllIlIIIlIII
        //  1101: invokespecial   net/minecraft/util/BlockPos.<init>:(III)V
        //  1104: astore          llllllllllllIllIIIlllllIlIIIIIll
        //  1106: iload           llllllllllllIllIIIlllllIlIIIlIlI
        //  1108: i2f            
        //  1109: ldc             0.5
        //  1111: fadd           
        //  1112: fstore          llllllllllllIllIIIlllllIlIIIIIlI
        //  1114: iload           llllllllllllIllIIIlllllIlIIIlIII
        //  1116: i2f            
        //  1117: ldc             0.5
        //  1119: fadd           
        //  1120: fstore          llllllllllllIllIIIlllllIlIIIIIIl
        //  1122: aload_1         /* llllllllllllIllIIIlllllIlIlIIlII */
        //  1123: fload           llllllllllllIllIIIlllllIlIIIIIlI
        //  1125: f2d            
        //  1126: iload           llllllllllllIllIIIlllllIlIIIlIIl
        //  1128: i2d            
        //  1129: fload           llllllllllllIllIIIlllllIlIIIIIIl
        //  1131: f2d            
        //  1132: ldc2_w          24.0
        //  1135: invokevirtual   net/minecraft/world/WorldServer.isAnyPlayerWithinRangeAt:(DDDD)Z
        //  1138: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIlIl:(I)Z
        //  1141: ifeq            1549
        //  1144: aload           llllllllllllIllIIIlllllIlIIlIllI
        //  1146: fload           llllllllllllIllIIIlllllIlIIIIIlI
        //  1148: f2d            
        //  1149: iload           llllllllllllIllIIIlllllIlIIIlIIl
        //  1151: i2d            
        //  1152: fload           llllllllllllIllIIIlllllIlIIIIIIl
        //  1154: f2d            
        //  1155: invokevirtual   net/minecraft/util/BlockPos.distanceSq:(DDD)D
        //  1158: ldc2_w          576.0
        //  1161: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIlII:(DD)I
        //  1164: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIllllIlI:(I)Z
        //  1167: ifeq            1549
        //  1170: aload           llllllllllllIllIIIlllllIlIIIIllI
        //  1172: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIllllIll:(Ljava/lang/Object;)Z
        //  1175: ifeq            1268
        //  1178: aload_1         /* llllllllllllIllIIIlllllIlIlIIlII */
        //  1179: aload           llllllllllllIllIIIlllllIlIIlIlIl
        //  1181: aload           llllllllllllIllIIIlllllIlIIIIIll
        //  1183: invokevirtual   net/minecraft/world/WorldServer.getSpawnListEntryForTypeAt:(Lnet/minecraft/entity/EnumCreatureType;Lnet/minecraft/util/BlockPos;)Lnet/minecraft/world/biome/BiomeGenBase$SpawnListEntry;
        //  1186: astore          llllllllllllIllIIIlllllIlIIIIllI
        //  1188: aload           llllllllllllIllIIIlllllIlIIIIllI
        //  1190: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIllllIll:(Ljava/lang/Object;)Z
        //  1193: ifeq            1268
        //  1196: ldc             ""
        //  1198: invokevirtual   java/lang/String.length:()I
        //  1201: pop            
        //  1202: ldc             " "
        //  1204: invokevirtual   java/lang/String.length:()I
        //  1207: bipush          70
        //  1209: bipush          45
        //  1211: ixor           
        //  1212: iconst_5       
        //  1213: bipush          106
        //  1215: ixor           
        //  1216: ixor           
        //  1217: if_icmplt       1565
        //  1220: sipush          144
        //  1223: bipush          88
        //  1225: iadd           
        //  1226: sipush          211
        //  1229: isub           
        //  1230: sipush          192
        //  1233: iadd           
        //  1234: bipush          41
        //  1236: bipush          47
        //  1238: iadd           
        //  1239: bipush          43
        //  1241: isub           
        //  1242: bipush          86
        //  1244: iadd           
        //  1245: ixor           
        //  1246: sipush          221
        //  1249: sipush          181
        //  1252: ixor           
        //  1253: bipush          27
        //  1255: bipush          37
        //  1257: ixor           
        //  1258: ixor           
        //  1259: ldc             " "
        //  1261: invokevirtual   java/lang/String.length:()I
        //  1264: ineg           
        //  1265: ixor           
        //  1266: iand           
        //  1267: ireturn        
        //  1268: aload_1         /* llllllllllllIllIIIlllllIlIlIIlII */
        //  1269: aload           llllllllllllIllIIIlllllIlIIlIlIl
        //  1271: aload           llllllllllllIllIIIlllllIlIIIIllI
        //  1273: aload           llllllllllllIllIIIlllllIlIIIIIll
        //  1275: invokevirtual   net/minecraft/world/WorldServer.canCreatureTypeSpawnHere:(Lnet/minecraft/entity/EnumCreatureType;Lnet/minecraft/world/biome/BiomeGenBase$SpawnListEntry;Lnet/minecraft/util/BlockPos;)Z
        //  1278: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIlll:(I)Z
        //  1281: ifeq            1549
        //  1284: aload           llllllllllllIllIIIlllllIlIIIIllI
        //  1286: getfield        net/minecraft/world/biome/BiomeGenBase$SpawnListEntry.entityClass:Ljava/lang/Class;
        //  1289: invokestatic    net/minecraft/entity/EntitySpawnPlacementRegistry.getPlacementForEntity:(Ljava/lang/Class;)Lnet/minecraft/entity/EntityLiving$SpawnPlacementType;
        //  1292: aload_1         /* llllllllllllIllIIIlllllIlIlIIlII */
        //  1293: aload           llllllllllllIllIIIlllllIlIIIIIll
        //  1295: invokestatic    net/minecraft/world/SpawnerAnimals.canCreatureTypeSpawnAtLocation:(Lnet/minecraft/entity/EntityLiving$SpawnPlacementType;Lnet/minecraft/world/World;Lnet/minecraft/util/BlockPos;)Z
        //  1298: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIlll:(I)Z
        //  1301: ifeq            1549
        //  1304: aload           llllllllllllIllIIIlllllIlIIIIllI
        //  1306: getfield        net/minecraft/world/biome/BiomeGenBase$SpawnListEntry.entityClass:Ljava/lang/Class;
        //  1309: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //  1312: iconst_2       
        //  1313: iaload         
        //  1314: anewarray       Ljava/lang/Class;
        //  1317: dup            
        //  1318: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //  1321: iconst_0       
        //  1322: iaload         
        //  1323: ldc             Lnet/minecraft/world/World;.class
        //  1325: aastore        
        //  1326: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //  1329: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //  1332: iconst_2       
        //  1333: iaload         
        //  1334: anewarray       Ljava/lang/Object;
        //  1337: dup            
        //  1338: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //  1341: iconst_0       
        //  1342: iaload         
        //  1343: aload_1         /* llllllllllllIllIIIlllllIlIlIIlII */
        //  1344: aastore        
        //  1345: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //  1348: checkcast       Lnet/minecraft/entity/EntityLiving;
        //  1351: astore          llllllllllllIllIIIlllllIlIIIIIII
        //  1353: ldc             ""
        //  1355: invokevirtual   java/lang/String.length:()I
        //  1358: pop            
        //  1359: ldc             "  "
        //  1361: invokevirtual   java/lang/String.length:()I
        //  1364: ldc             " "
        //  1366: invokevirtual   java/lang/String.length:()I
        //  1369: if_icmpge       1398
        //  1372: bipush          62
        //  1374: bipush          121
        //  1376: ixor           
        //  1377: sipush          205
        //  1380: sipush          138
        //  1383: ixor           
        //  1384: iconst_m1      
        //  1385: ixor           
        //  1386: iand           
        //  1387: ireturn        
        //  1388: astore          llllllllllllIllIIIlllllIIllllllI
        //  1390: aload           llllllllllllIllIIIlllllIIllllllI
        //  1392: invokevirtual   java/lang/Exception.printStackTrace:()V
        //  1395: iload           llllllllllllIllIIIlllllIlIIlIlll
        //  1397: ireturn        
        //  1398: aload           llllllllllllIllIIIlllllIIlllllll
        //  1400: fload           llllllllllllIllIIIlllllIlIIIIIlI
        //  1402: f2d            
        //  1403: iload           llllllllllllIllIIIlllllIlIIIlIIl
        //  1405: i2d            
        //  1406: fload           llllllllllllIllIIIlllllIlIIIIIIl
        //  1408: f2d            
        //  1409: aload_1         /* llllllllllllIllIIIlllllIlIlIIlII */
        //  1410: getfield        net/minecraft/world/WorldServer.rand:Ljava/util/Random;
        //  1413: invokevirtual   java/util/Random.nextFloat:()F
        //  1416: ldc             360.0
        //  1418: fmul           
        //  1419: fconst_0       
        //  1420: invokevirtual   net/minecraft/entity/EntityLiving.setLocationAndAngles:(DDDFF)V
        //  1423: aload           llllllllllllIllIIIlllllIIlllllll
        //  1425: invokevirtual   net/minecraft/entity/EntityLiving.getCanSpawnHere:()Z
        //  1428: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIlll:(I)Z
        //  1431: ifeq            1542
        //  1434: aload           llllllllllllIllIIIlllllIIlllllll
        //  1436: invokevirtual   net/minecraft/entity/EntityLiving.isNotColliding:()Z
        //  1439: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIlll:(I)Z
        //  1442: ifeq            1542
        //  1445: aload           llllllllllllIllIIIlllllIIlllllll
        //  1447: aload_1         /* llllllllllllIllIIIlllllIlIlIIlII */
        //  1448: new             Lnet/minecraft/util/BlockPos;
        //  1451: dup            
        //  1452: aload           llllllllllllIllIIIlllllIIlllllll
        //  1454: invokespecial   net/minecraft/util/BlockPos.<init>:(Lnet/minecraft/entity/Entity;)V
        //  1457: invokevirtual   net/minecraft/world/WorldServer.getDifficultyForLocation:(Lnet/minecraft/util/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
        //  1460: aload           llllllllllllIllIIIlllllIlIIIIlIl
        //  1462: invokevirtual   net/minecraft/entity/EntityLiving.onInitialSpawn:(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;
        //  1465: astore          llllllllllllIllIIIlllllIlIIIIlIl
        //  1467: aload           llllllllllllIllIIIlllllIIlllllll
        //  1469: invokevirtual   net/minecraft/entity/EntityLiving.isNotColliding:()Z
        //  1472: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIlll:(I)Z
        //  1475: ifeq            1493
        //  1478: iinc            llllllllllllIllIIIlllllIlIIIllII, 1
        //  1481: aload_1         /* llllllllllllIllIIIlllllIlIlIIlII */
        //  1482: aload           llllllllllllIllIIIlllllIIlllllll
        //  1484: invokevirtual   net/minecraft/world/WorldServer.spawnEntityInWorld:(Lnet/minecraft/entity/Entity;)Z
        //  1487: ldc             ""
        //  1489: invokevirtual   java/lang/String.length:()I
        //  1492: pop2           
        //  1493: iload           llllllllllllIllIIIlllllIlIIIllII
        //  1495: aload           llllllllllllIllIIIlllllIIlllllll
        //  1497: invokevirtual   net/minecraft/entity/EntityLiving.getMaxSpawnedInChunk:()I
        //  1500: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllllII:(II)Z
        //  1503: ifeq            1542
        //  1506: ldc             ""
        //  1508: invokevirtual   java/lang/String.length:()I
        //  1511: pop            
        //  1512: ldc             "   "
        //  1514: invokevirtual   java/lang/String.length:()I
        //  1517: ldc             " "
        //  1519: invokevirtual   java/lang/String.length:()I
        //  1522: ineg           
        //  1523: if_icmpge       1581
        //  1526: sipush          191
        //  1529: sipush          162
        //  1532: ixor           
        //  1533: bipush          60
        //  1535: bipush          33
        //  1537: ixor           
        //  1538: iconst_m1      
        //  1539: ixor           
        //  1540: iand           
        //  1541: ireturn        
        //  1542: iload           llllllllllllIllIIIlllllIlIIlIlll
        //  1544: iload           llllllllllllIllIIIlllllIlIIIllII
        //  1546: iadd           
        //  1547: istore          llllllllllllIllIIIlllllIlIIlIlll
        //  1549: iinc            llllllllllllIllIIIlllllIlIIIIlII, 1
        //  1552: iload           llllllllllllIllIIIlllllIlIIIIlII
        //  1554: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //  1557: iconst_4       
        //  1558: iaload         
        //  1559: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllllII:(II)Z
        //  1562: ifeq            1013
        //  1565: iinc            llllllllllllIllIIIlllllIlIIIlIll, 1
        //  1568: iload           llllllllllllIllIIIlllllIlIIIlIll
        //  1570: getstatic       net/minecraft/world/SpawnerAnimals.llIllllIIlIIlI:[I
        //  1573: iconst_5       
        //  1574: iaload         
        //  1575: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllllII:(II)Z
        //  1578: ifeq            928
        //  1581: aload           llllllllllllIllIIIlllllIIllIlllI
        //  1583: invokeinterface java/util/Iterator.hasNext:()Z
        //  1588: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllIlIl:(I)Z
        //  1591: ifeq            777
        //  1594: iinc            9, 1
        //  1597: iload           9
        //  1599: iload           10
        //  1601: invokestatic    net/minecraft/world/SpawnerAnimals.lIIllIlIIlllllII:(II)Z
        //  1604: ifeq            560
        //  1607: iload           llllllllllllIllIIIlllllIlIIlIlll
        //  1609: ireturn        
        //    StackMapTable: 00 1D 14 FE 00 4A 01 00 07 01 9D FF 00 65 00 0C 07 00 02 07 01 94 01 01 01 01 07 01 A3 07 01 9D 01 01 01 01 00 00 FC 00 38 01 FB 00 74 44 01 FD 00 50 01 07 01 B6 F9 00 02 FA 00 0C FF 00 09 00 08 07 00 02 07 01 94 01 01 01 01 00 07 01 9D 00 00 FF 00 4C 00 0C 07 00 02 07 01 94 01 01 01 01 01 07 00 44 00 01 01 07 02 6D 00 00 FF 00 18 00 0C 07 00 02 07 01 94 01 01 01 01 01 07 00 44 07 00 92 01 01 07 02 6D 00 00 11 12 FF 00 9A 00 10 07 00 02 07 01 94 01 01 01 01 01 07 00 44 07 00 92 01 01 07 02 6D 01 01 00 07 01 9D 00 00 FF 00 96 00 17 07 00 02 07 01 94 01 01 01 01 01 07 00 44 07 00 92 01 01 07 02 6D 01 01 07 01 B6 07 01 9D 07 00 44 01 01 01 07 01 55 01 01 00 00 FF 00 54 00 1E 07 00 02 07 01 94 01 01 01 01 01 07 00 44 07 00 92 01 01 07 02 6D 01 01 07 01 B6 07 01 9D 07 00 44 01 01 01 07 01 55 01 01 01 01 01 01 07 00 06 07 01 31 01 00 00 FE 00 FE 07 00 44 02 02 F7 00 77 07 00 90 FC 00 09 07 00 12 FB 00 5E 30 FA 00 06 F8 00 02 0C FF 00 02 00 17 07 00 02 07 01 94 01 01 01 01 01 07 00 44 07 00 92 01 01 07 02 6D 01 01 07 01 B6 07 01 9D 07 00 44 01 01 01 07 01 55 01 01 00 00 FF 00 0C 00 10 07 00 02 07 01 94 01 01 01 01 01 07 00 44 07 00 92 01 01 07 02 6D 01 01 00 07 01 9D 00 00 FF 00 0C 00 0C 07 00 02 07 01 94 01 01 01 01 01 07 00 44 07 00 92 01 01 07 02 6D 00 00 FF 00 02 00 0C 07 00 02 07 01 94 01 01 01 01 01 07 00 44 00 01 01 07 02 6D 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  1304   1353   1388   1398   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static boolean lIIllIlIIlllIlIl(final int llllllllllllIllIIIllllIlllIlIIII) {
        return llllllllllllIllIIIllllIlllIlIIII == 0;
    }
    
    public SpawnerAnimals() {
        this.eligibleChunksForSpawning = (Set<ChunkCoordIntPair>)Sets.newHashSet();
    }
    
    private static void lIIllIlIIlllIIll() {
        (llIllllIIlIIlI = new int[8])[0] = ((50 + 15 + 17 + 109 ^ 9 + 3 + 83 + 83) & ("  ".length() ^ (0x4B ^ 0x44) ^ -" ".length()));
        SpawnerAnimals.llIllllIIlIIlI[1] = (0x89 ^ 0x9D ^ (0x72 ^ 0x6E));
        SpawnerAnimals.llIllllIIlIIlI[2] = " ".length();
        SpawnerAnimals.llIllllIIlIIlI[3] = (0xC2 ^ 0xB5 ^ (0xE3 ^ 0x92));
        SpawnerAnimals.llIllllIIlIIlI[4] = (0x8A ^ 0x8E);
        SpawnerAnimals.llIllllIIlIIlI[5] = "   ".length();
        SpawnerAnimals.llIllllIIlIIlI[6] = (0x2D ^ 0x3D);
        SpawnerAnimals.llIllllIIlIIlI[7] = (0x78 ^ 0x2A ^ (0xCB ^ 0x9C));
    }
    
    private static boolean lIIllIlIIllllIII(final int llllllllllllIllIIIllllIlllIlllll, final int llllllllllllIllIIIllllIlllIllllI) {
        return llllllllllllIllIIIllllIlllIlllll > llllllllllllIllIIIllllIlllIllllI;
    }
}
