/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Monopoli mn = new Monopoli();
        mn.addArticle();
        mn.borrowBoardGame();
        mn.returnBoardGame();
        mn.removeArticle();
        System.out.println("\n");
        
        Chess cs = new Chess();
        cs.addArticle();
        cs.borrowBoardGame();
        cs.returnBoardGame();
        cs.removeArticle();
        System.out.println("\n");
        
        Book bk = new Book();
        bk.addArticle();
        bk.removeArticle();
        System.out.println("\n");
        
        Album ab = new Album();
        ab.addArticle();
        ab.removeArticle();
        
    }
}
