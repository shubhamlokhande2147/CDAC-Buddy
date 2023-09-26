#include<iostream>
using namespace std;
#include<string.h>
class string1
{
	int len;
	char* ptr;
	public:
		void display();
		string1(char*);
		string1& operator=(string1&);
		string1(string1&)
		{
			cout<<"copy constructor is called";
		}
		
};
string1& string1::operator=(string1& s)
{
	//cout<<"assignment is called\n";
	len=s.len;
	delete[] ptr;
	ptr=new char[len+1];
	strcpy(ptr,s.ptr);
	return (*this);
}
void string1::display()
{
	cout<<"\nlength is "<<len<<endl;
	cout<<"string is "<<ptr<<endl;
}
string1::string1(char * sptr)
{
	len=strlen(sptr);
	ptr=new char[len+1];
	strcpy(ptr,sptr);
}	

int main()
{


	string1 s1("abc");
	s1.display();
	string1 s2("NuLL String");
    s2.display();

    cout<<"\n***************After Assignment operator******************";
	s2=s1;//s2.operator=(s1)
	s2.display();
	
	string1 s5=s2;

}



