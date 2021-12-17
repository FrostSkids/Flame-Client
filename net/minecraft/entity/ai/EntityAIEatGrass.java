// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.util.Random;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.entity.Entity;
import net.minecraft.block.properties.IProperty;
import com.google.common.base.Predicates;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.state.pattern.BlockStateHelper;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.state.IBlockState;
import com.google.common.base.Predicate;
import net.minecraft.entity.EntityLiving;

public class EntityAIEatGrass extends EntityAIBase
{
    /* synthetic */ int eatingGrassTimer;
    private /* synthetic */ EntityLiving grassEaterEntity;
    private static final /* synthetic */ int[] lllIIllIIIllIl;
    private static final /* synthetic */ Predicate<IBlockState> field_179505_b;
    private static final /* synthetic */ String[] lllIIllIIIllII;
    private /* synthetic */ World entityWorld;
    
    @Override
    public void updateTask() {
        this.eatingGrassTimer = Math.max(EntityAIEatGrass.lllIIllIIIllIl[3], this.eatingGrassTimer - EntityAIEatGrass.lllIIllIIIllIl[4]);
        if (lIlIIIIIIIlIIlIl(this.eatingGrassTimer, EntityAIEatGrass.lllIIllIIIllIl[7])) {
            final BlockPos llllllllllllIlIllllIIIlIlIIlIlll = new BlockPos(this.grassEaterEntity.posX, this.grassEaterEntity.posY, this.grassEaterEntity.posZ);
            if (lIlIIIIIIIlIIIlI(EntityAIEatGrass.field_179505_b.apply((Object)this.entityWorld.getBlockState(llllllllllllIlIllllIIIlIlIIlIlll)) ? 1 : 0)) {
                if (lIlIIIIIIIlIIIlI(this.entityWorld.getGameRules().getBoolean(EntityAIEatGrass.lllIIllIIIllII[EntityAIEatGrass.lllIIllIIIllIl[3]]) ? 1 : 0)) {
                    this.entityWorld.destroyBlock(llllllllllllIlIllllIIIlIlIIlIlll, (boolean)(EntityAIEatGrass.lllIIllIIIllIl[3] != 0));
                    "".length();
                }
                this.grassEaterEntity.eatGrassBonus();
                "".length();
                if ((0x84 ^ 0x80) < 0) {
                    return;
                }
            }
            else {
                final BlockPos llllllllllllIlIllllIIIlIlIIlIllI = llllllllllllIlIllllIIIlIlIIlIlll.down();
                if (lIlIIIIIIIlIIIll(this.entityWorld.getBlockState(llllllllllllIlIllllIIIlIlIIlIllI).getBlock(), Blocks.grass)) {
                    if (lIlIIIIIIIlIIIlI(this.entityWorld.getGameRules().getBoolean(EntityAIEatGrass.lllIIllIIIllII[EntityAIEatGrass.lllIIllIIIllIl[4]]) ? 1 : 0)) {
                        this.entityWorld.playAuxSFX(EntityAIEatGrass.lllIIllIIIllIl[8], llllllllllllIlIllllIIIlIlIIlIllI, Block.getIdFromBlock(Blocks.grass));
                        this.entityWorld.setBlockState(llllllllllllIlIllllIIIlIlIIlIllI, Blocks.dirt.getDefaultState(), EntityAIEatGrass.lllIIllIIIllIl[9]);
                        "".length();
                    }
                    this.grassEaterEntity.eatGrassBonus();
                }
            }
        }
    }
    
    private static boolean lIlIIIIIIIlIIIlI(final int llllllllllllIlIllllIIIlIIllIIIII) {
        return llllllllllllIlIllllIIIlIIllIIIII != 0;
    }
    
    public int getEatingGrassTimer() {
        return this.eatingGrassTimer;
    }
    
    public EntityAIEatGrass(final EntityLiving llllllllllllIlIllllIIIlIlIlIlllI) {
        this.grassEaterEntity = llllllllllllIlIllllIIIlIlIlIlllI;
        this.entityWorld = llllllllllllIlIllllIIIlIlIlIlllI.worldObj;
        this.setMutexBits(EntityAIEatGrass.lllIIllIIIllIl[0]);
    }
    
    static {
        lIlIIIIIIIlIIIIl();
        lIlIIIIIIIlIIIII();
        field_179505_b = (Predicate)BlockStateHelper.forBlock(Blocks.tallgrass).where(BlockTallGrass.TYPE, (com.google.common.base.Predicate<? extends BlockTallGrass.EnumType>)Predicates.equalTo((Object)BlockTallGrass.EnumType.GRASS));
    }
    
    @Override
    public void startExecuting() {
        this.eatingGrassTimer = EntityAIEatGrass.lllIIllIIIllIl[5];
        this.entityWorld.setEntityState(this.grassEaterEntity, (byte)EntityAIEatGrass.lllIIllIIIllIl[6]);
        this.grassEaterEntity.getNavigator().clearPathEntity();
    }
    
    private static String lIlIIIIIIIIllllI(String llllllllllllIlIllllIIIlIlIIIIIll, final String llllllllllllIlIllllIIIlIlIIIIIlI) {
        llllllllllllIlIllllIIIlIlIIIIIll = new String(Base64.getDecoder().decode(llllllllllllIlIllllIIIlIlIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllllIIIlIlIIIIllI = new StringBuilder();
        final char[] llllllllllllIlIllllIIIlIlIIIIlIl = llllllllllllIlIllllIIIlIlIIIIIlI.toCharArray();
        int llllllllllllIlIllllIIIlIlIIIIlII = EntityAIEatGrass.lllIIllIIIllIl[3];
        final byte llllllllllllIlIllllIIIlIIllllllI = (Object)llllllllllllIlIllllIIIlIlIIIIIll.toCharArray();
        final Exception llllllllllllIlIllllIIIlIIlllllIl = (Exception)llllllllllllIlIllllIIIlIIllllllI.length;
        long llllllllllllIlIllllIIIlIIlllllII = EntityAIEatGrass.lllIIllIIIllIl[3];
        while (lIlIIIIIIIlIIllI((int)llllllllllllIlIllllIIIlIIlllllII, (int)llllllllllllIlIllllIIIlIIlllllIl)) {
            final char llllllllllllIlIllllIIIlIlIIIlIIl = llllllllllllIlIllllIIIlIIllllllI[llllllllllllIlIllllIIIlIIlllllII];
            llllllllllllIlIllllIIIlIlIIIIllI.append((char)(llllllllllllIlIllllIIIlIlIIIlIIl ^ llllllllllllIlIllllIIIlIlIIIIlIl[llllllllllllIlIllllIIIlIlIIIIlII % llllllllllllIlIllllIIIlIlIIIIlIl.length]));
            "".length();
            ++llllllllllllIlIllllIIIlIlIIIIlII;
            ++llllllllllllIlIllllIIIlIIlllllII;
            "".length();
            if ("  ".length() == (0x1F ^ 0x1B)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllllIIIlIlIIIIllI);
    }
    
    @Override
    public boolean shouldExecute() {
        final Random rng = this.grassEaterEntity.getRNG();
        int bound;
        if (lIlIIIIIIIlIIIlI(this.grassEaterEntity.isChild() ? 1 : 0)) {
            bound = EntityAIEatGrass.lllIIllIIIllIl[1];
            "".length();
            if (-" ".length() >= 0) {
                return ((0x6A ^ 0x62) & ~(0xB8 ^ 0xB0)) != 0x0;
            }
        }
        else {
            bound = EntityAIEatGrass.lllIIllIIIllIl[2];
        }
        if (lIlIIIIIIIlIIIlI(rng.nextInt(bound))) {
            return EntityAIEatGrass.lllIIllIIIllIl[3] != 0;
        }
        final BlockPos llllllllllllIlIllllIIIlIlIlIlIlI = new BlockPos(this.grassEaterEntity.posX, this.grassEaterEntity.posY, this.grassEaterEntity.posZ);
        int n;
        if (lIlIIIIIIIlIIIlI(EntityAIEatGrass.field_179505_b.apply((Object)this.entityWorld.getBlockState(llllllllllllIlIllllIIIlIlIlIlIlI)) ? 1 : 0)) {
            n = EntityAIEatGrass.lllIIllIIIllIl[4];
            "".length();
            if ("   ".length() < 0) {
                return ((0x55 ^ 0x58) & ~(0x52 ^ 0x5F)) != 0x0;
            }
        }
        else if (lIlIIIIIIIlIIIll(this.entityWorld.getBlockState(llllllllllllIlIllllIIIlIlIlIlIlI.down()).getBlock(), Blocks.grass)) {
            n = EntityAIEatGrass.lllIIllIIIllIl[4];
            "".length();
            if (((0x53 ^ 0x58 ^ (0x93 ^ 0x80)) & (95 + 100 - 56 + 50 ^ 78 + 128 - 140 + 99 ^ -" ".length())) != 0x0) {
                return ((132 + 25 - 123 + 181 ^ 147 + 147 - 237 + 99) & (0xD3 ^ 0xA3 ^ (0x63 ^ 0x58) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EntityAIEatGrass.lllIIllIIIllIl[3];
        }
        return n != 0;
    }
    
    private static boolean lIlIIIIIIIlIIIll(final Object llllllllllllIlIllllIIIlIIllIIIll, final Object llllllllllllIlIllllIIIlIIllIIIlI) {
        return llllllllllllIlIllllIIIlIIllIIIll == llllllllllllIlIllllIIIlIIllIIIlI;
    }
    
    private static boolean lIlIIIIIIIlIIlIl(final int llllllllllllIlIllllIIIlIIllIlIll, final int llllllllllllIlIllllIIIlIIllIlIlI) {
        return llllllllllllIlIllllIIIlIIllIlIll == llllllllllllIlIllllIIIlIIllIlIlI;
    }
    
    @Override
    public void resetTask() {
        this.eatingGrassTimer = EntityAIEatGrass.lllIIllIIIllIl[3];
    }
    
    @Override
    public boolean continueExecuting() {
        if (lIlIIIIIIIlIIlII(this.eatingGrassTimer)) {
            return EntityAIEatGrass.lllIIllIIIllIl[4] != 0;
        }
        return EntityAIEatGrass.lllIIllIIIllIl[3] != 0;
    }
    
    private static String lIlIIIIIIIIlllll(final String llllllllllllIlIllllIIIlIIlllIIIl, final String llllllllllllIlIllllIIIlIIlllIIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllllIIIlIIlllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIIIlIIlllIIlI.getBytes(StandardCharsets.UTF_8)), EntityAIEatGrass.lllIIllIIIllIl[10]), "DES");
            final Cipher llllllllllllIlIllllIIIlIIlllIlIl = Cipher.getInstance("DES");
            llllllllllllIlIllllIIIlIIlllIlIl.init(EntityAIEatGrass.lllIIllIIIllIl[9], llllllllllllIlIllllIIIlIIlllIllI);
            return new String(llllllllllllIlIllllIIIlIIlllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIIIlIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIIIlIIlllIlII) {
            llllllllllllIlIllllIIIlIIlllIlII.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIIIIIIIlIIIIl() {
        (lllIIllIIIllIl = new int[11])[0] = (0xBC ^ 0xBB);
        EntityAIEatGrass.lllIIllIIIllIl[1] = (0xE0 ^ 0x9C ^ (0x17 ^ 0x59));
        EntityAIEatGrass.lllIIllIIIllIl[2] = (-(0xFFFFEC6F & 0x7F95) & (0xFFFFFFED & 0x6FFE));
        EntityAIEatGrass.lllIIllIIIllIl[3] = ((98 + 106 - 85 + 13 ^ 96 + 149 - 191 + 113) & (0xA6 ^ 0xB1 ^ (0x2B ^ 0x1F) ^ -" ".length()));
        EntityAIEatGrass.lllIIllIIIllIl[4] = " ".length();
        EntityAIEatGrass.lllIIllIIIllIl[5] = (0x7C ^ 0x54);
        EntityAIEatGrass.lllIIllIIIllIl[6] = (76 + 79 - 20 + 6 ^ 109 + 16 - 47 + 57);
        EntityAIEatGrass.lllIIllIIIllIl[7] = (0x5B ^ 0x5F);
        EntityAIEatGrass.lllIIllIIIllIl[8] = (0xFFFFE7F9 & 0x1FD7);
        EntityAIEatGrass.lllIIllIIIllIl[9] = "  ".length();
        EntityAIEatGrass.lllIIllIIIllIl[10] = (0x26 ^ 0x70 ^ (0x2C ^ 0x72));
    }
    
    private static boolean lIlIIIIIIIlIIllI(final int llllllllllllIlIllllIIIlIIllIIlll, final int llllllllllllIlIllllIIIlIIllIIllI) {
        return llllllllllllIlIllllIIIlIIllIIlll < llllllllllllIlIllllIIIlIIllIIllI;
    }
    
    private static void lIlIIIIIIIlIIIII() {
        (lllIIllIIIllII = new String[EntityAIEatGrass.lllIIllIIIllIl[9]])[EntityAIEatGrass.lllIIllIIIllIl[3]] = lIlIIIIIIIIllllI("DwszLSoLATcDNgU=", "bdQjX");
        EntityAIEatGrass.lllIIllIIIllII[EntityAIEatGrass.lllIIllIIIllIl[4]] = lIlIIIIIIIIlllll("r0jVFeSD458sWRNmotMWsg==", "bFcfn");
    }
    
    private static boolean lIlIIIIIIIlIIlII(final int llllllllllllIlIllllIIIlIIlIllllI) {
        return llllllllllllIlIllllIIIlIIlIllllI > 0;
    }
}
