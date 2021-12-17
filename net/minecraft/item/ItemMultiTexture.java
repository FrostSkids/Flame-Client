// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.common.base.Function;
import net.minecraft.block.Block;

public class ItemMultiTexture extends ItemBlock
{
    protected final /* synthetic */ Block theBlock;
    protected final /* synthetic */ Function<ItemStack, String> nameFunction;
    private static final /* synthetic */ int[] lllllIlIlIlIl;
    private static final /* synthetic */ String[] lllllIlIlIIll;
    
    private static String lIlIlllIlIlIlII(final String lllllllllllllIlIlIllIlIlIlIIlIll, final String lllllllllllllIlIlIllIlIlIlIIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIlIllIlIlIlIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIllIlIlIlIIlIlI.getBytes(StandardCharsets.UTF_8)), ItemMultiTexture.lllllIlIlIlIl[2]), "DES");
            final Cipher lllllllllllllIlIlIllIlIlIlIIllIl = Cipher.getInstance("DES");
            lllllllllllllIlIlIllIlIlIlIIllIl.init(ItemMultiTexture.lllllIlIlIlIl[3], lllllllllllllIlIlIllIlIlIlIIlllI);
            return new String(lllllllllllllIlIlIllIlIlIlIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIllIlIlIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIllIlIlIlIIllII) {
            lllllllllllllIlIlIllIlIlIlIIllII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String getUnlocalizedName(final ItemStack lllllllllllllIlIlIllIlIlIlIlIlIl) {
        return String.valueOf(new StringBuilder(String.valueOf(super.getUnlocalizedName())).append(ItemMultiTexture.lllllIlIlIIll[ItemMultiTexture.lllllIlIlIlIl[0]]).append((String)this.nameFunction.apply((Object)lllllllllllllIlIlIllIlIlIlIlIlIl)));
    }
    
    public ItemMultiTexture(final Block lllllllllllllIlIlIllIlIlIllIllll, final Block lllllllllllllIlIlIllIlIlIllIlllI, final Function<ItemStack, String> lllllllllllllIlIlIllIlIlIllIllIl) {
        super(lllllllllllllIlIlIllIlIlIllIllll);
        this.theBlock = lllllllllllllIlIlIllIlIlIllIlllI;
        this.nameFunction = lllllllllllllIlIlIllIlIlIllIllIl;
        this.setMaxDamage(ItemMultiTexture.lllllIlIlIlIl[0]);
        "".length();
        this.setHasSubtypes((boolean)(ItemMultiTexture.lllllIlIlIlIl[1] != 0));
        "".length();
    }
    
    private static void lIlIlllIlIlllII() {
        (lllllIlIlIlIl = new int[4])[0] = ((84 + 70 - 138 + 141 ^ 55 + 105 - 107 + 86) & (71 + 103 - 105 + 59 ^ 55 + 30 - 24 + 89 ^ -" ".length()));
        ItemMultiTexture.lllllIlIlIlIl[1] = " ".length();
        ItemMultiTexture.lllllIlIlIlIl[2] = (0x7E ^ 0x76);
        ItemMultiTexture.lllllIlIlIlIl[3] = "  ".length();
    }
    
    public ItemMultiTexture(final Block lllllllllllllIlIlIllIlIlIllIIIll, final Block lllllllllllllIlIlIllIlIlIllIIIlI, final String[] lllllllllllllIlIlIllIlIlIlIlllIl) {
        this(lllllllllllllIlIlIllIlIlIllIIIll, lllllllllllllIlIlIllIlIlIllIIIlI, (Function<ItemStack, String>)new Function<ItemStack, String>() {
            private static final /* synthetic */ int[] llIIIIlIllllII;
            
            private static void lIIIlIIIIIIIIIll() {
                (llIIIIlIllllII = new int[1])[0] = ((0x8D ^ 0xA3 ^ (0xF6 ^ 0x91)) & (0x65 ^ 0x73 ^ (0xC3 ^ 0x9C) ^ -" ".length()));
            }
            
            private static boolean lIIIlIIIIIIIIlIl(final int llllllllllllIlllIllIllIlIllllIII, final int llllllllllllIlllIllIllIlIlllIlll) {
                return llllllllllllIlllIllIllIlIllllIII >= llllllllllllIlllIllIllIlIlllIlll;
            }
            
            public String apply(final ItemStack llllllllllllIlllIllIllIllIIIIIII) {
                int llllllllllllIlllIllIllIllIIIIIlI = llllllllllllIlllIllIllIllIIIIIII.getMetadata();
                if (!lIIIlIIIIIIIIlII(llllllllllllIlllIllIllIllIIIIIlI) || lIIIlIIIIIIIIlIl(llllllllllllIlllIllIllIllIIIIIlI, lllllllllllllIlIlIllIlIlIlIlllIl.length)) {
                    llllllllllllIlllIllIllIllIIIIIlI = ItemMultiTexture$1.llIIIIlIllllII[0];
                }
                return lllllllllllllIlIlIllIlIlIlIlllIl[llllllllllllIlllIllIllIllIIIIIlI];
            }
            
            private static boolean lIIIlIIIIIIIIlII(final int llllllllllllIlllIllIllIlIlllIlIl) {
                return llllllllllllIlllIllIllIlIlllIlIl >= 0;
            }
            
            static {
                lIIIlIIIIIIIIIll();
            }
        });
    }
    
    private static void lIlIlllIlIlIlIl() {
        (lllllIlIlIIll = new String[ItemMultiTexture.lllllIlIlIlIl[1]])[ItemMultiTexture.lllllIlIlIlIl[0]] = lIlIlllIlIlIlII("FByZ6oMFj80=", "YwuWm");
    }
    
    static {
        lIlIlllIlIlllII();
        lIlIlllIlIlIlIl();
    }
    
    @Override
    public int getMetadata(final int lllllllllllllIlIlIllIlIlIlIllIIl) {
        return lllllllllllllIlIlIllIlIlIlIllIIl;
    }
}
