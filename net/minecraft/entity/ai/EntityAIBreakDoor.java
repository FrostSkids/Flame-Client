// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.block.Block;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.entity.EntityLiving;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.BlockDoor;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class EntityAIBreakDoor extends EntityAIDoorInteract
{
    private static final /* synthetic */ String[] lllIIllIIIlllI;
    private static final /* synthetic */ int[] lllIIllIIIllll;
    private /* synthetic */ int breakingTime;
    private /* synthetic */ int previousBreakProgress;
    
    private static String lIlIIIIIIIlIIlll(final String llllllllllllIlIllllIIIlIIIllIIIl, final String llllllllllllIlIllllIIIlIIIllIIII) {
        try {
            final SecretKeySpec llllllllllllIlIllllIIIlIIIllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIIIlIIIllIIII.getBytes(StandardCharsets.UTF_8)), EntityAIBreakDoor.lllIIllIIIllll[8]), "DES");
            final Cipher llllllllllllIlIllllIIIlIIIllIIll = Cipher.getInstance("DES");
            llllllllllllIlIllllIIIlIIIllIIll.init(EntityAIBreakDoor.lllIIllIIIllll[9], llllllllllllIlIllllIIIlIIIllIlII);
            return new String(llllllllllllIlIllllIIIlIIIllIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIIIlIIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIIIlIIIllIIlI) {
            llllllllllllIlIllllIIIlIIIllIIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean continueExecuting() {
        final double llllllllllllIlIllllIIIlIIlIIlIIl = this.theEntity.getDistanceSq(this.doorPosition);
        if (lIlIIIIIIIlIllIl(this.breakingTime, EntityAIBreakDoor.lllIIllIIIllll[3])) {
            final BlockDoor llllllllllllIlIllllIIIlIIlIIIllI = this.doorBlock;
            if (lIlIIIIIIIlIlIlI(BlockDoor.isOpen(this.theEntity.worldObj, this.doorPosition) ? 1 : 0) && lIlIIIIIIIlIlllI(lIlIIIIIIIlIllII(llllllllllllIlIllllIIIlIIlIIlIIl, 4.0))) {
                final boolean llllllllllllIlIllllIIIlIIlIIlIII = EntityAIBreakDoor.lllIIllIIIllll[2] != 0;
                return llllllllllllIlIllllIIIlIIlIIlIII;
            }
        }
        final boolean llllllllllllIlIllllIIIlIIlIIIlll = EntityAIBreakDoor.lllIIllIIIllll[1] != 0;
        return llllllllllllIlIllllIIIlIIlIIIlll;
    }
    
    private static void lIlIIIIIIIlIlIIl() {
        (lllIIllIIIllll = new int[10])[0] = -" ".length();
        EntityAIBreakDoor.lllIIllIIIllll[1] = ((0x54 ^ 0x44) & ~(0xD0 ^ 0xC0));
        EntityAIBreakDoor.lllIIllIIIllll[2] = " ".length();
        EntityAIBreakDoor.lllIIllIIIllll[3] = (0x97 ^ 0x9D) + (55 + 50 + 9 + 29) - -(0x52 ^ 0x44) + (0xC7 ^ 0x86);
        EntityAIBreakDoor.lllIIllIIIllll[4] = (0x68 ^ 0x7C);
        EntityAIBreakDoor.lllIIllIIIllll[5] = (0xFFFF87F3 & 0x7BFE);
        EntityAIBreakDoor.lllIIllIIIllll[6] = (0xFFFFDFF7 & 0x23FC);
        EntityAIBreakDoor.lllIIllIIIllll[7] = (0xFFFFC7FB & 0x3FD5);
        EntityAIBreakDoor.lllIIllIIIllll[8] = (0x17 ^ 0x1F);
        EntityAIBreakDoor.lllIIllIIIllll[9] = "  ".length();
    }
    
    @Override
    public boolean shouldExecute() {
        if (lIlIIIIIIIlIlIlI(super.shouldExecute() ? 1 : 0)) {
            return EntityAIBreakDoor.lllIIllIIIllll[1] != 0;
        }
        if (lIlIIIIIIIlIlIlI(this.theEntity.worldObj.getGameRules().getBoolean(EntityAIBreakDoor.lllIIllIIIlllI[EntityAIBreakDoor.lllIIllIIIllll[1]]) ? 1 : 0)) {
            return EntityAIBreakDoor.lllIIllIIIllll[1] != 0;
        }
        final BlockDoor llllllllllllIlIllllIIIlIIlIlIlII = this.doorBlock;
        int n;
        if (lIlIIIIIIIlIlIll(BlockDoor.isOpen(this.theEntity.worldObj, this.doorPosition) ? 1 : 0)) {
            n = EntityAIBreakDoor.lllIIllIIIllll[1];
            "".length();
            if ("  ".length() < "  ".length()) {
                return ((0x1 ^ 0xC) & ~(0x6C ^ 0x61)) != 0x0;
            }
        }
        else {
            n = EntityAIBreakDoor.lllIIllIIIllll[2];
        }
        return n != 0;
    }
    
    private static boolean lIlIIIIIIIlIlIlI(final int llllllllllllIlIllllIIIlIIIIlllII) {
        return llllllllllllIlIllllIIIlIIIIlllII == 0;
    }
    
    private static void lIlIIIIIIIlIlIII() {
        (lllIIllIIIlllI = new String[EntityAIBreakDoor.lllIIllIIIllll[2]])[EntityAIBreakDoor.lllIIllIIIllll[1]] = lIlIIIIIIIlIIlll("KKoX3tliIbjyFv4wiIrRsg==", "rqlzM");
    }
    
    public EntityAIBreakDoor(final EntityLiving llllllllllllIlIllllIIIlIIlIllIlI) {
        super(llllllllllllIlIllllIIIlIIlIllIlI);
        this.previousBreakProgress = EntityAIBreakDoor.lllIIllIIIllll[0];
    }
    
    private static boolean lIlIIIIIIIlIllll(final int llllllllllllIlIllllIIIlIIIIlIlll, final int llllllllllllIlIllllIIIlIIIIlIllI) {
        return llllllllllllIlIllllIIIlIIIIlIlll != llllllllllllIlIllllIIIlIIIIlIllI;
    }
    
    @Override
    public void resetTask() {
        super.resetTask();
        this.theEntity.worldObj.sendBlockBreakProgress(this.theEntity.getEntityId(), this.doorPosition, EntityAIBreakDoor.lllIIllIIIllll[0]);
    }
    
    private static int lIlIIIIIIIlIllII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIlIIIIIIIlIlIll(final int llllllllllllIlIllllIIIlIIIIllllI) {
        return llllllllllllIlIllllIIIlIIIIllllI != 0;
    }
    
    private static boolean lIlIIIIIIIllIIII(final int llllllllllllIlIllllIIIlIIIlIlIIl, final int llllllllllllIlIllllIIIlIIIlIlIII) {
        return llllllllllllIlIllllIIIlIIIlIlIIl == llllllllllllIlIllllIIIlIIIlIlIII;
    }
    
    @Override
    public void updateTask() {
        super.updateTask();
        if (lIlIIIIIIIlIlIlI(this.theEntity.getRNG().nextInt(EntityAIBreakDoor.lllIIllIIIllll[4]))) {
            this.theEntity.worldObj.playAuxSFX(EntityAIBreakDoor.lllIIllIIIllll[5], this.doorPosition, EntityAIBreakDoor.lllIIllIIIllll[1]);
        }
        this.breakingTime += EntityAIBreakDoor.lllIIllIIIllll[2];
        final int llllllllllllIlIllllIIIlIIIlllIll = (int)(this.breakingTime / 240.0f * 10.0f);
        if (lIlIIIIIIIlIllll(llllllllllllIlIllllIIIlIIIlllIll, this.previousBreakProgress)) {
            this.theEntity.worldObj.sendBlockBreakProgress(this.theEntity.getEntityId(), this.doorPosition, llllllllllllIlIllllIIIlIIIlllIll);
            this.previousBreakProgress = llllllllllllIlIllllIIIlIIIlllIll;
        }
        if (lIlIIIIIIIllIIII(this.breakingTime, EntityAIBreakDoor.lllIIllIIIllll[3]) && lIlIIIIIIIllIIIl(this.theEntity.worldObj.getDifficulty(), EnumDifficulty.HARD)) {
            this.theEntity.worldObj.setBlockToAir(this.doorPosition);
            "".length();
            this.theEntity.worldObj.playAuxSFX(EntityAIBreakDoor.lllIIllIIIllll[6], this.doorPosition, EntityAIBreakDoor.lllIIllIIIllll[1]);
            this.theEntity.worldObj.playAuxSFX(EntityAIBreakDoor.lllIIllIIIllll[7], this.doorPosition, Block.getIdFromBlock(this.doorBlock));
        }
    }
    
    @Override
    public void startExecuting() {
        super.startExecuting();
        this.breakingTime = EntityAIBreakDoor.lllIIllIIIllll[1];
    }
    
    private static boolean lIlIIIIIIIlIllIl(final int llllllllllllIlIllllIIIlIIIlIIlIl, final int llllllllllllIlIllllIIIlIIIlIIlII) {
        return llllllllllllIlIllllIIIlIIIlIIlIl <= llllllllllllIlIllllIIIlIIIlIIlII;
    }
    
    private static boolean lIlIIIIIIIlIlllI(final int llllllllllllIlIllllIIIlIIIIllIlI) {
        return llllllllllllIlIllllIIIlIIIIllIlI < 0;
    }
    
    static {
        lIlIIIIIIIlIlIIl();
        lIlIIIIIIIlIlIII();
    }
    
    private static boolean lIlIIIIIIIllIIIl(final Object llllllllllllIlIllllIIIlIIIlIIIIl, final Object llllllllllllIlIllllIIIlIIIlIIIII) {
        return llllllllllllIlIllllIIIlIIIlIIIIl == llllllllllllIlIllllIIIlIIIlIIIII;
    }
}
