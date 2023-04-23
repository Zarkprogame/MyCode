package Vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JProgressBar;
import javax.swing.plaf.basic.BasicProgressBarUI;

public class ProgressBarCustom extends JProgressBar{

    /**
     * @return the colorSring
     */
    public Color getColorSring() {
        return colorSring;
    }

    public void setColorSring(Color colorSring) {
        this.colorSring = colorSring;
    }
    
    private Color colorSring = new Color(200,200,200);
    
    public ProgressBarCustom(){
        
        setBackground(new Color(255,255,255));
        setForeground(new Color(0,0,0));
        
        setUI(new BasicProgressBarUI(){
            protected void paintString(Graphics g,int i,int i1,int i2,int i3,int i4, Insets insets){
                g.setColor(getColorSring());
               super.paintString(g, i, i1, i2, i3, i4, insets);
           }
        });
        
        
        
    }
    
}
