// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.init.Blocks;
import net.minecraft.util.ITickable;

public class TileEntityEnderChest extends TileEntity implements ITickable
{
    public /* synthetic */ int numPlayersUsing;
    private static final /* synthetic */ String[] lIllIlIllIllll;
    public /* synthetic */ float prevLidAngle;
    private static final /* synthetic */ int[] lIllIlIlllIIII;
    public /* synthetic */ float lidAngle;
    private /* synthetic */ int ticksSinceSync;
    
    private static boolean lllllllIIlIIIII(final Object llllllllllllIllllllllIlIIlIlIIlI, final Object llllllllllllIllllllllIlIIlIlIIIl) {
        return llllllllllllIllllllllIlIIlIlIIlI != llllllllllllIllllllllIlIIlIlIIIl;
    }
    
    public void openChest() {
        this.numPlayersUsing += TileEntityEnderChest.lIllIlIlllIIII[0];
        this.worldObj.addBlockEvent(this.pos, Blocks.ender_chest, TileEntityEnderChest.lIllIlIlllIIII[0], this.numPlayersUsing);
    }
    
    private static int lllllllIIIllIII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public void closeChest() {
        this.numPlayersUsing -= TileEntityEnderChest.lIllIlIlllIIII[0];
        this.worldObj.addBlockEvent(this.pos, Blocks.ender_chest, TileEntityEnderChest.lIllIlIlllIIII[0], this.numPlayersUsing);
    }
    
    private static String lllllllIIIlIIlI(final String llllllllllllIllllllllIlIIlIlllII, final String llllllllllllIllllllllIlIIlIllIll) {
        try {
            final SecretKeySpec llllllllllllIllllllllIlIIllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllllIlIIlIllIll.getBytes(StandardCharsets.UTF_8)), TileEntityEnderChest.lIllIlIlllIIII[5]), "DES");
            final Cipher llllllllllllIllllllllIlIIllIIIII = Cipher.getInstance("DES");
            llllllllllllIllllllllIlIIllIIIII.init(TileEntityEnderChest.lIllIlIlllIIII[4], llllllllllllIllllllllIlIIllIIIIl);
            return new String(llllllllllllIllllllllIlIIllIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllllllllIlIIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllllIlIIlIlllll) {
            llllllllllllIllllllllIlIIlIlllll.printStackTrace();
            return null;
        }
    }
    
    private static String lllllllIIIlIIIl(final String llllllllllllIllllllllIlIIllIlIll, final String llllllllllllIllllllllIlIIllIlIlI) {
        try {
            final SecretKeySpec llllllllllllIllllllllIlIIllIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllllIlIIllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllllllIlIIllIllIl = Cipher.getInstance("Blowfish");
            llllllllllllIllllllllIlIIllIllIl.init(TileEntityEnderChest.lIllIlIlllIIII[4], llllllllllllIllllllllIlIIllIlllI);
            return new String(llllllllllllIllllllllIlIIllIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllllllIlIIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllllIlIIllIllII) {
            llllllllllllIllllllllIlIIllIllII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllllllIIIllllI(final int llllllllllllIllllllllIlIIlIlIllI, final int llllllllllllIllllllllIlIIlIlIlIl) {
        return llllllllllllIllllllllIlIIlIlIllI == llllllllllllIllllllllIlIIlIlIlIl;
    }
    
    private static boolean lllllllIIIllIll(final int llllllllllllIllllllllIlIIlIIlIIl) {
        return llllllllllllIllllllllIlIIlIIlIIl <= 0;
    }
    
    private static boolean lllllllIIIllIIl(final int llllllllllllIllllllllIlIIlIIllll) {
        return llllllllllllIllllllllIlIIlIIllll == 0;
    }
    
    @Override
    public void invalidate() {
        this.updateContainingBlockInfo();
        super.invalidate();
    }
    
    public boolean canBeUsed(final EntityPlayer llllllllllllIllllllllIlIIlllIIll) {
        int n;
        if (lllllllIIlIIIII(this.worldObj.getTileEntity(this.pos), this)) {
            n = TileEntityEnderChest.lIllIlIlllIIII[3];
            "".length();
            if (" ".length() > " ".length()) {
                return ((0x27 ^ 0x36) & ~(0x8C ^ 0x9D)) != 0x0;
            }
        }
        else if (lllllllIIIllIll(lllllllIIIlllll(llllllllllllIllllllllIlIIlllIIll.getDistanceSq(this.pos.getX() + 0.5, this.pos.getY() + 0.5, this.pos.getZ() + 0.5), 64.0))) {
            n = TileEntityEnderChest.lIllIlIlllIIII[0];
            "".length();
            if (null != null) {
                return ((0x83 ^ 0x85) & ~(0x91 ^ 0x97)) != 0x0;
            }
        }
        else {
            n = TileEntityEnderChest.lIllIlIlllIIII[3];
        }
        return n != 0;
    }
    
    private static int lllllllIIIlllll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public void update() {
        final int ticksSinceSync = this.ticksSinceSync + TileEntityEnderChest.lIllIlIlllIIII[0];
        this.ticksSinceSync = ticksSinceSync;
        if (lllllllIIIllIIl(ticksSinceSync % TileEntityEnderChest.lIllIlIlllIIII[1] * TileEntityEnderChest.lIllIlIlllIIII[2])) {
            this.worldObj.addBlockEvent(this.pos, Blocks.ender_chest, TileEntityEnderChest.lIllIlIlllIIII[0], this.numPlayersUsing);
        }
        this.prevLidAngle = this.lidAngle;
        final int llllllllllllIllllllllIlIlIIlllIl = this.pos.getX();
        final int llllllllllllIllllllllIlIlIIlllII = this.pos.getY();
        final int llllllllllllIllllllllIlIlIIllIll = this.pos.getZ();
        final float llllllllllllIllllllllIlIlIIllIlI = 0.1f;
        if (lllllllIIIllIlI(this.numPlayersUsing) && lllllllIIIllIIl(lllllllIIIlIlll(this.lidAngle, 0.0f))) {
            final double llllllllllllIllllllllIlIlIIllIIl = llllllllllllIllllllllIlIlIIlllIl + 0.5;
            final double llllllllllllIllllllllIlIlIIllIII = llllllllllllIllllllllIlIlIIllIll + 0.5;
            this.worldObj.playSoundEffect(llllllllllllIllllllllIlIlIIllIIl, llllllllllllIllllllllIlIlIIlllII + 0.5, llllllllllllIllllllllIlIlIIllIII, TileEntityEnderChest.lIllIlIllIllll[TileEntityEnderChest.lIllIlIlllIIII[3]], 0.5f, this.worldObj.rand.nextFloat() * 0.1f + 0.9f);
        }
        if ((lllllllIIIllIIl(this.numPlayersUsing) && !lllllllIIIllIll(lllllllIIIlIlll(this.lidAngle, 0.0f))) || (lllllllIIIllIlI(this.numPlayersUsing) && lllllllIIIlllII(lllllllIIIllIII(this.lidAngle, 1.0f)))) {
            final float llllllllllllIllllllllIlIlIIlIlll = this.lidAngle;
            if (lllllllIIIllIlI(this.numPlayersUsing)) {
                this.lidAngle += llllllllllllIllllllllIlIlIIllIlI;
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.lidAngle -= llllllllllllIllllllllIlIlIIllIlI;
            }
            if (lllllllIIIllIlI(lllllllIIIlIlll(this.lidAngle, 1.0f))) {
                this.lidAngle = 1.0f;
            }
            final float llllllllllllIllllllllIlIlIIlIllI = 0.5f;
            if (lllllllIIIlllII(lllllllIIIllIII(this.lidAngle, llllllllllllIllllllllIlIlIIlIllI)) && lllllllIIIlllIl(lllllllIIIlIlll(llllllllllllIllllllllIlIlIIlIlll, llllllllllllIllllllllIlIlIIlIllI))) {
                final double llllllllllllIllllllllIlIlIIlIlIl = llllllllllllIllllllllIlIlIIlllIl + 0.5;
                final double llllllllllllIllllllllIlIlIIlIlII = llllllllllllIllllllllIlIlIIllIll + 0.5;
                this.worldObj.playSoundEffect(llllllllllllIllllllllIlIlIIlIlIl, llllllllllllIllllllllIlIlIIlllII + 0.5, llllllllllllIllllllllIlIlIIlIlII, TileEntityEnderChest.lIllIlIllIllll[TileEntityEnderChest.lIllIlIlllIIII[0]], 0.5f, this.worldObj.rand.nextFloat() * 0.1f + 0.9f);
            }
            if (lllllllIIIlllII(lllllllIIIllIII(this.lidAngle, 0.0f))) {
                this.lidAngle = 0.0f;
            }
        }
    }
    
    private static void lllllllIIIlIIll() {
        (lIllIlIllIllll = new String[TileEntityEnderChest.lIllIlIlllIIII[4]])[TileEntityEnderChest.lIllIlIlllIIII[3]] = lllllllIIIlIIIl("nyUHfLqbj4AL54BYlQQCyVl+hcBy4j/b", "PNMtk");
        TileEntityEnderChest.lIllIlIllIllll[TileEntityEnderChest.lIllIlIlllIIII[0]] = lllllllIIIlIIlI("qbkXtoWfqccvsoBxbM6czGcMUPh5hcVv", "vBmQk");
    }
    
    private static int lllllllIIIlIlll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public boolean receiveClientEvent(final int llllllllllllIllllllllIlIlIIIIllI, final int llllllllllllIllllllllIlIlIIIIlIl) {
        if (lllllllIIIllllI(llllllllllllIllllllllIlIlIIIIllI, TileEntityEnderChest.lIllIlIlllIIII[0])) {
            this.numPlayersUsing = llllllllllllIllllllllIlIlIIIIlIl;
            return TileEntityEnderChest.lIllIlIlllIIII[0] != 0;
        }
        return super.receiveClientEvent(llllllllllllIllllllllIlIlIIIIllI, llllllllllllIllllllllIlIlIIIIlIl);
    }
    
    private static boolean lllllllIIIllIlI(final int llllllllllllIllllllllIlIIlIIIlll) {
        return llllllllllllIllllllllIlIIlIIIlll > 0;
    }
    
    private static boolean lllllllIIIlllIl(final int llllllllllllIllllllllIlIIlIIllIl) {
        return llllllllllllIllllllllIlIIlIIllIl >= 0;
    }
    
    private static boolean lllllllIIIlllII(final int llllllllllllIllllllllIlIIlIIlIll) {
        return llllllllllllIllllllllIlIIlIIlIll < 0;
    }
    
    private static void lllllllIIIlIllI() {
        (lIllIlIlllIIII = new int[6])[0] = " ".length();
        TileEntityEnderChest.lIllIlIlllIIII[1] = (0xD0 ^ 0xC4);
        TileEntityEnderChest.lIllIlIlllIIII[2] = (0x2A ^ 0x2E);
        TileEntityEnderChest.lIllIlIlllIIII[3] = ((57 + 25 - 24 + 129 ^ 31 + 147 - 136 + 116) & (0x7 ^ 0x6B ^ (0x49 ^ 0x0) ^ -" ".length()));
        TileEntityEnderChest.lIllIlIlllIIII[4] = "  ".length();
        TileEntityEnderChest.lIllIlIlllIIII[5] = (59 + 131 - 120 + 93 ^ 66 + 17 + 61 + 27);
    }
    
    static {
        lllllllIIIlIllI();
        lllllllIIIlIIll();
    }
}
