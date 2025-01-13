package com.campusdual.classroom;

import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {
        Stack<String> stack = new Stack<>(); // Crear la pila y luego agrego los slementos
        stack.push("Smith");
        stack.push("Montessori");
        stack.push("Peralta");
        stack.push("House");
        return stack;
    }

    public static void printAndEmptyStack(Stack<String> stack) {
    while (!stack.empty()) {     //recorremos la pila mientras no este vacia
        System.out.println(stack.pop());  // el pop es para obtener el elemento de la cima de la pila
      }
    }

    public static void main(String[] args) {
    Stack<String> stack = createStack();
    printAndEmptyStack(stack);  // para imprimir y vaciar la pila
    }
}
