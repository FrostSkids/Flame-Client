// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.chunk.storage;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.storage.WorldInfo;
import net.minecraft.world.storage.ThreadedFileIOBase;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.WorldProviderEnd;
import java.io.File;
import net.minecraft.world.WorldProviderHell;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.storage.SaveHandler;

public class AnvilSaveHandler extends SaveHandler
{
    private static final /* synthetic */ int[] lIIIllIlllIllI;
    private static final /* synthetic */ String[] lIIIllIlllIlIl;
    
    @Override
    public IChunkLoader getChunkLoader(final WorldProvider lllllllllllllIIllllllIlIIlIllllI) {
        final File lllllllllllllIIllllllIlIIlIlllIl = this.getWorldDirectory();
        if (llIIIlIlIllIlIl((lllllllllllllIIllllllIlIIlIllllI instanceof WorldProviderHell) ? 1 : 0)) {
            final File lllllllllllllIIllllllIlIIlIlllII = new File(lllllllllllllIIllllllIlIIlIlllIl, AnvilSaveHandler.lIIIllIlllIlIl[AnvilSaveHandler.lIIIllIlllIllI[0]]);
            lllllllllllllIIllllllIlIIlIlllII.mkdirs();
            "".length();
            return new AnvilChunkLoader(lllllllllllllIIllllllIlIIlIlllII);
        }
        if (llIIIlIlIllIlIl((lllllllllllllIIllllllIlIIlIllllI instanceof WorldProviderEnd) ? 1 : 0)) {
            final File lllllllllllllIIllllllIlIIlIllIll = new File(lllllllllllllIIllllllIlIIlIlllIl, AnvilSaveHandler.lIIIllIlllIlIl[AnvilSaveHandler.lIIIllIlllIllI[1]]);
            lllllllllllllIIllllllIlIIlIllIll.mkdirs();
            "".length();
            return new AnvilChunkLoader(lllllllllllllIIllllllIlIIlIllIll);
        }
        return new AnvilChunkLoader(lllllllllllllIIllllllIlIIlIlllIl);
    }
    
    private static boolean llIIIlIlIllIlIl(final int lllllllllllllIIllllllIlIIIlllIll) {
        return lllllllllllllIIllllllIlIIIlllIll != 0;
    }
    
    private static String llIIIlIlIllIIlI(final String lllllllllllllIIllllllIlIIlIIIIlI, final String lllllllllllllIIllllllIlIIlIIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIllllllIlIIlIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllllIlIIlIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllllIlIIlIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllllIlIIlIIIlII.init(AnvilSaveHandler.lIIIllIlllIllI[3], lllllllllllllIIllllllIlIIlIIIlIl);
            return new String(lllllllllllllIIllllllIlIIlIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllllIlIIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllllIlIIlIIIIll) {
            lllllllllllllIIllllllIlIIlIIIIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void flush() {
        try {
            ThreadedFileIOBase.getThreadedIOInstance().waitForFinish();
            "".length();
            if ("   ".length() < " ".length()) {
                return;
            }
        }
        catch (InterruptedException lllllllllllllIIllllllIlIIlIIlIll) {
            lllllllllllllIIllllllIlIIlIIlIll.printStackTrace();
        }
        RegionFileCache.clearRegionFileReferences();
    }
    
    private static void llIIIlIlIllIlII() {
        (lIIIllIlllIllI = new int[4])[0] = ((0x8 ^ 0x4A) & ~(0x5C ^ 0x1E));
        AnvilSaveHandler.lIIIllIlllIllI[1] = " ".length();
        AnvilSaveHandler.lIIIllIlllIllI[2] = (0xFFFFFFFD & 0x4ABF);
        AnvilSaveHandler.lIIIllIlllIllI[3] = "  ".length();
    }
    
    @Override
    public void saveWorldInfoWithPlayer(final WorldInfo lllllllllllllIIllllllIlIIlIlIIlI, final NBTTagCompound lllllllllllllIIllllllIlIIlIlIIIl) {
        lllllllllllllIIllllllIlIIlIlIIlI.setSaveVersion(AnvilSaveHandler.lIIIllIlllIllI[2]);
        super.saveWorldInfoWithPlayer(lllllllllllllIIllllllIlIIlIlIIlI, lllllllllllllIIllllllIlIIlIlIIIl);
    }
    
    private static void llIIIlIlIllIIll() {
        (lIIIllIlllIlIl = new String[AnvilSaveHandler.lIIIllIlllIllI[3]])[AnvilSaveHandler.lIIIllIlllIllI[0]] = llIIIlIlIllIIlI("7lpnkE7PARk=", "Qjtbj");
        AnvilSaveHandler.lIIIllIlllIlIl[AnvilSaveHandler.lIIIllIlllIllI[1]] = llIIIlIlIllIIlI("3W3EbqtBVVU=", "Btvqp");
    }
    
    static {
        llIIIlIlIllIlII();
        llIIIlIlIllIIll();
    }
    
    public AnvilSaveHandler(final File lllllllllllllIIllllllIlIIllIIllI, final String lllllllllllllIIllllllIlIIllIIlIl, final boolean lllllllllllllIIllllllIlIIllIlIII) {
        super(lllllllllllllIIllllllIlIIllIIllI, lllllllllllllIIllllllIlIIllIIlIl, lllllllllllllIIllllllIlIIllIlIII);
    }
}
