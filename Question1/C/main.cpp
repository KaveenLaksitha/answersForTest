#include<stdio.h>
#include<string.h>
int calculatePower (int, int);

int main ()
{
  int base;
  int exp;
  int output;

  printf ("Please input base: ");
  scanf ("%d", &base);

  printf ("Please input exponent: ");
  scanf ("%d", &exp);

  output = calculatePower (base, exp);
  printf ("%d ^ %d = %d", base,exp,output);

}

int calculatePower (int base, int exp)
{
  int answer = 1;
  while (exp != 0)
    {
      answer = answer * base;
      --exp;
    }
  return answer;
}