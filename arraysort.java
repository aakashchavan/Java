class sort{

public static void main(String args[]){

int a[] = new int[5];
a[0]=5;
a[1]=2;
a[2]=3;
a[3]=1;
a[4]=4;

int n=a.length;
int temp;

System.out.println(n);
    
for(int i=0;i<n-1;i++){
    
for(int j=0; j<n-1;j++){

if(a[j] > a[j+1]){

temp = a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}

for(int i=0; i<n; i++){
System.out.println(a[i]);
}
}
}
