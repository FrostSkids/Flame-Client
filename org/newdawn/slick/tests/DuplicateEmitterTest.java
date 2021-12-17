// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Graphics;
import java.io.IOException;
import org.newdawn.slick.particles.ParticleEmitter;
import org.newdawn.slick.particles.ParticleIO;
import org.newdawn.slick.SlickException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.particles.ConfigurableEmitter;
import org.newdawn.slick.particles.ParticleSystem;
import org.newdawn.slick.BasicGame;

public class DuplicateEmitterTest extends BasicGame
{
    private /* synthetic */ ParticleSystem explosionSystem;
    private /* synthetic */ ConfigurableEmitter explosionEmitter;
    private static final /* synthetic */ int[] lIIlIIlIIIIllI;
    private /* synthetic */ GameContainer container;
    private static final /* synthetic */ String[] lIIlIIlIIIIIIl;
    
    private static boolean llIIlIlllllIlll(final Object lllllllllllllIIlllIIIlIIlIIllIIl) {
        return lllllllllllllIIlllIIIlIIlIIllIIl == null;
    }
    
    public DuplicateEmitterTest() {
        super(DuplicateEmitterTest.lIIlIIlIIIIIIl[DuplicateEmitterTest.lIIlIIlIIIIllI[0]]);
    }
    
    private static String llIIlIlllllIIII(String lllllllllllllIIlllIIIlIIlIlIlIll, final String lllllllllllllIIlllIIIlIIlIlIlIlI) {
        lllllllllllllIIlllIIIlIIlIlIlIll = new String(Base64.getDecoder().decode(lllllllllllllIIlllIIIlIIlIlIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllIIIlIIlIlIlllI = new StringBuilder();
        final char[] lllllllllllllIIlllIIIlIIlIlIllIl = lllllllllllllIIlllIIIlIIlIlIlIlI.toCharArray();
        int lllllllllllllIIlllIIIlIIlIlIllII = DuplicateEmitterTest.lIIlIIlIIIIllI[0];
        final Exception lllllllllllllIIlllIIIlIIlIlIIllI = (Object)lllllllllllllIIlllIIIlIIlIlIlIll.toCharArray();
        final Exception lllllllllllllIIlllIIIlIIlIlIIlIl = (Exception)lllllllllllllIIlllIIIlIIlIlIIllI.length;
        byte lllllllllllllIIlllIIIlIIlIlIIlII = (byte)DuplicateEmitterTest.lIIlIIlIIIIllI[0];
        while (llIIlIlllllIllI(lllllllllllllIIlllIIIlIIlIlIIlII, (int)lllllllllllllIIlllIIIlIIlIlIIlIl)) {
            final char lllllllllllllIIlllIIIlIIlIllIIIl = lllllllllllllIIlllIIIlIIlIlIIllI[lllllllllllllIIlllIIIlIIlIlIIlII];
            lllllllllllllIIlllIIIlIIlIlIlllI.append((char)(lllllllllllllIIlllIIIlIIlIllIIIl ^ lllllllllllllIIlllIIIlIIlIlIllIl[lllllllllllllIIlllIIIlIIlIlIllII % lllllllllllllIIlllIIIlIIlIlIllIl.length]));
            "".length();
            ++lllllllllllllIIlllIIIlIIlIlIllII;
            ++lllllllllllllIIlllIIIlIIlIlIIlII;
            "".length();
            if ((0xC7 ^ 0xC2) == 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllIIIlIIlIlIlllI);
    }
    
    @Override
    public void keyPressed(final int lllllllllllllIIlllIIIlIIllIlIIII, final char lllllllllllllIIlllIIIlIIllIIllll) {
        if (llIIlIllllllIII(lllllllllllllIIlllIIIlIIllIlIIII, DuplicateEmitterTest.lIIlIIlIIIIllI[1])) {
            this.container.exit();
        }
        if (llIIlIllllllIII(lllllllllllllIIlllIIIlIIllIlIIII, DuplicateEmitterTest.lIIlIIlIIIIllI[7])) {
            this.explosionEmitter.wrapUp();
        }
    }
    
    private static boolean llIIlIllllllIII(final int lllllllllllllIIlllIIIlIIlIlIIIII, final int lllllllllllllIIlllIIIlIIlIIlllll) {
        return lllllllllllllIIlllIIIlIIlIlIIIII == lllllllllllllIIlllIIIlIIlIIlllll;
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIIlllIIIlIIllIlllII, final int lllllllllllllIIlllIIIlIIllIllIll) throws SlickException {
        this.explosionSystem.update(lllllllllllllIIlllIIIlIIllIllIll);
    }
    
    static {
        llIIlIlllllIlIl();
        llIIlIlllllIIIl();
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIIlllIIIlIIlllIIlII) throws SlickException {
        this.container = lllllllllllllIIlllIIIlIIlllIIlII;
        try {
            this.explosionSystem = ParticleIO.loadConfiguredSystem(DuplicateEmitterTest.lIIlIIlIIIIIIl[DuplicateEmitterTest.lIIlIIlIIIIllI[1]]);
            this.explosionEmitter = (ConfigurableEmitter)this.explosionSystem.getEmitter(DuplicateEmitterTest.lIIlIIlIIIIllI[0]);
            this.explosionEmitter.setPosition(400.0f, 100.0f);
            int lllllllllllllIIlllIIIlIIlllIIlll = DuplicateEmitterTest.lIIlIIlIIIIllI[0];
            while (llIIlIlllllIllI(lllllllllllllIIlllIIIlIIlllIIlll, DuplicateEmitterTest.lIIlIIlIIIIllI[2])) {
                final ConfigurableEmitter lllllllllllllIIlllIIIlIIlllIlIII = this.explosionEmitter.duplicate();
                if (llIIlIlllllIlll(lllllllllllllIIlllIIIlIIlllIlIII)) {
                    throw new SlickException(DuplicateEmitterTest.lIIlIIlIIIIIIl[DuplicateEmitterTest.lIIlIIlIIIIllI[3]]);
                }
                lllllllllllllIIlllIIIlIIlllIlIII.name = String.valueOf(new StringBuilder().append(lllllllllllllIIlllIIIlIIlllIlIII.name).append(DuplicateEmitterTest.lIIlIIlIIIIIIl[DuplicateEmitterTest.lIIlIIlIIIIllI[4]]).append(lllllllllllllIIlllIIIlIIlllIIlll));
                lllllllllllllIIlllIIIlIIlllIlIII.setPosition((float)((lllllllllllllIIlllIIIlIIlllIIlll + DuplicateEmitterTest.lIIlIIlIIIIllI[1]) * DuplicateEmitterTest.lIIlIIlIIIIllI[5]), 400.0f);
                this.explosionSystem.addEmitter(lllllllllllllIIlllIIIlIIlllIlIII);
                ++lllllllllllllIIlllIIIlIIlllIIlll;
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
            "".length();
            if ((0xD ^ 0x8) <= 0) {
                return;
            }
        }
        catch (IOException lllllllllllllIIlllIIIlIIlllIIllI) {
            throw new SlickException(DuplicateEmitterTest.lIIlIIlIIIIIIl[DuplicateEmitterTest.lIIlIIlIIIIllI[6]], lllllllllllllIIlllIIIlIIlllIIllI);
        }
    }
    
    public void render(final GameContainer lllllllllllllIIlllIIIlIIllIlIllI, final Graphics lllllllllllllIIlllIIIlIIllIlIlIl) throws SlickException {
        this.explosionSystem.render();
    }
    
    public static void main(final String[] lllllllllllllIIlllIIIlIIllIIlIIl) {
        try {
            final AppGameContainer lllllllllllllIIlllIIIlIIllIIlIll = new AppGameContainer(new DuplicateEmitterTest());
            lllllllllllllIIlllIIIlIIllIIlIll.setDisplayMode(DuplicateEmitterTest.lIIlIIlIIIIllI[8], DuplicateEmitterTest.lIIlIIlIIIIllI[9], (boolean)(DuplicateEmitterTest.lIIlIIlIIIIllI[0] != 0));
            lllllllllllllIIlllIIIlIIllIIlIll.start();
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        catch (SlickException lllllllllllllIIlllIIIlIIllIIlIlI) {
            lllllllllllllIIlllIIIlIIllIIlIlI.printStackTrace();
        }
    }
    
    private static void llIIlIlllllIlIl() {
        (lIIlIIlIIIIllI = new int[10])[0] = ((0xA5 ^ 0x95) & ~(0x38 ^ 0x8));
        DuplicateEmitterTest.lIIlIIlIIIIllI[1] = " ".length();
        DuplicateEmitterTest.lIIlIIlIIIIllI[2] = (0x1C ^ 0x19);
        DuplicateEmitterTest.lIIlIIlIIIIllI[3] = "  ".length();
        DuplicateEmitterTest.lIIlIIlIIIIllI[4] = "   ".length();
        DuplicateEmitterTest.lIIlIIlIIIIllI[5] = 30 + 16 + 86 + 1;
        DuplicateEmitterTest.lIIlIIlIIIIllI[6] = (0x52 ^ 0x56);
        DuplicateEmitterTest.lIIlIIlIIIIllI[7] = (0xAA ^ 0x8F);
        DuplicateEmitterTest.lIIlIIlIIIIllI[8] = (-(0xFFFFBFF5 & 0x54CE) & (0xFFFFDFFB & 0x37E7));
        DuplicateEmitterTest.lIIlIIlIIIIllI[9] = (-(0xFFFFED8F & 0x3AF2) & (0xFFFFBED9 & 0x6BFF));
    }
    
    private static boolean llIIlIlllllIllI(final int lllllllllllllIIlllIIIlIIlIIlllII, final int lllllllllllllIIlllIIIlIIlIIllIll) {
        return lllllllllllllIIlllIIIlIIlIIlllII < lllllllllllllIIlllIIIlIIlIIllIll;
    }
    
    private static String llIIlIllllIllll(final String lllllllllllllIIlllIIIlIIlIlllllI, final String lllllllllllllIIlllIIIlIIlIllllll) {
        try {
            final SecretKeySpec lllllllllllllIIlllIIIlIIllIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIIlIIlIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllIIIlIIllIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllIIIlIIllIIIIlI.init(DuplicateEmitterTest.lIIlIIlIIIIllI[3], lllllllllllllIIlllIIIlIIllIIIIll);
            return new String(lllllllllllllIIlllIIIlIIllIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIIlIIlIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIIIlIIllIIIIIl) {
            lllllllllllllIIlllIIIlIIllIIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static void llIIlIlllllIIIl() {
        (lIIlIIlIIIIIIl = new String[DuplicateEmitterTest.lIIlIIlIIIIllI[2]])[DuplicateEmitterTest.lIIlIIlIIIIllI[0]] = llIIlIllllIllll("BjhwV3zTgDz3nKnl2DhbbGOHQj8ekW7l", "Gnfjo");
        DuplicateEmitterTest.lIIlIIlIIIIIIl[DuplicateEmitterTest.lIIlIIlIIIIllI[1]] = llIIlIllllIllll("Q8uhm2WWIjh+rhuQaLDniQT1YtKz51HTnglVYkkJlGc=", "lMdyr");
        DuplicateEmitterTest.lIIlIIlIIIIIIl[DuplicateEmitterTest.lIIlIIlIIIIllI[3]] = llIIlIlllllIIII("DAA/JjUuQSIlcC4UJiY5KQAiL3AvGSYmPzkIOSQVJwgiPjU4", "JaVJP");
        DuplicateEmitterTest.lIIlIIlIIIIIIl[DuplicateEmitterTest.lIIlIIlIIIIllI[4]] = llIIlIllllIllll("nL8PGQPpFbA=", "EHsdb");
        DuplicateEmitterTest.lIIlIIlIIIIIIl[DuplicateEmitterTest.lIIlIIlIIIIllI[6]] = llIIlIllllIllll("NHBdEVDheDpsPIU7eFAVtl7tzqn+cBi8u5LCQoJ7fGE=", "kYIAo");
    }
}
