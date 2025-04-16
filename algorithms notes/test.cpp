#include <iostream>
#include <vector>
using namespace std;

int main(){
    vector <int> v = {9, 5, -1, 0, -7, 6, 3, -9, 0};
    auto mergeSort = [&](int left, int right, auto & itself){
        if(right - left <= 1)
            return;
        int middle = (left + right) >> 1;
        itself(left, middle, itself);
        itself(middle, right, itself);
        vector <int> sorted;
        int l = left, r = middle;
        while(l < middle && r < right)
            sorted.push_back(v [l] < v [r] ? v [l++] : v [r++]);
        while(l < middle)
            sorted.push_back(v [l++]);
        while(r < right)
            sorted.push_back(v [r++]);
        for(int index = 0; index < sorted.size(); index++)
            v [left + index] = sorted [index];
    };
    mergeSort(0, v.size(), mergeSort);
    for(auto x : v)
        cout << x << ' ';
    cout << '\n';
}