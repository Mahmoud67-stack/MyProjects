#include<iostream>
#include<fstream>
#include<string>
#include<vector>
using namespace std;
void readfile(string filename,vector<string>&fname, vector<string>&lname,vector<int>&phone)
{
	ifstream infile;
	infile.open(filename);
	if (infile.fail())
	{
		cout << "File not found." << endl;
		exit(-1);
		system("pause");
	}
	string f, l;
	int p;
	infile >> f >> l >> p;
	fname.push_back(f);
	lname.push_back(l);
	phone.push_back(p);
	while (!infile.eof())
	{
		infile >> f >> l >> p;
		fname.push_back(f);
		lname.push_back(l);
		phone.push_back(p);
	}
}
int SearchByFirstName(const vector<string>&fname, string target)
{
	for (int i = 0; i < fname.size(); i++)
	{
		if (fname[i] == target)
			return i;
	}
	return -1;
}
int SearchByLastName(const vector<string>&lname, string target)
{
	for (int i = 0; i < lname.size(); i++)
	{
		if (lname[i] == target)
			return i;
	}
	return -1;
}
int SearchByPhone(const vector<int>&phone, int target)
{
	for (int i = 0; i < phone.size(); i++)
	{
		if (phone[i] == target)
			return i;
	}
	return -1;
}
void saveFile(string fileName, vector<string> &fname, vector<string> &lname, vector<int> &phone)
{

	ofstream out(fileName);
	if (out.fail())
	{
		cout << "Can't open output file\n";
		exit(1);
	}
	for (int i = 0; i < fname.size(); i++)
	{
		out << fname.at(i) << " " << lname.at(i) << "  " << phone.at(i) << endl;
	}
	out.flush();
	out.close();
}

void main()
{
	vector<string>fname;
	vector<string>lname;
	vector<int>phone;
	readfile("infile.txt", fname, lname, phone);
	string t1, t2;
	bool x = true;
	int t3,c,i;
	while (x)
	{
		cout << "1. Search By first name.\n2.Search By last name.\n3.Delete By Phone number.\n4.Exit. \n";
		cin >> c;
		if (c == 1)
		{
			cout << "Enter a first name to find." << endl;
			cin >> t1;
			i = SearchByFirstName(fname, t1);
			if (i == -1)
				cout << "Name not found." << endl;
			else
			{
				cout << "The contact is: " << endl;
				cout << fname.at(i) << " " << lname.at(i) << phone.at(i) << endl;
			}
		}
		else if (c == 2)
		{
			cout << "Enter a last name to find." << endl;
			cin >> t2;
			i = SearchByLastName(lname, t1);
			if (i == -1)
				cout << "Name not found." << endl;
			else
			{
				cout << "The contact is: " << endl;
				cout << fname.at(i) << " " << lname.at(i) << phone.at(i) << endl;
			}
		}
		else if (c == 3)
		{
			cout << "Enter a Phone number to delete the contact." << endl;
			cin >> t3;
			i = SearchByLastName(lname, t1);
			if (i == -1)
				cout << "Number not found." << endl;
			else
			{
				fname.erase(fname.begin() + i);
			}
		}
		else if (c == 4)
		{
			cout << "Thank u for running my program :) ." << endl;
			x = false;
		}
		else
			cout << "Unknown choice." << endl;
	}
	system("pause");
}