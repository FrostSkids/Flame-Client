// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.util.Iterator;
import com.google.common.collect.Lists;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.EntityLivingBase;
import java.util.List;

public class CombatTracker
{
    private /* synthetic */ int field_152776_e;
    private final /* synthetic */ List<CombatEntry> combatEntries;
    private /* synthetic */ String field_94551_f;
    private /* synthetic */ boolean field_94553_e;
    private static final /* synthetic */ String[] lIllIllIllIlIl;
    private /* synthetic */ int field_94555_c;
    private final /* synthetic */ EntityLivingBase fighter;
    private /* synthetic */ boolean field_94552_d;
    private /* synthetic */ int field_152775_d;
    private static final /* synthetic */ int[] lIllIllIlllIIl;
    
    private static boolean llllllllllIlIll(final int llllllllllllIllllllIlIllIIIlllII, final int llllllllllllIllllllIlIllIIIllIll) {
        return llllllllllllIllllllIlIllIIIlllII < llllllllllllIllllllIlIllIIIllIll;
    }
    
    private static boolean llllllllllIIIll(final Object llllllllllllIllllllIlIllIIIlIlII, final Object llllllllllllIllllllIlIllIIIlIIll) {
        return llllllllllllIllllllIlIllIIIlIlII != llllllllllllIllllllIlIllIIIlIIll;
    }
    
    private static boolean llllllllllIlIlI(final Object llllllllllllIllllllIlIllIIIIlIll) {
        return llllllllllllIllllllIlIllIIIIlIll == null;
    }
    
    private static boolean lllllllllIllllI(final Object llllllllllllIllllllIlIllIIIlIIII, final Object llllllllllllIllllllIlIllIIIIllll) {
        return llllllllllllIllllllIlIllIIIlIIII == llllllllllllIllllllIlIllIIIIllll;
    }
    
    private static boolean lllllllllIlllIl(final int llllllllllllIllllllIlIllIIIIlIIl) {
        return llllllllllllIllllllIlIllIIIIlIIl != 0;
    }
    
    private static boolean llllllllllIIlIl(final int llllllllllllIllllllIlIllIIIIIIll) {
        return llllllllllllIllllllIlIllIIIIIIll > 0;
    }
    
    private String func_94548_b(final CombatEntry llllllllllllIllllllIlIllIllIlIII) {
        String func_94562_g;
        if (llllllllllIlIlI(llllllllllllIllllllIlIllIllIlIII.func_94562_g())) {
            func_94562_g = CombatTracker.lIllIllIllIlIl[CombatTracker.lIllIllIlllIIl[10]];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            func_94562_g = llllllllllllIllllllIlIllIllIlIII.func_94562_g();
        }
        return func_94562_g;
    }
    
    private static String lllllllllIlIlII(final String llllllllllllIllllllIlIllIlIIlIll, final String llllllllllllIllllllIlIllIlIIllII) {
        try {
            final SecretKeySpec llllllllllllIllllllIlIllIlIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIlIllIlIIllII.getBytes(StandardCharsets.UTF_8)), CombatTracker.lIllIllIlllIIl[8]), "DES");
            final Cipher llllllllllllIllllllIlIllIlIIllll = Cipher.getInstance("DES");
            llllllllllllIllllllIlIllIlIIllll.init(CombatTracker.lIllIllIlllIIl[2], llllllllllllIllllllIlIllIlIlIIII);
            return new String(llllllllllllIllllllIlIllIlIIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIlIllIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllIlIllIlIIlllI) {
            llllllllllllIllllllIlIllIlIIlllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllllllllIlIII(final int llllllllllllIllllllIlIllIIlIIIII, final int llllllllllllIllllllIlIllIIIlllll) {
        return llllllllllllIllllllIlIllIIlIIIII >= llllllllllllIllllllIlIllIIIlllll;
    }
    
    public int func_180134_f() {
        int n;
        if (lllllllllIlllIl(this.field_94552_d ? 1 : 0)) {
            n = this.fighter.ticksExisted - this.field_152775_d;
            "".length();
            if (null != null) {
                return (0x38 ^ 0x79) & ~(0xF0 ^ 0xB1);
            }
        }
        else {
            n = this.field_152776_e - this.field_152775_d;
        }
        return n;
    }
    
    private static String lllllllllIlIllI(String llllllllllllIllllllIlIllIIllllIl, final String llllllllllllIllllllIlIllIIllllII) {
        llllllllllllIllllllIlIllIIllllIl = new String(Base64.getDecoder().decode(llllllllllllIllllllIlIllIIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllllIlIllIIlllIll = new StringBuilder();
        final char[] llllllllllllIllllllIlIllIIlllIlI = llllllllllllIllllllIlIllIIllllII.toCharArray();
        int llllllllllllIllllllIlIllIIlllIIl = CombatTracker.lIllIllIlllIIl[0];
        final double llllllllllllIllllllIlIllIIllIIll = (Object)llllllllllllIllllllIlIllIIllllIl.toCharArray();
        final byte llllllllllllIllllllIlIllIIllIIlI = (byte)llllllllllllIllllllIlIllIIllIIll.length;
        double llllllllllllIllllllIlIllIIllIIIl = CombatTracker.lIllIllIlllIIl[0];
        while (llllllllllIlIll((int)llllllllllllIllllllIlIllIIllIIIl, llllllllllllIllllllIlIllIIllIIlI)) {
            final char llllllllllllIllllllIlIllIIlllllI = llllllllllllIllllllIlIllIIllIIll[llllllllllllIllllllIlIllIIllIIIl];
            llllllllllllIllllllIlIllIIlllIll.append((char)(llllllllllllIllllllIlIllIIlllllI ^ llllllllllllIllllllIlIllIIlllIlI[llllllllllllIllllllIlIllIIlllIIl % llllllllllllIllllllIlIllIIlllIlI.length]));
            "".length();
            ++llllllllllllIllllllIlIllIIlllIIl;
            ++llllllllllllIllllllIlIllIIllIIIl;
            "".length();
            if ("  ".length() < ((0x49 ^ 0x28) & ~(0xA5 ^ 0xC4))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllllIlIllIIlllIll);
    }
    
    private static boolean llllllllllIIIII(final int llllllllllllIllllllIlIllIIIIIlll) {
        return llllllllllllIllllllIlIllIIIIIlll == 0;
    }
    
    public EntityLivingBase getFighter() {
        return this.fighter;
    }
    
    private static boolean llllllllllIIllI(final int llllllllllllIllllllIlIllIIIIIlIl) {
        return llllllllllllIllllllIlIllIIIIIlIl >= 0;
    }
    
    private static String lllllllllIlIlll(final String llllllllllllIllllllIlIllIIlIIllI, final String llllllllllllIllllllIlIllIIlIIlll) {
        try {
            final SecretKeySpec llllllllllllIllllllIlIllIIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIlIllIIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllllIlIllIIlIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllllllIlIllIIlIlIlI.init(CombatTracker.lIllIllIlllIIl[2], llllllllllllIllllllIlIllIIlIlIll);
            return new String(llllllllllllIllllllIlIllIIlIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIlIllIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllIlIllIIlIlIIl) {
            llllllllllllIllllllIlIllIIlIlIIl.printStackTrace();
            return null;
        }
    }
    
    public EntityLivingBase func_94550_c() {
        EntityLivingBase llllllllllllIllllllIlIlllIIIlllI = null;
        EntityPlayer llllllllllllIllllllIlIlllIIIllIl = null;
        float llllllllllllIllllllIlIlllIIIllII = 0.0f;
        float llllllllllllIllllllIlIlllIIIlIll = 0.0f;
        final double llllllllllllIllllllIlIlllIIIIIll = (double)this.combatEntries.iterator();
        "".length();
        if (null != null) {
            return null;
        }
        while (!llllllllllIIIII(((Iterator)llllllllllllIllllllIlIlllIIIIIll).hasNext() ? 1 : 0)) {
            final CombatEntry llllllllllllIllllllIlIlllIIIlIlI = ((Iterator<CombatEntry>)llllllllllllIllllllIlIlllIIIIIll).next();
            if (lllllllllIlllIl((llllllllllllIllllllIlIlllIIIlIlI.getDamageSrc().getEntity() instanceof EntityPlayer) ? 1 : 0) && (!llllllllllIIIlI(llllllllllllIllllllIlIlllIIIllIl) || llllllllllIIlIl(llllllllllIIlII(llllllllllllIllllllIlIlllIIIlIlI.func_94563_c(), llllllllllllIllllllIlIlllIIIlIll)))) {
                llllllllllllIllllllIlIlllIIIlIll = llllllllllllIllllllIlIlllIIIlIlI.func_94563_c();
                llllllllllllIllllllIlIlllIIIllIl = (EntityPlayer)llllllllllllIllllllIlIlllIIIlIlI.getDamageSrc().getEntity();
            }
            if (lllllllllIlllIl((llllllllllllIllllllIlIlllIIIlIlI.getDamageSrc().getEntity() instanceof EntityLivingBase) ? 1 : 0) && (!llllllllllIIIlI(llllllllllllIllllllIlIlllIIIlllI) || llllllllllIIlIl(llllllllllIIlII(llllllllllllIllllllIlIlllIIIlIlI.func_94563_c(), llllllllllllIllllllIlIlllIIIllII)))) {
                llllllllllllIllllllIlIlllIIIllII = llllllllllllIllllllIlIlllIIIlIlI.func_94563_c();
                llllllllllllIllllllIlIlllIIIlllI = (EntityLivingBase)llllllllllllIllllllIlIlllIIIlIlI.getDamageSrc().getEntity();
            }
        }
        if (llllllllllIIIlI(llllllllllllIllllllIlIlllIIIllIl) && llllllllllIIllI(llllllllllIIlII(llllllllllllIllllllIlIlllIIIlIll, llllllllllllIllllllIlIlllIIIllII / 3.0f))) {
            return llllllllllllIllllllIlIlllIIIllIl;
        }
        return llllllllllllIllllllIlIlllIIIlllI;
    }
    
    public void func_94545_a() {
        this.func_94542_g();
        if (lllllllllIlllIl(this.fighter.isOnLadder() ? 1 : 0)) {
            final Block llllllllllllIllllllIlIllllIIlIlI = this.fighter.worldObj.getBlockState(new BlockPos(this.fighter.posX, this.fighter.getEntityBoundingBox().minY, this.fighter.posZ)).getBlock();
            if (lllllllllIllllI(llllllllllllIllllllIlIllllIIlIlI, Blocks.ladder)) {
                this.field_94551_f = CombatTracker.lIllIllIllIlIl[CombatTracker.lIllIllIlllIIl[0]];
                "".length();
                if (((11 + 109 - 19 + 116 ^ 113 + 33 - 48 + 97) & (77 + 39 - 96 + 170 ^ 12 + 56 - 49 + 145 ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else if (lllllllllIllllI(llllllllllllIllllllIlIllllIIlIlI, Blocks.vine)) {
                this.field_94551_f = CombatTracker.lIllIllIllIlIl[CombatTracker.lIllIllIlllIIl[1]];
                "".length();
                if (" ".length() <= 0) {
                    return;
                }
            }
        }
        else if (lllllllllIlllIl(this.fighter.isInWater() ? 1 : 0)) {
            this.field_94551_f = CombatTracker.lIllIllIllIlIl[CombatTracker.lIllIllIlllIIl[2]];
        }
    }
    
    private static int llllllllllIIlII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean llllllllllIIIlI(final Object llllllllllllIllllllIlIllIIIIllIl) {
        return llllllllllllIllllllIlIllIIIIllIl != null;
    }
    
    public void reset() {
        int n;
        if (lllllllllIlllIl(this.field_94552_d ? 1 : 0)) {
            n = CombatTracker.lIllIllIlllIIl[11];
            "".length();
            if (-(0xD ^ 0x9) > 0) {
                return;
            }
        }
        else {
            n = CombatTracker.lIllIllIlllIIl[12];
        }
        final int llllllllllllIllllllIlIllIlIlllII = n;
        if (lllllllllIlllIl(this.field_94553_e ? 1 : 0) && (!lllllllllIlllIl(this.fighter.isEntityAlive() ? 1 : 0) || llllllllllIlIIl(this.fighter.ticksExisted - this.field_94555_c, llllllllllllIllllllIlIllIlIlllII))) {
            final boolean llllllllllllIllllllIlIllIlIllIll = this.field_94552_d;
            this.field_94553_e = (CombatTracker.lIllIllIlllIIl[0] != 0);
            this.field_94552_d = (CombatTracker.lIllIllIlllIIl[0] != 0);
            this.field_152776_e = this.fighter.ticksExisted;
            if (lllllllllIlllIl(llllllllllllIllllllIlIllIlIllIll ? 1 : 0)) {
                this.fighter.sendEndCombat();
            }
            this.combatEntries.clear();
        }
    }
    
    private static int llllllllllIIlll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static void lllllllllIllIll() {
        (lIllIllIllIlIl = new String[CombatTracker.lIllIllIlllIIl[13]])[CombatTracker.lIllIllIlllIIl[0]] = lllllllllIlIlII("eKdJTX844KA=", "EBAaV");
        CombatTracker.lIllIllIllIlIl[CombatTracker.lIllIllIlllIIl[1]] = lllllllllIlIllI("Ez8aFTw=", "eVtpO");
        CombatTracker.lIllIllIllIlIl[CombatTracker.lIllIllIlllIIl[2]] = lllllllllIlIlll("dCr+fd9l+V0=", "EGJlo");
        CombatTracker.lIllIllIllIlIl[CombatTracker.lIllIllIlllIIl[3]] = lllllllllIlIlll("Vl+V4K+m+4sIci9qfB8RmdxeaRASC2yW", "tjweu");
        CombatTracker.lIllIllIllIlIl[CombatTracker.lIllIllIlllIIl[4]] = lllllllllIlIlll("grJcrxJvfdo4Tyg6s7fEpFo0xtCS8Qba", "ZIogN");
        CombatTracker.lIllIllIllIlIl[CombatTracker.lIllIllIlllIIl[5]] = lllllllllIlIlll("dGqJjtjvAR0ISPomC7y6cH8u5M/50R+4", "FLUQe");
        CombatTracker.lIllIllIllIlIl[CombatTracker.lIllIllIlllIIl[6]] = lllllllllIlIllI("IxIyORhpETYhHGkROiMZNB99JAQiGg==", "GwSMp");
        CombatTracker.lIllIllIllIlIl[CombatTracker.lIllIllIlllIIl[7]] = lllllllllIlIlll("GNG+W6uOQjS6IwZ+KFS21XoYxCj9tXPF", "HpZDx");
        CombatTracker.lIllIllIllIlIl[CombatTracker.lIllIllIlllIIl[8]] = lllllllllIlIlll("jPDohEIGJr7KH/Mqu9qwuOeahURvhBgJ", "tfWto");
        CombatTracker.lIllIllIllIlIl[CombatTracker.lIllIllIlllIIl[9]] = lllllllllIlIllI("NSctEyF/JCkLJX8jLwQgNSciE2c=", "QBLgI");
        CombatTracker.lIllIllIllIlIl[CombatTracker.lIllIllIlllIIl[10]] = lllllllllIlIlll("LbZwkk4W9tM=", "ycwjh");
    }
    
    private void func_94542_g() {
        this.field_94551_f = null;
    }
    
    static {
        lllllllllIlllII();
        lllllllllIllIll();
    }
    
    private static void lllllllllIlllII() {
        (lIllIllIlllIIl = new int[14])[0] = ((0xC7 ^ 0x8C) & ~(0x28 ^ 0x63));
        CombatTracker.lIllIllIlllIIl[1] = " ".length();
        CombatTracker.lIllIllIlllIIl[2] = "  ".length();
        CombatTracker.lIllIllIlllIIl[3] = "   ".length();
        CombatTracker.lIllIllIlllIIl[4] = (0x26 ^ 0x11 ^ (0x35 ^ 0x6));
        CombatTracker.lIllIllIlllIIl[5] = (0x7F ^ 0x7A);
        CombatTracker.lIllIllIlllIIl[6] = (0xE1 ^ 0x9C ^ (0xD0 ^ 0xAB));
        CombatTracker.lIllIllIlllIIl[7] = (0x5C ^ 0x3B ^ (0xE8 ^ 0x88));
        CombatTracker.lIllIllIlllIIl[8] = (0x6 ^ 0xE);
        CombatTracker.lIllIllIlllIIl[9] = (51 + 110 - 18 + 24 ^ 76 + 137 - 146 + 107);
        CombatTracker.lIllIllIlllIIl[10] = (0x9 ^ 0x3);
        CombatTracker.lIllIllIlllIIl[11] = (0xFFFFF5BE & 0xB6D);
        CombatTracker.lIllIllIlllIIl[12] = (0x5F ^ 0x3B);
        CombatTracker.lIllIllIlllIIl[13] = (0x33 ^ 0x68 ^ (0x53 ^ 0x3));
    }
    
    private static boolean llllllllllIlIIl(final int llllllllllllIllllllIlIllIIIllIII, final int llllllllllllIllllllIlIllIIIlIlll) {
        return llllllllllllIllllllIlIllIIIllIII > llllllllllllIllllllIlIllIIIlIlll;
    }
    
    private CombatEntry func_94544_f() {
        CombatEntry llllllllllllIllllllIlIllIllllIIl = null;
        CombatEntry llllllllllllIllllllIlIllIllllIII = null;
        final int llllllllllllIllllllIlIllIlllIlll = CombatTracker.lIllIllIlllIIl[0];
        float llllllllllllIllllllIlIllIlllIllI = 0.0f;
        int llllllllllllIllllllIlIllIlllIlIl = CombatTracker.lIllIllIlllIIl[0];
        "".length();
        if (null != null) {
            return null;
        }
        while (!llllllllllIlIII(llllllllllllIllllllIlIllIlllIlIl, this.combatEntries.size())) {
            final CombatEntry llllllllllllIllllllIlIllIlllIlII = this.combatEntries.get(llllllllllllIllllllIlIllIlllIlIl);
            CombatEntry combatEntry;
            if (llllllllllIIlIl(llllllllllllIllllllIlIllIlllIlIl)) {
                combatEntry = this.combatEntries.get(llllllllllllIllllllIlIllIlllIlIl - CombatTracker.lIllIllIlllIIl[1]);
                "".length();
                if ((0x39 ^ 0x3D) < " ".length()) {
                    return null;
                }
            }
            else {
                combatEntry = null;
            }
            final CombatEntry llllllllllllIllllllIlIllIlllIIll = combatEntry;
            if ((!llllllllllIIIll(llllllllllllIllllllIlIllIlllIlII.getDamageSrc(), DamageSource.fall) || lllllllllIllllI(llllllllllllIllllllIlIllIlllIlII.getDamageSrc(), DamageSource.outOfWorld)) && llllllllllIIlIl(llllllllllIIlll(llllllllllllIllllllIlIllIlllIlII.getDamageAmount(), 0.0f)) && (!llllllllllIIIlI(llllllllllllIllllllIlIllIllllIIl) || llllllllllIIlIl(llllllllllIIlll(llllllllllllIllllllIlIllIlllIlII.getDamageAmount(), llllllllllllIllllllIlIllIlllIllI)))) {
                if (llllllllllIIlIl(llllllllllllIllllllIlIllIlllIlIl)) {
                    llllllllllllIllllllIlIllIllllIIl = llllllllllllIllllllIlIllIlllIIll;
                    "".length();
                    if (((0x37 ^ 0x2E) & ~(0xB5 ^ 0xAC)) != 0x0) {
                        return null;
                    }
                }
                else {
                    llllllllllllIllllllIlIllIllllIIl = llllllllllllIllllllIlIllIlllIlII;
                }
                llllllllllllIllllllIlIllIlllIllI = llllllllllllIllllllIlIllIlllIlII.getDamageAmount();
            }
            if (llllllllllIIIlI(llllllllllllIllllllIlIllIlllIlII.func_94562_g()) && (!llllllllllIIIlI(llllllllllllIllllllIlIllIllllIII) || llllllllllIIlIl(llllllllllIIlll(llllllllllllIllllllIlIllIlllIlII.func_94563_c(), (float)llllllllllllIllllllIlIllIlllIlll)))) {
                llllllllllllIllllllIlIllIllllIII = llllllllllllIllllllIlIllIlllIlII;
            }
            ++llllllllllllIllllllIlIllIlllIlIl;
        }
        if (llllllllllIIlIl(llllllllllIIlll(llllllllllllIllllllIlIllIlllIllI, 5.0f)) && llllllllllIIIlI(llllllllllllIllllllIlIllIllllIIl)) {
            return llllllllllllIllllllIlIllIllllIIl;
        }
        if (llllllllllIlIIl(llllllllllllIllllllIlIllIlllIlll, CombatTracker.lIllIllIlllIIl[5]) && llllllllllIIIlI(llllllllllllIllllllIlIllIllllIII)) {
            return llllllllllllIllllllIlIllIllllIII;
        }
        return null;
    }
    
    public void trackDamage(final DamageSource llllllllllllIllllllIlIllllIIIIIl, final float llllllllllllIllllllIlIlllIlllIll, final float llllllllllllIllllllIlIlllIllllll) {
        this.reset();
        this.func_94545_a();
        final CombatEntry llllllllllllIllllllIlIlllIlllllI = new CombatEntry(llllllllllllIllllllIlIllllIIIIIl, this.fighter.ticksExisted, llllllllllllIllllllIlIlllIlllIll, llllllllllllIllllllIlIlllIllllll, this.field_94551_f, this.fighter.fallDistance);
        this.combatEntries.add(llllllllllllIllllllIlIlllIlllllI);
        "".length();
        this.field_94555_c = this.fighter.ticksExisted;
        this.field_94553_e = (CombatTracker.lIllIllIlllIIl[1] != 0);
        if (lllllllllIlllIl(llllllllllllIllllllIlIlllIlllllI.isLivingDamageSrc() ? 1 : 0) && llllllllllIIIII(this.field_94552_d ? 1 : 0) && lllllllllIlllIl(this.fighter.isEntityAlive() ? 1 : 0)) {
            this.field_94552_d = (CombatTracker.lIllIllIlllIIl[1] != 0);
            this.field_152775_d = this.fighter.ticksExisted;
            this.field_152776_e = this.field_152775_d;
            this.fighter.sendEnterCombat();
        }
    }
    
    public IChatComponent getDeathMessage() {
        if (llllllllllIIIII(this.combatEntries.size())) {
            final String lllllllllllllIlIIlIlllIIlIIIIIlI = CombatTracker.lIllIllIllIlIl[CombatTracker.lIllIllIlllIIl[3]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[CombatTracker.lIllIllIlllIIl[1]];
            lllllllllllllIlIIlIlllIIlIIIIIIl[CombatTracker.lIllIllIlllIIl[0]] = this.fighter.getDisplayName();
            return new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl);
        }
        final CombatEntry llllllllllllIllllllIlIlllIlIlllI = this.func_94544_f();
        final CombatEntry llllllllllllIllllllIlIlllIlIllIl = this.combatEntries.get(this.combatEntries.size() - CombatTracker.lIllIllIlllIIl[1]);
        final IChatComponent llllllllllllIllllllIlIlllIlIllII = llllllllllllIllllllIlIlllIlIllIl.getDamageSrcDisplayName();
        final Entity llllllllllllIllllllIlIlllIlIlIll = llllllllllllIllllllIlIlllIlIllIl.getDamageSrc().getEntity();
        IChatComponent llllllllllllIllllllIlIlllIlIIlII = null;
        if (llllllllllIIIlI(llllllllllllIllllllIlIlllIlIlllI) && lllllllllIllllI(llllllllllllIllllllIlIlllIlIllIl.getDamageSrc(), DamageSource.fall)) {
            final IChatComponent llllllllllllIllllllIlIlllIlIIIll = llllllllllllIllllllIlIlllIlIlllI.getDamageSrcDisplayName();
            if (llllllllllIIIll(llllllllllllIllllllIlIlllIlIlllI.getDamageSrc(), DamageSource.fall) && llllllllllIIIll(llllllllllllIllllllIlIlllIlIlllI.getDamageSrc(), DamageSource.outOfWorld)) {
                if (llllllllllIIIlI(llllllllllllIllllllIlIlllIlIIIll) && (!llllllllllIIIlI(llllllllllllIllllllIlIlllIlIllII) || llllllllllIIIII(llllllllllllIllllllIlIlllIlIIIll.equals(llllllllllllIllllllIlIlllIlIllII) ? 1 : 0))) {
                    final Entity llllllllllllIllllllIlIlllIlIIIlI = llllllllllllIllllllIlIlllIlIlllI.getDamageSrc().getEntity();
                    ItemStack heldItem;
                    if (lllllllllIlllIl((llllllllllllIllllllIlIlllIlIIIlI instanceof EntityLivingBase) ? 1 : 0)) {
                        heldItem = ((EntityLivingBase)llllllllllllIllllllIlIlllIlIIIlI).getHeldItem();
                        "".length();
                        if ((0x21 ^ 0x3B ^ (0x20 ^ 0x3E)) != (0x33 ^ 0x1E ^ (0x65 ^ 0x4C))) {
                            return null;
                        }
                    }
                    else {
                        heldItem = null;
                    }
                    final ItemStack llllllllllllIllllllIlIlllIlIIIIl = heldItem;
                    if (llllllllllIIIlI(llllllllllllIllllllIlIlllIlIIIIl) && lllllllllIlllIl(llllllllllllIllllllIlIlllIlIIIIl.hasDisplayName() ? 1 : 0)) {
                        final String lllllllllllllIlIIlIlllIIlIIIIIlI2 = CombatTracker.lIllIllIllIlIl[CombatTracker.lIllIllIlllIIl[4]];
                        final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl2 = new Object[CombatTracker.lIllIllIlllIIl[3]];
                        lllllllllllllIlIIlIlllIIlIIIIIIl2[CombatTracker.lIllIllIlllIIl[0]] = this.fighter.getDisplayName();
                        lllllllllllllIlIIlIlllIIlIIIIIIl2[CombatTracker.lIllIllIlllIIl[1]] = llllllllllllIllllllIlIlllIlIIIll;
                        lllllllllllllIlIIlIlllIIlIIIIIIl2[CombatTracker.lIllIllIlllIIl[2]] = llllllllllllIllllllIlIlllIlIIIIl.getChatComponent();
                        final IChatComponent llllllllllllIllllllIlIlllIlIlIlI = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI2, lllllllllllllIlIIlIlllIIlIIIIIIl2);
                        "".length();
                        if (((0x91 ^ 0xA4) & ~(0xA0 ^ 0x95)) < 0) {
                            return null;
                        }
                    }
                    else {
                        final String lllllllllllllIlIIlIlllIIlIIIIIlI3 = CombatTracker.lIllIllIllIlIl[CombatTracker.lIllIllIlllIIl[5]];
                        final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl3 = new Object[CombatTracker.lIllIllIlllIIl[2]];
                        lllllllllllllIlIIlIlllIIlIIIIIIl3[CombatTracker.lIllIllIlllIIl[0]] = this.fighter.getDisplayName();
                        lllllllllllllIlIIlIlllIIlIIIIIIl3[CombatTracker.lIllIllIlllIIl[1]] = llllllllllllIllllllIlIlllIlIIIll;
                        final IChatComponent llllllllllllIllllllIlIlllIlIlIIl = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI3, lllllllllllllIlIIlIlllIIlIIIIIIl3);
                        "".length();
                        if (null != null) {
                            return null;
                        }
                    }
                }
                else if (llllllllllIIIlI(llllllllllllIllllllIlIlllIlIllII)) {
                    ItemStack heldItem2;
                    if (lllllllllIlllIl((llllllllllllIllllllIlIlllIlIlIll instanceof EntityLivingBase) ? 1 : 0)) {
                        heldItem2 = ((EntityLivingBase)llllllllllllIllllllIlIlllIlIlIll).getHeldItem();
                        "".length();
                        if (((0x8D ^ 0xAF) & ~(0xB3 ^ 0x91)) >= "   ".length()) {
                            return null;
                        }
                    }
                    else {
                        heldItem2 = null;
                    }
                    final ItemStack llllllllllllIllllllIlIlllIlIIIII = heldItem2;
                    if (llllllllllIIIlI(llllllllllllIllllllIlIlllIlIIIII) && lllllllllIlllIl(llllllllllllIllllllIlIlllIlIIIII.hasDisplayName() ? 1 : 0)) {
                        final String lllllllllllllIlIIlIlllIIlIIIIIlI4 = CombatTracker.lIllIllIllIlIl[CombatTracker.lIllIllIlllIIl[6]];
                        final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl4 = new Object[CombatTracker.lIllIllIlllIIl[3]];
                        lllllllllllllIlIIlIlllIIlIIIIIIl4[CombatTracker.lIllIllIlllIIl[0]] = this.fighter.getDisplayName();
                        lllllllllllllIlIIlIlllIIlIIIIIIl4[CombatTracker.lIllIllIlllIIl[1]] = llllllllllllIllllllIlIlllIlIllII;
                        lllllllllllllIlIIlIlllIIlIIIIIIl4[CombatTracker.lIllIllIlllIIl[2]] = llllllllllllIllllllIlIlllIlIIIII.getChatComponent();
                        final IChatComponent llllllllllllIllllllIlIlllIlIlIII = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI4, lllllllllllllIlIIlIlllIIlIIIIIIl4);
                        "".length();
                        if ("   ".length() < " ".length()) {
                            return null;
                        }
                    }
                    else {
                        final String lllllllllllllIlIIlIlllIIlIIIIIlI5 = CombatTracker.lIllIllIllIlIl[CombatTracker.lIllIllIlllIIl[7]];
                        final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl5 = new Object[CombatTracker.lIllIllIlllIIl[2]];
                        lllllllllllllIlIIlIlllIIlIIIIIIl5[CombatTracker.lIllIllIlllIIl[0]] = this.fighter.getDisplayName();
                        lllllllllllllIlIIlIlllIIlIIIIIIl5[CombatTracker.lIllIllIlllIIl[1]] = llllllllllllIllllllIlIlllIlIllII;
                        final IChatComponent llllllllllllIllllllIlIlllIlIIlll = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI5, lllllllllllllIlIIlIlllIIlIIIIIIl5);
                        "".length();
                        if (null != null) {
                            return null;
                        }
                    }
                }
                else {
                    final String lllllllllllllIlIIlIlllIIlIIIIIlI6 = CombatTracker.lIllIllIllIlIl[CombatTracker.lIllIllIlllIIl[8]];
                    final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl6 = new Object[CombatTracker.lIllIllIlllIIl[1]];
                    lllllllllllllIlIIlIlllIIlIIIIIIl6[CombatTracker.lIllIllIlllIIl[0]] = this.fighter.getDisplayName();
                    final IChatComponent llllllllllllIllllllIlIlllIlIIllI = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI6, lllllllllllllIlIIlIlllIIlIIIIIIl6);
                    "".length();
                    if (((237 + 121 - 331 + 213 ^ 55 + 79 - 98 + 141) & (159 + 132 - 112 + 33 ^ 22 + 49 + 71 + 7 ^ -" ".length())) != 0x0) {
                        return null;
                    }
                }
            }
            else {
                final String value = String.valueOf(new StringBuilder(CombatTracker.lIllIllIllIlIl[CombatTracker.lIllIllIlllIIl[9]]).append(this.func_94548_b(llllllllllllIllllllIlIlllIlIlllI)));
                final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl7 = new Object[CombatTracker.lIllIllIlllIIl[1]];
                lllllllllllllIlIIlIlllIIlIIIIIIl7[CombatTracker.lIllIllIlllIIl[0]] = this.fighter.getDisplayName();
                final IChatComponent llllllllllllIllllllIlIlllIlIIlIl = new ChatComponentTranslation(value, lllllllllllllIlIIlIlllIIlIIIIIIl7);
                "".length();
                if ((0x73 ^ 0x29 ^ (0xFA ^ 0xA4)) == "  ".length()) {
                    return null;
                }
            }
        }
        else {
            llllllllllllIllllllIlIlllIlIIlII = llllllllllllIllllllIlIlllIlIllIl.getDamageSrc().getDeathMessage(this.fighter);
        }
        return llllllllllllIllllllIlIlllIlIIlII;
    }
    
    public CombatTracker(final EntityLivingBase llllllllllllIllllllIlIllllIIlllI) {
        this.combatEntries = (List<CombatEntry>)Lists.newArrayList();
        this.fighter = llllllllllllIllllllIlIllllIIlllI;
    }
}
