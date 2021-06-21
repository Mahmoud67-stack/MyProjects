//Program to demonstrate the class PFArrayDBak. 
#include <iostream>
#include "pfarraydbak.h"
using namespace std;

void testPFArrayDBak();
//Conducts one test of the class PFArrayDBak.

//----HW5: write a new main according to the HW5

int main()
{
	cout << "This program tests the class PFArrayDBak.\n";
	char ans;
	do
	{
		testPFArrayDBak();
		cout << "Test again? (y/n) ";
		cin >> ans;
	} while ((ans == 'y') || (ans == 'Y'));
	cout << "to test the memory dealocation: " << endl;
	PFArrayD* ArrayD = new PFArrayDBak();
	ArrayD[0].print();
	delete ArrayD;
	return 0;
}

void testPFArrayDBak()
{
	int cap;
	cout << "Enter capacity of this super array: ";
	cin >> cap;
	PFArrayDBak backUpArr(cap);

	cout << "Enter up to " << cap << " nonnegative numbers.\n";
	cout << "Place a negative number at the end.\n";

	double next;

	cin >> next;
	while ((next >= 0) && (!backUpArr.full()))
	{
		backUpArr.addElement(next);
		cin >> next;
	}

	if (next >= 0)
	{
		cout << "Could not read all numbers.\n";
		//Clear the unread input:
		while (next >= 0)
			cin >> next;
	}

	int count = backUpArr.getNumberUsed();
	cout << "The following " << count
		<< " numbers read and stored:\n";
	int index;
	for (index = 0; index < count; index++)
		cout << backUpArr.at(index) << " ";
	cout << endl;

	cout << "Backing up array.\n";
	backUpArr.backup();

	cout << "emptying array.\n";
	backUpArr.emptyArray();
	cout << backUpArr.getNumberUsed()
		<< " numbers are now stored in the array.\n";

	cout << "Restoring array.\n";
	backUpArr.restore();
	count = backUpArr.getNumberUsed();
	cout << "The following " << count
		<< " numbers are now stored:\n";
	for (index = 0; index < count; index++)
		cout << backUpArr.at(index) << " ";
	cout << endl;
}
