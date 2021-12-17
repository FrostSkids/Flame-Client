// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import net.minecraft.world.World;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class CommandShowSeed extends CommandBase
{
    private static final /* synthetic */ int[] lIllllIlIIllll;
    private static final /* synthetic */ String[] lIllllIlIIIIlI;
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandShowSeed.lIllllIlIIllll[2];
    }
    
    private static boolean lIIIIlIIIllllIll(final int llllllllllllIllllIlIIllIIIlIIIlI, final int llllllllllllIllllIlIIllIIIlIIIIl) {
        return llllllllllllIllllIlIIllIIIlIIIlI < llllllllllllIllllIlIIllIIIlIIIIl;
    }
    
    private static void lIIIIlIIIlIlllll() {
        (lIllllIlIIIIlI = new String[CommandShowSeed.lIllllIlIIllll[3]])[CommandShowSeed.lIllllIlIIllll[0]] = lIIIIlIIIlIllIlI("JJrPs9ntXi4=", "WiUQn");
        CommandShowSeed.lIllllIlIIIIlI[CommandShowSeed.lIllllIlIIllll[1]] = lIIIIlIIIlIllIlI("FMsa2G448BVaqcX+nxZYwPE3Itm9FDBj", "xgVmx");
        CommandShowSeed.lIllllIlIIIIlI[CommandShowSeed.lIllllIlIIllll[2]] = lIIIIlIIIlIllllI("GjkcJjsXMgJlKRwzFWUpDDUSLikK", "yVqKZ");
    }
    
    private static boolean lIIIIlIIIllllIlI(final int llllllllllllIllllIlIIllIIIIlllll) {
        return llllllllllllIllllIlIIllIIIIlllll != 0;
    }
    
    private static String lIIIIlIIIlIllIlI(final String llllllllllllIllllIlIIllIIlIIIIlI, final String llllllllllllIllllIlIIllIIlIIIIIl) {
        try {
            final SecretKeySpec llllllllllllIllllIlIIllIIlIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIIllIIlIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIlIIllIIlIIIlII = Cipher.getInstance("Blowfish");
            llllllllllllIllllIlIIllIIlIIIlII.init(CommandShowSeed.lIllllIlIIllll[2], llllllllllllIllllIlIIllIIlIIIlIl);
            return new String(llllllllllllIllllIlIIllIIlIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIIllIIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlIIllIIlIIIIll) {
            llllllllllllIllllIlIIllIIlIIIIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean canCommandSenderUseCommand(final ICommandSender llllllllllllIllllIlIIllIIlIllIII) {
        if (lIIIIlIIIllllIIl(MinecraftServer.getServer().isSinglePlayer() ? 1 : 0) && lIIIIlIIIllllIIl(super.canCommandSenderUseCommand(llllllllllllIllllIlIIllIIlIllIII) ? 1 : 0)) {
            return CommandShowSeed.lIllllIlIIllll[0] != 0;
        }
        return CommandShowSeed.lIllllIlIIllll[1] != 0;
    }
    
    private static boolean lIIIIlIIIllllIIl(final int llllllllllllIllllIlIIllIIIIlllIl) {
        return llllllllllllIllllIlIIllIIIIlllIl == 0;
    }
    
    static {
        lIIIIlIIIllllIII();
        lIIIIlIIIlIlllll();
    }
    
    @Override
    public String getCommandName() {
        return CommandShowSeed.lIllllIlIIIIlI[CommandShowSeed.lIllllIlIIllll[0]];
    }
    
    private static void lIIIIlIIIllllIII() {
        (lIllllIlIIllll = new int[4])[0] = ((29 + 132 - 32 + 110 ^ 89 + 67 - 35 + 44) & (0xFC ^ 0xB8 ^ (0xA5 ^ 0xAB) ^ -" ".length()));
        CommandShowSeed.lIllllIlIIllll[1] = " ".length();
        CommandShowSeed.lIllllIlIIllll[2] = "  ".length();
        CommandShowSeed.lIllllIlIIllll[3] = "   ".length();
    }
    
    @Override
    public String getCommandUsage(final ICommandSender llllllllllllIllllIlIIllIIlIlIIlI) {
        return CommandShowSeed.lIllllIlIIIIlI[CommandShowSeed.lIllllIlIIllll[1]];
    }
    
    private static String lIIIIlIIIlIllllI(String llllllllllllIllllIlIIllIIIlIllIl, final String llllllllllllIllllIlIIllIIIlIllII) {
        llllllllllllIllllIlIIllIIIlIllIl = new String(Base64.getDecoder().decode(llllllllllllIllllIlIIllIIIlIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIlIIllIIIllIIII = new StringBuilder();
        final char[] llllllllllllIllllIlIIllIIIlIllll = llllllllllllIllllIlIIllIIIlIllII.toCharArray();
        int llllllllllllIllllIlIIllIIIlIlllI = CommandShowSeed.lIllllIlIIllll[0];
        final double llllllllllllIllllIlIIllIIIlIlIII = (Object)llllllllllllIllllIlIIllIIIlIllIl.toCharArray();
        final Exception llllllllllllIllllIlIIllIIIlIIlll = (Exception)llllllllllllIllllIlIIllIIIlIlIII.length;
        float llllllllllllIllllIlIIllIIIlIIllI = CommandShowSeed.lIllllIlIIllll[0];
        while (lIIIIlIIIllllIll((int)llllllllllllIllllIlIIllIIIlIIllI, (int)llllllllllllIllllIlIIllIIIlIIlll)) {
            final char llllllllllllIllllIlIIllIIIllIIll = llllllllllllIllllIlIIllIIIlIlIII[llllllllllllIllllIlIIllIIIlIIllI];
            llllllllllllIllllIlIIllIIIllIIII.append((char)(llllllllllllIllllIlIIllIIIllIIll ^ llllllllllllIllllIlIIllIIIlIllll[llllllllllllIllllIlIIllIIIlIlllI % llllllllllllIllllIlIIllIIIlIllll.length]));
            "".length();
            ++llllllllllllIllllIlIIllIIIlIlllI;
            ++llllllllllllIllllIlIIllIIIlIIllI;
            "".length();
            if (-(0xA7 ^ 0xA3) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIlIIllIIIllIIII);
    }
    
    @Override
    public void processCommand(final ICommandSender llllllllllllIllllIlIIllIIlIIlIll, final String[] llllllllllllIllllIlIIllIIlIIllIl) throws CommandException {
        World world;
        if (lIIIIlIIIllllIlI((llllllllllllIllllIlIIllIIlIIlIll instanceof EntityPlayer) ? 1 : 0)) {
            world = ((EntityPlayer)llllllllllllIllllIlIIllIIlIIlIll).worldObj;
            "".length();
            if (-" ".length() > ((0xA4 ^ 0x9F) & ~(0x2C ^ 0x17))) {
                return;
            }
        }
        else {
            world = MinecraftServer.getServer().worldServerForDimension(CommandShowSeed.lIllllIlIIllll[0]);
        }
        final World llllllllllllIllllIlIIllIIlIIllII = world;
        final String lllllllllllllIlIIlIlllIIlIIIIIlI = CommandShowSeed.lIllllIlIIIIlI[CommandShowSeed.lIllllIlIIllll[2]];
        final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[CommandShowSeed.lIllllIlIIllll[1]];
        lllllllllllllIlIIlIlllIIlIIIIIIl[CommandShowSeed.lIllllIlIIllll[0]] = llllllllllllIllllIlIIllIIlIIllII.getSeed();
        llllllllllllIllllIlIIllIIlIIlIll.addChatMessage(new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl));
    }
}
