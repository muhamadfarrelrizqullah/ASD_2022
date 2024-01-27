/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author ASUS
 */
public abstract class Article {
    private String nama;
    private String penerbit;
    private int tahunRilis;
    
    public abstract void addArticle();
    public abstract void removeArticle();
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String newNama){
        nama = newNama;
    }
    
    public String getPenerbit(){
        return penerbit;
    }
    
    public void setPenerbit(String newPenerbit){
        penerbit = newPenerbit;
    }
    
    public int getTahunRilis(){
        return tahunRilis;
    }
    
    public void setTahunRilis(int newTahunRilis){
        tahunRilis = newTahunRilis;
    }
}
