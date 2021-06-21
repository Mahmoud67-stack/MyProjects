#include<iostream>
#include<fstream>
#include<vector>
#include<string>
using namespace std;
void main()
{
	string fname;
	cout << "Give me file name:\n";
	cin >> fname;
	ifstream infile;
	infile.open(fname);
	if (infile.fail())
	{
		cout << "infile is not found." << endl;
		system("pause");
		exit(1);
	}
	ofstream outfile;
	outfile.open("grades_from_avg.txt");
	if (outfile.fail())
	{
		cout << "outfile is not found." << endl;
		system("pause");
		exit(1);
	}
	vector<string>f;
	vector<string>l;
	vector<double>g;
	int a;
	string first;
	string last;
	float s;
	infile >> a;
	float sum = 0, ave;
	for(int i = 0; i < a; i++)
	{
		infile >> first;
		f.push_back(first);
		infile >> last;
		l.push_back(last);
		infile >> s;
		g.push_back(s);
		sum += s;
	}
	ave = sum / a;
	for (int i = 0; i < a; i++)
	{
		outfile << f[i] << " " << l[i] << " " << (g[i] - ave) << endl;
	}
	infile.close();
	outfile.close();
	system("pause");
}