// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.audio;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.item.EntityMinecart;

public class MovingSoundMinecartRiding extends MovingSound
{
    private static final /* synthetic */ String[] lIllIlllllIllI;
    private final /* synthetic */ EntityMinecart minecart;
    private final /* synthetic */ EntityPlayer player;
    private static final /* synthetic */ int[] lIllIlllllIlll;
    
    @Override
    public void update() {
        if (lIIIIIIIlIIllIIl(this.minecart.isDead ? 1 : 0) && lIIIIIIIlIIllIlI(this.player.isRiding() ? 1 : 0) && lIIIIIIIlIIllIll(this.player.ridingEntity, this.minecart)) {
            final float llllllllllllIllllllIIIlIIIlIlIll = MathHelper.sqrt_double(this.minecart.motionX * this.minecart.motionX + this.minecart.motionZ * this.minecart.motionZ);
            if (lIIIIIIIlIIlllII(lIIIIIIIlIIllIII(llllllllllllIllllllIIIlIIIlIlIll, 0.01))) {
                this.volume = 0.0f + MathHelper.clamp_float(llllllllllllIllllllIIIlIIIlIlIll, 0.0f, 1.0f) * 0.75f;
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.volume = 0.0f;
                "".length();
                if (-" ".length() > ((0x35 ^ 0x21) & ~(0x44 ^ 0x50))) {
                    return;
                }
            }
        }
        else {
            this.donePlaying = (MovingSoundMinecartRiding.lIllIlllllIlll[1] != 0);
        }
    }
    
    private static void lIIIIIIIlIIlIlll() {
        (lIllIlllllIlll = new int[3])[0] = ((0xA8 ^ 0x92) & ~(0xF ^ 0x35));
        MovingSoundMinecartRiding.lIllIlllllIlll[1] = " ".length();
        MovingSoundMinecartRiding.lIllIlllllIlll[2] = "  ".length();
    }
    
    static {
        lIIIIIIIlIIlIlll();
        lIIIIIIIlIIlIllI();
    }
    
    private static void lIIIIIIIlIIlIllI() {
        (lIllIlllllIllI = new String[MovingSoundMinecartRiding.lIllIlllllIlll[1]])[MovingSoundMinecartRiding.lIllIlllllIlll[0]] = lIIIIIIIlIIlIlIl("Jcl8Ai49IJlmOji2fG4QHr7cP6WaMdpDPAZeyw+hUQs=", "WWVFu");
    }
    
    private static boolean lIIIIIIIlIIlllII(final int llllllllllllIllllllIIIlIIIIlIIlI) {
        return llllllllllllIllllllIIIlIIIIlIIlI >= 0;
    }
    
    private static int lIIIIIIIlIIllIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public MovingSoundMinecartRiding(final EntityPlayer llllllllllllIllllllIIIlIIIllIIII, final EntityMinecart llllllllllllIllllllIIIlIIIllIIlI) {
        super(new ResourceLocation(MovingSoundMinecartRiding.lIllIlllllIllI[MovingSoundMinecartRiding.lIllIlllllIlll[0]]));
        this.player = llllllllllllIllllllIIIlIIIllIIII;
        this.minecart = llllllllllllIllllllIIIlIIIllIIlI;
        this.attenuationType = ISound.AttenuationType.NONE;
        this.repeat = (MovingSoundMinecartRiding.lIllIlllllIlll[1] != 0);
        this.repeatDelay = MovingSoundMinecartRiding.lIllIlllllIlll[0];
    }
    
    private static boolean lIIIIIIIlIIllIlI(final int llllllllllllIllllllIIIlIIIIlIllI) {
        return llllllllllllIllllllIIIlIIIIlIllI != 0;
    }
    
    private static boolean lIIIIIIIlIIllIIl(final int llllllllllllIllllllIIIlIIIIlIlII) {
        return llllllllllllIllllllIIIlIIIIlIlII == 0;
    }
    
    private static boolean lIIIIIIIlIIllIll(final Object llllllllllllIllllllIIIlIIIIllIIl, final Object llllllllllllIllllllIIIlIIIIllIII) {
        return llllllllllllIllllllIIIlIIIIllIIl == llllllllllllIllllllIIIlIIIIllIII;
    }
    
    private static String lIIIIIIIlIIlIlIl(final String llllllllllllIllllllIIIlIIIIlllll, final String llllllllllllIllllllIIIlIIIlIIIII) {
        try {
            final SecretKeySpec llllllllllllIllllllIIIlIIIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIIIlIIIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllllIIIlIIIlIIIll = Cipher.getInstance("Blowfish");
            llllllllllllIllllllIIIlIIIlIIIll.init(MovingSoundMinecartRiding.lIllIlllllIlll[2], llllllllllllIllllllIIIlIIIlIIlII);
            return new String(llllllllllllIllllllIIIlIIIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIIIlIIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllIIIlIIIlIIIlI) {
            llllllllllllIllllllIIIlIIIlIIIlI.printStackTrace();
            return null;
        }
    }
}
