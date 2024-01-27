/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author ASUS
 */
public class Chess extends BoardGame{
    private int numberOfChessPiece;
    
    @Override
    public void addArticle(){
        System.out.println("Papan Permainan telah ditambahkan");
    }
    
    @Override
    public void removeArticle(){
        System.out.println("Papan Permainan telah dihapus");
    }
    
    @Override
    public void borrowBoardGame(){
        System.out.println("Papan Permainan Catur telah dipinjam");
    }
    
    @Override
    public void returnBoardGame(){
        System.out.println("Papan Permainan Catur telah dikembalikan");
    }
    
    public int getNumberOfChessPiece(){
        return numberOfChessPiece;
    }
    
    public void setNumberOfChessPiece(int newNumberOfChessPiece){
        numberOfChessPiece = newNumberOfChessPiece;
    }
    
}
