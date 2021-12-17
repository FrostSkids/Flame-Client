// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.util.Collection;
import java.util.List;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTException;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class CommandGive extends CommandBase
{
    private static final /* synthetic */ int[] llIlllIllIIIII;
    private static final /* synthetic */ String[] llIlllIlIlllll;
    
    private static void lIIllIlIIIIIIIIl() {
        (llIlllIlIlllll = new String[CommandGive.llIlllIllIIIII[7]])[CommandGive.llIlllIllIIIII[0]] = lIIllIIlllllllll("JiEDBg==", "AHuct");
        CommandGive.llIlllIlIlllll[CommandGive.llIlllIllIIIII[2]] = lIIllIlIIIIIIIII("1z4jgBF3jG9olrPmImWkfKa5mRv98/6n", "KBcjw");
        CommandGive.llIlllIlIlllll[CommandGive.llIlllIllIIIII[1]] = lIIllIIlllllllll("KyIgCDImKT5LNCE7KEsmOywqAA==", "HMMeS");
        CommandGive.llIlllIlIlllll[CommandGive.llIlllIllIIIII[3]] = lIIllIIlllllllll("GwY+AS8WDSBCKREfNkI6GQ4WHjwXGw==", "xiSlN");
        CommandGive.llIlllIlIlllll[CommandGive.llIlllIllIIIII[5]] = lIIllIIlllllllll("KikZCQs1ZgcCFA==", "XHwmd");
        CommandGive.llIlllIlIlllll[CommandGive.llIlllIllIIIII[6]] = lIIllIlIIIIIIIII("24YKFw3dP7I7r9CRX/Z2DIeekIgUzhrP", "IvsmC");
    }
    
    @Override
    public boolean isUsernameIndex(final String[] llllllllllllIllIIlIIIlIIlIllIIlI, final int llllllllllllIllIIlIIIlIIlIllIIII) {
        if (lIIllIlIIIIIlIIl(llllllllllllIllIIlIIIlIIlIllIIII)) {
            return CommandGive.llIlllIllIIIII[2] != 0;
        }
        return CommandGive.llIlllIllIIIII[0] != 0;
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandGive.llIlllIllIIIII[1];
    }
    
    private static String lIIllIlIIIIIIIII(final String llllllllllllIllIIlIIIlIIlIIIlllI, final String llllllllllllIllIIlIIIlIIlIIIllIl) {
        try {
            final SecretKeySpec llllllllllllIllIIlIIIlIIlIIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIIlIIlIIIllIl.getBytes(StandardCharsets.UTF_8)), CommandGive.llIlllIllIIIII[8]), "DES");
            final Cipher llllllllllllIllIIlIIIlIIlIIlIIlI = Cipher.getInstance("DES");
            llllllllllllIllIIlIIIlIIlIIlIIlI.init(CommandGive.llIlllIllIIIII[1], llllllllllllIllIIlIIIlIIlIIlIIll);
            return new String(llllllllllllIllIIlIIIlIIlIIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIIlIIlIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIIIlIIlIIlIIIl) {
            llllllllllllIllIIlIIIlIIlIIlIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String getCommandName() {
        return CommandGive.llIlllIlIlllll[CommandGive.llIlllIllIIIII[0]];
    }
    
    private static boolean lIIllIlIIIIIIlll(final Object llllllllllllIllIIlIIIlIIIlllllIl) {
        return llllllllllllIllIIlIIIlIIIlllllIl != null;
    }
    
    private static boolean lIIllIlIIIIIIllI(final int llllllllllllIllIIlIIIlIIIlllIlll) {
        return llllllllllllIllIIlIIIlIIIlllIlll <= 0;
    }
    
    private static boolean lIIllIlIIIIIIlIl(final int llllllllllllIllIIlIIIlIIIllllIll) {
        return llllllllllllIllIIlIIIlIIIllllIll != 0;
    }
    
    private static boolean lIIllIlIIIIIlIIl(final int llllllllllllIllIIlIIIlIIIllllIIl) {
        return llllllllllllIllIIlIIIlIIIllllIIl == 0;
    }
    
    private static void lIIllIlIIIIIIIlI() {
        (llIlllIllIIIII = new int[9])[0] = ((0x11 ^ 0x51) & ~(0x6D ^ 0x2D));
        CommandGive.llIlllIllIIIII[1] = "  ".length();
        CommandGive.llIlllIllIIIII[2] = " ".length();
        CommandGive.llIlllIllIIIII[3] = "   ".length();
        CommandGive.llIlllIllIIIII[4] = (0xB7 ^ 0xBD ^ (0xC5 ^ 0x8F));
        CommandGive.llIlllIllIIIII[5] = (0x6E ^ 0x6A);
        CommandGive.llIlllIllIIIII[6] = (0x15 ^ 0x10);
        CommandGive.llIlllIllIIIII[7] = (0x51 ^ 0x57);
        CommandGive.llIlllIllIIIII[8] = (0x56 ^ 0x67 ^ (0x66 ^ 0x5F));
    }
    
    private static boolean lIIllIlIIIIIIIll(final int llllllllllllIllIIlIIIlIIlIIIIIII, final int llllllllllllIllIIlIIIlIIIlllllll) {
        return llllllllllllIllIIlIIIlIIlIIIIIII < llllllllllllIllIIlIIIlIIIlllllll;
    }
    
    protected String[] getPlayers() {
        return MinecraftServer.getServer().getAllUsernames();
    }
    
    private static boolean lIIllIlIIIIIIlII(final int llllllllllllIllIIlIIIlIIlIIIIlII, final int llllllllllllIllIIlIIIlIIlIIIIIll) {
        return llllllllllllIllIIlIIIlIIlIIIIlII >= llllllllllllIllIIlIIIlIIlIIIIIll;
    }
    
    private static String lIIllIIlllllllll(String llllllllllllIllIIlIIIlIIlIlIIIII, final String llllllllllllIllIIlIIIlIIlIlIIlII) {
        llllllllllllIllIIlIIIlIIlIlIIIII = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIlIIIlIIlIlIIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIlIIIlIIlIlIIIll = new StringBuilder();
        final char[] llllllllllllIllIIlIIIlIIlIlIIIlI = llllllllllllIllIIlIIIlIIlIlIIlII.toCharArray();
        int llllllllllllIllIIlIIIlIIlIlIIIIl = CommandGive.llIlllIllIIIII[0];
        final Exception llllllllllllIllIIlIIIlIIlIIllIll = (Object)((String)llllllllllllIllIIlIIIlIIlIlIIIII).toCharArray();
        final String llllllllllllIllIIlIIIlIIlIIllIlI = (String)llllllllllllIllIIlIIIlIIlIIllIll.length;
        char llllllllllllIllIIlIIIlIIlIIllIIl = (char)CommandGive.llIlllIllIIIII[0];
        while (lIIllIlIIIIIIIll(llllllllllllIllIIlIIIlIIlIIllIIl, (int)llllllllllllIllIIlIIIlIIlIIllIlI)) {
            final char llllllllllllIllIIlIIIlIIlIlIIllI = llllllllllllIllIIlIIIlIIlIIllIll[llllllllllllIllIIlIIIlIIlIIllIIl];
            llllllllllllIllIIlIIIlIIlIlIIIll.append((char)(llllllllllllIllIIlIIIlIIlIlIIllI ^ llllllllllllIllIIlIIIlIIlIlIIIlI[llllllllllllIllIIlIIIlIIlIlIIIIl % llllllllllllIllIIlIIIlIIlIlIIIlI.length]));
            "".length();
            ++llllllllllllIllIIlIIIlIIlIlIIIIl;
            ++llllllllllllIllIIlIIIlIIlIIllIIl;
            "".length();
            if (-" ".length() > ((0xAB ^ 0x96) & ~(0xFC ^ 0xC1))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIlIIIlIIlIlIIIll);
    }
    
    @Override
    public void processCommand(final ICommandSender llllllllllllIllIIlIIIlIIllIIIllI, final String[] llllllllllllIllIIlIIIlIIllIlIIlI) throws CommandException {
        if (lIIllIlIIIIIIIll(llllllllllllIllIIlIIIlIIllIlIIlI.length, CommandGive.llIlllIllIIIII[1])) {
            throw new WrongUsageException(CommandGive.llIlllIlIlllll[CommandGive.llIlllIllIIIII[1]], new Object[CommandGive.llIlllIllIIIII[0]]);
        }
        final EntityPlayer llllllllllllIllIIlIIIlIIllIlIIIl = CommandBase.getPlayer(llllllllllllIllIIlIIIlIIllIIIllI, llllllllllllIllIIlIIIlIIllIlIIlI[CommandGive.llIlllIllIIIII[0]]);
        final Item llllllllllllIllIIlIIIlIIllIlIIII = CommandBase.getItemByText(llllllllllllIllIIlIIIlIIllIIIllI, llllllllllllIllIIlIIIlIIllIlIIlI[CommandGive.llIlllIllIIIII[2]]);
        int int1;
        if (lIIllIlIIIIIIlII(llllllllllllIllIIlIIIlIIllIlIIlI.length, CommandGive.llIlllIllIIIII[3])) {
            int1 = CommandBase.parseInt(llllllllllllIllIIlIIIlIIllIlIIlI[CommandGive.llIlllIllIIIII[1]], CommandGive.llIlllIllIIIII[2], CommandGive.llIlllIllIIIII[4]);
            "".length();
            if ((0x8E ^ 0xA8 ^ (0x4C ^ 0x6E)) <= "   ".length()) {
                return;
            }
        }
        else {
            int1 = CommandGive.llIlllIllIIIII[2];
        }
        final int llllllllllllIllIIlIIIlIIllIIllll = int1;
        int int2;
        if (lIIllIlIIIIIIlII(llllllllllllIllIIlIIIlIIllIlIIlI.length, CommandGive.llIlllIllIIIII[5])) {
            int2 = CommandBase.parseInt(llllllllllllIllIIlIIIlIIllIlIIlI[CommandGive.llIlllIllIIIII[3]]);
            "".length();
            if (-" ".length() >= (0xC2 ^ 0xC6)) {
                return;
            }
        }
        else {
            int2 = CommandGive.llIlllIllIIIII[0];
        }
        final int llllllllllllIllIIlIIIlIIllIIlllI = int2;
        final ItemStack llllllllllllIllIIlIIIlIIllIIllIl = new ItemStack(llllllllllllIllIIlIIIlIIllIlIIII, llllllllllllIllIIlIIIlIIllIIllll, llllllllllllIllIIlIIIlIIllIIlllI);
        if (lIIllIlIIIIIIlII(llllllllllllIllIIlIIIlIIllIlIIlI.length, CommandGive.llIlllIllIIIII[6])) {
            final String llllllllllllIllIIlIIIlIIllIIllII = CommandBase.getChatComponentFromNthArg(llllllllllllIllIIlIIIlIIllIIIllI, llllllllllllIllIIlIIIlIIllIlIIlI, CommandGive.llIlllIllIIIII[5]).getUnformattedText();
            try {
                llllllllllllIllIIlIIIlIIllIIllIl.setTagCompound(JsonToNBT.getTagFromJson(llllllllllllIllIIlIIIlIIllIIllII));
                "".length();
                if (null != null) {
                    return;
                }
            }
            catch (NBTException llllllllllllIllIIlIIIlIIllIIlIll) {
                final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandGive.llIlllIlIlllll[CommandGive.llIlllIllIIIII[3]];
                final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandGive.llIlllIllIIIII[2]];
                lllllllllllllIlIIIIIIlIlIllIIlIl[CommandGive.llIlllIllIIIII[0]] = llllllllllllIllIIlIIIlIIllIIlIll.getMessage();
                throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
            }
        }
        final boolean llllllllllllIllIIlIIIlIIllIIlIlI = llllllllllllIllIIlIIIlIIllIlIIIl.inventory.addItemStackToInventory(llllllllllllIllIIlIIIlIIllIIllIl);
        if (lIIllIlIIIIIIlIl(llllllllllllIllIIlIIIlIIllIIlIlI ? 1 : 0)) {
            llllllllllllIllIIlIIIlIIllIlIIIl.worldObj.playSoundAtEntity(llllllllllllIllIIlIIIlIIllIlIIIl, CommandGive.llIlllIlIlllll[CommandGive.llIlllIllIIIII[5]], 0.2f, ((llllllllllllIllIIlIIIlIIllIlIIIl.getRNG().nextFloat() - llllllllllllIllIIlIIIlIIllIlIIIl.getRNG().nextFloat()) * 0.7f + 1.0f) * 2.0f);
            llllllllllllIllIIlIIIlIIllIlIIIl.inventoryContainer.detectAndSendChanges();
        }
        if (lIIllIlIIIIIIlIl(llllllllllllIllIIlIIIlIIllIIlIlI ? 1 : 0) && lIIllIlIIIIIIllI(llllllllllllIllIIlIIIlIIllIIllIl.stackSize)) {
            llllllllllllIllIIlIIIlIIllIIllIl.stackSize = CommandGive.llIlllIllIIIII[2];
            llllllllllllIllIIlIIIlIIllIIIllI.setCommandStat(CommandResultStats.Type.AFFECTED_ITEMS, llllllllllllIllIIlIIIlIIllIIllll);
            final EntityItem llllllllllllIllIIlIIIlIIllIIlIIl = llllllllllllIllIIlIIIlIIllIlIIIl.dropPlayerItemWithRandomChoice(llllllllllllIllIIlIIIlIIllIIllIl, (boolean)(CommandGive.llIlllIllIIIII[0] != 0));
            if (lIIllIlIIIIIIlll(llllllllllllIllIIlIIIlIIllIIlIIl)) {
                llllllllllllIllIIlIIIlIIllIIlIIl.func_174870_v();
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
            }
        }
        else {
            llllllllllllIllIIlIIIlIIllIIIllI.setCommandStat(CommandResultStats.Type.AFFECTED_ITEMS, llllllllllllIllIIlIIIlIIllIIllll - llllllllllllIllIIlIIIlIIllIIllIl.stackSize);
            final EntityItem llllllllllllIllIIlIIIlIIllIIlIII = llllllllllllIllIIlIIIlIIllIlIIIl.dropPlayerItemWithRandomChoice(llllllllllllIllIIlIIIlIIllIIllIl, (boolean)(CommandGive.llIlllIllIIIII[0] != 0));
            if (lIIllIlIIIIIIlll(llllllllllllIllIIlIIIlIIllIIlIII)) {
                llllllllllllIllIIlIIIlIIllIIlIII.setNoPickupDelay();
                llllllllllllIllIIlIIIlIIllIIlIII.setOwner(llllllllllllIllIIlIIIlIIllIlIIIl.getName());
            }
        }
        final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandGive.llIlllIlIlllll[CommandGive.llIlllIllIIIII[6]];
        final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandGive.llIlllIllIIIII[3]];
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandGive.llIlllIllIIIII[0]] = llllllllllllIllIIlIIIlIIllIIllIl.getChatComponent();
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandGive.llIlllIllIIIII[2]] = llllllllllllIllIIlIIIlIIllIIllll;
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandGive.llIlllIllIIIII[1]] = llllllllllllIllIIlIIIlIIllIlIIIl.getName();
        CommandBase.notifyOperators(llllllllllllIllIIlIIIlIIllIIIllI, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender llllllllllllIllIIlIIIlIIlIlllIlI, final String[] llllllllllllIllIIlIIIlIIlIlllIIl, final BlockPos llllllllllllIllIIlIIIlIIlIlllIII) {
        List<String> list;
        if (lIIllIlIIIIIlIII(llllllllllllIllIIlIIIlIIlIlllIIl.length, CommandGive.llIlllIllIIIII[2])) {
            list = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIllIIlIIIlIIlIlllIIl, this.getPlayers());
            "".length();
            if (" ".length() >= "  ".length()) {
                return null;
            }
        }
        else if (lIIllIlIIIIIlIII(llllllllllllIllIIlIIIlIIlIlllIIl.length, CommandGive.llIlllIllIIIII[1])) {
            list = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIllIIlIIIlIIlIlllIIl, Item.itemRegistry.getKeys());
            "".length();
            if (((0x2E ^ 0x33 ^ (0xCC ^ 0x94)) & (42 + 76 - 112 + 218 ^ 43 + 42 + 65 + 15 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            list = null;
        }
        return list;
    }
    
    @Override
    public String getCommandUsage(final ICommandSender llllllllllllIllIIlIIIlIIllIlllll) {
        return CommandGive.llIlllIlIlllll[CommandGive.llIlllIllIIIII[2]];
    }
    
    private static boolean lIIllIlIIIIIlIII(final int llllllllllllIllIIlIIIlIIlIIIlIII, final int llllllllllllIllIIlIIIlIIlIIIIlll) {
        return llllllllllllIllIIlIIIlIIlIIIlIII == llllllllllllIllIIlIIIlIIlIIIIlll;
    }
    
    static {
        lIIllIlIIIIIIIlI();
        lIIllIlIIIIIIIIl();
    }
}
