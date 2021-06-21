#include <iostream>

using namespace std;
string Convertor(int x)
{
    int y=x,count=0;
    string u;
    while(x!=0)
    {
        x/=10;
        count++;
    }

}
void main()
{
    int x;
    cout<<"Please enter an integer that is less than 1 million and bigger than 0:"<<endl;
    cin>>x;
    cout<<"The number in words is: "<<Convertor(x)<<endl;
}
