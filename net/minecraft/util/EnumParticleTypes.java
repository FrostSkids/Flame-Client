// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.util.Arrays;
import java.util.List;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Map;

public enum EnumParticleTypes
{
    EXPLOSION_LARGE(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[2]], EnumParticleTypes.llIllllIIIllII[1], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[3]], EnumParticleTypes.llIllllIIIllII[1], (boolean)(EnumParticleTypes.llIllllIIIllII[1] != 0)), 
    NOTE(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[46]], EnumParticleTypes.llIllllIIIllII[23], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[47]], EnumParticleTypes.llIllllIIIllII[23], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    FOOTSTEP(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[56]], EnumParticleTypes.llIllllIIIllII[28], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[57]], EnumParticleTypes.llIllllIIIllII[28], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    CRIT(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[18]], EnumParticleTypes.llIllllIIIllII[9], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[19]], EnumParticleTypes.llIllllIIIllII[9], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    SNOWBALL(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[62]], EnumParticleTypes.llIllllIIIllII[31], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[63]], EnumParticleTypes.llIllllIIIllII[31], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    FLAME(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[52]], EnumParticleTypes.llIllllIIIllII[26], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[53]], EnumParticleTypes.llIllllIIIllII[26], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    SMOKE_NORMAL(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[22]], EnumParticleTypes.llIllllIIIllII[11], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[23]], EnumParticleTypes.llIllllIIIllII[11], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    VILLAGER_ANGRY(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[40]], EnumParticleTypes.llIllllIIIllII[20], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[41]], EnumParticleTypes.llIllllIIIllII[20], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    DRIP_LAVA(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[38]], EnumParticleTypes.llIllllIIIllII[19], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[39]], EnumParticleTypes.llIllllIIIllII[19], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    SLIME(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[66]], EnumParticleTypes.llIllllIIIllII[33], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[67]], EnumParticleTypes.llIllllIIIllII[33], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    WATER_DROP(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[78]], EnumParticleTypes.llIllllIIIllII[39], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[79]], EnumParticleTypes.llIllllIIIllII[39], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    SUSPENDED_DEPTH(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[16]], EnumParticleTypes.llIllllIIIllII[8], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[17]], EnumParticleTypes.llIllllIIIllII[8], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    SUSPENDED(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[14]], EnumParticleTypes.llIllllIIIllII[7], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[15]], EnumParticleTypes.llIllllIIIllII[7], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    REDSTONE(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[60]], EnumParticleTypes.llIllllIIIllII[30], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[61]], EnumParticleTypes.llIllllIIIllII[30], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    SPELL_MOB(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[30]], EnumParticleTypes.llIllllIIIllII[15], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[31]], EnumParticleTypes.llIllllIIIllII[15], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    BLOCK_DUST(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[76]], EnumParticleTypes.llIllllIIIllII[38], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[77]], EnumParticleTypes.llIllllIIIllII[38], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0), EnumParticleTypes.llIllllIIIllII[1]), 
    ENCHANTMENT_TABLE(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[50]], EnumParticleTypes.llIllllIIIllII[25], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[51]], EnumParticleTypes.llIllllIIIllII[25], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    BARRIER(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[70]], EnumParticleTypes.llIllllIIIllII[35], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[71]], EnumParticleTypes.llIllllIIIllII[35], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    SPELL_WITCH(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[34]], EnumParticleTypes.llIllllIIIllII[17], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[35]], EnumParticleTypes.llIllllIIIllII[17], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    EXPLOSION_HUGE(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[4]], EnumParticleTypes.llIllllIIIllII[2], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[5]], EnumParticleTypes.llIllllIIIllII[2], (boolean)(EnumParticleTypes.llIllllIIIllII[1] != 0)), 
    HEART(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[68]], EnumParticleTypes.llIllllIIIllII[34], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[69]], EnumParticleTypes.llIllllIIIllII[34], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0));
    
    private static final /* synthetic */ String[] PARTICLE_NAMES;
    
    SNOW_SHOVEL(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[64]], EnumParticleTypes.llIllllIIIllII[32], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[65]], EnumParticleTypes.llIllllIIIllII[32], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    FIREWORKS_SPARK(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[6]], EnumParticleTypes.llIllllIIIllII[3], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[7]], EnumParticleTypes.llIllllIIIllII[3], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    WATER_BUBBLE(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[8]], EnumParticleTypes.llIllllIIIllII[4], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[9]], EnumParticleTypes.llIllllIIIllII[4], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    PORTAL(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[48]], EnumParticleTypes.llIllllIIIllII[24], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[49]], EnumParticleTypes.llIllllIIIllII[24], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0));
    
    private static final /* synthetic */ int[] llIllllIIIllII;
    private final /* synthetic */ int argumentCount;
    private static final /* synthetic */ String[] llIlllIlIIlIlI;
    
    ITEM_TAKE(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[80]], EnumParticleTypes.llIllllIIIllII[40], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[81]], EnumParticleTypes.llIllllIIIllII[40], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0));
    
    private static final /* synthetic */ Map<Integer, EnumParticleTypes> PARTICLES;
    private final /* synthetic */ String particleName;
    
    BLOCK_CRACK(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[74]], EnumParticleTypes.llIllllIIIllII[37], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[75]], EnumParticleTypes.llIllllIIIllII[37], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0), EnumParticleTypes.llIllllIIIllII[1]), 
    SPELL_INSTANT(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[28]], EnumParticleTypes.llIllllIIIllII[14], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[29]], EnumParticleTypes.llIllllIIIllII[14], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    EXPLOSION_NORMAL(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[0]], EnumParticleTypes.llIllllIIIllII[0], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[1]], EnumParticleTypes.llIllllIIIllII[0], (boolean)(EnumParticleTypes.llIllllIIIllII[1] != 0)), 
    SPELL(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[26]], EnumParticleTypes.llIllllIIIllII[13], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[27]], EnumParticleTypes.llIllllIIIllII[13], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    TOWN_AURA(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[44]], EnumParticleTypes.llIllllIIIllII[22], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[45]], EnumParticleTypes.llIllllIIIllII[22], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    CLOUD(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[58]], EnumParticleTypes.llIllllIIIllII[29], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[59]], EnumParticleTypes.llIllllIIIllII[29], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    LAVA(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[54]], EnumParticleTypes.llIllllIIIllII[27], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[55]], EnumParticleTypes.llIllllIIIllII[27], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0));
    
    private final /* synthetic */ boolean shouldIgnoreRange;
    
    CRIT_MAGIC(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[20]], EnumParticleTypes.llIllllIIIllII[10], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[21]], EnumParticleTypes.llIllllIIIllII[10], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    SMOKE_LARGE(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[24]], EnumParticleTypes.llIllllIIIllII[12], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[25]], EnumParticleTypes.llIllllIIIllII[12], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    DRIP_WATER(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[36]], EnumParticleTypes.llIllllIIIllII[18], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[37]], EnumParticleTypes.llIllllIIIllII[18], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0));
    
    private final /* synthetic */ int particleID;
    
    VILLAGER_HAPPY(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[42]], EnumParticleTypes.llIllllIIIllII[21], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[43]], EnumParticleTypes.llIllllIIIllII[21], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    MOB_APPEARANCE(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[82]], EnumParticleTypes.llIllllIIIllII[41], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[83]], EnumParticleTypes.llIllllIIIllII[41], (boolean)(EnumParticleTypes.llIllllIIIllII[1] != 0)), 
    ITEM_CRACK(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[72]], EnumParticleTypes.llIllllIIIllII[36], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[73]], EnumParticleTypes.llIllllIIIllII[36], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0), EnumParticleTypes.llIllllIIIllII[2]), 
    WATER_WAKE(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[12]], EnumParticleTypes.llIllllIIIllII[6], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[13]], EnumParticleTypes.llIllllIIIllII[6], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    SPELL_MOB_AMBIENT(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[32]], EnumParticleTypes.llIllllIIIllII[16], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[33]], EnumParticleTypes.llIllllIIIllII[16], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0)), 
    WATER_SPLASH(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[10]], EnumParticleTypes.llIllllIIIllII[5], EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[11]], EnumParticleTypes.llIllllIIIllII[5], (boolean)(EnumParticleTypes.llIllllIIIllII[0] != 0));
    
    private static String lIIllIIllIlIlIII(final String llllllllllllIllIIIllllllllIlIlII, final String llllllllllllIllIIIllllllllIlIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIllllllllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllllllllIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIllllllllIlIllI = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIllllllllIlIllI.init(EnumParticleTypes.llIllllIIIllII[2], llllllllllllIllIIIllllllllIlIlll);
            return new String(llllllllllllIllIIIllllllllIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllllllllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIllllllllIlIlIl) {
            llllllllllllIllIIIllllllllIlIlIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIllIlIIlIIllIl();
        lIIllIIlllIllIll();
        final EnumParticleTypes[] enum$VALUES = new EnumParticleTypes[EnumParticleTypes.llIllllIIIllII[42]];
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[0]] = EnumParticleTypes.EXPLOSION_NORMAL;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[1]] = EnumParticleTypes.EXPLOSION_LARGE;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[2]] = EnumParticleTypes.EXPLOSION_HUGE;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[3]] = EnumParticleTypes.FIREWORKS_SPARK;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[4]] = EnumParticleTypes.WATER_BUBBLE;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[5]] = EnumParticleTypes.WATER_SPLASH;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[6]] = EnumParticleTypes.WATER_WAKE;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[7]] = EnumParticleTypes.SUSPENDED;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[8]] = EnumParticleTypes.SUSPENDED_DEPTH;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[9]] = EnumParticleTypes.CRIT;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[10]] = EnumParticleTypes.CRIT_MAGIC;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[11]] = EnumParticleTypes.SMOKE_NORMAL;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[12]] = EnumParticleTypes.SMOKE_LARGE;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[13]] = EnumParticleTypes.SPELL;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[14]] = EnumParticleTypes.SPELL_INSTANT;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[15]] = EnumParticleTypes.SPELL_MOB;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[16]] = EnumParticleTypes.SPELL_MOB_AMBIENT;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[17]] = EnumParticleTypes.SPELL_WITCH;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[18]] = EnumParticleTypes.DRIP_WATER;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[19]] = EnumParticleTypes.DRIP_LAVA;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[20]] = EnumParticleTypes.VILLAGER_ANGRY;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[21]] = EnumParticleTypes.VILLAGER_HAPPY;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[22]] = EnumParticleTypes.TOWN_AURA;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[23]] = EnumParticleTypes.NOTE;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[24]] = EnumParticleTypes.PORTAL;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[25]] = EnumParticleTypes.ENCHANTMENT_TABLE;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[26]] = EnumParticleTypes.FLAME;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[27]] = EnumParticleTypes.LAVA;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[28]] = EnumParticleTypes.FOOTSTEP;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[29]] = EnumParticleTypes.CLOUD;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[30]] = EnumParticleTypes.REDSTONE;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[31]] = EnumParticleTypes.SNOWBALL;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[32]] = EnumParticleTypes.SNOW_SHOVEL;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[33]] = EnumParticleTypes.SLIME;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[34]] = EnumParticleTypes.HEART;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[35]] = EnumParticleTypes.BARRIER;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[36]] = EnumParticleTypes.ITEM_CRACK;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[37]] = EnumParticleTypes.BLOCK_CRACK;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[38]] = EnumParticleTypes.BLOCK_DUST;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[39]] = EnumParticleTypes.WATER_DROP;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[40]] = EnumParticleTypes.ITEM_TAKE;
        enum$VALUES[EnumParticleTypes.llIllllIIIllII[41]] = EnumParticleTypes.MOB_APPEARANCE;
        ENUM$VALUES = enum$VALUES;
        PARTICLES = Maps.newHashMap();
        final List<String> llllllllllllIllIIlIIIIIIIIlIllII = (List<String>)Lists.newArrayList();
        final long llllllllllllIllIIlIIIIIIIIlIIllI;
        final float llllllllllllIllIIlIIIIIIIIlIIlll = ((EnumParticleTypes[])(Object)(llllllllllllIllIIlIIIIIIIIlIIllI = (long)(Object)values())).length;
        boolean llllllllllllIllIIlIIIIIIIIlIlIII = EnumParticleTypes.llIllllIIIllII[0] != 0;
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIllIlIIlIIllll(llllllllllllIllIIlIIIIIIIIlIlIII ? 1 : 0, (int)llllllllllllIllIIlIIIIIIIIlIIlll)) {
            final EnumParticleTypes llllllllllllIllIIlIIIIIIIIlIlIll = llllllllllllIllIIlIIIIIIIIlIIllI[llllllllllllIllIIlIIIIIIIIlIlIII];
            EnumParticleTypes.PARTICLES.put(llllllllllllIllIIlIIIIIIIIlIlIll.getParticleID(), llllllllllllIllIIlIIIIIIIIlIlIll);
            "".length();
            if (lIIllIlIIlIIlllI(llllllllllllIllIIlIIIIIIIIlIlIll.getParticleName().endsWith(EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[84]]) ? 1 : 0)) {
                llllllllllllIllIIlIIIIIIIIlIllII.add(llllllllllllIllIIlIIIIIIIIlIlIll.getParticleName());
                "".length();
            }
            ++llllllllllllIllIIlIIIIIIIIlIlIII;
        }
        PARTICLE_NAMES = llllllllllllIllIIlIIIIIIIIlIllII.toArray(new String[llllllllllllIllIIlIIIIIIIIlIllII.size()]);
    }
    
    public int getArgumentCount() {
        return this.argumentCount;
    }
    
    private static boolean lIIllIlIIlIlIIIl(final int llllllllllllIllIIIlllllllIllIIII, final int llllllllllllIllIIIlllllllIlIllll) {
        return llllllllllllIllIIIlllllllIllIIII < llllllllllllIllIIIlllllllIlIllll;
    }
    
    private EnumParticleTypes(final String llllllllllllIllIIlIIIIIIIIIllIII, final int llllllllllllIllIIlIIIIIIIIIlIlll, final String llllllllllllIllIIlIIIIIIIIIlIllI, final int llllllllllllIllIIlIIIIIIIIIlIlIl, final boolean llllllllllllIllIIlIIIIIIIIIlIlII, final int llllllllllllIllIIlIIIIIIIIIlIIll) {
        this.particleName = llllllllllllIllIIlIIIIIIIIIlIllI;
        this.particleID = llllllllllllIllIIlIIIIIIIIIlIlIl;
        this.shouldIgnoreRange = llllllllllllIllIIlIIIIIIIIIlIlII;
        this.argumentCount = llllllllllllIllIIlIIIIIIIIIlIIll;
    }
    
    public static String[] getParticleNames() {
        return EnumParticleTypes.PARTICLE_NAMES;
    }
    
    public int getParticleID() {
        return this.particleID;
    }
    
    private static boolean lIIllIlIIlIIllll(final int llllllllllllIllIIIlllllllIllIlII, final int llllllllllllIllIIIlllllllIllIIll) {
        return llllllllllllIllIIIlllllllIllIlII >= llllllllllllIllIIIlllllllIllIIll;
    }
    
    private static void lIIllIlIIlIIllIl() {
        (llIllllIIIllII = new int[86])[0] = ((86 + 121 - 201 + 125 ^ 133 + 152 - 258 + 131) & (101 + 16 - 25 + 64 ^ 27 + 28 - 52 + 126 ^ -" ".length()));
        EnumParticleTypes.llIllllIIIllII[1] = " ".length();
        EnumParticleTypes.llIllllIIIllII[2] = "  ".length();
        EnumParticleTypes.llIllllIIIllII[3] = "   ".length();
        EnumParticleTypes.llIllllIIIllII[4] = (0x29 ^ 0x6F ^ (0x61 ^ 0x23));
        EnumParticleTypes.llIllllIIIllII[5] = (0x0 ^ 0x62 ^ (0x42 ^ 0x25));
        EnumParticleTypes.llIllllIIIllII[6] = (0x94 ^ 0x9D ^ (0x3B ^ 0x34));
        EnumParticleTypes.llIllllIIIllII[7] = (0x46 ^ 0x41);
        EnumParticleTypes.llIllllIIIllII[8] = (0x35 ^ 0x3D);
        EnumParticleTypes.llIllllIIIllII[9] = (0x5F ^ 0x56);
        EnumParticleTypes.llIllllIIIllII[10] = (0x1E ^ 0x78 ^ (0x6C ^ 0x0));
        EnumParticleTypes.llIllllIIIllII[11] = (0x47 ^ 0x3A ^ (0x7D ^ 0xB));
        EnumParticleTypes.llIllllIIIllII[12] = (0x8B ^ 0x87);
        EnumParticleTypes.llIllllIIIllII[13] = (73 + 70 - 56 + 50 ^ 2 + 128 - 126 + 128);
        EnumParticleTypes.llIllllIIIllII[14] = (0x4F ^ 0x3A ^ (0x74 ^ 0xF));
        EnumParticleTypes.llIllllIIIllII[15] = (0xB8 ^ 0xB7);
        EnumParticleTypes.llIllllIIIllII[16] = (0xD ^ 0x7D ^ (0x20 ^ 0x40));
        EnumParticleTypes.llIllllIIIllII[17] = (0x66 ^ 0x77);
        EnumParticleTypes.llIllllIIIllII[18] = (0x40 ^ 0x68 ^ (0x85 ^ 0xBF));
        EnumParticleTypes.llIllllIIIllII[19] = (0x7 ^ 0x24 ^ (0x6 ^ 0x36));
        EnumParticleTypes.llIllllIIIllII[20] = (0xF3 ^ 0xBA ^ (0x46 ^ 0x1B));
        EnumParticleTypes.llIllllIIIllII[21] = (0xB5 ^ 0xA0);
        EnumParticleTypes.llIllllIIIllII[22] = (110 + 108 - 41 + 14 ^ 24 + 3 - 13 + 155);
        EnumParticleTypes.llIllllIIIllII[23] = (0x68 ^ 0x7F);
        EnumParticleTypes.llIllllIIIllII[24] = (120 + 83 - 96 + 81 ^ 126 + 16 - 18 + 40);
        EnumParticleTypes.llIllllIIIllII[25] = (0x24 ^ 0x3D);
        EnumParticleTypes.llIllllIIIllII[26] = (0xB6 ^ 0xC5 ^ (0xDB ^ 0xB2));
        EnumParticleTypes.llIllllIIIllII[27] = (80 + 143 - 109 + 35 ^ 78 + 120 - 99 + 43);
        EnumParticleTypes.llIllllIIIllII[28] = (0x8B ^ 0x97);
        EnumParticleTypes.llIllllIIIllII[29] = (0x63 ^ 0x7A ^ (0xD ^ 0x9));
        EnumParticleTypes.llIllllIIIllII[30] = (0x8E ^ 0x90);
        EnumParticleTypes.llIllllIIIllII[31] = (0x77 ^ 0x68);
        EnumParticleTypes.llIllllIIIllII[32] = (129 + 100 - 118 + 43 ^ 38 + 22 + 73 + 53);
        EnumParticleTypes.llIllllIIIllII[33] = (0x43 ^ 0x62);
        EnumParticleTypes.llIllllIIIllII[34] = (0x2C ^ 0xE);
        EnumParticleTypes.llIllllIIIllII[35] = (0x48 ^ 0x6B);
        EnumParticleTypes.llIllllIIIllII[36] = (0xAE ^ 0x8A);
        EnumParticleTypes.llIllllIIIllII[37] = (0x4 ^ 0x21);
        EnumParticleTypes.llIllllIIIllII[38] = (0x6B ^ 0x4D);
        EnumParticleTypes.llIllllIIIllII[39] = (0x91 ^ 0xB6);
        EnumParticleTypes.llIllllIIIllII[40] = (0xAE ^ 0xA7 ^ (0xBE ^ 0x9F));
        EnumParticleTypes.llIllllIIIllII[41] = (0xD3 ^ 0x87 ^ (0xDC ^ 0xA1));
        EnumParticleTypes.llIllllIIIllII[42] = (0x41 ^ 0x74 ^ (0x9B ^ 0x84));
        EnumParticleTypes.llIllllIIIllII[43] = (0x4E ^ 0x56 ^ (0x73 ^ 0x40));
        EnumParticleTypes.llIllllIIIllII[44] = (0x38 ^ 0x49 ^ (0x41 ^ 0x1C));
        EnumParticleTypes.llIllllIIIllII[45] = (0xEF ^ 0xC2);
        EnumParticleTypes.llIllllIIIllII[46] = (0xAB ^ 0x85);
        EnumParticleTypes.llIllllIIIllII[47] = (0xBA ^ 0x95);
        EnumParticleTypes.llIllllIIIllII[48] = (0xF3 ^ 0xC3);
        EnumParticleTypes.llIllllIIIllII[49] = (0x74 ^ 0x45);
        EnumParticleTypes.llIllllIIIllII[50] = (0x87 ^ 0x8D ^ (0x23 ^ 0x1B));
        EnumParticleTypes.llIllllIIIllII[51] = (158 + 138 - 137 + 11 ^ 118 + 31 - 38 + 42);
        EnumParticleTypes.llIllllIIIllII[52] = (0xB8 ^ 0x9B ^ (0x57 ^ 0x40));
        EnumParticleTypes.llIllllIIIllII[53] = (0x6B ^ 0x2B ^ (0x44 ^ 0x31));
        EnumParticleTypes.llIllllIIIllII[54] = (0xF6 ^ 0xC0);
        EnumParticleTypes.llIllllIIIllII[55] = (0xAE ^ 0x99);
        EnumParticleTypes.llIllllIIIllII[56] = (0x1E ^ 0x26);
        EnumParticleTypes.llIllllIIIllII[57] = (0xC5 ^ 0xBF ^ (0x2B ^ 0x68));
        EnumParticleTypes.llIllllIIIllII[58] = (0x92 ^ 0xA8);
        EnumParticleTypes.llIllllIIIllII[59] = (0x12 ^ 0x29);
        EnumParticleTypes.llIllllIIIllII[60] = (0xB3 ^ 0xB5 ^ (0xFA ^ 0xC0));
        EnumParticleTypes.llIllllIIIllII[61] = (0xF ^ 0x3E ^ (0xB0 ^ 0xBC));
        EnumParticleTypes.llIllllIIIllII[62] = (0x2B ^ 0x15);
        EnumParticleTypes.llIllllIIIllII[63] = (0 + 83 + 69 + 16 ^ 64 + 78 - 86 + 95);
        EnumParticleTypes.llIllllIIIllII[64] = (0x5A ^ 0x1A);
        EnumParticleTypes.llIllllIIIllII[65] = (0xE6 ^ 0xA7);
        EnumParticleTypes.llIllllIIIllII[66] = (0x7A ^ 0x2A ^ (0x2B ^ 0x39));
        EnumParticleTypes.llIllllIIIllII[67] = (148 + 96 - 239 + 202 ^ 105 + 18 - 69 + 86);
        EnumParticleTypes.llIllllIIIllII[68] = (0x7D ^ 0x1F ^ (0x91 ^ 0xB7));
        EnumParticleTypes.llIllllIIIllII[69] = (0x23 ^ 0x66);
        EnumParticleTypes.llIllllIIIllII[70] = (0x42 ^ 0x4);
        EnumParticleTypes.llIllllIIIllII[71] = (0x27 ^ 0x60);
        EnumParticleTypes.llIllllIIIllII[72] = (0xF8 ^ 0xB0);
        EnumParticleTypes.llIllllIIIllII[73] = (157 + 205 - 237 + 89 ^ 140 + 2 - 63 + 80);
        EnumParticleTypes.llIllllIIIllII[74] = (0xF9 ^ 0xA8 ^ (0x38 ^ 0x23));
        EnumParticleTypes.llIllllIIIllII[75] = (0x25 ^ 0xD ^ (0x28 ^ 0x4B));
        EnumParticleTypes.llIllllIIIllII[76] = (101 + 62 - 80 + 170 ^ 42 + 13 + 53 + 69);
        EnumParticleTypes.llIllllIIIllII[77] = (0xD4 ^ 0x99);
        EnumParticleTypes.llIllllIIIllII[78] = (0xD7 ^ 0x99);
        EnumParticleTypes.llIllllIIIllII[79] = (0x2A ^ 0x65);
        EnumParticleTypes.llIllllIIIllII[80] = (159 + 217 - 321 + 172 ^ 57 + 129 - 157 + 150);
        EnumParticleTypes.llIllllIIIllII[81] = (212 + 152 - 272 + 141 ^ 4 + 20 + 136 + 24);
        EnumParticleTypes.llIllllIIIllII[82] = (0x91 ^ 0xC3);
        EnumParticleTypes.llIllllIIIllII[83] = (0x4E ^ 0x45 ^ (0x52 ^ 0xA));
        EnumParticleTypes.llIllllIIIllII[84] = (0xFE ^ 0xAA);
        EnumParticleTypes.llIllllIIIllII[85] = (0x25 ^ 0x70);
    }
    
    public boolean hasArguments() {
        if (lIIllIlIIlIlIIII(this.argumentCount)) {
            return EnumParticleTypes.llIllllIIIllII[1] != 0;
        }
        return EnumParticleTypes.llIllllIIIllII[0] != 0;
    }
    
    private static String lIIllIIllIlIIllI(final String llllllllllllIllIIIlllllllllIIIIl, final String llllllllllllIllIIIllllllllIllllI) {
        try {
            final SecretKeySpec llllllllllllIllIIIlllllllllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllllllllIllllI.getBytes(StandardCharsets.UTF_8)), EnumParticleTypes.llIllllIIIllII[8]), "DES");
            final Cipher llllllllllllIllIIIlllllllllIIIll = Cipher.getInstance("DES");
            llllllllllllIllIIIlllllllllIIIll.init(EnumParticleTypes.llIllllIIIllII[2], llllllllllllIllIIIlllllllllIIlII);
            return new String(llllllllllllIllIIIlllllllllIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlllllllllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIlllllllllIIIlI) {
            llllllllllllIllIIIlllllllllIIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllIlIIlIlIIII(final int llllllllllllIllIIIlllllllIlIlIll) {
        return llllllllllllIllIIIlllllllIlIlIll > 0;
    }
    
    public boolean getShouldIgnoreRange() {
        return this.shouldIgnoreRange;
    }
    
    public static EnumParticleTypes getParticleFromId(final int llllllllllllIllIIIllllllllllIIlI) {
        return EnumParticleTypes.PARTICLES.get(llllllllllllIllIIIllllllllllIIlI);
    }
    
    private static boolean lIIllIlIIlIIlllI(final int llllllllllllIllIIIlllllllIlIllIl) {
        return llllllllllllIllIIIlllllllIlIllIl == 0;
    }
    
    private static String lIIllIIllIlIIlll(String llllllllllllIllIIIlllllllIllllll, final String llllllllllllIllIIIlllllllIlllllI) {
        llllllllllllIllIIIlllllllIllllll = new String(Base64.getDecoder().decode(llllllllllllIllIIIlllllllIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIllllllllIIIIlI = new StringBuilder();
        final char[] llllllllllllIllIIIllllllllIIIIIl = llllllllllllIllIIIlllllllIlllllI.toCharArray();
        int llllllllllllIllIIIllllllllIIIIII = EnumParticleTypes.llIllllIIIllII[0];
        final Exception llllllllllllIllIIIlllllllIlllIlI = (Object)llllllllllllIllIIIlllllllIllllll.toCharArray();
        final int llllllllllllIllIIIlllllllIlllIIl = llllllllllllIllIIIlllllllIlllIlI.length;
        long llllllllllllIllIIIlllllllIlllIII = EnumParticleTypes.llIllllIIIllII[0];
        while (lIIllIlIIlIlIIIl((int)llllllllllllIllIIIlllllllIlllIII, llllllllllllIllIIIlllllllIlllIIl)) {
            final char llllllllllllIllIIIllllllllIIIlIl = llllllllllllIllIIIlllllllIlllIlI[llllllllllllIllIIIlllllllIlllIII];
            llllllllllllIllIIIllllllllIIIIlI.append((char)(llllllllllllIllIIIllllllllIIIlIl ^ llllllllllllIllIIIllllllllIIIIIl[llllllllllllIllIIIllllllllIIIIII % llllllllllllIllIIIllllllllIIIIIl.length]));
            "".length();
            ++llllllllllllIllIIIllllllllIIIIII;
            ++llllllllllllIllIIIlllllllIlllIII;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIllllllllIIIIlI);
    }
    
    private EnumParticleTypes(final String llllllllllllIllIIlIIIIIIIIIIIlll, final int llllllllllllIllIIlIIIIIIIIIIIllI, final String llllllllllllIllIIlIIIIIIIIIIIlIl, final int llllllllllllIllIIlIIIIIIIIIIIlII, final boolean llllllllllllIllIIlIIIIIIIIIIlIIl) {
        this(llllllllllllIllIIlIIIIIIIIIIIlll, llllllllllllIllIIlIIIIIIIIIIIllI, llllllllllllIllIIlIIIIIIIIIIIlIl, llllllllllllIllIIlIIIIIIIIIIIlII, llllllllllllIllIIlIIIIIIIIIIlIIl, EnumParticleTypes.llIllllIIIllII[0]);
    }
    
    private static void lIIllIIlllIllIll() {
        (llIlllIlIIlIlI = new String[EnumParticleTypes.llIllllIIIllII[85]])[EnumParticleTypes.llIllllIIIllII[0]] = lIIllIIllIlIIllI("FVicRO84aRLD/ZOBIiG/LA8q3l1ewlk8", "eNDhq");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[1]] = lIIllIIllIlIIllI("o2lpQ7d51z8=", "ttQpp");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[2]] = lIIllIIllIlIIllI("LRfvvNWmAwEjU6ygAWTsXA==", "VWtOx");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[3]] = lIIllIIllIlIIllI("8qPwOxjk2gJEzrJz0No39w==", "tGwWX");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[4]] = lIIllIIllIlIIllI("HF/RAzLxREfQb2hi+A4EpQ==", "YyqGQ");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[5]] = lIIllIIllIlIIlll("Bw8wKxYXCjshAAYVOQ==", "ozWNs");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[6]] = lIIllIIllIlIIllI("ouF2QnAx7OV2Qz/Ugu/8Fg==", "xvPJr");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[7]] = lIIllIIllIlIlIII("QcZC8+nGcXRbEHffh1OqLA==", "XWLKE");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[8]] = lIIllIIllIlIIllI("EGyZnztppfOJcreDH46BUQ==", "ZNZTx");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[9]] = lIIllIIllIlIlIII("ksi+YgMeDwE=", "XQpxx");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[10]] = lIIllIIllIlIIlll("DgAQADYGEhQJJQoJ", "YADEd");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[11]] = lIIllIIllIlIlIII("qKTUVt+1vVc=", "amWob");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[12]] = lIIllIIllIlIIlll("BgIWFx0OFAMZCg==", "QCBRO");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[13]] = lIIllIIllIlIlIII("hy42rMGJQ9Q=", "YMHqz");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[14]] = lIIllIIllIlIlIII("YRRgDnY7nY3p1k7nrNmx8Q==", "fWgMs");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[15]] = lIIllIIllIlIlIII("oIBNOCYn87cKGKN8qd4t9A==", "oPhpR");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[16]] = lIIllIIllIlIIlll("NAULAjEpFB0WKyMVCAY8", "gPXRt");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[17]] = lIIllIIllIlIlIII("EARA7u3EpRPmTHMBbhp+qQ==", "IvPQR");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[18]] = lIIllIIllIlIlIII("/hA7P4Ia6qQ=", "rEhjU");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[19]] = lIIllIIllIlIIllI("U11kyo0D+bM=", "sCHJK");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[20]] = lIIllIIllIlIIlll("OTkwECk3Kj4NNQ==", "zkyDv");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[21]] = lIIllIIllIlIlIII("M43cnnL29QaAHXS6jlJbTQ==", "AnUiz");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[22]] = lIIllIIllIlIlIII("GS9N1iusdyey33gJ4XGFLg==", "odPLC");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[23]] = lIIllIIllIlIlIII("OEarXNI3QcQ=", "Ohune");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[24]] = lIIllIIllIlIIllI("rk8ojWI/DdXBedwjs0zXHA==", "AarPX");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[25]] = lIIllIIllIlIlIII("HKzIND1vJYuI8DtqC5gQ7A==", "LkZxs");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[26]] = lIIllIIllIlIIllI("InFrCBSqTMA=", "nfYgR");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[27]] = lIIllIIllIlIlIII("j3qftI9s2kQ=", "fRgur");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[28]] = lIIllIIllIlIIlll("BDg1GRgIIT4GABYmJA==", "WhpUT");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[29]] = lIIllIIllIlIIlll("GxoUPjMcADQ6Nx4Y", "rtgJR");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[30]] = lIIllIIllIlIIlll("JhYILTwqCwIj", "uFMap");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[31]] = lIIllIIllIlIIllI("fsY+Q+CU7qmyX1Lnpj8icw==", "gEFHP");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[32]] = lIIllIIllIlIIlll("KR49LQ8lAzcjHDsDOigGNBo=", "zNxaC");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[33]] = lIIllIIllIlIIlll("HwcbBAcXBBUWGhABHDkD", "rhyWw");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[34]] = lIIllIIllIlIIllI("hr+ixwr5C2LpM5wA6bDFbg==", "QBpog");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[35]] = lIIllIIllIlIIllI("YU2axFoy6Ir393XR1C/jUQ==", "LHpla");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[36]] = lIIllIIllIlIIllI("qyjys0Gav5VlJA7Q5d2dPw==", "XuJQm");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[37]] = lIIllIIllIlIlIII("LuIqj2i4WcF+Piqt1Gl8OA==", "LktcK");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[38]] = lIIllIIllIlIIllI("xhNHP/3qdjrpJLzR1GulGg==", "OQOck");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[39]] = lIIllIIllIlIlIII("OrWsRYg3fviaM4rQZvaIjA==", "EBOXs");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[40]] = lIIllIIllIlIlIII("NHrm6Uvy1Wc5SI4l/4zv0A==", "CQdXl");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[41]] = lIIllIIllIlIIllI("limt07qCZnAh9Vep5uhOxg==", "bkejY");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[42]] = lIIllIIllIlIIllI("so5YVrUxGuh8YgenEQGqRA==", "Fcvkm");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[43]] = lIIllIIllIlIlIII("MyETyKz7NgIGd9mY/D+0gA==", "hVPRQ");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[44]] = lIIllIIllIlIIlll("Ah0nJz0XByIo", "VRpib");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[45]] = lIIllIIllIlIlIII("K3NY2NOlA5eT9lwJtk+yOw==", "vaHoB");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[46]] = lIIllIIllIlIlIII("mst421vlWTU=", "FshwK");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[47]] = lIIllIIllIlIIllI("jOfBSORkVQE=", "chDER");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[48]] = lIIllIIllIlIlIII("4bQLca0xVGw=", "tkDJY");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[49]] = lIIllIIllIlIIlll("ByoCNxMb", "wEpCr");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[50]] = lIIllIIllIlIIllI("nhZG1E+5iD4vYlfqUGP9t7VZAIMjsRrf", "eVyPh");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[51]] = lIIllIIllIlIIlll("NB4RLzQ/BB8iOyUEEyU5NA==", "QprGU");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[52]] = lIIllIIllIlIIlll("AwkkITc=", "EEelr");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[53]] = lIIllIIllIlIIlll("MRYnCjA=", "WzFgU");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[54]] = lIIllIIllIlIIllI("MU0Qw2T2rf4=", "osiuh");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[55]] = lIIllIIllIlIlIII("6NGsiTONAzo=", "yWpQD");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[56]] = lIIllIIllIlIIllI("OtKKyFWUBlhDwMlwj+cPMw==", "dWwCY");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[57]] = lIIllIIllIlIIllI("IYqk9WRer7VD6k6TiEQvhA==", "VRgbs");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[58]] = lIIllIIllIlIIllI("ZzvRD3hPbQ0=", "KFfTr");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[59]] = lIIllIIllIlIIllI("xXVLm2vP/rU=", "Xgmfb");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[60]] = lIIllIIllIlIIllI("79SSA14V9y9KXFLGPKkMlA==", "YRKWj");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[61]] = lIIllIIllIlIIllI("0YkjRBYPbuk=", "wzbuW");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[62]] = lIIllIIllIlIIlll("OzcdHSApNR4=", "hyRJb");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[63]] = lIIllIIllIlIlIII("I5613g3BvlP1RZDV78Xc5g==", "BHEet");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[64]] = lIIllIIllIlIlIII("5ZJM3iM44rn4jwyfSB+s/g==", "hJyrw");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[65]] = lIIllIIllIlIIllI("1jfTqS6XpWIkr+d+BhSKyQ==", "ygbpW");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[66]] = lIIllIIllIlIlIII("msKZzcEflmU=", "waKOk");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[67]] = lIIllIIllIlIIllI("4PgB85+NpsM=", "ldDOR");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[68]] = lIIllIIllIlIIlll("Jw8oPiA=", "oJilt");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[69]] = lIIllIIllIlIIlll("KRMgFzE=", "AvAeE");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[70]] = lIIllIIllIlIIllI("rl4cvxGTDLo=", "PdjQq");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[71]] = lIIllIIllIlIIllI("93xvGjb1xBg=", "ZWnZs");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[72]] = lIIllIIllIlIIlll("PT0kGDA3OyAWJA==", "tiaUo");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[73]] = lIIllIIllIlIlIII("Fp/rpOxhYmHg/lXvGtXRmA==", "RhvCA");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[74]] = lIIllIIllIlIIllI("RV/MaUvgyGudC4fW/+e31g==", "WHuiS");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[75]] = lIIllIIllIlIIllI("Cb7C+uZsLZ4+7fulvxSpEw==", "dXLTo");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[76]] = lIIllIIllIlIlIII("P9osi+eBVIXI8S1GmuO2Rg==", "pLTYj");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[77]] = lIIllIIllIlIIllI("r8s2tXBup0gL8/Kww7BOUQ==", "mBfhK");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[78]] = lIIllIIllIlIIlll("Fi45BDseKz8OOQ==", "AomAi");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[79]] = lIIllIIllIlIIllI("x/5t0D5Fi6g=", "ncEto");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[80]] = lIIllIIllIlIIlll("ExUTCBgOAB0A", "ZAVEG");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[81]] = lIIllIIllIlIIllI("jCRFsvn0/50=", "AtOUA");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[82]] = lIIllIIllIlIIlll("CAsFMSYVFAIvNQQKBCs=", "EDGng");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[83]] = lIIllIIllIlIlIII("Lx8Yxd4pY0bXhFQisS4gQw==", "tyJRv");
        EnumParticleTypes.llIlllIlIIlIlI[EnumParticleTypes.llIllllIIIllII[84]] = lIIllIIllIlIIlll("Gw==", "DIEig");
    }
    
    public String getParticleName() {
        return this.particleName;
    }
}
