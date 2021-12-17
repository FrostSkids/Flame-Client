// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.util.Iterator;
import net.minecraft.scoreboard.Score;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.IScoreObjectiveCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import com.google.common.collect.Lists;
import net.minecraft.server.MinecraftServer;
import java.util.List;
import net.minecraft.util.BlockPos;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class CommandTrigger extends CommandBase
{
    private static final /* synthetic */ int[] lIlIlIlIlIllll;
    private static final /* synthetic */ String[] lIlIlIlIlIlIll;
    
    private static boolean lllIlllIlIIlllI(final int lllllllllllllIIIlIIIIIllIllIIIII, final int lllllllllllllIIIlIIIIIllIlIlllll) {
        return lllllllllllllIIIlIIIIIllIllIIIII == lllllllllllllIIIlIIIIIllIlIlllll;
    }
    
    private static boolean lllIlllIlIIllII(final Object lllllllllllllIIIlIIIIIllIlIllIIl) {
        return lllllllllllllIIIlIIIIIllIlIllIIl != null;
    }
    
    static {
        lllIlllIlIIlIII();
        lllIlllIlIIIIII();
    }
    
    @Override
    public String getCommandName() {
        return CommandTrigger.lIlIlIlIlIlIll[CommandTrigger.lIlIlIlIlIllll[0]];
    }
    
    private static void lllIlllIlIIlIII() {
        (lIlIlIlIlIllll = new int[14])[0] = ("  ".length() & ("  ".length() ^ -" ".length()));
        CommandTrigger.lIlIlIlIlIllll[1] = " ".length();
        CommandTrigger.lIlIlIlIlIllll[2] = "   ".length();
        CommandTrigger.lIlIlIlIlIllll[3] = "  ".length();
        CommandTrigger.lIlIlIlIlIllll[4] = (0xAD ^ 0xA9);
        CommandTrigger.lIlIlIlIlIllll[5] = (0x18 ^ 0x1D);
        CommandTrigger.lIlIlIlIlIllll[6] = (0x66 ^ 0x20 ^ (0xD8 ^ 0x98));
        CommandTrigger.lIlIlIlIlIllll[7] = (93 + 35 - 5 + 7 ^ 31 + 60 - 73 + 115);
        CommandTrigger.lIlIlIlIlIllll[8] = (0x5 ^ 0x32 ^ (0xFF ^ 0xC0));
        CommandTrigger.lIlIlIlIlIllll[9] = (0xB7 ^ 0xBE);
        CommandTrigger.lIlIlIlIlIllll[10] = (0xCF ^ 0xC5);
        CommandTrigger.lIlIlIlIlIllll[11] = (0x64 ^ 0x6F);
        CommandTrigger.lIlIlIlIlIllll[12] = (0x34 ^ 0x38);
        CommandTrigger.lIlIlIlIlIllll[13] = (0x8C ^ 0xBC ^ (0x7C ^ 0x41));
    }
    
    private static boolean lllIlllIlIIlIll(final int lllllllllllllIIIlIIIIIllIlIlIIIl) {
        return lllllllllllllIIIlIIIIIllIlIlIIIl == 0;
    }
    
    private static void lllIlllIlIIIIII() {
        (lIlIlIlIlIlIll = new String[CommandTrigger.lIlIlIlIlIllll[13]])[CommandTrigger.lIlIlIlIlIllll[0]] = lllIlllIIllllIl("cpBEsfIy5dg=", "Feknl");
        CommandTrigger.lIlIlIlIlIlIll[CommandTrigger.lIlIlIlIlIllll[1]] = lllIlllIIlllllI("DycDIjYCLB1hIx4hCSgyHmYbPDYLLQ==", "lHnOW");
        CommandTrigger.lIlIlIlIlIlIll[CommandTrigger.lIlIlIlIlIllll[3]] = lllIlllIIlllllI("BTokLgUIMTptEBQ8LiQBFHs8MAUBMA==", "fUICd");
        CommandTrigger.lIlIlIlIlIlIll[CommandTrigger.lIlIlIlIlIllll[2]] = lllIlllIIllllIl("r1fZBV2SVvyhToewtiKuh/wUE3AShKGZond6UlRH64Q=", "OtLuD");
        CommandTrigger.lIlIlIlIlIlIll[CommandTrigger.lIlIlIlIlIllll[4]] = lllIlllIIllllll("Z6C4cnGWse/pDQHAKZk0gfknC7hhARH0frnX6rm+vEwFyxTNc4vIEA==", "WGoVG");
        CommandTrigger.lIlIlIlIlIlIll[CommandTrigger.lIlIlIlIlIllll[5]] = lllIlllIIllllll("3W6pFZ36aHIJi6neafypYft9tWReDxlyWbSpBy1gZa8=", "zQVHO");
        CommandTrigger.lIlIlIlIlIlIll[CommandTrigger.lIlIlIlIlIllll[6]] = lllIlllIIlllllI("BSY2", "vCBNg");
        CommandTrigger.lIlIlIlIlIlIll[CommandTrigger.lIlIlIlIlIllll[7]] = lllIlllIIlllllI("DxET", "nuwAk");
        CommandTrigger.lIlIlIlIlIlIll[CommandTrigger.lIlIlIlIlIllll[8]] = lllIlllIIlllllI("IiMYIg4vKAZhGzMlEigKM2IcIRkgIBwrIi4oEA==", "ALuOo");
        CommandTrigger.lIlIlIlIlIlIll[CommandTrigger.lIlIlIlIlIllll[9]] = lllIlllIIllllll("gpKZErlZy8YgmKxeSLVDFgkr1iSeQXKbItGYN5B88XM=", "GqRUL");
        CommandTrigger.lIlIlIlIlIlIll[CommandTrigger.lIlIlIlIlIllll[10]] = lllIlllIIllllIl("caCNafle+4kWKH2pCimR7o0vbr7UPrG7Lq3pQhPemg8tfbwHDGxwxA==", "deEWm");
        CommandTrigger.lIlIlIlIlIlIll[CommandTrigger.lIlIlIlIlIllll[11]] = lllIlllIIllllIl("P5QLI8Wi2ko=", "SgJFa");
        CommandTrigger.lIlIlIlIlIlIll[CommandTrigger.lIlIlIlIlIllll[12]] = lllIlllIIlllllI("Ciw+", "yIJTL");
    }
    
    private static boolean lllIlllIlIIlIIl(final int lllllllllllllIIIlIIIIIllIlIlllII, final int lllllllllllllIIIlIIIIIllIlIllIll) {
        return lllllllllllllIIIlIIIIIllIlIlllII < lllllllllllllIIIlIIIIIllIlIllIll;
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandTrigger.lIlIlIlIlIllll[0];
    }
    
    private static String lllIlllIIlllllI(String lllllllllllllIIIlIIIIIllIllIlIll, final String lllllllllllllIIIlIIIIIllIllIllll) {
        lllllllllllllIIIlIIIIIllIllIlIll = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlIIIIIllIllIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIIIIIllIllIlllI = new StringBuilder();
        final char[] lllllllllllllIIIlIIIIIllIllIllIl = lllllllllllllIIIlIIIIIllIllIllll.toCharArray();
        int lllllllllllllIIIlIIIIIllIllIllII = CommandTrigger.lIlIlIlIlIllll[0];
        final String lllllllllllllIIIlIIIIIllIllIIllI = (Object)((String)lllllllllllllIIIlIIIIIllIllIlIll).toCharArray();
        final int lllllllllllllIIIlIIIIIllIllIIlIl = lllllllllllllIIIlIIIIIllIllIIllI.length;
        byte lllllllllllllIIIlIIIIIllIllIIlII = (byte)CommandTrigger.lIlIlIlIlIllll[0];
        while (lllIlllIlIIlIIl(lllllllllllllIIIlIIIIIllIllIIlII, lllllllllllllIIIlIIIIIllIllIIlIl)) {
            final char lllllllllllllIIIlIIIIIllIlllIIIl = lllllllllllllIIIlIIIIIllIllIIllI[lllllllllllllIIIlIIIIIllIllIIlII];
            lllllllllllllIIIlIIIIIllIllIlllI.append((char)(lllllllllllllIIIlIIIIIllIlllIIIl ^ lllllllllllllIIIlIIIIIllIllIllIl[lllllllllllllIIIlIIIIIllIllIllII % lllllllllllllIIIlIIIIIllIllIllIl.length]));
            "".length();
            ++lllllllllllllIIIlIIIIIllIllIllII;
            ++lllllllllllllIIIlIIIIIllIllIIlII;
            "".length();
            if (-" ".length() > "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIIIIIllIllIlllI);
    }
    
    private static boolean lllIlllIlIIllIl(final Object lllllllllllllIIIlIIIIIllIlIlIllI, final Object lllllllllllllIIIlIIIIIllIlIlIlIl) {
        return lllllllllllllIIIlIIIIIllIlIlIllI == lllllllllllllIIIlIIIIIllIlIlIlIl;
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIIIlIIIIIlllIIlllll, final String[] lllllllllllllIIIlIIIIIlllIIllllI, final BlockPos lllllllllllllIIIlIIIIIlllIIlllIl) {
        if (!lllIlllIlIIlllI(lllllllllllllIIIlIIIIIlllIIllllI.length, CommandTrigger.lIlIlIlIlIllll[1])) {
            List<String> listOfStringsMatchingLastWord;
            if (lllIlllIlIIlllI(lllllllllllllIIIlIIIIIlllIIllllI.length, CommandTrigger.lIlIlIlIlIllll[3])) {
                final String[] lllllllllllllIIIIlIlllIIIllIllII = new String[CommandTrigger.lIlIlIlIlIllll[3]];
                lllllllllllllIIIIlIlllIIIllIllII[CommandTrigger.lIlIlIlIlIllll[0]] = CommandTrigger.lIlIlIlIlIlIll[CommandTrigger.lIlIlIlIlIllll[11]];
                lllllllllllllIIIIlIlllIIIllIllII[CommandTrigger.lIlIlIlIlIllll[1]] = CommandTrigger.lIlIlIlIlIlIll[CommandTrigger.lIlIlIlIlIllll[12]];
                listOfStringsMatchingLastWord = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIIlIIIIIlllIIllllI, lllllllllllllIIIIlIlllIIIllIllII);
                "".length();
                if ((0xC7 ^ 0xC3) == -" ".length()) {
                    return null;
                }
            }
            else {
                listOfStringsMatchingLastWord = null;
            }
            return listOfStringsMatchingLastWord;
        }
        final Scoreboard lllllllllllllIIIlIIIIIlllIIlllII = MinecraftServer.getServer().worldServerForDimension(CommandTrigger.lIlIlIlIlIllll[0]).getScoreboard();
        final List<String> lllllllllllllIIIlIIIIIlllIIllIll = (List<String>)Lists.newArrayList();
        final long lllllllllllllIIIlIIIIIlllIIlIlIl = (long)lllllllllllllIIIlIIIIIlllIIlllII.getScoreObjectives().iterator();
        "".length();
        if (null != null) {
            return null;
        }
        while (!lllIlllIlIIlIll(((Iterator)lllllllllllllIIIlIIIIIlllIIlIlIl).hasNext() ? 1 : 0)) {
            final ScoreObjective lllllllllllllIIIlIIIIIlllIIllIlI = ((Iterator<ScoreObjective>)lllllllllllllIIIlIIIIIlllIIlIlIl).next();
            if (lllIlllIlIIllIl(lllllllllllllIIIlIIIIIlllIIllIlI.getCriteria(), IScoreObjectiveCriteria.TRIGGER)) {
                lllllllllllllIIIlIIIIIlllIIllIll.add(lllllllllllllIIIlIIIIIlllIIllIlI.getName());
                "".length();
            }
        }
        return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIIlIIIIIlllIIllllI, (String[])lllllllllllllIIIlIIIIIlllIIllIll.toArray(new String[lllllllllllllIIIlIIIIIlllIIllIll.size()]));
    }
    
    private static String lllIlllIIllllll(final String lllllllllllllIIIlIIIIIlllIIIlIll, final String lllllllllllllIIIlIIIIIlllIIIllII) {
        try {
            final SecretKeySpec lllllllllllllIIIlIIIIIlllIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIIIIlllIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIIIIIlllIIIllll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIIIIIlllIIIllll.init(CommandTrigger.lIlIlIlIlIllll[3], lllllllllllllIIIlIIIIIlllIIlIIII);
            return new String(lllllllllllllIIIlIIIIIlllIIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIIIIlllIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIIIIIlllIIIlllI) {
            lllllllllllllIIIlIIIIIlllIIIlllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIIIlIIIIIllllIIIIII) {
        return CommandTrigger.lIlIlIlIlIlIll[CommandTrigger.lIlIlIlIlIllll[1]];
    }
    
    private static String lllIlllIIllllIl(final String lllllllllllllIIIlIIIIIllIllllllI, final String lllllllllllllIIIlIIIIIllIlllllll) {
        try {
            final SecretKeySpec lllllllllllllIIIlIIIIIlllIIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIIIIllIlllllll.getBytes(StandardCharsets.UTF_8)), CommandTrigger.lIlIlIlIlIllll[8]), "DES");
            final Cipher lllllllllllllIIIlIIIIIlllIIIIIlI = Cipher.getInstance("DES");
            lllllllllllllIIIlIIIIIlllIIIIIlI.init(CommandTrigger.lIlIlIlIlIllll[3], lllllllllllllIIIlIIIIIlllIIIIIll);
            return new String(lllllllllllllIIIlIIIIIlllIIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIIIIllIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIIIIIlllIIIIIIl) {
            lllllllllllllIIIlIIIIIlllIIIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIlllIlIIlIlI(final int lllllllllllllIIIlIIIIIllIlIlIIll) {
        return lllllllllllllIIIlIIIIIllIlIlIIll != 0;
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIIIlIIIIIlllIllIllI, final String[] lllllllllllllIIIlIIIIIlllIllIlIl) throws CommandException {
        if (lllIlllIlIIlIIl(lllllllllllllIIIlIIIIIlllIllIlIl.length, CommandTrigger.lIlIlIlIlIllll[2])) {
            throw new WrongUsageException(CommandTrigger.lIlIlIlIlIlIll[CommandTrigger.lIlIlIlIlIllll[3]], new Object[CommandTrigger.lIlIlIlIlIllll[0]]);
        }
        EntityPlayerMP lllllllllllllIIIlIIIIIlllIllIIll = null;
        if (lllIlllIlIIlIlI((lllllllllllllIIIlIIIIIlllIllIllI instanceof EntityPlayerMP) ? 1 : 0)) {
            final EntityPlayerMP lllllllllllllIIIlIIIIIlllIllIlII = (EntityPlayerMP)lllllllllllllIIIlIIIIIlllIllIllI;
            "".length();
            if ((0x4D ^ 0x64 ^ (0xB7 ^ 0x9A)) < 0) {
                return;
            }
        }
        else {
            final Entity lllllllllllllIIIlIIIIIlllIllIIlI = lllllllllllllIIIlIIIIIlllIllIllI.getCommandSenderEntity();
            if (lllIlllIlIIlIll((lllllllllllllIIIlIIIIIlllIllIIlI instanceof EntityPlayerMP) ? 1 : 0)) {
                throw new CommandException(CommandTrigger.lIlIlIlIlIlIll[CommandTrigger.lIlIlIlIlIllll[2]], new Object[CommandTrigger.lIlIlIlIlIllll[0]]);
            }
            lllllllllllllIIIlIIIIIlllIllIIll = (EntityPlayerMP)lllllllllllllIIIlIIIIIlllIllIIlI;
        }
        final Scoreboard lllllllllllllIIIlIIIIIlllIllIIIl = MinecraftServer.getServer().worldServerForDimension(CommandTrigger.lIlIlIlIlIllll[0]).getScoreboard();
        final ScoreObjective lllllllllllllIIIlIIIIIlllIllIIII = lllllllllllllIIIlIIIIIlllIllIIIl.getObjective(lllllllllllllIIIlIIIIIlllIllIlIl[CommandTrigger.lIlIlIlIlIllll[0]]);
        if (!lllIlllIlIIllII(lllllllllllllIIIlIIIIIlllIllIIII) || !lllIlllIlIIllIl(lllllllllllllIIIlIIIIIlllIllIIII.getCriteria(), IScoreObjectiveCriteria.TRIGGER)) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandTrigger.lIlIlIlIlIlIll[CommandTrigger.lIlIlIlIlIllll[10]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandTrigger.lIlIlIlIlIllll[1]];
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandTrigger.lIlIlIlIlIllll[0]] = lllllllllllllIIIlIIIIIlllIllIlIl[CommandTrigger.lIlIlIlIlIllll[0]];
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
        }
        final int lllllllllllllIIIlIIIIIlllIlIllll = CommandBase.parseInt(lllllllllllllIIIlIIIIIlllIllIlIl[CommandTrigger.lIlIlIlIlIllll[3]]);
        if (lllIlllIlIIlIll(lllllllllllllIIIlIIIIIlllIllIIIl.entityHasObjective(lllllllllllllIIIlIIIIIlllIllIIll.getName(), lllllllllllllIIIlIIIIIlllIllIIII) ? 1 : 0)) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl2 = CommandTrigger.lIlIlIlIlIlIll[CommandTrigger.lIlIlIlIlIllll[4]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl2 = new Object[CommandTrigger.lIlIlIlIlIllll[1]];
            lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandTrigger.lIlIlIlIlIllll[0]] = lllllllllllllIIIlIIIIIlllIllIlIl[CommandTrigger.lIlIlIlIlIllll[0]];
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl2, lllllllllllllIlIIIIIIlIlIllIIlIl2);
        }
        final Score lllllllllllllIIIlIIIIIlllIlIlllI = lllllllllllllIIIlIIIIIlllIllIIIl.getValueFromObjective(lllllllllllllIIIlIIIIIlllIllIIll.getName(), lllllllllllllIIIlIIIIIlllIllIIII);
        if (lllIlllIlIIlIlI(lllllllllllllIIIlIIIIIlllIlIlllI.isLocked() ? 1 : 0)) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl3 = CommandTrigger.lIlIlIlIlIlIll[CommandTrigger.lIlIlIlIlIllll[5]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl3 = new Object[CommandTrigger.lIlIlIlIlIllll[1]];
            lllllllllllllIlIIIIIIlIlIllIIlIl3[CommandTrigger.lIlIlIlIlIllll[0]] = lllllllllllllIIIlIIIIIlllIllIlIl[CommandTrigger.lIlIlIlIlIllll[0]];
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl3, lllllllllllllIlIIIIIIlIlIllIIlIl3);
        }
        if (lllIlllIlIIlIlI(CommandTrigger.lIlIlIlIlIlIll[CommandTrigger.lIlIlIlIlIllll[6]].equals(lllllllllllllIIIlIIIIIlllIllIlIl[CommandTrigger.lIlIlIlIlIllll[1]]) ? 1 : 0)) {
            lllllllllllllIIIlIIIIIlllIlIlllI.setScorePoints(lllllllllllllIIIlIIIIIlllIlIllll);
            "".length();
            if (((0xA ^ 0x6F ^ (0xA7 ^ 0x80)) & (0xA ^ 0x3D ^ (0xF3 ^ 0x86) ^ -" ".length())) < ((143 + 14 - 146 + 182 ^ 9 + 83 - 73 + 115) & (0x36 ^ 0x60 ^ (0xBF ^ 0xAE) ^ -" ".length()))) {
                return;
            }
        }
        else {
            if (lllIlllIlIIlIll(CommandTrigger.lIlIlIlIlIlIll[CommandTrigger.lIlIlIlIlIllll[7]].equals(lllllllllllllIIIlIIIIIlllIllIlIl[CommandTrigger.lIlIlIlIlIllll[1]]) ? 1 : 0)) {
                final String lllllllllllllIlIIIIIIlIlIllIlIIl4 = CommandTrigger.lIlIlIlIlIlIll[CommandTrigger.lIlIlIlIlIllll[8]];
                final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl4 = new Object[CommandTrigger.lIlIlIlIlIllll[1]];
                lllllllllllllIlIIIIIIlIlIllIIlIl4[CommandTrigger.lIlIlIlIlIllll[0]] = lllllllllllllIIIlIIIIIlllIllIlIl[CommandTrigger.lIlIlIlIlIllll[1]];
                throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl4, lllllllllllllIlIIIIIIlIlIllIIlIl4);
            }
            lllllllllllllIIIlIIIIIlllIlIlllI.increseScore(lllllllllllllIIIlIIIIIlllIlIllll);
        }
        lllllllllllllIIIlIIIIIlllIlIlllI.setLocked((boolean)(CommandTrigger.lIlIlIlIlIllll[1] != 0));
        if (lllIlllIlIIlIlI(lllllllllllllIIIlIIIIIlllIllIIll.theItemInWorldManager.isCreative() ? 1 : 0)) {
            final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandTrigger.lIlIlIlIlIlIll[CommandTrigger.lIlIlIlIlIllll[9]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandTrigger.lIlIlIlIlIllll[2]];
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandTrigger.lIlIlIlIlIllll[0]] = lllllllllllllIIIlIIIIIlllIllIlIl[CommandTrigger.lIlIlIlIlIllll[0]];
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandTrigger.lIlIlIlIlIllll[1]] = lllllllllllllIIIlIIIIIlllIllIlIl[CommandTrigger.lIlIlIlIlIllll[1]];
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandTrigger.lIlIlIlIlIllll[3]] = lllllllllllllIIIlIIIIIlllIllIlIl[CommandTrigger.lIlIlIlIlIllll[3]];
            CommandBase.notifyOperators(lllllllllllllIIIlIIIIIlllIllIllI, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        }
    }
}
