// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import com.google.common.collect.Lists;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.entity.Entity;
import java.util.List;
import net.minecraft.entity.EntityLiving;

public class EntitySenses
{
    /* synthetic */ EntityLiving entityObj;
    private static final /* synthetic */ int[] lIlIlllllIIIIl;
    /* synthetic */ List<Entity> unseenEntities;
    /* synthetic */ List<Entity> seenEntities;
    private static final /* synthetic */ String[] lIlIllllIlllll;
    
    private static String llllIlIIlllIlIl(String lllllllllllllIIIIlIIllllllIIlIII, final String lllllllllllllIIIIlIIllllllIIllII) {
        lllllllllllllIIIIlIIllllllIIlIII = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIlIIllllllIIlIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlIIllllllIIlIll = new StringBuilder();
        final char[] lllllllllllllIIIIlIIllllllIIlIlI = lllllllllllllIIIIlIIllllllIIllII.toCharArray();
        int lllllllllllllIIIIlIIllllllIIlIIl = EntitySenses.lIlIlllllIIIIl[1];
        final double lllllllllllllIIIIlIIllllllIIIIll = (Object)((String)lllllllllllllIIIIlIIllllllIIlIII).toCharArray();
        final boolean lllllllllllllIIIIlIIllllllIIIIlI = lllllllllllllIIIIlIIllllllIIIIll.length != 0;
        byte lllllllllllllIIIIlIIllllllIIIIIl = (byte)EntitySenses.lIlIlllllIIIIl[1];
        while (llllIlIIllllIll(lllllllllllllIIIIlIIllllllIIIIIl, lllllllllllllIIIIlIIllllllIIIIlI ? 1 : 0)) {
            final char lllllllllllllIIIIlIIllllllIIlllI = lllllllllllllIIIIlIIllllllIIIIll[lllllllllllllIIIIlIIllllllIIIIIl];
            lllllllllllllIIIIlIIllllllIIlIll.append((char)(lllllllllllllIIIIlIIllllllIIlllI ^ lllllllllllllIIIIlIIllllllIIlIlI[lllllllllllllIIIIlIIllllllIIlIIl % lllllllllllllIIIIlIIllllllIIlIlI.length]));
            "".length();
            ++lllllllllllllIIIIlIIllllllIIlIIl;
            ++lllllllllllllIIIIlIIllllllIIIIIl;
            "".length();
            if ((0x18 ^ 0x1C) < ((0xF0 ^ 0xA3) & ~(0x22 ^ 0x71))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlIIllllllIIlIll);
    }
    
    private static void llllIlIIlllIllI() {
        (lIlIllllIlllll = new String[EntitySenses.lIlIlllllIIIIl[0]])[EntitySenses.lIlIlllllIIIIl[1]] = llllIlIIlllIlIl("DQk9Oh0L", "nhSix");
    }
    
    private static void llllIlIIllllIIl() {
        (lIlIlllllIIIIl = new int[2])[0] = " ".length();
        EntitySenses.lIlIlllllIIIIl[1] = ((0x36 ^ 0xD) & ~(0xFA ^ 0xC1));
    }
    
    static {
        llllIlIIllllIIl();
        llllIlIIlllIllI();
    }
    
    private static boolean llllIlIIllllIlI(final int lllllllllllllIIIIlIIlllllIlllIlI) {
        return lllllllllllllIIIIlIIlllllIlllIlI != 0;
    }
    
    public boolean canSee(final Entity lllllllllllllIIIIlIIllllllIllIIl) {
        if (llllIlIIllllIlI(this.seenEntities.contains(lllllllllllllIIIIlIIllllllIllIIl) ? 1 : 0)) {
            return EntitySenses.lIlIlllllIIIIl[0] != 0;
        }
        if (llllIlIIllllIlI(this.unseenEntities.contains(lllllllllllllIIIIlIIllllllIllIIl) ? 1 : 0)) {
            return EntitySenses.lIlIlllllIIIIl[1] != 0;
        }
        this.entityObj.worldObj.theProfiler.startSection(EntitySenses.lIlIllllIlllll[EntitySenses.lIlIlllllIIIIl[1]]);
        final boolean lllllllllllllIIIIlIIllllllIllIll = this.entityObj.canEntityBeSeen(lllllllllllllIIIIlIIllllllIllIIl);
        this.entityObj.worldObj.theProfiler.endSection();
        if (llllIlIIllllIlI(lllllllllllllIIIIlIIllllllIllIll ? 1 : 0)) {
            this.seenEntities.add(lllllllllllllIIIIlIIllllllIllIIl);
            "".length();
            "".length();
            if (null != null) {
                return ((0x8C ^ 0xC7) & ~(0x3A ^ 0x71)) != 0x0;
            }
        }
        else {
            this.unseenEntities.add(lllllllllllllIIIIlIIllllllIllIIl);
            "".length();
        }
        return lllllllllllllIIIIlIIllllllIllIll;
    }
    
    private static boolean llllIlIIllllIll(final int lllllllllllllIIIIlIIlllllIllllIl, final int lllllllllllllIIIIlIIlllllIllllII) {
        return lllllllllllllIIIIlIIlllllIllllIl < lllllllllllllIIIIlIIlllllIllllII;
    }
    
    public void clearSensingCache() {
        this.seenEntities.clear();
        this.unseenEntities.clear();
    }
    
    public EntitySenses(final EntityLiving lllllllllllllIIIIlIIlllllllIIllI) {
        this.seenEntities = (List<Entity>)Lists.newArrayList();
        this.unseenEntities = (List<Entity>)Lists.newArrayList();
        this.entityObj = lllllllllllllIIIIlIIlllllllIIllI;
    }
}
