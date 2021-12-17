// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.tileentity;

import net.minecraft.init.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.EnumFacing;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import java.util.UUID;
import com.mojang.authlib.GameProfile;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.tileentity.TileEntityBanner;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntitySkull;

public class TileEntityItemStackRenderer
{
    private /* synthetic */ TileEntitySkull skull;
    private /* synthetic */ TileEntityChest field_147718_c;
    private static final /* synthetic */ int[] llllllIIlllll;
    private static final /* synthetic */ String[] llllllIIllllI;
    public static /* synthetic */ TileEntityItemStackRenderer instance;
    private /* synthetic */ TileEntityEnderChest enderChest;
    private /* synthetic */ TileEntityBanner banner;
    private /* synthetic */ TileEntityChest field_147717_b;
    
    private static void lIllIIIIIIIIlll() {
        (llllllIIlllll = new int[11])[0] = ((0x82 ^ 0x88) & ~(0x3A ^ 0x30) & ~((0x7C ^ 0x76) & ~(0xD ^ 0x7)));
        TileEntityItemStackRenderer.llllllIIlllll[1] = " ".length();
        TileEntityItemStackRenderer.llllllIIlllll[2] = (0x6B ^ 0x63 ^ "  ".length());
        TileEntityItemStackRenderer.llllllIIlllll[3] = "  ".length();
        TileEntityItemStackRenderer.llllllIIlllll[4] = (0x90 ^ 0x98);
        TileEntityItemStackRenderer.llllllIIlllll[5] = "   ".length();
        TileEntityItemStackRenderer.llllllIIlllll[6] = (100 + 44 - 0 + 4 ^ 67 + 24 - 50 + 103);
        TileEntityItemStackRenderer.llllllIIlllll[7] = (0x75 ^ 0x3E ^ (0xC9 ^ 0x87));
        TileEntityItemStackRenderer.llllllIIlllll[8] = (0x20 ^ 0x27 ^ " ".length());
        TileEntityItemStackRenderer.llllllIIlllll[9] = -" ".length();
        TileEntityItemStackRenderer.llllllIIlllll[10] = ("  ".length() ^ (0x15 ^ 0x10));
    }
    
    private static void lIllIIIIIIIIlIl() {
        (llllllIIllllI = new String[TileEntityItemStackRenderer.llllllIIlllll[10]])[TileEntityItemStackRenderer.llllllIIlllll[0]] = lIllIIIIIIIIIIl("i1MHdjtj3U4HTkyTHQP0sA==", "OngjV");
        TileEntityItemStackRenderer.llllllIIllllI[TileEntityItemStackRenderer.llllllIIlllll[1]] = lIllIIIIIIIIIIl("ZgGAtQ15+6J2KGPmtOdPlQ==", "DOiIM");
        TileEntityItemStackRenderer.llllllIIllllI[TileEntityItemStackRenderer.llllllIIlllll[3]] = lIllIIIIIIIIIll("KxwlKCI3AD4hPA==", "xwPDN");
        TileEntityItemStackRenderer.llllllIIllllI[TileEntityItemStackRenderer.llllllIIlllll[5]] = lIllIIIIIIIIlII("Iz0YZ68wHdpgVnx4FUty0w==", "jgkwq");
        TileEntityItemStackRenderer.llllllIIllllI[TileEntityItemStackRenderer.llllllIIlllll[6]] = lIllIIIIIIIIIll("Jj4iKC06IjkhMw==", "uUWDA");
        TileEntityItemStackRenderer.llllllIIllllI[TileEntityItemStackRenderer.llllllIIlllll[7]] = lIllIIIIIIIIIIl("T4NSNH8SESoeNUjc+iABZA==", "KQRMv");
        TileEntityItemStackRenderer.llllllIIllllI[TileEntityItemStackRenderer.llllllIIlllll[8]] = lIllIIIIIIIIlII("R+EJc/i1wRO/DySZLZwCGQ==", "IQdut");
    }
    
    static {
        lIllIIIIIIIIlll();
        lIllIIIIIIIIlIl();
        TileEntityItemStackRenderer.instance = new TileEntityItemStackRenderer();
    }
    
    public TileEntityItemStackRenderer() {
        this.field_147717_b = new TileEntityChest(TileEntityItemStackRenderer.llllllIIlllll[0]);
        this.field_147718_c = new TileEntityChest(TileEntityItemStackRenderer.llllllIIlllll[1]);
        this.enderChest = new TileEntityEnderChest();
        this.banner = new TileEntityBanner();
        this.skull = new TileEntitySkull();
    }
    
    private static String lIllIIIIIIIIIll(String lllllllllllllIlIlIlIlIIlIlIlIIll, final String lllllllllllllIlIlIlIlIIlIlIlIlll) {
        lllllllllllllIlIlIlIlIIlIlIlIIll = new String(Base64.getDecoder().decode(lllllllllllllIlIlIlIlIIlIlIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIlIlIIlIlIlIllI = new StringBuilder();
        final char[] lllllllllllllIlIlIlIlIIlIlIlIlIl = lllllllllllllIlIlIlIlIIlIlIlIlll.toCharArray();
        int lllllllllllllIlIlIlIlIIlIlIlIlII = TileEntityItemStackRenderer.llllllIIlllll[0];
        final long lllllllllllllIlIlIlIlIIlIlIIlllI = (Object)lllllllllllllIlIlIlIlIIlIlIlIIll.toCharArray();
        final byte lllllllllllllIlIlIlIlIIlIlIIllIl = (byte)lllllllllllllIlIlIlIlIIlIlIIlllI.length;
        Exception lllllllllllllIlIlIlIlIIlIlIIllII = (Exception)TileEntityItemStackRenderer.llllllIIlllll[0];
        while (lIllIIIIIIIllII((int)lllllllllllllIlIlIlIlIIlIlIIllII, lllllllllllllIlIlIlIlIIlIlIIllIl)) {
            final char lllllllllllllIlIlIlIlIIlIlIllIIl = lllllllllllllIlIlIlIlIIlIlIIlllI[lllllllllllllIlIlIlIlIIlIlIIllII];
            lllllllllllllIlIlIlIlIIlIlIlIllI.append((char)(lllllllllllllIlIlIlIlIIlIlIllIIl ^ lllllllllllllIlIlIlIlIIlIlIlIlIl[lllllllllllllIlIlIlIlIIlIlIlIlII % lllllllllllllIlIlIlIlIIlIlIlIlIl.length]));
            "".length();
            ++lllllllllllllIlIlIlIlIIlIlIlIlII;
            ++lllllllllllllIlIlIlIlIIlIlIIllII;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIlIlIIlIlIlIllI);
    }
    
    private static boolean lIllIIIIIIIlIII(final Object lllllllllllllIlIlIlIlIIlIlIIIlII, final Object lllllllllllllIlIlIlIlIIlIlIIIIll) {
        return lllllllllllllIlIlIlIlIIlIlIIIlII == lllllllllllllIlIlIlIlIIlIlIIIIll;
    }
    
    private static String lIllIIIIIIIIIIl(final String lllllllllllllIlIlIlIlIIlIlllIIll, final String lllllllllllllIlIlIlIlIIlIlllIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlIlIIlIllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIlIIlIlllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIlIlIIlIlllIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIlIlIIlIlllIlll.init(TileEntityItemStackRenderer.llllllIIlllll[3], lllllllllllllIlIlIlIlIIlIllllIII);
            return new String(lllllllllllllIlIlIlIlIIlIlllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIlIIlIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlIlIIlIlllIllI) {
            lllllllllllllIlIlIlIlIIlIlllIllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIIIIIIIlIlI(final int lllllllllllllIlIlIlIlIIlIIllllIl) {
        return lllllllllllllIlIlIlIlIIlIIllllIl > 0;
    }
    
    private static boolean lIllIIIIIIIlIIl(final int lllllllllllllIlIlIlIlIIlIIllllll) {
        return lllllllllllllIlIlIlIlIIlIIllllll != 0;
    }
    
    private static boolean lIllIIIIIIIllII(final int lllllllllllllIlIlIlIlIIlIlIIlIII, final int lllllllllllllIlIlIlIlIIlIlIIIlll) {
        return lllllllllllllIlIlIlIlIIlIlIIlIII < lllllllllllllIlIlIlIlIIlIlIIIlll;
    }
    
    private static String lIllIIIIIIIIlII(final String lllllllllllllIlIlIlIlIIlIllIIllI, final String lllllllllllllIlIlIlIlIIlIllIIlll) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlIlIIlIllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIlIIlIllIIlll.getBytes(StandardCharsets.UTF_8)), TileEntityItemStackRenderer.llllllIIlllll[4]), "DES");
            final Cipher lllllllllllllIlIlIlIlIIlIllIlIlI = Cipher.getInstance("DES");
            lllllllllllllIlIlIlIlIIlIllIlIlI.init(TileEntityItemStackRenderer.llllllIIlllll[3], lllllllllllllIlIlIlIlIIlIllIlIll);
            return new String(lllllllllllllIlIlIlIlIIlIllIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIlIIlIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlIlIIlIllIlIIl) {
            lllllllllllllIlIlIlIlIIlIllIlIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIIIIIIIlIll(final Object lllllllllllllIlIlIlIlIIlIlIIIIIl) {
        return lllllllllllllIlIlIlIlIIlIlIIIIIl != null;
    }
    
    public void renderByItem(final ItemStack lllllllllllllIlIlIlIlIIllIIIIlII) {
        if (lIllIIIIIIIlIII(lllllllllllllIlIlIlIlIIllIIIIlII.getItem(), Items.banner)) {
            this.banner.setItemValues(lllllllllllllIlIlIlIlIIllIIIIlII);
            TileEntityRendererDispatcher.instance.renderTileEntityAt(this.banner, 0.0, 0.0, 0.0, 0.0f);
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        else if (lIllIIIIIIIlIII(lllllllllllllIlIlIlIlIIllIIIIlII.getItem(), Items.skull)) {
            GameProfile lllllllllllllIlIlIlIlIIllIIIIIll = null;
            if (lIllIIIIIIIlIIl(lllllllllllllIlIlIlIlIIllIIIIlII.hasTagCompound() ? 1 : 0)) {
                final NBTTagCompound lllllllllllllIlIlIlIlIIllIIIIIlI = lllllllllllllIlIlIlIlIIllIIIIlII.getTagCompound();
                if (lIllIIIIIIIlIIl(lllllllllllllIlIlIlIlIIllIIIIIlI.hasKey(TileEntityItemStackRenderer.llllllIIllllI[TileEntityItemStackRenderer.llllllIIlllll[0]], TileEntityItemStackRenderer.llllllIIlllll[2]) ? 1 : 0)) {
                    lllllllllllllIlIlIlIlIIllIIIIIll = NBTUtil.readGameProfileFromNBT(lllllllllllllIlIlIlIlIIllIIIIIlI.getCompoundTag(TileEntityItemStackRenderer.llllllIIllllI[TileEntityItemStackRenderer.llllllIIlllll[1]]));
                    "".length();
                    if (-" ".length() == (97 + 70 - 91 + 84 ^ 100 + 22 - 38 + 80)) {
                        return;
                    }
                }
                else if (lIllIIIIIIIlIIl(lllllllllllllIlIlIlIlIIllIIIIIlI.hasKey(TileEntityItemStackRenderer.llllllIIllllI[TileEntityItemStackRenderer.llllllIIlllll[3]], TileEntityItemStackRenderer.llllllIIlllll[4]) ? 1 : 0) && lIllIIIIIIIlIlI(lllllllllllllIlIlIlIlIIllIIIIIlI.getString(TileEntityItemStackRenderer.llllllIIllllI[TileEntityItemStackRenderer.llllllIIlllll[5]]).length())) {
                    lllllllllllllIlIlIlIlIIllIIIIIll = new GameProfile((UUID)null, lllllllllllllIlIlIlIlIIllIIIIIlI.getString(TileEntityItemStackRenderer.llllllIIllllI[TileEntityItemStackRenderer.llllllIIlllll[6]]));
                    lllllllllllllIlIlIlIlIIllIIIIIll = TileEntitySkull.updateGameprofile(lllllllllllllIlIlIlIlIIllIIIIIll);
                    lllllllllllllIlIlIlIlIIllIIIIIlI.removeTag(TileEntityItemStackRenderer.llllllIIllllI[TileEntityItemStackRenderer.llllllIIlllll[7]]);
                    lllllllllllllIlIlIlIlIIllIIIIIlI.setTag(TileEntityItemStackRenderer.llllllIIllllI[TileEntityItemStackRenderer.llllllIIlllll[8]], NBTUtil.writeGameProfile(new NBTTagCompound(), lllllllllllllIlIlIlIlIIllIIIIIll));
                }
            }
            if (lIllIIIIIIIlIll(TileEntitySkullRenderer.instance)) {
                GlStateManager.pushMatrix();
                GlStateManager.translate(-0.5f, 0.0f, -0.5f);
                GlStateManager.scale(2.0f, 2.0f, 2.0f);
                GlStateManager.disableCull();
                TileEntitySkullRenderer.instance.renderSkull(0.0f, 0.0f, 0.0f, EnumFacing.UP, 0.0f, lllllllllllllIlIlIlIlIIllIIIIlII.getMetadata(), lllllllllllllIlIlIlIlIIllIIIIIll, TileEntityItemStackRenderer.llllllIIlllll[9]);
                GlStateManager.enableCull();
                GlStateManager.popMatrix();
                "".length();
                if ((0x79 ^ 0x7C) == 0x0) {
                    return;
                }
            }
        }
        else {
            final Block lllllllllllllIlIlIlIlIIllIIIIIIl = Block.getBlockFromItem(lllllllllllllIlIlIlIlIIllIIIIlII.getItem());
            if (lIllIIIIIIIlIII(lllllllllllllIlIlIlIlIIllIIIIIIl, Blocks.ender_chest)) {
                TileEntityRendererDispatcher.instance.renderTileEntityAt(this.enderChest, 0.0, 0.0, 0.0, 0.0f);
                "".length();
                if ((0x77 ^ 0x73) <= 0) {
                    return;
                }
            }
            else if (lIllIIIIIIIlIII(lllllllllllllIlIlIlIlIIllIIIIIIl, Blocks.trapped_chest)) {
                TileEntityRendererDispatcher.instance.renderTileEntityAt(this.field_147718_c, 0.0, 0.0, 0.0, 0.0f);
                "".length();
                if ((0x2A ^ 0x2E) <= "  ".length()) {
                    return;
                }
            }
            else {
                TileEntityRendererDispatcher.instance.renderTileEntityAt(this.field_147717_b, 0.0, 0.0, 0.0, 0.0f);
            }
        }
    }
}
