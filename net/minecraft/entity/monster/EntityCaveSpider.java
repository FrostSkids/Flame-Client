// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.monster;

import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.world.DifficultyInstance;

public class EntityCaveSpider extends EntitySpider
{
    private static final /* synthetic */ int[] llllIIIlIIIlI;
    
    private static boolean lIlIIlllIlIllll(final int lllllllllllllIlIllllIIlIlllIIIll) {
        return lllllllllllllIlIllllIIlIlllIIIll != 0;
    }
    
    private static boolean lIlIIlllIllIIIl(final int lllllllllllllIlIllllIIlIlllIIIIl) {
        return lllllllllllllIlIllllIIlIlllIIIIl > 0;
    }
    
    private static boolean lIlIIlllIllIIII(final Object lllllllllllllIlIllllIIlIlllIIllI, final Object lllllllllllllIlIllllIIlIlllIIlIl) {
        return lllllllllllllIlIllllIIlIlllIIllI == lllllllllllllIlIllllIIlIlllIIlIl;
    }
    
    @Override
    public float getEyeHeight() {
        return 0.45f;
    }
    
    @Override
    public IEntityLivingData onInitialSpawn(final DifficultyInstance lllllllllllllIlIllllIIlIlllIllII, final IEntityLivingData lllllllllllllIlIllllIIlIlllIlIlI) {
        return lllllllllllllIlIllllIIlIlllIlIlI;
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(12.0);
    }
    
    static {
        lIlIIlllIlIlllI();
    }
    
    public EntityCaveSpider(final World lllllllllllllIlIllllIIlIlllllIll) {
        super(lllllllllllllIlIllllIIlIlllllIll);
        this.setSize(0.7f, 0.5f);
    }
    
    @Override
    public boolean attackEntityAsMob(final Entity lllllllllllllIlIllllIIlIllllIIII) {
        if (lIlIIlllIlIllll(super.attackEntityAsMob(lllllllllllllIlIllllIIlIllllIIII) ? 1 : 0)) {
            if (lIlIIlllIlIllll((lllllllllllllIlIllllIIlIllllIIII instanceof EntityLivingBase) ? 1 : 0)) {
                int lllllllllllllIlIllllIIlIllllIIlI = EntityCaveSpider.llllIIIlIIIlI[0];
                if (lIlIIlllIllIIII(this.worldObj.getDifficulty(), EnumDifficulty.NORMAL)) {
                    lllllllllllllIlIllllIIlIllllIIlI = EntityCaveSpider.llllIIIlIIIlI[1];
                    "".length();
                    if ("   ".length() <= ((0xC ^ 0x25) & ~(0x67 ^ 0x4E))) {
                        return ((0x10 ^ 0x21) & ~(0x38 ^ 0x9)) != 0x0;
                    }
                }
                else if (lIlIIlllIllIIII(this.worldObj.getDifficulty(), EnumDifficulty.HARD)) {
                    lllllllllllllIlIllllIIlIllllIIlI = EntityCaveSpider.llllIIIlIIIlI[2];
                }
                if (lIlIIlllIllIIIl(lllllllllllllIlIllllIIlIllllIIlI)) {
                    ((EntityLivingBase)lllllllllllllIlIllllIIlIllllIIII).addPotionEffect(new PotionEffect(Potion.poison.id, lllllllllllllIlIllllIIlIllllIIlI * EntityCaveSpider.llllIIIlIIIlI[3], EntityCaveSpider.llllIIIlIIIlI[0]));
                }
            }
            return EntityCaveSpider.llllIIIlIIIlI[4] != 0;
        }
        return EntityCaveSpider.llllIIIlIIIlI[0] != 0;
    }
    
    private static void lIlIIlllIlIlllI() {
        (llllIIIlIIIlI = new int[5])[0] = ((0xE4 ^ 0xA0 ^ "  ".length()) & (38 + 187 - 58 + 74 ^ 71 + 51 - 110 + 171 ^ -" ".length()));
        EntityCaveSpider.llllIIIlIIIlI[1] = (0x35 ^ 0x32);
        EntityCaveSpider.llllIIIlIIIlI[2] = (0x73 ^ 0x7C);
        EntityCaveSpider.llllIIIlIIIlI[3] = (0xE7 ^ 0xA2 ^ (0xD ^ 0x5C));
        EntityCaveSpider.llllIIIlIIIlI[4] = " ".length();
    }
}
