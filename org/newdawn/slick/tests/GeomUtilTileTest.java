// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import java.util.Collection;
import java.util.HashSet;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.geom.Polygon;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.GameContainer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.geom.GeomUtil;
import java.util.ArrayList;
import org.newdawn.slick.geom.GeomUtilListener;
import org.newdawn.slick.BasicGame;

public class GeomUtilTileTest extends BasicGame implements GeomUtilListener
{
    private /* synthetic */ ArrayList[][] quadSpace;
    private /* synthetic */ GeomUtil util;
    private /* synthetic */ Shape[][] quadSpaceShapes;
    private /* synthetic */ ArrayList original;
    private /* synthetic */ ArrayList combined;
    private static final /* synthetic */ String[] lllIIllllIIlll;
    private /* synthetic */ ArrayList intersections;
    private static final /* synthetic */ int[] lllIIllllIlIll;
    private /* synthetic */ ArrayList used;
    
    public void pointUsed(final float llllllllllllIlIlllIlIllIlIIllIlI, final float llllllllllllIlIlllIlIllIlIIllIIl) {
        this.used.add(new Vector2f(llllllllllllIlIlllIlIllIlIIllIlI, llllllllllllIlIlllIlIllIlIIllIIl));
        "".length();
    }
    
    private static String lIlIIIIIlllIllII(final String llllllllllllIlIlllIlIllIIllllIIl, final String llllllllllllIlIlllIlIllIIlllIllI) {
        try {
            final SecretKeySpec llllllllllllIlIlllIlIllIIlllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIlIllIIlllIllI.getBytes(StandardCharsets.UTF_8)), GeomUtilTileTest.lllIIllllIlIll[9]), "DES");
            final Cipher llllllllllllIlIlllIlIllIIllllIll = Cipher.getInstance("DES");
            llllllllllllIlIlllIlIllIIllllIll.init(GeomUtilTileTest.lllIIllllIlIll[3], llllllllllllIlIlllIlIllIIlllllII);
            return new String(llllllllllllIlIlllIlIllIIllllIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIlIllIIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIlIllIIllllIlI) {
            llllllllllllIlIlllIlIllIIllllIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void init(final GameContainer llllllllllllIlIlllIlIllIllIIllII) throws SlickException {
        this.util.setListener(this);
        this.init();
    }
    
    private static String lIlIIIIIlllIlllI(final String llllllllllllIlIlllIlIllIIllIlIlI, final String llllllllllllIlIlllIlIllIIllIlIIl) {
        try {
            final SecretKeySpec llllllllllllIlIlllIlIllIIllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIlIllIIllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllIlIllIIllIlllI = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllIlIllIIllIlllI.init(GeomUtilTileTest.lllIIllllIlIll[3], llllllllllllIlIlllIlIllIIllIllll);
            return new String(llllllllllllIlIlllIlIllIIllIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIlIllIIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIlIllIIllIllIl) {
            llllllllllllIlIlllIlIllIIllIllIl.printStackTrace();
            return null;
        }
    }
    
    public void init() {
        final int llllllllllllIlIlllIlIlllIIllIIIl = GeomUtilTileTest.lllIIllllIlIll[1];
        final int[][] array = new int[GeomUtilTileTest.lllIIllllIlIll[1]][];
        final int n = GeomUtilTileTest.lllIIllllIlIll[0];
        final int[] array2 = new int[GeomUtilTileTest.lllIIllllIlIll[1]];
        array2[GeomUtilTileTest.lllIIllllIlIll[0]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array2[GeomUtilTileTest.lllIIllllIlIll[2]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array2[GeomUtilTileTest.lllIIllllIlIll[3]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array2[GeomUtilTileTest.lllIIllllIlIll[4]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array2[GeomUtilTileTest.lllIIllllIlIll[5]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array2[GeomUtilTileTest.lllIIllllIlIll[6]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array2[GeomUtilTileTest.lllIIllllIlIll[7]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array2[GeomUtilTileTest.lllIIllllIlIll[8]] = GeomUtilTileTest.lllIIllllIlIll[4];
        array2[GeomUtilTileTest.lllIIllllIlIll[9]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array2[GeomUtilTileTest.lllIIllllIlIll[10]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array[n] = array2;
        final int n2 = GeomUtilTileTest.lllIIllllIlIll[2];
        final int[] array3 = new int[GeomUtilTileTest.lllIIllllIlIll[1]];
        array3[GeomUtilTileTest.lllIIllllIlIll[0]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array3[GeomUtilTileTest.lllIIllllIlIll[2]] = GeomUtilTileTest.lllIIllllIlIll[2];
        array3[GeomUtilTileTest.lllIIllllIlIll[3]] = GeomUtilTileTest.lllIIllllIlIll[2];
        array3[GeomUtilTileTest.lllIIllllIlIll[4]] = GeomUtilTileTest.lllIIllllIlIll[2];
        array3[GeomUtilTileTest.lllIIllllIlIll[5]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array3[GeomUtilTileTest.lllIIllllIlIll[6]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array3[GeomUtilTileTest.lllIIllllIlIll[7]] = GeomUtilTileTest.lllIIllllIlIll[2];
        array3[GeomUtilTileTest.lllIIllllIlIll[8]] = GeomUtilTileTest.lllIIllllIlIll[2];
        array3[GeomUtilTileTest.lllIIllllIlIll[9]] = GeomUtilTileTest.lllIIllllIlIll[2];
        array3[GeomUtilTileTest.lllIIllllIlIll[10]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array[n2] = array3;
        final int n3 = GeomUtilTileTest.lllIIllllIlIll[3];
        final int[] array4 = new int[GeomUtilTileTest.lllIIllllIlIll[1]];
        array4[GeomUtilTileTest.lllIIllllIlIll[0]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array4[GeomUtilTileTest.lllIIllllIlIll[2]] = GeomUtilTileTest.lllIIllllIlIll[2];
        array4[GeomUtilTileTest.lllIIllllIlIll[3]] = GeomUtilTileTest.lllIIllllIlIll[2];
        array4[GeomUtilTileTest.lllIIllllIlIll[4]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array4[GeomUtilTileTest.lllIIllllIlIll[5]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array4[GeomUtilTileTest.lllIIllllIlIll[6]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array4[GeomUtilTileTest.lllIIllllIlIll[7]] = GeomUtilTileTest.lllIIllllIlIll[6];
        array4[GeomUtilTileTest.lllIIllllIlIll[8]] = GeomUtilTileTest.lllIIllllIlIll[2];
        array4[GeomUtilTileTest.lllIIllllIlIll[9]] = GeomUtilTileTest.lllIIllllIlIll[7];
        array4[GeomUtilTileTest.lllIIllllIlIll[10]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array[n3] = array4;
        final int n4 = GeomUtilTileTest.lllIIllllIlIll[4];
        final int[] array5 = new int[GeomUtilTileTest.lllIIllllIlIll[1]];
        array5[GeomUtilTileTest.lllIIllllIlIll[0]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array5[GeomUtilTileTest.lllIIllllIlIll[2]] = GeomUtilTileTest.lllIIllllIlIll[2];
        array5[GeomUtilTileTest.lllIIllllIlIll[3]] = GeomUtilTileTest.lllIIllllIlIll[3];
        array5[GeomUtilTileTest.lllIIllllIlIll[4]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array5[GeomUtilTileTest.lllIIllllIlIll[5]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array5[GeomUtilTileTest.lllIIllllIlIll[6]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array5[GeomUtilTileTest.lllIIllllIlIll[7]] = GeomUtilTileTest.lllIIllllIlIll[5];
        array5[GeomUtilTileTest.lllIIllllIlIll[8]] = GeomUtilTileTest.lllIIllllIlIll[2];
        array5[GeomUtilTileTest.lllIIllllIlIll[9]] = GeomUtilTileTest.lllIIllllIlIll[2];
        array5[GeomUtilTileTest.lllIIllllIlIll[10]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array[n4] = array5;
        final int n5 = GeomUtilTileTest.lllIIllllIlIll[5];
        final int[] array6 = new int[GeomUtilTileTest.lllIIllllIlIll[1]];
        array6[GeomUtilTileTest.lllIIllllIlIll[0]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array6[GeomUtilTileTest.lllIIllllIlIll[2]] = GeomUtilTileTest.lllIIllllIlIll[2];
        array6[GeomUtilTileTest.lllIIllllIlIll[3]] = GeomUtilTileTest.lllIIllllIlIll[2];
        array6[GeomUtilTileTest.lllIIllllIlIll[4]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array6[GeomUtilTileTest.lllIIllllIlIll[5]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array6[GeomUtilTileTest.lllIIllllIlIll[6]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array6[GeomUtilTileTest.lllIIllllIlIll[7]] = GeomUtilTileTest.lllIIllllIlIll[2];
        array6[GeomUtilTileTest.lllIIllllIlIll[8]] = GeomUtilTileTest.lllIIllllIlIll[2];
        array6[GeomUtilTileTest.lllIIllllIlIll[9]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array6[GeomUtilTileTest.lllIIllllIlIll[10]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array[n5] = array6;
        final int n6 = GeomUtilTileTest.lllIIllllIlIll[6];
        final int[] array7 = new int[GeomUtilTileTest.lllIIllllIlIll[1]];
        array7[GeomUtilTileTest.lllIIllllIlIll[0]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array7[GeomUtilTileTest.lllIIllllIlIll[2]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array7[GeomUtilTileTest.lllIIllllIlIll[3]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array7[GeomUtilTileTest.lllIIllllIlIll[4]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array7[GeomUtilTileTest.lllIIllllIlIll[5]] = GeomUtilTileTest.lllIIllllIlIll[4];
        array7[GeomUtilTileTest.lllIIllllIlIll[6]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array7[GeomUtilTileTest.lllIIllllIlIll[7]] = GeomUtilTileTest.lllIIllllIlIll[2];
        array7[GeomUtilTileTest.lllIIllllIlIll[8]] = GeomUtilTileTest.lllIIllllIlIll[2];
        array7[GeomUtilTileTest.lllIIllllIlIll[9]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array7[GeomUtilTileTest.lllIIllllIlIll[10]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array[n6] = array7;
        final int n7 = GeomUtilTileTest.lllIIllllIlIll[7];
        final int[] array8 = new int[GeomUtilTileTest.lllIIllllIlIll[1]];
        array8[GeomUtilTileTest.lllIIllllIlIll[0]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array8[GeomUtilTileTest.lllIIllllIlIll[2]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array8[GeomUtilTileTest.lllIIllllIlIll[3]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array8[GeomUtilTileTest.lllIIllllIlIll[4]] = GeomUtilTileTest.lllIIllllIlIll[2];
        array8[GeomUtilTileTest.lllIIllllIlIll[5]] = GeomUtilTileTest.lllIIllllIlIll[2];
        array8[GeomUtilTileTest.lllIIllllIlIll[6]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array8[GeomUtilTileTest.lllIIllllIlIll[7]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array8[GeomUtilTileTest.lllIIllllIlIll[8]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array8[GeomUtilTileTest.lllIIllllIlIll[9]] = GeomUtilTileTest.lllIIllllIlIll[2];
        array8[GeomUtilTileTest.lllIIllllIlIll[10]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array[n7] = array8;
        final int n8 = GeomUtilTileTest.lllIIllllIlIll[8];
        final int[] array9 = new int[GeomUtilTileTest.lllIIllllIlIll[1]];
        array9[GeomUtilTileTest.lllIIllllIlIll[0]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array9[GeomUtilTileTest.lllIIllllIlIll[2]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array9[GeomUtilTileTest.lllIIllllIlIll[3]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array9[GeomUtilTileTest.lllIIllllIlIll[4]] = GeomUtilTileTest.lllIIllllIlIll[2];
        array9[GeomUtilTileTest.lllIIllllIlIll[5]] = GeomUtilTileTest.lllIIllllIlIll[2];
        array9[GeomUtilTileTest.lllIIllllIlIll[6]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array9[GeomUtilTileTest.lllIIllllIlIll[7]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array9[GeomUtilTileTest.lllIIllllIlIll[8]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array9[GeomUtilTileTest.lllIIllllIlIll[9]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array9[GeomUtilTileTest.lllIIllllIlIll[10]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array[n8] = array9;
        final int n9 = GeomUtilTileTest.lllIIllllIlIll[9];
        final int[] array10 = new int[GeomUtilTileTest.lllIIllllIlIll[1]];
        array10[GeomUtilTileTest.lllIIllllIlIll[0]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array10[GeomUtilTileTest.lllIIllllIlIll[2]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array10[GeomUtilTileTest.lllIIllllIlIll[3]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array10[GeomUtilTileTest.lllIIllllIlIll[4]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array10[GeomUtilTileTest.lllIIllllIlIll[5]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array10[GeomUtilTileTest.lllIIllllIlIll[6]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array10[GeomUtilTileTest.lllIIllllIlIll[7]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array10[GeomUtilTileTest.lllIIllllIlIll[8]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array10[GeomUtilTileTest.lllIIllllIlIll[9]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array10[GeomUtilTileTest.lllIIllllIlIll[10]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array[n9] = array10;
        final int n10 = GeomUtilTileTest.lllIIllllIlIll[10];
        final int[] array11 = new int[GeomUtilTileTest.lllIIllllIlIll[1]];
        array11[GeomUtilTileTest.lllIIllllIlIll[0]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array11[GeomUtilTileTest.lllIIllllIlIll[2]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array11[GeomUtilTileTest.lllIIllllIlIll[3]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array11[GeomUtilTileTest.lllIIllllIlIll[4]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array11[GeomUtilTileTest.lllIIllllIlIll[5]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array11[GeomUtilTileTest.lllIIllllIlIll[6]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array11[GeomUtilTileTest.lllIIllllIlIll[7]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array11[GeomUtilTileTest.lllIIllllIlIll[8]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array11[GeomUtilTileTest.lllIIllllIlIll[9]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array11[GeomUtilTileTest.lllIIllllIlIll[10]] = GeomUtilTileTest.lllIIllllIlIll[0];
        array[n10] = array11;
        final int[][] llllllllllllIlIlllIlIlllIIllIIII = array;
        int llllllllllllIlIlllIlIlllIIllIIll = GeomUtilTileTest.lllIIllllIlIll[0];
        while (lIlIIIIIllllIlll(llllllllllllIlIlllIlIlllIIllIIll, llllllllllllIlIlllIlIlllIIllIIII[GeomUtilTileTest.lllIIllllIlIll[0]].length)) {
            int llllllllllllIlIlllIlIlllIIllIlII = GeomUtilTileTest.lllIIllllIlIll[0];
            while (lIlIIIIIllllIlll(llllllllllllIlIlllIlIlllIIllIlII, llllllllllllIlIlllIlIlllIIllIIII.length)) {
                if (lIlIIIIIlllllIII(llllllllllllIlIlllIlIlllIIllIIII[llllllllllllIlIlllIlIlllIIllIlII][llllllllllllIlIlllIlIlllIIllIIll])) {
                    switch (llllllllllllIlIlllIlIlllIIllIIII[llllllllllllIlIlllIlIlllIIllIlII][llllllllllllIlIlllIlIlllIIllIIll]) {
                        case 1: {
                            final Polygon llllllllllllIlIlllIlIlllIIlllIIl = new Polygon();
                            llllllllllllIlIlllIlIlllIIlllIIl.addPoint((float)(llllllllllllIlIlllIlIlllIIllIIll * GeomUtilTileTest.lllIIllllIlIll[11]), (float)(llllllllllllIlIlllIlIlllIIllIlII * GeomUtilTileTest.lllIIllllIlIll[11]));
                            llllllllllllIlIlllIlIlllIIlllIIl.addPoint((float)(llllllllllllIlIlllIlIlllIIllIIll * GeomUtilTileTest.lllIIllllIlIll[11] + GeomUtilTileTest.lllIIllllIlIll[11]), (float)(llllllllllllIlIlllIlIlllIIllIlII * GeomUtilTileTest.lllIIllllIlIll[11]));
                            llllllllllllIlIlllIlIlllIIlllIIl.addPoint((float)(llllllllllllIlIlllIlIlllIIllIIll * GeomUtilTileTest.lllIIllllIlIll[11] + GeomUtilTileTest.lllIIllllIlIll[11]), (float)(llllllllllllIlIlllIlIlllIIllIlII * GeomUtilTileTest.lllIIllllIlIll[11] + GeomUtilTileTest.lllIIllllIlIll[11]));
                            llllllllllllIlIlllIlIlllIIlllIIl.addPoint((float)(llllllllllllIlIlllIlIlllIIllIIll * GeomUtilTileTest.lllIIllllIlIll[11]), (float)(llllllllllllIlIlllIlIlllIIllIlII * GeomUtilTileTest.lllIIllllIlIll[11] + GeomUtilTileTest.lllIIllllIlIll[11]));
                            this.original.add(llllllllllllIlIlllIlIlllIIlllIIl);
                            "".length();
                            "".length();
                            if ((0x68 ^ 0x16 ^ (0xBF ^ 0xC5)) != (14 + 48 + 67 + 54 ^ 32 + 119 - 105 + 133)) {
                                return;
                            }
                            break;
                        }
                        case 2: {
                            final Polygon llllllllllllIlIlllIlIlllIIlllIII = new Polygon();
                            llllllllllllIlIlllIlIlllIIlllIII.addPoint((float)(llllllllllllIlIlllIlIlllIIllIIll * GeomUtilTileTest.lllIIllllIlIll[11]), (float)(llllllllllllIlIlllIlIlllIIllIlII * GeomUtilTileTest.lllIIllllIlIll[11]));
                            llllllllllllIlIlllIlIlllIIlllIII.addPoint((float)(llllllllllllIlIlllIlIlllIIllIIll * GeomUtilTileTest.lllIIllllIlIll[11] + GeomUtilTileTest.lllIIllllIlIll[11]), (float)(llllllllllllIlIlllIlIlllIIllIlII * GeomUtilTileTest.lllIIllllIlIll[11]));
                            llllllllllllIlIlllIlIlllIIlllIII.addPoint((float)(llllllllllllIlIlllIlIlllIIllIIll * GeomUtilTileTest.lllIIllllIlIll[11]), (float)(llllllllllllIlIlllIlIlllIIllIlII * GeomUtilTileTest.lllIIllllIlIll[11] + GeomUtilTileTest.lllIIllllIlIll[11]));
                            this.original.add(llllllllllllIlIlllIlIlllIIlllIII);
                            "".length();
                            "".length();
                            if (((44 + 85 - 31 + 105 ^ 107 + 28 - 86 + 86) & (0xB5 ^ 0x95 ^ (0xC3 ^ 0xAF) ^ -" ".length())) >= "   ".length()) {
                                return;
                            }
                            break;
                        }
                        case 3: {
                            final Circle llllllllllllIlIlllIlIlllIIllIlll = new Circle((float)(llllllllllllIlIlllIlIlllIIllIIll * GeomUtilTileTest.lllIIllllIlIll[11] + GeomUtilTileTest.lllIIllllIlIll[12]), (float)(llllllllllllIlIlllIlIlllIIllIlII * GeomUtilTileTest.lllIIllllIlIll[11] + GeomUtilTileTest.lllIIllllIlIll[11]), 16.0f, GeomUtilTileTest.lllIIllllIlIll[12]);
                            this.original.add(llllllllllllIlIlllIlIlllIIllIlll);
                            "".length();
                            "".length();
                            if (-"   ".length() >= 0) {
                                return;
                            }
                            break;
                        }
                        case 4: {
                            final Polygon llllllllllllIlIlllIlIlllIIllIllI = new Polygon();
                            llllllllllllIlIlllIlIlllIIllIllI.addPoint((float)(llllllllllllIlIlllIlIlllIIllIIll * GeomUtilTileTest.lllIIllllIlIll[11] + GeomUtilTileTest.lllIIllllIlIll[11]), (float)(llllllllllllIlIlllIlIlllIIllIlII * GeomUtilTileTest.lllIIllllIlIll[11]));
                            llllllllllllIlIlllIlIlllIIllIllI.addPoint((float)(llllllllllllIlIlllIlIlllIIllIIll * GeomUtilTileTest.lllIIllllIlIll[11] + GeomUtilTileTest.lllIIllllIlIll[11]), (float)(llllllllllllIlIlllIlIlllIIllIlII * GeomUtilTileTest.lllIIllllIlIll[11] + GeomUtilTileTest.lllIIllllIlIll[11]));
                            llllllllllllIlIlllIlIlllIIllIllI.addPoint((float)(llllllllllllIlIlllIlIlllIIllIIll * GeomUtilTileTest.lllIIllllIlIll[11]), (float)(llllllllllllIlIlllIlIlllIIllIlII * GeomUtilTileTest.lllIIllllIlIll[11] + GeomUtilTileTest.lllIIllllIlIll[11]));
                            this.original.add(llllllllllllIlIlllIlIlllIIllIllI);
                            "".length();
                            "".length();
                            if (-(0xA6 ^ 0xB8 ^ (0xA4 ^ 0xBE)) > 0) {
                                return;
                            }
                            break;
                        }
                        case 5: {
                            final Polygon llllllllllllIlIlllIlIlllIIllIlIl = new Polygon();
                            llllllllllllIlIlllIlIlllIIllIlIl.addPoint((float)(llllllllllllIlIlllIlIlllIIllIIll * GeomUtilTileTest.lllIIllllIlIll[11]), (float)(llllllllllllIlIlllIlIlllIIllIlII * GeomUtilTileTest.lllIIllllIlIll[11]));
                            llllllllllllIlIlllIlIlllIIllIlIl.addPoint((float)(llllllllllllIlIlllIlIlllIIllIIll * GeomUtilTileTest.lllIIllllIlIll[11] + GeomUtilTileTest.lllIIllllIlIll[11]), (float)(llllllllllllIlIlllIlIlllIIllIlII * GeomUtilTileTest.lllIIllllIlIll[11]));
                            llllllllllllIlIlllIlIlllIIllIlIl.addPoint((float)(llllllllllllIlIlllIlIlllIIllIIll * GeomUtilTileTest.lllIIllllIlIll[11] + GeomUtilTileTest.lllIIllllIlIll[11]), (float)(llllllllllllIlIlllIlIlllIIllIlII * GeomUtilTileTest.lllIIllllIlIll[11] + GeomUtilTileTest.lllIIllllIlIll[11]));
                            this.original.add(llllllllllllIlIlllIlIlllIIllIlIl);
                            "".length();
                            "".length();
                            if (((0x9E ^ 0xAC) & ~(0x50 ^ 0x62)) != 0x0) {
                                return;
                            }
                            break;
                        }
                        case 6: {
                            final Polygon llllllllllllIlIlllIlIlllIIlllIlI = new Polygon();
                            llllllllllllIlIlllIlIlllIIlllIlI.addPoint((float)(llllllllllllIlIlllIlIlllIIllIIll * GeomUtilTileTest.lllIIllllIlIll[11]), (float)(llllllllllllIlIlllIlIlllIIllIlII * GeomUtilTileTest.lllIIllllIlIll[11]));
                            llllllllllllIlIlllIlIlllIIlllIlI.addPoint((float)(llllllllllllIlIlllIlIlllIIllIIll * GeomUtilTileTest.lllIIllllIlIll[11] + GeomUtilTileTest.lllIIllllIlIll[11]), (float)(llllllllllllIlIlllIlIlllIIllIlII * GeomUtilTileTest.lllIIllllIlIll[11]));
                            llllllllllllIlIlllIlIlllIIlllIlI.addPoint((float)(llllllllllllIlIlllIlIlllIIllIIll * GeomUtilTileTest.lllIIllllIlIll[11]), (float)(llllllllllllIlIlllIlIlllIIllIlII * GeomUtilTileTest.lllIIllllIlIll[11] + GeomUtilTileTest.lllIIllllIlIll[11]));
                            this.original.add(llllllllllllIlIlllIlIlllIIlllIlI);
                            "".length();
                            break;
                        }
                    }
                }
                ++llllllllllllIlIlllIlIlllIIllIlII;
                "".length();
                if (-" ".length() > 0) {
                    return;
                }
            }
            ++llllllllllllIlIlllIlIlllIIllIIll;
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        final long llllllllllllIlIlllIlIlllIIlIllll = System.currentTimeMillis();
        this.generateSpace(this.original, 0.0f, 0.0f, (float)((llllllllllllIlIlllIlIlllIIllIIIl + GeomUtilTileTest.lllIIllllIlIll[2]) * GeomUtilTileTest.lllIIllllIlIll[11]), (float)((llllllllllllIlIlllIlIlllIIllIIIl + GeomUtilTileTest.lllIIllllIlIll[2]) * GeomUtilTileTest.lllIIllllIlIll[11]), GeomUtilTileTest.lllIIllllIlIll[9]);
        this.combined = this.combineQuadSpace();
        final long llllllllllllIlIlllIlIlllIIlIlllI = System.currentTimeMillis();
        System.out.println(String.valueOf(new StringBuilder().append(GeomUtilTileTest.lllIIllllIIlll[GeomUtilTileTest.lllIIllllIlIll[2]]).append(llllllllllllIlIlllIlIlllIIlIlllI - llllllllllllIlIlllIlIlllIIlIllll)));
        System.out.println(String.valueOf(new StringBuilder().append(GeomUtilTileTest.lllIIllllIIlll[GeomUtilTileTest.lllIIllllIlIll[3]]).append(this.combined.size())));
    }
    
    private static boolean lIlIIIIIlllllIlI(final int llllllllllllIlIlllIlIllIIllIIlII, final int llllllllllllIlIlllIlIllIIllIIIll) {
        return llllllllllllIlIlllIlIllIIllIIlII == llllllllllllIlIlllIlIllIIllIIIll;
    }
    
    private void removeFromQuadSpace(final Shape llllllllllllIlIlllIlIlllIlIllIll) {
        final int llllllllllllIlIlllIlIlllIlIllIlI = this.quadSpace.length;
        int llllllllllllIlIlllIlIlllIlIlllIl = GeomUtilTileTest.lllIIllllIlIll[0];
        while (lIlIIIIIllllIlll(llllllllllllIlIlllIlIlllIlIlllIl, llllllllllllIlIlllIlIlllIlIllIlI)) {
            int llllllllllllIlIlllIlIlllIlIllllI = GeomUtilTileTest.lllIIllllIlIll[0];
            while (lIlIIIIIllllIlll(llllllllllllIlIlllIlIlllIlIllllI, llllllllllllIlIlllIlIlllIlIllIlI)) {
                this.quadSpace[llllllllllllIlIlllIlIlllIlIlllIl][llllllllllllIlIlllIlIlllIlIllllI].remove(llllllllllllIlIlllIlIlllIlIllIll);
                "".length();
                ++llllllllllllIlIlllIlIlllIlIllllI;
                "".length();
                if (((0x97 ^ 0xBC ^ (0xBD ^ 0xAB)) & (0x73 ^ 0x24 ^ (0x31 ^ 0x5B) ^ -" ".length())) > 0) {
                    return;
                }
            }
            ++llllllllllllIlIlllIlIlllIlIlllIl;
            "".length();
            if ((((0x3C ^ 0x1A) & ~(0x6B ^ 0x4D)) ^ (0xBD ^ 0xB9)) == -" ".length()) {
                return;
            }
        }
    }
    
    private ArrayList combineQuadSpace() {
        boolean llllllllllllIlIlllIlIlllIIIlIIll = GeomUtilTileTest.lllIIllllIlIll[2] != 0;
        while (lIlIIIIIlllllIII(llllllllllllIlIlllIlIlllIIIlIIll ? 1 : 0)) {
            llllllllllllIlIlllIlIlllIIIlIIll = (GeomUtilTileTest.lllIIllllIlIll[0] != 0);
            int llllllllllllIlIlllIlIlllIIIlIlll = GeomUtilTileTest.lllIIllllIlIll[0];
            while (lIlIIIIIllllIlll(llllllllllllIlIlllIlIlllIIIlIlll, this.quadSpace.length)) {
                int llllllllllllIlIlllIlIlllIIIllIII = GeomUtilTileTest.lllIIllllIlIll[0];
                while (lIlIIIIIllllIlll(llllllllllllIlIlllIlIlllIIIllIII, this.quadSpace.length)) {
                    final ArrayList llllllllllllIlIlllIlIlllIIIllIll = this.quadSpace[llllllllllllIlIlllIlIlllIIIlIlll][llllllllllllIlIlllIlIlllIIIllIII];
                    final int llllllllllllIlIlllIlIlllIIIllIlI = llllllllllllIlIlllIlIlllIIIllIll.size();
                    this.combine(llllllllllllIlIlllIlIlllIIIllIll);
                    "".length();
                    final int llllllllllllIlIlllIlIlllIIIllIIl = llllllllllllIlIlllIlIlllIIIllIll.size();
                    final int n = llllllllllllIlIlllIlIlllIIIlIIll ? 1 : 0;
                    int n2;
                    if (lIlIIIIIlllllIIl(llllllllllllIlIlllIlIlllIIIllIlI, llllllllllllIlIlllIlIlllIIIllIIl)) {
                        n2 = GeomUtilTileTest.lllIIllllIlIll[2];
                        "".length();
                        if (null != null) {
                            return null;
                        }
                    }
                    else {
                        n2 = GeomUtilTileTest.lllIIllllIlIll[0];
                    }
                    llllllllllllIlIlllIlIlllIIIlIIll = ((n | n2) != 0x0);
                    ++llllllllllllIlIlllIlIlllIIIllIII;
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return null;
                    }
                }
                ++llllllllllllIlIlllIlIlllIIIlIlll;
                "".length();
                if ("  ".length() <= ((0x94 ^ 0xB2 ^ (0x6F ^ 0x7E)) & (0xE ^ 0x48 ^ (0x45 ^ 0x34) ^ -" ".length()))) {
                    return null;
                }
            }
            "".length();
            if ((0x40 ^ 0x52 ^ (0x41 ^ 0x57)) == 0x0) {
                return null;
            }
        }
        final HashSet llllllllllllIlIlllIlIlllIIIlIIlI = new HashSet();
        int llllllllllllIlIlllIlIlllIIIlIlIl = GeomUtilTileTest.lllIIllllIlIll[0];
        while (lIlIIIIIllllIlll(llllllllllllIlIlllIlIlllIIIlIlIl, this.quadSpace.length)) {
            int llllllllllllIlIlllIlIlllIIIlIllI = GeomUtilTileTest.lllIIllllIlIll[0];
            while (lIlIIIIIllllIlll(llllllllllllIlIlllIlIlllIIIlIllI, this.quadSpace.length)) {
                llllllllllllIlIlllIlIlllIIIlIIlI.addAll(this.quadSpace[llllllllllllIlIlllIlIlllIIIlIlIl][llllllllllllIlIlllIlIlllIIIlIllI]);
                "".length();
                ++llllllllllllIlIlllIlIlllIIIlIllI;
                "".length();
                if ("  ".length() <= " ".length()) {
                    return null;
                }
            }
            ++llllllllllllIlIlllIlIlllIIIlIlIl;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return new ArrayList(llllllllllllIlIlllIlIlllIIIlIIlI);
    }
    
    public static void main(final String[] llllllllllllIlIlllIlIllIlIlIllll) {
        try {
            final AppGameContainer llllllllllllIlIlllIlIllIlIllIIIl = new AppGameContainer(new GeomUtilTileTest());
            llllllllllllIlIlllIlIllIlIllIIIl.setDisplayMode(GeomUtilTileTest.lllIIllllIlIll[13], GeomUtilTileTest.lllIIllllIlIll[14], (boolean)(GeomUtilTileTest.lllIIllllIlIll[0] != 0));
            llllllllllllIlIlllIlIllIlIllIIIl.start();
            "".length();
            if (-" ".length() >= "  ".length()) {
                return;
            }
        }
        catch (SlickException llllllllllllIlIlllIlIllIlIllIIII) {
            llllllllllllIlIlllIlIllIlIllIIII.printStackTrace();
        }
    }
    
    private ArrayList combine(final ArrayList llllllllllllIlIlllIlIllIlllllIll) {
        ArrayList llllllllllllIlIlllIlIlllIIIIIIII = llllllllllllIlIlllIlIllIlllllIll;
        ArrayList llllllllllllIlIlllIlIllIllllllll = llllllllllllIlIlllIlIllIlllllIll;
        boolean llllllllllllIlIlllIlIllIlllllllI = GeomUtilTileTest.lllIIllllIlIll[2] != 0;
        while (!lIlIIIIIlllllIlI(llllllllllllIlIlllIlIllIllllllll.size(), llllllllllllIlIlllIlIlllIIIIIIII.size()) || lIlIIIIIlllllIII(llllllllllllIlIlllIlIllIlllllllI ? 1 : 0)) {
            llllllllllllIlIlllIlIllIlllllllI = (GeomUtilTileTest.lllIIllllIlIll[0] != 0);
            llllllllllllIlIlllIlIlllIIIIIIII = llllllllllllIlIlllIlIllIllllllll;
            llllllllllllIlIlllIlIllIllllllll = this.combineImpl(llllllllllllIlIlllIlIllIllllllll);
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        final ArrayList llllllllllllIlIlllIlIllIllllllIl = new ArrayList();
        int llllllllllllIlIlllIlIlllIIIIIIll = GeomUtilTileTest.lllIIllllIlIll[0];
        while (lIlIIIIIllllIlll(llllllllllllIlIlllIlIlllIIIIIIll, llllllllllllIlIlllIlIllIllllllll.size())) {
            llllllllllllIlIlllIlIllIllllllIl.add(llllllllllllIlIlllIlIllIllllllll.get(llllllllllllIlIlllIlIlllIIIIIIll).prune());
            "".length();
            ++llllllllllllIlIlllIlIlllIIIIIIll;
            "".length();
            if (((0x7E ^ 0x25 ^ (0xF ^ 0x6A)) & (49 + 27 - 40 + 97 ^ 134 + 69 - 168 + 152 ^ -" ".length())) != ((0x4B ^ 0xF ^ (0x33 ^ 0x5B)) & (0x62 ^ 0x6E ^ (0x28 ^ 0x8) ^ -" ".length()))) {
                return null;
            }
        }
        return llllllllllllIlIlllIlIllIllllllIl;
    }
    
    private static boolean lIlIIIIIlllllIll(final Object llllllllllllIlIlllIlIllIIlIllIlI) {
        return llllllllllllIlIlllIlIllIIlIllIlI != null;
    }
    
    public boolean collides(final Shape llllllllllllIlIlllIlIllIllIlIIlI, final Shape llllllllllllIlIlllIlIllIllIlIIIl) {
        if (lIlIIIIIlllllIII(llllllllllllIlIlllIlIllIllIlIIlI.intersects(llllllllllllIlIlllIlIllIllIlIIIl) ? 1 : 0)) {
            return GeomUtilTileTest.lllIIllllIlIll[2] != 0;
        }
        int llllllllllllIlIlllIlIllIllIllIII = GeomUtilTileTest.lllIIllllIlIll[0];
        while (lIlIIIIIllllIlll(llllllllllllIlIlllIlIllIllIllIII, llllllllllllIlIlllIlIllIllIlIIlI.getPointCount())) {
            final float[] llllllllllllIlIlllIlIllIllIllIIl = llllllllllllIlIlllIlIllIllIlIIlI.getPoint(llllllllllllIlIlllIlIllIllIllIII);
            if (lIlIIIIIlllllIII(llllllllllllIlIlllIlIllIllIlIIIl.contains(llllllllllllIlIlllIlIllIllIllIIl[GeomUtilTileTest.lllIIllllIlIll[0]], llllllllllllIlIlllIlIllIllIllIIl[GeomUtilTileTest.lllIIllllIlIll[2]]) ? 1 : 0)) {
                return GeomUtilTileTest.lllIIllllIlIll[2] != 0;
            }
            ++llllllllllllIlIlllIlIllIllIllIII;
            "".length();
            if (((0x3 ^ 0x52) & ~(0x4D ^ 0x1C)) > 0) {
                return ((0x14 ^ 0x3C) & ~(0x83 ^ 0xAB)) != 0x0;
            }
        }
        int llllllllllllIlIlllIlIllIllIlIllI = GeomUtilTileTest.lllIIllllIlIll[0];
        while (lIlIIIIIllllIlll(llllllllllllIlIlllIlIllIllIlIllI, llllllllllllIlIlllIlIllIllIlIIIl.getPointCount())) {
            final float[] llllllllllllIlIlllIlIllIllIlIlll = llllllllllllIlIlllIlIllIllIlIIIl.getPoint(llllllllllllIlIlllIlIllIllIlIllI);
            if (lIlIIIIIlllllIII(llllllllllllIlIlllIlIllIllIlIIlI.contains(llllllllllllIlIlllIlIllIllIlIlll[GeomUtilTileTest.lllIIllllIlIll[0]], llllllllllllIlIlllIlIllIllIlIlll[GeomUtilTileTest.lllIIllllIlIll[2]]) ? 1 : 0)) {
                return GeomUtilTileTest.lllIIllllIlIll[2] != 0;
            }
            ++llllllllllllIlIlllIlIllIllIlIllI;
            "".length();
            if (null != null) {
                return ((0x1C ^ 0x74 ^ (0xE1 ^ 0xC2)) & (201 + 234 - 296 + 99 ^ 83 + 74 - 0 + 8 ^ -" ".length())) != 0x0;
            }
        }
        return GeomUtilTileTest.lllIIllllIlIll[0] != 0;
    }
    
    private static void lIlIIIIIllllIIlI() {
        (lllIIllllIIlll = new String[GeomUtilTileTest.lllIIllllIlIll[4]])[GeomUtilTileTest.lllIIllllIlIll[0]] = lIlIIIIIlllIllII("YqnueuGn9BtZtI3nZIuK5ByZIRt3N1eC", "qaTAp");
        GeomUtilTileTest.lllIIllllIIlll[GeomUtilTileTest.lllIIllllIlIll[2]] = lIlIIIIIlllIllIl("ICk0JBwNI3kyGgwtY2Y=", "cFYFu");
        GeomUtilTileTest.lllIIllllIIlll[GeomUtilTileTest.lllIIllllIlIll[3]] = lIlIIIIIlllIlllI("WbYius9wjJpoXvkoyKB/1brrnp7cZMts", "Ppvay");
    }
    
    public void render(final GameContainer llllllllllllIlIlllIlIllIlIlllIlI, final Graphics llllllllllllIlIlllIlIllIlIllIlll) throws SlickException {
        llllllllllllIlIlllIlIllIlIllIlll.setColor(Color.green);
        int llllllllllllIlIlllIlIllIllIIIIII = GeomUtilTileTest.lllIIllllIlIll[0];
        while (lIlIIIIIllllIlll(llllllllllllIlIlllIlIllIllIIIIII, this.original.size())) {
            final Shape llllllllllllIlIlllIlIllIllIIIIIl = this.original.get(llllllllllllIlIlllIlIllIllIIIIII);
            llllllllllllIlIlllIlIllIlIllIlll.draw(llllllllllllIlIlllIlIllIllIIIIIl);
            ++llllllllllllIlIlllIlIllIllIIIIII;
            "".length();
            if (null != null) {
                return;
            }
        }
        llllllllllllIlIlllIlIllIlIllIlll.setColor(Color.white);
        if (lIlIIIIIlllllIll(this.quadSpaceShapes)) {
            llllllllllllIlIlllIlIllIlIllIlll.draw(this.quadSpaceShapes[GeomUtilTileTest.lllIIllllIlIll[0]][GeomUtilTileTest.lllIIllllIlIll[0]]);
        }
        llllllllllllIlIlllIlIllIlIllIlll.translate(0.0f, 320.0f);
        int llllllllllllIlIlllIlIllIlIllllII = GeomUtilTileTest.lllIIllllIlIll[0];
        while (lIlIIIIIllllIlll(llllllllllllIlIlllIlIllIlIllllII, this.combined.size())) {
            llllllllllllIlIlllIlIllIlIllIlll.setColor(Color.white);
            final Shape llllllllllllIlIlllIlIllIlIllllIl = this.combined.get(llllllllllllIlIlllIlIllIlIllllII);
            llllllllllllIlIlllIlIllIlIllIlll.draw(llllllllllllIlIlllIlIllIlIllllIl);
            int llllllllllllIlIlllIlIllIlIlllllI = GeomUtilTileTest.lllIIllllIlIll[0];
            while (lIlIIIIIllllIlll(llllllllllllIlIlllIlIllIlIlllllI, llllllllllllIlIlllIlIllIlIllllIl.getPointCount())) {
                llllllllllllIlIlllIlIllIlIllIlll.setColor(Color.yellow);
                final float[] llllllllllllIlIlllIlIllIlIllllll = llllllllllllIlIlllIlIllIlIllllIl.getPoint(llllllllllllIlIlllIlIllIlIlllllI);
                llllllllllllIlIlllIlIllIlIllIlll.fillOval(llllllllllllIlIlllIlIllIlIllllll[GeomUtilTileTest.lllIIllllIlIll[0]] - 1.0f, llllllllllllIlIlllIlIllIlIllllll[GeomUtilTileTest.lllIIllllIlIll[2]] - 1.0f, 3.0f, 3.0f);
                ++llllllllllllIlIlllIlIllIlIlllllI;
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
            }
            ++llllllllllllIlIlllIlIllIlIllllII;
            "".length();
            if (null != null) {
                return;
            }
        }
    }
    
    private void generateSpace(final ArrayList llllllllllllIlIlllIlIlllIlllIIII, final float llllllllllllIlIlllIlIlllIllllIII, final float llllllllllllIlIlllIlIlllIlllIlll, final float llllllllllllIlIlllIlIlllIlllIllI, final float llllllllllllIlIlllIlIlllIlllIlIl, final int llllllllllllIlIlllIlIlllIlllIlII) {
        this.quadSpace = new ArrayList[llllllllllllIlIlllIlIlllIlllIlII][llllllllllllIlIlllIlIlllIlllIlII];
        this.quadSpaceShapes = new Shape[llllllllllllIlIlllIlIlllIlllIlII][llllllllllllIlIlllIlIlllIlllIlII];
        final float llllllllllllIlIlllIlIlllIlllIIll = (llllllllllllIlIlllIlIlllIlllIllI - llllllllllllIlIlllIlIlllIllllIII) / llllllllllllIlIlllIlIlllIlllIlII;
        final float llllllllllllIlIlllIlIlllIlllIIlI = (llllllllllllIlIlllIlIlllIlllIlIl - llllllllllllIlIlllIlIlllIlllIlll) / llllllllllllIlIlllIlIlllIlllIlII;
        int llllllllllllIlIlllIlIlllIllllIll = GeomUtilTileTest.lllIIllllIlIll[0];
        while (lIlIIIIIllllIlll(llllllllllllIlIlllIlIlllIllllIll, llllllllllllIlIlllIlIlllIlllIlII)) {
            int llllllllllllIlIlllIlIlllIlllllII = GeomUtilTileTest.lllIIllllIlIll[0];
            while (lIlIIIIIllllIlll(llllllllllllIlIlllIlIlllIlllllII, llllllllllllIlIlllIlIlllIlllIlII)) {
                this.quadSpace[llllllllllllIlIlllIlIlllIllllIll][llllllllllllIlIlllIlIlllIlllllII] = new ArrayList();
                final Polygon llllllllllllIlIlllIlIlllIlllllIl = new Polygon();
                llllllllllllIlIlllIlIlllIlllllIl.addPoint(llllllllllllIlIlllIlIlllIllllIII + llllllllllllIlIlllIlIlllIlllIIll * llllllllllllIlIlllIlIlllIllllIll, llllllllllllIlIlllIlIlllIlllIlll + llllllllllllIlIlllIlIlllIlllIIlI * llllllllllllIlIlllIlIlllIlllllII);
                llllllllllllIlIlllIlIlllIlllllIl.addPoint(llllllllllllIlIlllIlIlllIllllIII + llllllllllllIlIlllIlIlllIlllIIll * llllllllllllIlIlllIlIlllIllllIll + llllllllllllIlIlllIlIlllIlllIIll, llllllllllllIlIlllIlIlllIlllIlll + llllllllllllIlIlllIlIlllIlllIIlI * llllllllllllIlIlllIlIlllIlllllII);
                llllllllllllIlIlllIlIlllIlllllIl.addPoint(llllllllllllIlIlllIlIlllIllllIII + llllllllllllIlIlllIlIlllIlllIIll * llllllllllllIlIlllIlIlllIllllIll + llllllllllllIlIlllIlIlllIlllIIll, llllllllllllIlIlllIlIlllIlllIlll + llllllllllllIlIlllIlIlllIlllIIlI * llllllllllllIlIlllIlIlllIlllllII + llllllllllllIlIlllIlIlllIlllIIlI);
                llllllllllllIlIlllIlIlllIlllllIl.addPoint(llllllllllllIlIlllIlIlllIllllIII + llllllllllllIlIlllIlIlllIlllIIll * llllllllllllIlIlllIlIlllIllllIll, llllllllllllIlIlllIlIlllIlllIlll + llllllllllllIlIlllIlIlllIlllIIlI * llllllllllllIlIlllIlIlllIlllllII + llllllllllllIlIlllIlIlllIlllIIlI);
                int llllllllllllIlIlllIlIlllIllllllI = GeomUtilTileTest.lllIIllllIlIll[0];
                while (lIlIIIIIllllIlll(llllllllllllIlIlllIlIlllIllllllI, llllllllllllIlIlllIlIlllIlllIIII.size())) {
                    final Shape llllllllllllIlIlllIlIlllIlllllll = llllllllllllIlIlllIlIlllIlllIIII.get(llllllllllllIlIlllIlIlllIllllllI);
                    if (lIlIIIIIlllllIII(this.collides(llllllllllllIlIlllIlIlllIlllllll, llllllllllllIlIlllIlIlllIlllllIl) ? 1 : 0)) {
                        this.quadSpace[llllllllllllIlIlllIlIlllIllllIll][llllllllllllIlIlllIlIlllIlllllII].add(llllllllllllIlIlllIlIlllIlllllll);
                        "".length();
                    }
                    ++llllllllllllIlIlllIlIlllIllllllI;
                    "".length();
                    if ("   ".length() == 0) {
                        return;
                    }
                }
                this.quadSpaceShapes[llllllllllllIlIlllIlIlllIllllIll][llllllllllllIlIlllIlIlllIlllllII] = llllllllllllIlIlllIlIlllIlllllIl;
                ++llllllllllllIlIlllIlIlllIlllllII;
                "".length();
                if (((0x9C ^ 0xB5) & ~(0xAE ^ 0x87)) >= "   ".length()) {
                    return;
                }
            }
            ++llllllllllllIlIlllIlIlllIllllIll;
            "".length();
            if (null != null) {
                return;
            }
        }
    }
    
    private static void lIlIIIIIllllIllI() {
        (lllIIllllIlIll = new int[15])[0] = ("  ".length() & ("  ".length() ^ -" ".length()));
        GeomUtilTileTest.lllIIllllIlIll[1] = (0x82 ^ 0x88);
        GeomUtilTileTest.lllIIllllIlIll[2] = " ".length();
        GeomUtilTileTest.lllIIllllIlIll[3] = "  ".length();
        GeomUtilTileTest.lllIIllllIlIll[4] = "   ".length();
        GeomUtilTileTest.lllIIllllIlIll[5] = (0x55 ^ 0x51);
        GeomUtilTileTest.lllIIllllIlIll[6] = (0x79 ^ 0x6C ^ (0xD5 ^ 0xC5));
        GeomUtilTileTest.lllIIllllIlIll[7] = (0x69 ^ 0x74 ^ (0x27 ^ 0x3C));
        GeomUtilTileTest.lllIIllllIlIll[8] = (0xA4 ^ 0xA3);
        GeomUtilTileTest.lllIIllllIlIll[9] = (34 + 106 + 23 + 6 ^ 18 + 43 + 56 + 44);
        GeomUtilTileTest.lllIIllllIlIll[10] = (0xB2 ^ 0xBB);
        GeomUtilTileTest.lllIIllllIlIll[11] = (0x35 ^ 0x15);
        GeomUtilTileTest.lllIIllllIlIll[12] = (2 + 13 + 83 + 48 ^ 9 + 72 - 12 + 61);
        GeomUtilTileTest.lllIIllllIlIll[13] = (0xFFFFD7E3 & 0x2B3C);
        GeomUtilTileTest.lllIIllllIlIll[14] = (-(0xFFFFD9A7 & 0x6FDD) & (0xFFFFEBDD & 0x5FFE));
    }
    
    public void pointExcluded(final float llllllllllllIlIlllIlIllIlIlIllII, final float llllllllllllIlIlllIlIllIlIlIlIll) {
    }
    
    private static boolean lIlIIIIIllllIlll(final int llllllllllllIlIlllIlIllIIlIlllll, final int llllllllllllIlIlllIlIllIIlIllllI) {
        return llllllllllllIlIlllIlIllIIlIlllll < llllllllllllIlIlllIlIllIIlIllllI;
    }
    
    static {
        lIlIIIIIllllIllI();
        lIlIIIIIllllIIlI();
    }
    
    private static boolean lIlIIIIIlllllIIl(final int llllllllllllIlIlllIlIllIIlIIllll, final int llllllllllllIlIlllIlIllIIlIIlllI) {
        return llllllllllllIlIlllIlIllIIlIIllll != llllllllllllIlIlllIlIllIIlIIlllI;
    }
    
    private static boolean lIlIIIIIllllllII(final int llllllllllllIlIlllIlIllIIlIlIIll) {
        return llllllllllllIlIlllIlIllIIlIlIIll == 0;
    }
    
    private static boolean lIlIIIIIlllllIII(final int llllllllllllIlIlllIlIllIIlIllIII) {
        return llllllllllllIlIlllIlIllIIlIllIII != 0;
    }
    
    public void pointIntersected(final float llllllllllllIlIlllIlIllIlIlIIIll, final float llllllllllllIlIlllIlIllIlIlIIlIl) {
        this.intersections.add(new Vector2f(llllllllllllIlIlllIlIllIlIlIIIll, llllllllllllIlIlllIlIllIlIlIIlIl));
        "".length();
    }
    
    public GeomUtilTileTest() {
        super(GeomUtilTileTest.lllIIllllIIlll[GeomUtilTileTest.lllIIllllIlIll[0]]);
        this.util = new GeomUtil();
        this.original = new ArrayList();
        this.combined = new ArrayList();
        this.intersections = new ArrayList();
        this.used = new ArrayList();
    }
    
    private static String lIlIIIIIlllIllIl(String llllllllllllIlIlllIlIllIlIIIlIIl, final String llllllllllllIlIlllIlIllIlIIIlIII) {
        llllllllllllIlIlllIlIllIlIIIlIIl = new String(Base64.getDecoder().decode(llllllllllllIlIlllIlIllIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllIlIllIlIIIllII = new StringBuilder();
        final char[] llllllllllllIlIlllIlIllIlIIIlIll = llllllllllllIlIlllIlIllIlIIIlIII.toCharArray();
        int llllllllllllIlIlllIlIllIlIIIlIlI = GeomUtilTileTest.lllIIllllIlIll[0];
        final char llllllllllllIlIlllIlIllIlIIIIlII = (Object)llllllllllllIlIlllIlIllIlIIIlIIl.toCharArray();
        final long llllllllllllIlIlllIlIllIlIIIIIll = llllllllllllIlIlllIlIllIlIIIIlII.length;
        long llllllllllllIlIlllIlIllIlIIIIIlI = GeomUtilTileTest.lllIIllllIlIll[0];
        while (lIlIIIIIllllIlll((int)llllllllllllIlIlllIlIllIlIIIIIlI, (int)llllllllllllIlIlllIlIllIlIIIIIll)) {
            final char llllllllllllIlIlllIlIllIlIIIllll = llllllllllllIlIlllIlIllIlIIIIlII[llllllllllllIlIlllIlIllIlIIIIIlI];
            llllllllllllIlIlllIlIllIlIIIllII.append((char)(llllllllllllIlIlllIlIllIlIIIllll ^ llllllllllllIlIlllIlIllIlIIIlIll[llllllllllllIlIlllIlIllIlIIIlIlI % llllllllllllIlIlllIlIllIlIIIlIll.length]));
            "".length();
            ++llllllllllllIlIlllIlIllIlIIIlIlI;
            ++llllllllllllIlIlllIlIllIlIIIIIlI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllIlIllIlIIIllII);
    }
    
    @Override
    public void update(final GameContainer llllllllllllIlIlllIlIllIllIIlIIl, final int llllllllllllIlIlllIlIllIllIIlIII) throws SlickException {
    }
    
    private ArrayList combineImpl(final ArrayList llllllllllllIlIlllIlIllIlllIIlII) {
        ArrayList llllllllllllIlIlllIlIllIlllIIllI = new ArrayList(llllllllllllIlIlllIlIllIlllIIlII);
        if (lIlIIIIIlllllIll(this.quadSpace)) {
            llllllllllllIlIlllIlIllIlllIIllI = llllllllllllIlIlllIlIllIlllIIlII;
        }
        int llllllllllllIlIlllIlIllIlllIlIIl = GeomUtilTileTest.lllIIllllIlIll[0];
        while (lIlIIIIIllllIlll(llllllllllllIlIlllIlIllIlllIlIIl, llllllllllllIlIlllIlIllIlllIIlII.size())) {
            final Shape llllllllllllIlIlllIlIllIlllIlIlI = (Shape)llllllllllllIlIlllIlIllIlllIIlII.get(llllllllllllIlIlllIlIllIlllIlIIl);
            int llllllllllllIlIlllIlIllIlllIlIll = llllllllllllIlIlllIlIllIlllIlIIl + GeomUtilTileTest.lllIIllllIlIll[2];
            while (lIlIIIIIllllIlll(llllllllllllIlIlllIlIllIlllIlIll, llllllllllllIlIlllIlIllIlllIIlII.size())) {
                final Shape llllllllllllIlIlllIlIllIlllIllIl = (Shape)llllllllllllIlIlllIlIllIlllIIlII.get(llllllllllllIlIlllIlIllIlllIlIll);
                if (lIlIIIIIllllllII(llllllllllllIlIlllIlIllIlllIlIlI.intersects(llllllllllllIlIlllIlIllIlllIllIl) ? 1 : 0)) {
                    "".length();
                    if ((38 + 96 - 57 + 50 ^ (0xFF ^ 0x84)) <= " ".length()) {
                        return null;
                    }
                }
                else {
                    final Shape[] llllllllllllIlIlllIlIllIlllIllII = this.util.union(llllllllllllIlIlllIlIllIlllIlIlI, llllllllllllIlIlllIlIllIlllIllIl);
                    if (lIlIIIIIlllllIlI(llllllllllllIlIlllIlIllIlllIllII.length, GeomUtilTileTest.lllIIllllIlIll[2])) {
                        if (lIlIIIIIlllllIll(this.quadSpace)) {
                            this.removeFromQuadSpace(llllllllllllIlIlllIlIllIlllIlIlI);
                            this.removeFromQuadSpace(llllllllllllIlIlllIlIllIlllIllIl);
                            this.addToQuadSpace(llllllllllllIlIlllIlIllIlllIllII[GeomUtilTileTest.lllIIllllIlIll[0]]);
                            "".length();
                            if (-(0xAA ^ 0xAE) >= 0) {
                                return null;
                            }
                        }
                        else {
                            llllllllllllIlIlllIlIllIlllIIllI.remove(llllllllllllIlIlllIlIllIlllIlIlI);
                            "".length();
                            llllllllllllIlIlllIlIllIlllIIllI.remove(llllllllllllIlIlllIlIllIlllIllIl);
                            "".length();
                            llllllllllllIlIlllIlIllIlllIIllI.add(llllllllllllIlIlllIlIllIlllIllII[GeomUtilTileTest.lllIIllllIlIll[0]]);
                            "".length();
                        }
                        return llllllllllllIlIlllIlIllIlllIIllI;
                    }
                }
                ++llllllllllllIlIlllIlIllIlllIlIll;
                "".length();
                if (-" ".length() != -" ".length()) {
                    return null;
                }
            }
            ++llllllllllllIlIlllIlIllIlllIlIIl;
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        return llllllllllllIlIlllIlIllIlllIIllI;
    }
    
    private void addToQuadSpace(final Shape llllllllllllIlIlllIlIlllIlIIlIIl) {
        final int llllllllllllIlIlllIlIlllIlIIlIll = this.quadSpace.length;
        int llllllllllllIlIlllIlIlllIlIIlllI = GeomUtilTileTest.lllIIllllIlIll[0];
        while (lIlIIIIIllllIlll(llllllllllllIlIlllIlIlllIlIIlllI, llllllllllllIlIlllIlIlllIlIIlIll)) {
            int llllllllllllIlIlllIlIlllIlIIllll = GeomUtilTileTest.lllIIllllIlIll[0];
            while (lIlIIIIIllllIlll(llllllllllllIlIlllIlIlllIlIIllll, llllllllllllIlIlllIlIlllIlIIlIll)) {
                if (lIlIIIIIlllllIII(this.collides(llllllllllllIlIlllIlIlllIlIIlIIl, this.quadSpaceShapes[llllllllllllIlIlllIlIlllIlIIlllI][llllllllllllIlIlllIlIlllIlIIllll]) ? 1 : 0)) {
                    this.quadSpace[llllllllllllIlIlllIlIlllIlIIlllI][llllllllllllIlIlllIlIlllIlIIllll].add(llllllllllllIlIlllIlIlllIlIIlIIl);
                    "".length();
                }
                ++llllllllllllIlIlllIlIlllIlIIllll;
                "".length();
                if (-" ".length() > 0) {
                    return;
                }
            }
            ++llllllllllllIlIlllIlIlllIlIIlllI;
            "".length();
            if ("   ".length() <= " ".length()) {
                return;
            }
        }
    }
}
