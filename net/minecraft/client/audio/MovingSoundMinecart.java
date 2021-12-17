// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.audio;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.item.EntityMinecart;

public class MovingSoundMinecart extends MovingSound
{
    private /* synthetic */ float distance;
    private final /* synthetic */ EntityMinecart minecart;
    private static final /* synthetic */ int[] lIlllIIlIIllIl;
    private static final /* synthetic */ String[] lIlllIIlIIlIIl;
    
    public MovingSoundMinecart(final EntityMinecart llllllllllllIlllllIlIIIllIIlIllI) {
        super(new ResourceLocation(MovingSoundMinecart.lIlllIIlIIlIIl[MovingSoundMinecart.lIlllIIlIIllIl[0]]));
        this.distance = 0.0f;
        this.minecart = llllllllllllIlllllIlIIIllIIlIllI;
        this.repeat = (MovingSoundMinecart.lIlllIIlIIllIl[1] != 0);
        this.repeatDelay = MovingSoundMinecart.lIlllIIlIIllIl[0];
    }
    
    private static void lIIIIIIllIllllll() {
        (lIlllIIlIIllIl = new int[4])[0] = ((0x55 ^ 0x6E ^ (0x66 ^ 0x7A)) & (145 + 42 - 64 + 32 ^ 17 + 32 + 90 + 49 ^ -" ".length()));
        MovingSoundMinecart.lIlllIIlIIllIl[1] = " ".length();
        MovingSoundMinecart.lIlllIIlIIllIl[2] = (0x12 ^ 0x65 ^ 115 + 114 - 116 + 14);
        MovingSoundMinecart.lIlllIIlIIllIl[3] = "  ".length();
    }
    
    private static boolean lIIIIIIlllIIIIlI(final int llllllllllllIlllllIlIIIlIlllllIl) {
        return llllllllllllIlllllIlIIIlIlllllIl >= 0;
    }
    
    @Override
    public void update() {
        if (lIIIIIIlllIIIIIl(this.minecart.isDead ? 1 : 0)) {
            this.donePlaying = (MovingSoundMinecart.lIlllIIlIIllIl[1] != 0);
            "".length();
            if (((0x10 ^ 0x46) & ~(0x2A ^ 0x7C)) != 0x0) {
                return;
            }
        }
        else {
            this.xPosF = (float)this.minecart.posX;
            this.yPosF = (float)this.minecart.posY;
            this.zPosF = (float)this.minecart.posZ;
            final float llllllllllllIlllllIlIIIllIIlIIII = MathHelper.sqrt_double(this.minecart.motionX * this.minecart.motionX + this.minecart.motionZ * this.minecart.motionZ);
            if (lIIIIIIlllIIIIlI(lIIIIIIlllIIIIII(llllllllllllIlllllIlIIIllIIlIIII, 0.01))) {
                this.distance = MathHelper.clamp_float(this.distance + 0.0025f, 0.0f, 1.0f);
                this.volume = 0.0f + MathHelper.clamp_float(llllllllllllIlllllIlIIIllIIlIIII, 0.0f, 0.5f) * 0.7f;
                "".length();
                if (((0x65 ^ 0x3F) & ~(0x2D ^ 0x77)) <= -" ".length()) {
                    return;
                }
            }
            else {
                this.distance = 0.0f;
                this.volume = 0.0f;
            }
        }
    }
    
    private static int lIIIIIIlllIIIIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    static {
        lIIIIIIllIllllll();
        lIIIIIIllIlllIII();
    }
    
    private static boolean lIIIIIIlllIIIIIl(final int llllllllllllIlllllIlIIIlIlllllll) {
        return llllllllllllIlllllIlIIIlIlllllll != 0;
    }
    
    private static void lIIIIIIllIlllIII() {
        (lIlllIIlIIlIIl = new String[MovingSoundMinecart.lIlllIIlIIllIl[1]])[MovingSoundMinecart.lIlllIIlIIllIl[0]] = lIIIIIIllIllIlll("hFq/XhLiIebSjQVfjFqZtwuUzv7X2qMh", "BvmnF");
    }
    
    private static String lIIIIIIllIllIlll(final String llllllllllllIlllllIlIIIllIIIIllI, final String llllllllllllIlllllIlIIIllIIIIlIl) {
        try {
            final SecretKeySpec llllllllllllIlllllIlIIIllIIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIlIIIllIIIIlIl.getBytes(StandardCharsets.UTF_8)), MovingSoundMinecart.lIlllIIlIIllIl[2]), "DES");
            final Cipher llllllllllllIlllllIlIIIllIIIlIII = Cipher.getInstance("DES");
            llllllllllllIlllllIlIIIllIIIlIII.init(MovingSoundMinecart.lIlllIIlIIllIl[3], llllllllllllIlllllIlIIIllIIIlIIl);
            return new String(llllllllllllIlllllIlIIIllIIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIlIIIllIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIlIIIllIIIIlll) {
            llllllllllllIlllllIlIIIllIIIIlll.printStackTrace();
            return null;
        }
    }
}
