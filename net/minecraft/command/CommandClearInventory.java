// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.nbt.NBTException;
import net.minecraft.nbt.JsonToNBT;
import java.util.Collection;
import net.minecraft.item.Item;
import java.util.List;
import net.minecraft.util.BlockPos;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.server.MinecraftServer;

public class CommandClearInventory extends CommandBase
{
    private static final /* synthetic */ int[] llIIllIlIIllll;
    private static final /* synthetic */ String[] llIIllIlIIlllI;
    
    private static boolean lIIIlllIllIlIlll(final int llllllllllllIlllIIIIIIlIIllIllIl) {
        return llllllllllllIlllIIIIIIlIIllIllIl == 0;
    }
    
    private static void lIIIlllIllIlIllI() {
        (llIIllIlIIllll = new int[10])[0] = ((0x13 ^ 0x40) & ~(0x4B ^ 0x18));
        CommandClearInventory.llIIllIlIIllll[1] = " ".length();
        CommandClearInventory.llIIllIlIIllll[2] = "  ".length();
        CommandClearInventory.llIIllIlIIllll[3] = "   ".length();
        CommandClearInventory.llIIllIlIIllll[4] = -" ".length();
        CommandClearInventory.llIIllIlIIllll[5] = (0x32 ^ 0x36);
        CommandClearInventory.llIIllIlIIllll[6] = (0x2D ^ 0x28);
        CommandClearInventory.llIIllIlIIllll[7] = (0xCB ^ 0x83 ^ (0xFC ^ 0xB2));
        CommandClearInventory.llIIllIlIIllll[8] = (0xA0 ^ 0x86 ^ (0x29 ^ 0x8));
        CommandClearInventory.llIIllIlIIllll[9] = (0x48 ^ 0x6C ^ (0x71 ^ 0x5D));
    }
    
    protected String[] func_147209_d() {
        return MinecraftServer.getServer().getAllUsernames();
    }
    
    private static String lIIIlllIllIlIlII(String llllllllllllIlllIIIIIIlIlIIIIlIl, final String llllllllllllIlllIIIIIIlIlIIIIlII) {
        llllllllllllIlllIIIIIIlIlIIIIlIl = new String(Base64.getDecoder().decode(llllllllllllIlllIIIIIIlIlIIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIIIIIlIlIIIlIII = new StringBuilder();
        final char[] llllllllllllIlllIIIIIIlIlIIIIlll = llllllllllllIlllIIIIIIlIlIIIIlII.toCharArray();
        int llllllllllllIlllIIIIIIlIlIIIIllI = CommandClearInventory.llIIllIlIIllll[0];
        final byte llllllllllllIlllIIIIIIlIlIIIIIII = (Object)llllllllllllIlllIIIIIIlIlIIIIlIl.toCharArray();
        final int llllllllllllIlllIIIIIIlIIlllllll = llllllllllllIlllIIIIIIlIlIIIIIII.length;
        int llllllllllllIlllIIIIIIlIIllllllI = CommandClearInventory.llIIllIlIIllll[0];
        while (lIIIlllIllIllIll(llllllllllllIlllIIIIIIlIIllllllI, llllllllllllIlllIIIIIIlIIlllllll)) {
            final char llllllllllllIlllIIIIIIlIlIIIlIll = llllllllllllIlllIIIIIIlIlIIIIIII[llllllllllllIlllIIIIIIlIIllllllI];
            llllllllllllIlllIIIIIIlIlIIIlIII.append((char)(llllllllllllIlllIIIIIIlIlIIIlIll ^ llllllllllllIlllIIIIIIlIlIIIIlll[llllllllllllIlllIIIIIIlIlIIIIllI % llllllllllllIlllIIIIIIlIlIIIIlll.length]));
            "".length();
            ++llllllllllllIlllIIIIIIlIlIIIIllI;
            ++llllllllllllIlllIIIIIIlIIllllllI;
            "".length();
            if ((0xD2 ^ 0x80 ^ (0x65 ^ 0x33)) == -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIIIIIlIlIIIlIII);
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender llllllllllllIlllIIIIIIlIlIlllIIl, final String[] llllllllllllIlllIIIIIIlIlIllIlIl, final BlockPos llllllllllllIlllIIIIIIlIlIllIlll) {
        List<String> list;
        if (lIIIlllIllIllIlI(llllllllllllIlllIIIIIIlIlIllIlIl.length, CommandClearInventory.llIIllIlIIllll[1])) {
            list = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIlllIIIIIIlIlIllIlIl, this.func_147209_d());
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        else if (lIIIlllIllIllIlI(llllllllllllIlllIIIIIIlIlIllIlIl.length, CommandClearInventory.llIIllIlIIllll[2])) {
            list = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIlllIIIIIIlIlIllIlIl, Item.itemRegistry.getKeys());
            "".length();
            if (((0xA5 ^ 0x8E) & ~(0xAE ^ 0x85)) != 0x0) {
                return null;
            }
        }
        else {
            list = null;
        }
        return list;
    }
    
    private static boolean lIIIlllIllIllIll(final int llllllllllllIlllIIIIIIlIIlllIIlI, final int llllllllllllIlllIIIIIIlIIlllIIIl) {
        return llllllllllllIlllIIIIIIlIIlllIIlI < llllllllllllIlllIIIIIIlIIlllIIIl;
    }
    
    @Override
    public String getCommandUsage(final ICommandSender llllllllllllIlllIIIIIIlIllIllIlI) {
        return CommandClearInventory.llIIllIlIIlllI[CommandClearInventory.llIIllIlIIllll[1]];
    }
    
    @Override
    public void processCommand(final ICommandSender llllllllllllIlllIIIIIIlIllIIIlII, final String[] llllllllllllIlllIIIIIIlIllIIllIl) throws CommandException {
        EntityPlayerMP entityPlayerMP;
        if (lIIIlllIllIlIlll(llllllllllllIlllIIIIIIlIllIIllIl.length)) {
            entityPlayerMP = CommandBase.getCommandSenderAsPlayer(llllllllllllIlllIIIIIIlIllIIIlII);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            entityPlayerMP = CommandBase.getPlayer(llllllllllllIlllIIIIIIlIllIIIlII, llllllllllllIlllIIIIIIlIllIIllIl[CommandClearInventory.llIIllIlIIllll[0]]);
        }
        final EntityPlayerMP llllllllllllIlllIIIIIIlIllIIllII = entityPlayerMP;
        Item itemByText;
        if (lIIIlllIllIllIII(llllllllllllIlllIIIIIIlIllIIllIl.length, CommandClearInventory.llIIllIlIIllll[2])) {
            itemByText = CommandBase.getItemByText(llllllllllllIlllIIIIIIlIllIIIlII, llllllllllllIlllIIIIIIlIllIIllIl[CommandClearInventory.llIIllIlIIllll[1]]);
            "".length();
            if ("   ".length() == -" ".length()) {
                return;
            }
        }
        else {
            itemByText = null;
        }
        final Item llllllllllllIlllIIIIIIlIllIIlIll = itemByText;
        int int1;
        if (lIIIlllIllIllIII(llllllllllllIlllIIIIIIlIllIIllIl.length, CommandClearInventory.llIIllIlIIllll[3])) {
            int1 = CommandBase.parseInt(llllllllllllIlllIIIIIIlIllIIllIl[CommandClearInventory.llIIllIlIIllll[2]], CommandClearInventory.llIIllIlIIllll[4]);
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        else {
            int1 = CommandClearInventory.llIIllIlIIllll[4];
        }
        final int llllllllllllIlllIIIIIIlIllIIlIlI = int1;
        int int2;
        if (lIIIlllIllIllIII(llllllllllllIlllIIIIIIlIllIIllIl.length, CommandClearInventory.llIIllIlIIllll[5])) {
            int2 = CommandBase.parseInt(llllllllllllIlllIIIIIIlIllIIllIl[CommandClearInventory.llIIllIlIIllll[3]], CommandClearInventory.llIIllIlIIllll[4]);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            int2 = CommandClearInventory.llIIllIlIIllll[4];
        }
        final int llllllllllllIlllIIIIIIlIllIIlIIl = int2;
        NBTTagCompound llllllllllllIlllIIIIIIlIllIIlIII = null;
        if (lIIIlllIllIllIII(llllllllllllIlllIIIIIIlIllIIllIl.length, CommandClearInventory.llIIllIlIIllll[6])) {
            try {
                llllllllllllIlllIIIIIIlIllIIlIII = JsonToNBT.getTagFromJson(CommandBase.buildString(llllllllllllIlllIIIIIIlIllIIllIl, CommandClearInventory.llIIllIlIIllll[5]));
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            }
            catch (NBTException llllllllllllIlllIIIIIIlIllIIIlll) {
                final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandClearInventory.llIIllIlIIlllI[CommandClearInventory.llIIllIlIIllll[2]];
                final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandClearInventory.llIIllIlIIllll[1]];
                lllllllllllllIlIIIIIIlIlIllIIlIl[CommandClearInventory.llIIllIlIIllll[0]] = llllllllllllIlllIIIIIIlIllIIIlll.getMessage();
                throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
            }
        }
        if (lIIIlllIllIllIII(llllllllllllIlllIIIIIIlIllIIllIl.length, CommandClearInventory.llIIllIlIIllll[2]) && lIIIlllIllIllIIl(llllllllllllIlllIIIIIIlIllIIlIll)) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl2 = CommandClearInventory.llIIllIlIIlllI[CommandClearInventory.llIIllIlIIllll[3]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl2 = new Object[CommandClearInventory.llIIllIlIIllll[1]];
            lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandClearInventory.llIIllIlIIllll[0]] = llllllllllllIlllIIIIIIlIllIIllII.getName();
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl2, lllllllllllllIlIIIIIIlIlIllIIlIl2);
        }
        final int llllllllllllIlllIIIIIIlIllIIIllI = llllllllllllIlllIIIIIIlIllIIllII.inventory.clearMatchingItems(llllllllllllIlllIIIIIIlIllIIlIll, llllllllllllIlllIIIIIIlIllIIlIlI, llllllllllllIlllIIIIIIlIllIIlIIl, llllllllllllIlllIIIIIIlIllIIlIII);
        llllllllllllIlllIIIIIIlIllIIllII.inventoryContainer.detectAndSendChanges();
        if (lIIIlllIllIlIlll(llllllllllllIlllIIIIIIlIllIIllII.capabilities.isCreativeMode ? 1 : 0)) {
            llllllllllllIlllIIIIIIlIllIIllII.updateHeldItem();
        }
        llllllllllllIlllIIIIIIlIllIIIlII.setCommandStat(CommandResultStats.Type.AFFECTED_ITEMS, llllllllllllIlllIIIIIIlIllIIIllI);
        if (lIIIlllIllIlIlll(llllllllllllIlllIIIIIIlIllIIIllI)) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl3 = CommandClearInventory.llIIllIlIIlllI[CommandClearInventory.llIIllIlIIllll[5]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl3 = new Object[CommandClearInventory.llIIllIlIIllll[1]];
            lllllllllllllIlIIIIIIlIlIllIIlIl3[CommandClearInventory.llIIllIlIIllll[0]] = llllllllllllIlllIIIIIIlIllIIllII.getName();
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl3, lllllllllllllIlIIIIIIlIlIllIIlIl3);
        }
        if (lIIIlllIllIlIlll(llllllllllllIlllIIIIIIlIllIIlIIl)) {
            final String lllllllllllllIlIIlIlllIIlIIIIIlI = CommandClearInventory.llIIllIlIIlllI[CommandClearInventory.llIIllIlIIllll[6]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[CommandClearInventory.llIIllIlIIllll[2]];
            lllllllllllllIlIIlIlllIIlIIIIIIl[CommandClearInventory.llIIllIlIIllll[0]] = llllllllllllIlllIIIIIIlIllIIllII.getName();
            lllllllllllllIlIIlIlllIIlIIIIIIl[CommandClearInventory.llIIllIlIIllll[1]] = llllllllllllIlllIIIIIIlIllIIIllI;
            llllllllllllIlllIIIIIIlIllIIIlII.addChatMessage(new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl));
            "".length();
            if ((" ".length() & (" ".length() ^ -" ".length())) < 0) {
                return;
            }
        }
        else {
            final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandClearInventory.llIIllIlIIlllI[CommandClearInventory.llIIllIlIIllll[7]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandClearInventory.llIIllIlIIllll[2]];
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandClearInventory.llIIllIlIIllll[0]] = llllllllllllIlllIIIIIIlIllIIllII.getName();
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandClearInventory.llIIllIlIIllll[1]] = llllllllllllIlllIIIIIIlIllIIIllI;
            CommandBase.notifyOperators(llllllllllllIlllIIIIIIlIllIIIlII, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
        }
    }
    
    private static boolean lIIIlllIllIllIIl(final Object llllllllllllIlllIIIIIIlIIllIllll) {
        return llllllllllllIlllIIIIIIlIIllIllll == null;
    }
    
    @Override
    public String getCommandName() {
        return CommandClearInventory.llIIllIlIIlllI[CommandClearInventory.llIIllIlIIllll[0]];
    }
    
    private static boolean lIIIlllIllIllIII(final int llllllllllllIlllIIIIIIlIIlllIllI, final int llllllllllllIlllIIIIIIlIIlllIlIl) {
        return llllllllllllIlllIIIIIIlIIlllIllI >= llllllllllllIlllIIIIIIlIIlllIlIl;
    }
    
    static {
        lIIIlllIllIlIllI();
        lIIIlllIllIlIlIl();
    }
    
    private static void lIIIlllIllIlIlIl() {
        (llIIllIlIIlllI = new String[CommandClearInventory.llIIllIlIIllll[8]])[CommandClearInventory.llIIllIlIIllll[0]] = lIIIlllIllIlIIlI("/TJrIYtyyao=", "eALaz");
        CommandClearInventory.llIIllIlIIlllI[CommandClearInventory.llIIllIlIIllll[1]] = lIIIlllIllIlIIll("aj8UrTBFmEbbiFXcL1eOMnvxkV6tLbQ4", "NsYsc");
        CommandClearInventory.llIIllIlIIlllI[CommandClearInventory.llIIllIlIIllll[2]] = lIIIlllIllIlIIll("ZmUMcRQysrCwRqpytzoTb2sPO1F/PTov", "ZEWVa");
        CommandClearInventory.llIIllIlIIlllI[CommandClearInventory.llIIllIlIIllll[3]] = lIIIlllIllIlIIlI("KsofUVFtNJZxKOvpnqHkLOBcsTpPmLyQ", "dAqIk");
        CommandClearInventory.llIIllIlIIlllI[CommandClearInventory.llIIllIlIIllll[5]] = lIIIlllIllIlIlII("ExwqLDkeFzRvOxwWJjN2FhIuLS0CFg==", "psGAX");
        CommandClearInventory.llIIllIlIIlllI[CommandClearInventory.llIIllIlIIllll[6]] = lIIIlllIllIlIIll("GX6S/hvGY6DTtHbAsn6SdLay6hWK0V6K", "wEuWA");
        CommandClearInventory.llIIllIlIIlllI[CommandClearInventory.llIIllIlIIllll[7]] = lIIIlllIllIlIIlI("KNISv4IvJH/+GXxB4WhZq5HoW9mE9l3T", "sZKob");
    }
    
    private static boolean lIIIlllIllIllIlI(final int llllllllllllIlllIIIIIIlIIllllIlI, final int llllllllllllIlllIIIIIIlIIllllIIl) {
        return llllllllllllIlllIIIIIIlIIllllIlI == llllllllllllIlllIIIIIIlIIllllIIl;
    }
    
    @Override
    public boolean isUsernameIndex(final String[] llllllllllllIlllIIIIIIlIlIllIIIl, final int llllllllllllIlllIIIIIIlIlIlIllll) {
        if (lIIIlllIllIlIlll(llllllllllllIlllIIIIIIlIlIlIllll)) {
            return CommandClearInventory.llIIllIlIIllll[1] != 0;
        }
        return CommandClearInventory.llIIllIlIIllll[0] != 0;
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandClearInventory.llIIllIlIIllll[2];
    }
    
    private static String lIIIlllIllIlIIll(final String llllllllllllIlllIIIIIIlIlIIllIII, final String llllllllllllIlllIIIIIIlIlIIlIlll) {
        try {
            final SecretKeySpec llllllllllllIlllIIIIIIlIlIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIIIIlIlIIlIlll.getBytes(StandardCharsets.UTF_8)), CommandClearInventory.llIIllIlIIllll[9]), "DES");
            final Cipher llllllllllllIlllIIIIIIlIlIIlllII = Cipher.getInstance("DES");
            llllllllllllIlllIIIIIIlIlIIlllII.init(CommandClearInventory.llIIllIlIIllll[2], llllllllllllIlllIIIIIIlIlIIlllIl);
            return new String(llllllllllllIlllIIIIIIlIlIIlllII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIIIIlIlIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIIIIlIlIIllIll) {
            llllllllllllIlllIIIIIIlIlIIllIll.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIlllIllIlIIlI(final String llllllllllllIlllIIIIIIlIlIlIIlIl, final String llllllllllllIlllIIIIIIlIlIlIIlII) {
        try {
            final SecretKeySpec llllllllllllIlllIIIIIIlIlIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIIIIlIlIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIIIIIlIlIlIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIIIIIlIlIlIlIIl.init(CommandClearInventory.llIIllIlIIllll[2], llllllllllllIlllIIIIIIlIlIlIlIlI);
            return new String(llllllllllllIlllIIIIIIlIlIlIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIIIIlIlIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIIIIlIlIlIlIII) {
            llllllllllllIlllIIIIIIlIlIlIlIII.printStackTrace();
            return null;
        }
    }
}
