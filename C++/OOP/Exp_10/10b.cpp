#include <iostream>
using namespace std;

// Function template definition
template <typename T> T square(T n)
{
    return (n*n);
}
template <> string square <string>(string s)
{
    return (s+s);
}

int main()
{
    int n=5;
    string s="Hello";
    cout<<"Square of "<<n<<" = "<<square(n)<<endl;
    cout<<"Square of "<<s<<" = "<<square(s);
    return 0;
}
