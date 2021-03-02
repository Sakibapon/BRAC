#include <GLUT/glut.h>
#include <iostream>
#include <vector>
#include <cmath>

#define max2(a, b) (a > b ? a : b)
#define min2(a, b) (a < b ? a : b)
#define min3(a, b, c) min2(a, min2(b, c))
#define max3(a, b, c) max2(a, max2(b, c))

template<typename T>
struct Vec3 {
    T x, y, z;

    Vec3() : x(T(0)), y(T(0)), z(T(0)) {}
    Vec3(T x) : x(x), y(x), z(x) {}
    Vec3(T x, T y, T z) : x(x), y(y), z(z) {}

    Vec3& normalize() {
        T nor2 = dot(*this);

        if (nor2 > 0) {
            T invNor = 1 / sqrt(nor2);
            x *= invNor, y *= invNor, z *= invNor;
        }

        return *this;
    }
    Vec3<T> operator * (const T& f) const {
        return Vec3<T>(x * f, y * f, z * f);
    }
    T operator * (const Vec3<T>& v) const {
        return x * v.x + y * v.y + z * v.z;
    }
    T cross(const Vec3<T>& v) const {
        return x * v.y - y * v.x;
    }
    Vec3<T> operator - (const Vec3<T>& v) const {
        return Vec3<T>(x - v.x, y - v.y, z - v.z);
    }
    Vec3<T> operator + (const Vec3<T>& v) const {
        return Vec3<T>(x + v.x, y + v.y, z + v.z);
    }
    Vec3<T>& operator += (const Vec3<T>& v) {
        x += v.x, y += v.y, z += v.z;

        return *this;
    }
    Vec3<T>& operator *= (const Vec3<T>& v) {
        x *= v.x, y *= v.y, z *= v.z;

        return *this;
    }
    Vec3<T> operator - () const {
        return Vec3<T>(-x, -y, -z);
    }
    T length() const {
        return sqrt(x * x + y * y + z * z);
    }

    friend std::ostream & operator << (std::ostream &os, const Vec3<T> &v) {
        os << "[" << v.x << " " << v.y << " " << v.z << "]";
        return os;
    }
};

typedef Vec3<GLfloat> Vec3f;

const char *title = "Cyrus-Beck";

std::vector<Vec3f> window;

/* Initialize OpenGL Graphics */
void initGL() {
    glClearColor(1.0f, 1.0f, 1.0f, 1.0f); // Set background color to white and opaque
    glClearDepth(1.0f);                   // Set background depth to farthest
    glEnable(GL_DEPTH_TEST);   // Enable depth testing for z-culling
    glDepthFunc(GL_LEQUAL);    // Set the type of depth-test
    glShadeModel(GL_SMOOTH);   // Enable smooth shading
    glHint(GL_PERSPECTIVE_CORRECTION_HINT, GL_NICEST);  // Nice perspective corrections
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluOrtho2D(-10, 10, -10, 10);
    glMatrixMode(GL_MODELVIEW);     // To operate on model-view matrix
}

void cohen_sutherland(Vec3f p0, Vec3f p1, Vec3f& q0, Vec3f& q1) {
    Vec3f dir = p1 - p0;
    Vec3f center(0);

    for (auto& a : window) {
        center += a;
    }

    center *= ((GLfloat) 1 / window.size());
    std::cout << "Center: " << center << "\n";

    for (size_t i = 0; i < window.size(); i++) {
        Vec3f a0 = window[i];
        Vec3f a1 = window[(i + 1) % window.size()];
        Vec3f adir = a1 - a0;
        Vec3f n;

        if (adir * (a1 - center) == 0) {
            n = a1 - center;
        }
        else {
            GLfloat k = -(adir * (a0 - center)) / (adir * (a1 - center));
            n = (a0 - center) + ((a1 - center) * k);
        }

        if (dir * n != 0) {
            GLfloat t = (a0 - p0).cross(adir) / dir.cross(adir),
                    u = (p0 - a0).cross(dir) / adir.cross(dir);

            std::cout << "T, U: " << t << ", " << u << "\n";

            if (t <= 1 && t >= 0 && u >= 0 && u <= 1) {
                std::cout << "Found!\n";

                if (dir * n < 0) {
                    q0 = a0 + (adir * u);
                }
                else {
                    q1 = a0 + (adir * u);
                }
            }
            else {
                std::cout << "Not found!\n";
            }
        }
        else {
            std::cout << "Parallel!\n";
        }
    }

    std::cout << "P0 " << p0 << " P1 " << p1 << " Q0 " << q0 << " Q1 " << q1 << "\n";
}

void display() {
    Vec3f p0(-5, -8, 0), p1(4, 5, 0), q0 = p0, q1 = p1;
    cohen_sutherland(p0, p1, q0, q1);

    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT); // Clear color and depth buffers

    glColor3f(0.0, 0.0, 1.0);
    glBegin(GL_LINE_LOOP);
    for(auto& a : window) {
        glVertex2f(a.x, a.y);
    }
    glEnd();  // End of drawing window

    glColor3f(1.0, 0.0, 0.0);
    glBegin(GL_LINES);
        glVertex2f(p0.x, p0.y);
        glVertex2f(p1.x, p1.y);
    glEnd();

    glColor3f(0.0, 1.0, 0.0);
    glBegin(GL_LINES);
        glVertex2f(q0.x, q0.y);
        glVertex2f(q1.x, q1.y);
    glEnd();

    glFlush();
}

/* Main function: GLUT runs as a console application starting at main() */
int main(int argc, char** argv) {
    window.push_back(Vec3f(0, 0, 0));
    window.push_back(Vec3f(2, 0, 0));
    window.push_back(Vec3f(3, 4, 0));
    window.push_back(Vec3f(2, 5, 0));
    window.push_back(Vec3f(-2, 1, 0));

    glutInit(&argc, argv);                                    // Initialize GLUT
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB | GLUT_DEPTH); // Enable double buffered mode
    glutInitWindowSize(500, 500);                             // Set the window's initial width & height
    glutCreateWindow(title);                                  // Create window with the given title
    glutDisplayFunc(display);                                 // Register callback handler for window re-paint event
    initGL();                                                 // Our own OpenGL initialization
    glutMainLoop();                                           // Enter the infinite event-processing loop
    return 0;
}
