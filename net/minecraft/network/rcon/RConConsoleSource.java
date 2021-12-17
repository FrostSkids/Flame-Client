// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.rcon;

import net.minecraft.util.ChatComponentText;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.command.CommandResultStats;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.Vec3;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.command.ICommandSender;

public class RConConsoleSource implements ICommandSender
{
    private static final /* synthetic */ String[] lIllIIIlIIIlIl;
    private /* synthetic */ StringBuffer buffer;
    private static final /* synthetic */ int[] lIllIIIlIIIllI;
    
    private static String llllIllllIIlIII(final String lllllllllllllIIIIIllIlllIlIllIII, final String lllllllllllllIIIIIllIlllIlIlIlll) {
        try {
            final SecretKeySpec lllllllllllllIIIIIllIlllIlIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIllIlllIlIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIllIlllIlIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIllIlllIlIllIlI.init(RConConsoleSource.lIllIIIlIIIllI[2], lllllllllllllIIIIIllIlllIlIllIll);
            return new String(lllllllllllllIIIIIllIlllIlIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIllIlllIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIllIlllIlIllIIl) {
            lllllllllllllIIIIIllIlllIlIllIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public World getEntityWorld() {
        return MinecraftServer.getServer().getEntityWorld();
    }
    
    @Override
    public boolean sendCommandFeedback() {
        return RConConsoleSource.lIllIIIlIIIllI[1] != 0;
    }
    
    @Override
    public Vec3 getPositionVector() {
        return new Vec3(0.0, 0.0, 0.0);
    }
    
    @Override
    public void addChatMessage(final IChatComponent lllllllllllllIIIIIllIlllIllIllIl) {
        this.buffer.append(lllllllllllllIIIIIllIlllIllIllIl.getUnformattedText());
        "".length();
    }
    
    static {
        llllIllllIIlIlI();
        llllIllllIIlIIl();
        instance = new RConConsoleSource();
    }
    
    @Override
    public void setCommandStat(final CommandResultStats.Type lllllllllllllIIIIIllIlllIllIIIIl, final int lllllllllllllIIIIIllIlllIllIIIII) {
    }
    
    private static void llllIllllIIlIIl() {
        (lIllIIIlIIIlIl = new String[RConConsoleSource.lIllIIIlIIIllI[1]])[RConConsoleSource.lIllIIIlIIIllI[0]] = llllIllllIIlIII("CkN/Tkhti9s=", "vSrrK");
    }
    
    @Override
    public String getName() {
        return RConConsoleSource.lIllIIIlIIIlIl[RConConsoleSource.lIllIIIlIIIllI[0]];
    }
    
    @Override
    public Entity getCommandSenderEntity() {
        return null;
    }
    
    @Override
    public boolean canCommandSenderUseCommand(final int lllllllllllllIIIIIllIlllIllIlIIl, final String lllllllllllllIIIIIllIlllIllIlIII) {
        return RConConsoleSource.lIllIIIlIIIllI[1] != 0;
    }
    
    @Override
    public BlockPos getPosition() {
        return new BlockPos(RConConsoleSource.lIllIIIlIIIllI[0], RConConsoleSource.lIllIIIlIIIllI[0], RConConsoleSource.lIllIIIlIIIllI[0]);
    }
    
    public RConConsoleSource() {
        this.buffer = new StringBuffer();
    }
    
    @Override
    public IChatComponent getDisplayName() {
        return new ChatComponentText(this.getName());
    }
    
    private static void llllIllllIIlIlI() {
        (lIllIIIlIIIllI = new int[3])[0] = ((0xDC ^ 0x9F) & ~(0xC1 ^ 0x82));
        RConConsoleSource.lIllIIIlIIIllI[1] = " ".length();
        RConConsoleSource.lIllIIIlIIIllI[2] = "  ".length();
    }
}
