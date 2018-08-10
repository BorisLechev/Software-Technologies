package lognoziroh.entity;

import org.springframework.web.bind.annotation.GetMapping;
import sun.awt.SunHints;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.soap.Text;

@Entity
@Table(name = "reports")
public class Report {

    private Integer id;

    private Text status;

    private Text messsage;

    private Text origin;

    public Report() {
    }

    public Report(Text status, Text messsage, Text origin) {
        this.status = status;
        this.messsage = messsage;
        this.origin = origin;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column
    @NotNull
    public Text getStatus() {
        return status;
    }

    public void setStatus(Text status) {
        this.status = status;
    }

    public Text getMesssage() {
        return messsage;
    }

    public void setMesssage(Text messsage) {
        this.messsage = messsage;
    }

    @Column
    @NotNull
    public Text getOrigin() {
        return origin;
    }

    public void setOrigin(Text origin) {
        this.origin = origin;
    }
}
