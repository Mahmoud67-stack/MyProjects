//This is the implementation file pfarrayd.cpp.
#include <iostream>
using namespace std;
#include "pfarrayd.h"

PFArrayD::PFArrayD() : capacity(50), used(0)
{
	a = new double[capacity];
}

PFArrayD::PFArrayD(int size) : capacity(size), used(0)
{
	a = new double[capacity];
}

PFArrayD::PFArrayD(const PFArrayD& pfaObject)
	: capacity(pfaObject.capacity), used(pfaObject.used)
{
	a = new double[capacity];
	for (int i = 0; i < used; i++)
		a[i] = pfaObject.a[i];
}
double PFArrayD::at(int index)
{
	if (index >= used)
	{
		cout << "Illegal index in PFArrayD.\n";
		exit(0);
	}
	return a[index];
}
//double& PFArrayD::operator[](int index)
//{
//    if (index >= used)
//    {
//        cout << "Illegal index in PFArrayD.\n";
//        exit(0);
//    }
//
//    return a[index];
//}

void PFArrayD::operator =(const PFArrayD& rightSide)
{
	if (capacity != rightSide.capacity)
	{
		delete[] a;
		a = new double[rightSide.capacity];
	}

	capacity = rightSide.capacity;
	used = rightSide.used;
	for (int i = 0; i < used; i++)
		a[i] = rightSide.a[i];

}

PFArrayD::~PFArrayD()
{
	cout << "PFArrayD destractor called! " << endl;
	delete[] a;
}

void PFArrayD::addElement(double element)
{
	if (used >= capacity)
	{
		cout << "Attempt to exceed capacity in PFArrayD.\n";
		exit(0);
	}
	a[used] = element;
	used++;
}

bool PFArrayD::full() const
{
	return (capacity == used);
}

int PFArrayD::getCapacity() const
{
	return capacity;
}

int PFArrayD::getNumberUsed() const
{
	return used;
}

void PFArrayD::emptyArray()
{
	used = 0; //logical delete
}
void PFArrayD::print()
{
	for (int i = 0; i < used; i++)
		cout << a[i] << " ";
	cout << endl;
}
