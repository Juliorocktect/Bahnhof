#include<iostream>

int main (int argc, char *argv[]) {
  int x = 10;
  int* y = &x;
  *y +=1;
  std::cout << x;
  return 0;
}
