void main(){
    int n=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<i;j++){
            printf("   ");
        }
        for(int j=1;j<=n-i+1;j++){
            printf("%3d",i*j);
        }
        printf("\n");
    }
}