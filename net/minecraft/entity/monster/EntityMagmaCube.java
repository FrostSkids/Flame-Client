// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.monster;

import net.minecraft.init.Items;
import net.minecraft.world.World;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.item.Item;
import net.minecraft.util.EnumParticleTypes;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;

public class EntityMagmaCube extends EntitySlime
{
    private static final /* synthetic */ String[] lIIIlIlIlllllI;
    private static final /* synthetic */ int[] lIIIlIlIllllll;
    
    @Override
    protected void handleJumpLava() {
        this.motionY = 0.22f + this.getSlimeSize() * 0.05f;
        this.isAirBorne = (EntityMagmaCube.lIIIlIlIllllll[0] != 0);
    }
    
    @Override
    protected void jump() {
        this.motionY = 0.42f + this.getSlimeSize() * 0.1f;
        this.isAirBorne = (EntityMagmaCube.lIIIlIlIllllll[0] != 0);
    }
    
    @Override
    protected boolean makesSoundOnLand() {
        return EntityMagmaCube.lIIIlIlIllllll[0] != 0;
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.20000000298023224);
    }
    
    private static boolean llIIIIIllIIIlII(final int lllllllllllllIlIIIIllIIIIIlIIIlI) {
        return lllllllllllllIlIIIIllIIIIIlIIIlI > 0;
    }
    
    private static boolean llIIIIIllIIIIII(final int lllllllllllllIlIIIIllIIIIIlIIllI) {
        return lllllllllllllIlIIIIllIIIIIlIIllI != 0;
    }
    
    @Override
    public int getTotalArmorValue() {
        return this.getSlimeSize() * EntityMagmaCube.lIIIlIlIllllll[2];
    }
    
    private static boolean llIIIIIllIIIlIl(final int lllllllllllllIlIIIIllIIIIIllIIll, final int lllllllllllllIlIIIIllIIIIIllIIlI) {
        return lllllllllllllIlIIIIllIIIIIllIIll >= lllllllllllllIlIIIIllIIIIIllIIlI;
    }
    
    @Override
    protected EntitySlime createInstance() {
        return new EntityMagmaCube(this.worldObj);
    }
    
    private static void llIIIIIlIlllllI() {
        (lIIIlIlIllllll = new int[7])[0] = " ".length();
        EntityMagmaCube.lIIIlIlIllllll[1] = ((0x9 ^ 0x60 ^ (0x7 ^ 0xF)) & (0x73 ^ 0x3C ^ (0x1F ^ 0x31) ^ -" ".length()));
        EntityMagmaCube.lIIIlIlIllllll[2] = "   ".length();
        EntityMagmaCube.lIIIlIlIllllll[3] = (0xFFFFABFB & 0xF054F4);
        EntityMagmaCube.lIIIlIlIllllll[4] = (0x3F ^ 0x3B);
        EntityMagmaCube.lIIIlIlIllllll[5] = "  ".length();
        EntityMagmaCube.lIIIlIlIllllll[6] = (39 + 136 - 9 + 14 ^ 22 + 69 + 95 + 2);
    }
    
    @Override
    public boolean isNotColliding() {
        if (llIIIIIllIIIIII(this.worldObj.checkNoEntityCollision(this.getEntityBoundingBox(), this) ? 1 : 0) && llIIIIIllIIIIII(this.worldObj.getCollidingBoundingBoxes(this, this.getEntityBoundingBox()).isEmpty() ? 1 : 0) && llIIIIIllIIIIIl(this.worldObj.isAnyLiquid(this.getEntityBoundingBox()) ? 1 : 0)) {
            return EntityMagmaCube.lIIIlIlIllllll[0] != 0;
        }
        return EntityMagmaCube.lIIIlIlIllllll[1] != 0;
    }
    
    @Override
    protected int getAttackStrength() {
        return super.getAttackStrength() + EntityMagmaCube.lIIIlIlIllllll[5];
    }
    
    @Override
    protected boolean canDamagePlayer() {
        return EntityMagmaCube.lIIIlIlIllllll[0] != 0;
    }
    
    @Override
    protected void alterSquishAmount() {
        this.squishAmount *= 0.9f;
    }
    
    private static String llIIIIIlIllllII(final String lllllllllllllIlIIIIllIIIIIlllIll, final String lllllllllllllIlIIIIllIIIIIlllIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIllIIIIIlllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIllIIIIIlllIII.getBytes(StandardCharsets.UTF_8)), EntityMagmaCube.lIIIlIlIllllll[6]), "DES");
            final Cipher lllllllllllllIlIIIIllIIIIIllllIl = Cipher.getInstance("DES");
            lllllllllllllIlIIIIllIIIIIllllIl.init(EntityMagmaCube.lIIIlIlIllllll[5], lllllllllllllIlIIIIllIIIIIlllllI);
            return new String(lllllllllllllIlIIIIllIIIIIllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIllIIIIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIllIIIIIllllII) {
            lllllllllllllIlIIIIllIIIIIllllII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getBrightnessForRender(final float lllllllllllllIlIIIIllIIIIlllIIlI) {
        return EntityMagmaCube.lIIIlIlIllllll[3];
    }
    
    @Override
    public void fall(final float lllllllllllllIlIIIIllIIIIlIIllII, final float lllllllllllllIlIIIIllIIIIlIIlIll) {
    }
    
    private static void llIIIIIlIllllIl() {
        (lIIIlIlIlllllI = new String[EntityMagmaCube.lIIIlIlIllllll[5]])[EntityMagmaCube.lIIIlIlIllllll[1]] = llIIIIIlIllllII("++UKys5ErwqSrvdJ9LbfRiK/QFcht81O", "Rnwed");
        EntityMagmaCube.lIIIlIlIlllllI[EntityMagmaCube.lIIIlIlIllllll[0]] = llIIIIIlIllllII("wtPQaD/aw8NI68j9Oc9NzJ+1j97J2PUc", "KXoeZ");
    }
    
    @Override
    public boolean isBurning() {
        return EntityMagmaCube.lIIIlIlIllllll[1] != 0;
    }
    
    private static boolean llIIIIIllIIIIll(final int lllllllllllllIlIIIIllIIIIIlIllll, final int lllllllllllllIlIIIIllIIIIIlIlllI) {
        return lllllllllllllIlIIIIllIIIIIlIllll > lllllllllllllIlIIIIllIIIIIlIlllI;
    }
    
    @Override
    protected String getJumpSound() {
        String s;
        if (llIIIIIllIIIIll(this.getSlimeSize(), EntityMagmaCube.lIIIlIlIllllll[0])) {
            s = EntityMagmaCube.lIIIlIlIlllllI[EntityMagmaCube.lIIIlIlIllllll[1]];
            "".length();
            if (((0x4C ^ 0x2C ^ (0x2A ^ 0x51)) & (0x58 ^ 0x39 ^ (0xDB ^ 0xA1) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            s = EntityMagmaCube.lIIIlIlIlllllI[EntityMagmaCube.lIIIlIlIllllll[0]];
        }
        return s;
    }
    
    @Override
    protected EnumParticleTypes getParticleType() {
        return EnumParticleTypes.FLAME;
    }
    
    @Override
    protected void dropFewItems(final boolean lllllllllllllIlIIIIllIIIIllIIlII, final int lllllllllllllIlIIIIllIIIIllIIIll) {
        final Item lllllllllllllIlIIIIllIIIIllIIIlI = this.getDropItem();
        if (llIIIIIllIIIIlI(lllllllllllllIlIIIIllIIIIllIIIlI) && llIIIIIllIIIIll(this.getSlimeSize(), EntityMagmaCube.lIIIlIlIllllll[0])) {
            int lllllllllllllIlIIIIllIIIIllIIIIl = this.rand.nextInt(EntityMagmaCube.lIIIlIlIllllll[4]) - EntityMagmaCube.lIIIlIlIllllll[5];
            if (llIIIIIllIIIlII(lllllllllllllIlIIIIllIIIIllIIIll)) {
                lllllllllllllIlIIIIllIIIIllIIIIl += this.rand.nextInt(lllllllllllllIlIIIIllIIIIllIIIll + EntityMagmaCube.lIIIlIlIllllll[0]);
            }
            int lllllllllllllIlIIIIllIIIIllIIIII = EntityMagmaCube.lIIIlIlIllllll[1];
            "".length();
            if (-(0x3 ^ 0x6) >= 0) {
                return;
            }
            while (!llIIIIIllIIIlIl(lllllllllllllIlIIIIllIIIIllIIIII, lllllllllllllIlIIIIllIIIIllIIIIl)) {
                this.dropItem(lllllllllllllIlIIIIllIIIIllIIIlI, EntityMagmaCube.lIIIlIlIllllll[0]);
                "".length();
                ++lllllllllllllIlIIIIllIIIIllIIIII;
            }
        }
    }
    
    @Override
    public boolean getCanSpawnHere() {
        if (llIIIIIlIllllll(this.worldObj.getDifficulty(), EnumDifficulty.PEACEFUL)) {
            return EntityMagmaCube.lIIIlIlIllllll[0] != 0;
        }
        return EntityMagmaCube.lIIIlIlIllllll[1] != 0;
    }
    
    @Override
    public float getBrightness(final float lllllllllllllIlIIIIllIIIIlllIIII) {
        return 1.0f;
    }
    
    private static boolean llIIIIIllIIIIlI(final Object lllllllllllllIlIIIIllIIIIIlIlIII) {
        return lllllllllllllIlIIIIllIIIIIlIlIII != null;
    }
    
    private static boolean llIIIIIllIIIIIl(final int lllllllllllllIlIIIIllIIIIIlIIlII) {
        return lllllllllllllIlIIIIllIIIIIlIIlII == 0;
    }
    
    static {
        llIIIIIlIlllllI();
        llIIIIIlIllllIl();
    }
    
    @Override
    protected int getJumpDelay() {
        return super.getJumpDelay() * EntityMagmaCube.lIIIlIlIllllll[4];
    }
    
    public EntityMagmaCube(final World lllllllllllllIlIIIIllIIIlIIIIIlI) {
        super(lllllllllllllIlIIIIllIIIlIIIIIlI);
        this.isImmuneToFire = (EntityMagmaCube.lIIIlIlIllllll[0] != 0);
    }
    
    private static boolean llIIIIIlIllllll(final Object lllllllllllllIlIIIIllIIIIIlIlIll, final Object lllllllllllllIlIIIIllIIIIIlIlIlI) {
        return lllllllllllllIlIIIIllIIIIIlIlIll != lllllllllllllIlIIIIllIIIIIlIlIlI;
    }
    
    @Override
    protected Item getDropItem() {
        return Items.magma_cream;
    }
}
