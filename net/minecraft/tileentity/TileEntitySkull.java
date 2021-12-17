// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.tileentity;

import net.minecraft.nbt.NBTBase;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.network.Packet;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.common.collect.Iterables;
import com.mojang.authlib.properties.Property;
import net.minecraft.server.MinecraftServer;
import java.util.UUID;
import net.minecraft.util.StringUtils;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.nbt.NBTTagCompound;
import com.mojang.authlib.GameProfile;

public class TileEntitySkull extends TileEntity
{
    private static final /* synthetic */ int[] llllIIllIIlIl;
    private /* synthetic */ GameProfile playerProfile;
    private /* synthetic */ int skullRotation;
    private /* synthetic */ int skullType;
    private static final /* synthetic */ String[] llllIIlIlllIl;
    
    static {
        lIlIlIIIllIIIll();
        lIlIlIIIlIlllII();
    }
    
    private void updatePlayerProfile() {
        this.playerProfile = updateGameprofile(this.playerProfile);
        this.markDirty();
    }
    
    private static boolean lIlIlIIIllIlIll(final int lllllllllllllIlIlllIIlIIlIIllIlI, final int lllllllllllllIlIlllIIlIIlIIllIIl) {
        return lllllllllllllIlIlllIIlIIlIIllIlI < lllllllllllllIlIlllIIlIIlIIllIIl;
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound lllllllllllllIlIlllIIlIlIIIIIIIl) {
        super.readFromNBT(lllllllllllllIlIlllIIlIlIIIIIIIl);
        this.skullType = lllllllllllllIlIlllIIlIlIIIIIIIl.getByte(TileEntitySkull.llllIIlIlllIl[TileEntitySkull.llllIIllIIlIl[4]]);
        this.skullRotation = lllllllllllllIlIlllIIlIlIIIIIIIl.getByte(TileEntitySkull.llllIIlIlllIl[TileEntitySkull.llllIIllIIlIl[5]]);
        if (lIlIlIIIllIIllI(this.skullType, TileEntitySkull.llllIIllIIlIl[4])) {
            if (lIlIlIIIllIIlll(lllllllllllllIlIlllIIlIlIIIIIIIl.hasKey(TileEntitySkull.llllIIlIlllIl[TileEntitySkull.llllIIllIIlIl[6]], TileEntitySkull.llllIIllIIlIl[7]) ? 1 : 0)) {
                this.playerProfile = NBTUtil.readGameProfileFromNBT(lllllllllllllIlIlllIIlIlIIIIIIIl.getCompoundTag(TileEntitySkull.llllIIlIlllIl[TileEntitySkull.llllIIllIIlIl[8]]));
                "".length();
                if (" ".length() <= 0) {
                    return;
                }
            }
            else if (lIlIlIIIllIIlll(lllllllllllllIlIlllIIlIlIIIIIIIl.hasKey(TileEntitySkull.llllIIlIlllIl[TileEntitySkull.llllIIllIIlIl[9]], TileEntitySkull.llllIIllIIlIl[10]) ? 1 : 0)) {
                final String lllllllllllllIlIlllIIlIlIIIIIIll = lllllllllllllIlIlllIIlIlIIIIIIIl.getString(TileEntitySkull.llllIIlIlllIl[TileEntitySkull.llllIIllIIlIl[10]]);
                if (lIlIlIIIllIlIII(StringUtils.isNullOrEmpty(lllllllllllllIlIlllIIlIlIIIIIIll) ? 1 : 0)) {
                    this.playerProfile = new GameProfile((UUID)null, lllllllllllllIlIlllIIlIlIIIIIIll);
                    this.updatePlayerProfile();
                }
            }
        }
    }
    
    public int getSkullRotation() {
        return this.skullRotation;
    }
    
    public static GameProfile updateGameprofile(final GameProfile lllllllllllllIlIlllIIlIIlllIIlII) {
        if (!lIlIlIIIllIIlII(lllllllllllllIlIlllIIlIIlllIIlII) || !lIlIlIIIllIlIII(StringUtils.isNullOrEmpty(lllllllllllllIlIlllIIlIIlllIIlII.getName()) ? 1 : 0)) {
            return lllllllllllllIlIlllIIlIIlllIIlII;
        }
        if (lIlIlIIIllIIlll(lllllllllllllIlIlllIIlIIlllIIlII.isComplete() ? 1 : 0) && lIlIlIIIllIIlll(lllllllllllllIlIlllIIlIIlllIIlII.getProperties().containsKey((Object)TileEntitySkull.llllIIlIlllIl[TileEntitySkull.llllIIllIIlIl[11]]) ? 1 : 0)) {
            return lllllllllllllIlIlllIIlIIlllIIlII;
        }
        if (lIlIlIIIllIlIlI(MinecraftServer.getServer())) {
            return lllllllllllllIlIlllIIlIIlllIIlII;
        }
        GameProfile lllllllllllllIlIlllIIlIIlllIIIll = MinecraftServer.getServer().getPlayerProfileCache().getGameProfileForUsername(lllllllllllllIlIlllIIlIIlllIIlII.getName());
        if (lIlIlIIIllIlIlI(lllllllllllllIlIlllIIlIIlllIIIll)) {
            return lllllllllllllIlIlllIIlIIlllIIlII;
        }
        final Property lllllllllllllIlIlllIIlIIlllIIIlI = (Property)Iterables.getFirst((Iterable)lllllllllllllIlIlllIIlIIlllIIIll.getProperties().get((Object)TileEntitySkull.llllIIlIlllIl[TileEntitySkull.llllIIllIIlIl[7]]), (Object)null);
        if (lIlIlIIIllIlIlI(lllllllllllllIlIlllIIlIIlllIIIlI)) {
            lllllllllllllIlIlllIIlIIlllIIIll = MinecraftServer.getServer().getMinecraftSessionService().fillProfileProperties(lllllllllllllIlIlllIIlIIlllIIIll, (boolean)(TileEntitySkull.llllIIllIIlIl[2] != 0));
        }
        return lllllllllllllIlIlllIIlIIlllIIIll;
    }
    
    private static void lIlIlIIIlIlllII() {
        (llllIIlIlllIl = new String[TileEntitySkull.llllIIllIIlIl[12]])[TileEntitySkull.llllIIllIIlIl[0]] = lIlIlIIIlIlIIll("qDle7kOD/uwdvDlyaEcXow==", "JsRjX");
        TileEntitySkull.llllIIlIlllIl[TileEntitySkull.llllIIllIIlIl[2]] = lIlIlIIIlIlIlII("nMKW27dvrn0=", "KDSJv");
        TileEntitySkull.llllIIlIlllIl[TileEntitySkull.llllIIllIIlIl[3]] = lIlIlIIIlIlIIll("tx81FX17Bxk=", "bXLle");
        TileEntitySkull.llllIIlIlllIl[TileEntitySkull.llllIIllIIlIl[4]] = lIlIlIIIlIlIlll("JwAFGQUgEgAQ", "tkpui");
        TileEntitySkull.llllIIlIlllIl[TileEntitySkull.llllIIllIIlIl[5]] = lIlIlIIIlIlIIll("TgZTKZiurj8=", "KKxTp");
        TileEntitySkull.llllIIlIlllIl[TileEntitySkull.llllIIllIIlIl[6]] = lIlIlIIIlIlIlII("eKepM1WJ9Pk=", "ELLno");
        TileEntitySkull.llllIIlIlllIl[TileEntitySkull.llllIIllIIlIl[8]] = lIlIlIIIlIlIlll("Oi8lIBo=", "uXKEh");
        TileEntitySkull.llllIIlIlllIl[TileEntitySkull.llllIIllIIlIl[9]] = lIlIlIIIlIlIlII("UaerQ2gxK+Mh/eF7nuQnvw==", "CHlDo");
        TileEntitySkull.llllIIlIlllIl[TileEntitySkull.llllIIllIIlIl[10]] = lIlIlIIIlIlIlll("LjIyATY/MzYW", "kJFsW");
        TileEntitySkull.llllIIlIlllIl[TileEntitySkull.llllIIllIIlIl[11]] = lIlIlIIIlIlIIll("T5TcKrnPEbVEBIJY1wjw1A==", "DANwz");
        TileEntitySkull.llllIIlIlllIl[TileEntitySkull.llllIIllIIlIl[7]] = lIlIlIIIlIlIlll("JxccMTkhFxc=", "SrdEL");
    }
    
    private static boolean lIlIlIIIllIlIlI(final Object lllllllllllllIlIlllIIlIIlIIlIlIl) {
        return lllllllllllllIlIlllIIlIIlIIlIlIl == null;
    }
    
    public int getSkullType() {
        return this.skullType;
    }
    
    private static boolean lIlIlIIIllIIlII(final Object lllllllllllllIlIlllIIlIIlIIlIlll) {
        return lllllllllllllIlIlllIIlIIlIIlIlll != null;
    }
    
    public void setSkullRotation(final int lllllllllllllIlIlllIIlIIllIlIIll) {
        this.skullRotation = lllllllllllllIlIlllIIlIIllIlIIll;
    }
    
    private static boolean lIlIlIIIllIIllI(final int lllllllllllllIlIlllIIlIIlIIllllI, final int lllllllllllllIlIlllIIlIIlIIlllIl) {
        return lllllllllllllIlIlllIIlIIlIIllllI == lllllllllllllIlIlllIIlIIlIIlllIl;
    }
    
    public GameProfile getPlayerProfile() {
        return this.playerProfile;
    }
    
    public TileEntitySkull() {
        this.playerProfile = null;
    }
    
    public void setType(final int lllllllllllllIlIlllIIlIIllllIIll) {
        this.skullType = lllllllllllllIlIlllIIlIIllllIIll;
        this.playerProfile = null;
    }
    
    private static String lIlIlIIIlIlIlII(final String lllllllllllllIlIlllIIlIIlIlllllI, final String lllllllllllllIlIlllIIlIIlIllllIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlllIIlIIllIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIIlIIlIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlllIIlIIllIIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlllIIlIIllIIIIII.init(TileEntitySkull.llllIIllIIlIl[3], lllllllllllllIlIlllIIlIIllIIIIIl);
            return new String(lllllllllllllIlIlllIIlIIllIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIIlIIlIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlllIIlIIlIllllll) {
            lllllllllllllIlIlllIIlIIlIllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIlIIIllIIlll(final int lllllllllllllIlIlllIIlIIlIIlIIll) {
        return lllllllllllllIlIlllIIlIIlIIlIIll != 0;
    }
    
    private static String lIlIlIIIlIlIIll(final String lllllllllllllIlIlllIIlIIllIIlIIl, final String lllllllllllllIlIlllIIlIIllIIlIII) {
        try {
            final SecretKeySpec lllllllllllllIlIlllIIlIIllIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIIlIIllIIlIII.getBytes(StandardCharsets.UTF_8)), TileEntitySkull.llllIIllIIlIl[10]), "DES");
            final Cipher lllllllllllllIlIlllIIlIIllIIllIl = Cipher.getInstance("DES");
            lllllllllllllIlIlllIIlIIllIIllIl.init(TileEntitySkull.llllIIllIIlIl[3], lllllllllllllIlIlllIIlIIllIIlllI);
            return new String(lllllllllllllIlIlllIIlIIllIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIIlIIllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlllIIlIIllIIllII) {
            lllllllllllllIlIlllIIlIIllIIllII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIlIIIllIlIII(final int lllllllllllllIlIlllIIlIIlIIlIIIl) {
        return lllllllllllllIlIlllIIlIIlIIlIIIl == 0;
    }
    
    private static void lIlIlIIIllIIIll() {
        (llllIIllIIlIl = new int[13])[0] = ((0x36 ^ 0x2A) & ~(0x31 ^ 0x2D));
        TileEntitySkull.llllIIllIIlIl[1] = 5 + 238 - 217 + 229;
        TileEntitySkull.llllIIllIIlIl[2] = " ".length();
        TileEntitySkull.llllIIllIIlIl[3] = "  ".length();
        TileEntitySkull.llllIIllIIlIl[4] = "   ".length();
        TileEntitySkull.llllIIllIIlIl[5] = (0xF ^ 0xB);
        TileEntitySkull.llllIIllIIlIl[6] = (0x57 ^ 0x52);
        TileEntitySkull.llllIIllIIlIl[7] = (0x9E ^ 0x94);
        TileEntitySkull.llllIIllIIlIl[8] = (0xA7 ^ 0xA1);
        TileEntitySkull.llllIIllIIlIl[9] = (0x76 ^ 0x1A ^ (0xCD ^ 0xA6));
        TileEntitySkull.llllIIllIIlIl[10] = (0x53 ^ 0x5B);
        TileEntitySkull.llllIIllIIlIl[11] = (0x3A ^ 0x33);
        TileEntitySkull.llllIIllIIlIl[12] = (0x4A ^ 0x41 ^ ((0x66 ^ 0x38) & ~(0x4D ^ 0x13)));
    }
    
    @Override
    public Packet getDescriptionPacket() {
        final NBTTagCompound lllllllllllllIlIlllIIlIIlllllIIl = new NBTTagCompound();
        this.writeToNBT(lllllllllllllIlIlllIIlIIlllllIIl);
        return new S35PacketUpdateTileEntity(this.pos, TileEntitySkull.llllIIllIIlIl[5], lllllllllllllIlIlllIIlIIlllllIIl);
    }
    
    private static String lIlIlIIIlIlIlll(String lllllllllllllIlIlllIIlIIlIlIlIIl, final String lllllllllllllIlIlllIIlIIlIlIlIII) {
        lllllllllllllIlIlllIIlIIlIlIlIIl = new String(Base64.getDecoder().decode(lllllllllllllIlIlllIIlIIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlllIIlIIlIlIllII = new StringBuilder();
        final char[] lllllllllllllIlIlllIIlIIlIlIlIll = lllllllllllllIlIlllIIlIIlIlIlIII.toCharArray();
        int lllllllllllllIlIlllIIlIIlIlIlIlI = TileEntitySkull.llllIIllIIlIl[0];
        final float lllllllllllllIlIlllIIlIIlIlIIlII = (Object)lllllllllllllIlIlllIIlIIlIlIlIIl.toCharArray();
        final short lllllllllllllIlIlllIIlIIlIlIIIll = (short)lllllllllllllIlIlllIIlIIlIlIIlII.length;
        String lllllllllllllIlIlllIIlIIlIlIIIlI = (String)TileEntitySkull.llllIIllIIlIl[0];
        while (lIlIlIIIllIlIll((int)lllllllllllllIlIlllIIlIIlIlIIIlI, lllllllllllllIlIlllIIlIIlIlIIIll)) {
            final char lllllllllllllIlIlllIIlIIlIlIllll = lllllllllllllIlIlllIIlIIlIlIIlII[lllllllllllllIlIlllIIlIIlIlIIIlI];
            lllllllllllllIlIlllIIlIIlIlIllII.append((char)(lllllllllllllIlIlllIIlIIlIlIllll ^ lllllllllllllIlIlllIIlIIlIlIlIll[lllllllllllllIlIlllIIlIIlIlIlIlI % lllllllllllllIlIlllIIlIIlIlIlIll.length]));
            "".length();
            ++lllllllllllllIlIlllIIlIIlIlIlIlI;
            ++lllllllllllllIlIlllIIlIIlIlIIIlI;
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlllIIlIIlIlIllII);
    }
    
    @Override
    public void writeToNBT(final NBTTagCompound lllllllllllllIlIlllIIlIlIIIIlIlI) {
        super.writeToNBT(lllllllllllllIlIlllIIlIlIIIIlIlI);
        lllllllllllllIlIlllIIlIlIIIIlIlI.setByte(TileEntitySkull.llllIIlIlllIl[TileEntitySkull.llllIIllIIlIl[0]], (byte)(this.skullType & TileEntitySkull.llllIIllIIlIl[1]));
        lllllllllllllIlIlllIIlIlIIIIlIlI.setByte(TileEntitySkull.llllIIlIlllIl[TileEntitySkull.llllIIllIIlIl[2]], (byte)(this.skullRotation & TileEntitySkull.llllIIllIIlIl[1]));
        if (lIlIlIIIllIIlII(this.playerProfile)) {
            final NBTTagCompound lllllllllllllIlIlllIIlIlIIIIllII = new NBTTagCompound();
            NBTUtil.writeGameProfile(lllllllllllllIlIlllIIlIlIIIIllII, this.playerProfile);
            "".length();
            lllllllllllllIlIlllIIlIlIIIIlIlI.setTag(TileEntitySkull.llllIIlIlllIl[TileEntitySkull.llllIIllIIlIl[3]], lllllllllllllIlIlllIIlIlIIIIllII);
        }
    }
    
    public void setPlayerProfile(final GameProfile lllllllllllllIlIlllIIlIIlllIlIll) {
        this.skullType = TileEntitySkull.llllIIllIIlIl[4];
        this.playerProfile = lllllllllllllIlIlllIIlIIlllIlIll;
        this.updatePlayerProfile();
    }
}
