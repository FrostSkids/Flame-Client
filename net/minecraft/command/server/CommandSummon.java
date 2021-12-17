// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import java.util.Collection;
import net.minecraft.entity.EntityList;
import java.util.List;
import net.minecraft.util.BlockPos;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.CommandBase;

public class CommandSummon extends CommandBase
{
    private static final /* synthetic */ String[] lllIllIlIlllIl;
    private static final /* synthetic */ int[] lllIllIlIllllI;
    
    @Override
    public void processCommand(final ICommandSender llllllllllllIlIllIIIlllllIIllIII, final String[] llllllllllllIlIllIIIlllllIIlIlll) throws CommandException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: arraylength    
        //     2: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //     5: iconst_2       
        //     6: iaload         
        //     7: invokestatic    net/minecraft/command/server/CommandSummon.lIlIIlIIllllllll:(II)Z
        //    10: ifeq            38
        //    13: new             Lnet/minecraft/command/WrongUsageException;
        //    16: dup            
        //    17: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIlllIl:[Ljava/lang/String;
        //    20: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //    23: iconst_1       
        //    24: iaload         
        //    25: aaload         
        //    26: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //    29: iconst_0       
        //    30: iaload         
        //    31: anewarray       Ljava/lang/Object;
        //    34: invokespecial   net/minecraft/command/WrongUsageException.<init>:(Ljava/lang/String;[Ljava/lang/Object;)V
        //    37: athrow         
        //    38: aload_2         /* llllllllllllIlIllIIIlllllIIIIIll */
        //    39: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //    42: iconst_0       
        //    43: iaload         
        //    44: aaload         
        //    45: astore_3        /* llllllllllllIlIllIIIlllllIIIIIlI */
        //    46: aload_1         /* llllllllllllIlIllIIIlllllIIIIlII */
        //    47: invokeinterface net/minecraft/command/ICommandSender.getPosition:()Lnet/minecraft/util/BlockPos;
        //    52: astore          llllllllllllIlIllIIIlllllIIlIlIl
        //    54: aload_1         /* llllllllllllIlIllIIIlllllIIIIlII */
        //    55: invokeinterface net/minecraft/command/ICommandSender.getPositionVector:()Lnet/minecraft/util/Vec3;
        //    60: astore          llllllllllllIlIllIIIlllllIIlIlII
        //    62: aload           llllllllllllIlIllIIIlllllIIlIlII
        //    64: getfield        net/minecraft/util/Vec3.xCoord:D
        //    67: dstore          llllllllllllIlIllIIIlllllIIlIIll
        //    69: aload           llllllllllllIlIllIIIlllllIIlIlII
        //    71: getfield        net/minecraft/util/Vec3.yCoord:D
        //    74: dstore          llllllllllllIlIllIIIlllllIIlIIlI
        //    76: aload           llllllllllllIlIllIIIlllllIIlIlII
        //    78: getfield        net/minecraft/util/Vec3.zCoord:D
        //    81: dstore          llllllllllllIlIllIIIlllllIIlIIIl
        //    83: aload_2         /* llllllllllllIlIllIIIlllllIIIIIll */
        //    84: arraylength    
        //    85: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //    88: iconst_3       
        //    89: iaload         
        //    90: invokestatic    net/minecraft/command/server/CommandSummon.lIlIIlIlIIIIIIII:(II)Z
        //    93: ifeq            168
        //    96: dload           llllllllllllIlIllIIIlllllIIlIIll
        //    98: aload_2         /* llllllllllllIlIllIIIlllllIIIIIll */
        //    99: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   102: iconst_2       
        //   103: iaload         
        //   104: aaload         
        //   105: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   108: iconst_2       
        //   109: iaload         
        //   110: invokestatic    net/minecraft/command/server/CommandSummon.parseDouble:(DLjava/lang/String;Z)D
        //   113: dstore          llllllllllllIlIllIIIlllllIIlIIll
        //   115: dload           llllllllllllIlIllIIIlllllIIlIIlI
        //   117: aload_2         /* llllllllllllIlIllIIIlllllIIIIIll */
        //   118: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   121: iconst_1       
        //   122: iaload         
        //   123: aaload         
        //   124: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   127: iconst_0       
        //   128: iaload         
        //   129: invokestatic    net/minecraft/command/server/CommandSummon.parseDouble:(DLjava/lang/String;Z)D
        //   132: dstore          llllllllllllIlIllIIIlllllIIlIIlI
        //   134: dload           llllllllllllIlIllIIIlllllIIlIIIl
        //   136: aload_2         /* llllllllllllIlIllIIIlllllIIIIIll */
        //   137: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   140: iconst_4       
        //   141: iaload         
        //   142: aaload         
        //   143: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   146: iconst_2       
        //   147: iaload         
        //   148: invokestatic    net/minecraft/command/server/CommandSummon.parseDouble:(DLjava/lang/String;Z)D
        //   151: dstore          llllllllllllIlIllIIIlllllIIlIIIl
        //   153: new             Lnet/minecraft/util/BlockPos;
        //   156: dup            
        //   157: dload           llllllllllllIlIllIIIlllllIIlIIll
        //   159: dload           llllllllllllIlIllIIIlllllIIlIIlI
        //   161: dload           llllllllllllIlIllIIIlllllIIlIIIl
        //   163: invokespecial   net/minecraft/util/BlockPos.<init>:(DDD)V
        //   166: astore          llllllllllllIlIllIIIlllllIIlIlIl
        //   168: aload_1         /* llllllllllllIlIllIIIlllllIIIIlII */
        //   169: invokeinterface net/minecraft/command/ICommandSender.getEntityWorld:()Lnet/minecraft/world/World;
        //   174: astore          llllllllllllIlIllIIIlllllIIlIIII
        //   176: aload           llllllllllllIlIllIIIlllllIIlIIII
        //   178: aload           llllllllllllIlIllIIIlllllIIlIlIl
        //   180: invokevirtual   net/minecraft/world/World.isBlockLoaded:(Lnet/minecraft/util/BlockPos;)Z
        //   183: invokestatic    net/minecraft/command/server/CommandSummon.lIlIIlIlIIIIIIIl:(I)Z
        //   186: ifeq            214
        //   189: new             Lnet/minecraft/command/CommandException;
        //   192: dup            
        //   193: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIlllIl:[Ljava/lang/String;
        //   196: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   199: iconst_4       
        //   200: iaload         
        //   201: aaload         
        //   202: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   205: iconst_0       
        //   206: iaload         
        //   207: anewarray       Ljava/lang/Object;
        //   210: invokespecial   net/minecraft/command/CommandException.<init>:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   213: athrow         
        //   214: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIlllIl:[Ljava/lang/String;
        //   217: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   220: iconst_3       
        //   221: iaload         
        //   222: aaload         
        //   223: aload_3         /* llllllllllllIlIllIIIlllllIIlIllI */
        //   224: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   227: invokestatic    net/minecraft/command/server/CommandSummon.lIlIIlIlIIIIIIlI:(I)Z
        //   230: ifeq            296
        //   233: aload           llllllllllllIlIllIIIlllllIIlIIII
        //   235: new             Lnet/minecraft/entity/effect/EntityLightningBolt;
        //   238: dup            
        //   239: aload           llllllllllllIlIllIIIlllllIIlIIII
        //   241: dload           llllllllllllIlIllIIIlllllIIlIIll
        //   243: dload           llllllllllllIlIllIIIlllllIIlIIlI
        //   245: dload           llllllllllllIlIllIIIlllllIIlIIIl
        //   247: invokespecial   net/minecraft/entity/effect/EntityLightningBolt.<init>:(Lnet/minecraft/world/World;DDD)V
        //   250: invokevirtual   net/minecraft/world/World.addWeatherEffect:(Lnet/minecraft/entity/Entity;)Z
        //   253: ldc             ""
        //   255: invokevirtual   java/lang/String.length:()I
        //   258: pop2           
        //   259: aload_1         /* llllllllllllIlIllIIIlllllIIIIlII */
        //   260: aload_0         /* llllllllllllIlIllIIIlllllIIllIIl */
        //   261: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIlllIl:[Ljava/lang/String;
        //   264: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   267: iconst_5       
        //   268: iaload         
        //   269: aaload         
        //   270: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   273: iconst_0       
        //   274: iaload         
        //   275: anewarray       Ljava/lang/Object;
        //   278: invokestatic    net/minecraft/command/server/CommandSummon.notifyOperators:(Lnet/minecraft/command/ICommandSender;Lnet/minecraft/command/ICommand;Ljava/lang/String;[Ljava/lang/Object;)V
        //   281: ldc             ""
        //   283: invokevirtual   java/lang/String.length:()I
        //   286: pop            
        //   287: ldc             "  "
        //   289: invokevirtual   java/lang/String.length:()I
        //   292: ifge            812
        //   295: return         
        //   296: new             Lnet/minecraft/nbt/NBTTagCompound;
        //   299: dup            
        //   300: invokespecial   net/minecraft/nbt/NBTTagCompound.<init>:()V
        //   303: astore          llllllllllllIlIllIIIlllllIIIllll
        //   305: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   308: iconst_0       
        //   309: iaload         
        //   310: istore          llllllllllllIlIllIIIlllllIIIlllI
        //   312: aload_2         /* llllllllllllIlIllIIIlllllIIIIIll */
        //   313: arraylength    
        //   314: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   317: iconst_5       
        //   318: iaload         
        //   319: invokestatic    net/minecraft/command/server/CommandSummon.lIlIIlIlIIIIIIII:(II)Z
        //   322: ifeq            412
        //   325: aload_1         /* llllllllllllIlIllIIIlllllIIIIlII */
        //   326: aload_2         /* llllllllllllIlIllIIIlllllIIIIIll */
        //   327: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   330: iconst_3       
        //   331: iaload         
        //   332: invokestatic    net/minecraft/command/server/CommandSummon.getChatComponentFromNthArg:(Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;I)Lnet/minecraft/util/IChatComponent;
        //   335: astore          llllllllllllIlIllIIIlllllIIIllIl
        //   337: aload           llllllllllllIlIllIIIlllllIIIllIl
        //   339: invokeinterface net/minecraft/util/IChatComponent.getUnformattedText:()Ljava/lang/String;
        //   344: invokestatic    net/minecraft/nbt/JsonToNBT.getTagFromJson:(Ljava/lang/String;)Lnet/minecraft/nbt/NBTTagCompound;
        //   347: astore          llllllllllllIlIllIIIlllllIIIllll
        //   349: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   352: iconst_2       
        //   353: iaload         
        //   354: istore          llllllllllllIlIllIIIlllllIIIlllI
        //   356: ldc             ""
        //   358: invokevirtual   java/lang/String.length:()I
        //   361: pop            
        //   362: ldc             " "
        //   364: invokevirtual   java/lang/String.length:()I
        //   367: ineg           
        //   368: ifle            412
        //   371: return         
        //   372: astore          llllllllllllIlIllIIIlllllIIIllII
        //   374: new             Lnet/minecraft/command/CommandException;
        //   377: dup            
        //   378: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIlllIl:[Ljava/lang/String;
        //   381: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   384: bipush          6
        //   386: iaload         
        //   387: aaload         
        //   388: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   391: iconst_2       
        //   392: iaload         
        //   393: anewarray       Ljava/lang/Object;
        //   396: dup            
        //   397: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   400: iconst_0       
        //   401: iaload         
        //   402: aload           llllllllllllIlIllIIIlllllIIIllII
        //   404: invokevirtual   net/minecraft/nbt/NBTException.getMessage:()Ljava/lang/String;
        //   407: aastore        
        //   408: invokespecial   net/minecraft/command/CommandException.<init>:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   411: athrow         
        //   412: aload           llllllllllllIlIllIIIlllllIIIllll
        //   414: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIlllIl:[Ljava/lang/String;
        //   417: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   420: bipush          7
        //   422: iaload         
        //   423: aaload         
        //   424: aload_3         /* llllllllllllIlIllIIIlllllIIlIllI */
        //   425: invokevirtual   net/minecraft/nbt/NBTTagCompound.setString:(Ljava/lang/String;Ljava/lang/String;)V
        //   428: aload           llllllllllllIlIllIIIlllllIIIllll
        //   430: aload           llllllllllllIlIllIIIlllllIIlIIII
        //   432: invokestatic    net/minecraft/entity/EntityList.createEntityFromNBT:(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/World;)Lnet/minecraft/entity/Entity;
        //   435: astore          llllllllllllIlIllIIIlllllIIIlIll
        //   437: ldc             ""
        //   439: invokevirtual   java/lang/String.length:()I
        //   442: pop            
        //   443: bipush          40
        //   445: bipush          102
        //   447: ixor           
        //   448: sipush          230
        //   451: sipush          190
        //   454: ixor           
        //   455: ixor           
        //   456: sipush          168
        //   459: sipush          139
        //   462: ixor           
        //   463: sipush          170
        //   466: sipush          159
        //   469: ixor           
        //   470: ixor           
        //   471: ldc             " "
        //   473: invokevirtual   java/lang/String.length:()I
        //   476: ineg           
        //   477: ixor           
        //   478: iand           
        //   479: ldc             " "
        //   481: invokevirtual   java/lang/String.length:()I
        //   484: if_icmple       516
        //   487: return         
        //   488: astore          llllllllllllIlIllIIIlllllIIIlIIl
        //   490: new             Lnet/minecraft/command/CommandException;
        //   493: dup            
        //   494: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIlllIl:[Ljava/lang/String;
        //   497: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   500: bipush          8
        //   502: iaload         
        //   503: aaload         
        //   504: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   507: iconst_0       
        //   508: iaload         
        //   509: anewarray       Ljava/lang/Object;
        //   512: invokespecial   net/minecraft/command/CommandException.<init>:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   515: athrow         
        //   516: aload           llllllllllllIlIllIIIlllllIIIlIlI
        //   518: invokestatic    net/minecraft/command/server/CommandSummon.lIlIIlIlIIIIIIll:(Ljava/lang/Object;)Z
        //   521: ifeq            550
        //   524: new             Lnet/minecraft/command/CommandException;
        //   527: dup            
        //   528: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIlllIl:[Ljava/lang/String;
        //   531: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   534: bipush          9
        //   536: iaload         
        //   537: aaload         
        //   538: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   541: iconst_0       
        //   542: iaload         
        //   543: anewarray       Ljava/lang/Object;
        //   546: invokespecial   net/minecraft/command/CommandException.<init>:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   549: athrow         
        //   550: aload           llllllllllllIlIllIIIlllllIIIlIlI
        //   552: dload           llllllllllllIlIllIIIlllllIIlIIll
        //   554: dload           llllllllllllIlIllIIIlllllIIlIIlI
        //   556: dload           llllllllllllIlIllIIIlllllIIlIIIl
        //   558: aload           llllllllllllIlIllIIIlllllIIIlIlI
        //   560: getfield        net/minecraft/entity/Entity.rotationYaw:F
        //   563: aload           llllllllllllIlIllIIIlllllIIIlIlI
        //   565: getfield        net/minecraft/entity/Entity.rotationPitch:F
        //   568: invokevirtual   net/minecraft/entity/Entity.setLocationAndAngles:(DDDFF)V
        //   571: iload           llllllllllllIlIllIIIlllllIIIlllI
        //   573: invokestatic    net/minecraft/command/server/CommandSummon.lIlIIlIlIIIIIIIl:(I)Z
        //   576: ifeq            619
        //   579: aload           llllllllllllIlIllIIIlllllIIIlIlI
        //   581: instanceof      Lnet/minecraft/entity/EntityLiving;
        //   584: invokestatic    net/minecraft/command/server/CommandSummon.lIlIIlIlIIIIIIlI:(I)Z
        //   587: ifeq            619
        //   590: aload           llllllllllllIlIllIIIlllllIIIlIlI
        //   592: checkcast       Lnet/minecraft/entity/EntityLiving;
        //   595: aload           llllllllllllIlIllIIIlllllIIlIIII
        //   597: new             Lnet/minecraft/util/BlockPos;
        //   600: dup            
        //   601: aload           llllllllllllIlIllIIIlllllIIIlIlI
        //   603: invokespecial   net/minecraft/util/BlockPos.<init>:(Lnet/minecraft/entity/Entity;)V
        //   606: invokevirtual   net/minecraft/world/World.getDifficultyForLocation:(Lnet/minecraft/util/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
        //   609: aconst_null    
        //   610: invokevirtual   net/minecraft/entity/EntityLiving.onInitialSpawn:(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;
        //   613: ldc             ""
        //   615: invokevirtual   java/lang/String.length:()I
        //   618: pop2           
        //   619: aload           llllllllllllIlIllIIIlllllIIlIIII
        //   621: aload           llllllllllllIlIllIIIlllllIIIlIlI
        //   623: invokevirtual   net/minecraft/world/World.spawnEntityInWorld:(Lnet/minecraft/entity/Entity;)Z
        //   626: ldc             ""
        //   628: invokevirtual   java/lang/String.length:()I
        //   631: pop2           
        //   632: aload           llllllllllllIlIllIIIlllllIIIlIlI
        //   634: astore          llllllllllllIlIllIIIlllllIIIlIII
        //   636: aload           llllllllllllIlIllIIIlllllIIIllll
        //   638: astore          llllllllllllIlIllIIIlllllIIIIlll
        //   640: ldc             ""
        //   642: invokevirtual   java/lang/String.length:()I
        //   645: pop            
        //   646: ldc             " "
        //   648: invokevirtual   java/lang/String.length:()I
        //   651: ineg           
        //   652: ldc             " "
        //   654: invokevirtual   java/lang/String.length:()I
        //   657: ineg           
        //   658: if_icmpge       754
        //   661: return         
        //   662: aload           llllllllllllIlIllIIIlllllIIIIlll
        //   664: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIlllIl:[Ljava/lang/String;
        //   667: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   670: bipush          10
        //   672: iaload         
        //   673: aaload         
        //   674: invokevirtual   net/minecraft/nbt/NBTTagCompound.getCompoundTag:(Ljava/lang/String;)Lnet/minecraft/nbt/NBTTagCompound;
        //   677: aload           llllllllllllIlIllIIIlllllIIlIIII
        //   679: invokestatic    net/minecraft/entity/EntityList.createEntityFromNBT:(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/World;)Lnet/minecraft/entity/Entity;
        //   682: astore          llllllllllllIlIllIIIlllllIIIIllI
        //   684: aload           llllllllllllIlIllIIIlllllIIIIllI
        //   686: invokestatic    net/minecraft/command/server/CommandSummon.lIlIIlIlIIIIIlII:(Ljava/lang/Object;)Z
        //   689: ifeq            733
        //   692: aload           llllllllllllIlIllIIIlllllIIIIllI
        //   694: dload           llllllllllllIlIllIIIlllllIIlIIll
        //   696: dload           llllllllllllIlIllIIIlllllIIlIIlI
        //   698: dload           llllllllllllIlIllIIIlllllIIlIIIl
        //   700: aload           llllllllllllIlIllIIIlllllIIIIllI
        //   702: getfield        net/minecraft/entity/Entity.rotationYaw:F
        //   705: aload           llllllllllllIlIllIIIlllllIIIIllI
        //   707: getfield        net/minecraft/entity/Entity.rotationPitch:F
        //   710: invokevirtual   net/minecraft/entity/Entity.setLocationAndAngles:(DDDFF)V
        //   713: aload           llllllllllllIlIllIIIlllllIIlIIII
        //   715: aload           llllllllllllIlIllIIIlllllIIIIllI
        //   717: invokevirtual   net/minecraft/world/World.spawnEntityInWorld:(Lnet/minecraft/entity/Entity;)Z
        //   720: ldc             ""
        //   722: invokevirtual   java/lang/String.length:()I
        //   725: pop2           
        //   726: aload           llllllllllllIlIllIIIlllllIIIlIII
        //   728: aload           llllllllllllIlIllIIIlllllIIIIllI
        //   730: invokevirtual   net/minecraft/entity/Entity.mountEntity:(Lnet/minecraft/entity/Entity;)V
        //   733: aload           llllllllllllIlIllIIIlllllIIIIllI
        //   735: astore          llllllllllllIlIllIIIlllllIIIlIII
        //   737: aload           llllllllllllIlIllIIIlllllIIIIlll
        //   739: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIlllIl:[Ljava/lang/String;
        //   742: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   745: bipush          11
        //   747: iaload         
        //   748: aaload         
        //   749: invokevirtual   net/minecraft/nbt/NBTTagCompound.getCompoundTag:(Ljava/lang/String;)Lnet/minecraft/nbt/NBTTagCompound;
        //   752: astore          llllllllllllIlIllIIIlllllIIIIlll
        //   754: aload           llllllllllllIlIllIIIlllllIIIlIII
        //   756: invokestatic    net/minecraft/command/server/CommandSummon.lIlIIlIlIIIIIlII:(Ljava/lang/Object;)Z
        //   759: ifeq            789
        //   762: aload           llllllllllllIlIllIIIlllllIIIIlll
        //   764: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIlllIl:[Ljava/lang/String;
        //   767: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   770: bipush          12
        //   772: iaload         
        //   773: aaload         
        //   774: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   777: bipush          10
        //   779: iaload         
        //   780: invokevirtual   net/minecraft/nbt/NBTTagCompound.hasKey:(Ljava/lang/String;I)Z
        //   783: invokestatic    net/minecraft/command/server/CommandSummon.lIlIIlIlIIIIIIIl:(I)Z
        //   786: ifeq            662
        //   789: aload_1         /* llllllllllllIlIllIIIlllllIIIIlII */
        //   790: aload_0         /* llllllllllllIlIllIIIlllllIIllIIl */
        //   791: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIlllIl:[Ljava/lang/String;
        //   794: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   797: bipush          13
        //   799: iaload         
        //   800: aaload         
        //   801: getstatic       net/minecraft/command/server/CommandSummon.lllIllIlIllllI:[I
        //   804: iconst_0       
        //   805: iaload         
        //   806: anewarray       Ljava/lang/Object;
        //   809: invokestatic    net/minecraft/command/server/CommandSummon.notifyOperators:(Lnet/minecraft/command/ICommandSender;Lnet/minecraft/command/ICommand;Ljava/lang/String;[Ljava/lang/Object;)V
        //   812: return         
        //    Exceptions:
        //  throws net.minecraft.command.CommandException
        //    StackMapTable: 00 0F 26 FF 00 81 00 09 07 00 02 07 00 22 07 00 F6 07 00 53 07 00 3F 07 00 2C 03 03 03 00 00 FC 00 2D 07 00 48 FB 00 51 FF 00 4B 00 0D 07 00 02 07 00 22 07 00 F6 07 00 53 07 00 3F 07 00 2C 03 03 03 07 00 48 07 00 71 01 07 00 7A 00 01 07 00 0E FA 00 27 F7 00 4B 07 00 10 FC 00 1B 07 00 98 21 FB 00 44 FD 00 2A 07 00 98 07 00 71 FC 00 46 07 00 98 FA 00 14 22 FF 00 16 00 0A 07 00 02 07 00 22 07 00 F6 07 00 53 07 00 3F 07 00 2C 03 03 03 07 00 48 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  337    356    372    412    Lnet/minecraft/nbt/NBTException;
        //  428    437    488    516    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandSummon.lllIllIlIllllI[1];
    }
    
    private static boolean lIlIIlIIllllllll(final int llllllllllllIlIllIIIllllIIllIIIl, final int llllllllllllIlIllIIIllllIIllIIII) {
        return llllllllllllIlIllIIIllllIIllIIIl < llllllllllllIlIllIIIllllIIllIIII;
    }
    
    private static boolean lIlIIlIlIIIIIlll(final int llllllllllllIlIllIIIllllIIlIllIl, final int llllllllllllIlIllIIIllllIIlIllII) {
        return llllllllllllIlIllIIIllllIIlIllIl <= llllllllllllIlIllIIIllllIIlIllII;
    }
    
    private static String lIlIIlIIllllllII(final String llllllllllllIlIllIIIllllIllIIlII, final String llllllllllllIlIllIIIllllIllIIIll) {
        try {
            final SecretKeySpec llllllllllllIlIllIIIllllIllIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIllllIllIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIIIllllIllIlIII = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIIIllllIllIlIII.init(CommandSummon.lllIllIlIllllI[1], llllllllllllIlIllIIIllllIllIlIIl);
            return new String(llllllllllllIlIllIIIllllIllIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIllllIllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIIllllIllIIlll) {
            llllllllllllIlIllIIIllllIllIIlll.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIIlIIllllllIl() {
        (lllIllIlIlllIl = new String[CommandSummon.lllIllIlIllllI[14]])[CommandSummon.lllIllIlIllllI[0]] = lIlIIlIIlllllIlI("c86+ALZEyNY=", "eSWyY");
        CommandSummon.lllIllIlIlllIl[CommandSummon.lllIllIlIllllI[2]] = lIlIIlIIlllllIlI("NbhsCNS91SnmnOmd85kIHjV9J7VG8rm2", "jRhVw");
        CommandSummon.lllIllIlIlllIl[CommandSummon.lllIllIlIllllI[1]] = lIlIIlIIlllllIll("ORsgFwU0ED5UFy8ZIBUKdAE+GwM/", "ZtMzd");
        CommandSummon.lllIllIlIlllIl[CommandSummon.lllIllIlIllllI[4]] = lIlIIlIIllllllII("Uu5ySpM3MkkGOc2Zuge3ZdtAHFShyvhe8TOvNaaPxGg=", "cNldD");
        CommandSummon.lllIllIlIlllIl[CommandSummon.lllIllIlIllllI[3]] = lIlIIlIIlllllIlI("pjw7SSdj1V7jlcr/PaS0gA==", "SOCMJ");
        CommandSummon.lllIllIlIlllIl[CommandSummon.lllIllIlIllllI[5]] = lIlIIlIIlllllIll("KRs8PSQkECJ+Nj8ZPD8rZAckMyYvByI=", "JtQPE");
        CommandSummon.lllIllIlIlllIl[CommandSummon.lllIllIlIllllI[6]] = lIlIIlIIlllllIlI("kQCuDMFEHpsaBzi+2ghLRDgVttLuiMuG4HyeArujUT8=", "sIgmJ");
        CommandSummon.lllIllIlIlllIl[CommandSummon.lllIllIlIllllI[7]] = lIlIIlIIlllllIlI("3bKt7h93Z58=", "wbFpx");
        CommandSummon.lllIllIlIlllIl[CommandSummon.lllIllIlIllllI[8]] = lIlIIlIIlllllIll("Cy4oHi0GJTZdPx0sKBwiRickGiANJQ==", "hAEsL");
        CommandSummon.lllIllIlIlllIl[CommandSummon.lllIllIlIllllI[9]] = lIlIIlIIlllllIlI("guvyquBOrSvHmZOGxQK8Zpydx2zWsK8J", "RDctF");
        CommandSummon.lllIllIlIlllIl[CommandSummon.lllIllIlIllllI[10]] = lIlIIlIIlllllIll("Aj03AQs3", "PTShe");
        CommandSummon.lllIllIlIlllIl[CommandSummon.lllIllIlIllllI[11]] = lIlIIlIIlllllIll("Ow0MBhsO", "idhou");
        CommandSummon.lllIllIlIlllIl[CommandSummon.lllIllIlIllllI[12]] = lIlIIlIIlllllIll("HCwmIhsp", "NEBKu");
        CommandSummon.lllIllIlIlllIl[CommandSummon.lllIllIlIllllI[13]] = lIlIIlIIlllllIll("GSEdLAQUKgNvFg8jHS4LVD0FIgYfPQM=", "zNpAe");
    }
    
    private static boolean lIlIIlIlIIIIIlII(final Object llllllllllllIlIllIIIllllIIlIIllI) {
        return llllllllllllIlIllIIIllllIIlIIllI != null;
    }
    
    private static boolean lIlIIlIlIIIIIIII(final int llllllllllllIlIllIIIllllIIllIlIl, final int llllllllllllIlIllIIIllllIIllIlII) {
        return llllllllllllIlIllIIIllllIIllIlIl >= llllllllllllIlIllIIIllllIIllIlII;
    }
    
    private static boolean lIlIIlIlIIIIIlIl(final int llllllllllllIlIllIIIllllIIlllIIl, final int llllllllllllIlIllIIIllllIIlllIII) {
        return llllllllllllIlIllIIIllllIIlllIIl == llllllllllllIlIllIIIllllIIlllIII;
    }
    
    private static boolean lIlIIlIlIIIIIIIl(final int llllllllllllIlIllIIIllllIIlIIIII) {
        return llllllllllllIlIllIIIllllIIlIIIII == 0;
    }
    
    static {
        lIlIIlIIlllllllI();
        lIlIIlIIllllllIl();
    }
    
    private static String lIlIIlIIlllllIlI(final String llllllllllllIlIllIIIllllIlIllIIl, final String llllllllllllIlIllIIIllllIlIllIII) {
        try {
            final SecretKeySpec llllllllllllIlIllIIIllllIlIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIllllIlIllIII.getBytes(StandardCharsets.UTF_8)), CommandSummon.lllIllIlIllllI[8]), "DES");
            final Cipher llllllllllllIlIllIIIllllIlIllIll = Cipher.getInstance("DES");
            llllllllllllIlIllIIIllllIlIllIll.init(CommandSummon.lllIllIlIllllI[1], llllllllllllIlIllIIIllllIlIlllII);
            return new String(llllllllllllIlIllIIIllllIlIllIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIllllIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIIllllIlIllIlI) {
            llllllllllllIlIllIIIllllIlIllIlI.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIIlIIlllllIll(String llllllllllllIlIllIIIllllIlIIIlII, final String llllllllllllIlIllIIIllllIlIIlIII) {
        llllllllllllIlIllIIIllllIlIIIlII = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllIIIllllIlIIIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIIIllllIlIIIlll = new StringBuilder();
        final char[] llllllllllllIlIllIIIllllIlIIIllI = llllllllllllIlIllIIIllllIlIIlIII.toCharArray();
        int llllllllllllIlIllIIIllllIlIIIlIl = CommandSummon.lllIllIlIllllI[0];
        final Exception llllllllllllIlIllIIIllllIIllllll = (Object)((String)llllllllllllIlIllIIIllllIlIIIlII).toCharArray();
        final float llllllllllllIlIllIIIllllIIlllllI = llllllllllllIlIllIIIllllIIllllll.length;
        byte llllllllllllIlIllIIIllllIIllllIl = (byte)CommandSummon.lllIllIlIllllI[0];
        while (lIlIIlIIllllllll(llllllllllllIlIllIIIllllIIllllIl, (int)llllllllllllIlIllIIIllllIIlllllI)) {
            final char llllllllllllIlIllIIIllllIlIIlIlI = llllllllllllIlIllIIIllllIIllllll[llllllllllllIlIllIIIllllIIllllIl];
            llllllllllllIlIllIIIllllIlIIIlll.append((char)(llllllllllllIlIllIIIllllIlIIlIlI ^ llllllllllllIlIllIIIllllIlIIIllI[llllllllllllIlIllIIIllllIlIIIlIl % llllllllllllIlIllIIIllllIlIIIllI.length]));
            "".length();
            ++llllllllllllIlIllIIIllllIlIIIlIl;
            ++llllllllllllIlIllIIIllllIIllllIl;
            "".length();
            if ((0x49 ^ 0x77 ^ (0x61 ^ 0x5B)) <= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIIIllllIlIIIlll);
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender llllllllllllIlIllIIIllllIlllIIlI, final String[] llllllllllllIlIllIIIllllIlllIIIl, final BlockPos llllllllllllIlIllIIIllllIlllIIII) {
        List<String> list;
        if (lIlIIlIlIIIIIlIl(llllllllllllIlIllIIIllllIlllIIIl.length, CommandSummon.lllIllIlIllllI[2])) {
            list = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIlIllIIIllllIlllIIIl, EntityList.getEntityNameList());
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        else if (lIlIIlIlIIIIIllI(llllllllllllIlIllIIIllllIlllIIIl.length, CommandSummon.lllIllIlIllllI[2]) && lIlIIlIlIIIIIlll(llllllllllllIlIllIIIllllIlllIIIl.length, CommandSummon.lllIllIlIllllI[3])) {
            list = CommandBase.func_175771_a(llllllllllllIlIllIIIllllIlllIIIl, CommandSummon.lllIllIlIllllI[2], llllllllllllIlIllIIIllllIlllIIII);
            "".length();
            if (((0xF4 ^ 0xB9 ^ (0x20 ^ 0x5D)) & (0x6A ^ 0x11 ^ (0xEB ^ 0xA0) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            list = null;
        }
        return list;
    }
    
    @Override
    public String getCommandUsage(final ICommandSender llllllllllllIlIllIIIlllllIlIlIlI) {
        return CommandSummon.lllIllIlIlllIl[CommandSummon.lllIllIlIllllI[2]];
    }
    
    @Override
    public String getCommandName() {
        return CommandSummon.lllIllIlIlllIl[CommandSummon.lllIllIlIllllI[0]];
    }
    
    private static void lIlIIlIIlllllllI() {
        (lllIllIlIllllI = new int[15])[0] = ((0xA8 ^ 0xAE) & ~(0xD ^ 0xB));
        CommandSummon.lllIllIlIllllI[1] = "  ".length();
        CommandSummon.lllIllIlIllllI[2] = " ".length();
        CommandSummon.lllIllIlIllllI[3] = (0x63 ^ 0x2B ^ (0xDC ^ 0x90));
        CommandSummon.lllIllIlIllllI[4] = "   ".length();
        CommandSummon.lllIllIlIllllI[5] = (0x3F ^ 0x3A);
        CommandSummon.lllIllIlIllllI[6] = (0x4D ^ 0x35 ^ (0xCA ^ 0xB4));
        CommandSummon.lllIllIlIllllI[7] = (0xC4 ^ 0xC3);
        CommandSummon.lllIllIlIllllI[8] = (0x96 ^ 0xB0 ^ (0xBC ^ 0x92));
        CommandSummon.lllIllIlIllllI[9] = (0x32 ^ 0x49 ^ (0x1C ^ 0x6E));
        CommandSummon.lllIllIlIllllI[10] = (0x79 ^ 0x73);
        CommandSummon.lllIllIlIllllI[11] = (0x47 ^ 0x48 ^ (0xC7 ^ 0xC3));
        CommandSummon.lllIllIlIllllI[12] = (0x65 ^ 0x69);
        CommandSummon.lllIllIlIllllI[13] = (0xFF ^ 0xBB ^ (0xC1 ^ 0x88));
        CommandSummon.lllIllIlIllllI[14] = (0x90 ^ 0x9E);
    }
    
    private static boolean lIlIIlIlIIIIIIll(final Object llllllllllllIlIllIIIllllIIlIIlII) {
        return llllllllllllIlIllIIIllllIIlIIlII == null;
    }
    
    private static boolean lIlIIlIlIIIIIIlI(final int llllllllllllIlIllIIIllllIIlIIIlI) {
        return llllllllllllIlIllIIIllllIIlIIIlI != 0;
    }
    
    private static boolean lIlIIlIlIIIIIllI(final int llllllllllllIlIllIIIllllIIlIlIIl, final int llllllllllllIlIllIIIllllIIlIlIII) {
        return llllllllllllIlIllIIIllllIIlIlIIl > llllllllllllIlIllIIIllllIIlIlIII;
    }
}
