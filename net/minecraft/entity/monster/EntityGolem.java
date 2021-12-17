// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.monster;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.world.World;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.entity.passive.IAnimals;
import net.minecraft.entity.EntityCreature;

public abstract class EntityGolem extends EntityCreature implements IAnimals
{
    private static final /* synthetic */ int[] lllIIllIlllIII;
    private static final /* synthetic */ String[] lllIIllIllIlII;
    
    @Override
    public void fall(final float llllllllllllIlIlllIllllIIIlIllll, final float llllllllllllIlIlllIllllIIIlIlllI) {
    }
    
    @Override
    public int getTalkInterval() {
        return EntityGolem.lllIIllIlllIII[3];
    }
    
    private static String lIlIIIIIIlllllIl(String llllllllllllIlIlllIllllIIIIllIIl, final String llllllllllllIlIlllIllllIIIIllIII) {
        llllllllllllIlIlllIllllIIIIllIIl = (byte)new String(Base64.getDecoder().decode(((String)llllllllllllIlIlllIllllIIIIllIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllIllllIIIIlllII = new StringBuilder();
        final char[] llllllllllllIlIlllIllllIIIIllIll = llllllllllllIlIlllIllllIIIIllIII.toCharArray();
        int llllllllllllIlIlllIllllIIIIllIlI = EntityGolem.lllIIllIlllIII[0];
        final boolean llllllllllllIlIlllIllllIIIIlIlII = (Object)((String)llllllllllllIlIlllIllllIIIIllIIl).toCharArray();
        final String llllllllllllIlIlllIllllIIIIlIIll = (String)llllllllllllIlIlllIllllIIIIlIlII.length;
        boolean llllllllllllIlIlllIllllIIIIlIIlI = EntityGolem.lllIIllIlllIII[0] != 0;
        while (lIlIIIIIlIIIIIll(llllllllllllIlIlllIllllIIIIlIIlI ? 1 : 0, (int)llllllllllllIlIlllIllllIIIIlIIll)) {
            final char llllllllllllIlIlllIllllIIIIlllll = llllllllllllIlIlllIllllIIIIlIlII[llllllllllllIlIlllIllllIIIIlIIlI];
            llllllllllllIlIlllIllllIIIIlllII.append((char)(llllllllllllIlIlllIllllIIIIlllll ^ llllllllllllIlIlllIllllIIIIllIll[llllllllllllIlIlllIllllIIIIllIlI % llllllllllllIlIlllIllllIIIIllIll.length]));
            "".length();
            ++llllllllllllIlIlllIllllIIIIllIlI;
            ++llllllllllllIlIlllIllllIIIIlIIlI;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllIllllIIIIlllII);
    }
    
    @Override
    protected String getLivingSound() {
        return EntityGolem.lllIIllIllIlII[EntityGolem.lllIIllIlllIII[0]];
    }
    
    @Override
    protected boolean canDespawn() {
        return EntityGolem.lllIIllIlllIII[0] != 0;
    }
    
    @Override
    protected String getHurtSound() {
        return EntityGolem.lllIIllIllIlII[EntityGolem.lllIIllIlllIII[1]];
    }
    
    private static void lIlIIIIIlIIIIIlI() {
        (lllIIllIlllIII = new int[5])[0] = ((0xF7 ^ 0xB4 ^ (0x5B ^ 0x9)) & (136 + 159 - 180 + 60 ^ 75 + 19 + 11 + 85 ^ -" ".length()));
        EntityGolem.lllIIllIlllIII[1] = " ".length();
        EntityGolem.lllIIllIlllIII[2] = "  ".length();
        EntityGolem.lllIIllIlllIII[3] = (93 + 181 - 231 + 166 ^ 164 + 46 - 152 + 111);
        EntityGolem.lllIIllIlllIII[4] = "   ".length();
    }
    
    @Override
    protected String getDeathSound() {
        return EntityGolem.lllIIllIllIlII[EntityGolem.lllIIllIlllIII[2]];
    }
    
    private static boolean lIlIIIIIlIIIIIll(final int llllllllllllIlIlllIllllIIIIIIIIl, final int llllllllllllIlIlllIllllIIIIIIIII) {
        return llllllllllllIlIlllIllllIIIIIIIIl < llllllllllllIlIlllIllllIIIIIIIII;
    }
    
    public EntityGolem(final World llllllllllllIlIlllIllllIIIllIIIl) {
        super(llllllllllllIlIlllIllllIIIllIIIl);
    }
    
    private static String lIlIIIIIIllllllI(final String llllllllllllIlIlllIllllIIIIIlIIl, final String llllllllllllIlIlllIllllIIIIIlIII) {
        try {
            final SecretKeySpec llllllllllllIlIlllIllllIIIIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIllllIIIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllIllllIIIIIlIll = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllIllllIIIIIlIll.init(EntityGolem.lllIIllIlllIII[2], llllllllllllIlIlllIllllIIIIIllII);
            return new String(llllllllllllIlIlllIllllIIIIIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIllllIIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIllllIIIIIlIlI) {
            llllllllllllIlIlllIllllIIIIIlIlI.printStackTrace();
            return null;
        }
    }
    
    static {
        lIlIIIIIlIIIIIlI();
        lIlIIIIIIlllllll();
    }
    
    private static void lIlIIIIIIlllllll() {
        (lllIIllIllIlII = new String[EntityGolem.lllIIllIlllIII[4]])[EntityGolem.lllIIllIlllIII[0]] = lIlIIIIIIlllllIl("JBoNIw==", "JucFW");
        EntityGolem.lllIIllIllIlII[EntityGolem.lllIIllIlllIII[1]] = lIlIIIIIIllllllI("ZnWk5T5VkP0=", "MJZhI");
        EntityGolem.lllIIllIllIlII[EntityGolem.lllIIllIlllIII[2]] = lIlIIIIIIllllllI("EyLd1QNaudo=", "ivoNz");
    }
}
