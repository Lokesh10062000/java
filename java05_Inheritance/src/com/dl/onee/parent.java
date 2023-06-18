package com.dl.onee;

/*	Inheritance :-Inheritance in Java is a mechanism in which one object acquires all the properties
					and behaviors of a parent object. It is an important part of OOPs (Object Oriented 
					programming system).*/

/*	Types of Inheritance
		1)Single level
		2)Multi level
		3)multiple
		4)Hybrid
		5)Hirachical*/

/*	Single Level :-When a class inherits another class, it is known as a single inheritance.
				   In the example given below, Dog class inherits the Animal class, so there is the
				   single inheritance.
				   
			Syntax :-class Animal{  
							void eat(){System.out.println("eating...");}  
						}  
						class Dog extends Animal{  
						void bark(){System.out.println("barking...");}  
						}  
						class TestInheritance{  
						public static void main(String args[]){  
						Dog d=new Dog();  
						d.bark();  
						d.eat();  
						}}  */	   

/*	MultiLevel Inheritance :-When there is a chain of inheritance, it is known as multilevel inheritance.
							As you can see in the example given below, BabyDog class inherits the Dog class 
							which again inherits the Animal class, so there is a multilevel inheritance.
							
			Syntax :-class Animal{  
						void eat(){System.out.println("eating...");}  
					}  
					class Dog extends Animal{  
					void bark(){System.out.println("barking...");}  
					}  
					class BabyDog extends Dog{  
					void weep(){System.out.println("weeping...");}  
					}  
					class TestInheritance2{  
					public static void main(String args[]){  
					BabyDog d=new BabyDog();  
					d.weep();  
					d.bark();  
					d.eat();  
					}} */ 		


/*	Hierarchical Inheritance :-When two or more classes inherits a single class, 
							   it is known as hierarchical inheritance. In the example given below,
							   Dog and Cat classes inherits the Animal class, so there is hierarchical 
							   inheritance.
							   
					Syntax :-class Animal{  
								void eat(){System.out.println("eating...");}  
							}  
							class Dog extends Animal{  
							void bark(){System.out.println("barking...");}  
							}  
							class Cat extends Animal{  
							void meow(){System.out.println("meowing...");}  
							}  
							class TestInheritance3{  
							public static void main(String args[]){  
							Cat c=new Cat();  
							c.meow();  
							c.eat();  
							//c.bark();//C.T.Error  
							}}  */		   


/*	Multiple Inheritance:-multiple Inheritance is not Supported in java 
						  Since compile-time errors are better than runtime errors, Java renders compile-time error if you inherit 2 classes.
						  So whether you have same method or different, there will be compile time error.
						  
						  
				Syntax :-class A{  
							void msg(){System.out.println("Hello");}  
						}  
						class B{  
						void msg(){System.out.println("Welcome");}  
						}  
						class C extends A,B{//suppose if it were  
						   
						 public static void main(String args[]){  
						   C obj=new C();  
						   obj.msg();//Now which msg() method would be invoked?  
						}  
						}  		  
*/


/*	For Static methods we did not create the reference variable we would call the method directly .
	For non static method we can call the method by taking the help of reference variable. */





							
							
public class parent {
	  
	public void add() {
		System.out.println("add() instance method");
	}
	public static void put() {
		System.out.println("put() static methob");
	}
}
