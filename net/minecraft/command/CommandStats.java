// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.util.Iterator;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.tileentity.TileEntityCommandBlock;
import java.util.Collection;
import net.minecraft.scoreboard.ScoreObjective;
import com.google.common.collect.Lists;
import net.minecraft.server.MinecraftServer;
import java.util.List;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class CommandStats extends CommandBase
{
    private static final /* synthetic */ int[] lIlIIIIIlllIll;
    private static final /* synthetic */ String[] lIlIIIIIllIIIl;
    
    private static boolean lllIIIIlIIIIIlI(final int lllllllllllllIIlIIIIllIlIIIIlIIl, final int lllllllllllllIIlIIIIllIlIIIIlIII) {
        return lllllllllllllIIlIIIIllIlIIIIlIIl >= lllllllllllllIIlIIIIllIlIIIIlIII;
    }
    
    private static boolean lllIIIIIllllllI(final int lllllllllllllIIlIIIIllIIllllllII) {
        return lllllllllllllIIlIIIIllIIllllllII != 0;
    }
    
    private static String lllIIIIIllIIlIl(final String lllllllllllllIIlIIIIllIlIlIIIIll, final String lllllllllllllIIlIIIIllIlIlIIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIIllIlIlIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIllIlIlIIIIIl.getBytes(StandardCharsets.UTF_8)), CommandStats.lIlIIIIIlllIll[8]), "DES");
            final Cipher lllllllllllllIIlIIIIllIlIlIIIlll = Cipher.getInstance("DES");
            lllllllllllllIIlIIIIllIlIlIIIlll.init(CommandStats.lIlIIIIIlllIll[1], lllllllllllllIIlIIIIllIlIlIIlIIl);
            return new String(lllllllllllllIIlIIIIllIlIlIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIllIlIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIIllIlIlIIIlIl) {
            lllllllllllllIIlIIIIllIlIlIIIlIl.printStackTrace();
            return null;
        }
    }
    
    protected List<String> func_175777_e() {
        final Collection<ScoreObjective> lllllllllllllIIlIIIIllIlIlllIllI = MinecraftServer.getServer().worldServerForDimension(CommandStats.lIlIIIIIlllIll[0]).getScoreboard().getScoreObjectives();
        final List<String> lllllllllllllIIlIIIIllIlIlllIlII = (List<String>)Lists.newArrayList();
        final String lllllllllllllIIlIIIIllIlIllIllll = (String)lllllllllllllIIlIIIIllIlIlllIllI.iterator();
        "".length();
        if ((0x39 ^ 0x58 ^ (0xE3 ^ 0x86)) < (0x13 ^ 0x8 ^ (0x3D ^ 0x22))) {
            return null;
        }
        while (!lllIIIIIlllllll(((Iterator)lllllllllllllIIlIIIIllIlIllIllll).hasNext() ? 1 : 0)) {
            final ScoreObjective lllllllllllllIIlIIIIllIlIlllIIll = ((Iterator<ScoreObjective>)lllllllllllllIIlIIIIllIlIllIllll).next();
            if (lllIIIIIlllllll(lllllllllllllIIlIIIIllIlIlllIIll.getCriteria().isReadOnly() ? 1 : 0)) {
                lllllllllllllIIlIIIIllIlIlllIlII.add(lllllllllllllIIlIIIIllIlIlllIIll.getName());
                "".length();
            }
        }
        return lllllllllllllIIlIIIIllIlIlllIlII;
    }
    
    protected String[] func_175776_d() {
        return MinecraftServer.getServer().getAllUsernames();
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIIlIIIIllIllIlllIlI, final String[] lllllllllllllIIlIIIIllIllIlIIlIl) throws CommandException {
        if (lllIIIIIlllllIl(lllllllllllllIIlIIIIllIllIlIIlIl.length, CommandStats.lIlIIIIIlllIll[2])) {
            throw new WrongUsageException(CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[1]], new Object[CommandStats.lIlIIIIIlllIll[0]]);
        }
        boolean lllllllllllllIIlIIIIllIllIllIlll = false;
        if (lllIIIIIllllllI(lllllllllllllIIlIIIIllIllIlIIlIl[CommandStats.lIlIIIIIlllIll[0]].equals(CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[3]]) ? 1 : 0)) {
            final boolean lllllllllllllIIlIIIIllIllIlllIII = CommandStats.lIlIIIIIlllIll[0] != 0;
            "".length();
            if (((0xFF ^ 0xC1) & ~(0x51 ^ 0x6F)) != ((0x75 ^ 0x51) & ~(0xAE ^ 0x8A))) {
                return;
            }
        }
        else {
            if (lllIIIIIlllllll(lllllllllllllIIlIIIIllIllIlIIlIl[CommandStats.lIlIIIIIlllIll[0]].equals(CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[4]]) ? 1 : 0)) {
                throw new WrongUsageException(CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[5]], new Object[CommandStats.lIlIIIIIlllIll[0]]);
            }
            lllllllllllllIIlIIIIllIllIllIlll = (CommandStats.lIlIIIIIlllIll[2] != 0);
        }
        int lllllllllllllIIlIIIIllIllIllIlIl = 0;
        if (lllIIIIIllllllI(lllllllllllllIIlIIIIllIllIllIlll ? 1 : 0)) {
            if (lllIIIIIlllllIl(lllllllllllllIIlIIIIllIllIlIIlIl.length, CommandStats.lIlIIIIIlllIll[5])) {
                throw new WrongUsageException(CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[6]], new Object[CommandStats.lIlIIIIIlllIll[0]]);
            }
            final int lllllllllllllIIlIIIIllIllIllIllI = CommandStats.lIlIIIIIlllIll[4];
            "".length();
            if ((0x8B ^ 0x8E) == 0x0) {
                return;
            }
        }
        else {
            if (lllIIIIIlllllIl(lllllllllllllIIlIIIIllIllIlIIlIl.length, CommandStats.lIlIIIIIlllIll[3])) {
                throw new WrongUsageException(CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[7]], new Object[CommandStats.lIlIIIIIlllIll[0]]);
            }
            lllllllllllllIIlIIIIllIllIllIlIl = CommandStats.lIlIIIIIlllIll[1];
        }
        final String lllllllllllllIIlIIIIllIllIllIlII = lllllllllllllIIlIIIIllIllIlIIlIl[lllllllllllllIIlIIIIllIllIllIlIl++];
        if (lllIIIIIllllllI(CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[8]].equals(lllllllllllllIIlIIIIllIllIllIlII) ? 1 : 0)) {
            if (lllIIIIIlllllIl(lllllllllllllIIlIIIIllIllIlIIlIl.length, lllllllllllllIIlIIIIllIllIllIlIl + CommandStats.lIlIIIIIlllIll[3])) {
                if (lllIIIIlIIIIIII(lllllllllllllIIlIIIIllIllIllIlIl, CommandStats.lIlIIIIIlllIll[5])) {
                    throw new WrongUsageException(CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[9]], new Object[CommandStats.lIlIIIIIlllIll[0]]);
                }
                throw new WrongUsageException(CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[10]], new Object[CommandStats.lIlIIIIIlllIll[0]]);
            }
        }
        else {
            if (lllIIIIIlllllll(CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[11]].equals(lllllllllllllIIlIIIIllIllIllIlII) ? 1 : 0)) {
                throw new WrongUsageException(CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[12]], new Object[CommandStats.lIlIIIIIlllIll[0]]);
            }
            if (lllIIIIIlllllIl(lllllllllllllIIlIIIIllIllIlIIlIl.length, lllllllllllllIIlIIIIllIllIllIlIl + CommandStats.lIlIIIIIlllIll[2])) {
                if (lllIIIIlIIIIIII(lllllllllllllIIlIIIIllIllIllIlIl, CommandStats.lIlIIIIIlllIll[5])) {
                    throw new WrongUsageException(CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[13]], new Object[CommandStats.lIlIIIIIlllIll[0]]);
                }
                throw new WrongUsageException(CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[14]], new Object[CommandStats.lIlIIIIIlllIll[0]]);
            }
        }
        final CommandResultStats.Type lllllllllllllIIlIIIIllIllIllIIll = CommandResultStats.Type.getTypeByName(lllllllllllllIIlIIIIllIllIlIIlIl[lllllllllllllIIlIIIIllIllIllIlIl++]);
        if (lllIIIIlIIIIIIl(lllllllllllllIIlIIIIllIllIllIIll)) {
            throw new CommandException(CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[15]], new Object[CommandStats.lIlIIIIIlllIll[0]]);
        }
        final World lllllllllllllIIlIIIIllIllIllIIlI = lllllllllllllIIlIIIIllIllIlllIlI.getEntityWorld();
        CommandResultStats lllllllllllllIIlIIIIllIllIlIllll;
        if (lllIIIIIllllllI(lllllllllllllIIlIIIIllIllIllIlll ? 1 : 0)) {
            final BlockPos lllllllllllllIIlIIIIllIllIlIlllI = CommandBase.parseBlockPos(lllllllllllllIIlIIIIllIllIlllIlI, lllllllllllllIIlIIIIllIllIlIIlIl, CommandStats.lIlIIIIIlllIll[2], (boolean)(CommandStats.lIlIIIIIlllIll[0] != 0));
            final TileEntity lllllllllllllIIlIIIIllIllIlIllIl = lllllllllllllIIlIIIIllIllIllIIlI.getTileEntity(lllllllllllllIIlIIIIllIllIlIlllI);
            if (lllIIIIlIIIIIIl(lllllllllllllIIlIIIIllIllIlIllIl)) {
                final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[16]];
                final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandStats.lIlIIIIIlllIll[3]];
                lllllllllllllIlIIIIIIlIlIllIIlIl[CommandStats.lIlIIIIIlllIll[0]] = lllllllllllllIIlIIIIllIllIlIlllI.getX();
                lllllllllllllIlIIIIIIlIlIllIIlIl[CommandStats.lIlIIIIIlllIll[2]] = lllllllllllllIIlIIIIllIllIlIlllI.getY();
                lllllllllllllIlIIIIIIlIlIllIIlIl[CommandStats.lIlIIIIIlllIll[1]] = lllllllllllllIIlIIIIllIllIlIlllI.getZ();
                throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
            }
            if (lllIIIIIllllllI((lllllllllllllIIlIIIIllIllIlIllIl instanceof TileEntityCommandBlock) ? 1 : 0)) {
                final CommandResultStats lllllllllllllIIlIIIIllIllIllIIIl = ((TileEntityCommandBlock)lllllllllllllIIlIIIIllIllIlIllIl).getCommandResultStats();
                "".length();
                if ("   ".length() < "  ".length()) {
                    return;
                }
            }
            else {
                if (lllIIIIIlllllll((lllllllllllllIIlIIIIllIllIlIllIl instanceof TileEntitySign) ? 1 : 0)) {
                    final String lllllllllllllIlIIIIIIlIlIllIlIIl2 = CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[17]];
                    final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl2 = new Object[CommandStats.lIlIIIIIlllIll[3]];
                    lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandStats.lIlIIIIIlllIll[0]] = lllllllllllllIIlIIIIllIllIlIlllI.getX();
                    lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandStats.lIlIIIIIlllIll[2]] = lllllllllllllIIlIIIIllIllIlIlllI.getY();
                    lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandStats.lIlIIIIIlllIll[1]] = lllllllllllllIIlIIIIllIllIlIlllI.getZ();
                    throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl2, lllllllllllllIlIIIIIIlIlIllIIlIl2);
                }
                final CommandResultStats lllllllllllllIIlIIIIllIllIllIIII = ((TileEntitySign)lllllllllllllIIlIIIIllIllIlIllIl).getStats();
                "".length();
                if (null != null) {
                    return;
                }
            }
        }
        else {
            final Entity lllllllllllllIIlIIIIllIllIlIllII = CommandBase.func_175768_b(lllllllllllllIIlIIIIllIllIlllIlI, lllllllllllllIIlIIIIllIllIlIIlIl[CommandStats.lIlIIIIIlllIll[2]]);
            lllllllllllllIIlIIIIllIllIlIllll = lllllllllllllIIlIIIIllIllIlIllII.getCommandStats();
        }
        if (lllIIIIIllllllI(CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[18]].equals(lllllllllllllIIlIIIIllIllIllIlII) ? 1 : 0)) {
            final String lllllllllllllIIlIIIIllIllIlIlIll = lllllllllllllIIlIIIIllIllIlIIlIl[lllllllllllllIIlIIIIllIllIllIlIl++];
            final String lllllllllllllIIlIIIIllIllIlIlIlI = lllllllllllllIIlIIIIllIllIlIIlIl[lllllllllllllIIlIIIIllIllIllIlIl];
            if (!lllIIIIIllllllI(lllllllllllllIIlIIIIllIllIlIlIll.length()) || lllIIIIIlllllll(lllllllllllllIIlIIIIllIllIlIlIlI.length())) {
                throw new CommandException(CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[19]], new Object[CommandStats.lIlIIIIIlllIll[0]]);
            }
            CommandResultStats.func_179667_a(lllllllllllllIIlIIIIllIllIlIllll, lllllllllllllIIlIIIIllIllIllIIll, lllllllllllllIIlIIIIllIllIlIlIll, lllllllllllllIIlIIIIllIllIlIlIlI);
            final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[20]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandStats.lIlIIIIIlllIll[3]];
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandStats.lIlIIIIIlllIll[0]] = lllllllllllllIIlIIIIllIllIllIIll.getTypeName();
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandStats.lIlIIIIIlllIll[2]] = lllllllllllllIIlIIIIllIllIlIlIlI;
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandStats.lIlIIIIIlllIll[1]] = lllllllllllllIIlIIIIllIllIlIlIll;
            CommandBase.notifyOperators(lllllllllllllIIlIIIIllIllIlllIlI, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lllIIIIIllllllI(CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[21]].equals(lllllllllllllIIlIIIIllIllIllIlII) ? 1 : 0)) {
            CommandResultStats.func_179667_a(lllllllllllllIIlIIIIllIllIlIllll, lllllllllllllIIlIIIIllIllIllIIll, null, null);
            final String lllllllllllllIIIIlIlllIIIlIIIlII2 = CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[22]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll2 = new Object[CommandStats.lIlIIIIIlllIll[2]];
            lllllllllllllIIIIlIlllIIIlIIIlll2[CommandStats.lIlIIIIIlllIll[0]] = lllllllllllllIIlIIIIllIllIllIIll.getTypeName();
            CommandBase.notifyOperators(lllllllllllllIIlIIIIllIllIlllIlI, this, lllllllllllllIIIIlIlllIIIlIIIlII2, lllllllllllllIIIIlIlllIIIlIIIlll2);
        }
        if (lllIIIIIllllllI(lllllllllllllIIlIIIIllIllIllIlll ? 1 : 0)) {
            final BlockPos lllllllllllllIIlIIIIllIllIlIlIIl = CommandBase.parseBlockPos(lllllllllllllIIlIIIIllIllIlllIlI, lllllllllllllIIlIIIIllIllIlIIlIl, CommandStats.lIlIIIIIlllIll[2], (boolean)(CommandStats.lIlIIIIIlllIll[0] != 0));
            final TileEntity lllllllllllllIIlIIIIllIllIlIlIII = lllllllllllllIIlIIIIllIllIllIIlI.getTileEntity(lllllllllllllIIlIIIIllIllIlIlIIl);
            lllllllllllllIIlIIIIllIllIlIlIII.markDirty();
        }
    }
    
    private static boolean lllIIIIlIIIIIII(final int lllllllllllllIIlIIIIllIlIIIIllIl, final int lllllllllllllIIlIIIIllIlIIIIllII) {
        return lllllllllllllIIlIIIIllIlIIIIllIl == lllllllllllllIIlIIIIllIlIIIIllII;
    }
    
    @Override
    public String getCommandName() {
        return CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[0]];
    }
    
    private static void lllIIIIIlllllII() {
        (lIlIIIIIlllIll = new int[37])[0] = ((0xC4 ^ 0x83 ^ (0xD0 ^ 0x9F)) & (56 + 115 - 166 + 128 ^ 61 + 122 - 110 + 68 ^ -" ".length()));
        CommandStats.lIlIIIIIlllIll[1] = "  ".length();
        CommandStats.lIlIIIIIlllIll[2] = " ".length();
        CommandStats.lIlIIIIIlllIll[3] = "   ".length();
        CommandStats.lIlIIIIIlllIll[4] = (24 + 114 - 52 + 48 ^ 90 + 21 - 85 + 104);
        CommandStats.lIlIIIIIlllIll[5] = (34 + 109 - 8 + 10 ^ 129 + 29 - 64 + 54);
        CommandStats.lIlIIIIIlllIll[6] = (131 + 41 - 9 + 4 ^ 155 + 157 - 249 + 98);
        CommandStats.lIlIIIIIlllIll[7] = (0x23 ^ 0x24);
        CommandStats.lIlIIIIIlllIll[8] = (0x57 ^ 0x73 ^ (0x5A ^ 0x76));
        CommandStats.lIlIIIIIlllIll[9] = (0x10 ^ 0x55 ^ (0xD5 ^ 0x99));
        CommandStats.lIlIIIIIlllIll[10] = (0xB1 ^ 0xBB);
        CommandStats.lIlIIIIIlllIll[11] = (0x58 ^ 0x33 ^ (0x24 ^ 0x44));
        CommandStats.lIlIIIIIlllIll[12] = (0x8B ^ 0x87);
        CommandStats.lIlIIIIIlllIll[13] = (0x63 ^ 0x40 ^ (0xB7 ^ 0x99));
        CommandStats.lIlIIIIIlllIll[14] = (0x69 ^ 0x5C ^ (0x72 ^ 0x49));
        CommandStats.lIlIIIIIlllIll[15] = ("  ".length() ^ (0xCD ^ 0xC0));
        CommandStats.lIlIIIIIlllIll[16] = (0x39 ^ 0x29);
        CommandStats.lIlIIIIIlllIll[17] = (0x4D ^ 0x5C);
        CommandStats.lIlIIIIIlllIll[18] = (127 + 85 - 186 + 109 ^ 145 + 31 - 108 + 81);
        CommandStats.lIlIIIIIlllIll[19] = (0xB9 ^ 0xAA);
        CommandStats.lIlIIIIIlllIll[20] = (0x4F ^ 0x63 ^ (0x10 ^ 0x28));
        CommandStats.lIlIIIIIlllIll[21] = (0x75 ^ 0x60);
        CommandStats.lIlIIIIIlllIll[22] = (0xBD ^ 0xAB);
        CommandStats.lIlIIIIIlllIll[23] = (84 + 42 + 41 + 22 ^ 9 + 85 - 69 + 145);
        CommandStats.lIlIIIIIlllIll[24] = (0x2 ^ 0x1A);
        CommandStats.lIlIIIIIlllIll[25] = (67 + 0 + 57 + 51 ^ 173 + 126 - 179 + 62);
        CommandStats.lIlIIIIIlllIll[26] = (0xB0 ^ 0x8B ^ (0xA ^ 0x2B));
        CommandStats.lIlIIIIIlllIll[27] = (0x28 ^ 0x18 ^ (0x11 ^ 0x3A));
        CommandStats.lIlIIIIIlllIll[28] = (0xAE ^ 0xB2);
        CommandStats.lIlIIIIIlllIll[29] = (19 + 93 - 31 + 66 ^ 6 + 67 - 58 + 127);
        CommandStats.lIlIIIIIlllIll[30] = (0x50 ^ 0x32 ^ (0xB8 ^ 0xC4));
        CommandStats.lIlIIIIIlllIll[31] = (0x6E ^ 0x71);
        CommandStats.lIlIIIIIlllIll[32] = (0x5A ^ 0x7A);
        CommandStats.lIlIIIIIlllIll[33] = (0x13 ^ 0x5E ^ (0x7B ^ 0x17));
        CommandStats.lIlIIIIIlllIll[34] = (0xF ^ 0x2D);
        CommandStats.lIlIIIIIlllIll[35] = (118 + 110 - 132 + 69 ^ 108 + 1 - 82 + 107);
        CommandStats.lIlIIIIIlllIll[36] = (0x72 ^ 0x56);
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIIlIIIIllIlllIIIlll) {
        return CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[2]];
    }
    
    private static boolean lllIIIIIlllllIl(final int lllllllllllllIIlIIIIllIlIIIIIlIl, final int lllllllllllllIIlIIIIllIlIIIIIlII) {
        return lllllllllllllIIlIIIIllIlIIIIIlIl < lllllllllllllIIlIIIIllIlIIIIIlII;
    }
    
    private static boolean lllIIIIIlllllll(final int lllllllllllllIIlIIIIllIIlllllIlI) {
        return lllllllllllllIIlIIIIllIIlllllIlI == 0;
    }
    
    private static boolean lllIIIIlIIIIlII(final int lllllllllllllIIlIIIIllIIlllllIII) {
        return lllllllllllllIIlIIIIllIIlllllIII > 0;
    }
    
    private static void lllIIIIIlllIllI() {
        (lIlIIIIIllIIIl = new String[CommandStats.lIlIIIIIlllIll[36]])[CommandStats.lIlIIIIIlllIll[0]] = lllIIIIIllIIlIl("7kNFw6qxHA0=", "RcePy");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[2]] = lllIIIIIllIIlIl("7HlV14MQRtDXCWaa1ZF3KqBjMh8pzKFk", "LdyLN");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[1]] = lllIIIIIllIIlIl("A+AWDzEqBHshZnFR3sxezPadjphtVXC+", "RImWr");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[3]] = lllIIIIIllIIlll("CKY2PXH3L5E=", "wOGSa");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[4]] = lllIIIIIllIIlll("yh1y7WyqR8c=", "IZOlC");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[5]] = lllIIIIIllIIlll("yMyG+xZfKv+6L4P5LUWMLDWe6zM99i2p", "XjebQ");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[6]] = lllIIIIIllIlIll("ABchACUNHD9DNxcZOB5qARQjDi9NDT8MIwY=", "cxLmD");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[7]] = lllIIIIIllIlIll("FiIfIzQbKQFgJgEsBj17ECMGJyEMYwc9NBIo", "uMrNU");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[8]] = lllIIIIIllIIlll("OYFhwsv/xlI=", "hVHnu");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[9]] = lllIIIIIllIIlll("fjnoszUtFk4m1v0Q8rtVZoRhSFC9Qq6VDzYN0PHz438=", "moclH");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[10]] = lllIIIIIllIlIll("CToAGQsEMR5aGR40GQdEDzsZHR4Tex4RHkQgHhUNDw==", "jUmtj");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[11]] = lllIIIIIllIIlll("kRzw7o5j/LI=", "ehBNr");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[12]] = lllIIIIIllIIlIl("O5n3fg5Do/g0RYe/UG7ESzDsenswx3hc", "IjVXJ");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[13]] = lllIIIIIllIlIll("DgIYCRADCQZKAhkMARdfDwEaBxpDDhkBEB9DABcQCgg=", "mmudq");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[14]] = lllIIIIIllIIlll("H+cv0pCcOh6fBlrVIbIh7IZ/jFIyaMixh4oJmVjvh7bCwAS8O7K9QQ==", "mkKud");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[15]] = lllIIIIIllIIlIl("B7/OmhhTuSLt4m9xOLIVoUeAF/DuEqFi", "vPyun");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[16]] = lllIIIIIllIIlIl("eJbHFH8DgfvuA1wiDy0z5DGkoNoq2KCEm+avNetCVI6udWZu1f5FXA==", "pWJxj");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[17]] = lllIIIIIllIlIll("OQs3LDg0AClvKi4FLjJ3NAsZLjQqBS4oOzYBGC02OQ8=", "ZdZAY");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[18]] = lllIIIIIllIIlIl("BvHWhgTR9BU=", "PheZY");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[19]] = lllIIIIIllIIlIl("THOTsZOv8KbgZ1T1T2253bQuMmLyVt9l", "APJaY");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[20]] = lllIIIIIllIIlll("CuRp0gKNPIHjBGb6THnfy36lnjVArCJw", "bLUZk");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[21]] = lllIIIIIllIIlIl("wGq6GRHzlBQ=", "yDsyU");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[22]] = lllIIIIIllIIlIl("CZwXWOBHo8zyKm63jvbM1Oe5v9ep29pR", "iZCyb");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[23]] = lllIIIIIllIlIll("Fhk/Pg0K", "swKWy");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[24]] = lllIIIIIllIIlll("MtIHDHf9aYM=", "pnFcE");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[25]] = lllIIIIIllIIlll("V2sZeEzIg9s=", "mQSUP");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[26]] = lllIIIIIllIIlIl("nkYFs1u6+ec=", "kUfRx");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[27]] = lllIIIIIllIIlll("80UpPYJq8mY=", "AMHIe");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[28]] = lllIIIIIllIIlll("b3npJOlvsh8=", "BbNrF");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[29]] = lllIIIIIllIlIll("ByUnITgb", "bKSHL");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[30]] = lllIIIIIllIIlll("wXD8Ae7Vn5o=", "ELVpg");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[31]] = lllIIIIIllIIlll("IPZXVpFKCuc=", "cicli");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[32]] = lllIIIIIllIIlll("yz0AwRt1LsE=", "TUTVv");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[33]] = lllIIIIIllIIlIl("erUK4WMgbgI=", "YadVI");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[34]] = lllIIIIIllIIlll("+McB0PX4yZQ=", "pjwqd");
        CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[35]] = lllIIIIIllIIlll("OSeBkVK8+aE=", "EHfaw");
    }
    
    static {
        lllIIIIIlllllII();
        lllIIIIIlllIllI();
    }
    
    @Override
    public boolean isUsernameIndex(final String[] lllllllllllllIIlIIIIllIlIllIIIIl, final int lllllllllllllIIlIIIIllIlIlIlllll) {
        if (lllIIIIlIIIIlII(lllllllllllllIIlIIIIllIlIllIIIIl.length) && lllIIIIIllllllI(lllllllllllllIIlIIIIllIlIllIIIIl[CommandStats.lIlIIIIIlllIll[0]].equals(CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[35]]) ? 1 : 0) && lllIIIIlIIIIIII(lllllllllllllIIlIIIIllIlIlIlllll, CommandStats.lIlIIIIIlllIll[2])) {
            return CommandStats.lIlIIIIIlllIll[2] != 0;
        }
        return CommandStats.lIlIIIIIlllIll[0] != 0;
    }
    
    private static boolean lllIIIIlIIIIIll(final int lllllllllllllIIlIIIIllIlIIIIIIIl, final int lllllllllllllIIlIIIIllIlIIIIIIII) {
        return lllllllllllllIIlIIIIllIlIIIIIIIl <= lllllllllllllIIlIIIIllIlIIIIIIII;
    }
    
    private static String lllIIIIIllIIlll(final String lllllllllllllIIlIIIIllIlIIIlIlIl, final String lllllllllllllIIlIIIIllIlIIIlIlII) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIIllIlIIIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIllIlIIIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIIIllIlIIIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIIIllIlIIIlIlll.init(CommandStats.lIlIIIIIlllIll[1], lllllllllllllIIlIIIIllIlIIIllIII);
            return new String(lllllllllllllIIlIIIIllIlIIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIllIlIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIIllIlIIIlIllI) {
            lllllllllllllIIlIIIIllIlIIIlIllI.printStackTrace();
            return null;
        }
    }
    
    private static String lllIIIIIllIlIll(String lllllllllllllIIlIIIIllIlIIlIIlIl, final String lllllllllllllIIlIIIIllIlIIlIlIIl) {
        lllllllllllllIIlIIIIllIlIIlIIlIl = new String(Base64.getDecoder().decode(lllllllllllllIIlIIIIllIlIIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIIIllIlIIlIlIII = new StringBuilder();
        final char[] lllllllllllllIIlIIIIllIlIIlIIlll = lllllllllllllIIlIIIIllIlIIlIlIIl.toCharArray();
        int lllllllllllllIIlIIIIllIlIIlIIllI = CommandStats.lIlIIIIIlllIll[0];
        final byte lllllllllllllIIlIIIIllIlIIlIIIII = (Object)lllllllllllllIIlIIIIllIlIIlIIlIl.toCharArray();
        final int lllllllllllllIIlIIIIllIlIIIlllll = lllllllllllllIIlIIIIllIlIIlIIIII.length;
        long lllllllllllllIIlIIIIllIlIIIllllI = CommandStats.lIlIIIIIlllIll[0];
        while (lllIIIIIlllllIl((int)lllllllllllllIIlIIIIllIlIIIllllI, lllllllllllllIIlIIIIllIlIIIlllll)) {
            final char lllllllllllllIIlIIIIllIlIIlIlIll = lllllllllllllIIlIIIIllIlIIlIIIII[lllllllllllllIIlIIIIllIlIIIllllI];
            lllllllllllllIIlIIIIllIlIIlIlIII.append((char)(lllllllllllllIIlIIIIllIlIIlIlIll ^ lllllllllllllIIlIIIIllIlIIlIIlll[lllllllllllllIIlIIIIllIlIIlIIllI % lllllllllllllIIlIIIIllIlIIlIIlll.length]));
            "".length();
            ++lllllllllllllIIlIIIIllIlIIlIIllI;
            ++lllllllllllllIIlIIIIllIlIIIllllI;
            "".length();
            if ((0x24 ^ 0x3F ^ (0xE ^ 0x11)) > (0xEB ^ 0x8F ^ (0x7A ^ 0x1A))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIIIllIlIIlIlIII);
    }
    
    private static boolean lllIIIIlIIIIIIl(final Object lllllllllllllIIlIIIIllIIlllllllI) {
        return lllllllllllllIIlIIIIllIIlllllllI == null;
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIIlIIIIllIllIIIllll, final String[] lllllllllllllIIlIIIIllIllIIIlIIl, final BlockPos lllllllllllllIIlIIIIllIllIIIlIII) {
        List<String> list;
        if (lllIIIIlIIIIIII(lllllllllllllIIlIIIIllIllIIIlIIl.length, CommandStats.lIlIIIIIlllIll[2])) {
            final String[] lllllllllllllIIIIlIlllIIIllIllII = new String[CommandStats.lIlIIIIIlllIll[1]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandStats.lIlIIIIIlllIll[0]] = CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[23]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandStats.lIlIIIIIlllIll[2]] = CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[24]];
            list = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlIIIIllIllIIIlIIl, lllllllllllllIIIIlIlllIIIllIllII);
            "".length();
            if ("   ".length() < "  ".length()) {
                return null;
            }
        }
        else if (lllIIIIlIIIIIII(lllllllllllllIIlIIIIllIllIIIlIIl.length, CommandStats.lIlIIIIIlllIll[1]) && lllIIIIIllllllI(lllllllllllllIIlIIIIllIllIIIlIIl[CommandStats.lIlIIIIIlllIll[0]].equals(CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[25]]) ? 1 : 0)) {
            list = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlIIIIllIllIIIlIIl, this.func_175776_d());
            "".length();
            if (((0xBB ^ 0x9C ^ (0x6E ^ 0x13)) & (109 + 130 - 169 + 131 ^ 84 + 89 - 170 + 144 ^ -" ".length())) < 0) {
                return null;
            }
        }
        else if (lllIIIIlIIIIIlI(lllllllllllllIIlIIIIllIllIIIlIIl.length, CommandStats.lIlIIIIIlllIll[1]) && lllIIIIlIIIIIll(lllllllllllllIIlIIIIllIllIIIlIIl.length, CommandStats.lIlIIIIIlllIll[4]) && lllIIIIIllllllI(lllllllllllllIIlIIIIllIllIIIlIIl[CommandStats.lIlIIIIIlllIll[0]].equals(CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[26]]) ? 1 : 0)) {
            list = CommandBase.func_175771_a(lllllllllllllIIlIIIIllIllIIIlIIl, CommandStats.lIlIIIIIlllIll[2], lllllllllllllIIlIIIIllIllIIIlIII);
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        else if ((!lllIIIIlIIIIIII(lllllllllllllIIlIIIIllIllIIIlIIl.length, CommandStats.lIlIIIIIlllIll[3]) || lllIIIIIlllllll(lllllllllllllIIlIIIIllIllIIIlIIl[CommandStats.lIlIIIIIlllIll[0]].equals(CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[27]]) ? 1 : 0)) && (!lllIIIIlIIIIIII(lllllllllllllIIlIIIIllIllIIIlIIl.length, CommandStats.lIlIIIIIlllIll[5]) || lllIIIIIlllllll(lllllllllllllIIlIIIIllIllIIIlIIl[CommandStats.lIlIIIIIlllIll[0]].equals(CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[28]]) ? 1 : 0))) {
            if ((!lllIIIIlIIIIIII(lllllllllllllIIlIIIIllIllIIIlIIl.length, CommandStats.lIlIIIIIlllIll[4]) || lllIIIIIlllllll(lllllllllllllIIlIIIIllIllIIIlIIl[CommandStats.lIlIIIIIlllIll[0]].equals(CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[29]]) ? 1 : 0)) && (!lllIIIIlIIIIIII(lllllllllllllIIlIIIIllIllIIIlIIl.length, CommandStats.lIlIIIIIlllIll[6]) || lllIIIIIlllllll(lllllllllllllIIlIIIIllIllIIIlIIl[CommandStats.lIlIIIIIlllIll[0]].equals(CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[30]]) ? 1 : 0))) {
                if ((!lllIIIIlIIIIIII(lllllllllllllIIlIIIIllIllIIIlIIl.length, CommandStats.lIlIIIIIlllIll[6]) || lllIIIIIlllllll(lllllllllllllIIlIIIIllIllIIIlIIl[CommandStats.lIlIIIIIlllIll[0]].equals(CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[31]]) ? 1 : 0)) && (!lllIIIIlIIIIIII(lllllllllllllIIlIIIIllIllIIIlIIl.length, CommandStats.lIlIIIIIlllIll[8]) || lllIIIIIlllllll(lllllllllllllIIlIIIIllIllIIIlIIl[CommandStats.lIlIIIIIlllIll[0]].equals(CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[32]]) ? 1 : 0))) {
                    list = null;
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                else {
                    list = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlIIIIllIllIIIlIIl, this.func_175777_e());
                    "".length();
                    if ("  ".length() == " ".length()) {
                        return null;
                    }
                }
            }
            else {
                list = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlIIIIllIllIIIlIIl, CommandResultStats.Type.getTypeNames());
                "".length();
                if (-(29 + 111 - 18 + 75 ^ 154 + 35 - 30 + 33) >= 0) {
                    return null;
                }
            }
        }
        else {
            final String[] lllllllllllllIIIIlIlllIIIllIllII2 = new String[CommandStats.lIlIIIIIlllIll[1]];
            lllllllllllllIIIIlIlllIIIllIllII2[CommandStats.lIlIIIIIlllIll[0]] = CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[33]];
            lllllllllllllIIIIlIlllIIIllIllII2[CommandStats.lIlIIIIIlllIll[2]] = CommandStats.lIlIIIIIllIIIl[CommandStats.lIlIIIIIlllIll[34]];
            list = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlIIIIllIllIIIlIIl, lllllllllllllIIIIlIlllIIIllIllII2);
        }
        return list;
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandStats.lIlIIIIIlllIll[1];
    }
}
