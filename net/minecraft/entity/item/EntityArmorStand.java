// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.item;

import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.Vec3;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.item.ItemBlock;
import net.minecraft.entity.EntityLiving;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.WorldServer;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rotations;
import net.minecraft.entity.EntityLivingBase;

public class EntityArmorStand extends EntityLivingBase
{
    private static final /* synthetic */ int[] lIllllIIIIlIll;
    private static final /* synthetic */ Rotations DEFAULT_HEAD_ROTATION;
    private /* synthetic */ Rotations leftLegRotation;
    private static final /* synthetic */ Rotations DEFAULT_RIGHTLEG_ROTATION;
    private /* synthetic */ Rotations bodyRotation;
    private static final /* synthetic */ Rotations DEFAULT_BODY_ROTATION;
    private static final /* synthetic */ String[] lIlllIlllIlIII;
    private /* synthetic */ Rotations headRotation;
    private static final /* synthetic */ Rotations DEFAULT_RIGHTARM_ROTATION;
    private /* synthetic */ Rotations rightLegRotation;
    private /* synthetic */ Rotations rightArmRotation;
    private /* synthetic */ boolean field_181028_bj;
    private static final /* synthetic */ Rotations DEFAULT_LEFTLEG_ROTATION;
    private /* synthetic */ Rotations leftArmRotation;
    private /* synthetic */ long punchCooldown;
    private static final /* synthetic */ Rotations DEFAULT_LEFTARM_ROTATION;
    private /* synthetic */ int disabledSlots;
    private /* synthetic */ boolean canInteract;
    private final /* synthetic */ ItemStack[] contents;
    
    private static boolean lIIIIIllllIlIIIl(final Object llllllllllllIllllIlIllllIllIIIll) {
        return llllllllllllIllllIlIllllIllIIIll != null;
    }
    
    @Override
    public boolean canBePushed() {
        return EntityArmorStand.lIllllIIIIlIll[2] != 0;
    }
    
    private void setShowArms(final boolean llllllllllllIllllIllIIIIIIIIIIII) {
        byte llllllllllllIllllIllIIIIIIIIIIlI = this.dataWatcher.getWatchableObjectByte(EntityArmorStand.lIllllIIIIlIll[3]);
        if (lIIIIIllllIIlIll(llllllllllllIllllIllIIIIIIIIIIII ? 1 : 0)) {
            llllllllllllIllllIllIIIIIIIIIIlI |= (byte)EntityArmorStand.lIllllIIIIlIll[12];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            llllllllllllIllllIllIIIIIIIIIIlI &= (byte)EntityArmorStand.lIllllIIIIlIll[38];
        }
        this.dataWatcher.updateObject(EntityArmorStand.lIllllIIIIlIll[3], llllllllllllIllllIllIIIIIIIIIIlI);
    }
    
    public Rotations getBodyRotation() {
        return this.bodyRotation;
    }
    
    private static String lIIIIIllIlllIIlI(final String llllllllllllIllllIlIlllllIlIIIIl, final String llllllllllllIllllIlIlllllIlIIIlI) {
        try {
            final SecretKeySpec llllllllllllIllllIlIlllllIlIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIlllllIlIIIlI.getBytes(StandardCharsets.UTF_8)), EntityArmorStand.lIllllIIIIlIll[17]), "DES");
            final Cipher llllllllllllIllllIlIlllllIlIIlIl = Cipher.getInstance("DES");
            llllllllllllIllllIlIlllllIlIIlIl.init(EntityArmorStand.lIllllIIIIlIll[13], llllllllllllIllllIlIlllllIlIIllI);
            return new String(llllllllllllIllllIlIlllllIlIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIlllllIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlIlllllIlIIlII) {
            llllllllllllIllllIlIlllllIlIIlII.printStackTrace();
            return null;
        }
    }
    
    public void setRightLegRotation(final Rotations llllllllllllIllllIlIllllllIIIIII) {
        this.rightLegRotation = llllllllllllIllllIlIllllllIIIIII;
        this.dataWatcher.updateObject(EntityArmorStand.lIllllIIIIlIll[9], llllllllllllIllllIlIllllllIIIIII);
    }
    
    private void writePoseToNBT(final NBTTagCompound llllllllllllIllllIllIIIIllllIlII) {
        final NBTTagList llllllllllllIllllIllIIIIlllllIll = llllllllllllIllllIllIIIIllllIlII.getTagList(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[22]], EntityArmorStand.lIllllIIIIlIll[0]);
        if (lIIIIIllllIlIIll(llllllllllllIllllIllIIIIlllllIll.tagCount())) {
            this.setHeadRotation(new Rotations(llllllllllllIllllIllIIIIlllllIll));
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
        }
        else {
            this.setHeadRotation(EntityArmorStand.DEFAULT_HEAD_ROTATION);
        }
        final NBTTagList llllllllllllIllllIllIIIIlllllIlI = llllllllllllIllllIllIIIIllllIlII.getTagList(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[23]], EntityArmorStand.lIllllIIIIlIll[0]);
        if (lIIIIIllllIlIIll(llllllllllllIllllIllIIIIlllllIlI.tagCount())) {
            this.setBodyRotation(new Rotations(llllllllllllIllllIllIIIIlllllIlI));
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        else {
            this.setBodyRotation(EntityArmorStand.DEFAULT_BODY_ROTATION);
        }
        final NBTTagList llllllllllllIllllIllIIIIlllllIIl = llllllllllllIllllIllIIIIllllIlII.getTagList(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[24]], EntityArmorStand.lIllllIIIIlIll[0]);
        if (lIIIIIllllIlIIll(llllllllllllIllllIllIIIIlllllIIl.tagCount())) {
            this.setLeftArmRotation(new Rotations(llllllllllllIllllIllIIIIlllllIIl));
            "".length();
            if (-" ".length() >= " ".length()) {
                return;
            }
        }
        else {
            this.setLeftArmRotation(EntityArmorStand.DEFAULT_LEFTARM_ROTATION);
        }
        final NBTTagList llllllllllllIllllIllIIIIlllllIII = llllllllllllIllllIllIIIIllllIlII.getTagList(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[25]], EntityArmorStand.lIllllIIIIlIll[0]);
        if (lIIIIIllllIlIIll(llllllllllllIllllIllIIIIlllllIII.tagCount())) {
            this.setRightArmRotation(new Rotations(llllllllllllIllllIllIIIIlllllIII));
            "".length();
            if (" ".length() != " ".length()) {
                return;
            }
        }
        else {
            this.setRightArmRotation(EntityArmorStand.DEFAULT_RIGHTARM_ROTATION);
        }
        final NBTTagList llllllllllllIllllIllIIIIllllIlll = llllllllllllIllllIllIIIIllllIlII.getTagList(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[26]], EntityArmorStand.lIllllIIIIlIll[0]);
        if (lIIIIIllllIlIIll(llllllllllllIllllIllIIIIllllIlll.tagCount())) {
            this.setLeftLegRotation(new Rotations(llllllllllllIllllIllIIIIllllIlll));
            "".length();
            if ((0x25 ^ 0x20) == 0x0) {
                return;
            }
        }
        else {
            this.setLeftLegRotation(EntityArmorStand.DEFAULT_LEFTLEG_ROTATION);
        }
        final NBTTagList llllllllllllIllllIllIIIIllllIllI = llllllllllllIllllIllIIIIllllIlII.getTagList(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[27]], EntityArmorStand.lIllllIIIIlIll[0]);
        if (lIIIIIllllIlIIll(llllllllllllIllllIllIIIIllllIllI.tagCount())) {
            this.setRightLegRotation(new Rotations(llllllllllllIllllIllIIIIllllIllI));
            "".length();
            if ("  ".length() <= -" ".length()) {
                return;
            }
        }
        else {
            this.setRightLegRotation(EntityArmorStand.DEFAULT_RIGHTLEG_ROTATION);
        }
    }
    
    private static void lIIIIIlllIIIllII() {
        (lIlllIlllIlIII = new String[EntityArmorStand.lIllllIIIIlIll[41]])[EntityArmorStand.lIllllIIIIlIll[2]] = lIIIIIllIlllIIlI("vyaZH3eGEluza4aP6l37nw==", "rcTNE");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[1]] = lIIIIIllIlllIIlI("SpEJlOD7PUvL+Q8RuDHqWO69/PKFGsLg", "hoNCi");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[13]] = lIIIIIllIlllIIll("aubkduLxFk5Vi7pxVyx6Dg==", "IMPmK");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[14]] = lIIIIIllIlllIIlI("CO9Wn5FzX0Y=", "ZfImY");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[12]] = lIIIIIllIlllllII("FxkWISI2HAo=", "DqyVc");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[0]] = lIIIIIllIlllIIll("q6uDrwTfGBm/pUHvYsC7NQ==", "OoZoV");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[15]] = lIIIIIllIlllIIll("pxOWcMsqZCmLlH3PM/imHw==", "yMYvp");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[16]] = lIIIIIllIlllIIlI("UvZtq1syKbVDW/KTHTeOeg==", "FFEVq");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[17]] = lIIIIIllIlllllII("Cy0nHwQ0", "FLUta");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[18]] = lIIIIIllIlllIIlI("/LNWHXalmYM=", "YCNPL");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[3]] = lIIIIIllIlllllII("FAUhExc8EToO", "QtTzg");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[4]] = lIIIIIllIlllIIll("61A+72xxczd4Gv5uAGqIWA==", "kqxUJ");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[5]] = lIIIIIllIlllIIlI("rmKGZzma2jS2B8vufiqeDw==", "usZBD");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[6]] = lIIIIIllIlllIIlI("z83QnQ1mbvc=", "DMTEa");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[7]] = lIIIIIllIlllIIll("RmtvO3JKD+Hq3g/1g0DPnA==", "TEqRV");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[8]] = lIIIIIllIlllIIll("EisU2pcL6vKSXMpRxO/GRQ==", "uhBPH");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[9]] = lIIIIIllIlllIIlI("8Q8/QI6V9jX4flUgpOyBvA==", "JBEeS");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[19]] = lIIIIIllIlllIIlI("DVBsTOwKtyrwB3DI1p0gfw==", "qKeHr");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[20]] = lIIIIIllIlllIIll("rEUzB7ah4DE=", "DXhxn");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[21]] = lIIIIIllIlllIIll("bTS64FwUzNc=", "eGLON");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[22]] = lIIIIIllIlllIIlI("uikUfZSVUY0=", "JWmUp");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[23]] = lIIIIIllIlllIIll("JguQgOHUFqw=", "UfGpj");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[24]] = lIIIIIllIlllIIll("OeYW9mvLIA8=", "jkTVu");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[25]] = lIIIIIllIlllIIll("8LRZV5Y5EPNuN7qqOoh1gA==", "JFeHf");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[26]] = lIIIIIllIlllIIll("um5E0JZ6gTs=", "lRWqV");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[27]] = lIIIIIllIlllIIlI("ucdGVBZA2XKkjKTRuNOJDw==", "IIszM");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[28]] = lIIIIIllIlllIIll("nwTjVIoMX6g=", "FZTqt");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[29]] = lIIIIIllIlllIIlI("esXW1wPxj7Y=", "wbhza");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[30]] = lIIIIIllIlllIIlI("l3krEuE0vG0=", "QocnD");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[31]] = lIIIIIllIlllIIll("6Q6b5IRDPPfs8vIBOEuOYg==", "zfHfq");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[32]] = lIIIIIllIlllllII("DSMCFgQkIQ==", "AFdbH");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[33]] = lIIIIIllIlllIIlI("WlYI2QQzmXOShoOBsKrTMQ==", "ItKuj");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[34]] = lIIIIIllIlllIIlI("J6GfFTEMiPs=", "UZahP");
        EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[35]] = lIIIIIllIlllIIll("D9MihH0FPvA=", "BbIQh");
    }
    
    @Override
    public boolean canBeCollidedWith() {
        if (lIIIIIllllIIlIll(super.canBeCollidedWith() ? 1 : 0) && lIIIIIllllIIllII(this.func_181026_s() ? 1 : 0)) {
            return EntityArmorStand.lIllllIIIIlIll[1] != 0;
        }
        return EntityArmorStand.lIllllIIIIlIll[2] != 0;
    }
    
    public void setBodyRotation(final Rotations llllllllllllIllllIlIllllllIllIlI) {
        this.bodyRotation = llllllllllllIllllIlIllllllIllIlI;
        this.dataWatcher.updateObject(EntityArmorStand.lIllllIIIIlIll[5], llllllllllllIllllIlIllllllIllIlI);
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound llllllllllllIllllIllIIIlIIIlIllI) {
        super.writeEntityToNBT(llllllllllllIllllIllIIIlIIIlIllI);
        final NBTTagList llllllllllllIllllIllIIIlIIIllIlI = new NBTTagList();
        int llllllllllllIllllIllIIIlIIIllIIl = EntityArmorStand.lIllllIIIIlIll[2];
        "".length();
        if ("   ".length() < " ".length()) {
            return;
        }
        while (!lIIIIIllllIlIIII(llllllllllllIllllIllIIIlIIIllIIl, this.contents.length)) {
            final NBTTagCompound llllllllllllIllllIllIIIlIIIllIII = new NBTTagCompound();
            if (lIIIIIllllIlIIIl(this.contents[llllllllllllIllllIllIIIlIIIllIIl])) {
                this.contents[llllllllllllIllllIllIIIlIIIllIIl].writeToNBT(llllllllllllIllllIllIIIlIIIllIII);
                "".length();
            }
            llllllllllllIllllIllIIIlIIIllIlI.appendTag(llllllllllllIllllIllIIIlIIIllIII);
            ++llllllllllllIllllIllIIIlIIIllIIl;
        }
        llllllllllllIllllIllIIIlIIIlIllI.setTag(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[2]], llllllllllllIllllIllIIIlIIIllIlI);
        if (lIIIIIllllIIlIll(this.getAlwaysRenderNameTag() ? 1 : 0) && (!lIIIIIllllIlIIIl(this.getCustomNameTag()) || lIIIIIllllIIllII(this.getCustomNameTag().length()))) {
            llllllllllllIllllIllIIIlIIIlIllI.setBoolean(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[1]], this.getAlwaysRenderNameTag());
        }
        llllllllllllIllllIllIIIlIIIlIllI.setBoolean(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[13]], this.isInvisible());
        llllllllllllIllllIllIIIlIIIlIllI.setBoolean(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[14]], this.isSmall());
        llllllllllllIllllIllIIIlIIIlIllI.setBoolean(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[12]], this.getShowArms());
        llllllllllllIllllIllIIIlIIIlIllI.setInteger(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[0]], this.disabledSlots);
        llllllllllllIllllIllIIIlIIIlIllI.setBoolean(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[15]], this.hasNoGravity());
        llllllllllllIllllIllIIIlIIIlIllI.setBoolean(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[16]], this.hasNoBasePlate());
        if (lIIIIIllllIIlIll(this.func_181026_s() ? 1 : 0)) {
            llllllllllllIllllIllIIIlIIIlIllI.setBoolean(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[17]], this.func_181026_s());
        }
        llllllllllllIllllIllIIIlIIIlIllI.setTag(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[18]], this.readPoseFromNBT());
    }
    
    private void dropBlock() {
        Block.spawnAsEntity(this.worldObj, new BlockPos(this), new ItemStack(Items.armor_stand));
        this.dropContents();
    }
    
    @Override
    protected void collideWithEntity(final Entity llllllllllllIllllIllIIIIlllIIlIl) {
    }
    
    private void damageArmorStand(final float llllllllllllIllllIllIIIIIlllIlll) {
        float llllllllllllIllllIllIIIIIlllIllI = this.getHealth();
        llllllllllllIllllIllIIIIIlllIllI -= llllllllllllIllllIllIIIIIlllIlll;
        if (lIIIIIllllIlIllI(lIIIIIlllllIIIIl(llllllllllllIllllIllIIIIIlllIllI, 0.5f))) {
            this.dropContents();
            this.setDead();
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        }
        else {
            this.setHealth(llllllllllllIllllIllIIIIIlllIllI);
        }
    }
    
    @Override
    public void setCurrentItemOrArmor(final int llllllllllllIllllIllIIIlIIllIIll, final ItemStack llllllllllllIllllIllIIIlIIllIIlI) {
        this.contents[llllllllllllIllllIllIIIlIIllIIll] = llllllllllllIllllIllIIIlIIllIIlI;
    }
    
    @Override
    public void moveEntityWithHeading(final float llllllllllllIllllIllIIIIIlIlllIl, final float llllllllllllIllllIllIIIIIlIllIIl) {
        if (lIIIIIllllIIllII(this.hasNoGravity() ? 1 : 0)) {
            super.moveEntityWithHeading(llllllllllllIllllIllIIIIIlIlllIl, llllllllllllIllllIllIIIIIlIllIIl);
        }
    }
    
    private void playParticles() {
        if (lIIIIIllllIIlIll((this.worldObj instanceof WorldServer) ? 1 : 0)) {
            final WorldServer worldServer = (WorldServer)this.worldObj;
            final EnumParticleTypes block_DUST = EnumParticleTypes.BLOCK_DUST;
            final double posX = this.posX;
            final double lllllllllllllIIIllllIlIIIlIIllll = this.posY + this.height / 1.5;
            final double posZ = this.posZ;
            final int lllllllllllllIIIllllIlIIIlIIIIIl = EntityArmorStand.lIllllIIIIlIll[3];
            final double lllllllllllllIIIllllIlIIIlIIllII = this.width / 4.0f;
            final double lllllllllllllIIIllllIlIIIIllllll = this.height / 4.0f;
            final double lllllllllllllIIIllllIlIIIlIIlIlI = this.width / 4.0f;
            final double lllllllllllllIIIllllIlIIIIllllIl = 0.05;
            final int[] lllllllllllllIIIllllIlIIIlIIIlIl = new int[EntityArmorStand.lIllllIIIIlIll[1]];
            lllllllllllllIIIllllIlIIIlIIIlIl[EntityArmorStand.lIllllIIIIlIll[2]] = Block.getStateId(Blocks.planks.getDefaultState());
            worldServer.spawnParticle(block_DUST, posX, lllllllllllllIIIllllIlIIIlIIllll, posZ, lllllllllllllIIIllllIlIIIlIIIIIl, lllllllllllllIIIllllIlIIIlIIllII, lllllllllllllIIIllllIlIIIIllllll, lllllllllllllIIIllllIlIIIlIIlIlI, lllllllllllllIIIllllIlIIIIllllIl, lllllllllllllIIIllllIlIIIlIIIlIl);
        }
    }
    
    @Override
    public float getEyeHeight() {
        float n;
        if (lIIIIIllllIIlIll(this.isChild() ? 1 : 0)) {
            n = this.height * 0.5f;
            "".length();
            if ("   ".length() == 0) {
                return 0.0f;
            }
        }
        else {
            n = this.height * 0.9f;
        }
        return n;
    }
    
    private void setNoGravity(final boolean llllllllllllIllllIllIIIIIIIIllll) {
        byte llllllllllllIllllIllIIIIIIIIlllI = this.dataWatcher.getWatchableObjectByte(EntityArmorStand.lIllllIIIIlIll[3]);
        if (lIIIIIllllIIlIll(llllllllllllIllllIllIIIIIIIIllll ? 1 : 0)) {
            llllllllllllIllllIllIIIIIIIIlllI |= (byte)EntityArmorStand.lIllllIIIIlIll[13];
            "".length();
            if (" ".length() <= 0) {
                return;
            }
        }
        else {
            llllllllllllIllllIllIIIIIIIIlllI &= (byte)EntityArmorStand.lIllllIIIIlIll[37];
        }
        this.dataWatcher.updateObject(EntityArmorStand.lIllllIIIIlIll[3], llllllllllllIllllIllIIIIIIIIlllI);
    }
    
    public void setRightArmRotation(final Rotations llllllllllllIllllIlIllllllIIlllI) {
        this.rightArmRotation = llllllllllllIllllIlIllllllIIlllI;
        this.dataWatcher.updateObject(EntityArmorStand.lIllllIIIIlIll[7], llllllllllllIllllIlIllllllIIlllI);
    }
    
    private static int lIIIIIlllllIIIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public boolean isChild() {
        return this.isSmall();
    }
    
    @Override
    public boolean replaceItemInInventory(final int llllllllllllIllllIllIIIlIIlIlIIl, final ItemStack llllllllllllIllllIllIIIlIIlIIIll) {
        int llllllllllllIllllIllIIIlIIlIIllI = 0;
        if (lIIIIIllllIIlllI(llllllllllllIllllIllIIIlIIlIlIIl, EntityArmorStand.lIllllIIIIlIll[10])) {
            final int llllllllllllIllllIllIIIlIIlIIlll = EntityArmorStand.lIllllIIIIlIll[2];
            "".length();
            if (null != null) {
                return ((0x5 ^ 0x0 ^ (0x7D ^ 0x3F)) & (0xA2 ^ 0xAC ^ (0xDD ^ 0x94) ^ -" ".length())) != 0x0;
            }
        }
        else {
            llllllllllllIllllIllIIIlIIlIIllI = llllllllllllIllllIllIIIlIIlIlIIl - EntityArmorStand.lIllllIIIIlIll[11] + EntityArmorStand.lIllllIIIIlIll[1];
            if (!lIIIIIllllIIllll(llllllllllllIllllIllIIIlIIlIIllI) || lIIIIIllllIlIIII(llllllllllllIllllIllIIIlIIlIIllI, this.contents.length)) {
                return EntityArmorStand.lIllllIIIIlIll[2] != 0;
            }
        }
        if (lIIIIIllllIlIIIl(llllllllllllIllllIllIIIlIIlIIIll) && lIIIIIllllIlIIlI(EntityLiving.getArmorPosition(llllllllllllIllllIllIIIlIIlIIIll), llllllllllllIllllIllIIIlIIlIIllI) && (!lIIIIIllllIIlllI(llllllllllllIllllIllIIIlIIlIIllI, EntityArmorStand.lIllllIIIIlIll[12]) || lIIIIIllllIIllII((llllllllllllIllllIllIIIlIIlIIIll.getItem() instanceof ItemBlock) ? 1 : 0))) {
            return EntityArmorStand.lIllllIIIIlIll[2] != 0;
        }
        this.setCurrentItemOrArmor(llllllllllllIllllIllIIIlIIlIIllI, llllllllllllIllllIllIIIlIIlIIIll);
        return EntityArmorStand.lIllllIIIIlIll[1] != 0;
    }
    
    private static boolean lIIIIIllllIIllII(final int llllllllllllIllllIlIllllIlIllIIl) {
        return llllllllllllIllllIlIllllIlIllIIl == 0;
    }
    
    private static boolean lIIIIIllllIIlIll(final int llllllllllllIllllIlIllllIlIllIll) {
        return llllllllllllIllllIlIllllIlIllIll != 0;
    }
    
    public boolean hasNoGravity() {
        if (lIIIIIllllIIlIll(this.dataWatcher.getWatchableObjectByte(EntityArmorStand.lIllllIIIIlIll[3]) & EntityArmorStand.lIllllIIIIlIll[13])) {
            return EntityArmorStand.lIllllIIIIlIll[1] != 0;
        }
        return EntityArmorStand.lIllllIIIIlIll[2] != 0;
    }
    
    public boolean isSmall() {
        if (lIIIIIllllIIlIll(this.dataWatcher.getWatchableObjectByte(EntityArmorStand.lIllllIIIIlIll[3]) & EntityArmorStand.lIllllIIIIlIll[1])) {
            return EntityArmorStand.lIllllIIIIlIll[1] != 0;
        }
        return EntityArmorStand.lIllllIIIIlIll[2] != 0;
    }
    
    public void setHeadRotation(final Rotations llllllllllllIllllIlIlllllllIIIII) {
        this.headRotation = llllllllllllIllllIlIlllllllIIIII;
        this.dataWatcher.updateObject(EntityArmorStand.lIllllIIIIlIll[4], llllllllllllIllllIlIlllllllIIIII);
    }
    
    @Override
    public boolean isInRangeToRenderDist(final double llllllllllllIllllIllIIIIlIIIIIll) {
        double llllllllllllIllllIllIIIIlIIIIIlI = this.getEntityBoundingBox().getAverageEdgeLength() * 4.0;
        if (!lIIIIIllllIIllII(Double.isNaN(llllllllllllIllllIllIIIIlIIIIIlI) ? 1 : 0) || lIIIIIllllIIllII(lIIIIIllllIlllll(llllllllllllIllllIllIIIIlIIIIIlI, 0.0))) {
            llllllllllllIllllIllIIIIlIIIIIlI = 4.0;
        }
        llllllllllllIllllIllIIIIlIIIIIlI *= 64.0;
        if (lIIIIIllllIllIlI(lIIIIIlllllIIIII(llllllllllllIllllIllIIIIlIIIIIll, llllllllllllIllllIllIIIIlIIIIIlI * llllllllllllIllllIllIIIIlIIIIIlI))) {
            return EntityArmorStand.lIllllIIIIlIll[1] != 0;
        }
        return EntityArmorStand.lIllllIIIIlIll[2] != 0;
    }
    
    public EntityArmorStand(final World llllllllllllIllllIllIIIlIllIIIIl) {
        super(llllllllllllIllllIllIIIlIllIIIIl);
        this.contents = new ItemStack[EntityArmorStand.lIllllIIIIlIll[0]];
        this.headRotation = EntityArmorStand.DEFAULT_HEAD_ROTATION;
        this.bodyRotation = EntityArmorStand.DEFAULT_BODY_ROTATION;
        this.leftArmRotation = EntityArmorStand.DEFAULT_LEFTARM_ROTATION;
        this.rightArmRotation = EntityArmorStand.DEFAULT_RIGHTARM_ROTATION;
        this.leftLegRotation = EntityArmorStand.DEFAULT_LEFTLEG_ROTATION;
        this.rightLegRotation = EntityArmorStand.DEFAULT_RIGHTLEG_ROTATION;
        this.setSilent((boolean)(EntityArmorStand.lIllllIIIIlIll[1] != 0));
        this.noClip = this.hasNoGravity();
        this.setSize(0.5f, 1.975f);
    }
    
    @Override
    public void setInvisible(final boolean llllllllllllIllllIllIIIIIIlIlIIl) {
        this.canInteract = llllllllllllIllllIllIIIIIIlIlIIl;
        super.setInvisible(llllllllllllIllllIllIIIIIIlIlIIl);
    }
    
    public boolean getShowArms() {
        if (lIIIIIllllIIlIll(this.dataWatcher.getWatchableObjectByte(EntityArmorStand.lIllllIIIIlIll[3]) & EntityArmorStand.lIllllIIIIlIll[12])) {
            return EntityArmorStand.lIllllIIIIlIll[1] != 0;
        }
        return EntityArmorStand.lIllllIIIIlIll[2] != 0;
    }
    
    private void func_175422_a(final EntityPlayer llllllllllllIllllIllIIIIlIIlllIl, final int llllllllllllIllllIllIIIIlIIlllII) {
        final ItemStack llllllllllllIllllIllIIIIlIlIIIll = this.contents[llllllllllllIllllIllIIIIlIIlllII];
        if ((!lIIIIIllllIlIIIl(llllllllllllIllllIllIIIIlIlIIIll) || lIIIIIllllIIllII(this.disabledSlots & EntityArmorStand.lIllllIIIIlIll[1] << llllllllllllIllllIllIIIIlIIlllII + EntityArmorStand.lIllllIIIIlIll[17])) && (!lIIIIIllllIllIll(llllllllllllIllllIllIIIIlIlIIIll) || lIIIIIllllIIllII(this.disabledSlots & EntityArmorStand.lIllllIIIIlIll[1] << llllllllllllIllllIllIIIIlIIlllII + EntityArmorStand.lIllllIIIIlIll[9]))) {
            final int llllllllllllIllllIllIIIIlIlIIIlI = llllllllllllIllllIllIIIIlIIlllIl.inventory.currentItem;
            final ItemStack llllllllllllIllllIllIIIIlIlIIIIl = llllllllllllIllllIllIIIIlIIlllIl.inventory.getStackInSlot(llllllllllllIllllIllIIIIlIlIIIlI);
            if (lIIIIIllllIIlIll(llllllllllllIllllIllIIIIlIIlllIl.capabilities.isCreativeMode ? 1 : 0) && (!lIIIIIllllIlIIIl(llllllllllllIllllIllIIIIlIlIIIll) || lIIIIIllllIlIlIl(llllllllllllIllllIllIIIIlIlIIIll.getItem(), Item.getItemFromBlock(Blocks.air))) && lIIIIIllllIlIIIl(llllllllllllIllllIllIIIIlIlIIIIl)) {
                final ItemStack llllllllllllIllllIllIIIIlIlIIIII = llllllllllllIllllIllIIIIlIlIIIIl.copy();
                llllllllllllIllllIllIIIIlIlIIIII.stackSize = EntityArmorStand.lIllllIIIIlIll[1];
                this.setCurrentItemOrArmor(llllllllllllIllllIllIIIIlIIlllII, llllllllllllIllllIllIIIIlIlIIIII);
                "".length();
                if ((0xD ^ 0x9) == 0x0) {
                    return;
                }
            }
            else if (lIIIIIllllIlIIIl(llllllllllllIllllIllIIIIlIlIIIIl) && lIIIIIllllIlllII(llllllllllllIllllIllIIIIlIlIIIIl.stackSize, EntityArmorStand.lIllllIIIIlIll[1])) {
                if (lIIIIIllllIllIll(llllllllllllIllllIllIIIIlIlIIIll)) {
                    final ItemStack llllllllllllIllllIllIIIIlIIlllll = llllllllllllIllllIllIIIIlIlIIIIl.copy();
                    llllllllllllIllllIllIIIIlIIlllll.stackSize = EntityArmorStand.lIllllIIIIlIll[1];
                    this.setCurrentItemOrArmor(llllllllllllIllllIllIIIIlIIlllII, llllllllllllIllllIllIIIIlIIlllll);
                    final ItemStack itemStack = llllllllllllIllllIllIIIIlIlIIIIl;
                    itemStack.stackSize -= EntityArmorStand.lIllllIIIIlIll[1];
                    "".length();
                    if ("  ".length() < 0) {
                        return;
                    }
                }
            }
            else {
                this.setCurrentItemOrArmor(llllllllllllIllllIllIIIIlIIlllII, llllllllllllIllllIllIIIIlIlIIIIl);
                llllllllllllIllllIllIIIIlIIlllIl.inventory.setInventorySlotContents(llllllllllllIllllIllIIIIlIlIIIlI, llllllllllllIllllIllIIIIlIlIIIll);
            }
        }
    }
    
    private static boolean lIIIIIllllIllIll(final Object llllllllllllIllllIlIllllIlIlllIl) {
        return llllllllllllIllllIlIllllIlIlllIl == null;
    }
    
    public void setLeftArmRotation(final Rotations llllllllllllIllllIlIllllllIlIlII) {
        this.leftArmRotation = llllllllllllIllllIlIllllllIlIlII;
        this.dataWatcher.updateObject(EntityArmorStand.lIllllIIIIlIll[6], llllllllllllIllllIlIllllllIlIlII);
    }
    
    private void func_181550_a(final boolean llllllllllllIllllIllIIIIIIllIlIl) {
        final double llllllllllllIllllIllIIIIIIlllIIl = this.posX;
        final double llllllllllllIllllIllIIIIIIlllIII = this.posY;
        final double llllllllllllIllllIllIIIIIIllIlll = this.posZ;
        if (lIIIIIllllIIlIll(llllllllllllIllllIllIIIIIIllIlIl ? 1 : 0)) {
            this.setSize(0.5f, 1.975f);
            "".length();
            if (((134 + 115 - 195 + 86 ^ 94 + 143 - 120 + 60) & (5 + 82 - 22 + 88 ^ 147 + 76 - 182 + 123 ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            this.setSize(0.0f, 0.0f);
        }
        this.setPosition(llllllllllllIllllIllIIIIIIlllIIl, llllllllllllIllllIllIIIIIIlllIII, llllllllllllIllllIllIIIIIIllIlll);
    }
    
    public void setLeftLegRotation(final Rotations llllllllllllIllllIlIllllllIIIllI) {
        this.leftLegRotation = llllllllllllIllllIlIllllllIIIllI;
        this.dataWatcher.updateObject(EntityArmorStand.lIllllIIIIlIll[8], llllllllllllIllllIlIllllllIIIllI);
    }
    
    private static int lIIIIIllllIlIlII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static int lIIIIIllllIllIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public boolean isServerWorld() {
        if (lIIIIIllllIIlIll(super.isServerWorld() ? 1 : 0) && lIIIIIllllIIllII(this.hasNoGravity() ? 1 : 0)) {
            return EntityArmorStand.lIllllIIIIlIll[1] != 0;
        }
        return EntityArmorStand.lIllllIIIIlIll[2] != 0;
    }
    
    @Override
    protected void collideWithNearbyEntities() {
        final List<Entity> llllllllllllIllllIllIIIIllIlllll = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.getEntityBoundingBox());
        if (lIIIIIllllIlIIIl(llllllllllllIllllIllIIIIllIlllll) && lIIIIIllllIIllII(llllllllllllIllllIllIIIIllIlllll.isEmpty() ? 1 : 0)) {
            int llllllllllllIllllIllIIIIllIllllI = EntityArmorStand.lIllllIIIIlIll[2];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIIIIllllIlIIII(llllllllllllIllllIllIIIIllIllllI, llllllllllllIllllIllIIIIllIlllll.size())) {
                final Entity llllllllllllIllllIllIIIIllIlllIl = llllllllllllIllllIllIIIIllIlllll.get(llllllllllllIllllIllIIIIllIllllI);
                if (lIIIIIllllIIlIll((llllllllllllIllllIllIIIIllIlllIl instanceof EntityMinecart) ? 1 : 0) && lIIIIIllllIlIlIl(((EntityMinecart)llllllllllllIllllIllIIIIllIlllIl).getMinecartType(), EntityMinecart.EnumMinecartType.RIDEABLE) && lIIIIIllllIlIllI(lIIIIIllllIlIlII(this.getDistanceSqToEntity(llllllllllllIllllIllIIIIllIlllIl), 0.2))) {
                    llllllllllllIllllIllIIIIllIlllIl.applyEntityCollision(this);
                }
                ++llllllllllllIllllIllIIIIllIllllI;
            }
        }
    }
    
    private static boolean lIIIIIlllllIIIlI(final int llllllllllllIllllIlIllllIllIlllI, final int llllllllllllIllllIlIllllIllIllIl) {
        return llllllllllllIllllIlIllllIllIlllI < llllllllllllIllllIlIllllIllIllIl;
    }
    
    private void setNoBasePlate(final boolean llllllllllllIllllIlIllllllllIlll) {
        byte llllllllllllIllllIlIllllllllIllI = this.dataWatcher.getWatchableObjectByte(EntityArmorStand.lIllllIIIIlIll[3]);
        if (lIIIIIllllIIlIll(llllllllllllIllllIlIllllllllIlll ? 1 : 0)) {
            llllllllllllIllllIlIllllllllIllI |= (byte)EntityArmorStand.lIllllIIIIlIll[17];
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
        else {
            llllllllllllIllllIlIllllllllIllI &= (byte)EntityArmorStand.lIllllIIIIlIll[39];
        }
        this.dataWatcher.updateObject(EntityArmorStand.lIllllIIIIlIll[3], llllllllllllIllllIlIllllllllIllI);
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(EntityArmorStand.lIllllIIIIlIll[3], (byte)EntityArmorStand.lIllllIIIIlIll[2]);
        this.dataWatcher.addObject(EntityArmorStand.lIllllIIIIlIll[4], EntityArmorStand.DEFAULT_HEAD_ROTATION);
        this.dataWatcher.addObject(EntityArmorStand.lIllllIIIIlIll[5], EntityArmorStand.DEFAULT_BODY_ROTATION);
        this.dataWatcher.addObject(EntityArmorStand.lIllllIIIIlIll[6], EntityArmorStand.DEFAULT_LEFTARM_ROTATION);
        this.dataWatcher.addObject(EntityArmorStand.lIllllIIIIlIll[7], EntityArmorStand.DEFAULT_RIGHTARM_ROTATION);
        this.dataWatcher.addObject(EntityArmorStand.lIllllIIIIlIll[8], EntityArmorStand.DEFAULT_LEFTLEG_ROTATION);
        this.dataWatcher.addObject(EntityArmorStand.lIllllIIIIlIll[9], EntityArmorStand.DEFAULT_RIGHTLEG_ROTATION);
    }
    
    @Override
    public boolean isImmuneToExplosions() {
        return this.isInvisible();
    }
    
    static {
        lIIIIIllllIIlIlI();
        lIIIIIlllIIIllII();
        DEFAULT_HEAD_ROTATION = new Rotations(0.0f, 0.0f, 0.0f);
        DEFAULT_BODY_ROTATION = new Rotations(0.0f, 0.0f, 0.0f);
        DEFAULT_LEFTARM_ROTATION = new Rotations(-10.0f, 0.0f, -10.0f);
        DEFAULT_RIGHTARM_ROTATION = new Rotations(-15.0f, 0.0f, 10.0f);
        DEFAULT_LEFTLEG_ROTATION = new Rotations(-1.0f, 0.0f, -1.0f);
        DEFAULT_RIGHTLEG_ROTATION = new Rotations(1.0f, 0.0f, 1.0f);
    }
    
    @Override
    public ItemStack getHeldItem() {
        return this.contents[EntityArmorStand.lIllllIIIIlIll[2]];
    }
    
    private NBTTagCompound readPoseFromNBT() {
        final NBTTagCompound llllllllllllIllllIllIIIIlllIlIlI = new NBTTagCompound();
        if (lIIIIIllllIIllII(EntityArmorStand.DEFAULT_HEAD_ROTATION.equals(this.headRotation) ? 1 : 0)) {
            llllllllllllIllllIllIIIIlllIlIlI.setTag(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[28]], this.headRotation.writeToNBT());
        }
        if (lIIIIIllllIIllII(EntityArmorStand.DEFAULT_BODY_ROTATION.equals(this.bodyRotation) ? 1 : 0)) {
            llllllllllllIllllIllIIIIlllIlIlI.setTag(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[29]], this.bodyRotation.writeToNBT());
        }
        if (lIIIIIllllIIllII(EntityArmorStand.DEFAULT_LEFTARM_ROTATION.equals(this.leftArmRotation) ? 1 : 0)) {
            llllllllllllIllllIllIIIIlllIlIlI.setTag(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[30]], this.leftArmRotation.writeToNBT());
        }
        if (lIIIIIllllIIllII(EntityArmorStand.DEFAULT_RIGHTARM_ROTATION.equals(this.rightArmRotation) ? 1 : 0)) {
            llllllllllllIllllIllIIIIlllIlIlI.setTag(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[31]], this.rightArmRotation.writeToNBT());
        }
        if (lIIIIIllllIIllII(EntityArmorStand.DEFAULT_LEFTLEG_ROTATION.equals(this.leftLegRotation) ? 1 : 0)) {
            llllllllllllIllllIllIIIIlllIlIlI.setTag(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[32]], this.leftLegRotation.writeToNBT());
        }
        if (lIIIIIllllIIllII(EntityArmorStand.DEFAULT_RIGHTLEG_ROTATION.equals(this.rightLegRotation) ? 1 : 0)) {
            llllllllllllIllllIllIIIIlllIlIlI.setTag(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[33]], this.rightLegRotation.writeToNBT());
        }
        return llllllllllllIllllIllIIIIlllIlIlI;
    }
    
    @Override
    public boolean interactAt(final EntityPlayer llllllllllllIllllIllIIIIlIlllIlI, final Vec3 llllllllllllIllllIllIIIIlIlllIIl) {
        if (lIIIIIllllIIlIll(this.func_181026_s() ? 1 : 0)) {
            return EntityArmorStand.lIllllIIIIlIll[2] != 0;
        }
        if (!lIIIIIllllIIllII(this.worldObj.isRemote ? 1 : 0) || !lIIIIIllllIIllII(llllllllllllIllllIllIIIIlIlllIlI.isSpectator() ? 1 : 0)) {
            return EntityArmorStand.lIllllIIIIlIll[1] != 0;
        }
        int llllllllllllIllllIllIIIIllIIIlll = EntityArmorStand.lIllllIIIIlIll[2];
        final ItemStack llllllllllllIllllIllIIIIllIIIllI = llllllllllllIllllIllIIIIlIlllIlI.getCurrentEquippedItem();
        int n;
        if (lIIIIIllllIlIIIl(llllllllllllIllllIllIIIIllIIIllI)) {
            n = EntityArmorStand.lIllllIIIIlIll[1];
            "".length();
            if ("   ".length() < ((0x8E ^ 0x99 ^ (0x3C ^ 0x72)) & (0x7C ^ 0x60 ^ (0x4A ^ 0xF) ^ -" ".length()))) {
                return ((0x18 ^ 0x58 ^ (0x31 ^ 0x49)) & (0xDB ^ 0x8E ^ (0x54 ^ 0x39) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EntityArmorStand.lIllllIIIIlIll[2];
        }
        final boolean llllllllllllIllllIllIIIIllIIIlIl = n != 0;
        if (lIIIIIllllIIlIll(llllllllllllIllllIllIIIIllIIIlIl ? 1 : 0) && lIIIIIllllIIlIll((llllllllllllIllllIllIIIIllIIIllI.getItem() instanceof ItemArmor) ? 1 : 0)) {
            final ItemArmor llllllllllllIllllIllIIIIllIIIlII = (ItemArmor)llllllllllllIllllIllIIIIllIIIllI.getItem();
            if (lIIIIIllllIIlllI(llllllllllllIllllIllIIIIllIIIlII.armorType, EntityArmorStand.lIllllIIIIlIll[14])) {
                llllllllllllIllllIllIIIIllIIIlll = EntityArmorStand.lIllllIIIIlIll[1];
                "".length();
                if ((0x97 ^ 0xA3 ^ (0x18 ^ 0x28)) <= "  ".length()) {
                    return ((0x3E ^ 0x2D ^ (0x59 ^ 0x11)) & (211 + 188 - 379 + 220 ^ 74 + 6 - 16 + 107 ^ -" ".length())) != 0x0;
                }
            }
            else if (lIIIIIllllIIlllI(llllllllllllIllllIllIIIIllIIIlII.armorType, EntityArmorStand.lIllllIIIIlIll[13])) {
                llllllllllllIllllIllIIIIllIIIlll = EntityArmorStand.lIllllIIIIlIll[13];
                "".length();
                if ("   ".length() < " ".length()) {
                    return ((0x95 ^ 0xA7 ^ (0x6D ^ 0x5A)) & (0x7F ^ 0x39 ^ (0x7 ^ 0x44) ^ -" ".length())) != 0x0;
                }
            }
            else if (lIIIIIllllIIlllI(llllllllllllIllllIllIIIIllIIIlII.armorType, EntityArmorStand.lIllllIIIIlIll[1])) {
                llllllllllllIllllIllIIIIllIIIlll = EntityArmorStand.lIllllIIIIlIll[14];
                "".length();
                if ("  ".length() < -" ".length()) {
                    return ((132 + 63 - 169 + 136 ^ 77 + 156 - 153 + 88) & (0x3 ^ 0x21 ^ (0x2 ^ 0x2A) ^ -" ".length())) != 0x0;
                }
            }
            else if (lIIIIIllllIIllII(llllllllllllIllllIllIIIIllIIIlII.armorType)) {
                llllllllllllIllllIllIIIIllIIIlll = EntityArmorStand.lIllllIIIIlIll[12];
            }
        }
        if (lIIIIIllllIIlIll(llllllllllllIllllIllIIIIllIIIlIl ? 1 : 0) && (!lIIIIIllllIllIIl(llllllllllllIllllIllIIIIllIIIllI.getItem(), Items.skull) || lIIIIIllllIlIlIl(llllllllllllIllllIllIIIIllIIIllI.getItem(), Item.getItemFromBlock(Blocks.pumpkin)))) {
            llllllllllllIllllIllIIIIllIIIlll = EntityArmorStand.lIllllIIIIlIll[12];
        }
        final double llllllllllllIllllIllIIIIllIIIIll = 0.1;
        final double llllllllllllIllllIllIIIIllIIIIlI = 0.9;
        final double llllllllllllIllllIllIIIIllIIIIIl = 0.4;
        final double llllllllllllIllllIllIIIIllIIIIII = 1.6;
        int llllllllllllIllllIllIIIIlIllllll = EntityArmorStand.lIllllIIIIlIll[2];
        final boolean llllllllllllIllllIllIIIIlIlllllI = this.isSmall();
        double yCoord;
        if (lIIIIIllllIIlIll(llllllllllllIllllIllIIIIlIlllllI ? 1 : 0)) {
            yCoord = llllllllllllIllllIllIIIIlIlllIIl.yCoord * 2.0;
            "".length();
            if (-" ".length() > 0) {
                return ((0x94 ^ 0xB2) & ~(0xB6 ^ 0x90)) != 0x0;
            }
        }
        else {
            yCoord = llllllllllllIllllIllIIIIlIlllIIl.yCoord;
        }
        final double llllllllllllIllllIllIIIIlIllllIl = yCoord;
        Label_1235: {
            if (lIIIIIllllIIllll(lIIIIIllllIlIlll(llllllllllllIllllIllIIIIlIllllIl, 0.1))) {
                final double n2 = llllllllllllIllllIllIIIIlIllllIl;
                final double n3 = 0.1;
                double n4;
                if (lIIIIIllllIIlIll(llllllllllllIllllIllIIIIlIlllllI ? 1 : 0)) {
                    n4 = 0.8;
                    "".length();
                    if (null != null) {
                        return ("  ".length() & ("  ".length() ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    n4 = 0.45;
                }
                if (lIIIIIllllIllIlI(lIIIIIllllIllIII(n2, n3 + n4)) && lIIIIIllllIlIIIl(this.contents[EntityArmorStand.lIllllIIIIlIll[1]])) {
                    llllllllllllIllllIllIIIIlIllllll = EntityArmorStand.lIllllIIIIlIll[1];
                    "".length();
                    if (null != null) {
                        return ((0xD0 ^ 0x89) & ~(0xF7 ^ 0xAE)) != 0x0;
                    }
                    break Label_1235;
                }
            }
            final double n5 = llllllllllllIllllIllIIIIlIllllIl;
            final double n6 = 0.9;
            double n7;
            if (lIIIIIllllIIlIll(llllllllllllIllllIllIIIIlIlllllI ? 1 : 0)) {
                n7 = 0.3;
                "".length();
                if ("   ".length() < -" ".length()) {
                    return ((0x2C ^ 0x24 ^ (0x89 ^ 0xC1)) & (63 + 2 - 18 + 156 ^ 94 + 0 - 86 + 131 ^ -" ".length())) != 0x0;
                }
            }
            else {
                n7 = 0.0;
            }
            if (lIIIIIllllIIllll(lIIIIIllllIlIlll(n5, n6 + n7))) {
                final double n8 = llllllllllllIllllIllIIIIlIllllIl;
                final double n9 = 0.9;
                double n10;
                if (lIIIIIllllIIlIll(llllllllllllIllllIllIIIIlIlllllI ? 1 : 0)) {
                    n10 = 1.0;
                    "".length();
                    if (((0xE3 ^ 0xBA ^ (0x50 ^ 0x30)) & (0x7B ^ 0x48 ^ (0x15 ^ 0x1F) ^ -" ".length())) != ((0x5 ^ 0x46 ^ (0x8E ^ 0x85)) & (68 + 80 - 89 + 165 ^ 89 + 104 - 110 + 85 ^ -" ".length()))) {
                        return ((71 + 56 - 44 + 74 ^ 26 + 101 + 1 + 21) & (0x6F ^ 0x77 ^ (0x2F ^ 0x3F) ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    n10 = 0.7;
                }
                if (lIIIIIllllIllIlI(lIIIIIllllIllIII(n8, n9 + n10)) && lIIIIIllllIlIIIl(this.contents[EntityArmorStand.lIllllIIIIlIll[14]])) {
                    llllllllllllIllllIllIIIIlIllllll = EntityArmorStand.lIllllIIIIlIll[14];
                    "".length();
                    if ((0x9A ^ 0xA5 ^ (0x6E ^ 0x55)) <= 0) {
                        return ((0xE2 ^ 0xC1 ^ (0xF5 ^ 0xC5)) & (0xD ^ 0x4A ^ (0x32 ^ 0x66) ^ -" ".length())) != 0x0;
                    }
                    break Label_1235;
                }
            }
            if (lIIIIIllllIIllll(lIIIIIllllIlIlll(llllllllllllIllllIllIIIIlIllllIl, 0.4))) {
                final double n11 = llllllllllllIllllIllIIIIlIllllIl;
                final double n12 = 0.4;
                double n13;
                if (lIIIIIllllIIlIll(llllllllllllIllllIllIIIIlIlllllI ? 1 : 0)) {
                    n13 = 1.0;
                    "".length();
                    if ((0x9A ^ 0x9E) <= "  ".length()) {
                        return ((0x5C ^ 0x6C) & ~(0x91 ^ 0xA1)) != 0x0;
                    }
                }
                else {
                    n13 = 0.8;
                }
                if (lIIIIIllllIllIlI(lIIIIIllllIllIII(n11, n12 + n13)) && lIIIIIllllIlIIIl(this.contents[EntityArmorStand.lIllllIIIIlIll[13]])) {
                    llllllllllllIllllIllIIIIlIllllll = EntityArmorStand.lIllllIIIIlIll[13];
                    "".length();
                    if (((0xAA ^ 0x86) & ~(0x5C ^ 0x70)) > "  ".length()) {
                        return ((0x5B ^ 0x51) & ~(0x2F ^ 0x25)) != 0x0;
                    }
                    break Label_1235;
                }
            }
            if (lIIIIIllllIIllll(lIIIIIllllIlIlll(llllllllllllIllllIllIIIIlIllllIl, 1.6)) && lIIIIIllllIlIIIl(this.contents[EntityArmorStand.lIllllIIIIlIll[12]])) {
                llllllllllllIllllIllIIIIlIllllll = EntityArmorStand.lIllllIIIIlIll[12];
            }
        }
        int n14;
        if (lIIIIIllllIlIIIl(this.contents[llllllllllllIllllIllIIIIlIllllll])) {
            n14 = EntityArmorStand.lIllllIIIIlIll[1];
            "".length();
            if (" ".length() >= "   ".length()) {
                return ((68 + 201 - 23 + 7 ^ 87 + 82 - 20 + 22) & (0x1A ^ 0x4 ^ (0xD9 ^ 0x91) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n14 = EntityArmorStand.lIllllIIIIlIll[2];
        }
        final boolean llllllllllllIllllIllIIIIlIllllII = n14 != 0;
        if (!lIIIIIllllIIllII(this.disabledSlots & EntityArmorStand.lIllllIIIIlIll[1] << llllllllllllIllllIllIIIIlIllllll) || lIIIIIllllIIlIll(this.disabledSlots & EntityArmorStand.lIllllIIIIlIll[1] << llllllllllllIllllIllIIIIllIIIlll)) {
            llllllllllllIllllIllIIIIlIllllll = llllllllllllIllllIllIIIIllIIIlll;
            if (lIIIIIllllIIlIll(this.disabledSlots & EntityArmorStand.lIllllIIIIlIll[1] << llllllllllllIllllIllIIIIllIIIlll)) {
                if (lIIIIIllllIIlIll(this.disabledSlots & EntityArmorStand.lIllllIIIIlIll[1])) {
                    return EntityArmorStand.lIllllIIIIlIll[1] != 0;
                }
                llllllllllllIllllIllIIIIlIllllll = EntityArmorStand.lIllllIIIIlIll[2];
            }
        }
        if (lIIIIIllllIIlIll(llllllllllllIllllIllIIIIllIIIlIl ? 1 : 0) && lIIIIIllllIIllII(llllllllllllIllllIllIIIIllIIIlll) && lIIIIIllllIIllII(this.getShowArms() ? 1 : 0)) {
            return EntityArmorStand.lIllllIIIIlIll[1] != 0;
        }
        if (lIIIIIllllIIlIll(llllllllllllIllllIllIIIIllIIIlIl ? 1 : 0)) {
            this.func_175422_a(llllllllllllIllllIllIIIIlIlllIlI, llllllllllllIllllIllIIIIllIIIlll);
            "".length();
            if ("  ".length() != "  ".length()) {
                return ((0x12 ^ 0x4A ^ (0xF1 ^ 0xA5)) & (((0x56 ^ 0x8) & ~(0xEF ^ 0xB1)) ^ (0x17 ^ 0x1B) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIIIIIllllIIlIll(llllllllllllIllllIllIIIIlIllllII ? 1 : 0)) {
            this.func_175422_a(llllllllllllIllllIllIIIIlIlllIlI, llllllllllllIllllIllIIIIlIllllll);
        }
        return EntityArmorStand.lIllllIIIIlIll[1] != 0;
    }
    
    private static int lIIIIIllllIlllIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private void func_181027_m(final boolean llllllllllllIllllIlIlllllllIlIII) {
        byte llllllllllllIllllIlIlllllllIlIlI = this.dataWatcher.getWatchableObjectByte(EntityArmorStand.lIllllIIIIlIll[3]);
        if (lIIIIIllllIIlIll(llllllllllllIllllIlIlllllllIlIII ? 1 : 0)) {
            llllllllllllIllllIlIlllllllIlIlI |= (byte)EntityArmorStand.lIllllIIIIlIll[9];
            "".length();
            if (" ".length() < 0) {
                return;
            }
        }
        else {
            llllllllllllIllllIlIlllllllIlIlI &= (byte)EntityArmorStand.lIllllIIIIlIll[40];
        }
        this.dataWatcher.updateObject(EntityArmorStand.lIllllIIIIlIll[3], llllllllllllIllllIlIlllllllIlIlI);
    }
    
    @Override
    public void onKillCommand() {
        this.setDead();
    }
    
    public Rotations getLeftArmRotation() {
        return this.leftArmRotation;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource llllllllllllIllllIllIIIIlIIlIIIl, final float llllllllllllIllllIllIIIIlIIlIIII) {
        if (lIIIIIllllIIlIll(this.worldObj.isRemote ? 1 : 0)) {
            return EntityArmorStand.lIllllIIIIlIll[2] != 0;
        }
        if (lIIIIIllllIIlIll(DamageSource.outOfWorld.equals(llllllllllllIllllIllIIIIlIIlIIIl) ? 1 : 0)) {
            this.setDead();
            return EntityArmorStand.lIllllIIIIlIll[2] != 0;
        }
        if (!lIIIIIllllIIllII(this.isEntityInvulnerable(llllllllllllIllllIllIIIIlIIlIIIl) ? 1 : 0) || !lIIIIIllllIIllII(this.canInteract ? 1 : 0) || !lIIIIIllllIIllII(this.func_181026_s() ? 1 : 0)) {
            return EntityArmorStand.lIllllIIIIlIll[2] != 0;
        }
        if (lIIIIIllllIIlIll(llllllllllllIllllIllIIIIlIIlIIIl.isExplosion() ? 1 : 0)) {
            this.dropContents();
            this.setDead();
            return EntityArmorStand.lIllllIIIIlIll[2] != 0;
        }
        if (lIIIIIllllIIlIll(DamageSource.inFire.equals(llllllllllllIllllIllIIIIlIIlIIIl) ? 1 : 0)) {
            if (lIIIIIllllIIllII(this.isBurning() ? 1 : 0)) {
                this.setFire(EntityArmorStand.lIllllIIIIlIll[0]);
                "".length();
                if (" ".length() == 0) {
                    return ((0x33 ^ 0x1E ^ (0x6C ^ 0x64)) & (2 + 71 - 42 + 131 ^ 73 + 15 + 18 + 29 ^ -" ".length())) != 0x0;
                }
            }
            else {
                this.damageArmorStand(0.15f);
            }
            return EntityArmorStand.lIllllIIIIlIll[2] != 0;
        }
        if (lIIIIIllllIIlIll(DamageSource.onFire.equals(llllllllllllIllllIllIIIIlIIlIIIl) ? 1 : 0) && lIIIIIllllIlIIll(lIIIIIllllIlllIl(this.getHealth(), 0.5f))) {
            this.damageArmorStand(4.0f);
            return EntityArmorStand.lIllllIIIIlIll[2] != 0;
        }
        final boolean llllllllllllIllllIllIIIIlIIIllll = EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[34]].equals(llllllllllllIllllIllIIIIlIIlIIIl.getDamageType());
        final boolean llllllllllllIllllIllIIIIlIIIlllI = EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[35]].equals(llllllllllllIllllIllIIIIlIIlIIIl.getDamageType());
        if (lIIIIIllllIIllII(llllllllllllIllllIllIIIIlIIIlllI ? 1 : 0) && lIIIIIllllIIllII(llllllllllllIllllIllIIIIlIIIllll ? 1 : 0)) {
            return EntityArmorStand.lIllllIIIIlIll[2] != 0;
        }
        if (lIIIIIllllIIlIll((llllllllllllIllllIllIIIIlIIlIIIl.getSourceOfDamage() instanceof EntityArrow) ? 1 : 0)) {
            llllllllllllIllllIllIIIIlIIlIIIl.getSourceOfDamage().setDead();
        }
        if (lIIIIIllllIIlIll((llllllllllllIllllIllIIIIlIIlIIIl.getEntity() instanceof EntityPlayer) ? 1 : 0) && lIIIIIllllIIllII(((EntityPlayer)llllllllllllIllllIllIIIIlIIlIIIl.getEntity()).capabilities.allowEdit ? 1 : 0)) {
            return EntityArmorStand.lIllllIIIIlIll[2] != 0;
        }
        if (lIIIIIllllIIlIll(llllllllllllIllllIllIIIIlIIlIIIl.isCreativePlayer() ? 1 : 0)) {
            this.playParticles();
            this.setDead();
            return EntityArmorStand.lIllllIIIIlIll[2] != 0;
        }
        final long llllllllllllIllllIllIIIIlIIIllIl = this.worldObj.getTotalWorldTime();
        if (lIIIIIllllIlIIll(lIIIIIllllIllllI(llllllllllllIllllIllIIIIlIIIllIl - this.punchCooldown, 5L)) && lIIIIIllllIIllII(llllllllllllIllllIllIIIIlIIIllll ? 1 : 0)) {
            this.punchCooldown = llllllllllllIllllIllIIIIlIIIllIl;
            "".length();
            if (((0x83 ^ 0xA7) & ~(0xB2 ^ 0x96)) != 0x0) {
                return ((0x43 ^ 0x52) & ~(0x57 ^ 0x46)) != 0x0;
            }
        }
        else {
            this.dropBlock();
            this.playParticles();
            this.setDead();
        }
        return EntityArmorStand.lIllllIIIIlIll[2] != 0;
    }
    
    private static boolean lIIIIIllllIlIlIl(final Object llllllllllllIllllIlIllllIllIIIII, final Object llllllllllllIllllIlIllllIlIlllll) {
        return llllllllllllIllllIlIllllIllIIIII == llllllllllllIllllIlIllllIlIlllll;
    }
    
    @Override
    protected float func_110146_f(final float llllllllllllIllllIllIIIIIllIIlll, final float llllllllllllIllllIllIIIIIllIIllI) {
        this.prevRenderYawOffset = this.prevRotationYaw;
        this.renderYawOffset = this.rotationYaw;
        return 0.0f;
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound llllllllllllIllllIllIIIlIIIIlIII) {
        super.readEntityFromNBT(llllllllllllIllllIllIIIlIIIIlIII);
        if (lIIIIIllllIIlIll(llllllllllllIllllIllIIIlIIIIlIII.hasKey(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[3]], EntityArmorStand.lIllllIIIIlIll[18]) ? 1 : 0)) {
            final NBTTagList llllllllllllIllllIllIIIlIIIIllII = llllllllllllIllllIllIIIlIIIIlIII.getTagList(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[4]], EntityArmorStand.lIllllIIIIlIll[3]);
            int llllllllllllIllllIllIIIlIIIIlIll = EntityArmorStand.lIllllIIIIlIll[2];
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
            while (!lIIIIIllllIlIIII(llllllllllllIllllIllIIIlIIIIlIll, this.contents.length)) {
                this.contents[llllllllllllIllllIllIIIlIIIIlIll] = ItemStack.loadItemStackFromNBT(llllllllllllIllllIllIIIlIIIIllII.getCompoundTagAt(llllllllllllIllllIllIIIlIIIIlIll));
                ++llllllllllllIllllIllIIIlIIIIlIll;
            }
        }
        this.setInvisible(llllllllllllIllllIllIIIlIIIIlIII.getBoolean(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[5]]));
        this.setSmall(llllllllllllIllllIllIIIlIIIIlIII.getBoolean(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[6]]));
        this.setShowArms(llllllllllllIllllIllIIIlIIIIlIII.getBoolean(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[7]]));
        this.disabledSlots = llllllllllllIllllIllIIIlIIIIlIII.getInteger(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[8]]);
        this.setNoGravity(llllllllllllIllllIllIIIlIIIIlIII.getBoolean(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[9]]));
        this.setNoBasePlate(llllllllllllIllllIllIIIlIIIIlIII.getBoolean(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[19]]));
        this.func_181027_m(llllllllllllIllllIllIIIlIIIIlIII.getBoolean(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[20]]));
        int field_181028_bj;
        if (lIIIIIllllIIlIll(this.func_181026_s() ? 1 : 0)) {
            field_181028_bj = EntityArmorStand.lIllllIIIIlIll[2];
            "".length();
            if (" ".length() != " ".length()) {
                return;
            }
        }
        else {
            field_181028_bj = EntityArmorStand.lIllllIIIIlIll[1];
        }
        this.field_181028_bj = (field_181028_bj != 0);
        this.noClip = this.hasNoGravity();
        final NBTTagCompound llllllllllllIllllIllIIIlIIIIlIlI = llllllllllllIllllIllIIIlIIIIlIII.getCompoundTag(EntityArmorStand.lIlllIlllIlIII[EntityArmorStand.lIllllIIIIlIll[21]]);
        this.writePoseToNBT(llllllllllllIllllIllIIIlIIIIlIlI);
    }
    
    public EntityArmorStand(final World llllllllllllIllllIllIIIlIlIlIIll, final double llllllllllllIllllIllIIIlIlIlIIlI, final double llllllllllllIllllIllIIIlIlIlIIIl, final double llllllllllllIllllIllIIIlIlIlIlIl) {
        this(llllllllllllIllllIllIIIlIlIlIIll);
        this.setPosition(llllllllllllIllllIllIIIlIlIlIIlI, llllllllllllIllllIllIIIlIlIlIIIl, llllllllllllIllllIllIIIlIlIlIlIl);
    }
    
    private static boolean lIIIIIllllIlIIII(final int llllllllllllIllllIlIllllIlllIIlI, final int llllllllllllIllllIlIllllIlllIIIl) {
        return llllllllllllIllllIlIllllIlllIIlI >= llllllllllllIllllIlIllllIlllIIIl;
    }
    
    public Rotations getLeftLegRotation() {
        return this.leftLegRotation;
    }
    
    public Rotations getHeadRotation() {
        return this.headRotation;
    }
    
    private void setSmall(final boolean llllllllllllIllllIllIIIIIIIllIll) {
        byte llllllllllllIllllIllIIIIIIIllIlI = this.dataWatcher.getWatchableObjectByte(EntityArmorStand.lIllllIIIIlIll[3]);
        if (lIIIIIllllIIlIll(llllllllllllIllllIllIIIIIIIllIll ? 1 : 0)) {
            llllllllllllIllllIllIIIIIIIllIlI |= (byte)EntityArmorStand.lIllllIIIIlIll[1];
            "".length();
            if (-(0xC1 ^ 0xC4) >= 0) {
                return;
            }
        }
        else {
            llllllllllllIllllIllIIIIIIIllIlI &= (byte)EntityArmorStand.lIllllIIIIlIll[36];
        }
        this.dataWatcher.updateObject(EntityArmorStand.lIllllIIIIlIll[3], llllllllllllIllllIllIIIIIIIllIlI);
    }
    
    private static String lIIIIIllIlllllII(String llllllllllllIllllIlIlllllIIIIIIl, final String llllllllllllIllllIlIlllllIIIIlIl) {
        llllllllllllIllllIlIlllllIIIIIIl = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIlIlllllIIIIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIlIlllllIIIIlII = new StringBuilder();
        final char[] llllllllllllIllllIlIlllllIIIIIll = llllllllllllIllllIlIlllllIIIIlIl.toCharArray();
        int llllllllllllIllllIlIlllllIIIIIlI = EntityArmorStand.lIllllIIIIlIll[2];
        final String llllllllllllIllllIlIllllIlllllII = (Object)((String)llllllllllllIllllIlIlllllIIIIIIl).toCharArray();
        final String llllllllllllIllllIlIllllIllllIll = (String)llllllllllllIllllIlIllllIlllllII.length;
        Exception llllllllllllIllllIlIllllIllllIlI = (Exception)EntityArmorStand.lIllllIIIIlIll[2];
        while (lIIIIIlllllIIIlI((int)llllllllllllIllllIlIllllIllllIlI, (int)llllllllllllIllllIlIllllIllllIll)) {
            final char llllllllllllIllllIlIlllllIIIIlll = llllllllllllIllllIlIllllIlllllII[llllllllllllIllllIlIllllIllllIlI];
            llllllllllllIllllIlIlllllIIIIlII.append((char)(llllllllllllIllllIlIlllllIIIIlll ^ llllllllllllIllllIlIlllllIIIIIll[llllllllllllIllllIlIlllllIIIIIlI % llllllllllllIllllIlIlllllIIIIIll.length]));
            "".length();
            ++llllllllllllIllllIlIlllllIIIIIlI;
            ++llllllllllllIllllIlIllllIllllIlI;
            "".length();
            if (((0x1C ^ 0xD) & ~(0x75 ^ 0x64)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIlIlllllIIIIlII);
    }
    
    private static void lIIIIIllllIIlIlI() {
        (lIllllIIIIlIll = new int[42])[0] = (0x4 ^ 0x28 ^ (0x12 ^ 0x3B));
        EntityArmorStand.lIllllIIIIlIll[1] = " ".length();
        EntityArmorStand.lIllllIIIIlIll[2] = ((0x17 ^ 0x50) & ~(0x5E ^ 0x19));
        EntityArmorStand.lIllllIIIIlIll[3] = (0x93 ^ 0x99);
        EntityArmorStand.lIllllIIIIlIll[4] = (0x79 ^ 0x72);
        EntityArmorStand.lIllllIIIIlIll[5] = (115 + 180 - 113 + 1 ^ 137 + 159 - 127 + 18);
        EntityArmorStand.lIllllIIIIlIll[6] = (0xEF ^ 0x95 ^ (0xFA ^ 0x8D));
        EntityArmorStand.lIllllIIIIlIll[7] = (0x6C ^ 0x62);
        EntityArmorStand.lIllllIIIIlIll[8] = (0x3C ^ 0x33);
        EntityArmorStand.lIllllIIIIlIll[9] = (0x81 ^ 0x91);
        EntityArmorStand.lIllllIIIIlIll[10] = (0xA ^ 0x69);
        EntityArmorStand.lIllllIIIIlIll[11] = (0x69 ^ 0xD);
        EntityArmorStand.lIllllIIIIlIll[12] = (0x6A ^ 0x6E);
        EntityArmorStand.lIllllIIIIlIll[13] = "  ".length();
        EntityArmorStand.lIllllIIIIlIll[14] = "   ".length();
        EntityArmorStand.lIllllIIIIlIll[15] = (0xA6 ^ 0xA0);
        EntityArmorStand.lIllllIIIIlIll[16] = (0xBE ^ 0xB9);
        EntityArmorStand.lIllllIIIIlIll[17] = (0x2E ^ 0x26);
        EntityArmorStand.lIllllIIIIlIll[18] = (0xF ^ 0x6);
        EntityArmorStand.lIllllIIIIlIll[19] = (0x8E ^ 0x9F ^ ((0x74 ^ 0x60) & ~(0xA2 ^ 0xB6)));
        EntityArmorStand.lIllllIIIIlIll[20] = (0x4C ^ 0x16 ^ (0x7E ^ 0x36));
        EntityArmorStand.lIllllIIIIlIll[21] = (0x63 ^ 0x70);
        EntityArmorStand.lIllllIIIIlIll[22] = (0x57 ^ 0x4A ^ (0xD ^ 0x4));
        EntityArmorStand.lIllllIIIIlIll[23] = (4 + 38 - 18 + 112 ^ 19 + 53 + 33 + 52);
        EntityArmorStand.lIllllIIIIlIll[24] = (0x8A ^ 0xC7 ^ (0xD ^ 0x56));
        EntityArmorStand.lIllllIIIIlIll[25] = (0x17 ^ 0x0);
        EntityArmorStand.lIllllIIIIlIll[26] = (0x31 ^ 0x73 ^ (0xC9 ^ 0x93));
        EntityArmorStand.lIllllIIIIlIll[27] = (35 + 13 + 9 + 79 ^ 1 + 114 - 112 + 142);
        EntityArmorStand.lIllllIIIIlIll[28] = (98 + 94 - 148 + 90 ^ 58 + 133 - 39 + 4);
        EntityArmorStand.lIllllIIIIlIll[29] = (0x3C ^ 0x27);
        EntityArmorStand.lIllllIIIIlIll[30] = (0x91 ^ 0x8D);
        EntityArmorStand.lIllllIIIIlIll[31] = (0x6B ^ 0x76);
        EntityArmorStand.lIllllIIIIlIll[32] = (0x9F ^ 0x81);
        EntityArmorStand.lIllllIIIIlIll[33] = (34 + 68 - 43 + 73 ^ 140 + 93 - 188 + 110);
        EntityArmorStand.lIllllIIIIlIll[34] = (0x5B ^ 0x7B);
        EntityArmorStand.lIllllIIIIlIll[35] = (0x49 ^ 0x68);
        EntityArmorStand.lIllllIIIIlIll[36] = -"  ".length();
        EntityArmorStand.lIllllIIIIlIll[37] = -"   ".length();
        EntityArmorStand.lIllllIIIIlIll[38] = -(22 + 79 + 26 + 5 ^ 55 + 102 - 103 + 75);
        EntityArmorStand.lIllllIIIIlIll[39] = -(0xD9 ^ 0x98 ^ (0x24 ^ 0x6C));
        EntityArmorStand.lIllllIIIIlIll[40] = -(0x93 ^ 0x82);
        EntityArmorStand.lIllllIIIIlIll[41] = (0x9E ^ 0xBC);
    }
    
    private static boolean lIIIIIllllIllIlI(final int llllllllllllIllllIlIllllIlIlIlIl) {
        return llllllllllllIllllIlIllllIlIlIlIl < 0;
    }
    
    @Override
    public ItemStack getCurrentArmor(final int llllllllllllIllllIllIIIlIIllllIl) {
        return this.contents[llllllllllllIllllIllIIIlIIllllIl + EntityArmorStand.lIllllIIIIlIll[1]];
    }
    
    private static boolean lIIIIIllllIIlllI(final int llllllllllllIllllIlIllllIlllIllI, final int llllllllllllIllllIlIllllIlllIlIl) {
        return llllllllllllIllllIlIllllIlllIllI == llllllllllllIllllIlIllllIlllIlIl;
    }
    
    private static boolean lIIIIIllllIlIllI(final int llllllllllllIllllIlIllllIlIlIIll) {
        return llllllllllllIllllIlIllllIlIlIIll <= 0;
    }
    
    private static boolean lIIIIIllllIIllll(final int llllllllllllIllllIlIllllIlIlIlll) {
        return llllllllllllIllllIlIllllIlIlIlll >= 0;
    }
    
    @Override
    public ItemStack[] getInventory() {
        return this.contents;
    }
    
    public boolean func_181026_s() {
        if (lIIIIIllllIIlIll(this.dataWatcher.getWatchableObjectByte(EntityArmorStand.lIllllIIIIlIll[3]) & EntityArmorStand.lIllllIIIIlIll[9])) {
            return EntityArmorStand.lIllllIIIIlIll[1] != 0;
        }
        return EntityArmorStand.lIllllIIIIlIll[2] != 0;
    }
    
    @Override
    protected void updatePotionMetadata() {
        this.setInvisible(this.canInteract);
    }
    
    private static boolean lIIIIIllllIlIIlI(final int llllllllllllIllllIlIllllIlIIlllI, final int llllllllllllIllllIlIllllIlIIllIl) {
        return llllllllllllIllllIlIllllIlIIlllI != llllllllllllIllllIlIllllIlIIllIl;
    }
    
    private static String lIIIIIllIlllIIll(final String llllllllllllIllllIlIlllllIIlIllI, final String llllllllllllIllllIlIlllllIIlIIll) {
        try {
            final SecretKeySpec llllllllllllIllllIlIlllllIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIlllllIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIlIlllllIIllIII = Cipher.getInstance("Blowfish");
            llllllllllllIllllIlIlllllIIllIII.init(EntityArmorStand.lIllllIIIIlIll[13], llllllllllllIllllIlIlllllIIllIIl);
            return new String(llllllllllllIllllIlIlllllIIllIII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIlllllIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlIlllllIIlIlll) {
            llllllllllllIllllIlIlllllIIlIlll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        final Rotations llllllllllllIllllIllIIIIIlIIllll = this.dataWatcher.getWatchableObjectRotations(EntityArmorStand.lIllllIIIIlIll[4]);
        if (lIIIIIllllIIllII(this.headRotation.equals(llllllllllllIllllIllIIIIIlIIllll) ? 1 : 0)) {
            this.setHeadRotation(llllllllllllIllllIllIIIIIlIIllll);
        }
        final Rotations llllllllllllIllllIllIIIIIlIIlllI = this.dataWatcher.getWatchableObjectRotations(EntityArmorStand.lIllllIIIIlIll[5]);
        if (lIIIIIllllIIllII(this.bodyRotation.equals(llllllllllllIllllIllIIIIIlIIlllI) ? 1 : 0)) {
            this.setBodyRotation(llllllllllllIllllIllIIIIIlIIlllI);
        }
        final Rotations llllllllllllIllllIllIIIIIlIIllIl = this.dataWatcher.getWatchableObjectRotations(EntityArmorStand.lIllllIIIIlIll[6]);
        if (lIIIIIllllIIllII(this.leftArmRotation.equals(llllllllllllIllllIllIIIIIlIIllIl) ? 1 : 0)) {
            this.setLeftArmRotation(llllllllllllIllllIllIIIIIlIIllIl);
        }
        final Rotations llllllllllllIllllIllIIIIIlIIllII = this.dataWatcher.getWatchableObjectRotations(EntityArmorStand.lIllllIIIIlIll[7]);
        if (lIIIIIllllIIllII(this.rightArmRotation.equals(llllllllllllIllllIllIIIIIlIIllII) ? 1 : 0)) {
            this.setRightArmRotation(llllllllllllIllllIllIIIIIlIIllII);
        }
        final Rotations llllllllllllIllllIllIIIIIlIIlIll = this.dataWatcher.getWatchableObjectRotations(EntityArmorStand.lIllllIIIIlIll[8]);
        if (lIIIIIllllIIllII(this.leftLegRotation.equals(llllllllllllIllllIllIIIIIlIIlIll) ? 1 : 0)) {
            this.setLeftLegRotation(llllllllllllIllllIllIIIIIlIIlIll);
        }
        final Rotations llllllllllllIllllIllIIIIIlIIlIlI = this.dataWatcher.getWatchableObjectRotations(EntityArmorStand.lIllllIIIIlIll[9]);
        if (lIIIIIllllIIllII(this.rightLegRotation.equals(llllllllllllIllllIllIIIIIlIIlIlI) ? 1 : 0)) {
            this.setRightLegRotation(llllllllllllIllllIllIIIIIlIIlIlI);
        }
        final boolean llllllllllllIllllIllIIIIIlIIlIIl = this.func_181026_s();
        if (lIIIIIllllIIllII(this.field_181028_bj ? 1 : 0) && lIIIIIllllIIlIll(llllllllllllIllllIllIIIIIlIIlIIl ? 1 : 0)) {
            this.func_181550_a((boolean)(EntityArmorStand.lIllllIIIIlIll[2] != 0));
            "".length();
            if (((54 + 30 + 11 + 129 ^ 15 + 133 + 1 + 40) & (16 + 46 - 58 + 216 ^ 6 + 70 - 62 + 115 ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            if (!lIIIIIllllIIlIll(this.field_181028_bj ? 1 : 0) || lIIIIIllllIIlIll(llllllllllllIllllIllIIIIIlIIlIIl ? 1 : 0)) {
                return;
            }
            this.func_181550_a((boolean)(EntityArmorStand.lIllllIIIIlIll[1] != 0));
        }
        this.field_181028_bj = llllllllllllIllllIllIIIIIlIIlIIl;
    }
    
    public Rotations getRightLegRotation() {
        return this.rightLegRotation;
    }
    
    private static boolean lIIIIIllllIlllII(final int llllllllllllIllllIlIllllIllIlIlI, final int llllllllllllIllllIlIllllIllIlIIl) {
        return llllllllllllIllllIlIllllIllIlIlI > llllllllllllIllllIlIllllIllIlIIl;
    }
    
    private static int lIIIIIlllllIIIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static int lIIIIIllllIlllll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIIIIIllllIlIIll(final int llllllllllllIllllIlIllllIlIlIIIl) {
        return llllllllllllIllllIlIllllIlIlIIIl > 0;
    }
    
    private static boolean lIIIIIllllIllIIl(final Object llllllllllllIllllIlIllllIllIIllI, final Object llllllllllllIllllIlIllllIllIIlIl) {
        return llllllllllllIllllIlIllllIllIIllI != llllllllllllIllllIlIllllIllIIlIl;
    }
    
    public boolean hasNoBasePlate() {
        if (lIIIIIllllIIlIll(this.dataWatcher.getWatchableObjectByte(EntityArmorStand.lIllllIIIIlIll[3]) & EntityArmorStand.lIllllIIIIlIll[17])) {
            return EntityArmorStand.lIllllIIIIlIll[1] != 0;
        }
        return EntityArmorStand.lIllllIIIIlIll[2] != 0;
    }
    
    private void dropContents() {
        int llllllllllllIllllIllIIIIIllIllII = EntityArmorStand.lIllllIIIIlIll[2];
        "".length();
        if (((0x26 ^ 0x44 ^ (0xA8 ^ 0x9D)) & (0x2F ^ 0x7F ^ (0xAD ^ 0xAA) ^ -" ".length())) < 0) {
            return;
        }
        while (!lIIIIIllllIlIIII(llllllllllllIllllIllIIIIIllIllII, this.contents.length)) {
            if (lIIIIIllllIlIIIl(this.contents[llllllllllllIllllIllIIIIIllIllII]) && lIIIIIllllIlIIll(this.contents[llllllllllllIllllIllIIIIIllIllII].stackSize)) {
                if (lIIIIIllllIlIIIl(this.contents[llllllllllllIllllIllIIIIIllIllII])) {
                    Block.spawnAsEntity(this.worldObj, new BlockPos(this).up(), this.contents[llllllllllllIllllIllIIIIIllIllII]);
                }
                this.contents[llllllllllllIllllIllIIIIIllIllII] = null;
            }
            ++llllllllllllIllllIllIIIIIllIllII;
        }
    }
    
    @Override
    public ItemStack getEquipmentInSlot(final int llllllllllllIllllIllIIIlIlIIIIll) {
        return this.contents[llllllllllllIllllIllIIIlIlIIIIll];
    }
    
    private static int lIIIIIllllIllllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public Rotations getRightArmRotation() {
        return this.rightArmRotation;
    }
    
    private static int lIIIIIllllIlIlll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
}
