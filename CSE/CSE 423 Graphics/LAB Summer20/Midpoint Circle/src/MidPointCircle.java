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
import java.util.Scanner;

public class MidPointCircle implements GLEventListener{
   
	private GLU glu;
   @Override
   public void display(GLAutoDrawable drawable) {
      final GL2 gl = drawable.getGL().getGL2();
      
      Scanner scanner = new Scanner(System.in);
      //System.out.println("enter radius : ");
      //int radius = scanner.nextInt();
      //System.out.println("enter x : ");
      //int x= scanner.nextInt();
      //System.out.println("enter y : ");
      //int y= scanner.nextInt();
      //Circle(gl,x,y,radius);
      
      
      //Circle(gl,0,0,45);
      //Circle(gl,15,0);
      Circle(gl,0,0,45);
      //DDA(gl,2,2,7,5);
      //DDA(gl,-10,-10,48,24);
      
      //Vertical Line
      gl.glColor3d(1,0.0,1);
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
       gl.glClearColor(0.5f, 0.05f, 1.0f, 1.0f);
       gl.glViewport(-100, -50, 50, 100);
       gl.glMatrixMode(GL2.GL_PROJECTION);
       gl.glLoadIdentity();
       glu.gluOrtho2D(-100.0, 100.0, -100.0, 100.0);
   }

   

   @Override
   public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
      // method body
   }
   
   
   public void Circle(GL2 gl,int a,int b,int radius) {
       
       gl.glPointSize(2.0f);
       gl.glLineWidth(1.0f);
       gl.glColor3d(1,1.1,1);
       int x=0;
       int y=radius;
       int d=1-radius;
       while(x<y)
       {
	       if(d>0)
	       {
	        	  	System.out.println("x: "+(x-42)+" Y: "+(y+95)+" D: "+d+" : SE Choosen");
	                //gl.glBegin(GL2.GL_LINES);
	                //gl.glVertex2d(x,y);
	                d=d+2*x-2*y+5;
	                System.out.println("Updated D: "+d);
	        		x++;
	        		y--;
	        		//gl.glVertex2d(x,y);
		        	//gl.glEnd();
	       }
	       if(d<0)
	       		{
	    	   		System.out.println("x: "+(x-42)+" Y: "+(y+95)+" D: "+d+" : SE Choosen");
	        	   	//gl.glBegin(GL2.GL_LINES);
	        	   	//gl.glVertex2d(x,y);
	        	   	d=d+2*x+3;
	        	   	System.out.println("New D: "+d);
	        	   	x++;
	        	   	//gl.glVertex2d(x,y);
	        	   	//gl.glEnd();
	       		}
	       draw8Way(gl, x, y);
       }
       
       //write your own code
       
       
    }

   
   private void draw8Way(GL2 gl, int x, int y) {
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
   
   
   
   public static void main(String[] args) {
      //getting the capabilities object of GL2 profile
      final GLProfile profile = GLProfile.get(GLProfile.GL2);
      GLCapabilities capabilities = new GLCapabilities(profile);
      // The canvas 
      final GLCanvas glcanvas = new GLCanvas(capabilities);
      MidPointCircle l = new MidPointCircle();
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