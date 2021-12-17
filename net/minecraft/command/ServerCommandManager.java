// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.util.Iterator;
import net.minecraft.util.IChatComponent;
import net.minecraft.command.server.CommandBlockLogic;
import net.minecraft.network.rcon.RConConsoleSource;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ChatComponentTranslation;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.command.server.CommandPublishLocalServer;
import net.minecraft.command.server.CommandWhitelist;
import net.minecraft.command.server.CommandListPlayers;
import net.minecraft.command.server.CommandPardonPlayer;
import net.minecraft.command.server.CommandListBans;
import net.minecraft.command.server.CommandBanPlayer;
import net.minecraft.command.server.CommandPardonIp;
import net.minecraft.command.server.CommandBanIp;
import net.minecraft.command.server.CommandSaveOn;
import net.minecraft.command.server.CommandSaveOff;
import net.minecraft.command.server.CommandSaveAll;
import net.minecraft.command.server.CommandStop;
import net.minecraft.command.server.CommandDeOp;
import net.minecraft.command.server.CommandOp;
import net.minecraft.server.MinecraftServer;
import net.minecraft.command.server.CommandMessageRaw;
import net.minecraft.command.server.CommandTestForBlock;
import net.minecraft.command.server.CommandSetBlock;
import net.minecraft.command.server.CommandSummon;
import net.minecraft.command.server.CommandAchievement;
import net.minecraft.command.server.CommandScoreboard;
import net.minecraft.command.server.CommandTestFor;
import net.minecraft.command.server.CommandSetDefaultSpawnpoint;
import net.minecraft.command.server.CommandBroadcast;
import net.minecraft.command.server.CommandMessage;
import net.minecraft.command.server.CommandEmote;
import net.minecraft.command.server.CommandTeleport;

public class ServerCommandManager extends CommandHandler implements IAdminCommand
{
    private static final /* synthetic */ int[] lllllllIIlIll;
    private static final /* synthetic */ String[] lllllllIIlIII;
    
    private static boolean lIllIIIlIIIIIlI(final int lllllllllllllIlIlIlIIIIIllIIllIl) {
        return lllllllllllllIlIlIlIIIIIllIIllIl == 0;
    }
    
    public ServerCommandManager() {
        this.registerCommand(new CommandTime());
        "".length();
        this.registerCommand(new CommandGameMode());
        "".length();
        this.registerCommand(new CommandDifficulty());
        "".length();
        this.registerCommand(new CommandDefaultGameMode());
        "".length();
        this.registerCommand(new CommandKill());
        "".length();
        this.registerCommand(new CommandToggleDownfall());
        "".length();
        this.registerCommand(new CommandWeather());
        "".length();
        this.registerCommand(new CommandXP());
        "".length();
        this.registerCommand(new CommandTeleport());
        "".length();
        this.registerCommand(new CommandGive());
        "".length();
        this.registerCommand(new CommandReplaceItem());
        "".length();
        this.registerCommand(new CommandStats());
        "".length();
        this.registerCommand(new CommandEffect());
        "".length();
        this.registerCommand(new CommandEnchant());
        "".length();
        this.registerCommand(new CommandParticle());
        "".length();
        this.registerCommand(new CommandEmote());
        "".length();
        this.registerCommand(new CommandShowSeed());
        "".length();
        this.registerCommand(new CommandHelp());
        "".length();
        this.registerCommand(new CommandDebug());
        "".length();
        this.registerCommand(new CommandMessage());
        "".length();
        this.registerCommand(new CommandBroadcast());
        "".length();
        this.registerCommand(new CommandSetSpawnpoint());
        "".length();
        this.registerCommand(new CommandSetDefaultSpawnpoint());
        "".length();
        this.registerCommand(new CommandGameRule());
        "".length();
        this.registerCommand(new CommandClearInventory());
        "".length();
        this.registerCommand(new CommandTestFor());
        "".length();
        this.registerCommand(new CommandSpreadPlayers());
        "".length();
        this.registerCommand(new CommandPlaySound());
        "".length();
        this.registerCommand(new CommandScoreboard());
        "".length();
        this.registerCommand(new CommandExecuteAt());
        "".length();
        this.registerCommand(new CommandTrigger());
        "".length();
        this.registerCommand(new CommandAchievement());
        "".length();
        this.registerCommand(new CommandSummon());
        "".length();
        this.registerCommand(new CommandSetBlock());
        "".length();
        this.registerCommand(new CommandFill());
        "".length();
        this.registerCommand(new CommandClone());
        "".length();
        this.registerCommand(new CommandCompare());
        "".length();
        this.registerCommand(new CommandBlockData());
        "".length();
        this.registerCommand(new CommandTestForBlock());
        "".length();
        this.registerCommand(new CommandMessageRaw());
        "".length();
        this.registerCommand(new CommandWorldBorder());
        "".length();
        this.registerCommand(new CommandTitle());
        "".length();
        this.registerCommand(new CommandEntityData());
        "".length();
        if (lIllIIIlIIIIIIl(MinecraftServer.getServer().isDedicatedServer() ? 1 : 0)) {
            this.registerCommand(new CommandOp());
            "".length();
            this.registerCommand(new CommandDeOp());
            "".length();
            this.registerCommand(new CommandStop());
            "".length();
            this.registerCommand(new CommandSaveAll());
            "".length();
            this.registerCommand(new CommandSaveOff());
            "".length();
            this.registerCommand(new CommandSaveOn());
            "".length();
            this.registerCommand(new CommandBanIp());
            "".length();
            this.registerCommand(new CommandPardonIp());
            "".length();
            this.registerCommand(new CommandBanPlayer());
            "".length();
            this.registerCommand(new CommandListBans());
            "".length();
            this.registerCommand(new CommandPardonPlayer());
            "".length();
            this.registerCommand(new CommandServerKick());
            "".length();
            this.registerCommand(new CommandListPlayers());
            "".length();
            this.registerCommand(new CommandWhitelist());
            "".length();
            this.registerCommand(new CommandSetPlayerTimeout());
            "".length();
            "".length();
            if (-" ".length() != -" ".length()) {
                throw null;
            }
        }
        else {
            this.registerCommand(new CommandPublishLocalServer());
            "".length();
        }
        CommandBase.setAdminCommander(this);
    }
    
    private static boolean lIllIIIlIIIIIIl(final int lllllllllllllIlIlIlIIIIIllIlIIII) {
        return lllllllllllllIlIlIlIIIIIllIlIIII != 0;
    }
    
    private static String lIllIIIIllIIllI(final String lllllllllllllIlIlIlIIIIIllIllllI, final String lllllllllllllIlIlIlIIIIIllIlllIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlIIIIIlllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIIIIIllIlllIl.getBytes(StandardCharsets.UTF_8)), ServerCommandManager.lllllllIIlIll[4]), "DES");
            final Cipher lllllllllllllIlIlIlIIIIIlllIIIlI = Cipher.getInstance("DES");
            lllllllllllllIlIlIlIIIIIlllIIIlI.init(ServerCommandManager.lllllllIIlIll[2], lllllllllllllIlIlIlIIIIIlllIIIll);
            return new String(lllllllllllllIlIlIlIIIIIlllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIIIIIllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlIIIIIlllIIIIl) {
            lllllllllllllIlIlIlIIIIIlllIIIIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lIllIIIlIIIIIII();
        lIllIIIIllIlIIl();
    }
    
    private static String lIllIIIIllIlIII(String lllllllllllllIlIlIlIIIIIllllIIII, final String lllllllllllllIlIlIlIIIIIlllIllll) {
        lllllllllllllIlIlIlIIIIIllllIIII = new String(Base64.getDecoder().decode(lllllllllllllIlIlIlIIIIIllllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIlIIIIIllllIIll = new StringBuilder();
        final char[] lllllllllllllIlIlIlIIIIIllllIIlI = lllllllllllllIlIlIlIIIIIlllIllll.toCharArray();
        int lllllllllllllIlIlIlIIIIIllllIIIl = ServerCommandManager.lllllllIIlIll[1];
        final int lllllllllllllIlIlIlIIIIIlllIlIll = (Object)lllllllllllllIlIlIlIIIIIllllIIII.toCharArray();
        final byte lllllllllllllIlIlIlIIIIIlllIlIlI = (byte)lllllllllllllIlIlIlIIIIIlllIlIll.length;
        boolean lllllllllllllIlIlIlIIIIIlllIlIIl = ServerCommandManager.lllllllIIlIll[1] != 0;
        while (lIllIIIlIIIIlIl(lllllllllllllIlIlIlIIIIIlllIlIIl ? 1 : 0, lllllllllllllIlIlIlIIIIIlllIlIlI)) {
            final char lllllllllllllIlIlIlIIIIIllllIllI = lllllllllllllIlIlIlIIIIIlllIlIll[lllllllllllllIlIlIlIIIIIlllIlIIl];
            lllllllllllllIlIlIlIIIIIllllIIll.append((char)(lllllllllllllIlIlIlIIIIIllllIllI ^ lllllllllllllIlIlIlIIIIIllllIIlI[lllllllllllllIlIlIlIIIIIllllIIIl % lllllllllllllIlIlIlIIIIIllllIIlI.length]));
            "".length();
            ++lllllllllllllIlIlIlIIIIIllllIIIl;
            ++lllllllllllllIlIlIlIIIIIlllIlIIl;
            "".length();
            if ((0xAE ^ 0xAB) == 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIlIIIIIllllIIll);
    }
    
    private static boolean lIllIIIlIIIIlIl(final int lllllllllllllIlIlIlIIIIIllIllIII, final int lllllllllllllIlIlIlIIIIIllIlIlll) {
        return lllllllllllllIlIlIlIIIIIllIllIII < lllllllllllllIlIlIlIIIIIllIlIlll;
    }
    
    private static void lIllIIIIllIlIIl() {
        (lllllllIIlIII = new String[ServerCommandManager.lllllllIIlIll[3]])[ServerCommandManager.lllllllIIlIll[1]] = lIllIIIIllIIllI("agcd5t/mlJU5x8VpLotNjQ==", "LRKlZ");
        ServerCommandManager.lllllllIIlIII[ServerCommandManager.lllllllIIlIll[0]] = lIllIIIIllIIlll("MN5c5ZotQUPugDrCBhRjEosKvjiCBHVI", "zSKSF");
        ServerCommandManager.lllllllIIlIII[ServerCommandManager.lllllllIIlIll[2]] = lIllIIIIllIlIII("IAglHSg8ACYYBTcrLhwPMQwoEg==", "SmKyk");
    }
    
    private static String lIllIIIIllIIlll(final String lllllllllllllIlIlIlIIIIlIIIIIIll, final String lllllllllllllIlIlIlIIIIlIIIIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlIIIIlIIIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIIIIlIIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIlIIIIlIIIIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIlIIIIlIIIIIlll.init(ServerCommandManager.lllllllIIlIll[2], lllllllllllllIlIlIlIIIIlIIIIlIII);
            return new String(lllllllllllllIlIlIlIIIIlIIIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIIIIlIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlIIIIlIIIIIllI) {
            lllllllllllllIlIlIlIIIIlIIIIIllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIIIlIIIIIll(final Object lllllllllllllIlIlIlIIIIIllIlIIll, final Object lllllllllllllIlIlIlIIIIIllIlIIlI) {
        return lllllllllllllIlIlIlIIIIIllIlIIll != lllllllllllllIlIlIlIIIIIllIlIIlI;
    }
    
    private static void lIllIIIlIIIIIII() {
        (lllllllIIlIll = new int[5])[0] = " ".length();
        ServerCommandManager.lllllllIIlIll[1] = ((0x47 ^ 0x19) & ~(0xE1 ^ 0xBF));
        ServerCommandManager.lllllllIIlIll[2] = "  ".length();
        ServerCommandManager.lllllllIIlIll[3] = "   ".length();
        ServerCommandManager.lllllllIIlIll[4] = (140 + 72 - 68 + 34 ^ 54 + 153 - 66 + 45);
    }
    
    @Override
    public void notifyOperators(final ICommandSender lllllllllllllIlIlIlIIIIlIIlIIlII, final ICommand lllllllllllllIlIlIlIIIIlIIlIIIll, final int lllllllllllllIlIlIlIIIIlIIlIIIlI, final String lllllllllllllIlIlIlIIIIlIIIlIlIl, final Object... lllllllllllllIlIlIlIIIIlIIlIIIII) {
        boolean lllllllllllllIlIlIlIIIIlIIIlllll = ServerCommandManager.lllllllIIlIll[0] != 0;
        final MinecraftServer lllllllllllllIlIlIlIIIIlIIIllllI = MinecraftServer.getServer();
        if (lIllIIIlIIIIIlI(lllllllllllllIlIlIlIIIIlIIlIIlII.sendCommandFeedback() ? 1 : 0)) {
            lllllllllllllIlIlIlIIIIlIIIlllll = (ServerCommandManager.lllllllIIlIll[1] != 0);
        }
        final String lllllllllllllIlIIlIlllIIlIIIIIlI = ServerCommandManager.lllllllIIlIII[ServerCommandManager.lllllllIIlIll[1]];
        final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[ServerCommandManager.lllllllIIlIll[2]];
        lllllllllllllIlIIlIlllIIlIIIIIIl[ServerCommandManager.lllllllIIlIll[1]] = lllllllllllllIlIlIlIIIIlIIlIIlII.getName();
        lllllllllllllIlIIlIlllIIlIIIIIIl[ServerCommandManager.lllllllIIlIll[0]] = new ChatComponentTranslation(lllllllllllllIlIlIlIIIIlIIIlIlIl, lllllllllllllIlIlIlIIIIlIIlIIIII);
        final IChatComponent lllllllllllllIlIlIlIIIIlIIIlllIl = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl);
        lllllllllllllIlIlIlIIIIlIIIlllIl.getChatStyle().setColor(EnumChatFormatting.GRAY);
        "".length();
        lllllllllllllIlIlIlIIIIlIIIlllIl.getChatStyle().setItalic((boolean)(ServerCommandManager.lllllllIIlIll[0] != 0));
        "".length();
        if (lIllIIIlIIIIIIl(lllllllllllllIlIlIlIIIIlIIIlllll ? 1 : 0)) {
            final boolean lllllllllllllIlIlIlIIIIlIIIIllll = (boolean)lllllllllllllIlIlIlIIIIlIIIllllI.getConfigurationManager().func_181057_v().iterator();
            "".length();
            if ((0x16 ^ 0x13) <= 0) {
                return;
            }
            while (!lIllIIIlIIIIIlI(((Iterator)lllllllllllllIlIlIlIIIIlIIIIllll).hasNext() ? 1 : 0)) {
                final EntityPlayer lllllllllllllIlIlIlIIIIlIIIlllII = ((Iterator<EntityPlayer>)lllllllllllllIlIlIlIIIIlIIIIllll).next();
                if (lIllIIIlIIIIIll(lllllllllllllIlIlIlIIIIlIIIlllII, lllllllllllllIlIlIlIIIIlIIlIIlII) && lIllIIIlIIIIIIl(lllllllllllllIlIlIlIIIIlIIIllllI.getConfigurationManager().canSendCommands(lllllllllllllIlIlIlIIIIlIIIlllII.getGameProfile()) ? 1 : 0) && lIllIIIlIIIIIIl(lllllllllllllIlIlIlIIIIlIIlIIIll.canCommandSenderUseCommand(lllllllllllllIlIlIlIIIIlIIlIIlII) ? 1 : 0)) {
                    int n;
                    if (lIllIIIlIIIIIIl((lllllllllllllIlIlIlIIIIlIIlIIlII instanceof MinecraftServer) ? 1 : 0) && lIllIIIlIIIIIIl(MinecraftServer.getServer().func_183002_r() ? 1 : 0)) {
                        n = ServerCommandManager.lllllllIIlIll[0];
                        "".length();
                        if (((0x22 ^ 0x5F ^ (0x10 ^ 0x4C)) & (17 + 133 - 1 + 79 ^ 20 + 76 + 71 + 30 ^ -" ".length())) >= " ".length()) {
                            return;
                        }
                    }
                    else {
                        n = ServerCommandManager.lllllllIIlIll[1];
                    }
                    final boolean lllllllllllllIlIlIlIIIIlIIIllIll = n != 0;
                    int n2;
                    if (lIllIIIlIIIIIIl((lllllllllllllIlIlIlIIIIlIIlIIlII instanceof RConConsoleSource) ? 1 : 0) && lIllIIIlIIIIIIl(MinecraftServer.getServer().func_181034_q() ? 1 : 0)) {
                        n2 = ServerCommandManager.lllllllIIlIll[0];
                        "".length();
                        if (-"  ".length() >= 0) {
                            return;
                        }
                    }
                    else {
                        n2 = ServerCommandManager.lllllllIIlIll[1];
                    }
                    final boolean lllllllllllllIlIlIlIIIIlIIIllIlI = n2 != 0;
                    if (lIllIIIlIIIIIlI(lllllllllllllIlIlIlIIIIlIIIllIll ? 1 : 0) && lIllIIIlIIIIIlI(lllllllllllllIlIlIlIIIIlIIIllIlI ? 1 : 0) && (!lIllIIIlIIIIIlI((lllllllllllllIlIlIlIIIIlIIlIIlII instanceof RConConsoleSource) ? 1 : 0) || !lIllIIIlIIIIIlI((lllllllllllllIlIlIlIIIIlIIlIIlII instanceof MinecraftServer) ? 1 : 0))) {
                        continue;
                    }
                    lllllllllllllIlIlIlIIIIlIIIlllII.addChatMessage(lllllllllllllIlIlIlIIIIlIIIlllIl);
                }
            }
        }
        if (lIllIIIlIIIIIll(lllllllllllllIlIlIlIIIIlIIlIIlII, lllllllllllllIlIlIlIIIIlIIIllllI) && lIllIIIlIIIIIIl(lllllllllllllIlIlIlIIIIlIIIllllI.worldServers[ServerCommandManager.lllllllIIlIll[1]].getGameRules().getBoolean(ServerCommandManager.lllllllIIlIII[ServerCommandManager.lllllllIIlIll[0]]) ? 1 : 0)) {
            lllllllllllllIlIlIlIIIIlIIIllllI.addChatMessage(lllllllllllllIlIlIlIIIIlIIIlllIl);
        }
        boolean lllllllllllllIlIlIlIIIIlIIIllIIl = lllllllllllllIlIlIlIIIIlIIIllllI.worldServers[ServerCommandManager.lllllllIIlIll[1]].getGameRules().getBoolean(ServerCommandManager.lllllllIIlIII[ServerCommandManager.lllllllIIlIll[2]]);
        if (lIllIIIlIIIIIIl((lllllllllllllIlIlIlIIIIlIIlIIlII instanceof CommandBlockLogic) ? 1 : 0)) {
            lllllllllllllIlIlIlIIIIlIIIllIIl = ((CommandBlockLogic)lllllllllllllIlIlIlIIIIlIIlIIlII).shouldTrackOutput();
        }
        if ((lIllIIIlIIIIlII(lllllllllllllIlIlIlIIIIlIIlIIIlI & ServerCommandManager.lllllllIIlIll[0], ServerCommandManager.lllllllIIlIll[0]) && !lIllIIIlIIIIIlI(lllllllllllllIlIlIlIIIIlIIIllIIl ? 1 : 0)) || lIllIIIlIIIIIIl((lllllllllllllIlIlIlIIIIlIIlIIlII instanceof MinecraftServer) ? 1 : 0)) {
            lllllllllllllIlIlIlIIIIlIIlIIlII.addChatMessage(new ChatComponentTranslation(lllllllllllllIlIlIlIIIIlIIIlIlIl, lllllllllllllIlIlIlIIIIlIIlIIIII));
        }
    }
    
    private static boolean lIllIIIlIIIIlII(final int lllllllllllllIlIlIlIIIIIllIIlIIl, final int lllllllllllllIlIlIlIIIIIllIIIlll) {
        return lllllllllllllIlIlIlIIIIIllIIlIIl != lllllllllllllIlIlIlIIIIIllIIIlll;
    }
}
