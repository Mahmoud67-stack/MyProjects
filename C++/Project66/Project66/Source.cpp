#include <iostream>
using namespace std;
int main() {
	int x = 25;
	char c = 'W';
	double d = 3.14;
	int *p;
	char *pc;
	double *pd;

	p = &x;
	pd = &d;
	pc = &c;

	d = (*pd) + (*p) + 1.0;
	*pc = 'P';
	cout << "1. d is " << d << endl;
	cout << "2. " << c << endl;
	return 0;
	system("pause");
}
