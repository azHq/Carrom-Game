package game4;
import java.util.*;
//import java.util.Timer;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.Timer;

//import creategame.Breaker;


public class CarromGame extends JPanel implements ActionListener,KeyListener{
	
	private int player1X=350;
	private int player1Y=874;
	private int player2X;
	private int player2Y;
	
	private int ch=1,counter=0,totalpointA=0,totalpointB=0;
	
	private String team1,team2,color1,color2;
	private boolean red=false,ball1=false,ball2=false,a=false;
	
	private int totalball1=9,totalball2=9,fixed=200,fixed1=0,fixed2=0,fixed3=0,fixed4=0,fixed5=0,fixed6=0,fixed7=0,fixed8=0,fixed9=0,fixed11=0,fixed10=0;
	
	private int[] arr1= {0,0,0,0,0,0};
	private int[] arr2= {0,0,0,0,0,0};
	private int[] arr3= {0,0,0,0,0,0};
	
	private int[] brr1= {0,0,0,0,0,0};
	private int[] brr2= {0,0,0,0,0,0};
	private int[] brr3= {0,0,0,0,0,0};
	
	
	int s=0,b=0,c=0,d=0,preX=0,preY=0,m=0;
	
	
	private int[] ballvelo1X=new int[6];
	private int[] ballvelo1Y=new int[6];
	private int[] ballvelo2X=new int[6];
	private int[] ballvelo2Y=new int[6];
	private int[] ballvelo3X=new int[6];
	private int[] ballvelo3Y=new int[6];
	
	
	private int ballindex1,ballindex2,ballindex3;
	
	private int ballvelo4X;
	private int ballvelo4Y;
	private int ballvelo5X;
	private int ballvelo5Y;
	
	
	
	
	private int[] stikeX= {-8,0,8,6,-5,-6,6,5,-8,-9,5,7,-8,-9,3,6,3,-8,7,5,9,6,8,7,-4,6,8,-9,8,-5};
	private int[] stikeY= {0,6,0,-7,-8,9,-5,-2,-6,-3,5,-7,2,-6,9,-6,-7,3,-9,8,-4,5,6,-7,8,-6,8,9,-9,8};
	
	private int index1,index2,index3,index4,index5,index6,index7,index8,index9,index10,index11;
	
	
	private int trans1X,trans1Y,trans2X,trans2Y,trans3X,trans3Y,trans4X,trans4Y,trans5X,trans5Y,trans6X,trans6Y,trans7X,trans7Y,trans8X,trans8Y,trans9X,trans9Y,trans10X,trans10Y;
	
	private boolean flag=true,check=false,redintersect=false;
	
	private int redveloX;
	private int redveloY;
	
	private int veloX,veloY;
	
	
	
	private int increasePosX;
	private int increasePosY;
	
	
	private int delay=9,n,f=0;
	private Timer timer;
	
	private int[] arr1X;
	private int[] arr1Y;
	private int[] arr2X;
	private int[] arr2Y;
	
	private int[] pointX;
	private int[] pointY;
	
	private  int h=485,h1=470,h2=482;
	private  int k=480,k1=465,k2=483;
	private  int r=100,r1=70,r2=30,r3=58;
	
	private boolean play=false;
	private boolean intersect1=false;
	private boolean intersect2=false;
	private boolean intersect3=false,intersect4=false,intersect5=false,intersect6=false,intersect7=false,intersect8=false,intersect9=false,intersect10=false;
	
	private int redposX=470,redposY=467;
	
	private int[] a1;
	private int[] a2;
	private int[] a3;
	private int[] a4;
	
	private int[] a5;
	private int[] a6;
	private int[] a7;
	private int[] a8;
	
	private int[] a9;
	private int[] a10;
	private int[] a11;
	private int[] a12;
	
	int[] ballX={462,490,498,476,450,443};
	int[] ballY={438,444,472,494,486,459};
	
	private int[] ballX1={414,429,455,486,510,526};
	private int[] ballY1;
	
	private int[] ballX2;
	private int[] ballY2;
	
	//private int[] ball2X={
	//private int[] ball2Y={
	
	
	Scanner input=new Scanner(System.in);
	
	public CarromGame() {
		// TODO Auto-generated constructor stub
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		int control=0;
		timer=new Timer(delay,this);
		timer.start();
		
		arr1X=new int[15];
		arr1Y=new int[15];
		
		arr2X=new int[15];
		arr2Y=new int[15];
		
		pointX=new int[1000];
		pointY=new int[1000];
		
		//System.out.println("I AM azaz");
		
		a1=new int[1000];
		a2=new int[1000];
		a3=new int[1000];
		a4=new int[1000];
		
		a5=new int[1000];
		a6=new int[1000];
		a7=new int[1000];
		a8=new int[1000];
		
		a9=new int[1000];
		a10=new int[1000];
		a11=new int[1000];
		a12=new int[1000];
		
		//ballX1=new int[6];
		ballX2=new int[6];
		ballY1=new int[6];
		ballY2=new int[6];
		
		
		for(int i=0;i<1000;i++) {
			
			pointX[i]=i+1;
			pointY[i]=i+1;
			
		}

		
		arr1X[0]=400;
		arr1Y[0]=400;
		arr2X[0]=300;
		arr2Y[0]=300;
		
		
		
		//input taking
		
		Scanner scr=new Scanner(System.in);
		
		//	team1=scr.nextLine();
		//	team2=scr.nextLine();
			
			//color1=scr.nextLine();
			//color2=scr.nextLine();		
		
		
		
		redveloX=9;//scr.nextInt();
		redveloY=-9;//scr.nextInt();
		
		//create a circle
		
		for(int i=h-r;i<=h+r;i++) {
			
			a1[i]=i;
			a2[i]=(int)(Math.sqrt(Math.pow(r,2)-Math.pow((i-h),2))+k);
			//System.out.println(X);
			
			
		}
		for(int i=h-r;i<=h+r;i++) {
			//Random rand=new Random();
			//X=rand.nextInt(800);
			
			a3[i]=a1[i];
			a4[i]=k-Math.abs(k-a2[i]);
			
		}
		
		
		for(int i=h-r1;i<=h+r1;i++) {
			
			a5[i]=i;
			a6[i]=(int)(Math.sqrt(Math.pow(r,2)-Math.pow((i-h),2))+k);
			//System.out.println(X);
			
			
		}
		for(int i=h-r1;i<=h+r1;i++) {
			//Random rand=new Random();
			//X=rand.nextInt(800);
			
			a7[i]=a1[i];
			a8[i]=k-Math.abs(k-a2[i]);
			
		}
		
		
		for(int i=h2-r2;i<=h2+r2;i++) {
			
			a9[i]=i;
			a10[i]=(int)(Math.sqrt(Math.pow(r2,2)-Math.pow((i-h2),2))+k2);
			//System.out.println(X);
			
			
		}
		for(int i=h2-r2;i<=h2+r2;i++) {
			//Random rand=new Random();
			//X=rand.nextInt(800);
			
			a11[i]=a9[i];
			a12[i]=k2-Math.abs(k2-a10[i]);
			
		}
		
		
		
		//ball
		//int x=h1-r3;
		for(int i=0;i<6;i++) {
			
			//ballX1[i]=x;
			ballY1[i]=(int)(Math.sqrt(Math.pow(r3,2)-Math.pow((ballX1[i]-h1),2))+k1);
			
			//x=x+25;
			
		}
		for(int i=0;i<6;i++) {
			
			
			ballX2[i]=ballX1[i];
			ballY2[i]=k1-Math.abs(k1-ballY1[i]);
			
		}
		//Scanner input=new Scanner(System.in);
		
		
		
	}
	public void paint(Graphics g) {
		
		g.setColor(Color.black);
		g.fillRect(1,1,965,1000);
		
		
		
		g.setColor(Color.white);
		g.fillOval(5,5,60,60);
		
		g.setColor(Color.white);
		g.fillOval(902,5,60,60);
		
		g.setColor(Color.white);
		g.fillOval(5,903,60,60);
		
		g.setColor(Color.white);
		g.fillOval(902,903,60,60);

		//1
		g.setColor(Color.blue);
		g.fillRect(1,1,15,1000);
		g.setColor(Color.red);
		g.fillRect(15,1,8,1000);
		//2
		g.setColor(Color.blue);
		g.fillRect(952,1,15,1000);
		g.setColor(Color.red);
		g.fillRect(944,1,8,1000);
		//3
		g.setColor(Color.blue);
		g.fillRect(1,1,1000,15);
		g.setColor(Color.red);
		g.fillRect(1,15,1000,8);
		//4
		g.setColor(Color.blue);
		g.fillRect(1,950,1000,15);
		g.setColor(Color.red);
		g.fillRect(1,943,1000,8);
		
		
		//stroke
		
		g.setColor(Color.blue);
		g.fillRect(63,63,2,840);
		g.setColor(Color.blue);
		g.fillRect(75,75,2,815);

		g.setColor(Color.red);
		g.fillOval(63,63,10,10);
		
		
		
		g.setColor(Color.blue);
		g.fillRect(900,63,2,840);
		g.setColor(Color.blue);
		g.fillRect(888,75,2,815);
		
		g.setColor(Color.red);
		g.fillOval(895,62,10,10);
		
		
		g.setColor(Color.blue);
		g.fillRect(69,63,828,2);
		g.setColor(Color.blue);
		g.fillRect(75,75,815,2);
		
		g.setColor(Color.red);
		g.fillOval(62,892,10,10);
		
		
		g.setColor(Color.blue);
		g.fillRect(70,900,835,2);
		g.setColor(Color.blue);
		g.fillRect(75,888,815,2);
		
		g.setColor(Color.red);
		g.fillOval(895,892,10,10);
		
		
		
		g.setColor(Color.red);
		g.fillOval(redposX,redposY,29,29);
		
		
		
		
		for(int i=65;i<900;i++) {
			
		
			g.setColor(Color.red);
			g.fillRect(pointX[i],pointY[i],1,1);
		}
		for(int i=65;i<900;i++) {
			
			
			g.setColor(Color.red);
			g.fillRect(965-pointX[i],pointY[i],1,1);
		}
		
		n=1;
		for(int i=h-r;i<=h+r;i++) {
			
			 g.setColor(Color.green);

			g.fillRect(a1[i],a2[i],2,2);
			//System.out.println("azaz"+arr1[i]+","+arr2[i]);
			if(n>=5) n=0;
			else n++;
		}
		
		n=1;
		for(int i=h-r;i<=h+r;i++) {
			
			 g.setColor(Color.blue);
			 
			 g.fillRect(a3[i],a4[i],2,2);
			//System.out.println("azaz"+arr3[i]+","+arr4[i]);
			if(n>=5) n=0;
			else n++;
		}
		for(int i=h-r1;i<=h+r1;i++) {
			
			 g.setColor(Color.blue);

			g.fillRect(a5[i],a6[i],2,2);
			//System.out.println("azaz"+arr1[i]+","+arr2[i]);
			
		}
		
		n=1;
		for(int i=h-r1;i<=h+r1;i++) {
			
			 g.setColor(Color.green);
			 
			 g.fillRect(a7[i],a8[i],2,2);
			//System.out.println("azaz"+arr3[i]+","+arr4[i]);
			
		}
		
		
		for(int i=h2-r2;i<=h2+r2;i++) {
			
			 g.setColor(Color.blue);

			g.fillRect(a9[i],a10[i],2,2);
			//System.out.println("azaz"+arr1[i]+","+arr2[i]);
			
		}
		
		n=1;
		for(int i=h2-r2;i<=h2+r2;i++) {
			
			 g.setColor(Color.red);
			 
			 g.fillRect(a11[i],a12[i],2,2);
			//System.out.println("azaz"+arr3[i]+","+arr4[i]);
			
		}
		
		
		for(int i=h-r2;i<=h+r2;i++) {
			
			 g.setColor(Color.blue);

			g.fillRect(a9[i],a10[i],2,2);
			//System.out.println("azaz"+arr1[i]+","+arr2[i]);
			
		}
		
		
		//ball
		n=1;
		/*for(int i=0;i<6;i++) {
			
			if(i==1&&ch!=0) g.setColor(Color.green);
			else if(i==3) g.setColor(Color.green);
			else if(i==5) g.setColor(Color.green);
			else g.setColor(Color.blue);
		
			
			g.fillOval(ballX1[i],ballY1[i],29,29);
			//System.out.println("azaz"+arr3[i]+","+arr4[i]);
			
			//System.out.println(ballX1[i]+"   1");
			 n++;
			
		}*/
		for(int i=0;i<6;i++) {
			
			if(i==0) g.setColor(Color.green);
			else if(i==4) g.setColor(Color.green);
			else if(i==2) g.setColor(Color.green);
			else  g.setColor(Color.blue);

			g.fillOval(ballX2[i],ballY2[i],29,29);
			//System.out.println("azaz"+arr1[i]+","+arr2[i]);
			//System.out.println(ballX1[i]+"   2");
		}
		
		for(int i=0;i<6;i++) {
			
			if(i==1) g.setColor(Color.green);
			else if(i==3) g.setColor(Color.green);
			else if(i==5) g.setColor(Color.green);
			else g.setColor(Color.blue);
		
			
			g.fillOval(ballX[i],ballY[i],29,29);
			//System.out.println("azaz"+arr3[i]+","+arr4[i]);
			 n++;
			
		}
		
		
		g.setColor(Color.yellow);
		g.fillOval(player1X,player1Y,40,40);
		
		
		//ball1
		/*g.setColor(Color.blue);
		g.fillOval(ballX[0],ballY[0],29,29);
		
		g.setColor(Color.green);
		g.fillOval(ballX[1],ballY[1],29,29);
		
		g.setColor(Color.blue);
		g.fillOval(ballX[2],ballY[2],29,29);
		
		g.setColor(Color.green);
		g.fillOval(ballX[3],ballY[3],29,29);
		
		g.setColor(Color.blue);
		g.fillOval(ballX[4],ballY[4],29,29);
		
		g.setColor(Color.green);
		g.fillOval(ballX[5],ballY[5],29,29);*/
		
		g.setColor(Color.red);
		
		g.setFont(new Font("serif",Font.BOLD,20));
		g.drawString(team1+"'s Total ball:"+totalball1,200,400);
		
		g.setFont(new Font("serif",Font.BOLD,20));
		g.drawString(team2+"'s Total ball:"+totalball2,600,400);
		
		gameOver((Graphics)g);
		
	}
	public void gameOver(Graphics g) {
		
		if(totalball1<=0&&red==true) {
			
			play=false;
			g.setColor(Color.red);
			g.setFont(new Font("serif",Font.BOLD,20));
			g.drawString("Team 2 won the game",470,467);
			
		}
		
		if(totalball2<=0&&red==true) {
			
			play=false;
			g.setColor(Color.red);
			g.setFont(new Font("serif",Font.BOLD,20));
			g.drawString("Team 1 won the game",470,467);
			
		}
		
	}
	
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

		
	}
	int p=1,x=0,control=0;
	@Override
	public void keyPressed(KeyEvent e) {
		
		// TODO Auto-generated method stub
		
		if(e.getKeyCode()==KeyEvent.VK_ALT) {
			
			
			//redveloX=input.nextInt();
			
			//redveloY=input.nextInt();
			
			
		}
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			
			
			A:for(int i=0;i<6;i++) {
				
				for(int j=0;j<6;j++) {
				
					if(new Rectangle(ballX[i],ballY[i],30,30).intersects(new Rectangle(ballX[j],ballY[j],30,30))&&i!=j&&p>0) {
			
							arr3[i]=0;
							arr3[j]=0;
							
					}
				}
			
			
			
			for(int j=0;j<6;j++) {
				
				if(new Rectangle(ballX1[i],ballY1[i],29,29).intersects(new Rectangle(ballX1[j],ballY1[j],29,29))&&i!=j&&p>0) {
					
					
					arr1[i]=0;
					arr1[j]=0;
			
					
					//ballX1[i]+=20;
					
					
				}
			}
			
			for(int j=0;j<6;j++) {
				
				if(new Rectangle(ballX2[i],ballY2[i],29,29).intersects(new Rectangle(ballX2[j],ballY2[j],29,29))&&i!=j&&p>0) {
					
					
					arr2[i]=0;
					arr2[j]=0;
			
					
					//ballX1[i]+=20;
					
					
				}
			}
			
			for(int j=0;j<6;j++) {
				
				if(new Rectangle(ballX1[i],ballY1[i],29,29).intersects(new Rectangle(ballX[j],ballY[j],29,29))&&i!=j&&p>0) {
					
					
					brr3[j]=0;
					brr1[i]=0;
			
					
					//ballX1[i]+=20;
					
					
				}
			}
			
			
			for(int j=0;j<6;j++) {
				
				if(new Rectangle(ballX[i],ballY[i],29,29).intersects(new Rectangle(ballX2[j],ballY2[j],29,29))&&i!=j&&p>0) {
					
					
					brr2[j]=0;
					brr3[i]=0;
			
					
					//ballX1[i]+=20;
					
					
				}
			}
			
		}
			
			
			
			play=true;
			f=0;
			control=0;
			
			p++;
			
			
		}
	if(e.getKeyCode()==KeyEvent.VK_CONTROL) {
		
		control=1;
		
	}
		int temp1,temp2,temp3,temp4;
		//n=0;
		if(e.getKeyCode()==KeyEvent.VK_RIGHT&&control==1) {
			
			temp3=ballX1[0];
			temp4=ballY1[0];
			for(int i=0;i<5;i++) {
				temp1=ballX1[i+1];
				temp2=ballY1[i+1];	
				ballX1[i+1]=temp3;
				ballY1[i+1]=temp4;
				
				temp3=temp1;
				temp4=temp2;
				
			//	System.out.println("bablu");
				
				
			}
			
			
			
			for(int i=6;i>0;i--) {
				
				temp1=ballX2[i-1];
				temp2=ballY2[i-1];	
				ballX2[i-1]=temp3;
				ballY2[i-1]=temp4;
				
				temp3=temp1;
				temp4=temp2;
				
				
			}
		
			ballX1[0]=temp3;
			ballY1[0]=temp4;
			
			

			
			
		}

		if(e.getKeyCode()==KeyEvent.VK_LEFT&&control==1) {

			
		temp3=ballX[0];
		temp4=ballY[0];
		for(int i=0;i<5;i++) {
			
			temp1=ballX[i+1];
			temp2=ballY[i+1];	
			ballX[i+1]=temp3;
			ballY[i+1]=temp4;
			
			temp3=temp1;
			temp4=temp2;
			
			
		}
		
		ballX[0]=temp3;
		ballY[0]=temp4;

		}
		
		
		
		
	
		
	
	
		
		if(e.getKeyCode()==KeyEvent.VK_SHIFT) {
			flag=false;
			play=false;
			f=1;
			
			control=0;
			//down
			if(/*player1X>55&&player1Y>=865&&*/p==1) {
				
				player1X=875;
				player1Y=390;
				
				
			}
			//up
			else if(/*player1X<=870&&player1Y<=70&&*/p==3) {
				
				player1X=52;
				player1Y=390;
			
			}
			//left
			else if(/*player1X<=60&&player1Y<=870&*/p==4) {
				
				player1X=390;
				player1Y=875;
			
			}
			//2right
			else if(/*player1X>=800&&player1Y<=875&&*/p==2) {
				
			
				player1X=390;
				player1Y=51;
				
		}
			
			if(p>=4 ) p=1;
			else p++;	
		if(x<30) {
			redveloX=5; //stikeX[x];
			redveloY=-5;  //stikeY[x];
			fixed=300;
			if(Math.abs(redveloX)==1) fixed=200;
			else if(Math.abs(redveloX)==2) fixed=290;
			else if(Math.abs(redveloX)==3) fixed=150;
			else if(Math.abs(redveloX)==4) fixed=250;
			else if(Math.abs(redveloX)==5) fixed=200;
			else if(Math.abs(redveloX)==6) fixed=180;
			else if(Math.abs(redveloX)==7) fixed=140;
			else if(Math.abs(redveloX)==8) fixed=160;
			else if(Math.abs(redveloX)==9) fixed=100;
			else if(Math.abs(redveloX)==10) fixed=200;
			x++;
		}
		else x=0;
	}

		
		
		if(flag) {
			
				if(e.getKeyCode()==KeyEvent.VK_RIGHT&&control==0) {
					
						if(player1X >=860) {
				
						player1X=870;
					
					}
					else {
						moveRight();
					}
				}
			
		
				
				
			
		
		
			if(e.getKeyCode()==KeyEvent.VK_LEFT&&control==0) {
		
				if(player1X <=60) {
					player1X=60;
					
				}
				else {
					moveLeft();
				}
			
			}
			
			if(e.getKeyCode()==KeyEvent.VK_UP) {
				
				player1Y=51;
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN) {
				
				
				player1Y=874;
			}
		}
		
		
		
		//shift
		else {
			f=1;
			control=0;
			if(e.getKeyCode()==KeyEvent.VK_RIGHT&&control==0) {
				
				if(player1X >=860) {
		
					player1X=870;
			
				}
				else {
					moveRight();
				}
			}
	

		
		if(e.getKeyCode()==KeyEvent.VK_LEFT&&control==0) {

			if(player1X <=60) {
				player1X=60;
				
			}
			else {
				moveLeft();
			}
		
		}
	
	
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			
			if(player1Y<82) {
				
				player1Y=60;
			}
			else {
				moveUp();
			}
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			
			if(player1Y>=855) {
				
				player1Y=870;
			}
		
			else {
				
				moveDown();
			}
			
		}
	}
		
		
	}
	public void moveRight() {
		// TODO Auto-generated method stub
		//play=true;
		if(player1Y<=65||player1Y>=870) {
			
			player1X+=30;
		}
		
		
	}
	public void moveLeft() {
		// TODO Auto-generated method stub
		//play=true;
		if(player1Y<=65||player1Y>=870) {
			
			player1X-=30;
		}
		
	}
	
	public void moveUp() {
		//play=true;
		if(player1X<=65||player1X>=870) {
			
			player1Y-=30;
		}
		
	}
	public void moveDown() {
		//play=true;
		if(player1X<=65||player1X>=870) {
			//System.out.println("azaz4");	
			
			player1Y+=30;
		}
		
		
	}
		
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		timer.start();
		if(play) {
			
			
			
			
			if(new Rectangle(15,1,8,1000).intersects(new Rectangle(player1X,player1Y,40,40))){
			
				
				redveloX=-redveloX;
				
			}
			if(new Rectangle(944,1,8,1000).intersects(new Rectangle(player1X,player1Y,40,40))){
			
				redveloX=-redveloX;
				
			}
			
			if(new Rectangle(1,15,1000,8).intersects(new Rectangle(player1X,player1Y,40,40))){
			
				redveloY=-redveloY;
				
			}
			if(new Rectangle(1,943,1000,8).intersects(new Rectangle(player1X,player1Y,40,40))){
				
				redveloY=-redveloY;
				
			}
			
			
		/*	for(int i=0;i<6;i++) {
				//1
				if(new Rectangle(ballX1[i],ballY1[i],29,29).intersects(new Rectangle(15,1,8,1000))){
					
					ballvelo1X=-ballvelo1X;
					
					System.out.println("Hi 1");
					
				}
				//2
				if(new Rectangle(ballX1[i],ballY1[i],29,29).intersects(new Rectangle(944,1,8,1000))){
					
					ballvelo1X=-ballvelo1X;
					
					System.out.println("Hi 2");
					
				}
				//3
				if(new Rectangle(ballX1[i],ballY1[i],29,29).intersects(new Rectangle(1,15,1000,8))){
					
					
					ballvelo1Y=-ballvelo1Y;
					System.out.println("Hi 3");
					
				}
				//4
				if(new Rectangle(ballX1[i],ballY1[i],29,29).intersects(new Rectangle(1,943,1000,8))){
					
					System.out.println("Hi 4");
					ballvelo1Y=-ballvelo1Y;
					
				}
				
				
				
				//1
				if(new Rectangle(ballX2[i],ballY2[i],29,29).intersects(new Rectangle(15,1,8,1000))){
					
					ballvelo2X=-ballvelo2X;
					
					//System.out.println("Hi 4");
					
				}
				//2
				if(new Rectangle(ballX2[i],ballY2[i],29,29).intersects(new Rectangle(944,1,8,1000))){
					
					ballvelo2X=-ballvelo2X;
					//System.out.println("Hi 5");
					
				}
				//3
				if(new Rectangle(ballX2[i],ballY2[i],29,29).intersects(new Rectangle(1,15,1000,8))){
					
					
					ballvelo2Y=-ballvelo2Y;
					System.out.println("Hi 5");
					
				}
				//4
				if(new Rectangle(ballX2[i],ballY2[i],29,29).intersects(new Rectangle(1,943,1000,8))){
					
					
					ballvelo2Y=-ballvelo2Y;
					
				}
				
				
				
				//1
				if(new Rectangle(ballX[i],ballY[i],29,29).intersects(new Rectangle(15,1,8,1000))){
					
					ballvelo3X=-ballvelo3X;
					
					System.out.println("Hi");
				}
				//2
				if(new Rectangle(ballX[i],ballY[i],29,29).intersects(new Rectangle(944,1,8,1000))){
					
					ballvelo3X=-ballvelo3X;
					
				}
				//3
				if(new Rectangle(ballX[i],ballY[i],29,29).intersects(new Rectangle(1,15,1000,8))){
					
					
					ballvelo3Y=-ballvelo3Y;
					
				}
				//4
				if(new Rectangle(ballX[i],ballY[i],29,29).intersects(new Rectangle(1,943,1000,8))){
					
					
					ballvelo3Y=-ballvelo3Y;
					
					
				}
			}
			
			
			
			if(new Rectangle(15,1,8,1000).intersects(new Rectangle(redposX,redposY,29,29))){
				
				
				veloX=-veloX;
				
			}
			if(new Rectangle(944,1,8,1000).intersects(new Rectangle(redposX,redposY,29,29))){
			
				veloX=-veloX;
				
			}
			
			if(new Rectangle(1,15,1000,8).intersects(new Rectangle(redposX,redposY,29,29))){
			
				veloY=-veloY;
				
			}
			if(new Rectangle(1,943,1000,8).intersects(new Rectangle(redposX,redposY,29,29))){
				
				veloY=-veloY;
				
			}*/
		
			
			if(fixed>0) {
		
				
				if(player1X>15&&player1X<938&&player1Y>15&&player1Y<938) {
					player1X+=redveloX;
					player1Y+=redveloY;
				}
				fixed--;
				
			}
		
			
			
			
			
			
			
			
			
			
			
			counter=0;
			//ball and red stike
			for(int i=0;i<6;i++) {
					
				/*	if(new Rectangle(ballX1[i],ballY1[i],29,29).intersects(new Rectangle(player1X,player1Y,40,40))){
							
							
							ballvelo1X[i]=redveloX;
							ballvelo1Y[i]=redveloY;
							intersect1=true;
							trans1X=ballX1[i];
							trans1Y=ballY1[i];
							index1=i;
							
							ballindex1=i;
							check=true;
							
							
								redveloX=-redveloX;
								redveloY=-redveloY;
							
							
								fixed1=fixed-5;
								fixed=fixed-20;
								arr1[i]=1;
								brr1[i]=1;
							
							//System.out.println("HELLO  1");
					}*/
				//else intersect1=false;
				if(new Rectangle(ballX2[i],ballY2[i],29,29).intersects(new Rectangle(player1X,player1Y,40,40))){
						
						
						ballvelo2X[i]=redveloX;
						ballvelo2Y[i]=redveloY;
						intersect2=true;
						trans2X=ballX2[i];
						trans2Y=ballY2[i];
						check=true;
						index2=i;
						ballindex2=i;
						redveloX=-redveloX;
						redveloY=-redveloY;
						fixed2=fixed;
						
						arr2[i]=1;
						brr2[i]=1;
		
					}
				
					if(new Rectangle(ballX[i],ballY[i],29,29).intersects(new Rectangle(player1X,player1Y,40,40))){
							
							
							ballvelo3X[i]=redveloX;
							ballvelo3Y[i]=redveloY;
							intersect3=true;
							trans3X=ballX[i];
							trans3Y=ballY[i];
							
							index3=i;
							ballindex3=i;
							fixed3=fixed-20;
							
							fixed=fixed-10;
							redveloX=-redveloX;
							redveloY=-redveloY;
							
							arr3[i]=1;
							brr3[i]=1;
							
							System.out.println("player intersect");
					}
					
				
				
				
						
						
				
			}
			
			//ball and area intersect
			
			
		if(intersect1==true) {
			
			if(fixed1>0) {
		
				
				if(trans1X>15&&trans1X<938&&trans1Y>15&&trans1Y<938) {
					trans1X+=ballvelo1X[ballindex1];
					trans1Y+=ballvelo1Y[ballindex1];
					
					ballX1[index1]=trans1X;
					ballY1[index1]=trans1Y;
					
					
					
				}	
				fixed1--;
				
			
			}
			
			
			
		}
		
		
		if(intersect2==true) {
			
			if(fixed2>0) {
		
				
				if(trans2X>15&&trans2X<938&&trans2Y>15&&trans2Y<938) {
					trans2X+=ballvelo2X[ballindex2];
					trans2Y+=ballvelo2Y[ballindex2];
					
					ballX2[index2]=trans2X;
					ballY2[index2]=trans2Y;
				}
				fixed2--;
				
			}
		
		}
		
		if(intersect3==true) {
			if(fixed3>0) {
		
				
				if(trans3X>15&&trans3X<938&&trans3Y>15&&trans3Y<938) {
					trans3X+=ballvelo3X[ballindex3];
					trans3Y+=ballvelo3Y[ballindex3];
					
					ballX[index3]=trans3X;
					ballY[index3]=trans3Y;
				}
				fixed3--;
				
			}
			
		}
		//red intersect
		
		/*if(new Rectangle(redposX,redposY,29,29).intersects(new Rectangle(player1X,player1Y,40,40))){
			
			
			veloX=redveloX;
			veloY=redveloY;
			redintersect=true;
			
			redveloX=-redveloX;
			redveloY=-redveloY;
			fixed4=fixed;
		}
		if(redintersect==true) {
			
			if(fixed4>0) {
		
				
				if(redposX>15&&redposX<938&&redposY>15&&redposY<938) {
					redposX+=veloX;
					redposY+=veloY;
					
					
				}
				fixed4--;
				
			}
			
			
			
			
		}*/
		
		
		
		
		//ball vs ball intersect
		
			
		A:for(int i=0;i<6;i++) {
			
			
			/*if(arr1[i]>0) {
			
				for(int j=0;j<6;j++) {
	
					if(new Rectangle(ballX1[i],ballY1[i],20,20).intersects(new Rectangle(ballX1[j],ballY1[j],20,20))&&i!=j) {
					
							ballvelo1X[j]=ballvelo1X[i];
							ballvelo1Y[j]=ballvelo1Y[i];
							
							
							
							ballvelo1X[i]=-ballvelo1X[i];
							ballvelo1Y[i]=-ballvelo1Y[i];
							
							
							intersect4=true;
							trans4X=ballX1[j];
							trans4Y=ballY1[j];
							
							
							index4=j;
							
							fixed5=fixed1-5;
							fixed1=fixed1-20;
						
							
							
							arr1[i]=0;
							
							arr1[j]=1;
							
							System.out.println("HERE 1  !   :"+i+","+j);
							
							break A;
					}
				}
			}*/
					
			/*if(arr2[i]>0) {
					
				for(int j=0;j<6;j++) {
			
							if(new Rectangle(ballX2[i],ballY2[i],30,30).intersects(new Rectangle(ballX2[j],ballY2[j],30,30))&&i!=j) {
							
									ballvelo2X[j]=ballvelo2X[i];
									ballvelo2Y[j]=ballvelo2Y[i];
									
									
									
									ballvelo2X[i]=-ballvelo2X[i];
									ballvelo2Y[i]=-ballvelo2Y[i];
									
									
									intersect5=true;
									trans5X=ballX2[j];
									trans5Y=ballY2[j];
									
									
									index5=j;
									
									fixed6=fixed2-5;
									fixed2=fixed2-20;
									
									arr2[i]=0;
									arr2[j]=1;
								
									break A;	
						}
				}
			}*/
			
			
			
			if(arr3[i]>0) {
				
				for(int j=0;j<6;j++) {
							
							
								if(new Rectangle(ballX[i],ballY[i],30,30).intersects(new Rectangle(ballX[j],ballY[j],30,30))&&i!=j) {
							
									ballvelo3X[j]=ballvelo3X[i];
									ballvelo3Y[j]=ballvelo3Y[i];
									
									
									
									ballvelo3X[i]=-ballvelo3X[i];
									ballvelo3Y[i]=-ballvelo3Y[i];
									
									
									intersect6=true;
									trans6X=ballX[j];
									trans6Y=ballY[j];
									
									
									index6=j;
									
									fixed7=fixed3-5;
									fixed1=fixed3-20;
									
									System.out.println("HERE 2  !   :"+i +" "+arr3[i]+","+j+" "+arr3[j]);
									arr3[j]=1;
									arr3[i]=0;
									
							
									
								
									
									break A;	
						}
					
				}
			}
			
			
			
			
			/*if(brr1[i]>0) {
				
				for(int j=0;j<6;j++) {
			
							if(new Rectangle(ballX1[i],ballY1[i],30,30).intersects(new Rectangle(ballX[j],ballY[j],20,20))&&i!=j) {
								System.out.println("HERE 4 !   :"+i+","+j);
							
								
									ballvelo3X[j]=ballvelo1X[i];
									ballvelo3Y[j]=ballvelo1Y[i];
									
									
									ballvelo1X[i]=-ballvelo1X[i];
									ballvelo1Y[i]=-ballvelo1Y[i];
									intersect7=true;
									
									trans7X=ballX[j];
									trans7Y=ballY[j];
									
									index7=j;
									
									fixed8=fixed1-5;
									
									fixed1=fixed1-20;
									s=1;
									b=0;
									brr1[i]=0;
									brr3[j]=1;
									break A;	
							}
					}
			}
								
			if(brr3[i]>0) {
				
				for(int j=0;j<6;j++) {
			
							if(new Rectangle(ballX1[j],ballY1[j],30,30).intersects(new Rectangle(ballX[i],ballY[i],20,20))&&i!=j) {
								System.out.println("HERE 5 !   :"+i+","+j);
											
									
									ballvelo1X[j]=ballvelo3X[i];
									ballvelo1Y[j]=ballvelo3Y[i];
									
									
									ballvelo3X[i]=-ballvelo3X[i];
									ballvelo3Y[i]=-ballvelo3Y[i];
									
									trans8X=ballX1[j];
									trans8Y=ballY1[j];
									
									index8=j;
									
									fixed9=fixed3-5;
									
									fixed3=fixed3-20;
									
									intersect8=true;
									b=1;
									s=0;
									brr3[i]=0;
									
									brr1[j]=1;
									
									break A;		
							}
					}
			}*/
			
			
			
			
			if(brr2[i]>0) {
				
				for(int j=0;j<6;j++) {
			
							if(new Rectangle(ballX2[i],ballY2[i],30,30).intersects(new Rectangle(ballX[j],ballY[j],20,20))&&i!=j) {
								System.out.println("HERE 4 !   :"+i+","+j);
							
								
									ballvelo3X[j]=ballvelo2X[i];
									ballvelo3Y[j]=ballvelo2Y[i];
									
									
									ballvelo2X[i]=-ballvelo2X[i];
									ballvelo2Y[i]=-ballvelo2Y[i];
									intersect9=true;
									
									trans9X=ballX[j];
									trans9Y=ballY[j];
									
									index9=j;
									
									fixed10=fixed2-5;
									
									fixed2=fixed2-20;
									s=1;
									b=0;
									brr2[i]=0;
									brr3[j]=1;
									//arr2[i]=1;
									//arr3[j]=1;
									break A;	
							}
					}
			}
								
			if(brr3[i]>0) {
				
				for(int j=0;j<6;j++) {
			
							if(new Rectangle(ballX2[j],ballY2[j],30,30).intersects(new Rectangle(ballX[i],ballY[i],20,20))&&i!=j) {
								System.out.println("HERE 5 !   :"+i+","+j);
											
									
									ballvelo2X[j]=ballvelo3X[i];
									ballvelo2Y[j]=ballvelo3Y[i];
									
									
									ballvelo3X[i]=-ballvelo3X[i];
									ballvelo3Y[i]=-ballvelo3Y[i];
									
									trans10X=ballX2[j];
									trans10Y=ballY2[j];
									
									index10=j;
									
									fixed11=fixed3-5;
									
									fixed3=fixed3-20;
									
									intersect10=true;
									b=1;
									s=0;
									brr3[i]=0;
									
									brr2[j]=1;
									//arr2[j]=1;
									//arr3[i]=1;
									
									break A;		
							}
					}
			}
			
			
			
			
			

			
	}
		
		
		
		
		
		
			
			/*if(new Rectangle(ballX2[i],ballY2[i],30,30).intersects(new Rectangle(ballX2[i+1],ballY2[i+1],30,30))&&check==true&&(ballvelo2X!=0||ballvelo2Y!=0)) {
				
				
				
				
				//System.out.println("AZAZ"+trans4X+"ballvelo"+ballvelo1X+","+fixed5);
			
					
					if(ballX2[i]>15&&ballX2[i]<938&&ballY2[i]>15&&ballY2[i]<938) {
						
						
						ballX2[i]+=10;
						ballY2[i]-=10;
					}
					
					if(ballX2[i+1]>15&&ballX2[i+1]<938&&ballY2[i+1]>15&&ballY2[i+1]<938) {
						
						
						//ballX2[i+1]-=15;
						ballY2[i+1]-=10;
					}
			
					
				}
			
			if(new Rectangle(ballX1[i],ballY1[i],30,30).intersects(new Rectangle(ballX2[i+1],ballY2[i+1],30,30))&&check==true&&(ballvelo1X!=0||ballvelo1Y!=0)) {
				
				
				
				
				//System.out.println("AZAZ"+trans4X+"ballvelo"+ballvelo1X+","+fixed5);
			
					
					if(ballX1[i]>15&&ballX1[i]<938&&ballY1[i]>15&&ballY1[i]<938) {
						
						
						ballX1[i]+=15;
						ballY1[i]+=15;
					}
					
					if(ballX2[i+1]>15&&ballX2[i+1]<938&&ballY2[i+1]>15&&ballY2[i+1]<938) {
						
						
						ballX1[i+1]-=15;
						ballY1[i+1]-=15;
					}
			
					
			}
					
					
						
		}*/
				
			
			
			
		
		
		
		
		

			
			
			
			
			
	/*		for(int i=0;i<5;i++) {
				
				
				if(new Rectangle(ballX1[i],ballY1[i],30,30).intersects(new Rectangle(ballX1[i+1],ballY1[i+1],30,30))&&check==true&&(ballvelo1X!=0||ballvelo1Y!=0)){
						
						
						
						ballvelo4X=-redveloX;
						ballvelo4Y=-redveloY;
						
						ballvelo5X=-ballvelo4X;
						ballvelo5Y=ballvelo4Y;
						
						intersect4=true;
						trans4X=ballX1[i];
						trans4Y=ballY1[i];
						
						trans5X=ballX1[i+1];
						trans5Y=ballY1[i+1];
						
						index4=i;
						index5=i+1;
						fixed5=fixed1-5;
						
						if(intersect4==true) {
							
							System.out.println("AZAZ"+trans4X+"ballvelo"+ballvelo1X+","+fixed5);
							if(fixed5>0) {
						
								
								if(trans4X>15&&trans4X<938&&trans4Y>15&&trans4Y<938) {
									trans4X+=ballvelo5X;
									trans4Y+=ballvelo5Y;
									
									ballX1[index4]=trans4X;
									ballY1[index4]=trans4Y;
								}
								
								if(trans5X>15&&trans5X<938&&trans5Y>15&&trans5Y<938) {
									trans5X+=ballvelo4X;
									trans5Y+=ballvelo4Y;
									
									ballX1[index5]=trans5X;
									ballY1[index5]=trans5Y;
								}
								
								intersect4=false;
								fixed5--;
								
							}
								
						}
						
				}
			
			if(new Rectangle(ballX2[i],ballY2[i],29,29).intersects(new Rectangle(player1X,player1Y,40,40))){
				
				redveloX=-redveloX;
				
				ballveloX=(redveloX/2);
				ballveloY=(redveloY/2);
				intersect2=true;
				trans2X=ballX2[i];
				trans2Y=ballY2[i];
				index2=i;

			}
			if(new Rectangle(ballX[i],ballY[i],29,29).intersects(new Rectangle(player1X,player1Y,40,40))){
					redveloX=-redveloX;
					
					ballveloX=(redveloX/2);
					ballveloY=(redveloY/2);
					intersect3=true;
					trans3X=ballX[i];
					trans3Y=ballY[i];
					
					index3=i;
	
			}
		
		}*/
		
		if(intersect4==true) {
		
			//System.out.println("AZAZ"+trans4X+"ballvelo"+ballvelo1X+","+fixed5);
			if(fixed5>0) {
		
				
				if(trans4X>15&&trans4X<938&&trans4Y>15&&trans4Y<938) {
					trans4X+=ballvelo1X[index4];
					trans4Y+=ballvelo1Y[index4];
					
					ballX1[index4]=trans4X;
					ballY1[index4]=trans4Y;
				}
				
				fixed5--;
				
				
			}
				
		}
		if(intersect5==true) {
			
			//System.out.println("Hi here i am");
			//System.out.println("AZAZ"+trans4X+"ballvelo"+ballvelo1X+","+fixed5);
			if(fixed6>0) {
		
		
				if(trans5X>15&&trans5X<938&&trans5Y>15&&trans5Y<938) {
					
	
					trans5X+=ballvelo2X[index5];
					trans5Y+=ballvelo2Y[index5];
					
					ballX2[index5]=trans5X;
					ballY2[index5]=trans5Y;
					
				}
				
				fixed6--;
				
			}	
		
		}
		
		if(intersect6==true) {
			
			//System.out.println("AZAZ"+trans4X+"ballvelo"+ballvelo1X+","+fixed5);
			if(fixed7>0) {
		
		
				if(trans6X>15&&trans6X<938&&trans6Y>15&&trans6Y<938) {
					
	
					trans6X+=ballvelo3X[index6];
					trans6Y+=ballvelo3Y[index6];
					
					ballX[index6]=trans6X;
					ballY[index6]=trans6Y;
					
					
				}
				
				fixed7--;
			}	
		
		}
		
		if(intersect7==true) {
			
			//System.out.println("AZAZ"+trans4X+"ballvelo"+ballvelo1X+","+fixed5);
			if(fixed8>0) {
		
		
				if(trans7X>15&&trans7X<938&&trans7Y>15&&trans7Y<938) {
				
					
					System.out.println("Hi 1 here i am  azaz");
						trans7X+=ballvelo3X[index7];
						trans7Y+=ballvelo3Y[index7];
						
						ballX[index7]=trans7X;
						ballY[index7]=trans7Y;
					
				
				
				}
				
				fixed8--;
				
			}
		}
		
		if(intersect8==true) {
				if(fixed9>0) {
					if(trans8X>15&&trans8X<938&&trans8Y>15&&trans8Y<938) {
				
						System.out.println("Hi 2 here i am  azaz");
						
						trans8X+=ballvelo1X[index8];
						trans8Y+=ballvelo1Y[index8];
						
						ballX1[index8]=trans8X;
						ballY1[index8]=trans8Y;
					}
					fixed9--;
				}
		}
				
		if(intersect9==true) {
					
					//System.out.println("AZAZ"+trans4X+"ballvelo"+ballvelo1X+","+fixed5);
					if(fixed10>0) {
				
				
						if(trans9X>15&&trans9X<938&&trans9Y>15&&trans9Y<938) {
						
							
							System.out.println("Hi 1 here i am  azaz");
								trans9X+=ballvelo3X[index9];
								trans9Y+=ballvelo3Y[index9];
								
								ballX[index9]=trans9X;
								ballY[index9]=trans9Y;
							
						
						
						}
						
						fixed10--;
						
				}
		}
				
				
				
				if(intersect10==true) {
					
						if(fixed11>0) {
							if(trans10X>15&&trans10X<938&&trans10Y>15&&trans10Y<938) {
						
								System.out.println("Hi 2 here i am  azaz");
								
								trans10X+=ballvelo2X[index10];
								trans10Y+=ballvelo2Y[index10];
								
								ballX2[index10]=trans10X;
								ballY2[index10]=trans10Y;
							}
							fixed11--;
						}
				
				
				
				}	
		
		
	
		
		/*if(intersect9==true) {
				
				//System.out.println("AZAZ"+trans4X+"ballvelo"+ballvelo1X+","+fixed5);
				if(fixed9>0) {
			
			
					if(trans8X>15&&trans8X<938&&trans8Y>15&&trans8Y<938) {
						
		
						if(s==0||b==0) {
							
							trans8X+=ballvelo3X[index8];
							trans8Y+=ballvelo3Y[index8];
							
							ballX1[index8]=trans8X;
							ballY1[index8]=trans8Y;
					}
					if(c==0||d==0) {
						
						trans8X+=ballvelo2X[index8];
						trans8Y+=ballvelo2Y[index8];
						
						ballX[index8]=trans8X;
						ballY[index8]=trans8Y;
					}
					
					fixed9--;
					
				}	
			
			}
			
		
		}*/
		
		
		
		
		
		
		
		
		//intersect ball vs area
		for(int i=0;i<6;i++) {
			//1
			if(new Rectangle(ballX1[i],ballY1[i],29,29).intersects(new Rectangle(25,1,8,1000))){
				
				ballvelo1X[i]=-ballvelo1X[i];
				
			}
			//2
			if(new Rectangle(ballX1[i],ballY1[i],29,29).intersects(new Rectangle(940,1,8,1000))){
				
				ballvelo1X[i]=-ballvelo1X[i];
				
			}
			//3
			if(new Rectangle(ballX1[i],ballY1[i],29,29).intersects(new Rectangle(1,20,1000,8))){
				
				
				ballvelo1Y[i]=-ballvelo1Y[i];
				
			}
			//4
			if(new Rectangle(ballX1[i],ballY1[i],29,29).intersects(new Rectangle(1,940,1000,8))){
				
				
				ballvelo1Y[i]=-ballvelo1Y[i];
				
			}
			
			
			
			//1
			if(new Rectangle(ballX2[i],ballY2[i],29,29).intersects(new Rectangle(25,1,8,1000))){
				
				ballvelo2X[i]=-ballvelo2X[i];
				
			}
			//2
			if(new Rectangle(ballX2[i],ballY2[i],29,29).intersects(new Rectangle(940,1,8,1000))){
				
				ballvelo2X[i]=-ballvelo2X[i];
				
			}
			//3
			if(new Rectangle(ballX2[i],ballY2[i],29,29).intersects(new Rectangle(1,20,1000,8))){
				
				
				ballvelo2Y[i]=-ballvelo2Y[i];
				
			}
			//4
			if(new Rectangle(ballX2[i],ballY2[i],29,29).intersects(new Rectangle(1,940,1000,8))){
				
				
				ballvelo2Y[i]=-ballvelo2Y[i];
				
			}
			
			
			
			//1
			if(new Rectangle(ballX[i],ballY[i],29,29).intersects(new Rectangle(15,1,15,1000))){
				
				ballvelo3X[i]=-ballvelo3X[i];
				
				//System.out.println("Hi");
			}
			//2
			if(new Rectangle(ballX[i],ballY[i],29,29).intersects(new Rectangle(944,1,8,1000))){
				
				ballvelo3X[i]=-ballvelo3X[i];
				
			}
			//3
			if(new Rectangle(ballX[i],ballY[i],29,29).intersects(new Rectangle(1,15,1000,15))){
				
				
				ballvelo3Y[i]=-ballvelo3Y[i];
				
			}
			//4
			if(new Rectangle(ballX[i],ballY[i],29,29).intersects(new Rectangle(1,943,1000,8))){
				
				
				ballvelo3Y[i]=-ballvelo3Y[i];
				
				
			}
		}
		
		
		if(new Rectangle(15,1,8,1000).intersects(new Rectangle(redposX,redposY,29,29))){
			
			
			veloX=-veloX;
			
		}
		if(new Rectangle(944,1,8,1000).intersects(new Rectangle(redposX,redposY,29,29))){
		
			veloX=-veloX;
			
		}
		
		if(new Rectangle(1,15,1000,8).intersects(new Rectangle(redposX,redposY,29,29))){
		
			
			veloY=-veloY;
			
		}
		if(new Rectangle(1,943,1000,8).intersects(new Rectangle(redposX,redposY,29,29))){
			
			veloY=-veloY;
			
		}
		
		
		red=false;
		
		if(new Rectangle(5,5,60,60).intersects(new Rectangle(redposX,redposY,29,29))){
				
				
				red=true;
				
				redposX=10000;
				redposY=10000;
				fixed4=0;
				
			}
			if(new Rectangle(902,5,60,60).intersects(new Rectangle(redposX,redposY,29,29))){
				
				red=true;
				
				redposX=10000;
				redposY=10000;
				fixed4=0;
				
				
			}
			
			if(new Rectangle(5,903,60,60).intersects(new Rectangle(redposX,redposY,29,29))){
				red=true;
				
				redposX=10000;
				redposY=10000;
				
				fixed4=0;
				
				
			}
			if(new Rectangle(902,903,60,60).intersects(new Rectangle(redposX,redposY,29,29))){
				
				red=true;
				
				redposX=10000;
				redposY=10000;
				
				fixed4=0;
				
			}
			
			
			
			
		
		
		
		
		
		ball1=false;
		ball2=false;
		//intersect ball vs pocket
		/*for(int i=0;i<6;i++) {
			
			
			if(new Rectangle(ballX1[i],ballY1[i],29,29).intersects(new Rectangle(5,5,60,60))){
				
				ballvelo1X=-ballvelo1X;
				ballvelo1Y=-ballvelo1Y;
				
				if(i==1||i==3||i==5) {
					
					ball1=true;
					totalball1--;
					
					System.out.println("BABLU 1");
				}
				
				else {
					
					System.out.println("BABLU 2");
					ball1=true;
					totalball2--;
					
				}
				
				ballX1[i]=0;
				ballY1[i]=0;
				System.out.println("BABLU 2");
		
				
				
			}
			
			
			if(new Rectangle(ballX1[i],ballY1[i],29,29).intersects(new Rectangle(902,5,60,60))){
				
				ballvelo1X=-ballvelo1X;
				ballvelo1Y=-ballvelo1Y;
				
				if(i==1||i==3||i==5) {
					
					ball1=true;
					totalball1--;
					System.out.println("BABLU 3");
					fixed1=0;
					
				}
				else {
					
					ball1=true;
					totalball2--;
					
					
					fixed1=0;
					System.out.println("BABLU 4");
				}
				
				ch=0;
				
				ballX1[i]=10000;
				ballY1[i]=10000;
				
			
				
				System.out.println("BABLU 4");
				
				
			}
		
			if(new Rectangle(ballX1[i],ballY1[i],29,29).intersects(new Rectangle(5,903,60,60))){
				
				ballvelo1X=-ballvelo1X;
				ballvelo1Y=-ballvelo1Y;
				
				if(i==1||i==3||i==5) {
					
					ball1=true;
					totalball1--;
					System.out.println("BABLU 5");
					ballX1[i]=10000;
					ballY1[i]=10000;
					
				
				}
				else {
					
					ball2=true;
					totalball2--;
					System.out.println("BABLU 6");
					ballX1[i]=10000;
					ballY1[i]=10000;
					
					
				}
				fixed1=0;
				ballX1[i]=10000;
				ballY1[i]=10000;
				
				
			}
			//4
			if(new Rectangle(ballX1[i],ballY1[i],29,29).intersects(new Rectangle(902,903,60,60))){
				
				ballvelo1X=-ballvelo1X;
				ballvelo1Y=-ballvelo1Y;
				
				if(i==1||i==3||i==5) {
					
					ball1=true;
					totalball1--;
					System.out.println("BABLU 7");
					ballX1[i]=10000;
					ballY1[i]=10000;
				}
				else {
					
					ball2=true;
					totalball2--;
					System.out.println("BABLU 8");
					ballX1[i]=10000;
					ballY1[i]=10000;
				}
				fixed1=0;
				
				ballX1[i]=10000;
				ballY1[i]=10000;
				
				System.out.println("BABLU 8");
			}
			
			
			
			//1
			if(new Rectangle(ballX2[i],ballY2[i],29,29).intersects(new Rectangle(5,5,60,60))){
				
				
				ballvelo2X=-ballvelo2X;
				ballvelo2Y=-ballvelo2Y;
				
				if(i==0||i==2||i==4) {
					
					ball1=true;
					totalball1--;
					System.out.println("BABLU 9");
					ballX2[i]=10000;
					ballY2[i]=10000;
				}
				else {
					
					ball2=true;
					totalball2--;
					System.out.println("BABLU 10");
					ballX2[i]=10000;
					ballY2[i]=10000;
				}
				
				fixed2=0;
				
				ballX2[i]=10000;
				ballY2[i]=10000;
				System.out.println("BABLU 10");
				
			}
			//2
			if(new Rectangle(ballX2[i],ballY2[i],29,29).intersects(new Rectangle(902,5,60,60))){
				
				ballvelo2X=-ballvelo2X;
				ballvelo2Y=-ballvelo2Y;
				
				if(i==0||i==2||i==4) {
					
					ball1=true;
					totalball1--;
					System.out.println("BABLU 11");
					ballX2[i]=10000;
					ballY2[i]=10000;
				}
				else {
					
					ball2=true;
					totalball2--;
					System.out.println("BABLU 12");
					ballX2[i]=10000;
					ballY2[i]=10000;
				}
				
				
				fixed2=0;
				ballX2[i]=10000;
				ballY2[i]=10000;
				System.out.println("BABLU 12");
				
			}
			//3
			if(new Rectangle(ballX2[i],ballY2[i],29,29).intersects(new Rectangle(5,903,60,60))){
				
				ballvelo2X=-ballvelo2X;
				ballvelo2Y=-ballvelo2Y;
				
				if(i==0||i==2||i==4) {
					
					ball1=true;
					totalball1--;
					System.out.println("BABLU 13");
					ballX2[i]=10000;
					ballY2[i]=10000;
				}
				else {
					
					ball2=true;
					totalball2--;
					System.out.println("BABLU 14");
					ballX2[i]=10000;
					ballY2[i]=10000;
				}
				fixed2=0;
				ballX2[i]=10000;
				ballY2[i]=10000;
				System.out.println("BABLU 14");
				
			}
			//4
			if(new Rectangle(ballX2[i],ballY2[i],29,29).intersects(new Rectangle(902,903,60,60))){
				
				ballvelo2X=-ballvelo2X;
				ballvelo2Y=-ballvelo2Y;
				
				if(i==0||i==2||i==4) {
					
					ball1=true;
					totalball1--;
					System.out.println("BABLU 15");
					ballX2[i]=10000;
					ballY2[i]=10000;
				}
				else {
					
					ball2=true;
					totalball2--;
					System.out.println("BABLU 16");
					ballX2[i]=10000;
					ballY2[i]=10000;
				}
				fixed2=0;
				ballX2[i]=10000;
				ballY2[i]=10000;
				
				System.out.println("BABLU 16");
			}
			
			
			
			//1
			if(new Rectangle(ballX[i],ballY[i],29,29).intersects(new Rectangle(5,5,60,60))){
				
					
				ballvelo3X=-ballvelo3X;
				ballvelo3Y=-ballvelo3Y;
				
				if(i==1||i==3||i==5) {
					
					ball1=true;
					totalball1--;
					System.out.println("BABLU 17");
					ballX[i]=10000;
					ballY[i]=10000;
				}
				else {
					
					ball2=true;
					totalball2--;
					System.out.println("BABLU 18");
					ballX[i]=10000;
					ballY[i]=10000;
				}
				fixed3=0;
				ballX[i]=10000;
				ballY[i]=10000;
				System.out.println("BABLU 18");
				
			}
			//2
			if(new Rectangle(ballX[i],ballY[i],29,29).intersects(new Rectangle(902,5,60,60))){
				
				
				ballvelo3X=-ballvelo3X;
				ballvelo3Y=-ballvelo3Y;
				
				if(i==1||i==3||i==5) {
					
					
					ball1=true;
					totalball1--;
					System.out.println("BABLU 19");
					ballX[i]=10000;
					ballY[i]=10000;
				}
				else  {
					
					ball2=true;
					totalball2--;
					System.out.println("BABLU 20");
					ballX[i]=10000;
					ballY[i]=10000;
				}
				fixed3=0;
				ballX[i]=10000;
				ballY[i]=10000;
				
				System.out.println("BABLU 20");
			}
			//3
			if(new Rectangle(ballX[i],ballY[i],29,29).intersects(new Rectangle(5,903,60,60))){
				
				ballvelo3X[i]=-ballvelo3X[i];
				ballvelo3Y[i]=-ballvelo3Y[i];
				
				if(i==1||i==3||i==5) {
					
					ball1=true;
					totalball1--;
					System.out.println("BABLU 21");
					ballX[i]=10000;
					ballY[i]=10000;
				}
				else {
					
					ball2=true;
					totalball2--;
					System.out.println("BABLU 22");
					ballX[i]=10000;
					ballY[i]=10000;
				}
				fixed3=0;
				ballX[i]=10000;
				ballY[i]=10000;
				System.out.println("BABLU 22");
				
			}
			//4
			if(new Rectangle(ballX[i],ballY[i],29,29).intersects(new Rectangle(902,903,60,60))){
				
				ballvelo3X[i]=-ballvelo3X[i];
				ballvelo3Y[i]=-ballvelo3Y[i];
				
				if(i==1||i==3||i==5) {
					
					
					ball1=true;
					totalball1--;
					System.out.println("BABLU 23");
					ballX[i]=10000;
					ballY[i]=10000;
				}
				else {
					
					ball2=true;
					
					totalball2--;
					System.out.println("BABLU 24");
					ballX[i]=10000;
					ballY[i]=10000;
				}
				fixed3=0;
				ballX[i]=10000;
				ballY[i]=10000;
				System.out.println("BABLU 24");
				
				
			}
			
			
		
			
			
	}*/
		
		
		if(red) {
			if(!ball1) {
				
				redposX=470;
				redposY=467;
				
			}
			
			else totalpointA+=5;
		}
		if(red) {
			if(!ball2) {
				
				redposX=470;
				redposY=467;
				
			}
			else totalpointB+=5;
		}
			
		}
		
		repaint();
		
		
	}

}