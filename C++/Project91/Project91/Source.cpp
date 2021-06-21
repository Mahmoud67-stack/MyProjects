//#include <iostream>
//#include <time.h>
//using namespace std;
//
//int ** removeColumn(int ** in_arr, int R, int C, int& newR)
//{
//
//	bool*rowsToDelete = new bool[R];
//	int count (0), sum = 0;
//	for (int i = 0; i < R; i++)
//	{
//		for (int j = 0; j < C; j++)
//			sum += in_arr[i][j];
//		if (sum == 0)
//		{
//			rowsToDelete[i] = true;
//		}
//		else
//			rowsToDelete[i] = false;
//		sum = 0;
//	}
//	for (int i = 0; i < R; i++)
//		if (rowsToDelete[i] == false)
//			count++;
//
//	newR = R - count;
//
//	for (int i = 0; i < R; i++)
//		if (rowsToDelete[i] == true)
//			cout << rowsToDelete[i] << " ";
//
//	cout << endl;
//
//	int **arr_out = new int*[newR];
//	for (int i = 0; i < newR; i++)
//		arr_out[i] = new int[C];
//
//	int x = 0;
//	for (int i = 0; i < R; i++)
//		for (int j = 0; j < C; j++)
//			if (rowsToDelete[i] == false)
//				arr_out[x++][j] = in_arr[i][j];
//
//	/*1. create a new bool array with R elements
//	bool * rowsToDelete = ...
//	2. loop through the in_arr and
//	a. if a row has all zero values then set rowsToDelete[? ] to true
//	b.keep "count" of number of rows to delete
//
//	3. print out the content of the rowsToDelete array
//
//	4. create a new out_arr that has the same number of columns but fewer number of rows.
//	The new number of rows is = R - count
//
//	5. copy all none zeros rows from in_arr to out_arr
//
//	6. delete in_arr
//	7. return out_arr*/
//	for (int i = 0; i < R; i++)
//	{
//		delete[]in_arr[i];
//	}
//	delete[]in_arr;
//	return arr_out;
//}
//
//
//void main()
//{
//	int R = 7, C = 3;
//	int ** arr;
//
//	/*1.	create arr with RxC*/
//	arr = new int*[R];
//	for (int i = 0; i < R; i++)
//		arr[i] = new int[C];
//	//fill in the array using this code
//	srand(time(NULL)); // to generate diff random numbers
//	cout << "\nInput array" << R << "X" << C << " :\n";
//	for (int r = 0; r < R; r++)
//	{
//		cout << "\n";
//		for (int c = 0; c < C; c++) {
//			arr[r][c] = (rand() % 2)&(rand() % 2);
//			cout << arr[r][c] << " ";
//		}
//	}
//	/*2.	call removeColumn and store result in out_arr
//	3.	print out_arr
//	4.	delete out_arr*/
//	int newR = 0;
//	int **out_arr1 = removeColumn(arr, R, C, newR);
//	for (int i = 0; i < newR; i++)
//	{
//		for (int j = 0; j < C; j++)
//		{
//			cout << "The new arry is: " << out_arr1[i][j];
//		}
//	}
//	for (int i = 0; i < newR; i++)
//	{
//		delete[]out_arr1[i];
//	}
//	delete[]out_arr1;
//
//	system("pause");
//}
#include <iostream>
#include <time.h>
using namespace std;

int ** removeColumn(int ** in_arr, int R, int C, int& newR)
{
	bool * rowsToDelete = new bool[R];
		
	for (int i = 0; i < R; i++)
	{
		rowsToDelete[i] = true;
		for (int j = 0; j < C; j++)
		{
			if (in_arr[i][j] != 0)
				rowsToDelete[i] = false;
		}
	}

	int count(0);
	for (int i = 0; i < R; i++)
		if (rowsToDelete[i] == true)
			count++;
	for (int i = 0; i < R; i++)
		cout << "[" << i << "]: " << rowsToDelete[i] << endl;
	newR = R - count;
	int **out_arr = new int*[newR];
	for (int i = 0; i < newR; i++)
		out_arr[i] = new int[C];

	int x = 0;
	for (int i = 0; i < R; i++)
		if (rowsToDelete[i] == false)
			for (int j = 0; j < C; j++)
				out_arr[x++][j] = in_arr[i][j];

	for (int i = 0; i < R; i++)
		delete[] in_arr[i];
	delete[] in_arr;
	return out_arr;

}


void main()
{
	int R = 7, C = 3;
	int ** arr;

	arr = new int*[R];
	for (int i = 0; i < R; i++)
		arr[i] = new int[C];
	//fill in the array using this code
	srand(time(NULL)); // to generate diff random numbers
	cout << "\nInput array" << R << "X" << C << " :\n";
	for (int r = 0; r < R; r++) {
		cout << "\n";
		for (int c = 0; c < C; c++) {
			arr[r][c] = (rand() % 2)&(rand() % 2);
			cout << arr[r][c] << " ";
		}
	}
	int newR;
	int **out_arr = removeColumn(arr, R, C, newR);
	for (int r = 0; r < newR; r++) {
		cout << "\n";
		for (int c = 0; c < C; c++) {
			cout << out_arr[r][c] << " ";
		}
		for (int i = 0; i < newR; i++)
			delete[] out_arr[i];
		delete[] out_arr;
		system("pause");
	}
}


















