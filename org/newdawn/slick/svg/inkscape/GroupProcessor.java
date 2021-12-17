// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.svg.inkscape;

import org.newdawn.slick.svg.ParsingException;
import org.newdawn.slick.geom.Transform;
import org.newdawn.slick.svg.Diagram;
import org.newdawn.slick.svg.Loader;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.w3c.dom.Element;

public class GroupProcessor implements ElementProcessor
{
    private static final /* synthetic */ String[] llllIIllIIllI;
    private static final /* synthetic */ int[] llllIIllIlIII;
    
    public boolean handles(final Element lllllllllllllIlIlllIIlIIIlIllIIl) {
        if (lIlIlIIIlllIIIl(lllllllllllllIlIlllIIlIIIlIllIIl.getNodeName().equals(GroupProcessor.llllIIllIIllI[GroupProcessor.llllIIllIlIII[0]]) ? 1 : 0)) {
            return GroupProcessor.llllIIllIlIII[1] != 0;
        }
        return GroupProcessor.llllIIllIlIII[0] != 0;
    }
    
    private static void lIlIlIIIlllIIII() {
        (llllIIllIlIII = new int[3])[0] = ((0x88 ^ 0xB0 ^ (0x7E ^ 0x52)) & (140 + 22 - 46 + 31 ^ 50 + 33 - 23 + 75 ^ -" ".length()));
        GroupProcessor.llllIIllIlIII[1] = " ".length();
        GroupProcessor.llllIIllIlIII[2] = "  ".length();
    }
    
    private static boolean lIlIlIIIlllIIIl(final int lllllllllllllIlIlllIIlIIIIlllIll) {
        return lllllllllllllIlIlllIIlIIIIlllIll != 0;
    }
    
    private static String lIlIlIIIllIllIl(final String lllllllllllllIlIlllIIlIIIlIIIIII, final String lllllllllllllIlIlllIIlIIIlIIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlllIIlIIIlIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIIlIIIlIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlllIIlIIIlIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlllIIlIIIlIIIlII.init(GroupProcessor.llllIIllIlIII[2], lllllllllllllIlIlllIIlIIIlIIIlIl);
            return new String(lllllllllllllIlIlllIIlIIIlIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIIlIIIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlllIIlIIIlIIIIll) {
            lllllllllllllIlIlllIIlIIIlIIIIll.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIlIIIllIllll() {
        (llllIIllIIllI = new String[GroupProcessor.llllIIllIlIII[1]])[GroupProcessor.llllIIllIlIII[0]] = lIlIlIIIllIllIl("HjzZCarE23k=", "AJDCV");
    }
    
    static {
        lIlIlIIIlllIIII();
        lIlIlIIIllIllll();
    }
    
    public void process(final Loader lllllllllllllIlIlllIIlIIIlIlIIlI, final Element lllllllllllllIlIlllIIlIIIlIIllII, final Diagram lllllllllllllIlIlllIIlIIIlIlIIII, final Transform lllllllllllllIlIlllIIlIIIlIIllll) throws ParsingException {
        Transform lllllllllllllIlIlllIIlIIIlIIlllI = Util.getTransform(lllllllllllllIlIlllIIlIIIlIIllII);
        lllllllllllllIlIlllIIlIIIlIIlllI = new Transform(lllllllllllllIlIlllIIlIIIlIIllll, lllllllllllllIlIlllIIlIIIlIIlllI);
        lllllllllllllIlIlllIIlIIIlIlIIlI.loadChildren(lllllllllllllIlIlllIIlIIIlIIllII, lllllllllllllIlIlllIIlIIIlIIlllI);
    }
}
