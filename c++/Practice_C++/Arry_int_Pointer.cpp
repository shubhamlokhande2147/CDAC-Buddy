#include<iostream>
using namespace std;


  //without using class array integer pointer

//int main()
//{
//	int ptr[5];
//	int *ptr1[5];
//	
//	cout<<"\nEnter 5 no. : "; 
//	     for(int i=0;i<5;i++)  //for loop = accept no.
//	        {
//	        	cin>>ptr[i];
//			}
//			
//			 for(int i=0;i<5;i++) //for loop = stored adr in pointer
//			   {
//			   	  ptr1[i] = &ptr[i];
//			   }
//			
//	  for(int i=0;i<5;i++) //for loop = display no.
//	        {
//	        	cout<<endl<<*ptr1[i];
//			}
//			
//	return 0;
//}

//using class array integer pointer
             class A
             {
                 	int ptr[5];
	                int *ptr1[5];
		                   public:
		                   	  void get()
		                   	  {
		                   	  		cout<<"\nEnter 5 no. : "; 
	                                  for(int i=0;i<5;i++)  //for loop = accept no.
	                                    {
	        	                          cin>>ptr[i];
			                            }
			
		                           	 for(int i=0;i<5;i++) //for loop = stored adr in pointer
			                            {
	                        		   	  ptr1[i] = &ptr[i];
			                            }
							   }
							   
							   void show()
							   {
							   	 for(int i=0;i<5;i++) //for loop = display no.
	                                 {
	                                	cout<<endl<<*ptr1[i];
	                           	     }
			                   }
			 };
			 
			 int main()
			 {
			 	A a1;
			 	a1.get();
			 	a1.show();
			 	
			 	return 0;
			 }
