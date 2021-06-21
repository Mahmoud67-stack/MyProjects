#include<iostream>
#include<fstream>
#include<vector>
#include<string>
using namespace std;
struct School
{
	string major, college;
};
struct Student
{
	string name;
	string ID;
	School info;
};
void main()
{
	ifstream infile;
	infile.open("infile.txt");
	if (infile.fail())
	{
		cout << "File not found" << endl;
		system("pause");
		exit(1);
	}
	vector<Student> STDlist;
	Student temp;
	string dumb;
	while (!infile.eof())
	{
		getline(infile,temp.name);
		getline(infile, temp.ID);
		getline(infile, temp.info.major);
		getline(infile, temp.info.college);
		STDlist.push_back(temp);
		
	}
	for (int i = 0; i < STDlist.size(); i++)
		cout << STDlist[i].name << endl << STDlist[i].ID << endl << STDlist[i].info.major << endl << STDlist[i].info.college<< endl;
	system("pause");
}