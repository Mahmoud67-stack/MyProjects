#include<iostream>
using namespace std;
void main()
{
	int x;
	cout << "Please enter the size of the array: " << endl;
	cin >> x;
	int*d = new int[x];
	int*g = d;
	for (int i = 0; i < x; i++)
	{
		*d = rand() % 4;
		d++;
	}
	d = 0;
	cout << "The elements of the array: " << endl;
	for (int i = 0; i < x; i++)
		cout << d[i] << " ";
	cout << endl;
	int max = d[0], min = d[0];
	for (int i = 0; i < x; i++)
	{
		if (*(d + i) > max)
			max = *(d + i);
		if (*(d + i) < min)
			min = *(d + i);
	}
	cout << "The maximum value in the array is: " << max << endl << "The minimum value in the arraym is: " << min << endl;
	for (int i = 0; i < x; i++)
	{
		cout << "The address of d[" << i << "] is: " << d << endl;
		d++;
	}
	system("pause");
	delete[]d;
}