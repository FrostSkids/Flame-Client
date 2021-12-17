// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.util.Iterator;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.state.IBlockState;
import java.util.LinkedList;
import net.minecraft.world.World;
import net.minecraft.world.NextTickListEntry;
import net.minecraft.inventory.IInventory;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.init.Blocks;
import com.google.common.collect.Lists;
import net.minecraft.util.Vec3i;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collection;
import net.minecraft.block.Block;
import java.util.List;
import net.minecraft.util.BlockPos;

public class CommandClone extends CommandBase
{
    private static final /* synthetic */ int[] lllIIlIIIllllI;
    private static final /* synthetic */ String[] lllIIlIIIlllII;
    
    private static boolean lIIlllllIIIllIIl(final int llllllllllllIlIllllIllllIllllIlI) {
        return llllllllllllIlIllllIllllIllllIlI > 0;
    }
    
    private static boolean lIIlllllIIIlIIII(final int llllllllllllIlIllllIlllllIIllIll, final int llllllllllllIlIllllIlllllIIllIlI) {
        return llllllllllllIlIllllIlllllIIllIll >= llllllllllllIlIllllIlllllIIllIlI;
    }
    
    private static boolean lIIlllllIIIIlllI(final int llllllllllllIlIllllIlllllIIlIlll, final int llllllllllllIlIllllIlllllIIlIllI) {
        return llllllllllllIlIllllIlllllIIlIlll < llllllllllllIlIllllIlllllIIlIllI;
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender llllllllllllIlIllllIllllllIllIII, final String[] llllllllllllIlIllllIllllllIlIlIl, final BlockPos llllllllllllIlIllllIllllllIlIlII) {
        List<String> list;
        if (lIIlllllIIIllIIl(llllllllllllIlIllllIllllllIlIlIl.length) && lIIlllllIIIllIlI(llllllllllllIlIllllIllllllIlIlIl.length, CommandClone.lllIIlIIIllllI[4])) {
            list = CommandBase.func_175771_a(llllllllllllIlIllllIllllllIlIlIl, CommandClone.lllIIlIIIllllI[0], llllllllllllIlIllllIllllllIlIlII);
            "".length();
            if ((0x29 ^ 0x70 ^ (0x14 ^ 0x49)) <= " ".length()) {
                return null;
            }
        }
        else if (lIIlllllIIIIllll(llllllllllllIlIllllIllllllIlIlIl.length, CommandClone.lllIIlIIIllllI[4]) && lIIlllllIIIllIlI(llllllllllllIlIllllIllllllIlIlIl.length, CommandClone.lllIIlIIIllllI[5])) {
            list = CommandBase.func_175771_a(llllllllllllIlIllllIllllllIlIlIl, CommandClone.lllIIlIIIllllI[4], llllllllllllIlIllllIllllllIlIlII);
            "".length();
            if (((0x9F ^ 0xBC) & ~(0x72 ^ 0x51)) >= "  ".length()) {
                return null;
            }
        }
        else if (lIIlllllIIIIllll(llllllllllllIlIllllIllllllIlIlIl.length, CommandClone.lllIIlIIIllllI[5]) && lIIlllllIIIllIlI(llllllllllllIlIllllIllllllIlIlIl.length, CommandClone.lllIIlIIIllllI[3])) {
            list = CommandBase.func_175771_a(llllllllllllIlIllllIllllllIlIlIl, CommandClone.lllIIlIIIllllI[5], llllllllllllIlIllllIllllllIlIlII);
            "".length();
            if ("   ".length() < "   ".length()) {
                return null;
            }
        }
        else if (lIIlllllIIIlIlll(llllllllllllIlIllllIllllllIlIlIl.length, CommandClone.lllIIlIIIllllI[9])) {
            final String[] lllllllllllllIIIIlIlllIIIllIllII = new String[CommandClone.lllIIlIIIllllI[4]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandClone.lllIIlIIIllllI[0]] = CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[21]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandClone.lllIIlIIIllllI[2]] = CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[22]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandClone.lllIIlIIIllllI[1]] = CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[23]];
            list = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIlIllllIllllllIlIlIl, lllllllllllllIIIIlIlllIIIllIllII);
            "".length();
            if (" ".length() < " ".length()) {
                return null;
            }
        }
        else if (lIIlllllIIIlIlll(llllllllllllIlIllllIllllllIlIlIl.length, CommandClone.lllIIlIIIllllI[8])) {
            final String[] lllllllllllllIIIIlIlllIIIllIllII2 = new String[CommandClone.lllIIlIIIllllI[4]];
            lllllllllllllIIIIlIlllIIIllIllII2[CommandClone.lllIIlIIIllllI[0]] = CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[24]];
            lllllllllllllIIIIlIlllIIIllIllII2[CommandClone.lllIIlIIIllllI[2]] = CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[25]];
            lllllllllllllIIIIlIlllIIIllIllII2[CommandClone.lllIIlIIIllllI[1]] = CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[26]];
            list = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIlIllllIllllllIlIlIl, lllllllllllllIIIIlIlllIIIllIllII2);
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        else if (lIIlllllIIIlIlll(llllllllllllIlIllllIllllllIlIlIl.length, CommandClone.lllIIlIIIllllI[15]) && lIIlllllIIIlIIlI(CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[27]].equals(llllllllllllIlIllllIllllllIlIlIl[CommandClone.lllIIlIIIllllI[3]]) ? 1 : 0)) {
            list = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIlIllllIllllllIlIlIl, Block.blockRegistry.getKeys());
            "".length();
            if (((0xEE ^ 0xBE ^ (0x82 ^ 0x9B)) & (0x6D ^ 0x9 ^ (0x32 ^ 0x1F) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            list = null;
        }
        return list;
    }
    
    private static void lIIlllllIIIIIllI() {
        (lllIIlIIIlllII = new String[CommandClone.lllIIlIIIllllI[28]])[CommandClone.lllIIlIIIllllI[0]] = lIIlllllIIIIIIll("IUVxWCvCC6I=", "ELAPV");
        CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[2]] = lIIlllllIIIIIlII("OaA8sSgNq2a8qg19tNgJPcNaGnx9G4ra", "eJjhr");
        CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[1]] = lIIlllllIIIIIlII("IVHkH4zFzrwYKh0N1rB1LngHdFlo7qXn", "batXu");
        CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[4]] = lIIlllllIIIIIlIl("Dzw6Jg4CNyRlDAA8OS5BGDw4Bg4CKhUnAA84JA==", "lSWKo");
        CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[10]] = lIIlllllIIIIIIll("46YapA0zrMc=", "csskF");
        CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[11]] = lIIlllllIIIIIlII("lSrHWOwgwXI=", "mdpTz");
        CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[5]] = lIIlllllIIIIIIll("0/1cN5x/ax6sKPGobUAgY8IYKaE9HCwxJiequDcFpRk=", "xjNnB");
        CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[12]] = lIIlllllIIIIIIll("8I8ZXlby938=", "wtGmV");
        CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[14]] = lIIlllllIIIIIIll("C45SjlMh0Cw=", "WaXiF");
        CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[3]] = lIIlllllIIIIIIll("uFDU4JDRfjfravigo/WkBw==", "HVxIc");
        CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[9]] = lIIlllllIIIIIIll("irLFUWhSB9a9xsDvXvCJ/cbctOU02O7V", "uXqPq");
        CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[8]] = lIIlllllIIIIIIll("K5MXfe+l3oQ=", "WDLnW");
        CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[15]] = lIIlllllIIIIIlII("O0xfJBWsNUM=", "fORvl");
        CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[16]] = lIIlllllIIIIIlII("LoVrmfRQKeY=", "xddSo");
        CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[18]] = lIIlllllIIIIIlIl("AB0gBDUNFj5HNw8dIwx6BRMkBTEH", "crMiT");
        CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[17]] = lIIlllllIIIIIIll("vR9YL3NMesxGa2Ai9vYS1X+S9hH62Fih", "nPyrK");
        CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[19]] = lIIlllllIIIIIlIl("JwIENAsqCRp3CSgCBzxEKxgdFgwTAhs1Dg==", "DmiYj");
        CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[20]] = lIIlllllIIIIIlII("rfF1fdAj894HAw1UJoiqCNUrlvb9fQhdG8bp7rz7EjE=", "BBelk");
        CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[21]] = lIIlllllIIIIIlII("+Z9tKJrdluc=", "aELOV");
        CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[22]] = lIIlllllIIIIIlIl("PSkQPjQ0", "PHcUQ");
        CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[23]] = lIIlllllIIIIIlIl("LCQ4GhE4KDA=", "JMTnt");
        CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[24]] = lIIlllllIIIIIlIl("FiwhFCAU", "xCSyA");
        CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[25]] = lIIlllllIIIIIlIl("ACQxDRY=", "fKCns");
        CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[26]] = lIIlllllIIIIIIll("focQFIh1TWA=", "sQYWL");
        CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[27]] = lIIlllllIIIIIlIl("NQggLikhBCg=", "SaLZL");
    }
    
    private static boolean lIIlllllIIIlIllI(final Object llllllllllllIlIllllIlllllIIIIlIl, final Object llllllllllllIlIllllIlllllIIIIlII) {
        return llllllllllllIlIllllIlllllIIIIlIl == llllllllllllIlIllllIlllllIIIIlII;
    }
    
    private static String lIIlllllIIIIIlIl(String llllllllllllIlIllllIlllllIllIlll, final String llllllllllllIlIllllIlllllIlllIll) {
        llllllllllllIlIllllIlllllIllIlll = new String(Base64.getDecoder().decode(llllllllllllIlIllllIlllllIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllllIlllllIlllIlI = new StringBuilder();
        final char[] llllllllllllIlIllllIlllllIlllIIl = llllllllllllIlIllllIlllllIlllIll.toCharArray();
        int llllllllllllIlIllllIlllllIlllIII = CommandClone.lllIIlIIIllllI[0];
        final short llllllllllllIlIllllIlllllIllIIlI = (Object)llllllllllllIlIllllIlllllIllIlll.toCharArray();
        final int llllllllllllIlIllllIlllllIllIIIl = llllllllllllIlIllllIlllllIllIIlI.length;
        char llllllllllllIlIllllIlllllIllIIII = (char)CommandClone.lllIIlIIIllllI[0];
        while (lIIlllllIIIIlllI(llllllllllllIlIllllIlllllIllIIII, llllllllllllIlIllllIlllllIllIIIl)) {
            final char llllllllllllIlIllllIlllllIllllIl = llllllllllllIlIllllIlllllIllIIlI[llllllllllllIlIllllIlllllIllIIII];
            llllllllllllIlIllllIlllllIlllIlI.append((char)(llllllllllllIlIllllIlllllIllllIl ^ llllllllllllIlIllllIlllllIlllIIl[llllllllllllIlIllllIlllllIlllIII % llllllllllllIlIllllIlllllIlllIIl.length]));
            "".length();
            ++llllllllllllIlIllllIlllllIlllIII;
            ++llllllllllllIlIllllIlllllIllIIII;
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllllIlllllIlllIlI);
    }
    
    private static boolean lIIlllllIIIIllll(final int llllllllllllIlIllllIlllllIIIllll, final int llllllllllllIlIllllIlllllIIIlllI) {
        return llllllllllllIlIllllIlllllIIIllll > llllllllllllIlIllllIlllllIIIlllI;
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandClone.lllIIlIIIllllI[1];
    }
    
    private static boolean lIIlllllIIIlIlIl(final Object llllllllllllIlIllllIlllllIIIlIII) {
        return llllllllllllIlIllllIlllllIIIlIII != null;
    }
    
    private static boolean lIIlllllIIIlIIlI(final int llllllllllllIlIllllIlllllIIIIIlI) {
        return llllllllllllIlIllllIlllllIIIIIlI != 0;
    }
    
    private static String lIIlllllIIIIIIll(final String llllllllllllIlIllllIllllllIIlIlI, final String llllllllllllIlIllllIllllllIIlIIl) {
        try {
            final SecretKeySpec llllllllllllIlIllllIllllllIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIllllllIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllllIllllllIIlllI = Cipher.getInstance("Blowfish");
            llllllllllllIlIllllIllllllIIlllI.init(CommandClone.lllIIlIIIllllI[1], llllllllllllIlIllllIllllllIIllll);
            return new String(llllllllllllIlIllllIllllllIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIllllllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIllllllIIllIl) {
            llllllllllllIlIllllIllllllIIllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlllllIIIlIlII(final Object llllllllllllIlIllllIlllllIIIlIll, final Object llllllllllllIlIllllIlllllIIIlIlI) {
        return llllllllllllIlIllllIlllllIIIlIll != llllllllllllIlIllllIlllllIIIlIlI;
    }
    
    private static String lIIlllllIIIIIlII(final String llllllllllllIlIllllIlllllIlIIlll, final String llllllllllllIlIllllIlllllIlIIlII) {
        try {
            final SecretKeySpec llllllllllllIlIllllIlllllIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIlllllIlIIlII.getBytes(StandardCharsets.UTF_8)), CommandClone.lllIIlIIIllllI[14]), "DES");
            final Cipher llllllllllllIlIllllIlllllIlIlIIl = Cipher.getInstance("DES");
            llllllllllllIlIllllIlllllIlIlIIl.init(CommandClone.lllIIlIIIllllI[1], llllllllllllIlIllllIlllllIlIlIlI);
            return new String(llllllllllllIlIllllIlllllIlIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIlllllIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIlllllIlIlIII) {
            llllllllllllIlIllllIlllllIlIlIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlllllIIIllIII(final int llllllllllllIlIllllIllllIlllllII) {
        return llllllllllllIlIllllIllllIlllllII <= 0;
    }
    
    private static boolean lIIlllllIIIlIIIl(final int llllllllllllIlIllllIlllllIIIIIII) {
        return llllllllllllIlIllllIlllllIIIIIII == 0;
    }
    
    private static boolean lIIlllllIIIlIIll(final int llllllllllllIlIllllIllllIllllllI) {
        return llllllllllllIlIllllIllllIllllllI >= 0;
    }
    
    private static boolean lIIlllllIIIllIlI(final int llllllllllllIlIllllIlllllIIlIIll, final int llllllllllllIlIllllIlllllIIlIIlI) {
        return llllllllllllIlIllllIlllllIIlIIll <= llllllllllllIlIllllIlllllIIlIIlI;
    }
    
    @Override
    public String getCommandName() {
        return CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[0]];
    }
    
    @Override
    public String getCommandUsage(final ICommandSender llllllllllllIlIlllllIIIIIIlllIll) {
        return CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[2]];
    }
    
    private static boolean lIIlllllIIIlIlll(final int llllllllllllIlIllllIlllllIIlllll, final int llllllllllllIlIllllIlllllIIllllI) {
        return llllllllllllIlIllllIlllllIIlllll == llllllllllllIlIllllIlllllIIllllI;
    }
    
    static {
        lIIlllllIIIIllIl();
        lIIlllllIIIIIllI();
    }
    
    @Override
    public void processCommand(final ICommandSender llllllllllllIlIllllIllllllllIlIl, final String[] llllllllllllIlIllllIllllllllIlII) throws CommandException {
        if (lIIlllllIIIIlllI(llllllllllllIlIllllIllllllllIlII.length, CommandClone.lllIIlIIIllllI[3])) {
            throw new WrongUsageException(CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[1]], new Object[CommandClone.lllIIlIIIllllI[0]]);
        }
        llllllllllllIlIllllIllllllllIlIl.setCommandStat(CommandResultStats.Type.AFFECTED_BLOCKS, CommandClone.lllIIlIIIllllI[0]);
        final BlockPos llllllllllllIlIlllllIIIIIIIlllII = CommandBase.parseBlockPos(llllllllllllIlIllllIllllllllIlIl, llllllllllllIlIllllIllllllllIlII, CommandClone.lllIIlIIIllllI[0], (boolean)(CommandClone.lllIIlIIIllllI[0] != 0));
        final BlockPos llllllllllllIlIlllllIIIIIIIllIll = CommandBase.parseBlockPos(llllllllllllIlIllllIllllllllIlIl, llllllllllllIlIllllIllllllllIlII, CommandClone.lllIIlIIIllllI[4], (boolean)(CommandClone.lllIIlIIIllllI[0] != 0));
        final BlockPos llllllllllllIlIlllllIIIIIIIllIlI = CommandBase.parseBlockPos(llllllllllllIlIllllIllllllllIlIl, llllllllllllIlIllllIllllllllIlII, CommandClone.lllIIlIIIllllI[5], (boolean)(CommandClone.lllIIlIIIllllI[0] != 0));
        final StructureBoundingBox llllllllllllIlIlllllIIIIIIIllIIl = new StructureBoundingBox(llllllllllllIlIlllllIIIIIIIlllII, llllllllllllIlIlllllIIIIIIIllIll);
        final StructureBoundingBox llllllllllllIlIlllllIIIIIIIllIII = new StructureBoundingBox(llllllllllllIlIlllllIIIIIIIllIlI, llllllllllllIlIlllllIIIIIIIllIlI.add(llllllllllllIlIlllllIIIIIIIllIIl.func_175896_b()));
        int llllllllllllIlIlllllIIIIIIIlIlll = llllllllllllIlIlllllIIIIIIIllIIl.getXSize() * llllllllllllIlIlllllIIIIIIIllIIl.getYSize() * llllllllllllIlIlllllIIIIIIIllIIl.getZSize();
        if (lIIlllllIIIIllll(llllllllllllIlIlllllIIIIIIIlIlll, CommandClone.lllIIlIIIllllI[6])) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[4]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandClone.lllIIlIIIllllI[1]];
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandClone.lllIIlIIIllllI[0]] = llllllllllllIlIlllllIIIIIIIlIlll;
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandClone.lllIIlIIIllllI[2]] = CommandClone.lllIIlIIIllllI[6];
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
        }
        boolean llllllllllllIlIlllllIIIIIIIlIllI = CommandClone.lllIIlIIIllllI[0] != 0;
        Block llllllllllllIlIlllllIIIIIIIlIlIl = null;
        int llllllllllllIlIlllllIIIIIIIlIlII = CommandClone.lllIIlIIIllllI[7];
        if ((!lIIlllllIIIlIIII(llllllllllllIlIllllIllllllllIlII.length, CommandClone.lllIIlIIIllllI[8]) || (lIIlllllIIIlIIIl(llllllllllllIlIllllIllllllllIlII[CommandClone.lllIIlIIIllllI[9]].equals(CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[10]]) ? 1 : 0) && lIIlllllIIIlIIIl(llllllllllllIlIllllIllllllllIlII[CommandClone.lllIIlIIIllllI[9]].equals(CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[11]]) ? 1 : 0))) && lIIlllllIIIlIIlI(llllllllllllIlIlllllIIIIIIIllIIl.intersectsWith(llllllllllllIlIlllllIIIIIIIllIII) ? 1 : 0)) {
            throw new CommandException(CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[5]], new Object[CommandClone.lllIIlIIIllllI[0]]);
        }
        if (lIIlllllIIIlIIII(llllllllllllIlIllllIllllllllIlII.length, CommandClone.lllIIlIIIllllI[8]) && lIIlllllIIIlIIlI(llllllllllllIlIllllIllllllllIlII[CommandClone.lllIIlIIIllllI[9]].equals(CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[12]]) ? 1 : 0)) {
            llllllllllllIlIlllllIIIIIIIlIllI = (CommandClone.lllIIlIIIllllI[2] != 0);
        }
        if (!lIIlllllIIIlIIll(llllllllllllIlIlllllIIIIIIIllIIl.minY) || !lIIlllllIIIIlllI(llllllllllllIlIlllllIIIIIIIllIIl.maxY, CommandClone.lllIIlIIIllllI[13]) || !lIIlllllIIIlIIll(llllllllllllIlIlllllIIIIIIIllIII.minY) || !lIIlllllIIIIlllI(llllllllllllIlIlllllIIIIIIIllIII.maxY, CommandClone.lllIIlIIIllllI[13])) {
            throw new CommandException(CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[20]], new Object[CommandClone.lllIIlIIIllllI[0]]);
        }
        final World llllllllllllIlIlllllIIIIIIIlIIll = llllllllllllIlIllllIllllllllIlIl.getEntityWorld();
        if (!lIIlllllIIIlIIlI(llllllllllllIlIlllllIIIIIIIlIIll.isAreaLoaded(llllllllllllIlIlllllIIIIIIIllIIl) ? 1 : 0) || !lIIlllllIIIlIIlI(llllllllllllIlIlllllIIIIIIIlIIll.isAreaLoaded(llllllllllllIlIlllllIIIIIIIllIII) ? 1 : 0)) {
            throw new CommandException(CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[19]], new Object[CommandClone.lllIIlIIIllllI[0]]);
        }
        boolean llllllllllllIlIlllllIIIIIIIlIIlI = CommandClone.lllIIlIIIllllI[0] != 0;
        if (lIIlllllIIIlIIII(llllllllllllIlIllllIllllllllIlII.length, CommandClone.lllIIlIIIllllI[9])) {
            if (lIIlllllIIIlIIlI(llllllllllllIlIllllIllllllllIlII[CommandClone.lllIIlIIIllllI[3]].equals(CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[14]]) ? 1 : 0)) {
                llllllllllllIlIlllllIIIIIIIlIIlI = (CommandClone.lllIIlIIIllllI[2] != 0);
                "".length();
                if (-" ".length() == (0xA5 ^ 0xA1)) {
                    return;
                }
            }
            else if (lIIlllllIIIlIIlI(llllllllllllIlIllllIllllllllIlII[CommandClone.lllIIlIIIllllI[3]].equals(CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[3]]) ? 1 : 0)) {
                if (lIIlllllIIIIlllI(llllllllllllIlIllllIllllllllIlII.length, CommandClone.lllIIlIIIllllI[15])) {
                    throw new WrongUsageException(CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[9]], new Object[CommandClone.lllIIlIIIllllI[0]]);
                }
                llllllllllllIlIlllllIIIIIIIlIlIl = CommandBase.getBlockByText(llllllllllllIlIllllIllllllllIlIl, llllllllllllIlIllllIllllllllIlII[CommandClone.lllIIlIIIllllI[8]]);
                if (lIIlllllIIIlIIII(llllllllllllIlIllllIllllllllIlII.length, CommandClone.lllIIlIIIllllI[16])) {
                    llllllllllllIlIlllllIIIIIIIlIlII = CommandBase.parseInt(llllllllllllIlIllllIllllllllIlII[CommandClone.lllIIlIIIllllI[15]], CommandClone.lllIIlIIIllllI[0], CommandClone.lllIIlIIIllllI[17]);
                }
            }
        }
        final List<StaticCloneData> llllllllllllIlIlllllIIIIIIIlIIIl = (List<StaticCloneData>)Lists.newArrayList();
        final List<StaticCloneData> llllllllllllIlIlllllIIIIIIIlIIII = (List<StaticCloneData>)Lists.newArrayList();
        final List<StaticCloneData> llllllllllllIlIlllllIIIIIIIIllll = (List<StaticCloneData>)Lists.newArrayList();
        final LinkedList<BlockPos> llllllllllllIlIlllllIIIIIIIIlllI = (LinkedList<BlockPos>)Lists.newLinkedList();
        final BlockPos llllllllllllIlIlllllIIIIIIIIllIl = new BlockPos(llllllllllllIlIlllllIIIIIIIllIII.minX - llllllllllllIlIlllllIIIIIIIllIIl.minX, llllllllllllIlIlllllIIIIIIIllIII.minY - llllllllllllIlIlllllIIIIIIIllIIl.minY, llllllllllllIlIlllllIIIIIIIllIII.minZ - llllllllllllIlIlllllIIIIIIIllIIl.minZ);
        int llllllllllllIlIlllllIIIIIIIIllII = llllllllllllIlIlllllIIIIIIIllIIl.minZ;
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIlllllIIIIllll(llllllllllllIlIlllllIIIIIIIIllII, llllllllllllIlIlllllIIIIIIIllIIl.maxZ)) {
            int llllllllllllIlIlllllIIIIIIIIlIll = llllllllllllIlIlllllIIIIIIIllIIl.minY;
            "".length();
            if ("   ".length() < 0) {
                return;
            }
            while (!lIIlllllIIIIllll(llllllllllllIlIlllllIIIIIIIIlIll, llllllllllllIlIlllllIIIIIIIllIIl.maxY)) {
                int llllllllllllIlIlllllIIIIIIIIlIlI = llllllllllllIlIlllllIIIIIIIllIIl.minX;
                "".length();
                if (null != null) {
                    return;
                }
                while (!lIIlllllIIIIllll(llllllllllllIlIlllllIIIIIIIIlIlI, llllllllllllIlIlllllIIIIIIIllIIl.maxX)) {
                    final BlockPos llllllllllllIlIlllllIIIIIIIIlIIl = new BlockPos(llllllllllllIlIlllllIIIIIIIIlIlI, llllllllllllIlIlllllIIIIIIIIlIll, llllllllllllIlIlllllIIIIIIIIllII);
                    final BlockPos llllllllllllIlIlllllIIIIIIIIlIII = llllllllllllIlIlllllIIIIIIIIlIIl.add(llllllllllllIlIlllllIIIIIIIIllIl);
                    final IBlockState llllllllllllIlIlllllIIIIIIIIIlll = llllllllllllIlIlllllIIIIIIIlIIll.getBlockState(llllllllllllIlIlllllIIIIIIIIlIIl);
                    if ((!lIIlllllIIIlIIlI(llllllllllllIlIlllllIIIIIIIlIIlI ? 1 : 0) || lIIlllllIIIlIlII(llllllllllllIlIlllllIIIIIIIIIlll.getBlock(), Blocks.air)) && (!lIIlllllIIIlIlIl(llllllllllllIlIlllllIIIIIIIlIlIl) || (lIIlllllIIIlIllI(llllllllllllIlIlllllIIIIIIIIIlll.getBlock(), llllllllllllIlIlllllIIIIIIIlIlIl) && (!lIIlllllIIIlIIll(llllllllllllIlIlllllIIIIIIIlIlII) || lIIlllllIIIlIlll(llllllllllllIlIlllllIIIIIIIIIlll.getBlock().getMetaFromState(llllllllllllIlIlllllIIIIIIIIIlll), llllllllllllIlIlllllIIIIIIIlIlII))))) {
                        final TileEntity llllllllllllIlIlllllIIIIIIIIIllI = llllllllllllIlIlllllIIIIIIIlIIll.getTileEntity(llllllllllllIlIlllllIIIIIIIIlIIl);
                        if (lIIlllllIIIlIlIl(llllllllllllIlIlllllIIIIIIIIIllI)) {
                            final NBTTagCompound llllllllllllIlIlllllIIIIIIIIIlIl = new NBTTagCompound();
                            llllllllllllIlIlllllIIIIIIIIIllI.writeToNBT(llllllllllllIlIlllllIIIIIIIIIlIl);
                            llllllllllllIlIlllllIIIIIIIlIIII.add(new StaticCloneData(llllllllllllIlIlllllIIIIIIIIlIII, llllllllllllIlIlllllIIIIIIIIIlll, llllllllllllIlIlllllIIIIIIIIIlIl));
                            "".length();
                            llllllllllllIlIlllllIIIIIIIIlllI.addLast(llllllllllllIlIlllllIIIIIIIIlIIl);
                            "".length();
                            if ((0x75 ^ 0x71) == 0x0) {
                                return;
                            }
                        }
                        else if (lIIlllllIIIlIIIl(llllllllllllIlIlllllIIIIIIIIIlll.getBlock().isFullBlock() ? 1 : 0) && lIIlllllIIIlIIIl(llllllllllllIlIlllllIIIIIIIIIlll.getBlock().isFullCube() ? 1 : 0)) {
                            llllllllllllIlIlllllIIIIIIIIllll.add(new StaticCloneData(llllllllllllIlIlllllIIIIIIIIlIII, llllllllllllIlIlllllIIIIIIIIIlll, null));
                            "".length();
                            llllllllllllIlIlllllIIIIIIIIlllI.addFirst(llllllllllllIlIlllllIIIIIIIIlIIl);
                            "".length();
                            if (null != null) {
                                return;
                            }
                        }
                        else {
                            llllllllllllIlIlllllIIIIIIIlIIIl.add(new StaticCloneData(llllllllllllIlIlllllIIIIIIIIlIII, llllllllllllIlIlllllIIIIIIIIIlll, null));
                            "".length();
                            llllllllllllIlIlllllIIIIIIIIlllI.addLast(llllllllllllIlIlllllIIIIIIIIlIIl);
                        }
                    }
                    ++llllllllllllIlIlllllIIIIIIIIlIlI;
                }
                ++llllllllllllIlIlllllIIIIIIIIlIll;
            }
            ++llllllllllllIlIlllllIIIIIIIIllII;
        }
        if (lIIlllllIIIlIIlI(llllllllllllIlIlllllIIIIIIIlIllI ? 1 : 0)) {
            final Iterator<Object> iterator = llllllllllllIlIlllllIIIIIIIIlllI.iterator();
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIlllllIIIlIIIl(iterator.hasNext() ? 1 : 0)) {
                final BlockPos llllllllllllIlIlllllIIIIIIIIIlII = iterator.next();
                final TileEntity llllllllllllIlIlllllIIIIIIIIIIll = llllllllllllIlIlllllIIIIIIIlIIll.getTileEntity(llllllllllllIlIlllllIIIIIIIIIlII);
                if (lIIlllllIIIlIIlI((llllllllllllIlIlllllIIIIIIIIIIll instanceof IInventory) ? 1 : 0)) {
                    ((IInventory)llllllllllllIlIlllllIIIIIIIIIIll).clear();
                }
                llllllllllllIlIlllllIIIIIIIlIIll.setBlockState(llllllllllllIlIlllllIIIIIIIIIlII, Blocks.barrier.getDefaultState(), CommandClone.lllIIlIIIllllI[1]);
                "".length();
            }
            final Iterator<Object> iterator2 = llllllllllllIlIlllllIIIIIIIIlllI.iterator();
            "".length();
            if (((89 + 2 + 21 + 39 ^ 117 + 2 - 46 + 117) & (0x54 ^ 0x5A ^ (0xA ^ 0x2D) ^ -" ".length())) <= -" ".length()) {
                return;
            }
            while (!lIIlllllIIIlIIIl(iterator2.hasNext() ? 1 : 0)) {
                final BlockPos llllllllllllIlIlllllIIIIIIIIIIlI = iterator2.next();
                llllllllllllIlIlllllIIIIIIIlIIll.setBlockState(llllllllllllIlIlllllIIIIIIIIIIlI, Blocks.air.getDefaultState(), CommandClone.lllIIlIIIllllI[4]);
                "".length();
            }
        }
        final List<StaticCloneData> llllllllllllIlIlllllIIIIIIIIIIIl = (List<StaticCloneData>)Lists.newArrayList();
        llllllllllllIlIlllllIIIIIIIIIIIl.addAll(llllllllllllIlIlllllIIIIIIIlIIIl);
        "".length();
        llllllllllllIlIlllllIIIIIIIIIIIl.addAll(llllllllllllIlIlllllIIIIIIIlIIII);
        "".length();
        llllllllllllIlIlllllIIIIIIIIIIIl.addAll(llllllllllllIlIlllllIIIIIIIIllll);
        "".length();
        final List<StaticCloneData> llllllllllllIlIlllllIIIIIIIIIIII = (List<StaticCloneData>)Lists.reverse((List)llllllllllllIlIlllllIIIIIIIIIIIl);
        final Iterator<StaticCloneData> iterator3 = llllllllllllIlIlllllIIIIIIIIIIII.iterator();
        "".length();
        if ("  ".length() < ((0x54 ^ 0x72 ^ (0x1E ^ 0x26)) & (26 + 110 + 82 + 5 ^ 136 + 48 - 6 + 15 ^ -" ".length()))) {
            return;
        }
        while (!lIIlllllIIIlIIIl(iterator3.hasNext() ? 1 : 0)) {
            final StaticCloneData llllllllllllIlIllllIllllllllllll = iterator3.next();
            final TileEntity llllllllllllIlIllllIlllllllllllI = llllllllllllIlIlllllIIIIIIIlIIll.getTileEntity(llllllllllllIlIllllIllllllllllll.field_179537_a);
            if (lIIlllllIIIlIIlI((llllllllllllIlIllllIlllllllllllI instanceof IInventory) ? 1 : 0)) {
                ((IInventory)llllllllllllIlIllllIlllllllllllI).clear();
            }
            llllllllllllIlIlllllIIIIIIIlIIll.setBlockState(llllllllllllIlIllllIllllllllllll.field_179537_a, Blocks.barrier.getDefaultState(), CommandClone.lllIIlIIIllllI[1]);
            "".length();
        }
        llllllllllllIlIlllllIIIIIIIlIlll = CommandClone.lllIIlIIIllllI[0];
        final Iterator<StaticCloneData> iterator4 = llllllllllllIlIlllllIIIIIIIIIIIl.iterator();
        "".length();
        if ((0x4A ^ 0x4E) == "   ".length()) {
            return;
        }
        while (!lIIlllllIIIlIIIl(iterator4.hasNext() ? 1 : 0)) {
            final StaticCloneData llllllllllllIlIllllIllllllllllIl = iterator4.next();
            if (lIIlllllIIIlIIlI(llllllllllllIlIlllllIIIIIIIlIIll.setBlockState(llllllllllllIlIllllIllllllllllIl.field_179537_a, llllllllllllIlIllllIllllllllllIl.blockState, CommandClone.lllIIlIIIllllI[1]) ? 1 : 0)) {
                ++llllllllllllIlIlllllIIIIIIIlIlll;
            }
        }
        final Iterator<StaticCloneData> iterator5 = llllllllllllIlIlllllIIIIIIIlIIII.iterator();
        "".length();
        if ("  ".length() == "   ".length()) {
            return;
        }
        while (!lIIlllllIIIlIIIl(iterator5.hasNext() ? 1 : 0)) {
            final StaticCloneData llllllllllllIlIllllIllllllllllII = iterator5.next();
            final TileEntity llllllllllllIlIllllIlllllllllIll = llllllllllllIlIlllllIIIIIIIlIIll.getTileEntity(llllllllllllIlIllllIllllllllllII.field_179537_a);
            if (lIIlllllIIIlIlIl(llllllllllllIlIllllIllllllllllII.field_179536_c) && lIIlllllIIIlIlIl(llllllllllllIlIllllIlllllllllIll)) {
                llllllllllllIlIllllIllllllllllII.field_179536_c.setInteger(CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[8]], llllllllllllIlIllllIllllllllllII.field_179537_a.getX());
                llllllllllllIlIllllIllllllllllII.field_179536_c.setInteger(CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[15]], llllllllllllIlIllllIllllllllllII.field_179537_a.getY());
                llllllllllllIlIllllIllllllllllII.field_179536_c.setInteger(CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[16]], llllllllllllIlIllllIllllllllllII.field_179537_a.getZ());
                llllllllllllIlIllllIlllllllllIll.readFromNBT(llllllllllllIlIllllIllllllllllII.field_179536_c);
                llllllllllllIlIllllIlllllllllIll.markDirty();
            }
            llllllllllllIlIlllllIIIIIIIlIIll.setBlockState(llllllllllllIlIllllIllllllllllII.field_179537_a, llllllllllllIlIllllIllllllllllII.blockState, CommandClone.lllIIlIIIllllI[1]);
            "".length();
        }
        final Iterator<StaticCloneData> iterator6 = llllllllllllIlIlllllIIIIIIIIIIII.iterator();
        "".length();
        if (-(0xC3 ^ 0xC7) >= 0) {
            return;
        }
        while (!lIIlllllIIIlIIIl(iterator6.hasNext() ? 1 : 0)) {
            final StaticCloneData llllllllllllIlIllllIlllllllllIlI = iterator6.next();
            llllllllllllIlIlllllIIIIIIIlIIll.notifyNeighborsRespectDebug(llllllllllllIlIllllIlllllllllIlI.field_179537_a, llllllllllllIlIllllIlllllllllIlI.blockState.getBlock());
        }
        final List<NextTickListEntry> llllllllllllIlIllllIlllllllllIIl = llllllllllllIlIlllllIIIIIIIlIIll.func_175712_a(llllllllllllIlIlllllIIIIIIIllIIl, (boolean)(CommandClone.lllIIlIIIllllI[0] != 0));
        if (lIIlllllIIIlIlIl(llllllllllllIlIllllIlllllllllIIl)) {
            final Iterator<NextTickListEntry> iterator7 = llllllllllllIlIllllIlllllllllIIl.iterator();
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
            while (!lIIlllllIIIlIIIl(iterator7.hasNext() ? 1 : 0)) {
                final NextTickListEntry llllllllllllIlIllllIlllllllllIII = iterator7.next();
                if (lIIlllllIIIlIIlI(llllllllllllIlIlllllIIIIIIIllIIl.isVecInside(llllllllllllIlIllllIlllllllllIII.position) ? 1 : 0)) {
                    final BlockPos llllllllllllIlIllllIllllllllIlll = llllllllllllIlIllllIlllllllllIII.position.add(llllllllllllIlIlllllIIIIIIIIllIl);
                    llllllllllllIlIlllllIIIIIIIlIIll.scheduleBlockUpdate(llllllllllllIlIllllIllllllllIlll, llllllllllllIlIllllIlllllllllIII.getBlock(), (int)(llllllllllllIlIllllIlllllllllIII.scheduledTime - llllllllllllIlIlllllIIIIIIIlIIll.getWorldInfo().getWorldTotalTime()), llllllllllllIlIllllIlllllllllIII.priority);
                }
            }
        }
        if (lIIlllllIIIllIII(llllllllllllIlIlllllIIIIIIIlIlll)) {
            throw new CommandException(CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[18]], new Object[CommandClone.lllIIlIIIllllI[0]]);
        }
        llllllllllllIlIllllIllllllllIlIl.setCommandStat(CommandResultStats.Type.AFFECTED_BLOCKS, llllllllllllIlIlllllIIIIIIIlIlll);
        final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandClone.lllIIlIIIlllII[CommandClone.lllIIlIIIllllI[17]];
        final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandClone.lllIIlIIIllllI[2]];
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandClone.lllIIlIIIllllI[0]] = llllllllllllIlIlllllIIIIIIIlIlll;
        CommandBase.notifyOperators(llllllllllllIlIllllIllllllllIlIl, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
        "".length();
        if ("   ".length() < 0) {
            return;
        }
    }
    
    private static void lIIlllllIIIIllIl() {
        (lllIIlIIIllllI = new int[29])[0] = ((43 + 172 - 100 + 93 ^ 103 + 139 - 125 + 25) & (0x38 ^ 0x7D ^ (0x61 ^ 0x7A) ^ -" ".length()));
        CommandClone.lllIIlIIIllllI[1] = "  ".length();
        CommandClone.lllIIlIIIllllI[2] = " ".length();
        CommandClone.lllIIlIIIllllI[3] = (0x27 ^ 0x2E);
        CommandClone.lllIIlIIIllllI[4] = "   ".length();
        CommandClone.lllIIlIIIllllI[5] = (0x78 ^ 0x42 ^ (0x87 ^ 0xBB));
        CommandClone.lllIIlIIIllllI[6] = (0xFFFFD928 & 0xA6D7);
        CommandClone.lllIIlIIIllllI[7] = -" ".length();
        CommandClone.lllIIlIIIllllI[8] = (0x84 ^ 0xB1 ^ (0xA0 ^ 0x9E));
        CommandClone.lllIIlIIIllllI[9] = (0xA9 ^ 0xA3);
        CommandClone.lllIIlIIIllllI[10] = (125 + 84 - 146 + 78 ^ 120 + 8 - 89 + 98);
        CommandClone.lllIIlIIIllllI[11] = (0x2D ^ 0x28);
        CommandClone.lllIIlIIIllllI[12] = ("   ".length() ^ (0xA0 ^ 0xA4));
        CommandClone.lllIIlIIIllllI[13] = (0xFFFFC13C & 0x3FC3);
        CommandClone.lllIIlIIIllllI[14] = (171 + 75 - 108 + 68 ^ 184 + 195 - 321 + 140);
        CommandClone.lllIIlIIIllllI[15] = (0x2C ^ 0x20);
        CommandClone.lllIIlIIIllllI[16] = (0x9 ^ 0x47 ^ (0x35 ^ 0x76));
        CommandClone.lllIIlIIIllllI[17] = (0x41 ^ 0x4E);
        CommandClone.lllIIlIIIllllI[18] = (0xCC ^ 0xC2);
        CommandClone.lllIIlIIIllllI[19] = (0x9C ^ 0x8C);
        CommandClone.lllIIlIIIllllI[20] = (0xB ^ 0x1A);
        CommandClone.lllIIlIIIllllI[21] = (0x9D ^ 0x8F);
        CommandClone.lllIIlIIIllllI[22] = (0x2C ^ 0x18 ^ (0x5B ^ 0x7C));
        CommandClone.lllIIlIIIllllI[23] = (0x4 ^ 0x10);
        CommandClone.lllIIlIIIllllI[24] = (127 + 143 - 218 + 129 ^ 6 + 6 - 2 + 150);
        CommandClone.lllIIlIIIllllI[25] = (0x65 ^ 0x45 ^ (0xB2 ^ 0x84));
        CommandClone.lllIIlIIIllllI[26] = (0xD0 ^ 0xC7);
        CommandClone.lllIIlIIIllllI[27] = (0x7B ^ 0x63);
        CommandClone.lllIIlIIIllllI[28] = (0x14 ^ 0xD);
    }
    
    static class StaticCloneData
    {
        public final /* synthetic */ IBlockState blockState;
        public final /* synthetic */ BlockPos field_179537_a;
        public final /* synthetic */ NBTTagCompound field_179536_c;
        
        public StaticCloneData(final BlockPos lllllllllllllIlIIIIlIIllIlllIIll, final IBlockState lllllllllllllIlIIIIlIIllIlllIllI, final NBTTagCompound lllllllllllllIlIIIIlIIllIlllIlIl) {
            this.field_179537_a = lllllllllllllIlIIIIlIIllIlllIIll;
            this.blockState = lllllllllllllIlIIIIlIIllIlllIllI;
            this.field_179536_c = lllllllllllllIlIIIIlIIllIlllIlIl;
        }
    }
}
