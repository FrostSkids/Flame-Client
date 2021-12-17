// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.util.AxisAlignedBB;
import java.util.Arrays;
import net.minecraft.item.ItemDye;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.util.MathHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.nbt.NBTTagList;

public class EntityFirework
{
    public static class StarterFX extends EntityFX
    {
        /* synthetic */ boolean twinkle;
        private /* synthetic */ int fireworkAge;
        private /* synthetic */ NBTTagList fireworkExplosions;
        private final /* synthetic */ EffectRenderer theEffectRenderer;
        private static final /* synthetic */ int[] llIIllllIlIllI;
        private static final /* synthetic */ String[] llIIllllIlIIll;
        
        private static int lIIlIIIIIlIlIllI(final double n, final double n2) {
            return dcmpl(n, n2);
        }
        
        private static String lIIlIIIIIlIIIllI(final String llllllllllllIllIlllIlIIllllIIIll, final String llllllllllllIllIlllIlIIllllIIlII) {
            try {
                final SecretKeySpec llllllllllllIllIlllIlIIllllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIlIIllllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIlllIlIIllllIIlll = Cipher.getInstance("Blowfish");
                llllllllllllIllIlllIlIIllllIIlll.init(StarterFX.llIIllllIlIllI[3], llllllllllllIllIlllIlIIllllIlIII);
                return new String(llllllllllllIllIlllIlIIllllIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIlIIllllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlllIlIIllllIIllI) {
                llllllllllllIllIlllIlIIllllIIllI.printStackTrace();
                return null;
            }
        }
        
        static {
            lIIlIIIIIlIIlllI();
            lIIlIIIIIlIIlIll();
        }
        
        private void createParticle(final double llllllllllllIllIlllIlIlIlIlllIlI, final double llllllllllllIllIlllIlIlIlIlllIIl, final double llllllllllllIllIlllIlIlIlIlllIII, final double llllllllllllIllIlllIlIlIlIllIlll, final double llllllllllllIllIlllIlIlIllIIIIll, final double llllllllllllIllIlllIlIlIllIIIIlI, final int[] llllllllllllIllIlllIlIlIlIllIlII, final int[] llllllllllllIllIlllIlIlIlIllIIll, final boolean llllllllllllIllIlllIlIlIlIllIIlI, final boolean llllllllllllIllIlllIlIlIlIlllllI) {
            final SparkFX llllllllllllIllIlllIlIlIlIllllIl = new SparkFX(this.worldObj, llllllllllllIllIlllIlIlIlIlllIlI, llllllllllllIllIlllIlIlIlIlllIIl, llllllllllllIllIlllIlIlIlIlllIII, llllllllllllIllIlllIlIlIlIllIlll, llllllllllllIllIlllIlIlIllIIIIll, llllllllllllIllIlllIlIlIllIIIIlI, this.theEffectRenderer);
            llllllllllllIllIlllIlIlIlIllllIl.setAlphaF(0.99f);
            llllllllllllIllIlllIlIlIlIllllIl.setTrail(llllllllllllIllIlllIlIlIlIllIIlI);
            llllllllllllIllIlllIlIlIlIllllIl.setTwinkle(llllllllllllIllIlllIlIlIlIlllllI);
            final int llllllllllllIllIlllIlIlIlIllllII = this.rand.nextInt(llllllllllllIllIlllIlIlIlIllIlII.length);
            llllllllllllIllIlllIlIlIlIllllIl.setColour(llllllllllllIllIlllIlIlIlIllIlII[llllllllllllIllIlllIlIlIlIllllII]);
            if (lIIlIIIIIlIIllll(llllllllllllIllIlllIlIlIlIllIIll) && lIIlIIIIIlIllIII(llllllllllllIllIlllIlIlIlIllIIll.length)) {
                llllllllllllIllIlllIlIlIlIllllIl.setFadeColour(llllllllllllIllIlllIlIlIlIllIIll[this.rand.nextInt(llllllllllllIllIlllIlIlIlIllIIll.length)]);
            }
            this.theEffectRenderer.addEffect(llllllllllllIllIlllIlIlIlIllllIl);
        }
        
        private static boolean lIIlIIIIIlIlIlIl(final int llllllllllllIllIlllIlIIlllIlIIIl, final int llllllllllllIllIlllIlIIlllIlIIII) {
            return llllllllllllIllIlllIlIIlllIlIIIl > llllllllllllIllIlllIlIIlllIlIIII;
        }
        
        private static boolean lIIlIIIIIlIllIIl(final int llllllllllllIllIlllIlIIlllIIIIll, final int llllllllllllIllIlllIlIIlllIIIIlI) {
            return llllllllllllIllIlllIlIIlllIIIIll != llllllllllllIllIlllIlIIlllIIIIlI;
        }
        
        private static boolean lIIlIIIIIlIlIIll(final int llllllllllllIllIlllIlIIlllIlllIl, final int llllllllllllIllIlllIlIIlllIlllII) {
            return llllllllllllIllIlllIlIIlllIlllIl == llllllllllllIllIlllIlIIlllIlllII;
        }
        
        private static void lIIlIIIIIlIIlllI() {
            (llIIllllIlIllI = new int[21])[0] = (0x62 ^ 0x6A);
            StarterFX.llIIllllIlIllI[1] = ((0x35 ^ 0x22) & ~(0x36 ^ 0x21));
            StarterFX.llIIllllIlIllI[2] = (0x51 ^ 0x5B);
            StarterFX.llIIllllIlIllI[3] = "  ".length();
            StarterFX.llIIllllIlIllI[4] = " ".length();
            StarterFX.llIIllllIlIllI[5] = (114 + 50 - 49 + 47 ^ 26 + 67 + 58 + 22);
            StarterFX.llIIllllIlIllI[6] = "   ".length();
            StarterFX.llIIllllIlIllI[7] = (0x54 ^ 0x36 ^ (0x24 ^ 0x42));
            StarterFX.llIIllllIlIllI[8] = (0xD ^ 0x6D ^ (0x34 ^ 0x51));
            StarterFX.llIIllllIlIllI[9] = (0xC0 ^ 0xC6);
            StarterFX.llIIllllIlIllI[10] = (0x12 ^ 0x15);
            StarterFX.llIIllllIlIllI[11] = (0x4F ^ 0x46);
            StarterFX.llIIllllIlIllI[12] = (0x5 ^ 0xE);
            StarterFX.llIIllllIlIllI[13] = (0x56 ^ 0x12 ^ (0xE5 ^ 0xAD));
            StarterFX.llIIllllIlIllI[14] = (-(0xFFFFECFF & 0x576F) & (0xFFFFF57F & 0xFF4EEE));
            StarterFX.llIIllllIlIllI[15] = (0x3D ^ 0x2D);
            StarterFX.llIIllllIlIllI[16] = (0xFFFFFF8C & 0xFF73);
            StarterFX.llIIllllIlIllI[17] = 251 + 67 - 75 + 12;
            StarterFX.llIIllllIlIllI[18] = (0x8A ^ 0x87);
            StarterFX.llIIllllIlIllI[19] = (0xB7 ^ 0xB1 ^ (0x39 ^ 0x31));
            StarterFX.llIIllllIlIllI[20] = (0xE0 ^ 0xA6);
        }
        
        public StarterFX(final World llllllllllllIllIlllIlIllIIlIlIIl, final double llllllllllllIllIlllIlIllIIlIlIII, final double llllllllllllIllIlllIlIllIIlIIlll, final double llllllllllllIllIlllIlIllIIIllIII, final double llllllllllllIllIlllIlIllIIIlIlll, final double llllllllllllIllIlllIlIllIIlIIlII, final double llllllllllllIllIlllIlIllIIlIIIll, final EffectRenderer llllllllllllIllIlllIlIllIIlIIIlI, final NBTTagCompound llllllllllllIllIlllIlIllIIIlIIll) {
            super(llllllllllllIllIlllIlIllIIlIlIIl, llllllllllllIllIlllIlIllIIlIlIII, llllllllllllIllIlllIlIllIIlIIlll, llllllllllllIllIlllIlIllIIIllIII, 0.0, 0.0, 0.0);
            this.motionX = llllllllllllIllIlllIlIllIIIlIlll;
            this.motionY = llllllllllllIllIlllIlIllIIlIIlII;
            this.motionZ = llllllllllllIllIlllIlIllIIlIIIll;
            this.theEffectRenderer = llllllllllllIllIlllIlIllIIlIIIlI;
            this.particleMaxAge = StarterFX.llIIllllIlIllI[0];
            if (lIIlIIIIIlIIllll(llllllllllllIllIlllIlIllIIIlIIll)) {
                this.fireworkExplosions = llllllllllllIllIlllIlIllIIIlIIll.getTagList(StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[1]], StarterFX.llIIllllIlIllI[2]);
                if (lIIlIIIIIlIlIIII(this.fireworkExplosions.tagCount())) {
                    this.fireworkExplosions = null;
                    "".length();
                    if (-" ".length() > (0x7E ^ 0x7A)) {
                        throw null;
                    }
                }
                else {
                    this.particleMaxAge = this.fireworkExplosions.tagCount() * StarterFX.llIIllllIlIllI[3] - StarterFX.llIIllllIlIllI[4];
                    int llllllllllllIllIlllIlIllIIlIIIII = StarterFX.llIIllllIlIllI[1];
                    "".length();
                    if (null != null) {
                        throw null;
                    }
                    while (!lIIlIIIIIlIlIIlI(llllllllllllIllIlllIlIllIIlIIIII, this.fireworkExplosions.tagCount())) {
                        final NBTTagCompound llllllllllllIllIlllIlIllIIIlllll = this.fireworkExplosions.getCompoundTagAt(llllllllllllIllIlllIlIllIIlIIIII);
                        if (lIIlIIIIIlIlIIIl(llllllllllllIllIlllIlIllIIIlllll.getBoolean(StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[4]]) ? 1 : 0)) {
                            this.twinkle = (StarterFX.llIIllllIlIllI[4] != 0);
                            this.particleMaxAge += StarterFX.llIIllllIlIllI[5];
                            "".length();
                            if (null != null) {
                                throw null;
                            }
                            break;
                        }
                        else {
                            ++llllllllllllIllIlllIlIllIIlIIIII;
                        }
                    }
                }
            }
        }
        
        private void createBurst(final int[] llllllllllllIllIlllIlIlIIIIlllII, final int[] llllllllllllIllIlllIlIlIIIIllIll, final boolean llllllllllllIllIlllIlIlIIIlIIlIl, final boolean llllllllllllIllIlllIlIlIIIIllIIl) {
            final double llllllllllllIllIlllIlIlIIIlIIIll = this.rand.nextGaussian() * 0.05;
            final double llllllllllllIllIlllIlIlIIIlIIIlI = this.rand.nextGaussian() * 0.05;
            int llllllllllllIllIlllIlIlIIIlIIIIl = StarterFX.llIIllllIlIllI[1];
            "".length();
            if (" ".length() >= "  ".length()) {
                return;
            }
            while (!lIIlIIIIIlIlIIlI(llllllllllllIllIlllIlIlIIIlIIIIl, StarterFX.llIIllllIlIllI[20])) {
                final double llllllllllllIllIlllIlIlIIIlIIIII = this.motionX * 0.5 + this.rand.nextGaussian() * 0.15 + llllllllllllIllIlllIlIlIIIlIIIll;
                final double llllllllllllIllIlllIlIlIIIIlllll = this.motionZ * 0.5 + this.rand.nextGaussian() * 0.15 + llllllllllllIllIlllIlIlIIIlIIIlI;
                final double llllllllllllIllIlllIlIlIIIIllllI = this.motionY * 0.5 + this.rand.nextDouble() * 0.5;
                this.createParticle(this.posX, this.posY, this.posZ, llllllllllllIllIlllIlIlIIIlIIIII, llllllllllllIllIlllIlIlIIIIllllI, llllllllllllIllIlllIlIlIIIIlllll, llllllllllllIllIlllIlIlIIIIlllII, llllllllllllIllIlllIlIlIIIIllIll, llllllllllllIllIlllIlIlIIIlIIlIl, llllllllllllIllIlllIlIlIIIIllIIl);
                ++llllllllllllIllIlllIlIlIIIlIIIIl;
            }
        }
        
        private void createShaped(final double llllllllllllIllIlllIlIlIIlIIlIIl, final double[][] llllllllllllIllIlllIlIlIIllIIIIl, final int[] llllllllllllIllIlllIlIlIIlIIIllI, final int[] llllllllllllIllIlllIlIlIIlIlllll, final boolean llllllllllllIllIlllIlIlIIlIIIIll, final boolean llllllllllllIllIlllIlIlIIlIlllIl, final boolean llllllllllllIllIlllIlIlIIlIIIIIl) {
            final double llllllllllllIllIlllIlIlIIlIllIll = llllllllllllIllIlllIlIlIIllIIIIl[StarterFX.llIIllllIlIllI[1]][StarterFX.llIIllllIlIllI[1]];
            final double llllllllllllIllIlllIlIlIIlIllIlI = llllllllllllIllIlllIlIlIIllIIIIl[StarterFX.llIIllllIlIllI[1]][StarterFX.llIIllllIlIllI[4]];
            this.createParticle(this.posX, this.posY, this.posZ, llllllllllllIllIlllIlIlIIlIllIll * llllllllllllIllIlllIlIlIIlIIlIIl, llllllllllllIllIlllIlIlIIlIllIlI * llllllllllllIllIlllIlIlIIlIIlIIl, 0.0, llllllllllllIllIlllIlIlIIlIIIllI, llllllllllllIllIlllIlIlIIlIlllll, llllllllllllIllIlllIlIlIIlIIIIll, llllllllllllIllIlllIlIlIIlIlllIl);
            final float llllllllllllIllIlllIlIlIIlIllIIl = this.rand.nextFloat() * 3.1415927f;
            double n;
            if (lIIlIIIIIlIlIIIl(llllllllllllIllIlllIlIlIIlIIIIIl ? 1 : 0)) {
                n = 0.034;
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                n = 0.34;
            }
            final double llllllllllllIllIlllIlIlIIlIllIII = n;
            int llllllllllllIllIlllIlIlIIlIlIlll = StarterFX.llIIllllIlIllI[1];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIlIIIIIlIlIIlI(llllllllllllIllIlllIlIlIIlIlIlll, StarterFX.llIIllllIlIllI[6])) {
                final double llllllllllllIllIlllIlIlIIlIlIllI = llllllllllllIllIlllIlIlIIlIllIIl + llllllllllllIllIlllIlIlIIlIlIlll * 3.1415927f * llllllllllllIllIlllIlIlIIlIllIII;
                double llllllllllllIllIlllIlIlIIlIlIlIl = llllllllllllIllIlllIlIlIIlIllIll;
                double llllllllllllIllIlllIlIlIIlIlIlII = llllllllllllIllIlllIlIlIIlIllIlI;
                int llllllllllllIllIlllIlIlIIlIlIIll = StarterFX.llIIllllIlIllI[4];
                "".length();
                if ((0x13 ^ 0x17) < 0) {
                    return;
                }
                while (!lIIlIIIIIlIlIIlI(llllllllllllIllIlllIlIlIIlIlIIll, llllllllllllIllIlllIlIlIIllIIIIl.length)) {
                    final double llllllllllllIllIlllIlIlIIlIlIIlI = llllllllllllIllIlllIlIlIIllIIIIl[llllllllllllIllIlllIlIlIIlIlIIll][StarterFX.llIIllllIlIllI[1]];
                    final double llllllllllllIllIlllIlIlIIlIlIIIl = llllllllllllIllIlllIlIlIIllIIIIl[llllllllllllIllIlllIlIlIIlIlIIll][StarterFX.llIIllllIlIllI[4]];
                    double llllllllllllIllIlllIlIlIIlIlIIII = 0.25;
                    "".length();
                    if ((40 + 58 - 46 + 142 ^ 96 + 151 - 236 + 187) != (0x97 ^ 0xAC ^ (0xF9 ^ 0xC6))) {
                        return;
                    }
                    while (!lIIlIIIIIlIllIII(lIIlIIIIIlIllIlI(llllllllllllIllIlllIlIlIIlIlIIII, 1.0))) {
                        double llllllllllllIllIlllIlIlIIlIIllll = (llllllllllllIllIlllIlIlIIlIlIlIl + (llllllllllllIllIlllIlIlIIlIlIIlI - llllllllllllIllIlllIlIlIIlIlIlIl) * llllllllllllIllIlllIlIlIIlIlIIII) * llllllllllllIllIlllIlIlIIlIIlIIl;
                        final double llllllllllllIllIlllIlIlIIlIIlllI = (llllllllllllIllIlllIlIlIIlIlIlII + (llllllllllllIllIlllIlIlIIlIlIIIl - llllllllllllIllIlllIlIlIIlIlIlII) * llllllllllllIllIlllIlIlIIlIlIIII) * llllllllllllIllIlllIlIlIIlIIlIIl;
                        final double llllllllllllIllIlllIlIlIIlIIllIl = llllllllllllIllIlllIlIlIIlIIllll * Math.sin(llllllllllllIllIlllIlIlIIlIlIllI);
                        llllllllllllIllIlllIlIlIIlIIllll *= Math.cos(llllllllllllIllIlllIlIlIIlIlIllI);
                        double llllllllllllIllIlllIlIlIIlIIllII = -1.0;
                        "".length();
                        if (null != null) {
                            return;
                        }
                        while (!lIIlIIIIIlIllIII(lIIlIIIIIlIllIlI(llllllllllllIllIlllIlIlIIlIIllII, 1.0))) {
                            this.createParticle(this.posX, this.posY, this.posZ, llllllllllllIllIlllIlIlIIlIIllll * llllllllllllIllIlllIlIlIIlIIllII, llllllllllllIllIlllIlIlIIlIIlllI, llllllllllllIllIlllIlIlIIlIIllIl * llllllllllllIllIlllIlIlIIlIIllII, llllllllllllIllIlllIlIlIIlIIIllI, llllllllllllIllIlllIlIlIIlIlllll, llllllllllllIllIlllIlIlIIlIIIIll, llllllllllllIllIlllIlIlIIlIlllIl);
                            llllllllllllIllIlllIlIlIIlIIllII += 2.0;
                        }
                        llllllllllllIllIlllIlIlIIlIlIIII += 0.25;
                    }
                    llllllllllllIllIlllIlIlIIlIlIlIl = llllllllllllIllIlllIlIlIIlIlIIlI;
                    llllllllllllIllIlllIlIlIIlIlIlII = llllllllllllIllIlllIlIlIIlIlIIIl;
                    ++llllllllllllIllIlllIlIlIIlIlIIll;
                }
                ++llllllllllllIllIlllIlIlIIlIlIlll;
            }
        }
        
        private static boolean lIIlIIIIIlIllIII(final int llllllllllllIllIlllIlIIlllIIIllI) {
            return llllllllllllIllIlllIlIIlllIIIllI > 0;
        }
        
        private static boolean lIIlIIIIIlIlIlII(final int llllllllllllIllIlllIlIIlllIlIlIl, final int llllllllllllIllIlllIlIIlllIlIlII) {
            return llllllllllllIllIlllIlIIlllIlIlIl < llllllllllllIllIlllIlIIlllIlIlII;
        }
        
        private static void lIIlIIIIIlIIlIll() {
            (llIIllllIlIIll = new String[StarterFX.llIIllllIlIllI[15]])[StarterFX.llIIllllIlIllI[1]] = lIIlIIIIIIllllIl("KBkHGSoeCBgbNg==", "mawuE");
            StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[4]] = lIIlIIIIIIlllllI("oOwNxTYCwY8=", "XXBHV");
            StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[3]] = lIIlIIIIIIlllllI("NhSt3Hrhp1w=", "zMVIc");
            StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[6]] = lIIlIIIIIIlllllI("BMGYtbABYZ4jIuCqW4zEPQ==", "vQcBB");
            StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[7]] = lIIlIIIIIlIIIllI("S65SObss79WPNqykujldQw==", "TqzWn");
            StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[8]] = lIIlIIIIIIllllIl("JgYwBwE=", "DjQtu");
            StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[9]] = lIIlIIIIIlIIIllI("oGNewdI5Hy8=", "nRmrp");
            StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[10]] = lIIlIIIIIIlllllI("He8cra+RUIc=", "vWWxM");
            StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[0]] = lIIlIIIIIIlllllI("K5B5LOPBVL8=", "MKaLf");
            StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[11]] = lIIlIIIIIIllllIl("MR4oMQg=", "elIXd");
            StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[2]] = lIIlIIIIIIllllIl("PDYDDhMfKA==", "zZjmx");
            StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[12]] = lIIlIIIIIlIIIllI("nqyD5wfnv6c=", "BIdJN");
            StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[13]] = lIIlIIIIIlIIIllI("t6lh5NZxxRLi/RVsyciNxQ==", "mtSzm");
            StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[18]] = lIIlIIIIIlIIIllI("qq117cMMuFkjSHMojiDKHw==", "ikmoP");
            StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[19]] = lIIlIIIIIlIIIllI("fYKAi5zwHZc9Fl+zrW6CYw==", "PtcFs");
            StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[5]] = lIIlIIIIIlIIIllI("Mb7zsVy/umM=", "kxMQI");
        }
        
        private static boolean lIIlIIIIIlIlIIII(final int llllllllllllIllIlllIlIIlllIIlIlI) {
            return llllllllllllIllIlllIlIIlllIIlIlI == 0;
        }
        
        private static boolean lIIlIIIIIlIIllll(final Object llllllllllllIllIlllIlIIlllIIlllI) {
            return llllllllllllIllIlllIlIIlllIIlllI != null;
        }
        
        private static boolean lIIlIIIIIlIlIIlI(final int llllllllllllIllIlllIlIIlllIllIIl, final int llllllllllllIllIlllIlIIlllIllIII) {
            return llllllllllllIllIlllIlIIlllIllIIl >= llllllllllllIllIlllIlIIlllIllIII;
        }
        
        private boolean func_92037_i() {
            final Minecraft llllllllllllIllIlllIlIlIllIllIII = Minecraft.getMinecraft();
            if (lIIlIIIIIlIIllll(llllllllllllIllIlllIlIlIllIllIII) && lIIlIIIIIlIIllll(llllllllllllIllIlllIlIlIllIllIII.getRenderViewEntity()) && lIIlIIIIIlIlIlll(lIIlIIIIIlIlIllI(llllllllllllIllIlllIlIlIllIllIII.getRenderViewEntity().getDistanceSq(this.posX, this.posY, this.posZ), 256.0))) {
                return StarterFX.llIIllllIlIllI[1] != 0;
            }
            return StarterFX.llIIllllIlIllI[4] != 0;
        }
        
        private void createBall(final double llllllllllllIllIlllIlIlIlIIlllII, final int llllllllllllIllIlllIlIlIlIIIlIlI, final int[] llllllllllllIllIlllIlIlIlIIllIlI, final int[] llllllllllllIllIlllIlIlIlIIIlIII, final boolean llllllllllllIllIlllIlIlIlIIIIlll, final boolean llllllllllllIllIlllIlIlIlIIlIlll) {
            final double llllllllllllIllIlllIlIlIlIIlIllI = this.posX;
            final double llllllllllllIllIlllIlIlIlIIlIlIl = this.posY;
            final double llllllllllllIllIlllIlIlIlIIlIlII = this.posZ;
            int llllllllllllIllIlllIlIlIlIIlIIll = -llllllllllllIllIlllIlIlIlIIIlIlI;
            "".length();
            if ((0x51 ^ 0x55) <= -" ".length()) {
                return;
            }
            while (!lIIlIIIIIlIlIlIl(llllllllllllIllIlllIlIlIlIIlIIll, llllllllllllIllIlllIlIlIlIIIlIlI)) {
                int llllllllllllIllIlllIlIlIlIIlIIlI = -llllllllllllIllIlllIlIlIlIIIlIlI;
                "".length();
                if ("  ".length() == ((0xE8 ^ 0x91 ^ (0x3A ^ 0x6C)) & (0x9B ^ 0xBD ^ (0x65 ^ 0x6C) ^ -" ".length()))) {
                    return;
                }
                while (!lIIlIIIIIlIlIlIl(llllllllllllIllIlllIlIlIlIIlIIlI, llllllllllllIllIlllIlIlIlIIIlIlI)) {
                    int llllllllllllIllIlllIlIlIlIIlIIIl = -llllllllllllIllIlllIlIlIlIIIlIlI;
                    "".length();
                    if (" ".length() <= -" ".length()) {
                        return;
                    }
                    while (!lIIlIIIIIlIlIlIl(llllllllllllIllIlllIlIlIlIIlIIIl, llllllllllllIllIlllIlIlIlIIIlIlI)) {
                        final double llllllllllllIllIlllIlIlIlIIlIIII = llllllllllllIllIlllIlIlIlIIlIIlI + (this.rand.nextDouble() - this.rand.nextDouble()) * 0.5;
                        final double llllllllllllIllIlllIlIlIlIIIllll = llllllllllllIllIlllIlIlIlIIlIIll + (this.rand.nextDouble() - this.rand.nextDouble()) * 0.5;
                        final double llllllllllllIllIlllIlIlIlIIIlllI = llllllllllllIllIlllIlIlIlIIlIIIl + (this.rand.nextDouble() - this.rand.nextDouble()) * 0.5;
                        final double llllllllllllIllIlllIlIlIlIIIllIl = MathHelper.sqrt_double(llllllllllllIllIlllIlIlIlIIlIIII * llllllllllllIllIlllIlIlIlIIlIIII + llllllllllllIllIlllIlIlIlIIIllll * llllllllllllIllIlllIlIlIlIIIllll + llllllllllllIllIlllIlIlIlIIIlllI * llllllllllllIllIlllIlIlIlIIIlllI) / llllllllllllIllIlllIlIlIlIIlllII + this.rand.nextGaussian() * 0.05;
                        this.createParticle(llllllllllllIllIlllIlIlIlIIlIllI, llllllllllllIllIlllIlIlIlIIlIlIl, llllllllllllIllIlllIlIlIlIIlIlII, llllllllllllIllIlllIlIlIlIIlIIII / llllllllllllIllIlllIlIlIlIIIllIl, llllllllllllIllIlllIlIlIlIIIllll / llllllllllllIllIlllIlIlIlIIIllIl, llllllllllllIllIlllIlIlIlIIIlllI / llllllllllllIllIlllIlIlIlIIIllIl, llllllllllllIllIlllIlIlIlIIllIlI, llllllllllllIllIlllIlIlIlIIIlIII, llllllllllllIllIlllIlIlIlIIIIlll, llllllllllllIllIlllIlIlIlIIlIlll);
                        if (lIIlIIIIIlIllIIl(llllllllllllIllIlllIlIlIlIIlIIll, -llllllllllllIllIlllIlIlIlIIIlIlI) && lIIlIIIIIlIllIIl(llllllllllllIllIlllIlIlIlIIlIIll, llllllllllllIllIlllIlIlIlIIIlIlI) && lIIlIIIIIlIllIIl(llllllllllllIllIlllIlIlIlIIlIIlI, -llllllllllllIllIlllIlIlIlIIIlIlI) && lIIlIIIIIlIllIIl(llllllllllllIllIlllIlIlIlIIlIIlI, llllllllllllIllIlllIlIlIlIIIlIlI)) {
                            llllllllllllIllIlllIlIlIlIIlIIIl += llllllllllllIllIlllIlIlIlIIIlIlI * StarterFX.llIIllllIlIllI[3] - StarterFX.llIIllllIlIllI[4];
                        }
                        ++llllllllllllIllIlllIlIlIlIIlIIIl;
                    }
                    ++llllllllllllIllIlllIlIlIlIIlIIlI;
                }
                ++llllllllllllIllIlllIlIlIlIIlIIll;
            }
        }
        
        @Override
        public void renderParticle(final WorldRenderer llllllllllllIllIlllIlIllIIIlIIIl, final Entity llllllllllllIllIlllIlIllIIIlIIII, final float llllllllllllIllIlllIlIllIIIIllll, final float llllllllllllIllIlllIlIllIIIIlllI, final float llllllllllllIllIlllIlIllIIIIllIl, final float llllllllllllIllIlllIlIllIIIIllII, final float llllllllllllIllIlllIlIllIIIIlIll, final float llllllllllllIllIlllIlIllIIIIlIlI) {
        }
        
        @Override
        public void onUpdate() {
            if (lIIlIIIIIlIlIIII(this.fireworkAge) && lIIlIIIIIlIIllll(this.fireworkExplosions)) {
                final boolean llllllllllllIllIlllIlIlIlllllIll = this.func_92037_i();
                boolean llllllllllllIllIlllIlIlIlllllIlI = StarterFX.llIIllllIlIllI[1] != 0;
                if (lIIlIIIIIlIlIIlI(this.fireworkExplosions.tagCount(), StarterFX.llIIllllIlIllI[6])) {
                    llllllllllllIllIlllIlIlIlllllIlI = (StarterFX.llIIllllIlIllI[4] != 0);
                    "".length();
                    if (((0xEF ^ 0xBB ^ (0xD9 ^ 0xA7)) & (0xC7 ^ 0xB0 ^ (0xC2 ^ 0x9F) ^ -" ".length())) > (0xA5 ^ 0xBD ^ (0x68 ^ 0x74))) {
                        return;
                    }
                }
                else {
                    int llllllllllllIllIlllIlIlIlllllIIl = StarterFX.llIIllllIlIllI[1];
                    "".length();
                    if ("   ".length() < -" ".length()) {
                        return;
                    }
                    while (!lIIlIIIIIlIlIIlI(llllllllllllIllIlllIlIlIlllllIIl, this.fireworkExplosions.tagCount())) {
                        final NBTTagCompound llllllllllllIllIlllIlIlIlllllIII = this.fireworkExplosions.getCompoundTagAt(llllllllllllIllIlllIlIlIlllllIIl);
                        if (lIIlIIIIIlIlIIll(llllllllllllIllIlllIlIlIlllllIII.getByte(StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[3]]), StarterFX.llIIllllIlIllI[4])) {
                            llllllllllllIllIlllIlIlIlllllIlI = (StarterFX.llIIllllIlIllI[4] != 0);
                            "".length();
                            if (-"   ".length() >= 0) {
                                return;
                            }
                            break;
                        }
                        else {
                            ++llllllllllllIllIlllIlIlIlllllIIl;
                        }
                    }
                }
                final StringBuilder sb = new StringBuilder(StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[6]]);
                String str;
                if (lIIlIIIIIlIlIIIl(llllllllllllIllIlllIlIlIlllllIlI ? 1 : 0)) {
                    str = StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[7]];
                    "".length();
                    if (-" ".length() != -" ".length()) {
                        return;
                    }
                }
                else {
                    str = StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[8]];
                }
                final StringBuilder append = sb.append(str);
                String str2;
                if (lIIlIIIIIlIlIIIl(llllllllllllIllIlllIlIlIlllllIll ? 1 : 0)) {
                    str2 = StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[9]];
                    "".length();
                    if (((0x69 ^ 0x2F) & ~(0x1F ^ 0x59)) != ((0x97 ^ 0xA3) & ~(0x4D ^ 0x79))) {
                        return;
                    }
                }
                else {
                    str2 = StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[10]];
                }
                final String llllllllllllIllIlllIlIlIllllIlll = String.valueOf(append.append(str2));
                this.worldObj.playSound(this.posX, this.posY, this.posZ, llllllllllllIllIlllIlIlIllllIlll, 20.0f, 0.95f + this.rand.nextFloat() * 0.1f, (boolean)(StarterFX.llIIllllIlIllI[4] != 0));
            }
            if (lIIlIIIIIlIlIIII(this.fireworkAge % StarterFX.llIIllllIlIllI[3]) && lIIlIIIIIlIIllll(this.fireworkExplosions) && lIIlIIIIIlIlIlII(this.fireworkAge / StarterFX.llIIllllIlIllI[3], this.fireworkExplosions.tagCount())) {
                final int llllllllllllIllIlllIlIlIllllIllI = this.fireworkAge / StarterFX.llIIllllIlIllI[3];
                final NBTTagCompound llllllllllllIllIlllIlIlIllllIlIl = this.fireworkExplosions.getCompoundTagAt(llllllllllllIllIlllIlIlIllllIllI);
                final int llllllllllllIllIlllIlIlIllllIlII = llllllllllllIllIlllIlIlIllllIlIl.getByte(StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[0]]);
                final boolean llllllllllllIllIlllIlIlIllllIIll = llllllllllllIllIlllIlIlIllllIlIl.getBoolean(StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[11]]);
                final boolean llllllllllllIllIlllIlIlIllllIIlI = llllllllllllIllIlllIlIlIllllIlIl.getBoolean(StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[2]]);
                int[] llllllllllllIllIlllIlIlIllllIIIl = llllllllllllIllIlllIlIlIllllIlIl.getIntArray(StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[12]]);
                final int[] llllllllllllIllIlllIlIlIllllIIII = llllllllllllIllIlllIlIlIllllIlIl.getIntArray(StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[13]]);
                if (lIIlIIIIIlIlIIII(llllllllllllIllIlllIlIlIllllIIIl.length)) {
                    final int[] array = new int[StarterFX.llIIllllIlIllI[4]];
                    array[StarterFX.llIIllllIlIllI[1]] = ItemDye.dyeColors[StarterFX.llIIllllIlIllI[1]];
                    llllllllllllIllIlllIlIlIllllIIIl = array;
                }
                if (lIIlIIIIIlIlIIll(llllllllllllIllIlllIlIlIllllIlII, StarterFX.llIIllllIlIllI[4])) {
                    this.createBall(0.5, StarterFX.llIIllllIlIllI[7], llllllllllllIllIlllIlIlIllllIIIl, llllllllllllIllIlllIlIlIllllIIII, llllllllllllIllIlllIlIlIllllIIll, llllllllllllIllIlllIlIlIllllIIlI);
                    "".length();
                    if (" ".length() <= -" ".length()) {
                        return;
                    }
                }
                else if (lIIlIIIIIlIlIIll(llllllllllllIllIlllIlIlIllllIlII, StarterFX.llIIllllIlIllI[3])) {
                    final double llllllllllllIllIlllIlIlIIlIIlIIl = 0.5;
                    final double[][] llllllllllllIllIlllIlIlIIllIIIIl = new double[StarterFX.llIIllllIlIllI[9]][];
                    final int n = StarterFX.llIIllllIlIllI[1];
                    final double[] array2 = new double[StarterFX.llIIllllIlIllI[3]];
                    array2[StarterFX.llIIllllIlIllI[1]] = 0.0;
                    array2[StarterFX.llIIllllIlIllI[4]] = 1.0;
                    llllllllllllIllIlllIlIlIIllIIIIl[n] = array2;
                    final int n2 = StarterFX.llIIllllIlIllI[4];
                    final double[] array3 = new double[StarterFX.llIIllllIlIllI[3]];
                    array3[StarterFX.llIIllllIlIllI[1]] = 0.3455;
                    array3[StarterFX.llIIllllIlIllI[4]] = 0.309;
                    llllllllllllIllIlllIlIlIIllIIIIl[n2] = array3;
                    final int n3 = StarterFX.llIIllllIlIllI[3];
                    final double[] array4 = new double[StarterFX.llIIllllIlIllI[3]];
                    array4[StarterFX.llIIllllIlIllI[1]] = 0.9511;
                    array4[StarterFX.llIIllllIlIllI[4]] = 0.309;
                    llllllllllllIllIlllIlIlIIllIIIIl[n3] = array4;
                    final int n4 = StarterFX.llIIllllIlIllI[6];
                    final double[] array5 = new double[StarterFX.llIIllllIlIllI[3]];
                    array5[StarterFX.llIIllllIlIllI[1]] = 0.3795918367346939;
                    array5[StarterFX.llIIllllIlIllI[4]] = -0.12653061224489795;
                    llllllllllllIllIlllIlIlIIllIIIIl[n4] = array5;
                    final int n5 = StarterFX.llIIllllIlIllI[7];
                    final double[] array6 = new double[StarterFX.llIIllllIlIllI[3]];
                    array6[StarterFX.llIIllllIlIllI[1]] = 0.6122448979591837;
                    array6[StarterFX.llIIllllIlIllI[4]] = -0.8040816326530612;
                    llllllllllllIllIlllIlIlIIllIIIIl[n5] = array6;
                    final int n6 = StarterFX.llIIllllIlIllI[8];
                    final double[] array7 = new double[StarterFX.llIIllllIlIllI[3]];
                    array7[StarterFX.llIIllllIlIllI[1]] = 0.0;
                    array7[StarterFX.llIIllllIlIllI[4]] = -0.35918367346938773;
                    llllllllllllIllIlllIlIlIIllIIIIl[n6] = array7;
                    this.createShaped(llllllllllllIllIlllIlIlIIlIIlIIl, llllllllllllIllIlllIlIlIIllIIIIl, llllllllllllIllIlllIlIlIllllIIIl, llllllllllllIllIlllIlIlIllllIIII, llllllllllllIllIlllIlIlIllllIIll, llllllllllllIllIlllIlIlIllllIIlI, (boolean)(StarterFX.llIIllllIlIllI[1] != 0));
                    "".length();
                    if (-(0x1D ^ 0x77 ^ (0x6E ^ 0x0)) > 0) {
                        return;
                    }
                }
                else if (lIIlIIIIIlIlIIll(llllllllllllIllIlllIlIlIllllIlII, StarterFX.llIIllllIlIllI[6])) {
                    final double llllllllllllIllIlllIlIlIIlIIlIIl2 = 0.5;
                    final double[][] llllllllllllIllIlllIlIlIIllIIIIl2 = new double[StarterFX.llIIllllIlIllI[13]][];
                    final int n7 = StarterFX.llIIllllIlIllI[1];
                    final double[] array8 = new double[StarterFX.llIIllllIlIllI[3]];
                    array8[StarterFX.llIIllllIlIllI[1]] = 0.0;
                    array8[StarterFX.llIIllllIlIllI[4]] = 0.2;
                    llllllllllllIllIlllIlIlIIllIIIIl2[n7] = array8;
                    final int n8 = StarterFX.llIIllllIlIllI[4];
                    final double[] array9 = new double[StarterFX.llIIllllIlIllI[3]];
                    array9[StarterFX.llIIllllIlIllI[1]] = 0.2;
                    array9[StarterFX.llIIllllIlIllI[4]] = 0.2;
                    llllllllllllIllIlllIlIlIIllIIIIl2[n8] = array9;
                    final int n9 = StarterFX.llIIllllIlIllI[3];
                    final double[] array10 = new double[StarterFX.llIIllllIlIllI[3]];
                    array10[StarterFX.llIIllllIlIllI[1]] = 0.2;
                    array10[StarterFX.llIIllllIlIllI[4]] = 0.6;
                    llllllllllllIllIlllIlIlIIllIIIIl2[n9] = array10;
                    final int n10 = StarterFX.llIIllllIlIllI[6];
                    final double[] array11 = new double[StarterFX.llIIllllIlIllI[3]];
                    array11[StarterFX.llIIllllIlIllI[1]] = 0.6;
                    array11[StarterFX.llIIllllIlIllI[4]] = 0.6;
                    llllllllllllIllIlllIlIlIIllIIIIl2[n10] = array11;
                    final int n11 = StarterFX.llIIllllIlIllI[7];
                    final double[] array12 = new double[StarterFX.llIIllllIlIllI[3]];
                    array12[StarterFX.llIIllllIlIllI[1]] = 0.6;
                    array12[StarterFX.llIIllllIlIllI[4]] = 0.2;
                    llllllllllllIllIlllIlIlIIllIIIIl2[n11] = array12;
                    final int n12 = StarterFX.llIIllllIlIllI[8];
                    final double[] array13 = new double[StarterFX.llIIllllIlIllI[3]];
                    array13[StarterFX.llIIllllIlIllI[1]] = 0.2;
                    array13[StarterFX.llIIllllIlIllI[4]] = 0.2;
                    llllllllllllIllIlllIlIlIIllIIIIl2[n12] = array13;
                    final int n13 = StarterFX.llIIllllIlIllI[9];
                    final double[] array14 = new double[StarterFX.llIIllllIlIllI[3]];
                    array14[StarterFX.llIIllllIlIllI[1]] = 0.2;
                    array14[StarterFX.llIIllllIlIllI[4]] = 0.0;
                    llllllllllllIllIlllIlIlIIllIIIIl2[n13] = array14;
                    final int n14 = StarterFX.llIIllllIlIllI[10];
                    final double[] array15 = new double[StarterFX.llIIllllIlIllI[3]];
                    array15[StarterFX.llIIllllIlIllI[1]] = 0.4;
                    array15[StarterFX.llIIllllIlIllI[4]] = 0.0;
                    llllllllllllIllIlllIlIlIIllIIIIl2[n14] = array15;
                    final int n15 = StarterFX.llIIllllIlIllI[0];
                    final double[] array16 = new double[StarterFX.llIIllllIlIllI[3]];
                    array16[StarterFX.llIIllllIlIllI[1]] = 0.4;
                    array16[StarterFX.llIIllllIlIllI[4]] = -0.6;
                    llllllllllllIllIlllIlIlIIllIIIIl2[n15] = array16;
                    final int n16 = StarterFX.llIIllllIlIllI[11];
                    final double[] array17 = new double[StarterFX.llIIllllIlIllI[3]];
                    array17[StarterFX.llIIllllIlIllI[1]] = 0.2;
                    array17[StarterFX.llIIllllIlIllI[4]] = -0.6;
                    llllllllllllIllIlllIlIlIIllIIIIl2[n16] = array17;
                    final int n17 = StarterFX.llIIllllIlIllI[2];
                    final double[] array18 = new double[StarterFX.llIIllllIlIllI[3]];
                    array18[StarterFX.llIIllllIlIllI[1]] = 0.2;
                    array18[StarterFX.llIIllllIlIllI[4]] = -0.4;
                    llllllllllllIllIlllIlIlIIllIIIIl2[n17] = array18;
                    final int n18 = StarterFX.llIIllllIlIllI[12];
                    final double[] array19 = new double[StarterFX.llIIllllIlIllI[3]];
                    array19[StarterFX.llIIllllIlIllI[1]] = 0.0;
                    array19[StarterFX.llIIllllIlIllI[4]] = -0.4;
                    llllllllllllIllIlllIlIlIIllIIIIl2[n18] = array19;
                    this.createShaped(llllllllllllIllIlllIlIlIIlIIlIIl2, llllllllllllIllIlllIlIlIIllIIIIl2, llllllllllllIllIlllIlIlIllllIIIl, llllllllllllIllIlllIlIlIllllIIII, llllllllllllIllIlllIlIlIllllIIll, llllllllllllIllIlllIlIlIllllIIlI, (boolean)(StarterFX.llIIllllIlIllI[4] != 0));
                    "".length();
                    if ("   ".length() < 0) {
                        return;
                    }
                }
                else if (lIIlIIIIIlIlIIll(llllllllllllIllIlllIlIlIllllIlII, StarterFX.llIIllllIlIllI[7])) {
                    this.createBurst(llllllllllllIllIlllIlIlIllllIIIl, llllllllllllIllIlllIlIlIllllIIII, llllllllllllIllIlllIlIlIllllIIll, llllllllllllIllIlllIlIlIllllIIlI);
                    "".length();
                    if (-" ".length() >= ((204 + 219 - 210 + 24 ^ 81 + 65 - 106 + 141) & (155 + 190 - 315 + 202 ^ 56 + 121 - 152 + 151 ^ -" ".length()))) {
                        return;
                    }
                }
                else {
                    this.createBall(0.25, StarterFX.llIIllllIlIllI[3], llllllllllllIllIlllIlIlIllllIIIl, llllllllllllIllIlllIlIlIllllIIII, llllllllllllIllIlllIlIlIllllIIll, llllllllllllIllIlllIlIlIllllIIlI);
                }
                final int llllllllllllIllIlllIlIlIlllIllll = llllllllllllIllIlllIlIlIllllIIIl[StarterFX.llIIllllIlIllI[1]];
                final float llllllllllllIllIlllIlIlIlllIlllI = ((llllllllllllIllIlllIlIlIlllIllll & StarterFX.llIIllllIlIllI[14]) >> StarterFX.llIIllllIlIllI[15]) / 255.0f;
                final float llllllllllllIllIlllIlIlIlllIllIl = ((llllllllllllIllIlllIlIlIlllIllll & StarterFX.llIIllllIlIllI[16]) >> StarterFX.llIIllllIlIllI[0]) / 255.0f;
                final float llllllllllllIllIlllIlIlIlllIllII = ((llllllllllllIllIlllIlIlIlllIllll & StarterFX.llIIllllIlIllI[17]) >> StarterFX.llIIllllIlIllI[1]) / 255.0f;
                final OverlayFX llllllllllllIllIlllIlIlIlllIlIll = new OverlayFX(this.worldObj, this.posX, this.posY, this.posZ);
                llllllllllllIllIlllIlIlIlllIlIll.setRBGColorF(llllllllllllIllIlllIlIlIlllIlllI, llllllllllllIllIlllIlIlIlllIllIl, llllllllllllIllIlllIlIlIlllIllII);
                this.theEffectRenderer.addEffect(llllllllllllIllIlllIlIlIlllIlIll);
            }
            this.fireworkAge += StarterFX.llIIllllIlIllI[4];
            if (lIIlIIIIIlIlIlIl(this.fireworkAge, this.particleMaxAge)) {
                if (lIIlIIIIIlIlIIIl(this.twinkle ? 1 : 0)) {
                    final boolean llllllllllllIllIlllIlIlIlllIlIlI = this.func_92037_i();
                    final StringBuilder sb2 = new StringBuilder(StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[18]]);
                    String str3;
                    if (lIIlIIIIIlIlIIIl(llllllllllllIllIlllIlIlIlllIlIlI ? 1 : 0)) {
                        str3 = StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[19]];
                        "".length();
                        if ("   ".length() == " ".length()) {
                            return;
                        }
                    }
                    else {
                        str3 = StarterFX.llIIllllIlIIll[StarterFX.llIIllllIlIllI[5]];
                    }
                    final String llllllllllllIllIlllIlIlIlllIlIIl = String.valueOf(sb2.append(str3));
                    this.worldObj.playSound(this.posX, this.posY, this.posZ, llllllllllllIllIlllIlIlIlllIlIIl, 20.0f, 0.9f + this.rand.nextFloat() * 0.15f, (boolean)(StarterFX.llIIllllIlIllI[4] != 0));
                }
                this.setDead();
            }
        }
        
        private static boolean lIIlIIIIIlIlIlll(final int llllllllllllIllIlllIlIIlllIIlIII) {
            return llllllllllllIllIlllIlIIlllIIlIII < 0;
        }
        
        private static String lIIlIIIIIIllllIl(String llllllllllllIllIlllIlIIlllllIlIl, final String llllllllllllIllIlllIlIIllllllIIl) {
            llllllllllllIllIlllIlIIlllllIlIl = new String(Base64.getDecoder().decode(llllllllllllIllIlllIlIIlllllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIlllIlIIllllllIII = new StringBuilder();
            final char[] llllllllllllIllIlllIlIIlllllIlll = llllllllllllIllIlllIlIIllllllIIl.toCharArray();
            int llllllllllllIllIlllIlIIlllllIllI = StarterFX.llIIllllIlIllI[1];
            final float llllllllllllIllIlllIlIIlllllIIII = (Object)llllllllllllIllIlllIlIIlllllIlIl.toCharArray();
            final double llllllllllllIllIlllIlIIllllIllll = llllllllllllIllIlllIlIIlllllIIII.length;
            long llllllllllllIllIlllIlIIllllIlllI = StarterFX.llIIllllIlIllI[1];
            while (lIIlIIIIIlIlIlII((int)llllllllllllIllIlllIlIIllllIlllI, (int)llllllllllllIllIlllIlIIllllIllll)) {
                final char llllllllllllIllIlllIlIIllllllIll = llllllllllllIllIlllIlIIlllllIIII[llllllllllllIllIlllIlIIllllIlllI];
                llllllllllllIllIlllIlIIllllllIII.append((char)(llllllllllllIllIlllIlIIllllllIll ^ llllllllllllIllIlllIlIIlllllIlll[llllllllllllIllIlllIlIIlllllIllI % llllllllllllIllIlllIlIIlllllIlll.length]));
                "".length();
                ++llllllllllllIllIlllIlIIlllllIllI;
                ++llllllllllllIllIlllIlIIllllIlllI;
                "".length();
                if (-" ".length() > "  ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIlllIlIIllllllIII);
        }
        
        private static boolean lIIlIIIIIlIlIIIl(final int llllllllllllIllIlllIlIIlllIIllII) {
            return llllllllllllIllIlllIlIIlllIIllII != 0;
        }
        
        @Override
        public int getFXLayer() {
            return StarterFX.llIIllllIlIllI[1];
        }
        
        private static String lIIlIIIIIIlllllI(final String llllllllllllIllIlllIlIlIIIIIlIII, final String llllllllllllIllIlllIlIlIIIIIlIIl) {
            try {
                final SecretKeySpec llllllllllllIllIlllIlIlIIIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIlIlIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), StarterFX.llIIllllIlIllI[0]), "DES");
                final Cipher llllllllllllIllIlllIlIlIIIIIllII = Cipher.getInstance("DES");
                llllllllllllIllIlllIlIlIIIIIllII.init(StarterFX.llIIllllIlIllI[3], llllllllllllIllIlllIlIlIIIIIllIl);
                return new String(llllllllllllIllIlllIlIlIIIIIllII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIlIlIIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlllIlIlIIIIIlIll) {
                llllllllllllIllIlllIlIlIIIIIlIll.printStackTrace();
                return null;
            }
        }
        
        private static int lIIlIIIIIlIllIlI(final double n, final double n2) {
            return dcmpg(n, n2);
        }
    }
    
    public static class OverlayFX extends EntityFX
    {
        private static final /* synthetic */ int[] llIlIIlllllIII;
        
        static {
            lIIlIIllIlIllIIl();
        }
        
        @Override
        public void renderParticle(final WorldRenderer llllllllllllIllIlIllIllIIIlIllll, final Entity llllllllllllIllIlIllIllIIlIIIIlI, final float llllllllllllIllIlIllIllIIlIIIIIl, final float llllllllllllIllIlIllIllIIIlIllIl, final float llllllllllllIllIlIllIllIIIllllll, final float llllllllllllIllIlIllIllIIIlIlIll, final float llllllllllllIllIlIllIllIIIllllIl, final float llllllllllllIllIlIllIllIIIllllII) {
            final float llllllllllllIllIlIllIllIIIlllIll = 0.25f;
            final float llllllllllllIllIlIllIllIIIlllIlI = 0.5f;
            final float llllllllllllIllIlIllIllIIIlllIIl = 0.125f;
            final float llllllllllllIllIlIllIllIIIlllIII = 0.375f;
            final float llllllllllllIllIlIllIllIIIllIlll = 7.1f * MathHelper.sin((this.particleAge + llllllllllllIllIlIllIllIIlIIIIIl - 1.0f) * 0.25f * 3.1415927f);
            this.particleAlpha = 0.6f - (this.particleAge + llllllllllllIllIlIllIllIIlIIIIIl - 1.0f) * 0.25f * 0.5f;
            final float llllllllllllIllIlIllIllIIIllIllI = (float)(this.prevPosX + (this.posX - this.prevPosX) * llllllllllllIllIlIllIllIIlIIIIIl - OverlayFX.interpPosX);
            final float llllllllllllIllIlIllIllIIIllIlIl = (float)(this.prevPosY + (this.posY - this.prevPosY) * llllllllllllIllIlIllIllIIlIIIIIl - OverlayFX.interpPosY);
            final float llllllllllllIllIlIllIllIIIllIlII = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * llllllllllllIllIlIllIllIIlIIIIIl - OverlayFX.interpPosZ);
            final int llllllllllllIllIlIllIllIIIllIIll = this.getBrightnessForRender(llllllllllllIllIlIllIllIIlIIIIIl);
            final int llllllllllllIllIlIllIllIIIllIIlI = llllllllllllIllIlIllIllIIIllIIll >> OverlayFX.llIlIIlllllIII[1] & OverlayFX.llIlIIlllllIII[2];
            final int llllllllllllIllIlIllIllIIIllIIIl = llllllllllllIllIlIllIllIIIllIIll & OverlayFX.llIlIIlllllIII[2];
            llllllllllllIllIlIllIllIIIlIllll.pos(llllllllllllIllIlIllIllIIIllIllI - llllllllllllIllIlIllIllIIIlIllIl * llllllllllllIllIlIllIllIIIllIlll - llllllllllllIllIlIllIllIIIllllIl * llllllllllllIllIlIllIllIIIllIlll, llllllllllllIllIlIllIllIIIllIlIl - llllllllllllIllIlIllIllIIIllllll * llllllllllllIllIlIllIllIIIllIlll, llllllllllllIllIlIllIllIIIllIlII - llllllllllllIllIlIllIllIIIlIlIll * llllllllllllIllIlIllIllIIIllIlll - llllllllllllIllIlIllIllIIIllllII * llllllllllllIllIlIllIllIIIllIlll).tex(0.5, 0.375).color(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(llllllllllllIllIlIllIllIIIllIIlI, llllllllllllIllIlIllIllIIIllIIIl).endVertex();
            llllllllllllIllIlIllIllIIIlIllll.pos(llllllllllllIllIlIllIllIIIllIllI - llllllllllllIllIlIllIllIIIlIllIl * llllllllllllIllIlIllIllIIIllIlll + llllllllllllIllIlIllIllIIIllllIl * llllllllllllIllIlIllIllIIIllIlll, llllllllllllIllIlIllIllIIIllIlIl + llllllllllllIllIlIllIllIIIllllll * llllllllllllIllIlIllIllIIIllIlll, llllllllllllIllIlIllIllIIIllIlII - llllllllllllIllIlIllIllIIIlIlIll * llllllllllllIllIlIllIllIIIllIlll + llllllllllllIllIlIllIllIIIllllII * llllllllllllIllIlIllIllIIIllIlll).tex(0.5, 0.125).color(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(llllllllllllIllIlIllIllIIIllIIlI, llllllllllllIllIlIllIllIIIllIIIl).endVertex();
            llllllllllllIllIlIllIllIIIlIllll.pos(llllllllllllIllIlIllIllIIIllIllI + llllllllllllIllIlIllIllIIIlIllIl * llllllllllllIllIlIllIllIIIllIlll + llllllllllllIllIlIllIllIIIllllIl * llllllllllllIllIlIllIllIIIllIlll, llllllllllllIllIlIllIllIIIllIlIl + llllllllllllIllIlIllIllIIIllllll * llllllllllllIllIlIllIllIIIllIlll, llllllllllllIllIlIllIllIIIllIlII + llllllllllllIllIlIllIllIIIlIlIll * llllllllllllIllIlIllIllIIIllIlll + llllllllllllIllIlIllIllIIIllllII * llllllllllllIllIlIllIllIIIllIlll).tex(0.25, 0.125).color(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(llllllllllllIllIlIllIllIIIllIIlI, llllllllllllIllIlIllIllIIIllIIIl).endVertex();
            llllllllllllIllIlIllIllIIIlIllll.pos(llllllllllllIllIlIllIllIIIllIllI + llllllllllllIllIlIllIllIIIlIllIl * llllllllllllIllIlIllIllIIIllIlll - llllllllllllIllIlIllIllIIIllllIl * llllllllllllIllIlIllIllIIIllIlll, llllllllllllIllIlIllIllIIIllIlIl - llllllllllllIllIlIllIllIIIllllll * llllllllllllIllIlIllIllIIIllIlll, llllllllllllIllIlIllIllIIIllIlII + llllllllllllIllIlIllIllIIIlIlIll * llllllllllllIllIlIllIllIIIllIlll - llllllllllllIllIlIllIllIIIllllII * llllllllllllIllIlIllIllIIIllIlll).tex(0.25, 0.375).color(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(llllllllllllIllIlIllIllIIIllIIlI, llllllllllllIllIlIllIllIIIllIIIl).endVertex();
        }
        
        protected OverlayFX(final World llllllllllllIllIlIllIllIIlIllIll, final double llllllllllllIllIlIllIllIIlIlllll, final double llllllllllllIllIlIllIllIIlIllllI, final double llllllllllllIllIlIllIllIIlIlllIl) {
            super(llllllllllllIllIlIllIllIIlIllIll, llllllllllllIllIlIllIllIIlIlllll, llllllllllllIllIlIllIllIIlIllllI, llllllllllllIllIlIllIllIIlIlllIl);
            this.particleMaxAge = OverlayFX.llIlIIlllllIII[0];
        }
        
        private static void lIIlIIllIlIllIIl() {
            (llIlIIlllllIII = new int[3])[0] = (139 + 7 - 58 + 100 ^ 172 + 88 - 193 + 117);
            OverlayFX.llIlIIlllllIII[1] = (0xB4 ^ 0xA4);
            OverlayFX.llIlIIlllllIII[2] = (-1 & 0xFFFF);
        }
    }
    
    public static class SparkFX extends EntityFX
    {
        private /* synthetic */ boolean trail;
        private /* synthetic */ float fadeColourGreen;
        private /* synthetic */ int baseTextureIndex;
        private /* synthetic */ boolean twinkle;
        private /* synthetic */ float fadeColourRed;
        private static final /* synthetic */ int[] lIIIIllIlIlIlI;
        private /* synthetic */ float fadeColourBlue;
        private final /* synthetic */ EffectRenderer field_92047_az;
        private /* synthetic */ boolean hasFadeColour;
        
        @Override
        public void renderParticle(final WorldRenderer lllllllllllllIlIIlIIlIlIIIIlIlII, final Entity lllllllllllllIlIIlIIlIlIIIIIlIlI, final float lllllllllllllIlIIlIIlIlIIIIIlIIl, final float lllllllllllllIlIIlIIlIlIIIIIlIII, final float lllllllllllllIlIIlIIlIlIIIIIIlll, final float lllllllllllllIlIIlIIlIlIIIIIllll, final float lllllllllllllIlIIlIIlIlIIIIIIlIl, final float lllllllllllllIlIIlIIlIlIIIIIllIl) {
            if (!lIlllIlllIlllII(this.twinkle ? 1 : 0) || !lIlllIlllIlllIl(this.particleAge, this.particleMaxAge / SparkFX.lIIIIllIlIlIlI[10]) || lIlllIlllIllllI((this.particleAge + this.particleMaxAge) / SparkFX.lIIIIllIlIlIlI[10] % SparkFX.lIIIIllIlIlIlI[11])) {
                super.renderParticle(lllllllllllllIlIIlIIlIlIIIIlIlII, lllllllllllllIlIIlIIlIlIIIIIlIlI, lllllllllllllIlIIlIIlIlIIIIIlIIl, lllllllllllllIlIIlIIlIlIIIIIlIII, lllllllllllllIlIIlIIlIlIIIIIIlll, lllllllllllllIlIIlIIlIlIIIIIllll, lllllllllllllIlIIlIIlIlIIIIIIlIl, lllllllllllllIlIIlIIlIlIIIIIllIl);
            }
        }
        
        private static boolean lIlllIllllIIIII(final int lllllllllllllIlIIlIIlIIlllllIIll, final int lllllllllllllIlIIlIIlIIlllllIIlI) {
            return lllllllllllllIlIIlIIlIIlllllIIll < lllllllllllllIlIIlIIlIIlllllIIlI;
        }
        
        public void setFadeColour(final int lllllllllllllIlIIlIIlIlIIIlIIIIl) {
            this.fadeColourRed = ((lllllllllllllIlIIlIIlIlIIIlIIIIl & SparkFX.lIIIIllIlIlIlI[4]) >> SparkFX.lIIIIllIlIlIlI[5]) / 255.0f;
            this.fadeColourGreen = ((lllllllllllllIlIIlIIlIlIIIlIIIIl & SparkFX.lIIIIllIlIlIlI[6]) >> SparkFX.lIIIIllIlIlIlI[7]) / 255.0f;
            this.fadeColourBlue = ((lllllllllllllIlIIlIIlIlIIIlIIIIl & SparkFX.lIIIIllIlIlIlI[8]) >> SparkFX.lIIIIllIlIlIlI[3]) / 255.0f;
            this.hasFadeColour = (SparkFX.lIIIIllIlIlIlI[9] != 0);
        }
        
        @Override
        public int getBrightnessForRender(final float lllllllllllllIlIIlIIlIIlllllllII) {
            return SparkFX.lIIIIllIlIlIlI[13];
        }
        
        @Override
        public float getBrightness(final float lllllllllllllIlIIlIIlIIllllllIlI) {
            return 1.0f;
        }
        
        public SparkFX(final World lllllllllllllIlIIlIIlIlIIlIlIlIl, final double lllllllllllllIlIIlIIlIlIIlIlIlII, final double lllllllllllllIlIIlIIlIlIIlIIlIlI, final double lllllllllllllIlIIlIIlIlIIlIlIIlI, final double lllllllllllllIlIIlIIlIlIIlIIlIII, final double lllllllllllllIlIIlIIlIlIIlIIIlll, final double lllllllllllllIlIIlIIlIlIIlIIIllI, final EffectRenderer lllllllllllllIlIIlIIlIlIIlIIIlIl) {
            super(lllllllllllllIlIIlIIlIlIIlIlIlIl, lllllllllllllIlIIlIIlIlIIlIlIlII, lllllllllllllIlIIlIIlIlIIlIIlIlI, lllllllllllllIlIIlIIlIlIIlIlIIlI);
            this.baseTextureIndex = SparkFX.lIIIIllIlIlIlI[0];
            this.motionX = lllllllllllllIlIIlIIlIlIIlIIlIII;
            this.motionY = lllllllllllllIlIIlIIlIlIIlIIIlll;
            this.motionZ = lllllllllllllIlIIlIIlIlIIlIIIllI;
            this.field_92047_az = lllllllllllllIlIIlIIlIlIIlIIIlIl;
            this.particleScale *= 0.75f;
            this.particleMaxAge = SparkFX.lIIIIllIlIlIlI[1] + this.rand.nextInt(SparkFX.lIIIIllIlIlIlI[2]);
            this.noClip = (SparkFX.lIIIIllIlIlIlI[3] != 0);
        }
        
        private static boolean lIlllIlllIlllII(final int lllllllllllllIlIIlIIlIIllllIllII) {
            return lllllllllllllIlIIlIIlIIllllIllII != 0;
        }
        
        private static boolean lIlllIlllIllllI(final int lllllllllllllIlIIlIIlIIllllIlIlI) {
            return lllllllllllllIlIIlIIlIIllllIlIlI == 0;
        }
        
        private static boolean lIlllIlllIlllll(final int lllllllllllllIlIIlIIlIIllllIllll, final int lllllllllllllIlIIlIIlIIllllIlllI) {
            return lllllllllllllIlIIlIIlIIllllIllll > lllllllllllllIlIIlIIlIIllllIlllI;
        }
        
        public void setTrail(final boolean lllllllllllllIlIIlIIlIlIIIllllll) {
            this.trail = lllllllllllllIlIIlIIlIlIIIllllll;
        }
        
        public void setColour(final int lllllllllllllIlIIlIIlIlIIIllIIIl) {
            final float lllllllllllllIlIIlIIlIlIIIllIIII = ((lllllllllllllIlIIlIIlIlIIIllIIIl & SparkFX.lIIIIllIlIlIlI[4]) >> SparkFX.lIIIIllIlIlIlI[5]) / 255.0f;
            final float lllllllllllllIlIIlIIlIlIIIlIllll = ((lllllllllllllIlIIlIIlIlIIIllIIIl & SparkFX.lIIIIllIlIlIlI[6]) >> SparkFX.lIIIIllIlIlIlI[7]) / 255.0f;
            final float lllllllllllllIlIIlIIlIlIIIlIlllI = ((lllllllllllllIlIIlIIlIlIIIllIIIl & SparkFX.lIIIIllIlIlIlI[8]) >> SparkFX.lIIIIllIlIlIlI[3]) / 255.0f;
            final float lllllllllllllIlIIlIIlIlIIIlIllIl = 1.0f;
            this.setRBGColorF(lllllllllllllIlIIlIIlIlIIIllIIII * lllllllllllllIlIIlIIlIlIIIlIllIl, lllllllllllllIlIIlIIlIlIIIlIllll * lllllllllllllIlIIlIIlIlIIIlIllIl, lllllllllllllIlIIlIIlIlIIIlIlllI * lllllllllllllIlIIlIIlIlIIIlIllIl);
        }
        
        @Override
        public boolean canBePushed() {
            return SparkFX.lIIIIllIlIlIlI[3] != 0;
        }
        
        @Override
        public AxisAlignedBB getCollisionBoundingBox() {
            return null;
        }
        
        public void setTwinkle(final boolean lllllllllllllIlIIlIIlIlIIIlllIll) {
            this.twinkle = lllllllllllllIlIIlIIlIlIIIlllIll;
        }
        
        @Override
        public void onUpdate() {
            this.prevPosX = this.posX;
            this.prevPosY = this.posY;
            this.prevPosZ = this.posZ;
            final int particleAge = this.particleAge;
            this.particleAge = particleAge + SparkFX.lIIIIllIlIlIlI[9];
            if (lIlllIlllIlllIl(particleAge, this.particleMaxAge)) {
                this.setDead();
            }
            if (lIlllIlllIlllll(this.particleAge, this.particleMaxAge / SparkFX.lIIIIllIlIlIlI[11])) {
                this.setAlphaF(1.0f - (this.particleAge - (float)(this.particleMaxAge / SparkFX.lIIIIllIlIlIlI[11])) / this.particleMaxAge);
                if (lIlllIlllIlllII(this.hasFadeColour ? 1 : 0)) {
                    this.particleRed += (this.fadeColourRed - this.particleRed) * 0.2f;
                    this.particleGreen += (this.fadeColourGreen - this.particleGreen) * 0.2f;
                    this.particleBlue += (this.fadeColourBlue - this.particleBlue) * 0.2f;
                }
            }
            this.setParticleTextureIndex(this.baseTextureIndex + (SparkFX.lIIIIllIlIlIlI[12] - this.particleAge * SparkFX.lIIIIllIlIlIlI[7] / this.particleMaxAge));
            this.motionY -= 0.004;
            this.moveEntity(this.motionX, this.motionY, this.motionZ);
            this.motionX *= 0.9100000262260437;
            this.motionY *= 0.9100000262260437;
            this.motionZ *= 0.9100000262260437;
            if (lIlllIlllIlllII(this.onGround ? 1 : 0)) {
                this.motionX *= 0.699999988079071;
                this.motionZ *= 0.699999988079071;
            }
            if (lIlllIlllIlllII(this.trail ? 1 : 0) && lIlllIllllIIIII(this.particleAge, this.particleMaxAge / SparkFX.lIIIIllIlIlIlI[11]) && lIlllIlllIllllI((this.particleAge + this.particleMaxAge) % SparkFX.lIIIIllIlIlIlI[11])) {
                final SparkFX lllllllllllllIlIIlIIlIlIIIIIIIII = new SparkFX(this.worldObj, this.posX, this.posY, this.posZ, 0.0, 0.0, 0.0, this.field_92047_az);
                lllllllllllllIlIIlIIlIlIIIIIIIII.setAlphaF(0.99f);
                lllllllllllllIlIIlIIlIlIIIIIIIII.setRBGColorF(this.particleRed, this.particleGreen, this.particleBlue);
                lllllllllllllIlIIlIIlIlIIIIIIIII.particleAge = lllllllllllllIlIIlIIlIlIIIIIIIII.particleMaxAge / SparkFX.lIIIIllIlIlIlI[11];
                if (lIlllIlllIlllII(this.hasFadeColour ? 1 : 0)) {
                    lllllllllllllIlIIlIIlIlIIIIIIIII.hasFadeColour = (SparkFX.lIIIIllIlIlIlI[9] != 0);
                    lllllllllllllIlIIlIIlIlIIIIIIIII.fadeColourRed = this.fadeColourRed;
                    lllllllllllllIlIIlIIlIlIIIIIIIII.fadeColourGreen = this.fadeColourGreen;
                    lllllllllllllIlIIlIIlIlIIIIIIIII.fadeColourBlue = this.fadeColourBlue;
                }
                lllllllllllllIlIIlIIlIlIIIIIIIII.twinkle = this.twinkle;
                this.field_92047_az.addEffect(lllllllllllllIlIIlIIlIlIIIIIIIII);
            }
        }
        
        private static void lIlllIlllIllIll() {
            (lIIIIllIlIlIlI = new int[14])[0] = "  ".length() + (0x2D ^ 0x3D) - -(125 + 119 - 157 + 44) + (0x38 ^ 0x33);
            SparkFX.lIIIIllIlIlIlI[1] = (0x2B ^ 0x27 ^ (0x2C ^ 0x10));
            SparkFX.lIIIIllIlIlIlI[2] = (0x9C ^ 0xAC ^ (0x8C ^ 0xB0));
            SparkFX.lIIIIllIlIlIlI[3] = ((0x5C ^ 0x48) & ~(0x6D ^ 0x79));
            SparkFX.lIIIIllIlIlIlI[4] = (0xFFFF9C27 & 0xFF63D8);
            SparkFX.lIIIIllIlIlIlI[5] = (0x7 ^ 0x17);
            SparkFX.lIIIIllIlIlIlI[6] = (-(0x55 ^ 0x7) & (0xFFFFFF7B & 0xFFD5));
            SparkFX.lIIIIllIlIlIlI[7] = (0x15 ^ 0x1D);
            SparkFX.lIIIIllIlIlIlI[8] = 207 + 223 - 293 + 118;
            SparkFX.lIIIIllIlIlIlI[9] = " ".length();
            SparkFX.lIIIIllIlIlIlI[10] = "   ".length();
            SparkFX.lIIIIllIlIlIlI[11] = "  ".length();
            SparkFX.lIIIIllIlIlIlI[12] = (0xD0 ^ 0xB5 ^ (0x7B ^ 0x19));
            SparkFX.lIIIIllIlIlIlI[13] = (0xFFFFDCF2 & 0xF023FD);
        }
        
        private static boolean lIlllIlllIlllIl(final int lllllllllllllIlIIlIIlIIlllllIlll, final int lllllllllllllIlIIlIIlIIlllllIllI) {
            return lllllllllllllIlIIlIIlIIlllllIlll >= lllllllllllllIlIIlIIlIIlllllIllI;
        }
        
        static {
            lIlllIlllIllIll();
        }
    }
    
    public static class Factory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int lllllllllllllIIlIIlIIIlllIlllIll, final World lllllllllllllIIlIIlIIIlllIlllIlI, final double lllllllllllllIIlIIlIIIlllIlllIIl, final double lllllllllllllIIlIIlIIIlllIlllIII, final double lllllllllllllIIlIIlIIIlllIlIllIl, final double lllllllllllllIIlIIlIIIlllIlIllII, final double lllllllllllllIIlIIlIIIlllIlIlIll, final double lllllllllllllIIlIIlIIIlllIlIlIlI, final int... lllllllllllllIIlIIlIIIlllIllIIll) {
            final SparkFX lllllllllllllIIlIIlIIIlllIllIIlI = new SparkFX(lllllllllllllIIlIIlIIIlllIlllIlI, lllllllllllllIIlIIlIIIlllIlllIIl, lllllllllllllIIlIIlIIIlllIlllIII, lllllllllllllIIlIIlIIIlllIlIllIl, lllllllllllllIIlIIlIIIlllIlIllII, lllllllllllllIIlIIlIIIlllIlIlIll, lllllllllllllIIlIIlIIIlllIlIlIlI, Minecraft.getMinecraft().effectRenderer);
            lllllllllllllIIlIIlIIIlllIllIIlI.setAlphaF(0.99f);
            return lllllllllllllIIlIIlIIIlllIllIIlI;
        }
    }
}
