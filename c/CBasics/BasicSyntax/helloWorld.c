#include <stdlib.h>
#include <stdio.h>

//the \n scape sequence moves the cursor to the next line
//the \t works like a tab button
//the \a makes a little noise
// dude \
this is another way to  comment

int main(void) {
  printf("\t\aHello World\n");
  printf("Here's a number %40d", 20);
  return 0;
}
