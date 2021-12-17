// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class CommandEntityData extends CommandBase
{
    private static final /* synthetic */ String[] lIlIIllIIlIIIl;
    private static final /* synthetic */ int[] lIlIIllIIlIIll;
    
    private static void lllIIllllIlIIIl() {
        (lIlIIllIIlIIll = new int[10])[0] = ((74 + 8 - 48 + 168 ^ 50 + 18 - 40 + 104) & (0x7B ^ 0x3A ^ (0x92 ^ 0x9D) ^ -" ".length()));
        CommandEntityData.lIlIIllIIlIIll[1] = "  ".length();
        CommandEntityData.lIlIIllIIlIIll[2] = " ".length();
        CommandEntityData.lIlIIllIIlIIll[3] = "   ".length();
        CommandEntityData.lIlIIllIIlIIll[4] = (0x68 ^ 0x22 ^ (0x2E ^ 0x60));
        CommandEntityData.lIlIIllIIlIIll[5] = (0x98 ^ 0x86 ^ (0x64 ^ 0x7F));
        CommandEntityData.lIlIIllIIlIIll[6] = (0x67 ^ 0x61);
        CommandEntityData.lIlIIllIIlIIll[7] = (0xA5 ^ 0xA2);
        CommandEntityData.lIlIIllIIlIIll[8] = (0xDC ^ 0xC2 ^ (0x98 ^ 0x8E));
        CommandEntityData.lIlIIllIIlIIll[9] = (0xBF ^ 0xAB ^ (0x6C ^ 0x71));
    }
    
    private static String lllIIlllIllllII(final String lllllllllllllIIIllIIlllIllllIlll, final String lllllllllllllIIIllIIlllIllllIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIIllIIlllIlllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIlllIllllIlIl.getBytes(StandardCharsets.UTF_8)), CommandEntityData.lIlIIllIIlIIll[8]), "DES");
            final Cipher lllllllllllllIIIllIIlllIllllllIl = Cipher.getInstance("DES");
            lllllllllllllIIIllIIlllIllllllIl.init(CommandEntityData.lIlIIllIIlIIll[1], lllllllllllllIIIllIIlllIlllllllI);
            return new String(lllllllllllllIIIllIIlllIllllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIlllIllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIIlllIllllllII) {
            lllllllllllllIIIllIIlllIllllllII.printStackTrace();
            return null;
        }
    }
    
    private static String lllIIlllIllllIl(String lllllllllllllIIIllIIllllIIIlIllI, final String lllllllllllllIIIllIIllllIIIlllIl) {
        lllllllllllllIIIllIIllllIIIlIllI = new String(Base64.getDecoder().decode(lllllllllllllIIIllIIllllIIIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllIIllllIIIllIll = new StringBuilder();
        final char[] lllllllllllllIIIllIIllllIIIllIIl = lllllllllllllIIIllIIllllIIIlllIl.toCharArray();
        int lllllllllllllIIIllIIllllIIIllIII = CommandEntityData.lIlIIllIIlIIll[0];
        final long lllllllllllllIIIllIIllllIIIlIIII = (Object)lllllllllllllIIIllIIllllIIIlIllI.toCharArray();
        final int lllllllllllllIIIllIIllllIIIIlllI = lllllllllllllIIIllIIllllIIIlIIII.length;
        short lllllllllllllIIIllIIllllIIIIllII = (short)CommandEntityData.lIlIIllIIlIIll[0];
        while (lllIIllllIlIIlI(lllllllllllllIIIllIIllllIIIIllII, lllllllllllllIIIllIIllllIIIIlllI)) {
            final char lllllllllllllIIIllIIllllIIlIIIII = lllllllllllllIIIllIIllllIIIlIIII[lllllllllllllIIIllIIllllIIIIllII];
            lllllllllllllIIIllIIllllIIIllIll.append((char)(lllllllllllllIIIllIIllllIIlIIIII ^ lllllllllllllIIIllIIllllIIIllIIl[lllllllllllllIIIllIIllllIIIllIII % lllllllllllllIIIllIIllllIIIllIIl.length]));
            "".length();
            ++lllllllllllllIIIllIIllllIIIllIII;
            ++lllllllllllllIIIllIIllllIIIIllII;
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllIIllllIIIllIll);
    }
    
    private static boolean lllIIllllIlIIlI(final int lllllllllllllIIIllIIlllIllllIIII, final int lllllllllllllIIIllIIlllIlllIllll) {
        return lllllllllllllIIIllIIlllIllllIIII < lllllllllllllIIIllIIlllIlllIllll;
    }
    
    @Override
    public boolean isUsernameIndex(final String[] lllllllllllllIIIllIIllllIlIIIlII, final int lllllllllllllIIIllIIllllIlIIIIlI) {
        if (lllIIllllIlIlII(lllllllllllllIIIllIIllllIlIIIIlI)) {
            return CommandEntityData.lIlIIllIIlIIll[2] != 0;
        }
        return CommandEntityData.lIlIIllIIlIIll[0] != 0;
    }
    
    private static void lllIIlllIlllllI() {
        (lIlIIllIIlIIIl = new String[CommandEntityData.lIlIIllIIlIIll[9]])[CommandEntityData.lIlIIllIIlIIll[0]] = lllIIlllIlllIll("M+Al/N4/9S3lI0AUZAY+lA==", "hsVQg");
        CommandEntityData.lIlIIllIIlIIIl[CommandEntityData.lIlIIllIIlIIll[2]] = lllIIlllIllllII("E9E15xneWLmuC5xv6iauYfBJSTmukNWdLbsV106HT2E=", "AmmFl");
        CommandEntityData.lIlIIllIIlIIIl[CommandEntityData.lIlIIllIIlIIll[1]] = lllIIlllIllllII("MElP1LgzQOWlDrVLcgWyyafGDR0GaCswcsp3qZC9CVI=", "QvllL");
        CommandEntityData.lIlIIllIIlIIIl[CommandEntityData.lIlIIllIIlIIll[3]] = lllIIlllIllllII("kTQfJY75JZ55d7FS+myJ/S4SbY5f3E1oUfZOTGO2T1Q=", "kepde");
        CommandEntityData.lIlIIllIIlIIIl[CommandEntityData.lIlIIllIIlIIll[4]] = lllIIlllIlllIll("0WSFZAPiBYucpUM0Apib2xtbsniquQjrx+W3FxfZpLM=", "unlGi");
        CommandEntityData.lIlIIllIIlIIIl[CommandEntityData.lIlIIllIIlIIll[5]] = lllIIlllIllllII("cgUjZcAIoc7FSx+jIntGew==", "KuuYQ");
        CommandEntityData.lIlIIllIIlIIIl[CommandEntityData.lIlIIllIIlIIll[6]] = lllIIlllIllllIl("BCAMAzQ0FDYz", "QuEGx");
        CommandEntityData.lIlIIllIIlIIIl[CommandEntityData.lIlIIllIIlIIll[7]] = lllIIlllIllllIl("AhsmLAkPEDhvDQ8AIjURBRU/IEYHFSItDQU=", "atKAh");
        CommandEntityData.lIlIIllIIlIIIl[CommandEntityData.lIlIIllIIlIIll[8]] = lllIIlllIlllIll("tQkYphC692PrNyJN0ytkQKys8Mh4iGrxGtT/0U/Td+k=", "QiNjw");
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIIIllIIllllIlIlIllI, final String[] lllllllllllllIIIllIIllllIlIIllII) throws CommandException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: arraylength    
        //     2: getstatic       net/minecraft/command/CommandEntityData.lIlIIllIIlIIll:[I
        //     5: iconst_1       
        //     6: iaload         
        //     7: invokestatic    net/minecraft/command/CommandEntityData.lllIIllllIlIIlI:(II)Z
        //    10: ifeq            38
        //    13: new             Lnet/minecraft/command/WrongUsageException;
        //    16: dup            
        //    17: getstatic       net/minecraft/command/CommandEntityData.lIlIIllIIlIIIl:[Ljava/lang/String;
        //    20: getstatic       net/minecraft/command/CommandEntityData.lIlIIllIIlIIll:[I
        //    23: iconst_1       
        //    24: iaload         
        //    25: aaload         
        //    26: getstatic       net/minecraft/command/CommandEntityData.lIlIIllIIlIIll:[I
        //    29: iconst_0       
        //    30: iaload         
        //    31: anewarray       Ljava/lang/Object;
        //    34: invokespecial   net/minecraft/command/WrongUsageException.<init>:(Ljava/lang/String;[Ljava/lang/Object;)V
        //    37: athrow         
        //    38: aload_1         /* lllllllllllllIIIllIIllllIlIIllIl */
        //    39: aload_2         /* lllllllllllllIIIllIIllllIlIlIlIl */
        //    40: getstatic       net/minecraft/command/CommandEntityData.lIlIIllIIlIIll:[I
        //    43: iconst_0       
        //    44: iaload         
        //    45: aaload         
        //    46: invokestatic    net/minecraft/command/CommandEntityData.func_175768_b:(Lnet/minecraft/command/ICommandSender;Ljava/lang/String;)Lnet/minecraft/entity/Entity;
        //    49: astore_3        /* lllllllllllllIIIllIIllllIlIIlIll */
        //    50: aload_3         /* lllllllllllllIIIllIIllllIlIlIlII */
        //    51: instanceof      Lnet/minecraft/entity/player/EntityPlayer;
        //    54: invokestatic    net/minecraft/command/CommandEntityData.lllIIllllIlIIll:(I)Z
        //    57: ifeq            96
        //    60: new             Lnet/minecraft/command/CommandException;
        //    63: dup            
        //    64: getstatic       net/minecraft/command/CommandEntityData.lIlIIllIIlIIIl:[Ljava/lang/String;
        //    67: getstatic       net/minecraft/command/CommandEntityData.lIlIIllIIlIIll:[I
        //    70: iconst_3       
        //    71: iaload         
        //    72: aaload         
        //    73: getstatic       net/minecraft/command/CommandEntityData.lIlIIllIIlIIll:[I
        //    76: iconst_2       
        //    77: iaload         
        //    78: anewarray       Ljava/lang/Object;
        //    81: dup            
        //    82: getstatic       net/minecraft/command/CommandEntityData.lIlIIllIIlIIll:[I
        //    85: iconst_0       
        //    86: iaload         
        //    87: aload_3         /* lllllllllllllIIIllIIllllIlIlIlII */
        //    88: invokevirtual   net/minecraft/entity/Entity.getDisplayName:()Lnet/minecraft/util/IChatComponent;
        //    91: aastore        
        //    92: invokespecial   net/minecraft/command/CommandException.<init>:(Ljava/lang/String;[Ljava/lang/Object;)V
        //    95: athrow         
        //    96: new             Lnet/minecraft/nbt/NBTTagCompound;
        //    99: dup            
        //   100: invokespecial   net/minecraft/nbt/NBTTagCompound.<init>:()V
        //   103: astore          lllllllllllllIIIllIIllllIlIlIIll
        //   105: aload_3         /* lllllllllllllIIIllIIllllIlIlIlII */
        //   106: aload           lllllllllllllIIIllIIllllIlIlIIll
        //   108: invokevirtual   net/minecraft/entity/Entity.writeToNBT:(Lnet/minecraft/nbt/NBTTagCompound;)V
        //   111: aload           lllllllllllllIIIllIIllllIlIlIIll
        //   113: invokevirtual   net/minecraft/nbt/NBTTagCompound.copy:()Lnet/minecraft/nbt/NBTBase;
        //   116: checkcast       Lnet/minecraft/nbt/NBTTagCompound;
        //   119: astore          lllllllllllllIIIllIIllllIlIlIIlI
        //   121: aload_1         /* lllllllllllllIIIllIIllllIlIIllIl */
        //   122: aload_2         /* lllllllllllllIIIllIIllllIlIlIlIl */
        //   123: getstatic       net/minecraft/command/CommandEntityData.lIlIIllIIlIIll:[I
        //   126: iconst_2       
        //   127: iaload         
        //   128: invokestatic    net/minecraft/command/CommandEntityData.getChatComponentFromNthArg:(Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;I)Lnet/minecraft/util/IChatComponent;
        //   131: invokeinterface net/minecraft/util/IChatComponent.getUnformattedText:()Ljava/lang/String;
        //   136: invokestatic    net/minecraft/nbt/JsonToNBT.getTagFromJson:(Ljava/lang/String;)Lnet/minecraft/nbt/NBTTagCompound;
        //   139: astore          lllllllllllllIIIllIIllllIlIlIIIl
        //   141: ldc             ""
        //   143: invokevirtual   java/lang/String.length:()I
        //   146: pop            
        //   147: aconst_null    
        //   148: ifnull          191
        //   151: return         
        //   152: astore          lllllllllllllIIIllIIllllIlIIllll
        //   154: new             Lnet/minecraft/command/CommandException;
        //   157: dup            
        //   158: getstatic       net/minecraft/command/CommandEntityData.lIlIIllIIlIIIl:[Ljava/lang/String;
        //   161: getstatic       net/minecraft/command/CommandEntityData.lIlIIllIIlIIll:[I
        //   164: iconst_4       
        //   165: iaload         
        //   166: aaload         
        //   167: getstatic       net/minecraft/command/CommandEntityData.lIlIIllIIlIIll:[I
        //   170: iconst_2       
        //   171: iaload         
        //   172: anewarray       Ljava/lang/Object;
        //   175: dup            
        //   176: getstatic       net/minecraft/command/CommandEntityData.lIlIIllIIlIIll:[I
        //   179: iconst_0       
        //   180: iaload         
        //   181: aload           lllllllllllllIIIllIIllllIlIIllll
        //   183: invokevirtual   net/minecraft/nbt/NBTException.getMessage:()Ljava/lang/String;
        //   186: aastore        
        //   187: invokespecial   net/minecraft/command/CommandException.<init>:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   190: athrow         
        //   191: aload           lllllllllllllIIIllIIllllIlIlIIII
        //   193: getstatic       net/minecraft/command/CommandEntityData.lIlIIllIIlIIIl:[Ljava/lang/String;
        //   196: getstatic       net/minecraft/command/CommandEntityData.lIlIIllIIlIIll:[I
        //   199: iconst_5       
        //   200: iaload         
        //   201: aaload         
        //   202: invokevirtual   net/minecraft/nbt/NBTTagCompound.removeTag:(Ljava/lang/String;)V
        //   205: aload           lllllllllllllIIIllIIllllIlIlIIII
        //   207: getstatic       net/minecraft/command/CommandEntityData.lIlIIllIIlIIIl:[Ljava/lang/String;
        //   210: getstatic       net/minecraft/command/CommandEntityData.lIlIIllIIlIIll:[I
        //   213: bipush          6
        //   215: iaload         
        //   216: aaload         
        //   217: invokevirtual   net/minecraft/nbt/NBTTagCompound.removeTag:(Ljava/lang/String;)V
        //   220: aload           lllllllllllllIIIllIIllllIlIlIIll
        //   222: aload           lllllllllllllIIIllIIllllIlIlIIII
        //   224: invokevirtual   net/minecraft/nbt/NBTTagCompound.merge:(Lnet/minecraft/nbt/NBTTagCompound;)V
        //   227: aload           lllllllllllllIIIllIIllllIlIlIIll
        //   229: aload           lllllllllllllIIIllIIllllIlIlIIlI
        //   231: invokevirtual   net/minecraft/nbt/NBTTagCompound.equals:(Ljava/lang/Object;)Z
        //   234: invokestatic    net/minecraft/command/CommandEntityData.lllIIllllIlIIll:(I)Z
        //   237: ifeq            278
        //   240: new             Lnet/minecraft/command/CommandException;
        //   243: dup            
        //   244: getstatic       net/minecraft/command/CommandEntityData.lIlIIllIIlIIIl:[Ljava/lang/String;
        //   247: getstatic       net/minecraft/command/CommandEntityData.lIlIIllIIlIIll:[I
        //   250: bipush          7
        //   252: iaload         
        //   253: aaload         
        //   254: getstatic       net/minecraft/command/CommandEntityData.lIlIIllIIlIIll:[I
        //   257: iconst_2       
        //   258: iaload         
        //   259: anewarray       Ljava/lang/Object;
        //   262: dup            
        //   263: getstatic       net/minecraft/command/CommandEntityData.lIlIIllIIlIIll:[I
        //   266: iconst_0       
        //   267: iaload         
        //   268: aload           lllllllllllllIIIllIIllllIlIlIIll
        //   270: invokevirtual   net/minecraft/nbt/NBTTagCompound.toString:()Ljava/lang/String;
        //   273: aastore        
        //   274: invokespecial   net/minecraft/command/CommandException.<init>:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   277: athrow         
        //   278: aload_3         /* lllllllllllllIIIllIIllllIlIlIlII */
        //   279: aload           lllllllllllllIIIllIIllllIlIlIIll
        //   281: invokevirtual   net/minecraft/entity/Entity.readFromNBT:(Lnet/minecraft/nbt/NBTTagCompound;)V
        //   284: aload_1         /* lllllllllllllIIIllIIllllIlIIllIl */
        //   285: aload_0         /* lllllllllllllIIIllIIllllIlIIlllI */
        //   286: getstatic       net/minecraft/command/CommandEntityData.lIlIIllIIlIIIl:[Ljava/lang/String;
        //   289: getstatic       net/minecraft/command/CommandEntityData.lIlIIllIIlIIll:[I
        //   292: bipush          8
        //   294: iaload         
        //   295: aaload         
        //   296: getstatic       net/minecraft/command/CommandEntityData.lIlIIllIIlIIll:[I
        //   299: iconst_2       
        //   300: iaload         
        //   301: anewarray       Ljava/lang/Object;
        //   304: dup            
        //   305: getstatic       net/minecraft/command/CommandEntityData.lIlIIllIIlIIll:[I
        //   308: iconst_0       
        //   309: iaload         
        //   310: aload           lllllllllllllIIIllIIllllIlIlIIll
        //   312: invokevirtual   net/minecraft/nbt/NBTTagCompound.toString:()Ljava/lang/String;
        //   315: aastore        
        //   316: invokestatic    net/minecraft/command/CommandEntityData.notifyOperators:(Lnet/minecraft/command/ICommandSender;Lnet/minecraft/command/ICommand;Ljava/lang/String;[Ljava/lang/Object;)V
        //   319: return         
        //    Exceptions:
        //  throws net.minecraft.command.CommandException
        //    StackMapTable: 00 05 26 FC 00 39 07 00 ED FF 00 37 00 06 07 00 02 07 01 3D 07 01 3E 07 00 ED 07 00 F4 07 00 F4 00 01 07 00 DB FC 00 26 07 00 F4 FB 00 56
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  121    141    152    191    Lnet/minecraft/nbt/NBTException;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public String getCommandName() {
        return CommandEntityData.lIlIIllIIlIIIl[CommandEntityData.lIlIIllIIlIIll[0]];
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandEntityData.lIlIIllIIlIIll[1];
    }
    
    static {
        lllIIllllIlIIIl();
        lllIIlllIlllllI();
    }
    
    private static String lllIIlllIlllIll(final String lllllllllllllIIIllIIllllIIlllIlI, final String lllllllllllllIIIllIIllllIIllIlll) {
        try {
            final SecretKeySpec lllllllllllllIIIllIIllllIIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIllllIIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllIIllllIIllllII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllIIllllIIllllII.init(CommandEntityData.lIlIIllIIlIIll[1], lllllllllllllIIIllIIllllIIllllIl);
            return new String(lllllllllllllIIIllIIllllIIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIllllIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIIllllIIlllIll) {
            lllllllllllllIIIllIIllllIIlllIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIIIllIIllllIlllIIll) {
        return CommandEntityData.lIlIIllIIlIIIl[CommandEntityData.lIlIIllIIlIIll[2]];
    }
    
    private static boolean lllIIllllIlIlII(final int lllllllllllllIIIllIIlllIlllIlIll) {
        return lllllllllllllIIIllIIlllIlllIlIll == 0;
    }
    
    private static boolean lllIIllllIlIIll(final int lllllllllllllIIIllIIlllIlllIllIl) {
        return lllllllllllllIIIllIIlllIlllIllIl != 0;
    }
}
