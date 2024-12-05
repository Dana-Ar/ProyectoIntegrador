/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.game.modelo;

/**
 *
 * @author danar
 */
public class LaberintoModel {
    private int [][] laberinto; //20 x20

    public LaberintoModel() {
        laberinto = new int [][]{ //0 es camino, 1 es muro
       //1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0
        {0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},//1
        {0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},//2
        {0,0,1,1,1,1,1,1,1,0,0,1,1,1,1,0,0,1,1,1},//3
        {0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,2,2},//4
        {0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,2,2},//5
        {0,0,1,1,1,1,1,1,1,0,0,1,0,0,1,0,0,1,1,1},//6
        {0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0},//7
        {0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0},//8
        {0,0,1,1,1,1,1,1,1,0,0,1,0,0,1,1,1,1,0,0},//9
        {0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},//10
        {0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},//11
        {0,0,1,1,1,1,1,1,1,0,0,1,0,0,1,1,1,1,1,1},//12
        {0,0,0,0,0,1,0,0,1,0,0,1,0,0,1,0,0,0,0,0},//13
        {0,0,0,0,0,1,0,0,1,0,0,1,0,0,1,0,0,0,0,0},//14
        {1,1,1,0,0,1,0,0,1,0,0,1,0,0,1,1,1,1,0,0},//15
        {0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0},//16
        {0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0},//17
        {1,1,1,1,1,1,0,0,1,0,0,1,1,1,1,1,1,1,0,0},//18
        {0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0},//19
        {0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0} //20
        };
        
    }

    
    public int [][] getlaberinto(){
        return laberinto;
    }
    
    public int getColumnas() {
        return laberinto[0].length;
    }

    public int getFilas() {
        return laberinto.length;
    }

    public boolean esCamino(int x, int y) {
        return x >= 0 && y >= 0 && x < getColumnas() && y < getFilas() && (laberinto[y][x] == 0|| laberinto[y][x] == 2 );
    }

    public int getValor(int x, int y) {
        if (x >= 0 && y >= 0 && x < getColumnas() && y < getFilas()) {
            return laberinto[y][x];
        }
        return -1; // Valor no válido entando fuera de la matriz
    }
    
}
