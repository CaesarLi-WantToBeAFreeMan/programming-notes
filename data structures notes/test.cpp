#include <iostream>
#include <string>
using namespace std;

int main(){
    string source = "jfihuhadgsiuhdfsuihadgsiuhadgsuoihadgsiohadgsiouhdgo ukhf iouhg ioasugoi", 
           destination = "io";
    cout << source.find_first_of(destination);
}