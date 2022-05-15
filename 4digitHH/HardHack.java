import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;

public class HardHack {
    public static void main(String[] args) throws IOException, AWTException{
        //JFrame kun til at lukke programmet :D
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FileReader fr = new FileReader("result.txt");
        Scanner input = new Scanner(fr);
        Robot r = new Robot();

        delay(5000);
        while(input.hasNext()){
            String line = input.nextLine();
            String characters[] = line.split("");
            delay(10);
            for(String i: characters){
                if(Integer.parseInt(i)==0){r.keyPress(KeyEvent.VK_0); };
                if(Integer.parseInt(i)==1){r.keyPress(KeyEvent.VK_1); };
                if(Integer.parseInt(i)==2){r.keyPress(KeyEvent.VK_2); };
                if(Integer.parseInt(i)==3){r.keyPress(KeyEvent.VK_3); };
                if(Integer.parseInt(i)==4){r.keyPress(KeyEvent.VK_4); };
                if(Integer.parseInt(i)==5){r.keyPress(KeyEvent.VK_5); };
                if(Integer.parseInt(i)==6){r.keyPress(KeyEvent.VK_6); };
                if(Integer.parseInt(i)==7){r.keyPress(KeyEvent.VK_7); };
                if(Integer.parseInt(i)==8){r.keyPress(KeyEvent.VK_8); };
                if(Integer.parseInt(i)==9){r.keyPress(KeyEvent.VK_9); };
            }
            r.keyPress(KeyEvent.VK_ENTER);
        }
        input.close();
    }
    static void delay(int ms) {
        long timedelay = System.currentTimeMillis() + ms;
        while(timedelay > System.currentTimeMillis()){}
    }
}
