package Drawing_Star_using_midpoint;

import javax.media.opengl.*;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.glu.GLU;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Star
 * + ------------------------------------------------------------------------------------------------+
 * Description: Drawing a star shape using mid point line drawing algorithm. It takes radius of the
 * star shape as input.
 * + ------------------------------------------------------------------------------------------------+
 *
 * @author Sajjad Ahmed Niloy
 * @version 1.0
 * @since 23-Aug-18
 * license   MIT
 * + ------------------------------------------------------------------------------------------------+
 */
public class Star {
    public static void main(String args[]) {

        //getting the capabilities object of GL2 profile
        final GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);
        // The canvas
        final GLCanvas glcanvas = new GLCanvas(capabilities);
        Drawing_Star b = new Drawing_Star();
        glcanvas.addGLEventListener(b);
        glcanvas.setSize(400, 400);
        //creating frame
        final JFrame frame = new JFrame("Star shape by ©Sajjad Ahmed Niloy");
        //adding canvas to frame
        frame.add(glcanvas);
        frame.setSize(640, 480);
        frame.setVisible(true);
    }
}


class Drawing_Star implements GLEventListener {
    private int x0, y0, x1, y1, r;
    private GLU glu;
    private Mid_Point_Line_Drawer mid_point_line_drawer;

    public void init(GLAutoDrawable gld) {
        mid_point_line_drawer = new Mid_Point_Line_Drawer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Radius:");
        r = scanner.nextInt();
        scanner.close();

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

        ArrayList<Integer> x_list = new ArrayList<>();
        ArrayList<Integer> y_list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            double theta = Math.toRadians(i * 72);
            int _x = (int) (r * Math.cos(theta));
            int _y = (int) (r * Math.sin(theta));
            x_list.add(_x);
            y_list.add(_y);

        }
        for (int i = 0; i < 5; i++) {
            int j = i + 2;
            if (j >= 5)
                j = j % 5;
            mid_point_line_drawer.drawMyLine(gl, x_list.get(i), y_list.get(i), x_list.get(j), y_list.get(j)); //draw line
        }


    }


    public void reshape(GLAutoDrawable drawable, int x, int y, int width,
                        int height) {
    }

    public void dispose(GLAutoDrawable arg0) {

    }
}