// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.util.List;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.World;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3i;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class CommandCompare extends CommandBase
{
    private static final /* synthetic */ String[] llIlllllIIIlIl;
    private static final /* synthetic */ int[] llIlllllIIIllI;
    
    private static boolean lIIllIllIIIIllIl(final int llllllllllllIllIIIllIIIlIlIlllII, final int llllllllllllIllIIIllIIIlIlIllIll) {
        return llllllllllllIllIIIllIIIlIlIlllII <= llllllllllllIllIIIllIIIlIlIllIll;
    }
    
    private static String lIIllIlIlllllIII(final String llllllllllllIllIIIllIIIlIlllIlll, final String llllllllllllIllIIIllIIIlIlllIllI) {
        try {
            final SecretKeySpec llllllllllllIllIIIllIIIlIlllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllIIIlIlllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIllIIIlIllllIll = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIllIIIlIllllIll.init(CommandCompare.llIlllllIIIllI[1], llllllllllllIllIIIllIIIlIlllllII);
            return new String(llllllllllllIllIIIllIIIlIllllIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllIIIlIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIllIIIlIllllIlI) {
            llllllllllllIllIIIllIIIlIllllIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllIllIIIIIlIl(final int llllllllllllIllIIIllIIIlIlIllIII, final int llllllllllllIllIIIllIIIlIlIlIlll) {
        return llllllllllllIllIIIllIIIlIlIllIII > llllllllllllIllIIIllIIIlIlIlIlll;
    }
    
    private static String lIIllIlIlllllIIl(String llllllllllllIllIIIllIIIllIIIlIIl, final String llllllllllllIllIIIllIIIllIIIlIII) {
        llllllllllllIllIIIllIIIllIIIlIIl = new String(Base64.getDecoder().decode(llllllllllllIllIIIllIIIllIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIllIIIllIIIllII = new StringBuilder();
        final char[] llllllllllllIllIIIllIIIllIIIlIll = llllllllllllIllIIIllIIIllIIIlIII.toCharArray();
        int llllllllllllIllIIIllIIIllIIIlIlI = CommandCompare.llIlllllIIIllI[0];
        final short llllllllllllIllIIIllIIIllIIIIlII = (Object)llllllllllllIllIIIllIIIllIIIlIIl.toCharArray();
        final long llllllllllllIllIIIllIIIllIIIIIll = llllllllllllIllIIIllIIIllIIIIlII.length;
        char llllllllllllIllIIIllIIIllIIIIIlI = (char)CommandCompare.llIlllllIIIllI[0];
        while (lIIllIllIIIIIlII(llllllllllllIllIIIllIIIllIIIIIlI, (int)llllllllllllIllIIIllIIIllIIIIIll)) {
            final char llllllllllllIllIIIllIIIllIIIllll = llllllllllllIllIIIllIIIllIIIIlII[llllllllllllIllIIIllIIIllIIIIIlI];
            llllllllllllIllIIIllIIIllIIIllII.append((char)(llllllllllllIllIIIllIIIllIIIllll ^ llllllllllllIllIIIllIIIllIIIlIll[llllllllllllIllIIIllIIIllIIIlIlI % llllllllllllIllIIIllIIIllIIIlIll.length]));
            "".length();
            ++llllllllllllIllIIIllIIIllIIIlIlI;
            ++llllllllllllIllIIIllIIIllIIIIIlI;
            "".length();
            if (((0x7C ^ 0x6D ^ (0x34 ^ 0x19)) & (62 + 185 - 13 + 20 ^ 77 + 61 - 12 + 68 ^ -" ".length())) != ((0x1F ^ 0x4D ^ (0x3C ^ 0x67)) & (59 + 75 - 46 + 48 ^ 16 + 18 + 30 + 65 ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIllIIIllIIIllII);
    }
    
    private static boolean lIIllIllIIIIIlII(final int llllllllllllIllIIIllIIIlIllIIIII, final int llllllllllllIllIIIllIIIlIlIlllll) {
        return llllllllllllIllIIIllIIIlIllIIIII < llllllllllllIllIIIllIIIlIlIlllll;
    }
    
    @Override
    public String getCommandUsage(final ICommandSender llllllllllllIllIIIllIIIllllIIllI) {
        return CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[2]];
    }
    
    private static void lIIllIllIIIIIIll() {
        (llIlllllIIIllI = new int[20])[0] = ((0xB0 ^ 0x9B) & ~(0xAF ^ 0x84));
        CommandCompare.llIlllllIIIllI[1] = "  ".length();
        CommandCompare.llIlllllIIIllI[2] = " ".length();
        CommandCompare.llIlllllIIIllI[3] = (29 + 95 - 20 + 45 ^ 101 + 84 - 85 + 56);
        CommandCompare.llIlllllIIIllI[4] = "   ".length();
        CommandCompare.llIlllllIIIllI[5] = (0x72 ^ 0x74);
        CommandCompare.llIlllllIIIllI[6] = (0xFFFFBBFA & 0x84405);
        CommandCompare.llIlllllIIIllI[7] = (0xFFFF8DA9 & 0x7356);
        CommandCompare.llIlllllIIIllI[8] = (0x4A ^ 0x4E);
        CommandCompare.llIlllllIIIllI[9] = (0x49 ^ 0x4C);
        CommandCompare.llIlllllIIIllI[10] = (0x57 ^ 0x50);
        CommandCompare.llIlllllIIIllI[11] = (67 + 80 - 101 + 157 ^ 129 + 69 - 154 + 151);
        CommandCompare.llIlllllIIIllI[12] = (0x65 ^ 0x6F);
        CommandCompare.llIlllllIIIllI[13] = (0xE2 ^ 0xC0 ^ (0x9A ^ 0xB3));
        CommandCompare.llIlllllIIIllI[14] = (0x3F ^ 0x33);
        CommandCompare.llIlllllIIIllI[15] = (9 + 87 - 46 + 106 ^ 100 + 48 - 82 + 79);
        CommandCompare.llIlllllIIIllI[16] = (0x1C ^ 0x24 ^ (0x96 ^ 0xA0));
        CommandCompare.llIlllllIIIllI[17] = (118 + 90 - 201 + 140 ^ 70 + 14 - 52 + 124);
        CommandCompare.llIlllllIIIllI[18] = (0x6B ^ 0x65 ^ (0x96 ^ 0x88));
        CommandCompare.llIlllllIIIllI[19] = (0x5F ^ 0x38 ^ (0xE3 ^ 0x95));
    }
    
    private static String lIIllIlIlllllIlI(final String llllllllllllIllIIIllIIIlIllIlIlI, final String llllllllllllIllIIIllIIIlIllIlIll) {
        try {
            final SecretKeySpec llllllllllllIllIIIllIIIlIllIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllIIIlIllIlIll.getBytes(StandardCharsets.UTF_8)), CommandCompare.llIlllllIIIllI[11]), "DES");
            final Cipher llllllllllllIllIIIllIIIlIllIlllI = Cipher.getInstance("DES");
            llllllllllllIllIIIllIIIlIllIlllI.init(CommandCompare.llIlllllIIIllI[1], llllllllllllIllIIIllIIIlIllIllll);
            return new String(llllllllllllIllIIIllIIIlIllIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllIIIlIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIllIIIlIllIllIl) {
            llllllllllllIllIIIllIIIlIllIllIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String getCommandName() {
        return CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[0]];
    }
    
    private static boolean lIIllIllIIIIlIlI(final Object llllllllllllIllIIIllIIIlIlIIllIl) {
        return llllllllllllIllIIIllIIIlIlIIllIl != null;
    }
    
    private static boolean lIIllIllIIIIIllI(final int llllllllllllIllIIIllIIIlIlIIIlll) {
        return llllllllllllIllIIIllIIIlIlIIIlll >= 0;
    }
    
    static {
        lIIllIllIIIIIIll();
        lIIllIlIlllllIll();
    }
    
    private static boolean lIIllIllIIIIIlll(final int llllllllllllIllIIIllIIIlIlIIlIll) {
        return llllllllllllIllIIIllIIIlIlIIlIll != 0;
    }
    
    private static boolean lIIllIllIIIIlIIl(final Object llllllllllllIllIIIllIIIlIlIlIIII, final Object llllllllllllIllIIIllIIIlIlIIllll) {
        return llllllllllllIllIIIllIIIlIlIlIIII == llllllllllllIllIIIllIIIlIlIIllll;
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandCompare.llIlllllIIIllI[1];
    }
    
    private static boolean lIIllIllIIIIlIll(final int llllllllllllIllIIIllIIIlIlIIlIIl) {
        return llllllllllllIllIIIllIIIlIlIIlIIl == 0;
    }
    
    private static void lIIllIlIlllllIll() {
        (llIlllllIIIlIl = new String[CommandCompare.llIlllllIIIllI[19]])[CommandCompare.llIlllllIIIllI[0]] = lIIllIlIlllllIII("3RxgGHMH6myzFtO1l0/ZlA==", "JGzWw");
        CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[2]] = lIIllIlIlllllIII("lseCxPJYvhro1EhCvVcQlADv7bJcKtSL", "UIfnZ");
        CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[1]] = lIIllIlIlllllIIl("KgYIIBUnDRZjFyYEFSwGLEcQPhUuDA==", "IieMt");
        CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[4]] = lIIllIlIlllllIIl("LCgiAiUhIzxBJyAqPw42Kmk7ACsCJiEWBiMoLAQ3", "OGOoD");
        CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[8]] = lIIllIlIlllllIlI("Cm1XX2wK1c0=", "rYrCS");
        CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[9]] = lIIllIlIlllllIII("eYXqPC8OeC0=", "iUVDC");
        CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[5]] = lIIllIlIlllllIII("NMzBQe7n31Y=", "KTLZy");
        CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[10]] = lIIllIlIlllllIlI("NZdrMfeCvjs=", "lyzhY");
        CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[11]] = lIIllIlIlllllIIl("Nw==", "OblTc");
        CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[3]] = lIIllIlIlllllIIl("Hg==", "gFaGn");
        CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[12]] = lIIllIlIlllllIII("Q5BR20/7m6w=", "nplfJ");
        CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[13]] = lIIllIlIlllllIII("vGT1kmQeYQFlNhclwxDuL+0rKAwPajdX", "KdfRu");
        CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[14]] = lIIllIlIlllllIII("M+itBLa/Hzp7sEqO16MyOAP7g1kMiFSO/6YO92URfA8=", "QweTK");
        CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[15]] = lIIllIlIlllllIlI("bvp5qIuGrNwJnP/POYV9+x2Z9oS0tW/oh4fW8vNGmzM=", "BXLvE");
        CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[16]] = lIIllIlIlllllIIl("AS06GwUMJiRYBw0vJxcWB2w4AxAtJAAZFg4m", "bBWvd");
        CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[17]] = lIIllIlIlllllIIl("OxE+PzYy", "VpMTS");
        CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[18]] = lIIllIlIlllllIlI("HlfL53ObFnw=", "JLjQl");
    }
    
    private static boolean lIIllIllIIIIlllI(final int llllllllllllIllIIIllIIIlIllIIlII, final int llllllllllllIllIIIllIIIlIllIIIll) {
        return llllllllllllIllIIIllIIIlIllIIlII == llllllllllllIllIIIllIIIlIllIIIll;
    }
    
    private static boolean lIIllIllIIIIlIII(final Object llllllllllllIllIIIllIIIlIlIlIlII, final Object llllllllllllIllIIIllIIIlIlIlIIll) {
        return llllllllllllIllIIIllIIIlIlIlIlII != llllllllllllIllIIIllIIIlIlIlIIll;
    }
    
    @Override
    public void processCommand(final ICommandSender llllllllllllIllIIIllIIIllIllIllI, final String[] llllllllllllIllIIIllIIIlllIIllII) throws CommandException {
        if (lIIllIllIIIIIlII(llllllllllllIllIIIllIIIlllIIllII.length, CommandCompare.llIlllllIIIllI[3])) {
            throw new WrongUsageException(CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[1]], new Object[CommandCompare.llIlllllIIIllI[0]]);
        }
        llllllllllllIllIIIllIIIllIllIllI.setCommandStat(CommandResultStats.Type.AFFECTED_BLOCKS, CommandCompare.llIlllllIIIllI[0]);
        final BlockPos llllllllllllIllIIIllIIIlllIIlIll = CommandBase.parseBlockPos(llllllllllllIllIIIllIIIllIllIllI, llllllllllllIllIIIllIIIlllIIllII, CommandCompare.llIlllllIIIllI[0], (boolean)(CommandCompare.llIlllllIIIllI[0] != 0));
        final BlockPos llllllllllllIllIIIllIIIlllIIlIlI = CommandBase.parseBlockPos(llllllllllllIllIIIllIIIllIllIllI, llllllllllllIllIIIllIIIlllIIllII, CommandCompare.llIlllllIIIllI[4], (boolean)(CommandCompare.llIlllllIIIllI[0] != 0));
        final BlockPos llllllllllllIllIIIllIIIlllIIlIIl = CommandBase.parseBlockPos(llllllllllllIllIIIllIIIllIllIllI, llllllllllllIllIIIllIIIlllIIllII, CommandCompare.llIlllllIIIllI[5], (boolean)(CommandCompare.llIlllllIIIllI[0] != 0));
        final StructureBoundingBox llllllllllllIllIIIllIIIlllIIlIII = new StructureBoundingBox(llllllllllllIllIIIllIIIlllIIlIll, llllllllllllIllIIIllIIIlllIIlIlI);
        final StructureBoundingBox llllllllllllIllIIIllIIIlllIIIlll = new StructureBoundingBox(llllllllllllIllIIIllIIIlllIIlIIl, llllllllllllIllIIIllIIIlllIIlIIl.add(llllllllllllIllIIIllIIIlllIIlIII.func_175896_b()));
        int llllllllllllIllIIIllIIIlllIIIllI = llllllllllllIllIIIllIIIlllIIlIII.getXSize() * llllllllllllIllIIIllIIIlllIIlIII.getYSize() * llllllllllllIllIIIllIIIlllIIlIII.getZSize();
        if (lIIllIllIIIIIlIl(llllllllllllIllIIIllIIIlllIIIllI, CommandCompare.llIlllllIIIllI[6])) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[4]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandCompare.llIlllllIIIllI[1]];
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandCompare.llIlllllIIIllI[0]] = llllllllllllIllIIIllIIIlllIIIllI;
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandCompare.llIlllllIIIllI[2]] = CommandCompare.llIlllllIIIllI[6];
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
        }
        if (!lIIllIllIIIIIllI(llllllllllllIllIIIllIIIlllIIlIII.minY) || !lIIllIllIIIIIlII(llllllllllllIllIIIllIIIlllIIlIII.maxY, CommandCompare.llIlllllIIIllI[7]) || !lIIllIllIIIIIllI(llllllllllllIllIIIllIIIlllIIIlll.minY) || !lIIllIllIIIIIlII(llllllllllllIllIIIllIIIlllIIIlll.maxY, CommandCompare.llIlllllIIIllI[7])) {
            throw new CommandException(CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[16]], new Object[CommandCompare.llIlllllIIIllI[0]]);
        }
        final World llllllllllllIllIIIllIIIlllIIIlIl = llllllllllllIllIIIllIIIllIllIllI.getEntityWorld();
        if (!lIIllIllIIIIIlll(llllllllllllIllIIIllIIIlllIIIlIl.isAreaLoaded(llllllllllllIllIIIllIIIlllIIlIII) ? 1 : 0) || !lIIllIllIIIIIlll(llllllllllllIllIIIllIIIlllIIIlIl.isAreaLoaded(llllllllllllIllIIIllIIIlllIIIlll) ? 1 : 0)) {
            throw new CommandException(CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[15]], new Object[CommandCompare.llIlllllIIIllI[0]]);
        }
        boolean llllllllllllIllIIIllIIIlllIIIlII = CommandCompare.llIlllllIIIllI[0] != 0;
        if (lIIllIllIIIIIlIl(llllllllllllIllIIIllIIIlllIIllII.length, CommandCompare.llIlllllIIIllI[3]) && lIIllIllIIIIIlll(llllllllllllIllIIIllIIIlllIIllII[CommandCompare.llIlllllIIIllI[3]].equals(CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[8]]) ? 1 : 0)) {
            llllllllllllIllIIIllIIIlllIIIlII = (CommandCompare.llIlllllIIIllI[2] != 0);
        }
        llllllllllllIllIIIllIIIlllIIIllI = CommandCompare.llIlllllIIIllI[0];
        final BlockPos llllllllllllIllIIIllIIIlllIIIIll = new BlockPos(llllllllllllIllIIIllIIIlllIIIlll.minX - llllllllllllIllIIIllIIIlllIIlIII.minX, llllllllllllIllIIIllIIIlllIIIlll.minY - llllllllllllIllIIIllIIIlllIIlIII.minY, llllllllllllIllIIIllIIIlllIIIlll.minZ - llllllllllllIllIIIllIIIlllIIlIII.minZ);
        final BlockPos.MutableBlockPos llllllllllllIllIIIllIIIlllIIIIlI = new BlockPos.MutableBlockPos();
        final BlockPos.MutableBlockPos llllllllllllIllIIIllIIIlllIIIIIl = new BlockPos.MutableBlockPos();
        int llllllllllllIllIIIllIIIlllIIIIII = llllllllllllIllIIIllIIIlllIIlIII.minZ;
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIllIllIIIIIlIl(llllllllllllIllIIIllIIIlllIIIIII, llllllllllllIllIIIllIIIlllIIlIII.maxZ)) {
            int llllllllllllIllIIIllIIIllIllllll = llllllllllllIllIIIllIIIlllIIlIII.minY;
            "".length();
            if ("   ".length() < 0) {
                return;
            }
            while (!lIIllIllIIIIIlIl(llllllllllllIllIIIllIIIllIllllll, llllllllllllIllIIIllIIIlllIIlIII.maxY)) {
                int llllllllllllIllIIIllIIIllIlllllI = llllllllllllIllIIIllIIIlllIIlIII.minX;
                "".length();
                if (null != null) {
                    return;
                }
                while (!lIIllIllIIIIIlIl(llllllllllllIllIIIllIIIllIlllllI, llllllllllllIllIIIllIIIlllIIlIII.maxX)) {
                    llllllllllllIllIIIllIIIlllIIIIlI.func_181079_c(llllllllllllIllIIIllIIIllIlllllI, llllllllllllIllIIIllIIIllIllllll, llllllllllllIllIIIllIIIlllIIIIII);
                    "".length();
                    llllllllllllIllIIIllIIIlllIIIIIl.func_181079_c(llllllllllllIllIIIllIIIllIlllllI + llllllllllllIllIIIllIIIlllIIIIll.getX(), llllllllllllIllIIIllIIIllIllllll + llllllllllllIllIIIllIIIlllIIIIll.getY(), llllllllllllIllIIIllIIIlllIIIIII + llllllllllllIllIIIllIIIlllIIIIll.getZ());
                    "".length();
                    boolean llllllllllllIllIIIllIIIllIllllIl = CommandCompare.llIlllllIIIllI[0] != 0;
                    final IBlockState llllllllllllIllIIIllIIIllIllllII = llllllllllllIllIIIllIIIlllIIIlIl.getBlockState(llllllllllllIllIIIllIIIlllIIIIlI);
                    if (!lIIllIllIIIIIlll(llllllllllllIllIIIllIIIlllIIIlII ? 1 : 0) || lIIllIllIIIIlIII(llllllllllllIllIIIllIIIllIllllII.getBlock(), Blocks.air)) {
                        if (lIIllIllIIIIlIIl(llllllllllllIllIIIllIIIllIllllII, llllllllllllIllIIIllIIIlllIIIlIl.getBlockState(llllllllllllIllIIIllIIIlllIIIIIl))) {
                            final TileEntity llllllllllllIllIIIllIIIllIlllIll = llllllllllllIllIIIllIIIlllIIIlIl.getTileEntity(llllllllllllIllIIIllIIIlllIIIIlI);
                            final TileEntity llllllllllllIllIIIllIIIllIlllIlI = llllllllllllIllIIIllIIIlllIIIlIl.getTileEntity(llllllllllllIllIIIllIIIlllIIIIIl);
                            if (lIIllIllIIIIlIlI(llllllllllllIllIIIllIIIllIlllIll) && lIIllIllIIIIlIlI(llllllllllllIllIIIllIIIllIlllIlI)) {
                                final NBTTagCompound llllllllllllIllIIIllIIIllIlllIIl = new NBTTagCompound();
                                llllllllllllIllIIIllIIIllIlllIll.writeToNBT(llllllllllllIllIIIllIIIllIlllIIl);
                                llllllllllllIllIIIllIIIllIlllIIl.removeTag(CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[9]]);
                                llllllllllllIllIIIllIIIllIlllIIl.removeTag(CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[5]]);
                                llllllllllllIllIIIllIIIllIlllIIl.removeTag(CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[10]]);
                                final NBTTagCompound llllllllllllIllIIIllIIIllIlllIII = new NBTTagCompound();
                                llllllllllllIllIIIllIIIllIlllIlI.writeToNBT(llllllllllllIllIIIllIIIllIlllIII);
                                llllllllllllIllIIIllIIIllIlllIII.removeTag(CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[11]]);
                                llllllllllllIllIIIllIIIllIlllIII.removeTag(CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[3]]);
                                llllllllllllIllIIIllIIIllIlllIII.removeTag(CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[12]]);
                                if (lIIllIllIIIIlIll(llllllllllllIllIIIllIIIllIlllIIl.equals(llllllllllllIllIIIllIIIllIlllIII) ? 1 : 0)) {
                                    llllllllllllIllIIIllIIIllIllllIl = (CommandCompare.llIlllllIIIllI[2] != 0);
                                    "".length();
                                    if (((0x49 ^ 0x1B ^ (0x6B ^ 0x16)) & (77 + 53 - 33 + 32 ^ 91 + 117 - 87 + 53 ^ -" ".length())) != 0x0) {
                                        return;
                                    }
                                }
                            }
                            else if (lIIllIllIIIIlIlI(llllllllllllIllIIIllIIIllIlllIll)) {
                                llllllllllllIllIIIllIIIllIllllIl = (CommandCompare.llIlllllIIIllI[2] != 0);
                                "".length();
                                if (-"   ".length() >= 0) {
                                    return;
                                }
                            }
                        }
                        else {
                            llllllllllllIllIIIllIIIllIllllIl = (CommandCompare.llIlllllIIIllI[2] != 0);
                        }
                        ++llllllllllllIllIIIllIIIlllIIIllI;
                        if (lIIllIllIIIIIlll(llllllllllllIllIIIllIIIllIllllIl ? 1 : 0)) {
                            throw new CommandException(CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[13]], new Object[CommandCompare.llIlllllIIIllI[0]]);
                        }
                    }
                    ++llllllllllllIllIIIllIIIllIlllllI;
                }
                ++llllllllllllIllIIIllIIIllIllllll;
            }
            ++llllllllllllIllIIIllIIIlllIIIIII;
        }
        llllllllllllIllIIIllIIIllIllIllI.setCommandStat(CommandResultStats.Type.AFFECTED_BLOCKS, llllllllllllIllIIIllIIIlllIIIllI);
        final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[14]];
        final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandCompare.llIlllllIIIllI[2]];
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandCompare.llIlllllIIIllI[0]] = llllllllllllIllIIIllIIIlllIIIllI;
        CommandBase.notifyOperators(llllllllllllIllIIIllIIIllIllIllI, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
        "".length();
        if (-"   ".length() >= 0) {
            return;
        }
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender llllllllllllIllIIIllIIIllIIlllIl, final String[] llllllllllllIllIIIllIIIllIIlllII, final BlockPos llllllllllllIllIIIllIIIllIIllIll) {
        List<String> list;
        if (lIIllIllIIIIllII(llllllllllllIllIIIllIIIllIIlllII.length) && lIIllIllIIIIllIl(llllllllllllIllIIIllIIIllIIlllII.length, CommandCompare.llIlllllIIIllI[4])) {
            list = CommandBase.func_175771_a(llllllllllllIllIIIllIIIllIIlllII, CommandCompare.llIlllllIIIllI[0], llllllllllllIllIIIllIIIllIIllIll);
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        else if (lIIllIllIIIIIlIl(llllllllllllIllIIIllIIIllIIlllII.length, CommandCompare.llIlllllIIIllI[4]) && lIIllIllIIIIllIl(llllllllllllIllIIIllIIIllIIlllII.length, CommandCompare.llIlllllIIIllI[5])) {
            list = CommandBase.func_175771_a(llllllllllllIllIIIllIIIllIIlllII, CommandCompare.llIlllllIIIllI[4], llllllllllllIllIIIllIIIllIIllIll);
            "".length();
            if ("  ".length() > "  ".length()) {
                return null;
            }
        }
        else if (lIIllIllIIIIIlIl(llllllllllllIllIIIllIIIllIIlllII.length, CommandCompare.llIlllllIIIllI[5]) && lIIllIllIIIIllIl(llllllllllllIllIIIllIIIllIIlllII.length, CommandCompare.llIlllllIIIllI[3])) {
            list = CommandBase.func_175771_a(llllllllllllIllIIIllIIIllIIlllII, CommandCompare.llIlllllIIIllI[5], llllllllllllIllIIIllIIIllIIllIll);
            "".length();
            if ((0x77 ^ 0x73) < -" ".length()) {
                return null;
            }
        }
        else if (lIIllIllIIIIlllI(llllllllllllIllIIIllIIIllIIlllII.length, CommandCompare.llIlllllIIIllI[12])) {
            final String[] lllllllllllllIIIIlIlllIIIllIllII = new String[CommandCompare.llIlllllIIIllI[1]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandCompare.llIlllllIIIllI[0]] = CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[17]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandCompare.llIlllllIIIllI[2]] = CommandCompare.llIlllllIIIlIl[CommandCompare.llIlllllIIIllI[18]];
            list = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIllIIIllIIIllIIlllII, lllllllllllllIIIIlIlllIIIllIllII);
            "".length();
            if (((5 + 31 + 139 + 6 ^ 51 + 27 - 49 + 134) & (31 + 168 - 13 + 5 ^ 165 + 100 - 156 + 60 ^ -" ".length())) < 0) {
                return null;
            }
        }
        else {
            list = null;
        }
        return list;
    }
    
    private static boolean lIIllIllIIIIllII(final int llllllllllllIllIIIllIIIlIlIIIlIl) {
        return llllllllllllIllIIIllIIIlIlIIIlIl > 0;
    }
}
