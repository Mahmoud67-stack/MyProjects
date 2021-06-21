#include<iostream>
#include<cmath>
using namespace std;
double Average_Speed(double distance, double time)
{
	return distance / time;
}
double harmonicSeries(int n)
{
	double sum = 0;
	for (int i = 1; i <= n; i++)
	{
		sum+=(1.0/i);
	}
	return sum;
}
double factorial(int n)
{
	double f1 = 1;
	for (int i = n; i < 0; i++)
	{
		f1 = f1* i;
	}
	return f1;
}
double Premutation(int n, int k)
{
	return (factorial(n) / factorial(n - k));
}
void main()
{
	/*cout << "Please enter a value for a,b and c for the quadratic equation ax^2+bx+c:  " << endl;
	int a, b, c;
	cin >> a >> b >> c;
	if (a == 0)
	{
		cout << "The quadratic equation does not have any roots as a is zero." << endl;
	}
	if ((pow(b,2) - (4 * a*c))<0)
	{
		cout << "No roots as the discriminator is negative." << endl;
	}
	else
	{
		cout << "The first root is: " << (-b + sqrt(pow(b,2) - (4 * a*c))) / (2 * a) << endl;
		cout << "The second root is: " << (-b - sqrt(pow(b,2) - (4 * a*c))) / (2 * a) << endl;
	}*/
	/*cout << "Enter distance and time: " << endl;
	double d, t;
	cin >> d >> t;
	double s = Average_Speed(d, t);
	cout << "The average speed is: " << s << " m/s "<<endl;*/
	//cout << "Please enter the amount of terms you want to calculate: " << endl;
	//int n;
	//cin >> n;
	//double sum = harmonicSeries(n);
	//cout << "The sum of the harmonic series is: " << sum<<endl;
	cout << "Please ebter the number of total terms and the number of k terms: " << endl;
	int k, n;
	cin >> n >> k;
	double prumit = Premutation(n, k);
	cout << "The premutation is: " << prumit << endl;
	system("pause");
}