// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.util.List;
import net.minecraft.util.BlockPos;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class CommandBlockData extends CommandBase
{
    private static final /* synthetic */ String[] lIlIIlIlIllIlI;
    private static final /* synthetic */ int[] lIlIIlIlIlllIl;
    
    private static boolean lllIIllIIllllII(final int lllllllllllllIIIllIllIIIlllIllIl, final int lllllllllllllIIIllIllIIIlllIllII) {
        return lllllllllllllIIIllIllIIIlllIllIl <= lllllllllllllIIIllIllIIIlllIllII;
    }
    
    private static void lllIIllIIllIllI() {
        (lIlIIlIlIlllIl = new int[12])[0] = ((0x37 ^ 0x1A) & ~(0x7D ^ 0x50));
        CommandBlockData.lIlIIlIlIlllIl[1] = "  ".length();
        CommandBlockData.lIlIIlIlIlllIl[2] = " ".length();
        CommandBlockData.lIlIIlIlIlllIl[3] = (0x7 ^ 0x3D ^ (0x34 ^ 0xA));
        CommandBlockData.lIlIIlIlIlllIl[4] = "   ".length();
        CommandBlockData.lIlIIlIlIlllIl[5] = (100 + 21 + 11 + 10 ^ 73 + 6 - 47 + 107);
        CommandBlockData.lIlIIlIlIlllIl[6] = (0xA ^ 0x74 ^ (0x57 ^ 0x2F));
        CommandBlockData.lIlIIlIlIlllIl[7] = (25 + 51 - 59 + 120 ^ 5 + 14 + 31 + 92);
        CommandBlockData.lIlIIlIlIlllIl[8] = (0x58 ^ 0x50);
        CommandBlockData.lIlIIlIlIlllIl[9] = (73 + 35 - 44 + 116 ^ 166 + 78 - 64 + 9);
        CommandBlockData.lIlIIlIlIlllIl[10] = (0xCE ^ 0xC4);
        CommandBlockData.lIlIIlIlIlllIl[11] = (0x64 ^ 0x56 ^ (0x4B ^ 0x72));
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandBlockData.lIlIIlIlIlllIl[1];
    }
    
    static {
        lllIIllIIllIllI();
        lllIIllIIlIllll();
    }
    
    private static boolean lllIIllIIlllIIl(final Object lllllllllllllIIIllIllIIIlllIlIlI) {
        return lllllllllllllIIIllIllIIIlllIlIlI == null;
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIIIllIllIIlIIllIllI, final String[] lllllllllllllIIIllIllIIlIlIIIIII) throws CommandException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: arraylength    
        //     2: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIlllIl:[I
        //     5: iconst_3       
        //     6: iaload         
        //     7: invokestatic    net/minecraft/command/CommandBlockData.lllIIllIIllIlll:(II)Z
        //    10: ifeq            38
        //    13: new             Lnet/minecraft/command/WrongUsageException;
        //    16: dup            
        //    17: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIllIlI:[Ljava/lang/String;
        //    20: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIlllIl:[I
        //    23: iconst_1       
        //    24: iaload         
        //    25: aaload         
        //    26: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIlllIl:[I
        //    29: iconst_0       
        //    30: iaload         
        //    31: anewarray       Ljava/lang/Object;
        //    34: invokespecial   net/minecraft/command/WrongUsageException.<init>:(Ljava/lang/String;[Ljava/lang/Object;)V
        //    37: athrow         
        //    38: aload_1         /* lllllllllllllIIIllIllIIlIlIIIIIl */
        //    39: getstatic       net/minecraft/command/CommandResultStats$Type.AFFECTED_BLOCKS:Lnet/minecraft/command/CommandResultStats$Type;
        //    42: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIlllIl:[I
        //    45: iconst_0       
        //    46: iaload         
        //    47: invokeinterface net/minecraft/command/ICommandSender.setCommandStat:(Lnet/minecraft/command/CommandResultStats$Type;I)V
        //    52: aload_1         /* lllllllllllllIIIllIllIIlIlIIIIIl */
        //    53: aload_2         /* lllllllllllllIIIllIllIIlIIllIlIl */
        //    54: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIlllIl:[I
        //    57: iconst_0       
        //    58: iaload         
        //    59: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIlllIl:[I
        //    62: iconst_0       
        //    63: iaload         
        //    64: invokestatic    net/minecraft/command/CommandBlockData.parseBlockPos:(Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;IZ)Lnet/minecraft/util/BlockPos;
        //    67: astore_3        /* lllllllllllllIIIllIllIIlIIllllll */
        //    68: aload_1         /* lllllllllllllIIIllIllIIlIlIIIIIl */
        //    69: invokeinterface net/minecraft/command/ICommandSender.getEntityWorld:()Lnet/minecraft/world/World;
        //    74: astore          lllllllllllllIIIllIllIIlIIlllllI
        //    76: aload           lllllllllllllIIIllIllIIlIIlllllI
        //    78: aload_3         /* lllllllllllllIIIllIllIIlIIllllll */
        //    79: invokevirtual   net/minecraft/world/World.isBlockLoaded:(Lnet/minecraft/util/BlockPos;)Z
        //    82: invokestatic    net/minecraft/command/CommandBlockData.lllIIllIIlllIII:(I)Z
        //    85: ifeq            113
        //    88: new             Lnet/minecraft/command/CommandException;
        //    91: dup            
        //    92: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIllIlI:[Ljava/lang/String;
        //    95: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIlllIl:[I
        //    98: iconst_4       
        //    99: iaload         
        //   100: aaload         
        //   101: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIlllIl:[I
        //   104: iconst_0       
        //   105: iaload         
        //   106: anewarray       Ljava/lang/Object;
        //   109: invokespecial   net/minecraft/command/CommandException.<init>:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   112: athrow         
        //   113: aload           lllllllllllllIIIllIllIIlIIlllllI
        //   115: aload_3         /* lllllllllllllIIIllIllIIlIIllllll */
        //   116: invokevirtual   net/minecraft/world/World.getTileEntity:(Lnet/minecraft/util/BlockPos;)Lnet/minecraft/tileentity/TileEntity;
        //   119: astore          lllllllllllllIIIllIllIIlIIllllIl
        //   121: aload           lllllllllllllIIIllIllIIlIIllllIl
        //   123: invokestatic    net/minecraft/command/CommandBlockData.lllIIllIIlllIIl:(Ljava/lang/Object;)Z
        //   126: ifeq            154
        //   129: new             Lnet/minecraft/command/CommandException;
        //   132: dup            
        //   133: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIllIlI:[Ljava/lang/String;
        //   136: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIlllIl:[I
        //   139: iconst_3       
        //   140: iaload         
        //   141: aaload         
        //   142: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIlllIl:[I
        //   145: iconst_0       
        //   146: iaload         
        //   147: anewarray       Ljava/lang/Object;
        //   150: invokespecial   net/minecraft/command/CommandException.<init>:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   153: athrow         
        //   154: new             Lnet/minecraft/nbt/NBTTagCompound;
        //   157: dup            
        //   158: invokespecial   net/minecraft/nbt/NBTTagCompound.<init>:()V
        //   161: astore          lllllllllllllIIIllIllIIlIIllllII
        //   163: aload           lllllllllllllIIIllIllIIlIIllllIl
        //   165: aload           lllllllllllllIIIllIllIIlIIllllII
        //   167: invokevirtual   net/minecraft/tileentity/TileEntity.writeToNBT:(Lnet/minecraft/nbt/NBTTagCompound;)V
        //   170: aload           lllllllllllllIIIllIllIIlIIllllII
        //   172: invokevirtual   net/minecraft/nbt/NBTTagCompound.copy:()Lnet/minecraft/nbt/NBTBase;
        //   175: checkcast       Lnet/minecraft/nbt/NBTTagCompound;
        //   178: astore          lllllllllllllIIIllIllIIlIIlllIll
        //   180: aload_1         /* lllllllllllllIIIllIllIIlIlIIIIIl */
        //   181: aload_2         /* lllllllllllllIIIllIllIIlIIllIlIl */
        //   182: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIlllIl:[I
        //   185: iconst_4       
        //   186: iaload         
        //   187: invokestatic    net/minecraft/command/CommandBlockData.getChatComponentFromNthArg:(Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;I)Lnet/minecraft/util/IChatComponent;
        //   190: invokeinterface net/minecraft/util/IChatComponent.getUnformattedText:()Ljava/lang/String;
        //   195: invokestatic    net/minecraft/nbt/JsonToNBT.getTagFromJson:(Ljava/lang/String;)Lnet/minecraft/nbt/NBTTagCompound;
        //   198: astore          lllllllllllllIIIllIllIIlIIlllIlI
        //   200: ldc             ""
        //   202: invokevirtual   java/lang/String.length:()I
        //   205: pop            
        //   206: ldc             "   "
        //   208: invokevirtual   java/lang/String.length:()I
        //   211: bipush          29
        //   213: bipush          32
        //   215: ixor           
        //   216: bipush          51
        //   218: iconst_3       
        //   219: ixor           
        //   220: ixor           
        //   221: bipush          88
        //   223: bipush          36
        //   225: iadd           
        //   226: bipush          82
        //   228: isub           
        //   229: bipush          90
        //   231: iadd           
        //   232: bipush          53
        //   234: bipush          68
        //   236: iadd           
        //   237: bipush          34
        //   239: isub           
        //   240: bipush          50
        //   242: iadd           
        //   243: ixor           
        //   244: ldc             " "
        //   246: invokevirtual   java/lang/String.length:()I
        //   249: ineg           
        //   250: ixor           
        //   251: iand           
        //   252: if_icmpne       295
        //   255: return         
        //   256: astore          lllllllllllllIIIllIllIIlIIlllIII
        //   258: new             Lnet/minecraft/command/CommandException;
        //   261: dup            
        //   262: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIllIlI:[Ljava/lang/String;
        //   265: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIlllIl:[I
        //   268: iconst_5       
        //   269: iaload         
        //   270: aaload         
        //   271: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIlllIl:[I
        //   274: iconst_2       
        //   275: iaload         
        //   276: anewarray       Ljava/lang/Object;
        //   279: dup            
        //   280: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIlllIl:[I
        //   283: iconst_0       
        //   284: iaload         
        //   285: aload           lllllllllllllIIIllIllIIlIIlllIII
        //   287: invokevirtual   net/minecraft/nbt/NBTException.getMessage:()Ljava/lang/String;
        //   290: aastore        
        //   291: invokespecial   net/minecraft/command/CommandException.<init>:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   294: athrow         
        //   295: aload           lllllllllllllIIIllIllIIlIIllllII
        //   297: aload           lllllllllllllIIIllIllIIlIIlllIIl
        //   299: invokevirtual   net/minecraft/nbt/NBTTagCompound.merge:(Lnet/minecraft/nbt/NBTTagCompound;)V
        //   302: aload           lllllllllllllIIIllIllIIlIIllllII
        //   304: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIllIlI:[Ljava/lang/String;
        //   307: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIlllIl:[I
        //   310: bipush          6
        //   312: iaload         
        //   313: aaload         
        //   314: aload_3         /* lllllllllllllIIIllIllIIlIIllllll */
        //   315: invokevirtual   net/minecraft/util/BlockPos.getX:()I
        //   318: invokevirtual   net/minecraft/nbt/NBTTagCompound.setInteger:(Ljava/lang/String;I)V
        //   321: aload           lllllllllllllIIIllIllIIlIIllllII
        //   323: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIllIlI:[Ljava/lang/String;
        //   326: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIlllIl:[I
        //   329: bipush          7
        //   331: iaload         
        //   332: aaload         
        //   333: aload_3         /* lllllllllllllIIIllIllIIlIIllllll */
        //   334: invokevirtual   net/minecraft/util/BlockPos.getY:()I
        //   337: invokevirtual   net/minecraft/nbt/NBTTagCompound.setInteger:(Ljava/lang/String;I)V
        //   340: aload           lllllllllllllIIIllIllIIlIIllllII
        //   342: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIllIlI:[Ljava/lang/String;
        //   345: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIlllIl:[I
        //   348: bipush          8
        //   350: iaload         
        //   351: aaload         
        //   352: aload_3         /* lllllllllllllIIIllIllIIlIIllllll */
        //   353: invokevirtual   net/minecraft/util/BlockPos.getZ:()I
        //   356: invokevirtual   net/minecraft/nbt/NBTTagCompound.setInteger:(Ljava/lang/String;I)V
        //   359: aload           lllllllllllllIIIllIllIIlIIllllII
        //   361: aload           lllllllllllllIIIllIllIIlIIlllIll
        //   363: invokevirtual   net/minecraft/nbt/NBTTagCompound.equals:(Ljava/lang/Object;)Z
        //   366: invokestatic    net/minecraft/command/CommandBlockData.lllIIllIIlllIlI:(I)Z
        //   369: ifeq            410
        //   372: new             Lnet/minecraft/command/CommandException;
        //   375: dup            
        //   376: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIllIlI:[Ljava/lang/String;
        //   379: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIlllIl:[I
        //   382: bipush          9
        //   384: iaload         
        //   385: aaload         
        //   386: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIlllIl:[I
        //   389: iconst_2       
        //   390: iaload         
        //   391: anewarray       Ljava/lang/Object;
        //   394: dup            
        //   395: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIlllIl:[I
        //   398: iconst_0       
        //   399: iaload         
        //   400: aload           lllllllllllllIIIllIllIIlIIllllII
        //   402: invokevirtual   net/minecraft/nbt/NBTTagCompound.toString:()Ljava/lang/String;
        //   405: aastore        
        //   406: invokespecial   net/minecraft/command/CommandException.<init>:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   409: athrow         
        //   410: aload           lllllllllllllIIIllIllIIlIIllllIl
        //   412: aload           lllllllllllllIIIllIllIIlIIllllII
        //   414: invokevirtual   net/minecraft/tileentity/TileEntity.readFromNBT:(Lnet/minecraft/nbt/NBTTagCompound;)V
        //   417: aload           lllllllllllllIIIllIllIIlIIllllIl
        //   419: invokevirtual   net/minecraft/tileentity/TileEntity.markDirty:()V
        //   422: aload           lllllllllllllIIIllIllIIlIIlllllI
        //   424: aload_3         /* lllllllllllllIIIllIllIIlIIllllll */
        //   425: invokevirtual   net/minecraft/world/World.markBlockForUpdate:(Lnet/minecraft/util/BlockPos;)V
        //   428: aload_1         /* lllllllllllllIIIllIllIIlIlIIIIIl */
        //   429: getstatic       net/minecraft/command/CommandResultStats$Type.AFFECTED_BLOCKS:Lnet/minecraft/command/CommandResultStats$Type;
        //   432: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIlllIl:[I
        //   435: iconst_2       
        //   436: iaload         
        //   437: invokeinterface net/minecraft/command/ICommandSender.setCommandStat:(Lnet/minecraft/command/CommandResultStats$Type;I)V
        //   442: aload_1         /* lllllllllllllIIIllIllIIlIlIIIIIl */
        //   443: aload_0         /* lllllllllllllIIIllIllIIlIIllIlll */
        //   444: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIllIlI:[Ljava/lang/String;
        //   447: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIlllIl:[I
        //   450: bipush          10
        //   452: iaload         
        //   453: aaload         
        //   454: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIlllIl:[I
        //   457: iconst_2       
        //   458: iaload         
        //   459: anewarray       Ljava/lang/Object;
        //   462: dup            
        //   463: getstatic       net/minecraft/command/CommandBlockData.lIlIIlIlIlllIl:[I
        //   466: iconst_0       
        //   467: iaload         
        //   468: aload           lllllllllllllIIIllIllIIlIIllllII
        //   470: invokevirtual   net/minecraft/nbt/NBTTagCompound.toString:()Ljava/lang/String;
        //   473: aastore        
        //   474: invokestatic    net/minecraft/command/CommandBlockData.notifyOperators:(Lnet/minecraft/command/ICommandSender;Lnet/minecraft/command/ICommand;Ljava/lang/String;[Ljava/lang/Object;)V
        //   477: return         
        //    Exceptions:
        //  throws net.minecraft.command.CommandException
        //    StackMapTable: 00 06 26 FD 00 4A 07 00 8E 07 00 57 FC 00 28 07 00 6C FF 00 65 00 08 07 00 02 07 00 49 07 00 D3 07 00 8E 07 00 57 07 00 6C 07 00 68 07 00 68 00 01 07 00 36 FC 00 26 07 00 68 FB 00 72
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  180    200    256    295    Lnet/minecraft/nbt/NBTException;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIIIllIllIIlIlIIllIl) {
        return CommandBlockData.lIlIIlIlIllIlI[CommandBlockData.lIlIIlIlIlllIl[2]];
    }
    
    private static boolean lllIIllIIlllIll(final int lllllllllllllIIIllIllIIIlllIIlII) {
        return lllllllllllllIIIllIllIIIlllIIlII > 0;
    }
    
    private static String lllIIllIIlIlIII(final String lllllllllllllIIIllIllIIlIIIlllII, final String lllllllllllllIIIllIllIIlIIIllIll) {
        try {
            final SecretKeySpec lllllllllllllIIIllIllIIlIIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIllIIlIIIllIll.getBytes(StandardCharsets.UTF_8)), CommandBlockData.lIlIIlIlIlllIl[8]), "DES");
            final Cipher lllllllllllllIIIllIllIIlIIlIIIII = Cipher.getInstance("DES");
            lllllllllllllIIIllIllIIlIIlIIIII.init(CommandBlockData.lIlIIlIlIlllIl[1], lllllllllllllIIIllIllIIlIIlIIIIl);
            return new String(lllllllllllllIIIllIllIIlIIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIllIIlIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIllIIlIIIlllll) {
            lllllllllllllIIIllIllIIlIIIlllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIIllIIlllIII(final int lllllllllllllIIIllIllIIIlllIIllI) {
        return lllllllllllllIIIllIllIIIlllIIllI == 0;
    }
    
    @Override
    public String getCommandName() {
        return CommandBlockData.lIlIIlIlIllIlI[CommandBlockData.lIlIIlIlIlllIl[0]];
    }
    
    private static boolean lllIIllIIllIlll(final int lllllllllllllIIIllIllIIIllllIIIl, final int lllllllllllllIIIllIllIIIllllIIII) {
        return lllllllllllllIIIllIllIIIllllIIIl < lllllllllllllIIIllIllIIIllllIIII;
    }
    
    private static boolean lllIIllIIlllIlI(final int lllllllllllllIIIllIllIIIlllIlIII) {
        return lllllllllllllIIIllIllIIIlllIlIII != 0;
    }
    
    private static String lllIIllIIlIlIIl(String lllllllllllllIIIllIllIIlIIIIlIIl, final String lllllllllllllIIIllIllIIlIIIIlIII) {
        lllllllllllllIIIllIllIIlIIIIlIIl = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIllIllIIlIIIIlIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllIllIIlIIIIllII = new StringBuilder();
        final char[] lllllllllllllIIIllIllIIlIIIIlIll = lllllllllllllIIIllIllIIlIIIIlIII.toCharArray();
        int lllllllllllllIIIllIllIIlIIIIlIlI = CommandBlockData.lIlIIlIlIlllIl[0];
        final byte lllllllllllllIIIllIllIIlIIIIIlII = (Object)((String)lllllllllllllIIIllIllIIlIIIIlIIl).toCharArray();
        final String lllllllllllllIIIllIllIIlIIIIIIll = (String)lllllllllllllIIIllIllIIlIIIIIlII.length;
        double lllllllllllllIIIllIllIIlIIIIIIlI = CommandBlockData.lIlIIlIlIlllIl[0];
        while (lllIIllIIllIlll((int)lllllllllllllIIIllIllIIlIIIIIIlI, (int)lllllllllllllIIIllIllIIlIIIIIIll)) {
            final char lllllllllllllIIIllIllIIlIIIIllll = lllllllllllllIIIllIllIIlIIIIIlII[lllllllllllllIIIllIllIIlIIIIIIlI];
            lllllllllllllIIIllIllIIlIIIIllII.append((char)(lllllllllllllIIIllIllIIlIIIIllll ^ lllllllllllllIIIllIllIIlIIIIlIll[lllllllllllllIIIllIllIIlIIIIlIlI % lllllllllllllIIIllIllIIlIIIIlIll.length]));
            "".length();
            ++lllllllllllllIIIllIllIIlIIIIlIlI;
            ++lllllllllllllIIIllIllIIlIIIIIIlI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllIllIIlIIIIllII);
    }
    
    private static void lllIIllIIlIllll() {
        (lIlIIlIlIllIlI = new String[CommandBlockData.lIlIIlIlIlllIl[11]])[CommandBlockData.lIlIIlIlIlllIl[0]] = lllIIllIIlIlIII("5KZ6HDMhkmXOBso4w23QNQ==", "nNzhu");
        CommandBlockData.lIlIIlIlIllIlI[CommandBlockData.lIlIIlIlIlllIl[2]] = lllIIllIIlIlIIl("AScMDBgMLBJPGw4nAgodAzwATwwRKQYE", "bHaay");
        CommandBlockData.lIlIIlIlIllIlI[CommandBlockData.lIlIIlIlIlllIl[1]] = lllIIllIIlIlIIl("KB4nOC8lFTl7LCceKT4qKgUrezs4EC0w", "KqJUN");
        CommandBlockData.lIlIIlIlIllIlI[CommandBlockData.lIlIIlIlIlllIl[4]] = lllIIllIIlIlIII("kDXjxL737RVkX8sRhoIZKrAWL6xRAjFkWwwq3v9tl6c=", "ZyHyZ");
        CommandBlockData.lIlIIlIlIllIlI[CommandBlockData.lIlIIlIlIlllIl[3]] = lllIIllIIlIlIlI("kRtYXj4ctxzm+GazZ2jY6o9IacwXpCdAvvMp8elA9Rw=", "MbyMp");
        CommandBlockData.lIlIIlIlIllIlI[CommandBlockData.lIlIIlIlIlllIl[5]] = lllIIllIIlIlIIl("MQUIOS08DhZ6Lj4FBj8oMx4EejgzDSAmPj0Y", "RjeTL");
        CommandBlockData.lIlIIlIlIllIlI[CommandBlockData.lIlIIlIlIlllIl[6]] = lllIIllIIlIlIIl("Kg==", "RiEXN");
        CommandBlockData.lIlIIlIlIllIlI[CommandBlockData.lIlIIlIlIlllIl[7]] = lllIIllIIlIlIII("AEuSoOOmDDU=", "cyIXQ");
        CommandBlockData.lIlIIlIlIllIlI[CommandBlockData.lIlIIlIlIlllIl[8]] = lllIIllIIlIlIlI("A9Mvvq1lmRI=", "ItFbL");
        CommandBlockData.lIlIIlIlIllIlI[CommandBlockData.lIlIIlIlIlllIl[9]] = lllIIllIIlIlIII("2f6UfPXCuz8k6MxhVEqZNYxhLoUagCYy396uru6Dyes=", "ymnle");
        CommandBlockData.lIlIIlIlIllIlI[CommandBlockData.lIlIIlIlIlllIl[10]] = lllIIllIIlIlIlI("uA31VEvhysig7yXO8FbiZs7oKFuuPtAcJvvJBElNYUE=", "LZyRG");
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIIIllIllIIlIIlIlIlI, final String[] lllllllllllllIIIllIllIIlIIlIlIIl, final BlockPos lllllllllllllIIIllIllIIlIIlIIllI) {
        List<String> func_175771_a;
        if (lllIIllIIlllIll(lllllllllllllIIIllIllIIlIIlIlIIl.length) && lllIIllIIllllII(lllllllllllllIIIllIllIIlIIlIlIIl.length, CommandBlockData.lIlIIlIlIlllIl[4])) {
            func_175771_a = CommandBase.func_175771_a(lllllllllllllIIIllIllIIlIIlIlIIl, CommandBlockData.lIlIIlIlIlllIl[0], lllllllllllllIIIllIllIIlIIlIIllI);
            "".length();
            if (((0x4C ^ 0xC ^ (0x32 ^ 0x7C)) & (0xB ^ 0x44 ^ (0x56 ^ 0x17) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            func_175771_a = null;
        }
        return func_175771_a;
    }
    
    private static String lllIIllIIlIlIlI(final String lllllllllllllIIIllIllIIIlllllIIl, final String lllllllllllllIIIllIllIIIllllIllI) {
        try {
            final SecretKeySpec lllllllllllllIIIllIllIIIllllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIllIIIllllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllIllIIIlllllIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllIllIIIlllllIll.init(CommandBlockData.lIlIIlIlIlllIl[1], lllllllllllllIIIllIllIIIllllllII);
            return new String(lllllllllllllIIIllIllIIIlllllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIllIIIlllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIllIIIlllllIlI) {
            lllllllllllllIIIllIllIIIlllllIlI.printStackTrace();
            return null;
        }
    }
}
