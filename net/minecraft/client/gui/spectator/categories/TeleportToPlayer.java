// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui.spectator.categories;

import java.util.Iterator;
import net.minecraft.client.gui.spectator.PlayerMenuObject;
import net.minecraft.world.WorldSettings;
import com.google.common.collect.Lists;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiSpectator;
import java.util.Collection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.spectator.SpectatorMenu;
import com.google.common.collect.ComparisonChain;
import java.util.Comparator;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.client.network.NetworkPlayerInfo;
import com.google.common.collect.Ordering;
import java.util.List;
import net.minecraft.client.gui.spectator.ISpectatorMenuObject;
import net.minecraft.client.gui.spectator.ISpectatorMenuView;

public class TeleportToPlayer implements ISpectatorMenuView, ISpectatorMenuObject
{
    private static final /* synthetic */ String[] lIIIIIlIlIllII;
    private final /* synthetic */ List<ISpectatorMenuObject> field_178673_b;
    private static final /* synthetic */ int[] lIIIIIllIIllll;
    private static final /* synthetic */ Ordering<NetworkPlayerInfo> field_178674_a;
    
    private static void lIllIllIIlIllll() {
        (lIIIIIlIlIllII = new String[TeleportToPlayer.lIIIIIllIIllll[3]])[TeleportToPlayer.lIIIIIllIIllll[0]] = lIllIllIIlIlllI("d7/2FmIZJPO3YFf9HnIqoVz9ovJa51JjxKsSqcDq3T4=", "efYuv");
        TeleportToPlayer.lIIIIIlIlIllII[TeleportToPlayer.lIIIIIllIIllll[1]] = lIllIllIIlIlllI("6Lu0zkKPfyDup/quOQVJdVVZ9Zehw51X", "nBWKA");
    }
    
    @Override
    public IChatComponent func_178670_b() {
        return new ChatComponentText(TeleportToPlayer.lIIIIIlIlIllII[TeleportToPlayer.lIIIIIllIIllll[0]]);
    }
    
    private static String lIllIllIIlIlllI(final String lllllllllllllIlIIllIllllIIllIllI, final String lllllllllllllIlIIllIllllIIllIlll) {
        try {
            final SecretKeySpec lllllllllllllIlIIllIllllIIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIllllIIllIlll.getBytes(StandardCharsets.UTF_8)), TeleportToPlayer.lIIIIIllIIllll[4]), "DES");
            final Cipher lllllllllllllIlIIllIllllIIlllIlI = Cipher.getInstance("DES");
            lllllllllllllIlIIllIllllIIlllIlI.init(TeleportToPlayer.lIIIIIllIIllll[3], lllllllllllllIlIIllIllllIIlllIll);
            return new String(lllllllllllllIlIIllIllllIIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIllllIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllIllllIIlllIIl) {
            lllllllllllllIlIIllIllllIIlllIIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lIllIlllIIIlIIl();
        lIllIllIIlIllll();
        field_178674_a = Ordering.from((Comparator)new Comparator<NetworkPlayerInfo>() {
            @Override
            public int compare(final NetworkPlayerInfo lllllllllllllIIllllllIlIIlllIlll, final NetworkPlayerInfo lllllllllllllIIllllllIlIIlllIllI) {
                return ComparisonChain.start().compare((Comparable)lllllllllllllIIllllllIlIIlllIlll.getGameProfile().getId(), (Comparable)lllllllllllllIIllllllIlIIlllIllI.getGameProfile().getId()).result();
            }
        });
    }
    
    private static boolean lIllIlllIIIlIll(final int lllllllllllllIlIIllIllllIIlIlIll) {
        return lllllllllllllIlIIllIllllIIlIlIll == 0;
    }
    
    @Override
    public void func_178661_a(final SpectatorMenu lllllllllllllIlIIllIllllIlIIlIIl) {
        lllllllllllllIlIIllIllllIlIIlIIl.func_178647_a(this);
    }
    
    private static boolean lIllIlllIIIllII(final int lllllllllllllIlIIllIllllIIlIllIl) {
        return lllllllllllllIlIIllIllllIIlIllIl != 0;
    }
    
    private static boolean lIllIlllIIIlIlI(final Object lllllllllllllIlIIllIllllIIllIIII, final Object lllllllllllllIlIIllIllllIIlIllll) {
        return lllllllllllllIlIIllIllllIIllIIII != lllllllllllllIlIIllIllllIIlIllll;
    }
    
    public TeleportToPlayer() {
        this(TeleportToPlayer.field_178674_a.sortedCopy((Iterable)Minecraft.getMinecraft().getNetHandler().getPlayerInfoMap()));
    }
    
    @Override
    public void func_178663_a(final float lllllllllllllIlIIllIllllIlIIIlII, final int lllllllllllllIlIIllIllllIlIIIIll) {
        Minecraft.getMinecraft().getTextureManager().bindTexture(GuiSpectator.field_175269_a);
        Gui.drawModalRectWithCustomSizedTexture(TeleportToPlayer.lIIIIIllIIllll[0], TeleportToPlayer.lIIIIIllIIllll[0], 0.0f, 0.0f, TeleportToPlayer.lIIIIIllIIllll[2], TeleportToPlayer.lIIIIIllIIllll[2], 256.0f, 256.0f);
    }
    
    @Override
    public List<ISpectatorMenuObject> func_178669_a() {
        return this.field_178673_b;
    }
    
    @Override
    public boolean func_178662_A_() {
        int n;
        if (lIllIlllIIIllII(this.field_178673_b.isEmpty() ? 1 : 0)) {
            n = TeleportToPlayer.lIIIIIllIIllll[0];
            "".length();
            if (-(0x5E ^ 0x5A) > 0) {
                return ((0xA5 ^ 0x8E) & ~(0x9A ^ 0xB1)) != 0x0;
            }
        }
        else {
            n = TeleportToPlayer.lIIIIIllIIllll[1];
        }
        return n != 0;
    }
    
    private static void lIllIlllIIIlIIl() {
        (lIIIIIllIIllll = new int[5])[0] = ((0x23 ^ 0x62 ^ (0xD2 ^ 0xC7)) & (0x89 ^ 0x99 ^ (0x26 ^ 0x62) ^ -" ".length()));
        TeleportToPlayer.lIIIIIllIIllll[1] = " ".length();
        TeleportToPlayer.lIIIIIllIIllll[2] = (46 + 0 + 45 + 50 ^ 6 + 102 + 28 + 21);
        TeleportToPlayer.lIIIIIllIIllll[3] = "  ".length();
        TeleportToPlayer.lIIIIIllIIllll[4] = (0xB8 ^ 0xA1 ^ (0x1D ^ 0xC));
    }
    
    public TeleportToPlayer(final Collection<NetworkPlayerInfo> lllllllllllllIlIIllIllllIlIlIllI) {
        this.field_178673_b = (List<ISpectatorMenuObject>)Lists.newArrayList();
        final short lllllllllllllIlIIllIllllIlIlIIIl = (short)TeleportToPlayer.field_178674_a.sortedCopy((Iterable)lllllllllllllIlIIllIllllIlIlIllI).iterator();
        "".length();
        if ("  ".length() >= "   ".length()) {
            throw null;
        }
        while (!lIllIlllIIIlIll(((Iterator)lllllllllllllIlIIllIllllIlIlIIIl).hasNext() ? 1 : 0)) {
            final NetworkPlayerInfo lllllllllllllIlIIllIllllIlIlIlIl = ((Iterator<NetworkPlayerInfo>)lllllllllllllIlIIllIllllIlIlIIIl).next();
            if (lIllIlllIIIlIlI(lllllllllllllIlIIllIllllIlIlIlIl.getGameType(), WorldSettings.GameType.SPECTATOR)) {
                this.field_178673_b.add(new PlayerMenuObject(lllllllllllllIlIIllIllllIlIlIlIl.getGameProfile()));
                "".length();
            }
        }
    }
    
    @Override
    public IChatComponent getSpectatorName() {
        return new ChatComponentText(TeleportToPlayer.lIIIIIlIlIllII[TeleportToPlayer.lIIIIIllIIllll[1]]);
    }
}
