#include <stdio.h>
int main() {
  int n ,i,num;
  scanf("%d",&n);
 int fact = 1;
   for ( i=1; i<=n; i++)
   {
     num=num-1;
     fact = fact * i;
   }
  printf("%d",fact);
     
	return 0;
}