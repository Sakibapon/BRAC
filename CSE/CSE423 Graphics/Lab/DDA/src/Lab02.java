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
import java.lang.Math; 

public class Lab02 implements GLEventListener{
   
	private GLU glu;
   @Override
   public void display(GLAutoDrawable drawable) {
      final GL2 gl = drawable.getGL().getGL2();
      //DDA(gl, 4,4,7,10);
      //DDA(gl,20,5,19,50);
      //DDA(gl,2,2,7,5);
      //DDA(gl,-10,-10,48,24);
      //DDA(gl,-5,50,-15,0);
      //DDA(gl,-223,0,0,138);
      ///DDA(gl,-162,0,0,75);
      DDA(gl,-232, 0,0,193);
      
      
      //Vertical Line
      gl.glColor3d(1,0.0,1);
      gl.glBegin(GL2.GL_LINES);
      gl.glVertex2d(-100,0);
      gl.glVertex2d(100,0);
      gl.glVertex2d(0,-100);
      gl.glVertex2d(0,100);
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
   
   
   public void DDA(GL2 gl, float x1, float y1, float x2, float y2) 
   {
      
	   gl.glPointSize(1.0f);
       gl.glLineWidth(2.0f);
       float length=0;
       float dx=x2-x1;
       float dy=y2-y1;
       float m=dy/dx;
       if(dx>=dy)  length = dx;  
       else  length = dy;  
       float x=x1;
       float y=y1;
       	  if(-1<m && m<=1 )
       			{
       		  		int count=1;
    	   			for(int i=0;i<=length;i++)
    	   			{
		        	  	System.out.println(count+"th X: "+Math.round(x*100.0)/100.0+" First Y: "+Math.round(y*100.0)/100.0);
		        	  	gl.glColor3d(1,1.1,1);//White color for M>=1
		                gl.glBegin(GL2.GL_LINES);
		                gl.glVertex2d(Math.round(x),Math.round(y));
		                x=x+1;
		                y=y+m;
			        	gl.glVertex2d(Math.round(x),Math.round(y));
			        	gl.glEnd(); 
			        	count++;
    	   			}
       			}
       	  else
	       {
       		   int count=0;
	           for(int i=0;i<=length;i++)
	            {
	        	   	System.out.println(count+"th X: "+Math.round(x*100.0)/100.0+" First Y: "+Math.round(y*100.0)/100.0);
	                gl.glColor3d(0,0,0); //Black color for M<1 
	                gl.glBegin(GL2.GL_LINES);
	                gl.glVertex2d(Math.round(x),Math.round(y));
	                x=x+1/m;
	                y=y+1;
	                gl.glVertex2d(Math.round(x),Math.round(y));
	                gl.glEnd();
	                count++;
	            }
	       }
	       
       
       //write your own code
       
       
    }

   
   
   
   
   
   public static void main(String[] args) {
      //getting the capabilities object of GL2 profile
      final GLProfile profile = GLProfile.get(GLProfile.GL2);
      GLCapabilities capabilities = new GLCapabilities(profile);
      // The canvas 
      final GLCanvas glcanvas = new GLCanvas(capabilities);
      Lab02 l = new Lab02();
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