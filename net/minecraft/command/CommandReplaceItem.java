// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import net.minecraft.server.MinecraftServer;
import java.util.Arrays;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.nbt.NBTException;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.block.Block;
import java.util.Collection;
import net.minecraft.item.Item;
import java.util.List;
import net.minecraft.util.BlockPos;
import com.google.common.collect.Maps;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Map;

public class CommandReplaceItem extends CommandBase
{
    private static final /* synthetic */ int[] llIIIllIIIIllI;
    private static final /* synthetic */ String[] llIIIllIIIIIIl;
    private static final /* synthetic */ Map<String, Integer> SHORTCUTS;
    
    private static String lIIIlIIllllIIlIl(final String llllllllllllIlllIlIlIIIIlIIllllI, final String llllllllllllIlllIlIlIIIIlIIlllIl) {
        try {
            final SecretKeySpec llllllllllllIlllIlIlIIIIlIlIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIlIIIIlIIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlIlIIIIlIlIIIII = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlIlIIIIlIlIIIII.init(CommandReplaceItem.llIIIllIIIIllI[4], llllllllllllIlllIlIlIIIIlIlIIIIl);
            return new String(llllllllllllIlllIlIlIIIIlIlIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIlIIIIlIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIlIIIIlIIlllll) {
            llllllllllllIlllIlIlIIIIlIIlllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIlIIlllllIlll(final int llllllllllllIlllIlIlIIIIIlllIllI, final int llllllllllllIlllIlIlIIIIIlllIlIl) {
        return llllllllllllIlllIlIlIIIIIlllIllI < llllllllllllIlllIlIlIIIIIlllIlIl;
    }
    
    private static void lIIIlIIlllllIIlI() {
        (llIIIllIIIIIIl = new String[CommandReplaceItem.llIIIllIIIIllI[51]])[CommandReplaceItem.llIIIllIIIIllI[0]] = lIIIlIIllllIIIll("gdUvsjFiORjgHuZZZ+9gXQ==", "TNUZy");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[2]] = lIIIlIIllllIIlII("MQQZDkAqBwIYDzBG", "Bhvzn");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[4]] = lIIIlIIllllIIlIl("7zFs+cvQQ2r3EhDBpNTb7A==", "XgRUx");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[6]] = lIIIlIIllllIIlIl("eHpSh/CNP9jxeH1A7gwokZFpKq5Fyy5t", "arutl");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[8]] = lIIIlIIllllIIlIl("Fk60PD5Uv1xfdgehJ3RdHA==", "QeWdz");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[11]] = lIIIlIIllllIIIll("WqqqnxTmZW4rV58Tjhezsw==", "vLmaK");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[14]] = lIIIlIIllllIIlII("FTg9Jn8RMTMiPgg=", "fTRRQ");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[16]] = lIIIlIIllllIIIll("2AvZMI+JSmLQb1HoGPuFOw==", "GSofI");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[10]] = lIIIlIIllllIIlIl("iCvRzJk5Zb4r9CNGDm8HIgDK5hUiA15t", "dCMxb");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[3]] = lIIIlIIllllIIlII("HxQaBngNChgdJEIUEBUl", "lxurV");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[20]] = lIIIlIIllllIIIll("JyqnWGxLgsI0CwR1ShCZDA==", "kmcEu");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[22]] = lIIIlIIllllIIIll("54uRLT5O+xnDReUWTK9X5Y8TMqHxAHtu", "eywAV");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[24]] = lIIIlIIllllIIlII("Ngc6IlQtBCclH2sKJzsVNw==", "EkUVz");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[26]] = lIIIlIIllllIIIll("U2GynNplXni9DeYlRcklBL9lDNubSmV6", "csfun");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[28]] = lIIIlIIllllIIlIl("23US2Ip+q/5zP7gOBphRQA==", "nISXN");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[13]] = lIIIlIIllllIIlII("Jjo8GCkrMSJbOiAlPRQrIDwlECVrICIULyA=", "EUQuH");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[29]] = lIIIlIIllllIIlIl("V7r5Tx6gS4dhw1m2cKfCFDUticiwt3+ZpvRRx9Vis/4=", "lGiXJ");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[30]] = lIIIlIIllllIIlIl("mCvFAcJnAfA=", "lQZhL");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[31]] = lIIIlIIllllIIIll("AQ8ARVwLJrE=", "xlURB");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[32]] = lIIIlIIllllIIlIl("mxqK+LWby+2BGunHotzgFw32AjpN4f+giKYgANJGV2I=", "NSMRH");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[33]] = lIIIlIIllllIIlII("DxkLOgoCEhV5GQkGCjYICR8SMgZCFAo4CAdYEyQKCxM=", "lvfWk");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[34]] = lIIIlIIllllIIlIl("20+BYAgdIBOsCAcblAzO5QVJnT3rSdwBElyVcAnE/7IdG8vvrr1G5A==", "RjqNc");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[36]] = lIIIlIIllllIIlIl("alJxg/mTGOu9e9GB8qrJ/DdBjeRyZoB8ExuP54YeSEI=", "DkSRv");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[37]] = lIIIlIIllllIIlIl("7Ay1jvBOfQZBB2GsgZgqy89aJTrLlDVmRupRNE5XpGE5AcxlacT60Q==", "SHszV");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[38]] = lIIIlIIllllIIlIl("CRhkRr4TLVO1nr+cZftzTyDQ3D6MGcKtM962cjlTAQU=", "wxSAT");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[39]] = lIIIlIIllllIIlIl("Ue24qNNBBFE=", "dTUeX");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[40]] = lIIIlIIllllIIlIl("ccJzBAT7Glrh+HRZ9TdTH7GgTawE/NyMgsRkR6lqrzk=", "vtLuD");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[5]] = lIIIlIIllllIIlIl("gkDza9WYwx0=", "MIzXp");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[41]] = lIIIlIIllllIIIll("SgBep7TGYQCLRpBSpoUR+R4yPR4gGSouUyF3fBPLOMQ7q/4rgG2tcQ==", "Zvxrh");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[42]] = lIIIlIIllllIIlIl("nWn6l0BCApw=", "caydi");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[43]] = lIIIlIIllllIIIll("yK9+9vXIjpU=", "AAkMl");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[44]] = lIIIlIIllllIIIll("U9gwP6EY0nE=", "utBqZ");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[45]] = lIIIlIIllllIIIll("75REUCt0xuc=", "ShxZy");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[46]] = lIIIlIIllllIIlII("PyI4PQEj", "ZLLTu");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[47]] = lIIIlIIllllIIIll("sZW6iGjQtVA=", "nLfhh");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[48]] = lIIIlIIllllIIlII("Bx0FBj0b", "bsqoI");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[49]] = lIIIlIIllllIIIll("mI895SIi3nk=", "ozpjq");
        CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[50]] = lIIIlIIllllIIlIl("qig+rgKBS3w=", "kwbbh");
    }
    
    static {
        lIIIlIIlllllIlIl();
        lIIIlIIlllllIIlI();
        SHORTCUTS = Maps.newHashMap();
        int llllllllllllIlllIlIlIIIlIIlIIlII = CommandReplaceItem.llIIIllIIIIllI[0];
        "".length();
        if ((0x88 ^ 0x8C) < 0) {
            return;
        }
        while (!lIIIlIIlllllIllI(llllllllllllIlllIlIlIIIlIIlIIlII, CommandReplaceItem.llIIIllIIIIllI[1])) {
            CommandReplaceItem.SHORTCUTS.put(String.valueOf(new StringBuilder(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[0]]).append(llllllllllllIlllIlIlIIIlIIlIIlII)), llllllllllllIlllIlIlIIIlIIlIIlII);
            "".length();
            ++llllllllllllIlllIlIlIIIlIIlIIlII;
        }
        int llllllllllllIlllIlIlIIIlIIlIIIII = CommandReplaceItem.llIIIllIIIIllI[0];
        "".length();
        if ((0x0 ^ 0x4) < ("   ".length() & ~"   ".length())) {
            return;
        }
        while (!lIIIlIIlllllIllI(llllllllllllIlllIlIlIIIlIIlIIIII, CommandReplaceItem.llIIIllIIIIllI[3])) {
            CommandReplaceItem.SHORTCUTS.put(String.valueOf(new StringBuilder(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[2]]).append(llllllllllllIlllIlIlIIIlIIlIIIII)), llllllllllllIlllIlIlIIIlIIlIIIII);
            "".length();
            ++llllllllllllIlllIlIlIIIlIIlIIIII;
        }
        int llllllllllllIlllIlIlIIIlIIIllllI = CommandReplaceItem.llIIIllIIIIllI[0];
        "".length();
        if ("  ".length() <= 0) {
            return;
        }
        while (!lIIIlIIlllllIllI(llllllllllllIlllIlIlIIIlIIIllllI, CommandReplaceItem.llIIIllIIIIllI[5])) {
            CommandReplaceItem.SHORTCUTS.put(String.valueOf(new StringBuilder(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[4]]).append(llllllllllllIlllIlIlIIIlIIIllllI)), CommandReplaceItem.llIIIllIIIIllI[3] + llllllllllllIlllIlIlIIIlIIIllllI);
            "".length();
            ++llllllllllllIlllIlIlIIIlIIIllllI;
        }
        int llllllllllllIlllIlIlIIIlIIIlllII = CommandReplaceItem.llIIIllIIIIllI[0];
        "".length();
        if (((0xDF ^ 0x87) & ~(0xFC ^ 0xA4)) > "  ".length()) {
            return;
        }
        while (!lIIIlIIlllllIllI(llllllllllllIlllIlIlIIIlIIIlllII, CommandReplaceItem.llIIIllIIIIllI[5])) {
            CommandReplaceItem.SHORTCUTS.put(String.valueOf(new StringBuilder(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[6]]).append(llllllllllllIlllIlIlIIIlIIIlllII)), CommandReplaceItem.llIIIllIIIIllI[7] + llllllllllllIlllIlIlIIIlIIIlllII);
            "".length();
            ++llllllllllllIlllIlIlIIIlIIIlllII;
        }
        int llllllllllllIlllIlIlIIIlIIIllIlI = CommandReplaceItem.llIIIllIIIIllI[0];
        "".length();
        if ("  ".length() <= 0) {
            return;
        }
        while (!lIIIlIIlllllIllI(llllllllllllIlllIlIlIIIlIIIllIlI, CommandReplaceItem.llIIIllIIIIllI[10])) {
            CommandReplaceItem.SHORTCUTS.put(String.valueOf(new StringBuilder(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[8]]).append(llllllllllllIlllIlIlIIIlIIIllIlI)), CommandReplaceItem.llIIIllIIIIllI[9] + llllllllllllIlllIlIlIIIlIIIllIlI);
            "".length();
            ++llllllllllllIlllIlIlIIIlIIIllIlI;
        }
        int llllllllllllIlllIlIlIIIlIIIllIII = CommandReplaceItem.llIIIllIIIIllI[0];
        "".length();
        if (((0xBC ^ 0x8B ^ (0xB4 ^ 0x8B)) & (0x61 ^ 0x30 ^ (0xF3 ^ 0xAA) ^ -" ".length())) != 0x0) {
            return;
        }
        while (!lIIIlIIlllllIllI(llllllllllllIlllIlIlIIIlIIIllIII, CommandReplaceItem.llIIIllIIIIllI[13])) {
            CommandReplaceItem.SHORTCUTS.put(String.valueOf(new StringBuilder(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[11]]).append(llllllllllllIlllIlIlIIIlIIIllIII)), CommandReplaceItem.llIIIllIIIIllI[12] + llllllllllllIlllIlIlIIIlIIIllIII);
            "".length();
            ++llllllllllllIlllIlIlIIIlIIIllIII;
        }
        CommandReplaceItem.SHORTCUTS.put(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[14]], CommandReplaceItem.llIIIllIIIIllI[15]);
        "".length();
        CommandReplaceItem.SHORTCUTS.put(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[16]], CommandReplaceItem.llIIIllIIIIllI[17]);
        "".length();
        CommandReplaceItem.SHORTCUTS.put(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[10]], CommandReplaceItem.llIIIllIIIIllI[18]);
        "".length();
        CommandReplaceItem.SHORTCUTS.put(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[3]], CommandReplaceItem.llIIIllIIIIllI[19]);
        "".length();
        CommandReplaceItem.SHORTCUTS.put(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[20]], CommandReplaceItem.llIIIllIIIIllI[21]);
        "".length();
        CommandReplaceItem.SHORTCUTS.put(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[22]], CommandReplaceItem.llIIIllIIIIllI[23]);
        "".length();
        CommandReplaceItem.SHORTCUTS.put(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[24]], CommandReplaceItem.llIIIllIIIIllI[25]);
        "".length();
        CommandReplaceItem.SHORTCUTS.put(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[26]], CommandReplaceItem.llIIIllIIIIllI[27]);
        "".length();
    }
    
    private static boolean lIIIlIlIIIIIIlII(final int llllllllllllIlllIlIlIIIIIlIlllIl) {
        return llllllllllllIlllIlIlIIIIIlIlllIl > 0;
    }
    
    private static boolean lIIIlIIlllllllll(final int llllllllllllIlllIlIlIIIIIlIlllll) {
        return llllllllllllIlllIlIlIIIIIlIlllll >= 0;
    }
    
    private static boolean lIIIlIIllllllIIl(final int llllllllllllIlllIlIlIIIIIllIIIIl) {
        return llllllllllllIlllIlIlIIIIIllIIIIl == 0;
    }
    
    private static boolean lIIIlIlIIIIIIIIl(final int llllllllllllIlllIlIlIIIIIllllllI, final int llllllllllllIlllIlIlIIIIIlllllIl) {
        return llllllllllllIlllIlIlIIIIIllllllI == llllllllllllIlllIlIlIIIIIlllllIl;
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender llllllllllllIlllIlIlIIIIllIIIIII, final String[] llllllllllllIlllIlIlIIIIlIllllll, final BlockPos llllllllllllIlllIlIlIIIIlIlllIll) {
        List<String> list;
        if (lIIIlIlIIIIIIIIl(llllllllllllIlllIlIlIIIIlIllllll.length, CommandReplaceItem.llIIIllIIIIllI[2])) {
            final String[] lllllllllllllIIIIlIlllIIIllIllII = new String[CommandReplaceItem.llIIIllIIIIllI[4]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandReplaceItem.llIIIllIIIIllI[0]] = CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[42]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandReplaceItem.llIIIllIIIIllI[2]] = CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[43]];
            list = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIlllIlIlIIIIlIllllll, lllllllllllllIIIIlIlllIIIllIllII);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (lIIIlIlIIIIIIIIl(llllllllllllIlllIlIlIIIIlIllllll.length, CommandReplaceItem.llIIIllIIIIllI[4]) && lIIIlIIllllllIII(llllllllllllIlllIlIlIIIIlIllllll[CommandReplaceItem.llIIIllIIIIllI[0]].equals(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[44]]) ? 1 : 0)) {
            list = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIlllIlIlIIIIlIllllll, this.getUsernames());
            "".length();
            if ((124 + 113 - 108 + 6 ^ 126 + 114 - 171 + 61) <= 0) {
                return null;
            }
        }
        else if (lIIIlIIlllllIllI(llllllllllllIlllIlIlIIIIlIllllll.length, CommandReplaceItem.llIIIllIIIIllI[4]) && lIIIlIlIIIIIIIlI(llllllllllllIlllIlIlIIIIlIllllll.length, CommandReplaceItem.llIIIllIIIIllI[8]) && lIIIlIIllllllIII(llllllllllllIlllIlIlIIIIlIllllll[CommandReplaceItem.llIIIllIIIIllI[0]].equals(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[45]]) ? 1 : 0)) {
            list = CommandBase.func_175771_a(llllllllllllIlllIlIlIIIIlIllllll, CommandReplaceItem.llIIIllIIIIllI[2], llllllllllllIlllIlIlIIIIlIlllIll);
            "".length();
            if ((0x3B ^ 0x22 ^ (0xA0 ^ 0xBD)) > (0x9 ^ 0x6A ^ (0x57 ^ 0x30))) {
                return null;
            }
        }
        else if ((!lIIIlIlIIIIIIIIl(llllllllllllIlllIlIlIIIIlIllllll.length, CommandReplaceItem.llIIIllIIIIllI[6]) || lIIIlIIllllllIIl(llllllllllllIlllIlIlIIIIlIllllll[CommandReplaceItem.llIIIllIIIIllI[0]].equals(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[46]]) ? 1 : 0)) && (!lIIIlIlIIIIIIIIl(llllllllllllIlllIlIlIIIIlIllllll.length, CommandReplaceItem.llIIIllIIIIllI[11]) || lIIIlIIllllllIIl(llllllllllllIlllIlIlIIIIlIllllll[CommandReplaceItem.llIIIllIIIIllI[0]].equals(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[47]]) ? 1 : 0))) {
            if ((!lIIIlIlIIIIIIIIl(llllllllllllIlllIlIlIIIIlIllllll.length, CommandReplaceItem.llIIIllIIIIllI[8]) || lIIIlIIllllllIIl(llllllllllllIlllIlIlIIIIlIllllll[CommandReplaceItem.llIIIllIIIIllI[0]].equals(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[48]]) ? 1 : 0)) && (!lIIIlIlIIIIIIIIl(llllllllllllIlllIlIlIIIIlIllllll.length, CommandReplaceItem.llIIIllIIIIllI[14]) || lIIIlIIllllllIIl(llllllllllllIlllIlIlIIIIlIllllll[CommandReplaceItem.llIIIllIIIIllI[0]].equals(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[49]]) ? 1 : 0))) {
                list = null;
                "".length();
                if ("  ".length() != "  ".length()) {
                    return null;
                }
            }
            else {
                list = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIlllIlIlIIIIlIllllll, Item.itemRegistry.getKeys());
                "".length();
                if (-"   ".length() > 0) {
                    return null;
                }
            }
        }
        else {
            list = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIlllIlIlIIIIlIllllll, CommandReplaceItem.SHORTCUTS.keySet());
        }
        return list;
    }
    
    @Override
    public String getCommandUsage(final ICommandSender llllllllllllIlllIlIlIIIlIIIIIlll) {
        return CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[13]];
    }
    
    @Override
    public String getCommandName() {
        return CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[28]];
    }
    
    @Override
    public boolean isUsernameIndex(final String[] llllllllllllIlllIlIlIIIIlIllIlII, final int llllllllllllIlllIlIlIIIIlIllIlIl) {
        if (lIIIlIlIIIIIIlII(llllllllllllIlllIlIlIIIIlIllIlII.length) && lIIIlIIllllllIII(llllllllllllIlllIlIlIIIIlIllIlII[CommandReplaceItem.llIIIllIIIIllI[0]].equals(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[50]]) ? 1 : 0) && lIIIlIlIIIIIIIIl(llllllllllllIlllIlIlIIIIlIllIlIl, CommandReplaceItem.llIIIllIIIIllI[2])) {
            return CommandReplaceItem.llIIIllIIIIllI[2] != 0;
        }
        return CommandReplaceItem.llIIIllIIIIllI[0] != 0;
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandReplaceItem.llIIIllIIIIllI[4];
    }
    
    private static boolean lIIIlIIllllllIII(final int llllllllllllIlllIlIlIIIIIllIIIll) {
        return llllllllllllIlllIlIlIIIIIllIIIll != 0;
    }
    
    private static boolean lIIIlIIlllllIllI(final int llllllllllllIlllIlIlIIIIIllllIlI, final int llllllllllllIlllIlIlIIIIIllllIIl) {
        return llllllllllllIlllIlIlIIIIIllllIlI >= llllllllllllIlllIlIlIIIIIllllIIl;
    }
    
    private static String lIIIlIIllllIIlII(String llllllllllllIlllIlIlIIIIlIIIlIIl, final String llllllllllllIlllIlIlIIIIlIIIlIII) {
        llllllllllllIlllIlIlIIIIlIIIlIIl = new String(Base64.getDecoder().decode(llllllllllllIlllIlIlIIIIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlIlIIIIlIIIllII = new StringBuilder();
        final char[] llllllllllllIlllIlIlIIIIlIIIlIll = llllllllllllIlllIlIlIIIIlIIIlIII.toCharArray();
        int llllllllllllIlllIlIlIIIIlIIIlIlI = CommandReplaceItem.llIIIllIIIIllI[0];
        final char llllllllllllIlllIlIlIIIIlIIIIlII = (Object)llllllllllllIlllIlIlIIIIlIIIlIIl.toCharArray();
        final boolean llllllllllllIlllIlIlIIIIlIIIIIll = llllllllllllIlllIlIlIIIIlIIIIlII.length != 0;
        double llllllllllllIlllIlIlIIIIlIIIIIlI = CommandReplaceItem.llIIIllIIIIllI[0];
        while (lIIIlIIlllllIlll((int)llllllllllllIlllIlIlIIIIlIIIIIlI, llllllllllllIlllIlIlIIIIlIIIIIll ? 1 : 0)) {
            final char llllllllllllIlllIlIlIIIIlIIIllll = llllllllllllIlllIlIlIIIIlIIIIlII[llllllllllllIlllIlIlIIIIlIIIIIlI];
            llllllllllllIlllIlIlIIIIlIIIllII.append((char)(llllllllllllIlllIlIlIIIIlIIIllll ^ llllllllllllIlllIlIlIIIIlIIIlIll[llllllllllllIlllIlIlIIIIlIIIlIlI % llllllllllllIlllIlIlIIIIlIIIlIll.length]));
            "".length();
            ++llllllllllllIlllIlIlIIIIlIIIlIlI;
            ++llllllllllllIlllIlIlIIIIlIIIIIlI;
            "".length();
            if (((0x98 ^ 0xB7 ^ (0x1F ^ 0x25)) & (0x41 ^ 0x60 ^ (0x7A ^ 0x4E) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlIlIIIIlIIIllII);
    }
    
    private static boolean lIIIlIIllllllllI(final Object llllllllllllIlllIlIlIIIIIllIIlll) {
        return llllllllllllIlllIlIlIIIIIllIIlll != null;
    }
    
    private int getSlotForShortcut(final String llllllllllllIlllIlIlIIIIllIIIllI) throws CommandException {
        if (lIIIlIIllllllIIl(CommandReplaceItem.SHORTCUTS.containsKey(llllllllllllIlllIlIlIIIIllIIIllI) ? 1 : 0)) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[41]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandReplaceItem.llIIIllIIIIllI[2]];
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandReplaceItem.llIIIllIIIIllI[0]] = llllllllllllIlllIlIlIIIIllIIIllI;
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
        }
        return CommandReplaceItem.SHORTCUTS.get(llllllllllllIlllIlIlIIIIllIIIllI);
    }
    
    private static void lIIIlIIlllllIlIl() {
        (llIIIllIIIIllI = new int[52])[0] = ((25 + 76 - 86 + 151 ^ 15 + 21 + 5 + 103) & (172 + 146 - 236 + 107 ^ 125 + 132 - 254 + 136 ^ -" ".length()));
        CommandReplaceItem.llIIIllIIIIllI[1] = (0xC7 ^ 0x9A ^ (0x7A ^ 0x11));
        CommandReplaceItem.llIIIllIIIIllI[2] = " ".length();
        CommandReplaceItem.llIIIllIIIIllI[3] = (0x11 ^ 0x71 ^ (0xAD ^ 0xC4));
        CommandReplaceItem.llIIIllIIIIllI[4] = "  ".length();
        CommandReplaceItem.llIIIllIIIIllI[5] = (0xC8 ^ 0x98 ^ (0x46 ^ 0xD));
        CommandReplaceItem.llIIIllIIIIllI[6] = "   ".length();
        CommandReplaceItem.llIIIllIIIIllI[7] = (0xE0 ^ 0xBD) + (0x44 ^ 0x76) - -(0x52 ^ 0x78) + (0x32 ^ 0x3D);
        CommandReplaceItem.llIIIllIIIIllI[8] = (0xA0 ^ 0xA4);
        CommandReplaceItem.llIIIllIIIIllI[9] = (0xFFFFB5FF & 0x4B2C);
        CommandReplaceItem.llIIIllIIIIllI[10] = (9 + 79 - 48 + 150 ^ 26 + 69 - 67 + 154);
        CommandReplaceItem.llIIIllIIIIllI[11] = (0x35 ^ 0x30);
        CommandReplaceItem.llIIIllIIIIllI[12] = (-(0xFFFFA7CE & 0x7E3D) & (0xFFFFF7FF & 0x2FFF));
        CommandReplaceItem.llIIIllIIIIllI[13] = (102 + 31 - 101 + 130 ^ 84 + 51 - 63 + 101);
        CommandReplaceItem.llIIIllIIIIllI[14] = (0x45 ^ 0x13 ^ (0x1E ^ 0x4E));
        CommandReplaceItem.llIIIllIIIIllI[15] = (0x49 ^ 0x9 ^ (0x15 ^ 0x36));
        CommandReplaceItem.llIIIllIIIIllI[16] = (0x65 ^ 0x6D ^ (0x5 ^ 0xA));
        CommandReplaceItem.llIIIllIIIIllI[17] = (164 + 129 - 207 + 115 ^ 160 + 5 - 159 + 168);
        CommandReplaceItem.llIIIllIIIIllI[18] = (0x7C ^ 0x1A);
        CommandReplaceItem.llIIIllIIIIllI[19] = (29 + 9 + 124 + 73 ^ 6 + 44 + 14 + 78);
        CommandReplaceItem.llIIIllIIIIllI[20] = (0x2 ^ 0x8);
        CommandReplaceItem.llIIIllIIIIllI[21] = (0x5C ^ 0x38);
        CommandReplaceItem.llIIIllIIIIllI[22] = (0x30 ^ 0x3B);
        CommandReplaceItem.llIIIllIIIIllI[23] = (-(0xFFFFF0E7 & 0x7F7B) & (0xFFFFFDF7 & 0x73FA));
        CommandReplaceItem.llIIIllIIIIllI[24] = (0x18 ^ 0x51 ^ (0xF4 ^ 0xB1));
        CommandReplaceItem.llIIIllIIIIllI[25] = (-(0xFFFFD7F5 & 0x7E6F) & (0xFFFFD7FD & 0x7FF7));
        CommandReplaceItem.llIIIllIIIIllI[26] = (0xA0 ^ 0xB8 ^ (0x4D ^ 0x58));
        CommandReplaceItem.llIIIllIIIIllI[27] = (0xFFFF8DF7 & 0x73FB);
        CommandReplaceItem.llIIIllIIIIllI[28] = (0x1D ^ 0x13);
        CommandReplaceItem.llIIIllIIIIllI[29] = (0x43 ^ 0x4F ^ (0x7D ^ 0x61));
        CommandReplaceItem.llIIIllIIIIllI[30] = (0x89 ^ 0xA1 ^ (0x73 ^ 0x4A));
        CommandReplaceItem.llIIIllIIIIllI[31] = (0x16 ^ 0x4);
        CommandReplaceItem.llIIIllIIIIllI[32] = (0x54 ^ 0x6E ^ (0x32 ^ 0x1B));
        CommandReplaceItem.llIIIllIIIIllI[33] = (0xB9 ^ 0xAD);
        CommandReplaceItem.llIIIllIIIIllI[34] = (58 + 25 + 50 + 42 ^ 150 + 59 - 59 + 36);
        CommandReplaceItem.llIIIllIIIIllI[35] = (132 + 186 - 200 + 120 ^ 124 + 120 - 232 + 162);
        CommandReplaceItem.llIIIllIIIIllI[36] = (0x87 ^ 0x91);
        CommandReplaceItem.llIIIllIIIIllI[37] = (0x93 ^ 0x84);
        CommandReplaceItem.llIIIllIIIIllI[38] = (0x9D ^ 0x85);
        CommandReplaceItem.llIIIllIIIIllI[39] = (0xDF ^ 0xC6);
        CommandReplaceItem.llIIIllIIIIllI[40] = (0x74 ^ 0x6E);
        CommandReplaceItem.llIIIllIIIIllI[41] = (0x54 ^ 0x64 ^ (0x9 ^ 0x25));
        CommandReplaceItem.llIIIllIIIIllI[42] = (86 + 41 - 90 + 97 ^ 136 + 137 - 181 + 63);
        CommandReplaceItem.llIIIllIIIIllI[43] = (0xB0 ^ 0x83 ^ (0x2A ^ 0x7));
        CommandReplaceItem.llIIIllIIIIllI[44] = (67 + 0 + 35 + 54 ^ 22 + 28 + 26 + 55);
        CommandReplaceItem.llIIIllIIIIllI[45] = (0x91 ^ 0xB5 ^ (0x53 ^ 0x57));
        CommandReplaceItem.llIIIllIIIIllI[46] = (0x30 ^ 0x11);
        CommandReplaceItem.llIIIllIIIIllI[47] = (0x49 ^ 0x6B);
        CommandReplaceItem.llIIIllIIIIllI[48] = (0x2 ^ 0x21);
        CommandReplaceItem.llIIIllIIIIllI[49] = (0xA ^ 0xE ^ (0xB3 ^ 0x93));
        CommandReplaceItem.llIIIllIIIIllI[50] = (0x69 ^ 0x4C);
        CommandReplaceItem.llIIIllIIIIllI[51] = (73 + 86 - 118 + 118 ^ 176 + 91 - 240 + 158);
    }
    
    private static boolean lIIIlIIlllllllII(final Object llllllllllllIlllIlIlIIIIIllIIlIl) {
        return llllllllllllIlllIlIlIIIIIllIIlIl == null;
    }
    
    @Override
    public void processCommand(final ICommandSender llllllllllllIlllIlIlIIIIllIlIlIl, final String[] llllllllllllIlllIlIlIIIIllIlIlII) throws CommandException {
        if (lIIIlIIlllllIlll(llllllllllllIlllIlIlIIIIllIlIlII.length, CommandReplaceItem.llIIIllIIIIllI[2])) {
            throw new WrongUsageException(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[29]], new Object[CommandReplaceItem.llIIIllIIIIllI[0]]);
        }
        boolean llllllllllllIlllIlIlIIIIlllIIlll = false;
        if (lIIIlIIllllllIII(llllllllllllIlllIlIlIIIIllIlIlII[CommandReplaceItem.llIIIllIIIIllI[0]].equals(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[30]]) ? 1 : 0)) {
            final boolean llllllllllllIlllIlIlIIIIlllIlIII = CommandReplaceItem.llIIIllIIIIllI[0] != 0;
            "".length();
            if ((0x7B ^ 0x7F) == 0x0) {
                return;
            }
        }
        else {
            if (lIIIlIIllllllIIl(llllllllllllIlllIlIlIIIIllIlIlII[CommandReplaceItem.llIIIllIIIIllI[0]].equals(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[31]]) ? 1 : 0)) {
                throw new WrongUsageException(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[32]], new Object[CommandReplaceItem.llIIIllIIIIllI[0]]);
            }
            llllllllllllIlllIlIlIIIIlllIIlll = (CommandReplaceItem.llIIIllIIIIllI[2] != 0);
        }
        int llllllllllllIlllIlIlIIIIlllIIlIl = 0;
        if (lIIIlIIllllllIII(llllllllllllIlllIlIlIIIIlllIIlll ? 1 : 0)) {
            if (lIIIlIIlllllIlll(llllllllllllIlllIlIlIIIIllIlIlII.length, CommandReplaceItem.llIIIllIIIIllI[14])) {
                throw new WrongUsageException(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[33]], new Object[CommandReplaceItem.llIIIllIIIIllI[0]]);
            }
            final int llllllllllllIlllIlIlIIIIlllIIllI = CommandReplaceItem.llIIIllIIIIllI[8];
            "".length();
            if ((0x18 ^ 0x38 ^ (0x3F ^ 0x1B)) != (0xAC ^ 0xBF ^ (0xBE ^ 0xA9))) {
                return;
            }
        }
        else {
            if (lIIIlIIlllllIlll(llllllllllllIlllIlIlIIIIllIlIlII.length, CommandReplaceItem.llIIIllIIIIllI[8])) {
                throw new WrongUsageException(CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[34]], new Object[CommandReplaceItem.llIIIllIIIIllI[0]]);
            }
            llllllllllllIlllIlIlIIIIlllIIlIl = CommandReplaceItem.llIIIllIIIIllI[4];
        }
        final int llllllllllllIlllIlIlIIIIlllIIlII = this.getSlotForShortcut(llllllllllllIlllIlIlIIIIllIlIlII[llllllllllllIlllIlIlIIIIlllIIlIl++]);
        Item llllllllllllIlllIlIlIIIIlllIIIlI = null;
        try {
            final Item llllllllllllIlllIlIlIIIIlllIIIll = CommandBase.getItemByText(llllllllllllIlllIlIlIIIIllIlIlIl, llllllllllllIlllIlIlIIIIllIlIlII[llllllllllllIlllIlIlIIIIlllIIlIl]);
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        catch (NumberInvalidException llllllllllllIlllIlIlIIIIlllIIIIl) {
            if (lIIIlIIllllllIlI(Block.getBlockFromName(llllllllllllIlllIlIlIIIIllIlIlII[llllllllllllIlllIlIlIIIIlllIIlIl]), Blocks.air)) {
                throw llllllllllllIlllIlIlIIIIlllIIIIl;
            }
            llllllllllllIlllIlIlIIIIlllIIIlI = null;
        }
        ++llllllllllllIlllIlIlIIIIlllIIlIl;
        int int1;
        if (lIIIlIIllllllIll(llllllllllllIlllIlIlIIIIllIlIlII.length, llllllllllllIlllIlIlIIIIlllIIlIl)) {
            int1 = CommandBase.parseInt(llllllllllllIlllIlIlIIIIllIlIlII[llllllllllllIlllIlIlIIIIlllIIlIl++], CommandReplaceItem.llIIIllIIIIllI[2], CommandReplaceItem.llIIIllIIIIllI[35]);
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        else {
            int1 = CommandReplaceItem.llIIIllIIIIllI[2];
        }
        final int llllllllllllIlllIlIlIIIIlllIIIII = int1;
        int int2;
        if (lIIIlIIllllllIll(llllllllllllIlllIlIlIIIIllIlIlII.length, llllllllllllIlllIlIlIIIIlllIIlIl)) {
            int2 = CommandBase.parseInt(llllllllllllIlllIlIlIIIIllIlIlII[llllllllllllIlllIlIlIIIIlllIIlIl++]);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            int2 = CommandReplaceItem.llIIIllIIIIllI[0];
        }
        final int llllllllllllIlllIlIlIIIIllIlllll = int2;
        ItemStack llllllllllllIlllIlIlIIIIllIllllI = new ItemStack(llllllllllllIlllIlIlIIIIlllIIIlI, llllllllllllIlllIlIlIIIIlllIIIII, llllllllllllIlllIlIlIIIIllIlllll);
        if (lIIIlIIllllllIll(llllllllllllIlllIlIlIIIIllIlIlII.length, llllllllllllIlllIlIlIIIIlllIIlIl)) {
            final String llllllllllllIlllIlIlIIIIllIlllIl = CommandBase.getChatComponentFromNthArg(llllllllllllIlllIlIlIIIIllIlIlIl, llllllllllllIlllIlIlIIIIllIlIlII, llllllllllllIlllIlIlIIIIlllIIlIl).getUnformattedText();
            try {
                llllllllllllIlllIlIlIIIIllIllllI.setTagCompound(JsonToNBT.getTagFromJson(llllllllllllIlllIlIlIIIIllIlllIl));
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
            }
            catch (NBTException llllllllllllIlllIlIlIIIIllIlllII) {
                final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[36]];
                final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandReplaceItem.llIIIllIIIIllI[2]];
                lllllllllllllIlIIIIIIlIlIllIIlIl[CommandReplaceItem.llIIIllIIIIllI[0]] = llllllllllllIlllIlIlIIIIllIlllII.getMessage();
                throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
            }
        }
        if (lIIIlIIlllllllII(llllllllllllIlllIlIlIIIIllIllllI.getItem())) {
            llllllllllllIlllIlIlIIIIllIllllI = null;
        }
        if (lIIIlIIllllllIII(llllllllllllIlllIlIlIIIIlllIIlll ? 1 : 0)) {
            llllllllllllIlllIlIlIIIIllIlIlIl.setCommandStat(CommandResultStats.Type.AFFECTED_ITEMS, CommandReplaceItem.llIIIllIIIIllI[0]);
            final BlockPos llllllllllllIlllIlIlIIIIllIllIll = CommandBase.parseBlockPos(llllllllllllIlllIlIlIIIIllIlIlIl, llllllllllllIlllIlIlIIIIllIlIlII, CommandReplaceItem.llIIIllIIIIllI[2], (boolean)(CommandReplaceItem.llIIIllIIIIllI[0] != 0));
            final World llllllllllllIlllIlIlIIIIllIllIlI = llllllllllllIlllIlIlIIIIllIlIlIl.getEntityWorld();
            final TileEntity llllllllllllIlllIlIlIIIIllIllIIl = llllllllllllIlllIlIlIIIIllIllIlI.getTileEntity(llllllllllllIlllIlIlIIIIllIllIll);
            if (!lIIIlIIllllllllI(llllllllllllIlllIlIlIIIIllIllIIl) || lIIIlIIllllllIIl((llllllllllllIlllIlIlIIIIllIllIIl instanceof IInventory) ? 1 : 0)) {
                final String lllllllllllllIlIIIIIIlIlIllIlIIl2 = CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[37]];
                final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl2 = new Object[CommandReplaceItem.llIIIllIIIIllI[6]];
                lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandReplaceItem.llIIIllIIIIllI[0]] = llllllllllllIlllIlIlIIIIllIllIll.getX();
                lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandReplaceItem.llIIIllIIIIllI[2]] = llllllllllllIlllIlIlIIIIllIllIll.getY();
                lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandReplaceItem.llIIIllIIIIllI[4]] = llllllllllllIlllIlIlIIIIllIllIll.getZ();
                throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl2, lllllllllllllIlIIIIIIlIlIllIIlIl2);
            }
            final IInventory llllllllllllIlllIlIlIIIIllIllIII = (IInventory)llllllllllllIlllIlIlIIIIllIllIIl;
            if (lIIIlIIlllllllll(llllllllllllIlllIlIlIIIIlllIIlII) && lIIIlIIlllllIlll(llllllllllllIlllIlIlIIIIlllIIlII, llllllllllllIlllIlIlIIIIllIllIII.getSizeInventory())) {
                llllllllllllIlllIlIlIIIIllIllIII.setInventorySlotContents(llllllllllllIlllIlIlIIIIlllIIlII, llllllllllllIlllIlIlIIIIllIllllI);
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
            }
        }
        else {
            final Entity llllllllllllIlllIlIlIIIIllIlIlll = CommandBase.func_175768_b(llllllllllllIlllIlIlIIIIllIlIlIl, llllllllllllIlllIlIlIIIIllIlIlII[CommandReplaceItem.llIIIllIIIIllI[2]]);
            llllllllllllIlllIlIlIIIIllIlIlIl.setCommandStat(CommandResultStats.Type.AFFECTED_ITEMS, CommandReplaceItem.llIIIllIIIIllI[0]);
            if (lIIIlIIllllllIII((llllllllllllIlllIlIlIIIIllIlIlll instanceof EntityPlayer) ? 1 : 0)) {
                ((EntityPlayer)llllllllllllIlllIlIlIIIIllIlIlll).inventoryContainer.detectAndSendChanges();
            }
            if (lIIIlIIllllllIIl(llllllllllllIlllIlIlIIIIllIlIlll.replaceItemInInventory(llllllllllllIlllIlIlIIIIlllIIlII, llllllllllllIlllIlIlIIIIllIllllI) ? 1 : 0)) {
                final String lllllllllllllIlIIIIIIlIlIllIlIIl3 = CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[38]];
                final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl3 = new Object[CommandReplaceItem.llIIIllIIIIllI[6]];
                lllllllllllllIlIIIIIIlIlIllIIlIl3[CommandReplaceItem.llIIIllIIIIllI[0]] = llllllllllllIlllIlIlIIIIlllIIlII;
                lllllllllllllIlIIIIIIlIlIllIIlIl3[CommandReplaceItem.llIIIllIIIIllI[2]] = llllllllllllIlllIlIlIIIIlllIIIII;
                final int n = CommandReplaceItem.llIIIllIIIIllI[4];
                Object chatComponent;
                if (lIIIlIIlllllllII(llllllllllllIlllIlIlIIIIllIllllI)) {
                    chatComponent = CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[39]];
                    "".length();
                    if ((97 + 51 - 82 + 78 ^ 52 + 118 - 78 + 57) == 0x0) {
                        return;
                    }
                }
                else {
                    chatComponent = llllllllllllIlllIlIlIIIIllIllllI.getChatComponent();
                }
                lllllllllllllIlIIIIIIlIlIllIIlIl3[n] = chatComponent;
                throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl3, lllllllllllllIlIIIIIIlIlIllIIlIl3);
            }
            if (lIIIlIIllllllIII((llllllllllllIlllIlIlIIIIllIlIlll instanceof EntityPlayer) ? 1 : 0)) {
                ((EntityPlayer)llllllllllllIlllIlIlIIIIllIlIlll).inventoryContainer.detectAndSendChanges();
            }
        }
        llllllllllllIlllIlIlIIIIllIlIlIl.setCommandStat(CommandResultStats.Type.AFFECTED_ITEMS, llllllllllllIlllIlIlIIIIlllIIIII);
        final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[40]];
        final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandReplaceItem.llIIIllIIIIllI[6]];
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandReplaceItem.llIIIllIIIIllI[0]] = llllllllllllIlllIlIlIIIIlllIIlII;
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandReplaceItem.llIIIllIIIIllI[2]] = llllllllllllIlllIlIlIIIIlllIIIII;
        final int n2 = CommandReplaceItem.llIIIllIIIIllI[4];
        Object chatComponent2;
        if (lIIIlIIlllllllII(llllllllllllIlllIlIlIIIIllIllllI)) {
            chatComponent2 = CommandReplaceItem.llIIIllIIIIIIl[CommandReplaceItem.llIIIllIIIIllI[5]];
            "".length();
            if (-(0xE6 ^ 0x8D ^ (0xDE ^ 0xB1)) >= 0) {
                return;
            }
        }
        else {
            chatComponent2 = llllllllllllIlllIlIlIIIIllIllllI.getChatComponent();
        }
        lllllllllllllIIIIlIlllIIIlIIIlll[n2] = chatComponent2;
        CommandBase.notifyOperators(llllllllllllIlllIlIlIIIIllIlIlIl, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
    }
    
    private static boolean lIIIlIIllllllIll(final int llllllllllllIlllIlIlIIIIIllIlllI, final int llllllllllllIlllIlIlIIIIIllIllIl) {
        return llllllllllllIlllIlIlIIIIIllIlllI > llllllllllllIlllIlIlIIIIIllIllIl;
    }
    
    private static boolean lIIIlIlIIIIIIIlI(final int llllllllllllIlllIlIlIIIIIlllIIlI, final int llllllllllllIlllIlIlIIIIIlllIIIl) {
        return llllllllllllIlllIlIlIIIIIlllIIlI <= llllllllllllIlllIlIlIIIIIlllIIIl;
    }
    
    private static String lIIIlIIllllIIIll(final String llllllllllllIlllIlIlIIIIlIlIlIIl, final String llllllllllllIlllIlIlIIIIlIlIlIII) {
        try {
            final SecretKeySpec llllllllllllIlllIlIlIIIIlIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIlIIIIlIlIlIII.getBytes(StandardCharsets.UTF_8)), CommandReplaceItem.llIIIllIIIIllI[10]), "DES");
            final Cipher llllllllllllIlllIlIlIIIIlIlIllIl = Cipher.getInstance("DES");
            llllllllllllIlllIlIlIIIIlIlIllIl.init(CommandReplaceItem.llIIIllIIIIllI[4], llllllllllllIlllIlIlIIIIlIlIlllI);
            return new String(llllllllllllIlllIlIlIIIIlIlIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIlIIIIlIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIlIIIIlIlIllII) {
            llllllllllllIlllIlIlIIIIlIlIllII.printStackTrace();
            return null;
        }
    }
    
    protected String[] getUsernames() {
        return MinecraftServer.getServer().getAllUsernames();
    }
    
    private static boolean lIIIlIIllllllIlI(final Object llllllllllllIlllIlIlIIIIIllIlIlI, final Object llllllllllllIlllIlIlIIIIIllIlIIl) {
        return llllllllllllIlllIlIlIIIIIllIlIlI != llllllllllllIlllIlIlIIIIIllIlIIl;
    }
}
