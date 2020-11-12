/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan47.nilaimahasiswa;

/**
 *
 * @author User
 */
public class Nilai 
{
    private float nilaiQuiz, nilaiUTS, nilaiUAS;
    
    public float getNilaiQuiz()
    {
        return nilaiQuiz;
    }
    
    public void setNilaiQuiz(float nilaiQuiz)
    {
        this.nilaiQuiz = nilaiQuiz;
    }
    
    public float getNilaiUTS()
    {
        return nilaiUTS;
    }
    
    public void setNilaiUTS(float nilaiUTS)
    {
        this.nilaiUTS = nilaiUTS;
    }
    
    public float getNilaiUAS()
    {
        return nilaiUAS;
    }
    
    public void setNilaiUAS(float nilaiUAS)
    {
        this.nilaiUAS = nilaiUAS;
    }
    
    public float hitungNilaiAkhir()
    {
        return (float) ((0.2 * nilaiQuiz) + (0.3 * nilaiUTS) + (0.5 * nilaiUAS));
    }
    
    public String getIndex(float nilaiAkhir)
    {
        if(nilaiAkhir >= 80 && nilaiAkhir <= 100)
        {
            return "A";
        }
        else if(nilaiAkhir >= 68 && nilaiAkhir < 80)
        {
            return "B";
        }
        else if(nilaiAkhir >= 56 && nilaiAkhir < 68)
        {
            return "C";
        }
        else if(nilaiAkhir >= 45 && nilaiAkhir < 56)
        {
            return "D";
        }
        else if(nilaiAkhir >= 0 && nilaiAkhir < 45)
        {
            return "E";
        }
        else
        {
            return "Index Tidak Ditemukan";
        }
    }
    
    public String getKeterangan(String index)
    {
        if(index.equals("A"))
        {
            return "Sangat Baik";
        }
        else if(index.equals("B"))
        {
            return "Baik";
        }
        else if(index.equals("C"))
        {
            return "Cukup";
        }
        else if(index.equals("D"))
        {
            return "Kurang";
        }
        else if(index.equals("E"))
        {
            return "Sangat Kurang";
        }
        else
        {
            return "Keterangan Tidak Ditemukan";
        }
    }
}
