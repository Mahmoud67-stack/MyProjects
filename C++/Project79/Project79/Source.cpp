#include<iostream>
#include<fstream>
using namespace std;
void findAverages(int**grades, int R, int C, double* avgStd, double* avgQuiz)
{
	double sum = 0.0;
	for (int i = 0; i < R; i++)
	{
		for (int j = 0; j < C; j++)
			sum += grades[i][j];
		avgStd[i] = (sum / C);
		sum = 0;
	}
	for (int i = 0; i < C; i++)
	{
		for (int j = 0; j < R; j++)
			sum += grades[j][i];
		avgQuiz[i] = (sum / R);
		sum = 0;
	}
	cout << "The Students averages are: ";
	for (int i = 0; i < R; i++)
		cout << avgStd[i] << " ";
	cout << endl;
	cout << "The quizzes averages are: ";
	for (int i = 0; i < C; i++)
		cout << avgQuiz[i] << " ";
	cout << endl;
}
void main()
{
	ifstream infile("Text.txt");
	int r, c;
	infile >> r >> c;
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
	delete[] avgQuiz;
	delete[] avgStd;
	system("pause");
}