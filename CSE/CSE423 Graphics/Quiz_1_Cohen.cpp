
#include <iostream>
using namespace std;

const int INSIDE = 0; // 0000
const int LEFT = 1; // 0001
const int RIGHT = 2; // 0010
const int BOTTOM = 4; // 0100
const int TOP = 8; // 1000

const int x_max = 276;
const int y_max = 131;
const int x_min = -131;
const int y_min = -113;

int computeCode(double x, double y)
{
	int code = INSIDE;

	if (x < x_min) // to the left of rectangle
		code |= LEFT;
	else if (x > x_max) // to the right of rectangle
		code |= RIGHT;
	if (y < y_min) // below the rectangle
		code |= BOTTOM;
	else if (y > y_max) // above the rectangle
		code |= TOP;

	return code;
}

void cohenSutherlandClip(double x1, double y1,
						double x2, double y2)
{
	int code1 = computeCode(x1, y1);
	int code2 = computeCode(x2, y2);
    cout << "Code A: " << code1 << endl;
    cout << "Code B: " << code2 << endl;
	bool accept = false;
    string primeA = "'";
    string primeB = "'";
	while (true) {
		if ((code1 == 0) && (code2 == 0)) {
			accept = true;
			break;
		}
		else if (code1 & code2) {
			break;
		}
		else {
			int code_out;
			double x, y;
			// rectangle, pick it.
			if (code1 != 0)
				code_out = code1;
			else
				code_out = code2;
			if (code_out & TOP) {
				x = x1 + (x2 - x1) * (y_max - y1) / (y2 - y1);
				y = y_max;
			}
			else if (code_out & BOTTOM) {
				x = x1 + (x2 - x1) * (y_min - y1) / (y2 - y1);
				y = y_min;
			}
			else if (code_out & RIGHT) {
				y = y1 + (y2 - y1) * (x_max - x1) / (x2 - x1);
				x = x_max;
			}
			else if (code_out & LEFT) {
				y = y1 + (y2 - y1) * (x_min - x1) / (x2 - x1);
				x = x_min;
			}
			if (code_out == code1) {
				x1 = x;
				y1 = y;
				code1 = computeCode(x1, y1);
				cout << "Coordinates of A" << primeA << ": " << x1 << "," << y1 << endl;
				cout << "Code A" << primeA << ": " << code1 << endl;
				primeA += "'";
			}
			else {
				x2 = x;
				y2 = y;
				code2 = computeCode(x2, y2);
				cout << "Coordinates of B" << primeB << ": " << x2 << "," << y2 << endl;
				cout << "Code B" << primeB << ": " << code2 << endl;
				primeB += "'";
			}
		}
	}
	if (accept) {
		cout << "Line accepted from " << x1 << ", "
			<< y1 << " to " << x2 << ", " << y2 << endl;
	}
	else
		cout << "Line rejected" << endl;
}

int main()
{
	// A = (-33, 63), B = (315, 191)
	//cohenSutherlandClip(3, 26, -354, 142);
	//cohenSutherlandClip(27, 79, 312, -114);
	//cohenSutherlandClip(-223, -23, -335, -147);
	//cohenSutherlandClip(163, 87, -210, -126);
	cohenSutherlandClip(77, 14, -168, 194);
	return 0;
}
