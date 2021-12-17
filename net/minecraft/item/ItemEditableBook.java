// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.util.StatCollector;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StringUtils;
import java.util.List;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.inventory.Slot;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S2FPacketSetSlot;
import net.minecraft.inventory.IInventory;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.util.ChatComponentText;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentProcessor;
import net.minecraft.util.IChatComponent;
import net.minecraft.entity.player.EntityPlayer;

public class ItemEditableBook extends Item
{
    private static final /* synthetic */ String[] llIllIlllIIIIl;
    private static final /* synthetic */ int[] llIllIlllIIIlI;
    
    private static void lIIllIIIIlIllIlI() {
        (llIllIlllIIIIl = new String[ItemEditableBook.llIllIlllIIIlI[14]])[ItemEditableBook.llIllIlllIIIlI[1]] = lIIllIIIIlIlIlll("Gtg2aeGTjRg=", "CbqyX");
        ItemEditableBook.llIllIlllIIIIl[ItemEditableBook.llIllIlllIIIlI[0]] = lIIllIIIIlIlIlll("9mKlF7GZ/+w=", "xPadx");
        ItemEditableBook.llIllIlllIIIIl[ItemEditableBook.llIllIlllIIIlI[4]] = lIIllIIIIlIllIII("Z1VKp/LqwoE=", "Ohalp");
        ItemEditableBook.llIllIlllIIIIl[ItemEditableBook.llIllIlllIIIlI[5]] = lIIllIIIIlIllIIl("HygUHSQZORMXOA==", "xMzxV");
        ItemEditableBook.llIllIlllIIIIl[ItemEditableBook.llIllIlllIIIlI[6]] = lIIllIIIIlIllIII("adxmB0+6w5M=", "wcAaa");
        ItemEditableBook.llIllIlllIIIIl[ItemEditableBook.llIllIlllIIIlI[7]] = lIIllIIIIlIllIII("M+8NiqKVd2o=", "sOyzi");
        ItemEditableBook.llIllIlllIIIIl[ItemEditableBook.llIllIlllIIIlI[8]] = lIIllIIIIlIlIlll("Qmz4M1F6+ncUWCMzOW2K+g==", "hMLZj");
        ItemEditableBook.llIllIlllIIIIl[ItemEditableBook.llIllIlllIIIlI[9]] = lIIllIIIIlIllIII("2D1tZ4PVhZDKTDQG5avAUpDS9vRFEb8M", "XZByn");
        ItemEditableBook.llIllIlllIIIIl[ItemEditableBook.llIllIlllIIIlI[2]] = lIIllIIIIlIllIII("EBQJKvHvvjwYLG0zSmx3sg==", "CPPur");
        ItemEditableBook.llIllIlllIIIIl[ItemEditableBook.llIllIlllIIIlI[10]] = lIIllIIIIlIllIIl("GAYAPhscBhc=", "jcsQw");
        ItemEditableBook.llIllIlllIIIIl[ItemEditableBook.llIllIlllIIIlI[11]] = lIIllIIIIlIllIII("FgvzWhWVpGnXOV9JhxeNsg==", "LJCjp");
        ItemEditableBook.llIllIlllIIIIl[ItemEditableBook.llIllIlllIIIlI[12]] = lIIllIIIIlIlIlll("dV0VKlb6vLw=", "UoWqh");
        ItemEditableBook.llIllIlllIIIIl[ItemEditableBook.llIllIlllIIIlI[13]] = lIIllIIIIlIlIlll("1wPjVGYISdQ=", "XYsRf");
    }
    
    private static boolean lIIllIIIIlIllllI(final int llllllllllllIllIIllIIIlIlIIIlIlI, final int llllllllllllIllIIllIIIlIlIIIlIIl) {
        return llllllllllllIllIIllIIIlIlIIIlIlI <= llllllllllllIllIIllIIIlIlIIIlIIl;
    }
    
    private void resolveContents(final ItemStack llllllllllllIllIIllIIIlIllIlIIII, final EntityPlayer llllllllllllIllIIllIIIlIllIIllll) {
        if (lIIllIIIIlIlllIl(llllllllllllIllIIllIIIlIllIlIIII) && lIIllIIIIlIlllIl(llllllllllllIllIIllIIIlIllIlIIII.getTagCompound())) {
            final NBTTagCompound llllllllllllIllIIllIIIlIllIllIII = llllllllllllIllIIllIIIlIllIlIIII.getTagCompound();
            if (lIIllIIIIlIlllII(llllllllllllIllIIllIIIlIllIllIII.getBoolean(ItemEditableBook.llIllIlllIIIIl[ItemEditableBook.llIllIlllIIIlI[10]]) ? 1 : 0)) {
                llllllllllllIllIIllIIIlIllIllIII.setBoolean(ItemEditableBook.llIllIlllIIIIl[ItemEditableBook.llIllIlllIIIlI[11]], (boolean)(ItemEditableBook.llIllIlllIIIlI[0] != 0));
                if (lIIllIIIIlIlllll(validBookTagContents(llllllllllllIllIIllIIIlIllIllIII) ? 1 : 0)) {
                    final NBTTagList llllllllllllIllIIllIIIlIllIlIlll = llllllllllllIllIIllIIIlIllIllIII.getTagList(ItemEditableBook.llIllIlllIIIIl[ItemEditableBook.llIllIlllIIIlI[12]], ItemEditableBook.llIllIlllIIIlI[2]);
                    int llllllllllllIllIIllIIIlIllIlIllI = ItemEditableBook.llIllIlllIIIlI[1];
                    "".length();
                    if (null != null) {
                        return;
                    }
                    while (!lIIllIIIIllIIIII(llllllllllllIllIIllIIIlIllIlIllI, llllllllllllIllIIllIIIlIllIlIlll.tagCount())) {
                        final String llllllllllllIllIIllIIIlIllIlIlIl = llllllllllllIllIIllIIIlIllIlIlll.getStringTagAt(llllllllllllIllIIllIIIlIllIlIllI);
                        IChatComponent llllllllllllIllIIllIIIlIllIlIIll = null;
                        try {
                            IChatComponent llllllllllllIllIIllIIIlIllIlIlII = IChatComponent.Serializer.jsonToComponent(llllllllllllIllIIllIIIlIllIlIlIl);
                            llllllllllllIllIIllIIIlIllIlIlII = ChatComponentProcessor.processComponent(llllllllllllIllIIllIIIlIllIIllll, llllllllllllIllIIllIIIlIllIlIlII, llllllllllllIllIIllIIIlIllIIllll);
                            "".length();
                            if (null != null) {
                                return;
                            }
                        }
                        catch (Exception llllllllllllIllIIllIIIlIllIlIIlI) {
                            llllllllllllIllIIllIIIlIllIlIIll = new ChatComponentText(llllllllllllIllIIllIIIlIllIlIlIl);
                        }
                        llllllllllllIllIIllIIIlIllIlIlll.set(llllllllllllIllIIllIIIlIllIlIllI, new NBTTagString(IChatComponent.Serializer.componentToJson(llllllllllllIllIIllIIIlIllIlIIll)));
                        ++llllllllllllIllIIllIIIlIllIlIllI;
                    }
                    llllllllllllIllIIllIIIlIllIllIII.setTag(ItemEditableBook.llIllIlllIIIIl[ItemEditableBook.llIllIlllIIIlI[13]], llllllllllllIllIIllIIIlIllIlIlll);
                    if (lIIllIIIIlIlllll((llllllllllllIllIIllIIIlIllIIllll instanceof EntityPlayerMP) ? 1 : 0) && lIIllIIIIllIIIIl(llllllllllllIllIIllIIIlIllIIllll.getCurrentEquippedItem(), llllllllllllIllIIllIIIlIllIlIIII)) {
                        final Slot llllllllllllIllIIllIIIlIllIlIIIl = llllllllllllIllIIllIIIlIllIIllll.openContainer.getSlotFromInventory(llllllllllllIllIIllIIIlIllIIllll.inventory, llllllllllllIllIIllIIIlIllIIllll.inventory.currentItem);
                        ((EntityPlayerMP)llllllllllllIllIIllIIIlIllIIllll).playerNetServerHandler.sendPacket(new S2FPacketSetSlot(ItemEditableBook.llIllIlllIIIlI[1], llllllllllllIllIIllIIIlIllIlIIIl.slotNumber, llllllllllllIllIIllIIIlIllIlIIII));
                    }
                }
            }
        }
    }
    
    @Override
    public boolean hasEffect(final ItemStack llllllllllllIllIIllIIIlIllIIIlll) {
        return ItemEditableBook.llIllIlllIIIlI[0] != 0;
    }
    
    public static int getGeneration(final ItemStack llllllllllllIllIIllIIIllIIIIlIll) {
        return llllllllllllIllIIllIIIllIIIIlIll.getTagCompound().getInteger(ItemEditableBook.llIllIlllIIIIl[ItemEditableBook.llIllIlllIIIlI[5]]);
    }
    
    private static boolean lIIllIIIIllIIIIl(final Object llllllllllllIllIIllIIIlIlIIIIlII, final Object llllllllllllIllIIllIIIlIlIIIIIll) {
        return llllllllllllIllIIllIIIlIlIIIIlII == llllllllllllIllIIllIIIlIlIIIIIll;
    }
    
    private static String lIIllIIIIlIlIlll(final String llllllllllllIllIIllIIIlIlIllllIl, final String llllllllllllIllIIllIIIlIlIllllII) {
        try {
            final SecretKeySpec llllllllllllIllIIllIIIlIllIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllIIIlIlIllllII.getBytes(StandardCharsets.UTF_8)), ItemEditableBook.llIllIlllIIIlI[2]), "DES");
            final Cipher llllllllllllIllIIllIIIlIllIIIIIl = Cipher.getInstance("DES");
            llllllllllllIllIIllIIIlIllIIIIIl.init(ItemEditableBook.llIllIlllIIIlI[4], llllllllllllIllIIllIIIlIllIIIIlI);
            return new String(llllllllllllIllIIllIIIlIllIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllIIIlIlIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllIIIlIllIIIIII) {
            llllllllllllIllIIllIIIlIllIIIIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllIIIIllIIIII(final int llllllllllllIllIIllIIIlIlIIlIIlI, final int llllllllllllIllIIllIIIlIlIIlIIIl) {
        return llllllllllllIllIIllIIIlIlIIlIIlI >= llllllllllllIllIIllIIIlIlIIlIIIl;
    }
    
    private static void lIIllIIIIlIllIll() {
        (llIllIlllIIIlI = new int[15])[0] = " ".length();
        ItemEditableBook.llIllIlllIIIlI[1] = ((0x4 ^ 0x50) & ~(0x2E ^ 0x7A));
        ItemEditableBook.llIllIlllIIIlI[2] = (28 + 64 + 32 + 78 ^ 27 + 51 + 100 + 16);
        ItemEditableBook.llIllIlllIIIlI[3] = (0x23 ^ 0x3);
        ItemEditableBook.llIllIlllIIIlI[4] = "  ".length();
        ItemEditableBook.llIllIlllIIIlI[5] = "   ".length();
        ItemEditableBook.llIllIlllIIIlI[6] = (" ".length() ^ (0x23 ^ 0x26));
        ItemEditableBook.llIllIlllIIIlI[7] = (0xA ^ 0xF);
        ItemEditableBook.llIllIlllIIIlI[8] = (0xC4 ^ 0xC2);
        ItemEditableBook.llIllIlllIIIlI[9] = (0x7F ^ 0x78);
        ItemEditableBook.llIllIlllIIIlI[10] = (0x60 ^ 0x69);
        ItemEditableBook.llIllIlllIIIlI[11] = (0x84 ^ 0x99 ^ (0xA2 ^ 0xB5));
        ItemEditableBook.llIllIlllIIIlI[12] = (0x96 ^ 0x9D);
        ItemEditableBook.llIllIlllIIIlI[13] = (0x2D ^ 0x26 ^ (0x24 ^ 0x23));
        ItemEditableBook.llIllIlllIIIlI[14] = (0xD8 ^ 0xBE ^ (0x16 ^ 0x7D));
    }
    
    public ItemEditableBook() {
        this.setMaxStackSize(ItemEditableBook.llIllIlllIIIlI[0]);
        "".length();
    }
    
    static {
        lIIllIIIIlIllIll();
        lIIllIIIIlIllIlI();
    }
    
    private static String lIIllIIIIlIllIII(final String llllllllllllIllIIllIIIlIlIllIIII, final String llllllllllllIllIIllIIIlIlIlIllll) {
        try {
            final SecretKeySpec llllllllllllIllIIllIIIlIlIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllIIIlIlIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIllIIIlIlIllIlII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIllIIIlIlIllIlII.init(ItemEditableBook.llIllIlllIIIlI[4], llllllllllllIllIIllIIIlIlIllIlIl);
            return new String(llllllllllllIllIIllIIIlIlIllIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllIIIlIlIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllIIIlIlIllIIll) {
            llllllllllllIllIIllIIIlIlIllIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllIIIIllIIIlI(final int llllllllllllIllIIllIIIlIlIIIlllI, final int llllllllllllIllIIllIIIlIlIIIllIl) {
        return llllllllllllIllIIllIIIlIlIIIlllI < llllllllllllIllIIllIIIlIlIIIllIl;
    }
    
    private static boolean lIIllIIIIlIlllII(final int llllllllllllIllIIllIIIlIIlllllll) {
        return llllllllllllIllIIllIIIlIIlllllll == 0;
    }
    
    @Override
    public ItemStack onItemRightClick(final ItemStack llllllllllllIllIIllIIIlIlllIIllI, final World llllllllllllIllIIllIIIlIlllIIlIl, final EntityPlayer llllllllllllIllIIllIIIlIlllIlIII) {
        if (lIIllIIIIlIlllII(llllllllllllIllIIllIIIlIlllIIlIl.isRemote ? 1 : 0)) {
            this.resolveContents(llllllllllllIllIIllIIIlIlllIIllI, llllllllllllIllIIllIIIlIlllIlIII);
        }
        llllllllllllIllIIllIIIlIlllIlIII.displayGUIBook(llllllllllllIllIIllIIIlIlllIIllI);
        llllllllllllIllIIllIIIlIlllIlIII.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
        return llllllllllllIllIIllIIIlIlllIIllI;
    }
    
    private static boolean lIIllIIIIlIlllll(final int llllllllllllIllIIllIIIlIlIIIIIIl) {
        return llllllllllllIllIIllIIIlIlIIIIIIl != 0;
    }
    
    private static String lIIllIIIIlIllIIl(String llllllllllllIllIIllIIIlIlIIlllIl, final String llllllllllllIllIIllIIIlIlIlIIIIl) {
        llllllllllllIllIIllIIIlIlIIlllIl = new String(Base64.getDecoder().decode(llllllllllllIllIIllIIIlIlIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIllIIIlIlIlIIIII = new StringBuilder();
        final char[] llllllllllllIllIIllIIIlIlIIlllll = llllllllllllIllIIllIIIlIlIlIIIIl.toCharArray();
        int llllllllllllIllIIllIIIlIlIIllllI = ItemEditableBook.llIllIlllIIIlI[1];
        final short llllllllllllIllIIllIIIlIlIIllIII = (Object)llllllllllllIllIIllIIIlIlIIlllIl.toCharArray();
        final double llllllllllllIllIIllIIIlIlIIlIlll = llllllllllllIllIIllIIIlIlIIllIII.length;
        long llllllllllllIllIIllIIIlIlIIlIllI = ItemEditableBook.llIllIlllIIIlI[1];
        while (lIIllIIIIllIIIlI((int)llllllllllllIllIIllIIIlIlIIlIllI, (int)llllllllllllIllIIllIIIlIlIIlIlll)) {
            final char llllllllllllIllIIllIIIlIlIlIIIll = llllllllllllIllIIllIIIlIlIIllIII[llllllllllllIllIIllIIIlIlIIlIllI];
            llllllllllllIllIIllIIIlIlIlIIIII.append((char)(llllllllllllIllIIllIIIlIlIlIIIll ^ llllllllllllIllIIllIIIlIlIIlllll[llllllllllllIllIIllIIIlIlIIllllI % llllllllllllIllIIllIIIlIlIIlllll.length]));
            "".length();
            ++llllllllllllIllIIllIIIlIlIIllllI;
            ++llllllllllllIllIIllIIIlIlIIlIllI;
            "".length();
            if (((0x52 ^ 0xD) & ~(0x40 ^ 0x1F)) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIllIIIlIlIlIIIII);
    }
    
    private static boolean lIIllIIIIlIlllIl(final Object llllllllllllIllIIllIIIlIlIIIIlll) {
        return llllllllllllIllIIllIIIlIlIIIIlll != null;
    }
    
    @Override
    public void addInformation(final ItemStack llllllllllllIllIIllIIIlIllllIIll, final EntityPlayer llllllllllllIllIIllIIIlIlllllIII, final List<String> llllllllllllIllIIllIIIlIllllIlll, final boolean llllllllllllIllIIllIIIlIllllIllI) {
        if (lIIllIIIIlIlllll(llllllllllllIllIIllIIIlIllllIIll.hasTagCompound() ? 1 : 0)) {
            final NBTTagCompound llllllllllllIllIIllIIIlIllllIlIl = llllllllllllIllIIllIIIlIllllIIll.getTagCompound();
            final String llllllllllllIllIIllIIIlIllllIlII = llllllllllllIllIIllIIIlIllllIlIl.getString(ItemEditableBook.llIllIlllIIIIl[ItemEditableBook.llIllIlllIIIlI[7]]);
            if (lIIllIIIIlIlllII(StringUtils.isNullOrEmpty(llllllllllllIllIIllIIIlIllllIlII) ? 1 : 0)) {
                final StringBuilder append = new StringBuilder().append(EnumChatFormatting.GRAY);
                final String lllllllllllllIIIllIlllIIlIlIllll = ItemEditableBook.llIllIlllIIIIl[ItemEditableBook.llIllIlllIIIlI[8]];
                final Object[] lllllllllllllIIIllIlllIIlIlIlllI = new Object[ItemEditableBook.llIllIlllIIIlI[0]];
                lllllllllllllIIIllIlllIIlIlIlllI[ItemEditableBook.llIllIlllIIIlI[1]] = llllllllllllIllIIllIIIlIllllIlII;
                llllllllllllIllIIllIIIlIllllIlll.add(String.valueOf(append.append(StatCollector.translateToLocalFormatted(lllllllllllllIIIllIlllIIlIlIllll, lllllllllllllIIIllIlllIIlIlIlllI))));
                "".length();
            }
            llllllllllllIllIIllIIIlIllllIlll.add(String.valueOf(new StringBuilder().append(EnumChatFormatting.GRAY).append(StatCollector.translateToLocal(String.valueOf(new StringBuilder(ItemEditableBook.llIllIlllIIIIl[ItemEditableBook.llIllIlllIIIlI[9]]).append(llllllllllllIllIIllIIIlIllllIlIl.getInteger(ItemEditableBook.llIllIlllIIIIl[ItemEditableBook.llIllIlllIIIlI[2]])))))));
            "".length();
        }
    }
    
    @Override
    public String getItemStackDisplayName(final ItemStack llllllllllllIllIIllIIIllIIIIIIIl) {
        if (lIIllIIIIlIlllll(llllllllllllIllIIllIIIllIIIIIIIl.hasTagCompound() ? 1 : 0)) {
            final NBTTagCompound llllllllllllIllIIllIIIllIIIIIlII = llllllllllllIllIIllIIIllIIIIIIIl.getTagCompound();
            final String llllllllllllIllIIllIIIllIIIIIIll = llllllllllllIllIIllIIIllIIIIIlII.getString(ItemEditableBook.llIllIlllIIIIl[ItemEditableBook.llIllIlllIIIlI[6]]);
            if (lIIllIIIIlIlllII(StringUtils.isNullOrEmpty(llllllllllllIllIIllIIIllIIIIIIll) ? 1 : 0)) {
                return llllllllllllIllIIllIIIllIIIIIIll;
            }
        }
        return super.getItemStackDisplayName(llllllllllllIllIIllIIIllIIIIIIIl);
    }
    
    public static boolean validBookTagContents(final NBTTagCompound llllllllllllIllIIllIIIllIIIlIIIl) {
        if (lIIllIIIIlIlllII(ItemWritableBook.isNBTValid(llllllllllllIllIIllIIIllIIIlIIIl) ? 1 : 0)) {
            return ItemEditableBook.llIllIlllIIIlI[1] != 0;
        }
        if (lIIllIIIIlIlllII(llllllllllllIllIIllIIIllIIIlIIIl.hasKey(ItemEditableBook.llIllIlllIIIIl[ItemEditableBook.llIllIlllIIIlI[1]], ItemEditableBook.llIllIlllIIIlI[2]) ? 1 : 0)) {
            return ItemEditableBook.llIllIlllIIIlI[1] != 0;
        }
        final String llllllllllllIllIIllIIIllIIIlIIII = llllllllllllIllIIllIIIllIIIlIIIl.getString(ItemEditableBook.llIllIlllIIIIl[ItemEditableBook.llIllIlllIIIlI[0]]);
        int hasKey;
        if (lIIllIIIIlIlllIl(llllllllllllIllIIllIIIllIIIlIIII) && lIIllIIIIlIllllI(llllllllllllIllIIllIIIllIIIlIIII.length(), ItemEditableBook.llIllIlllIIIlI[3])) {
            hasKey = (llllllllllllIllIIllIIIllIIIlIIIl.hasKey(ItemEditableBook.llIllIlllIIIIl[ItemEditableBook.llIllIlllIIIlI[4]], ItemEditableBook.llIllIlllIIIlI[2]) ? 1 : 0);
            "".length();
            if (-"   ".length() >= 0) {
                return ((0x22 ^ 0x7D ^ (0xE ^ 0x2)) & (0x1D ^ 0x65 ^ (0xA8 ^ 0x83) ^ -" ".length()) & (((135 + 32 - 156 + 186 ^ 23 + 43 - 61 + 188) & (0x2F ^ 0x13 ^ (0x3B ^ 0x3) ^ -" ".length())) ^ -" ".length())) != 0x0;
            }
        }
        else {
            hasKey = ItemEditableBook.llIllIlllIIIlI[1];
        }
        return hasKey != 0;
    }
}
