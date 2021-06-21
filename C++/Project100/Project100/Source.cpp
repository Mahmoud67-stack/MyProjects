#include<iostream>
#include<vector>
#include<string>
#include<fstream>
using namespace std;
class Arr 
{
private:
    double **arr2D;
	int Rs, Cs;
public:
	Arr() { 
		Rs = 3; Cs = 4;
		arr2D = new double*[Rs];
		for (int i = 0; i < Rs; i++)
			arr2D[i] = new double[Cs];
		for (int i = 0; i < Rs; i++)
		{
			for (int j = 0; j < Cs; j++)
				cin >> arr2D[i][j];
		}
	}
	Arr(int Rows, int Columns) { 
		Rs = Rows; Cs = Columns;
		arr2D = new double*[Rs];
		for (int i = 0; i < Rs; i++)
			arr2D[i] = new double[Cs];
		for (int i = 0; i < Rs; i++)
		{
			for (int j = 0; j < Cs; j++)
				cin >> arr2D[i][j];
		}
	}
	friend ostream &operator<<(ostream &mycout , const Arr &Array);
	friend istream &operator >> (istream& mycin, Arr &Array);
	 Arr &operator=(const Arr& Array) 
	{
		 Rs = Array.Rs;
		 Cs = Array.Cs;
		 for (int i = 0; i < Rs; i++)
		 {
			 for (int j = 0; j < Cs; j++)
				 arr2D[i][j] = Array.arr2D[i][j];
		 }
		 return *this;
	}
	Arr(const Arr& Array)
	{
		Rs = Array.Rs;
		Cs = Array.Cs;
		arr2D = new double*[Rs];
		for (int i = 0; i < Rs; i++)
			arr2D[i] = new double[Cs];
		for (int i = 0; i < Rs; i++)
		{
			for (int j = 0; j < Cs; j++)
				arr2D[i][j] = Array.arr2D[i][j];
		}
	}
	~Arr() { for (int i = 0; i < Rs; i++) delete[]arr2D[i]; delete[]arr2D; }
};
ostream & operator << (ostream &mycout, const Arr &Array) {
	mycout << "Number of rwos: " << Array.Rs << endl;
	mycout << "Number of columns: " << Array.Cs << endl;
	for (int i = 0; i < Array.Rs; i++)
	{
		for (int j = 0; j < Array.Cs; j++)
			mycout << Array.arr2D[i][j] << " ";
		mycout << endl;
	}
	return mycout;
}
istream & operator>> (istream&mycin, Arr&Array)
{
	mycin >> Array.Rs >> Array.Cs;
	for (int i = 0; i < Array.Rs; i++)
	{
		for (int j = 0; j < Array.Cs; j++)
			mycin >> Array.arr2D[i][j];
	}
	return mycin;
}
void main()
{
	cout << "Enter the elemnts to the first array: " << endl;
	Arr Array1(2,3), Array2(Array1);
	cout << "The first array: \n" << Array1;
	cout << "The second array: \n" << Array2;
	cout << "Enter the elements for the third array: " << endl;
	Arr Array3(2,4);
	Arr Array4 = Array3;
	cout << "Array4 intialized to Array3 (using = operator) directly after being declared:  " <<endl<<Array4 << endl;
	Array4 = Array2;
	cout << "Array4 intialized to Array2 (using = operator) not in the same line of the declaration: " << endl<< Array4 << endl;
	system("pause");
}