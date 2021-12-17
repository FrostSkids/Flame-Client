// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.audio;

import net.minecraft.util.ResourceLocation;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.monster.EntityGuardian;

public class GuardianSound extends MovingSound
{
    private final /* synthetic */ EntityGuardian guardian;
    private static final /* synthetic */ int[] lIIIIlllllIIII;
    private static final /* synthetic */ String[] lIIIIllllIllll;
    
    private static boolean lIllllIlIIlllll(final int lllllllllllllIlIIIlllIIllllIlllI) {
        return lllllllllllllIlIIIlllIIllllIlllI == 0;
    }
    
    private static void lIllllIlIIllllI() {
        (lIIIIlllllIIII = new int[3])[0] = ((106 + 82 - 115 + 69 ^ 146 + 149 - 183 + 69) & (0x60 ^ 0x41 ^ (0xB1 ^ 0xAB) ^ -" ".length()));
        GuardianSound.lIIIIlllllIIII[1] = " ".length();
        GuardianSound.lIIIIlllllIIII[2] = "  ".length();
    }
    
    private static String lIllllIlIIlllII(final String lllllllllllllIlIIIlllIIlllllIlIl, final String lllllllllllllIlIIIlllIIlllllIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlllIIllllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlllIIlllllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIlllIIllllllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIlllIIllllllIIl.init(GuardianSound.lIIIIlllllIIII[2], lllllllllllllIlIIIlllIIllllllIlI);
            return new String(lllllllllllllIlIIIlllIIllllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlllIIlllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlllIIllllllIII) {
            lllllllllllllIlIIIlllIIllllllIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllllIlIlIIIII(final int lllllllllllllIlIIIlllIIlllllIIII) {
        return lllllllllllllIlIIIlllIIlllllIIII != 0;
    }
    
    @Override
    public void update() {
        if (lIllllIlIIlllll(this.guardian.isDead ? 1 : 0) && lIllllIlIlIIIII(this.guardian.hasTargetedEntity() ? 1 : 0)) {
            this.xPosF = (float)this.guardian.posX;
            this.yPosF = (float)this.guardian.posY;
            this.zPosF = (float)this.guardian.posZ;
            final float lllllllllllllIlIIIlllIlIIIIIIIIl = this.guardian.func_175477_p(0.0f);
            this.volume = 0.0f + 1.0f * lllllllllllllIlIIIlllIlIIIIIIIIl * lllllllllllllIlIIIlllIlIIIIIIIIl;
            this.pitch = 0.7f + 0.5f * lllllllllllllIlIIIlllIlIIIIIIIIl;
            "".length();
            if (((0xE3 ^ 0xBD ^ (0x8 ^ 0x5D)) & (0xFD ^ 0xA3 ^ (0xCF ^ 0x9A) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            this.donePlaying = (GuardianSound.lIIIIlllllIIII[1] != 0);
        }
    }
    
    public GuardianSound(final EntityGuardian lllllllllllllIlIIIlllIlIIIIIIlIl) {
        super(new ResourceLocation(GuardianSound.lIIIIllllIllll[GuardianSound.lIIIIlllllIIII[0]]));
        this.guardian = lllllllllllllIlIIIlllIlIIIIIIlIl;
        this.attenuationType = ISound.AttenuationType.NONE;
        this.repeat = (GuardianSound.lIIIIlllllIIII[1] != 0);
        this.repeatDelay = GuardianSound.lIIIIlllllIIII[0];
    }
    
    private static void lIllllIlIIlllIl() {
        (lIIIIllllIllll = new String[GuardianSound.lIIIIlllllIIII[1]])[GuardianSound.lIIIIlllllIIII[0]] = lIllllIlIIlllII("TFxsReK8zUccDk8HcDuNT4IL1W5OJjpVkurjYMHCSZQ=", "wpiTO");
    }
    
    static {
        lIllllIlIIllllI();
        lIllllIlIIlllIl();
    }
}
