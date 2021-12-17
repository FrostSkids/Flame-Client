// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.entity;

import net.minecraft.network.play.client.C0DPacketCloseWindow;
import net.minecraft.network.play.client.C01PacketChatMessage;
import net.minecraft.client.gui.GuiRepair;
import net.minecraft.world.IWorldNameable;
import net.minecraft.client.gui.GuiEnchantment;
import net.minecraft.client.gui.inventory.GuiCrafting;
import net.minecraft.client.gui.inventory.GuiScreenHorseInventory;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.potion.Potion;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.util.ResourceLocation;
import net.minecraft.network.play.client.C13PacketPlayerAbilities;
import net.minecraft.network.play.client.C16PacketClientStatus;
import net.minecraft.stats.StatBase;
import net.minecraft.network.play.client.C0APacketAnimation;
import net.minecraft.world.World;
import net.minecraft.client.gui.inventory.GuiEditSign;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.client.gui.GuiMerchant;
import net.minecraft.entity.IMerchant;
import net.minecraft.client.gui.inventory.GuiDispenser;
import net.minecraft.client.gui.inventory.GuiBeacon;
import net.minecraft.client.gui.inventory.GuiBrewingStand;
import net.minecraft.client.gui.inventory.GuiFurnace;
import net.minecraft.client.gui.GuiHopper;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.world.IInteractionObject;
import net.minecraft.inventory.IInventory;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.MovingSoundMinecartRiding;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.IChatComponent;
import net.minecraft.network.play.client.C0BPacketEntityAction;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.gui.GuiScreenBook;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiCommandBlock;
import net.minecraft.command.server.CommandBlockLogic;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.EnumFacing;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.entity.Entity;
import net.minecraft.network.play.client.C0CPacketInput;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.util.BlockPos;
import client.event.impl.EventUpdate;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.stats.StatFileWriter;
import net.minecraft.client.Minecraft;
import net.minecraft.util.MovementInput;

public class EntityPlayerSP extends AbstractClientPlayer
{
    private static final /* synthetic */ int[] lIIIlIlIIIlIll;
    protected /* synthetic */ int sprintToggleTimer;
    public /* synthetic */ MovementInput movementInput;
    public /* synthetic */ float prevTimeInPortal;
    private /* synthetic */ boolean serverSprintState;
    private /* synthetic */ String clientBrand;
    protected /* synthetic */ Minecraft mc;
    private /* synthetic */ int horseJumpPowerCounter;
    private final /* synthetic */ StatFileWriter statWriter;
    private /* synthetic */ float lastReportedPitch;
    public /* synthetic */ float prevRenderArmYaw;
    public /* synthetic */ float renderArmPitch;
    public /* synthetic */ int sprintingTicksLeft;
    private /* synthetic */ double lastReportedPosX;
    public final /* synthetic */ NetHandlerPlayClient sendQueue;
    private /* synthetic */ boolean hasValidHealth;
    private /* synthetic */ float horseJumpPower;
    public /* synthetic */ float timeInPortal;
    private static final /* synthetic */ String[] lIIIlIlIIIlIlI;
    private /* synthetic */ int positionUpdateTicks;
    private /* synthetic */ float lastReportedYaw;
    public /* synthetic */ float prevRenderArmPitch;
    private /* synthetic */ boolean serverSneakState;
    private /* synthetic */ double lastReportedPosY;
    private /* synthetic */ double lastReportedPosZ;
    public /* synthetic */ float renderArmYaw;
    
    @Override
    public void onUpdate() {
        final EventUpdate lllllllllllllIlIIIlIIIIIlllllIll = new EventUpdate();
        lllllllllllllIlIIIlIIIIIlllllIll.call();
        "".length();
        if (llIIIIIIIllIlII(this.worldObj.isBlockLoaded(new BlockPos(this.posX, 0.0, this.posZ)) ? 1 : 0)) {
            super.onUpdate();
            if (llIIIIIIIllIlII(this.isRiding() ? 1 : 0)) {
                this.sendQueue.addToSendQueue(new C03PacketPlayer.C05PacketPlayerLook(this.rotationYaw, this.rotationPitch, this.onGround));
                this.sendQueue.addToSendQueue(new C0CPacketInput(this.moveStrafing, this.moveForward, this.movementInput.jump, this.movementInput.sneak));
                "".length();
                if ((0xB2 ^ 0xB6) != (0xAC ^ 0xA8)) {
                    return;
                }
            }
            else {
                this.onUpdateWalkingPlayer();
            }
        }
    }
    
    public void setXPStats(final float lllllllllllllIlIIIlIIIIIIlIlIlll, final int lllllllllllllIlIIIlIIIIIIlIlIIlI, final int lllllllllllllIlIIIlIIIIIIlIlIIIl) {
        this.experience = lllllllllllllIlIIIlIIIIIIlIlIlll;
        this.experienceTotal = lllllllllllllIlIIIlIIIIIIlIlIIlI;
        this.experienceLevel = lllllllllllllIlIIIlIIIIIIlIlIIIl;
    }
    
    @Override
    public void onCriticalHit(final Entity lllllllllllllIlIIIIlllllllllIlII) {
        this.mc.effectRenderer.emitParticleAtEntity(lllllllllllllIlIIIIlllllllllIlII, EnumParticleTypes.CRIT);
    }
    
    @Override
    public EntityItem dropOneItem(final boolean lllllllllllllIlIIIlIIIIIllIlIIll) {
        C07PacketPlayerDigging.Action action;
        if (llIIIIIIIllIlII(lllllllllllllIlIIIlIIIIIllIlIIll ? 1 : 0)) {
            action = C07PacketPlayerDigging.Action.DROP_ALL_ITEMS;
            "".length();
            if (-(0x3F ^ 0x3B) >= 0) {
                return null;
            }
        }
        else {
            action = C07PacketPlayerDigging.Action.DROP_ITEM;
        }
        final C07PacketPlayerDigging.Action lllllllllllllIlIIIlIIIIIllIlIlIl = action;
        this.sendQueue.addToSendQueue(new C07PacketPlayerDigging(lllllllllllllIlIIIlIIIIIllIlIlIl, BlockPos.ORIGIN, EnumFacing.DOWN));
        return null;
    }
    
    private static String llIIIIIIIllIIII(final String lllllllllllllIlIIIIllllllIlllIIl, final String lllllllllllllIlIIIIllllllIlllIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIllllllIlllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIllllllIlllIlI.getBytes(StandardCharsets.UTF_8)), EntityPlayerSP.lIIIlIlIIIlIll[12]), "DES");
            final Cipher lllllllllllllIlIIIIllllllIllllIl = Cipher.getInstance("DES");
            lllllllllllllIlIIIIllllllIllllIl.init(EntityPlayerSP.lIIIlIlIIIlIll[3], lllllllllllllIlIIIIllllllIlllllI);
            return new String(lllllllllllllIlIIIIllllllIllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIllllllIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIllllllIllllII) {
            lllllllllllllIlIIIIllllllIllllII.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected boolean pushOutOfBlocks(final double lllllllllllllIlIIIlIIIIIIllllIll, final double lllllllllllllIlIIIlIIIIIIlllIIII, final double lllllllllllllIlIIIlIIIIIIllIllll) {
        if (llIIIIIIIllIlII(this.noClip ? 1 : 0)) {
            return EntityPlayerSP.lIIIlIlIIIlIll[0] != 0;
        }
        final BlockPos lllllllllllllIlIIIlIIIIIIllllIII = new BlockPos(lllllllllllllIlIIIlIIIIIIllllIll, lllllllllllllIlIIIlIIIIIIlllIIII, lllllllllllllIlIIIlIIIIIIllIllll);
        final double lllllllllllllIlIIIlIIIIIIlllIlll = lllllllllllllIlIIIlIIIIIIllllIll - lllllllllllllIlIIIlIIIIIIllllIII.getX();
        final double lllllllllllllIlIIIlIIIIIIlllIllI = lllllllllllllIlIIIlIIIIIIllIllll - lllllllllllllIlIIIlIIIIIIllllIII.getZ();
        if (llIIIIIIIlllIIl(this.isOpenBlockSpace(lllllllllllllIlIIIlIIIIIIllllIII) ? 1 : 0)) {
            int lllllllllllllIlIIIlIIIIIIlllIlIl = EntityPlayerSP.lIIIlIlIIIlIll[5];
            double lllllllllllllIlIIIlIIIIIIlllIlII = 9999.0;
            if (llIIIIIIIllIlII(this.isOpenBlockSpace(lllllllllllllIlIIIlIIIIIIllllIII.west()) ? 1 : 0) && llIIIIIIIllllII(llIIIIIIIlllllI(lllllllllllllIlIIIlIIIIIIlllIlll, lllllllllllllIlIIIlIIIIIIlllIlII))) {
                lllllllllllllIlIIIlIIIIIIlllIlII = lllllllllllllIlIIIlIIIIIIlllIlll;
                lllllllllllllIlIIIlIIIIIIlllIlIl = EntityPlayerSP.lIIIlIlIIIlIll[0];
            }
            if (llIIIIIIIllIlII(this.isOpenBlockSpace(lllllllllllllIlIIIlIIIIIIllllIII.east()) ? 1 : 0) && llIIIIIIIllllII(llIIIIIIIlllllI(1.0 - lllllllllllllIlIIIlIIIIIIlllIlll, lllllllllllllIlIIIlIIIIIIlllIlII))) {
                lllllllllllllIlIIIlIIIIIIlllIlII = 1.0 - lllllllllllllIlIIIlIIIIIIlllIlll;
                lllllllllllllIlIIIlIIIIIIlllIlIl = EntityPlayerSP.lIIIlIlIIIlIll[2];
            }
            if (llIIIIIIIllIlII(this.isOpenBlockSpace(lllllllllllllIlIIIlIIIIIIllllIII.north()) ? 1 : 0) && llIIIIIIIllllII(llIIIIIIIlllllI(lllllllllllllIlIIIlIIIIIIlllIllI, lllllllllllllIlIIIlIIIIIIlllIlII))) {
                lllllllllllllIlIIIlIIIIIIlllIlII = lllllllllllllIlIIIlIIIIIIlllIllI;
                lllllllllllllIlIIIlIIIIIIlllIlIl = EntityPlayerSP.lIIIlIlIIIlIll[6];
            }
            if (llIIIIIIIllIlII(this.isOpenBlockSpace(lllllllllllllIlIIIlIIIIIIllllIII.south()) ? 1 : 0) && llIIIIIIIllllII(llIIIIIIIlllllI(1.0 - lllllllllllllIlIIIlIIIIIIlllIllI, lllllllllllllIlIIIlIIIIIIlllIlII))) {
                lllllllllllllIlIIIlIIIIIIlllIlII = 1.0 - lllllllllllllIlIIIlIIIIIIlllIllI;
                lllllllllllllIlIIIlIIIIIIlllIlIl = EntityPlayerSP.lIIIlIlIIIlIll[7];
            }
            final float lllllllllllllIlIIIlIIIIIIlllIIll = 0.1f;
            if (llIIIIIIIlllIIl(lllllllllllllIlIIIlIIIIIIlllIlIl)) {
                this.motionX = -lllllllllllllIlIIIlIIIIIIlllIIll;
            }
            if (llIIIIIIIllllll(lllllllllllllIlIIIlIIIIIIlllIlIl, EntityPlayerSP.lIIIlIlIIIlIll[2])) {
                this.motionX = lllllllllllllIlIIIlIIIIIIlllIIll;
            }
            if (llIIIIIIIllllll(lllllllllllllIlIIIlIIIIIIlllIlIl, EntityPlayerSP.lIIIlIlIIIlIll[6])) {
                this.motionZ = -lllllllllllllIlIIIlIIIIIIlllIIll;
            }
            if (llIIIIIIIllllll(lllllllllllllIlIIIlIIIIIIlllIlIl, EntityPlayerSP.lIIIlIlIIIlIll[7])) {
                this.motionZ = lllllllllllllIlIIIlIIIIIIlllIIll;
            }
        }
        return EntityPlayerSP.lIIIlIlIIIlIll[0] != 0;
    }
    
    @Override
    public void openEditCommandBlock(final CommandBlockLogic lllllllllllllIlIIIlIIIIIIIlIIllI) {
        this.mc.displayGuiScreen(new GuiCommandBlock(lllllllllllllIlIIIlIIIIIIIlIIllI));
    }
    
    @Override
    public void heal(final float lllllllllllllIlIIIlIIIIlIIIIIlIl) {
    }
    
    @Override
    public void playSound(final String lllllllllllllIlIIIlIIIIIIIllllIl, final float lllllllllllllIlIIIlIIIIIIIllllII, final float lllllllllllllIlIIIlIIIIIIIlllIll) {
        this.worldObj.playSound(this.posX, this.posY, this.posZ, lllllllllllllIlIIIlIIIIIIIllllIl, lllllllllllllIlIIIlIIIIIIIllllII, lllllllllllllIlIIIlIIIIIIIlllIll, (boolean)(EntityPlayerSP.lIIIlIlIIIlIll[0] != 0));
    }
    
    private static boolean llIIIIIIlIIIIII(final Object lllllllllllllIlIIIIllllllIIIllIl, final Object lllllllllllllIlIIIIllllllIIIllII) {
        return lllllllllllllIlIIIIllllllIIIllIl == lllllllllllllIlIIIIllllllIIIllII;
    }
    
    private static void llIIIIIIIllIIlI() {
        (lIIIlIlIIIlIlI = new String[EntityPlayerSP.lIIIlIlIIIlIll[17]])[EntityPlayerSP.lIIIlIlIIIlIll[0]] = llIIIIIIIlIllll("Lz8lFiowNy0HcyE5JQcoKzguAQ==", "BVKsI");
        EntityPlayerSP.lIIIlIlIIIlIlI[EntityPlayerSP.lIIIlIlIIIlIll[2]] = llIIIIIIIlIllll("Gi4WKQkFJh44UBQvHT8e", "wGxLj");
        EntityPlayerSP.lIIIlIlIIIlIlI[EntityPlayerSP.lIIIlIlIIIlIll[3]] = llIIIIIIIllIIII("V48BdaO6eF0z0OE13mGyS/rfAnY4dREV", "tehRB");
        EntityPlayerSP.lIIIlIlIIIlIlI[EntityPlayerSP.lIIIlIlIIIlIll[9]] = llIIIIIIIllIIII("nEGap2jsdg7tTJfLH2EY7TkePqMCzkXQ", "fhlmQ");
        EntityPlayerSP.lIIIlIlIIIlIlI[EntityPlayerSP.lIIIlIlIIIlIll[6]] = llIIIIIIIllIIIl("2opZzMk4Tka2fjkTB+iuBAltB/++TsRR", "uRMgb");
        EntityPlayerSP.lIIIlIlIIIlIlI[EntityPlayerSP.lIIIlIlIIIlIll[7]] = llIIIIIIIlIllll("JSokJC06Iiw1dComKyIhJg==", "HCJAN");
        EntityPlayerSP.lIIIlIlIIIlIlI[EntityPlayerSP.lIIIlIlIIIlIll[10]] = llIIIIIIIllIIII("/thHRQfUB5XWn6dagTfcw3YFJKAEJ8Ee", "bMJyI");
        EntityPlayerSP.lIIIlIlIIIlIlI[EntityPlayerSP.lIIIlIlIIIlIll[11]] = llIIIIIIIllIIIl("mrqkLln4R02vC94cZj7brBwx/7LqwKRR", "FKSKJ");
        EntityPlayerSP.lIIIlIlIIIlIlI[EntityPlayerSP.lIIIlIlIIIlIll[12]] = llIIIIIIIllIIIl("ja9QllmwQOvBQV92Fgogt2NA3Hrp/nYhTDayZT+D9fE=", "PUigD");
        EntityPlayerSP.lIIIlIlIIIlIlI[EntityPlayerSP.lIIIlIlIIIlIll[13]] = llIIIIIIIlIllll("LBAmKwQzGC46XSQXKyYGLw0hIAAeDSksCyQ=", "AyHNg");
        EntityPlayerSP.lIIIlIlIIIlIlI[EntityPlayerSP.lIIIlIlIIIlIll[4]] = llIIIIIIIlIllll("DCoDJBMTIgs1SgAtGygc", "aCmAp");
        EntityPlayerSP.lIIIlIlIIIlIlI[EntityPlayerSP.lIIIlIlIIIlIll[14]] = llIIIIIIIllIIII("xYW8RZry+NFSCLqolG4Slw==", "oypPb");
    }
    
    private static void llIIIIIIIllIIll() {
        (lIIIlIlIIIlIll = new int[18])[0] = ((0xFF ^ 0xAF) & ~(0x91 ^ 0xC1));
        EntityPlayerSP.lIIIlIlIIIlIll[1] = (134 + 45 - 151 + 126 ^ 95 + 86 - 78 + 39);
        EntityPlayerSP.lIIIlIlIIIlIll[2] = " ".length();
        EntityPlayerSP.lIIIlIlIIIlIll[3] = "  ".length();
        EntityPlayerSP.lIIIlIlIIIlIll[4] = (0x23 ^ 0x29);
        EntityPlayerSP.lIIIlIlIIIlIll[5] = -" ".length();
        EntityPlayerSP.lIIIlIlIIIlIll[6] = (25 + 53 - 63 + 157 ^ 2 + 86 + 46 + 34);
        EntityPlayerSP.lIIIlIlIIIlIll[7] = (0xAE ^ 0xBC ^ (0x54 ^ 0x43));
        EntityPlayerSP.lIIIlIlIIIlIll[8] = (0xFFFF8BD8 & 0x767F);
        EntityPlayerSP.lIIIlIlIIIlIll[9] = "   ".length();
        EntityPlayerSP.lIIIlIlIIIlIll[10] = (0x40 ^ 0x46);
        EntityPlayerSP.lIIIlIlIIIlIll[11] = (0x98 ^ 0x9F);
        EntityPlayerSP.lIIIlIlIIIlIll[12] = (0x29 ^ 0x21);
        EntityPlayerSP.lIIIlIlIIIlIll[13] = (0xCE ^ 0xC7);
        EntityPlayerSP.lIIIlIlIIIlIll[14] = (84 + 146 - 142 + 72 ^ 156 + 81 - 96 + 30);
        EntityPlayerSP.lIIIlIlIIIlIll[15] = (39 + 151 - 63 + 25 ^ 12 + 5 + 61 + 86);
        EntityPlayerSP.lIIIlIlIIIlIll[16] = -(0x5 ^ 0x2A ^ (0x42 ^ 0x67));
        EntityPlayerSP.lIIIlIlIIIlIll[17] = (0xAF ^ 0xA9 ^ (0x3A ^ 0x30));
    }
    
    @Override
    protected void damageEntity(final DamageSource lllllllllllllIlIIIlIIIIIlIllllll, final float lllllllllllllIlIIIlIIIIIlIlllllI) {
        if (llIIIIIIIlllIIl(this.isEntityInvulnerable(lllllllllllllIlIIIlIIIIIlIllllll) ? 1 : 0)) {
            this.setHealth(this.getHealth() - lllllllllllllIlIIIlIIIIIlIlllllI);
        }
    }
    
    @Override
    public boolean isServerWorld() {
        return EntityPlayerSP.lIIIlIlIIIlIll[2] != 0;
    }
    
    @Override
    public boolean canCommandSenderUseCommand(final int lllllllllllllIlIIIlIIIIIIlIIIllI, final String lllllllllllllIlIIIlIIIIIIlIIIlll) {
        if (llIIIIIIIllIlll(lllllllllllllIlIIIlIIIIIIlIIIllI)) {
            return EntityPlayerSP.lIIIlIlIIIlIll[2] != 0;
        }
        return EntityPlayerSP.lIIIlIlIIIlIll[0] != 0;
    }
    
    private static boolean llIIIIIIlIIIlII(final int lllllllllllllIlIIIIllllllIIIIlII) {
        return lllllllllllllIlIIIIllllllIIIIlII >= 0;
    }
    
    private static boolean llIIIIIIIllllII(final int lllllllllllllIlIIIIllllllIIIIIlI) {
        return lllllllllllllIlIIIIllllllIIIIIlI < 0;
    }
    
    private static boolean llIIIIIIIllllll(final int lllllllllllllIlIIIIllllllIIllIll, final int lllllllllllllIlIIIIllllllIIllIlI) {
        return lllllllllllllIlIIIIllllllIIllIll == lllllllllllllIlIIIIllllllIIllIlI;
    }
    
    @Override
    public void setSprinting(final boolean lllllllllllllIlIIIlIIIIIIlIlllIl) {
        super.setSprinting(lllllllllllllIlIIIlIIIIIIlIlllIl);
        int sprintingTicksLeft;
        if (llIIIIIIIllIlII(lllllllllllllIlIIIlIIIIIIlIlllIl ? 1 : 0)) {
            sprintingTicksLeft = EntityPlayerSP.lIIIlIlIIIlIll[8];
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        else {
            sprintingTicksLeft = EntityPlayerSP.lIIIlIlIIIlIll[0];
        }
        this.sprintingTicksLeft = sprintingTicksLeft;
    }
    
    public float getHorseJumpPower() {
        return this.horseJumpPower;
    }
    
    public StatFileWriter getStatFileWriter() {
        return this.statWriter;
    }
    
    @Override
    public void displayGUIBook(final ItemStack lllllllllllllIlIIIlIIIIIIIIlllII) {
        final Item lllllllllllllIlIIIlIIIIIIIIllllI = lllllllllllllIlIIIlIIIIIIIIlllII.getItem();
        if (llIIIIIIlIIIIII(lllllllllllllIlIIIlIIIIIIIIllllI, Items.writable_book)) {
            this.mc.displayGuiScreen(new GuiScreenBook(this, lllllllllllllIlIIIlIIIIIIIIlllII, (boolean)(EntityPlayerSP.lIIIlIlIIIlIll[2] != 0)));
        }
    }
    
    protected void sendHorseJump() {
        this.sendQueue.addToSendQueue(new C0BPacketEntityAction(this, C0BPacketEntityAction.Action.RIDING_JUMP, (int)(this.getHorseJumpPower() * 100.0f)));
    }
    
    @Override
    public void addChatComponentMessage(final IChatComponent lllllllllllllIlIIIlIIIIIlIIIlIIl) {
        this.mc.ingameGUI.getChatGUI().printChatMessage(lllllllllllllIlIIIlIIIIIlIIIlIIl);
    }
    
    private static int llIIIIIIIllIlIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static int llIIIIIIIlllllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public boolean isSneaking() {
        int sneak;
        if (llIIIIIIIllllIl(this.movementInput)) {
            sneak = (this.movementInput.sneak ? 1 : 0);
            "".length();
            if (" ".length() < 0) {
                return ((0xA0 ^ 0xA5) & ~(0x39 ^ 0x3C)) != 0x0;
            }
        }
        else {
            sneak = EntityPlayerSP.lIIIlIlIIIlIll[0];
        }
        final boolean lllllllllllllIlIIIIllllllllIlIlI = sneak != 0;
        if (llIIIIIIIllIlII(lllllllllllllIlIIIIllllllllIlIlI ? 1 : 0) && llIIIIIIIlllIIl(this.sleeping ? 1 : 0)) {
            return EntityPlayerSP.lIIIlIlIIIlIll[2] != 0;
        }
        return EntityPlayerSP.lIIIlIlIIIlIll[0] != 0;
    }
    
    public void closeScreenAndDropStack() {
        this.inventory.setItemStack(null);
        super.closeScreen();
        this.mc.displayGuiScreen(null);
    }
    
    @Override
    public void mountEntity(final Entity lllllllllllllIlIIIlIIIIlIIIIIIIl) {
        super.mountEntity(lllllllllllllIlIIIlIIIIlIIIIIIIl);
        if (llIIIIIIIllIlII((lllllllllllllIlIIIlIIIIlIIIIIIIl instanceof EntityMinecart) ? 1 : 0)) {
            this.mc.getSoundHandler().playSound(new MovingSoundMinecartRiding(this, (EntityMinecart)lllllllllllllIlIIIlIIIIlIIIIIIIl));
        }
    }
    
    private static String llIIIIIIIlIllll(String lllllllllllllIlIIIIllllllIlIIllI, final String lllllllllllllIlIIIIllllllIlIIlIl) {
        lllllllllllllIlIIIIllllllIlIIllI = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIIllllllIlIIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIllllllIlIlIIl = new StringBuilder();
        final char[] lllllllllllllIlIIIIllllllIlIlIII = lllllllllllllIlIIIIllllllIlIIlIl.toCharArray();
        int lllllllllllllIlIIIIllllllIlIIlll = EntityPlayerSP.lIIIlIlIIIlIll[0];
        final boolean lllllllllllllIlIIIIllllllIlIIIIl = (Object)((String)lllllllllllllIlIIIIllllllIlIIllI).toCharArray();
        final short lllllllllllllIlIIIIllllllIlIIIII = (short)lllllllllllllIlIIIIllllllIlIIIIl.length;
        double lllllllllllllIlIIIIllllllIIlllll = EntityPlayerSP.lIIIlIlIIIlIll[0];
        while (llIIIIIIIlllIII((int)lllllllllllllIlIIIIllllllIIlllll, lllllllllllllIlIIIIllllllIlIIIII)) {
            final char lllllllllllllIlIIIIllllllIlIllII = lllllllllllllIlIIIIllllllIlIIIIl[lllllllllllllIlIIIIllllllIIlllll];
            lllllllllllllIlIIIIllllllIlIlIIl.append((char)(lllllllllllllIlIIIIllllllIlIllII ^ lllllllllllllIlIIIIllllllIlIlIII[lllllllllllllIlIIIIllllllIlIIlll % lllllllllllllIlIIIIllllllIlIlIII.length]));
            "".length();
            ++lllllllllllllIlIIIIllllllIlIIlll;
            ++lllllllllllllIlIIIIllllllIIlllll;
            "".length();
            if ((("   ".length() ^ (0x14 ^ 0x12)) & (0xAE ^ 0xA7 ^ (0x92 ^ 0x9E) ^ -" ".length())) == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIllllllIlIlIIl);
    }
    
    public String getClientBrand() {
        return this.clientBrand;
    }
    
    @Override
    public void displayGUIChest(final IInventory lllllllllllllIlIIIlIIIIIIIIlIIll) {
        String guiID;
        if (llIIIIIIIllIlII((lllllllllllllIlIIIlIIIIIIIIlIIll instanceof IInteractionObject) ? 1 : 0)) {
            guiID = ((IInteractionObject)lllllllllllllIlIIIlIIIIIIIIlIIll).getGuiID();
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        else {
            guiID = EntityPlayerSP.lIIIlIlIIIlIlI[EntityPlayerSP.lIIIlIlIIIlIll[0]];
        }
        final String lllllllllllllIlIIIlIIIIIIIIlIlIl = guiID;
        if (llIIIIIIIllIlII(EntityPlayerSP.lIIIlIlIIIlIlI[EntityPlayerSP.lIIIlIlIIIlIll[2]].equals(lllllllllllllIlIIIlIIIIIIIIlIlIl) ? 1 : 0)) {
            this.mc.displayGuiScreen(new GuiChest(this.inventory, lllllllllllllIlIIIlIIIIIIIIlIIll));
            "".length();
            if (((179 + 183 - 173 + 2 ^ 34 + 14 - 27 + 108) & (152 + 155 - 230 + 112 ^ 53 + 26 - 32 + 84 ^ -" ".length())) < 0) {
                return;
            }
        }
        else if (llIIIIIIIllIlII(EntityPlayerSP.lIIIlIlIIIlIlI[EntityPlayerSP.lIIIlIlIIIlIll[3]].equals(lllllllllllllIlIIIlIIIIIIIIlIlIl) ? 1 : 0)) {
            this.mc.displayGuiScreen(new GuiHopper(this.inventory, lllllllllllllIlIIIlIIIIIIIIlIIll));
            "".length();
            if ((0x97 ^ 0x93) < (0x4B ^ 0x4F)) {
                return;
            }
        }
        else if (llIIIIIIIllIlII(EntityPlayerSP.lIIIlIlIIIlIlI[EntityPlayerSP.lIIIlIlIIIlIll[9]].equals(lllllllllllllIlIIIlIIIIIIIIlIlIl) ? 1 : 0)) {
            this.mc.displayGuiScreen(new GuiFurnace(this.inventory, lllllllllllllIlIIIlIIIIIIIIlIIll));
            "".length();
            if (-" ".length() >= ((0x60 ^ 0x18 ^ (0xB2 ^ 0xA9)) & (90 + 114 - 126 + 120 ^ 100 + 18 - 38 + 85 ^ -" ".length()))) {
                return;
            }
        }
        else if (llIIIIIIIllIlII(EntityPlayerSP.lIIIlIlIIIlIlI[EntityPlayerSP.lIIIlIlIIIlIll[6]].equals(lllllllllllllIlIIIlIIIIIIIIlIlIl) ? 1 : 0)) {
            this.mc.displayGuiScreen(new GuiBrewingStand(this.inventory, lllllllllllllIlIIIlIIIIIIIIlIIll));
            "".length();
            if (-(0x1C ^ 0x18) >= 0) {
                return;
            }
        }
        else if (llIIIIIIIllIlII(EntityPlayerSP.lIIIlIlIIIlIlI[EntityPlayerSP.lIIIlIlIIIlIll[7]].equals(lllllllllllllIlIIIlIIIIIIIIlIlIl) ? 1 : 0)) {
            this.mc.displayGuiScreen(new GuiBeacon(this.inventory, lllllllllllllIlIIIlIIIIIIIIlIIll));
            "".length();
            if ((" ".length() & (" ".length() ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else if (llIIIIIIIlllIIl(EntityPlayerSP.lIIIlIlIIIlIlI[EntityPlayerSP.lIIIlIlIIIlIll[10]].equals(lllllllllllllIlIIIlIIIIIIIIlIlIl) ? 1 : 0) && llIIIIIIIlllIIl(EntityPlayerSP.lIIIlIlIIIlIlI[EntityPlayerSP.lIIIlIlIIIlIll[11]].equals(lllllllllllllIlIIIlIIIIIIIIlIlIl) ? 1 : 0)) {
            this.mc.displayGuiScreen(new GuiChest(this.inventory, lllllllllllllIlIIIlIIIIIIIIlIIll));
            "".length();
            if (" ".length() >= (0x57 ^ 0x75 ^ (0x99 ^ 0xBF))) {
                return;
            }
        }
        else {
            this.mc.displayGuiScreen(new GuiDispenser(this.inventory, lllllllllllllIlIIIlIIIIIIIIlIIll));
        }
    }
    
    protected boolean isCurrentViewEntity() {
        if (llIIIIIIlIIIIII(this.mc.getRenderViewEntity(), this)) {
            return EntityPlayerSP.lIIIlIlIIIlIll[2] != 0;
        }
        return EntityPlayerSP.lIIIlIlIIIlIll[0] != 0;
    }
    
    private static boolean llIIIIIIIllllIl(final Object lllllllllllllIlIIIIllllllIIlIIII) {
        return lllllllllllllIlIIIIllllllIIlIIII != null;
    }
    
    private static boolean llIIIIIIIllIlll(final int lllllllllllllIlIIIIllllllIIIIIII) {
        return lllllllllllllIlIIIIllllllIIIIIII <= 0;
    }
    
    @Override
    public void displayVillagerTradeGui(final IMerchant lllllllllllllIlIIIIlllllllllllII) {
        this.mc.displayGuiScreen(new GuiMerchant(this.inventory, lllllllllllllIlIIIIlllllllllllII, this.worldObj));
    }
    
    private static String llIIIIIIIllIIIl(final String lllllllllllllIlIIIIlllllllIIIllI, final String lllllllllllllIlIIIIlllllllIIIlll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIlllllllIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIlllllllIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIIlllllllIIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIIlllllllIIlIlI.init(EntityPlayerSP.lIIIlIlIIIlIll[3], lllllllllllllIlIIIIlllllllIIlIll);
            return new String(lllllllllllllIlIIIIlllllllIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIlllllllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIlllllllIIlIIl) {
            lllllllllllllIlIIIIlllllllIIlIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void openEditSign(final TileEntitySign lllllllllllllIlIIIlIIIIIIIlIllII) {
        this.mc.displayGuiScreen(new GuiEditSign(lllllllllllllIlIIIlIIIIIIIlIllII));
    }
    
    private static boolean llIIIIIIIlllIII(final int lllllllllllllIlIIIIllllllIIlIlll, final int lllllllllllllIlIIIIllllllIIlIllI) {
        return lllllllllllllIlIIIIllllllIIlIlll < lllllllllllllIlIIIIllllllIIlIllI;
    }
    
    public EntityPlayerSP(final Minecraft lllllllllllllIlIIIlIIIIlIIIlIIlI, final World lllllllllllllIlIIIlIIIIlIIIlIIIl, final NetHandlerPlayClient lllllllllllllIlIIIlIIIIlIIIlIIII, final StatFileWriter lllllllllllllIlIIIlIIIIlIIIIllll) {
        super(lllllllllllllIlIIIlIIIIlIIIlIIIl, lllllllllllllIlIIIlIIIIlIIIlIIII.getGameProfile());
        this.sendQueue = lllllllllllllIlIIIlIIIIlIIIlIIII;
        this.statWriter = lllllllllllllIlIIIlIIIIlIIIIllll;
        this.mc = lllllllllllllIlIIIlIIIIlIIIlIIlI;
        this.dimension = EntityPlayerSP.lIIIlIlIIIlIll[0];
    }
    
    @Override
    public void swingItem() {
        super.swingItem();
        this.sendQueue.addToSendQueue(new C0APacketAnimation());
    }
    
    @Override
    public void addStat(final StatBase lllllllllllllIlIIIlIIIIIlIlIIlII, final int lllllllllllllIlIIIlIIIIIlIlIIllI) {
        if (llIIIIIIIllllIl(lllllllllllllIlIIIlIIIIIlIlIIlII) && llIIIIIIIllIlII(lllllllllllllIlIIIlIIIIIlIlIIlII.isIndependent ? 1 : 0)) {
            super.addStat(lllllllllllllIlIIIlIIIIIlIlIIlII, lllllllllllllIlIIIlIIIIIlIlIIllI);
        }
    }
    
    @Override
    public void respawnPlayer() {
        this.sendQueue.addToSendQueue(new C16PacketClientStatus(C16PacketClientStatus.EnumState.PERFORM_RESPAWN));
    }
    
    private static boolean llIIIIIIlIIIlIl(final int lllllllllllllIlIIIIllllllIIlIIll, final int lllllllllllllIlIIIIllllllIIlIIlI) {
        return lllllllllllllIlIIIIllllllIIlIIll > lllllllllllllIlIIIIllllllIIlIIlI;
    }
    
    private static int llIIIIIIlIIIIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public void sendPlayerAbilities() {
        this.sendQueue.addToSendQueue(new C13PacketPlayerAbilities(this.capabilities));
    }
    
    @Override
    public void onLivingUpdate() {
        if (llIIIIIIlIIIIll(this.sprintingTicksLeft)) {
            this.sprintingTicksLeft -= EntityPlayerSP.lIIIlIlIIIlIll[2];
            if (llIIIIIIIlllIIl(this.sprintingTicksLeft)) {
                this.setSprinting((boolean)(EntityPlayerSP.lIIIlIlIIIlIll[0] != 0));
            }
        }
        if (llIIIIIIlIIIIll(this.sprintToggleTimer)) {
            this.sprintToggleTimer -= EntityPlayerSP.lIIIlIlIIIlIll[2];
        }
        this.prevTimeInPortal = this.timeInPortal;
        if (llIIIIIIIllIlII(this.inPortal ? 1 : 0)) {
            if (llIIIIIIIllllIl(this.mc.currentScreen) && llIIIIIIIlllIIl(this.mc.currentScreen.doesGuiPauseGame() ? 1 : 0)) {
                this.mc.displayGuiScreen(null);
            }
            if (llIIIIIIIlllIIl(llIIIIIIlIIIIIl(this.timeInPortal, 0.0f))) {
                this.mc.getSoundHandler().playSound(PositionedSoundRecord.create(new ResourceLocation(EntityPlayerSP.lIIIlIlIIIlIlI[EntityPlayerSP.lIIIlIlIIIlIll[14]]), this.rand.nextFloat() * 0.4f + 0.8f));
            }
            this.timeInPortal += 0.0125f;
            if (llIIIIIIlIIIlII(llIIIIIIlIIIIIl(this.timeInPortal, 1.0f))) {
                this.timeInPortal = 1.0f;
            }
            this.inPortal = (EntityPlayerSP.lIIIlIlIIIlIll[0] != 0);
            "".length();
            if ((0x76 ^ 0x5D ^ (0xA0 ^ 0x8E)) == 0x0) {
                return;
            }
        }
        else if (llIIIIIIIllIlII(this.isPotionActive(Potion.confusion) ? 1 : 0) && llIIIIIIlIIIlIl(this.getActivePotionEffect(Potion.confusion).getDuration(), EntityPlayerSP.lIIIlIlIIIlIll[15])) {
            this.timeInPortal += 0.006666667f;
            if (llIIIIIIlIIIIll(llIIIIIIlIIIIIl(this.timeInPortal, 1.0f))) {
                this.timeInPortal = 1.0f;
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
            }
        }
        else {
            if (llIIIIIIlIIIIll(llIIIIIIlIIIIIl(this.timeInPortal, 0.0f))) {
                this.timeInPortal -= 0.05f;
            }
            if (llIIIIIIIllllII(llIIIIIIlIIIIlI(this.timeInPortal, 0.0f))) {
                this.timeInPortal = 0.0f;
            }
        }
        if (llIIIIIIlIIIIll(this.timeUntilPortal)) {
            this.timeUntilPortal -= EntityPlayerSP.lIIIlIlIIIlIll[2];
        }
        final boolean lllllllllllllIlIIIIlllllllIllIlI = this.movementInput.jump;
        final boolean lllllllllllllIlIIIIlllllllIllIIl = this.movementInput.sneak;
        final float lllllllllllllIlIIIIlllllllIllIII = 0.8f;
        int n;
        if (llIIIIIIlIIIlII(llIIIIIIlIIIIIl(this.movementInput.moveForward, lllllllllllllIlIIIIlllllllIllIII))) {
            n = EntityPlayerSP.lIIIlIlIIIlIll[2];
            "".length();
            if ("   ".length() < "   ".length()) {
                return;
            }
        }
        else {
            n = EntityPlayerSP.lIIIlIlIIIlIll[0];
        }
        final boolean lllllllllllllIlIIIIlllllllIlIlll = n != 0;
        this.movementInput.updatePlayerMoveState();
        if (llIIIIIIIllIlII(this.isUsingItem() ? 1 : 0) && llIIIIIIIlllIIl(this.isRiding() ? 1 : 0)) {
            final MovementInput movementInput = this.movementInput;
            movementInput.moveStrafe *= 0.2f;
            final MovementInput movementInput2 = this.movementInput;
            movementInput2.moveForward *= 0.2f;
            this.sprintToggleTimer = EntityPlayerSP.lIIIlIlIIIlIll[0];
        }
        this.pushOutOfBlocks(this.posX - this.width * 0.35, this.getEntityBoundingBox().minY + 0.5, this.posZ + this.width * 0.35);
        "".length();
        this.pushOutOfBlocks(this.posX - this.width * 0.35, this.getEntityBoundingBox().minY + 0.5, this.posZ - this.width * 0.35);
        "".length();
        this.pushOutOfBlocks(this.posX + this.width * 0.35, this.getEntityBoundingBox().minY + 0.5, this.posZ - this.width * 0.35);
        "".length();
        this.pushOutOfBlocks(this.posX + this.width * 0.35, this.getEntityBoundingBox().minY + 0.5, this.posZ + this.width * 0.35);
        "".length();
        int n2;
        if (llIIIIIIIllIlll(llIIIIIIlIIIIIl((float)this.getFoodStats().getFoodLevel(), 6.0f)) && llIIIIIIIlllIIl(this.capabilities.allowFlying ? 1 : 0)) {
            n2 = EntityPlayerSP.lIIIlIlIIIlIll[0];
            "".length();
            if (((0x7 ^ 0x1E) & ~(0x1A ^ 0x3)) != ((0x1A ^ 0x56) & ~(0x43 ^ 0xF))) {
                return;
            }
        }
        else {
            n2 = EntityPlayerSP.lIIIlIlIIIlIll[2];
        }
        final boolean lllllllllllllIlIIIIlllllllIlIllI = n2 != 0;
        if (llIIIIIIIllIlII(this.onGround ? 1 : 0) && llIIIIIIIlllIIl(lllllllllllllIlIIIIlllllllIllIIl ? 1 : 0) && llIIIIIIIlllIIl(lllllllllllllIlIIIIlllllllIlIlll ? 1 : 0) && llIIIIIIlIIIlII(llIIIIIIlIIIIIl(this.movementInput.moveForward, lllllllllllllIlIIIIlllllllIllIII)) && llIIIIIIIlllIIl(this.isSprinting() ? 1 : 0) && llIIIIIIIllIlII(lllllllllllllIlIIIIlllllllIlIllI ? 1 : 0) && llIIIIIIIlllIIl(this.isUsingItem() ? 1 : 0) && llIIIIIIIlllIIl(this.isPotionActive(Potion.blindness) ? 1 : 0)) {
            if (llIIIIIIIllIlll(this.sprintToggleTimer) && llIIIIIIIlllIIl(this.mc.gameSettings.keyBindSprint.isKeyDown() ? 1 : 0)) {
                this.sprintToggleTimer = EntityPlayerSP.lIIIlIlIIIlIll[11];
                "".length();
                if ((125 + 99 - 181 + 125 ^ 8 + 148 - 150 + 166) < "   ".length()) {
                    return;
                }
            }
            else {
                this.setSprinting((boolean)(EntityPlayerSP.lIIIlIlIIIlIll[2] != 0));
            }
        }
        if (llIIIIIIIlllIIl(this.isSprinting() ? 1 : 0) && llIIIIIIlIIIlII(llIIIIIIlIIIIIl(this.movementInput.moveForward, lllllllllllllIlIIIIlllllllIllIII)) && llIIIIIIIllIlII(lllllllllllllIlIIIIlllllllIlIllI ? 1 : 0) && llIIIIIIIlllIIl(this.isUsingItem() ? 1 : 0) && llIIIIIIIlllIIl(this.isPotionActive(Potion.blindness) ? 1 : 0) && llIIIIIIIllIlII(this.mc.gameSettings.keyBindSprint.isKeyDown() ? 1 : 0)) {
            this.setSprinting((boolean)(EntityPlayerSP.lIIIlIlIIIlIll[2] != 0));
        }
        if (llIIIIIIIllIlII(this.isSprinting() ? 1 : 0) && (!llIIIIIIlIIIlII(llIIIIIIlIIIIlI(this.movementInput.moveForward, lllllllllllllIlIIIIlllllllIllIII)) || !llIIIIIIIlllIIl(this.isCollidedHorizontally ? 1 : 0) || llIIIIIIIlllIIl(lllllllllllllIlIIIIlllllllIlIllI ? 1 : 0))) {
            this.setSprinting((boolean)(EntityPlayerSP.lIIIlIlIIIlIll[0] != 0));
        }
        if (llIIIIIIIllIlII(this.capabilities.allowFlying ? 1 : 0)) {
            if (llIIIIIIIllIlII(this.mc.playerController.isSpectatorMode() ? 1 : 0)) {
                if (llIIIIIIIlllIIl(this.capabilities.isFlying ? 1 : 0)) {
                    this.capabilities.isFlying = (EntityPlayerSP.lIIIlIlIIIlIll[2] != 0);
                    this.sendPlayerAbilities();
                    "".length();
                    if ("   ".length() < 0) {
                        return;
                    }
                }
            }
            else if (llIIIIIIIlllIIl(lllllllllllllIlIIIIlllllllIllIlI ? 1 : 0) && llIIIIIIIllIlII(this.movementInput.jump ? 1 : 0)) {
                if (llIIIIIIIlllIIl(this.flyToggleTimer)) {
                    this.flyToggleTimer = EntityPlayerSP.lIIIlIlIIIlIll[11];
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return;
                    }
                }
                else {
                    final PlayerCapabilities capabilities = this.capabilities;
                    int isFlying;
                    if (llIIIIIIIllIlII(this.capabilities.isFlying ? 1 : 0)) {
                        isFlying = EntityPlayerSP.lIIIlIlIIIlIll[0];
                        "".length();
                        if ("  ".length() > "   ".length()) {
                            return;
                        }
                    }
                    else {
                        isFlying = EntityPlayerSP.lIIIlIlIIIlIll[2];
                    }
                    capabilities.isFlying = (isFlying != 0);
                    this.sendPlayerAbilities();
                    this.flyToggleTimer = EntityPlayerSP.lIIIlIlIIIlIll[0];
                }
            }
        }
        if (llIIIIIIIllIlII(this.capabilities.isFlying ? 1 : 0) && llIIIIIIIllIlII(this.isCurrentViewEntity() ? 1 : 0)) {
            if (llIIIIIIIllIlII(this.movementInput.sneak ? 1 : 0)) {
                this.motionY -= this.capabilities.getFlySpeed() * 3.0f;
            }
            if (llIIIIIIIllIlII(this.movementInput.jump ? 1 : 0)) {
                this.motionY += this.capabilities.getFlySpeed() * 3.0f;
            }
        }
        if (llIIIIIIIllIlII(this.isRidingHorse() ? 1 : 0)) {
            if (llIIIIIIIllllII(this.horseJumpPowerCounter)) {
                this.horseJumpPowerCounter += EntityPlayerSP.lIIIlIlIIIlIll[2];
                if (llIIIIIIIlllIIl(this.horseJumpPowerCounter)) {
                    this.horseJumpPower = 0.0f;
                }
            }
            if (llIIIIIIIllIlII(lllllllllllllIlIIIIlllllllIllIlI ? 1 : 0) && llIIIIIIIlllIIl(this.movementInput.jump ? 1 : 0)) {
                this.horseJumpPowerCounter = EntityPlayerSP.lIIIlIlIIIlIll[16];
                this.sendHorseJump();
                "".length();
                if (((0x6C ^ 0x5B ^ ((0xC8 ^ 0x93) & ~(0x4E ^ 0x15))) & (26 + 60 - 49 + 129 ^ 123 + 78 - 85 + 29 ^ -" ".length())) > 0) {
                    return;
                }
            }
            else if (llIIIIIIIlllIIl(lllllllllllllIlIIIIlllllllIllIlI ? 1 : 0) && llIIIIIIIllIlII(this.movementInput.jump ? 1 : 0)) {
                this.horseJumpPowerCounter = EntityPlayerSP.lIIIlIlIIIlIll[0];
                this.horseJumpPower = 0.0f;
                "".length();
                if (((0x7D ^ 0x69 ^ (0x48 ^ 0x79)) & (0xD5 ^ 0xA6 ^ (0x66 ^ 0x30) ^ -" ".length())) > "  ".length()) {
                    return;
                }
            }
            else if (llIIIIIIIllIlII(lllllllllllllIlIIIIlllllllIllIlI ? 1 : 0)) {
                this.horseJumpPowerCounter += EntityPlayerSP.lIIIlIlIIIlIll[2];
                if (llIIIIIIIlllIII(this.horseJumpPowerCounter, EntityPlayerSP.lIIIlIlIIIlIll[4])) {
                    this.horseJumpPower = this.horseJumpPowerCounter * 0.1f;
                    "".length();
                    if (-(0x23 ^ 0x35 ^ (0x64 ^ 0x76)) >= 0) {
                        return;
                    }
                }
                else {
                    this.horseJumpPower = 0.8f + 2.0f / (this.horseJumpPowerCounter - EntityPlayerSP.lIIIlIlIIIlIll[13]) * 0.1f;
                    "".length();
                    if (((0xBA ^ 0xAA ^ (0xE7 ^ 0xC0)) & (203 + 8 - 41 + 70 ^ 83 + 85 - 94 + 125 ^ -" ".length())) != ((0x3F ^ 0x5 ^ (0x78 ^ 0x52)) & (66 + 62 - 86 + 96 ^ 39 + 150 - 100 + 65 ^ -" ".length()))) {
                        return;
                    }
                }
            }
        }
        else {
            this.horseJumpPower = 0.0f;
        }
        super.onLivingUpdate();
        if (llIIIIIIIllIlII(this.onGround ? 1 : 0) && llIIIIIIIllIlII(this.capabilities.isFlying ? 1 : 0) && llIIIIIIIlllIIl(this.mc.playerController.isSpectatorMode() ? 1 : 0)) {
            this.capabilities.isFlying = (EntityPlayerSP.lIIIlIlIIIlIll[0] != 0);
            this.sendPlayerAbilities();
        }
    }
    
    private static boolean llIIIIIIIlllIlI(final Object lllllllllllllIlIIIIllllllIIIlIlI) {
        return lllllllllllllIlIIIIllllllIIIlIlI == null;
    }
    
    @Override
    public BlockPos getPosition() {
        return new BlockPos(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5);
    }
    
    @Override
    public void displayGUIHorse(final EntityHorse lllllllllllllIlIIIlIIIIIIIIIlIlI, final IInventory lllllllllllllIlIIIlIIIIIIIIIlIIl) {
        this.mc.displayGuiScreen(new GuiScreenHorseInventory(this.inventory, lllllllllllllIlIIIlIIIIIIIIIlIIl, lllllllllllllIlIIIlIIIIIIIIIlIlI));
    }
    
    private static boolean llIIIIIIIllIllI(final int lllllllllllllIlIIIIlllllIllllIll, final int lllllllllllllIlIIIIlllllIllllIlI) {
        return lllllllllllllIlIIIIlllllIllllIll != lllllllllllllIlIIIIlllllIllllIlI;
    }
    
    public void sendHorseInventory() {
        this.sendQueue.addToSendQueue(new C0BPacketEntityAction(this, C0BPacketEntityAction.Action.OPEN_INVENTORY));
    }
    
    public void setClientBrand(final String lllllllllllllIlIIIlIIIIIlIIlIIll) {
        this.clientBrand = lllllllllllllIlIIIlIIIIIlIIlIIll;
    }
    
    public void updateEntityActionState() {
        super.updateEntityActionState();
        if (llIIIIIIIllIlII(this.isCurrentViewEntity() ? 1 : 0)) {
            this.moveStrafing = this.movementInput.moveStrafe;
            this.moveForward = this.movementInput.moveForward;
            this.isJumping = this.movementInput.jump;
            this.prevRenderArmYaw = this.renderArmYaw;
            this.prevRenderArmPitch = this.renderArmPitch;
            this.renderArmPitch += (float)((this.rotationPitch - this.renderArmPitch) * 0.5);
            this.renderArmYaw += (float)((this.rotationYaw - this.renderArmYaw) * 0.5);
        }
    }
    
    @Override
    public void addChatMessage(final IChatComponent lllllllllllllIlIIIlIIIIIIlIIllIl) {
        this.mc.ingameGUI.getChatGUI().printChatMessage(lllllllllllllIlIIIlIIIIIIlIIllIl);
    }
    
    public void onUpdateWalkingPlayer() {
        final boolean lllllllllllllIlIIIlIIIIIlllIllIl = this.isSprinting();
        if (llIIIIIIIllIllI(lllllllllllllIlIIIlIIIIIlllIllIl ? 1 : 0, this.serverSprintState ? 1 : 0)) {
            if (llIIIIIIIllIlII(lllllllllllllIlIIIlIIIIIlllIllIl ? 1 : 0)) {
                this.sendQueue.addToSendQueue(new C0BPacketEntityAction(this, C0BPacketEntityAction.Action.START_SPRINTING));
                "".length();
                if (" ".length() > "  ".length()) {
                    return;
                }
            }
            else {
                this.sendQueue.addToSendQueue(new C0BPacketEntityAction(this, C0BPacketEntityAction.Action.STOP_SPRINTING));
            }
            this.serverSprintState = lllllllllllllIlIIIlIIIIIlllIllIl;
        }
        final boolean lllllllllllllIlIIIlIIIIIlllIllII = this.isSneaking();
        if (llIIIIIIIllIllI(lllllllllllllIlIIIlIIIIIlllIllII ? 1 : 0, this.serverSneakState ? 1 : 0)) {
            if (llIIIIIIIllIlII(lllllllllllllIlIIIlIIIIIlllIllII ? 1 : 0)) {
                this.sendQueue.addToSendQueue(new C0BPacketEntityAction(this, C0BPacketEntityAction.Action.START_SNEAKING));
                "".length();
                if ((0xB3 ^ 0xB7) <= -" ".length()) {
                    return;
                }
            }
            else {
                this.sendQueue.addToSendQueue(new C0BPacketEntityAction(this, C0BPacketEntityAction.Action.STOP_SNEAKING));
            }
            this.serverSneakState = lllllllllllllIlIIIlIIIIIlllIllII;
        }
        if (llIIIIIIIllIlII(this.isCurrentViewEntity() ? 1 : 0)) {
            final double lllllllllllllIlIIIlIIIIIlllIlIll = this.posX - this.lastReportedPosX;
            final double lllllllllllllIlIIIlIIIIIlllIlIlI = this.getEntityBoundingBox().minY - this.lastReportedPosY;
            final double lllllllllllllIlIIIlIIIIIlllIlIIl = this.posZ - this.lastReportedPosZ;
            final double lllllllllllllIlIIIlIIIIIlllIlIII = this.rotationYaw - this.lastReportedYaw;
            final double lllllllllllllIlIIIlIIIIIlllIIlll = this.rotationPitch - this.lastReportedPitch;
            int n;
            if (llIIIIIIIllIlll(llIIIIIIIllIlIl(lllllllllllllIlIIIlIIIIIlllIlIll * lllllllllllllIlIIIlIIIIIlllIlIll + lllllllllllllIlIIIlIIIIIlllIlIlI * lllllllllllllIlIIIlIIIIIlllIlIlI + lllllllllllllIlIIIlIIIIIlllIlIIl * lllllllllllllIlIIIlIIIIIlllIlIIl, 9.0E-4)) && llIIIIIIIlllIII(this.positionUpdateTicks, EntityPlayerSP.lIIIlIlIIIlIll[1])) {
                n = EntityPlayerSP.lIIIlIlIIIlIll[0];
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            else {
                n = EntityPlayerSP.lIIIlIlIIIlIll[2];
            }
            boolean lllllllllllllIlIIIlIIIIIlllIIllI = n != 0;
            int n2;
            if (llIIIIIIIlllIIl(llIIIIIIIllIlIl(lllllllllllllIlIIIlIIIIIlllIlIII, 0.0)) && llIIIIIIIlllIIl(llIIIIIIIllIlIl(lllllllllllllIlIIIlIIIIIlllIIlll, 0.0))) {
                n2 = EntityPlayerSP.lIIIlIlIIIlIll[0];
                "".length();
                if (-"   ".length() >= 0) {
                    return;
                }
            }
            else {
                n2 = EntityPlayerSP.lIIIlIlIIIlIll[2];
            }
            final boolean lllllllllllllIlIIIlIIIIIlllIIlIl = n2 != 0;
            if (llIIIIIIIlllIlI(this.ridingEntity)) {
                if (llIIIIIIIllIlII(lllllllllllllIlIIIlIIIIIlllIIllI ? 1 : 0) && llIIIIIIIllIlII(lllllllllllllIlIIIlIIIIIlllIIlIl ? 1 : 0)) {
                    this.sendQueue.addToSendQueue(new C03PacketPlayer.C06PacketPlayerPosLook(this.posX, this.getEntityBoundingBox().minY, this.posZ, this.rotationYaw, this.rotationPitch, this.onGround));
                    "".length();
                    if ((0x94 ^ 0x90) <= 0) {
                        return;
                    }
                }
                else if (llIIIIIIIllIlII(lllllllllllllIlIIIlIIIIIlllIIllI ? 1 : 0)) {
                    this.sendQueue.addToSendQueue(new C03PacketPlayer.C04PacketPlayerPosition(this.posX, this.getEntityBoundingBox().minY, this.posZ, this.onGround));
                    "".length();
                    if (((0x73 ^ 0x69) & ~(0x41 ^ 0x5B)) > " ".length()) {
                        return;
                    }
                }
                else if (llIIIIIIIllIlII(lllllllllllllIlIIIlIIIIIlllIIlIl ? 1 : 0)) {
                    this.sendQueue.addToSendQueue(new C03PacketPlayer.C05PacketPlayerLook(this.rotationYaw, this.rotationPitch, this.onGround));
                    "".length();
                    if (-" ".length() == ((" ".length() ^ (0x3 ^ 0x54)) & (0xD7 ^ 0x97 ^ (0x7E ^ 0x68) ^ -" ".length()))) {
                        return;
                    }
                }
                else {
                    this.sendQueue.addToSendQueue(new C03PacketPlayer(this.onGround));
                    "".length();
                    if ((157 + 187 - 167 + 11 ^ 3 + 145 - 41 + 77) <= -" ".length()) {
                        return;
                    }
                }
            }
            else {
                this.sendQueue.addToSendQueue(new C03PacketPlayer.C06PacketPlayerPosLook(this.motionX, -999.0, this.motionZ, this.rotationYaw, this.rotationPitch, this.onGround));
                lllllllllllllIlIIIlIIIIIlllIIllI = (EntityPlayerSP.lIIIlIlIIIlIll[0] != 0);
            }
            this.positionUpdateTicks += EntityPlayerSP.lIIIlIlIIIlIll[2];
            if (llIIIIIIIllIlII(lllllllllllllIlIIIlIIIIIlllIIllI ? 1 : 0)) {
                this.lastReportedPosX = this.posX;
                this.lastReportedPosY = this.getEntityBoundingBox().minY;
                this.lastReportedPosZ = this.posZ;
                this.positionUpdateTicks = EntityPlayerSP.lIIIlIlIIIlIll[0];
            }
            if (llIIIIIIIllIlII(lllllllllllllIlIIIlIIIIIlllIIlIl ? 1 : 0)) {
                this.lastReportedYaw = this.rotationYaw;
                this.lastReportedPitch = this.rotationPitch;
            }
        }
    }
    
    private static boolean llIIIIIIIlllIIl(final int lllllllllllllIlIIIIllllllIIIIllI) {
        return lllllllllllllIlIIIIllllllIIIIllI == 0;
    }
    
    @Override
    public void displayGui(final IInteractionObject lllllllllllllIlIIIlIIIIIIIIIIlII) {
        final String lllllllllllllIlIIIlIIIIIIIIIIIll = lllllllllllllIlIIIlIIIIIIIIIIlII.getGuiID();
        if (llIIIIIIIllIlII(EntityPlayerSP.lIIIlIlIIIlIlI[EntityPlayerSP.lIIIlIlIIIlIll[12]].equals(lllllllllllllIlIIIlIIIIIIIIIIIll) ? 1 : 0)) {
            this.mc.displayGuiScreen(new GuiCrafting(this.inventory, this.worldObj));
            "".length();
            if (((0x46 ^ 0x77) & ~(0xA1 ^ 0x90)) != 0x0) {
                return;
            }
        }
        else if (llIIIIIIIllIlII(EntityPlayerSP.lIIIlIlIIIlIlI[EntityPlayerSP.lIIIlIlIIIlIll[13]].equals(lllllllllllllIlIIIlIIIIIIIIIIIll) ? 1 : 0)) {
            this.mc.displayGuiScreen(new GuiEnchantment(this.inventory, this.worldObj, lllllllllllllIlIIIlIIIIIIIIIIlII));
            "".length();
            if (((0x43 ^ 0x70) & ~(0xF5 ^ 0xC6)) == " ".length()) {
                return;
            }
        }
        else if (llIIIIIIIllIlII(EntityPlayerSP.lIIIlIlIIIlIlI[EntityPlayerSP.lIIIlIlIIIlIll[4]].equals(lllllllllllllIlIIIlIIIIIIIIIIIll) ? 1 : 0)) {
            this.mc.displayGuiScreen(new GuiRepair(this.inventory, this.worldObj));
        }
    }
    
    public void sendChatMessage(final String lllllllllllllIlIIIlIIIIIllIIlIlI) {
        this.sendQueue.addToSendQueue(new C01PacketChatMessage(lllllllllllllIlIIIlIIIIIllIIlIlI));
    }
    
    private static boolean llIIIIIIlIIIIll(final int lllllllllllllIlIIIIlllllIllllllI) {
        return lllllllllllllIlIIIIlllllIllllllI > 0;
    }
    
    @Override
    public boolean isUser() {
        return EntityPlayerSP.lIIIlIlIIIlIll[2] != 0;
    }
    
    public void closeScreen() {
        this.sendQueue.addToSendQueue(new C0DPacketCloseWindow(this.openContainer.windowId));
        this.closeScreenAndDropStack();
    }
    
    public boolean isRidingHorse() {
        if (llIIIIIIIllllIl(this.ridingEntity) && llIIIIIIIllIlII((this.ridingEntity instanceof EntityHorse) ? 1 : 0) && llIIIIIIIllIlII(((EntityHorse)this.ridingEntity).isHorseSaddled() ? 1 : 0)) {
            return EntityPlayerSP.lIIIlIlIIIlIll[2] != 0;
        }
        return EntityPlayerSP.lIIIlIlIIIlIll[0] != 0;
    }
    
    private static boolean llIIIIIIIllIlII(final int lllllllllllllIlIIIIllllllIIIlIII) {
        return lllllllllllllIlIIIIllllllIIIlIII != 0;
    }
    
    @Override
    protected void joinEntityItemWithWorld(final EntityItem lllllllllllllIlIIIlIIIIIllIlIIII) {
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource lllllllllllllIlIIIlIIIIlIIIIlIII, final float lllllllllllllIlIIIlIIIIlIIIIIlll) {
        return EntityPlayerSP.lIIIlIlIIIlIll[0] != 0;
    }
    
    private static int llIIIIIIlIIIIlI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public void onEnchantmentCritical(final Entity lllllllllllllIlIIIIlllllllllIIII) {
        this.mc.effectRenderer.emitParticleAtEntity(lllllllllllllIlIIIIlllllllllIIII, EnumParticleTypes.CRIT_MAGIC);
    }
    
    static {
        llIIIIIIIllIIll();
        llIIIIIIIllIIlI();
    }
    
    private boolean isOpenBlockSpace(final BlockPos lllllllllllllIlIIIlIIIIIIllIIlIl) {
        if (llIIIIIIIlllIIl(this.worldObj.getBlockState(lllllllllllllIlIIIlIIIIIIllIIlIl).getBlock().isNormalCube() ? 1 : 0) && llIIIIIIIlllIIl(this.worldObj.getBlockState(lllllllllllllIlIIIlIIIIIIllIIlIl.up()).getBlock().isNormalCube() ? 1 : 0)) {
            return EntityPlayerSP.lIIIlIlIIIlIll[2] != 0;
        }
        return EntityPlayerSP.lIIIlIlIIIlIll[0] != 0;
    }
    
    private static int llIIIIIIIlllIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public void setPlayerSPHealth(final float lllllllllllllIlIIIlIIIIIlIlIllIl) {
        if (llIIIIIIIllIlII(this.hasValidHealth ? 1 : 0)) {
            final float lllllllllllllIlIIIlIIIIIlIlIllll = this.getHealth() - lllllllllllllIlIIIlIIIIIlIlIllIl;
            if (llIIIIIIIllIlll(llIIIIIIIlllIll(lllllllllllllIlIIIlIIIIIlIlIllll, 0.0f))) {
                this.setHealth(lllllllllllllIlIIIlIIIIIlIlIllIl);
                if (llIIIIIIIllllII(llIIIIIIIlllIll(lllllllllllllIlIIIlIIIIIlIlIllll, 0.0f))) {
                    this.hurtResistantTime = this.maxHurtResistantTime / EntityPlayerSP.lIIIlIlIIIlIll[3];
                    "".length();
                    if ("  ".length() <= -" ".length()) {
                        return;
                    }
                }
            }
            else {
                this.lastDamage = lllllllllllllIlIIIlIIIIIlIlIllll;
                this.setHealth(this.getHealth());
                this.hurtResistantTime = this.maxHurtResistantTime;
                this.damageEntity(DamageSource.generic, lllllllllllllIlIIIlIIIIIlIlIllll);
                final int n = EntityPlayerSP.lIIIlIlIIIlIll[4];
                this.maxHurtTime = n;
                this.hurtTime = n;
                "".length();
                if ((0xBB ^ 0xBF) <= "   ".length()) {
                    return;
                }
            }
        }
        else {
            this.setHealth(lllllllllllllIlIIIlIIIIIlIlIllIl);
            this.hasValidHealth = (EntityPlayerSP.lIIIlIlIIIlIll[2] != 0);
        }
    }
}
