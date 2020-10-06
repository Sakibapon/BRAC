package Bresenham_Line_Drawing_Algorithm;

import javax.media.opengl.*;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.glu.GLU;
import javax.swing.*;
import java.util.Scanner;


public class Bresenham {
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
        final JFrame frame = new JFrame("Bresenham");
        //adding canvas to frame
        frame.add(glcanvas);
        frame.setSize(640, 480);
        frame.setVisible(true);
    }
}


class ThirdGLEventListener implements GLEventListener {
    /**
     * Interface to the GLU library.
     */
    private GLU glu;

    /**
     * Take care of initialization here.
     */
    @Override
    public void init(GLAutoDrawable gld) {
        GL2 gl = gld.getGL().getGL2();
        glu = new GLU();

        gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        gl.glViewport(-250, -150, 250, 150);
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluOrtho2D(-250.0, 250.0, -150.0, 150.0);
    }

    /**
     * Take care of drawing here.
     */
    @Override
    public void display(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
        Scanner sc = new Scanner(System.in);
        gl.glClear(GL2.GL_COLOR_BUFFER_BIT);

        gl.glColor3f(1, 1, 1);
        gl.glBegin(GL2.GL_POINTS);

//Line input
        System.out.println("Enter value of x0");
        double x0 = sc.nextDouble();
        System.out.println("Enter value of y0");
        double y0 = sc.nextDouble();
        System.out.println("Enter value of x1");
        double x1 = sc.nextDouble();
        System.out.println("Enter value of y1");
        double y1 = sc.nextDouble();

//        double x0 = 1, x1 = 30, y0 = -10, y1 = -100;
        sc.close();
        double x = x0;
        double y = y0;
        double k = 0.0;

        double dx = x1 - x0;
        double dy = y1 - y0;

        double m = dy / dx;

        System.out.println("slop is" + m);

        // slop : 0<m<1

        if (m > 0 && m < 1) {
            double p = 2 * dy - dx; // initial decision parameter
            double p1 = 2 * dy;
            double p2 = (2 * dy) - (2 * dx);

            while (k < Math.abs(dx)) {


                gl.glVertex2d(x, y);
                if (p > 0) {
                    p = p + p2;
                    x++;
                    y++;
                } else {
                    p = p + p1;
                    x++;
                }

                gl.glVertex2d(x, y);
                k++;
            }
        }
        //slop greater than 1
        else if (m > 1) {
            gl.glVertex2d(x, y);
            double p = 2 * dx - dy;
            double p1 = 2 * dx;
            double p2 = (2 * dx) - (2 * dy);

            while (k < Math.abs(dx)) {
                if (p < 0) {

                    p += p1;

                    y++;

                } else {

                    p += p2;
                    x++;
                    y++;
                }

                gl.glVertex2d(x, y);

                k++;
            }

        }
        //slope : -1<m<0
        else if (m > -1 && m < 0) {
            gl.glVertex2d(x, y);
            double p = -2 * dy - dx;
            double p1 = -2 * dy;
            double p2 = -2 * dy - 2 * dx;
            while (k < Math.abs(dx)) {
                if (p < 0) {
                    p = p + p1;
                    x++;
                } else {
                    p = p + p2;
                    x++;
                    y--;
                }

                gl.glVertex2d(x, y);
                k++;
            }
        }
        //slope: m<-1
        else {
            gl.glVertex2d(x, y);
            double p = -2 * dx - dy;
            double p1 = -2 * dx - 2 * dy;
            double p2 = -2 * dx;
            while (k < Math.abs(dx)) {
                if (p < 0) {
                    p = p + p1;
                    x++;
                    y--;
                } else {
                    p = p + p2;
                    y--;
                }
                gl.glVertex2d(x, y);
                k++;
            }
        }
        gl.glEnd();
    }


    public void reshape(GLAutoDrawable drawable, int x, int y, int width,
                        int height) {
    }

    public void dispose(GLAutoDrawable arg0) {

    }
}
