// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.server.integrated;

import net.minecraft.entity.player.EntityPlayerMP;
import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.server.MinecraftServer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.management.ServerConfigurationManager;

public class IntegratedPlayerList extends ServerConfigurationManager
{
    private /* synthetic */ NBTTagCompound hostPlayerData;
    private static final /* synthetic */ int[] lIlIIllIIlIIII;
    private static final /* synthetic */ String[] lIlIIllIIIllll;
    
    @Override
    public IntegratedServer getServerInstance() {
        return (IntegratedServer)super.getServerInstance();
    }
    
    public IntegratedPlayerList(final IntegratedServer lllllllllllllIIIllIlIIIlIlllIIIl) {
        super(lllllllllllllIIIllIlIIIlIlllIIIl);
        this.setViewDistance(IntegratedPlayerList.lIlIIllIIlIIII[0]);
    }
    
    private static boolean lllIIlllIlllIIl(final int lllllllllllllIIIllIlIIIlIlIIlIIl) {
        return lllllllllllllIIIllIlIIIlIlIIlIIl != 0;
    }
    
    private static String lllIIlllIllIlII(final String lllllllllllllIIIllIlIIIlIlIlIIlI, final String lllllllllllllIIIllIlIIIlIlIIllll) {
        try {
            final SecretKeySpec lllllllllllllIIIllIlIIIlIlIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIlIIIlIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllIlIIIlIlIlIlII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllIlIIIlIlIlIlII.init(IntegratedPlayerList.lIlIIllIIlIIII[3], lllllllllllllIIIllIlIIIlIlIlIlIl);
            return new String(lllllllllllllIIIllIlIIIlIlIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIlIIIlIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIlIIIlIlIlIIll) {
            lllllllllllllIIIllIlIIIlIlIlIIll.printStackTrace();
            return null;
        }
    }
    
    private static void lllIIlllIllIlIl() {
        (lIlIIllIIIllll = new String[IntegratedPlayerList.lIlIIllIIlIIII[2]])[IntegratedPlayerList.lIlIIllIIlIIII[1]] = lllIIlllIllIlII("8WqIFeFetiXX1lVA1QEuhJfmrver1gY6jpss4o/DE9A=", "jkKOp");
    }
    
    static {
        lllIIlllIlllIII();
        lllIIlllIllIlIl();
    }
    
    private static void lllIIlllIlllIII() {
        (lIlIIllIIlIIII = new int[4])[0] = (0xA2 ^ 0xB6 ^ (0x5F ^ 0x41));
        IntegratedPlayerList.lIlIIllIIlIIII[1] = ((0x13 ^ 0x58 ^ 77 + 69 - 122 + 103) & (95 + 38 + 23 + 20 ^ 3 + 99 - 16 + 46 ^ -" ".length()));
        IntegratedPlayerList.lIlIIllIIlIIII[2] = " ".length();
        IntegratedPlayerList.lIlIIllIIlIIII[3] = "  ".length();
    }
    
    @Override
    public NBTTagCompound getHostPlayerData() {
        return this.hostPlayerData;
    }
    
    @Override
    public String allowUserToConnect(final SocketAddress lllllllllllllIIIllIlIIIlIllIIllI, final GameProfile lllllllllllllIIIllIlIIIlIllIIlIl) {
        String allowUserToConnect;
        if (lllIIlllIlllIIl(lllllllllllllIIIllIlIIIlIllIIlIl.getName().equalsIgnoreCase(this.getServerInstance().getServerOwner()) ? 1 : 0) && lllIIlllIlllIlI(this.getPlayerByUsername(lllllllllllllIIIllIlIIIlIllIIlIl.getName()))) {
            allowUserToConnect = IntegratedPlayerList.lIlIIllIIIllll[IntegratedPlayerList.lIlIIllIIlIIII[1]];
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        else {
            allowUserToConnect = super.allowUserToConnect(lllllllllllllIIIllIlIIIlIllIIllI, lllllllllllllIIIllIlIIIlIllIIlIl);
        }
        return allowUserToConnect;
    }
    
    private static boolean lllIIlllIlllIlI(final Object lllllllllllllIIIllIlIIIlIlIIlIll) {
        return lllllllllllllIIIllIlIIIlIlIIlIll != null;
    }
    
    @Override
    protected void writePlayerData(final EntityPlayerMP lllllllllllllIIIllIlIIIlIllIllIl) {
        if (lllIIlllIlllIIl(lllllllllllllIIIllIlIIIlIllIllIl.getName().equals(this.getServerInstance().getServerOwner()) ? 1 : 0)) {
            this.hostPlayerData = new NBTTagCompound();
            lllllllllllllIIIllIlIIIlIllIllIl.writeToNBT(this.hostPlayerData);
        }
        super.writePlayerData(lllllllllllllIIIllIlIIIlIllIllIl);
    }
}
