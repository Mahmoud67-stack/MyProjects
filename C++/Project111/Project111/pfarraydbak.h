#pragma once
#include "pfarrayd.h"

class PFArrayDBak : public PFArrayD
{
public:
	PFArrayDBak();
	//Initializes with a capacity of 50.

	PFArrayDBak(int capacityValue);

	PFArrayDBak(const PFArrayDBak& Object);

	void backup();
	//Makes a backup copy of the partially filled array.

	void restore();
	//Restores the partially filled array to the last saved version. 
	//If backup has never been invoked, this empties the partially filled array.

	void operator =(const PFArrayDBak& rightSide);
	void print();
	virtual ~PFArrayDBak();
private:
	double *b; //for a backup of main array.
	int usedB; //backup for inherited member variable used.
	int capacityB; //backup for inherited size of array.
};
