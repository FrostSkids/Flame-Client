// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.EnumParticleTypes;
import com.google.common.collect.Lists;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.stats.StatList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.tileentity.TileEntityNote;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;

public class BlockNote extends BlockContainer
{
    private static final /* synthetic */ List<String> INSTRUMENTS;
    private static final /* synthetic */ String[] llIIlllIIIIIII;
    private static final /* synthetic */ int[] llIIlllIIIIIIl;
    
    private static String lIIIllllIlIIlIII(String llllllllllllIllIlllllIllIllIlIlI, final String llllllllllllIllIlllllIllIllIlllI) {
        llllllllllllIllIlllllIllIllIlIlI = (byte)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlllllIllIllIlIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlllllIllIllIllIl = new StringBuilder();
        final char[] llllllllllllIllIlllllIllIllIllII = llllllllllllIllIlllllIllIllIlllI.toCharArray();
        int llllllllllllIllIlllllIllIllIlIll = BlockNote.llIIlllIIIIIIl[1];
        final long llllllllllllIllIlllllIllIllIIlIl = (Object)((String)llllllllllllIllIlllllIllIllIlIlI).toCharArray();
        final long llllllllllllIllIlllllIllIllIIlII = llllllllllllIllIlllllIllIllIIlIl.length;
        boolean llllllllllllIllIlllllIllIllIIIll = BlockNote.llIIlllIIIIIIl[1] != 0;
        while (lIIIllllIlIlIIlI(llllllllllllIllIlllllIllIllIIIll ? 1 : 0, (int)llllllllllllIllIlllllIllIllIIlII)) {
            final char llllllllllllIllIlllllIllIlllIIII = llllllllllllIllIlllllIllIllIIlIl[llllllllllllIllIlllllIllIllIIIll];
            llllllllllllIllIlllllIllIllIllIl.append((char)(llllllllllllIllIlllllIllIlllIIII ^ llllllllllllIllIlllllIllIllIllII[llllllllllllIllIlllllIllIllIlIll % llllllllllllIllIlllllIllIllIllII.length]));
            "".length();
            ++llllllllllllIllIlllllIllIllIlIll;
            ++llllllllllllIllIlllllIllIllIIIll;
            "".length();
            if ((0x1D ^ 0x18) == 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlllllIllIllIllIl);
    }
    
    @Override
    public TileEntity createNewTileEntity(final World llllllllllllIllIlllllIlllIlIllIl, final int llllllllllllIllIlllllIlllIlIllII) {
        return new TileEntityNote();
    }
    
    private static void lIIIllllIlIIlIll() {
        (llIIlllIIIIIII = new String[BlockNote.llIIlllIIIIIIl[7]])[BlockNote.llIIlllIIIIIIl[1]] = lIIIllllIlIIlIII("OAgjHA==", "PiQlU");
        BlockNote.llIIlllIIIIIII[BlockNote.llIIlllIIIIIIl[2]] = lIIIllllIlIIlIII("JBU=", "FqZZO");
        BlockNote.llIIlllIIIIIII[BlockNote.llIIlllIIIIIIl[3]] = lIIIllllIlIIlIIl("3DzFh7CQmOY=", "TIGzm");
        BlockNote.llIIlllIIIIIII[BlockNote.llIIlllIIIIIIl[4]] = lIIIllllIlIIlIlI("5lH1RLY3Dts=", "lGrhy");
        BlockNote.llIIlllIIIIIII[BlockNote.llIIlllIIIIIIl[5]] = lIIIllllIlIIlIIl("lKIBAv6M3Z12Uph+SVraCw==", "AcgcC");
        BlockNote.llIIlllIIIIIII[BlockNote.llIIlllIIIIIIl[0]] = lIIIllllIlIIlIII("GxUQMF4=", "uzdUp");
    }
    
    @Override
    public void onBlockClicked(final World llllllllllllIllIlllllIlllIllIllI, final BlockPos llllllllllllIllIlllllIlllIllIIIl, final EntityPlayer llllllllllllIllIlllllIlllIllIlII) {
        if (lIIIllllIlIIllll(llllllllllllIllIlllllIlllIllIllI.isRemote ? 1 : 0)) {
            final TileEntity llllllllllllIllIlllllIlllIllIIll = llllllllllllIllIlllllIlllIllIllI.getTileEntity(llllllllllllIllIlllllIlllIllIIIl);
            if (lIIIllllIlIIllIl((llllllllllllIllIlllllIlllIllIIll instanceof TileEntityNote) ? 1 : 0)) {
                ((TileEntityNote)llllllllllllIllIlllllIlllIllIIll).triggerNote(llllllllllllIllIlllllIlllIllIllI, llllllllllllIllIlllllIlllIllIIIl);
                llllllllllllIllIlllllIlllIllIlII.triggerAchievement(StatList.field_181734_R);
            }
        }
    }
    
    @Override
    public int getRenderType() {
        return BlockNote.llIIlllIIIIIIl[4];
    }
    
    private static boolean lIIIllllIlIlIIIl(final int llllllllllllIllIlllllIllIlIlllll, final int llllllllllllIllIlllllIllIlIllllI) {
        return llllllllllllIllIlllllIllIlIlllll >= llllllllllllIllIlllllIllIlIllllI;
    }
    
    private static boolean lIIIllllIlIlIIII(final int llllllllllllIllIlllllIllIlIlIlII) {
        return llllllllllllIllIlllllIllIlIlIlII >= 0;
    }
    
    private static boolean lIIIllllIlIIllIl(final int llllllllllllIllIlllllIllIlIllIII) {
        return llllllllllllIllIlllllIllIlIllIII != 0;
    }
    
    private String getInstrument(int llllllllllllIllIlllllIlllIlIlIII) {
        if (!lIIIllllIlIlIIII(llllllllllllIllIlllllIlllIlIlIII) || lIIIllllIlIlIIIl(llllllllllllIllIlllllIlllIlIlIII, BlockNote.INSTRUMENTS.size())) {
            llllllllllllIllIlllllIlllIlIlIII = BlockNote.llIIlllIIIIIIl[1];
        }
        return BlockNote.INSTRUMENTS.get(llllllllllllIllIlllllIlllIlIlIII);
    }
    
    private static String lIIIllllIlIIlIIl(final String llllllllllllIllIlllllIlllIIIlIlI, final String llllllllllllIllIlllllIlllIIIlIIl) {
        try {
            final SecretKeySpec llllllllllllIllIlllllIlllIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllllIlllIIIlIIl.getBytes(StandardCharsets.UTF_8)), BlockNote.llIIlllIIIIIIl[8]), "DES");
            final Cipher llllllllllllIllIlllllIlllIIIlllI = Cipher.getInstance("DES");
            llllllllllllIllIlllllIlllIIIlllI.init(BlockNote.llIIlllIIIIIIl[3], llllllllllllIllIlllllIlllIIIllll);
            return new String(llllllllllllIllIlllllIlllIIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllllIlllIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllllIlllIIIllIl) {
            llllllllllllIllIlllllIlllIIIllIl.printStackTrace();
            return null;
        }
    }
    
    public BlockNote() {
        super(Material.wood);
        this.setCreativeTab(CreativeTabs.tabRedstone);
        "".length();
    }
    
    private static void lIIIllllIlIIllII() {
        (llIIlllIIIIIIl = new int[9])[0] = (0x49 ^ 0x4C);
        BlockNote.llIIlllIIIIIIl[1] = ((0x29 ^ 0xB) & ~(0xE1 ^ 0xC3));
        BlockNote.llIIlllIIIIIIl[2] = " ".length();
        BlockNote.llIIlllIIIIIIl[3] = "  ".length();
        BlockNote.llIIlllIIIIIIl[4] = "   ".length();
        BlockNote.llIIlllIIIIIIl[5] = (0x7A ^ 0x23 ^ (0x6D ^ 0x30));
        BlockNote.llIIlllIIIIIIl[6] = (0xF ^ 0x69 ^ (0x39 ^ 0x53));
        BlockNote.llIIlllIIIIIIl[7] = (0x46 ^ 0x11 ^ (0x50 ^ 0x1));
        BlockNote.llIIlllIIIIIIl[8] = (0x5E ^ 0x56);
    }
    
    private static boolean lIIIllllIlIlIIlI(final int llllllllllllIllIlllllIllIlIllIll, final int llllllllllllIllIlllllIllIlIllIlI) {
        return llllllllllllIllIlllllIllIlIllIll < llllllllllllIllIlllllIllIlIllIlI;
    }
    
    @Override
    public boolean onBlockActivated(final World llllllllllllIllIlllllIllllIIlIlI, final BlockPos llllllllllllIllIlllllIlllIllllll, final IBlockState llllllllllllIllIlllllIllllIIlIII, final EntityPlayer llllllllllllIllIlllllIlllIlllllI, final EnumFacing llllllllllllIllIlllllIllllIIIllI, final float llllllllllllIllIlllllIllllIIIlIl, final float llllllllllllIllIlllllIllllIIIlII, final float llllllllllllIllIlllllIllllIIIIll) {
        if (lIIIllllIlIIllIl(llllllllllllIllIlllllIllllIIlIlI.isRemote ? 1 : 0)) {
            return BlockNote.llIIlllIIIIIIl[2] != 0;
        }
        final TileEntity llllllllllllIllIlllllIllllIIIIlI = llllllllllllIllIlllllIllllIIlIlI.getTileEntity(llllllllllllIllIlllllIlllIllllll);
        if (lIIIllllIlIIllIl((llllllllllllIllIlllllIllllIIIIlI instanceof TileEntityNote) ? 1 : 0)) {
            final TileEntityNote llllllllllllIllIlllllIllllIIIIIl = (TileEntityNote)llllllllllllIllIlllllIllllIIIIlI;
            llllllllllllIllIlllllIllllIIIIIl.changePitch();
            llllllllllllIllIlllllIllllIIIIIl.triggerNote(llllllllllllIllIlllllIllllIIlIlI, llllllllllllIllIlllllIlllIllllll);
            llllllllllllIllIlllllIlllIlllllI.triggerAchievement(StatList.field_181735_S);
        }
        return BlockNote.llIIlllIIIIIIl[2] != 0;
    }
    
    private static boolean lIIIllllIlIIlllI(final int llllllllllllIllIlllllIllIlIlIIIl, final int llllllllllllIllIlllllIllIlIlIIII) {
        return llllllllllllIllIlllllIllIlIlIIIl != llllllllllllIllIlllllIllIlIlIIII;
    }
    
    private static String lIIIllllIlIIlIlI(final String llllllllllllIllIlllllIllIlllllIl, final String llllllllllllIllIlllllIllIllllllI) {
        try {
            final SecretKeySpec llllllllllllIllIlllllIlllIIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllllIllIllllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlllllIlllIIIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIlllllIlllIIIIIIl.init(BlockNote.llIIlllIIIIIIl[3], llllllllllllIllIlllllIlllIIIIIlI);
            return new String(llllllllllllIllIlllllIlllIIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllllIllIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllllIlllIIIIIII) {
            llllllllllllIllIlllllIlllIIIIIII.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIIllllIlIIllII();
        lIIIllllIlIIlIll();
        final String[] array = new String[BlockNote.llIIlllIIIIIIl[0]];
        array[BlockNote.llIIlllIIIIIIl[1]] = BlockNote.llIIlllIIIIIII[BlockNote.llIIlllIIIIIIl[1]];
        array[BlockNote.llIIlllIIIIIIl[2]] = BlockNote.llIIlllIIIIIII[BlockNote.llIIlllIIIIIIl[2]];
        array[BlockNote.llIIlllIIIIIIl[3]] = BlockNote.llIIlllIIIIIII[BlockNote.llIIlllIIIIIIl[3]];
        array[BlockNote.llIIlllIIIIIIl[4]] = BlockNote.llIIlllIIIIIII[BlockNote.llIIlllIIIIIIl[4]];
        array[BlockNote.llIIlllIIIIIIl[5]] = BlockNote.llIIlllIIIIIII[BlockNote.llIIlllIIIIIIl[5]];
        INSTRUMENTS = Lists.newArrayList((Object[])array);
    }
    
    @Override
    public void onNeighborBlockChange(final World llllllllllllIllIlllllIllllIlllII, final BlockPos llllllllllllIllIlllllIllllIlIlII, final IBlockState llllllllllllIllIlllllIllllIllIlI, final Block llllllllllllIllIlllllIllllIllIIl) {
        final boolean llllllllllllIllIlllllIllllIllIII = llllllllllllIllIlllllIllllIlllII.isBlockPowered(llllllllllllIllIlllllIllllIlIlII);
        final TileEntity llllllllllllIllIlllllIllllIlIlll = llllllllllllIllIlllllIllllIlllII.getTileEntity(llllllllllllIllIlllllIllllIlIlII);
        if (lIIIllllIlIIllIl((llllllllllllIllIlllllIllllIlIlll instanceof TileEntityNote) ? 1 : 0)) {
            final TileEntityNote llllllllllllIllIlllllIllllIlIllI = (TileEntityNote)llllllllllllIllIlllllIllllIlIlll;
            if (lIIIllllIlIIlllI(llllllllllllIllIlllllIllllIlIllI.previousRedstoneState ? 1 : 0, llllllllllllIllIlllllIllllIllIII ? 1 : 0)) {
                if (lIIIllllIlIIllIl(llllllllllllIllIlllllIllllIllIII ? 1 : 0)) {
                    llllllllllllIllIlllllIllllIlIllI.triggerNote(llllllllllllIllIlllllIllllIlllII, llllllllllllIllIlllllIllllIlIlII);
                }
                llllllllllllIllIlllllIllllIlIllI.previousRedstoneState = llllllllllllIllIlllllIllllIllIII;
            }
        }
    }
    
    private static boolean lIIIllllIlIIllll(final int llllllllllllIllIlllllIllIlIlIllI) {
        return llllllllllllIllIlllllIllIlIlIllI == 0;
    }
    
    @Override
    public boolean onBlockEventReceived(final World llllllllllllIllIlllllIlllIIllIIl, final BlockPos llllllllllllIllIlllllIlllIIlllll, final IBlockState llllllllllllIllIlllllIlllIIllllI, final int llllllllllllIllIlllllIlllIIlllIl, final int llllllllllllIllIlllllIlllIIlIllI) {
        final float llllllllllllIllIlllllIlllIIllIll = (float)Math.pow(2.0, (llllllllllllIllIlllllIlllIIlIllI - BlockNote.llIIlllIIIIIIl[6]) / 12.0);
        llllllllllllIllIlllllIlllIIllIIl.playSoundEffect(llllllllllllIllIlllllIlllIIlllll.getX() + 0.5, llllllllllllIllIlllllIlllIIlllll.getY() + 0.5, llllllllllllIllIlllllIlllIIlllll.getZ() + 0.5, String.valueOf(new StringBuilder(BlockNote.llIIlllIIIIIII[BlockNote.llIIlllIIIIIIl[0]]).append(this.getInstrument(llllllllllllIllIlllllIlllIIlllIl))), 3.0f, llllllllllllIllIlllllIlllIIllIll);
        llllllllllllIllIlllllIlllIIllIIl.spawnParticle(EnumParticleTypes.NOTE, llllllllllllIllIlllllIlllIIlllll.getX() + 0.5, llllllllllllIllIlllllIlllIIlllll.getY() + 1.2, llllllllllllIllIlllllIlllIIlllll.getZ() + 0.5, llllllllllllIllIlllllIlllIIlIllI / 24.0, 0.0, 0.0, new int[BlockNote.llIIlllIIIIIIl[1]]);
        return BlockNote.llIIlllIIIIIIl[2] != 0;
    }
}
