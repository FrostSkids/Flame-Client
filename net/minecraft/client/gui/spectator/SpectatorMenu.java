// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui.spectator;

import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiSpectator;
import net.minecraft.client.Minecraft;
import com.google.common.base.Objects;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.common.collect.Lists;
import net.minecraft.client.gui.spectator.categories.SpectatorDetails;
import java.util.List;

public class SpectatorMenu
{
    private static final /* synthetic */ ISpectatorMenuObject field_178655_b;
    private static final /* synthetic */ ISpectatorMenuObject field_178656_c;
    private /* synthetic */ ISpectatorMenuView field_178659_h;
    private final /* synthetic */ ISpectatorMenuRecipient field_178651_f;
    private static final /* synthetic */ int[] lIIIlIlIllIIlI;
    private static final /* synthetic */ ISpectatorMenuObject field_178654_e;
    private /* synthetic */ int field_178658_j;
    public static final /* synthetic */ ISpectatorMenuObject field_178657_a;
    private static final /* synthetic */ ISpectatorMenuObject field_178653_d;
    private /* synthetic */ int field_178660_i;
    private final /* synthetic */ List<SpectatorDetails> field_178652_g;
    
    public void func_178644_b(final int lllllllllllllIlIIIIllIlIIIIIllII) {
        final ISpectatorMenuObject lllllllllllllIlIIIIllIlIIIIIlllI = this.func_178643_a(lllllllllllllIlIIIIllIlIIIIIllII);
        if (llIIIIIlIlIlIIl(lllllllllllllIlIIIIllIlIIIIIlllI, SpectatorMenu.field_178657_a)) {
            if (llIIIIIlIlIIlIl(this.field_178660_i, lllllllllllllIlIIIIllIlIIIIIllII) && llIIIIIlIlIlIlI(lllllllllllllIlIIIIllIlIIIIIlllI.func_178662_A_() ? 1 : 0)) {
                lllllllllllllIlIIIIllIlIIIIIlllI.func_178661_a(this);
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
            }
            else {
                this.field_178660_i = lllllllllllllIlIIIIllIlIIIIIllII;
            }
        }
    }
    
    static /* synthetic */ void access$0(final SpectatorMenu lllllllllllllIlIIIIllIIllllllIIl, final int lllllllllllllIlIIIIllIIllllllIII) {
        lllllllllllllIlIIIIllIIllllllIIl.field_178658_j = lllllllllllllIlIIIIllIIllllllIII;
    }
    
    public SpectatorMenu(final ISpectatorMenuRecipient lllllllllllllIlIIIIllIlIIIlIllII) {
        this.field_178652_g = (List<SpectatorDetails>)Lists.newArrayList();
        this.field_178659_h = new BaseSpectatorGroup();
        this.field_178660_i = SpectatorMenu.lIIIlIlIllIIlI[0];
        this.field_178651_f = lllllllllllllIlIIIIllIlIIIlIllII;
    }
    
    public ISpectatorMenuView func_178650_c() {
        return this.field_178659_h;
    }
    
    private static boolean llIIIIIlIlIIIll(final int lllllllllllllIlIIIIllIIllllIIIII) {
        return lllllllllllllIlIIIIllIIllllIIIII > 0;
    }
    
    private static boolean llIIIIIlIlIIlIl(final int lllllllllllllIlIIIIllIIlllllIlIl, final int lllllllllllllIlIIIIllIIlllllIlII) {
        return lllllllllllllIlIIIIllIIlllllIlIl == lllllllllllllIlIIIIllIIlllllIlII;
    }
    
    private static boolean llIIIIIlIlIIlII(final int lllllllllllllIlIIIIllIIllllIIlII) {
        return lllllllllllllIlIIIIllIIllllIIlII == 0;
    }
    
    public int func_178648_e() {
        return this.field_178660_i;
    }
    
    private static boolean llIIIIIlIlIIllI(final int lllllllllllllIlIIIIllIIlllllIIIl, final int lllllllllllllIlIIIIllIIlllllIIII) {
        return lllllllllllllIlIIIIllIIlllllIIIl < lllllllllllllIlIIIIllIIlllllIIII;
    }
    
    public SpectatorDetails func_178646_f() {
        return new SpectatorDetails(this.field_178659_h, this.func_178642_a(), this.field_178660_i);
    }
    
    private static boolean llIIIIIlIlIlIIl(final Object lllllllllllllIlIIIIllIIllllIlIIl, final Object lllllllllllllIlIIIIllIIllllIlIII) {
        return lllllllllllllIlIIIIllIIllllIlIIl != lllllllllllllIlIIIIllIIllllIlIII;
    }
    
    static {
        llIIIIIlIlIIIlI();
        field_178655_b = new EndSpectatorObject(null);
        field_178656_c = new MoveMenuObject(SpectatorMenu.lIIIlIlIllIIlI[0], (boolean)(SpectatorMenu.lIIIlIlIllIIlI[1] != 0));
        field_178653_d = new MoveMenuObject(SpectatorMenu.lIIIlIlIllIIlI[1], (boolean)(SpectatorMenu.lIIIlIlIllIIlI[1] != 0));
        field_178654_e = new MoveMenuObject(SpectatorMenu.lIIIlIlIllIIlI[1], (boolean)(SpectatorMenu.lIIIlIlIllIIlI[2] != 0));
        field_178657_a = new ISpectatorMenuObject() {
            private static final /* synthetic */ String[] lIIIllIIIlllIl;
            private static final /* synthetic */ int[] lIIIllIIIlllll;
            
            private static void llIIIIllIIIllll() {
                (lIIIllIIIlllIl = new String[SpectatorMenu$1.lIIIllIIIlllll[1]])[SpectatorMenu$1.lIIIllIIIlllll[0]] = llIIIIllIIIlllI("xAvMglZz8DU=", "ZNHos");
            }
            
            private static void llIIIIllIIlIllI() {
                (lIIIllIIIlllll = new int[4])[0] = ((0x85 ^ 0x8D) & ~(0x78 ^ 0x70));
                SpectatorMenu$1.lIIIllIIIlllll[1] = " ".length();
                SpectatorMenu$1.lIIIllIIIlllll[2] = (0x45 ^ 0x4D);
                SpectatorMenu$1.lIIIllIIIlllll[3] = "  ".length();
            }
            
            @Override
            public boolean func_178662_A_() {
                return SpectatorMenu$1.lIIIllIIIlllll[0] != 0;
            }
            
            private static String llIIIIllIIIlllI(final String lllllllllllllIlIIIIIllIIlIIlIIlI, final String lllllllllllllIlIIIIIllIIlIIlIIIl) {
                try {
                    final SecretKeySpec lllllllllllllIlIIIIIllIIlIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIllIIlIIlIIIl.getBytes(StandardCharsets.UTF_8)), SpectatorMenu$1.lIIIllIIIlllll[2]), "DES");
                    final Cipher lllllllllllllIlIIIIIllIIlIIlIlII = Cipher.getInstance("DES");
                    lllllllllllllIlIIIIIllIIlIIlIlII.init(SpectatorMenu$1.lIIIllIIIlllll[3], lllllllllllllIlIIIIIllIIlIIlIlIl);
                    return new String(lllllllllllllIlIIIIIllIIlIIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIllIIlIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIlIIIIIllIIlIIlIIll) {
                    lllllllllllllIlIIIIIllIIlIIlIIll.printStackTrace();
                    return null;
                }
            }
            
            @Override
            public void func_178661_a(final SpectatorMenu lllllllllllllIlIIIIIllIIlIIlllll) {
            }
            
            static {
                llIIIIllIIlIllI();
                llIIIIllIIIllll();
            }
            
            @Override
            public IChatComponent getSpectatorName() {
                return new ChatComponentText(SpectatorMenu$1.lIIIllIIIlllIl[SpectatorMenu$1.lIIIllIIIlllll[0]]);
            }
            
            @Override
            public void func_178663_a(final float lllllllllllllIlIIIIIllIIlIIlllII, final int lllllllllllllIlIIIIIllIIlIIllIll) {
            }
        };
    }
    
    private static boolean llIIIIIlIlIIlll(final int lllllllllllllIlIIIIllIIllllIIIlI) {
        return lllllllllllllIlIIIIllIIllllIIIlI >= 0;
    }
    
    public void func_178641_d() {
        this.field_178651_f.func_175257_a(this);
    }
    
    public List<ISpectatorMenuObject> func_178642_a() {
        final List<ISpectatorMenuObject> lllllllllllllIlIIIIllIlIIIIllllI = (List<ISpectatorMenuObject>)Lists.newArrayList();
        int lllllllllllllIlIIIIllIlIIIIlllIl = SpectatorMenu.lIIIlIlIllIIlI[2];
        "".length();
        if (-"  ".length() > 0) {
            return null;
        }
        while (!llIIIIIlIlIlIII(lllllllllllllIlIIIIllIlIIIIlllIl, SpectatorMenu.lIIIlIlIllIIlI[5])) {
            lllllllllllllIlIIIIllIlIIIIllllI.add(this.func_178643_a(lllllllllllllIlIIIIllIlIIIIlllIl));
            "".length();
            ++lllllllllllllIlIIIIllIlIIIIlllIl;
        }
        return lllllllllllllIlIIIIllIlIIIIllllI;
    }
    
    public ISpectatorMenuObject func_178643_a(final int lllllllllllllIlIIIIllIlIIIlIIlll) {
        final int lllllllllllllIlIIIIllIlIIIlIIllI = lllllllllllllIlIIIIllIlIIIlIIlll + this.field_178658_j * SpectatorMenu.lIIIlIlIllIIlI[3];
        ISpectatorMenuObject spectatorMenuObject;
        if (llIIIIIlIlIIIll(this.field_178658_j) && llIIIIIlIlIIlII(lllllllllllllIlIIIIllIlIIIlIIlll)) {
            spectatorMenuObject = SpectatorMenu.field_178656_c;
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        else if (llIIIIIlIlIIlIl(lllllllllllllIlIIIIllIlIIIlIIlll, SpectatorMenu.lIIIlIlIllIIlI[4])) {
            if (llIIIIIlIlIIllI(lllllllllllllIlIIIIllIlIIIlIIllI, this.field_178659_h.func_178669_a().size())) {
                spectatorMenuObject = SpectatorMenu.field_178653_d;
                "".length();
                if ((0x8E ^ 0x8A) == 0x0) {
                    return null;
                }
            }
            else {
                spectatorMenuObject = SpectatorMenu.field_178654_e;
                "".length();
                if (" ".length() < 0) {
                    return null;
                }
            }
        }
        else if (llIIIIIlIlIIlIl(lllllllllllllIlIIIIllIlIIIlIIlll, SpectatorMenu.lIIIlIlIllIIlI[5])) {
            spectatorMenuObject = SpectatorMenu.field_178655_b;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        else if (llIIIIIlIlIIlll(lllllllllllllIlIIIIllIlIIIlIIllI) && llIIIIIlIlIIllI(lllllllllllllIlIIIIllIlIIIlIIllI, this.field_178659_h.func_178669_a().size())) {
            spectatorMenuObject = (ISpectatorMenuObject)Objects.firstNonNull((Object)this.field_178659_h.func_178669_a().get(lllllllllllllIlIIIIllIlIIIlIIllI), (Object)SpectatorMenu.field_178657_a);
            "".length();
            if ((0x98 ^ 0x9C) < 0) {
                return null;
            }
        }
        else {
            spectatorMenuObject = SpectatorMenu.field_178657_a;
        }
        return spectatorMenuObject;
    }
    
    private static void llIIIIIlIlIIIlI() {
        (lIIIlIlIllIIlI = new int[6])[0] = -" ".length();
        SpectatorMenu.lIIIlIlIllIIlI[1] = " ".length();
        SpectatorMenu.lIIIlIlIllIIlI[2] = ((160 + 16 + 4 + 12 ^ 113 + 58 - 79 + 44) & (187 + 105 - 135 + 67 ^ 58 + 108 - 29 + 31 ^ -" ".length()));
        SpectatorMenu.lIIIlIlIllIIlI[3] = (0x47 ^ 0x41);
        SpectatorMenu.lIIIlIlIllIIlI[4] = (38 + 110 - 16 + 33 ^ 101 + 67 - 154 + 148);
        SpectatorMenu.lIIIlIlIllIIlI[5] = (0xB6 ^ 0xBE);
    }
    
    private static boolean llIIIIIlIlIlIlI(final int lllllllllllllIlIIIIllIIllllIIllI) {
        return lllllllllllllIlIIIIllIIllllIIllI != 0;
    }
    
    private static boolean llIIIIIlIlIlIII(final int lllllllllllllIlIIIIllIIllllIllIl, final int lllllllllllllIlIIIIllIIllllIllII) {
        return lllllllllllllIlIIIIllIIllllIllIl > lllllllllllllIlIIIIllIIllllIllII;
    }
    
    public ISpectatorMenuObject func_178645_b() {
        return this.func_178643_a(this.field_178660_i);
    }
    
    public void func_178647_a(final ISpectatorMenuView lllllllllllllIlIIIIllIlIIIIIIIIl) {
        this.field_178652_g.add(this.func_178646_f());
        "".length();
        this.field_178659_h = lllllllllllllIlIIIIllIlIIIIIIIIl;
        this.field_178660_i = SpectatorMenu.lIIIlIlIllIIlI[0];
        this.field_178658_j = SpectatorMenu.lIIIlIlIllIIlI[2];
    }
    
    static class MoveMenuObject implements ISpectatorMenuObject
    {
        private final /* synthetic */ boolean field_178665_b;
        private static final /* synthetic */ int[] lIllllllllIllI;
        private static final /* synthetic */ String[] lIllllllllIlIl;
        private final /* synthetic */ int field_178666_a;
        
        private static boolean lIIIIllIIlIlIlll(final int llllllllllllIllllIIIlIlIllllIIlI) {
            return llllllllllllIllllIIIlIlIllllIIlI < 0;
        }
        
        private static String lIIIIllIIlIlIIll(String llllllllllllIllllIIIlIllIIIIllIl, final String llllllllllllIllllIIIlIllIIIlIIIl) {
            llllllllllllIllllIIIlIllIIIIllIl = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIIIlIllIIIIllIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllllIIIlIllIIIlIIII = new StringBuilder();
            final char[] llllllllllllIllllIIIlIllIIIIllll = llllllllllllIllllIIIlIllIIIlIIIl.toCharArray();
            int llllllllllllIllllIIIlIllIIIIlllI = MoveMenuObject.lIllllllllIllI[0];
            final byte llllllllllllIllllIIIlIllIIIIlIII = (Object)((String)llllllllllllIllllIIIlIllIIIIllIl).toCharArray();
            final float llllllllllllIllllIIIlIllIIIIIlll = llllllllllllIllllIIIlIllIIIIlIII.length;
            String llllllllllllIllllIIIlIllIIIIIllI = (String)MoveMenuObject.lIllllllllIllI[0];
            while (lIIIIllIIlIllIII((int)llllllllllllIllllIIIlIllIIIIIllI, (int)llllllllllllIllllIIIlIllIIIIIlll)) {
                final char llllllllllllIllllIIIlIllIIIlIIll = llllllllllllIllllIIIlIllIIIIlIII[llllllllllllIllllIIIlIllIIIIIllI];
                llllllllllllIllllIIIlIllIIIlIIII.append((char)(llllllllllllIllllIIIlIllIIIlIIll ^ llllllllllllIllllIIIlIllIIIIllll[llllllllllllIllllIIIlIllIIIIlllI % llllllllllllIllllIIIlIllIIIIllll.length]));
                "".length();
                ++llllllllllllIllllIIIlIllIIIIlllI;
                ++llllllllllllIllllIIIlIllIIIIIllI;
                "".length();
                if ("  ".length() >= "   ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllllIIIlIllIIIlIIII);
        }
        
        static {
            lIIIIllIIlIlIllI();
            lIIIIllIIlIlIlIl();
        }
        
        @Override
        public void func_178663_a(final float llllllllllllIllllIIIlIllIIlIIIlI, final int llllllllllllIllllIIIlIllIIlIIIIl) {
            Minecraft.getMinecraft().getTextureManager().bindTexture(GuiSpectator.field_175269_a);
            if (lIIIIllIIlIlIlll(this.field_178666_a)) {
                Gui.drawModalRectWithCustomSizedTexture(MoveMenuObject.lIllllllllIllI[0], MoveMenuObject.lIllllllllIllI[0], 144.0f, 0.0f, MoveMenuObject.lIllllllllIllI[2], MoveMenuObject.lIllllllllIllI[2], 256.0f, 256.0f);
                "".length();
                if (((0xB ^ 0xF) & ~(0xA6 ^ 0xA2)) != 0x0) {
                    return;
                }
            }
            else {
                Gui.drawModalRectWithCustomSizedTexture(MoveMenuObject.lIllllllllIllI[0], MoveMenuObject.lIllllllllIllI[0], 160.0f, 0.0f, MoveMenuObject.lIllllllllIllI[2], MoveMenuObject.lIllllllllIllI[2], 256.0f, 256.0f);
            }
        }
        
        @Override
        public void func_178661_a(final SpectatorMenu llllllllllllIllllIIIlIllIIlIlIlI) {
            SpectatorMenu.access$0(llllllllllllIllllIIIlIllIIlIlIlI, this.field_178666_a);
        }
        
        private static String lIIIIllIIlIlIlII(final String llllllllllllIllllIIIlIlIllllllIl, final String llllllllllllIllllIIIlIlIlllllIlI) {
            try {
                final SecretKeySpec llllllllllllIllllIIIlIllIIIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIlIlIlllllIlI.getBytes(StandardCharsets.UTF_8)), MoveMenuObject.lIllllllllIllI[4]), "DES");
                final Cipher llllllllllllIllllIIIlIlIllllllll = Cipher.getInstance("DES");
                llllllllllllIllllIIIlIlIllllllll.init(MoveMenuObject.lIllllllllIllI[3], llllllllllllIllllIIIlIllIIIIIIII);
                return new String(llllllllllllIllllIIIlIlIllllllll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIlIlIllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllIIIlIlIlllllllI) {
                llllllllllllIllllIIIlIlIlllllllI.printStackTrace();
                return null;
            }
        }
        
        @Override
        public boolean func_178662_A_() {
            return this.field_178665_b;
        }
        
        private static boolean lIIIIllIIlIllIII(final int llllllllllllIllllIIIlIlIllllIlIl, final int llllllllllllIllllIIIlIlIllllIlII) {
            return llllllllllllIllllIIIlIlIllllIlIl < llllllllllllIllllIIIlIlIllllIlII;
        }
        
        private static void lIIIIllIIlIlIllI() {
            (lIllllllllIllI = new int[5])[0] = ((0x96 ^ 0x87) & ~(0xAE ^ 0xBF));
            MoveMenuObject.lIllllllllIllI[1] = " ".length();
            MoveMenuObject.lIllllllllIllI[2] = (0x2F ^ 0x78 ^ (0x6B ^ 0x2C));
            MoveMenuObject.lIllllllllIllI[3] = "  ".length();
            MoveMenuObject.lIllllllllIllI[4] = (0x3F ^ 0x37);
        }
        
        @Override
        public IChatComponent getSpectatorName() {
            ChatComponentText chatComponentText;
            if (lIIIIllIIlIlIlll(this.field_178666_a)) {
                chatComponentText = new ChatComponentText(MoveMenuObject.lIllllllllIlIl[MoveMenuObject.lIllllllllIllI[0]]);
                "".length();
                if (" ".length() == 0) {
                    return null;
                }
            }
            else {
                chatComponentText = new ChatComponentText(MoveMenuObject.lIllllllllIlIl[MoveMenuObject.lIllllllllIllI[1]]);
            }
            return chatComponentText;
        }
        
        private static void lIIIIllIIlIlIlIl() {
            (lIllllllllIlIl = new String[MoveMenuObject.lIllllllllIllI[3]])[MoveMenuObject.lIllllllllIllI[0]] = lIIIIllIIlIlIIll("IB0tASIfGjtXGxEILQ==", "poHwK");
            MoveMenuObject.lIllllllllIlIl[MoveMenuObject.lIllllllllIllI[1]] = lIIIIllIIlIlIlII("BXyX2KhrwYOTEXjGhcSO9g==", "zXNDB");
        }
        
        public MoveMenuObject(final int llllllllllllIllllIIIlIllIIllIIlI, final boolean llllllllllllIllllIIIlIllIIlIlllI) {
            this.field_178666_a = llllllllllllIllllIIIlIllIIllIIlI;
            this.field_178665_b = llllllllllllIllllIIIlIllIIlIlllI;
        }
    }
    
    static class EndSpectatorObject implements ISpectatorMenuObject
    {
        private static final /* synthetic */ int[] lIIIIIIIIlIllI;
        private static final /* synthetic */ String[] lIIIIIIIIlIlIl;
        
        @Override
        public boolean func_178662_A_() {
            return EndSpectatorObject.lIIIIIIIIlIllI[2] != 0;
        }
        
        private static String lIllIIlIllIIlll(final String lllllllllllllIlIlIIlIIlIIllIllII, final String lllllllllllllIlIlIIlIIlIIllIlIIl) {
            try {
                final SecretKeySpec lllllllllllllIlIlIIlIIlIIllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIlIIlIIllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIlIIlIIlIIllIlllI = Cipher.getInstance("Blowfish");
                lllllllllllllIlIlIIlIIlIIllIlllI.init(EndSpectatorObject.lIIIIIIIIlIllI[3], lllllllllllllIlIlIIlIIlIIllIllll);
                return new String(lllllllllllllIlIlIIlIIlIIllIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIlIIlIIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlIIlIIlIIllIllIl) {
                lllllllllllllIlIlIIlIIlIIllIllIl.printStackTrace();
                return null;
            }
        }
        
        private static void lIllIIlIllIlIIl() {
            (lIIIIIIIIlIllI = new int[4])[0] = ((109 + 175 - 182 + 115 ^ 59 + 111 - 62 + 33) & (0x0 ^ 0x28 ^ (0x36 ^ 0x4A) ^ -" ".length()));
            EndSpectatorObject.lIIIIIIIIlIllI[1] = (128 + 86 - 114 + 66 ^ 147 + 100 - 75 + 10);
            EndSpectatorObject.lIIIIIIIIlIllI[2] = " ".length();
            EndSpectatorObject.lIIIIIIIIlIllI[3] = "  ".length();
        }
        
        @Override
        public void func_178661_a(final SpectatorMenu lllllllllllllIlIlIIlIIlIIlllllII) {
            lllllllllllllIlIlIIlIIlIIlllllII.func_178641_d();
        }
        
        @Override
        public void func_178663_a(final float lllllllllllllIlIlIIlIIlIIllllIII, final int lllllllllllllIlIlIIlIIlIIlllIlll) {
            Minecraft.getMinecraft().getTextureManager().bindTexture(GuiSpectator.field_175269_a);
            Gui.drawModalRectWithCustomSizedTexture(EndSpectatorObject.lIIIIIIIIlIllI[0], EndSpectatorObject.lIIIIIIIIlIllI[0], 128.0f, 0.0f, EndSpectatorObject.lIIIIIIIIlIllI[1], EndSpectatorObject.lIIIIIIIIlIllI[1], 256.0f, 256.0f);
        }
        
        static {
            lIllIIlIllIlIIl();
            lIllIIlIllIlIII();
        }
        
        private EndSpectatorObject() {
        }
        
        private static void lIllIIlIllIlIII() {
            (lIIIIIIIIlIlIl = new String[EndSpectatorObject.lIIIIIIIIlIllI[2]])[EndSpectatorObject.lIIIIIIIIlIllI[0]] = lIllIIlIllIIlll("uz7ItGPp5VYfmkUk4Naj1g==", "PgJyw");
        }
        
        @Override
        public IChatComponent getSpectatorName() {
            return new ChatComponentText(EndSpectatorObject.lIIIIIIIIlIlIl[EndSpectatorObject.lIIIIIIIIlIllI[0]]);
        }
    }
}
