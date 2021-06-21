#include<iostream>
#include<fstream>
#include<vector>
#include<string>
using namespace std;
class Pixels {
public:
	void Set_red(int red_s) { red = red_s; }
	int Get_red() { return red; }
	void Set_green(int green_s) { green = green_s; }
	int Get_green() { return green; }
	void Set_blue(int blue_s) { blue = blue_s; }
	int Get_blue() { return blue; }
private:
	int red, green, blue;
};
class Rows {
public:
	Rows() :number_of_pixels_per_row(0), Pixel{ NULL } {}
		Rows(int noppr) :number_of_pixels_per_row(noppr) {}
	void read(ifstream & mycin); // which reads from the text file
	void print(); // which prints to cout
	void Set_number_of_pixels_per_row(int numb_of_pix_per_row) { number_of_pixels_per_row = numb_of_pix_per_row; }
	int Get_number_of_pixels_per_row() { return number_of_pixels_per_row; }
private:
	int number_of_pixels_per_row; // 3 in this example, but should work for other values as well
	vector<Pixels>Pixel;
};
class Image {
public:
	void read(ifstream & mycin); // which reads from the text file
	void print(); // which prints to cout
	void Set_number_of_rows(int numb_of_rows) { number_of_rows = numb_of_rows; }
	int Get_number_of_rows() { return number_of_rows; }
private:
	int number_of_rows; // 4 in this example, but should work for other values as well
	string title;
	vector<Rows>Row;
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
	Pixels tmppix;
	int r, g, b;
	mycin >> number_of_pixels_per_row;
	for (int i = 0; i < number_of_pixels_per_row; i++)
	{
		mycin >> r >> g >> b;
		tmppix.Set_red(r);
		tmppix.Set_green(g);
		tmppix.Set_blue(b);
		Pixel.push_back(tmppix);
		//mycin >> number_of_pixels_per_row;
	}
}
void Image::read(ifstream&mycin)
{
	mycin >> title;
	mycin >> number_of_rows;
	for (int i = 0; i < number_of_rows; i++)
	{
		Rows rtmp;
		rtmp.read(mycin);
		Row.push_back(rtmp);
	}
}
void Rows::print()
{
	Pixels tmpix;
	for (int i = 0; i < number_of_pixels_per_row; i++)
	{
		cout << "The number of pixels: " << number_of_pixels_per_row << "(" << Pixel[i].Get_red() << " " << Pixel[i].Get_green() << " " << Pixel[i].Get_blue() << ")";
	}
}
void Image::print()
{
	for (int j = 0; j < number_of_rows; j++)
	{
		Row[j].print();
		cout << endl;
	}
}