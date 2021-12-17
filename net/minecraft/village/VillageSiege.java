// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.village;

import java.util.Iterator;
import java.util.List;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.SpawnerAnimals;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.Vec3;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class VillageSiege
{
    private /* synthetic */ int field_75536_c;
    private /* synthetic */ int field_75539_i;
    private /* synthetic */ int field_75534_e;
    private /* synthetic */ int field_75533_d;
    private /* synthetic */ Village theVillage;
    private /* synthetic */ World worldObj;
    private static final /* synthetic */ int[] llIllIllllIlIl;
    private /* synthetic */ int field_75532_g;
    private /* synthetic */ boolean field_75535_b;
    private /* synthetic */ int field_75538_h;
    
    private static boolean lIIllIIIlIlIllII(final Object llllllllllllIllIIlIlllIllIIIllIl) {
        return llllllllllllIllIIlIlllIllIIIllIl == null;
    }
    
    private static boolean lIIllIIIlIlIlIII(final int llllllllllllIllIIlIlllIllIIllIlI, final int llllllllllllIllIIlIlllIllIIllIIl) {
        return llllllllllllIllIIlIlllIllIIllIlI == llllllllllllIllIIlIlllIllIIllIIl;
    }
    
    private static boolean lIIllIIIlIlIlIIl(final Object llllllllllllIllIIlIlllIllIIIllll) {
        return llllllllllllIllIIlIlllIllIIIllll != null;
    }
    
    private boolean spawnZombie() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: new             Lnet/minecraft/util/BlockPos;
        //     4: dup            
        //     5: aload_0         /* llllllllllllIllIIlIlllIllIlIllII */
        //     6: getfield        net/minecraft/village/VillageSiege.field_75532_g:I
        //     9: aload_0         /* llllllllllllIllIIlIlllIllIlIllII */
        //    10: getfield        net/minecraft/village/VillageSiege.field_75538_h:I
        //    13: aload_0         /* llllllllllllIllIIlIlllIllIlIllII */
        //    14: getfield        net/minecraft/village/VillageSiege.field_75539_i:I
        //    17: invokespecial   net/minecraft/util/BlockPos.<init>:(III)V
        //    20: invokespecial   net/minecraft/village/VillageSiege.func_179867_a:(Lnet/minecraft/util/BlockPos;)Lnet/minecraft/util/Vec3;
        //    23: astore_1        /* llllllllllllIllIIlIlllIllIllIIIl */
        //    24: aload_1         /* llllllllllllIllIIlIlllIllIllIIIl */
        //    25: invokestatic    net/minecraft/village/VillageSiege.lIIllIIIlIlIllII:(Ljava/lang/Object;)Z
        //    28: ifeq            37
        //    31: getstatic       net/minecraft/village/VillageSiege.llIllIllllIlIl:[I
        //    34: iconst_1       
        //    35: iaload         
        //    36: ireturn        
        //    37: new             Lnet/minecraft/entity/monster/EntityZombie;
        //    40: dup            
        //    41: aload_0         /* llllllllllllIllIIlIlllIllIlIllII */
        //    42: getfield        net/minecraft/village/VillageSiege.worldObj:Lnet/minecraft/world/World;
        //    45: invokespecial   net/minecraft/entity/monster/EntityZombie.<init>:(Lnet/minecraft/world/World;)V
        //    48: astore_2        /* llllllllllllIllIIlIlllIllIllIIII */
        //    49: aload_2         /* llllllllllllIllIIlIlllIllIllIIII */
        //    50: aload_0         /* llllllllllllIllIIlIlllIllIlIllII */
        //    51: getfield        net/minecraft/village/VillageSiege.worldObj:Lnet/minecraft/world/World;
        //    54: new             Lnet/minecraft/util/BlockPos;
        //    57: dup            
        //    58: aload_2         /* llllllllllllIllIIlIlllIllIllIIII */
        //    59: invokespecial   net/minecraft/util/BlockPos.<init>:(Lnet/minecraft/entity/Entity;)V
        //    62: invokevirtual   net/minecraft/world/World.getDifficultyForLocation:(Lnet/minecraft/util/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
        //    65: aconst_null    
        //    66: invokevirtual   net/minecraft/entity/monster/EntityZombie.onInitialSpawn:(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;
        //    69: ldc             ""
        //    71: invokevirtual   java/lang/String.length:()I
        //    74: pop2           
        //    75: aload_2         /* llllllllllllIllIIlIlllIllIllIIII */
        //    76: getstatic       net/minecraft/village/VillageSiege.llIllIllllIlIl:[I
        //    79: iconst_1       
        //    80: iaload         
        //    81: invokevirtual   net/minecraft/entity/monster/EntityZombie.setVillager:(Z)V
        //    84: ldc             ""
        //    86: invokevirtual   java/lang/String.length:()I
        //    89: pop            
        //    90: ldc             "  "
        //    92: invokevirtual   java/lang/String.length:()I
        //    95: ineg           
        //    96: ifle            124
        //    99: bipush          126
        //   101: bipush          92
        //   103: ixor           
        //   104: bipush          85
        //   106: bipush          119
        //   108: ixor           
        //   109: iconst_m1      
        //   110: ixor           
        //   111: iand           
        //   112: ireturn        
        //   113: astore_3        /* llllllllllllIllIIlIlllIllIlIlllI */
        //   114: aload_3         /* llllllllllllIllIIlIlllIllIlIlllI */
        //   115: invokevirtual   java/lang/Exception.printStackTrace:()V
        //   118: getstatic       net/minecraft/village/VillageSiege.llIllIllllIlIl:[I
        //   121: iconst_1       
        //   122: iaload         
        //   123: ireturn        
        //   124: aload_2         /* llllllllllllIllIIlIlllIllIlIllll */
        //   125: aload_1         /* llllllllllllIllIIlIlllIllIllIIIl */
        //   126: getfield        net/minecraft/util/Vec3.xCoord:D
        //   129: aload_1         /* llllllllllllIllIIlIlllIllIllIIIl */
        //   130: getfield        net/minecraft/util/Vec3.yCoord:D
        //   133: aload_1         /* llllllllllllIllIIlIlllIllIllIIIl */
        //   134: getfield        net/minecraft/util/Vec3.zCoord:D
        //   137: aload_0         /* llllllllllllIllIIlIlllIllIlIllII */
        //   138: getfield        net/minecraft/village/VillageSiege.worldObj:Lnet/minecraft/world/World;
        //   141: getfield        net/minecraft/world/World.rand:Ljava/util/Random;
        //   144: invokevirtual   java/util/Random.nextFloat:()F
        //   147: ldc             360.0
        //   149: fmul           
        //   150: fconst_0       
        //   151: invokevirtual   net/minecraft/entity/monster/EntityZombie.setLocationAndAngles:(DDDFF)V
        //   154: aload_0         /* llllllllllllIllIIlIlllIllIlIllII */
        //   155: getfield        net/minecraft/village/VillageSiege.worldObj:Lnet/minecraft/world/World;
        //   158: aload_2         /* llllllllllllIllIIlIlllIllIlIllll */
        //   159: invokevirtual   net/minecraft/world/World.spawnEntityInWorld:(Lnet/minecraft/entity/Entity;)Z
        //   162: ldc             ""
        //   164: invokevirtual   java/lang/String.length:()I
        //   167: pop2           
        //   168: aload_0         /* llllllllllllIllIIlIlllIllIlIllII */
        //   169: getfield        net/minecraft/village/VillageSiege.theVillage:Lnet/minecraft/village/Village;
        //   172: invokevirtual   net/minecraft/village/Village.getCenter:()Lnet/minecraft/util/BlockPos;
        //   175: astore_3        /* llllllllllllIllIIlIlllIllIlIllIl */
        //   176: aload_2         /* llllllllllllIllIIlIlllIllIlIllll */
        //   177: aload_3         /* llllllllllllIllIIlIlllIllIlIllIl */
        //   178: aload_0         /* llllllllllllIllIIlIlllIllIlIllII */
        //   179: getfield        net/minecraft/village/VillageSiege.theVillage:Lnet/minecraft/village/Village;
        //   182: invokevirtual   net/minecraft/village/Village.getVillageRadius:()I
        //   185: invokevirtual   net/minecraft/entity/monster/EntityZombie.setHomePosAndDistance:(Lnet/minecraft/util/BlockPos;I)V
        //   188: getstatic       net/minecraft/village/VillageSiege.llIllIllllIlIl:[I
        //   191: iconst_4       
        //   192: iaload         
        //   193: ireturn        
        //    StackMapTable: 00 03 FC 00 25 07 00 63 F7 00 4B 07 00 27 FC 00 0A 07 00 3D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  37     84     113    124    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static boolean lIIllIIIlIlIIllI(final int llllllllllllIllIIlIlllIllIIIIlll) {
        return llllllllllllIllIIlIlllIllIIIIlll >= 0;
    }
    
    public void tick() {
        if (lIIllIIIlIlIIIll(this.worldObj.isDaytime() ? 1 : 0)) {
            this.field_75536_c = VillageSiege.llIllIllllIlIl[1];
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lIIllIIIlIlIIlII(this.field_75536_c, VillageSiege.llIllIllllIlIl[2])) {
            if (lIIllIIIlIlIIlIl(this.field_75536_c)) {
                final float llllllllllllIllIIlIlllIlllIllIlI = this.worldObj.getCelestialAngle(0.0f);
                if (!lIIllIIIlIlIIllI(lIIllIIIlIlIIIIl(llllllllllllIllIIlIlllIlllIllIlI, 0.5)) || lIIllIIIlIlIIlll(lIIllIIIlIlIIIlI(llllllllllllIllIIlIlllIlllIllIlI, 0.501))) {
                    return;
                }
                int field_75536_c;
                if (lIIllIIIlIlIIlIl(this.worldObj.rand.nextInt(VillageSiege.llIllIllllIlIl[3]))) {
                    field_75536_c = VillageSiege.llIllIllllIlIl[4];
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                }
                else {
                    field_75536_c = VillageSiege.llIllIllllIlIl[2];
                }
                this.field_75536_c = field_75536_c;
                this.field_75535_b = (VillageSiege.llIllIllllIlIl[1] != 0);
                if (lIIllIIIlIlIlIII(this.field_75536_c, VillageSiege.llIllIllllIlIl[2])) {
                    return;
                }
            }
            if (lIIllIIIlIlIIlII(this.field_75536_c, VillageSiege.llIllIllllIlIl[0])) {
                if (lIIllIIIlIlIIlIl(this.field_75535_b ? 1 : 0)) {
                    if (lIIllIIIlIlIIlIl(this.func_75529_b() ? 1 : 0)) {
                        return;
                    }
                    this.field_75535_b = (VillageSiege.llIllIllllIlIl[4] != 0);
                }
                if (lIIllIIIlIlIIlll(this.field_75534_e)) {
                    this.field_75534_e -= VillageSiege.llIllIllllIlIl[4];
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    this.field_75534_e = VillageSiege.llIllIllllIlIl[2];
                    if (lIIllIIIlIlIIlll(this.field_75533_d)) {
                        this.spawnZombie();
                        "".length();
                        this.field_75533_d -= VillageSiege.llIllIllllIlIl[4];
                        "".length();
                        if (-(0x2E ^ 0x25 ^ (0x3B ^ 0x34)) > 0) {
                            return;
                        }
                    }
                    else {
                        this.field_75536_c = VillageSiege.llIllIllllIlIl[2];
                    }
                }
            }
        }
    }
    
    private static boolean lIIllIIIlIlIIlll(final int llllllllllllIllIIlIlllIllIIIIlIl) {
        return llllllllllllIllIIlIlllIllIIIIlIl > 0;
    }
    
    private static boolean lIIllIIIlIlIIlIl(final int llllllllllllIllIIlIlllIllIIIlIIl) {
        return llllllllllllIllIIlIlllIllIIIlIIl == 0;
    }
    
    private static int lIIllIIIlIlIIIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIIllIIIlIlIlIlI(final int llllllllllllIllIIlIlllIllIIlIllI, final int llllllllllllIllIIlIlllIllIIlIlIl) {
        return llllllllllllIllIIlIlllIllIIlIllI >= llllllllllllIllIIlIlllIllIIlIlIl;
    }
    
    static {
        lIIllIIIlIlIIIII();
    }
    
    private static boolean lIIllIIIlIlIIlII(final int llllllllllllIllIIlIlllIllIIIIIlI, final int llllllllllllIllIIlIlllIllIIIIIIl) {
        return llllllllllllIllIIlIlllIllIIIIIlI != llllllllllllIllIIlIlllIllIIIIIIl;
    }
    
    private Vec3 func_179867_a(final BlockPos llllllllllllIllIIlIlllIllIIlllll) {
        int llllllllllllIllIIlIlllIllIlIIIlI = VillageSiege.llIllIllllIlIl[1];
        "".length();
        if (null != null) {
            return null;
        }
        while (!lIIllIIIlIlIlIlI(llllllllllllIllIIlIlllIllIlIIIlI, VillageSiege.llIllIllllIlIl[3])) {
            final BlockPos llllllllllllIllIIlIlllIllIlIIIIl = llllllllllllIllIIlIlllIllIIlllll.add(this.worldObj.rand.nextInt(VillageSiege.llIllIllllIlIl[6]) - VillageSiege.llIllIllllIlIl[7], this.worldObj.rand.nextInt(VillageSiege.llIllIllllIlIl[8]) - VillageSiege.llIllIllllIlIl[9], this.worldObj.rand.nextInt(VillageSiege.llIllIllllIlIl[6]) - VillageSiege.llIllIllllIlIl[7]);
            if (lIIllIIIlIlIIIll(this.theVillage.func_179866_a(llllllllllllIllIIlIlllIllIlIIIIl) ? 1 : 0) && lIIllIIIlIlIIIll(SpawnerAnimals.canCreatureTypeSpawnAtLocation(EntityLiving.SpawnPlacementType.ON_GROUND, this.worldObj, llllllllllllIllIIlIlllIllIlIIIIl) ? 1 : 0)) {
                return new Vec3(llllllllllllIllIIlIlllIllIlIIIIl.getX(), llllllllllllIllIIlIlllIllIlIIIIl.getY(), llllllllllllIllIIlIlllIllIlIIIIl.getZ());
            }
            ++llllllllllllIllIIlIlllIllIlIIIlI;
        }
        return null;
    }
    
    private static boolean lIIllIIIlIlIlIll(final Object llllllllllllIllIIlIlllIllIIlIIlI, final Object llllllllllllIllIIlIlllIllIIlIIIl) {
        return llllllllllllIllIIlIlllIllIIlIIlI != llllllllllllIllIIlIlllIllIIlIIIl;
    }
    
    private boolean func_75529_b() {
        final List<EntityPlayer> llllllllllllIllIIlIlllIlllIIlIll = this.worldObj.playerEntities;
        final Iterator llllllllllllIllIIlIlllIlllIIlIlI = llllllllllllIllIIlIlllIlllIIlIll.iterator();
        while (!lIIllIIIlIlIIlIl(llllllllllllIllIIlIlllIlllIIlIlI.hasNext() ? 1 : 0)) {
            final EntityPlayer llllllllllllIllIIlIlllIlllIIlIIl = llllllllllllIllIIlIlllIlllIIlIlI.next();
            if (lIIllIIIlIlIIlIl(llllllllllllIllIIlIlllIlllIIlIIl.isSpectator() ? 1 : 0)) {
                this.theVillage = this.worldObj.getVillageCollection().getNearestVillage(new BlockPos(llllllllllllIllIIlIlllIlllIIlIIl), VillageSiege.llIllIllllIlIl[4]);
                if (!lIIllIIIlIlIlIIl(this.theVillage) || !lIIllIIIlIlIlIlI(this.theVillage.getNumVillageDoors(), VillageSiege.llIllIllllIlIl[3]) || !lIIllIIIlIlIlIlI(this.theVillage.getTicksSinceLastDoorAdding(), VillageSiege.llIllIllllIlIl[5]) || !lIIllIIIlIlIlIlI(this.theVillage.getNumVillagers(), VillageSiege.llIllIllllIlIl[5])) {
                    continue;
                }
                final BlockPos llllllllllllIllIIlIlllIlllIIlIII = this.theVillage.getCenter();
                final float llllllllllllIllIIlIlllIlllIIIlll = (float)this.theVillage.getVillageRadius();
                boolean llllllllllllIllIIlIlllIlllIIIllI = VillageSiege.llIllIllllIlIl[1] != 0;
                int llllllllllllIllIIlIlllIlllIIIlIl = VillageSiege.llIllIllllIlIl[1];
                "".length();
                if ((37 + 14 - 0 + 88 ^ 53 + 128 - 179 + 141) <= " ".length()) {
                    return ((0x44 ^ 0x19 ^ " ".length()) & (0xA0 ^ 0xB7 ^ (0xD4 ^ 0x9F) ^ -" ".length())) != 0x0;
                }
                while (!lIIllIIIlIlIlIlI(llllllllllllIllIIlIlllIlllIIIlIl, VillageSiege.llIllIllllIlIl[3])) {
                    final float llllllllllllIllIIlIlllIlllIIIlII = this.worldObj.rand.nextFloat() * 3.1415927f * 2.0f;
                    this.field_75532_g = llllllllllllIllIIlIlllIlllIIlIII.getX() + (int)(MathHelper.cos(llllllllllllIllIIlIlllIlllIIIlII) * llllllllllllIllIIlIlllIlllIIIlll * 0.9);
                    this.field_75538_h = llllllllllllIllIIlIlllIlllIIlIII.getY();
                    this.field_75539_i = llllllllllllIllIIlIlllIlllIIlIII.getZ() + (int)(MathHelper.sin(llllllllllllIllIIlIlllIlllIIIlII) * llllllllllllIllIIlIlllIlllIIIlll * 0.9);
                    llllllllllllIllIIlIlllIlllIIIllI = (VillageSiege.llIllIllllIlIl[1] != 0);
                    final boolean llllllllllllIllIIlIlllIllIllIlll = (boolean)this.worldObj.getVillageCollection().getVillageList().iterator();
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return ((0x99 ^ 0xAC) & ~(0x8 ^ 0x3D)) != 0x0;
                    }
                    while (!lIIllIIIlIlIIlIl(((Iterator)llllllllllllIllIIlIlllIllIllIlll).hasNext() ? 1 : 0)) {
                        final Village llllllllllllIllIIlIlllIlllIIIIll = ((Iterator<Village>)llllllllllllIllIIlIlllIllIllIlll).next();
                        if (lIIllIIIlIlIlIll(llllllllllllIllIIlIlllIlllIIIIll, this.theVillage) && lIIllIIIlIlIIIll(llllllllllllIllIIlIlllIlllIIIIll.func_179866_a(new BlockPos(this.field_75532_g, this.field_75538_h, this.field_75539_i)) ? 1 : 0)) {
                            llllllllllllIllIIlIlllIlllIIIllI = (VillageSiege.llIllIllllIlIl[4] != 0);
                            "".length();
                            if (((8 + 93 - 16 + 85 ^ 92 + 43 - 48 + 42) & (36 + 11 - 4 + 112 ^ 62 + 63 - 94 + 145 ^ -" ".length())) < 0) {
                                return (("  ".length() ^ (0xEF ^ 0x8E)) & (2 + 61 - 43 + 107 ^ (0x3B ^ 0x27) ^ -" ".length())) != 0x0;
                            }
                            break;
                        }
                    }
                    if (lIIllIIIlIlIIlIl(llllllllllllIllIIlIlllIlllIIIllI ? 1 : 0)) {
                        "".length();
                        if ("   ".length() == 0) {
                            return ((137 + 149 - 251 + 152 ^ 58 + 106 - 81 + 72) & (140 + 137 - 243 + 109 ^ 166 + 23 - 22 + 8 ^ -" ".length())) != 0x0;
                        }
                        break;
                    }
                    else {
                        ++llllllllllllIllIIlIlllIlllIIIlIl;
                    }
                }
                if (lIIllIIIlIlIIIll(llllllllllllIllIIlIlllIlllIIIllI ? 1 : 0)) {
                    return VillageSiege.llIllIllllIlIl[1] != 0;
                }
                final Vec3 llllllllllllIllIIlIlllIlllIIIIlI = this.func_179867_a(new BlockPos(this.field_75532_g, this.field_75538_h, this.field_75539_i));
                if (lIIllIIIlIlIlIIl(llllllllllllIllIIlIlllIlllIIIIlI)) {
                    this.field_75534_e = VillageSiege.llIllIllllIlIl[1];
                    this.field_75533_d = VillageSiege.llIllIllllIlIl[5];
                    return VillageSiege.llIllIllllIlIl[4] != 0;
                }
                continue;
            }
        }
        return VillageSiege.llIllIllllIlIl[1] != 0;
    }
    
    private static int lIIllIIIlIlIIIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIIllIIIlIlIIIll(final int llllllllllllIllIIlIlllIllIIIlIll) {
        return llllllllllllIllIIlIlllIllIIIlIll != 0;
    }
    
    public VillageSiege(final World llllllllllllIllIIlIlllIlllIllllI) {
        this.field_75536_c = VillageSiege.llIllIllllIlIl[0];
        this.worldObj = llllllllllllIllIIlIlllIlllIllllI;
    }
    
    private static void lIIllIIIlIlIIIII() {
        (llIllIllllIlIl = new int[10])[0] = -" ".length();
        VillageSiege.llIllIllllIlIl[1] = ((0x29 ^ 0x5D ^ (0x79 ^ 0x3)) & (55 + 49 - 22 + 54 ^ 0 + 45 + 4 + 85 ^ -" ".length()));
        VillageSiege.llIllIllllIlIl[2] = "  ".length();
        VillageSiege.llIllIllllIlIl[3] = (0x25 ^ 0x2F);
        VillageSiege.llIllIllllIlIl[4] = " ".length();
        VillageSiege.llIllIllllIlIl[5] = (0xBE ^ 0xAA);
        VillageSiege.llIllIllllIlIl[6] = (0x33 ^ 0x10 ^ (0x38 ^ 0xB));
        VillageSiege.llIllIllllIlIl[7] = (0xA7 ^ 0xAF);
        VillageSiege.llIllIllllIlIl[8] = (0xF ^ 0x7E ^ (0x1C ^ 0x6B));
        VillageSiege.llIllIllllIlIl[9] = "   ".length();
    }
}
