// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Iterator;
import net.minecraft.client.Minecraft;
import java.util.Arrays;
import net.minecraft.event.ClickEvent;
import org.apache.logging.log4j.LogManager;
import com.google.common.collect.Lists;
import com.google.gson.JsonParseException;
import net.minecraft.item.ItemEditableBook;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.client.renderer.GlStateManager;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.resources.I18n;
import org.lwjgl.input.Keyboard;
import net.minecraft.util.ChatAllowedCharacters;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C17PacketCustomPayload;
import net.minecraft.network.PacketBuffer;
import io.netty.buffer.Unpooled;
import net.minecraft.init.Items;
import net.minecraft.util.ChatComponentText;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.nbt.NBTBase;
import java.io.IOException;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.IChatComponent;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import org.apache.logging.log4j.Logger;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagList;

public class GuiScreenBook extends GuiScreen
{
    private /* synthetic */ boolean bookGettingSigned;
    private static final /* synthetic */ String[] lllllIIllIIll;
    private /* synthetic */ NBTTagList bookPages;
    private /* synthetic */ NextPageButton buttonPreviousPage;
    private /* synthetic */ GuiButton buttonFinalize;
    private final /* synthetic */ ItemStack bookObj;
    private /* synthetic */ GuiButton buttonCancel;
    private static final /* synthetic */ int[] lllllIIlllllI;
    private /* synthetic */ NextPageButton buttonNextPage;
    private /* synthetic */ int updateCount;
    private /* synthetic */ int bookImageWidth;
    private /* synthetic */ int bookImageHeight;
    private final /* synthetic */ boolean bookIsUnsigned;
    private /* synthetic */ int bookTotalPages;
    private /* synthetic */ boolean bookIsModified;
    private final /* synthetic */ EntityPlayer editingPlayer;
    private /* synthetic */ GuiButton buttonDone;
    private /* synthetic */ List<IChatComponent> field_175386_A;
    private /* synthetic */ GuiButton buttonSign;
    private /* synthetic */ int currPage;
    private static final /* synthetic */ ResourceLocation bookGuiTextures;
    private /* synthetic */ String bookTitle;
    private /* synthetic */ int field_175387_B;
    
    @Override
    protected void mouseClicked(final int lllllllllllllIlIlIlllIIIllllIllI, final int lllllllllllllIlIlIlllIIIllllIlIl, final int lllllllllllllIlIlIlllIIIlllllIIl) throws IOException {
        if (lIlIlllIIIlllII(lllllllllllllIlIlIlllIIIlllllIIl)) {
            final IChatComponent lllllllllllllIlIlIlllIIIlllllIII = this.func_175385_b(lllllllllllllIlIlIlllIIIllllIllI, lllllllllllllIlIlIlllIIIllllIlIl);
            if (lIlIlllIIIlIlIl(this.handleComponentClick(lllllllllllllIlIlIlllIIIlllllIII) ? 1 : 0)) {
                return;
            }
        }
        super.mouseClicked(lllllllllllllIlIlIlllIIIllllIllI, lllllllllllllIlIlIlllIIIllllIlIl, lllllllllllllIlIlIlllIIIlllllIIl);
    }
    
    private void sendBookToServer(final boolean lllllllllllllIlIlIlllIIlIlllIllI) throws IOException {
        if (lIlIlllIIIlIlIl(this.bookIsUnsigned ? 1 : 0) && lIlIlllIIIlIlIl(this.bookIsModified ? 1 : 0) && lIlIlllIIIlIllI(this.bookPages)) {
            "".length();
            if (null != null) {
                return;
            }
            while (!lIlIlllIIIlllll(this.bookPages.tagCount(), GuiScreenBook.lllllIIlllllI[2])) {
                final String lllllllllllllIlIlIlllIIlIllllllI = this.bookPages.getStringTagAt(this.bookPages.tagCount() - GuiScreenBook.lllllIIlllllI[2]);
                if (lIlIlllIIIlIlIl(lllllllllllllIlIlIlllIIlIllllllI.length())) {
                    "".length();
                    if ((0x17 ^ 0x7A ^ (0x4D ^ 0x24)) == 0x0) {
                        return;
                    }
                    break;
                }
                else {
                    this.bookPages.removeTag(this.bookPages.tagCount() - GuiScreenBook.lllllIIlllllI[2]);
                    "".length();
                }
            }
            if (lIlIlllIIIlIlIl(this.bookObj.hasTagCompound() ? 1 : 0)) {
                final NBTTagCompound lllllllllllllIlIlIlllIIlIlllllIl = this.bookObj.getTagCompound();
                lllllllllllllIlIlIlllIIlIlllllIl.setTag(GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[18]], this.bookPages);
                "".length();
                if (((20 + 14 + 31 + 88 ^ 14 + 87 + 22 + 7) & (0x50 ^ 0x56 ^ (0xDB ^ 0xC6) ^ -" ".length())) >= " ".length()) {
                    return;
                }
            }
            else {
                this.bookObj.setTagInfo(GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[19]], this.bookPages);
            }
            String lllllllllllllIlIlIlllIIlIlllllII = GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[20]];
            if (lIlIlllIIIlIlIl(lllllllllllllIlIlIlllIIlIlllIllI ? 1 : 0)) {
                lllllllllllllIlIlIlllIIlIlllllII = GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[21]];
                this.bookObj.setTagInfo(GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[22]], new NBTTagString(this.editingPlayer.getName()));
                this.bookObj.setTagInfo(GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[23]], new NBTTagString(this.bookTitle.trim()));
                int lllllllllllllIlIlIlllIIlIllllIll = GuiScreenBook.lllllIIlllllI[0];
                "".length();
                if ((0xB0 ^ 0xB4) <= 0) {
                    return;
                }
                while (!lIlIlllIIIlllIl(lllllllllllllIlIlIlllIIlIllllIll, this.bookPages.tagCount())) {
                    String lllllllllllllIlIlIlllIIlIllllIlI = this.bookPages.getStringTagAt(lllllllllllllIlIlIlllIIlIllllIll);
                    final IChatComponent lllllllllllllIlIlIlllIIlIllllIIl = new ChatComponentText(lllllllllllllIlIlIlllIIlIllllIlI);
                    lllllllllllllIlIlIlllIIlIllllIlI = IChatComponent.Serializer.componentToJson(lllllllllllllIlIlIlllIIlIllllIIl);
                    this.bookPages.set(lllllllllllllIlIlIlllIIlIllllIll, new NBTTagString(lllllllllllllIlIlIlllIIlIllllIlI));
                    ++lllllllllllllIlIlIlllIIlIllllIll;
                }
                this.bookObj.setItem(Items.written_book);
            }
            final PacketBuffer lllllllllllllIlIlIlllIIlIllllIII = new PacketBuffer(Unpooled.buffer());
            lllllllllllllIlIlIlllIIlIllllIII.writeItemStackToBuffer(this.bookObj);
            this.mc.getNetHandler().addToSendQueue(new C17PacketCustomPayload(lllllllllllllIlIlIlllIIlIlllllII, lllllllllllllIlIlIlllIIlIllllIII));
        }
    }
    
    private static void lIlIlllIIIlIlII() {
        (lllllIIlllllI = new int[48])[0] = ((0xD7 ^ 0x98 ^ (0x96 ^ 0x99)) & (0x65 ^ 0x6A ^ (0x3E ^ 0x71) ^ -" ".length()));
        GuiScreenBook.lllllIIlllllI[1] = 168 + 18 - 7 + 13;
        GuiScreenBook.lllllIIlllllI[2] = " ".length();
        GuiScreenBook.lllllIIlllllI[3] = -" ".length();
        GuiScreenBook.lllllIIlllllI[4] = "  ".length();
        GuiScreenBook.lllllIIlllllI[5] = (0x47 ^ 0x70 ^ (0x8E ^ 0xB1));
        GuiScreenBook.lllllIIlllllI[6] = "   ".length();
        GuiScreenBook.lllllIIlllllI[7] = (0x22 ^ 0x0 ^ (0x1B ^ 0x5D));
        GuiScreenBook.lllllIIlllllI[8] = (0x99 ^ 0xC2 ^ (0xD3 ^ 0x8C));
        GuiScreenBook.lllllIIlllllI[9] = (0x18 ^ 0x2F ^ (0x34 ^ 0x61));
        GuiScreenBook.lllllIIlllllI[10] = (0x8A ^ 0x9E);
        GuiScreenBook.lllllIIlllllI[11] = ("   ".length() ^ (0x21 ^ 0x27));
        GuiScreenBook.lllllIIlllllI[12] = (0x1F ^ 0x19);
        GuiScreenBook.lllllIIlllllI[13] = (0x84 ^ 0x83);
        GuiScreenBook.lllllIIlllllI[14] = (0x6B ^ 0x74) + (0x7F ^ 0x2) - -(0x75 ^ 0x68) + (0x48 ^ 0x47);
        GuiScreenBook.lllllIIlllllI[15] = (0x1 ^ 0x79);
        GuiScreenBook.lllllIIlllllI[16] = 34 + 122 - 153 + 151;
        GuiScreenBook.lllllIIlllllI[17] = (0x52 ^ 0x74);
        GuiScreenBook.lllllIIlllllI[18] = (0xAF ^ 0xA2 ^ (0x91 ^ 0x95));
        GuiScreenBook.lllllIIlllllI[19] = (0xB1 ^ 0xBB);
        GuiScreenBook.lllllIIlllllI[20] = (136 + 51 - 71 + 37 ^ 65 + 34 - 96 + 143);
        GuiScreenBook.lllllIIlllllI[21] = (0x68 ^ 0x7A ^ (0x0 ^ 0x1E));
        GuiScreenBook.lllllIIlllllI[22] = (0x81 ^ 0x8C);
        GuiScreenBook.lllllIIlllllI[23] = (0xB0 ^ 0x93 ^ (0xA2 ^ 0x8F));
        GuiScreenBook.lllllIIlllllI[24] = (0x5D ^ 0x52 ^ (0x46 ^ 0x7B));
        GuiScreenBook.lllllIIlllllI[25] = (0x25 ^ 0x5C ^ (0x6A ^ 0x1C));
        GuiScreenBook.lllllIIlllllI[26] = (0x79 ^ 0x52 ^ (0x46 ^ 0x7D));
        GuiScreenBook.lllllIIlllllI[27] = (0x37 ^ 0x7B ^ (0x2A ^ 0x77));
        GuiScreenBook.lllllIIlllllI[28] = (0x51 ^ 0x3B ^ (0x7D ^ 0x5));
        GuiScreenBook.lllllIIlllllI[29] = (45 + 123 - 159 + 186 ^ 174 + 50 - 208 + 165);
        GuiScreenBook.lllllIIlllllI[30] = (0xA9 ^ 0xAE) + (0x35 ^ 0x7A) - -(0xAD ^ 0xB4) + (0x57 ^ 0x46);
        GuiScreenBook.lllllIIlllllI[31] = (-(0xFFFFFE8D & 0x3BFB) & (0xFFFFBB8E & 0x7FF9));
        GuiScreenBook.lllllIIlllllI[32] = (0xD7 ^ 0xC4);
        GuiScreenBook.lllllIIlllllI[33] = (0xC9 ^ 0xB2 ^ (0xF4 ^ 0x9A));
        GuiScreenBook.lllllIIlllllI[34] = (0x8D ^ 0xA9);
        GuiScreenBook.lllllIIlllllI[35] = (0x76 ^ 0x2);
        GuiScreenBook.lllllIIlllllI[36] = (0x39 ^ 0x5C ^ (0x54 ^ 0x1));
        GuiScreenBook.lllllIIlllllI[37] = (0xE ^ 0x18);
        GuiScreenBook.lllllIIlllllI[38] = (77 + 111 - 130 + 84 ^ 110 + 42 - 22 + 23);
        GuiScreenBook.lllllIIlllllI[39] = (96 + 236 - 299 + 219 ^ 48 + 32 - 73 + 165);
        GuiScreenBook.lllllIIlllllI[40] = (0xB6 ^ 0xA4 ^ (0x9E ^ 0x94));
        GuiScreenBook.lllllIIlllllI[41] = (0x1D ^ 0x4);
        GuiScreenBook.lllllIIlllllI[42] = (0x26 ^ 0x10 ^ (0x87 ^ 0xAB));
        GuiScreenBook.lllllIIlllllI[43] = (0xF1 ^ 0xA1 ^ (0xF6 ^ 0xBD));
        GuiScreenBook.lllllIIlllllI[44] = (187 + 207 - 328 + 152 ^ 163 + 168 - 169 + 36);
        GuiScreenBook.lllllIIlllllI[45] = (107 + 6 - 90 + 157 ^ 145 + 118 - 107 + 13);
        GuiScreenBook.lllllIIlllllI[46] = (0xD3 ^ 0xB1 ^ (0xCF ^ 0x81));
        GuiScreenBook.lllllIIlllllI[47] = (39 + 136 - 56 + 70 ^ 10 + 52 + 59 + 42);
    }
    
    private static boolean lIlIlllIIIllIII(final Object lllllllllllllIlIlIlllIIIIlllIIII) {
        return lllllllllllllIlIlIlllIIIIlllIIII == null;
    }
    
    @Override
    protected void keyTyped(final char lllllllllllllIlIlIlllIIlIllIIlII, final int lllllllllllllIlIlIlllIIlIllIIIII) throws IOException {
        super.keyTyped(lllllllllllllIlIlIlllIIlIllIIlII, lllllllllllllIlIlIlllIIlIllIIIII);
        if (lIlIlllIIIlIlIl(this.bookIsUnsigned ? 1 : 0)) {
            if (lIlIlllIIIlIlIl(this.bookGettingSigned ? 1 : 0)) {
                this.keyTypedInTitle(lllllllllllllIlIlIlllIIlIllIIlII, lllllllllllllIlIlIlllIIlIllIIIII);
                "".length();
                if ("   ".length() <= -" ".length()) {
                    return;
                }
            }
            else {
                this.keyTypedInBook(lllllllllllllIlIlIlllIIlIllIIlII, lllllllllllllIlIlIlllIIlIllIIIII);
            }
        }
    }
    
    private void addNewPage() {
        if (lIlIlllIIIlIllI(this.bookPages) && lIlIlllIIIlIlll(this.bookPages.tagCount(), GuiScreenBook.lllllIIlllllI[24])) {
            this.bookPages.appendTag(new NBTTagString(GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[25]]));
            this.bookTotalPages += GuiScreenBook.lllllIIlllllI[2];
            this.bookIsModified = (GuiScreenBook.lllllIIlllllI[2] != 0);
        }
    }
    
    private static boolean lIlIlllIIlIIIll(final Object lllllllllllllIlIlIlllIIIIlllIIll, final Object lllllllllllllIlIlIlllIIIIlllIIlI) {
        return lllllllllllllIlIlIlllIIIIlllIIll == lllllllllllllIlIlIlllIIIIlllIIlI;
    }
    
    public IChatComponent func_175385_b(final int lllllllllllllIlIlIlllIIIllIIllII, final int lllllllllllllIlIlIlllIIIllIlIlIl) {
        if (lIlIlllIIIllIII(this.field_175386_A)) {
            return null;
        }
        final int lllllllllllllIlIlIlllIIIllIlIlII = lllllllllllllIlIlIlllIIIllIIllII - (this.width - this.bookImageWidth) / GuiScreenBook.lllllIIlllllI[4] - GuiScreenBook.lllllIIlllllI[34];
        final int lllllllllllllIlIlIlllIIIllIlIIll = lllllllllllllIlIlIlllIIIllIlIlIl - GuiScreenBook.lllllIIlllllI[4] - GuiScreenBook.lllllIIlllllI[26] - GuiScreenBook.lllllIIlllllI[26];
        if (!lIlIlllIIlIIIIl(lllllllllllllIlIlIlllIIIllIlIlII) || !lIlIlllIIlIIIIl(lllllllllllllIlIlIlllIIIllIlIIll)) {
            return null;
        }
        final int lllllllllllllIlIlIlllIIIllIlIIlI = Math.min(GuiScreenBook.lllllIIlllllI[30] / this.fontRendererObj.FONT_HEIGHT, this.field_175386_A.size());
        if (lIlIlllIIIlllll(lllllllllllllIlIlIlllIIIllIlIlII, GuiScreenBook.lllllIIlllllI[35]) && lIlIlllIIIlIlll(lllllllllllllIlIlIlllIIIllIlIIll, this.mc.fontRendererObj.FONT_HEIGHT * lllllllllllllIlIlIlllIIIllIlIIlI + lllllllllllllIlIlIlllIIIllIlIIlI)) {
            final int lllllllllllllIlIlIlllIIIllIlIIIl = lllllllllllllIlIlIlllIIIllIlIIll / this.mc.fontRendererObj.FONT_HEIGHT;
            if (lIlIlllIIlIIIIl(lllllllllllllIlIlIlllIIIllIlIIIl) && lIlIlllIIIlIlll(lllllllllllllIlIlIlllIIIllIlIIIl, this.field_175386_A.size())) {
                final IChatComponent lllllllllllllIlIlIlllIIIllIlIIII = this.field_175386_A.get(lllllllllllllIlIlIlllIIIllIlIIIl);
                int lllllllllllllIlIlIlllIIIllIIllll = GuiScreenBook.lllllIIlllllI[0];
                final short lllllllllllllIlIlIlllIIIllIIIIll = (short)lllllllllllllIlIlIlllIIIllIlIIII.iterator();
                "".length();
                if (" ".length() > "   ".length()) {
                    return null;
                }
                while (!lIlIlllIIIlllII(((Iterator)lllllllllllllIlIlIlllIIIllIIIIll).hasNext() ? 1 : 0)) {
                    final IChatComponent lllllllllllllIlIlIlllIIIllIIlllI = ((Iterator<IChatComponent>)lllllllllllllIlIlIlllIIIllIIIIll).next();
                    if (lIlIlllIIIlIlIl((lllllllllllllIlIlIlllIIIllIIlllI instanceof ChatComponentText) ? 1 : 0)) {
                        lllllllllllllIlIlIlllIIIllIIllll += this.mc.fontRendererObj.getStringWidth(((ChatComponentText)lllllllllllllIlIlIlllIIIllIIlllI).getChatComponentText_TextValue());
                        if (lIlIlllIIlIIlII(lllllllllllllIlIlIlllIIIllIIllll, lllllllllllllIlIlIlllIIIllIlIlII)) {
                            return lllllllllllllIlIlIlllIIIllIIlllI;
                        }
                        continue;
                    }
                }
            }
            return null;
        }
        return null;
    }
    
    private void keyTypedInBook(final char lllllllllllllIlIlIlllIIlIlIlIllI, final int lllllllllllllIlIlIlllIIlIlIllIIl) {
        if (lIlIlllIIIlIlIl(GuiScreen.isKeyComboCtrlV(lllllllllllllIlIlIlllIIlIlIllIIl) ? 1 : 0)) {
            this.pageInsertIntoCurrent(GuiScreen.getClipboardString());
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else {
            switch (lllllllllllllIlIlIlllIIlIlIllIIl) {
                case 14: {
                    final String lllllllllllllIlIlIlllIIlIlIllIII = this.pageGetCurrent();
                    if (lIlIlllIIIllllI(lllllllllllllIlIlIlllIIlIlIllIII.length())) {
                        this.pageSetCurrent(lllllllllllllIlIlIlllIIlIlIllIII.substring(GuiScreenBook.lllllIIlllllI[0], lllllllllllllIlIlIlllIIlIlIllIII.length() - GuiScreenBook.lllllIIlllllI[2]));
                    }
                }
                case 28:
                case 156: {
                    this.pageInsertIntoCurrent(GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[26]]);
                }
                default: {
                    if (lIlIlllIIIlIlIl(ChatAllowedCharacters.isAllowedCharacter(lllllllllllllIlIlIlllIIlIlIlIllI) ? 1 : 0)) {
                        this.pageInsertIntoCurrent(Character.toString(lllllllllllllIlIlIlllIIlIlIlIllI));
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    @Override
    public void initGui() {
        this.buttonList.clear();
        Keyboard.enableRepeatEvents((boolean)(GuiScreenBook.lllllIIlllllI[2] != 0));
        if (lIlIlllIIIlIlIl(this.bookIsUnsigned ? 1 : 0)) {
            final List<GuiButton> buttonList = this.buttonList;
            final GuiButton buttonSign = new GuiButton(GuiScreenBook.lllllIIlllllI[6], this.width / GuiScreenBook.lllllIIlllllI[4] - GuiScreenBook.lllllIIlllllI[7], GuiScreenBook.lllllIIlllllI[8] + this.bookImageHeight, GuiScreenBook.lllllIIlllllI[9], GuiScreenBook.lllllIIlllllI[10], I18n.format(GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[8]], new Object[GuiScreenBook.lllllIIlllllI[0]]));
            this.buttonSign = buttonSign;
            buttonList.add(buttonSign);
            "".length();
            final List<GuiButton> buttonList2 = this.buttonList;
            final GuiButton buttonDone = new GuiButton(GuiScreenBook.lllllIIlllllI[0], this.width / GuiScreenBook.lllllIIlllllI[4] + GuiScreenBook.lllllIIlllllI[4], GuiScreenBook.lllllIIlllllI[8] + this.bookImageHeight, GuiScreenBook.lllllIIlllllI[9], GuiScreenBook.lllllIIlllllI[10], I18n.format(GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[11]], new Object[GuiScreenBook.lllllIIlllllI[0]]));
            this.buttonDone = buttonDone;
            buttonList2.add(buttonDone);
            "".length();
            final List<GuiButton> buttonList3 = this.buttonList;
            final GuiButton buttonFinalize = new GuiButton(GuiScreenBook.lllllIIlllllI[11], this.width / GuiScreenBook.lllllIIlllllI[4] - GuiScreenBook.lllllIIlllllI[7], GuiScreenBook.lllllIIlllllI[8] + this.bookImageHeight, GuiScreenBook.lllllIIlllllI[9], GuiScreenBook.lllllIIlllllI[10], I18n.format(GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[12]], new Object[GuiScreenBook.lllllIIlllllI[0]]));
            this.buttonFinalize = buttonFinalize;
            buttonList3.add(buttonFinalize);
            "".length();
            final List<GuiButton> buttonList4 = this.buttonList;
            final GuiButton buttonCancel = new GuiButton(GuiScreenBook.lllllIIlllllI[8], this.width / GuiScreenBook.lllllIIlllllI[4] + GuiScreenBook.lllllIIlllllI[4], GuiScreenBook.lllllIIlllllI[8] + this.bookImageHeight, GuiScreenBook.lllllIIlllllI[9], GuiScreenBook.lllllIIlllllI[10], I18n.format(GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[13]], new Object[GuiScreenBook.lllllIIlllllI[0]]));
            this.buttonCancel = buttonCancel;
            buttonList4.add(buttonCancel);
            "".length();
            "".length();
            if (((0x87 ^ 0xA9 ^ (0xF ^ 0x2E)) & (0x29 ^ 0x61 ^ (0xD4 ^ 0x93) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            final List<GuiButton> buttonList5 = this.buttonList;
            final GuiButton buttonDone2 = new GuiButton(GuiScreenBook.lllllIIlllllI[0], this.width / GuiScreenBook.lllllIIlllllI[4] - GuiScreenBook.lllllIIlllllI[7], GuiScreenBook.lllllIIlllllI[8] + this.bookImageHeight, GuiScreenBook.lllllIIlllllI[14], GuiScreenBook.lllllIIlllllI[10], I18n.format(GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[5]], new Object[GuiScreenBook.lllllIIlllllI[0]]));
            this.buttonDone = buttonDone2;
            buttonList5.add(buttonDone2);
            "".length();
        }
        final int lllllllllllllIlIlIlllIIllIIIllll = (this.width - this.bookImageWidth) / GuiScreenBook.lllllIIlllllI[4];
        final int lllllllllllllIlIlIlllIIllIIIlllI = GuiScreenBook.lllllIIlllllI[4];
        final List<GuiButton> buttonList6 = this.buttonList;
        final NextPageButton buttonNextPage = new NextPageButton(GuiScreenBook.lllllIIlllllI[2], lllllllllllllIlIlIlllIIllIIIllll + GuiScreenBook.lllllIIlllllI[15], lllllllllllllIlIlIlllIIllIIIlllI + GuiScreenBook.lllllIIlllllI[16], (boolean)(GuiScreenBook.lllllIIlllllI[2] != 0));
        this.buttonNextPage = buttonNextPage;
        buttonList6.add(buttonNextPage);
        "".length();
        final List<GuiButton> buttonList7 = this.buttonList;
        final NextPageButton buttonPreviousPage = new NextPageButton(GuiScreenBook.lllllIIlllllI[4], lllllllllllllIlIlIlllIIllIIIllll + GuiScreenBook.lllllIIlllllI[17], lllllllllllllIlIlIlllIIllIIIlllI + GuiScreenBook.lllllIIlllllI[16], (boolean)(GuiScreenBook.lllllIIlllllI[0] != 0));
        this.buttonPreviousPage = buttonPreviousPage;
        buttonList7.add(buttonPreviousPage);
        "".length();
        this.updateButtons();
    }
    
    private static String lIlIllIllllllII(String lllllllllllllIlIlIlllIIIlIlIlllI, final String lllllllllllllIlIlIlllIIIlIllIIlI) {
        lllllllllllllIlIlIlllIIIlIlIlllI = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIlllIIIlIlIlllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIlllIIIlIllIIIl = new StringBuilder();
        final char[] lllllllllllllIlIlIlllIIIlIllIIII = lllllllllllllIlIlIlllIIIlIllIIlI.toCharArray();
        int lllllllllllllIlIlIlllIIIlIlIllll = GuiScreenBook.lllllIIlllllI[0];
        final double lllllllllllllIlIlIlllIIIlIlIlIIl = (Object)((String)lllllllllllllIlIlIlllIIIlIlIlllI).toCharArray();
        final byte lllllllllllllIlIlIlllIIIlIlIlIII = (byte)lllllllllllllIlIlIlllIIIlIlIlIIl.length;
        double lllllllllllllIlIlIlllIIIlIlIIlll = GuiScreenBook.lllllIIlllllI[0];
        while (lIlIlllIIIlIlll((int)lllllllllllllIlIlIlllIIIlIlIIlll, lllllllllllllIlIlIlllIIIlIlIlIII)) {
            final char lllllllllllllIlIlIlllIIIlIllIlII = lllllllllllllIlIlIlllIIIlIlIlIIl[lllllllllllllIlIlIlllIIIlIlIIlll];
            lllllllllllllIlIlIlllIIIlIllIIIl.append((char)(lllllllllllllIlIlIlllIIIlIllIlII ^ lllllllllllllIlIlIlllIIIlIllIIII[lllllllllllllIlIlIlllIIIlIlIllll % lllllllllllllIlIlIlllIIIlIllIIII.length]));
            "".length();
            ++lllllllllllllIlIlIlllIIIlIlIllll;
            ++lllllllllllllIlIlIlllIIIlIlIIlll;
            "".length();
            if (-" ".length() > " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIlllIIIlIllIIIl);
    }
    
    private static boolean lIlIlllIIIlIlIl(final int lllllllllllllIlIlIlllIIIIllIlllI) {
        return lllllllllllllIlIlIlllIIIIllIlllI != 0;
    }
    
    private static String lIlIllIllllllIl(final String lllllllllllllIlIlIlllIIIlIIlIIIl, final String lllllllllllllIlIlIlllIIIlIIIlllI) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlllIIIlIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlllIIIlIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIlllIIIlIIlIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIlllIIIlIIlIIll.init(GuiScreenBook.lllllIIlllllI[4], lllllllllllllIlIlIlllIIIlIIlIlII);
            return new String(lllllllllllllIlIlIlllIIIlIIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlllIIIlIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlllIIIlIIlIIlI) {
            lllllllllllllIlIlIlllIIIlIIlIIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void drawScreen(final int lllllllllllllIlIlIlllIIlIIlIIlII, final int lllllllllllllIlIlIlllIIlIIIIllII, final float lllllllllllllIlIlIlllIIlIIlIIIlI) {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(GuiScreenBook.bookGuiTextures);
        final int lllllllllllllIlIlIlllIIlIIlIIIIl = (this.width - this.bookImageWidth) / GuiScreenBook.lllllIIlllllI[4];
        final int lllllllllllllIlIlIlllIIlIIlIIIII = GuiScreenBook.lllllIIlllllI[4];
        this.drawTexturedModalRect(lllllllllllllIlIlIlllIIlIIlIIIIl, lllllllllllllIlIlIlllIIlIIlIIIII, GuiScreenBook.lllllIIlllllI[0], GuiScreenBook.lllllIIlllllI[0], this.bookImageWidth, this.bookImageHeight);
        if (lIlIlllIIIlIlIl(this.bookGettingSigned ? 1 : 0)) {
            String lllllllllllllIlIlIlllIIlIIIlllll = this.bookTitle;
            if (lIlIlllIIIlIlIl(this.bookIsUnsigned ? 1 : 0)) {
                if (lIlIlllIIIlllII(this.updateCount / GuiScreenBook.lllllIIlllllI[12] % GuiScreenBook.lllllIIlllllI[4])) {
                    lllllllllllllIlIlIlllIIlIIIlllll = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIlIlllIIlIIIlllll)).append(EnumChatFormatting.BLACK).append(GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[32]]));
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    lllllllllllllIlIlIlllIIlIIIlllll = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIlIlllIIlIIIlllll)).append(EnumChatFormatting.GRAY).append(GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[10]]));
                }
            }
            final String lllllllllllllIlIlIlllIIlIIIllllI = I18n.format(GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[33]], new Object[GuiScreenBook.lllllIIlllllI[0]]);
            final int lllllllllllllIlIlIlllIIlIIIlllIl = this.fontRendererObj.getStringWidth(lllllllllllllIlIlIlllIIlIIIllllI);
            this.fontRendererObj.drawString(lllllllllllllIlIlIlllIIlIIIllllI, lllllllllllllIlIlIlllIIlIIlIIIIl + GuiScreenBook.lllllIIlllllI[34] + (GuiScreenBook.lllllIIlllllI[35] - lllllllllllllIlIlIlllIIlIIIlllIl) / GuiScreenBook.lllllIIlllllI[4], lllllllllllllIlIlIlllIIlIIlIIIII + GuiScreenBook.lllllIIlllllI[26] + GuiScreenBook.lllllIIlllllI[26], GuiScreenBook.lllllIIlllllI[0]);
            "".length();
            final int lllllllllllllIlIlIlllIIlIIIlllII = this.fontRendererObj.getStringWidth(lllllllllllllIlIlIlllIIlIIIlllll);
            this.fontRendererObj.drawString(lllllllllllllIlIlIlllIIlIIIlllll, lllllllllllllIlIlIlllIIlIIlIIIIl + GuiScreenBook.lllllIIlllllI[34] + (GuiScreenBook.lllllIIlllllI[35] - lllllllllllllIlIlIlllIIlIIIlllII) / GuiScreenBook.lllllIIlllllI[4], lllllllllllllIlIlIlllIIlIIlIIIII + GuiScreenBook.lllllIIlllllI[36], GuiScreenBook.lllllIIlllllI[0]);
            "".length();
            final String llllllllllllIlIllIlIIIIIllllIIll = GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[37]];
            final Object[] llllllllllllIlIllIlIIIIIllllIIII = new Object[GuiScreenBook.lllllIIlllllI[2]];
            llllllllllllIlIllIlIIIIIllllIIII[GuiScreenBook.lllllIIlllllI[0]] = this.editingPlayer.getName();
            final String lllllllllllllIlIlIlllIIlIIIllIll = I18n.format(llllllllllllIlIllIlIIIIIllllIIll, llllllllllllIlIllIlIIIIIllllIIII);
            final int lllllllllllllIlIlIlllIIlIIIllIlI = this.fontRendererObj.getStringWidth(lllllllllllllIlIlIlllIIlIIIllIll);
            this.fontRendererObj.drawString(String.valueOf(new StringBuilder().append(EnumChatFormatting.DARK_GRAY).append(lllllllllllllIlIlIlllIIlIIIllIll)), lllllllllllllIlIlIlllIIlIIlIIIIl + GuiScreenBook.lllllIIlllllI[34] + (GuiScreenBook.lllllIIlllllI[35] - lllllllllllllIlIlIlllIIlIIIllIlI) / GuiScreenBook.lllllIIlllllI[4], lllllllllllllIlIlIlllIIlIIlIIIII + GuiScreenBook.lllllIIlllllI[36] + GuiScreenBook.lllllIIlllllI[19], GuiScreenBook.lllllIIlllllI[0]);
            "".length();
            final String lllllllllllllIlIlIlllIIlIIIllIIl = I18n.format(GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[38]], new Object[GuiScreenBook.lllllIIlllllI[0]]);
            this.fontRendererObj.drawSplitString(lllllllllllllIlIlIlllIIlIIIllIIl, lllllllllllllIlIlIlllIIlIIlIIIIl + GuiScreenBook.lllllIIlllllI[34], lllllllllllllIlIlIlllIIlIIlIIIII + GuiScreenBook.lllllIIlllllI[39], GuiScreenBook.lllllIIlllllI[35], GuiScreenBook.lllllIIlllllI[0]);
            "".length();
            if ((14 + 37 + 47 + 77 ^ 26 + 98 - 49 + 96) == 0x0) {
                return;
            }
        }
        else {
            final String llllllllllllIlIllIlIIIIIllllIIll2 = GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[40]];
            final Object[] llllllllllllIlIllIlIIIIIllllIIII2 = new Object[GuiScreenBook.lllllIIlllllI[4]];
            llllllllllllIlIllIlIIIIIllllIIII2[GuiScreenBook.lllllIIlllllI[0]] = this.currPage + GuiScreenBook.lllllIIlllllI[2];
            llllllllllllIlIllIlIIIIIllllIIII2[GuiScreenBook.lllllIIlllllI[2]] = this.bookTotalPages;
            final String lllllllllllllIlIlIlllIIlIIIllIII = I18n.format(llllllllllllIlIllIlIIIIIllllIIll2, llllllllllllIlIllIlIIIIIllllIIII2);
            String lllllllllllllIlIlIlllIIlIIIlIlll = GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[41]];
            if (lIlIlllIIIlIllI(this.bookPages) && lIlIlllIIlIIIIl(this.currPage) && lIlIlllIIIlIlll(this.currPage, this.bookPages.tagCount())) {
                lllllllllllllIlIlIlllIIlIIIlIlll = this.bookPages.getStringTagAt(this.currPage);
            }
            if (lIlIlllIIIlIlIl(this.bookIsUnsigned ? 1 : 0)) {
                if (lIlIlllIIIlIlIl(this.fontRendererObj.getBidiFlag() ? 1 : 0)) {
                    lllllllllllllIlIlIlllIIlIIIlIlll = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIlIlllIIlIIIlIlll)).append(GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[42]]));
                    "".length();
                    if (-"   ".length() > 0) {
                        return;
                    }
                }
                else if (lIlIlllIIIlllII(this.updateCount / GuiScreenBook.lllllIIlllllI[12] % GuiScreenBook.lllllIIlllllI[4])) {
                    lllllllllllllIlIlIlllIIlIIIlIlll = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIlIlllIIlIIIlIlll)).append(EnumChatFormatting.BLACK).append(GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[43]]));
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    lllllllllllllIlIlIlllIIlIIIlIlll = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIlIlllIIlIIIlIlll)).append(EnumChatFormatting.GRAY).append(GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[44]]));
                    "".length();
                    if ((0x22 ^ 0x26) != (0x46 ^ 0x42)) {
                        return;
                    }
                }
            }
            else if (lIlIlllIIlIIIlI(this.field_175387_B, this.currPage)) {
                Label_1085: {
                    if (lIlIlllIIIlIlIl(ItemEditableBook.validBookTagContents(this.bookObj.getTagCompound()) ? 1 : 0)) {
                        try {
                            final IChatComponent lllllllllllllIlIlIlllIIlIIIlIllI = IChatComponent.Serializer.jsonToComponent(lllllllllllllIlIlIlllIIlIIIlIlll);
                            List<IChatComponent> func_178908_a;
                            if (lIlIlllIIIlIllI(lllllllllllllIlIlIlllIIlIIIlIllI)) {
                                func_178908_a = GuiUtilRenderComponents.func_178908_a(lllllllllllllIlIlIlllIIlIIIlIllI, GuiScreenBook.lllllIIlllllI[35], this.fontRendererObj, (boolean)(GuiScreenBook.lllllIIlllllI[2] != 0), (boolean)(GuiScreenBook.lllllIIlllllI[2] != 0));
                                "".length();
                                if ((0x13 ^ 0x61 ^ (0x11 ^ 0x67)) <= "   ".length()) {
                                    return;
                                }
                            }
                            else {
                                func_178908_a = null;
                            }
                            this.field_175386_A = func_178908_a;
                            "".length();
                            if (null != null) {
                                return;
                            }
                            break Label_1085;
                        }
                        catch (JsonParseException lllllllllllllIlIlIlllIIlIIIlIlIl) {
                            this.field_175386_A = null;
                            "".length();
                            if ("  ".length() <= 0) {
                                return;
                            }
                            break Label_1085;
                        }
                    }
                    final ChatComponentText lllllllllllllIlIlIlllIIlIIIlIlII = new ChatComponentText(String.valueOf(new StringBuilder(String.valueOf(EnumChatFormatting.DARK_RED.toString())).append(GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[45]])));
                    this.field_175386_A = (List<IChatComponent>)Lists.newArrayList((Iterable)lllllllllllllIlIlIlllIIlIIIlIlII);
                }
                this.field_175387_B = this.currPage;
            }
            final int lllllllllllllIlIlIlllIIlIIIlIIll = this.fontRendererObj.getStringWidth(lllllllllllllIlIlIlllIIlIIIllIII);
            this.fontRendererObj.drawString(lllllllllllllIlIlIlllIIlIIIllIII, lllllllllllllIlIlIlllIIlIIlIIIIl - lllllllllllllIlIlIlllIIlIIIlIIll + this.bookImageWidth - GuiScreenBook.lllllIIlllllI[46], lllllllllllllIlIlIlllIIlIIlIIIII + GuiScreenBook.lllllIIlllllI[26], GuiScreenBook.lllllIIlllllI[0]);
            "".length();
            if (lIlIlllIIIllIII(this.field_175386_A)) {
                this.fontRendererObj.drawSplitString(lllllllllllllIlIlIlllIIlIIIlIlll, lllllllllllllIlIlIlllIIlIIlIIIIl + GuiScreenBook.lllllIIlllllI[34], lllllllllllllIlIlIlllIIlIIlIIIII + GuiScreenBook.lllllIIlllllI[26] + GuiScreenBook.lllllIIlllllI[26], GuiScreenBook.lllllIIlllllI[35], GuiScreenBook.lllllIIlllllI[0]);
                "".length();
                if (-(0x7E ^ 0x7A) >= 0) {
                    return;
                }
            }
            else {
                final int lllllllllllllIlIlIlllIIlIIIlIIlI = Math.min(GuiScreenBook.lllllIIlllllI[30] / this.fontRendererObj.FONT_HEIGHT, this.field_175386_A.size());
                int lllllllllllllIlIlIlllIIlIIIlIIIl = GuiScreenBook.lllllIIlllllI[0];
                "".length();
                if (("  ".length() & ~"  ".length()) > 0) {
                    return;
                }
                while (!lIlIlllIIIlllIl(lllllllllllllIlIlIlllIIlIIIlIIIl, lllllllllllllIlIlIlllIIlIIIlIIlI)) {
                    final IChatComponent lllllllllllllIlIlIlllIIlIIIlIIII = this.field_175386_A.get(lllllllllllllIlIlIlllIIlIIIlIIIl);
                    this.fontRendererObj.drawString(lllllllllllllIlIlIlllIIlIIIlIIII.getUnformattedText(), lllllllllllllIlIlIlllIIlIIlIIIIl + GuiScreenBook.lllllIIlllllI[34], lllllllllllllIlIlIlllIIlIIlIIIII + GuiScreenBook.lllllIIlllllI[26] + GuiScreenBook.lllllIIlllllI[26] + lllllllllllllIlIlIlllIIlIIIlIIIl * this.fontRendererObj.FONT_HEIGHT, GuiScreenBook.lllllIIlllllI[0]);
                    "".length();
                    ++lllllllllllllIlIlIlllIIlIIIlIIIl;
                }
                final IChatComponent lllllllllllllIlIlIlllIIlIIIIllll = this.func_175385_b(lllllllllllllIlIlIlllIIlIIlIIlII, lllllllllllllIlIlIlllIIlIIIIllII);
                if (lIlIlllIIIlIllI(lllllllllllllIlIlIlllIIlIIIIllll)) {
                    this.handleComponentHover(lllllllllllllIlIlIlllIIlIIIIllll, lllllllllllllIlIlIlllIIlIIlIIlII, lllllllllllllIlIlIlllIIlIIIIllII);
                }
            }
        }
        super.drawScreen(lllllllllllllIlIlIlllIIlIIlIIlII, lllllllllllllIlIlIlllIIlIIIIllII, lllllllllllllIlIlIlllIIlIIlIIIlI);
    }
    
    private static boolean lIlIlllIIIllllI(final int lllllllllllllIlIlIlllIIIIllIlIII) {
        return lllllllllllllIlIlIlllIIIIllIlIII > 0;
    }
    
    private static boolean lIlIlllIIIlllIl(final int lllllllllllllIlIlIlllIIIlIIIIlIl, final int lllllllllllllIlIlIlllIIIlIIIIlII) {
        return lllllllllllllIlIlIlllIIIlIIIIlIl >= lllllllllllllIlIlIlllIIIlIIIIlII;
    }
    
    private static boolean lIlIlllIIIlllll(final int lllllllllllllIlIlIlllIIIIlllllIl, final int lllllllllllllIlIlIlllIIIIlllllII) {
        return lllllllllllllIlIlIlllIIIIlllllIl <= lllllllllllllIlIlIlllIIIIlllllII;
    }
    
    private static boolean lIlIlllIIIlIllI(final Object lllllllllllllIlIlIlllIIIIlllIllI) {
        return lllllllllllllIlIlIlllIIIIlllIllI != null;
    }
    
    private void updateButtons() {
        final NextPageButton buttonNextPage = this.buttonNextPage;
        int visible;
        if (lIlIlllIIIlllII(this.bookGettingSigned ? 1 : 0) && (!lIlIlllIIIlllIl(this.currPage, this.bookTotalPages - GuiScreenBook.lllllIIlllllI[2]) || lIlIlllIIIlIlIl(this.bookIsUnsigned ? 1 : 0))) {
            visible = GuiScreenBook.lllllIIlllllI[2];
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        else {
            visible = GuiScreenBook.lllllIIlllllI[0];
        }
        buttonNextPage.visible = (visible != 0);
        final NextPageButton buttonPreviousPage = this.buttonPreviousPage;
        int visible2;
        if (lIlIlllIIIlllII(this.bookGettingSigned ? 1 : 0) && lIlIlllIIIllllI(this.currPage)) {
            visible2 = GuiScreenBook.lllllIIlllllI[2];
            "".length();
            if (-(0x4D ^ 0x49) > 0) {
                return;
            }
        }
        else {
            visible2 = GuiScreenBook.lllllIIlllllI[0];
        }
        buttonPreviousPage.visible = (visible2 != 0);
        final GuiButton buttonDone = this.buttonDone;
        int visible3;
        if (lIlIlllIIIlIlIl(this.bookIsUnsigned ? 1 : 0) && lIlIlllIIIlIlIl(this.bookGettingSigned ? 1 : 0)) {
            visible3 = GuiScreenBook.lllllIIlllllI[0];
            "".length();
            if ("   ".length() <= -" ".length()) {
                return;
            }
        }
        else {
            visible3 = GuiScreenBook.lllllIIlllllI[2];
        }
        buttonDone.visible = (visible3 != 0);
        if (lIlIlllIIIlIlIl(this.bookIsUnsigned ? 1 : 0)) {
            final GuiButton buttonSign = this.buttonSign;
            int visible4;
            if (lIlIlllIIIlIlIl(this.bookGettingSigned ? 1 : 0)) {
                visible4 = GuiScreenBook.lllllIIlllllI[0];
                "".length();
                if ("   ".length() >= (107 + 185 - 205 + 107 ^ 24 + 93 - 100 + 181)) {
                    return;
                }
            }
            else {
                visible4 = GuiScreenBook.lllllIIlllllI[2];
            }
            buttonSign.visible = (visible4 != 0);
            this.buttonCancel.visible = this.bookGettingSigned;
            this.buttonFinalize.visible = this.bookGettingSigned;
            final GuiButton buttonFinalize = this.buttonFinalize;
            int enabled;
            if (lIlIlllIIIllllI(this.bookTitle.trim().length())) {
                enabled = GuiScreenBook.lllllIIlllllI[2];
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            }
            else {
                enabled = GuiScreenBook.lllllIIlllllI[0];
            }
            buttonFinalize.enabled = (enabled != 0);
        }
    }
    
    @Override
    protected void actionPerformed(final GuiButton lllllllllllllIlIlIlllIIlIllIlllI) throws IOException {
        if (lIlIlllIIIlIlIl(lllllllllllllIlIlIlllIIlIllIlllI.enabled ? 1 : 0)) {
            if (lIlIlllIIIlllII(lllllllllllllIlIlIlllIIlIllIlllI.id)) {
                this.mc.displayGuiScreen(null);
                this.sendBookToServer((boolean)(GuiScreenBook.lllllIIlllllI[0] != 0));
                "".length();
                if ("   ".length() > "   ".length()) {
                    return;
                }
            }
            else if (lIlIlllIIlIIIII(lllllllllllllIlIlIlllIIlIllIlllI.id, GuiScreenBook.lllllIIlllllI[6]) && lIlIlllIIIlIlIl(this.bookIsUnsigned ? 1 : 0)) {
                this.bookGettingSigned = (GuiScreenBook.lllllIIlllllI[2] != 0);
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
            }
            else if (lIlIlllIIlIIIII(lllllllllllllIlIlIlllIIlIllIlllI.id, GuiScreenBook.lllllIIlllllI[2])) {
                if (lIlIlllIIIlIlll(this.currPage, this.bookTotalPages - GuiScreenBook.lllllIIlllllI[2])) {
                    this.currPage += GuiScreenBook.lllllIIlllllI[2];
                    "".length();
                    if (-" ".length() >= "   ".length()) {
                        return;
                    }
                }
                else if (lIlIlllIIIlIlIl(this.bookIsUnsigned ? 1 : 0)) {
                    this.addNewPage();
                    if (lIlIlllIIIlIlll(this.currPage, this.bookTotalPages - GuiScreenBook.lllllIIlllllI[2])) {
                        this.currPage += GuiScreenBook.lllllIIlllllI[2];
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                }
            }
            else if (lIlIlllIIlIIIII(lllllllllllllIlIlIlllIIlIllIlllI.id, GuiScreenBook.lllllIIlllllI[4])) {
                if (lIlIlllIIIllllI(this.currPage)) {
                    this.currPage -= GuiScreenBook.lllllIIlllllI[2];
                    "".length();
                    if ("  ".length() <= -" ".length()) {
                        return;
                    }
                }
            }
            else if (lIlIlllIIlIIIII(lllllllllllllIlIlIlllIIlIllIlllI.id, GuiScreenBook.lllllIIlllllI[11]) && lIlIlllIIIlIlIl(this.bookGettingSigned ? 1 : 0)) {
                this.sendBookToServer((boolean)(GuiScreenBook.lllllIIlllllI[2] != 0));
                this.mc.displayGuiScreen(null);
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
            }
            else if (lIlIlllIIlIIIII(lllllllllllllIlIlIlllIIlIllIlllI.id, GuiScreenBook.lllllIIlllllI[8]) && lIlIlllIIIlIlIl(this.bookGettingSigned ? 1 : 0)) {
                this.bookGettingSigned = (GuiScreenBook.lllllIIlllllI[0] != 0);
            }
            this.updateButtons();
        }
    }
    
    public GuiScreenBook(final EntityPlayer lllllllllllllIlIlIlllIIllIIlllll, final ItemStack lllllllllllllIlIlIlllIIllIIllllI, final boolean lllllllllllllIlIlIlllIIllIIlllIl) {
        this.bookImageWidth = GuiScreenBook.lllllIIlllllI[1];
        this.bookImageHeight = GuiScreenBook.lllllIIlllllI[1];
        this.bookTotalPages = GuiScreenBook.lllllIIlllllI[2];
        this.bookTitle = GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[2]];
        this.field_175387_B = GuiScreenBook.lllllIIlllllI[3];
        this.editingPlayer = lllllllllllllIlIlIlllIIllIIlllll;
        this.bookObj = lllllllllllllIlIlIlllIIllIIllllI;
        this.bookIsUnsigned = lllllllllllllIlIlIlllIIllIIlllIl;
        if (lIlIlllIIIlIlIl(lllllllllllllIlIlIlllIIllIIllllI.hasTagCompound() ? 1 : 0)) {
            final NBTTagCompound lllllllllllllIlIlIlllIIllIIlllII = lllllllllllllIlIlIlllIIllIIllllI.getTagCompound();
            this.bookPages = lllllllllllllIlIlIlllIIllIIlllII.getTagList(GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[4]], GuiScreenBook.lllllIIlllllI[5]);
            if (lIlIlllIIIlIllI(this.bookPages)) {
                this.bookPages = (NBTTagList)this.bookPages.copy();
                this.bookTotalPages = this.bookPages.tagCount();
                if (lIlIlllIIIlIlll(this.bookTotalPages, GuiScreenBook.lllllIIlllllI[2])) {
                    this.bookTotalPages = GuiScreenBook.lllllIIlllllI[2];
                }
            }
        }
        if (lIlIlllIIIllIII(this.bookPages) && lIlIlllIIIlIlIl(lllllllllllllIlIlIlllIIllIIlllIl ? 1 : 0)) {
            this.bookPages = new NBTTagList();
            this.bookPages.appendTag(new NBTTagString(GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[6]]));
            this.bookTotalPages = GuiScreenBook.lllllIIlllllI[2];
        }
    }
    
    static {
        lIlIlllIIIlIlII();
        lIlIlllIIIIlIII();
        logger = LogManager.getLogger();
        bookGuiTextures = new ResourceLocation(GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[0]]);
    }
    
    @Override
    protected boolean handleComponentClick(final IChatComponent lllllllllllllIlIlIlllIIIlllIIllI) {
        ClickEvent chatClickEvent;
        if (lIlIlllIIIllIII(lllllllllllllIlIlIlllIIIlllIIllI)) {
            chatClickEvent = null;
            "".length();
            if ("   ".length() == 0) {
                return ((163 + 181 - 164 + 15 ^ 138 + 1 - 32 + 36) & (170 + 199 - 284 + 126 ^ 41 + 73 + 24 + 21 ^ -" ".length())) != 0x0;
            }
        }
        else {
            chatClickEvent = lllllllllllllIlIlIlllIIIlllIIllI.getChatStyle().getChatClickEvent();
        }
        final ClickEvent lllllllllllllIlIlIlllIIIlllIlIll = chatClickEvent;
        if (lIlIlllIIIllIII(lllllllllllllIlIlIlllIIIlllIlIll)) {
            return GuiScreenBook.lllllIIlllllI[0] != 0;
        }
        if (lIlIlllIIlIIIll(lllllllllllllIlIlIlllIIIlllIlIll.getAction(), ClickEvent.Action.CHANGE_PAGE)) {
            final String lllllllllllllIlIlIlllIIIlllIlIlI = lllllllllllllIlIlIlllIIIlllIlIll.getValue();
            try {
                final int lllllllllllllIlIlIlllIIIlllIlIIl = Integer.parseInt(lllllllllllllIlIlIlllIIIlllIlIlI) - GuiScreenBook.lllllIIlllllI[2];
                if (lIlIlllIIlIIIIl(lllllllllllllIlIlIlllIIIlllIlIIl) && lIlIlllIIIlIlll(lllllllllllllIlIlIlllIIIlllIlIIl, this.bookTotalPages) && lIlIlllIIlIIIlI(lllllllllllllIlIlIlllIIIlllIlIIl, this.currPage)) {
                    this.currPage = lllllllllllllIlIlIlllIIIlllIlIIl;
                    this.updateButtons();
                    return GuiScreenBook.lllllIIlllllI[2] != 0;
                }
            }
            catch (Throwable t) {}
            return GuiScreenBook.lllllIIlllllI[0] != 0;
        }
        final boolean lllllllllllllIlIlIlllIIIlllIlIII = super.handleComponentClick(lllllllllllllIlIlIlllIIIlllIIllI);
        if (lIlIlllIIIlIlIl(lllllllllllllIlIlIlllIIIlllIlIII ? 1 : 0) && lIlIlllIIlIIIll(lllllllllllllIlIlIlllIIIlllIlIll.getAction(), ClickEvent.Action.RUN_COMMAND)) {
            this.mc.displayGuiScreen(null);
        }
        return lllllllllllllIlIlIlllIIIlllIlIII;
    }
    
    private void pageSetCurrent(final String lllllllllllllIlIlIlllIIlIlIIIIlI) {
        if (lIlIlllIIIlIllI(this.bookPages) && lIlIlllIIlIIIIl(this.currPage) && lIlIlllIIIlIlll(this.currPage, this.bookPages.tagCount())) {
            this.bookPages.set(this.currPage, new NBTTagString(lllllllllllllIlIlIlllIIlIlIIIIlI));
            this.bookIsModified = (GuiScreenBook.lllllIIlllllI[2] != 0);
        }
    }
    
    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)(GuiScreenBook.lllllIIlllllI[0] != 0));
    }
    
    private static boolean lIlIlllIIlIIIIl(final int lllllllllllllIlIlIlllIIIIllIlIlI) {
        return lllllllllllllIlIlIlllIIIIllIlIlI >= 0;
    }
    
    private static String lIlIllIllllllll(final String lllllllllllllIlIlIlllIIIlIIlllII, final String lllllllllllllIlIlIlllIIIlIIlllIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlllIIIlIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlllIIIlIIlllIl.getBytes(StandardCharsets.UTF_8)), GuiScreenBook.lllllIIlllllI[5]), "DES");
            final Cipher lllllllllllllIlIlIlllIIIlIlIIIII = Cipher.getInstance("DES");
            lllllllllllllIlIlIlllIIIlIlIIIII.init(GuiScreenBook.lllllIIlllllI[4], lllllllllllllIlIlIlllIIIlIlIIIIl);
            return new String(lllllllllllllIlIlIlllIIIlIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlllIIIlIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlllIIIlIIlllll) {
            lllllllllllllIlIlIlllIIIlIIlllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIlllIIIlllII(final int lllllllllllllIlIlIlllIIIIllIllII) {
        return lllllllllllllIlIlIlllIIIIllIllII == 0;
    }
    
    private static boolean lIlIlllIIIlIlll(final int lllllllllllllIlIlIlllIIIlIIIIIIl, final int lllllllllllllIlIlIlllIIIlIIIIIII) {
        return lllllllllllllIlIlIlllIIIlIIIIIIl < lllllllllllllIlIlIlllIIIlIIIIIII;
    }
    
    private void keyTypedInTitle(final char lllllllllllllIlIlIlllIIlIlIIllII, final int lllllllllllllIlIlIlllIIlIlIIlllI) throws IOException {
        switch (lllllllllllllIlIlIlllIIlIlIIlllI) {
            case 14: {
                if (lIlIlllIIIlllII(this.bookTitle.isEmpty() ? 1 : 0)) {
                    this.bookTitle = this.bookTitle.substring(GuiScreenBook.lllllIIlllllI[0], this.bookTitle.length() - GuiScreenBook.lllllIIlllllI[2]);
                    this.updateButtons();
                }
            }
            case 28:
            case 156: {
                if (lIlIlllIIIlllII(this.bookTitle.isEmpty() ? 1 : 0)) {
                    this.sendBookToServer((boolean)(GuiScreenBook.lllllIIlllllI[2] != 0));
                    this.mc.displayGuiScreen(null);
                }
            }
            default: {
                if (lIlIlllIIIlIlll(this.bookTitle.length(), GuiScreenBook.lllllIIlllllI[26]) && lIlIlllIIIlIlIl(ChatAllowedCharacters.isAllowedCharacter(lllllllllllllIlIlIlllIIlIlIIllII) ? 1 : 0)) {
                    this.bookTitle = String.valueOf(new StringBuilder(String.valueOf(this.bookTitle)).append(Character.toString(lllllllllllllIlIlIlllIIlIlIIllII)));
                    this.updateButtons();
                    this.bookIsModified = (GuiScreenBook.lllllIIlllllI[2] != 0);
                }
            }
        }
    }
    
    private static boolean lIlIlllIIlIIlII(final int lllllllllllllIlIlIlllIIIIllllIIl, final int lllllllllllllIlIlIlllIIIIllllIII) {
        return lllllllllllllIlIlIlllIIIIllllIIl > lllllllllllllIlIlIlllIIIIllllIII;
    }
    
    private String pageGetCurrent() {
        String stringTag;
        if (lIlIlllIIIlIllI(this.bookPages) && lIlIlllIIlIIIIl(this.currPage) && lIlIlllIIIlIlll(this.currPage, this.bookPages.tagCount())) {
            stringTag = this.bookPages.getStringTagAt(this.currPage);
            "".length();
            if ((0x1B ^ 0x26 ^ (0x8D ^ 0xB4)) == " ".length()) {
                return null;
            }
        }
        else {
            stringTag = GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[27]];
        }
        return stringTag;
    }
    
    private static boolean lIlIlllIIlIIIII(final int lllllllllllllIlIlIlllIIIlIIIlIIl, final int lllllllllllllIlIlIlllIIIlIIIlIII) {
        return lllllllllllllIlIlIlllIIIlIIIlIIl == lllllllllllllIlIlIlllIIIlIIIlIII;
    }
    
    private static boolean lIlIlllIIlIIIlI(final int lllllllllllllIlIlIlllIIIIllIIlIl, final int lllllllllllllIlIlIlllIIIIllIIlII) {
        return lllllllllllllIlIlIlllIIIIllIIlIl != lllllllllllllIlIlIlllIIIIllIIlII;
    }
    
    private void pageInsertIntoCurrent(final String lllllllllllllIlIlIlllIIlIIlllIll) {
        final String lllllllllllllIlIlIlllIIlIIlllIlI = this.pageGetCurrent();
        final String lllllllllllllIlIlIlllIIlIIlllIIl = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIlIlllIIlIIlllIlI)).append(lllllllllllllIlIlIlllIIlIIlllIll));
        final int lllllllllllllIlIlIlllIIlIIlllIII = this.fontRendererObj.splitStringWidth(String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIlIlllIIlIIlllIIl)).append(EnumChatFormatting.BLACK).append(GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[28]])), GuiScreenBook.lllllIIlllllI[29]);
        if (lIlIlllIIIlllll(lllllllllllllIlIlIlllIIlIIlllIII, GuiScreenBook.lllllIIlllllI[30]) && lIlIlllIIIlIlll(lllllllllllllIlIlIlllIIlIIlllIIl.length(), GuiScreenBook.lllllIIlllllI[31])) {
            this.pageSetCurrent(lllllllllllllIlIlIlllIIlIIlllIIl);
        }
    }
    
    private static void lIlIlllIIIIlIII() {
        (lllllIIllIIll = new String[GuiScreenBook.lllllIIlllllI[47]])[GuiScreenBook.lllllIIlllllI[0]] = lIlIllIllllllII("FgI5DCUQAjJXNxcObho/DQxvCD4F", "bgAxP");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[2]] = lIlIllIllllllII("", "cionH");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[4]] = lIlIllIllllllII("FzMDPQk=", "gRdXz");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[6]] = lIlIllIllllllII("", "peUjL");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[8]] = lIlIllIllllllIl("9YZgA6yXWDq+eqU7/g2T0w==", "QlFet");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[11]] = lIlIllIllllllll("yfUaYVxVxtNFpRGfM0J4bQ==", "sMYxD");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[12]] = lIlIllIllllllII("MAY+PGY0AD82JDsTNBU9Jh0+OQ==", "RiQWH");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[13]] = lIlIllIllllllIl("aLkKkWxjVXsY4/8fY7Gs8Q==", "AvXRF");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[5]] = lIlIllIllllllII("EwYlZRIbHSk=", "tsLKv");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[18]] = lIlIllIllllllll("XgcjhmRke80=", "bPsme");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[19]] = lIlIllIllllllII("ISM1LSU=", "QBRHV");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[20]] = lIlIllIllllllll("4bsrYtIYxt+oa0YGJHz4Mw==", "ypxQT");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[21]] = lIlIllIllllllll("66t/lydrcEMSI68LkO/wfw==", "ERDPn");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[22]] = lIlIllIllllllII("GyMzDAwI", "zVGdc");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[23]] = lIlIllIllllllll("Tlmttp8C5Xs=", "LpWhJ");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[25]] = lIlIllIllllllII("", "lVXnw");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[26]] = lIlIllIllllllIl("D59hOTCuiLY=", "UbgVV");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[27]] = lIlIllIllllllII("", "AaLqg");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[28]] = lIlIllIllllllII("DA==", "SJlHr");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[32]] = lIlIllIllllllIl("v5YsCZBCI90=", "tykeE");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[10]] = lIlIllIllllllIl("hE8LXG0ykf0=", "RDoLg");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[33]] = lIlIllIllllllII("FBU+PVoTHjgiIB8OPTM=", "vzQVt");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[37]] = lIlIllIllllllII("ECQsPUMQMgIjGRokMQ==", "rKCVm");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[38]] = lIlIllIllllllII("CxYsDFgPEC0GGgADJjAXGxcqCRE=", "iyCgv");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[40]] = lIlIllIllllllll("XjZ6om0BwtIwaHBqHkC4y4AjzFMY9DSh", "ouJXe");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[41]] = lIlIllIllllllII("", "nRhbx");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[42]] = lIlIllIllllllIl("88Dml0ThyTk=", "NGPoI");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[43]] = lIlIllIllllllll("X47sPS9ysFA=", "TQNKx");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[44]] = lIlIllIllllllll("B9xJpHNxD1s=", "bwQlT");
        GuiScreenBook.lllllIIllIIll[GuiScreenBook.lllllIIlllllI[45]] = lIlIllIllllllIl("9f3lxvQOg1Gnp2itfgulaI8jQ1XqS+kh", "NNKwT");
    }
    
    @Override
    public void updateScreen() {
        super.updateScreen();
        this.updateCount += GuiScreenBook.lllllIIlllllI[2];
    }
    
    static class NextPageButton extends GuiButton
    {
        private final /* synthetic */ boolean field_146151_o;
        private static final /* synthetic */ String[] llIIIIlIIlIlII;
        private static final /* synthetic */ int[] llIIIIlIIlIlIl;
        
        @Override
        public void drawButton(final Minecraft llllllllllllIlllIlllIIIIllIllIII, final int llllllllllllIlllIlllIIIIllIlIIII, final int llllllllllllIlllIlllIIIIllIIllll) {
            if (lIIIIlllllIIIIlI(this.visible ? 1 : 0)) {
                int n;
                if (lIIIIlllllIIIIll(llllllllllllIlllIlllIIIIllIlIIII, this.xPosition) && lIIIIlllllIIIIll(llllllllllllIlllIlllIIIIllIIllll, this.yPosition) && lIIIIlllllIIIlII(llllllllllllIlllIlllIIIIllIlIIII, this.xPosition + this.width) && lIIIIlllllIIIlII(llllllllllllIlllIlllIIIIllIIllll, this.yPosition + this.height)) {
                    n = NextPageButton.llIIIIlIIlIlIl[3];
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    n = NextPageButton.llIIIIlIIlIlIl[2];
                }
                final boolean llllllllllllIlllIlllIIIIllIlIlIl = n != 0;
                GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
                llllllllllllIlllIlllIIIIllIllIII.getTextureManager().bindTexture(GuiScreenBook.bookGuiTextures);
                int llllllllllllIlllIlllIIIIllIlIlII = NextPageButton.llIIIIlIIlIlIl[2];
                int llllllllllllIlllIlllIIIIllIlIIll = NextPageButton.llIIIIlIIlIlIl[4];
                if (lIIIIlllllIIIIlI(llllllllllllIlllIlllIIIIllIlIlIl ? 1 : 0)) {
                    llllllllllllIlllIlllIIIIllIlIlII += 23;
                }
                if (lIIIIlllllIIIlIl(this.field_146151_o ? 1 : 0)) {
                    llllllllllllIlllIlllIIIIllIlIIll += 13;
                }
                this.drawTexturedModalRect(this.xPosition, this.yPosition, llllllllllllIlllIlllIIIIllIlIlII, llllllllllllIlllIlllIIIIllIlIIll, NextPageButton.llIIIIlIIlIlIl[0], NextPageButton.llIIIIlIIlIlIl[1]);
            }
        }
        
        public NextPageButton(final int llllllllllllIlllIlllIIIIlllIlIIl, final int llllllllllllIlllIlllIIIIlllIIIll, final int llllllllllllIlllIlllIIIIlllIIIlI, final boolean llllllllllllIlllIlllIIIIlllIIIIl) {
            super(llllllllllllIlllIlllIIIIlllIlIIl, llllllllllllIlllIlllIIIIlllIIIll, llllllllllllIlllIlllIIIIlllIIIlI, NextPageButton.llIIIIlIIlIlIl[0], NextPageButton.llIIIIlIIlIlIl[1], NextPageButton.llIIIIlIIlIlII[NextPageButton.llIIIIlIIlIlIl[2]]);
            this.field_146151_o = llllllllllllIlllIlllIIIIlllIIIIl;
        }
        
        private static boolean lIIIIlllllIIIIll(final int llllllllllllIlllIlllIIIIlIllllII, final int llllllllllllIlllIlllIIIIlIlllIll) {
            return llllllllllllIlllIlllIIIIlIllllII >= llllllllllllIlllIlllIIIIlIlllIll;
        }
        
        private static void lIIIIlllllIIIIII() {
            (llIIIIlIIlIlII = new String[NextPageButton.llIIIIlIIlIlIl[3]])[NextPageButton.llIIIIlIIlIlIl[2]] = lIIIIllllIllllll("ECAVRSfb59g=", "TvuZu");
        }
        
        private static String lIIIIllllIllllll(final String llllllllllllIlllIlllIIIIllIIIIlI, final String llllllllllllIlllIlllIIIIllIIIIll) {
            try {
                final SecretKeySpec llllllllllllIlllIlllIIIIllIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlllIIIIllIIIIll.getBytes(StandardCharsets.UTF_8)), NextPageButton.llIIIIlIIlIlIl[5]), "DES");
                final Cipher llllllllllllIlllIlllIIIIllIIIllI = Cipher.getInstance("DES");
                llllllllllllIlllIlllIIIIllIIIllI.init(NextPageButton.llIIIIlIIlIlIl[6], llllllllllllIlllIlllIIIIllIIIlll);
                return new String(llllllllllllIlllIlllIIIIllIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlllIIIIllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIlllIIIIllIIIlIl) {
                llllllllllllIlllIlllIIIIllIIIlIl.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIIIlllllIIIlII(final int llllllllllllIlllIlllIIIIlIlllIII, final int llllllllllllIlllIlllIIIIlIllIlll) {
            return llllllllllllIlllIlllIIIIlIlllIII < llllllllllllIlllIlllIIIIlIllIlll;
        }
        
        private static boolean lIIIIlllllIIIlIl(final int llllllllllllIlllIlllIIIIlIllIIll) {
            return llllllllllllIlllIlllIIIIlIllIIll == 0;
        }
        
        private static void lIIIIlllllIIIIIl() {
            (llIIIIlIIlIlIl = new int[7])[0] = (0xB9 ^ 0xAE);
            NextPageButton.llIIIIlIIlIlIl[1] = (0x72 ^ 0x40 ^ (0x0 ^ 0x3F));
            NextPageButton.llIIIIlIIlIlIl[2] = ((0x37 ^ 0x3C) & ~(0x62 ^ 0x69));
            NextPageButton.llIIIIlIIlIlIl[3] = " ".length();
            NextPageButton.llIIIIlIIlIlIl[4] = 139 + 128 - 103 + 25 + (0x1A ^ 0x72) - (133 + 49 - 142 + 102) + (0x28 ^ 0x1);
            NextPageButton.llIIIIlIIlIlIl[5] = (0xAB ^ 0xA3);
            NextPageButton.llIIIIlIIlIlIl[6] = "  ".length();
        }
        
        static {
            lIIIIlllllIIIIIl();
            lIIIIlllllIIIIII();
        }
        
        private static boolean lIIIIlllllIIIIlI(final int llllllllllllIlllIlllIIIIlIllIlIl) {
            return llllllllllllIlllIlllIIIIlIllIlIl != 0;
        }
    }
}
