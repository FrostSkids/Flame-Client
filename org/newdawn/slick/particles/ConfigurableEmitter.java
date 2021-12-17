// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.particles;

import org.newdawn.slick.util.FastTrig;
import org.newdawn.slick.SlickException;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.Color;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.io.IOException;
import org.newdawn.slick.util.Log;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import org.newdawn.slick.Image;
import java.util.ArrayList;

public class ConfigurableEmitter implements ParticleEmitter
{
    public /* synthetic */ Range initialDistance;
    public /* synthetic */ LinearInterpolator scaleY;
    protected /* synthetic */ float adjusty;
    private /* synthetic */ int nextSpawn;
    public /* synthetic */ SimpleValue endAlpha;
    public /* synthetic */ LinearInterpolator size;
    public /* synthetic */ Range xOffset;
    public /* synthetic */ LinearInterpolator velocity;
    public /* synthetic */ LinearInterpolator alpha;
    public /* synthetic */ SimpleValue growthFactor;
    public /* synthetic */ String imageName;
    public /* synthetic */ RandomValue spread;
    protected /* synthetic */ boolean adjust;
    public /* synthetic */ boolean useAdditive;
    public /* synthetic */ Range emitCount;
    public /* synthetic */ Range spawnInterval;
    private /* synthetic */ int particleCount;
    public /* synthetic */ Range spawnCount;
    private /* synthetic */ float y;
    public /* synthetic */ ArrayList colors;
    private /* synthetic */ ParticleSystem engine;
    public /* synthetic */ boolean useOriented;
    private static final /* synthetic */ String[] llIIlllIllIIII;
    private /* synthetic */ int timeout;
    protected /* synthetic */ float adjustx;
    public /* synthetic */ String name;
    private static /* synthetic */ String relativePath;
    public /* synthetic */ Range initialSize;
    private /* synthetic */ boolean updateImage;
    public /* synthetic */ SimpleValue gravityFactor;
    private static final /* synthetic */ int[] llIIlllIllIIll;
    public /* synthetic */ Range length;
    private /* synthetic */ int leftToEmit;
    public /* synthetic */ int usePoints;
    private /* synthetic */ Image image;
    public /* synthetic */ SimpleValue windFactor;
    protected /* synthetic */ boolean wrapUp;
    public /* synthetic */ SimpleValue startAlpha;
    protected /* synthetic */ boolean completed;
    public /* synthetic */ Range speed;
    private /* synthetic */ float x;
    public /* synthetic */ Range yOffset;
    private /* synthetic */ boolean enabled;
    public /* synthetic */ SimpleValue angularOffset;
    public /* synthetic */ Range initialLife;
    
    public void replayCheck() {
        if (lIIIllllllIlIIIl(this.completed() ? 1 : 0) && lIIIllllllIlIlll(this.engine) && lIIIllllllIIlllI(this.engine.getParticleCount())) {
            this.replay();
        }
    }
    
    public ConfigurableEmitter duplicate() {
        ConfigurableEmitter llllllllllllIllIllllIIIlIllllIll = null;
        try {
            final ByteArrayOutputStream llllllllllllIllIllllIIIlIlllllll = new ByteArrayOutputStream();
            ParticleIO.saveEmitter(llllllllllllIllIllllIIIlIlllllll, this);
            final ByteArrayInputStream llllllllllllIllIllllIIIlIllllllI = new ByteArrayInputStream(llllllllllllIllIllllIIIlIlllllll.toByteArray());
            llllllllllllIllIllllIIIlIllllIll = ParticleIO.loadEmitter(llllllllllllIllIllllIIIlIllllllI);
            "".length();
            if (((158 + 70 - 211 + 203 ^ 51 + 38 - 75 + 131) & (0x2F ^ 0x5C ^ (0x83 ^ 0xBD) ^ -" ".length())) == (0x46 ^ 0x7D ^ (0x65 ^ 0x5A))) {
                return null;
            }
        }
        catch (IOException llllllllllllIllIllllIIIlIlllllIl) {
            Log.error(String.valueOf(new StringBuilder().append(ConfigurableEmitter.llIIlllIllIIII[ConfigurableEmitter.llIIlllIllIIll[6]]).append(llllllllllllIllIllllIIIlIlllllIl.toString())));
            return null;
        }
        return llllllllllllIllIllllIIIlIllllIll;
    }
    
    private static void lIIIllllllIIIlll() {
        (llIIlllIllIIII = new String[ConfigurableEmitter.llIIlllIllIIll[8]])[ConfigurableEmitter.llIIlllIllIIll[0]] = lIIIllllllIIIIlI("WA==", "wJGJX");
        ConfigurableEmitter.llIIlllIllIIII[ConfigurableEmitter.llIIlllIllIIll[1]] = lIIIllllllIIIIll("+WCCvz2Uix0=", "EPHRi");
        ConfigurableEmitter.llIIlllIllIIII[ConfigurableEmitter.llIIlllIllIIll[2]] = lIIIllllllIIIIll("yMU2bkPJpLM=", "lHfYg");
        ConfigurableEmitter.llIIlllIllIIII[ConfigurableEmitter.llIIlllIllIIll[4]] = lIIIllllllIIIIll("rjkVe2xNkL0=", "fBKSj");
        ConfigurableEmitter.llIIlllIllIIII[ConfigurableEmitter.llIIlllIllIIll[5]] = lIIIllllllIIIIlI("Dw==", "RRejs");
        ConfigurableEmitter.llIIlllIllIIII[ConfigurableEmitter.llIIlllIllIIll[6]] = lIIIllllllIIIlII("Nx0aXZaJvvgKbJ2HB4i3CTSjdyeeupg9mb/UNmz4yhfANRamg13JNouAXLvJVczi71tGkY3EdASgjaiH5Y5I9g==", "wegVY");
        ConfigurableEmitter.llIIlllIllIIII[ConfigurableEmitter.llIIlllIllIIll[7]] = lIIIllllllIIIlII("5H7mSYcOIS4=", "NktpW");
    }
    
    public void resetState() {
        this.wrapUp = (ConfigurableEmitter.llIIlllIllIIll[0] != 0);
        this.replay();
    }
    
    public void setEnabled(final boolean llllllllllllIllIllllIIIllllIlIll) {
        this.enabled = llllllllllllIllIllllIIIllllIlIll;
    }
    
    private static String lIIIllllllIIIIlI(String llllllllllllIllIllllIIIlIIllllII, final String llllllllllllIllIllllIIIlIlIIIIII) {
        llllllllllllIllIllllIIIlIIllllII = new String(Base64.getDecoder().decode(llllllllllllIllIllllIIIlIIllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIllllIIIlIIllllll = new StringBuilder();
        final char[] llllllllllllIllIllllIIIlIIlllllI = llllllllllllIllIllllIIIlIlIIIIII.toCharArray();
        int llllllllllllIllIllllIIIlIIllllIl = ConfigurableEmitter.llIIlllIllIIll[0];
        final byte llllllllllllIllIllllIIIlIIllIlll = (Object)llllllllllllIllIllllIIIlIIllllII.toCharArray();
        final Exception llllllllllllIllIllllIIIlIIllIllI = (Exception)llllllllllllIllIllllIIIlIIllIlll.length;
        boolean llllllllllllIllIllllIIIlIIllIlIl = ConfigurableEmitter.llIIlllIllIIll[0] != 0;
        while (lIIIllllllIlIllI(llllllllllllIllIllllIIIlIIllIlIl ? 1 : 0, (int)llllllllllllIllIllllIIIlIIllIllI)) {
            final char llllllllllllIllIllllIIIlIlIIIIlI = llllllllllllIllIllllIIIlIIllIlll[llllllllllllIllIllllIIIlIIllIlIl];
            llllllllllllIllIllllIIIlIIllllll.append((char)(llllllllllllIllIllllIIIlIlIIIIlI ^ llllllllllllIllIllllIIIlIIlllllI[llllllllllllIllIllllIIIlIIllllIl % llllllllllllIllIllllIIIlIIlllllI.length]));
            "".length();
            ++llllllllllllIllIllllIIIlIIllllIl;
            ++llllllllllllIllIllllIIIlIIllIlIl;
            "".length();
            if (((117 + 185 - 199 + 111 ^ 124 + 90 - 187 + 123) & (0x3A ^ 0x79 ^ "   ".length() ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIllllIIIlIIllllll);
    }
    
    public void updateParticle(final Particle llllllllllllIllIllllIIIllIlIIlII, final int llllllllllllIllIllllIIIllIlIIIll) {
        this.particleCount += ConfigurableEmitter.llIIlllIllIIll[1];
        llllllllllllIllIllllIIIllIlIIlII.x += this.adjustx;
        llllllllllllIllIllllIIIllIlIIlII.y += this.adjusty;
        llllllllllllIllIllllIIIllIlIIlII.adjustVelocity(this.windFactor.getValue(0.0f) * 5.0E-5f * llllllllllllIllIllllIIIllIlIIIll, this.gravityFactor.getValue(0.0f) * 5.0E-5f * llllllllllllIllIllllIIIllIlIIIll);
        final float llllllllllllIllIllllIIIllIlIIIlI = llllllllllllIllIllllIIIllIlIIlII.getLife() / llllllllllllIllIllllIIIllIlIIlII.getOriginalLife();
        final float llllllllllllIllIllllIIIllIlIIIIl = 1.0f - llllllllllllIllIllllIIIllIlIIIlI;
        float llllllllllllIllIllllIIIllIlIIIII = 0.0f;
        float llllllllllllIllIllllIIIllIIlllll = 1.0f;
        Color llllllllllllIllIllllIIIllIIllllI = null;
        Color llllllllllllIllIllllIIIllIIlllIl = null;
        int llllllllllllIllIllllIIIllIlIllII = ConfigurableEmitter.llIIlllIllIIll[0];
        while (lIIIllllllIlIllI(llllllllllllIllIllllIIIllIlIllII, this.colors.size() - ConfigurableEmitter.llIIlllIllIIll[1])) {
            final ColorRecord llllllllllllIllIllllIIIllIlIlllI = this.colors.get(llllllllllllIllIllllIIIllIlIllII);
            final ColorRecord llllllllllllIllIllllIIIllIlIllIl = this.colors.get(llllllllllllIllIllllIIIllIlIllII + ConfigurableEmitter.llIIlllIllIIll[1]);
            if (lIIIllllllIlIIll(lIIIllllllIllIII(llllllllllllIllIllllIIIllIlIIIIl, llllllllllllIllIllllIIIllIlIlllI.pos)) && lIIIllllllIlIlII(lIIIllllllIllIIl(llllllllllllIllIllllIIIllIlIIIIl, llllllllllllIllIllllIIIllIlIllIl.pos))) {
                llllllllllllIllIllllIIIllIIllllI = llllllllllllIllIllllIIIllIlIlllI.col;
                llllllllllllIllIllllIIIllIIlllIl = llllllllllllIllIllllIIIllIlIllIl.col;
                final float llllllllllllIllIllllIIIllIlIllll = llllllllllllIllIllllIIIllIlIllIl.pos - llllllllllllIllIllllIIIllIlIlllI.pos;
                llllllllllllIllIllllIIIllIlIIIII = llllllllllllIllIllllIIIllIlIIIIl - llllllllllllIllIllllIIIllIlIlllI.pos;
                llllllllllllIllIllllIIIllIlIIIII /= llllllllllllIllIllllIIIllIlIllll;
                llllllllllllIllIllllIIIllIlIIIII = 1.0f - llllllllllllIllIllllIIIllIlIIIII;
                llllllllllllIllIllllIIIllIIlllll = 1.0f - llllllllllllIllIllllIIIllIlIIIII;
            }
            ++llllllllllllIllIllllIIIllIlIllII;
            "".length();
            if ((0x12 ^ 0x44 ^ (0x35 ^ 0x66)) <= 0) {
                return;
            }
        }
        if (lIIIllllllIlIlll(llllllllllllIllIllllIIIllIIllllI)) {
            final float llllllllllllIllIllllIIIllIlIlIlI = llllllllllllIllIllllIIIllIIllllI.r * llllllllllllIllIllllIIIllIlIIIII + llllllllllllIllIllllIIIllIIlllIl.r * llllllllllllIllIllllIIIllIIlllll;
            final float llllllllllllIllIllllIIIllIlIlIIl = llllllllllllIllIllllIIIllIIllllI.g * llllllllllllIllIllllIIIllIlIIIII + llllllllllllIllIllllIIIllIIlllIl.g * llllllllllllIllIllllIIIllIIlllll;
            final float llllllllllllIllIllllIIIllIlIlIII = llllllllllllIllIllllIIIllIIllllI.b * llllllllllllIllIllllIIIllIlIIIII + llllllllllllIllIllllIIIllIIlllIl.b * llllllllllllIllIllllIIIllIIlllll;
            float llllllllllllIllIllllIIIllIlIIlll = 0.0f;
            if (lIIIllllllIlIIIl(this.alpha.isActive() ? 1 : 0)) {
                final float llllllllllllIllIllllIIIllIlIlIll = this.alpha.getValue(llllllllllllIllIllllIIIllIlIIIIl) / 255.0f;
                "".length();
                if ((0x60 ^ 0x64) == 0x0) {
                    return;
                }
            }
            else {
                llllllllllllIllIllllIIIllIlIIlll = this.startAlpha.getValue(0.0f) / 255.0f * llllllllllllIllIllllIIIllIlIIIlI + this.endAlpha.getValue(0.0f) / 255.0f * llllllllllllIllIllllIIIllIlIIIIl;
            }
            llllllllllllIllIllllIIIllIlIIlII.setColor(llllllllllllIllIllllIIIllIlIlIlI, llllllllllllIllIllllIIIllIlIlIIl, llllllllllllIllIllllIIIllIlIlIII, llllllllllllIllIllllIIIllIlIIlll);
        }
        if (lIIIllllllIlIIIl(this.size.isActive() ? 1 : 0)) {
            final float llllllllllllIllIllllIIIllIlIIllI = this.size.getValue(llllllllllllIllIllllIIIllIlIIIIl);
            llllllllllllIllIllllIIIllIlIIlII.setSize(llllllllllllIllIllllIIIllIlIIllI);
            "".length();
            if (" ".length() != " ".length()) {
                return;
            }
        }
        else {
            llllllllllllIllIllllIIIllIlIIlII.adjustSize(llllllllllllIllIllllIIIllIlIIIll * this.growthFactor.getValue(0.0f) * 0.001f);
        }
        if (lIIIllllllIlIIIl(this.velocity.isActive() ? 1 : 0)) {
            llllllllllllIllIllllIIIllIlIIlII.setSpeed(this.velocity.getValue(llllllllllllIllIllllIIIllIlIIIIl));
        }
        if (lIIIllllllIlIIIl(this.scaleY.isActive() ? 1 : 0)) {
            llllllllllllIllIllllIIIllIlIIlII.setScaleY(this.scaleY.getValue(llllllllllllIllIllllIIIllIlIIIIl));
        }
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(ConfigurableEmitter.llIIlllIllIIII[ConfigurableEmitter.llIIlllIllIIll[4]]).append(this.name).append(ConfigurableEmitter.llIIlllIllIIII[ConfigurableEmitter.llIIlllIllIIll[5]]));
    }
    
    private static int lIIIllllllIllIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIIIllllllIlIIII(final Object llllllllllllIllIllllIIIlIIIllIll) {
        return llllllllllllIllIllllIIIlIIIllIll == null;
    }
    
    public boolean isEnabled() {
        return this.enabled;
    }
    
    public boolean isOriented() {
        return this.useOriented;
    }
    
    public ConfigurableEmitter(final String llllllllllllIllIllllIIlIIIIlllIl) {
        this.spawnInterval = new Range(100.0f, 100.0f);
        this.spawnCount = new Range(5.0f, 5.0f);
        this.initialLife = new Range(1000.0f, 1000.0f);
        this.initialSize = new Range(10.0f, 10.0f);
        this.xOffset = new Range(0.0f, 0.0f);
        this.yOffset = new Range(0.0f, 0.0f);
        this.spread = new RandomValue(360.0f);
        this.angularOffset = new SimpleValue(0.0f);
        this.initialDistance = new Range(0.0f, 0.0f);
        this.speed = new Range(50.0f, 50.0f);
        this.growthFactor = new SimpleValue(0.0f);
        this.gravityFactor = new SimpleValue(0.0f);
        this.windFactor = new SimpleValue(0.0f);
        this.length = new Range(1000.0f, 1000.0f);
        this.colors = new ArrayList();
        this.startAlpha = new SimpleValue(255.0f);
        this.endAlpha = new SimpleValue(0.0f);
        this.emitCount = new Range(1000.0f, 1000.0f);
        this.usePoints = ConfigurableEmitter.llIIlllIllIIll[1];
        this.useOriented = (ConfigurableEmitter.llIIlllIllIIll[0] != 0);
        this.useAdditive = (ConfigurableEmitter.llIIlllIllIIll[0] != 0);
        this.imageName = ConfigurableEmitter.llIIlllIllIIII[ConfigurableEmitter.llIIlllIllIIll[2]];
        this.enabled = (ConfigurableEmitter.llIIlllIllIIll[1] != 0);
        this.nextSpawn = ConfigurableEmitter.llIIlllIllIIll[0];
        this.wrapUp = (ConfigurableEmitter.llIIlllIllIIll[0] != 0);
        this.completed = (ConfigurableEmitter.llIIlllIllIIll[0] != 0);
        this.name = llllllllllllIllIllllIIlIIIIlllIl;
        this.leftToEmit = (int)this.emitCount.random();
        this.timeout = (int)this.length.random();
        this.colors.add(new ColorRecord(0.0f, Color.white));
        "".length();
        this.colors.add(new ColorRecord(1.0f, Color.red));
        "".length();
        ArrayList llllllllllllIllIllllIIlIIIIlllII = new ArrayList();
        llllllllllllIllIllllIIlIIIIlllII.add(new Vector2f(0.0f, 0.0f));
        "".length();
        llllllllllllIllIllllIIlIIIIlllII.add(new Vector2f(1.0f, 255.0f));
        "".length();
        this.alpha = new LinearInterpolator(llllllllllllIllIllllIIlIIIIlllII, ConfigurableEmitter.llIIlllIllIIll[0], ConfigurableEmitter.llIIlllIllIIll[3]);
        llllllllllllIllIllllIIlIIIIlllII = new ArrayList();
        llllllllllllIllIllllIIlIIIIlllII.add(new Vector2f(0.0f, 0.0f));
        "".length();
        llllllllllllIllIllllIIlIIIIlllII.add(new Vector2f(1.0f, 255.0f));
        "".length();
        this.size = new LinearInterpolator(llllllllllllIllIllllIIlIIIIlllII, ConfigurableEmitter.llIIlllIllIIll[0], ConfigurableEmitter.llIIlllIllIIll[3]);
        llllllllllllIllIllllIIlIIIIlllII = new ArrayList();
        llllllllllllIllIllllIIlIIIIlllII.add(new Vector2f(0.0f, 0.0f));
        "".length();
        llllllllllllIllIllllIIlIIIIlllII.add(new Vector2f(1.0f, 1.0f));
        "".length();
        this.velocity = new LinearInterpolator(llllllllllllIllIllllIIlIIIIlllII, ConfigurableEmitter.llIIlllIllIIll[0], ConfigurableEmitter.llIIlllIllIIll[1]);
        llllllllllllIllIllllIIlIIIIlllII = new ArrayList();
        llllllllllllIllIllllIIlIIIIlllII.add(new Vector2f(0.0f, 0.0f));
        "".length();
        llllllllllllIllIllllIIlIIIIlllII.add(new Vector2f(1.0f, 1.0f));
        "".length();
        this.scaleY = new LinearInterpolator(llllllllllllIllIllllIIlIIIIlllII, ConfigurableEmitter.llIIlllIllIIll[0], ConfigurableEmitter.llIIlllIllIIll[1]);
    }
    
    public boolean completed() {
        if (lIIIllllllIlIIII(this.engine)) {
            return ConfigurableEmitter.llIIlllIllIIll[0] != 0;
        }
        if (lIIIllllllIlIIIl(this.length.isEnabled() ? 1 : 0)) {
            if (lIIIllllllIllIlI(this.timeout)) {
                return ConfigurableEmitter.llIIlllIllIIll[0] != 0;
            }
            return this.completed;
        }
        else if (lIIIllllllIlIIIl(this.emitCount.isEnabled() ? 1 : 0)) {
            if (lIIIllllllIllIlI(this.leftToEmit)) {
                return ConfigurableEmitter.llIIlllIllIIll[0] != 0;
            }
            return this.completed;
        }
        else {
            if (lIIIllllllIlIIIl(this.wrapUp ? 1 : 0)) {
                return this.completed;
            }
            return ConfigurableEmitter.llIIlllIllIIll[0] != 0;
        }
    }
    
    public void setPosition(final float llllllllllllIllIllllIIIllllllllI, final float llllllllllllIllIllllIIIlllllllIl, final boolean llllllllllllIllIllllIIIlllllllII) {
        if (lIIIllllllIlIIIl(llllllllllllIllIllllIIIlllllllII ? 1 : 0)) {
            this.adjust = (ConfigurableEmitter.llIIlllIllIIll[1] != 0);
            this.adjustx -= this.x - llllllllllllIllIllllIIIllllllllI;
            this.adjusty -= this.y - llllllllllllIllIllllIIIlllllllIl;
        }
        this.x = llllllllllllIllIllllIIIllllllllI;
        this.y = llllllllllllIllIllllIIIlllllllIl;
    }
    
    private static int lIIIllllllIllIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIIIllllllIIlllI(final int llllllllllllIllIllllIIIlIIIlIlll) {
        return llllllllllllIllIllllIIIlIIIlIlll == 0;
    }
    
    private static int lIIIllllllIlIIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public boolean usePoints(final ParticleSystem llllllllllllIllIllllIIIlIllIIlII) {
        int n;
        if ((lIIIllllllIllIll(this.usePoints, ConfigurableEmitter.llIIlllIllIIll[1]) && !lIIIllllllIIlllI(llllllllllllIllIllllIIIlIllIIlII.usePoints() ? 1 : 0)) || lIIIllllllIllIll(this.usePoints, ConfigurableEmitter.llIIlllIllIIll[2])) {
            n = ConfigurableEmitter.llIIlllIllIIll[1];
            "".length();
            if ((0x76 ^ 0x72) != (0x64 ^ 0x60)) {
                return ((0xCE ^ 0x8D) & ~(0x78 ^ 0x3B)) != 0x0;
            }
        }
        else {
            n = ConfigurableEmitter.llIIlllIllIIll[0];
        }
        return n != 0;
    }
    
    private static String lIIIllllllIIIIll(final String llllllllllllIllIllllIIIlIlIlIIIl, final String llllllllllllIllIllllIIIlIlIlIIII) {
        try {
            final SecretKeySpec llllllllllllIllIllllIIIlIlIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllllIIIlIlIlIIII.getBytes(StandardCharsets.UTF_8)), ConfigurableEmitter.llIIlllIllIIll[9]), "DES");
            final Cipher llllllllllllIllIllllIIIlIlIlIIll = Cipher.getInstance("DES");
            llllllllllllIllIllllIIIlIlIlIIll.init(ConfigurableEmitter.llIIlllIllIIll[2], llllllllllllIllIllllIIIlIlIlIlII);
            return new String(llllllllllllIllIllllIIIlIlIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIllllIIIlIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllllIIIlIlIlIIlI) {
            llllllllllllIllIllllIIIlIlIlIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIllllllIllIlI(final int llllllllllllIllIllllIIIlIIIIllll) {
        return llllllllllllIllIllllIIIlIIIIllll > 0;
    }
    
    private static boolean lIIIllllllIllIll(final int llllllllllllIllIllllIIIlIIlIIlII, final int llllllllllllIllIllllIIIlIIlIIIll) {
        return llllllllllllIllIllllIIIlIIlIIlII == llllllllllllIllIllllIIIlIIlIIIll;
    }
    
    public void addColorPoint(final float llllllllllllIllIllllIIIlIllIllll, final Color llllllllllllIllIllllIIIlIlllIIIl) {
        this.colors.add(new ColorRecord(llllllllllllIllIllllIIIlIllIllll, llllllllllllIllIllllIIIlIlllIIIl));
        "".length();
    }
    
    public String getImageName() {
        return this.imageName;
    }
    
    private static boolean lIIIllllllIlIlIl(final int llllllllllllIllIllllIIIlIIIlIIll) {
        return llllllllllllIllIllllIIIlIIIlIIll < 0;
    }
    
    private static boolean lIIIllllllIlIlII(final int llllllllllllIllIllllIIIlIIIlIIIl) {
        return llllllllllllIllIllllIIIlIIIlIIIl <= 0;
    }
    
    public static void setRelativePath(String llllllllllllIllIllllIIlIIIlIIIlI) {
        if (lIIIllllllIIlllI(((String)llllllllllllIllIllllIIlIIIlIIIlI).endsWith(ConfigurableEmitter.llIIlllIllIIII[ConfigurableEmitter.llIIlllIllIIll[0]]) ? 1 : 0)) {
            llllllllllllIllIllllIIlIIIlIIIlI = String.valueOf(new StringBuilder().append((String)llllllllllllIllIllllIIlIIIlIIIlI).append(ConfigurableEmitter.llIIlllIllIIII[ConfigurableEmitter.llIIlllIllIIll[1]]));
        }
        ConfigurableEmitter.relativePath = (String)llllllllllllIllIllllIIlIIIlIIIlI;
    }
    
    public Image getImage() {
        return this.image;
    }
    
    private static boolean lIIIllllllIlIIIl(final int llllllllllllIllIllllIIIlIIIllIIl) {
        return llllllllllllIllIllllIIIlIIIllIIl != 0;
    }
    
    public void wrapUp() {
        this.wrapUp = (ConfigurableEmitter.llIIlllIllIIll[1] != 0);
    }
    
    public void setImageName(String llllllllllllIllIllllIIlIIIIlIIll) {
        if (lIIIllllllIIlllI(llllllllllllIllIllllIIlIIIIlIIll.length())) {
            llllllllllllIllIllllIIlIIIIlIIll = null;
        }
        this.imageName = llllllllllllIllIllllIIlIIIIlIIll;
        if (lIIIllllllIlIIII(llllllllllllIllIllllIIlIIIIlIIll)) {
            this.image = null;
            "".length();
            if (-(0x14 ^ 0x10) > 0) {
                return;
            }
        }
        else {
            this.updateImage = (ConfigurableEmitter.llIIlllIllIIll[1] != 0);
        }
    }
    
    public float getX() {
        return this.x;
    }
    
    private static boolean lIIIllllllIlIlll(final Object llllllllllllIllIllllIIIlIIIlllIl) {
        return llllllllllllIllIllllIIIlIIIlllIl != null;
    }
    
    public void setPosition(final float llllllllllllIllIllllIIlIIIIIlIII, final float llllllllllllIllIllllIIlIIIIIIlll) {
        this.setPosition(llllllllllllIllIllllIIlIIIIIlIII, llllllllllllIllIllllIIlIIIIIIlll, (boolean)(ConfigurableEmitter.llIIlllIllIIll[1] != 0));
    }
    
    public void replay() {
        this.reset();
        this.nextSpawn = ConfigurableEmitter.llIIlllIllIIll[0];
        this.leftToEmit = (int)this.emitCount.random();
        this.timeout = (int)this.length.random();
    }
    
    public float getY() {
        return this.y;
    }
    
    private static boolean lIIIllllllIlIllI(final int llllllllllllIllIllllIIIlIIlIIIII, final int llllllllllllIllIllllIIIlIIIlllll) {
        return llllllllllllIllIllllIIIlIIlIIIII < llllllllllllIllIllllIIIlIIIlllll;
    }
    
    private static void lIIIllllllIIllIl() {
        (llIIlllIllIIll = new int[10])[0] = ((0x4A ^ 0xE) & ~(0x3F ^ 0x7B));
        ConfigurableEmitter.llIIlllIllIIll[1] = " ".length();
        ConfigurableEmitter.llIIlllIllIIll[2] = "  ".length();
        ConfigurableEmitter.llIIlllIllIIll[3] = 25 + 101 + 10 + 119;
        ConfigurableEmitter.llIIlllIllIIll[4] = "   ".length();
        ConfigurableEmitter.llIIlllIllIIll[5] = (0xB ^ 0xF);
        ConfigurableEmitter.llIIlllIllIIll[6] = (0x74 ^ 0x58 ^ (0xB5 ^ 0x9C));
        ConfigurableEmitter.llIIlllIllIIll[7] = (0x7C ^ 0x7A);
        ConfigurableEmitter.llIIlllIllIIll[8] = (152 + 8 - 32 + 28 ^ 13 + 4 + 40 + 98);
        ConfigurableEmitter.llIIlllIllIIll[9] = (0x2B ^ 0x23);
    }
    
    public boolean useAdditive() {
        return this.useAdditive;
    }
    
    public void update(final ParticleSystem llllllllllllIllIllllIIIlllIIllII, final int llllllllllllIllIllllIIIlllIIlIll) {
        this.engine = llllllllllllIllIllllIIIlllIIllII;
        if (lIIIllllllIIlllI(this.adjust ? 1 : 0)) {
            this.adjustx = 0.0f;
            this.adjusty = 0.0f;
            "".length();
            if (" ".length() <= 0) {
                return;
            }
        }
        else {
            this.adjust = (ConfigurableEmitter.llIIlllIllIIll[0] != 0);
        }
        if (lIIIllllllIlIIIl(this.updateImage ? 1 : 0)) {
            this.updateImage = (ConfigurableEmitter.llIIlllIllIIll[0] != 0);
            try {
                this.image = new Image(String.valueOf(new StringBuilder().append(ConfigurableEmitter.relativePath).append(this.imageName)));
                "".length();
                if (-" ".length() >= ((105 + 20 + 2 + 119 ^ 66 + 132 - 77 + 55) & (226 + 124 - 229 + 115 ^ 5 + 133 + 24 + 8 ^ -" ".length()))) {
                    return;
                }
            }
            catch (SlickException llllllllllllIllIllllIIIlllIllIlI) {
                this.image = null;
                Log.error(llllllllllllIllIllllIIIlllIllIlI);
            }
        }
        if ((!lIIIllllllIIlllI(this.wrapUp ? 1 : 0) || (lIIIllllllIlIIIl(this.length.isEnabled() ? 1 : 0) && !lIIIllllllIlIIll(this.timeout)) || (lIIIllllllIlIIIl(this.emitCount.isEnabled() ? 1 : 0) && lIIIllllllIlIlII(this.leftToEmit))) && lIIIllllllIIlllI(this.particleCount)) {
            this.completed = (ConfigurableEmitter.llIIlllIllIIll[1] != 0);
        }
        this.particleCount = ConfigurableEmitter.llIIlllIllIIll[0];
        if (lIIIllllllIlIIIl(this.wrapUp ? 1 : 0)) {
            return;
        }
        if (lIIIllllllIlIIIl(this.length.isEnabled() ? 1 : 0)) {
            if (lIIIllllllIlIlIl(this.timeout)) {
                return;
            }
            this.timeout -= llllllllllllIllIllllIIIlllIIlIll;
        }
        if (lIIIllllllIlIIIl(this.emitCount.isEnabled() ? 1 : 0) && lIIIllllllIlIlII(this.leftToEmit)) {
            return;
        }
        this.nextSpawn -= llllllllllllIllIllllIIIlllIIlIll;
        if (lIIIllllllIlIlIl(this.nextSpawn)) {
            this.nextSpawn = (int)this.spawnInterval.random();
            final int llllllllllllIllIllllIIIlllIIlllI = (int)this.spawnCount.random();
            int llllllllllllIllIllllIIIlllIIllll = ConfigurableEmitter.llIIlllIllIIll[0];
            while (lIIIllllllIlIllI(llllllllllllIllIllllIIIlllIIllll, llllllllllllIllIllllIIIlllIIlllI)) {
                final Particle llllllllllllIllIllllIIIlllIlIIll = llllllllllllIllIllllIIIlllIIllII.getNewParticle(this, this.initialLife.random());
                llllllllllllIllIllllIIIlllIlIIll.setSize(this.initialSize.random());
                llllllllllllIllIllllIIIlllIlIIll.setPosition(this.x + this.xOffset.random(), this.y + this.yOffset.random());
                llllllllllllIllIllllIIIlllIlIIll.setVelocity(0.0f, 0.0f, 0.0f);
                final float llllllllllllIllIllllIIIlllIlIIlI = this.initialDistance.random();
                final float llllllllllllIllIllllIIIlllIlIIIl = this.speed.random();
                if (!lIIIllllllIIlllI(lIIIllllllIlIIlI(llllllllllllIllIllllIIIlllIlIIlI, 0.0f)) || lIIIllllllIlIIIl(lIIIllllllIlIIlI(llllllllllllIllIllllIIIlllIlIIIl, 0.0f))) {
                    final float llllllllllllIllIllllIIIlllIllIIl = this.spread.getValue(0.0f);
                    final float llllllllllllIllIllllIIIlllIllIII = llllllllllllIllIllllIIIlllIllIIl + this.angularOffset.getValue(0.0f) - this.spread.getValue() / 2.0f - 90.0f;
                    final float llllllllllllIllIllllIIIlllIlIlll = (float)FastTrig.cos(Math.toRadians(llllllllllllIllIllllIIIlllIllIII)) * llllllllllllIllIllllIIIlllIlIIlI;
                    final float llllllllllllIllIllllIIIlllIlIllI = (float)FastTrig.sin(Math.toRadians(llllllllllllIllIllllIIIlllIllIII)) * llllllllllllIllIllllIIIlllIlIIlI;
                    llllllllllllIllIllllIIIlllIlIIll.adjustPosition(llllllllllllIllIllllIIIlllIlIlll, llllllllllllIllIllllIIIlllIlIllI);
                    final float llllllllllllIllIllllIIIlllIlIlIl = (float)FastTrig.cos(Math.toRadians(llllllllllllIllIllllIIIlllIllIII));
                    final float llllllllllllIllIllllIIIlllIlIlII = (float)FastTrig.sin(Math.toRadians(llllllllllllIllIllllIIIlllIllIII));
                    llllllllllllIllIllllIIIlllIlIIll.setVelocity(llllllllllllIllIllllIIIlllIlIlIl, llllllllllllIllIllllIIIlllIlIlII, llllllllllllIllIllllIIIlllIlIIIl * 0.001f);
                }
                if (lIIIllllllIlIlll(this.image)) {
                    llllllllllllIllIllllIIIlllIlIIll.setImage(this.image);
                }
                final ColorRecord llllllllllllIllIllllIIIlllIlIIII = this.colors.get(ConfigurableEmitter.llIIlllIllIIll[0]);
                llllllllllllIllIllllIIIlllIlIIll.setColor(llllllllllllIllIllllIIIlllIlIIII.col.r, llllllllllllIllIllllIIIlllIlIIII.col.g, llllllllllllIllIllllIIIlllIlIIII.col.b, this.startAlpha.getValue(0.0f) / 255.0f);
                llllllllllllIllIllllIIIlllIlIIll.setUsePoint(this.usePoints);
                llllllllllllIllIllllIIIlllIlIIll.setOriented(this.useOriented);
                if (lIIIllllllIlIIIl(this.emitCount.isEnabled() ? 1 : 0)) {
                    this.leftToEmit -= ConfigurableEmitter.llIIlllIllIIll[1];
                    if (lIIIllllllIlIlII(this.leftToEmit)) {
                        "".length();
                        if (-"  ".length() >= 0) {
                            return;
                        }
                        break;
                    }
                }
                ++llllllllllllIllIllllIIIlllIIllll;
                "".length();
                if (null != null) {
                    return;
                }
            }
        }
    }
    
    private static boolean lIIIllllllIlIIll(final int llllllllllllIllIllllIIIlIIIlIlIl) {
        return llllllllllllIllIllllIIIlIIIlIlIl >= 0;
    }
    
    private static String lIIIllllllIIIlII(final String llllllllllllIllIllllIIIlIIlIllII, final String llllllllllllIllIllllIIIlIIlIlIIl) {
        try {
            final SecretKeySpec llllllllllllIllIllllIIIlIIlIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllllIIIlIIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllllIIIlIIlIlllI = Cipher.getInstance("Blowfish");
            llllllllllllIllIllllIIIlIIlIlllI.init(ConfigurableEmitter.llIIlllIllIIll[2], llllllllllllIllIllllIIIlIIlIllll);
            return new String(llllllllllllIllIllllIIIlIIlIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIllllIIIlIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllllIIIlIIlIllIl) {
            llllllllllllIllIllllIIIlIIlIllIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIIllllllIIllIl();
        lIIIllllllIIIlll();
        ConfigurableEmitter.relativePath = ConfigurableEmitter.llIIlllIllIIII[ConfigurableEmitter.llIIlllIllIIll[7]];
    }
    
    public void reset() {
        this.completed = (ConfigurableEmitter.llIIlllIllIIll[0] != 0);
        if (lIIIllllllIlIlll(this.engine)) {
            this.engine.releaseAll(this);
        }
    }
    
    public class ColorRecord
    {
        public /* synthetic */ Color col;
        public /* synthetic */ float pos;
        
        public ColorRecord(final float llllllllllllIllIlIlIIIIIIIIIIIIl, final Color llllllllllllIllIlIlIIIIIIIIIIIII) {
            this.pos = llllllllllllIllIlIlIIIIIIIIIIIIl;
            this.col = llllllllllllIllIlIlIIIIIIIIIIIII;
        }
    }
    
    public class LinearInterpolator implements Value
    {
        private /* synthetic */ boolean active;
        private static final /* synthetic */ int[] llIlIlIIIlIIII;
        private /* synthetic */ ArrayList curve;
        private /* synthetic */ int min;
        private /* synthetic */ int max;
        
        private static boolean lIIlIIlllIIlllIl(final int llllllllllllIllIlIllIIIIIIllIlII) {
            return llllllllllllIllIlIllIIIIIIllIlII >= 0;
        }
        
        public int getMax() {
            return this.max;
        }
        
        public ArrayList getCurve() {
            return this.curve;
        }
        
        static {
            lIIlIIlllIIllIIl();
        }
        
        private static boolean lIIlIIlllIIllllI(final int llllllllllllIllIlIllIIIIIIllIIlI) {
            return llllllllllllIllIlIllIIIIIIllIIlI <= 0;
        }
        
        public LinearInterpolator(final ArrayList llllllllllllIllIlIllIIIIIllllIlI, final int llllllllllllIllIlIllIIIIIlllIlII, final int llllllllllllIllIlIllIIIIIlllIIll) {
            this.curve = llllllllllllIllIlIllIIIIIllllIlI;
            this.min = llllllllllllIllIlIllIIIIIlllIlII;
            this.max = llllllllllllIllIlIllIIIIIlllIIll;
            this.active = (LinearInterpolator.llIlIlIIIlIIII[0] != 0);
        }
        
        public void setCurve(final ArrayList llllllllllllIllIlIllIIIIIllIllIl) {
            this.curve = llllllllllllIllIlIllIIIIIllIllIl;
        }
        
        private static int lIIlIIlllIIllIll(final float n, final float n2) {
            return fcmpg(n, n2);
        }
        
        public float getValue(final float llllllllllllIllIlIllIIIIIlIllIlI) {
            Vector2f llllllllllllIllIlIllIIIIIlIlllII = this.curve.get(LinearInterpolator.llIlIlIIIlIIII[0]);
            int llllllllllllIllIlIllIIIIIlIlllll = LinearInterpolator.llIlIlIIIlIIII[1];
            while (lIIlIIlllIIlllII(llllllllllllIllIlIllIIIIIlIlllll, this.curve.size())) {
                final Vector2f llllllllllllIllIlIllIIIIIllIIIII = this.curve.get(llllllllllllIllIlIllIIIIIlIlllll);
                if (lIIlIIlllIIlllIl(lIIlIIlllIIllIlI(llllllllllllIllIlIllIIIIIlIllIlI, llllllllllllIllIlIllIIIIIlIlllII.getX())) && lIIlIIlllIIllllI(lIIlIIlllIIllIll(llllllllllllIllIlIllIIIIIlIllIlI, llllllllllllIllIlIllIIIIIllIIIII.getX()))) {
                    final float llllllllllllIllIlIllIIIIIllIIIlI = (llllllllllllIllIlIllIIIIIlIllIlI - llllllllllllIllIlIllIIIIIlIlllII.getX()) / (llllllllllllIllIlIllIIIIIllIIIII.getX() - llllllllllllIllIlIllIIIIIlIlllII.getX());
                    final float llllllllllllIllIlIllIIIIIllIIIIl = llllllllllllIllIlIllIIIIIlIlllII.getY() + llllllllllllIllIlIllIIIIIllIIIlI * (llllllllllllIllIlIllIIIIIllIIIII.getY() - llllllllllllIllIlIllIIIIIlIlllII.getY());
                    return llllllllllllIllIlIllIIIIIllIIIIl;
                }
                llllllllllllIllIlIllIIIIIlIlllII = llllllllllllIllIlIllIIIIIllIIIII;
                ++llllllllllllIllIlIllIIIIIlIlllll;
                "".length();
                if (((0x69 ^ 0x25) & ~(0x8E ^ 0xC2)) == (0x97 ^ 0x93)) {
                    return 0.0f;
                }
            }
            return 0.0f;
        }
        
        private static int lIIlIIlllIIllIlI(final float n, final float n2) {
            return fcmpl(n, n2);
        }
        
        public void setMax(final int llllllllllllIllIlIllIIIIIlIIIIll) {
            this.max = llllllllllllIllIlIllIIIIIlIIIIll;
        }
        
        public void setActive(final boolean llllllllllllIllIlIllIIIIIlIIlllI) {
            this.active = llllllllllllIllIlIllIIIIIlIIlllI;
        }
        
        public int getMin() {
            return this.min;
        }
        
        public boolean isActive() {
            return this.active;
        }
        
        public void setMin(final int llllllllllllIllIlIllIIIIIIllllII) {
            this.min = llllllllllllIllIlIllIIIIIIllllII;
        }
        
        private static void lIIlIIlllIIllIIl() {
            (llIlIlIIIlIIII = new int[2])[0] = ((0xB9 ^ 0x8F) & ~(0x74 ^ 0x42));
            LinearInterpolator.llIlIlIIIlIIII[1] = " ".length();
        }
        
        private static boolean lIIlIIlllIIlllII(final int llllllllllllIllIlIllIIIIIIllIlll, final int llllllllllllIllIlIllIIIIIIllIllI) {
            return llllllllllllIllIlIllIIIIIIllIlll < llllllllllllIllIlIllIIIIIIllIllI;
        }
    }
    
    public interface Value
    {
        float getValue(final float p0);
    }
    
    public class Range
    {
        private /* synthetic */ float min;
        private /* synthetic */ boolean enabled;
        private /* synthetic */ float max;
        private static final /* synthetic */ int[] llIlIIIIIlllll;
        
        public void setMin(final float llllllllllllIllIllIllIIlIIIlIllI) {
            this.min = llllllllllllIllIllIllIIlIIIlIllI;
        }
        
        public float getMin() {
            return this.min;
        }
        
        public float random() {
            return (float)(this.min + Math.random() * (this.max - this.min));
        }
        
        public void setMax(final float llllllllllllIllIllIllIIlIIIlllll) {
            this.max = llllllllllllIllIllIllIIlIIIlllll;
        }
        
        public boolean isEnabled() {
            return this.enabled;
        }
        
        private Range(final float llllllllllllIllIllIllIIlIIllIlIl, final float llllllllllllIllIllIllIIlIIllIlII) {
            this.enabled = (Range.llIlIIIIIlllll[0] != 0);
            this.min = llllllllllllIllIllIllIIlIIllIlIl;
            this.max = llllllllllllIllIllIllIIlIIllIlII;
        }
        
        public float getMax() {
            return this.max;
        }
        
        private static void lIIlIIIlIIlllllI() {
            (llIlIIIIIlllll = new int[1])[0] = ((0x39 ^ 0x6) & ~(0x45 ^ 0x7A));
        }
        
        static {
            lIIlIIIlIIlllllI();
        }
        
        public void setEnabled(final boolean llllllllllllIllIllIllIIlIIlIlIlI) {
            this.enabled = llllllllllllIllIllIllIIlIIlIlIlI;
        }
    }
    
    public class RandomValue implements Value
    {
        private /* synthetic */ float value;
        
        private RandomValue(final float lllllllllllllIlIIIlIlIIIIlIlIllI) {
            this.value = lllllllllllllIlIIIlIlIIIIlIlIllI;
        }
        
        public float getValue() {
            return this.value;
        }
        
        public float getValue(final float lllllllllllllIlIIIlIlIIIIlIlIIll) {
            return (float)(Math.random() * this.value);
        }
        
        public void setValue(final float lllllllllllllIlIIIlIlIIIIlIIllII) {
            this.value = lllllllllllllIlIIIlIlIIIIlIIllII;
        }
    }
    
    public class SimpleValue implements Value
    {
        private /* synthetic */ float value;
        
        private SimpleValue(final float llllllllllllIlIlllIllIlIIllIIIlI) {
            this.value = llllllllllllIlIlllIllIlIIllIIIlI;
        }
        
        public void setValue(final float llllllllllllIlIlllIllIlIIlIllIII) {
            this.value = llllllllllllIlIlllIllIlIIlIllIII;
        }
        
        public float getValue(final float llllllllllllIlIlllIllIlIIlIlllll) {
            return this.value;
        }
    }
}
