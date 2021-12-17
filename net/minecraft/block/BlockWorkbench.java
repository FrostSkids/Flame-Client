// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.InventoryPlayer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.init.Blocks;
import net.minecraft.util.IChatComponent;
import net.minecraft.stats.StatList;
import net.minecraft.world.IInteractionObject;
import net.minecraft.util.EnumFacing;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;

public class BlockWorkbench extends Block
{
    private static final /* synthetic */ int[] llIlIIllllIllI;
    
    private static boolean lIIlIIllIlIllIII(final int llllllllllllIllIlIllIllIIllIIlll) {
        return llllllllllllIllIlIllIllIIllIIlll != 0;
    }
    
    static {
        lIIlIIllIlIlIlll();
    }
    
    protected BlockWorkbench() {
        super(Material.wood);
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
    }
    
    private static void lIIlIIllIlIlIlll() {
        (llIlIIllllIllI = new int[1])[0] = " ".length();
    }
    
    @Override
    public boolean onBlockActivated(final World llllllllllllIllIlIllIllIIllIlIll, final BlockPos llllllllllllIllIlIllIllIIllIlIlI, final IBlockState llllllllllllIllIlIllIllIIlllIIIl, final EntityPlayer llllllllllllIllIlIllIllIIllIlIIl, final EnumFacing llllllllllllIllIlIllIllIIllIllll, final float llllllllllllIllIlIllIllIIllIlllI, final float llllllllllllIllIlIllIllIIllIllIl, final float llllllllllllIllIlIllIllIIllIllII) {
        if (lIIlIIllIlIllIII(llllllllllllIllIlIllIllIIllIlIll.isRemote ? 1 : 0)) {
            return BlockWorkbench.llIlIIllllIllI[0] != 0;
        }
        llllllllllllIllIlIllIllIIllIlIIl.displayGui(new InterfaceCraftingTable(llllllllllllIllIlIllIllIIllIlIll, llllllllllllIllIlIllIllIIllIlIlI));
        llllllllllllIllIlIllIllIIllIlIIl.triggerAchievement(StatList.field_181742_Z);
        return BlockWorkbench.llIlIIllllIllI[0] != 0;
    }
    
    public static class InterfaceCraftingTable implements IInteractionObject
    {
        private final /* synthetic */ World world;
        private static final /* synthetic */ int[] lIllIIllIlIIll;
        private static final /* synthetic */ String[] lIllIIllIlIIIl;
        private final /* synthetic */ BlockPos position;
        
        private static boolean lllllIlIlIlllIl(final int lllllllllllllIIIIIIllIIIllIlllII, final int lllllllllllllIIIIIIllIIIllIllIll) {
            return lllllllllllllIIIIIIllIIIllIlllII < lllllllllllllIIIIIIllIIIllIllIll;
        }
        
        public InterfaceCraftingTable(final World lllllllllllllIIIIIIllIIlIIIlIIII, final BlockPos lllllllllllllIIIIIIllIIlIIIlIIlI) {
            this.world = lllllllllllllIIIIIIllIIlIIIlIIII;
            this.position = lllllllllllllIIIIIIllIIlIIIlIIlI;
        }
        
        @Override
        public boolean hasCustomName() {
            return InterfaceCraftingTable.lIllIIllIlIIll[0] != 0;
        }
        
        private static void lllllIlIlIlllII() {
            (lIllIIllIlIIll = new int[3])[0] = ((0x5D ^ 0x4C) & ~(0xF ^ 0x1E));
            InterfaceCraftingTable.lIllIIllIlIIll[1] = " ".length();
            InterfaceCraftingTable.lIllIIllIlIIll[2] = "  ".length();
        }
        
        @Override
        public IChatComponent getDisplayName() {
            return new ChatComponentTranslation(String.valueOf(new StringBuilder(String.valueOf(Blocks.crafting_table.getUnlocalizedName())).append(InterfaceCraftingTable.lIllIIllIlIIIl[InterfaceCraftingTable.lIllIIllIlIIll[0]])), new Object[InterfaceCraftingTable.lIllIIllIlIIll[0]]);
        }
        
        private static String lllllIlIlIlIIll(String lllllllllllllIIIIIIllIIIlllIIlll, final String lllllllllllllIIIIIIllIIIlllIIllI) {
            lllllllllllllIIIIIIllIIIlllIIlll = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIIIllIIIlllIIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIIIIIllIIIlllIlIlI = new StringBuilder();
            final char[] lllllllllllllIIIIIIllIIIlllIlIIl = lllllllllllllIIIIIIllIIIlllIIllI.toCharArray();
            int lllllllllllllIIIIIIllIIIlllIlIII = InterfaceCraftingTable.lIllIIllIlIIll[0];
            final long lllllllllllllIIIIIIllIIIlllIIIlI = (Object)((String)lllllllllllllIIIIIIllIIIlllIIlll).toCharArray();
            final long lllllllllllllIIIIIIllIIIlllIIIIl = lllllllllllllIIIIIIllIIIlllIIIlI.length;
            String lllllllllllllIIIIIIllIIIlllIIIII = (String)InterfaceCraftingTable.lIllIIllIlIIll[0];
            while (lllllIlIlIlllIl((int)lllllllllllllIIIIIIllIIIlllIIIII, (int)lllllllllllllIIIIIIllIIIlllIIIIl)) {
                final char lllllllllllllIIIIIIllIIIlllIllIl = lllllllllllllIIIIIIllIIIlllIIIlI[lllllllllllllIIIIIIllIIIlllIIIII];
                lllllllllllllIIIIIIllIIIlllIlIlI.append((char)(lllllllllllllIIIIIIllIIIlllIllIl ^ lllllllllllllIIIIIIllIIIlllIlIIl[lllllllllllllIIIIIIllIIIlllIlIII % lllllllllllllIIIIIIllIIIlllIlIIl.length]));
                "".length();
                ++lllllllllllllIIIIIIllIIIlllIlIII;
                ++lllllllllllllIIIIIIllIIIlllIIIII;
                "".length();
                if ("   ".length() != "   ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIIIIIllIIIlllIlIlI);
        }
        
        @Override
        public Container createContainer(final InventoryPlayer lllllllllllllIIIIIIllIIlIIIIIlIl, final EntityPlayer lllllllllllllIIIIIIllIIlIIIIIlll) {
            return new ContainerWorkbench(lllllllllllllIIIIIIllIIlIIIIIlIl, this.world, this.position);
        }
        
        @Override
        public String getName() {
            return null;
        }
        
        private static void lllllIlIlIllIIl() {
            (lIllIIllIlIIIl = new String[InterfaceCraftingTable.lIllIIllIlIIll[2]])[InterfaceCraftingTable.lIllIIllIlIIll[0]] = lllllIlIlIlIIll("YBoTIAY=", "NtrMc");
            InterfaceCraftingTable.lIllIIllIlIIIl[InterfaceCraftingTable.lIllIIllIlIIll[1]] = lllllIlIlIlIlII("zn6qliXDYah/eHr8cjIVW83iNqypq8zARVmNzAcXlx0=", "YlWnM");
        }
        
        static {
            lllllIlIlIlllII();
            lllllIlIlIllIIl();
        }
        
        @Override
        public String getGuiID() {
            return InterfaceCraftingTable.lIllIIllIlIIIl[InterfaceCraftingTable.lIllIIllIlIIll[1]];
        }
        
        private static String lllllIlIlIlIlII(final String lllllllllllllIIIIIIllIIIlllllIlI, final String lllllllllllllIIIIIIllIIIlllllIll) {
            try {
                final SecretKeySpec lllllllllllllIIIIIIllIIIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIllIIIlllllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIIIIIllIIIlllllllI = Cipher.getInstance("Blowfish");
                lllllllllllllIIIIIIllIIIlllllllI.init(InterfaceCraftingTable.lIllIIllIlIIll[2], lllllllllllllIIIIIIllIIIllllllll);
                return new String(lllllllllllllIIIIIIllIIIlllllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIllIIIlllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIIIIllIIIllllllIl) {
                lllllllllllllIIIIIIllIIIllllllIl.printStackTrace();
                return null;
            }
        }
    }
}
