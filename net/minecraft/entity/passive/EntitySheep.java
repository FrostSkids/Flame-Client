// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.passive;

import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.item.crafting.CraftingManager;
import java.util.Arrays;
import net.minecraft.entity.EntityAgeable;
import java.util.Random;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.entity.EntityLiving;
import net.minecraft.inventory.Container;
import net.minecraft.world.World;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import com.google.common.collect.Maps;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.item.EnumDyeColor;
import java.util.Map;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.entity.ai.EntityAIEatGrass;

public class EntitySheep extends EntityAnimal
{
    private static final /* synthetic */ String[] llIlIlIIllIlII;
    private /* synthetic */ int sheepTimer;
    private /* synthetic */ EntityAIEatGrass entityAIEatGrass;
    private static final /* synthetic */ int[] llIlIlIIllIlIl;
    private final /* synthetic */ InventoryCrafting inventoryCrafting;
    private static final /* synthetic */ Map<EnumDyeColor, float[]> DYE_TO_RGB;
    
    private static String lIIlIIllllllllII(final String llllllllllllIllIlIlIlIlIIIIllllI, final String llllllllllllIllIlIlIlIlIIIIllIll) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIlIlIIIlIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIlIlIIIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIlIlIlIIIlIIIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIlIlIlIIIlIIIII.init(EntitySheep.llIlIlIIllIlIl[3], llllllllllllIllIlIlIlIlIIIlIIIIl);
            return new String(llllllllllllIllIlIlIlIlIIIlIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIlIlIIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIlIlIIIIlllll) {
            llllllllllllIllIlIlIlIlIIIIlllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIlIIIIIIIlll(final int llllllllllllIllIlIlIlIlIIIIlIllI, final int llllllllllllIllIlIlIlIlIIIIlIlIl) {
        return llllllllllllIllIlIlIlIlIIIIlIllI == llllllllllllIllIlIlIlIlIIIIlIlIl;
    }
    
    private static boolean lIIlIlIIIIIIlIIl(final int llllllllllllIllIlIlIlIlIIIIIlIlI, final int llllllllllllIllIlIlIlIlIIIIIlIIl) {
        return llllllllllllIllIlIlIlIlIIIIIlIlI <= llllllllllllIllIlIlIlIlIIIIIlIIl;
    }
    
    static {
        lIIlIlIIIIIIIIll();
        lIIlIlIIIIIIIIIl();
        DYE_TO_RGB = Maps.newEnumMap((Class)EnumDyeColor.class);
        final Map<EnumDyeColor, float[]> dye_TO_RGB = EntitySheep.DYE_TO_RGB;
        final EnumDyeColor white = EnumDyeColor.WHITE;
        final float[] array = new float[EntitySheep.llIlIlIIllIlIl[0]];
        array[EntitySheep.llIlIlIIllIlIl[1]] = 1.0f;
        array[EntitySheep.llIlIlIIllIlIl[2]] = 1.0f;
        array[EntitySheep.llIlIlIIllIlIl[3]] = 1.0f;
        dye_TO_RGB.put(white, array);
        "".length();
        final Map<EnumDyeColor, float[]> dye_TO_RGB2 = EntitySheep.DYE_TO_RGB;
        final EnumDyeColor orange = EnumDyeColor.ORANGE;
        final float[] array2 = new float[EntitySheep.llIlIlIIllIlIl[0]];
        array2[EntitySheep.llIlIlIIllIlIl[1]] = 0.85f;
        array2[EntitySheep.llIlIlIIllIlIl[2]] = 0.5f;
        array2[EntitySheep.llIlIlIIllIlIl[3]] = 0.2f;
        dye_TO_RGB2.put(orange, array2);
        "".length();
        final Map<EnumDyeColor, float[]> dye_TO_RGB3 = EntitySheep.DYE_TO_RGB;
        final EnumDyeColor magenta = EnumDyeColor.MAGENTA;
        final float[] array3 = new float[EntitySheep.llIlIlIIllIlIl[0]];
        array3[EntitySheep.llIlIlIIllIlIl[1]] = 0.7f;
        array3[EntitySheep.llIlIlIIllIlIl[2]] = 0.3f;
        array3[EntitySheep.llIlIlIIllIlIl[3]] = 0.85f;
        dye_TO_RGB3.put(magenta, array3);
        "".length();
        final Map<EnumDyeColor, float[]> dye_TO_RGB4 = EntitySheep.DYE_TO_RGB;
        final EnumDyeColor light_BLUE = EnumDyeColor.LIGHT_BLUE;
        final float[] array4 = new float[EntitySheep.llIlIlIIllIlIl[0]];
        array4[EntitySheep.llIlIlIIllIlIl[1]] = 0.4f;
        array4[EntitySheep.llIlIlIIllIlIl[2]] = 0.6f;
        array4[EntitySheep.llIlIlIIllIlIl[3]] = 0.85f;
        dye_TO_RGB4.put(light_BLUE, array4);
        "".length();
        final Map<EnumDyeColor, float[]> dye_TO_RGB5 = EntitySheep.DYE_TO_RGB;
        final EnumDyeColor yellow = EnumDyeColor.YELLOW;
        final float[] array5 = new float[EntitySheep.llIlIlIIllIlIl[0]];
        array5[EntitySheep.llIlIlIIllIlIl[1]] = 0.9f;
        array5[EntitySheep.llIlIlIIllIlIl[2]] = 0.9f;
        array5[EntitySheep.llIlIlIIllIlIl[3]] = 0.2f;
        dye_TO_RGB5.put(yellow, array5);
        "".length();
        final Map<EnumDyeColor, float[]> dye_TO_RGB6 = EntitySheep.DYE_TO_RGB;
        final EnumDyeColor lime = EnumDyeColor.LIME;
        final float[] array6 = new float[EntitySheep.llIlIlIIllIlIl[0]];
        array6[EntitySheep.llIlIlIIllIlIl[1]] = 0.5f;
        array6[EntitySheep.llIlIlIIllIlIl[2]] = 0.8f;
        array6[EntitySheep.llIlIlIIllIlIl[3]] = 0.1f;
        dye_TO_RGB6.put(lime, array6);
        "".length();
        final Map<EnumDyeColor, float[]> dye_TO_RGB7 = EntitySheep.DYE_TO_RGB;
        final EnumDyeColor pink = EnumDyeColor.PINK;
        final float[] array7 = new float[EntitySheep.llIlIlIIllIlIl[0]];
        array7[EntitySheep.llIlIlIIllIlIl[1]] = 0.95f;
        array7[EntitySheep.llIlIlIIllIlIl[2]] = 0.5f;
        array7[EntitySheep.llIlIlIIllIlIl[3]] = 0.65f;
        dye_TO_RGB7.put(pink, array7);
        "".length();
        final Map<EnumDyeColor, float[]> dye_TO_RGB8 = EntitySheep.DYE_TO_RGB;
        final EnumDyeColor gray = EnumDyeColor.GRAY;
        final float[] array8 = new float[EntitySheep.llIlIlIIllIlIl[0]];
        array8[EntitySheep.llIlIlIIllIlIl[1]] = 0.3f;
        array8[EntitySheep.llIlIlIIllIlIl[2]] = 0.3f;
        array8[EntitySheep.llIlIlIIllIlIl[3]] = 0.3f;
        dye_TO_RGB8.put(gray, array8);
        "".length();
        final Map<EnumDyeColor, float[]> dye_TO_RGB9 = EntitySheep.DYE_TO_RGB;
        final EnumDyeColor silver = EnumDyeColor.SILVER;
        final float[] array9 = new float[EntitySheep.llIlIlIIllIlIl[0]];
        array9[EntitySheep.llIlIlIIllIlIl[1]] = 0.6f;
        array9[EntitySheep.llIlIlIIllIlIl[2]] = 0.6f;
        array9[EntitySheep.llIlIlIIllIlIl[3]] = 0.6f;
        dye_TO_RGB9.put(silver, array9);
        "".length();
        final Map<EnumDyeColor, float[]> dye_TO_RGB10 = EntitySheep.DYE_TO_RGB;
        final EnumDyeColor cyan = EnumDyeColor.CYAN;
        final float[] array10 = new float[EntitySheep.llIlIlIIllIlIl[0]];
        array10[EntitySheep.llIlIlIIllIlIl[1]] = 0.3f;
        array10[EntitySheep.llIlIlIIllIlIl[2]] = 0.5f;
        array10[EntitySheep.llIlIlIIllIlIl[3]] = 0.6f;
        dye_TO_RGB10.put(cyan, array10);
        "".length();
        final Map<EnumDyeColor, float[]> dye_TO_RGB11 = EntitySheep.DYE_TO_RGB;
        final EnumDyeColor purple = EnumDyeColor.PURPLE;
        final float[] array11 = new float[EntitySheep.llIlIlIIllIlIl[0]];
        array11[EntitySheep.llIlIlIIllIlIl[1]] = 0.5f;
        array11[EntitySheep.llIlIlIIllIlIl[2]] = 0.25f;
        array11[EntitySheep.llIlIlIIllIlIl[3]] = 0.7f;
        dye_TO_RGB11.put(purple, array11);
        "".length();
        final Map<EnumDyeColor, float[]> dye_TO_RGB12 = EntitySheep.DYE_TO_RGB;
        final EnumDyeColor blue = EnumDyeColor.BLUE;
        final float[] array12 = new float[EntitySheep.llIlIlIIllIlIl[0]];
        array12[EntitySheep.llIlIlIIllIlIl[1]] = 0.2f;
        array12[EntitySheep.llIlIlIIllIlIl[2]] = 0.3f;
        array12[EntitySheep.llIlIlIIllIlIl[3]] = 0.7f;
        dye_TO_RGB12.put(blue, array12);
        "".length();
        final Map<EnumDyeColor, float[]> dye_TO_RGB13 = EntitySheep.DYE_TO_RGB;
        final EnumDyeColor brown = EnumDyeColor.BROWN;
        final float[] array13 = new float[EntitySheep.llIlIlIIllIlIl[0]];
        array13[EntitySheep.llIlIlIIllIlIl[1]] = 0.4f;
        array13[EntitySheep.llIlIlIIllIlIl[2]] = 0.3f;
        array13[EntitySheep.llIlIlIIllIlIl[3]] = 0.2f;
        dye_TO_RGB13.put(brown, array13);
        "".length();
        final Map<EnumDyeColor, float[]> dye_TO_RGB14 = EntitySheep.DYE_TO_RGB;
        final EnumDyeColor green = EnumDyeColor.GREEN;
        final float[] array14 = new float[EntitySheep.llIlIlIIllIlIl[0]];
        array14[EntitySheep.llIlIlIIllIlIl[1]] = 0.4f;
        array14[EntitySheep.llIlIlIIllIlIl[2]] = 0.5f;
        array14[EntitySheep.llIlIlIIllIlIl[3]] = 0.2f;
        dye_TO_RGB14.put(green, array14);
        "".length();
        final Map<EnumDyeColor, float[]> dye_TO_RGB15 = EntitySheep.DYE_TO_RGB;
        final EnumDyeColor red = EnumDyeColor.RED;
        final float[] array15 = new float[EntitySheep.llIlIlIIllIlIl[0]];
        array15[EntitySheep.llIlIlIIllIlIl[1]] = 0.6f;
        array15[EntitySheep.llIlIlIIllIlIl[2]] = 0.2f;
        array15[EntitySheep.llIlIlIIllIlIl[3]] = 0.2f;
        dye_TO_RGB15.put(red, array15);
        "".length();
        final Map<EnumDyeColor, float[]> dye_TO_RGB16 = EntitySheep.DYE_TO_RGB;
        final EnumDyeColor black = EnumDyeColor.BLACK;
        final float[] array16 = new float[EntitySheep.llIlIlIIllIlIl[0]];
        array16[EntitySheep.llIlIlIIllIlIl[1]] = 0.1f;
        array16[EntitySheep.llIlIlIIllIlIl[2]] = 0.1f;
        array16[EntitySheep.llIlIlIIllIlIl[3]] = 0.1f;
        dye_TO_RGB16.put(black, array16);
        "".length();
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound llllllllllllIllIlIlIlIllIIIIIIll) {
        super.readEntityFromNBT(llllllllllllIllIlIlIlIllIIIIIIll);
        this.setSheared(llllllllllllIllIlIlIlIllIIIIIIll.getBoolean(EntitySheep.llIlIlIIllIlII[EntitySheep.llIlIlIIllIlIl[0]]));
        this.setFleeceColor(EnumDyeColor.byMetadata(llllllllllllIllIlIlIlIllIIIIIIll.getByte(EntitySheep.llIlIlIIllIlII[EntitySheep.llIlIlIIllIlIl[4]])));
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound llllllllllllIllIlIlIlIllIIIIlIIl) {
        super.writeEntityToNBT(llllllllllllIllIlIlIlIllIIIIlIIl);
        llllllllllllIllIlIlIlIllIIIIlIIl.setBoolean(EntitySheep.llIlIlIIllIlII[EntitySheep.llIlIlIIllIlIl[2]], this.getSheared());
        llllllllllllIllIlIlIlIllIIIIlIIl.setByte(EntitySheep.llIlIlIIllIlII[EntitySheep.llIlIlIIllIlIl[3]], (byte)this.getFleeceColor().getMetadata());
    }
    
    private static boolean lIIlIlIIIIIIlIII(final int llllllllllllIllIlIlIlIIllllllIIl) {
        return llllllllllllIllIlIlIlIIllllllIIl <= 0;
    }
    
    @Override
    public boolean interact(final EntityPlayer llllllllllllIllIlIlIlIllIIIlllIl) {
        final ItemStack llllllllllllIllIlIlIlIllIIlIIllI = llllllllllllIllIlIlIlIllIIIlllIl.inventory.getCurrentItem();
        if (lIIlIlIIIIIIllIl(llllllllllllIllIlIlIlIllIIlIIllI) && lIIlIlIIIIIIlllI(llllllllllllIllIlIlIlIllIIlIIllI.getItem(), Items.shears) && lIIlIlIIIIIIIlIl(this.getSheared() ? 1 : 0) && lIIlIlIIIIIIIlIl(this.isChild() ? 1 : 0)) {
            if (lIIlIlIIIIIIIlIl(this.worldObj.isRemote ? 1 : 0)) {
                this.setSheared((boolean)(EntitySheep.llIlIlIIllIlIl[2] != 0));
                final int llllllllllllIllIlIlIlIllIIlIIlII = EntitySheep.llIlIlIIllIlIl[2] + this.rand.nextInt(EntitySheep.llIlIlIIllIlIl[0]);
                int llllllllllllIllIlIlIlIllIIlIIIlI = EntitySheep.llIlIlIIllIlIl[1];
                "".length();
                if (" ".length() >= (0x95 ^ 0x91)) {
                    return ((0x56 ^ 0x51) & ~(0xAA ^ 0xAD)) != 0x0;
                }
                while (!lIIlIlIIIIIIIllI(llllllllllllIllIlIlIlIllIIlIIIlI, llllllllllllIllIlIlIlIllIIlIIlII)) {
                    final EntityItem entityDropItem;
                    final EntityItem llllllllllllIllIlIlIlIllIIlIIIII = entityDropItem = this.entityDropItem(new ItemStack(Item.getItemFromBlock(Blocks.wool), EntitySheep.llIlIlIIllIlIl[2], this.getFleeceColor().getMetadata()), 1.0f);
                    entityDropItem.motionY += this.rand.nextFloat() * 0.05f;
                    final EntityItem entityItem = llllllllllllIllIlIlIlIllIIlIIIII;
                    entityItem.motionX += (this.rand.nextFloat() - this.rand.nextFloat()) * 0.1f;
                    final EntityItem entityItem2 = llllllllllllIllIlIlIlIllIIlIIIII;
                    entityItem2.motionZ += (this.rand.nextFloat() - this.rand.nextFloat()) * 0.1f;
                    ++llllllllllllIllIlIlIlIllIIlIIIlI;
                }
            }
            llllllllllllIllIlIlIlIllIIlIIllI.damageItem(EntitySheep.llIlIlIIllIlIl[2], llllllllllllIllIlIlIlIllIIIlllIl);
            this.playSound(EntitySheep.llIlIlIIllIlII[EntitySheep.llIlIlIIllIlIl[1]], 1.0f, 1.0f);
        }
        return super.interact(llllllllllllIllIlIlIlIllIIIlllIl);
    }
    
    private static boolean lIIlIlIIIIIIlllI(final Object llllllllllllIllIlIlIlIlIIIIIIIII, final Object llllllllllllIllIlIlIlIIlllllllll) {
        return llllllllllllIllIlIlIlIlIIIIIIIII == llllllllllllIllIlIlIlIIlllllllll;
    }
    
    private static boolean lIIlIlIIIIIIllII(final int llllllllllllIllIlIlIlIIlllllIlll) {
        return llllllllllllIllIlIlIlIIlllllIlll > 0;
    }
    
    public float getHeadRotationPointY(final float llllllllllllIllIlIlIlIllIlIllIII) {
        float n;
        if (lIIlIlIIIIIIlIII(this.sheepTimer)) {
            n = 0.0f;
            "".length();
            if (null != null) {
                return 0.0f;
            }
        }
        else if (lIIlIlIIIIIIIllI(this.sheepTimer, EntitySheep.llIlIlIIllIlIl[4]) && lIIlIlIIIIIIlIIl(this.sheepTimer, EntitySheep.llIlIlIIllIlIl[12])) {
            n = 1.0f;
            "".length();
            if (((0x6C ^ 0x4D) & ~(0x70 ^ 0x51)) > 0) {
                return 0.0f;
            }
        }
        else if (lIIlIlIIIIIIlIlI(this.sheepTimer, EntitySheep.llIlIlIIllIlIl[4])) {
            n = (this.sheepTimer - llllllllllllIllIlIlIlIllIlIllIII) / 4.0f;
            "".length();
            if ("  ".length() > "   ".length()) {
                return 0.0f;
            }
        }
        else {
            n = -(this.sheepTimer - EntitySheep.llIlIlIIllIlIl[11] - llllllllllllIllIlIlIlIllIlIllIII) / 4.0f;
        }
        return n;
    }
    
    public float getHeadRotationAngleX(final float llllllllllllIllIlIlIlIllIlIIIIlI) {
        if (lIIlIlIIIIIIlIll(this.sheepTimer, EntitySheep.llIlIlIIllIlIl[4]) && lIIlIlIIIIIIlIIl(this.sheepTimer, EntitySheep.llIlIlIIllIlIl[12])) {
            final float llllllllllllIllIlIlIlIllIlIIIllI = (this.sheepTimer - EntitySheep.llIlIlIIllIlIl[4] - llllllllllllIllIlIlIlIllIlIIIIlI) / 32.0f;
            return 0.62831855f + 0.2199115f * MathHelper.sin(llllllllllllIllIlIlIlIllIlIIIllI * 28.7f);
        }
        float n;
        if (lIIlIlIIIIIIllII(this.sheepTimer)) {
            n = 0.62831855f;
            "".length();
            if (-" ".length() == "   ".length()) {
                return 0.0f;
            }
        }
        else {
            n = this.rotationPitch / 57.295776f;
        }
        return n;
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(8.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.23000000417232513);
    }
    
    @Override
    public void handleStatusUpdate(final byte llllllllllllIllIlIlIlIllIlIllllI) {
        if (lIIlIlIIIIIIIlll(llllllllllllIllIlIlIlIllIlIllllI, EntitySheep.llIlIlIIllIlIl[10])) {
            this.sheepTimer = EntitySheep.llIlIlIIllIlIl[11];
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else {
            super.handleStatusUpdate(llllllllllllIllIlIlIlIllIlIllllI);
        }
    }
    
    @Override
    public IEntityLivingData onInitialSpawn(final DifficultyInstance llllllllllllIllIlIlIlIlIlIIIllll, IEntityLivingData llllllllllllIllIlIlIlIlIlIIIlIII) {
        llllllllllllIllIlIlIlIlIlIIIlIII = (int)super.onInitialSpawn(llllllllllllIllIlIlIlIlIlIIIllll, (IEntityLivingData)llllllllllllIllIlIlIlIlIlIIIlIII);
        this.setFleeceColor(getRandomSheepColor(this.worldObj.rand));
        return (IEntityLivingData)llllllllllllIllIlIlIlIlIlIIIlIII;
    }
    
    private static boolean lIIlIlIIIIIIIlII(final int llllllllllllIllIlIlIlIIlllllllIl) {
        return llllllllllllIllIlIlIlIIlllllllIl != 0;
    }
    
    public EntitySheep(final World llllllllllllIllIlIlIlIlllIIllllI) {
        super(llllllllllllIllIlIlIlIlllIIllllI);
        this.inventoryCrafting = new InventoryCrafting(new Container() {
            private static final /* synthetic */ int[] llIIlllIlIIIII;
            
            @Override
            public boolean canInteractWith(final EntityPlayer llllllllllllIllIllllIllllIllIllI) {
                return EntitySheep$1.llIIlllIlIIIII[0] != 0;
            }
            
            static {
                lIIIlllllIIIllIl();
            }
            
            private static void lIIIlllllIIIllIl() {
                (llIIlllIlIIIII = new int[1])[0] = ((0x28 ^ 0x3C) & ~(0x30 ^ 0x24));
            }
        }, EntitySheep.llIlIlIIllIlIl[3], EntitySheep.llIlIlIIllIlIl[2]);
        this.entityAIEatGrass = new EntityAIEatGrass(this);
        this.setSize(0.9f, 1.3f);
        ((PathNavigateGround)this.getNavigator()).setAvoidsWater((boolean)(EntitySheep.llIlIlIIllIlIl[2] != 0));
        this.tasks.addTask(EntitySheep.llIlIlIIllIlIl[1], new EntityAISwimming(this));
        this.tasks.addTask(EntitySheep.llIlIlIIllIlIl[2], new EntityAIPanic(this, 1.25));
        this.tasks.addTask(EntitySheep.llIlIlIIllIlIl[3], new EntityAIMate(this, 1.0));
        this.tasks.addTask(EntitySheep.llIlIlIIllIlIl[0], new EntityAITempt(this, 1.1, Items.wheat, (boolean)(EntitySheep.llIlIlIIllIlIl[1] != 0)));
        this.tasks.addTask(EntitySheep.llIlIlIIllIlIl[4], new EntityAIFollowParent(this, 1.1));
        this.tasks.addTask(EntitySheep.llIlIlIIllIlIl[5], this.entityAIEatGrass);
        this.tasks.addTask(EntitySheep.llIlIlIIllIlIl[6], new EntityAIWander(this, 1.0));
        this.tasks.addTask(EntitySheep.llIlIlIIllIlIl[7], new EntityAIWatchClosest(this, EntityPlayer.class, 6.0f));
        this.tasks.addTask(EntitySheep.llIlIlIIllIlIl[8], new EntityAILookIdle(this));
        this.inventoryCrafting.setInventorySlotContents(EntitySheep.llIlIlIIllIlIl[1], new ItemStack(Items.dye, EntitySheep.llIlIlIIllIlIl[2], EntitySheep.llIlIlIIllIlIl[1]));
        this.inventoryCrafting.setInventorySlotContents(EntitySheep.llIlIlIIllIlIl[2], new ItemStack(Items.dye, EntitySheep.llIlIlIIllIlIl[2], EntitySheep.llIlIlIIllIlIl[1]));
    }
    
    public static EnumDyeColor getRandomSheepColor(final Random llllllllllllIllIlIlIlIlIlIllIlIl) {
        final int llllllllllllIllIlIlIlIlIlIllIllI = llllllllllllIllIlIlIlIlIlIllIlIl.nextInt(EntitySheep.llIlIlIIllIlIl[16]);
        EnumDyeColor enumDyeColor;
        if (lIIlIlIIIIIIlIlI(llllllllllllIllIlIlIlIlIlIllIllI, EntitySheep.llIlIlIIllIlIl[5])) {
            enumDyeColor = EnumDyeColor.BLACK;
            "".length();
            if ("   ".length() <= "  ".length()) {
                return null;
            }
        }
        else if (lIIlIlIIIIIIlIlI(llllllllllllIllIlIlIlIlIlIllIllI, EntitySheep.llIlIlIIllIlIl[10])) {
            enumDyeColor = EnumDyeColor.GRAY;
            "".length();
            if (((0xA7 ^ 0xC4) & ~(0xCF ^ 0xAC)) != 0x0) {
                return null;
            }
        }
        else if (lIIlIlIIIIIIlIlI(llllllllllllIllIlIlIlIlIlIllIllI, EntitySheep.llIlIlIIllIlIl[13])) {
            enumDyeColor = EnumDyeColor.SILVER;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (lIIlIlIIIIIIlIlI(llllllllllllIllIlIlIlIlIlIllIllI, EntitySheep.llIlIlIIllIlIl[17])) {
            enumDyeColor = EnumDyeColor.BROWN;
            "".length();
            if ("   ".length() < " ".length()) {
                return null;
            }
        }
        else if (lIIlIlIIIIIIIlIl(llllllllllllIllIlIlIlIlIlIllIlIl.nextInt(EntitySheep.llIlIlIIllIlIl[18]))) {
            enumDyeColor = EnumDyeColor.PINK;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            enumDyeColor = EnumDyeColor.WHITE;
        }
        return enumDyeColor;
    }
    
    public void setSheared(final boolean llllllllllllIllIlIlIlIlIllIIIlII) {
        final byte llllllllllllIllIlIlIlIlIllIIIIll = this.dataWatcher.getWatchableObjectByte(EntitySheep.llIlIlIIllIlIl[9]);
        if (lIIlIlIIIIIIIlII(llllllllllllIllIlIlIlIlIllIIIlII ? 1 : 0)) {
            this.dataWatcher.updateObject(EntitySheep.llIlIlIIllIlIl[9], (byte)(llllllllllllIllIlIlIlIlIllIIIIll | EntitySheep.llIlIlIIllIlIl[9]));
            "".length();
            if (" ".length() > "  ".length()) {
                return;
            }
        }
        else {
            this.dataWatcher.updateObject(EntitySheep.llIlIlIIllIlIl[9], (byte)(llllllllllllIllIlIlIlIlIllIIIIll & EntitySheep.llIlIlIIllIlIl[15]));
        }
    }
    
    private static void lIIlIlIIIIIIIIll() {
        (llIlIlIIllIlIl = new int[21])[0] = "   ".length();
        EntitySheep.llIlIlIIllIlIl[1] = ((0xE6 ^ 0xBE) & ~(0xC2 ^ 0x9A));
        EntitySheep.llIlIlIIllIlIl[2] = " ".length();
        EntitySheep.llIlIlIIllIlIl[3] = "  ".length();
        EntitySheep.llIlIlIIllIlIl[4] = (0x91 ^ 0x88 ^ (0x16 ^ 0xB));
        EntitySheep.llIlIlIIllIlIl[5] = (0x5B ^ 0x5E);
        EntitySheep.llIlIlIIllIlIl[6] = (51 + 130 - 134 + 115 ^ 55 + 20 - 29 + 118);
        EntitySheep.llIlIlIIllIlIl[7] = (0xD ^ 0xA);
        EntitySheep.llIlIlIIllIlIl[8] = (0x7C ^ 0x74);
        EntitySheep.llIlIlIIllIlIl[9] = (0x31 ^ 0x5A ^ (0x27 ^ 0x5C));
        EntitySheep.llIlIlIIllIlIl[10] = (0x1B ^ 0x11);
        EntitySheep.llIlIlIIllIlIl[11] = (0x92 ^ 0xBA);
        EntitySheep.llIlIlIIllIlIl[12] = (0x3 ^ 0x27);
        EntitySheep.llIlIlIIllIlIl[13] = (0x18 ^ 0x17);
        EntitySheep.llIlIlIIllIlIl[14] = (0x7A ^ 0x11) + (95 + 34 + 8 + 51) - (0x1C ^ 0x7F) + (0x98 ^ 0xB4);
        EntitySheep.llIlIlIIllIlIl[15] = -(0xAB ^ 0xBA);
        EntitySheep.llIlIlIIllIlIl[16] = (0xEF ^ 0x8B);
        EntitySheep.llIlIlIIllIlIl[17] = (0x9C ^ 0x8E);
        EntitySheep.llIlIlIIllIlIl[18] = (-(0xFFFFD9BB & 0x7E46) & (0xFFFFFDF7 & 0x5BFD));
        EntitySheep.llIlIlIIllIlIl[19] = (0x29 ^ 0x15);
        EntitySheep.llIlIlIIllIlIl[20] = (0xAF ^ 0xA6);
    }
    
    public void setFleeceColor(final EnumDyeColor llllllllllllIllIlIlIlIlIllIllllI) {
        final byte llllllllllllIllIlIlIlIlIllIlllII = this.dataWatcher.getWatchableObjectByte(EntitySheep.llIlIlIIllIlIl[9]);
        this.dataWatcher.updateObject(EntitySheep.llIlIlIIllIlIl[9], (byte)((llllllllllllIllIlIlIlIlIllIlllII & EntitySheep.llIlIlIIllIlIl[14]) | (llllllllllllIllIlIlIlIlIllIllllI.getMetadata() & EntitySheep.llIlIlIIllIlIl[13])));
    }
    
    @Override
    public EntitySheep createChild(final EntityAgeable llllllllllllIllIlIlIlIlIlIlIlIII) {
        final EntitySheep llllllllllllIllIlIlIlIlIlIlIIlll = (EntitySheep)llllllllllllIllIlIlIlIlIlIlIlIII;
        final EntitySheep llllllllllllIllIlIlIlIlIlIlIIlIl = new EntitySheep(this.worldObj);
        llllllllllllIllIlIlIlIlIlIlIIlIl.setFleeceColor(this.getDyeColorMixFromParents(this, llllllllllllIllIlIlIlIlIlIlIIlll));
        return llllllllllllIllIlIlIlIlIlIlIIlIl;
    }
    
    @Override
    public float getEyeHeight() {
        return 0.95f * this.height;
    }
    
    public boolean getSheared() {
        if (lIIlIlIIIIIIIlII(this.dataWatcher.getWatchableObjectByte(EntitySheep.llIlIlIIllIlIl[9]) & EntitySheep.llIlIlIIllIlIl[9])) {
            return EntitySheep.llIlIlIIllIlIl[2] != 0;
        }
        return EntitySheep.llIlIlIIllIlIl[1] != 0;
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(EntitySheep.llIlIlIIllIlIl[9], new Byte((byte)EntitySheep.llIlIlIIllIlIl[1]));
    }
    
    @Override
    protected String getLivingSound() {
        return EntitySheep.llIlIlIIllIlII[EntitySheep.llIlIlIIllIlIl[5]];
    }
    
    private static boolean lIIlIlIIIIIIIllI(final int llllllllllllIllIlIlIlIlIIIIlIIlI, final int llllllllllllIllIlIlIlIlIIIIlIIIl) {
        return llllllllllllIllIlIlIlIlIIIIlIIlI >= llllllllllllIllIlIlIlIlIIIIlIIIl;
    }
    
    @Override
    public void eatGrassBonus() {
        this.setSheared((boolean)(EntitySheep.llIlIlIIllIlIl[1] != 0));
        if (lIIlIlIIIIIIIlII(this.isChild() ? 1 : 0)) {
            this.addGrowth(EntitySheep.llIlIlIIllIlIl[19]);
        }
    }
    
    @Override
    protected void updateAITasks() {
        this.sheepTimer = this.entityAIEatGrass.getEatingGrassTimer();
        super.updateAITasks();
    }
    
    @Override
    protected void dropFewItems(final boolean llllllllllllIllIlIlIlIllIlllIlII, final int llllllllllllIllIlIlIlIllIlllIIll) {
        if (lIIlIlIIIIIIIlIl(this.getSheared() ? 1 : 0)) {
            this.entityDropItem(new ItemStack(Item.getItemFromBlock(Blocks.wool), EntitySheep.llIlIlIIllIlIl[2], this.getFleeceColor().getMetadata()), 0.0f);
            "".length();
        }
        final int llllllllllllIllIlIlIlIllIlllIIIl = this.rand.nextInt(EntitySheep.llIlIlIIllIlIl[3]) + EntitySheep.llIlIlIIllIlIl[2] + this.rand.nextInt(EntitySheep.llIlIlIIllIlIl[2] + llllllllllllIllIlIlIlIllIlllIIll);
        int llllllllllllIllIlIlIlIllIllIllll = EntitySheep.llIlIlIIllIlIl[1];
        "".length();
        if (((0x7F ^ 0x10 ^ (0xEA ^ 0x98)) & (0x23 ^ 0x34 ^ (0x3C ^ 0x36) ^ -" ".length())) > "  ".length()) {
            return;
        }
        while (!lIIlIlIIIIIIIllI(llllllllllllIllIlIlIlIllIllIllll, llllllllllllIllIlIlIlIllIlllIIIl)) {
            if (lIIlIlIIIIIIIlII(this.isBurning() ? 1 : 0)) {
                this.dropItem(Items.cooked_mutton, EntitySheep.llIlIlIIllIlIl[2]);
                "".length();
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
            }
            else {
                this.dropItem(Items.mutton, EntitySheep.llIlIlIIllIlIl[2]);
                "".length();
            }
            ++llllllllllllIllIlIlIlIllIllIllll;
        }
    }
    
    private static String lIIlIIllllllllIl(String llllllllllllIllIlIlIlIlIIIlIlllI, final String llllllllllllIllIlIlIlIlIIIlIllIl) {
        llllllllllllIllIlIlIlIlIIIlIlllI = new String(Base64.getDecoder().decode(llllllllllllIllIlIlIlIlIIIlIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIlIlIlIIIllIIIl = new StringBuilder();
        final char[] llllllllllllIllIlIlIlIlIIIllIIII = llllllllllllIllIlIlIlIlIIIlIllIl.toCharArray();
        int llllllllllllIllIlIlIlIlIIIlIllll = EntitySheep.llIlIlIIllIlIl[1];
        final float llllllllllllIllIlIlIlIlIIIlIlIIl = (Object)llllllllllllIllIlIlIlIlIIIlIlllI.toCharArray();
        final boolean llllllllllllIllIlIlIlIlIIIlIlIII = llllllllllllIllIlIlIlIlIIIlIlIIl.length != 0;
        float llllllllllllIllIlIlIlIlIIIlIIlll = EntitySheep.llIlIlIIllIlIl[1];
        while (lIIlIlIIIIIIlIlI((int)llllllllllllIllIlIlIlIlIIIlIIlll, llllllllllllIllIlIlIlIlIIIlIlIII ? 1 : 0)) {
            final char llllllllllllIllIlIlIlIlIIIllIlII = llllllllllllIllIlIlIlIlIIIlIlIIl[llllllllllllIllIlIlIlIlIIIlIIlll];
            llllllllllllIllIlIlIlIlIIIllIIIl.append((char)(llllllllllllIllIlIlIlIlIIIllIlII ^ llllllllllllIllIlIlIlIlIIIllIIII[llllllllllllIllIlIlIlIlIIIlIllll % llllllllllllIllIlIlIlIlIIIllIIII.length]));
            "".length();
            ++llllllllllllIllIlIlIlIlIIIlIllll;
            ++llllllllllllIllIlIlIlIlIIIlIIlll;
            "".length();
            if (" ".length() >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIlIlIlIIIllIIIl);
    }
    
    @Override
    public void onLivingUpdate() {
        if (lIIlIlIIIIIIIlII(this.worldObj.isRemote ? 1 : 0)) {
            this.sheepTimer = Math.max(EntitySheep.llIlIlIIllIlIl[1], this.sheepTimer - EntitySheep.llIlIlIIllIlIl[2]);
        }
        super.onLivingUpdate();
    }
    
    private static String lIIlIIlllllllllI(final String llllllllllllIllIlIlIlIlIIlIIIIIl, final String llllllllllllIllIlIlIlIlIIlIIIIlI) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIlIlIIlIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIlIlIIlIIIIlI.getBytes(StandardCharsets.UTF_8)), EntitySheep.llIlIlIIllIlIl[8]), "DES");
            final Cipher llllllllllllIllIlIlIlIlIIlIIIlIl = Cipher.getInstance("DES");
            llllllllllllIllIlIlIlIlIIlIIIlIl.init(EntitySheep.llIlIlIIllIlIl[3], llllllllllllIllIlIlIlIlIIlIIIllI);
            return new String(llllllllllllIllIlIlIlIlIIlIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIlIlIIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIlIlIIlIIIlII) {
            llllllllllllIllIlIlIlIlIIlIIIlII.printStackTrace();
            return null;
        }
    }
    
    public EnumDyeColor getFleeceColor() {
        return EnumDyeColor.byMetadata(this.dataWatcher.getWatchableObjectByte(EntitySheep.llIlIlIIllIlIl[9]) & EntitySheep.llIlIlIIllIlIl[13]);
    }
    
    private static void lIIlIlIIIIIIIIIl() {
        (llIlIlIIllIlII = new String[EntitySheep.llIlIlIIllIlIl[20]])[EntitySheep.llIlIlIIllIlIl[1]] = lIIlIIllllllllII("fm+YizxW/dsE/+2Hv9AXag==", "MqQeM");
        EntitySheep.llIlIlIIllIlII[EntitySheep.llIlIlIIllIlIl[2]] = lIIlIIllllllllIl("Kx43GRUdEg==", "xvRxg");
        EntitySheep.llIlIlIIllIlII[EntitySheep.llIlIlIIllIlIl[3]] = lIIlIIlllllllllI("44C+GKG4xAQ=", "CAoSZ");
        EntitySheep.llIlIlIIllIlII[EntitySheep.llIlIlIIllIlIl[0]] = lIIlIIllllllllII("DsQyUMAOqXw=", "Osqzu");
        EntitySheep.llIlIlIIllIlII[EntitySheep.llIlIlIIllIlIl[4]] = lIIlIIlllllllllI("xuzkeJ5oBJU=", "zDLvw");
        EntitySheep.llIlIlIIllIlII[EntitySheep.llIlIlIIllIlIl[5]] = lIIlIIllllllllII("reMGVPqaL88M+/mC+SbHGA==", "ACBFD");
        EntitySheep.llIlIlIIllIlII[EntitySheep.llIlIlIIllIlIl[6]] = lIIlIIllllllllIl("CDgHWSMNMgAHfhY2HA==", "eWewP");
        EntitySheep.llIlIlIIllIlII[EntitySheep.llIlIlIIllIlIl[7]] = lIIlIIllllllllII("TxD3VburkGKd8mON0XYBHw==", "LXllz");
        EntitySheep.llIlIlIIllIlII[EntitySheep.llIlIlIIllIlIl[8]] = lIIlIIllllllllIl("JzkOQjQiMwkcaTkiCRw=", "JVllG");
    }
    
    private static boolean lIIlIlIIIIIIlIlI(final int llllllllllllIllIlIlIlIlIIIIIlllI, final int llllllllllllIllIlIlIlIlIIIIIllIl) {
        return llllllllllllIllIlIlIlIlIIIIIlllI < llllllllllllIllIlIlIlIlIIIIIllIl;
    }
    
    public static float[] func_175513_a(final EnumDyeColor llllllllllllIllIlIlIlIlllIlIlIlI) {
        return EntitySheep.DYE_TO_RGB.get(llllllllllllIllIlIlIlIlllIlIlIlI);
    }
    
    @Override
    protected String getDeathSound() {
        return EntitySheep.llIlIlIIllIlII[EntitySheep.llIlIlIIllIlIl[7]];
    }
    
    private static boolean lIIlIlIIIIIIIlIl(final int llllllllllllIllIlIlIlIIllllllIll) {
        return llllllllllllIllIlIlIlIIllllllIll == 0;
    }
    
    private EnumDyeColor getDyeColorMixFromParents(final EntityAnimal llllllllllllIllIlIlIlIlIIllIllIl, final EntityAnimal llllllllllllIllIlIlIlIlIIllIlIlI) {
        final int llllllllllllIllIlIlIlIlIIllIlIIl = ((EntitySheep)llllllllllllIllIlIlIlIlIIllIllIl).getFleeceColor().getDyeDamage();
        final int llllllllllllIllIlIlIlIlIIllIlIII = ((EntitySheep)llllllllllllIllIlIlIlIlIIllIlIlI).getFleeceColor().getDyeDamage();
        this.inventoryCrafting.getStackInSlot(EntitySheep.llIlIlIIllIlIl[1]).setItemDamage(llllllllllllIllIlIlIlIlIIllIlIIl);
        this.inventoryCrafting.getStackInSlot(EntitySheep.llIlIlIIllIlIl[2]).setItemDamage(llllllllllllIllIlIlIlIlIIllIlIII);
        final ItemStack llllllllllllIllIlIlIlIlIIllIIlll = CraftingManager.getInstance().findMatchingRecipe(this.inventoryCrafting, ((EntitySheep)llllllllllllIllIlIlIlIlIIllIllIl).worldObj);
        int llllllllllllIllIlIlIlIlIIllIIlIl = 0;
        if (lIIlIlIIIIIIllIl(llllllllllllIllIlIlIlIlIIllIIlll) && lIIlIlIIIIIIlllI(llllllllllllIllIlIlIlIlIIllIIlll.getItem(), Items.dye)) {
            final int llllllllllllIllIlIlIlIlIIllIIllI = llllllllllllIllIlIlIlIlIIllIIlll.getMetadata();
            "".length();
            if (-" ".length() > -" ".length()) {
                return null;
            }
        }
        else {
            int n;
            if (lIIlIlIIIIIIIlII(this.worldObj.rand.nextBoolean() ? 1 : 0)) {
                n = llllllllllllIllIlIlIlIlIIllIlIIl;
                "".length();
                if (" ".length() == 0) {
                    return null;
                }
            }
            else {
                n = llllllllllllIllIlIlIlIlIIllIlIII;
            }
            llllllllllllIllIlIlIlIlIIllIIlIl = n;
        }
        return EnumDyeColor.byDyeDamage(llllllllllllIllIlIlIlIlIIllIIlIl);
    }
    
    @Override
    protected void playStepSound(final BlockPos llllllllllllIllIlIlIlIlIllllIlIl, final Block llllllllllllIllIlIlIlIlIllllIIll) {
        this.playSound(EntitySheep.llIlIlIIllIlII[EntitySheep.llIlIlIIllIlIl[8]], 0.15f, 1.0f);
    }
    
    @Override
    protected String getHurtSound() {
        return EntitySheep.llIlIlIIllIlII[EntitySheep.llIlIlIIllIlIl[6]];
    }
    
    private static boolean lIIlIlIIIIIIlIll(final int llllllllllllIllIlIlIlIlIIIIIIllI, final int llllllllllllIllIlIlIlIlIIIIIIlIl) {
        return llllllllllllIllIlIlIlIlIIIIIIllI > llllllllllllIllIlIlIlIlIIIIIIlIl;
    }
    
    @Override
    protected Item getDropItem() {
        return Item.getItemFromBlock(Blocks.wool);
    }
    
    private static boolean lIIlIlIIIIIIllIl(final Object llllllllllllIllIlIlIlIlIIIIIIIll) {
        return llllllllllllIllIlIlIlIlIIIIIIIll != null;
    }
}
