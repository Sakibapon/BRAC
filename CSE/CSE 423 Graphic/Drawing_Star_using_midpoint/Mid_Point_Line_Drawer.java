package Drawing_Star_using_midpoint;

import javax.media.opengl.GL2;


public class Mid_Point_Line_Drawer
{
    protected void drawMyLine(GL2 gl, int x0, int y0, int x1, int y1)
    {
        int zone = findZone(x0, y0, x1, y1);
        if (zone == 0)
            drawLine0(gl, x0, y0, x1, y1, 0);
        else if (zone == 1)
            drawLine1(gl, x0, y0, x1, y1, 1);
        else if (zone == 2)
            drawLine2(gl, x0, y0, x1, y1, 2);
        else if (zone == 3)
            drawLine3(gl, x0, y0, x1, y1, 3);
        else if (zone == 4)
            drawLine4(gl, x0, y0, x1, y1, 4);
        else if (zone == 5)
            drawLine5(gl, x0, y0, x1, y1, 5);
        else if (zone == 6)
            drawLine6(gl, x0, y0, x1, y1, 6);
        else if (zone == 7)
            drawLine7(gl, x0, y0, x1, y1, 7);
    }

    private int findZone(int x0, int y0, int x1, int y1)
    {
        int dx = x1 - x0, dy = y1 - y0;

        if (Math.abs(dx) >= Math.abs(dy))
        { //zone 0, 3, 4, 7
            if (dy >= 0 && dx >= 0)
                return 0;
            else if (dx < 0 && dy >= 0)
                return 3;
            else if (dx < 0 && dy < 0)
                return 4;
            else return 7;
        } else
        { //zone 1,2,5,6
            if (dy >= 0 && dx >= 0)
                return 1;
            else if (dx < 0 && dy >= 0)
                return 2;
            else if (dx < 0 && dy < 0)
                return 5;
            else return 6;
        }
    }

    private void drawLine0(GL2 gl, int x0, int y0, int x1, int y1, int zone)
    {
        float dx = x1 - x0, dy = y1 - y0;
        float dE = dy;
        float dNE = (dy - dx);
        float d = (dy) - dx;
        float x = x0, y = y0;

        gl.glPointSize(2.0f);
        gl.glBegin(GL2.GL_POINTS);
        gl.glVertex2f(x, y);

        while (x <= x1)
        {
            if (d < 0)
            {
                x++;
                d = d + dE;

            } else
            {
                x++;
                y++;
                d = d + dNE;
            }
            gl.glVertex2f(x, y);
        }
        gl.glEnd();

    }

    private void drawLine1(GL2 gl, int x0, int y0, float x1, int y1, int zone)
    {
        float dx = x1 - x0, dy = y1 - y0;
        float dN = -dx;
        float dNE = (dy - dx);
        float d = (dy / 2) - (dx);
        float x = x0, y = y0;

        gl.glPointSize(2.0f);
        gl.glBegin(GL2.GL_POINTS);
        gl.glVertex2f(x, y);

        while (y <= y1)
        {
            if (d >= 0)
            {
                y++;
                d = d + dN;

            } else
            {
                y++;
                x++;
                d = d + dNE;

            }
            gl.glVertex2f(x, y);
        }
        gl.glEnd();
    }

    private void drawLine2(GL2 gl, int x0, int y0, float x1, int y1, int zone)
    {
        float dx = x1 - x0, dy = y1 - y0;
        float dN = -dx;
        float dNW = (-dy - dx);
        float d = (-dy / 2) - (dx);
        float x = x0, y = y0;

        gl.glPointSize(2.0f);
        gl.glBegin(GL2.GL_POINTS);
        gl.glVertex2f(x, y);

        while (y <= y1)
        {
            if (d < 0)
            {
                y++;
                d = d + dN;

            } else
            {
                y++;
                x--;
                d = d + dNW;

            }
            gl.glVertex2f(x, y);
        }
        gl.glEnd();
    }

    private void drawLine3(GL2 gl, int x0, int y0, float x1, int y1, int zone)
    {
        float dx = x1 - x0, dy = y1 - y0;
        float dW = -dy;
        float dNW = (-dy - dx);
        float d = (-dy) - (dx / 2);
        float x = x0, y = y0;

        gl.glPointSize(2.0f);
        gl.glBegin(GL2.GL_POINTS);
        gl.glVertex2f(x, y);

        while (x1 <= x)
        {
            if (d >= 0)
            {
                x--;
                d = d + dW;
            } else
            {
                y++;
                x--;
                d = d + dNW;
            }
            gl.glVertex2f(x, y);
        }
        gl.glEnd();
    }

    private void drawLine4(GL2 gl, int x0, int y0, float x1, int y1, int zone)
    {
        float dx = x1 - x0, dy = y1 - y0;
        float dW = -dy;
        float dSW = (-dy + dx);
        float d = (-dy) + (dx / 2);
        float x = x0, y = y0;

        gl.glPointSize(2.0f);
        gl.glBegin(GL2.GL_POINTS);
        gl.glVertex2f(x, y);

        while (x1 <= x)
        {
            if (d >= 0)
            {
                x--;
                y--;
                d = d + dSW;
            } else
            {
                x--;
                d = d + dW;
            }
            gl.glVertex2f(x, y);
        }
        gl.glEnd();
    }

    private void drawLine5(GL2 gl, int x0, int y0, float x1, int y1, int zone)
    {
        float dx = x1 - x0, dy = y1 - y0;
        float dS = dx;
        float dSW = (-dy + dx);
        float d = -(dy / 2) + (dx);
        float x = x0, y = y0;

        gl.glPointSize(2.0f);
        gl.glBegin(GL2.GL_POINTS);
        gl.glVertex2f(x, y);

        while (y1 <= y)
        {
            if (d < 0)
            {
                x--;
                y--;
                d = d + dSW;

            } else
            {
                y--;
                d = d + dS;
            }
            gl.glVertex2f(x, y);
        }
        gl.glEnd();
    }

    private void drawLine6(GL2 gl, int x0, int y0, float x1, int y1, int zone)
    {
        float dx = x1 - x0, dy = y1 - y0;
        float dS = dx;
        float dSE = (dy + dx);
        float d = (dy / 2) + (dx);
        float x = x0, y = y0;

        gl.glPointSize(2.0f);
        gl.glBegin(GL2.GL_POINTS);
        gl.glVertex2f(x, y);

        while (y1 <= y)
        {
            if (d >= 0)
            {
                x++;
                y--;
                d = d + dSE;

            } else
            {
                y--;
                d = d + dS;
            }
            gl.glVertex2f(x, y);
        }
        gl.glEnd();
    }

    private void drawLine7(GL2 gl, int x0, int y0, float x1, int y1, int zone)
    {
        float dx = x1 - x0, dy = y1 - y0;
        float dE = dy;
        float dSE = (dy + dx);
        float d = (dy) + (dx / 2);
        float x = x0, y = y0;

        gl.glPointSize(2.0f);
        gl.glBegin(GL2.GL_POINTS);
        gl.glVertex2f(x, y);

        while (x <= x1)
        {
            if (d >= 0)
            {
                x++;
                d = d + dE;

            } else
            {
                x++;
                y--;
                d = d + dSE;
            }
            gl.glVertex2f(x, y);
        }
        gl.glEnd();
    }
}
