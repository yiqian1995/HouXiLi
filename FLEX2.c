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
	printf("������Ҫ�ķ�ʽ����ָ�\n");
	printf("�������㷽ʽ����1\n");
	printf("�������㷽ʽ����2\n");
	printf("�˳�      ����0\n");
	scanf("%d",&c);
	if(c==1)
		FL();
	else if(c==2)
		DL();
	else if(c==0)
		return 0;
	else
		printf("�����������������");
	}
}
void FL()
{
	int n=0,c=0;
	double f=0,p=0,i=0;
	
	system("cls");
	printf("������Ҫ��ʽ��\n");
	printf("�󱾽�����1\n");
	printf("����������2\n");
	printf("����������3\n");
	printf("��������4\n");
	printf("�˳�  ����0\n");
	scanf("%d",&c);
	if(c==1)
		FL();
	else if(c==2)
		DL();
	else if(c==0)
		return ;
	else
		printf("�����������������");
    if(c!=1)
	{printf("�����뱾��");
	scanf("%lf",&p);
	}
	if(c!=2)
	{printf("����������%%��");
	scanf("%lf",&i);
	}
	if(c!=3)
	{printf("���������ޣ�");
	scanf("%d",&n);
	}
	if(c!=4)
	{printf("�����뱾��");
	scanf("%d",&f);
	}
	switch (c){
	case 1:
	f=p*pow((1+i/100),n);
	printf("���ս��Ϊ��%lf\n",f);
	break;

	case 2:
		i=pow(f/p,1.0/n);

	printf("��������Ϊ��%lf\n",i);
	break;
	}
    printf("�����������");
	getchar();
	getchar();
}
void DL()
{
	int n;
	double f,p,i;
	system("cls");
	printf("�����뱾��");
	scanf("%lf",&p);
	printf("����������%%��");
	scanf("%lf",&i);
	printf("���������ޣ�");
	scanf("%d",&n);
	f=p+p*i/100*n;
	printf("���ս��Ϊ��%lf\n",f);
	printf("�����������");
	getchar();
	getchar();
}
void TR()
{
	int n;
	double f,p,i;
	system("cls");
	printf("��������Ҫ��Ǯ��");
	scanf("%lf",&f);
	printf("����������%%��");
	scanf("%lf",&i);
	printf("���������ޣ�");
	scanf("%d",&n);
	p=f/pow((1+i/100),n);
	printf("���ս��Ϊ��%lf\n",p);
	printf("�����������");
	getchar();
	getchar();
}
