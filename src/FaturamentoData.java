import java.util.List;
import com.google.gson.annotations.SerializedName;

public class FaturamentoData {
    @SerializedName("faturamento")
    private List<FaturamentoDia> faturamento;

    public List<FaturamentoDia> getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(List<FaturamentoDia> faturamento) {
        this.faturamento = faturamento;
    }

    public static class FaturamentoDia {
        private int dia;
        private double valor;

        public int getDia() {
            return dia;
        }

        public void setDia(int dia) {
            this.dia = dia;
        }

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }
    }
}
