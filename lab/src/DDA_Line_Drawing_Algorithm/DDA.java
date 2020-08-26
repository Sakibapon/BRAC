package DDA_Line_Drawing_Algorithm;

/**
 * DDA
 * + ------------------------------------------------------------------------------------------------+
 * Description: Drawing a line using DDA line drawing algorithm.
 * + ------------------------------------------------------------------------------------------------+
 *
 * @author Sajjad Ahmed Niloy
 * @version 1.0
 * @since 23-Aug-18
 * license   MIT
 * + ------------------------------------------------------------------------------------------------+
 */

import javax.media.opengl.*;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.glu.GLU;
import javax.swing.*;
import java.util.Scanner;


public class DDA {
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
        final JFrame frame = new JFrame("DDA Line drawing algorithm");
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

//        x0 = -200;
//        y0 = -150;
//        x1 = -50;
//        y1 = 150;

        GL2 gl = gld.getGL().getGL2();
        glu = new GLU();

        gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        gl.glViewport(-250, -150, 250, 150);
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluOrtho2D(-250.0, 250.0, -150.0, 150.0);
    }

    public void display(GLAutoDrawable drawable) {
        System.out.println("b--------0" +
                "1" +
                "");
        GL2 gl = drawable.getGL().getGL2();
        gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
        int dx = x0 - x1;
        int dy = y0 - y1;
        float m = dy / dx;
        float x = x0;
        float y = y0;
        System.out.println("----m-------:" + m);
        if (m > 0 && m < 1) {
            System.out.println("+++++0<m&&m<1");

            while (x < x1) {
                int p = (2 * dy) - dx;
                int p1 = 2 * dy;
                int p2 = (2 * dy) - (2 * dx);
                if (p < 0)
                    p += p1;
                else {
                    p += p2;
                    y += .001f;
                }
                x += .001f;
                gl.glVertex2d(x, y);
            }
        } else if (m > -1 && m < 0) {
            System.out.println("+++++-1<m&&m<0");

            while (x < x1) {
                int p = -(2 * dy) - dx;
                int p1 = -2 * dy;
                int p2 = -(2 * dy) - (2 * dx);
                if (p < 0)
                    p += p1;
                else {
                    p += p2;
                    y -= .001f;
                }
                x += .001f;
                gl.glVertex2d(x, y);
            }
        } else if (m > 1) {
            System.out.println("+++++m>1");
            while (y < y1) {
                int p = (2 * dx) - dy;
                int p1 = 2 * dx;
                int p2 = (2 * dx) - (2 * dy);
                if (p < 0)
                    p += p1;
                else {
                    p += p2;
                    y += .001f;
                }
                y += .001f;
                gl.glVertex2d(x, y);
            }
        } else if (m < -1) {
            System.out.println("+++++m<-1");

            while (y1 < y) {
                int p = -(2 * dx) - dy;
                int p2 = -2 * dx;
                int p1 = -(2 * dx) - (2 * dy);
                if (p < 0) {
                    p += p1;
                    x += .001f;
                } else {
                    p += p2;
                }
                y -= .001f;
                gl.glVertex2d(x, y);
            }
        }
    }


    public void reshape(GLAutoDrawable drawable, int x, int y, int width,
                        int height) {
    }

    public void dispose(GLAutoDrawable arg0) {

    }


}
