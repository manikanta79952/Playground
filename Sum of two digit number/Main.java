#include<stdio.h>
int main()
{
  int f,l,sum,num;
  scanf("%d",&num);
  f=num/10;
  l=num%10;
  sum = f+l;
  printf("%d",sum);
  return 0;
}