/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author ASUS
 */
public class Album extends Article{
    private String namaArtis;
    private int nrOfRecords;
    
    @Override
    public void addArticle(){
        System.out.println("Album telah ditambahkan");
    }
    
    @Override
    public void removeArticle(){
        System.out.println("Album telah dihapus");
    }
    
    public String getNamaArtis(){
        return namaArtis;
    }
    
    public void setNamaArtis(String newNamaArtis){
        namaArtis = newNamaArtis;
    }
    
    public int getNrOfRecords(){
        return nrOfRecords;
    }
    
    public void setNrOfRecords(int newNrOfRecords){
        nrOfRecords = newNrOfRecords;
    }
}
