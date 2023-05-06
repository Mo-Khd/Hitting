package Hitting;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Start
{
	
	static JFrame f;
	
	public static void main(String [] args)
	{
		
	begin();
	
	
	}


	public static void begin(){
		
		f=new JFrame("Hit me hit you");
		
		Donthit p = new Donthit();
		f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		f.setContentPane(p);
		f.setLocation (350,100);
		f.setSize(516,538);
		f.setVisible(true);
		f.setResizable(false);
		
		JMenuBar menuBar = new JMenuBar();
	
        JMenu menu = new JMenu("Menu");
        JMenu help = new JMenu("Help");
        
        KeyStroke ctrlH = KeyStroke.getKeyStroke(KeyEvent.VK_H, Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask());
        KeyStroke ctrlE = KeyStroke.getKeyStroke(KeyEvent.VK_E, Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask());
        
        menuBar.add(menu);
        menuBar.add(help);
        
        JMenuItem exit = new JMenuItem("Exit");
        JMenuItem info = new JMenuItem("Help");
        JMenuItem about = new JMenuItem("About");
        
        
        exit.setMnemonic('e');
        exit.setAccelerator(ctrlE);
        
        info.setMnemonic('h');
        info.setAccelerator(ctrlH);
        
        exit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        info.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            	p.pause=true;
                JOptionPane.showMessageDialog(null, "Use your pointer to move the mouse , you must not hit the frame and cats." + "\nAfter 5 seconds one cat will be created, when time reach 10 seconds another will be created, \nthen every 10 seconds one cat will be created until it reaches 6 cats....\n" +"\n" + 
            	"Ctrl : to create a bomb , you have 1 bomb every 6 seconds for 4 seconds then it will be disapeared .\nWhen a cat knocked itself to the bomb , then the cat will be disapeared for 5 seconds\n"+"\nP: Pause"+ "\n" + "R: Resume"+ "\n" + "M: Mute"+ "\n" + "V: Sound");
                
            }
        });
        
        about.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            	p.pause=true;
                JOptionPane.showMessageDialog(null, "Coded By Mohamed Azhy");
                
            }
        });
        
        exit.setIcon(UIManager.getIcon("OptionPane.errorIcon"));
        
        try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        menu.add(exit);
        help.add(info);
        help.addSeparator();
        help.add(about);
        f.setJMenuBar(menuBar);
	        
}

}
