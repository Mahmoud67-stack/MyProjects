#include<iostream>
#include<string>
#include<vector>
#include<fstream>
using namespace std;
struct Course
{
	string Cocode;
	string Coname;
};
struct Student 
{
	string fname;
	string lname;
	string ID;
	vector <Course>courses;
};
void readfile(string filename, vector<Student>&Std)
{
	int n;
	ifstream infile;
	infile.open(filename);
	if (infile.fail())
	{
		cout << "File not found! ." << endl;
		exit(1);
		system("pause");
	}
	Student stdtemp;
	Course coursetmp;
	infile >> stdtemp.fname >> stdtemp.lname >> stdtemp.ID>>n;
	for (int i = 0; i < n; i++)
	{
		getline(infile, coursetmp.Cocode);
		infile.ignore(1000, '\n');
		getline(infile, coursetmp.Coname);
		stdtemp.courses.push_back(coursetmp);
	}
	Std.push_back(stdtemp);
	while (!infile.eof())
	{
		infile >> stdtemp.fname >> stdtemp.lname >> stdtemp.ID >> n;
		for (int i = 0; i < n; i++)
		{
			getline(infile, coursetmp.Cocode);
			infile.ignore(1000, '\n');
			getline(infile, coursetmp.Coname);
			stdtemp.courses.push_back(coursetmp);
		}
		Std.push_back(stdtemp);
	}
}
void savefile(string filename, vector<Student>&Std)
{
	int n;
	ofstream offile;
	offile.open(filename);
	if (offile.fail())
	{
		cout << "File not found! ." << endl;
		exit(1);
		system("pause");
	}
	for (int i = 0; i < Std.size(); i++)
	{
		offile << Std[i].fname << " " << Std[i].lname << "\n" << Std[i].ID << "\n";
		n = Std[i].courses.size();
		for (int j = 0; j < n; i++)
		{
			offile << n;
			offile << Std[i].courses[j].Cocode << "\n" << Std[i].courses[j].Coname << "\n";
		}
	}
}
int DeleteByFirstName(const vector<Student>&Std, string target)
{
	for (int i = 0; i < Std.size(); i++)
	{
		if (Std[i].fname == target)
			return i;
	}
	return -1;
}
int DeleteByLastName(const vector<Student>&Std, string target)
{
	for (int i = 0; i < Std.size(); i++)
	{
		if (Std[i].lname == target)
			return i;
	}
	return -1;
}
void SearchByCourseCode(const vector<Student>&Std, string target)
{
	for (int i = 0; i < Std.size(); i++)
	{
		for (int j = 0; j < Std[i].courses.size(); j++)
		{
			if (Std[i].courses[j].Cocode == target)
				cout << Std[i].fname << " " << Std[i].lname << " is taking the course" << endl;
		}
	}
}
void SearchByCourseName(const vector<Student>&Std, string target)
{
	for (int i = 0; i < Std.size(); i++)
	{
		for (int j = 0; j < Std[i].courses.size(); j++)
		{
			if (Std[i].courses[j].Coname == target)
				cout << Std[i].fname << " " << Std[i].lname << " is taking the course" << endl;
		}
	}
}
void AddStudent(vector<Student>&Std,Student newstd)
{
	Std.push_back(newstd);
}
void main()
{
	vector<Student>Std;
	string target;
	Student newstd;
	readfile("infile", Std);
	int choice,i,n;
	cout << "Menu: \n1.Delete by last name.\n2.Delete by first name.\n3.Add new Student\n4.Search by course name.\n5.Search by course code.\n6.Exit.\n";
	cin >> choice;
	while (true)
	{
		if (choice == 1)
		{
			cout << "Enter a last name to delete: " << endl;
			cin >> target;
			i = DeleteByLastName(Std,target);
			Std.erase(Std.begin() + i);
		}
		else if (choice == 2)
		{
			cout << "Enter a first name to delete: " << endl;
			cin >> target;
			i = DeleteByFirstName(Std, target);
			Std.erase(Std.begin() + i);
		}
		else if (choice == 3)
		{
			cout << "Enter the first name: " << endl;
			cin >> newstd.fname;
			cout << "Enter the last name: " << endl;
			cin >> newstd.lname;
			cout << "Enter the ID: " << endl;
			cin >> newstd.ID;
			cout << "Enter the number of courses: " << endl;
			cin >> n;
			for (int i = 0; i < n; i++)
			{
				cout << "Enter the code for the course number "<<i<<": " << endl;
				cin >> newstd.courses[i].Cocode;
				cout << "Enter the name for the course number " << i << ": " << endl;
				getline(cin,newstd.courses[i].Coname);
			}
			AddStudent(Std, newstd);
		}
		else if (choice == 4)
		{
			cout << "Enter course name to search for students: " << endl;
			getline(cin, target);
			SearchByCourseName(Std, target);
		}
		else if (choice == 5)
		{
			cout << "Enter course code to search for students: " << endl;
			cin>>target;
			SearchByCourseCode(Std, target);
		}
		else if (choice == 6)
		{
			exit(1);
			system("pause");
		}
		else
		{
			cout << "Invalid choice try again." << endl;
		}
		cout << "Menu: \n1.Delete by last name.\n2.Delete by first name.\n3.Add new Student\n4.Search by course name.\n5.Search by course code.\n6.Exit.\n";
	}
	system("pause");
}