#include<iostream>
#include<fstream>
using namespace std;
void findAverages(int**grades, int R, int C, double* avgStd, double* avgQuiz) 
{
	avgStd = new double[C];
	avgQuiz = new double[R];
	double sum = 0.0;
	for (int i = 0; i < R; i++)
	{
		for (int j = 0; j < C; i++)
			sum += grades[i][j];
		avgStd[i] = (sum / C);
		sum = 0;
	}
	int i;
	for (int j = 0; j < C; j++)
	{
		for ( i = 0; i < R; i++)
			sum += grades[i][j];
		avgQuiz[i] = (sum / R);
		sum = 0;
	}
	cout << "The Students averages are: ";
	for (int i = 0; i < C; i++)
		cout << avgStd[i] << " ";
	cout << endl;
	cout << "The quizzes averages are: ";
	for (int i = 0; i < R; i++)
		cout << avgQuiz[i] << " ";
	cout << endl;
}
void main()
{
	ifstream infile("grades.txt");
	int r, c;
	infile >> r;
	infile >> c;
	int **x = new int*[r];
	for (int i = 0; i < r; i++)
		x[i] = new int[c];
	for (int i = 0; i < r; i++)
	{
		for (int j = 0; j < c; j++)
			infile >> x[i][j];
	}
	double* avgStd = new double[c];
	double* avgQuiz = new double[r];
	findAverages(x, r, c, avgStd, avgQuiz);
	for (int i = 0; i < r; i++)
		delete[]x[i];
	delete[]x;
	system("pause");
}