// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.projectile;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.World;

public class EntityLargeFireball extends EntityFireball
{
    private static final /* synthetic */ int[] llIlllIIIllIIl;
    public /* synthetic */ int explosionPower;
    private static final /* synthetic */ String[] llIlllIIIllIII;
    
    public EntityLargeFireball(final World llllllllllllIllIIlIlIIIlIIllIlll) {
        super(llllllllllllIllIIlIlIIIlIIllIlll);
        this.explosionPower = EntityLargeFireball.llIlllIIIllIIl[0];
    }
    
    private static boolean lIIllIIlIlIIIIIl(final int llllllllllllIllIIlIlIIIIllIIlllI, final int llllllllllllIllIIlIlIIIIllIIllIl) {
        return llllllllllllIllIIlIlIIIIllIIlllI < llllllllllllIllIIlIlIIIIllIIllIl;
    }
    
    private static void lIIllIIlIIllllIl() {
        (llIlllIIIllIIl = new int[6])[0] = " ".length();
        EntityLargeFireball.llIlllIIIllIIl[1] = ((0x65 ^ 0x2B ^ (0xD5 ^ 0xB6)) & (18 + 12 + 18 + 85 ^ 63 + 123 - 126 + 108 ^ -" ".length()));
        EntityLargeFireball.llIlllIIIllIIl[2] = "  ".length();
        EntityLargeFireball.llIlllIIIllIIl[3] = (33 + 131 - 39 + 82 ^ 42 + 131 - 81 + 80);
        EntityLargeFireball.llIlllIIIllIIl[4] = "   ".length();
        EntityLargeFireball.llIlllIIIllIIl[5] = (0x5B ^ 0x5F);
    }
    
    private static String lIIllIIlIIlllIll(final String llllllllllllIllIIlIlIIIIllIlIllI, final String llllllllllllIllIIlIlIIIIllIlIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIIlIlIIIIllIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIlIIIIllIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlIlIIIIllIllIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlIlIIIIllIllIII.init(EntityLargeFireball.llIlllIIIllIIl[2], llllllllllllIllIIlIlIIIIllIllIIl);
            return new String(llllllllllllIllIIlIlIIIIllIllIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIlIIIIllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIlIIIIllIlIlll) {
            llllllllllllIllIIlIlIIIIllIlIlll.printStackTrace();
            return null;
        }
    }
    
    private static String lIIllIIlIIlllIlI(String llllllllllllIllIIlIlIIIIlllIIllI, final String llllllllllllIllIIlIlIIIIlllIIlIl) {
        llllllllllllIllIIlIlIIIIlllIIllI = new String(Base64.getDecoder().decode(llllllllllllIllIIlIlIIIIlllIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIlIlIIIIlllIlIIl = new StringBuilder();
        final char[] llllllllllllIllIIlIlIIIIlllIlIII = llllllllllllIllIIlIlIIIIlllIIlIl.toCharArray();
        int llllllllllllIllIIlIlIIIIlllIIlll = EntityLargeFireball.llIlllIIIllIIl[1];
        final short llllllllllllIllIIlIlIIIIlllIIIIl = (Object)llllllllllllIllIIlIlIIIIlllIIllI.toCharArray();
        final String llllllllllllIllIIlIlIIIIlllIIIII = (String)llllllllllllIllIIlIlIIIIlllIIIIl.length;
        String llllllllllllIllIIlIlIIIIllIlllll = (String)EntityLargeFireball.llIlllIIIllIIl[1];
        while (lIIllIIlIlIIIIIl((int)llllllllllllIllIIlIlIIIIllIlllll, (int)llllllllllllIllIIlIlIIIIlllIIIII)) {
            final char llllllllllllIllIIlIlIIIIlllIllII = llllllllllllIllIIlIlIIIIlllIIIIl[llllllllllllIllIIlIlIIIIllIlllll];
            llllllllllllIllIIlIlIIIIlllIlIIl.append((char)(llllllllllllIllIIlIlIIIIlllIllII ^ llllllllllllIllIIlIlIIIIlllIlIII[llllllllllllIllIIlIlIIIIlllIIlll % llllllllllllIllIIlIlIIIIlllIlIII.length]));
            "".length();
            ++llllllllllllIllIIlIlIIIIlllIIlll;
            ++llllllllllllIllIIlIlIIIIllIlllll;
            "".length();
            if (((137 + 130 - 126 + 4 ^ 59 + 20 + 28 + 89) & (226 + 68 - 122 + 65 ^ 51 + 1 + 20 + 112 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIlIlIIIIlllIlIIl);
    }
    
    public EntityLargeFireball(final World llllllllllllIllIIlIlIIIlIIlIlIll, final double llllllllllllIllIIlIlIIIlIIlIlIlI, final double llllllllllllIllIIlIlIIIlIIlIlIIl, final double llllllllllllIllIIlIlIIIlIIlIlIII, final double llllllllllllIllIIlIlIIIlIIIlllll, final double llllllllllllIllIIlIlIIIlIIlIIllI, final double llllllllllllIllIIlIlIIIlIIlIIlIl) {
        super(llllllllllllIllIIlIlIIIlIIlIlIll, llllllllllllIllIIlIlIIIlIIlIlIlI, llllllllllllIllIIlIlIIIlIIlIlIIl, llllllllllllIllIIlIlIIIlIIlIlIII, llllllllllllIllIIlIlIIIlIIIlllll, llllllllllllIllIIlIlIIIlIIlIIllI, llllllllllllIllIIlIlIIIlIIlIIlIl);
        this.explosionPower = EntityLargeFireball.llIlllIIIllIIl[0];
    }
    
    static {
        lIIllIIlIIllllIl();
        lIIllIIlIIllllII();
    }
    
    @Override
    protected void onImpact(final MovingObjectPosition llllllllllllIllIIlIlIIIlIIIIIIll) {
        if (lIIllIIlIIlllllI(this.worldObj.isRemote ? 1 : 0)) {
            if (lIIllIIlIIllllll(llllllllllllIllIIlIlIIIlIIIIIIll.entityHit)) {
                llllllllllllIllIIlIlIIIlIIIIIIll.entityHit.attackEntityFrom(DamageSource.causeFireballDamage(this, this.shootingEntity), 6.0f);
                "".length();
                this.applyEnchantments(this.shootingEntity, llllllllllllIllIIlIlIIIlIIIIIIll.entityHit);
            }
            final boolean llllllllllllIllIIlIlIIIlIIIIIlIl = this.worldObj.getGameRules().getBoolean(EntityLargeFireball.llIlllIIIllIII[EntityLargeFireball.llIlllIIIllIIl[1]]);
            this.worldObj.newExplosion(null, this.posX, this.posY, this.posZ, (float)this.explosionPower, llllllllllllIllIIlIlIIIlIIIIIlIl, llllllllllllIllIIlIlIIIlIIIIIlIl);
            "".length();
            this.setDead();
        }
    }
    
    private static boolean lIIllIIlIlIIIIII(final int llllllllllllIllIIlIlIIIIllIIlIIl) {
        return llllllllllllIllIIlIlIIIIllIIlIIl != 0;
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound llllllllllllIllIIlIlIIIIllllllII) {
        super.writeEntityToNBT(llllllllllllIllIIlIlIIIIllllllII);
        llllllllllllIllIIlIlIIIIllllllII.setInteger(EntityLargeFireball.llIlllIIIllIII[EntityLargeFireball.llIlllIIIllIIl[0]], this.explosionPower);
    }
    
    private static boolean lIIllIIlIIlllllI(final int llllllllllllIllIIlIlIIIIllIIIlll) {
        return llllllllllllIllIIlIlIIIIllIIIlll == 0;
    }
    
    private static void lIIllIIlIIllllII() {
        (llIlllIIIllIII = new String[EntityLargeFireball.llIlllIIIllIIl[5]])[EntityLargeFireball.llIlllIIIllIIl[1]] = lIIllIIlIIlllIlI("OB0bAiM8Fx8sPzI=", "UryEQ");
        EntityLargeFireball.llIlllIIIllIII[EntityLargeFireball.llIlllIIIllIIl[0]] = lIIllIIlIIlllIll("0ZH9khON2bOh4VwmVEm3pA==", "PrRqI");
        EntityLargeFireball.llIlllIIIllIII[EntityLargeFireball.llIlllIIIllIIl[2]] = lIIllIIlIIlllIll("hSxrFjy1OWWCfd3waaYQWA==", "RnQru");
        EntityLargeFireball.llIlllIIIllIII[EntityLargeFireball.llIlllIIIllIIl[4]] = lIIllIIlIIlllIlI("JAICNiISEx00HQ4NFyg=", "azrZM");
    }
    
    public EntityLargeFireball(final World llllllllllllIllIIlIlIIIlIIIlIlIl, final EntityLivingBase llllllllllllIllIIlIlIIIlIIIlIlII, final double llllllllllllIllIIlIlIIIlIIIIllIl, final double llllllllllllIllIIlIlIIIlIIIIllII, final double llllllllllllIllIIlIlIIIlIIIIlIll) {
        super(llllllllllllIllIIlIlIIIlIIIlIlIl, llllllllllllIllIIlIlIIIlIIIlIlII, llllllllllllIllIIlIlIIIlIIIIllIl, llllllllllllIllIIlIlIIIlIIIIllII, llllllllllllIllIIlIlIIIlIIIIlIll);
        this.explosionPower = EntityLargeFireball.llIlllIIIllIIl[0];
    }
    
    private static boolean lIIllIIlIIllllll(final Object llllllllllllIllIIlIlIIIIllIIlIll) {
        return llllllllllllIllIIlIlIIIIllIIlIll != null;
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound llllllllllllIllIIlIlIIIIllllIllI) {
        super.readEntityFromNBT(llllllllllllIllIIlIlIIIIllllIllI);
        if (lIIllIIlIlIIIIII(llllllllllllIllIIlIlIIIIllllIllI.hasKey(EntityLargeFireball.llIlllIIIllIII[EntityLargeFireball.llIlllIIIllIIl[2]], EntityLargeFireball.llIlllIIIllIIl[3]) ? 1 : 0)) {
            this.explosionPower = llllllllllllIllIIlIlIIIIllllIllI.getInteger(EntityLargeFireball.llIlllIIIllIII[EntityLargeFireball.llIlllIIIllIIl[4]]);
        }
    }
}
