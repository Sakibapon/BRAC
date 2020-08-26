package Drawing_Square_using_DDA;

import javax.media.opengl.*;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.glu.GLU;
import javax.swing.*;

/**
 * <h1>DDA_Square</h1>
 * + ------------------------------------------------------------------------------------------------+
 * Description: Drawing a square shape using DDA line drawing algorithm.
 * + ------------------------------------------------------------------------------------------------+
 *
 * @author Sajjad Ahmed Niloy
 * @version 1.0
 * @since 23-Aug-18
 * license   MIT
 * + ------------------------------------------------------------------------------------------------+
 */

public class DDA_Square {
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
        final JFrame frame = new JFrame("DDA Square Drawing");
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
    public void display(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();

        gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
//        gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);


        int _x = 0, _y = 0;

        gl.glPushMatrix();
        gl.glTranslatef(-_x, _y, 0);
        drawLine(gl, _x, _y, 100, _y);      //down line
        gl.glTranslatef(0, 0, 0);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslatef(_x, _y, 0);
        gl.glRotatef(90, 0, 0, 1);
        drawLine(gl, _x, _y, 100, _y);      //left line
        gl.glTranslatef(0, 0, 0);
        gl.glPopMatrix();


        gl.glPushMatrix();
        gl.glTranslatef(-_x, 100, 0);
        drawLine(gl, _x, _y, 100, _y);      //up line
        gl.glTranslatef(0, 0, 0);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslatef(100, _y, 0);
        gl.glRotatef(90, 0, 0, 1);
        drawLine(gl, _x, _y, 100, _y);      //right line
        gl.glTranslatef(100, 0, 0);
        gl.glPopMatrix();

    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width,
                        int height) {
    }

    public void displayChanged(GLAutoDrawable drawable,
                               boolean modeChanged, boolean deviceChanged) {
    }

    protected static void drawLine(GL2 gl, float x1, float y1, float x2, float y2) {
        //DDA Line drawing algorithm

        gl.glPointSize(2.0f);
        gl.glBegin(GL2.GL_POINTS);// begin plotting points
        float m = (y2 - y1) / (x2 - x1);
        float xInc, yInc;
        int steps;

        if (Math.abs(m) <= 1) {
            xInc = 1;
            yInc = m;
            steps = (int) (x2 - x1);
        } else {
            xInc = 1 / m;
            yInc = 1;
            steps = (int) (y2 - y1);
        }
        float x = x1, y = y1;
        for (int i = 0; i < steps; i++) {
            x += xInc;
            y += yInc;
            gl.glVertex2f(x, y);

        }

        gl.glEnd();//end drawing of points

    }
    public void dispose(GLAutoDrawable arg0) {

    }
}
