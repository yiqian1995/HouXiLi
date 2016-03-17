#include<stdio.h>
#include<math.h>
#include<stdlib.h>
void FL();
void DL();
void TR();

main()
{
	int c;
	while(1){
	system("cls");
	printf("按所需要的方式输入指令：\n");
	printf("复利计算方式输入1\n");
	printf("单利计算方式输入2\n");
	printf("退出      输入0\n");
	scanf("%d",&c);
	if(c==1)
		FL();
	else if(c==2)
		DL();
	else if(c==0)
		return 0;
	else
		printf("输入错误，请重新输入");
	}
}
void FL()
{
	int n=0,c=0;
	double f=0,p=0,i=0;
	
	system("cls");
	printf("输入需要方式：\n");
	printf("求本金输入1\n");
	printf("求利率输入2\n");
	printf("求年限输入3\n");
	printf("求本利输入4\n");
	printf("退出  输入0\n");
	scanf("%d",&c);
	if(c==1)
		FL();
	else if(c==2)
		DL();
	else if(c==0)
		return ;
	else
		printf("输入错误，请重新输入");
    if(c!=1)
	{printf("请输入本金：");
	scanf("%lf",&p);
	}
	if(c!=2)
	{printf("请输入利率%%：");
	scanf("%lf",&i);
	}
	if(c!=3)
	{printf("请输入年限：");
	scanf("%d",&n);
	}
	if(c!=4)
	{printf("请输入本金：");
	scanf("%d",&f);
	}
	switch (c){
	case 1:
	f=p*pow((1+i/100),n);
	printf("最终金额为：%lf\n",f);
	break;

	case 2:
		i=pow(f/p,1.0/n);

	printf("所需利率为：%lf\n",i);
	break;
	}
    printf("按任意键继续");
	getchar();
	getchar();
}
void DL()
{
	int n;
	double f,p,i;
	system("cls");
	printf("请输入本金：");
	scanf("%lf",&p);
	printf("请输入利率%%：");
	scanf("%lf",&i);
	printf("请输入年限：");
	scanf("%d",&n);
	f=p+p*i/100*n;
	printf("最终金额为：%lf\n",f);
	printf("按任意键继续");
	getchar();
	getchar();
}
void TR()
{
	int n;
	double f,p,i;
	system("cls");
	printf("请输入需要的钱：");
	scanf("%lf",&f);
	printf("请输入利率%%：");
	scanf("%lf",&i);
	printf("请输入年限：");
	scanf("%d",&n);
	p=f/pow((1+i/100),n);
	printf("最终金额为：%lf\n",p);
	printf("按任意键继续");
	getchar();
	getchar();
}
