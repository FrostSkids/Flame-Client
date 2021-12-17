// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.storage;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.chunk.storage.IChunkLoader;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.MinecraftException;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.File;

public class SaveHandlerMP implements ISaveHandler
{
    private static final /* synthetic */ int[] llIlllIIIIlIIl;
    private static final /* synthetic */ String[] llIlllIIIIlIII;
    
    @Override
    public String getWorldDirectoryName() {
        return SaveHandlerMP.llIlllIIIIlIII[SaveHandlerMP.llIlllIIIIlIIl[0]];
    }
    
    private static void lIIllIIlIIIIIIlI() {
        (llIlllIIIIlIIl = new int[3])[0] = ((0xE9 ^ 0xBC) & ~(0x61 ^ 0x34));
        SaveHandlerMP.llIlllIIIIlIIl[1] = " ".length();
        SaveHandlerMP.llIlllIIIIlIIl[2] = "  ".length();
    }
    
    @Override
    public File getMapFileFromName(final String llllllllllllIllIIlIlIlIllllIlllI) {
        return null;
    }
    
    private static String lIIllIIlIIIIIIII(final String llllllllllllIllIIlIlIlIllllIIIlI, final String llllllllllllIllIIlIlIlIllllIIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIIlIlIlIllllIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIlIlIllllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlIlIlIllllIIllI = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlIlIlIllllIIllI.init(SaveHandlerMP.llIlllIIIIlIIl[2], llllllllllllIllIIlIlIlIllllIIlll);
            return new String(llllllllllllIllIIlIlIlIllllIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIlIlIllllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIlIlIllllIIlIl) {
            llllllllllllIllIIlIlIlIllllIIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void checkSessionLock() throws MinecraftException {
    }
    
    @Override
    public IChunkLoader getChunkLoader(final WorldProvider llllllllllllIllIIlIlIlIlllllIlll) {
        return null;
    }
    
    private static void lIIllIIlIIIIIIIl() {
        (llIlllIIIIlIII = new String[SaveHandlerMP.llIlllIIIIlIIl[1]])[SaveHandlerMP.llIlllIIIIlIIl[0]] = lIIllIIlIIIIIIII("Qh+9tyKUHOM=", "uwRpT");
    }
    
    @Override
    public File getWorldDirectory() {
        return null;
    }
    
    static {
        lIIllIIlIIIIIIlI();
        lIIllIIlIIIIIIIl();
    }
    
    @Override
    public WorldInfo loadWorldInfo() {
        return null;
    }
    
    @Override
    public void flush() {
    }
    
    @Override
    public void saveWorldInfo(final WorldInfo llllllllllllIllIIlIlIlIlllllIIlI) {
    }
    
    @Override
    public void saveWorldInfoWithPlayer(final WorldInfo llllllllllllIllIIlIlIlIlllllIlIl, final NBTTagCompound llllllllllllIllIIlIlIlIlllllIlII) {
    }
    
    @Override
    public IPlayerFileData getPlayerNBTManager() {
        return null;
    }
}
