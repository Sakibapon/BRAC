/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse423lab03;

/**
 *
 * @author Sakib
 */
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import javax.swing.JFrame;

public class MidPoint implements GLEventListener{
   
private GLU glu;
@Override
public void display(GLAutoDrawable drawable)
   {
      final GL2 gl = drawable.getGL().getGL2();
      Midpoint(gl,10,10,60,50);
      Midpoint(gl,10,-10,60,-50);
      Midpoint(gl,-30,-10,-100,-40);
      //Midpoint(gl,100,25,-5,200);
      
      //Vertical Line
      gl.glColor3d(1,1,1);
      gl.glBegin(GL2.GL_LINES);
      gl.glVertex2d(-100,0);
      gl.glVertex2d(100,0);
      gl.glVertex2d(0,-100);
      gl.glVertex2d(0,100);
      gl.glVertex2d(-75,-75);
      gl.glVertex2d(75,75);
      gl.glVertex2d(-75,75);
      gl.glVertex2d(75,-75);
      gl.glEnd();
      
   }
@Override
   public void dispose(GLAutoDrawable arg0) {
      //method body
   }
   
@Override
   public void init(GLAutoDrawable gld) {
       GL2 gl = gld.getGL().getGL2();
       glu = new GLU();

       gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
       gl.glViewport(-100, -50, 50, 100);
       gl.glMatrixMode(GL2.GL_PROJECTION);
       gl.glLoadIdentity();
       glu.gluOrtho2D(-100.0, 100.0, -100.0, 100.0);
   } 

   

@Override
   public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
      // method body
   }
   
   
    public void Midpoint(GL2 gl,int x0, int y0, int x1, int y1) 
    {
	    int zone =findzone(x0, y0, x1, y1);
	    if (zone == 0) L0(gl, x0, y0, x1, y1, 0);
	    else if (zone==1) L1(gl, x0, y0, x1, y1, 1);
	    else if (zone==2) L2(gl, x0, y0, x1, y1, 2);
	    else if (zone==3) L3(gl, x0, y0, x1, y1, 3);
	    else if (zone==4) L4(gl, x0, y0, x1, y1, 4);
	    else if (zone==5) L5(gl, x0, y0, x1, y1, 5);
	    else if (zone==6) L6(gl, x0, y0, x1, y1, 6);
	    else if (zone==7) L7(gl, x0, y0, x1, y1, 7);
	    
       //write your own code
       
       
    }
    
    public void L0(GL2 gl, int x0, int y0, int x1, int y1, int zone)
	   {
	       float dx = x1 - x0;
	       float dy = y1 - y0;
	       float dE = dy;
	       float dNE = (dy - dx);
	       float d = (dy) - dx;
	       float x = x0, y = y0;
	       gl.glPointSize(2.0f);
	       gl.glBegin(GL2.GL_POINTS);
	       gl.glVertex2f(x, y);
	
	       while (x <= x1)
	       {
	           if (d < 0)
		           {
		               x++;
		               d = d + dE;
		           }
	           else
		           {
		               x++;
		               y++;
		               d = d + dNE;
		           }
	           gl.glVertex2f(x, y);
	       }
	       gl.glEnd();
	
	   }
	
	   public void L1(GL2 gl, int x0, int y0, float x1, int y1, int zone)
	   {
	       float dx = x1 - x0; 
	       float dy = y1 - y0;
	       float dN = -dx;
	       float dNE = (dy - dx);
	       float d = (dy / 2) - (dx);
	       float x = x0, y = y0;
	
	       gl.glPointSize(2.0f);
	       gl.glBegin(GL2.GL_POINTS);
	       gl.glVertex2f(x, y);
	
	       while (y <= y1)
	       {
	           if (d >= 0)
		           {
		               y++;
		               d = d + dN;
		           } 
	           else
		           {
		               y++;
		               x++;
		               d = d + dNE;
		           }
	           gl.glVertex2f(x, y);
	       }
	       gl.glEnd();
	   }
	
	   public void L2(GL2 gl, int x0, int y0, float x1, int y1, int zone)
	   {
	       float dx = x1 - x0; 
	       float dy = y1 - y0;
	       float dN = -dx;
	       float dNW = (-dy - dx);
	       float d = (-dy / 2) - (dx);
	       float x = x0, y = y0;
	
	       gl.glPointSize(2.0f);
	       gl.glBegin(GL2.GL_POINTS);
	       gl.glVertex2f(x, y);
	
	       while (y <= y1)
	       {
	           if (d < 0)
		           {
		               y++;
		               d = d + dN;
		           } 
	           else
		           {
		               y++;
		               x--;
		               d = d + dNW;
		           }
	           
	           gl.glVertex2f(x, y);
	       }
	       gl.glEnd();
	   }
	
	   public void L3(GL2 gl, int x0, int y0, float x1, int y1, int zone)
	   {
	       float dx = x1 - x0;
	       float dy = y1 - y0;
	       float dW = -dy;
	       float dNW = (-dy - dx);
	       float d = (-dy) - (dx / 2);
	       float x = x0, y = y0;
	
	       gl.glPointSize(2.0f);
	       gl.glBegin(GL2.GL_POINTS);
	       gl.glVertex2f(x, y);
	
	       while (x1 <= x)
	       {
	           if (d >= 0)
		           {
		               x--;
		               d = d + dW;
		           } 
	           else
		           {
		               y++;
		               x--;
		               d = d + dNW;
		           }
	           
	           gl.glVertex2f(x, y);
	       }
	       gl.glEnd();
	   }
	
	   public void L4(GL2 gl, int x0, int y0, float x1, int y1, int zone)
	   {
	       float dx = x1 - x0;
	       float dy = y1 - y0;
	       float dW = -dy;
	       float dSW = (-dy + dx);
	       float d = (-dy) + (dx / 2);
	       float x = x0, y = y0;
	
	       gl.glPointSize(2.0f);
	       gl.glBegin(GL2.GL_POINTS);
	       gl.glVertex2f(x, y);
	
	       while (x1 <= x)
	       {
	           if (d >= 0)
		           {
		               x--;
		               y--;
		               d = d + dSW;
		           } 
	           else
		           {
		               x--;
		               d = d + dW;
		           }
	           
	           gl.glVertex2f(x, y);
	       }
	       gl.glEnd();
	   }
	
	   public void L5(GL2 gl, int x0, int y0, float x1, int y1, int zone)
	   {
	       float dx = x1 - x0;
	       float dy = y1 - y0;
	       float dS = dx;
	       float dSW = (-dy + dx);
	       float d = -(dy / 2) + (dx);
	       float x = x0, y = y0;
	
	       gl.glPointSize(2.0f);
	       gl.glBegin(GL2.GL_POINTS);
	       gl.glVertex2f(x, y);
	
	       while (y1 <= y)
	       {
	           if (d < 0)
		           {
		               x--;
		               y--;
		               d = d + dSW;
		           } 
	           else
		           {
		               y--;
		               d = d + dS;
		           }
	           
	           gl.glVertex2f(x, y);
	       }
	       gl.glEnd();
	   }
	
	   public void L6(GL2 gl, int x0, int y0, float x1, int y1, int zone)
	   {
	       float dx = x1 - x0;
	       float dy = y1 - y0;
	       float dS = dx;
	       float dSE = (dy + dx);
	       float d = (dy / 2) + (dx);
	       float x = x0, y = y0;
	
	       gl.glPointSize(2.0f);
	       gl.glBegin(GL2.GL_POINTS);
	       gl.glVertex2f(x, y);
	
	       while (y1 <= y)
	       {
	           if (d >= 0)
		           {
		               x++;
		               y--;
		               d = d + dSE;
		           }
	           else
		           {
		               y--;
		               d = d + dS;
		           }
	           
	           gl.glVertex2f(x, y);
	       }
	       gl.glEnd();
	   }
	
	   public void L7(GL2 gl, int x0, int y0, float x1, int y1, int zone)
	   {
	       float dx = x1 - x0;
	       float dy = y1 - y0;
	       float dE = dy;
	       float dSE = (dy + dx);
	       float d = (dy) + (dx / 2);
	       float x = x0, y = y0;
	
	       gl.glPointSize(2.0f);
	       gl.glBegin(GL2.GL_POINTS);
	       gl.glVertex2f(x, y);
	       while (x <= x1)
	       {
	           if (d >= 0)
		           {
		               x++;
		               d = d + dE;
		           }
	           else
		           {
		               x++;
		               y--;
		               d = d + dSE;
		           }
	           
	           gl.glVertex2f(x, y);
	       }
	       gl.glEnd();
	   }

    public int findzone(int x0, int y0, int x1, int y1)
    {

       int dx = x1 - x0;
       int dy = y1 - y0;
       //System.out.print("For "+x0+","+x1+","+y0+","+y1+" : ");
       if (Math.abs(dx) >= Math.abs(dy))
	       { 
	           if (dy >= 0 && dx >= 0)
	           {
	        	   //System.out.println("Zone 0");
	               return 0;
	           }
	           else if (dx < 0 && dy >= 0)
		           {
		        	  // System.out.println("Zone 3");
		               return 3;
		           }
	           else if (dx < 0 && dy < 0)
		           {
		        	   //System.out.println("Zone 4");
		               return 4;
		           }
	           else
		           {
		        	   //System.out.println("Zone 7");
		        	   return 7;
		           }
	       } 
	   else
	       { 
	           if (dy >= 0 && dx >= 0)
		           {
		        	   //System.out.println("Zone 1");
		               return 1;
		           }
	           else if (dx < 0 && dy >= 0)
		           {
		        	  // System.out.println("Zone 2");
		               return 2;
		           }
	           else if (dx < 0 && dy < 0)
		           {
		        	  // System.out.println("Zone 5");
		               return 5;
		           }
	           else 
	        	   {
		        	  // System.out.println("Zone 6");
		        	   return 6;
	        	   }
	        }
  }
   
   
   
   
   public static void main(String[] args) {
      //getting the capabilities object of GL2 profile
      final GLProfile profile = GLProfile.get(GLProfile.GL2);
      GLCapabilities capabilities = new GLCapabilities(profile);
      // The canvas 
      final GLCanvas glcanvas = new GLCanvas(capabilities);
      MidPoint l = new MidPoint();
      glcanvas.addGLEventListener(l);
      glcanvas.setSize(400, 400);
      //creating frame
      final JFrame frame = new JFrame ("straight Line");
      //adding canvas to frame
      frame.getContentPane().add(glcanvas);
      frame.setSize(frame.getContentPane().getPreferredSize());
      frame.setVisible(true);
   }//end of main
}//end of classimport javax.media.opengl.GL2;