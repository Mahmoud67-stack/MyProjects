#include<iostream>
#include<cmath>
using namespace std;
class Set
{
public:
	Set(int max = 10, int noe = 0)
	{
		maxsize = max;
		numbofelements = noe;
		p = new int[maxsize];
	}
	Set(const Set& rhs)
	{
		maxsize = rhs.maxsize;
		numbofelements = rhs.numbofelements;
		p = new int[maxsize];
		for (int i = 0; i < maxsize; i++)
		{
			p[i] = rhs.p[i];
		}
	}
	Set& operator=(const Set& rhs)
	{
		if (maxsize != rhs.maxsize)
		{
			maxsize = rhs.maxsize;
			delete[]p;
			p = new int[maxsize];
		}
		numbofelements = rhs.numbofelements;
		for (int i = 0; i < numbofelements; i++)
		{
			p[i] = rhs.p[i];
		}
		return*this;
	}
	~Set()
	{
		cout << "Destructor called." << endl;
		delete[]p;
	}
	void push(int element)
	{
		if (maxsize == numbofelements)
		{
			cout << "Array is full." << endl;
			exit(1);
		}
		else
		{
			for (int i = 0; i < maxsize; i++)
			{
				if (p[i] != NULL && p[i] != element)
					p[i] = element;
			}
		}
	}
	int pop()
	{
		if (numbofelements == 0)
		{
			cout << "The array is empty. " << endl;
			exit(1);
		}
		else
		{
			int x = p[numbofelements - 1];
			numbofelements--;
			return x;
		}
	}
	int location(int element)
	{
		for (int i = 0; i < maxsize; i++)
			if (element == p[i])
				return i;
		return -1;
	}
	int getAt(int i)
	{
		if (i<maxsize - 1)
			return p[i];
		else {
			cout << "Out of range." << endl;
			exit(1);
		}
	}
	bool isFull()
	{
		if (maxsize == numbofelements)
			return true;
		else
			return false;
	}
	bool isEmpty()
	{
		if (numbofelements == 0)
			return true;
		else
			return false;
	}
	int getUsed()
	{
		int x = 0;
		for (int i = 0; i < maxsize; i++)
		{
			if (p[i] != NULL)
				x++;
		}
		return x;
	}
private:
	int maxsize;
	int numbofelements;
	int* p;
};
void consumeAndPrintSet(Set& s)
{
	int x;
	while (!s.isEmpty())
	{
		x = s.pop();
		cout << x << " ";
	}
	cout << endl;
}
void randomizeSet(Set& a)
{
	while (!a.isFull())
	{
		a.push(rand() % 11);
	}
}
int main()
{
	// Set the random seed to a constant value to get the same sequence of random numbers for all runs. 
	srand(14112019);
	cout << "Testing default constructor  S = ";
	Set s;
	randomizeSet(s);
	consumeAndPrintSet(s);
	cout << "Testing pushing the number 7 for 5 times and 3 for 5 times\n";
	for (int i = 0; i < 5; i++)
	{
		s.push(7);
	}
	for (int i = 0; i < 5; i++)
	{
		s.push(3);
	}
	cout << "The location of 3 is " << s.location(3) << " while the location of 5 is " << s.location(5) << endl;
	cout << "S = ";
	consumeAndPrintSet(s);
	cout << "Testing non-default and copy constructors A = ";
	Set a(3);
	randomizeSet(a);
	Set c = a;
	consumeAndPrintSet(a);
	cout << "C = A = ";
	consumeAndPrintSet(c);
	cout << "Trying to print C again should print nothing C = ";
	consumeAndPrintSet(c);
	cout << "This because pop will remove the elements from the Set\n";
	cout << "Printing the Set without removing elements, X = ";
	Set x(4);
	randomizeSet(x);
	for (int i = 0; i < x.getUsed(); i++)
	{
		cout << x.getAt(i) << " ";
	}
	cout << endl;
	cout << "Testing the = operator Y = X\n";
	Set y;
	y = x;
	cout << "Printing X again using pop ";
	consumeAndPrintSet(x);
	cout << "Y = ";
	consumeAndPrintSet(y);
}