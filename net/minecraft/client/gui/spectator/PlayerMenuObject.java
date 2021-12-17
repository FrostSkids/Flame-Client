// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui.spectator;

import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C18PacketSpectate;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.util.ResourceLocation;
import com.mojang.authlib.GameProfile;

public class PlayerMenuObject implements ISpectatorMenuObject
{
    private final /* synthetic */ GameProfile profile;
    private static final /* synthetic */ int[] llIIlIIIIllIII;
    private final /* synthetic */ ResourceLocation resourceLocation;
    
    public PlayerMenuObject(final GameProfile llllllllllllIlllIIllIIllIlIIIlll) {
        this.profile = llllllllllllIlllIIllIIllIlIIIlll;
        this.resourceLocation = AbstractClientPlayer.getLocationSkin(llllllllllllIlllIIllIIllIlIIIlll.getName());
        AbstractClientPlayer.getDownloadImageSkin(this.resourceLocation, llllllllllllIlllIIllIIllIlIIIlll.getName());
        "".length();
    }
    
    @Override
    public void func_178661_a(final SpectatorMenu llllllllllllIlllIIllIIllIlIIIlII) {
        Minecraft.getMinecraft().getNetHandler().addToSendQueue(new C18PacketSpectate(this.profile.getId()));
    }
    
    @Override
    public boolean func_178662_A_() {
        return PlayerMenuObject.llIIlIIIIllIII[3] != 0;
    }
    
    @Override
    public IChatComponent getSpectatorName() {
        return new ChatComponentText(this.profile.getName());
    }
    
    static {
        lIIIlIlllIlIllll();
    }
    
    @Override
    public void func_178663_a(final float llllllllllllIlllIIllIIllIIllllII, final int llllllllllllIlllIIllIIllIIlllIIl) {
        Minecraft.getMinecraft().getTextureManager().bindTexture(this.resourceLocation);
        GlStateManager.color(1.0f, 1.0f, 1.0f, llllllllllllIlllIIllIIllIIlllIIl / 255.0f);
        Gui.drawScaledCustomSizeModalRect(PlayerMenuObject.llIIlIIIIllIII[0], PlayerMenuObject.llIIlIIIIllIII[0], 8.0f, 8.0f, PlayerMenuObject.llIIlIIIIllIII[1], PlayerMenuObject.llIIlIIIIllIII[1], PlayerMenuObject.llIIlIIIIllIII[2], PlayerMenuObject.llIIlIIIIllIII[2], 64.0f, 64.0f);
        Gui.drawScaledCustomSizeModalRect(PlayerMenuObject.llIIlIIIIllIII[0], PlayerMenuObject.llIIlIIIIllIII[0], 40.0f, 8.0f, PlayerMenuObject.llIIlIIIIllIII[1], PlayerMenuObject.llIIlIIIIllIII[1], PlayerMenuObject.llIIlIIIIllIII[2], PlayerMenuObject.llIIlIIIIllIII[2], 64.0f, 64.0f);
    }
    
    private static void lIIIlIlllIlIllll() {
        (llIIlIIIIllIII = new int[4])[0] = "  ".length();
        PlayerMenuObject.llIIlIIIIllIII[1] = (0xF7 ^ 0xB3 ^ (0x35 ^ 0x79));
        PlayerMenuObject.llIIlIIIIllIII[2] = (0x3 ^ 0xF);
        PlayerMenuObject.llIIlIIIIllIII[3] = " ".length();
    }
}
