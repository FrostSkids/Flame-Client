// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.particles;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.Collection;
import java.security.AccessController;
import org.newdawn.slick.SlickException;
import java.security.PrivilegedAction;
import org.newdawn.slick.opengl.TextureImpl;
import org.newdawn.slick.opengl.renderer.Renderer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.util.Log;
import org.newdawn.slick.Image;
import java.util.HashMap;
import org.newdawn.slick.Color;
import java.util.ArrayList;
import org.newdawn.slick.opengl.renderer.SGL;

public class ParticleSystem
{
    protected /* synthetic */ int maxParticlesPerEmitter;
    private static final /* synthetic */ String[] lIIlIlIIlIIIIl;
    private /* synthetic */ boolean usePoints;
    private /* synthetic */ String defaultImageName;
    private /* synthetic */ boolean removeCompletedEmitters;
    private /* synthetic */ float x;
    protected /* synthetic */ SGL GL;
    private /* synthetic */ float y;
    protected /* synthetic */ ArrayList emitters;
    private /* synthetic */ Color mask;
    private static final /* synthetic */ int[] lIIlIlllIIIIII;
    private /* synthetic */ ArrayList removeMe;
    protected /* synthetic */ HashMap particlesByEmitter;
    private /* synthetic */ Image sprite;
    private /* synthetic */ int blendingMode;
    private /* synthetic */ int pCount;
    protected /* synthetic */ Particle dummy;
    private /* synthetic */ boolean visible;
    
    public void moveAll(final ParticleEmitter lllllllllllllIIllIIIIllIIlllIIlI, final float lllllllllllllIIllIIIIllIIllIllII, final float lllllllllllllIIllIIIIllIIllIlIll) {
        final ParticlePool lllllllllllllIIllIIIIllIIllIllll = this.particlesByEmitter.get(lllllllllllllIIllIIIIllIIlllIIlI);
        int lllllllllllllIIllIIIIllIIlllIlII = ParticleSystem.lIIlIlllIIIIII[1];
        while (llIlIIlllIIIlll(lllllllllllllIIllIIIIllIIlllIlII, lllllllllllllIIllIIIIllIIllIllll.particles.length)) {
            if (llIlIIlllIIIllI(lllllllllllllIIllIIIIllIIllIllll.particles[lllllllllllllIIllIIIIllIIlllIlII].inUse() ? 1 : 0)) {
                lllllllllllllIIllIIIIllIIllIllll.particles[lllllllllllllIIllIIIIllIIlllIlII].move(lllllllllllllIIllIIIIllIIllIllII, lllllllllllllIIllIIIIllIIllIlIll);
            }
            ++lllllllllllllIIllIIIIllIIlllIlII;
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
    }
    
    private static boolean llIlIIlllIIlllI(final Object lllllllllllllIIllIIIIllIIIIllIIl, final Object lllllllllllllIIllIIIIllIIIIllIII) {
        return lllllllllllllIIllIIIIllIIIIllIIl != lllllllllllllIIllIIIIllIIIIllIII;
    }
    
    public void render() {
        this.render(this.x, this.y);
    }
    
    public Particle getNewParticle(final ParticleEmitter lllllllllllllIIllIIIIllIlIIlllII, final float lllllllllllllIIllIIIIllIlIIllIll) {
        final ParticlePool lllllllllllllIIllIIIIllIlIIllIlI = this.particlesByEmitter.get(lllllllllllllIIllIIIIllIlIIlllII);
        final ArrayList lllllllllllllIIllIIIIllIlIIllIIl = lllllllllllllIIllIIIIllIlIIllIlI.available;
        if (llIlIIlllIIllIl(lllllllllllllIIllIIIIllIlIIllIIl.size())) {
            final Particle lllllllllllllIIllIIIIllIlIIllllI = lllllllllllllIIllIIIIllIlIIllIIl.remove(lllllllllllllIIllIIIIllIlIIllIIl.size() - ParticleSystem.lIIlIlllIIIIII[3]);
            lllllllllllllIIllIIIIllIlIIllllI.init(lllllllllllllIIllIIIIllIlIIlllII, lllllllllllllIIllIIIIllIlIIllIll);
            lllllllllllllIIllIIIIllIlIIllllI.setImage(this.sprite);
            return lllllllllllllIIllIIIIllIlIIllllI;
        }
        Log.warn(ParticleSystem.lIIlIlIIlIIIIl[ParticleSystem.lIIlIlllIIIIII[1]]);
        return this.dummy;
    }
    
    private static boolean llIlIIlllIIlIll(final int lllllllllllllIIllIIIIllIIIlIIIIl, final int lllllllllllllIIllIIIIllIIIlIIIII) {
        return lllllllllllllIIllIIIIllIIIlIIIIl == lllllllllllllIIllIIIIllIIIlIIIII;
    }
    
    public void setVisible(final boolean lllllllllllllIIllIIIIlllIlIIllII) {
        this.visible = lllllllllllllIIllIIIIlllIlIIllII;
    }
    
    public void removeEmitter(final ParticleEmitter lllllllllllllIIllIIIIllIllllIIlI) {
        this.emitters.remove(lllllllllllllIIllIIIIllIllllIIlI);
        "".length();
        this.particlesByEmitter.remove(lllllllllllllIIllIIIIllIllllIIlI);
        "".length();
    }
    
    private static String llIIlllllIllIII(String lllllllllllllIIllIIIIllIIIlllIIl, final String lllllllllllllIIllIIIIllIIIlllIII) {
        lllllllllllllIIllIIIIllIIIlllIIl = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllIIIIllIIIlllIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIIIIllIIIllllII = new StringBuilder();
        final char[] lllllllllllllIIllIIIIllIIIlllIll = lllllllllllllIIllIIIIllIIIlllIII.toCharArray();
        int lllllllllllllIIllIIIIllIIIlllIlI = ParticleSystem.lIIlIlllIIIIII[1];
        final int lllllllllllllIIllIIIIllIIIllIlII = (Object)((String)lllllllllllllIIllIIIIllIIIlllIIl).toCharArray();
        final long lllllllllllllIIllIIIIllIIIllIIll = lllllllllllllIIllIIIIllIIIllIlII.length;
        byte lllllllllllllIIllIIIIllIIIllIIlI = (byte)ParticleSystem.lIIlIlllIIIIII[1];
        while (llIlIIlllIIIlll(lllllllllllllIIllIIIIllIIIllIIlI, (int)lllllllllllllIIllIIIIllIIIllIIll)) {
            final char lllllllllllllIIllIIIIllIIIllllll = lllllllllllllIIllIIIIllIIIllIlII[lllllllllllllIIllIIIIllIIIllIIlI];
            lllllllllllllIIllIIIIllIIIllllII.append((char)(lllllllllllllIIllIIIIllIIIllllll ^ lllllllllllllIIllIIIIllIIIlllIll[lllllllllllllIIllIIIIllIIIlllIlI % lllllllllllllIIllIIIIllIIIlllIll.length]));
            "".length();
            ++lllllllllllllIIllIIIIllIIIlllIlI;
            ++lllllllllllllIIllIIIIllIIIllIIlI;
            "".length();
            if (-" ".length() == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIIIIllIIIllllII);
    }
    
    public ParticleSystem(final Image lllllllllllllIIllIIIIlllIIlIIIIl, final int lllllllllllllIIllIIIIlllIIIlllIl) {
        this.GL = Renderer.get();
        this.removeMe = new ArrayList();
        this.particlesByEmitter = new HashMap();
        this.emitters = new ArrayList();
        this.blendingMode = ParticleSystem.lIIlIlllIIIIII[2];
        this.removeCompletedEmitters = (ParticleSystem.lIIlIlllIIIIII[3] != 0);
        this.visible = (ParticleSystem.lIIlIlllIIIIII[3] != 0);
        this.maxParticlesPerEmitter = lllllllllllllIIllIIIIlllIIIlllIl;
        this.sprite = lllllllllllllIIllIIIIlllIIlIIIIl;
        this.dummy = this.createParticle(this);
    }
    
    public void render(final float lllllllllllllIIllIIIIllIllIIlIII, final float lllllllllllllIIllIIIIllIllIIIlll) {
        if (llIlIIlllIIlIII(this.sprite) && llIlIIlllIIlIIl(this.defaultImageName)) {
            this.loadSystemParticleImage();
        }
        if (llIlIIlllIIlIlI(this.visible ? 1 : 0)) {
            return;
        }
        this.GL.glTranslatef(lllllllllllllIIllIIIIllIllIIlIII, lllllllllllllIIllIIIIllIllIIIlll, 0.0f);
        if (llIlIIlllIIlIll(this.blendingMode, ParticleSystem.lIIlIlllIIIIII[3])) {
            this.GL.glBlendFunc(ParticleSystem.lIIlIlllIIIIII[4], ParticleSystem.lIIlIlllIIIIII[3]);
        }
        if (llIlIIlllIIIllI(this.usePoints() ? 1 : 0)) {
            this.GL.glEnable(ParticleSystem.lIIlIlllIIIIII[5]);
            TextureImpl.bindNone();
        }
        int lllllllllllllIIllIIIIllIllIIllIl = ParticleSystem.lIIlIlllIIIIII[1];
        while (llIlIIlllIIIlll(lllllllllllllIIllIIIIllIllIIllIl, this.emitters.size())) {
            final ParticleEmitter lllllllllllllIIllIIIIllIllIlIIII = this.emitters.get(lllllllllllllIIllIIIIllIllIIllIl);
            if (llIlIIlllIIlIlI(lllllllllllllIIllIIIIllIllIlIIII.isEnabled() ? 1 : 0)) {
                "".length();
                if ("  ".length() == 0) {
                    return;
                }
            }
            else {
                if (llIlIIlllIIIllI(lllllllllllllIIllIIIIllIllIlIIII.useAdditive() ? 1 : 0)) {
                    this.GL.glBlendFunc(ParticleSystem.lIIlIlllIIIIII[4], ParticleSystem.lIIlIlllIIIIII[3]);
                }
                final ParticlePool lllllllllllllIIllIIIIllIllIIllll = this.particlesByEmitter.get(lllllllllllllIIllIIIIllIllIlIIII);
                Image lllllllllllllIIllIIIIllIllIIlllI = lllllllllllllIIllIIIIllIllIlIIII.getImage();
                if (llIlIIlllIIlIII(lllllllllllllIIllIIIIllIllIIlllI)) {
                    lllllllllllllIIllIIIIllIllIIlllI = this.sprite;
                }
                if (llIlIIlllIIlIlI(lllllllllllllIIllIIIIllIllIlIIII.isOriented() ? 1 : 0) && llIlIIlllIIlIlI(lllllllllllllIIllIIIIllIllIlIIII.usePoints(this) ? 1 : 0)) {
                    lllllllllllllIIllIIIIllIllIIlllI.startUse();
                }
                int lllllllllllllIIllIIIIllIllIlIIIl = ParticleSystem.lIIlIlllIIIIII[1];
                while (llIlIIlllIIIlll(lllllllllllllIIllIIIIllIllIlIIIl, lllllllllllllIIllIIIIllIllIIllll.particles.length)) {
                    if (llIlIIlllIIIllI(lllllllllllllIIllIIIIllIllIIllll.particles[lllllllllllllIIllIIIIllIllIlIIIl].inUse() ? 1 : 0)) {
                        lllllllllllllIIllIIIIllIllIIllll.particles[lllllllllllllIIllIIIIllIllIlIIIl].render();
                    }
                    ++lllllllllllllIIllIIIIllIllIlIIIl;
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                if (llIlIIlllIIlIlI(lllllllllllllIIllIIIIllIllIlIIII.isOriented() ? 1 : 0) && llIlIIlllIIlIlI(lllllllllllllIIllIIIIllIllIlIIII.usePoints(this) ? 1 : 0)) {
                    lllllllllllllIIllIIIIllIllIIlllI.endUse();
                }
                if (llIlIIlllIIIllI(lllllllllllllIIllIIIIllIllIlIIII.useAdditive() ? 1 : 0)) {
                    this.GL.glBlendFunc(ParticleSystem.lIIlIlllIIIIII[4], ParticleSystem.lIIlIlllIIIIII[6]);
                }
            }
            ++lllllllllllllIIllIIIIllIllIIllIl;
            "".length();
            if (((0x6D ^ 0x4A) & ~(0x83 ^ 0xA4)) > (0x51 ^ 0x55)) {
                return;
            }
        }
        if (llIlIIlllIIIllI(this.usePoints() ? 1 : 0)) {
            this.GL.glDisable(ParticleSystem.lIIlIlllIIIIII[5]);
        }
        if (llIlIIlllIIlIll(this.blendingMode, ParticleSystem.lIIlIlllIIIIII[3])) {
            this.GL.glBlendFunc(ParticleSystem.lIIlIlllIIIIII[4], ParticleSystem.lIIlIlllIIIIII[6]);
        }
        Color.white.bind();
        this.GL.glTranslatef(-lllllllllllllIIllIIIIllIllIIlIII, -lllllllllllllIIllIIIIllIllIIIlll, 0.0f);
    }
    
    public ParticleSystem(final String lllllllllllllIIllIIIIlllIllIIIlI) {
        this(lllllllllllllIIllIIIIlllIllIIIlI, ParticleSystem.lIIlIlllIIIIII[0]);
    }
    
    private void loadSystemParticleImage() {
        AccessController.doPrivileged((PrivilegedAction<Object>)new PrivilegedAction() {
            private static boolean lIIIIllllIIIlIIl(final Object llllllllllllIlllIlllIlIIlIlllIlI) {
                return llllllllllllIlllIlllIlIIlIlllIlI != null;
            }
            
            public Object run() {
                try {
                    if (lIIIIllllIIIlIIl(ParticleSystem.this.mask)) {
                        ParticleSystem.this.sprite = new Image(ParticleSystem.this.defaultImageName, ParticleSystem.this.mask);
                        "".length();
                        "".length();
                        if (-" ".length() != -" ".length()) {
                            return null;
                        }
                    }
                    else {
                        ParticleSystem.this.sprite = new Image(ParticleSystem.this.defaultImageName);
                        "".length();
                    }
                    "".length();
                    if ((0xA2 ^ 0xB2 ^ (0xA5 ^ 0xB1)) <= " ".length()) {
                        return null;
                    }
                }
                catch (SlickException llllllllllllIlllIlllIlIIlIllllll) {
                    Log.error(llllllllllllIlllIlllIlIIlIllllll);
                    ParticleSystem.this.defaultImageName = null;
                    "".length();
                }
                return null;
            }
        });
        "".length();
    }
    
    public void addEmitter(final ParticleEmitter lllllllllllllIIllIIIIllIlllllIIl) {
        this.emitters.add(lllllllllllllIIllIIIIllIlllllIIl);
        "".length();
        final ParticlePool lllllllllllllIIllIIIIllIlllllIll = new ParticlePool(this, this.maxParticlesPerEmitter);
        this.particlesByEmitter.put(lllllllllllllIIllIIIIllIlllllIIl, lllllllllllllIIllIIIIllIlllllIll);
        "".length();
    }
    
    public void update(final int lllllllllllllIIllIIIIllIlIllIIII) {
        if (llIlIIlllIIlIII(this.sprite) && llIlIIlllIIlIIl(this.defaultImageName)) {
            this.loadSystemParticleImage();
        }
        this.removeMe.clear();
        final ArrayList lllllllllllllIIllIIIIllIlIlIllll = new ArrayList(this.emitters);
        int lllllllllllllIIllIIIIllIlIllIllI = ParticleSystem.lIIlIlllIIIIII[1];
        while (llIlIIlllIIIlll(lllllllllllllIIllIIIIllIlIllIllI, lllllllllllllIIllIIIIllIlIlIllll.size())) {
            final ParticleEmitter lllllllllllllIIllIIIIllIlIllIlll = lllllllllllllIIllIIIIllIlIlIllll.get(lllllllllllllIIllIIIIllIlIllIllI);
            if (llIlIIlllIIIllI(lllllllllllllIIllIIIIllIlIllIlll.isEnabled() ? 1 : 0)) {
                lllllllllllllIIllIIIIllIlIllIlll.update(this, lllllllllllllIIllIIIIllIlIllIIII);
                if (llIlIIlllIIIllI(this.removeCompletedEmitters ? 1 : 0) && llIlIIlllIIIllI(lllllllllllllIIllIIIIllIlIllIlll.completed() ? 1 : 0)) {
                    this.removeMe.add(lllllllllllllIIllIIIIllIlIllIlll);
                    "".length();
                    this.particlesByEmitter.remove(lllllllllllllIIllIIIIllIlIllIlll);
                    "".length();
                }
            }
            ++lllllllllllllIIllIIIIllIlIllIllI;
            "".length();
            if ((65 + 67 - 65 + 70 ^ 17 + 135 - 114 + 102) <= 0) {
                return;
            }
        }
        this.emitters.removeAll(this.removeMe);
        "".length();
        this.pCount = ParticleSystem.lIIlIlllIIIIII[1];
        if (llIlIIlllIIlIlI(this.particlesByEmitter.isEmpty() ? 1 : 0)) {
            final Iterator lllllllllllllIIllIIIIllIlIllIIlI = this.particlesByEmitter.keySet().iterator();
            while (llIlIIlllIIIllI(lllllllllllllIIllIIIIllIlIllIIlI.hasNext() ? 1 : 0)) {
                final ParticleEmitter lllllllllllllIIllIIIIllIlIllIIll = lllllllllllllIIllIIIIllIlIllIIlI.next();
                if (llIlIIlllIIIllI(lllllllllllllIIllIIIIllIlIllIIll.isEnabled() ? 1 : 0)) {
                    final ParticlePool lllllllllllllIIllIIIIllIlIllIlII = this.particlesByEmitter.get(lllllllllllllIIllIIIIllIlIllIIll);
                    int lllllllllllllIIllIIIIllIlIllIlIl = ParticleSystem.lIIlIlllIIIIII[1];
                    while (llIlIIlllIIIlll(lllllllllllllIIllIIIIllIlIllIlIl, lllllllllllllIIllIIIIllIlIllIlII.particles.length)) {
                        if (llIlIIlllIIllIl(llIlIIlllIIllII(lllllllllllllIIllIIIIllIlIllIlII.particles[lllllllllllllIIllIIIIllIlIllIlIl].life, 0.0f))) {
                            lllllllllllllIIllIIIIllIlIllIlII.particles[lllllllllllllIIllIIIIllIlIllIlIl].update(lllllllllllllIIllIIIIllIlIllIIII);
                            this.pCount += ParticleSystem.lIIlIlllIIIIII[3];
                        }
                        ++lllllllllllllIIllIIIIllIlIllIlIl;
                        "".length();
                        if ("  ".length() <= " ".length()) {
                            return;
                        }
                    }
                }
                "".length();
                if (null != null) {
                    return;
                }
            }
        }
    }
    
    private static boolean llIlIIlllIIlIlI(final int lllllllllllllIIllIIIIllIIIIIllII) {
        return lllllllllllllIIllIIIIllIIIIIllII == 0;
    }
    
    private static boolean llIlIIlllIIllIl(final int lllllllllllllIIllIIIIllIIIIIlIlI) {
        return lllllllllllllIIllIIIIllIIIIIlIlI > 0;
    }
    
    public int getBlendingMode() {
        return this.blendingMode;
    }
    
    public ParticleSystem duplicate() throws SlickException {
        int lllllllllllllIIllIIIIllIIllIIlII = ParticleSystem.lIIlIlllIIIIII[1];
        while (llIlIIlllIIIlll(lllllllllllllIIllIIIIllIIllIIlII, this.emitters.size())) {
            if (llIlIIlllIIlIlI((this.emitters.get(lllllllllllllIIllIIIIllIIllIIlII) instanceof ConfigurableEmitter) ? 1 : 0)) {
                throw new SlickException(ParticleSystem.lIIlIlIIlIIIIl[ParticleSystem.lIIlIlllIIIIII[3]]);
            }
            ++lllllllllllllIIllIIIIllIIllIIlII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        ParticleSystem lllllllllllllIIllIIIIllIIlIlllll = null;
        try {
            final ByteArrayOutputStream lllllllllllllIIllIIIIllIIllIIIll = new ByteArrayOutputStream();
            ParticleIO.saveConfiguredSystem(lllllllllllllIIllIIIIllIIllIIIll, this);
            final ByteArrayInputStream lllllllllllllIIllIIIIllIIllIIIlI = new ByteArrayInputStream(lllllllllllllIIllIIIIllIIllIIIll.toByteArray());
            lllllllllllllIIllIIIIllIIlIlllll = ParticleIO.loadConfiguredSystem(lllllllllllllIIllIIIIllIIllIIIlI);
            "".length();
            if (" ".length() < ((0x3F ^ 0x22) & ~(0x4E ^ 0x53))) {
                return null;
            }
        }
        catch (IOException lllllllllllllIIllIIIIllIIllIIIIl) {
            Log.error(ParticleSystem.lIIlIlIIlIIIIl[ParticleSystem.lIIlIlllIIIIII[2]]);
            throw new SlickException(ParticleSystem.lIIlIlIIlIIIIl[ParticleSystem.lIIlIlllIIIIII[7]], lllllllllllllIIllIIIIllIIllIIIIl);
        }
        return lllllllllllllIIllIIIIllIIlIlllll;
    }
    
    public float getPositionY() {
        return this.y;
    }
    
    public ParticleSystem(final Image lllllllllllllIIllIIIIlllIllIIllI) {
        this(lllllllllllllIIllIIIIlllIllIIllI, ParticleSystem.lIIlIlllIIIIII[0]);
    }
    
    public static void setRelativePath(final String lllllllllllllIIllIIIIlllIllIllIl) {
        ConfigurableEmitter.setRelativePath(lllllllllllllIIllIIIIlllIllIllIl);
    }
    
    public int getParticleCount() {
        return this.pCount;
    }
    
    public void release(final Particle lllllllllllllIIllIIIIllIlIIIlIll) {
        if (llIlIIlllIIlllI(lllllllllllllIIllIIIIllIlIIIlIll, this.dummy)) {
            final ParticlePool lllllllllllllIIllIIIIllIlIIIllll = this.particlesByEmitter.get(lllllllllllllIIllIIIIllIlIIIlIll.getEmitter());
            lllllllllllllIIllIIIIllIlIIIllll.available.add(lllllllllllllIIllIIIIllIlIIIlIll);
            "".length();
        }
    }
    
    public void setRemoveCompletedEmitters(final boolean lllllllllllllIIllIIIIlllIlIIIllI) {
        this.removeCompletedEmitters = lllllllllllllIIllIIIIlllIlIIIllI;
    }
    
    private static boolean llIlIIlllIIlIIl(final Object lllllllllllllIIllIIIIllIIIIlIllI) {
        return lllllllllllllIIllIIIIllIIIIlIllI != null;
    }
    
    public float getPositionX() {
        return this.x;
    }
    
    public ParticleSystem(final String lllllllllllllIIllIIIIlllIIlIllII, final int lllllllllllllIIllIIIIlllIIlIlIll, final Color lllllllllllllIIllIIIIlllIIlIIllI) {
        this.GL = Renderer.get();
        this.removeMe = new ArrayList();
        this.particlesByEmitter = new HashMap();
        this.emitters = new ArrayList();
        this.blendingMode = ParticleSystem.lIIlIlllIIIIII[2];
        this.removeCompletedEmitters = (ParticleSystem.lIIlIlllIIIIII[3] != 0);
        this.visible = (ParticleSystem.lIIlIlllIIIIII[3] != 0);
        this.maxParticlesPerEmitter = lllllllllllllIIllIIIIlllIIlIlIll;
        this.mask = lllllllllllllIIllIIIIlllIIlIIllI;
        this.setDefaultImageName(lllllllllllllIIllIIIIlllIIlIllII);
        this.dummy = this.createParticle(this);
    }
    
    private static String llIIlllllIlIlll(final String lllllllllllllIIllIIIIllIIIlIIlll, final String lllllllllllllIIllIIIIllIIIlIIllI) {
        try {
            final SecretKeySpec lllllllllllllIIllIIIIllIIIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIIIllIIIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIIIIllIIIlIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIIIIllIIIlIlIll.init(ParticleSystem.lIIlIlllIIIIII[2], lllllllllllllIIllIIIIllIIIlIllII);
            return new String(lllllllllllllIIllIIIIllIIIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIIIllIIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIIIllIIIlIlIlI) {
            lllllllllllllIIllIIIIllIIIlIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static void llIIlllllIllIll() {
        (lIIlIlIIlIIIIl = new String[ParticleSystem.lIIlIlllIIIIII[8]])[ParticleSystem.lIIlIlllIIIIII[1]] = llIIlllllIlIlll("0kiBJdxxF98cKC9zCHUzAm6lOULA0F9vSr8x/J3j1WxKpIZNxbu6S/0SjYdeNFpb", "lCjSL");
        ParticleSystem.lIIlIlIIlIIIIl[ParticleSystem.lIIlIlllIIIIII[3]] = llIIlllllIllIII("HS86MU4hOCU8Cz8ydisBPDU/KQA7LzFoDT0vMCEJJzM3KgI3YTMlByY1MzodciI3Jk4wJHYsGyItPysPJiQy", "RAVHn");
        ParticleSystem.lIIlIlIIlIIIIl[ParticleSystem.lIIlIlllIIIIII[2]] = llIIlllllIllIII("NTgmAA8XeTsDShcsPwADEDg7CUoDOD0YAxA1KkwZCio7CQc=", "sYOlj");
        ParticleSystem.lIIlIlIIlIIIIl[ParticleSystem.lIIlIlllIIIIII[7]] = llIIlllllIlIlll("vfARJ0lwxWKwpFK4HR1akHS35trneGzx/g3OcfdOuyWR64iCvfeOww==", "XeYjS");
    }
    
    protected Particle createParticle(final ParticleSystem lllllllllllllIIllIIIIlllIIIlIIIl) {
        return new Particle(lllllllllllllIIllIIIIlllIIIlIIIl);
    }
    
    private static boolean llIlIIlllIIIllI(final int lllllllllllllIIllIIIIllIIIIIlllI) {
        return lllllllllllllIIllIIIIllIIIIIlllI != 0;
    }
    
    public void setBlendingMode(final int lllllllllllllIIllIIIIlllIIIIllII) {
        this.blendingMode = lllllllllllllIIllIIIIlllIIIIllII;
    }
    
    private static boolean llIlIIlllIIIlll(final int lllllllllllllIIllIIIIllIIIIlllIl, final int lllllllllllllIIllIIIIllIIIIlllII) {
        return lllllllllllllIIllIIIIllIIIIlllIl < lllllllllllllIIllIIIIllIIIIlllII;
    }
    
    public int getEmitterCount() {
        return this.emitters.size();
    }
    
    public boolean usePoints() {
        return this.usePoints;
    }
    
    static {
        llIlIIlllIIIlIl();
        llIIlllllIllIll();
        DEFAULT_PARTICLES = ParticleSystem.lIIlIlllIIIIII[0];
        BLEND_COMBINE = ParticleSystem.lIIlIlllIIIIII[2];
        BLEND_ADDITIVE = ParticleSystem.lIIlIlllIIIIII[3];
    }
    
    public void setDefaultImageName(final String lllllllllllllIIllIIIIlllIIIllIIl) {
        this.defaultImageName = lllllllllllllIIllIIIIlllIIIllIIl;
        this.sprite = null;
    }
    
    private static boolean llIlIIlllIIlIII(final Object lllllllllllllIIllIIIIllIIIIlIIII) {
        return lllllllllllllIIllIIIIllIIIIlIIII == null;
    }
    
    public void setPosition(final float lllllllllllllIIllIIIIllIlllIIIIl, final float lllllllllllllIIllIIIIllIlllIIIII) {
        this.x = lllllllllllllIIllIIIIllIlllIIIIl;
        this.y = lllllllllllllIIllIIIIllIlllIIIII;
    }
    
    public boolean isVisible() {
        return this.visible;
    }
    
    private static void llIlIIlllIIIlIl() {
        (lIIlIlllIIIIII = new int[9])[0] = (0x1D ^ 0x1A ^ (0x4 ^ 0x67));
        ParticleSystem.lIIlIlllIIIIII[1] = ((0xCC ^ 0x9B) & ~(0x17 ^ 0x40));
        ParticleSystem.lIIlIlllIIIIII[2] = "  ".length();
        ParticleSystem.lIIlIlllIIIIII[3] = " ".length();
        ParticleSystem.lIIlIlllIIIIII[4] = (0xFFFF97EA & 0x6B17);
        ParticleSystem.lIIlIlllIIIIII[5] = (0xFFFF8BFA & 0x7F15);
        ParticleSystem.lIIlIlllIIIIII[6] = (-(0xFFFFF5BF & 0x1EDD) & (0xFFFF9FDF & 0x77BF));
        ParticleSystem.lIIlIlllIIIIII[7] = "   ".length();
        ParticleSystem.lIIlIlllIIIIII[8] = (0x8A ^ 0xBA ^ (0x11 ^ 0x25));
    }
    
    public ParticleSystem(final String lllllllllllllIIllIIIIlllIIllIllI, final int lllllllllllllIIllIIIIlllIIllIIlI) {
        this(lllllllllllllIIllIIIIlllIIllIllI, lllllllllllllIIllIIIIlllIIllIIlI, null);
    }
    
    private static int llIlIIlllIIllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void releaseAll(final ParticleEmitter lllllllllllllIIllIIIIllIlIIIIIII) {
        if (llIlIIlllIIlIlI(this.particlesByEmitter.isEmpty() ? 1 : 0)) {
            final Iterator lllllllllllllIIllIIIIllIlIIIIIlI = this.particlesByEmitter.values().iterator();
            while (llIlIIlllIIIllI(lllllllllllllIIllIIIIllIlIIIIIlI.hasNext() ? 1 : 0)) {
                final ParticlePool lllllllllllllIIllIIIIllIlIIIIIll = lllllllllllllIIllIIIIllIlIIIIIlI.next();
                int lllllllllllllIIllIIIIllIlIIIIlII = ParticleSystem.lIIlIlllIIIIII[1];
                while (llIlIIlllIIIlll(lllllllllllllIIllIIIIllIlIIIIlII, lllllllllllllIIllIIIIllIlIIIIIll.particles.length)) {
                    if (llIlIIlllIIIllI(lllllllllllllIIllIIIIllIlIIIIIll.particles[lllllllllllllIIllIIIIllIlIIIIlII].inUse() ? 1 : 0) && llIlIIlllIIllll(lllllllllllllIIllIIIIllIlIIIIIll.particles[lllllllllllllIIllIIIIllIlIIIIlII].getEmitter(), lllllllllllllIIllIIIIllIlIIIIIII)) {
                        lllllllllllllIIllIIIIllIlIIIIIll.particles[lllllllllllllIIllIIIIllIlIIIIlII].setLife(-1.0f);
                        this.release(lllllllllllllIIllIIIIllIlIIIIIll.particles[lllllllllllllIIllIIIIllIlIIIIlII]);
                    }
                    ++lllllllllllllIIllIIIIllIlIIIIlII;
                    "".length();
                    if ("  ".length() == 0) {
                        return;
                    }
                }
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
            }
        }
    }
    
    public void removeAllEmitters() {
        int lllllllllllllIIllIIIIllIlllIllll = ParticleSystem.lIIlIlllIIIIII[1];
        while (llIlIIlllIIIlll(lllllllllllllIIllIIIIllIlllIllll, this.emitters.size())) {
            this.removeEmitter(this.emitters.get(lllllllllllllIIllIIIIllIlllIllll));
            --lllllllllllllIIllIIIIllIlllIllll;
            ++lllllllllllllIIllIIIIllIlllIllll;
            "".length();
            if ("   ".length() > (0x5A ^ 0x5E)) {
                return;
            }
        }
    }
    
    public ParticleEmitter getEmitter(final int lllllllllllllIIllIIIIlllIIIIIIll) {
        return this.emitters.get(lllllllllllllIIllIIIIlllIIIIIIll);
    }
    
    private static boolean llIlIIlllIIllll(final Object lllllllllllllIIllIIIIllIIIIlIIll, final Object lllllllllllllIIllIIIIllIIIIlIIlI) {
        return lllllllllllllIIllIIIIllIIIIlIIll == lllllllllllllIIllIIIIllIIIIlIIlI;
    }
    
    public void reset() {
        final Iterator lllllllllllllIIllIIIIlllIlIlIlll = this.particlesByEmitter.values().iterator();
        while (llIlIIlllIIIllI(lllllllllllllIIllIIIIlllIlIlIlll.hasNext() ? 1 : 0)) {
            final ParticlePool lllllllllllllIIllIIIIlllIlIllIll = lllllllllllllIIllIIIIlllIlIlIlll.next();
            lllllllllllllIIllIIIIlllIlIllIll.reset(this);
            "".length();
            if (((0xD4 ^ 0x99) & ~(0x52 ^ 0x1F)) != 0x0) {
                return;
            }
        }
        int lllllllllllllIIllIIIIlllIlIllIIl = ParticleSystem.lIIlIlllIIIIII[1];
        while (llIlIIlllIIIlll(lllllllllllllIIllIIIIlllIlIllIIl, this.emitters.size())) {
            final ParticleEmitter lllllllllllllIIllIIIIlllIlIllIlI = this.emitters.get(lllllllllllllIIllIIIIlllIlIllIIl);
            lllllllllllllIIllIIIIlllIlIllIlI.resetState();
            ++lllllllllllllIIllIIIIlllIlIllIIl;
            "".length();
            if ((0x8B ^ 0xC6 ^ (0xD7 ^ 0x9E)) <= 0) {
                return;
            }
        }
    }
    
    public void setUsePoints(final boolean lllllllllllllIIllIIIIlllIIlllllI) {
        this.usePoints = lllllllllllllIIllIIIIlllIIlllllI;
    }
    
    private class ParticlePool
    {
        public /* synthetic */ ArrayList available;
        private static final /* synthetic */ int[] llIllIIlllIIlI;
        public /* synthetic */ Particle[] particles;
        
        public ParticlePool(final ParticleSystem llllllllllllIllIIlllIlllIIIIIlIl, final int llllllllllllIllIIlllIlllIIIIIIII) {
            this.particles = new Particle[llllllllllllIllIIlllIlllIIIIIIII];
            this.available = new ArrayList();
            int llllllllllllIllIIlllIlllIIIIIlll = ParticlePool.llIllIIlllIIlI[0];
            while (lIIlIlllIIlllIIl(llllllllllllIllIIlllIlllIIIIIlll, this.particles.length)) {
                this.particles[llllllllllllIllIIlllIlllIIIIIlll] = ParticleSystem.this.createParticle(llllllllllllIllIIlllIlllIIIIIlIl);
                ++llllllllllllIllIIlllIlllIIIIIlll;
                "".length();
                if (-" ".length() == "   ".length()) {
                    throw null;
                }
            }
            this.reset(llllllllllllIllIIlllIlllIIIIIlIl);
        }
        
        public void reset(final ParticleSystem llllllllllllIllIIlllIllIlllllIlI) {
            this.available.clear();
            int llllllllllllIllIIlllIllIllllllII = ParticlePool.llIllIIlllIIlI[0];
            while (lIIlIlllIIlllIIl(llllllllllllIllIIlllIllIllllllII, this.particles.length)) {
                this.available.add(this.particles[llllllllllllIllIIlllIllIllllllII]);
                "".length();
                ++llllllllllllIllIIlllIllIllllllII;
                "".length();
                if ((0x18 ^ 0x42 ^ (0x4F ^ 0x11)) < -" ".length()) {
                    return;
                }
            }
        }
        
        private static boolean lIIlIlllIIlllIIl(final int llllllllllllIllIIlllIllIllllIlIl, final int llllllllllllIllIIlllIllIllllIlII) {
            return llllllllllllIllIIlllIllIllllIlIl < llllllllllllIllIIlllIllIllllIlII;
        }
        
        private static void lIIlIlllIIlllIII() {
            (llIllIIlllIIlI = new int[1])[0] = ((84 + 4 - 10 + 51 ^ 46 + 13 + 41 + 81) & (0x3F ^ 0x79 ^ (0x1 ^ 0x73) ^ -" ".length()));
        }
        
        static {
            lIIlIlllIIlllIII();
        }
    }
}
