#include <iostream>
#include <string>
using namespace std;

void main()
{
	//--Test 1: mixing cin and getline
	cout << "\nTest1=================================\n";
	int i;
	string str;
	cout << "Enter an interger: "; cin >> i;
	cin.ignore(1000, '\n'); // read and ignore '\n' 
	cout << "Enter a string: ";
	getline(cin, str);
	cout << "string is: " << str;

	//--Test 2: Error checking with .at(), more on this later
	cout << "\nTest2=================================\n";
	string s("Mary");
	try {
		//cout << s[6] << endl;
		cout << s.at(6) << endl;
	}
	catch (exception e) {
		cout << "Out of baoundaries error !\n ";
	}


	//Test 3: C++ functions
	cout << "\nTest3=================================\n";
	string s1("this is C++ strings!");
	string s2(s1);// copies the value of s1 into s2

	string s3 = s1.substr(8, 3);  // substr() return a string that is stored in the left hand side 's3'
	cout << "s3 = " << s3 << endl;
	s1.insert(0, s3 + " "); // insert() will make space into 's1' and insert 's3 concatenated with a space'
	cout << "\nTest s1.insert(0, s3+" ");\n";
	cout << "s1 = " << s1 << endl;
	s1.erase(0, 4);
	cout << "\nTest s1.erase(0, 4);\n";
	cout << "s1 = " << s1 << endl;

	int pos = s1.find("C++", 9); // find() finds the first occurrence of "C++" and returns its position. If not found then -1 is returned
	cout << "pos = " << pos << endl;

	//Test 4: find all Occurrences
	cout << "\nTest4=================================\n";
	string s4 = "I like CMP120, CMP220 , CMP354 and CMP491!";
	cout << "Search for CMP in: " << s4 << endl;
	pos = s4.find("CMP", 0);
	while (pos != -1)
	{
		cout << "found at pos: " << pos << endl;
		pos = s4.find("CMP", pos + 1 /*continue searching, use: old position + 1*/);
	}

	system("pause");
}