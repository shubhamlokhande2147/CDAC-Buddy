#include<iostream>
using namespace std;

int main()
{ 
    int n,i,j,k;
    cout<<"enter size of array : "<<endl;
    cin>>n;

    char arr[n];
	char temp1[n];
	int temp2[n];
    for(i=0;i<n;i++)
    {
        cin>>arr[i];
    }

    for(i=0;i<n;i++)
    {
           if((arr[i] >= 97 && arr[i] <= 122) || (arr[i] >= 65 && arr[i] <= 90))
              {
                 temp1[i] = arr[i];
			  }
			  else
			  {
			     temp2[i] = arr[i];
			  }
    }

    for(i=0;i<n;i++)
    {
        cout<<"String : "<<temp1[i]<<","<<endl;
    }
     for(i=0;i<n;i++)
    {
        cout<<"Number : "<<temp2[i]<<","<<endl;
    }


    return 0;
}




// #include<iostream>
// using namespace std;

// int main()
// { 
//     int n,i,j,k;
//     cout<<"enter size of array : "<<endl;
//     cin>>n;

//     char arr[n],temp[n];
//     for(i=0;i<n;i++)
//     {
//         cin>>arr[i];
//     }

//     for(j=0;j<n;j++)
//     {
//         if(arr[i] <= 9)
//         {
//             temp[j] = arr[i];
//         }
//     }

//     for(k=0;k<n;k++)
//     {
//         cout<<temp[k];
//     }


//     return 0;
// }