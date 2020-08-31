package Drawing_Square_using_Mid_Point;

import javax.media.opengl.*;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.glu.GLU;
import javax.swing.*;
import java.util.Scanner;

/**
 * Mid_Point_Square
 * + ------------------------------------------------------------------------------------------------+
 * Description: for a given line this program draws a square by transforming and translating.
 * + ------------------------------------------------------------------------------------------------+
 *
 * @author Sajjad Ahmed Niloy
 * @version 1.0
 * @since 23-Aug-18
 * license   MIT
 * + ------------------------------------------------------------------------------------------------+
 */
public class Mid_Point_Square {
    public static void main(String args[]) {

        //getting the capabilities object of GL2 profile
        final GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);
        // The canvas
        final GLCanvas glcanvas = new GLCanvas(capabilities);
        ThirdGLEventListener_Square b = new ThirdGLEventListener_Square();
        glcanvas.addGLEventListener(b);
        glcanvas.setSize(400, 400);
        //creating frame
        final JFrame frame = new JFrame("Mid Point square");
        //adding canvas to frame
        frame.add(glcanvas);
        frame.setSize(640, 480);
        frame.setVisible(true);
    }

}

class ThirdGLEventListener_Square implements GLEventListener {
    private int x0, y0, x1, y1;
    private GLU glu;
    private Mid_Point_Line_Drawer dlh;

    public void init(GLAutoDrawable gld) {
        dlh = new Mid_Point_Line_Drawer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x0 : ");
        x0 = scanner.nextInt();
        System.out.println("enter y0 : ");
        y0 = scanner.nextInt();
        System.out.println("enter x1 : ");
        x1 = scanner.nextInt();
        System.out.println("enter y1 : ");
        y1 = scanner.nextInt();

        GL2 gl = gld.getGL().getGL2();
        glu = new GLU();

        gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        gl.glViewport(-250, -150, 250, 150);
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluOrtho2D(-250.0, 250.0, -150.0, 150.0);
    }

    public void display(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
        gl.glClear(GL2.GL_COLOR_BUFFER_BIT);


        int dy = y1 - y0, dx = x1 - x0;

        int distance = (int) Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));

        double mg = (double) dy / dx;

        double theta = Math.atan(mg) * 180 / Math.PI;
        gl.glTranslated(x1, y1, 0);
        gl.glRotated(theta, 0, 0, 1);


        gl.glPushMatrix();
        dlh.drawMyLine(gl, 0, 0, distance, 0);

        gl.glRotated(90, 0, 0, 1);
        dlh.drawMyLine(gl, 0, 0, distance, 0);

        gl.glTranslated(distance, 0, 0);
        gl.glRotated(-90, 0, 0, 1);
        dlh.drawMyLine(gl, 0, 0, distance, 0);

        gl.glTranslated(distance, 0, 0);
        gl.glRotated(-90, 0, 0, 1);
        dlh.drawMyLine(gl, 0, 0, distance, 0);
        gl.glPopMatrix();


    }


    public void reshape(GLAutoDrawable drawable, int x, int y, int width,
                        int height) {
    }

    public void dispose(GLAutoDrawable arg0) {

    }


}