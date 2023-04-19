/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.csc229_lab10;

/**
 *
 * @author jsieb
 */
public class CSC229_Lab10 {

    public static void main(String[] args) {
        DoublyLinkedList d = new DoublyLinkedList();
        
        Node nodeA = new Node(14);
        Node nodeB = new Node(2);
        Node nodeC = new Node(20);
        Node nodeD = new Node(31);
        Node nodeE = new Node(16);
        Node nodeF = new Node(55);
        
        d.append(nodeA);
        d.append(nodeB);
        d.append(nodeC);
        d.append(nodeD);
        d.append(nodeE);
        d.append(nodeF);
                
        int[] arr = d.toArray();
        for (int x : arr) {
            System.out.println(x);
        }
        
        System.out.println(d.indexOf(16));
        
        System.out.println(d.sumLast(5));
        
    }
}
