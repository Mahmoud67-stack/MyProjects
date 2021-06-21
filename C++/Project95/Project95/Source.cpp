#include<iostream>
#include<vector>
using namespace std;
void main()
{
	vector<int> myvec(3, 100);
	cout << "size of vector: "<<myvec.size() << endl;
	for (int i = 0; i < myvec.size(); i++)
	{
		cout << myvec[i] << endl;
	}
	system("pause");
}