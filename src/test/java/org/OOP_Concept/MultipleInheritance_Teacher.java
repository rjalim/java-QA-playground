package org.OOP_Concept;

import static org.OOP_Concept.Encapsulation.getName;

public class MultipleInheritance_Teacher extends Student {
    public static void main(String[]args){
        MultipleInheritance_Teacher teacher = new MultipleInheritance_Teacher();
      //  teacher.StudentInfo();
        System.out.println(getName());
    }
}
