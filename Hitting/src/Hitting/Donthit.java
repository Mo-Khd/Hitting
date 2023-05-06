package Hitting;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Donthit extends JPanel {
		
		
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
		static double st=0;
		static double s0=0,s=0,s1=0;
		static int m=0;
		static Rectangle2D.Double rec;
		static Rectangle2D.Double rec1;
		static Rectangle2D.Double rec2;
		static Rectangle2D.Double rec3;
		static Rectangle2D.Double rec4;
		static Rectangle2D.Double rec5;
		static Rectangle2D.Double rec6;
		static Rectangle2D.Double srec;
		static Rectangle2D.Double srec1;
		static Rectangle2D.Double srec2;
		static Rectangle2D.Double srec3;
		static Rectangle2D.Double t_rec1;
		static Rectangle2D.Double t_rec2;
		static Rectangle2D.Double t_rec3;
		static Rectangle2D.Double t_rec4;
		static Rectangle2D.Double t_rec5;
		static Rectangle2D.Double t_rec6;
		static int x=0;
		int y=0;
		double t_xx=0,t_yy=0;
		static int sx=-100;
		static int sy=-100;
		static int sx1=-42;
		static int sy1=-42;
		static int sx2=12;
		static int sy2=-42;
		static int sx3=-42;
		static int sy3=12;
		static int x1=0;
		static int y1=400;
		static int x2=400;
		static int y2=0;
		static int x3=400;
		static int y3=400;
		static int x4=230;
		static int y4=0;
		static int x5=0;
		static int y5=230;
		static int sdisX=10;
		static int sdisY=10;
		static int s1disX=10;
		static int s1disY=10;
		static int s2disX=10;
		static int s2disY=10;
		static int s3disX=10;
		static int s3disY=10;
		static int disX=10;
		static int disY=10;
		static int disX1=10;
		static int disY1=10;
		static int disX2=10;
		static int disY2=10;
		static int disX3=10;
		static int disY3=10;
		static int disX4=10;
		static int disY4=10;
		static int disX5=10;
		static int disY5=10;
		static double xx=230, yy=230;
		boolean create=true;
		BufferedImage img;
		Timer t1=new Timer(5000,new TimerListener1());
		Timer t2=new Timer(5000,new TimerListener2());
		Timer t3=new Timer(5000,new TimerListener3());
		Timer t4=new Timer(5000,new TimerListener4());
		Timer t5=new Timer(5000,new TimerListener5());
		Timer t6 = new Timer(5000,new TimerListener6());
		
		Timer tcreate = new Timer(4000,new TimerListener7());
		
		static int tri;
		Color co= Color.GREEN;
		boolean pause=false;
		String cc,c;
		int mute=0;
		int k=0;
		boolean rec1Visible=true;
		boolean rec2Visible=true;
		boolean rec3Visible=true;
		boolean rec4Visible=true;
		boolean rec5Visible=true;
		boolean rec6Visible=true;
		
		public void paintComponent(Graphics g)
		{
			
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D)g;
			setBackground(Color.BLACK);
			
			rec= new Rectangle2D.Double(xx,yy,40,40);
			if(rec1Visible)
			rec1 = new Rectangle2D.Double (x,y,40,40);
			if(!rec1Visible)
			rec1 = new Rectangle2D.Double (0,0,0,0);
			
			rec2 = new Rectangle2D.Double (0,0,0,0);
			rec3 = new Rectangle2D.Double (0,0,0,0);
			rec4 = new Rectangle2D.Double (0,0,0,0);
			rec5 = new Rectangle2D.Double (0,0,0,0);
			rec6 = new Rectangle2D.Double (0,0,0,0);
			srec = new Rectangle2D.Double (0,0,0,0);
			srec1 = new Rectangle2D.Double (0,0,0,0);
			srec2 = new Rectangle2D.Double (0,0,0,0);
			srec3 = new Rectangle2D.Double (0,0,0,0);
			
			t_rec1 = new Rectangle2D.Double (0,0,0,0);
			t_rec2 = new Rectangle2D.Double (0,0,0,0);
			t_rec3 = new Rectangle2D.Double (0,0,0,0);
			t_rec4 = new Rectangle2D.Double (0,0,0,0);
			t_rec5 = new Rectangle2D.Double (0,0,0,0);
			t_rec6 = new Rectangle2D.Double (0,0,0,0);
			
			
			
			try 
			{ 
				//if((int)xx==230&&(int)yy==230&&s==0)
				img = ImageIO.read(new File("mouseleft.png"));
			g2d.drawImage(img, (int)xx, (int)yy,40,40,null);
			
		
			}
			
			catch (Exception ex){ ex.printStackTrace(); } 
			
			try 
			{ 
			img = ImageIO.read(new File("catup.png"));
			
			if(rec1Visible)
			g2d.drawImage(img, x-3, y,44,41,null);
			if(!rec1Visible)
			g2d.drawImage(null, 0, 0,0,0,null);
		
			}
			
			catch (Exception ex){ ex.printStackTrace(); } 
			
			MouseListeners h=new MouseListeners();
			addMouseMotionListener(h);
			key hh=new key();
			addKeyListener(hh);
			
				if(create){
								sx=-100;
								sy=-100;
					
								}
				
				if(pause)
					tcreate.stop();
				else tcreate.start();
				
					srec = new Rectangle2D.Double (sx,sy,10,10);
					
					try 
					{ 
						
						img = ImageIO.read(new File("1.gif"));
					g2d.drawImage(img, sx, sy,10,10,null);
					
				
					}
					
					catch (Exception ex){ ex.printStackTrace(); } 
					
					//srec1 = new Rectangle2D.Double (xx-sx1,yy-sy1,10,10);
					//srec2 = new Rectangle2D.Double (xx-sx2,yy-sy2,10,10);
					//srec3 = new Rectangle2D.Double (xx-sx3,yy-sy3,10,10);
					

					 addKeyListener(new KeyListener(){

							@Override
							public void keyPressed(KeyEvent e) {
							
								if (e.getKeyCode() == KeyEvent.VK_CONTROL){
									
									create=false;
									sx=(int)xx;
									sy=(int)yy;
									tcreate.start();
								}
									
								
							}

							@Override
							public void keyReleased(KeyEvent e) {
							
							}

							@Override
							public void keyTyped(KeyEvent e) {
								// TODO Auto-generated method stub
								
							}
							
						});
						setFocusable(true);
					 

							//System.out.print(xx-sx3);System.out.print("     ");System.out.print(yy-sy3);System.out.print("     ");System.out.print(getHeight());
							//System.out.println("");
						
							
							if(sx>getWidth()+xx||sy>getHeight()+yy){
								
								sx=12;sy=12;
								
							}
							
							if(xx-sx1>=getWidth()+650||yy-sy1>=getHeight()+650){
								sx1=-42;sy1=-42;
							}
							
							if(xx-sx2>=getWidth()+600||yy-sy2>=getHeight()+600){
								sx2=12;sy2=-42;
							}
							
							if(xx-sx3>getWidth()+600||yy-sy3>getHeight()+600){
								sx3=-42;sy3=12;
							}
							
				
			if(!pause){
			st=st+2.92;
			
			
			
			if(st>=8.90){
				st=0;
				s0=s0+1.2;
			}
			if(s0>=9){
				s0=0;
				s++;
			}
			
			if(s>9.9){
				s=0;
				s1++;
				
			}
			if(s1>5){
				s1=0;
				m++;
			}
			
			}
			
			
			
			if(s>=5||s1>0||m>0){
				if(s==5&&s<6&&s1==0){
					
					if(s0==0&&st==0){
						if(mute==0)
					Sound.lup.play();
					}
				g2d.setColor(Color.BLUE);
				g2d.setFont(new Font("Verdana", Font.BOLD, 40));
				g2d.drawString("Level UP", 150, 260);
				}
				
				if(rec2Visible==true)
					rec2 = new Rectangle2D.Double (x1,y1,40,40);
				if(rec2Visible==false)
					rec2 = new Rectangle2D.Double (0,0,0,0);
				
			
				try 
				{ 
				img = ImageIO.read(new File("catup.png"));
				
				if(rec2Visible)
				g2d.drawImage(img, x1-3, y1,44,41,null);
				if(!rec2Visible)
				g2d.drawImage(null, 0, 0,0,0,null);
			
				}
				
				catch (Exception ex){ ex.printStackTrace(); } 
			}
			
			if(s1>=1||m>0){
				
				if(s1==1&&s<1&&m==0){
					
					if(s0==0&&st==0){
						if(mute==0)
						Sound.lup.play();
					}
					g2d.setColor(Color.BLUE);
					g2d.setFont(new Font("Verdana", Font.BOLD, 40));
					g2d.drawString("Wonderful !!!!", 110, 260);
					}
				
				if(rec3Visible==true)
					rec3 = new Rectangle2D.Double (x2,y2,40,40);
				if(rec3Visible==false)
					rec3 = new Rectangle2D.Double (0,0,0,0);
				
				
				try 
				{ 
				img = ImageIO.read(new File("catup.png"));
				
				if(rec3Visible)
				g2d.drawImage(img, x2-3, y2,44,41,null);
				if(!rec3Visible)
				g2d.drawImage(null, 0, 0,0,0,null);
			
				}
				
				catch (Exception ex){ ex.printStackTrace(); } 
			}
			
			if(s1>=2||m>0){
				if(s1==2&&s<1&&m==0){
					
					if(s0==0&&st==0){
						if(mute==0)
						Sound.lup.play();
					}
					
					g2d.setColor(Color.BLUE);
					g2d.setFont(new Font("Verdana", Font.BOLD, 40));
					g2d.drawString("Wow! Imposible", 90, 260);
					}
				
				if(rec4Visible==true)
					rec4 = new Rectangle2D.Double (x3,y3,40,40);
				if(rec4Visible==false)
					rec4 = new Rectangle2D.Double (0,0,0,0);
				
				
				try 
				{ 
				img = ImageIO.read(new File("catup.png"));
				
				if(rec4Visible)
				g2d.drawImage(img, x3-3, y3,44,41,null);
				if(!rec4Visible)
				g2d.drawImage(null, 0, 0,0,0,null);
			
				}
				
				catch (Exception ex){ ex.printStackTrace(); } 
			}
			
			if(s1>=3||m>0){
				if(s1==3&&s<1&&m==0){
					
					if(s0==0&&st==0){
						if(mute==0)
						Sound.lup.play();
					}
						
					g2d.setColor(Color.BLUE);
					g2d.setFont(new Font("Verdana", Font.BOLD, 40));
					g2d.drawString("You are perfect!", 90, 260);
					}
				
				if(rec5Visible==true)
					rec5 = new Rectangle2D.Double (x4,y4,40,40);
				if(rec5Visible==false)
					rec5 = new Rectangle2D.Double (0,0,0,0);
			
				
				try 
				{ 
				img = ImageIO.read(new File("catup.png"));
				
				if(rec5Visible)
				g2d.drawImage(img, x4-3, y4,44,41,null);
				if(!rec5Visible)
				g2d.drawImage(null, 0, 0,0,0,null);
			
				}
				
				catch (Exception ex){ ex.printStackTrace(); } 
			}
			
			if(s1>=4||m>0){
				if(s1==4&&s<1&&m==0){
					
					if(s0==0&&st==0){
						if(mute==0)
						Sound.lup.play();
					}
						
					g2d.setColor(Color.BLUE);
					g2d.setFont(new Font("Verdana", Font.BOLD, 40));
					g2d.drawString("Actually Different!", 80, 260);
					}
				
				if(rec6Visible==true)
					rec6 = new Rectangle2D.Double (x5,y5,40,40);
				if(rec6Visible==false)
					rec6 = new Rectangle2D.Double (0,0,0,0);
				
				
				try 
				{ 
				img = ImageIO.read(new File("catup.png"));
				
				if(rec6Visible)
				g2d.drawImage(img, x5-3, y5,44,41,null);
				if(!rec6Visible)
				g2d.drawImage(null, 0, 0,0,0,null);
			
				}
				
				catch (Exception ex){ ex.printStackTrace(); } 
			}
			
			if(m>9){
				xx=230; yy=230;
				x1=0;y1=430;x2=430;y2=0;x3=430;y3=430;
				x4=230;y4=0;x5=0;y5=230;
				st=0;s=0;m=0;
				s0=0;s1=0;
				x=0;y=0;
				
				Start.f.setVisible(false);
				
				Start.begin();
			}
			
			
			if(rec1.getWidth()==0&&rec1.getHeight()==0){
				try 
				{
					if(s==0||s==2||s==4||s==6||s==8)
						img = ImageIO.read(new File("catdown.png"));
						if(s==1||s==3||s==5||s==7||s==9)
							img = ImageIO.read(new File("catup.png"));
						
				g2d.drawImage(img, 0, 0,44,41,null);
				
			
				}
				
				catch (Exception ex){ ex.printStackTrace(); } 
			}
			
			if(s>5&&rec2.getWidth()==0&&rec2.getHeight()==0){
				
				
				try 
				{
					if(s==0||s==2||s==4||s==6||s==8)
						img = ImageIO.read(new File("catdown.png"));
						if(s==1||s==3||s==5||s==7||s==9)
							img = ImageIO.read(new File("catup.png"));
						
				g2d.drawImage(img, 0, getHeight()-40,44,41,null);
				
			
				}
				
				catch (Exception ex){ ex.printStackTrace(); } 
				
				
				
			}
			
			if(s1>=1&&rec3.getWidth()==0&&rec3.getHeight()==0){
				
				
				try 
				{
					if(s==0||s==2||s==4||s==6||s==8)
						img = ImageIO.read(new File("catdown.png"));
						if(s==1||s==3||s==5||s==7||s==9)
							img = ImageIO.read(new File("catup.png"));
						
				g2d.drawImage(img,getWidth()-40,0,44,41,null);
				
			
				}
				
				catch (Exception ex){ ex.printStackTrace(); } 
				
				
			}
			
			if(s1>=2&&rec4.getWidth()==0&&rec4.getHeight()==0){
				
				
				try 
				{
					if(s==0||s==2||s==4||s==6||s==8)
						img = ImageIO.read(new File("catdown.png"));
						if(s==1||s==3||s==5||s==7||s==9)
							img = ImageIO.read(new File("catup.png"));
						
				g2d.drawImage(img,getWidth()-40,getHeight()-40,44,41,null);
				
			
				}
				
				catch (Exception ex){ ex.printStackTrace(); } 
				
			}
			
			if(s1>=3&&rec5.getWidth()==0&&rec5.getHeight()==0){
				
				
				try 
				{
					if(s==0||s==2||s==4||s==6||s==8)
						img = ImageIO.read(new File("catdown.png"));
						if(s==1||s==3||s==5||s==7||s==9)
							img = ImageIO.read(new File("catup.png"));
						
				g2d.drawImage(img, 230, 0,44,41,null);
				
			
				}
				
				catch (Exception ex){ ex.printStackTrace(); } 
				
				
			}
			
			if(s1>=4&&rec6.getWidth()==0&&rec6.getHeight()==0){
				
				try 
				{
					if(s==0||s==2||s==4||s==6||s==8)
						img = ImageIO.read(new File("catdown.png"));
						if(s==1||s==3||s==5||s==7||s==9)
							img = ImageIO.read(new File("catup.png"));
						
				g2d.drawImage(img, 0, 230,44,41,null);
				
			
				}
				
				catch (Exception ex){ ex.printStackTrace(); } 
				
			}
			
			if(!pause){
			recMove();
			}
			
			c=m+":"+(int)s1+""+(int)s;
			cc=":"+(int)s0+""+(int)st;
			Score max=new Score(c);
			//System.out.println(c);
			
			g2d.setColor(Color.WHITE);
			g2d.setFont(new Font("Verdana", Font.BOLD, 20));
			g2d.drawString(c+cc,15,20);
			g2d.drawString("Best= "+max.max,360,20);
			
			g2d.setColor(new Color(206,206,206));
			g2d.setFont(new Font("Verdana", Font.ITALIC, 15));
			g2d.drawString("(Ctrl+H: Help)", 400, 470);
			g2d.drawString("(Ctrl: create Bomb every 6s)", 130, 470);
			if(!pause)
				g2d.drawString("(P: Pause)", 10, 470);
			
			if(pause)
				g2d.drawString("(R: Resume)", 10, 470);
			
			
			
			if(scollision1()){
				
				rec1Visible=false;
				
				t1.start();
				
			}
			
			
			if(scollision2()){
				
				rec2Visible=false;
				t2.start();
				
			}
			
			if(scollision3()){
				
				rec3Visible=false;
				t3.start();
				
			}
			
			if(scollision4()){
				
				rec4Visible=false;
				t4.start();
				
			}
			
			if(scollision5()){
				
				rec5Visible=false;
				t5.start();
				
			}
			
			
			if(scollision6()){
				
				rec6Visible=false;
				t6.start();
				
			}
			
			
			if(		collision()||
					xx>=getWidth()-40||xx<=0||
					yy>=getHeight()-40||yy<=0)
			{
				
				
					
				Sound.gamming.stop();
				if(mute==0)
				Sound.gameover.play();
				
				tri=JOptionPane.showConfirmDialog(this,c+cc, "Do you want to try again?",JOptionPane.YES_NO_OPTION);
				if(tri==0){
					xx=230; yy=230;
					x1=0;y1=430;x2=430;y2=0;x3=430;y3=430;
					x4=230;y4=0;x5=0;y5=230;
					st=0;s=0;m=0;
					s0=0;s1=0;
					x=0;y=0;
					
					Start.f.setVisible(false);
					
					Start.begin();
					
					
				}
				else{
					
					System.exit(ABORT);
				}
			}
			
			
				
				repaint();
				
				try {
					Thread.sleep(25);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			
			
				
			
			
		}
		
		
		public boolean collision(){
			
			return 
					rec.getBounds().intersects(rec1)
					||rec.getBounds().intersects(rec2)
					||rec.getBounds().intersects(rec3)
					||rec.getBounds().intersects(rec4)
					||rec.getBounds().intersects(rec5)
					||rec.getBounds().intersects(rec6);
			
		}
		
		public boolean scollision1(){
			
			return srec.getBounds().intersects(rec1)
					||srec1.getBounds().intersects(rec1)
					||srec2.getBounds().intersects(rec1)
					||srec3.getBounds().intersects(rec1);
					
			
		}
		
		public boolean scollision2(){
			
			return srec.getBounds().intersects(rec2)
					||
					srec1.getBounds().intersects(rec2)
					||
					srec2.getBounds().intersects(rec2)
					||
					srec3.getBounds().intersects(rec2);
					
			
		}
		
		public boolean scollision3(){
			
			return srec.getBounds().intersects(rec3)
					||
					srec1.getBounds().intersects(rec3)
					||
					srec2.getBounds().intersects(rec3)
					||
					srec3.getBounds().intersects(rec3);
					
			
		}

	public boolean scollision4(){
	
		return srec.getBounds().intersects(rec4)
			||
			srec1.getBounds().intersects(rec4)
			||
			srec2.getBounds().intersects(rec4)
			||
			srec3.getBounds().intersects(rec4);
			
	
	}
	
	public boolean scollision5(){
		
		return srec.getBounds().intersects(rec5)
				||
				srec1.getBounds().intersects(rec5)
				||
				srec2.getBounds().intersects(rec5)
				||
				srec3.getBounds().intersects(rec5);
				
		
	}
	
	public boolean scollision6(){
		
		return srec.getBounds().intersects(rec6)
				||
				srec1.getBounds().intersects(rec6)
				||
				srec2.getBounds().intersects(rec6)
				||
				srec3.getBounds().intersects(rec6);
				
		
	}
	
		
		public void srecMove(){

					
					sx=5;
					sy=5;
					
					/*sx1=sx1-s1disX;
					sy1=sy1-s1disY;
					
					sx2=sx2+s2disX;
					sy2=sy2-s2disY;
					
					sx3=sx3-s3disX;
					sy3=sy3+s3disY;*/
					
				
		}
		
		public void recMove(){
			
			
			x=x+disX;
			y=y+disY;
			if (x>getWidth()-40 || x<0 ) disX= -disX;
			if (y>getHeight()-40 || y<0) disY= -disY;
			
			
			x1=x1+disX1;
			y1=y1+disY1;
			if (x1>getWidth()-40 || x1<0 ) disX1= -disX1;
			if (y1>getHeight()-40 || y1<0) disY1= -disY1;
			
			x2=x2+disX2;
			y2=y2+disY2;
			if (x2>getWidth()-40 || x2<0 ) disX2= -disX2;
			if (y2>getHeight()-40 || y2<0) disY2= -disY2;
			
			x3=x3+disX3;
			y3=y3+disY3;
			if (x3>getWidth()-40 || x3<0 ) disX3= -disX3;
			if (y3>getHeight()-40 || y3<0) disY3= -disY3;
			
			x4=x4+disX4;
			y4=y4+disY4;
			if (x4>getWidth()-40 || x4<0 ) disX4= -disX4;
			if (y4>getHeight()-40 || y4<0) disY4= -disY4;
			
			x5=x5+disX5;
			y5=y5+disY5;
			if (x5>getWidth()-40 || x5<0 ) disX5= -disX5;
			if (y5>getHeight()-40 || y5<0) disY5= -disY5;
			
			
		}
		
		public void addNotify() {
	        super.addNotify();
	        requestFocus();
	    }
		
		class key implements KeyListener {
			
			
			
			public void keyPressed(KeyEvent e) {
				
				if(!pause){
					
				if (e.getKeyCode() == KeyEvent.VK_DOWN)
					yy=yy+0.4;
				if (e.getKeyCode() == KeyEvent.VK_UP)
					yy=yy-0.4;
				if (e.getKeyCode() == KeyEvent.VK_LEFT)
					xx=xx-0.4;
				if (e.getKeyCode() == KeyEvent.VK_RIGHT)
					xx=xx+0.4;
				}
				
				if (e.getKeyCode() == KeyEvent.VK_M){
					mute=1;
					
				}
				if (e.getKeyCode() == KeyEvent.VK_V){
					mute=0;
					
				}
				
				if (e.getKeyCode() == KeyEvent.VK_P)
					pause=true;
					
				if (e.getKeyCode() == KeyEvent.VK_R)
					pause=false;
				
				if ((e.getKeyCode() == KeyEvent.VK_R) && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0)
						&& ((e.getModifiers() & KeyEvent.ALT_MASK) != 0)){
					
					
					
					FileWriter out;
					
							try {
								out = new FileWriter("input.txt");
								out.write("0:00");
					            out.close();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
							xx=230; yy=230;
							x1=0;y1=430;x2=430;y2=0;x3=430;y3=430;
							x4=230;y4=0;x5=0;y5=230;
							st=0;s=0;m=0;
							s0=0;s1=0;
							x=0;y=0;
		        	
				}

					
			}

		    public void keyReleased(KeyEvent e) {
		    	
		    }

		    public void keyTyped(KeyEvent e) {
		    }
		}
			
		class TimerListener1 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				rec1Visible=true;
				x=0;y=0;
				t1.stop();
				
			}
			
		}
		
		class TimerListener2 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				rec2Visible=true;
				x1=0;y1=430;
				t2.stop();
				
			}
			
		}
		
		class TimerListener3 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				rec3Visible=true;
				x2=430;y2=0;
				t3.stop();
				
			}
			
		}
		
		
		class TimerListener4 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				rec4Visible=true;
				x3=430;y3=430;
				t4.stop();
				
			}
			
		}
		
		
		class TimerListener5 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				rec5Visible=true;
				x4=230;y4=0;
				t5.stop();
				
			}
			
		}
		
		
		class TimerListener6 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				rec6Visible=true;
				x5=0;y5=230;
				t6.stop();
				
			}
			
		}
		
		class TimerListener7 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				create=true;
				tcreate.stop();
			}
			
		}
		
		class MouseListeners implements MouseMotionListener{
			
			
			
			public void mouseDragged(MouseEvent e)
			{
				
			
				
			}
			public void mouseMoved(MouseEvent e)
			{
				
				try 
				{ 
					
					/*if((int)xx<=e.getX()-20&&(int)yy==e.getY()-20)
						img = ImageIO.read(new File("mouseleft.png"));
				
					if((int)xx>e.getX()&&(int)yy==e.getY())
						img = ImageIO.read(new File("mouseright.png"));
					
					if((int)xx==e.getX()-20&&(int)yy<e.getY()-20)
						img = ImageIO.read(new File("mouseup.png"));
					
					if((int)xx==e.getX()-20&&(int)yy>e.getY()-20)
						img = ImageIO.read(new File("mousedown.png"));*/
					
					/*if((int)xx<e.getX()-20&&(int)yy<e.getY()-20)
						img = ImageIO.read(new File("mouseleftup.png"));
					
					if((int)xx>e.getX()-20&&(int)yy>e.getY()-20)
						img = ImageIO.read(new File("mouserightdown.png"));
					
					if((int)xx>e.getX()-20&&(int)yy<e.getY()-20)
						img = ImageIO.read(new File("mouserightup.png"));
					
					if((int)xx<e.getX()-20&&(int)yy>e.getY()-20)
						img = ImageIO.read(new File("mouserleftdown.png"));*/
					
			
				}
				
				catch (Exception ex){ ex.printStackTrace(); } 
				
				if(!pause)
				{
					
				xx=e.getX()-20;
				yy=e.getY()-20;
				
				}
			}
			
		}


	

}
