// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import java.util.Arrays;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraft.inventory.IInventory;
import net.minecraft.command.ICommand;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTException;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.command.CommandException;
import net.minecraft.command.CommandResultStats;
import net.minecraft.command.WrongUsageException;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.Collection;
import net.minecraft.block.Block;
import java.util.List;
import net.minecraft.util.BlockPos;
import net.minecraft.command.ICommandSender;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.command.CommandBase;

public class CommandSetBlock extends CommandBase
{
    private static final /* synthetic */ int[] lIIIllIIIIlIll;
    private static final /* synthetic */ String[] lIIIllIIIIIlII;
    
    private static boolean llIIIIlIlIllIIl(final int lllllllllllllIlIIIIIlllIllIIlIII, final int lllllllllllllIlIIIIIlllIllIIIlll) {
        return lllllllllllllIlIIIIIlllIllIIlIII >= lllllllllllllIlIIIIIlllIllIIIlll;
    }
    
    private static void llIIIIlIlIlIIII() {
        (lIIIllIIIIIlII = new String[CommandSetBlock.lIIIllIIIIlIll[17]])[CommandSetBlock.lIIIllIIIIlIll[0]] = llIIIIlIlIIlIlI("vGGsl0l3LQ75Aousk9mV/w==", "QxpDM");
        CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[2]] = llIIIIlIlIIlIll("NCYOLgU5LRBtFzI9AS8LNCJNNhc2LgY=", "WIcCd");
        CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[1]] = llIIIIlIlIIlIlI("crfewv7hYcaBm0Zweth4Cf7GrhGljy6R", "HzyNg");
        CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[4]] = llIIIIlIlIIlIlI("PS3YBP59IbPiyssGqdxzFd9yklLW/s0YH1D5lzyqO6g=", "fKJAp");
        CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[3]] = llIIIIlIlIIlIll("IggpFyovAzdUOCQTJhYkIgxqDiomIjYIJDM=", "AgDzK");
        CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[5]] = llIIIIlIlIIlIlI("hea5BOb6Y8g=", "ONLcj");
        CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[8]] = llIIIIlIlIIlIlI("EJD96T9GmuM1SKLriSOM+HFCU68ufkIFR2ToWCrE448=", "zsBOv");
        CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[7]] = llIIIIlIlIIlIlI("rXe3UKrQ4b0=", "arQyx");
        CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[9]] = llIIIIlIlIIllII("pl92NA7K4ueOmeR8U6t9nG0mh4rWsoVohCBB4TneUdU=", "lwsqT");
        CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[10]] = llIIIIlIlIIlIlI("LYanCStU7FkBvEMSUXi49IyNOymkcyDuEIytr5df79U=", "kXcTj");
        CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[11]] = llIIIIlIlIIllII("q2t0lJGn8ow=", "vtQVj");
        CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[12]] = llIIIIlIlIIlIlI("ZGVH5FmSJ3E=", "Lhoag");
        CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[13]] = llIIIIlIlIIllII("9TosRZzM3Tg=", "MOABe");
        CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[14]] = llIIIIlIlIIlIll("Jz8fLg0qNAFtHyEkEC8DJztcMBknMxcwHw==", "DPrCl");
        CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[15]] = llIIIIlIlIIllII("YzOsXCa8MO4=", "ULDRz");
        CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[6]] = llIIIIlIlIIlIlI("OMMzEVsHhcQ=", "lpjYL");
        CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[16]] = llIIIIlIlIIlIlI("eLH8qzojAnQ=", "NbAvg");
    }
    
    private static boolean llIIIIlIlIlllIl(final Object lllllllllllllIlIIIIIlllIlIlllIIl) {
        return lllllllllllllIlIIIIIlllIlIlllIIl != null;
    }
    
    private static String llIIIIlIlIIlIll(String lllllllllllllIlIIIIIlllIlllIIlII, final String lllllllllllllIlIIIIIlllIlllIIIll) {
        lllllllllllllIlIIIIIlllIlllIIlII = new String(Base64.getDecoder().decode(lllllllllllllIlIIIIIlllIlllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIIlllIlllIIlll = new StringBuilder();
        final char[] lllllllllllllIlIIIIIlllIlllIIllI = lllllllllllllIlIIIIIlllIlllIIIll.toCharArray();
        int lllllllllllllIlIIIIIlllIlllIIlIl = CommandSetBlock.lIIIllIIIIlIll[0];
        final float lllllllllllllIlIIIIIlllIllIlllll = (Object)lllllllllllllIlIIIIIlllIlllIIlII.toCharArray();
        final char lllllllllllllIlIIIIIlllIllIllllI = (char)lllllllllllllIlIIIIIlllIllIlllll.length;
        String lllllllllllllIlIIIIIlllIllIlllIl = (String)CommandSetBlock.lIIIllIIIIlIll[0];
        while (llIIIIlIlIllIII((int)lllllllllllllIlIIIIIlllIllIlllIl, lllllllllllllIlIIIIIlllIllIllllI)) {
            final char lllllllllllllIlIIIIIlllIlllIlIlI = lllllllllllllIlIIIIIlllIllIlllll[lllllllllllllIlIIIIIlllIllIlllIl];
            lllllllllllllIlIIIIIlllIlllIIlll.append((char)(lllllllllllllIlIIIIIlllIlllIlIlI ^ lllllllllllllIlIIIIIlllIlllIIllI[lllllllllllllIlIIIIIlllIlllIIlIl % lllllllllllllIlIIIIIlllIlllIIllI.length]));
            "".length();
            ++lllllllllllllIlIIIIIlllIlllIIlIl;
            ++lllllllllllllIlIIIIIlllIllIlllIl;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIIlllIlllIIlll);
    }
    
    private static void llIIIIlIlIlIlll() {
        (lIIIllIIIIlIll = new int[18])[0] = ((0x9E ^ 0x95) & ~(0x52 ^ 0x59));
        CommandSetBlock.lIIIllIIIIlIll[1] = "  ".length();
        CommandSetBlock.lIIIllIIIIlIll[2] = " ".length();
        CommandSetBlock.lIIIllIIIIlIll[3] = (0x13 ^ 0x17);
        CommandSetBlock.lIIIllIIIIlIll[4] = "   ".length();
        CommandSetBlock.lIIIllIIIIlIll[5] = (0x67 ^ 0x28 ^ (0xD4 ^ 0x9E));
        CommandSetBlock.lIIIllIIIIlIll[6] = (0x78 ^ 0x77);
        CommandSetBlock.lIIIllIIIIlIll[7] = (0x8E ^ 0x89);
        CommandSetBlock.lIIIllIIIIlIll[8] = (0x28 ^ 0x2E);
        CommandSetBlock.lIIIllIIIIlIll[9] = (0xC8 ^ 0xC0);
        CommandSetBlock.lIIIllIIIIlIll[10] = (0xA0 ^ 0xA9);
        CommandSetBlock.lIIIllIIIIlIll[11] = (0x8F ^ 0xB1 ^ (0xBA ^ 0x8E));
        CommandSetBlock.lIIIllIIIIlIll[12] = (69 + 125 - 181 + 128 ^ 41 + 15 + 65 + 13);
        CommandSetBlock.lIIIllIIIIlIll[13] = (0xCC ^ 0xC0);
        CommandSetBlock.lIIIllIIIIlIll[14] = (0x43 ^ 0x4E);
        CommandSetBlock.lIIIllIIIIlIll[15] = (0xA6 ^ 0xA8);
        CommandSetBlock.lIIIllIIIIlIll[16] = (0x2C ^ 0x56 ^ (0x77 ^ 0x1D));
        CommandSetBlock.lIIIllIIIIlIll[17] = (0x6B ^ 0x61 ^ (0x22 ^ 0x39));
    }
    
    @Override
    public String getCommandName() {
        return CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[0]];
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIlIIIIIllllIIIIIlIl, final String[] lllllllllllllIlIIIIIllllIIIIIlII, final BlockPos lllllllllllllIlIIIIIllllIIIIIIIl) {
        List<String> list;
        if (llIIIIlIlIllllI(lllllllllllllIlIIIIIllllIIIIIlII.length) && llIIIIlIlIlllll(lllllllllllllIlIIIIIllllIIIIIlII.length, CommandSetBlock.lIIIllIIIIlIll[4])) {
            list = CommandBase.func_175771_a(lllllllllllllIlIIIIIllllIIIIIlII, CommandSetBlock.lIIIllIIIIlIll[0], lllllllllllllIlIIIIIllllIIIIIIIl);
            "".length();
            if ("   ".length() == -" ".length()) {
                return null;
            }
        }
        else if (llIIIIlIllIIIII(lllllllllllllIlIIIIIllllIIIIIlII.length, CommandSetBlock.lIIIllIIIIlIll[3])) {
            list = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIlIIIIIllllIIIIIlII, Block.blockRegistry.getKeys());
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        else if (llIIIIlIllIIIII(lllllllllllllIlIIIIIllllIIIIIlII.length, CommandSetBlock.lIIIllIIIIlIll[8])) {
            final String[] lllllllllllllIIIIlIlllIIIllIllII = new String[CommandSetBlock.lIIIllIIIIlIll[4]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandSetBlock.lIIIllIIIIlIll[0]] = CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[15]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandSetBlock.lIIIllIIIIlIll[2]] = CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[6]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandSetBlock.lIIIllIIIIlIll[1]] = CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[16]];
            list = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIlIIIIIllllIIIIIlII, lllllllllllllIIIIlIlllIIIllIllII);
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
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIlIIIIIllllIIlIllll) {
        return CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[2]];
    }
    
    private static boolean llIIIIlIlIllIII(final int lllllllllllllIlIIIIIlllIllIIIlII, final int lllllllllllllIlIIIIIlllIllIIIIll) {
        return lllllllllllllIlIIIIIlllIllIIIlII < lllllllllllllIlIIIIIlllIllIIIIll;
    }
    
    private static String llIIIIlIlIIllII(final String lllllllllllllIlIIIIIlllIllllIlll, final String lllllllllllllIlIIIIIlllIllllIllI) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIlllIllllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIlllIllllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIIIlllIlllllIll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIIIlllIlllllIll.init(CommandSetBlock.lIIIllIIIIlIll[1], lllllllllllllIlIIIIIlllIllllllII);
            return new String(lllllllllllllIlIIIIIlllIlllllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIlllIllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIlllIlllllIlI) {
            lllllllllllllIlIIIIIlllIlllllIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIlIIIIIllllIIlIIIIl, final String[] lllllllllllllIlIIIIIllllIIlIIIII) throws CommandException {
        if (llIIIIlIlIllIII(lllllllllllllIlIIIIIllllIIlIIIII.length, CommandSetBlock.lIIIllIIIIlIll[3])) {
            throw new WrongUsageException(CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[1]], new Object[CommandSetBlock.lIIIllIIIIlIll[0]]);
        }
        lllllllllllllIlIIIIIllllIIlIIIIl.setCommandStat(CommandResultStats.Type.AFFECTED_BLOCKS, CommandSetBlock.lIIIllIIIIlIll[0]);
        final BlockPos lllllllllllllIlIIIIIllllIIIlllll = CommandBase.parseBlockPos(lllllllllllllIlIIIIIllllIIlIIIIl, lllllllllllllIlIIIIIllllIIlIIIII, CommandSetBlock.lIIIllIIIIlIll[0], (boolean)(CommandSetBlock.lIIIllIIIIlIll[0] != 0));
        final Block lllllllllllllIlIIIIIllllIIIllllI = CommandBase.getBlockByText(lllllllllllllIlIIIIIllllIIlIIIIl, lllllllllllllIlIIIIIllllIIlIIIII[CommandSetBlock.lIIIllIIIIlIll[4]]);
        int lllllllllllllIlIIIIIllllIIIlllIl = CommandSetBlock.lIIIllIIIIlIll[0];
        if (llIIIIlIlIllIIl(lllllllllllllIlIIIIIllllIIlIIIII.length, CommandSetBlock.lIIIllIIIIlIll[5])) {
            lllllllllllllIlIIIIIllllIIIlllIl = CommandBase.parseInt(lllllllllllllIlIIIIIllllIIlIIIII[CommandSetBlock.lIIIllIIIIlIll[3]], CommandSetBlock.lIIIllIIIIlIll[0], CommandSetBlock.lIIIllIIIIlIll[6]);
        }
        final World lllllllllllllIlIIIIIllllIIIlllII = lllllllllllllIlIIIIIllllIIlIIIIl.getEntityWorld();
        if (llIIIIlIlIllIlI(lllllllllllllIlIIIIIllllIIIlllII.isBlockLoaded(lllllllllllllIlIIIIIllllIIIlllll) ? 1 : 0)) {
            throw new CommandException(CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[4]], new Object[CommandSetBlock.lIIIllIIIIlIll[0]]);
        }
        NBTTagCompound lllllllllllllIlIIIIIllllIIIllIll = new NBTTagCompound();
        boolean lllllllllllllIlIIIIIllllIIIllIlI = CommandSetBlock.lIIIllIIIIlIll[0] != 0;
        if (llIIIIlIlIllIIl(lllllllllllllIlIIIIIllllIIlIIIII.length, CommandSetBlock.lIIIllIIIIlIll[7]) && llIIIIlIlIllIll(lllllllllllllIlIIIIIllllIIIllllI.hasTileEntity() ? 1 : 0)) {
            final String lllllllllllllIlIIIIIllllIIIllIIl = CommandBase.getChatComponentFromNthArg(lllllllllllllIlIIIIIllllIIlIIIIl, lllllllllllllIlIIIIIllllIIlIIIII, CommandSetBlock.lIIIllIIIIlIll[8]).getUnformattedText();
            try {
                lllllllllllllIlIIIIIllllIIIllIll = JsonToNBT.getTagFromJson(lllllllllllllIlIIIIIllllIIIllIIl);
                lllllllllllllIlIIIIIllllIIIllIlI = (CommandSetBlock.lIIIllIIIIlIll[2] != 0);
                "".length();
                if ((0x4 ^ 0x0) <= "   ".length()) {
                    return;
                }
            }
            catch (NBTException lllllllllllllIlIIIIIllllIIIllIII) {
                final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[3]];
                final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandSetBlock.lIIIllIIIIlIll[2]];
                lllllllllllllIlIIIIIIlIlIllIIlIl[CommandSetBlock.lIIIllIIIIlIll[0]] = lllllllllllllIlIIIIIllllIIIllIII.getMessage();
                throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
            }
        }
        if (llIIIIlIlIllIIl(lllllllllllllIlIIIIIllllIIlIIIII.length, CommandSetBlock.lIIIllIIIIlIll[8])) {
            if (llIIIIlIlIllIll(lllllllllllllIlIIIIIllllIIlIIIII[CommandSetBlock.lIIIllIIIIlIll[5]].equals(CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[5]]) ? 1 : 0)) {
                lllllllllllllIlIIIIIllllIIIlllII.destroyBlock(lllllllllllllIlIIIIIllllIIIlllll, (boolean)(CommandSetBlock.lIIIllIIIIlIll[2] != 0));
                "".length();
                if (llIIIIlIlIlllII(lllllllllllllIlIIIIIllllIIIllllI, Blocks.air)) {
                    CommandBase.notifyOperators(lllllllllllllIlIIIIIllllIIlIIIIl, this, CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[8]], new Object[CommandSetBlock.lIIIllIIIIlIll[0]]);
                    return;
                }
            }
            else if (llIIIIlIlIllIll(lllllllllllllIlIIIIIllllIIlIIIII[CommandSetBlock.lIIIllIIIIlIll[5]].equals(CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[7]]) ? 1 : 0) && llIIIIlIlIllIlI(lllllllllllllIlIIIIIllllIIIlllII.isAirBlock(lllllllllllllIlIIIIIllllIIIlllll) ? 1 : 0)) {
                throw new CommandException(CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[9]], new Object[CommandSetBlock.lIIIllIIIIlIll[0]]);
            }
        }
        final TileEntity lllllllllllllIlIIIIIllllIIIlIlll = lllllllllllllIlIIIIIllllIIIlllII.getTileEntity(lllllllllllllIlIIIIIllllIIIlllll);
        if (llIIIIlIlIlllIl(lllllllllllllIlIIIIIllllIIIlIlll)) {
            if (llIIIIlIlIllIll((lllllllllllllIlIIIIIllllIIIlIlll instanceof IInventory) ? 1 : 0)) {
                ((IInventory)lllllllllllllIlIIIIIllllIIIlIlll).clear();
            }
            final World world = lllllllllllllIlIIIIIllllIIIlllII;
            final BlockPos lllllllllllllIIIlIlIIIIIlIIIIIlI = lllllllllllllIlIIIIIllllIIIlllll;
            final IBlockState defaultState = Blocks.air.getDefaultState();
            int lllllllllllllIIIlIlIIIIIlIIIlIII;
            if (llIIIIlIlIlllII(lllllllllllllIlIIIIIllllIIIllllI, Blocks.air)) {
                lllllllllllllIIIlIlIIIIIlIIIlIII = CommandSetBlock.lIIIllIIIIlIll[1];
                "".length();
                if (((0x6C ^ 0xC) & ~(0x49 ^ 0x29)) < 0) {
                    return;
                }
            }
            else {
                lllllllllllllIIIlIlIIIIIlIIIlIII = CommandSetBlock.lIIIllIIIIlIll[3];
            }
            world.setBlockState(lllllllllllllIIIlIlIIIIIlIIIIIlI, defaultState, lllllllllllllIIIlIlIIIIIlIIIlIII);
            "".length();
        }
        final IBlockState lllllllllllllIlIIIIIllllIIIlIllI = lllllllllllllIlIIIIIllllIIIllllI.getStateFromMeta(lllllllllllllIlIIIIIllllIIIlllIl);
        if (llIIIIlIlIllIlI(lllllllllllllIlIIIIIllllIIIlllII.setBlockState(lllllllllllllIlIIIIIllllIIIlllll, lllllllllllllIlIIIIIllllIIIlIllI, CommandSetBlock.lIIIllIIIIlIll[1]) ? 1 : 0)) {
            throw new CommandException(CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[10]], new Object[CommandSetBlock.lIIIllIIIIlIll[0]]);
        }
        if (llIIIIlIlIllIll(lllllllllllllIlIIIIIllllIIIllIlI ? 1 : 0)) {
            final TileEntity lllllllllllllIlIIIIIllllIIIlIlIl = lllllllllllllIlIIIIIllllIIIlllII.getTileEntity(lllllllllllllIlIIIIIllllIIIlllll);
            if (llIIIIlIlIlllIl(lllllllllllllIlIIIIIllllIIIlIlIl)) {
                lllllllllllllIlIIIIIllllIIIllIll.setInteger(CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[11]], lllllllllllllIlIIIIIllllIIIlllll.getX());
                lllllllllllllIlIIIIIllllIIIllIll.setInteger(CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[12]], lllllllllllllIlIIIIIllllIIIlllll.getY());
                lllllllllllllIlIIIIIllllIIIllIll.setInteger(CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[13]], lllllllllllllIlIIIIIllllIIIlllll.getZ());
                lllllllllllllIlIIIIIllllIIIlIlIl.readFromNBT(lllllllllllllIlIIIIIllllIIIllIll);
            }
        }
        lllllllllllllIlIIIIIllllIIIlllII.notifyNeighborsRespectDebug(lllllllllllllIlIIIIIllllIIIlllll, lllllllllllllIlIIIIIllllIIIlIllI.getBlock());
        lllllllllllllIlIIIIIllllIIlIIIIl.setCommandStat(CommandResultStats.Type.AFFECTED_BLOCKS, CommandSetBlock.lIIIllIIIIlIll[2]);
        CommandBase.notifyOperators(lllllllllllllIlIIIIIllllIIlIIIIl, this, CommandSetBlock.lIIIllIIIIIlII[CommandSetBlock.lIIIllIIIIlIll[14]], new Object[CommandSetBlock.lIIIllIIIIlIll[0]]);
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandSetBlock.lIIIllIIIIlIll[1];
    }
    
    private static boolean llIIIIlIlIllIll(final int lllllllllllllIlIIIIIlllIlIllIlll) {
        return lllllllllllllIlIIIIIlllIlIllIlll != 0;
    }
    
    private static boolean llIIIIlIlIlllII(final Object lllllllllllllIlIIIIIlllIlIllllII, final Object lllllllllllllIlIIIIIlllIlIlllIll) {
        return lllllllllllllIlIIIIIlllIlIllllII == lllllllllllllIlIIIIIlllIlIlllIll;
    }
    
    private static boolean llIIIIlIlIlllll(final int lllllllllllllIlIIIIIlllIllIIIIII, final int lllllllllllllIlIIIIIlllIlIllllll) {
        return lllllllllllllIlIIIIIlllIllIIIIII <= lllllllllllllIlIIIIIlllIlIllllll;
    }
    
    private static String llIIIIlIlIIlIlI(final String lllllllllllllIlIIIIIlllIllIlIIlI, final String lllllllllllllIlIIIIIlllIllIlIIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIlllIllIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIlllIllIlIIll.getBytes(StandardCharsets.UTF_8)), CommandSetBlock.lIIIllIIIIlIll[9]), "DES");
            final Cipher lllllllllllllIlIIIIIlllIllIlIllI = Cipher.getInstance("DES");
            lllllllllllllIlIIIIIlllIllIlIllI.init(CommandSetBlock.lIIIllIIIIlIll[1], lllllllllllllIlIIIIIlllIllIlIlll);
            return new String(lllllllllllllIlIIIIIlllIllIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIlllIllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIlllIllIlIlIl) {
            lllllllllllllIlIIIIIlllIllIlIlIl.printStackTrace();
            return null;
        }
    }
    
    static {
        llIIIIlIlIlIlll();
        llIIIIlIlIlIIII();
    }
    
    private static boolean llIIIIlIlIllIlI(final int lllllllllllllIlIIIIIlllIlIllIlIl) {
        return lllllllllllllIlIIIIIlllIlIllIlIl == 0;
    }
    
    private static boolean llIIIIlIllIIIII(final int lllllllllllllIlIIIIIlllIllIIllII, final int lllllllllllllIlIIIIIlllIllIIlIll) {
        return lllllllllllllIlIIIIIlllIllIIllII == lllllllllllllIlIIIIIlllIllIIlIll;
    }
    
    private static boolean llIIIIlIlIllllI(final int lllllllllllllIlIIIIIlllIlIllIIll) {
        return lllllllllllllIlIIIIIlllIlIllIIll > 0;
    }
}
