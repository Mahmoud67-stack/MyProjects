//This is the file: pfarraydbak.cpp. 
//This is the implementation of the class PFArrayDBak.
//The interface for the class PFArrayDBak is in the file pfarraydbak.h.
#include "pfarraydbak.h"
#include <iostream>
using namespace std;

PFArrayDBak::PFArrayDBak() : PFArrayD(), capacityB(capacity /*of parent*/), usedB(0)
{
	b = new double[capacityB];
}

PFArrayDBak::PFArrayDBak(int capacityValue) : PFArrayD(capacityValue), capacityB(capacityValue), usedB(0)
{
	b = new double[capacityB];
}

PFArrayDBak::PFArrayDBak(const PFArrayDBak& oldObject)
	: PFArrayD(oldObject), usedB(0)
{
	capacityB = oldObject.capacityB;
	usedB = oldObject.usedB;

	b = new double[capacityB];
	for (int i = 0; i < usedB; i++)
		b[i] = oldObject.b[i];
}

void PFArrayDBak::backup()
{
	usedB = used; /*inherited from parent*/
	for (int i = 0; i < usedB; i++)
		b[i] = at(i); /*function at() of parent class*/
					  //b[i] = PFArrayD::at(i); //same as the line above
}

void PFArrayDBak::restore()
{
	emptyArray(); /*a function of the parent*/
				  //PFArrayD::emptyArray(); //same as the line above

	for (int i = 0; i < usedB; i++)
		addElement(b[i]);
	//PFArrayD::addElement(b[i]); //same as te line above
}

void PFArrayDBak::operator =(const PFArrayDBak& rightSide)
{
	PFArrayD::operator =(rightSide);

	if (capacityB != rightSide.capacityB)
	{
		delete[] b;
		b = new double[rightSide.capacityB];
	}

	usedB = rightSide.usedB;
	for (int i = 0; i < usedB; i++)
		b[i] = rightSide.b[i];

}
void PFArrayDBak::print()
{
	for (int i = 0; i < usedB; i++)
	{
		cout << b[i] << " ";
		cout << endl;
	}
}
PFArrayDBak::~PFArrayDBak()
{
	cout << "PFArrayDBak destractor called!" << endl;
	delete[] b;
}
