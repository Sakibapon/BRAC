package Cohen_Sutherland_Line_Clipping_Algorithm;

import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


class Line {
    public int x0, y0, x1, y1;

    Line(int x0, int y0, int x1, int y1) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
    }
}

class Cohen_Sutherland_Line_Clipping_Algorithm implements GLEventListener {
    private int x_min, y_min, x_max, y_max;
    private GLU glu;
    private final int TOP = 8, BOTTOM = 4, LEFT = 1, RIGHT = 2;
    private Mid_Point_Line_Drawer mid_point_line_drawer;
    private ArrayList<Line> lineArrayList;

    public void init(GLAutoDrawable gld) {
        lineArrayList = new ArrayList<>();
        mid_point_line_drawer = new Mid_Point_Line_Drawer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x min : ");
        x_min = scanner.nextInt();
        System.out.println("enter y min : ");
        y_min = scanner.nextInt();
        System.out.println("enter x max : ");
        x_max = scanner.nextInt();
        System.out.println("enter y max : ");
        y_max = scanner.nextInt();


//        x_min = -150;
//        y_min = -80;
//        x_max = 150;
//        y_max = 80;

        // TODO: ****** Fix the file path
        File file = new File("F:\\Computer-Graphics-Algorithms\\src\\Cohen_Sutherland_Line_Clipping_Algorithm\\input.txt");
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
            while (stringTokenizer.hasMoreTokens()) {
                int x0 = Integer.parseInt(stringTokenizer.nextToken());
                int y0 = Integer.parseInt(stringTokenizer.nextToken());
                int x1 = Integer.parseInt(stringTokenizer.nextToken());
                int y1 = Integer.parseInt(stringTokenizer.nextToken());
                lineArrayList.add(new Line(x0, y0, x1, y1));
            }
        }
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

        mid_point_line_drawer.drawMyLine(gl, x_min, y_min, x_min, y_max);
        mid_point_line_drawer.drawMyLine(gl, x_min, y_min, x_max, y_min);
        mid_point_line_drawer.drawMyLine(gl, x_min, y_max, x_max, y_max);
        mid_point_line_drawer.drawMyLine(gl, x_max, y_min, x_max, y_max);


        for (Line eachline : lineArrayList) {
            cohen_sutherland(gl, eachline.x0, eachline.y0, eachline.x1, eachline.y1);
        }
    }


    private void cohen_sutherland(GL2 gl, int x0, int y0, int x1, int y1) {
        int code0, code1, x = 0, y = 0;
        code0 = getCode(x0, y0);
        code1 = getCode(x1, y1);
        while (true) {
            if ((code0 | code1) == 0) //----completely accepted --- line will be colored green
            {
                System.out.println("Accepted");
                gl.glColor3f(0, 1, 0);
                mid_point_line_drawer.drawMyLine(gl, x0, y0, x1, y1);
                gl.glColor3f(1, 1, 1);
                break;
            } else if ((code0 & code1) != 0) //----completely rejected --- line will be colored red
            {
                System.out.println("rejected");
                gl.glColor3f(1, 0, 0);
                mid_point_line_drawer.drawMyLine(gl, x0, y0, x1, y1);
                gl.glColor3f(1, 1, 1);
                break;
            } else //partially accepted
            {
                System.out.println("partially");
                gl.glColor3f(1, 0, 0);
                mid_point_line_drawer.drawMyLine(gl, x0, y0, x1, y1);
                gl.glColor3f(1, 1, 1);
                int code = (code0 != 0) ? code0 : code1;

                if ((code & TOP) != 0) {
                    y = y_max;
                    x = x0 + ((x1 - x0) * (y - y0) / (y1 - y0));
                } else if ((code & BOTTOM) != 0) {
                    y = y_min;
                    x = x0 + ((x1 - x0) * (y - y0) / (y1 - y0));
                } else if ((code & LEFT) != 0) {
                    x = x_min;
                    y = y0 + ((y1 - y0) * (x - x0) / (x1 - x0));
                } else if ((code & RIGHT) != 0) {
                    x = x_max;
                    y = y0 + ((y1 - y0) * (x - x0) / (x1 - x0));
                }
                if (code == code0) {
                    x0 = x;
                    y0 = y;
                    code0 = getCode(x0, y0);
                } else {
                    x1 = x;
                    y1 = y;
                    code1 = getCode(x1, y1);
                }
            }
        }
    }

    private int getCode(int x, int y) {
        int code = 0;
        if (x > x_max)
            code += RIGHT;
        if (y > y_max)
            code += TOP;
        if (x < x_min)
            code += LEFT;
        if (y < y_min)
            code += BOTTOM;

        return code;
    }


    public void reshape(GLAutoDrawable drawable, int x, int y, int width,
                        int height) {
    }

    public void dispose(GLAutoDrawable arg0) {

    }
}
