#include<iostream>
#include<vector>
#include<string>
using namespace std;
class Schedule {
public:
	string get_day() { return day; }
	string get_time() { return time; }
	Schedule() { time = "", day = ""; }
	Schedule(string Ctime) { time = Ctime, day = ""; }
	Schedule(string Ctime, string Cday) { time = Ctime, day = Cday; }
private:
	string day;
	string time;
};
class Info {
public:
	string get_crush_name() { return Cname; }
	vector<Schedule>get_crush_schedule() { return crush_schedule; }
	void set_Cname(string Crush_name) { Cname = Crush_name; }
	void set_Schedule(vector<Schedule>new_schedule) { crush_schedule = new_schedule; }
	Info() { string Cname = "", crush_schedule = NULL; }
	Info(string Crush_name) { Cname = Crush_name; }
	Info(string Crush_name, vector<Schedule>Crush_schedule) { Cname = Crush_name, crush_schedule = Crush_schedule; }
private:
	string Cname;
	vector<Schedule> crush_schedule;
};
class Crush {
public:
	Info getcrush() { return crush_info; }
	void setcrush(Info newcrush2) { crush_info = newcrush2; }
	Crush() { crush_info; }
	Crush(Info newcrush_info) { crush_info = newcrush_info; }
private:
	Info crush_info;
};
void main()
{
	cout << "Enter the name of your crush: " << endl;
	Crush C;
	Info f;

	system("pause");
}