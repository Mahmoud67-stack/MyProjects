#include<iostream>
using namespace std;
class ARR2D
{
public:
	ARR2D()
	{
		Rs = 3; Cs = 4; 
		arr = new double*[Rs]; 
		for (int i = 0; i < Rs; i++) 
			arr[i] = new double[Cs];
	}
	ARR2D(int Rows, int Columns)
	{
		Rs = Rows; 
		Cs = Columns; 
		arr = new double*[Rs]; 
		for (int i = 0; i < Rs; i++) 
			arr[i] = new double[Cs];
	}
	friend ostream &operator<<(ostream &out, ARR2D array1);
	friend istream &operator >> (istream &in, ARR2D array1);
	ARR2D(const ARR2D &array1)
	{
		
		if (Rs != array1.Rs&& Cs != array1.Cs)
		{
			for (int i = 0; i < Rs; i++)
			{
				delete[]arr[i];
			}
			delete[]arr;
			arr = new double*[array1.Rs];
			for (int i = 0; i < array1.Rs; i++)
				arr[i] = new double[array1.Cs];
		}
		for (int i = 0; i < array1.Rs; i++)
		{
			for (int j = 0; j < array1.Cs; j++)
				arr[i][j] = array1.arr[i][j];
		}
	}
	~ARR2D()
	{
		for (int i = 0; i < Rs; i++)
			delete[]arr[i];
		delete[]arr;
	}
	ARR2D &operator=(const ARR2D &array1) 
	{
		if (Rs != array1.Rs&& Cs != array1.Cs)
		{
			for (int i = 0; i < Rs; i++)
				delete[]arr[i];
			delete[]arr;
			arr = new double*[array1.Rs];
			for (int i = 0; i < array1.Rs; i++)
				arr[i] = new double[array1.Cs];
		}
		for (int i = 0; i < array1.Rs; i++)
		{
			for (int j = 0; j < array1.Cs; j++)
				arr[i][j] = array1.arr[i][j];
		}
		return *this;
	}
private:
	int Rs, Cs;
	double**arr;
};
ostream &operator<<(ostream &out, ARR2D array1)
{
	out << "The number of rows are: " << array1.Rs << "\nThe number of columns: " << array1.Cs << endl;
	out << "The number of rows are: " << array1.Rs << "\nThe number of columns: " << array1.Cs << endl;
	for (int i = 0; i < array1.Rs; i++)
	{
		for (int j = 0; j < array1.Cs; j++)
			out << "The element [" << i << "][" << j << "] :" << array1.arr[i][j];
		out << endl;
	}
	return out;
}
istream &operator >> (istream &in, ARR2D array1) 
{
	for (int i = 0; i < array1.Rs; i++)
	{
		for (int j = 0; j < array1.Cs; j++)
		{
			cout << "Enter the element [" << i << "][" << j << "] :";
			in >> array1.arr[i][j];
		}
		cout << endl;
	}
	return in;
}

void main()
{
	int x, y;
	ARR2D D1, D3(6,7);
	cout << "Enter the elemnts for the defult array: " << endl;
	cin >> D1;
	cout << "Enter the number of rows and columns of the non defult array: " << endl;
	cin >> x >> y;
	ARR2D D2(x, y);
	cin >> D2;
	D1 = D3;
	ARR2D D4(D2);
	cout << "The first array: " << D1 << endl << "The second array: " << D2 << endl << "The third array: " << D3 << endl << "The fourth array: " << D4 << endl;
	system("pause");
}