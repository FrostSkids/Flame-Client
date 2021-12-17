// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.entity;

import com.mojang.authlib.GameProfile;
import net.minecraft.world.World;
import net.minecraft.client.Minecraft;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.DamageSource;
import net.minecraft.util.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

public class EntityOtherPlayerMP extends AbstractClientPlayer
{
    private /* synthetic */ int otherPlayerMPPosRotationIncrements;
    private /* synthetic */ double otherPlayerMPY;
    private /* synthetic */ double otherPlayerMPYaw;
    private /* synthetic */ boolean isItemInUse;
    private /* synthetic */ double otherPlayerMPPitch;
    private /* synthetic */ double otherPlayerMPX;
    private static final /* synthetic */ int[] llIIIllIIllIIl;
    private /* synthetic */ double otherPlayerMPZ;
    
    private static void lIIIlIlIIlIIlIIl() {
        (llIIIllIIllIIl = new int[2])[0] = " ".length();
        EntityOtherPlayerMP.llIIIllIIllIIl[1] = ((0xF3 ^ 0x98 ^ (0x85 ^ 0xBA)) & (121 + 142 - 76 + 14 ^ 53 + 95 - 137 + 146 ^ -" ".length()));
    }
    
    @Override
    public void onUpdate() {
        this.renderOffsetY = 0.0f;
        super.onUpdate();
        this.prevLimbSwingAmount = this.limbSwingAmount;
        final double llllllllllllIlllIlIIlIllIlIlIllI = this.posX - this.prevPosX;
        final double llllllllllllIlllIlIIlIllIlIlIlII = this.posZ - this.prevPosZ;
        float llllllllllllIlllIlIIlIllIlIlIIlI = MathHelper.sqrt_double(llllllllllllIlllIlIIlIllIlIlIllI * llllllllllllIlllIlIIlIllIlIlIllI + llllllllllllIlllIlIIlIllIlIlIlII * llllllllllllIlllIlIIlIllIlIlIlII) * 4.0f;
        if (lIIIlIlIIlIIllII(lIIIlIlIIlIIlIll(llllllllllllIlllIlIIlIllIlIlIIlI, 1.0f))) {
            llllllllllllIlllIlIIlIllIlIlIIlI = 1.0f;
        }
        this.limbSwingAmount += (llllllllllllIlllIlIIlIllIlIlIIlI - this.limbSwingAmount) * 0.4f;
        this.limbSwing += this.limbSwingAmount;
        if (lIIIlIlIIlIIllIl(this.isItemInUse ? 1 : 0) && lIIIlIlIIlIIlllI(this.isEating() ? 1 : 0) && lIIIlIlIIlIIllll(this.inventory.mainInventory[this.inventory.currentItem])) {
            final ItemStack llllllllllllIlllIlIIlIllIlIlIIII = this.inventory.mainInventory[this.inventory.currentItem];
            this.setItemInUse(this.inventory.mainInventory[this.inventory.currentItem], llllllllllllIlllIlIIlIllIlIlIIII.getItem().getMaxItemUseDuration(llllllllllllIlllIlIIlIllIlIlIIII));
            this.isItemInUse = (EntityOtherPlayerMP.llIIIllIIllIIl[0] != 0);
            "".length();
            if (((0x16 ^ 0x1C ^ (0x88 ^ 0x91)) & (0xE7 ^ 0x87 ^ (0x7C ^ 0xF) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else if (lIIIlIlIIlIIlllI(this.isItemInUse ? 1 : 0) && lIIIlIlIIlIIllIl(this.isEating() ? 1 : 0)) {
            this.clearItemInUse();
            this.isItemInUse = (EntityOtherPlayerMP.llIIIllIIllIIl[1] != 0);
        }
    }
    
    private static int lIIIlIlIIlIlIIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public BlockPos getPosition() {
        return new BlockPos(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5);
    }
    
    private static int lIIIlIlIIlIlIIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIIIlIlIIlIlIlIl(final int llllllllllllIlllIlIIlIllIIIIllll) {
        return llllllllllllIlllIlIIlIllIIIIllll < 0;
    }
    
    private static int lIIIlIlIIlIlIIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static int lIIIlIlIIlIlIIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIIIlIlIIlIIllII(final int llllllllllllIlllIlIIlIllIIIIlIll) {
        return llllllllllllIlllIlIIlIllIIIIlIll > 0;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource llllllllllllIlllIlIIlIlllIIlIlII, final float llllllllllllIlllIlIIlIlllIIlIIll) {
        return EntityOtherPlayerMP.llIIIllIIllIIl[0] != 0;
    }
    
    private static boolean lIIIlIlIIlIIllll(final Object llllllllllllIlllIlIIlIllIIIlIlll) {
        return llllllllllllIlllIlIIlIllIIIlIlll != null;
    }
    
    @Override
    public void onLivingUpdate() {
        if (lIIIlIlIIlIIllII(this.otherPlayerMPPosRotationIncrements)) {
            final double llllllllllllIlllIlIIlIllIIllIlll = this.posX + (this.otherPlayerMPX - this.posX) / this.otherPlayerMPPosRotationIncrements;
            final double llllllllllllIlllIlIIlIllIIllIllI = this.posY + (this.otherPlayerMPY - this.posY) / this.otherPlayerMPPosRotationIncrements;
            final double llllllllllllIlllIlIIlIllIIllIlIl = this.posZ + (this.otherPlayerMPZ - this.posZ) / this.otherPlayerMPPosRotationIncrements;
            double llllllllllllIlllIlIIlIllIIllIlII = this.otherPlayerMPYaw - this.rotationYaw;
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIIlIlIIlIlIlII(lIIIlIlIIlIlIIII(llllllllllllIlllIlIIlIllIIllIlII, -180.0))) {
                llllllllllllIlllIlIIlIllIIllIlII += 360.0;
            }
            "".length();
            if ("   ".length() < 0) {
                return;
            }
            while (!lIIIlIlIIlIlIlIl(lIIIlIlIIlIlIIIl(llllllllllllIlllIlIIlIllIIllIlII, 180.0))) {
                llllllllllllIlllIlIIlIllIIllIlII -= 360.0;
            }
            this.rotationYaw += (float)(llllllllllllIlllIlIIlIllIIllIlII / this.otherPlayerMPPosRotationIncrements);
            this.rotationPitch += (float)((this.otherPlayerMPPitch - this.rotationPitch) / this.otherPlayerMPPosRotationIncrements);
            this.otherPlayerMPPosRotationIncrements -= EntityOtherPlayerMP.llIIIllIIllIIl[0];
            this.setPosition(llllllllllllIlllIlIIlIllIIllIlll, llllllllllllIlllIlIIlIllIIllIllI, llllllllllllIlllIlIIlIllIIllIlIl);
            this.setRotation(this.rotationYaw, this.rotationPitch);
        }
        this.prevCameraYaw = this.cameraYaw;
        this.updateArmSwingProgress();
        float llllllllllllIlllIlIIlIllIIllIIll = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
        float llllllllllllIlllIlIIlIllIIllIIlI = (float)Math.atan(-this.motionY * 0.20000000298023224) * 15.0f;
        if (lIIIlIlIIlIIllII(lIIIlIlIIlIlIIlI(llllllllllllIlllIlIIlIllIIllIIll, 0.1f))) {
            llllllllllllIlllIlIIlIllIIllIIll = 0.1f;
        }
        if (!lIIIlIlIIlIIlllI(this.onGround ? 1 : 0) || lIIIlIlIIlIlIllI(lIIIlIlIIlIlIIll(this.getHealth(), 0.0f))) {
            llllllllllllIlllIlIIlIllIIllIIll = 0.0f;
        }
        if (!lIIIlIlIIlIIllIl(this.onGround ? 1 : 0) || lIIIlIlIIlIlIllI(lIIIlIlIIlIlIIll(this.getHealth(), 0.0f))) {
            llllllllllllIlllIlIIlIllIIllIIlI = 0.0f;
        }
        this.cameraYaw += (llllllllllllIlllIlIIlIllIIllIIll - this.cameraYaw) * 0.4f;
        this.cameraPitch += (llllllllllllIlllIlIIlIllIIllIIlI - this.cameraPitch) * 0.8f;
    }
    
    @Override
    public void setPositionAndRotation2(final double llllllllllllIlllIlIIlIlllIIIIlII, final double llllllllllllIlllIlIIlIlllIIIIIlI, final double llllllllllllIlllIlIIlIllIlllIIII, final float llllllllllllIlllIlIIlIllIllllllI, final float llllllllllllIlllIlIIlIllIllIlllI, final int llllllllllllIlllIlIIlIllIllIllIl, final boolean llllllllllllIlllIlIIlIllIlllIlll) {
        this.otherPlayerMPX = llllllllllllIlllIlIIlIlllIIIIlII;
        this.otherPlayerMPY = llllllllllllIlllIlIIlIlllIIIIIlI;
        this.otherPlayerMPZ = llllllllllllIlllIlIIlIllIlllIIII;
        this.otherPlayerMPYaw = llllllllllllIlllIlIIlIllIllllllI;
        this.otherPlayerMPPitch = llllllllllllIlllIlIIlIllIllIlllI;
        this.otherPlayerMPPosRotationIncrements = llllllllllllIlllIlIIlIllIllIllIl;
    }
    
    private static boolean lIIIlIlIIlIlIllI(final int llllllllllllIlllIlIIlIllIIIIllIl) {
        return llllllllllllIlllIlIIlIllIIIIllIl <= 0;
    }
    
    @Override
    public void addChatMessage(final IChatComponent llllllllllllIlllIlIIlIllIIIlllll) {
        Minecraft.getMinecraft().ingameGUI.getChatGUI().printChatMessage(llllllllllllIlllIlIIlIllIIIlllll);
    }
    
    static {
        lIIIlIlIIlIIlIIl();
    }
    
    public EntityOtherPlayerMP(final World llllllllllllIlllIlIIlIlllIIllIIl, final GameProfile llllllllllllIlllIlIIlIlllIIllIII) {
        super(llllllllllllIlllIlIIlIlllIIllIIl, llllllllllllIlllIlIIlIlllIIllIII);
        this.stepHeight = 0.0f;
        this.noClip = (EntityOtherPlayerMP.llIIIllIIllIIl[0] != 0);
        this.renderOffsetY = 0.25f;
        this.renderDistanceWeight = 10.0;
    }
    
    private static boolean lIIIlIlIIlIlIlII(final int llllllllllllIlllIlIIlIllIIIlIIIl) {
        return llllllllllllIlllIlIIlIllIIIlIIIl >= 0;
    }
    
    private static boolean lIIIlIlIIlIIllIl(final int llllllllllllIlllIlIIlIllIIIlIIll) {
        return llllllllllllIlllIlIIlIllIIIlIIll == 0;
    }
    
    @Override
    public boolean canCommandSenderUseCommand(final int llllllllllllIlllIlIIlIllIIIlllIl, final String llllllllllllIlllIlIIlIllIIIlllII) {
        return EntityOtherPlayerMP.llIIIllIIllIIl[1] != 0;
    }
    
    private static boolean lIIIlIlIIlIIlllI(final int llllllllllllIlllIlIIlIllIIIlIlIl) {
        return llllllllllllIlllIlIIlIllIIIlIlIl != 0;
    }
    
    private static int lIIIlIlIIlIIlIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public void setCurrentItemOrArmor(final int llllllllllllIlllIlIIlIllIIlIIlII, final ItemStack llllllllllllIlllIlIIlIllIIlIIIll) {
        if (lIIIlIlIIlIIllIl(llllllllllllIlllIlIIlIllIIlIIlII)) {
            this.inventory.mainInventory[this.inventory.currentItem] = llllllllllllIlllIlIIlIllIIlIIIll;
            "".length();
            if (" ".length() == ((0x7B ^ 0x62 ^ (0xA2 ^ 0xB7)) & (128 + 102 - 199 + 146 ^ 140 + 62 - 104 + 91 ^ -" ".length()))) {
                return;
            }
        }
        else {
            this.inventory.armorInventory[llllllllllllIlllIlIIlIllIIlIIlII - EntityOtherPlayerMP.llIIIllIIllIIl[0]] = llllllllllllIlllIlIIlIllIIlIIIll;
        }
    }
}
