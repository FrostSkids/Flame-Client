// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.util.Collections;
import java.util.Set;
import net.minecraft.util.BlockPos;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.event.ClickEvent;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.MathHelper;
import net.minecraft.server.MinecraftServer;
import java.util.Map;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class CommandHelp extends CommandBase
{
    private static final /* synthetic */ String[] lIllIlIllllIIl;
    private static final /* synthetic */ int[] lIllIlIllllIlI;
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandHelp.lIllIlIllllIlI[0];
    }
    
    @Override
    public String getCommandName() {
        return CommandHelp.lIllIlIllllIIl[CommandHelp.lIllIlIllllIlI[0]];
    }
    
    private static boolean lllllllIlIlIIlI(final int llllllllllllIlllllllIlllIIIlIllI, final int llllllllllllIlllllllIlllIIIlIlIl) {
        return llllllllllllIlllllllIlllIIIlIllI == llllllllllllIlllllllIlllIIIlIlIl;
    }
    
    private static String lllllllIlIIlIII(final String llllllllllllIlllllllIlllIIIllllI, final String llllllllllllIlllllllIlllIIIllIll) {
        try {
            final SecretKeySpec llllllllllllIlllllllIlllIIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllllIlllIIIllIll.getBytes(StandardCharsets.UTF_8)), CommandHelp.lIllIlIllllIlI[9]), "DES");
            final Cipher llllllllllllIlllllllIlllIIlIIIII = Cipher.getInstance("DES");
            llllllllllllIlllllllIlllIIlIIIII.init(CommandHelp.lIllIlIllllIlI[2], llllllllllllIlllllllIlllIIlIIIIl);
            return new String(llllllllllllIlllllllIlllIIlIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllllllIlllIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllllIlllIIIlllll) {
            llllllllllllIlllllllIlllIIIlllll.printStackTrace();
            return null;
        }
    }
    
    protected Map<String, ICommand> getCommands() {
        return MinecraftServer.getServer().getCommandManager().getCommands();
    }
    
    private static boolean lllllllIlIIllIl(final int llllllllllllIlllllllIlllIIIIIlll) {
        return llllllllllllIlllllllIlllIIIIIlll == 0;
    }
    
    private static void lllllllIlIIllII() {
        (lIllIlIllllIlI = new int[10])[0] = ((0xD1 ^ 0xA5 ^ (0x5D ^ 0x38)) & (79 + 106 - 53 + 38 ^ 86 + 159 - 191 + 133 ^ -" ".length()));
        CommandHelp.lIllIlIllllIlI[1] = " ".length();
        CommandHelp.lIllIlIllllIlI[2] = "  ".length();
        CommandHelp.lIllIlIllllIlI[3] = (99 + 133 - 142 + 95 ^ 167 + 156 - 253 + 120);
        CommandHelp.lIllIlIllllIlI[4] = -" ".length();
        CommandHelp.lIllIlIllllIlI[5] = "   ".length();
        CommandHelp.lIllIlIllllIlI[6] = (0x20 ^ 0x36 ^ (0x87 ^ 0x95));
        CommandHelp.lIllIlIllllIlI[7] = (0x7C ^ 0x5A ^ (0x79 ^ 0x5A));
        CommandHelp.lIllIlIllllIlI[8] = (0x63 ^ 0x65);
        CommandHelp.lIllIlIllllIlI[9] = (107 + 17 - 116 + 181 ^ 154 + 54 - 83 + 56);
    }
    
    private static String lllllllIlIIlIIl(String llllllllllllIlllllllIlllIIlIlllI, final String llllllllllllIlllllllIlllIIlIllIl) {
        llllllllllllIlllllllIlllIIlIlllI = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIlllllllIlllIIlIlllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllllIlllIIllIIIl = new StringBuilder();
        final char[] llllllllllllIlllllllIlllIIllIIII = llllllllllllIlllllllIlllIIlIllIl.toCharArray();
        int llllllllllllIlllllllIlllIIlIllll = CommandHelp.lIllIlIllllIlI[0];
        final byte llllllllllllIlllllllIlllIIlIlIIl = (Object)((String)llllllllllllIlllllllIlllIIlIlllI).toCharArray();
        final short llllllllllllIlllllllIlllIIlIlIII = (short)llllllllllllIlllllllIlllIIlIlIIl.length;
        float llllllllllllIlllllllIlllIIlIIlll = CommandHelp.lIllIlIllllIlI[0];
        while (lllllllIlIlIIll((int)llllllllllllIlllllllIlllIIlIIlll, llllllllllllIlllllllIlllIIlIlIII)) {
            final char llllllllllllIlllllllIlllIIllIlII = llllllllllllIlllllllIlllIIlIlIIl[llllllllllllIlllllllIlllIIlIIlll];
            llllllllllllIlllllllIlllIIllIIIl.append((char)(llllllllllllIlllllllIlllIIllIlII ^ llllllllllllIlllllllIlllIIllIIII[llllllllllllIlllllllIlllIIlIllll % llllllllllllIlllllllIlllIIllIIII.length]));
            "".length();
            ++llllllllllllIlllllllIlllIIlIllll;
            ++llllllllllllIlllllllIlllIIlIIlll;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllllIlllIIllIIIl);
    }
    
    private static boolean lllllllIlIlIIIl(final int llllllllllllIlllllllIlllIIIIlIIl) {
        return llllllllllllIlllllllIlllIIIIlIIl != 0;
    }
    
    private static void lllllllIlIIlIll() {
        (lIllIlIllllIIl = new String[CommandHelp.lIllIlIllllIlI[3]])[CommandHelp.lIllIlIllllIlI[0]] = lllllllIlIIlIII("jvFbZEjipXo=", "xZcZC");
        CommandHelp.lIllIlIllllIIl[CommandHelp.lIllIlIllllIlI[1]] = lllllllIlIIlIIl("LAUqFzkhDjRUMCoGN1QtPAsgHw==", "OjGzX");
        CommandHelp.lIllIlIllllIIl[CommandHelp.lIllIlIllllIlI[2]] = lllllllIlIIlIII("Li+yO2lB5AI=", "olnCt");
        CommandHelp.lIllIlIllllIIl[CommandHelp.lIllIlIllllIlI[5]] = lllllllIlIIlIlI("xt/9tLMG0fT1G4C/aiWYZLyTQb1wj5jN", "nVVYh");
        CommandHelp.lIllIlIllllIIl[CommandHelp.lIllIlIllllIlI[6]] = lllllllIlIIlIII("K7/SVqyyBcQ=", "mJqbY");
        CommandHelp.lIllIlIllllIIl[CommandHelp.lIllIlIllllIlI[7]] = lllllllIlIIlIlI("x9vQlVR/i7c=", "rhHff");
        CommandHelp.lIllIlIllllIIl[CommandHelp.lIllIlIllllIlI[8]] = lllllllIlIIlIlI("AIWCAqgk7N3DmAp1dnIAENQfkDXigMpx", "TzrTZ");
    }
    
    private static boolean lllllllIlIlIIll(final int llllllllllllIlllllllIlllIIIIlllI, final int llllllllllllIlllllllIlllIIIIllIl) {
        return llllllllllllIlllllllIlllIIIIlllI < llllllllllllIlllllllIlllIIIIllIl;
    }
    
    @Override
    public String getCommandUsage(final ICommandSender llllllllllllIlllllllIllllIIIIlll) {
        return CommandHelp.lIllIlIllllIIl[CommandHelp.lIllIlIllllIlI[1]];
    }
    
    @Override
    public void processCommand(final ICommandSender llllllllllllIlllllllIlllIllllIII, final String[] llllllllllllIlllllllIlllIllIIlll) throws CommandException {
        final List<ICommand> llllllllllllIlllllllIlllIlllIllI = this.getSortedPossibleCommands(llllllllllllIlllllllIlllIllllIII);
        final int llllllllllllIlllllllIlllIlllIlIl = CommandHelp.lIllIlIllllIlI[3];
        final int llllllllllllIlllllllIlllIlllIlII = (llllllllllllIlllllllIlllIlllIllI.size() - CommandHelp.lIllIlIllllIlI[1]) / CommandHelp.lIllIlIllllIlI[3];
        int llllllllllllIlllllllIlllIlllIIll = CommandHelp.lIllIlIllllIlI[0];
        try {
            int n;
            if (lllllllIlIIllIl(llllllllllllIlllllllIlllIllIIlll.length)) {
                n = CommandHelp.lIllIlIllllIlI[0];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                n = CommandBase.parseInt(llllllllllllIlllllllIlllIllIIlll[CommandHelp.lIllIlIllllIlI[0]], CommandHelp.lIllIlIllllIlI[1], llllllllllllIlllllllIlllIlllIlII + CommandHelp.lIllIlIllllIlI[1]) - CommandHelp.lIllIlIllllIlI[1];
            }
            llllllllllllIlllllllIlllIlllIIll = n;
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (NumberInvalidException llllllllllllIlllllllIlllIlllIIlI) {
            final Map<String, ICommand> llllllllllllIlllllllIlllIlllIIIl = this.getCommands();
            final ICommand llllllllllllIlllllllIlllIlllIIII = llllllllllllIlllllllIlllIlllIIIl.get(llllllllllllIlllllllIlllIllIIlll[CommandHelp.lIllIlIllllIlI[0]]);
            if (lllllllIlIIlllI(llllllllllllIlllllllIlllIlllIIII)) {
                throw new WrongUsageException(llllllllllllIlllllllIlllIlllIIII.getCommandUsage(llllllllllllIlllllllIlllIllllIII), new Object[CommandHelp.lIllIlIllllIlI[0]]);
            }
            if (lllllllIlIIllll(MathHelper.parseIntWithDefault(llllllllllllIlllllllIlllIllIIlll[CommandHelp.lIllIlIllllIlI[0]], CommandHelp.lIllIlIllllIlI[4]), CommandHelp.lIllIlIllllIlI[4])) {
                throw llllllllllllIlllllllIlllIlllIIlI;
            }
            throw new CommandNotFoundException();
        }
        final int llllllllllllIlllllllIlllIllIllll = Math.min((llllllllllllIlllllllIlllIlllIIll + CommandHelp.lIllIlIllllIlI[1]) * CommandHelp.lIllIlIllllIlI[3], llllllllllllIlllllllIlllIlllIllI.size());
        final String lllllllllllllIlIIlIlllIIlIIIIIlI = CommandHelp.lIllIlIllllIIl[CommandHelp.lIllIlIllllIlI[5]];
        final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[CommandHelp.lIllIlIllllIlI[2]];
        lllllllllllllIlIIlIlllIIlIIIIIIl[CommandHelp.lIllIlIllllIlI[0]] = llllllllllllIlllllllIlllIlllIIll + CommandHelp.lIllIlIllllIlI[1];
        lllllllllllllIlIIlIlllIIlIIIIIIl[CommandHelp.lIllIlIllllIlI[1]] = llllllllllllIlllllllIlllIlllIlII + CommandHelp.lIllIlIllllIlI[1];
        final ChatComponentTranslation llllllllllllIlllllllIlllIllIlllI = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl);
        llllllllllllIlllllllIlllIllIlllI.getChatStyle().setColor(EnumChatFormatting.DARK_GREEN);
        "".length();
        llllllllllllIlllllllIlllIllllIII.addChatMessage(llllllllllllIlllllllIlllIllIlllI);
        int llllllllllllIlllllllIlllIllIllIl = llllllllllllIlllllllIlllIlllIIll * CommandHelp.lIllIlIllllIlI[3];
        "".length();
        if (-"   ".length() > 0) {
            return;
        }
        while (!lllllllIlIlIIII(llllllllllllIlllllllIlllIllIllIl, llllllllllllIlllllllIlllIllIllll)) {
            final ICommand llllllllllllIlllllllIlllIllIllII = llllllllllllIlllllllIlllIlllIllI.get(llllllllllllIlllllllIlllIllIllIl);
            final ChatComponentTranslation llllllllllllIlllllllIlllIllIlIll = new ChatComponentTranslation(llllllllllllIlllllllIlllIllIllII.getCommandUsage(llllllllllllIlllllllIlllIllllIII), new Object[CommandHelp.lIllIlIllllIlI[0]]);
            llllllllllllIlllllllIlllIllIlIll.getChatStyle().setChatClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, String.valueOf(new StringBuilder(CommandHelp.lIllIlIllllIIl[CommandHelp.lIllIlIllllIlI[6]]).append(llllllllllllIlllllllIlllIllIllII.getCommandName()).append(CommandHelp.lIllIlIllllIIl[CommandHelp.lIllIlIllllIlI[7]]))));
            "".length();
            llllllllllllIlllllllIlllIllllIII.addChatMessage(llllllllllllIlllllllIlllIllIlIll);
            ++llllllllllllIlllllllIlllIllIllIl;
        }
        if (lllllllIlIIllIl(llllllllllllIlllllllIlllIlllIIll) && lllllllIlIlIIIl((llllllllllllIlllllllIlllIllllIII instanceof EntityPlayer) ? 1 : 0)) {
            final ChatComponentTranslation llllllllllllIlllllllIlllIllIlIlI = new ChatComponentTranslation(CommandHelp.lIllIlIllllIIl[CommandHelp.lIllIlIllllIlI[8]], new Object[CommandHelp.lIllIlIllllIlI[0]]);
            llllllllllllIlllllllIlllIllIlIlI.getChatStyle().setColor(EnumChatFormatting.GREEN);
            "".length();
            llllllllllllIlllllllIlllIllllIII.addChatMessage(llllllllllllIlllllllIlllIllIlIlI);
        }
    }
    
    private static boolean lllllllIlIlIIII(final int llllllllllllIlllllllIlllIIIlIIlI, final int llllllllllllIlllllllIlllIIIlIIIl) {
        return llllllllllllIlllllllIlllIIIlIIlI >= llllllllllllIlllllllIlllIIIlIIIl;
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender llllllllllllIlllllllIlllIlIlIIIl, final String[] llllllllllllIlllllllIlllIlIlIIII, final BlockPos llllllllllllIlllllllIlllIlIIllll) {
        if (lllllllIlIlIIlI(llllllllllllIlllllllIlllIlIlIIII.length, CommandHelp.lIllIlIllllIlI[1])) {
            final Set<String> llllllllllllIlllllllIlllIlIIlllI = this.getCommands().keySet();
            return CommandBase.getListOfStringsMatchingLastWord(llllllllllllIlllllllIlllIlIlIIII, (String[])llllllllllllIlllllllIlllIlIIlllI.toArray(new String[llllllllllllIlllllllIlllIlIIlllI.size()]));
        }
        return null;
    }
    
    private static boolean lllllllIlIIlllI(final Object llllllllllllIlllllllIlllIIIIlIll) {
        return llllllllllllIlllllllIlllIIIIlIll != null;
    }
    
    static {
        lllllllIlIIllII();
        lllllllIlIIlIll();
    }
    
    protected List<ICommand> getSortedPossibleCommands(final ICommandSender llllllllllllIlllllllIlllIlIllIlI) {
        final List<ICommand> llllllllllllIlllllllIlllIlIllIIl = MinecraftServer.getServer().getCommandManager().getPossibleCommands(llllllllllllIlllllllIlllIlIllIlI);
        Collections.sort(llllllllllllIlllllllIlllIlIllIIl);
        return llllllllllllIlllllllIlllIlIllIIl;
    }
    
    private static boolean lllllllIlIIllll(final int llllllllllllIlllllllIlllIIIIIlII, final int llllllllllllIlllllllIlllIIIIIIll) {
        return llllllllllllIlllllllIlllIIIIIlII != llllllllllllIlllllllIlllIIIIIIll;
    }
    
    @Override
    public List<String> getCommandAliases() {
        final String[] a = new String[CommandHelp.lIllIlIllllIlI[1]];
        a[CommandHelp.lIllIlIllllIlI[0]] = CommandHelp.lIllIlIllllIIl[CommandHelp.lIllIlIllllIlI[2]];
        return Arrays.asList(a);
    }
    
    private static String lllllllIlIIlIlI(final String llllllllllllIlllllllIlllIlIIIIIl, final String llllllllllllIlllllllIlllIlIIIIII) {
        try {
            final SecretKeySpec llllllllllllIlllllllIlllIlIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllllIlllIlIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllllIlllIlIIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllllllIlllIlIIIlIl.init(CommandHelp.lIllIlIllllIlI[2], llllllllllllIlllllllIlllIlIIIllI);
            return new String(llllllllllllIlllllllIlllIlIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllllllIlllIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllllIlllIlIIIlII) {
            llllllllllllIlllllllIlllIlIIIlII.printStackTrace();
            return null;
        }
    }
}
