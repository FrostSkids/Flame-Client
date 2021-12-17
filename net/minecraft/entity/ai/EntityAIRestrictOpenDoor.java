// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.village.Village;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.entity.EntityCreature;
import net.minecraft.village.VillageDoorInfo;

public class EntityAIRestrictOpenDoor extends EntityAIBase
{
    private static final /* synthetic */ int[] lIllIIIlllIIll;
    private static final /* synthetic */ String[] lIllIIIlllIIII;
    private /* synthetic */ VillageDoorInfo frontDoor;
    private /* synthetic */ EntityCreature entityObj;
    
    private static boolean lllllIIlIIIIIll(final int lllllllllllllIIIIIlIlIIIIIllIlIl) {
        return lllllllllllllIIIIIlIlIIIIIllIlIl == 0;
    }
    
    @Override
    public void resetTask() {
        ((PathNavigateGround)this.entityObj.getNavigator()).setBreakDoors((boolean)(EntityAIRestrictOpenDoor.lIllIIIlllIIll[2] != 0));
        ((PathNavigateGround)this.entityObj.getNavigator()).setEnterDoors((boolean)(EntityAIRestrictOpenDoor.lIllIIIlllIIll[2] != 0));
        this.frontDoor = null;
    }
    
    private static boolean lllllIIlIIIIllI(final Object lllllllllllllIIIIIlIlIIIIIlllIIl) {
        return lllllllllllllIIIIIlIlIIIIIlllIIl == null;
    }
    
    private static int lllllIIlIIIIlII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static String lllllIIIlllllll(String lllllllllllllIIIIIlIlIIIIlIIIlll, final String lllllllllllllIIIIIlIlIIIIlIIIllI) {
        lllllllllllllIIIIIlIlIIIIlIIIlll = new String(Base64.getDecoder().decode(lllllllllllllIIIIIlIlIIIIlIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIlIlIIIIlIIlIlI = new StringBuilder();
        final char[] lllllllllllllIIIIIlIlIIIIlIIlIIl = lllllllllllllIIIIIlIlIIIIlIIIllI.toCharArray();
        int lllllllllllllIIIIIlIlIIIIlIIlIII = EntityAIRestrictOpenDoor.lIllIIIlllIIll[0];
        final char lllllllllllllIIIIIlIlIIIIlIIIIlI = (Object)lllllllllllllIIIIIlIlIIIIlIIIlll.toCharArray();
        final short lllllllllllllIIIIIlIlIIIIlIIIIIl = (short)lllllllllllllIIIIIlIlIIIIlIIIIlI.length;
        byte lllllllllllllIIIIIlIlIIIIlIIIIII = (byte)EntityAIRestrictOpenDoor.lIllIIIlllIIll[0];
        while (lllllIIlIIIlIII(lllllllllllllIIIIIlIlIIIIlIIIIII, lllllllllllllIIIIIlIlIIIIlIIIIIl)) {
            final char lllllllllllllIIIIIlIlIIIIlIIllIl = lllllllllllllIIIIIlIlIIIIlIIIIlI[lllllllllllllIIIIIlIlIIIIlIIIIII];
            lllllllllllllIIIIIlIlIIIIlIIlIlI.append((char)(lllllllllllllIIIIIlIlIIIIlIIllIl ^ lllllllllllllIIIIIlIlIIIIlIIlIIl[lllllllllllllIIIIIlIlIIIIlIIlIII % lllllllllllllIIIIIlIlIIIIlIIlIIl.length]));
            "".length();
            ++lllllllllllllIIIIIlIlIIIIlIIlIII;
            ++lllllllllllllIIIIIlIlIIIIlIIIIII;
            "".length();
            if ("  ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIlIlIIIIlIIlIlI);
    }
    
    private static boolean lllllIIlIIIIlll(final int lllllllllllllIIIIIlIlIIIIIllIIll) {
        return lllllllllllllIIIIIlIlIIIIIllIIll < 0;
    }
    
    private static void lllllIIlIIIIIII() {
        (lIllIIIlllIIII = new String[EntityAIRestrictOpenDoor.lIllIIIlllIIll[2]])[EntityAIRestrictOpenDoor.lIllIIIlllIIll[0]] = lllllIIIlllllll("GgsgEBc/CiERAitFPgoFbxEqFQJvAzwXRx0AIBEVJgYnKhcqCxcKCD0iPAQL", "OeSeg");
    }
    
    @Override
    public boolean shouldExecute() {
        if (lllllIIlIIIIlIl(this.entityObj.worldObj.isDaytime() ? 1 : 0)) {
            return EntityAIRestrictOpenDoor.lIllIIIlllIIll[0] != 0;
        }
        final BlockPos lllllllllllllIIIIIlIlIIIIllIIlll = new BlockPos(this.entityObj);
        final Village lllllllllllllIIIIIlIlIIIIllIIllI = this.entityObj.worldObj.getVillageCollection().getNearestVillage(lllllllllllllIIIIIlIlIIIIllIIlll, EntityAIRestrictOpenDoor.lIllIIIlllIIll[1]);
        if (lllllIIlIIIIllI(lllllllllllllIIIIIlIlIIIIllIIllI)) {
            return EntityAIRestrictOpenDoor.lIllIIIlllIIll[0] != 0;
        }
        this.frontDoor = lllllllllllllIIIIIlIlIIIIllIIllI.getNearestDoor(lllllllllllllIIIIIlIlIIIIllIIlll);
        int n;
        if (lllllIIlIIIIllI(this.frontDoor)) {
            n = EntityAIRestrictOpenDoor.lIllIIIlllIIll[0];
            "".length();
            if (-(0xC2 ^ 0xC6) > 0) {
                return ((0x59 ^ 0xB) & ~(0xFB ^ 0xA9)) != 0x0;
            }
        }
        else if (lllllIIlIIIIlll(lllllIIlIIIIlII(this.frontDoor.getDistanceToInsideBlockSq(lllllllllllllIIIIIlIlIIIIllIIlll), 2.25))) {
            n = EntityAIRestrictOpenDoor.lIllIIIlllIIll[2];
            "".length();
            if (((0x3B ^ 0x0) & ~(0x89 ^ 0xB2)) != 0x0) {
                return ((0xB7 ^ 0xA6) & ~(0x93 ^ 0x82)) != 0x0;
            }
        }
        else {
            n = EntityAIRestrictOpenDoor.lIllIIIlllIIll[0];
        }
        return n != 0;
    }
    
    public EntityAIRestrictOpenDoor(final EntityCreature lllllllllllllIIIIIlIlIIIIllIllII) {
        this.entityObj = lllllllllllllIIIIIlIlIIIIllIllII;
        if (lllllIIlIIIIIll((lllllllllllllIIIIIlIlIIIIllIllII.getNavigator() instanceof PathNavigateGround) ? 1 : 0)) {
            throw new IllegalArgumentException(EntityAIRestrictOpenDoor.lIllIIIlllIIII[EntityAIRestrictOpenDoor.lIllIIIlllIIll[0]]);
        }
    }
    
    private static void lllllIIlIIIIIlI() {
        (lIllIIIlllIIll = new int[3])[0] = ((0xB8 ^ 0xBD ^ (0xBD ^ 0x8E)) & (0x2F ^ 0x0 ^ (0x91 ^ 0x88) ^ -" ".length()));
        EntityAIRestrictOpenDoor.lIllIIIlllIIll[1] = (0x9B ^ 0x8B);
        EntityAIRestrictOpenDoor.lIllIIIlllIIll[2] = " ".length();
    }
    
    private static boolean lllllIIlIIIlIII(final int lllllllllllllIIIIIlIlIIIIIllllII, final int lllllllllllllIIIIIlIlIIIIIlllIll) {
        return lllllllllllllIIIIIlIlIIIIIllllII < lllllllllllllIIIIIlIlIIIIIlllIll;
    }
    
    static {
        lllllIIlIIIIIlI();
        lllllIIlIIIIIII();
    }
    
    @Override
    public void startExecuting() {
        ((PathNavigateGround)this.entityObj.getNavigator()).setBreakDoors((boolean)(EntityAIRestrictOpenDoor.lIllIIIlllIIll[0] != 0));
        ((PathNavigateGround)this.entityObj.getNavigator()).setEnterDoors((boolean)(EntityAIRestrictOpenDoor.lIllIIIlllIIll[0] != 0));
    }
    
    private static boolean lllllIIlIIIIlIl(final int lllllllllllllIIIIIlIlIIIIIllIlll) {
        return lllllllllllllIIIIIlIlIIIIIllIlll != 0;
    }
    
    @Override
    public void updateTask() {
        this.frontDoor.incrementDoorOpeningRestrictionCounter();
    }
    
    @Override
    public boolean continueExecuting() {
        int n;
        if (lllllIIlIIIIlIl(this.entityObj.worldObj.isDaytime() ? 1 : 0)) {
            n = EntityAIRestrictOpenDoor.lIllIIIlllIIll[0];
            "".length();
            if (-(0x1A ^ 0x1E) >= 0) {
                return ((0x41 ^ 0x21) & ~(0xE ^ 0x6E)) != 0x0;
            }
        }
        else if (lllllIIlIIIIIll(this.frontDoor.getIsDetachedFromVillageFlag() ? 1 : 0) && lllllIIlIIIIlIl(this.frontDoor.func_179850_c(new BlockPos(this.entityObj)) ? 1 : 0)) {
            n = EntityAIRestrictOpenDoor.lIllIIIlllIIll[2];
            "".length();
            if ("  ".length() < 0) {
                return ((2 + 100 - 28 + 68 ^ 49 + 121 - 159 + 153) & (0x76 ^ 0x43 ^ (0x2C ^ 0x33) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EntityAIRestrictOpenDoor.lIllIIIlllIIll[0];
        }
        return n != 0;
    }
}
