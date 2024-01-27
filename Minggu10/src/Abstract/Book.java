/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author ASUS
 */
public class Book extends Article{
    private String writer;
    private String genre;
    
    @Override
    public void addArticle(){
        System.out.println("Buku telah ditambahkan");
    }
    
    @Override
    public void removeArticle(){
        System.out.println("Buku telah dihapus");
    }
    
    public String getWriter(){
        return writer;
    }
    
    public void setWriter(String newWriter){
        writer = newWriter;
    }
    
    public String getGenre(){
        return genre;
    }
    
    public void setGenre(String newGenre){
        genre = newGenre;
    }
}
