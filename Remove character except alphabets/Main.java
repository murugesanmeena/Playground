#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  char a[101];
  int i,j;
  cin>>a;
  for(i=0; a[i]!='\0';++i){
    while(!((a[i]>='a' && a[i]<='z')||(a[i]>='A' && a[i]<='Z') || a[i]=='\0')){
      for(j=i;a[j]!='\0';j++) a[j]=a[j+1];
      a[j]='\0';
    }}cout<<a;
     return 0;
}