#include<iostream>
using namespace std;
double* addValue(double* arr_in, int& size, double newValue)
{
	int u;
	double*arr_out = new double[size + 1];
	for (int i = 0; i < size + 1; i++)
	{
		if (i == size)
			arr_out[i] = newValue;
		else
			arr_out[i] = arr_in[i];
	}
	return arr_out;
	delete[]arr_out;
}
double* deleteValue(double* arr_in, int& size, double newToDel)
{
	int u;
	double*arr_out = new double[size - 1];
	for (int i = 0; i < size; i++)
	{
		if (arr_in[i] == newToDel)
			u = i;
	}
	if (u >= 0 || u < size);
	else
		return arr_in;
	for (int i = 0; i < u; i++)
	{
		arr_out[i] = arr_in[i];
	}
	for (int i = u; i < size - 1; i++)
	{
		arr_out[i] = arr_in[i + 1];
	}
	return arr_out;
	delete[]arr_out;
}
void printArr(double* arr_in, int size)
{
	for (int i = 0; i < size; i++)
		cout << arr_in[i] << " ";
}
void main()
{
	int x;
	cout << "Please enter the size of the array: " << endl;
	cin >> x;
	double*d = new double[x];
	cout << "Please enter the values for the array: " << endl;
	for (int i = 0; i < x; i++)
		cin >> d[i];
	double c;
	cout << "Please enter a value to add: " << endl;
	cin >> c;
	cout << "The new array is: " << endl;
	printArr(addValue(d, x, c), x + 1);
	cout << endl;
	double h;
	cout << "Please enter a value to delete from the original array: " << endl;
	cin >> h;
	cout << "The new array is: " << endl;
	printArr(deleteValue(d, x, h),x-1);
	cout << endl;
	delete[]d;
	system("pause");
}