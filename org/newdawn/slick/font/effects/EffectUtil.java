// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.font.effects;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JPanel;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.util.Arrays;
import javax.swing.JDialog;
import java.awt.EventQueue;
import javax.swing.JCheckBox;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.awt.Component;
import javax.swing.JColorChooser;
import java.awt.Color;
import java.awt.Composite;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.SpinnerModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.image.BufferedImage;

public class EffectUtil
{
    private static /* synthetic */ BufferedImage scratchImage;
    private static final /* synthetic */ String[] lIIllIlIIIIIII;
    private static final /* synthetic */ int[] lIIllIlIIIIIIl;
    
    private static void llIllIIIIIIlIII() {
        (lIIllIlIIIIIII = new String[EffectUtil.lIIllIlIIIIIIl[7]])[EffectUtil.lIIllIlIIIIIIl[0]] = llIllIIIIIIIlII("HzpiX+RrLIse6ee/O4AQvWxsiQhOAOEb", "WvMUb");
        EffectUtil.lIIllIlIIIIIII[EffectUtil.lIIllIlIIIIIIl[2]] = llIllIIIIIIIlII("iKZyM51deWA=", "linhZ");
        EffectUtil.lIIllIlIIIIIII[EffectUtil.lIIllIlIIIIIIl[3]] = llIllIIIIIIIlII("/EFuMLyvbuU=", "LUwSf");
        EffectUtil.lIIllIlIIIIIII[EffectUtil.lIIllIlIIIIIIl[4]] = llIllIIIIIIIlII("AJYbITU0rhY=", "TKTzm");
    }
    
    static {
        llIllIIIIIIlIIl();
        llIllIIIIIIlIII();
        EffectUtil.scratchImage = new BufferedImage(EffectUtil.lIIllIlIIIIIIl[1], EffectUtil.lIIllIlIIIIIIl[1], EffectUtil.lIIllIlIIIIIIl[3]);
    }
    
    public static ConfigurableEffect.Value intValue(final String lllllllllllllIIlIlIllIllllllIlll, final int lllllllllllllIIlIlIllIlllllllIIl, final String lllllllllllllIIlIlIllIlllllllIII) {
        return new DefaultValue(lllllllllllllIIlIlIllIllllllIlll, String.valueOf(lllllllllllllIIlIlIllIlllllllIIl)) {
            private static final /* synthetic */ int[] lIllIIIllllIll;
            
            static {
                lllllIIlIIlIllI();
            }
            
            public Object getObject() {
                return Integer.valueOf(this.value);
            }
            
            private static boolean lllllIIlIIlIlll(final int lllllllllllllIIIIIlIIllllIIIlIlI) {
                return lllllllllllllIIIIIlIIllllIIIlIlI != 0;
            }
            
            private static void lllllIIlIIlIllI() {
                (lIllIIIllllIll = new int[3])[0] = -(-(0xFFFFFE8E & 0x2D7D) & (0xFFFFEE6F & 0xBD9B));
                EffectUtil$2.lIllIIIllllIll[1] = (-1 & 0x7FFF);
                EffectUtil$2.lIllIIIllllIll[2] = " ".length();
            }
            
            public void showDialog() {
                final JSpinner lllllllllllllIIIIIlIIllllIIlIIll = new JSpinner(new SpinnerNumberModel(lllllllllllllIIlIlIllIlllllllIIl, EffectUtil$2.lIllIIIllllIll[0], EffectUtil$2.lIllIIIllllIll[1], EffectUtil$2.lIllIIIllllIll[2]));
                if (lllllIIlIIlIlll(this.showValueDialog(lllllllllllllIIIIIlIIllllIIlIIll, lllllllllllllIIlIlIllIlllllllIII) ? 1 : 0)) {
                    this.value = String.valueOf(lllllllllllllIIIIIlIIllllIIlIIll.getValue());
                }
            }
        };
    }
    
    public static BufferedImage getScratchImage() {
        final Graphics2D lllllllllllllIIlIlIlllIIIIIIIlIl = (Graphics2D)EffectUtil.scratchImage.getGraphics();
        lllllllllllllIIlIlIlllIIIIIIIlIl.setComposite(AlphaComposite.Clear);
        lllllllllllllIIlIlIlllIIIIIIIlIl.fillRect(EffectUtil.lIIllIlIIIIIIl[0], EffectUtil.lIIllIlIIIIIIl[0], EffectUtil.lIIllIlIIIIIIl[1], EffectUtil.lIIllIlIIIIIIl[1]);
        lllllllllllllIIlIlIlllIIIIIIIlIl.setComposite(AlphaComposite.SrcOver);
        lllllllllllllIIlIlIlllIIIIIIIlIl.setColor(Color.white);
        return EffectUtil.scratchImage;
    }
    
    public static ConfigurableEffect.Value colorValue(final String lllllllllllllIIlIlIlllIIIIIIIIIl, final Color lllllllllllllIIlIlIlllIIIIIIIIII) {
        return new DefaultValue(lllllllllllllIIlIlIlllIIIIIIIIIl, toString(lllllllllllllIIlIlIlllIIIIIIIIII)) {
            private static final /* synthetic */ int[] lllIllIllllIll;
            private static final /* synthetic */ String[] lllIllIlllIllI;
            
            public Object getObject() {
                return EffectUtil.fromString(this.value);
            }
            
            private static void lIlIIlIlIlIIIlIl() {
                (lllIllIlllIllI = new String[EffectUtil$1.lllIllIllllIll[1]])[EffectUtil$1.lllIllIllllIll[0]] = lIlIIlIlIlIIIlII("OTguPjcfcCBxJxU8LiM=", "zPAQD");
            }
            
            static {
                lIlIIlIlIlIllIIl();
                lIlIIlIlIlIIIlIl();
            }
            
            public void showDialog() {
                final Color llllllllllllIlIllIIIlIlllIlIllIl = JColorChooser.showDialog(null, EffectUtil$1.lllIllIlllIllI[EffectUtil$1.lllIllIllllIll[0]], EffectUtil.fromString(this.value));
                if (lIlIIlIlIlIllIlI(llllllllllllIlIllIIIlIlllIlIllIl)) {
                    this.value = EffectUtil.toString(llllllllllllIlIllIIIlIlllIlIllIl);
                }
            }
            
            private static boolean lIlIIlIlIlIllIlI(final Object llllllllllllIlIllIIIlIlllIIIlIlI) {
                return llllllllllllIlIllIIIlIlllIIIlIlI != null;
            }
            
            private static void lIlIIlIlIlIllIIl() {
                (lllIllIllllIll = new int[2])[0] = ((0x28 ^ 0x34) & ~(0x84 ^ 0x98));
                EffectUtil$1.lllIllIllllIll[1] = " ".length();
            }
            
            private static String lIlIIlIlIlIIIlII(String llllllllllllIlIllIIIlIlllIIllIII, final String llllllllllllIlIllIIIlIlllIIlllII) {
                llllllllllllIlIllIIIlIlllIIllIII = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllIIIlIlllIIllIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIlIllIIIlIlllIIllIll = new StringBuilder();
                final char[] llllllllllllIlIllIIIlIlllIIllIlI = llllllllllllIlIllIIIlIlllIIlllII.toCharArray();
                int llllllllllllIlIllIIIlIlllIIllIIl = EffectUtil$1.lllIllIllllIll[0];
                final float llllllllllllIlIllIIIlIlllIIlIIll = (Object)((String)llllllllllllIlIllIIIlIlllIIllIII).toCharArray();
                final double llllllllllllIlIllIIIlIlllIIlIIlI = llllllllllllIlIllIIIlIlllIIlIIll.length;
                long llllllllllllIlIllIIIlIlllIIlIIIl = EffectUtil$1.lllIllIllllIll[0];
                while (lIlIIlIlIlIllIll((int)llllllllllllIlIllIIIlIlllIIlIIIl, (int)llllllllllllIlIllIIIlIlllIIlIIlI)) {
                    final char llllllllllllIlIllIIIlIlllIIllllI = llllllllllllIlIllIIIlIlllIIlIIll[llllllllllllIlIllIIIlIlllIIlIIIl];
                    llllllllllllIlIllIIIlIlllIIllIll.append((char)(llllllllllllIlIllIIIlIlllIIllllI ^ llllllllllllIlIllIIIlIlllIIllIlI[llllllllllllIlIllIIIlIlllIIllIIl % llllllllllllIlIllIIIlIlllIIllIlI.length]));
                    "".length();
                    ++llllllllllllIlIllIIIlIlllIIllIIl;
                    ++llllllllllllIlIllIIIlIlllIIlIIIl;
                    "".length();
                    if (-"  ".length() > 0) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIlIllIIIlIlllIIllIll);
            }
            
            private static boolean lIlIIlIlIlIllIll(final int llllllllllllIlIllIIIlIlllIIIllIl, final int llllllllllllIlIllIIIlIlllIIIllII) {
                return llllllllllllIlIllIIIlIlllIIIllIl < llllllllllllIlIllIIIlIlllIIIllII;
            }
        };
    }
    
    public static ConfigurableEffect.Value floatValue(final String lllllllllllllIIlIlIllIlllllIllll, final float lllllllllllllIIlIlIllIlllllIlIIl, final float lllllllllllllIIlIlIllIlllllIllIl, final float lllllllllllllIIlIlIllIlllllIIlll, final String lllllllllllllIIlIlIllIlllllIIllI) {
        return new DefaultValue(lllllllllllllIIlIlIllIlllllIllll, String.valueOf(lllllllllllllIIlIlIllIlllllIlIIl)) {
            public Object getObject() {
                return Float.valueOf(this.value);
            }
            
            public void showDialog() {
                final JSpinner llllllllllllIlIllIlIllllIlIlllIl = new JSpinner(new SpinnerNumberModel(lllllllllllllIIlIlIllIlllllIlIIl, lllllllllllllIIlIlIllIlllllIllIl, lllllllllllllIIlIlIllIlllllIIlll, 0.10000000149011612));
                if (lIlIIIllIIlIIlll(this.showValueDialog(llllllllllllIlIllIlIllllIlIlllIl, lllllllllllllIIlIlIllIlllllIIllI) ? 1 : 0)) {
                    this.value = String.valueOf(((Double)llllllllllllIlIllIlIllllIlIlllIl.getValue()).floatValue());
                }
            }
            
            private static boolean lIlIIIllIIlIIlll(final int llllllllllllIlIllIlIllllIlIIllIl) {
                return llllllllllllIlIllIlIllllIlIIllIl != 0;
            }
        };
    }
    
    public static ConfigurableEffect.Value optionValue(final String lllllllllllllIIlIlIllIllllIllIII, final String lllllllllllllIIlIlIllIllllIlIlll, final String[][] lllllllllllllIIlIlIllIllllIlIIlI, final String lllllllllllllIIlIlIllIllllIlIIIl) {
        return new DefaultValue(lllllllllllllIIlIlIllIllllIllIII, lllllllllllllIIlIlIllIllllIlIlll.toString()) {
            private static final /* synthetic */ String[] lllIllIIlIIllI;
            private static final /* synthetic */ int[] lllIllIIlIIlll;
            
            private static boolean lIlIIlIIIllIIllI(final int llllllllllllIlIllIIllIIlIlIIIlIl, final int llllllllllllIlIllIIllIIlIlIIIlII) {
                return llllllllllllIlIllIIllIIlIlIIIlIl == llllllllllllIlIllIIllIIlIlIIIlII;
            }
            
            @Override
            public String toString() {
                int llllllllllllIlIllIIllIIlIlIllIll = EffectUtil$5.lllIllIIlIIlll[1];
                while (lIlIIlIIIllIIlII(llllllllllllIlIllIIllIIlIlIllIll, lllllllllllllIIlIlIllIllllIlIIlI.length)) {
                    if (lIlIIlIIIllIIlIl(this.getValue(llllllllllllIlIllIIllIIlIlIllIll).equals(this.value) ? 1 : 0)) {
                        return lllllllllllllIIlIlIllIllllIlIIlI[llllllllllllIlIllIIllIIlIlIllIll][EffectUtil$5.lllIllIIlIIlll[1]].toString();
                    }
                    ++llllllllllllIlIllIIllIIlIlIllIll;
                    "".length();
                    if ((((0x78 ^ 0x50) & ~(0x20 ^ 0x8)) ^ (0xAE ^ 0xAB)) == 0x0) {
                        return null;
                    }
                }
                return EffectUtil$5.lllIllIIlIIllI[EffectUtil$5.lllIllIIlIIlll[1]];
            }
            
            private static String lIlIIlIIIllIIIIl(final String llllllllllllIlIllIIllIIlIlIIllIl, final String llllllllllllIlIllIIllIIlIlIIlIlI) {
                try {
                    final SecretKeySpec llllllllllllIlIllIIllIIlIlIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIllIIlIlIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher llllllllllllIlIllIIllIIlIlIIllll = Cipher.getInstance("Blowfish");
                    llllllllllllIlIllIIllIIlIlIIllll.init(EffectUtil$5.lllIllIIlIIlll[3], llllllllllllIlIllIIllIIlIlIlIIII);
                    return new String(llllllllllllIlIllIIllIIlIlIIllll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIllIIlIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlIllIIllIIlIlIIlllI) {
                    llllllllllllIlIllIIllIIlIlIIlllI.printStackTrace();
                    return null;
                }
            }
            
            private String getValue(final int llllllllllllIlIllIIllIIlIllIIIII) {
                if (lIlIIlIIIllIIllI(lllllllllllllIIlIlIllIllllIlIIlI[llllllllllllIlIllIIllIIlIllIIIII].length, EffectUtil$5.lllIllIIlIIlll[2])) {
                    return lllllllllllllIIlIlIllIllllIlIIlI[llllllllllllIlIllIIllIIlIllIIIII][EffectUtil$5.lllIllIIlIIlll[1]];
                }
                return lllllllllllllIIlIlIllIllllIlIIlI[llllllllllllIlIllIIllIIlIllIIIII][EffectUtil$5.lllIllIIlIIlll[2]];
            }
            
            public void showDialog() {
                int llllllllllllIlIllIIllIIlIllIlIlI = EffectUtil$5.lllIllIIlIIlll[0];
                final DefaultComboBoxModel llllllllllllIlIllIIllIIlIllIlIIl = new DefaultComboBoxModel();
                int llllllllllllIlIllIIllIIlIllIllII = EffectUtil$5.lllIllIIlIIlll[1];
                while (lIlIIlIIIllIIlII(llllllllllllIlIllIIllIIlIllIllII, lllllllllllllIIlIlIllIllllIlIIlI.length)) {
                    llllllllllllIlIllIIllIIlIllIlIIl.addElement(lllllllllllllIIlIlIllIllllIlIIlI[llllllllllllIlIllIIllIIlIllIllII][EffectUtil$5.lllIllIIlIIlll[1]]);
                    if (lIlIIlIIIllIIlIl(this.getValue(llllllllllllIlIllIIllIIlIllIllII).equals(lllllllllllllIIlIlIllIllllIlIlll) ? 1 : 0)) {
                        llllllllllllIlIllIIllIIlIllIlIlI = llllllllllllIlIllIIllIIlIllIllII;
                    }
                    ++llllllllllllIlIllIIllIIlIllIllII;
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                final JComboBox llllllllllllIlIllIIllIIlIllIlIII = new JComboBox(llllllllllllIlIllIIllIIlIllIlIIl);
                llllllllllllIlIllIIllIIlIllIlIII.setSelectedIndex(llllllllllllIlIllIIllIIlIllIlIlI);
                if (lIlIIlIIIllIIlIl(this.showValueDialog(llllllllllllIlIllIIllIIlIllIlIII, lllllllllllllIIlIlIllIllllIlIIIl) ? 1 : 0)) {
                    this.value = this.getValue(llllllllllllIlIllIIllIIlIllIlIII.getSelectedIndex());
                }
            }
            
            private static void lIlIIlIIIllIIIll() {
                (lllIllIIlIIlll = new int[4])[0] = -" ".length();
                EffectUtil$5.lllIllIIlIIlll[1] = ((0x7E ^ 0x70) & ~(0x33 ^ 0x3D));
                EffectUtil$5.lllIllIIlIIlll[2] = " ".length();
                EffectUtil$5.lllIllIIlIIlll[3] = "  ".length();
            }
            
            static {
                lIlIIlIIIllIIIll();
                lIlIIlIIIllIIIlI();
            }
            
            public Object getObject() {
                return this.value;
            }
            
            private static void lIlIIlIIIllIIIlI() {
                (lllIllIIlIIllI = new String[EffectUtil$5.lllIllIIlIIlll[2]])[EffectUtil$5.lllIllIIlIIlll[1]] = lIlIIlIIIllIIIIl("YNNsxyYPgoE=", "Byneh");
            }
            
            private static boolean lIlIIlIIIllIIlII(final int llllllllllllIlIllIIllIIlIlIIIIIl, final int llllllllllllIlIllIIllIIlIlIIIIII) {
                return llllllllllllIlIllIIllIIlIlIIIIIl < llllllllllllIlIllIIllIIlIlIIIIII;
            }
            
            private static boolean lIlIIlIIIllIIlIl(final int llllllllllllIlIllIIllIIlIIlllllI) {
                return llllllllllllIlIllIIllIIlIIlllllI != 0;
            }
        };
    }
    
    private static boolean llIllIIIIIIllIl(final int lllllllllllllIIlIlIllIlllIlIlIlI, final int lllllllllllllIIlIlIllIlllIlIlIIl) {
        return lllllllllllllIIlIlIllIlllIlIlIlI != lllllllllllllIIlIlIllIlllIlIlIIl;
    }
    
    private static String llIllIIIIIIIlII(final String lllllllllllllIIlIlIllIlllIlllIII, final String lllllllllllllIIlIlIllIlllIlllIIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIllIlllIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIllIlllIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIlIllIlllIllllII = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIlIllIlllIllllII.init(EffectUtil.lIIllIlIIIIIIl[3], lllllllllllllIIlIlIllIlllIllllIl);
            return new String(lllllllllllllIIlIlIllIlllIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIllIlllIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIllIlllIlllIll) {
            lllllllllllllIIlIlIllIlllIlllIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIllIIIIIIlIlI(final Object lllllllllllllIIlIlIllIlllIlIllIl) {
        return lllllllllllllIIlIlIllIlllIlIllIl == null;
    }
    
    private static boolean llIllIIIIIIllII(final Object lllllllllllllIIlIlIllIlllIlIllll) {
        return lllllllllllllIIlIlIllIlllIlIllll != null;
    }
    
    private static boolean llIllIIIIIIlIll(final int lllllllllllllIIlIlIllIlllIllIIlI, final int lllllllllllllIIlIlIllIlllIllIIIl) {
        return lllllllllllllIIlIlIllIlllIllIIlI == lllllllllllllIIlIlIllIlllIllIIIl;
    }
    
    public static ConfigurableEffect.Value booleanValue(final String lllllllllllllIIlIlIllIllllIlllll, final boolean lllllllllllllIIlIlIllIlllllIIIIl, final String lllllllllllllIIlIlIllIllllIlllIl) {
        return new DefaultValue(lllllllllllllIIlIlIllIllllIlllll, String.valueOf(lllllllllllllIIlIlIllIlllllIIIIl)) {
            public void showDialog() {
                final JCheckBox lllllllllllllIIlIllllllIIllIIIll = new JCheckBox();
                lllllllllllllIIlIllllllIIllIIIll.setSelected(lllllllllllllIIlIlIllIlllllIIIIl);
                if (llIlIlIIlIIlIlI(this.showValueDialog(lllllllllllllIIlIllllllIIllIIIll, lllllllllllllIIlIlIllIllllIlllIl) ? 1 : 0)) {
                    this.value = String.valueOf(lllllllllllllIIlIllllllIIllIIIll.isSelected());
                }
            }
            
            private static boolean llIlIlIIlIIlIlI(final int lllllllllllllIIlIllllllIIlIlllII) {
                return lllllllllllllIIlIllllllIIlIlllII != 0;
            }
            
            public Object getObject() {
                return Boolean.valueOf(this.value);
            }
        };
    }
    
    private static void llIllIIIIIIlIIl() {
        (lIIllIlIIIIIIl = new int[8])[0] = ((0x42 ^ 0x13) & ~(0xDD ^ 0x8C));
        EffectUtil.lIIllIlIIIIIIl[1] = (0xFFFFC976 & 0x3789);
        EffectUtil.lIIllIlIIIIIIl[2] = " ".length();
        EffectUtil.lIIllIlIIIIIIl[3] = "  ".length();
        EffectUtil.lIIllIlIIIIIIl[4] = "   ".length();
        EffectUtil.lIIllIlIIIIIIl[5] = (0x14 ^ 0x13 ^ " ".length());
        EffectUtil.lIIllIlIIIIIIl[6] = (0xA2 ^ 0xB2);
        EffectUtil.lIIllIlIIIIIIl[7] = (0x9A ^ 0x9E);
    }
    
    public static String toString(final Color lllllllllllllIIlIlIllIllllIIllII) {
        if (llIllIIIIIIlIlI(lllllllllllllIIlIlIllIllllIIllII)) {
            throw new IllegalArgumentException(EffectUtil.lIIllIlIIIIIII[EffectUtil.lIIllIlIIIIIIl[0]]);
        }
        String lllllllllllllIIlIlIllIllllIIlIll = Integer.toHexString(lllllllllllllIIlIlIllIllllIIllII.getRed());
        if (llIllIIIIIIlIll(lllllllllllllIIlIlIllIllllIIlIll.length(), EffectUtil.lIIllIlIIIIIIl[2])) {
            lllllllllllllIIlIlIllIllllIIlIll = String.valueOf(new StringBuilder().append(EffectUtil.lIIllIlIIIIIII[EffectUtil.lIIllIlIIIIIIl[2]]).append(lllllllllllllIIlIlIllIllllIIlIll));
        }
        String lllllllllllllIIlIlIllIllllIIlIlI = Integer.toHexString(lllllllllllllIIlIlIllIllllIIllII.getGreen());
        if (llIllIIIIIIlIll(lllllllllllllIIlIlIllIllllIIlIlI.length(), EffectUtil.lIIllIlIIIIIIl[2])) {
            lllllllllllllIIlIlIllIllllIIlIlI = String.valueOf(new StringBuilder().append(EffectUtil.lIIllIlIIIIIII[EffectUtil.lIIllIlIIIIIIl[3]]).append(lllllllllllllIIlIlIllIllllIIlIlI));
        }
        String lllllllllllllIIlIlIllIllllIIlIIl = Integer.toHexString(lllllllllllllIIlIlIllIllllIIllII.getBlue());
        if (llIllIIIIIIlIll(lllllllllllllIIlIlIllIllllIIlIIl.length(), EffectUtil.lIIllIlIIIIIIl[2])) {
            lllllllllllllIIlIlIllIllllIIlIIl = String.valueOf(new StringBuilder().append(EffectUtil.lIIllIlIIIIIII[EffectUtil.lIIllIlIIIIIIl[4]]).append(lllllllllllllIIlIlIllIllllIIlIIl));
        }
        return String.valueOf(new StringBuilder().append(lllllllllllllIIlIlIllIllllIIlIll).append(lllllllllllllIIlIlIllIllllIIlIlI).append(lllllllllllllIIlIlIllIllllIIlIIl));
    }
    
    public static Color fromString(final String lllllllllllllIIlIlIllIllllIIIIlI) {
        if (!llIllIIIIIIllII(lllllllllllllIIlIlIllIllllIIIIlI) || llIllIIIIIIllIl(lllllllllllllIIlIlIllIllllIIIIlI.length(), EffectUtil.lIIllIlIIIIIIl[5])) {
            return Color.white;
        }
        return new Color(Integer.parseInt(lllllllllllllIIlIlIllIllllIIIIlI.substring(EffectUtil.lIIllIlIIIIIIl[0], EffectUtil.lIIllIlIIIIIIl[3]), EffectUtil.lIIllIlIIIIIIl[6]), Integer.parseInt(lllllllllllllIIlIlIllIllllIIIIlI.substring(EffectUtil.lIIllIlIIIIIIl[3], EffectUtil.lIIllIlIIIIIIl[7]), EffectUtil.lIIllIlIIIIIIl[6]), Integer.parseInt(lllllllllllllIIlIlIllIllllIIIIlI.substring(EffectUtil.lIIllIlIIIIIIl[7], EffectUtil.lIIllIlIIIIIIl[5]), EffectUtil.lIIllIlIIIIIIl[6]));
    }
    
    private abstract static class DefaultValue implements ConfigurableEffect.Value
    {
        /* synthetic */ String name;
        private static final /* synthetic */ String[] lIIllIlIIIIlll;
        private static final /* synthetic */ int[] lIIllIlIIIlIII;
        /* synthetic */ String value;
        
        private static void llIllIIIIlIIlII() {
            (lIIllIlIIIIlll = new String[DefaultValue.lIIllIlIIIlIII[1]])[DefaultValue.lIIllIlIIIlIII[0]] = llIllIIIIlIIIll("", "WJfOM");
        }
        
        static {
            llIllIIIIlIIllI();
            llIllIIIIlIIlII();
        }
        
        private static void llIllIIIIlIIllI() {
            (lIIllIlIIIlIII = new int[2])[0] = ((0x67 ^ 0x6E ^ (0xE1 ^ 0x88)) & (104 + 142 - 186 + 189 ^ 5 + 48 + 37 + 63 ^ -" ".length()));
            DefaultValue.lIIllIlIIIlIII[1] = " ".length();
        }
        
        public boolean showValueDialog(final JComponent lllllllllllllIIlIlIllIlIllIllIlI, final String lllllllllllllIIlIlIllIlIllIlllIl) {
            final ValueDialog lllllllllllllIIlIlIllIlIllIlllII = new ValueDialog(lllllllllllllIIlIlIllIlIllIllIlI, this.name, lllllllllllllIIlIlIllIlIllIlllIl);
            lllllllllllllIIlIlIllIlIllIlllII.setTitle(this.name);
            lllllllllllllIIlIlIllIlIllIlllII.setLocationRelativeTo(null);
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    JComponent llllllllllllIllIIllIllIlIlIIlIll = lllllllllllllIIlIlIllIlIllIllIlI;
                    if (lIIlIlllllIIlIll((llllllllllllIllIIllIllIlIlIIlIll instanceof JSpinner) ? 1 : 0)) {
                        llllllllllllIllIIllIllIlIlIIlIll = ((JSpinner.DefaultEditor)((JSpinner)lllllllllllllIIlIlIllIlIllIllIlI).getEditor()).getTextField();
                    }
                    llllllllllllIllIIllIllIlIlIIlIll.requestFocusInWindow();
                    "".length();
                }
                
                private static boolean lIIlIlllllIIlIll(final int llllllllllllIllIIllIllIlIlIIIlll) {
                    return llllllllllllIllIIllIllIlIlIIIlll != 0;
                }
            });
            lllllllllllllIIlIlIllIlIllIlllII.setVisible((boolean)(DefaultValue.lIIllIlIIIlIII[1] != 0));
            return lllllllllllllIIlIlIllIlIllIlllII.okPressed;
        }
        
        public DefaultValue(final String lllllllllllllIIlIlIllIlIllllIlll, final String lllllllllllllIIlIlIllIlIllllIIll) {
            this.value = lllllllllllllIIlIlIllIlIllllIIll;
            this.name = lllllllllllllIIlIlIllIlIllllIlll;
        }
        
        private static String llIllIIIIlIIIll(String lllllllllllllIIlIlIllIlIllIIlIII, final String lllllllllllllIIlIlIllIlIllIIIlll) {
            lllllllllllllIIlIlIllIlIllIIlIII = new String(Base64.getDecoder().decode(lllllllllllllIIlIlIllIlIllIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIlIlIllIlIllIIlIll = new StringBuilder();
            final char[] lllllllllllllIIlIlIllIlIllIIlIlI = lllllllllllllIIlIlIllIlIllIIIlll.toCharArray();
            int lllllllllllllIIlIlIllIlIllIIlIIl = DefaultValue.lIIllIlIIIlIII[0];
            final Exception lllllllllllllIIlIlIllIlIllIIIIll = (Object)lllllllllllllIIlIlIllIlIllIIlIII.toCharArray();
            final boolean lllllllllllllIIlIlIllIlIllIIIIlI = lllllllllllllIIlIlIllIlIllIIIIll.length != 0;
            char lllllllllllllIIlIlIllIlIllIIIIIl = (char)DefaultValue.lIIllIlIIIlIII[0];
            while (llIllIIIIlIlIII(lllllllllllllIIlIlIllIlIllIIIIIl, lllllllllllllIIlIlIllIlIllIIIIlI ? 1 : 0)) {
                final char lllllllllllllIIlIlIllIlIllIIlllI = lllllllllllllIIlIlIllIlIllIIIIll[lllllllllllllIIlIlIllIlIllIIIIIl];
                lllllllllllllIIlIlIllIlIllIIlIll.append((char)(lllllllllllllIIlIlIllIlIllIIlllI ^ lllllllllllllIIlIlIllIlIllIIlIlI[lllllllllllllIIlIlIllIlIllIIlIIl % lllllllllllllIIlIlIllIlIllIIlIlI.length]));
                "".length();
                ++lllllllllllllIIlIlIllIlIllIIlIIl;
                ++lllllllllllllIIlIlIllIlIllIIIIIl;
                "".length();
                if ((0x84 ^ 0x80) != (0x63 ^ 0x67)) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIlIlIllIlIllIIlIll);
        }
        
        public String getString() {
            return this.value;
        }
        
        public void setString(final String lllllllllllllIIlIlIllIlIlllIllll) {
            this.value = lllllllllllllIIlIlIllIlIlllIllll;
        }
        
        private static boolean llIllIIIIlIlIII(final int lllllllllllllIIlIlIllIlIlIllllIl, final int lllllllllllllIIlIlIllIlIlIllllII) {
            return lllllllllllllIIlIlIllIlIlIllllIl < lllllllllllllIIlIlIllIlIlIllllII;
        }
        
        @Override
        public String toString() {
            if (llIllIIIIlIIlll(this.value)) {
                return DefaultValue.lIIllIlIIIIlll[DefaultValue.lIIllIlIIIlIII[0]];
            }
            return this.value.toString();
        }
        
        public String getName() {
            return this.name;
        }
        
        private static boolean llIllIIIIlIIlll(final Object lllllllllllllIIlIlIllIlIlIlllIlI) {
            return lllllllllllllIIlIlIllIlIlIlllIlI == null;
        }
    }
    
    private static class ValueDialog extends JDialog
    {
        private static final /* synthetic */ int[] lIllIllIIIllII;
        private static final /* synthetic */ String[] lIllIllIIIlIll;
        public /* synthetic */ boolean okPressed;
        
        private static boolean lllllllIlllIIlI(final int llllllllllllIlllllllIIllIIIIlIIl) {
            return llllllllllllIlllllllIIllIIIIlIIl != 0;
        }
        
        private static void lllllllIlllIIIl() {
            (lIllIllIIIllII = new int[11])[0] = ((98 + 90 - 186 + 129 ^ 138 + 185 - 306 + 181) & (59 + 52 + 120 + 24 ^ 168 + 4 - 121 + 135 ^ -" ".length()));
            ValueDialog.lIllIllIIIllII[1] = "  ".length();
            ValueDialog.lIllIllIIIllII[2] = " ".length();
            ValueDialog.lIllIllIIIllII[3] = (0x5B ^ 0x72 ^ (0xEB ^ 0xC6));
            ValueDialog.lIllIllIIIllII[4] = (0x5F ^ 0x55);
            ValueDialog.lIllIllIIIllII[5] = (0x2F ^ 0x2A);
            ValueDialog.lIllIllIIIllII[6] = (23 + 26 + 82 + 9 ^ 99 + 122 - 173 + 81);
            ValueDialog.lIllIllIIIllII[7] = (-(0xFFFFAA7F & 0x7FAD) & (0xFFFFBBED & 0x6F7E));
            ValueDialog.lIllIllIIIllII[8] = (0x74 ^ 0x30) + (0x77 ^ 0x2F) - (75 + 118 - 117 + 51) + (9 + 90 + 4 + 43);
            ValueDialog.lIllIllIIIllII[9] = "   ".length();
            ValueDialog.lIllIllIIIllII[10] = (0x82 ^ 0xA4 ^ (0xEB ^ 0xC5));
        }
        
        private static String lllllllIllIllll(final String llllllllllllIlllllllIIllIIIlIIII, final String llllllllllllIlllllllIIllIIIIllll) {
            try {
                final SecretKeySpec llllllllllllIlllllllIIllIIIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllllIIllIIIIllll.getBytes(StandardCharsets.UTF_8)), ValueDialog.lIllIllIIIllII[10]), "DES");
                final Cipher llllllllllllIlllllllIIllIIIlIIlI = Cipher.getInstance("DES");
                llllllllllllIlllllllIIllIIIlIIlI.init(ValueDialog.lIllIllIIIllII[1], llllllllllllIlllllllIIllIIIlIIll);
                return new String(llllllllllllIlllllllIIllIIIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllllllIIllIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllllllIIllIIIlIIIl) {
                llllllllllllIlllllllIIllIIIlIIIl.printStackTrace();
                return null;
            }
        }
        
        private static String lllllllIllIlllI(final String llllllllllllIlllllllIIllIIIllIll, final String llllllllllllIlllllllIIllIIIlllII) {
            try {
                final SecretKeySpec llllllllllllIlllllllIIllIIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllllIIllIIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlllllllIIllIIIlllll = Cipher.getInstance("Blowfish");
                llllllllllllIlllllllIIllIIIlllll.init(ValueDialog.lIllIllIIIllII[1], llllllllllllIlllllllIIllIIlIIIII);
                return new String(llllllllllllIlllllllIIllIIIlllll.doFinal(Base64.getDecoder().decode(llllllllllllIlllllllIIllIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllllllIIllIIIllllI) {
                llllllllllllIlllllllIIllIIIllllI.printStackTrace();
                return null;
            }
        }
        
        static {
            lllllllIlllIIIl();
            lllllllIlllIIII();
        }
        
        public ValueDialog(final JComponent llllllllllllIlllllllIIllIIlIlIll, final String llllllllllllIlllllllIIllIIllIIIl, final String llllllllllllIlllllllIIllIIlIlIIl) {
            this.okPressed = (ValueDialog.lIllIllIIIllII[0] != 0);
            this.setDefaultCloseOperation(ValueDialog.lIllIllIIIllII[1]);
            this.setLayout(new GridBagLayout());
            this.setModal((boolean)(ValueDialog.lIllIllIIIllII[2] != 0));
            if (lllllllIlllIIlI((llllllllllllIlllllllIIllIIlIlIll instanceof JSpinner) ? 1 : 0)) {
                ((JSpinner.DefaultEditor)((JSpinner)llllllllllllIlllllllIIllIIlIlIll).getEditor()).getTextField().setColumns(ValueDialog.lIllIllIIIllII[3]);
            }
            final JPanel llllllllllllIlllllllIIllIIlIllll = new JPanel();
            llllllllllllIlllllllIIllIIlIllll.setLayout(new GridBagLayout());
            this.getContentPane().add(llllllllllllIlllllllIIllIIlIllll, new GridBagConstraints(ValueDialog.lIllIllIIIllII[0], ValueDialog.lIllIllIIIllII[0], ValueDialog.lIllIllIIIllII[1], ValueDialog.lIllIllIIIllII[2], 1.0, 0.0, ValueDialog.lIllIllIIIllII[4], ValueDialog.lIllIllIIIllII[2], new Insets(ValueDialog.lIllIllIIIllII[0], ValueDialog.lIllIllIIIllII[0], ValueDialog.lIllIllIIIllII[0], ValueDialog.lIllIllIIIllII[0]), ValueDialog.lIllIllIIIllII[0], ValueDialog.lIllIllIIIllII[0]));
            llllllllllllIlllllllIIllIIlIllll.setBackground(Color.white);
            llllllllllllIlllllllIIllIIlIllll.setBorder(BorderFactory.createMatteBorder(ValueDialog.lIllIllIIIllII[0], ValueDialog.lIllIllIIIllII[0], ValueDialog.lIllIllIIIllII[2], ValueDialog.lIllIllIIIllII[0], Color.black));
            final JTextArea llllllllllllIlllllllIIllIIllIllI = new JTextArea(llllllllllllIlllllllIIllIIlIlIIl);
            llllllllllllIlllllllIIllIIlIllll.add(llllllllllllIlllllllIIllIIllIllI, new GridBagConstraints(ValueDialog.lIllIllIIIllII[0], ValueDialog.lIllIllIIIllII[0], ValueDialog.lIllIllIIIllII[2], ValueDialog.lIllIllIIIllII[2], 1.0, 0.0, ValueDialog.lIllIllIIIllII[4], ValueDialog.lIllIllIIIllII[2], new Insets(ValueDialog.lIllIllIIIllII[5], ValueDialog.lIllIllIIIllII[5], ValueDialog.lIllIllIIIllII[5], ValueDialog.lIllIllIIIllII[5]), ValueDialog.lIllIllIIIllII[0], ValueDialog.lIllIllIIIllII[0]));
            llllllllllllIlllllllIIllIIllIllI.setWrapStyleWord((boolean)(ValueDialog.lIllIllIIIllII[2] != 0));
            llllllllllllIlllllllIIllIIllIllI.setLineWrap((boolean)(ValueDialog.lIllIllIIIllII[2] != 0));
            llllllllllllIlllllllIIllIIllIllI.setBorder(BorderFactory.createEmptyBorder(ValueDialog.lIllIllIIIllII[0], ValueDialog.lIllIllIIIllII[0], ValueDialog.lIllIllIIIllII[0], ValueDialog.lIllIllIIIllII[0]));
            llllllllllllIlllllllIIllIIllIllI.setEditable((boolean)(ValueDialog.lIllIllIIIllII[0] != 0));
            final JPanel llllllllllllIlllllllIIllIIlIlllI = new JPanel();
            this.getContentPane().add(llllllllllllIlllllllIIllIIlIlllI, new GridBagConstraints(ValueDialog.lIllIllIIIllII[0], ValueDialog.lIllIllIIIllII[2], ValueDialog.lIllIllIIIllII[2], ValueDialog.lIllIllIIIllII[2], 1.0, 1.0, ValueDialog.lIllIllIIIllII[4], ValueDialog.lIllIllIIIllII[0], new Insets(ValueDialog.lIllIllIIIllII[5], ValueDialog.lIllIllIIIllII[5], ValueDialog.lIllIllIIIllII[0], ValueDialog.lIllIllIIIllII[5]), ValueDialog.lIllIllIIIllII[0], ValueDialog.lIllIllIIIllII[0]));
            llllllllllllIlllllllIIllIIlIlllI.add(new JLabel(String.valueOf(new StringBuilder().append(llllllllllllIlllllllIIllIIllIIIl).append(ValueDialog.lIllIllIIIlIll[ValueDialog.lIllIllIIIllII[0]]))));
            "".length();
            llllllllllllIlllllllIIllIIlIlllI.add(llllllllllllIlllllllIIllIIlIlIll);
            "".length();
            final JPanel llllllllllllIlllllllIIllIIlIllIl = new JPanel();
            this.getContentPane().add(llllllllllllIlllllllIIllIIlIllIl, new GridBagConstraints(ValueDialog.lIllIllIIIllII[0], ValueDialog.lIllIllIIIllII[1], ValueDialog.lIllIllIIIllII[1], ValueDialog.lIllIllIIIllII[2], 0.0, 0.0, ValueDialog.lIllIllIIIllII[6], ValueDialog.lIllIllIIIllII[0], new Insets(ValueDialog.lIllIllIIIllII[0], ValueDialog.lIllIllIIIllII[0], ValueDialog.lIllIllIIIllII[0], ValueDialog.lIllIllIIIllII[0]), ValueDialog.lIllIllIIIllII[0], ValueDialog.lIllIllIIIllII[0]));
            final JButton llllllllllllIlllllllIIllIIllIlIl = new JButton(ValueDialog.lIllIllIIIlIll[ValueDialog.lIllIllIIIllII[2]]);
            llllllllllllIlllllllIIllIIlIllIl.add(llllllllllllIlllllllIIllIIllIlIl);
            "".length();
            llllllllllllIlllllllIIllIIllIlIl.addActionListener(new ActionListener() {
                private static final /* synthetic */ int[] lIIIlIIIlIlIIl;
                
                static {
                    lIlllllIIllIlll();
                }
                
                private static void lIlllllIIllIlll() {
                    (lIIIlIIIlIlIIl = new int[2])[0] = " ".length();
                    EffectUtil$ValueDialog$1.lIIIlIIIlIlIIl[1] = ((137 + 84 - 161 + 165 ^ 7 + 159 - 127 + 150) & (0xB8 ^ 0xB3 ^ (0xF7 ^ 0xA0) ^ -" ".length()));
                }
                
                public void actionPerformed(final ActionEvent lllllllllllllIlIIIllIIIlIlllIIlI) {
                    ValueDialog.this.okPressed = (EffectUtil$ValueDialog$1.lIIIlIIIlIlIIl[0] != 0);
                    ValueDialog.this.setVisible((boolean)(EffectUtil$ValueDialog$1.lIIIlIIIlIlIIl[1] != 0));
                }
            });
            final JButton llllllllllllIlllllllIIllIIllIlII = new JButton(ValueDialog.lIllIllIIIlIll[ValueDialog.lIllIllIIIllII[1]]);
            llllllllllllIlllllllIIllIIlIllIl.add(llllllllllllIlllllllIIllIIllIlII);
            "".length();
            llllllllllllIlllllllIIllIIllIlII.addActionListener(new ActionListener() {
                private static final /* synthetic */ int[] llIlllIlllIIll;
                
                static {
                    lIIllIlIIIlIlIII();
                }
                
                public void actionPerformed(final ActionEvent llllllllllllIllIIlIIIIlIllIIlIlI) {
                    ValueDialog.this.setVisible((boolean)(EffectUtil$ValueDialog$2.llIlllIlllIIll[0] != 0));
                }
                
                private static void lIIllIlIIIlIlIII() {
                    (llIlllIlllIIll = new int[1])[0] = ((40 + 111 + 2 + 37 ^ 163 + 10 - 122 + 119) & (0x66 ^ 0x5A ^ (0x1F ^ 0x37) ^ -" ".length()));
                }
            });
            this.setSize(new Dimension(ValueDialog.lIllIllIIIllII[7], ValueDialog.lIllIllIIIllII[8]));
        }
        
        private static void lllllllIlllIIII() {
            (lIllIllIIIlIll = new String[ValueDialog.lIllIllIIIllII[9]])[ValueDialog.lIllIllIIIllII[0]] = lllllllIllIlllI("LedhltYUdfg=", "eQbYY");
            ValueDialog.lIllIllIIIlIll[ValueDialog.lIllIllIIIllII[2]] = lllllllIllIllll("EjVHaWFQP1E=", "HJHxu");
            ValueDialog.lIllIllIIIlIll[ValueDialog.lIllIllIIIllII[1]] = lllllllIllIllll("swA0Xb6+Ytk=", "kNZUX");
        }
    }
}
