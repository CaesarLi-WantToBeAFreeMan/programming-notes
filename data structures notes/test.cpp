#include <iostream>
#include <vector>
using namespace std;

int main(){
    int ints [] = {1, 2, 3, 4, 5};
    vector <int> intVec(ints, ints + 5);
    auto it = intVec.begin() + 2;
    it = intVec.insert(it, 2, 50);
    cout << "it:\tintVec.begin() + " << distance(intVec.begin(), it) << '\n';
    cout << "intVec:\t";
    for(auto i : intVec)
        cout << i << ' ';
    cout << '\n';
}