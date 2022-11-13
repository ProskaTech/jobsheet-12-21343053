//Created by 21343053_KhalilulAfwan

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2;

/**
 *
 * @author KHALILUL
 */
class CompileTime {
    //method keliling dengan single argumen
    static int keliling(int a){
        return 4 * a;
    }
    //method keliling dengan dua argumen (method overloading)
    static int keliling(int l, int b){
        return 2 * (l + b);
    }
}
