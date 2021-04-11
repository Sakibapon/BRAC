package Mid_Point_Line_Drawing_Algorithm;

import javax.media.opengl.*;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.glu.GLU;
import javax.swing.*;
import java.util.Scanner;

public class Mid_Point {
    public static void main(String args[]) {

        //getting the capabilities object of GL2 profile
        final GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);
        // The canvas
        final GLCanvas glcanvas = new GLCanvas(capabilities);
        ThirdGLEventListener b = new ThirdGLEventListener();
        glcanvas.addGLEventListener(b);
        glcanvas.setSize(400, 400);
        //creating frame
        final JFrame frame = new JFrame("Mid point algorithm by ©Sajjad Ahmed Niloy");
        //adding canvas to frame
        frame.add(glcanvas);
        frame.setSize(640, 480);
        frame.setVisible(true);
    }
}


class ThirdGLEventListener implements GLEventListener {
    private int x0, y0, x1, y1;
    private GLU glu;

    public void init(GLAutoDrawable gld) {
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

        Mid_Point_Algorithm mp = new Mid_Point_Algorithm();
        mp.drawLine(gl, x0, y0, x1, y1);

    }


    public void reshape(GLAutoDrawable drawable, int x, int y, int width,
                        int height) {
    }

    public void dispose(GLAutoDrawable arg0) {

    }
}