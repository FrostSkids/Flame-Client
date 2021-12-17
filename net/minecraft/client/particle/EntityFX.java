// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.WorldRenderer;
import java.util.Arrays;
import net.minecraft.client.Minecraft;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.World;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.entity.Entity;

public class EntityFX extends Entity
{
    private static final /* synthetic */ int[] lIllIlllIIIlIl;
    protected /* synthetic */ float particleScale;
    private static final /* synthetic */ String[] lIllIlllIIIIll;
    protected /* synthetic */ float particleRed;
    protected /* synthetic */ float particleTextureJitterY;
    protected /* synthetic */ int particleTextureIndexX;
    protected /* synthetic */ int particleMaxAge;
    public static /* synthetic */ double interpPosZ;
    protected /* synthetic */ float particleAlpha;
    protected /* synthetic */ TextureAtlasSprite particleIcon;
    public static /* synthetic */ double interpPosY;
    protected /* synthetic */ float particleGravity;
    protected /* synthetic */ float particleBlue;
    protected /* synthetic */ float particleGreen;
    protected /* synthetic */ int particleTextureIndexY;
    public static /* synthetic */ double interpPosX;
    protected /* synthetic */ float particleTextureJitterX;
    protected /* synthetic */ int particleAge;
    
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        final int particleAge = this.particleAge;
        this.particleAge = particleAge + EntityFX.lIllIlllIIIlIl[1];
        if (lIIIIIIIIIIIlIlI(particleAge, this.particleMaxAge)) {
            this.setDead();
        }
        this.motionY -= 0.04 * this.particleGravity;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= 0.9800000190734863;
        this.motionY *= 0.9800000190734863;
        this.motionZ *= 0.9800000190734863;
        if (lIIIIIIIIIIIlIll(this.onGround ? 1 : 0)) {
            this.motionX *= 0.699999988079071;
            this.motionZ *= 0.699999988079071;
        }
    }
    
    private static boolean lIIIIIIIIIIIlIII(final int llllllllllllIllllllIlIIlIIIIIlll) {
        return llllllllllllIllllllIlIIlIIIIIlll == 0;
    }
    
    protected EntityFX(final World llllllllllllIllllllIlIlIIIIIIllI, final double llllllllllllIllllllIlIlIIIIIIIII, final double llllllllllllIllllllIlIIlllllllll, final double llllllllllllIllllllIlIlIIIIIIIll) {
        super(llllllllllllIllllllIlIlIIIIIIllI);
        this.particleAlpha = 1.0f;
        this.setSize(0.2f, 0.2f);
        this.setPosition(llllllllllllIllllllIlIlIIIIIIIII, llllllllllllIllllllIlIIlllllllll, llllllllllllIllllllIlIlIIIIIIIll);
        this.prevPosX = llllllllllllIllllllIlIlIIIIIIIII;
        this.lastTickPosX = llllllllllllIllllllIlIlIIIIIIIII;
        this.prevPosY = llllllllllllIllllllIlIIlllllllll;
        this.lastTickPosY = llllllllllllIllllllIlIIlllllllll;
        this.prevPosZ = llllllllllllIllllllIlIlIIIIIIIll;
        this.lastTickPosZ = llllllllllllIllllllIlIlIIIIIIIll;
        final float particleRed = 1.0f;
        this.particleBlue = particleRed;
        this.particleGreen = particleRed;
        this.particleRed = particleRed;
        this.particleTextureJitterX = this.rand.nextFloat() * 3.0f;
        this.particleTextureJitterY = this.rand.nextFloat() * 3.0f;
        this.particleScale = (this.rand.nextFloat() * 0.5f + 0.5f) * 2.0f;
        this.particleMaxAge = (int)(4.0f / (this.rand.nextFloat() * 0.9f + 0.1f));
        this.particleAge = EntityFX.lIllIlllIIIlIl[0];
    }
    
    public void setParticleTextureIndex(final int llllllllllllIllllllIlIIlIlIlIIlI) {
        if (lIIIIIIIIIIIlIll(this.getFXLayer())) {
            throw new RuntimeException(EntityFX.lIllIlllIIIIll[EntityFX.lIllIlllIIIlIl[1]]);
        }
        this.particleTextureIndexX = llllllllllllIllllllIlIIlIlIlIIlI % EntityFX.lIllIlllIIIlIl[2];
        this.particleTextureIndexY = llllllllllllIllllllIlIIlIlIlIIlI / EntityFX.lIllIlllIIIlIl[2];
    }
    
    public float getGreenColorF() {
        return this.particleGreen;
    }
    
    @Override
    protected void entityInit() {
    }
    
    public float getAlpha() {
        return this.particleAlpha;
    }
    
    private static String lllllllllllllIl(final String llllllllllllIllllllIlIIlIIIllllI, final String llllllllllllIllllllIlIIlIIIllIll) {
        try {
            final SecretKeySpec llllllllllllIllllllIlIIlIIlIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIlIIlIIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllllIlIIlIIlIIIII = Cipher.getInstance("Blowfish");
            llllllllllllIllllllIlIIlIIlIIIII.init(EntityFX.lIllIlllIIIlIl[4], llllllllllllIllllllIlIIlIIlIIIIl);
            return new String(llllllllllllIllllllIlIIlIIlIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIlIIlIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllIlIIlIIIlllll) {
            llllllllllllIllllllIlIIlIIIlllll.printStackTrace();
            return null;
        }
    }
    
    public float getBlueColorF() {
        return this.particleBlue;
    }
    
    public void setParticleIcon(final TextureAtlasSprite llllllllllllIllllllIlIIlIlIlllIl) {
        final int llllllllllllIllllllIlIIlIllIIIIl = this.getFXLayer();
        if (!lIIIIIIIIIIIllIl(llllllllllllIllllllIlIIlIllIIIIl, EntityFX.lIllIlllIIIlIl[1])) {
            throw new RuntimeException(EntityFX.lIllIlllIIIIll[EntityFX.lIllIlllIIIlIl[0]]);
        }
        this.particleIcon = llllllllllllIllllllIlIIlIlIlllIl;
        "".length();
        if (-" ".length() > 0) {
            return;
        }
    }
    
    public int getFXLayer() {
        return EntityFX.lIllIlllIIIlIl[0];
    }
    
    public EntityFX multiplyVelocity(final float llllllllllllIllllllIlIIlllIlllII) {
        this.motionX *= llllllllllllIllllllIlIIlllIlllII;
        this.motionY = (this.motionY - 0.10000000149011612) * llllllllllllIllllllIlIIlllIlllII + 0.10000000149011612;
        this.motionZ *= llllllllllllIllllllIlIIlllIlllII;
        return this;
    }
    
    private static boolean lIIIIIIIIIIIllII(final Object llllllllllllIllllllIlIIlIIIIlIll) {
        return llllllllllllIllllllIlIIlIIIIlIll != null;
    }
    
    private static int lIIIIIIIIIIIIllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void writeEntityToNBT(final NBTTagCompound llllllllllllIllllllIlIIlIllIllll) {
    }
    
    public float getRedColorF() {
        return this.particleRed;
    }
    
    public void readEntityFromNBT(final NBTTagCompound llllllllllllIllllllIlIIlIllIllIl) {
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder(String.valueOf(this.getClass().getSimpleName())).append(EntityFX.lIllIlllIIIIll[EntityFX.lIllIlllIIIlIl[4]]).append(this.posX).append(EntityFX.lIllIlllIIIIll[EntityFX.lIllIlllIIIlIl[5]]).append(this.posY).append(EntityFX.lIllIlllIIIIll[EntityFX.lIllIlllIIIlIl[6]]).append(this.posZ).append(EntityFX.lIllIlllIIIIll[EntityFX.lIllIlllIIIlIl[7]]).append(this.particleRed).append(EntityFX.lIllIlllIIIIll[EntityFX.lIllIlllIIIlIl[8]]).append(this.particleGreen).append(EntityFX.lIllIlllIIIIll[EntityFX.lIllIlllIIIlIl[9]]).append(this.particleBlue).append(EntityFX.lIllIlllIIIIll[EntityFX.lIllIlllIIIlIl[10]]).append(this.particleAlpha).append(EntityFX.lIllIlllIIIIll[EntityFX.lIllIlllIIIlIl[11]]).append(this.particleAge));
    }
    
    private static void lIIIIIIIIIIIIlIl() {
        (lIllIlllIIIlIl = new int[13])[0] = ((0x31 ^ 0x1C) & ~(0x4D ^ 0x60));
        EntityFX.lIllIlllIIIlIl[1] = " ".length();
        EntityFX.lIllIlllIIIlIl[2] = (0x11 ^ 0x1);
        EntityFX.lIllIlllIIIlIl[3] = (-1 & 0xFFFF);
        EntityFX.lIllIlllIIIlIl[4] = "  ".length();
        EntityFX.lIllIlllIIIlIl[5] = "   ".length();
        EntityFX.lIllIlllIIIlIl[6] = (0x6C ^ 0x68);
        EntityFX.lIllIlllIIIlIl[7] = (0x6A ^ 0x6F);
        EntityFX.lIllIlllIIIlIl[8] = (0x78 ^ 0x7D ^ "   ".length());
        EntityFX.lIllIlllIIIlIl[9] = (0xAA ^ 0xAD);
        EntityFX.lIllIlllIIIlIl[10] = (135 + 118 - 209 + 141 ^ 84 + 8 - 17 + 102);
        EntityFX.lIllIlllIIIlIl[11] = (0x92 ^ 0x9B);
        EntityFX.lIllIlllIIIlIl[12] = (0x49 ^ 0x6A ^ (0xEA ^ 0xC3));
    }
    
    private static void llllllllllllllI() {
        (lIllIlllIIIIll = new String[EntityFX.lIllIlllIIIlIl[12]])[EntityFX.lIllIlllIIIlIl[0]] = llllllllllllIll("z2BNDdXN4MGN5FP1JoiulQmo879tQZ0vDI4MPVOjSvqXP7z2WpQxhXrcA8h3niTXNSRK8FV3q1o=", "ByALp");
        EntityFX.lIllIlllIIIIll[EntityFX.lIllIlllIIIlIl[1]] = lllllllllllllII("HgEwDA4+C2YOAzsDZhkNdz8nHxY+DCoITCQKMiALJAwSCBo=", "WoFmb");
        EntityFX.lIllIlllIIIIll[EntityFX.lIllIlllIIIlIl[4]] = lllllllllllllII("Q3E/AiFPeQ==", "oQomR");
        EntityFX.lIllIlllIIIIll[EntityFX.lIllIlllIIIlIl[5]] = llllllllllllIll("CZLKnAZ1KqI=", "mGFRV");
        EntityFX.lIllIlllIIIIll[EntityFX.lIllIlllIIIlIl[6]] = lllllllllllllII("RA==", "hPwOZ");
        EntityFX.lIllIlllIIIIll[EntityFX.lIllIlllIIIlIl[7]] = lllllllllllllIl("pDl1+IK9gX0bvGo3jG8PgA==", "XqVbv");
        EntityFX.lIllIlllIIIIll[EntityFX.lIllIlllIIIlIl[8]] = lllllllllllllIl("bpk/+o8/2T8=", "YkxJH");
        EntityFX.lIllIlllIIIIll[EntityFX.lIllIlllIIIlIl[9]] = lllllllllllllII("SQ==", "eeBnH");
        EntityFX.lIllIlllIIIIll[EntityFX.lIllIlllIIIlIl[10]] = lllllllllllllIl("/8jSc97yWvs=", "SlHTZ");
        EntityFX.lIllIlllIIIIll[EntityFX.lIllIlllIIIlIl[11]] = lllllllllllllII("QGVyFCYMaQ==", "iIRUA");
    }
    
    private static boolean lIIIIIIIIIIIlllI(final int llllllllllllIllllllIlIIlIIIIlllI, final int llllllllllllIllllllIlIIlIIIIllIl) {
        return llllllllllllIllllllIlIIlIIIIlllI < llllllllllllIllllllIlIIlIIIIllIl;
    }
    
    public void setAlphaF(final float llllllllllllIllllllIlIIlllIIIIlI) {
        if (lIIIIIIIIIIIlIII(lIIIIIIIIIIIIllI(this.particleAlpha, 1.0f)) && lIIIIIIIIIIIlIIl(lIIIIIIIIIIIIlll(llllllllllllIllllllIlIIlllIIIIlI, 1.0f))) {
            Minecraft.getMinecraft().effectRenderer.moveToAlphaLayer(this);
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lIIIIIIIIIIIlIIl(lIIIIIIIIIIIIlll(this.particleAlpha, 1.0f)) && lIIIIIIIIIIIlIII(lIIIIIIIIIIIIllI(llllllllllllIllllllIlIIlllIIIIlI, 1.0f))) {
            Minecraft.getMinecraft().effectRenderer.moveToNoAlphaLayer(this);
        }
        this.particleAlpha = llllllllllllIllllllIlIIlllIIIIlI;
    }
    
    private static String lllllllllllllII(String llllllllllllIllllllIlIIlIIlllIll, final String llllllllllllIllllllIlIIlIIllllll) {
        llllllllllllIllllllIlIIlIIlllIll = new String(Base64.getDecoder().decode(llllllllllllIllllllIlIIlIIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllllIlIIlIIlllllI = new StringBuilder();
        final char[] llllllllllllIllllllIlIIlIIllllIl = llllllllllllIllllllIlIIlIIllllll.toCharArray();
        int llllllllllllIllllllIlIIlIIllllII = EntityFX.lIllIlllIIIlIl[0];
        final short llllllllllllIllllllIlIIlIIllIllI = (Object)llllllllllllIllllllIlIIlIIlllIll.toCharArray();
        final Exception llllllllllllIllllllIlIIlIIllIlIl = (Exception)llllllllllllIllllllIlIIlIIllIllI.length;
        int llllllllllllIllllllIlIIlIIllIlII = EntityFX.lIllIlllIIIlIl[0];
        while (lIIIIIIIIIIIlllI(llllllllllllIllllllIlIIlIIllIlII, (int)llllllllllllIllllllIlIIlIIllIlIl)) {
            final char llllllllllllIllllllIlIIlIlIIIIIl = llllllllllllIllllllIlIIlIIllIllI[llllllllllllIllllllIlIIlIIllIlII];
            llllllllllllIllllllIlIIlIIlllllI.append((char)(llllllllllllIllllllIlIIlIlIIIIIl ^ llllllllllllIllllllIlIIlIIllllIl[llllllllllllIllllllIlIIlIIllllII % llllllllllllIllllllIlIIlIIllllIl.length]));
            "".length();
            ++llllllllllllIllllllIlIIlIIllllII;
            ++llllllllllllIllllllIlIIlIIllIlII;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllllIlIIlIIlllllI);
    }
    
    private static boolean lIIIIIIIIIIIlIIl(final int llllllllllllIllllllIlIIlIIIIIlIl) {
        return llllllllllllIllllllIlIIlIIIIIlIl < 0;
    }
    
    private static boolean lIIIIIIIIIIIlIll(final int llllllllllllIllllllIlIIlIIIIlIIl) {
        return llllllllllllIllllllIlIIlIIIIlIIl != 0;
    }
    
    private static String llllllllllllIll(final String llllllllllllIllllllIlIIlIIlIlIll, final String llllllllllllIllllllIlIIlIIlIlIlI) {
        try {
            final SecretKeySpec llllllllllllIllllllIlIIlIIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIlIIlIIlIlIlI.getBytes(StandardCharsets.UTF_8)), EntityFX.lIllIlllIIIlIl[10]), "DES");
            final Cipher llllllllllllIllllllIlIIlIIlIllIl = Cipher.getInstance("DES");
            llllllllllllIllllllIlIIlIIlIllIl.init(EntityFX.lIllIlllIIIlIl[4], llllllllllllIllllllIlIIlIIlIlllI);
            return new String(llllllllllllIllllllIlIIlIIlIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIlIIlIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllIlIIlIIlIllII) {
            llllllllllllIllllllIlIIlIIlIllII.printStackTrace();
            return null;
        }
    }
    
    public void setRBGColorF(final float llllllllllllIllllllIlIIlllIIlIlI, final float llllllllllllIllllllIlIIlllIIllIl, final float llllllllllllIllllllIlIIlllIIlIII) {
        this.particleRed = llllllllllllIllllllIlIIlllIIlIlI;
        this.particleGreen = llllllllllllIllllllIlIIlllIIllIl;
        this.particleBlue = llllllllllllIllllllIlIIlllIIlIII;
    }
    
    @Override
    protected boolean canTriggerWalking() {
        return EntityFX.lIllIlllIIIlIl[0] != 0;
    }
    
    private static int lIIIIIIIIIIIIlll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public boolean canAttackWithItem() {
        return EntityFX.lIllIlllIIIlIl[0] != 0;
    }
    
    private static boolean lIIIIIIIIIIIllIl(final int llllllllllllIllllllIlIIlIIIlIllI, final int llllllllllllIllllllIlIIlIIIlIlIl) {
        return llllllllllllIllllllIlIIlIIIlIllI == llllllllllllIllllllIlIIlIIIlIlIl;
    }
    
    public EntityFX multipleParticleScaleBy(final float llllllllllllIllllllIlIIlllIlIllI) {
        this.setSize(0.2f * llllllllllllIllllllIlIIlllIlIllI, 0.2f * llllllllllllIllllllIlIIlllIlIllI);
        this.particleScale *= llllllllllllIllllllIlIIlllIlIllI;
        return this;
    }
    
    public void renderParticle(final WorldRenderer llllllllllllIllllllIlIIllIIlllII, final Entity llllllllllllIllllllIlIIllIIllIll, final float llllllllllllIllllllIlIIllIIIIlll, final float llllllllllllIllllllIlIIllIIIIllI, final float llllllllllllIllllllIlIIllIIllIII, final float llllllllllllIllllllIlIIllIIIIlII, final float llllllllllllIllllllIlIIllIIlIllI, final float llllllllllllIllllllIlIIllIIlIlIl) {
        float llllllllllllIllllllIlIIllIIlIlII = this.particleTextureIndexX / 16.0f;
        float llllllllllllIllllllIlIIllIIlIIll = llllllllllllIllllllIlIIllIIlIlII + 0.0624375f;
        float llllllllllllIllllllIlIIllIIlIIlI = this.particleTextureIndexY / 16.0f;
        float llllllllllllIllllllIlIIllIIlIIIl = llllllllllllIllllllIlIIllIIlIIlI + 0.0624375f;
        final float llllllllllllIllllllIlIIllIIlIIII = 0.1f * this.particleScale;
        if (lIIIIIIIIIIIllII(this.particleIcon)) {
            llllllllllllIllllllIlIIllIIlIlII = this.particleIcon.getMinU();
            llllllllllllIllllllIlIIllIIlIIll = this.particleIcon.getMaxU();
            llllllllllllIllllllIlIIllIIlIIlI = this.particleIcon.getMinV();
            llllllllllllIllllllIlIIllIIlIIIl = this.particleIcon.getMaxV();
        }
        final float llllllllllllIllllllIlIIllIIIllll = (float)(this.prevPosX + (this.posX - this.prevPosX) * llllllllllllIllllllIlIIllIIIIlll - EntityFX.interpPosX);
        final float llllllllllllIllllllIlIIllIIIlllI = (float)(this.prevPosY + (this.posY - this.prevPosY) * llllllllllllIllllllIlIIllIIIIlll - EntityFX.interpPosY);
        final float llllllllllllIllllllIlIIllIIIllIl = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * llllllllllllIllllllIlIIllIIIIlll - EntityFX.interpPosZ);
        final int llllllllllllIllllllIlIIllIIIllII = this.getBrightnessForRender(llllllllllllIllllllIlIIllIIIIlll);
        final int llllllllllllIllllllIlIIllIIIlIll = llllllllllllIllllllIlIIllIIIllII >> EntityFX.lIllIlllIIIlIl[2] & EntityFX.lIllIlllIIIlIl[3];
        final int llllllllllllIllllllIlIIllIIIlIlI = llllllllllllIllllllIlIIllIIIllII & EntityFX.lIllIlllIIIlIl[3];
        llllllllllllIllllllIlIIllIIlllII.pos(llllllllllllIllllllIlIIllIIIllll - llllllllllllIllllllIlIIllIIIIllI * llllllllllllIllllllIlIIllIIlIIII - llllllllllllIllllllIlIIllIIlIllI * llllllllllllIllllllIlIIllIIlIIII, llllllllllllIllllllIlIIllIIIlllI - llllllllllllIllllllIlIIllIIllIII * llllllllllllIllllllIlIIllIIlIIII, llllllllllllIllllllIlIIllIIIllIl - llllllllllllIllllllIlIIllIIIIlII * llllllllllllIllllllIlIIllIIlIIII - llllllllllllIllllllIlIIllIIlIlIl * llllllllllllIllllllIlIIllIIlIIII).tex(llllllllllllIllllllIlIIllIIlIIll, llllllllllllIllllllIlIIllIIlIIIl).color(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(llllllllllllIllllllIlIIllIIIlIll, llllllllllllIllllllIlIIllIIIlIlI).endVertex();
        llllllllllllIllllllIlIIllIIlllII.pos(llllllllllllIllllllIlIIllIIIllll - llllllllllllIllllllIlIIllIIIIllI * llllllllllllIllllllIlIIllIIlIIII + llllllllllllIllllllIlIIllIIlIllI * llllllllllllIllllllIlIIllIIlIIII, llllllllllllIllllllIlIIllIIIlllI + llllllllllllIllllllIlIIllIIllIII * llllllllllllIllllllIlIIllIIlIIII, llllllllllllIllllllIlIIllIIIllIl - llllllllllllIllllllIlIIllIIIIlII * llllllllllllIllllllIlIIllIIlIIII + llllllllllllIllllllIlIIllIIlIlIl * llllllllllllIllllllIlIIllIIlIIII).tex(llllllllllllIllllllIlIIllIIlIIll, llllllllllllIllllllIlIIllIIlIIlI).color(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(llllllllllllIllllllIlIIllIIIlIll, llllllllllllIllllllIlIIllIIIlIlI).endVertex();
        llllllllllllIllllllIlIIllIIlllII.pos(llllllllllllIllllllIlIIllIIIllll + llllllllllllIllllllIlIIllIIIIllI * llllllllllllIllllllIlIIllIIlIIII + llllllllllllIllllllIlIIllIIlIllI * llllllllllllIllllllIlIIllIIlIIII, llllllllllllIllllllIlIIllIIIlllI + llllllllllllIllllllIlIIllIIllIII * llllllllllllIllllllIlIIllIIlIIII, llllllllllllIllllllIlIIllIIIllIl + llllllllllllIllllllIlIIllIIIIlII * llllllllllllIllllllIlIIllIIlIIII + llllllllllllIllllllIlIIllIIlIlIl * llllllllllllIllllllIlIIllIIlIIII).tex(llllllllllllIllllllIlIIllIIlIlII, llllllllllllIllllllIlIIllIIlIIlI).color(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(llllllllllllIllllllIlIIllIIIlIll, llllllllllllIllllllIlIIllIIIlIlI).endVertex();
        llllllllllllIllllllIlIIllIIlllII.pos(llllllllllllIllllllIlIIllIIIllll + llllllllllllIllllllIlIIllIIIIllI * llllllllllllIllllllIlIIllIIlIIII - llllllllllllIllllllIlIIllIIlIllI * llllllllllllIllllllIlIIllIIlIIII, llllllllllllIllllllIlIIllIIIlllI - llllllllllllIllllllIlIIllIIllIII * llllllllllllIllllllIlIIllIIlIIII, llllllllllllIllllllIlIIllIIIllIl + llllllllllllIllllllIlIIllIIIIlII * llllllllllllIllllllIlIIllIIlIIII - llllllllllllIllllllIlIIllIIlIlIl * llllllllllllIllllllIlIIllIIlIIII).tex(llllllllllllIllllllIlIIllIIlIlII, llllllllllllIllllllIlIIllIIlIIIl).color(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(llllllllllllIllllllIlIIllIIIlIll, llllllllllllIllllllIlIIllIIIlIlI).endVertex();
    }
    
    static {
        lIIIIIIIIIIIIlIl();
        llllllllllllllI();
    }
    
    public EntityFX(final World llllllllllllIllllllIlIIllllIlIII, final double llllllllllllIllllllIlIIlllllIIIl, final double llllllllllllIllllllIlIIlllllIIII, final double llllllllllllIllllllIlIIllllIllll, final double llllllllllllIllllllIlIIllllIIlII, final double llllllllllllIllllllIlIIllllIllIl, final double llllllllllllIllllllIlIIllllIIIlI) {
        this(llllllllllllIllllllIlIIllllIlIII, llllllllllllIllllllIlIIlllllIIIl, llllllllllllIllllllIlIIlllllIIII, llllllllllllIllllllIlIIllllIllll);
        this.motionX = llllllllllllIllllllIlIIllllIIlII + (Math.random() * 2.0 - 1.0) * 0.4000000059604645;
        this.motionY = llllllllllllIllllllIlIIllllIllIl + (Math.random() * 2.0 - 1.0) * 0.4000000059604645;
        this.motionZ = llllllllllllIllllllIlIIllllIIIlI + (Math.random() * 2.0 - 1.0) * 0.4000000059604645;
        final float llllllllllllIllllllIlIIllllIlIll = (float)(Math.random() + Math.random() + 1.0) * 0.15f;
        final float llllllllllllIllllllIlIIllllIlIlI = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
        this.motionX = this.motionX / llllllllllllIllllllIlIIllllIlIlI * llllllllllllIllllllIlIIllllIlIll * 0.4000000059604645;
        this.motionY = this.motionY / llllllllllllIllllllIlIIllllIlIlI * llllllllllllIllllllIlIIllllIlIll * 0.4000000059604645 + 0.10000000149011612;
        this.motionZ = this.motionZ / llllllllllllIllllllIlIIllllIlIlI * llllllllllllIllllllIlIIllllIlIll * 0.4000000059604645;
    }
    
    private static boolean lIIIIIIIIIIIlIlI(final int llllllllllllIllllllIlIIlIIIlIIlI, final int llllllllllllIllllllIlIIlIIIlIIIl) {
        return llllllllllllIllllllIlIIlIIIlIIlI >= llllllllllllIllllllIlIIlIIIlIIIl;
    }
    
    public void nextTextureIndexX() {
        this.particleTextureIndexX += EntityFX.lIllIlllIIIlIl[1];
    }
}
