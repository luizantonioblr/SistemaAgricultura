package Negocio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embeddable;

@Embeddable
public class Periodo implements Serializable {

    private Date dataInicio;
    private Date dataFim;

    @Deprecated
    public Periodo() {
    }

    public Periodo(Date dataInicio, Date dataFim) {
        if (dataInicio.after(dataFim)) {
            throw new IllegalArgumentException("Data inicio não pode ser depois de Data fim");
        }

        if (dataFim.before(dataInicio)) {
            throw new IllegalArgumentException("Data fim não pode ser antes de Data inicio");
        }

        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }
}
