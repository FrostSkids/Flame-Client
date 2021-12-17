// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.tileentity;

import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.network.Packet;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.init.Blocks;
import net.minecraft.util.ITickable;

public class TileEntityMobSpawner extends TileEntity implements ITickable
{
    private static final /* synthetic */ String[] llIllIIllIIIIl;
    private static final /* synthetic */ int[] llIllIIllIIlIl;
    private final /* synthetic */ MobSpawnerBaseLogic spawnerLogic;
    
    public TileEntityMobSpawner() {
        this.spawnerLogic = new MobSpawnerBaseLogic() {
            private static final /* synthetic */ int[] lIIlllIIlIIlIl;
            
            @Override
            public void setRandomEntity(final WeightedRandomMinecart lllllllllllllIIlIlIIIlIIIIlIIIlI) {
                super.setRandomEntity(lllllllllllllIIlIlIIIlIIIIlIIIlI);
                if (llIllIlIlllIIII(this.getSpawnerWorld())) {
                    this.getSpawnerWorld().markBlockForUpdate(TileEntityMobSpawner.this.pos);
                }
            }
            
            @Override
            public void func_98267_a(final int lllllllllllllIIlIlIIIlIIIIlIllII) {
                TileEntityMobSpawner.this.worldObj.addBlockEvent(TileEntityMobSpawner.this.pos, Blocks.mob_spawner, lllllllllllllIIlIlIIIlIIIIlIllII, TileEntityMobSpawner$1.lIIlllIIlIIlIl[0]);
            }
            
            private static boolean llIllIlIlllIIII(final Object lllllllllllllIIlIlIIIlIIIIIllllI) {
                return lllllllllllllIIlIlIIIlIIIIIllllI != null;
            }
            
            private static void llIllIlIllIllll() {
                (lIIlllIIlIIlIl = new int[1])[0] = ((0x16 ^ 0x24) & ~(0x76 ^ 0x44));
            }
            
            static {
                llIllIlIllIllll();
            }
            
            @Override
            public World getSpawnerWorld() {
                return TileEntityMobSpawner.this.worldObj;
            }
            
            @Override
            public BlockPos getSpawnerPosition() {
                return TileEntityMobSpawner.this.pos;
            }
        };
    }
    
    private static boolean lIIlIlllIIlIlIIl(final int llllllllllllIllIIlllIlllllIIIlll) {
        return llllllllllllIllIIlllIlllllIIIlll != 0;
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound llllllllllllIllIIlllIlllllllIlII) {
        super.readFromNBT(llllllllllllIllIIlllIlllllllIlII);
        this.spawnerLogic.readFromNBT(llllllllllllIllIIlllIlllllllIlII);
    }
    
    @Override
    public boolean func_183000_F() {
        return TileEntityMobSpawner.llIllIIllIIlIl[1] != 0;
    }
    
    public MobSpawnerBaseLogic getSpawnerBaseLogic() {
        return this.spawnerLogic;
    }
    
    private static void lIIlIlllIIIllIlI() {
        (llIllIIllIIIIl = new String[TileEntityMobSpawner.llIllIIllIIlIl[1]])[TileEntityMobSpawner.llIllIIllIIlIl[0]] = lIIlIlllIIIllIIl("EfQCMqV0dxYgW9Bh8s1N2g==", "BXjxu");
    }
    
    private static String lIIlIlllIIIllIIl(final String llllllllllllIllIIlllIlllllIIlllI, final String llllllllllllIllIIlllIlllllIIlIll) {
        try {
            final SecretKeySpec llllllllllllIllIIlllIlllllIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlllIlllllIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlllIlllllIlIIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlllIlllllIlIIII.init(TileEntityMobSpawner.llIllIIllIIlIl[2], llllllllllllIllIIlllIlllllIlIIIl);
            return new String(llllllllllllIllIIlllIlllllIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlllIlllllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlllIlllllIIllll) {
            llllllllllllIllIIlllIlllllIIllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public Packet getDescriptionPacket() {
        final NBTTagCompound llllllllllllIllIIlllIllllllIIlIl = new NBTTagCompound();
        this.writeToNBT(llllllllllllIllIIlllIllllllIIlIl);
        llllllllllllIllIIlllIllllllIIlIl.removeTag(TileEntityMobSpawner.llIllIIllIIIIl[TileEntityMobSpawner.llIllIIllIIlIl[0]]);
        return new S35PacketUpdateTileEntity(this.pos, TileEntityMobSpawner.llIllIIllIIlIl[1], llllllllllllIllIIlllIllllllIIlIl);
    }
    
    @Override
    public void update() {
        this.spawnerLogic.updateSpawner();
    }
    
    @Override
    public boolean receiveClientEvent(final int llllllllllllIllIIlllIlllllIllIll, final int llllllllllllIllIIlllIlllllIllIlI) {
        int receiveClientEvent;
        if (lIIlIlllIIlIlIIl(this.spawnerLogic.setDelayToMin(llllllllllllIllIIlllIlllllIllIll) ? 1 : 0)) {
            receiveClientEvent = TileEntityMobSpawner.llIllIIllIIlIl[1];
            "".length();
            if (-"   ".length() > 0) {
                return ((0x2F ^ 0x56 ^ (0x7A ^ 0x35)) & (0x1A ^ 0x17 ^ (0x88 ^ 0xB3) ^ -" ".length())) != 0x0;
            }
        }
        else {
            receiveClientEvent = (super.receiveClientEvent(llllllllllllIllIIlllIlllllIllIll, llllllllllllIllIIlllIlllllIllIlI) ? 1 : 0);
        }
        return receiveClientEvent != 0;
    }
    
    @Override
    public void writeToNBT(final NBTTagCompound llllllllllllIllIIlllIllllllIlllI) {
        super.writeToNBT(llllllllllllIllIIlllIllllllIlllI);
        this.spawnerLogic.writeToNBT(llllllllllllIllIIlllIllllllIlllI);
    }
    
    static {
        lIIlIlllIIlIlIII();
        lIIlIlllIIIllIlI();
    }
    
    private static void lIIlIlllIIlIlIII() {
        (llIllIIllIIlIl = new int[3])[0] = ((0x99 ^ 0xBE) & ~(0xBB ^ 0x9C));
        TileEntityMobSpawner.llIllIIllIIlIl[1] = " ".length();
        TileEntityMobSpawner.llIllIIllIIlIl[2] = "  ".length();
    }
}
