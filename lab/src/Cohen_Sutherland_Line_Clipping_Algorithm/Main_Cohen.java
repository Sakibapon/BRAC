package Cohen_Sutherland_Line_Clipping_Algorithm;


import javax.media.opengl.*;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.glu.GLU;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Main_Cohen
 * + ------------------------------------------------------------------------------------------------+
 * Description:
 * + ------------------------------------------------------------------------------------------------+
 *
 * @author Sajjad Ahmed Niloy
 * @version 1.0
 * @since 23-Aug-18
 * license   MIT
 * + ------------------------------------------------------------------------------------------------+
 */
public class Main_Cohen {
    public static void main(String args[]) {

        //getting the capabilities object of GL2 profile
        final GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);
        // The canvas
        final GLCanvas glcanvas = new GLCanvas(capabilities);
        Cohen_Sutherland_Line_Clipping_Algorithm b = new Cohen_Sutherland_Line_Clipping_Algorithm();
        glcanvas.addGLEventListener(b);
        glcanvas.setSize(400, 400);
        //creating frame
        final JFrame frame = new JFrame("Cohen Sutherland line clipping by ©Sajjad Ahmed Niloy");
        //adding canvas to frame
        frame.add(glcanvas);
        frame.setSize(640, 480);
        frame.setVisible(true);
    }
}