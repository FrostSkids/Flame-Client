// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.util.Iterator;
import net.minecraft.entity.Entity;
import java.util.Arrays;
import net.minecraft.util.BlockPos;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.common.collect.Sets;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ChatComponentTranslation;
import org.apache.logging.log4j.LogManager;
import java.util.Set;
import org.apache.logging.log4j.Logger;
import java.util.Map;

public class CommandHandler implements ICommandManager
{
    private static final /* synthetic */ int[] lllllllIIlIIl;
    private final /* synthetic */ Map<String, ICommand> commandMap;
    private static final /* synthetic */ Logger logger;
    private static final /* synthetic */ String[] llllllIlIllIl;
    private final /* synthetic */ Set<ICommand> commandSet;
    
    private static void lIllIIIIllIlIlI() {
        (lllllllIIlIIl = new int[11])[0] = ("  ".length() & ~"  ".length());
        CommandHandler.lllllllIIlIIl[1] = " ".length();
        CommandHandler.lllllllIIlIIl[2] = "  ".length();
        CommandHandler.lllllllIIlIIl[3] = -" ".length();
        CommandHandler.lllllllIIlIIl[4] = "   ".length();
        CommandHandler.lllllllIIlIIl[5] = (100 + 85 - 70 + 83 ^ 64 + 40 - 77 + 167);
        CommandHandler.lllllllIIlIIl[6] = (153 + 55 - 99 + 82 ^ 122 + 121 - 112 + 55);
        CommandHandler.lllllllIIlIIl[7] = (0x54 ^ 0x52);
        CommandHandler.lllllllIIlIIl[8] = (0x1B ^ 0x1C);
        CommandHandler.lllllllIIlIIl[9] = (58 + 111 - 55 + 45 ^ 140 + 145 - 137 + 3);
        CommandHandler.lllllllIIlIIl[10] = (0x76 ^ 0x7F);
    }
    
    @Override
    public Map<String, ICommand> getCommands() {
        return this.commandMap;
    }
    
    private static boolean lIllIIIIllIllII(final Object lllllllllllllIlIlIlIIIIlIIlllIIl) {
        return lllllllllllllIlIlIlIIIIlIIlllIIl == null;
    }
    
    private static boolean lIllIIIIlllIIlI(final int lllllllllllllIlIlIlIIIIlIlIIIIlI, final int lllllllllllllIlIlIlIIIIlIlIIIIIl) {
        return lllllllllllllIlIlIlIIIIlIlIIIIlI < lllllllllllllIlIlIlIIIIlIlIIIIIl;
    }
    
    static {
        lIllIIIIllIlIlI();
        lIllIIIIIlIIIll();
        logger = LogManager.getLogger();
    }
    
    protected boolean tryExecute(final ICommandSender lllllllllllllIlIlIlIIIIlllIIlllI, final String[] lllllllllllllIlIlIlIIIIlllIlIlll, final ICommand lllllllllllllIlIlIlIIIIlllIlIllI, final String lllllllllllllIlIlIlIIIIlllIIlIll) {
        try {
            lllllllllllllIlIlIlIIIIlllIlIllI.processCommand(lllllllllllllIlIlIlIIIIlllIIlllI, lllllllllllllIlIlIlIIIIlllIlIlll);
            return CommandHandler.lllllllIIlIIl[1] != 0;
        }
        catch (WrongUsageException lllllllllllllIlIlIlIIIIlllIlIlII) {
            final String lllllllllllllIlIIlIlllIIlIIIIIlI = CommandHandler.llllllIlIllIl[CommandHandler.lllllllIIlIIl[5]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[CommandHandler.lllllllIIlIIl[1]];
            lllllllllllllIlIIlIlllIIlIIIIIIl[CommandHandler.lllllllIIlIIl[0]] = new ChatComponentTranslation(lllllllllllllIlIlIlIIIIlllIlIlII.getMessage(), lllllllllllllIlIlIlIIIIlllIlIlII.getErrorObjects());
            final ChatComponentTranslation lllllllllllllIlIlIlIIIIlllIlIIll = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl);
            lllllllllllllIlIlIlIIIIlllIlIIll.getChatStyle().setColor(EnumChatFormatting.RED);
            "".length();
            lllllllllllllIlIlIlIIIIlllIIlllI.addChatMessage(lllllllllllllIlIlIlIIIIlllIlIIll);
            "".length();
            if (null != null) {
                return ((117 + 64 - 158 + 123 ^ 50 + 34 + 3 + 80) & (0xD3 ^ 0xB3 ^ (0xD8 ^ 0x8D) ^ -" ".length())) != 0x0;
            }
        }
        catch (CommandException lllllllllllllIlIlIlIIIIlllIlIIlI) {
            final ChatComponentTranslation lllllllllllllIlIlIlIIIIlllIlIIIl = new ChatComponentTranslation(lllllllllllllIlIlIlIIIIlllIlIIlI.getMessage(), lllllllllllllIlIlIlIIIIlllIlIIlI.getErrorObjects());
            lllllllllllllIlIlIlIIIIlllIlIIIl.getChatStyle().setColor(EnumChatFormatting.RED);
            "".length();
            lllllllllllllIlIlIlIIIIlllIIlllI.addChatMessage(lllllllllllllIlIlIlIIIIlllIlIIIl);
            "".length();
            if (" ".length() == "   ".length()) {
                return ((0x3B ^ 0x2A ^ (0x6C ^ 0x43)) & (0x40 ^ 0x16 ^ (0xEF ^ 0x87) ^ -" ".length())) != 0x0;
            }
        }
        catch (Throwable lllllllllllllIlIlIlIIIIlllIlIIII) {
            final ChatComponentTranslation lllllllllllllIlIlIlIIIIlllIIllll = new ChatComponentTranslation(CommandHandler.llllllIlIllIl[CommandHandler.lllllllIIlIIl[6]], new Object[CommandHandler.lllllllIIlIIl[0]]);
            lllllllllllllIlIlIlIIIIlllIIllll.getChatStyle().setColor(EnumChatFormatting.RED);
            "".length();
            lllllllllllllIlIlIlIIIIlllIIlllI.addChatMessage(lllllllllllllIlIlIlIIIIlllIIllll);
            CommandHandler.logger.warn(String.valueOf(new StringBuilder(CommandHandler.llllllIlIllIl[CommandHandler.lllllllIIlIIl[7]]).append(lllllllllllllIlIlIlIIIIlllIIlIll).append(CommandHandler.llllllIlIllIl[CommandHandler.lllllllIIlIIl[8]])));
        }
        return CommandHandler.lllllllIIlIIl[0] != 0;
    }
    
    @Override
    public List<ICommand> getPossibleCommands(final ICommandSender lllllllllllllIlIlIlIIIIllIIIllll) {
        final List<ICommand> lllllllllllllIlIlIlIIIIllIIlIIlI = (List<ICommand>)Lists.newArrayList();
        final int lllllllllllllIlIlIlIIIIllIIIllII = (int)this.commandSet.iterator();
        "".length();
        if (" ".length() < 0) {
            return null;
        }
        while (!lIllIIIIllIlllI(((Iterator)lllllllllllllIlIlIlIIIIllIIIllII).hasNext() ? 1 : 0)) {
            final ICommand lllllllllllllIlIlIlIIIIllIIlIIIl = ((Iterator<ICommand>)lllllllllllllIlIlIlIIIIllIIIllII).next();
            if (lIllIIIIllIlIll(lllllllllllllIlIlIlIIIIllIIlIIIl.canCommandSenderUseCommand(lllllllllllllIlIlIlIIIIllIIIllll) ? 1 : 0)) {
                lllllllllllllIlIlIlIIIIllIIlIIlI.add(lllllllllllllIlIlIlIIIIllIIlIIIl);
                "".length();
            }
        }
        return lllllllllllllIlIlIlIIIIllIIlIIlI;
    }
    
    private int getUsernameIndex(final ICommand lllllllllllllIlIlIlIIIIllIIIIlII, final String[] lllllllllllllIlIlIlIIIIllIIIIIII) {
        if (lIllIIIIllIllII(lllllllllllllIlIlIlIIIIllIIIIlII)) {
            return CommandHandler.lllllllIIlIIl[3];
        }
        int lllllllllllllIlIlIlIIIIllIIIIIlI = CommandHandler.lllllllIIlIIl[0];
        "".length();
        if (null != null) {
            return (0x62 ^ 0xD ^ (0x72 ^ 0x57)) & (0xAC ^ 0x90 ^ (0x57 ^ 0x21) ^ -" ".length());
        }
        while (!lIllIIIIlllIIIl(lllllllllllllIlIlIlIIIIllIIIIIlI, lllllllllllllIlIlIlIIIIllIIIIIII.length)) {
            if (lIllIIIIllIlIll(lllllllllllllIlIlIlIIIIllIIIIlII.isUsernameIndex(lllllllllllllIlIlIlIIIIllIIIIIII, lllllllllllllIlIlIlIIIIllIIIIIlI) ? 1 : 0) && lIllIIIIllIlIll(PlayerSelector.matchesMultiplePlayers(lllllllllllllIlIlIlIIIIllIIIIIII[lllllllllllllIlIlIlIIIIllIIIIIlI]) ? 1 : 0)) {
                return lllllllllllllIlIlIlIIIIllIIIIIlI;
            }
            ++lllllllllllllIlIlIlIIIIllIIIIIlI;
        }
        return CommandHandler.lllllllIIlIIl[3];
    }
    
    public CommandHandler() {
        this.commandMap = (Map<String, ICommand>)Maps.newHashMap();
        this.commandSet = (Set<ICommand>)Sets.newHashSet();
    }
    
    public ICommand registerCommand(final ICommand lllllllllllllIlIlIlIIIIllIlllllI) {
        this.commandMap.put(lllllllllllllIlIlIlIIIIllIlllllI.getCommandName(), lllllllllllllIlIlIlIIIIllIlllllI);
        "".length();
        this.commandSet.add(lllllllllllllIlIlIlIIIIllIlllllI);
        "".length();
        final int lllllllllllllIlIlIlIIIIllIllllII = (int)lllllllllllllIlIlIlIIIIllIlllllI.getCommandAliases().iterator();
        "".length();
        if ((0x91 ^ 0x95) < ((0x19 ^ 0x8) & ~(0xAE ^ 0xBF))) {
            return null;
        }
        while (!lIllIIIIllIlllI(((Iterator)lllllllllllllIlIlIlIIIIllIllllII).hasNext() ? 1 : 0)) {
            final String lllllllllllllIlIlIlIIIIlllIIIIIl = ((Iterator<String>)lllllllllllllIlIlIlIIIIllIllllII).next();
            final ICommand lllllllllllllIlIlIlIIIIlllIIIIII = this.commandMap.get(lllllllllllllIlIlIlIIIIlllIIIIIl);
            if (!lIllIIIIllIllll(lllllllllllllIlIlIlIIIIlllIIIIII) || lIllIIIIllIlllI(lllllllllllllIlIlIlIIIIlllIIIIII.getCommandName().equals(lllllllllllllIlIlIlIIIIlllIIIIIl) ? 1 : 0)) {
                this.commandMap.put(lllllllllllllIlIlIlIIIIlllIIIIIl, lllllllllllllIlIlIlIIIIllIlllllI);
                "".length();
            }
        }
        return lllllllllllllIlIlIlIIIIllIlllllI;
    }
    
    private static String lIllIIIIIlIIIlI(final String lllllllllllllIlIlIlIIIIlIlllIlIl, final String lllllllllllllIlIlIlIIIIlIlllIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlIIIIlIllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIIIIlIlllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIlIIIIlIllllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIlIIIIlIllllIIl.init(CommandHandler.lllllllIIlIIl[2], lllllllllllllIlIlIlIIIIlIllllIlI);
            return new String(lllllllllllllIlIlIlIIIIlIllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIIIIlIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlIIIIlIllllIII) {
            lllllllllllllIlIlIlIIIIlIllllIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIIIIllIllIl(final int lllllllllllllIlIlIlIIIIlIIlllllI, final int lllllllllllllIlIlIlIIIIlIIllllIl) {
        return lllllllllllllIlIlIlIIIIlIIlllllI > lllllllllllllIlIlIlIIIIlIIllllIl;
    }
    
    @Override
    public List<String> getTabCompletionOptions(final ICommandSender lllllllllllllIlIlIlIIIIllIlIlIlI, final String lllllllllllllIlIlIlIIIIllIlIlIIl, final BlockPos lllllllllllllIlIlIlIIIIllIIlllll) {
        final String[] lllllllllllllIlIlIlIIIIllIlIIlll = lllllllllllllIlIlIlIIIIllIlIlIIl.split(CommandHandler.llllllIlIllIl[CommandHandler.lllllllIIlIIl[9]], CommandHandler.lllllllIIlIIl[3]);
        final String lllllllllllllIlIlIlIIIIllIlIIllI = lllllllllllllIlIlIlIIIIllIlIIlll[CommandHandler.lllllllIIlIIl[0]];
        if (!lIllIIIIlllIIII(lllllllllllllIlIlIlIIIIllIlIIlll.length, CommandHandler.lllllllIIlIIl[1])) {
            if (lIllIIIIllIllIl(lllllllllllllIlIlIlIIIIllIlIIlll.length, CommandHandler.lllllllIIlIIl[1])) {
                final ICommand lllllllllllllIlIlIlIIIIllIlIIIll = this.commandMap.get(lllllllllllllIlIlIlIIIIllIlIIllI);
                if (lIllIIIIllIllll(lllllllllllllIlIlIlIIIIllIlIIIll) && lIllIIIIllIlIll(lllllllllllllIlIlIlIIIIllIlIIIll.canCommandSenderUseCommand(lllllllllllllIlIlIlIIIIllIlIlIlI) ? 1 : 0)) {
                    return lllllllllllllIlIlIlIIIIllIlIIIll.addTabCompletionOptions(lllllllllllllIlIlIlIIIIllIlIlIlI, dropFirstString(lllllllllllllIlIlIlIIIIllIlIIlll), lllllllllllllIlIlIlIIIIllIIlllll);
                }
            }
            return null;
        }
        final List<String> lllllllllllllIlIlIlIIIIllIlIIlIl = (List<String>)Lists.newArrayList();
        final float lllllllllllllIlIlIlIIIIllIIllIlI = (float)this.commandMap.entrySet().iterator();
        "".length();
        if ((0x76 ^ 0x72) < 0) {
            return null;
        }
        while (!lIllIIIIllIlllI(((Iterator)lllllllllllllIlIlIlIIIIllIIllIlI).hasNext() ? 1 : 0)) {
            final Map.Entry<String, ICommand> lllllllllllllIlIlIlIIIIllIlIIlII = ((Iterator<Map.Entry<String, ICommand>>)lllllllllllllIlIlIlIIIIllIIllIlI).next();
            if (lIllIIIIllIlIll(CommandBase.doesStringStartWith(lllllllllllllIlIlIlIIIIllIlIIllI, lllllllllllllIlIlIlIIIIllIlIIlII.getKey()) ? 1 : 0) && lIllIIIIllIlIll(lllllllllllllIlIlIlIIIIllIlIIlII.getValue().canCommandSenderUseCommand(lllllllllllllIlIlIlIIIIllIlIlIlI) ? 1 : 0)) {
                lllllllllllllIlIlIlIIIIllIlIIlIl.add(lllllllllllllIlIlIlIIIIllIlIIlII.getKey());
                "".length();
            }
        }
        return lllllllllllllIlIlIlIIIIllIlIIlIl;
    }
    
    private static String[] dropFirstString(final String[] lllllllllllllIlIlIlIIIIllIlllIII) {
        final String[] lllllllllllllIlIlIlIIIIllIllIlll = new String[lllllllllllllIlIlIlIIIIllIlllIII.length - CommandHandler.lllllllIIlIIl[1]];
        System.arraycopy(lllllllllllllIlIlIlIIIIllIlllIII, CommandHandler.lllllllIIlIIl[1], lllllllllllllIlIlIlIIIIllIllIlll, CommandHandler.lllllllIIlIIl[0], lllllllllllllIlIlIlIIIIllIlllIII.length - CommandHandler.lllllllIIlIIl[1]);
        return lllllllllllllIlIlIlIIIIllIllIlll;
    }
    
    private static String lIllIIIIIlIIIIl(String lllllllllllllIlIlIlIIIIlIllIIIlI, final String lllllllllllllIlIlIlIIIIlIllIIIIl) {
        lllllllllllllIlIlIlIIIIlIllIIIlI = new String(Base64.getDecoder().decode(lllllllllllllIlIlIlIIIIlIllIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIlIIIIlIllIIlIl = new StringBuilder();
        final char[] lllllllllllllIlIlIlIIIIlIllIIlII = lllllllllllllIlIlIlIIIIlIllIIIIl.toCharArray();
        int lllllllllllllIlIlIlIIIIlIllIIIll = CommandHandler.lllllllIIlIIl[0];
        final double lllllllllllllIlIlIlIIIIlIlIlllIl = (Object)lllllllllllllIlIlIlIIIIlIllIIIlI.toCharArray();
        final String lllllllllllllIlIlIlIIIIlIlIlllII = (String)lllllllllllllIlIlIlIIIIlIlIlllIl.length;
        char lllllllllllllIlIlIlIIIIlIlIllIll = (char)CommandHandler.lllllllIIlIIl[0];
        while (lIllIIIIlllIIlI(lllllllllllllIlIlIlIIIIlIlIllIll, (int)lllllllllllllIlIlIlIIIIlIlIlllII)) {
            final char lllllllllllllIlIlIlIIIIlIllIlIII = lllllllllllllIlIlIlIIIIlIlIlllIl[lllllllllllllIlIlIlIIIIlIlIllIll];
            lllllllllllllIlIlIlIIIIlIllIIlIl.append((char)(lllllllllllllIlIlIlIIIIlIllIlIII ^ lllllllllllllIlIlIlIIIIlIllIIlII[lllllllllllllIlIlIlIIIIlIllIIIll % lllllllllllllIlIlIlIIIIlIllIIlII.length]));
            "".length();
            ++lllllllllllllIlIlIlIIIIlIllIIIll;
            ++lllllllllllllIlIlIlIIIIlIlIllIll;
            "".length();
            if (("   ".length() & ("   ".length() ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIlIIIIlIllIIlIl);
    }
    
    private static boolean lIllIIIIllIlIll(final int lllllllllllllIlIlIlIIIIlIIllIlll) {
        return lllllllllllllIlIlIlIIIIlIIllIlll != 0;
    }
    
    private static boolean lIllIIIIllIllll(final Object lllllllllllllIlIlIlIIIIlIIlllIll) {
        return lllllllllllllIlIlIlIIIIlIIlllIll != null;
    }
    
    private static boolean lIllIIIIlllIIIl(final int lllllllllllllIlIlIlIIIIlIlIIIllI, final int lllllllllllllIlIlIlIIIIlIlIIIlIl) {
        return lllllllllllllIlIlIlIIIIlIlIIIllI >= lllllllllllllIlIlIlIIIIlIlIIIlIl;
    }
    
    private static String lIllIIIIIlIIIII(final String lllllllllllllIlIlIlIIIIlIlIlIIlI, final String lllllllllllllIlIlIlIIIIlIlIIllll) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlIIIIlIlIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIIIIlIlIIllll.getBytes(StandardCharsets.UTF_8)), CommandHandler.lllllllIIlIIl[9]), "DES");
            final Cipher lllllllllllllIlIlIlIIIIlIlIlIlII = Cipher.getInstance("DES");
            lllllllllllllIlIlIlIIIIlIlIlIlII.init(CommandHandler.lllllllIIlIIl[2], lllllllllllllIlIlIlIIIIlIlIlIlIl);
            return new String(lllllllllllllIlIlIlIIIIlIlIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIIIIlIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlIIIIlIlIlIIll) {
            lllllllllllllIlIlIlIIIIlIlIlIIll.printStackTrace();
            return null;
        }
    }
    
    private static void lIllIIIIIlIIIll() {
        (llllllIlIllIl = new String[CommandHandler.lllllllIIlIIl[10]])[CommandHandler.lllllllIIlIIl[0]] = lIllIIIIIlIIIII("jBynvM5YnQM=", "LQHHh");
        CommandHandler.llllllIlIllIl[CommandHandler.lllllllIIlIIl[1]] = lIllIIIIIlIIIIl("ZA==", "DzeKY");
        CommandHandler.llllllIlIllIl[CommandHandler.lllllllIIlIIl[2]] = lIllIIIIIlIIIIl("NgQAGDY7Dx5bMDAFCAc+NkUDGiMTBBgbMw==", "UkmuW");
        CommandHandler.llllllIlIllIl[CommandHandler.lllllllIIlIIl[4]] = lIllIIIIIlIIIIl("EjcDLAgfPB1vDhQ2CzMAEnYeJBscMR0yAB42", "qXnAi");
        CommandHandler.llllllIlIllIl[CommandHandler.lllllllIIlIIl[5]] = lIllIIIIIlIIIII("Y5Gktgd9tJ15inYgWU3+eM+Y46O39rqF", "PCWfJ");
        CommandHandler.llllllIlIllIl[CommandHandler.lllllllIIlIIl[6]] = lIllIIIIIlIIIII("PUqyNyssHAYtb8SFab5Fx73kzdoKeb0abrB9QaIY/wA=", "VjLsf");
        CommandHandler.llllllIlIllIl[CommandHandler.lllllllIIlIIl[7]] = lIllIIIIIlIIIII("C/hAvs4Eu7htswo0JaPVG5Qhxw3SjpfM66IoUtGaEEg=", "dAKfi");
        CommandHandler.llllllIlIllIl[CommandHandler.lllllllIIlIIl[8]] = lIllIIIIIlIIIlI("H4zR0dkYasA=", "TSXBO");
        CommandHandler.llllllIlIllIl[CommandHandler.lllllllIIlIIl[9]] = lIllIIIIIlIIIII("qqhLu+FP2eU=", "qcJxO");
    }
    
    @Override
    public int executeCommand(final ICommandSender lllllllllllllIlIlIlIIIIlllllIlll, String lllllllllllllIlIlIlIIIIllllIlIIl) {
        lllllllllllllIlIlIlIIIIllllIlIIl = (float)((String)lllllllllllllIlIlIlIIIIllllIlIIl).trim();
        if (lIllIIIIllIlIll(((String)lllllllllllllIlIlIlIIIIllllIlIIl).startsWith(CommandHandler.llllllIlIllIl[CommandHandler.lllllllIIlIIl[0]]) ? 1 : 0)) {
            lllllllllllllIlIlIlIIIIllllIlIIl = (float)((String)lllllllllllllIlIlIlIIIIllllIlIIl).substring(CommandHandler.lllllllIIlIIl[1]);
        }
        String[] lllllllllllllIlIlIlIIIIlllllIlIl = ((String)lllllllllllllIlIlIlIIIIllllIlIIl).split(CommandHandler.llllllIlIllIl[CommandHandler.lllllllIIlIIl[1]]);
        final String lllllllllllllIlIlIlIIIIlllllIlII = lllllllllllllIlIlIlIIIIlllllIlIl[CommandHandler.lllllllIIlIIl[0]];
        lllllllllllllIlIlIlIIIIlllllIlIl = dropFirstString(lllllllllllllIlIlIlIIIIlllllIlIl);
        final ICommand lllllllllllllIlIlIlIIIIlllllIIll = this.commandMap.get(lllllllllllllIlIlIlIIIIlllllIlII);
        final int lllllllllllllIlIlIlIIIIlllllIIlI = this.getUsernameIndex(lllllllllllllIlIlIlIIIIlllllIIll, lllllllllllllIlIlIlIIIIlllllIlIl);
        int lllllllllllllIlIlIlIIIIlllllIIIl = CommandHandler.lllllllIIlIIl[0];
        if (lIllIIIIllIllII(lllllllllllllIlIlIlIIIIlllllIIll)) {
            final ChatComponentTranslation lllllllllllllIlIlIlIIIIlllllIIII = new ChatComponentTranslation(CommandHandler.llllllIlIllIl[CommandHandler.lllllllIIlIIl[2]], new Object[CommandHandler.lllllllIIlIIl[0]]);
            lllllllllllllIlIlIlIIIIlllllIIII.getChatStyle().setColor(EnumChatFormatting.RED);
            "".length();
            lllllllllllllIlIlIlIIIIlllllIlll.addChatMessage(lllllllllllllIlIlIlIIIIlllllIIII);
            "".length();
            if (null != null) {
                return (0xB9 ^ 0x94) & ~(0x90 ^ 0xBD);
            }
        }
        else if (lIllIIIIllIlIll(lllllllllllllIlIlIlIIIIlllllIIll.canCommandSenderUseCommand(lllllllllllllIlIlIlIIIIlllllIlll) ? 1 : 0)) {
            if (lIllIIIIllIllIl(lllllllllllllIlIlIlIIIIlllllIIlI, CommandHandler.lllllllIIlIIl[3])) {
                final List<Entity> lllllllllllllIlIlIlIIIIllllIllll = PlayerSelector.matchEntities(lllllllllllllIlIlIlIIIIlllllIlll, lllllllllllllIlIlIlIIIIlllllIlIl[lllllllllllllIlIlIlIIIIlllllIIlI], (Class<? extends Entity>)Entity.class);
                final String lllllllllllllIlIlIlIIIIllllIlllI = lllllllllllllIlIlIlIIIIlllllIlIl[lllllllllllllIlIlIlIIIIlllllIIlI];
                lllllllllllllIlIlIlIIIIlllllIlll.setCommandStat(CommandResultStats.Type.AFFECTED_ENTITIES, lllllllllllllIlIlIlIIIIllllIllll.size());
                final byte lllllllllllllIlIlIlIIIIllllIIIII = (byte)lllllllllllllIlIlIlIIIIllllIllll.iterator();
                "".length();
                if (((0x4A ^ 0x16 ^ (0xB2 ^ 0xAD)) & (0x6D ^ 0x7E ^ (0x51 ^ 0x1) ^ -" ".length())) != 0x0) {
                    return (0x94 ^ 0x8D ^ (0xEC ^ 0xBF)) & (0x55 ^ 0x50 ^ (0x24 ^ 0x6B) ^ -" ".length());
                }
                while (!lIllIIIIllIlllI(((Iterator)lllllllllllllIlIlIlIIIIllllIIIII).hasNext() ? 1 : 0)) {
                    final Entity lllllllllllllIlIlIlIIIIllllIllIl = ((Iterator<Entity>)lllllllllllllIlIlIlIIIIllllIIIII).next();
                    lllllllllllllIlIlIlIIIIlllllIlIl[lllllllllllllIlIlIlIIIIlllllIIlI] = lllllllllllllIlIlIlIIIIllllIllIl.getUniqueID().toString();
                    if (lIllIIIIllIlIll(this.tryExecute(lllllllllllllIlIlIlIIIIlllllIlll, lllllllllllllIlIlIlIIIIlllllIlIl, lllllllllllllIlIlIlIIIIlllllIIll, (String)lllllllllllllIlIlIlIIIIllllIlIIl) ? 1 : 0)) {
                        ++lllllllllllllIlIlIlIIIIlllllIIIl;
                    }
                }
                lllllllllllllIlIlIlIIIIlllllIlIl[lllllllllllllIlIlIlIIIIlllllIIlI] = lllllllllllllIlIlIlIIIIllllIlllI;
                "".length();
                if (-"  ".length() > 0) {
                    return (0x1E ^ 0x77 ^ (0xF6 ^ 0xBA)) & (18 + 8 + 35 + 78 ^ 111 + 95 - 106 + 74 ^ -" ".length());
                }
            }
            else {
                lllllllllllllIlIlIlIIIIlllllIlll.setCommandStat(CommandResultStats.Type.AFFECTED_ENTITIES, CommandHandler.lllllllIIlIIl[1]);
                if (lIllIIIIllIlIll(this.tryExecute(lllllllllllllIlIlIlIIIIlllllIlll, lllllllllllllIlIlIlIIIIlllllIlIl, lllllllllllllIlIlIlIIIIlllllIIll, (String)lllllllllllllIlIlIlIIIIllllIlIIl) ? 1 : 0)) {
                    ++lllllllllllllIlIlIlIIIIlllllIIIl;
                    "".length();
                    if (((0xDC ^ 0x9C ^ (0x97 ^ 0xC1)) & (0x68 ^ 0x70 ^ (0x54 ^ 0x5A) ^ -" ".length())) != ((0x47 ^ 0x28 ^ (0x6B ^ 0x33)) & (0x90 ^ 0x9B ^ (0x69 ^ 0x55) ^ -" ".length()))) {
                        return (0x5D ^ 0x46 ^ (0x2D ^ 0x11)) & (0x2 ^ 0x55 ^ (0xCF ^ 0xBF) ^ -" ".length());
                    }
                }
            }
        }
        else {
            final ChatComponentTranslation lllllllllllllIlIlIlIIIIllllIllII = new ChatComponentTranslation(CommandHandler.llllllIlIllIl[CommandHandler.lllllllIIlIIl[4]], new Object[CommandHandler.lllllllIIlIIl[0]]);
            lllllllllllllIlIlIlIIIIllllIllII.getChatStyle().setColor(EnumChatFormatting.RED);
            "".length();
            lllllllllllllIlIlIlIIIIlllllIlll.addChatMessage(lllllllllllllIlIlIlIIIIllllIllII);
        }
        lllllllllllllIlIlIlIIIIlllllIlll.setCommandStat(CommandResultStats.Type.SUCCESS_COUNT, lllllllllllllIlIlIlIIIIlllllIIIl);
        return lllllllllllllIlIlIlIIIIlllllIIIl;
    }
    
    private static boolean lIllIIIIllIlllI(final int lllllllllllllIlIlIlIIIIlIIllIlIl) {
        return lllllllllllllIlIlIlIIIIlIIllIlIl == 0;
    }
    
    private static boolean lIllIIIIlllIIII(final int lllllllllllllIlIlIlIIIIlIlIIlIlI, final int lllllllllllllIlIlIlIIIIlIlIIlIIl) {
        return lllllllllllllIlIlIlIIIIlIlIIlIlI == lllllllllllllIlIlIlIIIIlIlIIlIIl;
    }
}
