 import java.awt.*;
 import java.awt.event.*;
 public class Aquarium extends Frame
 {
       Image aquariumImage,memoryImage;
       Graphics memoryGraphics;
       Image[] fishImages=new Image[2];
       MediaTracker tracker;
       Aquarium()
       {
        setSize(aquariumImage.getWidth(this),aquariumImage.getheight(this));
        setResizable(false);
        setVisible(true);
        memoryImage=createImage(getSize(),width,getSize(),height);
        memoryGraphics=memoryImage.getGraphics();
        this.addWindowListener(new WindowAdapter(){
            public void windowclosing(
                WindowEvent windowEvet){
                    System.exit(0);
                }
            }
        );
       }
 
    }