/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author ASUS
 */
public class Monopoli extends BoardGame{
    private int numberOfDice;
    private int numberOfCard;
    
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
        System.out.println("Papan Permainan Monopoli telah dipinjam");
    }
    
    @Override
    public void returnBoardGame(){
        System.out.println("Papan Permainan Monopoli telah dikembalikan");
    }
    
    public int getNumberOfDice(){
        return numberOfDice;
    }
    
    public void setNumberOfDice(int newNumberOfDice){
        numberOfDice = newNumberOfDice;
    }
    
    public int getNumberOfCard(){
        return numberOfCard;
    }
    
    public void setNumberOfCard(int newNumberOfCard){
        numberOfCard = newNumberOfCard;
    }
    
}
