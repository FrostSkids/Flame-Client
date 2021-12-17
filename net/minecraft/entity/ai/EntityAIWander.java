// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.util.Vec3;
import net.minecraft.entity.EntityCreature;

public class EntityAIWander extends EntityAIBase
{
    private /* synthetic */ double yPosition;
    private /* synthetic */ double xPosition;
    private /* synthetic */ EntityCreature entity;
    private /* synthetic */ int executionChance;
    private /* synthetic */ double speed;
    private /* synthetic */ boolean mustUpdate;
    private /* synthetic */ double zPosition;
    private static final /* synthetic */ int[] lllIIlIIIIIIIl;
    
    public EntityAIWander(final EntityCreature llllllllllllIlIlllllIlllllIIllIl, final double llllllllllllIlIlllllIlllllIlIIII, final int llllllllllllIlIlllllIlllllIIllll) {
        this.entity = llllllllllllIlIlllllIlllllIIllIl;
        this.speed = llllllllllllIlIlllllIlllllIlIIII;
        this.executionChance = llllllllllllIlIlllllIlllllIIllll;
        this.setMutexBits(EntityAIWander.lllIIlIIIIIIIl[1]);
    }
    
    private static boolean lIIllllIlIIIlIlI(final int llllllllllllIlIlllllIllllIlIllII) {
        return llllllllllllIlIlllllIllllIlIllII == 0;
    }
    
    @Override
    public boolean shouldExecute() {
        if (lIIllllIlIIIlIlI(this.mustUpdate ? 1 : 0)) {
            if (lIIllllIlIIIlIll(this.entity.getAge(), EntityAIWander.lllIIlIIIIIIIl[2])) {
                return EntityAIWander.lllIIlIIIIIIIl[3] != 0;
            }
            if (lIIllllIlIIIllII(this.entity.getRNG().nextInt(this.executionChance))) {
                return EntityAIWander.lllIIlIIIIIIIl[3] != 0;
            }
        }
        final Vec3 llllllllllllIlIlllllIlllllIIIlll = RandomPositionGenerator.findRandomTarget(this.entity, EntityAIWander.lllIIlIIIIIIIl[4], EntityAIWander.lllIIlIIIIIIIl[5]);
        if (lIIllllIlIIIllIl(llllllllllllIlIlllllIlllllIIIlll)) {
            return EntityAIWander.lllIIlIIIIIIIl[3] != 0;
        }
        this.xPosition = llllllllllllIlIlllllIlllllIIIlll.xCoord;
        this.yPosition = llllllllllllIlIlllllIlllllIIIlll.yCoord;
        this.zPosition = llllllllllllIlIlllllIlllllIIIlll.zCoord;
        this.mustUpdate = (EntityAIWander.lllIIlIIIIIIIl[3] != 0);
        return EntityAIWander.lllIIlIIIIIIIl[1] != 0;
    }
    
    public void setExecutionChance(final int llllllllllllIlIlllllIllllIllIllI) {
        this.executionChance = llllllllllllIlIlllllIllllIllIllI;
    }
    
    static {
        lIIllllIlIIIlIIl();
    }
    
    private static void lIIllllIlIIIlIIl() {
        (lllIIlIIIIIIIl = new int[6])[0] = (0x2C ^ 0x54);
        EntityAIWander.lllIIlIIIIIIIl[1] = " ".length();
        EntityAIWander.lllIIlIIIIIIIl[2] = (0x10 ^ 0x20 ^ (0x97 ^ 0xC3));
        EntityAIWander.lllIIlIIIIIIIl[3] = ((0x82 ^ 0xC6 ^ (0x2F ^ 0x2B)) & (0x33 ^ 0x60 ^ (0x37 ^ 0x24) ^ -" ".length()));
        EntityAIWander.lllIIlIIIIIIIl[4] = (0xCC ^ 0x9F ^ (0x2B ^ 0x72));
        EntityAIWander.lllIIlIIIIIIIl[5] = (15 + 36 - 28 + 108 ^ 67 + 99 - 139 + 105);
    }
    
    @Override
    public boolean continueExecuting() {
        int n;
        if (lIIllllIlIIIllII(this.entity.getNavigator().noPath() ? 1 : 0)) {
            n = EntityAIWander.lllIIlIIIIIIIl[3];
            "".length();
            if ((0xE3 ^ 0xA7 ^ (0xDE ^ 0x9E)) <= 0) {
                return ((0x6 ^ 0x72 ^ 37 + 22 - 10 + 78) & (132 + 125 - 214 + 137 ^ 45 + 95 + 13 + 38 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EntityAIWander.lllIIlIIIIIIIl[1];
        }
        return n != 0;
    }
    
    public EntityAIWander(final EntityCreature llllllllllllIlIlllllIlllllIllIll, final double llllllllllllIlIlllllIlllllIllIlI) {
        this(llllllllllllIlIlllllIlllllIllIll, llllllllllllIlIlllllIlllllIllIlI, EntityAIWander.lllIIlIIIIIIIl[0]);
    }
    
    private static boolean lIIllllIlIIIllIl(final Object llllllllllllIlIlllllIllllIllIIII) {
        return llllllllllllIlIlllllIllllIllIIII == null;
    }
    
    public void makeUpdate() {
        this.mustUpdate = (EntityAIWander.lllIIlIIIIIIIl[1] != 0);
    }
    
    private static boolean lIIllllIlIIIllII(final int llllllllllllIlIlllllIllllIlIlllI) {
        return llllllllllllIlIlllllIllllIlIlllI != 0;
    }
    
    @Override
    public void startExecuting() {
        this.entity.getNavigator().tryMoveToXYZ(this.xPosition, this.yPosition, this.zPosition, this.speed);
        "".length();
    }
    
    private static boolean lIIllllIlIIIlIll(final int llllllllllllIlIlllllIllllIllIIll, final int llllllllllllIlIlllllIllllIllIIlI) {
        return llllllllllllIlIlllllIllllIllIIll >= llllllllllllIlIlllllIllllIllIIlI;
    }
}
