#include<iostream>
#include<fstream>
#include<vector>
#include<string>
using namespace std;
class Pixels {
public: 
	void Set_red(int red_s) { red = red_s; }
	int Get_red() { return red; }
	void Set_green(int green_s) { red = green_s; }
	int Get_green() { return green; }
	void Set_blue(int blue_s) { red = blue_s; }
	int Get_blue() { return blue; }
private:
	int red, green, blue;
};
class Rows {
public: 
		void read(ifstream & mycin); // which reads from the text file
		void print(); // which prints to cout
		void Set_number_of_pixels_per_row(int numb_of_pix_per_row) { number_of_pixels_per_row = numb_of_pix_per_row; }
		int Get_number_of_pixels_per_row() { return number_of_pixels_per_row;}
private:
	int number_of_pixels_per_row; // 3 in this example, but should work for other values as well
	vector<Pixels>Pixel;
};
class Image {
public:
	void read(ifstream & mycin); // which reads from the text file
	void print(); // which prints to cout

private:
	int number_of_rows; // 4 in this example, but should work for other values as well
	string title;
	vector<Rows>Rowl;
};
void main()
{
		ifstream mycin;
		mycin.open("img.txt");
		if (mycin.fail()) {
			cout << "failed to open file!";
			exit(0);
		}
		Image myimage;
		myimage.read(mycin);
		myimage.print();
		mycin.close();
		system("pause");

}
void Rows::read(ifstream&mycin) 
{

}