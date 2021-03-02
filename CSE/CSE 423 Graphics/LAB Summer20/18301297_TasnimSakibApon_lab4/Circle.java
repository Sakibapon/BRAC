package cse423lab04;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import javax.swing.JFrame;


public class Circle 
{
    public static void main(String args[]) 
    {

        //getting the capabilities object of GL2 profile
        final GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);
        // The canvas
        final GLCanvas glcanvas = new GLCanvas(capabilities);
        Circle_Drawing_Algorithm b = new Circle_Drawing_Algorithm();
        glcanvas.addGLEventListener(b);
        glcanvas.setSize(400, 400);
        //creating frame
        final JFrame frame = new JFrame("Circle");
        //adding canvas to frame
        frame.add(glcanvas);
        frame.setSize(480, 480);
        frame.setVisible(true);
    }
}


class Circle_Drawing_Algorithm implements GLEventListener {
    private int radius, x, y;
    private GLU glu;

    public void init(GLAutoDrawable gld)
    {

        GL2 gl = gld.getGL().getGL2();
        glu = new GLU();

        gl.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
        gl.glViewport(-250, -150, 250, 150);
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluOrtho2D(-400.0, 400.0, -400.0, 400.0);
    }

    public void display(GLAutoDrawable drawable) 
    {
        GL2 gl = drawable.getGL().getGL2();
        gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
        gl.glPushMatrix();
        gl.glTranslated(x, y, 0);
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter Radius Below 300 : ");
        //int r = scanner.nextInt();
        //double r1=r/2;
        //double r2=r/4;
        scanner.close();
        //drawCircle(gl,r1,0,0);
        //drawCircle(gl,r1,0,r1);
        //drawCircle(gl,r1,r1,0);
        //drawCircle(gl,r1,0,-r1);
        //drawCircle(gl,r1,-r1,0);
        //drawCircle(gl,r1,r2,r2);
        //drawCircle(gl,r1,-r2,r2);
        //drawCircle(gl,r1,r2,-r2);
        //drawCircle(gl,r1,-r2,-r2);
        
        drawCircle(gl,280,0,0);
        drawCircle(gl,140,0,140);
        drawCircle(gl,140,140,0);
        drawCircle(gl,140,0,-140);
        drawCircle(gl,140,-140,0);
        drawCircle(gl,140,100.100,100.100);
        drawCircle(gl,140,-100.100,100.100);
        drawCircle(gl,140,100.100,-100.100);
        drawCircle(gl,140,-100.100,-100.100);
        
        //Vertical Line
        gl.glBegin(GL2.GL_LINES);
        gl.glColor3d(0,1,0);
        gl.glLineWidth(0.0f);
        gl.glPointSize(0.0f);
        gl.glVertex2d(-400,0);
        gl.glVertex2d(400,0);
        gl.glVertex2d(0,-400);
        gl.glVertex2d(0,400);
        gl.glVertex2d(-400,-400);
        gl.glVertex2d(400,400);
        gl.glVertex2d(-400,400);
        gl.glVertex2d(400,-400);
        gl.glEnd();
        
        
        
    }
    private void drawCircle(GL2 gl, double r, double X, double Y) 
    {
        gl.glPointSize(2.0f);
        gl.glLineWidth(2.0f);
        gl.glColor3d(0,0,0);
        gl.glBegin(GL2.GL_POINTS);
        gl.glVertex2d(x+X, y+Y);
        gl.glVertex2d(Xchange(x,y,1)+X,Ychange(x,y,1)+Y);
        gl.glVertex2d(Xchange(x,y,2)+X,Ychange(x,y,2)+Y);
        gl.glVertex2d(Xchange(x,y,3)+X,Ychange(x,y,3)+Y);
        gl.glVertex2d(Xchange(x,y,4)+X,Ychange(x,y,4)+Y);
        gl.glVertex2d(Xchange(x,y,5)+X,Ychange(x,y,5)+Y);
        gl.glVertex2d(Xchange(x,y,6)+X,Ychange(x,y,6)+Y);
        gl.glVertex2d(Xchange(x,y,7)+X,Ychange(x,y,7)+Y);
        int x=(int) r;
        int y=0;
        int d=(int) (5-4*r);
        while(y<x)
        {
	    if(d>0)
	    {
	        d=d+((2*y-2*x+5)*4);
                y++;
                x--;
                
	    }
	    if(d<0)
	    {
                d=d+((2*y+3)*4);
                y++;
	    }
             gl.glVertex2d(x+X, y+Y);
             gl.glVertex2d(Xchange(x,y,1)+X,Ychange(x,y,1)+Y);
             gl.glVertex2d(Xchange(x,y,2)+X,Ychange(x,y,2)+Y);
             gl.glVertex2d(Xchange(x,y,3)+X,Ychange(x,y,3)+Y);
             gl.glVertex2d(Xchange(x,y,4)+X,Ychange(x,y,4)+Y);
             gl.glVertex2d(Xchange(x,y,5)+X,Ychange(x,y,5)+Y);
             gl.glVertex2d(Xchange(x,y,6)+X,Ychange(x,y,6)+Y);
             gl.glVertex2d(Xchange(x,y,7)+X,Ychange(x,y,7)+Y);
       }
        
        //ENTER YOUR CODE HERE
        //gl.glBegin(GL2.GL_LINES);
        gl.glEnd();
       
    }
   
    public int Xchange(int x, int y, int zone) 
    {
         int zoneX=0;
         if(zone==0 || zone==7) zoneX=x;
         else if(zone==1 || zone==6) zoneX=y;
         else if(zone==2 || zone==5) zoneX=-y;
         else if(zone==3 || zone==4) zoneX=-x;
         return zoneX;
    }
    public int Ychange(int x, int y, int zone) 
    {
            int zoneY=0;
            if(zone==0 || zone==3) zoneY=y;
            else if(zone==1 || zone==2) zoneY=x;
            else if(zone==4 || zone==7) zoneY=-y;
            else if(zone==5 || zone==6) zoneY=-x;
            return zoneY;
         
    }
    public int FindZone(int x1,int y1, int x2, int y2) 
    {
        int dx=x2-x1;
        int dy=y2-y1;
        int zone=0;
        if(Math.abs(dx)>=Math.abs(dy)) 
        {
            if(dx>0 && dy>0) zone=0;
            else if(dx<0 && dy>0) zone= 3;
            else if(dx<0 && dy<0) zone=4;
            else if(dx>0 && dy<0) zone=7;
        }
        else 
        {
            if(dx>0 && dy>0) zone= 1;
            else if(dx<0 && dy>0) zone= 2;
            else if(dx<0 && dy<0) zone= 5;
            else if(dx>0 && dy<0) zone= 6;
          
        }
        return zone;
    }
    private void draw8Way(GL2 gl, int x, int y)
    {
        gl.glBegin(GL2.GL_POINTS);
        gl.glVertex2d(x, y);
        gl.glVertex2d(y, x);
        gl.glVertex2d(-x, y);
        gl.glVertex2d(-y, x);
        gl.glVertex2d(-x, -y);
        gl.glVertex2d(-y, -x);
        gl.glVertex2d(x, -y);
        gl.glVertex2d(y, -x);
        gl.glEnd();

    }


    public void reshape(GLAutoDrawable drawable, int x, int y, int width,
                        int height) {
    }

    public void dispose(GLAutoDrawable arg0) 
    {
    }
    
}