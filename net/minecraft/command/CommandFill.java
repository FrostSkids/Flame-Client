// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.util.Iterator;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.World;
import net.minecraft.inventory.IInventory;
import net.minecraft.init.Blocks;
import com.google.common.collect.Lists;
import net.minecraft.nbt.NBTException;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.nbt.NBTTagCompound;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collection;
import net.minecraft.block.Block;
import java.util.List;
import net.minecraft.util.BlockPos;

public class CommandFill extends CommandBase
{
    private static final /* synthetic */ int[] llIlIlIIlIlllI;
    private static final /* synthetic */ String[] llIlIlIIlIlIlI;
    
    private static boolean lIIlIIlllllIllIl(final int llllllllllllIllIlIlIllIIIIIlIIll) {
        return llllllllllllIllIlIlIllIIIIIlIIll != 0;
    }
    
    private static boolean lIIlIIlllllIlllI(final Object llllllllllllIllIlIlIllIIIIIlllII, final Object llllllllllllIllIlIlIllIIIIIllIll) {
        return llllllllllllIllIlIlIllIIIIIlllII != llllllllllllIllIlIlIllIIIIIllIll;
    }
    
    @Override
    public String getCommandName() {
        return CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[0]];
    }
    
    private static boolean lIIlIIllllllIlIl(final int llllllllllllIllIlIlIllIIIIllIIII, final int llllllllllllIllIlIlIllIIIIlIllll) {
        return llllllllllllIllIlIlIllIIIIllIIII == llllllllllllIllIlIlIllIIIIlIllll;
    }
    
    private static void lIIlIIlllllIIIII() {
        (llIlIlIIlIlIlI = new String[CommandFill.llIlIlIIlIlllI[26]])[CommandFill.llIlIlIIlIlllI[0]] = lIIlIIllllIllIlI("xbkycogorVk=", "BgGWW");
        CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[2]] = lIIlIIllllIllIlI("AArinbmUZCDFM3Gf6tonNnObNvbNf0n7", "RoHpV");
        CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[1]] = lIIlIIllllIllIll("xo/zTNxMLP3ZXFkx+/lvZp/c5Oa5WyV2", "HPOlR");
        CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[4]] = lIIlIIllllIllIll("hjl53ZhynlM54Gt/63XeuWFe0piottSo6B9Lrj8QZpo=", "kupfu");
        CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[10]] = lIIlIIllllIllIll("6F5Iml9TNCxDNP2KTSUDadj1AZI4nYG5MAdfN+3DQko=", "GEtTA");
        CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[14]] = lIIlIIllllIllIll("KZbyObRsTerwG0o6dj4zjT0scMgHk0a/", "quMqf");
        CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[5]] = lIIlIIllllIllIll("5Vff45bSwuU=", "GDeMF");
        CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[3]] = lIIlIIllllIllIlI("rOfVvnHV03E=", "ekFXs");
        CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[6]] = lIIlIIllllIllIll("5N5gScs56SY=", "OhnvJ");
        CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[13]] = lIIlIIllllIlllIl("HRwxIw==", "vyTSU");
        CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[12]] = lIIlIIllllIllIlI("En68jhKJzeg=", "bhgtk");
        CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[15]] = lIIlIIllllIlllIl("CyQ8OSUU", "cKPUJ");
        CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[16]] = lIIlIIllllIlllIl("Kw==", "SQcRb");
        CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[17]] = lIIlIIllllIllIlI("KKODR0ZB6Bw=", "tpJoz");
        CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[18]] = lIIlIIllllIllIlI("ffyTSXdN0qk=", "HxVQE");
        CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[7]] = lIIlIIllllIllIll("8SdHbJ242U6aBQ7vyKeDTn1w5+yZYo7Q", "HDMxw");
        CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[11]] = lIIlIIllllIllIlI("KVlX6e0z9kgeXXPvS9Cig7jyj35D8Pcw", "eAGgG");
        CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[19]] = lIIlIIllllIllIll("vnsyVHsnVg36wc6yFnyQk5fiYrcYp2/y8CzIcIw1JGE=", "GmfMz");
        CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[20]] = lIIlIIllllIllIll("xVQk78f/gRk=", "FXmil");
        CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[21]] = lIIlIIllllIllIll("EeAV/3b1KRs=", "eOLka");
        CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[22]] = lIIlIIllllIllIlI("35c7ubupElo=", "ZYEgv");
        CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[23]] = lIIlIIllllIlllIl("Hjw/GiEB", "vSSvN");
        CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[24]] = lIIlIIllllIlllIl("FjkfAh8XKQ==", "yLknv");
        CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[25]] = lIIlIIllllIllIlI("8o7nNfOSkRA=", "ZwsTC");
    }
    
    @Override
    public String getCommandUsage(final ICommandSender llllllllllllIllIlIlIllIIlIllIlIl) {
        return CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[2]];
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandFill.llIlIlIIlIlllI[1];
    }
    
    private static boolean lIIlIIlllllIllII(final int llllllllllllIllIlIlIllIIIIIlIIIl) {
        return llllllllllllIllIlIlIllIIIIIlIIIl == 0;
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender llllllllllllIllIlIlIllIIIllIlIIl, final String[] llllllllllllIllIlIlIllIIIllIIllI, final BlockPos llllllllllllIllIlIlIllIIIllIIlIl) {
        List<String> list;
        if (lIIlIIllllllIIll(llllllllllllIllIlIlIllIIIllIIllI.length) && lIIlIIllllllIlII(llllllllllllIllIlIlIllIIIllIIllI.length, CommandFill.llIlIlIIlIlllI[4])) {
            list = CommandBase.func_175771_a(llllllllllllIllIlIlIllIIIllIIllI, CommandFill.llIlIlIIlIlllI[0], llllllllllllIllIlIlIllIIIllIIlIl);
            "".length();
            if ("   ".length() < ((0x18 ^ 0x58) & ~(0x2C ^ 0x6C))) {
                return null;
            }
        }
        else if (lIIlIIlllllIlIlI(llllllllllllIllIlIlIllIIIllIIllI.length, CommandFill.llIlIlIIlIlllI[4]) && lIIlIIllllllIlII(llllllllllllIllIlIlIllIIIllIIllI.length, CommandFill.llIlIlIIlIlllI[5])) {
            list = CommandBase.func_175771_a(llllllllllllIllIlIlIllIIIllIIllI, CommandFill.llIlIlIIlIlllI[4], llllllllllllIllIlIlIllIIIllIIlIl);
            "".length();
            if (((0x88 ^ 0xA3) & ~(0xB1 ^ 0x9A)) < 0) {
                return null;
            }
        }
        else if (lIIlIIllllllIlIl(llllllllllllIllIlIlIllIIIllIIllI.length, CommandFill.llIlIlIIlIlllI[3])) {
            list = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIllIlIlIllIIIllIIllI, Block.blockRegistry.getKeys());
            "".length();
            if ((169 + 117 - 168 + 59 ^ 149 + 13 - 89 + 108) <= 0) {
                return null;
            }
        }
        else if (lIIlIIllllllIlIl(llllllllllllIllIlIlIllIIIllIIllI.length, CommandFill.llIlIlIIlIlllI[13])) {
            final String[] lllllllllllllIIIIlIlllIIIllIllII = new String[CommandFill.llIlIlIIlIlllI[14]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandFill.llIlIlIIlIlllI[0]] = CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[20]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandFill.llIlIlIIlIlllI[2]] = CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[21]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandFill.llIlIlIIlIlllI[1]] = CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[22]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandFill.llIlIlIIlIlllI[4]] = CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[23]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandFill.llIlIlIIlIlllI[10]] = CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[24]];
            list = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIllIlIlIllIIIllIIllI, lllllllllllllIIIIlIlllIIIllIllII);
            "".length();
            if (-" ".length() >= " ".length()) {
                return null;
            }
        }
        else if (lIIlIIllllllIlIl(llllllllllllIllIlIlIllIIIllIIllI.length, CommandFill.llIlIlIIlIlllI[12]) && lIIlIIlllllIllIl(CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[25]].equals(llllllllllllIllIlIlIllIIIllIIllI[CommandFill.llIlIlIIlIlllI[6]]) ? 1 : 0)) {
            list = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIllIlIlIllIIIllIIllI, Block.blockRegistry.getKeys());
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        else {
            list = null;
        }
        return list;
    }
    
    private static boolean lIIlIIllllllIIII(final Object llllllllllllIllIlIlIllIIIIIllIIl) {
        return llllllllllllIllIlIlIllIIIIIllIIl != null;
    }
    
    private static String lIIlIIllllIlllIl(String llllllllllllIllIlIlIllIIIIlllIll, final String llllllllllllIllIlIlIllIIIIlllIlI) {
        llllllllllllIllIlIlIllIIIIlllIll = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIlIllIIIIlllIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIlIllIIIIlllllI = new StringBuilder();
        final char[] llllllllllllIllIlIlIllIIIIllllIl = llllllllllllIllIlIlIllIIIIlllIlI.toCharArray();
        int llllllllllllIllIlIlIllIIIIllllII = CommandFill.llIlIlIIlIlllI[0];
        final Exception llllllllllllIllIlIlIllIIIIllIllI = (Object)((String)llllllllllllIllIlIlIllIIIIlllIll).toCharArray();
        final double llllllllllllIllIlIlIllIIIIllIlIl = llllllllllllIllIlIlIllIIIIllIllI.length;
        long llllllllllllIllIlIlIllIIIIllIlII = CommandFill.llIlIlIIlIlllI[0];
        while (lIIlIIlllllIlIII((int)llllllllllllIllIlIlIllIIIIllIlII, (int)llllllllllllIllIlIlIllIIIIllIlIl)) {
            final char llllllllllllIllIlIlIllIIIlIIIIIl = llllllllllllIllIlIlIllIIIIllIllI[llllllllllllIllIlIlIllIIIIllIlII];
            llllllllllllIllIlIlIllIIIIlllllI.append((char)(llllllllllllIllIlIlIllIIIlIIIIIl ^ llllllllllllIllIlIlIllIIIIllllIl[llllllllllllIllIlIlIllIIIIllllII % llllllllllllIllIlIlIllIIIIllllIl.length]));
            "".length();
            ++llllllllllllIllIlIlIllIIIIllllII;
            ++llllllllllllIllIlIlIllIIIIllIlII;
            "".length();
            if (" ".length() == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIlIllIIIIlllllI);
    }
    
    @Override
    public void processCommand(final ICommandSender llllllllllllIllIlIlIllIIlIIllllI, final String[] llllllllllllIllIlIlIllIIlIIlllIl) throws CommandException {
        if (lIIlIIlllllIlIII(llllllllllllIllIlIlIllIIlIIlllIl.length, CommandFill.llIlIlIIlIlllI[3])) {
            throw new WrongUsageException(CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[1]], new Object[CommandFill.llIlIlIIlIlllI[0]]);
        }
        llllllllllllIllIlIlIllIIlIIllllI.setCommandStat(CommandResultStats.Type.AFFECTED_BLOCKS, CommandFill.llIlIlIIlIlllI[0]);
        final BlockPos llllllllllllIllIlIlIllIIlIIlllII = CommandBase.parseBlockPos(llllllllllllIllIlIlIllIIlIIllllI, llllllllllllIllIlIlIllIIlIIlllIl, CommandFill.llIlIlIIlIlllI[0], (boolean)(CommandFill.llIlIlIIlIlllI[0] != 0));
        final BlockPos llllllllllllIllIlIlIllIIlIIllIll = CommandBase.parseBlockPos(llllllllllllIllIlIlIllIIlIIllllI, llllllllllllIllIlIlIllIIlIIlllIl, CommandFill.llIlIlIIlIlllI[4], (boolean)(CommandFill.llIlIlIIlIlllI[0] != 0));
        final Block llllllllllllIllIlIlIllIIlIIllIlI = CommandBase.getBlockByText(llllllllllllIllIlIlIllIIlIIllllI, llllllllllllIllIlIlIllIIlIIlllIl[CommandFill.llIlIlIIlIlllI[5]]);
        int llllllllllllIllIlIlIllIIlIIllIIl = CommandFill.llIlIlIIlIlllI[0];
        if (lIIlIIlllllIlIIl(llllllllllllIllIlIlIllIIlIIlllIl.length, CommandFill.llIlIlIIlIlllI[6])) {
            llllllllllllIllIlIlIllIIlIIllIIl = CommandBase.parseInt(llllllllllllIllIlIlIllIIlIIlllIl[CommandFill.llIlIlIIlIlllI[3]], CommandFill.llIlIlIIlIlllI[0], CommandFill.llIlIlIIlIlllI[7]);
        }
        final BlockPos llllllllllllIllIlIlIllIIlIIllIII = new BlockPos(Math.min(llllllllllllIllIlIlIllIIlIIlllII.getX(), llllllllllllIllIlIlIllIIlIIllIll.getX()), Math.min(llllllllllllIllIlIlIllIIlIIlllII.getY(), llllllllllllIllIlIlIllIIlIIllIll.getY()), Math.min(llllllllllllIllIlIlIllIIlIIlllII.getZ(), llllllllllllIllIlIlIllIIlIIllIll.getZ()));
        final BlockPos llllllllllllIllIlIlIllIIlIIlIlll = new BlockPos(Math.max(llllllllllllIllIlIlIllIIlIIlllII.getX(), llllllllllllIllIlIlIllIIlIIllIll.getX()), Math.max(llllllllllllIllIlIlIllIIlIIlllII.getY(), llllllllllllIllIlIlIllIIlIIllIll.getY()), Math.max(llllllllllllIllIlIlIllIIlIIlllII.getZ(), llllllllllllIllIlIlIllIIlIIllIll.getZ()));
        int llllllllllllIllIlIlIllIIlIIlIllI = (llllllllllllIllIlIlIllIIlIIlIlll.getX() - llllllllllllIllIlIlIllIIlIIllIII.getX() + CommandFill.llIlIlIIlIlllI[2]) * (llllllllllllIllIlIlIllIIlIIlIlll.getY() - llllllllllllIllIlIlIllIIlIIllIII.getY() + CommandFill.llIlIlIIlIlllI[2]) * (llllllllllllIllIlIlIllIIlIIlIlll.getZ() - llllllllllllIllIlIlIllIIlIIllIII.getZ() + CommandFill.llIlIlIIlIlllI[2]);
        if (lIIlIIlllllIlIlI(llllllllllllIllIlIlIllIIlIIlIllI, CommandFill.llIlIlIIlIlllI[8])) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[4]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandFill.llIlIlIIlIlllI[1]];
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandFill.llIlIlIIlIlllI[0]] = llllllllllllIllIlIlIllIIlIIlIllI;
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandFill.llIlIlIIlIlllI[2]] = CommandFill.llIlIlIIlIlllI[8];
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
        }
        if (!lIIlIIlllllIlIll(llllllllllllIllIlIlIllIIlIIllIII.getY()) || !lIIlIIlllllIlIII(llllllllllllIllIlIlIllIIlIIlIlll.getY(), CommandFill.llIlIlIIlIlllI[9])) {
            throw new CommandException(CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[19]], new Object[CommandFill.llIlIlIIlIlllI[0]]);
        }
        final World llllllllllllIllIlIlIllIIlIIlIlIl = llllllllllllIllIlIlIllIIlIIllllI.getEntityWorld();
        int llllllllllllIllIlIlIllIIlIIlIlII = llllllllllllIllIlIlIllIIlIIllIII.getZ();
        "".length();
        if ((0xA3 ^ 0xA7) <= " ".length()) {
            return;
        }
        while (!lIIlIIlllllIlIIl(llllllllllllIllIlIlIllIIlIIlIlII, llllllllllllIllIlIlIllIIlIIlIlll.getZ() + CommandFill.llIlIlIIlIlllI[11])) {
            int llllllllllllIllIlIlIllIIlIIlIIll = llllllllllllIllIlIlIllIIlIIllIII.getX();
            "".length();
            if ((0xA5 ^ 0xA1) != (0x90 ^ 0x94)) {
                return;
            }
            while (!lIIlIIlllllIlIIl(llllllllllllIllIlIlIllIIlIIlIIll, llllllllllllIllIlIlIllIIlIIlIlll.getX() + CommandFill.llIlIlIIlIlllI[11])) {
                if (lIIlIIlllllIllII(llllllllllllIllIlIlIllIIlIIlIlIl.isBlockLoaded(new BlockPos(llllllllllllIllIlIlIllIIlIIlIIll, llllllllllllIllIlIlIllIIlIIlIlll.getY() - llllllllllllIllIlIlIllIIlIIllIII.getY(), llllllllllllIllIlIlIllIIlIIlIlII)) ? 1 : 0)) {
                    throw new CommandException(CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[10]], new Object[CommandFill.llIlIlIIlIlllI[0]]);
                }
                llllllllllllIllIlIlIllIIlIIlIIll += 16;
            }
            llllllllllllIllIlIlIllIIlIIlIlII += 16;
        }
        NBTTagCompound llllllllllllIllIlIlIllIIlIIlIIlI = new NBTTagCompound();
        boolean llllllllllllIllIlIlIllIIlIIlIIIl = CommandFill.llIlIlIIlIlllI[0] != 0;
        if (lIIlIIlllllIlIIl(llllllllllllIllIlIlIllIIlIIlllIl.length, CommandFill.llIlIlIIlIlllI[12]) && lIIlIIlllllIllIl(llllllllllllIllIlIlIllIIlIIllIlI.hasTileEntity() ? 1 : 0)) {
            final String llllllllllllIllIlIlIllIIlIIlIIII = CommandBase.getChatComponentFromNthArg(llllllllllllIllIlIlIllIIlIIllllI, llllllllllllIllIlIlIllIIlIIlllIl, CommandFill.llIlIlIIlIlllI[13]).getUnformattedText();
            try {
                llllllllllllIllIlIlIllIIlIIlIIlI = JsonToNBT.getTagFromJson(llllllllllllIllIlIlIllIIlIIlIIII);
                llllllllllllIllIlIlIllIIlIIlIIIl = (CommandFill.llIlIlIIlIlllI[2] != 0);
                "".length();
                if ((("   ".length() ^ (0x11 ^ 0x19)) & (0xB8 ^ 0xC2 ^ (0xD5 ^ 0xA4) ^ -" ".length())) < 0) {
                    return;
                }
            }
            catch (NBTException llllllllllllIllIlIlIllIIlIIIllll) {
                final String lllllllllllllIlIIIIIIlIlIllIlIIl2 = CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[14]];
                final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl2 = new Object[CommandFill.llIlIlIIlIlllI[2]];
                lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandFill.llIlIlIIlIlllI[0]] = llllllllllllIllIlIlIllIIlIIIllll.getMessage();
                throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl2, lllllllllllllIlIIIIIIlIlIllIIlIl2);
            }
        }
        final List<BlockPos> llllllllllllIllIlIlIllIIlIIIlllI = (List<BlockPos>)Lists.newArrayList();
        llllllllllllIllIlIlIllIIlIIlIllI = CommandFill.llIlIlIIlIlllI[0];
        int llllllllllllIllIlIlIllIIlIIIllIl = llllllllllllIllIlIlIllIIlIIllIII.getZ();
        "".length();
        if ((0x28 ^ 0x2C) < -" ".length()) {
            return;
        }
        while (!lIIlIIlllllIlIlI(llllllllllllIllIlIlIllIIlIIIllIl, llllllllllllIllIlIlIllIIlIIlIlll.getZ())) {
            int llllllllllllIllIlIlIllIIlIIIllII = llllllllllllIllIlIlIllIIlIIllIII.getY();
            "".length();
            if ((0x7B ^ 0x7F) <= 0) {
                return;
            }
            while (!lIIlIIlllllIlIlI(llllllllllllIllIlIlIllIIlIIIllII, llllllllllllIllIlIlIllIIlIIlIlll.getY())) {
                int llllllllllllIllIlIlIllIIlIIIlIll = llllllllllllIllIlIlIllIIlIIllIII.getX();
                "".length();
                if (-" ".length() >= "  ".length()) {
                    return;
                }
                while (!lIIlIIlllllIlIlI(llllllllllllIllIlIlIllIIlIIIlIll, llllllllllllIllIlIlIllIIlIIlIlll.getX())) {
                    final BlockPos llllllllllllIllIlIlIllIIlIIIlIlI = new BlockPos(llllllllllllIllIlIlIllIIlIIIlIll, llllllllllllIllIlIlIllIIlIIIllII, llllllllllllIllIlIlIllIIlIIIllIl);
                    Label_1597: {
                        if (lIIlIIlllllIlIIl(llllllllllllIllIlIlIllIIlIIlllIl.length, CommandFill.llIlIlIIlIlllI[13])) {
                            if (lIIlIIlllllIllII(llllllllllllIllIlIlIllIIlIIlllIl[CommandFill.llIlIlIIlIlllI[6]].equals(CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[5]]) ? 1 : 0) && lIIlIIlllllIllII(llllllllllllIllIlIlIllIIlIIlllIl[CommandFill.llIlIlIIlIlllI[6]].equals(CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[3]]) ? 1 : 0)) {
                                if (lIIlIIlllllIllIl(llllllllllllIllIlIlIllIIlIIlllIl[CommandFill.llIlIlIIlIlllI[6]].equals(CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[6]]) ? 1 : 0)) {
                                    llllllllllllIllIlIlIllIIlIIlIlIl.destroyBlock(llllllllllllIllIlIlIllIIlIIIlIlI, (boolean)(CommandFill.llIlIlIIlIlllI[2] != 0));
                                    "".length();
                                    "".length();
                                    if (" ".length() != " ".length()) {
                                        return;
                                    }
                                }
                                else if (lIIlIIlllllIllIl(llllllllllllIllIlIlIllIIlIIlllIl[CommandFill.llIlIlIIlIlllI[6]].equals(CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[13]]) ? 1 : 0)) {
                                    if (lIIlIIlllllIllII(llllllllllllIllIlIlIllIIlIIlIlIl.isAirBlock(llllllllllllIllIlIlIllIIlIIIlIlI) ? 1 : 0)) {
                                        "".length();
                                        if (" ".length() < 0) {
                                            return;
                                        }
                                        break Label_1597;
                                    }
                                }
                                else if (lIIlIIlllllIllIl(llllllllllllIllIlIlIllIIlIIlllIl[CommandFill.llIlIlIIlIlllI[6]].equals(CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[12]]) ? 1 : 0) && lIIlIIlllllIllII(llllllllllllIllIlIlIllIIlIIllIlI.hasTileEntity() ? 1 : 0)) {
                                    if (lIIlIIlllllIlIlI(llllllllllllIllIlIlIllIIlIIlllIl.length, CommandFill.llIlIlIIlIlllI[13])) {
                                        final Block llllllllllllIllIlIlIllIIlIIIlIIl = CommandBase.getBlockByText(llllllllllllIllIlIlIllIIlIIllllI, llllllllllllIllIlIlIllIIlIIlllIl[CommandFill.llIlIlIIlIlllI[13]]);
                                        if (lIIlIIlllllIlllI(llllllllllllIllIlIlIllIIlIIlIlIl.getBlockState(llllllllllllIllIlIlIllIIlIIIlIlI).getBlock(), llllllllllllIllIlIlIllIIlIIIlIIl)) {
                                            "".length();
                                            if (((0x85 ^ 0x80) & ~(0x9B ^ 0x9E)) >= (0x21 ^ 0x25)) {
                                                return;
                                            }
                                            break Label_1597;
                                        }
                                    }
                                    if (lIIlIIlllllIlIlI(llllllllllllIllIlIlIllIIlIIlllIl.length, CommandFill.llIlIlIIlIlllI[12])) {
                                        final int llllllllllllIllIlIlIllIIlIIIlIII = CommandBase.parseInt(llllllllllllIllIlIlIllIIlIIlllIl[CommandFill.llIlIlIIlIlllI[12]]);
                                        final IBlockState llllllllllllIllIlIlIllIIlIIIIlll = llllllllllllIllIlIlIllIIlIIlIlIl.getBlockState(llllllllllllIllIlIlIllIIlIIIlIlI);
                                        if (lIIlIIlllllIllll(llllllllllllIllIlIlIllIIlIIIIlll.getBlock().getMetaFromState(llllllllllllIllIlIlIllIIlIIIIlll), llllllllllllIllIlIlIllIIlIIIlIII)) {
                                            "".length();
                                            if (-" ".length() < -" ".length()) {
                                                return;
                                            }
                                            break Label_1597;
                                        }
                                    }
                                }
                            }
                            else if (lIIlIIlllllIllll(llllllllllllIllIlIlIllIIlIIIlIll, llllllllllllIllIlIlIllIIlIIllIII.getX()) && lIIlIIlllllIllll(llllllllllllIllIlIlIllIIlIIIlIll, llllllllllllIllIlIlIllIIlIIlIlll.getX()) && lIIlIIlllllIllll(llllllllllllIllIlIlIllIIlIIIllII, llllllllllllIllIlIlIllIIlIIllIII.getY()) && lIIlIIlllllIllll(llllllllllllIllIlIlIllIIlIIIllII, llllllllllllIllIlIlIllIIlIIlIlll.getY()) && lIIlIIlllllIllll(llllllllllllIllIlIlIllIIlIIIllIl, llllllllllllIllIlIlIllIIlIIllIII.getZ()) && lIIlIIlllllIllll(llllllllllllIllIlIlIllIIlIIIllIl, llllllllllllIllIlIlIllIIlIIlIlll.getZ())) {
                                if (!lIIlIIlllllIllIl(llllllllllllIllIlIlIllIIlIIlllIl[CommandFill.llIlIlIIlIlllI[6]].equals(CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[15]]) ? 1 : 0)) {
                                    break Label_1597;
                                }
                                llllllllllllIllIlIlIllIIlIIlIlIl.setBlockState(llllllllllllIllIlIlIllIIlIIIlIlI, Blocks.air.getDefaultState(), CommandFill.llIlIlIIlIlllI[1]);
                                "".length();
                                llllllllllllIllIlIlIllIIlIIIlllI.add(llllllllllllIllIlIlIllIIlIIIlIlI);
                                "".length();
                                "".length();
                                if (" ".length() <= 0) {
                                    return;
                                }
                                break Label_1597;
                            }
                        }
                        final TileEntity llllllllllllIllIlIlIllIIlIIIIllI = llllllllllllIllIlIlIllIIlIIlIlIl.getTileEntity(llllllllllllIllIlIlIllIIlIIIlIlI);
                        if (lIIlIIllllllIIII(llllllllllllIllIlIlIllIIlIIIIllI)) {
                            if (lIIlIIlllllIllIl((llllllllllllIllIlIlIllIIlIIIIllI instanceof IInventory) ? 1 : 0)) {
                                ((IInventory)llllllllllllIllIlIlIllIIlIIIIllI).clear();
                            }
                            final World world = llllllllllllIllIlIlIllIIlIIlIlIl;
                            final BlockPos lllllllllllllIIIlIlIIIIIlIIIIIlI = llllllllllllIllIlIlIllIIlIIIlIlI;
                            final IBlockState defaultState = Blocks.barrier.getDefaultState();
                            int lllllllllllllIIIlIlIIIIIlIIIlIII;
                            if (lIIlIIllllllIIIl(llllllllllllIllIlIlIllIIlIIllIlI, Blocks.barrier)) {
                                lllllllllllllIIIlIlIIIIIlIIIlIII = CommandFill.llIlIlIIlIlllI[1];
                                "".length();
                                if (" ".length() == "   ".length()) {
                                    return;
                                }
                            }
                            else {
                                lllllllllllllIIIlIlIIIIIlIIIlIII = CommandFill.llIlIlIIlIlllI[10];
                            }
                            world.setBlockState(lllllllllllllIIIlIlIIIIIlIIIIIlI, defaultState, lllllllllllllIIIlIlIIIIIlIIIlIII);
                            "".length();
                        }
                        final IBlockState llllllllllllIllIlIlIllIIlIIIIlIl = llllllllllllIllIlIlIllIIlIIllIlI.getStateFromMeta(llllllllllllIllIlIlIllIIlIIllIIl);
                        if (lIIlIIlllllIllIl(llllllllllllIllIlIlIllIIlIIlIlIl.setBlockState(llllllllllllIllIlIlIllIIlIIIlIlI, llllllllllllIllIlIlIllIIlIIIIlIl, CommandFill.llIlIlIIlIlllI[1]) ? 1 : 0)) {
                            llllllllllllIllIlIlIllIIlIIIlllI.add(llllllllllllIllIlIlIllIIlIIIlIlI);
                            "".length();
                            ++llllllllllllIllIlIlIllIIlIIlIllI;
                            if (lIIlIIlllllIllIl(llllllllllllIllIlIlIllIIlIIlIIIl ? 1 : 0)) {
                                final TileEntity llllllllllllIllIlIlIllIIlIIIIlII = llllllllllllIllIlIlIllIIlIIlIlIl.getTileEntity(llllllllllllIllIlIlIllIIlIIIlIlI);
                                if (lIIlIIllllllIIII(llllllllllllIllIlIlIllIIlIIIIlII)) {
                                    llllllllllllIllIlIlIllIIlIIlIIlI.setInteger(CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[16]], llllllllllllIllIlIlIllIIlIIIlIlI.getX());
                                    llllllllllllIllIlIlIllIIlIIlIIlI.setInteger(CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[17]], llllllllllllIllIlIlIllIIlIIIlIlI.getY());
                                    llllllllllllIllIlIlIllIIlIIlIIlI.setInteger(CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[18]], llllllllllllIllIlIlIllIIlIIIlIlI.getZ());
                                    llllllllllllIllIlIlIllIIlIIIIlII.readFromNBT(llllllllllllIllIlIlIllIIlIIlIIlI);
                                }
                            }
                        }
                    }
                    ++llllllllllllIllIlIlIllIIlIIIlIll;
                }
                ++llllllllllllIllIlIlIllIIlIIIllII;
            }
            ++llllllllllllIllIlIlIllIIlIIIllIl;
        }
        final byte llllllllllllIllIlIlIllIIIlllIIlI = (byte)llllllllllllIllIlIlIllIIlIIIlllI.iterator();
        "".length();
        if (" ".length() < 0) {
            return;
        }
        while (!lIIlIIlllllIllII(((Iterator)llllllllllllIllIlIlIllIIIlllIIlI).hasNext() ? 1 : 0)) {
            final BlockPos llllllllllllIllIlIlIllIIlIIIIIll = ((Iterator<BlockPos>)llllllllllllIllIlIlIllIIIlllIIlI).next();
            final Block llllllllllllIllIlIlIllIIlIIIIIlI = llllllllllllIllIlIlIllIIlIIlIlIl.getBlockState(llllllllllllIllIlIlIllIIlIIIIIll).getBlock();
            llllllllllllIllIlIlIllIIlIIlIlIl.notifyNeighborsRespectDebug(llllllllllllIllIlIlIllIIlIIIIIll, llllllllllllIllIlIlIllIIlIIIIIlI);
        }
        if (lIIlIIllllllIIlI(llllllllllllIllIlIlIllIIlIIlIllI)) {
            throw new CommandException(CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[7]], new Object[CommandFill.llIlIlIIlIlllI[0]]);
        }
        llllllllllllIllIlIlIllIIlIIllllI.setCommandStat(CommandResultStats.Type.AFFECTED_BLOCKS, llllllllllllIllIlIlIllIIlIIlIllI);
        final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandFill.llIlIlIIlIlIlI[CommandFill.llIlIlIIlIlllI[11]];
        final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandFill.llIlIlIIlIlllI[2]];
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandFill.llIlIlIIlIlllI[0]] = llllllllllllIllIlIlIllIIlIIlIllI;
        CommandBase.notifyOperators(llllllllllllIllIlIlIllIIlIIllllI, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
        "".length();
        if ("   ".length() <= " ".length()) {
            return;
        }
    }
    
    private static boolean lIIlIIllllllIIlI(final int llllllllllllIllIlIlIllIIIIIIllIl) {
        return llllllllllllIllIlIlIllIIIIIIllIl <= 0;
    }
    
    private static void lIIlIIlllllIIlll() {
        (llIlIlIIlIlllI = new int[27])[0] = ((0x8D ^ 0x8A ^ (0x1F ^ 0x27)) & (0x15 ^ 0x5C ^ (0xF6 ^ 0x80) ^ -" ".length()));
        CommandFill.llIlIlIIlIlllI[1] = "  ".length();
        CommandFill.llIlIlIIlIlllI[2] = " ".length();
        CommandFill.llIlIlIIlIlllI[3] = (0x56 ^ 0x28 ^ (0x4E ^ 0x37));
        CommandFill.llIlIlIIlIlllI[4] = "   ".length();
        CommandFill.llIlIlIIlIlllI[5] = (142 + 49 - 109 + 111 ^ 26 + 9 + 107 + 57);
        CommandFill.llIlIlIIlIlllI[6] = (0x66 ^ 0x6E);
        CommandFill.llIlIlIIlIlllI[7] = (0xC7 ^ 0x88 ^ (0xD6 ^ 0x96));
        CommandFill.llIlIlIIlIlllI[8] = (-(0xFFFFEF1B & 0x56F7) & (0xFFFFD7D3 & 0xEE3E));
        CommandFill.llIlIlIIlIlllI[9] = (-(0xFFFFFAAE & 0x7FFF) & (0xFFFFFBEF & 0x7FBD));
        CommandFill.llIlIlIIlIlllI[10] = (0x91 ^ 0x95);
        CommandFill.llIlIlIIlIlllI[11] = (0x2B ^ 0x3B);
        CommandFill.llIlIlIIlIlllI[12] = (0xE ^ 0x4);
        CommandFill.llIlIlIIlIlllI[13] = (0x19 ^ 0x10);
        CommandFill.llIlIlIIlIlllI[14] = (0x99 ^ 0xA8 ^ (0x53 ^ 0x67));
        CommandFill.llIlIlIIlIlllI[15] = (0x17 ^ 0x1C);
        CommandFill.llIlIlIIlIlllI[16] = (0xBC ^ 0x80 ^ (0x3C ^ 0xC));
        CommandFill.llIlIlIIlIlllI[17] = (0x31 ^ 0x5 ^ (0x34 ^ 0xD));
        CommandFill.llIlIlIIlIlllI[18] = (154 + 28 - 57 + 57 ^ 42 + 95 - 32 + 79);
        CommandFill.llIlIlIIlIlllI[19] = (133 + 30 - 124 + 99 ^ 107 + 94 - 195 + 149);
        CommandFill.llIlIlIIlIlllI[20] = ("  ".length() ^ (0x2B ^ 0x3B));
        CommandFill.llIlIlIIlIlllI[21] = (0xA0 ^ 0xB3);
        CommandFill.llIlIlIIlIlllI[22] = (0x6A ^ 0x16 ^ (0x77 ^ 0x1F));
        CommandFill.llIlIlIIlIlllI[23] = (0x35 ^ 0x20);
        CommandFill.llIlIlIIlIlllI[24] = (0xBD ^ 0x81 ^ (0x8E ^ 0xA4));
        CommandFill.llIlIlIIlIlllI[25] = (0x4E ^ 0x59);
        CommandFill.llIlIlIIlIlllI[26] = (0x20 ^ 0x38);
    }
    
    static {
        lIIlIIlllllIIlll();
        lIIlIIlllllIIIII();
    }
    
    private static boolean lIIlIIlllllIlIII(final int llllllllllllIllIlIlIllIIIIlIlIII, final int llllllllllllIllIlIlIllIIIIlIIlll) {
        return llllllllllllIllIlIlIllIIIIlIlIII < llllllllllllIllIlIlIllIIIIlIIlll;
    }
    
    private static boolean lIIlIIlllllIlIlI(final int llllllllllllIllIlIlIllIIIIlIIIII, final int llllllllllllIllIlIlIllIIIIIlllll) {
        return llllllllllllIllIlIlIllIIIIlIIIII > llllllllllllIllIlIlIllIIIIIlllll;
    }
    
    private static boolean lIIlIIllllllIlII(final int llllllllllllIllIlIlIllIIIIlIIlII, final int llllllllllllIllIlIlIllIIIIlIIIll) {
        return llllllllllllIllIlIlIllIIIIlIIlII <= llllllllllllIllIlIlIllIIIIlIIIll;
    }
    
    private static boolean lIIlIIlllllIlIIl(final int llllllllllllIllIlIlIllIIIIlIllII, final int llllllllllllIllIlIlIllIIIIlIlIll) {
        return llllllllllllIllIlIlIllIIIIlIllII >= llllllllllllIllIlIlIllIIIIlIlIll;
    }
    
    private static boolean lIIlIIlllllIllll(final int llllllllllllIllIlIlIllIIIIIIlIII, final int llllllllllllIllIlIlIllIIIIIIIlll) {
        return llllllllllllIllIlIlIllIIIIIIlIII != llllllllllllIllIlIlIllIIIIIIIlll;
    }
    
    private static String lIIlIIllllIllIlI(final String llllllllllllIllIlIlIllIIIlIllIll, final String llllllllllllIllIlIlIllIIIlIllIlI) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIllIIIllIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIllIIIlIllIlI.getBytes(StandardCharsets.UTF_8)), CommandFill.llIlIlIIlIlllI[6]), "DES");
            final Cipher llllllllllllIllIlIlIllIIIlIlllll = Cipher.getInstance("DES");
            llllllllllllIllIlIlIllIIIlIlllll.init(CommandFill.llIlIlIIlIlllI[1], llllllllllllIllIlIlIllIIIllIIIII);
            return new String(llllllllllllIllIlIlIllIIIlIlllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIllIIIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIllIIIlIllllI) {
            llllllllllllIllIlIlIllIIIlIllllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIIllllllIIll(final int llllllllllllIllIlIlIllIIIIIIlIll) {
        return llllllllllllIllIlIlIllIIIIIIlIll > 0;
    }
    
    private static boolean lIIlIIllllllIIIl(final Object llllllllllllIllIlIlIllIIIIIlIllI, final Object llllllllllllIllIlIlIllIIIIIlIlIl) {
        return llllllllllllIllIlIlIllIIIIIlIllI == llllllllllllIllIlIlIllIIIIIlIlIl;
    }
    
    private static boolean lIIlIIlllllIlIll(final int llllllllllllIllIlIlIllIIIIIIllll) {
        return llllllllllllIllIlIlIllIIIIIIllll >= 0;
    }
    
    private static String lIIlIIllllIllIll(final String llllllllllllIllIlIlIllIIIlIIlllI, final String llllllllllllIllIlIlIllIIIlIIllll) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIllIIIlIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIllIIIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIlIllIIIlIlIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIlIllIIIlIlIIlI.init(CommandFill.llIlIlIIlIlllI[1], llllllllllllIllIlIlIllIIIlIlIIll);
            return new String(llllllllllllIllIlIlIllIIIlIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIllIIIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIllIIIlIlIIIl) {
            llllllllllllIllIlIlIllIIIlIlIIIl.printStackTrace();
            return null;
        }
    }
}
