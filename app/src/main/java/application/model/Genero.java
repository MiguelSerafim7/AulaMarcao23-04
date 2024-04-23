package application.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name= "generos")
public class Genero {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String mome;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getMome() {
        return mome;
    }
    public void setMome(String mome) {
        this.mome = mome;
    }


    
}
