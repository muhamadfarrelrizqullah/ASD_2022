/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author ASUS
 */
public abstract class BoardGame extends Article{
    private int nrOfPlayers;
    private int averagePlayTime;
    
    public abstract void borrowBoardGame();
    public abstract void returnBoardGame();
    
      @Override
      public void addArticle(){
          System.out.println("Papan Permainan telah ditambahkan");
      }
      
      @Override
      public void removeArticle(){
          System.out.println("Papan Permainan telah dihapus");
      }
      
    public int getNrOfPlayers(){
        return nrOfPlayers;
    }
    
    public void setNrOfPlayers(int newNrOfPlayers){
        nrOfPlayers = newNrOfPlayers;
    }
    
    public int getAveragePlayTime(){
        return averagePlayTime;
    }
    
    public void setAveragePlayTime(int newAveragePlayTime){
        averagePlayTime = newAveragePlayTime;
    }
}
