// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.tileentity;

import net.minecraft.init.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.util.MathHelper;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class TileEntityNote extends TileEntity
{
    private static final /* synthetic */ int[] lllIlIIllIlIll;
    private static final /* synthetic */ String[] lllIlIIllIlIIl;
    public /* synthetic */ byte note;
    
    public void changePitch() {
        this.note = (byte)((this.note + TileEntityNote.lllIlIIllIlIll[1]) % TileEntityNote.lllIlIIllIlIll[3]);
        this.markDirty();
    }
    
    static {
        lIlIIIlIIlllIIIl();
        lIlIIIlIIllIllIl();
    }
    
    private static void lIlIIIlIIlllIIIl() {
        (lllIlIIllIlIll = new int[8])[0] = ("   ".length() & ~"   ".length());
        TileEntityNote.lllIlIIllIlIll[1] = " ".length();
        TileEntityNote.lllIlIIllIlIll[2] = (152 + 126 - 154 + 45 ^ 54 + 140 - 67 + 50);
        TileEntityNote.lllIlIIllIlIll[3] = (0x9A ^ 0x83);
        TileEntityNote.lllIlIIllIlIll[4] = "  ".length();
        TileEntityNote.lllIlIIllIlIll[5] = "   ".length();
        TileEntityNote.lllIlIIllIlIll[6] = (0x5D ^ 0x59);
        TileEntityNote.lllIlIIllIlIll[7] = (0xD3 ^ 0x89 ^ (0xE9 ^ 0xBB));
    }
    
    private static boolean lIlIIIlIIlllIIlI(final Object llllllllllllIlIllIlllIlIlIIIllII, final Object llllllllllllIlIllIlllIlIlIIIlIll) {
        return llllllllllllIlIllIlllIlIlIIIllII == llllllllllllIlIllIlllIlIlIIIlIll;
    }
    
    private static String lIlIIIlIIllIIIlI(final String llllllllllllIlIllIlllIlIlIlIIIIl, final String llllllllllllIlIllIlllIlIlIlIIIII) {
        try {
            final SecretKeySpec llllllllllllIlIllIlllIlIlIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlllIlIlIlIIIII.getBytes(StandardCharsets.UTF_8)), TileEntityNote.lllIlIIllIlIll[7]), "DES");
            final Cipher llllllllllllIlIllIlllIlIlIlIIIll = Cipher.getInstance("DES");
            llllllllllllIlIllIlllIlIlIlIIIll.init(TileEntityNote.lllIlIIllIlIll[4], llllllllllllIlIllIlllIlIlIlIIlII);
            return new String(llllllllllllIlIllIlllIlIlIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlllIlIlIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIlllIlIlIlIIIlI) {
            llllllllllllIlIllIlllIlIlIlIIIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound llllllllllllIlIllIlllIlIlIllllIl) {
        super.readFromNBT(llllllllllllIlIllIlllIlIlIllllIl);
        this.note = llllllllllllIlIllIlllIlIlIllllIl.getByte(TileEntityNote.lllIlIIllIlIIl[TileEntityNote.lllIlIIllIlIll[1]]);
        this.note = (byte)MathHelper.clamp_int(this.note, TileEntityNote.lllIlIIllIlIll[0], TileEntityNote.lllIlIIllIlIll[2]);
    }
    
    @Override
    public void writeToNBT(final NBTTagCompound llllllllllllIlIllIlllIlIllIIIIIl) {
        super.writeToNBT(llllllllllllIlIllIlllIlIllIIIIIl);
        llllllllllllIlIllIlllIlIllIIIIIl.setByte(TileEntityNote.lllIlIIllIlIIl[TileEntityNote.lllIlIIllIlIll[0]], this.note);
    }
    
    private static void lIlIIIlIIllIllIl() {
        (lllIlIIllIlIIl = new String[TileEntityNote.lllIlIIllIlIll[4]])[TileEntityNote.lllIlIIllIlIll[0]] = lIlIIIlIIllIIIlI("tweLqyEJ03s=", "QWtDK");
        TileEntityNote.lllIlIIllIlIIl[TileEntityNote.lllIlIIllIlIll[1]] = lIlIIIlIIllIIIll("UjoGr6wnoqk=", "XWVMA");
    }
    
    public void triggerNote(final World llllllllllllIlIllIlllIlIlIllIIIl, final BlockPos llllllllllllIlIllIlllIlIlIllIIII) {
        if (lIlIIIlIIlllIIlI(llllllllllllIlIllIlllIlIlIllIIIl.getBlockState(llllllllllllIlIllIlllIlIlIllIIII.up()).getBlock().getMaterial(), Material.air)) {
            final Material llllllllllllIlIllIlllIlIlIlIllll = llllllllllllIlIllIlllIlIlIllIIIl.getBlockState(llllllllllllIlIllIlllIlIlIllIIII.down()).getBlock().getMaterial();
            int llllllllllllIlIllIlllIlIlIlIlllI = TileEntityNote.lllIlIIllIlIll[0];
            if (lIlIIIlIIlllIIlI(llllllllllllIlIllIlllIlIlIlIllll, Material.rock)) {
                llllllllllllIlIllIlllIlIlIlIlllI = TileEntityNote.lllIlIIllIlIll[1];
            }
            if (lIlIIIlIIlllIIlI(llllllllllllIlIllIlllIlIlIlIllll, Material.sand)) {
                llllllllllllIlIllIlllIlIlIlIlllI = TileEntityNote.lllIlIIllIlIll[4];
            }
            if (lIlIIIlIIlllIIlI(llllllllllllIlIllIlllIlIlIlIllll, Material.glass)) {
                llllllllllllIlIllIlllIlIlIlIlllI = TileEntityNote.lllIlIIllIlIll[5];
            }
            if (lIlIIIlIIlllIIlI(llllllllllllIlIllIlllIlIlIlIllll, Material.wood)) {
                llllllllllllIlIllIlllIlIlIlIlllI = TileEntityNote.lllIlIIllIlIll[6];
            }
            llllllllllllIlIllIlllIlIlIllIIIl.addBlockEvent(llllllllllllIlIllIlllIlIlIllIIII, Blocks.noteblock, llllllllllllIlIllIlllIlIlIlIlllI, this.note);
        }
    }
    
    private static String lIlIIIlIIllIIIll(final String llllllllllllIlIllIlllIlIlIIlIlII, final String llllllllllllIlIllIlllIlIlIIlIIll) {
        try {
            final SecretKeySpec llllllllllllIlIllIlllIlIlIIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlllIlIlIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIlllIlIlIIlIllI = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIlllIlIlIIlIllI.init(TileEntityNote.lllIlIIllIlIll[4], llllllllllllIlIllIlllIlIlIIlIlll);
            return new String(llllllllllllIlIllIlllIlIlIIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlllIlIlIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIlllIlIlIIlIlIl) {
            llllllllllllIlIllIlllIlIlIIlIlIl.printStackTrace();
            return null;
        }
    }
}
