// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.network.play.server.S45PacketTitle;
import net.minecraft.server.MinecraftServer;
import java.util.List;
import net.minecraft.util.BlockPos;
import org.apache.logging.log4j.Logger;

public class CommandTitle extends CommandBase
{
    private static final /* synthetic */ String[] lIIlIlIIlllIIl;
    private static final /* synthetic */ int[] lIIlIlIIlllllI;
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIIllIlIIIlIlIIllIll, final String[] lllllllllllllIIllIlIIIlIlIIllIlI, final BlockPos lllllllllllllIIllIlIIIlIlIIllIIl) {
        List<String> list;
        if (llIlIIIIIIllIIl(lllllllllllllIIllIlIIIlIlIIllIlI.length, CommandTitle.lIIlIlIIlllllI[2])) {
            list = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIllIlIIIlIlIIllIlI, MinecraftServer.getServer().getAllUsernames());
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        else if (llIlIIIIIIllIIl(lllllllllllllIIllIlIIIlIlIIllIlI.length, CommandTitle.lIIlIlIIlllllI[1])) {
            list = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIllIlIIIlIlIIllIlI, S45PacketTitle.Type.getNames());
            "".length();
            if ((0xBF ^ 0x92 ^ (0x90 ^ 0xB8)) <= 0) {
                return null;
            }
        }
        else {
            list = null;
        }
        return list;
    }
    
    private static boolean llIlIIIIIIlIIll(final int lllllllllllllIIllIlIIIlIIlIIlIll) {
        return lllllllllllllIIllIlIIIlIIlIIlIll == 0;
    }
    
    private static boolean llIlIIIIIIlIIlI(final int lllllllllllllIIllIlIIIlIIlIllIlI, final int lllllllllllllIIllIlIIIlIIlIllIIl) {
        return lllllllllllllIIllIlIIIlIIlIllIlI < lllllllllllllIIllIlIIIlIIlIllIIl;
    }
    
    private static void llIlIIIIIIIllIl() {
        (lIIlIlIIlllIIl = new String[CommandTitle.lIIlIlIIlllllI[16]])[CommandTitle.lIIlIlIIlllllI[0]] = llIlIIIIIIIIlll("KI3Ab4Wale0=", "hquCR");
        CommandTitle.lIIlIlIIlllIIl[CommandTitle.lIIlIlIIlllllI[2]] = llIlIIIIIIIlIII("JwYYAgIqDQZBFy0dGQpNMRoUCAY=", "Diuoc");
        CommandTitle.lIIlIlIIlllIIl[CommandTitle.lIIlIlIIlllllI[1]] = llIlIIIIIIIIlll("l16jSUebZGIVUHjJ/w5OduTGCF9JTN6b", "AmPMC");
        CommandTitle.lIIlIlIIlllIIl[CommandTitle.lIIlIlIIlllllI[3]] = llIlIIIIIIIlIIl("jylYNKuCQV0=", "rWoFH");
        CommandTitle.lIIlIlIIlllIIl[CommandTitle.lIIlIlIIlllllI[4]] = llIlIIIIIIIIlll("V7E2mjAKuvGCGx74OKdlVg==", "MpSZa");
        CommandTitle.lIIlIlIIlllIIl[CommandTitle.lIIlIlIIlllllI[5]] = llIlIIIIIIIlIIl("pMAQBWgKuwM1BhO7M9Avsnv19QoQnWk4uxbYp25jEN0=", "nTYpO");
        CommandTitle.lIIlIlIIlllIIl[CommandTitle.lIIlIlIIlllllI[6]] = llIlIIIIIIIlIII("MQobMjg=", "EcvWK");
        CommandTitle.lIIlIlIIlllIIl[CommandTitle.lIIlIlIIlllllI[7]] = llIlIIIIIIIlIII("LT0GHjAgNhhdJScmBxZ/OyEKFDRgJgIeND0=", "NRksQ");
        CommandTitle.lIIlIlIIlllIIl[CommandTitle.lIIlIlIIlllllI[8]] = llIlIIIIIIIlIII("LgkiCQwjAjxKGSQSIwFDOBUuAwg=", "MfOdm");
        CommandTitle.lIIlIlIIlllIIl[CommandTitle.lIIlIlIIlllllI[9]] = llIlIIIIIIIlIIl("YSKJ/EkepSCt25WZNj9fvVg43LDws4mI", "hnbkB");
        CommandTitle.lIIlIlIIlllIIl[CommandTitle.lIIlIlIIlllllI[10]] = llIlIIIIIIIlIIl("YuEo2No3KEEuL5QpGssPaaI7SKWPtAnp", "GsrPN");
        CommandTitle.lIIlIlIIlllIIl[CommandTitle.lIIlIlIIlllllI[11]] = llIlIIIIIIIlIII("FzcoDyYaPDZMMxE0KRAmA3YvESgaHT0BIgQsLA0p", "tXEbG");
        CommandTitle.lIIlIlIIlllIIl[CommandTitle.lIIlIlIIlllllI[12]] = llIlIIIIIIIlIII("", "ZodKg");
        CommandTitle.lIIlIlIIlllIIl[CommandTitle.lIIlIlIIlllllI[13]] = llIlIIIIIIIlIII("ASIdNRcMKQN2Ags5HD1YETgTOxMRPg==", "bMpXv");
        CommandTitle.lIIlIlIIlllIIl[CommandTitle.lIIlIlIIlllllI[14]] = llIlIIIIIIIIlll("X/MfhQgwo1fPOVbmHi8R/Ghq8h7++XeO", "JXfst");
        CommandTitle.lIIlIlIIlllIIl[CommandTitle.lIIlIlIIlllllI[15]] = llIlIIIIIIIlIIl("dgUNDIUQ3IOz/4DiuGGppsz7RCp1MfLN", "BvtgY");
    }
    
    private static boolean llIlIIIIIIllIIl(final int lllllllllllllIIllIlIIIlIIlIllllI, final int lllllllllllllIIllIlIIIlIIlIlllIl) {
        return lllllllllllllIIllIlIIIlIIlIllllI == lllllllllllllIIllIlIIIlIIlIlllIl;
    }
    
    private static boolean llIlIIIIIIlIllI(final Object lllllllllllllIIllIlIIIlIIlIlIIlI, final Object lllllllllllllIIllIlIIIlIIlIlIIIl) {
        return lllllllllllllIIllIlIIIlIIlIlIIlI == lllllllllllllIIllIlIIIlIIlIlIIIl;
    }
    
    @Override
    public String getCommandName() {
        return CommandTitle.lIIlIlIIlllIIl[CommandTitle.lIIlIlIIlllllI[0]];
    }
    
    private static String llIlIIIIIIIlIIl(final String lllllllllllllIIllIlIIIlIIllIIllI, final String lllllllllllllIIllIlIIIlIIllIIIll) {
        try {
            final SecretKeySpec lllllllllllllIIllIlIIIlIIllIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlIIIlIIllIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIlIIIlIIllIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIlIIIlIIllIlIII.init(CommandTitle.lIIlIlIIlllllI[1], lllllllllllllIIllIlIIIlIIllIlIIl);
            return new String(lllllllllllllIIllIlIIIlIIllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlIIIlIIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIlIIIlIIllIIlll) {
            lllllllllllllIIllIlIIIlIIllIIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIIIIIIllIII(final Object lllllllllllllIIllIlIIIlIIlIIllll) {
        return lllllllllllllIIllIlIIIlIIlIIllll == null;
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIIllIlIIIlIllIIIIII) {
        return CommandTitle.lIIlIlIIlllIIl[CommandTitle.lIIlIlIIlllllI[2]];
    }
    
    @Override
    public boolean isUsernameIndex(final String[] lllllllllllllIIllIlIIIlIlIIlIlIl, final int lllllllllllllIIllIlIIIlIlIIlIIll) {
        if (llIlIIIIIIlIIll(lllllllllllllIIllIlIIIlIlIIlIIll)) {
            return CommandTitle.lIIlIlIIlllllI[2] != 0;
        }
        return CommandTitle.lIIlIlIIlllllI[0] != 0;
    }
    
    private static boolean llIlIIIIIIlIlIl(final Object lllllllllllllIIllIlIIIlIIlIlIllI, final Object lllllllllllllIIllIlIIIlIIlIlIlIl) {
        return lllllllllllllIIllIlIIIlIIlIlIllI != lllllllllllllIIllIlIIIlIIlIlIlIl;
    }
    
    static {
        llIlIIIIIIlIIIl();
        llIlIIIIIIIllIl();
        LOGGER = LogManager.getLogger();
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIIllIlIIIlIlIllIlIl, final String[] lllllllllllllIIllIlIIIlIlIlIIlII) throws CommandException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: arraylength    
        //     2: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //     5: iconst_1       
        //     6: iaload         
        //     7: invokestatic    net/minecraft/command/CommandTitle.llIlIIIIIIlIIlI:(II)Z
        //    10: ifeq            38
        //    13: new             Lnet/minecraft/command/WrongUsageException;
        //    16: dup            
        //    17: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllIIl:[Ljava/lang/String;
        //    20: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //    23: iconst_1       
        //    24: iaload         
        //    25: aaload         
        //    26: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //    29: iconst_0       
        //    30: iaload         
        //    31: anewarray       Ljava/lang/Object;
        //    34: invokespecial   net/minecraft/command/WrongUsageException.<init>:(Ljava/lang/String;[Ljava/lang/Object;)V
        //    37: athrow         
        //    38: aload_2         /* lllllllllllllIIllIlIIIlIlIllIlII */
        //    39: arraylength    
        //    40: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //    43: iconst_3       
        //    44: iaload         
        //    45: invokestatic    net/minecraft/command/CommandTitle.llIlIIIIIIlIIlI:(II)Z
        //    48: ifeq            178
        //    51: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllIIl:[Ljava/lang/String;
        //    54: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //    57: iconst_3       
        //    58: iaload         
        //    59: aaload         
        //    60: aload_2         /* lllllllllllllIIllIlIIIlIlIllIlII */
        //    61: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //    64: iconst_2       
        //    65: iaload         
        //    66: aaload         
        //    67: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    70: invokestatic    net/minecraft/command/CommandTitle.llIlIIIIIIlIIll:(I)Z
        //    73: ifeq            101
        //    76: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllIIl:[Ljava/lang/String;
        //    79: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //    82: iconst_4       
        //    83: iaload         
        //    84: aaload         
        //    85: aload_2         /* lllllllllllllIIllIlIIIlIlIllIlII */
        //    86: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //    89: iconst_2       
        //    90: iaload         
        //    91: aaload         
        //    92: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    95: invokestatic    net/minecraft/command/CommandTitle.llIlIIIIIIlIlII:(I)Z
        //    98: ifeq            126
        //   101: new             Lnet/minecraft/command/WrongUsageException;
        //   104: dup            
        //   105: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllIIl:[Ljava/lang/String;
        //   108: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   111: iconst_5       
        //   112: iaload         
        //   113: aaload         
        //   114: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   117: iconst_0       
        //   118: iaload         
        //   119: anewarray       Ljava/lang/Object;
        //   122: invokespecial   net/minecraft/command/WrongUsageException.<init>:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   125: athrow         
        //   126: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllIIl:[Ljava/lang/String;
        //   129: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   132: bipush          6
        //   134: iaload         
        //   135: aaload         
        //   136: aload_2         /* lllllllllllllIIllIlIIIlIlIllIlII */
        //   137: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   140: iconst_2       
        //   141: iaload         
        //   142: aaload         
        //   143: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   146: invokestatic    net/minecraft/command/CommandTitle.llIlIIIIIIlIlII:(I)Z
        //   149: ifeq            178
        //   152: new             Lnet/minecraft/command/WrongUsageException;
        //   155: dup            
        //   156: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllIIl:[Ljava/lang/String;
        //   159: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   162: bipush          7
        //   164: iaload         
        //   165: aaload         
        //   166: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   169: iconst_0       
        //   170: iaload         
        //   171: anewarray       Ljava/lang/Object;
        //   174: invokespecial   net/minecraft/command/WrongUsageException.<init>:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   177: athrow         
        //   178: aload_1         /* lllllllllllllIIllIlIIIlIlIlIIlIl */
        //   179: aload_2         /* lllllllllllllIIllIlIIIlIlIllIlII */
        //   180: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   183: iconst_0       
        //   184: iaload         
        //   185: aaload         
        //   186: invokestatic    net/minecraft/command/CommandTitle.getPlayer:(Lnet/minecraft/command/ICommandSender;Ljava/lang/String;)Lnet/minecraft/entity/player/EntityPlayerMP;
        //   189: astore_3        /* lllllllllllllIIllIlIIIlIlIlIIIll */
        //   190: aload_2         /* lllllllllllllIIllIlIIIlIlIllIlII */
        //   191: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   194: iconst_2       
        //   195: iaload         
        //   196: aaload         
        //   197: invokestatic    net/minecraft/network/play/server/S45PacketTitle$Type.byName:(Ljava/lang/String;)Lnet/minecraft/network/play/server/S45PacketTitle$Type;
        //   200: astore          lllllllllllllIIllIlIIIlIlIllIIlI
        //   202: aload           lllllllllllllIIllIlIIIlIlIllIIlI
        //   204: getstatic       net/minecraft/network/play/server/S45PacketTitle$Type.CLEAR:Lnet/minecraft/network/play/server/S45PacketTitle$Type;
        //   207: invokestatic    net/minecraft/command/CommandTitle.llIlIIIIIIlIlIl:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   210: ifeq            714
        //   213: aload           lllllllllllllIIllIlIIIlIlIllIIlI
        //   215: getstatic       net/minecraft/network/play/server/S45PacketTitle$Type.RESET:Lnet/minecraft/network/play/server/S45PacketTitle$Type;
        //   218: invokestatic    net/minecraft/command/CommandTitle.llIlIIIIIIlIlIl:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   221: ifeq            714
        //   224: aload           lllllllllllllIIllIlIIIlIlIllIIlI
        //   226: getstatic       net/minecraft/network/play/server/S45PacketTitle$Type.TIMES:Lnet/minecraft/network/play/server/S45PacketTitle$Type;
        //   229: invokestatic    net/minecraft/command/CommandTitle.llIlIIIIIIlIllI:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   232: ifeq            373
        //   235: aload_2         /* lllllllllllllIIllIlIIIlIlIllIlII */
        //   236: arraylength    
        //   237: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   240: iconst_5       
        //   241: iaload         
        //   242: invokestatic    net/minecraft/command/CommandTitle.llIlIIIIIIlIlll:(II)Z
        //   245: ifeq            274
        //   248: new             Lnet/minecraft/command/WrongUsageException;
        //   251: dup            
        //   252: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllIIl:[Ljava/lang/String;
        //   255: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   258: bipush          8
        //   260: iaload         
        //   261: aaload         
        //   262: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   265: iconst_0       
        //   266: iaload         
        //   267: anewarray       Ljava/lang/Object;
        //   270: invokespecial   net/minecraft/command/WrongUsageException.<init>:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   273: athrow         
        //   274: aload_2         /* lllllllllllllIIllIlIIIlIlIllIlII */
        //   275: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   278: iconst_1       
        //   279: iaload         
        //   280: aaload         
        //   281: invokestatic    net/minecraft/command/CommandTitle.parseInt:(Ljava/lang/String;)I
        //   284: istore          lllllllllllllIIllIlIIIlIlIllIIIl
        //   286: aload_2         /* lllllllllllllIIllIlIIIlIlIllIlII */
        //   287: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   290: iconst_3       
        //   291: iaload         
        //   292: aaload         
        //   293: invokestatic    net/minecraft/command/CommandTitle.parseInt:(Ljava/lang/String;)I
        //   296: istore          lllllllllllllIIllIlIIIlIlIllIIII
        //   298: aload_2         /* lllllllllllllIIllIlIIIlIlIllIlII */
        //   299: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   302: iconst_4       
        //   303: iaload         
        //   304: aaload         
        //   305: invokestatic    net/minecraft/command/CommandTitle.parseInt:(Ljava/lang/String;)I
        //   308: istore          lllllllllllllIIllIlIIIlIlIlIllll
        //   310: new             Lnet/minecraft/network/play/server/S45PacketTitle;
        //   313: dup            
        //   314: iload           lllllllllllllIIllIlIIIlIlIllIIIl
        //   316: iload           lllllllllllllIIllIlIIIlIlIllIIII
        //   318: iload           lllllllllllllIIllIlIIIlIlIlIllll
        //   320: invokespecial   net/minecraft/network/play/server/S45PacketTitle.<init>:(III)V
        //   323: astore          lllllllllllllIIllIlIIIlIlIlIlllI
        //   325: aload_3         /* lllllllllllllIIllIlIIIlIlIllIIll */
        //   326: getfield        net/minecraft/entity/player/EntityPlayerMP.playerNetServerHandler:Lnet/minecraft/network/NetHandlerPlayServer;
        //   329: aload           lllllllllllllIIllIlIIIlIlIlIlllI
        //   331: invokevirtual   net/minecraft/network/NetHandlerPlayServer.sendPacket:(Lnet/minecraft/network/Packet;)V
        //   334: aload_1         /* lllllllllllllIIllIlIIIlIlIlIIlIl */
        //   335: aload_0         /* lllllllllllllIIllIlIIIlIlIlIIllI */
        //   336: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllIIl:[Ljava/lang/String;
        //   339: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   342: bipush          9
        //   344: iaload         
        //   345: aaload         
        //   346: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   349: iconst_0       
        //   350: iaload         
        //   351: anewarray       Ljava/lang/Object;
        //   354: invokestatic    net/minecraft/command/CommandTitle.notifyOperators:(Lnet/minecraft/command/ICommandSender;Lnet/minecraft/command/ICommand;Ljava/lang/String;[Ljava/lang/Object;)V
        //   357: ldc             ""
        //   359: invokevirtual   java/lang/String.length:()I
        //   362: pop            
        //   363: ldc_w           "  "
        //   366: invokevirtual   java/lang/String.length:()I
        //   369: ifgt            797
        //   372: return         
        //   373: aload_2         /* lllllllllllllIIllIlIIIlIlIllIlII */
        //   374: arraylength    
        //   375: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   378: iconst_3       
        //   379: iaload         
        //   380: invokestatic    net/minecraft/command/CommandTitle.llIlIIIIIIlIIlI:(II)Z
        //   383: ifeq            412
        //   386: new             Lnet/minecraft/command/WrongUsageException;
        //   389: dup            
        //   390: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllIIl:[Ljava/lang/String;
        //   393: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   396: bipush          10
        //   398: iaload         
        //   399: aaload         
        //   400: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   403: iconst_0       
        //   404: iaload         
        //   405: anewarray       Ljava/lang/Object;
        //   408: invokespecial   net/minecraft/command/WrongUsageException.<init>:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   411: athrow         
        //   412: aload_2         /* lllllllllllllIIllIlIIIlIlIllIlII */
        //   413: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   416: iconst_1       
        //   417: iaload         
        //   418: invokestatic    net/minecraft/command/CommandTitle.buildString:([Ljava/lang/String;I)Ljava/lang/String;
        //   421: astore          lllllllllllllIIllIlIIIlIlIlIllIl
        //   423: aload           lllllllllllllIIllIlIIIlIlIlIllIl
        //   425: invokestatic    net/minecraft/util/IChatComponent$Serializer.jsonToComponent:(Ljava/lang/String;)Lnet/minecraft/util/IChatComponent;
        //   428: astore          lllllllllllllIIllIlIIIlIlIlIllII
        //   430: ldc             ""
        //   432: invokevirtual   java/lang/String.length:()I
        //   435: pop            
        //   436: sipush          211
        //   439: sipush          178
        //   442: ixor           
        //   443: bipush          87
        //   445: iconst_0       
        //   446: ixor           
        //   447: ixor           
        //   448: bipush          104
        //   450: bipush          67
        //   452: iadd           
        //   453: bipush          126
        //   455: isub           
        //   456: sipush          132
        //   459: iadd           
        //   460: sipush          134
        //   463: bipush          120
        //   465: iadd           
        //   466: sipush          203
        //   469: isub           
        //   470: bipush          84
        //   472: iadd           
        //   473: ixor           
        //   474: ldc_w           " "
        //   477: invokevirtual   java/lang/String.length:()I
        //   480: ineg           
        //   481: ixor           
        //   482: iand           
        //   483: sipush          228
        //   486: sipush          130
        //   489: ixor           
        //   490: bipush          98
        //   492: bipush          49
        //   494: ixor           
        //   495: ixor           
        //   496: bipush          42
        //   498: bipush          22
        //   500: iadd           
        //   501: bipush          9
        //   503: isub           
        //   504: bipush          115
        //   506: iadd           
        //   507: bipush          20
        //   509: sipush          140
        //   512: iadd           
        //   513: bipush          124
        //   515: isub           
        //   516: bipush          123
        //   518: iadd           
        //   519: ixor           
        //   520: ldc_w           " "
        //   523: invokevirtual   java/lang/String.length:()I
        //   526: ineg           
        //   527: ixor           
        //   528: iand           
        //   529: if_icmpeq       622
        //   532: return         
        //   533: astore          lllllllllllllIIllIlIIIlIlIlIlIlI
        //   535: aload           lllllllllllllIIllIlIIIlIlIlIlIlI
        //   537: invokestatic    org/apache/commons/lang3/exception/ExceptionUtils.getRootCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   540: astore          lllllllllllllIIllIlIIIlIlIlIlIIl
        //   542: new             Lnet/minecraft/command/SyntaxErrorException;
        //   545: dup            
        //   546: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllIIl:[Ljava/lang/String;
        //   549: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   552: bipush          11
        //   554: iaload         
        //   555: aaload         
        //   556: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   559: iconst_2       
        //   560: iaload         
        //   561: anewarray       Ljava/lang/Object;
        //   564: dup            
        //   565: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   568: iconst_0       
        //   569: iaload         
        //   570: aload           lllllllllllllIIllIlIIIlIlIlIlIIl
        //   572: invokestatic    net/minecraft/command/CommandTitle.llIlIIIIIIllIII:(Ljava/lang/Object;)Z
        //   575: ifeq            612
        //   578: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllIIl:[Ljava/lang/String;
        //   581: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   584: bipush          12
        //   586: iaload         
        //   587: aaload         
        //   588: ldc             ""
        //   590: invokevirtual   java/lang/String.length:()I
        //   593: pop            
        //   594: ldc_w           " "
        //   597: invokevirtual   java/lang/String.length:()I
        //   600: ineg           
        //   601: sipush          160
        //   604: sipush          164
        //   607: ixor           
        //   608: if_icmpne       617
        //   611: return         
        //   612: aload           lllllllllllllIIllIlIIIlIlIlIlIIl
        //   614: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   617: aastore        
        //   618: invokespecial   net/minecraft/command/SyntaxErrorException.<init>:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   621: athrow         
        //   622: new             Lnet/minecraft/network/play/server/S45PacketTitle;
        //   625: dup            
        //   626: aload           lllllllllllllIIllIlIIIlIlIllIIlI
        //   628: aload_1         /* lllllllllllllIIllIlIIIlIlIlIIlIl */
        //   629: aload           lllllllllllllIIllIlIIIlIlIlIlIll
        //   631: aload_3         /* lllllllllllllIIllIlIIIlIlIllIIll */
        //   632: invokestatic    net/minecraft/util/ChatComponentProcessor.processComponent:(Lnet/minecraft/command/ICommandSender;Lnet/minecraft/util/IChatComponent;Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/IChatComponent;
        //   635: invokespecial   net/minecraft/network/play/server/S45PacketTitle.<init>:(Lnet/minecraft/network/play/server/S45PacketTitle$Type;Lnet/minecraft/util/IChatComponent;)V
        //   638: astore          lllllllllllllIIllIlIIIlIlIlIlIII
        //   640: aload_3         /* lllllllllllllIIllIlIIIlIlIllIIll */
        //   641: getfield        net/minecraft/entity/player/EntityPlayerMP.playerNetServerHandler:Lnet/minecraft/network/NetHandlerPlayServer;
        //   644: aload           lllllllllllllIIllIlIIIlIlIlIlIII
        //   646: invokevirtual   net/minecraft/network/NetHandlerPlayServer.sendPacket:(Lnet/minecraft/network/Packet;)V
        //   649: aload_1         /* lllllllllllllIIllIlIIIlIlIlIIlIl */
        //   650: aload_0         /* lllllllllllllIIllIlIIIlIlIlIIllI */
        //   651: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllIIl:[Ljava/lang/String;
        //   654: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   657: bipush          13
        //   659: iaload         
        //   660: aaload         
        //   661: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   664: iconst_0       
        //   665: iaload         
        //   666: anewarray       Ljava/lang/Object;
        //   669: invokestatic    net/minecraft/command/CommandTitle.notifyOperators:(Lnet/minecraft/command/ICommandSender;Lnet/minecraft/command/ICommand;Ljava/lang/String;[Ljava/lang/Object;)V
        //   672: ldc             ""
        //   674: invokevirtual   java/lang/String.length:()I
        //   677: pop            
        //   678: sipush          188
        //   681: sipush          198
        //   684: ixor           
        //   685: bipush          111
        //   687: bipush          37
        //   689: ixor           
        //   690: ixor           
        //   691: bipush          92
        //   693: bipush          122
        //   695: ixor           
        //   696: bipush          20
        //   698: iconst_2       
        //   699: ixor           
        //   700: ixor           
        //   701: ldc_w           " "
        //   704: invokevirtual   java/lang/String.length:()I
        //   707: ineg           
        //   708: ixor           
        //   709: iand           
        //   710: ifge            797
        //   713: return         
        //   714: aload_2         /* lllllllllllllIIllIlIIIlIlIllIlII */
        //   715: arraylength    
        //   716: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   719: iconst_1       
        //   720: iaload         
        //   721: invokestatic    net/minecraft/command/CommandTitle.llIlIIIIIIlIlll:(II)Z
        //   724: ifeq            753
        //   727: new             Lnet/minecraft/command/WrongUsageException;
        //   730: dup            
        //   731: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllIIl:[Ljava/lang/String;
        //   734: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   737: bipush          14
        //   739: iaload         
        //   740: aaload         
        //   741: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   744: iconst_0       
        //   745: iaload         
        //   746: anewarray       Ljava/lang/Object;
        //   749: invokespecial   net/minecraft/command/WrongUsageException.<init>:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   752: athrow         
        //   753: new             Lnet/minecraft/network/play/server/S45PacketTitle;
        //   756: dup            
        //   757: aload           lllllllllllllIIllIlIIIlIlIllIIlI
        //   759: aconst_null    
        //   760: invokespecial   net/minecraft/network/play/server/S45PacketTitle.<init>:(Lnet/minecraft/network/play/server/S45PacketTitle$Type;Lnet/minecraft/util/IChatComponent;)V
        //   763: astore          lllllllllllllIIllIlIIIlIlIlIIlll
        //   765: aload_3         /* lllllllllllllIIllIlIIIlIlIllIIll */
        //   766: getfield        net/minecraft/entity/player/EntityPlayerMP.playerNetServerHandler:Lnet/minecraft/network/NetHandlerPlayServer;
        //   769: aload           lllllllllllllIIllIlIIIlIlIlIIlll
        //   771: invokevirtual   net/minecraft/network/NetHandlerPlayServer.sendPacket:(Lnet/minecraft/network/Packet;)V
        //   774: aload_1         /* lllllllllllllIIllIlIIIlIlIlIIlIl */
        //   775: aload_0         /* lllllllllllllIIllIlIIIlIlIlIIllI */
        //   776: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllIIl:[Ljava/lang/String;
        //   779: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   782: bipush          15
        //   784: iaload         
        //   785: aaload         
        //   786: getstatic       net/minecraft/command/CommandTitle.lIIlIlIIlllllI:[I
        //   789: iconst_0       
        //   790: iaload         
        //   791: anewarray       Ljava/lang/Object;
        //   794: invokestatic    net/minecraft/command/CommandTitle.notifyOperators:(Lnet/minecraft/command/ICommandSender;Lnet/minecraft/command/ICommand;Ljava/lang/String;[Ljava/lang/Object;)V
        //   797: return         
        //    Exceptions:
        //  throws net.minecraft.command.CommandException
        //    StackMapTable: 00 0E 26 3E 18 33 FD 00 5F 07 01 3E 07 00 0B FB 00 62 26 FF 00 78 00 06 07 00 02 07 01 61 07 01 62 07 01 3E 07 00 0B 07 00 2F 00 01 07 01 14 FF 00 4E 00 09 07 00 02 07 01 61 07 01 62 07 01 3E 07 00 0B 07 00 2F 00 07 01 14 07 01 6E 00 06 08 02 1E 08 02 1E 07 00 2F 07 01 70 07 01 70 01 FF 00 04 00 09 07 00 02 07 01 61 07 01 62 07 01 3E 07 00 0B 07 00 2F 00 07 01 14 07 01 6E 00 07 08 02 1E 08 02 1E 07 00 2F 07 01 70 07 01 70 01 07 00 2F FF 00 04 00 07 07 00 02 07 01 61 07 01 62 07 01 3E 07 00 0B 07 00 2F 07 00 08 00 00 F9 00 5B 26 F9 00 2B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  423    430    533    622    Lcom/google/gson/JsonParseException;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandTitle.lIIlIlIIlllllI[1];
    }
    
    private static boolean llIlIIIIIIlIlII(final int lllllllllllllIIllIlIIIlIIlIIllIl) {
        return lllllllllllllIIllIlIIIlIIlIIllIl != 0;
    }
    
    private static String llIlIIIIIIIIlll(final String lllllllllllllIIllIlIIIlIIlllIIIl, final String lllllllllllllIIllIlIIIlIIlllIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIllIlIIIlIIlllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlIIIlIIlllIIlI.getBytes(StandardCharsets.UTF_8)), CommandTitle.lIIlIlIIlllllI[8]), "DES");
            final Cipher lllllllllllllIIllIlIIIlIIlllIlIl = Cipher.getInstance("DES");
            lllllllllllllIIllIlIIIlIIlllIlIl.init(CommandTitle.lIIlIlIIlllllI[1], lllllllllllllIIllIlIIIlIIlllIllI);
            return new String(lllllllllllllIIllIlIIIlIIlllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlIIIlIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIlIIIlIIlllIlII) {
            lllllllllllllIIllIlIIIlIIlllIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIIIIIIlIlll(final int lllllllllllllIIllIlIIIlIIlIIlIII, final int lllllllllllllIIllIlIIIlIIlIIIlll) {
        return lllllllllllllIIllIlIIIlIIlIIlIII != lllllllllllllIIllIlIIIlIIlIIIlll;
    }
    
    private static String llIlIIIIIIIlIII(String lllllllllllllIIllIlIIIlIlIIIIIll, final String lllllllllllllIIllIlIIIlIlIIIIlll) {
        lllllllllllllIIllIlIIIlIlIIIIIll = new String(Base64.getDecoder().decode(lllllllllllllIIllIlIIIlIlIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIlIIIlIlIIIIllI = new StringBuilder();
        final char[] lllllllllllllIIllIlIIIlIlIIIIlIl = lllllllllllllIIllIlIIIlIlIIIIlll.toCharArray();
        int lllllllllllllIIllIlIIIlIlIIIIlII = CommandTitle.lIIlIlIIlllllI[0];
        final byte lllllllllllllIIllIlIIIlIIllllllI = (Object)lllllllllllllIIllIlIIIlIlIIIIIll.toCharArray();
        final float lllllllllllllIIllIlIIIlIIlllllIl = lllllllllllllIIllIlIIIlIIllllllI.length;
        char lllllllllllllIIllIlIIIlIIlllllII = (char)CommandTitle.lIIlIlIIlllllI[0];
        while (llIlIIIIIIlIIlI(lllllllllllllIIllIlIIIlIIlllllII, (int)lllllllllllllIIllIlIIIlIIlllllIl)) {
            final char lllllllllllllIIllIlIIIlIlIIIlIIl = lllllllllllllIIllIlIIIlIIllllllI[lllllllllllllIIllIlIIIlIIlllllII];
            lllllllllllllIIllIlIIIlIlIIIIllI.append((char)(lllllllllllllIIllIlIIIlIlIIIlIIl ^ lllllllllllllIIllIlIIIlIlIIIIlIl[lllllllllllllIIllIlIIIlIlIIIIlII % lllllllllllllIIllIlIIIlIlIIIIlIl.length]));
            "".length();
            ++lllllllllllllIIllIlIIIlIlIIIIlII;
            ++lllllllllllllIIllIlIIIlIIlllllII;
            "".length();
            if ((0x5A ^ 0x5E) < ((0x2 ^ 0x14) & ~(0x30 ^ 0x26))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIlIIIlIlIIIIllI);
    }
    
    private static void llIlIIIIIIlIIIl() {
        (lIIlIlIIlllllI = new int[17])[0] = ((0xE7 ^ 0xAA) & ~(0xD0 ^ 0x9D));
        CommandTitle.lIIlIlIIlllllI[1] = "  ".length();
        CommandTitle.lIIlIlIIlllllI[2] = " ".length();
        CommandTitle.lIIlIlIIlllllI[3] = "   ".length();
        CommandTitle.lIIlIlIIlllllI[4] = (0xB ^ 0xF);
        CommandTitle.lIIlIlIIlllllI[5] = (0x19 ^ 0x1C);
        CommandTitle.lIIlIlIIlllllI[6] = (0x89 ^ 0x8F);
        CommandTitle.lIIlIlIIlllllI[7] = (0x82 ^ 0x85);
        CommandTitle.lIIlIlIIlllllI[8] = (75 + 91 - 131 + 130 ^ 44 + 110 - 35 + 54);
        CommandTitle.lIIlIlIIlllllI[9] = (0x42 ^ 0x2A ^ (0x13 ^ 0x72));
        CommandTitle.lIIlIlIIlllllI[10] = (0x7D ^ 0x2E ^ (0x56 ^ 0xF));
        CommandTitle.lIIlIlIIlllllI[11] = (0x88 ^ 0x83);
        CommandTitle.lIIlIlIIlllllI[12] = (0x44 ^ 0x48);
        CommandTitle.lIIlIlIIlllllI[13] = (0x7D ^ 0x53 ^ (0xA4 ^ 0x87));
        CommandTitle.lIIlIlIIlllllI[14] = (0xDF ^ 0xB5 ^ (0x21 ^ 0x45));
        CommandTitle.lIIlIlIIlllllI[15] = (0x83 ^ 0x8C);
        CommandTitle.lIIlIlIIlllllI[16] = (0x44 ^ 0x54);
    }
}
