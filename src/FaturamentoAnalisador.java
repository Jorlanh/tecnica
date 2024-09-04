import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class FaturamentoAnalisador {
    public static void main(String[] args) {
        String caminhoArquivo = "data/faturamento.json";

        Gson gson = new Gson();

        try {
            FileReader reader = new FileReader(caminhoArquivo);
            Type tipo = new TypeToken<FaturamentoData>() {}.getType();
            FaturamentoData dadosFaturamento = gson.fromJson(reader, tipo);
            reader.close();

            List<FaturamentoData.FaturamentoDia> faturamento = dadosFaturamento.getFaturamento();
            for (FaturamentoData.FaturamentoDia dia : faturamento) {
                System.out.println("Dia: " + dia.getDia() + ", Valor: " + dia.getValor());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
