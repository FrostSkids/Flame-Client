// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.World;
import net.minecraft.command.ICommand;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.nbt.NBTException;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.command.CommandException;
import net.minecraft.command.NumberInvalidException;
import net.minecraft.command.CommandResultStats;
import net.minecraft.command.WrongUsageException;
import java.util.Arrays;
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

public class CommandTestForBlock extends CommandBase
{
    private static final /* synthetic */ String[] llIIlIlIllIllI;
    private static final /* synthetic */ int[] llIIlIlIllIlll;
    
    private static boolean lIIIllIlIlIlIlII(final int llllllllllllIlllIIIllIIIIllIllll, final int llllllllllllIlllIIIllIIIIllIlllI) {
        return llllllllllllIlllIIIllIIIIllIllll >= llllllllllllIlllIIIllIIIIllIlllI;
    }
    
    private static String lIIIllIlIlIIllIl(String llllllllllllIlllIIIllIIIIllllllI, final String llllllllllllIlllIIIllIIIlIIIIIlI) {
        llllllllllllIlllIIIllIIIIllllllI = new String(Base64.getDecoder().decode(llllllllllllIlllIIIllIIIIllllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIIllIIIlIIIIIIl = new StringBuilder();
        final char[] llllllllllllIlllIIIllIIIlIIIIIII = llllllllllllIlllIIIllIIIlIIIIIlI.toCharArray();
        int llllllllllllIlllIIIllIIIIlllllll = CommandTestForBlock.llIIlIlIllIlll[0];
        final int llllllllllllIlllIIIllIIIIllllIIl = (Object)llllllllllllIlllIIIllIIIIllllllI.toCharArray();
        final Exception llllllllllllIlllIIIllIIIIllllIII = (Exception)llllllllllllIlllIIIllIIIIllllIIl.length;
        String llllllllllllIlllIIIllIIIIlllIlll = (String)CommandTestForBlock.llIIlIlIllIlll[0];
        while (lIIIllIlIlIlIIlI((int)llllllllllllIlllIIIllIIIIlllIlll, (int)llllllllllllIlllIIIllIIIIllllIII)) {
            final char llllllllllllIlllIIIllIIIlIIIIlII = llllllllllllIlllIIIllIIIIllllIIl[llllllllllllIlllIIIllIIIIlllIlll];
            llllllllllllIlllIIIllIIIlIIIIIIl.append((char)(llllllllllllIlllIIIllIIIlIIIIlII ^ llllllllllllIlllIIIllIIIlIIIIIII[llllllllllllIlllIIIllIIIIlllllll % llllllllllllIlllIIIllIIIlIIIIIII.length]));
            "".length();
            ++llllllllllllIlllIIIllIIIIlllllll;
            ++llllllllllllIlllIIIllIIIIlllIlll;
            "".length();
            if ((0xF8 ^ 0x91 ^ (0x57 ^ 0x3A)) == 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIIllIIIlIIIIIIl);
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender llllllllllllIlllIIIllIIIlIlIllII, final String[] llllllllllllIlllIIIllIIIlIlIlIll, final BlockPos llllllllllllIlllIIIllIIIlIlIlIlI) {
        List<String> list;
        if (lIIIllIlIlIllIlI(llllllllllllIlllIIIllIIIlIlIlIll.length) && lIIIllIlIlIllIll(llllllllllllIlllIIIllIIIlIlIlIll.length, CommandTestForBlock.llIIlIlIllIlll[4])) {
            list = CommandBase.func_175771_a(llllllllllllIlllIIIllIIIlIlIlIll, CommandTestForBlock.llIIlIlIllIlll[0], llllllllllllIlllIIIllIIIlIlIlIlI);
            "".length();
            if (" ".length() < ((25 + 144 - 135 + 111 ^ 122 + 9 - 99 + 141) & (0x7E ^ 0xE ^ (0x14 ^ 0x58) ^ -" ".length()))) {
                return null;
            }
        }
        else if (lIIIllIlIlIlllII(llllllllllllIlllIIIllIIIlIlIlIll.length, CommandTestForBlock.llIIlIlIllIlll[3])) {
            list = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIlllIIIllIIIlIlIlIll, Block.blockRegistry.getKeys());
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
    
    private static void lIIIllIlIlIlIIII() {
        (llIIlIlIllIllI = new String[CommandTestForBlock.llIIlIlIllIlll[13]])[CommandTestForBlock.llIIlIlIllIlll[0]] = lIIIllIlIlIIllIl("Hw0kNxAEGjUvGQgD", "khWCv");
        CommandTestForBlock.llIIlIlIllIllI[CommandTestForBlock.llIIlIlIllIlll[2]] = lIIIllIlIlIIllIl("MSo/PBY8ISF/Azc2JjcYICc+PhQ5ayciFjUg", "RERQw");
        CommandTestForBlock.llIIlIlIllIllI[CommandTestForBlock.llIIlIlIllIlll[1]] = lIIIllIlIlIIlllI("odje/lUiNwpUdJEWiz3bZIEXkUWc0aTRdRP/P8S+yfM=", "bLvud");
        CommandTestForBlock.llIIlIlIllIllI[CommandTestForBlock.llIIlIlIllIlll[4]] = lIIIllIlIlIIllIl("OyYbAyA2LQVAMj09FAIuOyJYAC4sDxkbLzw=", "XIvnA");
        CommandTestForBlock.llIIlIlIllIllI[CommandTestForBlock.llIIlIlIllIlll[3]] = lIIIllIlIlIIlllI("0lKiM37n3YC/IVI6pAysvB/PDM91JLNM0Nlkjdr+txieyw/75kp+bg==", "IfOvz");
        CommandTestForBlock.llIIlIlIllIllI[CommandTestForBlock.llIIlIlIllIlll[6]] = lIIIllIlIlIIllIl("NAk1KBk5AitrCzISOikXNA12MRkwIyo3FyU=", "WfXEx");
        CommandTestForBlock.llIIlIlIllIllI[CommandTestForBlock.llIIlIlIllIlll[8]] = lIIIllIlIlIIllIl("Aiw8PSAPJyJ+NQQwJTYuEyE9PyIKbTcxKA0mNX41CC80", "aCQPA");
        CommandTestForBlock.llIIlIlIllIllI[CommandTestForBlock.llIIlIlIllIlll[9]] = lIIIllIlIlIIlllI("FutTQD61+M2oDivI6QppwUPgNL/AieYi2yym8CW7RXFbm08BrRPZOw==", "YrVWB");
        CommandTestForBlock.llIIlIlIllIllI[CommandTestForBlock.llIIlIlIllIlll[10]] = lIIIllIlIlIIlllI("1NhTfKZ/x/cAZKpykwJZJ80Xv701mOMQsBA8j1+7YfV6EPHW3eTmng==", "MrGFL");
        CommandTestForBlock.llIIlIlIllIllI[CommandTestForBlock.llIIlIlIllIlll[11]] = lIIIllIlIlIIlllI("ivkqylZYe8gvqQUn/2MRWGWgmEA6YZx+Q6sK7DvpfGldctsiY+mN7g==", "HdjCV");
        CommandTestForBlock.llIIlIlIllIllI[CommandTestForBlock.llIIlIlIllIlll[12]] = lIIIllIlIlIIllll("nXliwxBQE/ZnxUdxn0Tsr9vL3hS9qSwB/zrZDAaxQdU=", "yISGj");
    }
    
    private static boolean lIIIllIlIlIllIll(final int llllllllllllIlllIIIllIIIIllIIlll, final int llllllllllllIlllIIIllIIIIllIIllI) {
        return llllllllllllIlllIIIllIIIIllIIlll <= llllllllllllIlllIIIllIIIIllIIllI;
    }
    
    @Override
    public String getCommandUsage(final ICommandSender llllllllllllIlllIIIllIIIllIllIlI) {
        return CommandTestForBlock.llIIlIlIllIllI[CommandTestForBlock.llIIlIlIllIlll[2]];
    }
    
    private static String lIIIllIlIlIIllll(final String llllllllllllIlllIIIllIIIlIIlIIll, final String llllllllllllIlllIIIllIIIlIIlIIlI) {
        try {
            final SecretKeySpec llllllllllllIlllIIIllIIIlIIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIllIIIlIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIIllIIIlIIlIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIIllIIIlIIlIlIl.init(CommandTestForBlock.llIIlIlIllIlll[1], llllllllllllIlllIIIllIIIlIIlIllI);
            return new String(llllllllllllIlllIIIllIIIlIIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIllIIIlIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIllIIIlIIlIlII) {
            llllllllllllIlllIIIllIIIlIIlIlII.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIllIlIlIlIIIl() {
        (llIIlIlIllIlll = new int[14])[0] = ((0xAC ^ 0xC2 ^ (0x5C ^ 0x12)) & (77 + 20 - 48 + 137 ^ 123 + 42 - 117 + 106 ^ -" ".length()));
        CommandTestForBlock.llIIlIlIllIlll[1] = "  ".length();
        CommandTestForBlock.llIIlIlIllIlll[2] = " ".length();
        CommandTestForBlock.llIIlIlIllIlll[3] = (0x8C ^ 0x88);
        CommandTestForBlock.llIIlIlIllIlll[4] = "   ".length();
        CommandTestForBlock.llIIlIlIllIlll[5] = -" ".length();
        CommandTestForBlock.llIIlIlIllIlll[6] = (0xC3 ^ 0xC6);
        CommandTestForBlock.llIIlIlIllIlll[7] = (0x9C ^ 0x93);
        CommandTestForBlock.llIIlIlIllIlll[8] = (0x72 ^ 0x74);
        CommandTestForBlock.llIIlIlIllIlll[9] = (0x53 ^ 0x54);
        CommandTestForBlock.llIIlIlIllIlll[10] = (0x2C ^ 0x24);
        CommandTestForBlock.llIIlIlIllIlll[11] = (0xCC ^ 0x97 ^ (0x52 ^ 0x0));
        CommandTestForBlock.llIIlIlIllIlll[12] = (0x5 ^ 0x24 ^ (0x15 ^ 0x3E));
        CommandTestForBlock.llIIlIlIllIlll[13] = (0x5D ^ 0x9 ^ (0xF4 ^ 0xAB));
    }
    
    private static boolean lIIIllIlIlIllIlI(final int llllllllllllIlllIIIllIIIIlIlIllI) {
        return llllllllllllIlllIIIllIIIIlIlIllI > 0;
    }
    
    private static String lIIIllIlIlIIlllI(final String llllllllllllIlllIIIllIIIlIIllllI, final String llllllllllllIlllIIIllIIIlIIlllIl) {
        try {
            final SecretKeySpec llllllllllllIlllIIIllIIIlIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIllIIIlIIlllIl.getBytes(StandardCharsets.UTF_8)), CommandTestForBlock.llIIlIlIllIlll[10]), "DES");
            final Cipher llllllllllllIlllIIIllIIIlIlIIIlI = Cipher.getInstance("DES");
            llllllllllllIlllIIIllIIIlIlIIIlI.init(CommandTestForBlock.llIIlIlIllIlll[1], llllllllllllIlllIIIllIIIlIlIIIll);
            return new String(llllllllllllIlllIIIllIIIlIlIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIllIIIlIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIllIIIlIlIIIIl) {
            llllllllllllIlllIIIllIIIlIlIIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String getCommandName() {
        return CommandTestForBlock.llIIlIlIllIllI[CommandTestForBlock.llIIlIlIllIlll[0]];
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandTestForBlock.llIIlIlIllIlll[1];
    }
    
    private static boolean lIIIllIlIlIllIII(final int llllllllllllIlllIIIllIIIIllIIIll, final int llllllllllllIlllIIIllIIIIllIIIlI) {
        return llllllllllllIlllIIIllIIIIllIIIll > llllllllllllIlllIIIllIIIIllIIIlI;
    }
    
    private static boolean lIIIllIlIlIlIlIl(final int llllllllllllIlllIIIllIIIIlIllIII) {
        return llllllllllllIlllIIIllIIIIlIllIII == 0;
    }
    
    private static boolean lIIIllIlIlIlIlll(final Object llllllllllllIlllIIIllIIIIlIlllll, final Object llllllllllllIlllIIIllIIIIlIllllI) {
        return llllllllllllIlllIIIllIIIIlIlllll != llllllllllllIlllIIIllIIIIlIllllI;
    }
    
    private static boolean lIIIllIlIlIlIllI(final int llllllllllllIlllIIIllIIIIlIllIlI) {
        return llllllllllllIlllIIIllIIIIlIllIlI != 0;
    }
    
    private static boolean lIIIllIlIlIlIIll(final Object llllllllllllIlllIIIllIIIIlIlllII) {
        return llllllllllllIlllIIIllIIIIlIlllII == null;
    }
    
    private static boolean lIIIllIlIlIlIIlI(final int llllllllllllIlllIIIllIIIIllIlIll, final int llllllllllllIlllIIIllIIIIllIlIlI) {
        return llllllllllllIlllIIIllIIIIllIlIll < llllllllllllIlllIIIllIIIIllIlIlI;
    }
    
    @Override
    public void processCommand(final ICommandSender llllllllllllIlllIIIllIIIllIIlIll, final String[] llllllllllllIlllIIIllIIIlIlllIlI) throws CommandException {
        if (lIIIllIlIlIlIIlI(llllllllllllIlllIIIllIIIlIlllIlI.length, CommandTestForBlock.llIIlIlIllIlll[3])) {
            throw new WrongUsageException(CommandTestForBlock.llIIlIlIllIllI[CommandTestForBlock.llIIlIlIllIlll[1]], new Object[CommandTestForBlock.llIIlIlIllIlll[0]]);
        }
        llllllllllllIlllIIIllIIIllIIlIll.setCommandStat(CommandResultStats.Type.AFFECTED_BLOCKS, CommandTestForBlock.llIIlIlIllIlll[0]);
        final BlockPos llllllllllllIlllIIIllIIIllIIlIIl = CommandBase.parseBlockPos(llllllllllllIlllIIIllIIIllIIlIll, llllllllllllIlllIIIllIIIlIlllIlI, CommandTestForBlock.llIIlIlIllIlll[0], (boolean)(CommandTestForBlock.llIIlIlIllIlll[0] != 0));
        final Block llllllllllllIlllIIIllIIIllIIlIII = Block.getBlockFromName(llllllllllllIlllIIIllIIIlIlllIlI[CommandTestForBlock.llIIlIlIllIlll[4]]);
        if (lIIIllIlIlIlIIll(llllllllllllIlllIIIllIIIllIIlIII)) {
            final String lllllllllllllIIlIIIIIIIlIIlllIIl = CommandTestForBlock.llIIlIlIllIllI[CommandTestForBlock.llIIlIlIllIlll[4]];
            final Object[] lllllllllllllIIlIIIIIIIlIIlllIll = new Object[CommandTestForBlock.llIIlIlIllIlll[2]];
            lllllllllllllIIlIIIIIIIlIIlllIll[CommandTestForBlock.llIIlIlIllIlll[0]] = llllllllllllIlllIIIllIIIlIlllIlI[CommandTestForBlock.llIIlIlIllIlll[4]];
            throw new NumberInvalidException(lllllllllllllIIlIIIIIIIlIIlllIIl, lllllllllllllIIlIIIIIIIlIIlllIll);
        }
        int llllllllllllIlllIIIllIIIllIIIlll = CommandTestForBlock.llIIlIlIllIlll[5];
        if (lIIIllIlIlIlIlII(llllllllllllIlllIIIllIIIlIlllIlI.length, CommandTestForBlock.llIIlIlIllIlll[6])) {
            llllllllllllIlllIIIllIIIllIIIlll = CommandBase.parseInt(llllllllllllIlllIIIllIIIlIlllIlI[CommandTestForBlock.llIIlIlIllIlll[3]], CommandTestForBlock.llIIlIlIllIlll[5], CommandTestForBlock.llIIlIlIllIlll[7]);
        }
        final World llllllllllllIlllIIIllIIIllIIIllI = llllllllllllIlllIIIllIIIllIIlIll.getEntityWorld();
        if (lIIIllIlIlIlIlIl(llllllllllllIlllIIIllIIIllIIIllI.isBlockLoaded(llllllllllllIlllIIIllIIIllIIlIIl) ? 1 : 0)) {
            throw new CommandException(CommandTestForBlock.llIIlIlIllIllI[CommandTestForBlock.llIIlIlIllIlll[3]], new Object[CommandTestForBlock.llIIlIlIllIlll[0]]);
        }
        NBTTagCompound llllllllllllIlllIIIllIIIllIIIlIl = new NBTTagCompound();
        boolean llllllllllllIlllIIIllIIIllIIIlII = CommandTestForBlock.llIIlIlIllIlll[0] != 0;
        if (lIIIllIlIlIlIlII(llllllllllllIlllIIIllIIIlIlllIlI.length, CommandTestForBlock.llIIlIlIllIlll[8]) && lIIIllIlIlIlIllI(llllllllllllIlllIIIllIIIllIIlIII.hasTileEntity() ? 1 : 0)) {
            final String llllllllllllIlllIIIllIIIllIIIIll = CommandBase.getChatComponentFromNthArg(llllllllllllIlllIIIllIIIllIIlIll, llllllllllllIlllIIIllIIIlIlllIlI, CommandTestForBlock.llIIlIlIllIlll[6]).getUnformattedText();
            try {
                llllllllllllIlllIIIllIIIllIIIlIl = JsonToNBT.getTagFromJson(llllllllllllIlllIIIllIIIllIIIIll);
                llllllllllllIlllIIIllIIIllIIIlII = (CommandTestForBlock.llIIlIlIllIlll[2] != 0);
                "".length();
                if ((0x6D ^ 0x68) == 0x0) {
                    return;
                }
            }
            catch (NBTException llllllllllllIlllIIIllIIIllIIIIlI) {
                final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandTestForBlock.llIIlIlIllIllI[CommandTestForBlock.llIIlIlIllIlll[6]];
                final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandTestForBlock.llIIlIlIllIlll[2]];
                lllllllllllllIlIIIIIIlIlIllIIlIl[CommandTestForBlock.llIIlIlIllIlll[0]] = llllllllllllIlllIIIllIIIllIIIIlI.getMessage();
                throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
            }
        }
        final IBlockState llllllllllllIlllIIIllIIIllIIIIIl = llllllllllllIlllIIIllIIIllIIIllI.getBlockState(llllllllllllIlllIIIllIIIllIIlIIl);
        final Block llllllllllllIlllIIIllIIIllIIIIII = llllllllllllIlllIIIllIIIllIIIIIl.getBlock();
        if (lIIIllIlIlIlIlll(llllllllllllIlllIIIllIIIllIIIIII, llllllllllllIlllIIIllIIIllIIlIII)) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl2 = CommandTestForBlock.llIIlIlIllIllI[CommandTestForBlock.llIIlIlIllIlll[8]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl2 = new Object[CommandTestForBlock.llIIlIlIllIlll[6]];
            lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandTestForBlock.llIIlIlIllIlll[0]] = llllllllllllIlllIIIllIIIllIIlIIl.getX();
            lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandTestForBlock.llIIlIlIllIlll[2]] = llllllllllllIlllIIIllIIIllIIlIIl.getY();
            lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandTestForBlock.llIIlIlIllIlll[1]] = llllllllllllIlllIIIllIIIllIIlIIl.getZ();
            lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandTestForBlock.llIIlIlIllIlll[4]] = llllllllllllIlllIIIllIIIllIIIIII.getLocalizedName();
            lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandTestForBlock.llIIlIlIllIlll[3]] = llllllllllllIlllIIIllIIIllIIlIII.getLocalizedName();
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl2, lllllllllllllIlIIIIIIlIlIllIIlIl2);
        }
        if (lIIIllIlIlIllIII(llllllllllllIlllIIIllIIIllIIIlll, CommandTestForBlock.llIIlIlIllIlll[5])) {
            final int llllllllllllIlllIIIllIIIlIllllll = llllllllllllIlllIIIllIIIllIIIIIl.getBlock().getMetaFromState(llllllllllllIlllIIIllIIIllIIIIIl);
            if (lIIIllIlIlIllIIl(llllllllllllIlllIIIllIIIlIllllll, llllllllllllIlllIIIllIIIllIIIlll)) {
                final String lllllllllllllIlIIIIIIlIlIllIlIIl3 = CommandTestForBlock.llIIlIlIllIllI[CommandTestForBlock.llIIlIlIllIlll[9]];
                final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl3 = new Object[CommandTestForBlock.llIIlIlIllIlll[6]];
                lllllllllllllIlIIIIIIlIlIllIIlIl3[CommandTestForBlock.llIIlIlIllIlll[0]] = llllllllllllIlllIIIllIIIllIIlIIl.getX();
                lllllllllllllIlIIIIIIlIlIllIIlIl3[CommandTestForBlock.llIIlIlIllIlll[2]] = llllllllllllIlllIIIllIIIllIIlIIl.getY();
                lllllllllllllIlIIIIIIlIlIllIIlIl3[CommandTestForBlock.llIIlIlIllIlll[1]] = llllllllllllIlllIIIllIIIllIIlIIl.getZ();
                lllllllllllllIlIIIIIIlIlIllIIlIl3[CommandTestForBlock.llIIlIlIllIlll[4]] = llllllllllllIlllIIIllIIIlIllllll;
                lllllllllllllIlIIIIIIlIlIllIIlIl3[CommandTestForBlock.llIIlIlIllIlll[3]] = llllllllllllIlllIIIllIIIllIIIlll;
                throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl3, lllllllllllllIlIIIIIIlIlIllIIlIl3);
            }
        }
        if (lIIIllIlIlIlIllI(llllllllllllIlllIIIllIIIllIIIlII ? 1 : 0)) {
            final TileEntity llllllllllllIlllIIIllIIIlIlllllI = llllllllllllIlllIIIllIIIllIIIllI.getTileEntity(llllllllllllIlllIIIllIIIllIIlIIl);
            if (lIIIllIlIlIlIIll(llllllllllllIlllIIIllIIIlIlllllI)) {
                final String lllllllllllllIlIIIIIIlIlIllIlIIl4 = CommandTestForBlock.llIIlIlIllIllI[CommandTestForBlock.llIIlIlIllIlll[10]];
                final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl4 = new Object[CommandTestForBlock.llIIlIlIllIlll[4]];
                lllllllllllllIlIIIIIIlIlIllIIlIl4[CommandTestForBlock.llIIlIlIllIlll[0]] = llllllllllllIlllIIIllIIIllIIlIIl.getX();
                lllllllllllllIlIIIIIIlIlIllIIlIl4[CommandTestForBlock.llIIlIlIllIlll[2]] = llllllllllllIlllIIIllIIIllIIlIIl.getY();
                lllllllllllllIlIIIIIIlIlIllIIlIl4[CommandTestForBlock.llIIlIlIllIlll[1]] = llllllllllllIlllIIIllIIIllIIlIIl.getZ();
                throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl4, lllllllllllllIlIIIIIIlIlIllIIlIl4);
            }
            final NBTTagCompound llllllllllllIlllIIIllIIIlIllllIl = new NBTTagCompound();
            llllllllllllIlllIIIllIIIlIlllllI.writeToNBT(llllllllllllIlllIIIllIIIlIllllIl);
            if (lIIIllIlIlIlIlIl(NBTUtil.func_181123_a(llllllllllllIlllIIIllIIIllIIIlIl, llllllllllllIlllIIIllIIIlIllllIl, (boolean)(CommandTestForBlock.llIIlIlIllIlll[2] != 0)) ? 1 : 0)) {
                final String lllllllllllllIlIIIIIIlIlIllIlIIl5 = CommandTestForBlock.llIIlIlIllIllI[CommandTestForBlock.llIIlIlIllIlll[11]];
                final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl5 = new Object[CommandTestForBlock.llIIlIlIllIlll[4]];
                lllllllllllllIlIIIIIIlIlIllIIlIl5[CommandTestForBlock.llIIlIlIllIlll[0]] = llllllllllllIlllIIIllIIIllIIlIIl.getX();
                lllllllllllllIlIIIIIIlIlIllIIlIl5[CommandTestForBlock.llIIlIlIllIlll[2]] = llllllllllllIlllIIIllIIIllIIlIIl.getY();
                lllllllllllllIlIIIIIIlIlIllIIlIl5[CommandTestForBlock.llIIlIlIllIlll[1]] = llllllllllllIlllIIIllIIIllIIlIIl.getZ();
                throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl5, lllllllllllllIlIIIIIIlIlIllIIlIl5);
            }
        }
        llllllllllllIlllIIIllIIIllIIlIll.setCommandStat(CommandResultStats.Type.AFFECTED_BLOCKS, CommandTestForBlock.llIIlIlIllIlll[2]);
        final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandTestForBlock.llIIlIlIllIllI[CommandTestForBlock.llIIlIlIllIlll[12]];
        final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandTestForBlock.llIIlIlIllIlll[4]];
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandTestForBlock.llIIlIlIllIlll[0]] = llllllllllllIlllIIIllIIIllIIlIIl.getX();
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandTestForBlock.llIIlIlIllIlll[2]] = llllllllllllIlllIIIllIIIllIIlIIl.getY();
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandTestForBlock.llIIlIlIllIlll[1]] = llllllllllllIlllIIIllIIIllIIlIIl.getZ();
        CommandBase.notifyOperators(llllllllllllIlllIIIllIIIllIIlIll, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
    }
    
    private static boolean lIIIllIlIlIlllII(final int llllllllllllIlllIIIllIIIIlllIIll, final int llllllllllllIlllIIIllIIIIlllIIlI) {
        return llllllllllllIlllIIIllIIIIlllIIll == llllllllllllIlllIIIllIIIIlllIIlI;
    }
    
    static {
        lIIIllIlIlIlIIIl();
        lIIIllIlIlIlIIII();
    }
    
    private static boolean lIIIllIlIlIllIIl(final int llllllllllllIlllIIIllIIIIlIlIIll, final int llllllllllllIlllIIIllIIIIlIlIIlI) {
        return llllllllllllIlllIIIllIIIIlIlIIll != llllllllllllIlllIIIllIIIIlIlIIlI;
    }
}
