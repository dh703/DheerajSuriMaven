package com.epam.maven;

import java.util.*;
public class App
{
public static HashMap<String,Integer> sort(HashMap<String,Integer> hm)
{
List<Map.Entry<String, Integer>> list =
new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());
Collections.sort(list, new Comparator<Map.Entry<String,Integer>>() {
public int compare(Map.Entry<String,Integer> o1,  
Map.Entry<String,Integer> o2)
{
return (o1.getValue()).compareTo(o2.getValue());
}
});
HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
for (Map.Entry<String, Integer> aa : list) {
temp.put(aa.getKey(), aa.getValue());
}
return temp;
}
public static void main( String[] args )
{
Scanner s=new Scanner(System.in);
TreeMap tm=new TreeMap();
System.out.println("Enter the total no of children\n");
int n=s.nextInt();
String name=null;
int c=0,swe=0;
Children o[]=new Children[n];
for(int i=0;i<n;i++)
{
o[i]=new Children();
System.out.println("Enter the student name\n");
name=s.next();
System.out.println("Enter the no of chocolates\n");
c=s.nextInt();
System.out.println("Enter the no of sweets");
swe=s.nextInt();
System.out.println(c+swe);
o[i].setName(name);
o[i].setNc(c);
o[i].setNs(swe);
o[i].setTotalqty(c+swe);
}
String arr[]=new String[n];
int ar[]=new int[n];

Choco ca=new Choco();
int q=ca.calculate(c,swe);
String str[]=new String[q];
int a[]=new int[q];
System.out.println("Enter chocolate name:\n");
s.nextLine();
for(int i=0;i<n;i++){
str[i]=s.nextLine();
a[i]=str[i].length();
tm.put(str[i],a[i]);
}
System.out.println("Select the sweet names from the list:\n1.Rasagulla\n2.Palkova\n");
String s1=null,s2=null;
int g[]=new int[100];
Rasagulla k=new Rasagulla();
Palkova p=new Palkova();
for(int i=0;i<n;i++) {
int ch=s.nextInt();
switch(ch)
{
case 1:
s1=k.name();
g[i]=g[i]+k.price();
break;
case 2:
s2=p.name();
g[i]=g[i]+p.price();
break;
default:
System.out.println("Incorrect choice");
}
}
System.out.println("Name "+" "+"Number of candies "+" "+"Number of sweets");
for(int i=0;i<n;i++)
{
System.out.println(o[i].getName()+" "+
o[i].getNc()+" "+
o[i].getNs()+" ");
}
System.out.println("Total Price: ");
int price[]=new int[n];
int z=0;
int sum[]=new int[n];
for(int i=0;i<n;i++)
{
z=(int)tm.get(str[i]);
price[i]=(int) tm.get(str[i]);
System.out.println(o[i].getName()+" "+
o[i].getNc()*price[i]+" "+
o[i].getNs()*g[i]+" ");
sum[i]=o[i].getNc()*z+o[i].getNs()*g[i];
o[i].setTotalcost(sum[i]);
}
System.out.println("\nEnter choice:");
System.out.println("\n1.By Price\n2.By Quantity");
int choice=s.nextInt();
switch(choice)
{
case 1:
HashMap<String,Integer> t2=new HashMap<String,Integer>();
for(int i=0;i<n;i++)
t2.put(o[i].getName(),o[i].getTotalcost());
Map<String, Integer> h1 = sort(t2);
System.out.println(h1);
break;
case 2:
HashMap<String,Integer> t3=new HashMap<String,Integer>();
for(int i=0;i<n;i++)
t3.put(o[i].getName(),o[i].getTotalqty());
Map<String, Integer> h = sort(t3);
System.out.println(h);

break;
default:
System.out.println("Incorrect choice");
}
}
}
class Choco
{
int sum=0;
public int calculate(int a,int b)
{
sum=sum+a+b;
return sum;
}
}
class Rasagulla
{
public String name()
{
return "Rasagulla";

}
public int price()
{
return 100;
}
}
class Palkova
{
public String name() {
return "palkova";
}
public int price()
{
return 50;
}
}