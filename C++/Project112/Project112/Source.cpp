#include<iostream>
#include<string.h>
#include<stdio.h>
using namespace std;
class Vehicle {
public:
	virtual void printInfo() = 0;
	~Vehicle()
	{
		cout << "Destructor of Vehicle is called\n";
	}
};
class Car :public Vehicle 
{
public:
	Car()
	{
		manuYear = 0;
		manufacturer = new char[50];
		model = new char[50];
	}
	Car(int Year, char*facturer,char*in_model)
	{
		manuYear = Year;
		manufacturer = new char[50];
		for (int i = 0; i < strlen(facturer)+1; i++)
		{
			manufacturer[i] = facturer[i];		
		}
		model = new char[50];
		for (int i = 0; i < strlen(in_model)+1; i++)
		{
			model[i] = in_model[i];
		}
	}
	Car(const Car&rhs)
	{
		manuYear = rhs.manuYear;
		manufacturer = new char[50];
		for (int i = 0; i < strlen(rhs.manufacturer)+1; i++)
		{
			manufacturer[i] = rhs.manufacturer[i];
		}
		model = new char[50];
		for (int i = 0; i < strlen(rhs.model)+1; i++)
		{
			manufacturer[i] = rhs.model[i];
		}
	}
	Car operator=(const Car& car_to_copy_from)
	{
		manuYear = car_to_copy_from.manuYear;
		manufacturer = new char[50];
		for (int i = 0; i < strlen(car_to_copy_from.manufacturer)+1; i++)
		{
			manufacturer[i] = car_to_copy_from.manufacturer[i];
		}
		model = new char[50];
		for (int i = 0; i < strlen(car_to_copy_from.model)+1; i++)
		{
			manufacturer[i] = car_to_copy_from.model[i];
		}
		return *this;
	}
	~Car()
	{
		cout << "Destructor of class [Car] is called!" << endl;
		delete[] manufacturer;
		delete[]model;
	}
	virtual void printInfo()
	{
		cout << "The Year of manufacturing: " << manuYear << endl;
		cout << "The manufacturer name: ";
		for (int i = 0; i < strlen(manufacturer)+1; i++)
		{
			cout << manufacturer[i];
		}
		cout << endl;
		cout << "The model name is: ";
		for (int i = 0; i < strlen(model)+1; i++)
		{
			cout << model[i];
		}
		cout << endl;
	}
protected:
	/*Car is a concrete class and has manufacturer ( char*), manuYear (int) and model (char*) as attributes.*/
	char* manufacturer;
	char*model;
	int manuYear;
};
class Truck :public Vehicle
{
public:
	Truck()
	{
		manuYear = 0;
		max_weight = 0;
		max_height = 0;
		manufacturer = new char[50];
	}
	Truck(int Year, char*facturer,float max_h,float max_w)
	{
		manuYear = Year;
		max_height = max_h;
		max_weight = max_w;
		manufacturer = new char[50];
		for (int i = 0; i < strlen(facturer)+1; i++)
		{
			manufacturer[i] = facturer[i];
		}
	}
	Truck(const Truck&rhs)
	{
		manuYear = rhs.manuYear;
		manufacturer = new char[50];
		for (int i = 0; i < strlen(rhs.manufacturer)+1; i++)
		{
			manufacturer[i] =rhs.manufacturer[i];
		}
		max_height = rhs.max_height;
		max_weight = rhs.max_weight;
	}
	Truck operator=(const Truck& truck_to_copy_from)
	{
		manuYear = truck_to_copy_from.manuYear;
		manufacturer = new char[50];
		for (int i = 0; i < strlen(truck_to_copy_from.manufacturer)+1; i++)
		{
			manufacturer[i] = truck_to_copy_from.manufacturer[i];
		}
		max_height = truck_to_copy_from.max_height;
		max_weight = truck_to_copy_from.max_weight;
		return *this;
	}
	~Truck()
	{
		cout << "Destructor of class [Truck] is called!" << endl;
		delete[] manufacturer;
	}
	virtual void printInfo()
	{
		cout << "The Year of manufacturing: " << manuYear << endl;
		cout << "The maximum height is: " << max_height << endl;
		cout << "The maximum weight is: " << max_weight <<endl;
		cout << "The manufacturer name: ";
		for (int i = 0; i < strlen(manufacturer)+1; i++)
		{
			cout << manufacturer[i];
		}
		cout << endl;
	}
protected:
	char* manufacturer;
	int manuYear;
	float max_weight, max_height;
};
void main() {

	Vehicle *arr[2];
	Car c(2015,"Nissan","Sunny");
	Truck t(2017,"Toyota", 150.9, 1020.87);
	arr[0] = &c;
	arr[1] = &t;
	for (int i = 0; i < 2; i++)
	{
		arr[i]->printInfo();
	}
	system("pause");
	// make arr[0] to point to a dynamically created car object 
	// make arr[1] to point to a dynamically created Truck object 
	// print the information of your car and truck objects using the arr pointer 
	// delete your objects 
	return;
}
