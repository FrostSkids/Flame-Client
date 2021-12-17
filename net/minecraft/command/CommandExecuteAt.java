// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.util.Collection;
import java.util.List;
import java.util.Arrays;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.Block;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;
import net.minecraft.util.Vec3;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.Entity;

public class CommandExecuteAt extends CommandBase
{
    private static final /* synthetic */ int[] llIllIlIllIlll;
    private static final /* synthetic */ String[] llIllIlIllIIIl;
    
    @Override
    public String getCommandName() {
        return CommandExecuteAt.llIllIlIllIIIl[CommandExecuteAt.llIllIlIllIlll[0]];
    }
    
    static {
        lIIllIIIIIIIIIIl();
        lIIlIlllllllIIlI();
    }
    
    @Override
    public void processCommand(final ICommandSender llllllllllllIllIIllIlIIlIlIlllIl, final String[] llllllllllllIllIIllIlIIlIlIlllII) throws CommandException {
        if (lIIllIIIIIIIIIlI(llllllllllllIllIIllIlIIlIlIlllII.length, CommandExecuteAt.llIllIlIllIlll[3])) {
            throw new WrongUsageException(CommandExecuteAt.llIllIlIllIIIl[CommandExecuteAt.llIllIlIllIlll[1]], new Object[CommandExecuteAt.llIllIlIllIlll[0]]);
        }
        final Entity llllllllllllIllIIllIlIIlIlllIIIl = CommandBase.getEntity(llllllllllllIllIIllIlIIlIlIlllIl, llllllllllllIllIIllIlIIlIlIlllII[CommandExecuteAt.llIllIlIllIlll[0]], (Class<? extends Entity>)Entity.class);
        final double llllllllllllIllIIllIlIIlIlllIIII = CommandBase.parseDouble(llllllllllllIllIIllIlIIlIlllIIIl.posX, llllllllllllIllIIllIlIIlIlIlllII[CommandExecuteAt.llIllIlIllIlll[2]], (boolean)(CommandExecuteAt.llIllIlIllIlll[0] != 0));
        final double llllllllllllIllIIllIlIIlIllIllll = CommandBase.parseDouble(llllllllllllIllIIllIlIIlIlllIIIl.posY, llllllllllllIllIIllIlIIlIlIlllII[CommandExecuteAt.llIllIlIllIlll[1]], (boolean)(CommandExecuteAt.llIllIlIllIlll[0] != 0));
        final double llllllllllllIllIIllIlIIlIllIlllI = CommandBase.parseDouble(llllllllllllIllIIllIlIIlIlllIIIl.posZ, llllllllllllIllIIllIlIIlIlIlllII[CommandExecuteAt.llIllIlIllIlll[4]], (boolean)(CommandExecuteAt.llIllIlIllIlll[0] != 0));
        final BlockPos llllllllllllIllIIllIlIIlIllIllIl = new BlockPos(llllllllllllIllIIllIlIIlIlllIIII, llllllllllllIllIIllIlIIlIllIllll, llllllllllllIllIIllIlIIlIllIlllI);
        int llllllllllllIllIIllIlIIlIllIllII = CommandExecuteAt.llIllIlIllIlll[5];
        if (lIIllIIIIIIIIIll(CommandExecuteAt.llIllIlIllIIIl[CommandExecuteAt.llIllIlIllIlll[4]].equals(llllllllllllIllIIllIlIIlIlIlllII[CommandExecuteAt.llIllIlIllIlll[5]]) ? 1 : 0) && lIIllIIIIIIIIlII(llllllllllllIllIIllIlIIlIlIlllII.length, CommandExecuteAt.llIllIlIllIlll[6])) {
            final World llllllllllllIllIIllIlIIlIllIlIll = llllllllllllIllIIllIlIIlIlllIIIl.getEntityWorld();
            final double llllllllllllIllIIllIlIIlIllIlIlI = CommandBase.parseDouble(llllllllllllIllIIllIlIIlIlllIIII, llllllllllllIllIIllIlIIlIlIlllII[CommandExecuteAt.llIllIlIllIlll[3]], (boolean)(CommandExecuteAt.llIllIlIllIlll[0] != 0));
            final double llllllllllllIllIIllIlIIlIllIlIIl = CommandBase.parseDouble(llllllllllllIllIIllIlIIlIllIllll, llllllllllllIllIIllIlIIlIlIlllII[CommandExecuteAt.llIllIlIllIlll[7]], (boolean)(CommandExecuteAt.llIllIlIllIlll[0] != 0));
            final double llllllllllllIllIIllIlIIlIllIlIII = CommandBase.parseDouble(llllllllllllIllIIllIlIIlIllIlllI, llllllllllllIllIIllIlIIlIlIlllII[CommandExecuteAt.llIllIlIllIlll[8]], (boolean)(CommandExecuteAt.llIllIlIllIlll[0] != 0));
            final Block llllllllllllIllIIllIlIIlIllIIlll = CommandBase.getBlockByText(llllllllllllIllIIllIlIIlIlIlllIl, llllllllllllIllIIllIlIIlIlIlllII[CommandExecuteAt.llIllIlIllIlll[9]]);
            final int llllllllllllIllIIllIlIIlIllIIllI = CommandBase.parseInt(llllllllllllIllIIllIlIIlIlIlllII[CommandExecuteAt.llIllIlIllIlll[10]], CommandExecuteAt.llIllIlIllIlll[11], CommandExecuteAt.llIllIlIllIlll[12]);
            final BlockPos llllllllllllIllIIllIlIIlIllIIlIl = new BlockPos(llllllllllllIllIIllIlIIlIllIlIlI, llllllllllllIllIIllIlIIlIllIlIIl, llllllllllllIllIIllIlIIlIllIlIII);
            final IBlockState llllllllllllIllIIllIlIIlIllIIlII = llllllllllllIllIIllIlIIlIllIlIll.getBlockState(llllllllllllIllIIllIlIIlIllIIlIl);
            if (!lIIllIIIIIIIIlIl(llllllllllllIllIIllIlIIlIllIIlII.getBlock(), llllllllllllIllIIllIlIIlIllIIlll) || (lIIllIIIIIIIIllI(llllllllllllIllIIllIlIIlIllIIllI) && lIIllIIIIIIIIlll(llllllllllllIllIIllIlIIlIllIIlII.getBlock().getMetaFromState(llllllllllllIllIIllIlIIlIllIIlII), llllllllllllIllIIllIlIIlIllIIllI))) {
                final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandExecuteAt.llIllIlIllIIIl[CommandExecuteAt.llIllIlIllIlll[5]];
                final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandExecuteAt.llIllIlIllIlll[1]];
                lllllllllllllIlIIIIIIlIlIllIIlIl[CommandExecuteAt.llIllIlIllIlll[0]] = CommandExecuteAt.llIllIlIllIIIl[CommandExecuteAt.llIllIlIllIlll[3]];
                lllllllllllllIlIIIIIIlIlIllIIlIl[CommandExecuteAt.llIllIlIllIlll[2]] = llllllllllllIllIIllIlIIlIlllIIIl.getName();
                throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
            }
            llllllllllllIllIIllIlIIlIllIllII = CommandExecuteAt.llIllIlIllIlll[6];
        }
        final String llllllllllllIllIIllIlIIlIllIIIll = CommandBase.buildString(llllllllllllIllIIllIlIIlIlIlllII, llllllllllllIllIIllIlIIlIllIllII);
        final ICommandSender llllllllllllIllIIllIlIIlIllIIIlI = new ICommandSender() {
            private static final /* synthetic */ int[] llIllIllllllll;
            private static final /* synthetic */ String[] llIllIlllllllI;
            
            static {
                lIIllIIIlIllIIlI();
                lIIllIIIlIllIIIl();
            }
            
            @Override
            public Vec3 getPositionVector() {
                return new Vec3(llllllllllllIllIIllIlIIlIlllIIII, llllllllllllIllIIllIlIIlIllIllll, llllllllllllIllIIllIlIIlIllIlllI);
            }
            
            @Override
            public World getEntityWorld() {
                return llllllllllllIllIIllIlIIlIlllIIIl.worldObj;
            }
            
            @Override
            public String getName() {
                return llllllllllllIllIIllIlIIlIlllIIIl.getName();
            }
            
            private static void lIIllIIIlIllIIIl() {
                (llIllIlllllllI = new String[CommandExecuteAt$1.llIllIllllllll[1]])[CommandExecuteAt$1.llIllIllllllll[0]] = lIIllIIIlIllIIII("/fzFDUX4fmPrzWyZf+lRjgTSOhAM8dz7", "YbvQp");
            }
            
            @Override
            public boolean canCommandSenderUseCommand(final int llllllllllllIllIIlIlllIIlIlIllII, final String llllllllllllIllIIlIlllIIlIlIlIII) {
                return llllllllllllIllIIllIlIIlIlIlllIl.canCommandSenderUseCommand(llllllllllllIllIIlIlllIIlIlIllII, llllllllllllIllIIlIlllIIlIlIlIII);
            }
            
            private static void lIIllIIIlIllIIlI() {
                (llIllIllllllll = new int[3])[0] = ((0x43 ^ 0x3F ^ (0xAD ^ 0x91)) & (0x18 ^ 0x45 ^ (0x3E ^ 0x23) ^ -" ".length()));
                CommandExecuteAt$1.llIllIllllllll[1] = " ".length();
                CommandExecuteAt$1.llIllIllllllll[2] = "  ".length();
            }
            
            @Override
            public IChatComponent getDisplayName() {
                return llllllllllllIllIIllIlIIlIlllIIIl.getDisplayName();
            }
            
            @Override
            public BlockPos getPosition() {
                return llllllllllllIllIIllIlIIlIllIllIl;
            }
            
            @Override
            public boolean sendCommandFeedback() {
                final MinecraftServer llllllllllllIllIIlIlllIIlIIllIIl = MinecraftServer.getServer();
                if (lIIllIIIlIllIIll(llllllllllllIllIIlIlllIIlIIllIIl) && lIIllIIIlIllIlII(llllllllllllIllIIlIlllIIlIIllIIl.worldServers[CommandExecuteAt$1.llIllIllllllll[0]].getGameRules().getBoolean(CommandExecuteAt$1.llIllIlllllllI[CommandExecuteAt$1.llIllIllllllll[0]]) ? 1 : 0)) {
                    return CommandExecuteAt$1.llIllIllllllll[0] != 0;
                }
                return CommandExecuteAt$1.llIllIllllllll[1] != 0;
            }
            
            private static String lIIllIIIlIllIIII(final String llllllllllllIllIIlIlllIIlIIIIlIl, final String llllllllllllIllIIlIlllIIlIIIIllI) {
                try {
                    final SecretKeySpec llllllllllllIllIIlIlllIIlIIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIlllIIlIIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher llllllllllllIllIIlIlllIIlIIIlIIl = Cipher.getInstance("Blowfish");
                    llllllllllllIllIIlIlllIIlIIIlIIl.init(CommandExecuteAt$1.llIllIllllllll[2], llllllllllllIllIIlIlllIIlIIIlIlI);
                    return new String(llllllllllllIllIIlIlllIIlIIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIlllIIlIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIllIIlIlllIIlIIIlIII) {
                    llllllllllllIllIIlIlllIIlIIIlIII.printStackTrace();
                    return null;
                }
            }
            
            private static boolean lIIllIIIlIllIlII(final int llllllllllllIllIIlIlllIIIllllllI) {
                return llllllllllllIllIIlIlllIIIllllllI == 0;
            }
            
            private static boolean lIIllIIIlIllIIll(final Object llllllllllllIllIIlIlllIIlIIIIIII) {
                return llllllllllllIllIIlIlllIIlIIIIIII != null;
            }
            
            @Override
            public Entity getCommandSenderEntity() {
                return llllllllllllIllIIllIlIIlIlllIIIl;
            }
            
            @Override
            public void addChatMessage(final IChatComponent llllllllllllIllIIlIlllIIlIllIIll) {
                llllllllllllIllIIllIlIIlIlIlllIl.addChatMessage(llllllllllllIllIIlIlllIIlIllIIll);
            }
            
            @Override
            public void setCommandStat(final CommandResultStats.Type llllllllllllIllIIlIlllIIlIIlIIll, final int llllllllllllIllIIlIlllIIlIIlIIlI) {
                llllllllllllIllIIllIlIIlIlllIIIl.setCommandStat(llllllllllllIllIIlIlllIIlIIlIIll, llllllllllllIllIIlIlllIIlIIlIIlI);
            }
        };
        final ICommandManager llllllllllllIllIIllIlIIlIllIIIIl = MinecraftServer.getServer().getCommandManager();
        try {
            final int llllllllllllIllIIllIlIIlIllIIIII = llllllllllllIllIIllIlIIlIllIIIIl.executeCommand(llllllllllllIllIIllIlIIlIllIIIlI, llllllllllllIllIIllIlIIlIllIIIll);
            if (lIIllIIIIIIIIIlI(llllllllllllIllIIllIlIIlIllIIIII, CommandExecuteAt.llIllIlIllIlll[2])) {
                final String lllllllllllllIlIIIIIIlIlIllIlIIl2 = CommandExecuteAt.llIllIlIllIIIl[CommandExecuteAt.llIllIlIllIlll[7]];
                final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl2 = new Object[CommandExecuteAt.llIllIlIllIlll[2]];
                lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandExecuteAt.llIllIlIllIlll[0]] = llllllllllllIllIIllIlIIlIllIIIll;
                throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl2, lllllllllllllIlIIIIIIlIlIllIIlIl2);
            }
        }
        catch (Throwable llllllllllllIllIIllIlIIlIlIlllll) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl3 = CommandExecuteAt.llIllIlIllIIIl[CommandExecuteAt.llIllIlIllIlll[8]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl3 = new Object[CommandExecuteAt.llIllIlIllIlll[1]];
            lllllllllllllIlIIIIIIlIlIllIIlIl3[CommandExecuteAt.llIllIlIllIlll[0]] = llllllllllllIllIIllIlIIlIllIIIll;
            lllllllllllllIlIIIIIIlIlIllIIlIl3[CommandExecuteAt.llIllIlIllIlll[2]] = llllllllllllIllIIllIlIIlIlllIIIl.getName();
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl3, lllllllllllllIlIIIIIIlIlIllIIlIl3);
        }
    }
    
    private static void lIIllIIIIIIIIIIl() {
        (llIllIlIllIlll = new int[13])[0] = ((0x6D ^ 0x23 ^ (0x31 ^ 0x5C)) & (61 + 100 - 131 + 97 ^ (0xEE ^ 0xB2) ^ -" ".length()));
        CommandExecuteAt.llIllIlIllIlll[1] = "  ".length();
        CommandExecuteAt.llIllIlIllIlll[2] = " ".length();
        CommandExecuteAt.llIllIlIllIlll[3] = (0x68 ^ 0x6D);
        CommandExecuteAt.llIllIlIllIlll[4] = "   ".length();
        CommandExecuteAt.llIllIlIllIlll[5] = (0xE4 ^ 0xC5 ^ (0x9 ^ 0x2C));
        CommandExecuteAt.llIllIlIllIlll[6] = (27 + 75 + 8 + 25 ^ 128 + 42 - 142 + 113);
        CommandExecuteAt.llIllIlIllIlll[7] = (0x3E ^ 0xE ^ (0xA4 ^ 0x92));
        CommandExecuteAt.llIllIlIllIlll[8] = (0x50 ^ 0x57);
        CommandExecuteAt.llIllIlIllIlll[9] = (0xAC ^ 0x83 ^ (0x72 ^ 0x55));
        CommandExecuteAt.llIllIlIllIlll[10] = (0x13 ^ 0x8 ^ (0xAE ^ 0xBC));
        CommandExecuteAt.llIllIlIllIlll[11] = -" ".length();
        CommandExecuteAt.llIllIlIllIlll[12] = (0x6B ^ 0x64);
    }
    
    private static boolean lIIllIIIIIIIlIIl(final int llllllllllllIllIIllIlIIlIIIIIIll, final int llllllllllllIllIIllIlIIlIIIIIIlI) {
        return llllllllllllIllIIllIlIIlIIIIIIll <= llllllllllllIllIIllIlIIlIIIIIIlI;
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandExecuteAt.llIllIlIllIlll[1];
    }
    
    @Override
    public String getCommandUsage(final ICommandSender llllllllllllIllIIllIlIIllIIIIlll) {
        return CommandExecuteAt.llIllIlIllIIIl[CommandExecuteAt.llIllIlIllIlll[2]];
    }
    
    private static boolean lIIllIIIIIIIlIII(final int llllllllllllIllIIllIlIIlIIIIlIll, final int llllllllllllIllIIllIlIIlIIIIlIlI) {
        return llllllllllllIllIIllIlIIlIIIIlIll == llllllllllllIllIIllIlIIlIIIIlIlI;
    }
    
    private static String lIIlIlllllllIIII(final String llllllllllllIllIIllIlIIlIIlIlIIl, final String llllllllllllIllIIllIlIIlIIlIlIlI) {
        try {
            final SecretKeySpec llllllllllllIllIIllIlIIlIIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllIlIIlIIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIllIlIIlIIlIllIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIllIlIIlIIlIllIl.init(CommandExecuteAt.llIllIlIllIlll[1], llllllllllllIllIIllIlIIlIIlIlllI);
            return new String(llllllllllllIllIIllIlIIlIIlIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllIlIIlIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllIlIIlIIlIllII) {
            llllllllllllIllIIllIlIIlIIlIllII.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlIlllllllIIlI() {
        (llIllIlIllIIIl = new String[CommandExecuteAt.llIllIlIllIlll[6]])[CommandExecuteAt.llIllIlIllIlll[0]] = lIIlIllllllIlllI("kwqf8kLWfaU=", "ZUrCJ");
        CommandExecuteAt.llIllIlIllIIIl[CommandExecuteAt.llIllIlIllIlll[2]] = lIIlIllllllIllll("MCcqFQA9LDRWBCstJA0VNmYyCwA0LQ==", "SHGxa");
        CommandExecuteAt.llIllIlIllIIIl[CommandExecuteAt.llIllIlIllIlll[1]] = lIIlIlllllllIIII("evAiExGy3ZaYjdD7z5nGmhY76XhOIVOp", "vZCBT");
        CommandExecuteAt.llIllIlIllIIIl[CommandExecuteAt.llIllIlIllIlll[4]] = lIIlIlllllllIIII("EYWoK35198o=", "KRnep");
        CommandExecuteAt.llIllIlIllIIIl[CommandExecuteAt.llIllIlIllIlll[5]] = lIIlIllllllIlllI("LwQIhXIggN34AYjC1jMedi7D81YMqyIP", "hFSMn");
        CommandExecuteAt.llIllIlIllIIIl[CommandExecuteAt.llIllIlIllIlll[3]] = lIIlIllllllIllll("Ai08IgwS", "fHHGo");
        CommandExecuteAt.llIllIlIllIIIl[CommandExecuteAt.llIllIlIllIlll[7]] = lIIlIllllllIllll("DhU+PRYDHiB+EhUfMCUDCFQyPBskFCU/FAwOOj8ZHjwyORsIHg==", "mzSPw");
        CommandExecuteAt.llIllIlIllIIIl[CommandExecuteAt.llIllIlIllIlll[8]] = lIIlIllllllIllll("OgkEOCU3Ahp7ISEDCiAwPEgPNC01Aw0=", "YfiUD");
        CommandExecuteAt.llIllIlIllIIIl[CommandExecuteAt.llIllIlIllIlll[9]] = lIIlIllllllIlllI("1vkBQen477Q=", "gmtnZ");
        CommandExecuteAt.llIllIlIllIIIl[CommandExecuteAt.llIllIlIllIlll[10]] = lIIlIlllllllIIII("4SGHYpPQn4M=", "NlMfw");
    }
    
    private static String lIIlIllllllIllll(String llllllllllllIllIIllIlIIlIIIlIllI, final String llllllllllllIllIIllIlIIlIIIlIlIl) {
        llllllllllllIllIIllIlIIlIIIlIllI = new String(Base64.getDecoder().decode(llllllllllllIllIIllIlIIlIIIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIllIlIIlIIIllIIl = new StringBuilder();
        final char[] llllllllllllIllIIllIlIIlIIIllIII = llllllllllllIllIIllIlIIlIIIlIlIl.toCharArray();
        int llllllllllllIllIIllIlIIlIIIlIlll = CommandExecuteAt.llIllIlIllIlll[0];
        final Exception llllllllllllIllIIllIlIIlIIIlIIIl = (Object)llllllllllllIllIIllIlIIlIIIlIllI.toCharArray();
        final char llllllllllllIllIIllIlIIlIIIlIIII = (char)llllllllllllIllIIllIlIIlIIIlIIIl.length;
        Exception llllllllllllIllIIllIlIIlIIIIllll = (Exception)CommandExecuteAt.llIllIlIllIlll[0];
        while (lIIllIIIIIIIIIlI((int)llllllllllllIllIIllIlIIlIIIIllll, llllllllllllIllIIllIlIIlIIIlIIII)) {
            final char llllllllllllIllIIllIlIIlIIIlllII = llllllllllllIllIIllIlIIlIIIlIIIl[llllllllllllIllIIllIlIIlIIIIllll];
            llllllllllllIllIIllIlIIlIIIllIIl.append((char)(llllllllllllIllIIllIlIIlIIIlllII ^ llllllllllllIllIIllIlIIlIIIllIII[llllllllllllIllIIllIlIIlIIIlIlll % llllllllllllIllIIllIlIIlIIIllIII.length]));
            "".length();
            ++llllllllllllIllIIllIlIIlIIIlIlll;
            ++llllllllllllIllIIllIlIIlIIIIllll;
            "".length();
            if (" ".length() > " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIllIlIIlIIIllIIl);
    }
    
    @Override
    public boolean isUsernameIndex(final String[] llllllllllllIllIIllIlIIlIlIIIIlI, final int llllllllllllIllIIllIlIIlIlIIIIII) {
        if (lIIllIIIIIIIlIlI(llllllllllllIllIIllIlIIlIlIIIIII)) {
            return CommandExecuteAt.llIllIlIllIlll[2] != 0;
        }
        return CommandExecuteAt.llIllIlIllIlll[0] != 0;
    }
    
    private static boolean lIIllIIIIIIIIlll(final int llllllllllllIllIIllIlIIIllllIIIl, final int llllllllllllIllIIllIlIIIllllIIII) {
        return llllllllllllIllIIllIlIIIllllIIIl != llllllllllllIllIIllIlIIIllllIIII;
    }
    
    private static boolean lIIllIIIIIIIIIll(final int llllllllllllIllIIllIlIIIlllllIII) {
        return llllllllllllIllIIllIlIIIlllllIII != 0;
    }
    
    private static boolean lIIllIIIIIIIIlIl(final Object llllllllllllIllIIllIlIIIlllllIll, final Object llllllllllllIllIIllIlIIIlllllIlI) {
        return llllllllllllIllIIllIlIIIlllllIll == llllllllllllIllIIllIlIIIlllllIlI;
    }
    
    private static String lIIlIllllllIlllI(final String llllllllllllIllIIllIlIIlIIllIllI, final String llllllllllllIllIIllIlIIlIIllIlll) {
        try {
            final SecretKeySpec llllllllllllIllIIllIlIIlIIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllIlIIlIIllIlll.getBytes(StandardCharsets.UTF_8)), CommandExecuteAt.llIllIlIllIlll[9]), "DES");
            final Cipher llllllllllllIllIIllIlIIlIIlllIlI = Cipher.getInstance("DES");
            llllllllllllIllIIllIlIIlIIlllIlI.init(CommandExecuteAt.llIllIlIllIlll[1], llllllllllllIllIIllIlIIlIIlllIll);
            return new String(llllllllllllIllIIllIlIIlIIlllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllIlIIlIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllIlIIlIIlllIIl) {
            llllllllllllIllIIllIlIIlIIlllIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllIIIIIIIIlII(final int llllllllllllIllIIllIlIIIllllllll, final int llllllllllllIllIIllIlIIIlllllllI) {
        return llllllllllllIllIIllIlIIIllllllll > llllllllllllIllIIllIlIIIlllllllI;
    }
    
    private static boolean lIIllIIIIIIIlIlI(final int llllllllllllIllIIllIlIIIllllIllI) {
        return llllllllllllIllIIllIlIIIllllIllI == 0;
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender llllllllllllIllIIllIlIIlIlIIlIIl, final String[] llllllllllllIllIIllIlIIlIlIIlIII, final BlockPos llllllllllllIllIIllIlIIlIlIIIlll) {
        List<String> list;
        if (lIIllIIIIIIIlIII(llllllllllllIllIIllIlIIlIlIIlIII.length, CommandExecuteAt.llIllIlIllIlll[2])) {
            list = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIllIIllIlIIlIlIIlIII, MinecraftServer.getServer().getAllUsernames());
            "".length();
            if (((0x11 ^ 0x5C ^ (0xC4 ^ 0x9D)) & (40 + 85 + 29 + 9 ^ 48 + 35 + 1 + 99 ^ -" ".length())) == (29 + 56 + 6 + 45 ^ 38 + 38 - 57 + 121)) {
                return null;
            }
        }
        else if (lIIllIIIIIIIIlII(llllllllllllIllIIllIlIIlIlIIlIII.length, CommandExecuteAt.llIllIlIllIlll[2]) && lIIllIIIIIIIlIIl(llllllllllllIllIIllIlIIlIlIIlIII.length, CommandExecuteAt.llIllIlIllIlll[5])) {
            list = CommandBase.func_175771_a(llllllllllllIllIIllIlIIlIlIIlIII, CommandExecuteAt.llIllIlIllIlll[2], llllllllllllIllIIllIlIIlIlIIIlll);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (lIIllIIIIIIIIlII(llllllllllllIllIIllIlIIlIlIIlIII.length, CommandExecuteAt.llIllIlIllIlll[3]) && lIIllIIIIIIIlIIl(llllllllllllIllIIllIlIIlIlIIlIII.length, CommandExecuteAt.llIllIlIllIlll[9]) && lIIllIIIIIIIIIll(CommandExecuteAt.llIllIlIllIIIl[CommandExecuteAt.llIllIlIllIlll[9]].equals(llllllllllllIllIIllIlIIlIlIIlIII[CommandExecuteAt.llIllIlIllIlll[5]]) ? 1 : 0)) {
            list = CommandBase.func_175771_a(llllllllllllIllIIllIlIIlIlIIlIII, CommandExecuteAt.llIllIlIllIlll[3], llllllllllllIllIIllIlIIlIlIIIlll);
            "".length();
            if ((0xAB ^ 0xBB ^ (0x24 ^ 0x30)) < "  ".length()) {
                return null;
            }
        }
        else if (lIIllIIIIIIIlIII(llllllllllllIllIIllIlIIlIlIIlIII.length, CommandExecuteAt.llIllIlIllIlll[10]) && lIIllIIIIIIIIIll(CommandExecuteAt.llIllIlIllIIIl[CommandExecuteAt.llIllIlIllIlll[10]].equals(llllllllllllIllIIllIlIIlIlIIlIII[CommandExecuteAt.llIllIlIllIlll[5]]) ? 1 : 0)) {
            list = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIllIIllIlIIlIlIIlIII, Block.blockRegistry.getKeys());
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            list = null;
        }
        return list;
    }
    
    private static boolean lIIllIIIIIIIIllI(final int llllllllllllIllIIllIlIIIllllIlII) {
        return llllllllllllIllIIllIlIIIllllIlII >= 0;
    }
    
    private static boolean lIIllIIIIIIIIIlI(final int llllllllllllIllIIllIlIIlIIIIIlll, final int llllllllllllIllIIllIlIIlIIIIIllI) {
        return llllllllllllIllIIllIlIIlIIIIIlll < llllllllllllIllIIllIlIIlIIIIIllI;
    }
}
