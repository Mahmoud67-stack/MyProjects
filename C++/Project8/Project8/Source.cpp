#include <iostream>
using namespace std;
const float LOW_END = .72;
const float HIGH_END = .87;
int main() {
	int a;
	cout << "Please enter your age: "; cin >> a;
	cout << "Your age is: " << a << endl;
	cout << "Your low  pulse range is: " << (220 - a)*LOW_END << endl;
	cout << "Your high  pulse range is: " << (220 - a)*HIGH_END << endl;
	system("pause");
	return 0;
}
