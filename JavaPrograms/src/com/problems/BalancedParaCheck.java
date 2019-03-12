package com.problems;


public class BalancedParaCheck {

	static class stack {
		int top = -1;
		char items[] = new char[100];

		void push(char x) {

			if (top == 99) {
				System.out.println("Stack is full");

			} else {
				items[++top] = x;
			}
		}

		char pop() {
			if (top == -1) {
				System.out.println("underflow error");
				return '\0';
			} else {
				char element = items[top];
				top--;
				return element;
			}
		}

		boolean isEmpty() {
			return (top == -1) ? true : false;
		}

	}

	static boolean isMatchingPair(char ch1, char ch2) {
		if (ch1 == '(' && ch2 == ')') {
			return true;
		} else if (ch1 == '{' && ch2 == '}') {
			return true;
		} else if (ch1 == '[' && ch2 == ']') {
			return true;
		}
		return false;

	}

  static boolean areParenthesisBalanced(char exp[]){
	  stack s= new stack();
	  
	  for (int i = 0; i < exp.length; i++) {
		
		  if(exp[i]=='{' || exp[i]=='(' || exp[i]=='[')
			  
		  s.push(exp[i]);
		  if(exp[i]=='}' || exp[i]==')' || exp[i]==']'){
			  if(s.isEmpty()){
				  return false;
			  }
			  else if(!isMatchingPair(s.pop(), exp[i])){
				  return false;
			  }
		  }
	 
	  }
	  if(s.isEmpty()){
		  return true;
	  }else{
		  return false;
	  }
  }
  public static void main(String[] args)  
  { 
      char exp[] = {'{','(',')','}','[',']','}'}; 
        if (areParenthesisBalanced(exp)) 
          System.out.println("Balanced "); 
        else
          System.out.println("Not Balanced ");   
  } 
}
