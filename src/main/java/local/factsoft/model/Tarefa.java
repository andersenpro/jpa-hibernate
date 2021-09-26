package local.factsoft.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Column;
import java.io.Serializable;
import java.util.Calendar;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="tarefas")
public class Tarefa implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String descricao;
    private boolean finalizado;

    @Temporal(TemporalType.DATE)
    @Column(name="data_finalizado", nullable = true)
    private Calendar dataFinalizado;

}
